
    import java.util.Scanner;
    public class Preg04 {
         public static void main(String[] args) {
           Scanner teclado = new Scanner(System.in);
            int ganancia,total;
            System.out.print("La ganancia: ");
            ganancia = Integer.valueOf(teclado.nextLine());
            if (ganancia>5000 ){
                total = ganancia*15/100;
                System.out.println("Donaria en soles: "+total);
            }else if (ganancia>2000){
                total = ganancia*10/100;
                System.out.println("Donaria en soles: "+total);
            }else if (ganancia>1500){
                total = ganancia*8/100;
                System.out.println("Donaria en soles: "+total);
            }else if (ganancia>1000){
                total = ganancia*7/100;
                System.out.println("Donaria en soles: "+total);
            }else if (ganancia>=0){
                 total = ganancia*5/100;
            System.out.println("Donaria en soles: "+total);
            }
            teclado.close();
        }
    }