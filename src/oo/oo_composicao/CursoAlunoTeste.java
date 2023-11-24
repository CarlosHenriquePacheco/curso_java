package oo.oo_composicao;

public class CursoAlunoTeste {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("João Henrique");
        Aluno aluno2 = new Aluno("Thiago");
        Aluno aluno3 = new Aluno("Thais");

        Curso curso1 = new Curso("Java Completo");
        Curso curso2 = new Curso("Spring Boot");
        Curso curso3 = new Curso("React");

        curso1.adicionarAluno(aluno1);
        curso1.adicionarAluno(aluno2);

        curso2.adicionarAluno(aluno1);
        curso2.adicionarAluno(aluno3);

        aluno1.adicionarCurso(curso3);
        aluno2.adicionarCurso(curso3);
        aluno3.adicionarCurso(curso3);

        for (Aluno aluno : curso1.alunos) {
            System.out.println(aluno.getNome()+" esta matriculado no curso "+curso1.getNome());
        }
        System.out.println(aluno1.obterCursoporNome("Java Completo"));
        System.out.println(aluno1.obterCursoporNome("Curso nao existente"));
    }    

}

