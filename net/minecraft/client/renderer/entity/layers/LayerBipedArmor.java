// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.client.renderer.entity.layers;

import net.minecraft.client.renderer.entity.RendererLivingEntity;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBiped;

public class LayerBipedArmor extends LayerArmorBase<ModelBiped>
{
    private static final /* synthetic */ int[] lIlIIIIlIlIllI;
    
    protected void func_177194_a(final ModelBiped lllllllllllllIIlIIIIlIIIlIIllIll) {
        lllllllllllllIIlIIIIlIIIlIIllIll.setInvisible((boolean)(LayerBipedArmor.lIlIIIIlIlIllI[1] != 0));
    }
    
    static {
        lllIIIIlIlllIII();
    }
    
    @Override
    protected void initArmor() {
        this.field_177189_c = (T)new ModelBiped(0.5f);
        this.field_177186_d = (T)new ModelBiped(1.0f);
    }
    
    public LayerBipedArmor(final RendererLivingEntity<?> lllllllllllllIIlIIIIlIIIlIlIllII) {
        super(lllllllllllllIIlIIIIlIIIlIlIllII);
    }
    
    @Override
    protected void func_177179_a(final ModelBiped lllllllllllllIIlIIIIlIIIlIIlllll, final int lllllllllllllIIlIIIIlIIIlIIllllI) {
        this.func_177194_a(lllllllllllllIIlIIIIlIIIlIIlllll);
        switch (lllllllllllllIIlIIIIlIIIlIIllllI) {
            case 1: {
                lllllllllllllIIlIIIIlIIIlIIlllll.bipedRightLeg.showModel = (LayerBipedArmor.lIlIIIIlIlIllI[0] != 0);
                lllllllllllllIIlIIIIlIIIlIIlllll.bipedLeftLeg.showModel = (LayerBipedArmor.lIlIIIIlIlIllI[0] != 0);
                "".length();
                if (null != null) {
                    return;
                }
                break;
            }
            case 2: {
                lllllllllllllIIlIIIIlIIIlIIlllll.bipedBody.showModel = (LayerBipedArmor.lIlIIIIlIlIllI[0] != 0);
                lllllllllllllIIlIIIIlIIIlIIlllll.bipedRightLeg.showModel = (LayerBipedArmor.lIlIIIIlIlIllI[0] != 0);
                lllllllllllllIIlIIIIlIIIlIIlllll.bipedLeftLeg.showModel = (LayerBipedArmor.lIlIIIIlIlIllI[0] != 0);
                "".length();
                if (-(74 + 30 - 70 + 122 ^ 0 + 91 - 89 + 151) >= 0) {
                    return;
                }
                break;
            }
            case 3: {
                lllllllllllllIIlIIIIlIIIlIIlllll.bipedBody.showModel = (LayerBipedArmor.lIlIIIIlIlIllI[0] != 0);
                lllllllllllllIIlIIIIlIIIlIIlllll.bipedRightArm.showModel = (LayerBipedArmor.lIlIIIIlIlIllI[0] != 0);
                lllllllllllllIIlIIIIlIIIlIIlllll.bipedLeftArm.showModel = (LayerBipedArmor.lIlIIIIlIlIllI[0] != 0);
                "".length();
                if (-" ".length() >= (0xB4 ^ 0xB0)) {
                    return;
                }
                break;
            }
            case 4: {
                lllllllllllllIIlIIIIlIIIlIIlllll.bipedHead.showModel = (LayerBipedArmor.lIlIIIIlIlIllI[0] != 0);
                lllllllllllllIIlIIIIlIIIlIIlllll.bipedHeadwear.showModel = (LayerBipedArmor.lIlIIIIlIlIllI[0] != 0);
                break;
            }
        }
    }
    
    private static void lllIIIIlIlllIII() {
        (lIlIIIIlIlIllI = new int[2])[0] = " ".length();
        LayerBipedArmor.lIlIIIIlIlIllI[1] = ((0x78 ^ 0x25) & ~(0xA ^ 0x57) & ~((0x13 ^ 0x21) & ~(0xAD ^ 0x9F)));
    }
}
