// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.client.resources;

import java.util.Iterator;
import com.google.common.collect.Iterables;
import org.apache.commons.io.Charsets;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import com.google.common.collect.Maps;
import java.util.IllegalFormatException;
import net.minecraft.util.ResourceLocation;
import java.io.IOException;
import java.io.InputStream;
import org.apache.commons.io.IOUtils;
import java.util.List;
import java.util.Map;
import com.google.common.base.Splitter;
import java.util.regex.Pattern;

public class Locale
{
    private static final /* synthetic */ Pattern pattern;
    private static final /* synthetic */ int[] lIIllIlllIIIlI;
    private static final /* synthetic */ Splitter splitter;
    private static final /* synthetic */ String[] lIIllIllIllIII;
    /* synthetic */ Map<String, String> properties;
    private /* synthetic */ boolean unicode;
    
    private void loadLocaleData(final List<IResource> lllllllllllllIIlIlIIllIIIIlIIIlI) throws IOException {
        final float lllllllllllllIIlIlIIllIIIIIlllII = (float)lllllllllllllIIlIlIIllIIIIlIIIlI.iterator();
        "".length();
        if (null != null) {
            return;
        }
        while (!llIllIIllllIlll(((Iterator)lllllllllllllIIlIlIIllIIIIIlllII).hasNext() ? 1 : 0)) {
            final IResource lllllllllllllIIlIlIIllIIIIlIIIIl = ((Iterator<IResource>)lllllllllllllIIlIlIIllIIIIIlllII).next();
            final InputStream lllllllllllllIIlIlIIllIIIIlIIIII = lllllllllllllIIlIlIIllIIIIlIIIIl.getInputStream();
            try {
                this.loadLocaleData(lllllllllllllIIlIlIIllIIIIlIIIII);
                "".length();
                if ((0x2 ^ 0x6) > (0x4D ^ 0x49)) {
                    return;
                }
            }
            finally {
                IOUtils.closeQuietly(lllllllllllllIIlIlIIllIIIIlIIIII);
            }
            IOUtils.closeQuietly(lllllllllllllIIlIlIIllIIIIlIIIII);
        }
    }
    
    public synchronized void loadLocaleDataFiles(final IResourceManager lllllllllllllIIlIlIIllIIIlIIlIIl, final List<String> lllllllllllllIIlIlIIllIIIlIIlllI) {
        this.properties.clear();
        final double lllllllllllllIIlIlIIllIIIlIIIllI = (double)lllllllllllllIIlIlIIllIIIlIIlllI.iterator();
        "".length();
        if ((0x21 ^ 0x61 ^ (0x27 ^ 0x63)) <= 0) {
            return;
        }
        while (!llIllIIllllIlll(((Iterator)lllllllllllllIIlIlIIllIIIlIIIllI).hasNext() ? 1 : 0)) {
            final String lllllllllllllIIlIlIIllIIIlIIllIl = ((Iterator<String>)lllllllllllllIIlIlIIllIIIlIIIllI).next();
            final String format = Locale.lIIllIllIllIII[Locale.lIIllIlllIIIlI[3]];
            final Object[] args = new Object[Locale.lIIllIlllIIIlI[3]];
            args[Locale.lIIllIlllIIIlI[2]] = lllllllllllllIIlIlIIllIIIlIIllIl;
            final String lllllllllllllIIlIlIIllIIIlIIllII = String.format(format, args);
            final Exception lllllllllllllIIlIlIIllIIIlIIIIll = (Exception)lllllllllllllIIlIlIIllIIIlIIlIIl.getResourceDomains().iterator();
            "".length();
            if (null != null) {
                return;
            }
            while (!llIllIIllllIlll(((Iterator)lllllllllllllIIlIlIIllIIIlIIIIll).hasNext() ? 1 : 0)) {
                final String lllllllllllllIIlIlIIllIIIlIIlIll = ((Iterator<String>)lllllllllllllIIlIlIIllIIIlIIIIll).next();
                try {
                    this.loadLocaleData(lllllllllllllIIlIlIIllIIIlIIlIIl.getAllResources(new ResourceLocation(lllllllllllllIIlIlIIllIIIlIIlIll, lllllllllllllIIlIlIIllIIIlIIllII)));
                    "".length();
                    if (((0x3 ^ 0x46) & ~(0x13 ^ 0x56)) < 0) {
                        return;
                    }
                    continue;
                }
                catch (IOException ex) {}
            }
        }
        this.checkUnicode();
    }
    
