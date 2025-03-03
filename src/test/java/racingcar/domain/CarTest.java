package racingcar.domain;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

@DisplayName("자동차")
class CarTest {
    @Test
    @DisplayName("생성에 성공한다.")
    public void createCarTest() {
        //given
        String name = "choco";
        int initialDistance = 0;

        //when
        Car car = new Car(name);

        //then
        assertEquals(car.getName(), name);
        assertEquals(car.getDistance(), initialDistance);
    }


    @ParameterizedTest
    @DisplayName("적절하지 않은 이름은 예외가 발생한다.")
    @ValueSource(strings = {"chocochip", "aaaaaaaaa"})
    public void testInvalidName(String name) {
        //given & when & then
        assertThrows(IllegalArgumentException.class, () -> new Car(name));
    }

    @Test
    @DisplayName("랜덤값이 4 이상일 경우, 전진에 성공한다.")
    public void testCarMove() {
        //given
        final CarMoveStrategy carMoveStrategy = new CarMoveStrategy() {
            @Override
            public boolean isMovable(int value) {
                return true;
            }
        };

        String name = "choco";
        int movementIncrease = 1;
        int power = 4;

        //when
        Car car = new Car(name);
        int movement = car.getDistance();
        car.move(carMoveStrategy, power);

        //then
        assertEquals(car.getDistance(), movement + movementIncrease);
    }

    @Test
    @DisplayName("랜덤값이 4 미만일 경우, 전진에 성공한다.")
    public void testCarNotMove() {
        //given
        final CarMoveStrategy carMoveStrategy = new CarMoveStrategy() {
            @Override
            public boolean isMovable(int value) {
                return false;
            }
        };
        String name = "choco";
        int power = 4;

        //when
        Car car = new Car(name);
        int movement = car.getDistance();
        car.move(carMoveStrategy, power);

        //then
        assertEquals(car.getDistance(), movement);
    }
}