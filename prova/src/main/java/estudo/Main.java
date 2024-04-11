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
        
        System.out.println("1- Estrutura básica e padrao");
        System.out.println("2- Váriaveis");
        System.out.println("3- Sinais e calculos");
        System.out.println("4- If e Else");
        System.out.println("5- While");
        System.out.println("6- Switch");
        System.out.println("7- Split");
        System.out.println("8- for");
        System.out.println("10- finalizar ");
        int escolha = entrada.nextInt();

        if(escolha == 1){
          Basico.basic(args);
        } else if(escolha == 2){
          Variavel.variaveis(args);
        }else if(escolha == 3){
          sinais_calculos.contas(args);
        } else if (escolha == 4){ 
          if_else.ifelse(args);
        } else if(escolha == 5){
          whiletest.voidwhile(args);            
        } else if(escolha == 6){
          SwitchCase.SCase(args);
        } else if (escolha == 7){
          Split.strsplit(args);
        } else if (escolha == 8){
          comandoFor.Forcode(args);
        } else if (escolha == 10){
          System.out.println();
          System.out.println("Encerrando, obrigado por utilizar o App...");
          start = false;
        } else {
          System.out.println(ANSI_RED + "Error" );
          System.out.println("Digite um número que esteja presente na lista." + ANSI_RESET);
          Thread.sleep(3000);
         Main.main(null);
        }

           } entrada.close();
      }  
       
    }

  