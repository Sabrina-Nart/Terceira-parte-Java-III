package com.tarefas.DTO;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class CategoriaDTO {
    
    //id não é utilizado pois não é inserido pelo usuário e sim gerado pelo sistema.
    
    @NotBlank //n pode vir vazio
    @Size(max = 100) //tamanho
    private String nome;
    
    //SET
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    //GET
    public String getNome() {
        return this.nome;
    }    
}
