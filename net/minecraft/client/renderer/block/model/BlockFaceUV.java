// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.client.renderer.block.model;

import java.util.Arrays;
import com.google.gson.JsonArray;
import net.minecraft.util.JsonUtils;
import com.google.gson.JsonObject;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.security.MessageDigest;
import com.google.gson.JsonParseException;
import com.google.gson.JsonDeserializationContext;
import java.lang.reflect.Type;
import com.google.gson.JsonElement;
import com.google.gson.JsonDeserializer;
import java.nio.charset.StandardCharsets;
import java.util.Base64;

public class BlockFaceUV
{
    private static final /* synthetic */ int[] lIIlIlIIlIIIll;
    public /* synthetic */ float[] uvs;
    public final /* synthetic */ int rotation;
    private static final /* synthetic */ String[] lIIlIlIIlIIIlI;
    
    public float func_178348_a(final int lllllllllllllIIllIlIIlIllIIlIIll) {
        if (llIIlllllIlllIl(this.uvs)) {
            throw new NullPointerException(BlockFaceUV.lIIlIlIIlIIIlI[BlockFaceUV.lIIlIlIIlIIIll[0]]);
        }
        final int lllllllllllllIIllIlIIlIllIIlIlIl = this.func_178347_d(lllllllllllllIIllIlIIlIllIIlIIll);
        float n;
        if (llIIlllllIllllI(lllllllllllllIIllIlIIlIllIIlIlIl) && llIIlllllIlllll(lllllllllllllIIllIlIIlIllIIlIlIl, BlockFaceUV.lIIlIlIIlIIIll[1])) {
            n = this.uvs[BlockFaceUV.lIIlIlIIlIIIll[2]];
            "".length();
            if (" ".length() == "   ".length()) {
                return 0.0f;
            }
        }
        else {
            n = this.uvs[BlockFaceUV.lIIlIlIIlIIIll[0]];
        }
        return n;
    }
    
    private static boolean llIIlllllIlllIl(final Object lllllllllllllIIllIlIIlIlIlIllIIl) {
        return lllllllllllllIIllIlIIlIlIlIllIIl == null;
    }
    
    private static void llIIlllllIlllII() {
        (lIIlIlIIlIIIll = new int[6])[0] = ((0x1A ^ 0x4D) & ~(0x71 ^ 0x26));
        BlockFaceUV.lIIlIlIIlIIIll[1] = " ".length();
        BlockFaceUV.lIIlIlIIlIIIll[2] = "  ".length();
        BlockFaceUV.lIIlIlIIlIIIll[3] = "   ".length();
        BlockFaceUV.lIIlIlIIlIIIll[4] = (0x9B ^ 0x83 ^ (0xE3 ^ 0xA1));
        BlockFaceUV.lIIlIlIIlIIIll[5] = (0x63 ^ 0x35 ^ (0xE ^ 0x5C));
    }
    
    public int func_178345_c(final int lllllllllllllIIllIlIIlIlIlllllIl) {
        return (lllllllllllllIIllIlIIlIlIlllllIl + (BlockFaceUV.lIIlIlIIlIIIll[5] - this.rotation / BlockFaceUV.lIIlIlIIlIIIll[4])) % BlockFaceUV.lIIlIlIIlIIIll[5];
    }
    
    static {
        llIIlllllIlllII();
        llIIlllllIllIlI();
    }
    
    private static void llIIlllllIllIlI() {
        (lIIlIlIIlIIIlI = new String[BlockFaceUV.lIIlIlIIlIIIll[2]])[BlockFaceUV.lIIlIlIIlIIIll[0]] = llIIlllllIllIIl("EgEw", "gwCSf");
        BlockFaceUV.lIIlIlIIlIIIlI[BlockFaceUV.lIIlIlIIlIIIll[1]] = llIIlllllIllIIl("Azog", "vLSYT");
    }
    
