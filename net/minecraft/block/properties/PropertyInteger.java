// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.block.properties;

import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.security.MessageDigest;
import java.util.Set;
import com.google.common.collect.Sets;
import java.util.Collection;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import com.google.common.collect.ImmutableSet;

public class PropertyInteger extends PropertyHelper<Integer>
{
    private static final /* synthetic */ String[] lIlIIllIlIIllI;
    private static final /* synthetic */ int[] lIlIIllIlIIlll;
    private final /* synthetic */ ImmutableSet<Integer> allowedValues;
    
    private static void lllIIlllllllIll() {
        (lIlIIllIlIIllI = new String[PropertyInteger.lIlIIllIlIIlll[6]])[PropertyInteger.lIlIIllIlIIlll[0]] = lllIIlllllllIIl("MEyG1srWZ/G2VasNlxHkiQ==", "RCbFh");
        PropertyInteger.lIlIIllIlIIllI[PropertyInteger.lIlIIllIlIIlll[1]] = lllIIlllllllIlI("eQoZOB55BQlrWnkIHmsNKwINPw8r", "YglKj");
        PropertyInteger.lIlIIllIlIIllI[PropertyInteger.lIlIIllIlIIlll[2]] = lllIIlllllllIlI("ASQPYQYtKQIkUCMjVw==", "LEwAp");
        PropertyInteger.lIlIIllIlIIllI[PropertyInteger.lIlIIllIlIIlll[3]] = lllIIlllllllIIl("ij/RQlcKjfrhxEoG1RySJi2Iajw+A6Tj0r1D4d3hWkk=", "pBYsT");
        PropertyInteger.lIlIIllIlIIllI[PropertyInteger.lIlIIllIlIIlll[4]] = lllIIlllllllIlI("fw==", "VLhJB");
    }
    
