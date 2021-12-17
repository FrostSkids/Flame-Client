// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.client.audio;

import com.google.common.collect.Maps;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Map;

public enum SoundCategory
{
    private static final /* synthetic */ String[] llIlIIIIIlIllI;
    
    BLOCKS(SoundCategory.llIlIIIIIlIllI[SoundCategory.llIlIIIIIllIII[8]], SoundCategory.llIlIIIIIllIII[4], SoundCategory.llIlIIIIIlIllI[SoundCategory.llIlIIIIIllIII[9]], SoundCategory.llIlIIIIIllIII[4]), 
    ANIMALS(SoundCategory.llIlIIIIIlIllI[SoundCategory.llIlIIIIIllIII[12]], SoundCategory.llIlIIIIIllIII[6], SoundCategory.llIlIIIIIlIllI[SoundCategory.llIlIIIIIllIII[13]], SoundCategory.llIlIIIIIllIII[6]), 
    RECORDS(SoundCategory.llIlIIIIIlIllI[SoundCategory.llIlIIIIIllIII[4]], SoundCategory.llIlIIIIIllIII[2], SoundCategory.llIlIIIIIlIllI[SoundCategory.llIlIIIIIllIII[5]], SoundCategory.llIlIIIIIllIII[2]), 
    AMBIENT(SoundCategory.llIlIIIIIlIllI[SoundCategory.llIlIIIIIllIII[16]], SoundCategory.llIlIIIIIllIII[8], SoundCategory.llIlIIIIIlIllI[SoundCategory.llIlIIIIIllIII[17]], SoundCategory.llIlIIIIIllIII[8]);
    
    private static final /* synthetic */ int[] llIlIIIIIllIII;
    
    PLAYERS(SoundCategory.llIlIIIIIlIllI[SoundCategory.llIlIIIIIllIII[14]], SoundCategory.llIlIIIIIllIII[7], SoundCategory.llIlIIIIIlIllI[SoundCategory.llIlIIIIIllIII[15]], SoundCategory.llIlIIIIIllIII[7]);
    
    private final /* synthetic */ int categoryId;
    
    MUSIC(SoundCategory.llIlIIIIIlIllI[SoundCategory.llIlIIIIIllIII[2]], SoundCategory.llIlIIIIIllIII[1], SoundCategory.llIlIIIIIlIllI[SoundCategory.llIlIIIIIllIII[3]], SoundCategory.llIlIIIIIllIII[1]);
    
    private static final /* synthetic */ Map<String, SoundCategory> NAME_CATEGORY_MAP;
    private static final /* synthetic */ Map<Integer, SoundCategory> ID_CATEGORY_MAP;
    
    WEATHER(SoundCategory.llIlIIIIIlIllI[SoundCategory.llIlIIIIIllIII[6]], SoundCategory.llIlIIIIIllIII[3], SoundCategory.llIlIIIIIlIllI[SoundCategory.llIlIIIIIllIII[7]], SoundCategory.llIlIIIIIllIII[3]);
    
    private final /* synthetic */ String categoryName;
    
    MOBS(SoundCategory.llIlIIIIIlIllI[SoundCategory.llIlIIIIIllIII[10]], SoundCategory.llIlIIIIIllIII[5], SoundCategory.llIlIIIIIlIllI[SoundCategory.llIlIIIIIllIII[11]], SoundCategory.llIlIIIIIllIII[5]), 
    MASTER(SoundCategory.llIlIIIIIlIllI[SoundCategory.llIlIIIIIllIII[0]], SoundCategory.llIlIIIIIllIII[0], SoundCategory.llIlIIIIIlIllI[SoundCategory.llIlIIIIIllIII[1]], SoundCategory.llIlIIIIIllIII[0]);
    
    private static boolean lIIlIIIlIIlllIII(final int llllllllllllIllIllIllIllIllIllll) {
        return llllllllllllIllIllIllIllIllIllll == 0;
    }
    
