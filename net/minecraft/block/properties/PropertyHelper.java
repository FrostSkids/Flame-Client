// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.block.properties;

import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.security.MessageDigest;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import com.google.common.base.Objects;

public abstract class PropertyHelper<T extends Comparable<T>> implements IProperty<T>
{
    private static final /* synthetic */ String[] lIIllIlIlIIlIl;
    private static final /* synthetic */ int[] lIIllIlIlIlIIl;
    private final /* synthetic */ String name;
    private final /* synthetic */ Class<T> valueClass;
    
    @Override
    public String toString() {
        return Objects.toStringHelper((Object)this).add(PropertyHelper.lIIllIlIlIIlIl[PropertyHelper.lIIllIlIlIlIIl[0]], (Object)this.name).add(PropertyHelper.lIIllIlIlIIlIl[PropertyHelper.lIIllIlIlIlIIl[1]], (Object)this.valueClass).add(PropertyHelper.lIIllIlIlIIlIl[PropertyHelper.lIIllIlIlIlIIl[2]], (Object)this.getAllowedValues()).toString();
    }
    
    @Override
    public boolean equals(final Object lllllllllllllIIlIlIlIlIIlIllIlIl) {
        if (llIllIIIlllIlll(this, lllllllllllllIIlIlIlIlIIlIllIlIl)) {
            return PropertyHelper.lIIllIlIlIlIIl[1] != 0;
        }
        if (!llIllIIIllllIII(lllllllllllllIIlIlIlIlIIlIllIlIl) || !llIllIIIlllIlll(this.getClass(), lllllllllllllIIlIlIlIlIIlIllIlIl.getClass())) {
            return PropertyHelper.lIIllIlIlIlIIl[0] != 0;
        }
        final PropertyHelper lllllllllllllIIlIlIlIlIIlIllIlII = (PropertyHelper)lllllllllllllIIlIlIlIlIIlIllIlIl;
        if (llIllIIIllllIIl(this.valueClass.equals(lllllllllllllIIlIlIlIlIIlIllIlII.valueClass) ? 1 : 0) && llIllIIIllllIIl(this.name.equals(lllllllllllllIIlIlIlIlIIlIllIlII.name) ? 1 : 0)) {
            return PropertyHelper.lIIllIlIlIlIIl[1] != 0;
        }
        return PropertyHelper.lIIllIlIlIlIIl[0] != 0;
    }
    
    @Override
    public int hashCode() {
        return PropertyHelper.lIIllIlIlIlIIl[3] * this.valueClass.hashCode() + this.name.hashCode();
    }
    
    private static void llIllIIIlllIlIl() {
        (lIIllIlIlIIlIl = new String[PropertyHelper.lIIllIlIlIlIIl[4]])[PropertyHelper.lIIllIlIlIlIIl[0]] = llIllIIIllIIlIl("hXfcqjBIieQ=", "DPWcv");
        PropertyHelper.lIIllIlIlIIlIl[PropertyHelper.lIIllIlIlIlIIl[1]] = llIllIIIlllIIlI("CSIxACk=", "jNPzS");
        PropertyHelper.lIIllIlIlIIlIl[PropertyHelper.lIIllIlIlIlIIl[2]] = llIllIIIlllIIlI("LjsrNAgr", "XZGAm");
    }
    
    @Override
    public String getName() {
        return this.name;
    }
    
    @Override
    public Class<T> getValueClass() {
        return this.valueClass;
    }
    
    private static boolean llIllIIIlllIlll(final Object lllllllllllllIIlIlIlIlIIlIIIIIlI, final Object lllllllllllllIIlIlIlIlIIlIIIIIIl) {
        return lllllllllllllIIlIlIlIlIIlIIIIIlI == lllllllllllllIIlIlIlIlIIlIIIIIIl;
    }
    
    private static boolean llIllIIIllllIIl(final int lllllllllllllIIlIlIlIlIIIlllllIl) {
        return lllllllllllllIIlIlIlIlIIIlllllIl != 0;
    }
    
    private static boolean llIllIIIllllIII(final Object lllllllllllllIIlIlIlIlIIIlllllll) {
        return lllllllllllllIIlIlIlIlIIIlllllll != null;
    }
    
    static {
        llIllIIIlllIllI();
        llIllIIIlllIlIl();
    }
    
