package me.dio;

public abstract class FuncionarioCLT {

    protected String nome;
    protected String documento;

    protected Endereco Endereco;

    protected Double valorSalario;

    public FuncionarioCLT(String nome, String documento, me.dio.Endereco endereco, Double valorSalario) {
        this.nome = nome;
        this.documento = documento;
        Endereco = endereco;
        this.valorSalario = valorSalario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public me.dio.Endereco getEndereco() {
        return Endereco;
    }

    public void setEndereco(me.dio.Endereco endereco) {
        Endereco = endereco;
    }

    public Double getValorSalario() {
        return valorSalario;
    }

    public void setValorSalario(Double valorSalario) {
        this.valorSalario = valorSalario;
    }

    @Override
    public String toString() {
        return "FuncionarioCLT{" +
                "nome='" + nome + '\'' +
                ", documento='" + documento + '\'' +
                ", Endereco=" + Endereco +
                ", valorSalario=" + valorSalario +
                '}';
    }
}