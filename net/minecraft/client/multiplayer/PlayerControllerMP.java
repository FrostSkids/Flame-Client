// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.client.multiplayer;

import net.minecraft.item.ItemSword;
import net.minecraft.client.audio.ISound;
import net.minecraft.client.audio.PositionedSoundRecord;
import net.minecraft.util.ResourceLocation;
import net.minecraft.network.play.client.C10PacketCreativeInventoryAction;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.ItemBlock;
import net.minecraft.entity.passive.EntityHorse;
import net.minecraft.network.play.client.C09PacketHeldItemChange;
import net.minecraft.network.play.client.C11PacketEnchantItem;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.stats.StatFileWriter;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.network.play.client.C07PacketPlayerDigging;
import net.minecraft.util.EnumFacing;
import net.minecraft.network.play.client.C0EPacketClickWindow;
import net.minecraft.network.play.client.C02PacketUseEntity;
import net.minecraft.util.Vec3;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.entity.Entity;
import net.minecraft.network.Packet;
import net.minecraft.network.play.client.C08PacketPlayerBlockPlacement;
import net.minecraft.world.World;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.client.Minecraft;
import net.minecraft.world.WorldSettings;
import net.minecraft.util.BlockPos;
import net.minecraft.client.network.NetHandlerPlayClient;

public class PlayerControllerMP
{
    private /* synthetic */ int currentPlayerItem;
    private /* synthetic */ boolean isHittingBlock;
    private /* synthetic */ float stepSoundTickCounter;
    private final /* synthetic */ NetHandlerPlayClient netClientHandler;
    private /* synthetic */ BlockPos currentBlock;
    private /* synthetic */ WorldSettings.GameType currentGameType;
    private final /* synthetic */ Minecraft mc;
    private /* synthetic */ float curBlockDamageMP;
    private static final /* synthetic */ int[] llllIIlIIlllI;
    private /* synthetic */ ItemStack currentItemHittingBlock;
    private /* synthetic */ int blockHitDelay;
    
    private boolean isHittingPosition(final BlockPos lllllllllllllIlIlllIlIIIIIIlIlIl) {
        final ItemStack lllllllllllllIlIlllIlIIIIIIllIII = this.mc.thePlayer.getHeldItem();
        int n;
        if (lIlIlIIIIllIIIl(this.currentItemHittingBlock) && lIlIlIIIIllIIIl(lllllllllllllIlIlllIlIIIIIIllIII)) {
            n = PlayerControllerMP.llllIIlIIlllI[1];
            "".length();
            if ("  ".length() > "   ".length()) {
                return ((0x8D ^ 0xAC) & ~(0x5B ^ 0x7A)) != 0x0;
            }
        }
        else {
            n = PlayerControllerMP.llllIIlIIlllI[2];
        }
        boolean lllllllllllllIlIlllIlIIIIIIlIlll = n != 0;
        if (lIlIlIIIIllIIlI(this.currentItemHittingBlock) && lIlIlIIIIllIIlI(lllllllllllllIlIlllIlIIIIIIllIII)) {
            int n2;
            if (lIlIlIIIIlIllll(lllllllllllllIlIlllIlIIIIIIllIII.getItem(), this.currentItemHittingBlock.getItem()) && lIlIlIIIIllIIII(ItemStack.areItemStackTagsEqual(lllllllllllllIlIlllIlIIIIIIllIII, this.currentItemHittingBlock) ? 1 : 0) && (!lIlIlIIIIlIlllI(lllllllllllllIlIlllIlIIIIIIllIII.isItemStackDamageable() ? 1 : 0) || lIlIlIIIIlllIII(lllllllllllllIlIlllIlIIIIIIllIII.getMetadata(), this.currentItemHittingBlock.getMetadata()))) {
                n2 = PlayerControllerMP.llllIIlIIlllI[1];
                "".length();
                if ("   ".length() <= 0) {
                    return ((76 + 117 - 95 + 42 ^ 54 + 117 - 8 + 29) & (0xEA ^ 0xC4 ^ (0x4 ^ 0x66) ^ -" ".length())) != 0x0;
                }
            }
            else {
                n2 = PlayerControllerMP.llllIIlIIlllI[2];
            }
            lllllllllllllIlIlllIlIIIIIIlIlll = (n2 != 0);
        }
        if (lIlIlIIIIllIIII(lllllllllllllIlIlllIlIIIIIIlIlIl.equals(this.currentBlock) ? 1 : 0) && lIlIlIIIIllIIII(lllllllllllllIlIlllIlIIIIIIlIlll ? 1 : 0)) {
            return PlayerControllerMP.llllIIlIIlllI[1] != 0;
        }
        return PlayerControllerMP.llllIIlIIlllI[2] != 0;
    }
    
    private static boolean lIlIlIIIIllIlll(final int lllllllllllllIlIlllIIlllIIlIIllI) {
        return lllllllllllllIlIlllIIlllIIlIIllI > 0;
    }
    
