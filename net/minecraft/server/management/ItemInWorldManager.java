// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.server.management;

import net.minecraft.world.WorldServer;
import net.minecraft.inventory.IInventory;
import net.minecraft.block.BlockChest;
import net.minecraft.tileentity.TileEntityChest;
import net.minecraft.world.ILockableContainer;
import net.minecraft.util.EnumFacing;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.network.play.server.S23PacketBlockChange;
import net.minecraft.item.ItemSword;
import net.minecraft.network.Packet;
import net.minecraft.network.play.server.S38PacketPlayerListItem;
import net.minecraft.block.state.IBlockState;
import net.minecraft.block.Block;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.block.material.Material;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.world.WorldSettings;
import net.minecraft.world.World;
import net.minecraft.util.BlockPos;

public class ItemInWorldManager
{
    private /* synthetic */ int initialDamage;
    private /* synthetic */ boolean isDestroyingBlock;
    private /* synthetic */ int durabilityRemainingOnBlock;
    private /* synthetic */ int initialBlockDamage;
    private /* synthetic */ BlockPos field_180240_f;
    private static final /* synthetic */ int[] llIIllIllIIlIl;
    public /* synthetic */ World theWorld;
    private /* synthetic */ BlockPos field_180241_i;
    private /* synthetic */ WorldSettings.GameType gameType;
    private /* synthetic */ int curblockDamage;
    private /* synthetic */ boolean receivedFinishDiggingPacket;
    public /* synthetic */ EntityPlayerMP thisPlayerMP;
    
    private static boolean lIIIlllIlllllllI(final int llllllllllllIllIllllllllIllIlIll, final int llllllllllllIllIllllllllIllIlIlI) {
        return llllllllllllIllIllllllllIllIlIll != llllllllllllIllIllllllllIllIlIlI;
    }
    
    public boolean isCreative() {
        return this.gameType.isCreative();
    }
    
    private static boolean lIIIllllIIIIIIlI(final Object llllllllllllIllIllllllllIlllIllI) {
        return llllllllllllIllIllllllllIlllIllI == null;
    }
    
    private static boolean lIIIllllIIIIIIll(final Object llllllllllllIllIllllllllIlllllll, final Object llllllllllllIllIllllllllIllllllI) {
        return llllllllllllIllIllllllllIlllllll != llllllllllllIllIllllllllIllllllI;
    }
    
    private static boolean lIIIllllIIIIIllI(final int llllllllllllIllIlllllllllIIIIIll, final int llllllllllllIllIlllllllllIIIIIlI) {
        return llllllllllllIllIlllllllllIIIIIll == llllllllllllIllIlllllllllIIIIIlI;
    }
    
