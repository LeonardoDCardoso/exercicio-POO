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
public class Executavel {
    
    public static void main(String[] args) {
        ContaCorrente contaCorrente = new ContaCorrente();
        contaCorrente.setSaldo(2000);
        contaCorrente.setNumeroConta("123");
        contaCorrente.depositar(100);
        //contaCorrente.sacar(2099);
        //System.out.println("Saldo: "+contaCorrente.getSaldo());
        System.out.println("");
        
        ContaPoupanca contaPoupanca =  new ContaPoupanca();
        
        contaPoupanca.setNumeroConta("12");
        contaPoupanca.setSaldo(5000);
        contaPoupanca.transferir(1000, contaCorrente);
        //contaPoupanca.sacar(6000);
        //System.out.println(contaPoupanca.mostrarDados());
        
        
        Relatorio relatorio = new Relatorio();

//        System.out.println("");
//        System.out.println("");
//        
//       
        Banco b = new Banco();
        b.adicionar(contaCorrente);
        b.adicionar(contaPoupanca);
        relatorio.gerarRelatorio(b);
    }
}
