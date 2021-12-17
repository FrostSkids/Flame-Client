// 
// Decompiled by Procyon v0.5.36
// 

package io.netty.channel.udt.nio;

import com.barchart.udt.nio.SocketChannelUDT;
import io.netty.channel.Channel;
import java.util.List;
import com.barchart.udt.TypeUDT;
import io.netty.channel.ChannelMetadata;

public class NioUdtMessageAcceptorChannel extends NioUdtAcceptorChannel
{
    private static final /* synthetic */ ChannelMetadata METADATA;
    private static final /* synthetic */ int[] llIllIIlIlIlll;
    
    private static boolean lIIlIllIlllllIll(final Object llllllllllllIllIIllllIlIIlllIIll) {
        return llllllllllllIllIIllllIlIIlllIIll == null;
    }
    
    private static void lIIlIllIlllllIlI() {
        (llIllIIlIlIlll = new int[2])[0] = ((0x75 ^ 0x1F ^ (0xF8 ^ 0xAB)) & (55 + 16 + 25 + 59 ^ 98 + 30 - 111 + 145 ^ -" ".length()));
        NioUdtMessageAcceptorChannel.llIllIIlIlIlll[1] = " ".length();
    }
    
    public NioUdtMessageAcceptorChannel() {
        super(TypeUDT.DATAGRAM);
    }
    
    @Override
    protected int doReadMessages(final List<Object> llllllllllllIllIIllllIlIIlllIlll) throws Exception {
        final SocketChannelUDT llllllllllllIllIIllllIlIIllllIIl = this.javaChannel().accept();
        if (lIIlIllIlllllIll(llllllllllllIllIIllllIlIIllllIIl)) {
            return NioUdtMessageAcceptorChannel.llIllIIlIlIlll[0];
        }
        llllllllllllIllIIllllIlIIlllIlll.add(new NioUdtMessageConnectorChannel(this, llllllllllllIllIIllllIlIIllllIIl));
        "".length();
        return NioUdtMessageAcceptorChannel.llIllIIlIlIlll[1];
    }
    
    static {
        lIIlIllIlllllIlI();
        METADATA = new ChannelMetadata((boolean)(NioUdtMessageAcceptorChannel.llIllIIlIlIlll[0] != 0));
    }
    
    @Override
    public ChannelMetadata metadata() {
        return NioUdtMessageAcceptorChannel.METADATA;
    }
}
