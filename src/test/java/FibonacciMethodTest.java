import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.jupiter.api.Test;


class FibonacciMethodTest {

    @Test
    void testEvenNumSum4() {
        //given
        int bound = 4;

        //when

        int sum = FibonacciMethod.EvenNumSum(bound);

        //try
        Assert.assertThat(sum, CoreMatchers.is(2));
    }


    @Test
    void testEvenNumSum10() {
        //given
        int bound = 10;

        //when

        int sum = FibonacciMethod.EvenNumSum(bound);

        //try
        Assert.assertThat(sum, CoreMatchers.is(44));
    }

    @Test
    void testEvenNumSum15() {
        //given
        int bound = 15;

        //when

        int sum = FibonacciMethod.EvenNumSum(bound);

        //try
        Assert.assertThat(sum, CoreMatchers.is(798));
    }

    @Test
    void testEvenNumSum19() {
        //given
        int bound = 19;

        //when

        int sum = FibonacciMethod.EvenNumSum(bound);

        //try
        Assert.assertThat(sum, CoreMatchers.is(3382));
    }


    @Test
    void testFibonacci2() {
        //given
        int n = 2;

        //when
        int fibonacci = FibonacciMethod.fibonacci(n);

        //try
        Assert.assertThat(fibonacci, CoreMatchers.is(1));
    }

    @Test
    void testFibonacci3() {
        //given
        int n = 3;

        //when
        int fibonacci = FibonacciMethod.fibonacci(n);

        //try
        Assert.assertThat(fibonacci, CoreMatchers.is(2));
    }

    @Test
    void testFibonacci7() {
        //given
        int n = 7;

        //when
        int fibonacci = FibonacciMethod.fibonacci(n);

        //try
        Assert.assertThat(fibonacci, CoreMatchers.is(13));
    }

    @Test
    void testFibonacci17() {
        //given
        int n = 17;

        //when
        int fibonacci = FibonacciMethod.fibonacci(n);

        //try
        Assert.assertThat(fibonacci, CoreMatchers.is(1597));
    }



}
