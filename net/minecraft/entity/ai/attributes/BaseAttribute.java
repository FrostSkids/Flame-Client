// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.entity.ai.attributes;

import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;

public abstract class BaseAttribute implements IAttribute
{
    private static final /* synthetic */ int[] lllIlIIlllIIlI;
    private static final /* synthetic */ String[] lllIlIIlllIIIl;
    private final /* synthetic */ String unlocalizedName;
    private /* synthetic */ boolean shouldWatch;
    private final /* synthetic */ double defaultValue;
    private final /* synthetic */ IAttribute field_180373_a;
    
    @Override
    public IAttribute func_180372_d() {
        return this.field_180373_a;
    }
    
    @Override
    public double getDefaultValue() {
        return this.defaultValue;
    }
    
    private static String lIlIIIlIIllllIIl(final String llllllllllllIlIllIlllIlIIIllIlll, final String llllllllllllIlIllIlllIlIIIlllIII) {
        try {
            final SecretKeySpec llllllllllllIlIllIlllIlIIIllllII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIlIllIlllIlIIIlllIII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher llllllllllllIlIllIlllIlIIIlllIll = Cipher.getInstance("Blowfish");
            llllllllllllIlIllIlllIlIIIlllIll.init(BaseAttribute.lllIlIIlllIIlI[2], llllllllllllIlIllIlllIlIIIllllII);
            return new String(llllllllllllIlIllIlllIlIIIlllIll.doFinal(Base64.getDecoder().decode(llllllllllllIlIllIlllIlIIIllIlll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIlIllIlllIlIIIlllIlI) {
            llllllllllllIlIllIlllIlIIIlllIlI.printStackTrace();
            return null;
        }
    }
    
    private static void lIlIIIlIIllllIlI() {
        (lllIlIIlllIIIl = new String[BaseAttribute.lllIlIIlllIIlI[1]])[BaseAttribute.lllIlIIlllIIlI[0]] = lIlIIIlIIllllIIl("Ezaftng/96ZgouA/3R46z4jXdWm6dNEO", "zLcCN");
    }
    
    @Override
    public boolean getShouldWatch() {
        return this.shouldWatch;
    }
    
    public BaseAttribute setShouldWatch(final boolean llllllllllllIlIllIlllIlIIlIIllIl) {
        this.shouldWatch = llllllllllllIlIllIlllIlIIlIIllIl;
        return this;
    }
    
    @Override
    public boolean equals(final Object llllllllllllIlIllIlllIlIIlIIIIIl) {
        if (lIlIIIlIIlllllIl((llllllllllllIlIllIlllIlIIlIIIIIl instanceof IAttribute) ? 1 : 0) && lIlIIIlIIlllllIl(this.unlocalizedName.equals(((IAttribute)llllllllllllIlIllIlllIlIIlIIIIIl).getAttributeUnlocalizedName()) ? 1 : 0)) {
            return BaseAttribute.lllIlIIlllIIlI[1] != 0;
        }
        return BaseAttribute.lllIlIIlllIIlI[0] != 0;
    }
    
    private static void lIlIIIlIIllllIll() {
        (lllIlIIlllIIlI = new int[3])[0] = ((0xF ^ 0x6) & ~(0x4E ^ 0x47) & ~((0x4F ^ 0x45) & ~(0x32 ^ 0x38)));
        BaseAttribute.lllIlIIlllIIlI[1] = " ".length();
        BaseAttribute.lllIlIIlllIIlI[2] = "  ".length();
    }
    
    static {
        lIlIIIlIIllllIll();
        lIlIIIlIIllllIlI();
    }
    
    private static boolean lIlIIIlIIlllllIl(final int llllllllllllIlIllIlllIlIIIllIIII) {
        return llllllllllllIlIllIlllIlIIIllIIII != 0;
    }
    
    @Override
    public String getAttributeUnlocalizedName() {
        return this.unlocalizedName;
    }
    
    private static boolean lIlIIIlIIlllllII(final Object llllllllllllIlIllIlllIlIIIllIIlI) {
        return llllllllllllIlIllIlllIlIIIllIIlI == null;
    }
    
    protected BaseAttribute(final IAttribute llllllllllllIlIllIlllIlIIllIIIlI, final String llllllllllllIlIllIlllIlIIlIlllIl, final double llllllllllllIlIllIlllIlIIllIIIII) {
        this.field_180373_a = llllllllllllIlIllIlllIlIIllIIIlI;
        this.unlocalizedName = llllllllllllIlIllIlllIlIIlIlllIl;
        this.defaultValue = llllllllllllIlIllIlllIlIIllIIIII;
        if (lIlIIIlIIlllllII(llllllllllllIlIllIlllIlIIlIlllIl)) {
            throw new IllegalArgumentException(BaseAttribute.lllIlIIlllIIIl[BaseAttribute.lllIlIIlllIIlI[0]]);
        }
    }
    
    @Override
    public int hashCode() {
        return this.unlocalizedName.hashCode();
    }
}
