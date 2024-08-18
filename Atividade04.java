import java.util.Scanner;

public class Atividade04 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double milhas = sc.nextDouble();
        double milhasParaQuilometros = 1.609;
        double quilometros = milhas * milhasParaQuilometros;
        System.out.println("Valor de milhas para quilômetros: "+ quilometros +"kms");
    }
}
