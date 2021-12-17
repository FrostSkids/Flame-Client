// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.world.gen;

import java.util.Arrays;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import net.minecraft.util.ResourceLocation;
import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;

public class FlatLayerInfo
{
    private /* synthetic */ int layerCount;
    private /* synthetic */ int layerMinimumY;
    private static final /* synthetic */ int[] lIlIIIIIlIlIlI;
    private final /* synthetic */ int field_175902_a;
    private static final /* synthetic */ String[] lIlIIIIIlIlIII;
    private /* synthetic */ IBlockState field_175901_b;
    
    private static boolean lllIIIIIlIlIIll(final int lllllllllllllIIlIIIIllllIllIIlII, final int lllllllllllllIIlIIIIllllIllIIIll) {
        return lllllllllllllIIlIIIIllllIllIIlII >= lllllllllllllIIlIIIIllllIllIIIll;
    }
    
    private static boolean lllIIIIIlIlIlIl(final int lllllllllllllIIlIIIIllllIllIIIII, final int lllllllllllllIIlIIIIllllIlIlllll) {
        return lllllllllllllIIlIIIIllllIllIIIII > lllllllllllllIIlIIIIllllIlIlllll;
    }
    
    private Block func_151536_b() {
        return this.field_175901_b.getBlock();
    }
    
    private static boolean lllIIIIIlIlIlII(final Object lllllllllllllIIlIIIIllllIlIlllIl) {
        return lllllllllllllIIlIIIIllllIlIlllIl == null;
    }
    
    public void setMinY(final int lllllllllllllIIlIIIIlllllIIIlllI) {
        this.layerMinimumY = lllllllllllllIIlIIIIlllllIIIlllI;
    }
    
    public int getMinY() {
        return this.layerMinimumY;
    }
    
    private int getFillBlockMeta() {
        return this.field_175901_b.getBlock().getMetaFromState(this.field_175901_b);
    }
    
    private static void lllIIIIIlIlIIIl() {
        (lIlIIIIIlIlIII = new String[FlatLayerInfo.lIlIIIIIlIlIlI[4]])[FlatLayerInfo.lIlIIIIIlIlIlI[2]] = lllIIIIIlIIIIll("VTPCBixZTDQ=", "VhOix");
        FlatLayerInfo.lIlIIIIIlIlIII[FlatLayerInfo.lIlIIIIIlIlIlI[1]] = lllIIIIIlIIIIll("gntlw+QMTZI=", "mYdVT");
        FlatLayerInfo.lIlIIIIIlIlIII[FlatLayerInfo.lIlIIIIIlIlIlI[3]] = lllIIIIIlIIIIll("FVWegpZMi8g=", "SAaYG");
        FlatLayerInfo.lIlIIIIIlIlIII[FlatLayerInfo.lIlIIIIIlIlIlI[0]] = lllIIIIIlIlIIII("svZSpC6fXuI=", "wkDCQ");
    }
    
    @Override
    public String toString() {
        String lllllllllllllIIlIIIIlllllIIIIllI;
        if (lllIIIIIlIlIIll(this.field_175902_a, FlatLayerInfo.lIlIIIIIlIlIlI[0])) {
            final ResourceLocation lllllllllllllIIlIIIIlllllIIIIlIl = Block.blockRegistry.getNameForObject(this.func_151536_b());
            String string;
            if (lllIIIIIlIlIlII(lllllllllllllIIlIIIIlllllIIIIlIl)) {
                string = FlatLayerInfo.lIlIIIIIlIlIII[FlatLayerInfo.lIlIIIIIlIlIlI[2]];
                "".length();
                if (-"   ".length() >= 0) {
                    return null;
                }
            }
            else {
                string = lllllllllllllIIlIIIIlllllIIIIlIl.toString();
            }
            String lllllllllllllIIlIIIIlllllIIIIlll = string;
            if (lllIIIIIlIlIlIl(this.layerCount, FlatLayerInfo.lIlIIIIIlIlIlI[1])) {
                lllllllllllllIIlIIIIlllllIIIIlll = String.valueOf(new StringBuilder(String.valueOf(this.layerCount)).append(FlatLayerInfo.lIlIIIIIlIlIII[FlatLayerInfo.lIlIIIIIlIlIlI[1]]).append(lllllllllllllIIlIIIIlllllIIIIlll));
                "".length();
                if ("  ".length() >= "   ".length()) {
                    return null;
                }
            }
        }
        else {
            lllllllllllllIIlIIIIlllllIIIIllI = Integer.toString(Block.getIdFromBlock(this.func_151536_b()));
            if (lllIIIIIlIlIlIl(this.layerCount, FlatLayerInfo.lIlIIIIIlIlIlI[1])) {
                lllllllllllllIIlIIIIlllllIIIIllI = String.valueOf(new StringBuilder(String.valueOf(this.layerCount)).append(FlatLayerInfo.lIlIIIIIlIlIII[FlatLayerInfo.lIlIIIIIlIlIlI[3]]).append(lllllllllllllIIlIIIIlllllIIIIllI));
            }
        }
        final int lllllllllllllIIlIIIIlllllIIIIlII = this.getFillBlockMeta();
        if (lllIIIIIlIlIllI(lllllllllllllIIlIIIIlllllIIIIlII)) {
            lllllllllllllIIlIIIIlllllIIIIllI = String.valueOf(new StringBuilder(String.valueOf(lllllllllllllIIlIIIIlllllIIIIllI)).append(FlatLayerInfo.lIlIIIIIlIlIII[FlatLayerInfo.lIlIIIIIlIlIlI[0]]).append(lllllllllllllIIlIIIIlllllIIIIlII));
        }
        return lllllllllllllIIlIIIIlllllIIIIllI;
    }
    
