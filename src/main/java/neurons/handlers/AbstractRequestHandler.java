package neurons.handlers;

import neurons.communication.messages.ChannelMessage;

public interface AbstractRequestHandler extends AbstractMessageHandler {

    void sendRequest(ChannelMessage message);
}
