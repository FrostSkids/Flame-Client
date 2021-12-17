// 
// Decompiled by Procyon v0.5.36
// 

package io.netty.handler.codec;

import io.netty.buffer.Unpooled;
import io.netty.buffer.ByteBuf;

public final class Delimiters
{
    private static final /* synthetic */ int[] lllIIlIlIIIlII;
    
    private Delimiters() {
    }
    
    public static ByteBuf[] nulDelimiter() {
        final ByteBuf[] array = new ByteBuf[Delimiters.lllIIlIlIIIlII[0]];
        final int n = Delimiters.lllIIlIlIIIlII[1];
        final byte[] lllllllllllllIlIIlIIIlIIlIIIIlll = new byte[Delimiters.lllIIlIlIIIlII[0]];
        lllllllllllllIlIIlIIIlIIlIIIIlll[Delimiters.lllIIlIlIIIlII[1]] = (byte)Delimiters.lllIIlIlIIIlII[1];
        array[n] = Unpooled.wrappedBuffer(lllllllllllllIlIIlIIIlIIlIIIIlll);
        return array;
    }
    
    private static void lIIllllllIIlIllI() {
        (lllIIlIlIIIlII = new int[5])[0] = " ".length();
        Delimiters.lllIIlIlIIIlII[1] = ((0xF2 ^ 0xA1) & ~(0x7 ^ 0x54));
        Delimiters.lllIIlIlIIIlII[2] = "  ".length();
        Delimiters.lllIIlIlIIIlII[3] = (0x1D ^ 0x10);
        Delimiters.lllIIlIlIIIlII[4] = (0xBD ^ 0xB3 ^ (0x98 ^ 0x9C));
    }
    
    public static ByteBuf[] lineDelimiter() {
        final ByteBuf[] array = new ByteBuf[Delimiters.lllIIlIlIIIlII[2]];
        final int n = Delimiters.lllIIlIlIIIlII[1];
        final byte[] lllllllllllllIlIIlIIIlIIlIIIIlll = new byte[Delimiters.lllIIlIlIIIlII[2]];
        lllllllllllllIlIIlIIIlIIlIIIIlll[Delimiters.lllIIlIlIIIlII[1]] = (byte)Delimiters.lllIIlIlIIIlII[3];
        lllllllllllllIlIIlIIIlIIlIIIIlll[Delimiters.lllIIlIlIIIlII[0]] = (byte)Delimiters.lllIIlIlIIIlII[4];
        array[n] = Unpooled.wrappedBuffer(lllllllllllllIlIIlIIIlIIlIIIIlll);
        final int n2 = Delimiters.lllIIlIlIIIlII[0];
        final byte[] lllllllllllllIlIIlIIIlIIlIIIIlll2 = new byte[Delimiters.lllIIlIlIIIlII[0]];
        lllllllllllllIlIIlIIIlIIlIIIIlll2[Delimiters.lllIIlIlIIIlII[1]] = (byte)Delimiters.lllIIlIlIIIlII[4];
        array[n2] = Unpooled.wrappedBuffer(lllllllllllllIlIIlIIIlIIlIIIIlll2);
        return array;
    }
    
    static {
        lIIllllllIIlIllI();
    }
}
