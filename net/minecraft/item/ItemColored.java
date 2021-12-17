// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.item;

import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import net.minecraft.block.Block;

public class ItemColored extends ItemBlock
{
    private final /* synthetic */ Block coloredBlock;
    private static final /* synthetic */ String[] llllllIllllII;
    private /* synthetic */ String[] subtypeNames;
    private static final /* synthetic */ int[] llllllIllllIl;
    
    @Override
    public int getColorFromItemStack(final ItemStack lllllllllllllIlIlIlIIllIIllIIlIl, final int lllllllllllllIlIlIlIIllIIllIIlII) {
        return this.coloredBlock.getRenderColor(this.coloredBlock.getStateFromMeta(lllllllllllllIlIlIlIIllIIllIIlIl.getMetadata()));
    }
    
    private static boolean lIllIIIIlIIlIlI(final int lllllllllllllIlIlIlIIllIIIllllll, final int lllllllllllllIlIlIlIIllIIIlllllI) {
        return lllllllllllllIlIlIlIIllIIIllllll < lllllllllllllIlIlIlIIllIIIlllllI;
    }
    
    private static boolean lIllIIIIlIIlIII(final Object lllllllllllllIlIlIlIIllIIIllllII) {
        return lllllllllllllIlIlIlIIllIIIllllII == null;
    }
    
    private static void lIllIIIIlIIIllI() {
        (llllllIllllIl = new int[4])[0] = (("   ".length() ^ (0x67 ^ 0x7F)) & (92 + 6 + 25 + 20 ^ 8 + 44 + 93 + 3 ^ -" ".length()));
        ItemColored.llllllIllllIl[1] = " ".length();
        ItemColored.llllllIllllIl[2] = (0x10 ^ 0x18);
        ItemColored.llllllIllllIl[3] = "  ".length();
    }
    
    private static String lIllIIIIlIIIlII(final String lllllllllllllIlIlIlIIllIIlIIIlIl, final String lllllllllllllIlIlIlIIllIIlIIIllI) {
        try {
            final SecretKeySpec lllllllllllllIlIlIlIIllIIlIIlIlI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIlIlIlIIllIIlIIIllI.getBytes(StandardCharsets.UTF_8)), ItemColored.llllllIllllIl[2]), "DES");
            final Cipher lllllllllllllIlIlIlIIllIIlIIlIIl = Cipher.getInstance("DES");
            lllllllllllllIlIlIlIIllIIlIIlIIl.init(ItemColored.llllllIllllIl[3], lllllllllllllIlIlIlIIllIIlIIlIlI);
            return new String(lllllllllllllIlIlIlIIllIIlIIlIIl.doFinal(Base64.getDecoder().decode(lllllllllllllIlIlIlIIllIIlIIIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIlIlIlIIllIIlIIlIII) {
            lllllllllllllIlIlIlIIllIIlIIlIII.printStackTrace();
            return null;
        }
    }
    
    private static boolean lIllIIIIlIIlIIl(final int lllllllllllllIlIlIlIIllIIIlllIII) {
        return lllllllllllllIlIlIlIIllIIIlllIII >= 0;
    }
    
    private static boolean lIllIIIIlIIIlll(final int lllllllllllllIlIlIlIIllIIIlllIlI) {
        return lllllllllllllIlIlIlIIllIIIlllIlI != 0;
    }
    
    public ItemColored setSubtypeNames(final String[] lllllllllllllIlIlIlIIllIIlIllIlI) {
        this.subtypeNames = lllllllllllllIlIlIlIIllIIlIllIlI;
        return this;
    }
    
    private static void lIllIIIIlIIIlIl() {
        (llllllIllllII = new String[ItemColored.llllllIllllIl[1]])[ItemColored.llllllIllllIl[0]] = lIllIIIIlIIIlII("gJo+N/puWgs=", "mmHzE");
    }
    
    @Override
    public String getUnlocalizedName(final ItemStack lllllllllllllIlIlIlIIllIIlIlIIII) {
        if (lIllIIIIlIIlIII(this.subtypeNames)) {
            return super.getUnlocalizedName(lllllllllllllIlIlIlIIllIIlIlIIII);
        }
        final int lllllllllllllIlIlIlIIllIIlIlIIlI = lllllllllllllIlIlIlIIllIIlIlIIII.getMetadata();
        String s;
        if (lIllIIIIlIIlIIl(lllllllllllllIlIlIlIIllIIlIlIIlI) && lIllIIIIlIIlIlI(lllllllllllllIlIlIlIIllIIlIlIIlI, this.subtypeNames.length)) {
            s = String.valueOf(new StringBuilder(String.valueOf(super.getUnlocalizedName(lllllllllllllIlIlIlIIllIIlIlIIII))).append(ItemColored.llllllIllllII[ItemColored.llllllIllllIl[0]]).append(this.subtypeNames[lllllllllllllIlIlIlIIllIIlIlIIlI]));
            "".length();
            if ("  ".length() <= 0) {
                return null;
            }
        }
        else {
            s = super.getUnlocalizedName(lllllllllllllIlIlIlIIllIIlIlIIII);
        }
        return s;
    }
    
    public ItemColored(final Block lllllllllllllIlIlIlIIllIIllIlIlI, final boolean lllllllllllllIlIlIlIIllIIllIlIIl) {
        super(lllllllllllllIlIlIlIIllIIllIlIlI);
        this.coloredBlock = lllllllllllllIlIlIlIIllIIllIlIlI;
        if (lIllIIIIlIIIlll(lllllllllllllIlIlIlIIllIIllIlIIl ? 1 : 0)) {
            this.setMaxDamage(ItemColored.llllllIllllIl[0]);
            "".length();
            this.setHasSubtypes((boolean)(ItemColored.llllllIllllIl[1] != 0));
            "".length();
        }
    }
    
    static {
        lIllIIIIlIIIllI();
        lIllIIIIlIIIlIl();
    }
    
    @Override
    public int getMetadata(final int lllllllllllllIlIlIlIIllIIlIllllI) {
        return lllllllllllllIlIlIlIIllIIlIllllI;
    }
}
