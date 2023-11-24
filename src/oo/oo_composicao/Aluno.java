package oo.oo_composicao;

import java.util.ArrayList;
import java.util.List;

public class Aluno {
    private final String nome;
    final List<Curso> cursos = new ArrayList<>();
    //Getter de nome
    public String getNome() {
        return nome;
    }

    //Construtor
    Aluno (String pnome){
        this.nome = pnome;
    }
    

    public void adicionarCurso(Curso pCurso){
        this.cursos.add(pCurso);
        pCurso.alunos.add(this);
    }

    public String toString(){
        return nome;
    }

    public String obterCursoporNome(String pNome){
        Curso procurado = null;
        for (Curso curso : cursos) {
            if (curso.getNome().equalsIgnoreCase(pNome)) {
                procurado = curso;
            }
        }
        if (procurado !=null) {
            return procurado.getNome();
        }else{
            return null;
        }
    }

}
