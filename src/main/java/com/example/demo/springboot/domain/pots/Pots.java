package com.example.demo.springboot.domain.pots;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Getter
@NoArgsConstructor
@Entity
public class Pots {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // 해당 옵션을 추가해야지만 auto increment 가 된다.
    private Long id;

    @Column(length = 500, nullable = false)
    private String title;

    @Column(columnDefinition = "TEXT", nullable = false)
    private String content;

    private String author;

    @Builder
    public Pots(String title, String content, String author) {
        this.title = title;
        this.content = content;
        this.author = author;
    }
}
