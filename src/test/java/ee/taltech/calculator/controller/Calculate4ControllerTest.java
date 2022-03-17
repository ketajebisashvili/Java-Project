package ee.taltech.calculator.controller;


import org.assertj.core.util.Lists;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;

@AutoConfigureMockMvc
@SpringBootTest
class Calculate4ControllerTest {

    @Autowired
    private MockMvc mvc;

    @Test
    @DisplayName("wrong path returns 404 status bad request or default object when correct")
    void requestTest() throws Exception{
        mvc.perform(get("/calculator/calculate4"))
                .andExpect(status().is4xxClientError());

        mvc.perform(get("/calculator/calculate4?numbers="))
                .andExpect(status().is2xxSuccessful())
                .andExpect(content().string("{}"));
    }

    @Test
    @DisplayName("request with list of values, returns the correct results")
    void calcTest() throws Exception{
        mvc.perform(get("/calculator/calculate4?numbers=1,-4,-8,8,9,0"))
                .andExpect(status().is2xxSuccessful())
                .andExpect(jsonPath("$.odds").value(Lists.newArrayList(1,9)))
                .andExpect(jsonPath("$.maxOdd").value(9))
                .andExpect(jsonPath("$.averageOfNegatives").value(-6)); ;

    }






}