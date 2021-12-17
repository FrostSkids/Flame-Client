// 
// Decompiled by Procyon v0.5.36
// 

package io.netty.handler.codec.http;

import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.security.MessageDigest;
import java.util.TimeZone;
import java.util.Locale;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.Date;
import java.text.ParsePosition;
import io.netty.util.concurrent.FastThreadLocal;
import java.text.SimpleDateFormat;

final class HttpHeaderDateFormat extends SimpleDateFormat
{
    private static final /* synthetic */ int[] lIlIIllllIllIl;
    private final /* synthetic */ SimpleDateFormat format1;
    private static final /* synthetic */ String[] lIlIIllllIllII;
    private static final /* synthetic */ FastThreadLocal<HttpHeaderDateFormat> dateFormatThreadLocal;
    private final /* synthetic */ SimpleDateFormat format2;
    
    @Override
    public Date parse(final String lllllllllllllIIIlIllIlllllIIlllI, final ParsePosition lllllllllllllIIIlIllIlllllIIllIl) {
        Date lllllllllllllIIIlIllIlllllIlIIII = super.parse(lllllllllllllIIIlIllIlllllIIlllI, lllllllllllllIIIlIllIlllllIIllIl);
        if (lllIlIlIIIIllIl(lllllllllllllIIIlIllIlllllIlIIII)) {
            lllllllllllllIIIlIllIlllllIlIIII = this.format1.parse(lllllllllllllIIIlIllIlllllIIlllI, lllllllllllllIIIlIllIlllllIIllIl);
        }
        if (lllIlIlIIIIllIl(lllllllllllllIIIlIllIlllllIlIIII)) {
            lllllllllllllIIIlIllIlllllIlIIII = this.format2.parse(lllllllllllllIIIlIllIlllllIIlllI, lllllllllllllIIIlIllIlllllIIllIl);
        }
        return lllllllllllllIIIlIllIlllllIlIIII;
    }
    
    static HttpHeaderDateFormat get() {
        return HttpHeaderDateFormat.dateFormatThreadLocal.get();
    }
    
    private static boolean lllIlIlIIIIlllI(final int lllllllllllllIIIlIllIllllIlIllIl, final int lllllllllllllIIIlIllIllllIlIllII) {
        return lllllllllllllIIIlIllIllllIlIllIl < lllllllllllllIIIlIllIllllIlIllII;
    }
    
    private static void lllIlIlIIIIllII() {
        (lIlIIllllIllIl = new int[3])[0] = ((184 + 76 - 125 + 86 ^ 0 + 165 - 120 + 153) & (116 + 44 - 21 + 40 ^ 127 + 76 - 138 + 103 ^ -" ".length()));
        HttpHeaderDateFormat.lIlIIllllIllIl[1] = " ".length();
        HttpHeaderDateFormat.lIlIIllllIllIl[2] = "  ".length();
    }
    
