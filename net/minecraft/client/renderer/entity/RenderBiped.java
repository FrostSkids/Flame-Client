// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.client.renderer.entity;

import net.minecraft.client.renderer.entity.layers.LayerHeldItem;
import net.minecraft.entity.Entity;
import net.minecraft.client.renderer.entity.layers.LayerCustomHead;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.GlStateManager;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import net.minecraft.util.ResourceLocation;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.entity.EntityLiving;

public class RenderBiped<T extends EntityLiving> extends RenderLiving<T>
{
    private static final /* synthetic */ String[] lIIIlIllIIllll;
    protected /* synthetic */ ModelBiped modelBipedMain;
    protected /* synthetic */ float field_77070_b;
    private static final /* synthetic */ ResourceLocation DEFAULT_RES_LOC;
    private static final /* synthetic */ int[] lIIIlIllIlIIII;
    
    private static String llIIIIIllIllIIl(String lllllllllllllIlIIIIlIllIllIllIII, final String lllllllllllllIlIIIIlIllIllIlIlll) {
        lllllllllllllIlIIIIlIllIllIllIII = (byte)new String(Base64.getDecoder().decode(((String)lllllllllllllIlIIIIlIllIllIllIII).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIlIIIIlIllIllIllIll = new StringBuilder();
        final char[] lllllllllllllIlIIIIlIllIllIllIlI = lllllllllllllIlIIIIlIllIllIlIlll.toCharArray();
        int lllllllllllllIlIIIIlIllIllIllIIl = RenderBiped.lIIIlIllIlIIII[0];
        final float lllllllllllllIlIIIIlIllIllIlIIll = (Object)((String)lllllllllllllIlIIIIlIllIllIllIII).toCharArray();
        final boolean lllllllllllllIlIIIIlIllIllIlIIlI = lllllllllllllIlIIIIlIllIllIlIIll.length != 0;
        byte lllllllllllllIlIIIIlIllIllIlIIIl = (byte)RenderBiped.lIIIlIllIlIIII[0];
        while (llIIIIIllIlllII(lllllllllllllIlIIIIlIllIllIlIIIl, lllllllllllllIlIIIIlIllIllIlIIlI ? 1 : 0)) {
            final char lllllllllllllIlIIIIlIllIllIllllI = lllllllllllllIlIIIIlIllIllIlIIll[lllllllllllllIlIIIIlIllIllIlIIIl];
            lllllllllllllIlIIIIlIllIllIllIll.append((char)(lllllllllllllIlIIIIlIllIllIllllI ^ lllllllllllllIlIIIIlIllIllIllIlI[lllllllllllllIlIIIIlIllIllIllIIl % lllllllllllllIlIIIIlIllIllIllIlI.length]));
            "".length();
            ++lllllllllllllIlIIIIlIllIllIllIIl;
            ++lllllllllllllIlIIIIlIllIllIlIIIl;
            "".length();
            if (null != null) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIlIIIIlIllIllIllIll);
    }
    
    @Override
    public void transformHeldFull3DItemLayer() {
        GlStateManager.translate(0.0f, 0.1875f, 0.0f);
    }
    
    @Override
    protected ResourceLocation getEntityTexture(final T lllllllllllllIlIIIIlIllIlllIllIl) {
        return RenderBiped.DEFAULT_RES_LOC;
    }
    
    private static void llIIIIIllIllIlI() {
        (lIIIlIllIIllll = new String[RenderBiped.lIIIlIllIlIIII[1]])[RenderBiped.lIIIlIllIlIIII[0]] = llIIIIIllIllIIl("Jy4fDBshLhRXCz0/DgwXfDgTHRg2ZRcWCQ==", "SKgxn");
    }
    
    private static void llIIIIIllIllIll() {
        (lIIIlIllIlIIII = new int[2])[0] = ((0x79 ^ 0x4E ^ (0xE ^ 0x73)) & (101 + 71 - 38 + 75 ^ 62 + 101 - 98 + 90 ^ -" ".length()));
        RenderBiped.lIIIlIllIlIIII[1] = " ".length();
    }
    
    static {
        llIIIIIllIllIll();
        llIIIIIllIllIlI();
        DEFAULT_RES_LOC = new ResourceLocation(RenderBiped.lIIIlIllIIllll[RenderBiped.lIIIlIllIlIIII[0]]);
    }
    
    public RenderBiped(final RenderManager lllllllllllllIlIIIIlIllIllllIIlI, final ModelBiped lllllllllllllIlIIIIlIllIllllIllI, final float lllllllllllllIlIIIIlIllIllllIlIl, final float lllllllllllllIlIIIIlIllIlllIllll) {
        super(lllllllllllllIlIIIIlIllIllllIIlI, lllllllllllllIlIIIIlIllIllllIllI, lllllllllllllIlIIIIlIllIllllIlIl);
        this.modelBipedMain = lllllllllllllIlIIIIlIllIllllIllI;
        this.field_77070_b = lllllllllllllIlIIIIlIllIlllIllll;
        this.addLayer(new LayerCustomHead(lllllllllllllIlIIIIlIllIllllIllI.bipedHead));
        "".length();
    }
    
    private static boolean llIIIIIllIlllII(final int lllllllllllllIlIIIIlIllIllIIllIl, final int lllllllllllllIlIIIIlIllIllIIllII) {
        return lllllllllllllIlIIIIlIllIllIIllIl < lllllllllllllIlIIIIlIllIllIIllII;
    }
    
    public RenderBiped(final RenderManager lllllllllllllIlIIIIlIlllIIIIIIII, final ModelBiped lllllllllllllIlIIIIlIllIllllllll, final float lllllllllllllIlIIIIlIllIlllllllI) {
        this(lllllllllllllIlIIIIlIlllIIIIIIII, lllllllllllllIlIIIIlIllIllllllll, lllllllllllllIlIIIIlIllIlllllllI, 1.0f);
        this.addLayer(new LayerHeldItem(this));
        "".length();
    }
}
