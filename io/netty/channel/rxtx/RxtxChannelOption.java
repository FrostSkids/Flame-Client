// 
// Decompiled by Procyon v0.5.36
// 

package io.netty.channel.rxtx;

import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.security.MessageDigest;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import io.netty.channel.ChannelOption;

public final class RxtxChannelOption<T> extends ChannelOption<T>
{
    private static final /* synthetic */ String[] lIIlIIlIIIIlIl;
    private static final /* synthetic */ int[] lIIlIIlIIIlIII;
    
    private static String llIIlIlllllIIll(String lllllllllllllIIlllIIIlIIIIlIlllI, final String lllllllllllllIIlllIIIlIIIIllIlII) {
        lllllllllllllIIlllIIIlIIIIlIlllI = (char)new String(Base64.getDecoder().decode(((String)lllllllllllllIIlllIIIlIIIIlIlllI).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIIlllIIIlIIIIllIIll = new StringBuilder();
        final char[] lllllllllllllIIlllIIIlIIIIllIIIl = lllllllllllllIIlllIIIlIIIIllIlII.toCharArray();
        int lllllllllllllIIlllIIIlIIIIllIIII = RxtxChannelOption.lIIlIIlIIIlIII[0];
        final String lllllllllllllIIlllIIIlIIIIlIlIII = (Object)((String)lllllllllllllIIlllIIIlIIIIlIlllI).toCharArray();
        final long lllllllllllllIIlllIIIlIIIIlIIllI = lllllllllllllIIlllIIIlIIIIlIlIII.length;
        byte lllllllllllllIIlllIIIlIIIIlIIlII = (byte)RxtxChannelOption.lIIlIIlIIIlIII[0];
        while (llIIllIIIIIIIlI(lllllllllllllIIlllIIIlIIIIlIIlII, (int)lllllllllllllIIlllIIIlIIIIlIIllI)) {
            final char lllllllllllllIIlllIIIlIIIIllIllI = lllllllllllllIIlllIIIlIIIIlIlIII[lllllllllllllIIlllIIIlIIIIlIIlII];
            lllllllllllllIIlllIIIlIIIIllIIll.append((char)(lllllllllllllIIlllIIIlIIIIllIllI ^ lllllllllllllIIlllIIIlIIIIllIIIl[lllllllllllllIIlllIIIlIIIIllIIII % lllllllllllllIIlllIIIlIIIIllIIIl.length]));
            "".length();
            ++lllllllllllllIIlllIIIlIIIIllIIII;
            ++lllllllllllllIIlllIIIlIIIIlIIlII;
            "".length();
            if (null != null) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIIlllIIIlIIIIllIIll);
    }
    
    private static void llIIlIllllllIIl() {
        (lIIlIIlIIIIlIl = new String[RxtxChannelOption.lIIlIIlIIIlIII[8]])[RxtxChannelOption.lIIlIIlIIIlIII[0]] = llIIlIlllllIIlI("rknbJ/dKo8fur2B1ICxJ3w==", "TRgcX");
        RxtxChannelOption.lIIlIIlIIIIlIl[RxtxChannelOption.lIIlIIlIIIlIII[1]] = llIIlIlllllIIll("MAU0", "tQfaG");
        RxtxChannelOption.lIIlIIlIIIIlIl[RxtxChannelOption.lIIlIIlIIIlIII[2]] = llIIlIlllllIlII("FkQR77W+y7w=", "oJfAF");
        RxtxChannelOption.lIIlIIlIIIIlIl[RxtxChannelOption.lIIlIIlIIIlIII[3]] = llIIlIlllllIIll("Jx0gAAU2ADsD", "tIoPZ");
        RxtxChannelOption.lIIlIIlIIIIlIl[RxtxChannelOption.lIIlIIlIIIlIII[4]] = llIIlIlllllIlII("tQJNKtyYVkShRdrQairE/A==", "fsUYy");
        RxtxChannelOption.lIIlIIlIIIIlIl[RxtxChannelOption.lIIlIIlIIIlIII[5]] = llIIlIlllllIIll("Bi0iJiIPMzImIg==", "Vlpov");
        RxtxChannelOption.lIIlIIlIIIIlIl[RxtxChannelOption.lIIlIIlIIIlIII[6]] = llIIlIlllllIlII("hKcjVqP+tLJGx7A3CMVKbw==", "zftCJ");
        RxtxChannelOption.lIIlIIlIIIIlIl[RxtxChannelOption.lIIlIIlIIIlIII[7]] = llIIlIlllllIIll("EzwkNywVMCg2PBQt", "Ayess");
    }
    
    static {
        llIIllIIIIIIIII();
        llIIlIllllllIIl();
        BAUD_RATE = new RxtxChannelOption<Integer>(RxtxChannelOption.lIIlIIlIIIIlIl[RxtxChannelOption.lIIlIIlIIIlIII[0]]);
        DTR = new RxtxChannelOption<Boolean>(RxtxChannelOption.lIIlIIlIIIIlIl[RxtxChannelOption.lIIlIIlIIIlIII[1]]);
        RTS = new RxtxChannelOption<Boolean>(RxtxChannelOption.lIIlIIlIIIIlIl[RxtxChannelOption.lIIlIIlIIIlIII[2]]);
        STOP_BITS = new RxtxChannelOption<RxtxChannelConfig.Stopbits>(RxtxChannelOption.lIIlIIlIIIIlIl[RxtxChannelOption.lIIlIIlIIIlIII[3]]);
        DATA_BITS = new RxtxChannelOption<RxtxChannelConfig.Databits>(RxtxChannelOption.lIIlIIlIIIIlIl[RxtxChannelOption.lIIlIIlIIIlIII[4]]);
        PARITY_BIT = new RxtxChannelOption<RxtxChannelConfig.Paritybit>(RxtxChannelOption.lIIlIIlIIIIlIl[RxtxChannelOption.lIIlIIlIIIlIII[5]]);
        WAIT_TIME = new RxtxChannelOption<Integer>(RxtxChannelOption.lIIlIIlIIIIlIl[RxtxChannelOption.lIIlIIlIIIlIII[6]]);
        READ_TIMEOUT = new RxtxChannelOption<Integer>(RxtxChannelOption.lIIlIIlIIIIlIl[RxtxChannelOption.lIIlIIlIIIlIII[7]]);
    }
    
    private static boolean llIIllIIIIIIIlI(final int lllllllllllllIIlllIIIlIIIIIllIII, final int lllllllllllllIIlllIIIlIIIIIlIllI) {
        return lllllllllllllIIlllIIIlIIIIIllIII < lllllllllllllIIlllIIIlIIIIIlIllI;
    }
    
    private RxtxChannelOption(final String lllllllllllllIIlllIIIlIIIllllIll) {
        super(lllllllllllllIIlllIIIlIIIllllIll);
    }
    
    private static String llIIlIlllllIIlI(final String lllllllllllllIIlllIIIlIIIllIIIIl, final String lllllllllllllIIlllIIIlIIIllIIIlI) {
        try {
            final SecretKeySpec lllllllllllllIIlllIIIlIIIllIlIIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIIlllIIIlIIIllIIIlI.getBytes(StandardCharsets.UTF_8)), RxtxChannelOption.lIIlIIlIIIlIII[8]), "DES");
            final Cipher lllllllllllllIIlllIIIlIIIllIIlll = Cipher.getInstance("DES");
            lllllllllllllIIlllIIIlIIIllIIlll.init(RxtxChannelOption.lIIlIIlIIIlIII[2], lllllllllllllIIlllIIIlIIIllIlIIl);
            return new String(lllllllllllllIIlllIIIlIIIllIIlll.doFinal(Base64.getDecoder().decode(lllllllllllllIIlllIIIlIIIllIIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIlllIIIlIIIllIIlIl) {
            lllllllllllllIIlllIIIlIIIllIIlIl.printStackTrace();
            return null;
        }
    }
    
    private static String llIIlIlllllIlII(final String lllllllllllllIIlllIIIlIIIlIlIIIl, final String lllllllllllllIIlllIIIlIIIlIIlIll) {
        try {
            final SecretKeySpec lllllllllllllIIlllIIIlIIIlIlIlll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIIlllIIIlIIIlIIlIll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lllllllllllllIIlllIIIlIIIlIlIlIl = Cipher.getInstance("Blowfish");
            lllllllllllllIIlllIIIlIIIlIlIlIl.init(RxtxChannelOption.lIIlIIlIIIlIII[2], lllllllllllllIIlllIIIlIIIlIlIlll);
            return new String(lllllllllllllIIlllIIIlIIIlIlIlIl.doFinal(Base64.getDecoder().decode(lllllllllllllIIlllIIIlIIIlIlIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIlllIIIlIIIlIlIIll) {
            lllllllllllllIIlllIIIlIIIlIlIIll.printStackTrace();
            return null;
        }
    }
    
    private static void llIIllIIIIIIIII() {
        (lIIlIIlIIIlIII = new int[9])[0] = ((0xF1 ^ 0xBE ^ (0x86 ^ 0xC2)) & (0x29 ^ 0xA ^ (0x5A ^ 0x72) ^ -" ".length()));
        RxtxChannelOption.lIIlIIlIIIlIII[1] = " ".length();
        RxtxChannelOption.lIIlIIlIIIlIII[2] = "  ".length();
        RxtxChannelOption.lIIlIIlIIIlIII[3] = "   ".length();
        RxtxChannelOption.lIIlIIlIIIlIII[4] = (134 + 70 - 191 + 157 ^ 11 + 124 - 121 + 160);
        RxtxChannelOption.lIIlIIlIIIlIII[5] = (15 + 14 + 66 + 41 ^ 27 + 125 - 99 + 88);
        RxtxChannelOption.lIIlIIlIIIlIII[6] = (0x48 ^ 0x67 ^ (0x54 ^ 0x7D));
        RxtxChannelOption.lIIlIIlIIIlIII[7] = (0x26 ^ 0x21);
        RxtxChannelOption.lIIlIIlIIIlIII[8] = (0x0 ^ 0x8);
    }
}
