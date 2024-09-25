import java.util.Scanner;

public class Question8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 키 입력 (cm)
        System.out.print("키(cm)를 입력하세요: ");
        double heightCm = scanner.nextDouble();

        // 몸무게 입력 (kg)
        System.out.print("몸무게(kg)를 입력하세요: ");
        double weightKg = scanner.nextDouble();

        // BMI 계산
        double heightM = heightCm / 100; // cm를 m로 변환
        double bmi = weightKg / (heightM * heightM);

        // 건강 상태 판별
        String healthStatus;
        if (bmi < 18.5) {
            healthStatus = "저체중";
        } else if (bmi >= 18.5 && bmi < 24.9) {
            healthStatus = "정상 체중";
        } else if (bmi >= 25 && bmi < 29.9) {
            healthStatus = "과체중";
        } else {
            healthStatus = "비만";
        }

        // 결과 출력
        System.out.printf("BMI: %.2f\n", bmi);
        System.out.println("건강 상태: " + healthStatus);

        scanner.close();
    }
}
