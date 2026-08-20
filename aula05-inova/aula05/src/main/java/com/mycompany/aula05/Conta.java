package com.mycompany.aula05;
public class Conta {
    private int agencia, numero;
    private double saldo;

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

       
    
    Conta(){
        
    }
    
    Conta(int agencia, int numero) {
        this.agencia = agencia;
        this.numero = numero;
        
    }
    
    Conta(int agencia, int numero, double saldo){
        this.agencia = agencia;
        this.numero = numero;
        this.saldo = saldo;
    }
    
    void creditar(double valor){
        if(valor > 0){
            saldo = saldo + valor;
            //System.out.println("Crédito Realizado!");
        }else{
            System.out.println("Valor Inválido!");
        }
    }
    
    boolean debitar(double valor){
        if(valor > 0 && valor <= saldo){
        saldo = saldo - valor;    
        //System.out.println("Débito Realizado!");
        return true;
        }else{
            System.out.println("Saldo Insuficiente!");
        return false;    
        }
    }
    
    void transferir(double valor, Conta destino){
        if(debitar(valor)){
            destino.creditar(valor);
            //System.out.println("Transferência Realizada!");
        }else{
            System.out.println("Transferência Negada!");
                    
                    
        }
    
    }
    
    
    @Override
    public String toString(){
        return "Conta: \nNúmero da Agência: "+ getAgencia() + "\n"
                 +"Número da Conta: "+ getNumero() + "\n" +
                "Saldo: R$ " + getSaldo();
    }
}