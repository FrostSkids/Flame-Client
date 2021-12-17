// 
// Decompiled by Procyon v0.5.36
// 

package io.netty.channel.udt.nio;

import com.barchart.udt.TypeUDT;
import com.barchart.udt.nio.SocketChannelUDT;
import io.netty.channel.Channel;
import java.util.List;
import io.netty.channel.ChannelMetadata;

public class NioUdtByteAcceptorChannel extends NioUdtAcceptorChannel
{
    private static final /* synthetic */ int[] lllllIlllIlII;
    private static final /* synthetic */ ChannelMetadata METADATA;
    
    @Override
    protected int doReadMessages(final List<Object> lllllllllllllIlIlIllIIlIIIllIlIl) throws Exception {
        final SocketChannelUDT lllllllllllllIlIlIllIIlIIIllIlII = this.javaChannel().accept();
        if (lIlIllllIIlIlll(lllllllllllllIlIlIllIIlIIIllIlII)) {
            return NioUdtByteAcceptorChannel.lllllIlllIlII[0];
        }
        lllllllllllllIlIlIllIIlIIIllIlIl.add(new NioUdtByteConnectorChannel(this, lllllllllllllIlIlIllIIlIIIllIlII));
        "".length();
        return NioUdtByteAcceptorChannel.lllllIlllIlII[1];
    }
    
    private static void lIlIllllIIlIllI() {
        (lllllIlllIlII = new int[2])[0] = ((5 + 196 + 28 + 14 ^ 49 + 132 - 35 + 16) & (0xD7 ^ 0xBC ^ (0xBC ^ 0x86) ^ -" ".length()));
        NioUdtByteAcceptorChannel.lllllIlllIlII[1] = " ".length();
    }
    
    static {
        lIlIllllIIlIllI();
        METADATA = new ChannelMetadata((boolean)(NioUdtByteAcceptorChannel.lllllIlllIlII[0] != 0));
    }
    
    public NioUdtByteAcceptorChannel() {
        super(TypeUDT.STREAM);
    }
    
    @Override
    public ChannelMetadata metadata() {
        return NioUdtByteAcceptorChannel.METADATA;
    }
    
    private static boolean lIlIllllIIlIlll(final Object lllllllllllllIlIlIllIIlIIIlIlllI) {
        return lllllllllllllIlIlIllIIlIIIlIlllI == null;
    }
}
