package com.tarefas.model;

import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "TB_CATEGORIA")
public class Categoria implements java.io.Serializable{
    
    @Id
    @Column(name = "ID_CATEGORIA")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    @Column(name = "NOME_CATEGORIA", nullable = false, length = 100)
    private String nome;
    
    
    //SEM PARAMETRO
    public Categoria() {
        this.setId(0);
        this.setNome("");
    }
    
    //COM PARAMETRO
    public Categoria(int id, String nome) {
        this.setId(id);
        this.setNome(nome);
    }
    
    //SET
    public void setId(int id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome.trim().isEmpty()?"VAZIO":nome.toUpperCase();
    }
    
    
    //GET
    public int getId() {
        return  this.id;
    }

    public String getNome() {
        return  this.nome;
    }
    
    //
    @Override
    public int hashCode() {
        int hash = 3;
        hash = 53 * hash + this.id;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Categoria other = (Categoria) obj;
        return this.id == other.id;
    }
    
}
