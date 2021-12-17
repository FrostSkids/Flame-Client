// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.block;

import java.util.Iterator;
import java.util.Arrays;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.BlockState;
import java.util.List;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.Entity;
import net.minecraft.util.BlockPos;
import net.minecraft.world.World;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.state.IBlockState;
import net.minecraft.block.properties.PropertyBool;

public class BlockPressurePlate extends BlockBasePressurePlate
{
    private final /* synthetic */ Sensitivity sensitivity;
    private static final /* synthetic */ String[] llIIllIllIlIlI;
    private static final /* synthetic */ int[] llIIllIllIlIll;
    public static final /* synthetic */ PropertyBool POWERED;
    private static volatile /* synthetic */ int[] $SWITCH_TABLE$net$minecraft$block$BlockPressurePlate$Sensitivity;
    
    private static void lIIIllllIIIlIlll() {
        (llIIllIllIlIlI = new String[BlockPressurePlate.llIIllIllIlIll[2]])[BlockPressurePlate.llIIllIllIlIll[0]] = lIIIllllIIIlIllI("MOHup7nZtqk=", "QaplT");
    }
    
    private static boolean lIIIllllIIIlllIl(final Object llllllllllllIllIlllllllIIIlIIlII) {
        return llllllllllllIllIlllllllIIIlIIlII != null;
    }
    
    @Override
    protected int getRedstoneStrength(final IBlockState llllllllllllIllIlllllllIIllIIlII) {
        int n;
        if (lIIIllllIIIllIIl(((boolean)llllllllllllIllIlllllllIIllIIlII.getValue((IProperty<Boolean>)BlockPressurePlate.POWERED)) ? 1 : 0)) {
            n = BlockPressurePlate.llIIllIllIlIll[1];
            "".length();
            if (((74 + 57 - 45 + 101 ^ 85 + 56 - 25 + 12) & (0xFA ^ 0xB8 ^ (0xE9 ^ 0x90) ^ -" ".length())) < 0) {
                return " ".length() & (" ".length() ^ -" ".length());
            }
        }
        else {
            n = BlockPressurePlate.llIIllIllIlIll[0];
        }
        return n;
    }
    
    @Override
    protected int computeRedstoneStrength(final World llllllllllllIllIlllllllIIlIlIIll, final BlockPos llllllllllllIllIlllllllIIlIIlIlI) {
        final AxisAlignedBB llllllllllllIllIlllllllIIlIlIIIl = this.getSensitiveAABB(llllllllllllIllIlllllllIIlIIlIlI);
        switch ($SWITCH_TABLE$net$minecraft$block$BlockPressurePlate$Sensitivity()[this.sensitivity.ordinal()]) {
            case 1: {
                final List<? extends Entity> llllllllllllIllIlllllllIIlIlIIII = llllllllllllIllIlllllllIIlIlIIll.getEntitiesWithinAABBExcludingEntity(null, llllllllllllIllIlllllllIIlIlIIIl);
                "".length();
                if (((0x73 ^ 0x2F) & ~(0x6 ^ 0x5A)) >= " ".length()) {
                    return " ".length() & ~" ".length();
                }
                break;
            }
            case 2: {
                final List<? extends Entity> llllllllllllIllIlllllllIIlIIllll = llllllllllllIllIlllllllIIlIlIIll.getEntitiesWithinAABB((Class<? extends Entity>)EntityLivingBase.class, llllllllllllIllIlllllllIIlIlIIIl);
                "".length();
                if ((0x3B ^ 0x3F) == ((0x9 ^ 0xF) & ~(0x29 ^ 0x2F))) {
                    return (0x8D ^ 0xA4) & ~(0xA6 ^ 0x8F);
                }
                break;
            }
            default: {
                return BlockPressurePlate.llIIllIllIlIll[0];
            }
        }
        final List<? extends Entity> llllllllllllIllIlllllllIIlIIlllI;
        if (lIIIllllIIIllIll(llllllllllllIllIlllllllIIlIIlllI.isEmpty() ? 1 : 0)) {
            final long llllllllllllIllIlllllllIIlIIIllI = (long)llllllllllllIllIlllllllIIlIIlllI.iterator();
            "".length();
            if (-" ".length() > (0x77 ^ 0x73)) {
                return (0x6D ^ 0x76) & ~(0x4A ^ 0x51);
            }
            while (!lIIIllllIIIllIll(((Iterator)llllllllllllIllIlllllllIIlIIIllI).hasNext() ? 1 : 0)) {
                final Entity llllllllllllIllIlllllllIIlIIllIl = ((Iterator<Entity>)llllllllllllIllIlllllllIIlIIIllI).next();
                if (lIIIllllIIIllIll(llllllllllllIllIlllllllIIlIIllIl.doesEntityNotTriggerPressurePlate() ? 1 : 0)) {
                    return BlockPressurePlate.llIIllIllIlIll[1];
                }
            }
        }
        return BlockPressurePlate.llIIllIllIlIll[0];
    }
    
