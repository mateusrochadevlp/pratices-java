public class Main {
    public static void main(String[] args) {
        // Imprimindo o nome do curso
        System.out.println("Mateus Batista");
        System.out.println("Sistemas para Internet");

        // Crie variáveis String nome, int idade e double altura,
        // e imprima uma frase com elas, tipo: "Mateus tem 20 anos e 1.75 m".

        String nome = "Mateus";
        int idade = 21;
        double altura = 1.80;
        System.out.println("Seu nome é: "+ nome  + " você possui "+ idade  + " anos, e tem "  + altura);

        //Troque o valor de duas variáveis
        // int a e int b entre si (use uma terceira variável auxiliar).

        int a = 10;
        int b = 5;
        int c = a;
        a = b;
        b = c;

        System.out.println(a);
        System.out.println(b);

        // Nível 2: operações e condicionais
        // ---------- Exercício 4 ----------
        // Crie três notas (double nota1, nota2, nota3),
        // calcule a média e imprima o resultado.
        // Atenção à ordem das operações.

        double nota1 = 7.5;
        double nota2 = 8.0;
        double nota3 = 6.0;

        int quantidadeDeNotas = 3;
        // ----> O java executa a divisão primeiro e a soma depois, por isso coloquei parenteses
        double media = (nota1 + nota2 + nota3) / quantidadeDeNotas;

        System.out.println("Sua nota: " + media);

        // ---------- Exercício 5 ----------
        // Dado um número inteiro, imprima se ele é par ou ímpar.
        // Dica: use o operador % (resto da divisão).

        int numeroInteiro = 10;
        if (numeroInteiro % 2 == 0) {
            System.out.println("Numero par");
        }
        else {
            System.out.println("Numero impar");
        }

        // ---------- Exercício 6 ----------
        // Usando a média do exercício 4, imprima:
        //   "Aprovado"    se a média for 7 ou mais
        //   "Recuperação" se for de 5 a 6.9
        //   "Reprovado"   se for menor que 5
        // Dica: use if, else if e else.

        if (media >= 7) {
            System.out.println("Aprovado");
        }
        else if (media >= 5) {
            System.out.println("Recuperação");
        }
        else {
            System.out.println("Reprovado");
        }

        // ---------- Exercício 7 ----------
        // Imprima os números de 1 a 10 usando for.

        for (int i = 0; i <= 10; i++){
            System.out.println(i);
        }


        // ---------- Exercício 8 ----------
        // Imprima a tabuada de um número qualquer (por exemplo, a do 7).
        // Formato: 7 x 1 = 7, 7 x 2 = 14, ...
        System.out.println("Vai tomando na tabuada");
        int tabuada = 7;
        for (int i = 0; i <= 10; i ++){
             System.out.println("7 X " + i + "= " + tabuada * i);
        }

        // ---------- Exercício 9 ----------
        // Some todos os números de 1 a 100 e imprima o total.
        // Dica: crie uma variável acumuladora antes do laço.

        int soma = 0;
        for (int i = 0; i <= 100; i++) {
            soma = soma + i;
            System.out.println(soma);
        }
    }
    // ---------- Exercício 10 ----------
    // Crie um metodo int dobro(int n) que retorna o dobro de um número
    // e chame ele no main.
    public static int dobro(int n) {
        return n * 2;
    }

    // ---------- Exercício 11 ----------
    // Crie um methods boolean ehPar(int n) e use ele no exercício 5.
    public static boolean ehPar(int n){
        if (n % 2 == 0) {
            return true;
        }
        else {
            return false;
        }
    }

    // ---------- Exercício 12 ----------
    // Crie um metodo que recebe 3 notas e retorna a média.

    public static double media(double a, double b, double c){
        double valor = (a + b + c) / 3;
        return valor;
    }
}