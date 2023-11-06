package com.tarefas.service;

import com.tarefas.Repository.TarefaRepository;
import com.tarefas.model.Tarefa;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TarefaService {
    
    @Autowired
    TarefaRepository tarefaRepository;
    
    //METODO SALVAR
    
    @Transactional
    public Tarefa save(Tarefa tarefa){
        return tarefaRepository.save(tarefa);
    }
    
    //METODO LISTAR
    public List<Tarefa> findAll(){
        return tarefaRepository.findAll();
    }
}
