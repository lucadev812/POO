package Roteiro01;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        // hello word
        System.out.println("hello word");


        // criando objeto Rubens
        Pessoa rubens = new Pessoa();
        rubens.nome = "pedro manuel";
        rubens.idade = 18;
        rubens.apresentar();

        // criar objeto pedro
        Pessoa pedro = new Pessoa();
        pedro.nome = "pedro manuel";
        pedro.idade = 17;


    }
}