package estudo;
import java.util.Scanner;
import java.lang.Math;

public class sinais_calculos {
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_RED = "\u001B[31m";
    
    public void contas(){
            Scanner entrada = new Scanner(System.in);
            boolean sinais = true;

        while(sinais) {
           System.out.print("\033\143");
            System.out.println("Essa aqui é a aba de sinais matemáticos e laguns métodos de calculos e dicas de como declara-los, abaixo temos uma listinha de alguns sinais e calculos e suas explicaçoes de formas breves e claro que teremos um exemplo de cada uma delas.");
            System.out.println("");
            System.out.println("1 - Adiçao e subtraçao");
            System.out.println("2 - multiplicaçao e divisao");
            System.out.println("3 - resto");
            System.out.println("4 - raiz");
            System.out.println("5 - simbolos");
            System.out.println(ANSI_RED + "10 - Retornar" + ANSI_RESET);
             int x = entrada.nextInt();

            if(x == 1){
                System.out.print("\033\143");
                System.out.println("");
                System.out.println(ANSI_BLUE + "1-) Adiçao e Subtraçao" + ANSI_RESET);
                System.out.println("Aqui temos a adiçao e a subtraçao que acredito eu que seja obvio o que ela faça, justamente subtrair e somar");
                System.out.println("Aqui no caso temos que a adiçao é representada por ++ Enquanto o comando de subtração é representado por --");
                System.out.println("Normalmente usamos o ++ ou -- para podermos manter ou acrescentar um algarimso na repitiçao ou no while, como por exemplo caso a condiçao de uma while seja x ser menor que 1, a repertiçao jamais irá parar, afinal, se x é de fato menor que 1, sempre será assim, porem o ++ muda justamente isso, porque a cada coisa ele não assume como verdadeiro ou falso direto e sim buscar comprender e achar os propósito pelos quais isso aconteceu");
                System.out.println("");
                System.out.println("deseja continuar?");
                String y = entrada.next(); 

                if(y.equalsIgnoreCase("s")){
                    return; //restart para sinais
                } else {
                    main.main(null); //restart para inicio 
                }
                } else if(x == 2){
                    System.out.print("\033\143");
                    System.out.println(ANSI_BLUE + "2-) Multiplicaçao e Divisao" + ANSI_RESET);
                    System.out.println("A multiplicaçao dentro dos comando java funciona de forma bastante simples, realizando calculos semelhantes aos normais que fazemos no dia a dia, porém aqui não utilizamos X para fazer qualquer multiplicaçao, aqui utilizamos o asterisco para podermos realizarmos os calculos necessários");
                    System.out.println("utilizando a seguinte fórnmula para realizarmos os cálculos: x * y = xy");
                    System.out.println("o cálculo funciona de forma bem simples onde x será multiplicado por y resultando em xy, da mesma forma que funciona no caderno, apenas mudando o sinal de X por asterisco, apenas isso.");
                    System.out.println("Exemplo: digite aqui o número x e o número y");
                    int numb = entrada.nextInt(); int numb2 = entrada.nextInt();
                    System.out.println("o resultado do calculo de " + ANSI_GREEN + numb + " * " + numb2 + " = " + numb * numb2 + ANSI_RESET);
                    System.out.println("");
                    System.out.println("Agora vamos falar a respeito da divisao, que aqui assim como a multiplicaçao é algo bem simples e tranquilo de se realizar, isso porque basicamente o que faremos é colocarmos a barra entre os números que desejamos calcular, basicamente como se fossemos deixa-los em forma de fraçao");
                    System.out.println("dessa forma dividimos o numerador antes da barra e o dividendo após a barra, como no exemplo a frente:");
                    System.out.println(" 4x / 2x = 2x ---> não sei se essa conta realmente resulta em 2x, mas eu usei apenas para termos uma noçao de sua formula. Abaixo temos um exemplo: ");
                    System.out.println("Digite aqui os o numerador primeiro e depois o dividendo");
                    double numerador = entrada.nextInt(); double dividendo = entrada.nextInt(); double calcdiv = numerador / dividendo;
                    System.out.println("O resultado da divisão do número " + ANSI_GREEN + numerador + " dividido por " + dividendo + " = " + calcdiv);
                    System.out.println(""+ ANSI_RESET);
                    System.out.println("Fórmula usada: " + ANSI_GREEN);
                    System.out.println("int numerador = entrada.nextint(); ");
                    System.out.println("int dividendo = entrada.nextint(); ");
                    System.out.println("int calcdiv = numerador / dividendo " + ANSI_RESET);

                    //restart
                    System.out.println("deseja continuar?");
                    String y = entrada.next(); 
                    if(y.equalsIgnoreCase("s")){
                        return; //restart para sinais
                    } else {
                        main.main(null); //restart para inicio 
                    }
                } else  if(x == 3){
                    System.out.print("\033\143");
                    System.out.println(ANSI_BLUE + "3-) Resto" + ANSI_RESET);
                    System.out.println("Por mais que pareça que esse simbolo será utilizado para poder fazer porcentagem, aqui usamos ele de forma um pouco diferente, usamos o simbolo para podermos descobrir o resto de divisoes e a partir disso descobrirmos numeros primos, numeros pares e impares e diversas outras funçoes extremamente uteis");
                    System.out.println("aqui utilizamos ele de forma bem semelhante, vamos supor que eu queira descobrir qual o resto de 100 dividido por 2, nesse caso a conta ficará da seguinte maneira: ");
                    System.out.println("100 % 2 = 0 --> Nesse caso coloquei igual a zero por conta de ser um número par. darei um pequeno exemplo de calculadora de números impares e números pares aqui, basicamente será um verificador simples de pares e impares.");
                    System.out.println("");
                    System.out.println("Escreva abaixo o número que deseja descobrir se é par ou impar: ");
                    int numb = entrada.nextInt(); int calcmulti = numb % 2;
                    System.out.println(ANSI_GREEN + "");
                    if(calcmulti == 0){System.out.println(""); System.out.println("Este número é par"); } else {System.out.println("Este número nao é par" + ANSI_RESET);}

                    //restart
                    System.out.println("");
                       System.out.println("deseja continuar?");
                       String y = entrada.next(); 
                       if(y.equalsIgnoreCase("s")){
                        return; //restart para sinais
                       } else {
                        main.main(null); //restart para inicio 
                    }
                } else if(x == 4){
                    System.out.print("\033\143");
                    System.out.println(ANSI_BLUE + "Raiz" + ANSI_RESET);
                    System.out.println("A raiz é algo um pouco mais complicado de se realizar, isso porque ela não possui um simbolo especifico para poder calcular a raiz quadrada, mas normalmente utilizamos um comando");
                    System.out.println("O comando em questao aqui é o: double (nome que queira dar a variavel) = Math.sqrt(variavel criada) ");
                    System.out.println("");
                    System.out.println("Deve-se lembrar que para podermos utilizar ele método/comando precisamos declarar Math; como um java import, e declarar uma variavel para por após o sqrt, como o exemplo acima diz");
                    System.out.println("Vamos a mais um exemplo né mesmo? Digite aqui o número no qual deseja tirar raiz quadrada:");
                     int numb = entrada.nextInt();
                     double raiz = Math.sqrt(numb);
                     System.out.println(ANSI_GREEN + "");
                     System.out.println("O resultado da raiz quadrada de " + numb + " = " + raiz + ANSI_RESET);
                    System.out.println("Fórmula:"); System.out.println(ANSI_GREEN + "double raiz = Math.sqrt(numb)"); System.out.println("System.out.println(raiz)"); System.out.println("" + ANSI_RESET); //linha de fórmulas
                       //restart
                       System.out.println("deseja continuar?");
                       String y = entrada.next(); 
                       if(y.equalsIgnoreCase("s")){
                        return; //restart para sinais
                       } else {
                        main.main(null); //restart para inicio 
                } 
            } else if(x == 5) {
                System.out.print("\033\143");

                //&&
                System.out.println( ANSI_BLUE + "5a-) && " + ANSI_RESET);
                    System.out.println("Aqui falaremos sobre alguns simbolos que são essenciais para a programaçao em java como o simbolo para escrever OU, E, negativa ou ");
                    System.out.println("&& --> Esse simbolo significa o E, ou seja, sempre que ver ele quer dizer que estamos adicionando algo a uma condicional ou variavel, exemplo:");
                    System.out.println("10 < 11 && 10 > 9 ---> Aqui dizemos que: 10 é menor que 11 E 10 é maior que 9");
                    System.out.println("algo bem simples mas bastante importante na hora de escrevermos algumas condicionais em while ou if, quando precisamos de uma condiçao especifica como por exemplo:");
                    System.out.println(ANSI_GREEN + " if (x < 5 && x > 3) " + ANSI_RESET + "---> Nesse código dizemos basicamente que: SE E SOMENTE SE o valor de x for menor que 5 E for maior que 3 o comando if será executado.");
                    System.out.println("");
                //||
                System.out.println( ANSI_BLUE + "5b-) ||" + ANSI_RESET);
                    System.out.println("|| --> Esse simbolo significa o OU, ou seja, sempre que vermos ele, devemos ler que uma a condicional ocorrerá em uma condiçao OU outra, como por exemplo:");
                    System.out.println(ANSI_GREEN + "x = 5 || x = 4" + ANSI_RESET + "---> Aqui dizemos que x pode ser igual a 5 OU x pode ser igual a 4, portanto pode ser um OU outro, esse comando é extremamente útil para quando queremos colocar duas situações onde as condicionais devem ocorrer, por exemplo: ");
                    System.out.println(ANSI_GREEN + "if(numb = 5 || numb = 10)"+  ANSI_RESET +"---> Nesse código colocamos duas situações para que a condicional if ocorra, como assim? de forma simples, aqui dizemos que");
                    System.out.println("SE E SOMENTE SE a variavel numb for igual a 5 OU igual a 10, deve-se executar o comando if, caso a variavel seja diferente de 5 ou 10, deve-se cancelar");
                    System.out.println("");
                // !
                System.out.println( ANSI_BLUE + "5c-) !" + ANSI_RESET);
                    System.out.println("!x --> Esse comando se trata de um comando para passar uma variavel ou afirmação para a forma negativa, colocamos o ponto de exclamaçao no começo da variavel para que possamos passar ela de positivo para negativo, basicamente o inverso dela mesmo, por exemplo:");
                    System.out.println("");
                    System.out.println( ANSI_GREEN + "boolean x = true" + ANSI_RESET);
                    System.out.println(ANSI_GREEN+ "if(x < 5){x = !true} " + ANSI_RESET + " ---> Aqui declaramos a variavel boolean, ou melhor uma variavel lógica que serve basicamente para podermos criar laços e loopings usando while e alguns varios outros comandos");
                    System.out.println("no comando acima eu declarei boolean como VERDADEIRA e posteriormente eu disse que SE E SOMENTE SE X FOR MENOR QUE 5, a variavel boolean será passada para sua forma inversa ou negativa, que nesse caso inverso ou negativo de positivo é justamente a negativa, portanto se boolean era igual a true, agora passa a se tornar igual a false");
                    System.out.println("");
                    
                     //restart
                     System.out.println("deseja continuar?");
                     String y = entrada.next(); 
                     if(y.equalsIgnoreCase("s")){
                      return; //restart para sinais
                     } else {
                      main.main(null); //restart para inicio 
              } 
                } else if(x == 10){
                        main.main(null); //restart para inicio 
                    } entrada.close();
                }  
            }   
             }
             





