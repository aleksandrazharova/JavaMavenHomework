import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import ru.netology.homework.BonusService;

import static org.junit.jupiter.api.Assertions.*;

public class BonusServiceTest {

    @ParameterizedTest
    @CsvFileSource(resources = "/data.csv")
    void testUnderLimit(int expected, int amount, boolean isRegistered) {
        BonusService service = new BonusService();

        long actual = service.calculate(amount, isRegistered);

        assertEquals(expected, actual);
    }
}

//    @org.junit.jupiter.api.Test
//    void shouldCalculateForRegisteredAndUnderLimit() {
//        BonusService service = new BonusService();
//
//        // подготавливаем данные:
//        long amount = 1000;
//        boolean registered = true;
//        long expected = 30;
//
//        // вызываем целевой метод:
//        long actual = service.calculate(amount, registered);
//
//        // производим проверку (сравниваем ожидаемый и фактический):
//        assertEquals(expected, actual);
//    }
//
//    @org.junit.jupiter.api.Test
//    void shouldCalculateForRegisteredAndOverLimit() {
//        BonusService service = new BonusService();
//
//        // подготавливаем данные:
//        long amount = 1_000_000;
//        boolean registered = true;
//        long expected = 500;
//
//        // вызываем целевой метод:
//        long actual = service.calculate(amount, registered);
//
//        // производим проверку (сравниваем ожидаемый и фактический):
//        assertEquals(expected, actual);
//    }
//
//
//    @org.junit.jupiter.api.Test
//    void shouldCalculateForUnRegisteredAndUnderLimit() {
//        BonusService service = new BonusService();
//
//        // подготавливаем данные:
//        long amount = 5000;
//        boolean registered = false;
//        long expected = 50;
//
//        // вызываем целевой метод:
//        long actual = service.calculate(amount, registered);
//
//        // производим проверку (сравниваем ожидаемый и фактический):
//        assertEquals(expected, actual);
//    }
//    @org.junit.jupiter.api.Test
//    void shouldCalculateForUnRegisteredAndOverLimit() {
//        BonusService service = new BonusService();
//
//        // подготавливаем данные:
//        long amount = 1000000;
//        boolean registered = false;
//        long expected = 500;
//
//        // вызываем целевой метод:
//        long actual = service.calculate(amount, registered);
//
//        // производим проверку (сравниваем ожидаемый и фактический):
//        assertEquals(expected,actual);
//    }
//}
