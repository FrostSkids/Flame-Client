// 
// Decompiled by Procyon v0.5.36
// 

package io.netty.handler.codec.http;

import java.util.Date;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Iterator;
import java.util.ArrayList;
import java.util.List;
import java.util.Collection;

public final class ServerCookieEncoder
{
    private static final /* synthetic */ String[] llIIlIlIlllIII;
    private static final /* synthetic */ int[] llIIlIlIlllIIl;
    
    private static boolean lIIIllIlIllIIlII(final int llllllllllllIlllIIIlIlllllIlIIll) {
        return llllllllllllIlllIIIlIlllllIlIIll != 0;
    }
    
    public static List<String> encode(final Collection<Cookie> llllllllllllIlllIIIllIIIIIlIIlIl) {
        if (lIIIllIlIllIIIll(llllllllllllIlllIIIllIIIIIlIIlIl)) {
            throw new NullPointerException(ServerCookieEncoder.llIIlIlIlllIII[ServerCookieEncoder.llIIlIlIlllIIl[20]]);
        }
        final List<String> llllllllllllIlllIIIllIIIIIlIIllI = new ArrayList<String>(llllllllllllIlllIIIllIIIIIlIIlIl.size());
        final Iterator llllllllllllIlllIIIllIIIIIlIlIII = llllllllllllIlllIIIllIIIIIlIIlIl.iterator();
        while (lIIIllIlIllIIlII(llllllllllllIlllIIIllIIIIIlIlIII.hasNext() ? 1 : 0)) {
            final Cookie llllllllllllIlllIIIllIIIIIlIlIIl = llllllllllllIlllIIIllIIIIIlIlIII.next();
            if (lIIIllIlIllIIIll(llllllllllllIlllIIIllIIIIIlIlIIl)) {
                "".length();
                if ("  ".length() < -" ".length()) {
                    return null;
                }
                break;
            }
            else {
                llllllllllllIlllIIIllIIIIIlIIllI.add(encode(llllllllllllIlllIIIllIIIIIlIlIIl));
                "".length();
                "".length();
                if ("   ".length() == 0) {
                    return null;
                }
                continue;
            }
        }
        return llllllllllllIlllIIIllIIIIIlIIllI;
    }
    
    private static int lIIIllIlIllIIIlI(final long n, final long n2) {
        return lcmp(n, n2);
    }
    
    public static String encode(final String llllllllllllIlllIIIllIIIIlIIllIl, final String llllllllllllIlllIIIllIIIIlIIllII) {
        return encode(new DefaultCookie(llllllllllllIlllIIIllIIIIlIIllIl, llllllllllllIlllIIIllIIIIlIIllII));
    }
    
    static {
        lIIIllIlIllIIIIl();
        lIIIllIlIllIIIII();
    }
    