    private static String lllIIlllllllIlI(String lllllllllllllIIIllIIllIIIIIlIlII, final String lllllllllllllIIIllIIllIIIIIllIII) {
        lllllllllllllIIIllIIllIIIIIlIlII = (char)new String(Base64.getDecoder().decode(((String)lllllllllllllIIIllIIllIIIIIlIlII).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIIIllIIllIIIIIlIlll = new StringBuilder();
        final char[] lllllllllllllIIIllIIllIIIIIlIllI = lllllllllllllIIIllIIllIIIIIllIII.toCharArray();
        int lllllllllllllIIIllIIllIIIIIlIlIl = PropertyInteger.lIlIIllIlIIlll[0];
        final Exception lllllllllllllIIIllIIllIIIIIIllll = (Object)((String)lllllllllllllIIIllIIllIIIIIlIlII).toCharArray();
        final double lllllllllllllIIIllIIllIIIIIIlllI = lllllllllllllIIIllIIllIIIIIIllll.length;
        double lllllllllllllIIIllIIllIIIIIIllIl = PropertyInteger.lIlIIllIlIIlll[0];
        while (lllIlIIIIIIIIll((int)lllllllllllllIIIllIIllIIIIIIllIl, (int)lllllllllllllIIIllIIllIIIIIIlllI)) {
            final char lllllllllllllIIIllIIllIIIIIllIlI = lllllllllllllIIIllIIllIIIIIIllll[lllllllllllllIIIllIIllIIIIIIllIl];
            lllllllllllllIIIllIIllIIIIIlIlll.append((char)(lllllllllllllIIIllIIllIIIIIllIlI ^ lllllllllllllIIIllIIllIIIIIlIllI[lllllllllllllIIIllIIllIIIIIlIlIl % lllllllllllllIIIllIIllIIIIIlIllI.length]));
            "".length();
            ++lllllllllllllIIIllIIllIIIIIlIlIl;
            ++lllllllllllllIIIllIIllIIIIIIllIl;
            "".length();
            if ((119 + 187 - 240 + 130 ^ 84 + 147 - 188 + 150) == 0x0) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIIIllIIllIIIIIlIlll);
    }
    
    @Override
    public String getName(final Integer lllllllllllllIIIllIIllIIIIllIllI) {
        return lllllllllllllIIIllIIllIIIIllIllI.toString();
    }
    
    public static PropertyInteger create(final String lllllllllllllIIIllIIllIIIIlllIll, final int lllllllllllllIIIllIIllIIIIlllIlI, final int lllllllllllllIIIllIIllIIIIlllIIl) {
        return new PropertyInteger(lllllllllllllIIIllIIllIIIIlllIll, lllllllllllllIIIllIIllIIIIlllIlI, lllllllllllllIIIllIIllIIIIlllIIl);
    }
    
    private static boolean lllIIlllllllllI(final int lllllllllllllIIIllIIllIIIIIIIlIl, final int lllllllllllllIIIllIIllIIIIIIIlII) {
        return lllllllllllllIIIllIIllIIIIIIIlIl <= lllllllllllllIIIllIIllIIIIIIIlII;
    }
    
    private static boolean lllIlIIIIIIIIIl(final Object lllllllllllllIIIllIIlIlllllllIlI) {
        return lllllllllllllIIIllIIlIlllllllIlI != null;
    }
    
    @Override
    public int hashCode() {
        int lllllllllllllIIIllIIllIIIlIIIlII = super.hashCode();
        lllllllllllllIIIllIIllIIIlIIIlII = PropertyInteger.lIlIIllIlIIlll[5] * lllllllllllllIIIllIIllIIIlIIIlII + this.allowedValues.hashCode();
        return lllllllllllllIIIllIIllIIIlIIIlII;
    }
    
    @Override
    public Collection<Integer> getAllowedValues() {
        return (Collection<Integer>)this.allowedValues;
    }
    
    @Override
    public boolean equals(final Object lllllllllllllIIIllIIllIIIlIIllII) {
        if (lllIlIIIIIIIIII(this, lllllllllllllIIIllIIllIIIlIIllII)) {
            return PropertyInteger.lIlIIllIlIIlll[1] != 0;
        }
        if (!lllIlIIIIIIIIIl(lllllllllllllIIIllIIllIIIlIIllII) || !lllIlIIIIIIIIII(this.getClass(), lllllllllllllIIIllIIllIIIlIIllII.getClass())) {
            return PropertyInteger.lIlIIllIlIIlll[0] != 0;
        }
        if (lllIlIIIIIIIIlI(super.equals(lllllllllllllIIIllIIllIIIlIIllII) ? 1 : 0)) {
            return PropertyInteger.lIlIIllIlIIlll[0] != 0;
        }
        final PropertyInteger lllllllllllllIIIllIIllIIIlIIlIll = (PropertyInteger)lllllllllllllIIIllIIllIIIlIIllII;
        return this.allowedValues.equals((Object)lllllllllllllIIIllIIllIIIlIIlIll.allowedValues);
    }
    
    private static boolean lllIIllllllllll(final int lllllllllllllIIIllIIllIIIIIIIIIl, final int lllllllllllllIIIllIIllIIIIIIIIII) {
        return lllllllllllllIIIllIIllIIIIIIIIIl > lllllllllllllIIIllIIllIIIIIIIIII;
    }
    
    static {
        lllIIllllllllII();
        lllIIlllllllIll();
    }
    
    private static boolean lllIlIIIIIIIIlI(final int lllllllllllllIIIllIIlIlllllllIII) {
        return lllllllllllllIIIllIIlIlllllllIII == 0;
    }
    
    private static boolean lllIlIIIIIIIIII(final Object lllllllllllllIIIllIIlIllllllllIl, final Object lllllllllllllIIIllIIlIllllllllII) {
        return lllllllllllllIIIllIIlIllllllllIl == lllllllllllllIIIllIIlIllllllllII;
    }
    
    private static boolean lllIIllllllllIl(final int lllllllllllllIIIllIIlIllllllIllI) {
        return lllllllllllllIIIllIIlIllllllIllI < 0;
    }
    
    protected PropertyInteger(final String lllllllllllllIIIllIIllIIIlIllllI, final int lllllllllllllIIIllIIllIIIlIlllIl, final int lllllllllllllIIIllIIllIIIlIlIllI) {
        super(lllllllllllllIIIllIIllIIIlIllllI, Integer.class);
        if (lllIIllllllllIl(lllllllllllllIIIllIIllIIIlIlllIl)) {
            throw new IllegalArgumentException(String.valueOf(new StringBuilder(PropertyInteger.lIlIIllIlIIllI[PropertyInteger.lIlIIllIlIIlll[0]]).append(lllllllllllllIIIllIIllIIIlIllllI).append(PropertyInteger.lIlIIllIlIIllI[PropertyInteger.lIlIIllIlIIlll[1]])));
        }
        if (lllIIlllllllllI(lllllllllllllIIIllIIllIIIlIlIllI, lllllllllllllIIIllIIllIIIlIlllIl)) {
            throw new IllegalArgumentException(String.valueOf(new StringBuilder(PropertyInteger.lIlIIllIlIIllI[PropertyInteger.lIlIIllIlIIlll[2]]).append(lllllllllllllIIIllIIllIIIlIllllI).append(PropertyInteger.lIlIIllIlIIllI[PropertyInteger.lIlIIllIlIIlll[3]]).append(lllllllllllllIIIllIIllIIIlIlllIl).append(PropertyInteger.lIlIIllIlIIllI[PropertyInteger.lIlIIllIlIIlll[4]])));
        }
        final Set<Integer> lllllllllllllIIIllIIllIIIlIllIll = (Set<Integer>)Sets.newHashSet();
        int lllllllllllllIIIllIIllIIIlIllIlI = lllllllllllllIIIllIIllIIIlIlllIl;
        "".length();
        if ("   ".length() == 0) {
            throw null;
        }
        while (!lllIIllllllllll(lllllllllllllIIIllIIllIIIlIllIlI, lllllllllllllIIIllIIllIIIlIlIllI)) {
            lllllllllllllIIIllIIllIIIlIllIll.add(lllllllllllllIIIllIIllIIIlIllIlI);
            "".length();
            ++lllllllllllllIIIllIIllIIIlIllIlI;
        }
        this.allowedValues = (ImmutableSet<Integer>)ImmutableSet.copyOf((Collection)lllllllllllllIIIllIIllIIIlIllIll);
    }
    
    private static String lllIIlllllllIIl(final String lllllllllllllIIIllIIllIIIIlIIlll, final String lllllllllllllIIIllIIllIIIIlIIllI) {
        try {
            final SecretKeySpec lllllllllllllIIIllIIllIIIIlIllII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIIIllIIllIIIIlIIllI.getBytes(StandardCharsets.UTF_8)), PropertyInteger.lIlIIllIlIIlll[7]), "DES");
            final Cipher lllllllllllllIIIllIIllIIIIlIlIll = Cipher.getInstance("DES");
            lllllllllllllIIIllIIllIIIIlIlIll.init(PropertyInteger.lIlIIllIlIIlll[2], lllllllllllllIIIllIIllIIIIlIllII);
            return new String(lllllllllllllIIIllIIllIIIIlIlIll.doFinal(Base64.getDecoder().decode(lllllllllllllIIIllIIllIIIIlIIlll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIIllIIllIIIIlIlIlI) {
            lllllllllllllIIIllIIllIIIIlIlIlI.printStackTrace();
            return null;
        }
    }
    
    private static boolean lllIlIIIIIIIIll(final int lllllllllllllIIIllIIllIIIIIIlIIl, final int lllllllllllllIIIllIIllIIIIIIlIII) {
        return lllllllllllllIIIllIIllIIIIIIlIIl < lllllllllllllIIIllIIllIIIIIIlIII;
    }
    
    private static void lllIIllllllllII() {
        (lIlIIllIlIIlll = new int[8])[0] = ((0x37 ^ 0x12) & ~(0x5A ^ 0x7F));
        PropertyInteger.lIlIIllIlIIlll[1] = " ".length();
        PropertyInteger.lIlIIllIlIIlll[2] = "  ".length();
        PropertyInteger.lIlIIllIlIIlll[3] = "   ".length();
        PropertyInteger.lIlIIllIlIIlll[4] = (0x3C ^ 0x38);
        PropertyInteger.lIlIIllIlIIlll[5] = (0x79 ^ 0x66);
        PropertyInteger.lIlIIllIlIIlll[6] = (0x6E ^ 0x6B);
        PropertyInteger.lIlIIllIlIIlll[7] = (0x52 ^ 0x5A);
    }
}
