// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.client.resources.data;

import java.util.Arrays;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonArray;
import java.util.List;
import com.google.common.collect.Lists;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonParseException;
import com.google.gson.JsonDeserializationContext;
import java.lang.reflect.Type;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import com.google.gson.JsonObject;
import org.apache.commons.lang3.Validate;
import net.minecraft.util.JsonUtils;
import com.google.gson.JsonElement;
import com.google.gson.JsonSerializer;

public class AnimationMetadataSectionSerializer extends BaseMetadataSectionSerializer<AnimationMetadataSection> implements JsonSerializer<AnimationMetadataSection>
{
    private static final /* synthetic */ int[] lIllIIIlIIlIll;
    private static final /* synthetic */ String[] lIllIIIlIIlIIl;
    
    private static boolean llllIllllIlllII(final int lllllllllllllIIIIIllIIllllIllIll, final int lllllllllllllIIIIIllIIllllIllIlI) {
        return lllllllllllllIIIIIllIIllllIllIll >= lllllllllllllIIIIIllIIllllIllIlI;
    }
    
    private AnimationFrame parseAnimationFrame(final int lllllllllllllIIIIIllIlIIIlllIIll, final JsonElement lllllllllllllIIIIIllIlIIIlllIlll) {
        if (llllIllllIllIlI(lllllllllllllIIIIIllIlIIIlllIlll.isJsonPrimitive() ? 1 : 0)) {
            return new AnimationFrame(JsonUtils.getInt(lllllllllllllIIIIIllIlIIIlllIlll, String.valueOf(new StringBuilder(AnimationMetadataSectionSerializer.lIllIIIlIIlIIl[AnimationMetadataSectionSerializer.lIllIIIlIIlIll[13]]).append(lllllllllllllIIIIIllIlIIIlllIIll).append(AnimationMetadataSectionSerializer.lIllIIIlIIlIIl[AnimationMetadataSectionSerializer.lIllIIIlIIlIll[14]]))));
        }
        if (llllIllllIllIlI(lllllllllllllIIIIIllIlIIIlllIlll.isJsonObject() ? 1 : 0)) {
            final JsonObject lllllllllllllIIIIIllIlIIIlllIllI = JsonUtils.getJsonObject(lllllllllllllIIIIIllIlIIIlllIlll, String.valueOf(new StringBuilder(AnimationMetadataSectionSerializer.lIllIIIlIIlIIl[AnimationMetadataSectionSerializer.lIllIIIlIIlIll[15]]).append(lllllllllllllIIIIIllIlIIIlllIIll).append(AnimationMetadataSectionSerializer.lIllIIIlIIlIIl[AnimationMetadataSectionSerializer.lIllIIIlIIlIll[16]])));
            final int lllllllllllllIIIIIllIlIIIlllIlIl = JsonUtils.getInt(lllllllllllllIIIIIllIlIIIlllIllI, AnimationMetadataSectionSerializer.lIllIIIlIIlIIl[AnimationMetadataSectionSerializer.lIllIIIlIIlIll[17]], AnimationMetadataSectionSerializer.lIllIIIlIIlIll[8]);
            if (llllIllllIllIlI(lllllllllllllIIIIIllIlIIIlllIllI.has(AnimationMetadataSectionSerializer.lIllIIIlIIlIIl[AnimationMetadataSectionSerializer.lIllIIIlIIlIll[18]]) ? 1 : 0)) {
                Validate.inclusiveBetween(1L, 2147483647L, (long)lllllllllllllIIIIIllIlIIIlllIlIl, AnimationMetadataSectionSerializer.lIllIIIlIIlIIl[AnimationMetadataSectionSerializer.lIllIIIlIIlIll[19]]);
            }
            final int lllllllllllllIIIIIllIlIIIlllIlII = JsonUtils.getInt(lllllllllllllIIIIIllIlIIIlllIllI, AnimationMetadataSectionSerializer.lIllIIIlIIlIIl[AnimationMetadataSectionSerializer.lIllIIIlIIlIll[20]]);
            Validate.inclusiveBetween(0L, 2147483647L, (long)lllllllllllllIIIIIllIlIIIlllIlII, AnimationMetadataSectionSerializer.lIllIIIlIIlIIl[AnimationMetadataSectionSerializer.lIllIIIlIIlIll[21]]);
            return new AnimationFrame(lllllllllllllIIIIIllIlIIIlllIlII, lllllllllllllIIIIIllIlIIIlllIlIl);
        }
        return null;
    }
    
