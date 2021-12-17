// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.block;

import java.util.Iterator;
import java.util.Arrays;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.security.MessageDigest;
import net.minecraft.util.IStringSerializable;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.EnumFacing;
import net.minecraft.creativetab.CreativeTabs;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.BlockPos;
import net.minecraft.world.World;
import net.minecraft.block.properties.PropertyEnum;

public abstract class BlockLog extends BlockRotatedPillar
{
    public static final /* synthetic */ PropertyEnum<EnumAxis> LOG_AXIS;
    private static final /* synthetic */ String[] lIIlIIlIIIllIl;
    private static final /* synthetic */ int[] lIIlIIlIIIlllI;
    
    private static void llIIllIIIIlIlIl() {
        (lIIlIIlIIIlllI = new int[3])[0] = ((0xD6 ^ 0x97) & ~(0xE7 ^ 0xA6));
        BlockLog.lIIlIIlIIIlllI[1] = (0x4E ^ 0x4A);
        BlockLog.lIIlIIlIIIlllI[2] = " ".length();
    }
    
    @Override
    public void breakBlock(final World lllllllllllllIIlllIIIIlIllIlllll, final BlockPos lllllllllllllIIlllIIIIlIlllIIlIl, final IBlockState lllllllllllllIIlllIIIIlIlllIIlII) {
        final int lllllllllllllIIlllIIIIlIlllIIIll = BlockLog.lIIlIIlIIIlllI[1];
        final int lllllllllllllIIlllIIIIlIlllIIIlI = lllllllllllllIIlllIIIIlIlllIIIll + BlockLog.lIIlIIlIIIlllI[2];
        if (llIIllIIIIlIllI(lllllllllllllIIlllIIIIlIllIlllll.isAreaLoaded(lllllllllllllIIlllIIIIlIlllIIlIl.add(-lllllllllllllIIlllIIIIlIlllIIIlI, -lllllllllllllIIlllIIIIlIlllIIIlI, -lllllllllllllIIlllIIIIlIlllIIIlI), lllllllllllllIIlllIIIIlIlllIIlIl.add(lllllllllllllIIlllIIIIlIlllIIIlI, lllllllllllllIIlllIIIIlIlllIIIlI, lllllllllllllIIlllIIIIlIlllIIIlI)) ? 1 : 0)) {
            final byte lllllllllllllIIlllIIIIlIllIllIlI = (byte)BlockPos.getAllInBox(lllllllllllllIIlllIIIIlIlllIIlIl.add(-lllllllllllllIIlllIIIIlIlllIIIll, -lllllllllllllIIlllIIIIlIlllIIIll, -lllllllllllllIIlllIIIIlIlllIIIll), lllllllllllllIIlllIIIIlIlllIIlIl.add(lllllllllllllIIlllIIIIlIlllIIIll, lllllllllllllIIlllIIIIlIlllIIIll, lllllllllllllIIlllIIIIlIlllIIIll)).iterator();
            "".length();
            if (((0x66 ^ 0x36) & ~(0x6 ^ 0x56)) > 0) {
                return;
            }
            while (!llIIllIIIIllIII(((Iterator)lllllllllllllIIlllIIIIlIllIllIlI).hasNext() ? 1 : 0)) {
                final BlockPos lllllllllllllIIlllIIIIlIlllIIIIl = ((Iterator<BlockPos>)lllllllllllllIIlllIIIIlIllIllIlI).next();
                final IBlockState lllllllllllllIIlllIIIIlIlllIIIII = lllllllllllllIIlllIIIIlIllIlllll.getBlockState(lllllllllllllIIlllIIIIlIlllIIIIl);
                if (llIIllIIIIlIlll(lllllllllllllIIlllIIIIlIlllIIIII.getBlock().getMaterial(), Material.leaves) && llIIllIIIIllIII(((boolean)lllllllllllllIIlllIIIIlIlllIIIII.getValue((IProperty<Boolean>)BlockLeaves.CHECK_DECAY)) ? 1 : 0)) {
                    lllllllllllllIIlllIIIIlIllIlllll.setBlockState(lllllllllllllIIlllIIIIlIlllIIIIl, lllllllllllllIIlllIIIIlIlllIIIII.withProperty((IProperty<Comparable>)BlockLeaves.CHECK_DECAY, (boolean)(BlockLog.lIIlIIlIIIlllI[2] != 0)), BlockLog.lIIlIIlIIIlllI[1]);
                    "".length();
                }
            }
        }
    }
    
