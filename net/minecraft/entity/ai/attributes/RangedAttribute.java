// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.entity.ai.attributes;

import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.security.MessageDigest;
import net.minecraft.util.MathHelper;
import java.nio.charset.StandardCharsets;
import java.util.Base64;

public class RangedAttribute extends BaseAttribute
{
    private /* synthetic */ String description;
    private static final /* synthetic */ int[] lllllIlIIllll;
    private static final /* synthetic */ String[] lllllIIllIlIl;
    private final /* synthetic */ double minimumValue;
    private final /* synthetic */ double maximumValue;
    
    private static boolean lIlIlllIlIIlIll(final int lllllllllllllIlIlIllIllIIlIIIllI) {
        return lllllllllllllIlIlIllIllIIlIIIllI > 0;
    }
    
    public RangedAttribute(final IAttribute lllllllllllllIlIlIllIllIlIIlIIll, final String lllllllllllllIlIlIllIllIlIIllIII, final double lllllllllllllIlIlIllIllIlIIlIIIl, final double lllllllllllllIlIlIllIllIlIIlIllI, final double lllllllllllllIlIlIllIllIlIIlIlIl) {
        super(lllllllllllllIlIlIllIllIlIIlIIll, lllllllllllllIlIlIllIllIlIIllIII, lllllllllllllIlIlIllIllIlIIlIIIl);
        this.minimumValue = lllllllllllllIlIlIllIllIlIIlIllI;
        this.maximumValue = lllllllllllllIlIlIllIllIlIIlIlIl;
        if (lIlIlllIlIIlIll(lIlIlllIlIIlIIl(lllllllllllllIlIlIllIllIlIIlIllI, lllllllllllllIlIlIllIllIlIIlIlIl))) {
            throw new IllegalArgumentException(RangedAttribute.lllllIIllIlIl[RangedAttribute.lllllIlIIllll[0]]);
        }
        if (lIlIlllIlIIllII(lIlIlllIlIIlIlI(lllllllllllllIlIlIllIllIlIIlIIIl, lllllllllllllIlIlIllIllIlIIlIllI))) {
            throw new IllegalArgumentException(RangedAttribute.lllllIIllIlIl[RangedAttribute.lllllIlIIllll[1]]);
        }
        if (lIlIlllIlIIlIll(lIlIlllIlIIlIIl(lllllllllllllIlIlIllIllIlIIlIIIl, lllllllllllllIlIlIllIllIlIIlIlIl))) {
            throw new IllegalArgumentException(RangedAttribute.lllllIIllIlIl[RangedAttribute.lllllIlIIllll[2]]);
        }
    }
    
    private static void lIlIlllIIIIIllI() {
        (lllllIIllIlIl = new String[RangedAttribute.lllllIlIIllll[3]])[RangedAttribute.lllllIlIIllll[0]] = lIlIlllIIIIIIll("PycpMAYHI2cvCh47InkIEyApNh9SLCJ5CRspIDwZUjovOAVSIyYhAh87KnkdEyIyPEo=", "rNGYk");
        RangedAttribute.lllllIIllIlIl[RangedAttribute.lllllIlIIllll[1]] = lIlIlllIIIIIlII("aiyNGQjq7G5tGyNG5iroIBik7FZ/h8FzwfoI1IpsLE1RY9SGeWGSpdNT5FOjAgdcVPKEVLHfMY0=", "UTwEv");
        RangedAttribute.lllllIIllIlIl[RangedAttribute.lllllIlIIllll[2]] = lIlIlllIIIIIlIl("9Ylz5mb/QRdpQdFgIGPbu9kZC0R62q6YTeKqO0ITJTRl+dZvdx0b9kjwxLq7DejvmNfJQsZKLws=", "RraKr");
    }
    
    private static boolean lIlIlllIlIIllII(final int lllllllllllllIlIlIllIllIIlIIlIII) {
        return lllllllllllllIlIlIllIllIIlIIlIII < 0;
    }
    
    private static void lIlIlllIlIIlIII() {
        (lllllIlIIllll = new int[5])[0] = ((0x51 ^ 0x32) & ~(0xB ^ 0x68));
        RangedAttribute.lllllIlIIllll[1] = " ".length();
        RangedAttribute.lllllIlIIllll[2] = "  ".length();
        RangedAttribute.lllllIlIIllll[3] = "   ".length();
        RangedAttribute.lllllIlIIllll[4] = (0x1A ^ 0x12);
    }
    
