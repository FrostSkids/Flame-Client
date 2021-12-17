// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.util;

import org.apache.commons.lang3.Validate;
import org.apache.commons.lang3.StringUtils;
import java.nio.charset.StandardCharsets;
import java.util.Base64;

public class ResourceLocation
{
    private static final /* synthetic */ String[] lIIlllIllllIlI;
    private static final /* synthetic */ int[] lIIlllIlllllII;
    protected final /* synthetic */ String resourceDomain;
    protected final /* synthetic */ String resourcePath;
    
    private static String llIlllIIlIlIlll(String lllllllllllllIIlIIllIlIIIlllIIII, final String lllllllllllllIIlIIllIlIIIllIllll) {
        lllllllllllllIIlIIllIlIIIlllIIII = (char)new String(Base64.getDecoder().decode(((String)lllllllllllllIIlIIllIlIIIlllIIII).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIIlIIllIlIIIlllIIll = new StringBuilder();
        final char[] lllllllllllllIIlIIllIlIIIlllIIlI = lllllllllllllIIlIIllIlIIIllIllll.toCharArray();
        int lllllllllllllIIlIIllIlIIIlllIIIl = ResourceLocation.lIIlllIlllllII[0];
        final long lllllllllllllIIlIIllIlIIIllIlIll = (Object)((String)lllllllllllllIIlIIllIlIIIlllIIII).toCharArray();
        final int lllllllllllllIIlIIllIlIIIllIlIlI = lllllllllllllIIlIIllIlIIIllIlIll.length;
        String lllllllllllllIIlIIllIlIIIllIlIIl = (String)ResourceLocation.lIIlllIlllllII[0];
        while (llIlllIIllIIIIl((int)lllllllllllllIIlIIllIlIIIllIlIIl, lllllllllllllIIlIIllIlIIIllIlIlI)) {
            final char lllllllllllllIIlIIllIlIIIlllIllI = lllllllllllllIIlIIllIlIIIllIlIll[lllllllllllllIIlIIllIlIIIllIlIIl];
            lllllllllllllIIlIIllIlIIIlllIIll.append((char)(lllllllllllllIIlIIllIlIIIlllIllI ^ lllllllllllllIIlIIllIlIIIlllIIlI[lllllllllllllIIlIIllIlIIIlllIIIl % lllllllllllllIIlIIllIlIIIlllIIlI.length]));
            "".length();
            ++lllllllllllllIIlIIllIlIIIlllIIIl;
            ++lllllllllllllIIlIIllIlIIIllIlIIl;
            "".length();
            if ("   ".length() != "   ".length()) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIIlIIllIlIIIlllIIll);
    }
    
    private static boolean llIlllIIlIllllI(final int lllllllllllllIIlIIllIlIIIllIIIIl, final int lllllllllllllIIlIIllIlIIIllIIIII) {
        return lllllllllllllIIlIIllIlIIIllIIIIl > lllllllllllllIIlIIllIlIIIllIIIII;
    }
    
    @Override
    public boolean equals(final Object lllllllllllllIIlIIllIlIIlIIIIlll) {
        if (llIlllIIlIlllll(this, lllllllllllllIIlIIllIlIIlIIIIlll)) {
            return ResourceLocation.lIIlllIlllllII[1] != 0;
        }
        if (llIlllIIllIIIII((lllllllllllllIIlIIllIlIIlIIIIlll instanceof ResourceLocation) ? 1 : 0)) {
            return ResourceLocation.lIIlllIlllllII[0] != 0;
        }
        final ResourceLocation lllllllllllllIIlIIllIlIIlIIIIllI = (ResourceLocation)lllllllllllllIIlIIllIlIIlIIIIlll;
        if (llIlllIIlIlllII(this.resourceDomain.equals(lllllllllllllIIlIIllIlIIlIIIIllI.resourceDomain) ? 1 : 0) && llIlllIIlIlllII(this.resourcePath.equals(lllllllllllllIIlIIllIlIIlIIIIllI.resourcePath) ? 1 : 0)) {
            return ResourceLocation.lIIlllIlllllII[1] != 0;
        }
        return ResourceLocation.lIIlllIlllllII[0] != 0;
    }
    
    protected static String[] splitObjectName(final String lllllllllllllIIlIIllIlIIlIIlIlll) {
        final String[] array = new String[ResourceLocation.lIIlllIlllllII[2]];
        array[ResourceLocation.lIIlllIlllllII[1]] = lllllllllllllIIlIIllIlIIlIIlIlll;
        final String[] lllllllllllllIIlIIllIlIIlIIllIIl = array;
        final int lllllllllllllIIlIIllIlIIlIIllIII = lllllllllllllIIlIIllIlIIlIIlIlll.indexOf(ResourceLocation.lIIlllIlllllII[3]);
        if (llIlllIIlIlllIl(lllllllllllllIIlIIllIlIIlIIllIII)) {
            lllllllllllllIIlIIllIlIIlIIllIIl[ResourceLocation.lIIlllIlllllII[1]] = lllllllllllllIIlIIllIlIIlIIlIlll.substring(lllllllllllllIIlIIllIlIIlIIllIII + ResourceLocation.lIIlllIlllllII[1], lllllllllllllIIlIIllIlIIlIIlIlll.length());
            if (llIlllIIlIllllI(lllllllllllllIIlIIllIlIIlIIllIII, ResourceLocation.lIIlllIlllllII[1])) {
                lllllllllllllIIlIIllIlIIlIIllIIl[ResourceLocation.lIIlllIlllllII[0]] = lllllllllllllIIlIIllIlIIlIIlIlll.substring(ResourceLocation.lIIlllIlllllII[0], lllllllllllllIIlIIllIlIIlIIllIII);
            }
        }
        return lllllllllllllIIlIIllIlIIlIIllIIl;
    }
    
    public ResourceLocation(final String lllllllllllllIIlIIllIlIIlIlIIlll) {
        this(ResourceLocation.lIIlllIlllllII[0], splitObjectName(lllllllllllllIIlIIllIlIIlIlIIlll));
    }
    
    private static boolean llIlllIIllIIIII(final int lllllllllllllIIlIIllIlIIIlIllIII) {
        return lllllllllllllIIlIIllIlIIIlIllIII == 0;
    }
    
    public ResourceLocation(final String lllllllllllllIIlIIllIlIIlIlIIIlI, final String lllllllllllllIIlIIllIlIIlIIllllI) {
        final int lllllllllllllIIlIIllIlIIlIllIIII = ResourceLocation.lIIlllIlllllII[0];
        final String[] lllllllllllllIIlIIllIlIIlIlIllIl = new String[ResourceLocation.lIIlllIlllllII[2]];
        lllllllllllllIIlIIllIlIIlIlIllIl[ResourceLocation.lIIlllIlllllII[0]] = lllllllllllllIIlIIllIlIIlIlIIIlI;
        lllllllllllllIIlIIllIlIIlIlIllIl[ResourceLocation.lIIlllIlllllII[1]] = lllllllllllllIIlIIllIlIIlIIllllI;
        this(lllllllllllllIIlIIllIlIIlIllIIII, lllllllllllllIIlIIllIlIIlIlIllIl);
    }
    
    private static boolean llIlllIIlIlllll(final Object lllllllllllllIIlIIllIlIIIlIlllIl, final Object lllllllllllllIIlIIllIlIIIlIlllII) {
        return lllllllllllllIIlIIllIlIIIlIlllIl == lllllllllllllIIlIIllIlIIIlIlllII;
    }
    
    @Override
    public String toString() {
        return String.valueOf(new StringBuilder(String.valueOf(this.resourceDomain)).append((char)ResourceLocation.lIIlllIlllllII[3]).append(this.resourcePath));
    }
    
    private static boolean llIlllIIllIIIIl(final int lllllllllllllIIlIIllIlIIIllIIlIl, final int lllllllllllllIIlIIllIlIIIllIIlII) {
        return lllllllllllllIIlIIllIlIIIllIIlIl < lllllllllllllIIlIIllIlIIIllIIlII;
    }
    
    public String getResourceDomain() {
        return this.resourceDomain;
    }
    
    @Override
    public int hashCode() {
        return ResourceLocation.lIIlllIlllllII[4] * this.resourceDomain.hashCode() + this.resourcePath.hashCode();
    }
    
    static {
        llIlllIIlIllIll();
        llIlllIIlIllIII();
    }
    
    private static boolean llIlllIIlIlllIl(final int lllllllllllllIIlIIllIlIIIlIlIllI) {
        return lllllllllllllIIlIIllIlIIIlIlIllI >= 0;
    }
    
    protected ResourceLocation(final int lllllllllllllIIlIIllIlIIlIllIIII, final String... lllllllllllllIIlIIllIlIIlIlIllIl) {
        String lowerCase;
        if (llIlllIIlIlllII(StringUtils.isEmpty((CharSequence)lllllllllllllIIlIIllIlIIlIlIllIl[ResourceLocation.lIIlllIlllllII[0]]) ? 1 : 0)) {
            lowerCase = ResourceLocation.lIIlllIllllIlI[ResourceLocation.lIIlllIlllllII[0]];
            "".length();
            if (((0x2C ^ 0xF) & ~(0x1B ^ 0x38)) < 0) {
                throw null;
            }
        }
        else {
            lowerCase = lllllllllllllIIlIIllIlIIlIlIllIl[ResourceLocation.lIIlllIlllllII[0]].toLowerCase();
        }
        this.resourceDomain = lowerCase;
        this.resourcePath = lllllllllllllIIlIIllIlIIlIlIllIl[ResourceLocation.lIIlllIlllllII[1]];
        Validate.notNull((Object)this.resourcePath);
        "".length();
    }
    
    private static void llIlllIIlIllIII() {
        (lIIlllIllllIlI = new String[ResourceLocation.lIIlllIlllllII[1]])[ResourceLocation.lIIlllIlllllII[0]] = llIlllIIlIlIlll("Fx8oNjIIFyAn", "zvFSQ");
    }
    
    public String getResourcePath() {
        return this.resourcePath;
    }
    
    private static void llIlllIIlIllIll() {
        (lIIlllIlllllII = new int[5])[0] = ((50 + 88 - 102 + 92 ^ 124 + 136 - 213 + 108) & (147 + 177 - 246 + 145 ^ 46 + 132 - 143 + 161 ^ -" ".length()));
        ResourceLocation.lIIlllIlllllII[1] = " ".length();
        ResourceLocation.lIIlllIlllllII[2] = "  ".length();
        ResourceLocation.lIIlllIlllllII[3] = (19 + 77 + 45 + 48 ^ 103 + 106 - 117 + 43);
        ResourceLocation.lIIlllIlllllII[4] = (0x48 ^ 0x57);
    }
    
    private static boolean llIlllIIlIlllII(final int lllllllllllllIIlIIllIlIIIlIllIlI) {
        return lllllllllllllIIlIIllIlIIIlIllIlI != 0;
    }
}