    private static String llIIllIIIIlIIll(String lllllllllllllIIlllIIIIlIlIlIlllI, final String lllllllllllllIIlllIIIIlIlIlIllIl) {
        lllllllllllllIIlllIIIIlIlIlIlllI = new String(Base64.getDecoder().decode(lllllllllllllIIlllIIIIlIlIlIlllI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIIlllIIIIlIlIllIIIl = new StringBuilder();
        final char[] lllllllllllllIIlllIIIIlIlIllIIII = lllllllllllllIIlllIIIIlIlIlIllIl.toCharArray();
        int lllllllllllllIIlllIIIIlIlIlIllll = BlockLog.lIIlIIlIIIlllI[0];
        final Exception lllllllllllllIIlllIIIIlIlIlIlIIl = (Object)lllllllllllllIIlllIIIIlIlIlIlllI.toCharArray();
        final int lllllllllllllIIlllIIIIlIlIlIlIII = lllllllllllllIIlllIIIIlIlIlIlIIl.length;
        Exception lllllllllllllIIlllIIIIlIlIlIIlll = (Exception)BlockLog.lIIlIIlIIIlllI[0];
        while (llIIllIIIIllIIl((int)lllllllllllllIIlllIIIIlIlIlIIlll, lllllllllllllIIlllIIIIlIlIlIlIII)) {
            final char lllllllllllllIIlllIIIIlIlIllIlII = lllllllllllllIIlllIIIIlIlIlIlIIl[lllllllllllllIIlllIIIIlIlIlIIlll];
            lllllllllllllIIlllIIIIlIlIllIIIl.append((char)(lllllllllllllIIlllIIIIlIlIllIlII ^ lllllllllllllIIlllIIIIlIlIllIIII[lllllllllllllIIlllIIIIlIlIlIllll % lllllllllllllIIlllIIIIlIlIllIIII.length]));
            "".length();
            ++lllllllllllllIIlllIIIIlIlIlIllll;
            ++lllllllllllllIIlllIIIIlIlIlIIlll;
            "".length();
            if (((127 + 9 + 8 + 22 ^ 132 + 32 - 26 + 12) & (0x4B ^ 0x56 ^ (0x46 ^ 0x6B) ^ -" ".length())) >= "  ".length()) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIIlllIIIIlIlIllIIIl);
    }
    
    private static boolean llIIllIIIIllIII(final int lllllllllllllIIlllIIIIlIlIIllIlI) {
        return lllllllllllllIIlllIIIIlIlIIllIlI == 0;
    }
    
    public BlockLog() {
        super(Material.wood);
        this.setCreativeTab(CreativeTabs.tabBlock);
        "".length();
        this.setHardness(2.0f);
        "".length();
        this.setStepSound(BlockLog.soundTypeWood);
        "".length();
    }
    
    @Override
    public IBlockState onBlockPlaced(final World lllllllllllllIIlllIIIIlIllIIIlIl, final BlockPos lllllllllllllIIlllIIIIlIllIIIlII, final EnumFacing lllllllllllllIIlllIIIIlIllIIllII, final float lllllllllllllIIlllIIIIlIllIIIIlI, final float lllllllllllllIIlllIIIIlIllIIIIIl, final float lllllllllllllIIlllIIIIlIllIIlIIl, final int lllllllllllllIIlllIIIIlIlIllllll, final EntityLivingBase lllllllllllllIIlllIIIIlIllIIIlll) {
        return super.onBlockPlaced(lllllllllllllIIlllIIIIlIllIIIlIl, lllllllllllllIIlllIIIIlIllIIIlII, lllllllllllllIIlllIIIIlIllIIllII, lllllllllllllIIlllIIIIlIllIIIIlI, lllllllllllllIIlllIIIIlIllIIIIIl, lllllllllllllIIlllIIIIlIllIIlIIl, lllllllllllllIIlllIIIIlIlIllllll, lllllllllllllIIlllIIIIlIllIIIlll).withProperty(BlockLog.LOG_AXIS, EnumAxis.fromFacingAxis(lllllllllllllIIlllIIIIlIllIIllII.getAxis()));
    }
    
    private static boolean llIIllIIIIllIIl(final int lllllllllllllIIlllIIIIlIlIlIIIll, final int lllllllllllllIIlllIIIIlIlIlIIIlI) {
        return lllllllllllllIIlllIIIIlIlIlIIIll < lllllllllllllIIlllIIIIlIlIlIIIlI;
    }
    
    private static boolean llIIllIIIIlIllI(final int lllllllllllllIIlllIIIIlIlIIlllII) {
        return lllllllllllllIIlllIIIIlIlIIlllII != 0;
    }
    
    static {
        llIIllIIIIlIlIl();
        llIIllIIIIlIlII();
        LOG_AXIS = PropertyEnum.create(BlockLog.lIIlIIlIIIllIl[BlockLog.lIIlIIlIIIlllI[0]], EnumAxis.class);
    }
    
    private static void llIIllIIIIlIlII() {
        (lIIlIIlIIIllIl = new String[BlockLog.lIIlIIlIIIlllI[2]])[BlockLog.lIIlIIlIIIlllI[0]] = llIIllIIIIlIIll("JTYgPw==", "DNILi");
    }
    
    private static boolean llIIllIIIIlIlll(final Object lllllllllllllIIlllIIIIlIlIIlllll, final Object lllllllllllllIIlllIIIIlIlIIllllI) {
        return lllllllllllllIIlllIIIIlIlIIlllll == lllllllllllllIIlllIIIIlIlIIllllI;
    }
    
    public enum EnumAxis implements IStringSerializable
    {
        NONE(EnumAxis.llllIlllIlIll[EnumAxis.llllIlllIllll[6]], EnumAxis.llllIlllIllll[3], EnumAxis.llllIlllIlIll[EnumAxis.llllIlllIllll[7]]), 
        Y(EnumAxis.llllIlllIlIll[EnumAxis.llllIlllIllll[2]], EnumAxis.llllIlllIllll[1], EnumAxis.llllIlllIlIll[EnumAxis.llllIlllIllll[3]]), 
        Z(EnumAxis.llllIlllIlIll[EnumAxis.llllIlllIllll[4]], EnumAxis.llllIlllIllll[2], EnumAxis.llllIlllIlIll[EnumAxis.llllIlllIllll[5]]);
        
        private static final /* synthetic */ int[] llllIlllIllll;
        private final /* synthetic */ String name;
        private static final /* synthetic */ String[] llllIlllIlIll;
        
        X(EnumAxis.llllIlllIlIll[EnumAxis.llllIlllIllll[0]], EnumAxis.llllIlllIllll[0], EnumAxis.llllIlllIlIll[EnumAxis.llllIlllIllll[1]]);
        
        private static boolean lIlIllIIIlIllIl(final int lllllllllllllIlIllIIIlllIllllIIl, final int lllllllllllllIlIllIIIlllIllllIII) {
            return lllllllllllllIlIllIIIlllIllllIIl < lllllllllllllIlIllIIIlllIllllIII;
        }
        
        static {
            lIlIllIIIlIlIll();
            lIlIllIIIlIIIIl();
            final EnumAxis[] enum$VALUES = new EnumAxis[EnumAxis.llllIlllIllll[4]];
            enum$VALUES[EnumAxis.llllIlllIllll[0]] = EnumAxis.X;
            enum$VALUES[EnumAxis.llllIlllIllll[1]] = EnumAxis.Y;
            enum$VALUES[EnumAxis.llllIlllIllll[2]] = EnumAxis.Z;
            enum$VALUES[EnumAxis.llllIlllIllll[3]] = EnumAxis.NONE;
            ENUM$VALUES = enum$VALUES;
        }
        
        static /* synthetic */ int[] $SWITCH_TABLE$net$minecraft$util$EnumFacing$Axis() {
            final int[] $switch_TABLE$net$minecraft$util$EnumFacing$Axis = EnumAxis.$SWITCH_TABLE$net$minecraft$util$EnumFacing$Axis;
            if (lIlIllIIIlIllII($switch_TABLE$net$minecraft$util$EnumFacing$Axis)) {
                return $switch_TABLE$net$minecraft$util$EnumFacing$Axis;
            }
            "".length();
            final byte lllllllllllllIlIllIIIllllIlIlllI = (Object)new int[EnumFacing.Axis.values().length];
            try {
                lllllllllllllIlIllIIIllllIlIlllI[EnumFacing.Axis.X.ordinal()] = EnumAxis.llllIlllIllll[1];
                "".length();
                if (-" ".length() >= " ".length()) {
                    return null;
                }
            }
            catch (NoSuchFieldError noSuchFieldError) {
                "".length();
            }
            try {
                lllllllllllllIlIllIIIllllIlIlllI[EnumFacing.Axis.Y.ordinal()] = EnumAxis.llllIlllIllll[2];
                "".length();
                if (null != null) {
                    return null;
                }
            }
            catch (NoSuchFieldError noSuchFieldError2) {
                "".length();
            }
            try {
                lllllllllllllIlIllIIIllllIlIlllI[EnumFacing.Axis.Z.ordinal()] = EnumAxis.llllIlllIllll[3];
                "".length();
                if ("   ".length() < -" ".length()) {
                    return null;
                }
            }
            catch (NoSuchFieldError noSuchFieldError3) {
                "".length();
            }
            return EnumAxis.$SWITCH_TABLE$net$minecraft$util$EnumFacing$Axis = (int[])(Object)lllllllllllllIlIllIIIllllIlIlllI;
        }
        
        private EnumAxis(final String lllllllllllllIlIllIIIlllllIIIIll, final int lllllllllllllIlIllIIIlllllIIIIlI, final String lllllllllllllIlIllIIIlllllIIIIIl) {
            this.name = lllllllllllllIlIllIIIlllllIIIIIl;
        }
        
        public static EnumAxis fromFacingAxis(final EnumFacing.Axis lllllllllllllIlIllIIIllllIllllII) {
            switch ($SWITCH_TABLE$net$minecraft$util$EnumFacing$Axis()[lllllllllllllIlIllIIIllllIllllII.ordinal()]) {
                case 1: {
                    return EnumAxis.X;
                }
                case 2: {
                    return EnumAxis.Y;
                }
                case 3: {
                    return EnumAxis.Z;
                }
                default: {
                    return EnumAxis.NONE;
                }
            }
        }
        
        private static void lIlIllIIIlIlIll() {
            (llllIlllIllll = new int[9])[0] = ((0x69 ^ 0x28) & ~(0xC7 ^ 0x86));
            EnumAxis.llllIlllIllll[1] = " ".length();
            EnumAxis.llllIlllIllll[2] = "  ".length();
            EnumAxis.llllIlllIllll[3] = "   ".length();
            EnumAxis.llllIlllIllll[4] = (0xA8 ^ 0xAC);
            EnumAxis.llllIlllIllll[5] = (0x3D ^ 0x38);
            EnumAxis.llllIlllIllll[6] = (23 + 69 - 25 + 129 ^ 145 + 16 - 129 + 162);
            EnumAxis.llllIlllIllll[7] = (0x4F ^ 0x3F ^ (0xDB ^ 0xAC));
            EnumAxis.llllIlllIllll[8] = (0x2B ^ 0x5B ^ (0xD ^ 0x75));
        }
        
        @Override
        public String toString() {
            return this.name;
        }
        
        private static void lIlIllIIIlIIIIl() {
            (llllIlllIlIll = new String[EnumAxis.llllIlllIllll[8]])[EnumAxis.llllIlllIllll[0]] = lIlIllIIIIllllI("mSLGmkYHTt0=", "vbOAT");
            EnumAxis.llllIlllIlIll[EnumAxis.llllIlllIllll[1]] = lIlIllIIIIlllll("KQ==", "QmhqT");
            EnumAxis.llllIlllIlIll[EnumAxis.llllIlllIllll[2]] = lIlIllIIIIlllll("Ew==", "JydIy");
            EnumAxis.llllIlllIlIll[EnumAxis.llllIlllIllll[3]] = lIlIllIIIlIIIII("TCxoNDeBlJ4=", "vlLwF");
            EnumAxis.llllIlllIlIll[EnumAxis.llllIlllIllll[4]] = lIlIllIIIIllllI("igVJGPkDSss=", "pGxyO");
            EnumAxis.llllIlllIlIll[EnumAxis.llllIlllIllll[5]] = lIlIllIIIlIIIII("XVrxSS4Z2/c=", "coGMW");
            EnumAxis.llllIlllIlIll[EnumAxis.llllIlllIllll[6]] = lIlIllIIIIlllll("LwE5Fg==", "aNwSR");
            EnumAxis.llllIlllIlIll[EnumAxis.llllIlllIllll[7]] = lIlIllIIIIlllll("Kik3LQ==", "DFYHd");
        }
        
        private static boolean lIlIllIIIlIllII(final Object lllllllllllllIlIllIIIlllIlllIllI) {
            return lllllllllllllIlIllIIIlllIlllIllI != null;
        }
        
        private static String lIlIllIIIIlllll(String lllllllllllllIlIllIIIllllIIllllI, final String lllllllllllllIlIllIIIllllIIlllIl) {
            lllllllllllllIlIllIIIllllIIllllI = new String(Base64.getDecoder().decode(lllllllllllllIlIllIIIllllIIllllI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
            final StringBuilder lllllllllllllIlIllIIIllllIlIIIIl = new StringBuilder();
            final char[] lllllllllllllIlIllIIIllllIlIIIII = lllllllllllllIlIllIIIllllIIlllIl.toCharArray();
            int lllllllllllllIlIllIIIllllIIlllll = EnumAxis.llllIlllIllll[0];
            final long lllllllllllllIlIllIIIllllIIllIIl = (Object)lllllllllllllIlIllIIIllllIIllllI.toCharArray();
            final Exception lllllllllllllIlIllIIIllllIIllIII = (Exception)lllllllllllllIlIllIIIllllIIllIIl.length;
            float lllllllllllllIlIllIIIllllIIlIlll = EnumAxis.llllIlllIllll[0];
            while (lIlIllIIIlIllIl((int)lllllllllllllIlIllIIIllllIIlIlll, (int)lllllllllllllIlIllIIIllllIIllIII)) {
                final char lllllllllllllIlIllIIIllllIlIIlII = lllllllllllllIlIllIIIllllIIllIIl[lllllllllllllIlIllIIIllllIIlIlll];
                lllllllllllllIlIllIIIllllIlIIIIl.append((char)(lllllllllllllIlIllIIIllllIlIIlII ^ lllllllllllllIlIllIIIllllIlIIIII[lllllllllllllIlIllIIIllllIIlllll % lllllllllllllIlIllIIIllllIlIIIII.length]));
                "".length();
                ++lllllllllllllIlIllIIIllllIIlllll;
                ++lllllllllllllIlIllIIIllllIIlIlll;
                "".length();
                if (-(0x6B ^ 0x74 ^ (0x94 ^ 0x8E)) >= 0) {
                    return null;
                }
            }
            return String.valueOf(lllllllllllllIlIllIIIllllIlIIIIl);
        }
        
        private static String lIlIllIIIlIIIII(final String lllllllllllllIlIllIIIlllIlllllll, final String lllllllllllllIlIllIIIlllIllllllI) {
            try {
                final SecretKeySpec lllllllllllllIlIllIIIllllIIIIlII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIlIllIIIlllIllllllI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
                final Cipher lllllllllllllIlIllIIIllllIIIIIll = Cipher.getInstance("Blowfish");
                lllllllllllllIlIllIIIllllIIIIIll.init(EnumAxis.llllIlllIllll[2], lllllllllllllIlIllIIIllllIIIIlII);
                return new String(lllllllllllllIlIllIIIllllIIIIIll.doFinal(Base64.getDecoder().decode(lllllllllllllIlIllIIIlllIlllllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
            }
            catch (Exception lllllllllllllIlIllIIIllllIIIIIlI) {
                lllllllllllllIlIllIIIllllIIIIIlI.printStackTrace();
                return null;
            }
        }
        
        private static String lIlIllIIIIllllI(final String lllllllllllllIlIllIIIllllIIIllII, final String lllllllllllllIlIllIIIllllIIIllIl) {
            try {
                final SecretKeySpec lllllllllllllIlIllIIIllllIIlIIIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIlIllIIIllllIIIllIl.getBytes(StandardCharsets.UTF_8)), EnumAxis.llllIlllIllll[8]), "DES");
                final Cipher lllllllllllllIlIllIIIllllIIlIIII = Cipher.getInstance("DES");
                lllllllllllllIlIllIIIllllIIlIIII.init(EnumAxis.llllIlllIllll[2], lllllllllllllIlIllIIIllllIIlIIIl);
                return new String(lllllllllllllIlIllIIIllllIIlIIII.doFinal(Base64.getDecoder().decode(lllllllllllllIlIllIIIllllIIIllII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
            }
            catch (Exception lllllllllllllIlIllIIIllllIIIllll) {
                lllllllllllllIlIllIIIllllIIIllll.printStackTrace();
                return null;
            }
        }
        
        @Override
        public String getName() {
            return this.name;
        }
    }
}
