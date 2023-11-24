package Programa;

public class Conta {

    private static int contadorDeContas = 1;

    private int numeroConta;
    private Pessoa pessoa;
    private Double saldo = 0.0;

    public Conta (int numeroConta, Pessoa pessoa, Double saldo) {
        this.numeroConta = numeroConta;
        this.pessoa = pessoa;
        this.saldo = saldo;
        contadorDeContas += 1;
    }

}
