import org.junit.Assert.assertEquals
import org.junit.Test

class FizzBuzzTest {

    @Test
    fun one() {
        val fizzBuzz = FizzBuzz()
        val output = fizzBuzz.convertToFizzBuzz(1)
        assertEquals(1, output)
    }
//
//    @Test
//    fun two() {
//        val fizzBuzz = FizzBuzz()
//        val output = fizzBuzz.convertToFizzBuzz(2)
//        assertEquals(2, output)
//    }
}