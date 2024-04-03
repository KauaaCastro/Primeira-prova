package estudo;
import java.util.Scanner;

public class if_else {
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_RESET = "\u001B[0m";
    
    public void ifelse(){
        Scanner entrada = new Scanner(System.in);
        boolean restart = true;

        System.out.print("\033\143");
            System.out.println("Aqui falaremos sobre um dos códigos mais importantes e mais utilizáveis ao menos na minha opiniao, isso porque utilizando if e else podemos realizar inúmeros comandos e até mesmo substituir alguns outros comandos como while e for (apenas em algumas ocasioes especificas)");
            System.out.println("O comando if e else funciona com algumas regras e estruturas de forma bastante simples, isso porque usamos basicamente a mesma fórmula para praticamente todos os códigos que utilizam if e else");
            System.out.println("O if e else funcionam de forma bastante simples, sendo usadas como condicionais estáticas, basicamente uma condicional que nao vária, ela analisa os comandos e dados acima e compara com a condiçao colocada pelo programador dentro de sua fórmula");
            System.out.println("Dito isso, vamos para as fórmulas e e quando e como utilizaremos elas, a primeira fórmula que deixarei aqui é justamente a fórmula padrao do if e do else");
          
          System.out.println(ANSI_GREEN + "");
            System.out.println("if(condiçao se e somente se){");System.out.println("insira aqui o comando que deve ser executado caso a condiçao acima seja verdadeira");System.out.println("} else {"); System.out.println("insira aqui o comando que ocorrerá caso a condição do if seja falso");System.out.println("}");
            System.out.println(ANSI_RESET + "");
             System.out.println("Digite 'ok' para prosseguirmos"); 
             @SuppressWarnings("unused")
            char confirmaçao = entrada.next().charAt(0);
             
             System.out.print("\033\143");
             System.out.println("");    
          System.out.println("O segundo exemplo de como podemos utilizar esse código é utilizando o 'else if' adicionando assim novas opçoes de condicionais, onde se a primeira condicional nao for verdadeira, ele partirá para a segunda condicional, que se por sua vez for falso, ele partirá para a proxima e assim por diante até que chegue no ultimo else, ou que encontre um 'else if' que torne a variavel verdadeira.");
          System.out.println("vale ressaltar aqui, que esse comando funciona de forma um pouco diferente, isso porque o If que inicia a condicional será diretamente ligado ao ultimo 'ELSE', o último else NAO TERÁ IF:");
          System.out.println(ANSI_GREEN + "");
          System.out.println("if(condiçao se e somente se){");System.out.println("insira aqui o comando que deve ser executado caso a condiçao acima seja verdadeira");System.out.println("} else if(Adicione aqui a segunda condicional) {"); System.out.println("insira aqui o comando que ocorrerá caso a condição do else if seja verdadeiro");System.out.println("} else {"); System.out.println("digite aqui o que será executado caso os else if sejam falsos e o else seja verdadeiro"); System.out.println("}");
          System.out.println("" + ANSI_RESET);
          System.out.println("Deseja ver alguns exemplos de comandos utilizando if e else? (s/n)");
          String x = entrada.next();
  
        while(restart){  
        if(x.equalsIgnoreCase("s")){//inicio
            System.out.print("\033\143");
            System.out.println("");
            System.out.println("1 - Exemplo com duas ocasioes");
            System.out.println("2 - Exemplo com três ocasioes e condiçoes");
            System.out.println("3 - Voltar para a tela de inicio");
            int y = entrada.nextInt();             
                   if(y == 1){
                    System.out.println("");
                    System.out.println("digite aqui o número, se o número for maior que 10 o terminal dirá se é ou nao (nao será considerado igualdade, portanto 10 nao será igual a 10)");
                    int numb = entrada.nextInt();
                        if(numb < 10){
                            System.out.println("");
                            System.out.println("Você digitou um número menor que 10 e o número digitado por você foi: " + numb);
                            System.out.println("Digite 'ok' ou pressione qualquer digito e letra para prosseguirmos");
                           @SuppressWarnings("unused")
                            char confirmação = entrada.next().charAt(0); 
                            restart = true;
                            } else {
                            System.out.println("Você digitou um número maior que 10 e o número digitado por você foi: " + numb);
                            System.out.println("Digite 'ok' ou pressione qualquer digito e letra para prosseguirmos");
                           @SuppressWarnings("unused")
                            char confirmação = entrada.next().charAt(0);
                            restart = true; 
                }} else if(y == 2){
                    System.out.println("");
                    System.out.println("Esse será um comando simples de cálculo entre três números, escolha três números para que possamos verificar se a soma deles é maior, menos ou igual que 50.");
                    System.out.println("Digite aqui os três números que deseja usar para realizar o cálculo:");
                    int numb1 = entrada.nextInt(); int numb2 = entrada.nextInt(); int numb3 = entrada.nextInt(); int calc = numb1 + numb2 + numb3;
                    System.out.println("");
                    System.out.println("Os números escolhidos foram: " + numb1 + ", " + numb2 + ", " + numb3 + " e a soma entre eles é: " + calc);
                        if(calc < 50){
                            System.out.println("O resultado da soma entre os três números é menor que 50");
                            System.out.println("Digite 'ok' ou pressione qualquer digito e letra para prosseguirmos");
                           @SuppressWarnings("unused")
                            char confirmação = entrada.next().charAt(0); 
                            restart = true;
                        } else if(calc == 50){
                            System.out.println("A soma dos três algarismo é igual a 50");
                            System.out.println("Digite 'ok' ou pressione qualquer digito e letra para prosseguirmos");
                           @SuppressWarnings("unused")
                            char confirmação = entrada.next().charAt(0); 
                            restart = true;
                        } else{
                            System.out.println("A soma dos três números sao maiores que 50.");
                            System.out.println("Digite 'ok' ou pressione qualquer digito e letra para prosseguirmos");
                           @SuppressWarnings("unused")
                            char confirmação = entrada.next().charAt(0); 
                            restart = true;
                        }
                } else if(y == 3){
                    System.out.print("\033\143");
                    System.out.println("");
                    System.out.println("Retornando a tela inicial, aperte qualquer tecla para confirmar.");
                   @SuppressWarnings("unused")
                    char confirmação = entrada.next().charAt(0);
                    main.main(null);
                }           
        } else if(x.equalsIgnoreCase("n")){ //final
            System.out.println("Digite 'ok' para prosseguirmos");
            char confirmação = entrada.next().charAt(0);
            main.main(null);
        }
    }entrada.close(); 
  } 
}
