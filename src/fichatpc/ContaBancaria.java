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
 * classe super
 */
public abstract class ContaBancaria {
    
    private String numeroConta;
    private double saldo;
        
    public ContaBancaria(String numeroConta, double saldo) {
        this.numeroConta = numeroConta;
        this.saldo = saldo;
    }

    public ContaBancaria() {
    }


    public String getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    /**
     * metodo responsavel por efetuar o levantamento
     * @param valor a levantar
     */
    abstract void sacar(double valor);
    /**
     * metodo responsavel por efetuar o depositar 
     * @param valor a depositar
     */
    abstract void depositar(double valor);
    
    /**metodo que realiza a transferencia de uma conta para a outra
     * 
     * @param valor a transferir
     * @param des conta destino
     * @return 
     */
    public boolean transferir(double valor, ContaBancaria des){
        if (this.saldo>=valor){
            this.sacar(valor);
            des.depositar(valor);
            JOptionPane.showMessageDialog(null, "Transferencia realizada com sucesso");
            return true;
        }
        JOptionPane.showMessageDialog(null, "Imposssivel realizar a Transferencia");
        return false;
    }
}
