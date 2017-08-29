/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fichatpc;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Cardoso
 * Classe responsavel pelo gerenciamento das contas
 */
public class Banco implements Imprimivel{
 
    private ArrayList<ContaBancaria> contas = new ArrayList<>();

    public ArrayList<ContaBancaria> getContas() {
        return contas;
    }

    public void setContas(ArrayList<ContaBancaria> contas) {
        this.contas = contas;
    }
    
    
    /**
     * metodo que adiciona uma nova conta
     * @param o conta a adicionar
     */
    public void adicionar(ContaBancaria o){
        this.contas.add(o);
    }
    
    /**
     * metodo que remove uma conta
     * @param o conta a remover
     */
    public void remover(ContaBancaria o){
        this.contas.remove(o);
    }
    
    /**
     * metodo que procura uma conta no banco
     * @param i conta a procurar
     * @return 
     */
    public ContaBancaria procurar(int i){
        for (ContaBancaria conta1 : contas) {
             if (Integer.parseInt(conta1.getNumeroConta())==i){
               return conta1;
         }
        }     
       return null; 
    }

    /**
     * metodo implementado pela classe imprimivel
     * este mostra todos as contas criadas no banco
     */
    @Override
    public void mostrarDados() {
        for (ContaBancaria conta : contas) {
            if (conta instanceof ContaCorrente){
                ((ContaCorrente)conta).mostrarDados();
            }else{
                    ((ContaPoupanca)conta).mostrarDados();
                    }
        }
    }
}