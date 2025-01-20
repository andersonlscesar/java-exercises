import java.util.Scanner;

public class Exercicio017 {

    public static void main(String[] args) {

        /**
         * Write a Java program to add two binary numbers.
         * Input Data:
         * Input first binary number: 10
         * Input second binary number: 11
         * Expected Output
         *
         * Sum of two binary numbers: 101
         * */

        Scanner sc = new Scanner(System.in);

        System.out.println("Insira o primeiro valor binário: ");
        String input1 = sc.nextLine();
        System.out.println("Insira o segundo valor binário: ");
        String input2 = sc.nextLine();

        if (!input1.matches("^[01]+$") || !input2.matches("^[01]+$")) {
            throw new IllegalArgumentException("os valores inseridos não correspondem a números binários");
        }
        // convertendo para binários
        int binary1 = Integer.parseInt(input1, 2);
        int binary2 = Integer.parseInt(input2, 2);
        int sum = binary1 + binary2;
        String binarySum = Integer.toBinaryString(sum);
        System.out.println(binarySum);

        sc.close();
    }
}