    private static String llIIlllllIllIIl(String lllllllllllllIIllIlIIlIlIllIIlll, final String lllllllllllllIIllIlIIlIlIllIIllI) {
        lllllllllllllIIllIlIIlIlIllIIlll = (double)new String(Base64.getDecoder().decode(((String)lllllllllllllIIllIlIIlIlIllIIlll).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIIllIlIIlIlIllIlIlI = new StringBuilder();
        final char[] lllllllllllllIIllIlIIlIlIllIlIIl = lllllllllllllIIllIlIIlIlIllIIllI.toCharArray();
        int lllllllllllllIIllIlIIlIlIllIlIII = BlockFaceUV.lIIlIlIIlIIIll[0];
        final long lllllllllllllIIllIlIIlIlIllIIIlI = (Object)((String)lllllllllllllIIllIlIIlIlIllIIlll).toCharArray();
        final char lllllllllllllIIllIlIIlIlIllIIIIl = (char)lllllllllllllIIllIlIIlIlIllIIIlI.length;
        int lllllllllllllIIllIlIIlIlIllIIIII = BlockFaceUV.lIIlIlIIlIIIll[0];
        while (llIIllllllIIIII(lllllllllllllIIllIlIIlIlIllIIIII, lllllllllllllIIllIlIIlIlIllIIIIl)) {
            final char lllllllllllllIIllIlIIlIlIllIllIl = lllllllllllllIIllIlIIlIlIllIIIlI[lllllllllllllIIllIlIIlIlIllIIIII];
            lllllllllllllIIllIlIIlIlIllIlIlI.append((char)(lllllllllllllIIllIlIIlIlIllIllIl ^ lllllllllllllIIllIlIIlIlIllIlIIl[lllllllllllllIIllIlIIlIlIllIlIII % lllllllllllllIIllIlIIlIlIllIlIIl.length]));
            "".length();
            ++lllllllllllllIIllIlIIlIlIllIlIII;
            ++lllllllllllllIIllIlIIlIlIllIIIII;
            "".length();
            if (" ".length() > "   ".length()) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIIllIlIIlIlIllIlIlI);
    }
    
    public BlockFaceUV(final float[] lllllllllllllIIllIlIIlIllIIlllll, final int lllllllllllllIIllIlIIlIllIIllIll) {
        this.uvs = lllllllllllllIIllIlIIlIllIIlllll;
        this.rotation = lllllllllllllIIllIlIIlIllIIllIll;
    }
    
    private static boolean llIIllllllIIIII(final int lllllllllllllIIllIlIIlIlIlIlllII, final int lllllllllllllIIllIlIIlIlIlIllIll) {
        return lllllllllllllIIllIlIIlIlIlIlllII < lllllllllllllIIllIlIIlIlIlIllIll;
    }
    
    private static boolean llIIlllllIllllI(final int lllllllllllllIIllIlIIlIlIlIlIlll) {
        return lllllllllllllIIllIlIIlIlIlIlIlll != 0;
    }
    
    public float func_178346_b(final int lllllllllllllIIllIlIIlIllIIIlIlI) {
        if (llIIlllllIlllIl(this.uvs)) {
            throw new NullPointerException(BlockFaceUV.lIIlIlIIlIIIlI[BlockFaceUV.lIIlIlIIlIIIll[1]]);
        }
        final int lllllllllllllIIllIlIIlIllIIIllII = this.func_178347_d(lllllllllllllIIllIlIIlIllIIIlIlI);
        float n;
        if (llIIlllllIllllI(lllllllllllllIIllIlIIlIllIIIllII) && llIIlllllIlllll(lllllllllllllIIllIlIIlIllIIIllII, BlockFaceUV.lIIlIlIIlIIIll[3])) {
            n = this.uvs[BlockFaceUV.lIIlIlIIlIIIll[3]];
            "".length();
            if (-"  ".length() > 0) {
                return 0.0f;
            }
        }
        else {
            n = this.uvs[BlockFaceUV.lIIlIlIIlIIIll[1]];
        }
        return n;
    }
    
    private static boolean llIIlllllIlllll(final int lllllllllllllIIllIlIIlIlIlIlIlII, final int lllllllllllllIIllIlIIlIlIlIlIIll) {
        return lllllllllllllIIllIlIIlIlIlIlIlII != lllllllllllllIIllIlIIlIlIlIlIIll;
    }
    
    public void setUvs(final float[] lllllllllllllIIllIlIIlIlIlllIlll) {
        if (llIIlllllIlllIl(this.uvs)) {
            this.uvs = lllllllllllllIIllIlIIlIlIlllIlll;
        }
    }
    
    private int func_178347_d(final int lllllllllllllIIllIlIIlIllIIIIlIl) {
        return (lllllllllllllIIllIlIIlIllIIIIlIl + this.rotation / BlockFaceUV.lIIlIlIIlIIIll[4]) % BlockFaceUV.lIIlIlIIlIIIll[5];
    }
    
    static class Deserializer implements JsonDeserializer<BlockFaceUV>
    {
        private static final /* synthetic */ int[] lIIllIIlllIllI;
        private static final /* synthetic */ String[] lIIllIIllIllIl;
        
        private static String llIlIllllIlllll(String lllllllllllllIIlIlIlllIIllllIIII, final String lllllllllllllIIlIlIlllIIllllIlII) {
            lllllllllllllIIlIlIlllIIllllIIII = new String(Base64.getDecoder().decode(lllllllllllllIIlIlIlllIIllllIIII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
            final StringBuilder lllllllllllllIIlIlIlllIIllllIIll = new StringBuilder();
            final char[] lllllllllllllIIlIlIlllIIllllIIlI = lllllllllllllIIlIlIlllIIllllIlII.toCharArray();
            int lllllllllllllIIlIlIlllIIllllIIIl = Deserializer.lIIllIIlllIllI[0];
            final double lllllllllllllIIlIlIlllIIlllIlIll = (Object)lllllllllllllIIlIlIlllIIllllIIII.toCharArray();
            final Exception lllllllllllllIIlIlIlllIIlllIlIlI = (Exception)lllllllllllllIIlIlIlllIIlllIlIll.length;
            Exception lllllllllllllIIlIlIlllIIlllIlIIl = (Exception)Deserializer.lIIllIIlllIllI[0];
            while (llIlIllllllIlIl((int)lllllllllllllIIlIlIlllIIlllIlIIl, (int)lllllllllllllIIlIlIlllIIlllIlIlI)) {
                final char lllllllllllllIIlIlIlllIIllllIllI = lllllllllllllIIlIlIlllIIlllIlIll[lllllllllllllIIlIlIlllIIlllIlIIl];
                lllllllllllllIIlIlIlllIIllllIIll.append((char)(lllllllllllllIIlIlIlllIIllllIllI ^ lllllllllllllIIlIlIlllIIllllIIlI[lllllllllllllIIlIlIlllIIllllIIIl % lllllllllllllIIlIlIlllIIllllIIlI.length]));
                "".length();
                ++lllllllllllllIIlIlIlllIIllllIIIl;
                ++lllllllllllllIIlIlIlllIIlllIlIIl;
                "".length();
                if ("  ".length() != "  ".length()) {
                    return null;
                }
            }
            return String.valueOf(lllllllllllllIIlIlIlllIIllllIIll);
        }
        
        private static boolean llIlIllllllIIll(final int lllllllllllllIIlIlIlllIIllIIlIII, final int lllllllllllllIIlIlIlllIIllIIIlll) {
            return lllllllllllllIIlIlIlllIIllIIlIII != lllllllllllllIIlIlIlllIIllIIIlll;
        }
        
        private static void llIlIlllllIlllI() {
            (lIIllIIlllIllI = new int[10])[0] = ((0xC7 ^ 0x94) & ~(0x61 ^ 0x32));
            Deserializer.lIIllIIlllIllI[1] = (0x4C ^ 0x11 ^ (0x8B ^ 0x8C));
            Deserializer.lIIllIIlllIllI[2] = "   ".length();
            Deserializer.lIIllIIlllIllI[3] = " ".length();
            Deserializer.lIIllIIlllIllI[4] = "  ".length();
            Deserializer.lIIllIIlllIllI[5] = (88 + 84 - 76 + 33 ^ 27 + 59 - 17 + 64);
            Deserializer.lIIllIIlllIllI[6] = (0xAF ^ 0xAA);
            Deserializer.lIIllIIlllIllI[7] = (105 + 138 - 167 + 107 ^ 3 + 130 + 27 + 17);
            Deserializer.lIIllIIlllIllI[8] = (0xFE ^ 0xBC ^ (0x62 ^ 0x27));
            Deserializer.lIIllIIlllIllI[9] = (0xA9 ^ 0x9D ^ (0x7B ^ 0x47));
        }
        
        private static String llIlIllllIllllI(final String lllllllllllllIIlIlIlllIIlllIIIII, final String lllllllllllllIIlIlIlllIIllIlllIl) {
            try {
                final SecretKeySpec lllllllllllllIIlIlIlllIIlllIIIll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIIlIlIlllIIllIlllIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
                final Cipher lllllllllllllIIlIlIlllIIlllIIIlI = Cipher.getInstance("Blowfish");
                lllllllllllllIIlIlIlllIIlllIIIlI.init(Deserializer.lIIllIIlllIllI[4], lllllllllllllIIlIlIlllIIlllIIIll);
                return new String(lllllllllllllIIlIlIlllIIlllIIIlI.doFinal(Base64.getDecoder().decode(lllllllllllllIIlIlIlllIIlllIIIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
            }
            catch (Exception lllllllllllllIIlIlIlllIIlllIIIIl) {
                lllllllllllllIIlIlIlllIIlllIIIIl.printStackTrace();
                return null;
            }
        }
        
        private float[] parseUV(final JsonObject lllllllllllllIIlIlIlllIlIIIlllII) {
            if (llIlIllllllIIII(lllllllllllllIIlIlIlllIlIIIlllII.has(Deserializer.lIIllIIllIllIl[Deserializer.lIIllIIlllIllI[2]]) ? 1 : 0)) {
                return null;
            }
            final JsonArray lllllllllllllIIlIlIlllIlIIIllIll = JsonUtils.getJsonArray(lllllllllllllIIlIlIlllIlIIIlllII, Deserializer.lIIllIIllIllIl[Deserializer.lIIllIIlllIllI[5]]);
            if (llIlIllllllIIll(lllllllllllllIIlIlIlllIlIIIllIll.size(), Deserializer.lIIllIIlllIllI[5])) {
                throw new JsonParseException(String.valueOf(new StringBuilder(Deserializer.lIIllIIllIllIl[Deserializer.lIIllIIlllIllI[6]]).append(lllllllllllllIIlIlIlllIlIIIllIll.size())));
            }
            final float[] lllllllllllllIIlIlIlllIlIIIllIlI = new float[Deserializer.lIIllIIlllIllI[5]];
            int lllllllllllllIIlIlIlllIlIIIllIIl = Deserializer.lIIllIIlllIllI[0];
            "".length();
            if (" ".length() == 0) {
                return null;
            }
            while (!llIlIllllllIlII(lllllllllllllIIlIlIlllIlIIIllIIl, lllllllllllllIIlIlIlllIlIIIllIlI.length)) {
                lllllllllllllIIlIlIlllIlIIIllIlI[lllllllllllllIIlIlIlllIlIIIllIIl] = JsonUtils.getFloat(lllllllllllllIIlIlIlllIlIIIllIll.get(lllllllllllllIIlIlIlllIlIIIllIIl), String.valueOf(new StringBuilder(Deserializer.lIIllIIllIllIl[Deserializer.lIIllIIlllIllI[7]]).append(lllllllllllllIIlIlIlllIlIIIllIIl).append(Deserializer.lIIllIIllIllIl[Deserializer.lIIllIIlllIllI[8]])));
                ++lllllllllllllIIlIlIlllIlIIIllIIl;
            }
            return lllllllllllllIIlIlIlllIlIIIllIlI;
        }
        
        static {
            llIlIlllllIlllI();
            llIlIlllllIIIII();
        }
        
        private static boolean llIlIllllllIlII(final int lllllllllllllIIlIlIlllIIllIllIII, final int lllllllllllllIIlIlIlllIIllIlIlll) {
            return lllllllllllllIIlIlIlllIIllIllIII >= lllllllllllllIIlIlIlllIIllIlIlll;
        }
        
        private static boolean llIlIllllllIlIl(final int lllllllllllllIIlIlIlllIIllIlIlII, final int lllllllllllllIIlIlIlllIIllIlIIll) {
            return lllllllllllllIIlIlIlllIIllIlIlII < lllllllllllllIIlIlIlllIIllIlIIll;
        }
        
        private static boolean llIlIlllllIllll(final int lllllllllllllIIlIlIlllIIllIIlIll) {
            return lllllllllllllIIlIlIlllIIllIIlIll >= 0;
        }
        
        private static boolean llIlIllllllIIIl(final int lllllllllllllIIlIlIlllIIllIlIIII, final int lllllllllllllIIlIlIlllIIllIIllll) {
            return lllllllllllllIIlIlIlllIIllIlIIII <= lllllllllllllIIlIlIlllIIllIIllll;
        }
        
        public BlockFaceUV deserialize(final JsonElement lllllllllllllIIlIlIlllIlIIlIllII, final Type lllllllllllllIIlIlIlllIlIIllIIlI, final JsonDeserializationContext lllllllllllllIIlIlIlllIlIIllIIIl) throws JsonParseException {
            final JsonObject lllllllllllllIIlIlIlllIlIIllIIII = lllllllllllllIIlIlIlllIlIIlIllII.getAsJsonObject();
            final float[] lllllllllllllIIlIlIlllIlIIlIllll = this.parseUV(lllllllllllllIIlIlIlllIlIIllIIII);
            final int lllllllllllllIIlIlIlllIlIIlIlllI = this.parseRotation(lllllllllllllIIlIlIlllIlIIllIIII);
            return new BlockFaceUV(lllllllllllllIIlIlIlllIlIIlIllll, lllllllllllllIIlIlIlllIlIIlIlllI);
        }
        
        private static void llIlIlllllIIIII() {
            (lIIllIIllIllIl = new String[Deserializer.lIIllIIlllIllI[9]])[Deserializer.lIIllIIlllIllI[0]] = llIlIllllIlllIl("YUF2lfT0JOo/QWOwmW2ZTg==", "pBMhK");
            Deserializer.lIIllIIllIllIl[Deserializer.lIIllIIlllIllI[3]] = llIlIllllIllllI("jQgPEz21JYrr3agsthGImdzO/gtQhhx+", "NnBXA");
            Deserializer.lIIllIIllIllIl[Deserializer.lIIllIIlllIllI[4]] = llIlIllllIlllIl("M0JVaL5i2k1o4/BT9ULZKFwgqb/Ddjng7wAwPWk2EjMgAt/haAo4lQ==", "lMCBV");
            Deserializer.lIIllIIllIllIl[Deserializer.lIIllIIlllIllI[2]] = llIlIllllIlllll("GiY=", "oPlht");
            Deserializer.lIIllIIllIllIl[Deserializer.lIIllIIlllIllI[5]] = llIlIllllIlllll("PC8=", "IYzgc");
            Deserializer.lIIllIIllIllIl[Deserializer.lIIllIIlllIllI[6]] = llIlIllllIlllll("Nj80DzkHIiBKblMyMkosEisxDylfZyIFLx0jfko=", "sGDjZ");
            Deserializer.lIIllIIllIllIl[Deserializer.lIIllIIlllIllI[7]] = llIlIllllIlllll("Oh8P", "OiTPR");
            Deserializer.lIIllIIllIllIl[Deserializer.lIIllIIlllIllI[8]] = llIlIllllIlllll("CQ==", "TYNVn");
        }
        
        private static String llIlIllllIlllIl(final String lllllllllllllIIlIlIlllIlIIIIIlIl, final String lllllllllllllIIlIlIlllIlIIIIIlII) {
            try {
                final SecretKeySpec lllllllllllllIIlIlIlllIlIIIIlIII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIIlIlIlllIlIIIIIlII.getBytes(StandardCharsets.UTF_8)), Deserializer.lIIllIIlllIllI[9]), "DES");
                final Cipher lllllllllllllIIlIlIlllIlIIIIIlll = Cipher.getInstance("DES");
                lllllllllllllIIlIlIlllIlIIIIIlll.init(Deserializer.lIIllIIlllIllI[4], lllllllllllllIIlIlIlllIlIIIIlIII);
                return new String(lllllllllllllIIlIlIlllIlIIIIIlll.doFinal(Base64.getDecoder().decode(lllllllllllllIIlIlIlllIlIIIIIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
            }
            catch (Exception lllllllllllllIIlIlIlllIlIIIIIllI) {
                lllllllllllllIIlIlIlllIlIIIIIllI.printStackTrace();
                return null;
            }
        }
        
        private static boolean llIlIllllllIIII(final int lllllllllllllIIlIlIlllIIllIIllIl) {
            return lllllllllllllIIlIlIlllIIllIIllIl == 0;
        }
        
        protected int parseRotation(final JsonObject lllllllllllllIIlIlIlllIlIIlIIIll) {
            final int lllllllllllllIIlIlIlllIlIIlIIlII = JsonUtils.getInt(lllllllllllllIIlIlIlllIlIIlIIIll, Deserializer.lIIllIIllIllIl[Deserializer.lIIllIIlllIllI[0]], Deserializer.lIIllIIlllIllI[0]);
            if (llIlIlllllIllll(lllllllllllllIIlIlIlllIlIIlIIlII) && llIlIllllllIIII(lllllllllllllIIlIlIlllIlIIlIIlII % Deserializer.lIIllIIlllIllI[1]) && llIlIllllllIIIl(lllllllllllllIIlIlIlllIlIIlIIlII / Deserializer.lIIllIIlllIllI[1], Deserializer.lIIllIIlllIllI[2])) {
                return lllllllllllllIIlIlIlllIlIIlIIlII;
            }
            throw new JsonParseException(String.valueOf(new StringBuilder(Deserializer.lIIllIIllIllIl[Deserializer.lIIllIIlllIllI[3]]).append(lllllllllllllIIlIlIlllIlIIlIIlII).append(Deserializer.lIIllIIllIllIl[Deserializer.lIIllIIlllIllI[4]])));
        }
    }
}
