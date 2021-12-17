// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.entity.ai.attributes;

import java.util.Random;
import net.minecraft.util.MathHelper;
import io.netty.util.internal.ThreadLocalRandom;
import org.apache.commons.lang3.Validate;
import java.util.Arrays;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.security.MessageDigest;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.UUID;

public class AttributeModifier
{
    private final /* synthetic */ double amount;
    private /* synthetic */ boolean isSaved;
    private final /* synthetic */ String name;
    private final /* synthetic */ int operation;
    private static final /* synthetic */ String[] lIlllIIIIIlIlI;
    private static final /* synthetic */ int[] lIlllIIIIIlIll;
    private final /* synthetic */ UUID id;
    
    public AttributeModifier setSaved(final boolean llllllllllllIlllllIllllllIIlIIlI) {
        this.isSaved = llllllllllllIlllllIllllllIIlIIlI;
        return this;
    }
    
    private static String lIIIIIIIllIlIIII(String llllllllllllIlllllIlllllIlIlIIll, final String llllllllllllIlllllIlllllIlIlIIIl) {
        llllllllllllIlllllIlllllIlIlIIll = new String(Base64.getDecoder().decode(llllllllllllIlllllIlllllIlIlIIll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder llllllllllllIlllllIlllllIlIllIIl = new StringBuilder();
        final char[] llllllllllllIlllllIlllllIlIlIlll = llllllllllllIlllllIlllllIlIlIIIl.toCharArray();
        int llllllllllllIlllllIlllllIlIlIlIl = AttributeModifier.lIlllIIIIIlIll[1];
        final double llllllllllllIlllllIlllllIlIIlIlI = (Object)llllllllllllIlllllIlllllIlIlIIll.toCharArray();
        final boolean llllllllllllIlllllIlllllIlIIlIII = llllllllllllIlllllIlllllIlIIlIlI.length != 0;
        float llllllllllllIlllllIlllllIlIIIllI = AttributeModifier.lIlllIIIIIlIll[1];
        while (lIIIIIIIllIllIll((int)llllllllllllIlllllIlllllIlIIIllI, llllllllllllIlllllIlllllIlIIlIII ? 1 : 0)) {
            final char llllllllllllIlllllIlllllIlIlllll = llllllllllllIlllllIlllllIlIIlIlI[llllllllllllIlllllIlllllIlIIIllI];
            llllllllllllIlllllIlllllIlIllIIl.append((char)(llllllllllllIlllllIlllllIlIlllll ^ llllllllllllIlllllIlllllIlIlIlll[llllllllllllIlllllIlllllIlIlIlIl % llllllllllllIlllllIlllllIlIlIlll.length]));
            "".length();
            ++llllllllllllIlllllIlllllIlIlIlIl;
            ++llllllllllllIlllllIlllllIlIIIllI;
            "".length();
            if ((0xAE ^ 0xAB) <= 0) {
                return null;
            }
        }
        return String.valueOf(llllllllllllIlllllIlllllIlIllIIl);
    }
    
    private static String lIIIIIIIllIlIIlI(final String llllllllllllIlllllIlllllIIllIlII, final String llllllllllllIlllllIlllllIIllIlIl) {
        try {
            final SecretKeySpec llllllllllllIlllllIlllllIIlllIlI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIlllllIlllllIIllIlIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher llllllllllllIlllllIlllllIIlllIIl = Cipher.getInstance("Blowfish");
            llllllllllllIlllllIlllllIIlllIIl.init(AttributeModifier.lIlllIIIIIlIll[2], llllllllllllIlllllIlllllIIlllIlI);
            return new String(llllllllllllIlllllIlllllIIlllIIl.doFinal(Base64.getDecoder().decode(llllllllllllIlllllIlllllIIllIlII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIlllllIlllllIIlllIII) {
            llllllllllllIlllllIlllllIIlllIII.printStackTrace();
            return null;
        }
    }
    
    private static boolean lIIIIIIIllIllIII(final Object llllllllllllIlllllIlllllIIIlIIll) {
        return llllllllllllIlllllIlllllIIIlIIll != null;
    }
    
    static {
        lIIIIIIIllIlIllI();
        lIIIIIIIllIlIIll();
    }
    
    private static void lIIIIIIIllIlIllI() {
        (lIlllIIIIIlIll = new int[11])[0] = " ".length();
        AttributeModifier.lIlllIIIIIlIll[1] = ((0x40 ^ 0x54 ^ (0x3B ^ 0x70)) & (225 + 220 - 427 + 220 ^ 132 + 33 - 158 + 170 ^ -" ".length()));
        AttributeModifier.lIlllIIIIIlIll[2] = "  ".length();
        AttributeModifier.lIlllIIIIIlIll[3] = "   ".length();
        AttributeModifier.lIlllIIIIIlIll[4] = (49 + 140 - 127 + 119 ^ 67 + 37 + 70 + 3);
        AttributeModifier.lIlllIIIIIlIll[5] = (0x9D ^ 0xC6 ^ (0xE9 ^ 0x95));
        AttributeModifier.lIlllIIIIIlIll[6] = (0xC0 ^ 0xC5);
        AttributeModifier.lIlllIIIIIlIll[7] = (0xC6 ^ 0xC0);
        AttributeModifier.lIlllIIIIIlIll[8] = (0xAC ^ 0xB5 ^ (0x5A ^ 0x3E));
        AttributeModifier.lIlllIIIIIlIll[9] = (0x16 ^ 0x65 ^ (0x59 ^ 0x2D));
        AttributeModifier.lIlllIIIIIlIll[10] = (0x3F ^ 0x37);
    }
    
    @Override
    public boolean equals(final Object llllllllllllIlllllIllllllIIIlIII) {
        if (lIIIIIIIllIlIlll(this, llllllllllllIlllllIllllllIIIlIII)) {
            return AttributeModifier.lIlllIIIIIlIll[0] != 0;
        }
        if (lIIIIIIIllIllIII(llllllllllllIlllllIllllllIIIlIII) && lIIIIIIIllIlIlll(this.getClass(), llllllllllllIlllllIllllllIIIlIII.getClass())) {
            final AttributeModifier llllllllllllIlllllIllllllIIIIlll = (AttributeModifier)llllllllllllIlllllIllllllIIIlIII;
            if (lIIIIIIIllIllIII(this.id)) {
                if (lIIIIIIIllIllIlI(this.id.equals(llllllllllllIlllllIllllllIIIIlll.id) ? 1 : 0)) {
                    return AttributeModifier.lIlllIIIIIlIll[1] != 0;
                }
            }
            else if (lIIIIIIIllIllIII(llllllllllllIlllllIllllllIIIIlll.id)) {
                return AttributeModifier.lIlllIIIIIlIll[1] != 0;
            }
            return AttributeModifier.lIlllIIIIIlIll[0] != 0;
        }
        return AttributeModifier.lIlllIIIIIlIll[1] != 0;
    }
    
    private static boolean lIIIIIIIllIlIlll(final Object llllllllllllIlllllIlllllIIIlIllI, final Object llllllllllllIlllllIlllllIIIlIlIl) {
        return llllllllllllIlllllIlllllIIIlIllI == llllllllllllIlllllIlllllIIIlIlIl;
    }
    
    public double getAmount() {
        return this.amount;
    }
    
    private static boolean lIIIIIIIllIllIll(final int llllllllllllIlllllIlllllIIIllIlI, final int llllllllllllIlllllIlllllIIIllIIl) {
        return llllllllllllIlllllIlllllIIIllIlI < llllllllllllIlllllIlllllIIIllIIl;
    }
    
    public int getOperation() {
        return this.operation;
    }
    
    private static String lIIIIIIIllIlIIIl(final String llllllllllllIlllllIlllllIIlIIIlI, final String llllllllllllIlllllIlllllIIIlllll) {
        try {
            final SecretKeySpec llllllllllllIlllllIlllllIIlIlIII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIlllllIlllllIIIlllll.getBytes(StandardCharsets.UTF_8)), AttributeModifier.lIlllIIIIIlIll[10]), "DES");
            final Cipher llllllllllllIlllllIlllllIIlIIllI = Cipher.getInstance("DES");
            llllllllllllIlllllIlllllIIlIIllI.init(AttributeModifier.lIlllIIIIIlIll[2], llllllllllllIlllllIlllllIIlIlIII);
            return new String(llllllllllllIlllllIlllllIIlIIllI.doFinal(Base64.getDecoder().decode(llllllllllllIlllllIlllllIIlIIIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIlllllIlllllIIlIIlII) {
            llllllllllllIlllllIlllllIIlIIlII.printStackTrace();
            return null;
        }
    }
    
    private static boolean lIIIIIIIllIllIlI(final int llllllllllllIlllllIlllllIIIlIIIl) {
        return llllllllllllIlllllIlllllIIIlIIIl == 0;
    }
    
    public AttributeModifier(final UUID llllllllllllIlllllIllllllIlllIlI, final String llllllllllllIlllllIllllllIllllll, final double llllllllllllIlllllIllllllIllIllI, final int llllllllllllIlllllIllllllIllllIl) {
        this.isSaved = (AttributeModifier.lIlllIIIIIlIll[0] != 0);
        this.id = llllllllllllIlllllIllllllIlllIlI;
        this.name = llllllllllllIlllllIllllllIllllll;
        this.amount = llllllllllllIlllllIllllllIllIllI;
        this.operation = llllllllllllIlllllIllllllIllllIl;
        Validate.notEmpty((CharSequence)llllllllllllIlllllIllllllIllllll, AttributeModifier.lIlllIIIIIlIlI[AttributeModifier.lIlllIIIIIlIll[1]], new Object[AttributeModifier.lIlllIIIIIlIll[1]]);
        "".length();
        Validate.inclusiveBetween(0L, 2L, (long)llllllllllllIlllllIllllllIllllIl, AttributeModifier.lIlllIIIIIlIlI[AttributeModifier.lIlllIIIIIlIll[0]]);
    }
    
    private static void lIIIIIIIllIlIIll() {
        (lIlllIIIIIlIlI = new String[AttributeModifier.lIlllIIIIIlIll[9]])[AttributeModifier.lIlllIIIIIlIll[1]] = lIIIIIIIllIlIIII("FycLMCozLR15IjslCnkvOyYBNjh6Kgp5KTc4GyA=", "ZHoYL");
        AttributeModifier.lIlllIIIIIlIlI[AttributeModifier.lIlllIIIIIlIll[0]] = lIIIIIIIllIlIIIl("VV7GXbesOa0oHc1gSJYl4Omefjdi6UwF", "yRfCE");
        AttributeModifier.lIlllIIIIIlIlI[AttributeModifier.lIlllIIIIIlIll[2]] = lIIIIIIIllIlIIIl("E0VfY7BApEh3cWE2ptg3M8kuKYzB9wAfHpQwi8/et6s=", "lijrH");
        AttributeModifier.lIlllIIIIIlIlI[AttributeModifier.lIlllIIIIIlIll[3]] = lIIIIIIIllIlIIIl("3zR0gXAUgzLakd/ITjI9Qw==", "qiHvt");
        AttributeModifier.lIlllIIIIIlIlI[AttributeModifier.lIlllIIIIIlIll[4]] = lIIIIIIIllIlIIlI("Lh2NjE3cVRB79RCE135p6g==", "Zzjzy");
        AttributeModifier.lIlllIIIIIlIlI[AttributeModifier.lIlllIIIIIlIll[6]] = lIIIIIIIllIlIIlI("CNvuEOSkC28=", "ANerd");
        AttributeModifier.lIlllIIIIIlIlI[AttributeModifier.lIlllIIIIIlIll[7]] = lIIIIIIIllIlIIII("XVIRNCgYEw44IBRP", "qrbQZ");
    }
    
    @Override
    public int hashCode() {
        int hashCode;
        if (lIIIIIIIllIllIII(this.id)) {
            hashCode = this.id.hashCode();
            "".length();
            if ("   ".length() > (97 + 100 - 103 + 46 ^ 125 + 13 - 85 + 83)) {
                return (107 + 151 - 199 + 100 ^ 122 + 138 - 124 + 38) & (0xAF ^ 0xB6 ^ (0x6E ^ 0x46) ^ -" ".length());
            }
        }
        else {
            hashCode = AttributeModifier.lIlllIIIIIlIll[1];
        }
        return hashCode;
    }
    
    @Override
    public String toString() {
        return String.valueOf(new StringBuilder(AttributeModifier.lIlllIIIIIlIlI[AttributeModifier.lIlllIIIIIlIll[2]]).append(this.amount).append(AttributeModifier.lIlllIIIIIlIlI[AttributeModifier.lIlllIIIIIlIll[3]]).append(this.operation).append(AttributeModifier.lIlllIIIIIlIlI[AttributeModifier.lIlllIIIIIlIll[4]]).append(this.name).append((char)AttributeModifier.lIlllIIIIIlIll[5]).append(AttributeModifier.lIlllIIIIIlIlI[AttributeModifier.lIlllIIIIIlIll[6]]).append(this.id).append(AttributeModifier.lIlllIIIIIlIlI[AttributeModifier.lIlllIIIIIlIll[7]]).append(this.isSaved).append((char)AttributeModifier.lIlllIIIIIlIll[8]));
    }
    
    public boolean isSaved() {
        return this.isSaved;
    }
    
    public UUID getID() {
        return this.id;
    }
    
    public String getName() {
        return this.name;
    }
    
    public AttributeModifier(final String llllllllllllIlllllIlllllllIIllll, final double llllllllllllIlllllIlllllllIlIIll, final int llllllllllllIlllllIlllllllIIllIl) {
        this(MathHelper.getRandomUuid(ThreadLocalRandom.current()), llllllllllllIlllllIlllllllIIllll, llllllllllllIlllllIlllllllIlIIll, llllllllllllIlllllIlllllllIIllIl);
    }
}
