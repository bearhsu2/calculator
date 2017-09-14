package idv.kuma;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by bearhsu2 on 9/14/2017.
 */
public class CalculatorTest {

    @Test
    public void add() throws Exception {

        // 1. Prepare data
        int a = 30;
        int b = 60;
        Calculator myCalculator = new Calculator();

        // 2. Run program
        int result = myCalculator.add(a, b);

        // 3. Check answer
        Assert.assertEquals(90, result);

    }

}