    private static String lllIlIlIIIIlIlI(String lllllllllllllIIIlIllIllllIlllIII, final String lllllllllllllIIIlIllIllllIllllII) {
        lllllllllllllIIIlIllIllllIlllIII = (Exception)new String(Base64.getDecoder().decode(((String)lllllllllllllIIIlIllIllllIlllIII).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIIIlIllIllllIlllIll = new StringBuilder();
        final char[] lllllllllllllIIIlIllIllllIlllIlI = lllllllllllllIIIlIllIllllIllllII.toCharArray();
        int lllllllllllllIIIlIllIllllIlllIIl = HttpHeaderDateFormat.lIlIIllllIllIl[0];
        final String lllllllllllllIIIlIllIllllIllIIll = (Object)((String)lllllllllllllIIIlIllIllllIlllIII).toCharArray();
        final String lllllllllllllIIIlIllIllllIllIIlI = (String)lllllllllllllIIIlIllIllllIllIIll.length;
        Exception lllllllllllllIIIlIllIllllIllIIIl = (Exception)HttpHeaderDateFormat.lIlIIllllIllIl[0];
        while (lllIlIlIIIIlllI((int)lllllllllllllIIIlIllIllllIllIIIl, (int)lllllllllllllIIIlIllIllllIllIIlI)) {
            final char lllllllllllllIIIlIllIllllIlllllI = lllllllllllllIIIlIllIllllIllIIll[lllllllllllllIIIlIllIllllIllIIIl];
            lllllllllllllIIIlIllIllllIlllIll.append((char)(lllllllllllllIIIlIllIllllIlllllI ^ lllllllllllllIIIlIllIllllIlllIlI[lllllllllllllIIIlIllIllllIlllIIl % lllllllllllllIIIlIllIllllIlllIlI.length]));
            "".length();
            ++lllllllllllllIIIlIllIllllIlllIIl;
            ++lllllllllllllIIIlIllIllllIllIIIl;
            "".length();
            if ("   ".length() > "   ".length()) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIIIlIllIllllIlllIll);
    }
    
    static {
        lllIlIlIIIIllII();
        lllIlIlIIIIlIll();
        dateFormatThreadLocal = new FastThreadLocal<HttpHeaderDateFormat>() {
            @Override
            protected HttpHeaderDateFormat initialValue() {
                return new HttpHeaderDateFormat((HttpHeaderDateFormat$1)null);
            }
        };
    }
    
    private static boolean lllIlIlIIIIllIl(final Object lllllllllllllIIIlIllIllllIlIlIlI) {
        return lllllllllllllIIIlIllIllllIlIlIlI == null;
    }
    
    private static void lllIlIlIIIIlIll() {
        (lIlIIllllIllII = new String[HttpHeaderDateFormat.lIlIIllllIllIl[2]])[HttpHeaderDateFormat.lIlIIllllIllIl[0]] = lllIlIlIIIIlIlI("A0phIiJmKwwLZj8fOD9mDi57Kyt8FTJmPA==", "FfAFF");
        HttpHeaderDateFormat.lIlIIllllIllII[HttpHeaderDateFormat.lIlIIllllIllIl[1]] = lllIlIlIIIIlIlI("LRwh", "jQunB");
    }
    
    private HttpHeaderDateFormat() {
        super(HttpHeaderDateFormat.lIlIIllllIllII[HttpHeaderDateFormat.lIlIIllllIllIl[0]], Locale.ENGLISH);
        this.format1 = new HttpHeaderDateFormatObsolete1();
        this.format2 = new HttpHeaderDateFormatObsolete2();
        this.setTimeZone(TimeZone.getTimeZone(HttpHeaderDateFormat.lIlIIllllIllII[HttpHeaderDateFormat.lIlIIllllIllIl[1]]));
    }
    
    private static final class HttpHeaderDateFormatObsolete1 extends SimpleDateFormat
    {
        private static final /* synthetic */ int[] llIllIllIlIIII;
        private static final /* synthetic */ String[] llIllIllIIllll;
        
        private static boolean lIIllIIIIlIIIIlI(final int llllllllllllIllIIllIIlIlIlIlIlII, final int llllllllllllIllIIllIIlIlIlIlIIll) {
            return llllllllllllIllIIllIIlIlIlIlIlII < llllllllllllIllIIllIIlIlIlIlIIll;
        }
        
        static {
            lIIllIIIIlIIIIIl();
            lIIllIIIIlIIIIII();
        }
        
        HttpHeaderDateFormatObsolete1() {
            super(HttpHeaderDateFormatObsolete1.llIllIllIIllll[HttpHeaderDateFormatObsolete1.llIllIllIlIIII[0]], Locale.ENGLISH);
            this.setTimeZone(TimeZone.getTimeZone(HttpHeaderDateFormatObsolete1.llIllIllIIllll[HttpHeaderDateFormatObsolete1.llIllIllIlIIII[1]]));
        }
        
        private static String lIIllIIIIIllllll(String llllllllllllIllIIllIIlIlIllIllII, final String llllllllllllIllIIllIIlIlIllIlIll) {
            llllllllllllIllIIllIIlIlIllIllII = new String(Base64.getDecoder().decode(llllllllllllIllIIllIIlIlIllIllII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
            final StringBuilder llllllllllllIllIIllIIlIlIllIllll = new StringBuilder();
            final char[] llllllllllllIllIIllIIlIlIllIlllI = llllllllllllIllIIllIIlIlIllIlIll.toCharArray();
            int llllllllllllIllIIllIIlIlIllIllIl = HttpHeaderDateFormatObsolete1.llIllIllIlIIII[0];
            final double llllllllllllIllIIllIIlIlIllIIlll = (Object)llllllllllllIllIIllIIlIlIllIllII.toCharArray();
            final Exception llllllllllllIllIIllIIlIlIllIIllI = (Exception)llllllllllllIllIIllIIlIlIllIIlll.length;
            boolean llllllllllllIllIIllIIlIlIllIIlIl = HttpHeaderDateFormatObsolete1.llIllIllIlIIII[0] != 0;
            while (lIIllIIIIlIIIIlI(llllllllllllIllIIllIIlIlIllIIlIl ? 1 : 0, (int)llllllllllllIllIIllIIlIlIllIIllI)) {
                final char llllllllllllIllIIllIIlIlIlllIIlI = llllllllllllIllIIllIIlIlIllIIlll[llllllllllllIllIIllIIlIlIllIIlIl];
                llllllllllllIllIIllIIlIlIllIllll.append((char)(llllllllllllIllIIllIIlIlIlllIIlI ^ llllllllllllIllIIllIIlIlIllIlllI[llllllllllllIllIIllIIlIlIllIllIl % llllllllllllIllIIllIIlIlIllIlllI.length]));
                "".length();
                ++llllllllllllIllIIllIIlIlIllIllIl;
                ++llllllllllllIllIIllIIlIlIllIIlIl;
                "".length();
                if (" ".length() < -" ".length()) {
                    return null;
                }
            }
            return String.valueOf(llllllllllllIllIIllIIlIlIllIllll);
        }
        
        private static void lIIllIIIIlIIIIII() {
            (llIllIllIIllll = new String[HttpHeaderDateFormatObsolete1.llIllIllIlIIII[2]])[HttpHeaderDateFormatObsolete1.llIllIllIlIIII[0]] = lIIllIIIIIlllllI("6xXA/vGB73uh7lnvaD02dlyTIcjKzNwF", "fVVRy");
            HttpHeaderDateFormatObsolete1.llIllIllIIllll[HttpHeaderDateFormatObsolete1.llIllIllIlIIII[1]] = lIIllIIIIIllllll("Cikf", "MdKAU");
        }
        
        private static void lIIllIIIIlIIIIIl() {
            (llIllIllIlIIII = new int[3])[0] = ((0xA1 ^ 0xB8 ^ (0xCA ^ 0x90)) & (18 + 164 - 49 + 92 ^ 86 + 116 - 139 + 99 ^ -" ".length()));
            HttpHeaderDateFormatObsolete1.llIllIllIlIIII[1] = " ".length();
            HttpHeaderDateFormatObsolete1.llIllIllIlIIII[2] = "  ".length();
        }
        
        private static String lIIllIIIIIlllllI(final String llllllllllllIllIIllIIlIlIlIllIlI, final String llllllllllllIllIIllIIlIlIlIllIIl) {
            try {
                final SecretKeySpec llllllllllllIllIIllIIlIlIlIlllll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIllIIllIIlIlIlIllIIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
                final Cipher llllllllllllIllIIllIIlIlIlIllllI = Cipher.getInstance("Blowfish");
                llllllllllllIllIIllIIlIlIlIllllI.init(HttpHeaderDateFormatObsolete1.llIllIllIlIIII[2], llllllllllllIllIIllIIlIlIlIlllll);
                return new String(llllllllllllIllIIllIIlIlIlIllllI.doFinal(Base64.getDecoder().decode(llllllllllllIllIIllIIlIlIlIllIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
            }
            catch (Exception llllllllllllIllIIllIIlIlIlIlllIl) {
                llllllllllllIllIIllIIlIlIlIlllIl.printStackTrace();
                return null;
            }
        }
    }
    
    private static final class HttpHeaderDateFormatObsolete2 extends SimpleDateFormat
    {
        private static final /* synthetic */ String[] lIllIlIIIlIIlI;
        private static final /* synthetic */ int[] lIllIlIIIlIIll;
        
        HttpHeaderDateFormatObsolete2() {
            super(HttpHeaderDateFormatObsolete2.lIllIlIIIlIIlI[HttpHeaderDateFormatObsolete2.lIllIlIIIlIIll[0]], Locale.ENGLISH);
            this.setTimeZone(TimeZone.getTimeZone(HttpHeaderDateFormatObsolete2.lIllIlIIIlIIlI[HttpHeaderDateFormatObsolete2.lIllIlIIIlIIll[1]]));
        }
        
        private static void lllllIlllllIllI() {
            (lIllIlIIIlIIlI = new String[HttpHeaderDateFormatObsolete2.lIllIlIIIlIIll[2]])[HttpHeaderDateFormatObsolete2.lIllIlIIIlIIll[0]] = lllllIlllllIIll("whdwfPWs7nE8ZtEBW5CZJ7e90VBCZZC/", "UfEfD");
            HttpHeaderDateFormatObsolete2.lIllIlIIIlIIlI[HttpHeaderDateFormatObsolete2.lIllIlIIIlIIll[1]] = lllllIlllllIlIl("Fhgc", "QUHcq");
        }
        
        private static String lllllIlllllIlIl(String lllllllllllllIIIIIIIlIIlllIIIIII, final String lllllllllllllIIIIIIIlIIllIllllll) {
            lllllllllllllIIIIIIIlIIlllIIIIII = new String(Base64.getDecoder().decode(lllllllllllllIIIIIIIlIIlllIIIIII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
            final StringBuilder lllllllllllllIIIIIIIlIIlllIIIIll = new StringBuilder();
            final char[] lllllllllllllIIIIIIIlIIlllIIIIlI = lllllllllllllIIIIIIIlIIllIllllll.toCharArray();
            int lllllllllllllIIIIIIIlIIlllIIIIIl = HttpHeaderDateFormatObsolete2.lIllIlIIIlIIll[0];
            final short lllllllllllllIIIIIIIlIIllIlllIll = (Object)lllllllllllllIIIIIIIlIIlllIIIIII.toCharArray();
            final long lllllllllllllIIIIIIIlIIllIlllIlI = lllllllllllllIIIIIIIlIIllIlllIll.length;
            short lllllllllllllIIIIIIIlIIllIlllIIl = (short)HttpHeaderDateFormatObsolete2.lIllIlIIIlIIll[0];
            while (lllllIllllllIII(lllllllllllllIIIIIIIlIIllIlllIIl, (int)lllllllllllllIIIIIIIlIIllIlllIlI)) {
                final char lllllllllllllIIIIIIIlIIlllIIIllI = lllllllllllllIIIIIIIlIIllIlllIll[lllllllllllllIIIIIIIlIIllIlllIIl];
                lllllllllllllIIIIIIIlIIlllIIIIll.append((char)(lllllllllllllIIIIIIIlIIlllIIIllI ^ lllllllllllllIIIIIIIlIIlllIIIIlI[lllllllllllllIIIIIIIlIIlllIIIIIl % lllllllllllllIIIIIIIlIIlllIIIIlI.length]));
                "".length();
                ++lllllllllllllIIIIIIIlIIlllIIIIIl;
                ++lllllllllllllIIIIIIIlIIllIlllIIl;
                "".length();
                if ("  ".length() <= 0) {
                    return null;
                }
            }
            return String.valueOf(lllllllllllllIIIIIIIlIIlllIIIIll);
        }
        
        private static boolean lllllIllllllIII(final int lllllllllllllIIIIIIIlIIllIllIlIl, final int lllllllllllllIIIIIIIlIIllIllIlII) {
            return lllllllllllllIIIIIIIlIIllIllIlIl < lllllllllllllIIIIIIIlIIllIllIlII;
        }
        
        private static void lllllIlllllIlll() {
            (lIllIlIIIlIIll = new int[3])[0] = ((0x9 ^ 0x1 ^ (0xFE ^ 0xA9)) & (0x7B ^ 0x35 ^ (0xB9 ^ 0xA8) ^ -" ".length()));
            HttpHeaderDateFormatObsolete2.lIllIlIIIlIIll[1] = " ".length();
            HttpHeaderDateFormatObsolete2.lIllIlIIIlIIll[2] = "  ".length();
        }
        
        private static String lllllIlllllIIll(final String lllllllllllllIIIIIIIlIIlllIlIlIl, final String lllllllllllllIIIIIIIlIIlllIlIIlI) {
            try {
                final SecretKeySpec lllllllllllllIIIIIIIlIIlllIllIII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIIIIIIIlIIlllIlIIlI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
                final Cipher lllllllllllllIIIIIIIlIIlllIlIlll = Cipher.getInstance("Blowfish");
                lllllllllllllIIIIIIIlIIlllIlIlll.init(HttpHeaderDateFormatObsolete2.lIllIlIIIlIIll[2], lllllllllllllIIIIIIIlIIlllIllIII);
                return new String(lllllllllllllIIIIIIIlIIlllIlIlll.doFinal(Base64.getDecoder().decode(lllllllllllllIIIIIIIlIIlllIlIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
            }
            catch (Exception lllllllllllllIIIIIIIlIIlllIlIllI) {
                lllllllllllllIIIIIIIlIIlllIlIllI.printStackTrace();
                return null;
            }
        }
        
        static {
            lllllIlllllIlll();
            lllllIlllllIllI();
        }
    }
}
