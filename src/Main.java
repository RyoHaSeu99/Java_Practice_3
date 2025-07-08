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

    // 제네릭 메서드 예시 (E는 메서드 전용 타입)
    public <E> void printContent(E extraInfo) {
        System.out.println("Content: " + content + ", Extra: " + extraInfo);
    }
}
public class Main {
    public static void main(String[] args) {
        Box<Integer> intBox = new Box<>(123);
        intBox.printContent("Integer 박스입니다.");

        Box<String> strBox = new Box<>("Hello");
        strBox.printContent(456);

    }
}