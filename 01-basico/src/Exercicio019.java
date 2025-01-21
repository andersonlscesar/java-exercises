import java.util.Scanner;

public class Exercicio019 {

    /**
     * Write a Java program to convert an integer number to a binary number.
     * Input Data:
     * Input a Decimal Number : 5
     * Expected Output
     *
     * Binary number is: 101
     * */

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Informe um número inteiro: ");
        int number = sc.nextInt();
        String binary = Integer.toBinaryString(number);
        System.out.println(binary);
        sc.close();
    }

}