    public boolean sendUseItem(final EntityPlayer lllllllllllllIlIlllIIlllllIlIIll, final World lllllllllllllIlIlllIIlllllIlIIlI, final ItemStack lllllllllllllIlIlllIIlllllIlIIIl) {
        if (lIlIlIIIIlIllll(this.currentGameType, WorldSettings.GameType.SPECTATOR)) {
            return PlayerControllerMP.llllIIlIIlllI[2] != 0;
        }
        this.syncCurrentPlayItem();
        this.netClientHandler.addToSendQueue(new C08PacketPlayerBlockPlacement(lllllllllllllIlIlllIIlllllIlIIll.inventory.getCurrentItem()));
        final int lllllllllllllIlIlllIIlllllIlIllI = lllllllllllllIlIlllIIlllllIlIIIl.stackSize;
        final ItemStack lllllllllllllIlIlllIIlllllIlIlIl = lllllllllllllIlIlllIIlllllIlIIIl.useItemRightClick(lllllllllllllIlIlllIIlllllIlIIlI, lllllllllllllIlIlllIIlllllIlIIll);
        if (!lIlIlIIIIlIllll(lllllllllllllIlIlllIIlllllIlIlIl, lllllllllllllIlIlllIIlllllIlIIIl) || (lIlIlIIIIllIIlI(lllllllllllllIlIlllIIlllllIlIlIl) && lIlIlIIIIlllIIl(lllllllllllllIlIlllIIlllllIlIlIl.stackSize, lllllllllllllIlIlllIIlllllIlIllI))) {
            lllllllllllllIlIlllIIlllllIlIIll.inventory.mainInventory[lllllllllllllIlIlllIIlllllIlIIll.inventory.currentItem] = lllllllllllllIlIlllIIlllllIlIlIl;
            if (lIlIlIIIIlIlllI(lllllllllllllIlIlllIIlllllIlIlIl.stackSize)) {
                lllllllllllllIlIlllIIlllllIlIIll.inventory.mainInventory[lllllllllllllIlIlllIIlllllIlIIll.inventory.currentItem] = null;
            }
            return PlayerControllerMP.llllIIlIIlllI[1] != 0;
        }
        return PlayerControllerMP.llllIIlIIlllI[2] != 0;
    }
    
    public boolean gameIsSurvivalOrAdventure() {
        return this.currentGameType.isSurvivalOrAdventure();
    }
    
    public boolean func_178894_a(final EntityPlayer lllllllllllllIlIlllIIllllIlIlIII, final Entity lllllllllllllIlIlllIIllllIlIllII, final MovingObjectPosition lllllllllllllIlIlllIIllllIlIIllI) {
        this.syncCurrentPlayItem();
        final Vec3 lllllllllllllIlIlllIIllllIlIlIlI = new Vec3(lllllllllllllIlIlllIIllllIlIIllI.hitVec.xCoord - lllllllllllllIlIlllIIllllIlIllII.posX, lllllllllllllIlIlllIIllllIlIIllI.hitVec.yCoord - lllllllllllllIlIlllIIllllIlIllII.posY, lllllllllllllIlIlllIIllllIlIIllI.hitVec.zCoord - lllllllllllllIlIlllIIllllIlIllII.posZ);
        this.netClientHandler.addToSendQueue(new C02PacketUseEntity(lllllllllllllIlIlllIIllllIlIllII, lllllllllllllIlIlllIIllllIlIlIlI));
        if (lIlIlIIIIllIlII(this.currentGameType, WorldSettings.GameType.SPECTATOR) && lIlIlIIIIllIIII(lllllllllllllIlIlllIIllllIlIllII.interactAt(lllllllllllllIlIlllIIllllIlIlIII, lllllllllllllIlIlllIIllllIlIlIlI) ? 1 : 0)) {
            return PlayerControllerMP.llllIIlIIlllI[1] != 0;
        }
        return PlayerControllerMP.llllIIlIIlllI[2] != 0;
    }
    
    public boolean interactWithEntitySendPacket(final EntityPlayer lllllllllllllIlIlllIIllllIllIlIl, final Entity lllllllllllllIlIlllIIllllIllIlII) {
        this.syncCurrentPlayItem();
        this.netClientHandler.addToSendQueue(new C02PacketUseEntity(lllllllllllllIlIlllIIllllIllIlII, C02PacketUseEntity.Action.INTERACT));
        if (lIlIlIIIIllIlII(this.currentGameType, WorldSettings.GameType.SPECTATOR) && lIlIlIIIIllIIII(lllllllllllllIlIlllIIllllIllIlIl.interactWith(lllllllllllllIlIlllIIllllIllIlII) ? 1 : 0)) {
            return PlayerControllerMP.llllIIlIIlllI[1] != 0;
        }
        return PlayerControllerMP.llllIIlIIlllI[2] != 0;
    }
    
    private static boolean lIlIlIIIIlIllll(final Object lllllllllllllIlIlllIIlllIlIIIIIl, final Object lllllllllllllIlIlllIIlllIlIIIIII) {
        return lllllllllllllIlIlllIIlllIlIIIIIl == lllllllllllllIlIlllIIlllIlIIIIII;
    }
    
    public ItemStack windowClick(final int lllllllllllllIlIlllIIllllIIlIIll, final int lllllllllllllIlIlllIIllllIIlIIlI, final int lllllllllllllIlIlllIIllllIIlIIIl, final int lllllllllllllIlIlllIIllllIIlIIII, final EntityPlayer lllllllllllllIlIlllIIllllIIIllll) {
        final short lllllllllllllIlIlllIIllllIIlIllI = lllllllllllllIlIlllIIllllIIIllll.openContainer.getNextTransactionID(lllllllllllllIlIlllIIllllIIIllll.inventory);
        final ItemStack lllllllllllllIlIlllIIllllIIlIlIl = lllllllllllllIlIlllIIllllIIIllll.openContainer.slotClick(lllllllllllllIlIlllIIllllIIlIIlI, lllllllllllllIlIlllIIllllIIlIIIl, lllllllllllllIlIlllIIllllIIlIIII, lllllllllllllIlIlllIIllllIIIllll);
        this.netClientHandler.addToSendQueue(new C0EPacketClickWindow(lllllllllllllIlIlllIIllllIIlIIll, lllllllllllllIlIlllIIllllIIlIIlI, lllllllllllllIlIlllIIllllIIlIIIl, lllllllllllllIlIlllIIllllIIlIIII, lllllllllllllIlIlllIIllllIIlIlIl, lllllllllllllIlIlllIIllllIIlIllI));
        return lllllllllllllIlIlllIIllllIIlIlIl;
    }
    
    public boolean extendedReach() {
        return this.currentGameType.isCreative();
    }
    
