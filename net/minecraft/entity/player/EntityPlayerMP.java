// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.entity.player;

import net.minecraft.item.Item;
import net.minecraft.init.Items;
import net.minecraft.entity.projectile.EntityArrow;
import net.minecraft.util.EntityDamageSource;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.stats.StatList;
import net.minecraft.entity.EntityList;
import net.minecraft.scoreboard.Team;
import net.minecraft.util.DamageSource;
import net.minecraft.item.EnumAction;
import java.util.Set;
import com.google.common.collect.Sets;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.util.JsonSerializableSet;
import org.apache.logging.log4j.LogManager;
import net.minecraft.network.play.server.S0APacketUseBed;
import net.minecraft.crash.CrashReportCategory;
import net.minecraft.scoreboard.Score;
import net.minecraft.util.ReportedException;
import net.minecraft.crash.CrashReport;
import net.minecraft.network.play.server.S1FPacketSetExperience;
import net.minecraft.scoreboard.IScoreObjectiveCriteria;
import net.minecraft.network.play.server.S06PacketUpdateHealth;
import net.minecraft.item.ItemMapBase;
import net.minecraft.network.play.server.S36PacketSignEditorOpen;
import net.minecraft.tileentity.TileEntitySign;
import net.minecraft.network.play.server.S1BPacketEntityAttach;
import net.minecraft.network.play.server.S39PacketPlayerAbilities;
import net.minecraft.network.play.server.S43PacketCamera;
import java.util.Iterator;
import net.minecraft.network.play.server.S26PacketMapChunkBulk;
import net.minecraft.network.play.server.S21PacketChunkData;
import net.minecraft.world.chunk.Chunk;
import net.minecraft.network.play.server.S13PacketDestroyEntities;
import net.minecraft.network.play.server.S48PacketResourcePackSend;
import net.minecraft.inventory.ContainerHorseInventory;
import net.minecraft.entity.passive.EntityHorse;
import net.minecraft.network.play.server.S2EPacketCloseWindow;
import java.util.Collection;
import net.minecraft.block.BlockFenceGate;
import net.minecraft.block.BlockWall;
import net.minecraft.block.BlockFence;
import net.minecraft.block.material.Material;
import net.minecraft.network.play.server.S31PacketWindowProperty;
import net.minecraft.network.play.server.S30PacketWindowItems;
import net.minecraft.network.play.server.S42PacketCombatEvent;
import net.minecraft.network.play.server.S1EPacketRemoveEntityEffect;
import net.minecraft.village.MerchantRecipeList;
import net.minecraft.network.play.server.S3FPacketCustomPayload;
import net.minecraft.network.PacketBuffer;
import io.netty.buffer.Unpooled;
import net.minecraft.inventory.ContainerMerchant;
import net.minecraft.entity.IMerchant;
import net.minecraft.network.play.client.C15PacketClientSettings;
import net.minecraft.network.play.server.S19PacketEntityStatus;
import net.minecraft.network.play.server.S0BPacketAnimation;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.network.play.server.S2BPacketChangeGameState;
import net.minecraft.stats.AchievementList;
import net.minecraft.scoreboard.ScoreObjective;
import net.minecraft.stats.StatBase;
import net.minecraft.network.play.server.S1DPacketEntityEffect;
import net.minecraft.potion.PotionEffect;
import net.minecraft.inventory.ContainerChest;
import net.minecraft.network.play.server.S2DPacketOpenWindow;
import net.minecraft.world.IInteractionObject;
import net.minecraft.network.play.server.S29PacketSoundEffect;
import net.minecraft.util.IChatComponent;
import net.minecraft.network.play.server.S02PacketChat;
import net.minecraft.util.ChatComponentTranslation;
import net.minecraft.world.ILockableContainer;
import net.minecraft.inventory.IInventory;
import net.minecraft.server.management.UserListOpsEntry;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import net.minecraft.util.MathHelper;
import com.google.common.collect.Lists;
import net.minecraft.world.World;
import com.mojang.authlib.GameProfile;
import net.minecraft.world.WorldServer;
import net.minecraft.network.Packet;
import net.minecraft.network.play.server.S2FPacketSetSlot;
import net.minecraft.inventory.SlotCrafting;
import net.minecraft.item.ItemStack;
import net.minecraft.inventory.Container;
import net.minecraft.world.WorldSettings;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.BlockPos;
import net.minecraft.block.Block;
import net.minecraft.server.management.ItemInWorldManager;
import net.minecraft.world.ChunkCoordIntPair;
import net.minecraft.entity.Entity;
import org.apache.logging.log4j.Logger;
import java.util.List;
import net.minecraft.server.MinecraftServer;
import net.minecraft.stats.StatisticsFile;
import net.minecraft.network.NetHandlerPlayServer;
import net.minecraft.inventory.ICrafting;

public class EntityPlayerMP extends EntityPlayer implements ICrafting
{
    private /* synthetic */ EnumChatVisibility chatVisibility;
    private /* synthetic */ int lastFoodLevel;
    private /* synthetic */ long playerLastActiveTime;
    public /* synthetic */ NetHandlerPlayServer playerNetServerHandler;
    private final /* synthetic */ StatisticsFile statsFile;
    public final /* synthetic */ MinecraftServer mcServer;
    private final /* synthetic */ List<Integer> destroyedItemsNetCache;
    public /* synthetic */ boolean isChangingQuantityOnly;
    private /* synthetic */ boolean wasHungry;
    private /* synthetic */ float lastHealth;
    public /* synthetic */ boolean playerConqueredTheEnd;
    private /* synthetic */ Entity spectatingEntity;
    private /* synthetic */ int currentWindowId;
    private static final /* synthetic */ int[] lIIIlIIlllIllI;
    private static final /* synthetic */ String[] lIIIlIIlllIIll;
    private /* synthetic */ String translator;
    public final /* synthetic */ List<ChunkCoordIntPair> loadedChunks;
    public final /* synthetic */ ItemInWorldManager theItemInWorldManager;
    private /* synthetic */ int lastExperience;
    private /* synthetic */ float combinedHealth;
    private /* synthetic */ boolean chatColours;
    private /* synthetic */ int respawnInvulnerabilityTicks;
    
    @Override
    protected void updateFallState(final double lllllllllllllIlIIIlIIllIIIlIIIIl, final boolean lllllllllllllIlIIIlIIllIIIlIIIII, final Block lllllllllllllIlIIIlIIllIIIIlllll, final BlockPos lllllllllllllIlIIIlIIllIIIIllllI) {
    }
    
    @Override
    public void readEntityFromNBT(final NBTTagCompound lllllllllllllIlIIIlIIllIlllIllIl) {
        super.readEntityFromNBT(lllllllllllllIlIIIlIIllIlllIllIl);
        if (lIllllllllIlIll(lllllllllllllIlIIIlIIllIlllIllIl.hasKey(EntityPlayerMP.lIIIlIIlllIIll[EntityPlayerMP.lIIIlIIlllIllI[2]], EntityPlayerMP.lIIIlIIlllIllI[7]) ? 1 : 0)) {
            if (lIllllllllIlIll(MinecraftServer.getServer().getForceGamemode() ? 1 : 0)) {
                this.theItemInWorldManager.setGameType(MinecraftServer.getServer().getGameType());
                "".length();
                if ("  ".length() == 0) {
                    return;
                }
            }
            else {
                this.theItemInWorldManager.setGameType(WorldSettings.GameType.getByID(lllllllllllllIlIIIlIIllIlllIllIl.getInteger(EntityPlayerMP.lIIIlIIlllIIll[EntityPlayerMP.lIIIlIIlllIllI[6]])));
            }
        }
    }
    
    public StatisticsFile getStatFile() {
        return this.statsFile;
    }
    
    @Override
    public void sendSlotContents(final Container lllllllllllllIlIIIlIIlIlllIIIIIl, final int lllllllllllllIlIIIlIIlIlllIIIIII, final ItemStack lllllllllllllIlIIIlIIlIllIllllll) {
        if (lIllllllllIIllI((lllllllllllllIlIIIlIIlIlllIIIIIl.getSlot(lllllllllllllIlIIIlIIlIlllIIIIII) instanceof SlotCrafting) ? 1 : 0) && lIllllllllIIllI(this.isChangingQuantityOnly ? 1 : 0)) {
            this.playerNetServerHandler.sendPacket(new S2FPacketSetSlot(lllllllllllllIlIIIlIIlIlllIIIIIl.windowId, lllllllllllllIlIIIlIIlIlllIIIIII, lllllllllllllIlIIIlIIlIllIllllll));
        }
    }
    
    public void markPlayerActive() {
        this.playerLastActiveTime = MinecraftServer.getCurrentTimeMillis();
    }
    
    private static void lIllllllllIIlII() {
        (lIIIlIIlllIllI = new int[32])[0] = ((0x67 ^ 0x37 ^ (0xA ^ 0x7F)) & (105 + 37 - 31 + 19 ^ 33 + 83 - 26 + 77 ^ -" ".length()));
        EntityPlayerMP.lIIIlIIlllIllI[1] = -(0xFFFFFAFF & 0x5F5E5FF);
        EntityPlayerMP.lIIIlIIlllIllI[2] = " ".length();
        EntityPlayerMP.lIIIlIIlllIllI[3] = (0x43 ^ 0x7F);
        EntityPlayerMP.lIIIlIIlllIllI[4] = (0xF9 ^ 0xB3 ^ (0xE5 ^ 0xAA));
        EntityPlayerMP.lIIIlIIlllIllI[5] = (0x87 ^ 0x81);
        EntityPlayerMP.lIIIlIIlllIllI[6] = "  ".length();
        EntityPlayerMP.lIIIlIIlllIllI[7] = (0x85 ^ 0xB9 ^ (0x54 ^ 0xB));
        EntityPlayerMP.lIIIlIIlllIllI[8] = "   ".length();
        EntityPlayerMP.lIIIlIIlllIllI[9] = -" ".length();
        EntityPlayerMP.lIIIlIIlllIllI[10] = (-" ".length() & (-1 & Integer.MAX_VALUE));
        EntityPlayerMP.lIIIlIIlllIllI[11] = (0x47 ^ 0x43);
        EntityPlayerMP.lIIIlIIlllIllI[12] = (0x27 ^ 0x5A ^ (0x15 ^ 0x78));
        EntityPlayerMP.lIIIlIIlllIllI[13] = (0xFFFF9960 & 0x679F);
        EntityPlayerMP.lIIIlIIlllIllI[14] = (0xAC ^ 0xA6);
        EntityPlayerMP.lIIIlIIlllIllI[15] = (-1 & 0xFFFF);
        EntityPlayerMP.lIIIlIIlllIllI[16] = (0x4B ^ 0x15 ^ (0x79 ^ 0x33));
        EntityPlayerMP.lIIIlIIlllIllI[17] = (0x91 ^ 0x96);
        EntityPlayerMP.lIIIlIIlllIllI[18] = (0xEE ^ 0xA8 ^ (0x1A ^ 0x54));
        EntityPlayerMP.lIIIlIIlllIllI[19] = (0x34 ^ 0x50);
        EntityPlayerMP.lIIIlIIlllIllI[20] = (0x6 ^ 0x4F ^ (0xD1 ^ 0x91));
        EntityPlayerMP.lIIIlIIlllIllI[21] = (0xA8 ^ 0xA3);
        EntityPlayerMP.lIIIlIIlllIllI[22] = (0xF4 ^ 0x82 ^ (0x46 ^ 0x3C));
        EntityPlayerMP.lIIIlIIlllIllI[23] = (0x95 ^ 0x98);
        EntityPlayerMP.lIIIlIIlllIllI[24] = (0x1E ^ 0x10);
        EntityPlayerMP.lIIIlIIlllIllI[25] = (0x64 ^ 0x6B);
        EntityPlayerMP.lIIIlIIlllIllI[26] = (105 + 20 - 50 + 95 ^ 172 + 8 - 1 + 8);
        EntityPlayerMP.lIIIlIIlllIllI[27] = (0xC9 ^ 0x82 ^ (0x2B ^ 0x72));
        EntityPlayerMP.lIIIlIIlllIllI[28] = (22 + 146 - 49 + 89 ^ 70 + 30 + 47 + 48);
        EntityPlayerMP.lIIIlIIlllIllI[29] = (0x76 ^ 0x63);
        EntityPlayerMP.lIIIlIIlllIllI[30] = (0xD1 ^ 0xC7);
        EntityPlayerMP.lIIIlIIlllIllI[31] = (0x4C ^ 0x61 ^ (0xE ^ 0x34));
    }
    
