// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.nbt;

import java.io.DataInput;
import java.io.IOException;
import java.io.DataOutput;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;

public abstract class NBTBase
{
    private static final /* synthetic */ int[] lIllIlllIlIIII;
    private static final /* synthetic */ String[] lIllIlllIIlllI;
    
    public abstract NBTBase copy();
    
    private static void lIIIIIIIIIlIlIlI() {
        (lIllIlllIlIIII = new int[13])[0] = (0x2 ^ 0xE);
        NBTBase.lIllIlllIlIIII[1] = ((0x0 ^ 0x47) & ~(0xE5 ^ 0xA2));
        NBTBase.lIllIlllIlIIII[2] = " ".length();
        NBTBase.lIllIlllIlIIII[3] = "  ".length();
        NBTBase.lIllIlllIlIIII[4] = "   ".length();
        NBTBase.lIllIlllIlIIII[5] = (0x9B ^ 0x84 ^ (0x37 ^ 0x2C));
        NBTBase.lIllIlllIlIIII[6] = (0x70 ^ 0x75);
        NBTBase.lIllIlllIlIIII[7] = (0x63 ^ 0x65);
        NBTBase.lIllIlllIlIIII[8] = (0x88 ^ 0xBE ^ (0x1E ^ 0x2F));
        NBTBase.lIllIlllIlIIII[9] = (0x37 ^ 0x18 ^ (0x19 ^ 0x3E));
        NBTBase.lIllIlllIlIIII[10] = (128 + 68 - 169 + 149 ^ 83 + 170 - 191 + 123);
        NBTBase.lIllIlllIlIIII[11] = (0xBA ^ 0x86 ^ (0x4F ^ 0x79));
        NBTBase.lIllIlllIlIIII[12] = (84 + 119 - 153 + 85 ^ 87 + 74 - 156 + 135);
    }
    