    public void updateBlockRemoving() {
        this.curblockDamage += ItemInWorldManager.llIIllIllIIlIl[1];
        if (lIIIlllIllllllIl(this.receivedFinishDiggingPacket ? 1 : 0)) {
            final int llllllllllllIlllIIIIIIIIIIIlllII = this.curblockDamage - this.initialBlockDamage;
            final Block llllllllllllIlllIIIIIIIIIIIllIll = this.theWorld.getBlockState(this.field_180241_i).getBlock();
            if (lIIIlllIlllllIll(llllllllllllIlllIIIIIIIIIIIllIll.getMaterial(), Material.air)) {
                this.receivedFinishDiggingPacket = (ItemInWorldManager.llIIllIllIIlIl[2] != 0);
                "".length();
                if ("  ".length() <= ((0xC ^ 0xB) & ~(0x61 ^ 0x66))) {
                    return;
                }
            }
            else {
                final float llllllllllllIlllIIIIIIIIIIIllIlI = llllllllllllIlllIIIIIIIIIIIllIll.getPlayerRelativeBlockHardness(this.thisPlayerMP, this.thisPlayerMP.worldObj, this.field_180241_i) * (llllllllllllIlllIIIIIIIIIIIlllII + ItemInWorldManager.llIIllIllIIlIl[1]);
                final int llllllllllllIlllIIIIIIIIIIIllIIl = (int)(llllllllllllIlllIIIIIIIIIIIllIlI * 10.0f);
                if (lIIIlllIlllllllI(llllllllllllIlllIIIIIIIIIIIllIIl, this.durabilityRemainingOnBlock)) {
                    this.theWorld.sendBlockBreakProgress(this.thisPlayerMP.getEntityId(), this.field_180241_i, llllllllllllIlllIIIIIIIIIIIllIIl);
                    this.durabilityRemainingOnBlock = llllllllllllIlllIIIIIIIIIIIllIIl;
                }
                if (lIIIlllIllllllll(lIIIlllIllllllII(llllllllllllIlllIIIIIIIIIIIllIlI, 1.0f))) {
                    this.receivedFinishDiggingPacket = (ItemInWorldManager.llIIllIllIIlIl[2] != 0);
                    this.tryHarvestBlock(this.field_180241_i);
                    "".length();
                    "".length();
                    if ("   ".length() < 0) {
                        return;
                    }
                }
            }
        }
        else if (lIIIlllIllllllIl(this.isDestroyingBlock ? 1 : 0)) {
            final Block llllllllllllIlllIIIIIIIIIIIllIII = this.theWorld.getBlockState(this.field_180240_f).getBlock();
            if (lIIIlllIlllllIll(llllllllllllIlllIIIIIIIIIIIllIII.getMaterial(), Material.air)) {
                this.theWorld.sendBlockBreakProgress(this.thisPlayerMP.getEntityId(), this.field_180240_f, ItemInWorldManager.llIIllIllIIlIl[0]);
                this.durabilityRemainingOnBlock = ItemInWorldManager.llIIllIllIIlIl[0];
                this.isDestroyingBlock = (ItemInWorldManager.llIIllIllIIlIl[2] != 0);
                "".length();
                if (" ".length() < 0) {
                    return;
                }
            }
            else {
                final int llllllllllllIlllIIIIIIIIIIIlIlll = this.curblockDamage - this.initialDamage;
                final float llllllllllllIlllIIIIIIIIIIIlIllI = llllllllllllIlllIIIIIIIIIIIllIII.getPlayerRelativeBlockHardness(this.thisPlayerMP, this.thisPlayerMP.worldObj, this.field_180241_i) * (llllllllllllIlllIIIIIIIIIIIlIlll + ItemInWorldManager.llIIllIllIIlIl[1]);
                final int llllllllllllIlllIIIIIIIIIIIlIlIl = (int)(llllllllllllIlllIIIIIIIIIIIlIllI * 10.0f);
                if (lIIIlllIlllllllI(llllllllllllIlllIIIIIIIIIIIlIlIl, this.durabilityRemainingOnBlock)) {
                    this.theWorld.sendBlockBreakProgress(this.thisPlayerMP.getEntityId(), this.field_180240_f, llllllllllllIlllIIIIIIIIIIIlIlIl);
                    this.durabilityRemainingOnBlock = llllllllllllIlllIIIIIIIIIIIlIlIl;
                }
            }
        }
    }
    
    static {
        lIIIlllIlllllIlI();
    }
    
    public WorldSettings.GameType getGameType() {
        return this.gameType;
    }
    
    private static boolean lIIIllllIIIIIIIl(final int llllllllllllIllIllllllllIlllIIlI) {
        return llllllllllllIllIllllllllIlllIIlI == 0;
    }
    
    private boolean removeBlock(final BlockPos llllllllllllIllIlllllllllllIIlIl) {
        final IBlockState llllllllllllIllIlllllllllllIIlII = this.theWorld.getBlockState(llllllllllllIllIlllllllllllIIlIl);
        llllllllllllIllIlllllllllllIIlII.getBlock().onBlockHarvested(this.theWorld, llllllllllllIllIlllllllllllIIlIl, llllllllllllIllIlllllllllllIIlII, this.thisPlayerMP);
        final boolean llllllllllllIllIlllllllllllIIIll = this.theWorld.setBlockToAir(llllllllllllIllIlllllllllllIIlIl);
        if (lIIIlllIllllllIl(llllllllllllIllIlllllllllllIIIll ? 1 : 0)) {
            llllllllllllIllIlllllllllllIIlII.getBlock().onBlockDestroyedByPlayer(this.theWorld, llllllllllllIllIlllllllllllIIlIl, llllllllllllIllIlllllllllllIIlII);
        }
        return llllllllllllIllIlllllllllllIIIll;
    }
    
