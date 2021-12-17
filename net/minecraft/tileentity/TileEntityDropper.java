// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.tileentity;

import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;

public class TileEntityDropper extends TileEntityDispenser
{
    private static final /* synthetic */ String[] lIlIlIIlIlIlIl;
    private static final /* synthetic */ int[] lIlIlIlIlIllIl;
    
    private static String lllIllIIIlllIll(final String lllllllllllllIIIlIIIIIllllIIllII, final String lllllllllllllIIIlIIIIIllllIIlIll) {
        try {
            final SecretKeySpec lllllllllllllIIIlIIIIIllllIlIIIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIIIlIIIIIllllIIlIll.getBytes(StandardCharsets.UTF_8)), TileEntityDropper.lIlIlIlIlIllIl[3]), "DES");
            final Cipher lllllllllllllIIIlIIIIIllllIlIIII = Cipher.getInstance("DES");
            lllllllllllllIIIlIIIIIllllIlIIII.init(TileEntityDropper.lIlIlIlIlIllIl[2], lllllllllllllIIIlIIIIIllllIlIIIl);
            return new String(lllllllllllllIIIlIIIIIllllIlIIII.doFinal(Base64.getDecoder().decode(lllllllllllllIIIlIIIIIllllIIllII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIIlIIIIIllllIIllll) {
            lllllllllllllIIIlIIIIIllllIIllll.printStackTrace();
            return null;
        }
    }
    
    private static void lllIllIIIllllII() {
        (lIlIlIIlIlIlIl = new String[TileEntityDropper.lIlIlIlIlIllIl[2]])[TileEntityDropper.lIlIlIlIlIllIl[0]] = lllIllIIIlllIlI("gaGJK+/tIsy/g/MIjLXPC3RYqGChfcld", "gIePg");
        TileEntityDropper.lIlIlIIlIlIlIl[TileEntityDropper.lIlIlIlIlIllIl[1]] = lllIllIIIlllIll("y7yPn7ZmNUwTYyajuZA6H82RmPke3/cp", "CNlbc");
    }
    
    @Override
    public String getName() {
        String customName;
        if (lllIlllIlIIIlIl(this.hasCustomName() ? 1 : 0)) {
            customName = this.customName;
            "".length();
            if ("   ".length() == 0) {
                return null;
            }
        }
        else {
            customName = TileEntityDropper.lIlIlIIlIlIlIl[TileEntityDropper.lIlIlIlIlIllIl[0]];
        }
        return customName;
    }
    
    @Override
    public String getGuiID() {
        return TileEntityDropper.lIlIlIIlIlIlIl[TileEntityDropper.lIlIlIlIlIllIl[1]];
    }
    
    private static void lllIlllIlIIIlII() {
        (lIlIlIlIlIllIl = new int[4])[0] = ((36 + 73 + 44 + 74 ^ 40 + 126 - 82 + 82) & (91 + 5 - 43 + 76 ^ 91 + 173 - 157 + 89 ^ -" ".length()));
        TileEntityDropper.lIlIlIlIlIllIl[1] = " ".length();
        TileEntityDropper.lIlIlIlIlIllIl[2] = "  ".length();
        TileEntityDropper.lIlIlIlIlIllIl[3] = (0xE ^ 0x6);
    }
    
    private static String lllIllIIIlllIlI(final String lllllllllllllIIIlIIIIIllllIllIll, final String lllllllllllllIIIlIIIIIllllIllIII) {
        try {
            final SecretKeySpec lllllllllllllIIIlIIIIIllllIllllI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIIIlIIIIIllllIllIII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lllllllllllllIIIlIIIIIllllIlllIl = Cipher.getInstance("Blowfish");
            lllllllllllllIIIlIIIIIllllIlllIl.init(TileEntityDropper.lIlIlIlIlIllIl[2], lllllllllllllIIIlIIIIIllllIllllI);
            return new String(lllllllllllllIIIlIIIIIllllIlllIl.doFinal(Base64.getDecoder().decode(lllllllllllllIIIlIIIIIllllIllIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIIlIIIIIllllIlllII) {
            lllllllllllllIIIlIIIIIllllIlllII.printStackTrace();
            return null;
        }
    }
    
    private static boolean lllIlllIlIIIlIl(final int lllllllllllllIIIlIIIIIllllIIIlll) {
        return lllllllllllllIIIlIIIIIllllIIIlll != 0;
    }
    
    static {
        lllIlllIlIIIlII();
        lllIllIIIllllII();
    }
}
