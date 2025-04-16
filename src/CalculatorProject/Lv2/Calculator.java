package CalculatorProject.Lv2;


import java.util.ArrayList;

public class Calculator {
    // 연산 결과를 저장하는 컬렉션 타입 필드 (동적 배열)
    ArrayList<Integer> results = new ArrayList<>();
    public Integer calculate(int firstNum, int secondNum, String operator) {
        int result = 0;
        if (operator.equals("+")) {
            result = firstNum + secondNum;
        } else if (operator.equals("-")) {
            result = firstNum - secondNum;
        } else if (operator.equals("*")) {
            result = firstNum * secondNum;
        } else if (operator.equals("/")) {
            if (secondNum == 0) {
                System.out.println("/ 연산에서 분모에 0이 입력될 수 없습니다.");
                // return 에 null을 줌으로써 함수가 종료된다
                return null;
            } else {
                result = firstNum / secondNum;
            }
        } else {
            System.out.println("유효하지 않은 연산자입니다.");
            // return 에 null을 반환함으로써 함수가 종료된다
            return null;
        }

        // 연산 결과를 컬렉션에 저장
        results.add(result);
        return result;
    }
 }