    public void setGameType(final WorldSettings.GameType llllllllllllIlllIIIIIIIIIIllIlII) {
        this.gameType = llllllllllllIlllIIIIIIIIIIllIlII;
        llllllllllllIlllIIIIIIIIIIllIlII.configurePlayerCapabilities(this.thisPlayerMP.capabilities);
        this.thisPlayerMP.sendPlayerAbilities();
        final ServerConfigurationManager configurationManager = this.thisPlayerMP.mcServer.getConfigurationManager();
        final S38PacketPlayerListItem.Action update_GAME_MODE = S38PacketPlayerListItem.Action.UPDATE_GAME_MODE;
        final EntityPlayerMP[] llllllllllllIllIIIIIIllIIllllIIl = new EntityPlayerMP[ItemInWorldManager.llIIllIllIIlIl[1]];
        llllllllllllIllIIIIIIllIIllllIIl[ItemInWorldManager.llIIllIllIIlIl[2]] = this.thisPlayerMP;
        configurationManager.sendPacketToAllPlayers(new S38PacketPlayerListItem(update_GAME_MODE, llllllllllllIllIIIIIIllIIllllIIl));
    }
    
    public boolean tryHarvestBlock(final BlockPos llllllllllllIllIllllllllllIIlllI) {
        if (lIIIlllIllllllIl(this.gameType.isCreative() ? 1 : 0) && lIIIllllIIIIIlIl(this.thisPlayerMP.getHeldItem()) && lIIIlllIllllllIl((this.thisPlayerMP.getHeldItem().getItem() instanceof ItemSword) ? 1 : 0)) {
            return ItemInWorldManager.llIIllIllIIlIl[2] != 0;
        }
        final IBlockState llllllllllllIllIllllllllllIlIlIl = this.theWorld.getBlockState(llllllllllllIllIllllllllllIIlllI);
        final TileEntity llllllllllllIllIllllllllllIlIlII = this.theWorld.getTileEntity(llllllllllllIllIllllllllllIIlllI);
        if (lIIIlllIllllllIl(this.gameType.isAdventure() ? 1 : 0)) {
            if (lIIIlllIlllllIll(this.gameType, WorldSettings.GameType.SPECTATOR)) {
                return ItemInWorldManager.llIIllIllIIlIl[2] != 0;
            }
            if (lIIIllllIIIIIIIl(this.thisPlayerMP.isAllowEdit() ? 1 : 0)) {
                final ItemStack llllllllllllIllIllllllllllIlIIll = this.thisPlayerMP.getCurrentEquippedItem();
                if (lIIIllllIIIIIIlI(llllllllllllIllIllllllllllIlIIll)) {
                    return ItemInWorldManager.llIIllIllIIlIl[2] != 0;
                }
                if (lIIIllllIIIIIIIl(llllllllllllIllIllllllllllIlIIll.canDestroy(llllllllllllIllIllllllllllIlIlIl.getBlock()) ? 1 : 0)) {
                    return ItemInWorldManager.llIIllIllIIlIl[2] != 0;
                }
            }
        }
        this.theWorld.playAuxSFXAtEntity(this.thisPlayerMP, ItemInWorldManager.llIIllIllIIlIl[3], llllllllllllIllIllllllllllIIlllI, Block.getStateId(llllllllllllIllIllllllllllIlIlIl));
        final boolean llllllllllllIllIllllllllllIlIIlI = this.removeBlock(llllllllllllIllIllllllllllIIlllI);
        if (lIIIlllIllllllIl(this.isCreative() ? 1 : 0)) {
            this.thisPlayerMP.playerNetServerHandler.sendPacket(new S23PacketBlockChange(this.theWorld, llllllllllllIllIllllllllllIIlllI));
            "".length();
            if ("   ".length() <= 0) {
                return ((0x31 ^ 0x9) & ~(0xFE ^ 0xC6)) != 0x0;
            }
        }
        else {
            final ItemStack llllllllllllIllIllllllllllIlIIIl = this.thisPlayerMP.getCurrentEquippedItem();
            final boolean llllllllllllIllIllllllllllIlIIII = this.thisPlayerMP.canHarvestBlock(llllllllllllIllIllllllllllIlIlIl.getBlock());
            if (lIIIllllIIIIIlIl(llllllllllllIllIllllllllllIlIIIl)) {
                llllllllllllIllIllllllllllIlIIIl.onBlockDestroyed(this.theWorld, llllllllllllIllIllllllllllIlIlIl.getBlock(), llllllllllllIllIllllllllllIIlllI, this.thisPlayerMP);
                if (lIIIllllIIIIIIIl(llllllllllllIllIllllllllllIlIIIl.stackSize)) {
                    this.thisPlayerMP.destroyCurrentEquippedItem();
                }
            }
            if (lIIIlllIllllllIl(llllllllllllIllIllllllllllIlIIlI ? 1 : 0) && lIIIlllIllllllIl(llllllllllllIllIllllllllllIlIIII ? 1 : 0)) {
                llllllllllllIllIllllllllllIlIlIl.getBlock().harvestBlock(this.theWorld, this.thisPlayerMP, llllllllllllIllIllllllllllIIlllI, llllllllllllIllIllllllllllIlIlIl, llllllllllllIllIllllllllllIlIlII);
            }
        }
        return llllllllllllIllIllllllllllIlIIlI;
    }
    
