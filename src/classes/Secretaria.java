package classes;



public class Secretaria extends Pessoa{    
    private String telefone;
    
    

    public Secretaria (String nome, Integer idade,String cpf, String telefone){
        super(nome,idade,cpf);    // o "super" é uma sobrecarga de construtor, serve para puxar os atributos da classe pessoa.    
        this.telefone = telefone;
    }
    
    
    public void ImprimirDadosSecretaria(){
        System.out.println("\n" + "------------------------------");
        System.out.println("Ficha da Secretária");
        System.out.println("Nome: " + this.getNome());
        System.out.println("Idade: " + this.getIdade());
        System.out.println("CPF: " + this.getCpf());
        System.out.println("Telefone: " + this.telefone);
        System.out.println("------------------------------");  
    }
    
    /*@Override // siginifica uma sobreinscrição de um metodo herdado da classe extendida
    public void imprimirNome() {
    System.out.println("Secretária: " + super.getNome());
    }*/
    
    
    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    
    
    
    
}
