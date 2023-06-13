package com.kodilla.basic_assertion;

import org.junit.jupiter.api.Test;

public class PrimeCheckerTestSuite {

@Test
    public void shouldReturnFalseWhenPassingNotPrimeNumber(){
    PrimeChecker checker = new PrimeChecker();
    boolean result = checker.isPrime(14);
    assertFalse(result);

}

    private void assertFalse(boolean result) {
    }


}