    private static boolean lIlIlIIIIlllIIl(final int lllllllllllllIlIlllIIlllIIIlllIl, final int lllllllllllllIlIlllIIlllIIIllIll) {
        return lllllllllllllIlIlllIIlllIIIlllIl != lllllllllllllIlIlllIIlllIIIllIll;
    }
    
    public static void clickBlockCreative(final Minecraft lllllllllllllIlIlllIlIIIIlllIllI, final PlayerControllerMP lllllllllllllIlIlllIlIIIIllllIIl, final BlockPos lllllllllllllIlIlllIlIIIIlllIlII, final EnumFacing lllllllllllllIlIlllIlIIIIlllIIll) {
        if (lIlIlIIIIlIlllI(lllllllllllllIlIlllIlIIIIlllIllI.theWorld.extinguishFire(lllllllllllllIlIlllIlIIIIlllIllI.thePlayer, lllllllllllllIlIlllIlIIIIlllIlII, lllllllllllllIlIlllIlIIIIlllIIll) ? 1 : 0)) {
            lllllllllllllIlIlllIlIIIIllllIIl.onPlayerDestroyBlock(lllllllllllllIlIlllIlIIIIlllIlII, lllllllllllllIlIlllIlIIIIlllIIll);
            "".length();
        }
    }
    
    public void resetBlockRemoving() {
        if (lIlIlIIIIllIIII(this.isHittingBlock ? 1 : 0)) {
            this.netClientHandler.addToSendQueue(new C07PacketPlayerDigging(C07PacketPlayerDigging.Action.ABORT_DESTROY_BLOCK, this.currentBlock, EnumFacing.DOWN));
            this.isHittingBlock = (PlayerControllerMP.llllIIlIIlllI[2] != 0);
            this.curBlockDamageMP = 0.0f;
            this.mc.theWorld.sendBlockBreakProgress(this.mc.thePlayer.getEntityId(), this.currentBlock, PlayerControllerMP.llllIIlIIlllI[0]);
        }
    }
    
    public WorldSettings.GameType getCurrentGameType() {
        return this.currentGameType;
    }
    
    public boolean isSpectatorMode() {
        if (lIlIlIIIIlIllll(this.currentGameType, WorldSettings.GameType.SPECTATOR)) {
            return PlayerControllerMP.llllIIlIIlllI[1] != 0;
        }
        return PlayerControllerMP.llllIIlIIlllI[2] != 0;
    }
    
    public boolean clickBlock(final BlockPos lllllllllllllIlIlllIlIIIIIlllllI, final EnumFacing lllllllllllllIlIlllIlIIIIIllllIl) {
        if (lIlIlIIIIllIIII(this.currentGameType.isAdventure() ? 1 : 0)) {
            if (lIlIlIIIIlIllll(this.currentGameType, WorldSettings.GameType.SPECTATOR)) {
                return PlayerControllerMP.llllIIlIIlllI[2] != 0;
            }
            if (lIlIlIIIIlIlllI(this.mc.thePlayer.isAllowEdit() ? 1 : 0)) {
                final Block lllllllllllllIlIlllIlIIIIIllllII = this.mc.theWorld.getBlockState(lllllllllllllIlIlllIlIIIIIlllllI).getBlock();
                final ItemStack lllllllllllllIlIlllIlIIIIIlllIll = this.mc.thePlayer.getCurrentEquippedItem();
                if (lIlIlIIIIllIIIl(lllllllllllllIlIlllIlIIIIIlllIll)) {
                    return PlayerControllerMP.llllIIlIIlllI[2] != 0;
                }
                if (lIlIlIIIIlIlllI(lllllllllllllIlIlllIlIIIIIlllIll.canDestroy(lllllllllllllIlIlllIlIIIIIllllII) ? 1 : 0)) {
                    return PlayerControllerMP.llllIIlIIlllI[2] != 0;
                }
            }
        }
        if (lIlIlIIIIlIlllI(this.mc.theWorld.getWorldBorder().contains(lllllllllllllIlIlllIlIIIIIlllllI) ? 1 : 0)) {
            return PlayerControllerMP.llllIIlIIlllI[2] != 0;
        }
        if (lIlIlIIIIllIIII(this.currentGameType.isCreative() ? 1 : 0)) {
            this.netClientHandler.addToSendQueue(new C07PacketPlayerDigging(C07PacketPlayerDigging.Action.START_DESTROY_BLOCK, lllllllllllllIlIlllIlIIIIIlllllI, lllllllllllllIlIlllIlIIIIIllllIl));
            clickBlockCreative(this.mc, this, lllllllllllllIlIlllIlIIIIIlllllI, lllllllllllllIlIlllIlIIIIIllllIl);
            this.blockHitDelay = PlayerControllerMP.llllIIlIIlllI[4];
            "".length();
            if (-" ".length() != -" ".length()) {
                return ((0x7 ^ 0x46) & ~(0x2 ^ 0x43)) != 0x0;
            }
        }
        else if (!lIlIlIIIIllIIII(this.isHittingBlock ? 1 : 0) || lIlIlIIIIlIlllI(this.isHittingPosition(lllllllllllllIlIlllIlIIIIIlllllI) ? 1 : 0)) {
            if (lIlIlIIIIllIIII(this.isHittingBlock ? 1 : 0)) {
                this.netClientHandler.addToSendQueue(new C07PacketPlayerDigging(C07PacketPlayerDigging.Action.ABORT_DESTROY_BLOCK, this.currentBlock, lllllllllllllIlIlllIlIIIIIllllIl));
            }
            this.netClientHandler.addToSendQueue(new C07PacketPlayerDigging(C07PacketPlayerDigging.Action.START_DESTROY_BLOCK, lllllllllllllIlIlllIlIIIIIlllllI, lllllllllllllIlIlllIlIIIIIllllIl));
            final Block lllllllllllllIlIlllIlIIIIIlllIlI = this.mc.theWorld.getBlockState(lllllllllllllIlIlllIlIIIIIlllllI).getBlock();
            int n;
            if (lIlIlIIIIllIlII(lllllllllllllIlIlllIlIIIIIlllIlI.getMaterial(), Material.air)) {
                n = PlayerControllerMP.llllIIlIIlllI[1];
                "".length();
                if (" ".length() < 0) {
                    return ((70 + 32 + 24 + 8 ^ 121 + 21 - 56 + 69) & (47 + 7 + 68 + 68 ^ 44 + 49 + 67 + 3 ^ -" ".length())) != 0x0;
                }
            }
            else {
                n = PlayerControllerMP.llllIIlIIlllI[2];
            }
            final boolean lllllllllllllIlIlllIlIIIIIlllIIl = n != 0;
            if (lIlIlIIIIllIIII(lllllllllllllIlIlllIlIIIIIlllIIl ? 1 : 0) && lIlIlIIIIlIlllI(lIlIlIIIIllIIll(this.curBlockDamageMP, 0.0f))) {
                lllllllllllllIlIlllIlIIIIIlllIlI.onBlockClicked(this.mc.theWorld, lllllllllllllIlIlllIlIIIIIlllllI, this.mc.thePlayer);
            }
            if (lIlIlIIIIllIIII(lllllllllllllIlIlllIlIIIIIlllIIl ? 1 : 0) && lIlIlIIIIllIlIl(lIlIlIIIIllIIll(lllllllllllllIlIlllIlIIIIIlllIlI.getPlayerRelativeBlockHardness(this.mc.thePlayer, this.mc.thePlayer.worldObj, lllllllllllllIlIlllIlIIIIIlllllI), 1.0f))) {
                this.onPlayerDestroyBlock(lllllllllllllIlIlllIlIIIIIlllllI, lllllllllllllIlIlllIlIIIIIllllIl);
                "".length();
                "".length();
                if (-"  ".length() >= 0) {
                    return ((0x5B ^ 0x6E) & ~(0x83 ^ 0xB6)) != 0x0;
                }
            }
            else {
                this.isHittingBlock = (PlayerControllerMP.llllIIlIIlllI[1] != 0);
                this.currentBlock = lllllllllllllIlIlllIlIIIIIlllllI;
                this.currentItemHittingBlock = this.mc.thePlayer.getHeldItem();
                this.curBlockDamageMP = 0.0f;
                this.stepSoundTickCounter = 0.0f;
                this.mc.theWorld.sendBlockBreakProgress(this.mc.thePlayer.getEntityId(), this.currentBlock, (int)(this.curBlockDamageMP * 10.0f) - PlayerControllerMP.llllIIlIIlllI[1]);
            }
        }
        return PlayerControllerMP.llllIIlIIlllI[1] != 0;
    }
    
