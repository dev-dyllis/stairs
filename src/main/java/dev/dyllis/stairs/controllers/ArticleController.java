package dev.dyllis.stairs.controllers;

import dev.dyllis.stairs.dto.Article;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

@RestController
@RequestMapping(value = "/article")
public class ArticleController {
    @GetMapping("/")
    public Flux<Article> getArticles() {
        return null;
    }
}
