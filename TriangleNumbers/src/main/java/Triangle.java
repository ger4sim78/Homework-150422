import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите ширину основания (целое положительное число):");
        int a = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < a; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print((j + 1));
            }
            System.out.println("");
        }
    }
}
