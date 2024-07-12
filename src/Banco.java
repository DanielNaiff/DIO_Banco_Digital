import java.util.List;

public class Banco {

    private String nome;
    private List<Cliente> conta;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Cliente> getConta() {
        return conta;
    }

    public void setConta(List<Cliente> conta) {
        this.conta = conta;
    }
}
