// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.block;

import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import com.google.common.base.Predicate;
import net.minecraft.util.EnumFacing;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.PropertyDirection;

public abstract class BlockDirectional extends Block
{
    private static final /* synthetic */ String[] llIIlIIIIllIIl;
    private static final /* synthetic */ int[] llIIlIIIIlllII;
    
    private static void lIIIlIlllIllIIIl() {
        (llIIlIIIIllIIl = new String[BlockDirectional.llIIlIIIIlllII[1]])[BlockDirectional.llIIlIIIIlllII[0]] = lIIIlIlllIllIIII("M4CrGn5J92c=", "geYhA");
    }
    
    protected BlockDirectional(final Material llllllllllllIlllIIllIIllIIlIlIlI, final MapColor llllllllllllIlllIIllIIllIIlIllII) {
        super(llllllllllllIlllIIllIIllIIlIlIlI, llllllllllllIlllIIllIIllIIlIllII);
    }
    
    private static void lIIIlIlllIllIlIl() {
        (llIIlIIIIlllII = new int[4])[0] = ((0x68 ^ 0x73) & ~(0xDE ^ 0xC5));
        BlockDirectional.llIIlIIIIlllII[1] = " ".length();
        BlockDirectional.llIIlIIIIlllII[2] = (0xEF ^ 0x83 ^ (0x5D ^ 0x39));
        BlockDirectional.llIIlIIIIlllII[3] = "  ".length();
    }
    
    protected BlockDirectional(final Material llllllllllllIlllIIllIIllIIllIIlI) {
        super(llllllllllllIlllIIllIIllIIllIIlI);
    }
    
    static {
        lIIIlIlllIllIlIl();
        lIIIlIlllIllIIIl();
        FACING = PropertyDirection.create(BlockDirectional.llIIlIIIIllIIl[BlockDirectional.llIIlIIIIlllII[0]], (Predicate<EnumFacing>)EnumFacing.Plane.HORIZONTAL);
    }
    
    private static String lIIIlIlllIllIIII(final String llllllllllllIlllIIllIIllIIIlllll, final String llllllllllllIlllIIllIIllIIIllllI) {
        try {
            final SecretKeySpec llllllllllllIlllIIllIIllIIlIIlII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIlllIIllIIllIIIllllI.getBytes(StandardCharsets.UTF_8)), BlockDirectional.llIIlIIIIlllII[2]), "DES");
            final Cipher llllllllllllIlllIIllIIllIIlIIIll = Cipher.getInstance("DES");
            llllllllllllIlllIIllIIllIIlIIIll.init(BlockDirectional.llIIlIIIIlllII[3], llllllllllllIlllIIllIIllIIlIIlII);
            return new String(llllllllllllIlllIIllIIllIIlIIIll.doFinal(Base64.getDecoder().decode(llllllllllllIlllIIllIIllIIIlllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIlllIIllIIllIIlIIIlI) {
            llllllllllllIlllIIllIIllIIlIIIlI.printStackTrace();
            return null;
        }
    }
}
