// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.client.resources.data;

import java.util.Iterator;
import java.util.Set;
import com.google.gson.JsonObject;
import java.util.Collection;
import net.minecraft.client.resources.Language;
import net.minecraft.util.JsonUtils;
import java.util.Map;
import com.google.common.collect.Sets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.security.MessageDigest;
import com.google.gson.JsonParseException;
import com.google.gson.JsonDeserializationContext;
import java.lang.reflect.Type;
import com.google.gson.JsonElement;
import java.nio.charset.StandardCharsets;
import java.util.Base64;

public class LanguageMetadataSectionSerializer extends BaseMetadataSectionSerializer<LanguageMetadataSection>
{
    private static final /* synthetic */ int[] lllIllIIIIllll;
    private static final /* synthetic */ String[] lllIllIIIIlllI;
    
    static {
        lIlIIlIIIIIIIIIl();
        lIlIIlIIIIIIIIII();
    }
    
    private static String lIlIIIllllllllll(String llllllllllllIlIllIIllllIlllIIlIl, final String llllllllllllIlIllIIllllIlllIlIIl) {
        llllllllllllIlIllIIllllIlllIIlIl = new String(Base64.getDecoder().decode(llllllllllllIlIllIIllllIlllIIlIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder llllllllllllIlIllIIllllIlllIlIII = new StringBuilder();
        final char[] llllllllllllIlIllIIllllIlllIIlll = llllllllllllIlIllIIllllIlllIlIIl.toCharArray();
        int llllllllllllIlIllIIllllIlllIIllI = LanguageMetadataSectionSerializer.lllIllIIIIllll[0];
        final String llllllllllllIlIllIIllllIlllIIIII = (Object)llllllllllllIlIllIIllllIlllIIlIl.toCharArray();
        final float llllllllllllIlIllIIllllIllIlllll = llllllllllllIlIllIIllllIlllIIIII.length;
        short llllllllllllIlIllIIllllIllIllllI = (short)LanguageMetadataSectionSerializer.lllIllIIIIllll[0];
        while (lIlIIlIIIIIIIlII(llllllllllllIlIllIIllllIllIllllI, (int)llllllllllllIlIllIIllllIllIlllll)) {
            final char llllllllllllIlIllIIllllIlllIlIll = llllllllllllIlIllIIllllIlllIIIII[llllllllllllIlIllIIllllIllIllllI];
            llllllllllllIlIllIIllllIlllIlIII.append((char)(llllllllllllIlIllIIllllIlllIlIll ^ llllllllllllIlIllIIllllIlllIIlll[llllllllllllIlIllIIllllIlllIIllI % llllllllllllIlIllIIllllIlllIIlll.length]));
            "".length();
            ++llllllllllllIlIllIIllllIlllIIllI;
            ++llllllllllllIlIllIIllllIllIllllI;
            "".length();
            if ("  ".length() == -" ".length()) {
                return null;
            }
        }
        return String.valueOf(llllllllllllIlIllIIllllIlllIlIII);
    }
    
    @Override
    public String getSectionName() {
        return LanguageMetadataSectionSerializer.lllIllIIIIlllI[LanguageMetadataSectionSerializer.lllIllIIIIllll[10]];
    }
    
    private static void lIlIIlIIIIIIIIII() {
        (lllIllIIIIlllI = new String[LanguageMetadataSectionSerializer.lllIllIIIIllll[11]])[LanguageMetadataSectionSerializer.lllIllIIIIllll[0]] = lIlIIIllllllllIl("BpH3BjpLCWX9Yi2HzAlqcA==", "FqNbM");
        LanguageMetadataSectionSerializer.lllIllIIIIlllI[LanguageMetadataSectionSerializer.lllIllIIIIllll[1]] = lIlIIIlllllllllI("guL/6cisFRU=", "MEBRa");
        LanguageMetadataSectionSerializer.lllIllIIIIlllI[LanguageMetadataSectionSerializer.lllIllIIIIllll[2]] = lIlIIIlllllllllI("aijit1hgtiE=", "cZVEw");
        LanguageMetadataSectionSerializer.lllIllIIIIlllI[LanguageMetadataSectionSerializer.lllIllIIIIllll[3]] = lIlIIIllllllllIl("ggUwtO6iKHR6r6xsncIMUw==", "ZlJPg");
        LanguageMetadataSectionSerializer.lllIllIIIIlllI[LanguageMetadataSectionSerializer.lllIllIIIIllll[4]] = lIlIIIllllllllIl("fDxgbpHAhdGLePi1+nFXOos9rYK17rW0", "ywwBF");
        LanguageMetadataSectionSerializer.lllIllIIIIlllI[LanguageMetadataSectionSerializer.lllIllIIIIllll[5]] = lIlIIIllllllllll("YWR0MwYhICUvWWYsJzEXP2k8IA8zLA==", "FIJAc");
        LanguageMetadataSectionSerializer.lllIllIIIIlllI[LanguageMetadataSectionSerializer.lllIllIIIIllll[6]] = lIlIIIllllllllIl("k7zT9JpAUGYBx5oROUuuj4f+4GszjPuq", "LmvLA");
        LanguageMetadataSectionSerializer.lllIllIIIIlllI[LanguageMetadataSectionSerializer.lllIllIIIIllll[7]] = lIlIIIlllllllllI("KVQwd9QFEwNOA0Q/4dj7FXCzuZSDKzjy", "oudFz");
        LanguageMetadataSectionSerializer.lllIllIIIIlllI[LanguageMetadataSectionSerializer.lllIllIIIIllll[8]] = lIlIIIlllllllllI("aiIPXcQwKt0z1BAl0+AxTHHYolV7h/Ie", "SoPHu");
        LanguageMetadataSectionSerializer.lllIllIIIIlllI[LanguageMetadataSectionSerializer.lllIllIIIIllll[9]] = lIlIIIllllllllIl("r0rCl+P8nraxKngZVknocA==", "Amkre");
        LanguageMetadataSectionSerializer.lllIllIIIIlllI[LanguageMetadataSectionSerializer.lllIllIIIIllll[10]] = lIlIIIllllllllIl("nSMLpcUElSOv/PPX1blSPA==", "JuJXO");
    }
    
    private static boolean lIlIIlIIIIIIIIll(final int llllllllllllIlIllIIllllIllIIlIII) {
        return llllllllllllIlIllIIllllIllIIlIII == 0;
    }
    
    private static boolean lIlIIlIIIIIIIIlI(final int llllllllllllIlIllIIllllIllIIlIlI) {
        return llllllllllllIlIllIIllllIllIIlIlI != 0;
    }
    
    private static String lIlIIIllllllllIl(final String llllllllllllIlIllIIllllIlllllIlI, final String llllllllllllIlIllIIllllIlllllIIl) {
        try {
            final SecretKeySpec llllllllllllIlIllIIllllIllllllIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIlIllIIllllIlllllIIl.getBytes(StandardCharsets.UTF_8)), LanguageMetadataSectionSerializer.lllIllIIIIllll[8]), "DES");
            final Cipher llllllllllllIlIllIIllllIllllllII = Cipher.getInstance("DES");
            llllllllllllIlIllIIllllIllllllII.init(LanguageMetadataSectionSerializer.lllIllIIIIllll[2], llllllllllllIlIllIIllllIllllllIl);
            return new String(llllllllllllIlIllIIllllIllllllII.doFinal(Base64.getDecoder().decode(llllllllllllIlIllIIllllIlllllIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIlIllIIllllIlllllIll) {
            llllllllllllIlIllIIllllIlllllIll.printStackTrace();
            return null;
        }
    }
    
    public LanguageMetadataSection deserialize(final JsonElement llllllllllllIlIllIIlllllIIIlIlII, final Type llllllllllllIlIllIIlllllIIIllllI, final JsonDeserializationContext llllllllllllIlIllIIlllllIIIlllIl) throws JsonParseException {
        final JsonObject llllllllllllIlIllIIlllllIIIlllII = llllllllllllIlIllIIlllllIIIlIlII.getAsJsonObject();
        final Set<Language> llllllllllllIlIllIIlllllIIIllIll = (Set<Language>)Sets.newHashSet();
        final short llllllllllllIlIllIIlllllIIIlIIII = (short)llllllllllllIlIllIIlllllIIIlllII.entrySet().iterator();
        "".length();
        if (-(95 + 23 - 49 + 104 ^ 0 + 110 + 35 + 24) >= 0) {
            return null;
        }
        while (!lIlIIlIIIIIIIIll(((Iterator)llllllllllllIlIllIIlllllIIIlIIII).hasNext() ? 1 : 0)) {
            final Map.Entry<String, JsonElement> llllllllllllIlIllIIlllllIIIllIlI = ((Iterator<Map.Entry<String, JsonElement>>)llllllllllllIlIllIIlllllIIIlIIII).next();
            final String llllllllllllIlIllIIlllllIIIllIIl = llllllllllllIlIllIIlllllIIIllIlI.getKey();
            final JsonObject llllllllllllIlIllIIlllllIIIllIII = JsonUtils.getJsonObject(llllllllllllIlIllIIlllllIIIllIlI.getValue(), LanguageMetadataSectionSerializer.lllIllIIIIlllI[LanguageMetadataSectionSerializer.lllIllIIIIllll[0]]);
            final String llllllllllllIlIllIIlllllIIIlIlll = JsonUtils.getString(llllllllllllIlIllIIlllllIIIllIII, LanguageMetadataSectionSerializer.lllIllIIIIlllI[LanguageMetadataSectionSerializer.lllIllIIIIllll[1]]);
            final String llllllllllllIlIllIIlllllIIIlIllI = JsonUtils.getString(llllllllllllIlIllIIlllllIIIllIII, LanguageMetadataSectionSerializer.lllIllIIIIlllI[LanguageMetadataSectionSerializer.lllIllIIIIllll[2]]);
            final boolean llllllllllllIlIllIIlllllIIIlIlIl = JsonUtils.getBoolean(llllllllllllIlIllIIlllllIIIllIII, LanguageMetadataSectionSerializer.lllIllIIIIlllI[LanguageMetadataSectionSerializer.lllIllIIIIllll[3]], (boolean)(LanguageMetadataSectionSerializer.lllIllIIIIllll[0] != 0));
            if (lIlIIlIIIIIIIIlI(llllllllllllIlIllIIlllllIIIlIlll.isEmpty() ? 1 : 0)) {
                throw new JsonParseException(String.valueOf(new StringBuilder(LanguageMetadataSectionSerializer.lllIllIIIIlllI[LanguageMetadataSectionSerializer.lllIllIIIIllll[4]]).append(llllllllllllIlIllIIlllllIIIllIIl).append(LanguageMetadataSectionSerializer.lllIllIIIIlllI[LanguageMetadataSectionSerializer.lllIllIIIIllll[5]])));
            }
            if (lIlIIlIIIIIIIIlI(llllllllllllIlIllIIlllllIIIlIllI.isEmpty() ? 1 : 0)) {
                throw new JsonParseException(String.valueOf(new StringBuilder(LanguageMetadataSectionSerializer.lllIllIIIIlllI[LanguageMetadataSectionSerializer.lllIllIIIIllll[6]]).append(llllllllllllIlIllIIlllllIIIllIIl).append(LanguageMetadataSectionSerializer.lllIllIIIIlllI[LanguageMetadataSectionSerializer.lllIllIIIIllll[7]])));
            }
            if (lIlIIlIIIIIIIIll(llllllllllllIlIllIIlllllIIIllIll.add(new Language(llllllllllllIlIllIIlllllIIIllIIl, llllllllllllIlIllIIlllllIIIlIlll, llllllllllllIlIllIIlllllIIIlIllI, llllllllllllIlIllIIlllllIIIlIlIl)) ? 1 : 0)) {
                throw new JsonParseException(String.valueOf(new StringBuilder(LanguageMetadataSectionSerializer.lllIllIIIIlllI[LanguageMetadataSectionSerializer.lllIllIIIIllll[8]]).append(llllllllllllIlIllIIlllllIIIllIIl).append(LanguageMetadataSectionSerializer.lllIllIIIIlllI[LanguageMetadataSectionSerializer.lllIllIIIIllll[9]])));
            }
        }
        return new LanguageMetadataSection(llllllllllllIlIllIIlllllIIIllIll);
    }
    
    private static boolean lIlIIlIIIIIIIlII(final int llllllllllllIlIllIIllllIllIIllIl, final int llllllllllllIlIllIIllllIllIIllII) {
        return llllllllllllIlIllIIllllIllIIllIl < llllllllllllIlIllIIllllIllIIllII;
    }
    
    private static void lIlIIlIIIIIIIIIl() {
        (lllIllIIIIllll = new int[12])[0] = ((22 + 137 - 132 + 131 ^ 83 + 180 - 182 + 106) & (152 + 90 - 152 + 67 ^ 159 + 134 - 176 + 67 ^ -" ".length()));
        LanguageMetadataSectionSerializer.lllIllIIIIllll[1] = " ".length();
        LanguageMetadataSectionSerializer.lllIllIIIIllll[2] = "  ".length();
        LanguageMetadataSectionSerializer.lllIllIIIIllll[3] = "   ".length();
        LanguageMetadataSectionSerializer.lllIllIIIIllll[4] = (0x51 ^ 0x55);
        LanguageMetadataSectionSerializer.lllIllIIIIllll[5] = (0x20 ^ 0x6B ^ (0x56 ^ 0x18));
        LanguageMetadataSectionSerializer.lllIllIIIIllll[6] = (0x21 ^ 0x27);
        LanguageMetadataSectionSerializer.lllIllIIIIllll[7] = (0x87 ^ 0x80);
        LanguageMetadataSectionSerializer.lllIllIIIIllll[8] = (0x58 ^ 0x57 ^ (0xF ^ 0x8));
        LanguageMetadataSectionSerializer.lllIllIIIIllll[9] = (0xE ^ 0x7);
        LanguageMetadataSectionSerializer.lllIllIIIIllll[10] = (0xA7 ^ 0xBF ^ (0x4A ^ 0x58));
        LanguageMetadataSectionSerializer.lllIllIIIIllll[11] = (0xAD ^ 0xA6);
    }
    
    private static String lIlIIIlllllllllI(final String llllllllllllIlIllIIllllIllIlIlIl, final String llllllllllllIlIllIIllllIllIlIlII) {
        try {
            final SecretKeySpec llllllllllllIlIllIIllllIllIllIII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIlIllIIllllIllIlIlII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher llllllllllllIlIllIIllllIllIlIlll = Cipher.getInstance("Blowfish");
            llllllllllllIlIllIIllllIllIlIlll.init(LanguageMetadataSectionSerializer.lllIllIIIIllll[2], llllllllllllIlIllIIllllIllIllIII);
            return new String(llllllllllllIlIllIIllllIllIlIlll.doFinal(Base64.getDecoder().decode(llllllllllllIlIllIIllllIllIlIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIlIllIIllllIllIlIllI) {
            llllllllllllIlIllIIllllIllIlIllI.printStackTrace();
            return null;
        }
    }
}
