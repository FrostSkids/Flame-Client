// 
// Decompiled by Procyon v0.5.36
// 

package io.netty.handler.codec;

import java.util.Arrays;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.security.MessageDigest;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import io.netty.util.Signal;

public class DecoderResult
{
    protected static final /* synthetic */ Signal SIGNAL_UNFINISHED;
    private static final /* synthetic */ String[] lllIlIlIIIlIII;
    private static final /* synthetic */ int[] lllIlIlIIIlIll;
    protected static final /* synthetic */ Signal SIGNAL_SUCCESS;
    private final /* synthetic */ Throwable cause;
    
    protected DecoderResult(final Throwable llllllllllllIlIllIllIllIlIIllllI) {
        if (lIlIIIlIlIlllllI(llllllllllllIlIllIllIllIlIIllllI)) {
            throw new NullPointerException(DecoderResult.lllIlIlIIIlIII[DecoderResult.lllIlIlIIIlIll[1]]);
        }
        this.cause = llllllllllllIlIllIllIllIlIIllllI;
    }
    
    private static boolean lIlIIIlIllIIIIIl(final int llllllllllllIlIllIllIllIIlIIIlll) {
        return llllllllllllIlIllIllIllIIlIIIlll != 0;
    }
    
    private static boolean lIlIIIlIllIIIIII(final Object llllllllllllIlIllIllIllIIlIIllII, final Object llllllllllllIlIllIllIllIIlIIlIll) {
        return llllllllllllIlIllIllIllIIlIIllII == llllllllllllIlIllIllIllIIlIIlIll;
    }
    
    private static void lIlIIIlIlIllllIl() {
        (lllIlIlIIIlIll = new int[11])[0] = ((0x9E ^ 0x92) & ~(0x9F ^ 0x93));
        DecoderResult.lllIlIlIIIlIll[1] = " ".length();
        DecoderResult.lllIlIlIIIlIll[2] = "  ".length();
        DecoderResult.lllIlIlIIIlIll[3] = (0xD ^ 0x1C);
        DecoderResult.lllIlIlIIIlIll[4] = "   ".length();
        DecoderResult.lllIlIlIIIlIll[5] = (0x9B ^ 0xB2);
        DecoderResult.lllIlIlIIIlIll[6] = (0x8 ^ 0xC);
        DecoderResult.lllIlIlIIIlIll[7] = (0x6 ^ 0x3E ^ (0x4 ^ 0x39));
        DecoderResult.lllIlIlIIIlIll[8] = (0x10 ^ 0x0 ^ (0x69 ^ 0x7F));
        DecoderResult.lllIlIlIIIlIll[9] = (0x2C ^ 0x2B);
        DecoderResult.lllIlIlIIIlIll[10] = (0x5E ^ 0x56);
    }
    
    private static boolean lIlIIIlIlIllllll(final Object llllllllllllIlIllIllIllIIlIlIIII, final Object llllllllllllIlIllIllIllIIlIIllll) {
        return llllllllllllIlIllIllIllIIlIlIIII != llllllllllllIlIllIllIllIIlIIllll;
    }
    
    public boolean isSuccess() {
        int n;
        if (lIlIIIlIllIIIIII(this.cause, DecoderResult.SIGNAL_SUCCESS)) {
            n = DecoderResult.lllIlIlIIIlIll[1];
            "".length();
            if (-" ".length() >= "  ".length()) {
                return ("   ".length() & ("   ".length() ^ -" ".length())) != 0x0;
            }
        }
        else {
            n = DecoderResult.lllIlIlIIIlIll[0];
        }
        return n != 0;
    }
    
    public boolean isFailure() {
        int n;
        if (lIlIIIlIlIllllll(this.cause, DecoderResult.SIGNAL_SUCCESS) && lIlIIIlIlIllllll(this.cause, DecoderResult.SIGNAL_UNFINISHED)) {
            n = DecoderResult.lllIlIlIIIlIll[1];
            "".length();
            if (null != null) {
                return ((0x27 ^ 0x1) & ~(0x9F ^ 0xB9)) != 0x0;
            }
        }
        else {
            n = DecoderResult.lllIlIlIIIlIll[0];
        }
        return n != 0;
    }
    
