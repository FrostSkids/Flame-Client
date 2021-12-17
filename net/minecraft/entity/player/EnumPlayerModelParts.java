// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.entity.player;

import net.minecraft.util.ChatComponentTranslation;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import net.minecraft.util.IChatComponent;

public enum EnumPlayerModelParts
{
    private final /* synthetic */ int partId;
    private static final /* synthetic */ int[] llllIlllIlIlI;
    private final /* synthetic */ IChatComponent field_179339_k;
    
    RIGHT_SLEEVE(EnumPlayerModelParts.llllIlllIIlll[EnumPlayerModelParts.llllIlllIlIlI[6]], EnumPlayerModelParts.llllIlllIlIlI[3], EnumPlayerModelParts.llllIlllIlIlI[3], EnumPlayerModelParts.llllIlllIIlll[EnumPlayerModelParts.llllIlllIlIlI[7]]), 
    RIGHT_PANTS_LEG(EnumPlayerModelParts.llllIlllIIlll[EnumPlayerModelParts.llllIlllIlIlI[10]], EnumPlayerModelParts.llllIlllIlIlI[5], EnumPlayerModelParts.llllIlllIlIlI[5], EnumPlayerModelParts.llllIlllIIlll[EnumPlayerModelParts.llllIlllIlIlI[11]]);
    
    private final /* synthetic */ int partMask;
    
    JACKET(EnumPlayerModelParts.llllIlllIIlll[EnumPlayerModelParts.llllIlllIlIlI[2]], EnumPlayerModelParts.llllIlllIlIlI[1], EnumPlayerModelParts.llllIlllIlIlI[1], EnumPlayerModelParts.llllIlllIIlll[EnumPlayerModelParts.llllIlllIlIlI[3]]), 
    LEFT_PANTS_LEG(EnumPlayerModelParts.llllIlllIIlll[EnumPlayerModelParts.llllIlllIlIlI[8]], EnumPlayerModelParts.llllIlllIlIlI[4], EnumPlayerModelParts.llllIlllIlIlI[4], EnumPlayerModelParts.llllIlllIIlll[EnumPlayerModelParts.llllIlllIlIlI[9]]), 
    CAPE(EnumPlayerModelParts.llllIlllIIlll[EnumPlayerModelParts.llllIlllIlIlI[0]], EnumPlayerModelParts.llllIlllIlIlI[0], EnumPlayerModelParts.llllIlllIlIlI[0], EnumPlayerModelParts.llllIlllIIlll[EnumPlayerModelParts.llllIlllIlIlI[1]]), 
    HAT(EnumPlayerModelParts.llllIlllIIlll[EnumPlayerModelParts.llllIlllIlIlI[12]], EnumPlayerModelParts.llllIlllIlIlI[6], EnumPlayerModelParts.llllIlllIlIlI[6], EnumPlayerModelParts.llllIlllIIlll[EnumPlayerModelParts.llllIlllIlIlI[13]]), 
    LEFT_SLEEVE(EnumPlayerModelParts.llllIlllIIlll[EnumPlayerModelParts.llllIlllIlIlI[4]], EnumPlayerModelParts.llllIlllIlIlI[2], EnumPlayerModelParts.llllIlllIlIlI[2], EnumPlayerModelParts.llllIlllIIlll[EnumPlayerModelParts.llllIlllIlIlI[5]]);
    
    private final /* synthetic */ String partName;
    private static final /* synthetic */ String[] llllIlllIIlll;
    
    public int getPartMask() {
        return this.partMask;
    }
    
    public String getPartName() {
        return this.partName;
    }
    
