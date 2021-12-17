// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.world;

import net.minecraft.nbt.NBTTagCompound;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;

public class LockCode
{
    private static final /* synthetic */ String[] lllIlIIlIlIlII;
    private final /* synthetic */ String lock;
    private static final /* synthetic */ int[] lllIlIlllIlIlI;
    public static final /* synthetic */ LockCode EMPTY_CODE;
    
    private static void lIlIIIlIIIllIIII() {
        (lllIlIIlIlIlII = new String[LockCode.lllIlIlllIlIlI[5]])[LockCode.lllIlIlllIlIlI[0]] = lIlIIIlIIIlIllIl("b90aXT0iCZM=", "baXZQ");
        LockCode.lllIlIIlIlIlII[LockCode.lllIlIlllIlIlI[1]] = lIlIIIlIIIlIlllI("N4mGMd2nfhw=", "ogahS");
        LockCode.lllIlIIlIlIlII[LockCode.lllIlIlllIlIlI[2]] = lIlIIIlIIIlIlllI("0jl9pDK90Ks=", "NGGmf");
        LockCode.lllIlIIlIlIlII[LockCode.lllIlIlllIlIlI[4]] = lIlIIIlIIIlIllll("NSUyIg==", "yJQIU");
    }
    
    private static void lIlIIIllIllllllI() {
        (lllIlIlllIlIlI = new int[6])[0] = ((20 + 154 - 33 + 101 ^ 188 + 182 - 275 + 97) & (0xA ^ 0x47 ^ 15 + 2 + 6 + 104 ^ -" ".length()));
        LockCode.lllIlIlllIlIlI[1] = " ".length();
        LockCode.lllIlIlllIlIlI[2] = "  ".length();
        LockCode.lllIlIlllIlIlI[3] = (0xB9 ^ 0xB1);
        LockCode.lllIlIlllIlIlI[4] = "   ".length();
        LockCode.lllIlIlllIlIlI[5] = (0x8A ^ 0x8E);
    }
    
    private static boolean lIlIIIlllIIIIIIl(final int llllllllllllIlIllIlIIlIllllllllI) {
        return llllllllllllIlIllIlIIlIllllllllI != 0;
    }
    
