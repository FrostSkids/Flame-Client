// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.block;

import net.minecraft.util.Vec3i;
import java.util.Iterator;
import net.minecraft.util.IStringSerializable;
import java.util.Random;
import net.minecraft.util.EnumWorldBlockLayer;
import net.minecraft.world.IBlockAccess;
import net.minecraft.util.IChatComponent;
import net.minecraft.util.ChatComponentTranslation;
import net.minecraft.entity.Entity;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.util.EnumFacing;
import net.minecraft.block.state.BlockState;
import net.minecraft.block.state.IBlockState;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.material.Material;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.BlockPos;
import net.minecraft.world.World;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import net.minecraft.block.properties.PropertyBool;
import net.minecraft.block.properties.PropertyEnum;

public class BlockBed extends BlockDirectional
{
    private static final /* synthetic */ int[] llIIlIllllllll;
    public static final /* synthetic */ PropertyEnum<EnumPartType> PART;
    public static final /* synthetic */ PropertyBool OCCUPIED;
    private static final /* synthetic */ String[] llIIlIlllllllI;
    
    private static boolean lIIIlllIIIllIIII(final int llllllllllllIlllIIIIllIIllIlllII) {
        return llllllllllllIlllIIIIllIIllIlllII <= 0;
    }
    
    private static String lIIIlllIIIlIlIII(final String llllllllllllIlllIIIIllIlIIIlIIIl, final String llllllllllllIlllIIIIllIlIIIlIIII) {
        try {
            final SecretKeySpec llllllllllllIlllIIIIllIlIIIlIlII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIlllIIIIllIlIIIlIIII.getBytes(StandardCharsets.UTF_8)), BlockBed.llIIlIllllllll[5]), "DES");
            final Cipher llllllllllllIlllIIIIllIlIIIlIIll = Cipher.getInstance("DES");
            llllllllllllIlllIIIIllIlIIIlIIll.init(BlockBed.llIIlIllllllll[2], llllllllllllIlllIIIIllIlIIIlIlII);
            return new String(llllllllllllIlllIIIIllIlIIIlIIll.doFinal(Base64.getDecoder().decode(llllllllllllIlllIIIIllIlIIIlIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIlllIIIIllIlIIIlIIlI) {
            llllllllllllIlllIIIIllIlIIIlIIlI.printStackTrace();
            return null;
        }
    }
    
    private EntityPlayer getPlayerInBed(final World llllllllllllIlllIIIIllIlllIIIlIl, final BlockPos llllllllllllIlllIIIIllIlllIIIlll) {
        final float llllllllllllIlllIIIIllIlllIIIIlI = (float)llllllllllllIlllIIIIllIlllIIIlIl.playerEntities.iterator();
        "".length();
        if ("  ".length() > "  ".length()) {
            return null;
        }
        while (!lIIIlllIIIlIllll(((Iterator)llllllllllllIlllIIIIllIlllIIIIlI).hasNext() ? 1 : 0)) {
            final EntityPlayer llllllllllllIlllIIIIllIlllIIIllI = ((Iterator<EntityPlayer>)llllllllllllIlllIIIIllIlllIIIIlI).next();
            if (lIIIlllIIIlIlIll(llllllllllllIlllIIIIllIlllIIIllI.isPlayerSleeping() ? 1 : 0) && lIIIlllIIIlIlIll(llllllllllllIlllIIIIllIlllIIIllI.playerLocation.equals(llllllllllllIlllIIIIllIlllIIIlll) ? 1 : 0)) {
                return llllllllllllIlllIIIIllIlllIIIllI;
            }
        }
        return null;
    }
    
    private static void lIIIlllIIIlIlIIl() {
        (llIIlIlllllllI = new String[BlockBed.llIIlIllllllll[6]])[BlockBed.llIIlIllllllll[0]] = lIIIlllIIIlIIllI("BiQ2Pw==", "vEDKs");
        BlockBed.llIIlIlllllllI[BlockBed.llIIlIllllllll[1]] = lIIIlllIIIlIIlll("5M/0KdMfaHch8i7Q6dbh8Q==", "QLTmK");
        BlockBed.llIIlIlllllllI[BlockBed.llIIlIllllllll[2]] = lIIIlllIIIlIlIII("Z8FgAbDuf7K7QOC1Bw/qBNKaPRq9o95o", "kelAB");
        BlockBed.llIIlIlllllllI[BlockBed.llIIlIllllllll[4]] = lIIIlllIIIlIIlll("lBc0DwejU30iKXg8AUNy/hbACvINY9G1", "lnKoE");
        BlockBed.llIIlIlllllllI[BlockBed.llIIlIllllllll[3]] = lIIIlllIIIlIlIII("OTfaSkcvob1MKUnTxIn7QClrZU5fMyhz", "BzjZg");
    }
    
    @Override
    public Item getItem(final World llllllllllllIlllIIIIllIlIlIllIll, final BlockPos llllllllllllIlllIIIIllIlIlIllIlI) {
        return Items.bed;
    }
    
    private static boolean lIIIlllIIIlIllll(final int llllllllllllIlllIIIIllIIllIllllI) {
        return llllllllllllIlllIIIIllIIllIllllI == 0;
    }
    
    private static boolean lIIIlllIIIlIlllI(final Object llllllllllllIlllIIIIllIIlllIIIll, final Object llllllllllllIlllIIIIllIIlllIIIlI) {
        return llllllllllllIlllIIIIllIIlllIIIll == llllllllllllIlllIIIIllIIlllIIIlI;
    }
    
    public BlockBed() {
        super(Material.cloth);
        this.setDefaultState(this.blockState.getBaseState().withProperty(BlockBed.PART, EnumPartType.FOOT).withProperty((IProperty<Comparable>)BlockBed.OCCUPIED, (boolean)(BlockBed.llIIlIllllllll[0] != 0)));
        this.setBedBounds();
    }
    
    @Override
    public void dropBlockAsItemWithChance(final World llllllllllllIlllIIIIllIlIllIIIlI, final BlockPos llllllllllllIlllIIIIllIlIllIIlll, final IBlockState llllllllllllIlllIIIIllIlIllIIllI, final float llllllllllllIlllIIIIllIlIllIIlIl, final int llllllllllllIlllIIIIllIlIllIIlII) {
        if (lIIIlllIIIlIlllI(llllllllllllIlllIIIIllIlIllIIllI.getValue(BlockBed.PART), EnumPartType.FOOT)) {
            super.dropBlockAsItemWithChance(llllllllllllIlllIIIIllIlIllIIIlI, llllllllllllIlllIIIIllIlIllIIlll, llllllllllllIlllIIIIllIlIllIIllI, llllllllllllIlllIIIIllIlIllIIlIl, BlockBed.llIIlIllllllll[0]);
        }
    }
    
    private static boolean lIIIlllIIIlIllIl(final Object llllllllllllIlllIIIIllIIlllIIllI) {
        return llllllllllllIlllIIIIllIIlllIIllI != null;
    }
    
    @Override
    protected BlockState createBlockState() {
        final IProperty[] llllllllllllIllllIIIlIlIIlIIIlll = new IProperty[BlockBed.llIIlIllllllll[4]];
        llllllllllllIllllIIIlIlIIlIIIlll[BlockBed.llIIlIllllllll[0]] = BlockBed.FACING;
        llllllllllllIllllIIIlIlIIlIIIlll[BlockBed.llIIlIllllllll[1]] = BlockBed.PART;
        llllllllllllIllllIIIlIlIIlIIIlll[BlockBed.llIIlIllllllll[2]] = BlockBed.OCCUPIED;
        return new BlockState(this, llllllllllllIllllIIIlIlIIlIIIlll);
    }
    
    private static boolean lIIIlllIIIllIIIl(final int llllllllllllIlllIIIIllIIlllIllIl, final int llllllllllllIlllIIIIllIIlllIllII) {
        return llllllllllllIlllIIIIllIIlllIllIl > llllllllllllIlllIIIIllIIlllIllII;
    }
    
    @Override
    public boolean onBlockActivated(final World llllllllllllIlllIIIIllIlllIllllI, BlockPos llllllllllllIlllIIIIllIlllIlIIIl, IBlockState llllllllllllIlllIIIIllIlllIlIIII, final EntityPlayer llllllllllllIlllIIIIllIlllIllIll, final EnumFacing llllllllllllIlllIIIIllIlllIllIlI, final float llllllllllllIlllIIIIllIlllIllIIl, final float llllllllllllIlllIIIIllIlllIllIII, final float llllllllllllIlllIIIIllIlllIlIlll) {
        if (lIIIlllIIIlIlIll(llllllllllllIlllIIIIllIlllIllllI.isRemote ? 1 : 0)) {
            return BlockBed.llIIlIllllllll[1] != 0;
        }
        if (lIIIlllIIIlIllII(((IBlockState)llllllllllllIlllIIIIllIlllIlIIII).getValue((IProperty<EnumPartType>)BlockBed.PART), EnumPartType.HEAD)) {
            llllllllllllIlllIIIIllIlllIlIIIl = ((BlockPos)llllllllllllIlllIIIIllIlllIlIIIl).offset(((IBlockState)llllllllllllIlllIIIIllIlllIlIIII).getValue((IProperty<EnumFacing>)BlockBed.FACING));
            llllllllllllIlllIIIIllIlllIlIIII = llllllllllllIlllIIIIllIlllIllllI.getBlockState((BlockPos)llllllllllllIlllIIIIllIlllIlIIIl);
            if (lIIIlllIIIlIllII(((IBlockState)llllllllllllIlllIIIIllIlllIlIIII).getBlock(), this)) {
                return BlockBed.llIIlIllllllll[1] != 0;
            }
        }
        if (!lIIIlllIIIlIlIll(llllllllllllIlllIIIIllIlllIllllI.provider.canRespawnHere() ? 1 : 0) || !lIIIlllIIIlIllII(llllllllllllIlllIIIIllIlllIllllI.getBiomeGenForCoords((BlockPos)llllllllllllIlllIIIIllIlllIlIIIl), BiomeGenBase.hell)) {
            llllllllllllIlllIIIIllIlllIllllI.setBlockToAir((BlockPos)llllllllllllIlllIIIIllIlllIlIIIl);
            "".length();
            final BlockPos llllllllllllIlllIIIIllIlllIlIlII = ((BlockPos)llllllllllllIlllIIIIllIlllIlIIIl).offset(((IBlockState)llllllllllllIlllIIIIllIlllIlIIII).getValue((IProperty<EnumFacing>)BlockBed.FACING).getOpposite());
            if (lIIIlllIIIlIlllI(llllllllllllIlllIIIIllIlllIllllI.getBlockState(llllllllllllIlllIIIIllIlllIlIlII).getBlock(), this)) {
                llllllllllllIlllIIIIllIlllIllllI.setBlockToAir(llllllllllllIlllIIIIllIlllIlIlII);
                "".length();
            }
            llllllllllllIlllIIIIllIlllIllllI.newExplosion(null, ((Vec3i)llllllllllllIlllIIIIllIlllIlIIIl).getX() + 0.5, ((Vec3i)llllllllllllIlllIIIIllIlllIlIIIl).getY() + 0.5, ((Vec3i)llllllllllllIlllIIIIllIlllIlIIIl).getZ() + 0.5, 5.0f, (boolean)(BlockBed.llIIlIllllllll[1] != 0), (boolean)(BlockBed.llIIlIllllllll[1] != 0));
            "".length();
            return BlockBed.llIIlIllllllll[1] != 0;
        }
        if (lIIIlllIIIlIlIll(((boolean)((IBlockState)llllllllllllIlllIIIIllIlllIlIIII).getValue((IProperty<Boolean>)BlockBed.OCCUPIED)) ? 1 : 0)) {
            final EntityPlayer llllllllllllIlllIIIIllIlllIlIllI = this.getPlayerInBed(llllllllllllIlllIIIIllIlllIllllI, (BlockPos)llllllllllllIlllIIIIllIlllIlIIIl);
            if (lIIIlllIIIlIllIl(llllllllllllIlllIIIIllIlllIlIllI)) {
                llllllllllllIlllIIIIllIlllIllIll.addChatComponentMessage(new ChatComponentTranslation(BlockBed.llIIlIlllllllI[BlockBed.llIIlIllllllll[2]], new Object[BlockBed.llIIlIllllllll[0]]));
                return BlockBed.llIIlIllllllll[1] != 0;
            }
            llllllllllllIlllIIIIllIlllIlIIII = ((IBlockState)llllllllllllIlllIIIIllIlllIlIIII).withProperty((IProperty<Comparable>)BlockBed.OCCUPIED, Boolean.valueOf((boolean)(BlockBed.llIIlIllllllll[0] != 0)));
            llllllllllllIlllIIIIllIlllIllllI.setBlockState((BlockPos)llllllllllllIlllIIIIllIlllIlIIIl, (IBlockState)llllllllllllIlllIIIIllIlllIlIIII, BlockBed.llIIlIllllllll[3]);
            "".length();
        }
        final EntityPlayer.EnumStatus llllllllllllIlllIIIIllIlllIlIlIl = llllllllllllIlllIIIIllIlllIllIll.trySleep((BlockPos)llllllllllllIlllIIIIllIlllIlIIIl);
        if (lIIIlllIIIlIlllI(llllllllllllIlllIIIIllIlllIlIlIl, EntityPlayer.EnumStatus.OK)) {
            llllllllllllIlllIIIIllIlllIlIIII = ((IBlockState)llllllllllllIlllIIIIllIlllIlIIII).withProperty((IProperty<Comparable>)BlockBed.OCCUPIED, Boolean.valueOf((boolean)(BlockBed.llIIlIllllllll[1] != 0)));
            llllllllllllIlllIIIIllIlllIllllI.setBlockState((BlockPos)llllllllllllIlllIIIIllIlllIlIIIl, (IBlockState)llllllllllllIlllIIIIllIlllIlIIII, BlockBed.llIIlIllllllll[3]);
            "".length();
            return BlockBed.llIIlIllllllll[1] != 0;
        }
        if (lIIIlllIIIlIlllI(llllllllllllIlllIIIIllIlllIlIlIl, EntityPlayer.EnumStatus.NOT_POSSIBLE_NOW)) {
            llllllllllllIlllIIIIllIlllIllIll.addChatComponentMessage(new ChatComponentTranslation(BlockBed.llIIlIlllllllI[BlockBed.llIIlIllllllll[4]], new Object[BlockBed.llIIlIllllllll[0]]));
            "".length();
            if (((0xB6 ^ 0xBC) & ~(0x60 ^ 0x6A)) != 0x0) {
                return ((0x7B ^ 0x71) & ~(0x39 ^ 0x33)) != 0x0;
            }
        }
        else if (lIIIlllIIIlIlllI(llllllllllllIlllIIIIllIlllIlIlIl, EntityPlayer.EnumStatus.NOT_SAFE)) {
            llllllllllllIlllIIIIllIlllIllIll.addChatComponentMessage(new ChatComponentTranslation(BlockBed.llIIlIlllllllI[BlockBed.llIIlIllllllll[3]], new Object[BlockBed.llIIlIllllllll[0]]));
        }
        return BlockBed.llIIlIllllllll[1] != 0;
    }
    
    @Override
    public IBlockState getActualState(IBlockState llllllllllllIlllIIIIllIlIIllIIll, final IBlockAccess llllllllllllIlllIIIIllIlIIllIIlI, final BlockPos llllllllllllIlllIIIIllIlIIllIIIl) {
        if (lIIIlllIIIlIlllI(llllllllllllIlllIIIIllIlIIllIIll.getValue(BlockBed.PART), EnumPartType.FOOT)) {
            final IBlockState llllllllllllIlllIIIIllIlIIllIlIl = llllllllllllIlllIIIIllIlIIllIIlI.getBlockState(llllllllllllIlllIIIIllIlIIllIIIl.offset(llllllllllllIlllIIIIllIlIIllIIll.getValue((IProperty<EnumFacing>)BlockBed.FACING)));
            if (lIIIlllIIIlIlllI(llllllllllllIlllIIIIllIlIIllIlIl.getBlock(), this)) {
                llllllllllllIlllIIIIllIlIIllIIll = llllllllllllIlllIIIIllIlIIllIIll.withProperty((IProperty<Comparable>)BlockBed.OCCUPIED, (Boolean)llllllllllllIlllIIIIllIlIIllIlIl.getValue((IProperty<V>)BlockBed.OCCUPIED));
            }
        }
        return llllllllllllIlllIIIIllIlIIllIIll;
    }
    
    private static boolean lIIIlllIIIlIlIll(final int llllllllllllIlllIIIIllIIlllIIIII) {
        return llllllllllllIlllIIIIllIIlllIIIII != 0;
    }
    
    @Override
    public EnumWorldBlockLayer getBlockLayer() {
        return EnumWorldBlockLayer.CUTOUT;
    }
    
    @Override
    public void onBlockHarvested(final World llllllllllllIlllIIIIllIlIlIlIIlI, final BlockPos llllllllllllIlllIIIIllIlIlIlIIIl, final IBlockState llllllllllllIlllIIIIllIlIlIlIIII, final EntityPlayer llllllllllllIlllIIIIllIlIlIIllll) {
        if (lIIIlllIIIlIlIll(llllllllllllIlllIIIIllIlIlIIllll.capabilities.isCreativeMode ? 1 : 0) && lIIIlllIIIlIlllI(llllllllllllIlllIIIIllIlIlIlIIII.getValue(BlockBed.PART), EnumPartType.HEAD)) {
            final BlockPos llllllllllllIlllIIIIllIlIlIIlllI = llllllllllllIlllIIIIllIlIlIlIIIl.offset(llllllllllllIlllIIIIllIlIlIlIIII.getValue((IProperty<EnumFacing>)BlockBed.FACING).getOpposite());
            if (lIIIlllIIIlIlllI(llllllllllllIlllIIIIllIlIlIlIIlI.getBlockState(llllllllllllIlllIIIIllIlIlIIlllI).getBlock(), this)) {
                llllllllllllIlllIIIIllIlIlIlIIlI.setBlockToAir(llllllllllllIlllIIIIllIlIlIIlllI);
                "".length();
            }
        }
    }
    
    @Override
    public int getMetaFromState(final IBlockState llllllllllllIlllIIIIllIlIIlIlIlI) {
        int llllllllllllIlllIIIIllIlIIlIlIll = BlockBed.llIIlIllllllll[0];
        llllllllllllIlllIIIIllIlIIlIlIll |= llllllllllllIlllIIIIllIlIIlIlIlI.getValue((IProperty<EnumFacing>)BlockBed.FACING).getHorizontalIndex();
        if (lIIIlllIIIlIlllI(llllllllllllIlllIIIIllIlIIlIlIlI.getValue(BlockBed.PART), EnumPartType.HEAD)) {
            llllllllllllIlllIIIIllIlIIlIlIll |= BlockBed.llIIlIllllllll[5];
            if (lIIIlllIIIlIlIll(((boolean)llllllllllllIlllIIIIllIlIIlIlIlI.getValue((IProperty<Boolean>)BlockBed.OCCUPIED)) ? 1 : 0)) {
                llllllllllllIlllIIIIllIlIIlIlIll |= BlockBed.llIIlIllllllll[3];
            }
        }
        return llllllllllllIlllIIIIllIlIIlIlIll;
    }
    
    @Override
    public Item getItemDropped(final IBlockState llllllllllllIlllIIIIllIllIlIIlIl, final Random llllllllllllIlllIIIIllIllIlIIlll, final int llllllllllllIlllIIIIllIllIlIIllI) {
        Item bed;
        if (lIIIlllIIIlIlllI(llllllllllllIlllIIIIllIllIlIIlIl.getValue(BlockBed.PART), EnumPartType.HEAD)) {
            bed = null;
            "".length();
            if (((0xA5 ^ 0xA1 ^ (0x48 ^ 0x2D)) & (210 + 227 - 377 + 180 ^ 48 + 93 - 21 + 25 ^ -" ".length())) != ((196 + 59 - 149 + 146 ^ 111 + 4 - 49 + 94) & (83 + 32 + 51 + 60 ^ 153 + 31 - 60 + 66 ^ -" ".length()))) {
                return null;
            }
        }
        else {
            bed = Items.bed;
        }
        return bed;
    }
    
    @Override
    public boolean isFullCube() {
        return BlockBed.llIIlIllllllll[0] != 0;
    }
    
    private static boolean lIIIlllIIIlIllII(final Object llllllllllllIlllIIIIllIIlllIlIIl, final Object llllllllllllIlllIIIIllIIlllIlIII) {
        return llllllllllllIlllIIIIllIIlllIlIIl != llllllllllllIlllIIIIllIIlllIlIII;
    }
    
    private static boolean lIIIlllIIIllIIll(final int llllllllllllIlllIIIIllIIllllIIIl, final int llllllllllllIlllIIIIllIIllllIIII) {
        return llllllllllllIlllIIIIllIIllllIIIl < llllllllllllIlllIIIIllIIllllIIII;
    }
    
    private void setBedBounds() {
        this.setBlockBounds(0.0f, 0.0f, 0.0f, 1.0f, 0.5625f, 1.0f);
    }
    
    protected static boolean hasRoomForPlayer(final World llllllllllllIlllIIIIllIlIlllIIlI, final BlockPos llllllllllllIlllIIIIllIlIlllIIIl) {
        if (lIIIlllIIIlIlIll(World.doesBlockHaveSolidTopSurface(llllllllllllIlllIIIIllIlIlllIIlI, llllllllllllIlllIIIIllIlIlllIIIl.down()) ? 1 : 0) && lIIIlllIIIlIllll(llllllllllllIlllIIIIllIlIlllIIlI.getBlockState(llllllllllllIlllIIIIllIlIlllIIIl).getBlock().getMaterial().isSolid() ? 1 : 0) && lIIIlllIIIlIllll(llllllllllllIlllIIIIllIlIlllIIlI.getBlockState(llllllllllllIlllIIIIllIlIlllIIIl.up()).getBlock().getMaterial().isSolid() ? 1 : 0)) {
            return BlockBed.llIIlIllllllll[1] != 0;
        }
        return BlockBed.llIIlIllllllll[0] != 0;
    }
    
    public static BlockPos getSafeExitLocation(final World llllllllllllIlllIIIIllIllIIlIIlI, final BlockPos llllllllllllIlllIIIIllIllIIlIIIl, int llllllllllllIlllIIIIllIllIIlIIII) {
        final EnumFacing llllllllllllIlllIIIIllIllIIIllll = llllllllllllIlllIIIIllIllIIlIIlI.getBlockState(llllllllllllIlllIIIIllIllIIlIIIl).getValue((IProperty<EnumFacing>)BlockBed.FACING);
        final int llllllllllllIlllIIIIllIllIIIlllI = llllllllllllIlllIIIIllIllIIlIIIl.getX();
        final int llllllllllllIlllIIIIllIllIIIllIl = llllllllllllIlllIIIIllIllIIlIIIl.getY();
        final int llllllllllllIlllIIIIllIllIIIllII = llllllllllllIlllIIIIllIllIIlIIIl.getZ();
        int llllllllllllIlllIIIIllIllIIIlIll = BlockBed.llIIlIllllllll[0];
        "".length();
        if ("  ".length() <= 0) {
            return null;
        }
        while (!lIIIlllIIIllIIIl(llllllllllllIlllIIIIllIllIIIlIll, BlockBed.llIIlIllllllll[1])) {
            final int llllllllllllIlllIIIIllIllIIIlIlI = llllllllllllIlllIIIIllIllIIIlllI - llllllllllllIlllIIIIllIllIIIllll.getFrontOffsetX() * llllllllllllIlllIIIIllIllIIIlIll - BlockBed.llIIlIllllllll[1];
            final int llllllllllllIlllIIIIllIllIIIlIIl = llllllllllllIlllIIIIllIllIIIllII - llllllllllllIlllIIIIllIllIIIllll.getFrontOffsetZ() * llllllllllllIlllIIIIllIllIIIlIll - BlockBed.llIIlIllllllll[1];
            final int llllllllllllIlllIIIIllIllIIIlIII = llllllllllllIlllIIIIllIllIIIlIlI + BlockBed.llIIlIllllllll[2];
            final int llllllllllllIlllIIIIllIllIIIIlll = llllllllllllIlllIIIIllIllIIIlIIl + BlockBed.llIIlIllllllll[2];
            int llllllllllllIlllIIIIllIllIIIIllI = llllllllllllIlllIIIIllIllIIIlIlI;
            "".length();
            if (-"  ".length() > 0) {
                return null;
            }
            while (!lIIIlllIIIllIIIl(llllllllllllIlllIIIIllIllIIIIllI, llllllllllllIlllIIIIllIllIIIlIII)) {
                int llllllllllllIlllIIIIllIllIIIIlIl = llllllllllllIlllIIIIllIllIIIlIIl;
                "".length();
                if ("   ".length() != "   ".length()) {
                    return null;
                }
                while (!lIIIlllIIIllIIIl(llllllllllllIlllIIIIllIllIIIIlIl, llllllllllllIlllIIIIllIllIIIIlll)) {
                    final BlockPos llllllllllllIlllIIIIllIllIIIIlII = new BlockPos(llllllllllllIlllIIIIllIllIIIIllI, llllllllllllIlllIIIIllIllIIIllIl, llllllllllllIlllIIIIllIllIIIIlIl);
                    if (lIIIlllIIIlIlIll(hasRoomForPlayer(llllllllllllIlllIIIIllIllIIlIIlI, llllllllllllIlllIIIIllIllIIIIlII) ? 1 : 0)) {
                        if (lIIIlllIIIllIIII(llllllllllllIlllIIIIllIllIIlIIII)) {
                            return llllllllllllIlllIIIIllIllIIIIlII;
                        }
                        --llllllllllllIlllIIIIllIllIIlIIII;
                    }
                    ++llllllllllllIlllIIIIllIllIIIIlIl;
                }
                ++llllllllllllIlllIIIIllIllIIIIllI;
            }
            ++llllllllllllIlllIIIIllIllIIIlIll;
        }
        return null;
    }
    
    private static String lIIIlllIIIlIIllI(String llllllllllllIlllIIIIllIIllllllII, final String llllllllllllIlllIIIIllIlIIIIIIII) {
        llllllllllllIlllIIIIllIIllllllII = new String(Base64.getDecoder().decode(llllllllllllIlllIIIIllIIllllllII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder llllllllllllIlllIIIIllIIllllllll = new StringBuilder();
        final char[] llllllllllllIlllIIIIllIIlllllllI = llllllllllllIlllIIIIllIlIIIIIIII.toCharArray();
        int llllllllllllIlllIIIIllIIllllllIl = BlockBed.llIIlIllllllll[0];
        final boolean llllllllllllIlllIIIIllIIllllIlll = (Object)llllllllllllIlllIIIIllIIllllllII.toCharArray();
        final String llllllllllllIlllIIIIllIIllllIllI = (String)llllllllllllIlllIIIIllIIllllIlll.length;
        char llllllllllllIlllIIIIllIIllllIlIl = (char)BlockBed.llIIlIllllllll[0];
        while (lIIIlllIIIllIIll(llllllllllllIlllIIIIllIIllllIlIl, (int)llllllllllllIlllIIIIllIIllllIllI)) {
            final char llllllllllllIlllIIIIllIlIIIIIIlI = llllllllllllIlllIIIIllIIllllIlll[llllllllllllIlllIIIIllIIllllIlIl];
            llllllllllllIlllIIIIllIIllllllll.append((char)(llllllllllllIlllIIIIllIlIIIIIIlI ^ llllllllllllIlllIIIIllIIlllllllI[llllllllllllIlllIIIIllIIllllllIl % llllllllllllIlllIIIIllIIlllllllI.length]));
            "".length();
            ++llllllllllllIlllIIIIllIIllllllIl;
            ++llllllllllllIlllIIIIllIIllllIlIl;
            "".length();
            if ((0xAD ^ 0xA9) == " ".length()) {
                return null;
            }
        }
        return String.valueOf(llllllllllllIlllIIIIllIIllllllll);
    }
    
    @Override
    public IBlockState getStateFromMeta(final int llllllllllllIlllIIIIllIlIlIIIIll) {
        final EnumFacing llllllllllllIlllIIIIllIlIlIIIIlI = EnumFacing.getHorizontal(llllllllllllIlllIIIIllIlIlIIIIll);
        IBlockState blockState;
        if (lIIIlllIIIllIIlI(llllllllllllIlllIIIIllIlIlIIIIll & BlockBed.llIIlIllllllll[5])) {
            final IBlockState withProperty = this.getDefaultState().withProperty(BlockBed.PART, EnumPartType.HEAD).withProperty((IProperty<Comparable>)BlockBed.FACING, llllllllllllIlllIIIIllIlIlIIIIlI);
            final PropertyBool occupied = BlockBed.OCCUPIED;
            int b;
            if (lIIIlllIIIllIIlI(llllllllllllIlllIIIIllIlIlIIIIll & BlockBed.llIIlIllllllll[3])) {
                b = BlockBed.llIIlIllllllll[1];
                "".length();
                if (null != null) {
                    return null;
                }
            }
            else {
                b = BlockBed.llIIlIllllllll[0];
            }
            blockState = withProperty.withProperty((IProperty<Comparable>)occupied, (boolean)(b != 0));
            "".length();
            if ("   ".length() >= (0x6D ^ 0x2 ^ (0x1E ^ 0x75))) {
                return null;
            }
        }
        else {
            blockState = this.getDefaultState().withProperty(BlockBed.PART, EnumPartType.FOOT).withProperty((IProperty<Comparable>)BlockBed.FACING, llllllllllllIlllIIIIllIlIlIIIIlI);
        }
        return blockState;
    }
    
    private static String lIIIlllIIIlIIlll(final String llllllllllllIlllIIIIllIlIIIlllII, final String llllllllllllIlllIIIIllIlIIIlllIl) {
        try {
            final SecretKeySpec llllllllllllIlllIIIIllIlIIlIIIIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIlllIIIIllIlIIIlllIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher llllllllllllIlllIIIIllIlIIlIIIII = Cipher.getInstance("Blowfish");
            llllllllllllIlllIIIIllIlIIlIIIII.init(BlockBed.llIIlIllllllll[2], llllllllllllIlllIIIIllIlIIlIIIIl);
            return new String(llllllllllllIlllIIIIllIlIIlIIIII.doFinal(Base64.getDecoder().decode(llllllllllllIlllIIIIllIlIIIlllII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIlllIIIIllIlIIIlllll) {
            llllllllllllIlllIIIIllIlIIIlllll.printStackTrace();
            return null;
        }
    }
    
    @Override
    public void setBlockBoundsBasedOnState(final IBlockAccess llllllllllllIlllIIIIllIllIllllIl, final BlockPos llllllllllllIlllIIIIllIllIllllII) {
        this.setBedBounds();
    }
    
    @Override
    public int getMobilityFlag() {
        return BlockBed.llIIlIllllllll[1];
    }
    
    private static boolean lIIIlllIIIllIIlI(final int llllllllllllIlllIIIIllIIllIllIlI) {
        return llllllllllllIlllIIIIllIIllIllIlI > 0;
    }
    
    @Override
    public boolean isOpaqueCube() {
        return BlockBed.llIIlIllllllll[0] != 0;
    }
    
    static {
        lIIIlllIIIlIlIlI();
        lIIIlllIIIlIlIIl();
        PART = PropertyEnum.create(BlockBed.llIIlIlllllllI[BlockBed.llIIlIllllllll[0]], EnumPartType.class);
        OCCUPIED = PropertyBool.create(BlockBed.llIIlIlllllllI[BlockBed.llIIlIllllllll[1]]);
    }
    
    @Override
    public void onNeighborBlockChange(final World llllllllllllIlllIIIIllIllIlIlllI, final BlockPos llllllllllllIlllIIIIllIllIlIllIl, final IBlockState llllllllllllIlllIIIIllIllIlIllII, final Block llllllllllllIlllIIIIllIllIllIIIl) {
        final EnumFacing llllllllllllIlllIIIIllIllIllIIII = llllllllllllIlllIIIIllIllIlIllII.getValue((IProperty<EnumFacing>)BlockBed.FACING);
        if (lIIIlllIIIlIlllI(llllllllllllIlllIIIIllIllIlIllII.getValue(BlockBed.PART), EnumPartType.HEAD)) {
            if (lIIIlllIIIlIllII(llllllllllllIlllIIIIllIllIlIlllI.getBlockState(llllllllllllIlllIIIIllIllIlIllIl.offset(llllllllllllIlllIIIIllIllIllIIII.getOpposite())).getBlock(), this)) {
                llllllllllllIlllIIIIllIllIlIlllI.setBlockToAir(llllllllllllIlllIIIIllIllIlIllIl);
                "".length();
                "".length();
                if ((0x6 ^ 0x2) < ((0xA3 ^ 0x84) & ~(0x45 ^ 0x62))) {
                    return;
                }
            }
        }
        else if (lIIIlllIIIlIllII(llllllllllllIlllIIIIllIllIlIlllI.getBlockState(llllllllllllIlllIIIIllIllIlIllIl.offset(llllllllllllIlllIIIIllIllIllIIII)).getBlock(), this)) {
            llllllllllllIlllIIIIllIllIlIlllI.setBlockToAir(llllllllllllIlllIIIIllIllIlIllIl);
            "".length();
            if (lIIIlllIIIlIllll(llllllllllllIlllIIIIllIllIlIlllI.isRemote ? 1 : 0)) {
                this.dropBlockAsItem(llllllllllllIlllIIIIllIllIlIlllI, llllllllllllIlllIIIIllIllIlIllIl, llllllllllllIlllIIIIllIllIlIllII, BlockBed.llIIlIllllllll[0]);
            }
        }
    }
    
    private static void lIIIlllIIIlIlIlI() {
        (llIIlIllllllll = new int[7])[0] = ((0xF3 ^ 0xAF ^ (0x49 ^ 0x26)) & (0x3E ^ 0x6D ^ (0xF0 ^ 0x90) ^ -" ".length()));
        BlockBed.llIIlIllllllll[1] = " ".length();
        BlockBed.llIIlIllllllll[2] = "  ".length();
        BlockBed.llIIlIllllllll[3] = (10 + 98 - 80 + 133 ^ 66 + 80 + 6 + 13);
        BlockBed.llIIlIllllllll[4] = "   ".length();
        BlockBed.llIIlIllllllll[5] = (0xA8 ^ 0xA0);
        BlockBed.llIIlIllllllll[6] = (75 + 44 + 34 + 0 ^ 107 + 36 - 75 + 88);
    }
    
    public enum EnumPartType implements IStringSerializable
    {
        private static final /* synthetic */ int[] lIlIIIIIlIllll;
        
        FOOT(EnumPartType.lIlIIIIIlIlllI[EnumPartType.lIlIIIIIlIllll[2]], EnumPartType.lIlIIIIIlIllll[1], EnumPartType.lIlIIIIIlIlllI[EnumPartType.lIlIIIIIlIllll[3]]);
        
        private final /* synthetic */ String name;
        private static final /* synthetic */ String[] lIlIIIIIlIlllI;
        
        HEAD(EnumPartType.lIlIIIIIlIlllI[EnumPartType.lIlIIIIIlIllll[0]], EnumPartType.lIlIIIIIlIllll[0], EnumPartType.lIlIIIIIlIlllI[EnumPartType.lIlIIIIIlIllll[1]]);
        
        private static void lllIIIIIlIllllI() {
            (lIlIIIIIlIlllI = new String[EnumPartType.lIlIIIIIlIllll[4]])[EnumPartType.lIlIIIIIlIllll[0]] = lllIIIIIlIllIIl("MREvIQ==", "yTneY");
            EnumPartType.lIlIIIIIlIlllI[EnumPartType.lIlIIIIIlIllll[1]] = lllIIIIIlIllIlI("fxAmY5jWxTs=", "yBflR");
            EnumPartType.lIlIIIIIlIlllI[EnumPartType.lIlIIIIIlIllll[2]] = lllIIIIIlIllIlI("Pzyq5tA5T5c=", "RsVkn");
            EnumPartType.lIlIIIIIlIlllI[EnumPartType.lIlIIIIIlIllll[3]] = lllIIIIIlIlllIl("zpajBTf7qNw=", "DpnHB");
        }
        
        private static boolean lllIIIIIllIIIIl(final int lllllllllllllIIlIIIIlllIlllllIIl, final int lllllllllllllIIlIIIIlllIlllllIII) {
            return lllllllllllllIIlIIIIlllIlllllIIl < lllllllllllllIIlIIIIlllIlllllIII;
        }
        
        private static String lllIIIIIlIlllIl(final String lllllllllllllIIlIIIIllllIIIIlllI, final String lllllllllllllIIlIIIIllllIIIIllIl) {
            try {
                final SecretKeySpec lllllllllllllIIlIIIIllllIIIlIIIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIIlIIIIllllIIIIllIl.getBytes(StandardCharsets.UTF_8)), EnumPartType.lIlIIIIIlIllll[5]), "DES");
                final Cipher lllllllllllllIIlIIIIllllIIIlIIII = Cipher.getInstance("DES");
                lllllllllllllIIlIIIIllllIIIlIIII.init(EnumPartType.lIlIIIIIlIllll[2], lllllllllllllIIlIIIIllllIIIlIIIl);
                return new String(lllllllllllllIIlIIIIllllIIIlIIII.doFinal(Base64.getDecoder().decode(lllllllllllllIIlIIIIllllIIIIlllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
            }
            catch (Exception lllllllllllllIIlIIIIllllIIIIllll) {
                lllllllllllllIIlIIIIllllIIIIllll.printStackTrace();
                return null;
            }
        }
        
        private static void lllIIIIIllIIIII() {
            (lIlIIIIIlIllll = new int[6])[0] = ((0x88 ^ 0xA2) & ~(0x99 ^ 0xB3));
            EnumPartType.lIlIIIIIlIllll[1] = " ".length();
            EnumPartType.lIlIIIIIlIllll[2] = "  ".length();
            EnumPartType.lIlIIIIIlIllll[3] = "   ".length();
            EnumPartType.lIlIIIIIlIllll[4] = (0xB1 ^ 0x8F ^ (0x2D ^ 0x17));
            EnumPartType.lIlIIIIIlIllll[5] = (0x1F ^ 0x17);
        }
        
        @Override
        public String getName() {
            return this.name;
        }
        
        private EnumPartType(final String lllllllllllllIIlIIIIllllIIlllllI, final int lllllllllllllIIlIIIIllllIIllllIl, final String lllllllllllllIIlIIIIllllIIllllII) {
            this.name = lllllllllllllIIlIIIIllllIIllllII;
        }
        
        static {
            lllIIIIIllIIIII();
            lllIIIIIlIllllI();
            final EnumPartType[] enum$VALUES = new EnumPartType[EnumPartType.lIlIIIIIlIllll[2]];
            enum$VALUES[EnumPartType.lIlIIIIIlIllll[0]] = EnumPartType.HEAD;
            enum$VALUES[EnumPartType.lIlIIIIIlIllll[1]] = EnumPartType.FOOT;
            ENUM$VALUES = enum$VALUES;
        }
        
        private static String lllIIIIIlIllIlI(final String lllllllllllllIIlIIIIlllIllllllll, final String lllllllllllllIIlIIIIllllIIIIIIII) {
            try {
                final SecretKeySpec lllllllllllllIIlIIIIllllIIIIIlII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIIlIIIIllllIIIIIIII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
                final Cipher lllllllllllllIIlIIIIllllIIIIIIll = Cipher.getInstance("Blowfish");
                lllllllllllllIIlIIIIllllIIIIIIll.init(EnumPartType.lIlIIIIIlIllll[2], lllllllllllllIIlIIIIllllIIIIIlII);
                return new String(lllllllllllllIIlIIIIllllIIIIIIll.doFinal(Base64.getDecoder().decode(lllllllllllllIIlIIIIlllIllllllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
            }
            catch (Exception lllllllllllllIIlIIIIllllIIIIIIlI) {
                lllllllllllllIIlIIIIllllIIIIIIlI.printStackTrace();
                return null;
            }
        }
        
        @Override
        public String toString() {
            return this.name;
        }
        
        private static String lllIIIIIlIllIIl(String lllllllllllllIIlIIIIllllIIIllllI, final String lllllllllllllIIlIIIIllllIIlIIIlI) {
            lllllllllllllIIlIIIIllllIIIllllI = (short)new String(Base64.getDecoder().decode(((String)lllllllllllllIIlIIIIllllIIIllllI).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
            final StringBuilder lllllllllllllIIlIIIIllllIIlIIIIl = new StringBuilder();
            final char[] lllllllllllllIIlIIIIllllIIlIIIII = lllllllllllllIIlIIIIllllIIlIIIlI.toCharArray();
            int lllllllllllllIIlIIIIllllIIIlllll = EnumPartType.lIlIIIIIlIllll[0];
            final int lllllllllllllIIlIIIIllllIIIllIIl = (Object)((String)lllllllllllllIIlIIIIllllIIIllllI).toCharArray();
            final double lllllllllllllIIlIIIIllllIIIllIII = lllllllllllllIIlIIIIllllIIIllIIl.length;
            char lllllllllllllIIlIIIIllllIIIlIlll = (char)EnumPartType.lIlIIIIIlIllll[0];
            while (lllIIIIIllIIIIl(lllllllllllllIIlIIIIllllIIIlIlll, (int)lllllllllllllIIlIIIIllllIIIllIII)) {
                final char lllllllllllllIIlIIIIllllIIlIIlII = lllllllllllllIIlIIIIllllIIIllIIl[lllllllllllllIIlIIIIllllIIIlIlll];
                lllllllllllllIIlIIIIllllIIlIIIIl.append((char)(lllllllllllllIIlIIIIllllIIlIIlII ^ lllllllllllllIIlIIIIllllIIlIIIII[lllllllllllllIIlIIIIllllIIIlllll % lllllllllllllIIlIIIIllllIIlIIIII.length]));
                "".length();
                ++lllllllllllllIIlIIIIllllIIIlllll;
                ++lllllllllllllIIlIIIIllllIIIlIlll;
                "".length();
                if ("   ".length() != "   ".length()) {
                    return null;
                }
            }
            return String.valueOf(lllllllllllllIIlIIIIllllIIlIIIIl);
        }
    }
}
