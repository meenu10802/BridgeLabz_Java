package collectionsandstreams.ioStreams;

import java.io.*;

/**
 * Converts an image file into a byte array using ByteArrayOutputStream,
 * then writes it back to another file using ByteArrayInputStream, and verifies identity.
 */
public class ImageToByteArray {
    public static void main(String[] args) {
        String sourcePath = "src/collecctionsandstreams/ioStreams/sample.png";
        String destPath = "src/collecctionsandstreams/ioStreams/sample_copy.png";

        try {
            // Read image into byte array
            byte[] imageBytes = readImageToByteArray(sourcePath);
            System.out.println("Read " + imageBytes.length + " bytes from " + sourcePath);

            // Write byte array back to new file
            writeByteArrayToImage(imageBytes, destPath);
            System.out.println("Written to " + destPath);

            // Verify both files are identical
            boolean identical = verifyFilesIdentical(sourcePath, destPath);
            System.out.println("Files identical: " + identical);
        }
        // Handle file not found or read/write errors
        catch (IOException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }

    /**
     * Reads entire file into a byte array via ByteArrayOutputStream.
     */
    static byte[] readImageToByteArray(String path) throws IOException {
        try (FileInputStream fis = new FileInputStream(path);
             ByteArrayOutputStream baos = new ByteArrayOutputStream()) {
            byte[] buffer = new byte[4096];
            int len;
            // Copy all bytes from file into in-memory byte array
            while ((len = fis.read(buffer)) != -1) {
                baos.write(buffer, 0, len);
            }
            return baos.toByteArray();
        }
    }

    /**
     * Writes byte array to file using ByteArrayInputStream as source.
     */
    static void writeByteArrayToImage(byte[] data, String path) throws IOException {
        try (ByteArrayInputStream bais = new ByteArrayInputStream(data);
             FileOutputStream fos = new FileOutputStream(path)) {
            byte[] buffer = new byte[4096];
            int len;
            // Read from byte array and write to file
            while ((len = bais.read(buffer)) != -1) {
                fos.write(buffer, 0, len);
            }
            fos.flush();
        }
    }

    /**
     * Compares two files byte-by-byte to verify they are identical.
     */
    static boolean verifyFilesIdentical(String path1, String path2) throws IOException {
        try (FileInputStream f1 = new FileInputStream(path1);
             FileInputStream f2 = new FileInputStream(path2)) {
            byte[] b1 = new byte[4096];
            byte[] b2 = new byte[4096];
            int n1, n2;
            // Compare chunks; lengths and content must match
            while (true) {
                n1 = f1.read(b1);
                n2 = f2.read(b2);
                if (n1 != n2) return false;
                if (n1 == -1) return true;
                for (int i = 0; i < n1; i++) {
                    if (b1[i] != b2[i]) return false;
                }
            }
        }
    }
}
