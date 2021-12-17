import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import net.minecraft.client.main.Main;

// 
// Decompiled by Procyon v0.5.36
// 

public class Start
{
    private static final /* synthetic */ String[] lIIIlIlIllIIII;
    private static final /* synthetic */ int[] lIIIlIlIllIllI;
    
    public static void main(final String[] lllllllllllllIlIIIIllIIllIlIIlll) {
        final String[] lllllllllllllIlIIIIllIIllIlIIIII = new String[Start.lIIIlIlIllIllI[0]];
        lllllllllllllIlIIIIllIIllIlIIIII[Start.lIIIlIlIllIllI[1]] = Start.lIIIlIlIllIIII[Start.lIIIlIlIllIllI[1]];
        lllllllllllllIlIIIIllIIllIlIIIII[Start.lIIIlIlIllIllI[2]] = Start.lIIIlIlIllIIII[Start.lIIIlIlIllIllI[2]];
        lllllllllllllIlIIIIllIIllIlIIIII[Start.lIIIlIlIllIllI[3]] = Start.lIIIlIlIllIIII[Start.lIIIlIlIllIllI[3]];
        lllllllllllllIlIIIIllIIllIlIIIII[Start.lIIIlIlIllIllI[4]] = Start.lIIIlIlIllIIII[Start.lIIIlIlIllIllI[4]];
        lllllllllllllIlIIIIllIIllIlIIIII[Start.lIIIlIlIllIllI[5]] = Start.lIIIlIlIllIIII[Start.lIIIlIlIllIllI[5]];
        lllllllllllllIlIIIIllIIllIlIIIII[Start.lIIIlIlIllIllI[6]] = Start.lIIIlIlIllIIII[Start.lIIIlIlIllIllI[6]];
        lllllllllllllIlIIIIllIIllIlIIIII[Start.lIIIlIlIllIllI[7]] = Start.lIIIlIlIllIIII[Start.lIIIlIlIllIllI[7]];
        lllllllllllllIlIIIIllIIllIlIIIII[Start.lIIIlIlIllIllI[8]] = Start.lIIIlIlIllIIII[Start.lIIIlIlIllIllI[8]];
        lllllllllllllIlIIIIllIIllIlIIIII[Start.lIIIlIlIllIllI[9]] = Start.lIIIlIlIllIIII[Start.lIIIlIlIllIllI[9]];
        lllllllllllllIlIIIIllIIllIlIIIII[Start.lIIIlIlIllIllI[10]] = Start.lIIIlIlIllIIII[Start.lIIIlIlIllIllI[10]];
        Main.main(concat(lllllllllllllIlIIIIllIIllIlIIIII, lllllllllllllIlIIIIllIIllIlIIlll));
    }
    
    private static void llIIIIIlIlIlIll() {
        (lIIIlIlIllIIII = new String[Start.lIIIlIlIllIllI[0]])[Start.lIIIlIlIllIllI[1]] = llIIIIIlIIlllll("hyKmr5Nk2a0IML7ht0tOmg==", "MKqRu");
        Start.lIIIlIlIllIIII[Start.lIIIlIlIllIllI[2]] = llIIIIIlIlIIIII("fZsrRNKIS2U=", "vJVMu");
        Start.lIIIlIlIllIIII[Start.lIIIlIlIllIllI[3]] = llIIIIIlIlIIIII("wRpLfof3DICKmdywxE9j9w==", "Rnkdf");
        Start.lIIIlIlIllIIII[Start.lIIIlIlIllIllI[4]] = llIIIIIlIlIIIII("dY467GxUtzo=", "UjzSr");
        Start.lIIIlIlIllIIII[Start.lIIIlIlIllIllI[5]] = llIIIIIlIlIIIIl("ZGciBBYsPjAzDDs=", "IJCwe");
        Start.lIIIlIlIllIIII[Start.lIIIlIlIllIllI[6]] = llIIIIIlIlIIIII("5erZ4bQUVGU=", "RUyYk");
        Start.lIIIlIlIllIIII[Start.lIIIlIlIllIllI[7]] = llIIIIIlIlIIIII("g70FHUdK1Uu3zU/QX5vjXA==", "UhMAh");
        Start.lIIIlIlIllIIII[Start.lIIIlIlIllIllI[8]] = llIIIIIlIlIIIII("knXDZ60au/g=", "AofPD");
        Start.lIIIlIlIllIIII[Start.lIIIlIlIllIllI[9]] = llIIIIIlIIlllll("3nxOQsShRaKNM3reWcW92x4gA0HEiPs+", "hPzkr");
        Start.lIIIlIlIllIIII[Start.lIIIlIlIllIllI[10]] = llIIIIIlIIlllll("rmvRmBepYW8=", "rUdnx");
    }
    
    static {
        llIIIIIlIllIIll();
        llIIIIIlIlIlIll();
    }
    
    private static void llIIIIIlIllIIll() {
        (lIIIlIlIllIllI = new int[11])[0] = (0x0 ^ 0xD ^ (0x4F ^ 0x48));
        Start.lIIIlIlIllIllI[1] = ((0xE2 ^ 0xBA) & ~(0x1A ^ 0x42));
        Start.lIIIlIlIllIllI[2] = " ".length();
        Start.lIIIlIlIllIllI[3] = "  ".length();
        Start.lIIIlIlIllIllI[4] = "   ".length();
        Start.lIIIlIlIllIllI[5] = (0x67 ^ 0x5F ^ (0x26 ^ 0x1A));
        Start.lIIIlIlIllIllI[6] = (0x3C ^ 0x68 ^ (0x19 ^ 0x48));
        Start.lIIIlIlIllIllI[7] = (0xFB ^ 0x9D ^ (0x52 ^ 0x32));
        Start.lIIIlIlIllIllI[8] = (0x4B ^ 0x5D ^ (0x42 ^ 0x53));
        Start.lIIIlIlIllIllI[9] = (0x4 ^ 0xC);
        Start.lIIIlIlIllIllI[10] = (0x89 ^ 0xB1 ^ (0x6E ^ 0x5F));
    }
    