    static {
        lIlIllIIIIlllII();
        lIlIllIIIIlIIll();
        final EnumPlayerModelParts[] enum$VALUES = new EnumPlayerModelParts[EnumPlayerModelParts.llllIlllIlIlI[7]];
        enum$VALUES[EnumPlayerModelParts.llllIlllIlIlI[0]] = EnumPlayerModelParts.CAPE;
        enum$VALUES[EnumPlayerModelParts.llllIlllIlIlI[1]] = EnumPlayerModelParts.JACKET;
        enum$VALUES[EnumPlayerModelParts.llllIlllIlIlI[2]] = EnumPlayerModelParts.LEFT_SLEEVE;
        enum$VALUES[EnumPlayerModelParts.llllIlllIlIlI[3]] = EnumPlayerModelParts.RIGHT_SLEEVE;
        enum$VALUES[EnumPlayerModelParts.llllIlllIlIlI[4]] = EnumPlayerModelParts.LEFT_PANTS_LEG;
        enum$VALUES[EnumPlayerModelParts.llllIlllIlIlI[5]] = EnumPlayerModelParts.RIGHT_PANTS_LEG;
        enum$VALUES[EnumPlayerModelParts.llllIlllIlIlI[6]] = EnumPlayerModelParts.HAT;
        ENUM$VALUES = enum$VALUES;
    }
    
    private static boolean lIlIllIIIIlllIl(final int lllllllllllllIlIllIIIlllllllIlll, final int lllllllllllllIlIllIIIlllllllIllI) {
        return lllllllllllllIlIllIIIlllllllIlll < lllllllllllllIlIllIIIlllllllIllI;
    }
    