    public EntityPlayerMP(final MinecraftServer lllllllllllllIlIIIlIIllIlllllIIl, final WorldServer lllllllllllllIlIIIlIIlllIIIIIIII, final GameProfile lllllllllllllIlIIIlIIllIllllllll, final ItemInWorldManager lllllllllllllIlIIIlIIllIlllllllI) {
        super(lllllllllllllIlIIIlIIlllIIIIIIII, lllllllllllllIlIIIlIIllIllllllll);
        this.translator = EntityPlayerMP.lIIIlIIlllIIll[EntityPlayerMP.lIIIlIIlllIllI[0]];
        this.loadedChunks = (List<ChunkCoordIntPair>)Lists.newLinkedList();
        this.destroyedItemsNetCache = (List<Integer>)Lists.newLinkedList();
        this.combinedHealth = Float.MIN_VALUE;
        this.lastHealth = -1.0E8f;
        this.lastFoodLevel = EntityPlayerMP.lIIIlIIlllIllI[1];
        this.wasHungry = (EntityPlayerMP.lIIIlIIlllIllI[2] != 0);
        this.lastExperience = EntityPlayerMP.lIIIlIIlllIllI[1];
        this.respawnInvulnerabilityTicks = EntityPlayerMP.lIIIlIIlllIllI[3];
        this.chatColours = (EntityPlayerMP.lIIIlIIlllIllI[2] != 0);
        this.playerLastActiveTime = System.currentTimeMillis();
        this.spectatingEntity = null;
        lllllllllllllIlIIIlIIllIlllllllI.thisPlayerMP = this;
        this.theItemInWorldManager = lllllllllllllIlIIIlIIllIlllllllI;
        BlockPos lllllllllllllIlIIIlIIllIllllllIl = lllllllllllllIlIIIlIIlllIIIIIIII.getSpawnPoint();
        if (lIllllllllIIllI(lllllllllllllIlIIIlIIlllIIIIIIII.provider.getHasNoSky() ? 1 : 0) && lIllllllllIIlll(lllllllllllllIlIIIlIIlllIIIIIIII.getWorldInfo().getGameType(), WorldSettings.GameType.ADVENTURE)) {
            int lllllllllllllIlIIIlIIllIllllllII = Math.max(EntityPlayerMP.lIIIlIIlllIllI[4], lllllllllllllIlIIIlIIllIlllllIIl.getSpawnProtectionSize() - EntityPlayerMP.lIIIlIIlllIllI[5]);
            final int lllllllllllllIlIIIlIIllIlllllIll = MathHelper.floor_double(lllllllllllllIlIIIlIIlllIIIIIIII.getWorldBorder().getClosestDistance(lllllllllllllIlIIIlIIllIllllllIl.getX(), lllllllllllllIlIIIlIIllIllllllIl.getZ()));
            if (lIllllllllIlIII(lllllllllllllIlIIIlIIllIlllllIll, lllllllllllllIlIIIlIIllIllllllII)) {
                lllllllllllllIlIIIlIIllIllllllII = lllllllllllllIlIIIlIIllIlllllIll;
            }
            if (lIllllllllIlIIl(lllllllllllllIlIIIlIIllIlllllIll, EntityPlayerMP.lIIIlIIlllIllI[2])) {
                lllllllllllllIlIIIlIIllIllllllII = EntityPlayerMP.lIIIlIIlllIllI[2];
            }
            lllllllllllllIlIIIlIIllIllllllIl = lllllllllllllIlIIIlIIlllIIIIIIII.getTopSolidOrLiquidBlock(lllllllllllllIlIIIlIIllIllllllIl.add(this.rand.nextInt(lllllllllllllIlIIIlIIllIllllllII * EntityPlayerMP.lIIIlIIlllIllI[6]) - lllllllllllllIlIIIlIIllIllllllII, EntityPlayerMP.lIIIlIIlllIllI[0], this.rand.nextInt(lllllllllllllIlIIIlIIllIllllllII * EntityPlayerMP.lIIIlIIlllIllI[6]) - lllllllllllllIlIIIlIIllIllllllII));
        }
        this.mcServer = lllllllllllllIlIIIlIIllIlllllIIl;
        this.statsFile = lllllllllllllIlIIIlIIllIlllllIIl.getConfigurationManager().getPlayerStatsFile(this);
        this.stepHeight = 0.0f;
        this.moveToBlockPosAndAngles(lllllllllllllIlIIIlIIllIllllllIl, 0.0f, 0.0f);
        "".length();
        if (null != null) {
            throw null;
        }
        while (lIllllllllIIllI(lllllllllllllIlIIIlIIlllIIIIIIII.getCollidingBoundingBoxes(this, this.getEntityBoundingBox()).isEmpty() ? 1 : 0) && !lIllllllllIlIlI(lIllllllllIIlIl(this.posY, 255.0))) {
            this.setPosition(this.posX, this.posY + 1.0, this.posZ);
        }
    }
    
    private boolean canPlayersAttack() {
        return this.mcServer.isPVPEnabled();
    }
    
