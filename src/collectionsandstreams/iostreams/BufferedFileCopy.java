package collectionsandstreams.ioStreams;

import java.io.*;

/**
 * Copies a file using BufferedInputStream/BufferedOutputStream with 4KB chunks,
 * measures execution time with System.nanoTime(), and compares with unbuffered streams.
 */
public class BufferedFileCopy {
    private static final int CHUNK_SIZE = 4096; // 4 KB

    public static void main(String[] args) {
        String source = "src/collecctionsandstreams/ioStreams/sample_large.txt";
        String destBuffered = "src/collecctionsandstreams/ioStreams/copy_buffered.txt";
        String destUnbuffered = "src/collecctionsandstreams/ioStreams/copy_unbuffered.txt";

        // Copy using buffered streams and measure time
        long startBuffered = System.nanoTime();
        copyWithBufferedStreams(source, destBuffered);
        long timeBuffered = System.nanoTime() - startBuffered;

        // Copy using unbuffered streams and measure time
        long startUnbuffered = System.nanoTime();
        copyWithUnbufferedStreams(source, destUnbuffered);
        long timeUnbuffered = System.nanoTime() - startUnbuffered;

        // Print comparison
        System.out.println("Buffered streams (4KB chunks): " + (timeBuffered / 1_000_000) + " ms");
        System.out.println("Unbuffered streams (4KB chunks): " + (timeUnbuffered / 1_000_000) + " ms");
        System.out.println("Buffered was " + (timeUnbuffered / Math.max(1, timeBuffered)) + "x faster (approx).");
    }

    /**
     * Copies file using BufferedInputStream and BufferedOutputStream in 4KB chunks.
     */
    static void copyWithBufferedStreams(String sourcePath, String destPath) {
        try (BufferedInputStream in = new BufferedInputStream(new FileInputStream(sourcePath));
             BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream(destPath))) {
            byte[] buffer = new byte[CHUNK_SIZE];
            int bytesRead;
            // Read up to CHUNK_SIZE bytes at a time and write to output
            while ((bytesRead = in.read(buffer)) != -1) {
                out.write(buffer, 0, bytesRead);
            }
            out.flush();
        } catch (IOException e) {
            System.err.println("Buffered copy error: " + e.getMessage());
        }
    }

    /**
     * Copies file using plain FileInputStream and FileOutputStream in 4KB chunks (unbuffered).
     */
    static void copyWithUnbufferedStreams(String sourcePath, String destPath) {
        try (FileInputStream in = new FileInputStream(sourcePath);
             FileOutputStream out = new FileOutputStream(destPath)) {
            byte[] buffer = new byte[CHUNK_SIZE];
            int bytesRead;
            // Read up to CHUNK_SIZE bytes at a time and write to output
            while ((bytesRead = in.read(buffer)) != -1) {
                out.write(buffer, 0, bytesRead);
            }
            out.flush();
        } catch (IOException e) {
            System.err.println("Unbuffered copy error: " + e.getMessage());
        }
    }
}
