public class Atividade06 {
    public static void main(String[] args){
        for (int i =15; i<=30; i++){
            for (int j=15; j<=30; j++){
                if (i%2 != 0 && j%2 != 0){
                    int produtoInt = i*j;
                    float produtoFloat = i*j;
                    System.out.println("Inteiro: " +i + " * " + j + " = "+produtoInt);
                    System.out.println("Float:   " +i + " * " + j + " = "+produtoFloat);
                }
            }
        }
    }
}
