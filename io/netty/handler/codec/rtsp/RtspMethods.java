// 
// Decompiled by Procyon v0.5.36
// 

package io.netty.handler.codec.rtsp;

import java.util.Arrays;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.HashMap;
import java.util.Map;
import io.netty.handler.codec.http.HttpMethod;

public final class RtspMethods
{
    public static final /* synthetic */ HttpMethod REDIRECT;
    public static final /* synthetic */ HttpMethod SETUP;
    public static final /* synthetic */ HttpMethod SET_PARAMETER;
    private static final /* synthetic */ int[] llIllIIlIllllI;
    public static final /* synthetic */ HttpMethod OPTIONS;
    private static final /* synthetic */ String[] llIllIIlIlllIl;
    private static final /* synthetic */ Map<String, HttpMethod> methodMap;
    public static final /* synthetic */ HttpMethod TEARDOWN;
    public static final /* synthetic */ HttpMethod PLAY;
    public static final /* synthetic */ HttpMethod RECORD;
    public static final /* synthetic */ HttpMethod PAUSE;
    public static final /* synthetic */ HttpMethod DESCRIBE;
    public static final /* synthetic */ HttpMethod GET_PARAMETER;
    public static final /* synthetic */ HttpMethod ANNOUNCE;
    
    private RtspMethods() {
    }
    
    static {
        lIIlIlllIIIIlIII();
        lIIlIlllIIIIIlll();
        OPTIONS = HttpMethod.OPTIONS;
        DESCRIBE = new HttpMethod(RtspMethods.llIllIIlIlllIl[RtspMethods.llIllIIlIllllI[2]]);
        ANNOUNCE = new HttpMethod(RtspMethods.llIllIIlIlllIl[RtspMethods.llIllIIlIllllI[3]]);
        SETUP = new HttpMethod(RtspMethods.llIllIIlIlllIl[RtspMethods.llIllIIlIllllI[4]]);
        PLAY = new HttpMethod(RtspMethods.llIllIIlIlllIl[RtspMethods.llIllIIlIllllI[5]]);
        PAUSE = new HttpMethod(RtspMethods.llIllIIlIlllIl[RtspMethods.llIllIIlIllllI[6]]);
        TEARDOWN = new HttpMethod(RtspMethods.llIllIIlIlllIl[RtspMethods.llIllIIlIllllI[7]]);
        GET_PARAMETER = new HttpMethod(RtspMethods.llIllIIlIlllIl[RtspMethods.llIllIIlIllllI[8]]);
        SET_PARAMETER = new HttpMethod(RtspMethods.llIllIIlIlllIl[RtspMethods.llIllIIlIllllI[9]]);
        REDIRECT = new HttpMethod(RtspMethods.llIllIIlIlllIl[RtspMethods.llIllIIlIllllI[10]]);
        RECORD = new HttpMethod(RtspMethods.llIllIIlIlllIl[RtspMethods.llIllIIlIllllI[11]]);
        (methodMap = new HashMap<String, HttpMethod>()).put(RtspMethods.DESCRIBE.toString(), RtspMethods.DESCRIBE);
        "".length();
        RtspMethods.methodMap.put(RtspMethods.ANNOUNCE.toString(), RtspMethods.ANNOUNCE);
        "".length();
        RtspMethods.methodMap.put(RtspMethods.GET_PARAMETER.toString(), RtspMethods.GET_PARAMETER);
        "".length();
        RtspMethods.methodMap.put(RtspMethods.OPTIONS.toString(), RtspMethods.OPTIONS);
        "".length();
        RtspMethods.methodMap.put(RtspMethods.PAUSE.toString(), RtspMethods.PAUSE);
        "".length();
        RtspMethods.methodMap.put(RtspMethods.PLAY.toString(), RtspMethods.PLAY);
        "".length();
        RtspMethods.methodMap.put(RtspMethods.RECORD.toString(), RtspMethods.RECORD);
        "".length();
        RtspMethods.methodMap.put(RtspMethods.REDIRECT.toString(), RtspMethods.REDIRECT);
        "".length();
        RtspMethods.methodMap.put(RtspMethods.SETUP.toString(), RtspMethods.SETUP);
        "".length();
        RtspMethods.methodMap.put(RtspMethods.SET_PARAMETER.toString(), RtspMethods.SET_PARAMETER);
        "".length();
        RtspMethods.methodMap.put(RtspMethods.TEARDOWN.toString(), RtspMethods.TEARDOWN);
        "".length();
    }
    
