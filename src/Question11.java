import java.util.Scanner;

public class Question11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 세 개의 숫자 입력
        System.out.print("첫 번째 숫자를 입력하세요: ");
        int num1 = scanner.nextInt();

        System.out.print("두 번째 숫자를 입력하세요: ");
        int num2 = scanner.nextInt();

        System.out.print("세 번째 숫자를 입력하세요: ");
        int num3 = scanner.nextInt();

        // 가장 큰 숫자 찾기 (중첩 조건문 사용)
        int largest;

        if (num1 >= num2) { // num1이 num2보다 크거나 같을 경우
            if (num1 >= num3) { // num1이 num3보다 크거나 같을 경우
                largest = num1; // num1이 가장 큼
            } else { // num1이 num3보다 작을 경우
                largest = num3; // num3이 가장 큼
            }
        } else { // num2가 num1보다 클 경우
            if (num2 >= num3) { // num2가 num3보다 크거나 같을 경우
                largest = num2; // num2가 가장 큼
            } else { // num2가 num3보다 작을 경우
                largest = num3; // num3이 가장 큼
            }
        }

        // 결과 출력
        System.out.println("가장 큰 숫자는: " + largest);

        scanner.close();
    }
}
