package dependencias;

public class Cliente {
    
    private String nome;
    private String tipoConta;
    private String RG;
    private boolean ativo;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipoConta() {
        return tipoConta;
    }

    public void setTipoConta(String tipoConta) {
        this.tipoConta = tipoConta;
    }

    public String getRG() {
        return RG;
    }

    public void setRG(String RG) {
        this.RG = RG;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }
    
     public void demitir(){
        this.ativo =false;
        
    }
    public void ativar(){
        this.ativo=true;
    }
    public String situacao(){
        
        String StringAtivo;
        if(ativo==true){
               StringAtivo = "Ativo";
        }
        else{
           StringAtivo= "Inativo";
        }
        return StringAtivo;
    }
    
    public void mostra(){
        
        
        System.out.println("Funcionario: "+this.getNome());
        System.out.println("Seu tipo de conta é: "+this.getTipoConta());
        System.out.println("O RG é: "+this.getRG());
        System.out.println(" a situação dele é: "+this.situacao());
        
        
    }
}

    



