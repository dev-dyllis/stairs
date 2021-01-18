package dev.dyllis.stairs.dto;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class Article {
    private long id;
    private String title;
    private String contents;
    private String writeUserName;
    private long hits;
    private LocalDateTime createdAt;
}
