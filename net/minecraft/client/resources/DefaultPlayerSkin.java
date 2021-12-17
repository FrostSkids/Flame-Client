// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.client.resources;

import java.util.Arrays;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.security.MessageDigest;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.UUID;
import net.minecraft.util.ResourceLocation;

public class DefaultPlayerSkin
{
    private static final /* synthetic */ int[] lIIIlIIIlIIIlI;
    private static final /* synthetic */ ResourceLocation TEXTURE_STEVE;
    private static final /* synthetic */ ResourceLocation TEXTURE_ALEX;
    private static final /* synthetic */ String[] lIIIlIIIIlllII;
    
    private static boolean lIlllllIIllIIll(final int lllllllllllllIlIIIllIIIllIllIIII) {
        return lllllllllllllIlIIIllIIIllIllIIII != 0;
    }
    
    static {
        lIlllllIIllIIlI();
        lIlllllIIlIIIII();
        TEXTURE_STEVE = new ResourceLocation(DefaultPlayerSkin.lIIIlIIIIlllII[DefaultPlayerSkin.lIIIlIIIlIIIlI[0]]);
        TEXTURE_ALEX = new ResourceLocation(DefaultPlayerSkin.lIIIlIIIIlllII[DefaultPlayerSkin.lIIIlIIIlIIIlI[1]]);
    }
    
    private static boolean lIlllllIIllIlIl(final int lllllllllllllIlIIIllIIIllIllIIll, final int lllllllllllllIlIIIllIIIllIllIIlI) {
        return lllllllllllllIlIIIllIIIllIllIIll < lllllllllllllIlIIIllIIIllIllIIlI;
    }
    
    private static void lIlllllIIlIIIII() {
        (lIIIlIIIIlllII = new String[DefaultPlayerSkin.lIIIlIIIlIIIlI[4]])[DefaultPlayerSkin.lIIIlIIIlIIIlI[0]] = lIlllllIIIlllIl("dCFAXNi8gaUWupLA4MrcTyzJiflhFtLVmO0gLR4Jee4=", "hJnCo");
        DefaultPlayerSkin.lIIIlIIIIlllII[DefaultPlayerSkin.lIIIlIIIlIIIlI[1]] = lIlllllIIIllllI("NTMwLh8zMzt1Dy8iIS4TbjckPxJvJiY9", "AVHZj");
        DefaultPlayerSkin.lIIIlIIIIlllII[DefaultPlayerSkin.lIIIlIIIlIIIlI[2]] = lIlllllIIIlllll("d9BY8KHxrfU=", "ZJviS");
        DefaultPlayerSkin.lIIIlIIIIlllII[DefaultPlayerSkin.lIIIlIIIlIIIlI[3]] = lIlllllIIIlllll("PBHsRYSC1QM=", "JrukU");
    }
    
    public static String getSkinType(final UUID lllllllllllllIlIIIllIIIllllIllll) {
        String s;
        if (lIlllllIIllIIll(isSlimSkin(lllllllllllllIlIIIllIIIllllIllll) ? 1 : 0)) {
            s = DefaultPlayerSkin.lIIIlIIIIlllII[DefaultPlayerSkin.lIIIlIIIlIIIlI[2]];
            "".length();
            if (-" ".length() > 0) {
                return null;
            }
        }
        else {
            s = DefaultPlayerSkin.lIIIlIIIIlllII[DefaultPlayerSkin.lIIIlIIIlIIIlI[3]];
        }
        return s;
    }
    
    private static boolean isSlimSkin(final UUID lllllllllllllIlIIIllIIIllllIllII) {
        if (lIlllllIIllIlII(lllllllllllllIlIIIllIIIllllIllII.hashCode() & DefaultPlayerSkin.lIIIlIIIlIIIlI[1], DefaultPlayerSkin.lIIIlIIIlIIIlI[1])) {
            return DefaultPlayerSkin.lIIIlIIIlIIIlI[1] != 0;
        }
        return DefaultPlayerSkin.lIIIlIIIlIIIlI[0] != 0;
    }
    
