package classes;

import java.util.List;

public class Medico extends Pessoa{
    List exames;
    
    public Medico(String nome, Integer idade, String cpf) {
        super(nome, idade, cpf);
    }    

    
    
    
    public List getExames() {
        return exames;
    }

    public void setExames(List exames) {
        this.exames = exames;
    }
    
   
    
 
        
   } 
   
   
    

  
