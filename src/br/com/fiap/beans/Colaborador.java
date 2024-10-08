package br.com.fiap.beans;

public class Colaborador {
    private String nome;
    private String cargo;
    private double valorHora;
    private double quantidadeHoras;
    private Endereco endereco;

    // metodo construtor vazio
    public Colaborador(String nome, String cargo, double valorHora, double quantidadeDeHoras){
        super();
    }


    //metodo construtor cheio (sem atributo de referencia)
    public Colaborador(String nome, String cargo, double valorHora, Endereco endereco, double quantidadeHoras) {
        super();
        this.nome = nome;
        this.cargo = cargo;
        this.valorHora = valorHora;
        this.endereco = endereco;
        this.quantidadeHoras = quantidadeHoras;
    }

    public String getNome() {
        return nome;
    }

    public String getCargo() {
        return cargo;
    }

    public double getValorHora() {
        return valorHora;
    }

    public double getQuantidadeHoras() {
        return quantidadeHoras;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public void setQuantidadeHoras(double quantidadeHoras) {
        this.quantidadeHoras = quantidadeHoras;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    @Override
    public String toString() {
        return "Colaborador{" +
                "nome='" + nome + '\'' +
                ", cargo='" + cargo + '\'' +
                ", valorHora=" + valorHora +
                ", quantidadeHoras=" + quantidadeHoras +
                ", endereco=" + endereco +
                '}';
    }


}
