// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.block;

import java.util.Arrays;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.init.Items;
import net.minecraft.util.EnumFacing;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.block.state.BlockState;
import net.minecraft.entity.projectile.EntityArrow;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.item.EntityTNTPrimed;
import net.minecraft.util.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.Explosion;
import net.minecraft.block.properties.PropertyBool;

public class BlockTNT extends Block
{
    public static final /* synthetic */ PropertyBool EXPLODE;
    private static final /* synthetic */ int[] lIlIIIlIIIIIll;
    private static final /* synthetic */ String[] lIlIIIlIIIIIlI;
    
    @Override
    public boolean canDropFromExplosion(final Explosion lllllllllllllIIIllllllIIIIllIIIl) {
        return BlockTNT.lIlIIIlIIIIIll[0] != 0;
    }
    
    @Override
    public void onBlockDestroyedByExplosion(final World lllllllllllllIIIllllllIIlIIIIIII, final BlockPos lllllllllllllIIIllllllIIIlllllll, final Explosion lllllllllllllIIIllllllIIlIIIIIlI) {
        if (lllIIIlIIllllIl(lllllllllllllIIIllllllIIlIIIIIII.isRemote ? 1 : 0)) {
            final EntityTNTPrimed lllllllllllllIIIllllllIIlIIIIIIl = new EntityTNTPrimed(lllllllllllllIIIllllllIIlIIIIIII, lllllllllllllIIIllllllIIIlllllll.getX() + 0.5f, lllllllllllllIIIllllllIIIlllllll.getY(), lllllllllllllIIIllllllIIIlllllll.getZ() + 0.5f, lllllllllllllIIIllllllIIlIIIIIlI.getExplosivePlacedBy());
            lllllllllllllIIIllllllIIlIIIIIIl.fuse = lllllllllllllIIIllllllIIlIIIIIII.rand.nextInt(lllllllllllllIIIllllllIIlIIIIIIl.fuse / BlockTNT.lIlIIIlIIIIIll[2]) + lllllllllllllIIIllllllIIlIIIIIIl.fuse / BlockTNT.lIlIIIlIIIIIll[3];
            lllllllllllllIIIllllllIIlIIIIIII.spawnEntityInWorld(lllllllllllllIIIllllllIIlIIIIIIl);
            "".length();
        }
    }
    
    @Override
    public void onNeighborBlockChange(final World lllllllllllllIIIllllllIIlIIlIIIl, final BlockPos lllllllllllllIIIllllllIIlIIIlIll, final IBlockState lllllllllllllIIIllllllIIlIIIlIlI, final Block lllllllllllllIIIllllllIIlIIIlllI) {
        if (lllIIIlIIllllII(lllllllllllllIIIllllllIIlIIlIIIl.isBlockPowered(lllllllllllllIIIllllllIIlIIIlIll) ? 1 : 0)) {
            this.onBlockDestroyedByPlayer(lllllllllllllIIIllllllIIlIIlIIIl, lllllllllllllIIIllllllIIlIIIlIll, lllllllllllllIIIllllllIIlIIIlIlI.withProperty((IProperty<Comparable>)BlockTNT.EXPLODE, (boolean)(BlockTNT.lIlIIIlIIIIIll[1] != 0)));
            lllllllllllllIIIllllllIIlIIlIIIl.setBlockToAir(lllllllllllllIIIllllllIIlIIIlIll);
            "".length();
        }
    }
    
    public BlockTNT() {
        super(Material.tnt);
        this.setDefaultState(this.blockState.getBaseState().withProperty((IProperty<Comparable>)BlockTNT.EXPLODE, (boolean)(BlockTNT.lIlIIIlIIIIIll[0] != 0)));
        this.setCreativeTab(CreativeTabs.tabRedstone);
        "".length();
    }
    
