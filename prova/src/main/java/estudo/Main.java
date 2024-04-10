package estudo;
import java.util.Scanner;

public class Main {
  public static final String ANSI_GREEN = "\u001B[32m";
  public static final String ANSI_RESET = "\u001B[0m";
  public static final String ANSI_BLUE = "\u001B[34m";
  public static final String ANSI_RED = "\u001B[31m";
  public static void main(String[] args) throws InterruptedException {  
        Scanner entrada = new Scanner(System.in);
        boolean start = true;

        while(start){
        System.out.print("\033\143");
        System.out.println("Olá, aqui eu resolvi fazer um breve resumo para ajudar na prova do primeiro semestre, aqui eu irei fazer um resumo simples de cada matéria utilizando um código funcional e um código fonte no GitHub");
        System.out.println("Escolha aqui qual matéria você deseja revisar" );
        System.out.println("");
        
        System.out.println("1- Váriaveis");
        System.out.println("2- Sinais e calculos");
        System.out.println("3- If e Else");
        System.out.println("4- While");
        System.out.println("5- Switch");
        System.out.println("6- Split");
        System.out.println("7- for");
        System.out.println("8- Estrutura básica e padrao");
        System.out.println("10- Extra ");
        int escolha = entrada.nextInt();
        
        if(escolha == 1){
          Variavel.variaveis(args);
        }else if(escolha == 2){
          sinais_calculos.contas(args);
        } else if (escolha == 3){ 
          if_else.ifelse(args);
        } else if(escolha == 4){
          whiletest.voidwhile(args);            
        } else if(escolha == 5){
          SwitchCase.SCase(args);
        } else if (escolha == 6){
          Split.strsplit(args);
        } else if (escolha == 7){
          comandoFor.Forcode(args);
        }
          else {
          System.out.println(ANSI_RED + "Error" );
          System.out.println("Digite um número que esteja presente na lista." + ANSI_RESET);
          Thread.sleep(3000);
         Main.main(null);
        }

           } entrada.close();
      }  
       
    }

  