    public float getBlockReachDistance() {
        float n;
        if (lIlIlIIIIllIIII(this.currentGameType.isCreative() ? 1 : 0)) {
            n = 5.0f;
            "".length();
            if ("   ".length() == ((0xCC ^ 0xAD) & ~(0xA0 ^ 0xC1))) {
                return 0.0f;
            }
        }
        else {
            n = 4.5f;
        }
        return n;
    }
    
    public void flipPlayer(final EntityPlayer lllllllllllllIlIlllIlIIIIllIIIIl) {
        lllllllllllllIlIlllIlIIIIllIIIIl.rotationYaw = -180.0f;
    }
    
    private static boolean lIlIlIIIIllIIIl(final Object lllllllllllllIlIlllIIlllIIlllIIl) {
        return lllllllllllllIlIlllIIlllIIlllIIl == null;
    }
    
    public boolean isInCreativeMode() {
        return this.currentGameType.isCreative();
    }
    
    static {
        lIlIlIIIIlIllIl();
    }
    
    public EntityPlayerSP func_178892_a(final World lllllllllllllIlIlllIIlllllIIlIlI, final StatFileWriter lllllllllllllIlIlllIIlllllIIIllI) {
        return new EntityPlayerSP(this.mc, lllllllllllllIlIlllIIlllllIIlIlI, this.netClientHandler, lllllllllllllIlIlllIIlllllIIIllI);
    }
    
    private static boolean lIlIlIIIIllIIlI(final Object lllllllllllllIlIlllIIlllIIlllllI) {
        return lllllllllllllIlIlllIIlllIIlllllI != null;
    }
    
    private static boolean lIlIlIIIIllIlII(final Object lllllllllllllIlIlllIIlllIlIIIlIl, final Object lllllllllllllIlIlllIIlllIlIIIlII) {
        return lllllllllllllIlIlllIIlllIlIIIlIl != lllllllllllllIlIlllIIlllIlIIIlII;
    }
    
    private static void lIlIlIIIIlIllIl() {
        (llllIIlIIlllI = new int[5])[0] = -" ".length();
        PlayerControllerMP.llllIIlIIlllI[1] = " ".length();
        PlayerControllerMP.llllIIlIIlllI[2] = ((22 + 76 - 92 + 142 ^ 86 + 184 - 161 + 88) & (0xB ^ 0x21 ^ (0xFB ^ 0x80) ^ -" ".length()));
        PlayerControllerMP.llllIIlIIlllI[3] = (-(0xFFFFA82D & 0x5FFF) & (0xFFFFEFFF & 0x1FFD));
        PlayerControllerMP.llllIIlIIlllI[4] = (0xC7 ^ 0xC2);
    }
    
