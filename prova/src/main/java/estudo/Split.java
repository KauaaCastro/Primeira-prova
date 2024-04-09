package estudo;
import java.util.Scanner;


public class Split {
      public static final String ANSI_GREEN = "\u001B[32m";
      public static final String ANSI_RESET = "\u001B[0m";
      public static final String ANSI_BLUE = "\u001B[34m";
      public static final String ANSI_RED = "\u001B[31m";
      public static final String ANSI_CYAN = "\u001B[36m";

    public static void strsplit(String[] args) throws InterruptedException{
        Scanner entrada = new Scanner(System.in);
        String clear = "\033\143";
        boolean start = true;

        System.out.println(clear);
        System.out.println( ANSI_BLUE + "6- Split" + ANSI_RESET);
        System.out.println("Aqui falaremos a respeito do comando split, que nao é tao utilizado assim, ao menos até o momento, utilizamos ele para podermos dividir as Strings, de forma resumida, ele funciona como um parametro de separaçao");
        System.out.println("utilizamos ela para separar e podemos usa-la de duas formas, a forma sem parametros de separaçao, que seria bastante simples, o comando só irá separar o que estiver contido na variavel String");
        System.out.println("ou podemos definir um parametro para o split, dessa forma ele seguirá o parametró para poder diferenciar o que precisa separar, ou adicionar aquilo que você pedir entre um espaço e outro.");
        System.out.println("até o presente momento, eu utilizei ele somente 1 vez em um exercicio feito especialmente para ele, entao eu acredito que nao seja um comando que venha a ser utilizado com tanta frequência quanto os demais na lista, mas ainda sim, deve estar aqui");
        System.out.println();
        System.out.println("Pressione qualquer tecla para que possa continuar: ");
        @SuppressWarnings("unused")
        char x0 =  entrada.next().charAt(0);
        
        while (start) {
        System.out.println(clear);
        System.out.println("Qual método deseja ver primeiro?");
        System.out.println("1- Sem parametros de separaçao");
        System.out.println("2- Com parametros");
        System.out.println("3- Length");
        System.out.println("10- Retornar à tela inicial");
        int escolha = entrada.nextInt();

        if(escolha >= 1 || escolha <= 3 || escolha == 10){
            switch (escolha) {
                case 1:
                System.out.println(clear);
                System.out.println(ANSI_BLUE  + "1. Split" + ANSI_RESET);
                System.out.println();
                System.out.println("Em Java, o método split() é usado para dividir uma string em substrings com base em um delimitador especificado e retornar um array contendo essas substrings.");
                System.out.println();
                System.out.println("A assinatura do método split() é a seguinte:"); 
                System.out.println(ANSI_GREEN);
                System.out.println("String[] (nome da variavel) = (frase).split(\"**\")" + ANSI_RESET);
                System.out.println();
                System.out.println("Você pode simplificar ainda mais o processo de impressao das substrings sem usar um loop for usando o método Arrays.toString() para imprimir o array resultante do método split(). Aqui está como você pode fazer:");
                System.out.println(ANSI_GREEN + "public class Main {");
                System.out.println(" public static void main(String[] args) {");
                System.out.println(" String data = \"2024-04-09\";");
                System.out.println(" String[] partes = data.split(\"\"); // Dividindo a string de data usando o hífen como delimitador");
                System.out.println(" System.out.println(Arrays.toString(partes)); // Imprimindo o array de partes");
                System.out.println(" }");
                System.out.println("}" + ANSI_RESET);
                System.out.println("Neste exemplo, estamos dividindo a string" + ANSI_CYAN + "2024-04-09" + ANSI_RESET + "usando o hífen como delimitador e, em seguida, imprimindo o array resultante sem usar um loop for. O resultado será:" + ANSI_GREEN + "2024 04 09" +ANSI_RESET);
                System.out.println("Digite aqui uma frase para que possa ser utilizada de exemplo, vale lembrar que a frase será separada sem espaço e sem qualquer algarismo de separaçao de String ");
                String exemplo1 = entrada.nextLine();
                String[] partes1 = exemplo1.split("");
                System.out.println("você digitou" + exemplo1 + ANSI_RESET +"e sua separaçao foi: " + ANSI_GREEN + partes1 +ANSI_RESET);
                System.out.println("");
                System.out.println("Deseja continuar? (s/n)");
                String next = entrada.next();

                if(next.equalsIgnoreCase("n")){
                    System.out.println(clear);
                    System.out.println( ANSI_RED + "Retornando para a lista...");
                    Thread.sleep(1500);
                    break;

                } else if(next.equalsIgnoreCase("s")){

                } else {
                    System.out.println(ANSI_RED + "Você digitou algo que nao está na tabela acima, agurde reinicializaçao rápida" + ANSI_RESET );
                    Thread.sleep(1500);
                    Main.main(null);
                }

                case 2:
                System.out.println(clear);
                System.out.println(ANSI_BLUE + "2. Split: como adicionar parametros de separaçao" + ANSI_RESET);
                System.out.println();
                System.out.println("Para usar o método split() com parâmetros de separaçao, você precisa fornecer uma expressao regular como argumento para o método split().");
                System.out.println("Esta expressao regular define o padrao pelo qual a string será dividida. Aqui estao alguns exemplos de como você pode usar parâmetros de separaçao com o método split():");
                System.out.println("Pressione qualquer tecla para que possamos ver alguns exemplos de casos como esse: ");
                @SuppressWarnings("unused")
                char y0 = entrada.next().charAt(0);

                System.out.println(clear + ANSI_BLUE );
                System.out.println("2A- separando por espaço em branco");
                System.out.println(ANSI_RESET + ANSI_GREEN);
                System.out.println("String[] palavras = frase.split(\"\\\\s+\"); // O padrao \"\\\\s+\" corresponde a um ou mais espaços em branco");
                System.out.println();
                System.out.println(ANSI_RESET + "Pressione qualquer tecla para que possamos seguir para o próximo exemplo (1/4)");
                @SuppressWarnings("unused")
                char y1 = entrada.next().charAt(0);
                System.out.println(ANSI_BLUE);                
                System.out.println("2B- Separando por vírgula");
                System.out.println(ANSI_RESET + ANSI_GREEN);                
                System.out.println("String[] frutas = lista.split(\",\"); // O padrao \",\" corresponde à vírgula");
                System.out.println();
                System.out.println(ANSI_RESET + "Pressione qualquer tecla para continuar (2/4) ");
                @SuppressWarnings("unused")
                char y2 = entrada.next().charAt(0);
                System.out.println( ANSI_BLUE );
                System.out.println("2C- Separando por ponto e vírgula");
                System.out.println(ANSI_RESET + ANSI_GREEN);
                System.out.println("String[] info = dados.split(\";\"); // O padrao \";\" corresponde ao ponto e vírgula");
                System.out.println();
                System.out.println(ANSI_RESET + "Pressione qualquer tecla para que possamos continuar (3/4)");
                @SuppressWarnings("unused")
                char y3 = entrada.next().charAt(0);
                System.out.println( ANSI_BLUE);
                System.out.println("2D- Separar por ponto (utilizando uma barra de escape para String)");
                System.out.println(ANSI_RESET + ANSI_GREEN);
                System.out.println("String[] sentencas = frase.split(\"\\\\.\"); // O padrao \"\\\\.\" corresponde a um ponto");
                System.out.println();                
                System.out.println(ANSI_RESET + "Pressione qualquer tecla para que possamos continuar (4/4)");
                @SuppressWarnings("unused")
                char y4 = entrada.next().charAt(0);
                System.out.println();
                System.out.println("Nesses exemplos, as expressoes regulares sao usadas como parâmetros de separaçao para o método split().");
                System.out.println("Lembre-se de que em Java, a barra invertida (\\) é usada como um caractere de escape dentro de strings, entao para representar corretamente certos padroes em expressoes regulares, você precisa usar duas barras invertidas (\\\\).");
                System.out.println("Por exemplo, \\\\s representa um espaço em branco, \\\\. representa um ponto, \\\\+ representa um ou mais ocorrências do caractere anterior, e assim por diante.");
                System.out.println();
                System.out.println("Deseja seguir para o próximo método de uso desse comando? (s/n)");
                String next2 = entrada.next();

                if(next2.equalsIgnoreCase("s")){

                } else if (next2.equalsIgnoreCase("n")){
                    System.out.println(ANSI_RED + "Retornando para a lista..." + ANSI_RESET);
                    Thread.sleep(1500);
                    break;
                } else {
                    System.out.println(clear + ANSI_RED + "Erro...");
                    System.out.println("Você digitou algo que nao está nas opçoes, redirecionando para a tela inicial..." + ANSI_RESET);
                    Thread.sleep(1500);
                    Main.main(null);
                }
            
                case 3: 
                System.out.println( clear + ANSI_BLUE + "3. Length");
                System.out.println(ANSI_RESET);
                System.out.println("O método length é usado para obter o tamanho de um array em Java. Ele retorna o número de elementos no array. Aqui está como você pode usar o comando length:");
                System.out.println(ANSI_BLUE);
                System.out.println("Exemplo 1: Obtendo o tamanho de um array de strings:" + ANSI_RESET + ANSI_GREEN);
                System.out.println();
                System.out.println("String[] nomes = {\"Ana\", \"Joao\", \"Maria\", \"Pedro\"};");
                System.out.println("int tamanho = nomes.length; // O tamanho do array nomes é 4");
                System.out.println("System.out.println(\"O tamanho do array nomes é: \" + tamanho);");
                System.out.println( ANSI_RESET + "");
                System.out.println("Pressione qualquer tecla para que possamos continuar (1/3)");
                @SuppressWarnings("unused")
                char z1 = entrada.next().charAt(0);

                System.out.println(ANSI_BLUE);
                System.out.println("Exemplo 2: Obtendo o tamanho de um array de inteiros:" + ANSI_RESET + ANSI_GREEN);
                System.out.println();
                System.out.println("int[] numeros = {10, 20, 30, 40, 50};");
                System.out.println("int tamanho = numeros.length; // O tamanho do array numeros é 5");
                System.out.println("System.out.println(\"O tamanho do array numeros é: \" + tamanho);");
                System.out.println(ANSI_RESET);
                System.out.println("Pressione qualquer tecla para que possamos continuar (2/3)");
                @SuppressWarnings("unused")
                char z2 = entrada.next().charAt(0);
                System.out.println(ANSI_BLUE);
                System.out.println("Exemplo 3: Iterando sobre um array usando o tamanho:" + ANSI_RESET + ANSI_GREEN);
                System.out.println();
                System.out.println("double[] valores = {3.14, 2.718, 1.618, 1.414};");
                System.out.println("for (int i = 0; i < valores.length; i++) {");
                System.out.println("    System.out.println(\"Valor na posiçao \" + i + \": \" + valores[i]);");
                System.out.println("}");
                System.out.println(ANSI_RESET);
                System.out.println("Pressione qualquer tecla para que possamos continuar (3/3)");
                @SuppressWarnings("unused")
                char z3 = entrada.next().charAt(0);
                System.out.println();
                System.out.println("Neste exemplo, valores.length é usado para determinar o número de iteraçoes no loop. Isso garante que todas as posiçoes do array sejam acessadas sem ultrapassar o limite do array.");
                System.out.println("Portanto, o método length é uma maneira conveniente de descobrir o tamanho de um array em Java e é frequentemente usado em iteraçoes sobre arrays.");
                System.out.println("");
                System.out.println("Pressione qualquer tecla para que possamos retornar a lista anterior: ");
                @SuppressWarnings("unused")
                char z4 = entrada.next().charAt(0);
                System.out.println(clear); 
                break;
                
                case 10:
                System.out.println(clear + ANSI_RED);
                System.out.println("Pressione qualquer tecla para que possamos te retornar à tela inicial");
                @SuppressWarnings("unused")
                char z5 = entrada.next().charAt(0);
                System.out.println(ANSI_RESET);
                Main.main(null);

                default:
                System.out.println(ANSI_RED);
                System.out.println("você digitou algo que nao está presente na lista, por favor repita o processo...");
                System.out.println(ANSI_RESET);
                Thread.sleep(1500);
                break;
            }


        }
    } entrada.close();

    }

}
