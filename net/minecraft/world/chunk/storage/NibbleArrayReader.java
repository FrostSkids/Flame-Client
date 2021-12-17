// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.world.chunk.storage;

public class NibbleArrayReader
{
    private static final /* synthetic */ int[] lIlIlllllllIIl;
    public final /* synthetic */ byte[] data;
    private final /* synthetic */ int depthBits;
    private final /* synthetic */ int depthBitsPlusFour;
    
    private static void llllIlIllIIIlll() {
        (lIlIlllllllIIl = new int[3])[0] = (0x15 ^ 0x11);
        NibbleArrayReader.lIlIlllllllIIl[1] = " ".length();
        NibbleArrayReader.lIlIlllllllIIl[2] = (0x7C ^ 0x73);
    }
    
    private static boolean llllIlIllIIlIII(final int lllllllllllllIIIIlIIlIllIIlllllI) {
        return lllllllllllllIIIIlIIlIllIIlllllI == 0;
    }
    
    public int get(final int lllllllllllllIIIIlIIlIllIlIIllII, final int lllllllllllllIIIIlIIlIllIlIIlIll, final int lllllllllllllIIIIlIIlIllIlIIIIll) {
        final int lllllllllllllIIIIlIIlIllIlIIlIIl = lllllllllllllIIIIlIIlIllIlIIllII << this.depthBitsPlusFour | lllllllllllllIIIIlIIlIllIlIIIIll << this.depthBits | lllllllllllllIIIIlIIlIllIlIIlIll;
        final int lllllllllllllIIIIlIIlIllIlIIlIII = lllllllllllllIIIIlIIlIllIlIIlIIl >> NibbleArrayReader.lIlIlllllllIIl[1];
        final int lllllllllllllIIIIlIIlIllIlIIIlll = lllllllllllllIIIIlIIlIllIlIIlIIl & NibbleArrayReader.lIlIlllllllIIl[1];
        int n;
        if (llllIlIllIIlIII(lllllllllllllIIIIlIIlIllIlIIIlll)) {
            n = (this.data[lllllllllllllIIIIlIIlIllIlIIlIII] & NibbleArrayReader.lIlIlllllllIIl[2]);
            "".length();
            if (null != null) {
                return (0xA9 ^ 0x80) & ~(0x51 ^ 0x78);
            }
        }
        else {
            n = (this.data[lllllllllllllIIIIlIIlIllIlIIlIII] >> NibbleArrayReader.lIlIlllllllIIl[0] & NibbleArrayReader.lIlIlllllllIIl[2]);
        }
        return n;
    }
    
    static {
        llllIlIllIIIlll();
    }
    
    public NibbleArrayReader(final byte[] lllllllllllllIIIIlIIlIllIlIlIllI, final int lllllllllllllIIIIlIIlIllIlIlIlIl) {
        this.data = lllllllllllllIIIIlIIlIllIlIlIllI;
        this.depthBits = lllllllllllllIIIIlIIlIllIlIlIlIl;
        this.depthBitsPlusFour = lllllllllllllIIIIlIIlIllIlIlIlIl + NibbleArrayReader.lIlIlllllllIIl[0];
    }
}
