package com.example.demo.domain.topic;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Table(name = "topicos")
@Entity(name = "Topico")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Topic {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String message;
    private LocalDateTime dateCreation;
    private Short status;
    private String autor;
    private String course;

    public Topic(RegisterTopicRequest request) {
        this.title = request.titulo();
        this.message = request.message();
        this.dateCreation = LocalDateTime.now();
        this.status = 1;
        this.autor = request.autor();
        this.course = request.curso();
    }

    public Topic(TopicRequestUpdate request) {
        this.id = request.id();
        this.title = request.titulo();
        this.message = request.message();
        this.autor = request.autor();
        this.course = request.curso();
    }

    public Topic updateTopic(Topic topic) {
        this.title = topic.getTitle();
        this.message = topic.getMessage();
        this.autor = topic.getAutor();
        this.course = topic.getCourse();

        return topic;
    }

    public void excluir() {
        this.status = (short) 0;
    }

}
