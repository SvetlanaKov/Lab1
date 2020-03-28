import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @org.junit.jupiter.api.Test
    void sum() {
        assertEquals(4,Calculator.sum(2,2));
    }

    @org.junit.jupiter.api.Test
    void sub() {
        assertEquals(0,Calculator.sub(2,2));
    }

    @org.junit.jupiter.api.Test
    void mul() {
        assertEquals(400,Calculator.mul(20,20));
    }

    @org.junit.jupiter.api.Test
    void div() {
        assertEquals(1,Calculator.div(2,2));
    }
}