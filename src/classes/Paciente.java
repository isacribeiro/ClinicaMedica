package classes;

public class Paciente extends Pessoa {
    
    private double peso;
    private double altura;
    private double imc;
    private String listaExames; // no qual ele é o paciente
        
    public Paciente (){
        
    }
    
    public Paciente(String nome, Integer idade, String cpf) {
        super(nome, idade, cpf);
        this.peso = peso;
        this.altura = altura;
      
    }

    
   

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getImc() {
        return imc;
    }

    public void setImc(double imc) {
        this.imc = imc;
    }

    public String getListaExames() {
        return listaExames;
    }

    public void setListaExames(String exames) {
        this.listaExames = exames;
    }
    


    
}
