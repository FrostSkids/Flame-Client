// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.world.chunk;

import java.nio.charset.StandardCharsets;
import java.util.Base64;

public class NibbleArray
{
    private static final /* synthetic */ String[] llIIllIIIlIllI;
    private static final /* synthetic */ int[] llIIllIIIlIlll;
    private final /* synthetic */ byte[] data;
    
    public int get(final int llllllllllllIlllIIIIlIIIlIlIIlIl, final int llllllllllllIlllIIIIlIIIlIlIIIII, final int llllllllllllIlllIIIIlIIIlIlIIIll) {
        return this.getFromIndex(this.getCoordinateIndex(llllllllllllIlllIIIIlIIIlIlIIlIl, llllllllllllIlllIIIIlIIIlIlIIIII, llllllllllllIlllIIIIlIIIlIlIIIll));
    }
    
    public void setIndex(final int llllllllllllIlllIIIIlIIIIlllIIll, final int llllllllllllIlllIIIIlIIIIlllIIlI) {
        final int llllllllllllIlllIIIIlIIIIlllIlIl = this.getNibbleIndex(llllllllllllIlllIIIIlIIIIlllIIll);
        if (lIIIlllIIllIlIll(this.isLowerNibble(llllllllllllIlllIIIIlIIIIlllIIll) ? 1 : 0)) {
            this.data[llllllllllllIlllIIIIlIIIIlllIlIl] = (byte)((this.data[llllllllllllIlllIIIIlIIIIlllIlIl] & NibbleArray.llIIllIIIlIlll[5]) | (llllllllllllIlllIIIIlIIIIlllIIlI & NibbleArray.llIIllIIIlIlll[4]));
            "".length();
            if (" ".length() == (0x2B ^ 0x2F)) {
                return;
            }
        }
        else {
            this.data[llllllllllllIlllIIIIlIIIIlllIlIl] = (byte)((this.data[llllllllllllIlllIIIIlIIIIlllIlIl] & NibbleArray.llIIllIIIlIlll[4]) | (llllllllllllIlllIIIIlIIIIlllIIlI & NibbleArray.llIIllIIIlIlll[4]) << NibbleArray.llIIllIIIlIlll[3]);
        }
    }
    
    public int getFromIndex(final int llllllllllllIlllIIIIlIIIIllllllI) {
        final int llllllllllllIlllIIIIlIIIlIIIIIII = this.getNibbleIndex(llllllllllllIlllIIIIlIIIIllllllI);
        int n;
        if (lIIIlllIIllIlIll(this.isLowerNibble(llllllllllllIlllIIIIlIIIIllllllI) ? 1 : 0)) {
            n = (this.data[llllllllllllIlllIIIIlIIIlIIIIIII] & NibbleArray.llIIllIIIlIlll[4]);
            "".length();
            if (" ".length() >= "  ".length()) {
                return (0x4B ^ 0x2A ^ (0x44 ^ 0x35)) & (39 + 164 - 79 + 57 ^ 49 + 72 - 97 + 141 ^ -" ".length());
            }
        }
        else {
            n = (this.data[llllllllllllIlllIIIIlIIIlIIIIIII] >> NibbleArray.llIIllIIIlIlll[3] & NibbleArray.llIIllIIIlIlll[4]);
        }
        return n;
    }
    
