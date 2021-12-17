// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.client.renderer.entity.layers;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumFacing;
import net.minecraft.client.renderer.tileentity.TileEntitySkullRenderer;
import net.minecraft.nbt.NBTBase;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntitySkull;
import java.util.UUID;
import com.mojang.authlib.GameProfile;
import net.minecraft.util.StringUtils;
import net.minecraft.nbt.NBTUtil;
import net.minecraft.init.Items;
import net.minecraft.client.renderer.block.model.ItemCameraTransforms;
import net.minecraft.item.ItemBlock;
import net.minecraft.entity.monster.EntityZombie;
import net.minecraft.entity.passive.EntityVillager;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.Minecraft;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.security.MessageDigest;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.EntityLivingBase;

public class LayerCustomHead implements LayerRenderer<EntityLivingBase>
{
    private static final /* synthetic */ String[] lllIllIlIIIIll;
    private final /* synthetic */ ModelRenderer field_177209_a;
    private static final /* synthetic */ int[] lllIllIlIIIlII;
    
    private static String lIlIIlIIlIlIllII(String llllllllllllIlIllIIlIIllllllIlll, final String llllllllllllIlIllIIlIIlllllllIll) {
        llllllllllllIlIllIIlIIllllllIlll = (char)new String(Base64.getDecoder().decode(((String)llllllllllllIlIllIIlIIllllllIlll).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder llllllllllllIlIllIIlIIlllllllIlI = new StringBuilder();
        final char[] llllllllllllIlIllIIlIIlllllllIIl = llllllllllllIlIllIIlIIlllllllIll.toCharArray();
        int llllllllllllIlIllIIlIIlllllllIII = LayerCustomHead.lllIllIlIIIlII[1];
        final short llllllllllllIlIllIIlIIllllllIIlI = (Object)((String)llllllllllllIlIllIIlIIllllllIlll).toCharArray();
        final short llllllllllllIlIllIIlIIllllllIIIl = (short)llllllllllllIlIllIIlIIllllllIIlI.length;
        byte llllllllllllIlIllIIlIIllllllIIII = (byte)LayerCustomHead.lllIllIlIIIlII[1];
        while (lIlIIlIIlIllIIll(llllllllllllIlIllIIlIIllllllIIII, llllllllllllIlIllIIlIIllllllIIIl)) {
            final char llllllllllllIlIllIIlIIllllllllIl = llllllllllllIlIllIIlIIllllllIIlI[llllllllllllIlIllIIlIIllllllIIII];
            llllllllllllIlIllIIlIIlllllllIlI.append((char)(llllllllllllIlIllIIlIIllllllllIl ^ llllllllllllIlIllIIlIIlllllllIIl[llllllllllllIlIllIIlIIlllllllIII % llllllllllllIlIllIIlIIlllllllIIl.length]));
            "".length();
            ++llllllllllllIlIllIIlIIlllllllIII;
            ++llllllllllllIlIllIIlIIllllllIIII;
            "".length();
            if (((0x16 ^ 0x1 ^ (0x38 ^ 0x6C)) & (0xED ^ 0x88 ^ (0x88 ^ 0xAE) ^ -" ".length())) > 0) {
                return null;
            }
        }
        return String.valueOf(llllllllllllIlIllIIlIIlllllllIlI);
    }
    
    private static boolean lIlIIlIIlIllIIII(final int llllllllllllIlIllIIlIIllllIIlIIl) {
        return llllllllllllIlIllIIlIIllllIIlIIl != 0;
    }
    
    private static boolean lIlIIlIIlIllIIll(final int llllllllllllIlIllIIlIIllllIlIIlI, final int llllllllllllIlIllIIlIIllllIlIIIl) {
        return llllllllllllIlIllIIlIIllllIlIIlI < llllllllllllIlIllIIlIIllllIlIIIl;
    }
    
    private static void lIlIIlIIlIlIllIl() {
        (lllIllIlIIIIll = new String[LayerCustomHead.lllIllIlIIIlII[8]])[LayerCustomHead.lllIllIlIIIlII[1]] = lIlIIlIIlIlIlIlI("3nnzJELx6meicd6vPHnfQQ==", "tywTJ");
        LayerCustomHead.lllIllIlIIIIll[LayerCustomHead.lllIllIlIIIlII[2]] = lIlIIlIIlIlIlIll("+CVrCAUZx8gjfWtC0+po/w==", "AKllS");
        LayerCustomHead.lllIllIlIIIIll[LayerCustomHead.lllIllIlIIIlII[4]] = lIlIIlIIlIlIllII("AQAQOSsdHAswNQ==", "RkeUG");
        LayerCustomHead.lllIllIlIIIIll[LayerCustomHead.lllIllIlIIIlII[0]] = lIlIIlIIlIlIlIll("cWST19rgmOfBb26eJihyEQ==", "vhEyJ");
        LayerCustomHead.lllIllIlIIIIll[LayerCustomHead.lllIllIlIIIlII[6]] = lIlIIlIIlIlIllII("MQMCJC4tHxktMA==", "bhwHB");
    }
    
    private static boolean lIlIIlIIlIllIIlI(final Object llllllllllllIlIllIIlIIllllIIllII, final Object llllllllllllIlIllIIlIIllllIIlIll) {
        return llllllllllllIlIllIIlIIllllIIllII == llllllllllllIlIllIIlIIllllIIlIll;
    }
    
    private static boolean lIlIIlIIlIlIllll(final Object llllllllllllIlIllIIlIIllllIIllll) {
        return llllllllllllIlIllIIlIIllllIIllll != null;
    }
    
    public LayerCustomHead(final ModelRenderer llllllllllllIlIllIIlIlIIIIllIIlI) {
        this.field_177209_a = llllllllllllIlIllIIlIlIIIIllIIlI;
    }
    
    @Override
    public boolean shouldCombineTextures() {
        return LayerCustomHead.lllIllIlIIIlII[2] != 0;
    }
    
    static {
        lIlIIlIIlIlIlllI();
        lIlIIlIIlIlIllIl();
    }
    
    private static String lIlIIlIIlIlIlIll(final String llllllllllllIlIllIIlIIllllIllIII, final String llllllllllllIlIllIIlIIllllIllIIl) {
        try {
            final SecretKeySpec llllllllllllIlIllIIlIIllllIlllIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIlIllIIlIIllllIllIIl.getBytes(StandardCharsets.UTF_8)), LayerCustomHead.lllIllIlIIIlII[5]), "DES");
            final Cipher llllllllllllIlIllIIlIIllllIlllII = Cipher.getInstance("DES");
            llllllllllllIlIllIIlIIllllIlllII.init(LayerCustomHead.lllIllIlIIIlII[4], llllllllllllIlIllIIlIIllllIlllIl);
            return new String(llllllllllllIlIllIIlIIllllIlllII.doFinal(Base64.getDecoder().decode(llllllllllllIlIllIIlIIllllIllIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIlIllIIlIIllllIllIll) {
            llllllllllllIlIllIIlIIllllIllIll.printStackTrace();
            return null;
        }
    }
    
    @Override
    public void doRenderLayer(final EntityLivingBase llllllllllllIlIllIIlIlIIIIlIIlIl, final float llllllllllllIlIllIIlIlIIIIlIIlII, final float llllllllllllIlIllIIlIlIIIIlIIIll, final float llllllllllllIlIllIIlIlIIIIlIIIlI, final float llllllllllllIlIllIIlIlIIIIlIIIIl, final float llllllllllllIlIllIIlIlIIIIlIIIII, final float llllllllllllIlIllIIlIlIIIIIlllll, final float llllllllllllIlIllIIlIlIIIIIllllI) {
        final ItemStack llllllllllllIlIllIIlIlIIIIIlllIl = llllllllllllIlIllIIlIlIIIIlIIlIl.getCurrentArmor(LayerCustomHead.lllIllIlIIIlII[0]);
        if (lIlIIlIIlIlIllll(llllllllllllIlIllIIlIlIIIIIlllIl) && lIlIIlIIlIlIllll(llllllllllllIlIllIIlIlIIIIIlllIl.getItem())) {
            final Item llllllllllllIlIllIIlIlIIIIIlllII = llllllllllllIlIllIIlIlIIIIIlllIl.getItem();
            final Minecraft llllllllllllIlIllIIlIlIIIIIllIll = Minecraft.getMinecraft();
            GlStateManager.pushMatrix();
            if (lIlIIlIIlIllIIII(llllllllllllIlIllIIlIlIIIIlIIlIl.isSneaking() ? 1 : 0)) {
                GlStateManager.translate(0.0f, 0.2f, 0.0f);
            }
            int n;
            if (lIlIIlIIlIllIIIl((llllllllllllIlIllIIlIlIIIIlIIlIl instanceof EntityVillager) ? 1 : 0) && (!lIlIIlIIlIllIIII((llllllllllllIlIllIIlIlIIIIlIIlIl instanceof EntityZombie) ? 1 : 0) || lIlIIlIIlIllIIIl(((EntityZombie)llllllllllllIlIllIIlIlIIIIlIIlIl).isVillager() ? 1 : 0))) {
                n = LayerCustomHead.lllIllIlIIIlII[1];
                "".length();
                if ("  ".length() > (0x4C ^ 0x48)) {
                    return;
                }
            }
            else {
                n = LayerCustomHead.lllIllIlIIIlII[2];
            }
            final boolean llllllllllllIlIllIIlIlIIIIIllIlI = n != 0;
            if (lIlIIlIIlIllIIIl(llllllllllllIlIllIIlIlIIIIIllIlI ? 1 : 0) && lIlIIlIIlIllIIII(llllllllllllIlIllIIlIlIIIIlIIlIl.isChild() ? 1 : 0)) {
                final float llllllllllllIlIllIIlIlIIIIIllIIl = 2.0f;
                final float llllllllllllIlIllIIlIlIIIIIllIII = 1.4f;
                GlStateManager.scale(llllllllllllIlIllIIlIlIIIIIllIII / llllllllllllIlIllIIlIlIIIIIllIIl, llllllllllllIlIllIIlIlIIIIIllIII / llllllllllllIlIllIIlIlIIIIIllIIl, llllllllllllIlIllIIlIlIIIIIllIII / llllllllllllIlIllIIlIlIIIIIllIIl);
                GlStateManager.translate(0.0f, 16.0f * llllllllllllIlIllIIlIlIIIIIllllI, 0.0f);
            }
            this.field_177209_a.postRender(0.0625f);
            GlStateManager.color(1.0f, 1.0f, 1.0f, 1.0f);
            if (lIlIIlIIlIllIIII((llllllllllllIlIllIIlIlIIIIIlllII instanceof ItemBlock) ? 1 : 0)) {
                final float llllllllllllIlIllIIlIlIIIIIlIlll = 0.625f;
                GlStateManager.translate(0.0f, -0.25f, 0.0f);
                GlStateManager.rotate(180.0f, 0.0f, 1.0f, 0.0f);
                GlStateManager.scale(llllllllllllIlIllIIlIlIIIIIlIlll, -llllllllllllIlIllIIlIlIIIIIlIlll, -llllllllllllIlIllIIlIlIIIIIlIlll);
                if (lIlIIlIIlIllIIII(llllllllllllIlIllIIlIlIIIIIllIlI ? 1 : 0)) {
                    GlStateManager.translate(0.0f, 0.1875f, 0.0f);
                }
                llllllllllllIlIllIIlIlIIIIIllIll.getItemRenderer().renderItem(llllllllllllIlIllIIlIlIIIIlIIlIl, llllllllllllIlIllIIlIlIIIIIlllIl, ItemCameraTransforms.TransformType.HEAD);
                "".length();
                if (null != null) {
                    return;
                }
            }
            else if (lIlIIlIIlIllIIlI(llllllllllllIlIllIIlIlIIIIIlllII, Items.skull)) {
                final float llllllllllllIlIllIIlIlIIIIIlIllI = 1.1875f;
                GlStateManager.scale(llllllllllllIlIllIIlIlIIIIIlIllI, -llllllllllllIlIllIIlIlIIIIIlIllI, -llllllllllllIlIllIIlIlIIIIIlIllI);
                if (lIlIIlIIlIllIIII(llllllllllllIlIllIIlIlIIIIIllIlI ? 1 : 0)) {
                    GlStateManager.translate(0.0f, 0.0625f, 0.0f);
                }
                GameProfile llllllllllllIlIllIIlIlIIIIIlIlIl = null;
                if (lIlIIlIIlIllIIII(llllllllllllIlIllIIlIlIIIIIlllIl.hasTagCompound() ? 1 : 0)) {
                    final NBTTagCompound llllllllllllIlIllIIlIlIIIIIlIlII = llllllllllllIlIllIIlIlIIIIIlllIl.getTagCompound();
                    if (lIlIIlIIlIllIIII(llllllllllllIlIllIIlIlIIIIIlIlII.hasKey(LayerCustomHead.lllIllIlIIIIll[LayerCustomHead.lllIllIlIIIlII[1]], LayerCustomHead.lllIllIlIIIlII[3]) ? 1 : 0)) {
                        llllllllllllIlIllIIlIlIIIIIlIlIl = NBTUtil.readGameProfileFromNBT(llllllllllllIlIllIIlIlIIIIIlIlII.getCompoundTag(LayerCustomHead.lllIllIlIIIIll[LayerCustomHead.lllIllIlIIIlII[2]]));
                        "".length();
                        if (" ".length() < 0) {
                            return;
                        }
                    }
                    else if (lIlIIlIIlIllIIII(llllllllllllIlIllIIlIlIIIIIlIlII.hasKey(LayerCustomHead.lllIllIlIIIIll[LayerCustomHead.lllIllIlIIIlII[4]], LayerCustomHead.lllIllIlIIIlII[5]) ? 1 : 0)) {
                        final String llllllllllllIlIllIIlIlIIIIIlIIll = llllllllllllIlIllIIlIlIIIIIlIlII.getString(LayerCustomHead.lllIllIlIIIIll[LayerCustomHead.lllIllIlIIIlII[0]]);
                        if (lIlIIlIIlIllIIIl(StringUtils.isNullOrEmpty(llllllllllllIlIllIIlIlIIIIIlIIll) ? 1 : 0)) {
                            llllllllllllIlIllIIlIlIIIIIlIlIl = TileEntitySkull.updateGameprofile(new GameProfile((UUID)null, llllllllllllIlIllIIlIlIIIIIlIIll));
                            llllllllllllIlIllIIlIlIIIIIlIlII.setTag(LayerCustomHead.lllIllIlIIIIll[LayerCustomHead.lllIllIlIIIlII[6]], NBTUtil.writeGameProfile(new NBTTagCompound(), llllllllllllIlIllIIlIlIIIIIlIlIl));
                        }
                    }
                }
                TileEntitySkullRenderer.instance.renderSkull(-0.5f, 0.0f, -0.5f, EnumFacing.UP, 180.0f, llllllllllllIlIllIIlIlIIIIIlllIl.getMetadata(), llllllllllllIlIllIIlIlIIIIIlIlIl, LayerCustomHead.lllIllIlIIIlII[7]);
            }
            GlStateManager.popMatrix();
        }
    }
    
    private static String lIlIIlIIlIlIlIlI(final String llllllllllllIlIllIIlIIlllllIIlll, final String llllllllllllIlIllIIlIIlllllIIlII) {
        try {
            final SecretKeySpec llllllllllllIlIllIIlIIlllllIlIlI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIlIllIIlIIlllllIIlII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher llllllllllllIlIllIIlIIlllllIlIIl = Cipher.getInstance("Blowfish");
            llllllllllllIlIllIIlIIlllllIlIIl.init(LayerCustomHead.lllIllIlIIIlII[4], llllllllllllIlIllIIlIIlllllIlIlI);
            return new String(llllllllllllIlIllIIlIIlllllIlIIl.doFinal(Base64.getDecoder().decode(llllllllllllIlIllIIlIIlllllIIlll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIlIllIIlIIlllllIlIII) {
            llllllllllllIlIllIIlIIlllllIlIII.printStackTrace();
            return null;
        }
    }
    
    private static boolean lIlIIlIIlIllIIIl(final int llllllllllllIlIllIIlIIllllIIIlll) {
        return llllllllllllIlIllIIlIIllllIIIlll == 0;
    }
    
    private static void lIlIIlIIlIlIlllI() {
        (lllIllIlIIIlII = new int[9])[0] = "   ".length();
        LayerCustomHead.lllIllIlIIIlII[1] = ((0x4A ^ 0x3B ^ (0xA ^ 0x29)) & (0x9A ^ 0xA6 ^ (0x77 ^ 0x19) ^ -" ".length()));
        LayerCustomHead.lllIllIlIIIlII[2] = " ".length();
        LayerCustomHead.lllIllIlIIIlII[3] = (152 + 113 - 150 + 51 ^ 71 + 0 - 32 + 133);
        LayerCustomHead.lllIllIlIIIlII[4] = "  ".length();
        LayerCustomHead.lllIllIlIIIlII[5] = (72 + 25 + 33 + 58 ^ 146 + 49 - 38 + 23);
        LayerCustomHead.lllIllIlIIIlII[6] = (0xB1 ^ 0xB5);
        LayerCustomHead.lllIllIlIIIlII[7] = -" ".length();
        LayerCustomHead.lllIllIlIIIlII[8] = (0xC2 ^ 0xC7);
    }
}