    @Override
    protected BlockState createBlockState() {
        final IProperty[] llllllllllllIllllIIIlIlIIlIIIlll = new IProperty[BlockPressurePlate.llIIllIllIlIll[2]];
        llllllllllllIllllIIIlIlIIlIIIlll[BlockPressurePlate.llIIllIllIlIll[0]] = BlockPressurePlate.POWERED;
        return new BlockState(this, llllllllllllIllllIIIlIlIIlIIIlll);
    }
    
    private static boolean lIIIllllIIIllIll(final int llllllllllllIllIlllllllIIIlIIIII) {
        return llllllllllllIllIlllllllIIIlIIIII == 0;
    }
    
    private static boolean lIIIllllIIIlllII(final int llllllllllllIllIlllllllIIIlIIlll, final int llllllllllllIllIlllllllIIIlIIllI) {
        return llllllllllllIllIlllllllIIIlIIlll == llllllllllllIllIlllllllIIIlIIllI;
    }
    
    private static void lIIIllllIIIllIII() {
        (llIIllIllIlIll = new int[4])[0] = ((0xCE ^ 0x9F) & ~(0x4A ^ 0x1B));
        BlockPressurePlate.llIIllIllIlIll[1] = (0x78 ^ 0x44 ^ (0xA2 ^ 0x91));
        BlockPressurePlate.llIIllIllIlIll[2] = " ".length();
        BlockPressurePlate.llIIllIllIlIll[3] = "  ".length();
    }
    
    protected BlockPressurePlate(final Material llllllllllllIllIlllllllIIllIlIII, final Sensitivity llllllllllllIllIlllllllIIllIIlll) {
        super(llllllllllllIllIlllllllIIllIlIII);
        this.setDefaultState(this.blockState.getBaseState().withProperty((IProperty<Comparable>)BlockPressurePlate.POWERED, (boolean)(BlockPressurePlate.llIIllIllIlIll[0] != 0)));
        this.sensitivity = llllllllllllIllIlllllllIIllIIlll;
    }
    
    @Override
    public IBlockState getStateFromMeta(final int llllllllllllIllIlllllllIIlIIIIlI) {
        final IBlockState defaultState = this.getDefaultState();
        final PropertyBool powered = BlockPressurePlate.POWERED;
        int b;
        if (lIIIllllIIIlllII(llllllllllllIllIlllllllIIlIIIIlI, BlockPressurePlate.llIIllIllIlIll[2])) {
            b = BlockPressurePlate.llIIllIllIlIll[2];
            "".length();
            if (((0xD3 ^ 0x8A) & ~(0x66 ^ 0x3F)) > 0) {
                return null;
            }
        }
        else {
            b = BlockPressurePlate.llIIllIllIlIll[0];
        }
        return defaultState.withProperty((IProperty<Comparable>)powered, (boolean)(b != 0));
    }
    
