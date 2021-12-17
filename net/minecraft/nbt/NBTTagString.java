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

public class NBTTagString extends NBTBase
{
    private static final /* synthetic */ int[] llIIIIIIIIIlIl;
    private /* synthetic */ String data;
    private static final /* synthetic */ String[] llIIIIIIIIIIIl;
    
    @Override
    public boolean equals(final Object llllllllllllIllllIIIIllIIllllIll) {
        if (lIIIIllIlIIIlIll(super.equals(llllllllllllIllllIIIIllIIllllIll) ? 1 : 0)) {
            return NBTTagString.llIIIIIIIIIlIl[0] != 0;
        }
        final NBTTagString llllllllllllIllllIIIIllIIllllIlI = (NBTTagString)llllllllllllIllllIIIIllIIllllIll;
        if ((!lIIIIllIlIIIlIlI(this.data) || lIIIIllIlIIIllII(llllllllllllIllllIIIIllIIllllIlI.data)) && (!lIIIIllIlIIIllII(this.data) || lIIIIllIlIIIlIll(this.data.equals(llllllllllllIllllIIIIllIIllllIlI.data) ? 1 : 0))) {
            return NBTTagString.llIIIIIIIIIlIl[0] != 0;
        }
        return NBTTagString.llIIIIIIIIIlIl[1] != 0;
    }
    
    @Override
    public boolean hasNoTags() {
        return this.data.isEmpty();
    }
    
    private static boolean lIIIIllIlIIIlIlI(final Object llllllllllllIllllIIIIllIIIllIlll) {
        return llllllllllllIllllIIIIllIIIllIlll == null;
    }
    
    @Override
    public NBTBase copy() {
        return new NBTTagString(this.data);
    }
    
