import java.util.Scanner;

public class Exercicio006 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Primeiro valor: ");
        int n1 = sc.nextInt();
        System.out.println("Segundo valor: ");
        int n2 = sc.nextInt();
        int sum = n1 + n2;
        int mult = n1 * n2;
        int sub = n1 - n2;
        int div = n1 / n2;

        System.out.println("Sum: " + sum);
        System.out.println("Mult: " + mult);
        System.out.println("Sub: " + sub);
        System.out.println("Div: " + div);

        sc.close();

    }
}