    public void explode(final World lllllllllllllIIIllllllIIIllIIlIl, final BlockPos lllllllllllllIIIllllllIIIllIIlII, final IBlockState lllllllllllllIIIllllllIIIllIIIll, final EntityLivingBase lllllllllllllIIIllllllIIIllIIIlI) {
        if (lllIIIlIIllllIl(lllllllllllllIIIllllllIIIllIIlIl.isRemote ? 1 : 0) && lllIIIlIIllllII(((boolean)lllllllllllllIIIllllllIIIllIIIll.getValue((IProperty<Boolean>)BlockTNT.EXPLODE)) ? 1 : 0)) {
            final EntityTNTPrimed lllllllllllllIIIllllllIIIllIIllI = new EntityTNTPrimed(lllllllllllllIIIllllllIIIllIIlIl, lllllllllllllIIIllllllIIIllIIlII.getX() + 0.5f, lllllllllllllIIIllllllIIIllIIlII.getY(), lllllllllllllIIIllllllIIIllIIlII.getZ() + 0.5f, lllllllllllllIIIllllllIIIllIIIlI);
            lllllllllllllIIIllllllIIIllIIlIl.spawnEntityInWorld(lllllllllllllIIIllllllIIIllIIllI);
            "".length();
            lllllllllllllIIIllllllIIIllIIlIl.playSoundAtEntity(lllllllllllllIIIllllllIIIllIIllI, BlockTNT.lIlIIIlIIIIIlI[BlockTNT.lIlIIIlIIIIIll[1]], 1.0f, 1.0f);
        }
    }
    
    @Override
    public void onEntityCollidedWithBlock(final World lllllllllllllIIIllllllIIIIllllII, final BlockPos lllllllllllllIIIllllllIIIIllIlIl, final IBlockState lllllllllllllIIIllllllIIIIlllIlI, final Entity lllllllllllllIIIllllllIIIIlllIIl) {
        if (lllIIIlIIllllIl(lllllllllllllIIIllllllIIIIllllII.isRemote ? 1 : 0) && lllIIIlIIllllII((lllllllllllllIIIllllllIIIIlllIIl instanceof EntityArrow) ? 1 : 0)) {
            final EntityArrow lllllllllllllIIIllllllIIIIlllIII = (EntityArrow)lllllllllllllIIIllllllIIIIlllIIl;
            if (lllIIIlIIllllII(lllllllllllllIIIllllllIIIIlllIII.isBurning() ? 1 : 0)) {
                final IBlockState withProperty = lllllllllllllIIIllllllIIIIllllII.getBlockState(lllllllllllllIIIllllllIIIIllIlIl).withProperty((IProperty<Comparable>)BlockTNT.EXPLODE, (boolean)(BlockTNT.lIlIIIlIIIIIll[1] != 0));
                EntityLivingBase lllllllllllllIIIllllllIIIllIIIlI;
                if (lllIIIlIIllllII((lllllllllllllIIIllllllIIIIlllIII.shootingEntity instanceof EntityLivingBase) ? 1 : 0)) {
                    lllllllllllllIIIllllllIIIllIIIlI = (EntityLivingBase)lllllllllllllIIIllllllIIIIlllIII.shootingEntity;
                    "".length();
                    if (((0x33 ^ 0x78) & ~(0xFB ^ 0xB0)) < 0) {
                        return;
                    }
                }
                else {
                    lllllllllllllIIIllllllIIIllIIIlI = null;
                }
                this.explode(lllllllllllllIIIllllllIIIIllllII, lllllllllllllIIIllllllIIIIllIlIl, withProperty, lllllllllllllIIIllllllIIIllIIIlI);
                lllllllllllllIIIllllllIIIIllllII.setBlockToAir(lllllllllllllIIIllllllIIIIllIlIl);
                "".length();
            }
        }
    }
    