    private static void llIllIIllllIlIl() {
        (lIIllIlllIIIlI = new int[9])[0] = (40 + 132 + 60 + 23 ^ 119 + 72 - 91 + 94);
        Locale.lIIllIlllIIIlI[1] = "  ".length();
        Locale.lIIllIlllIIIlI[2] = ((48 + 75 - 121 + 136 ^ 121 + 156 - 145 + 36) & (14 + 86 + 20 + 12 ^ 127 + 127 - 252 + 164 ^ -" ".length()));
        Locale.lIIllIlllIIIlI[3] = " ".length();
        Locale.lIIllIlllIIIlI[4] = (0xFFFFB9C3 & 0x473C);
        Locale.lIIllIlllIIIlI[5] = (0x16 ^ 0x35);
        Locale.lIIllIlllIIIlI[6] = "   ".length();
        Locale.lIIllIlllIIIlI[7] = (0xB8 ^ 0xBC);
        Locale.lIIllIlllIIIlI[8] = (78 + 97 - 151 + 139 ^ 133 + 95 - 70 + 13);
    }
    
    public String formatMessage(final String lllllllllllllIIlIlIIlIllllllIllI, final Object[] lllllllllllllIIlIlIIlIllllllIIII) {
        final String lllllllllllllIIlIlIIlIllllllIlII = this.translateKeyPrivate(lllllllllllllIIlIlIIlIllllllIllI);
        try {
            return String.format(lllllllllllllIIlIlIIlIllllllIlII, lllllllllllllIIlIlIIlIllllllIIII);
        }
        catch (IllegalFormatException lllllllllllllIIlIlIIlIllllllIIll) {
            return String.valueOf(new StringBuilder(Locale.lIIllIllIllIII[Locale.lIIllIlllIIIlI[6]]).append(lllllllllllllIIlIlIIlIllllllIlII));
        }
    }
    
    static {
        llIllIIllllIlIl();
        llIllIIllllIIII();
        splitter = Splitter.on((char)Locale.lIIllIlllIIIlI[0]).limit(Locale.lIIllIlllIIIlI[1]);
        pattern = Pattern.compile(Locale.lIIllIllIllIII[Locale.lIIllIlllIIIlI[2]]);
    }
    
    public boolean isUnicode() {
        return this.unicode;
    }
    
    public Locale() {
        this.properties = (Map<String, String>)Maps.newHashMap();
    }
    
    private static boolean llIllIIllllllIl(final int lllllllllllllIIlIlIIlIllllIIIllI, final int lllllllllllllIIlIlIIlIllllIIIlIl) {
        return lllllllllllllIIlIlIIlIllllIIIllI == lllllllllllllIIlIlIIlIllllIIIlIl;
    }
    
    private static boolean llIllIIlllllIll(final int lllllllllllllIIlIlIIlIlllIllIIlI, final int lllllllllllllIIlIlIIlIlllIllIIIl) {
        return lllllllllllllIIlIlIIlIlllIllIIlI != lllllllllllllIIlIlIIlIlllIllIIIl;
    }
    
