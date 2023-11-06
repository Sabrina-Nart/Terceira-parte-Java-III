package com.tarefas.controller;

import ch.qos.logback.core.joran.util.beans.BeanUtil;
import com.tarefas.DTO.CategoriaDTO;
import com.tarefas.model.Categoria;
import com.tarefas.service.CategoriaService;
import java.util.List;
import javax.validation.Valid;
import org.springframework.beans.BeanUtils;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/categoria") //Nome. Como achar isto: localhost8080/categoria

public class CategoriaController {
   final CategoriaService categoriaService; //Vai dar erro e se resolve pelo construtor

   //Construtor para resolver o Erro
    public CategoriaController(CategoriaService categoriaService) {
        this.categoriaService = categoriaService;
    }
   
    //METODO SALVAR
    @PostMapping
    public ResponseEntity<Object> saveCategoria(@RequestBody @Valid CategoriaDTO categoriaDTO){ //Quando rodar o Post ele irá chamar este método
        Categoria categoria = new Categoria();
         BeanUtils.copyProperties(categoriaDTO, categoria); //Copia as propriedades de 1 para o outro, não precisa do SET e o GET
         return (ResponseEntity.status(HttpStatus.OK).body(categoriaService.save(categoria)));
    }
    
    //TUDO que chega e TUDO que sai é em Json
    
    //METODO LISTAR CATEGORIA
    @GetMapping
    public ResponseEntity<List<Categoria>> getAllCategorias(){
        return ResponseEntity.status(HttpStatus.OK).body(categoriaService.findAll());
    }
    
    //N tem Select, JPQL = É só utilziado os recursos disponíveis :)
   // Cria as tabelas assim que subir o servidor
}
  