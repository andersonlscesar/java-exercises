import java.util.Scanner;
import java.util.Locale;

public class Exercicio012 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o primeiro número: ");
        double n1 = sc.nextDouble();
        System.out.println("Informe o segundo número: ");
        double n2 = sc.nextDouble();
        System.out.println("Informe o terceiro número: ");
        double n3 = sc.nextDouble();
        double average = (n1 + n2 + n3) / 3;

        System.out.println("Avegare: " + average);

        sc.close();
    }
}
