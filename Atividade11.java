import java.util.Scanner;

public class Atividade11 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String palavra1 = sc.nextLine();
        String palavra2 = sc.nextLine();

        if (palavra1.compareTo(palavra2) < 0) {
            System.out.println("Ordem alfabética: " + palavra1 + ", " + palavra2);
        } else {
            System.out.println("Ordem alfabética: " + palavra2 + ", " + palavra1);
        }

        if (palavra1.length() > palavra2.length()) {
            System.out.println("A palavra com o maior número de caracteres é: " + palavra1);
        } else if (palavra1.length() < palavra2.length()) {
            System.out.println("A palavra com o maior número de caracteres é: " + palavra2);
        } else {
            System.out.println("Ambas as palavras têm o mesmo número de caracteres.");
        }
    }
}
