// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.client.resources.data;

import java.util.Arrays;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.security.MessageDigest;
import com.google.gson.JsonObject;
import org.apache.commons.lang3.Validate;
import net.minecraft.util.JsonUtils;
import com.google.gson.JsonParseException;
import com.google.gson.JsonDeserializationContext;
import java.lang.reflect.Type;
import com.google.gson.JsonElement;
import java.nio.charset.StandardCharsets;
import java.util.Base64;

public class FontMetadataSectionSerializer extends BaseMetadataSectionSerializer<FontMetadataSection>
{
    private static final /* synthetic */ String[] lIllIIllIIIlll;
    private static final /* synthetic */ int[] lIllIIllIlIIlI;
    
    static {
        lllllIlIlIlIlIl();
        lllllIlIlIIllll();
    }
    
    @Override
    public String getSectionName() {
        return FontMetadataSectionSerializer.lIllIIllIIIlll[FontMetadataSectionSerializer.lIllIIllIlIIlI[25]];
    }
    
    private static String lllllIlIlIIIIll(String lllllllllllllIIIIIIllIIlIIlllIll, final String lllllllllllllIIIIIIllIIlIIlllIlI) {
        lllllllllllllIIIIIIllIIlIIlllIll = (int)new String(Base64.getDecoder().decode(((String)lllllllllllllIIIIIIllIIlIIlllIll).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIIIIIIllIIlIIlllllI = new StringBuilder();
        final char[] lllllllllllllIIIIIIllIIlIIllllIl = lllllllllllllIIIIIIllIIlIIlllIlI.toCharArray();
        int lllllllllllllIIIIIIllIIlIIllllII = FontMetadataSectionSerializer.lIllIIllIlIIlI[1];
        final boolean lllllllllllllIIIIIIllIIlIIllIllI = (Object)((String)lllllllllllllIIIIIIllIIlIIlllIll).toCharArray();
        final byte lllllllllllllIIIIIIllIIlIIllIlIl = (byte)lllllllllllllIIIIIIllIIlIIllIllI.length;
        short lllllllllllllIIIIIIllIIlIIllIlII = (short)FontMetadataSectionSerializer.lIllIIllIlIIlI[1];
        while (lllllIlIlIllIll(lllllllllllllIIIIIIllIIlIIllIlII, lllllllllllllIIIIIIllIIlIIllIlIl)) {
            final char lllllllllllllIIIIIIllIIlIlIIIIIl = lllllllllllllIIIIIIllIIlIIllIllI[lllllllllllllIIIIIIllIIlIIllIlII];
            lllllllllllllIIIIIIllIIlIIlllllI.append((char)(lllllllllllllIIIIIIllIIlIlIIIIIl ^ lllllllllllllIIIIIIllIIlIIllllIl[lllllllllllllIIIIIIllIIlIIllllII % lllllllllllllIIIIIIllIIlIIllllIl.length]));
            "".length();
            ++lllllllllllllIIIIIIllIIlIIllllII;
            ++lllllllllllllIIIIIIllIIlIIllIlII;
            "".length();
            if (" ".length() == 0) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIIIIIIllIIlIIlllllI);
    }
    
    private static boolean lllllIlIlIlIllI(final int lllllllllllllIIIIIIllIIlIIIllIlI) {
        return lllllllllllllIIIIIIllIIlIIIllIlI != 0;
    }
    
    private static boolean lllllIlIlIllIll(final int lllllllllllllIIIIIIllIIlIIIlllll, final int lllllllllllllIIIIIIllIIlIIIllllI) {
        return lllllllllllllIIIIIIllIIlIIIlllll < lllllllllllllIIIIIIllIIlIIIllllI;
    }
    
    private static void lllllIlIlIIllll() {
        (lIllIIllIIIlll = new String[FontMetadataSectionSerializer.lIllIIllIlIIlI[26]])[FontMetadataSectionSerializer.lIllIIllIlIIlI[1]] = lllllIlIlIIIIll("Nw4FAjg3EgECKg==", "TfdpY");
        FontMetadataSectionSerializer.lIllIIllIIIlll[FontMetadataSectionSerializer.lIllIIllIlIIlI[2]] = lllllIlIlIIIlII("c6wrJWTYj5AFHTghwGjmpw==", "aAiHp");
        FontMetadataSectionSerializer.lIllIIllIIIlll[FontMetadataSectionSerializer.lIllIIllIlIIlI[3]] = lllllIlIlIIIlII("/Q4aFwB7cWqorPWx89UhVn3g9Zo1HBTW6d2C/97mFmO/NJKHzuqs4uc88dzskbXr", "VmJCp");
        FontMetadataSectionSerializer.lIllIIllIIIlll[FontMetadataSectionSerializer.lIllIIllIlIIlI[4]] = lllllIlIlIIIlII("wGi3jFmwlzkS2LEbCi/bLg==", "LvwPx");
        FontMetadataSectionSerializer.lIllIIllIIIlll[FontMetadataSectionSerializer.lIllIIllIlIIlI[5]] = lllllIlIlIIIlII("HE2juYobKCW0O+glG5SCbA==", "xAtWO");
        FontMetadataSectionSerializer.lIllIIllIIIlll[FontMetadataSectionSerializer.lIllIIllIlIIlI[6]] = lllllIlIlIIlIIl("rwwit/gULTI=", "ZMZsA");
        FontMetadataSectionSerializer.lIllIIllIIIlll[FontMetadataSectionSerializer.lIllIIllIlIIlI[7]] = lllllIlIlIIIIll("JSEnOT8tMA==", "ADAXJ");
        FontMetadataSectionSerializer.lIllIIllIIIlll[FontMetadataSectionSerializer.lIllIIllIlIIlI[8]] = lllllIlIlIIIIll("CAkdEDgoA0sXOy8TRk83KQYZEDc1AhkCeX8DDhc1NAsfS3QkHxsUNzUCD1E7Iw0OEiBtRxwQJ2E=", "AgkqT");
        FontMetadataSectionSerializer.lIllIIllIIIlll[FontMetadataSectionSerializer.lIllIIllIlIIlI[9]] = lllllIlIlIIlIIl("DRibOnEKMhE=", "CJRwQ");
        FontMetadataSectionSerializer.lIllIIllIIIlll[FontMetadataSectionSerializer.lIllIIllIlIIlI[10]] = lllllIlIlIIIlII("7a43plZ7RJA=", "VXGGE");
        FontMetadataSectionSerializer.lIllIIllIIIlll[FontMetadataSectionSerializer.lIllIIllIlIIlI[11]] = lllllIlIlIIIlII("JmRNBNvnG58=", "hfefS");
        FontMetadataSectionSerializer.lIllIIllIIIlll[FontMetadataSectionSerializer.lIllIIllIlIIlI[12]] = lllllIlIlIIIlII("YgOB0b1AiF2qvarYiud5mbI2zBkmq7JR", "pzyCk");
        FontMetadataSectionSerializer.lIllIIllIIIlll[FontMetadataSectionSerializer.lIllIIllIlIIlI[13]] = lllllIlIlIIIIll("IyMiMg0+NA==", "PSCQd");
        FontMetadataSectionSerializer.lIllIIllIIIlll[FontMetadataSectionSerializer.lIllIIllIlIIlI[14]] = lllllIlIlIIIlII("XeovlsqJy29cDssnsubrhKKqtdddkM4Y", "zBmTl");
        FontMetadataSectionSerializer.lIllIIllIIIlll[FontMetadataSectionSerializer.lIllIIllIlIIlI[15]] = lllllIlIlIIIlII("EF6rY2Lcx94=", "aOebH");
        FontMetadataSectionSerializer.lIllIIllIIIlll[FontMetadataSectionSerializer.lIllIIllIlIIlI[16]] = lllllIlIlIIlIIl("4aqOjoOc35SUJklH9hrzdRP6jDeKhUgq", "JOyNZ");
        FontMetadataSectionSerializer.lIllIIllIIIlll[FontMetadataSectionSerializer.lIllIIllIlIIlI[17]] = lllllIlIlIIIlII("wmJPY2hQnXPdUWoWnExU0w==", "Kgyfy");
        FontMetadataSectionSerializer.lIllIIllIIIlll[FontMetadataSectionSerializer.lIllIIllIlIIlI[18]] = lllllIlIlIIIIll("DQ==", "PiMKo");
        FontMetadataSectionSerializer.lIllIIllIIIlll[FontMetadataSectionSerializer.lIllIIllIlIIlI[19]] = lllllIlIlIIlIIl("9AFLaz11omA=", "XmcJH");
        FontMetadataSectionSerializer.lIllIIllIIIlll[FontMetadataSectionSerializer.lIllIIllIlIIlI[20]] = lllllIlIlIIlIIl("ESt4pyZz0/JhFGg25bcmug==", "XLUzI");
        FontMetadataSectionSerializer.lIllIIllIIIlll[FontMetadataSectionSerializer.lIllIIllIlIIlI[21]] = lllllIlIlIIIlII("cGkE449R++Y=", "CNUEw");
        FontMetadataSectionSerializer.lIllIIllIIIlll[FontMetadataSectionSerializer.lIllIIllIlIIlI[22]] = lllllIlIlIIlIIl("daLp5LyZ7gMjrARPhrFRVw==", "myEnu");
        FontMetadataSectionSerializer.lIllIIllIIIlll[FontMetadataSectionSerializer.lIllIIllIlIIlI[23]] = lllllIlIlIIIlII("fsY983iH2Zk=", "gJblP");
        FontMetadataSectionSerializer.lIllIIllIIIlll[FontMetadataSectionSerializer.lIllIIllIlIIlI[24]] = lllllIlIlIIIlII("ezj5ds2o8Ef1i4/QgHhRdw==", "tVtBp");
        FontMetadataSectionSerializer.lIllIIllIIIlll[FontMetadataSectionSerializer.lIllIIllIlIIlI[25]] = lllllIlIlIIIlII("fBBpWHuhLi8=", "qbLiN");
    }
    
    public FontMetadataSection deserialize(final JsonElement lllllllllllllIIIIIIllIIllIIIIIIl, final Type lllllllllllllIIIIIIllIIllIIIIIII, final JsonDeserializationContext lllllllllllllIIIIIIllIIlIlllllll) throws JsonParseException {
        final JsonObject lllllllllllllIIIIIIllIIlIllllllI = lllllllllllllIIIIIIllIIllIIIIIIl.getAsJsonObject();
        final float[] lllllllllllllIIIIIIllIIlIlllllIl = new float[FontMetadataSectionSerializer.lIllIIllIlIIlI[0]];
        final float[] lllllllllllllIIIIIIllIIlIlllllII = new float[FontMetadataSectionSerializer.lIllIIllIlIIlI[0]];
        final float[] lllllllllllllIIIIIIllIIlIllllIll = new float[FontMetadataSectionSerializer.lIllIIllIlIIlI[0]];
        float lllllllllllllIIIIIIllIIlIllllIlI = 1.0f;
        float lllllllllllllIIIIIIllIIlIllllIIl = 0.0f;
        float lllllllllllllIIIIIIllIIlIllllIII = 0.0f;
        if (lllllIlIlIlIllI(lllllllllllllIIIIIIllIIlIllllllI.has(FontMetadataSectionSerializer.lIllIIllIIIlll[FontMetadataSectionSerializer.lIllIIllIlIIlI[1]]) ? 1 : 0)) {
            if (lllllIlIlIlIlll(lllllllllllllIIIIIIllIIlIllllllI.get(FontMetadataSectionSerializer.lIllIIllIIIlll[FontMetadataSectionSerializer.lIllIIllIlIIlI[2]]).isJsonObject() ? 1 : 0)) {
                throw new JsonParseException(String.valueOf(new StringBuilder(FontMetadataSectionSerializer.lIllIIllIIIlll[FontMetadataSectionSerializer.lIllIIllIlIIlI[3]]).append(lllllllllllllIIIIIIllIIlIllllllI.get(FontMetadataSectionSerializer.lIllIIllIIIlll[FontMetadataSectionSerializer.lIllIIllIlIIlI[4]]))));
            }
            final JsonObject lllllllllllllIIIIIIllIIlIlllIlll = lllllllllllllIIIIIIllIIlIllllllI.getAsJsonObject(FontMetadataSectionSerializer.lIllIIllIIIlll[FontMetadataSectionSerializer.lIllIIllIlIIlI[5]]);
            if (lllllIlIlIlIllI(lllllllllllllIIIIIIllIIlIlllIlll.has(FontMetadataSectionSerializer.lIllIIllIIIlll[FontMetadataSectionSerializer.lIllIIllIlIIlI[6]]) ? 1 : 0)) {
                if (lllllIlIlIlIlll(lllllllllllllIIIIIIllIIlIlllIlll.get(FontMetadataSectionSerializer.lIllIIllIIIlll[FontMetadataSectionSerializer.lIllIIllIlIIlI[7]]).isJsonObject() ? 1 : 0)) {
                    throw new JsonParseException(String.valueOf(new StringBuilder(FontMetadataSectionSerializer.lIllIIllIIIlll[FontMetadataSectionSerializer.lIllIIllIlIIlI[8]]).append(lllllllllllllIIIIIIllIIlIlllIlll.get(FontMetadataSectionSerializer.lIllIIllIIIlll[FontMetadataSectionSerializer.lIllIIllIlIIlI[9]]))));
                }
                final JsonObject lllllllllllllIIIIIIllIIlIlllIllI = lllllllllllllIIIIIIllIIlIlllIlll.getAsJsonObject(FontMetadataSectionSerializer.lIllIIllIIIlll[FontMetadataSectionSerializer.lIllIIllIlIIlI[10]]);
                lllllllllllllIIIIIIllIIlIllllIlI = JsonUtils.getFloat(lllllllllllllIIIIIIllIIlIlllIllI, FontMetadataSectionSerializer.lIllIIllIIIlll[FontMetadataSectionSerializer.lIllIIllIlIIlI[11]], lllllllllllllIIIIIIllIIlIllllIlI);
                Validate.inclusiveBetween(0.0, 3.4028234663852886E38, (double)lllllllllllllIIIIIIllIIlIllllIlI, FontMetadataSectionSerializer.lIllIIllIIIlll[FontMetadataSectionSerializer.lIllIIllIlIIlI[12]]);
                lllllllllllllIIIIIIllIIlIllllIIl = JsonUtils.getFloat(lllllllllllllIIIIIIllIIlIlllIllI, FontMetadataSectionSerializer.lIllIIllIIIlll[FontMetadataSectionSerializer.lIllIIllIlIIlI[13]], lllllllllllllIIIIIIllIIlIllllIIl);
                Validate.inclusiveBetween(0.0, 3.4028234663852886E38, (double)lllllllllllllIIIIIIllIIlIllllIIl, FontMetadataSectionSerializer.lIllIIllIIIlll[FontMetadataSectionSerializer.lIllIIllIlIIlI[14]]);
                lllllllllllllIIIIIIllIIlIllllIII = JsonUtils.getFloat(lllllllllllllIIIIIIllIIlIlllIllI, FontMetadataSectionSerializer.lIllIIllIIIlll[FontMetadataSectionSerializer.lIllIIllIlIIlI[15]], lllllllllllllIIIIIIllIIlIllllIIl);
                Validate.inclusiveBetween(0.0, 3.4028234663852886E38, (double)lllllllllllllIIIIIIllIIlIllllIII, FontMetadataSectionSerializer.lIllIIllIIIlll[FontMetadataSectionSerializer.lIllIIllIlIIlI[16]]);
            }
            int lllllllllllllIIIIIIllIIlIlllIlIl = FontMetadataSectionSerializer.lIllIIllIlIIlI[1];
            "".length();
            if (-"  ".length() > 0) {
                return null;
            }
            while (!lllllIlIlIllIlI(lllllllllllllIIIIIIllIIlIlllIlIl, FontMetadataSectionSerializer.lIllIIllIlIIlI[0])) {
                final JsonElement lllllllllllllIIIIIIllIIlIlllIlII = lllllllllllllIIIIIIllIIlIlllIlll.get(Integer.toString(lllllllllllllIIIIIIllIIlIlllIlIl));
                float lllllllllllllIIIIIIllIIlIlllIIll = lllllllllllllIIIIIIllIIlIllllIlI;
                float lllllllllllllIIIIIIllIIlIlllIIlI = lllllllllllllIIIIIIllIIlIllllIIl;
                float lllllllllllllIIIIIIllIIlIlllIIIl = lllllllllllllIIIIIIllIIlIllllIII;
                if (lllllIlIlIllIII(lllllllllllllIIIIIIllIIlIlllIlII)) {
                    final JsonObject lllllllllllllIIIIIIllIIlIlllIIII = JsonUtils.getJsonObject(lllllllllllllIIIIIIllIIlIlllIlII, String.valueOf(new StringBuilder(FontMetadataSectionSerializer.lIllIIllIIIlll[FontMetadataSectionSerializer.lIllIIllIlIIlI[17]]).append(lllllllllllllIIIIIIllIIlIlllIlIl).append(FontMetadataSectionSerializer.lIllIIllIIIlll[FontMetadataSectionSerializer.lIllIIllIlIIlI[18]])));
                    lllllllllllllIIIIIIllIIlIlllIIll = JsonUtils.getFloat(lllllllllllllIIIIIIllIIlIlllIIII, FontMetadataSectionSerializer.lIllIIllIIIlll[FontMetadataSectionSerializer.lIllIIllIlIIlI[19]], lllllllllllllIIIIIIllIIlIllllIlI);
                    Validate.inclusiveBetween(0.0, 3.4028234663852886E38, (double)lllllllllllllIIIIIIllIIlIlllIIll, FontMetadataSectionSerializer.lIllIIllIIIlll[FontMetadataSectionSerializer.lIllIIllIlIIlI[20]]);
                    lllllllllllllIIIIIIllIIlIlllIIlI = JsonUtils.getFloat(lllllllllllllIIIIIIllIIlIlllIIII, FontMetadataSectionSerializer.lIllIIllIIIlll[FontMetadataSectionSerializer.lIllIIllIlIIlI[21]], lllllllllllllIIIIIIllIIlIllllIIl);
                    Validate.inclusiveBetween(0.0, 3.4028234663852886E38, (double)lllllllllllllIIIIIIllIIlIlllIIlI, FontMetadataSectionSerializer.lIllIIllIIIlll[FontMetadataSectionSerializer.lIllIIllIlIIlI[22]]);
                    lllllllllllllIIIIIIllIIlIlllIIIl = JsonUtils.getFloat(lllllllllllllIIIIIIllIIlIlllIIII, FontMetadataSectionSerializer.lIllIIllIIIlll[FontMetadataSectionSerializer.lIllIIllIlIIlI[23]], lllllllllllllIIIIIIllIIlIllllIII);
                    Validate.inclusiveBetween(0.0, 3.4028234663852886E38, (double)lllllllllllllIIIIIIllIIlIlllIIIl, FontMetadataSectionSerializer.lIllIIllIIIlll[FontMetadataSectionSerializer.lIllIIllIlIIlI[24]]);
                }
                lllllllllllllIIIIIIllIIlIlllllIl[lllllllllllllIIIIIIllIIlIlllIlIl] = lllllllllllllIIIIIIllIIlIlllIIll;
                lllllllllllllIIIIIIllIIlIlllllII[lllllllllllllIIIIIIllIIlIlllIlIl] = lllllllllllllIIIIIIllIIlIlllIIlI;
                lllllllllllllIIIIIIllIIlIllllIll[lllllllllllllIIIIIIllIIlIlllIlIl] = lllllllllllllIIIIIIllIIlIlllIIIl;
                ++lllllllllllllIIIIIIllIIlIlllIlIl;
            }
        }
        return new FontMetadataSection(lllllllllllllIIIIIIllIIlIlllllIl, lllllllllllllIIIIIIllIIlIllllIll, lllllllllllllIIIIIIllIIlIlllllII);
    }
    
    private static boolean lllllIlIlIllIlI(final int lllllllllllllIIIIIIllIIlIIlIIIll, final int lllllllllllllIIIIIIllIIlIIlIIIlI) {
        return lllllllllllllIIIIIIllIIlIIlIIIll >= lllllllllllllIIIIIIllIIlIIlIIIlI;
    }
    
    private static String lllllIlIlIIIlII(final String lllllllllllllIIIIIIllIIlIIlIlIll, final String lllllllllllllIIIIIIllIIlIIlIlIII) {
        try {
            final SecretKeySpec lllllllllllllIIIIIIllIIlIIlIlllI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIIIIIIllIIlIIlIlIII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lllllllllllllIIIIIIllIIlIIlIllIl = Cipher.getInstance("Blowfish");
            lllllllllllllIIIIIIllIIlIIlIllIl.init(FontMetadataSectionSerializer.lIllIIllIlIIlI[3], lllllllllllllIIIIIIllIIlIIlIlllI);
            return new String(lllllllllllllIIIIIIllIIlIIlIllIl.doFinal(Base64.getDecoder().decode(lllllllllllllIIIIIIllIIlIIlIlIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIIIIIllIIlIIlIllII) {
            lllllllllllllIIIIIIllIIlIIlIllII.printStackTrace();
            return null;
        }
    }
    
    private static void lllllIlIlIlIlIl() {
        (lIllIIllIlIIlI = new int[27])[0] = (0xFFFFDF1C & 0x21E3);
        FontMetadataSectionSerializer.lIllIIllIlIIlI[1] = ((0x7C ^ 0x51 ^ (0x75 ^ 0x40)) & (74 + 45 - 114 + 152 ^ 50 + 31 - 2 + 54 ^ -" ".length()));
        FontMetadataSectionSerializer.lIllIIllIlIIlI[2] = " ".length();
        FontMetadataSectionSerializer.lIllIIllIlIIlI[3] = "  ".length();
        FontMetadataSectionSerializer.lIllIIllIlIIlI[4] = "   ".length();
        FontMetadataSectionSerializer.lIllIIllIlIIlI[5] = (0x49 ^ 0x5F ^ (0x9D ^ 0x8F));
        FontMetadataSectionSerializer.lIllIIllIlIIlI[6] = (0x14 ^ 0x11);
        FontMetadataSectionSerializer.lIllIIllIlIIlI[7] = (50 + 31 - 43 + 99 ^ 21 + 107 - 16 + 31);
        FontMetadataSectionSerializer.lIllIIllIlIIlI[8] = (0xBE ^ 0xB9);
        FontMetadataSectionSerializer.lIllIIllIlIIlI[9] = (0xCF ^ 0xC7);
        FontMetadataSectionSerializer.lIllIIllIlIIlI[10] = (0xDC ^ 0x95 ^ (0x7C ^ 0x3C));
        FontMetadataSectionSerializer.lIllIIllIlIIlI[11] = (0x56 ^ 0x60 ^ (0xB8 ^ 0x84));
        FontMetadataSectionSerializer.lIllIIllIlIIlI[12] = (45 + 34 + 91 + 3 ^ 33 + 150 - 81 + 64);
        FontMetadataSectionSerializer.lIllIIllIlIIlI[13] = (0x98 ^ 0x94);
        FontMetadataSectionSerializer.lIllIIllIlIIlI[14] = (0 + 42 - 19 + 152 ^ 100 + 34 - 104 + 132);
        FontMetadataSectionSerializer.lIllIIllIlIIlI[15] = (0x41 ^ 0x4F ^ ((0x5C ^ 0x40) & ~(0x9D ^ 0x81)));
        FontMetadataSectionSerializer.lIllIIllIlIIlI[16] = (0x4E ^ 0x41);
        FontMetadataSectionSerializer.lIllIIllIlIIlI[17] = (0xD ^ 0x10 ^ (0x36 ^ 0x3B));
        FontMetadataSectionSerializer.lIllIIllIlIIlI[18] = (0xAC ^ 0xC0 ^ (0xD5 ^ 0xA8));
        FontMetadataSectionSerializer.lIllIIllIlIIlI[19] = (0x0 ^ 0x73 ^ (0x7A ^ 0x1B));
        FontMetadataSectionSerializer.lIllIIllIlIIlI[20] = (0x75 ^ 0x66);
        FontMetadataSectionSerializer.lIllIIllIlIIlI[21] = (0xB0 ^ 0xA4);
        FontMetadataSectionSerializer.lIllIIllIlIIlI[22] = (0x5C ^ 0x4D ^ (0x91 ^ 0x95));
        FontMetadataSectionSerializer.lIllIIllIlIIlI[23] = (0x28 ^ 0x3E);
        FontMetadataSectionSerializer.lIllIIllIlIIlI[24] = (0x2F ^ 0xD ^ (0x26 ^ 0x13));
        FontMetadataSectionSerializer.lIllIIllIlIIlI[25] = (62 + 15 + 67 + 42 ^ 39 + 149 - 113 + 87);
        FontMetadataSectionSerializer.lIllIIllIlIIlI[26] = (0x24 ^ 0x3D);
    }
    
    private static String lllllIlIlIIlIIl(final String lllllllllllllIIIIIIllIIlIlIIlllI, final String lllllllllllllIIIIIIllIIlIlIIllIl) {
        try {
            final SecretKeySpec lllllllllllllIIIIIIllIIlIlIlIIll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIIIIIIllIIlIlIIllIl.getBytes(StandardCharsets.UTF_8)), FontMetadataSectionSerializer.lIllIIllIlIIlI[9]), "DES");
            final Cipher lllllllllllllIIIIIIllIIlIlIlIIlI = Cipher.getInstance("DES");
            lllllllllllllIIIIIIllIIlIlIlIIlI.init(FontMetadataSectionSerializer.lIllIIllIlIIlI[3], lllllllllllllIIIIIIllIIlIlIlIIll);
            return new String(lllllllllllllIIIIIIllIIlIlIlIIlI.doFinal(Base64.getDecoder().decode(lllllllllllllIIIIIIllIIlIlIIlllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIIIIIllIIlIlIlIIIl) {
            lllllllllllllIIIIIIllIIlIlIlIIIl.printStackTrace();
            return null;
        }
    }
    
    private static boolean lllllIlIlIlIlll(final int lllllllllllllIIIIIIllIIlIIIllIII) {
        return lllllllllllllIIIIIIllIIlIIIllIII == 0;
    }
    
    private static boolean lllllIlIlIllIII(final Object lllllllllllllIIIIIIllIIlIIIlllII) {
        return lllllllllllllIIIIIIllIIlIIIlllII != null;
    }
}
