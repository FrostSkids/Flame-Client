// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.client.resources.model;

import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import org.apache.commons.lang3.StringUtils;
import net.minecraft.util.ResourceLocation;

public class ModelResourceLocation extends ResourceLocation
{
    private static final /* synthetic */ String[] llIlIIlIIIlllI;
    private static final /* synthetic */ int[] llIlIIlIIlIIlI;
    private final /* synthetic */ String variant;
    
    public ModelResourceLocation(final String llllllllllllIllIllIIIlllIIllIlll, final String llllllllllllIllIllIIIlllIIlllIIl) {
        final int llllllllllllIllIllIIIlllIlIlIIIl = ModelResourceLocation.llIlIIlIIlIIlI[0];
        final StringBuilder append = new StringBuilder(String.valueOf(llllllllllllIllIllIIIlllIIllIlll)).append((char)ModelResourceLocation.llIlIIlIIlIIlI[3]);
        String str;
        if (lIIlIIlIIlIllIll(llllllllllllIllIllIIIlllIIlllIIl)) {
            str = ModelResourceLocation.llIlIIlIIIlllI[ModelResourceLocation.llIlIIlIIlIIlI[2]];
            "".length();
            if (null != null) {
                throw null;
            }
        }
        else {
            str = llllllllllllIllIllIIIlllIIlllIIl;
        }
        this(llllllllllllIllIllIIIlllIlIlIIIl, parsePathString(String.valueOf(append.append(str))));
    }
    
    protected static String[] parsePathString(final String llllllllllllIllIllIIIlllIIlIllIl) {
        final String[] array = new String[ModelResourceLocation.llIlIIlIIlIIlI[4]];
        array[ModelResourceLocation.llIlIIlIIlIIlI[2]] = llllllllllllIllIllIIIlllIIlIllIl;
        final String[] llllllllllllIllIllIIIlllIIllIIII = array;
        final int llllllllllllIllIllIIIlllIIlIllll = llllllllllllIllIllIIIlllIIlIllIl.indexOf(ModelResourceLocation.llIlIIlIIlIIlI[3]);
        String llllllllllllIllIllIIIlllIIlIlllI = llllllllllllIllIllIIIlllIIlIllIl;
        if (lIIlIIlIIlIlllIl(llllllllllllIllIllIIIlllIIlIllll)) {
            llllllllllllIllIllIIIlllIIllIIII[ModelResourceLocation.llIlIIlIIlIIlI[1]] = llllllllllllIllIllIIIlllIIlIllIl.substring(llllllllllllIllIllIIIlllIIlIllll + ModelResourceLocation.llIlIIlIIlIIlI[2], llllllllllllIllIllIIIlllIIlIllIl.length());
            if (lIIlIIlIIlIllllI(llllllllllllIllIllIIIlllIIlIllll, ModelResourceLocation.llIlIIlIIlIIlI[2])) {
                llllllllllllIllIllIIIlllIIlIlllI = llllllllllllIllIllIIIlllIIlIllIl.substring(ModelResourceLocation.llIlIIlIIlIIlI[0], llllllllllllIllIllIIIlllIIlIllll);
            }
        }
        System.arraycopy(ResourceLocation.splitObjectName(llllllllllllIllIllIIIlllIIlIlllI), ModelResourceLocation.llIlIIlIIlIIlI[0], llllllllllllIllIllIIIlllIIllIIII, ModelResourceLocation.llIlIIlIIlIIlI[0], ModelResourceLocation.llIlIIlIIlIIlI[1]);
        return llllllllllllIllIllIIIlllIIllIIII;
    }
    
    @Override
    public boolean equals(final Object llllllllllllIllIllIIIlllIIIlllll) {
        if (lIIlIIlIIlIlllll(this, llllllllllllIllIllIIIlllIIIlllll)) {
            return ModelResourceLocation.llIlIIlIIlIIlI[2] != 0;
        }
        if (lIIlIIlIIlIllIlI((llllllllllllIllIllIIIlllIIIlllll instanceof ModelResourceLocation) ? 1 : 0) && lIIlIIlIIlIllIlI(super.equals(llllllllllllIllIllIIIlllIIIlllll) ? 1 : 0)) {
            final ModelResourceLocation llllllllllllIllIllIIIlllIIlIIIIl = (ModelResourceLocation)llllllllllllIllIllIIIlllIIIlllll;
            return this.variant.equals(llllllllllllIllIllIIIlllIIlIIIIl.variant);
        }
        return ModelResourceLocation.llIlIIlIIlIIlI[0] != 0;
    }
    
    @Override
    public int hashCode() {
        return ModelResourceLocation.llIlIIlIIlIIlI[5] * super.hashCode() + this.variant.hashCode();
    }
    
    private static boolean lIIlIIlIIlIllllI(final int llllllllllllIllIllIIIlllIIIIlIII, final int llllllllllllIllIllIIIlllIIIIIlll) {
        return llllllllllllIllIllIIIlllIIIIlIII > llllllllllllIllIllIIIlllIIIIIlll;
    }
    
    private static boolean lIIlIIlIIlIlllIl(final int llllllllllllIllIllIIIllIllllllIl) {
        return llllllllllllIllIllIIIllIllllllIl >= 0;
    }
    
    public ModelResourceLocation(final ResourceLocation llllllllllllIllIllIIIlllIlIIIIII, final String llllllllllllIllIllIIIlllIlIIIIlI) {
        this(llllllllllllIllIllIIIlllIlIIIIII.toString(), llllllllllllIllIllIIIlllIlIIIIlI);
    }
    
