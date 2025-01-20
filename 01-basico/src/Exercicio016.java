public class Exercicio016 {

    public static void main(String[] args) {

        /*
        * Write a Java program to print a face.
        Expected Output

         +"""""+
        [| o o |]
         |  ^  |
         | '-' |
         +-----+
         *
        * */
        String[] faces = new String[5];

        faces[0] = " +\"\"\"\"\"+";
        faces[1] = "[| o o |]";
        faces[2] = " |  ^  |";
        faces[3] = " | '-' |";
        faces[4] = " +-----+";

        for (String face: faces ) {
            System.out.println(face);
        }


    }
}