    public String getSectionName() {
        return AnimationMetadataSectionSerializer.lIllIIIlIIlIIl[AnimationMetadataSectionSerializer.lIllIIIlIIlIll[28]];
    }
    
    private static String llllIllllIIlllI(final String lllllllllllllIIIIIllIIlllllIlIIl, final String lllllllllllllIIIIIllIIlllllIIlll) {
        try {
            final SecretKeySpec lllllllllllllIIIIIllIIllllllIIIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIIIIIllIIlllllIIlll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lllllllllllllIIIIIllIIlllllIllll = Cipher.getInstance("Blowfish");
            lllllllllllllIIIIIllIIlllllIllll.init(AnimationMetadataSectionSerializer.lIllIIIlIIlIll[2], lllllllllllllIIIIIllIIllllllIIIl);
            return new String(lllllllllllllIIIIIllIIlllllIllll.doFinal(Base64.getDecoder().decode(lllllllllllllIIIIIllIIlllllIlIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIIIIllIIlllllIlllI) {
            lllllllllllllIIIIIllIIlllllIlllI.printStackTrace();
            return null;
        }
    }
    
    private static boolean llllIllllIllIIl(final int lllllllllllllIIIIIllIIllllIIllIl, final int lllllllllllllIIIIIllIIllllIIllII) {
        return lllllllllllllIIIIIllIIllllIIllIl != lllllllllllllIIIIIllIIllllIIllII;
    }
    
    static {
        llllIllllIllIII();
        llllIllllIlIIIl();
    }
    
    public AnimationMetadataSection deserialize(final JsonElement lllllllllllllIIIIIllIlIIlIlIlIlI, final Type lllllllllllllIIIIIllIlIIlIlIlIIl, final JsonDeserializationContext lllllllllllllIIIIIllIlIIlIlIlIII) throws JsonParseException {
        final List<AnimationFrame> lllllllllllllIIIIIllIlIIlIlIIlIl = (List<AnimationFrame>)Lists.newArrayList();
        final JsonObject lllllllllllllIIIIIllIlIIlIlIIIll = JsonUtils.getJsonObject(lllllllllllllIIIIIllIlIIlIlIlIlI, AnimationMetadataSectionSerializer.lIllIIIlIIlIIl[AnimationMetadataSectionSerializer.lIllIIIlIIlIll[0]]);
        final int lllllllllllllIIIIIllIlIIlIlIIIIl = JsonUtils.getInt(lllllllllllllIIIIIllIlIIlIlIIIll, AnimationMetadataSectionSerializer.lIllIIIlIIlIIl[AnimationMetadataSectionSerializer.lIllIIIlIIlIll[1]], AnimationMetadataSectionSerializer.lIllIIIlIIlIll[1]);
        if (llllIllllIllIIl(lllllllllllllIIIIIllIlIIlIlIIIIl, AnimationMetadataSectionSerializer.lIllIIIlIIlIll[1])) {
            Validate.inclusiveBetween(1L, 2147483647L, (long)lllllllllllllIIIIIllIlIIlIlIIIIl, AnimationMetadataSectionSerializer.lIllIIIlIIlIIl[AnimationMetadataSectionSerializer.lIllIIIlIIlIll[2]]);
        }
        if (llllIllllIllIlI(lllllllllllllIIIIIllIlIIlIlIIIll.has(AnimationMetadataSectionSerializer.lIllIIIlIIlIIl[AnimationMetadataSectionSerializer.lIllIIIlIIlIll[3]]) ? 1 : 0)) {
            try {
                final JsonArray lllllllllllllIIIIIllIlIIlIIlllll = JsonUtils.getJsonArray(lllllllllllllIIIIIllIlIIlIlIIIll, AnimationMetadataSectionSerializer.lIllIIIlIIlIIl[AnimationMetadataSectionSerializer.lIllIIIlIIlIll[4]]);
                int lllllllllllllIIIIIllIlIIlIIllllI = AnimationMetadataSectionSerializer.lIllIIIlIIlIll[0];
                "".length();
                if (" ".length() != " ".length()) {
                    return null;
                }
                while (!llllIllllIlllII(lllllllllllllIIIIIllIlIIlIIllllI, lllllllllllllIIIIIllIlIIlIIlllll.size())) {
                    final JsonElement lllllllllllllIIIIIllIlIIlIIlllII = lllllllllllllIIIIIllIlIIlIIlllll.get(lllllllllllllIIIIIllIlIIlIIllllI);
                    final AnimationFrame lllllllllllllIIIIIllIlIIlIIllIlI = this.parseAnimationFrame(lllllllllllllIIIIIllIlIIlIIllllI, lllllllllllllIIIIIllIlIIlIIlllII);
                    if (llllIllllIllIll(lllllllllllllIIIIIllIlIIlIIllIlI)) {
                        lllllllllllllIIIIIllIlIIlIlIIlIl.add(lllllllllllllIIIIIllIlIIlIIllIlI);
                        "".length();
                    }
                    ++lllllllllllllIIIIIllIlIIlIIllllI;
                }
                "".length();
                if ("  ".length() == 0) {
                    return null;
                }
            }
            catch (ClassCastException lllllllllllllIIIIIllIlIIlIIllIII) {
                throw new JsonParseException(String.valueOf(new StringBuilder(AnimationMetadataSectionSerializer.lIllIIIlIIlIIl[AnimationMetadataSectionSerializer.lIllIIIlIIlIll[5]]).append(lllllllllllllIIIIIllIlIIlIlIIIll.get(AnimationMetadataSectionSerializer.lIllIIIlIIlIIl[AnimationMetadataSectionSerializer.lIllIIIlIIlIll[6]]))), (Throwable)lllllllllllllIIIIIllIlIIlIIllIII);
            }
        }
        final int lllllllllllllIIIIIllIlIIlIIlIlll = JsonUtils.getInt(lllllllllllllIIIIIllIlIIlIlIIIll, AnimationMetadataSectionSerializer.lIllIIIlIIlIIl[AnimationMetadataSectionSerializer.lIllIIIlIIlIll[7]], AnimationMetadataSectionSerializer.lIllIIIlIIlIll[8]);
        final int lllllllllllllIIIIIllIlIIlIIlIlIl = JsonUtils.getInt(lllllllllllllIIIIIllIlIIlIlIIIll, AnimationMetadataSectionSerializer.lIllIIIlIIlIIl[AnimationMetadataSectionSerializer.lIllIIIlIIlIll[9]], AnimationMetadataSectionSerializer.lIllIIIlIIlIll[8]);
        if (llllIllllIllIIl(lllllllllllllIIIIIllIlIIlIIlIlll, AnimationMetadataSectionSerializer.lIllIIIlIIlIll[8])) {
            Validate.inclusiveBetween(1L, 2147483647L, (long)lllllllllllllIIIIIllIlIIlIIlIlll, AnimationMetadataSectionSerializer.lIllIIIlIIlIIl[AnimationMetadataSectionSerializer.lIllIIIlIIlIll[10]]);
        }
        if (llllIllllIllIIl(lllllllllllllIIIIIllIlIIlIIlIlIl, AnimationMetadataSectionSerializer.lIllIIIlIIlIll[8])) {
            Validate.inclusiveBetween(1L, 2147483647L, (long)lllllllllllllIIIIIllIlIIlIIlIlIl, AnimationMetadataSectionSerializer.lIllIIIlIIlIIl[AnimationMetadataSectionSerializer.lIllIIIlIIlIll[11]]);
        }
        final boolean lllllllllllllIIIIIllIlIIlIIlIIll = JsonUtils.getBoolean(lllllllllllllIIIIIllIlIIlIlIIIll, AnimationMetadataSectionSerializer.lIllIIIlIIlIIl[AnimationMetadataSectionSerializer.lIllIIIlIIlIll[12]], (boolean)(AnimationMetadataSectionSerializer.lIllIIIlIIlIll[0] != 0));
        return new AnimationMetadataSection(lllllllllllllIIIIIllIlIIlIlIIlIl, lllllllllllllIIIIIllIlIIlIIlIlll, lllllllllllllIIIIIllIlIIlIIlIlIl, lllllllllllllIIIIIllIlIIlIlIIIIl, lllllllllllllIIIIIllIlIIlIIlIIll);
    }
    
    private static boolean llllIllllIllllI(final int lllllllllllllIIIIIllIIllllIlIlll, final int lllllllllllllIIIIIllIIllllIlIllI) {
        return lllllllllllllIIIIIllIIllllIlIlll < lllllllllllllIIIIIllIIllllIlIllI;
    }
    
    private static void llllIllllIllIII() {
        (lIllIIIlIIlIll = new int[30])[0] = ((0x2A ^ 0x6E) & ~(0x52 ^ 0x16));
        AnimationMetadataSectionSerializer.lIllIIIlIIlIll[1] = " ".length();
        AnimationMetadataSectionSerializer.lIllIIIlIIlIll[2] = "  ".length();
        AnimationMetadataSectionSerializer.lIllIIIlIIlIll[3] = "   ".length();
        AnimationMetadataSectionSerializer.lIllIIIlIIlIll[4] = (0x10 ^ 0x14);
        AnimationMetadataSectionSerializer.lIllIIIlIIlIll[5] = ("  ".length() ^ (0x48 ^ 0x4F));
        AnimationMetadataSectionSerializer.lIllIIIlIIlIll[6] = (0x74 ^ 0x72);
        AnimationMetadataSectionSerializer.lIllIIIlIIlIll[7] = (0x9B ^ 0x9C);
        AnimationMetadataSectionSerializer.lIllIIIlIIlIll[8] = -" ".length();
        AnimationMetadataSectionSerializer.lIllIIIlIIlIll[9] = (0x8 ^ 0x0);
        AnimationMetadataSectionSerializer.lIllIIIlIIlIll[10] = (0x80 ^ 0x89);
        AnimationMetadataSectionSerializer.lIllIIIlIIlIll[11] = (0x38 ^ 0x10 ^ (0x3A ^ 0x18));
        AnimationMetadataSectionSerializer.lIllIIIlIIlIll[12] = (0x4E ^ 0x45);
        AnimationMetadataSectionSerializer.lIllIIIlIIlIll[13] = (0x7 ^ 0xB);
        AnimationMetadataSectionSerializer.lIllIIIlIIlIll[14] = (0x7C ^ 0x71);
        AnimationMetadataSectionSerializer.lIllIIIlIIlIll[15] = (0x87 ^ 0x89);
        AnimationMetadataSectionSerializer.lIllIIIlIIlIll[16] = (0xA2 ^ 0x8C ^ (0x23 ^ 0x2));
        AnimationMetadataSectionSerializer.lIllIIIlIIlIll[17] = (0xAA ^ 0xBA);
        AnimationMetadataSectionSerializer.lIllIIIlIIlIll[18] = (0x5E ^ 0x4F);
        AnimationMetadataSectionSerializer.lIllIIIlIIlIll[19] = (0x25 ^ 0x37);
        AnimationMetadataSectionSerializer.lIllIIIlIIlIll[20] = (35 + 1 + 30 + 79 ^ 71 + 127 - 69 + 1);
        AnimationMetadataSectionSerializer.lIllIIIlIIlIll[21] = (0x87 ^ 0x9F ^ (0xAF ^ 0xA3));
        AnimationMetadataSectionSerializer.lIllIIIlIIlIll[22] = (0xB8 ^ 0xAD);
        AnimationMetadataSectionSerializer.lIllIIIlIIlIll[23] = (0x83 ^ 0x95);
        AnimationMetadataSectionSerializer.lIllIIIlIIlIll[24] = (0x13 ^ 0x2B ^ (0x1E ^ 0x31));
        AnimationMetadataSectionSerializer.lIllIIIlIIlIll[25] = (0x86 ^ 0x91 ^ (0x12 ^ 0x1D));
        AnimationMetadataSectionSerializer.lIllIIIlIIlIll[26] = (0x22 ^ 0x3B);
        AnimationMetadataSectionSerializer.lIllIIIlIIlIll[27] = (0xC ^ 0x16);
        AnimationMetadataSectionSerializer.lIllIIIlIIlIll[28] = (0x4B ^ 0x35 ^ (0xE2 ^ 0x87));
        AnimationMetadataSectionSerializer.lIllIIIlIIlIll[29] = (130 + 49 - 122 + 76 ^ 147 + 132 - 162 + 36);
    }
    
    private static String llllIllllIlIIII(String lllllllllllllIIIIIllIlIIIIIIlIll, final String lllllllllllllIIIIIllIlIIIIIIlIlI) {
        lllllllllllllIIIIIllIlIIIIIIlIll = new String(Base64.getDecoder().decode(lllllllllllllIIIIIllIlIIIIIIlIll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIIIIIllIlIIIIIIllll = new StringBuilder();
        final char[] lllllllllllllIIIIIllIlIIIIIIlllI = lllllllllllllIIIIIllIlIIIIIIlIlI.toCharArray();
        int lllllllllllllIIIIIllIlIIIIIIllIl = AnimationMetadataSectionSerializer.lIllIIIlIIlIll[0];
        final short lllllllllllllIIIIIllIlIIIIIIIIlI = (Object)lllllllllllllIIIIIllIlIIIIIIlIll.toCharArray();
        final double lllllllllllllIIIIIllIlIIIIIIIIII = lllllllllllllIIIIIllIlIIIIIIIIlI.length;
        int lllllllllllllIIIIIllIIlllllllllI = AnimationMetadataSectionSerializer.lIllIIIlIIlIll[0];
        while (llllIllllIllllI(lllllllllllllIIIIIllIIlllllllllI, (int)lllllllllllllIIIIIllIlIIIIIIIIII)) {
            final char lllllllllllllIIIIIllIlIIIIIlIlIl = lllllllllllllIIIIIllIlIIIIIIIIlI[lllllllllllllIIIIIllIIlllllllllI];
            lllllllllllllIIIIIllIlIIIIIIllll.append((char)(lllllllllllllIIIIIllIlIIIIIlIlIl ^ lllllllllllllIIIIIllIlIIIIIIlllI[lllllllllllllIIIIIllIlIIIIIIllIl % lllllllllllllIIIIIllIlIIIIIIlllI.length]));
            "".length();
            ++lllllllllllllIIIIIllIlIIIIIIllIl;
            ++lllllllllllllIIIIIllIIlllllllllI;
            "".length();
            if ((0x56 ^ 0x53) <= 0) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIIIIIllIlIIIIIIllll);
    }
    
    private static boolean llllIllllIlllIl(final int lllllllllllllIIIIIllIIllllIlIIII) {
        return lllllllllllllIIIIIllIIllllIlIIII > 0;
    }
    
    private static boolean llllIllllIllIlI(final int lllllllllllllIIIIIllIIllllIlIIlI) {
        return lllllllllllllIIIIIllIIllllIlIIlI != 0;
    }
    
    public JsonElement serialize(final AnimationMetadataSection lllllllllllllIIIIIllIlIIIlIlIlII, final Type lllllllllllllIIIIIllIlIIIlIllIlI, final JsonSerializationContext lllllllllllllIIIIIllIlIIIlIllIIl) {
        final JsonObject lllllllllllllIIIIIllIlIIIlIllIII = new JsonObject();
        lllllllllllllIIIIIllIlIIIlIllIII.addProperty(AnimationMetadataSectionSerializer.lIllIIIlIIlIIl[AnimationMetadataSectionSerializer.lIllIIIlIIlIll[22]], (Number)lllllllllllllIIIIIllIlIIIlIlIlII.getFrameTime());
        if (llllIllllIllIIl(lllllllllllllIIIIIllIlIIIlIlIlII.getFrameWidth(), AnimationMetadataSectionSerializer.lIllIIIlIIlIll[8])) {
            lllllllllllllIIIIIllIlIIIlIllIII.addProperty(AnimationMetadataSectionSerializer.lIllIIIlIIlIIl[AnimationMetadataSectionSerializer.lIllIIIlIIlIll[23]], (Number)lllllllllllllIIIIIllIlIIIlIlIlII.getFrameWidth());
        }
        if (llllIllllIllIIl(lllllllllllllIIIIIllIlIIIlIlIlII.getFrameHeight(), AnimationMetadataSectionSerializer.lIllIIIlIIlIll[8])) {
            lllllllllllllIIIIIllIlIIIlIllIII.addProperty(AnimationMetadataSectionSerializer.lIllIIIlIIlIIl[AnimationMetadataSectionSerializer.lIllIIIlIIlIll[24]], (Number)lllllllllllllIIIIIllIlIIIlIlIlII.getFrameHeight());
        }
        if (llllIllllIlllIl(lllllllllllllIIIIIllIlIIIlIlIlII.getFrameCount())) {
            final JsonArray lllllllllllllIIIIIllIlIIIlIlIlll = new JsonArray();
            int lllllllllllllIIIIIllIlIIIlIlIllI = AnimationMetadataSectionSerializer.lIllIIIlIIlIll[0];
            "".length();
            if (-" ".length() >= (0xCD ^ 0x9B ^ (0xFE ^ 0xAC))) {
                return null;
            }
            while (!llllIllllIlllII(lllllllllllllIIIIIllIlIIIlIlIllI, lllllllllllllIIIIIllIlIIIlIlIlII.getFrameCount())) {
                if (llllIllllIllIlI(lllllllllllllIIIIIllIlIIIlIlIlII.frameHasTime(lllllllllllllIIIIIllIlIIIlIlIllI) ? 1 : 0)) {
                    final JsonObject lllllllllllllIIIIIllIlIIIlIlIlIl = new JsonObject();
                    lllllllllllllIIIIIllIlIIIlIlIlIl.addProperty(AnimationMetadataSectionSerializer.lIllIIIlIIlIIl[AnimationMetadataSectionSerializer.lIllIIIlIIlIll[25]], (Number)lllllllllllllIIIIIllIlIIIlIlIlII.getFrameIndex(lllllllllllllIIIIIllIlIIIlIlIllI));
                    lllllllllllllIIIIIllIlIIIlIlIlIl.addProperty(AnimationMetadataSectionSerializer.lIllIIIlIIlIIl[AnimationMetadataSectionSerializer.lIllIIIlIIlIll[26]], (Number)lllllllllllllIIIIIllIlIIIlIlIlII.getFrameTimeSingle(lllllllllllllIIIIIllIlIIIlIlIllI));
                    lllllllllllllIIIIIllIlIIIlIlIlll.add((JsonElement)lllllllllllllIIIIIllIlIIIlIlIlIl);
                    "".length();
                    if (" ".length() != " ".length()) {
                        return null;
                    }
                }
                else {
                    lllllllllllllIIIIIllIlIIIlIlIlll.add((JsonElement)new JsonPrimitive((Number)lllllllllllllIIIIIllIlIIIlIlIlII.getFrameIndex(lllllllllllllIIIIIllIlIIIlIlIllI)));
                }
                ++lllllllllllllIIIIIllIlIIIlIlIllI;
            }
            lllllllllllllIIIIIllIlIIIlIllIII.add(AnimationMetadataSectionSerializer.lIllIIIlIIlIIl[AnimationMetadataSectionSerializer.lIllIIIlIIlIll[27]], (JsonElement)lllllllllllllIIIIIllIlIIIlIlIlll);
        }
        return (JsonElement)lllllllllllllIIIIIllIlIIIlIllIII;
    }
    
    private static void llllIllllIlIIIl() {
        (lIllIIIlIIlIIl = new String[AnimationMetadataSectionSerializer.lIllIIIlIIlIll[29]])[AnimationMetadataSectionSerializer.lIllIIIlIIlIll[0]] = llllIllllIIlllI("W60aTnoDeOQ65yZudI2gWGG3J0vTxOa8", "qVsoO");
        AnimationMetadataSectionSerializer.lIllIIIlIIlIIl[AnimationMetadataSectionSerializer.lIllIIIlIIlIll[1]] = llllIllllIIllll("przGSrX9MG6f4GRQ+ipzmQ==", "TOUhI");
        AnimationMetadataSectionSerializer.lIllIIIlIIlIIl[AnimationMetadataSectionSerializer.lIllIIIlIIlIll[2]] = llllIllllIIlllI("VGxzk80K6YfvtnZIZw6h3LVPpZAH2hH9j/rejUWb+D8=", "KIuEz");
        AnimationMetadataSectionSerializer.lIllIIIlIIlIIl[AnimationMetadataSectionSerializer.lIllIIIlIIlIll[3]] = llllIllllIIllll("c1izxF5tx4k=", "kujvT");
        AnimationMetadataSectionSerializer.lIllIIIlIIlIIl[AnimationMetadataSectionSerializer.lIllIIIlIIlIll[4]] = llllIllllIIlllI("HIuGkrHtSko=", "qTKZR");
        AnimationMetadataSectionSerializer.lIllIIIlIIlIIl[AnimationMetadataSectionSerializer.lIllIIIlIIlIll[5]] = llllIllllIIlllI("lrV3SfaiD6ahmI71dxsQ61d6hVBGjQbR1IQs7UrgZC044AR+4wnDH4Y+wAcjfSc4", "GXgiU");
        AnimationMetadataSectionSerializer.lIllIIIlIIlIIl[AnimationMetadataSectionSerializer.lIllIIIlIIlIll[6]] = llllIllllIlIIII("ABsrPhEV", "fiJSt");
        AnimationMetadataSectionSerializer.lIllIIIlIIlIIl[AnimationMetadataSectionSerializer.lIllIIIlIIlIll[7]] = llllIllllIIllll("S1xgRFdxsiA=", "zTaFO");
        AnimationMetadataSectionSerializer.lIllIIIlIIlIIl[AnimationMetadataSectionSerializer.lIllIIIlIIlIll[9]] = llllIllllIIlllI("I8y5/DaNaXA=", "djIPD");
        AnimationMetadataSectionSerializer.lIllIIIlIIlIIl[AnimationMetadataSectionSerializer.lIllIIIlIIlIll[10]] = llllIllllIIlllI("BwVweJf7VdlImM0TpMtTtA==", "aDGiN");
        AnimationMetadataSectionSerializer.lIllIIIlIIlIIl[AnimationMetadataSectionSerializer.lIllIIIlIIlIll[11]] = llllIllllIlIIII("MwUDEQUTD1UYDBMMHQQ=", "zkupi");
        AnimationMetadataSectionSerializer.lIllIIIlIIlIIl[AnimationMetadataSectionSerializer.lIllIIIlIIlIll[12]] = llllIllllIlIIII("ExwDJyEKHRsjJx8=", "zrwBS");
        AnimationMetadataSectionSerializer.lIllIIIlIIlIIl[AnimationMetadataSectionSerializer.lIllIIIlIIlIll[13]] = llllIllllIlIIII("IRwGNQI0NQ==", "GngXg");
        AnimationMetadataSectionSerializer.lIllIIIlIIlIIl[AnimationMetadataSectionSerializer.lIllIIIlIIlIll[14]] = llllIllllIIlllI("PhUuG9q1nQo=", "LceoF");
        AnimationMetadataSectionSerializer.lIllIIIlIIlIIl[AnimationMetadataSectionSerializer.lIllIIIlIIlIll[15]] = llllIllllIIlllI("NwzolHTUGz8=", "ULENc");
        AnimationMetadataSectionSerializer.lIllIIIlIIlIIl[AnimationMetadataSectionSerializer.lIllIIIlIIlIll[16]] = llllIllllIIlllI("oIjS+5S42WQ=", "FtBLv");
        AnimationMetadataSectionSerializer.lIllIIIlIIlIIl[AnimationMetadataSectionSerializer.lIllIIIlIIlIll[17]] = llllIllllIIlllI("8nlmKahCoeQ=", "iKqVi");
        AnimationMetadataSectionSerializer.lIllIIIlIIlIIl[AnimationMetadataSectionSerializer.lIllIIIlIIlIll[18]] = llllIllllIlIIII("MwQkEg==", "GmIwG");
        AnimationMetadataSectionSerializer.lIllIIIlIIlIIl[AnimationMetadataSectionSerializer.lIllIIIlIIlIll[19]] = llllIllllIIllll("+lUJ1+2PbuUkNykTT3JlCDJedUJ9dSXJ", "pjHQL");
        AnimationMetadataSectionSerializer.lIllIIIlIIlIIl[AnimationMetadataSectionSerializer.lIllIIIlIIlIll[20]] = llllIllllIIlllI("n3ZAarXLk18=", "efLLQ");
        AnimationMetadataSectionSerializer.lIllIIIlIIlIIl[AnimationMetadataSectionSerializer.lIllIIIlIIlIll[21]] = llllIllllIIlllI("d4aWOkLgpAqq3X/lWu0T0H3ti8/9DPo9", "MYrPr");
        AnimationMetadataSectionSerializer.lIllIIIlIIlIIl[AnimationMetadataSectionSerializer.lIllIIIlIIlIll[22]] = llllIllllIlIIII("Kz4UFxQ5JRgf", "MLuzq");
        AnimationMetadataSectionSerializer.lIllIIIlIIlIIl[AnimationMetadataSectionSerializer.lIllIIIlIIlIll[23]] = llllIllllIlIIII("HD4nBBA=", "kWCpx");
        AnimationMetadataSectionSerializer.lIllIIIlIIlIIl[AnimationMetadataSectionSerializer.lIllIIIlIIlIll[24]] = llllIllllIIllll("4N9dmaGRHc8=", "TSLvb");
        AnimationMetadataSectionSerializer.lIllIIIlIIlIIl[AnimationMetadataSectionSerializer.lIllIIIlIIlIll[25]] = llllIllllIIlllI("tNY9B9q2wOk=", "aCjmi");
        AnimationMetadataSectionSerializer.lIllIIIlIIlIIl[AnimationMetadataSectionSerializer.lIllIIIlIIlIll[26]] = llllIllllIlIIII("LQEoAA==", "YhEeR");
        AnimationMetadataSectionSerializer.lIllIIIlIIlIIl[AnimationMetadataSectionSerializer.lIllIIIlIIlIll[27]] = llllIllllIlIIII("CxYSBCke", "mdsiL");
        AnimationMetadataSectionSerializer.lIllIIIlIIlIIl[AnimationMetadataSectionSerializer.lIllIIIlIIlIll[28]] = llllIllllIlIIII("KQIQBzI8BRYE", "HlyjS");
    }
    
    private static String llllIllllIIllll(final String lllllllllllllIIIIIllIlIIIIllIlll, final String lllllllllllllIIIIIllIlIIIIllIlII) {
        try {
            final SecretKeySpec lllllllllllllIIIIIllIlIIIIlllIlI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIIIIIllIlIIIIllIlII.getBytes(StandardCharsets.UTF_8)), AnimationMetadataSectionSerializer.lIllIIIlIIlIll[9]), "DES");
            final Cipher lllllllllllllIIIIIllIlIIIIlllIIl = Cipher.getInstance("DES");
            lllllllllllllIIIIIllIlIIIIlllIIl.init(AnimationMetadataSectionSerializer.lIllIIIlIIlIll[2], lllllllllllllIIIIIllIlIIIIlllIlI);
            return new String(lllllllllllllIIIIIllIlIIIIlllIIl.doFinal(Base64.getDecoder().decode(lllllllllllllIIIIIllIlIIIIllIlll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIIIIllIlIIIIlllIII) {
            lllllllllllllIIIIIllIlIIIIlllIII.printStackTrace();
            return null;
        }
    }
    
    private static boolean llllIllllIllIll(final Object lllllllllllllIIIIIllIIllllIlIlII) {
        return lllllllllllllIIIIIllIIllllIlIlII != null;
    }
}
