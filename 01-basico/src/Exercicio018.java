import java.util.Scanner;

public class Exercicio018 {

    /**
     *Write a Java program to multiply two binary numbers.
     * Input Data:
     * Input the first binary number: 10
     * Input the second binary number: 11
     * Expected Output
     *
     * Product of two binary numbers: 110
     * */

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o primeiro número em binário: ");
        String input1 = sc.nextLine();
        System.out.println("Informe o segundo número em binário: ");
        String input2 = sc.nextLine();

        if (!input1.matches("^[01]+$") ||!input2.matches("^[01]+$")) {
            throw new IllegalArgumentException("Os valores informados não estão em binário");
        }

        int binary1 = Integer.parseInt(input1, 2);
        int binary2 = Integer.parseInt(input2, 2);
        int mult = binary1 * binary2;
        String binaryResult = Integer.toBinaryString(mult);
        System.out.println(binaryResult);

        sc.close();
    }
}
