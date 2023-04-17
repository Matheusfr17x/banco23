
package dependencias;


public class Funcionario {
    private String nome;
    private String departamento;
    private double salario;
    private String dataEntrada;
    private String RG;
    private boolean ativo;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getDataEntrada() {
        return dataEntrada;
    }

    public void setDataEntrada(String dataEntrada) {
        this.dataEntrada = dataEntrada;
    }

    public String getRG() {
        return RG;
    }

    public void setRG(String RG) {
        this.RG = RG;
    }

    public boolean getAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }
    
    public double bonifica(double valor){
        return  salario += valor;
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
        System.out.println("Departamento: "+this.getDepartamento());
        System.out.println("O salario eh: "+this.getSalario());
        System.out.println("A data de entrada no departamento foi: "+this.getDataEntrada());
        System.out.println("O RG é: "+this.getRG());
        System.out.println(" a situação dele é: "+this.situacao());
        
         
    }
}
