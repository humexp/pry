package systems.vostok.humexp.pry.consumer

import org.junit.jupiter.api.Test

import java.util.stream.Stream

import static org.junit.jupiter.api.Assertions.assertTrue

class CommonTest {
    @Test
    void commonTest() {
        assertTrue Stream.of(1, 2, 3).mapToInt { i -> i }.sum() > 5
    }
}
