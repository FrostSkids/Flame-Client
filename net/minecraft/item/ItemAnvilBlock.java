// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.item;

import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import net.minecraft.block.Block;

public class ItemAnvilBlock extends ItemMultiTexture
{
    private static final /* synthetic */ int[] lIlIIlllllIlll;
    private static final /* synthetic */ String[] lIlIIlllllIllI;
    
    public ItemAnvilBlock(final Block lllllllllllllIIIlIllIlIlIlllIIII) {
        final String[] lllllllllllllIlIlIllIlIlIlIlllIl = new String[ItemAnvilBlock.lIlIIlllllIlll[0]];
        lllllllllllllIlIlIllIlIlIlIlllIl[ItemAnvilBlock.lIlIIlllllIlll[1]] = ItemAnvilBlock.lIlIIlllllIllI[ItemAnvilBlock.lIlIIlllllIlll[1]];
        lllllllllllllIlIlIllIlIlIlIlllIl[ItemAnvilBlock.lIlIIlllllIlll[2]] = ItemAnvilBlock.lIlIIlllllIllI[ItemAnvilBlock.lIlIIlllllIlll[2]];
        lllllllllllllIlIlIllIlIlIlIlllIl[ItemAnvilBlock.lIlIIlllllIlll[3]] = ItemAnvilBlock.lIlIIlllllIllI[ItemAnvilBlock.lIlIIlllllIlll[3]];
        super(lllllllllllllIIIlIllIlIlIlllIIII, lllllllllllllIIIlIllIlIlIlllIIII, lllllllllllllIlIlIllIlIlIlIlllIl);
    }
    
    private static String lllIlIlIIlIIIIl(final String lllllllllllllIIIlIllIlIlIllIIIlI, final String lllllllllllllIIIlIllIlIlIllIIIIl) {
        try {
            final SecretKeySpec lllllllllllllIIIlIllIlIlIllIIlIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIIIlIllIlIlIllIIIIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lllllllllllllIIIlIllIlIlIllIIlII = Cipher.getInstance("Blowfish");
            lllllllllllllIIIlIllIlIlIllIIlII.init(ItemAnvilBlock.lIlIIlllllIlll[3], lllllllllllllIIIlIllIlIlIllIIlIl);
            return new String(lllllllllllllIIIlIllIlIlIllIIlII.doFinal(Base64.getDecoder().decode(lllllllllllllIIIlIllIlIlIllIIIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIIlIllIlIlIllIIIll) {
            lllllllllllllIIIlIllIlIlIllIIIll.printStackTrace();
            return null;
        }
    }
    
    private static void lllIlIlIIlIIIll() {
        (lIlIIlllllIllI = new String[ItemAnvilBlock.lIlIIlllllIlll[0]])[ItemAnvilBlock.lIlIIlllllIlll[1]] = lllIlIlIIlIIIIl("CnT1Uz1EVPU=", "mYbMi");
        ItemAnvilBlock.lIlIIlllllIllI[ItemAnvilBlock.lIlIIlllllIlll[2]] = lllIlIlIIlIIIlI("FgUQHjkRBQA9MAgIHhw1", "eiyyQ");
        ItemAnvilBlock.lIlIIlllllIllI[ItemAnvilBlock.lIlIIlllllIlll[3]] = lllIlIlIIlIIIlI("OzAjLBQsODAyNSk=", "MUQUP");
    }
    
    private static void lllIlIlIIlIIlII() {
        (lIlIIlllllIlll = new int[4])[0] = "   ".length();
        ItemAnvilBlock.lIlIIlllllIlll[1] = ((50 + 70 + 14 + 22 ^ 136 + 142 - 154 + 46) & (16 + 124 + 72 + 35 ^ 102 + 78 - 20 + 33 ^ -" ".length()));
        ItemAnvilBlock.lIlIIlllllIlll[2] = " ".length();
        ItemAnvilBlock.lIlIIlllllIlll[3] = "  ".length();
    }
    
    private static String lllIlIlIIlIIIlI(String lllllllllllllIIIlIllIlIlIlIIllIl, final String lllllllllllllIIIlIllIlIlIlIIllII) {
        lllllllllllllIIIlIllIlIlIlIIllIl = new String(Base64.getDecoder().decode(lllllllllllllIIIlIllIlIlIlIIllIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIIIlIllIlIlIlIlIIII = new StringBuilder();
        final char[] lllllllllllllIIIlIllIlIlIlIIllll = lllllllllllllIIIlIllIlIlIlIIllII.toCharArray();
        int lllllllllllllIIIlIllIlIlIlIIlllI = ItemAnvilBlock.lIlIIlllllIlll[1];
        final long lllllllllllllIIIlIllIlIlIlIIlIII = (Object)lllllllllllllIIIlIllIlIlIlIIllIl.toCharArray();
        final char lllllllllllllIIIlIllIlIlIlIIIlll = (char)lllllllllllllIIIlIllIlIlIlIIlIII.length;
        String lllllllllllllIIIlIllIlIlIlIIIllI = (String)ItemAnvilBlock.lIlIIlllllIlll[1];
        while (lllIlIlIIlIIlIl((int)lllllllllllllIIIlIllIlIlIlIIIllI, lllllllllllllIIIlIllIlIlIlIIIlll)) {
            final char lllllllllllllIIIlIllIlIlIlIlIIll = lllllllllllllIIIlIllIlIlIlIIlIII[lllllllllllllIIIlIllIlIlIlIIIllI];
            lllllllllllllIIIlIllIlIlIlIlIIII.append((char)(lllllllllllllIIIlIllIlIlIlIlIIll ^ lllllllllllllIIIlIllIlIlIlIIllll[lllllllllllllIIIlIllIlIlIlIIlllI % lllllllllllllIIIlIllIlIlIlIIllll.length]));
            "".length();
            ++lllllllllllllIIIlIllIlIlIlIIlllI;
            ++lllllllllllllIIIlIllIlIlIlIIIllI;
            "".length();
            if ("   ".length() < 0) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIIIlIllIlIlIlIlIIII);
    }
    
    static {
        lllIlIlIIlIIlII();
        lllIlIlIIlIIIll();
    }
    
    private static boolean lllIlIlIIlIIlIl(final int lllllllllllllIIIlIllIlIlIlIIIIlI, final int lllllllllllllIIIlIllIlIlIlIIIIIl) {
        return lllllllllllllIIIlIllIlIlIlIIIIlI < lllllllllllllIIIlIllIlIlIlIIIIIl;
    }
    
    @Override
    public int getMetadata(final int lllllllllllllIIIlIllIlIlIllIlIlI) {
        return lllllllllllllIIIlIllIlIlIllIlIlI << ItemAnvilBlock.lIlIIlllllIlll[3];
    }
}
