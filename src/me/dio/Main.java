package me.dio;

import me.dio.modelo.Vendedor;
import me.dio.modelo.Endereco;
import me.dio.modelo.Gerente;
import me.dio.modelo.OperadorDeCaixa;

public class Main {
    public static void main(String[] args) {


   Endereco endereco = new Endereco("rua1","complemento","bairro");
   Vendedor vendedor = new Vendedor("Vendedor","999-999-999-99",endereco,1000d);
   vendedor.calcularBonificacao(0.1d);

   OperadorDeCaixa operadorDeCaixa = new OperadorDeCaixa("Operador de Caixa", "999-999-999-99",endereco,1000d);

        System.out.println(vendedor);
        System.out.println(operadorDeCaixa);

        Gerente gerente = new Gerente();
        gerente.setNome("Gerente");
        gerente.setDocumento("111-111-111-11");
        gerente.setHorasTrabalhadas(50);
        gerente.setValorHora(20d);
        gerente.setEndereco(endereco);

        gerente.calcularRemuneracao();
        gerente.calcularBonificacao(0.2);


        System.out.println(gerente);
    }

 }
