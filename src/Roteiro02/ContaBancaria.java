package Roteiro02;

public class ContaBancaria {
    String titular;
    double saldo;
    double valorDeDeposito;

    // NoArgsconstructor- construtor vazio (Boa prática)

    public ContaBancaria() {
    }

    // AllArgsConstructor
    public ContaBancaria(String titular, double saldo, double valorDeDeposito) {
        this.titular = titular;
        this.saldo = saldo;
        this.valorDeDeposito = valorDeDeposito;
    }

    public void depositar(){
        saldo +=valorDeDeposito;

    }
    public void exibirSaldo(){
        System.out.println("seu saldo é: "+" R$"+saldo);

    }
}
