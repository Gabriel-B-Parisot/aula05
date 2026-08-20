package com.mycompany.aula05;
public class ContaCorrente extends Conta{
    private double limite;
    
    public ContaCorrente(){
        
    }
    
    public ContaCorrente(int agencia, int numero, double saldo, double limite){
        super.setAgencia(agencia);        
        this.limite = limite;
    }
}

