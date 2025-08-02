package Roteiro05;

public class Moto extends Veiculo {
    public Moto() {
    }

    public Moto(String marca, String modelo, int numeroDeRodas) {
        super(marca, modelo, numeroDeRodas);
    }

    void empinarMoto(){
        System.out.println(modelo+" esta sendo empinada");
    }
}
