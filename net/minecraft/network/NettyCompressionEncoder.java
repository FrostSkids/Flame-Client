// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.network;

import io.netty.channel.ChannelHandlerContext;
import java.util.zip.Deflater;
import io.netty.buffer.ByteBuf;
import io.netty.handler.codec.MessageToByteEncoder;

public class NettyCompressionEncoder extends MessageToByteEncoder<ByteBuf>
{
    private static final /* synthetic */ int[] llIllIIIllIIll;
    private final /* synthetic */ Deflater deflater;
    private final /* synthetic */ byte[] buffer;
    private /* synthetic */ int treshold;
    
    private static void lIIlIllIlIIIlIII() {
        (llIllIIIllIIll = new int[2])[0] = (0xFFFFBC44 & 0x63BB);
        NettyCompressionEncoder.llIllIIIllIIll[1] = ((164 + 70 - 94 + 78 ^ 70 + 124 - 192 + 142) & (10 + 40 - 23 + 209 ^ 65 + 113 - 91 + 79 ^ -" ".length()));
    }
    
    private static boolean lIIlIllIlIIIlIIl(final int llllllllllllIllIlIIIIIIIllIlIlIl, final int llllllllllllIllIlIIIIIIIllIlIlII) {
        return llllllllllllIllIlIIIIIIIllIlIlIl < llllllllllllIllIlIIIIIIIllIlIlII;
    }
    
    static {
        lIIlIllIlIIIlIII();
    }
    
    private static boolean lIIlIllIlIIIlIlI(final int llllllllllllIllIlIIIIIIIllIlIIlI) {
        return llllllllllllIllIlIIIIIIIllIlIIlI != 0;
    }
    
    @Override
    protected void encode(final ChannelHandlerContext llllllllllllIllIlIIIIIIIllllIIll, final ByteBuf llllllllllllIllIlIIIIIIIllllIIlI, final ByteBuf llllllllllllIllIlIIIIIIIllllIIIl) throws Exception {
        final int llllllllllllIllIlIIIIIIIllllIIII = llllllllllllIllIlIIIIIIIllllIIlI.readableBytes();
        final PacketBuffer llllllllllllIllIlIIIIIIIlllIllll = new PacketBuffer(llllllllllllIllIlIIIIIIIllllIIIl);
        if (lIIlIllIlIIIlIIl(llllllllllllIllIlIIIIIIIllllIIII, this.treshold)) {
            llllllllllllIllIlIIIIIIIlllIllll.writeVarIntToBuffer(NettyCompressionEncoder.llIllIIIllIIll[1]);
            llllllllllllIllIlIIIIIIIlllIllll.writeBytes(llllllllllllIllIlIIIIIIIllllIIlI);
            "".length();
            "".length();
            if ("   ".length() < -" ".length()) {
                return;
            }
        }
        else {
            final byte[] llllllllllllIllIlIIIIIIIlllIlllI = new byte[llllllllllllIllIlIIIIIIIllllIIII];
            llllllllllllIllIlIIIIIIIllllIIlI.readBytes(llllllllllllIllIlIIIIIIIlllIlllI);
            "".length();
            llllllllllllIllIlIIIIIIIlllIllll.writeVarIntToBuffer(llllllllllllIllIlIIIIIIIlllIlllI.length);
            this.deflater.setInput(llllllllllllIllIlIIIIIIIlllIlllI, NettyCompressionEncoder.llIllIIIllIIll[1], llllllllllllIllIlIIIIIIIllllIIII);
            this.deflater.finish();
            "".length();
            if (-" ".length() >= 0) {
                return;
            }
            while (!lIIlIllIlIIIlIlI(this.deflater.finished() ? 1 : 0)) {
                final int llllllllllllIllIlIIIIIIIlllIllIl = this.deflater.deflate(this.buffer);
                llllllllllllIllIlIIIIIIIlllIllll.writeBytes(this.buffer, NettyCompressionEncoder.llIllIIIllIIll[1], llllllllllllIllIlIIIIIIIlllIllIl);
                "".length();
            }
            this.deflater.reset();
        }
    }
    
    public NettyCompressionEncoder(final int llllllllllllIllIlIIIIIIIlllllllI) {
        this.buffer = new byte[NettyCompressionEncoder.llIllIIIllIIll[0]];
        this.treshold = llllllllllllIllIlIIIIIIIlllllllI;
        this.deflater = new Deflater();
    }
    
    public void setCompressionTreshold(final int llllllllllllIllIlIIIIIIIlllIIIlI) {
        this.treshold = llllllllllllIllIlIIIIIIIlllIIIlI;
    }
}
