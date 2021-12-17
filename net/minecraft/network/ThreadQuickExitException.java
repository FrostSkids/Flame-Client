// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.network;

public final class ThreadQuickExitException extends RuntimeException
{
    private static final /* synthetic */ int[] lIIlIIlIlllllI;
    
    private ThreadQuickExitException() {
        this.setStackTrace(new StackTraceElement[ThreadQuickExitException.lIIlIIlIlllllI[0]]);
    }
    
    static {
        llIIllIllIIlIIl();
        field_179886_a = new ThreadQuickExitException();
    }
    
    private static void llIIllIllIIlIIl() {
        (lIIlIIlIlllllI = new int[1])[0] = ((0x4C ^ 0x9 ^ (0x67 ^ 0x32)) & (112 + 155 - 185 + 86 ^ 89 + 167 - 167 + 95 ^ -" ".length()));
    }
    
    @Override
    public synchronized Throwable fillInStackTrace() {
        this.setStackTrace(new StackTraceElement[ThreadQuickExitException.lIIlIIlIlllllI[0]]);
        return this;
    }
}
