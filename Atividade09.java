import java.util.Scanner;

public class Atividade09 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Double raio = sc.nextDouble();
        Double area = Math.PI * Math.pow(raio, 2);
        System.out.println("Valor da área: "+ Math.round(area));
    }
}
