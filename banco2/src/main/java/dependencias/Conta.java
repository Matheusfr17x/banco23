
package dependencias;


public class Conta {
    
    public double saldo;

    // outros métodos aqui também ...
    
    public  void atualiza(double taxa) {
    this.saldo += this.saldo * taxa;

    }
    
    public double deposita(double valor){
        
        return saldo+valor;
    }
}