    public PlayerControllerMP(final Minecraft lllllllllllllIlIlllIlIIIlIIIIIII, final NetHandlerPlayClient lllllllllllllIlIlllIlIIIIlllllll) {
        this.currentBlock = new BlockPos(PlayerControllerMP.llllIIlIIlllI[0], PlayerControllerMP.llllIIlIIlllI[0], PlayerControllerMP.llllIIlIIlllI[0]);
        this.currentGameType = WorldSettings.GameType.SURVIVAL;
        this.mc = lllllllllllllIlIlllIlIIIlIIIIIII;
        this.netClientHandler = lllllllllllllIlIlllIlIIIIlllllll;
    }
    
    public void attackEntity(final EntityPlayer lllllllllllllIlIlllIIlllllIIIIIl, final Entity lllllllllllllIlIlllIIllllIllllIl) {
        this.syncCurrentPlayItem();
        this.netClientHandler.addToSendQueue(new C02PacketUseEntity(lllllllllllllIlIlllIIllllIllllIl, C02PacketUseEntity.Action.ATTACK));
        if (lIlIlIIIIllIlII(this.currentGameType, WorldSettings.GameType.SPECTATOR)) {
            lllllllllllllIlIlllIIlllllIIIIIl.attackTargetEntityWithCurrentItem(lllllllllllllIlIlllIIllllIllllIl);
        }
    }
    
    public boolean func_181040_m() {
        return this.isHittingBlock;
    }
    
    public void setGameType(final WorldSettings.GameType lllllllllllllIlIlllIlIIIIllIIlII) {
        this.currentGameType = lllllllllllllIlIlllIlIIIIllIIlII;
        this.currentGameType.configurePlayerCapabilities(this.mc.thePlayer.capabilities);
    }
    
    public void updateController() {
        this.syncCurrentPlayItem();
        if (lIlIlIIIIllIIII(this.netClientHandler.getNetworkManager().isChannelOpen() ? 1 : 0)) {
            this.netClientHandler.getNetworkManager().processReceivedPackets();
            "".length();
            if (" ".length() == 0) {
                return;
            }
        }
        else {
            this.netClientHandler.getNetworkManager().checkDisconnected();
        }
    }
    
    public boolean isNotCreative() {
        int n;
        if (lIlIlIIIIllIIII(this.currentGameType.isCreative() ? 1 : 0)) {
            n = PlayerControllerMP.llllIIlIIlllI[2];
            "".length();
            if (((0x7 ^ 0x15 ^ (0x46 ^ 0xB)) & (3 + 51 - 12 + 112 ^ 53 + 185 - 183 + 142 ^ -" ".length())) > 0) {
                return (" ".length() & (" ".length() ^ -" ".length())) != 0x0;
            }
        }
        else {
            n = PlayerControllerMP.llllIIlIIlllI[1];
        }
        return n != 0;
    }
    
    public void onStoppedUsingItem(final EntityPlayer lllllllllllllIlIlllIIlllIlllIIIl) {
        this.syncCurrentPlayItem();
        this.netClientHandler.addToSendQueue(new C07PacketPlayerDigging(C07PacketPlayerDigging.Action.RELEASE_USE_ITEM, BlockPos.ORIGIN, EnumFacing.DOWN));
        lllllllllllllIlIlllIIlllIlllIIIl.stopUsingItem();
    }
    
    private static boolean lIlIlIIIIlIlllI(final int lllllllllllllIlIlllIIlllIIlIllll) {
        return lllllllllllllIlIlllIIlllIIlIllll == 0;
    }
    
    private static boolean lIlIlIIIIllIIII(final int lllllllllllllIlIlllIIlllIIllIIll) {
        return lllllllllllllIlIlllIIlllIIllIIll != 0;
    }
    
    public void sendEnchantPacket(final int lllllllllllllIlIlllIIllllIIIlIII, final int lllllllllllllIlIlllIIllllIIIIlII) {
        this.netClientHandler.addToSendQueue(new C11PacketEnchantItem(lllllllllllllIlIlllIIllllIIIlIII, lllllllllllllIlIlllIIllllIIIIlII));
    }
    
    private static boolean lIlIlIIIIllIlIl(final int lllllllllllllIlIlllIIlllIIlIlIlI) {
        return lllllllllllllIlIlllIIlllIIlIlIlI >= 0;
    }
    
    private void syncCurrentPlayItem() {
        final int lllllllllllllIlIlllIlIIIIIIIllll = this.mc.thePlayer.inventory.currentItem;
        if (lIlIlIIIIlllIIl(lllllllllllllIlIlllIlIIIIIIIllll, this.currentPlayerItem)) {
            this.currentPlayerItem = lllllllllllllIlIlllIlIIIIIIIllll;
            this.netClientHandler.addToSendQueue(new C09PacketHeldItemChange(this.currentPlayerItem));
        }
    }
    
    public void setPlayerCapabilities(final EntityPlayer lllllllllllllIlIlllIlIIIIllIllll) {
        this.currentGameType.configurePlayerCapabilities(lllllllllllllIlIlllIlIIIIllIllll.capabilities);
    }
    
    private static boolean lIlIlIIIIlllIII(final int lllllllllllllIlIlllIIlllIlIIllII, final int lllllllllllllIlIlllIIlllIlIIlIlI) {
        return lllllllllllllIlIlllIIlllIlIIllII == lllllllllllllIlIlllIIlllIlIIlIlI;
    }
    
    public boolean isRidingHorse() {
        if (lIlIlIIIIllIIII(this.mc.thePlayer.isRiding() ? 1 : 0) && lIlIlIIIIllIIII((this.mc.thePlayer.ridingEntity instanceof EntityHorse) ? 1 : 0)) {
            return PlayerControllerMP.llllIIlIIlllI[1] != 0;
        }
        return PlayerControllerMP.llllIIlIIlllI[2] != 0;
    }
    
    public boolean isSpectator() {
        if (lIlIlIIIIlIllll(this.currentGameType, WorldSettings.GameType.SPECTATOR)) {
            return PlayerControllerMP.llllIIlIIlllI[1] != 0;
        }
        return PlayerControllerMP.llllIIlIIlllI[2] != 0;
    }
    
