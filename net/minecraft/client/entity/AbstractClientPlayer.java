// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.client.entity;

import com.mojang.authlib.GameProfile;
import net.minecraft.world.World;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.security.MessageDigest;
import net.minecraft.world.WorldSettings;
import java.io.File;
import net.minecraft.client.renderer.texture.ITextureObject;
import net.minecraft.client.renderer.texture.TextureManager;
import net.minecraft.client.renderer.IImageBuffer;
import net.minecraft.client.renderer.ImageBufferDownload;
import net.minecraft.client.resources.DefaultPlayerSkin;
import net.minecraft.client.renderer.ThreadDownloadImageData;
import net.minecraft.entity.ai.attributes.IAttributeInstance;
import net.minecraft.init.Items;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.util.StringUtils;
import net.minecraft.util.ResourceLocation;
import net.minecraft.client.Minecraft;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import net.minecraft.client.network.NetworkPlayerInfo;
import net.minecraft.entity.player.EntityPlayer;

public abstract class AbstractClientPlayer extends EntityPlayer
{
    private /* synthetic */ NetworkPlayerInfo playerInfo;
    private static final /* synthetic */ int[] lllIIIIlIlllIl;
    private static final /* synthetic */ String[] lllIIIIlIllIll;
    
    private static boolean lIIlllIIlIlIllII(final int llllllllllllIllIIIIlIlIlIlllIlII) {
        return llllllllllllIllIIIIlIlIlIlllIlII > 0;
    }
    
    private static void lIIlllIIlIlIIlIl() {
        (lllIIIIlIlllIl = new int[4])[0] = " ".length();
        AbstractClientPlayer.lllIIIIlIlllIl[1] = ((0x0 ^ 0x37 ^ (0x19 ^ 0x6D)) & (0x3A ^ 0x58 ^ (0x1E ^ 0x3F) ^ -" ".length()));
        AbstractClientPlayer.lllIIIIlIlllIl[2] = "  ".length();
        AbstractClientPlayer.lllIIIIlIlllIl[3] = (0x2A ^ 0x22);
    }
    
