public class Atividade07 {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            if (i%3 == 0) {
                int resultadoInt = i / 2;
                float resultadoFloat = i / 2.0f;
                System.out.println("Inteiro: " + i + " / " + 2 + " = " + resultadoInt);
                System.out.println("Float:   " + i + " / " + 2 + " = " + resultadoFloat);
            }
        }
    }
}
