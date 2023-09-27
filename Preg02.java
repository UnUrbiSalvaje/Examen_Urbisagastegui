import java.util.Scanner;

public class Preg02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese un valor para 'n': ");
        int n = scanner.nextInt();
        
        // Calcula la suma de los primeros 'n' números naturales
        int suma = (n * (n + 1)) / 2;
        
        System.out.println("La suma de los primeros " + n + " números naturales es: " + suma);
        
        scanner.close();
    }
}
