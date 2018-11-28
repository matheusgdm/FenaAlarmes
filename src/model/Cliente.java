package model;

public class Cliente {

    private int idcadastroCliente;
    private String senha;
    private String nome;
    private String sobrenome;
    private String email;
    private int telefone1;
    private int telefone2;
    private String nascionalidade;

    public Cliente() {
    }

    public Cliente(int id, String nome, String sobrenome, String email, int telefone1, int telefone2, String nascionalidade) {
        this.idcadastroCliente = id;
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.email = email;
        this.telefone1 = telefone1;
        this.telefone2 = telefone2;
        this.nascionalidade = nascionalidade;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    
    public int getIdcadastroCliente() {
        return idcadastroCliente;
    }

    public void setIdcadastroCliente(int id) {
        this.idcadastroCliente = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getTelefone1() {
        return telefone1;
    }

    public void setTelefone1(int telefone1) {
        this.telefone1 = telefone1;
    }

    public int getTelefone2() {
        return telefone2;
    }

    public void setTelefone2(int telefone2) {
        this.telefone2 = telefone2;
    }

    public String getNascionalidade() {
        return nascionalidade;
    }

    public void setNascionalidade(String nascionalidade) {
        this.nascionalidade = nascionalidade;
    }

    @Override
    public String toString() {
        return "Cliente{" + "idcadastroCliente=" + idcadastroCliente + ", nome=" + nome + ", sobrenome=" + sobrenome + ", email=" + email + ", telefone1=" + telefone1 + ", telefone2=" + telefone2 + ", nascionalidade=" + nascionalidade + '}';
    }

}
