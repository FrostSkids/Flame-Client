// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.entity.boss;

public final class BossStatus
{
    public static /* synthetic */ boolean hasColorModifier;
    public static /* synthetic */ int statusBarTime;
    public static /* synthetic */ float healthScale;
    public static /* synthetic */ String bossName;
    private static final /* synthetic */ int[] lllIIIIlIlIlII;
    
    static {
        lIIlllIIlIIIlllI();
    }
    
    public static void setBossStatus(final IBossDisplayData llllllllllllIllIIIIlIlllIIllIIll, final boolean llllllllllllIllIIIIlIlllIIllIIlI) {
        BossStatus.healthScale = llllllllllllIllIIIIlIlllIIllIIll.getHealth() / llllllllllllIllIIIIlIlllIIllIIll.getMaxHealth();
        BossStatus.statusBarTime = BossStatus.lllIIIIlIlIlII[0];
        BossStatus.bossName = llllllllllllIllIIIIlIlllIIllIIll.getDisplayName().getFormattedText();
        BossStatus.hasColorModifier = llllllllllllIllIIIIlIlllIIllIIlI;
    }
    
    private static void lIIlllIIlIIIlllI() {
        (lllIIIIlIlIlII = new int[1])[0] = (63 + 47 - 37 + 140 ^ 176 + 103 - 132 + 30);
    }
}