    private static String lIIIIIIIIIlIIIIl(final String llllllllllllIllllllIlIIIIIIlIlII, final String llllllllllllIllllllIlIIIIIIlIIlI) {
        try {
            final SecretKeySpec llllllllllllIllllllIlIIIIIIlllII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIllllllIlIIIIIIlIIlI.getBytes(StandardCharsets.UTF_8)), NBTBase.lIllIlllIlIIII[9]), "DES");
            final Cipher llllllllllllIllllllIlIIIIIIllIll = Cipher.getInstance("DES");
            llllllllllllIllllllIlIIIIIIllIll.init(NBTBase.lIllIlllIlIIII[3], llllllllllllIllllllIlIIIIIIlllII);
            return new String(llllllllllllIllllllIlIIIIIIllIll.doFinal(Base64.getDecoder().decode(llllllllllllIllllllIlIIIIIIlIlII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIllllllIlIIIIIIllIIl) {
            llllllllllllIllllllIlIIIIIIllIIl.printStackTrace();
            return null;
        }
    }
    
    private static String lIIIIIIIIIIlllll(final String llllllllllllIllllllIlIIIIlIllIll, final String llllllllllllIllllllIlIIIIlIlllII) {
        try {
            final SecretKeySpec llllllllllllIllllllIlIIIIllIIIIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIllllllIlIIIIlIlllII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher llllllllllllIllllllIlIIIIllIIIII = Cipher.getInstance("Blowfish");
            llllllllllllIllllllIlIIIIllIIIII.init(NBTBase.lIllIlllIlIIII[3], llllllllllllIllllllIlIIIIllIIIIl);
            return new String(llllllllllllIllllllIlIIIIllIIIII.doFinal(Base64.getDecoder().decode(llllllllllllIllllllIlIIIIlIllIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIllllllIlIIIIlIlllll) {
            llllllllllllIllllllIlIIIIlIlllll.printStackTrace();
            return null;
        }
    }
    
    private static boolean lIIIIIIIIIlIllII(final int llllllllllllIllllllIlIIIIIIIIlIl, final int llllllllllllIllllllIlIIIIIIIIlII) {
        return llllllllllllIllllllIlIIIIIIIIlIl == llllllllllllIllllllIlIIIIIIIIlII;
    }
    
    private static String lIIIIIIIIIIllllI(String llllllllllllIllllllIlIIIIIllIIll, final String llllllllllllIllllllIlIIIIIllIIIl) {
        llllllllllllIllllllIlIIIIIllIIll = new String(Base64.getDecoder().decode(llllllllllllIllllllIlIIIIIllIIll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder llllllllllllIllllllIlIIIIIlllIII = new StringBuilder();
        final char[] llllllllllllIllllllIlIIIIIllIllI = llllllllllllIllllllIlIIIIIllIIIl.toCharArray();
        int llllllllllllIllllllIlIIIIIllIlII = NBTBase.lIllIlllIlIIII[1];
        final boolean llllllllllllIllllllIlIIIIIlIllII = (Object)llllllllllllIllllllIlIIIIIllIIll.toCharArray();
        final float llllllllllllIllllllIlIIIIIlIlIlI = llllllllllllIllllllIlIIIIIlIllII.length;
        Exception llllllllllllIllllllIlIIIIIlIlIIl = (Exception)NBTBase.lIllIlllIlIIII[1];
        while (lIIIIIIIIIlIllIl((int)llllllllllllIllllllIlIIIIIlIlIIl, (int)llllllllllllIllllllIlIIIIIlIlIlI)) {
            final char llllllllllllIllllllIlIIIIIlllllI = llllllllllllIllllllIlIIIIIlIllII[llllllllllllIllllllIlIIIIIlIlIIl];
            llllllllllllIllllllIlIIIIIlllIII.append((char)(llllllllllllIllllllIlIIIIIlllllI ^ llllllllllllIllllllIlIIIIIllIllI[llllllllllllIllllllIlIIIIIllIlII % llllllllllllIllllllIlIIIIIllIllI.length]));
            "".length();
            ++llllllllllllIllllllIlIIIIIllIlII;
            ++llllllllllllIllllllIlIIIIIlIlIIl;
            "".length();
            if (-" ".length() > (0xE ^ 0xA)) {
                return null;
            }
        }
        return String.valueOf(llllllllllllIllllllIlIIIIIlllIII);
    }
    
    @Override
    public boolean equals(final Object llllllllllllIllllllIlIIIIlllllII) {
        if (lIIIIIIIIIlIlIll((llllllllllllIllllllIlIIIIlllllII instanceof NBTBase) ? 1 : 0)) {
            return NBTBase.lIllIlllIlIIII[1] != 0;
        }
        final NBTBase llllllllllllIllllllIlIIIlIIIIIII = (NBTBase)llllllllllllIllllllIlIIIIlllllII;
        if (lIIIIIIIIIlIllII(this.getId(), llllllllllllIllllllIlIIIlIIIIIII.getId())) {
            return NBTBase.lIllIlllIlIIII[2] != 0;
        }
        return NBTBase.lIllIlllIlIIII[1] != 0;
    }
    
    public abstract byte getId();
    
    public boolean hasNoTags() {
        return NBTBase.lIllIlllIlIIII[1] != 0;
    }
    
    private static void lIIIIIIIIIlIIIlI() {
        (lIllIlllIIlllI = new String[NBTBase.lIllIlllIlIIII[0]])[NBTBase.lIllIlllIlIIII[1]] = lIIIIIIIIIIllllI("ISoQ", "ddTOX");
        NBTBase.lIllIlllIIlllI[NBTBase.lIllIlllIlIIII[2]] = lIIIIIIIIIIllllI("Lj0XFw==", "ldCRL");
        NBTBase.lIllIlllIIlllI[NBTBase.lIllIlllIlIIII[3]] = lIIIIIIIIIIlllll("KdxAYIemFHU=", "xezGP");
        NBTBase.lIllIlllIIlllI[NBTBase.lIllIlllIlIIII[4]] = lIIIIIIIIIIllllI("LiU6", "gknMp");
        NBTBase.lIllIlllIIlllI[NBTBase.lIllIlllIlIIII[5]] = lIIIIIIIIIIlllll("5cjIq+16W/c=", "dzQQn");
        NBTBase.lIllIlllIIlllI[NBTBase.lIllIlllIlIIII[6]] = lIIIIIIIIIIllllI("MyMEFCM=", "uoKUw");
        NBTBase.lIllIlllIIlllI[NBTBase.lIllIlllIlIIII[7]] = lIIIIIIIIIlIIIIl("tMKUKU/Xxnc=", "kzRpN");
        NBTBase.lIllIlllIIlllI[NBTBase.lIllIlllIlIIII[8]] = lIIIIIIIIIlIIIIl("8lpaE6Y1aSg=", "FXHyV");
        NBTBase.lIllIlllIIlllI[NBTBase.lIllIlllIlIIII[9]] = lIIIIIIIIIIllllI("HgUzAhgK", "MQaKV");
        NBTBase.lIllIlllIIlllI[NBTBase.lIllIlllIlIIII[10]] = lIIIIIIIIIIllllI("Ij4YJg==", "nwKrM");
        NBTBase.lIllIlllIIlllI[NBTBase.lIllIlllIlIIII[11]] = lIIIIIIIIIIllllI("BysGFTURKg8=", "DdKEz");
        NBTBase.lIllIlllIIlllI[NBTBase.lIllIlllIlIIII[12]] = lIIIIIIIIIIlllll("+bHcXHrk9lc=", "RqAwN");
    }
    
    private static boolean lIIIIIIIIIlIlIll(final int llllllllllllIllllllIIllllllllIlI) {
        return llllllllllllIllllllIIllllllllIlI == 0;
    }
    
    protected static NBTBase createNewByType(final byte llllllllllllIllllllIlIIIlIIIllIl) {
        switch (llllllllllllIllllllIlIIIlIIIllIl) {
            case 0: {
                return new NBTTagEnd();
            }
            case 1: {
                return new NBTTagByte();
            }
            case 2: {
                return new NBTTagShort();
            }
            case 3: {
                return new NBTTagInt();
            }
            case 4: {
                return new NBTTagLong();
            }
            case 5: {
                return new NBTTagFloat();
            }
            case 6: {
                return new NBTTagDouble();
            }
            case 7: {
                return new NBTTagByteArray();
            }
            case 8: {
                return new NBTTagString();
            }
            case 9: {
                return new NBTTagList();
            }
            case 10: {
                return new NBTTagCompound();
            }
            case 11: {
                return new NBTTagIntArray();
            }
            default: {
                return null;
            }
        }
    }
    
    @Override
    public abstract String toString();
    
    abstract void write(final DataOutput p0) throws IOException;
    
    protected String getString() {
        return this.toString();
    }
    
    @Override
    public int hashCode() {
        return this.getId();
    }
    
    private static boolean lIIIIIIIIIlIllIl(final int llllllllllllIllllllIlIIIIIIIIIII, final int llllllllllllIllllllIIllllllllllI) {
        return llllllllllllIllllllIlIIIIIIIIIII < llllllllllllIllllllIIllllllllllI;
    }
    
    static {
        lIIIIIIIIIlIlIlI();
        lIIIIIIIIIlIIIlI();
        final String[] nbt_TYPES = new String[NBTBase.lIllIlllIlIIII[0]];
        nbt_TYPES[NBTBase.lIllIlllIlIIII[1]] = NBTBase.lIllIlllIIlllI[NBTBase.lIllIlllIlIIII[1]];
        nbt_TYPES[NBTBase.lIllIlllIlIIII[2]] = NBTBase.lIllIlllIIlllI[NBTBase.lIllIlllIlIIII[2]];
        nbt_TYPES[NBTBase.lIllIlllIlIIII[3]] = NBTBase.lIllIlllIIlllI[NBTBase.lIllIlllIlIIII[3]];
        nbt_TYPES[NBTBase.lIllIlllIlIIII[4]] = NBTBase.lIllIlllIIlllI[NBTBase.lIllIlllIlIIII[4]];
        nbt_TYPES[NBTBase.lIllIlllIlIIII[5]] = NBTBase.lIllIlllIIlllI[NBTBase.lIllIlllIlIIII[5]];
        nbt_TYPES[NBTBase.lIllIlllIlIIII[6]] = NBTBase.lIllIlllIIlllI[NBTBase.lIllIlllIlIIII[6]];
        nbt_TYPES[NBTBase.lIllIlllIlIIII[7]] = NBTBase.lIllIlllIIlllI[NBTBase.lIllIlllIlIIII[7]];
        nbt_TYPES[NBTBase.lIllIlllIlIIII[8]] = NBTBase.lIllIlllIIlllI[NBTBase.lIllIlllIlIIII[8]];
        nbt_TYPES[NBTBase.lIllIlllIlIIII[9]] = NBTBase.lIllIlllIIlllI[NBTBase.lIllIlllIlIIII[9]];
        nbt_TYPES[NBTBase.lIllIlllIlIIII[10]] = NBTBase.lIllIlllIIlllI[NBTBase.lIllIlllIlIIII[10]];
        nbt_TYPES[NBTBase.lIllIlllIlIIII[11]] = NBTBase.lIllIlllIIlllI[NBTBase.lIllIlllIlIIII[11]];
        nbt_TYPES[NBTBase.lIllIlllIlIIII[12]] = NBTBase.lIllIlllIIlllI[NBTBase.lIllIlllIlIIII[12]];
        NBT_TYPES = nbt_TYPES;
    }
    
    abstract void read(final DataInput p0, final int p1, final NBTSizeTracker p2) throws IOException;
    
    public abstract static class NBTPrimitive extends NBTBase
    {
        public abstract short getShort();
        
        public abstract double getDouble();
        
        public abstract float getFloat();
        
        public abstract byte getByte();
        
        public abstract int getInt();
        
        public abstract long getLong();
    }
}
