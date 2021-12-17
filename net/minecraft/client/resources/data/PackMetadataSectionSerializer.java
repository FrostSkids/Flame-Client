// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.client.resources.data;

import net.minecraft.util.JsonUtils;
import net.minecraft.util.IChatComponent;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import com.google.gson.JsonParseException;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonObject;
import com.google.gson.JsonElement;
import com.google.gson.JsonSerializationContext;
import java.lang.reflect.Type;
import com.google.gson.JsonSerializer;

public class PackMetadataSectionSerializer extends BaseMetadataSectionSerializer<PackMetadataSection> implements JsonSerializer<PackMetadataSection>
{
    private static final /* synthetic */ String[] lIllIlIllIIIlI;
    private static final /* synthetic */ int[] lIllIlIllIIlIl;
    
    private static void llllllIllllIlII() {
        (lIllIlIllIIlIl = new int[8])[0] = ((177 + 54 - 12 + 12 ^ 91 + 0 - 85 + 166) & (0x9D ^ 0xBE ^ (0x7D ^ 0x15) ^ -" ".length()));
        PackMetadataSectionSerializer.lIllIlIllIIlIl[1] = " ".length();
        PackMetadataSectionSerializer.lIllIlIllIIlIl[2] = "  ".length();
        PackMetadataSectionSerializer.lIllIlIllIIlIl[3] = "   ".length();
        PackMetadataSectionSerializer.lIllIlIllIIlIl[4] = (0x40 ^ 0x44);
        PackMetadataSectionSerializer.lIllIlIllIIlIl[5] = (0x82 ^ 0x9B ^ (0x12 ^ 0xE));
        PackMetadataSectionSerializer.lIllIlIllIIlIl[6] = (149 + 16 - 58 + 85 ^ 7 + 65 - 46 + 172);
        PackMetadataSectionSerializer.lIllIlIllIIlIl[7] = (0xE ^ 0x6);
    }
    
    public JsonElement serialize(final PackMetadataSection llllllllllllIlllllllllIIIlIIlIII, final Type llllllllllllIlllllllllIIIlIIIlll, final JsonSerializationContext llllllllllllIlllllllllIIIlIIIllI) {
        final JsonObject llllllllllllIlllllllllIIIlIIIlIl = new JsonObject();
        llllllllllllIlllllllllIIIlIIIlIl.addProperty(PackMetadataSectionSerializer.lIllIlIllIIIlI[PackMetadataSectionSerializer.lIllIlIllIIlIl[3]], (Number)llllllllllllIlllllllllIIIlIIlIII.getPackFormat());
        llllllllllllIlllllllllIIIlIIIlIl.add(PackMetadataSectionSerializer.lIllIlIllIIIlI[PackMetadataSectionSerializer.lIllIlIllIIlIl[4]], llllllllllllIlllllllllIIIlIIIllI.serialize((Object)llllllllllllIlllllllllIIIlIIlIII.getPackDescription()));
        return (JsonElement)llllllllllllIlllllllllIIIlIIIlIl;
    }
    
    private static boolean llllllIllllIlIl(final Object llllllllllllIllllllllIlllllllIIl) {
        return llllllllllllIllllllllIlllllllIIl == null;
    }
    