    @Override
    public void onBlockAdded(final World lllllllllllllIIIllllllIIlIIlllIl, final BlockPos lllllllllllllIIIllllllIIlIIlllII, final IBlockState lllllllllllllIIIllllllIIlIIlIlll) {
        super.onBlockAdded(lllllllllllllIIIllllllIIlIIlllIl, lllllllllllllIIIllllllIIlIIlllII, lllllllllllllIIIllllllIIlIIlIlll);
        if (lllIIIlIIllllII(lllllllllllllIIIllllllIIlIIlllIl.isBlockPowered(lllllllllllllIIIllllllIIlIIlllII) ? 1 : 0)) {
            this.onBlockDestroyedByPlayer(lllllllllllllIIIllllllIIlIIlllIl, lllllllllllllIIIllllllIIlIIlllII, lllllllllllllIIIllllllIIlIIlIlll.withProperty((IProperty<Comparable>)BlockTNT.EXPLODE, (boolean)(BlockTNT.lIlIIIlIIIIIll[1] != 0)));
            lllllllllllllIIIllllllIIlIIlllIl.setBlockToAir(lllllllllllllIIIllllllIIlIIlllII);
            "".length();
        }
    }
    
    static {
        lllIIIlIIlllIll();
        lllIIIlIIlllIlI();
        EXPLODE = PropertyBool.create(BlockTNT.lIlIIIlIIIIIlI[BlockTNT.lIlIIIlIIIIIll[0]]);
    }
    
    private static void lllIIIlIIlllIlI() {
        (lIlIIIlIIIIIlI = new String[BlockTNT.lIlIIIlIIIIIll[4]])[BlockTNT.lIlIIIlIIIIIll[0]] = lllIIIlIIlllIII("oMW6CCxMUf8=", "poJPN");
        BlockTNT.lIlIIIlIIIIIlI[BlockTNT.lIlIIIlIIIIIll[1]] = lllIIIlIIlllIIl("YtMyWy8qBAuXBkNh1UtaMg==", "pEHTN");
    }
    
    @Override
    protected BlockState createBlockState() {
        final IProperty[] llllllllllllIllllIIIlIlIIlIIIlll = new IProperty[BlockTNT.lIlIIIlIIIIIll[1]];
        llllllllllllIllllIIIlIlIIlIIIlll[BlockTNT.lIlIIIlIIIIIll[0]] = BlockTNT.EXPLODE;
        return new BlockState(this, llllllllllllIllllIIIlIlIIlIIIlll);
    }
    
    private static boolean lllIIIlIIlllllI(final Object lllllllllllllIIIllllllIIIIIIIlII) {
        return lllllllllllllIIIllllllIIIIIIIlII != null;
    }
    
