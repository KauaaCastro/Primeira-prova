package estudo;
import java.util.Scanner;


public class comandoFor {
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static void Forcode(String[] args) throws InterruptedException{ 
        Scanner entrada = new Scanner(System.in);
        String clear = "\033\143";
    
            System.out.println(clear);
            System.out.println(ANSI_BLUE + "7. For" + ANSI_RESET);
        System.out.println();
        System.out.println("Aqui falaremos sobre o comando \"for\", um comando utilizado para criar loopings de repetiçoes, assim como o comando que vimos mais cedo, o comando while, o for geralmente é o preferido por sua form,a mais imples e \"minimalista\" ");
        System.out.println("eu particularmente prefiro utilizar o comando while por conseguir entende-lo melhor, porém o comando for consegue criar o looping em apenas algumas linhas usando uma condiçao, variavel, e uma condiçao de encerramento");
        System.out.println("A estrutura do comando For é bem simples, sendo mais simples até mesmo do que o próprio while.");
        System.out.println("Pressione qualquer tecla para que possamos prosseguir para próxima tela de explicaçao");
        @SuppressWarnings("unused")
        char prosseguindo = entrada.next().charAt(0);
        
        System.out.println(clear);
        System.out.println( ANSI_BLUE + "Quando usamos o comando for?" + ANSI_RESET);
        System.out.println();
        System.out.println("Utilizamos o comando for quando sabemos exatamente quantas vezes o loop deve ser executado, isso porque ele possui a inicializaçao, condiçao e atualizaçao da variável de controle do loop tudo em uma única String");
        System.out.println("Enquanto o comando While é mais flexível e é normalmente utilizado quando o número de interaçoes n~]ao é conhecido antecipadamente, uma situaçao na qual a condiçao é verificada antes de cada interaçao do looping, e o bloco de código é executado enquanto a condiçao for verdadeira.");
        System.out.println("no caso do while, normalmente utilizamos mais de uma linha para que possamos criar o looping, por exemplo, as interaçoes nesse código, nesse app por si só se tratam de comandos em formatos loopings, onde quando você seleciona a opçao de retornar ao menu principal ou à alguma lista anterior, um comando while é lido e executado fazendo com que você retorne à tela desejada");
        System.out.println("por que nao utilizei o for? simples, por serem condiçoes e loopings sem definiçoes prévias de quando se encerram, portanto ficaria complicado de escreve-los de forma prévia em apenas uma única String, tornando assim mais fácil o uso do comando while, além de que o while permite mais códigos e comando dentro dele, por isso acaba ficando mais fácil e prático a utilizaçao do mesmo");
        System.out.println("Abaixo temos um exemplo de comando for e um de while para que possa ser visto e análisado suas diferenças:");
        System.out.println(ANSI_GREEN);
        System.out.println("for (inicializaçao; condiçao; atualizaçao) {");
        System.out.println(               "bloco de código a ser repetido"); 
        System.out.println("}"); 
        System.out.println(ANSI_RESET);
        System.out.println("Abaixo vemos outro exemplo, dessa vez utilizando o while");
        System.out.println(ANSI_GREEN);
        System.out.println("while (condiçao) {");
        System.out.println("// bloco de código a ser executado enquanto a condiçao for verdadeira");
        System.out.println("}"); 
        System.out.println(ANSI_RESET);
        System.out.println("pressione qualquer tecla para que possamos prosseguir para os exemplos utilizando fórmula"); 
        @SuppressWarnings("unused")
        char prosseguindo2 = entrada.next().charAt(0);
        
        System.out.println(clear);
        System.out.println("Exemplo utilizando while:" + ANSI_GREEN);
        System.out.println();
        System.out.println("int i = 1");
        System.out.println("while (i <= 5) {");
        System.out.println("System.out.println(i);");
        System.out.println("i++;");
        System.out.println("}");
        System.out.println(ANSI_RESET);
        System.out.println("Exemplo utilizando for:");
        System.out.println("for (int j = 1; j <= 5; j++) {");
        System.out.println("            System.out.println(j);");
        System.out.println("}");
        System.out.println(ANSI_GREEN);
        System.out.println("Aqui citamos alguns exemplos de como escrevemos o for, abaixo colocarei alguns exemplos, situaçoes e questoes nas quais o comando for se tornam necessários");
        System.out.println("Pressione qualquer tecla para que possamos continuar");
        @SuppressWarnings("unused")
        char prosseguindo3 = entrada.next().charAt(0);

        System.out.println(clear);
        System.out.println(ANSI_BLUE);
        System.out.println("1. **Iterar sobre elementos de um array ou lista:**");
        System.out.println(ANSI_RESET); 
        System.out.println("O comando \"for\" é muito útil para percorrer todos os elementos de um array ou lista, realizando operaçoes em cada um deles. Por exemplo:");
        System.out.println("Exemplo utilizando for para iterar sobre um array:");
        System.out.println(ANSI_GREEN);
        System.out.println("int[] numeros = {1, 2, 3, 4, 5};");
        System.out.println("for (int i = 0; i < numeros.length; i++) {");
        System.out.println("    System.out.println(numeros[i]);");
        System.out.println("}");
        System.out.println(ANSI_RESET);
        System.out.println("Pressione qualquer tecla para que possamos partimos para a conclusao sobre o assunto");
        @SuppressWarnings("unused")
        char prosseguindo4 = entrada.next().charAt(0);

        System.out.println(clear);
        System.out.println(ANSI_BLUE + "Conclusao" + ANSI_RESET);
        System.out.println();
        System.out.println("Aqui finalizamos o assunto do for, é um assunto bem curto, pois no geral ele segue as regras e base do while, alterando somente sua fórmula e estrutura básica a ser seguida e claro, alterando o momento de utiliza-la");
        System.out.println("Pressione qualquer tecla para retornar à tela inicial");
        System.out.println();
        @SuppressWarnings("unused")
        char finale = entrada.next().charAt(0);
        Main.main(null);
        entrada.close(); 
       } 
    }


