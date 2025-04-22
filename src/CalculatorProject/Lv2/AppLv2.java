package CalculatorProject.Lv2;

import java.util.Scanner;

public class AppLv2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calculator calculator = new Calculator();

        while (true) {
            // 첫 번째 숫자 입력
            System.out.print("첫 번째 숫자를 입력하세요: ");
            int firstNum = sc.nextInt();

            // 사칙 연산 입력
            System.out.print("사칙연산 기호를 입력하세요(+, -, *, /): ");
            char operationInput = sc.next().charAt(0);

            System.out.print("두 번째 숫자를 입력하세요: ");
            int secondNum = sc.nextInt();

            //Calculator 의 calculate 메서드 기능
            // Integer로 받는 이유 : 유효하지 않은 연산자 이거나 / 연산자의 분모가 0일경우
            // return null로 반환하였기 때문
            Integer result = calculator.calculate(firstNum, secondNum, operationInput);
            // result가  null 이면 나머지 코드를 건너뛰고 다음 반복으로 이동
            if (result == null) {
                continue;
            }
            System.out.println("결과: " + result);

            // 반복 여부 확인
            System.out.println("더 계산하시겠습니까? (exit 입력 시 종료)");
            // exit을 입력 받으면 반복 종료
            String exitInput = sc.next();
            if (exitInput.equals("exit")) {
                // exit 입력하면 반복 종료
                break;
            }
        }
        System.out.println(calculator.getResults());
    }
}
