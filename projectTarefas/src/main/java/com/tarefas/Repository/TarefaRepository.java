package com.tarefas.Repository;

import com.tarefas.model.Tarefa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TarefaRepository extends JpaRepository<Tarefa, Integer>{ //1º Obj manipulado > 2º chave estrangeira

}