    private static String lIlIIIlIlIlIIllI(String llllllllllllIlIllIllIllIIllllIIl, final String llllllllllllIlIllIllIllIIllllIII) {
        llllllllllllIlIllIllIllIIllllIIl = (char)new String(Base64.getDecoder().decode(((String)llllllllllllIlIllIllIllIIllllIIl).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder llllllllllllIlIllIllIllIIlllllII = new StringBuilder();
        final char[] llllllllllllIlIllIllIllIIllllIll = llllllllllllIlIllIllIllIIllllIII.toCharArray();
        int llllllllllllIlIllIllIllIIllllIlI = DecoderResult.lllIlIlIIIlIll[0];
        final double llllllllllllIlIllIllIllIIlllIlII = (Object)((String)llllllllllllIlIllIllIllIIllllIIl).toCharArray();
        final double llllllllllllIlIllIllIllIIlllIIll = llllllllllllIlIllIllIllIIlllIlII.length;
        float llllllllllllIlIllIllIllIIlllIIlI = DecoderResult.lllIlIlIIIlIll[0];
        while (lIlIIIlIllIIIIlI((int)llllllllllllIlIllIllIllIIlllIIlI, (int)llllllllllllIlIllIllIllIIlllIIll)) {
            final char llllllllllllIlIllIllIllIIlllllll = llllllllllllIlIllIllIllIIlllIlII[llllllllllllIlIllIllIllIIlllIIlI];
            llllllllllllIlIllIllIllIIlllllII.append((char)(llllllllllllIlIllIllIllIIlllllll ^ llllllllllllIlIllIllIllIIllllIll[llllllllllllIlIllIllIllIIllllIlI % llllllllllllIlIllIllIllIIllllIll.length]));
            "".length();
            ++llllllllllllIlIllIllIllIIllllIlI;
            ++llllllllllllIlIllIllIllIIlllIIlI;
            "".length();
            if (-" ".length() > 0) {
                return null;
            }
        }
        return String.valueOf(llllllllllllIlIllIllIllIIlllllII);
    }
    
    private static void lIlIIIlIlIlIlIIl() {
        (lllIlIlIIIlIII = new String[DecoderResult.lllIlIlIIIlIll[9]])[DecoderResult.lllIlIlIIIlIll[0]] = lIlIIIlIlIlIIllI("BQktOyk=", "fhXHL");
        DecoderResult.lllIlIlIIIlIII[DecoderResult.lllIlIlIIIlIll[1]] = lIlIIIlIlIlIIlll("weog4qsj+HM=", "fYSwQ");
        DecoderResult.lllIlIlIIIlIII[DecoderResult.lllIlIlIIIlIll[2]] = lIlIIIlIlIlIlIII("oPWGYaY6Lhw=", "RoPma");
        DecoderResult.lllIlIlIIIlIII[DecoderResult.lllIlIlIIIlIll[4]] = lIlIIIlIlIlIIllI("HiAoCQwKJGk=", "xAAey");
        DecoderResult.lllIlIlIIIlIII[DecoderResult.lllIlIlIIIlIll[6]] = lIlIIIlIlIlIlIII("xt76H/F6uuN4iwa4kKDYSQ==", "SCDup");
        DecoderResult.lllIlIlIIIlIII[DecoderResult.lllIlIlIIIlIll[7]] = lIlIIIlIlIlIIllI("QTgPIiEhJBIsLSs=", "omAdh");
        DecoderResult.lllIlIlIIIlIII[DecoderResult.lllIlIlIIIlIll[8]] = lIlIIIlIlIlIIlll("e/jczyREB6ZgqJUbA/OQPg==", "kPljx");
    }
    
    @Override
    public String toString() {
        if (!lIlIIIlIllIIIIIl(this.isFinished() ? 1 : 0)) {
            return DecoderResult.lllIlIlIIIlIII[DecoderResult.lllIlIlIIIlIll[6]];
        }
        if (lIlIIIlIllIIIIIl(this.isSuccess() ? 1 : 0)) {
            return DecoderResult.lllIlIlIIIlIII[DecoderResult.lllIlIlIIIlIll[2]];
        }
        final String llllllllllllIlIllIllIllIlIIIlllI = this.cause().toString();
        final StringBuilder llllllllllllIlIllIllIllIlIIIllIl = new StringBuilder(llllllllllllIlIllIllIllIlIIIlllI.length() + DecoderResult.lllIlIlIIIlIll[3]);
        llllllllllllIlIllIllIllIlIIIllIl.append(DecoderResult.lllIlIlIIIlIII[DecoderResult.lllIlIlIIIlIll[4]]);
        "".length();
        llllllllllllIlIllIllIllIlIIIllIl.append(llllllllllllIlIllIllIllIlIIIlllI);
        "".length();
        llllllllllllIlIllIllIllIlIIIllIl.append((char)DecoderResult.lllIlIlIIIlIll[5]);
        "".length();
        return String.valueOf(llllllllllllIlIllIllIllIlIIIllIl);
    }
    
    static {
        lIlIIIlIlIllllIl();
        lIlIIIlIlIlIlIIl();
        SIGNAL_UNFINISHED = Signal.valueOf(String.valueOf(new StringBuilder().append(DecoderResult.class.getName()).append(DecoderResult.lllIlIlIIIlIII[DecoderResult.lllIlIlIIIlIll[7]])));
        SIGNAL_SUCCESS = Signal.valueOf(String.valueOf(new StringBuilder().append(DecoderResult.class.getName()).append(DecoderResult.lllIlIlIIIlIII[DecoderResult.lllIlIlIIIlIll[8]])));
        UNFINISHED = new DecoderResult(DecoderResult.SIGNAL_UNFINISHED);
        SUCCESS = new DecoderResult(DecoderResult.SIGNAL_SUCCESS);
    }
    
    private static boolean lIlIIIlIlIlllllI(final Object llllllllllllIlIllIllIllIIlIIlIIl) {
        return llllllllllllIlIllIllIllIIlIIlIIl == null;
    }
    
    private static boolean lIlIIIlIllIIIIlI(final int llllllllllllIlIllIllIllIIlIlIlII, final int llllllllllllIlIllIllIllIIlIlIIll) {
        return llllllllllllIlIllIllIllIIlIlIlII < llllllllllllIlIllIllIllIIlIlIIll;
    }
    
    private static String lIlIIIlIlIlIlIII(final String llllllllllllIlIllIllIllIIlIlllII, final String llllllllllllIlIllIllIllIIlIllIll) {
        try {
            final SecretKeySpec llllllllllllIlIllIllIllIIlIlllll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIlIllIllIllIIlIllIll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher llllllllllllIlIllIllIllIIlIllllI = Cipher.getInstance("Blowfish");
            llllllllllllIlIllIllIllIIlIllllI.init(DecoderResult.lllIlIlIIIlIll[2], llllllllllllIlIllIllIllIIlIlllll);
            return new String(llllllllllllIlIllIllIllIIlIllllI.doFinal(Base64.getDecoder().decode(llllllllllllIlIllIllIllIIlIlllII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIlIllIllIllIIlIlllIl) {
            llllllllllllIlIllIllIllIIlIlllIl.printStackTrace();
            return null;
        }
    }
    
    private static String lIlIIIlIlIlIIlll(final String llllllllllllIlIllIllIllIIllIIlll, final String llllllllllllIlIllIllIllIIllIlIII) {
        try {
            final SecretKeySpec llllllllllllIlIllIllIllIIllIllII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIlIllIllIllIIllIlIII.getBytes(StandardCharsets.UTF_8)), DecoderResult.lllIlIlIIIlIll[10]), "DES");
            final Cipher llllllllllllIlIllIllIllIIllIlIll = Cipher.getInstance("DES");
            llllllllllllIlIllIllIllIIllIlIll.init(DecoderResult.lllIlIlIIIlIll[2], llllllllllllIlIllIllIllIIllIllII);
            return new String(llllllllllllIlIllIllIllIIllIlIll.doFinal(Base64.getDecoder().decode(llllllllllllIlIllIllIllIIllIIlll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIlIllIllIllIIllIlIlI) {
            llllllllllllIlIllIllIllIIllIlIlI.printStackTrace();
            return null;
        }
    }
    
    public Throwable cause() {
        if (lIlIIIlIllIIIIIl(this.isFailure() ? 1 : 0)) {
            return this.cause;
        }
        return null;
    }
    
    public static DecoderResult failure(final Throwable llllllllllllIlIllIllIllIlIlIIlII) {
        if (lIlIIIlIlIlllllI(llllllllllllIlIllIllIllIlIlIIlII)) {
            throw new NullPointerException(DecoderResult.lllIlIlIIIlIII[DecoderResult.lllIlIlIIIlIll[0]]);
        }
        return new DecoderResult(llllllllllllIlIllIllIllIlIlIIlII);
    }
    
    public boolean isFinished() {
        int n;
        if (lIlIIIlIlIllllll(this.cause, DecoderResult.SIGNAL_UNFINISHED)) {
            n = DecoderResult.lllIlIlIIIlIll[1];
            "".length();
            if ((131 + 30 - 120 + 97 ^ 92 + 38 - 128 + 140) != (0x5E ^ 0x59 ^ "   ".length())) {
                return ((0xB4 ^ 0xBD ^ (0x1E ^ 0x2)) & (0xE9 ^ 0xB4 ^ (0xCD ^ 0x85) ^ -" ".length())) != 0x0;
            }
        }
        else {
            n = DecoderResult.lllIlIlIIIlIll[0];
        }
        return n != 0;
    }
}
