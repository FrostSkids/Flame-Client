// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.client.renderer.tileentity;

import net.minecraft.tileentity.TileEntity;
import net.minecraft.client.model.ModelHumanoidHead;
import java.util.UUID;
import java.util.Map;
import net.minecraft.client.model.ModelBase;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import com.mojang.authlib.minecraft.MinecraftProfileTexture;
import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.DefaultPlayerSkin;
import net.minecraft.client.renderer.GlStateManager;
import com.mojang.authlib.GameProfile;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.security.MessageDigest;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import net.minecraft.util.EnumFacing;
import net.minecraft.client.model.ModelSkeletonHead;
import net.minecraft.util.ResourceLocation;
import net.minecraft.tileentity.TileEntitySkull;

public class TileEntitySkullRenderer extends TileEntitySpecialRenderer<TileEntitySkull>
{
    private static final /* synthetic */ int[] lllIlIlIIlIIII;
    private static final /* synthetic */ ResourceLocation SKELETON_TEXTURES;
    private final /* synthetic */ ModelSkeletonHead skeletonHead;
    private static final /* synthetic */ ResourceLocation WITHER_SKELETON_TEXTURES;
    private static final /* synthetic */ ResourceLocation ZOMBIE_TEXTURES;
    public static /* synthetic */ TileEntitySkullRenderer instance;
    private static final /* synthetic */ ResourceLocation CREEPER_TEXTURES;
    private final /* synthetic */ ModelSkeletonHead humanoidHead;
    private static final /* synthetic */ String[] lllIlIlIIIllII;
    
    static /* synthetic */ int[] $SWITCH_TABLE$net$minecraft$util$EnumFacing() {
        final int[] $switch_TABLE$net$minecraft$util$EnumFacing = TileEntitySkullRenderer.$SWITCH_TABLE$net$minecraft$util$EnumFacing;
        if (lIlIIIlIllIlIlII($switch_TABLE$net$minecraft$util$EnumFacing)) {
            return $switch_TABLE$net$minecraft$util$EnumFacing;
        }
        "".length();
        final int llllllllllllIlIllIllIlIllIlIIIIl = (Object)new int[EnumFacing.values().length];
        try {
            llllllllllllIlIllIllIlIllIlIIIIl[EnumFacing.DOWN.ordinal()] = TileEntitySkullRenderer.lllIlIlIIlIIII[1];
            "".length();
            if (null != null) {
                return null;
            }
        }
        catch (NoSuchFieldError noSuchFieldError) {
            "".length();
        }
        try {
            llllllllllllIlIllIllIlIllIlIIIIl[EnumFacing.EAST.ordinal()] = TileEntitySkullRenderer.lllIlIlIIlIIII[10];
            "".length();
            if (null != null) {
                return null;
            }
        }
        catch (NoSuchFieldError noSuchFieldError2) {
            "".length();
        }
        try {
            llllllllllllIlIllIllIlIllIlIIIIl[EnumFacing.NORTH.ordinal()] = TileEntitySkullRenderer.lllIlIlIIlIIII[3];
            "".length();
            if ((0x4 ^ 0xD ^ (0x79 ^ 0x74)) <= 0) {
                return null;
            }
        }
        catch (NoSuchFieldError noSuchFieldError3) {
            "".length();
        }
        try {
            llllllllllllIlIllIllIlIllIlIIIIl[EnumFacing.SOUTH.ordinal()] = TileEntitySkullRenderer.lllIlIlIIlIIII[11];
            "".length();
            if (((117 + 164 - 159 + 67 ^ 106 + 81 - 153 + 143) & (82 + 187 - 102 + 23 ^ 163 + 170 - 309 + 154 ^ -" ".length())) != 0x0) {
                return null;
            }
        }
        catch (NoSuchFieldError noSuchFieldError4) {
            "".length();
        }
        try {
            llllllllllllIlIllIllIlIllIlIIIIl[EnumFacing.UP.ordinal()] = TileEntitySkullRenderer.lllIlIlIIlIIII[2];
            "".length();
            if ((0x7B ^ 0x7F) <= ((0xEF ^ 0xB4) & ~(0x41 ^ 0x1A))) {
                return null;
            }
        }
        catch (NoSuchFieldError noSuchFieldError5) {
            "".length();
        }
        try {
            llllllllllllIlIllIllIlIllIlIIIIl[EnumFacing.WEST.ordinal()] = TileEntitySkullRenderer.lllIlIlIIlIIII[12];
            "".length();
            if (((0x9 ^ 0x7 ^ (0x34 ^ 0x76)) & (0x8 ^ 0x41 ^ (0x96 ^ 0x93) ^ -" ".length())) < ((0x26 ^ 0x0 ^ (0x79 ^ 0x8)) & (0x7C ^ 0x74 ^ (0x9A ^ 0xC5) ^ -" ".length()))) {
                return null;
            }
        }
        catch (NoSuchFieldError noSuchFieldError6) {
            "".length();
        }
        return TileEntitySkullRenderer.$SWITCH_TABLE$net$minecraft$util$EnumFacing = (int[])(Object)llllllllllllIlIllIllIlIllIlIIIIl;
    }
    