    protected ModelResourceLocation(final int llllllllllllIllIllIIIlllIlIlIIIl, final String... llllllllllllIllIllIIIlllIlIlIIII) {
        final int lllllllllllllIIlIIllIlIIlIllIIII = ModelResourceLocation.llIlIIlIIlIIlI[0];
        final String[] lllllllllllllIIlIIllIlIIlIlIllIl = new String[ModelResourceLocation.llIlIIlIIlIIlI[1]];
        lllllllllllllIIlIIllIlIIlIlIllIl[ModelResourceLocation.llIlIIlIIlIIlI[0]] = llllllllllllIllIllIIIlllIlIlIIII[ModelResourceLocation.llIlIIlIIlIIlI[0]];
        lllllllllllllIIlIIllIlIIlIlIllIl[ModelResourceLocation.llIlIIlIIlIIlI[2]] = llllllllllllIllIllIIIlllIlIlIIII[ModelResourceLocation.llIlIIlIIlIIlI[2]];
        super(lllllllllllllIIlIIllIlIIlIllIIII, lllllllllllllIIlIIllIlIIlIlIllIl);
        String lowerCase;
        if (lIIlIIlIIlIllIlI(StringUtils.isEmpty((CharSequence)llllllllllllIllIllIIIlllIlIlIIII[ModelResourceLocation.llIlIIlIIlIIlI[1]]) ? 1 : 0)) {
            lowerCase = ModelResourceLocation.llIlIIlIIIlllI[ModelResourceLocation.llIlIIlIIlIIlI[0]];
            "".length();
            if ((0xC5 ^ 0xC1) <= "   ".length()) {
                throw null;
            }
        }
        else {
            lowerCase = llllllllllllIllIllIIIlllIlIlIIII[ModelResourceLocation.llIlIIlIIlIIlI[1]].toLowerCase();
        }
        this.variant = lowerCase;
    }
    
    static {
        lIIlIIlIIlIllIIl();
        lIIlIIlIIlIlIlIl();
    }
    
    private static void lIIlIIlIIlIlIlIl() {
        (llIlIIlIIIlllI = new String[ModelResourceLocation.llIlIIlIIlIIlI[1]])[ModelResourceLocation.llIlIIlIIlIIlI[0]] = lIIlIIlIIlIlIlII("RCjQDbLGB+k=", "nbAiG");
        ModelResourceLocation.llIlIIlIIIlllI[ModelResourceLocation.llIlIIlIIlIIlI[2]] = lIIlIIlIIlIlIlII("QjJZ7axjXvg=", "nylwO");
    }
    
    private static void lIIlIIlIIlIllIIl() {
        (llIlIIlIIlIIlI = new int[7])[0] = ((238 + 125 - 270 + 148 ^ 68 + 94 - 64 + 91) & (178 + 111 - 101 + 40 ^ 68 + 31 + 46 + 23 ^ -" ".length()));
        ModelResourceLocation.llIlIIlIIlIIlI[1] = "  ".length();
        ModelResourceLocation.llIlIIlIIlIIlI[2] = " ".length();
        ModelResourceLocation.llIlIIlIIlIIlI[3] = (0x1A ^ 0x39);
        ModelResourceLocation.llIlIIlIIlIIlI[4] = "   ".length();
        ModelResourceLocation.llIlIIlIIlIIlI[5] = (0x33 ^ 0x2C);
        ModelResourceLocation.llIlIIlIIlIIlI[6] = (88 + 17 - 52 + 88 ^ 75 + 107 - 120 + 71);
    }
    
    public ModelResourceLocation(final String llllllllllllIllIllIIIlllIlIIlIlI) {
        this(ModelResourceLocation.llIlIIlIIlIIlI[0], parsePathString(llllllllllllIllIllIIIlllIlIIlIlI));
    }
    
    private static boolean lIIlIIlIIlIlllll(final Object llllllllllllIllIllIIIlllIIIIIlII, final Object llllllllllllIllIllIIIlllIIIIIIll) {
        return llllllllllllIllIllIIIlllIIIIIlII == llllllllllllIllIllIIIlllIIIIIIll;
    }
    
    private static boolean lIIlIIlIIlIllIll(final Object llllllllllllIllIllIIIlllIIIIIIIl) {
        return llllllllllllIllIllIIIlllIIIIIIIl == null;
    }
    
    public String getVariant() {
        return this.variant;
    }
    
    private static boolean lIIlIIlIIlIllIlI(final int llllllllllllIllIllIIIllIllllllll) {
        return llllllllllllIllIllIIIllIllllllll != 0;
    }
    
    private static String lIIlIIlIIlIlIlII(final String llllllllllllIllIllIIIlllIIIlIIII, final String llllllllllllIllIllIIIlllIIIIllll) {
        try {
            final SecretKeySpec llllllllllllIllIllIIIlllIIIlIIll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIllIllIIIlllIIIIllll.getBytes(StandardCharsets.UTF_8)), ModelResourceLocation.llIlIIlIIlIIlI[6]), "DES");
            final Cipher llllllllllllIllIllIIIlllIIIlIIlI = Cipher.getInstance("DES");
            llllllllllllIllIllIIIlllIIIlIIlI.init(ModelResourceLocation.llIlIIlIIlIIlI[1], llllllllllllIllIllIIIlllIIIlIIll);
            return new String(llllllllllllIllIllIIIlllIIIlIIlI.doFinal(Base64.getDecoder().decode(llllllllllllIllIllIIIlllIIIlIIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIllIllIIIlllIIIlIIIl) {
            llllllllllllIllIllIIIlllIIIlIIIl.printStackTrace();
            return null;
        }
    }
    
    @Override
    public String toString() {
        return String.valueOf(new StringBuilder(String.valueOf(super.toString())).append((char)ModelResourceLocation.llIlIIlIIlIIlI[3]).append(this.variant));
    }
}
