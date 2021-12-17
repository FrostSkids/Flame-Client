// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.client.renderer.entity;

import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;
import net.minecraft.client.renderer.entity.layers.LayerCustomHead;
import net.minecraft.client.renderer.entity.layers.LayerHeldItem;
import net.minecraft.client.model.ModelArmorStandArmor;
import net.minecraft.client.renderer.entity.layers.LayerBipedArmor;
import net.minecraft.client.model.ModelBase;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.client.model.ModelArmorStand;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import net.minecraft.util.ResourceLocation;
import net.minecraft.entity.item.EntityArmorStand;

public class ArmorStandRenderer extends RendererLivingEntity<EntityArmorStand>
{
    private static final /* synthetic */ int[] lIIIIIllllllIl;
    private static final /* synthetic */ String[] lIIIIIlllllIlI;
    public static final /* synthetic */ ResourceLocation TEXTURE_ARMOR_STAND;
    
    private static String lIllIllllIllllI(final String lllllllllllllIlIIllIlIlIlIlIlIIl, final String lllllllllllllIlIIllIlIlIlIlIlIII) {
        try {
            final SecretKeySpec lllllllllllllIlIIllIlIlIlIlIllII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIlIIllIlIlIlIlIlIII.getBytes(StandardCharsets.UTF_8)), ArmorStandRenderer.lIIIIIllllllIl[2]), "DES");
            final Cipher lllllllllllllIlIIllIlIlIlIlIlIll = Cipher.getInstance("DES");
            lllllllllllllIlIIllIlIlIlIlIlIll.init(ArmorStandRenderer.lIIIIIllllllIl[3], lllllllllllllIlIIllIlIlIlIlIllII);
            return new String(lllllllllllllIlIIllIlIlIlIlIlIll.doFinal(Base64.getDecoder().decode(lllllllllllllIlIIllIlIlIlIlIlIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIlIIllIlIlIlIlIlIlI) {
            lllllllllllllIlIIllIlIlIlIlIlIlI.printStackTrace();
            return null;
        }
    }
    
    @Override
    public ModelArmorStand getMainModel() {
        return (ModelArmorStand)super.getMainModel();
    }
    
    @Override
    protected ResourceLocation getEntityTexture(final EntityArmorStand lllllllllllllIlIIllIlIlIllIlIIll) {
        return ArmorStandRenderer.TEXTURE_ARMOR_STAND;
    }
    
    static {
        lIllIlllllIIIIl();
        lIllIllllIlllll();
        TEXTURE_ARMOR_STAND = new ResourceLocation(ArmorStandRenderer.lIIIIIlllllIlI[ArmorStandRenderer.lIIIIIllllllIl[0]]);
    }
    
    private static void lIllIlllllIIIIl() {
        (lIIIIIllllllIl = new int[4])[0] = ((72 + 78 - 83 + 162 ^ 63 + 102 - 160 + 167) & (0xD2 ^ 0x83 ^ (0x91 ^ 0x89) ^ -" ".length()));
        ArmorStandRenderer.lIIIIIllllllIl[1] = " ".length();
        ArmorStandRenderer.lIIIIIllllllIl[2] = (0xD9 ^ 0x8A ^ (0x2E ^ 0x75));
        ArmorStandRenderer.lIIIIIllllllIl[3] = "  ".length();
    }
    
    public ArmorStandRenderer(final RenderManager lllllllllllllIlIIllIlIlIllIlIllI) {
        super(lllllllllllllIlIIllIlIlIllIlIllI, new ModelArmorStand(), 0.0f);
        final LayerBipedArmor lllllllllllllIlIIllIlIlIllIllIII = new LayerBipedArmor(this) {
            @Override
            protected void initArmor() {
                this.field_177189_c = (T)new ModelArmorStandArmor(0.5f);
                this.field_177186_d = (T)new ModelArmorStandArmor(1.0f);
            }
        };
        ((RendererLivingEntity<EntityLivingBase>)this).addLayer(lllllllllllllIlIIllIlIlIllIllIII);
        "".length();
        ((RendererLivingEntity<EntityLivingBase>)this).addLayer(new LayerHeldItem(this));
        "".length();
        ((RendererLivingEntity<EntityLivingBase>)this).addLayer(new LayerCustomHead(this.getMainModel().bipedHead));
        "".length();
    }
    
    @Override
    protected boolean canRenderName(final EntityArmorStand lllllllllllllIlIIllIlIlIllIIIlIl) {
        return lllllllllllllIlIIllIlIlIllIIIlIl.getAlwaysRenderNameTag();
    }
    
    private static void lIllIllllIlllll() {
        (lIIIIIlllllIlI = new String[ArmorStandRenderer.lIIIIIllllllIl[1]])[ArmorStandRenderer.lIIIIIllllllIl[0]] = lIllIllllIllllI("9m1gnqn6kwC0XXrOMKW5fHsMUb69z+6H184+lO2fNmCeIrn7PdOEnw==", "iGnoa");
    }
    
    @Override
    protected void rotateCorpse(final EntityArmorStand lllllllllllllIlIIllIlIlIllIIllIl, final float lllllllllllllIlIIllIlIlIllIIllII, final float lllllllllllllIlIIllIlIlIllIIlIll, final float lllllllllllllIlIIllIlIlIllIIlIlI) {
        GlStateManager.rotate(180.0f - lllllllllllllIlIIllIlIlIllIIlIll, 0.0f, 1.0f, 0.0f);
    }
}
