package com.sistema.implant.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sistema.implant.models.Aluno;
import com.sistema.implant.repositories.AlunoRepository;

@Service 
public class AlunoService {
   
    @Autowired
    private AlunoRepository AlunoRepository;

    public Long contarAlunos() {
        return AlunoRepository.count();
    }

    public Aluno buscarAluno(Integer id){
        return AlunoRepository.findById(id).get();
    }

    public List<Aluno> listarAlunos(){
        return AlunoRepository.findAll();
    }

    public Boolean deletarAluno(Integer id) {
        if(AlunoRepository.existsById(id)) {
            return true;
        }
        return false;
    }

    public Aluno cadastrarAluno(Aluno aluno) {
    
        throw new UnsupportedOperationException("Unimplemented method 'cadastrarAluno'");
    }
    
}
