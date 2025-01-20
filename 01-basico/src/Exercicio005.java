import java.util.Scanner;

public class Exercicio005 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira o primeiro número: ");
        int n1 = sc.nextInt();
        System.out.println("Insira o segundo número: ");
        int n2 = sc.nextInt();

        System.out.println(n1 * n2);

        sc.close();
    }
}
