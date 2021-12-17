// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.item;

import java.util.Iterator;
import java.util.Arrays;
import net.minecraft.tileentity.MobSpawnerBaseLogic;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.block.state.IBlockState;
import net.minecraft.block.BlockFence;
import net.minecraft.tileentity.TileEntityMobSpawner;
import net.minecraft.init.Blocks;
import net.minecraft.util.EnumFacing;
import net.minecraft.stats.StatList;
import net.minecraft.block.BlockLiquid;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.entity.player.EntityPlayer;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import net.minecraft.util.StatCollector;
import net.minecraft.entity.IEntityLivingData;
import net.minecraft.util.BlockPos;
import net.minecraft.util.MathHelper;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.Entity;
import net.minecraft.world.World;
import net.minecraft.entity.EntityList;
import java.util.List;
import net.minecraft.creativetab.CreativeTabs;

public class ItemMonsterPlacer extends Item
{
    private static final /* synthetic */ String[] lIIIlIIIlllIlI;
    private static final /* synthetic */ int[] lIIIlIIIlllllI;
    
    @Override
    public void getSubItems(final Item lllllllllllllIlIIIlIllIIllIIllIl, final CreativeTabs lllllllllllllIlIIIlIllIIllIlIIII, final List<ItemStack> lllllllllllllIlIIIlIllIIllIIllll) {
        final double lllllllllllllIlIIIlIllIIllIIlIlI = (double)EntityList.entityEggs.values().iterator();
        "".length();
        if (" ".length() == 0) {
            return;
        }
        while (!lIlllllIlllllll(((Iterator)lllllllllllllIlIIIlIllIIllIIlIlI).hasNext() ? 1 : 0)) {
            final EntityList.EntityEggInfo lllllllllllllIlIIIlIllIIllIIlllI = ((Iterator<EntityList.EntityEggInfo>)lllllllllllllIlIIIlIllIIllIIlIlI).next();
            lllllllllllllIlIIIlIllIIllIIllll.add(new ItemStack(lllllllllllllIlIIIlIllIIllIIllIl, ItemMonsterPlacer.lIIIlIIIlllllI[0], lllllllllllllIlIIIlIllIIllIIlllI.spawnedID));
            "".length();
        }
    }
    
    public static Entity spawnCreature(final World lllllllllllllIlIIIlIllIIlllIIllI, final int lllllllllllllIlIIIlIllIIlllIIlIl, final double lllllllllllllIlIIIlIllIIllIlllII, final double lllllllllllllIlIIIlIllIIlllIIIll, final double lllllllllllllIlIIIlIllIIllIllIlI) {
        if (lIlllllIlllllll(EntityList.entityEggs.containsKey(lllllllllllllIlIIIlIllIIlllIIlIl) ? 1 : 0)) {
            return null;
        }
        Entity lllllllllllllIlIIIlIllIIlllIIIIl = null;
        int lllllllllllllIlIIIlIllIIlllIIIII = ItemMonsterPlacer.lIIIlIIIlllllI[1];
        "".length();
        if (null != null) {
            return null;
        }
        while (!lIllllllIIIIIll(lllllllllllllIlIIIlIllIIlllIIIII, ItemMonsterPlacer.lIIIlIIIlllllI[0])) {
            lllllllllllllIlIIIlIllIIlllIIIIl = EntityList.createEntityByID(lllllllllllllIlIIIlIllIIlllIIlIl, lllllllllllllIlIIIlIllIIlllIIllI);
            if (lIllllllIIIIIII((lllllllllllllIlIIIlIllIIlllIIIIl instanceof EntityLivingBase) ? 1 : 0)) {
                final EntityLiving lllllllllllllIlIIIlIllIIllIlllll = (EntityLiving)lllllllllllllIlIIIlIllIIlllIIIIl;
                lllllllllllllIlIIIlIllIIlllIIIIl.setLocationAndAngles(lllllllllllllIlIIIlIllIIllIlllII, lllllllllllllIlIIIlIllIIlllIIIll, lllllllllllllIlIIIlIllIIllIllIlI, MathHelper.wrapAngleTo180_float(lllllllllllllIlIIIlIllIIlllIIllI.rand.nextFloat() * 360.0f), 0.0f);
                lllllllllllllIlIIIlIllIIllIlllll.rotationYawHead = lllllllllllllIlIIIlIllIIllIlllll.rotationYaw;
                lllllllllllllIlIIIlIllIIllIlllll.renderYawOffset = lllllllllllllIlIIIlIllIIllIlllll.rotationYaw;
                lllllllllllllIlIIIlIllIIllIlllll.onInitialSpawn(lllllllllllllIlIIIlIllIIlllIIllI.getDifficultyForLocation(new BlockPos(lllllllllllllIlIIIlIllIIllIlllll)), null);
                "".length();
                lllllllllllllIlIIIlIllIIlllIIllI.spawnEntityInWorld(lllllllllllllIlIIIlIllIIlllIIIIl);
                "".length();
                lllllllllllllIlIIIlIllIIllIlllll.playLivingSound();
            }
            ++lllllllllllllIlIIIlIllIIlllIIIII;
        }
        return lllllllllllllIlIIIlIllIIlllIIIIl;
    }
    
