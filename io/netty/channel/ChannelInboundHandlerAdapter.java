// 
// Decompiled by Procyon v0.5.36
// 

package io.netty.channel;

public class ChannelInboundHandlerAdapter extends ChannelHandlerAdapter implements ChannelInboundHandler
{
    @Override
    public void userEventTriggered(final ChannelHandlerContext lllllllllllllIIllIlIIIIIIllIIlll, final Object lllllllllllllIIllIlIIIIIIllIIllI) throws Exception {
        lllllllllllllIIllIlIIIIIIllIIlll.fireUserEventTriggered(lllllllllllllIIllIlIIIIIIllIIllI);
        "".length();
    }
    
    @Override
    public void channelRegistered(final ChannelHandlerContext lllllllllllllIIllIlIIIIIlIIIIIlI) throws Exception {
        lllllllllllllIIllIlIIIIIlIIIIIlI.fireChannelRegistered();
        "".length();
    }
    
    @Override
    public void channelInactive(final ChannelHandlerContext lllllllllllllIIllIlIIIIIIlllIlll) throws Exception {
        lllllllllllllIIllIlIIIIIIlllIlll.fireChannelInactive();
        "".length();
    }
    
    @Override
    public void channelActive(final ChannelHandlerContext lllllllllllllIIllIlIIIIIIllllIlI) throws Exception {
        lllllllllllllIIllIlIIIIIIllllIlI.fireChannelActive();
        "".length();
    }
    
    @Override
    public void channelWritabilityChanged(final ChannelHandlerContext lllllllllllllIIllIlIIIIIIllIIIII) throws Exception {
        lllllllllllllIIllIlIIIIIIllIIIII.fireChannelWritabilityChanged();
        "".length();
    }
    
    @Override
    public void channelReadComplete(final ChannelHandlerContext lllllllllllllIIllIlIIIIIIllIllII) throws Exception {
        lllllllllllllIIllIlIIIIIIllIllII.fireChannelReadComplete();
        "".length();
    }
    
    @Override
    public void channelRead(final ChannelHandlerContext lllllllllllllIIllIlIIIIIIlllIIlI, final Object lllllllllllllIIllIlIIIIIIlllIIIl) throws Exception {
        lllllllllllllIIllIlIIIIIIlllIIlI.fireChannelRead(lllllllllllllIIllIlIIIIIIlllIIIl);
        "".length();
    }
    
    @Override
    public void channelUnregistered(final ChannelHandlerContext lllllllllllllIIllIlIIIIIIlllllll) throws Exception {
        lllllllllllllIIllIlIIIIIIlllllll.fireChannelUnregistered();
        "".length();
    }
    
    @Override
    public void exceptionCaught(final ChannelHandlerContext lllllllllllllIIllIlIIIIIIlIlllII, final Throwable lllllllllllllIIllIlIIIIIIlIllIIl) throws Exception {
        lllllllllllllIIllIlIIIIIIlIlllII.fireExceptionCaught(lllllllllllllIIllIlIIIIIIlIllIIl);
        "".length();
    }
}
