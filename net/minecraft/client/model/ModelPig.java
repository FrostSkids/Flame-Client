// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.client.model;

public class ModelPig extends ModelQuadruped
{
    private static final /* synthetic */ int[] lIIlIIIIllIlll;
    
    static {
        llIIlIlIIIIllll();
    }
    
    private static void llIIlIlIIIIllll() {
        (lIIlIIIIllIlll = new int[5])[0] = (0xB6 ^ 0xB0);
        ModelPig.lIIlIIIIllIlll[1] = (0x8E ^ 0x9E);
        ModelPig.lIIlIIIIllIlll[2] = ("  ".length() ^ (0x82 ^ 0x84));
        ModelPig.lIIlIIIIllIlll[3] = "   ".length();
        ModelPig.lIIlIIIIllIlll[4] = " ".length();
    }
    
    public ModelPig(final float lllllllllllllIIlllIlIllIIIlIIlIl) {
        super(ModelPig.lIIlIIIIllIlll[0], lllllllllllllIIlllIlIllIIIlIIlIl);
        this.head.setTextureOffset(ModelPig.lIIlIIIIllIlll[1], ModelPig.lIIlIIIIllIlll[1]).addBox(-2.0f, 0.0f, -9.0f, ModelPig.lIIlIIIIllIlll[2], ModelPig.lIIlIIIIllIlll[3], ModelPig.lIIlIIIIllIlll[4], lllllllllllllIIlllIlIllIIIlIIlIl);
        this.childYOffset = 4.0f;
    }
    
    public ModelPig() {
        this(0.0f);
    }
}