    private static boolean llIllIIIllllIlI(final int lllllllllllllIIlIlIlIlIIlIIIIllI, final int lllllllllllllIIlIlIlIlIIlIIIIlIl) {
        return lllllllllllllIIlIlIlIlIIlIIIIllI < lllllllllllllIIlIlIlIlIIlIIIIlIl;
    }
    
    private static String llIllIIIlllIIlI(String lllllllllllllIIlIlIlIlIIlIIllllI, final String lllllllllllllIIlIlIlIlIIlIlIIIlI) {
        lllllllllllllIIlIlIlIlIIlIIllllI = (Exception)new String(Base64.getDecoder().decode(((String)lllllllllllllIIlIlIlIlIIlIIllllI).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIIlIlIlIlIIlIlIIIIl = new StringBuilder();
        final char[] lllllllllllllIIlIlIlIlIIlIlIIIII = lllllllllllllIIlIlIlIlIIlIlIIIlI.toCharArray();
        int lllllllllllllIIlIlIlIlIIlIIlllll = PropertyHelper.lIIllIlIlIlIIl[0];
        final short lllllllllllllIIlIlIlIlIIlIIllIIl = (Object)((String)lllllllllllllIIlIlIlIlIIlIIllllI).toCharArray();
        final long lllllllllllllIIlIlIlIlIIlIIllIII = lllllllllllllIIlIlIlIlIIlIIllIIl.length;
        float lllllllllllllIIlIlIlIlIIlIIlIlll = PropertyHelper.lIIllIlIlIlIIl[0];
        while (llIllIIIllllIlI((int)lllllllllllllIIlIlIlIlIIlIIlIlll, (int)lllllllllllllIIlIlIlIlIIlIIllIII)) {
            final char lllllllllllllIIlIlIlIlIIlIlIIlII = lllllllllllllIIlIlIlIlIIlIIllIIl[lllllllllllllIIlIlIlIlIIlIIlIlll];
            lllllllllllllIIlIlIlIlIIlIlIIIIl.append((char)(lllllllllllllIIlIlIlIlIIlIlIIlII ^ lllllllllllllIIlIlIlIlIIlIlIIIII[lllllllllllllIIlIlIlIlIIlIIlllll % lllllllllllllIIlIlIlIlIIlIlIIIII.length]));
            "".length();
            ++lllllllllllllIIlIlIlIlIIlIIlllll;
            ++lllllllllllllIIlIlIlIlIIlIIlIlll;
            "".length();
            if ("   ".length() > (0xB7 ^ 0x8F ^ (0xA0 ^ 0x9C))) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIIlIlIlIlIIlIlIIIIl);
    }
    
    private static String llIllIIIllIIlIl(final String lllllllllllllIIlIlIlIlIIlIIIllII, final String lllllllllllllIIlIlIlIlIIlIIIllIl) {
        try {
            final SecretKeySpec lllllllllllllIIlIlIlIlIIlIIlIIIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIIlIlIlIlIIlIIIllIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lllllllllllllIIlIlIlIlIIlIIlIIII = Cipher.getInstance("Blowfish");
            lllllllllllllIIlIlIlIlIIlIIlIIII.init(PropertyHelper.lIIllIlIlIlIIl[2], lllllllllllllIIlIlIlIlIIlIIlIIIl);
            return new String(lllllllllllllIIlIlIlIlIIlIIlIIII.doFinal(Base64.getDecoder().decode(lllllllllllllIIlIlIlIlIIlIIIllII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIlIlIlIlIIlIIIllll) {
            lllllllllllllIIlIlIlIlIIlIIIllll.printStackTrace();
            return null;
        }
    }
    
    protected PropertyHelper(final String lllllllllllllIIlIlIlIlIIllIIIlII, final Class<T> lllllllllllllIIlIlIlIlIIllIIIIll) {
        this.valueClass = lllllllllllllIIlIlIlIlIIllIIIIll;
        this.name = lllllllllllllIIlIlIlIlIIllIIIlII;
    }
    
    private static void llIllIIIlllIllI() {
        (lIIllIlIlIlIIl = new int[5])[0] = ((0x97 ^ 0xBC ^ (0xD ^ 0x2B)) & (0x6C ^ 0x9 ^ (0x6F ^ 0x7) ^ -" ".length()));
        PropertyHelper.lIIllIlIlIlIIl[1] = " ".length();
        PropertyHelper.lIIllIlIlIlIIl[2] = "  ".length();
        PropertyHelper.lIIllIlIlIlIIl[3] = (0xBF ^ 0xA0);
        PropertyHelper.lIIllIlIlIlIIl[4] = "   ".length();
    }
}
