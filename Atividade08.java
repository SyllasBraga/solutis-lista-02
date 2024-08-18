import java.util.Scanner;

public class Atividade08 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String palavra = sc.nextLine();
        palavra.toLowerCase();
        String palavraInvertida = "";
        for (int i=palavra.length()-1; i>=0; i--){
            palavraInvertida += palavra.charAt(i);
        }
        if (palavraInvertida.equals(palavra)){
            System.out.println("Pode ser lida da direira para esquerda");
        }else{
            System.out.println("Não pode ser lida da direira para esquerda");
        }
    }
}