    private static void lIlllllIlllllIl() {
        (lIIIlIIIlllllI = new int[7])[0] = " ".length();
        ItemMonsterPlacer.lIIIlIIIlllllI[1] = ((0x2B ^ 0x74 ^ (0xF6 ^ 0x98)) & (0x98 ^ 0xAD ^ (0x9A ^ 0x9E) ^ -" ".length()));
        ItemMonsterPlacer.lIIIlIIIlllllI[2] = "  ".length();
        ItemMonsterPlacer.lIIIlIIIlllllI[3] = "   ".length();
        ItemMonsterPlacer.lIIIlIIIlllllI[4] = (-1 & 0xFFFFFF);
        ItemMonsterPlacer.lIIIlIIIlllllI[5] = (0x83 ^ 0xB2 ^ (0x68 ^ 0x5D));
        ItemMonsterPlacer.lIIIlIIIlllllI[6] = (0xAE ^ 0xA6);
    }
    
    private static boolean lIlllllIlllllll(final int lllllllllllllIlIIIlIllIIlIlIIIII) {
        return lllllllllllllIlIIIlIllIIlIlIIIII == 0;
    }
    
    @Override
    public int getColorFromItemStack(final ItemStack lllllllllllllIlIIIlIllIlIIlIIllI, final int lllllllllllllIlIIIlIllIlIIlIlIII) {
        final EntityList.EntityEggInfo lllllllllllllIlIIIlIllIlIIlIIlll = EntityList.entityEggs.get(lllllllllllllIlIIIlIllIlIIlIIllI.getMetadata());
        int n;
        if (lIlllllIllllllI(lllllllllllllIlIIIlIllIlIIlIIlll)) {
            if (lIlllllIlllllll(lllllllllllllIlIIIlIllIlIIlIlIII)) {
                n = lllllllllllllIlIIIlIllIlIIlIIlll.primaryColor;
                "".length();
                if (((0x1A ^ 0x5F) & ~(0x6F ^ 0x2A)) > 0) {
                    return (0x23 ^ 0x28) & ~(0x41 ^ 0x4A);
                }
            }
            else {
                n = lllllllllllllIlIIIlIllIlIIlIIlll.secondaryColor;
                "".length();
                if ("   ".length() == -" ".length()) {
                    return (0x86 ^ 0xA2 ^ (0x1B ^ 0x69)) & (0x4B ^ 0x7F ^ (0x45 ^ 0x27) ^ -" ".length());
                }
            }
        }
        else {
            n = ItemMonsterPlacer.lIIIlIIIlllllI[4];
        }
        return n;
    }
    
