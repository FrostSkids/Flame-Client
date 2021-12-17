// 
// Decompiled by Procyon v0.5.36
// 

package io.netty.util.internal;

import java.security.cert.X509Certificate;
import java.nio.ByteBuffer;

public final class EmptyArrays
{
    private static final /* synthetic */ int[] llIlIlIlIlIIlI;
    
    private static void lIIlIlIIIllIIllI() {
        (llIlIlIlIlIIlI = new int[1])[0] = ((0x64 ^ 0x12 ^ (0xD5 ^ 0xB8)) & (0x37 ^ 0x19 ^ (0x55 ^ 0x60) ^ -" ".length()));
    }
    
    private EmptyArrays() {
    }
    
    static {
        lIIlIlIIIllIIllI();
        EMPTY_BYTES = new byte[EmptyArrays.llIlIlIlIlIIlI[0]];
        EMPTY_BOOLEANS = new boolean[EmptyArrays.llIlIlIlIlIIlI[0]];
        EMPTY_DOUBLES = new double[EmptyArrays.llIlIlIlIlIIlI[0]];
        EMPTY_FLOATS = new float[EmptyArrays.llIlIlIlIlIIlI[0]];
        EMPTY_INTS = new int[EmptyArrays.llIlIlIlIlIIlI[0]];
        EMPTY_SHORTS = new short[EmptyArrays.llIlIlIlIlIIlI[0]];
        EMPTY_LONGS = new long[EmptyArrays.llIlIlIlIlIIlI[0]];
        EMPTY_OBJECTS = new Object[EmptyArrays.llIlIlIlIlIIlI[0]];
        EMPTY_CLASSES = new Class[EmptyArrays.llIlIlIlIlIIlI[0]];
        EMPTY_STRINGS = new String[EmptyArrays.llIlIlIlIlIIlI[0]];
        EMPTY_STACK_TRACE = new StackTraceElement[EmptyArrays.llIlIlIlIlIIlI[0]];
        EMPTY_BYTE_BUFFERS = new ByteBuffer[EmptyArrays.llIlIlIlIlIIlI[0]];
        EMPTY_X509_CERTIFICATES = new X509Certificate[EmptyArrays.llIlIlIlIlIIlI[0]];
    }
}
