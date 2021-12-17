// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.client.audio;

import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.security.MessageDigest;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import net.minecraft.util.ResourceLocation;

public interface ISound
{
    float getXPosF();
    
    boolean canRepeat();
    
    float getYPosF();
    
    float getPitch();
    
    AttenuationType getAttenuationType();
    
    ResourceLocation getSoundLocation();
    
    float getZPosF();
    
    float getVolume();
    
    int getRepeatDelay();
    
    public enum AttenuationType
    {
        private static final /* synthetic */ int[] lIIllllllllIlI;
        
        NONE(AttenuationType.lIIllllllllIIl[AttenuationType.lIIllllllllIlI[0]], AttenuationType.lIIllllllllIlI[0], AttenuationType.lIIllllllllIlI[0]);
        
        private static final /* synthetic */ String[] lIIllllllllIIl;
        
        LINEAR(AttenuationType.lIIllllllllIIl[AttenuationType.lIIllllllllIlI[1]], AttenuationType.lIIllllllllIlI[1], AttenuationType.lIIllllllllIlI[2]);
        
        private final /* synthetic */ int type;
        
        private static void llIlllllllIIIlI() {
            (lIIllllllllIIl = new String[AttenuationType.lIIllllllllIlI[2]])[AttenuationType.lIIllllllllIlI[0]] = llIlllllllIIIII("0HDys+4BI80=", "geTxk");
            AttenuationType.lIIllllllllIIl[AttenuationType.lIIllllllllIlI[1]] = llIlllllllIIIIl("Iz0vHxM9", "otaZR");
        }
        
        private static void llIlllllllIIIll() {
            (lIIllllllllIlI = new int[3])[0] = ((0xBA ^ 0xA0 ^ "   ".length()) & (0x38 ^ 0x5A ^ (0xCD ^ 0xB6) ^ -" ".length()));
            AttenuationType.lIIllllllllIlI[1] = " ".length();
            AttenuationType.lIIllllllllIlI[2] = "  ".length();
        }
        
        private static boolean llIlllllllIIlII(final int lllllllllllllIIlIIIlIllIllIIIIlI, final int lllllllllllllIIlIIIlIllIllIIIIIl) {
            return lllllllllllllIIlIIIlIllIllIIIIlI < lllllllllllllIIlIIIlIllIllIIIIIl;
        }
        
        static {
            llIlllllllIIIll();
            llIlllllllIIIlI();
            final AttenuationType[] enum$VALUES = new AttenuationType[AttenuationType.lIIllllllllIlI[2]];
            enum$VALUES[AttenuationType.lIIllllllllIlI[0]] = AttenuationType.NONE;
            enum$VALUES[AttenuationType.lIIllllllllIlI[1]] = AttenuationType.LINEAR;
            ENUM$VALUES = enum$VALUES;
        }
        
        private AttenuationType(final String lllllllllllllIIlIIIlIllIllllIlll, final int lllllllllllllIIlIIIlIllIllllIllI, final int lllllllllllllIIlIIIlIllIllllIlIl) {
            this.type = lllllllllllllIIlIIIlIllIllllIlIl;
        }
        
        private static String llIlllllllIIIIl(String lllllllllllllIIlIIIlIllIllIllIlI, final String lllllllllllllIIlIIIlIllIllIllIIl) {
            lllllllllllllIIlIIIlIllIllIllIlI = new String(Base64.getDecoder().decode(lllllllllllllIIlIIIlIllIllIllIlI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
            final StringBuilder lllllllllllllIIlIIIlIllIllIlllIl = new StringBuilder();
            final char[] lllllllllllllIIlIIIlIllIllIlllII = lllllllllllllIIlIIIlIllIllIllIIl.toCharArray();
            int lllllllllllllIIlIIIlIllIllIllIll = AttenuationType.lIIllllllllIlI[0];
            final char lllllllllllllIIlIIIlIllIllIlIlIl = (Object)lllllllllllllIIlIIIlIllIllIllIlI.toCharArray();
            final String lllllllllllllIIlIIIlIllIllIlIlII = (String)lllllllllllllIIlIIIlIllIllIlIlIl.length;
            Exception lllllllllllllIIlIIIlIllIllIlIIll = (Exception)AttenuationType.lIIllllllllIlI[0];
            while (llIlllllllIIlII((int)lllllllllllllIIlIIIlIllIllIlIIll, (int)lllllllllllllIIlIIIlIllIllIlIlII)) {
                final char lllllllllllllIIlIIIlIllIlllIIIII = lllllllllllllIIlIIIlIllIllIlIlIl[lllllllllllllIIlIIIlIllIllIlIIll];
                lllllllllllllIIlIIIlIllIllIlllIl.append((char)(lllllllllllllIIlIIIlIllIlllIIIII ^ lllllllllllllIIlIIIlIllIllIlllII[lllllllllllllIIlIIIlIllIllIllIll % lllllllllllllIIlIIIlIllIllIlllII.length]));
                "".length();
                ++lllllllllllllIIlIIIlIllIllIllIll;
                ++lllllllllllllIIlIIIlIllIllIlIIll;
                "".length();
                if ("   ".length() < 0) {
                    return null;
                }
            }
            return String.valueOf(lllllllllllllIIlIIIlIllIllIlllIl);
        }
        
        private static String llIlllllllIIIII(final String lllllllllllllIIlIIIlIllIllIIlIlI, final String lllllllllllllIIlIIIlIllIllIIlIIl) {
            try {
                final SecretKeySpec lllllllllllllIIlIIIlIllIllIIllIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIIlIIIlIllIllIIlIIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
                final Cipher lllllllllllllIIlIIIlIllIllIIllII = Cipher.getInstance("Blowfish");
                lllllllllllllIIlIIIlIllIllIIllII.init(AttenuationType.lIIllllllllIlI[2], lllllllllllllIIlIIIlIllIllIIllIl);
                return new String(lllllllllllllIIlIIIlIllIllIIllII.doFinal(Base64.getDecoder().decode(lllllllllllllIIlIIIlIllIllIIlIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
            }
            catch (Exception lllllllllllllIIlIIIlIllIllIIlIll) {
                lllllllllllllIIlIIIlIllIllIIlIll.printStackTrace();
                return null;
            }
        }
        
        public int getTypeInt() {
            return this.type;
        }
    }
}