    private static boolean lIIlIIIlIIlllIll(final int llllllllllllIllIllIllIllIllllIlI, final int llllllllllllIllIllIllIllIllllIIl) {
        return llllllllllllIllIllIllIllIllllIlI < llllllllllllIllIllIllIllIllllIIl;
    }
    
    private static String lIIlIIIlIIlIlIlI(final String llllllllllllIllIllIllIlllIIlIlll, final String llllllllllllIllIllIllIlllIIlIllI) {
        try {
            final SecretKeySpec llllllllllllIllIllIllIlllIIllIll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIllIllIllIlllIIlIllI.getBytes(StandardCharsets.UTF_8)), SoundCategory.llIlIIIIIllIII[8]), "DES");
            final Cipher llllllllllllIllIllIllIlllIIllIIl = Cipher.getInstance("DES");
            llllllllllllIllIllIllIlllIIllIIl.init(SoundCategory.llIlIIIIIllIII[2], llllllllllllIllIllIllIlllIIllIll);
            return new String(llllllllllllIllIllIllIlllIIllIIl.doFinal(Base64.getDecoder().decode(llllllllllllIllIllIllIlllIIlIlll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIllIllIllIlllIIllIII) {
            llllllllllllIllIllIllIlllIIllIII.printStackTrace();
            return null;
        }
    }
    
    public String getCategoryName() {
        return this.categoryName;
    }
    
    public int getCategoryId() {
        return this.categoryId;
    }
    
    static {
        lIIlIIIlIIllIlll();
        lIIlIIIlIIlIllIl();
        final SoundCategory[] enum$VALUES = new SoundCategory[SoundCategory.llIlIIIIIllIII[9]];
        enum$VALUES[SoundCategory.llIlIIIIIllIII[0]] = SoundCategory.MASTER;
        enum$VALUES[SoundCategory.llIlIIIIIllIII[1]] = SoundCategory.MUSIC;
        enum$VALUES[SoundCategory.llIlIIIIIllIII[2]] = SoundCategory.RECORDS;
        enum$VALUES[SoundCategory.llIlIIIIIllIII[3]] = SoundCategory.WEATHER;
        enum$VALUES[SoundCategory.llIlIIIIIllIII[4]] = SoundCategory.BLOCKS;
        enum$VALUES[SoundCategory.llIlIIIIIllIII[5]] = SoundCategory.MOBS;
        enum$VALUES[SoundCategory.llIlIIIIIllIII[6]] = SoundCategory.ANIMALS;
        enum$VALUES[SoundCategory.llIlIIIIIllIII[7]] = SoundCategory.PLAYERS;
        enum$VALUES[SoundCategory.llIlIIIIIllIII[8]] = SoundCategory.AMBIENT;
        ENUM$VALUES = enum$VALUES;
        NAME_CATEGORY_MAP = Maps.newHashMap();
        ID_CATEGORY_MAP = Maps.newHashMap();
        final boolean llllllllllllIllIllIlllIIIIlllIll;
        final int llllllllllllIllIllIlllIIIIllllIl = ((SoundCategory[])(Object)(llllllllllllIllIllIlllIIIIlllIll = (boolean)(Object)values())).length;
        boolean llllllllllllIllIllIlllIIIIlllllI = SoundCategory.llIlIIIIIllIII[0] != 0;
        "".length();
        if (-" ".length() != -" ".length()) {
            return;
        }
        while (!lIIlIIIlIIlllIlI(llllllllllllIllIllIlllIIIIlllllI ? 1 : 0, llllllllllllIllIllIlllIIIIllllIl)) {
            final SoundCategory llllllllllllIllIllIlllIIIlIIIlII = llllllllllllIllIllIlllIIIIlllIll[llllllllllllIllIllIlllIIIIlllllI];
            if (!lIIlIIIlIIlllIII(SoundCategory.NAME_CATEGORY_MAP.containsKey(llllllllllllIllIllIlllIIIlIIIlII.getCategoryName()) ? 1 : 0) || lIIlIIIlIIlllIIl(SoundCategory.ID_CATEGORY_MAP.containsKey(llllllllllllIllIllIlllIIIlIIIlII.getCategoryId()) ? 1 : 0)) {
                throw new Error(String.valueOf(new StringBuilder(SoundCategory.llIlIIIIIlIllI[SoundCategory.llIlIIIIIllIII[18]]).append(llllllllllllIllIllIlllIIIlIIIlII)));
            }
            SoundCategory.NAME_CATEGORY_MAP.put(llllllllllllIllIllIlllIIIlIIIlII.getCategoryName(), llllllllllllIllIllIlllIIIlIIIlII);
            "".length();
            SoundCategory.ID_CATEGORY_MAP.put(llllllllllllIllIllIlllIIIlIIIlII.getCategoryId(), llllllllllllIllIllIlllIIIlIIIlII);
            "".length();
            ++llllllllllllIllIllIlllIIIIlllllI;
        }
    }
    
    private static void lIIlIIIlIIlIllIl() {
        (llIlIIIIIlIllI = new String[SoundCategory.llIlIIIIIllIII[19]])[SoundCategory.llIlIIIIIllIII[0]] = lIIlIIIlIIlIlIlI("S4yy/pD/5lk=", "yfCdh");
        SoundCategory.llIlIIIIIlIllI[SoundCategory.llIlIIIIIllIII[1]] = lIIlIIIlIIlIlIlI("RFvrb7oPRBM=", "URJky");
        SoundCategory.llIlIIIIIlIllI[SoundCategory.llIlIIIIIllIII[2]] = lIIlIIIlIIlIlIll("KDICBQo=", "egQLI");
        SoundCategory.llIlIIIIIlIllI[SoundCategory.llIlIIIIIllIII[3]] = lIIlIIIlIIlIlIll("HhQaMzY=", "saiZU");
        SoundCategory.llIlIIIIIlIllI[SoundCategory.llIlIIIIIllIII[4]] = lIIlIIIlIIlIlIlI("iyq0nFfdlmc=", "WAaZQ");
        SoundCategory.llIlIIIIIlIllI[SoundCategory.llIlIIIIIllIII[5]] = lIIlIIIlIIlIlIll("Hj8zOAQI", "lZPWv");
        SoundCategory.llIlIIIIIlIllI[SoundCategory.llIlIIIIIllIII[6]] = lIIlIIIlIIlIlIll("DycgNwUdMA==", "XbacM");
        SoundCategory.llIlIIIIIlIllI[SoundCategory.llIlIIIIIllIII[7]] = lIIlIIIlIIlIlIlI("RYj9S/jYyvc=", "ymoAQ");
        SoundCategory.llIlIIIIIlIllI[SoundCategory.llIlIIIIIllIII[8]] = lIIlIIIlIIlIllII("Z0mTl05RJLk=", "uXgcB");
        SoundCategory.llIlIIIIIlIllI[SoundCategory.llIlIIIIIllIII[9]] = lIIlIIIlIIlIllII("myIcD3z8sx8=", "cegZs");
        SoundCategory.llIlIIIIIlIllI[SoundCategory.llIlIIIIIllIII[10]] = lIIlIIIlIIlIllII("QBYIKMcFJd0=", "WBFfX");
        SoundCategory.llIlIIIIIlIllI[SoundCategory.llIlIIIIIllIII[11]] = lIIlIIIlIIlIlIlI("HZecnIhG2yA=", "PEQWH");
        SoundCategory.llIlIIIIIlIllI[SoundCategory.llIlIIIIIllIII[12]] = lIIlIIIlIIlIlIll("IhcPFQcvCg==", "cYFXF");
        SoundCategory.llIlIIIIIlIllI[SoundCategory.llIlIIIIIllIII[13]] = lIIlIIIlIIlIllII("AXiLkxmzRUI=", "QDYdk");
        SoundCategory.llIlIIIIIlIllI[SoundCategory.llIlIIIIIllIII[14]] = lIIlIIIlIIlIlIlI("zq/9jvVdjuk=", "IrZgx");
        SoundCategory.llIlIIIIIlIllI[SoundCategory.llIlIIIIIllIII[15]] = lIIlIIIlIIlIlIll("OgkXGCc4", "JevaB");
        SoundCategory.llIlIIIIIlIllI[SoundCategory.llIlIIIIIllIII[16]] = lIIlIIIlIIlIlIlI("MUDrge/jeSo=", "JLsMA");
        SoundCategory.llIlIIIIIlIllI[SoundCategory.llIlIIIIIllIII[17]] = lIIlIIIlIIlIllII("Q1XSpNwOQJk=", "YqRHV");
        SoundCategory.llIlIIIIIlIllI[SoundCategory.llIlIIIIIllIII[18]] = lIIlIIIlIIlIlIlI("5TVPfXBYF4VfbaAYe2iSa5S9I7Q9eVHGM8pQ+XeWn00BXTC6K4vlWNfDDq21ERGJwOSP1CKwQ6I=", "TncAn");
    }
    
    private static boolean lIIlIIIlIIlllIlI(final int llllllllllllIllIllIllIlllIIIIlII, final int llllllllllllIllIllIllIlllIIIIIlI) {
        return llllllllllllIllIllIllIlllIIIIlII >= llllllllllllIllIllIllIlllIIIIIlI;
    }
    
    private static boolean lIIlIIIlIIlllIIl(final int llllllllllllIllIllIllIllIlllIlII) {
        return llllllllllllIllIllIllIllIlllIlII != 0;
    }
    
    public static SoundCategory getCategory(final String llllllllllllIllIllIlllIIIIIIlIll) {
        return SoundCategory.NAME_CATEGORY_MAP.get(llllllllllllIllIllIlllIIIIIIlIll);
    }
    
    private static String lIIlIIIlIIlIlIll(String llllllllllllIllIllIllIllllIIlllI, final String llllllllllllIllIllIllIllllIlIlll) {
        llllllllllllIllIllIllIllllIIlllI = (float)new String(Base64.getDecoder().decode(((String)llllllllllllIllIllIllIllllIIlllI).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder llllllllllllIllIllIllIllllIlIlIl = new StringBuilder();
        final char[] llllllllllllIllIllIllIllllIlIIll = llllllllllllIllIllIllIllllIlIlll.toCharArray();
        int llllllllllllIllIllIllIllllIlIIII = SoundCategory.llIlIIIIIllIII[0];
        final Exception llllllllllllIllIllIllIllllIIIlIl = (Object)((String)llllllllllllIllIllIllIllllIIlllI).toCharArray();
        final boolean llllllllllllIllIllIllIllllIIIlII = llllllllllllIllIllIllIllllIIIlIl.length != 0;
        byte llllllllllllIllIllIllIllllIIIIlI = (byte)SoundCategory.llIlIIIIIllIII[0];
        while (lIIlIIIlIIlllIll(llllllllllllIllIllIllIllllIIIIlI, llllllllllllIllIllIllIllllIIIlII ? 1 : 0)) {
            final char llllllllllllIllIllIllIllllIllIlI = llllllllllllIllIllIllIllllIIIlIl[llllllllllllIllIllIllIllllIIIIlI];
            llllllllllllIllIllIllIllllIlIlIl.append((char)(llllllllllllIllIllIllIllllIllIlI ^ llllllllllllIllIllIllIllllIlIIll[llllllllllllIllIllIllIllllIlIIII % llllllllllllIllIllIllIllllIlIIll.length]));
            "".length();
            ++llllllllllllIllIllIllIllllIlIIII;
            ++llllllllllllIllIllIllIllllIIIIlI;
            "".length();
            if (((0x43 ^ 0x6B ^ 83 + 26 - 49 + 67) & (0x4D ^ 0x0 ^ (0xA8 ^ 0xB2) ^ -" ".length())) > (0xD3 ^ 0xA3 ^ (0xF9 ^ 0x8D))) {
                return null;
            }
        }
        return String.valueOf(llllllllllllIllIllIllIllllIlIlIl);
    }
    
    private static String lIIlIIIlIIlIllII(final String llllllllllllIllIllIllIlllIlIlllI, final String llllllllllllIllIllIllIlllIlIllII) {
        try {
            final SecretKeySpec llllllllllllIllIllIllIlllIllIlII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIllIllIllIlllIlIllII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher llllllllllllIllIllIllIlllIllIIlI = Cipher.getInstance("Blowfish");
            llllllllllllIllIllIllIlllIllIIlI.init(SoundCategory.llIlIIIIIllIII[2], llllllllllllIllIllIllIlllIllIlII);
            return new String(llllllllllllIllIllIllIlllIllIIlI.doFinal(Base64.getDecoder().decode(llllllllllllIllIllIllIlllIlIlllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIllIllIllIlllIllIIII) {
            llllllllllllIllIllIllIlllIllIIII.printStackTrace();
            return null;
        }
    }
    
    private static void lIIlIIIlIIllIlll() {
        (llIlIIIIIllIII = new int[20])[0] = ((0x63 ^ 0x7E) & ~(0x51 ^ 0x4C));
        SoundCategory.llIlIIIIIllIII[1] = " ".length();
        SoundCategory.llIlIIIIIllIII[2] = "  ".length();
        SoundCategory.llIlIIIIIllIII[3] = "   ".length();
        SoundCategory.llIlIIIIIllIII[4] = (0x8A ^ 0x85 ^ (0x5F ^ 0x54));
        SoundCategory.llIlIIIIIllIII[5] = (50 + 63 - 109 + 123 ^ (0x7A ^ 0x0));
        SoundCategory.llIlIIIIIllIII[6] = (148 + 51 - 14 + 14 ^ 113 + 32 - 59 + 107);
        SoundCategory.llIlIIIIIllIII[7] = (0x97 ^ 0x8B ^ (0xBA ^ 0xA1));
        SoundCategory.llIlIIIIIllIII[8] = (0x86 ^ 0x8E);
        SoundCategory.llIlIIIIIllIII[9] = (0xE ^ 0x57 ^ (0x6C ^ 0x3C));
        SoundCategory.llIlIIIIIllIII[10] = (0xB ^ 0x1);
        SoundCategory.llIlIIIIIllIII[11] = (0x10 ^ 0x68 ^ (0x20 ^ 0x53));
        SoundCategory.llIlIIIIIllIII[12] = (0x53 ^ 0x5F);
        SoundCategory.llIlIIIIIllIII[13] = (0xA3 ^ 0xAD ^ "   ".length());
        SoundCategory.llIlIIIIIllIII[14] = (0x5B ^ 0x55);
        SoundCategory.llIlIIIIIllIII[15] = (0x5A ^ 0x55);
        SoundCategory.llIlIIIIIllIII[16] = (0x70 ^ 0x32 ^ (0x1F ^ 0x4D));
        SoundCategory.llIlIIIIIllIII[17] = (0xA4 ^ 0xB5);
        SoundCategory.llIlIIIIIllIII[18] = (0x8B ^ 0xA8 ^ (0x47 ^ 0x76));
        SoundCategory.llIlIIIIIllIII[19] = (0x4D ^ 0x21 ^ 112 + 27 - 34 + 22);
    }
    
    private SoundCategory(final String llllllllllllIllIllIlllIIIIlIIlIl, final int llllllllllllIllIllIlllIIIIlIIIll, final String llllllllllllIllIllIlllIIIIlIIIIl, final int llllllllllllIllIllIlllIIIIlIlIIl) {
        this.categoryName = llllllllllllIllIllIlllIIIIlIIIIl;
        this.categoryId = llllllllllllIllIllIlllIIIIlIlIIl;
    }
}
