// 
// Decompiled by Procyon v0.5.36
// 

package io.netty.handler.codec.marshalling;

import org.jboss.marshalling.ByteInput;
import org.jboss.marshalling.Unmarshaller;
import io.netty.handler.codec.TooLongFrameException;
import java.util.List;
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.ReplayingDecoder;

public class CompatibleMarshallingDecoder extends ReplayingDecoder<Void>
{
    private static final /* synthetic */ int[] lIllllllIIlllI;
    private /* synthetic */ boolean discardingTooLongFrame;
    protected final /* synthetic */ UnmarshallerProvider provider;
    protected final /* synthetic */ int maxObjectSize;
    
    public CompatibleMarshallingDecoder(final UnmarshallerProvider llllllllllllIllllIIlIlIIIIIIIIIl, final int llllllllllllIllllIIlIlIIIIIIIIII) {
        this.provider = llllllllllllIllllIIlIlIIIIIIIIIl;
        this.maxObjectSize = llllllllllllIllllIIlIlIIIIIIIIII;
    }
    
    @Override
    protected void decode(final ChannelHandlerContext llllllllllllIllllIIlIIllllllIIIl, final ByteBuf llllllllllllIllllIIlIIlllllIlIlI, final List<Object> llllllllllllIllllIIlIIlllllIllll) throws Exception {
        if (lIIIIlIlllIIIlIl(this.discardingTooLongFrame ? 1 : 0)) {
            llllllllllllIllllIIlIIlllllIlIlI.skipBytes(this.actualReadableBytes());
            "".length();
            this.checkpoint();
            return;
        }
        final Unmarshaller llllllllllllIllllIIlIIlllllIlllI = this.provider.getUnmarshaller(llllllllllllIllllIIlIIllllllIIIl);
        ByteInput llllllllllllIllllIIlIIlllllIllIl = (ByteInput)new ChannelBufferByteInput(llllllllllllIllllIIlIIlllllIlIlI);
        if (lIIIIlIlllIIIllI(this.maxObjectSize, CompatibleMarshallingDecoder.lIllllllIIlllI[0])) {
            llllllllllllIllllIIlIIlllllIllIl = (ByteInput)new LimitingByteInput(llllllllllllIllllIIlIIlllllIllIl, this.maxObjectSize);
        }
        try {
            llllllllllllIllllIIlIIlllllIlllI.start(llllllllllllIllllIIlIIlllllIllIl);
            final Object llllllllllllIllllIIlIIllllllIlII = llllllllllllIllllIIlIIlllllIlllI.readObject();
            llllllllllllIllllIIlIIlllllIlllI.finish();
            llllllllllllIllllIIlIIlllllIllll.add(llllllllllllIllllIIlIIllllllIlII);
            "".length();
            llllllllllllIllllIIlIIlllllIlllI.close();
            "".length();
            if ((165 + 125 - 167 + 71 ^ 93 + 181 - 184 + 109) == 0x0) {
                return;
            }
        }
        catch (LimitingByteInput.TooBigObjectException llllllllllllIllllIIlIIllllllIIll) {
            this.discardingTooLongFrame = (CompatibleMarshallingDecoder.lIllllllIIlllI[1] != 0);
            throw new TooLongFrameException();
        }
        finally {
            llllllllllllIllllIIlIIlllllIlllI.close();
        }
    }
    
    private static boolean lIIIIlIlllIIIlIl(final int llllllllllllIllllIIlIIllllIIlIlI) {
        return llllllllllllIllllIIlIIllllIIlIlI != 0;
    }
    
    @Override
    protected void decodeLast(final ChannelHandlerContext llllllllllllIllllIIlIIllllIlllll, final ByteBuf llllllllllllIllllIIlIIllllIllIlI, final List<Object> llllllllllllIllllIIlIIllllIlllIl) throws Exception {
        switch (llllllllllllIllllIIlIIllllIllIlI.readableBytes()) {
            case 0: {
                return;
            }
            case 1: {
                if (lIIIIlIlllIIIlll(llllllllllllIllllIIlIIllllIllIlI.getByte(llllllllllllIllllIIlIIllllIllIlI.readerIndex()), CompatibleMarshallingDecoder.lIllllllIIlllI[2])) {
                    llllllllllllIllllIIlIIllllIllIlI.skipBytes(CompatibleMarshallingDecoder.lIllllllIIlllI[1]);
                    "".length();
                    return;
                }
                break;
            }
        }
        this.decode(llllllllllllIllllIIlIIllllIlllll, llllllllllllIllllIIlIIllllIllIlI, llllllllllllIllllIIlIIllllIlllIl);
    }
    
    private static void lIIIIlIlllIIIlII() {
        (lIllllllIIlllI = new int[3])[0] = (-" ".length() & (-1 & Integer.MAX_VALUE));
        CompatibleMarshallingDecoder.lIllllllIIlllI[1] = " ".length();
        CompatibleMarshallingDecoder.lIllllllIIlllI[2] = (0x67 ^ 0x45 ^ (0x11 ^ 0x4A));
    }
    
    @Override
    public void exceptionCaught(final ChannelHandlerContext llllllllllllIllllIIlIIllllIlIIIl, final Throwable llllllllllllIllllIIlIIllllIlIIll) throws Exception {
        if (lIIIIlIlllIIIlIl((llllllllllllIllllIIlIIllllIlIIll instanceof TooLongFrameException) ? 1 : 0)) {
            llllllllllllIllllIIlIIllllIlIIIl.close();
            "".length();
            "".length();
            if (-(0x44 ^ 0x41) >= 0) {
                return;
            }
        }
        else {
            super.exceptionCaught(llllllllllllIllllIIlIIllllIlIIIl, llllllllllllIllllIIlIIllllIlIIll);
        }
    }
    
    static {
        lIIIIlIlllIIIlII();
    }
    
    private static boolean lIIIIlIlllIIIlll(final int llllllllllllIllllIIlIIllllIIllIl, final int llllllllllllIllllIIlIIllllIIllII) {
        return llllllllllllIllllIIlIIllllIIllIl == llllllllllllIllllIIlIIllllIIllII;
    }
    
    private static boolean lIIIIlIlllIIIllI(final int llllllllllllIllllIIlIIllllIIIlll, final int llllllllllllIllllIIlIIllllIIIllI) {
        return llllllllllllIllllIIlIIllllIIIlll != llllllllllllIllllIIlIIllllIIIllI;
    }
}
