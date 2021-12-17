// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.client.model;

import net.minecraft.entity.Entity;
import com.google.common.collect.Maps;
import com.google.common.collect.Lists;
import net.minecraft.entity.EntityLivingBase;
import java.util.Random;
import java.util.List;
import java.util.Map;

public abstract class ModelBase
{
    private /* synthetic */ Map<String, TextureOffset> modelTextureMap;
    public /* synthetic */ boolean isChild;
    public /* synthetic */ List<ModelRenderer> boxList;
    public /* synthetic */ float swingProgress;
    private static final /* synthetic */ int[] lIlllllIlIlllI;
    public /* synthetic */ int textureWidth;
    public /* synthetic */ boolean isRiding;
    public /* synthetic */ int textureHeight;
    
    public ModelRenderer getRandomModelBox(final Random llllllllllllIllllIIllIIIlIIIllIl) {
        return this.boxList.get(llllllllllllIllllIIllIIIlIIIllIl.nextInt(this.boxList.size()));
    }
    
    private static void lIIIIlIlIlllllll() {
        (lIlllllIlIlllI = new int[3])[0] = " ".length();
        ModelBase.lIlllllIlIlllI[1] = (0x25 ^ 0x65);
        ModelBase.lIlllllIlIlllI[2] = (0x21 ^ 0x1);
    }
    
    public void setLivingAnimations(final EntityLivingBase llllllllllllIllllIIllIIIlIIlIllI, final float llllllllllllIllllIIllIIIlIIlIlIl, final float llllllllllllIllllIIllIIIlIIlIlII, final float llllllllllllIllllIIllIIIlIIlIIll) {
    }
    
    public ModelBase() {
        this.isChild = (ModelBase.lIlllllIlIlllI[0] != 0);
        this.boxList = (List<ModelRenderer>)Lists.newArrayList();
        this.modelTextureMap = (Map<String, TextureOffset>)Maps.newHashMap();
        this.textureWidth = ModelBase.lIlllllIlIlllI[1];
        this.textureHeight = ModelBase.lIlllllIlIlllI[2];
    }
    
    static {
        lIIIIlIlIlllllll();
    }
    
    public TextureOffset getTextureOffset(final String llllllllllllIllllIIllIIIIllllIll) {
        return this.modelTextureMap.get(llllllllllllIllllIIllIIIIllllIll);
    }
    
    public void render(final Entity llllllllllllIllllIIllIIIlIlIIllI, final float llllllllllllIllllIIllIIIlIlIIlIl, final float llllllllllllIllllIIllIIIlIlIIlII, final float llllllllllllIllllIIllIIIlIlIIIll, final float llllllllllllIllllIIllIIIlIlIIIlI, final float llllllllllllIllllIIllIIIlIlIIIIl, final float llllllllllllIllllIIllIIIlIlIIIII) {
    }
    
    public void setRotationAngles(final float llllllllllllIllllIIllIIIlIIllllI, final float llllllllllllIllllIIllIIIlIIlllIl, final float llllllllllllIllllIIllIIIlIIlllII, final float llllllllllllIllllIIllIIIlIIllIll, final float llllllllllllIllllIIllIIIlIIllIlI, final float llllllllllllIllllIIllIIIlIIllIIl, final Entity llllllllllllIllllIIllIIIlIIllIII) {
    }
    
    public void setModelAttributes(final ModelBase llllllllllllIllllIIllIIIIlllIIIl) {
        this.swingProgress = llllllllllllIllllIIllIIIIlllIIIl.swingProgress;
        this.isRiding = llllllllllllIllllIIllIIIIlllIIIl.isRiding;
        this.isChild = llllllllllllIllllIIllIIIIlllIIIl.isChild;
    }
    
    public void setTextureOffset(final String llllllllllllIllllIIllIIIlIIIIlll, final int llllllllllllIllllIIllIIIlIIIIllI, final int llllllllllllIllllIIllIIIlIIIIIIl) {
        this.modelTextureMap.put(llllllllllllIllllIIllIIIlIIIIlll, new TextureOffset(llllllllllllIllllIIllIIIlIIIIllI, llllllllllllIllllIIllIIIlIIIIIIl));
        "".length();
    }
    
    public static void copyModelAngles(final ModelRenderer llllllllllllIllllIIllIIIIllllIII, final ModelRenderer llllllllllllIllllIIllIIIIlllIlll) {
        llllllllllllIllllIIllIIIIlllIlll.rotateAngleX = llllllllllllIllllIIllIIIIllllIII.rotateAngleX;
        llllllllllllIllllIIllIIIIlllIlll.rotateAngleY = llllllllllllIllllIIllIIIIllllIII.rotateAngleY;
        llllllllllllIllllIIllIIIIlllIlll.rotateAngleZ = llllllllllllIllllIIllIIIIllllIII.rotateAngleZ;
        llllllllllllIllllIIllIIIIlllIlll.rotationPointX = llllllllllllIllllIIllIIIIllllIII.rotationPointX;
        llllllllllllIllllIIllIIIIlllIlll.rotationPointY = llllllllllllIllllIIllIIIIllllIII.rotationPointY;
        llllllllllllIllllIIllIIIIlllIlll.rotationPointZ = llllllllllllIllllIIllIIIIllllIII.rotationPointZ;
    }
}
