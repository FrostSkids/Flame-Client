// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.util;

import java.util.Iterator;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.GsonBuilder;
import java.util.Map;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonSerializationContext;
import java.util.Arrays;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonDeserializationContext;
import java.lang.reflect.Type;
import com.google.gson.JsonElement;
import com.google.gson.Gson;
import com.google.gson.JsonSerializer;
import com.google.gson.JsonDeserializer;
import java.util.List;

public interface IChatComponent extends Iterable<IChatComponent>
{
    String getUnformattedTextForChat();
    
    IChatComponent appendText(final String p0);
    
    List<IChatComponent> getSiblings();
    
    String getUnformattedText();
    
    ChatStyle getChatStyle();
    
    String getFormattedText();
    
    IChatComponent appendSibling(final IChatComponent p0);
    
    IChatComponent createCopy();
    
    IChatComponent setChatStyle(final ChatStyle p0);
    
    public static class Serializer implements JsonDeserializer<IChatComponent>, JsonSerializer<IChatComponent>
    {
        private static final /* synthetic */ int[] llllllIIlIIll;
        private static final /* synthetic */ Gson GSON;
        private static final /* synthetic */ String[] llllllIIlIIII;
        
        private static boolean lIlIllllllIllll(final int lllllllllllllIlIlIlIlIlIllIIllII) {
            return lllllllllllllIlIlIlIlIlIllIIllII != 0;
        }
        
