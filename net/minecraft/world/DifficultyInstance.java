// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.world;

import net.minecraft.util.MathHelper;

public class DifficultyInstance
{
    private final /* synthetic */ EnumDifficulty worldDifficulty;
    private final /* synthetic */ float additionalDifficulty;
    private static final /* synthetic */ int[] lIIIIIllllIllI;
    
    private static boolean lIllIllllIllIII(final int lllllllllllllIlIIllIlIlIlllIllII) {
        return lllllllllllllIlIIllIlIlIlllIllII > 0;
    }
    
    static {
        lIllIllllIlIlII();
    }
    
    private static int lIllIllllIlIlIl(final float n, final float n2) {
        return fcmpg(n, n2);
    }
    
    public float getAdditionalDifficulty() {
        return this.additionalDifficulty;
    }
    
    private static boolean lIllIllllIllIlI(final int lllllllllllllIlIIllIlIlIllllIIII) {
        return lllllllllllllIlIIllIlIlIllllIIII != 0;
    }
    
    private float calculateAdditionalDifficulty(final EnumDifficulty lllllllllllllIlIIllIlIllIIIIIlIl, final long lllllllllllllIlIIllIlIlIllllllII, final long lllllllllllllIlIIllIlIlIlllllIll, final float lllllllllllllIlIIllIlIllIIIIIIlI) {
        if (lIllIllllIllIIl(lllllllllllllIlIIllIlIllIIIIIlIl, EnumDifficulty.PEACEFUL)) {
            return 0.0f;
        }
        int n;
        if (lIllIllllIllIIl(lllllllllllllIlIIllIlIllIIIIIlIl, EnumDifficulty.HARD)) {
            n = DifficultyInstance.lIIIIIllllIllI[0];
            "".length();
            if (-" ".length() >= 0) {
                return 0.0f;
            }
        }
        else {
            n = DifficultyInstance.lIIIIIllllIllI[1];
        }
        final boolean lllllllllllllIlIIllIlIllIIIIIIIl = n != 0;
        float lllllllllllllIlIIllIlIllIIIIIIII = 0.75f;
        final float lllllllllllllIlIIllIlIlIllllllll = MathHelper.clamp_float((lllllllllllllIlIIllIlIlIllllllII - 72000.0f) / 1440000.0f, 0.0f, 1.0f) * 0.25f;
        lllllllllllllIlIIllIlIllIIIIIIII += lllllllllllllIlIIllIlIlIllllllll;
        final float n2;
        float lllllllllllllIlIIllIlIlIlllllllI = n2 = 0.0f;
        final float clamp_float = MathHelper.clamp_float(lllllllllllllIlIIllIlIlIlllllIll / 3600000.0f, 0.0f, 1.0f);
        float n3;
        if (lIllIllllIllIlI(lllllllllllllIlIIllIlIllIIIIIIIl ? 1 : 0)) {
            n3 = 1.0f;
            "".length();
            if ((0x8C ^ 0x88) <= 0) {
                return 0.0f;
            }
        }
        else {
            n3 = 0.75f;
        }
        lllllllllllllIlIIllIlIlIlllllllI = n2 + clamp_float * n3;
        lllllllllllllIlIIllIlIlIlllllllI += MathHelper.clamp_float(lllllllllllllIlIIllIlIllIIIIIIlI * 0.25f, 0.0f, lllllllllllllIlIIllIlIlIllllllll);
        if (lIllIllllIllIIl(lllllllllllllIlIIllIlIllIIIIIlIl, EnumDifficulty.EASY)) {
            lllllllllllllIlIIllIlIlIlllllllI *= 0.5f;
        }
        lllllllllllllIlIIllIlIllIIIIIIII += lllllllllllllIlIIllIlIlIlllllllI;
        return lllllllllllllIlIIllIlIllIIIIIlIl.getDifficultyId() * lllllllllllllIlIIllIlIllIIIIIIII;
    }
    
    private static boolean lIllIllllIlIlll(final int lllllllllllllIlIIllIlIlIlllIlllI) {
        return lllllllllllllIlIIllIlIlIlllIlllI < 0;
    }
    
    private static int lIllIllllIlIllI(final float n, final float n2) {
        return fcmpl(n, n2);
    }
    
    public DifficultyInstance(final EnumDifficulty lllllllllllllIlIIllIlIllIIlIIlll, final long lllllllllllllIlIIllIlIllIIIlllll, final long lllllllllllllIlIIllIlIllIIlIIlIl, final float lllllllllllllIlIIllIlIllIIIlllII) {
        this.worldDifficulty = lllllllllllllIlIIllIlIllIIlIIlll;
        this.additionalDifficulty = this.calculateAdditionalDifficulty(lllllllllllllIlIIllIlIllIIlIIlll, lllllllllllllIlIIllIlIllIIIlllll, lllllllllllllIlIIllIlIllIIlIIlIl, lllllllllllllIlIIllIlIllIIIlllII);
    }
    
    private static boolean lIllIllllIllIIl(final Object lllllllllllllIlIIllIlIlIllllIIll, final Object lllllllllllllIlIIllIlIlIllllIIlI) {
        return lllllllllllllIlIIllIlIlIllllIIll == lllllllllllllIlIIllIlIlIllllIIlI;
    }
    
    private static void lIllIllllIlIlII() {
        (lIIIIIllllIllI = new int[2])[0] = " ".length();
        DifficultyInstance.lIIIIIllllIllI[1] = ((0x36 ^ 0x22 ^ (0xB ^ 0x5C)) & (0xF7 ^ 0x92 ^ (0x18 ^ 0x3E) ^ -" ".length()));
    }
    
    public float getClampedAdditionalDifficulty() {
        float n;
        if (lIllIllllIlIlll(lIllIllllIlIlIl(this.additionalDifficulty, 2.0f))) {
            n = 0.0f;
            "".length();
            if (-" ".length() >= 0) {
                return 0.0f;
            }
        }
        else if (lIllIllllIllIII(lIllIllllIlIllI(this.additionalDifficulty, 4.0f))) {
            n = 1.0f;
            "".length();
            if (-(0xC0 ^ 0x9F ^ (0x36 ^ 0x6D)) > 0) {
                return 0.0f;
            }
        }
        else {
            n = (this.additionalDifficulty - 2.0f) / 2.0f;
        }
        return n;
    }
}
