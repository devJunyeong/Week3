import java.util.Scanner;

public class Question3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("점수를 입력하세요: ");
        int score = scanner.nextInt();

        if (score >= 90) {
            System.out.println("등급: A");
        } else if (score >= 80) {
            System.out.println("등급: B");
        } else if (score >= 70) {
            System.out.println("등급: C");
        } else if (score >= 60) {
            System.out.println("등급: D");
        } else {
            System.out.println("등급: F");
        }

        scanner.close();
    }
}
