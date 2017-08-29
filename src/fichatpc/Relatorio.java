/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fichatpc;

/**
 *
 * @author Cardoso
 */
public class Relatorio {
    
    /**
     * metodo responsavel por gerar relatorios(mostrar todas as contas existentes)
     * @param relatorio 
     */
    public void gerarRelatorio(Imprimivel relatorio){
        relatorio.mostrarDados();
    }
    
}
