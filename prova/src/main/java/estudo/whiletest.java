package estudo;
import java.util.Scanner;

public class whiletest {
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_RED = "\u001B[31m";
    public static void voidwhile(String [] args) throws InterruptedException{
        Scanner entrada = new Scanner(System.in);
        boolean restart = true;
        String limpar = "\033\143";
        
        System.out.print("\033\143");
        System.out.println("Aqui falaremos sobre o comando 'while' comando esse que serve para criar loopings, repetições, cálculos mais complexos e redirecionamentos.");
        System.out.println("Esse é um dos comandos mais importantes aqui, isso porque a partir dele conseguimos utilizar várias sequencias e loopings, como por exemplo o que estou fazendo aqui desde o começo desse sistema.");
        System.out.println("Afinal quando você retorna à tela inicial ou quando retorna a lista de seleçao anterior, isso somente funciona devido ao comando while, sim isso nada mais é do que o comando while sendo executado entre um arquivo e outro");
        System.out.println("O comando while possui diversas questoes, isso porque aqui entram outros comando que também sao necessarios entender o básico para que possamos utilizar o while da melhor forma possivel");
        System.out.println("Afinal o while nao pode começar ou criar um looping ou uma repetiçao sozinho, sem que outro comando coloque uma condicional ou uma variavel atrelada a ele, vale lembrar que aqui também precisaremos usar o boolean em alguns casos.");
        System.out.println("");
        System.out.println("Dito tudo isso, deseja prosseguir para a lista com os comando essenciais para o while? (s/n)");
        String list = entrada.nextLine();

        while (restart){
            if (list.equalsIgnoreCase("s")){
                System.out.print(limpar);
                  System.out.println("1 - While");
                  System.out.println("2 - boolean");
                  System.out.println("3 - Break");
                  System.out.println(ANSI_RED + "4 - Voltar para a tela de inicio" + ANSI_RESET);
                  int escolha = entrada.nextInt(); 
                 
            if (escolha < 1 || escolha >= 5 ){
                System.out.println(ANSI_RED + "Item inexistente na lista, favor colocar um número presente na lista acima." + ANSI_RESET);
                System.out.println("Pressione qualquer letra/número para que possamos continuar");
                @SuppressWarnings("unused")
                char lista1 = entrada.next().charAt(0);
                restart = true;
            }
            
            switch (escolha){ 
            case 1:
                System.out.print(limpar);
                System.out.println(ANSI_BLUE + "1-) While" + ANSI_RESET);
                System.out.println("");
                System.out.println("O comando While geralmente é usado para que possamos criar loopings, repetiçoes, retornar a partes especificas do code");
                System.out.println("Uma boa forma de aprender e utiliza-lo é para criar repetiçoes em códigos básicos, automatizando um simples código.");
                System.out.println("Basicamente adicionando um while como verdadeiro no começo do code e lá no final colocando-o como falso ou true se quiser encerrar ou reiniciar.");
                System.out.println("pelo therminal ficará um pouco complicado de mostrar um exemplar disso aqui, por isso deixarei um link abaixo para que possa acessar meu github e visualizar um exemplo de código/comando while.");
                System.out.println("");
                System.out.println("Costumo usar ele bastante para poder automatizar e não precisar ficar reiniciando o code, este próprio arquivo possui diversos while");
                System.out.println("Aqui possui um while para retornar a tela inicial, para retornar a cada uma das listas, para cada lista poder se repetir e etc, são diversos e diversos comandos while aqui");
                System.out.println("que se organizados e bem feitinhos você nem ao menos percebe e repara em sua presença, já é algo comum vermos o while.");
                System.out.println("While basicamente signifa 'enquanto', ou seja, um simples comando 'whie(condicional)' enquanto (condicional) for verdadeira ou falsa, o comando deverá continuar");
                System.out.println("se a condicional for verdadeira, o code continuará rodando ou se combinado com if e else, pode exercer funçoes bem mais significativas para o code");

                System.out.println("Falta colocar o link de redirecionamento aqui:");
                System.out.println("Deseja continuar para a próxima explicaçao? (s/n)");
                String next = entrada.next();
                    if(next.equalsIgnoreCase("s")){
                      System.out.println(limpar);
                    } else if(next.equalsIgnoreCase("n")){
                    break;
                }
            case 2:
                System.out.println(limpar);
                System.out.println(ANSI_BLUE + "2-) Boolean"+ ANSI_RESET);
                System.out.println("O comando boolean se trata na verdade de uma Variavel e não de um comando própriamente dito, portanto é necessario declará-lo para que possamos executar alguns comandos while");
                System.out.println("A diferença dele é que ele é uma variavel que pode ser alterada, uma variavel lógica, ela pode ser tanto true quanto false");
                System.out.println("desta forma ela pode ser alterada com variaveis e loopings, se x < 5 boolean y = false; nesse caso temos um exemplo em que podemos");
                System.out.println("Considerar boolean como verdadeiro, porém se x for menor que 5 a variavel y/booleana se tornará falsa, isso é muito utilizada para criar condicionais de if e else e loopings");
                System.out.println("Podendo substituir o comando break em alguns momentos e sendo extremamente versátil em diversos códigos e comandos, é chamado de váriavel lógica justamente por poder ser alterada por uma lógica");
                System.out.println("Podemos declara-lá de duas formas distintas, considerando-as como falsa ou como verdadeiras:");
                System.out.println("");
                System.out.println(ANSI_GREEN + "boolean (nome da sua variavel aqui) = true;  ou  boolean (nome da sua váriavel aqui) = false;" + ANSI_RESET);
                System.out.println("");
                System.out.println("Após isso podemos alterar o valor de boolean conforme o que desejamos e a qualquer momento durante o code, citarei alguns exemplos a diante, essa tela voltará a ser exibida após a exibiçao de todos os exemplos");
                System.out.println("");
                System.out.println("Digite ok para prosseguir");
                @SuppressWarnings("unused")
                char digito = entrada.next().charAt(0);
                
                //exemplos: 
                System.out.println(limpar + ANSI_GREEN);
                System.out.println("boolean temCafe = true;"); System.out.println("boolean temLeite = false;"); System.out.println("if (temCafe && temLeite){"); System.out.println("Pode servir café com leite!"); System.out.println("} else {"); System.out.println("System.out.println('Falta café, leite ou ambos!')"); System.out.println("}"); 
                System.out.println(ANSI_RESET + "");
                System.out.println("Este é um exemplo do uso da variavel boolean, onde declaramos boolean para dizer se possui ou nao café e leite e a partir disso poderiamos fazer diversos if e else, o mesmo se aplica com exemplos em while, observe");
                System.out.println("Digite qualquer coisa para prosseguirmos");
                    @SuppressWarnings("unused")
                    char Digito = entrada.next().charAt(0); 
                    System.out.println( ANSI_GREEN + "");
                System.out.println("int contador = 10;"); System.out.println("boolean continuarContagem = true;"); System.out.println("while (continuarContagem) {"); System.out.println("    System.out.println(contador);"); System.out.println("    contador--;"); System.out.println("    if (contador < 0) {"); System.out.println("        continuarContagem = false;"); System.out.println("    }"); System.out.println("}"); System.out.println("System.out.println(\"Contagem regressiva concluída!\");"); System.out.println("}");
                System.out.println(ANSI_RESET + "");
                System.out.println("Deseja prosseguir para a próxima página? (s/n)");
                String next2 = entrada.next();
                if(next2.equalsIgnoreCase("s")){
                    System.out.println(limpar);
                } else if(next2.equalsIgnoreCase("n")){
                    break;
                }
            case 3:
                System.out.println(limpar);
                System.out.println(ANSI_BLUE + "3-) Break;" + ANSI_RESET);
                System.out.println("Dentro de um loop: Quando o comando break é encontrado dentro de um loop (for, while ou do-while), ele interrompe imediatamente a execuçao do loop e o controle do programa passa para a próxima instruçao após o loop.");
                System.out.println("Dentro de um switch statement: Quando o comando break é encontrado dentro de um switch, ele interrompe a execuçao do switch e o controle do programa passa para a próxima instruçao após o switch. Sem o break, a execuçao do código continuaria para o próximo case, potencialmente executando mais de um case até encontrar um break ou até o final do switch.");
                System.out.println(ANSI_GREEN + ""); System.out.println("int contador = 0"); System.out.println("while (true) {");System.out.println("System.out.println(Contador: + contador)");System.out.println("    contador++");System.out.println("");System.out.println("    if (contador == 10) {");System.out.println("        break");System.out.println("    }");System.out.println("}");System.out.println("System.out.println(Loop concluído!)");System.out.println("}"); System.out.println("");
                System.out.println(""+ ANSI_RESET); 
                System.out.println("Este foi um exemplo de código utilizando o comando while e aqui está um exemplo utilizando o switch case: ");
                System.out.println("dê ok para o próximo exemplo");
                    @SuppressWarnings("unused") char digitoss = entrada.next().charAt(0);
                System.out.println(ANSI_GREEN + "");
                System.out.println("        int opcao = 2;");  System.out.println("        switch (opcao) {"); System.out.println("            case 1:"); System.out.println("                System.out.println(\"Opção 1 selecionada.\");"); System.out.println("                break;"); System.out.println("            case 2:"); System.out.println("                System.out.println(\"Opção 2 selecionada.\");"); System.out.println("                break;"); System.out.println("            case 3:"); System.out.println("                System.out.println(\"Opção 3 selecionada.\");"); System.out.println("                break;"); System.out.println("            default:"); System.out.println("                System.out.println(\"Opção inválida.\");"); System.out.println("                break;"); System.out.println("        }");
                System.out.println( ANSI_RESET + "");
                System.out.println( "Para prosseguir clique em qualquer tecla: ");
                    @SuppressWarnings("unused")
                    char DIgito = entrada.next().charAt(0);
                break; 
            case 4: 
            Main.main(null);
            }
        } else if (list.equalsIgnoreCase("n")){
            Main.main(null);
        } else {
            System.out.println("Você digitou um algarismo ou elemento não correspondente.");
            @SuppressWarnings("unused")
            char z = entrada.next().charAt(0);
            Main.main(null);
        }
       } entrada.close();
     } 
   }
  