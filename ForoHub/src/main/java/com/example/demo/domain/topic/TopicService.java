package com.example.demo.domain.topic;

import org.hibernate.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.crossstore.ChangeSetPersister;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class TopicService {
    
    private Short ATIVO = (short) 1;

    @Autowired
    private TopicRepository repository;

    public Topic cadastrarTopico(Topic topico) {
        return repository.save(topico);
    }

    public Page<Topic> listarTopicos(Pageable pageable) {
        return repository.findAllByStatus(ATIVO, pageable);
    }

    public Topic detalharTopico(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ObjectNotFoundException(id, "Topico com o ID fornecido não foi encontrado"));
    }

    public Topic updateTopic(Topic topicoAtt) {
        var topico = repository.findById(topicoAtt.getId())
                .orElseThrow(() -> new ObjectNotFoundException(topicoAtt.getId(), "Topico com o ID fornecido não foi encontrado"));
        topico.updateTopic(topicoAtt);
        return topico;
    }

    public void excluirTopico(Long id) {
        var topico = repository.findById(id)
                .orElseThrow(() -> new ObjectNotFoundException(id, "Topico com o ID fornecido não foi encontrado"));
        topico.excluir();
    }

}
