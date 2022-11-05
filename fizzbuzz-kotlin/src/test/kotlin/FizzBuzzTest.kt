import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test

class FizzBuzzTest {

    /**
    1
    2
    Fizz
    4
    Buzz
    Fizz
    7
    8
    Fizz
    Buzz
    11
    Fizz
    13
    14
    FizzBuzz
    16
    17
    Fizz
    19
    Buzz
    ... etc up to 100
     */

    @Test
    @DisplayName("test")
    fun `it should return 1 when the number is equals to 1`() {
        // Given
        val input = 1

        // When
        val result = FizzBuzzConverter().convert(input)

        // Then
        val expectedResult = "1"
        Assertions.assertEquals(expectedResult,result)
    }

    @Test
    fun `it should return 2 when the number is equals to 2`() {
        // Given
        val input = 2

        // When
        val result = FizzBuzzConverter().convert(input)

        // Then
        val expectedResult = "2"
        Assertions.assertEquals(expectedResult,result)
    }

    @Test
    fun `it should return Fizz when the number is equals to 3`() {
        // Given
        val input = 3

        // When
        val result = FizzBuzzConverter().convert(input)

        // Then
        val expectedResult = "Fizz"
        Assertions.assertEquals(expectedResult,result)
    }

    @Test
    fun `it should return Buzz when the number is equals to 5`() {
        // Given
        val input = 5

        // When
        val result = FizzBuzzConverter().convert(input)

        // Then
        val expectedResult = "Buzz"
        Assertions.assertEquals(expectedResult,result)
    }

    @Test
    fun `it should return FizzBuzz when the number is equals to 15`() {
        // Given
        val input = 5

        // When
        val result = FizzBuzzConverter().convert(input)

        // Then
        val expectedResult = "Buzz"
        Assertions.assertEquals(expectedResult,result)
    }


}