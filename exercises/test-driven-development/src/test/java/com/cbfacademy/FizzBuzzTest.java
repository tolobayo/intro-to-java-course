package com.cbfacademy;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import java.lang.String;

import static org.hamcrest.CoreMatchers.instanceOf;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.hamcrest.MatcherAssert.assertThat;

@DisplayName(value = "FizzBuzz Test Suite")
public class FizzBuzzTest {

    // for multiples of 3, it returns “Fizz” instead of the number
    // for multiples of 5, it returns “Buzz” instead of the number
    // for multiples of 15, it returns “FizzBuzz” instead of the number
    // the string representation of the number otherwise

    @Test
    @DisplayName("the method returns a string")
    public void returnsAString() {

        final FizzBuzz fizzbuzz = new FizzBuzz();

        assertThat(fizzbuzz.get(10), is(instanceOf String));
    }
}