    private static String lIlllllIIIllllI(String lllllllllllllIlIIIllIIIlllIIIIlI, final String lllllllllllllIlIIIllIIIlllIIIIIl) {
        lllllllllllllIlIIIllIIIlllIIIIlI = (long)new String(Base64.getDecoder().decode(((String)lllllllllllllIlIIIllIIIlllIIIIlI).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIlIIIllIIIlllIIIlIl = new StringBuilder();
        final char[] lllllllllllllIlIIIllIIIlllIIIlII = lllllllllllllIlIIIllIIIlllIIIIIl.toCharArray();
        int lllllllllllllIlIIIllIIIlllIIIIll = DefaultPlayerSkin.lIIIlIIIlIIIlI[0];
        final byte lllllllllllllIlIIIllIIIllIllllIl = (Object)((String)lllllllllllllIlIIIllIIIlllIIIIlI).toCharArray();
        final boolean lllllllllllllIlIIIllIIIllIllllII = lllllllllllllIlIIIllIIIllIllllIl.length != 0;
        Exception lllllllllllllIlIIIllIIIllIlllIll = (Exception)DefaultPlayerSkin.lIIIlIIIlIIIlI[0];
        while (lIlllllIIllIlIl((int)lllllllllllllIlIIIllIIIllIlllIll, lllllllllllllIlIIIllIIIllIllllII ? 1 : 0)) {
            final char lllllllllllllIlIIIllIIIlllIIlIII = lllllllllllllIlIIIllIIIllIllllIl[lllllllllllllIlIIIllIIIllIlllIll];
            lllllllllllllIlIIIllIIIlllIIIlIl.append((char)(lllllllllllllIlIIIllIIIlllIIlIII ^ lllllllllllllIlIIIllIIIlllIIIlII[lllllllllllllIlIIIllIIIlllIIIIll % lllllllllllllIlIIIllIIIlllIIIlII.length]));
            "".length();
            ++lllllllllllllIlIIIllIIIlllIIIIll;
            ++lllllllllllllIlIIIllIIIllIlllIll;
            "".length();
            if (((0x63 ^ 0x50 ^ (0x14 ^ 0x28)) & (0x8C ^ 0xAB ^ (0x4E ^ 0x66) ^ -" ".length())) == "  ".length()) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIlIIIllIIIlllIIIlIl);
    }
    
    public static ResourceLocation getDefaultSkin(final UUID lllllllllllllIlIIIllIIIlllllIIll) {
        ResourceLocation resourceLocation;
        if (lIlllllIIllIIll(isSlimSkin(lllllllllllllIlIIIllIIIlllllIIll) ? 1 : 0)) {
            resourceLocation = DefaultPlayerSkin.TEXTURE_ALEX;
            "".length();
            if ((0x7 ^ 0x3) <= 0) {
                return null;
            }
        }
        else {
            resourceLocation = DefaultPlayerSkin.TEXTURE_STEVE;
        }
        return resourceLocation;
    }
    
    private static void lIlllllIIllIIlI() {
        (lIIIlIIIlIIIlI = new int[6])[0] = ((0x2D ^ 0x3F) & ~(0xA1 ^ 0xB3));
        DefaultPlayerSkin.lIIIlIIIlIIIlI[1] = " ".length();
        DefaultPlayerSkin.lIIIlIIIlIIIlI[2] = "  ".length();
        DefaultPlayerSkin.lIIIlIIIlIIIlI[3] = "   ".length();
        DefaultPlayerSkin.lIIIlIIIlIIIlI[4] = (0x6B ^ 0x6F);
        DefaultPlayerSkin.lIIIlIIIlIIIlI[5] = (0x75 ^ 0x7D);
    }
    
    private static boolean lIlllllIIllIlII(final int lllllllllllllIlIIIllIIIllIllIlll, final int lllllllllllllIlIIIllIIIllIllIllI) {
        return lllllllllllllIlIIIllIIIllIllIlll == lllllllllllllIlIIIllIIIllIllIllI;
    }
    
    public static ResourceLocation getDefaultSkinLegacy() {
        return DefaultPlayerSkin.TEXTURE_STEVE;
    }
    
    private static String lIlllllIIIlllIl(final String lllllllllllllIlIIIllIIIllllIIlII, final String lllllllllllllIlIIIllIIIllllIIIIl) {
        try {
            final SecretKeySpec lllllllllllllIlIIIllIIIllllIIlll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIlIIIllIIIllllIIIIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lllllllllllllIlIIIllIIIllllIIllI = Cipher.getInstance("Blowfish");
            lllllllllllllIlIIIllIIIllllIIllI.init(DefaultPlayerSkin.lIIIlIIIlIIIlI[2], lllllllllllllIlIIIllIIIllllIIlll);
            return new String(lllllllllllllIlIIIllIIIllllIIllI.doFinal(Base64.getDecoder().decode(lllllllllllllIlIIIllIIIllllIIlII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIlIIIllIIIllllIIlIl) {
            lllllllllllllIlIIIllIIIllllIIlIl.printStackTrace();
            return null;
        }
    }
    
    private static String lIlllllIIIlllll(final String lllllllllllllIlIIIllIIIlllIlIlll, final String lllllllllllllIlIIIllIIIlllIlIlII) {
        try {
            final SecretKeySpec lllllllllllllIlIIIllIIIlllIllIlI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIlIIIllIIIlllIlIlII.getBytes(StandardCharsets.UTF_8)), DefaultPlayerSkin.lIIIlIIIlIIIlI[5]), "DES");
            final Cipher lllllllllllllIlIIIllIIIlllIllIIl = Cipher.getInstance("DES");
            lllllllllllllIlIIIllIIIlllIllIIl.init(DefaultPlayerSkin.lIIIlIIIlIIIlI[2], lllllllllllllIlIIIllIIIlllIllIlI);
            return new String(lllllllllllllIlIIIllIIIlllIllIIl.doFinal(Base64.getDecoder().decode(lllllllllllllIlIIIllIIIlllIlIlll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIlIIIllIIIlllIllIII) {
            lllllllllllllIlIIIllIIIlllIllIII.printStackTrace();
            return null;
        }
    }
}
