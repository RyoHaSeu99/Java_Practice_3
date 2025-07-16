import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void writeFile(String filename, String content) {
        try (FileWriter writer = new FileWriter(filename)) {
            writer.write(content);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args) throws Exception {
        writeFile("example.txt", "Hello, Java I/O\nThis is test.");
        System.out.println("파일 생성 완료");
    }
}