    private static String lIlIIIlIllIIIIll(String llllllllllllIlIllIllIlIllIIIIlII, final String llllllllllllIlIllIllIlIllIIIlIII) {
        llllllllllllIlIllIllIlIllIIIIlII = (char)new String(Base64.getDecoder().decode(((String)llllllllllllIlIllIllIlIllIIIIlII).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder llllllllllllIlIllIllIlIllIIIIlll = new StringBuilder();
        final char[] llllllllllllIlIllIllIlIllIIIIllI = llllllllllllIlIllIllIlIllIIIlIII.toCharArray();
        int llllllllllllIlIllIllIlIllIIIIlIl = TileEntitySkullRenderer.lllIlIlIIlIIII[0];
        final String llllllllllllIlIllIllIlIlIlllllll = (Object)((String)llllllllllllIlIllIllIlIllIIIIlII).toCharArray();
        final short llllllllllllIlIllIllIlIlIllllllI = (short)llllllllllllIlIllIllIlIlIlllllll.length;
        int llllllllllllIlIllIllIlIlIlllllIl = TileEntitySkullRenderer.lllIlIlIIlIIII[0];
        while (lIlIIIlIllIlIlll(llllllllllllIlIllIllIlIlIlllllIl, llllllllllllIlIllIllIlIlIllllllI)) {
            final char llllllllllllIlIllIllIlIllIIIlIlI = llllllllllllIlIllIllIlIlIlllllll[llllllllllllIlIllIllIlIlIlllllIl];
            llllllllllllIlIllIllIlIllIIIIlll.append((char)(llllllllllllIlIllIllIlIllIIIlIlI ^ llllllllllllIlIllIllIlIllIIIIllI[llllllllllllIlIllIllIlIllIIIIlIl % llllllllllllIlIllIllIlIllIIIIllI.length]));
            "".length();
            ++llllllllllllIlIllIllIlIllIIIIlIl;
            ++llllllllllllIlIllIllIlIlIlllllIl;
            "".length();
            if ("  ".length() != "  ".length()) {
                return null;
            }
        }
        return String.valueOf(llllllllllllIlIllIllIlIllIIIIlll);
    }
    
    private static boolean lIlIIIlIllIlIlIl(final int llllllllllllIlIllIllIlIlIllIllII) {
        return llllllllllllIlIllIllIlIlIllIllII != 0;
    }
    
    private static String lIlIIIlIllIIIlII(final String llllllllllllIlIllIllIlIllIIlIlll, final String llllllllllllIlIllIllIlIllIIllIII) {
        try {
            final SecretKeySpec llllllllllllIlIllIllIlIllIIlllII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIlIllIllIlIllIIllIII.getBytes(StandardCharsets.UTF_8)), TileEntitySkullRenderer.lllIlIlIIlIIII[13]), "DES");
            final Cipher llllllllllllIlIllIllIlIllIIllIll = Cipher.getInstance("DES");
            llllllllllllIlIllIllIlIllIIllIll.init(TileEntitySkullRenderer.lllIlIlIIlIIII[2], llllllllllllIlIllIllIlIllIIlllII);
            return new String(llllllllllllIlIllIllIlIllIIllIll.doFinal(Base64.getDecoder().decode(llllllllllllIlIllIllIlIllIIlIlll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIlIllIllIlIllIIllIlI) {
            llllllllllllIlIllIllIlIllIIllIlI.printStackTrace();
            return null;
        }
    }
    
    private static boolean lIlIIIlIllIlIlII(final Object llllllllllllIlIllIllIlIlIllIllll) {
        return llllllllllllIlIllIllIlIlIllIllll != null;
    }
    
    static {
        lIlIIIlIllIlIIlI();
        lIlIIIlIllIIIllI();
        SKELETON_TEXTURES = new ResourceLocation(TileEntitySkullRenderer.lllIlIlIIIllII[TileEntitySkullRenderer.lllIlIlIIlIIII[0]]);
        WITHER_SKELETON_TEXTURES = new ResourceLocation(TileEntitySkullRenderer.lllIlIlIIIllII[TileEntitySkullRenderer.lllIlIlIIlIIII[1]]);
        ZOMBIE_TEXTURES = new ResourceLocation(TileEntitySkullRenderer.lllIlIlIIIllII[TileEntitySkullRenderer.lllIlIlIIlIIII[2]]);
        CREEPER_TEXTURES = new ResourceLocation(TileEntitySkullRenderer.lllIlIlIIIllII[TileEntitySkullRenderer.lllIlIlIIlIIII[3]]);
    }
    
    private static boolean lIlIIIlIllIlIllI(final Object llllllllllllIlIllIllIlIlIlllIIlI, final Object llllllllllllIlIllIllIlIlIlllIIIl) {
        return llllllllllllIlIllIllIlIlIlllIIlI != llllllllllllIlIllIllIlIlIlllIIIl;
    }
    
    private static void lIlIIIlIllIIIllI() {
        (lllIlIlIIIllII = new String[TileEntitySkullRenderer.lllIlIlIIlIIII[11]])[TileEntitySkullRenderer.lllIlIlIIlIIII[0]] = lIlIIIlIllIIIIll("HisLNxMYKwBsAwQ6GjcfRT0YJgoPOhwtSRklFi8DHiEdbRYEKQ==", "jNsCf");
        TileEntitySkullRenderer.lllIlIlIIIllII[TileEntitySkullRenderer.lllIlIlIIlIIII[1]] = lIlIIIlIllIIIlII("UWIEDo4klFyu9z9vsr5ULj++T+PV4iBKZaH4DaAmtro/vk/j1eIgSpDY2Jx5NWjY", "GaYmS");
        TileEntitySkullRenderer.lllIlIlIIIllII[TileEntitySkullRenderer.lllIlIlIIlIIII[2]] = lIlIIIlIllIIIlII("ZSgayWvwb0N6vzMPCDY1f0KmbRNqZIknXT1VmQd8Nisz3DOvbiCA3A==", "eWEmN");
        TileEntitySkullRenderer.lllIlIlIIIllII[TileEntitySkullRenderer.lllIlIlIIlIIII[3]] = lIlIIIlIllIIIlII("t9ZrP3Zh5CGFMZy/jfWvXFV/9267mzS1MIhMtD7d7Ql8KhrSJ44QpA==", "evJFq");
    }
    
    public void renderSkull(final float llllllllllllIlIllIllIlIlllIIllII, final float llllllllllllIlIllIllIlIllIllllII, final float llllllllllllIlIllIllIlIllIlllIll, final EnumFacing llllllllllllIlIllIllIlIlllIIlIIl, float llllllllllllIlIllIllIlIllIlllIIl, final int llllllllllllIlIllIllIlIlllIIIlll, final GameProfile llllllllllllIlIllIllIlIllIllIlll, final int llllllllllllIlIllIllIlIllIllIllI) {
        ModelBase llllllllllllIlIllIllIlIlllIIIlII = this.skeletonHead;
        if (lIlIIIlIllIlIIll(llllllllllllIlIllIllIlIllIllIllI)) {
            this.bindTexture(TileEntitySkullRenderer.DESTROY_STAGES[llllllllllllIlIllIllIlIllIllIllI]);
            GlStateManager.matrixMode(TileEntitySkullRenderer.lllIlIlIIlIIII[8]);
            GlStateManager.pushMatrix();
            GlStateManager.scale(4.0f, 2.0f, 1.0f);
            GlStateManager.translate(0.0625f, 0.0625f, 0.0625f);
            GlStateManager.matrixMode(TileEntitySkullRenderer.lllIlIlIIlIIII[9]);
            "".length();
            if (((0x63 ^ 0x0) & ~(0x8 ^ 0x6B)) == " ".length()) {
                return;
            }
        }
        else {
            switch (llllllllllllIlIllIllIlIlllIIIlll) {
                default: {
                    this.bindTexture(TileEntitySkullRenderer.SKELETON_TEXTURES);
                    "".length();
                    if (-" ".length() != -" ".length()) {
                        return;
                    }
                    break;
                }
                case 1: {
                    this.bindTexture(TileEntitySkullRenderer.WITHER_SKELETON_TEXTURES);
                    "".length();
                    if ((88 + 82 - 143 + 143 ^ 28 + 19 + 114 + 13) <= 0) {
                        return;
                    }
                    break;
                }
                case 2: {
                    this.bindTexture(TileEntitySkullRenderer.ZOMBIE_TEXTURES);
                    llllllllllllIlIllIllIlIlllIIIlII = this.humanoidHead;
                    "".length();
                    if ("  ".length() < 0) {
                        return;
                    }
                    break;
                }
                case 3: {
                    llllllllllllIlIllIllIlIlllIIIlII = this.humanoidHead;
                    ResourceLocation llllllllllllIlIllIllIlIlllIIIIll = DefaultPlayerSkin.getDefaultSkinLegacy();
                    if (lIlIIIlIllIlIlII(llllllllllllIlIllIllIlIllIllIlll)) {
                        final Minecraft llllllllllllIlIllIllIlIlllIIIIlI = Minecraft.getMinecraft();
                        final Map<MinecraftProfileTexture.Type, MinecraftProfileTexture> llllllllllllIlIllIllIlIlllIIIIIl = llllllllllllIlIllIllIlIlllIIIIlI.getSkinManager().loadSkinFromCache(llllllllllllIlIllIllIlIllIllIlll);
                        if (lIlIIIlIllIlIlIl(llllllllllllIlIllIllIlIlllIIIIIl.containsKey(MinecraftProfileTexture.Type.SKIN) ? 1 : 0)) {
                            llllllllllllIlIllIllIlIlllIIIIll = llllllllllllIlIllIllIlIlllIIIIlI.getSkinManager().loadSkin(llllllllllllIlIllIllIlIlllIIIIIl.get(MinecraftProfileTexture.Type.SKIN), MinecraftProfileTexture.Type.SKIN);
                            "".length();
                            if (" ".length() < 0) {
                                return;
                            }
                        }
                        else {
                            final UUID llllllllllllIlIllIllIlIlllIIIIII = EntityPlayer.getUUID(llllllllllllIlIllIllIlIllIllIlll);
                            llllllllllllIlIllIllIlIlllIIIIll = DefaultPlayerSkin.getDefaultSkin(llllllllllllIlIllIllIlIlllIIIIII);
                        }
                    }
                    this.bindTexture(llllllllllllIlIllIllIlIlllIIIIll);
                    "".length();
                    if ("  ".length() == -" ".length()) {
                        return;
                    }
                    break;
                }
                case 4: {
                    this.bindTexture(TileEntitySkullRenderer.CREEPER_TEXTURES);
                    break;
                }
            }
        }
        GlStateManager.pushMatrix();
        GlStateManager.disableCull();
        if (lIlIIIlIllIlIllI(llllllllllllIlIllIllIlIlllIIlIIl, EnumFacing.UP)) {
            switch ($SWITCH_TABLE$net$minecraft$util$EnumFacing()[llllllllllllIlIllIllIlIlllIIlIIl.ordinal()]) {
                case 3: {
                    GlStateManager.translate(llllllllllllIlIllIllIlIlllIIllII + 0.5f, llllllllllllIlIllIllIlIllIllllII + 0.25f, llllllllllllIlIllIllIlIllIlllIll + 0.74f);
                    "".length();
                    if (null != null) {
                        return;
                    }
                    break;
                }
                case 4: {
                    GlStateManager.translate(llllllllllllIlIllIllIlIlllIIllII + 0.5f, llllllllllllIlIllIllIlIllIllllII + 0.25f, llllllllllllIlIllIllIlIllIlllIll + 0.26f);
                    llllllllllllIlIllIllIlIllIlllIIl = 180.0f;
                    "".length();
                    if ((125 + 39 - 135 + 121 ^ 96 + 56 - 19 + 13) < ((0xFB ^ 0x9A ^ (0x5A ^ 0xF)) & (0xAF ^ 0xC7 ^ (0x25 ^ 0x79) ^ -" ".length()))) {
                        return;
                    }
                    break;
                }
                case 5: {
                    GlStateManager.translate(llllllllllllIlIllIllIlIlllIIllII + 0.74f, llllllllllllIlIllIllIlIllIllllII + 0.25f, llllllllllllIlIllIllIlIllIlllIll + 0.5f);
                    llllllllllllIlIllIllIlIllIlllIIl = 270.0f;
                    "".length();
                    if (null != null) {
                        return;
                    }
                    break;
                }
                default: {
                    GlStateManager.translate(llllllllllllIlIllIllIlIlllIIllII + 0.26f, llllllllllllIlIllIllIlIllIllllII + 0.25f, llllllllllllIlIllIllIlIllIlllIll + 0.5f);
                    llllllllllllIlIllIllIlIllIlllIIl = 90.0f;
                    "".length();
                    if ("  ".length() < 0) {
                        return;
                    }
                    break;
                }
            }
        }
        else {
            GlStateManager.translate(llllllllllllIlIllIllIlIlllIIllII + 0.5f, llllllllllllIlIllIllIlIllIllllII, llllllllllllIlIllIllIlIllIlllIll + 0.5f);
        }
        final float llllllllllllIlIllIllIlIllIllllll = 0.0625f;
        GlStateManager.enableRescaleNormal();
        GlStateManager.scale(-1.0f, -1.0f, 1.0f);
        GlStateManager.enableAlpha();
        llllllllllllIlIllIllIlIlllIIIlII.render(null, 0.0f, 0.0f, 0.0f, llllllllllllIlIllIllIlIllIlllIIl, 0.0f, llllllllllllIlIllIllIlIllIllllll);
        GlStateManager.popMatrix();
        if (lIlIIIlIllIlIIll(llllllllllllIlIllIllIlIllIllIllI)) {
            GlStateManager.matrixMode(TileEntitySkullRenderer.lllIlIlIIlIIII[8]);
            GlStateManager.popMatrix();
            GlStateManager.matrixMode(TileEntitySkullRenderer.lllIlIlIIlIIII[9]);
        }
    }
    
    public TileEntitySkullRenderer() {
        this.skeletonHead = new ModelSkeletonHead(TileEntitySkullRenderer.lllIlIlIIlIIII[0], TileEntitySkullRenderer.lllIlIlIIlIIII[0], TileEntitySkullRenderer.lllIlIlIIlIIII[4], TileEntitySkullRenderer.lllIlIlIIlIIII[5]);
        this.humanoidHead = new ModelHumanoidHead();
    }
    
    private static boolean lIlIIIlIllIlIlll(final int llllllllllllIlIllIllIlIlIllllIII, final int llllllllllllIlIllIllIlIlIlllIlll) {
        return llllllllllllIlIllIllIlIlIllllIII < llllllllllllIlIllIllIlIlIlllIlll;
    }
    
    private static void lIlIIIlIllIlIIlI() {
        (lllIlIlIIlIIII = new int[14])[0] = ((82 + 56 - 6 + 27 ^ 86 + 21 - 89 + 124) & (0x43 ^ 0x17 ^ (0x7 ^ 0x42) ^ -" ".length()));
        TileEntitySkullRenderer.lllIlIlIIlIIII[1] = " ".length();
        TileEntitySkullRenderer.lllIlIlIIlIIII[2] = "  ".length();
        TileEntitySkullRenderer.lllIlIlIIlIIII[3] = "   ".length();
        TileEntitySkullRenderer.lllIlIlIIlIIII[4] = (0x71 ^ 0x31);
        TileEntitySkullRenderer.lllIlIlIIlIIII[5] = (131 + 138 - 165 + 123 ^ 1 + 125 - 106 + 175);
        TileEntitySkullRenderer.lllIlIlIIlIIII[6] = (0x23 ^ 0x24);
        TileEntitySkullRenderer.lllIlIlIIlIIII[7] = (-(0xFFFFBF47 & 0x5EBD) & (0xFFFF9FEF & 0x7F7C));
        TileEntitySkullRenderer.lllIlIlIIlIIII[8] = (0xFFFFD77A & 0x3F87);
        TileEntitySkullRenderer.lllIlIlIIlIIII[9] = (-(0xFFFFF9FB & 0x2E35) & (0xFFFFBF78 & 0x7FB7));
        TileEntitySkullRenderer.lllIlIlIIlIIII[10] = (0x17 ^ 0x30 ^ (0x6 ^ 0x27));
        TileEntitySkullRenderer.lllIlIlIIlIIII[11] = (0x78 ^ 0x7C);
        TileEntitySkullRenderer.lllIlIlIIlIIII[12] = (0xA ^ 0xF);
        TileEntitySkullRenderer.lllIlIlIIlIIII[13] = (0xC2 ^ 0x9F ^ (0xF5 ^ 0xA0));
    }
    
    private static boolean lIlIIIlIllIlIIll(final int llllllllllllIlIllIllIlIlIllIIlll) {
        return llllllllllllIlIllIllIlIlIllIIlll >= 0;
    }
    
    @Override
    public void renderTileEntityAt(final TileEntitySkull llllllllllllIlIllIllIlIllllIIlll, final double llllllllllllIlIllIllIlIllllIlllI, final double llllllllllllIlIllIllIlIllllIllIl, final double llllllllllllIlIllIllIlIllllIIlII, final float llllllllllllIlIllIllIlIllllIlIll, final int llllllllllllIlIllIllIlIllllIIIll) {
        final EnumFacing llllllllllllIlIllIllIlIllllIlIIl = EnumFacing.getFront(llllllllllllIlIllIllIlIllllIIlll.getBlockMetadata() & TileEntitySkullRenderer.lllIlIlIIlIIII[6]);
        this.renderSkull((float)llllllllllllIlIllIllIlIllllIlllI, (float)llllllllllllIlIllIllIlIllllIllIl, (float)llllllllllllIlIllIllIlIllllIIlII, llllllllllllIlIllIllIlIllllIlIIl, llllllllllllIlIllIllIlIllllIIlll.getSkullRotation() * TileEntitySkullRenderer.lllIlIlIIlIIII[7] / 16.0f, llllllllllllIlIllIllIlIllllIIlll.getSkullType(), llllllllllllIlIllIllIlIllllIIlll.getPlayerProfile(), llllllllllllIlIllIllIlIllllIIIll);
    }
    
    @Override
    public void setRendererDispatcher(final TileEntityRendererDispatcher llllllllllllIlIllIllIlIlllIllllI) {
        super.setRendererDispatcher(llllllllllllIlIllIllIlIlllIllllI);
        TileEntitySkullRenderer.instance = this;
    }
}
