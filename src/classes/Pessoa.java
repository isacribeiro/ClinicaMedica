
package classes;

public abstract class Pessoa {
    protected String nome;
    private Integer idade;
    private String cpf;
    
    public Pessoa(){
        
    }
    
    
    public Pessoa(String nome, Integer idade, String cpf) { 
        this.nome = nome;
        this.idade = idade;    
        this.cpf = cpf;
                                        /*                                       */
    } 

    @Override
    public String toString() {
        return nome;
    }
    
    
    //public abstract void imprimirNome(); // metodo abstrato só pode ser criada em uma classe também abstrata
                                         // o método é vazio, mas precisa de um corpo na classe que vai herdar o método para que possa ser compilado.

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }
    
    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    
}
