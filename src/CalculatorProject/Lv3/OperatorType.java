package CalculatorProject.Lv3;

public enum OperatorType {
    PLUS("+"), MINUS("-"), TIMES("*"), DIV("/");
    // 속성
    private final String operat;
    // 생성자
    OperatorType(String operat) {
        this.operat = operat;
    }
    // 기능
    public String getOperat() {
        return operat;
    }
}
