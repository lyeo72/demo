package com.example.demo.springboot.web;

import com.example.demo.springboot.web.HelloController;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@ExtendWith(SpringExtension.class) //Junit4 에서는 RunWith(SpringRunner.class)
@WebMvcTest(controllers = HelloController.class) // 선언할 경우 @Service, @Component, @Repository 사용 불가
public class HelloControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void hello가_리턴된다() throws Exception{
        String hello = "hello";

        mockMvc.perform(get("/hello"))
                .andExpect(status().isOk())
                .andExpect(content().string(hello));
    }

}
