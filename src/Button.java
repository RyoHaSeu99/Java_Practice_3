public class Button {
    // 인터페이스 OnClickListener 생성
    interface OnClickListener {
        // 추상메소드 onclick 생성
        void onClick();
    }

    // onClickListener 인터페이스 타입의 필드 listener 생성
    private OnClickListener listener;

    // listener 필드를 초기화하는 setter 메소드
    public void setOnClickListener(OnClickListener listener) {
        // 매개변수를 필드 listener에 참조
        this.listener = listener;
    }

    // Button의 메소드
    public void click() {
        // listener에 참조된 값이 있으면 onClick 메소드 실행
        if (listener != null) {
            listener.onClick();
        }
    }

    // OnClickListener 인터페이스를 구현한 private 내부 클래스 ClickHandler
    private class ClickHandler implements OnClickListener {
        public void onClick() {
            System.out.println("Button was clicked!");
        }
    }

    // Button의 메소드
    public void simulate() {
        // OnclickListener 인터페이스 타입의 ClickHandler 객체를 생성하여 setOnclickListener의 매개변수로 사용
        setOnClickListener(new ClickHandler());
        click();
    }

    public static void main(String[] args) {
        Button btn = new Button();
        btn.simulate();
    }
}