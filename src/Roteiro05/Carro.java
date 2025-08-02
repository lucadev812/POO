package Roteiro05;

public class Carro extends Veiculo{

    double tamanhoDoPortaMalas;


    public Carro(double tamanhoDoPortaMalas) {
        this.tamanhoDoPortaMalas = tamanhoDoPortaMalas;
    }

    public Carro(String marca, String modelo, int numeroDeRodas, double tamanhoDoPortaMalas) {
        super(marca, modelo, numeroDeRodas);
        this.tamanhoDoPortaMalas = tamanhoDoPortaMalas;
    }

    void exibirInformacoes(){
        System.out.println("marca: "+ marca);
        System.out.println("modelo: "+ modelo);
        System.out.println("numero de rodas: "+ numeroDeRodas);
        System.out.println("tamanho do porta malas: "+ tamanhoDoPortaMalas);
    }

    void arCondicionadoLigado(){
        System.out.println("ar condicionado liagado");
    }
}
