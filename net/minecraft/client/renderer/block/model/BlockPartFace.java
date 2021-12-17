// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.client.renderer.block.model;

import java.util.Arrays;
import com.google.gson.JsonParseException;
import com.google.gson.JsonDeserializationContext;
import java.lang.reflect.Type;
import com.google.gson.JsonElement;
import net.minecraft.util.JsonUtils;
import com.google.gson.JsonObject;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import com.google.gson.JsonDeserializer;
import net.minecraft.util.EnumFacing;

public class BlockPartFace
{
    public final /* synthetic */ BlockFaceUV blockFaceUV;
    public final /* synthetic */ EnumFacing cullFace;
    public final /* synthetic */ int tintIndex;
    public final /* synthetic */ String texture;
    
    public BlockPartFace(final EnumFacing lllllllllllllIIlllIllllllIllIIlI, final int lllllllllllllIIlllIllllllIllIIIl, final String lllllllllllllIIlllIllllllIllIIII, final BlockFaceUV lllllllllllllIIlllIllllllIllIlII) {
        this.cullFace = lllllllllllllIIlllIllllllIllIIlI;
        this.tintIndex = lllllllllllllIIlllIllllllIllIIIl;
        this.texture = lllllllllllllIIlllIllllllIllIIII;
        this.blockFaceUV = lllllllllllllIIlllIllllllIllIlII;
    }
    
    static {
        FACING_DEFAULT = null;
    }
    
    static class Deserializer implements JsonDeserializer<BlockPartFace>
    {
        private static final /* synthetic */ String[] llIllIlIlIllIl;
        private static final /* synthetic */ int[] llIllIlIlIlllI;
        
