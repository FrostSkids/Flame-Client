// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.nbt;

import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.io.DataInput;
import java.io.IOException;
import java.io.DataOutput;

public class NBTTagEnd extends NBTBase
{
    private static final /* synthetic */ String[] lIIIlIllllIIII;
    private static final /* synthetic */ int[] lIIIlIllllIIll;
    
    @Override
    public String toString() {
        return NBTTagEnd.lIIIlIllllIIII[NBTTagEnd.lIIIlIllllIIll[0]];
    }
    
    private static void llIIIIlIIIlIIII() {
        (lIIIlIllllIIII = new String[NBTTagEnd.lIIIlIllllIIll[1]])[NBTTagEnd.lIIIlIllllIIll[0]] = llIIIIlIIIIllll("NjcV", "syQli");
    }
    
    static {
        llIIIIlIIIllIIl();
        llIIIIlIIIlIIII();
    }
    
    @Override
    public byte getId() {
        return (byte)NBTTagEnd.lIIIlIllllIIll[0];
    }
    
    @Override
    void write(final DataOutput lllllllllllllIlIIIIlIIlIllIllIll) throws IOException {
    }
    
    private static boolean llIIIIlIIIllIlI(final int lllllllllllllIlIIIIlIIlIlIllllIl, final int lllllllllllllIlIIIIlIIlIlIllllII) {
        return lllllllllllllIlIIIIlIIlIlIllllIl < lllllllllllllIlIIIIlIIlIlIllllII;
    }
    
    @Override
    public NBTBase copy() {
        return new NBTTagEnd();
    }
    
    @Override
    void read(final DataInput lllllllllllllIlIIIIlIIlIlllIIIII, final int lllllllllllllIlIIIIlIIlIllIlllll, final NBTSizeTracker lllllllllllllIlIIIIlIIlIllIlllIl) throws IOException {
        lllllllllllllIlIIIIlIIlIllIlllIl.read(64L);
    }
    
    private static void llIIIIlIIIllIIl() {
        (lIIIlIllllIIll = new int[2])[0] = ((0xBB ^ 0xAD) & ~(0x3D ^ 0x2B));
        NBTTagEnd.lIIIlIllllIIll[1] = " ".length();
    }
    
    private static String llIIIIlIIIIllll(String lllllllllllllIlIIIIlIIlIllIIlIII, final String lllllllllllllIlIIIIlIIlIllIIIlll) {
        lllllllllllllIlIIIIlIIlIllIIlIII = (Exception)new String(Base64.getDecoder().decode(((String)lllllllllllllIlIIIIlIIlIllIIlIII).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIlIIIIlIIlIllIIlIll = new StringBuilder();
        final char[] lllllllllllllIlIIIIlIIlIllIIlIlI = lllllllllllllIlIIIIlIIlIllIIIlll.toCharArray();
        int lllllllllllllIlIIIIlIIlIllIIlIIl = NBTTagEnd.lIIIlIllllIIll[0];
        final boolean lllllllllllllIlIIIIlIIlIllIIIIll = (Object)((String)lllllllllllllIlIIIIlIIlIllIIlIII).toCharArray();
        final short lllllllllllllIlIIIIlIIlIllIIIIlI = (short)lllllllllllllIlIIIIlIIlIllIIIIll.length;
        int lllllllllllllIlIIIIlIIlIllIIIIIl = NBTTagEnd.lIIIlIllllIIll[0];
        while (llIIIIlIIIllIlI(lllllllllllllIlIIIIlIIlIllIIIIIl, lllllllllllllIlIIIIlIIlIllIIIIlI)) {
            final char lllllllllllllIlIIIIlIIlIllIIlllI = lllllllllllllIlIIIIlIIlIllIIIIll[lllllllllllllIlIIIIlIIlIllIIIIIl];
            lllllllllllllIlIIIIlIIlIllIIlIll.append((char)(lllllllllllllIlIIIIlIIlIllIIlllI ^ lllllllllllllIlIIIIlIIlIllIIlIlI[lllllllllllllIlIIIIlIIlIllIIlIIl % lllllllllllllIlIIIIlIIlIllIIlIlI.length]));
            "".length();
            ++lllllllllllllIlIIIIlIIlIllIIlIIl;
            ++lllllllllllllIlIIIIlIIlIllIIIIIl;
            "".length();
            if ("   ".length() > "   ".length()) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIlIIIIlIIlIllIIlIll);
    }
}
