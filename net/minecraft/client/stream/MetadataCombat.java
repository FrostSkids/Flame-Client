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

public class MetadataCombat extends Metadata
{
    private static final /* synthetic */ String[] lIIllIIlIIIIII;
    private static final /* synthetic */ int[] lIIllIIlIIIIIl;
    
    private static void llIlIllIlllllII() {
        (lIIllIIlIIIIIl = new int[9])[0] = ((0xA6 ^ 0x87) & ~(0x5B ^ 0x7A));
        MetadataCombat.lIIllIIlIIIIIl[1] = " ".length();
        MetadataCombat.lIIllIIlIIIIIl[2] = "  ".length();
        MetadataCombat.lIIllIIlIIIIIl[3] = "   ".length();
        MetadataCombat.lIIllIIlIIIIIl[4] = (0x31 ^ 0x35);
        MetadataCombat.lIIllIIlIIIIIl[5] = (0x5E ^ 0x5B);
        MetadataCombat.lIIllIIlIIIIIl[6] = (0x4B ^ 0x3E ^ (0x5A ^ 0x29));
        MetadataCombat.lIIllIIlIIIIIl[7] = (0x55 ^ 0x7A ^ (0x94 ^ 0xBC));
        MetadataCombat.lIIllIIlIIIIIl[8] = (0xA5 ^ 0x97 ^ (0x7 ^ 0x3D));
    }
    
    private static void llIlIllIllllIlI() {
        (lIIllIIlIIIIII = new String[MetadataCombat.lIIllIIlIIIIIl[7]])[MetadataCombat.lIIllIIlIIIIIl[0]] = llIlIllIllllIII("t/hKZFTJJF/VhhYqWBlxeg==", "fwJCu");
        MetadataCombat.lIIllIIlIIIIII[MetadataCombat.lIIllIIlIIIIIl[1]] = llIlIllIllllIII("+J3OYdZ+RWU=", "WSxzn");
        MetadataCombat.lIIllIIlIIIIII[MetadataCombat.lIIllIIlIIIIIl[2]] = llIlIllIllllIII("Kc4Wp4qYHdkvi4wPW4u2uzDxOU++/dwg", "wQquB");
        MetadataCombat.lIIllIIlIIIIII[MetadataCombat.lIIllIIlIIIIIl[3]] = llIlIllIllllIIl("GhsMKhktVAMtDC4RBCZY", "YtaHx");
        MetadataCombat.lIIllIIlIIIIII[MetadataCombat.lIIllIIlIIIIIl[4]] = llIlIllIllllIII("tKMT9bPRc50=", "GvpWe");
        MetadataCombat.lIIllIIlIIIIII[MetadataCombat.lIIllIIlIIIIIl[5]] = llIlIllIllllIIl("BD0rDS0zciQKODA3IwFs", "GRFoL");
        MetadataCombat.lIIllIIlIIIIII[MetadataCombat.lIIllIIlIIIIIl[6]] = llIlIllIllllIIl("bwwsBXQgGSoEJjw=", "OmBaT");
    }
    
    private static boolean llIlIllIllllllI(final int lllllllllllllIIlIllIIIllIIlIllll, final int lllllllllllllIIlIllIIIllIIlIlllI) {
        return lllllllllllllIIlIllIIIllIIlIllll < lllllllllllllIIlIllIIIllIIlIlllI;
    }
    
