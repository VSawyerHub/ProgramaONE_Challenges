package com.example.demo.domain.topic;

import jakarta.validation.constraints.NotBlank;

public record RegisterTopicRequest(
@NotBlank(message = "titulo obrigatório")
String titulo,
@NotBlank(message = "mensagem obrigatória")
String mensagem,
@NotBlank(message = "autor obrigatório")
String autor,
@NotBlank(message = "curso obrigatório")
String curso) {

}
