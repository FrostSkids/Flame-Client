// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.client.audio;

import com.google.gson.JsonParseException;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import org.apache.commons.lang3.Validate;
import net.minecraft.util.JsonUtils;
import com.google.gson.JsonDeserializationContext;
import java.lang.reflect.Type;
import com.google.gson.JsonElement;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import com.google.gson.JsonDeserializer;

public class SoundListSerializer implements JsonDeserializer<SoundList>
{
    private static final /* synthetic */ int[] lIlIIllIlllIlI;
    private static final /* synthetic */ String[] lIlIIllIlllIIl;
    
    private static void lllIlIIIIlllIlI() {
        (lIlIIllIlllIIl = new String[SoundListSerializer.lIlIIllIlllIlI[23]])[SoundListSerializer.lIlIIllIlllIlI[0]] = lllIlIIIIllIlll("DgEEKAg=", "kopZq");
        SoundListSerializer.lIlIIllIlllIIl[SoundListSerializer.lIlIIllIlllIlI[1]] = lllIlIIIIlllIII("TP1+gPUihKg=", "TiFfM");
        SoundListSerializer.lIlIIllIlllIIl[SoundListSerializer.lIlIIllIlllIlI[2]] = lllIlIIIIlllIIl("vIt1cs9XCcuOiG6/fbAehg==", "NVUKB");
        SoundListSerializer.lIlIIllIlllIIl[SoundListSerializer.lIlIIllIlllIlI[3]] = lllIlIIIIlllIII("IacJl7+vugzs8a9hJkMYB0QzB7TsK+Lu", "bhrzz");
        SoundListSerializer.lIlIIllIlllIIl[SoundListSerializer.lIlIIllIlllIlI[4]] = lllIlIIIIlllIIl("HpKQiCXbH5I=", "cjLgD");
        SoundListSerializer.lIlIIllIlllIIl[SoundListSerializer.lIlIIllIlllIlI[5]] = lllIlIIIIllIlll("NTkaCyc1", "FVoeC");
        SoundListSerializer.lIlIIllIlllIIl[SoundListSerializer.lIlIIllIlllIlI[6]] = lllIlIIIIlllIIl("j1WRw/q/0Gs=", "ODcJm");
        SoundListSerializer.lIlIIllIlllIIl[SoundListSerializer.lIlIIllIlllIlI[7]] = lllIlIIIIlllIIl("sjJ49STwARM=", "CwtLg");
        SoundListSerializer.lIlIIllIlllIIl[SoundListSerializer.lIlIIllIlllIlI[8]] = lllIlIIIIlllIII("jtc6KIcANIU=", "vOvuJ");
        SoundListSerializer.lIlIIllIlllIIl[SoundListSerializer.lIlIIllIlllIlI[9]] = lllIlIIIIlllIIl("72mZFEDZcFc=", "eiFeV");
        SoundListSerializer.lIlIIllIlllIIl[SoundListSerializer.lIlIIllIlllIlI[10]] = lllIlIIIIllIlll("GhIHMw==", "nkwVG");
        SoundListSerializer.lIlIIllIlllIIl[SoundListSerializer.lIlIIllIlllIlI[11]] = lllIlIIIIlllIII("3I+RwbFs/znleLOSqzvj3Q==", "mDxll");
        SoundListSerializer.lIlIIllIlllIIl[SoundListSerializer.lIlIIllIlllIlI[12]] = lllIlIIIIlllIIl("DcyWWYVH0gg=", "kQohX");
        SoundListSerializer.lIlIIllIlllIIl[SoundListSerializer.lIlIIllIlllIlI[13]] = lllIlIIIIlllIIl("Gl/v3TJ5P4I=", "ZegcJ");
        SoundListSerializer.lIlIIllIlllIIl[SoundListSerializer.lIlIIllIlllIlI[14]] = lllIlIIIIllIlll("GyknFiM7I3EBID4yPBI=", "RGQwO");
        SoundListSerializer.lIlIIllIlllIIl[SoundListSerializer.lIlIIllIlllIlI[15]] = lllIlIIIIlllIIl("o3lVpPLVgwU=", "Cibbv");
        SoundListSerializer.lIlIIllIlllIIl[SoundListSerializer.lIlIIllIlllIlI[16]] = lllIlIIIIllIlll("KQIuBzk=", "YkZdQ");
        SoundListSerializer.lIlIIllIlllIIl[SoundListSerializer.lIlIIllIlllIlI[17]] = lllIlIIIIllIlll("EykFNiszI1MnLi4kGw==", "ZGsWG");
        SoundListSerializer.lIlIIllIlllIIl[SoundListSerializer.lIlIIllIlllIlI[18]] = lllIlIIIIllIlll("MgoCCCEx", "EokoI");
        SoundListSerializer.lIlIIllIlllIIl[SoundListSerializer.lIlIIllIlllIlI[19]] = lllIlIIIIllIlll("BQwLDQ8G", "ribjg");
        SoundListSerializer.lIlIIllIlllIIl[SoundListSerializer.lIlIIllIlllIlI[20]] = lllIlIIIIlllIIl("ZHicNEZrxTC8lmlFXVOBtg==", "RwrdG");
        SoundListSerializer.lIlIIllIlllIIl[SoundListSerializer.lIlIIllIlllIlI[21]] = lllIlIIIIlllIII("YN+41PtnYIE=", "epQlQ");
        SoundListSerializer.lIlIIllIlllIIl[SoundListSerializer.lIlIIllIlllIlI[22]] = lllIlIIIIlllIIl("msvHZozbWQ8=", "fAxXh");
    }
    
