/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fichatpc;

import javax.swing.JOptionPane;

/**
 *
 * @author Cardoso
 * Classe que herda ContaBancaria e implementa imprimivel
 */
public class ContaPoupanca extends ContaBancaria implements Imprimivel{
    //limite do saldo
     private static final double limite = -1000;

    public ContaPoupanca() {
    }

    public ContaPoupanca( String numeroConta, double saldo) {
        super(numeroConta, saldo);
        
    }
    
    @Override
    public void sacar(double valor) {
         if((getSaldo()-valor)>=(limite)){
           System.out.println("Levantamento efetuado com sucesso");
           setSaldo(getSaldo()-valor);
           return ;
           }
         System.out.println("Impossivel efetuar o levantamento, saldo insuficiente");
    }
    
    @Override
    public void depositar(double valor) {
        if(valor>0){
         setSaldo(getSaldo()+valor);
         System.out.println("Deposito efetuado com sucesso");
         return;
        }
        System.out.println("Impossivel efetuar o deposito, valor invalido");
    }
    
    @Override
    public void mostrarDados() {
        JOptionPane.showMessageDialog(null,"Numero da Conta: "+getNumeroConta()+"\n"+"Saldo: "+getSaldo());
    }

  
   
    
}