    public boolean survivalOrAdventure() {
        return this.gameType.isSurvivalOrAdventure();
    }
    
    public boolean tryUseItem(final EntityPlayer llllllllllllIllIllllllllllIIIIII, final World llllllllllllIllIlllllllllIllllll, final ItemStack llllllllllllIllIlllllllllIllIlll) {
        if (lIIIlllIlllllIll(this.gameType, WorldSettings.GameType.SPECTATOR)) {
            return ItemInWorldManager.llIIllIllIIlIl[2] != 0;
        }
        final int llllllllllllIllIlllllllllIllllIl = llllllllllllIllIlllllllllIllIlll.stackSize;
        final int llllllllllllIllIlllllllllIllllII = llllllllllllIllIlllllllllIllIlll.getMetadata();
        final ItemStack llllllllllllIllIlllllllllIlllIll = llllllllllllIllIlllllllllIllIlll.useItemRightClick(llllllllllllIllIlllllllllIllllll, llllllllllllIllIllllllllllIIIIII);
        if (!lIIIlllIlllllIll(llllllllllllIllIlllllllllIlllIll, llllllllllllIllIlllllllllIllIlll) || (lIIIllllIIIIIlIl(llllllllllllIllIlllllllllIlllIll) && (!lIIIllllIIIIIllI(llllllllllllIllIlllllllllIlllIll.stackSize, llllllllllllIllIlllllllllIllllIl) || !lIIIllllIIIIIlll(llllllllllllIllIlllllllllIlllIll.getMaxItemUseDuration()) || lIIIlllIlllllllI(llllllllllllIllIlllllllllIlllIll.getMetadata(), llllllllllllIllIlllllllllIllllII)))) {
            llllllllllllIllIllllllllllIIIIII.inventory.mainInventory[llllllllllllIllIllllllllllIIIIII.inventory.currentItem] = llllllllllllIllIlllllllllIlllIll;
            if (lIIIlllIllllllIl(this.isCreative() ? 1 : 0)) {
                llllllllllllIllIlllllllllIlllIll.stackSize = llllllllllllIllIlllllllllIllllIl;
                if (lIIIlllIllllllIl(llllllllllllIllIlllllllllIlllIll.isItemStackDamageable() ? 1 : 0)) {
                    llllllllllllIllIlllllllllIlllIll.setItemDamage(llllllllllllIllIlllllllllIllllII);
                }
            }
            if (lIIIllllIIIIIIIl(llllllllllllIllIlllllllllIlllIll.stackSize)) {
                llllllllllllIllIllllllllllIIIIII.inventory.mainInventory[llllllllllllIllIllllllllllIIIIII.inventory.currentItem] = null;
            }
            if (lIIIllllIIIIIIIl(llllllllllllIllIllllllllllIIIIII.isUsingItem() ? 1 : 0)) {
                ((EntityPlayerMP)llllllllllllIllIllllllllllIIIIII).sendContainerToPlayer(llllllllllllIllIllllllllllIIIIII.inventoryContainer);
            }
            return ItemInWorldManager.llIIllIllIIlIl[1] != 0;
        }
        return ItemInWorldManager.llIIllIllIIlIl[2] != 0;
    }
    
