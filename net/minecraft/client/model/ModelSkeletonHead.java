// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.client.model;

import net.minecraft.entity.Entity;

public class ModelSkeletonHead extends ModelBase
{
    public /* synthetic */ ModelRenderer skeletonHead;
    private static final /* synthetic */ int[] lIlIIlllIIIlIl;
    
    @Override
    public void setRotationAngles(final float lllllllllllllIIIllIIIIlIIlllIlll, final float lllllllllllllIIIllIIIIlIIllIlllI, final float lllllllllllllIIIllIIIIlIIlllIlIl, final float lllllllllllllIIIllIIIIlIIllIllII, final float lllllllllllllIIIllIIIIlIIlllIIll, final float lllllllllllllIIIllIIIIlIIlllIIlI, final Entity lllllllllllllIIIllIIIIlIIlllIIIl) {
        super.setRotationAngles(lllllllllllllIIIllIIIIlIIlllIlll, lllllllllllllIIIllIIIIlIIllIlllI, lllllllllllllIIIllIIIIlIIlllIlIl, lllllllllllllIIIllIIIIlIIllIllII, lllllllllllllIIIllIIIIlIIlllIIll, lllllllllllllIIIllIIIIlIIlllIIlI, lllllllllllllIIIllIIIIlIIlllIIIl);
        this.skeletonHead.rotateAngleY = lllllllllllllIIIllIIIIlIIllIllII / 57.295776f;
        this.skeletonHead.rotateAngleX = lllllllllllllIIIllIIIIlIIlllIIll / 57.295776f;
    }
    
    public ModelSkeletonHead() {
        this(ModelSkeletonHead.lIlIIlllIIIlIl[0], ModelSkeletonHead.lIlIIlllIIIlIl[1], ModelSkeletonHead.lIlIIlllIIIlIl[2], ModelSkeletonHead.lIlIIlllIIIlIl[2]);
    }
    
    public ModelSkeletonHead(final int lllllllllllllIIIllIIIIlIlIIlllII, final int lllllllllllllIIIllIIIIlIlIlIIIII, final int lllllllllllllIIIllIIIIlIlIIllIlI, final int lllllllllllllIIIllIIIIlIlIIllIIl) {
        this.textureWidth = lllllllllllllIIIllIIIIlIlIIllIlI;
        this.textureHeight = lllllllllllllIIIllIIIIlIlIIllIIl;
        this.skeletonHead = new ModelRenderer(this, lllllllllllllIIIllIIIIlIlIIlllII, lllllllllllllIIIllIIIIlIlIlIIIII);
        this.skeletonHead.addBox(-4.0f, -8.0f, -4.0f, ModelSkeletonHead.lIlIIlllIIIlIl[3], ModelSkeletonHead.lIlIIlllIIIlIl[3], ModelSkeletonHead.lIlIIlllIIIlIl[3], 0.0f);
        this.skeletonHead.setRotationPoint(0.0f, 0.0f, 0.0f);
    }
    
    static {
        lllIlIIIllIlIII();
    }
    
    private static void lllIlIIIllIlIII() {
        (lIlIIlllIIIlIl = new int[4])[0] = ((0x19 ^ 0x35 ^ " ".length()) & (7 + 82 - 18 + 69 ^ 99 + 120 - 128 + 70 ^ -" ".length()));
        ModelSkeletonHead.lIlIIlllIIIlIl[1] = (0xE5 ^ 0xC6);
        ModelSkeletonHead.lIlIIlllIIIlIl[2] = (0xC8 ^ 0x80 ^ (0xAC ^ 0xA4));
        ModelSkeletonHead.lIlIIlllIIIlIl[3] = (0x5A ^ 0x4A ^ (0x3A ^ 0x22));
    }
    
    @Override
    public void render(final Entity lllllllllllllIIIllIIIIlIlIIIIlll, final float lllllllllllllIIIllIIIIlIlIIIlllI, final float lllllllllllllIIIllIIIIlIlIIIIlIl, final float lllllllllllllIIIllIIIIlIlIIIllII, final float lllllllllllllIIIllIIIIlIlIIIIIll, final float lllllllllllllIIIllIIIIlIlIIIIIlI, final float lllllllllllllIIIllIIIIlIlIIIlIIl) {
        this.setRotationAngles(lllllllllllllIIIllIIIIlIlIIIlllI, lllllllllllllIIIllIIIIlIlIIIIlIl, lllllllllllllIIIllIIIIlIlIIIllII, lllllllllllllIIIllIIIIlIlIIIIIll, lllllllllllllIIIllIIIIlIlIIIIIlI, lllllllllllllIIIllIIIIlIlIIIlIIl, lllllllllllllIIIllIIIIlIlIIIIlll);
        this.skeletonHead.render(lllllllllllllIIIllIIIIlIlIIIlIIl);
    }
}
