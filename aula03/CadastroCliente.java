package produtosAula05;

public class CadastroCliente {

    
    private String id;
    private String senha;

    public CadastroCliente(String id, String senha) {
        this.id = id;
        this.senha = senha;
    }

    // Getters
    public String getId() {
        return id;
    }

    public String getSenha() {
        return senha;
    }
}