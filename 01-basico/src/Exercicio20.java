import java.util.Scanner;
import java.util.Locale;

public class Exercicio20 {

    /**
     * Write a Java program to convert a decimal number to a hexadecimal number.
     * Input Data:
     * Input a decimal number: 15
     * Expected Output
     *
     * Hexadecimal number is : F
     * */

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe um número decimal");
        int number = sc.nextInt();
        String hexa = Integer.toHexString(number);
        System.out.println(hexa.toUpperCase());
        sc.close();
    }
}
