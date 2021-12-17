// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.potion;

import net.minecraft.util.ResourceLocation;
import net.minecraft.entity.ai.attributes.BaseAttributeMap;
import net.minecraft.entity.EntityLivingBase;

public class PotionHealthBoost extends Potion
{
    @Override
    public void removeAttributesModifiersFromEntity(final EntityLivingBase lllllllllllllIlIllIlIllllIIIlIll, final BaseAttributeMap lllllllllllllIlIllIlIllllIIIIllI, final int lllllllllllllIlIllIlIllllIIIIlIl) {
        super.removeAttributesModifiersFromEntity(lllllllllllllIlIllIlIllllIIIlIll, lllllllllllllIlIllIlIllllIIIIllI, lllllllllllllIlIllIlIllllIIIIlIl);
        if (lIlIlIlIlIlIIIl(lIlIlIlIlIlIIII(lllllllllllllIlIllIlIllllIIIlIll.getHealth(), lllllllllllllIlIllIlIllllIIIlIll.getMaxHealth()))) {
            lllllllllllllIlIllIlIllllIIIlIll.setHealth(lllllllllllllIlIllIlIllllIIIlIll.getMaxHealth());
        }
    }
    
    public PotionHealthBoost(final int lllllllllllllIlIllIlIllllIIlIlII, final ResourceLocation lllllllllllllIlIllIlIllllIIlIIll, final boolean lllllllllllllIlIllIlIllllIIlIIlI, final int lllllllllllllIlIllIlIllllIIlIllI) {
        super(lllllllllllllIlIllIlIllllIIlIlII, lllllllllllllIlIllIlIllllIIlIIll, lllllllllllllIlIllIlIllllIIlIIlI, lllllllllllllIlIllIlIllllIIlIllI);
    }
    
    private static int lIlIlIlIlIlIIII(final float n, final float n2) {
        return fcmpl(n, n2);
    }
    
    private static boolean lIlIlIlIlIlIIIl(final int lllllllllllllIlIllIlIllllIIIIIll) {
        return lllllllllllllIlIllIlIllllIIIIIll > 0;
    }
}
