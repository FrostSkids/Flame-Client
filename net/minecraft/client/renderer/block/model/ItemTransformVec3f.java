// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.client.renderer.block.model;

import com.google.gson.JsonArray;
import net.minecraft.util.JsonUtils;
import com.google.gson.JsonParseException;
import com.google.gson.JsonObject;
import net.minecraft.util.MathHelper;
import com.google.gson.JsonDeserializationContext;
import java.lang.reflect.Type;
import com.google.gson.JsonElement;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.security.MessageDigest;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import com.google.gson.JsonDeserializer;
import org.lwjgl.util.vector.ReadableVector3f;
import org.lwjgl.util.vector.Vector3f;

public class ItemTransformVec3f
{
    public final /* synthetic */ Vector3f translation;
    private static final /* synthetic */ int[] llIllIIIIIllIl;
    public final /* synthetic */ Vector3f rotation;
    public final /* synthetic */ Vector3f scale;
    
    @Override
    public int hashCode() {
        int llllllllllllIllIlIIIIllIlIIIIIIl = this.rotation.hashCode();
        llllllllllllIllIlIIIIllIlIIIIIIl = ItemTransformVec3f.llIllIIIIIllIl[2] * llllllllllllIllIlIIIIllIlIIIIIIl + this.translation.hashCode();
        llllllllllllIllIlIIIIllIlIIIIIIl = ItemTransformVec3f.llIllIIIIIllIl[2] * llllllllllllIllIlIIIIllIlIIIIIIl + this.scale.hashCode();
        return llllllllllllIllIlIIIIllIlIIIIIIl;
    }
    
    @Override
    public boolean equals(final Object llllllllllllIllIlIIIIllIlIIIlIIl) {
        if (lIIlIllIIIllllII(this, llllllllllllIllIlIIIIllIlIIIlIIl)) {
            return ItemTransformVec3f.llIllIIIIIllIl[0] != 0;
        }
        if (lIIlIllIIIllllIl(this.getClass(), llllllllllllIllIlIIIIllIlIIIlIIl.getClass())) {
            return ItemTransformVec3f.llIllIIIIIllIl[1] != 0;
        }
        final ItemTransformVec3f llllllllllllIllIlIIIIllIlIIIlIII = (ItemTransformVec3f)llllllllllllIllIlIIIIllIlIIIlIIl;
        int equals;
        if (lIIlIllIIIlllllI(this.rotation.equals((Object)llllllllllllIllIlIIIIllIlIIIlIII.rotation) ? 1 : 0)) {
            equals = ItemTransformVec3f.llIllIIIIIllIl[1];
            "".length();
            if (-" ".length() >= "  ".length()) {
                return ((0x4D ^ 0x21 ^ (0xD ^ 0x6C)) & (38 + 7 + 117 + 40 ^ 104 + 151 - 103 + 47 ^ -" ".length())) != 0x0;
            }
        }
        else if (lIIlIllIIIlllllI(this.scale.equals((Object)llllllllllllIllIlIIIIllIlIIIlIII.scale) ? 1 : 0)) {
            equals = ItemTransformVec3f.llIllIIIIIllIl[1];
            "".length();
            if (-" ".length() != -" ".length()) {
                return ((0x61 ^ 0x7B ^ (0xCA ^ 0xC7)) & (0xD5 ^ 0xA2 ^ (0x37 ^ 0x57) ^ -" ".length())) != 0x0;
            }
        }
        else {
            equals = (this.translation.equals((Object)llllllllllllIllIlIIIIllIlIIIlIII.translation) ? 1 : 0);
        }
        return equals != 0;
    }
    
    private static boolean lIIlIllIIIllllII(final Object llllllllllllIllIlIIIIllIIllllIII, final Object llllllllllllIllIlIIIIllIIlllIlll) {
        return llllllllllllIllIlIIIIllIIllllIII == llllllllllllIllIlIIIIllIIlllIlll;
    }
    
