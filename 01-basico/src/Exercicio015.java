public class Exercicio015 {

    //Write a Java program to swap two variables.

    public static void main(String[] args) {
        int a, b, temp;
        a = 15;
        b = 27;

        System.out.println("Antes : " + a + " " + b);

        temp = a;
        a = b;
        b = temp;

        System.out.println("Depois : " + a + " " + b);



    }
}
