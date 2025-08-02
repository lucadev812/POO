package Roteiro03;

public class Animal {
    String nome;

    // construtor vazio


    public Animal() {
    }

    //construtor com todos os argumentos


    public Animal(String nome) {
        this.nome = nome;
    }

    // metodo para emitir som

    void somEmitido(){
        System.out.println(" som do animal");

    }

}
