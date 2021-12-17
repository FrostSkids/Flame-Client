// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.util;

public class FrameTimer
{
    private /* synthetic */ int field_181754_c;
    private /* synthetic */ int field_181755_d;
    private /* synthetic */ int field_181753_b;
    private final /* synthetic */ long[] field_181752_a;
    private static final /* synthetic */ int[] llIlIllllIIlll;
    
    public int func_181749_a() {
        return this.field_181753_b;
    }
    
    public int func_181750_b() {
        return this.field_181755_d;
    }
    
    static {
        lIIlIlIllllllIlI();
    }
    
    public FrameTimer() {
        this.field_181752_a = new long[FrameTimer.llIlIllllIIlll[0]];
    }
    
    private static void lIIlIlIllllllIlI() {
        (llIlIllllIIlll = new int[3])[0] = (0x49 ^ 0x5F) + (0xEA ^ 0xA2) - -(0x8B ^ 0xA9) + (0x68 ^ 0x18);
        FrameTimer.llIlIllllIIlll[1] = " ".length();
        FrameTimer.llIlIllllIIlll[2] = ((0xAB ^ 0x87 ^ (0xC0 ^ 0xB5)) & (0xBA ^ 0xA1 ^ (0xDB ^ 0x99) ^ -" ".length()));
    }
    
    public int func_181748_a(final long llllllllllllIllIlIIIllIIIIIlIlII, final int llllllllllllIllIlIIIllIIIIIlIllI) {
        final double llllllllllllIllIlIIIllIIIIIlIlIl = llllllllllllIllIlIIIllIIIIIlIlII / 1.6666666E7;
        return (int)(llllllllllllIllIlIIIllIIIIIlIlIl * llllllllllllIllIlIIIllIIIIIlIllI);
    }
    
    public int func_181751_b(final int llllllllllllIllIlIIIllIIIIIIlIII) {
        return llllllllllllIllIlIIIllIIIIIIlIII % FrameTimer.llIlIllllIIlll[0];
    }
    
    private static boolean lIIlIlIllllllIll(final int llllllllllllIllIlIIIllIIIIIIIIlI, final int llllllllllllIllIlIIIllIIIIIIIIIl) {
        return llllllllllllIllIlIIIllIIIIIIIIlI == llllllllllllIllIlIIIllIIIIIIIIIl;
    }
    
    private static boolean lIIlIlIlllllllII(final int llllllllllllIllIlIIIlIlllllllllI, final int llllllllllllIllIlIIIlIllllllllIl) {
        return llllllllllllIllIlIIIlIlllllllllI < llllllllllllIllIlIIIlIllllllllIl;
    }
    
    public void func_181747_a(final long llllllllllllIllIlIIIllIIIIIlllII) {
        this.field_181752_a[this.field_181755_d] = llllllllllllIllIlIIIllIIIIIlllII;
        this.field_181755_d += FrameTimer.llIlIllllIIlll[1];
        if (lIIlIlIllllllIll(this.field_181755_d, FrameTimer.llIlIllllIIlll[0])) {
            this.field_181755_d = FrameTimer.llIlIllllIIlll[2];
        }
        if (lIIlIlIlllllllII(this.field_181754_c, FrameTimer.llIlIllllIIlll[0])) {
            this.field_181753_b = FrameTimer.llIlIllllIIlll[2];
            this.field_181754_c += FrameTimer.llIlIllllIIlll[1];
            "".length();
            if (null != null) {
                return;
            }
        }
        else {
            this.field_181753_b = this.func_181751_b(this.field_181755_d + FrameTimer.llIlIllllIIlll[1]);
        }
    }
    
    public long[] func_181746_c() {
        return this.field_181752_a;
    }
}
