// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.world;

import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;

public enum EnumDifficulty
{
    PEACEFUL(EnumDifficulty.llIlIllIIllIlI[EnumDifficulty.llIlIllIIllIll[0]], EnumDifficulty.llIlIllIIllIll[0], EnumDifficulty.llIlIllIIllIll[0], EnumDifficulty.llIlIllIIllIlI[EnumDifficulty.llIlIllIIllIll[1]]);
    
    private final /* synthetic */ String difficultyResourceKey;
    private static final /* synthetic */ int[] llIlIllIIllIll;
    private static final /* synthetic */ String[] llIlIllIIllIlI;
    
    HARD(EnumDifficulty.llIlIllIIllIlI[EnumDifficulty.llIlIllIIllIll[6]], EnumDifficulty.llIlIllIIllIll[3], EnumDifficulty.llIlIllIIllIll[3], EnumDifficulty.llIlIllIIllIlI[EnumDifficulty.llIlIllIIllIll[7]]);
    
    private final /* synthetic */ int difficultyId;
    
    NORMAL(EnumDifficulty.llIlIllIIllIlI[EnumDifficulty.llIlIllIIllIll[4]], EnumDifficulty.llIlIllIIllIll[2], EnumDifficulty.llIlIllIIllIll[2], EnumDifficulty.llIlIllIIllIlI[EnumDifficulty.llIlIllIIllIll[5]]);
    
    private static final /* synthetic */ EnumDifficulty[] difficultyEnums;
    
    EASY(EnumDifficulty.llIlIllIIllIlI[EnumDifficulty.llIlIllIIllIll[2]], EnumDifficulty.llIlIllIIllIll[1], EnumDifficulty.llIlIllIIllIll[1], EnumDifficulty.llIlIllIIllIlI[EnumDifficulty.llIlIllIIllIll[3]]);
    
