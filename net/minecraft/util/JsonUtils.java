// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.util;

import java.util.Arrays;
import com.google.gson.JsonPrimitive;
import org.apache.commons.lang3.StringUtils;
import com.google.gson.JsonElement;
import com.google.gson.JsonArray;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import com.google.gson.JsonSyntaxException;
import com.google.gson.JsonObject;

public class JsonUtils
{
    private static final /* synthetic */ int[] lIIlIllIlllIlI;
    private static final /* synthetic */ String[] lIIlIIlllllIlI;
    
    public static int getInt(final JsonObject lllllllllllllIIllIIIlIIIlIlllIIl, final String lllllllllllllIIllIIIlIIIlIlllIlI) {
        if (llIlIIllIllIIII(lllllllllllllIIllIIIlIIIlIlllIIl.has(lllllllllllllIIllIIIlIIIlIlllIlI) ? 1 : 0)) {
            return getInt(lllllllllllllIIllIIIlIIIlIlllIIl.get(lllllllllllllIIllIIIlIIIlIlllIlI), lllllllllllllIIllIIIlIIIlIlllIlI);
        }
        throw new JsonSyntaxException(String.valueOf(new StringBuilder(JsonUtils.lIIlIIlllllIlI[JsonUtils.lIIlIllIlllIlI[14]]).append(lllllllllllllIIllIIIlIIIlIlllIlI).append(JsonUtils.lIIlIIlllllIlI[JsonUtils.lIIlIllIlllIlI[15]])));
    }
    
