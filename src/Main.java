import java.nio.file.*;
import java.nio.channels.FileChannel;
import java.nio.ByteBuffer;
import java.io.IOException;

public class Main {
    public static void writeFile() {
        Path filePath = Paths.get("example.txt");
        String content = "Hello, NIO World!";

        try (FileChannel writeChannel = FileChannel.open(
                filePath,
                StandardOpenOption.CREATE,
                StandardOpenOption.WRITE)) {
            ByteBuffer buffer = ByteBuffer.allocate(1024);

            buffer.put(content.getBytes());
            buffer.flip();
            writeChannel.write(buffer);
            System.out.println("File written successfully.");
        }  catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void readFile() {
        Path filePath = Paths.get("example.txt");
        try (FileChannel readChannel = FileChannel.open(
                filePath,
                StandardOpenOption.READ)) {
            ByteBuffer buffer = ByteBuffer.allocate(1024);

            int byteRead = readChannel.read(buffer);
            while (byteRead != -1) {
                buffer.flip();
                while (buffer.hasRemaining()) {
                    System.out.println((char) buffer.get());
                }
                buffer.clear();
                byteRead = readChannel.read(buffer);
            }
            System.out.println("\nFile read successfully");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
    public static void readFile(String filename) {


    }
}