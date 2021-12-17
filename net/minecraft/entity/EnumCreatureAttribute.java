// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.entity;

import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.security.MessageDigest;
import java.nio.charset.StandardCharsets;
import java.util.Base64;

public enum EnumCreatureAttribute
{
    UNDEAD(EnumCreatureAttribute.lIIIllIlIllIII[EnumCreatureAttribute.lIIIlllIIlIllI[1]], EnumCreatureAttribute.lIIIlllIIlIllI[1]), 
    ARTHROPOD(EnumCreatureAttribute.lIIIllIlIllIII[EnumCreatureAttribute.lIIIlllIIlIllI[2]], EnumCreatureAttribute.lIIIlllIIlIllI[2]), 
    UNDEFINED(EnumCreatureAttribute.lIIIllIlIllIII[EnumCreatureAttribute.lIIIlllIIlIllI[0]], EnumCreatureAttribute.lIIIlllIIlIllI[0]);
    
    private static final /* synthetic */ int[] lIIIlllIIlIllI;
    private static final /* synthetic */ String[] lIIIllIlIllIII;
    
    static {
        llIIIllIIIIllll();
        llIIIlIIlIlIlIl();
        final EnumCreatureAttribute[] enum$VALUES = new EnumCreatureAttribute[EnumCreatureAttribute.lIIIlllIIlIllI[3]];
        enum$VALUES[EnumCreatureAttribute.lIIIlllIIlIllI[0]] = EnumCreatureAttribute.UNDEFINED;
        enum$VALUES[EnumCreatureAttribute.lIIIlllIIlIllI[1]] = EnumCreatureAttribute.UNDEAD;
        enum$VALUES[EnumCreatureAttribute.lIIIlllIIlIllI[2]] = EnumCreatureAttribute.ARTHROPOD;
        ENUM$VALUES = enum$VALUES;
    }
    
    private static String llIIIlIIlIlIIlI(String lllllllllllllIIlllllIllIlllIlIll, final String lllllllllllllIIlllllIllIlllIllll) {
        lllllllllllllIIlllllIllIlllIlIll = (long)new String(Base64.getDecoder().decode(((String)lllllllllllllIIlllllIllIlllIlIll).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIIlllllIllIlllIlllI = new StringBuilder();
        final char[] lllllllllllllIIlllllIllIlllIllIl = lllllllllllllIIlllllIllIlllIllll.toCharArray();
        int lllllllllllllIIlllllIllIlllIllII = EnumCreatureAttribute.lIIIlllIIlIllI[0];
        final short lllllllllllllIIlllllIllIlllIIllI = (Object)((String)lllllllllllllIIlllllIllIlllIlIll).toCharArray();
        final short lllllllllllllIIlllllIllIlllIIlIl = (short)lllllllllllllIIlllllIllIlllIIllI.length;
        long lllllllllllllIIlllllIllIlllIIlII = EnumCreatureAttribute.lIIIlllIIlIllI[0];
        while (llIIIllIIIlIIIl((int)lllllllllllllIIlllllIllIlllIIlII, lllllllllllllIIlllllIllIlllIIlIl)) {
            final char lllllllllllllIIlllllIllIllllIIIl = lllllllllllllIIlllllIllIlllIIllI[lllllllllllllIIlllllIllIlllIIlII];
            lllllllllllllIIlllllIllIlllIlllI.append((char)(lllllllllllllIIlllllIllIllllIIIl ^ lllllllllllllIIlllllIllIlllIllIl[lllllllllllllIIlllllIllIlllIllII % lllllllllllllIIlllllIllIlllIllIl.length]));
            "".length();
            ++lllllllllllllIIlllllIllIlllIllII;
            ++lllllllllllllIIlllllIllIlllIIlII;
            "".length();
            if (((105 + 36 - 134 + 225 ^ 142 + 1 - 68 + 93) & (39 + 122 - 44 + 88 ^ 112 + 122 - 138 + 45 ^ -" ".length())) > 0) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIIlllllIllIlllIlllI);
    }
    
    private static void llIIIlIIlIlIlIl() {
        (lIIIllIlIllIII = new String[EnumCreatureAttribute.lIIIlllIIlIllI[3]])[EnumCreatureAttribute.lIIIlllIIlIllI[0]] = llIIIlIIlIlIIII("ch35htPTMZncJ/Lr0GB6KA==", "HTscd");
        EnumCreatureAttribute.lIIIllIlIllIII[EnumCreatureAttribute.lIIIlllIIlIllI[1]] = llIIIlIIlIlIIlI("EjgIKgcD", "GvLoF");
        EnumCreatureAttribute.lIIIllIlIllIII[EnumCreatureAttribute.lIIIlllIIlIllI[2]] = llIIIlIIlIlIIII("rnTfqvUbjVgLktd6JVC7OQ==", "vuyce");
    }
    
    private static boolean llIIIllIIIlIIIl(final int lllllllllllllIIlllllIllIlllIIIII, final int lllllllllllllIIlllllIllIllIlllll) {
        return lllllllllllllIIlllllIllIlllIIIII < lllllllllllllIIlllllIllIllIlllll;
    }
    
    private static void llIIIllIIIIllll() {
        (lIIIlllIIlIllI = new int[4])[0] = ((0x43 ^ 0x7B) & ~(0x40 ^ 0x78));
        EnumCreatureAttribute.lIIIlllIIlIllI[1] = " ".length();
        EnumCreatureAttribute.lIIIlllIIlIllI[2] = "  ".length();
        EnumCreatureAttribute.lIIIlllIIlIllI[3] = "   ".length();
    }
    
    private static String llIIIlIIlIlIIII(final String lllllllllllllIIlllllIlllIIIIIIII, final String lllllllllllllIIlllllIllIllllllll) {
        try {
            final SecretKeySpec lllllllllllllIIlllllIlllIIIIIIll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIIlllllIllIllllllll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lllllllllllllIIlllllIlllIIIIIIlI = Cipher.getInstance("Blowfish");
            lllllllllllllIIlllllIlllIIIIIIlI.init(EnumCreatureAttribute.lIIIlllIIlIllI[2], lllllllllllllIIlllllIlllIIIIIIll);
            return new String(lllllllllllllIIlllllIlllIIIIIIlI.doFinal(Base64.getDecoder().decode(lllllllllllllIIlllllIlllIIIIIIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIlllllIlllIIIIIIIl) {
            lllllllllllllIIlllllIlllIIIIIIIl.printStackTrace();
            return null;
        }
    }
    
    private EnumCreatureAttribute(final String lllllllllllllIIlllllIlllIIIlIIIl, final int lllllllllllllIIlllllIlllIIIlIIII) {
    }
}
