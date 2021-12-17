// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.client.resources;

import java.nio.charset.StandardCharsets;
import java.util.Base64;

public class Language implements Comparable<Language>
{
    private static final /* synthetic */ String[] lIlIIIIIIIIIll;
    private final /* synthetic */ String languageCode;
    private final /* synthetic */ String name;
    private final /* synthetic */ String region;
    private final /* synthetic */ boolean bidirectional;
    private static final /* synthetic */ int[] lIlIIIIIIIIlII;
    
    private static boolean llIlllllllllIIl(final int lllllllllllllIIlIIIlIlIlIlllIIII, final int lllllllllllllIIlIIIlIlIlIllIllll) {
        return lllllllllllllIIlIIIlIlIlIlllIIII < lllllllllllllIIlIIIlIlIlIllIllll;
    }
    
    private static void llIllllllllIllI() {
        (lIlIIIIIIIIlII = new int[3])[0] = ((0x9B ^ 0x86 ^ (0x20 ^ 0x2F)) & (0x1A ^ 0x3F ^ (0x7 ^ 0x30) ^ -" ".length()));
        Language.lIlIIIIIIIIlII[1] = "  ".length();
        Language.lIlIIIIIIIIlII[2] = " ".length();
    }
    
    private static boolean llIlllllllllIII(final int lllllllllllllIIlIIIlIlIlIllIlIIl) {
        return lllllllllllllIIlIIIlIlIlIllIlIIl == 0;
    }
    
    @Override
    public int compareTo(final Language lllllllllllllIIlIIIlIlIllIIlIIIl) {
        return this.languageCode.compareTo(lllllllllllllIIlIIIlIlIllIIlIIIl.languageCode);
    }
    
    public Language(final String lllllllllllllIIlIIIlIlIllIlIlIlI, final String lllllllllllllIIlIIIlIlIllIlIlllI, final String lllllllllllllIIlIIIlIlIllIlIlIII, final boolean lllllllllllllIIlIIIlIlIllIlIIlll) {
        this.languageCode = lllllllllllllIIlIIIlIlIllIlIlIlI;
        this.region = lllllllllllllIIlIIIlIlIllIlIlllI;
        this.name = lllllllllllllIIlIIIlIlIllIlIlIII;
        this.bidirectional = lllllllllllllIIlIIIlIlIllIlIIlll;
    }
    
    @Override
    public boolean equals(final Object lllllllllllllIIlIIIlIlIllIIllIII) {
        int equals;
        if (llIllllllllIlll(this, lllllllllllllIIlIIIlIlIllIIllIII)) {
            equals = Language.lIlIIIIIIIIlII[2];
            "".length();
            if ((0x4F ^ 0x4A) == 0x0) {
                return ((0x35 ^ 0x2B) & ~(0xB0 ^ 0xAE)) != 0x0;
            }
        }
        else if (llIlllllllllIII((lllllllllllllIIlIIIlIlIllIIllIII instanceof Language) ? 1 : 0)) {
            equals = Language.lIlIIIIIIIIlII[0];
            "".length();
            if ("   ".length() < "  ".length()) {
                return ((0xBC ^ 0xB9) & ~(0x9 ^ 0xC)) != 0x0;
            }
        }
        else {
            equals = (this.languageCode.equals(((Language)lllllllllllllIIlIIIlIlIllIIllIII).languageCode) ? 1 : 0);
        }
        return equals != 0;
    }
    
    public String getLanguageCode() {
        return this.languageCode;
    }
    
    static {
        llIllllllllIllI();
        llIllllllllIlIl();
    }
    
    private static String llIllllllllIlII(String lllllllllllllIIlIIIlIlIlIllllIll, final String lllllllllllllIIlIIIlIlIlIlllllll) {
        lllllllllllllIIlIIIlIlIlIllllIll = (byte)new String(Base64.getDecoder().decode(((String)lllllllllllllIIlIIIlIlIlIllllIll).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIIlIIIlIlIlIllllllI = new StringBuilder();
        final char[] lllllllllllllIIlIIIlIlIlIlllllIl = lllllllllllllIIlIIIlIlIlIlllllll.toCharArray();
        int lllllllllllllIIlIIIlIlIlIlllllII = Language.lIlIIIIIIIIlII[0];
        final char lllllllllllllIIlIIIlIlIlIlllIllI = (Object)((String)lllllllllllllIIlIIIlIlIlIllllIll).toCharArray();
        final String lllllllllllllIIlIIIlIlIlIlllIlIl = (String)lllllllllllllIIlIIIlIlIlIlllIllI.length;
        float lllllllllllllIIlIIIlIlIlIlllIlII = Language.lIlIIIIIIIIlII[0];
        while (llIlllllllllIIl((int)lllllllllllllIIlIIIlIlIlIlllIlII, (int)lllllllllllllIIlIIIlIlIlIlllIlIl)) {
            final char lllllllllllllIIlIIIlIlIllIIIIIIl = lllllllllllllIIlIIIlIlIlIlllIllI[lllllllllllllIIlIIIlIlIlIlllIlII];
            lllllllllllllIIlIIIlIlIlIllllllI.append((char)(lllllllllllllIIlIIIlIlIllIIIIIIl ^ lllllllllllllIIlIIIlIlIlIlllllIl[lllllllllllllIIlIIIlIlIlIlllllII % lllllllllllllIIlIIIlIlIlIlllllIl.length]));
            "".length();
            ++lllllllllllllIIlIIIlIlIlIlllllII;
            ++lllllllllllllIIlIIIlIlIlIlllIlII;
            "".length();
            if ("   ".length() > "   ".length()) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIIlIIIlIlIlIllllllI);
    }
    
    public boolean isBidirectional() {
        return this.bidirectional;
    }
    
    private static boolean llIllllllllIlll(final Object lllllllllllllIIlIIIlIlIlIllIllII, final Object lllllllllllllIIlIIIlIlIlIllIlIll) {
        return lllllllllllllIIlIIIlIlIlIllIllII == lllllllllllllIIlIIIlIlIlIllIlIll;
    }
    
    @Override
    public String toString() {
        final String format = Language.lIlIIIIIIIIIll[Language.lIlIIIIIIIIlII[0]];
        final Object[] args = new Object[Language.lIlIIIIIIIIlII[1]];
        args[Language.lIlIIIIIIIIlII[0]] = this.name;
        args[Language.lIlIIIIIIIIlII[2]] = this.region;
        return String.format(format, args);
    }
    
    private static void llIllllllllIlIl() {
        (lIlIIIIIIIIIll = new String[Language.lIlIIIIIIIIlII[2]])[Language.lIlIIIIIIIIlII[0]] = llIllllllllIlII("YAZuXW82XA==", "EuNuJ");
    }
    
    @Override
    public int hashCode() {
        return this.languageCode.hashCode();
    }
}
