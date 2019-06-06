package im_system_demo.client.handler;

import im_system_demo.proto.response_packet.MessageResponsePacket;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;

import java.util.Date;

/**
 * @author xiong
 * @date 2019-05-31  21:10
 */
public class MessageHandler extends SimpleChannelInboundHandler<MessageResponsePacket> {
    @Override
    protected void channelRead0(ChannelHandlerContext ctx, MessageResponsePacket msg) throws Exception {

        System.out.println(new Date() + ": 接收[ "+msg.getFromUsername()+" ]的消息: " + msg.getMessage());
    }
}