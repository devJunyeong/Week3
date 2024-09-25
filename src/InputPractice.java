import java.util.Scanner;

public class InputPractice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("첫 번째 숫자: ");
        double number = sc.nextDouble();

        System.out.print("두 번째 숫자: ");
        int age = sc.nextInt();

        System.out.print("연산자(+, -, *, /): ");
        String operator = sc.next();

        System.out.println("결과: 첫 번째 숫자 = " + number + ", 두 번째 숫자 = " + age + ", 연산자 = " + operator);
        sc.close();

    }
}