    private static String lIIIlllIIllIIlll(String llllllllllllIlllIIIIlIIIIlIlIllI, final String llllllllllllIlllIIIIlIIIIlIllIlI) {
        llllllllllllIlllIIIIlIIIIlIlIllI = new String(Base64.getDecoder().decode(llllllllllllIlllIIIIlIIIIlIlIllI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder llllllllllllIlllIIIIlIIIIlIllIIl = new StringBuilder();
        final char[] llllllllllllIlllIIIIlIIIIlIllIII = llllllllllllIlllIIIIlIIIIlIllIlI.toCharArray();
        int llllllllllllIlllIIIIlIIIIlIlIlll = NibbleArray.llIIllIIIlIlll[1];
        final char llllllllllllIlllIIIIlIIIIlIlIIIl = (Object)llllllllllllIlllIIIIlIIIIlIlIllI.toCharArray();
        final boolean llllllllllllIlllIIIIlIIIIlIlIIII = llllllllllllIlllIIIIlIIIIlIlIIIl.length != 0;
        String llllllllllllIlllIIIIlIIIIlIIllll = (String)NibbleArray.llIIllIIIlIlll[1];
        while (lIIIlllIIllIllIl((int)llllllllllllIlllIIIIlIIIIlIIllll, llllllllllllIlllIIIIlIIIIlIlIIII ? 1 : 0)) {
            final char llllllllllllIlllIIIIlIIIIlIlllII = llllllllllllIlllIIIIlIIIIlIlIIIl[llllllllllllIlllIIIIlIIIIlIIllll];
            llllllllllllIlllIIIIlIIIIlIllIIl.append((char)(llllllllllllIlllIIIIlIIIIlIlllII ^ llllllllllllIlllIIIIlIIIIlIllIII[llllllllllllIlllIIIIlIIIIlIlIlll % llllllllllllIlllIIIIlIIIIlIllIII.length]));
            "".length();
            ++llllllllllllIlllIIIIlIIIIlIlIlll;
            ++llllllllllllIlllIIIIlIIIIlIIllll;
            "".length();
            if (-(0x27 ^ 0x23) >= 0) {
                return null;
            }
        }
        return String.valueOf(llllllllllllIlllIIIIlIIIIlIllIIl);
    }
    
    private int getCoordinateIndex(final int llllllllllllIlllIIIIlIIIlIIIlIII, final int llllllllllllIlllIIIIlIIIlIIIlIlI, final int llllllllllllIlllIIIIlIIIlIIIIllI) {
        return llllllllllllIlllIIIIlIIIlIIIlIlI << NibbleArray.llIIllIIIlIlll[2] | llllllllllllIlllIIIIlIIIlIIIIllI << NibbleArray.llIIllIIIlIlll[3] | llllllllllllIlllIIIIlIIIlIIIlIII;
    }
    
    private static boolean lIIIlllIIllIlIll(final int llllllllllllIlllIIIIlIIIIlIIlIII) {
        return llllllllllllIlllIIIIlIIIIlIIlIII != 0;
    }
    
    private static boolean lIIIlllIIllIllIl(final int llllllllllllIlllIIIIlIIIIlIIlIll, final int llllllllllllIlllIIIIlIIIIlIIlIlI) {
        return llllllllllllIlllIIIIlIIIIlIIlIll < llllllllllllIlllIIIIlIIIIlIIlIlI;
    }
    
    public void set(final int llllllllllllIlllIIIIlIIIlIIlIIll, final int llllllllllllIlllIIIIlIIIlIIlIlll, final int llllllllllllIlllIIIIlIIIlIIlIllI, final int llllllllllllIlllIIIIlIIIlIIlIlIl) {
        this.setIndex(this.getCoordinateIndex(llllllllllllIlllIIIIlIIIlIIlIIll, llllllllllllIlllIIIIlIIIlIIlIlll, llllllllllllIlllIIIIlIIIlIIlIllI), llllllllllllIlllIIIIlIIIlIIlIlIl);
    }
    
    public NibbleArray() {
        this.data = new byte[NibbleArray.llIIllIIIlIlll[0]];
    }
    
    static {
        lIIIlllIIllIlIIl();
        lIIIlllIIllIlIII();
    }
    
    public byte[] getData() {
        return this.data;
    }
    
    private static void lIIIlllIIllIlIII() {
        (llIIllIIIlIllI = new String[NibbleArray.llIIllIIIlIlll[6]])[NibbleArray.llIIllIIIlIlll[1]] = lIIIlllIIllIIlll("IQA0OxssASM3HAcpMycRGxthJhgNHS0xUAANYWdAVlBhNwkWDTJ1Hg0ce3U=", "bhAUp");
    }
    
    private static void lIIIlllIIllIlIIl() {
        (llIIllIIIlIlll = new int[7])[0] = (0xFFFFAB70 & 0x5C8F);
        NibbleArray.llIIllIIIlIlll[1] = ((0x19 ^ 0x69 ^ (0xE4 ^ 0xB3)) & (65 + 98 - 37 + 34 ^ 11 + 102 - 62 + 84 ^ -" ".length()));
        NibbleArray.llIIllIIIlIlll[2] = (0x52 ^ 0x5A);
        NibbleArray.llIIllIIIlIlll[3] = (0x6D ^ 0x69);
        NibbleArray.llIIllIIIlIlll[4] = (0x8F ^ 0x80);
        NibbleArray.llIIllIIIlIlll[5] = 157 + 238 - 195 + 40;
        NibbleArray.llIIllIIIlIlll[6] = " ".length();
    }
    
    public NibbleArray(final byte[] llllllllllllIlllIIIIlIIIlIlIllIl) {
        this.data = llllllllllllIlllIIIIlIIIlIlIllIl;
        if (lIIIlllIIllIlIlI(llllllllllllIlllIIIIlIIIlIlIllIl.length, NibbleArray.llIIllIIIlIlll[0])) {
            throw new IllegalArgumentException(String.valueOf(new StringBuilder(NibbleArray.llIIllIIIlIllI[NibbleArray.llIIllIIIlIlll[1]]).append(llllllllllllIlllIIIIlIIIlIlIllIl.length)));
        }
    }
    
    private boolean isLowerNibble(final int llllllllllllIlllIIIIlIIIIllIlllI) {
        if (lIIIlllIIllIllII(llllllllllllIlllIIIIlIIIIllIlllI & NibbleArray.llIIllIIIlIlll[6])) {
            return NibbleArray.llIIllIIIlIlll[6] != 0;
        }
        return NibbleArray.llIIllIIIlIlll[1] != 0;
    }
    
    private static boolean lIIIlllIIllIlIlI(final int llllllllllllIlllIIIIlIIIIlIIIIll, final int llllllllllllIlllIIIIlIIIIlIIIIlI) {
        return llllllllllllIlllIIIIlIIIIlIIIIll != llllllllllllIlllIIIIlIIIIlIIIIlI;
    }
    
    private int getNibbleIndex(final int llllllllllllIlllIIIIlIIIIllIlIlI) {
        return llllllllllllIlllIIIIlIIIIllIlIlI >> NibbleArray.llIIllIIIlIlll[6];
    }
    
    private static boolean lIIIlllIIllIllII(final int llllllllllllIlllIIIIlIIIIlIIIllI) {
        return llllllllllllIlllIIIIlIIIIlIIIllI == 0;
    }
}