    public boolean activateBlockOrUseItem(final EntityPlayer llllllllllllIllIlllllllllIlIIllI, final World llllllllllllIllIlllllllllIIlIlIl, final ItemStack llllllllllllIllIlllllllllIIlIlII, final BlockPos llllllllllllIllIlllllllllIlIIIll, final EnumFacing llllllllllllIllIlllllllllIIlIIlI, final float llllllllllllIllIlllllllllIlIIIIl, final float llllllllllllIllIlllllllllIIlIIII, final float llllllllllllIllIlllllllllIIlllll) {
        if (lIIIlllIlllllIll(this.gameType, WorldSettings.GameType.SPECTATOR)) {
            final TileEntity llllllllllllIllIlllllllllIIllllI = llllllllllllIllIlllllllllIIlIlIl.getTileEntity(llllllllllllIllIlllllllllIlIIIll);
            if (lIIIlllIllllllIl((llllllllllllIllIlllllllllIIllllI instanceof ILockableContainer) ? 1 : 0)) {
                final Block llllllllllllIllIlllllllllIIlllIl = llllllllllllIllIlllllllllIIlIlIl.getBlockState(llllllllllllIllIlllllllllIlIIIll).getBlock();
                ILockableContainer llllllllllllIllIlllllllllIIlllII = (ILockableContainer)llllllllllllIllIlllllllllIIllllI;
                if (lIIIlllIllllllIl((llllllllllllIllIlllllllllIIlllII instanceof TileEntityChest) ? 1 : 0) && lIIIlllIllllllIl((llllllllllllIllIlllllllllIIlllIl instanceof BlockChest) ? 1 : 0)) {
                    llllllllllllIllIlllllllllIIlllII = ((BlockChest)llllllllllllIllIlllllllllIIlllIl).getLockableContainer(llllllllllllIllIlllllllllIIlIlIl, llllllllllllIllIlllllllllIlIIIll);
                }
                if (lIIIllllIIIIIlIl(llllllllllllIllIlllllllllIIlllII)) {
                    llllllllllllIllIlllllllllIlIIllI.displayGUIChest(llllllllllllIllIlllllllllIIlllII);
                    return ItemInWorldManager.llIIllIllIIlIl[1] != 0;
                }
            }
            else if (lIIIlllIllllllIl((llllllllllllIllIlllllllllIIllllI instanceof IInventory) ? 1 : 0)) {
                llllllllllllIllIlllllllllIlIIllI.displayGUIChest((IInventory)llllllllllllIllIlllllllllIIllllI);
                return ItemInWorldManager.llIIllIllIIlIl[1] != 0;
            }
            return ItemInWorldManager.llIIllIllIIlIl[2] != 0;
        }
        if (!lIIIlllIllllllIl(llllllllllllIllIlllllllllIlIIllI.isSneaking() ? 1 : 0) || lIIIllllIIIIIIlI(llllllllllllIllIlllllllllIlIIllI.getHeldItem())) {
            final IBlockState llllllllllllIllIlllllllllIIllIll = llllllllllllIllIlllllllllIIlIlIl.getBlockState(llllllllllllIllIlllllllllIlIIIll);
            if (lIIIlllIllllllIl(llllllllllllIllIlllllllllIIllIll.getBlock().onBlockActivated(llllllllllllIllIlllllllllIIlIlIl, llllllllllllIllIlllllllllIlIIIll, llllllllllllIllIlllllllllIIllIll, llllllllllllIllIlllllllllIlIIllI, llllllllllllIllIlllllllllIIlIIlI, llllllllllllIllIlllllllllIlIIIIl, llllllllllllIllIlllllllllIIlIIII, llllllllllllIllIlllllllllIIlllll) ? 1 : 0)) {
                return ItemInWorldManager.llIIllIllIIlIl[1] != 0;
            }
        }
        if (lIIIllllIIIIIIlI(llllllllllllIllIlllllllllIIlIlII)) {
            return ItemInWorldManager.llIIllIllIIlIl[2] != 0;
        }
        if (lIIIlllIllllllIl(this.isCreative() ? 1 : 0)) {
            final int llllllllllllIllIlllllllllIIllIlI = llllllllllllIllIlllllllllIIlIlII.getMetadata();
            final int llllllllllllIllIlllllllllIIllIIl = llllllllllllIllIlllllllllIIlIlII.stackSize;
            final boolean llllllllllllIllIlllllllllIIllIII = llllllllllllIllIlllllllllIIlIlII.onItemUse(llllllllllllIllIlllllllllIlIIllI, llllllllllllIllIlllllllllIIlIlIl, llllllllllllIllIlllllllllIlIIIll, llllllllllllIllIlllllllllIIlIIlI, llllllllllllIllIlllllllllIlIIIIl, llllllllllllIllIlllllllllIIlIIII, llllllllllllIllIlllllllllIIlllll);
            llllllllllllIllIlllllllllIIlIlII.setItemDamage(llllllllllllIllIlllllllllIIllIlI);
            llllllllllllIllIlllllllllIIlIlII.stackSize = llllllllllllIllIlllllllllIIllIIl;
            return llllllllllllIllIlllllllllIIllIII;
        }
        return llllllllllllIllIlllllllllIIlIlII.onItemUse(llllllllllllIllIlllllllllIlIIllI, llllllllllllIllIlllllllllIIlIlIl, llllllllllllIllIlllllllllIlIIIll, llllllllllllIllIlllllllllIIlIIlI, llllllllllllIllIlllllllllIlIIIIl, llllllllllllIllIlllllllllIIlIIII, llllllllllllIllIlllllllllIIlllll);
    }
    
