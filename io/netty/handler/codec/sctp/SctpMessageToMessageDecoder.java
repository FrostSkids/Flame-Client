// 
// Decompiled by Procyon v0.5.36
// 

package io.netty.handler.codec.sctp;

import io.netty.handler.codec.CodecException;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import io.netty.channel.sctp.SctpMessage;
import io.netty.handler.codec.MessageToMessageDecoder;

public abstract class SctpMessageToMessageDecoder extends MessageToMessageDecoder<SctpMessage>
{
    private static final /* synthetic */ int[] lIIlllIIIIlIll;
    private static final /* synthetic */ String[] lIIlllIIIIlIIl;
    
    static {
        llIllIlIlIIllIl();
        llIllIlIlIIIlll();
    }
    
    private static String llIllIlIlIIIllI(String lllllllllllllIIlIlIIIllllllllIIl, final String lllllllllllllIIlIlIIIlllllllllIl) {
        lllllllllllllIIlIlIIIllllllllIIl = new String(Base64.getDecoder().decode(lllllllllllllIIlIlIIIllllllllIIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIIlIlIIIlllllllllII = new StringBuilder();
        final char[] lllllllllllllIIlIlIIIllllllllIll = lllllllllllllIIlIlIIIlllllllllIl.toCharArray();
        int lllllllllllllIIlIlIIIllllllllIlI = SctpMessageToMessageDecoder.lIIlllIIIIlIll[1];
        final float lllllllllllllIIlIlIIIlllllllIlII = (Object)lllllllllllllIIlIlIIIllllllllIIl.toCharArray();
        final int lllllllllllllIIlIlIIIlllllllIIll = lllllllllllllIIlIlIIIlllllllIlII.length;
        Exception lllllllllllllIIlIlIIIlllllllIIlI = (Exception)SctpMessageToMessageDecoder.lIIlllIIIIlIll[1];
        while (llIllIlIlIlIIII((int)lllllllllllllIIlIlIIIlllllllIIlI, lllllllllllllIIlIlIIIlllllllIIll)) {
            final char lllllllllllllIIlIlIIIlllllllllll = lllllllllllllIIlIlIIIlllllllIlII[lllllllllllllIIlIlIIIlllllllIIlI];
            lllllllllllllIIlIlIIIlllllllllII.append((char)(lllllllllllllIIlIlIIIlllllllllll ^ lllllllllllllIIlIlIIIllllllllIll[lllllllllllllIIlIlIIIllllllllIlI % lllllllllllllIIlIlIIIllllllllIll.length]));
            "".length();
            ++lllllllllllllIIlIlIIIllllllllIlI;
            ++lllllllllllllIIlIlIIIlllllllIIlI;
            "".length();
            if ("   ".length() < 0) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIIlIlIIIlllllllllII);
    }
    
    private static void llIllIlIlIIllIl() {
        (lIIlllIIIIlIll = new int[2])[0] = " ".length();
        SctpMessageToMessageDecoder.lIIlllIIIIlIll[1] = ((0x79 ^ 0x1B ^ (0x70 ^ 0x24)) & (0xF5 ^ 0x9F ^ (0xD4 ^ 0x88) ^ -" ".length()));
    }
    
    @Override
    public boolean acceptInboundMessage(final Object lllllllllllllIIlIlIIlIIIIIIIlIll) throws Exception {
        if (!llIllIlIlIIllll((lllllllllllllIIlIlIIlIIIIIIIlIll instanceof SctpMessage) ? 1 : 0)) {
            return SctpMessageToMessageDecoder.lIIlllIIIIlIll[1] != 0;
        }
        final SctpMessage lllllllllllllIIlIlIIlIIIIIIIllIl = (SctpMessage)lllllllllllllIIlIlIIlIIIIIIIlIll;
        if (llIllIlIlIIllll(lllllllllllllIIlIlIIlIIIIIIIllIl.isComplete() ? 1 : 0)) {
            return SctpMessageToMessageDecoder.lIIlllIIIIlIll[0] != 0;
        }
        final String format = SctpMessageToMessageDecoder.lIIlllIIIIlIIl[SctpMessageToMessageDecoder.lIIlllIIIIlIll[1]];
        final Object[] args = new Object[SctpMessageToMessageDecoder.lIIlllIIIIlIll[0]];
        args[SctpMessageToMessageDecoder.lIIlllIIIIlIll[1]] = SctpMessageCompletionHandler.class.getSimpleName();
        throw new CodecException(String.format(format, args));
    }
    
    private static boolean llIllIlIlIIllll(final int lllllllllllllIIlIlIIIllllllIlIll) {
        return lllllllllllllIIlIlIIIllllllIlIll != 0;
    }
    
    private static void llIllIlIlIIIlll() {
        (lIIlllIIIIlIIl = new String[SctpMessageToMessageDecoder.lIIlllIIIIlIll[0]])[SctpMessageToMessageDecoder.lIIlllIIIIlIll[1]] = llIllIlIlIIIllI("EzQhPRA3NCZ4KiIlMhUcMiIjPxxhODF4Fy4lYjsWLCEuPQ0kfWIoFSQwMT1ZIDUmeFwycSs2WTU5J3gJKCEnNBAvNGI6HCc+MD1ZNTkrK1kpMCw8FSQj", "AQBXy");
    }
    
    private static boolean llIllIlIlIlIIII(final int lllllllllllllIIlIlIIIllllllIlllI, final int lllllllllllllIIlIlIIIllllllIllIl) {
        return lllllllllllllIIlIlIIIllllllIlllI < lllllllllllllIIlIlIIIllllllIllIl;
    }
}
