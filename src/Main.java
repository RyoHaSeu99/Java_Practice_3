class Box<T> {
    private T content;

    public Box(T content) {
        this.content = content;
    }

    public T getContent() {
        return content;
    }

    public void setContent(T content) {
        this.content = content;
    }

    public <E> void printContent(E extraInfo) {
        System.out.println("Content: " + content + ", Extra: " + extraInfo);
    }
}
public class Main {
    public static void main(String[] args) {

    }
}