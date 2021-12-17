// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.client.resources.data;

import java.util.Arrays;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import com.google.gson.JsonArray;
import java.util.List;
import com.google.gson.JsonObject;
import com.google.common.collect.Lists;
import net.minecraft.util.JsonUtils;
import com.google.gson.JsonParseException;
import com.google.gson.JsonDeserializationContext;
import java.lang.reflect.Type;
import com.google.gson.JsonElement;

public class TextureMetadataSectionSerializer extends BaseMetadataSectionSerializer<TextureMetadataSection>
{
    private static final /* synthetic */ int[] lllIIllIIlIlIl;
    private static final /* synthetic */ String[] lllIIllIIlIIII;
    
    public TextureMetadataSection deserialize(final JsonElement llllllllllllIlIllllIIIIlIIllllIl, final Type llllllllllllIlIllllIIIIlIIllllII, final JsonDeserializationContext llllllllllllIlIllllIIIIlIIlllIll) throws JsonParseException {
        final JsonObject llllllllllllIlIllllIIIIlIIlllIlI = llllllllllllIlIllllIIIIlIIllllIl.getAsJsonObject();
        final boolean llllllllllllIlIllllIIIIlIIlllIIl = JsonUtils.getBoolean(llllllllllllIlIllllIIIIlIIlllIlI, TextureMetadataSectionSerializer.lllIIllIIlIIII[TextureMetadataSectionSerializer.lllIIllIIlIlIl[0]], (boolean)(TextureMetadataSectionSerializer.lllIIllIIlIlIl[0] != 0));
        final boolean llllllllllllIlIllllIIIIlIIlllIII = JsonUtils.getBoolean(llllllllllllIlIllllIIIIlIIlllIlI, TextureMetadataSectionSerializer.lllIIllIIlIIII[TextureMetadataSectionSerializer.lllIIllIIlIlIl[1]], (boolean)(TextureMetadataSectionSerializer.lllIIllIIlIlIl[0] != 0));
        final List<Integer> llllllllllllIlIllllIIIIlIIllIlll = (List<Integer>)Lists.newArrayList();
        if (lIlIIIIIIlIIIlII(llllllllllllIlIllllIIIIlIIlllIlI.has(TextureMetadataSectionSerializer.lllIIllIIlIIII[TextureMetadataSectionSerializer.lllIIllIIlIlIl[2]]) ? 1 : 0)) {
            try {
                final JsonArray llllllllllllIlIllllIIIIlIIllIllI = llllllllllllIlIllllIIIIlIIlllIlI.getAsJsonArray(TextureMetadataSectionSerializer.lllIIllIIlIIII[TextureMetadataSectionSerializer.lllIIllIIlIlIl[3]]);
                int llllllllllllIlIllllIIIIlIIllIlIl = TextureMetadataSectionSerializer.lllIIllIIlIlIl[0];
                "".length();
                if (null != null) {
                    return null;
                }
                while (!lIlIIIIIIlIIIlIl(llllllllllllIlIllllIIIIlIIllIlIl, llllllllllllIlIllllIIIIlIIllIllI.size())) {
                    final JsonElement llllllllllllIlIllllIIIIlIIllIlII = llllllllllllIlIllllIIIIlIIllIllI.get(llllllllllllIlIllllIIIIlIIllIlIl);
                    Label_0297: {
                        if (lIlIIIIIIlIIIlII(llllllllllllIlIllllIIIIlIIllIlII.isJsonPrimitive() ? 1 : 0)) {
                            try {
                                llllllllllllIlIllllIIIIlIIllIlll.add(llllllllllllIlIllllIIIIlIIllIlII.getAsInt());
                                "".length();
                                "".length();
                                if (" ".length() == ((0x9D ^ 0xAB) & ~(0xB6 ^ 0x80))) {
                                    return null;
                                }
                                break Label_0297;
                            }
                            catch (NumberFormatException llllllllllllIlIllllIIIIlIIllIIll) {
                                throw new JsonParseException(String.valueOf(new StringBuilder(TextureMetadataSectionSerializer.lllIIllIIlIIII[TextureMetadataSectionSerializer.lllIIllIIlIlIl[4]]).append(llllllllllllIlIllllIIIIlIIllIlIl).append(TextureMetadataSectionSerializer.lllIIllIIlIIII[TextureMetadataSectionSerializer.lllIIllIIlIlIl[5]]).append(llllllllllllIlIllllIIIIlIIllIlII)), (Throwable)llllllllllllIlIllllIIIIlIIllIIll);
                            }
                        }
                        if (lIlIIIIIIlIIIlII(llllllllllllIlIllllIIIIlIIllIlII.isJsonObject() ? 1 : 0)) {
                            throw new JsonParseException(String.valueOf(new StringBuilder(TextureMetadataSectionSerializer.lllIIllIIlIIII[TextureMetadataSectionSerializer.lllIIllIIlIlIl[6]]).append(llllllllllllIlIllllIIIIlIIllIlIl).append(TextureMetadataSectionSerializer.lllIIllIIlIIII[TextureMetadataSectionSerializer.lllIIllIIlIlIl[7]]).append(llllllllllllIlIllllIIIIlIIllIlII)));
                        }
                    }
                    ++llllllllllllIlIllllIIIIlIIllIlIl;
                }
                "".length();
                if ((0x29 ^ 0x2D) < " ".length()) {
                    return null;
                }
            }
            catch (ClassCastException llllllllllllIlIllllIIIIlIIllIIlI) {
                throw new JsonParseException(String.valueOf(new StringBuilder(TextureMetadataSectionSerializer.lllIIllIIlIIII[TextureMetadataSectionSerializer.lllIIllIIlIlIl[8]]).append(llllllllllllIlIllllIIIIlIIlllIlI.get(TextureMetadataSectionSerializer.lllIIllIIlIIII[TextureMetadataSectionSerializer.lllIIllIIlIlIl[9]]))), (Throwable)llllllllllllIlIllllIIIIlIIllIIlI);
            }
        }
        return new TextureMetadataSection(llllllllllllIlIllllIIIIlIIlllIIl, llllllllllllIlIllllIIIIlIIlllIII, llllllllllllIlIllllIIIIlIIllIlll);
    }
    