    private static String lIIIllIlIlIllllI(final String llllllllllllIlllIIIlIlllllllIIll, final String llllllllllllIlllIIIlIlllllllIIII) {
        try {
            final SecretKeySpec llllllllllllIlllIIIlIlllllllIllI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIlllIIIlIlllllllIIII.getBytes(StandardCharsets.UTF_8)), ServerCookieEncoder.llIIlIlIlllIIl[10]), "DES");
            final Cipher llllllllllllIlllIIIlIlllllllIlIl = Cipher.getInstance("DES");
            llllllllllllIlllIIIlIlllllllIlIl.init(ServerCookieEncoder.llIIlIlIlllIIl[2], llllllllllllIlllIIIlIlllllllIllI);
            return new String(llllllllllllIlllIIIlIlllllllIlIl.doFinal(Base64.getDecoder().decode(llllllllllllIlllIIIlIlllllllIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIlllIIIlIlllllllIlII) {
            llllllllllllIlllIIIlIlllllllIlII.printStackTrace();
            return null;
        }
    }
    
    private static String lIIIllIlIlIlllll(String llllllllllllIlllIIIllIIIIIIIIIll, final String llllllllllllIlllIIIllIIIIIIIIlll) {
        llllllllllllIlllIIIllIIIIIIIIIll = (short)new String(Base64.getDecoder().decode(((String)llllllllllllIlllIIIllIIIIIIIIIll).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder llllllllllllIlllIIIllIIIIIIIIllI = new StringBuilder();
        final char[] llllllllllllIlllIIIllIIIIIIIIlIl = llllllllllllIlllIIIllIIIIIIIIlll.toCharArray();
        int llllllllllllIlllIIIllIIIIIIIIlII = ServerCookieEncoder.llIIlIlIlllIIl[0];
        final double llllllllllllIlllIIIlIllllllllllI = (Object)((String)llllllllllllIlllIIIllIIIIIIIIIll).toCharArray();
        final long llllllllllllIlllIIIlIlllllllllIl = llllllllllllIlllIIIlIllllllllllI.length;
        double llllllllllllIlllIIIlIlllllllllII = ServerCookieEncoder.llIIlIlIlllIIl[0];
        while (lIIIllIlIllIlIIl((int)llllllllllllIlllIIIlIlllllllllII, (int)llllllllllllIlllIIIlIlllllllllIl)) {
            final char llllllllllllIlllIIIllIIIIIIIlIIl = llllllllllllIlllIIIlIllllllllllI[llllllllllllIlllIIIlIlllllllllII];
            llllllllllllIlllIIIllIIIIIIIIllI.append((char)(llllllllllllIlllIIIllIIIIIIIlIIl ^ llllllllllllIlllIIIllIIIIIIIIlIl[llllllllllllIlllIIIllIIIIIIIIlII % llllllllllllIlllIIIllIIIIIIIIlIl.length]));
            "".length();
            ++llllllllllllIlllIIIllIIIIIIIIlII;
            ++llllllllllllIlllIIIlIlllllllllII;
            "".length();
            if (null != null) {
                return null;
            }
        }
        return String.valueOf(llllllllllllIlllIIIllIIIIIIIIllI);
    }
    
    private ServerCookieEncoder() {
    }
    
    private static boolean lIIIllIlIllIlIIl(final int llllllllllllIlllIIIlIlllllIllIlI, final int llllllllllllIlllIIIlIlllllIllIIl) {
        return llllllllllllIlllIIIlIlllllIllIlI < llllllllllllIlllIIIlIlllllIllIIl;
    }
    
    private static void lIIIllIlIllIIIII() {
        (llIIlIlIlllIII = new String[ServerCookieEncoder.llIIlIlIlllIIl[22]])[ServerCookieEncoder.llIIlIlIlllIIl[0]] = lIIIllIlIlIlllIl("SEAcFmqJd0s=", "BUUWT");
        ServerCookieEncoder.llIIlIlIlllIII[ServerCookieEncoder.llIIlIlIlllIIl[1]] = lIIIllIlIlIllllI("OQwvYPhf/34=", "kmfwN");
        ServerCookieEncoder.llIIlIlIlllIII[ServerCookieEncoder.llIIlIlIlllIIl[2]] = lIIIllIlIlIllllI("wVQhYnKn6Yg=", "PRnHQ");
        ServerCookieEncoder.llIIlIlIlllIII[ServerCookieEncoder.llIIlIlIlllIIl[3]] = lIIIllIlIlIllllI("QiU0rE57wQc=", "KGqnB");
        ServerCookieEncoder.llIIlIlIlllIII[ServerCookieEncoder.llIIlIlIlllIIl[4]] = lIIIllIlIlIlllll("Kg46IA==", "zoNHJ");
        ServerCookieEncoder.llIIlIlIlllIII[ServerCookieEncoder.llIIlIlIlllIIl[5]] = lIIIllIlIlIlllIl("XiT1pSt2zlg=", "uculN");
        ServerCookieEncoder.llIIlIlIlllIII[ServerCookieEncoder.llIIlIlIlllIIl[6]] = lIIIllIlIlIlllll("AAE/KDoq", "DnRIS");
        ServerCookieEncoder.llIIlIlIlllIII[ServerCookieEncoder.llIIlIlIlllIIl[7]] = lIIIllIlIlIllllI("p84tAy6IxXM=", "iCypU");
        ServerCookieEncoder.llIIlIlIlllIII[ServerCookieEncoder.llIIlIlIlllIIl[10]] = lIIIllIlIlIlllll("MRcfHjsXLzI=", "yCKNt");
        ServerCookieEncoder.llIIlIlIlllIII[ServerCookieEncoder.llIIlIlIlllIIl[11]] = lIIIllIlIlIlllll("Ojc8KS4XLA==", "yXQDK");
        ServerCookieEncoder.llIIlIlIlllIII[ServerCookieEncoder.llIIlIlIlllIIl[12]] = lIIIllIlIlIllllI("b3Ed/ZMIdnY=", "mEjlP");
        ServerCookieEncoder.llIIlIlIlllIII[ServerCookieEncoder.llIIlIlIlllIIl[13]] = lIIIllIlIlIllllI("67MzSAAi9hR85dgI84bF5w==", "Ygyoj");
        ServerCookieEncoder.llIIlIlIlllIII[ServerCookieEncoder.llIIlIlIlllIIl[14]] = lIIIllIlIlIlllll("CjUkPA==", "ZZVHY");
        ServerCookieEncoder.llIIlIlIlllIII[ServerCookieEncoder.llIIlIlIlllIIl[18]] = lIIIllIlIlIlllll("EjkfKikkNA==", "VPlIH");
        ServerCookieEncoder.llIIlIlIlllIII[ServerCookieEncoder.llIIlIlIlllIIl[19]] = lIIIllIlIlIlllll("DR4ZDwILAg==", "nqvdk");
        ServerCookieEncoder.llIIlIlIlllIII[ServerCookieEncoder.llIIlIlIlllIIl[20]] = lIIIllIlIlIlllIl("jvua2MavNxk=", "oHsNr");
        ServerCookieEncoder.llIIlIlIlllIII[ServerCookieEncoder.llIIlIlIlllIIl[21]] = lIIIllIlIlIllllI("5kRynEOLGoY=", "ZDmHI");
    }
    
    private static boolean lIIIllIlIllIIllI(final Object llllllllllllIlllIIIlIlllllIlIlll) {
        return llllllllllllIlllIIIlIlllllIlIlll != null;
    }
    
    public static List<String> encode(final Cookie... llllllllllllIlllIIIllIIIIIllIlIl) {
        if (lIIIllIlIllIIIll(llllllllllllIlllIIIllIIIIIllIlIl)) {
            throw new NullPointerException(ServerCookieEncoder.llIIlIlIlllIII[ServerCookieEncoder.llIIlIlIlllIIl[19]]);
        }
        final List<String> llllllllllllIlllIIIllIIIIIllIlII = new ArrayList<String>(llllllllllllIlllIIIllIIIIIllIlIl.length);
        final Cookie[] llllllllllllIlllIIIllIIIIIlllIII = llllllllllllIlllIIIllIIIIIllIlIl;
        final int llllllllllllIlllIIIllIIIIIllIlll = llllllllllllIlllIIIllIIIIIlllIII.length;
        int llllllllllllIlllIIIllIIIIIllIllI = ServerCookieEncoder.llIIlIlIlllIIl[0];
        while (lIIIllIlIllIlIIl(llllllllllllIlllIIIllIIIIIllIllI, llllllllllllIlllIIIllIIIIIllIlll)) {
            final Cookie llllllllllllIlllIIIllIIIIIlllIIl = llllllllllllIlllIIIllIIIIIlllIII[llllllllllllIlllIIIllIIIIIllIllI];
            if (lIIIllIlIllIIIll(llllllllllllIlllIIIllIIIIIlllIIl)) {
                "".length();
                if (((0xF ^ 0x74 ^ (0xE5 ^ 0xA1)) & (0x74 ^ 0x1 ^ (0xE7 ^ 0xAD) ^ -" ".length())) > "   ".length()) {
                    return null;
                }
                break;
            }
            else {
                llllllllllllIlllIIIllIIIIIllIlII.add(encode(llllllllllllIlllIIIllIIIIIlllIIl));
                "".length();
                ++llllllllllllIlllIIIllIIIIIllIllI;
                "".length();
                if (((0x2B ^ 0x15 ^ (0x52 ^ 0x69)) & (91 + 49 - 72 + 70 ^ 3 + 16 + 53 + 71 ^ -" ".length())) > "   ".length()) {
                    return null;
                }
                continue;
            }
        }
        return llllllllllllIlllIIIllIIIIIllIlII;
    }
    
    private static boolean lIIIllIlIllIIlll(final int llllllllllllIlllIIIlIlllllIIllll) {
        return llllllllllllIlllIIIlIlllllIIllll > 0;
    }
    
    private static void lIIIllIlIllIIIIl() {
        (llIIlIlIlllIIl = new int[23])[0] = ((125 + 51 - 38 + 13 ^ 71 + 105 - 138 + 101) & (0x16 ^ 0x7F ^ (0xB4 ^ 0xC1) ^ -" ".length()));
        ServerCookieEncoder.llIIlIlIlllIIl[1] = " ".length();
        ServerCookieEncoder.llIIlIlIlllIIl[2] = "  ".length();
        ServerCookieEncoder.llIIlIlIlllIIl[3] = "   ".length();
        ServerCookieEncoder.llIIlIlIlllIIl[4] = (105 + 82 - 38 + 29 ^ 92 + 48 - 67 + 109);
        ServerCookieEncoder.llIIlIlIlllIIl[5] = (0x6B ^ 0x43 ^ (0xA2 ^ 0x8F));
        ServerCookieEncoder.llIIlIlIlllIIl[6] = (74 + 75 - 126 + 117 ^ 67 + 1 + 51 + 19);
        ServerCookieEncoder.llIIlIlIlllIIl[7] = (0xE0 ^ 0xA5 ^ (0x78 ^ 0x3A));
        ServerCookieEncoder.llIIlIlIlllIIl[8] = (0x26 ^ 0x1D);
        ServerCookieEncoder.llIIlIlIlllIIl[9] = (116 + 102 - 178 + 87 ^ (0x53 ^ 0xC));
        ServerCookieEncoder.llIIlIlIlllIIl[10] = (0x53 ^ 0x5B);
        ServerCookieEncoder.llIIlIlIlllIIl[11] = (22 + 73 + 27 + 13 ^ 44 + 70 + 28 + 0);
        ServerCookieEncoder.llIIlIlIlllIIl[12] = (0xAC ^ 0xA6);
        ServerCookieEncoder.llIIlIlIlllIIl[13] = (0x94 ^ 0x9F);
        ServerCookieEncoder.llIIlIlIlllIIl[14] = (0x13 ^ 0x1F);
        ServerCookieEncoder.llIIlIlIlllIIl[15] = (0x46 ^ 0x41 ^ (0x6D ^ 0x57));
        ServerCookieEncoder.llIIlIlIlllIIl[16] = (0x9C ^ 0xBC ^ "  ".length());
        ServerCookieEncoder.llIIlIlIlllIIl[17] = (0x64 ^ 0x48);
        ServerCookieEncoder.llIIlIlIlllIIl[18] = (0x77 ^ 0x37 ^ (0x6B ^ 0x26));
        ServerCookieEncoder.llIIlIlIlllIIl[19] = (0x6B ^ 0x65);
        ServerCookieEncoder.llIIlIlIlllIIl[20] = (" ".length() ^ (0x73 ^ 0x7D));
        ServerCookieEncoder.llIIlIlIlllIIl[21] = (0x50 ^ 0x40);
        ServerCookieEncoder.llIIlIlIlllIIl[22] = (0x33 ^ 0x29 ^ (0x3A ^ 0x31));
    }
    
    public static String encode(final Cookie llllllllllllIlllIIIllIIIIlIIIIll) {
        if (lIIIllIlIllIIIll(llllllllllllIlllIIIllIIIIlIIIIll)) {
            throw new NullPointerException(ServerCookieEncoder.llIIlIlIlllIII[ServerCookieEncoder.llIIlIlIlllIIl[0]]);
        }
        final StringBuilder llllllllllllIlllIIIllIIIIlIIIlII = CookieEncoderUtil.stringBuilder();
        CookieEncoderUtil.add(llllllllllllIlllIIIllIIIIlIIIlII, llllllllllllIlllIIIllIIIIlIIIIll.getName(), llllllllllllIlllIIIllIIIIlIIIIll.getValue());
        if (lIIIllIlIllIIlII(lIIIllIlIllIIIlI(llllllllllllIlllIIIllIIIIlIIIIll.getMaxAge(), Long.MIN_VALUE))) {
            if (lIIIllIlIllIIlIl(llllllllllllIlllIIIllIIIIlIIIIll.getVersion())) {
                CookieEncoderUtil.addUnquoted(llllllllllllIlllIIIllIIIIlIIIlII, ServerCookieEncoder.llIIlIlIlllIII[ServerCookieEncoder.llIIlIlIlllIIl[1]], HttpHeaderDateFormat.get().format(new Date(System.currentTimeMillis() + llllllllllllIlllIIIllIIIIlIIIIll.getMaxAge() * 1000L)));
                "".length();
                if (null != null) {
                    return null;
                }
            }
            else {
                CookieEncoderUtil.add(llllllllllllIlllIIIllIIIIlIIIlII, ServerCookieEncoder.llIIlIlIlllIII[ServerCookieEncoder.llIIlIlIlllIIl[2]], llllllllllllIlllIIIllIIIIlIIIIll.getMaxAge());
            }
        }
        if (lIIIllIlIllIIllI(llllllllllllIlllIIIllIIIIlIIIIll.getPath())) {
            if (lIIIllIlIllIIlll(llllllllllllIlllIIIllIIIIlIIIIll.getVersion())) {
                CookieEncoderUtil.add(llllllllllllIlllIIIllIIIIlIIIlII, ServerCookieEncoder.llIIlIlIlllIII[ServerCookieEncoder.llIIlIlIlllIIl[3]], llllllllllllIlllIIIllIIIIlIIIIll.getPath());
                "".length();
                if (((0x7E ^ 0x68 ^ (0x5D ^ 0x73)) & (0x22 ^ 0x2C ^ (0x3 ^ 0x35) ^ -" ".length())) != 0x0) {
                    return null;
                }
            }
            else {
                CookieEncoderUtil.addUnquoted(llllllllllllIlllIIIllIIIIlIIIlII, ServerCookieEncoder.llIIlIlIlllIII[ServerCookieEncoder.llIIlIlIlllIIl[4]], llllllllllllIlllIIIllIIIIlIIIIll.getPath());
            }
        }
        if (lIIIllIlIllIIllI(llllllllllllIlllIIIllIIIIlIIIIll.getDomain())) {
            if (lIIIllIlIllIIlll(llllllllllllIlllIIIllIIIIlIIIIll.getVersion())) {
                CookieEncoderUtil.add(llllllllllllIlllIIIllIIIIlIIIlII, ServerCookieEncoder.llIIlIlIlllIII[ServerCookieEncoder.llIIlIlIlllIIl[5]], llllllllllllIlllIIIllIIIIlIIIIll.getDomain());
                "".length();
                if ("  ".length() == " ".length()) {
                    return null;
                }
            }
            else {
                CookieEncoderUtil.addUnquoted(llllllllllllIlllIIIllIIIIlIIIlII, ServerCookieEncoder.llIIlIlIlllIII[ServerCookieEncoder.llIIlIlIlllIIl[6]], llllllllllllIlllIIIllIIIIlIIIIll.getDomain());
            }
        }
        if (lIIIllIlIllIIlII(llllllllllllIlllIIIllIIIIlIIIIll.isSecure() ? 1 : 0)) {
            llllllllllllIlllIIIllIIIIlIIIlII.append(ServerCookieEncoder.llIIlIlIlllIII[ServerCookieEncoder.llIIlIlIlllIIl[7]]);
            "".length();
            llllllllllllIlllIIIllIIIIlIIIlII.append((char)ServerCookieEncoder.llIIlIlIlllIIl[8]);
            "".length();
            llllllllllllIlllIIIllIIIIlIIIlII.append((char)ServerCookieEncoder.llIIlIlIlllIIl[9]);
            "".length();
        }
        if (lIIIllIlIllIIlII(llllllllllllIlllIIIllIIIIlIIIIll.isHttpOnly() ? 1 : 0)) {
            llllllllllllIlllIIIllIIIIlIIIlII.append(ServerCookieEncoder.llIIlIlIlllIII[ServerCookieEncoder.llIIlIlIlllIIl[10]]);
            "".length();
            llllllllllllIlllIIIllIIIIlIIIlII.append((char)ServerCookieEncoder.llIIlIlIlllIIl[8]);
            "".length();
            llllllllllllIlllIIIllIIIIlIIIlII.append((char)ServerCookieEncoder.llIIlIlIlllIIl[9]);
            "".length();
        }
        if (lIIIllIlIllIlIII(llllllllllllIlllIIIllIIIIlIIIIll.getVersion(), ServerCookieEncoder.llIIlIlIlllIIl[1])) {
            if (lIIIllIlIllIIllI(llllllllllllIlllIIIllIIIIlIIIIll.getComment())) {
                CookieEncoderUtil.add(llllllllllllIlllIIIllIIIIlIIIlII, ServerCookieEncoder.llIIlIlIlllIII[ServerCookieEncoder.llIIlIlIlllIIl[11]], llllllllllllIlllIIIllIIIIlIIIIll.getComment());
            }
            CookieEncoderUtil.add(llllllllllllIlllIIIllIIIIlIIIlII, ServerCookieEncoder.llIIlIlIlllIII[ServerCookieEncoder.llIIlIlIlllIIl[12]], 1L);
            if (lIIIllIlIllIIllI(llllllllllllIlllIIIllIIIIlIIIIll.getCommentUrl())) {
                CookieEncoderUtil.addQuoted(llllllllllllIlllIIIllIIIIlIIIlII, ServerCookieEncoder.llIIlIlIlllIII[ServerCookieEncoder.llIIlIlIlllIIl[13]], llllllllllllIlllIIIllIIIIlIIIIll.getCommentUrl());
            }
            if (lIIIllIlIllIIlIl(llllllllllllIlllIIIllIIIIlIIIIll.getPorts().isEmpty() ? 1 : 0)) {
                llllllllllllIlllIIIllIIIIlIIIlII.append(ServerCookieEncoder.llIIlIlIlllIII[ServerCookieEncoder.llIIlIlIlllIIl[14]]);
                "".length();
                llllllllllllIlllIIIllIIIIlIIIlII.append((char)ServerCookieEncoder.llIIlIlIlllIIl[15]);
                "".length();
                llllllllllllIlllIIIllIIIIlIIIlII.append((char)ServerCookieEncoder.llIIlIlIlllIIl[16]);
                "".length();
                final Iterator llllllllllllIlllIIIllIIIIlIIIllI = llllllllllllIlllIIIllIIIIlIIIIll.getPorts().iterator();
                while (lIIIllIlIllIIlII(llllllllllllIlllIIIllIIIIlIIIllI.hasNext() ? 1 : 0)) {
                    final int llllllllllllIlllIIIllIIIIlIIIlll = llllllllllllIlllIIIllIIIIlIIIllI.next();
                    llllllllllllIlllIIIllIIIIlIIIlII.append(llllllllllllIlllIIIllIIIIlIIIlll);
                    "".length();
                    llllllllllllIlllIIIllIIIIlIIIlII.append((char)ServerCookieEncoder.llIIlIlIlllIIl[17]);
                    "".length();
                    "".length();
                    if (((0x19 ^ 0x26) & ~(0x5E ^ 0x61)) >= (0x27 ^ 0x23)) {
                        return null;
                    }
                }
                llllllllllllIlllIIIllIIIIlIIIlII.setCharAt(llllllllllllIlllIIIllIIIIlIIIlII.length() - ServerCookieEncoder.llIIlIlIlllIIl[1], (char)ServerCookieEncoder.llIIlIlIlllIIl[16]);
                llllllllllllIlllIIIllIIIIlIIIlII.append((char)ServerCookieEncoder.llIIlIlIlllIIl[8]);
                "".length();
                llllllllllllIlllIIIllIIIIlIIIlII.append((char)ServerCookieEncoder.llIIlIlIlllIIl[9]);
                "".length();
            }
            if (lIIIllIlIllIIlII(llllllllllllIlllIIIllIIIIlIIIIll.isDiscard() ? 1 : 0)) {
                llllllllllllIlllIIIllIIIIlIIIlII.append(ServerCookieEncoder.llIIlIlIlllIII[ServerCookieEncoder.llIIlIlIlllIIl[18]]);
                "".length();
                llllllllllllIlllIIIllIIIIlIIIlII.append((char)ServerCookieEncoder.llIIlIlIlllIIl[8]);
                "".length();
                llllllllllllIlllIIIllIIIIlIIIlII.append((char)ServerCookieEncoder.llIIlIlIlllIIl[9]);
                "".length();
            }
        }
        return CookieEncoderUtil.stripTrailingSeparator(llllllllllllIlllIIIllIIIIlIIIlII);
    }
    
    private static String lIIIllIlIlIlllIl(final String llllllllllllIlllIIIlIllllllIIllI, final String llllllllllllIlllIIIlIllllllIIIll) {
        try {
            final SecretKeySpec llllllllllllIlllIIIlIllllllIlIIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIlllIIIlIllllllIIIll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher llllllllllllIlllIIIlIllllllIlIII = Cipher.getInstance("Blowfish");
            llllllllllllIlllIIIlIllllllIlIII.init(ServerCookieEncoder.llIIlIlIlllIIl[2], llllllllllllIlllIIIlIllllllIlIIl);
            return new String(llllllllllllIlllIIIlIllllllIlIII.doFinal(Base64.getDecoder().decode(llllllllllllIlllIIIlIllllllIIllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIlllIIIlIllllllIIlll) {
            llllllllllllIlllIIIlIllllllIIlll.printStackTrace();
            return null;
        }
    }
    
    public static List<String> encode(final Iterable<Cookie> llllllllllllIlllIIIllIIIIIIllIIl) {
        if (lIIIllIlIllIIIll(llllllllllllIlllIIIllIIIIIIllIIl)) {
            throw new NullPointerException(ServerCookieEncoder.llIIlIlIlllIII[ServerCookieEncoder.llIIlIlIlllIIl[21]]);
        }
        final List<String> llllllllllllIlllIIIllIIIIIIllIlI = new ArrayList<String>();
        final Iterator llllllllllllIlllIIIllIIIIIIlllII = llllllllllllIlllIIIllIIIIIIllIIl.iterator();
        while (lIIIllIlIllIIlII(llllllllllllIlllIIIllIIIIIIlllII.hasNext() ? 1 : 0)) {
            final Cookie llllllllllllIlllIIIllIIIIIIlllIl = llllllllllllIlllIIIllIIIIIIlllII.next();
            if (lIIIllIlIllIIIll(llllllllllllIlllIIIllIIIIIIlllIl)) {
                "".length();
                if (null != null) {
                    return null;
                }
                break;
            }
            else {
                llllllllllllIlllIIIllIIIIIIllIlI.add(encode(llllllllllllIlllIIIllIIIIIIlllIl));
                "".length();
                "".length();
                if (null != null) {
                    return null;
                }
                continue;
            }
        }
        return llllllllllllIlllIIIllIIIIIIllIlI;
    }
    
    private static boolean lIIIllIlIllIIlIl(final int llllllllllllIlllIIIlIlllllIlIIIl) {
        return llllllllllllIlllIIIlIlllllIlIIIl == 0;
    }
    
    private static boolean lIIIllIlIllIIIll(final Object llllllllllllIlllIIIlIlllllIlIlIl) {
        return llllllllllllIlllIIIlIlllllIlIlIl == null;
    }
    
    private static boolean lIIIllIlIllIlIII(final int llllllllllllIlllIIIlIlllllIllllI, final int llllllllllllIlllIIIlIlllllIlllIl) {
        return llllllllllllIlllIIIlIlllllIllllI >= llllllllllllIlllIIIlIlllllIlllIl;
    }
}
