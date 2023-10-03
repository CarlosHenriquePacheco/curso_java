package classe;

public class Usuario {
    private String nome;
    private String email;

    // Getters and Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Usuario) {
            Usuario vOutro = (Usuario) obj;
            if ((this.getNome().equals(vOutro.nome)) && (this.getEmail().equals(vOutro.email))) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }
}
