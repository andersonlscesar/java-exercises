import java.util.Scanner;

public class Exercicio022 {


    /**
     * Write a Java program to convert a binary number to a decimal number.
     * Input Data:
     * Input a binary number: 100
     * Expected Output
     *
     * Decimal Number: 4
     * */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe um número binário: ");
        String binaryNumber = sc.nextLine();

        if (!binaryNumber.matches("^[01]+$")) {
            throw new IllegalArgumentException("O valor informado não está na base binária");
        }

        int binaryNumberInt = Integer.parseInt(binaryNumber, 2);
        String decimal = Integer.toString(binaryNumberInt);
        System.out.println(Integer.parseInt(decimal, 10));


        sc.close();
    }
}