    @Override
    public boolean onBlockActivated(final World lllllllllllllIIIllllllIIIlIIlIll, final BlockPos lllllllllllllIIIllllllIIIlIlIlII, final IBlockState lllllllllllllIIIllllllIIIlIIlIIl, final EntityPlayer lllllllllllllIIIllllllIIIlIlIIlI, final EnumFacing lllllllllllllIIIllllllIIIlIIIlll, final float lllllllllllllIIIllllllIIIlIIIllI, final float lllllllllllllIIIllllllIIIlIIIlIl, final float lllllllllllllIIIllllllIIIlIIIlII) {
        if (lllIIIlIIlllllI(lllllllllllllIIIllllllIIIlIlIIlI.getCurrentEquippedItem())) {
            final Item lllllllllllllIIIllllllIIIlIIllIl = lllllllllllllIIIllllllIIIlIlIIlI.getCurrentEquippedItem().getItem();
            if (!lllIIIlIIllllll(lllllllllllllIIIllllllIIIlIIllIl, Items.flint_and_steel) || lllIIIlIlIIIIII(lllllllllllllIIIllllllIIIlIIllIl, Items.fire_charge)) {
                this.explode(lllllllllllllIIIllllllIIIlIIlIll, lllllllllllllIIIllllllIIIlIlIlII, lllllllllllllIIIllllllIIIlIIlIIl.withProperty((IProperty<Comparable>)BlockTNT.EXPLODE, (boolean)(BlockTNT.lIlIIIlIIIIIll[1] != 0)), lllllllllllllIIIllllllIIIlIlIIlI);
                lllllllllllllIIIllllllIIIlIIlIll.setBlockToAir(lllllllllllllIIIllllllIIIlIlIlII);
                "".length();
                if (lllIIIlIlIIIIII(lllllllllllllIIIllllllIIIlIIllIl, Items.flint_and_steel)) {
                    lllllllllllllIIIllllllIIIlIlIIlI.getCurrentEquippedItem().damageItem(BlockTNT.lIlIIIlIIIIIll[1], lllllllllllllIIIllllllIIIlIlIIlI);
                    "".length();
                    if ("  ".length() < 0) {
                        return ((0x5E ^ 0x35 ^ (0x1E ^ 0x41)) & (12 + 83 - 32 + 81 ^ 85 + 43 - 107 + 143 ^ -" ".length())) != 0x0;
                    }
                }
                else if (lllIIIlIIllllIl(lllllllllllllIIIllllllIIIlIlIIlI.capabilities.isCreativeMode ? 1 : 0)) {
                    final ItemStack currentEquippedItem = lllllllllllllIIIllllllIIIlIlIIlI.getCurrentEquippedItem();
                    currentEquippedItem.stackSize -= BlockTNT.lIlIIIlIIIIIll[1];
                }
                return BlockTNT.lIlIIIlIIIIIll[1] != 0;
            }
        }
        return super.onBlockActivated(lllllllllllllIIIllllllIIIlIIlIll, lllllllllllllIIIllllllIIIlIlIlII, lllllllllllllIIIllllllIIIlIIlIIl, lllllllllllllIIIllllllIIIlIlIIlI, lllllllllllllIIIllllllIIIlIIIlll, lllllllllllllIIIllllllIIIlIIIllI, lllllllllllllIIIllllllIIIlIIIlIl, lllllllllllllIIIllllllIIIlIIIlII);
    }
    
    private static void lllIIIlIIlllIll() {
        (lIlIIIlIIIIIll = new int[5])[0] = ((0x12 ^ 0x9) & ~(0xBB ^ 0xA0));
        BlockTNT.lIlIIIlIIIIIll[1] = " ".length();
        BlockTNT.lIlIIIlIIIIIll[2] = (0x82 ^ 0x85 ^ "   ".length());
        BlockTNT.lIlIIIlIIIIIll[3] = (0xE4 ^ 0xAD ^ (0xE3 ^ 0xA2));
        BlockTNT.lIlIIIlIIIIIll[4] = "  ".length();
    }
    
    private static boolean lllIIIlIIllllII(final int lllllllllllllIIIlllllIlllllllllI) {
        return lllllllllllllIIIlllllIlllllllllI != 0;
    }
    
    @Override
    public void onBlockDestroyedByPlayer(final World lllllllllllllIIIllllllIIIlllIIll, final BlockPos lllllllllllllIIIllllllIIIlllIIlI, final IBlockState lllllllllllllIIIllllllIIIlllIlIl) {
        this.explode(lllllllllllllIIIllllllIIIlllIIll, lllllllllllllIIIllllllIIIlllIIlI, lllllllllllllIIIllllllIIIlllIlIl, null);
    }
    
