package Roteiro05;

public class Veiculo {

    // atributos do nosso veiculo
    String marca;
    String modelo;
    int numeroDeRodas;
    // conatrutores
    public Veiculo() {
    }

    public Veiculo(String marca, String modelo, int numeroDeRodas) {
        this.marca = marca;
        this.modelo = modelo;
        this.numeroDeRodas = numeroDeRodas;
    }

    // metodos
    void exibirInformacoes(){
        System.out.println("marca: "+marca+" modelo: "+modelo);

    }




}
