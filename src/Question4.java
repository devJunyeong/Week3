import java.util.Scanner;

public class Question4 {
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

        // 연산자에 따른 연산 수행
        switch (operator) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    System.out.println("0으로 나눌 수 없습니다.");
                    scanner.close();
                    return;
                }
                break;
            default:
                System.out.println("잘못된 연산자입니다.");
                scanner.close();
                return;
        }

        // 결과 출력
        System.out.println("결과: " + result);

        scanner.close();
    }
}
