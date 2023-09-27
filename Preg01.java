
public class Preg01{
    public static void main(String[] args) {
        // Definir dos variables
        int A = 8;
        int B = 9;

        System.out.println("Antes del intercambio:");
        System.out.println("A = " + A);
        System.out.println("B = " + B);

        // Intercambiar los valores utilizando una variable temporal
        int temp = A;
        A = B;
        B = temp;

        System.out.println("Después del intercambio:");
        System.out.println("A = " + A);
        System.out.println("B = " + B);
    }
}
