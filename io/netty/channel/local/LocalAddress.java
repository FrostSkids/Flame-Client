// 
// Decompiled by Procyon v0.5.36
// 

package io.netty.channel.local;

import java.util.Arrays;
import io.netty.channel.Channel;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.net.SocketAddress;

public final class LocalAddress extends SocketAddress implements Comparable<LocalAddress>
{
    private final /* synthetic */ String strVal;
    private static final /* synthetic */ int[] lIlIIlIllllIIl;
    private final /* synthetic */ String id;
    private static final /* synthetic */ String[] lIlIIlIllllIII;
    
    private static boolean lllIIllIllllIll(final Object lllllllllllllIIIllIlIlIlIIIIIIIl) {
        return lllllllllllllIIIllIlIlIlIIIIIIIl == null;
    }
    
    private static boolean lllIIllIlllllII(final int lllllllllllllIIIllIlIlIIllllllll) {
        return lllllllllllllIIIllIlIlIIllllllll != 0;
    }
    
    private static String lllIIllIlllIllI(final String lllllllllllllIIIllIlIlIlIIIlIlIl, final String lllllllllllllIIIllIlIlIlIIIlIlII) {
        try {
            final SecretKeySpec lllllllllllllIIIllIlIlIlIIIllIII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIIIllIlIlIlIIIlIlII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lllllllllllllIIIllIlIlIlIIIlIlll = Cipher.getInstance("Blowfish");
            lllllllllllllIIIllIlIlIlIIIlIlll.init(LocalAddress.lIlIIlIllllIIl[6], lllllllllllllIIIllIlIlIlIIIllIII);
            return new String(lllllllllllllIIIllIlIlIlIIIlIlll.doFinal(Base64.getDecoder().decode(lllllllllllllIIIllIlIlIlIIIlIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIIllIlIlIlIIIlIllI) {
            lllllllllllllIIIllIlIlIlIIIlIllI.printStackTrace();
            return null;
        }
    }
    
    private static void lllIIllIllllIlI() {
        (lIlIIlIllllIIl = new int[11])[0] = (0x41 ^ 0x7 ^ (0xDE ^ 0x88));
        LocalAddress.lIlIIlIllllIIl[1] = ((0x8B ^ 0x8D) & ~(0x9C ^ 0x9A));
        LocalAddress.lIlIIlIllllIIl[2] = (0x2B ^ 0x2C);
        LocalAddress.lIlIIlIllllIIl[3] = (((0x37 ^ 0x11) & ~(0xE5 ^ 0xC3)) ^ (0xE ^ 0x34));
        LocalAddress.lIlIIlIllllIIl[4] = (0x28 ^ 0x2E);
        LocalAddress.lIlIIlIllllIIl[5] = " ".length();
        LocalAddress.lIlIIlIllllIIl[6] = "  ".length();
        LocalAddress.lIlIIlIllllIIl[7] = "   ".length();
        LocalAddress.lIlIIlIllllIIl[8] = (0x56 ^ 0x52);
        LocalAddress.lIlIIlIllllIIl[9] = (0x1 ^ 0x4);
        LocalAddress.lIlIIlIllllIIl[10] = (0x1C ^ 0x62 ^ (0x3E ^ 0x48));
    }
    
    public LocalAddress(String lllllllllllllIIIllIlIlIlIIlllIII) {
        if (lllIIllIllllIll(lllllllllllllIIIllIlIlIlIIlllIII)) {
            throw new NullPointerException(LocalAddress.lIlIIlIllllIII[LocalAddress.lIlIIlIllllIIl[5]]);
        }
        lllllllllllllIIIllIlIlIlIIlllIII = lllllllllllllIIIllIlIlIlIIlllIII.trim().toLowerCase();
        if (lllIIllIlllllII(lllllllllllllIIIllIlIlIlIIlllIII.isEmpty() ? 1 : 0)) {
            throw new IllegalArgumentException(LocalAddress.lIlIIlIllllIII[LocalAddress.lIlIIlIllllIIl[6]]);
        }
        this.id = lllllllllllllIIIllIlIlIlIIlllIII;
        this.strVal = String.valueOf(new StringBuilder().append(LocalAddress.lIlIIlIllllIII[LocalAddress.lIlIIlIllllIIl[7]]).append(lllllllllllllIIIllIlIlIlIIlllIII));
    }
    
    @Override
    public int compareTo(final LocalAddress lllllllllllllIIIllIlIlIlIIlIIllI) {
        return this.id.compareTo(lllllllllllllIIIllIlIlIlIIlIIllI.id);
    }
    
    public String id() {
        return this.id;
    }
    
    LocalAddress(final Channel lllllllllllllIIIllIlIlIlIlIIIIlI) {
        final StringBuilder lllllllllllllIIIllIlIlIlIlIIIIIl = new StringBuilder(LocalAddress.lIlIIlIllllIIl[0]);
        lllllllllllllIIIllIlIlIlIlIIIIIl.append(LocalAddress.lIlIIlIllllIII[LocalAddress.lIlIIlIllllIIl[1]]);
        "".length();
        lllllllllllllIIIllIlIlIlIlIIIIIl.append(Long.toHexString(((long)lllllllllllllIIIllIlIlIlIlIIIIlI.hashCode() & 0xFFFFFFFFL) | 0x100000000L));
        "".length();
        lllllllllllllIIIllIlIlIlIlIIIIIl.setCharAt(LocalAddress.lIlIIlIllllIIl[2], (char)LocalAddress.lIlIIlIllllIIl[3]);
        this.id = lllllllllllllIIIllIlIlIlIlIIIIIl.substring(LocalAddress.lIlIIlIllllIIl[4]);
        this.strVal = String.valueOf(lllllllllllllIIIllIlIlIlIlIIIIIl);
    }
    
    private static boolean lllIIllIlllllIl(final int lllllllllllllIIIllIlIlIIllllllIl) {
        return lllllllllllllIIIllIlIlIIllllllIl == 0;
    }
    
    @Override
    public int hashCode() {
        return this.id.hashCode();
    }
    
    @Override
    public boolean equals(final Object lllllllllllllIIIllIlIlIlIIlIllII) {
        if (lllIIllIlllllIl((lllllllllllllIIIllIlIlIlIIlIllII instanceof LocalAddress) ? 1 : 0)) {
            return LocalAddress.lIlIIlIllllIIl[1] != 0;
        }
        return this.id.equals(((LocalAddress)lllllllllllllIIIllIlIlIlIIlIllII).id);
    }
    
    private static void lllIIllIllllIII() {
        (lIlIIlIllllIII = new String[LocalAddress.lIlIIlIllllIIl[9]])[LocalAddress.lIlIIlIllllIIl[1]] = lllIIllIlllIllI("y09xXXRT+Vo=", "sAweD");
        LocalAddress.lIlIIlIllllIII[LocalAddress.lIlIIlIllllIIl[5]] = lllIIllIlllIlll("GfKc7kmPMjE=", "OzaNG");
        LocalAddress.lIlIIlIllllIII[LocalAddress.lIlIIlIllllIIl[6]] = lllIIllIlllIlll("xCDj2CcuSOWVDL7AVb7xWw==", "IbXMS");
        LocalAddress.lIlIIlIllllIII[LocalAddress.lIlIIlIllllIIl[7]] = lllIIllIlllIlll("CILLxF4b6qE=", "UlDLr");
        LocalAddress.lIlIIlIllllIII[LocalAddress.lIlIIlIllllIIl[8]] = lllIIllIlllIlll("gvHCym65cls=", "vTOBB");
    }
    
    static {
        lllIIllIllllIlI();
        lllIIllIllllIII();
        ANY = new LocalAddress(LocalAddress.lIlIIlIllllIII[LocalAddress.lIlIIlIllllIIl[8]]);
    }
    
    @Override
    public String toString() {
        return this.strVal;
    }
    
    private static String lllIIllIlllIlll(final String lllllllllllllIIIllIlIlIlIIIIIllI, final String lllllllllllllIIIllIlIlIlIIIIIlIl) {
        try {
            final SecretKeySpec lllllllllllllIIIllIlIlIlIIIIlIll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIIIllIlIlIlIIIIIlIl.getBytes(StandardCharsets.UTF_8)), LocalAddress.lIlIIlIllllIIl[10]), "DES");
            final Cipher lllllllllllllIIIllIlIlIlIIIIlIlI = Cipher.getInstance("DES");
            lllllllllllllIIIllIlIlIlIIIIlIlI.init(LocalAddress.lIlIIlIllllIIl[6], lllllllllllllIIIllIlIlIlIIIIlIll);
            return new String(lllllllllllllIIIllIlIlIlIIIIlIlI.doFinal(Base64.getDecoder().decode(lllllllllllllIIIllIlIlIlIIIIIllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIIllIlIlIlIIIIlIIl) {
            lllllllllllllIIIllIlIlIlIIIIlIIl.printStackTrace();
            return null;
        }
    }
}
