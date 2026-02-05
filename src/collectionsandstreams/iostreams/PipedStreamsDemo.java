package collectionsandstreams.ioStreams;

import java.io.*;

/**
 * One thread writes data into PipedOutputStream and another thread reads from PipedInputStream,
 * demonstrating inter-thread communication with proper synchronization.
 */
public class PipedStreamsDemo {
    public static void main(String[] args) {
        try {
            // Create connected pipe streams (must be used by different threads)
            PipedOutputStream pos = new PipedOutputStream();
            PipedInputStream pis = new PipedInputStream(pos);

            // Thread that writes lines into the pipe
            Thread writer = new Thread(() -> {
                try (PrintWriter pw = new PrintWriter(pos, true)) {
                    String[] messages = { "Hello", "from", "writer", "thread", "!" };
                    for (String msg : messages) {
                        pw.println(msg);
                    }
                }
            });

            // Thread that reads lines from the pipe
            Thread reader = new Thread(() -> {
                try (BufferedReader br = new BufferedReader(new InputStreamReader(pis))) {
                    String line;
                    System.out.print("Reader received: ");
                    while ((line = br.readLine()) != null) {
                        System.out.print(line + " ");
                    }
                    System.out.println();
                } catch (IOException e) {
                    if (!e.getMessage().contains("Pipe closed")) {
                        System.err.println("Reader error: " + e.getMessage());
                    }
                }
            });

            // Start reader first so it is ready when writer sends data
            reader.start();
            writer.start();

            writer.join();
            pos.close();
            reader.join();
        }
        // Handle pipe connection or thread errors
        catch (IOException | InterruptedException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}