    public boolean onPlayerRightClick(final EntityPlayerSP lllllllllllllIlIlllIIlllllllllIl, final WorldClient lllllllllllllIlIlllIIlllllllllII, final ItemStack lllllllllllllIlIlllIIllllllIlIll, final BlockPos lllllllllllllIlIlllIIllllllllIlI, final EnumFacing lllllllllllllIlIlllIIllllllIlIIl, final Vec3 lllllllllllllIlIlllIIllllllIlIII) {
        this.syncCurrentPlayItem();
        final float lllllllllllllIlIlllIIlllllllIlll = (float)(lllllllllllllIlIlllIIllllllIlIII.xCoord - lllllllllllllIlIlllIIllllllllIlI.getX());
        final float lllllllllllllIlIlllIIlllllllIllI = (float)(lllllllllllllIlIlllIIllllllIlIII.yCoord - lllllllllllllIlIlllIIllllllllIlI.getY());
        final float lllllllllllllIlIlllIIlllllllIlIl = (float)(lllllllllllllIlIlllIIllllllIlIII.zCoord - lllllllllllllIlIlllIIllllllllIlI.getZ());
        boolean lllllllllllllIlIlllIIlllllllIlII = PlayerControllerMP.llllIIlIIlllI[2] != 0;
        if (lIlIlIIIIlIlllI(this.mc.theWorld.getWorldBorder().contains(lllllllllllllIlIlllIIllllllllIlI) ? 1 : 0)) {
            return PlayerControllerMP.llllIIlIIlllI[2] != 0;
        }
        if (lIlIlIIIIllIlII(this.currentGameType, WorldSettings.GameType.SPECTATOR)) {
            final IBlockState lllllllllllllIlIlllIIlllllllIIll = lllllllllllllIlIlllIIlllllllllII.getBlockState(lllllllllllllIlIlllIIllllllllIlI);
            if ((!lIlIlIIIIllIIII(lllllllllllllIlIlllIIlllllllllIl.isSneaking() ? 1 : 0) || lIlIlIIIIllIIIl(lllllllllllllIlIlllIIlllllllllIl.getHeldItem())) && lIlIlIIIIllIIII(lllllllllllllIlIlllIIlllllllIIll.getBlock().onBlockActivated(lllllllllllllIlIlllIIlllllllllII, lllllllllllllIlIlllIIllllllllIlI, lllllllllllllIlIlllIIlllllllIIll, lllllllllllllIlIlllIIlllllllllIl, lllllllllllllIlIlllIIllllllIlIIl, lllllllllllllIlIlllIIlllllllIlll, lllllllllllllIlIlllIIlllllllIllI, lllllllllllllIlIlllIIlllllllIlIl) ? 1 : 0)) {
                lllllllllllllIlIlllIIlllllllIlII = (PlayerControllerMP.llllIIlIIlllI[1] != 0);
            }
            if (lIlIlIIIIlIlllI(lllllllllllllIlIlllIIlllllllIlII ? 1 : 0) && lIlIlIIIIllIIlI(lllllllllllllIlIlllIIllllllIlIll) && lIlIlIIIIllIIII((lllllllllllllIlIlllIIllllllIlIll.getItem() instanceof ItemBlock) ? 1 : 0)) {
                final ItemBlock lllllllllllllIlIlllIIlllllllIIlI = (ItemBlock)lllllllllllllIlIlllIIllllllIlIll.getItem();
                if (lIlIlIIIIlIlllI(lllllllllllllIlIlllIIlllllllIIlI.canPlaceBlockOnSide(lllllllllllllIlIlllIIlllllllllII, lllllllllllllIlIlllIIllllllllIlI, lllllllllllllIlIlllIIllllllIlIIl, lllllllllllllIlIlllIIlllllllllIl, lllllllllllllIlIlllIIllllllIlIll) ? 1 : 0)) {
                    return PlayerControllerMP.llllIIlIIlllI[2] != 0;
                }
            }
        }
        this.netClientHandler.addToSendQueue(new C08PacketPlayerBlockPlacement(lllllllllllllIlIlllIIllllllllIlI, lllllllllllllIlIlllIIllllllIlIIl.getIndex(), lllllllllllllIlIlllIIlllllllllIl.inventory.getCurrentItem(), lllllllllllllIlIlllIIlllllllIlll, lllllllllllllIlIlllIIlllllllIllI, lllllllllllllIlIlllIIlllllllIlIl));
        if (!lIlIlIIIIlIlllI(lllllllllllllIlIlllIIlllllllIlII ? 1 : 0) || !lIlIlIIIIllIlII(this.currentGameType, WorldSettings.GameType.SPECTATOR)) {
            return PlayerControllerMP.llllIIlIIlllI[1] != 0;
        }
        if (lIlIlIIIIllIIIl(lllllllllllllIlIlllIIllllllIlIll)) {
            return PlayerControllerMP.llllIIlIIlllI[2] != 0;
        }
        if (lIlIlIIIIllIIII(this.currentGameType.isCreative() ? 1 : 0)) {
            final int lllllllllllllIlIlllIIlllllllIIIl = lllllllllllllIlIlllIIllllllIlIll.getMetadata();
            final int lllllllllllllIlIlllIIlllllllIIII = lllllllllllllIlIlllIIllllllIlIll.stackSize;
            final boolean lllllllllllllIlIlllIIllllllIllll = lllllllllllllIlIlllIIllllllIlIll.onItemUse(lllllllllllllIlIlllIIlllllllllIl, lllllllllllllIlIlllIIlllllllllII, lllllllllllllIlIlllIIllllllllIlI, lllllllllllllIlIlllIIllllllIlIIl, lllllllllllllIlIlllIIlllllllIlll, lllllllllllllIlIlllIIlllllllIllI, lllllllllllllIlIlllIIlllllllIlIl);
            lllllllllllllIlIlllIIllllllIlIll.setItemDamage(lllllllllllllIlIlllIIlllllllIIIl);
            lllllllllllllIlIlllIIllllllIlIll.stackSize = lllllllllllllIlIlllIIlllllllIIII;
            return lllllllllllllIlIlllIIllllllIllll;
        }
        return lllllllllllllIlIlllIIllllllIlIll.onItemUse(lllllllllllllIlIlllIIlllllllllIl, lllllllllllllIlIlllIIlllllllllII, lllllllllllllIlIlllIIllllllllIlI, lllllllllllllIlIlllIIllllllIlIIl, lllllllllllllIlIlllIIlllllllIlll, lllllllllllllIlIlllIIlllllllIllI, lllllllllllllIlIlllIIlllllllIlIl);
    }
    
