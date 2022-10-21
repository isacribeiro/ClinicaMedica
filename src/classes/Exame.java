package classes;

import java.text.SimpleDateFormat;
import java.util.Calendar;


public class Exame {
    String horarioAt = new SimpleDateFormat("dd/MM/yyyy  HH:mm").format(Calendar.getInstance().getTime());
    private Medico medico;
    private Paciente paciente;
    //private String horario;
    private String descricao;
    private boolean statusConclusao = false; //(Concluido ou não concluido)
    private int CodigoUnico;
    private Secretaria secretaria;

    
    public Exame(){
        
    }
    
    public Exame(int codigoUnico) {

        this.medico = medico;
        this.paciente = paciente;
        //this.horario = horario;
        this.descricao = descricao;
        this.CodigoUnico = codigoUnico;
        this.statusConclusao = statusConclusao;
        this.secretaria = secretaria;
    }



    
            
            
     public void imprimaListadeExamesMedico(){
        System.out.println("Medico: " + medico );
        System.out.println("Lista de exames: " + medico.getExames());
        
    }
     
     
    public void dadosPaciente(){
         System.out.println("Nome: " + paciente);
         System.out.println("Idade: " + paciente.getIdade());
         System.out.println("CPF: " + paciente.getCpf());
         System.out.println("Peso: " + paciente.getPeso());
         System.out.println("Altura: " + paciente.getAltura());
         System.out.println("Índice de Massa Corporal: " + paciente.getPeso()/(paciente.getAltura() * paciente.getAltura()));
    }
    

    public void marcarExame() {
         System.out.println("Exame marcado! ");
         System.out.println("\nPaciente: " + paciente + "\nLista de exames: " + paciente.getListaExames() + "\nCódigo do Paciente: " + CodigoUnico + "\nMarcado por: " + secretaria + "\nHorário: " 
         + horarioAt);
         System.out.println("-------------------------------");
         /*if(statusConclusao == true){
         System.out.println("Status do Exame: Concluido");
         
         } else {
         System.out.println("Status do Exame: Não Concluido");
         } */
                
    }
    
    public void consultarExamesMarcados(){
        System.out.println("-------------------------------");
        System.out.println("Relatório do Exame");
         System.out.println("Médico: " + this.medico + "\nPaciente: " + paciente
      + "\nHorário do Exame: " + horarioAt + "\nDescrição do exame: " + descricao + "\nCódigo do Paciente: " + CodigoUnico + "\nMarcado por: " + secretaria);
               if(statusConclusao == true){
          System.out.println("Status do Exame: Concluido");
       
        } else {
          System.out.println("Status do Exame: Não Concluido");
              } 
        System.out.println("-------------------------------");
     
    }

    public Medico getMedico() {
        return medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public Secretaria getSecretaria() {
        return secretaria;
    }

    public void setSecretaria(Secretaria secretaria) {
        this.secretaria = secretaria;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getCodigoUnico() {
        return CodigoUnico;
    }

    public void setCodigoUnico(int CodigoUnico) {
        this.CodigoUnico = CodigoUnico;
    }

    
}



