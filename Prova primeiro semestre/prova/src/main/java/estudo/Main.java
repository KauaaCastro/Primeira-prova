package estudo;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("");
        System.out.println("Olá, aqui eu resolvi fazer um breve resumo para ajudar na prova do primeiro semestre, aqui eu irei fazer um resumo simples de cada matéria utilizando um código funcional e um código fonte no GitHub");
        System.out.println("Escolha aqui qual matéria você deseja revisar");
        System.out.println("");
        boolean variaveis = true;
        boolean inicio = true;

        while(inicio){
        System.out.println("1- Váriaveis");
        System.out.println("2- Sinais e calculos");
        System.out.println("3- If e Else");
        System.out.println("4- While");
        System.out.println("5- For");
        System.out.println("6- Split");
        System.out.println("7- length");
        System.out.println("8- Scanner");
        System.out.println("9- Estrutura básica e padrão");
        System.out.println("10- Loop");
        int escolha = entrada.nextInt();

        while(variaveis)
         if(escolha == 1){
            System.out.println("");
            System.out.println("Estruturas: int/double/char/string (nome da variante) = (item a ser armazenado)");
            System.out.println("Vamos falar sobre as variaveis, até o momento aprendemos algumas basicas como o double, int, String e a char, sobre qual você gostaria de falar primeiro?");
            System.out.println("1- int");
            System.out.println("2- double");
            System.out.println("3- char");
            System.out.println("4- String");
            int escolha2 = entrada.nextInt();

            //variaveis
             if(escolha2 == 1){
                System.out.println("");
                System.out.println("O comando Int é bem simples de ser compreendido, isso porque o comando int se trata de uma variavel que serve para declarar e armazenar números inteiros no código");
                System.out.println("Exemplos: 1,2,3,4,5,6,7, -1, -2, -3, -4, ...");
                System.out.println("Sua estrutura é simples, ele vem antes do nome da variavel, que por sua vez vem antes das igualdades");
                System.out.println("Escreva aqui um valor inteiro");
                int x = entrada.nextInt();
                System.out.println("");
                System.out.println("para poder armazenar o valor que foi colocado acima, eu utilizei um comando simples: int x = entrada.nextInt();");
                System.out.println("O nextInt serve para que possamos variaveis usando o Scanner mesmo após já te-lo declarado como uma variavel.");
                System.out.println("");
                System.out.println("aqui está o número digitado por você e armazenado pelo int: " + x);
                System.out.println("");
                System.out.println("Exemplos do que fazer usando ele: Escolha de listas, calculos de numeros inteiros, valores de scanners, loops...");
               
                //restart
                System.out.println("Deseja escolher alguma nova variavel? (s/n)");
                 String y = entrada.next();
                 if(y.equalsIgnoreCase ("s")){
                    System.out.println("reiniciando o programa. aguarde...");
                    System.out.println("");
                  } else {
                    System.out.println("Encerrando o programa.");
                    break;
                 }
             } else if(escolha2 == 2){  
              System.out.println("");
              System.out.println("Aqui falaremos sobre o Double, se trata de uma variavel que armazena números inteiros e decimais");
              System.out.println("exemplo de números a serem armazenados no double: 1,5; 2,3; 4,6; 7,68; 10,43...");
              System.out.println("escreva aqui um número decimal (ex: 5,23)");
              double x = entrada.nextDouble();
              System.out.println("");
              System.out.println("Double x = scanner.nextDouble();");
              System.out.println("Aqui para utilizarmos scanner é preciso utilizar o nextDouble()");
              System.out.println("Aqui está o numero que você armazenou " + x + " numero que você escolheu somado a 1,5 = " + (x + 1.5));
              System.out.println("");
              System.out.println("Exemplos de utilizaçao: Calculo em reais, centavos, numeros fracionarios, meio, um terço...");

              //restart
              System.out.println("Deseja escolher alguma nova variavel? (s/n)");
               String y = entrada.next();
               if(y.equalsIgnoreCase ("s")){
                  System.out.println("reiniciando o programa. aguarde...");
                  System.out.println("");
                } else {
                  System.out.println("Encerrando o programa.");
                  break;
               }
             } else if(escolha2 == 3){
                System.out.println("");
                System.out.println("Char é a variavel mais simples entre todas, ela serve basicamente para armazenar um unico algarismo, seja ele númerico ou alfabetico");
                System.out.println("exemplo: A, B, C, D, 3, 5, 1...");
                System.out.println("Um exemplo de uso é justamente para código como códigos binários ou confirmações de algum comando");
                System.out.println("não colocarei nenhum exemplo aqui, pois esse comando é algo até que bem especifico que usamos em while ou for geralmente, mas ainda sim pode ser substituido por outras variaveis");
                
                //restart
              System.out.println("Deseja escolher alguma nova variavel? (s/n)");
              String y = entrada.next();
              if(y.equalsIgnoreCase ("s")){
                 System.out.println("reiniciando o programa. aguarde...");
                 System.out.println("");
               } else {
                 System.out.println("Encerrando o programa.");
                 break;
              }
   
             } else if(escolha2 == 4){
                System.out.println("");
                System.out.println("Por ultimo, mas não menos importante temos o comando String, comando este que serve para declarar variaveis utilizando frases e textos, é nele que armazenamos palavras e frases");
                System.out.println("exemplos: a, e, i, o, u, kaua, teste, unitau, linguagem digital...");
                System.out.println("Escreva aqui uma letra ou palavra:");
               String x = entrada.next();

                System.out.println("");
                System.out.println("String x = entrada.next()");
                System.out.println("acima está a formula utilizada para armazenar a String, aqui está a palavra/letra escolhida por você: " + x);
                System.out.println("OBS: esse comando também salva e armazena frases e textos, porém para rodarmos isso precisamos de alguns outros comandos como nextline e outros...");
             
                //restart
              System.out.println("Deseja escolher alguma nova variavel? (s/n)");
              String y = entrada.next();
              if(y.equalsIgnoreCase ("s")){
                 System.out.println("reiniciando o programa. aguarde...");
                 System.out.println("");
               } else {
                 System.out.println("Encerrando o programa.");
                 break;
              } 
            }
        } 

      }
    }
}