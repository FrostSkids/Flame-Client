// 
// Decompiled by Procyon v0.5.36
// 

package io.netty.handler.codec.http;

import io.netty.util.CharsetUtil;
import java.nio.charset.Charset;

public final class HttpConstants
{
    private static final /* synthetic */ int[] lIIIIlIIIllIlI;
    
    private HttpConstants() {
    }
    
    private static void lIlllIIIIIllIIl() {
        (lIIIIlIIIllIlI = new int[9])[0] = (0xFB ^ 0xC0);
        HttpConstants.lIIIIlIIIllIlI[1] = (0x4F ^ 0x75);
        HttpConstants.lIIIIlIIIllIlI[2] = (0x9 ^ 0x29);
        HttpConstants.lIIIIlIIIllIlI[3] = (0x35 ^ 0x4E ^ (0xE2 ^ 0x94));
        HttpConstants.lIIIIlIIIllIlI[4] = (0x1A ^ 0x10);
        HttpConstants.lIIIIlIIIllIlI[5] = (0x67 ^ 0x4B);
        HttpConstants.lIIIIlIIIllIlI[6] = (0x41 ^ 0x48);
        HttpConstants.lIIIIlIIIllIlI[7] = (0xCC ^ 0xAE ^ (0x77 ^ 0x28));
        HttpConstants.lIIIIlIIIllIlI[8] = (0x69 ^ 0x4B);
    }
    
    static {
        lIlllIIIIIllIIl();
        SEMICOLON = (byte)HttpConstants.lIIIIlIIIllIlI[0];
        COLON = (byte)HttpConstants.lIIIIlIIIllIlI[1];
        SP = (byte)HttpConstants.lIIIIlIIIllIlI[2];
        CR = (byte)HttpConstants.lIIIIlIIIllIlI[3];
        LF = (byte)HttpConstants.lIIIIlIIIllIlI[4];
        COMMA = (byte)HttpConstants.lIIIIlIIIllIlI[5];
        HT = (byte)HttpConstants.lIIIIlIIIllIlI[6];
        EQUALS = (byte)HttpConstants.lIIIIlIIIllIlI[7];
        DOUBLE_QUOTE = (byte)HttpConstants.lIIIIlIIIllIlI[8];
        DEFAULT_CHARSET = CharsetUtil.UTF_8;
    }
}
