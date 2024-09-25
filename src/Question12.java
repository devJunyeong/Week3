import java.util.Scanner;

public class Question12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int total = 0;

        // 4개 과목 점수 입력 및 등급 출력
        for (int i = 1; i <= 4; i++) {
            System.out.print(i + "번 과목 점수를 입력하세요: ");
            int score = scanner.nextInt();
            total += score;

            // 등급 판별
            char grade;
            if (score >= 90) grade = 'A';
            else if (score >= 80) grade = 'B';
            else if (score >= 70) grade = 'C';
            else if (score >= 60) grade = 'D';
            else grade = 'F';

            System.out.println(i + "번 과목 등급: " + grade);
        }

        // 평균 계산 및 합격 여부 출력
        double average = total / 4.0;
        System.out.printf("평균 점수: %.2f\n", average);
        System.out.println(average >= 60 ? "합격" : "불합격");

        scanner.close();
    }
}
