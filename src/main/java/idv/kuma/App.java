package idv.kuma;

import message.MessageSender;
import message.MessageSenderEmail;

import java.util.Arrays;
import java.util.List;

/**
 * Hello world!
 */
public class App {

    public static final int ARGS_INDEX_N = 0;
    public static final int ARGS_INDEX_MAIL_LIST = 1;
    public static final String MAIL_LIST_SEPARATOR = ",";


    private AdvancedCalculator advancedCalculator;
    private MessageSender messageSender;

    public App() {
        this.advancedCalculator = new AdvancedCalculator(new Calculator());
        this.messageSender = new MessageSenderEmail();
    }

    public static void main(String[] args) {

        App myApp = new App();

        // parse input
        int n = Integer.valueOf(args[ARGS_INDEX_N]);
        List<String> mailList = Arrays.asList(args[ARGS_INDEX_MAIL_LIST].split(MAIL_LIST_SEPARATOR));

        // calcualte fibonacci and email
        myApp.countAndNotify(n, mailList);

    }

    public void countAndNotify(int n, List<String> mailList) {

        // calculate
        int result = this.advancedCalculator.fibonacci(n);

        // send email
        messageSender.send(mailList);

        // print result
        System.out.println("Message sent. Result = " + result);

    }
}
