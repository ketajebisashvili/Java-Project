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
class Calculate2ControllerTest {

    @Autowired
    private MockMvc mvc;

    @Test
    @DisplayName("wrong path returns 404 status bad request or default object when correct")
    void requestTest() throws Exception {

        mvc.perform(get("/calculator/calculate2"))
                .andExpect(status().is4xxClientError());

        mvc.perform(get("/calculator/calculate2?numbers="))
                .andExpect(status().is2xxSuccessful())
                .andExpect(content().string("{}"));
    }

    @Test
    @DisplayName("request with list of values, returns the correct results")
    void calcTest() throws Exception {

        mvc.perform(get("/calculator/calculate2?numbers=-8,-4,-2,0,2,3,3,5,8,9"))
                .andExpect(status().is2xxSuccessful())
                .andExpect(jsonPath("$.signReversed").value(Lists.newArrayList(8,4,2,0,-3,-3,-5,-8,-9)))
                .andExpect(jsonPath("$.negatives").value(Lists.newArrayList(-8,-4,-2)))
                .andExpect(jsonPath("$.averageOfOdd").value(5));
    }
}