    public void sendSlotPacket(final ItemStack lllllllllllllIlIlllIIlllIlllllII, final int lllllllllllllIlIlllIIlllIllllIll) {
        if (lIlIlIIIIllIIII(this.currentGameType.isCreative() ? 1 : 0)) {
            this.netClientHandler.addToSendQueue(new C10PacketCreativeInventoryAction(lllllllllllllIlIlllIIlllIllllIll, lllllllllllllIlIlllIIlllIlllllII));
        }
    }
    
    private static int lIlIlIIIIllIIll(final float n, final float n2) {
        return fcmpl(n, n2);
    }
    
    public boolean onPlayerDamageBlock(final BlockPos lllllllllllllIlIlllIlIIIIIlIIlll, final EnumFacing lllllllllllllIlIlllIlIIIIIlIlIlI) {
        this.syncCurrentPlayItem();
        if (lIlIlIIIIllIlll(this.blockHitDelay)) {
            this.blockHitDelay -= PlayerControllerMP.llllIIlIIlllI[1];
            return PlayerControllerMP.llllIIlIIlllI[1] != 0;
        }
        if (lIlIlIIIIllIIII(this.currentGameType.isCreative() ? 1 : 0) && lIlIlIIIIllIIII(this.mc.theWorld.getWorldBorder().contains(lllllllllllllIlIlllIlIIIIIlIIlll) ? 1 : 0)) {
            this.blockHitDelay = PlayerControllerMP.llllIIlIIlllI[4];
            this.netClientHandler.addToSendQueue(new C07PacketPlayerDigging(C07PacketPlayerDigging.Action.START_DESTROY_BLOCK, lllllllllllllIlIlllIlIIIIIlIIlll, lllllllllllllIlIlllIlIIIIIlIlIlI));
            clickBlockCreative(this.mc, this, lllllllllllllIlIlllIlIIIIIlIIlll, lllllllllllllIlIlllIlIIIIIlIlIlI);
            return PlayerControllerMP.llllIIlIIlllI[1] != 0;
        }
        if (!lIlIlIIIIllIIII(this.isHittingPosition(lllllllllllllIlIlllIlIIIIIlIIlll) ? 1 : 0)) {
            return this.clickBlock(lllllllllllllIlIlllIlIIIIIlIIlll, lllllllllllllIlIlllIlIIIIIlIlIlI);
        }
        final Block lllllllllllllIlIlllIlIIIIIlIlIIl = this.mc.theWorld.getBlockState(lllllllllllllIlIlllIlIIIIIlIIlll).getBlock();
        if (lIlIlIIIIlIllll(lllllllllllllIlIlllIlIIIIIlIlIIl.getMaterial(), Material.air)) {
            this.isHittingBlock = (PlayerControllerMP.llllIIlIIlllI[2] != 0);
            return PlayerControllerMP.llllIIlIIlllI[2] != 0;
        }
        this.curBlockDamageMP += lllllllllllllIlIlllIlIIIIIlIlIIl.getPlayerRelativeBlockHardness(this.mc.thePlayer, this.mc.thePlayer.worldObj, lllllllllllllIlIlllIlIIIIIlIIlll);
        if (lIlIlIIIIlIlllI(lIlIlIIIIllIllI(this.stepSoundTickCounter % 4.0f, 0.0f))) {
            this.mc.getSoundHandler().playSound(new PositionedSoundRecord(new ResourceLocation(lllllllllllllIlIlllIlIIIIIlIlIIl.stepSound.getStepSound()), (lllllllllllllIlIlllIlIIIIIlIlIIl.stepSound.getVolume() + 1.0f) / 8.0f, lllllllllllllIlIlllIlIIIIIlIlIIl.stepSound.getFrequency() * 0.5f, lllllllllllllIlIlllIlIIIIIlIIlll.getX() + 0.5f, lllllllllllllIlIlllIlIIIIIlIIlll.getY() + 0.5f, lllllllllllllIlIlllIlIIIIIlIIlll.getZ() + 0.5f));
        }
        ++this.stepSoundTickCounter;
        if (lIlIlIIIIllIlIl(lIlIlIIIIllIllI(this.curBlockDamageMP, 1.0f))) {
            this.isHittingBlock = (PlayerControllerMP.llllIIlIIlllI[2] != 0);
            this.netClientHandler.addToSendQueue(new C07PacketPlayerDigging(C07PacketPlayerDigging.Action.STOP_DESTROY_BLOCK, lllllllllllllIlIlllIlIIIIIlIIlll, lllllllllllllIlIlllIlIIIIIlIlIlI));
            this.onPlayerDestroyBlock(lllllllllllllIlIlllIlIIIIIlIIlll, lllllllllllllIlIlllIlIIIIIlIlIlI);
            "".length();
            this.curBlockDamageMP = 0.0f;
            this.stepSoundTickCounter = 0.0f;
            this.blockHitDelay = PlayerControllerMP.llllIIlIIlllI[4];
        }
        this.mc.theWorld.sendBlockBreakProgress(this.mc.thePlayer.getEntityId(), this.currentBlock, (int)(this.curBlockDamageMP * 10.0f) - PlayerControllerMP.llllIIlIIlllI[1]);
        return PlayerControllerMP.llllIIlIIlllI[1] != 0;
    }
    
