import java.util.Scanner;

public class Atividade10 {
    public static void main(String[] args) {
        int[] cont = {0, 0, 0};
        Scanner sc = new Scanner(System.in);
        String cadeiaCaracteres = sc.nextLine();
        for (int i = 0; i < cadeiaCaracteres.length(); i++) {
            if (validaVogal(cadeiaCaracteres.charAt(i))) {
                cont[0]++;
            } else if (Character.isWhitespace(cadeiaCaracteres.charAt(i))) {
                cont[1]++;
            } else if (Character.isLetter(cadeiaCaracteres.charAt(i))) {
                cont[2]++;
            }
        }
        System.out.println("Vogais: "+cont[0]+"\nEspaços em branco: "+cont[1]+"\nConsoantes: "+cont[2]);
    }

    private static boolean validaVogal(char caracter) {
        String[] vogais = {"a", "e", "i", "o", "u", "y"};
        for (int j = 0; j < vogais.length; j++) {
            if (caracter == vogais[j].charAt(0)) {
                return true;
            }
        }
        return false;
    }
}
