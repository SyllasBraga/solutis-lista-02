import java.util.Scanner;

public class Atividade03 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int numero = sc.nextInt();

        System.out.println("Numeros primos menores que " + numero + ":");
        for (int i = 2; i < numero; i++) {
            if (validaSeEPrimo(i)) {
                System.out.print(i + " ");
            }
        }
    }

    private static boolean validaSeEPrimo(int num) {
        if (num < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
