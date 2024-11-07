package com.example.demo.domain.topic;

import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

@RestController
@RequestMapping("/topicos")
public class TopicControl {
    
    @Autowired
    private TopicService service;

    @PostMapping
    @Transactional
    public ResponseEntity cadastrar(@RequestBody @Valid RegisterTopicRequest request, UriComponentsBuilder uriComponentsBuilder) {
        var topico = service.cadastrarTopico(new Topic(request));

        var uri = uriComponentsBuilder.path("/topicos/{id}").buildAndExpand(topico.getId()).toUri();

        return ResponseEntity.created(uri).body(new Details(topico));
    }

    @GetMapping
    public ResponseEntity<Page<Details>> listar(@PageableDefault(sort = {"dateCreation"}) Pageable paginacao){
        var page = service.listarTopicos(paginacao).map(Details::new);

        return ResponseEntity.ok(page);
    }

    @GetMapping("/{id}")
    public ResponseEntity detalhar(@PathVariable Long id) {
        var topic = service.detalharTopico(id);

        return ResponseEntity.ok(new Details(topic));
    }

    @PutMapping
    @Transactional
    public ResponseEntity atualizar(@RequestBody @Valid TopicRequestUpdate request) {
        var topic = service.updateTopic(new Topic(request));

        return ResponseEntity.ok(new Details(topic));
    }

    @DeleteMapping("/{id}")
    @Transactional
    public ResponseEntity excluir(@PathVariable Long id) {
        service.excluirTopico(id);

        return ResponseEntity.noContent().build();
    }

}
