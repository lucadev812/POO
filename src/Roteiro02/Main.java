package Roteiro02;

public class Main {
    public static void main(String[] args) {
        // iniciando uma nova conta como um objeto
        ContaBancaria contaBancaria = new ContaBancaria("Rubens luca",1000,2000);

        // depositando o valor 2000
        contaBancaria.depositar();

        System.out.println("------------------------------------------");

        //exibindo o saldo
        contaBancaria.exibirSaldo();




    }
}
