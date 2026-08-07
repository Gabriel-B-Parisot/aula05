package com.mycompany.aula05;

public class Conta {
private int agencia;
private int numero;
private double saldo;
private double credito;
private double debitar;
private double transferir;

Conta(){}

Conta(int agencia, int numero, int saldo){
}

Conta(int agencia, int numero){
}
     Conta(int agencia, int numero, double saldo, double credito, double debitar, double transferir) {
        this.agencia = agencia;
        this.numero = numero;
        this.saldo = saldo;
        this.credito = credito;
        this.debitar = debitar;
        this.transferir = transferir;
    }

    public double getTransferir() {
        return transferir;
    }

    public void setTransferir(double transferir) {
        this.transferir = transferir;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }


    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getCredito() {
        return credito;
    }

    public void setCredito(double credito) {
        this.credito = credito;
    }

    public double getDebitar() {
        return debitar;
    }

    public void setDebitar(double debitar) {
        this.debitar = debitar;
    }
    
    void Creditar(double valor){
    saldo = saldo + valor;
    }
    
    void debitar(double valor){
        if(valor <= saldo){                         
        saldo = saldo - valor;
         }else{
            System.out.println("saldo insuficiente");
        }
    }
    
    void transferir(double valor, Conta destino){
    if(debitar(valor)){
    destino.Creditar(valor);
    }else{
    System.out.println("transferencia negada");
    }
     
    
   
    }


}
