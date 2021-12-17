// 
// Decompiled by Procyon v0.5.36
// 

package io.netty.handler.timeout;

import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.security.MessageDigest;
import java.nio.charset.StandardCharsets;
import java.util.Base64;

public enum IdleState
{
    WRITER_IDLE, 
    ALL_IDLE;
    
    private static final /* synthetic */ int[] llIIlllIIlllIl;
    
    READER_IDLE;
    
    private static final /* synthetic */ String[] llIIlllIIllIll;
    
    private static boolean lIIIlllllIIIIIlI(final int llllllllllllIllIlllllIIIIlIlIlll, final int llllllllllllIllIlllllIIIIlIlIllI) {
        return llllllllllllIllIlllllIIIIlIlIlll < llllllllllllIllIlllllIIIIlIlIllI;
    }
    
    private static String lIIIllllIllllllI(String llllllllllllIllIlllllIIIIllIllll, final String llllllllllllIllIlllllIIIIllIlllI) {
        llllllllllllIllIlllllIIIIllIllll = (float)new String(Base64.getDecoder().decode(((String)llllllllllllIllIlllllIIIIllIllll).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder llllllllllllIllIlllllIIIIlllIIlI = new StringBuilder();
        final char[] llllllllllllIllIlllllIIIIlllIIIl = llllllllllllIllIlllllIIIIllIlllI.toCharArray();
        int llllllllllllIllIlllllIIIIlllIIII = IdleState.llIIlllIIlllIl[0];
        final long llllllllllllIllIlllllIIIIllIlIlI = (Object)((String)llllllllllllIllIlllllIIIIllIllll).toCharArray();
        final char llllllllllllIllIlllllIIIIllIlIIl = (char)llllllllllllIllIlllllIIIIllIlIlI.length;
        boolean llllllllllllIllIlllllIIIIllIlIII = IdleState.llIIlllIIlllIl[0] != 0;
        while (lIIIlllllIIIIIlI(llllllllllllIllIlllllIIIIllIlIII ? 1 : 0, llllllllllllIllIlllllIIIIllIlIIl)) {
            final char llllllllllllIllIlllllIIIIlllIlIl = llllllllllllIllIlllllIIIIllIlIlI[llllllllllllIllIlllllIIIIllIlIII];
            llllllllllllIllIlllllIIIIlllIIlI.append((char)(llllllllllllIllIlllllIIIIlllIlIl ^ llllllllllllIllIlllllIIIIlllIIIl[llllllllllllIllIlllllIIIIlllIIII % llllllllllllIllIlllllIIIIlllIIIl.length]));
            "".length();
            ++llllllllllllIllIlllllIIIIlllIIII;
            ++llllllllllllIllIlllllIIIIllIlIII;
            "".length();
            if (-(0x19 ^ 0x1D) >= 0) {
                return null;
            }
        }
        return String.valueOf(llllllllllllIllIlllllIIIIlllIIlI);
    }
    
    private static void lIIIllllIlllllll() {
        (llIIlllIIllIll = new String[IdleState.llIIlllIIlllIl[3]])[IdleState.llIIlllIIlllIl[0]] = lIIIllllIlllllIl("yhGsy8IvhjKEQity26qNSA==", "luWMH");
        IdleState.llIIlllIIllIll[IdleState.llIIlllIIlllIl[1]] = lIIIllllIllllllI("BxUwGjACGDAKORU=", "PGyNu");
        IdleState.llIIlllIIllIll[IdleState.llIIlllIIlllIl[2]] = lIIIllllIlllllIl("0zflZADcA4QuUmcMRl37Uw==", "HgVmx");
    }
    
    private static void lIIIlllllIIIIIIl() {
        (llIIlllIIlllIl = new int[5])[0] = ((0xED ^ 0xC2) & ~(0x5F ^ 0x70));
        IdleState.llIIlllIIlllIl[1] = " ".length();
        IdleState.llIIlllIIlllIl[2] = "  ".length();
        IdleState.llIIlllIIlllIl[3] = "   ".length();
        IdleState.llIIlllIIlllIl[4] = (0x0 ^ 0x2F ^ (0x79 ^ 0x5E));
    }
    
    private static String lIIIllllIlllllIl(final String llllllllllllIllIlllllIIIIlIlllIl, final String llllllllllllIllIlllllIIIIlIlllII) {
        try {
            final SecretKeySpec llllllllllllIllIlllllIIIIllIIIlI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIllIlllllIIIIlIlllII.getBytes(StandardCharsets.UTF_8)), IdleState.llIIlllIIlllIl[4]), "DES");
            final Cipher llllllllllllIllIlllllIIIIllIIIIl = Cipher.getInstance("DES");
            llllllllllllIllIlllllIIIIllIIIIl.init(IdleState.llIIlllIIlllIl[2], llllllllllllIllIlllllIIIIllIIIlI);
            return new String(llllllllllllIllIlllllIIIIllIIIIl.doFinal(Base64.getDecoder().decode(llllllllllllIllIlllllIIIIlIlllIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIllIlllllIIIIllIIIII) {
            llllllllllllIllIlllllIIIIllIIIII.printStackTrace();
            return null;
        }
    }
    
    static {
        lIIIlllllIIIIIIl();
        lIIIllllIlllllll();
        final IdleState[] $values = new IdleState[IdleState.llIIlllIIlllIl[3]];
        $values[IdleState.llIIlllIIlllIl[0]] = IdleState.READER_IDLE;
        $values[IdleState.llIIlllIIlllIl[1]] = IdleState.WRITER_IDLE;
        $values[IdleState.llIIlllIIlllIl[2]] = IdleState.ALL_IDLE;
        $VALUES = $values;
    }
}
