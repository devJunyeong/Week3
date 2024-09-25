import java.util.Scanner;

public class Question7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("월(1~12)을 입력하세요: ");
        int month = scanner.nextInt();

        String season;

        // 월에 따른 계절 판별
        if (month == 12 || month == 1 || month == 2) {
            season = "겨울";
        } else if (month >= 3 && month <= 5) {
            season = "봄";
        } else if (month >= 6 && month <= 8) {
            season = "여름";
        } else if (month >= 9 && month <= 11) {
            season = "가을";
        } else {
            System.out.println("잘못된 월을 입력하셨습니다.");
            scanner.close();
            return;
        }

        // 결과 출력
        System.out.println("해당 월의 계절은 " + season + "입니다.");

        scanner.close();
    }
}
