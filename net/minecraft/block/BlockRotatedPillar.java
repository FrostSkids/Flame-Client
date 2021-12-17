// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.block;

import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import net.minecraft.util.EnumFacing;
import net.minecraft.block.properties.PropertyEnum;

public abstract class BlockRotatedPillar extends Block
{
    private static final /* synthetic */ String[] lIIIlllllllIlI;
    private static final /* synthetic */ int[] lIIIlllllllIll;
    
    private static String llIIlIIIllIIIlI(final String lllllllllllllIIllllIIIIIIIlIlllI, final String lllllllllllllIIllllIIIIIIIlIllIl) {
        try {
            final SecretKeySpec lllllllllllllIIllllIIIIIIIllIIIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIIllllIIIIIIIlIllIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lllllllllllllIIllllIIIIIIIllIIII = Cipher.getInstance("Blowfish");
            lllllllllllllIIllllIIIIIIIllIIII.init(BlockRotatedPillar.lIIIlllllllIll[2], lllllllllllllIIllllIIIIIIIllIIIl);
            return new String(lllllllllllllIIllllIIIIIIIllIIII.doFinal(Base64.getDecoder().decode(lllllllllllllIIllllIIIIIIIlIlllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIllllIIIIIIIlIllll) {
            lllllllllllllIIllllIIIIIIIlIllll.printStackTrace();
            return null;
        }
    }
    
    private static void llIIlIIIllIIIll() {
        (lIIIlllllllIlI = new String[BlockRotatedPillar.lIIIlllllllIll[1]])[BlockRotatedPillar.lIIIlllllllIll[0]] = llIIlIIIllIIIlI("la+v98G0rBg=", "ilZiY");
    }
    
    protected BlockRotatedPillar(final Material lllllllllllllIIllllIIIIIIIlllIlI, final MapColor lllllllllllllIIllllIIIIIIIllIllI) {
        super(lllllllllllllIIllllIIIIIIIlllIlI, lllllllllllllIIllllIIIIIIIllIllI);
    }
    
    private static void llIIlIIIllIIlIl() {
        (lIIIlllllllIll = new int[3])[0] = ((0x70 ^ 0x60 ^ (0x13 ^ 0x43)) & (5 + 33 - 22 + 233 ^ 82 + 40 + 62 + 1 ^ -" ".length()));
        BlockRotatedPillar.lIIIlllllllIll[1] = " ".length();
        BlockRotatedPillar.lIIIlllllllIll[2] = "  ".length();
    }
    
    protected BlockRotatedPillar(final Material lllllllllllllIIllllIIIIIIIllllll) {
        super(lllllllllllllIIllllIIIIIIIllllll, lllllllllllllIIllllIIIIIIIllllll.getMaterialMapColor());
    }
    
    static {
        llIIlIIIllIIlIl();
        llIIlIIIllIIIll();
        AXIS = PropertyEnum.create(BlockRotatedPillar.lIIIlllllllIlI[BlockRotatedPillar.lIIIlllllllIll[0]], EnumFacing.Axis.class);
    }
}
