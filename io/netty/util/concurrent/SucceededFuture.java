// 
// Decompiled by Procyon v0.5.36
// 

package io.netty.util.concurrent;

public final class SucceededFuture<V> extends CompleteFuture<V>
{
    private final /* synthetic */ V result;
    private static final /* synthetic */ int[] lIIllIIlIIIlIl;
    
    @Override
    public Throwable cause() {
        return null;
    }
    
    private static void llIlIlllIIIIIlI() {
        (lIIllIIlIIIlIl = new int[1])[0] = " ".length();
    }
    
    public SucceededFuture(final EventExecutor lllllllllllllIIlIllIIIlIlllIllll, final V lllllllllllllIIlIllIIIlIlllIlllI) {
        super(lllllllllllllIIlIllIIIlIlllIllll);
        this.result = lllllllllllllIIlIllIIIlIlllIlllI;
    }
    
    static {
        llIlIlllIIIIIlI();
    }
    
    @Override
    public V getNow() {
        return this.result;
    }
    
    @Override
    public boolean isSuccess() {
        return SucceededFuture.lIIllIIlIIIlIl[0] != 0;
    }
}
