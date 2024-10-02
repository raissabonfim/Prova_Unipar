

import java.util.Scanner;

public class AvaliacaoFilmes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos filmes deseja avaliar? ");
        int quantidade = sc.nextInt();

        double[] avaliacoes = new double[quantidade];

        for (int i = 0; i < quantidade; i++){
            double nota;
            do {
                System.out.println("Avalie o filme" + (i + 1) + " (0 a 10): ");
                nota = sc.nextDouble();
                if (nota < 0 || nota > 10) {
                    System.out.println("Nota Inválida! A nota deve estar entre 0 e 10: ");
                }
            }while (nota < 0 || nota > 10);
            avaliacoes[i] = nota;

        }

        double soma = 0;
        int bons = 0, ruins = 0;
        for (double nota : avaliacoes) {
            soma += nota;
            if (nota >= 6){
                bons++;
            }else {
                ruins++;
            }
        }
        double media = soma / quantidade;
        System.out.println("\n Média das avaliações: " + media);
        System.out.println("\n Quantidade de filmes avaliados como bons (nota >= 6): " + bons);
        System.out.println("\n Quantidade de filmes avaliados como ruins (nota >= 6): " + ruins);

        sc.close();

    }
}
