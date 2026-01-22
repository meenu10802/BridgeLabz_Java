package datastructure.algorithmsruntimeanalysis;

/*
 This class demonstrates performance differences between character-based and byte-based file reading techniques.
 It evaluates their efficiency when processing large files to understand scalability behavior.
 */
class FileReadingEfficiency {

    // Reads file character by character (less efficient for large files)
    static void usingFileReader(String path) throws Exception {
        java.io.FileReader fr = new java.io.FileReader(path);
        while (fr.read() != -1) {
            // reading characters
        }
        fr.close();
    }

    // Reads file using byte stream with character conversion (more efficient)
    static void usingBufferedStream(String path) throws Exception {
        java.io.BufferedReader br = new java.io.BufferedReader(
                new java.io.InputStreamReader(
                        new java.io.FileInputStream(path)));
        while (br.readLine() != null) {
            // reading lines
        }
        br.close();
    }

    // Main method to compare execution time
    public static void main(String[] args) throws Exception {

        String filePath = "src/datastructure/algorithmsruntimeanalysis/sample.txt";

        long startTime = System.currentTimeMillis();
        usingFileReader(filePath);
        long endTime = System.currentTimeMillis();
        System.out.println("FileReader Time: " + (endTime - startTime) + " ms");

        startTime = System.currentTimeMillis();
        usingBufferedStream(filePath);
        endTime = System.currentTimeMillis();
        System.out.println("InputStreamReader Time: " + (endTime - startTime) + " ms");
    }
}
