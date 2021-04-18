package neurons.handlers;

import neurons.comms.ChannelMessage;

public interface AbstractRequestHandler extends AbstractMessageHandler {

    void sendRequest(ChannelMessage message);
}
