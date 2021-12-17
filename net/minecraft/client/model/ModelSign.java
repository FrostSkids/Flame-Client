// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.client.model;

public class ModelSign extends ModelBase
{
    public /* synthetic */ ModelRenderer signBoard;
    private static final /* synthetic */ int[] lIllIlIlIIIIlI;
    public /* synthetic */ ModelRenderer signStick;
    
    static {
        llllllIlIIIllll();
    }
    
    public ModelSign() {
        this.signBoard = new ModelRenderer(this, ModelSign.lIllIlIlIIIIlI[0], ModelSign.lIllIlIlIIIIlI[0]);
        this.signBoard.addBox(-12.0f, -14.0f, -1.0f, ModelSign.lIllIlIlIIIIlI[1], ModelSign.lIllIlIlIIIIlI[2], ModelSign.lIllIlIlIIIIlI[3], 0.0f);
        this.signStick = new ModelRenderer(this, ModelSign.lIllIlIlIIIIlI[0], ModelSign.lIllIlIlIIIIlI[4]);
        this.signStick.addBox(-1.0f, -2.0f, -1.0f, ModelSign.lIllIlIlIIIIlI[3], ModelSign.lIllIlIlIIIIlI[4], ModelSign.lIllIlIlIIIIlI[3], 0.0f);
    }
    
    public void renderSign() {
        this.signBoard.render(0.0625f);
        this.signStick.render(0.0625f);
    }
    
    private static void llllllIlIIIllll() {
        (lIllIlIlIIIIlI = new int[5])[0] = ((66 + 162 - 126 + 97 ^ 177 + 58 - 61 + 20) & (133 + 124 - 214 + 99 ^ 73 + 55 + 9 + 2 ^ -" ".length()));
        ModelSign.lIllIlIlIIIIlI[1] = (74 + 90 - 97 + 62 ^ 54 + 126 - 179 + 152);
        ModelSign.lIllIlIlIIIIlI[2] = (35 + 98 - 79 + 127 ^ 107 + 146 - 68 + 0);
        ModelSign.lIllIlIlIIIIlI[3] = "  ".length();
        ModelSign.lIllIlIlIIIIlI[4] = (16 + 136 - 117 + 147 ^ 163 + 147 - 242 + 116);
    }
}
