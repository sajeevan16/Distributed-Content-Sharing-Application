package neurons.handlers;

import neurons.communication.messages.ChannelMessage;

public interface AbstractResponseHandler extends AbstractMessageHandler {

    void handleResponse(ChannelMessage message);
}
