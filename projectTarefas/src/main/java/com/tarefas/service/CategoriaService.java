package com.tarefas.service;

import com.tarefas.Repository.CategoriaRepository;
import com.tarefas.model.Categoria;
import javax.transaction.Transactional;
import org.springframework.stereotype.Service;
import java.util.List;

@Service //Responsável pelas regras de negocios a serem colocadas
public class CategoriaService {
    
    final CategoriaRepository categoriaRepository; //Ficará com 1 erro, saira após fzr o construtor

    //Construtor para resolver o Erro
    public CategoriaService(CategoriaRepository categoriaRepository) {
        this.categoriaRepository = categoriaRepository;
    }
    
    //N foi usado create, update, delete pois esta sendo utilizado o metodo do Repository //
    
    // METODO SALVAR
    @Transactional // Melhora a segurança do sistema: Controle de transação
    public Categoria save(Categoria categoria){
        return categoriaRepository.save(categoria); //Repository é o responsável por fzr todo o resto
    }
    
    //METODO LISTAR
    public List<Categoria> findAll(){
        return categoriaRepository.findAll();
    }
}
