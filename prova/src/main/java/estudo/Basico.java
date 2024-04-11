package estudo;
import java.util.Scanner;

public class Basico {
  public static final String ANSI_GREEN = "\u001B[32m";
  public static final String ANSI_RESET = "\u001B[0m";
  public static final String ANSI_BLUE = "\u001B[34m";
  public static final String ANSI_RED = "\u001B[31m";

  public static void basic(String[] args) throws InterruptedException {
    Scanner entrada = new Scanner(System.in);
    String clear = "\033\143";

    System.out.println(clear + ANSI_BLUE);
    System.out.println("1- Estruturas básicas" + ANSI_RESET);
    System.out.println("Aqui aprenderemos algumas estruturas básicas e como elas funcionam, contendo algumas dicas com base na experiencia que tive programando e criando esse \"app\"");
    System.out.println("Aqui citaremos alguns dos comandos e estruturas básicas, sobre como funcionam: Scanner, void, e estruturaçao que utilizo.");
    System.out.println("Alguns eu citarei de forma rápida, já que sao comandos básicos e que no momento nao iremos altera-lo e portanto nao é necessario mexer e aprender tanto a respeito deles agora.");
    System.out.println();
    System.out.println("bom vamos lá, pressione qualquer tecla para que possamos continuar para o primeiro tema");
    @SuppressWarnings("unused")
    char continuando = entrada.next().charAt(0);
    System.out.println(clear);
    System.out.println(ANSI_BLUE + "1. Scanner" + ANSI_RESET);
    System.out.println("Scanner é um comando básico que utilizamos para que o usuario possa digitar algo no terminal, aquilo que é digitado normalmente é utilizado pelo computador para verificar ou armazenar como uma variante");
    System.out.println("Vale ressaltar que esse é um  comando básico que está presente em quase todo tipo de programa e app, aqui mesmo, nesse app, acredito que um dos comandos que ele mais possui seja justamente o scanner");
    System.out.println("isso porque ele é utilizado para muita coisa, desde declarar variaveis como confirmar itens do usuario, como agora em que você precisou pressionar uma tecla para que pudesse continuar, pois é, isso é um scanner, um Scanner salvo em char (que veremos melhor nas variaveis)");
    System.out.println();
    System.out.println("o Scanner serve para armazenar aquilo que é digitado pelo usuario, portanto se queremos que o usuario digite um numero inteiro, usamos int, se for uma frase usamos String, se for um decimal usamos double e se for um algarismo ou palavra somente usamos o char, verás isso melhor no próximo tema, nas variaveis.");
    System.out.println("aqui só veremos sua estrutura, sendo ela:");
    System.out.println(ANSI_GREEN);
    System.out.println("Import java.util.Scanner; (fora do public class, portanto fora de qualquer chave {})");
    System.out.println("Scanner nome do scanner = new Scanner(System.in)");
    System.out.println(ANSI_RESET);
    System.out.println("E quando formos utilizar o scanner, precisamos colocar o nome dele no comando, por exemplo, quando o usuario tiver que escrever um NUMERO INTEIRO, faremos assim:");
    System.out.println(ANSI_GREEN);
    System.out.println("int exemplo = nome do scanner.nextInt();");
    System.out.println(ANSI_RESET);
    System.out.println("dessa forma, o número que for escrito dentro desse scanner pelo usuario, será armazenado dentro da variavel e posteriormente poderá ser utilizado em algum comando especifico ou algo do tipo");
    System.out.println("obs: Scanner deve ser fechado, colocando o comando nome do scanner.close() antes do fim do código, nao atrapalha em nada o código, mas é recomendado para que ele fique mais agradavel e organizado");
    System.out.println();
    System.out.println("Pressione qualquer tecla para que possamos continuar");
    @SuppressWarnings("unused")
    char continuando1 = entrada.next().charAt(0); 

    System.out.println(clear);
    System.out.println(ANSI_BLUE + "2. Void " + ANSI_RESET);
    System.out.println();
    System.out.println("utilizamos o comando void apenas no incio de um novo arquivo (geralmente ele já vem pronto, porém em alguns casos precisamos cria-lo)");
    System.out.println("SIM, ele é extremamente importante, até porque é justamente dentro dele que iniciaremos a escrita e faremos todo o code do programa e do arquivo");
    System.out.println("A estrutura dele é bem simples, isso porque usamos apenas uma string para criar sua estrutura, sendo ela:");
    System.out.println(ANSI_GREEN);
    System.out.println("   public static void NOMEDOVOIDAQUI (String[] args){");
    System.out.println("   Aqui você digitará todo o seu código e tudo que você irá programar ficará aqui dentro");
    System.out.println("}");
    System.out.println(ANSI_RESET);
    System.out.println("Essa é a estrutura, vale lembrar que o nome que você colocar no void dev e ser diferente do nome que você colocar no arquivo e esse nome será usado para outras coisas no futuro dependendo do que está programando");
    System.out.println("por exemplo, esse app possui diversos arquivos, que eu utilizo justamente do nome do void deles para poder executar um atrás do outro enquanto você executa, portanto você começa no arquivo Main, ao selecionar um item você vai para o arquivo correspondente, por exemplo");
    System.out.println("Se você está lendo isso agora é porque você escolheu o item 1 na tela inicial, o computador te redirecionou para o arquivo chamado Basico, na linha 57 e utilizando o void desse arquivo o computador está lendo tudo que está contido nele");
    System.out.println("esse é o comando básico e essencial para que possamos criar e codar, afinal, ele que executa e roda os nossos comando até agora, nao vimos e estudamos nada que esteja fora dele.");
    System.out.println();
    System.out.println("Pressione qualquer tecla para continuarmos"); 
    @SuppressWarnings("unused")
    char continuando2 = entrada.next().charAt(0);

    System.out.println(clear);
    System.out.println(ANSI_BLUE + "3. MINHA estruturaçao" + ANSI_RESET);
    System.out.println();
    System.out.println(ANSI_RED + "Antes de começarmos as explicaçoes e exemplos aqui, devo alertar que essa é a forma que EU PARTICULARMENTE gosto de estruturar e montar o inicio de meus code, utilizando algumas coisas que utilizarei mais para frente e como eu gosto de montar cada arquivo, nao quer dizer que deve ser assim, apenas que eu gosto e prefiro fazer dessa forma, se voce nao curte, sem problemas, faça do jeito que voce achar melhor");
    System.out.println("dito isso, deseja continuar? (s/n)" + ANSI_RESET);
    String next = entrada.next();

    if(next.equalsIgnoreCase("s")){
        System.out.println(clear);
        System.out.println(ANSI_BLUE + "MINHA ESTRUTURA: "+ ANSI_RESET);
        System.out.println(ANSI_GREEN);
        System.out.println("package NOME DA PASTA QUE O CODE ESTÁ;");
        System.out.println("import java.util.Scanner;\n");
        System.out.println("public class NOME DO ARQUIVO {");
        System.out.println("  public static final String ANSI_GREEN = \"\\u001B[32m\";");
        System.out.println("  public static final String ANSI_RESET = \"\\u001B[0m\";");
        System.out.println("  public static final String ANSI_BLUE = \"\\u001B[34m\";");
        System.out.println("  public static final String ANSI_RED = \"\\u001B[31m\";\n");
        System.out.println("  public static void NOME DO VOID QUE ENSINEI ACIMA(String[] args) throws InterruptedException {");
        System.out.println("    Scanner entrada = new Scanner(System.in);");
        System.out.println("    String clear = \"\\033\\143\";");
        System.out.println(ANSI_RESET);
        System.out.println("Essa é a estrutura que eu utilizo na maior parte dos meus code, e aqui eu irei explicar item por item do que sao e para que servem, entao vamos lá");
        System.out.println("Nesse caso eu utilizo uma estrutura um pouco diferente daquela que está presente na maioria dos code, isso porque aqui eu estou utilizando alguns comandos que nao apresentei aqui e que o prof também nao aprensentou em sala, como sleep, ANSI_COLORS e a string clear");
        System.out.println("O comando " + ANSI_GREEN + "public static final String ANSI_GREEN" + ANSI_RESET + ", é utilizado para escrever elementos com cores distintas, cada cor possui um 'codigo', portanto eu declaro o código dentro dessa String para facilitar na troca de cores ao escrever uma frase e outra");
        System.out.println();
        System.out.println("O próximo comando que podemos ver é o comando String clear, um problema que tive quando comecei a fazer esse 'app' foi justamente o que fazer para poder limpar o terminal? afinal, imagine como ficaria o terminal depois de selecionar 8 opçoes, simplesmente caótico, entao como eu posso limpar o terminal?");
        System.out.println("foi ai que eu descobri o comando, basicamente quando o comando" + ANSI_GREEN  + "'\\033\\143\'" + ANSI_RESET + "é escrito dentro de um system.out.println(), ele apaga tudo aquilo que está escrito acima dele dentro do terminal, foi ai que eu tive a ideia de declarar ele como uma constante dentro do meu arquivo");
        System.out.println("isso porque, toda vez que eu fosse utilizar esse comando eu precisava ficar escrevendo o número dentro de um out.println, testando e etc, por isso eu coloco ele junto ao scanner, eu declaro e coloco o código dentro de uma variavel titulada como clear e só o que preciso fazer é digitar dentro do out.println o comando clear e ele automaticamente é reconhecido pelo terminal como comando de limpeza");
        System.out.println();
        System.out.println("Aqui também temos o comando" + ANSI_GREEN + "throws InterruptedException" + ANSI_RESET + ", que nao foi citado anteriormente quando expliquei do void, isso porque ele é um comando que ainda nao vimos em sala de aula, eu declaro ele ali junto ao void, pois é um comando que se faz necessário a declaraçao junto ao void, aqui nos meus code e arquivos ele tem servido unicamente para utilizar o comando sleep.");
        System.out.println(ANSI_GREEN + "thread.sleep(time)" + ANSI_RESET + ". que serve básicamente para que possamos colocar um crônometro de quanto tempo deve demorar para que o computador reconheça e leia a próxima string, utilizo ela normalmente para carregar o code em partes de mudança de páginas ou telas.");
        System.out.println();
        System.out.println("Para continuar, pressione qualquer tecla");
        @SuppressWarnings("unused")
        char continuando3 = entrada.next().charAt(0);

        System.out.println(clear);
        System.out.println("Básicamente é isso que deve ser dito e comentado a respeito das estruturas básicas, aqui nao temos muito o que dizer por ser o básico do básico do java, que será obrigatório em todos os code praticamente, mas que por si só entedemos de forma rápida com algumas poucas utilizaçoes");
        System.out.println("Enfim, pressione novamente qualquer tecla para que possamos retornar a tela de inicio, se tiver alguma dúvida, basta retornar usando o número correspondente da lista");
        @SuppressWarnings("unused")
        char continuando4 = entrada.next().charAt(0);
        Main.main(null);

    } else {
        System.out.println(clear);
        System.out.println(ANSI_RED + "Retornanando a tela inicial, agurde alguns segundos por favor..."  );
        Thread.sleep(1500);
        Main.main(null);
    }    entrada.close();
  }
}