    public ItemTransformVec3f(final Vector3f llllllllllllIllIlIIIIllIlIIlIlII, final Vector3f llllllllllllIllIlIIIIllIlIIIllll, final Vector3f llllllllllllIllIlIIIIllIlIIIlllI) {
        this.rotation = new Vector3f((ReadableVector3f)llllllllllllIllIlIIIIllIlIIlIlII);
        this.translation = new Vector3f((ReadableVector3f)llllllllllllIllIlIIIIllIlIIIllll);
        this.scale = new Vector3f((ReadableVector3f)llllllllllllIllIlIIIIllIlIIIlllI);
    }
    
    private static boolean lIIlIllIIIllllIl(final Object llllllllllllIllIlIIIIllIIlllllII, final Object llllllllllllIllIlIIIIllIIllllIll) {
        return llllllllllllIllIlIIIIllIIlllllII != llllllllllllIllIlIIIIllIIllllIll;
    }
    
    static {
        lIIlIllIIIlllIll();
        DEFAULT = new ItemTransformVec3f(new Vector3f(), new Vector3f(), new Vector3f(1.0f, 1.0f, 1.0f));
    }
    
    private static boolean lIIlIllIIIlllllI(final int llllllllllllIllIlIIIIllIIlllIlIl) {
        return llllllllllllIllIlIIIIllIIlllIlIl == 0;
    }
    
    private static void lIIlIllIIIlllIll() {
        (llIllIIIIIllIl = new int[3])[0] = " ".length();
        ItemTransformVec3f.llIllIIIIIllIl[1] = ((0x9 ^ 0x22) & ~(0x15 ^ 0x3E));
        ItemTransformVec3f.llIllIIIIIllIl[2] = (85 + 167 - 139 + 62 ^ 52 + 36 + 18 + 70);
    }
    
    static class Deserializer implements JsonDeserializer<ItemTransformVec3f>
    {
        private static final /* synthetic */ Vector3f SCALE_DEFAULT;
        private static final /* synthetic */ Vector3f ROTATION_DEFAULT;
        private static final /* synthetic */ int[] llIlllIIlIlllI;
        private static final /* synthetic */ String[] llIlllIIlIIIlI;
        private static final /* synthetic */ Vector3f TRANSLATION_DEFAULT;
        
