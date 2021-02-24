/*package com.microservice.demo

import org.junit.Test
import org.junit.runner.RunWith
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post
import org.springframework.test.web.servlet.result.MockMvcResultMatchers.status
import org.springframework.test.web.servlet.result.MockMvcResultHandlers.print
import org.springframework.test.context.junit4.SpringRunner
import org.springframework.test.web.servlet.MockMvc
@RunWith(SpringRunner::class)
@SpringBootTest
@AutoConfigureMockMvc
class CustomerControllerTest {
    @Autowired
    lateinit var mockMvc: MockMvc
    @Test
    fun `mock mvc should be configured`() {
    }
    @Test
    fun `moc mvc should create ticket`(){
        mockMvc.perform(post("/tickte/105"))
                .andExpect(status().isOk)
                .andDo(print())
    }
}*/