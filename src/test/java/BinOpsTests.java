import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class BinOpsTests {

    BinOps sut = new BinOps();

    @BeforeEach
    public void initEach() {
        System.out.println("Тест для метода класса BinOps запущен");
    }

    @AfterEach
    public void finishEach() {
        System.out.println("Тест для метода класса BinOps завершен");
    }

    @ParameterizedTest
    @MethodSource("sourceSum")
    void testSum(String a, String b, String expected) {
        String result = sut.sum(a, b);

        Assertions.assertEquals(expected, result);
    }

    private static Stream<Arguments> sourceSum() {
        return Stream.of(Arguments.of("0101", "0101", "1010"),
                Arguments.of("0000", "0001", "1"),
                Arguments.of("0000", "0000", "0"));
    }

    @ParameterizedTest
    @MethodSource("sourceMult")
    void testMult(String a, String b, String expected) {
        String result = sut.mult(a, b);

        Assertions.assertEquals(expected, result);
    }

    private static Stream<Arguments> sourceMult() {
        return Stream.of(Arguments.of("0101", "0101", "11001"),
                Arguments.of("0000", "0001", "0"),
                Arguments.of("0000", "0000", "0"));
    }
}
