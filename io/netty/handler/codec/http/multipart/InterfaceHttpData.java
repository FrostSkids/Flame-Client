// 
// Decompiled by Procyon v0.5.36
// 

package io.netty.handler.codec.http.multipart;

import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import io.netty.util.ReferenceCounted;

public interface InterfaceHttpData extends Comparable<InterfaceHttpData>, ReferenceCounted
{
    String getName();
    
    HttpDataType getHttpDataType();
    
    public enum HttpDataType
    {
        Attribute, 
        FileUpload;
        
        private static final /* synthetic */ String[] lllIlllllllll;
        
        InternalAttribute;
        
        private static final /* synthetic */ int[] llllIIIIIIIll;
        
        static {
            lIlIIllIlIIlIIl();
            lIlIIllIlIIIllI();
            final HttpDataType[] $values = new HttpDataType[HttpDataType.llllIIIIIIIll[3]];
            $values[HttpDataType.llllIIIIIIIll[0]] = HttpDataType.Attribute;
            $values[HttpDataType.llllIIIIIIIll[1]] = HttpDataType.FileUpload;
            $values[HttpDataType.llllIIIIIIIll[2]] = HttpDataType.InternalAttribute;
            $VALUES = $values;
        }
        
        private static boolean lIlIIllIlIIlIll(final int lllllllllllllIlIlllllIlIIIllllll, final int lllllllllllllIlIlllllIlIIIlllllI) {
            return lllllllllllllIlIlllllIlIIIllllll < lllllllllllllIlIlllllIlIIIlllllI;
        }
        
        private static String lIlIIllIIlllIlI(final String lllllllllllllIlIlllllIlIIllIlIlI, final String lllllllllllllIlIlllllIlIIllIlIll) {
            try {
                final SecretKeySpec lllllllllllllIlIlllllIlIIllIllll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIlIlllllIlIIllIlIll.getBytes(StandardCharsets.UTF_8)), HttpDataType.llllIIIIIIIll[4]), "DES");
                final Cipher lllllllllllllIlIlllllIlIIllIlllI = Cipher.getInstance("DES");
                lllllllllllllIlIlllllIlIIllIlllI.init(HttpDataType.llllIIIIIIIll[2], lllllllllllllIlIlllllIlIIllIllll);
                return new String(lllllllllllllIlIlllllIlIIllIlllI.doFinal(Base64.getDecoder().decode(lllllllllllllIlIlllllIlIIllIlIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
            }
            catch (Exception lllllllllllllIlIlllllIlIIllIllIl) {
                lllllllllllllIlIlllllIlIIllIllIl.printStackTrace();
                return null;
            }
        }
        
        private static String lIlIIllIlIIIlIl(String lllllllllllllIlIlllllIlIIlIIlIlI, final String lllllllllllllIlIlllllIlIIlIIlllI) {
            lllllllllllllIlIlllllIlIIlIIlIlI = (float)new String(Base64.getDecoder().decode(((String)lllllllllllllIlIlllllIlIIlIIlIlI).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
            final StringBuilder lllllllllllllIlIlllllIlIIlIIllIl = new StringBuilder();
            final char[] lllllllllllllIlIlllllIlIIlIIllII = lllllllllllllIlIlllllIlIIlIIlllI.toCharArray();
            int lllllllllllllIlIlllllIlIIlIIlIll = HttpDataType.llllIIIIIIIll[0];
            final byte lllllllllllllIlIlllllIlIIlIIIlIl = (Object)((String)lllllllllllllIlIlllllIlIIlIIlIlI).toCharArray();
            final short lllllllllllllIlIlllllIlIIlIIIlII = (short)lllllllllllllIlIlllllIlIIlIIIlIl.length;
            boolean lllllllllllllIlIlllllIlIIlIIIIll = HttpDataType.llllIIIIIIIll[0] != 0;
            while (lIlIIllIlIIlIll(lllllllllllllIlIlllllIlIIlIIIIll ? 1 : 0, lllllllllllllIlIlllllIlIIlIIIlII)) {
                final char lllllllllllllIlIlllllIlIIlIlIIII = lllllllllllllIlIlllllIlIIlIIIlIl[lllllllllllllIlIlllllIlIIlIIIIll];
                lllllllllllllIlIlllllIlIIlIIllIl.append((char)(lllllllllllllIlIlllllIlIIlIlIIII ^ lllllllllllllIlIlllllIlIIlIIllII[lllllllllllllIlIlllllIlIIlIIlIll % lllllllllllllIlIlllllIlIIlIIllII.length]));
                "".length();
                ++lllllllllllllIlIlllllIlIIlIIlIll;
                ++lllllllllllllIlIlllllIlIIlIIIIll;
                "".length();
                if ((0x4A ^ 0x4F) <= 0) {
                    return null;
                }
            }
            return String.valueOf(lllllllllllllIlIlllllIlIIlIIllIl);
        }
        
        private static void lIlIIllIlIIlIIl() {
            (llllIIIIIIIll = new int[5])[0] = ((0x78 ^ 0x27) & ~(0x59 ^ 0x6));
            HttpDataType.llllIIIIIIIll[1] = " ".length();
            HttpDataType.llllIIIIIIIll[2] = "  ".length();
            HttpDataType.llllIIIIIIIll[3] = "   ".length();
            HttpDataType.llllIIIIIIIll[4] = (0x3E ^ 0x36);
        }
        
        private static void lIlIIllIlIIIllI() {
            (lllIlllllllll = new String[HttpDataType.llllIIIIIIIll[3]])[HttpDataType.llllIIIIIIIll[0]] = lIlIIllIIlllIlI("WNVSsd5sZCI7O/agtkcWkw==", "zOGSL");
            HttpDataType.lllIlllllllll[HttpDataType.llllIIIIIIIll[1]] = lIlIIllIIlllllI("+kIS33zcICf218bn3sNKyQ==", "xFIMY");
            HttpDataType.lllIlllllllll[HttpDataType.llllIIIIIIIll[2]] = lIlIIllIlIIIlIl("IjkDNAAFNhsQBh8lHjMHHzI=", "kWwQr");
        }
        
        private static String lIlIIllIIlllllI(final String lllllllllllllIlIlllllIlIIlIlllll, final String lllllllllllllIlIlllllIlIIlIlllII) {
            try {
                final SecretKeySpec lllllllllllllIlIlllllIlIIllIIIlI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIlIlllllIlIIlIlllII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
                final Cipher lllllllllllllIlIlllllIlIIllIIIIl = Cipher.getInstance("Blowfish");
                lllllllllllllIlIlllllIlIIllIIIIl.init(HttpDataType.llllIIIIIIIll[2], lllllllllllllIlIlllllIlIIllIIIlI);
                return new String(lllllllllllllIlIlllllIlIIllIIIIl.doFinal(Base64.getDecoder().decode(lllllllllllllIlIlllllIlIIlIlllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
            }
            catch (Exception lllllllllllllIlIlllllIlIIllIIIII) {
                lllllllllllllIlIlllllIlIIllIIIII.printStackTrace();
                return null;
            }
        }
    }
}
