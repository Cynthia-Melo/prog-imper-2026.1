import java.util.Scanner;

public class VetorSemRepeticao {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int[] vetor = new int[10];

        for (int i = 0; i < 10; i++) {

            int numero;
            boolean repetido;

            do {
                repetido = false;

                System.out.print("Digite o número da posição " + i + ": ");
                numero = input.nextInt();

                for (int j = 0; j < i; j++) {
                    if (vetor[j] == numero) {
                        repetido = true;
                        System.out.println("Número repetido! Digite outro número.");
                        break;
                    }
                }

            } while (repetido);

            vetor[i] = numero;
        }

        System.out.println("\nVetor final:");

        for (int i = 0; i < 10; i++) {
            System.out.print(vetor[i] + " ");
        }
    }
}
