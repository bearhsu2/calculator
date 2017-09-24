package idv.kuma;

import message.MessageSender;
import message.MessageSenderEmail;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

/**
 * Created by bearhsu2 on 9/14/2017.
 */
public class CalculatorTest {

    @Test
    public void addPositive() throws Exception {

        // 1. Prepare data
        int a = 30;
        int b = 60;
        Calculator myCalculator = new Calculator();

        // 2. Run program
        int result = myCalculator.add(a, b);

        // 3. Check answer
        Assert.assertEquals(90, result);

    }

    @Test
    public void addNegative() throws Exception {

        // 1. Prepare data
        int a = -30;
        int b = -60;
        Calculator myCalculator = new Calculator();

        // 2. Run program
        int result = myCalculator.add(a, b);

        // 3. Check answer
        Assert.assertEquals(-90, result);

    }

    @Test
    public void addZero() throws Exception {

        // 1. Prepare data
        int a = 0;
        int b = 0;
        Calculator myCalculator = new Calculator();

        // 2. Run program
        int result = myCalculator.add(a, b);

        // 3. Check answer
        Assert.assertEquals(0, result);

    }


    @Test
    public void addSendEmail() throws Exception {

        // 1-1 Prepare data
        int a = 30;
        int b = 60;
        Calculator myCalculator = new Calculator();
        List<String> fakeReceivers = new ArrayList<String>();

        // 1-2 Prepare mocking data
        MessageSender mockedSender = Mockito.mock(MessageSenderEmail.class);

        // 2. Run program
        int result = myCalculator.add(a, b, mockedSender, fakeReceivers);

        // 3-1 Check answer
        Assert.assertEquals(90, result);
        // 3-2 Verify sending email
        verify(mockedSender, times(1)).send(fakeReceivers);

    }

}