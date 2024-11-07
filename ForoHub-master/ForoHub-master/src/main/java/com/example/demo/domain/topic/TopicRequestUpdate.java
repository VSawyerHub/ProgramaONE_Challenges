package com.example.demo.domain.topic;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record TopicRequestUpdate(        
@NotNull
Long id,
@NotBlank(message = "titulo obrigatório")
String titulo,
@NotBlank(message = "mensagem obrigatória")
String mensagem,
@NotBlank(message = "autor obrigatório")
String autor,
@NotBlank(message = "curso obrigatório")
String curso
)  {
    
}
