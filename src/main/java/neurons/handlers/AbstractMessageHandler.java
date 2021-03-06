package neurons.handlers;

import neurons.comms.ChannelMessage;
import neurons.core.RoutingTable;
import neurons.core.TimeoutManager;

import java.util.concurrent.BlockingQueue;

interface AbstractMessageHandler {
    void init(
            RoutingTable routingTable,
            BlockingQueue<ChannelMessage> channelOut,
            TimeoutManager timeoutManager);

}
