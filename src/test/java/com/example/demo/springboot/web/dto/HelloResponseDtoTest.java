package com.example.demo.springboot.web.dto;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class HelloResponseDtoTest {

    @Test
    public void 롬복_기능_테스트() {
        //given
        String name = "test";
        int amount = 1000;

        //when
        HelloResponseDto dto = new HelloResponseDto(name, amount); // Dto의 RequireArgsConstructor 생성자 자동생성 되는 것 테스트

        //then
        assertThat(dto.getName()).isEqualTo(name); // @Getter 테스트
        assertThat(dto.getAmount()).isEqualTo(amount);




    }
}