        private static String lIIllIIlIlIlIIll(String llllllllllllIllIIlIIlllIIIllIIII, final String llllllllllllIllIIlIIlllIIIllIlII) {
            llllllllllllIllIIlIIlllIIIllIIII = (Exception)new String(Base64.getDecoder().decode(((String)llllllllllllIllIIlIIlllIIIllIIII).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
            final StringBuilder llllllllllllIllIIlIIlllIIIllIIll = new StringBuilder();
            final char[] llllllllllllIllIIlIIlllIIIllIIlI = llllllllllllIllIIlIIlllIIIllIlII.toCharArray();
            int llllllllllllIllIIlIIlllIIIllIIIl = Deserializer.llIlllIIlIlllI[0];
            final long llllllllllllIllIIlIIlllIIIlIlIll = (Object)((String)llllllllllllIllIIlIIlllIIIllIIII).toCharArray();
            final int llllllllllllIllIIlIIlllIIIlIlIlI = llllllllllllIllIIlIIlllIIIlIlIll.length;
            double llllllllllllIllIIlIIlllIIIlIlIIl = Deserializer.llIlllIIlIlllI[0];
            while (lIIllIIlIllIlIII((int)llllllllllllIllIIlIIlllIIIlIlIIl, llllllllllllIllIIlIIlllIIIlIlIlI)) {
                final char llllllllllllIllIIlIIlllIIIllIllI = llllllllllllIllIIlIIlllIIIlIlIll[llllllllllllIllIIlIIlllIIIlIlIIl];
                llllllllllllIllIIlIIlllIIIllIIll.append((char)(llllllllllllIllIIlIIlllIIIllIllI ^ llllllllllllIllIIlIIlllIIIllIIlI[llllllllllllIllIIlIIlllIIIllIIIl % llllllllllllIllIIlIIlllIIIllIIlI.length]));
                "".length();
                ++llllllllllllIllIIlIIlllIIIllIIIl;
                ++llllllllllllIllIIlIIlllIIIlIlIIl;
                "".length();
                if ("  ".length() < " ".length()) {
                    return null;
                }
            }
            return String.valueOf(llllllllllllIllIIlIIlllIIIllIIll);
        }
        
        private static boolean lIIllIIlIllIlIII(final int llllllllllllIllIIlIIlllIIIlIIIIl, final int llllllllllllIllIIlIIlllIIIlIIIII) {
            return llllllllllllIllIIlIIlllIIIlIIIIl < llllllllllllIllIIlIIlllIIIlIIIII;
        }
        
        private static String lIIllIIlIlIlIIlI(final String llllllllllllIllIIlIIlllIIlIlIIlI, final String llllllllllllIllIIlIIlllIIlIlIIIl) {
            try {
                final SecretKeySpec llllllllllllIllIIlIIlllIIlIlIlIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIllIIlIIlllIIlIlIIIl.getBytes(StandardCharsets.UTF_8)), Deserializer.llIlllIIlIlllI[8]), "DES");
                final Cipher llllllllllllIllIIlIIlllIIlIlIlII = Cipher.getInstance("DES");
                llllllllllllIllIIlIIlllIIlIlIlII.init(Deserializer.llIlllIIlIlllI[2], llllllllllllIllIIlIIlllIIlIlIlIl);
                return new String(llllllllllllIllIIlIIlllIIlIlIlII.doFinal(Base64.getDecoder().decode(llllllllllllIllIIlIIlllIIlIlIIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
            }
            catch (Exception llllllllllllIllIIlIIlllIIlIlIIll) {
                llllllllllllIllIIlIIlllIIlIlIIll.printStackTrace();
                return null;
            }
        }
        
        private static String lIIllIIlIlIlIlII(final String llllllllllllIllIIlIIlllIIlIIIlIl, final String llllllllllllIllIIlIIlllIIlIIIlII) {
            try {
                final SecretKeySpec llllllllllllIllIIlIIlllIIlIIlIII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIllIIlIIlllIIlIIIlII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
                final Cipher llllllllllllIllIIlIIlllIIlIIIlll = Cipher.getInstance("Blowfish");
                llllllllllllIllIIlIIlllIIlIIIlll.init(Deserializer.llIlllIIlIlllI[2], llllllllllllIllIIlIIlllIIlIIlIII);
                return new String(llllllllllllIllIIlIIlllIIlIIIlll.doFinal(Base64.getDecoder().decode(llllllllllllIllIIlIIlllIIlIIIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
            }
            catch (Exception llllllllllllIllIIlIIlllIIlIIIllI) {
                llllllllllllIllIIlIIlllIIlIIIllI.printStackTrace();
                return null;
            }
        }
        
        public ItemTransformVec3f deserialize(final JsonElement llllllllllllIllIIlIIlllIlIIIIIIl, final Type llllllllllllIllIIlIIlllIlIIIIIII, final JsonDeserializationContext llllllllllllIllIIlIIlllIIlllllll) throws JsonParseException {
            final JsonObject llllllllllllIllIIlIIlllIIllllllI = llllllllllllIllIIlIIlllIlIIIIIIl.getAsJsonObject();
            final Vector3f llllllllllllIllIIlIIlllIIlllllIl = this.parseVector3f(llllllllllllIllIIlIIlllIIllllllI, Deserializer.llIlllIIlIIIlI[Deserializer.llIlllIIlIlllI[0]], Deserializer.ROTATION_DEFAULT);
            final Vector3f llllllllllllIllIIlIIlllIIlllllII = this.parseVector3f(llllllllllllIllIIlIIlllIIllllllI, Deserializer.llIlllIIlIIIlI[Deserializer.llIlllIIlIlllI[1]], Deserializer.TRANSLATION_DEFAULT);
            llllllllllllIllIIlIIlllIIlllllII.scale(0.0625f);
            "".length();
            llllllllllllIllIIlIIlllIIlllllII.x = MathHelper.clamp_float(llllllllllllIllIIlIIlllIIlllllII.x, -1.5f, 1.5f);
            llllllllllllIllIIlIIlllIIlllllII.y = MathHelper.clamp_float(llllllllllllIllIIlIIlllIIlllllII.y, -1.5f, 1.5f);
            llllllllllllIllIIlIIlllIIlllllII.z = MathHelper.clamp_float(llllllllllllIllIIlIIlllIIlllllII.z, -1.5f, 1.5f);
            final Vector3f llllllllllllIllIIlIIlllIIllllIll = this.parseVector3f(llllllllllllIllIIlIIlllIIllllllI, Deserializer.llIlllIIlIIIlI[Deserializer.llIlllIIlIlllI[2]], Deserializer.SCALE_DEFAULT);
            llllllllllllIllIIlIIlllIIllllIll.x = MathHelper.clamp_float(llllllllllllIllIIlIIlllIIllllIll.x, -4.0f, 4.0f);
            llllllllllllIllIIlIIlllIIllllIll.y = MathHelper.clamp_float(llllllllllllIllIIlIIlllIIllllIll.y, -4.0f, 4.0f);
            llllllllllllIllIIlIIlllIIllllIll.z = MathHelper.clamp_float(llllllllllllIllIIlIIlllIIllllIll.z, -4.0f, 4.0f);
            return new ItemTransformVec3f(llllllllllllIllIIlIIlllIIlllllIl, llllllllllllIllIIlIIlllIIlllllII, llllllllllllIllIIlIIlllIIllllIll);
        }
        
        private static boolean lIIllIIlIllIIlll(final int llllllllllllIllIIlIIlllIIIlIIlIl, final int llllllllllllIllIIlIIlllIIIlIIlII) {
            return llllllllllllIllIIlIIlllIIIlIIlIl >= llllllllllllIllIIlIIlllIIIlIIlII;
        }
        
        private Vector3f parseVector3f(final JsonObject llllllllllllIllIIlIIlllIIllIllIl, final String llllllllllllIllIIlIIlllIIllIllII, final Vector3f llllllllllllIllIIlIIlllIIllIIlIl) {
            if (lIIllIIlIllIIlIl(llllllllllllIllIIlIIlllIIllIllIl.has(llllllllllllIllIIlIIlllIIllIllII) ? 1 : 0)) {
                return llllllllllllIllIIlIIlllIIllIIlIl;
            }
            final JsonArray llllllllllllIllIIlIIlllIIllIlIlI = JsonUtils.getJsonArray(llllllllllllIllIIlIIlllIIllIllIl, llllllllllllIllIIlIIlllIIllIllII);
            if (lIIllIIlIllIIllI(llllllllllllIllIIlIIlllIIllIlIlI.size(), Deserializer.llIlllIIlIlllI[3])) {
                throw new JsonParseException(String.valueOf(new StringBuilder(Deserializer.llIlllIIlIIIlI[Deserializer.llIlllIIlIlllI[3]]).append(llllllllllllIllIIlIIlllIIllIllII).append(Deserializer.llIlllIIlIIIlI[Deserializer.llIlllIIlIlllI[4]]).append(llllllllllllIllIIlIIlllIIllIlIlI.size())));
            }
            final float[] llllllllllllIllIIlIIlllIIllIlIIl = new float[Deserializer.llIlllIIlIlllI[3]];
            int llllllllllllIllIIlIIlllIIllIlIII = Deserializer.llIlllIIlIlllI[0];
            "".length();
            if (null != null) {
                return null;
            }
            while (!lIIllIIlIllIIlll(llllllllllllIllIIlIIlllIIllIlIII, llllllllllllIllIIlIIlllIIllIlIIl.length)) {
                llllllllllllIllIIlIIlllIIllIlIIl[llllllllllllIllIIlIIlllIIllIlIII] = JsonUtils.getFloat(llllllllllllIllIIlIIlllIIllIlIlI.get(llllllllllllIllIIlIIlllIIllIlIII), String.valueOf(new StringBuilder(String.valueOf(llllllllllllIllIIlIIlllIIllIllII)).append(Deserializer.llIlllIIlIIIlI[Deserializer.llIlllIIlIlllI[5]]).append(llllllllllllIllIIlIIlllIIllIlIII).append(Deserializer.llIlllIIlIIIlI[Deserializer.llIlllIIlIlllI[6]])));
                ++llllllllllllIllIIlIIlllIIllIlIII;
            }
            return new Vector3f(llllllllllllIllIIlIIlllIIllIlIIl[Deserializer.llIlllIIlIlllI[0]], llllllllllllIllIIlIIlllIIllIlIIl[Deserializer.llIlllIIlIlllI[1]], llllllllllllIllIIlIIlllIIllIlIIl[Deserializer.llIlllIIlIlllI[2]]);
        }
        
        private static boolean lIIllIIlIllIIlIl(final int llllllllllllIllIIlIIlllIIIIllllI) {
            return llllllllllllIllIIlIIlllIIIIllllI == 0;
        }
        
        private static void lIIllIIlIllIIlII() {
            (llIlllIIlIlllI = new int[9])[0] = ((0x67 ^ 0x5F) & ~(0xF9 ^ 0xC1));
            Deserializer.llIlllIIlIlllI[1] = " ".length();
            Deserializer.llIlllIIlIlllI[2] = "  ".length();
            Deserializer.llIlllIIlIlllI[3] = "   ".length();
            Deserializer.llIlllIIlIlllI[4] = (0x59 ^ 0x0 ^ (0xE ^ 0x53));
            Deserializer.llIlllIIlIlllI[5] = (0x26 ^ 0x23);
            Deserializer.llIlllIIlIlllI[6] = (0x12 ^ 0x35 ^ (0x9 ^ 0x28));
            Deserializer.llIlllIIlIlllI[7] = (42 + 16 + 85 + 7 ^ 127 + 113 - 221 + 126);
            Deserializer.llIlllIIlIlllI[8] = (0x74 ^ 0x7C);
        }
        
        private static void lIIllIIlIllIIIll() {
            (llIlllIIlIIIlI = new String[Deserializer.llIlllIIlIlllI[7]])[Deserializer.llIlllIIlIlllI[0]] = lIIllIIlIlIlIIlI("wT+zhXA3TynupRp1IbKngg==", "lXlrh");
            Deserializer.llIlllIIlIIIlI[Deserializer.llIlllIIlIlllI[1]] = lIIllIIlIlIlIIll("ID4sFBc4LTkTCzo=", "TLMzd");
            Deserializer.llIlllIIlIIIlI[Deserializer.llIlllIIlIlllI[2]] = lIIllIIlIlIlIIll("ChUuKSI=", "yvOEG");
            Deserializer.llIlllIIlIIIlI[Deserializer.llIlllIIlIlllI[3]] = lIIllIIlIlIlIIll("CgI1IBU7HyFlRW8=", "OzEEv");
            Deserializer.llIlllIIlIIIlI[Deserializer.llIlllIIlIlllI[4]] = lIIllIIlIlIlIIll("cR8xOyw0Gnx3Pz4cPjNjcQ==", "QiPWY");
            Deserializer.llIlllIIlIIIlI[Deserializer.llIlllIIlIlllI[5]] = lIIllIIlIlIlIlII("xKEZb74SKRw=", "KQXMo");
            Deserializer.llIlllIIlIIIlI[Deserializer.llIlllIIlIlllI[6]] = lIIllIIlIlIlIIlI("leWfD+BTkOk=", "zwBHd");
        }
        
        private static boolean lIIllIIlIllIIllI(final int llllllllllllIllIIlIIlllIIIIllIll, final int llllllllllllIllIIlIIlllIIIIllIlI) {
            return llllllllllllIllIIlIIlllIIIIllIll != llllllllllllIllIIlIIlllIIIIllIlI;
        }
        
        static {
            lIIllIIlIllIIlII();
            lIIllIIlIllIIIll();
            ROTATION_DEFAULT = new Vector3f(0.0f, 0.0f, 0.0f);
            TRANSLATION_DEFAULT = new Vector3f(0.0f, 0.0f, 0.0f);
            SCALE_DEFAULT = new Vector3f(1.0f, 1.0f, 1.0f);
        }
    }
}