    private static String lIIlIlIlIIlIIllI(final String llllllllllllIllIlIIllIIllIIIlllI, final String llllllllllllIllIlIIllIIllIIIllIl) {
        try {
            final SecretKeySpec llllllllllllIllIlIIllIIllIIlIIll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIllIlIIllIIllIIIllIl.getBytes(StandardCharsets.UTF_8)), EnumDifficulty.llIlIllIIllIll[8]), "DES");
            final Cipher llllllllllllIllIlIIllIIllIIlIIlI = Cipher.getInstance("DES");
            llllllllllllIllIlIIllIIllIIlIIlI.init(EnumDifficulty.llIlIllIIllIll[2], llllllllllllIllIlIIllIIllIIlIIll);
            return new String(llllllllllllIllIlIIllIIllIIlIIlI.doFinal(Base64.getDecoder().decode(llllllllllllIllIlIIllIIllIIIlllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIllIlIIllIIllIIlIIIl) {
            llllllllllllIllIlIIllIIllIIlIIIl.printStackTrace();
            return null;
        }
    }
    
    public String getDifficultyResourceKey() {
        return this.difficultyResourceKey;
    }
    
    private static String lIIlIlIlIIlIIlll(String llllllllllllIllIlIIllIIlIllIlllI, final String llllllllllllIllIlIIllIIlIlllIIlI) {
        llllllllllllIllIlIIllIIlIllIlllI = (float)new String(Base64.getDecoder().decode(((String)llllllllllllIllIlIIllIIlIllIlllI).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder llllllllllllIllIlIIllIIlIlllIIIl = new StringBuilder();
        final char[] llllllllllllIllIlIIllIIlIlllIIII = llllllllllllIllIlIIllIIlIlllIIlI.toCharArray();
        int llllllllllllIllIlIIllIIlIllIllll = EnumDifficulty.llIlIllIIllIll[0];
        final float llllllllllllIllIlIIllIIlIllIlIIl = (Object)((String)llllllllllllIllIlIIllIIlIllIlllI).toCharArray();
        final Exception llllllllllllIllIlIIllIIlIllIlIII = (Exception)llllllllllllIllIlIIllIIlIllIlIIl.length;
        boolean llllllllllllIllIlIIllIIlIllIIlll = EnumDifficulty.llIlIllIIllIll[0] != 0;
        while (lIIlIlIlIIlIlllI(llllllllllllIllIlIIllIIlIllIIlll ? 1 : 0, (int)llllllllllllIllIlIIllIIlIllIlIII)) {
            final char llllllllllllIllIlIIllIIlIlllIlII = llllllllllllIllIlIIllIIlIllIlIIl[llllllllllllIllIlIIllIIlIllIIlll];
            llllllllllllIllIlIIllIIlIlllIIIl.append((char)(llllllllllllIllIlIIllIIlIlllIlII ^ llllllllllllIllIlIIllIIlIlllIIII[llllllllllllIllIlIIllIIlIllIllll % llllllllllllIllIlIIllIIlIlllIIII.length]));
            "".length();
            ++llllllllllllIllIlIIllIIlIllIllll;
            ++llllllllllllIllIlIIllIIlIllIIlll;
            "".length();
            if (" ".length() <= -" ".length()) {
                return null;
            }
        }
        return String.valueOf(llllllllllllIllIlIIllIIlIlllIIIl);
    }
    
    static {
        lIIlIlIlIIlIllII();
        lIIlIlIlIIlIlIll();
        final EnumDifficulty[] enum$VALUES = new EnumDifficulty[EnumDifficulty.llIlIllIIllIll[4]];
        enum$VALUES[EnumDifficulty.llIlIllIIllIll[0]] = EnumDifficulty.PEACEFUL;
        enum$VALUES[EnumDifficulty.llIlIllIIllIll[1]] = EnumDifficulty.EASY;
        enum$VALUES[EnumDifficulty.llIlIllIIllIll[2]] = EnumDifficulty.NORMAL;
        enum$VALUES[EnumDifficulty.llIlIllIIllIll[3]] = EnumDifficulty.HARD;
        ENUM$VALUES = enum$VALUES;
        difficultyEnums = new EnumDifficulty[values().length];
        final short llllllllllllIllIlIIllIIllIllIllI;
        final String llllllllllllIllIlIIllIIllIllIlll = (String)((EnumDifficulty[])(Object)(llllllllllllIllIlIIllIIllIllIllI = (short)(Object)values())).length;
        double llllllllllllIllIlIIllIIllIlllIII = EnumDifficulty.llIlIllIIllIll[0];
        "".length();
        if (null != null) {
            return;
        }
        while (!lIIlIlIlIIlIllIl((int)llllllllllllIllIlIIllIIllIlllIII, (int)llllllllllllIllIlIIllIIllIllIlll)) {
            final EnumDifficulty llllllllllllIllIlIIllIIllIlllIlI = llllllllllllIllIlIIllIIllIllIllI[llllllllllllIllIlIIllIIllIlllIII];
            EnumDifficulty.difficultyEnums[llllllllllllIllIlIIllIIllIlllIlI.difficultyId] = llllllllllllIllIlIIllIIllIlllIlI;
            ++llllllllllllIllIlIIllIIllIlllIII;
        }
    }
    
    private EnumDifficulty(final String llllllllllllIllIlIIllIIllIlIllII, final int llllllllllllIllIlIIllIIllIlIlIll, final int llllllllllllIllIlIIllIIllIlIlIlI, final String llllllllllllIllIlIIllIIllIlIlllI) {
        this.difficultyId = llllllllllllIllIlIIllIIllIlIlIlI;
        this.difficultyResourceKey = llllllllllllIllIlIIllIIllIlIlllI;
    }
    
    public static EnumDifficulty getDifficultyEnum(final int llllllllllllIllIlIIllIIllIlIIlII) {
        return EnumDifficulty.difficultyEnums[llllllllllllIllIlIIllIIllIlIIlII % EnumDifficulty.difficultyEnums.length];
    }
    
    private static void lIIlIlIlIIlIlIll() {
        (llIlIllIIllIlI = new String[EnumDifficulty.llIlIllIIllIll[8]])[EnumDifficulty.llIlIllIIllIll[0]] = lIIlIlIlIIlIIllI("W+1dQmyBGfEpT7TbDftdRg==", "fvuLy");
        EnumDifficulty.llIlIllIIllIlI[EnumDifficulty.llIlIllIIllIll[1]] = lIIlIlIlIIlIIlll("LBMRGAwtEEsVCiUFDBIWLxccXxMmAgYUBTYP", "Cceqc");
        EnumDifficulty.llIlIllIIllIlI[EnumDifficulty.llIlIllIIllIll[2]] = lIIlIlIlIIlIIllI("F3RRG+ien2U=", "RrJTd");
        EnumDifficulty.llIlIllIIllIlI[EnumDifficulty.llIlIllIIllIll[3]] = lIIlIlIlIIlIIlll("Dhw8MBwPH2Y9GgcKIToGDRgxdxYAHzE=", "alHYs");
        EnumDifficulty.llIlIllIIllIlI[EnumDifficulty.llIlIllIIllIll[4]] = lIIlIlIlIIlIlIII("pSRyF42GTqQ=", "iWekB");
        EnumDifficulty.llIlIllIIllIlI[EnumDifficulty.llIlIllIIllIll[5]] = lIIlIlIlIIlIIlll("FxYdGC0WFUcVKx4AABI3FBIQXywXFAQQLg==", "xfiqB");
        EnumDifficulty.llIlIllIIllIlI[EnumDifficulty.llIlIllIIllIll[6]] = lIIlIlIlIIlIIllI("tldxG8nnIU4=", "DSlRb");
        EnumDifficulty.llIlIllIIllIlI[EnumDifficulty.llIlIllIIllIll[7]] = lIIlIlIlIIlIlIII("gpuNkCbatPuEajCynjDIbQ4FECs5hjwW", "WyAtr");
    }
    
    private static void lIIlIlIlIIlIllII() {
        (llIlIllIIllIll = new int[9])[0] = ((143 + 155 - 191 + 64 ^ 64 + 35 - 44 + 132) & (0x2D ^ 0x5 ^ (0x8E ^ 0xB6) ^ -" ".length()));
        EnumDifficulty.llIlIllIIllIll[1] = " ".length();
        EnumDifficulty.llIlIllIIllIll[2] = "  ".length();
        EnumDifficulty.llIlIllIIllIll[3] = "   ".length();
        EnumDifficulty.llIlIllIIllIll[4] = (0x98 ^ 0xA7 ^ (0x80 ^ 0xBB));
        EnumDifficulty.llIlIllIIllIll[5] = (33 + 128 - 15 + 27 ^ 98 + 126 - 122 + 66);
        EnumDifficulty.llIlIllIIllIll[6] = (0x77 ^ 0x11 ^ (0x68 ^ 0x8));
        EnumDifficulty.llIlIllIIllIll[7] = (0x92 ^ 0x95);
        EnumDifficulty.llIlIllIIllIll[8] = ("  ".length() ^ (0x3D ^ 0x37));
    }
    
    public int getDifficultyId() {
        return this.difficultyId;
    }
    
    private static String lIIlIlIlIIlIlIII(final String llllllllllllIllIlIIllIIllIIIIIll, final String llllllllllllIllIlIIllIIllIIIIIlI) {
        try {
            final SecretKeySpec llllllllllllIllIlIIllIIllIIIIllI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIllIlIIllIIllIIIIIlI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher llllllllllllIllIlIIllIIllIIIIlIl = Cipher.getInstance("Blowfish");
            llllllllllllIllIlIIllIIllIIIIlIl.init(EnumDifficulty.llIlIllIIllIll[2], llllllllllllIllIlIIllIIllIIIIllI);
            return new String(llllllllllllIllIlIIllIIllIIIIlIl.doFinal(Base64.getDecoder().decode(llllllllllllIllIlIIllIIllIIIIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIllIlIIllIIllIIIIlII) {
            llllllllllllIllIlIIllIIllIIIIlII.printStackTrace();
            return null;
        }
    }
    
    private static boolean lIIlIlIlIIlIllIl(final int llllllllllllIllIlIIllIIlIllIIIll, final int llllllllllllIllIlIIllIIlIllIIIlI) {
        return llllllllllllIllIlIIllIIlIllIIIll >= llllllllllllIllIlIIllIIlIllIIIlI;
    }
    
    private static boolean lIIlIlIlIIlIlllI(final int llllllllllllIllIlIIllIIlIlIlllll, final int llllllllllllIllIlIIllIIlIlIllllI) {
        return llllllllllllIllIlIIllIIlIlIlllll < llllllllllllIllIlIIllIIlIlIllllI;
    }
}
