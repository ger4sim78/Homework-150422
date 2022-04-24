import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Paragraph {

    public static void main(String[] args) {
        int num = 1;
        List<String> strings = new ArrayList<>();
        try {
            BufferedReader reader = new BufferedReader(new FileReader("poem.txt"));

            while (reader.ready()) {
                strings.add(reader.readLine());
            }
            BufferedWriter writer = new BufferedWriter(new FileWriter("part" + num + ".txt"));
            for (String s : strings) {
                if (s.isEmpty()) {
                    num++;
                    writer.close();
                    writer = new BufferedWriter(new FileWriter("part" + num + ".txt"));
                } else {
                    writer.write(s + "\n");
                    writer.flush();
                }
            }


        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
