// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.potion;

import net.minecraft.entity.ai.attributes.AttributeModifier;
import net.minecraft.util.ResourceLocation;

public class PotionAttackDamage extends Potion
{
    private static final /* synthetic */ int[] llIlIllIIlIlIl;
    
    static {
        lIIlIlIlIIlIIIll();
    }
    
    protected PotionAttackDamage(final int llllllllllllIllIlIIllIIlllllIlII, final ResourceLocation llllllllllllIllIlIIllIIllllllIII, final boolean llllllllllllIllIlIIllIIlllllIlll, final int llllllllllllIllIlIIllIIlllllIllI) {
        super(llllllllllllIllIlIIllIIlllllIlII, llllllllllllIllIlIIllIIllllllIII, llllllllllllIllIlIIllIIlllllIlll, llllllllllllIllIlIIllIIlllllIllI);
    }
    
    private static void lIIlIlIlIIlIIIll() {
        (llIlIllIIlIlIl = new int[1])[0] = " ".length();
    }
    
    @Override
    public double getAttributeModifierAmount(final int llllllllllllIllIlIIllIIllllIllIl, final AttributeModifier llllllllllllIllIlIIllIIllllIllII) {
        double n;
        if (lIIlIlIlIIlIIlII(this.id, Potion.weakness.id)) {
            n = -0.5f * (llllllllllllIllIlIIllIIllllIllIl + PotionAttackDamage.llIlIllIIlIlIl[0]);
            "".length();
            if (null != null) {
                return 0.0;
            }
        }
        else {
            n = 1.3 * (llllllllllllIllIlIIllIIllllIllIl + PotionAttackDamage.llIlIllIIlIlIl[0]);
        }
        return n;
    }
    
    private static boolean lIIlIlIlIIlIIlII(final int llllllllllllIllIlIIllIIllllIIlll, final int llllllllllllIllIlIIllIIllllIIllI) {
        return llllllllllllIllIlIIllIIllllIIlll == llllllllllllIllIlIIllIIllllIIllI;
    }
}