    private static String lIlIllIIIIlIIlI(final String lllllllllllllIlIllIIlIIIIIIIllII, final String lllllllllllllIlIllIIlIIIIIIIlIll) {
        try {
            final SecretKeySpec lllllllllllllIlIllIIlIIIIIIIllll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIlIllIIlIIIIIIIlIll.getBytes(StandardCharsets.UTF_8)), EnumPlayerModelParts.llllIlllIlIlI[8]), "DES");
            final Cipher lllllllllllllIlIllIIlIIIIIIIlllI = Cipher.getInstance("DES");
            lllllllllllllIlIllIIlIIIIIIIlllI.init(EnumPlayerModelParts.llllIlllIlIlI[2], lllllllllllllIlIllIIlIIIIIIIllll);
            return new String(lllllllllllllIlIllIIlIIIIIIIlllI.doFinal(Base64.getDecoder().decode(lllllllllllllIlIllIIlIIIIIIIllII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIlIllIIlIIIIIIIllIl) {
            lllllllllllllIlIllIIlIIIIIIIllIl.printStackTrace();
            return null;
        }
    }
    
    private static String lIlIllIIIIlIIIl(String lllllllllllllIlIllIIlIIIIIIlllII, final String lllllllllllllIlIllIIlIIIIIlIIIII) {
        lllllllllllllIlIllIIlIIIIIIlllII = new String(Base64.getDecoder().decode(lllllllllllllIlIllIIlIIIIIIlllII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIlIllIIlIIIIIIlllll = new StringBuilder();
        final char[] lllllllllllllIlIllIIlIIIIIIllllI = lllllllllllllIlIllIIlIIIIIlIIIII.toCharArray();
        int lllllllllllllIlIllIIlIIIIIIlllIl = EnumPlayerModelParts.llllIlllIlIlI[0];
        final int lllllllllllllIlIllIIlIIIIIIlIlll = (Object)lllllllllllllIlIllIIlIIIIIIlllII.toCharArray();
        final short lllllllllllllIlIllIIlIIIIIIlIllI = (short)lllllllllllllIlIllIIlIIIIIIlIlll.length;
        char lllllllllllllIlIllIIlIIIIIIlIlIl = (char)EnumPlayerModelParts.llllIlllIlIlI[0];
        while (lIlIllIIIIlllIl(lllllllllllllIlIllIIlIIIIIIlIlIl, lllllllllllllIlIllIIlIIIIIIlIllI)) {
            final char lllllllllllllIlIllIIlIIIIIlIIIlI = lllllllllllllIlIllIIlIIIIIIlIlll[lllllllllllllIlIllIIlIIIIIIlIlIl];
            lllllllllllllIlIllIIlIIIIIIlllll.append((char)(lllllllllllllIlIllIIlIIIIIlIIIlI ^ lllllllllllllIlIllIIlIIIIIIllllI[lllllllllllllIlIllIIlIIIIIIlllIl % lllllllllllllIlIllIIlIIIIIIllllI.length]));
            "".length();
            ++lllllllllllllIlIllIIlIIIIIIlllIl;
            ++lllllllllllllIlIllIIlIIIIIIlIlIl;
            "".length();
            if (-" ".length() >= "   ".length()) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIlIllIIlIIIIIIlllll);
    }
    
    public IChatComponent func_179326_d() {
        return this.field_179339_k;
    }
    
    private EnumPlayerModelParts(final String lllllllllllllIlIllIIlIIIIlIIIIll, final int lllllllllllllIlIllIIlIIIIlIIIIlI, final int lllllllllllllIlIllIIlIIIIlIIIllI, final String lllllllllllllIlIllIIlIIIIlIIIIII) {
        this.partId = lllllllllllllIlIllIIlIIIIlIIIllI;
        this.partMask = EnumPlayerModelParts.llllIlllIlIlI[1] << lllllllllllllIlIllIIlIIIIlIIIllI;
        this.partName = lllllllllllllIlIllIIlIIIIlIIIIII;
        this.field_179339_k = new ChatComponentTranslation(String.valueOf(new StringBuilder(EnumPlayerModelParts.llllIlllIIlll[EnumPlayerModelParts.llllIlllIlIlI[14]]).append(lllllllllllllIlIllIIlIIIIlIIIIII)), new Object[EnumPlayerModelParts.llllIlllIlIlI[0]]);
    }
    
    private static String lIlIllIIIIlIIII(final String lllllllllllllIlIllIIIlllllllllIl, final String lllllllllllllIlIllIIIllllllllllI) {
        try {
            final SecretKeySpec lllllllllllllIlIllIIlIIIIIIIIIlI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIlIllIIIllllllllllI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lllllllllllllIlIllIIlIIIIIIIIIIl = Cipher.getInstance("Blowfish");
            lllllllllllllIlIllIIlIIIIIIIIIIl.init(EnumPlayerModelParts.llllIlllIlIlI[2], lllllllllllllIlIllIIlIIIIIIIIIlI);
            return new String(lllllllllllllIlIllIIlIIIIIIIIIIl.doFinal(Base64.getDecoder().decode(lllllllllllllIlIllIIIlllllllllIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIlIllIIlIIIIIIIIIII) {
            lllllllllllllIlIllIIlIIIIIIIIIII.printStackTrace();
            return null;
        }
    }
    
    public int getPartId() {
        return this.partId;
    }
    
    private static void lIlIllIIIIlIIll() {
        (llllIlllIIlll = new String[EnumPlayerModelParts.llllIlllIlIlI[15]])[EnumPlayerModelParts.llllIlllIlIlI[0]] = lIlIllIIIIlIIII("vU3GmUwO9Tg=", "orJig");
        EnumPlayerModelParts.llllIlllIIlll[EnumPlayerModelParts.llllIlllIlIlI[1]] = lIlIllIIIIlIIIl("KgkXFA==", "Ihgqq");
        EnumPlayerModelParts.llllIlllIIlll[EnumPlayerModelParts.llllIlllIlIlI[2]] = lIlIllIIIIlIIII("F1gdtqCEq2I=", "WzDot");
        EnumPlayerModelParts.llllIlllIIlll[EnumPlayerModelParts.llllIlllIlIlI[3]] = lIlIllIIIIlIIlI("PclKirBMsnY=", "ConKM");
        EnumPlayerModelParts.llllIlllIIlll[EnumPlayerModelParts.llllIlllIlIlI[4]] = lIlIllIIIIlIIlI("qJ/G+LJGk6uVU9rfdqCp9g==", "CEdFS");
        EnumPlayerModelParts.llllIlllIIlll[EnumPlayerModelParts.llllIlllIlIlI[5]] = lIlIllIIIIlIIII("WRn+1T2IxBrquGwv8KklUg==", "yCGVk");
        EnumPlayerModelParts.llllIlllIIlll[EnumPlayerModelParts.llllIlllIlIlI[6]] = lIlIllIIIIlIIIl("ERwBKTAcBgokIRUQ", "CUFad");
        EnumPlayerModelParts.llllIlllIIlll[EnumPlayerModelParts.llllIlllIlIlI[7]] = lIlIllIIIIlIIIl("Fxs2Oxw6AT02DRMX", "erQSh");
        EnumPlayerModelParts.llllIlllIIlll[EnumPlayerModelParts.llllIlllIlIlI[8]] = lIlIllIIIIlIIII("cD6OA927LVTw484Ao8ReRQ==", "PElWm");
        EnumPlayerModelParts.llllIlllIIlll[EnumPlayerModelParts.llllIlllIlIlI[9]] = lIlIllIIIIlIIIl("OS8JPCslKwE8BwomCi8=", "UJoHt");
        EnumPlayerModelParts.llllIlllIIlll[EnumPlayerModelParts.llllIlllIlIlI[10]] = lIlIllIIIIlIIIl("BAUAJz0JHAYhPQUTCyou", "VLGoi");
        EnumPlayerModelParts.llllIlllIIlll[EnumPlayerModelParts.llllIlllIlIlI[11]] = lIlIllIIIIlIIII("olD1NCymESiRNjDrN4TadQ==", "ZHWMX");
        EnumPlayerModelParts.llllIlllIIlll[EnumPlayerModelParts.llllIlllIlIlI[12]] = lIlIllIIIIlIIlI("XBv7kboY7ec=", "SbHnw");
        EnumPlayerModelParts.llllIlllIIlll[EnumPlayerModelParts.llllIlllIlIlI[13]] = lIlIllIIIIlIIIl("CgI/", "bcKgq");
        EnumPlayerModelParts.llllIlllIIlll[EnumPlayerModelParts.llllIlllIlIlI[14]] = lIlIllIIIIlIIII("e5CnHj/mA3/IvMn/x4wOmbZnmBBZ1AKi", "npxyY");
    }
    
    private static void lIlIllIIIIlllII() {
        (llllIlllIlIlI = new int[16])[0] = ((3 + 103 + 36 + 27 ^ 103 + 131 - 116 + 30) & (0x56 ^ 0x4C ^ (0x32 ^ 0x15) ^ -" ".length()));
        EnumPlayerModelParts.llllIlllIlIlI[1] = " ".length();
        EnumPlayerModelParts.llllIlllIlIlI[2] = "  ".length();
        EnumPlayerModelParts.llllIlllIlIlI[3] = "   ".length();
        EnumPlayerModelParts.llllIlllIlIlI[4] = (0x11 ^ 0x15);
        EnumPlayerModelParts.llllIlllIlIlI[5] = (0x8D ^ 0x88);
        EnumPlayerModelParts.llllIlllIlIlI[6] = (0x5B ^ 0x5D);
        EnumPlayerModelParts.llllIlllIlIlI[7] = (0x64 ^ 0x63);
        EnumPlayerModelParts.llllIlllIlIlI[8] = (0x5B ^ 0x3A ^ (0x70 ^ 0x19));
        EnumPlayerModelParts.llllIlllIlIlI[9] = (0x16 ^ 0x2D ^ (0xA5 ^ 0x97));
        EnumPlayerModelParts.llllIlllIlIlI[10] = (0x7E ^ 0x5D ^ (0x70 ^ 0x59));
        EnumPlayerModelParts.llllIlllIlIlI[11] = (0x4 ^ 0xF);
        EnumPlayerModelParts.llllIlllIlIlI[12] = (0x26 ^ 0x2A);
        EnumPlayerModelParts.llllIlllIlIlI[13] = (0x20 ^ 0x2D);
        EnumPlayerModelParts.llllIlllIlIlI[14] = (((0x66 ^ 0x70) & ~(0x41 ^ 0x57)) ^ (0x8A ^ 0x84));
        EnumPlayerModelParts.llllIlllIlIlI[15] = (70 + 52 + 14 + 27 ^ 121 + 105 - 178 + 124);
    }
}
