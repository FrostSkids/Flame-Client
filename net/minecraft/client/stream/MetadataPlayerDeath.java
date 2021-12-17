// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.client.stream;

import net.minecraft.entity.EntityLivingBase;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.security.MessageDigest;
import java.nio.charset.StandardCharsets;
import java.util.Base64;

public class MetadataPlayerDeath extends Metadata
{
    private static final /* synthetic */ String[] lIlllIIIlIIllI;
    private static final /* synthetic */ int[] lIlllIIIlIIlll;
    
    private static String lIIIIIIlIIlIlIll(String llllllllllllIlllllIllIllIIlIllll, final String llllllllllllIlllllIllIllIIlIlllI) {
        llllllllllllIlllllIllIllIIlIllll = (char)new String(Base64.getDecoder().decode(((String)llllllllllllIlllllIllIllIIlIllll).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder llllllllllllIlllllIllIllIIllIIlI = new StringBuilder();
        final char[] llllllllllllIlllllIllIllIIllIIIl = llllllllllllIlllllIllIllIIlIlllI.toCharArray();
        int llllllllllllIlllllIllIllIIllIIII = MetadataPlayerDeath.lIlllIIIlIIlll[0];
        final int llllllllllllIlllllIllIllIIlIlIlI = (Object)((String)llllllllllllIlllllIllIllIIlIllll).toCharArray();
        final double llllllllllllIlllllIllIllIIlIlIIl = llllllllllllIlllllIllIllIIlIlIlI.length;
        String llllllllllllIlllllIllIllIIlIlIII = (String)MetadataPlayerDeath.lIlllIIIlIIlll[0];
        while (lIIIIIIlIIllIIII((int)llllllllllllIlllllIllIllIIlIlIII, (int)llllllllllllIlllllIllIllIIlIlIIl)) {
            final char llllllllllllIlllllIllIllIIllIlIl = llllllllllllIlllllIllIllIIlIlIlI[llllllllllllIlllllIllIllIIlIlIII];
            llllllllllllIlllllIllIllIIllIIlI.append((char)(llllllllllllIlllllIllIllIIllIlIl ^ llllllllllllIlllllIllIllIIllIIIl[llllllllllllIlllllIllIllIIllIIII % llllllllllllIlllllIllIllIIllIIIl.length]));
            "".length();
            ++llllllllllllIlllllIllIllIIllIIII;
            ++llllllllllllIlllllIllIllIIlIlIII;
            "".length();
            if ("  ".length() <= 0) {
                return null;
            }
        }
        return String.valueOf(llllllllllllIlllllIllIllIIllIIlI);
    }
    
    private static String lIIIIIIlIIlIlIlI(final String llllllllllllIlllllIllIllIlIlIIIl, final String llllllllllllIlllllIllIllIlIlIIII) {
        try {
            final SecretKeySpec llllllllllllIlllllIllIllIlIlIlII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIlllllIllIllIlIlIIII.getBytes(StandardCharsets.UTF_8)), MetadataPlayerDeath.lIlllIIIlIIlll[4]), "DES");
            final Cipher llllllllllllIlllllIllIllIlIlIIll = Cipher.getInstance("DES");
            llllllllllllIlllllIllIllIlIlIIll.init(MetadataPlayerDeath.lIlllIIIlIIlll[2], llllllllllllIlllllIllIllIlIlIlII);
            return new String(llllllllllllIlllllIllIllIlIlIIll.doFinal(Base64.getDecoder().decode(llllllllllllIlllllIllIllIlIlIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIlllllIllIllIlIlIIlI) {
            llllllllllllIlllllIllIllIlIlIIlI.printStackTrace();
            return null;
        }
    }
    
    private static boolean lIIIIIIlIIlIllll(final Object llllllllllllIlllllIllIllIIlIIIIl) {
        return llllllllllllIlllllIllIllIIlIIIIl != null;
    }
    
    private static void lIIIIIIlIIlIlllI() {
        (lIlllIIIlIIlll = new int[5])[0] = ((0x21 ^ 0x4) & ~(0x3A ^ 0x1F));
        MetadataPlayerDeath.lIlllIIIlIIlll[1] = " ".length();
        MetadataPlayerDeath.lIlllIIIlIIlll[2] = "  ".length();
        MetadataPlayerDeath.lIlllIIIlIIlll[3] = "   ".length();
        MetadataPlayerDeath.lIlllIIIlIIlll[4] = (92 + 163 - 91 + 10 ^ 22 + 90 - 68 + 122);
    }
    
    static {
        lIIIIIIlIIlIlllI();
        lIIIIIIlIIlIllII();
    }
    
    public MetadataPlayerDeath(final EntityLivingBase llllllllllllIlllllIllIllIlIlllIl, final EntityLivingBase llllllllllllIlllllIllIllIlIllIIl) {
        super(MetadataPlayerDeath.lIlllIIIlIIllI[MetadataPlayerDeath.lIlllIIIlIIlll[0]]);
        if (lIIIIIIlIIlIllll(llllllllllllIlllllIllIllIlIlllIl)) {
            this.func_152808_a(MetadataPlayerDeath.lIlllIIIlIIllI[MetadataPlayerDeath.lIlllIIIlIIlll[1]], llllllllllllIlllllIllIllIlIlllIl.getName());
        }
        if (lIIIIIIlIIlIllll(llllllllllllIlllllIllIllIlIllIIl)) {
            this.func_152808_a(MetadataPlayerDeath.lIlllIIIlIIllI[MetadataPlayerDeath.lIlllIIIlIIlll[2]], llllllllllllIlllllIllIllIlIllIIl.getName());
        }
    }
    
    private static void lIIIIIIlIIlIllII() {
        (lIlllIIIlIIllI = new String[MetadataPlayerDeath.lIlllIIIlIIlll[3]])[MetadataPlayerDeath.lIlllIIIlIIlll[0]] = lIIIIIIlIIlIlIIl("Gtnoy19OWKP5hE38CzXvRw==", "xWtUv");
        MetadataPlayerDeath.lIlllIIIlIIllI[MetadataPlayerDeath.lIlllIIIlIIlll[1]] = lIIIIIIlIIlIlIlI("XqWHKgry8Oo=", "tWeTR");
        MetadataPlayerDeath.lIlllIIIlIIllI[MetadataPlayerDeath.lIlllIIIlIIlll[2]] = lIIIIIIlIIlIlIll("Ej4fOgcL", "yWsVb");
    }
    
    private static boolean lIIIIIIlIIllIIII(final int llllllllllllIlllllIllIllIIlIIlII, final int llllllllllllIlllllIllIllIIlIIIll) {
        return llllllllllllIlllllIllIllIIlIIlII < llllllllllllIlllllIllIllIIlIIIll;
    }
    
    private static String lIIIIIIlIIlIlIIl(final String llllllllllllIlllllIllIllIlIIIIlI, final String llllllllllllIlllllIllIllIlIIIIIl) {
        try {
            final SecretKeySpec llllllllllllIlllllIllIllIlIIIlll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIlllllIllIllIlIIIIIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher llllllllllllIlllllIllIllIlIIIllI = Cipher.getInstance("Blowfish");
            llllllllllllIlllllIllIllIlIIIllI.init(MetadataPlayerDeath.lIlllIIIlIIlll[2], llllllllllllIlllllIllIllIlIIIlll);
            return new String(llllllllllllIlllllIllIllIlIIIllI.doFinal(Base64.getDecoder().decode(llllllllllllIlllllIllIllIlIIIIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIlllllIllIllIlIIIlIl) {
            llllllllllllIlllllIllIllIlIIIlIl.printStackTrace();
            return null;
        }
    }
}
