// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.nbt;

import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.security.MessageDigest;
import java.io.DataInput;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.Arrays;
import java.io.IOException;
import java.io.DataOutput;

public class NBTTagIntArray extends NBTBase
{
    private static final /* synthetic */ int[] lllIllIllIlllI;
    private /* synthetic */ int[] intArray;
    private static final /* synthetic */ String[] lllIllIllIllIl;
    
    @Override
    public String toString() {
        String llllllllllllIlIllIIIllIllIIIIllI = NBTTagIntArray.lllIllIllIllIl[NBTTagIntArray.lllIllIllIlllI[0]];
        final String llllllllllllIlIllIIIllIlIlllllll;
        final long llllllllllllIlIllIIIllIllIIIIIII = ((int[])(Object)(llllllllllllIlIllIIIllIlIlllllll = (String)(Object)this.intArray)).length;
        double llllllllllllIlIllIIIllIllIIIIIIl = NBTTagIntArray.lllIllIllIlllI[0];
        "".length();
        if (-"  ".length() > 0) {
            return null;
        }
        while (!lIlIIlIlIIlIlIlI((int)llllllllllllIlIllIIIllIllIIIIIIl, (int)llllllllllllIlIllIIIllIllIIIIIII)) {
            final int llllllllllllIlIllIIIllIllIIIIlIl = llllllllllllIlIllIIIllIlIlllllll[llllllllllllIlIllIIIllIllIIIIIIl];
            llllllllllllIlIllIIIllIllIIIIllI = String.valueOf(new StringBuilder(String.valueOf(llllllllllllIlIllIIIllIllIIIIllI)).append(llllllllllllIlIllIIIllIllIIIIlIl).append(NBTTagIntArray.lllIllIllIllIl[NBTTagIntArray.lllIllIllIlllI[3]]));
            ++llllllllllllIlIllIIIllIllIIIIIIl;
        }
        return String.valueOf(new StringBuilder(String.valueOf(llllllllllllIlIllIIIllIllIIIIllI)).append(NBTTagIntArray.lllIllIllIllIl[NBTTagIntArray.lllIllIllIlllI[4]]));
    }
    
    static {
        lIlIIlIlIIlIlIIl();
        lIlIIlIlIIlIlIII();
    }
    
    @Override
    void write(final DataOutput llllllllllllIlIllIIIllIllIlIIIll) throws IOException {
        llllllllllllIlIllIIIllIllIlIIIll.writeInt(this.intArray.length);
        int llllllllllllIlIllIIIllIllIlIIIlI = NBTTagIntArray.lllIllIllIlllI[0];
        "".length();
        if (((16 + 16 + 103 + 10 ^ 17 + 91 + 9 + 25) & (0x82 ^ 0xBE ^ (0x51 ^ 0x72) ^ -" ".length())) > "   ".length()) {
            return;
        }
        while (!lIlIIlIlIIlIlIlI(llllllllllllIlIllIIIllIllIlIIIlI, this.intArray.length)) {
            llllllllllllIlIllIIIllIllIlIIIll.writeInt(this.intArray[llllllllllllIlIllIIIllIllIlIIIlI]);
            ++llllllllllllIlIllIIIllIllIlIIIlI;
        }
    }
    
    @Override
    public int hashCode() {
        return super.hashCode() ^ Arrays.hashCode(this.intArray);
    }
    
    public int[] getIntArray() {
        return this.intArray;
    }
    
    private static boolean lIlIIlIlIIlIllII(final int llllllllllllIlIllIIIllIlIlIIIIIl, final int llllllllllllIlIllIIIllIlIlIIIIII) {
        return llllllllllllIlIllIIIllIlIlIIIIIl < llllllllllllIlIllIIIllIlIlIIIIII;
    }
    
