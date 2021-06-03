package usuarios;

import java.time.LocalDate;


public class Vacinados {
    private int _id;
    private String nome;
    private int idade;
    private boolean trabalho_saude;
    private String endereco;
    private LocalDate data_vacinacao;

    public int getId() {
        return _id;
    }

    public void setId(int _id) {
        this._id = _id;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public boolean isTrabalho_saude() {
        return trabalho_saude;
    }

    public void setTrabalho_saude(boolean trabalho_saude) {
        this.trabalho_saude = trabalho_saude;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public LocalDate getData_vacinacao() {
        return data_vacinacao;
    }

    public void setData_vacinacao(LocalDate data_vacinacao) {
        this.data_vacinacao = data_vacinacao;
    }

    
    
    
}