    private static String llIllIIlllIllIl(final String lllllllllllllIIlIlIIlIllllIIllII, final String lllllllllllllIIlIlIIlIllllIIlIll) {
        try {
            final SecretKeySpec lllllllllllllIIlIlIIlIllllIlIIIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIIlIlIIlIllllIIlIll.getBytes(StandardCharsets.UTF_8)), Locale.lIIllIlllIIIlI[8]), "DES");
            final Cipher lllllllllllllIIlIlIIlIllllIlIIII = Cipher.getInstance("DES");
            lllllllllllllIIlIlIIlIllllIlIIII.init(Locale.lIIllIlllIIIlI[1], lllllllllllllIIlIlIIlIllllIlIIIl);
            return new String(lllllllllllllIIlIlIIlIllllIlIIII.doFinal(Base64.getDecoder().decode(lllllllllllllIIlIlIIlIllllIIllII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIlIlIIlIllllIIllll) {
            lllllllllllllIIlIlIIlIllllIIllll.printStackTrace();
            return null;
        }
    }
    
    private void loadLocaleData(final InputStream lllllllllllllIIlIlIIllIIIIIlIIIl) throws IOException {
        final short lllllllllllllIIlIlIIllIIIIIIlIIl = (short)IOUtils.readLines(lllllllllllllIIlIlIIllIIIIIlIIIl, Charsets.UTF_8).iterator();
        "".length();
        if (" ".length() != " ".length()) {
            return;
        }
        while (!llIllIIllllIlll(((Iterator)lllllllllllllIIlIlIIllIIIIIIlIIl).hasNext() ? 1 : 0)) {
            final String lllllllllllllIIlIlIIllIIIIIlIIII = ((Iterator<String>)lllllllllllllIIlIlIIllIIIIIIlIIl).next();
            if (llIllIIllllIlll(lllllllllllllIIlIlIIllIIIIIlIIII.isEmpty() ? 1 : 0) && llIllIIlllllIll(lllllllllllllIIlIlIIllIIIIIlIIII.charAt(Locale.lIIllIlllIIIlI[2]), Locale.lIIllIlllIIIlI[5])) {
                final String[] lllllllllllllIIlIlIIllIIIIIIllll = (String[])Iterables.toArray(Locale.splitter.split((CharSequence)lllllllllllllIIlIlIIllIIIIIlIIII), (Class)String.class);
                if (!llIllIIllllllII(lllllllllllllIIlIlIIllIIIIIIllll) || !llIllIIllllllIl(lllllllllllllIIlIlIIllIIIIIIllll.length, Locale.lIIllIlllIIIlI[1])) {
                    continue;
                }
                final String lllllllllllllIIlIlIIllIIIIIIlllI = lllllllllllllIIlIlIIllIIIIIIllll[Locale.lIIllIlllIIIlI[2]];
                final String lllllllllllllIIlIlIIllIIIIIIllIl = Locale.pattern.matcher(lllllllllllllIIlIlIIllIIIIIIllll[Locale.lIIllIlllIIIlI[3]]).replaceAll(Locale.lIIllIllIllIII[Locale.lIIllIlllIIIlI[1]]);
                this.properties.put(lllllllllllllIIlIlIIllIIIIIIlllI, lllllllllllllIIlIlIIllIIIIIIllIl);
                "".length();
            }
        }
    }
    
    private static boolean llIllIIlllllIIl(final int lllllllllllllIIlIlIIlIllllIIIIlI, final int lllllllllllllIIlIlIIlIllllIIIIIl) {
        return lllllllllllllIIlIlIIlIllllIIIIlI >= lllllllllllllIIlIlIIlIllllIIIIIl;
    }
    
    private static boolean llIllIIlllllIlI(final int lllllllllllllIIlIlIIlIlllIllIlIl) {
        return lllllllllllllIIlIlIIlIlllIllIlIl > 0;
    }
    
    private static String llIllIIlllIllll(String lllllllllllllIIlIlIIlIllllIllllI, final String lllllllllllllIIlIlIIlIlllllIIIlI) {
        lllllllllllllIIlIlIIlIllllIllllI = new String(Base64.getDecoder().decode(lllllllllllllIIlIlIIlIllllIllllI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIIlIlIIlIlllllIIIIl = new StringBuilder();
        final char[] lllllllllllllIIlIlIIlIlllllIIIII = lllllllllllllIIlIlIIlIlllllIIIlI.toCharArray();
        int lllllllllllllIIlIlIIlIllllIlllll = Locale.lIIllIlllIIIlI[2];
        final boolean lllllllllllllIIlIlIIlIllllIllIIl = (Object)lllllllllllllIIlIlIIlIllllIllllI.toCharArray();
        final long lllllllllllllIIlIlIIlIllllIllIII = lllllllllllllIIlIlIIlIllllIllIIl.length;
        short lllllllllllllIIlIlIIlIllllIlIlll = (short)Locale.lIIllIlllIIIlI[2];
        while (llIllIIllllllll(lllllllllllllIIlIlIIlIllllIlIlll, (int)lllllllllllllIIlIlIIlIllllIllIII)) {
            final char lllllllllllllIIlIlIIlIlllllIIlII = lllllllllllllIIlIlIIlIllllIllIIl[lllllllllllllIIlIlIIlIllllIlIlll];
            lllllllllllllIIlIlIIlIlllllIIIIl.append((char)(lllllllllllllIIlIlIIlIlllllIIlII ^ lllllllllllllIIlIlIIlIlllllIIIII[lllllllllllllIIlIlIIlIllllIlllll % lllllllllllllIIlIlIIlIlllllIIIII.length]));
            "".length();
            ++lllllllllllllIIlIlIIlIllllIlllll;
            ++lllllllllllllIIlIlIIlIllllIlIlll;
            "".length();
            if ("   ".length() < 0) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIIlIlIIlIlllllIIIIl);
    }
    
    private static boolean llIllIIllllIlll(final int lllllllllllllIIlIlIIlIlllIllIlll) {
        return lllllllllllllIIlIlIIlIlllIllIlll == 0;
    }
    
    private static boolean llIllIIllllllII(final Object lllllllllllllIIlIlIIlIlllIlllIll) {
        return lllllllllllllIIlIlIIlIlllIlllIll != null;
    }
    
    private void checkUnicode() {
        this.unicode = (Locale.lIIllIlllIIIlI[2] != 0);
        int lllllllllllllIIlIlIIllIIIIllIllI = Locale.lIIllIlllIIIlI[2];
        int lllllllllllllIIlIlIIllIIIIllIlIl = Locale.lIIllIlllIIIlI[2];
        final boolean lllllllllllllIIlIlIIllIIIIlIllII = (boolean)this.properties.values().iterator();
        "".length();
        if (null != null) {
            return;
        }
        while (!llIllIIllllIlll(((Iterator)lllllllllllllIIlIlIIllIIIIlIllII).hasNext() ? 1 : 0)) {
            final String lllllllllllllIIlIlIIllIIIIllIlII = ((Iterator<String>)lllllllllllllIIlIlIIllIIIIlIllII).next();
            final int lllllllllllllIIlIlIIllIIIIllIIll = lllllllllllllIIlIlIIllIIIIllIlII.length();
            lllllllllllllIIlIlIIllIIIIllIlIl += lllllllllllllIIlIlIIllIIIIllIIll;
            int lllllllllllllIIlIlIIllIIIIllIIlI = Locale.lIIllIlllIIIlI[2];
            "".length();
            if (null != null) {
                return;
            }
            while (!llIllIIlllllIIl(lllllllllllllIIlIlIIllIIIIllIIlI, lllllllllllllIIlIlIIllIIIIllIIll)) {
                if (llIllIIlllllIIl(lllllllllllllIIlIlIIllIIIIllIlII.charAt(lllllllllllllIIlIlIIllIIIIllIIlI), Locale.lIIllIlllIIIlI[4])) {
                    ++lllllllllllllIIlIlIIllIIIIllIllI;
                }
                ++lllllllllllllIIlIlIIllIIIIllIIlI;
            }
        }
        final float lllllllllllllIIlIlIIllIIIIllIIIl = lllllllllllllIIlIlIIllIIIIllIllI / (float)lllllllllllllIIlIlIIllIIIIllIlIl;
        int unicode;
        if (llIllIIlllllIlI(llIllIIlllllIII(lllllllllllllIIlIlIIllIIIIllIIIl, 0.1))) {
            unicode = Locale.lIIllIlllIIIlI[3];
            "".length();
            if (((0x2B ^ 0x66 ^ (0x66 ^ 0x1)) & (56 + 71 - 114 + 143 ^ 59 + 86 + 37 + 0 ^ -" ".length())) <= -" ".length()) {
                return;
            }
        }
        else {
            unicode = Locale.lIIllIlllIIIlI[2];
        }
        this.unicode = (unicode != 0);
    }
    
    private static int llIllIIlllllIII(final double n, final double n2) {
        return dcmpl(n, n2);
    }
    
    private String translateKeyPrivate(final String lllllllllllllIIlIlIIllIIIIIIIIIl) {
        final String lllllllllllllIIlIlIIllIIIIIIIIII = this.properties.get(lllllllllllllIIlIlIIllIIIIIIIIIl);
        String s;
        if (llIllIIlllllllI(lllllllllllllIIlIlIIllIIIIIIIIII)) {
            s = lllllllllllllIIlIlIIllIIIIIIIIIl;
            "".length();
            if ("  ".length() == 0) {
                return null;
            }
        }
        else {
            s = lllllllllllllIIlIlIIllIIIIIIIIII;
        }
        return s;
    }
    
    private static void llIllIIllllIIII() {
        (lIIllIllIllIII = new String[Locale.lIIllIlllIIIlI[7]])[Locale.lIIllIlllIIIlI[2]] = llIllIIlllIllIl("IXrb+ud3XkpWRQB5CaHOPP69D1HyBOnn", "HOKYS");
        Locale.lIIllIllIllIII[Locale.lIIllIlllIIIlI[3]] = llIllIIlllIllll("HwoWDnpWGFYFNB0M", "skxiU");
        Locale.lIIllIllIllIII[Locale.lIIllIlllIIIlI[1]] = llIllIIlllIllIl("Ygv6sr3BhQQ=", "YgLxK");
        Locale.lIIllIllIllIII[Locale.lIIllIlllIIIlI[6]] = llIllIIlllIllll("CgIeHDA4TQkDIyMfVlE=", "LmlqQ");
    }
    
    private static boolean llIllIIlllllllI(final Object lllllllllllllIIlIlIIlIlllIlllIIl) {
        return lllllllllllllIIlIlIIlIlllIlllIIl == null;
    }
    
    private static boolean llIllIIllllllll(final int lllllllllllllIIlIlIIlIlllIlllllI, final int lllllllllllllIIlIlIIlIlllIllllIl) {
        return lllllllllllllIIlIlIIlIlllIlllllI < lllllllllllllIIlIlIIlIlllIllllIl;
    }
}
