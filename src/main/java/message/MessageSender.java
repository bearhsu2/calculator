package message;

import java.util.List;

/**
 * Created by bearhsu2 on 9/16/2017.
 */
public interface MessageSender {

    void send(List<String> receiverList);
}