    private static String lIlIlllIIIIIIll(String lllllllllllllIlIlIllIllIIlIlIllI, final String lllllllllllllIlIlIllIllIIlIllIlI) {
        lllllllllllllIlIlIllIllIIlIlIllI = new String(Base64.getDecoder().decode(lllllllllllllIlIlIllIllIIlIlIllI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIlIlIllIllIIlIllIIl = new StringBuilder();
        final char[] lllllllllllllIlIlIllIllIIlIllIII = lllllllllllllIlIlIllIllIIlIllIlI.toCharArray();
        int lllllllllllllIlIlIllIllIIlIlIlll = RangedAttribute.lllllIlIIllll[0];
        final boolean lllllllllllllIlIlIllIllIIlIlIIIl = (Object)lllllllllllllIlIlIllIllIIlIlIllI.toCharArray();
        final boolean lllllllllllllIlIlIllIllIIlIlIIII = lllllllllllllIlIlIllIllIIlIlIIIl.length != 0;
        Exception lllllllllllllIlIlIllIllIIlIIllll = (Exception)RangedAttribute.lllllIlIIllll[0];
        while (lIlIlllIlIIllIl((int)lllllllllllllIlIlIllIllIIlIIllll, lllllllllllllIlIlIllIllIIlIlIIII ? 1 : 0)) {
            final char lllllllllllllIlIlIllIllIIlIlllII = lllllllllllllIlIlIllIllIIlIlIIIl[lllllllllllllIlIlIllIllIIlIIllll];
            lllllllllllllIlIlIllIllIIlIllIIl.append((char)(lllllllllllllIlIlIllIllIIlIlllII ^ lllllllllllllIlIlIllIllIIlIllIII[lllllllllllllIlIlIllIllIIlIlIlll % lllllllllllllIlIlIllIllIIlIllIII.length]));
            "".length();
            ++lllllllllllllIlIlIllIllIIlIlIlll;
            ++lllllllllllllIlIlIllIllIIlIIllll;
            "".length();
            if (-"  ".length() >= 0) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIlIlIllIllIIlIllIIl);
    }
    
    private static int lIlIlllIlIIlIlI(final double n, final double n2) {
        return dcmpg(n, n2);
    }
    
    private static boolean lIlIlllIlIIllIl(final int lllllllllllllIlIlIllIllIIlIIlIll, final int lllllllllllllIlIlIllIllIIlIIlIlI) {
        return lllllllllllllIlIlIllIllIIlIIlIll < lllllllllllllIlIlIllIllIIlIIlIlI;
    }
    
    @Override
    public double clampValue(double lllllllllllllIlIlIllIllIlIIIIIII) {
        lllllllllllllIlIlIllIllIlIIIIIII = MathHelper.clamp_double(lllllllllllllIlIlIllIllIlIIIIIII, this.minimumValue, this.maximumValue);
        return lllllllllllllIlIlIllIllIlIIIIIII;
    }
    
    private static String lIlIlllIIIIIlII(final String lllllllllllllIlIlIllIllIIllIlIIl, final String lllllllllllllIlIlIllIllIIllIlIII) {
        try {
            final SecretKeySpec lllllllllllllIlIlIllIllIIllIlllI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIlIlIllIllIIllIlIII.getBytes(StandardCharsets.UTF_8)), RangedAttribute.lllllIlIIllll[4]), "DES");
            final Cipher lllllllllllllIlIlIllIllIIllIllIl = Cipher.getInstance("DES");
            lllllllllllllIlIlIllIllIIllIllIl.init(RangedAttribute.lllllIlIIllll[2], lllllllllllllIlIlIllIllIIllIlllI);
            return new String(lllllllllllllIlIlIllIllIIllIllIl.doFinal(Base64.getDecoder().decode(lllllllllllllIlIlIllIllIIllIlIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIlIlIllIllIIllIllII) {
            lllllllllllllIlIlIllIllIIllIllII.printStackTrace();
            return null;
        }
    }
    
    public RangedAttribute setDescription(final String lllllllllllllIlIlIllIllIlIIIlIIl) {
        this.description = lllllllllllllIlIlIllIllIlIIIlIIl;
        return this;
    }
    
    private static String lIlIlllIIIIIlIl(final String lllllllllllllIlIlIllIllIIlllIllI, final String lllllllllllllIlIlIllIllIIlllIlIl) {
        try {
            final SecretKeySpec lllllllllllllIlIlIllIllIIllllIll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIlIlIllIllIIlllIlIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lllllllllllllIlIlIllIllIIllllIlI = Cipher.getInstance("Blowfish");
            lllllllllllllIlIlIllIllIIllllIlI.init(RangedAttribute.lllllIlIIllll[2], lllllllllllllIlIlIllIllIIllllIll);
            return new String(lllllllllllllIlIlIllIllIIllllIlI.doFinal(Base64.getDecoder().decode(lllllllllllllIlIlIllIllIIlllIllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIlIlIllIllIIllllIIl) {
            lllllllllllllIlIlIllIllIIllllIIl.printStackTrace();
            return null;
        }
    }
    
    public String getDescription() {
        return this.description;
    }
    
    private static int lIlIlllIlIIlIIl(final double n, final double n2) {
        return dcmpl(n, n2);
    }
    
    static {
        lIlIlllIlIIlIII();
        lIlIlllIIIIIllI();
    }
}
