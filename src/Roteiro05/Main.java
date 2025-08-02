package Roteiro05;

public class Main {
    public static void main(String[] args) {

        // criando um objeto carro

        Carro corolla = new Carro("toyota","corolla",4,80);

        corolla.exibirInformacoes();
        corolla.arCondicionadoLigado();

        System.out.println("---------------------------");

        // criando objeto moto

        Moto hornet = new Moto("honda","hornet",2);
        hornet.exibirInformacoes();
        hornet.empinarMoto();



    }
}