    private static String lIlIIIlIIIlIllIl(final String llllllllllllIlIllIlIIllIIIlIlllI, final String llllllllllllIlIllIlIIllIIIlIllIl) {
        try {
            final SecretKeySpec llllllllllllIlIllIlIIllIIIllIIll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIlIllIlIIllIIIlIllIl.getBytes(StandardCharsets.UTF_8)), LockCode.lllIlIlllIlIlI[3]), "DES");
            final Cipher llllllllllllIlIllIlIIllIIIllIIlI = Cipher.getInstance("DES");
            llllllllllllIlIllIlIIllIIIllIIlI.init(LockCode.lllIlIlllIlIlI[2], llllllllllllIlIllIlIIllIIIllIIll);
            return new String(llllllllllllIlIllIlIIllIIIllIIlI.doFinal(Base64.getDecoder().decode(llllllllllllIlIllIlIIllIIIlIlllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIlIllIlIIllIIIllIIIl) {
            llllllllllllIlIllIlIIllIIIllIIIl.printStackTrace();
            return null;
        }
    }
    
    private static String lIlIIIlIIIlIlllI(final String llllllllllllIlIllIlIIllIIIIIlIIl, final String llllllllllllIlIllIlIIllIIIIIlIlI) {
        try {
            final SecretKeySpec llllllllllllIlIllIlIIllIIIIIlllI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIlIllIlIIllIIIIIlIlI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher llllllllllllIlIllIlIIllIIIIIllIl = Cipher.getInstance("Blowfish");
            llllllllllllIlIllIlIIllIIIIIllIl.init(LockCode.lllIlIlllIlIlI[2], llllllllllllIlIllIlIIllIIIIIlllI);
            return new String(llllllllllllIlIllIlIIllIIIIIllIl.doFinal(Base64.getDecoder().decode(llllllllllllIlIllIlIIllIIIIIlIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIlIllIlIIllIIIIIllII) {
            llllllllllllIlIllIlIIllIIIIIllII.printStackTrace();
            return null;
        }
    }
    
    private static boolean lIlIIIlllIIIIIlI(final int llllllllllllIlIllIlIIllIIIIIIIll, final int llllllllllllIlIllIlIIllIIIIIIIlI) {
        return llllllllllllIlIllIlIIllIIIIIIIll < llllllllllllIlIllIlIIllIIIIIIIlI;
    }
    
    public static LockCode fromNBT(final NBTTagCompound llllllllllllIlIllIlIIllIIIlllIll) {
        if (lIlIIIlllIIIIIIl(llllllllllllIlIllIlIIllIIIlllIll.hasKey(LockCode.lllIlIIlIlIlII[LockCode.lllIlIlllIlIlI[2]], LockCode.lllIlIlllIlIlI[3]) ? 1 : 0)) {
            final String llllllllllllIlIllIlIIllIIIlllIlI = llllllllllllIlIllIlIIllIIIlllIll.getString(LockCode.lllIlIIlIlIlII[LockCode.lllIlIlllIlIlI[4]]);
            return new LockCode(llllllllllllIlIllIlIIllIIIlllIlI);
        }
        return LockCode.EMPTY_CODE;
    }
    
    private static String lIlIIIlIIIlIllll(String llllllllllllIlIllIlIIllIIIIllIll, final String llllllllllllIlIllIlIIllIIIIlllll) {
        llllllllllllIlIllIlIIllIIIIllIll = new String(Base64.getDecoder().decode(llllllllllllIlIllIlIIllIIIIllIll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder llllllllllllIlIllIlIIllIIIIllllI = new StringBuilder();
        final char[] llllllllllllIlIllIlIIllIIIIlllIl = llllllllllllIlIllIlIIllIIIIlllll.toCharArray();
        int llllllllllllIlIllIlIIllIIIIlllII = LockCode.lllIlIlllIlIlI[0];
        final double llllllllllllIlIllIlIIllIIIIlIllI = (Object)llllllllllllIlIllIlIIllIIIIllIll.toCharArray();
        final Exception llllllllllllIlIllIlIIllIIIIlIlIl = (Exception)llllllllllllIlIllIlIIllIIIIlIllI.length;
        double llllllllllllIlIllIlIIllIIIIlIlII = LockCode.lllIlIlllIlIlI[0];
        while (lIlIIIlllIIIIIlI((int)llllllllllllIlIllIlIIllIIIIlIlII, (int)llllllllllllIlIllIlIIllIIIIlIlIl)) {
            final char llllllllllllIlIllIlIIllIIIlIIIIl = llllllllllllIlIllIlIIllIIIIlIllI[llllllllllllIlIllIlIIllIIIIlIlII];
            llllllllllllIlIllIlIIllIIIIllllI.append((char)(llllllllllllIlIllIlIIllIIIlIIIIl ^ llllllllllllIlIllIlIIllIIIIlllIl[llllllllllllIlIllIlIIllIIIIlllII % llllllllllllIlIllIlIIllIIIIlllIl.length]));
            "".length();
            ++llllllllllllIlIllIlIIllIIIIlllII;
            ++llllllllllllIlIllIlIIllIIIIlIlII;
            "".length();
            if ((0x8D ^ 0xB9 ^ (0x55 ^ 0x64)) == 0x0) {
                return null;
            }
        }
        return String.valueOf(llllllllllllIlIllIlIIllIIIIllllI);
    }
    
    public void toNBT(final NBTTagCompound llllllllllllIlIllIlIIllIIlIIIIII) {
        llllllllllllIlIllIlIIllIIlIIIIII.setString(LockCode.lllIlIIlIlIlII[LockCode.lllIlIlllIlIlI[1]], this.lock);
    }
    
    private static boolean lIlIIIllIlllllll(final Object llllllllllllIlIllIlIIllIIIIIIIII) {
        return llllllllllllIlIllIlIIllIIIIIIIII != null;
    }
    
    private static boolean lIlIIIlllIIIIIII(final int llllllllllllIlIllIlIIlIlllllllII) {
        return llllllllllllIlIllIlIIlIlllllllII == 0;
    }
    
    static {
        lIlIIIllIllllllI();
        lIlIIIlIIIllIIII();
        EMPTY_CODE = new LockCode(LockCode.lllIlIIlIlIlII[LockCode.lllIlIlllIlIlI[0]]);
    }
    
    public boolean isEmpty() {
        if (lIlIIIllIlllllll(this.lock) && lIlIIIlllIIIIIII(this.lock.isEmpty() ? 1 : 0)) {
            return LockCode.lllIlIlllIlIlI[0] != 0;
        }
        return LockCode.lllIlIlllIlIlI[1] != 0;
    }
    
    public String getLock() {
        return this.lock;
    }
    
    public LockCode(final String llllllllllllIlIllIlIIllIIlIIllII) {
        this.lock = llllllllllllIlIllIlIIllIIlIIllII;
    }
}
