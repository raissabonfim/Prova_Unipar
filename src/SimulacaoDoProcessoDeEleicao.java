import java.util.Scanner;

public class SimulacaoDoProcessoDeEleicao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] candidatos = {"taffe", "Rodrigo", "Lucas", "Alessandro" };
        int[] votos = new int[4];

        System.out.println("Quantas pessoas irão votar? ");
        int quantidadeVotantes = sc.nextInt();

        for (int i = 0; i < quantidadeVotantes; i++) {
            System.out.println("\n Cantidatos: ");
            System.out.println("\n 99 - Taffe");
            System.out.println("\n 88 - Rodrigo");
            System.out.println("\n 77 - Lucas");
            System.out.println("\n 66 - Alessandro");

            int voto;
            do{
                System.out.println("Digite o N° correspondente ao candidato: ");
                voto = sc.nextInt()
;
            switch (voto){
                case 99:
                     votos[0]++;
                     break;
                case 88:
                    votos[1]++;
                    break;
                case 77:
                    votos[2]++;
                    break;
                case 66:
                    votos[3]++;
                    break;
                default:
                    System.out.println(" Número inválido! Digite novamente: ");
            }

            } while (voto != 99 && voto != 88 && voto != 77 && voto != 66);
            System.out.println("\n Resultado da eleição: ");

            for (int i1 = 0; i1 < candidatos.length; i1++) {
                System.out.println(candidatos[i1] + ": " + votos[i1] + "votos");
            }

            int maxVotos = 0;
            String vencedor = "";
            for (int i4 = 0; i4 < candidatos.length; i4++) {
                if (votos[i4] > maxVotos) {
                    maxVotos = votos[i4];
                    vencedor = candidatos[i4];

                }
            }

            System.out.println(" O vencedor é: " + vencedor);
            sc.close();

        }
    }
}