    private static String llIlIllIllllIIl(String lllllllllllllIIlIllIIIllIIlllIlI, final String lllllllllllllIIlIllIIIllIIlllIIl) {
        lllllllllllllIIlIllIIIllIIlllIlI = new String(Base64.getDecoder().decode(lllllllllllllIIlIllIIIllIIlllIlI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIIlIllIIIllIIllllIl = new StringBuilder();
        final char[] lllllllllllllIIlIllIIIllIIllllII = lllllllllllllIIlIllIIIllIIlllIIl.toCharArray();
        int lllllllllllllIIlIllIIIllIIlllIll = MetadataCombat.lIIllIIlIIIIIl[0];
        final byte lllllllllllllIIlIllIIIllIIllIlIl = (Object)lllllllllllllIIlIllIIIllIIlllIlI.toCharArray();
        final int lllllllllllllIIlIllIIIllIIllIlII = lllllllllllllIIlIllIIIllIIllIlIl.length;
        boolean lllllllllllllIIlIllIIIllIIllIIll = MetadataCombat.lIIllIIlIIIIIl[0] != 0;
        while (llIlIllIllllllI(lllllllllllllIIlIllIIIllIIllIIll ? 1 : 0, lllllllllllllIIlIllIIIllIIllIlII)) {
            final char lllllllllllllIIlIllIIIllIlIIIIII = lllllllllllllIIlIllIIIllIIllIlIl[lllllllllllllIIlIllIIIllIIllIIll];
            lllllllllllllIIlIllIIIllIIllllIl.append((char)(lllllllllllllIIlIllIIIllIlIIIIII ^ lllllllllllllIIlIllIIIllIIllllII[lllllllllllllIIlIllIIIllIIlllIll % lllllllllllllIIlIllIIIllIIllllII.length]));
            "".length();
            ++lllllllllllllIIlIllIIIllIIlllIll;
            ++lllllllllllllIIlIllIIIllIIllIIll;
            "".length();
            if (-" ".length() >= 0) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIIlIllIIIllIIllllIl);
    }
    
    private static boolean llIlIllIlllllIl(final Object lllllllllllllIIlIllIIIllIIlIllII) {
        return lllllllllllllIIlIllIIIllIIlIllII != null;
    }
    
    private static String llIlIllIllllIII(final String lllllllllllllIIlIllIIIllIlIIllll, final String lllllllllllllIIlIllIIIllIlIIlllI) {
        try {
            final SecretKeySpec lllllllllllllIIlIllIIIllIlIlIIlI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIIlIllIIIllIlIIlllI.getBytes(StandardCharsets.UTF_8)), MetadataCombat.lIIllIIlIIIIIl[8]), "DES");
            final Cipher lllllllllllllIIlIllIIIllIlIlIIIl = Cipher.getInstance("DES");
            lllllllllllllIIlIllIIIllIlIlIIIl.init(MetadataCombat.lIIllIIlIIIIIl[2], lllllllllllllIIlIllIIIllIlIlIIlI);
            return new String(lllllllllllllIIlIllIIIllIlIlIIIl.doFinal(Base64.getDecoder().decode(lllllllllllllIIlIllIIIllIlIIllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIlIllIIIllIlIlIIII) {
            lllllllllllllIIlIllIIIllIlIlIIII.printStackTrace();
            return null;
        }
    }
    
    public MetadataCombat(final EntityLivingBase lllllllllllllIIlIllIIIllIlIllIII, final EntityLivingBase lllllllllllllIIlIllIIIllIlIllIlI) {
        super(MetadataCombat.lIIllIIlIIIIII[MetadataCombat.lIIllIIlIIIIIl[0]]);
        this.func_152808_a(MetadataCombat.lIIllIIlIIIIII[MetadataCombat.lIIllIIlIIIIIl[1]], lllllllllllllIIlIllIIIllIlIllIII.getName());
        if (llIlIllIlllllIl(lllllllllllllIIlIllIIIllIlIllIlI)) {
            this.func_152808_a(MetadataCombat.lIIllIIlIIIIII[MetadataCombat.lIIllIIlIIIIIl[2]], lllllllllllllIIlIllIIIllIlIllIlI.getName());
        }
        if (llIlIllIlllllIl(lllllllllllllIIlIllIIIllIlIllIlI)) {
            this.func_152807_a(String.valueOf(new StringBuilder(MetadataCombat.lIIllIIlIIIIII[MetadataCombat.lIIllIIlIIIIIl[3]]).append(lllllllllllllIIlIllIIIllIlIllIII.getName()).append(MetadataCombat.lIIllIIlIIIIII[MetadataCombat.lIIllIIlIIIIIl[4]]).append(lllllllllllllIIlIllIIIllIlIllIlI.getName())));
            "".length();
            if ((0x2F ^ 0x2B) > (0x7 ^ 0x3)) {
                throw null;
            }
        }
        else {
            this.func_152807_a(String.valueOf(new StringBuilder(MetadataCombat.lIIllIIlIIIIII[MetadataCombat.lIIllIIlIIIIIl[5]]).append(lllllllllllllIIlIllIIIllIlIllIII.getName()).append(MetadataCombat.lIIllIIlIIIIII[MetadataCombat.lIIllIIlIIIIIl[6]])));
        }
    }
    
    static {
        llIlIllIlllllII();
        llIlIllIllllIlI();
    }
}
