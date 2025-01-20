

public class Exercicio013 {

    public static void main(String[] args) {
        final double width = 5.5;
        final double height = 8.5;
        double area = width * height;
        double  perimeter = 2 * (width + height);

        System.out.printf("Perimeter is 2*(%.1f + %.1f) = %.2f \n", height, width, perimeter);

        // Print the calculated area using placeholders for values
        System.out.printf("Area is: %.1f * %.1f = %.2f \n", width, height, area);

    }
}