    private static int lIIIllllIIIIIlII(final float n, final float n2) {
        return fcmpl(n, n2);
    }
    
    public void blockRemoving(final BlockPos llllllllllllIllIllllllllllllIIIl) {
        if (lIIIlllIllllllIl(llllllllllllIllIllllllllllllIIIl.equals(this.field_180240_f) ? 1 : 0)) {
            final int llllllllllllIllIllllllllllllIlIl = this.curblockDamage - this.initialDamage;
            final Block llllllllllllIllIllllllllllllIlII = this.theWorld.getBlockState(llllllllllllIllIllllllllllllIIIl).getBlock();
            if (lIIIllllIIIIIIll(llllllllllllIllIllllllllllllIlII.getMaterial(), Material.air)) {
                final float llllllllllllIllIllllllllllllIIll = llllllllllllIllIllllllllllllIlII.getPlayerRelativeBlockHardness(this.thisPlayerMP, this.thisPlayerMP.worldObj, llllllllllllIllIllllllllllllIIIl) * (llllllllllllIllIllllllllllllIlIl + ItemInWorldManager.llIIllIllIIlIl[1]);
                if (lIIIlllIllllllll(lIIIllllIIIIIlII(llllllllllllIllIllllllllllllIIll, 0.7f))) {
                    this.isDestroyingBlock = (ItemInWorldManager.llIIllIllIIlIl[2] != 0);
                    this.theWorld.sendBlockBreakProgress(this.thisPlayerMP.getEntityId(), llllllllllllIllIllllllllllllIIIl, ItemInWorldManager.llIIllIllIIlIl[0]);
                    this.tryHarvestBlock(llllllllllllIllIllllllllllllIIIl);
                    "".length();
                    "".length();
                    if (((0xF9 ^ 0xAC) & ~(0xB ^ 0x5E)) != 0x0) {
                        return;
                    }
                }
                else if (lIIIllllIIIIIIIl(this.receivedFinishDiggingPacket ? 1 : 0)) {
                    this.isDestroyingBlock = (ItemInWorldManager.llIIllIllIIlIl[2] != 0);
                    this.receivedFinishDiggingPacket = (ItemInWorldManager.llIIllIllIIlIl[1] != 0);
                    this.field_180241_i = llllllllllllIllIllllllllllllIIIl;
                    this.initialBlockDamage = this.initialDamage;
                }
            }
        }
    }
    
