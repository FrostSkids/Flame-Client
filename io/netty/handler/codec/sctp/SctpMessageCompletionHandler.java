// 
// Decompiled by Procyon v0.5.36
// 

package io.netty.handler.codec.sctp;

import io.netty.buffer.Unpooled;
import java.util.List;
import io.netty.channel.ChannelHandlerContext;
import java.util.HashMap;
import io.netty.buffer.ByteBuf;
import java.util.Map;
import io.netty.channel.sctp.SctpMessage;
import io.netty.handler.codec.MessageToMessageDecoder;

public class SctpMessageCompletionHandler extends MessageToMessageDecoder<SctpMessage>
{
    private final /* synthetic */ Map<Integer, ByteBuf> fragments;
    private static final /* synthetic */ int[] lIIllIlIIIllll;
    
    private static boolean llIllIIIIllllII(final int lllllllllllllIIlIlIllIIllllIIIIl) {
        return lllllllllllllIIlIlIllIIllllIIIIl == 0;
    }
    
    public SctpMessageCompletionHandler() {
        this.fragments = new HashMap<Integer, ByteBuf>();
    }
    
    private static void llIllIIIIlllIlI() {
        (lIIllIlIIIllll = new int[3])[0] = "  ".length();
        SctpMessageCompletionHandler.lIIllIlIIIllll[1] = ((0x44 ^ 0x2F ^ (0xD2 ^ 0xB1)) & (0x52 ^ 0x37 ^ (0xCD ^ 0xA0) ^ -" ".length()));
        SctpMessageCompletionHandler.lIIllIlIIIllll[2] = " ".length();
    }
    
    static {
        llIllIIIIlllIlI();
    }
    
    private static boolean llIllIIIIlllIll(final int lllllllllllllIIlIlIllIIllllIIllI) {
        return lllllllllllllIIlIlIllIIllllIIllI != 0;
    }
    
    @Override
    protected void decode(final ChannelHandlerContext lllllllllllllIIlIlIllIlIIIIllllI, final SctpMessage lllllllllllllIIlIlIllIlIIIIIlllI, final List<Object> lllllllllllllIIlIlIllIlIIIIllIlI) throws Exception {
        final ByteBuf lllllllllllllIIlIlIllIlIIIIllIII = lllllllllllllIIlIlIllIlIIIIIlllI.content();
        final int lllllllllllllIIlIlIllIlIIIIlIlll = lllllllllllllIIlIlIllIlIIIIIlllI.protocolIdentifier();
        final int lllllllllllllIIlIlIllIlIIIIlIlIl = lllllllllllllIIlIlIllIlIIIIIlllI.streamIdentifier();
        final boolean lllllllllllllIIlIlIllIlIIIIlIIll = lllllllllllllIIlIlIllIlIIIIIlllI.isComplete();
        ByteBuf lllllllllllllIIlIlIllIlIIIIlIIIl = null;
        if (llIllIIIIlllIll(this.fragments.containsKey(lllllllllllllIIlIlIllIlIIIIlIlIl) ? 1 : 0)) {
            final ByteBuf lllllllllllllIIlIlIllIlIIIlIIIll = this.fragments.remove(lllllllllllllIIlIlIllIlIIIIlIlIl);
            "".length();
            if (-" ".length() > 0) {
                return;
            }
        }
        else {
            lllllllllllllIIlIlIllIlIIIIlIIIl = Unpooled.EMPTY_BUFFER;
        }
        if (llIllIIIIlllIll(lllllllllllllIIlIlIllIlIIIIlIIll ? 1 : 0) && llIllIIIIllllII(lllllllllllllIIlIlIllIlIIIIlIIIl.isReadable() ? 1 : 0)) {
            lllllllllllllIIlIlIllIlIIIIllIlI.add(lllllllllllllIIlIlIllIlIIIIIlllI);
            "".length();
            "".length();
            if ("   ".length() < "  ".length()) {
                return;
            }
        }
        else if (llIllIIIIllllII(lllllllllllllIIlIlIllIlIIIIlIIll ? 1 : 0) && llIllIIIIlllIll(lllllllllllllIIlIlIllIlIIIIlIIIl.isReadable() ? 1 : 0)) {
            final Map<Integer, ByteBuf> fragments = this.fragments;
            final Integer value = lllllllllllllIIlIlIllIlIIIIlIlIl;
            final ByteBuf[] lllllllllllllIlIIlIIIlIIIlllIIlI = new ByteBuf[SctpMessageCompletionHandler.lIIllIlIIIllll[0]];
            lllllllllllllIlIIlIIIlIIIlllIIlI[SctpMessageCompletionHandler.lIIllIlIIIllll[1]] = lllllllllllllIIlIlIllIlIIIIlIIIl;
            lllllllllllllIlIIlIIIlIIIlllIIlI[SctpMessageCompletionHandler.lIIllIlIIIllll[2]] = lllllllllllllIIlIlIllIlIIIIllIII;
            fragments.put(value, Unpooled.wrappedBuffer(lllllllllllllIlIIlIIIlIIIlllIIlI));
            "".length();
            "".length();
            if ((0xC2 ^ 0xC6) == -" ".length()) {
                return;
            }
        }
        else if (llIllIIIIlllIll(lllllllllllllIIlIlIllIlIIIIlIIll ? 1 : 0) && llIllIIIIlllIll(lllllllllllllIIlIlIllIlIIIIlIIIl.isReadable() ? 1 : 0)) {
            this.fragments.remove(lllllllllllllIIlIlIllIlIIIIlIlIl);
            "".length();
            final int lllllllllllllIIllllIIIlIIIlllIII = lllllllllllllIIlIlIllIlIIIIlIlll;
            final int lllllllllllllIIllllIIIlIIIlllIll = lllllllllllllIIlIlIllIlIIIIlIlIl;
            final ByteBuf[] lllllllllllllIlIIlIIIlIIIlllIIlI2 = new ByteBuf[SctpMessageCompletionHandler.lIIllIlIIIllll[0]];
            lllllllllllllIlIIlIIIlIIIlllIIlI2[SctpMessageCompletionHandler.lIIllIlIIIllll[1]] = lllllllllllllIIlIlIllIlIIIIlIIIl;
            lllllllllllllIlIIlIIIlIIIlllIIlI2[SctpMessageCompletionHandler.lIIllIlIIIllll[2]] = lllllllllllllIIlIlIllIlIIIIllIII;
            final SctpMessage lllllllllllllIIlIlIllIlIIIlIIIIl = new SctpMessage(lllllllllllllIIllllIIIlIIIlllIII, lllllllllllllIIllllIIIlIIIlllIll, Unpooled.wrappedBuffer(lllllllllllllIlIIlIIIlIIIlllIIlI2));
            lllllllllllllIIlIlIllIlIIIIllIlI.add(lllllllllllllIIlIlIllIlIIIlIIIIl);
            "".length();
            "".length();
            if (-" ".length() == (0x3D ^ 0x2A ^ (0xD0 ^ 0xC3))) {
                return;
            }
        }
        else {
            this.fragments.put(lllllllllllllIIlIlIllIlIIIIlIlIl, lllllllllllllIIlIlIllIlIIIIllIII);
            "".length();
        }
        lllllllllllllIIlIlIllIlIIIIllIII.retain();
        "".length();
    }
}
