package CalculatorProject.Lv1;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            // 첫 번째 숫자 입력
            System.out.print("첫 번째 숫자를 입력하세요: ");
            int firstNum = sc.nextInt();
            // Scanner를 사용하여 양의 정수를 입력받고 적합한 타입의 변수에 저장합니다.


            // 사칙 연산 입력
            System.out.print("사칙연산 기호를 입력하세요(+, -, *, /): ");
            String operationInput = sc.next();


            System.out.print("두 번째 숫자를 입력하세요: ");
            int secondNum = sc.nextInt();
            // Scanner를 사용하여 양의 정수를 입력받고 적합한 타입의 변수에 저장합니다.


            int result = 0;


            // 사칙연산 확인 & 연산수행
            if (operationInput.equals("+")) {
                result = firstNum + secondNum;
            } else if (operationInput.equals("-")) {
                result = firstNum - secondNum;
            } else if (operationInput.equals("*")) {
                result = firstNum * secondNum;
            } else if (operationInput.equals("/")) {
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





