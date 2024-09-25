import java.util.Scanner;

public class Question9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 첫 번째 숫자 입력
        System.out.print("첫 번째 숫자를 입력하세요: ");
        double num1 = scanner.nextDouble();

        // 연산자 입력
        System.out.print("연산자(+, -, *, /)를 입력하세요: ");
        char operator = scanner.next().charAt(0);

        // 두 번째 숫자 입력
        System.out.print("두 번째 숫자를 입력하세요: ");
        double num2 = scanner.nextDouble();

        double result = 0;
        boolean validOperation = true; // 연산 유효성 체크

        // 연산자에 따른 연산 수행
        if (operator == '+') {
            result = num1 + num2;
        } else if (operator == '-') {
            result = num1 - num2;
        } else if (operator == '*') {
            result = num1 * num2;
        } else if (operator == '/') {
            if (num2 == 0) {
                System.out.println("0으로 나눌 수 없습니다.");
                validOperation = false; // 유효하지 않은 연산
            } else {
                result = num1 / num2;
            }
        } else {
            System.out.println("잘못된 연산자입니다.");
            validOperation = false; // 유효하지 않은 연산
        }

        // 결과 출력
        if (validOperation) {
            System.out.println("결과: " + result);
        }

        scanner.close();
    }
}
