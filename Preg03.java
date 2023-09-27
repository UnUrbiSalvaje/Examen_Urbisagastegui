import java.util.Scanner;
public class Preg03 {
    public static void main(String[] args) {
              Scanner teclado = new Scanner(System.in);
        int horas, total;
        System.out.print("Cantidad de horas en el estacionamiento:");
    horas = Integer.valueOf(teclado.nextLine()); 
    if (horas<=4){
        System.out.println("Pagaras 6 soles!");
    }else if (horas>4){
        total = (horas - 4)*2 + 6;
        System.out.println("Pagaras en total con soles: "+total);
    }
    teclado.close();
    }
    }
