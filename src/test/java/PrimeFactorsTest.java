import org.junit.jupiter.api.*;

import java.util.ArrayList;
import java.util.List;


import static org.junit.jupiter.api.Assertions.*;


@DisplayName(" When We sent a number, It calculates prime factor and return integer list.")
class PrimeFactorsTest {

    private List<Integer> realPrimeNumbers = new ArrayList<>();
    private PrimeFactors primeFactors = new PrimeFactors();

    @BeforeEach
    void clearPrimeNumbersList() {
        realPrimeNumbers.clear();
    }


    @Test
    @DisplayName(" When We sent a number that has  just a reminder number, It calculates prime factor as a itself ")
    void whenItselfPrimeNumberThenCalculatePrimeFactors() {

        realPrimeNumbers.add(11);
        assertEquals(realPrimeNumbers,primeFactors.generate(11));

        realPrimeNumbers.clear();
        realPrimeNumbers.add(7);
        assertEquals(realPrimeNumbers,primeFactors.generate(7));

        realPrimeNumbers.clear();
        realPrimeNumbers.add(17);
        assertEquals(realPrimeNumbers,primeFactors.generate(17));

    }
    @Test
    @DisplayName(" When We sent a number that has  both more than one reminder number, It calculates prime factor ")

    //For example 36 = 2*2*3*3 It's prime numbers are 2,3
    void whenNormalNumberThenCalculatePrimeFactors() {

        realPrimeNumbers.add(2);
        realPrimeNumbers.add(3);
        assertEquals(realPrimeNumbers,primeFactors.generate(36));
        realPrimeNumbers.clear();

        realPrimeNumbers.add(5);
        realPrimeNumbers.add(7);
        //5*5*7*7 = 1225
        assertEquals(realPrimeNumbers,primeFactors.generate(1225));
    }

    @Test
    @DisplayName(" When We sent 1 It doesnt calculate prime factor ")
    void whenTheOneThenDoesntCalculatePrimeFactors() {

        assertEquals(realPrimeNumbers,primeFactors.generate(1));

    }
}