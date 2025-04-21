package CalculatorProject.Lv3;

import java.util.Scanner;

public class AppLv3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CalculratorLv3<Integer> calculratorInt = new CalculratorLv3<Integer>();
        CalculratorLv3<Double> calculratorDouble = new CalculratorLv3<Double>();

        while (true) {
            // 첫 번째 숫자 입력
            System.out.print("첫 번째 숫자를 입력하세요: ");
            String firstNum = sc.next();

            // 사칙 연산 입력
            System.out.print("사칙연산 기호를 입력하세요(+, -, *, /): ");
            String operationInput = sc.next();

            // 두 번째 숫자 입력
            System.out.print("두 번째 숫자를 입력하세요: ");
            String secondNum = sc.next();

            Double result;
            if (calculratorInt.isType(firstNum).equals("int") && calculratorInt.isType(secondNum).equals("int")) {
                result = calculratorInt.calculate(Integer.parseInt(firstNum), Integer.parseInt(secondNum), operationInput);
            } else if (calculratorInt.isType(firstNum).equals("double") && calculratorInt.isType(secondNum).equals("double")) {
                result = calculratorDouble.calculate(Double.parseDouble(firstNum), Double.parseDouble(secondNum), operationInput);
            } else {
                continue;
            }
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

    }
}