    private static String lllIIIlIIlllIII(final String lllllllllllllIIIllllllIIIIIIllll, final String lllllllllllllIIIllllllIIIIIIlllI) {
        try {
            final SecretKeySpec lllllllllllllIIIllllllIIIIIlIIlI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIIIllllllIIIIIIlllI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lllllllllllllIIIllllllIIIIIlIIIl = Cipher.getInstance("Blowfish");
            lllllllllllllIIIllllllIIIIIlIIIl.init(BlockTNT.lIlIIIlIIIIIll[4], lllllllllllllIIIllllllIIIIIlIIlI);
            return new String(lllllllllllllIIIllllllIIIIIlIIIl.doFinal(Base64.getDecoder().decode(lllllllllllllIIIllllllIIIIIIllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIIllllllIIIIIlIIII) {
            lllllllllllllIIIllllllIIIIIlIIII.printStackTrace();
            return null;
        }
    }
    
    @Override
    public IBlockState getStateFromMeta(final int lllllllllllllIIIllllllIIIIlIllIl) {
        final IBlockState defaultState = this.getDefaultState();
        final PropertyBool explode = BlockTNT.EXPLODE;
        int b;
        if (lllIIIlIlIIIIIl(lllllllllllllIIIllllllIIIIlIllIl & BlockTNT.lIlIIIlIIIIIll[1])) {
            b = BlockTNT.lIlIIIlIIIIIll[1];
            "".length();
            if ((0x1 ^ 0x5) > (0x29 ^ 0x2D)) {
                return null;
            }
        }
        else {
            b = BlockTNT.lIlIIIlIIIIIll[0];
        }
        return defaultState.withProperty((IProperty<Comparable>)explode, (boolean)(b != 0));
    }
    
    private static boolean lllIIIlIlIIIIIl(final int lllllllllllllIIIlllllIlllllllIlI) {
        return lllllllllllllIIIlllllIlllllllIlI > 0;
    }
    
    @Override
    public int getMetaFromState(final IBlockState lllllllllllllIIIllllllIIIIlIIlll) {
        int n;
        if (lllIIIlIIllllII(((boolean)lllllllllllllIIIllllllIIIIlIIlll.getValue((IProperty<Boolean>)BlockTNT.EXPLODE)) ? 1 : 0)) {
            n = BlockTNT.lIlIIIlIIIIIll[1];
            "".length();
            if ("  ".length() == -" ".length()) {
                return (0x2B ^ 0x1E ^ (0x96 ^ 0x98)) & (0x7F ^ 0x6B ^ (0x1D ^ 0x32) ^ -" ".length());
            }
        }
        else {
            n = BlockTNT.lIlIIIlIIIIIll[0];
        }
        return n;
    }
    
    private static boolean lllIIIlIlIIIIII(final Object lllllllllllllIIIllllllIIIIIIIIIl, final Object lllllllllllllIIIllllllIIIIIIIIII) {
        return lllllllllllllIIIllllllIIIIIIIIIl == lllllllllllllIIIllllllIIIIIIIIII;
    }
    
    private static String lllIIIlIIlllIIl(final String lllllllllllllIIIllllllIIIIIlllII, final String lllllllllllllIIIllllllIIIIIllIIl) {
        try {
            final SecretKeySpec lllllllllllllIIIllllllIIIIIlllll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIIIllllllIIIIIllIIl.getBytes(StandardCharsets.UTF_8)), BlockTNT.lIlIIIlIIIIIll[3]), "DES");
            final Cipher lllllllllllllIIIllllllIIIIIllllI = Cipher.getInstance("DES");
            lllllllllllllIIIllllllIIIIIllllI.init(BlockTNT.lIlIIIlIIIIIll[4], lllllllllllllIIIllllllIIIIIlllll);
            return new String(lllllllllllllIIIllllllIIIIIllllI.doFinal(Base64.getDecoder().decode(lllllllllllllIIIllllllIIIIIlllII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIIllllllIIIIIlllIl) {
            lllllllllllllIIIllllllIIIIIlllIl.printStackTrace();
            return null;
        }
    }
    
    private static boolean lllIIIlIIllllIl(final int lllllllllllllIIIlllllIllllllllII) {
        return lllllllllllllIIIlllllIllllllllII == 0;
    }
    
    private static boolean lllIIIlIIllllll(final Object lllllllllllllIIIllllllIIIIIIIlll, final Object lllllllllllllIIIllllllIIIIIIIllI) {
        return lllllllllllllIIIllllllIIIIIIIlll != lllllllllllllIIIllllllIIIIIIIllI;
    }
}
