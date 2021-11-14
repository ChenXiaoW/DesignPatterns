package cn.chenw.design_patterns.strategy_enum.enums;

public enum CalculatorEnum {

    ADD("+"){
        @Override
        public int exec(int a, int b) {
            return a+b;
        }
    },
    SUB("-"){
        @Override
        public int exec(int a, int b) {
            return a-b;
        }
    }


    ;


    CalculatorEnum(String s){
        this.value = s;
    }


    private String value;


    public abstract int exec (int a,int b);

}