        private static String lIIlIllllllIIIlI(final String llllllllllllIllIIllIlIllIlIIllII, final String llllllllllllIllIIllIlIllIlIIllIl) {
            try {
                final SecretKeySpec llllllllllllIllIIllIlIllIlIlIIIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIllIIllIlIllIlIIllIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
                final Cipher llllllllllllIllIIllIlIllIlIlIIII = Cipher.getInstance("Blowfish");
                llllllllllllIllIIllIlIllIlIlIIII.init(Deserializer.llIllIlIlIlllI[3], llllllllllllIllIIllIlIllIlIlIIIl);
                return new String(llllllllllllIllIIllIlIllIlIlIIII.doFinal(Base64.getDecoder().decode(llllllllllllIllIIllIlIllIlIIllII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
            }
            catch (Exception llllllllllllIllIIllIlIllIlIIllll) {
                llllllllllllIllIIllIlIllIlIIllll.printStackTrace();
                return null;
            }
        }
        
        private EnumFacing parseCullFace(final JsonObject llllllllllllIllIIllIlIllIllllIIl) {
            final String llllllllllllIllIIllIlIllIllllIII = JsonUtils.getString(llllllllllllIllIIllIlIllIllllIIl, Deserializer.llIllIlIlIllIl[Deserializer.llIllIlIlIlllI[3]], Deserializer.llIllIlIlIllIl[Deserializer.llIllIlIlIlllI[4]]);
            return EnumFacing.byName(llllllllllllIllIIllIlIllIllllIII);
        }
        
        protected int parseTintIndex(final JsonObject llllllllllllIllIIllIlIlllIIIIIIl) {
            return JsonUtils.getInt(llllllllllllIllIIllIlIlllIIIIIIl, Deserializer.llIllIlIlIllIl[Deserializer.llIllIlIlIlllI[0]], Deserializer.llIllIlIlIlllI[1]);
        }
        
        public BlockPartFace deserialize(final JsonElement llllllllllllIllIIllIlIlllIIIlIll, final Type llllllllllllIllIIllIlIlllIIlIIll, final JsonDeserializationContext llllllllllllIllIIllIlIlllIIIlIlI) throws JsonParseException {
            final JsonObject llllllllllllIllIIllIlIlllIIlIIIl = llllllllllllIllIIllIlIlllIIIlIll.getAsJsonObject();
            final EnumFacing llllllllllllIllIIllIlIlllIIlIIII = this.parseCullFace(llllllllllllIllIIllIlIlllIIlIIIl);
            final int llllllllllllIllIIllIlIlllIIIllll = this.parseTintIndex(llllllllllllIllIIllIlIlllIIlIIIl);
            final String llllllllllllIllIIllIlIlllIIIlllI = this.parseTexture(llllllllllllIllIIllIlIlllIIlIIIl);
            final BlockFaceUV llllllllllllIllIIllIlIlllIIIllIl = (BlockFaceUV)llllllllllllIllIIllIlIlllIIIlIlI.deserialize((JsonElement)llllllllllllIllIIllIlIlllIIlIIIl, (Type)BlockFaceUV.class);
            return new BlockPartFace(llllllllllllIllIIllIlIlllIIlIIII, llllllllllllIllIIllIlIlllIIIllll, llllllllllllIllIIllIlIlllIIIlllI, llllllllllllIllIIllIlIlllIIIllIl);
        }
        
        private static void lIIlIllllllIIlIl() {
            (llIllIlIlIllIl = new String[Deserializer.llIllIlIlIlllI[5]])[Deserializer.llIllIlIlIlllI[0]] = lIIlIllllllIIIlI("Tuzi4IuEKXXJFyMhTMXBCw==", "oLmRL");
            Deserializer.llIllIlIlIllIl[Deserializer.llIllIlIlIlllI[2]] = lIIlIllllllIIIll("6v+eA4gOQg8=", "RTBkj");
            Deserializer.llIllIlIlIllIl[Deserializer.llIllIlIlIlllI[3]] = lIIlIllllllIIIlI("4ELrWCrL6tMPHMSv3Qwdxw==", "qpjdw");
            Deserializer.llIllIlIlIllIl[Deserializer.llIllIlIlIlllI[4]] = lIIlIllllllIIlII("", "KYyfd");
        }
        
        private static String lIIlIllllllIIlII(String llllllllllllIllIIllIlIllIlIllllI, final String llllllllllllIllIIllIlIllIlIlllIl) {
            llllllllllllIllIIllIlIllIlIllllI = new String(Base64.getDecoder().decode(llllllllllllIllIIllIlIllIlIllllI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
            final StringBuilder llllllllllllIllIIllIlIllIllIIIIl = new StringBuilder();
            final char[] llllllllllllIllIIllIlIllIllIIIII = llllllllllllIllIIllIlIllIlIlllIl.toCharArray();
            int llllllllllllIllIIllIlIllIlIlllll = Deserializer.llIllIlIlIlllI[0];
            final Exception llllllllllllIllIIllIlIllIlIllIIl = (Object)llllllllllllIllIIllIlIllIlIllllI.toCharArray();
            final float llllllllllllIllIIllIlIllIlIllIII = llllllllllllIllIIllIlIllIlIllIIl.length;
            byte llllllllllllIllIIllIlIllIlIlIlll = (byte)Deserializer.llIllIlIlIlllI[0];
            while (lIIlIllllllIIlll(llllllllllllIllIIllIlIllIlIlIlll, (int)llllllllllllIllIIllIlIllIlIllIII)) {
                final char llllllllllllIllIIllIlIllIllIIlII = llllllllllllIllIIllIlIllIlIllIIl[llllllllllllIllIIllIlIllIlIlIlll];
                llllllllllllIllIIllIlIllIllIIIIl.append((char)(llllllllllllIllIIllIlIllIllIIlII ^ llllllllllllIllIIllIlIllIllIIIII[llllllllllllIllIIllIlIllIlIlllll % llllllllllllIllIIllIlIllIllIIIII.length]));
                "".length();
                ++llllllllllllIllIIllIlIllIlIlllll;
                ++llllllllllllIllIIllIlIllIlIlIlll;
                "".length();
                if (-" ".length() == (26 + 19 + 15 + 89 ^ 7 + 19 + 10 + 109)) {
                    return null;
                }
            }
            return String.valueOf(llllllllllllIllIIllIlIllIllIIIIl);
        }
        
        static {
            lIIlIllllllIIllI();
            lIIlIllllllIIlIl();
        }
        
        private static String lIIlIllllllIIIll(final String llllllllllllIllIIllIlIllIIllllll, final String llllllllllllIllIIllIlIllIlIIIIII) {
            try {
                final SecretKeySpec llllllllllllIllIIllIlIllIlIIIlII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIllIIllIlIllIlIIIIII.getBytes(StandardCharsets.UTF_8)), Deserializer.llIllIlIlIlllI[6]), "DES");
                final Cipher llllllllllllIllIIllIlIllIlIIIIll = Cipher.getInstance("DES");
                llllllllllllIllIIllIlIllIlIIIIll.init(Deserializer.llIllIlIlIlllI[3], llllllllllllIllIIllIlIllIlIIIlII);
                return new String(llllllllllllIllIIllIlIllIlIIIIll.doFinal(Base64.getDecoder().decode(llllllllllllIllIIllIlIllIIllllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
            }
            catch (Exception llllllllllllIllIIllIlIllIlIIIIlI) {
                llllllllllllIllIIllIlIllIlIIIIlI.printStackTrace();
                return null;
            }
        }
        
        private static void lIIlIllllllIIllI() {
            (llIllIlIlIlllI = new int[7])[0] = ((0x2A ^ 0x9) & ~(0x77 ^ 0x54));
            Deserializer.llIllIlIlIlllI[1] = -" ".length();
            Deserializer.llIllIlIlIlllI[2] = " ".length();
            Deserializer.llIllIlIlIlllI[3] = "  ".length();
            Deserializer.llIllIlIlIlllI[4] = "   ".length();
            Deserializer.llIllIlIlIlllI[5] = (0x35 ^ 0x31);
            Deserializer.llIllIlIlIlllI[6] = (0x82 ^ 0x8A);
        }
        
        private static boolean lIIlIllllllIIlll(final int llllllllllllIllIIllIlIllIIlllIIl, final int llllllllllllIllIIllIlIllIIlllIII) {
            return llllllllllllIllIIllIlIllIIlllIIl < llllllllllllIllIIllIlIllIIlllIII;
        }
        
        private String parseTexture(final JsonObject llllllllllllIllIIllIlIllIllllllI) {
            return JsonUtils.getString(llllllllllllIllIIllIlIllIllllllI, Deserializer.llIllIlIlIllIl[Deserializer.llIllIlIlIlllI[2]]);
        }
    }
}
