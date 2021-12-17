// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.client.model;

import net.minecraft.entity.Entity;

public class ModelHumanoidHead extends ModelSkeletonHead
{
    private final /* synthetic */ ModelRenderer head;
    private static final /* synthetic */ int[] llIlIIIlllIlIl;
    
    static {
        lIIlIIlIIIlIlIIl();
    }
    
    private static void lIIlIIlIIIlIlIIl() {
        (llIlIIIlllIlIl = new int[4])[0] = ((0x28 ^ 0x64 ^ (0x4C ^ 0x11)) & (50 + 93 - 98 + 140 ^ 47 + 53 - 95 + 163 ^ -" ".length()));
        ModelHumanoidHead.llIlIIIlllIlIl[1] = (0x75 ^ 0x35);
        ModelHumanoidHead.llIlIIIlllIlIl[2] = (0xCF ^ 0x82 ^ (0x75 ^ 0x18));
        ModelHumanoidHead.llIlIIIlllIlIl[3] = (0xFF ^ 0xC5 ^ (0xF0 ^ 0xC2));
    }
    
    @Override
    public void render(final Entity llllllllllllIllIllIIlIllIIlllllI, final float llllllllllllIllIllIIlIllIlIIlIII, final float llllllllllllIllIllIIlIllIIlllIlI, final float llllllllllllIllIllIIlIllIlIIIllI, final float llllllllllllIllIllIIlIllIlIIIlIl, final float llllllllllllIllIllIIlIllIlIIIlII, final float llllllllllllIllIllIIlIllIIllIIlI) {
        super.render(llllllllllllIllIllIIlIllIIlllllI, llllllllllllIllIllIIlIllIlIIlIII, llllllllllllIllIllIIlIllIIlllIlI, llllllllllllIllIllIIlIllIlIIIllI, llllllllllllIllIllIIlIllIlIIIlIl, llllllllllllIllIllIIlIllIlIIIlII, llllllllllllIllIllIIlIllIIllIIlI);
        this.head.render(llllllllllllIllIllIIlIllIIllIIlI);
    }
    
    public ModelHumanoidHead() {
        super(ModelHumanoidHead.llIlIIIlllIlIl[0], ModelHumanoidHead.llIlIIIlllIlIl[0], ModelHumanoidHead.llIlIIIlllIlIl[1], ModelHumanoidHead.llIlIIIlllIlIl[1]);
        this.head = new ModelRenderer(this, ModelHumanoidHead.llIlIIIlllIlIl[2], ModelHumanoidHead.llIlIIIlllIlIl[0]);
        this.head.addBox(-4.0f, -8.0f, -4.0f, ModelHumanoidHead.llIlIIIlllIlIl[3], ModelHumanoidHead.llIlIIIlllIlIl[3], ModelHumanoidHead.llIlIIIlllIlIl[3], 0.25f);
        this.head.setRotationPoint(0.0f, 0.0f, 0.0f);
    }
    
    @Override
    public void setRotationAngles(final float llllllllllllIllIllIIlIllIIIlIIlI, final float llllllllllllIllIllIIlIllIIIlllIl, final float llllllllllllIllIllIIlIllIIIIlllI, final float llllllllllllIllIllIIlIllIIIIllIl, final float llllllllllllIllIllIIlIllIIIlIlll, final float llllllllllllIllIllIIlIllIIIlIllI, final Entity llllllllllllIllIllIIlIllIIIlIlIl) {
        super.setRotationAngles(llllllllllllIllIllIIlIllIIIlIIlI, llllllllllllIllIllIIlIllIIIlllIl, llllllllllllIllIllIIlIllIIIIlllI, llllllllllllIllIllIIlIllIIIIllIl, llllllllllllIllIllIIlIllIIIlIlll, llllllllllllIllIllIIlIllIIIlIllI, llllllllllllIllIllIIlIllIIIlIlIl);
        this.head.rotateAngleY = this.skeletonHead.rotateAngleY;
        this.head.rotateAngleX = this.skeletonHead.rotateAngleX;
    }
}
