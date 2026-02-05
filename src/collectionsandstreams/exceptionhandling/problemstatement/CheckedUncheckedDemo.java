package collectionsandstreams.exceptionhandling.problemstatement;

import java.io.*;

public class CheckedUncheckedDemo {
    static void processData(String path) throws IOException {
        if (path == null)
            throw new NullPointerException("Path is null");
        BufferedReader br = new BufferedReader(new FileReader(path));
        br.readLine();
        br.close();
    }

    public static void main(String[] args) {
        try {
            processData(null);
        } catch (IOException e) {
            System.out.println("Checked exception handled");
        } catch (NullPointerException e) {
            System.out.println("Unchecked exception handled");
        }
    }
}
