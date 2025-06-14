public class Main {
    public static void main(String[] args) {
        String message = "Hello, Java!";

        // 문자열 길이 확인
        System.out.println("문자열 길이: " + message.length());

        // 대문자로 변환
        System.out.println("대문자로 변환: " + message.toUpperCase());

        // 부분 문자열 추출
        System.out.println("부분 문자열 (0~5): " + message.substring(0, 5));

        // 특정 문자의 위치 찾기(인덱스)
        System.out.println("문자 'J'의 위치: " + message.indexOf('J'));
    }
}