    private static String llIIllllIIlIlll(final String lllllllllllllIIllIIIlIIIIlllIlII, final String lllllllllllllIIllIIIlIIIIlllIIll) {
        try {
            final SecretKeySpec lllllllllllllIIllIIIlIIIIlllIlll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIIllIIIlIIIIlllIIll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lllllllllllllIIllIIIlIIIIlllIllI = Cipher.getInstance("Blowfish");
            lllllllllllllIIllIIIlIIIIlllIllI.init(JsonUtils.lIIlIllIlllIlI[2], lllllllllllllIIllIIIlIIIIlllIlll);
            return new String(lllllllllllllIIllIIIlIIIIlllIllI.doFinal(Base64.getDecoder().decode(lllllllllllllIIllIIIlIIIIlllIlII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIllIIIlIIIIlllIlIl) {
            lllllllllllllIIllIIIlIIIIlllIlIl.printStackTrace();
            return null;
        }
    }
    
    private static boolean llIlIIllIlIllll(final Object lllllllllllllIIllIIIlIIIIlIIIlII) {
        return lllllllllllllIIllIIIlIIIIlIIIlII != null;
    }
    
    public static boolean getBoolean(final JsonObject lllllllllllllIIllIIIlIIIllIllllI, final String lllllllllllllIIllIIIlIIIllIlllIl, final boolean lllllllllllllIIllIIIlIIIllIlllII) {
        boolean boolean1;
        if (llIlIIllIllIIII(lllllllllllllIIllIIIlIIIllIllllI.has(lllllllllllllIIllIIIlIIIllIlllIl) ? 1 : 0)) {
            boolean1 = getBoolean(lllllllllllllIIllIIIlIIIllIllllI.get(lllllllllllllIIllIIIlIIIllIlllIl), lllllllllllllIIllIIIlIIIllIlllIl);
            "".length();
            if (null != null) {
                return ((80 + 105 + 7 + 41 ^ 162 + 44 - 117 + 81) & (0x18 ^ 0x1 ^ (0xE5 ^ 0xBF) ^ -" ".length())) != 0x0;
            }
        }
        else {
            boolean1 = lllllllllllllIIllIIIlIIIllIlllII;
        }
        return boolean1;
    }
    
    public static JsonArray getJsonArray(final JsonObject lllllllllllllIIllIIIlIIIlIIIIlll, final String lllllllllllllIIllIIIlIIIlIIIlIIl, final JsonArray lllllllllllllIIllIIIlIIIlIIIlIII) {
        JsonArray jsonArray;
        if (llIlIIllIllIIII(lllllllllllllIIllIIIlIIIlIIIIlll.has(lllllllllllllIIllIIIlIIIlIIIlIIl) ? 1 : 0)) {
            jsonArray = getJsonArray(lllllllllllllIIllIIIlIIIlIIIIlll.get(lllllllllllllIIllIIIlIIIlIIIlIIl), lllllllllllllIIllIIIlIIIlIIIlIIl);
            "".length();
            if (null != null) {
                return null;
            }
        }
        else {
            jsonArray = lllllllllllllIIllIIIlIIIlIIIlIII;
        }
        return jsonArray;
    }
    
    public static String getString(final JsonObject lllllllllllllIIllIIIlIIIllllIIll, final String lllllllllllllIIllIIIlIIIlllIllll, final String lllllllllllllIIllIIIlIIIlllIlllI) {
        String string;
        if (llIlIIllIllIIII(lllllllllllllIIllIIIlIIIllllIIll.has(lllllllllllllIIllIIIlIIIlllIllll) ? 1 : 0)) {
            string = getString(lllllllllllllIIllIIIlIIIllllIIll.get(lllllllllllllIIllIIIlIIIlllIllll), lllllllllllllIIllIIIlIIIlllIllll);
            "".length();
            if (" ".length() <= ((0x2C ^ 0x49 ^ (0x2A ^ 0x5E)) & (0xFF ^ 0xA5 ^ (0x2D ^ 0x66) ^ -" ".length()))) {
                return null;
            }
        }
        else {
            string = lllllllllllllIIllIIIlIIIlllIlllI;
        }
        return string;
    }
    
    public static boolean isJsonArray(final JsonObject lllllllllllllIIllIIIlIIlIIIlIIII, final String lllllllllllllIIllIIIlIIlIIIlIIIl) {
        int jsonArray;
        if (llIlIIllIlIllIl(hasField(lllllllllllllIIllIIIlIIlIIIlIIII, lllllllllllllIIllIIIlIIlIIIlIIIl) ? 1 : 0)) {
            jsonArray = JsonUtils.lIIlIllIlllIlI[0];
            "".length();
            if ((0x47 ^ 0x43) <= "  ".length()) {
                return ((0x13 ^ 0x1) & ~(0xE ^ 0x1C)) != 0x0;
            }
        }
        else {
            jsonArray = (lllllllllllllIIllIIIlIIlIIIlIIII.get(lllllllllllllIIllIIIlIIlIIIlIIIl).isJsonArray() ? 1 : 0);
        }
        return jsonArray != 0;
    }
    
    private static void llIlIIllIlIllII() {
        (lIIlIllIlllIlI = new int[36])[0] = ((0xB5 ^ 0x8C ^ (0xA5 ^ 0xBF)) & (0x67 ^ 0x13 ^ (0xF4 ^ 0xA3) ^ -" ".length()));
        JsonUtils.lIIlIllIlllIlI[1] = " ".length();
        JsonUtils.lIIlIllIlllIlI[2] = "  ".length();
        JsonUtils.lIIlIllIlllIlI[3] = "   ".length();
        JsonUtils.lIIlIllIlllIlI[4] = (0xDD ^ 0x9F ^ (0xDC ^ 0x9A));
        JsonUtils.lIIlIllIlllIlI[5] = (0x5E ^ 0x5B);
        JsonUtils.lIIlIllIlllIlI[6] = (0x47 ^ 0x58 ^ (0xB1 ^ 0xA8));
        JsonUtils.lIIlIllIlllIlI[7] = (62 + 14 + 24 + 65 ^ 6 + 43 - 1 + 114);
        JsonUtils.lIIlIllIlllIlI[8] = (0xA ^ 0x2);
        JsonUtils.lIIlIllIlllIlI[9] = (0x90 ^ 0x99);
        JsonUtils.lIIlIllIlllIlI[10] = (0x7A ^ 0x3D ^ (0x22 ^ 0x6F));
        JsonUtils.lIIlIllIlllIlI[11] = (0x4 ^ 0x35 ^ (0xA ^ 0x30));
        JsonUtils.lIIlIllIlllIlI[12] = (0xAB ^ 0xA7);
        JsonUtils.lIIlIllIlllIlI[13] = (143 + 65 - 123 + 93 ^ 12 + 19 + 30 + 130);
        JsonUtils.lIIlIllIlllIlI[14] = (0x1E ^ 0x34 ^ (0x6C ^ 0x48));
        JsonUtils.lIIlIllIlllIlI[15] = (0x74 ^ 0x7B);
        JsonUtils.lIIlIllIlllIlI[16] = (0x33 ^ 0x23);
        JsonUtils.lIIlIllIlllIlI[17] = (0x97 ^ 0x86);
        JsonUtils.lIIlIllIlllIlI[18] = (0x90 ^ 0x82);
        JsonUtils.lIIlIllIlllIlI[19] = (0xBF ^ 0xAC);
        JsonUtils.lIIlIllIlllIlI[20] = (0x45 ^ 0x68 ^ (0xA ^ 0x33));
        JsonUtils.lIIlIllIlllIlI[21] = (0x79 ^ 0x6C);
        JsonUtils.lIIlIllIlllIlI[22] = (0x45 ^ 0x53);
        JsonUtils.lIIlIllIlllIlI[23] = (0xF7 ^ 0x80 ^ (0x7E ^ 0x1E));
        JsonUtils.lIIlIllIlllIlI[24] = (65 + 12 + 34 + 26 ^ 129 + 17 - 48 + 47);
        JsonUtils.lIIlIllIlllIlI[25] = (0x88 ^ 0xBD ^ (0x9E ^ 0xB2));
        JsonUtils.lIIlIllIlllIlI[26] = (0x50 ^ 0x14 ^ (0x7A ^ 0x24));
        JsonUtils.lIIlIllIlllIlI[27] = (38 + 123 - 51 + 55 ^ 187 + 7 - 48 + 44);
        JsonUtils.lIIlIllIlllIlI[28] = (0x7A ^ 0x66);
        JsonUtils.lIIlIllIlllIlI[29] = (0x86 ^ 0x9B);
        JsonUtils.lIIlIllIlllIlI[30] = (0x54 ^ 0x4A);
        JsonUtils.lIIlIllIlllIlI[31] = (0xBF ^ 0xA0);
        JsonUtils.lIIlIllIlllIlI[32] = (0xA1 ^ 0x81);
        JsonUtils.lIIlIllIlllIlI[33] = (0x94 ^ 0xB5);
        JsonUtils.lIIlIllIlllIlI[34] = (55 + 129 - 140 + 107 ^ 151 + 30 - 18 + 18);
        JsonUtils.lIIlIllIlllIlI[35] = (0x7E ^ 0x5D);
    }
    
    static {
        llIlIIllIlIllII();
        llIIllllIIlllIl();
    }
    
    public static float getFloat(final JsonObject lllllllllllllIIllIIIlIIIllIlIIII, final String lllllllllllllIIllIIIlIIIllIIllIl) {
        if (llIlIIllIllIIII(lllllllllllllIIllIIIlIIIllIlIIII.has(lllllllllllllIIllIIIlIIIllIIllIl) ? 1 : 0)) {
            return getFloat(lllllllllllllIIllIIIlIIIllIlIIII.get(lllllllllllllIIllIIIlIIIllIIllIl), lllllllllllllIIllIIIlIIIllIIllIl);
        }
        throw new JsonSyntaxException(String.valueOf(new StringBuilder(JsonUtils.lIIlIIlllllIlI[JsonUtils.lIIlIllIlllIlI[10]]).append(lllllllllllllIIllIIIlIIIllIIllIl).append(JsonUtils.lIIlIIlllllIlI[JsonUtils.lIIlIllIlllIlI[11]])));
    }
    
    public static boolean isJsonPrimitive(final JsonObject lllllllllllllIIllIIIlIIlIIIIlIlI, final String lllllllllllllIIllIIIlIIlIIIIlIIl) {
        int jsonPrimitive;
        if (llIlIIllIlIllIl(hasField(lllllllllllllIIllIIIlIIlIIIIlIlI, lllllllllllllIIllIIIlIIlIIIIlIIl) ? 1 : 0)) {
            jsonPrimitive = JsonUtils.lIIlIllIlllIlI[0];
            "".length();
            if (((0x64 ^ 0x49) & ~(0x5 ^ 0x28)) < -" ".length()) {
                return ((0x24 ^ 0x18) & ~(0x2C ^ 0x10)) != 0x0;
            }
        }
        else {
            jsonPrimitive = (lllllllllllllIIllIIIlIIlIIIIlIlI.get(lllllllllllllIIllIIIlIIlIIIIlIIl).isJsonPrimitive() ? 1 : 0);
        }
        return jsonPrimitive != 0;
    }
    
    public static String toString(final JsonElement lllllllllllllIIllIIIlIIIIllllllI) {
        final String lllllllllllllIIllIIIlIIIlIIIIIII = StringUtils.abbreviateMiddle(String.valueOf(lllllllllllllIIllIIIlIIIIllllllI), JsonUtils.lIIlIIlllllIlI[JsonUtils.lIIlIllIlllIlI[24]], JsonUtils.lIIlIllIlllIlI[10]);
        if (llIlIIllIlIlllI(lllllllllllllIIllIIIlIIIIllllllI)) {
            return JsonUtils.lIIlIIlllllIlI[JsonUtils.lIIlIllIlllIlI[25]];
        }
        if (llIlIIllIllIIII(lllllllllllllIIllIIIlIIIIllllllI.isJsonNull() ? 1 : 0)) {
            return JsonUtils.lIIlIIlllllIlI[JsonUtils.lIIlIllIlllIlI[26]];
        }
        if (llIlIIllIllIIII(lllllllllllllIIllIIIlIIIIllllllI.isJsonArray() ? 1 : 0)) {
            return String.valueOf(new StringBuilder(JsonUtils.lIIlIIlllllIlI[JsonUtils.lIIlIllIlllIlI[27]]).append(lllllllllllllIIllIIIlIIIlIIIIIII).append(JsonUtils.lIIlIIlllllIlI[JsonUtils.lIIlIllIlllIlI[28]]));
        }
        if (llIlIIllIllIIII(lllllllllllllIIllIIIlIIIIllllllI.isJsonObject() ? 1 : 0)) {
            return String.valueOf(new StringBuilder(JsonUtils.lIIlIIlllllIlI[JsonUtils.lIIlIllIlllIlI[29]]).append(lllllllllllllIIllIIIlIIIlIIIIIII).append(JsonUtils.lIIlIIlllllIlI[JsonUtils.lIIlIllIlllIlI[30]]));
        }
        if (llIlIIllIllIIII(lllllllllllllIIllIIIlIIIIllllllI.isJsonPrimitive() ? 1 : 0)) {
            final JsonPrimitive lllllllllllllIIllIIIlIIIIlllllll = lllllllllllllIIllIIIlIIIIllllllI.getAsJsonPrimitive();
            if (llIlIIllIllIIII(lllllllllllllIIllIIIlIIIIlllllll.isNumber() ? 1 : 0)) {
                return String.valueOf(new StringBuilder(JsonUtils.lIIlIIlllllIlI[JsonUtils.lIIlIllIlllIlI[31]]).append(lllllllllllllIIllIIIlIIIlIIIIIII).append(JsonUtils.lIIlIIlllllIlI[JsonUtils.lIIlIllIlllIlI[32]]));
            }
            if (llIlIIllIllIIII(lllllllllllllIIllIIIlIIIIlllllll.isBoolean() ? 1 : 0)) {
                return String.valueOf(new StringBuilder(JsonUtils.lIIlIIlllllIlI[JsonUtils.lIIlIllIlllIlI[33]]).append(lllllllllllllIIllIIIlIIIlIIIIIII).append(JsonUtils.lIIlIIlllllIlI[JsonUtils.lIIlIllIlllIlI[34]]));
            }
        }
        return lllllllllllllIIllIIIlIIIlIIIIIII;
    }
    
    public static JsonObject getJsonObject(final JsonObject lllllllllllllIIllIIIlIIIlIIlllII, final String lllllllllllllIIllIIIlIIIlIIllIll, final JsonObject lllllllllllllIIllIIIlIIIlIIllIlI) {
        JsonObject jsonObject;
        if (llIlIIllIllIIII(lllllllllllllIIllIIIlIIIlIIlllII.has(lllllllllllllIIllIIIlIIIlIIllIll) ? 1 : 0)) {
            jsonObject = getJsonObject(lllllllllllllIIllIIIlIIIlIIlllII.get(lllllllllllllIIllIIIlIIIlIIllIll), lllllllllllllIIllIIIlIIIlIIllIll);
            "".length();
            if ((0x86 ^ 0x82) <= "   ".length()) {
                return null;
            }
        }
        else {
            jsonObject = lllllllllllllIIllIIIlIIIlIIllIlI;
        }
        return jsonObject;
    }
    
    public static boolean getBoolean(final JsonElement lllllllllllllIIllIIIlIIIlllIlIIl, final String lllllllllllllIIllIIIlIIIlllIlIlI) {
        if (llIlIIllIllIIII(lllllllllllllIIllIIIlIIIlllIlIIl.isJsonPrimitive() ? 1 : 0)) {
            return lllllllllllllIIllIIIlIIIlllIlIIl.getAsBoolean();
        }
        throw new JsonSyntaxException(String.valueOf(new StringBuilder(JsonUtils.lIIlIIlllllIlI[JsonUtils.lIIlIllIlllIlI[4]]).append(lllllllllllllIIllIIIlIIIlllIlIlI).append(JsonUtils.lIIlIIlllllIlI[JsonUtils.lIIlIllIlllIlI[5]]).append(toString(lllllllllllllIIllIIIlIIIlllIlIIl))));
    }
    
    public static boolean isString(final JsonElement lllllllllllllIIllIIIlIIlIIIllIll) {
        int string;
        if (llIlIIllIlIllIl(lllllllllllllIIllIIIlIIlIIIllIll.isJsonPrimitive() ? 1 : 0)) {
            string = JsonUtils.lIIlIllIlllIlI[0];
            "".length();
            if (-"  ".length() >= 0) {
                return ((0x5F ^ 0x7) & ~(0x47 ^ 0x1F)) != 0x0;
            }
        }
        else {
            string = (lllllllllllllIIllIIIlIIlIIIllIll.getAsJsonPrimitive().isString() ? 1 : 0);
        }
        return string != 0;
    }
    
    private static void llIIllllIIlllIl() {
        (lIIlIIlllllIlI = new String[JsonUtils.lIIlIllIlllIlI[35]])[JsonUtils.lIIlIllIlllIlI[0]] = llIIllllIIlIlll("J7FetNEcuu3nTR6EBOZKfA==", "iPfEu");
        JsonUtils.lIIlIIlllllIlI[JsonUtils.lIIlIllIlllIlI[1]] = llIIllllIIllIII("RSIaVToAdhRVKxEkHBs/SXYCFCtF", "eVuuX");
        JsonUtils.lIIlIIlllllIlI[JsonUtils.lIIlIllIlllIlI[2]] = llIIllllIIllIIl("ntLwAo+7y62ktipBINHsMg==", "MDeXG");
        JsonUtils.lIIlIIlllllIlI[JsonUtils.lIIlIllIlllIlI[3]] = llIIllllIIllIII("b3Y0MyEmNSUuNWMiPms3Kjg1azBjJSU5OC0x", "CVQKQ");
        JsonUtils.lIIlIIlllllIlI[JsonUtils.lIIlIllIlllIlI[4]] = llIIllllIIlIlll("fgABeln6Wk2d2xmm7rvP8w==", "sJGVm");
        JsonUtils.lIIlIIlllllIlI[JsonUtils.lIIlIllIlllIlI[5]] = llIIllllIIllIII("cAUFehE1UQt6MT8eBj8SPl1KLRIjUQ==", "PqjZs");
        JsonUtils.lIIlIIlllllIlI[JsonUtils.lIIlIllIlllIlI[6]] = llIIllllIIllIIl("cIeQJgixAqZiGhgaY+Zw1w==", "WxtKX");
        JsonUtils.lIIlIIlllllIlI[JsonUtils.lIIlIllIlllIlI[7]] = llIIllllIIlIlll("KHaUElGnCfRG6w0yOC9HK7/b++48GpOFLMly4V9Q7IA=", "ZGyOC");
        JsonUtils.lIIlIIlllllIlI[JsonUtils.lIIlIllIlllIlI[8]] = llIIllllIIllIII("DwshMzY+FjV2", "JsQVU");
        JsonUtils.lIIlIIlllllIlI[JsonUtils.lIIlIllIlllIlI[9]] = llIIllllIIlIlll("sEIBnNa0GwqtXNDNylZhQEI87oxhvsau", "QkwqP");
        JsonUtils.lIIlIIlllllIlI[JsonUtils.lIIlIllIlllIlI[10]] = llIIllllIIlIlll("oK/M/k3MPYu4r9JPWB2XGg==", "QsSQI");
        JsonUtils.lIIlIIlllllIlI[JsonUtils.lIIlIllIlllIlI[11]] = llIIllllIIlIlll("T9Q9+P2ETRkLpxNyDa/kFElsM50D9rU5ScK95075Za4=", "oHYFS");
        JsonUtils.lIIlIIlllllIlI[JsonUtils.lIIlIllIlllIlI[12]] = llIIllllIIllIIl("/G03OPtShDPZxuGrCXhIYA==", "ipMga");
        JsonUtils.lIIlIIlllllIlI[JsonUtils.lIIlIllIlllIlI[13]] = llIIllllIIlIlll("Ja00u/qYuZPekJZe6UvOr/9lKYf2wPUU", "Qvfgk");
        JsonUtils.lIIlIIlllllIlI[JsonUtils.lIIlIllIlllIlI[14]] = llIIllllIIllIIl("gW37LmqkEMmP6jbosvqfCA==", "pCKYv");
        JsonUtils.lIIlIIlllllIlI[JsonUtils.lIIlIllIlllIlI[15]] = llIIllllIIllIIl("GEmxxNG+LrTvvLxDZXqHNcdb4XkAJn+KLmF1tsBRZF4=", "yVnAD");
        JsonUtils.lIIlIIlllllIlI[JsonUtils.lIIlIllIlllIlI[16]] = llIIllllIIllIII("LxkAKjIeBBRv", "japOQ");
        JsonUtils.lIIlIIlllllIlI[JsonUtils.lIIlIllIlllIlI[17]] = llIIllllIIllIII("cwElSSM2VStJCyAaJCYjORApHW1zAisaYQ==", "SuJiA");
        JsonUtils.lIIlIIlllllIlI[JsonUtils.lIIlIllIlllIlI[18]] = llIIllllIIllIIl("swyDqPM9u2kEPAuxj8dmOA==", "MlULL");
        JsonUtils.lIIlIIlllllIlI[JsonUtils.lIIlIllIlllIlI[19]] = llIIllllIIlIlll("3KA4w+lSl67FFkOLgkVH8DVYYabNYBu1RBE1E+LNaUk=", "zkmln");
        JsonUtils.lIIlIIlllllIlI[JsonUtils.lIIlIllIlllIlI[20]] = llIIllllIIlIlll("Eb1DM9kggJbGG/UpgQ5dLg==", "GKYOU");
        JsonUtils.lIIlIIlllllIlI[JsonUtils.lIIlIllIlllIlI[21]] = llIIllllIIllIII("Sxkrdw0OTSV3JRgCKhYdGQw9e08cDDd3", "kmDWo");
        JsonUtils.lIIlIIlllllIlI[JsonUtils.lIIlIllIlllIlI[22]] = llIIllllIIllIII("KhwSCwsJEkE=", "guaxb");
        JsonUtils.lIIlIIlllllIlI[JsonUtils.lIIlIllIlllIlI[23]] = llIIllllIIllIII("REUoDhENBjkTBUgRIlYHAQspVgBILz4ZDykXPxcY", "heMva");
        JsonUtils.lIIlIIlllllIlI[JsonUtils.lIIlIllIlllIlI[24]] = llIIllllIIllIII("WEha", "vftUj");
        JsonUtils.lIIlIIlllllIlI[JsonUtils.lIIlIllIlllIlI[25]] = llIIllllIIlIlll("BUfHgVJWWRACPrdqWZATTg==", "ENsZu");
        JsonUtils.lIIlIIlllllIlI[JsonUtils.lIIlIllIlllIlI[26]] = llIIllllIIllIIl("OPjePzcFEP8irMnH+D4bYQ==", "fIzmj");
        JsonUtils.lIIlIIlllllIlI[JsonUtils.lIIlIllIlllIlI[27]] = llIIllllIIllIIl("CxqCst5xzqMWDD4JnSCqGg==", "fWcNE");
        JsonUtils.lIIlIIlllllIlI[JsonUtils.lIIlIllIlllIlI[28]] = llIIllllIIllIIl("bauKbloN7Hw=", "uEcdN");
        JsonUtils.lIIlIIlllllIlI[JsonUtils.lIIlIllIlllIlI[29]] = llIIllllIIllIII("AgRHOQ0JDwQiT0s=", "cjgVo");
        JsonUtils.lIIlIIlllllIlI[JsonUtils.lIIlIllIlllIlI[30]] = llIIllllIIllIII("cA==", "YNWRB");
        JsonUtils.lIIlIIlllllIlI[JsonUtils.lIIlIllIlllIlI[31]] = llIIllllIIllIII("EHMIECQTNhRFYQ==", "qSfeI");
        JsonUtils.lIIlIIlllllIlI[JsonUtils.lIIlIllIlllIlI[32]] = llIIllllIIlIlll("5aj5dHilRaI=", "xZFbi");
        JsonUtils.lIIlIIlllllIlI[JsonUtils.lIIlIllIlllIlI[33]] = llIIllllIIllIIl("l3GyJ1aa7aOhHdk47IVZ+Q==", "PbKvY");
        JsonUtils.lIIlIIlllllIlI[JsonUtils.lIIlIllIlllIlI[34]] = llIIllllIIllIII("Tw==", "fYFCI");
    }
    
    private static boolean llIlIIllIllIIII(final int lllllllllllllIIllIIIlIIIIlIIIIII) {
        return lllllllllllllIIllIIIlIIIIlIIIIII != 0;
    }
    
    public static int getInt(final JsonElement lllllllllllllIIllIIIlIIIllIIIIIl, final String lllllllllllllIIllIIIlIIIllIIIIII) {
        if (llIlIIllIllIIII(lllllllllllllIIllIIIlIIIllIIIIIl.isJsonPrimitive() ? 1 : 0) && llIlIIllIllIIII(lllllllllllllIIllIIIlIIIllIIIIIl.getAsJsonPrimitive().isNumber() ? 1 : 0)) {
            return lllllllllllllIIllIIIlIIIllIIIIIl.getAsInt();
        }
        throw new JsonSyntaxException(String.valueOf(new StringBuilder(JsonUtils.lIIlIIlllllIlI[JsonUtils.lIIlIllIlllIlI[12]]).append(lllllllllllllIIllIIIlIIIllIIIIII).append(JsonUtils.lIIlIIlllllIlI[JsonUtils.lIIlIllIlllIlI[13]]).append(toString(lllllllllllllIIllIIIlIIIllIIIIIl))));
    }
    
    public static float getFloat(final JsonObject lllllllllllllIIllIIIlIIIllIIlIIl, final String lllllllllllllIIllIIIlIIIllIIIlIl, final float lllllllllllllIIllIIIlIIIllIIIlll) {
        float float1;
        if (llIlIIllIllIIII(lllllllllllllIIllIIIlIIIllIIlIIl.has(lllllllllllllIIllIIIlIIIllIIIlIl) ? 1 : 0)) {
            float1 = getFloat(lllllllllllllIIllIIIlIIIllIIlIIl.get(lllllllllllllIIllIIIlIIIllIIIlIl), lllllllllllllIIllIIIlIIIllIIIlIl);
            "".length();
            if (-"  ".length() > 0) {
                return 0.0f;
            }
        }
        else {
            float1 = lllllllllllllIIllIIIlIIIllIIIlll;
        }
        return float1;
    }
    
    public static String getString(final JsonElement lllllllllllllIIllIIIlIIIlllllllI, final String lllllllllllllIIllIIIlIIIllllllIl) {
        if (llIlIIllIllIIII(lllllllllllllIIllIIIlIIIlllllllI.isJsonPrimitive() ? 1 : 0)) {
            return lllllllllllllIIllIIIlIIIlllllllI.getAsString();
        }
        throw new JsonSyntaxException(String.valueOf(new StringBuilder(JsonUtils.lIIlIIlllllIlI[JsonUtils.lIIlIllIlllIlI[0]]).append(lllllllllllllIIllIIIlIIIllllllIl).append(JsonUtils.lIIlIIlllllIlI[JsonUtils.lIIlIllIlllIlI[1]]).append(toString(lllllllllllllIIllIIIlIIIlllllllI))));
    }
    
    public static JsonArray getJsonArray(final JsonObject lllllllllllllIIllIIIlIIIlIIIllll, final String lllllllllllllIIllIIIlIIIlIIIlllI) {
        if (llIlIIllIllIIII(lllllllllllllIIllIIIlIIIlIIIllll.has(lllllllllllllIIllIIIlIIIlIIIlllI) ? 1 : 0)) {
            return getJsonArray(lllllllllllllIIllIIIlIIIlIIIllll.get(lllllllllllllIIllIIIlIIIlIIIlllI), lllllllllllllIIllIIIlIIIlIIIlllI);
        }
        throw new JsonSyntaxException(String.valueOf(new StringBuilder(JsonUtils.lIIlIIlllllIlI[JsonUtils.lIIlIllIlllIlI[22]]).append(lllllllllllllIIllIIIlIIIlIIIlllI).append(JsonUtils.lIIlIIlllllIlI[JsonUtils.lIIlIllIlllIlI[23]])));
    }
    
    public static JsonObject getJsonObject(final JsonElement lllllllllllllIIllIIIlIIIlIlIllII, final String lllllllllllllIIllIIIlIIIlIlIlIll) {
        if (llIlIIllIllIIII(lllllllllllllIIllIIIlIIIlIlIllII.isJsonObject() ? 1 : 0)) {
            return lllllllllllllIIllIIIlIIIlIlIllII.getAsJsonObject();
        }
        throw new JsonSyntaxException(String.valueOf(new StringBuilder(JsonUtils.lIIlIIlllllIlI[JsonUtils.lIIlIllIlllIlI[16]]).append(lllllllllllllIIllIIIlIIIlIlIlIll).append(JsonUtils.lIIlIIlllllIlI[JsonUtils.lIIlIllIlllIlI[17]]).append(toString(lllllllllllllIIllIIIlIIIlIlIllII))));
    }
    
    public static boolean isBoolean(final JsonObject lllllllllllllIIllIIIlIIlIIIllIII, final String lllllllllllllIIllIIIlIIlIIIlIlll) {
        int boolean1;
        if (llIlIIllIlIllIl(isJsonPrimitive(lllllllllllllIIllIIIlIIlIIIllIII, lllllllllllllIIllIIIlIIlIIIlIlll) ? 1 : 0)) {
            boolean1 = JsonUtils.lIIlIllIlllIlI[0];
            "".length();
            if (-" ".length() > (0x50 ^ 0x54)) {
                return ((0x5F ^ 0x4A) & ~(0x5 ^ 0x10)) != 0x0;
            }
        }
        else {
            boolean1 = (lllllllllllllIIllIIIlIIlIIIllIII.getAsJsonPrimitive(lllllllllllllIIllIIIlIIlIIIlIlll).isBoolean() ? 1 : 0);
        }
        return boolean1 != 0;
    }
    
    public static JsonArray getJsonArray(final JsonElement lllllllllllllIIllIIIlIIIlIIlIlll, final String lllllllllllllIIllIIIlIIIlIIlIlII) {
        if (llIlIIllIllIIII(lllllllllllllIIllIIIlIIIlIIlIlll.isJsonArray() ? 1 : 0)) {
            return lllllllllllllIIllIIIlIIIlIIlIlll.getAsJsonArray();
        }
        throw new JsonSyntaxException(String.valueOf(new StringBuilder(JsonUtils.lIIlIIlllllIlI[JsonUtils.lIIlIllIlllIlI[20]]).append(lllllllllllllIIllIIIlIIIlIIlIlII).append(JsonUtils.lIIlIIlllllIlI[JsonUtils.lIIlIllIlllIlI[21]]).append(toString(lllllllllllllIIllIIIlIIIlIIlIlll))));
    }
    
    public static boolean isString(final JsonObject lllllllllllllIIllIIIlIIlIIlIIIIl, final String lllllllllllllIIllIIIlIIlIIlIIIII) {
        int string;
        if (llIlIIllIlIllIl(isJsonPrimitive(lllllllllllllIIllIIIlIIlIIlIIIIl, lllllllllllllIIllIIIlIIlIIlIIIII) ? 1 : 0)) {
            string = JsonUtils.lIIlIllIlllIlI[0];
            "".length();
            if (("   ".length() & ("   ".length() ^ -" ".length())) > " ".length()) {
                return ((0x4B ^ 0x12 ^ (0xFF ^ 0x9C)) & (0xFE ^ 0x8C ^ (0x75 ^ 0x3D) ^ -" ".length())) != 0x0;
            }
        }
        else {
            string = (lllllllllllllIIllIIIlIIlIIlIIIIl.getAsJsonPrimitive(lllllllllllllIIllIIIlIIlIIlIIIII).isString() ? 1 : 0);
        }
        return string != 0;
    }
    
    private static boolean llIlIIllIllIIIl(final int lllllllllllllIIllIIIlIIIIlIIIlll, final int lllllllllllllIIllIIIlIIIIlIIIllI) {
        return lllllllllllllIIllIIIlIIIIlIIIlll < lllllllllllllIIllIIIlIIIIlIIIllI;
    }
    
    public static int getInt(final JsonObject lllllllllllllIIllIIIlIIIlIllIIIl, final String lllllllllllllIIllIIIlIIIlIllIIll, final int lllllllllllllIIllIIIlIIIlIlIllll) {
        int int1;
        if (llIlIIllIllIIII(lllllllllllllIIllIIIlIIIlIllIIIl.has(lllllllllllllIIllIIIlIIIlIllIIll) ? 1 : 0)) {
            int1 = getInt(lllllllllllllIIllIIIlIIIlIllIIIl.get(lllllllllllllIIllIIIlIIIlIllIIll), lllllllllllllIIllIIIlIIIlIllIIll);
            "".length();
            if (((0x7E ^ 0x10 ^ (0x41 ^ 0x6A)) & (0xF8 ^ 0xA5 ^ (0x89 ^ 0x91) ^ -" ".length())) >= "   ".length()) {
                return "  ".length() & ("  ".length() ^ -" ".length());
            }
        }
        else {
            int1 = lllllllllllllIIllIIIlIIIlIlIllll;
        }
        return int1;
    }
    
    public static String getString(final JsonObject lllllllllllllIIllIIIlIIIlllllIlI, final String lllllllllllllIIllIIIlIIIlllllIIl) {
        if (llIlIIllIllIIII(lllllllllllllIIllIIIlIIIlllllIlI.has(lllllllllllllIIllIIIlIIIlllllIIl) ? 1 : 0)) {
            return getString(lllllllllllllIIllIIIlIIIlllllIlI.get(lllllllllllllIIllIIIlIIIlllllIIl), lllllllllllllIIllIIIlIIIlllllIIl);
        }
        throw new JsonSyntaxException(String.valueOf(new StringBuilder(JsonUtils.lIIlIIlllllIlI[JsonUtils.lIIlIllIlllIlI[2]]).append(lllllllllllllIIllIIIlIIIlllllIIl).append(JsonUtils.lIIlIIlllllIlI[JsonUtils.lIIlIllIlllIlI[3]])));
    }
    
    public static boolean getBoolean(final JsonObject lllllllllllllIIllIIIlIIIlllIIlIl, final String lllllllllllllIIllIIIlIIIlllIIlII) {
        if (llIlIIllIllIIII(lllllllllllllIIllIIIlIIIlllIIlIl.has(lllllllllllllIIllIIIlIIIlllIIlII) ? 1 : 0)) {
            return getBoolean(lllllllllllllIIllIIIlIIIlllIIlIl.get(lllllllllllllIIllIIIlIIIlllIIlII), lllllllllllllIIllIIIlIIIlllIIlII);
        }
        throw new JsonSyntaxException(String.valueOf(new StringBuilder(JsonUtils.lIIlIIlllllIlI[JsonUtils.lIIlIllIlllIlI[6]]).append(lllllllllllllIIllIIIlIIIlllIIlII).append(JsonUtils.lIIlIIlllllIlI[JsonUtils.lIIlIllIlllIlI[7]])));
    }
    
    private static boolean llIlIIllIlIlllI(final Object lllllllllllllIIllIIIlIIIIlIIIIlI) {
        return lllllllllllllIIllIIIlIIIIlIIIIlI == null;
    }
    
    public static boolean hasField(final JsonObject lllllllllllllIIllIIIlIIlIIIIIlII, final String lllllllllllllIIllIIIlIIlIIIIIIll) {
        int n;
        if (llIlIIllIlIlllI(lllllllllllllIIllIIIlIIlIIIIIlII)) {
            n = JsonUtils.lIIlIllIlllIlI[0];
            "".length();
            if (null != null) {
                return ((0xE1 ^ 0xC2) & ~(0xB6 ^ 0x95)) != 0x0;
            }
        }
        else if (llIlIIllIlIllll(lllllllllllllIIllIIIlIIlIIIIIlII.get(lllllllllllllIIllIIIlIIlIIIIIIll))) {
            n = JsonUtils.lIIlIllIlllIlI[1];
            "".length();
            if (((0x16 ^ 0x26) & ~(0xF1 ^ 0xC1)) != 0x0) {
                return ((0xEA ^ 0xA2) & ~(0x29 ^ 0x61)) != 0x0;
            }
        }
        else {
            n = JsonUtils.lIIlIllIlllIlI[0];
        }
        return n != 0;
    }
    
    private static boolean llIlIIllIlIllIl(final int lllllllllllllIIllIIIlIIIIIlllllI) {
        return lllllllllllllIIllIIIlIIIIIlllllI == 0;
    }
    
    private static String llIIllllIIllIIl(final String lllllllllllllIIllIIIlIIIIlIIllll, final String lllllllllllllIIllIIIlIIIIlIIlllI) {
        try {
            final SecretKeySpec lllllllllllllIIllIIIlIIIIlIlIIlI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIIllIIIlIIIIlIIlllI.getBytes(StandardCharsets.UTF_8)), JsonUtils.lIIlIllIlllIlI[8]), "DES");
            final Cipher lllllllllllllIIllIIIlIIIIlIlIIIl = Cipher.getInstance("DES");
            lllllllllllllIIllIIIlIIIIlIlIIIl.init(JsonUtils.lIIlIllIlllIlI[2], lllllllllllllIIllIIIlIIIIlIlIIlI);
            return new String(lllllllllllllIIllIIIlIIIIlIlIIIl.doFinal(Base64.getDecoder().decode(lllllllllllllIIllIIIlIIIIlIIllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIllIIIlIIIIlIlIIII) {
            lllllllllllllIIllIIIlIIIIlIlIIII.printStackTrace();
            return null;
        }
    }
    
    private static String llIIllllIIllIII(String lllllllllllllIIllIIIlIIIIlIlllll, final String lllllllllllllIIllIIIlIIIIllIIIll) {
        lllllllllllllIIllIIIlIIIIlIlllll = new String(Base64.getDecoder().decode(lllllllllllllIIllIIIlIIIIlIlllll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIIllIIIlIIIIllIIIlI = new StringBuilder();
        final char[] lllllllllllllIIllIIIlIIIIllIIIIl = lllllllllllllIIllIIIlIIIIllIIIll.toCharArray();
        int lllllllllllllIIllIIIlIIIIllIIIII = JsonUtils.lIIlIllIlllIlI[0];
        final byte lllllllllllllIIllIIIlIIIIlIllIlI = (Object)lllllllllllllIIllIIIlIIIIlIlllll.toCharArray();
        final float lllllllllllllIIllIIIlIIIIlIllIIl = lllllllllllllIIllIIIlIIIIlIllIlI.length;
        Exception lllllllllllllIIllIIIlIIIIlIllIII = (Exception)JsonUtils.lIIlIllIlllIlI[0];
        while (llIlIIllIllIIIl((int)lllllllllllllIIllIIIlIIIIlIllIII, (int)lllllllllllllIIllIIIlIIIIlIllIIl)) {
            final char lllllllllllllIIllIIIlIIIIllIIlIl = lllllllllllllIIllIIIlIIIIlIllIlI[lllllllllllllIIllIIIlIIIIlIllIII];
            lllllllllllllIIllIIIlIIIIllIIIlI.append((char)(lllllllllllllIIllIIIlIIIIllIIlIl ^ lllllllllllllIIllIIIlIIIIllIIIIl[lllllllllllllIIllIIIlIIIIllIIIII % lllllllllllllIIllIIIlIIIIllIIIIl.length]));
            "".length();
            ++lllllllllllllIIllIIIlIIIIllIIIII;
            ++lllllllllllllIIllIIIlIIIIlIllIII;
            "".length();
            if (-(0x6 ^ 0x50 ^ (0xD3 ^ 0x80)) >= 0) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIIllIIIlIIIIllIIIlI);
    }
    
    public static float getFloat(final JsonElement lllllllllllllIIllIIIlIIIllIlIllI, final String lllllllllllllIIllIIIlIIIllIlIlIl) {
        if (llIlIIllIllIIII(lllllllllllllIIllIIIlIIIllIlIllI.isJsonPrimitive() ? 1 : 0) && llIlIIllIllIIII(lllllllllllllIIllIIIlIIIllIlIllI.getAsJsonPrimitive().isNumber() ? 1 : 0)) {
            return lllllllllllllIIllIIIlIIIllIlIllI.getAsFloat();
        }
        throw new JsonSyntaxException(String.valueOf(new StringBuilder(JsonUtils.lIIlIIlllllIlI[JsonUtils.lIIlIllIlllIlI[8]]).append(lllllllllllllIIllIIIlIIIllIlIlIl).append(JsonUtils.lIIlIIlllllIlI[JsonUtils.lIIlIllIlllIlI[9]]).append(toString(lllllllllllllIIllIIIlIIIllIlIllI))));
    }
    
    public static JsonObject getJsonObject(final JsonObject lllllllllllllIIllIIIlIIIlIlIIlII, final String lllllllllllllIIllIIIlIIIlIlIIIll) {
        if (llIlIIllIllIIII(lllllllllllllIIllIIIlIIIlIlIIlII.has(lllllllllllllIIllIIIlIIIlIlIIIll) ? 1 : 0)) {
            return getJsonObject(lllllllllllllIIllIIIlIIIlIlIIlII.get(lllllllllllllIIllIIIlIIIlIlIIIll), lllllllllllllIIllIIIlIIIlIlIIIll);
        }
        throw new JsonSyntaxException(String.valueOf(new StringBuilder(JsonUtils.lIIlIIlllllIlI[JsonUtils.lIIlIllIlllIlI[18]]).append(lllllllllllllIIllIIIlIIIlIlIIIll).append(JsonUtils.lIIlIIlllllIlI[JsonUtils.lIIlIllIlllIlI[19]])));
    }
}
