package oo_composicao;

import java.util.ArrayList;
import java.util.List;

public class Curso {
    private final String nome;
    final List<Aluno> alunos = new ArrayList<>();
    //Getter de nome
    public String getNome() {
        return nome;
    }

    //Construtor
    Curso(String pnome){
        this.nome = pnome;
    }
    

    public void adicionarAluno(Aluno aluno){
        this.alunos.add(aluno);
        aluno.cursos.add(this);
    }
}
