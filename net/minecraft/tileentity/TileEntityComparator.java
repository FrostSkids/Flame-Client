// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.tileentity;

import net.minecraft.nbt.NBTTagCompound;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;

public class TileEntityComparator extends TileEntity
{
    private static final /* synthetic */ String[] lllllIlllIlIl;
    private /* synthetic */ int outputSignal;
    private static final /* synthetic */ int[] lllllllIIllII;
    
    private static void lIlIllllIIllIlI() {
        (lllllIlllIlIl = new String[TileEntityComparator.lllllllIIllII[2]])[TileEntityComparator.lllllllIIllII[0]] = lIlIllllIIllIII("LQ8RJjoWKQwxIQMW", "bzeVO");
        TileEntityComparator.lllllIlllIlIl[TileEntityComparator.lllllllIIllII[1]] = lIlIllllIIllIIl("ewXVZh0nbuC30o0Qtb/2Cw==", "khIIh");
    }
    
    private static String lIlIllllIIllIIl(final String lllllllllllllIlIlIlIIIIIlIIlIlIl, final String lllllllllllllIlIlIlIIIIIlIIlIIlI) {
        try {
            final SecretKeySpec lllllllllllllIlIlIlIIIIIlIIllIII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIlIlIlIIIIIlIIlIIlI.getBytes(StandardCharsets.UTF_8)), TileEntityComparator.lllllllIIllII[3]), "DES");
            final Cipher lllllllllllllIlIlIlIIIIIlIIlIlll = Cipher.getInstance("DES");
            lllllllllllllIlIlIlIIIIIlIIlIlll.init(TileEntityComparator.lllllllIIllII[2], lllllllllllllIlIlIlIIIIIlIIllIII);
            return new String(lllllllllllllIlIlIlIIIIIlIIlIlll.doFinal(Base64.getDecoder().decode(lllllllllllllIlIlIlIIIIIlIIlIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIlIlIlIIIIIlIIlIllI) {
            lllllllllllllIlIlIlIIIIIlIIlIllI.printStackTrace();
            return null;
        }
    }
    
    private static String lIlIllllIIllIII(String lllllllllllllIlIlIlIIIIIlIlIIlIl, final String lllllllllllllIlIlIlIIIIIlIlIlIIl) {
        lllllllllllllIlIlIlIIIIIlIlIIlIl = new String(Base64.getDecoder().decode(lllllllllllllIlIlIlIIIIIlIlIIlIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIlIlIlIIIIIlIlIlIII = new StringBuilder();
        final char[] lllllllllllllIlIlIlIIIIIlIlIIlll = lllllllllllllIlIlIlIIIIIlIlIlIIl.toCharArray();
        int lllllllllllllIlIlIlIIIIIlIlIIllI = TileEntityComparator.lllllllIIllII[0];
        final String lllllllllllllIlIlIlIIIIIlIlIIIII = (Object)lllllllllllllIlIlIlIIIIIlIlIIlIl.toCharArray();
        final float lllllllllllllIlIlIlIIIIIlIIlllll = lllllllllllllIlIlIlIIIIIlIlIIIII.length;
        float lllllllllllllIlIlIlIIIIIlIIllllI = TileEntityComparator.lllllllIIllII[0];
        while (lIllIIIlIIIIlll((int)lllllllllllllIlIlIlIIIIIlIIllllI, (int)lllllllllllllIlIlIlIIIIIlIIlllll)) {
            final char lllllllllllllIlIlIlIIIIIlIlIlIll = lllllllllllllIlIlIlIIIIIlIlIIIII[lllllllllllllIlIlIlIIIIIlIIllllI];
            lllllllllllllIlIlIlIIIIIlIlIlIII.append((char)(lllllllllllllIlIlIlIIIIIlIlIlIll ^ lllllllllllllIlIlIlIIIIIlIlIIlll[lllllllllllllIlIlIlIIIIIlIlIIllI % lllllllllllllIlIlIlIIIIIlIlIIlll.length]));
            "".length();
            ++lllllllllllllIlIlIlIIIIIlIlIIllI;
            ++lllllllllllllIlIlIlIIIIIlIIllllI;
            "".length();
            if (-" ".length() > ((0xF5 ^ 0xB4 ^ (0xAF ^ 0xAA)) & (0x0 ^ 0x39 ^ (0x5D ^ 0x20) ^ -" ".length()))) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIlIlIlIIIIIlIlIlIII);
    }
    
    static {
        lIllIIIlIIIIllI();
        lIlIllllIIllIlI();
    }
    
    @Override
    public void writeToNBT(final NBTTagCompound lllllllllllllIlIlIlIIIIIllIIIllI) {
        super.writeToNBT(lllllllllllllIlIlIlIIIIIllIIIllI);
        lllllllllllllIlIlIlIIIIIllIIIllI.setInteger(TileEntityComparator.lllllIlllIlIl[TileEntityComparator.lllllllIIllII[0]], this.outputSignal);
    }
    
    @Override
    public void readFromNBT(final NBTTagCompound lllllllllllllIlIlIlIIIIIllIIIIII) {
        super.readFromNBT(lllllllllllllIlIlIlIIIIIllIIIIII);
        this.outputSignal = lllllllllllllIlIlIlIIIIIllIIIIII.getInteger(TileEntityComparator.lllllIlllIlIl[TileEntityComparator.lllllllIIllII[1]]);
    }
    
    public int getOutputSignal() {
        return this.outputSignal;
    }
    
    public void setOutputSignal(final int lllllllllllllIlIlIlIIIIIlIllIlll) {
        this.outputSignal = lllllllllllllIlIlIlIIIIIlIllIlll;
    }
    
    private static boolean lIllIIIlIIIIlll(final int lllllllllllllIlIlIlIIIIIlIIIllIl, final int lllllllllllllIlIlIlIIIIIlIIIllII) {
        return lllllllllllllIlIlIlIIIIIlIIIllIl < lllllllllllllIlIlIlIIIIIlIIIllII;
    }
    
    private static void lIllIIIlIIIIllI() {
        (lllllllIIllII = new int[4])[0] = ((0x3F ^ 0x25 ^ (0x57 ^ 0x4)) & (0x66 ^ 0x18 ^ (0xF4 ^ 0xC3) ^ -" ".length()));
        TileEntityComparator.lllllllIIllII[1] = " ".length();
        TileEntityComparator.lllllllIIllII[2] = "  ".length();
        TileEntityComparator.lllllllIIllII[3] = (43 + 107 - 116 + 105 ^ 108 + 10 - 18 + 31);
    }
}