    private static String lIIlllIIlIIllllI(String llllllllllllIllIIIIlIlIllIIllIll, final String llllllllllllIllIIIIlIlIllIIlllll) {
        llllllllllllIllIIIIlIlIllIIllIll = new String(Base64.getDecoder().decode(llllllllllllIllIIIIlIlIllIIllIll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder llllllllllllIllIIIIlIlIllIIllllI = new StringBuilder();
        final char[] llllllllllllIllIIIIlIlIllIIlllIl = llllllllllllIllIIIIlIlIllIIlllll.toCharArray();
        int llllllllllllIllIIIIlIlIllIIlllII = AbstractClientPlayer.lllIIIIlIlllIl[1];
        final long llllllllllllIllIIIIlIlIllIIlIllI = (Object)llllllllllllIllIIIIlIlIllIIllIll.toCharArray();
        final boolean llllllllllllIllIIIIlIlIllIIlIlIl = llllllllllllIllIIIIlIlIllIIlIllI.length != 0;
        boolean llllllllllllIllIIIIlIlIllIIlIlII = AbstractClientPlayer.lllIIIIlIlllIl[1] != 0;
        while (lIIlllIIlIlIllIl(llllllllllllIllIIIIlIlIllIIlIlII ? 1 : 0, llllllllllllIllIIIIlIlIllIIlIlIl ? 1 : 0)) {
            final char llllllllllllIllIIIIlIlIllIlIIIIl = llllllllllllIllIIIIlIlIllIIlIllI[llllllllllllIllIIIIlIlIllIIlIlII];
            llllllllllllIllIIIIlIlIllIIllllI.append((char)(llllllllllllIllIIIIlIlIllIlIIIIl ^ llllllllllllIllIIIIlIlIllIIlllIl[llllllllllllIllIIIIlIlIllIIlllII % llllllllllllIllIIIIlIlIllIIlllIl.length]));
            "".length();
            ++llllllllllllIllIIIIlIlIllIIlllII;
            ++llllllllllllIllIIIIlIlIllIIlIlII;
            "".length();
            if ("   ".length() == -" ".length()) {
                return null;
            }
        }
        return String.valueOf(llllllllllllIllIIIIlIlIllIIllllI);
    }
    
    protected NetworkPlayerInfo getPlayerInfo() {
        if (lIIlllIIlIlIlIII(this.playerInfo)) {
            this.playerInfo = Minecraft.getMinecraft().getNetHandler().getPlayerInfo(this.getUniqueID());
        }
        return this.playerInfo;
    }
    
    public ResourceLocation getLocationCape() {
        final NetworkPlayerInfo llllllllllllIllIIIIlIlIlllIlIlll = this.getPlayerInfo();
        ResourceLocation locationCape;
        if (lIIlllIIlIlIlIII(llllllllllllIllIIIIlIlIlllIlIlll)) {
            locationCape = null;
            "".length();
            if (-(0xAD ^ 0xA8) >= 0) {
                return null;
            }
        }
        else {
            locationCape = llllllllllllIllIIIIlIlIlllIlIlll.getLocationCape();
        }
        return locationCape;
    }
    
    public static ResourceLocation getLocationSkin(final String llllllllllllIllIIIIlIlIlllIIIllI) {
        return new ResourceLocation(String.valueOf(new StringBuilder(AbstractClientPlayer.lllIIIIlIllIll[AbstractClientPlayer.lllIIIIlIlllIl[0]]).append(StringUtils.stripControlCodes(llllllllllllIllIIIIlIlIlllIIIllI))));
    }
    
    private static boolean lIIlllIIlIlIIllI(final Object llllllllllllIllIIIIlIlIllIIIIIII) {
        return llllllllllllIllIIIIlIlIllIIIIIII != null;
    }
    
    public float getFovModifier() {
        float llllllllllllIllIIIIlIlIllIllIlll = 1.0f;
        if (lIIlllIIlIlIlIIl(this.capabilities.isFlying ? 1 : 0)) {
            llllllllllllIllIIIIlIlIllIllIlll *= 1.1f;
        }
        final IAttributeInstance llllllllllllIllIIIIlIlIllIllIllI = this.getEntityAttribute(SharedMonsterAttributes.movementSpeed);
        final boolean llllllllllllIllIIIIlIlIllIllIlIl = AbstractClientPlayer.lllIIIIlIlllIl[0] != 0;
        final boolean llllllllllllIllIIIIlIlIllIllIlII = AbstractClientPlayer.lllIIIIlIlllIl[1] != 0;
        if (lIIlllIIlIlIlIIl(llllllllllllIllIIIIlIlIllIllIlIl ? 1 : 0)) {
            llllllllllllIllIIIIlIlIllIllIlll *= (float)((llllllllllllIllIIIIlIlIllIllIllI.getAttributeValue() / this.capabilities.getWalkSpeed() + 1.0) / 2.0);
        }
        if (!lIIlllIIlIlIlIIl(lIIlllIIlIlIlIlI(this.capabilities.getWalkSpeed(), 0.0f)) || !lIIlllIIlIlIlIll(Float.isNaN(llllllllllllIllIIIIlIlIllIllIlll) ? 1 : 0) || lIIlllIIlIlIlIIl(Float.isInfinite(llllllllllllIllIIIIlIlIllIllIlll) ? 1 : 0)) {
            llllllllllllIllIIIIlIlIllIllIlll = 1.0f;
        }
        if (lIIlllIIlIlIlIIl(this.isUsingItem() ? 1 : 0) && lIIlllIIlIlIIlll(this.getItemInUse().getItem(), Items.bow)) {
            final int llllllllllllIllIIIIlIlIllIllIIll = this.getItemInUseDuration();
            float llllllllllllIllIIIIlIlIllIllIIlI = llllllllllllIllIIIIlIlIllIllIIll / 20.0f;
            if (lIIlllIIlIlIllII(lIIlllIIlIlIlIlI(llllllllllllIllIIIIlIlIllIllIIlI, 1.0f))) {
                llllllllllllIllIIIIlIlIllIllIIlI = 1.0f;
                "".length();
                if (-(0x4E ^ 0x4A) > 0) {
                    return 0.0f;
                }
            }
            else {
                llllllllllllIllIIIIlIlIllIllIIlI *= llllllllllllIllIIIIlIlIllIllIIlI;
            }
            llllllllllllIllIIIIlIlIllIllIlll *= 1.0f - llllllllllllIllIIIIlIlIllIllIIlI * 0.15f;
        }
        return llllllllllllIllIIIIlIlIllIllIlll;
    }
    
    private static void lIIlllIIlIIlllll() {
        (lllIIIIlIllIll = new String[AbstractClientPlayer.lllIIIIlIlllIl[2]])[AbstractClientPlayer.lllIIIIlIlllIl[1]] = lIIlllIIlIIlllIl("fEIcJ1V+vT/CjwebvIiN83ofcAwcCz1AGoLljNswaaufpTy6A//0mrVRtIl1/q9vO8ASU0YQW24=", "SeGRb");
        AbstractClientPlayer.lllIIIIlIllIll[AbstractClientPlayer.lllIIIIlIlllIl[0]] = lIIlllIIlIIllllI("Gwo6GhZH", "haSte");
    }
    
    private static boolean lIIlllIIlIlIllIl(final int llllllllllllIllIIIIlIlIllIIIIIll, final int llllllllllllIllIIIIlIlIllIIIIIlI) {
        return llllllllllllIllIIIIlIlIllIIIIIll < llllllllllllIllIIIIlIlIllIIIIIlI;
    }
    
    public static ThreadDownloadImageData getDownloadImageSkin(final ResourceLocation llllllllllllIllIIIIlIlIlllIlIIII, final String llllllllllllIllIIIIlIlIlllIIllll) {
        final TextureManager llllllllllllIllIIIIlIlIlllIIlllI = Minecraft.getMinecraft().getTextureManager();
        ITextureObject llllllllllllIllIIIIlIlIlllIIllIl = llllllllllllIllIIIIlIlIlllIIlllI.getTexture(llllllllllllIllIIIIlIlIlllIlIIII);
        if (lIIlllIIlIlIlIII(llllllllllllIllIIIIlIlIlllIIllIl)) {
            final File llllllllllllIllllIlIIlIIlIlIlIIl = null;
            final String format = AbstractClientPlayer.lllIIIIlIllIll[AbstractClientPlayer.lllIIIIlIlllIl[1]];
            final Object[] args = new Object[AbstractClientPlayer.lllIIIIlIlllIl[0]];
            args[AbstractClientPlayer.lllIIIIlIlllIl[1]] = StringUtils.stripControlCodes(llllllllllllIllIIIIlIlIlllIIllll);
            llllllllllllIllIIIIlIlIlllIIllIl = new ThreadDownloadImageData(llllllllllllIllllIlIIlIIlIlIlIIl, String.format(format, args), DefaultPlayerSkin.getDefaultSkin(EntityPlayer.getOfflineUUID(llllllllllllIllIIIIlIlIlllIIllll)), new ImageBufferDownload());
            llllllllllllIllIIIIlIlIlllIIlllI.loadTexture(llllllllllllIllIIIIlIlIlllIlIIII, llllllllllllIllIIIIlIlIlllIIllIl);
            "".length();
        }
        return (ThreadDownloadImageData)llllllllllllIllIIIIlIlIlllIIllIl;
    }
    
    private static boolean lIIlllIIlIlIlIIl(final int llllllllllllIllIIIIlIlIlIllllIII) {
        return llllllllllllIllIIIIlIlIlIllllIII != 0;
    }
    
    @Override
    public boolean isSpectator() {
        final NetworkPlayerInfo llllllllllllIllIIIIlIlIllllIllll = Minecraft.getMinecraft().getNetHandler().getPlayerInfo(this.getGameProfile().getId());
        if (lIIlllIIlIlIIllI(llllllllllllIllIIIIlIlIllllIllll) && lIIlllIIlIlIIlll(llllllllllllIllIIIIlIlIllllIllll.getGameType(), WorldSettings.GameType.SPECTATOR)) {
            return AbstractClientPlayer.lllIIIIlIlllIl[0] != 0;
        }
        return AbstractClientPlayer.lllIIIIlIlllIl[1] != 0;
    }
    
    private static String lIIlllIIlIIlllIl(final String llllllllllllIllIIIIlIlIllIIIlIIl, final String llllllllllllIllIIIIlIlIllIIIlIII) {
        try {
            final SecretKeySpec llllllllllllIllIIIIlIlIllIIIlllI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIllIIIIlIlIllIIIlIII.getBytes(StandardCharsets.UTF_8)), AbstractClientPlayer.lllIIIIlIlllIl[3]), "DES");
            final Cipher llllllllllllIllIIIIlIlIllIIIllIl = Cipher.getInstance("DES");
            llllllllllllIllIIIIlIlIllIIIllIl.init(AbstractClientPlayer.lllIIIIlIlllIl[2], llllllllllllIllIIIIlIlIllIIIlllI);
            return new String(llllllllllllIllIIIIlIlIllIIIllIl.doFinal(Base64.getDecoder().decode(llllllllllllIllIIIIlIlIllIIIlIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIllIIIIlIlIllIIIllII) {
            llllllllllllIllIIIIlIlIllIIIllII.printStackTrace();
            return null;
        }
    }
    
    public boolean hasSkin() {
        final NetworkPlayerInfo llllllllllllIllIIIIlIlIllllIIIll = this.getPlayerInfo();
        if (lIIlllIIlIlIIllI(llllllllllllIllIIIIlIlIllllIIIll) && lIIlllIIlIlIlIIl(llllllllllllIllIIIIlIlIllllIIIll.hasLocationSkin() ? 1 : 0)) {
            return AbstractClientPlayer.lllIIIIlIlllIl[0] != 0;
        }
        return AbstractClientPlayer.lllIIIIlIlllIl[1] != 0;
    }
    
    public AbstractClientPlayer(final World llllllllllllIllIIIIlIlIlllllIlll, final GameProfile llllllllllllIllIIIIlIlIlllllIIll) {
        super(llllllllllllIllIIIIlIlIlllllIlll, llllllllllllIllIIIIlIlIlllllIIll);
    }
    
    private static boolean lIIlllIIlIlIlIII(final Object llllllllllllIllIIIIlIlIlIllllIlI) {
        return llllllllllllIllIIIIlIlIlIllllIlI == null;
    }
    
    private static boolean lIIlllIIlIlIIlll(final Object llllllllllllIllIIIIlIlIlIlllllIl, final Object llllllllllllIllIIIIlIlIlIlllllII) {
        return llllllllllllIllIIIIlIlIlIlllllIl == llllllllllllIllIIIIlIlIlIlllllII;
    }
    
    public boolean hasPlayerInfo() {
        if (lIIlllIIlIlIIllI(this.getPlayerInfo())) {
            return AbstractClientPlayer.lllIIIIlIlllIl[0] != 0;
        }
        return AbstractClientPlayer.lllIIIIlIlllIl[1] != 0;
    }
    
    private static boolean lIIlllIIlIlIlIll(final int llllllllllllIllIIIIlIlIlIlllIllI) {
        return llllllllllllIllIIIIlIlIlIlllIllI == 0;
    }
    
    public String getSkinType() {
        final NetworkPlayerInfo llllllllllllIllIIIIlIlIlllIIIIlI = this.getPlayerInfo();
        String s;
        if (lIIlllIIlIlIlIII(llllllllllllIllIIIIlIlIlllIIIIlI)) {
            s = DefaultPlayerSkin.getSkinType(this.getUniqueID());
            "".length();
            if (-"   ".length() > 0) {
                return null;
            }
        }
        else {
            s = llllllllllllIllIIIIlIlIlllIIIIlI.getSkinType();
        }
        return s;
    }
    
    public ResourceLocation getLocationSkin() {
        final NetworkPlayerInfo llllllllllllIllIIIIlIlIlllIlllIl = this.getPlayerInfo();
        ResourceLocation resourceLocation;
        if (lIIlllIIlIlIlIII(llllllllllllIllIIIIlIlIlllIlllIl)) {
            resourceLocation = DefaultPlayerSkin.getDefaultSkin(this.getUniqueID());
            "".length();
            if ((0x94 ^ 0x91) <= 0) {
                return null;
            }
        }
        else {
            resourceLocation = llllllllllllIllIIIIlIlIlllIlllIl.getLocationSkin();
        }
        return resourceLocation;
    }
    
    static {
        lIIlllIIlIlIIlIl();
        lIIlllIIlIIlllll();
    }
    
    private static int lIIlllIIlIlIlIlI(final float n, final float n2) {
        return fcmpl(n, n2);
    }
}
