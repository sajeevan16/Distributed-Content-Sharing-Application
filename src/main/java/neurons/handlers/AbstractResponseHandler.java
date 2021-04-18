package neurons.handlers;

import neurons.comms.ChannelMessage;

public interface AbstractResponseHandler extends AbstractMessageHandler {

    void handleResponse(ChannelMessage message);
}