    static /* synthetic */ int[] $SWITCH_TABLE$net$minecraft$block$BlockPressurePlate$Sensitivity() {
        final int[] $switch_TABLE$net$minecraft$block$BlockPressurePlate$Sensitivity = BlockPressurePlate.$SWITCH_TABLE$net$minecraft$block$BlockPressurePlate$Sensitivity;
        if (lIIIllllIIIlllIl($switch_TABLE$net$minecraft$block$BlockPressurePlate$Sensitivity)) {
            return $switch_TABLE$net$minecraft$block$BlockPressurePlate$Sensitivity;
        }
        "".length();
        final boolean llllllllllllIllIlllllllIIIllIlll = (Object)new int[Sensitivity.values().length];
        try {
            llllllllllllIllIlllllllIIIllIlll[Sensitivity.EVERYTHING.ordinal()] = BlockPressurePlate.llIIllIllIlIll[2];
            "".length();
            if (" ".length() < ((0x21 ^ 0x14) & ~(0x5E ^ 0x6B))) {
                return null;
            }
        }
        catch (NoSuchFieldError noSuchFieldError) {
            "".length();
        }
        try {
            llllllllllllIllIlllllllIIIllIlll[Sensitivity.MOBS.ordinal()] = BlockPressurePlate.llIIllIllIlIll[3];
            "".length();
            if ((0x6 ^ 0x4F ^ (0x4B ^ 0x6)) <= 0) {
                return null;
            }
        }
        catch (NoSuchFieldError noSuchFieldError2) {
            "".length();
        }
        return BlockPressurePlate.$SWITCH_TABLE$net$minecraft$block$BlockPressurePlate$Sensitivity = (int[])(Object)llllllllllllIllIlllllllIIIllIlll;
    }
    
