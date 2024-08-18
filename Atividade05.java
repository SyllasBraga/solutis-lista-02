import java.util.Scanner;

public class Atividade05 {
    public static void main(String[] args){
        String[] dias = {"Domingo", "Segunda-feira", "Terça-feira", "Quarta-feira", "Quinta-feira", "Sexta-feira",
                "Sábado"};
        Scanner sc = new Scanner(System.in);
        int dia = 0;
        do{
            dia = sc.nextInt();
        }while(dia>7 || dia<1);
        System.out.println(dias[dia-1]);
    }
}