    private static void lIlIIIIIIlIIIIll() {
        (lllIIllIIlIlIl = new int[12])[0] = ((0xBF ^ 0xB1) & ~(0x55 ^ 0x5B));
        TextureMetadataSectionSerializer.lllIIllIIlIlIl[1] = " ".length();
        TextureMetadataSectionSerializer.lllIIllIIlIlIl[2] = "  ".length();
        TextureMetadataSectionSerializer.lllIIllIIlIlIl[3] = "   ".length();
        TextureMetadataSectionSerializer.lllIIllIIlIlIl[4] = (0x20 ^ 0x24);
        TextureMetadataSectionSerializer.lllIIllIIlIlIl[5] = (0x14 ^ 0x48 ^ (0x76 ^ 0x2F));
        TextureMetadataSectionSerializer.lllIIllIIlIlIl[6] = (0xBF ^ 0xB9);
        TextureMetadataSectionSerializer.lllIIllIIlIlIl[7] = (0x0 ^ 0x7);
        TextureMetadataSectionSerializer.lllIIllIIlIlIl[8] = (0x78 ^ 0x70);
        TextureMetadataSectionSerializer.lllIIllIIlIlIl[9] = (0x3E ^ 0x12 ^ (0x5E ^ 0x7B));
        TextureMetadataSectionSerializer.lllIIllIIlIlIl[10] = (0xB4 ^ 0xBE);
        TextureMetadataSectionSerializer.lllIIllIIlIlIl[11] = (0x96 ^ 0x9D);
    }
    
    private static boolean lIlIIIIIIlIIIlII(final int llllllllllllIlIllllIIIIIlllIIlII) {
        return llllllllllllIlIllllIIIIIlllIIlII != 0;
    }
    
