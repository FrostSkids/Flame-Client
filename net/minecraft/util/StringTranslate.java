// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.util;

import java.util.Iterator;
import java.util.IllegalFormatException;
import java.io.InputStream;
import java.io.IOException;
import com.google.common.collect.Iterables;
import org.apache.commons.io.IOUtils;
import org.apache.commons.io.Charsets;
import com.google.common.collect.Maps;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.security.MessageDigest;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import com.google.common.base.Splitter;
import java.util.regex.Pattern;
import java.util.Map;

public class StringTranslate
{
    private final /* synthetic */ Map<String, String> languageList;
    private static final /* synthetic */ int[] lIIIlIlIIIlIIl;
    private static /* synthetic */ StringTranslate instance;
    private static final /* synthetic */ Pattern numericVariablePattern;
    private static final /* synthetic */ String[] lIIIlIlIIIIlIl;
    private /* synthetic */ long lastUpdateTimeInMilliseconds;
    private static final /* synthetic */ Splitter equalSignSplitter;
    
    static {
        llIIIIIIIlIlIII();
        llIIIIIIIlIIlll();
        numericVariablePattern = Pattern.compile(StringTranslate.lIIIlIlIIIIlIl[StringTranslate.lIIIlIlIIIlIIl[0]]);
        equalSignSplitter = Splitter.on((char)StringTranslate.lIIIlIlIIIlIIl[1]).limit(StringTranslate.lIIIlIlIIIlIIl[2]);
        StringTranslate.instance = new StringTranslate();
    }
    