    public static HttpMethod valueOf(String llllllllllllIllIIllllIlIIIIIIlII) {
        if (lIIlIlllIIIIlIIl(llllllllllllIllIIllllIlIIIIIIlII)) {
            throw new NullPointerException(RtspMethods.llIllIIlIlllIl[RtspMethods.llIllIIlIllllI[0]]);
        }
        llllllllllllIllIIllllIlIIIIIIlII = llllllllllllIllIIllllIlIIIIIIlII.trim().toUpperCase();
        if (lIIlIlllIIIIlIlI(llllllllllllIllIIllllIlIIIIIIlII.isEmpty() ? 1 : 0)) {
            throw new IllegalArgumentException(RtspMethods.llIllIIlIlllIl[RtspMethods.llIllIIlIllllI[1]]);
        }
        final HttpMethod llllllllllllIllIIllllIlIIIIIIlIl = RtspMethods.methodMap.get(llllllllllllIllIIllllIlIIIIIIlII);
        if (lIIlIlllIIIIlIll(llllllllllllIllIIllllIlIIIIIIlIl)) {
            return llllllllllllIllIIllllIlIIIIIIlIl;
        }
        return new HttpMethod(llllllllllllIllIIllllIlIIIIIIlII);
    }
    
    private static void lIIlIlllIIIIlIII() {
        (llIllIIlIllllI = new int[13])[0] = ((0x22 ^ 0x73) & ~(0x66 ^ 0x37));
        RtspMethods.llIllIIlIllllI[1] = " ".length();
        RtspMethods.llIllIIlIllllI[2] = "  ".length();
        RtspMethods.llIllIIlIllllI[3] = "   ".length();
        RtspMethods.llIllIIlIllllI[4] = (0x97 ^ 0x93);
        RtspMethods.llIllIIlIllllI[5] = (0x9E ^ 0x9B);
        RtspMethods.llIllIIlIllllI[6] = (0x19 ^ 0x1F);
        RtspMethods.llIllIIlIllllI[7] = (0x7C ^ 0x7B);
        RtspMethods.llIllIIlIllllI[8] = (0x8D ^ 0x85);
        RtspMethods.llIllIIlIllllI[9] = (0x16 ^ 0x4C ^ (0xE8 ^ 0xBB));
        RtspMethods.llIllIIlIllllI[10] = (0x48 ^ 0x30 ^ (0x2F ^ 0x5D));
        RtspMethods.llIllIIlIllllI[11] = (0x6C ^ 0x54 ^ (0x65 ^ 0x56));
        RtspMethods.llIllIIlIllllI[12] = (0x99 ^ 0x95);
    }
    
