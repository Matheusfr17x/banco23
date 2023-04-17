
package controleremot.banco2;

import dependencias.Cliente;
import dependencias.Conta;
import dependencias.Funcionario;


public class Banco2 {

    public static void main(String[] args) {
      
        Funcionario f1=new Funcionario();
        f1.setNome("Fiodor");
        f1.setSalario(100);
        f1.bonifica(50);
        f1.setDepartamento("Financeiro");
        f1.setDataEntrada("21/12/2013");
        f1.setRG("123.345.234");
        f1.setAtivo(true);
        
        System.out.println("salario atual: "+ f1.getSalario());
        f1.mostra();
        
         Cliente c1=new Cliente();
         
         c1.setNome("Jose");
         c1.setTipoConta("poupanca");
         c1.setRG("123.456.780");
         c1.setAtivo(true);
         
         Conta co1=new Conta();
         
         co1.atualiza(5);
         
    }
}
