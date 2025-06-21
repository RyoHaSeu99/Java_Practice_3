public class Outer {
    private String data = "Outer data";

    class Inner {
        void printData() {
            System.out.println(data);
        }
    }

    public Inner createInner() {
        return new Inner();
    }

    public static void main(String[] args) {
        // Outer 인스턴스 생성
        Outer outer = new Outer();
        // Inner 인스턴스 생성
        Outer.Inner inner = outer.createInner();
        // inner 내부 메소드 실행
        inner.printData();

        // Outer와 Inner를 null로 만들어서 정리 대상이 되도록 함
        outer = null;
        inner = null;

        System.gc(); // 가비지 컬렉터 호출 요청
        System.out.println("Outer와 Inner는 더 이상 사용되지 않음");
    }
}