    private static boolean lIllllllIIIIIll(final int lllllllllllllIlIIIlIllIIlIlIllIl, final int lllllllllllllIlIIIlIllIIlIlIllII) {
        return lllllllllllllIlIIIlIllIIlIlIllIl >= lllllllllllllIlIIIlIllIIlIlIllII;
    }
    
    static {
        lIlllllIlllllIl();
        lIlllllIllllIIl();
    }
    
    @Override
    public String getItemStackDisplayName(final ItemStack lllllllllllllIlIIIlIllIlIIllIlII) {
        String lllllllllllllIlIIIlIllIlIIllIIll = String.valueOf(new StringBuilder().append(StatCollector.translateToLocal(String.valueOf(new StringBuilder(String.valueOf(this.getUnlocalizedName())).append(ItemMonsterPlacer.lIIIlIIIlllIlI[ItemMonsterPlacer.lIIIlIIIlllllI[1]]))))).trim();
        final String lllllllllllllIlIIIlIllIlIIllIIlI = EntityList.getStringFromID(lllllllllllllIlIIIlIllIlIIllIlII.getMetadata());
        if (lIlllllIllllllI(lllllllllllllIlIIIlIllIlIIllIIlI)) {
            lllllllllllllIlIIIlIllIlIIllIIll = String.valueOf(new StringBuilder(String.valueOf(lllllllllllllIlIIIlIllIlIIllIIll)).append(ItemMonsterPlacer.lIIIlIIIlllIlI[ItemMonsterPlacer.lIIIlIIIlllllI[0]]).append(StatCollector.translateToLocal(String.valueOf(new StringBuilder(ItemMonsterPlacer.lIIIlIIIlllIlI[ItemMonsterPlacer.lIIIlIIIlllllI[2]]).append(lllllllllllllIlIIIlIllIlIIllIIlI).append(ItemMonsterPlacer.lIIIlIIIlllIlI[ItemMonsterPlacer.lIIIlIIIlllllI[3]])))));
        }
        return lllllllllllllIlIIIlIllIlIIllIIll;
    }
    
    private static boolean lIllllllIIIIIII(final int lllllllllllllIlIIIlIllIIlIlIIIlI) {
        return lllllllllllllIlIIIlIllIIlIlIIIlI != 0;
    }
    
    private static boolean lIllllllIIIIIIl(final Object lllllllllllllIlIIIlIllIIlIlIIlll, final Object lllllllllllllIlIIIlIllIIlIlIIllI) {
        return lllllllllllllIlIIIlIllIIlIlIIlll == lllllllllllllIlIIIlIllIIlIlIIllI;
    }
    
    private static void lIlllllIllllIIl() {
        (lIIIlIIIlllIlI = new String[ItemMonsterPlacer.lIIIlIIIlllllI[5]])[ItemMonsterPlacer.lIIIlIIIlllllI[1]] = lIlllllIlllIlll("hv+0Sts+DEE=", "EGgzE");
        ItemMonsterPlacer.lIIIlIIIlllIlI[ItemMonsterPlacer.lIIIlIIIlllllI[0]] = lIlllllIlllIlll("tl3JdAB1nAI=", "QrgHs");
        ItemMonsterPlacer.lIIIlIIIlllIlI[ItemMonsterPlacer.lIIIlIIIlllllI[2]] = lIlllllIllllIII("UxiUwmU5CXY=", "jfloz");
        ItemMonsterPlacer.lIIIlIIIlllIlI[ItemMonsterPlacer.lIIIlIIIlllllI[3]] = lIlllllIllllIII("mzFsq+W67Ko=", "MSzFD");
    }
    