    private static boolean lIIIlllIllllllll(final int llllllllllllIllIllllllllIlllIIII) {
        return llllllllllllIllIllllllllIlllIIII >= 0;
    }
    
    private static boolean lIIIlllIllllllIl(final int llllllllllllIllIllllllllIlllIlII) {
        return llllllllllllIllIllllllllIlllIlII != 0;
    }
    
    public void onBlockClicked(final BlockPos llllllllllllIlllIIIIIIIIIIIIIIIl, final EnumFacing llllllllllllIlllIIIIIIIIIIIIIIII) {
        if (lIIIlllIllllllIl(this.isCreative() ? 1 : 0)) {
            if (lIIIllllIIIIIIIl(this.theWorld.extinguishFire(null, llllllllllllIlllIIIIIIIIIIIIIIIl, llllllllllllIlllIIIIIIIIIIIIIIII) ? 1 : 0)) {
                this.tryHarvestBlock(llllllllllllIlllIIIIIIIIIIIIIIIl);
                "".length();
                "".length();
                if (((0x46 ^ 0x1C) & ~(0x44 ^ 0x1E)) != 0x0) {
                    return;
                }
            }
        }
        else {
            final Block llllllllllllIlllIIIIIIIIIIIIIllI = this.theWorld.getBlockState(llllllllllllIlllIIIIIIIIIIIIIIIl).getBlock();
            if (lIIIlllIllllllIl(this.gameType.isAdventure() ? 1 : 0)) {
                if (lIIIlllIlllllIll(this.gameType, WorldSettings.GameType.SPECTATOR)) {
                    return;
                }
                if (lIIIllllIIIIIIIl(this.thisPlayerMP.isAllowEdit() ? 1 : 0)) {
                    final ItemStack llllllllllllIlllIIIIIIIIIIIIIlIl = this.thisPlayerMP.getCurrentEquippedItem();
                    if (lIIIllllIIIIIIlI(llllllllllllIlllIIIIIIIIIIIIIlIl)) {
                        return;
                    }
                    if (lIIIllllIIIIIIIl(llllllllllllIlllIIIIIIIIIIIIIlIl.canDestroy(llllllllllllIlllIIIIIIIIIIIIIllI) ? 1 : 0)) {
                        return;
                    }
                }
            }
            this.theWorld.extinguishFire(null, llllllllllllIlllIIIIIIIIIIIIIIIl, llllllllllllIlllIIIIIIIIIIIIIIII);
            "".length();
            this.initialDamage = this.curblockDamage;
            float llllllllllllIlllIIIIIIIIIIIIIlII = 1.0f;
            if (lIIIllllIIIIIIll(llllllllllllIlllIIIIIIIIIIIIIllI.getMaterial(), Material.air)) {
                llllllllllllIlllIIIIIIIIIIIIIllI.onBlockClicked(this.theWorld, llllllllllllIlllIIIIIIIIIIIIIIIl, this.thisPlayerMP);
                llllllllllllIlllIIIIIIIIIIIIIlII = llllllllllllIlllIIIIIIIIIIIIIllI.getPlayerRelativeBlockHardness(this.thisPlayerMP, this.thisPlayerMP.worldObj, llllllllllllIlllIIIIIIIIIIIIIIIl);
            }
            if (lIIIllllIIIIIIll(llllllllllllIlllIIIIIIIIIIIIIllI.getMaterial(), Material.air) && lIIIlllIllllllll(lIIIllllIIIIIIII(llllllllllllIlllIIIIIIIIIIIIIlII, 1.0f))) {
                this.tryHarvestBlock(llllllllllllIlllIIIIIIIIIIIIIIIl);
                "".length();
                "".length();
                if (((0x62 ^ 0x45) & ~(0x31 ^ 0x16)) != 0x0) {
                    return;
                }
            }
            else {
                this.isDestroyingBlock = (ItemInWorldManager.llIIllIllIIlIl[1] != 0);
                this.field_180240_f = llllllllllllIlllIIIIIIIIIIIIIIIl;
                final int llllllllllllIlllIIIIIIIIIIIIIIll = (int)(llllllllllllIlllIIIIIIIIIIIIIlII * 10.0f);
                this.theWorld.sendBlockBreakProgress(this.thisPlayerMP.getEntityId(), llllllllllllIlllIIIIIIIIIIIIIIIl, llllllllllllIlllIIIIIIIIIIIIIIll);
                this.durabilityRemainingOnBlock = llllllllllllIlllIIIIIIIIIIIIIIll;
            }
        }
    }
    
