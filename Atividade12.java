import java.util.Scanner;

public class Atividade12 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String condicao = "";
        int quilometragemTotal = 0;
        int litrosCombustivelTotal = 0;
        while(!condicao.equals("pare")) {
            System.out.print("Digite os kms percorridos: ");
            int quilometros = sc.nextInt();
            sc.nextLine();

            System.out.print("Digite os listros de combustível consumido: ");
            int litrosCombustivel = sc.nextInt();
            sc.nextLine();

            float mediaConsumo = (float) quilometros / litrosCombustivel;
            quilometragemTotal += quilometros;
            litrosCombustivelTotal += litrosCombustivel;

            System.out.println("Consumo médio: "+ mediaConsumo+ "km/l\nTotal de quilômetros rodados: "+
                    quilometragemTotal + "kms\nTotal de combustível consumido: "+ litrosCombustivelTotal + "l");

            System.out.println("Digite 'pare' para sair ou pressione 'enter' para continuar");
            condicao = sc.nextLine();
        }
    }
}