    private static String lIlIIlIlIIlIIlll(String llllllllllllIlIllIIIllIlIlIlIIII, final String llllllllllllIlIllIIIllIlIlIIllll) {
        llllllllllllIlIllIIIllIlIlIlIIII = new String(Base64.getDecoder().decode(llllllllllllIlIllIIIllIlIlIlIIII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder llllllllllllIlIllIIIllIlIlIlIIll = new StringBuilder();
        final char[] llllllllllllIlIllIIIllIlIlIlIIlI = llllllllllllIlIllIIIllIlIlIIllll.toCharArray();
        int llllllllllllIlIllIIIllIlIlIlIIIl = NBTTagIntArray.lllIllIllIlllI[0];
        final byte llllllllllllIlIllIIIllIlIlIIlIll = (Object)llllllllllllIlIllIIIllIlIlIlIIII.toCharArray();
        final float llllllllllllIlIllIIIllIlIlIIlIlI = llllllllllllIlIllIIIllIlIlIIlIll.length;
        char llllllllllllIlIllIIIllIlIlIIlIIl = (char)NBTTagIntArray.lllIllIllIlllI[0];
        while (lIlIIlIlIIlIllII(llllllllllllIlIllIIIllIlIlIIlIIl, (int)llllllllllllIlIllIIIllIlIlIIlIlI)) {
            final char llllllllllllIlIllIIIllIlIlIlIllI = llllllllllllIlIllIIIllIlIlIIlIll[llllllllllllIlIllIIIllIlIlIIlIIl];
            llllllllllllIlIllIIIllIlIlIlIIll.append((char)(llllllllllllIlIllIIIllIlIlIlIllI ^ llllllllllllIlIllIIIllIlIlIlIIlI[llllllllllllIlIllIIIllIlIlIlIIIl % llllllllllllIlIllIIIllIlIlIlIIlI.length]));
            "".length();
            ++llllllllllllIlIllIIIllIlIlIlIIIl;
            ++llllllllllllIlIllIIIllIlIlIIlIIl;
            "".length();
            if ("  ".length() <= -" ".length()) {
                return null;
            }
        }
        return String.valueOf(llllllllllllIlIllIIIllIlIlIlIIll);
    }
    
    private static boolean lIlIIlIlIIlIlIll(final int llllllllllllIlIllIIIllIlIIlllllI) {
        return llllllllllllIlIllIIIllIlIIlllllI != 0;
    }
    
    @Override
    public NBTBase copy() {
        final int[] llllllllllllIlIllIIIllIlIllllIll = new int[this.intArray.length];
        System.arraycopy(this.intArray, NBTTagIntArray.lllIllIllIlllI[0], llllllllllllIlIllIIIllIlIllllIll, NBTTagIntArray.lllIllIllIlllI[0], this.intArray.length);
        return new NBTTagIntArray(llllllllllllIlIllIIIllIlIllllIll);
    }
    
    @Override
    void read(final DataInput llllllllllllIlIllIIIllIllIIlIIlI, final int llllllllllllIlIllIIIllIllIIlIlll, final NBTSizeTracker llllllllllllIlIllIIIllIllIIlIllI) throws IOException {
        llllllllllllIlIllIIIllIllIIlIllI.read(192L);
        final int llllllllllllIlIllIIIllIllIIlIlIl = llllllllllllIlIllIIIllIllIIlIIlI.readInt();
        llllllllllllIlIllIIIllIllIIlIllI.read(NBTTagIntArray.lllIllIllIlllI[1] * llllllllllllIlIllIIIllIllIIlIlIl);
        this.intArray = new int[llllllllllllIlIllIIIllIllIIlIlIl];
        int llllllllllllIlIllIIIllIllIIlIlII = NBTTagIntArray.lllIllIllIlllI[0];
        "".length();
        if (null != null) {
            return;
        }
        while (!lIlIIlIlIIlIlIlI(llllllllllllIlIllIIIllIllIIlIlII, llllllllllllIlIllIIIllIllIIlIlIl)) {
            this.intArray[llllllllllllIlIllIIIllIllIIlIlII] = llllllllllllIlIllIIIllIllIIlIIlI.readInt();
            ++llllllllllllIlIllIIIllIllIIlIlII;
        }
    }
    
    NBTTagIntArray() {
    }
    
    private static boolean lIlIIlIlIIlIlIlI(final int llllllllllllIlIllIIIllIlIlIIIlIl, final int llllllllllllIlIllIIIllIlIlIIIlII) {
        return llllllllllllIlIllIIIllIlIlIIIlIl >= llllllllllllIlIllIIIllIlIlIIIlII;
    }
    
    public NBTTagIntArray(final int[] llllllllllllIlIllIIIllIllIlIlIlI) {
        this.intArray = llllllllllllIlIllIIIllIllIlIlIlI;
    }
    
    @Override
    public byte getId() {
        return (byte)NBTTagIntArray.lllIllIllIlllI[2];
    }
    
    private static String lIlIIlIlIIlIIllI(final String llllllllllllIlIllIIIllIlIllIIlIl, final String llllllllllllIlIllIIIllIlIllIIIlI) {
        try {
            final SecretKeySpec llllllllllllIlIllIIIllIlIllIlIII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIlIllIIIllIlIllIIIlI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher llllllllllllIlIllIIIllIlIllIIlll = Cipher.getInstance("Blowfish");
            llllllllllllIlIllIIIllIlIllIIlll.init(NBTTagIntArray.lllIllIllIlllI[4], llllllllllllIlIllIIIllIlIllIlIII);
            return new String(llllllllllllIlIllIIIllIlIllIIlll.doFinal(Base64.getDecoder().decode(llllllllllllIlIllIIIllIlIllIIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIlIllIIIllIlIllIIllI) {
            llllllllllllIlIllIIIllIlIllIIllI.printStackTrace();
            return null;
        }
    }
    
    private static void lIlIIlIlIIlIlIII() {
        (lllIllIllIllIl = new String[NBTTagIntArray.lllIllIllIlllI[5]])[NBTTagIntArray.lllIllIllIlllI[0]] = lIlIIlIlIIlIIllI("UCSbQ1iouWI=", "SpLZM");
        NBTTagIntArray.lllIllIllIllIl[NBTTagIntArray.lllIllIllIlllI[3]] = lIlIIlIlIIlIIlll("Rw==", "kaEJw");
        NBTTagIntArray.lllIllIllIllIl[NBTTagIntArray.lllIllIllIlllI[4]] = lIlIIlIlIIlIIlll("Fw==", "JVYUv");
    }
    
    @Override
    public boolean equals(final Object llllllllllllIlIllIIIllIlIlllIlIl) {
        int equals;
        if (lIlIIlIlIIlIlIll(super.equals(llllllllllllIlIllIIIllIlIlllIlIl) ? 1 : 0)) {
            equals = (Arrays.equals(this.intArray, ((NBTTagIntArray)llllllllllllIlIllIIIllIlIlllIlIl).intArray) ? 1 : 0);
            "".length();
            if ((0xC2 ^ 0xC6) < 0) {
                return ((0x6B ^ 0x6E) & ~(0x3B ^ 0x3E)) != 0x0;
            }
        }
        else {
            equals = NBTTagIntArray.lllIllIllIlllI[0];
        }
        return equals != 0;
    }
    
    private static void lIlIIlIlIIlIlIIl() {
        (lllIllIllIlllI = new int[6])[0] = ((0x6C ^ 0x51) & ~(0xB7 ^ 0x8A));
        NBTTagIntArray.lllIllIllIlllI[1] = (0xBE ^ 0xAB ^ (0x91 ^ 0xA4));
        NBTTagIntArray.lllIllIllIlllI[2] = (0x92 ^ 0x99);
        NBTTagIntArray.lllIllIllIlllI[3] = " ".length();
        NBTTagIntArray.lllIllIllIlllI[4] = "  ".length();
        NBTTagIntArray.lllIllIllIlllI[5] = "   ".length();
    }
}