    private static int lIIIllllIIIIIIII(final float n, final float n2) {
        return fcmpl(n, n2);
    }
    
    private static boolean lIIIllllIIIIIlIl(final Object llllllllllllIllIllllllllIllllIII) {
        return llllllllllllIllIllllllllIllllIII != null;
    }
    
    private static boolean lIIIllllIIIIIlll(final int llllllllllllIllIllllllllIllIlllI) {
        return llllllllllllIllIllllllllIllIlllI <= 0;
    }
    
    private static int lIIIlllIllllllII(final float n, final float n2) {
        return fcmpl(n, n2);
    }
    
    public ItemInWorldManager(final World llllllllllllIlllIIIIIIIIIIlllIlI) {
        this.gameType = WorldSettings.GameType.NOT_SET;
        this.field_180240_f = BlockPos.ORIGIN;
        this.field_180241_i = BlockPos.ORIGIN;
        this.durabilityRemainingOnBlock = ItemInWorldManager.llIIllIllIIlIl[0];
        this.theWorld = llllllllllllIlllIIIIIIIIIIlllIlI;
    }
    
    private static void lIIIlllIlllllIlI() {
        (llIIllIllIIlIl = new int[4])[0] = -" ".length();
        ItemInWorldManager.llIIllIllIIlIl[1] = " ".length();
        ItemInWorldManager.llIIllIllIIlIl[2] = ((0xBE ^ 0x94) & ~(0x4B ^ 0x61));
        ItemInWorldManager.llIIllIllIIlIl[3] = (0xFFFFAFF3 & 0x57DD);
    }
    
    public void setWorld(final WorldServer llllllllllllIllIlllllllllIIIlIII) {
        this.theWorld = llllllllllllIllIlllllllllIIIlIII;
    }
    
    private static boolean lIIIlllIlllllIll(final Object llllllllllllIllIllllllllIllllIll, final Object llllllllllllIllIllllllllIllllIlI) {
        return llllllllllllIllIllllllllIllllIll == llllllllllllIllIllllllllIllllIlI;
    }
    
    public void cancelDestroyingBlock() {
        this.isDestroyingBlock = (ItemInWorldManager.llIIllIllIIlIl[2] != 0);
        this.theWorld.sendBlockBreakProgress(this.thisPlayerMP.getEntityId(), this.field_180240_f, ItemInWorldManager.llIIllIllIIlIl[0]);
    }
    
    public void initializeGameType(final WorldSettings.GameType llllllllllllIlllIIIIIIIIIIlIIIll) {
        if (lIIIlllIlllllIll(this.gameType, WorldSettings.GameType.NOT_SET)) {
            this.gameType = llllllllllllIlllIIIIIIIIIIlIIIll;
        }
        this.setGameType(this.gameType);
    }
}
