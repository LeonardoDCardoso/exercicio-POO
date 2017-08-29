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
public class ContaCorrente extends ContaBancaria implements Imprimivel{
    //Valor a depitar na realizacao de qualquer transacao
    private static final double taxaDeOperacao = 0.01;

      public ContaCorrente() {
    }
      
    public ContaCorrente( String numeroConta, double saldo) {
        super(numeroConta, saldo);
    }

   
    @Override
    public void sacar(double valor) {
        if(getSaldo()>=(valor+(valor*taxaDeOperacao))){
            setSaldo(getSaldo()-valor-(valor*taxaDeOperacao));
            System.out.println("Levantamento efetuado com sucesso");
            return ;
        }
        System.out.println("Impossivel efetuar o levantamento, saldo insuficiente");
    }

    
    @Override
    public void depositar(double valor) {
        if(valor>0){
         setSaldo(getSaldo()+valor-(valor*taxaDeOperacao));
         JOptionPane.showMessageDialog(null,"Deposito efetuado com sucesso");
         return ;
        }
        System.out.println("Impossivel efetuar o deposito, valor invalido");
    }

    
    
    @Override
    public void mostrarDados() {
        JOptionPane.showMessageDialog(null,"Numero da Conta: "+getNumeroConta()+"\n"+"Saldo: "+getSaldo());
    }

   

   
    
}