    private static boolean lllIlIIIIlllllI(final int lllllllllllllIIIllIIlIIIIllIIIII) {
        return lllllllllllllIIIllIIlIIIIllIIIII > 0;
    }
    
    private static String lllIlIIIIlllIIl(final String lllllllllllllIIIllIIlIIIIllIllll, final String lllllllllllllIIIllIIlIIIIlllIIII) {
        try {
            final SecretKeySpec lllllllllllllIIIllIIlIIIIlllIlII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIIIllIIlIIIIlllIIII.getBytes(StandardCharsets.UTF_8)), SoundListSerializer.lIlIIllIlllIlI[8]), "DES");
            final Cipher lllllllllllllIIIllIIlIIIIlllIIll = Cipher.getInstance("DES");
            lllllllllllllIIIllIIlIIIIlllIIll.init(SoundListSerializer.lIlIIllIlllIlI[2], lllllllllllllIIIllIIlIIIIlllIlII);
            return new String(lllllllllllllIIIllIIlIIIIlllIIll.doFinal(Base64.getDecoder().decode(lllllllllllllIIIllIIlIIIIllIllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIIllIIlIIIIlllIIlI) {
            lllllllllllllIIIllIIlIIIIlllIIlI.printStackTrace();
            return null;
        }
    }
    
    private static boolean lllIlIIIIllllIl(final int lllllllllllllIIIllIIlIIIIllIIIlI) {
        return lllllllllllllIIIllIIlIIIIllIIIlI != 0;
    }
    
    private static boolean lllIlIIIIllllll(final int lllllllllllllIIIllIIlIIIIllIlIIl, final int lllllllllllllIIIllIIlIIIIllIlIII) {
        return lllllllllllllIIIllIIlIIIIllIlIIl >= lllllllllllllIIIllIIlIIIIllIlIII;
    }
    
    static {
        lllIlIIIIlllIll();
        lllIlIIIIlllIlI();
    }
    
    public SoundList deserialize(final JsonElement lllllllllllllIIIllIIlIIIlIlllllI, final Type lllllllllllllIIIllIIlIIIlIllllIl, final JsonDeserializationContext lllllllllllllIIIllIIlIIIlIllllII) throws JsonParseException {
        final JsonObject lllllllllllllIIIllIIlIIIlIlllIll = JsonUtils.getJsonObject(lllllllllllllIIIllIIlIIIlIlllllI, SoundListSerializer.lIlIIllIlllIIl[SoundListSerializer.lIlIIllIlllIlI[0]]);
        final SoundList lllllllllllllIIIllIIlIIIlIlllIlI = new SoundList();
        lllllllllllllIIIllIIlIIIlIlllIlI.setReplaceExisting(JsonUtils.getBoolean(lllllllllllllIIIllIIlIIIlIlllIll, SoundListSerializer.lIlIIllIlllIIl[SoundListSerializer.lIlIIllIlllIlI[1]], (boolean)(SoundListSerializer.lIlIIllIlllIlI[0] != 0)));
        final SoundCategory lllllllllllllIIIllIIlIIIlIlllIIl = SoundCategory.getCategory(JsonUtils.getString(lllllllllllllIIIllIIlIIIlIlllIll, SoundListSerializer.lIlIIllIlllIIl[SoundListSerializer.lIlIIllIlllIlI[2]], SoundCategory.MASTER.getCategoryName()));
        lllllllllllllIIIllIIlIIIlIlllIlI.setSoundCategory(lllllllllllllIIIllIIlIIIlIlllIIl);
        Validate.notNull((Object)lllllllllllllIIIllIIlIIIlIlllIIl, SoundListSerializer.lIlIIllIlllIIl[SoundListSerializer.lIlIIllIlllIlI[3]], new Object[SoundListSerializer.lIlIIllIlllIlI[0]]);
        "".length();
        if (lllIlIIIIllllIl(lllllllllllllIIIllIIlIIIlIlllIll.has(SoundListSerializer.lIlIIllIlllIIl[SoundListSerializer.lIlIIllIlllIlI[4]]) ? 1 : 0)) {
            final JsonArray lllllllllllllIIIllIIlIIIlIlllIII = JsonUtils.getJsonArray(lllllllllllllIIIllIIlIIIlIlllIll, SoundListSerializer.lIlIIllIlllIIl[SoundListSerializer.lIlIIllIlllIlI[5]]);
            int lllllllllllllIIIllIIlIIIlIllIlll = SoundListSerializer.lIlIIllIlllIlI[0];
            "".length();
            if (null != null) {
                return null;
            }
            while (!lllIlIIIIllllll(lllllllllllllIIIllIIlIIIlIllIlll, lllllllllllllIIIllIIlIIIlIlllIII.size())) {
                final JsonElement lllllllllllllIIIllIIlIIIlIllIllI = lllllllllllllIIIllIIlIIIlIlllIII.get(lllllllllllllIIIllIIlIIIlIllIlll);
                final SoundList.SoundEntry lllllllllllllIIIllIIlIIIlIllIlIl = new SoundList.SoundEntry();
                if (lllIlIIIIllllIl(JsonUtils.isString(lllllllllllllIIIllIIlIIIlIllIllI) ? 1 : 0)) {
                    lllllllllllllIIIllIIlIIIlIllIlIl.setSoundEntryName(JsonUtils.getString(lllllllllllllIIIllIIlIIIlIllIllI, SoundListSerializer.lIlIIllIlllIIl[SoundListSerializer.lIlIIllIlllIlI[6]]));
                    "".length();
                    if ((0x1F ^ 0xF ^ (0x64 ^ 0x70)) < 0) {
                        return null;
                    }
                }
                else {
                    final JsonObject lllllllllllllIIIllIIlIIIlIllIlII = JsonUtils.getJsonObject(lllllllllllllIIIllIIlIIIlIllIllI, SoundListSerializer.lIlIIllIlllIIl[SoundListSerializer.lIlIIllIlllIlI[7]]);
                    lllllllllllllIIIllIIlIIIlIllIlIl.setSoundEntryName(JsonUtils.getString(lllllllllllllIIIllIIlIIIlIllIlII, SoundListSerializer.lIlIIllIlllIIl[SoundListSerializer.lIlIIllIlllIlI[8]]));
                    if (lllIlIIIIllllIl(lllllllllllllIIIllIIlIIIlIllIlII.has(SoundListSerializer.lIlIIllIlllIIl[SoundListSerializer.lIlIIllIlllIlI[9]]) ? 1 : 0)) {
                        final SoundList.SoundEntry.Type lllllllllllllIIIllIIlIIIlIllIIll = SoundList.SoundEntry.Type.getType(JsonUtils.getString(lllllllllllllIIIllIIlIIIlIllIlII, SoundListSerializer.lIlIIllIlllIIl[SoundListSerializer.lIlIIllIlllIlI[10]]));
                        Validate.notNull((Object)lllllllllllllIIIllIIlIIIlIllIIll, SoundListSerializer.lIlIIllIlllIIl[SoundListSerializer.lIlIIllIlllIlI[11]], new Object[SoundListSerializer.lIlIIllIlllIlI[0]]);
                        "".length();
                        lllllllllllllIIIllIIlIIIlIllIlIl.setSoundEntryType(lllllllllllllIIIllIIlIIIlIllIIll);
                    }
                    if (lllIlIIIIllllIl(lllllllllllllIIIllIIlIIIlIllIlII.has(SoundListSerializer.lIlIIllIlllIIl[SoundListSerializer.lIlIIllIlllIlI[12]]) ? 1 : 0)) {
                        final float lllllllllllllIIIllIIlIIIlIllIIlI = JsonUtils.getFloat(lllllllllllllIIIllIIlIIIlIllIlII, SoundListSerializer.lIlIIllIlllIIl[SoundListSerializer.lIlIIllIlllIlI[13]]);
                        int n;
                        if (lllIlIIIIlllllI(lllIlIIIIllllII(lllllllllllllIIIllIIlIIIlIllIIlI, 0.0f))) {
                            n = SoundListSerializer.lIlIIllIlllIlI[1];
                            "".length();
                            if ("   ".length() <= "  ".length()) {
                                return null;
                            }
                        }
                        else {
                            n = SoundListSerializer.lIlIIllIlllIlI[0];
                        }
                        Validate.isTrue((boolean)(n != 0), SoundListSerializer.lIlIIllIlllIIl[SoundListSerializer.lIlIIllIlllIlI[14]], new Object[SoundListSerializer.lIlIIllIlllIlI[0]]);
                        lllllllllllllIIIllIIlIIIlIllIlIl.setSoundEntryVolume(lllllllllllllIIIllIIlIIIlIllIIlI);
                    }
                    if (lllIlIIIIllllIl(lllllllllllllIIIllIIlIIIlIllIlII.has(SoundListSerializer.lIlIIllIlllIIl[SoundListSerializer.lIlIIllIlllIlI[15]]) ? 1 : 0)) {
                        final float lllllllllllllIIIllIIlIIIlIllIIIl = JsonUtils.getFloat(lllllllllllllIIIllIIlIIIlIllIlII, SoundListSerializer.lIlIIllIlllIIl[SoundListSerializer.lIlIIllIlllIlI[16]]);
                        int n2;
                        if (lllIlIIIIlllllI(lllIlIIIIllllII(lllllllllllllIIIllIIlIIIlIllIIIl, 0.0f))) {
                            n2 = SoundListSerializer.lIlIIllIlllIlI[1];
                            "".length();
                            if (((220 + 212 - 291 + 97 ^ 58 + 51 - 41 + 111) & (73 + 70 - 33 + 123 ^ 153 + 147 - 217 + 97 ^ -" ".length())) != 0x0) {
                                return null;
                            }
                        }
                        else {
                            n2 = SoundListSerializer.lIlIIllIlllIlI[0];
                        }
                        Validate.isTrue((boolean)(n2 != 0), SoundListSerializer.lIlIIllIlllIIl[SoundListSerializer.lIlIIllIlllIlI[17]], new Object[SoundListSerializer.lIlIIllIlllIlI[0]]);
                        lllllllllllllIIIllIIlIIIlIllIlIl.setSoundEntryPitch(lllllllllllllIIIllIIlIIIlIllIIIl);
                    }
                    if (lllIlIIIIllllIl(lllllllllllllIIIllIIlIIIlIllIlII.has(SoundListSerializer.lIlIIllIlllIIl[SoundListSerializer.lIlIIllIlllIlI[18]]) ? 1 : 0)) {
                        final int lllllllllllllIIIllIIlIIIlIllIIII = JsonUtils.getInt(lllllllllllllIIIllIIlIIIlIllIlII, SoundListSerializer.lIlIIllIlllIIl[SoundListSerializer.lIlIIllIlllIlI[19]]);
                        int n3;
                        if (lllIlIIIIlllllI(lllllllllllllIIIllIIlIIIlIllIIII)) {
                            n3 = SoundListSerializer.lIlIIllIlllIlI[1];
                            "".length();
                            if (-" ".length() >= 0) {
                                return null;
                            }
                        }
                        else {
                            n3 = SoundListSerializer.lIlIIllIlllIlI[0];
                        }
                        Validate.isTrue((boolean)(n3 != 0), SoundListSerializer.lIlIIllIlllIIl[SoundListSerializer.lIlIIllIlllIlI[20]], new Object[SoundListSerializer.lIlIIllIlllIlI[0]]);
                        lllllllllllllIIIllIIlIIIlIllIlIl.setSoundEntryWeight(lllllllllllllIIIllIIlIIIlIllIIII);
                    }
                    if (lllIlIIIIllllIl(lllllllllllllIIIllIIlIIIlIllIlII.has(SoundListSerializer.lIlIIllIlllIIl[SoundListSerializer.lIlIIllIlllIlI[21]]) ? 1 : 0)) {
                        lllllllllllllIIIllIIlIIIlIllIlIl.setStreaming(JsonUtils.getBoolean(lllllllllllllIIIllIIlIIIlIllIlII, SoundListSerializer.lIlIIllIlllIIl[SoundListSerializer.lIlIIllIlllIlI[22]]));
                    }
                }
                lllllllllllllIIIllIIlIIIlIlllIlI.getSoundList().add(lllllllllllllIIIllIIlIIIlIllIlIl);
                "".length();
                ++lllllllllllllIIIllIIlIIIlIllIlll;
            }
        }
        return lllllllllllllIIIllIIlIIIlIlllIlI;
    }
    
    private static int lllIlIIIIllllII(final float n, final float n2) {
        return fcmpl(n, n2);
    }
    
    private static boolean lllIlIIIlIIIIII(final int lllllllllllllIIIllIIlIIIIllIIlIl, final int lllllllllllllIIIllIIlIIIIllIIlII) {
        return lllllllllllllIIIllIIlIIIIllIIlIl < lllllllllllllIIIllIIlIIIIllIIlII;
    }
    
    private static String lllIlIIIIllIlll(String lllllllllllllIIIllIIlIIIlIIIlllI, final String lllllllllllllIIIllIIlIIIlIIlIIlI) {
        lllllllllllllIIIllIIlIIIlIIIlllI = (int)new String(Base64.getDecoder().decode(((String)lllllllllllllIIIllIIlIIIlIIIlllI).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIIIllIIlIIIlIIlIIIl = new StringBuilder();
        final char[] lllllllllllllIIIllIIlIIIlIIlIIII = lllllllllllllIIIllIIlIIIlIIlIIlI.toCharArray();
        int lllllllllllllIIIllIIlIIIlIIIllll = SoundListSerializer.lIlIIllIlllIlI[0];
        final Exception lllllllllllllIIIllIIlIIIlIIIlIIl = (Object)((String)lllllllllllllIIIllIIlIIIlIIIlllI).toCharArray();
        final String lllllllllllllIIIllIIlIIIlIIIlIII = (String)lllllllllllllIIIllIIlIIIlIIIlIIl.length;
        Exception lllllllllllllIIIllIIlIIIlIIIIlll = (Exception)SoundListSerializer.lIlIIllIlllIlI[0];
        while (lllIlIIIlIIIIII((int)lllllllllllllIIIllIIlIIIlIIIIlll, (int)lllllllllllllIIIllIIlIIIlIIIlIII)) {
            final char lllllllllllllIIIllIIlIIIlIIlIlII = lllllllllllllIIIllIIlIIIlIIIlIIl[lllllllllllllIIIllIIlIIIlIIIIlll];
            lllllllllllllIIIllIIlIIIlIIlIIIl.append((char)(lllllllllllllIIIllIIlIIIlIIlIlII ^ lllllllllllllIIIllIIlIIIlIIlIIII[lllllllllllllIIIllIIlIIIlIIIllll % lllllllllllllIIIllIIlIIIlIIlIIII.length]));
            "".length();
            ++lllllllllllllIIIllIIlIIIlIIIllll;
            ++lllllllllllllIIIllIIlIIIlIIIIlll;
            "".length();
            if ("   ".length() >= (0x61 ^ 0x65)) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIIIllIIlIIIlIIlIIIl);
    }
    
    private static void lllIlIIIIlllIll() {
        (lIlIIllIlllIlI = new int[24])[0] = ((0x10 ^ 0x3D ^ (0xD8 ^ 0xB1)) & (0x7A ^ 0x67 ^ (0xC6 ^ 0x9F) ^ -" ".length()));
        SoundListSerializer.lIlIIllIlllIlI[1] = " ".length();
        SoundListSerializer.lIlIIllIlllIlI[2] = "  ".length();
        SoundListSerializer.lIlIIllIlllIlI[3] = "   ".length();
        SoundListSerializer.lIlIIllIlllIlI[4] = (0x15 ^ 0x11);
        SoundListSerializer.lIlIIllIlllIlI[5] = (0x58 ^ 0x5D);
        SoundListSerializer.lIlIIllIlllIlI[6] = (0x67 ^ 0x61);
        SoundListSerializer.lIlIIllIlllIlI[7] = (0x27 ^ 0x20);
        SoundListSerializer.lIlIIllIlllIlI[8] = (0xAF ^ 0xA7);
        SoundListSerializer.lIlIIllIlllIlI[9] = (0x84 ^ 0x82 ^ (0x96 ^ 0x99));
        SoundListSerializer.lIlIIllIlllIlI[10] = (0x27 ^ 0x2D);
        SoundListSerializer.lIlIIllIlllIlI[11] = (0x2A ^ 0x21);
        SoundListSerializer.lIlIIllIlllIlI[12] = (0x4E ^ 0x1F ^ (0x67 ^ 0x3A));
        SoundListSerializer.lIlIIllIlllIlI[13] = (" ".length() ^ (0xAA ^ 0xA6));
        SoundListSerializer.lIlIIllIlllIlI[14] = (0x8E ^ 0x80);
        SoundListSerializer.lIlIIllIlllIlI[15] = (42 + 80 - 96 + 165 ^ 0 + 47 + 89 + 40);
        SoundListSerializer.lIlIIllIlllIlI[16] = (144 + 87 - 230 + 167 ^ 86 + 50 - 68 + 116);
        SoundListSerializer.lIlIIllIlllIlI[17] = (0x46 ^ 0x57);
        SoundListSerializer.lIlIIllIlllIlI[18] = (0x8F ^ 0x9D);
        SoundListSerializer.lIlIIllIlllIlI[19] = (0xC8 ^ 0xC3 ^ (0xD9 ^ 0xC1));
        SoundListSerializer.lIlIIllIlllIlI[20] = (0x3 ^ 0x2B ^ (0xFF ^ 0xC3));
        SoundListSerializer.lIlIIllIlllIlI[21] = (0x62 ^ 0x57 ^ (0x36 ^ 0x16));
        SoundListSerializer.lIlIIllIlllIlI[22] = (128 + 42 - 160 + 138 ^ 27 + 59 - 21 + 65);
        SoundListSerializer.lIlIIllIlllIlI[23] = (112 + 118 - 61 + 3 ^ 64 + 131 - 116 + 108);
    }
    
    private static String lllIlIIIIlllIII(final String lllllllllllllIIIllIIlIIIIlllllII, final String lllllllllllllIIIllIIlIIIIllllIll) {
        try {
            final SecretKeySpec lllllllllllllIIIllIIlIIIlIIIIIIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIIIllIIlIIIIllllIll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lllllllllllllIIIllIIlIIIlIIIIIII = Cipher.getInstance("Blowfish");
            lllllllllllllIIIllIIlIIIlIIIIIII.init(SoundListSerializer.lIlIIllIlllIlI[2], lllllllllllllIIIllIIlIIIlIIIIIIl);
            return new String(lllllllllllllIIIllIIlIIIlIIIIIII.doFinal(Base64.getDecoder().decode(lllllllllllllIIIllIIlIIIIlllllII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIIllIIlIIIIlllllll) {
            lllllllllllllIIIllIIlIIIIlllllll.printStackTrace();
            return null;
        }
    }
}
