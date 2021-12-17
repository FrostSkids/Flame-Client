// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.util;

public class Tuple<A, B>
{
    private /* synthetic */ A a;
    private /* synthetic */ B b;
    
    public A getFirst() {
        return this.a;
    }
    
    public Tuple(final A llllllllllllIlllIllIIIIIIllIlIll, final B llllllllllllIlllIllIIIIIIllIllIl) {
        this.a = llllllllllllIlllIllIIIIIIllIlIll;
        this.b = llllllllllllIlllIllIIIIIIllIllIl;
    }
    
    public B getSecond() {
        return this.b;
    }
}