        public IChatComponent deserialize(final JsonElement lllllllllllllIlIlIlIlIllIlllIlll, final Type lllllllllllllIlIlIlIlIllIlllIllI, final JsonDeserializationContext lllllllllllllIlIlIlIlIllIlllIlIl) throws JsonParseException {
            if (lIlIllllllIllll(lllllllllllllIlIlIlIlIllIlllIlll.isJsonPrimitive() ? 1 : 0)) {
                return new ChatComponentText(lllllllllllllIlIlIlIlIllIlllIlll.getAsString());
            }
            if (!lIlIlllllllIIII(lllllllllllllIlIlIlIlIllIlllIlll.isJsonObject() ? 1 : 0)) {
                final JsonObject lllllllllllllIlIlIlIlIllIlllIIII = lllllllllllllIlIlIlIlIllIlllIlll.getAsJsonObject();
                IChatComponent lllllllllllllIlIlIlIlIllIllIlIll = null;
                if (lIlIllllllIllll(lllllllllllllIlIlIlIlIllIlllIIII.has(Serializer.llllllIIlIIII[Serializer.llllllIIlIIll[2]]) ? 1 : 0)) {
                    final IChatComponent lllllllllllllIlIlIlIlIllIllIllll = new ChatComponentText(lllllllllllllIlIlIlIlIllIlllIIII.get(Serializer.llllllIIlIIII[Serializer.llllllIIlIIll[3]]).getAsString());
                    "".length();
                    if (null != null) {
                        return null;
                    }
                }
                else if (lIlIllllllIllll(lllllllllllllIlIlIlIlIllIlllIIII.has(Serializer.llllllIIlIIII[Serializer.llllllIIlIIll[4]]) ? 1 : 0)) {
                    final String lllllllllllllIlIlIlIlIllIllIlIlI = lllllllllllllIlIlIlIlIllIlllIIII.get(Serializer.llllllIIlIIII[Serializer.llllllIIlIIll[5]]).getAsString();
                    if (lIlIllllllIllll(lllllllllllllIlIlIlIlIllIlllIIII.has(Serializer.llllllIIlIIII[Serializer.llllllIIlIIll[6]]) ? 1 : 0)) {
                        final JsonArray lllllllllllllIlIlIlIlIllIllIlIIl = lllllllllllllIlIlIlIlIllIlllIIII.getAsJsonArray(Serializer.llllllIIlIIII[Serializer.llllllIIlIIll[7]]);
                        final Object[] lllllllllllllIlIlIlIlIllIllIlIII = new Object[lllllllllllllIlIlIlIlIllIllIlIIl.size()];
                        int lllllllllllllIlIlIlIlIllIllIIlll = Serializer.llllllIIlIIll[0];
                        "".length();
                        if ("   ".length() < 0) {
                            return null;
                        }
                        while (!lIlIlllllllIIlI(lllllllllllllIlIlIlIlIllIllIIlll, lllllllllllllIlIlIlIlIllIllIlIII.length)) {
                            lllllllllllllIlIlIlIlIllIllIlIII[lllllllllllllIlIlIlIlIllIllIIlll] = this.deserialize(lllllllllllllIlIlIlIlIllIllIlIIl.get(lllllllllllllIlIlIlIlIllIllIIlll), lllllllllllllIlIlIlIlIllIlllIllI, lllllllllllllIlIlIlIlIllIlllIlIl);
                            if (lIlIllllllIllll((lllllllllllllIlIlIlIlIllIllIlIII[lllllllllllllIlIlIlIlIllIllIIlll] instanceof ChatComponentText) ? 1 : 0)) {
                                final ChatComponentText lllllllllllllIlIlIlIlIllIllIIllI = (ChatComponentText)lllllllllllllIlIlIlIlIllIllIlIII[lllllllllllllIlIlIlIlIllIllIIlll];
                                if (lIlIllllllIllll(lllllllllllllIlIlIlIlIllIllIIllI.getChatStyle().isEmpty() ? 1 : 0) && lIlIllllllIllll(lllllllllllllIlIlIlIlIllIllIIllI.getSiblings().isEmpty() ? 1 : 0)) {
                                    lllllllllllllIlIlIlIlIllIllIlIII[lllllllllllllIlIlIlIlIllIllIIlll] = lllllllllllllIlIlIlIlIllIllIIllI.getChatComponentText_TextValue();
                                }
                            }
                            ++lllllllllllllIlIlIlIlIllIllIIlll;
                        }
                        final IChatComponent lllllllllllllIlIlIlIlIllIllIlllI = new ChatComponentTranslation(lllllllllllllIlIlIlIlIllIllIlIlI, lllllllllllllIlIlIlIlIllIllIlIII);
                        "".length();
                        if ("  ".length() <= ((0x1C ^ 0x3) & ~(0x64 ^ 0x7B))) {
                            return null;
                        }
                    }
                    else {
                        final IChatComponent lllllllllllllIlIlIlIlIllIllIllIl = new ChatComponentTranslation(lllllllllllllIlIlIlIlIllIllIlIlI, new Object[Serializer.llllllIIlIIll[0]]);
                        "".length();
                        if ((0x7E ^ 0x7A) <= "   ".length()) {
                            return null;
                        }
                    }
                }
                else if (lIlIllllllIllll(lllllllllllllIlIlIlIlIllIlllIIII.has(Serializer.llllllIIlIIII[Serializer.llllllIIlIIll[8]]) ? 1 : 0)) {
                    final JsonObject lllllllllllllIlIlIlIlIllIllIIlIl = lllllllllllllIlIlIlIlIllIlllIIII.getAsJsonObject(Serializer.llllllIIlIIII[Serializer.llllllIIlIIll[9]]);
                    if (!lIlIllllllIllll(lllllllllllllIlIlIlIlIllIllIIlIl.has(Serializer.llllllIIlIIII[Serializer.llllllIIlIIll[10]]) ? 1 : 0) || lIlIlllllllIIII(lllllllllllllIlIlIlIlIllIllIIlIl.has(Serializer.llllllIIlIIII[Serializer.llllllIIlIIll[11]]) ? 1 : 0)) {
                        throw new JsonParseException(Serializer.llllllIIlIIII[Serializer.llllllIIlIIll[12]]);
                    }
                    final IChatComponent lllllllllllllIlIlIlIlIllIllIllII = new ChatComponentScore(JsonUtils.getString(lllllllllllllIlIlIlIlIllIllIIlIl, Serializer.llllllIIlIIII[Serializer.llllllIIlIIll[13]]), JsonUtils.getString(lllllllllllllIlIlIlIlIllIllIIlIl, Serializer.llllllIIlIIII[Serializer.llllllIIlIIll[14]]));
                    if (lIlIllllllIllll(lllllllllllllIlIlIlIlIllIllIIlIl.has(Serializer.llllllIIlIIII[Serializer.llllllIIlIIll[15]]) ? 1 : 0)) {
                        ((ChatComponentScore)lllllllllllllIlIlIlIlIllIllIllII).setValue(JsonUtils.getString(lllllllllllllIlIlIlIlIllIllIIlIl, Serializer.llllllIIlIIII[Serializer.llllllIIlIIll[16]]));
                        "".length();
                        if (((0xD0 ^ 0xBF ^ (0x78 ^ 0x57)) & (0x39 ^ 0x3 ^ (0x11 ^ 0x6B) ^ -" ".length())) < 0) {
                            return null;
                        }
                    }
                }
                else {
                    if (lIlIlllllllIIII(lllllllllllllIlIlIlIlIllIlllIIII.has(Serializer.llllllIIlIIII[Serializer.llllllIIlIIll[17]]) ? 1 : 0)) {
                        throw new JsonParseException(String.valueOf(new StringBuilder(Serializer.llllllIIlIIII[Serializer.llllllIIlIIll[18]]).append(lllllllllllllIlIlIlIlIllIlllIlll.toString()).append(Serializer.llllllIIlIIII[Serializer.llllllIIlIIll[19]])));
                    }
                    lllllllllllllIlIlIlIlIllIllIlIll = new ChatComponentSelector(JsonUtils.getString(lllllllllllllIlIlIlIlIllIlllIIII, Serializer.llllllIIlIIII[Serializer.llllllIIlIIll[20]]));
                }
                if (lIlIllllllIllll(lllllllllllllIlIlIlIlIllIlllIIII.has(Serializer.llllllIIlIIII[Serializer.llllllIIlIIll[21]]) ? 1 : 0)) {
                    final JsonArray lllllllllllllIlIlIlIlIllIllIIlII = lllllllllllllIlIlIlIlIllIlllIIII.getAsJsonArray(Serializer.llllllIIlIIII[Serializer.llllllIIlIIll[22]]);
                    if (lIlIlllllllIIll(lllllllllllllIlIlIlIlIllIllIIlII.size())) {
                        throw new JsonParseException(Serializer.llllllIIlIIII[Serializer.llllllIIlIIll[23]]);
                    }
                    int lllllllllllllIlIlIlIlIllIllIIIll = Serializer.llllllIIlIIll[0];
                    "".length();
                    if (((0x33 ^ 0x70 ^ (0x28 ^ 0x47)) & (30 + 54 - 51 + 98 ^ 55 + 69 + 36 + 15 ^ -" ".length())) != 0x0) {
                        return null;
                    }
                    while (!lIlIlllllllIIlI(lllllllllllllIlIlIlIlIllIllIIIll, lllllllllllllIlIlIlIlIllIllIIlII.size())) {
                        lllllllllllllIlIlIlIlIllIllIlIll.appendSibling(this.deserialize(lllllllllllllIlIlIlIlIllIllIIlII.get(lllllllllllllIlIlIlIlIllIllIIIll), lllllllllllllIlIlIlIlIllIlllIllI, lllllllllllllIlIlIlIlIllIlllIlIl));
                        "".length();
                        ++lllllllllllllIlIlIlIlIllIllIIIll;
                    }
                }
                lllllllllllllIlIlIlIlIllIllIlIll.setChatStyle((ChatStyle)lllllllllllllIlIlIlIlIllIlllIlIl.deserialize(lllllllllllllIlIlIlIlIllIlllIlll, (Type)ChatStyle.class));
                "".length();
                return lllllllllllllIlIlIlIlIllIllIlIll;
            }
            if (!lIlIllllllIllll(lllllllllllllIlIlIlIlIllIlllIlll.isJsonArray() ? 1 : 0)) {
                throw new JsonParseException(String.valueOf(new StringBuilder(Serializer.llllllIIlIIII[Serializer.llllllIIlIIll[0]]).append(lllllllllllllIlIlIlIlIllIlllIlll.toString()).append(Serializer.llllllIIlIIII[Serializer.llllllIIlIIll[1]])));
            }
            final JsonArray lllllllllllllIlIlIlIlIllIlllIlII = lllllllllllllIlIlIlIlIllIlllIlll.getAsJsonArray();
            IChatComponent lllllllllllllIlIlIlIlIllIlllIIll = null;
            final boolean lllllllllllllIlIlIlIlIllIlIllIll = (boolean)lllllllllllllIlIlIlIlIllIlllIlII.iterator();
            "".length();
            if (((0xC3 ^ 0xC4) & ~(0x3A ^ 0x3D)) < 0) {
                return null;
            }
            while (!lIlIlllllllIIII(((Iterator)lllllllllllllIlIlIlIlIllIlIllIll).hasNext() ? 1 : 0)) {
                final JsonElement lllllllllllllIlIlIlIlIllIlllIIlI = ((Iterator<JsonElement>)lllllllllllllIlIlIlIlIllIlIllIll).next();
                final IChatComponent lllllllllllllIlIlIlIlIllIlllIIIl = this.deserialize(lllllllllllllIlIlIlIlIllIlllIIlI, lllllllllllllIlIlIlIlIllIlllIIlI.getClass(), lllllllllllllIlIlIlIlIllIlllIlIl);
                if (lIlIlllllllIIIl(lllllllllllllIlIlIlIlIllIlllIIll)) {
                    lllllllllllllIlIlIlIlIllIlllIIll = lllllllllllllIlIlIlIlIllIlllIIIl;
                    "".length();
                    if (" ".length() >= "  ".length()) {
                        return null;
                    }
                    continue;
                }
                else {
                    lllllllllllllIlIlIlIlIllIlllIIll.appendSibling(lllllllllllllIlIlIlIlIllIlllIIIl);
                    "".length();
                }
            }
            return lllllllllllllIlIlIlIlIllIlllIIll;
        }
        
