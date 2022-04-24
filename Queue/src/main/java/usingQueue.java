import java.io.*;
import java.util.*;
import java.util.concurrent.TimeUnit;

public class usingQueue {
    public static void main(String[] args) {
        int num = 1;
        Queue<String> strings = new LinkedList<>();
        try {
            BufferedReader reader = new BufferedReader(new FileReader("poem.txt"));

            while (reader.ready()) {
                strings.add(reader.readLine());
            }

            for (String s : strings) {
                System.out.println(s);
                TimeUnit.SECONDS.sleep((int) (Math.random() * 3) + 1);
            }


        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }
}
