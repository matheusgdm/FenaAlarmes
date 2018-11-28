package model;

public class Produtos {

    private int id;
    private String nomeProduto;
    private double precoProduto;
    private int quantidadeEstoqueProduto;

    public Produtos() {
    }

    public Produtos(int id, String nomeProduto, double precoProduto, int quantidadeEstoqueProduto) {
        this.id = id;
        this.nomeProduto = nomeProduto;
        this.precoProduto = precoProduto;
        this.quantidadeEstoqueProduto = quantidadeEstoqueProduto;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public double getPrecoProduto() {
        return precoProduto;
    }

    public void setPrecoProduto(double precoProduto) {
        this.precoProduto = precoProduto;
    }

    public int getQuantidadeEstoqueProduto() {
        return quantidadeEstoqueProduto;
    }

    public void setQuantidadeEstoqueProduto(int quantidadeEstoqueProduto) {
        this.quantidadeEstoqueProduto = quantidadeEstoqueProduto;
    }

    @Override
    public String toString() {
        return "Produtos{" + "id=" + id + ", nomeProduto=" + nomeProduto + ", precoProduto=" + precoProduto + ", quantidadeEstoqueProduto=" + quantidadeEstoqueProduto + '}';
    }

}
