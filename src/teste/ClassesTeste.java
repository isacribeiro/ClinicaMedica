package teste;

//<editor-fold defaultstate="collapsed" desc="imports">
import classes.Exame;
import classes.Medico;
import classes.Paciente;
import classes.Secretaria;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
//</editor-fold>

public class ClassesTeste {

    public static void main(String[] args) {
        String resp;
        String respConsulta = null;
        char respRelatorio;
        char respRepeticao = 0;
        
        //<editor-fold defaultstate="collapsed" desc="Scanners">
        Scanner entrada = new Scanner(System.in);
        Scanner entradaString = new Scanner(System.in);
        Scanner entradaDouble = new Scanner(System.in);
        Scanner resposta = new Scanner(System.in);
//</editor-fold>
     
       
        Exame exame = new Exame(1); //horario
        Secretaria secretaria = new Secretaria("Mariana", 37, "000.000.000-03", "(85)91122-3344");
        exame.setSecretaria(secretaria);
        Paciente paciente = new Paciente();
        exame.setPaciente(paciente);
        Medico medico1 = new Medico("Jefferson", 28, "000.000.000-01");
        exame.setMedico(medico1);
        
       //CONSULTAR DADOS DA SECRETÁRIA
       //secretaria.ImprimirDadosSecretaria();
    //----------------------------------------------------    
        
       //CONSULTAR DADOS DO MÉDICO
       //exame.imprimaListadeExamesMedico();
        //lista de exames paciente
         
            
        
        //Objeto 1
           //Lista de exames que o médico um pode realizar
            List <String> listaExames01 = new ArrayList();
            listaExames01.add("Hemograma");
            listaExames01.add("Glicemia");
            listaExames01.add("Exame de urina");
//            for(String lista1: listaExames01){
//                
////            medico1.setExames(listaExames01);
//                medico1.getExames().add(lista1);               
//            }
            medico1.setExames(listaExames01);
              // exame.imprimaListadeExamesMedico();
           //----------------------------------------------
           
        //Objetos 2
            Medico medico2 = new Medico("Juliano", 38, "000.000.000-12");
            exame.setMedico(medico2);
            
            //Lista de exames que o médico dois pode realizar
            
            List <String> listaExames02 = new ArrayList();
            listaExames02.add("Tomografia Computadorizada");
            listaExames02.add("Ultrassonografia");
            listaExames02.add("Ressonância Magnética");
            medico2.setExames(listaExames02);
            //System.out.println("------------------------------------------------------");
            //exame.imprimaListadeExamesMedico();
           
           
       //INÍCIO DA SAÍDA
        System.out.println("Bem-vindo à Sua Clínica!");
        System.out.println("Sou a Secretaria " + secretaria.getNome() + ". \nDeseja marcar um exame? (Escreva sim ou não) \n");
        resp = resposta.next();
        while(resp.equalsIgnoreCase("sim")) {
   
        //dados paciente
            System.out.println("CADASTRE SEUS DADOS: ");
            System.out.println("\nDigite seu nome: ");
            paciente.setNome(entradaString.nextLine());
            System.out.println("Digite sua idade: ");
            paciente.setIdade(entrada.nextInt());
            System.out.println("Digite seu CPF: ");
            paciente.setCpf(entradaString.nextLine());
            System.out.println("Digite o seu peso: ");
            paciente.setPeso(entradaDouble.nextDouble());
            System.out.println("Digite sua altura: ");
            paciente.setAltura(entradaDouble.nextDouble());
            System.out.println("Digite o exame que deseja realizar:"
    +       "\n- Hemograma              - Tomografia Computadorizada     - Raio-X"
    +       "\n- Glicemia               - Ultrassonografia               - Eletrocardiograma"
    +       "\n- Exame de urina         - Ressonância Magnética          - Teste Ergométrico");
            exame.setDescricao(entradaString.nextLine());
            System.out.println("-------------------------------");
            paciente.setListaExames(exame.getDescricao());
            exame.marcarExame(); //Marcação do exame
            System.out.println("\nDeseja marcar um novo exame?");
            resp = resposta.next();
            if(resp.equalsIgnoreCase("sim")){
                exame.setCodigoUnico(exame.getCodigoUnico() + 1);    
            } else if(resp.equalsIgnoreCase("nao")){
                System.out.println("Deseja consultar seus exames?");
                respConsulta = entradaString.nextLine();
                if(respConsulta.equalsIgnoreCase("sim")){
                     exame.consultarExamesMarcados();
                     
            }      
            }
      
        }
        
//        while(resp.equalsIgnoreCase("nao")){
//            System.out.println("\nFinalizamos o seu Atendimento!");
//            break;
//        } 
        
        System.out.println("\nFinalizamos o seu Atendimento!");
    }
}
        
            
           
            
            
            
            
            //Objetos 3
            /*Medico medico3 = new Medico("Wellington", 37, "000.000.000-45");
            exame.setMedico(medico3);
            
            //Lista de exames que o médico três pode realizar
            
            List <String> listaExames03 = new ArrayList();
            listaExames03.add("Raio-X");
            listaExames03.add("Eletrocardiograma");
            listaExames03.add("Teste Ergométrico");
            for(String lista3: listaExames03){
            
            }
            
            medico3.setExames(listaExames03);
            System.out.println("-------------------------------");
            exame.imprimaListadeExamesMedico();*/