    private static String lIIIIllIIlllllIl(final String llllllllllllIllllIIIIllIIlIIllll, final String llllllllllllIllllIIIIllIIlIIlllI) {
        try {
            final SecretKeySpec llllllllllllIllllIIIIllIIlIlIlII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIllllIIIIllIIlIIlllI.getBytes(StandardCharsets.UTF_8)), NBTTagString.llIIIIIIIIIlIl[3]), "DES");
            final Cipher llllllllllllIllllIIIIllIIlIlIIll = Cipher.getInstance("DES");
            llllllllllllIllllIIIIllIIlIlIIll.init(NBTTagString.llIIIIIIIIIlIl[4], llllllllllllIllllIIIIllIIlIlIlII);
            return new String(llllllllllllIllllIIIIllIIlIlIIll.doFinal(Base64.getDecoder().decode(llllllllllllIllllIIIIllIIlIIllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIllllIIIIllIIlIlIIlI) {
            llllllllllllIllllIIIIllIIlIlIIlI.printStackTrace();
            return null;
        }
    }
    
    @Override
    public byte getId() {
        return (byte)NBTTagString.llIIIIIIIIIlIl[3];
    }
    
    public NBTTagString() {
        this.data = NBTTagString.llIIIIIIIIIIIl[NBTTagString.llIIIIIIIIIlIl[0]];
    }
    
    @Override
    public int hashCode() {
        return super.hashCode() ^ this.data.hashCode();
    }
    
    @Override
    void write(final DataOutput llllllllllllIllllIIIIllIlIIlIllI) throws IOException {
        llllllllllllIllllIIIIllIlIIlIllI.writeUTF(this.data);
    }
    
    private static boolean lIIIIllIlIIIllIl(final int llllllllllllIllllIIIIllIIIllllII, final int llllllllllllIllllIIIIllIIIlllIll) {
        return llllllllllllIllllIIIIllIIIllllII < llllllllllllIllllIIIIllIIIlllIll;
    }
    
    private static void lIIIIllIlIIIlIIl() {
        (llIIIIIIIIIlIl = new int[9])[0] = ((199 + 120 - 275 + 157 ^ 100 + 13 - 104 + 130) & (113 + 40 - 134 + 116 ^ 177 + 11 - 74 + 83 ^ -" ".length()));
        NBTTagString.llIIIIIIIIIlIl[1] = " ".length();
        NBTTagString.llIIIIIIIIIlIl[2] = (0x17 ^ 0x3F ^ (0x9E ^ 0xA6));
        NBTTagString.llIIIIIIIIIlIl[3] = (0xBF ^ 0xB7);
        NBTTagString.llIIIIIIIIIlIl[4] = "  ".length();
        NBTTagString.llIIIIIIIIIlIl[5] = "   ".length();
        NBTTagString.llIIIIIIIIIlIl[6] = ("   ".length() ^ (0x9 ^ 0xE));
        NBTTagString.llIIIIIIIIIlIl[7] = (0x3 ^ 0x6D ^ (0x72 ^ 0x19));
        NBTTagString.llIIIIIIIIIlIl[8] = (0x89 ^ 0x8F);
    }
    
    public String getString() {
        return this.data;
    }
    
    @Override
    void read(final DataInput llllllllllllIllllIIIIllIlIIIlIll, final int llllllllllllIllllIIIIllIlIIIlllI, final NBTSizeTracker llllllllllllIllllIIIIllIlIIIlIlI) throws IOException {
        llllllllllllIllllIIIIllIlIIIlIlI.read(288L);
        this.data = llllllllllllIllllIIIIllIlIIIlIll.readUTF();
        llllllllllllIllllIIIIllIlIIIlIlI.read(NBTTagString.llIIIIIIIIIlIl[2] * this.data.length());
    }
    
    private static boolean lIIIIllIlIIIllII(final Object llllllllllllIllllIIIIllIIIlllIIl) {
        return llllllllllllIllllIIIIllIIIlllIIl != null;
    }
    
    static {
        lIIIIllIlIIIlIIl();
        lIIIIllIIlllllll();
    }
    
    public NBTTagString(final String llllllllllllIllllIIIIllIlIIlllII) {
        this.data = llllllllllllIllllIIIIllIlIIlllII;
        if (lIIIIllIlIIIlIlI(llllllllllllIllllIIIIllIlIIlllII)) {
            throw new IllegalArgumentException(NBTTagString.llIIIIIIIIIIIl[NBTTagString.llIIIIIIIIIlIl[1]]);
        }
    }
    
    private static String lIIIIllIIllllllI(String llllllllllllIllllIIIIllIIllIIIIl, final String llllllllllllIllllIIIIllIIllIIlIl) {
        llllllllllllIllllIIIIllIIllIIIIl = new String(Base64.getDecoder().decode(llllllllllllIllllIIIIllIIllIIIIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder llllllllllllIllllIIIIllIIllIIlII = new StringBuilder();
        final char[] llllllllllllIllllIIIIllIIllIIIll = llllllllllllIllllIIIIllIIllIIlIl.toCharArray();
        int llllllllllllIllllIIIIllIIllIIIlI = NBTTagString.llIIIIIIIIIlIl[0];
        final Exception llllllllllllIllllIIIIllIIlIlllII = (Object)llllllllllllIllllIIIIllIIllIIIIl.toCharArray();
        final byte llllllllllllIllllIIIIllIIlIllIll = (byte)llllllllllllIllllIIIIllIIlIlllII.length;
        char llllllllllllIllllIIIIllIIlIllIlI = (char)NBTTagString.llIIIIIIIIIlIl[0];
        while (lIIIIllIlIIIllIl(llllllllllllIllllIIIIllIIlIllIlI, llllllllllllIllllIIIIllIIlIllIll)) {
            final char llllllllllllIllllIIIIllIIllIIlll = llllllllllllIllllIIIIllIIlIlllII[llllllllllllIllllIIIIllIIlIllIlI];
            llllllllllllIllllIIIIllIIllIIlII.append((char)(llllllllllllIllllIIIIllIIllIIlll ^ llllllllllllIllllIIIIllIIllIIIll[llllllllllllIllllIIIIllIIllIIIlI % llllllllllllIllllIIIIllIIllIIIll.length]));
            "".length();
            ++llllllllllllIllllIIIIllIIllIIIlI;
            ++llllllllllllIllllIIIIllIIlIllIlI;
            "".length();
            if (((0x70 ^ 0x6A ^ (0x99 ^ 0x85)) & (165 + 26 - 20 + 4 ^ 141 + 161 - 273 + 140 ^ -" ".length())) == (0x6D ^ 0x5A ^ (0x72 ^ 0x41))) {
                return null;
            }
        }
        return String.valueOf(llllllllllllIllllIIIIllIIllIIlII);
    }
    
    private static void lIIIIllIIlllllll() {
        (llIIIIIIIIIIIl = new String[NBTTagString.llIIIIIIIIIlIl[8]])[NBTTagString.llIIIIIIIIIlIl[0]] = lIIIIllIIlllllII("jXaqRoo1918=", "BbqQu");
        NBTTagString.llIIIIIIIIIIIl[NBTTagString.llIIIIIIIIIlIl[1]] = lIIIIllIIlllllII("Y6MulZHk+o5cUjsFe4YGZJUZpINgx2W0Xc5NZ7a2m/Q=", "mVtNx");
        NBTTagString.llIIIIIIIIIIIl[NBTTagString.llIIIIIIIIIlIl[4]] = lIIIIllIIlllllIl("XZf1bmpIxSI=", "BNdYy");
        NBTTagString.llIIIIIIIIIIIl[NBTTagString.llIIIIIIIIIlIl[5]] = lIIIIllIIlllllIl("+lh4vtjxgVQ=", "tZZWi");
        NBTTagString.llIIIIIIIIIIIl[NBTTagString.llIIIIIIIIIlIl[6]] = lIIIIllIIllllllI("MWM=", "mAuDl");
        NBTTagString.llIIIIIIIIIIIl[NBTTagString.llIIIIIIIIIlIl[7]] = lIIIIllIIlllllII("mq0eS5EwfEI=", "kmonL");
    }
    
    private static String lIIIIllIIlllllII(final String llllllllllllIllllIIIIllIIlIIIIlI, final String llllllllllllIllllIIIIllIIlIIIIIl) {
        try {
            final SecretKeySpec llllllllllllIllllIIIIllIIlIIIlll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIllllIIIIllIIlIIIIIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher llllllllllllIllllIIIIllIIlIIIllI = Cipher.getInstance("Blowfish");
            llllllllllllIllllIIIIllIIlIIIllI.init(NBTTagString.llIIIIIIIIIlIl[4], llllllllllllIllllIIIIllIIlIIIlll);
            return new String(llllllllllllIllllIIIIllIIlIIIllI.doFinal(Base64.getDecoder().decode(llllllllllllIllllIIIIllIIlIIIIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIllllIIIIllIIlIIIlIl) {
            llllllllllllIllllIIIIllIIlIIIlIl.printStackTrace();
            return null;
        }
    }
    
    private static boolean lIIIIllIlIIIlIll(final int llllllllllllIllllIIIIllIIIllIlIl) {
        return llllllllllllIllllIIIIllIIIllIlIl == 0;
    }
    
    @Override
    public String toString() {
        return String.valueOf(new StringBuilder(NBTTagString.llIIIIIIIIIIIl[NBTTagString.llIIIIIIIIIlIl[4]]).append(this.data.replace(NBTTagString.llIIIIIIIIIIIl[NBTTagString.llIIIIIIIIIlIl[5]], NBTTagString.llIIIIIIIIIIIl[NBTTagString.llIIIIIIIIIlIl[6]])).append(NBTTagString.llIIIIIIIIIIIl[NBTTagString.llIIIIIIIIIlIl[7]]));
    }
}
