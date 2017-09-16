package idv.kuma;

import message.MessageSender;

import java.util.List;

/**
 * Created by bearhsu2 on 9/14/2017.
 */
public class Calculator {
    public int add(int a, int b){
        return a + b;
    }

    public int add(int a, int b, MessageSender messageSender, List<String> receivers){
        messageSender.send(receivers);
        return a + b;
    }
}