    public boolean onPlayerDestroyBlock(final BlockPos lllllllllllllIlIlllIlIIIIlIIlIlI, final EnumFacing lllllllllllllIlIlllIlIIIIlIlIIll) {
        if (lIlIlIIIIllIIII(this.currentGameType.isAdventure() ? 1 : 0)) {
            if (lIlIlIIIIlIllll(this.currentGameType, WorldSettings.GameType.SPECTATOR)) {
                return PlayerControllerMP.llllIIlIIlllI[2] != 0;
            }
            if (lIlIlIIIIlIlllI(this.mc.thePlayer.isAllowEdit() ? 1 : 0)) {
                final Block lllllllllllllIlIlllIlIIIIlIlIIlI = this.mc.theWorld.getBlockState(lllllllllllllIlIlllIlIIIIlIIlIlI).getBlock();
                final ItemStack lllllllllllllIlIlllIlIIIIlIlIIIl = this.mc.thePlayer.getCurrentEquippedItem();
                if (lIlIlIIIIllIIIl(lllllllllllllIlIlllIlIIIIlIlIIIl)) {
                    return PlayerControllerMP.llllIIlIIlllI[2] != 0;
                }
                if (lIlIlIIIIlIlllI(lllllllllllllIlIlllIlIIIIlIlIIIl.canDestroy(lllllllllllllIlIlllIlIIIIlIlIIlI) ? 1 : 0)) {
                    return PlayerControllerMP.llllIIlIIlllI[2] != 0;
                }
            }
        }
        if (lIlIlIIIIllIIII(this.currentGameType.isCreative() ? 1 : 0) && lIlIlIIIIllIIlI(this.mc.thePlayer.getHeldItem()) && lIlIlIIIIllIIII((this.mc.thePlayer.getHeldItem().getItem() instanceof ItemSword) ? 1 : 0)) {
            return PlayerControllerMP.llllIIlIIlllI[2] != 0;
        }
        final World lllllllllllllIlIlllIlIIIIlIlIIII = this.mc.theWorld;
        final IBlockState lllllllllllllIlIlllIlIIIIlIIllll = lllllllllllllIlIlllIlIIIIlIlIIII.getBlockState(lllllllllllllIlIlllIlIIIIlIIlIlI);
        final Block lllllllllllllIlIlllIlIIIIlIIlllI = lllllllllllllIlIlllIlIIIIlIIllll.getBlock();
        if (lIlIlIIIIlIllll(lllllllllllllIlIlllIlIIIIlIIlllI.getMaterial(), Material.air)) {
            return PlayerControllerMP.llllIIlIIlllI[2] != 0;
        }
        lllllllllllllIlIlllIlIIIIlIlIIII.playAuxSFX(PlayerControllerMP.llllIIlIIlllI[3], lllllllllllllIlIlllIlIIIIlIIlIlI, Block.getStateId(lllllllllllllIlIlllIlIIIIlIIllll));
        final boolean lllllllllllllIlIlllIlIIIIlIIllIl = lllllllllllllIlIlllIlIIIIlIlIIII.setBlockToAir(lllllllllllllIlIlllIlIIIIlIIlIlI);
        if (lIlIlIIIIllIIII(lllllllllllllIlIlllIlIIIIlIIllIl ? 1 : 0)) {
            lllllllllllllIlIlllIlIIIIlIIlllI.onBlockDestroyedByPlayer(lllllllllllllIlIlllIlIIIIlIlIIII, lllllllllllllIlIlllIlIIIIlIIlIlI, lllllllllllllIlIlllIlIIIIlIIllll);
        }
        this.currentBlock = new BlockPos(this.currentBlock.getX(), PlayerControllerMP.llllIIlIIlllI[0], this.currentBlock.getZ());
        if (lIlIlIIIIlIlllI(this.currentGameType.isCreative() ? 1 : 0)) {
            final ItemStack lllllllllllllIlIlllIlIIIIlIIllII = this.mc.thePlayer.getCurrentEquippedItem();
            if (lIlIlIIIIllIIlI(lllllllllllllIlIlllIlIIIIlIIllII)) {
                lllllllllllllIlIlllIlIIIIlIIllII.onBlockDestroyed(lllllllllllllIlIlllIlIIIIlIlIIII, lllllllllllllIlIlllIlIIIIlIIlllI, lllllllllllllIlIlllIlIIIIlIIlIlI, this.mc.thePlayer);
                if (lIlIlIIIIlIlllI(lllllllllllllIlIlllIlIIIIlIIllII.stackSize)) {
                    this.mc.thePlayer.destroyCurrentEquippedItem();
                }
            }
        }
        return lllllllllllllIlIlllIlIIIIlIIllIl;
    }
    
    public void sendPacketDropItem(final ItemStack lllllllllllllIlIlllIIlllIlllIlll) {
        if (lIlIlIIIIllIIII(this.currentGameType.isCreative() ? 1 : 0) && lIlIlIIIIllIIlI(lllllllllllllIlIlllIIlllIlllIlll)) {
            this.netClientHandler.addToSendQueue(new C10PacketCreativeInventoryAction(PlayerControllerMP.llllIIlIIlllI[0], lllllllllllllIlIlllIIlllIlllIlll));
        }
    }
    
    public boolean shouldDrawHUD() {
        return this.currentGameType.isSurvivalOrAdventure();
    }
    
    private static int lIlIlIIIIllIllI(final float n, final float n2) {
        return fcmpl(n, n2);
    }
}