    private static String llllllIlllIllII(final String llllllllllllIlllllllllIIIIlIlIIl, final String llllllllllllIlllllllllIIIIlIlIII) {
        try {
            final SecretKeySpec llllllllllllIlllllllllIIIIlIllII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIlllllllllIIIIlIlIII.getBytes(StandardCharsets.UTF_8)), PackMetadataSectionSerializer.lIllIlIllIIlIl[7]), "DES");
            final Cipher llllllllllllIlllllllllIIIIlIlIll = Cipher.getInstance("DES");
            llllllllllllIlllllllllIIIIlIlIll.init(PackMetadataSectionSerializer.lIllIlIllIIlIl[2], llllllllllllIlllllllllIIIIlIllII);
            return new String(llllllllllllIlllllllllIIIIlIlIll.doFinal(Base64.getDecoder().decode(llllllllllllIlllllllllIIIIlIlIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIlllllllllIIIIlIlIlI) {
            llllllllllllIlllllllllIIIIlIlIlI.printStackTrace();
            return null;
        }
    }
    
    public String getSectionName() {
        return PackMetadataSectionSerializer.lIllIlIllIIIlI[PackMetadataSectionSerializer.lIllIlIllIIlIl[5]];
    }
    
    private static void llllllIllllIIII() {
        (lIllIlIllIIIlI = new String[PackMetadataSectionSerializer.lIllIlIllIIlIl[6]])[PackMetadataSectionSerializer.lIllIlIllIIlIl[0]] = llllllIlllIlIll("PiAkERYzNSMbCzQ=", "ZEWrd");
        PackMetadataSectionSerializer.lIllIlIllIIIlI[PackMetadataSectionSerializer.lIllIlIllIIlIl[1]] = llllllIlllIlIll("EwokEQczAH0dAikXOx4MegA3AwgoDSIEAjUKcw==", "ZdRpk");
        PackMetadataSectionSerializer.lIllIlIllIIIlI[PackMetadataSectionSerializer.lIllIlIllIIlIl[2]] = llllllIlllIlIll("HDsoDxwKNTkJIhg=", "lZKdC");
        PackMetadataSectionSerializer.lIllIlIllIIIlI[PackMetadataSectionSerializer.lIllIlIllIIlIl[3]] = llllllIlllIllII("7uo9fx/quCWot475MnHFCg==", "AMSEj");
        PackMetadataSectionSerializer.lIllIlIllIIIlI[PackMetadataSectionSerializer.lIllIlIllIIlIl[4]] = llllllIlllIllII("7OX/UmGD/jbDwHSgBB4aeQ==", "yhXOt");
        PackMetadataSectionSerializer.lIllIlIllIIIlI[PackMetadataSectionSerializer.lIllIlIllIIlIl[5]] = llllllIlllIllll("doOA2kUFTU4=", "mwvbx");
    }
    
    public PackMetadataSection deserialize(final JsonElement llllllllllllIlllllllllIIIlIlIlll, final Type llllllllllllIlllllllllIIIlIlIllI, final JsonDeserializationContext llllllllllllIlllllllllIIIlIlIIII) throws JsonParseException {
        final JsonObject llllllllllllIlllllllllIIIlIlIlII = llllllllllllIlllllllllIIIlIlIlll.getAsJsonObject();
        final IChatComponent llllllllllllIlllllllllIIIlIlIIll = (IChatComponent)llllllllllllIlllllllllIIIlIlIIII.deserialize(llllllllllllIlllllllllIIIlIlIlII.get(PackMetadataSectionSerializer.lIllIlIllIIIlI[PackMetadataSectionSerializer.lIllIlIllIIlIl[0]]), (Type)IChatComponent.class);
        if (llllllIllllIlIl(llllllllllllIlllllllllIIIlIlIIll)) {
            throw new JsonParseException(PackMetadataSectionSerializer.lIllIlIllIIIlI[PackMetadataSectionSerializer.lIllIlIllIIlIl[1]]);
        }
        final int llllllllllllIlllllllllIIIlIlIIlI = JsonUtils.getInt(llllllllllllIlllllllllIIIlIlIlII, PackMetadataSectionSerializer.lIllIlIllIIIlI[PackMetadataSectionSerializer.lIllIlIllIIlIl[2]]);
        return new PackMetadataSection(llllllllllllIlllllllllIIIlIlIIll, llllllllllllIlllllllllIIIlIlIIlI);
    }
    
    private static String llllllIlllIlIll(String llllllllllllIlllllllllIIIIIIIlll, final String llllllllllllIlllllllllIIIIIIIllI) {
        llllllllllllIlllllllllIIIIIIIlll = (char)new String(Base64.getDecoder().decode(((String)llllllllllllIlllllllllIIIIIIIlll).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder llllllllllllIlllllllllIIIIIIlIlI = new StringBuilder();
        final char[] llllllllllllIlllllllllIIIIIIlIIl = llllllllllllIlllllllllIIIIIIIllI.toCharArray();
        int llllllllllllIlllllllllIIIIIIlIII = PackMetadataSectionSerializer.lIllIlIllIIlIl[0];
        final Exception llllllllllllIlllllllllIIIIIIIIlI = (Object)((String)llllllllllllIlllllllllIIIIIIIlll).toCharArray();
        final byte llllllllllllIlllllllllIIIIIIIIIl = (byte)llllllllllllIlllllllllIIIIIIIIlI.length;
        int llllllllllllIlllllllllIIIIIIIIII = PackMetadataSectionSerializer.lIllIlIllIIlIl[0];
        while (llllllIllllIllI(llllllllllllIlllllllllIIIIIIIIII, llllllllllllIlllllllllIIIIIIIIIl)) {
            final char llllllllllllIlllllllllIIIIIIllIl = llllllllllllIlllllllllIIIIIIIIlI[llllllllllllIlllllllllIIIIIIIIII];
            llllllllllllIlllllllllIIIIIIlIlI.append((char)(llllllllllllIlllllllllIIIIIIllIl ^ llllllllllllIlllllllllIIIIIIlIIl[llllllllllllIlllllllllIIIIIIlIII % llllllllllllIlllllllllIIIIIIlIIl.length]));
            "".length();
            ++llllllllllllIlllllllllIIIIIIlIII;
            ++llllllllllllIlllllllllIIIIIIIIII;
            "".length();
            if (" ".length() >= "  ".length()) {
                return null;
            }
        }
        return String.valueOf(llllllllllllIlllllllllIIIIIIlIlI);
    }
    
    private static boolean llllllIllllIllI(final int llllllllllllIllllllllIllllllllII, final int llllllllllllIllllllllIlllllllIll) {
        return llllllllllllIllllllllIllllllllII < llllllllllllIllllllllIlllllllIll;
    }
    
    private static String llllllIlllIllll(final String llllllllllllIlllllllllIIIIIlllII, final String llllllllllllIlllllllllIIIIIllIll) {
        try {
            final SecretKeySpec llllllllllllIlllllllllIIIIIlllll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIlllllllllIIIIIllIll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher llllllllllllIlllllllllIIIIIllllI = Cipher.getInstance("Blowfish");
            llllllllllllIlllllllllIIIIIllllI.init(PackMetadataSectionSerializer.lIllIlIllIIlIl[2], llllllllllllIlllllllllIIIIIlllll);
            return new String(llllllllllllIlllllllllIIIIIllllI.doFinal(Base64.getDecoder().decode(llllllllllllIlllllllllIIIIIlllII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIlllllllllIIIIIlllIl) {
            llllllllllllIlllllllllIIIIIlllIl.printStackTrace();
            return null;
        }
    }
    
    static {
        llllllIllllIlII();
        llllllIllllIIII();
    }
}