    private static String lIlIIIIIIIllIlII(final String llllllllllllIlIllllIIIIlIIIlIllI, final String llllllllllllIlIllllIIIIlIIIlIlll) {
        try {
            final SecretKeySpec llllllllllllIlIllllIIIIlIIIllIll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIlIllllIIIIlIIIlIlll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher llllllllllllIlIllllIIIIlIIIllIlI = Cipher.getInstance("Blowfish");
            llllllllllllIlIllllIIIIlIIIllIlI.init(TextureMetadataSectionSerializer.lllIIllIIlIlIl[2], llllllllllllIlIllllIIIIlIIIllIll);
            return new String(llllllllllllIlIllllIIIIlIIIllIlI.doFinal(Base64.getDecoder().decode(llllllllllllIlIllllIIIIlIIIlIllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIlIllllIIIIlIIIllIIl) {
            llllllllllllIlIllllIIIIlIIIllIIl.printStackTrace();
            return null;
        }
    }
    
    private static String lIlIIIIIIIlllIlI(String llllllllllllIlIllllIIIIlIIIIIIll, final String llllllllllllIlIllllIIIIlIIIIIIlI) {
        llllllllllllIlIllllIIIIlIIIIIIll = (Exception)new String(Base64.getDecoder().decode(((String)llllllllllllIlIllllIIIIlIIIIIIll).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder llllllllllllIlIllllIIIIlIIIIIllI = new StringBuilder();
        final char[] llllllllllllIlIllllIIIIlIIIIIlIl = llllllllllllIlIllllIIIIlIIIIIIlI.toCharArray();
        int llllllllllllIlIllllIIIIlIIIIIlII = TextureMetadataSectionSerializer.lllIIllIIlIlIl[0];
        final double llllllllllllIlIllllIIIIIlllllllI = (Object)((String)llllllllllllIlIllllIIIIlIIIIIIll).toCharArray();
        final String llllllllllllIlIllllIIIIIllllllIl = (String)llllllllllllIlIllllIIIIIlllllllI.length;
        int llllllllllllIlIllllIIIIIllllllII = TextureMetadataSectionSerializer.lllIIllIIlIlIl[0];
        while (lIlIIIIIIlIIIllI(llllllllllllIlIllllIIIIIllllllII, (int)llllllllllllIlIllllIIIIIllllllIl)) {
            final char llllllllllllIlIllllIIIIlIIIIlIIl = llllllllllllIlIllllIIIIIlllllllI[llllllllllllIlIllllIIIIIllllllII];
            llllllllllllIlIllllIIIIlIIIIIllI.append((char)(llllllllllllIlIllllIIIIlIIIIlIIl ^ llllllllllllIlIllllIIIIlIIIIIlIl[llllllllllllIlIllllIIIIlIIIIIlII % llllllllllllIlIllllIIIIlIIIIIlIl.length]));
            "".length();
            ++llllllllllllIlIllllIIIIlIIIIIlII;
            ++llllllllllllIlIllllIIIIIllllllII;
            "".length();
            if (" ".length() < -" ".length()) {
                return null;
            }
        }
        return String.valueOf(llllllllllllIlIllllIIIIlIIIIIllI);
    }
    
    private static String lIlIIIIIIIlllIll(final String llllllllllllIlIllllIIIIIllllIIll, final String llllllllllllIlIllllIIIIIllllIIII) {
        try {
            final SecretKeySpec llllllllllllIlIllllIIIIIllllIllI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIlIllllIIIIIllllIIII.getBytes(StandardCharsets.UTF_8)), TextureMetadataSectionSerializer.lllIIllIIlIlIl[8]), "DES");
            final Cipher llllllllllllIlIllllIIIIIllllIlIl = Cipher.getInstance("DES");
            llllllllllllIlIllllIIIIIllllIlIl.init(TextureMetadataSectionSerializer.lllIIllIIlIlIl[2], llllllllllllIlIllllIIIIIllllIllI);
            return new String(llllllllllllIlIllllIIIIIllllIlIl.doFinal(Base64.getDecoder().decode(llllllllllllIlIllllIIIIIllllIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIlIllllIIIIIllllIlII) {
            llllllllllllIlIllllIIIIIllllIlII.printStackTrace();
            return null;
        }
    }
    
    static {
        lIlIIIIIIlIIIIll();
        lIlIIIIIIlIIIIII();
    }
    
    @Override
    public String getSectionName() {
        return TextureMetadataSectionSerializer.lllIIllIIlIIII[TextureMetadataSectionSerializer.lllIIllIIlIlIl[10]];
    }
    
    private static void lIlIIIIIIlIIIIII() {
        (lllIIllIIlIIII = new String[TextureMetadataSectionSerializer.lllIIllIIlIlIl[11]])[TextureMetadataSectionSerializer.lllIIllIIlIlIl[0]] = lIlIIIIIIIllIlII("w/cIonjBuMs=", "JKahX");
        TextureMetadataSectionSerializer.lllIIllIIlIIII[TextureMetadataSectionSerializer.lllIIllIIlIlIl[1]] = lIlIIIIIIIlllIlI("EQoWOyg=", "rfwVX");
        TextureMetadataSectionSerializer.lllIIllIIlIIII[TextureMetadataSectionSerializer.lllIIllIIlIlIl[2]] = lIlIIIIIIIllIlII("rppWUnna0jc=", "Nkoer");
        TextureMetadataSectionSerializer.lllIIllIIlIIII[TextureMetadataSectionSerializer.lllIIllIIlIlIl[3]] = lIlIIIIIIIllIlII("fOfWnvJiC8o=", "GnIMF");
        TextureMetadataSectionSerializer.lllIIllIIlIIII[TextureMetadataSectionSerializer.lllIIllIIlIlIl[4]] = lIlIIIIIIIlllIll("aV+F1hz9K6USpcPif42J4aubNbs8am5U5cXtDzPGNHM=", "PBDgn");
        TextureMetadataSectionSerializer.lllIIllIIlIIII[TextureMetadataSectionSerializer.lllIIllIIlIlIl[5]] = lIlIIIIIIIlllIlI("aFYsPjQ3FT0jIHIYPCsmNwRlZjMzBWk=", "RvIFD");
        TextureMetadataSectionSerializer.lllIIllIIlIIII[TextureMetadataSectionSerializer.lllIIllIIlIlIl[6]] = lIlIIIIIIIllIlII("Rex28xtR6VjpdUvY2c1Fdlju5E7PgsYxFX+6vs36vNk=", "YChof");
        TextureMetadataSectionSerializer.lllIIllIIlIIII[TextureMetadataSectionSerializer.lllIIllIIlIlIl[7]] = lIlIIIIIIIlllIll("ghN3WiwmJKL1jQPTdCBFSt5DF7b8u1yK", "hIwKz");
        TextureMetadataSectionSerializer.lllIIllIIlIIII[TextureMetadataSectionSerializer.lllIIllIIlIlIl[8]] = lIlIIIIIIIlllIlI("HDksKSs8M3o8Ii0jLzoieGk3ITc4Nio7fXUyIjgiNiM/LGc0JSgpPnl3LSk0dQ==", "UWZHG");
        TextureMetadataSectionSerializer.lllIIllIIlIIII[TextureMetadataSectionSerializer.lllIIllIIlIlIl[9]] = lIlIIIIIIIllIlII("N2GVzCej+ec=", "kQzdQ");
        TextureMetadataSectionSerializer.lllIIllIIlIIII[TextureMetadataSectionSerializer.lllIIllIIlIlIl[10]] = lIlIIIIIIIlllIll("cSM0WfA1FYU=", "oyldG");
    }
    
    private static boolean lIlIIIIIIlIIIlIl(final int llllllllllllIlIllllIIIIIlllIlIll, final int llllllllllllIlIllllIIIIIlllIlIlI) {
        return llllllllllllIlIllllIIIIIlllIlIll >= llllllllllllIlIllllIIIIIlllIlIlI;
    }
    
    private static boolean lIlIIIIIIlIIIllI(final int llllllllllllIlIllllIIIIIlllIIlll, final int llllllllllllIlIllllIIIIIlllIIllI) {
        return llllllllllllIlIllllIIIIIlllIIlll < llllllllllllIlIllllIIIIIlllIIllI;
    }
}