    private static String lIlllllllIllIll(final String lllllllllllllIlIIIlIIlIIlIlIlIlI, final String lllllllllllllIlIIIlIIlIIlIlIlIIl) {
        try {
            final SecretKeySpec lllllllllllllIlIIIlIIlIIlIlIllll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIlIIIlIIlIIlIlIlIIl.getBytes(StandardCharsets.UTF_8)), EntityPlayerMP.lIIIlIIlllIllI[18]), "DES");
            final Cipher lllllllllllllIlIIIlIIlIIlIlIlllI = Cipher.getInstance("DES");
            lllllllllllllIlIIIlIIlIIlIlIlllI.init(EntityPlayerMP.lIIIlIIlllIllI[6], lllllllllllllIlIIIlIIlIIlIlIllll);
            return new String(lllllllllllllIlIIIlIIlIIlIlIlllI.doFinal(Base64.getDecoder().decode(lllllllllllllIlIIIlIIlIIlIlIlIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIlIIIlIIlIIlIlIllIl) {
            lllllllllllllIlIIIlIIlIIlIlIllIl.printStackTrace();
            return null;
        }
    }
    
    public WorldServer getServerForPlayer() {
        return (WorldServer)this.worldObj;
    }
    
    private static boolean lIlllllllllIIll(final Object lllllllllllllIlIIIlIIlIIIllIlIIl, final Object lllllllllllllIlIIIlIIlIIIllIlIII) {
        return lllllllllllllIlIIIlIIlIIIllIlIIl == lllllllllllllIlIIIlIIlIIIllIlIII;
    }
    
    @Override
    public void attackTargetEntityWithCurrentItem(final Entity lllllllllllllIlIIIlIIlIIlIlllIII) {
        if (lIlllllllllIIll(this.theItemInWorldManager.getGameType(), WorldSettings.GameType.SPECTATOR)) {
            this.setSpectatingEntity(lllllllllllllIlIIIlIIlIIlIlllIII);
            "".length();
            if (((0x3A ^ 0xE ^ (0xA6 ^ 0x95)) & (0xB2 ^ 0x86 ^ (0x6A ^ 0x59) ^ -" ".length())) != ((0x81 ^ 0xC6 ^ (0x36 ^ 0x4B)) & (0x43 ^ 0x0 ^ (0x0 ^ 0x79) ^ -" ".length()))) {
                return;
            }
        }
        else {
            super.attackTargetEntityWithCurrentItem(lllllllllllllIlIIIlIIlIIlIlllIII);
        }
    }
    
    @Override
    public boolean canCommandSenderUseCommand(final int lllllllllllllIlIIIlIIlIIllllIllI, final String lllllllllllllIlIIIlIIlIIllllIlIl) {
        if (lIllllllllIlIll(EntityPlayerMP.lIIIlIIlllIIll[EntityPlayerMP.lIIIlIIlllIllI[12]].equals(lllllllllllllIlIIIlIIlIIllllIlIl) ? 1 : 0) && lIllllllllIIllI(this.mcServer.isDedicatedServer() ? 1 : 0)) {
            return EntityPlayerMP.lIIIlIIlllIllI[2] != 0;
        }
        if (!lIllllllllIIllI(EntityPlayerMP.lIIIlIIlllIIll[EntityPlayerMP.lIIIlIIlllIllI[26]].equals(lllllllllllllIlIIIlIIlIIllllIlIl) ? 1 : 0) || !lIllllllllIIllI(EntityPlayerMP.lIIIlIIlllIIll[EntityPlayerMP.lIIIlIIlllIllI[27]].equals(lllllllllllllIlIIIlIIlIIllllIlIl) ? 1 : 0) || !lIllllllllIIllI(EntityPlayerMP.lIIIlIIlllIIll[EntityPlayerMP.lIIIlIIlllIllI[28]].equals(lllllllllllllIlIIIlIIlIIllllIlIl) ? 1 : 0) || !lIllllllllIIllI(EntityPlayerMP.lIIIlIIlllIIll[EntityPlayerMP.lIIIlIIlllIllI[16]].equals(lllllllllllllIlIIIlIIlIIllllIlIl) ? 1 : 0)) {
            return EntityPlayerMP.lIIIlIIlllIllI[2] != 0;
        }
        if (lIllllllllIlIll(this.mcServer.getConfigurationManager().canSendCommands(this.getGameProfile()) ? 1 : 0)) {
            final UserListOpsEntry lllllllllllllIlIIIlIIlIIlllllIII = this.mcServer.getConfigurationManager().getOppedPlayers().getEntry(this.getGameProfile());
            int n;
            if (lIllllllllIlllI(lllllllllllllIlIIIlIIlIIlllllIII)) {
                if (lIllllllllIllIl(lllllllllllllIlIIIlIIlIIlllllIII.getPermissionLevel(), lllllllllllllIlIIIlIIlIIllllIllI)) {
                    n = EntityPlayerMP.lIIIlIIlllIllI[2];
                    "".length();
                    if (-" ".length() != -" ".length()) {
                        return ((0x58 ^ 0x5F) & ~(0xA3 ^ 0xA4)) != 0x0;
                    }
                }
                else {
                    n = EntityPlayerMP.lIIIlIIlllIllI[0];
                    "".length();
                    if ("   ".length() <= 0) {
                        return ((0xC8 ^ 0x83) & ~(0xDF ^ 0x94)) != 0x0;
                    }
                }
            }
            else if (lIllllllllIllIl(this.mcServer.getOpPermissionLevel(), lllllllllllllIlIIIlIIlIIllllIllI)) {
                n = EntityPlayerMP.lIIIlIIlllIllI[2];
                "".length();
                if ("  ".length() == 0) {
                    return ((79 + 59 - 87 + 197 ^ 160 + 97 - 172 + 93) & (0x35 ^ 0x4C ^ (0xA2 ^ 0x91) ^ -" ".length())) != 0x0;
                }
            }
            else {
                n = EntityPlayerMP.lIIIlIIlllIllI[0];
            }
            return n != 0;
        }
        return EntityPlayerMP.lIIIlIIlllIllI[0] != 0;
    }
    
    @Override
    protected void updatePotionMetadata() {
        if (lIllllllllIlIll(this.isSpectator() ? 1 : 0)) {
            this.resetPotionEffectMetadata();
            this.setInvisible((boolean)(EntityPlayerMP.lIIIlIIlllIllI[2] != 0));
            "".length();
            if (null != null) {
                return;
            }
        }
        else {
            super.updatePotionMetadata();
        }
        this.getServerForPlayer().getEntityTracker().func_180245_a(this);
    }
    
    public void mountEntityAndWakeUp() {
        if (lIllllllllIlllI(this.riddenByEntity)) {
            this.riddenByEntity.mountEntity(this);
        }
        if (lIllllllllIlIll(this.sleeping ? 1 : 0)) {
            this.wakeUpPlayer((boolean)(EntityPlayerMP.lIIIlIIlllIllI[2] != 0), (boolean)(EntityPlayerMP.lIIIlIIlllIllI[0] != 0), (boolean)(EntityPlayerMP.lIIIlIIlllIllI[0] != 0));
        }
    }
    
    private static boolean lIllllllllIllll(final int lllllllllllllIlIIIlIIlIIIlllllll, final int lllllllllllllIlIIIlIIlIIIllllllI) {
        return lllllllllllllIlIIIlIIlIIIlllllll == lllllllllllllIlIIIlIIlIIIllllllI;
    }
    
    @Override
    public void displayGUIChest(final IInventory lllllllllllllIlIIIlIIlIllllIllII) {
        if (lIllllllllIIlll(this.openContainer, this.inventoryContainer)) {
            this.closeScreen();
        }
        if (lIllllllllIlIll((lllllllllllllIlIIIlIIlIllllIllII instanceof ILockableContainer) ? 1 : 0)) {
            final ILockableContainer lllllllllllllIlIIIlIIlIllllIlllI = (ILockableContainer)lllllllllllllIlIIIlIIlIllllIllII;
            if (lIllllllllIlIll(lllllllllllllIlIIIlIIlIllllIlllI.isLocked() ? 1 : 0) && lIllllllllIIllI(this.canOpen(lllllllllllllIlIIIlIIlIllllIlllI.getLockCode()) ? 1 : 0) && lIllllllllIIllI(this.isSpectator() ? 1 : 0)) {
                final NetHandlerPlayServer playerNetServerHandler = this.playerNetServerHandler;
                final String lllllllllllllIlIIlIlllIIlIIIIIlI = EntityPlayerMP.lIIIlIIlllIIll[EntityPlayerMP.lIIIlIIlllIllI[20]];
                final Object[] lllllllllllllIlIIlIlllIIlIIIIIIl = new Object[EntityPlayerMP.lIIIlIIlllIllI[2]];
                lllllllllllllIlIIlIlllIIlIIIIIIl[EntityPlayerMP.lIIIlIIlllIllI[0]] = lllllllllllllIlIIIlIIlIllllIllII.getDisplayName();
                playerNetServerHandler.sendPacket(new S02PacketChat(new ChatComponentTranslation(lllllllllllllIlIIlIlllIIlIIIIIlI, lllllllllllllIlIIlIlllIIlIIIIIIl), (byte)EntityPlayerMP.lIIIlIIlllIllI[6]));
                this.playerNetServerHandler.sendPacket(new S29PacketSoundEffect(EntityPlayerMP.lIIIlIIlllIIll[EntityPlayerMP.lIIIlIIlllIllI[14]], this.posX, this.posY, this.posZ, 1.0f, 1.0f));
                return;
            }
        }
        this.getNextWindowId();
        if (lIllllllllIlIll((lllllllllllllIlIIIlIIlIllllIllII instanceof IInteractionObject) ? 1 : 0)) {
            this.playerNetServerHandler.sendPacket(new S2DPacketOpenWindow(this.currentWindowId, ((IInteractionObject)lllllllllllllIlIIIlIIlIllllIllII).getGuiID(), lllllllllllllIlIIIlIIlIllllIllII.getDisplayName(), lllllllllllllIlIIIlIIlIllllIllII.getSizeInventory()));
            this.openContainer = ((IInteractionObject)lllllllllllllIlIIIlIIlIllllIllII).createContainer(this.inventory, this);
            "".length();
            if (-"  ".length() >= 0) {
                return;
            }
        }
        else {
            this.playerNetServerHandler.sendPacket(new S2DPacketOpenWindow(this.currentWindowId, EntityPlayerMP.lIIIlIIlllIIll[EntityPlayerMP.lIIIlIIlllIllI[21]], lllllllllllllIlIIIlIIlIllllIllII.getDisplayName(), lllllllllllllIlIIIlIIlIllllIllII.getSizeInventory()));
            this.openContainer = new ContainerChest(this.inventory, lllllllllllllIlIIIlIIlIllllIllII, this);
        }
        this.openContainer.windowId = this.currentWindowId;
        this.openContainer.onCraftGuiOpened(this);
    }
    
    public void setPlayerHealthUpdated() {
        this.lastHealth = -1.0E8f;
    }
    
    @Override
    protected void onNewPotionEffect(final PotionEffect lllllllllllllIlIIIlIIlIlIIllllII) {
        super.onNewPotionEffect(lllllllllllllIlIIIlIIlIlIIllllII);
        this.playerNetServerHandler.sendPacket(new S1DPacketEntityEffect(this.getEntityId(), lllllllllllllIlIIIlIIlIlIIllllII));
    }
    
    @Override
    public void addStat(final StatBase lllllllllllllIlIIIlIIlIlIlllIIIl, final int lllllllllllllIlIIIlIIlIlIlllIIII) {
        if (lIllllllllIlllI(lllllllllllllIlIIIlIIlIlIlllIIIl)) {
            this.statsFile.increaseStat(this, lllllllllllllIlIIIlIIlIlIlllIIIl, lllllllllllllIlIIIlIIlIlIlllIIII);
            final long lllllllllllllIlIIIlIIlIlIllIlllI = (long)this.getWorldScoreboard().getObjectivesFromCriteria(lllllllllllllIlIIIlIIlIlIlllIIIl.func_150952_k()).iterator();
            "".length();
            if (-" ".length() == ((0x16 ^ 0x11) & ~(0x25 ^ 0x22))) {
                return;
            }
            while (!lIllllllllIIllI(((Iterator)lllllllllllllIlIIIlIIlIlIllIlllI).hasNext() ? 1 : 0)) {
                final ScoreObjective lllllllllllllIlIIIlIIlIlIlllIIll = ((Iterator<ScoreObjective>)lllllllllllllIlIIIlIIlIlIllIlllI).next();
                this.getWorldScoreboard().getValueFromObjective(this.getName(), lllllllllllllIlIIIlIIlIlIlllIIll).increseScore(lllllllllllllIlIIIlIIlIlIlllIIII);
            }
            if (lIllllllllIlIll(this.statsFile.func_150879_e() ? 1 : 0)) {
                this.statsFile.func_150876_a(this);
            }
        }
    }
    
    @Override
    public void addChatComponentMessage(final IChatComponent lllllllllllllIlIIIlIIlIlIlIlIlll) {
        this.playerNetServerHandler.sendPacket(new S02PacketChat(lllllllllllllIlIIIlIIlIlIlIlIlll));
    }
    
    @Override
    public void travelToDimension(int lllllllllllllIlIIIlIIllIIlIlllIl) {
        if (lIllllllllIllll(this.dimension, EntityPlayerMP.lIIIlIIlllIllI[2]) && lIllllllllIllll((int)lllllllllllllIlIIIlIIllIIlIlllIl, EntityPlayerMP.lIIIlIIlllIllI[2])) {
            this.triggerAchievement(AchievementList.theEnd2);
            this.worldObj.removeEntity(this);
            this.playerConqueredTheEnd = (EntityPlayerMP.lIIIlIIlllIllI[2] != 0);
            this.playerNetServerHandler.sendPacket(new S2BPacketChangeGameState(EntityPlayerMP.lIIIlIIlllIllI[11], 0.0f));
            "".length();
            if (null != null) {
                return;
            }
        }
        else {
            if (lIllllllllIIllI(this.dimension) && lIllllllllIllll((int)lllllllllllllIlIIIlIIllIIlIlllIl, EntityPlayerMP.lIIIlIIlllIllI[2])) {
                this.triggerAchievement(AchievementList.theEnd);
                final BlockPos lllllllllllllIlIIIlIIllIIlIlllll = this.mcServer.worldServerForDimension((int)lllllllllllllIlIIIlIIllIIlIlllIl).getSpawnCoordinate();
                if (lIllllllllIlllI(lllllllllllllIlIIIlIIllIIlIlllll)) {
                    this.playerNetServerHandler.setPlayerLocation(lllllllllllllIlIIIlIIllIIlIlllll.getX(), lllllllllllllIlIIIlIIllIIlIlllll.getY(), lllllllllllllIlIIIlIIllIIlIlllll.getZ(), 0.0f, 0.0f);
                }
                lllllllllllllIlIIIlIIllIIlIlllIl = EntityPlayerMP.lIIIlIIlllIllI[2];
                "".length();
                if (null != null) {
                    return;
                }
            }
            else {
                this.triggerAchievement(AchievementList.portal);
            }
            this.mcServer.getConfigurationManager().transferPlayerToDimension(this, (int)lllllllllllllIlIIIlIIllIIlIlllIl);
            this.lastExperience = EntityPlayerMP.lIIIlIIlllIllI[9];
            this.lastHealth = -1.0f;
            this.lastFoodLevel = EntityPlayerMP.lIIIlIIlllIllI[9];
        }
    }
    
    private void sendTileEntityUpdate(final TileEntity lllllllllllllIlIIIlIIllIIlIlIIIl) {
        if (lIllllllllIlllI(lllllllllllllIlIIIlIIllIIlIlIIIl)) {
            final Packet lllllllllllllIlIIIlIIllIIlIlIIII = lllllllllllllIlIIIlIIllIIlIlIIIl.getDescriptionPacket();
            if (lIllllllllIlllI(lllllllllllllIlIIIlIIllIIlIlIIII)) {
                this.playerNetServerHandler.sendPacket(lllllllllllllIlIIIlIIllIIlIlIIII);
            }
        }
    }
    
    public void updateHeldItem() {
        if (lIllllllllIIllI(this.isChangingQuantityOnly ? 1 : 0)) {
            this.playerNetServerHandler.sendPacket(new S2FPacketSetSlot(EntityPlayerMP.lIIIlIIlllIllI[9], EntityPlayerMP.lIIIlIIlllIllI[9], this.inventory.getItemStack()));
        }
    }
    
    private static int lIlllllllllIIII(final float n, final float n2) {
        return fcmpl(n, n2);
    }
    
    public void addSelfToInternalCraftingInventory() {
        this.openContainer.onCraftGuiOpened(this);
    }
    
    @Override
    public void writeEntityToNBT(final NBTTagCompound lllllllllllllIlIIIlIIllIlllIlIIl) {
        super.writeEntityToNBT(lllllllllllllIlIIIlIIllIlllIlIIl);
        lllllllllllllIlIIIlIIllIlllIlIIl.setInteger(EntityPlayerMP.lIIIlIIlllIIll[EntityPlayerMP.lIIIlIIlllIllI[8]], this.theItemInWorldManager.getGameType().getID());
    }
    
    @Override
    public boolean isSpectatedByPlayer(final EntityPlayerMP lllllllllllllIlIIIlIIllIIlIlIllI) {
        int spectatedByPlayer;
        if (lIllllllllIlIll(lllllllllllllIlIIIlIIllIIlIlIllI.isSpectator() ? 1 : 0)) {
            if (lIlllllllllIIll(this.getSpectatingEntity(), this)) {
                spectatedByPlayer = EntityPlayerMP.lIIIlIIlllIllI[2];
                "".length();
                if ("   ".length() <= 0) {
                    return ((0x20 ^ 0x1F) & ~(0x23 ^ 0x1C)) != 0x0;
                }
            }
            else {
                spectatedByPlayer = EntityPlayerMP.lIIIlIIlllIllI[0];
                "".length();
                if (null != null) {
                    return ((0x6B ^ 0x1B ^ (0x50 ^ 0x2E)) & (113 + 154 - 202 + 120 ^ 150 + 29 - 7 + 11 ^ -" ".length())) != 0x0;
                }
            }
        }
        else if (lIllllllllIlIll(this.isSpectator() ? 1 : 0)) {
            spectatedByPlayer = EntityPlayerMP.lIIIlIIlllIllI[0];
            "".length();
            if (-" ".length() >= "  ".length()) {
                return ((0x8A ^ 0x84) & ~(0x29 ^ 0x27)) != 0x0;
            }
        }
        else {
            spectatedByPlayer = (super.isSpectatedByPlayer(lllllllllllllIlIIIlIIllIIlIlIllI) ? 1 : 0);
        }
        return spectatedByPlayer != 0;
    }
    
    @Override
    public void wakeUpPlayer(final boolean lllllllllllllIlIIIlIIllIIIlIlllI, final boolean lllllllllllllIlIIIlIIllIIIllIIIl, final boolean lllllllllllllIlIIIlIIllIIIllIIII) {
        if (lIllllllllIlIll(this.isPlayerSleeping() ? 1 : 0)) {
            this.getServerForPlayer().getEntityTracker().func_151248_b(this, new S0BPacketAnimation(this, EntityPlayerMP.lIIIlIIlllIllI[6]));
        }
        super.wakeUpPlayer(lllllllllllllIlIIIlIIllIIIlIlllI, lllllllllllllIlIIIlIIllIIIllIIIl, lllllllllllllIlIIIlIIllIIIllIIII);
        if (lIllllllllIlllI(this.playerNetServerHandler)) {
            this.playerNetServerHandler.setPlayerLocation(this.posX, this.posY, this.posZ, this.rotationYaw, this.rotationPitch);
        }
    }
    
    private static void lIllllllllIIIII() {
        (lIIIlIIlllIIll = new String[EntityPlayerMP.lIIIlIIlllIllI[31]])[EntityPlayerMP.lIIIlIIlllIllI[0]] = lIlllllllIllIIl("ByoJMRw=", "bDVdO");
        EntityPlayerMP.lIIIlIIlllIIll[EntityPlayerMP.lIIIlIIlllIllI[2]] = lIlllllllIllIlI("wUsyuHQCwr7a8jz+jI97gg==", "uwTxW");
        EntityPlayerMP.lIIIlIIlllIIll[EntityPlayerMP.lIIIlIIlllIllI[6]] = lIlllllllIllIIl("AQ4kNBwDJSQgHCUbNSg=", "qbEMy");
        EntityPlayerMP.lIIIlIIlllIIll[EntityPlayerMP.lIIIlIIlllIllI[8]] = lIlllllllIllIlI("Tvv6dvHiSjLHKqvUZTUZ7A==", "RLObQ");
        EntityPlayerMP.lIIIlIIlllIIll[EntityPlayerMP.lIIIlIIlllIllI[11]] = lIlllllllIllIlI("7h9Zat75ncz1Poa/QqJ/DA==", "QMmuC");
        EntityPlayerMP.lIIIlIIlllIIll[EntityPlayerMP.lIIIlIIlllIllI[4]] = lIlllllllIllIIl("EyAwCxIxbDMXHi0rcQYeICc0Fg==", "CLQrw");
        EntityPlayerMP.lIIIlIIlllIIll[EntityPlayerMP.lIIIlIIlllIllI[5]] = lIlllllllIllIIl("OAA9NS0uCSYqJC4bISMOLhs=", "KhRBi");
        EntityPlayerMP.lIIIlIIlllIIll[EntityPlayerMP.lIIIlIIlllIllI[17]] = lIlllllllIllIll("b3/JsPuWTx7JqD7Yiw28Xg==", "dvwrh");
        EntityPlayerMP.lIIIlIIlllIIll[EntityPlayerMP.lIIIlIIlllIllI[18]] = lIlllllllIllIlI("E4KsKcDUUmA=", "avuRY");
        EntityPlayerMP.lIIIlIIlllIIll[EntityPlayerMP.lIIIlIIlllIllI[20]] = lIlllllllIllIlI("Kn4getN3aBXX3Q3L6Cv6o73770UREe6F", "BlvqW");
        EntityPlayerMP.lIIIlIIlllIIll[EntityPlayerMP.lIIIlIIlllIllI[14]] = lIlllllllIllIIl("GyU0HiYEaj4VJhsbORYmGiE=", "iDZzI");
        EntityPlayerMP.lIIIlIIlllIIll[EntityPlayerMP.lIIIlIIlllIllI[21]] = lIlllllllIllIIl("OBscHTcnExQMbjYdHAw1PBwXCg==", "UrrxT");
        EntityPlayerMP.lIIIlIIlllIIll[EntityPlayerMP.lIIIlIIlllIllI[22]] = lIlllllllIllIIl("AgA3MjUdCD8jbBkANTs3CAwr", "oiYWV");
        EntityPlayerMP.lIIIlIIlllIIll[EntityPlayerMP.lIIIlIIlllIllI[23]] = lIlllllllIllIIl("NxoPLAI2MAAM", "zYsxp");
        EntityPlayerMP.lIIIlIIlllIIll[EntityPlayerMP.lIIIlIIlllIllI[24]] = lIlllllllIllIlI("N9hVOB/W4bhFkGIpu23siw==", "aPtkL");
        EntityPlayerMP.lIIIlIIlllIIll[EntityPlayerMP.lIIIlIIlllIllI[25]] = lIlllllllIllIll("Xf+yc9rqRQBCfTadqof6uw==", "buXZX");
        EntityPlayerMP.lIIIlIIlllIIll[EntityPlayerMP.lIIIlIIlllIllI[12]] = lIlllllllIllIIl("IyQfIw==", "PAzGu");
        EntityPlayerMP.lIIIlIIlllIIll[EntityPlayerMP.lIIIlIIlllIllI[26]] = lIlllllllIllIll("wGkyTATfSuQ=", "fuRJT");
        EntityPlayerMP.lIIIlIIlllIIll[EntityPlayerMP.lIIIlIIlllIllI[27]] = lIlllllllIllIlI("4Dnz+dFju9Q=", "zoBRH");
        EntityPlayerMP.lIIIlIIlllIIll[EntityPlayerMP.lIIIlIIlllIllI[28]] = lIlllllllIllIIl("Jjc=", "KRKSN");
        EntityPlayerMP.lIIIlIIlllIIll[EntityPlayerMP.lIIIlIIlllIllI[16]] = lIlllllllIllIll("ad7P8w9/tp4=", "JBLLf");
        EntityPlayerMP.lIIIlIIlllIIll[EntityPlayerMP.lIIIlIIlllIllI[29]] = lIlllllllIllIlI("+kniJhC1yWY=", "MWQfR");
        EntityPlayerMP.lIIIlIIlllIIll[EntityPlayerMP.lIIIlIIlllIllI[30]] = lIlllllllIllIIl("TA==", "vZrBn");
    }
    
    private static boolean lIlllllllllIIIl(final int lllllllllllllIlIIIlIIlIIIlIllIIl, final int lllllllllllllIlIIIlIIlIIIlIllIII) {
        return lllllllllllllIlIIIlIIlIIIlIllIIl != lllllllllllllIlIIIlIIlIIIlIllIII;
    }
    
    private static boolean lIlllllllllIIlI(final Object lllllllllllllIlIIIlIIlIIIllIIllI) {
        return lllllllllllllIlIIIlIIlIIIllIIllI == null;
    }
    
    @Override
    protected void onItemUseFinish() {
        this.playerNetServerHandler.sendPacket(new S19PacketEntityStatus(this, (byte)EntityPlayerMP.lIIIlIIlllIllI[20]));
        super.onItemUseFinish();
    }
    
    @Override
    public void addExperienceLevel(final int lllllllllllllIlIIIlIIllIlllIIIll) {
        super.addExperienceLevel(lllllllllllllIlIIIlIIllIlllIIIll);
        this.lastExperience = EntityPlayerMP.lIIIlIIlllIllI[9];
    }
    
    public void handleClientSettings(final C15PacketClientSettings lllllllllllllIlIIIlIIlIIlllIlIlI) {
        this.translator = lllllllllllllIlIIIlIIlIIlllIlIlI.getLang();
        this.chatVisibility = lllllllllllllIlIIIlIIlIIlllIlIlI.getChatVisibility();
        this.chatColours = lllllllllllllIlIIIlIIlIIlllIlIlI.isColorsEnabled();
        this.getDataWatcher().updateObject(EntityPlayerMP.lIIIlIIlllIllI[14], (byte)lllllllllllllIlIIIlIIlIIlllIlIlI.getModelPartFlags());
    }
    
    @Override
    public void displayVillagerTradeGui(final IMerchant lllllllllllllIlIIIlIIlIlllIlllIl) {
        this.getNextWindowId();
        this.openContainer = new ContainerMerchant(this.inventory, lllllllllllllIlIIIlIIlIlllIlllIl, this.worldObj);
        this.openContainer.windowId = this.currentWindowId;
        this.openContainer.onCraftGuiOpened(this);
        final IInventory lllllllllllllIlIIIlIIlIllllIIIlI = ((ContainerMerchant)this.openContainer).getMerchantInventory();
        final IChatComponent lllllllllllllIlIIIlIIlIllllIIIIl = lllllllllllllIlIIIlIIlIlllIlllIl.getDisplayName();
        this.playerNetServerHandler.sendPacket(new S2DPacketOpenWindow(this.currentWindowId, EntityPlayerMP.lIIIlIIlllIIll[EntityPlayerMP.lIIIlIIlllIllI[22]], lllllllllllllIlIIIlIIlIllllIIIIl, lllllllllllllIlIIIlIIlIllllIIIlI.getSizeInventory()));
        final MerchantRecipeList lllllllllllllIlIIIlIIlIllllIIIII = lllllllllllllIlIIIlIIlIlllIlllIl.getRecipes(this);
        if (lIllllllllIlllI(lllllllllllllIlIIIlIIlIllllIIIII)) {
            final PacketBuffer lllllllllllllIlIIIlIIlIlllIlllll = new PacketBuffer(Unpooled.buffer());
            lllllllllllllIlIIIlIIlIlllIlllll.writeInt(this.currentWindowId);
            "".length();
            lllllllllllllIlIIIlIIlIllllIIIII.writeToBuf(lllllllllllllIlIIIlIIlIlllIlllll);
            this.playerNetServerHandler.sendPacket(new S3FPacketCustomPayload(EntityPlayerMP.lIIIlIIlllIIll[EntityPlayerMP.lIIIlIIlllIllI[23]], lllllllllllllIlIIIlIIlIlllIlllll));
        }
    }
    
    @Override
    protected void onFinishedPotionEffect(final PotionEffect lllllllllllllIlIIIlIIlIlIIlIllll) {
        super.onFinishedPotionEffect(lllllllllllllIlIIIlIIlIlIIlIllll);
        this.playerNetServerHandler.sendPacket(new S1EPacketRemoveEntityEffect(this.getEntityId(), lllllllllllllIlIIIlIIlIlIIlIllll));
    }
    
    @Override
    public void sendEnterCombat() {
        super.sendEnterCombat();
        this.playerNetServerHandler.sendPacket(new S42PacketCombatEvent(this.getCombatTracker(), S42PacketCombatEvent.Event.ENTER_COMBAT));
    }
    
    public void closeContainer() {
        this.openContainer.onContainerClosed(this);
        this.openContainer = this.inventoryContainer;
    }
    
    private static boolean lIllllllllIIllI(final int lllllllllllllIlIIIlIIlIIIllIIIlI) {
        return lllllllllllllIlIIIlIIlIIIllIIIlI == 0;
    }
    
    @Override
    public void displayGui(final IInteractionObject lllllllllllllIlIIIlIIlIlllllIllI) {
        this.getNextWindowId();
        this.playerNetServerHandler.sendPacket(new S2DPacketOpenWindow(this.currentWindowId, lllllllllllllIlIIIlIIlIlllllIllI.getGuiID(), lllllllllllllIlIIIlIIlIlllllIllI.getDisplayName()));
        this.openContainer = lllllllllllllIlIIIlIIlIlllllIllI.createContainer(this.inventory, this);
        this.openContainer.windowId = this.currentWindowId;
        this.openContainer.onCraftGuiOpened(this);
    }
    
    private static int lIllllllllIIlIl(final double n, final double n2) {
        return dcmpg(n, n2);
    }
    
    @Override
    public void updateCraftingInventory(final Container lllllllllllllIlIIIlIIlIllIlIllIl, final List<ItemStack> lllllllllllllIlIIIlIIlIllIlIllII) {
        this.playerNetServerHandler.sendPacket(new S30PacketWindowItems(lllllllllllllIlIIIlIIlIllIlIllIl.windowId, lllllllllllllIlIIIlIIlIllIlIllII));
        this.playerNetServerHandler.sendPacket(new S2FPacketSetSlot(EntityPlayerMP.lIIIlIIlllIllI[9], EntityPlayerMP.lIIIlIIlllIllI[9], this.inventory.getItemStack()));
    }
    
    private static boolean lIllllllllIlIll(final int lllllllllllllIlIIIlIIlIIIllIIlII) {
        return lllllllllllllIlIIIlIIlIIIllIIlII != 0;
    }
    
    private static boolean lIllllllllIlIII(final int lllllllllllllIlIIIlIIlIIIlllIlll, final int lllllllllllllIlIIIlIIlIIIlllIllI) {
        return lllllllllllllIlIIIlIIlIIIlllIlll < lllllllllllllIlIIIlIIlIIIlllIllI;
    }
    
    private static String lIlllllllIllIIl(String lllllllllllllIlIIIlIIlIIlIIIlIlI, final String lllllllllllllIlIIIlIIlIIlIIIlllI) {
        lllllllllllllIlIIIlIIlIIlIIIlIlI = new String(Base64.getDecoder().decode(lllllllllllllIlIIIlIIlIIlIIIlIlI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIlIIIlIIlIIlIIIllIl = new StringBuilder();
        final char[] lllllllllllllIlIIIlIIlIIlIIIllII = lllllllllllllIlIIIlIIlIIlIIIlllI.toCharArray();
        int lllllllllllllIlIIIlIIlIIlIIIlIll = EntityPlayerMP.lIIIlIIlllIllI[0];
        final double lllllllllllllIlIIIlIIlIIlIIIIlIl = (Object)lllllllllllllIlIIIlIIlIIlIIIlIlI.toCharArray();
        final Exception lllllllllllllIlIIIlIIlIIlIIIIlII = (Exception)lllllllllllllIlIIIlIIlIIlIIIIlIl.length;
        int lllllllllllllIlIIIlIIlIIlIIIIIll = EntityPlayerMP.lIIIlIIlllIllI[0];
        while (lIllllllllIlIII(lllllllllllllIlIIIlIIlIIlIIIIIll, (int)lllllllllllllIlIIIlIIlIIlIIIIlII)) {
            final char lllllllllllllIlIIIlIIlIIlIIlIIII = lllllllllllllIlIIIlIIlIIlIIIIlIl[lllllllllllllIlIIIlIIlIIlIIIIIll];
            lllllllllllllIlIIIlIIlIIlIIIllIl.append((char)(lllllllllllllIlIIIlIIlIIlIIlIIII ^ lllllllllllllIlIIIlIIlIIlIIIllII[lllllllllllllIlIIIlIIlIIlIIIlIll % lllllllllllllIlIIIlIIlIIlIIIllII.length]));
            "".length();
            ++lllllllllllllIlIIIlIIlIIlIIIlIll;
            ++lllllllllllllIlIIIlIIlIIlIIIIIll;
            "".length();
            if (-" ".length() >= ((0x4A ^ 0x5D ^ (0x22 ^ 0x6C)) & (0xE0 ^ 0x9D ^ (0x94 ^ 0xB0) ^ -" ".length()))) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIlIIIlIIlIIlIIIllIl);
    }
    
    @Override
    public void func_175173_a(final Container lllllllllllllIlIIIlIIlIllIIllIlI, final IInventory lllllllllllllIlIIIlIIlIllIIlIlIl) {
        int lllllllllllllIlIIIlIIlIllIIllIII = EntityPlayerMP.lIIIlIIlllIllI[0];
        "".length();
        if ((0xBC ^ 0xB8) < ((0xB0 ^ 0x88) & ~(0x60 ^ 0x58))) {
            return;
        }
        while (!lIllllllllIllIl(lllllllllllllIlIIIlIIlIllIIllIII, lllllllllllllIlIIIlIIlIllIIlIlIl.getFieldCount())) {
            this.playerNetServerHandler.sendPacket(new S31PacketWindowProperty(lllllllllllllIlIIIlIIlIllIIllIlI.windowId, lllllllllllllIlIIIlIIlIllIIllIII, lllllllllllllIlIIIlIIlIllIIlIlIl.getField(lllllllllllllIlIIIlIIlIllIIllIII)));
            ++lllllllllllllIlIIIlIIlIllIIllIII;
        }
    }
    
    private static boolean lIllllllllIlIIl(final int lllllllllllllIlIIIlIIlIIIlllIIll, final int lllllllllllllIlIIIlIIlIIIlllIIlI) {
        return lllllllllllllIlIIIlIIlIIIlllIIll <= lllllllllllllIlIIIlIIlIIIlllIIlI;
    }
    
    public void handleFalling(final double lllllllllllllIlIIIlIIllIIIIlIIll, final boolean lllllllllllllIlIIIlIIllIIIIlIIlI) {
        final int lllllllllllllIlIIIlIIllIIIIlIIIl = MathHelper.floor_double(this.posX);
        final int lllllllllllllIlIIIlIIllIIIIlIIII = MathHelper.floor_double(this.posY - 0.20000000298023224);
        final int lllllllllllllIlIIIlIIllIIIIIllll = MathHelper.floor_double(this.posZ);
        BlockPos lllllllllllllIlIIIlIIllIIIIIlllI = new BlockPos(lllllllllllllIlIIIlIIllIIIIlIIIl, lllllllllllllIlIIIlIIllIIIIlIIII, lllllllllllllIlIIIlIIllIIIIIllll);
        Block lllllllllllllIlIIIlIIllIIIIIllIl = this.worldObj.getBlockState(lllllllllllllIlIIIlIIllIIIIIlllI).getBlock();
        if (lIlllllllllIIll(lllllllllllllIlIIIlIIllIIIIIllIl.getMaterial(), Material.air)) {
            final Block lllllllllllllIlIIIlIIllIIIIIllII = this.worldObj.getBlockState(lllllllllllllIlIIIlIIllIIIIIlllI.down()).getBlock();
            if (!lIllllllllIIllI((lllllllllllllIlIIIlIIllIIIIIllII instanceof BlockFence) ? 1 : 0) || !lIllllllllIIllI((lllllllllllllIlIIIlIIllIIIIIllII instanceof BlockWall) ? 1 : 0) || lIllllllllIlIll((lllllllllllllIlIIIlIIllIIIIIllII instanceof BlockFenceGate) ? 1 : 0)) {
                lllllllllllllIlIIIlIIllIIIIIlllI = lllllllllllllIlIIIlIIllIIIIIlllI.down();
                lllllllllllllIlIIIlIIllIIIIIllIl = this.worldObj.getBlockState(lllllllllllllIlIIIlIIllIIIIIlllI).getBlock();
            }
        }
        super.updateFallState(lllllllllllllIlIIIlIIllIIIIlIIll, lllllllllllllIlIIIlIIllIIIIlIIlI, lllllllllllllIlIIIlIIllIIIIIllIl, lllllllllllllIlIIIlIIllIIIIIlllI);
    }
    
    public void setEntityActionState(final float lllllllllllllIlIIIlIIlIlIlllllll, final float lllllllllllllIlIIIlIIlIllIIIIIll, final boolean lllllllllllllIlIIIlIIlIllIIIIIlI, final boolean lllllllllllllIlIIIlIIlIlIlllllII) {
        if (lIllllllllIlllI(this.ridingEntity)) {
            if (lIllllllllIlIlI(lIlllllllllIlII(lllllllllllllIlIIIlIIlIlIlllllll, -1.0f)) && lIlllllllllIllI(lIlllllllllIlIl(lllllllllllllIlIIIlIIlIlIlllllll, 1.0f))) {
                this.moveStrafing = lllllllllllllIlIIIlIIlIlIlllllll;
            }
            if (lIllllllllIlIlI(lIlllllllllIlII(lllllllllllllIlIIIlIIlIllIIIIIll, -1.0f)) && lIlllllllllIllI(lIlllllllllIlIl(lllllllllllllIlIIIlIIlIllIIIIIll, 1.0f))) {
                this.moveForward = lllllllllllllIlIIIlIIlIllIIIIIll;
            }
            this.isJumping = lllllllllllllIlIIIlIIlIllIIIIIlI;
            this.setSneaking(lllllllllllllIlIIIlIIlIlIlllllII);
        }
    }
    
    @Override
    public void clonePlayer(final EntityPlayer lllllllllllllIlIIIlIIlIlIlIIIIll, final boolean lllllllllllllIlIIIlIIlIlIlIIIlIl) {
        super.clonePlayer(lllllllllllllIlIIIlIIlIlIlIIIIll, lllllllllllllIlIIIlIIlIlIlIIIlIl);
        this.lastExperience = EntityPlayerMP.lIIIlIIlllIllI[9];
        this.lastHealth = -1.0f;
        this.lastFoodLevel = EntityPlayerMP.lIIIlIIlllIllI[9];
        this.destroyedItemsNetCache.addAll(((EntityPlayerMP)lllllllllllllIlIIIlIIlIlIlIIIIll).destroyedItemsNetCache);
        "".length();
    }
    
    public Entity getSpectatingEntity() {
        Entity spectatingEntity;
        if (lIlllllllllIIlI(this.spectatingEntity)) {
            spectatingEntity = this;
            "".length();
            if (-" ".length() > "   ".length()) {
                return null;
            }
        }
        else {
            spectatingEntity = this.spectatingEntity;
        }
        return spectatingEntity;
    }
    
    private static boolean lIllllllllIIlll(final Object lllllllllllllIlIIIlIIlIIIllIllll, final Object lllllllllllllIlIIIlIIlIIIllIlllI) {
        return lllllllllllllIlIIIlIIlIIIllIllll != lllllllllllllIlIIIlIIlIIIllIlllI;
    }
    
    @Override
    public void setGameType(final WorldSettings.GameType lllllllllllllIlIIIlIIlIlIIIIlIIl) {
        this.theItemInWorldManager.setGameType(lllllllllllllIlIIIlIIlIlIIIIlIIl);
        this.playerNetServerHandler.sendPacket(new S2BPacketChangeGameState(EntityPlayerMP.lIIIlIIlllIllI[8], (float)lllllllllllllIlIIIlIIlIlIIIIlIIl.getID()));
        if (lIlllllllllIIll(lllllllllllllIlIIIlIIlIlIIIIlIIl, WorldSettings.GameType.SPECTATOR)) {
            this.mountEntity(null);
            "".length();
            if (-(56 + 30 + 41 + 13 ^ 100 + 107 - 151 + 81) >= 0) {
                return;
            }
        }
        else {
            this.setSpectatingEntity(this);
        }
        this.sendPlayerAbilities();
        this.markPotionsDirty();
    }
    
    private static int lIlllllllllIlIl(final float n, final float n2) {
        return fcmpg(n, n2);
    }
    
    public IChatComponent getTabListDisplayName() {
        return null;
    }
    
    @Override
    public boolean canAttackPlayer(final EntityPlayer lllllllllllllIlIIIlIIllIIllIlIII) {
        int canAttackPlayer;
        if (lIllllllllIIllI(this.canPlayersAttack() ? 1 : 0)) {
            canAttackPlayer = EntityPlayerMP.lIIIlIIlllIllI[0];
            "".length();
            if (null != null) {
                return ((0x4 ^ 0x65) & ~(0x40 ^ 0x21)) != 0x0;
            }
        }
        else {
            canAttackPlayer = (super.canAttackPlayer(lllllllllllllIlIIIlIIllIIllIlIII) ? 1 : 0);
        }
        return canAttackPlayer != 0;
    }
    
    private static boolean lIllllllllIllIl(final int lllllllllllllIlIIIlIIlIIIllllIll, final int lllllllllllllIlIIIlIIlIIIllllIlI) {
        return lllllllllllllIlIIIlIIlIIIllllIll >= lllllllllllllIlIIIlIIlIIIllllIlI;
    }
    
    public void closeScreen() {
        this.playerNetServerHandler.sendPacket(new S2EPacketCloseWindow(this.openContainer.windowId));
        this.closeContainer();
    }
    
    @Override
    public void displayGUIHorse(final EntityHorse lllllllllllllIlIIIlIIlIlllIlIlII, final IInventory lllllllllllllIlIIIlIIlIlllIlIIll) {
        if (lIllllllllIIlll(this.openContainer, this.inventoryContainer)) {
            this.closeScreen();
        }
        this.getNextWindowId();
        this.playerNetServerHandler.sendPacket(new S2DPacketOpenWindow(this.currentWindowId, EntityPlayerMP.lIIIlIIlllIIll[EntityPlayerMP.lIIIlIIlllIllI[24]], lllllllllllllIlIIIlIIlIlllIlIIll.getDisplayName(), lllllllllllllIlIIIlIIlIlllIlIIll.getSizeInventory(), lllllllllllllIlIIIlIIlIlllIlIlII.getEntityId()));
        this.openContainer = new ContainerHorseInventory(this.inventory, lllllllllllllIlIIIlIIlIlllIlIIll, lllllllllllllIlIIIlIIlIlllIlIlII, this);
        this.openContainer.windowId = this.currentWindowId;
        this.openContainer.onCraftGuiOpened(this);
    }
    
    public void loadResourcePack(final String lllllllllllllIlIIIlIIlIIlllIIIII, final String lllllllllllllIlIIIlIIlIIllIlllll) {
        this.playerNetServerHandler.sendPacket(new S48PacketResourcePackSend(lllllllllllllIlIIIlIIlIIlllIIIII, lllllllllllllIlIIIlIIlIIllIlllll));
    }
    
    @Override
    public BlockPos getPosition() {
        return new BlockPos(this.posX, this.posY + 0.5, this.posZ);
    }
    
    public void removeEntity(final Entity lllllllllllllIlIIIlIIlIIllIIllll) {
        if (lIllllllllIlIll((lllllllllllllIlIIIlIIlIIllIIllll instanceof EntityPlayer) ? 1 : 0)) {
            final NetHandlerPlayServer playerNetServerHandler = this.playerNetServerHandler;
            final int[] lllllllllllllIIIIIlIllllIllIlIII = new int[EntityPlayerMP.lIIIlIIlllIllI[2]];
            lllllllllllllIIIIIlIllllIllIlIII[EntityPlayerMP.lIIIlIIlllIllI[0]] = lllllllllllllIlIIIlIIlIIllIIllll.getEntityId();
            playerNetServerHandler.sendPacket(new S13PacketDestroyEntities(lllllllllllllIIIIIlIllllIllIlIII));
            "".length();
            if (" ".length() == 0) {
                return;
            }
        }
        else {
            this.destroyedItemsNetCache.add(lllllllllllllIlIIIlIIlIIllIIllll.getEntityId());
            "".length();
        }
    }
    
    @Override
    public boolean isSpectator() {
        if (lIlllllllllIIll(this.theItemInWorldManager.getGameType(), WorldSettings.GameType.SPECTATOR)) {
            return EntityPlayerMP.lIIIlIIlllIllI[2] != 0;
        }
        return EntityPlayerMP.lIIIlIIlllIllI[0] != 0;
    }
    
    public EnumChatVisibility getChatVisibility() {
        return this.chatVisibility;
    }
    
    public void sendContainerToPlayer(final Container lllllllllllllIlIIIlIIlIllIllIlll) {
        this.updateCraftingInventory(lllllllllllllIlIIIlIIlIllIllIlll, lllllllllllllIlIIIlIIlIllIllIlll.getInventory());
    }
    
    @Override
    public void onUpdate() {
        this.theItemInWorldManager.updateBlockRemoving();
        this.respawnInvulnerabilityTicks -= EntityPlayerMP.lIIIlIIlllIllI[2];
        if (lIllllllllIllII(this.hurtResistantTime)) {
            this.hurtResistantTime -= EntityPlayerMP.lIIIlIIlllIllI[2];
        }
        this.openContainer.detectAndSendChanges();
        if (lIllllllllIIllI(this.worldObj.isRemote ? 1 : 0) && lIllllllllIIllI(this.openContainer.canInteractWith(this) ? 1 : 0)) {
            this.closeScreen();
            this.openContainer = this.inventoryContainer;
            "".length();
            if ((0x48 ^ 0x0 ^ (0x1D ^ 0x51)) == 0x0) {
                return;
            }
        }
        while (!lIllllllllIlIll(this.destroyedItemsNetCache.isEmpty() ? 1 : 0)) {
            final int lllllllllllllIlIIIlIIllIllIIlIlI = Math.min(this.destroyedItemsNetCache.size(), EntityPlayerMP.lIIIlIIlllIllI[10]);
            final int[] lllllllllllllIlIIIlIIllIllIIlIIl = new int[lllllllllllllIlIIIlIIllIllIIlIlI];
            final Iterator<Integer> lllllllllllllIlIIIlIIllIllIIlIII = this.destroyedItemsNetCache.iterator();
            int lllllllllllllIlIIIlIIllIllIIIlll = EntityPlayerMP.lIIIlIIlllIllI[0];
            "".length();
            if (null != null) {
                return;
            }
            while (lIllllllllIlIll(lllllllllllllIlIIIlIIllIllIIlIII.hasNext() ? 1 : 0) && !lIllllllllIllIl(lllllllllllllIlIIIlIIllIllIIIlll, lllllllllllllIlIIIlIIllIllIIlIlI)) {
                lllllllllllllIlIIIlIIllIllIIlIIl[lllllllllllllIlIIIlIIllIllIIIlll++] = lllllllllllllIlIIIlIIllIllIIlIII.next();
                lllllllllllllIlIIIlIIllIllIIlIII.remove();
            }
            this.playerNetServerHandler.sendPacket(new S13PacketDestroyEntities(lllllllllllllIlIIIlIIllIllIIlIIl));
        }
        if (lIllllllllIIllI(this.loadedChunks.isEmpty() ? 1 : 0)) {
            final List<Chunk> lllllllllllllIlIIIlIIllIllIIIllI = (List<Chunk>)Lists.newArrayList();
            final Iterator<ChunkCoordIntPair> lllllllllllllIlIIIlIIllIllIIIlIl = this.loadedChunks.iterator();
            final List<TileEntity> lllllllllllllIlIIIlIIllIllIIIlII = (List<TileEntity>)Lists.newArrayList();
            "".length();
            if (null != null) {
                return;
            }
            while (lIllllllllIlIll(lllllllllllllIlIIIlIIllIllIIIlIl.hasNext() ? 1 : 0) && !lIllllllllIllIl(lllllllllllllIlIIIlIIllIllIIIllI.size(), EntityPlayerMP.lIIIlIIlllIllI[14])) {
                final ChunkCoordIntPair lllllllllllllIlIIIlIIllIllIIIIll = lllllllllllllIlIIIlIIllIllIIIlIl.next();
                if (lIllllllllIlllI(lllllllllllllIlIIIlIIllIllIIIIll)) {
                    if (!lIllllllllIlIll(this.worldObj.isBlockLoaded(new BlockPos(lllllllllllllIlIIIlIIllIllIIIIll.chunkXPos << EntityPlayerMP.lIIIlIIlllIllI[11], EntityPlayerMP.lIIIlIIlllIllI[0], lllllllllllllIlIIIlIIllIllIIIIll.chunkZPos << EntityPlayerMP.lIIIlIIlllIllI[11])) ? 1 : 0)) {
                        continue;
                    }
                    final Chunk lllllllllllllIlIIIlIIllIllIIIIlI = this.worldObj.getChunkFromChunkCoords(lllllllllllllIlIIIlIIllIllIIIIll.chunkXPos, lllllllllllllIlIIIlIIllIllIIIIll.chunkZPos);
                    if (!lIllllllllIlIll(lllllllllllllIlIIIlIIllIllIIIIlI.isPopulated() ? 1 : 0)) {
                        continue;
                    }
                    lllllllllllllIlIIIlIIllIllIIIllI.add(lllllllllllllIlIIIlIIllIllIIIIlI);
                    "".length();
                    lllllllllllllIlIIIlIIllIllIIIlII.addAll(((WorldServer)this.worldObj).getTileEntitiesIn(lllllllllllllIlIIIlIIllIllIIIIll.chunkXPos * EntityPlayerMP.lIIIlIIlllIllI[12], EntityPlayerMP.lIIIlIIlllIllI[0], lllllllllllllIlIIIlIIllIllIIIIll.chunkZPos * EntityPlayerMP.lIIIlIIlllIllI[12], lllllllllllllIlIIIlIIllIllIIIIll.chunkXPos * EntityPlayerMP.lIIIlIIlllIllI[12] + EntityPlayerMP.lIIIlIIlllIllI[12], EntityPlayerMP.lIIIlIIlllIllI[13], lllllllllllllIlIIIlIIllIllIIIIll.chunkZPos * EntityPlayerMP.lIIIlIIlllIllI[12] + EntityPlayerMP.lIIIlIIlllIllI[12]));
                    "".length();
                    lllllllllllllIlIIIlIIllIllIIIlIl.remove();
                    "".length();
                    if (-"   ".length() > 0) {
                        return;
                    }
                    continue;
                }
                else {
                    lllllllllllllIlIIIlIIllIllIIIlIl.remove();
                }
            }
            if (lIllllllllIIllI(lllllllllllllIlIIIlIIllIllIIIllI.isEmpty() ? 1 : 0)) {
                if (lIllllllllIllll(lllllllllllllIlIIIlIIllIllIIIllI.size(), EntityPlayerMP.lIIIlIIlllIllI[2])) {
                    this.playerNetServerHandler.sendPacket(new S21PacketChunkData(lllllllllllllIlIIIlIIllIllIIIllI.get(EntityPlayerMP.lIIIlIIlllIllI[0]), (boolean)(EntityPlayerMP.lIIIlIIlllIllI[2] != 0), EntityPlayerMP.lIIIlIIlllIllI[15]));
                    "".length();
                    if ("  ".length() == " ".length()) {
                        return;
                    }
                }
                else {
                    this.playerNetServerHandler.sendPacket(new S26PacketMapChunkBulk(lllllllllllllIlIIIlIIllIllIIIllI));
                }
                final Iterator<TileEntity> iterator = lllllllllllllIlIIIlIIllIllIIIlII.iterator();
                "".length();
                if (-"   ".length() > 0) {
                    return;
                }
                while (!lIllllllllIIllI(iterator.hasNext() ? 1 : 0)) {
                    final TileEntity lllllllllllllIlIIIlIIllIllIIIIIl = iterator.next();
                    this.sendTileEntityUpdate(lllllllllllllIlIIIlIIllIllIIIIIl);
                }
                final Iterator<Chunk> iterator2 = lllllllllllllIlIIIlIIllIllIIIllI.iterator();
                "".length();
                if (-(0xB8 ^ 0xBC) >= 0) {
                    return;
                }
                while (!lIllllllllIIllI(iterator2.hasNext() ? 1 : 0)) {
                    final Chunk lllllllllllllIlIIIlIIllIllIIIIII = iterator2.next();
                    this.getServerForPlayer().getEntityTracker().func_85172_a(this, lllllllllllllIlIIIlIIllIllIIIIII);
                }
            }
        }
        final Entity lllllllllllllIlIIIlIIllIlIllllll = this.getSpectatingEntity();
        if (lIllllllllIIlll(lllllllllllllIlIIIlIIllIlIllllll, this)) {
            if (lIllllllllIIllI(lllllllllllllIlIIIlIIllIlIllllll.isEntityAlive() ? 1 : 0)) {
                this.setSpectatingEntity(this);
                "".length();
                if (" ".length() <= ((((0x2F ^ 0x32) & ~(0x9 ^ 0x14)) ^ (0xF0 ^ 0xA6)) & (152 + 50 + 18 + 31 ^ 58 + 58 + 24 + 33 ^ -" ".length()))) {
                    return;
                }
            }
            else {
                this.setPositionAndRotation(lllllllllllllIlIIIlIIllIlIllllll.posX, lllllllllllllIlIIIlIIllIlIllllll.posY, lllllllllllllIlIIIlIIllIlIllllll.posZ, lllllllllllllIlIIIlIIllIlIllllll.rotationYaw, lllllllllllllIlIIIlIIllIlIllllll.rotationPitch);
                this.mcServer.getConfigurationManager().serverUpdateMountedMovingPlayer(this);
                if (lIllllllllIlIll(this.isSneaking() ? 1 : 0)) {
                    this.setSpectatingEntity(this);
                }
            }
        }
    }
    
    public void setSpectatingEntity(final Entity lllllllllllllIlIIIlIIlIIllIIIIlI) {
        final Entity lllllllllllllIlIIIlIIlIIllIIIIIl = this.getSpectatingEntity();
        Entity spectatingEntity;
        if (lIlllllllllIIlI(lllllllllllllIlIIIlIIlIIllIIIIlI)) {
            spectatingEntity = this;
            "".length();
            if (-" ".length() >= ((0xFF ^ 0xC1) & ~(0x93 ^ 0xAD))) {
                return;
            }
        }
        else {
            spectatingEntity = lllllllllllllIlIIIlIIlIIllIIIIlI;
        }
        this.spectatingEntity = spectatingEntity;
        if (lIllllllllIIlll(lllllllllllllIlIIIlIIlIIllIIIIIl, this.spectatingEntity)) {
            this.playerNetServerHandler.sendPacket(new S43PacketCamera(this.spectatingEntity));
            this.setPositionAndUpdate(this.spectatingEntity.posX, this.spectatingEntity.posY, this.spectatingEntity.posZ);
        }
    }
    
    @Override
    public void sendPlayerAbilities() {
        if (lIllllllllIlllI(this.playerNetServerHandler)) {
            this.playerNetServerHandler.sendPacket(new S39PacketPlayerAbilities(this.capabilities));
            this.updatePotionMetadata();
        }
    }
    
    public long getLastActiveTime() {
        return this.playerLastActiveTime;
    }
    
    @Override
    public void mountEntity(final Entity lllllllllllllIlIIIlIIllIIIlIIlll) {
        final Entity lllllllllllllIlIIIlIIllIIIlIIllI = this.ridingEntity;
        super.mountEntity(lllllllllllllIlIIIlIIllIIIlIIlll);
        if (lIllllllllIIlll(lllllllllllllIlIIIlIIllIIIlIIlll, lllllllllllllIlIIIlIIllIIIlIIllI)) {
            this.playerNetServerHandler.sendPacket(new S1BPacketEntityAttach(EntityPlayerMP.lIIIlIIlllIllI[0], this, this.ridingEntity));
            this.playerNetServerHandler.setPlayerLocation(this.posX, this.posY, this.posZ, this.rotationYaw, this.rotationPitch);
        }
    }
    
    @Override
    public void openEditSign(final TileEntitySign lllllllllllllIlIIIlIIlIlllllllIl) {
        lllllllllllllIlIIIlIIlIlllllllIl.setPlayer(this);
        this.playerNetServerHandler.sendPacket(new S36PacketSignEditorOpen(lllllllllllllIlIIIlIIlIlllllllIl.getPos()));
    }
    
    @Override
    public void onEnchantmentCritical(final Entity lllllllllllllIlIIIlIIlIlIIIlIlIl) {
        this.getServerForPlayer().getEntityTracker().func_151248_b(this, new S0BPacketAnimation(lllllllllllllIlIIIlIIlIlIIIlIlIl, EntityPlayerMP.lIIIlIIlllIllI[4]));
    }
    
    private static boolean lIllllllllIllII(final int lllllllllllllIlIIIlIIlIIIlIlllII) {
        return lllllllllllllIlIIIlIIlIIIlIlllII > 0;
    }
    
    @Override
    protected void onChangedPotionEffect(final PotionEffect lllllllllllllIlIIIlIIlIlIIllIlII, final boolean lllllllllllllIlIIIlIIlIlIIllIllI) {
        super.onChangedPotionEffect(lllllllllllllIlIIIlIIlIlIIllIlII, lllllllllllllIlIIIlIIlIlIIllIllI);
        this.playerNetServerHandler.sendPacket(new S1DPacketEntityEffect(this.getEntityId(), lllllllllllllIlIIIlIIlIlIIllIlII));
    }
    
    @Override
    public void onCriticalHit(final Entity lllllllllllllIlIIIlIIlIlIIIlllIl) {
        this.getServerForPlayer().getEntityTracker().func_151248_b(this, new S0BPacketAnimation(lllllllllllllIlIIIlIIlIlIIIlllIl, EntityPlayerMP.lIIIlIIlllIllI[11]));
    }
    
    public void onUpdateEntity() {
        try {
            super.onUpdate();
            int lllllllllllllIlIIIlIIllIlIllIIll = EntityPlayerMP.lIIIlIIlllIllI[0];
            "".length();
            if (-"   ".length() >= 0) {
                return;
            }
            while (!lIllllllllIllIl(lllllllllllllIlIIIlIIllIlIllIIll, this.inventory.getSizeInventory())) {
                final ItemStack lllllllllllllIlIIIlIIllIlIllIIlI = this.inventory.getStackInSlot(lllllllllllllIlIIIlIIllIlIllIIll);
                if (lIllllllllIlllI(lllllllllllllIlIIIlIIllIlIllIIlI) && lIllllllllIlIll(lllllllllllllIlIIIlIIllIlIllIIlI.getItem().isMap() ? 1 : 0)) {
                    final Packet lllllllllllllIlIIIlIIllIlIllIIIl = ((ItemMapBase)lllllllllllllIlIIIlIIllIlIllIIlI.getItem()).createMapDataPacket(lllllllllllllIlIIIlIIllIlIllIIlI, this.worldObj, this);
                    if (lIllllllllIlllI(lllllllllllllIlIIIlIIllIlIllIIIl)) {
                        this.playerNetServerHandler.sendPacket(lllllllllllllIlIIIlIIllIlIllIIIl);
                    }
                }
                ++lllllllllllllIlIIIlIIllIlIllIIll;
            }
            Label_0293: {
                if (lIllllllllIIllI(lIlllllllllIIII(this.getHealth(), this.lastHealth)) && lIllllllllIllll(this.lastFoodLevel, this.foodStats.getFoodLevel())) {
                    int lllllllllllllIlIIIlIIlIIIlIllIIl;
                    if (lIllllllllIIllI(lIlllllllllIIII(this.foodStats.getSaturationLevel(), 0.0f))) {
                        lllllllllllllIlIIIlIIlIIIlIllIIl = EntityPlayerMP.lIIIlIIlllIllI[2];
                        "".length();
                        if (null != null) {
                            return;
                        }
                    }
                    else {
                        lllllllllllllIlIIIlIIlIIIlIllIIl = EntityPlayerMP.lIIIlIIlllIllI[0];
                    }
                    if (!lIlllllllllIIIl(lllllllllllllIlIIIlIIlIIIlIllIIl, this.wasHungry ? 1 : 0)) {
                        break Label_0293;
                    }
                }
                this.playerNetServerHandler.sendPacket(new S06PacketUpdateHealth(this.getHealth(), this.foodStats.getFoodLevel(), this.foodStats.getSaturationLevel()));
                this.lastHealth = this.getHealth();
                this.lastFoodLevel = this.foodStats.getFoodLevel();
                int wasHungry;
                if (lIllllllllIIllI(lIlllllllllIIII(this.foodStats.getSaturationLevel(), 0.0f))) {
                    wasHungry = EntityPlayerMP.lIIIlIIlllIllI[2];
                    "".length();
                    if (((0x88 ^ 0xA3) & ~(0x68 ^ 0x43)) != 0x0) {
                        return;
                    }
                }
                else {
                    wasHungry = EntityPlayerMP.lIIIlIIlllIllI[0];
                }
                this.wasHungry = (wasHungry != 0);
            }
            if (lIllllllllIlIll(lIlllllllllIIII(this.getHealth() + this.getAbsorptionAmount(), this.combinedHealth))) {
                this.combinedHealth = this.getHealth() + this.getAbsorptionAmount();
                final String lllllllllllllIlIIIlIIllIlIlIlIlI = (String)this.getWorldScoreboard().getObjectivesFromCriteria(IScoreObjectiveCriteria.health).iterator();
                "".length();
                if (" ".length() == "   ".length()) {
                    return;
                }
                while (!lIllllllllIIllI(((Iterator)lllllllllllllIlIIIlIIllIlIlIlIlI).hasNext() ? 1 : 0)) {
                    final ScoreObjective lllllllllllllIlIIIlIIllIlIllIIII = ((Iterator<ScoreObjective>)lllllllllllllIlIIIlIIllIlIlIlIlI).next();
                    final Score valueFromObjective = this.getWorldScoreboard().getValueFromObjective(this.getName(), lllllllllllllIlIIIlIIllIlIllIIII);
                    final EntityPlayer[] a = new EntityPlayer[EntityPlayerMP.lIIIlIIlllIllI[2]];
                    a[EntityPlayerMP.lIIIlIIlllIllI[0]] = this;
                    valueFromObjective.func_96651_a(Arrays.asList(a));
                }
            }
            if (lIlllllllllIIIl(this.experienceTotal, this.lastExperience)) {
                this.lastExperience = this.experienceTotal;
                this.playerNetServerHandler.sendPacket(new S1FPacketSetExperience(this.experience, this.experienceTotal, this.experienceLevel));
            }
            if (lIllllllllIIllI(this.ticksExisted % EntityPlayerMP.lIIIlIIlllIllI[16] * EntityPlayerMP.lIIIlIIlllIllI[4]) && lIllllllllIIllI(this.getStatFile().hasAchievementUnlocked(AchievementList.exploreAllBiomes) ? 1 : 0)) {
                this.updateBiomesExplored();
                "".length();
                if ((0x41 ^ 0x44) <= 0) {
                    return;
                }
            }
        }
        catch (Throwable lllllllllllllIlIIIlIIllIlIlIllll) {
            final CrashReport lllllllllllllIlIIIlIIllIlIlIlllI = CrashReport.makeCrashReport(lllllllllllllIlIIIlIIllIlIlIllll, EntityPlayerMP.lIIIlIIlllIIll[EntityPlayerMP.lIIIlIIlllIllI[11]]);
            final CrashReportCategory lllllllllllllIlIIIlIIllIlIlIllIl = lllllllllllllIlIIIlIIllIlIlIlllI.makeCategory(EntityPlayerMP.lIIIlIIlllIIll[EntityPlayerMP.lIIIlIIlllIllI[4]]);
            this.addEntityCrashInfo(lllllllllllllIlIIIlIIllIlIlIllIl);
            throw new ReportedException(lllllllllllllIlIIIlIIllIlIlIlllI);
        }
    }
    
    private static boolean lIlllllllllIllI(final int lllllllllllllIlIIIlIIlIIIlIllllI) {
        return lllllllllllllIlIIIlIIlIIIlIllllI <= 0;
    }
    
    private static String lIlllllllIllIlI(final String lllllllllllllIlIIIlIIlIIlIIlllll, final String lllllllllllllIlIIIlIIlIIlIIlllII) {
        try {
            final SecretKeySpec lllllllllllllIlIIIlIIlIIlIlIIIlI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIlIIIlIIlIIlIIlllII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lllllllllllllIlIIIlIIlIIlIlIIIIl = Cipher.getInstance("Blowfish");
            lllllllllllllIlIIIlIIlIIlIlIIIIl.init(EntityPlayerMP.lIIIlIIlllIllI[6], lllllllllllllIlIIIlIIlIIlIlIIIlI);
            return new String(lllllllllllllIlIIIlIIlIIlIlIIIIl.doFinal(Base64.getDecoder().decode(lllllllllllllIlIIIlIIlIIlIIlllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIlIIIlIIlIIlIlIIIII) {
            lllllllllllllIlIIIlIIlIIlIlIIIII.printStackTrace();
            return null;
        }
    }
    
    @Override
    public EnumStatus trySleep(final BlockPos lllllllllllllIlIIIlIIllIIIlllIlI) {
        final EnumStatus lllllllllllllIlIIIlIIllIIIllllIl = super.trySleep(lllllllllllllIlIIIlIIllIIIlllIlI);
        if (lIlllllllllIIll(lllllllllllllIlIIIlIIllIIIllllIl, EnumStatus.OK)) {
            final Packet lllllllllllllIlIIIlIIllIIIllllII = new S0APacketUseBed(this, lllllllllllllIlIIIlIIllIIIlllIlI);
            this.getServerForPlayer().getEntityTracker().sendToAllTrackingEntity(this, lllllllllllllIlIIIlIIllIIIllllII);
            this.playerNetServerHandler.setPlayerLocation(this.posX, this.posY, this.posZ, this.rotationYaw, this.rotationPitch);
            this.playerNetServerHandler.sendPacket(lllllllllllllIlIIIlIIllIIIllllII);
        }
        return lllllllllllllIlIIIlIIllIIIllllIl;
    }
    
    @Override
    public void func_175145_a(final StatBase lllllllllllllIlIIIlIIlIlIllIlIII) {
        if (lIllllllllIlllI(lllllllllllllIlIIIlIIlIlIllIlIII)) {
            this.statsFile.unlockAchievement(this, lllllllllllllIlIIIlIIlIlIllIlIII, EntityPlayerMP.lIIIlIIlllIllI[0]);
            final long lllllllllllllIlIIIlIIlIlIllIIIll = (long)this.getWorldScoreboard().getObjectivesFromCriteria(lllllllllllllIlIIIlIIlIlIllIlIII.func_150952_k()).iterator();
            "".length();
            if ("   ".length() <= 0) {
                return;
            }
            while (!lIllllllllIIllI(((Iterator)lllllllllllllIlIIIlIIlIlIllIIIll).hasNext() ? 1 : 0)) {
                final ScoreObjective lllllllllllllIlIIIlIIlIlIllIIlll = ((Iterator<ScoreObjective>)lllllllllllllIlIIIlIIlIlIllIIIll).next();
                this.getWorldScoreboard().getValueFromObjective(this.getName(), lllllllllllllIlIIIlIIlIlIllIIlll).setScorePoints(EntityPlayerMP.lIIIlIIlllIllI[0]);
            }
            if (lIllllllllIlIll(this.statsFile.func_150879_e() ? 1 : 0)) {
                this.statsFile.func_150876_a(this);
            }
        }
    }
    
    private void getNextWindowId() {
        this.currentWindowId = this.currentWindowId % EntityPlayerMP.lIIIlIIlllIllI[19] + EntityPlayerMP.lIIIlIIlllIllI[2];
    }
    
    @Override
    public void sendProgressBarUpdate(final Container lllllllllllllIlIIIlIIlIllIlIIIlI, final int lllllllllllllIlIIIlIIlIllIlIIIIl, final int lllllllllllllIlIIIlIIlIllIlIIlII) {
        this.playerNetServerHandler.sendPacket(new S31PacketWindowProperty(lllllllllllllIlIIIlIIlIllIlIIIlI.windowId, lllllllllllllIlIIIlIIlIllIlIIIIl, lllllllllllllIlIIIlIIlIllIlIIlII));
    }
    
    static {
        lIllllllllIIlII();
        lIllllllllIIIII();
        logger = LogManager.getLogger();
    }
    
    @Override
    public void setPositionAndUpdate(final double lllllllllllllIlIIIlIIlIlIIlIIIll, final double lllllllllllllIlIIIlIIlIlIIlIIIlI, final double lllllllllllllIlIIIlIIlIlIIlIIlIl) {
        this.playerNetServerHandler.setPlayerLocation(lllllllllllllIlIIIlIIlIlIIlIIIll, lllllllllllllIlIIIlIIlIlIIlIIIlI, lllllllllllllIlIIIlIIlIlIIlIIlIl, this.rotationYaw, this.rotationPitch);
    }
    
    @Override
    public void sendEndCombat() {
        super.sendEndCombat();
        this.playerNetServerHandler.sendPacket(new S42PacketCombatEvent(this.getCombatTracker(), S42PacketCombatEvent.Event.END_COMBAT));
    }
    
    private static boolean lIllllllllIlllI(final Object lllllllllllllIlIIIlIIlIIIllIllII) {
        return lllllllllllllIlIIIlIIlIIIllIllII != null;
    }
    
    protected void updateBiomesExplored() {
        final BiomeGenBase lllllllllllllIlIIIlIIllIlIIllllI = this.worldObj.getBiomeGenForCoords(new BlockPos(MathHelper.floor_double(this.posX), EntityPlayerMP.lIIIlIIlllIllI[0], MathHelper.floor_double(this.posZ)));
        final String lllllllllllllIlIIIlIIllIlIIlllIl = lllllllllllllIlIIIlIIllIlIIllllI.biomeName;
        JsonSerializableSet lllllllllllllIlIIIlIIllIlIIlllII = this.getStatFile().func_150870_b(AchievementList.exploreAllBiomes);
        if (lIlllllllllIIlI(lllllllllllllIlIIIlIIllIlIIlllII)) {
            lllllllllllllIlIIIlIIllIlIIlllII = this.getStatFile().func_150872_a(AchievementList.exploreAllBiomes, new JsonSerializableSet());
        }
        lllllllllllllIlIIIlIIllIlIIlllII.add((Object)lllllllllllllIlIIIlIIllIlIIlllIl);
        "".length();
        if (lIllllllllIlIll(this.getStatFile().canUnlockAchievement(AchievementList.exploreAllBiomes) ? 1 : 0) && lIllllllllIllIl(lllllllllllllIlIIIlIIllIlIIlllII.size(), BiomeGenBase.explorationBiomesList.size())) {
            final Set<BiomeGenBase> lllllllllllllIlIIIlIIllIlIIllIll = (Set<BiomeGenBase>)Sets.newHashSet((Iterable)BiomeGenBase.explorationBiomesList);
            final boolean lllllllllllllIlIIIlIIllIlIIlIIIl = (boolean)lllllllllllllIlIIIlIIllIlIIlllII.iterator();
            "".length();
            if (" ".length() < 0) {
                return;
            }
            while (!lIllllllllIIllI(((Iterator)lllllllllllllIlIIIlIIllIlIIlIIIl).hasNext() ? 1 : 0)) {
                final String lllllllllllllIlIIIlIIllIlIIllIlI = ((Iterator<String>)lllllllllllllIlIIIlIIllIlIIlIIIl).next();
                final Iterator<BiomeGenBase> lllllllllllllIlIIIlIIllIlIIllIIl = lllllllllllllIlIIIlIIllIlIIllIll.iterator();
                "".length();
                if ("   ".length() < 0) {
                    return;
                }
                while (!lIllllllllIIllI(lllllllllllllIlIIIlIIllIlIIllIIl.hasNext() ? 1 : 0)) {
                    final BiomeGenBase lllllllllllllIlIIIlIIllIlIIllIII = lllllllllllllIlIIIlIIllIlIIllIIl.next();
                    if (lIllllllllIlIll(lllllllllllllIlIIIlIIllIlIIllIII.biomeName.equals(lllllllllllllIlIIIlIIllIlIIllIlI) ? 1 : 0)) {
                        lllllllllllllIlIIIlIIllIlIIllIIl.remove();
                    }
                }
                if (!lIllllllllIlIll(lllllllllllllIlIIIlIIllIlIIllIll.isEmpty() ? 1 : 0)) {
                    continue;
                }
                "".length();
                if (" ".length() > (0x83 ^ 0xC7 ^ (0x9 ^ 0x49))) {
                    return;
                }
                break;
            }
            if (lIllllllllIlIll(lllllllllllllIlIIIlIIllIlIIllIll.isEmpty() ? 1 : 0)) {
                this.triggerAchievement(AchievementList.exploreAllBiomes);
            }
        }
    }
    
    @Override
    public void setItemInUse(final ItemStack lllllllllllllIlIIIlIIlIlIlIIllII, final int lllllllllllllIlIIIlIIlIlIlIIlIll) {
        super.setItemInUse(lllllllllllllIlIIIlIIlIlIlIIllII, lllllllllllllIlIIIlIIlIlIlIIlIll);
        if (lIllllllllIlllI(lllllllllllllIlIIIlIIlIlIlIIllII) && lIllllllllIlllI(lllllllllllllIlIIIlIIlIlIlIIllII.getItem()) && lIlllllllllIIll(lllllllllllllIlIIIlIIlIlIlIIllII.getItem().getItemUseAction(lllllllllllllIlIIIlIIlIlIlIIllII), EnumAction.EAT)) {
            this.getServerForPlayer().getEntityTracker().func_151248_b(this, new S0BPacketAnimation(this, EntityPlayerMP.lIIIlIIlllIllI[8]));
        }
    }
    
    @Override
    public void addChatMessage(final IChatComponent lllllllllllllIlIIIlIIlIlIIIIIIlI) {
        this.playerNetServerHandler.sendPacket(new S02PacketChat(lllllllllllllIlIIIlIIlIlIIIIIIlI));
    }
    
    @Override
    public void onDeath(final DamageSource lllllllllllllIlIIIlIIllIlIIIlIIl) {
        if (lIllllllllIlIll(this.worldObj.getGameRules().getBoolean(EntityPlayerMP.lIIIlIIlllIIll[EntityPlayerMP.lIIIlIIlllIllI[5]]) ? 1 : 0)) {
            final Team lllllllllllllIlIIIlIIllIlIIIlIII = this.getTeam();
            if (lIllllllllIlllI(lllllllllllllIlIIIlIIllIlIIIlIII) && lIllllllllIIlll(lllllllllllllIlIIIlIIllIlIIIlIII.getDeathMessageVisibility(), Team.EnumVisible.ALWAYS)) {
                if (lIlllllllllIIll(lllllllllllllIlIIIlIIllIlIIIlIII.getDeathMessageVisibility(), Team.EnumVisible.HIDE_FOR_OTHER_TEAMS)) {
                    this.mcServer.getConfigurationManager().sendMessageToAllTeamMembers(this, this.getCombatTracker().getDeathMessage());
                    "".length();
                    if ("   ".length() < 0) {
                        return;
                    }
                }
                else if (lIlllllllllIIll(lllllllllllllIlIIIlIIllIlIIIlIII.getDeathMessageVisibility(), Team.EnumVisible.HIDE_FOR_OWN_TEAM)) {
                    this.mcServer.getConfigurationManager().sendMessageToTeamOrEvryPlayer(this, this.getCombatTracker().getDeathMessage());
                    "".length();
                    if (-(0x26 ^ 0x22) > 0) {
                        return;
                    }
                }
            }
            else {
                this.mcServer.getConfigurationManager().sendChatMsg(this.getCombatTracker().getDeathMessage());
            }
        }
        if (lIllllllllIIllI(this.worldObj.getGameRules().getBoolean(EntityPlayerMP.lIIIlIIlllIIll[EntityPlayerMP.lIIIlIIlllIllI[17]]) ? 1 : 0)) {
            this.inventory.dropAllItems();
        }
        final Iterator<ScoreObjective> iterator = this.worldObj.getScoreboard().getObjectivesFromCriteria(IScoreObjectiveCriteria.deathCount).iterator();
        "".length();
        if ("   ".length() < 0) {
            return;
        }
        while (!lIllllllllIIllI(iterator.hasNext() ? 1 : 0)) {
            final ScoreObjective lllllllllllllIlIIIlIIllIlIIIIlll = iterator.next();
            final Score lllllllllllllIlIIIlIIllIlIIIIllI = this.getWorldScoreboard().getValueFromObjective(this.getName(), lllllllllllllIlIIIlIIllIlIIIIlll);
            lllllllllllllIlIIIlIIllIlIIIIllI.func_96648_a();
        }
        final EntityLivingBase lllllllllllllIlIIIlIIllIlIIIIlIl = this.func_94060_bK();
        if (lIllllllllIlllI(lllllllllllllIlIIIlIIllIlIIIIlIl)) {
            final EntityList.EntityEggInfo lllllllllllllIlIIIlIIllIlIIIIlII = EntityList.entityEggs.get(EntityList.getEntityID(lllllllllllllIlIIIlIIllIlIIIIlIl));
            if (lIllllllllIlllI(lllllllllllllIlIIIlIIllIlIIIIlII)) {
                this.triggerAchievement(lllllllllllllIlIIIlIIllIlIIIIlII.field_151513_e);
            }
            lllllllllllllIlIIIlIIllIlIIIIlIl.addToPlayerScore(this, this.scoreValue);
        }
        this.triggerAchievement(StatList.deathsStat);
        this.func_175145_a(StatList.timeSinceDeathStat);
        this.getCombatTracker().reset();
    }
    
    @Override
    public boolean attackEntityFrom(final DamageSource lllllllllllllIlIIIlIIllIIllllIII, final float lllllllllllllIlIIIlIIllIIlllIIIl) {
        if (lIllllllllIlIll(this.isEntityInvulnerable(lllllllllllllIlIIIlIIllIIllllIII) ? 1 : 0)) {
            return EntityPlayerMP.lIIIlIIlllIllI[0] != 0;
        }
        int n;
        if (lIllllllllIlIll(this.mcServer.isDedicatedServer() ? 1 : 0) && lIllllllllIlIll(this.canPlayersAttack() ? 1 : 0) && lIllllllllIlIll(EntityPlayerMP.lIIIlIIlllIIll[EntityPlayerMP.lIIIlIIlllIllI[18]].equals(lllllllllllllIlIIIlIIllIIllllIII.damageType) ? 1 : 0)) {
            n = EntityPlayerMP.lIIIlIIlllIllI[2];
            "".length();
            if ("   ".length() != "   ".length()) {
                return ((136 + 131 - 120 + 37 ^ 166 + 168 - 225 + 64) & (0x17 ^ 0x27 ^ (0x2A ^ 0xF) ^ -" ".length())) != 0x0;
            }
        }
        else {
            n = EntityPlayerMP.lIIIlIIlllIllI[0];
        }
        final boolean lllllllllllllIlIIIlIIllIIlllIllI = n != 0;
        if (lIllllllllIIllI(lllllllllllllIlIIIlIIllIIlllIllI ? 1 : 0) && lIllllllllIllII(this.respawnInvulnerabilityTicks) && lIllllllllIIlll(lllllllllllllIlIIIlIIllIIllllIII, DamageSource.outOfWorld)) {
            return EntityPlayerMP.lIIIlIIlllIllI[0] != 0;
        }
        if (lIllllllllIlIll((lllllllllllllIlIIIlIIllIIllllIII instanceof EntityDamageSource) ? 1 : 0)) {
            final Entity lllllllllllllIlIIIlIIllIIlllIlIl = lllllllllllllIlIIIlIIllIIllllIII.getEntity();
            if (lIllllllllIlIll((lllllllllllllIlIIIlIIllIIlllIlIl instanceof EntityPlayer) ? 1 : 0) && lIllllllllIIllI(this.canAttackPlayer((EntityPlayer)lllllllllllllIlIIIlIIllIIlllIlIl) ? 1 : 0)) {
                return EntityPlayerMP.lIIIlIIlllIllI[0] != 0;
            }
            if (lIllllllllIlIll((lllllllllllllIlIIIlIIllIIlllIlIl instanceof EntityArrow) ? 1 : 0)) {
                final EntityArrow lllllllllllllIlIIIlIIllIIlllIlII = (EntityArrow)lllllllllllllIlIIIlIIllIIlllIlIl;
                if (lIllllllllIlIll((lllllllllllllIlIIIlIIllIIlllIlII.shootingEntity instanceof EntityPlayer) ? 1 : 0) && lIllllllllIIllI(this.canAttackPlayer((EntityPlayer)lllllllllllllIlIIIlIIllIIlllIlII.shootingEntity) ? 1 : 0)) {
                    return EntityPlayerMP.lIIIlIIlllIllI[0] != 0;
                }
            }
        }
        return super.attackEntityFrom(lllllllllllllIlIIIlIIllIIllllIII, lllllllllllllIlIIIlIIllIIlllIIIl);
    }
    
    private static int lIlllllllllIlII(final float n, final float n2) {
        return fcmpl(n, n2);
    }
    
    @Override
    public void removeExperienceLevel(final int lllllllllllllIlIIIlIIllIllIllIll) {
        super.removeExperienceLevel(lllllllllllllIlIIIlIIllIllIllIll);
        this.lastExperience = EntityPlayerMP.lIIIlIIlllIllI[9];
    }
    
    @Override
    public void onItemPickup(final Entity lllllllllllllIlIIIlIIllIIlIIlIII, final int lllllllllllllIlIIIlIIllIIlIIIlII) {
        super.onItemPickup(lllllllllllllIlIIIlIIllIIlIIlIII, lllllllllllllIlIIIlIIllIIlIIIlII);
        this.openContainer.detectAndSendChanges();
    }
    
    public String getPlayerIP() {
        String lllllllllllllIlIIIlIIlIIllllIIII = this.playerNetServerHandler.netManager.getRemoteAddress().toString();
        lllllllllllllIlIIIlIIlIIllllIIII = lllllllllllllIlIIIlIIlIIllllIIII.substring(lllllllllllllIlIIIlIIlIIllllIIII.indexOf(EntityPlayerMP.lIIIlIIlllIIll[EntityPlayerMP.lIIIlIIlllIllI[29]]) + EntityPlayerMP.lIIIlIIlllIllI[2]);
        lllllllllllllIlIIIlIIlIIllllIIII = lllllllllllllIlIIIlIIlIIllllIIII.substring(EntityPlayerMP.lIIIlIIlllIllI[0], lllllllllllllIlIIIlIIlIIllllIIII.indexOf(EntityPlayerMP.lIIIlIIlllIIll[EntityPlayerMP.lIIIlIIlllIllI[30]]));
        return lllllllllllllIlIIIlIIlIIllllIIII;
    }
    
    @Override
    public void displayGUIBook(final ItemStack lllllllllllllIlIIIlIIlIlllIIlIll) {
        final Item lllllllllllllIlIIIlIIlIlllIIlIlI = lllllllllllllIlIIIlIIlIlllIIlIll.getItem();
        if (lIlllllllllIIll(lllllllllllllIlIIIlIIlIlllIIlIlI, Items.written_book)) {
            this.playerNetServerHandler.sendPacket(new S3FPacketCustomPayload(EntityPlayerMP.lIIIlIIlllIIll[EntityPlayerMP.lIIIlIIlllIllI[25]], new PacketBuffer(Unpooled.buffer())));
        }
    }
    
    private static boolean lIllllllllIlIlI(final int lllllllllllllIlIIIlIIlIIIllIIIII) {
        return lllllllllllllIlIIIlIIlIIIllIIIII >= 0;
    }
}