    private static String llIIIIIIIIllIlI(String lllllllllllllIlIIIlIIIIlIlIIIIII, final String lllllllllllllIlIIIlIIIIlIIllllll) {
        lllllllllllllIlIIIlIIIIlIlIIIIII = (long)new String(Base64.getDecoder().decode(((String)lllllllllllllIlIIIlIIIIlIlIIIIII).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIlIIIlIIIIlIlIIIIll = new StringBuilder();
        final char[] lllllllllllllIlIIIlIIIIlIlIIIIlI = lllllllllllllIlIIIlIIIIlIIllllll.toCharArray();
        int lllllllllllllIlIIIlIIIIlIlIIIIIl = StringTranslate.lIIIlIlIIIlIIl[0];
        final double lllllllllllllIlIIIlIIIIlIIlllIll = (Object)((String)lllllllllllllIlIIIlIIIIlIlIIIIII).toCharArray();
        final String lllllllllllllIlIIIlIIIIlIIlllIlI = (String)lllllllllllllIlIIIlIIIIlIIlllIll.length;
        long lllllllllllllIlIIIlIIIIlIIlllIIl = StringTranslate.lIIIlIlIIIlIIl[0];
        while (llIIIIIIIlIlllI((int)lllllllllllllIlIIIlIIIIlIIlllIIl, (int)lllllllllllllIlIIIlIIIIlIIlllIlI)) {
            final char lllllllllllllIlIIIlIIIIlIlIIIllI = lllllllllllllIlIIIlIIIIlIIlllIll[lllllllllllllIlIIIlIIIIlIIlllIIl];
            lllllllllllllIlIIIlIIIIlIlIIIIll.append((char)(lllllllllllllIlIIIlIIIIlIlIIIllI ^ lllllllllllllIlIIIlIIIIlIlIIIIlI[lllllllllllllIlIIIlIIIIlIlIIIIIl % lllllllllllllIlIIIlIIIIlIlIIIIlI.length]));
            "".length();
            ++lllllllllllllIlIIIlIIIIlIlIIIIIl;
            ++lllllllllllllIlIIIlIIIIlIIlllIIl;
            "".length();
            if ("  ".length() <= 0) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIlIIIlIIIIlIlIIIIll);
    }
    
    private static String llIIIIIIIlIIllI(final String lllllllllllllIlIIIlIIIIlIlIlIIll, final String lllllllllllllIlIIIlIIIIlIlIlIlII) {
        try {
            final SecretKeySpec lllllllllllllIlIIIlIIIIlIlIllIII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIlIIIlIIIIlIlIlIlII.getBytes(StandardCharsets.UTF_8)), StringTranslate.lIIIlIlIIIlIIl[7]), "DES");
            final Cipher lllllllllllllIlIIIlIIIIlIlIlIlll = Cipher.getInstance("DES");
            lllllllllllllIlIIIlIIIIlIlIlIlll.init(StringTranslate.lIIIlIlIIIlIIl[2], lllllllllllllIlIIIlIIIIlIlIllIII);
            return new String(lllllllllllllIlIIIlIIIIlIlIlIlll.doFinal(Base64.getDecoder().decode(lllllllllllllIlIIIlIIIIlIlIlIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIlIIIlIIIIlIlIlIllI) {
            lllllllllllllIlIIIlIIIIlIlIlIllI.printStackTrace();
            return null;
        }
    }
    
    private static void llIIIIIIIlIlIII() {
        (lIIIlIlIIIlIIl = new int[8])[0] = ((0x97 ^ 0x84 ^ (0xE6 ^ 0xB5)) & (0x3 ^ 0x51 ^ (0x20 ^ 0x32) ^ -" ".length()));
        StringTranslate.lIIIlIlIIIlIIl[1] = (0x62 ^ 0x4D ^ (0x9E ^ 0x8C));
        StringTranslate.lIIIlIlIIIlIIl[2] = "  ".length();
        StringTranslate.lIIIlIlIIIlIIl[3] = " ".length();
        StringTranslate.lIIIlIlIIIlIIl[4] = (0x4D ^ 0x18 ^ (0x6F ^ 0x19));
        StringTranslate.lIIIlIlIIIlIIl[5] = "   ".length();
        StringTranslate.lIIIlIlIIIlIIl[6] = (55 + 104 - 70 + 52 ^ 8 + 92 - 75 + 112);
        StringTranslate.lIIIlIlIIIlIIl[7] = (0xAC ^ 0xB7 ^ (0xAF ^ 0xBC));
    }
    
    public synchronized boolean isKeyTranslated(final String lllllllllllllIlIIIlIIIIlIllIIIlI) {
        return this.languageList.containsKey(lllllllllllllIlIIIlIIIIlIllIIIlI);
    }
    
    private String tryTranslateKey(final String lllllllllllllIlIIIlIIIIlIllIlIlI) {
        final String lllllllllllllIlIIIlIIIIlIllIlIIl = this.languageList.get(lllllllllllllIlIIIlIIIIlIllIlIlI);
        String s;
        if (llIIIIIIIlIllIl(lllllllllllllIlIIIlIIIIlIllIlIIl)) {
            s = lllllllllllllIlIIIlIIIIlIllIlIlI;
            "".length();
            if ("   ".length() == (0x93 ^ 0x97)) {
                return null;
            }
        }
        else {
            s = lllllllllllllIlIIIlIIIIlIllIlIIl;
        }
        return s;
    }
    
    private static boolean llIIIIIIIlIllIl(final Object lllllllllllllIlIIIlIIIIlIIIlllll) {
        return lllllllllllllIlIIIlIIIIlIIIlllll == null;
    }
    
    static StringTranslate getInstance() {
        return StringTranslate.instance;
    }
    
    private static boolean llIIIIIIIlIlIlI(final int lllllllllllllIlIIIlIIIIlIIIllIlI, final int lllllllllllllIlIIIlIIIIlIIIllIIl) {
        return lllllllllllllIlIIIlIIIIlIIIllIlI != lllllllllllllIlIIIlIIIIlIIIllIIl;
    }
    
    public StringTranslate() {
        this.languageList = (Map<String, String>)Maps.newHashMap();
        try {
            final InputStream lllllllllllllIlIIIlIIIIllIIlIIlI = StringTranslate.class.getResourceAsStream(StringTranslate.lIIIlIlIIIIlIl[StringTranslate.lIIIlIlIIIlIIl[3]]);
            final String lllllllllllllIlIIIlIIIIllIIIlIlI = (String)IOUtils.readLines(lllllllllllllIlIIIlIIIIllIIlIIlI, Charsets.UTF_8).iterator();
            "".length();
            if (-"  ".length() > 0) {
                throw null;
            }
            while (!llIIIIIIIlIlIIl(((Iterator)lllllllllllllIlIIIlIIIIllIIIlIlI).hasNext() ? 1 : 0)) {
                final String lllllllllllllIlIIIlIIIIllIIlIIIl = ((Iterator<String>)lllllllllllllIlIIIlIIIIllIIIlIlI).next();
                if (llIIIIIIIlIlIIl(lllllllllllllIlIIIlIIIIllIIlIIIl.isEmpty() ? 1 : 0) && llIIIIIIIlIlIlI(lllllllllllllIlIIIlIIIIllIIlIIIl.charAt(StringTranslate.lIIIlIlIIIlIIl[0]), StringTranslate.lIIIlIlIIIlIIl[4])) {
                    final String[] lllllllllllllIlIIIlIIIIllIIlIIII = (String[])Iterables.toArray(StringTranslate.equalSignSplitter.split((CharSequence)lllllllllllllIlIIIlIIIIllIIlIIIl), (Class)String.class);
                    if (!llIIIIIIIlIlIll(lllllllllllllIlIIIlIIIIllIIlIIII) || !llIIIIIIIlIllII(lllllllllllllIlIIIlIIIIllIIlIIII.length, StringTranslate.lIIIlIlIIIlIIl[2])) {
                        continue;
                    }
                    final String lllllllllllllIlIIIlIIIIllIIIllll = lllllllllllllIlIIIlIIIIllIIlIIII[StringTranslate.lIIIlIlIIIlIIl[0]];
                    final String lllllllllllllIlIIIlIIIIllIIIlllI = StringTranslate.numericVariablePattern.matcher(lllllllllllllIlIIIlIIIIllIIlIIII[StringTranslate.lIIIlIlIIIlIIl[3]]).replaceAll(StringTranslate.lIIIlIlIIIIlIl[StringTranslate.lIIIlIlIIIlIIl[2]]);
                    this.languageList.put(lllllllllllllIlIIIlIIIIllIIIllll, lllllllllllllIlIIIlIIIIllIIIlllI);
                    "".length();
                }
            }
            this.lastUpdateTimeInMilliseconds = System.currentTimeMillis();
            "".length();
            if (-"   ".length() > 0) {
                throw null;
            }
        }
        catch (IOException ex) {}
    }
    
    public static synchronized void replaceWith(final Map<String, String> lllllllllllllIlIIIlIIIIllIIIIlIl) {
        StringTranslate.instance.languageList.clear();
        StringTranslate.instance.languageList.putAll(lllllllllllllIlIIIlIIIIllIIIIlIl);
        StringTranslate.instance.lastUpdateTimeInMilliseconds = System.currentTimeMillis();
    }
    
    private static boolean llIIIIIIIlIllII(final int lllllllllllllIlIIIlIIIIlIIlIlIII, final int lllllllllllllIlIIIlIIIIlIIlIIlll) {
        return lllllllllllllIlIIIlIIIIlIIlIlIII == lllllllllllllIlIIIlIIIIlIIlIIlll;
    }
    
    public synchronized String translateKey(final String lllllllllllllIlIIIlIIIIlIllllllI) {
        return this.tryTranslateKey(lllllllllllllIlIIIlIIIIlIllllllI);
    }
    
    private static boolean llIIIIIIIlIlllI(final int lllllllllllllIlIIIlIIIIlIIlIIlII, final int lllllllllllllIlIIIlIIIIlIIlIIIll) {
        return lllllllllllllIlIIIlIIIIlIIlIIlII < lllllllllllllIlIIIlIIIIlIIlIIIll;
    }
    
    private static void llIIIIIIIlIIlll() {
        (lIIIlIlIIIIlIl = new String[StringTranslate.lIIIlIlIIIlIIl[6]])[StringTranslate.lIIIlIlIIIlIIl[0]] = llIIIIIIIIllIlI("Qk0MNEQ7QXlvNDsBDH4yTT40NjI=", "gePPo");
        StringTranslate.lIIIlIlIIIIlIl[StringTranslate.lIIIlIlIIIlIIl[3]] = llIIIIIIIIllIll("tufXwXxpK9qutrFCTB6MVRCRTWI/0eK7BWBcYcU4NwuEFrgMpbbCLw==", "sAzsj");
        StringTranslate.lIIIlIlIIIIlIl[StringTranslate.lIIIlIlIIIlIIl[2]] = llIIIIIIIIllIll("tG77MbhfraM=", "Fikes");
        StringTranslate.lIIIlIlIIIIlIl[StringTranslate.lIIIlIlIIIlIIl[5]] = llIIIIIIIlIIllI("h2BGrfaCuyqBptTirr9K9Q==", "ERHYP");
    }
    
    private static String llIIIIIIIIllIll(final String lllllllllllllIlIIIlIIIIlIIllIIII, final String lllllllllllllIlIIIlIIIIlIIlIllIl) {
        try {
            final SecretKeySpec lllllllllllllIlIIIlIIIIlIIllIIll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIlIIIlIIIIlIIlIllIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lllllllllllllIlIIIlIIIIlIIllIIlI = Cipher.getInstance("Blowfish");
            lllllllllllllIlIIIlIIIIlIIllIIlI.init(StringTranslate.lIIIlIlIIIlIIl[2], lllllllllllllIlIIIlIIIIlIIllIIll);
            return new String(lllllllllllllIlIIIlIIIIlIIllIIlI.doFinal(Base64.getDecoder().decode(lllllllllllllIlIIIlIIIIlIIllIIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIlIIIlIIIIlIIllIIIl) {
            lllllllllllllIlIIIlIIIIlIIllIIIl.printStackTrace();
            return null;
        }
    }
    
    public synchronized String translateKeyFormat(final String lllllllllllllIlIIIlIIIIlIlllIIlI, final Object... lllllllllllllIlIIIlIIIIlIlllIllI) {
        final String lllllllllllllIlIIIlIIIIlIlllIlIl = this.tryTranslateKey(lllllllllllllIlIIIlIIIIlIlllIIlI);
        try {
            return String.format(lllllllllllllIlIIIlIIIIlIlllIlIl, lllllllllllllIlIIIlIIIIlIlllIllI);
        }
        catch (IllegalFormatException lllllllllllllIlIIIlIIIIlIlllIlII) {
            return String.valueOf(new StringBuilder(StringTranslate.lIIIlIlIIIIlIl[StringTranslate.lIIIlIlIIIlIIl[5]]).append(lllllllllllllIlIIIlIIIIlIlllIlIl));
        }
    }
    
    public long getLastUpdateTimeInMilliseconds() {
        return this.lastUpdateTimeInMilliseconds;
    }
    
    private static boolean llIIIIIIIlIlIll(final Object lllllllllllllIlIIIlIIIIlIIlIIIIl) {
        return lllllllllllllIlIIIlIIIIlIIlIIIIl != null;
    }
    
    private static boolean llIIIIIIIlIlIIl(final int lllllllllllllIlIIIlIIIIlIIIlllIl) {
        return lllllllllllllIlIIIlIIIIlIIIlllIl == 0;
    }
}
