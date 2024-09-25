import java.util.Scanner;

public class Question10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("숫자를 입력하세요: ");
        int number = scanner.nextInt();

        // 조건 판별
        if (number % 3 == 0 && number % 5 == 0) {
            System.out.println("3과 5의 배수입니다.");
        } else if (number % 3 == 0) {
            System.out.println("3의 배수입니다.");
        } else if (number % 5 == 0) {
            System.out.println("5의 배수입니다.");
        } else {
            System.out.println("해당 조건을 만족하지 않습니다.");
        }

        scanner.close();
    }
}