        private static boolean lIlIlllllllIlII(final Object lllllllllllllIlIlIlIlIlIllIlIIII) {
            return lllllllllllllIlIlIlIlIlIllIlIIII != null;
        }
        
        private static boolean lIlIlllllllIIIl(final Object lllllllllllllIlIlIlIlIlIllIIlllI) {
            return lllllllllllllIlIlIlIlIlIllIIlllI == null;
        }
        
        public static IChatComponent jsonToComponent(final String lllllllllllllIlIlIlIlIllIIIlllII) {
            return (IChatComponent)Serializer.GSON.fromJson(lllllllllllllIlIlIlIlIllIIIlllII, (Class)IChatComponent.class);
        }
        
        private static String lIlIllllllIIIll(final String lllllllllllllIlIlIlIlIlIlllIlIlI, final String lllllllllllllIlIlIlIlIlIlllIlIll) {
            try {
                final SecretKeySpec lllllllllllllIlIlIlIlIlIlllIllll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIlIlIlIlIlIlllIlIll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
                final Cipher lllllllllllllIlIlIlIlIlIlllIlllI = Cipher.getInstance("Blowfish");
                lllllllllllllIlIlIlIlIlIlllIlllI.init(Serializer.llllllIIlIIll[2], lllllllllllllIlIlIlIlIlIlllIllll);
                return new String(lllllllllllllIlIlIlIlIlIlllIlllI.doFinal(Base64.getDecoder().decode(lllllllllllllIlIlIlIlIlIlllIlIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
            }
            catch (Exception lllllllllllllIlIlIlIlIlIlllIllIl) {
                lllllllllllllIlIlIlIlIlIlllIllIl.printStackTrace();
                return null;
            }
        }
        
        private static void lIlIllllllIlllI() {
            (llllllIIlIIll = new int[36])[0] = ((0xAD ^ 0xA5) & ~(0xB0 ^ 0xB8));
            Serializer.llllllIIlIIll[1] = " ".length();
            Serializer.llllllIIlIIll[2] = "  ".length();
            Serializer.llllllIIlIIll[3] = "   ".length();
            Serializer.llllllIIlIIll[4] = (0x3F ^ 0x74 ^ (0x5A ^ 0x15));
            Serializer.llllllIIlIIll[5] = (92 + 26 - 61 + 119 ^ 128 + 34 - 145 + 164);
            Serializer.llllllIIlIIll[6] = (0x7A ^ 0x16 ^ (0xCC ^ 0xA6));
            Serializer.llllllIIlIIll[7] = (0x87 ^ 0xA5 ^ (0x37 ^ 0x12));
            Serializer.llllllIIlIIll[8] = (0xFC ^ 0xBA ^ (0x76 ^ 0x38));
            Serializer.llllllIIlIIll[9] = (0x13 ^ 0x20 ^ (0x2 ^ 0x38));
            Serializer.llllllIIlIIll[10] = (0x77 ^ 0x7D);
            Serializer.llllllIIlIIll[11] = (0x29 ^ 0x22);
            Serializer.llllllIIlIIll[12] = (0xA3 ^ 0xAD ^ "  ".length());
            Serializer.llllllIIlIIll[13] = (0xD ^ 0x0);
            Serializer.llllllIIlIIll[14] = (0x3A ^ 0x34);
            Serializer.llllllIIlIIll[15] = (86 + 119 - 131 + 57 ^ 122 + 75 - 159 + 102);
            Serializer.llllllIIlIIll[16] = (0x46 ^ 0x5D ^ (0xB ^ 0x0));
            Serializer.llllllIIlIIll[17] = (0x58 ^ 0x49);
            Serializer.llllllIIlIIll[18] = (0x51 ^ 0x45 ^ (0x9C ^ 0x9A));
            Serializer.llllllIIlIIll[19] = (0x4D ^ 0x5E);
            Serializer.llllllIIlIIll[20] = (0x0 ^ 0x14);
            Serializer.llllllIIlIIll[21] = (0x75 ^ 0x60);
            Serializer.llllllIIlIIll[22] = (37 + 100 - 89 + 88 ^ 38 + 38 - 74 + 156);
            Serializer.llllllIIlIIll[23] = (0x4A ^ 0x68 ^ (0x4A ^ 0x7F));
            Serializer.llllllIIlIIll[24] = (0xAB ^ 0xB3);
            Serializer.llllllIIlIIll[25] = (0x65 ^ 0x34 ^ (0x67 ^ 0x2F));
            Serializer.llllllIIlIIll[26] = (0x68 ^ 0x67 ^ (0x7A ^ 0x6F));
            Serializer.llllllIIlIIll[27] = (0xA0 ^ 0xBB);
            Serializer.llllllIIlIIll[28] = (0xDD ^ 0xB7 ^ (0x61 ^ 0x17));
            Serializer.llllllIIlIIll[29] = (0x42 ^ 0x6C ^ (0x1B ^ 0x28));
            Serializer.llllllIIlIIll[30] = (0x30 ^ 0x2E);
            Serializer.llllllIIlIIll[31] = (0x77 ^ 0x68);
            Serializer.llllllIIlIIll[32] = (0x1D ^ 0x3D);
            Serializer.llllllIIlIIll[33] = (0x11 ^ 0x30);
            Serializer.llllllIIlIIll[34] = (0x67 ^ 0x45);
            Serializer.llllllIIlIIll[35] = (0xB0 ^ 0x93);
        }
        
        private static void lIlIllllllIlIll() {
            (llllllIIlIIII = new String[Serializer.llllllIIlIIll[35]])[Serializer.llllllIIlIIll[0]] = lIlIllllllIIIIl("DzYtfSBrMi01I2sxLC10PzZjLiE5N2M=", "KYCZT");
            Serializer.llllllIIlIIII[Serializer.llllllIIlIIll[1]] = lIlIllllllIIIIl("UA0KFx1QBUQgHR0UCw0XHhA=", "pddcr");
            Serializer.llllllIIlIIII[Serializer.llllllIIlIIll[2]] = lIlIllllllIIIIl("Gz06IA==", "oXBTc");
            Serializer.llllllIIlIIII[Serializer.llllllIIlIIll[3]] = lIlIllllllIIIlI("Zz5PsQeQoyU=", "uCbbC");
            Serializer.llllllIIlIIII[Serializer.llllllIIlIIll[4]] = lIlIllllllIIIIl("IzECOgA7Ihcx", "WCcTs");
            Serializer.llllllIIlIIII[Serializer.llllllIIlIIll[5]] = lIlIllllllIIIIl("GAY7NgkAFS49", "ltZXz");
            Serializer.llllllIIlIIII[Serializer.llllllIIlIIll[6]] = lIlIllllllIIIIl("MB4MBA==", "Gwxlx");
            Serializer.llllllIIlIIII[Serializer.llllllIIlIIll[7]] = lIlIllllllIIIIl("ISQdLQ==", "VMiEY");
            Serializer.llllllIIlIIII[Serializer.llllllIIlIIll[8]] = lIlIllllllIIIIl("OQojGyk=", "JiLiL");
            Serializer.llllllIIlIIII[Serializer.llllllIIlIIll[9]] = lIlIllllllIIIll("qasdaBp/xzY=", "kHnla");
            Serializer.llllllIIlIIII[Serializer.llllllIIlIIll[10]] = lIlIllllllIIIll("c4F/05GAwcg=", "osgpo");
            Serializer.llllllIIlIIII[Serializer.llllllIIlIIll[11]] = lIlIllllllIIIlI("bDWwKBBdZ47waDQZcTj8Cg==", "lIutl");
            Serializer.llllllIIlIIII[Serializer.llllllIIlIIll[12]] = lIlIllllllIIIlI("HGKpfibUZRcHDWG9VfLObQc1/jgH0+bWsSeRQvCNz26CSOgJKcfb3+obw1Z8LHHYopgbcm6O5PA=", "wGphY");
            Serializer.llllllIIlIIII[Serializer.llllllIIlIIll[13]] = lIlIllllllIIIIl("ABI7IA==", "nsVEX");
            Serializer.llllllIIlIIII[Serializer.llllllIIlIIll[14]] = lIlIllllllIIIll("/00DThPqRjhz7qdeiNUmNA==", "zLAqM");
            Serializer.llllllIIlIIII[Serializer.llllllIIlIIll[15]] = lIlIllllllIIIIl("JwUNGyk=", "QdanL");
            Serializer.llllllIIlIIII[Serializer.llllllIIlIIll[16]] = lIlIllllllIIIll("8Os4hGFrd1k=", "qrMiP");
            Serializer.llllllIIlIIII[Serializer.llllllIIlIIll[17]] = lIlIllllllIIIlI("BNOXIEGOwc9fFKFav+rp1g==", "VmdXx");
            Serializer.llllllIIlIIII[Serializer.llllllIIlIIll[18]] = lIlIllllllIIIIl("JwEmaiBDBSYiI0MGJzp0FwFoOSERAGg=", "cnHMT");
            Serializer.llllllIIlIIII[Serializer.llllllIIlIIll[19]] = lIlIllllllIIIll("3h8a6ipJh8SLDrSLx62AApk6Z58IZBdG", "LRnxH");
            Serializer.llllllIIlIIII[Serializer.llllllIIlIIll[20]] = lIlIllllllIIIlI("3MbPFvF4Lw2eb+4L+EL1ZQ==", "nYNUR");
            Serializer.llllllIIlIIII[Serializer.llllllIIlIIll[21]] = lIlIllllllIIIll("qFgtzuTYYAA=", "aTvfU");
            Serializer.llllllIIlIIII[Serializer.llllllIIlIIll[22]] = lIlIllllllIIIll("/Iagls8Sclg=", "Pgypq");
            Serializer.llllllIIlIIII[Serializer.llllllIIlIIll[23]] = lIlIllllllIIIll("oO+7UVPzkNYsubcLjJXLLdEP6swFDDP2MjZ7VKpXs0dmJjiHMkfqCQ==", "dvQBO");
            Serializer.llllllIIlIIII[Serializer.llllllIIlIIll[24]] = lIlIllllllIIIlI("/2LTSWGj5Rg=", "mHnzZ");
            Serializer.llllllIIlIIII[Serializer.llllllIIlIIll[25]] = lIlIllllllIIIll("vpbbPi/gVgQ=", "gaUeo");
            Serializer.llllllIIlIIII[Serializer.llllllIIlIIll[26]] = lIlIllllllIIIll("/4IjCPoV0k0YFnxOHXDuZg==", "KMdVK");
            Serializer.llllllIIlIIII[Serializer.llllllIIlIIll[27]] = lIlIllllllIIIIl("PT0gGw==", "JTTsF");
            Serializer.llllllIIlIIII[Serializer.llllllIIlIIll[28]] = lIlIllllllIIIlI("1ZWQMxYZOfU=", "lIHCN");
            Serializer.llllllIIlIIII[Serializer.llllllIIlIIll[29]] = lIlIllllllIIIll("Hh4Rs9/MdZ2eWLqhMlZAeA==", "UkgYt");
            Serializer.llllllIIlIIII[Serializer.llllllIIlIIll[30]] = lIlIllllllIIIIl("MRIHFxc=", "Gskbr");
            Serializer.llllllIIlIIII[Serializer.llllllIIlIIll[31]] = lIlIllllllIIIIl("ISkcOBM=", "RJsJv");
            Serializer.llllllIIlIIII[Serializer.llllllIIlIIll[32]] = lIlIllllllIIIIl("IiMGSTNGJwYBMEYkBxlnEiNIHSIUJQkCLhwpSA==", "fLhnG");
            Serializer.llllllIIlIIII[Serializer.llllllIIlIIll[33]] = lIlIllllllIIIll("82I7BQDXWtQcFoFpVgFEsQ==", "fXSvM");
            Serializer.llllllIIlIIII[Serializer.llllllIIlIIll[34]] = lIlIllllllIIIIl("BQ8gNwwCBT4=", "vjLRo");
        }
        
        private static String lIlIllllllIIIlI(final String lllllllllllllIlIlIlIlIlIllIlllIl, final String lllllllllllllIlIlIlIlIlIllIlllII) {
            try {
                final SecretKeySpec lllllllllllllIlIlIlIlIlIlllIIIlI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIlIlIlIlIlIllIlllII.getBytes(StandardCharsets.UTF_8)), Serializer.llllllIIlIIll[8]), "DES");
                final Cipher lllllllllllllIlIlIlIlIlIlllIIIIl = Cipher.getInstance("DES");
                lllllllllllllIlIlIlIlIlIlllIIIIl.init(Serializer.llllllIIlIIll[2], lllllllllllllIlIlIlIlIlIlllIIIlI);
                return new String(lllllllllllllIlIlIlIlIlIlllIIIIl.doFinal(Base64.getDecoder().decode(lllllllllllllIlIlIlIlIlIllIlllIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
            }
            catch (Exception lllllllllllllIlIlIlIlIlIlllIIIII) {
                lllllllllllllIlIlIlIlIlIlllIIIII.printStackTrace();
                return null;
            }
        }
        
        private static boolean lIlIlllllllIIlI(final int lllllllllllllIlIlIlIlIlIllIlIlll, final int lllllllllllllIlIlIlIlIlIllIlIllI) {
            return lllllllllllllIlIlIlIlIlIllIlIlll >= lllllllllllllIlIlIlIlIlIllIlIllI;
        }
        
        public JsonElement serialize(final IChatComponent lllllllllllllIlIlIlIlIllIIllIlll, final Type lllllllllllllIlIlIlIlIllIIllIllI, final JsonSerializationContext lllllllllllllIlIlIlIlIllIIlIlIIl) {
            if (lIlIllllllIllll((lllllllllllllIlIlIlIlIllIIllIlll instanceof ChatComponentText) ? 1 : 0) && lIlIllllllIllll(lllllllllllllIlIlIlIlIllIIllIlll.getChatStyle().isEmpty() ? 1 : 0) && lIlIllllllIllll(lllllllllllllIlIlIlIlIllIIllIlll.getSiblings().isEmpty() ? 1 : 0)) {
                return (JsonElement)new JsonPrimitive(((ChatComponentText)lllllllllllllIlIlIlIlIllIIllIlll).getChatComponentText_TextValue());
            }
            final JsonObject lllllllllllllIlIlIlIlIllIIllIlII = new JsonObject();
            if (lIlIlllllllIIII(lllllllllllllIlIlIlIlIllIIllIlll.getChatStyle().isEmpty() ? 1 : 0)) {
                this.serializeChatStyle(lllllllllllllIlIlIlIlIllIIllIlll.getChatStyle(), lllllllllllllIlIlIlIlIllIIllIlII, lllllllllllllIlIlIlIlIllIIlIlIIl);
            }
            if (lIlIlllllllIIII(lllllllllllllIlIlIlIlIllIIllIlll.getSiblings().isEmpty() ? 1 : 0)) {
                final JsonArray lllllllllllllIlIlIlIlIllIIllIIll = new JsonArray();
                final Exception lllllllllllllIlIlIlIlIllIIlIIlIl = (Exception)lllllllllllllIlIlIlIlIllIIllIlll.getSiblings().iterator();
                "".length();
                if ((0x73 ^ 0x23 ^ (0x30 ^ 0x64)) <= "  ".length()) {
                    return null;
                }
                while (!lIlIlllllllIIII(((Iterator)lllllllllllllIlIlIlIlIllIIlIIlIl).hasNext() ? 1 : 0)) {
                    final IChatComponent lllllllllllllIlIlIlIlIllIIllIIlI = ((Iterator<IChatComponent>)lllllllllllllIlIlIlIlIllIIlIIlIl).next();
                    lllllllllllllIlIlIlIlIllIIllIIll.add(this.serialize(lllllllllllllIlIlIlIlIllIIllIIlI, lllllllllllllIlIlIlIlIllIIllIIlI.getClass(), lllllllllllllIlIlIlIlIllIIlIlIIl));
                }
                lllllllllllllIlIlIlIlIllIIllIlII.add(Serializer.llllllIIlIIII[Serializer.llllllIIlIIll[24]], (JsonElement)lllllllllllllIlIlIlIlIllIIllIIll);
            }
            if (lIlIllllllIllll((lllllllllllllIlIlIlIlIllIIllIlll instanceof ChatComponentText) ? 1 : 0)) {
                lllllllllllllIlIlIlIlIllIIllIlII.addProperty(Serializer.llllllIIlIIII[Serializer.llllllIIlIIll[25]], ((ChatComponentText)lllllllllllllIlIlIlIlIllIIllIlll).getChatComponentText_TextValue());
                "".length();
                if (-"  ".length() >= 0) {
                    return null;
                }
            }
            else if (lIlIllllllIllll((lllllllllllllIlIlIlIlIllIIllIlll instanceof ChatComponentTranslation) ? 1 : 0)) {
                final ChatComponentTranslation lllllllllllllIlIlIlIlIllIIllIIIl = (ChatComponentTranslation)lllllllllllllIlIlIlIlIllIIllIlll;
                lllllllllllllIlIlIlIlIllIIllIlII.addProperty(Serializer.llllllIIlIIII[Serializer.llllllIIlIIll[26]], lllllllllllllIlIlIlIlIllIIllIIIl.getKey());
                if (lIlIlllllllIlII(lllllllllllllIlIlIlIlIllIIllIIIl.getFormatArgs()) && lIlIlllllllIlIl(lllllllllllllIlIlIlIlIllIIllIIIl.getFormatArgs().length)) {
                    final JsonArray lllllllllllllIlIlIlIlIllIIllIIII = new JsonArray();
                    final boolean lllllllllllllIlIlIlIlIllIIlIIIlI;
                    final byte lllllllllllllIlIlIlIlIllIIlIIIll = (byte)((Object[])(Object)(lllllllllllllIlIlIlIlIllIIlIIIlI = (boolean)lllllllllllllIlIlIlIlIllIIllIIIl.getFormatArgs())).length;
                    short lllllllllllllIlIlIlIlIllIIlIIlII = (short)Serializer.llllllIIlIIll[0];
                    "".length();
                    if (("  ".length() & ~"  ".length()) != 0x0) {
                        return null;
                    }
                    while (!lIlIlllllllIIlI(lllllllllllllIlIlIlIlIllIIlIIlII, lllllllllllllIlIlIlIlIllIIlIIIll)) {
                        final Object lllllllllllllIlIlIlIlIllIIlIllll = lllllllllllllIlIlIlIlIllIIlIIIlI[lllllllllllllIlIlIlIlIllIIlIIlII];
                        if (lIlIllllllIllll((lllllllllllllIlIlIlIlIllIIlIllll instanceof IChatComponent) ? 1 : 0)) {
                            lllllllllllllIlIlIlIlIllIIllIIII.add(this.serialize((IChatComponent)lllllllllllllIlIlIlIlIllIIlIllll, lllllllllllllIlIlIlIlIllIIlIllll.getClass(), lllllllllllllIlIlIlIlIllIIlIlIIl));
                            "".length();
                            if (null != null) {
                                return null;
                            }
                        }
                        else {
                            lllllllllllllIlIlIlIlIllIIllIIII.add((JsonElement)new JsonPrimitive(String.valueOf(lllllllllllllIlIlIlIlIllIIlIllll)));
                        }
                        ++lllllllllllllIlIlIlIlIllIIlIIlII;
                    }
                    lllllllllllllIlIlIlIlIllIIllIlII.add(Serializer.llllllIIlIIII[Serializer.llllllIIlIIll[27]], (JsonElement)lllllllllllllIlIlIlIlIllIIllIIII);
                    "".length();
                    if (null != null) {
                        return null;
                    }
                }
            }
            else if (lIlIllllllIllll((lllllllllllllIlIlIlIlIllIIllIlll instanceof ChatComponentScore) ? 1 : 0)) {
                final ChatComponentScore lllllllllllllIlIlIlIlIllIIlIlllI = (ChatComponentScore)lllllllllllllIlIlIlIlIllIIllIlll;
                final JsonObject lllllllllllllIlIlIlIlIllIIlIllIl = new JsonObject();
                lllllllllllllIlIlIlIlIllIIlIllIl.addProperty(Serializer.llllllIIlIIII[Serializer.llllllIIlIIll[28]], lllllllllllllIlIlIlIlIllIIlIlllI.getName());
                lllllllllllllIlIlIlIlIllIIlIllIl.addProperty(Serializer.llllllIIlIIII[Serializer.llllllIIlIIll[29]], lllllllllllllIlIlIlIlIllIIlIlllI.getObjective());
                lllllllllllllIlIlIlIlIllIIlIllIl.addProperty(Serializer.llllllIIlIIII[Serializer.llllllIIlIIll[30]], lllllllllllllIlIlIlIlIllIIlIlllI.getUnformattedTextForChat());
                lllllllllllllIlIlIlIlIllIIllIlII.add(Serializer.llllllIIlIIII[Serializer.llllllIIlIIll[31]], (JsonElement)lllllllllllllIlIlIlIlIllIIlIllIl);
                "".length();
                if ((0xBC ^ 0xB8) == "  ".length()) {
                    return null;
                }
            }
            else {
                if (lIlIlllllllIIII((lllllllllllllIlIlIlIlIllIIllIlll instanceof ChatComponentSelector) ? 1 : 0)) {
                    throw new IllegalArgumentException(String.valueOf(new StringBuilder(Serializer.llllllIIlIIII[Serializer.llllllIIlIIll[32]]).append(lllllllllllllIlIlIlIlIllIIllIlll).append(Serializer.llllllIIlIIII[Serializer.llllllIIlIIll[33]])));
                }
                final ChatComponentSelector lllllllllllllIlIlIlIlIllIIlIllII = (ChatComponentSelector)lllllllllllllIlIlIlIlIllIIllIlll;
                lllllllllllllIlIlIlIlIllIIllIlII.addProperty(Serializer.llllllIIlIIII[Serializer.llllllIIlIIll[34]], lllllllllllllIlIlIlIlIllIIlIllII.getSelector());
            }
            return (JsonElement)lllllllllllllIlIlIlIlIllIIllIlII;
        }
        
        private static boolean lIlIlllllllIIII(final int lllllllllllllIlIlIlIlIlIllIIlIlI) {
            return lllllllllllllIlIlIlIlIlIllIIlIlI == 0;
        }
        
        private static boolean lIlIlllllllIlIl(final int lllllllllllllIlIlIlIlIlIllIIIllI) {
            return lllllllllllllIlIlIlIlIlIllIIIllI > 0;
        }
        
        private static boolean lIlIlllllllIllI(final int lllllllllllllIlIlIlIlIlIllIlIIll, final int lllllllllllllIlIlIlIlIlIllIlIIlI) {
            return lllllllllllllIlIlIlIlIlIllIlIIll < lllllllllllllIlIlIlIlIlIllIlIIlI;
        }
        
        private static String lIlIllllllIIIIl(String lllllllllllllIlIlIlIlIlIllllllII, final String lllllllllllllIlIlIlIlIlIlllllIll) {
            lllllllllllllIlIlIlIlIlIllllllII = new String(Base64.getDecoder().decode(lllllllllllllIlIlIlIlIlIllllllII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
            final StringBuilder lllllllllllllIlIlIlIlIlIllllllll = new StringBuilder();
            final char[] lllllllllllllIlIlIlIlIlIlllllllI = lllllllllllllIlIlIlIlIlIlllllIll.toCharArray();
            int lllllllllllllIlIlIlIlIlIllllllIl = Serializer.llllllIIlIIll[0];
            final float lllllllllllllIlIlIlIlIlIllllIlll = (Object)lllllllllllllIlIlIlIlIlIllllllII.toCharArray();
            final byte lllllllllllllIlIlIlIlIlIllllIllI = (byte)lllllllllllllIlIlIlIlIlIllllIlll.length;
            char lllllllllllllIlIlIlIlIlIllllIlIl = (char)Serializer.llllllIIlIIll[0];
            while (lIlIlllllllIllI(lllllllllllllIlIlIlIlIlIllllIlIl, lllllllllllllIlIlIlIlIlIllllIllI)) {
                final char lllllllllllllIlIlIlIlIllIIIIIIlI = lllllllllllllIlIlIlIlIlIllllIlll[lllllllllllllIlIlIlIlIlIllllIlIl];
                lllllllllllllIlIlIlIlIlIllllllll.append((char)(lllllllllllllIlIlIlIlIllIIIIIIlI ^ lllllllllllllIlIlIlIlIlIlllllllI[lllllllllllllIlIlIlIlIlIllllllIl % lllllllllllllIlIlIlIlIlIlllllllI.length]));
                "".length();
                ++lllllllllllllIlIlIlIlIlIllllllIl;
                ++lllllllllllllIlIlIlIlIlIllllIlIl;
                "".length();
                if (((0x82 ^ 0xBF) & ~(0x11 ^ 0x2C)) != 0x0) {
                    return null;
                }
            }
            return String.valueOf(lllllllllllllIlIlIlIlIlIllllllll);
        }
        
        private void serializeChatStyle(final ChatStyle lllllllllllllIlIlIlIlIllIlIIllll, final JsonObject lllllllllllllIlIlIlIlIllIlIIlIII, final JsonSerializationContext lllllllllllllIlIlIlIlIllIlIIllIl) {
            final JsonElement lllllllllllllIlIlIlIlIllIlIIllII = lllllllllllllIlIlIlIlIllIlIIllIl.serialize((Object)lllllllllllllIlIlIlIlIllIlIIllll);
            if (lIlIllllllIllll(lllllllllllllIlIlIlIlIllIlIIllII.isJsonObject() ? 1 : 0)) {
                final JsonObject lllllllllllllIlIlIlIlIllIlIIlIll = (JsonObject)lllllllllllllIlIlIlIlIllIlIIllII;
                final char lllllllllllllIlIlIlIlIllIlIIIIll = (char)lllllllllllllIlIlIlIlIllIlIIlIll.entrySet().iterator();
                "".length();
                if (null != null) {
                    return;
                }
                while (!lIlIlllllllIIII(((Iterator)lllllllllllllIlIlIlIlIllIlIIIIll).hasNext() ? 1 : 0)) {
                    final Map.Entry<String, JsonElement> lllllllllllllIlIlIlIlIllIlIIlIlI = ((Iterator<Map.Entry<String, JsonElement>>)lllllllllllllIlIlIlIlIllIlIIIIll).next();
                    lllllllllllllIlIlIlIlIllIlIIlIII.add((String)lllllllllllllIlIlIlIlIllIlIIlIlI.getKey(), (JsonElement)lllllllllllllIlIlIlIlIllIlIIlIlI.getValue());
                }
            }
        }
        
        private static boolean lIlIlllllllIIll(final int lllllllllllllIlIlIlIlIlIllIIlIII) {
            return lllllllllllllIlIlIlIlIlIllIIlIII <= 0;
        }
        
        static {
            lIlIllllllIlllI();
            lIlIllllllIlIll();
            final GsonBuilder lllllllllllllIlIlIlIlIlllIIIlIII = new GsonBuilder();
            lllllllllllllIlIlIlIlIlllIIIlIII.registerTypeHierarchyAdapter((Class)IChatComponent.class, (Object)new Serializer());
            "".length();
            lllllllllllllIlIlIlIlIlllIIIlIII.registerTypeHierarchyAdapter((Class)ChatStyle.class, (Object)new ChatStyle.Serializer());
            "".length();
            lllllllllllllIlIlIlIlIlllIIIlIII.registerTypeAdapterFactory((TypeAdapterFactory)new EnumTypeAdapterFactory());
            "".length();
            GSON = lllllllllllllIlIlIlIlIlllIIIlIII.create();
        }
        
        public static String componentToJson(final IChatComponent lllllllllllllIlIlIlIlIllIIIlllll) {
            return Serializer.GSON.toJson((Object)lllllllllllllIlIlIlIlIllIIIlllll);
        }
    }
}
