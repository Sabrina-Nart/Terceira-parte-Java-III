package com.tarefas.model;

import java.time.LocalDate;
import javax.annotation.Generated;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import org.hibernate.annotations.ManyToAny;

@Entity
@Table(name = "TB_TAREFA")
public class Tarefa {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_TAREFA", nullable = false)
    private int id;
    
    @Column(name = "DATA_TAREFA", nullable = false)
    private LocalDate data;
    
    @Column(name = "DESCRICAO_TAREFA", nullable = false, length = 150)
    private String descricao;
    
    @ManyToOne(cascade = CascadeType.DETACH, fetch = FetchType.EAGER)
    @JoinColumn(name = "ID_CATEGORIA", nullable = false, referencedColumnName = "ID_CATEGORIA")
    private Categoria categoria;
    
    @Column(name = "URGENTE", nullable = false)
    private boolean urgente;

    
    //SEM parametro
    public Tarefa() {
    }
    
    //COM parametro
    public Tarefa(int id, LocalDate data, String descricao, Categoria categoria, boolean urgente) {
        this.setId(id);
        this.setData(data);
        this.setDescricao(descricao);
        this.setCategoria(categoria);
        this.setUrgente(urgente);
    }
    
    
    //SET
    public void setId(int id) {
        this.id = id;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public void setUrgente(boolean urgente) {
        this.urgente = urgente;
    }
    
    
    //GET
    public int getId() {
        return id;
    }

    public LocalDate getData() {
        return data;
    }

    public String getDescricao() {
        return descricao;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public boolean isUrgente() {
        return urgente;
    }

    //ToString
    @Override
    public String toString() {
        return "Tarefa{" + "data=" + data + ", descricao=" + descricao + '}';
    }
    
    
    //
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + this.id;
        return hash;
    }

    //
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
        final Tarefa other = (Tarefa) obj;
        return this.id == other.id;
    } 
}
