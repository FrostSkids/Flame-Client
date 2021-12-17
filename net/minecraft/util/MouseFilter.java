// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.util;

public class MouseFilter
{
    private /* synthetic */ float field_76334_b;
    private /* synthetic */ float field_76336_a;
    private /* synthetic */ float field_76335_c;
    
    public void reset() {
        this.field_76336_a = 0.0f;
        this.field_76334_b = 0.0f;
        this.field_76335_c = 0.0f;
    }
    
    private static boolean lIlIlIlIIllIIlI(final int lllllllllllllIlIllIllIlIIlIIIlIl) {
        return lllllllllllllIlIllIllIlIIlIIIlIl < 0;
    }
    
    private static int lIlIlIlIIlIlllI(final float n, final float n2) {
        return fcmpl(n, n2);
    }
    
    public float smooth(float lllllllllllllIlIllIllIlIIlIlIIll, final float lllllllllllllIlIllIllIlIIlIlIIIl) {
        this.field_76336_a += lllllllllllllIlIllIllIlIIlIlIIll;
        lllllllllllllIlIllIllIlIIlIlIIll = (this.field_76336_a - this.field_76334_b) * lllllllllllllIlIllIllIlIIlIlIIIl;
        this.field_76335_c += (lllllllllllllIlIllIllIlIIlIlIIll - this.field_76335_c) * 0.5f;
        if ((lIlIlIlIIllIIII(lIlIlIlIIlIlllI(lllllllllllllIlIllIllIlIIlIlIIll, 0.0f)) && !lIlIlIlIIllIIIl(lIlIlIlIIlIlllI(lllllllllllllIlIllIllIlIIlIlIIll, this.field_76335_c))) || (lIlIlIlIIllIIlI(lIlIlIlIIlIllll(lllllllllllllIlIllIllIlIIlIlIIll, 0.0f)) && lIlIlIlIIllIIlI(lIlIlIlIIlIllll(lllllllllllllIlIllIllIlIIlIlIIll, this.field_76335_c)))) {
            lllllllllllllIlIllIllIlIIlIlIIll = this.field_76335_c;
        }
        this.field_76334_b += lllllllllllllIlIllIllIlIIlIlIIll;
        return lllllllllllllIlIllIllIlIIlIlIIll;
    }
    
    private static int lIlIlIlIIlIllll(final float n, final float n2) {
        return fcmpg(n, n2);
    }
    
    private static boolean lIlIlIlIIllIIII(final int lllllllllllllIlIllIllIlIIIlllllI) {
        return lllllllllllllIlIllIllIlIIIlllllI > 0;
    }
    
    private static boolean lIlIlIlIIllIIIl(final int lllllllllllllIlIllIllIlIIlIIIIII) {
        return lllllllllllllIlIllIllIlIIlIIIIII <= 0;
    }
}
