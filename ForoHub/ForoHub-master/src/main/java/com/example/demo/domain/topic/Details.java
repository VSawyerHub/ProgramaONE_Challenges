package com.example.demo.domain.topic;

import java.time.LocalDateTime;

public record Details(Long id,
        String title,
        String message,
        LocalDateTime dateCreation,
        Short status,
        String autor,
        String course) {

            public Details(Topic topic) {
                this(topic.getId(),
                     topic.getTitle(),
                     topic.getMessage(),
                     topic.getDateCreation(),
                     topic.getStatus(),
                     topic.getAutor(),
                     topic.getCourse()
                );
            }
}
