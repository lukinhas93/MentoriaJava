package me.dio;

public class Main {
    public static void main(String[] args) {


   Endereco endereco = new Endereco("rua1","complemento rua 1", "bairro 1");
   Vendedor vendedor = new Vendedor("Vendedor","999-999-999-99",1000d);
   vendedor.calcularBonificacao(0.1d);

   OperadorDeCaixa operadorDeCaixa = new OperadorDeCaixa("Operador de Caixa", "999-999-999-99",endereco,1000d);

        System.out.println(vendedor);
        System.out.println(operadorDeCaixa);

        Gerente gerente = new Gerente();
        gerente.setNome("Gerente");
        gerente.setDocumento("111-111-111-11");
        gerente.setHorasTrabalhadas(50d);
        gerente.setValorHora(20d);


        System.out.println(gerente);
    }

 }
