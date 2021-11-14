package cn.chenw.design_patterns.strategy_enum.enums;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorEnumTest {

    @Test
    void exec() {

        int exec = CalculatorEnum.ADD.exec(10, 1);
        System.out.println(exec);
        int exec1 = CalculatorEnum.SUB.exec(10, 1);
        System.out.println(exec1);
    }
}