    private static boolean llIIIIIlIllIlII(final int lllllllllllllIlIIIIllIIlIllIlIIl, final int lllllllllllllIlIIIIllIIlIllIlIII) {
        return lllllllllllllIlIIIIllIIlIllIlIIl < lllllllllllllIlIIIIllIIlIllIlIII;
    }
    
    private static String llIIIIIlIIlllll(final String lllllllllllllIlIIIIllIIlIllIllll, final String lllllllllllllIlIIIIllIIlIlllIIII) {
        try {
            final SecretKeySpec lllllllllllllIlIIIIllIIlIlllIlII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIlIIIIllIIlIlllIIII.getBytes(StandardCharsets.UTF_8)), Start.lIIIlIlIllIllI[9]), "DES");
            final Cipher lllllllllllllIlIIIIllIIlIlllIIll = Cipher.getInstance("DES");
            lllllllllllllIlIIIIllIIlIlllIIll.init(Start.lIIIlIlIllIllI[3], lllllllllllllIlIIIIllIIlIlllIlII);
            return new String(lllllllllllllIlIIIIllIIlIlllIIll.doFinal(Base64.getDecoder().decode(lllllllllllllIlIIIIllIIlIllIllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIlIIIIllIIlIlllIIlI) {
            lllllllllllllIlIIIIllIIlIlllIIlI.printStackTrace();
            return null;
        }
    }
    
    public static <T> T[] concat(final T[] lllllllllllllIlIIIIllIIllIlIIIII, final T[] lllllllllllllIlIIIIllIIllIlIIIlI) {
        final Object[] lllllllllllllIlIIIIllIIllIlIIIIl = Arrays.copyOf(lllllllllllllIlIIIIllIIllIlIIIII, lllllllllllllIlIIIIllIIllIlIIIII.length + lllllllllllllIlIIIIllIIllIlIIIlI.length);
        System.arraycopy(lllllllllllllIlIIIIllIIllIlIIIlI, Start.lIIIlIlIllIllI[1], lllllllllllllIlIIIIllIIllIlIIIIl, lllllllllllllIlIIIIllIIllIlIIIII.length, lllllllllllllIlIIIIllIIllIlIIIlI.length);
        return (T[])lllllllllllllIlIIIIllIIllIlIIIIl;
    }
    
    private static String llIIIIIlIlIIIII(final String lllllllllllllIlIIIIllIIllIIlIlII, final String lllllllllllllIlIIIIllIIllIIlIlIl) {
        try {
            final SecretKeySpec lllllllllllllIlIIIIllIIllIIllIIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIlIIIIllIIllIIlIlIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lllllllllllllIlIIIIllIIllIIllIII = Cipher.getInstance("Blowfish");
            lllllllllllllIlIIIIllIIllIIllIII.init(Start.lIIIlIlIllIllI[3], lllllllllllllIlIIIIllIIllIIllIIl);
            return new String(lllllllllllllIlIIIIllIIllIIllIII.doFinal(Base64.getDecoder().decode(lllllllllllllIlIIIIllIIllIIlIlII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIlIIIIllIIllIIlIlll) {
            lllllllllllllIlIIIIllIIllIIlIlll.printStackTrace();
            return null;
        }
    }
    
    private static String llIIIIIlIlIIIIl(String lllllllllllllIlIIIIllIIllIIIIIIl, final String lllllllllllllIlIIIIllIIllIIIIlIl) {
        lllllllllllllIlIIIIllIIllIIIIIIl = (float)new String(Base64.getDecoder().decode(((String)lllllllllllllIlIIIIllIIllIIIIIIl).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIlIIIIllIIllIIIIlII = new StringBuilder();
        final char[] lllllllllllllIlIIIIllIIllIIIIIll = lllllllllllllIlIIIIllIIllIIIIlIl.toCharArray();
        int lllllllllllllIlIIIIllIIllIIIIIlI = Start.lIIIlIlIllIllI[1];
        final Exception lllllllllllllIlIIIIllIIlIlllllII = (Object)((String)lllllllllllllIlIIIIllIIllIIIIIIl).toCharArray();
        final long lllllllllllllIlIIIIllIIlIllllIll = lllllllllllllIlIIIIllIIlIlllllII.length;
        boolean lllllllllllllIlIIIIllIIlIllllIlI = Start.lIIIlIlIllIllI[1] != 0;
        while (llIIIIIlIllIlII(lllllllllllllIlIIIIllIIlIllllIlI ? 1 : 0, (int)lllllllllllllIlIIIIllIIlIllllIll)) {
            final char lllllllllllllIlIIIIllIIllIIIIlll = lllllllllllllIlIIIIllIIlIlllllII[lllllllllllllIlIIIIllIIlIllllIlI];
            lllllllllllllIlIIIIllIIllIIIIlII.append((char)(lllllllllllllIlIIIIllIIllIIIIlll ^ lllllllllllllIlIIIIllIIllIIIIIll[lllllllllllllIlIIIIllIIllIIIIIlI % lllllllllllllIlIIIIllIIllIIIIIll.length]));
            "".length();
            ++lllllllllllllIlIIIIllIIllIIIIIlI;
            ++lllllllllllllIlIIIIllIIlIllllIlI;
            "".length();
            if (-(0x84 ^ 0x80) >= 0) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIlIIIIllIIllIIIIlII);
    }
}