    private static String lIIlIlllIIIIIlII(final String llllllllllllIllIIllllIIlllIlIIIl, final String llllllllllllIllIIllllIIlllIlIIlI) {
        try {
            final SecretKeySpec llllllllllllIllIIllllIIlllIlIllI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIllIIllllIIlllIlIIlI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher llllllllllllIllIIllllIIlllIlIlIl = Cipher.getInstance("Blowfish");
            llllllllllllIllIIllllIIlllIlIlIl.init(RtspMethods.llIllIIlIllllI[2], llllllllllllIllIIllllIIlllIlIllI);
            return new String(llllllllllllIllIIllllIIlllIlIlIl.doFinal(Base64.getDecoder().decode(llllllllllllIllIIllllIIlllIlIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIllIIllllIIlllIlIlII) {
            llllllllllllIllIIllllIIlllIlIlII.printStackTrace();
            return null;
        }
    }
    
    private static String lIIlIlllIIIIIllI(String llllllllllllIllIIllllIIlllllIIII, final String llllllllllllIllIIllllIIlllllIlII) {
        llllllllllllIllIIllllIIlllllIIII = (long)new String(Base64.getDecoder().decode(((String)llllllllllllIllIIllllIIlllllIIII).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder llllllllllllIllIIllllIIlllllIIll = new StringBuilder();
        final char[] llllllllllllIllIIllllIIlllllIIlI = llllllllllllIllIIllllIIlllllIlII.toCharArray();
        int llllllllllllIllIIllllIIlllllIIIl = RtspMethods.llIllIIlIllllI[0];
        final float llllllllllllIllIIllllIIllllIlIll = (Object)((String)llllllllllllIllIIllllIIlllllIIII).toCharArray();
        final short llllllllllllIllIIllllIIllllIlIlI = (short)llllllllllllIllIIllllIIllllIlIll.length;
        double llllllllllllIllIIllllIIllllIlIIl = RtspMethods.llIllIIlIllllI[0];
        while (lIIlIlllIIIIllII((int)llllllllllllIllIIllllIIllllIlIIl, llllllllllllIllIIllllIIllllIlIlI)) {
            final char llllllllllllIllIIllllIIlllllIllI = llllllllllllIllIIllllIIllllIlIll[llllllllllllIllIIllllIIllllIlIIl];
            llllllllllllIllIIllllIIlllllIIll.append((char)(llllllllllllIllIIllllIIlllllIllI ^ llllllllllllIllIIllllIIlllllIIlI[llllllllllllIllIIllllIIlllllIIIl % llllllllllllIllIIllllIIlllllIIlI.length]));
            "".length();
            ++llllllllllllIllIIllllIIlllllIIIl;
            ++llllllllllllIllIIllllIIllllIlIIl;
            "".length();
            if (-" ".length() == "   ".length()) {
                return null;
            }
        }
        return String.valueOf(llllllllllllIllIIllllIIlllllIIll);
    }
    
    private static void lIIlIlllIIIIIlll() {
        (llIllIIlIlllIl = new String[RtspMethods.llIllIIlIllllI[12]])[RtspMethods.llIllIIlIllllI[0]] = lIIlIlllIIIIIlII("7Bvf634/IpQ=", "wiWhd");
        RtspMethods.llIllIIlIlllIl[RtspMethods.llIllIIlIllllI[1]] = lIIlIlllIIIIIlIl("OGoeEMGmrgTetCgJa/2zxA==", "rpyxq");
        RtspMethods.llIllIIlIlllIl[RtspMethods.llIllIIlIllllI[2]] = lIIlIlllIIIIIllI("Jg05MQErCi8=", "bHjrS");
        RtspMethods.llIllIIlIlllIl[RtspMethods.llIllIIlIllllI[3]] = lIIlIlllIIIIIlII("QHm5u9oXf/YaLAZp9piwqg==", "RuAwz");
        RtspMethods.llIllIIlIlllIl[RtspMethods.llIllIIlIllllI[4]] = lIIlIlllIIIIIlIl("4w5n/YeTM10=", "tsDRp");
        RtspMethods.llIllIIlIlllIl[RtspMethods.llIllIIlIllllI[5]] = lIIlIlllIIIIIllI("FhYUEw==", "FZUJH");
        RtspMethods.llIllIIlIlllIl[RtspMethods.llIllIIlIllllI[6]] = lIIlIlllIIIIIlIl("J6xE8K6oVUY=", "BTzbz");
        RtspMethods.llIllIIlIlllIl[RtspMethods.llIllIIlIllllI[7]] = lIIlIlllIIIIIlIl("ewmsKpN+mj2h0zMPyrdsDA==", "JLxpu");
        RtspMethods.llIllIIlIlllIl[RtspMethods.llIllIIlIllllI[8]] = lIIlIlllIIIIIlII("D+adcbL4+B0mpXhgkcOEcA==", "ZgaXs");
        RtspMethods.llIllIIlIlllIl[RtspMethods.llIllIIlIllllI[9]] = lIIlIlllIIIIIllI("OwEQCCopFgUaPzwBFg==", "hDDWz");
        RtspMethods.llIllIIlIlllIl[RtspMethods.llIllIIlIllllI[10]] = lIIlIlllIIIIIlIl("rmtgvpkCKf1zorZyoxg7/A==", "qIwHG");
        RtspMethods.llIllIIlIlllIl[RtspMethods.llIllIIlIllllI[11]] = lIIlIlllIIIIIlIl("2WH+/HdV9/U=", "nabGs");
    }
    
    private static boolean lIIlIlllIIIIllII(final int llllllllllllIllIIllllIIlllIIlIll, final int llllllllllllIllIIllllIIlllIIlIlI) {
        return llllllllllllIllIIllllIIlllIIlIll < llllllllllllIllIIllllIIlllIIlIlI;
    }
    
    private static String lIIlIlllIIIIIlIl(final String llllllllllllIllIIllllIIllllIIIII, final String llllllllllllIllIIllllIIlllIlllll) {
        try {
            final SecretKeySpec llllllllllllIllIIllllIIllllIIIll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIllIIllllIIlllIlllll.getBytes(StandardCharsets.UTF_8)), RtspMethods.llIllIIlIllllI[8]), "DES");
            final Cipher llllllllllllIllIIllllIIllllIIIlI = Cipher.getInstance("DES");
            llllllllllllIllIIllllIIllllIIIlI.init(RtspMethods.llIllIIlIllllI[2], llllllllllllIllIIllllIIllllIIIll);
            return new String(llllllllllllIllIIllllIIllllIIIlI.doFinal(Base64.getDecoder().decode(llllllllllllIllIIllllIIllllIIIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIllIIllllIIllllIIIIl) {
            llllllllllllIllIIllllIIllllIIIIl.printStackTrace();
            return null;
        }
    }
    
    private static boolean lIIlIlllIIIIlIIl(final Object llllllllllllIllIIllllIIlllIIIllI) {
        return llllllllllllIllIIllllIIlllIIIllI == null;
    }
    
    private static boolean lIIlIlllIIIIlIlI(final int llllllllllllIllIIllllIIlllIIIlII) {
        return llllllllllllIllIIllllIIlllIIIlII != 0;
    }
    
    private static boolean lIIlIlllIIIIlIll(final Object llllllllllllIllIIllllIIlllIIlIII) {
        return llllllllllllIllIIllllIIlllIIlIII != null;
    }
}
