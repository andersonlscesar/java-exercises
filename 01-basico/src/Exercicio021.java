import java.util.Scanner;

public class Exercicio021 {

    /**
     * 21. Decimal to Octal Converter
     *
     * Write a Java program to convert a decimal number to an octal number.
     * Input Data:
     * Input a Decimal Number: 15
     * Expected Output
     *
     * Octal number is: 17
     * */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe um número decimal: ");
        int decimal = sc.nextInt();
        String octal = Integer.toOctalString(decimal);
        System.out.println(octal);
        sc.close();
    }
}