    private static String lllIIIIIlIlIIII(final String lllllllllllllIIlIIIIllllIlllIlll, final String lllllllllllllIIlIIIIllllIllllIII) {
        try {
            final SecretKeySpec lllllllllllllIIlIIIIllllIlllllII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIIlIIIIllllIllllIII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lllllllllllllIIlIIIIllllIllllIll = Cipher.getInstance("Blowfish");
            lllllllllllllIIlIIIIllllIllllIll.init(FlatLayerInfo.lIlIIIIIlIlIlI[3], lllllllllllllIIlIIIIllllIlllllII);
            return new String(lllllllllllllIIlIIIIllllIllllIll.doFinal(Base64.getDecoder().decode(lllllllllllllIIlIIIIllllIlllIlll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIlIIIIllllIllllIlI) {
            lllllllllllllIIlIIIIllllIllllIlI.printStackTrace();
            return null;
        }
    }
    
    static {
        lllIIIIIlIlIIlI();
        lllIIIIIlIlIIIl();
    }
    
    public int getLayerCount() {
        return this.layerCount;
    }
    
    public FlatLayerInfo(final int lllllllllllllIIlIIIIlllllIlIIlII, final int lllllllllllllIIlIIIIlllllIlIlIII, final Block lllllllllllllIIlIIIIlllllIlIIlll, final int lllllllllllllIIlIIIIlllllIlIIIIl) {
        this(lllllllllllllIIlIIIIlllllIlIIlII, lllllllllllllIIlIIIIlllllIlIlIII, lllllllllllllIIlIIIIlllllIlIIlll);
        this.field_175901_b = lllllllllllllIIlIIIIlllllIlIIlll.getStateFromMeta(lllllllllllllIIlIIIIlllllIlIIIIl);
    }
    
    public FlatLayerInfo(final int lllllllllllllIIlIIIIlllllIllIIlI, final int lllllllllllllIIlIIIIlllllIllIIIl, final Block lllllllllllllIIlIIIIlllllIllIlII) {
        this.layerCount = FlatLayerInfo.lIlIIIIIlIlIlI[1];
        this.field_175902_a = lllllllllllllIIlIIIIlllllIllIIlI;
        this.layerCount = lllllllllllllIIlIIIIlllllIllIIIl;
        this.field_175901_b = lllllllllllllIIlIIIIlllllIllIlII.getDefaultState();
    }
    
    public FlatLayerInfo(final int lllllllllllllIIlIIIIllllllIIIIII, final Block lllllllllllllIIlIIIIlllllIllllII) {
        this(FlatLayerInfo.lIlIIIIIlIlIlI[0], lllllllllllllIIlIIIIllllllIIIIII, lllllllllllllIIlIIIIlllllIllllII);
    }
    
    private static String lllIIIIIlIIIIll(final String lllllllllllllIIlIIIIllllIllIlIlI, final String lllllllllllllIIlIIIIllllIllIlIIl) {
        try {
            final SecretKeySpec lllllllllllllIIlIIIIllllIllIllll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIIlIIIIllllIllIlIIl.getBytes(StandardCharsets.UTF_8)), FlatLayerInfo.lIlIIIIIlIlIlI[5]), "DES");
            final Cipher lllllllllllllIIlIIIIllllIllIlllI = Cipher.getInstance("DES");
            lllllllllllllIIlIIIIllllIllIlllI.init(FlatLayerInfo.lIlIIIIIlIlIlI[3], lllllllllllllIIlIIIIllllIllIllll);
            return new String(lllllllllllllIIlIIIIllllIllIlllI.doFinal(Base64.getDecoder().decode(lllllllllllllIIlIIIIllllIllIlIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIlIIIIllllIllIllIl) {
            lllllllllllllIIlIIIIllllIllIllIl.printStackTrace();
            return null;
        }
    }
    
    private static boolean lllIIIIIlIlIllI(final int lllllllllllllIIlIIIIllllIlIllIll) {
        return lllllllllllllIIlIIIIllllIlIllIll > 0;
    }
    
    private static void lllIIIIIlIlIIlI() {
        (lIlIIIIIlIlIlI = new int[6])[0] = "   ".length();
        FlatLayerInfo.lIlIIIIIlIlIlI[1] = " ".length();
        FlatLayerInfo.lIlIIIIIlIlIlI[2] = ((0x67 ^ 0x6) & ~(0x51 ^ 0x30));
        FlatLayerInfo.lIlIIIIIlIlIlI[3] = "  ".length();
        FlatLayerInfo.lIlIIIIIlIlIlI[4] = (0x43 ^ 0x47);
        FlatLayerInfo.lIlIIIIIlIlIlI[5] = (0x15 ^ 0x1D);
    }
    
    public IBlockState func_175900_c() {
        return this.field_175901_b;
    }
}
