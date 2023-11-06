package com.tarefas.controller;

import com.tarefas.model.Tarefa;
import com.tarefas.service.TarefaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class TarefaController {
    
    @Autowired
    TarefaService tarefaService;
    
    @PostMapping
    public ResponseEntity<Object> saveTarefa(@RequestBody Tarefa tarefa){
        return ResponseEntity.status(HttpStatus.OK).body(tarefaService.save(tarefa));
    }
    
    @GetMapping
    public ResponseEntity<List<Tarefa>> getAll(){
        return ResponseEntity.status(HttpStatus.OK).body(tarefaService.findAll());
    }
}
