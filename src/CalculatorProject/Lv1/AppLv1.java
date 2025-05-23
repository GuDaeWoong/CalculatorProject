package CalculatorProject.Lv1;

import java.util.Scanner;

public class AppLv1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // 무한루트
        while (true) {
            // 첫 번째 숫자 입력
            System.out.print("첫 번째 숫자를 입력하세요: ");
            int firstNum = sc.nextInt();

            // 사칙 연산 입력
            System.out.print("사칙연산 기호를 입력하세요(+, -, *, /): ");
            char operationInput = sc.next().charAt(0);

            System.out.print("두 번째 숫자를 입력하세요: ");
            int secondNum = sc.nextInt();

            int result = 0;

            // 사칙연산 확인 & 연산수행
            if (operationInput == '+') {
                result = firstNum + secondNum;
            } else if (operationInput == '-') {
                result = firstNum - secondNum;
            } else if (operationInput == '*') {
                result = firstNum * secondNum;
            } else if (operationInput == '/') {
                if (secondNum == 0) {
                    System.out.println("/ 연산에서 분모에 0이 입력될 수 없습니다.");
                    // 나머지 코드를 건너뛰고 다음 반복으로 이동
                    continue;
                } else {
                    // secondNum 가 0이 아닐경우 계산
                    result = firstNum / secondNum;
                }
            } else {
                System.out.println("유효하지 않은 연산자입니다.");
                continue;
            }
            System.out.println("결과: " + result);

            // 반복 여부 확인
            System.out.println("더 계산하시겠습니까? (exit 입력 시 종료)");
            /* exit을 입력 받으면 반복 종료 */
            String exitInput = sc.next();
            if (exitInput.equals("exit")) {
                break; // 반복 종료
            }
        }
    }
}