    private static String lIlllllIllllIII(final String lllllllllllllIlIIIlIllIIllIIIIlI, final String lllllllllllllIlIIIlIllIIllIIIIIl) {
        try {
            final SecretKeySpec lllllllllllllIlIIIlIllIIllIIIlIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIlIIIlIllIIllIIIIIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lllllllllllllIlIIIlIllIIllIIIlII = Cipher.getInstance("Blowfish");
            lllllllllllllIlIIIlIllIIllIIIlII.init(ItemMonsterPlacer.lIIIlIIIlllllI[2], lllllllllllllIlIIIlIllIIllIIIlIl);
            return new String(lllllllllllllIlIIIlIllIIllIIIlII.doFinal(Base64.getDecoder().decode(lllllllllllllIlIIIlIllIIllIIIIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIlIIIlIllIIllIIIIll) {
            lllllllllllllIlIIIlIllIIllIIIIll.printStackTrace();
            return null;
        }
    }
    
    private static boolean lIllllllIIIIIlI(final Object lllllllllllllIlIIIlIllIIlIlIIlII) {
        return lllllllllllllIlIIIlIllIIlIlIIlII == null;
    }
    
    @Override
    public ItemStack onItemRightClick(final ItemStack lllllllllllllIlIIIlIllIIllllIlII, final World lllllllllllllIlIIIlIllIIlllllIlI, final EntityPlayer lllllllllllllIlIIIlIllIIlllllIIl) {
        if (lIllllllIIIIIII(lllllllllllllIlIIIlIllIIlllllIlI.isRemote ? 1 : 0)) {
            return lllllllllllllIlIIIlIllIIllllIlII;
        }
        final MovingObjectPosition lllllllllllllIlIIIlIllIIlllllIII = this.getMovingObjectPositionFromPlayer(lllllllllllllIlIIIlIllIIlllllIlI, lllllllllllllIlIIIlIllIIlllllIIl, (boolean)(ItemMonsterPlacer.lIIIlIIIlllllI[0] != 0));
        if (lIllllllIIIIIlI(lllllllllllllIlIIIlIllIIlllllIII)) {
            return lllllllllllllIlIIIlIllIIllllIlII;
        }
        if (lIllllllIIIIIIl(lllllllllllllIlIIIlIllIIlllllIII.typeOfHit, MovingObjectPosition.MovingObjectType.BLOCK)) {
            final BlockPos lllllllllllllIlIIIlIllIIllllIlll = lllllllllllllIlIIIlIllIIlllllIII.getBlockPos();
            if (lIlllllIlllllll(lllllllllllllIlIIIlIllIIlllllIlI.isBlockModifiable(lllllllllllllIlIIIlIllIIlllllIIl, lllllllllllllIlIIIlIllIIllllIlll) ? 1 : 0)) {
                return lllllllllllllIlIIIlIllIIllllIlII;
            }
            if (lIlllllIlllllll(lllllllllllllIlIIIlIllIIlllllIIl.canPlayerEdit(lllllllllllllIlIIIlIllIIllllIlll, lllllllllllllIlIIIlIllIIlllllIII.sideHit, lllllllllllllIlIIIlIllIIllllIlII) ? 1 : 0)) {
                return lllllllllllllIlIIIlIllIIllllIlII;
            }
            if (lIllllllIIIIIII((lllllllllllllIlIIIlIllIIlllllIlI.getBlockState(lllllllllllllIlIIIlIllIIllllIlll).getBlock() instanceof BlockLiquid) ? 1 : 0)) {
                final Entity lllllllllllllIlIIIlIllIIllllIllI = spawnCreature(lllllllllllllIlIIIlIllIIlllllIlI, lllllllllllllIlIIIlIllIIllllIlII.getMetadata(), lllllllllllllIlIIIlIllIIllllIlll.getX() + 0.5, lllllllllllllIlIIIlIllIIllllIlll.getY() + 0.5, lllllllllllllIlIIIlIllIIllllIlll.getZ() + 0.5);
                if (lIlllllIllllllI(lllllllllllllIlIIIlIllIIllllIllI)) {
                    if (lIllllllIIIIIII((lllllllllllllIlIIIlIllIIllllIllI instanceof EntityLivingBase) ? 1 : 0) && lIllllllIIIIIII(lllllllllllllIlIIIlIllIIllllIlII.hasDisplayName() ? 1 : 0)) {
                        ((EntityLiving)lllllllllllllIlIIIlIllIIllllIllI).setCustomNameTag(lllllllllllllIlIIIlIllIIllllIlII.getDisplayName());
                    }
                    if (lIlllllIlllllll(lllllllllllllIlIIIlIllIIlllllIIl.capabilities.isCreativeMode ? 1 : 0)) {
                        lllllllllllllIlIIIlIllIIllllIlII.stackSize -= ItemMonsterPlacer.lIIIlIIIlllllI[0];
                    }
                    lllllllllllllIlIIIlIllIIlllllIIl.triggerAchievement(StatList.objectUseStats[Item.getIdFromItem(this)]);
                }
            }
        }
        return lllllllllllllIlIIIlIllIIllllIlII;
    }
    
    private static boolean lIlllllIllllllI(final Object lllllllllllllIlIIIlIllIIlIlIlIlI) {
        return lllllllllllllIlIIIlIllIIlIlIlIlI != null;
    }
    
    @Override
    public boolean onItemUse(final ItemStack lllllllllllllIlIIIlIllIlIIIIllII, final EntityPlayer lllllllllllllIlIIIlIllIlIIIllIII, final World lllllllllllllIlIIIlIllIlIIIlIlll, BlockPos lllllllllllllIlIIIlIllIlIIIIlIIl, final EnumFacing lllllllllllllIlIIIlIllIlIIIIlIII, final float lllllllllllllIlIIIlIllIlIIIlIlII, final float lllllllllllllIlIIIlIllIlIIIlIIll, final float lllllllllllllIlIIIlIllIlIIIlIIlI) {
        if (lIllllllIIIIIII(lllllllllllllIlIIIlIllIlIIIlIlll.isRemote ? 1 : 0)) {
            return ItemMonsterPlacer.lIIIlIIIlllllI[0] != 0;
        }
        if (lIlllllIlllllll(lllllllllllllIlIIIlIllIlIIIllIII.canPlayerEdit(lllllllllllllIlIIIlIllIlIIIIlIIl.offset(lllllllllllllIlIIIlIllIlIIIIlIII), lllllllllllllIlIIIlIllIlIIIIlIII, lllllllllllllIlIIIlIllIlIIIIllII) ? 1 : 0)) {
            return ItemMonsterPlacer.lIIIlIIIlllllI[1] != 0;
        }
        final IBlockState lllllllllllllIlIIIlIllIlIIIlIIIl = lllllllllllllIlIIIlIllIlIIIlIlll.getBlockState(lllllllllllllIlIIIlIllIlIIIIlIIl);
        if (lIllllllIIIIIIl(lllllllllllllIlIIIlIllIlIIIlIIIl.getBlock(), Blocks.mob_spawner)) {
            final TileEntity lllllllllllllIlIIIlIllIlIIIlIIII = lllllllllllllIlIIIlIllIlIIIlIlll.getTileEntity(lllllllllllllIlIIIlIllIlIIIIlIIl);
            if (lIllllllIIIIIII((lllllllllllllIlIIIlIllIlIIIlIIII instanceof TileEntityMobSpawner) ? 1 : 0)) {
                final MobSpawnerBaseLogic lllllllllllllIlIIIlIllIlIIIIllll = ((TileEntityMobSpawner)lllllllllllllIlIIIlIllIlIIIlIIII).getSpawnerBaseLogic();
                lllllllllllllIlIIIlIllIlIIIIllll.setEntityName(EntityList.getStringFromID(lllllllllllllIlIIIlIllIlIIIIllII.getMetadata()));
                lllllllllllllIlIIIlIllIlIIIlIIII.markDirty();
                lllllllllllllIlIIIlIllIlIIIlIlll.markBlockForUpdate(lllllllllllllIlIIIlIllIlIIIIlIIl);
                if (lIlllllIlllllll(lllllllllllllIlIIIlIllIlIIIllIII.capabilities.isCreativeMode ? 1 : 0)) {
                    lllllllllllllIlIIIlIllIlIIIIllII.stackSize -= ItemMonsterPlacer.lIIIlIIIlllllI[0];
                }
                return ItemMonsterPlacer.lIIIlIIIlllllI[0] != 0;
            }
        }
        lllllllllllllIlIIIlIllIlIIIIlIIl = lllllllllllllIlIIIlIllIlIIIIlIIl.offset(lllllllllllllIlIIIlIllIlIIIIlIII);
        double lllllllllllllIlIIIlIllIlIIIIlllI = 0.0;
        if (lIllllllIIIIIIl(lllllllllllllIlIIIlIllIlIIIIlIII, EnumFacing.UP) && lIllllllIIIIIII((lllllllllllllIlIIIlIllIlIIIlIIIl instanceof BlockFence) ? 1 : 0)) {
            lllllllllllllIlIIIlIllIlIIIIlllI = 0.5;
        }
        final Entity lllllllllllllIlIIIlIllIlIIIIllIl = spawnCreature(lllllllllllllIlIIIlIllIlIIIlIlll, lllllllllllllIlIIIlIllIlIIIIllII.getMetadata(), lllllllllllllIlIIIlIllIlIIIIlIIl.getX() + 0.5, lllllllllllllIlIIIlIllIlIIIIlIIl.getY() + lllllllllllllIlIIIlIllIlIIIIlllI, lllllllllllllIlIIIlIllIlIIIIlIIl.getZ() + 0.5);
        if (lIlllllIllllllI(lllllllllllllIlIIIlIllIlIIIIllIl)) {
            if (lIllllllIIIIIII((lllllllllllllIlIIIlIllIlIIIIllIl instanceof EntityLivingBase) ? 1 : 0) && lIllllllIIIIIII(lllllllllllllIlIIIlIllIlIIIIllII.hasDisplayName() ? 1 : 0)) {
                lllllllllllllIlIIIlIllIlIIIIllIl.setCustomNameTag(lllllllllllllIlIIIlIllIlIIIIllII.getDisplayName());
            }
            if (lIlllllIlllllll(lllllllllllllIlIIIlIllIlIIIllIII.capabilities.isCreativeMode ? 1 : 0)) {
                lllllllllllllIlIIIlIllIlIIIIllII.stackSize -= ItemMonsterPlacer.lIIIlIIIlllllI[0];
            }
        }
        return ItemMonsterPlacer.lIIIlIIIlllllI[0] != 0;
    }
    
    private static String lIlllllIlllIlll(final String lllllllllllllIlIIIlIllIIlIllIIll, final String lllllllllllllIlIIIlIllIIlIllIIlI) {
        try {
            final SecretKeySpec lllllllllllllIlIIIlIllIIlIlllIII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIlIIIlIllIIlIllIIlI.getBytes(StandardCharsets.UTF_8)), ItemMonsterPlacer.lIIIlIIIlllllI[6]), "DES");
            final Cipher lllllllllllllIlIIIlIllIIlIllIlll = Cipher.getInstance("DES");
            lllllllllllllIlIIIlIllIIlIllIlll.init(ItemMonsterPlacer.lIIIlIIIlllllI[2], lllllllllllllIlIIIlIllIIlIlllIII);
            return new String(lllllllllllllIlIIIlIllIIlIllIlll.doFinal(Base64.getDecoder().decode(lllllllllllllIlIIIlIllIIlIllIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIlIIIlIllIIlIllIllI) {
            lllllllllllllIlIIIlIllIIlIllIllI.printStackTrace();
            return null;
        }
    }
    
    public ItemMonsterPlacer() {
        this.setHasSubtypes((boolean)(ItemMonsterPlacer.lIIIlIIIlllllI[0] != 0));
        "".length();
        this.setCreativeTab(CreativeTabs.tabMisc);
        "".length();
    }
}
