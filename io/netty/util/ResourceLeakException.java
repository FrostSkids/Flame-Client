// 
// Decompiled by Procyon v0.5.36
// 

package io.netty.util;

import java.util.Arrays;

@Deprecated
public class ResourceLeakException extends RuntimeException
{
    private final /* synthetic */ StackTraceElement[] cachedStackTrace;
    private static final /* synthetic */ int[] lllIIIlIIlIIlI;
    
    private static boolean lIIlllIlIIllllII(final int llllllllllllIllIIIIIllIIIlIIlIII, final int llllllllllllIllIIIIIllIIIlIIIlll) {
        return llllllllllllIllIIIIIllIIIlIIlIII < llllllllllllIllIIIIIllIIIlIIIlll;
    }
    
    @Override
    public int hashCode() {
        final StackTraceElement[] llllllllllllIllIIIIIllIIIlIllIIl = this.cachedStackTrace;
        int llllllllllllIllIIIIIllIIIlIllIII = ResourceLeakException.lllIIIlIIlIIlI[0];
        final StackTraceElement[] llllllllllllIllIIIIIllIIIlIlllIl = llllllllllllIllIIIIIllIIIlIllIIl;
        final int llllllllllllIllIIIIIllIIIlIlllII = llllllllllllIllIIIIIllIIIlIlllIl.length;
        int llllllllllllIllIIIIIllIIIlIllIll = ResourceLeakException.lllIIIlIIlIIlI[0];
        while (lIIlllIlIIllllII(llllllllllllIllIIIIIllIIIlIllIll, llllllllllllIllIIIIIllIIIlIlllII)) {
            final StackTraceElement llllllllllllIllIIIIIllIIIlIllllI = llllllllllllIllIIIIIllIIIlIlllIl[llllllllllllIllIIIIIllIIIlIllIll];
            llllllllllllIllIIIIIllIIIlIllIII = llllllllllllIllIIIIIllIIIlIllIII * ResourceLeakException.lllIIIlIIlIIlI[1] + llllllllllllIllIIIIIllIIIlIllllI.hashCode();
            ++llllllllllllIllIIIIIllIIIlIllIll;
            "".length();
            if ((0x7F ^ 0x7B) <= 0) {
                return (0x4 ^ 0x15) & ~(0x8B ^ 0x9A);
            }
        }
        return llllllllllllIllIIIIIllIIIlIllIII;
    }
    
    public ResourceLeakException() {
        this.cachedStackTrace = this.getStackTrace();
    }
    
    static {
        lIIlllIlIIlllIll();
    }
    
    private static boolean lIIlllIlIIllllIl(final int llllllllllllIllIIIIIllIIIlIIIIIl) {
        return llllllllllllIllIIIIIllIIIlIIIIIl == 0;
    }
    
    @Override
    public boolean equals(final Object llllllllllllIllIIIIIllIIIlIIllIl) {
        if (lIIlllIlIIllllIl((llllllllllllIllIIIIIllIIIlIIllIl instanceof ResourceLeakException) ? 1 : 0)) {
            return ResourceLeakException.lllIIIlIIlIIlI[0] != 0;
        }
        if (lIIlllIlIIlllllI(llllllllllllIllIIIIIllIIIlIIllIl, this)) {
            return ResourceLeakException.lllIIIlIIlIIlI[2] != 0;
        }
        return Arrays.equals(this.cachedStackTrace, ((ResourceLeakException)llllllllllllIllIIIIIllIIIlIIllIl).cachedStackTrace);
    }
    
    private static boolean lIIlllIlIIlllllI(final Object llllllllllllIllIIIIIllIIIlIIIlII, final Object llllllllllllIllIIIIIllIIIlIIIIll) {
        return llllllllllllIllIIIIIllIIIlIIIlII == llllllllllllIllIIIIIllIIIlIIIIll;
    }
    
    private static void lIIlllIlIIlllIll() {
        (lllIIIlIIlIIlI = new int[3])[0] = ((0x1D ^ 0x5A) & ~(0xCC ^ 0x8B));
        ResourceLeakException.lllIIIlIIlIIlI[1] = (0xB0 ^ 0xAF);
        ResourceLeakException.lllIIIlIIlIIlI[2] = " ".length();
    }
    
    public ResourceLeakException(final String llllllllllllIllIIIIIllIIIlllIIII, final Throwable llllllllllllIllIIIIIllIIIllIllll) {
        super(llllllllllllIllIIIIIllIIIlllIIII, llllllllllllIllIIIIIllIIIllIllll);
        this.cachedStackTrace = this.getStackTrace();
    }
    
    public ResourceLeakException(final String llllllllllllIllIIIIIllIIIlllIlll) {
        super(llllllllllllIllIIIIIllIIIlllIlll);
        this.cachedStackTrace = this.getStackTrace();
    }
    
    public ResourceLeakException(final Throwable llllllllllllIllIIIIIllIIIllIIllI) {
        super(llllllllllllIllIIIIIllIIIllIIllI);
        this.cachedStackTrace = this.getStackTrace();
    }
}
