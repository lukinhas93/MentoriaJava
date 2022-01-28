package me.dio;

public class OperadorDeCaixa extends FuncionarioCLT{

    public OperadorDeCaixa(String nome, String documento, me.dio.Endereco endereco, Double valorSalario) {
        super(nome, documento, endereco, valorSalario);
    }

    @Override
    public String toString() {
        return "OperadorDeCaixa{" +
                "nome='" + nome + '\'' +
                ", documento='" + documento + '\'' +
                ", Endereco=" + Endereco.getRua() +
                ", valorSalario=" + valorSalario +
                '}';
    }
}
