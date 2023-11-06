package com.tarefas.Repository;

import com.tarefas.model.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository //Identifica ao Spring
public interface CategoriaRepository extends JpaRepository<Categoria, Integer>{
    
}
