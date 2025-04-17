package CalculatorProject.Lv2;

import java.util.ArrayList;
import java.util.List;

public class Calculator {
    // 연산 결과를 저장하는 컬렉션 타입 필드 (동적 배열)
    // 외부에서 results 필드에 직접 접근하는 것을 막기 위해 private으로 설정
    private List<Integer> results = new ArrayList<>();

    // 간접 접근을 통해 필드에 접근하여 가져올 수 있도록 구현합니다. (Getter 메서드)
    public List<Integer> getResults() {
        return this.results;
    }

    // 간접 접근을 통해 필드에 접근하여 수정할 수 있도록 구현합니다. (Setter 메서드)
    public void setResults(List<Integer> results) {
        // if 문을 사용해서 results형식의 값이 들어올수있게 보안? 개연차원에서 해주는 것이 좋을것같음
        this.results = results;
    }

    public Integer calculate(int firstNum, int secondNum, char operationInput) {
        int result = 0;
        if (operationInput == '+') {
            result = firstNum + secondNum;
        } else if (operationInput == '-') {
            result = firstNum - secondNum;
        } else if (operationInput == '*') {
            result = firstNum * secondNum;
        } else if (operationInput == '/') {
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

    public void removeResult() {
        results.remove(0);
    }
}


