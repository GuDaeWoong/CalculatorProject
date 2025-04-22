
package CalculatorProject.Lv3;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class CalculratorLv3<T extends Number> {

    // 연산 결과를 저장하는 컬렉션 타입 필드 (동적 배열)
    // 외부에서 results 필드에 직접 접근하는 것을 막기 위해 private으로 설정
    private List<Double> results = new ArrayList<>();

    // 간접 접근을 통해 필드에 접근하여 가져올 수 있도록 구현합니다. (Getter 메서드)
    public List<Double> getResults() {
        return this.results;
    }

    // 간접 접근을 통해 필드에 접근하여 수정할 수 있도록 구현합니다. (Setter 메서드)
    public void setResults(List<Double> results) {
        // if 문을 사용해서 results형식의 값이 들어올수있게 보안? 개연차원에서 해주는 것이 좋을것같음
        this.results = results;
    }

    // 기능
    public Double calculate(T firstNum, T secondNum, String operationInput) {

        Double result = null;

        if (Objects.equals(operationInput, OperatorType.PLUS.getOperat())) {
            result = firstNum.doubleValue() + secondNum.doubleValue();
        } else if (Objects.equals(operationInput, OperatorType.MINUS.getOperat())) {
            result = firstNum.doubleValue() - secondNum.doubleValue();
        } else if (Objects.equals(operationInput, OperatorType.TIMES.getOperat())) {
            result = firstNum.doubleValue() * secondNum.doubleValue();
        } else if (Objects.equals(operationInput, OperatorType.DIV.getOperat())){
            if (secondNum.doubleValue() == 0) {
                System.out.println("/ 연산에서 분모에 0이 입력될 수 없습니다.");
                return null;
            } else {
                result = firstNum.doubleValue() * secondNum.doubleValue();
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

    // 3-3 기존 리스트를 scan에 넣고 result_new 새로 나온 값을
    // 입력하면 넣은 값보다 큰값들을 반환하는 메서드
    public List<String> scan(List<Double> _list, Double result_new) {
        return _list.stream()
                .filter(num -> num > result_new)
                // .map(String ::valueOf)
                .map(num -> String.valueOf(num))
                .toList();
    }

    public String isType(String num) {
        if (isInt(num)) {
            return "int";
        } else if (isDouble(num)) {
            return "double";
        } else {
            return "String";
        }
    }

    public boolean isInt(String num) {
        try {
            Integer.parseInt(num);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public boolean isDouble(String num) {
        try {
            Double.parseDouble(num);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