    private static String lIIIllllIIIlIllI(final String llllllllllllIllIlllllllIIIlIllll, final String llllllllllllIllIlllllllIIIlIlllI) {
        try {
            final SecretKeySpec llllllllllllIllIlllllllIIIllIIlI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIllIlllllllIIIlIlllI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher llllllllllllIllIlllllllIIIllIIIl = Cipher.getInstance("Blowfish");
            llllllllllllIllIlllllllIIIllIIIl.init(BlockPressurePlate.llIIllIllIlIll[3], llllllllllllIllIlllllllIIIllIIlI);
            return new String(llllllllllllIllIlllllllIIIllIIIl.doFinal(Base64.getDecoder().decode(llllllllllllIllIlllllllIIIlIllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIllIlllllllIIIllIIII) {
            llllllllllllIllIlllllllIIIllIIII.printStackTrace();
            return null;
        }
    }
    
    @Override
    public int getMetaFromState(final IBlockState llllllllllllIllIlllllllIIIllllII) {
        int n;
        if (lIIIllllIIIllIIl(((boolean)llllllllllllIllIlllllllIIIllllII.getValue((IProperty<Boolean>)BlockPressurePlate.POWERED)) ? 1 : 0)) {
            n = BlockPressurePlate.llIIllIllIlIll[2];
            "".length();
            if (null != null) {
                return (0xC ^ 0x4A) & ~(0xDD ^ 0x9B);
            }
        }
        else {
            n = BlockPressurePlate.llIIllIllIlIll[0];
        }
        return n;
    }
    
    private static boolean lIIIllllIIIllIIl(final int llllllllllllIllIlllllllIIIlIIIlI) {
        return llllllllllllIllIlllllllIIIlIIIlI != 0;
    }
    
    @Override
    protected IBlockState setRedstoneStrength(final IBlockState llllllllllllIllIlllllllIIlIlllIl, final int llllllllllllIllIlllllllIIlIlllII) {
        final PropertyBool powered = BlockPressurePlate.POWERED;
        int b;
        if (lIIIllllIIIllIlI(llllllllllllIllIlllllllIIlIlllII)) {
            b = BlockPressurePlate.llIIllIllIlIll[2];
            "".length();
            if ((0x6C ^ 0x68) < 0) {
                return null;
            }
        }
        else {
            b = BlockPressurePlate.llIIllIllIlIll[0];
        }
        return llllllllllllIllIlllllllIIlIlllIl.withProperty((IProperty<Comparable>)powered, (boolean)(b != 0));
    }
    
    static {
        lIIIllllIIIllIII();
        lIIIllllIIIlIlll();
        POWERED = PropertyBool.create(BlockPressurePlate.llIIllIllIlIlI[BlockPressurePlate.llIIllIllIlIll[0]]);
    }
    
    private static boolean lIIIllllIIIllIlI(final int llllllllllllIllIlllllllIIIIllllI) {
        return llllllllllllIllIlllllllIIIIllllI > 0;
    }
    
    public enum Sensitivity
    {
        private static final /* synthetic */ String[] lllllIIIlIlII;
        
        MOBS(Sensitivity.lllllIIIlIlII[Sensitivity.lllllIIIlIlIl[1]], Sensitivity.lllllIIIlIlIl[1]), 
        EVERYTHING(Sensitivity.lllllIIIlIlII[Sensitivity.lllllIIIlIlIl[0]], Sensitivity.lllllIIIlIlIl[0]);
        
        private static final /* synthetic */ int[] lllllIIIlIlIl;
        
        private Sensitivity(final String lllllllllllllIlIllIIIIlIIlllllII, final int lllllllllllllIlIllIIIIlIIllllIll) {
        }
        
        private static void lIlIllIlIIIllII() {
            (lllllIIIlIlIl = new int[4])[0] = ((0x10 ^ 0x52) & ~(0xF4 ^ 0xB6));
            Sensitivity.lllllIIIlIlIl[1] = " ".length();
            Sensitivity.lllllIIIlIlIl[2] = "  ".length();
            Sensitivity.lllllIIIlIlIl[3] = (0x9D ^ 0xB8 ^ (0xED ^ 0xC0));
        }
        
        private static String lIlIllIlIIIIIII(final String lllllllllllllIlIllIIIIlIIllIlIIl, final String lllllllllllllIlIllIIIIlIIllIlIlI) {
            try {
                final SecretKeySpec lllllllllllllIlIllIIIIlIIllIlllI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIlIllIIIIlIIllIlIlI.getBytes(StandardCharsets.UTF_8)), Sensitivity.lllllIIIlIlIl[3]), "DES");
                final Cipher lllllllllllllIlIllIIIIlIIllIllIl = Cipher.getInstance("DES");
                lllllllllllllIlIllIIIIlIIllIllIl.init(Sensitivity.lllllIIIlIlIl[2], lllllllllllllIlIllIIIIlIIllIlllI);
                return new String(lllllllllllllIlIllIIIIlIIllIllIl.doFinal(Base64.getDecoder().decode(lllllllllllllIlIllIIIIlIIllIlIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
            }
            catch (Exception lllllllllllllIlIllIIIIlIIllIllII) {
                lllllllllllllIlIllIIIIlIIllIllII.printStackTrace();
                return null;
            }
        }
        
        private static void lIlIllIlIIIlIll() {
            (lllllIIIlIlII = new String[Sensitivity.lllllIIIlIlIl[2]])[Sensitivity.lllllIIIlIlIl[0]] = lIlIllIlIIIIIII("d5nRZl3iw322ESTZvbVwzA==", "hCJez");
            Sensitivity.lllllIIIlIlII[Sensitivity.lllllIIIlIlIl[1]] = lIlIllIlIIIIlIl("NKqPmq/rHsU=", "TBjmh");
        }
        
        private static String lIlIllIlIIIIlIl(final String lllllllllllllIlIllIIIIlIIlIlllII, final String lllllllllllllIlIllIIIIlIIlIllIll) {
            try {
                final SecretKeySpec lllllllllllllIlIllIIIIlIIllIIIIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIlIllIIIIlIIlIllIll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
                final Cipher lllllllllllllIlIllIIIIlIIllIIIII = Cipher.getInstance("Blowfish");
                lllllllllllllIlIllIIIIlIIllIIIII.init(Sensitivity.lllllIIIlIlIl[2], lllllllllllllIlIllIIIIlIIllIIIIl);
                return new String(lllllllllllllIlIllIIIIlIIllIIIII.doFinal(Base64.getDecoder().decode(lllllllllllllIlIllIIIIlIIlIlllII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
            }
            catch (Exception lllllllllllllIlIllIIIIlIIlIlllll) {
                lllllllllllllIlIllIIIIlIIlIlllll.printStackTrace();
                return null;
            }
        }
        
        static {
            lIlIllIlIIIllII();
            lIlIllIlIIIlIll();
            final Sensitivity[] enum$VALUES = new Sensitivity[Sensitivity.lllllIIIlIlIl[2]];
            enum$VALUES[Sensitivity.lllllIIIlIlIl[0]] = Sensitivity.EVERYTHING;
            enum$VALUES[Sensitivity.lllllIIIlIlIl[1]] = Sensitivity.MOBS;
            ENUM$VALUES = enum$VALUES;
        }
    }
}
