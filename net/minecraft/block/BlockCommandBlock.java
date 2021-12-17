// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.block;

import net.minecraft.command.server.CommandBlockLogic;
import net.minecraft.item.ItemStack;
import java.util.Random;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.tileentity.TileEntityCommandBlock;
import net.minecraft.entity.player.EntityPlayer;
import java.util.Arrays;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.BlockPos;
import net.minecraft.world.World;
import net.minecraft.block.state.BlockState;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.PropertyBool;

public class BlockCommandBlock extends BlockContainer
{
    private static final /* synthetic */ String[] llllllIIlIIlI;
    private static final /* synthetic */ int[] llllllIIlIlII;
    public static final /* synthetic */ PropertyBool TRIGGERED;
    
    public BlockCommandBlock() {
        super(Material.iron, MapColor.adobeColor);
        this.setDefaultState(this.blockState.getBaseState().withProperty((IProperty<Comparable>)BlockCommandBlock.TRIGGERED, (boolean)(BlockCommandBlock.llllllIIlIlII[0] != 0)));
    }
    
    private static String lIlIllllllIllIl(final String lllllllllllllIlIlIlIlIlIIlIIIllI, final String lllllllllllllIlIlIlIlIlIIlIIIlll) {
        try {
            final SecretKeySpec lllllllllllllIlIlIlIlIlIIlIIlIll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIlIlIlIlIlIIlIIIlll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lllllllllllllIlIlIlIlIlIIlIIlIlI = Cipher.getInstance("Blowfish");
            lllllllllllllIlIlIlIlIlIIlIIlIlI.init(BlockCommandBlock.llllllIIlIlII[4], lllllllllllllIlIlIlIlIlIIlIIlIll);
            return new String(lllllllllllllIlIlIlIlIlIIlIIlIlI.doFinal(Base64.getDecoder().decode(lllllllllllllIlIlIlIlIlIIlIIIllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIlIlIlIlIlIIlIIlIIl) {
            lllllllllllllIlIlIlIlIlIIlIIlIIl.printStackTrace();
            return null;
        }
    }
    
    private static boolean lIlIllllllllIll(final int lllllllllllllIlIlIlIlIlIIIllIIII) {
        return lllllllllllllIlIlIlIlIlIIIllIIII > 0;
    }
    
    @Override
    protected BlockState createBlockState() {
        final IProperty[] llllllllllllIllllIIIlIlIIlIIIlll = new IProperty[BlockCommandBlock.llllllIIlIlII[1]];
        llllllllllllIllllIIIlIlIIlIIIlll[BlockCommandBlock.llllllIIlIlII[0]] = BlockCommandBlock.TRIGGERED;
        return new BlockState(this, llllllllllllIllllIIIlIlIIlIIIlll);
    }
    
    private static boolean lIlIllllllllIIl(final int lllllllllllllIlIlIlIlIlIIIllIIlI) {
        return lllllllllllllIlIlIlIlIlIIIllIIlI == 0;
    }
    
    private static boolean lIlIllllllllIlI(final int lllllllllllllIlIlIlIlIlIIIllIlII) {
        return lllllllllllllIlIlIlIlIlIIIllIlII != 0;
    }
    
    @Override
    public IBlockState onBlockPlaced(final World lllllllllllllIlIlIlIlIlIIlIllIII, final BlockPos lllllllllllllIlIlIlIlIlIIlIlIlll, final EnumFacing lllllllllllllIlIlIlIlIlIIlIlIllI, final float lllllllllllllIlIlIlIlIlIIlIlIlIl, final float lllllllllllllIlIlIlIlIlIIlIlIlII, final float lllllllllllllIlIlIlIlIlIIlIlIIll, final int lllllllllllllIlIlIlIlIlIIlIlIIlI, final EntityLivingBase lllllllllllllIlIlIlIlIlIIlIlIIIl) {
        return this.getDefaultState().withProperty((IProperty<Comparable>)BlockCommandBlock.TRIGGERED, (boolean)(BlockCommandBlock.llllllIIlIlII[0] != 0));
    }
    
    @Override
    public boolean hasComparatorInputOverride() {
        return BlockCommandBlock.llllllIIlIlII[1] != 0;
    }
    
    private static String lIlIllllllIllII(final String lllllllllllllIlIlIlIlIlIIIlllIll, final String lllllllllllllIlIlIlIlIlIIIlllIII) {
        try {
            final SecretKeySpec lllllllllllllIlIlIlIlIlIIIlllllI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIlIlIlIlIlIIIlllIII.getBytes(StandardCharsets.UTF_8)), BlockCommandBlock.llllllIIlIlII[5]), "DES");
            final Cipher lllllllllllllIlIlIlIlIlIIIllllIl = Cipher.getInstance("DES");
            lllllllllllllIlIlIlIlIlIIIllllIl.init(BlockCommandBlock.llllllIIlIlII[4], lllllllllllllIlIlIlIlIlIIIlllllI);
            return new String(lllllllllllllIlIlIlIlIlIIIllllIl.doFinal(Base64.getDecoder().decode(lllllllllllllIlIlIlIlIlIIIlllIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIlIlIlIlIlIIIllllII) {
            lllllllllllllIlIlIlIlIlIIIllllII.printStackTrace();
            return null;
        }
    }
    
    @Override
    public boolean onBlockActivated(final World lllllllllllllIlIlIlIlIlIlIIlIlll, final BlockPos lllllllllllllIlIlIlIlIlIlIIIllIl, final IBlockState lllllllllllllIlIlIlIlIlIlIIlIlIl, final EntityPlayer lllllllllllllIlIlIlIlIlIlIIlIlII, final EnumFacing lllllllllllllIlIlIlIlIlIlIIlIIll, final float lllllllllllllIlIlIlIlIlIlIIlIIlI, final float lllllllllllllIlIlIlIlIlIlIIlIIIl, final float lllllllllllllIlIlIlIlIlIlIIlIIII) {
        final TileEntity lllllllllllllIlIlIlIlIlIlIIIllll = lllllllllllllIlIlIlIlIlIlIIlIlll.getTileEntity(lllllllllllllIlIlIlIlIlIlIIIllIl);
        int tryOpenEditCommandBlock;
        if (lIlIllllllllIlI((lllllllllllllIlIlIlIlIlIlIIIllll instanceof TileEntityCommandBlock) ? 1 : 0)) {
            tryOpenEditCommandBlock = (((TileEntityCommandBlock)lllllllllllllIlIlIlIlIlIlIIIllll).getCommandBlockLogic().tryOpenEditCommandBlock(lllllllllllllIlIlIlIlIlIlIIlIlII) ? 1 : 0);
            "".length();
            if (" ".length() > (0x7F ^ 0x71 ^ (0x11 ^ 0x1B))) {
                return ((105 + 16 - 37 + 46 ^ 180 + 77 - 113 + 41) & (65 + 244 - 197 + 143 ^ 25 + 57 - 79 + 193 ^ -" ".length()) & (((0x6A ^ 0x1C ^ (0x52 ^ 0x19)) & (30 + 217 - 69 + 70 ^ 59 + 82 - 76 + 132 ^ -" ".length())) ^ -" ".length())) != 0x0;
            }
        }
        else {
            tryOpenEditCommandBlock = BlockCommandBlock.llllllIIlIlII[0];
        }
        return tryOpenEditCommandBlock != 0;
    }
    
    @Override
    public void onNeighborBlockChange(final World lllllllllllllIlIlIlIlIlIlIlllIII, final BlockPos lllllllllllllIlIlIlIlIlIlIllIlll, final IBlockState lllllllllllllIlIlIlIlIlIlIllIllI, final Block lllllllllllllIlIlIlIlIlIlIllIlIl) {
        if (lIlIllllllllIIl(lllllllllllllIlIlIlIlIlIlIlllIII.isRemote ? 1 : 0)) {
            final boolean lllllllllllllIlIlIlIlIlIlIllIlII = lllllllllllllIlIlIlIlIlIlIlllIII.isBlockPowered(lllllllllllllIlIlIlIlIlIlIllIlll);
            final boolean lllllllllllllIlIlIlIlIlIlIllIIll = lllllllllllllIlIlIlIlIlIlIllIllI.getValue((IProperty<Boolean>)BlockCommandBlock.TRIGGERED);
            if (lIlIllllllllIlI(lllllllllllllIlIlIlIlIlIlIllIlII ? 1 : 0) && lIlIllllllllIIl(lllllllllllllIlIlIlIlIlIlIllIIll ? 1 : 0)) {
                lllllllllllllIlIlIlIlIlIlIlllIII.setBlockState(lllllllllllllIlIlIlIlIlIlIllIlll, lllllllllllllIlIlIlIlIlIlIllIllI.withProperty((IProperty<Comparable>)BlockCommandBlock.TRIGGERED, (boolean)(BlockCommandBlock.llllllIIlIlII[1] != 0)), BlockCommandBlock.llllllIIlIlII[2]);
                "".length();
                lllllllllllllIlIlIlIlIlIlIlllIII.scheduleUpdate(lllllllllllllIlIlIlIlIlIlIllIlll, this, this.tickRate(lllllllllllllIlIlIlIlIlIlIlllIII));
                "".length();
                if (((0x4E ^ 0x54) & ~(0x7A ^ 0x60)) < 0) {
                    return;
                }
            }
            else if (lIlIllllllllIIl(lllllllllllllIlIlIlIlIlIlIllIlII ? 1 : 0) && lIlIllllllllIlI(lllllllllllllIlIlIlIlIlIlIllIIll ? 1 : 0)) {
                lllllllllllllIlIlIlIlIlIlIlllIII.setBlockState(lllllllllllllIlIlIlIlIlIlIllIlll, lllllllllllllIlIlIlIlIlIlIllIllI.withProperty((IProperty<Comparable>)BlockCommandBlock.TRIGGERED, (boolean)(BlockCommandBlock.llllllIIlIlII[0] != 0)), BlockCommandBlock.llllllIIlIlII[2]);
                "".length();
            }
        }
    }
    
    @Override
    public int tickRate(final World lllllllllllllIlIlIlIlIlIlIIlllIl) {
        return BlockCommandBlock.llllllIIlIlII[1];
    }
    
    @Override
    public int getMetaFromState(final IBlockState lllllllllllllIlIlIlIlIlIIlIlllll) {
        int lllllllllllllIlIlIlIlIlIIllIIIII = BlockCommandBlock.llllllIIlIlII[0];
        if (lIlIllllllllIlI(((boolean)lllllllllllllIlIlIlIlIlIIlIlllll.getValue((IProperty<Boolean>)BlockCommandBlock.TRIGGERED)) ? 1 : 0)) {
            lllllllllllllIlIlIlIlIlIIllIIIII |= BlockCommandBlock.llllllIIlIlII[1];
        }
        return lllllllllllllIlIlIlIlIlIIllIIIII;
    }
    
    private static void lIlIllllllllIII() {
        (llllllIIlIlII = new int[6])[0] = ((0x4C ^ 0xF) & ~(0x10 ^ 0x53));
        BlockCommandBlock.llllllIIlIlII[1] = " ".length();
        BlockCommandBlock.llllllIIlIlII[2] = (((0x73 ^ 0x55) & ~(0x13 ^ 0x35)) ^ (0x11 ^ 0x15));
        BlockCommandBlock.llllllIIlIlII[3] = "   ".length();
        BlockCommandBlock.llllllIIlIlII[4] = "  ".length();
        BlockCommandBlock.llllllIIlIlII[5] = (" ".length() ^ (0x28 ^ 0x21));
    }
    
    @Override
    public int quantityDropped(final Random lllllllllllllIlIlIlIlIlIIllIllII) {
        return BlockCommandBlock.llllllIIlIlII[0];
    }
    
    @Override
    public int getRenderType() {
        return BlockCommandBlock.llllllIIlIlII[3];
    }
    
    @Override
    public int getComparatorInputOverride(final World lllllllllllllIlIlIlIlIlIlIIIIlIl, final BlockPos lllllllllllllIlIlIlIlIlIlIIIIIIl) {
        final TileEntity lllllllllllllIlIlIlIlIlIlIIIIIll = lllllllllllllIlIlIlIlIlIlIIIIlIl.getTileEntity(lllllllllllllIlIlIlIlIlIlIIIIIIl);
        int successCount;
        if (lIlIllllllllIlI((lllllllllllllIlIlIlIlIlIlIIIIIll instanceof TileEntityCommandBlock) ? 1 : 0)) {
            successCount = ((TileEntityCommandBlock)lllllllllllllIlIlIlIlIlIlIIIIIll).getCommandBlockLogic().getSuccessCount();
            "".length();
            if (" ".length() < -" ".length()) {
                return (0x8D ^ 0xA3 ^ (0xC8 ^ 0xB9)) & (70 + 201 - 269 + 205 ^ 126 + 29 - 91 + 80 ^ -" ".length());
            }
        }
        else {
            successCount = BlockCommandBlock.llllllIIlIlII[0];
        }
        return successCount;
    }
    
    @Override
    public void updateTick(final World lllllllllllllIlIlIlIlIlIlIlIIIIl, final BlockPos lllllllllllllIlIlIlIlIlIlIlIIIII, final IBlockState lllllllllllllIlIlIlIlIlIlIlIIlIl, final Random lllllllllllllIlIlIlIlIlIlIlIIlII) {
        final TileEntity lllllllllllllIlIlIlIlIlIlIlIIIll = lllllllllllllIlIlIlIlIlIlIlIIIIl.getTileEntity(lllllllllllllIlIlIlIlIlIlIlIIIII);
        if (lIlIllllllllIlI((lllllllllllllIlIlIlIlIlIlIlIIIll instanceof TileEntityCommandBlock) ? 1 : 0)) {
            ((TileEntityCommandBlock)lllllllllllllIlIlIlIlIlIlIlIIIll).getCommandBlockLogic().trigger(lllllllllllllIlIlIlIlIlIlIlIIIIl);
            lllllllllllllIlIlIlIlIlIlIlIIIIl.updateComparatorOutputLevel(lllllllllllllIlIlIlIlIlIlIlIIIII, this);
        }
    }
    
    @Override
    public TileEntity createNewTileEntity(final World lllllllllllllIlIlIlIlIlIllIIIIIl, final int lllllllllllllIlIlIlIlIlIllIIIIII) {
        return new TileEntityCommandBlock();
    }
    
    private static void lIlIlllllllIlll() {
        (llllllIIlIIlI = new String[BlockCommandBlock.llllllIIlIlII[4]])[BlockCommandBlock.llllllIIlIlII[0]] = lIlIllllllIllII("pP48FqE0Lyr1PjMDU5aHTQ==", "MXpMp");
        BlockCommandBlock.llllllIIlIIlI[BlockCommandBlock.llllllIIlIlII[1]] = lIlIllllllIllIl("euQ7HidrXVbJgwCsUUS0/5XBiqu7sxEi", "zforT");
    }
    
    static {
        lIlIllllllllIII();
        lIlIlllllllIlll();
        TRIGGERED = PropertyBool.create(BlockCommandBlock.llllllIIlIIlI[BlockCommandBlock.llllllIIlIlII[0]]);
    }
    
    @Override
    public IBlockState getStateFromMeta(final int lllllllllllllIlIlIlIlIlIIllIIlIl) {
        final IBlockState defaultState = this.getDefaultState();
        final PropertyBool triggered = BlockCommandBlock.TRIGGERED;
        int b;
        if (lIlIllllllllIll(lllllllllllllIlIlIlIlIlIIllIIlIl & BlockCommandBlock.llllllIIlIlII[1])) {
            b = BlockCommandBlock.llllllIIlIlII[1];
            "".length();
            if (null != null) {
                return null;
            }
        }
        else {
            b = BlockCommandBlock.llllllIIlIlII[0];
        }
        return defaultState.withProperty((IProperty<Comparable>)triggered, (boolean)(b != 0));
    }
    
    @Override
    public void onBlockPlacedBy(final World lllllllllllllIlIlIlIlIlIIlllIIlI, final BlockPos lllllllllllllIlIlIlIlIlIIlllIIIl, final IBlockState lllllllllllllIlIlIlIlIlIIlllIlll, final EntityLivingBase lllllllllllllIlIlIlIlIlIIlllIllI, final ItemStack lllllllllllllIlIlIlIlIlIIlllIlIl) {
        final TileEntity lllllllllllllIlIlIlIlIlIIlllIlII = lllllllllllllIlIlIlIlIlIIlllIIlI.getTileEntity(lllllllllllllIlIlIlIlIlIIlllIIIl);
        if (lIlIllllllllIlI((lllllllllllllIlIlIlIlIlIIlllIlII instanceof TileEntityCommandBlock) ? 1 : 0)) {
            final CommandBlockLogic lllllllllllllIlIlIlIlIlIIlllIIll = ((TileEntityCommandBlock)lllllllllllllIlIlIlIlIlIIlllIlII).getCommandBlockLogic();
            if (lIlIllllllllIlI(lllllllllllllIlIlIlIlIlIIlllIlIl.hasDisplayName() ? 1 : 0)) {
                lllllllllllllIlIlIlIlIlIIlllIIll.setName(lllllllllllllIlIlIlIlIlIIlllIlIl.getDisplayName());
            }
            if (lIlIllllllllIIl(lllllllllllllIlIlIlIlIlIIlllIIlI.isRemote ? 1 : 0)) {
                lllllllllllllIlIlIlIlIlIIlllIIll.setTrackOutput(lllllllllllllIlIlIlIlIlIIlllIIlI.getGameRules().getBoolean(BlockCommandBlock.llllllIIlIIlI[BlockCommandBlock.llllllIIlIlII[1]]));
            }
        }
    }
}
