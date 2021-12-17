// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.client.util;

import org.apache.commons.lang3.StringUtils;
import java.io.FileNotFoundException;
import com.google.common.collect.Lists;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.List;
import java.io.IOException;

public class JsonException extends IOException
{
    private final /* synthetic */ String field_151382_b;
    private static final /* synthetic */ int[] llIIlIlIllllIl;
    private static final /* synthetic */ String[] llIIlIlIllllII;
    private final /* synthetic */ List<Entry> field_151383_a;
    
    private static void lIIIllIlIlllIlll() {
        (llIIlIlIllllIl = new int[5])[0] = ((0xD ^ 0x17) & ~(0x3E ^ 0x24));
        JsonException.llIIlIlIllllIl[1] = " ".length();
        JsonException.llIIlIlIllllIl[2] = "  ".length();
        JsonException.llIIlIlIllllIl[3] = "   ".length();
        JsonException.llIIlIlIllllIl[4] = (110 + 16 - 0 + 3 ^ 33 + 118 - 43 + 29);
    }
    
    private static String lIIIllIlIlllIlII(final String llllllllllllIlllIIIlIlllIlIIIllI, final String llllllllllllIlllIIIlIlllIlIIIlIl) {
        try {
            final SecretKeySpec llllllllllllIlllIIIlIlllIlIIlIIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIlllIIIlIlllIlIIIlIl.getBytes(StandardCharsets.UTF_8)), JsonException.llIIlIlIllllIl[4]), "DES");
            final Cipher llllllllllllIlllIIIlIlllIlIIlIII = Cipher.getInstance("DES");
            llllllllllllIlllIIIlIlllIlIIlIII.init(JsonException.llIIlIlIllllIl[2], llllllllllllIlllIIIlIlllIlIIlIIl);
            return new String(llllllllllllIlllIIIlIlllIlIIlIII.doFinal(Base64.getDecoder().decode(llllllllllllIlllIIIlIlllIlIIIllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIlllIIIlIlllIlIIIlll) {
            llllllllllllIlllIIIlIlllIlIIIlll.printStackTrace();
            return null;
        }
    }
    
    private static boolean lIIIllIlIllllIII(final int llllllllllllIlllIIIlIlllIIlllIll) {
        return llllllllllllIlllIIIlIlllIIlllIll != 0;
    }
    
    private static void lIIIllIlIlllIllI() {
        (llIIlIlIllllII = new String[JsonException.llIIlIlIllllIl[3]])[JsonException.llIIlIlIllllIl[0]] = lIIIllIlIlllIlII("p40FAv9GhjkAjOniGyzgKQ==", "LmcoA");
        JsonException.llIIlIlIllllII[JsonException.llIIlIlIllllIl[1]] = lIIIllIlIlllIlIl("eEw=", "BlLjA");
        JsonException.llIIlIlIllllII[JsonException.llIIlIlIllllIl[2]] = lIIIllIlIlllIlII("CrwhAJ91qvmOSjP1XkSaxw==", "CGlmR");
    }
    
    @Override
    public String getMessage() {
        return String.valueOf(new StringBuilder(JsonException.llIIlIlIllllII[JsonException.llIIlIlIllllIl[0]]).append(this.field_151383_a.get(this.field_151383_a.size() - JsonException.llIIlIlIllllIl[1]).toString()).append(JsonException.llIIlIlIllllII[JsonException.llIIlIlIllllIl[1]]).append(this.field_151382_b));
    }
    
    public JsonException(final String llllllllllllIlllIIIlIllllIIIIlII) {
        this.field_151383_a = (List<Entry>)Lists.newArrayList();
        this.field_151383_a.add(new Entry(null));
        "".length();
        this.field_151382_b = llllllllllllIlllIIIlIllllIIIIlII;
    }
    
    private static boolean lIIIllIlIllllIIl(final int llllllllllllIlllIIIlIlllIIlllllI, final int llllllllllllIlllIIIlIlllIIllllIl) {
        return llllllllllllIlllIIIlIlllIIlllllI < llllllllllllIlllIIIlIlllIIllllIl;
    }
    
    public JsonException(final String llllllllllllIlllIIIlIlllIlllllII, final Throwable llllllllllllIlllIIIlIlllIllllllI) {
        super(llllllllllllIlllIIIlIlllIllllllI);
        this.field_151383_a = (List<Entry>)Lists.newArrayList();
        this.field_151383_a.add(new Entry(null));
        "".length();
        this.field_151382_b = llllllllllllIlllIIIlIlllIlllllII;
    }
    
    static {
        lIIIllIlIlllIlll();
        lIIIllIlIlllIllI();
    }
    
    public static JsonException func_151379_a(final Exception llllllllllllIlllIIIlIlllIllIlIIl) {
        if (lIIIllIlIllllIII((llllllllllllIlllIIIlIlllIllIlIIl instanceof JsonException) ? 1 : 0)) {
            return (JsonException)llllllllllllIlllIIIlIlllIllIlIIl;
        }
        String llllllllllllIlllIIIlIlllIllIlIII = llllllllllllIlllIIIlIlllIllIlIIl.getMessage();
        if (lIIIllIlIllllIII((llllllllllllIlllIIIlIlllIllIlIIl instanceof FileNotFoundException) ? 1 : 0)) {
            llllllllllllIlllIIIlIlllIllIlIII = JsonException.llIIlIlIllllII[JsonException.llIIlIlIllllIl[2]];
        }
        return new JsonException(llllllllllllIlllIIIlIlllIllIlIII, llllllllllllIlllIIIlIlllIllIlIIl);
    }
    
    public void func_151381_b(final String llllllllllllIlllIIIlIlllIlllIIIl) {
        Entry.access$2(this.field_151383_a.get(JsonException.llIIlIlIllllIl[0]), llllllllllllIlllIIIlIlllIlllIIIl);
        this.field_151383_a.add(JsonException.llIIlIlIllllIl[0], new Entry(null));
    }
    
    public void func_151380_a(final String llllllllllllIlllIIIlIlllIlllIlIl) {
        this.field_151383_a.get(JsonException.llIIlIlIllllIl[0]).func_151373_a(llllllllllllIlllIIIlIlllIlllIlIl);
    }
    
    private static String lIIIllIlIlllIlIl(String llllllllllllIlllIIIlIlllIlIlIllI, final String llllllllllllIlllIIIlIlllIlIllIlI) {
        llllllllllllIlllIIIlIlllIlIlIllI = new String(Base64.getDecoder().decode(llllllllllllIlllIIIlIlllIlIlIllI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder llllllllllllIlllIIIlIlllIlIllIIl = new StringBuilder();
        final char[] llllllllllllIlllIIIlIlllIlIllIII = llllllllllllIlllIIIlIlllIlIllIlI.toCharArray();
        int llllllllllllIlllIIIlIlllIlIlIlll = JsonException.llIIlIlIllllIl[0];
        final long llllllllllllIlllIIIlIlllIlIlIIIl = (Object)llllllllllllIlllIIIlIlllIlIlIllI.toCharArray();
        final char llllllllllllIlllIIIlIlllIlIlIIII = (char)llllllllllllIlllIIIlIlllIlIlIIIl.length;
        boolean llllllllllllIlllIIIlIlllIlIIllll = JsonException.llIIlIlIllllIl[0] != 0;
        while (lIIIllIlIllllIIl(llllllllllllIlllIIIlIlllIlIIllll ? 1 : 0, llllllllllllIlllIIIlIlllIlIlIIII)) {
            final char llllllllllllIlllIIIlIlllIlIlllII = llllllllllllIlllIIIlIlllIlIlIIIl[llllllllllllIlllIIIlIlllIlIIllll];
            llllllllllllIlllIIIlIlllIlIllIIl.append((char)(llllllllllllIlllIIIlIlllIlIlllII ^ llllllllllllIlllIIIlIlllIlIllIII[llllllllllllIlllIIIlIlllIlIlIlll % llllllllllllIlllIIIlIlllIlIllIII.length]));
            "".length();
            ++llllllllllllIlllIIIlIlllIlIlIlll;
            ++llllllllllllIlllIIIlIlllIlIIllll;
            "".length();
            if (-" ".length() >= 0) {
                return null;
            }
        }
        return String.valueOf(llllllllllllIlllIIIlIlllIlIllIIl);
    }
    
    public static class Entry
    {
        private /* synthetic */ String field_151376_a;
        private static final /* synthetic */ int[] lIIlIlIlIlIIlI;
        private static final /* synthetic */ String[] lIIlIlIlIIllll;
        private final /* synthetic */ List<String> field_151375_b;
        
        @Override
        public String toString() {
            String s;
            if (llIlIIIIlIlIIII(this.field_151376_a)) {
                if (llIlIIIIlIlIIIl(this.field_151375_b.isEmpty() ? 1 : 0)) {
                    s = String.valueOf(new StringBuilder(String.valueOf(this.field_151376_a)).append(Entry.lIIlIlIlIIllll[Entry.lIIlIlIlIlIIlI[1]]).append(this.func_151372_b()));
                    "".length();
                    if (" ".length() > (0x42 ^ 0x46)) {
                        return null;
                    }
                }
                else {
                    s = this.field_151376_a;
                    "".length();
                    if (((205 + 126 - 196 + 75 ^ 52 + 84 - 93 + 133) & (0x49 ^ 0x2D ^ (0x72 ^ 0x74) ^ -" ".length())) >= " ".length()) {
                        return null;
                    }
                }
            }
            else if (llIlIIIIlIlIIIl(this.field_151375_b.isEmpty() ? 1 : 0)) {
                s = String.valueOf(new StringBuilder(Entry.lIIlIlIlIIllll[Entry.lIIlIlIlIlIIlI[2]]).append(this.func_151372_b()));
                "".length();
                if ("   ".length() <= 0) {
                    return null;
                }
            }
            else {
                s = Entry.lIIlIlIlIIllll[Entry.lIIlIlIlIlIIlI[3]];
            }
            return s;
        }
        
        private static String llIlIIIIlIIIllI(final String lllllllllllllIIllIIlllllIlllIIIl, final String lllllllllllllIIllIIlllllIllIlllI) {
            try {
                final SecretKeySpec lllllllllllllIIllIIlllllIlllIlII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIIllIIlllllIllIlllI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
                final Cipher lllllllllllllIIllIIlllllIlllIIll = Cipher.getInstance("Blowfish");
                lllllllllllllIIllIIlllllIlllIIll.init(Entry.lIIlIlIlIlIIlI[2], lllllllllllllIIllIIlllllIlllIlII);
                return new String(lllllllllllllIIllIIlllllIlllIIll.doFinal(Base64.getDecoder().decode(lllllllllllllIIllIIlllllIlllIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
            }
            catch (Exception lllllllllllllIIllIIlllllIlllIIlI) {
                lllllllllllllIIllIIlllllIlllIIlI.printStackTrace();
                return null;
            }
        }
        
        static /* synthetic */ void access$2(final Entry lllllllllllllIIllIIllllllIIlIIlI, final String lllllllllllllIIllIIllllllIIlIIIl) {
            lllllllllllllIIllIIllllllIIlIIlI.field_151376_a = lllllllllllllIIllIIllllllIIlIIIl;
        }
        
        private static boolean llIlIIIIlIlIIlI(final int lllllllllllllIIllIIlllllIllIlIIl, final int lllllllllllllIIllIIlllllIllIlIII) {
            return lllllllllllllIIllIIlllllIllIlIIl < lllllllllllllIIllIIlllllIllIlIII;
        }
        
        private static boolean llIlIIIIlIlIIIl(final int lllllllllllllIIllIIlllllIllIIlII) {
            return lllllllllllllIIllIIlllllIllIIlII == 0;
        }
        
        private Entry() {
            this.field_151376_a = null;
            this.field_151375_b = (List<String>)Lists.newArrayList();
        }
        
        private static boolean llIlIIIIlIlIIII(final Object lllllllllllllIIllIIlllllIllIIllI) {
            return lllllllllllllIIllIIlllllIllIIllI != null;
        }
        
        private static String llIlIIIIlIIIlll(String lllllllllllllIIllIIllllllIIIIIIl, final String lllllllllllllIIllIIllllllIIIIlIl) {
            lllllllllllllIIllIIllllllIIIIIIl = (Exception)new String(Base64.getDecoder().decode(((String)lllllllllllllIIllIIllllllIIIIIIl).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
            final StringBuilder lllllllllllllIIllIIllllllIIIIlII = new StringBuilder();
            final char[] lllllllllllllIIllIIllllllIIIIIll = lllllllllllllIIllIIllllllIIIIlIl.toCharArray();
            int lllllllllllllIIllIIllllllIIIIIlI = Entry.lIIlIlIlIlIIlI[0];
            final double lllllllllllllIIllIIlllllIlllllII = (Object)((String)lllllllllllllIIllIIllllllIIIIIIl).toCharArray();
            final boolean lllllllllllllIIllIIlllllIllllIll = lllllllllllllIIllIIlllllIlllllII.length != 0;
            String lllllllllllllIIllIIlllllIllllIlI = (String)Entry.lIIlIlIlIlIIlI[0];
            while (llIlIIIIlIlIIlI((int)lllllllllllllIIllIIlllllIllllIlI, lllllllllllllIIllIIlllllIllllIll ? 1 : 0)) {
                final char lllllllllllllIIllIIllllllIIIIlll = lllllllllllllIIllIIlllllIlllllII[lllllllllllllIIllIIlllllIllllIlI];
                lllllllllllllIIllIIllllllIIIIlII.append((char)(lllllllllllllIIllIIllllllIIIIlll ^ lllllllllllllIIllIIllllllIIIIIll[lllllllllllllIIllIIllllllIIIIIlI % lllllllllllllIIllIIllllllIIIIIll.length]));
                "".length();
                ++lllllllllllllIIllIIllllllIIIIIlI;
                ++lllllllllllllIIllIIlllllIllllIlI;
                "".length();
                if (-"  ".length() > 0) {
                    return null;
                }
            }
            return String.valueOf(lllllllllllllIIllIIllllllIIIIlII);
        }
        
        private static void llIlIIIIlIIlIII() {
            (lIIlIlIlIIllll = new String[Entry.lIIlIlIlIlIIlI[4]])[Entry.lIIlIlIlIlIIlI[0]] = llIlIIIIlIIIllI("f3kmejxUEPg=", "loujX");
            Entry.lIIlIlIlIIllll[Entry.lIIlIlIlIlIIlI[1]] = llIlIIIIlIIIllI("fVgNQKZvF5U=", "nBCrB");
            Entry.lIIlIlIlIIllll[Entry.lIIlIlIlIlIIlI[2]] = llIlIIIIlIIIlll("ayA8IDwsAjxrNCoZN2Jy", "CuRKR");
            Entry.lIIlIlIlIIllll[Entry.lIIlIlIlIlIIlI[3]] = llIlIIIIlIIIllI("N97Hn6kyYqnE0U1mw9kRuQ==", "lrryC");
        }
        
        private void func_151373_a(final String lllllllllllllIIllIIllllllIlIIIll) {
            this.field_151375_b.add(Entry.lIIlIlIlIlIIlI[0], lllllllllllllIIllIIllllllIlIIIll);
        }
        
        static {
            llIlIIIIlIIllll();
            llIlIIIIlIIlIII();
        }
        
        public String func_151372_b() {
            return StringUtils.join((Iterable)this.field_151375_b, Entry.lIIlIlIlIIllll[Entry.lIIlIlIlIlIIlI[0]]);
        }
        
        private static void llIlIIIIlIIllll() {
            (lIIlIlIlIlIIlI = new int[5])[0] = ((84 + 153 - 204 + 134 ^ 72 + 148 - 96 + 35) & (0xB2 ^ 0xC2 ^ (0xE ^ 0x46) ^ -" ".length()));
            Entry.lIIlIlIlIlIIlI[1] = " ".length();
            Entry.lIIlIlIlIlIIlI[2] = "  ".length();
            Entry.lIIlIlIlIlIIlI[3] = "   ".length();
            Entry.lIIlIlIlIlIIlI[4] = (0xC4 ^ 0xC0);
        }
    }
}
