// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.potion;

import net.minecraft.entity.ai.attributes.BaseAttributeMap;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.ResourceLocation;

public class PotionAbsorption extends Potion
{
    private static final /* synthetic */ int[] lIlllIlllllIII;
    
    protected PotionAbsorption(final int llllllllllllIllllIllIlIIIIIIllIl, final ResourceLocation llllllllllllIllllIllIlIIIIIlIIIl, final boolean llllllllllllIllllIllIlIIIIIIlIll, final int llllllllllllIllllIllIlIIIIIIllll) {
        super(llllllllllllIllllIllIlIIIIIIllIl, llllllllllllIllllIllIlIIIIIlIIIl, llllllllllllIllllIllIlIIIIIIlIll, llllllllllllIllllIllIlIIIIIIllll);
    }
    
    @Override
    public void removeAttributesModifiersFromEntity(final EntityLivingBase llllllllllllIllllIllIlIIIIIIIIII, final BaseAttributeMap llllllllllllIllllIllIIllllllllll, final int llllllllllllIllllIllIIlllllllllI) {
        llllllllllllIllllIllIlIIIIIIIIII.setAbsorptionAmount(llllllllllllIllllIllIlIIIIIIIIII.getAbsorptionAmount() - PotionAbsorption.lIlllIlllllIII[0] * (llllllllllllIllllIllIIlllllllllI + PotionAbsorption.lIlllIlllllIII[1]));
        super.removeAttributesModifiersFromEntity(llllllllllllIllllIllIlIIIIIIIIII, llllllllllllIllllIllIIllllllllll, llllllllllllIllllIllIIlllllllllI);
    }
    
    private static void lIIIIIlllIIlllIl() {
        (lIlllIlllllIII = new int[2])[0] = (0xD0 ^ 0x99 ^ (0x3 ^ 0x4E));
        PotionAbsorption.lIlllIlllllIII[1] = " ".length();
    }
    
    static {
        lIIIIIlllIIlllIl();
    }
    
    @Override
    public void applyAttributesModifiersToEntity(final EntityLivingBase llllllllllllIllllIllIIlllllllIII, final BaseAttributeMap llllllllllllIllllIllIIllllllIIll, final int llllllllllllIllllIllIIllllllIIlI) {
        llllllllllllIllllIllIIlllllllIII.setAbsorptionAmount(llllllllllllIllllIllIIlllllllIII.getAbsorptionAmount() + PotionAbsorption.lIlllIlllllIII[0] * (llllllllllllIllllIllIIllllllIIlI + PotionAbsorption.lIlllIlllllIII[1]));
        super.applyAttributesModifiersToEntity(llllllllllllIllllIllIIlllllllIII, llllllllllllIllllIllIIllllllIIll, llllllllllllIllllIllIIllllllIIlI);
    }
}
