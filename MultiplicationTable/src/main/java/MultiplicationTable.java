public class MultiplicationTable {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                int result = (i + 1) * (j + 1);
                if (result < 10) {
                    System.out.print(result + "  ");
                }
                else System.out.print(result + " ");
            }
            System.out.println("");
        }
    }
}
