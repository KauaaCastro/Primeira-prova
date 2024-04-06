package estudo;
import java.util.Scanner;

public class SwitchCase {
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_CYAN = "\u001B[36m";
    
    public static void SCase(String[] args) throws InterruptedException {
        Scanner entrada = new Scanner(System.in);
        String clear = "\033\143";
        boolean lista =  true;;
        boolean lista2 = true;
      
        System.out.println(clear);
        System.out.println(ANSI_BLUE + "5-) Switch Case" + ANSI_RESET);
        System.out.println("");
        System.out.println("Aqui falaremos um pouco a respeito do comando Switch Case, comando esse que possui uma funçao extremamente semelhante a funçao exercida pelo if e else");
        System.out.println("O Switch case normalmente é utilizado quando a condicional é uma estável ou uma fixa, portanto nao se alterando");
        System.out.println("Ele acaba se tornando uma opçao mais viavel para quem deseja escrever e realizar listas e até calculos (claro que depende do tipo, afinal ele nao é um comando lógico)");
        System.out.println("O Switch Case é um comando bem prático de se utilizar, simples, limpo e bem rápido de se aprender a utilizar, sua estrutura é bastante simples e de certa forma até autoexplicativa");
        System.out.println("");
        System.out.println(ANSI_CYAN + "Devemos substituir todos os if e else por ele? afinal ele é mais prático, mais funcional e mais limpo, portanto porque usar o if e else?" + ANSI_RESET);

        System.out.println("NAO, DEFINITIVAMENTE NAO, em algums casos sim, podemos, em outros nao podemos e nao devemos, isso porque como dito acima o SCase funciona melhor em ocasioes menos lógicas");
        System.out.println("enquanto o if e else funcionam melhores com lógicas, portanto se a condiçao for" + ANSI_GREEN + " x <= 5 " + ANSI_RESET + "devemos utilizar o if else, afinal x é lógico e alteravel");
        System.out.println("no entando, caso seja algo mais simples como " + ANSI_GREEN + "uma lista que vai de 1 até 5 e o usúario deve apenas escolher" + ANSI_RESET + ", ai sim, ai recomendamos o uso do SwitchCase");
        System.out.println("afinal nesse caso a posiçao do item na lista nao é variavel, 5 nao ira trocar de posiçao ou valor a depender do usúario, portanto nao é um algarismo booleano/lógico");
        System.out.println("o código usando switch case para determinar a condiçao seria: " + ANSI_GREEN + "Switch" + ANSI_CYAN + "(VARIAVEL QUE VOCE DESEJA ANALISAR)" + ANSI_GREEN + " { case 1: " + ANSI_CYAN + "(substitua o 1 pela condiçao que será válida)" + ANSI_RESET + "");
        System.out.println("porém aqui também usaremos alguns comandos já conhecidos como por exemplo o break; e usaremos também boa parte da lógica de looping, isso porque o Switch Case utiliza dessa lógica de looping para executar alguns métodos sem ou com o break;");
        System.out.println(ANSI_GREEN + ""); System.out.println("int opcao = entrada.nextInt();"); System.out.println("switch (opcao) {"); System.out.println("    case 1:"); System.out.println("        System.out.println(\"Selecionou a opçao 1.\")"); System.out.println("        break"); System.out.println("    case 2:"); System.out.println("        System.out.println(\"Selecionou a opçao 2.\")"); System.out.println("        break"); System.out.println("    case 3:"); System.out.println("        System.out.println(\"Selecionou a opçao 3.\")"); System.out.println("        break"); System.out.println("    default:"); System.out.println("        System.out.println(\"Opçao inválida.\")"); System.out.println("}"); System.out.println("" + ANSI_RESET);
        System.out.println("");
        System.out.println("Esse é um exemplo de estrutura e funcionamento do Switch case, nesse exemplo iriamos escrever o número inteiro e armazena-lo na variavel opçao, após isso o Switch case irá analisar o número colocado e comparar com a condiçao imposta");
        System.out.println("suponhamos que o número digitado pelo usúario tenha sido o número 2, ele irá análisar caso a caso e chegará no caso dois, quando ela análisar o caso 2 e vir que a condiçao está sendo 'satisfeita', ele tornará a condicional como true e portanto irá iniciar e executar os comandos contido na condiçao que foi dada como true");
        System.out.println("um exemplo de onde usamos o Switch é justamente nesse código, na aba WHILE, eu utilizei do Switch case em práticamente todo o código, usando o if e else apenas em alguns casos especificos onde precisei utilizar para condiçoes lógicas e booleanas.");
        System.out.println("Podemos utilizar o Switch case para métodos lógicos e condiçoes booleanas? Sim, podemos, porém é mais complexo e complicado do que utilizar um simples if e else.");
        System.out.println("Abaixo irei explicar melhor qual a diferença entre ambos e em quais situaçoes utilizamos eles, deseja continuar? " + ANSI_RED + "(s/n)" + ANSI_RESET);
        String continuando = entrada.next();
       
        while(lista){
        if(continuando.equalsIgnoreCase("s")){
           System.out.println(clear); 
           System.out.println("A escolha entre usar if-else e switch-case em Java depende da situaçao específica e da estrutura de controle mais apropriada para expressar a lógica do programa. Aqui estao algumas diretrizes gerais:");
           System.out.println(""); 
           System.out.println(ANSI_BLUE + "Usar if e else quando:" + ANSI_RESET );
           System.out.println(""); 
           System.out.println("1. Condiçoes complexas.");
           System.out.println("2. Verificaçoo de intervalos.");
           System.out.println("3. Múltiplas condiçoes independentes.");
           System.out.println("4. Comparaçao de strings.");
           System.out.println("5. Ir direto para switch case");
           System.out.println();         
           System.out.println( ANSI_RED + "10. retornar ao menu inicial" + ANSI_RESET);
           int caso = entrada.nextInt();

           switch (caso) {
            case 1:
            System.out.println(clear);
                 System.out.println(ANSI_BLUE + "1. Condiçoes complexas:" + ANSI_RESET);
                 System.out.println("");
                 System.out.println("O uso de 'if' e 'else' é especialmente útil quando lidamos com condiçoes complexas.");
                 System.out.println("Em situaçoes onde as condiçoes envolvem múltiplos critérios e expressoes booleanas compostas,");
                 System.out.println("o 'if' e 'else' oferecem flexibilidade para expressar a lógica de maneira clara e concisa.");
                 System.out.println("Por exemplo, podemos ter uma condiçao que depende de várias variáveis e suas combinaçoes:");
                 System.out.println(ANSI_GREEN);
                 System.out.println("if (idade >= 18 && idade <= 65 && salario >= 1000 && salario <= 5000 && possuiEmprego) {");
                 System.out.println("    System.out.println(\"Você atende aos critérios para solicitar um empréstimo.\");");
                 System.out.println("} else {");
                 System.out.println("    System.out.println(\"Desculpe, você nao atende aos critérios para solicitar um empréstimo.\");");
                 System.out.println("}");
                 System.out.println(ANSI_RESET);
                 System.out.println("Neste exemplo, estamos verificando se uma pessoa atende aos critérios para solicitar um empréstimo,");
                 System.out.println("com base em sua idade, salário e emprego. O uso de 'if' e 'else' nos permite");
                 System.out.println("expressar essa condiçao complexa de maneira legível e fácil de entender.");
                 System.out.println("");
                 System.out.println("podemos continuar? (s/n)");
                 String continuar = entrada.next();
                    if(continuar.equalsIgnoreCase("n")){
                        break;
                    } else if (continuar.equalsIgnoreCase("s")){ 
                    } else {
                        Main.main(null);
                    }
            case 2:
            System.out.println(clear);
                 System.out.println( "2. Comparação de valores de enumerações:");
                 System.out.println("");
                 System.out.println("O 'switch-case' é frequentemente usado quando precisamos comparar valores de enumerações.");
                 System.out.println("Enumerações são tipos de dados especiais em Java que representam um conjunto fixo de constantes.");
                 System.out.println("Usando 'switch-case' com enumerações, podemos lidar com diferentes casos para cada constante da enumeração.");
                 System.out.println("Por exemplo, considere uma enumeração para dias da semana:");
                 System.out.println();
                 System.out.println("enum DiaDaSemana {");
                 System.out.println("    DOMINGO, SEGUNDA, TERÇA, QUARTA, QUINTA, SEXTA, SÁBADO");
                 System.out.println("}");
                 System.out.println();
                 System.out.println("switch (dia) {");
                 System.out.println("    case DOMINGO:");
                 System.out.println("        System.out.println(\"Hoje é domingo.\");");
                 System.out.println("        break;");
                 System.out.println("    case SEGUNDA:");
                 System.out.println("        System.out.println(\"Hoje é segunda-feira.\");");
                 System.out.println("        break;");
                 System.out.println("    // Casos restantes para os outros dias da semana...");
                 System.out.println("}");
                 System.out.println();
                 System.out.println("Neste exemplo, estamos usando 'switch-case' para lidar com diferentes dias da semana,");
                 System.out.println("usando os valores da enumeração DiaDaSemana. Isso nos permite escrever um código mais");
                 System.out.println("limpo e organizado, especialmente quando estamos lidando com várias opções.");
                 System.out.println();
                 System.out.println("");
                 System.out.println("podemos continuar? (s/n)");
                 String continuar1 = entrada.next();
                    if(continuar1.equalsIgnoreCase("n")){
                       break;
                    } else if (continuar1.equalsIgnoreCase("s")){
                    } else {
                        Main.main(null);
                    }
            case 3:
            System.out.println(clear);
                 System.out.println("3. Clareza de código:");
                 System.out.println("");
                 System.out.println("Tanto 'if-else' quanto 'switch-case' podem ser usados para expressar lógica condicional,");
                 System.out.println("mas a escolha entre eles muitas vezes depende da clareza do código.");
                 System.out.println("Se a lógica condicional envolve múltiplas opções com base em uma única variável, 'switch-case'");
                 System.out.println("pode tornar o código mais claro e legível.");
                 System.out.println("Por outro lado, 'if-else' é mais adequado para condições complexas ou quando as condições são independentes umas das outras.");
                 System.out.println("Ao decidir entre 'if-else' e 'switch-case', é importante priorizar a clareza e a facilidade de manutenção do código.");
                 System.out.println("");
                 System.out.println("podemos continuar? (s/n)");
                 String continuar2 = entrada.next();
                    if(continuar2.equalsIgnoreCase("n")){
                       break;
                    } else if (continuar2.equalsIgnoreCase("s")){
                    } else {
                        Main.main(null);
                    }
            case 4:
                 System.out.println(clear);
                 System.out.println("4. Melhor desempenho:");
                 System.out.println("");
                 System.out.println("Em algumas situações, 'switch-case' pode oferecer melhor desempenho do que 'if-else'.");
                 System.out.println("Isso ocorre porque o compilador Java pode otimizar um 'switch-case' para uma instrução de desvio de múltiplas vias,");
                 System.out.println("que pode ser mais eficiente do que uma série de 'if-else' aninhados.");
                 System.out.println("No entanto, é importante lembrar que otimizações de desempenho podem variar dependendo do contexto e da implementação do compilador.");
                 System.out.println("Ao avaliar o desempenho, é recomendável fazer testes de benchmarking para determinar qual abordagem é mais adequada para sua situação específica.");
                 System.out.println("");
                 System.out.println("Pressione qualquer tecla para que possamos retornar a lista e selecionar outros itens caso deseje:");
                 @SuppressWarnings("unused")
                 char retornando = entrada.next().charAt(0);    
               
            } switch (caso){
                case 5:
                while(lista2){
                System.out.println("");
                     System.out.println( ANSI_BLUE + "Usar o switch case quando:" + ANSI_RESET);
                     System.out.println("Use switch-case quando:");
                     System.out.println("1. Múltiplas opçoes com base em um valor fixo.");
                     System.out.println("2. Comparaçao de valores de enumeraçoes.");
                     System.out.println("3. Clareza de código.");
                     System.out.println("4. Melhor desempenho.");
                     System.out.println("5. Retornar a lista anterior");
                     System.out.println("10. Retornar para a tela de inicio");
                     int casoS = entrada.nextInt();
                     if(casoS >=1 && casoS <= 5 || casoS ==10){
                     switch (casoS) {
                       case 1:
                       System.out.println("");
                       System.out.println(clear);
                           System.out.println("1. Múltiplas opções com base em um valor fixo:");
                           System.out.println("O 'switch-case' é particularmente útil quando você precisa lidar com múltiplas opções,");
                           System.out.println("cada uma correspondendo a um valor específico e fixo.");
                           System.out.println("Ele oferece uma maneira concisa e legível de expressar lógica condicional quando há várias");
                           System.out.println("ramificações com base em um único valor.");
                           System.out.println("Por exemplo, podemos usar 'switch-case' para lidar com diferentes tipos de transporte:");
                           System.out.println();
                           System.out.println("switch (tipoDeTransporte) {");
                           System.out.println("    case CARRO:");
                           System.out.println("        System.out.println(\"Você está dirigindo um carro.\");");
                           System.out.println("        break;");
                           System.out.println("    case AVIAO:");
                           System.out.println("        System.out.println(\"Você está voando em um avião.\");");
                           System.out.println("        break;");
                           System.out.println("    case TREM:");
                           System.out.println("        System.out.println(\"Você está viajando de trem.\");");
                           System.out.println("        break;");
                           System.out.println("    default:");
                           System.out.println("        System.out.println(\"Tipo de transporte desconhecido.\");");
                           System.out.println("}");
                           System.out.println();
                           System.out.println("Neste exemplo, estamos usando 'switch-case' para lidar com diferentes tipos de transporte,");
                           System.out.println("usando os valores fixos definidos pela enumeração TipoDeTransporte. Isso torna o código");
                           System.out.println("mais claro e organizado, especialmente quando temos várias opções.");
                           System.out.println("");
                           System.out.println("podemos continuar? (s/n)");
                           String continuars1 = entrada.next();
                              if(continuars1.equalsIgnoreCase("n")){
                                 System.out.println(clear);
                                 break;
                              } else if (continuars1.equalsIgnoreCase("s")){
                                System.out.println(clear);
                              } else {
                                System.out.println(ANSI_RED + "ERRO, REINICIANDO TERMINAL" + ANSI_RESET);
                                Thread.sleep(3000);
                                Main.main(null);
                              }
                        case 2:
                        System.out.println("");
                        System.out.println(clear);
                            System.out.println("2. Comparação de valores de enumerações:");
                        System.out.println("");                            
                             System.out.println("O 'switch-case' é frequentemente usado quando precisamos comparar valores de enumerações.");
                             System.out.println("Enumerações são tipos de dados especiais em Java que representam um conjunto fixo de constantes.");
                             System.out.println("Usando 'switch-case' com enumerações, podemos lidar com diferentes casos para cada constante da enumeração.");
                             System.out.println("Por exemplo, considere uma enumeração para dias da semana:");
                             System.out.println();
                             System.out.println("enum DiaDaSemana {");
                             System.out.println("    DOMINGO, SEGUNDA, TERÇA, QUARTA, QUINTA, SEXTA, SÁBADO");
                             System.out.println("}");
                             System.out.println();
                             System.out.println("switch (dia) {");
                             System.out.println("    case DOMINGO:");
                             System.out.println("        System.out.println(\"Hoje é domingo.\");");
                             System.out.println("        break;");
                             System.out.println("    case SEGUNDA:");
                             System.out.println("        System.out.println(\"Hoje é segunda-feira.\");");
                             System.out.println("        break;");
                             System.out.println("    // Casos restantes para os outros dias da semana...");
                             System.out.println("}");
                             System.out.println();
                             System.out.println("Neste exemplo, estamos usando 'switch-case' para lidar com diferentes dias da semana,");
                             System.out.println("usando os valores da enumeração DiaDaSemana. Isso nos permite escrever um código mais");
                             System.out.println("limpo e organizado, especialmente quando estamos lidando com várias opções.");
                             System.out.println("");
                             System.out.println("podemos continuar? (s/n)");
                             String continuar2 = entrada.next();
                             if(continuar2.equalsIgnoreCase("s")){
                                System.out.println(clear);
                             } else if(continuar2.equalsIgnoreCase("n")){
                            System.out.println(clear);
                            break;                                
                            } else {
                               System.out.println(ANSI_RED + "ERRO, REINICIANDO TERMINAL" + ANSI_RESET);
                               Thread.sleep(3000);
                               Main.main(null);
                            }
                        case 3: 
                        System.out.println(clear);
                             System.out.println("3. Clareza de código:");
                             System.out.println("Tanto 'if-else' quanto 'switch-case' podem ser usados para expressar lógica condicional,");
                             System.out.println("mas a escolha entre eles muitas vezes depende da clareza do código.");
                             System.out.println("Se a lógica condicional envolve múltiplas opções com base em uma única variável, 'switch-case'");
                             System.out.println("pode tornar o código mais claro e legível.");
                             System.out.println("Por outro lado, 'if-else' é mais adequado para condições complexas ou quando as condições são independentes umas das outras.");
                             System.out.println("Ao decidir entre 'if-else' e 'switch-case', é importante priorizar a clareza e a facilidade de manutenção do código.");
                             System.out.println("Podemos continuar? (s/n)");
                             String continuar3 = entrada.next();
                             if(continuar3.equalsIgnoreCase("s")){
                                System.out.println(clear);
                             } else if(continuar3.equalsIgnoreCase("n")){
                             System.out.println(clear);
                             break;
                             } else {
                             System.out.println(ANSI_RED + "ERRO, REINICIANDO TERMINAL" + ANSI_RESET);
                             Thread.sleep(3000);
                             Main.main(null);
                             }
                        case 4: 
                        System.out.println(clear);
                             System.out.println("4. Melhor desempenho:");
                             System.out.println("Em algumas situações, 'switch-case' pode oferecer melhor desempenho do que 'if-else'.");
                             System.out.println("Isso ocorre porque o compilador Java pode otimizar um 'switch-case' para uma instrução de desvio de múltiplas vias,");
                             System.out.println("que pode ser mais eficiente do que uma série de 'if-else' aninhados.");
                             System.out.println("No entanto, é importante lembrar que otimizações de desempenho podem variar dependendo do contexto e da implementação do compilador.");
                             System.out.println("Ao avaliar o desempenho, é recomendável fazer testes de benchmarking para determinar qual abordagem é mais adequada para sua situação específica.");
                             System.out.println("Podemos continuar? (s/n)");
                             String continuar4 = entrada.next();
                             if(continuar4.equalsIgnoreCase("s")){
                                System.out.println(clear);
                                break;
                             } else if (continuar4.equalsIgnoreCase("n")){
                                System.out.println(clear);
                                break;
                             } else {
                              System.out.println("");
                                System.out.println(ANSI_RED + "ERRO, REINICIANDO TERMINAL" + ANSI_RESET);
                                Thread.sleep(3000);
                                Main.main(null);
                             }
                        case 5:
                        return;
                        case 10:
                        Main.main(null);
                    } 
                 } else {
                  System.out.println(ANSI_RED + "ERRO, REINICIANDO PROGRAMA..." + ANSI_RESET);
                  Thread.sleep(3000);
                  Main.main(null);
                 }
           }
        } 
     } else {
      Main.main(null);
}
}
    }
   }

