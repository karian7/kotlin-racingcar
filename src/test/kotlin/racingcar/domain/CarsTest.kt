package racingcar.domain

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class CarsTest {
    @Test
    fun `자동차 일급컬랙션을 생성할 수 있다`() {
        assertThat(Cars(3)).isEqualTo(Cars(3))
    }

    @Test
    fun `이동후 위치목록을 제공한다`() {
        val cars = cars(3)
        cars.drive()
        cars.drive()
        assertThat(cars.positions).containsExactly(
            NamedPosition.Smart(position = 2),
            NamedPosition.Smart(position = 2),
            NamedPosition.Smart(position = 2)
        )
    }

    companion object {
        fun cars(count: Int) = Cars((0 until count).map { Car(position = NamedPosition.Smart(), moveable = Moveable.Always()) })
    }
}
