// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.client.network;

import java.util.Iterator;
import net.minecraft.network.play.server.S02PacketChat;
import net.minecraft.scoreboard.Score;
import net.minecraft.util.StringUtils;
import net.minecraft.network.play.server.S3CPacketUpdateScore;
import net.minecraft.network.play.server.S46PacketSetCompressionLevel;
import net.minecraft.client.particle.EntityFX;
import net.minecraft.client.particle.EntityPickupFX;
import net.minecraft.network.play.server.S0DPacketCollectItem;
import net.minecraft.world.storage.MapData;
import net.minecraft.item.ItemMap;
import net.minecraft.network.play.server.S34PacketMaps;
import net.minecraft.network.play.server.S3DPacketDisplayScoreboard;
import net.minecraft.client.gui.GuiNewChat;
import net.minecraft.client.gui.GuiScreenDemo;
import net.minecraft.client.gui.GuiWinGame;
import net.minecraft.util.ChatComponentTranslation;
import net.minecraft.network.play.server.S2BPacketChangeGameState;
import net.minecraft.client.audio.ISound;
import net.minecraft.client.audio.GuardianSound;
import net.minecraft.entity.monster.EntityGuardian;
import net.minecraft.network.play.server.S19PacketEntityStatus;
import net.minecraft.network.play.server.S29PacketSoundEffect;
import net.minecraft.network.play.server.S22PacketMultiBlockChange;
import net.minecraft.inventory.Container;
import net.minecraft.network.play.client.C0FPacketConfirmTransaction;
import net.minecraft.network.play.server.S32PacketConfirmTransaction;
import net.minecraft.network.play.server.S23PacketBlockChange;
import net.minecraft.network.play.server.S05PacketSpawnPosition;
import net.minecraft.entity.item.EntityFallingBlock;
import net.minecraft.block.Block;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.item.EntityEnderCrystal;
import net.minecraft.entity.item.EntityArmorStand;
import net.minecraft.entity.item.EntityTNTPrimed;
import net.minecraft.entity.item.EntityExpBottle;
import net.minecraft.entity.projectile.EntityPotion;
import net.minecraft.entity.projectile.EntityEgg;
import net.minecraft.entity.projectile.EntityWitherSkull;
import net.minecraft.entity.projectile.EntitySmallFireball;
import net.minecraft.entity.projectile.EntityLargeFireball;
import net.minecraft.entity.item.EntityFireworkRocket;
import net.minecraft.entity.item.EntityEnderEye;
import net.minecraft.entity.item.EntityEnderPearl;
import net.minecraft.entity.EntityLeashKnot;
import net.minecraft.entity.item.EntityItemFrame;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.BlockPos;
import net.minecraft.util.MathHelper;
import net.minecraft.entity.projectile.EntitySnowball;
import net.minecraft.entity.projectile.EntityArrow;
import net.minecraft.entity.projectile.EntityFishHook;
import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.network.play.server.S0EPacketSpawnObject;
import net.minecraft.client.stream.MetadataPlayerDeath;
import net.minecraft.client.stream.MetadataCombat;
import net.minecraft.network.play.server.S42PacketCombatEvent;
import net.minecraft.entity.effect.EntityLightningBolt;
import net.minecraft.network.play.server.S2CPacketSpawnGlobalEntity;
import net.minecraft.client.gui.GuiIngame;
import net.minecraft.entity.EntityLiving;
import net.minecraft.client.settings.GameSettings;
import net.minecraft.entity.item.EntityBoat;
import net.minecraft.network.play.server.S1BPacketEntityAttach;
import net.minecraft.network.play.server.S21PacketChunkData;
import net.minecraft.scoreboard.ScoreObjective;
import net.minecraft.scoreboard.IScoreObjectiveCriteria;
import net.minecraft.network.play.server.S3BPacketScoreboardObjective;
import net.minecraft.network.play.server.S18PacketEntityTeleport;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.network.play.server.S09PacketHeldItemChange;
import net.minecraft.network.play.server.S44PacketWorldBorder;
import net.minecraft.network.play.server.S1EPacketRemoveEntityEffect;
import net.minecraft.network.play.server.S43PacketCamera;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.client.gui.inventory.GuiContainerCreative;
import net.minecraft.network.play.server.S2FPacketSetSlot;
import net.minecraft.potion.PotionEffect;
import net.minecraft.network.play.server.S1DPacketEntityEffect;
import com.google.common.collect.Maps;
import net.minecraft.entity.EntityList;
import net.minecraft.network.play.server.S0FPacketSpawnMob;
import net.minecraft.network.play.server.S13PacketDestroyEntities;
import net.minecraft.client.gui.GuiYesNo;
import net.minecraft.client.resources.I18n;
import net.minecraft.client.multiplayer.ServerList;
import net.minecraft.client.gui.GuiYesNoCallback;
import net.minecraft.client.multiplayer.ServerData;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.Futures;
import com.google.common.util.concurrent.FutureCallback;
import net.minecraft.network.play.client.C19PacketResourcePackStatus;
import java.io.File;
import net.minecraft.network.play.server.S48PacketResourcePackSend;
import net.minecraft.network.play.server.S30PacketWindowItems;
import org.apache.logging.log4j.LogManager;
import net.minecraft.network.play.server.S04PacketEntityEquipment;
import net.minecraft.network.play.server.S24PacketBlockAction;
import net.minecraft.tileentity.TileEntityBanner;
import net.minecraft.tileentity.TileEntityFlowerPot;
import net.minecraft.tileentity.TileEntitySkull;
import net.minecraft.tileentity.TileEntityBeacon;
import net.minecraft.tileentity.TileEntityCommandBlock;
import net.minecraft.tileentity.TileEntityMobSpawner;
import net.minecraft.network.play.server.S35PacketUpdateTileEntity;
import net.minecraft.world.chunk.Chunk;
import net.minecraft.world.WorldProviderSurface;
import net.minecraft.network.play.server.S26PacketMapChunkBulk;
import net.minecraft.world.Explosion;
import net.minecraft.network.play.server.S27PacketExplosion;
import net.minecraft.network.play.client.C17PacketCustomPayload;
import net.minecraft.client.ClientBrandRetriever;
import io.netty.buffer.Unpooled;
import net.minecraft.client.multiplayer.PlayerControllerMP;
import net.minecraft.network.play.server.S01PacketJoinGame;
import net.minecraft.network.play.server.S25PacketBlockBreakAnim;
import net.minecraft.network.play.client.C00PacketKeepAlive;
import net.minecraft.network.play.server.S00PacketKeepAlive;
import net.minecraft.network.play.server.S41PacketServerDifficulty;
import net.minecraft.entity.item.EntityXPOrb;
import net.minecraft.network.play.server.S11PacketSpawnExperienceOrb;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.security.MessageDigest;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import net.minecraft.network.play.server.S1CPacketEntityMetadata;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.network.play.server.S0BPacketAnimation;
import net.minecraft.entity.item.EntityPainting;
import net.minecraft.network.play.server.S10PacketSpawnPainting;
import net.minecraft.network.play.server.S1FPacketSetExperience;
import net.minecraft.network.play.server.S49PacketUpdateEntityNBT;
import net.minecraft.client.gui.GuiChat;
import net.minecraft.network.play.server.S3APacketTabComplete;
import net.minecraft.network.play.server.S36PacketSignEditorOpen;
import net.minecraft.client.gui.GuiPlayerTabOverlay;
import net.minecraft.network.play.server.S47PacketPlayerListHeaderFooter;
import net.minecraft.network.play.server.S38PacketPlayerListItem;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.client.player.inventory.ContainerLocalMenu;
import net.minecraft.world.IInteractionObject;
import net.minecraft.client.player.inventory.LocalBlockIntercommunication;
import net.minecraft.inventory.AnimalChest;
import net.minecraft.entity.passive.EntityHorse;
import net.minecraft.entity.NpcMerchant;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.InventoryBasic;
import net.minecraft.network.play.server.S2DPacketOpenWindow;
import net.minecraft.network.play.server.S40PacketDisconnect;
import net.minecraft.network.play.server.S03PacketTimeUpdate;
import net.minecraft.network.play.server.S45PacketTitle;
import net.minecraft.network.play.server.S39PacketPlayerAbilities;
import net.minecraft.network.play.server.S2EPacketCloseWindow;
import net.minecraft.entity.DataWatcher;
import java.util.List;
import net.minecraft.item.Item;
import net.minecraft.client.entity.EntityOtherPlayerMP;
import net.minecraft.network.play.server.S0CPacketSpawnPlayer;
import net.minecraft.client.gui.IProgressMeter;
import net.minecraft.stats.AchievementList;
import net.minecraft.client.stream.Metadata;
import net.minecraft.client.stream.MetadataAchievement;
import net.minecraft.stats.Achievement;
import net.minecraft.stats.StatBase;
import net.minecraft.network.play.server.S37PacketStatistics;
import net.minecraft.entity.ai.attributes.IAttributeInstance;
import net.minecraft.entity.ai.attributes.BaseAttributeMap;
import net.minecraft.entity.ai.attributes.AttributeModifier;
import net.minecraft.entity.ai.attributes.IAttribute;
import net.minecraft.entity.ai.attributes.RangedAttribute;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.network.play.server.S20PacketEntityProperties;
import net.minecraft.client.gui.GuiMultiplayer;
import net.minecraft.client.gui.GuiMainMenu;
import net.minecraft.client.gui.GuiDisconnected;
import net.minecraft.realms.DisconnectedRealmsScreen;
import net.minecraft.client.gui.GuiScreenRealmsProxy;
import net.minecraft.network.play.client.C03PacketPlayer;
import net.minecraft.network.play.server.S08PacketPlayerPosLook;
import net.minecraft.network.play.server.S12PacketEntityVelocity;
import net.minecraft.network.play.server.S19PacketEntityHeadLook;
import net.minecraft.scoreboard.ScorePlayerTeam;
import net.minecraft.scoreboard.Team;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.network.play.server.S3EPacketTeams;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.IMerchant;
import net.minecraft.network.PacketBuffer;
import net.minecraft.client.gui.GuiScreenBook;
import net.minecraft.init.Items;
import java.io.IOException;
import net.minecraft.village.MerchantRecipeList;
import net.minecraft.client.gui.GuiMerchant;
import net.minecraft.network.play.server.S3FPacketCustomPayload;
import net.minecraft.network.play.server.S06PacketUpdateHealth;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.network.play.server.S31PacketWindowProperty;
import net.minecraft.network.play.server.S2APacketParticles;
import java.util.Collection;
import net.minecraft.entity.Entity;
import net.minecraft.network.play.server.S14PacketEntity;
import net.minecraft.world.World;
import net.minecraft.network.play.server.S0APacketUseBed;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.IChatComponent;
import net.minecraft.util.ChatComponentText;
import net.minecraft.tileentity.TileEntitySign;
import net.minecraft.network.play.server.S33PacketUpdateSign;
import net.minecraft.network.play.server.S28PacketEffect;
import net.minecraft.scoreboard.Scoreboard;
import net.minecraft.client.gui.GuiDownloadTerrain;
import net.minecraft.world.WorldSettings;
import net.minecraft.util.IThreadListener;
import net.minecraft.network.Packet;
import net.minecraft.network.PacketThreadUtil;
import net.minecraft.network.play.server.S07PacketRespawn;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.multiplayer.WorldClient;
import net.minecraft.network.NetworkManager;
import com.mojang.authlib.GameProfile;
import java.util.UUID;
import java.util.Map;
import java.util.Random;
import org.apache.logging.log4j.Logger;
import net.minecraft.network.play.INetHandlerPlayClient;

public class NetHandlerPlayClient implements INetHandlerPlayClient
{
    private static final /* synthetic */ Logger logger;
    private static final /* synthetic */ String[] lIlIIIIllIIlII;
    private /* synthetic */ boolean doneLoadingTerrain;
    private final /* synthetic */ Random avRandomizer;
    private final /* synthetic */ Map<UUID, NetworkPlayerInfo> playerInfoMap;
    private final /* synthetic */ GameProfile profile;
    private static volatile /* synthetic */ int[] $SWITCH_TABLE$net$minecraft$network$play$server$S45PacketTitle$Type;
    private final /* synthetic */ NetworkManager netManager;
    private /* synthetic */ WorldClient clientWorldController;
    private /* synthetic */ boolean field_147308_k;
    private final /* synthetic */ GuiScreen guiScreenServer;
    public /* synthetic */ int currentServerMaxPlayers;
    private static final /* synthetic */ int[] lIlIIIIlllllll;
    private /* synthetic */ Minecraft gameController;
    
    private static boolean lllIIIlIIlIIlII(final int lllllllllllllIIIllllllIIlIllIIlI) {
        return lllllllllllllIIIllllllIIlIllIIlI != 0;
    }
    
    @Override
    public void handleRespawn(final S07PacketRespawn lllllllllllllIIIllllllllIIllIllI) {
        PacketThreadUtil.checkThreadAndEnqueue((Packet<NetHandlerPlayClient>)lllllllllllllIIIllllllllIIllIllI, this, this.gameController);
        if (lllIIIlIIlIlllI(lllllllllllllIIIllllllllIIllIllI.getDimensionID(), this.gameController.thePlayer.dimension)) {
            this.doneLoadingTerrain = (NetHandlerPlayClient.lIlIIIIlllllll[1] != 0);
            final Scoreboard lllllllllllllIIIllllllllIIlllIII = this.clientWorldController.getScoreboard();
            this.clientWorldController = new WorldClient(this, new WorldSettings(0L, lllllllllllllIIIllllllllIIllIllI.getGameType(), (boolean)(NetHandlerPlayClient.lIlIIIIlllllll[1] != 0), this.gameController.theWorld.getWorldInfo().isHardcoreModeEnabled(), lllllllllllllIIIllllllllIIllIllI.getWorldType()), lllllllllllllIIIllllllllIIllIllI.getDimensionID(), lllllllllllllIIIllllllllIIllIllI.getDifficulty(), this.gameController.mcProfiler);
            this.clientWorldController.setWorldScoreboard(lllllllllllllIIIllllllllIIlllIII);
            this.gameController.loadWorld(this.clientWorldController);
            this.gameController.thePlayer.dimension = lllllllllllllIIIllllllllIIllIllI.getDimensionID();
            this.gameController.displayGuiScreen(new GuiDownloadTerrain(this));
        }
        this.gameController.setDimensionAndSpawnPlayer(lllllllllllllIIIllllllllIIllIllI.getDimensionID());
        this.gameController.playerController.setGameType(lllllllllllllIIIllllllllIIllIllI.getGameType());
    }
    
    @Override
    public void handleEffect(final S28PacketEffect lllllllllllllIIIlllllllIIlllllII) {
        PacketThreadUtil.checkThreadAndEnqueue((Packet<NetHandlerPlayClient>)lllllllllllllIIIlllllllIIlllllII, this, this.gameController);
        if (lllIIIlIIlIIlII(lllllllllllllIIIlllllllIIlllllII.isSoundServerwide() ? 1 : 0)) {
            this.gameController.theWorld.playBroadcastSound(lllllllllllllIIIlllllllIIlllllII.getSoundType(), lllllllllllllIIIlllllllIIlllllII.getSoundPos(), lllllllllllllIIIlllllllIIlllllII.getSoundData());
            "".length();
            if (((0x84 ^ 0xBB) & ~(0x35 ^ 0xA)) != 0x0) {
                return;
            }
        }
        else {
            this.gameController.theWorld.playAuxSFX(lllllllllllllIIIlllllllIIlllllII.getSoundType(), lllllllllllllIIIlllllllIIlllllII.getSoundPos(), lllllllllllllIIIlllllllIIlllllII.getSoundData());
        }
    }
    
    @Override
    public void handleUpdateSign(final S33PacketUpdateSign lllllllllllllIIIlllllllIlllIlIlI) {
        PacketThreadUtil.checkThreadAndEnqueue((Packet<NetHandlerPlayClient>)lllllllllllllIIIlllllllIlllIlIlI, this, this.gameController);
        boolean lllllllllllllIIIlllllllIlllIlIIl = NetHandlerPlayClient.lIlIIIIlllllll[1] != 0;
        if (lllIIIlIIlIIlII(this.gameController.theWorld.isBlockLoaded(lllllllllllllIIIlllllllIlllIlIlI.getPos()) ? 1 : 0)) {
            final TileEntity lllllllllllllIIIlllllllIlllIlIII = this.gameController.theWorld.getTileEntity(lllllllllllllIIIlllllllIlllIlIlI.getPos());
            if (lllIIIlIIlIIlII((lllllllllllllIIIlllllllIlllIlIII instanceof TileEntitySign) ? 1 : 0)) {
                final TileEntitySign lllllllllllllIIIlllllllIlllIIlll = (TileEntitySign)lllllllllllllIIIlllllllIlllIlIII;
                if (lllIIIlIIlIIlII(lllllllllllllIIIlllllllIlllIIlll.getIsEditable() ? 1 : 0)) {
                    System.arraycopy(lllllllllllllIIIlllllllIlllIlIlI.getLines(), NetHandlerPlayClient.lIlIIIIlllllll[1], lllllllllllllIIIlllllllIlllIIlll.signText, NetHandlerPlayClient.lIlIIIIlllllll[1], NetHandlerPlayClient.lIlIIIIlllllll[26]);
                    lllllllllllllIIIlllllllIlllIIlll.markDirty();
                }
                lllllllllllllIIIlllllllIlllIlIIl = (NetHandlerPlayClient.lIlIIIIlllllll[17] != 0);
            }
        }
        if (lllIIIlIIlIlIII(lllllllllllllIIIlllllllIlllIlIIl ? 1 : 0) && lllIIIlIIlIIlIl(this.gameController.thePlayer)) {
            this.gameController.thePlayer.addChatMessage(new ChatComponentText(String.valueOf(new StringBuilder(NetHandlerPlayClient.lIlIIIIllIIlII[NetHandlerPlayClient.lIlIIIIlllllll[2]]).append(lllllllllllllIIIlllllllIlllIlIlI.getPos().getX()).append(NetHandlerPlayClient.lIlIIIIllIIlII[NetHandlerPlayClient.lIlIIIIlllllll[38]]).append(lllllllllllllIIIlllllllIlllIlIlI.getPos().getY()).append(NetHandlerPlayClient.lIlIIIIllIIlII[NetHandlerPlayClient.lIlIIIIlllllll[39]]).append(lllllllllllllIIIlllllllIlllIlIlI.getPos().getZ()))));
        }
    }
    
    @Override
    public void handleUseBed(final S0APacketUseBed lllllllllllllIIIlllllllllIIlIlIl) {
        PacketThreadUtil.checkThreadAndEnqueue((Packet<NetHandlerPlayClient>)lllllllllllllIIIlllllllllIIlIlIl, this, this.gameController);
        lllllllllllllIIIlllllllllIIlIlIl.getPlayer(this.clientWorldController).trySleep(lllllllllllllIIIlllllllllIIlIlIl.getBedPosition());
        "".length();
    }
    
    @Override
    public void handleEntityMovement(final S14PacketEntity lllllllllllllIIlIIIIIIIIIlIIIlll) {
        PacketThreadUtil.checkThreadAndEnqueue((Packet<NetHandlerPlayClient>)lllllllllllllIIlIIIIIIIIIlIIIlll, this, this.gameController);
        final Entity lllllllllllllIIlIIIIIIIIIlIIIlIl = lllllllllllllIIlIIIIIIIIIlIIIlll.getEntity(this.clientWorldController);
        if (lllIIIlIIlIIlIl(lllllllllllllIIlIIIIIIIIIlIIIlIl)) {
            final Entity entity = lllllllllllllIIlIIIIIIIIIlIIIlIl;
            entity.serverPosX += lllllllllllllIIlIIIIIIIIIlIIIlll.func_149062_c();
            final Entity entity2 = lllllllllllllIIlIIIIIIIIIlIIIlIl;
            entity2.serverPosY += lllllllllllllIIlIIIIIIIIIlIIIlll.func_149061_d();
            final Entity entity3 = lllllllllllllIIlIIIIIIIIIlIIIlIl;
            entity3.serverPosZ += lllllllllllllIIlIIIIIIIIIlIIIlll.func_149064_e();
            final double lllllllllllllIIlIIIIIIIIIlIIIlII = lllllllllllllIIlIIIIIIIIIlIIIlIl.serverPosX / 32.0;
            final double lllllllllllllIIlIIIIIIIIIlIIIIll = lllllllllllllIIlIIIIIIIIIlIIIlIl.serverPosY / 32.0;
            final double lllllllllllllIIlIIIIIIIIIlIIIIlI = lllllllllllllIIlIIIIIIIIIlIIIlIl.serverPosZ / 32.0;
            float rotationYaw;
            if (lllIIIlIIlIIlII(lllllllllllllIIlIIIIIIIIIlIIIlll.func_149060_h() ? 1 : 0)) {
                rotationYaw = lllllllllllllIIlIIIIIIIIIlIIIlll.func_149066_f() * NetHandlerPlayClient.lIlIIIIlllllll[24] / 256.0f;
                "".length();
                if (((0x3C ^ 0x7D) & ~(0x85 ^ 0xC4)) > ((0x55 ^ 0x6C) & ~(0x57 ^ 0x6E))) {
                    return;
                }
            }
            else {
                rotationYaw = lllllllllllllIIlIIIIIIIIIlIIIlIl.rotationYaw;
            }
            final float lllllllllllllIIlIIIIIIIIIlIIIIIl = rotationYaw;
            float rotationPitch;
            if (lllIIIlIIlIIlII(lllllllllllllIIlIIIIIIIIIlIIIlll.func_149060_h() ? 1 : 0)) {
                rotationPitch = lllllllllllllIIlIIIIIIIIIlIIIlll.func_149063_g() * NetHandlerPlayClient.lIlIIIIlllllll[24] / 256.0f;
                "".length();
                if ("   ".length() <= ((0x24 ^ 0x19 ^ (0x5E ^ 0x24)) & (0x47 ^ 0x39 ^ (0xAA ^ 0x93) ^ -" ".length()))) {
                    return;
                }
            }
            else {
                rotationPitch = lllllllllllllIIlIIIIIIIIIlIIIlIl.rotationPitch;
            }
            final float lllllllllllllIIlIIIIIIIIIlIIIIII = rotationPitch;
            lllllllllllllIIlIIIIIIIIIlIIIlIl.setPositionAndRotation2(lllllllllllllIIlIIIIIIIIIlIIIlII, lllllllllllllIIlIIIIIIIIIlIIIIll, lllllllllllllIIlIIIIIIIIIlIIIIlI, lllllllllllllIIlIIIIIIIIIlIIIIIl, lllllllllllllIIlIIIIIIIIIlIIIIII, NetHandlerPlayClient.lIlIIIIlllllll[25], (boolean)(NetHandlerPlayClient.lIlIIIIlllllll[1] != 0));
            lllllllllllllIIlIIIIIIIIIlIIIlIl.onGround = lllllllllllllIIlIIIIIIIIIlIIIlll.getOnGround();
        }
    }
    
    private static boolean lllIIIlIIlIllII(final int lllllllllllllIIIllllllIIllIIIIIl, final int lllllllllllllIIIllllllIIllIIIIII) {
        return lllllllllllllIIIllllllIIllIIIIIl < lllllllllllllIIIllllllIIllIIIIII;
    }
    
    public Collection<NetworkPlayerInfo> getPlayerInfoMap() {
        return this.playerInfoMap.values();
    }
    
    @Override
    public void handleParticles(final S2APacketParticles lllllllllllllIIIllllllIlIlIIlIII) {
        PacketThreadUtil.checkThreadAndEnqueue((Packet<NetHandlerPlayClient>)lllllllllllllIIIllllllIlIlIIlIII, this, this.gameController);
        if (lllIIIlIIlIlIII(lllllllllllllIIIllllllIlIlIIlIII.getParticleCount())) {
            final double lllllllllllllIIIllllllIlIlIlIlIl = lllllllllllllIIIllllllIlIlIIlIII.getParticleSpeed() * lllllllllllllIIIllllllIlIlIIlIII.getXOffset();
            final double lllllllllllllIIIllllllIlIlIlIlII = lllllllllllllIIIllllllIlIlIIlIII.getParticleSpeed() * lllllllllllllIIIllllllIlIlIIlIII.getYOffset();
            final double lllllllllllllIIIllllllIlIlIlIIll = lllllllllllllIIIllllllIlIlIIlIII.getParticleSpeed() * lllllllllllllIIIllllllIlIlIIlIII.getZOffset();
            try {
                this.clientWorldController.spawnParticle(lllllllllllllIIIllllllIlIlIIlIII.getParticleType(), lllllllllllllIIIllllllIlIlIIlIII.isLongDistance(), lllllllllllllIIIllllllIlIlIIlIII.getXCoordinate(), lllllllllllllIIIllllllIlIlIIlIII.getYCoordinate(), lllllllllllllIIIllllllIlIlIIlIII.getZCoordinate(), lllllllllllllIIIllllllIlIlIlIlIl, lllllllllllllIIIllllllIlIlIlIlII, lllllllllllllIIIllllllIlIlIlIIll, lllllllllllllIIIllllllIlIlIIlIII.getParticleArgs());
                "".length();
                if ("  ".length() >= "   ".length()) {
                    return;
                }
                return;
            }
            catch (Throwable lllllllllllllIIIllllllIlIlIlIIlI) {
                NetHandlerPlayClient.logger.warn(String.valueOf(new StringBuilder(NetHandlerPlayClient.lIlIIIIllIIlII[NetHandlerPlayClient.lIlIIIIlllllll[54]]).append(lllllllllllllIIIllllllIlIlIIlIII.getParticleType())));
                "".length();
                if (" ".length() <= -" ".length()) {
                    return;
                }
                return;
            }
        }
        int lllllllllllllIIIllllllIlIlIlIIIl = NetHandlerPlayClient.lIlIIIIlllllll[1];
        "".length();
        if (-" ".length() >= 0) {
            return;
        }
        while (!lllIIIlIIlIIllI(lllllllllllllIIIllllllIlIlIlIIIl, lllllllllllllIIIllllllIlIlIIlIII.getParticleCount())) {
            final double lllllllllllllIIIllllllIlIlIlIIII = this.avRandomizer.nextGaussian() * lllllllllllllIIIllllllIlIlIIlIII.getXOffset();
            final double lllllllllllllIIIllllllIlIlIIllll = this.avRandomizer.nextGaussian() * lllllllllllllIIIllllllIlIlIIlIII.getYOffset();
            final double lllllllllllllIIIllllllIlIlIIlllI = this.avRandomizer.nextGaussian() * lllllllllllllIIIllllllIlIlIIlIII.getZOffset();
            final double lllllllllllllIIIllllllIlIlIIllIl = this.avRandomizer.nextGaussian() * lllllllllllllIIIllllllIlIlIIlIII.getParticleSpeed();
            final double lllllllllllllIIIllllllIlIlIIllII = this.avRandomizer.nextGaussian() * lllllllllllllIIIllllllIlIlIIlIII.getParticleSpeed();
            final double lllllllllllllIIIllllllIlIlIIlIll = this.avRandomizer.nextGaussian() * lllllllllllllIIIllllllIlIlIIlIII.getParticleSpeed();
            try {
                this.clientWorldController.spawnParticle(lllllllllllllIIIllllllIlIlIIlIII.getParticleType(), lllllllllllllIIIllllllIlIlIIlIII.isLongDistance(), lllllllllllllIIIllllllIlIlIIlIII.getXCoordinate() + lllllllllllllIIIllllllIlIlIlIIII, lllllllllllllIIIllllllIlIlIIlIII.getYCoordinate() + lllllllllllllIIIllllllIlIlIIllll, lllllllllllllIIIllllllIlIlIIlIII.getZCoordinate() + lllllllllllllIIIllllllIlIlIIlllI, lllllllllllllIIIllllllIlIlIIllIl, lllllllllllllIIIllllllIlIlIIllII, lllllllllllllIIIllllllIlIlIIlIll, lllllllllllllIIIllllllIlIlIIlIII.getParticleArgs());
                "".length();
                if ("  ".length() != "  ".length()) {
                    return;
                }
            }
            catch (Throwable lllllllllllllIIIllllllIlIlIIlIlI) {
                NetHandlerPlayClient.logger.warn(String.valueOf(new StringBuilder(NetHandlerPlayClient.lIlIIIIllIIlII[NetHandlerPlayClient.lIlIIIIlllllll[55]]).append(lllllllllllllIIIllllllIlIlIIlIII.getParticleType())));
                return;
            }
            ++lllllllllllllIIIllllllIlIlIlIIIl;
        }
    }
    
    @Override
    public void handleWindowProperty(final S31PacketWindowProperty lllllllllllllIIIlllllllIllIIlllI) {
        PacketThreadUtil.checkThreadAndEnqueue((Packet<NetHandlerPlayClient>)lllllllllllllIIIlllllllIllIIlllI, this, this.gameController);
        final EntityPlayer lllllllllllllIIIlllllllIllIlIIII = this.gameController.thePlayer;
        if (lllIIIlIIlIIlIl(lllllllllllllIIIlllllllIllIlIIII.openContainer) && lllIIIlIIlIIIll(lllllllllllllIIIlllllllIllIlIIII.openContainer.windowId, lllllllllllllIIIlllllllIllIIlllI.getWindowId())) {
            lllllllllllllIIIlllllllIllIlIIII.openContainer.updateProgressBar(lllllllllllllIIIlllllllIllIIlllI.getVarIndex(), lllllllllllllIIIlllllllIllIIlllI.getVarValue());
        }
    }
    
    @Override
    public void handleUpdateHealth(final S06PacketUpdateHealth lllllllllllllIIIllllllllIlIIIlII) {
        PacketThreadUtil.checkThreadAndEnqueue((Packet<NetHandlerPlayClient>)lllllllllllllIIIllllllllIlIIIlII, this, this.gameController);
        this.gameController.thePlayer.setPlayerSPHealth(lllllllllllllIIIllllllllIlIIIlII.getHealth());
        this.gameController.thePlayer.getFoodStats().setFoodLevel(lllllllllllllIIIllllllllIlIIIlII.getFoodLevel());
        this.gameController.thePlayer.getFoodStats().setFoodSaturationLevel(lllllllllllllIIIllllllllIlIIIlII.getSaturationLevel());
    }
    
    @Override
    public void handleCustomPayload(final S3FPacketCustomPayload lllllllllllllIIIllllllIllIllIIII) {
        PacketThreadUtil.checkThreadAndEnqueue((Packet<NetHandlerPlayClient>)lllllllllllllIIIllllllIllIllIIII, this, this.gameController);
        if (lllIIIlIIlIIlII(NetHandlerPlayClient.lIlIIIIllIIlII[NetHandlerPlayClient.lIlIIIIlllllll[49]].equals(lllllllllllllIIIllllllIllIllIIII.getChannelName()) ? 1 : 0)) {
            final PacketBuffer lllllllllllllIIIllllllIllIlIllll = lllllllllllllIIIllllllIllIllIIII.getBufferData();
            try {
                final int lllllllllllllIIIllllllIllIlIlllI = lllllllllllllIIIllllllIllIlIllll.readInt();
                final GuiScreen lllllllllllllIIIllllllIllIlIllIl = this.gameController.currentScreen;
                if (lllIIIlIIlIIlIl(lllllllllllllIIIllllllIllIlIllIl) && lllIIIlIIlIIlII((lllllllllllllIIIllllllIllIlIllIl instanceof GuiMerchant) ? 1 : 0) && lllIIIlIIlIIIll(lllllllllllllIIIllllllIllIlIlllI, this.gameController.thePlayer.openContainer.windowId)) {
                    final IMerchant lllllllllllllIIIllllllIllIlIllII = ((GuiMerchant)lllllllllllllIIIllllllIllIlIllIl).getMerchant();
                    final MerchantRecipeList lllllllllllllIIIllllllIllIlIlIll = MerchantRecipeList.readFromBuf(lllllllllllllIIIllllllIllIlIllll);
                    lllllllllllllIIIllllllIllIlIllII.setRecipes(lllllllllllllIIIllllllIllIlIlIll);
                    "".length();
                    if (" ".length() > " ".length()) {
                        return;
                    }
                }
            }
            catch (IOException lllllllllllllIIIllllllIllIlIlIlI) {
                NetHandlerPlayClient.logger.error(NetHandlerPlayClient.lIlIIIIllIIlII[NetHandlerPlayClient.lIlIIIIlllllll[50]], (Throwable)lllllllllllllIIIllllllIllIlIlIlI);
                lllllllllllllIIIllllllIllIlIllll.release();
                "".length();
                "".length();
                if (null != null) {
                    return;
                }
                return;
            }
            finally {
                lllllllllllllIIIllllllIllIlIllll.release();
                "".length();
            }
            lllllllllllllIIIllllllIllIlIllll.release();
            "".length();
            "".length();
            if (((0xF ^ 0x55 ^ (0x22 ^ 0x60)) & (46 + 0 + 46 + 49 ^ 81 + 147 - 112 + 33 ^ -" ".length())) != 0x0) {
                return;
            }
        }
        else if (lllIIIlIIlIIlII(NetHandlerPlayClient.lIlIIIIllIIlII[NetHandlerPlayClient.lIlIIIIlllllll[51]].equals(lllllllllllllIIIllllllIllIllIIII.getChannelName()) ? 1 : 0)) {
            this.gameController.thePlayer.setClientBrand(lllllllllllllIIIllllllIllIllIIII.getBufferData().readStringFromBuffer(NetHandlerPlayClient.lIlIIIIlllllll[52]));
            "".length();
            if (-" ".length() >= ((0xA3 ^ 0x88) & ~(0x23 ^ 0x8))) {
                return;
            }
        }
        else if (lllIIIlIIlIIlII(NetHandlerPlayClient.lIlIIIIllIIlII[NetHandlerPlayClient.lIlIIIIlllllll[53]].equals(lllllllllllllIIIllllllIllIllIIII.getChannelName()) ? 1 : 0)) {
            final ItemStack lllllllllllllIIIllllllIllIlIlIIl = this.gameController.thePlayer.getCurrentEquippedItem();
            if (lllIIIlIIlIIlIl(lllllllllllllIIIllllllIllIlIlIIl) && lllIIIlIIllIIII(lllllllllllllIIIllllllIllIlIlIIl.getItem(), Items.written_book)) {
                this.gameController.displayGuiScreen(new GuiScreenBook(this.gameController.thePlayer, lllllllllllllIIIllllllIllIlIlIIl, (boolean)(NetHandlerPlayClient.lIlIIIIlllllll[1] != 0)));
            }
        }
    }
    
    @Override
    public void handleTeams(final S3EPacketTeams lllllllllllllIIIllllllIlIlllIIIl) {
        PacketThreadUtil.checkThreadAndEnqueue((Packet<NetHandlerPlayClient>)lllllllllllllIIIllllllIlIlllIIIl, this, this.gameController);
        final Scoreboard lllllllllllllIIIllllllIlIlllIIII = this.clientWorldController.getScoreboard();
        ScorePlayerTeam lllllllllllllIIIllllllIlIllIlllI;
        if (lllIIIlIIlIlIII(lllllllllllllIIIllllllIlIlllIIIl.func_149307_h())) {
            final ScorePlayerTeam lllllllllllllIIIllllllIlIllIllll = lllllllllllllIIIllllllIlIlllIIII.createTeam(lllllllllllllIIIllllllIlIlllIIIl.func_149312_c());
            "".length();
            if (null != null) {
                return;
            }
        }
        else {
            lllllllllllllIIIllllllIlIllIlllI = lllllllllllllIIIllllllIlIlllIIII.getTeam(lllllllllllllIIIllllllIlIlllIIIl.func_149312_c());
        }
        if (!lllIIIlIIlIIlII(lllllllllllllIIIllllllIlIlllIIIl.func_149307_h()) || lllIIIlIIlIIIll(lllllllllllllIIIllllllIlIlllIIIl.func_149307_h(), NetHandlerPlayClient.lIlIIIIlllllll[21])) {
            lllllllllllllIIIllllllIlIllIlllI.setTeamName(lllllllllllllIIIllllllIlIlllIIIl.func_149306_d());
            lllllllllllllIIIllllllIlIllIlllI.setNamePrefix(lllllllllllllIIIllllllIlIlllIIIl.func_149311_e());
            lllllllllllllIIIllllllIlIllIlllI.setNameSuffix(lllllllllllllIIIllllllIlIlllIIIl.func_149309_f());
            lllllllllllllIIIllllllIlIllIlllI.setChatFormat(EnumChatFormatting.func_175744_a(lllllllllllllIIIllllllIlIlllIIIl.func_179813_h()));
            lllllllllllllIIIllllllIlIllIlllI.func_98298_a(lllllllllllllIIIllllllIlIlllIIIl.func_149308_i());
            final Team.EnumVisible lllllllllllllIIIllllllIlIllIllIl = Team.EnumVisible.func_178824_a(lllllllllllllIIIllllllIlIlllIIIl.func_179814_i());
            if (lllIIIlIIlIIlIl(lllllllllllllIIIllllllIlIllIllIl)) {
                lllllllllllllIIIllllllIlIllIlllI.setNameTagVisibility(lllllllllllllIIIllllllIlIllIllIl);
            }
        }
        if (!lllIIIlIIlIIlII(lllllllllllllIIIllllllIlIlllIIIl.func_149307_h()) || lllIIIlIIlIIIll(lllllllllllllIIIllllllIlIlllIIIl.func_149307_h(), NetHandlerPlayClient.lIlIIIIlllllll[25])) {
            final Exception lllllllllllllIIIllllllIlIllIIlIl = (Exception)lllllllllllllIIIllllllIlIlllIIIl.func_149310_g().iterator();
            "".length();
            if ("  ".length() != "  ".length()) {
                return;
            }
            while (!lllIIIlIIlIlIII(((Iterator)lllllllllllllIIIllllllIlIllIIlIl).hasNext() ? 1 : 0)) {
                final String lllllllllllllIIIllllllIlIllIllII = ((Iterator<String>)lllllllllllllIIIllllllIlIllIIlIl).next();
                lllllllllllllIIIllllllIlIlllIIII.addPlayerToTeam(lllllllllllllIIIllllllIlIllIllII, lllllllllllllIIIllllllIlIlllIIIl.func_149312_c());
                "".length();
            }
        }
        if (lllIIIlIIlIIIll(lllllllllllllIIIllllllIlIlllIIIl.func_149307_h(), NetHandlerPlayClient.lIlIIIIlllllll[26])) {
            final Exception lllllllllllllIIIllllllIlIllIIlIl = (Exception)lllllllllllllIIIllllllIlIlllIIIl.func_149310_g().iterator();
            "".length();
            if ("  ".length() < 0) {
                return;
            }
            while (!lllIIIlIIlIlIII(((Iterator)lllllllllllllIIIllllllIlIllIIlIl).hasNext() ? 1 : 0)) {
                final String lllllllllllllIIIllllllIlIllIlIll = ((Iterator<String>)lllllllllllllIIIllllllIlIllIIlIl).next();
                lllllllllllllIIIllllllIlIlllIIII.removePlayerFromTeam(lllllllllllllIIIllllllIlIllIlIll, lllllllllllllIIIllllllIlIllIlllI);
            }
        }
        if (lllIIIlIIlIIIll(lllllllllllllIIIllllllIlIlllIIIl.func_149307_h(), NetHandlerPlayClient.lIlIIIIlllllll[17])) {
            lllllllllllllIIIllllllIlIlllIIII.removeTeam(lllllllllllllIIIllllllIlIllIlllI);
        }
    }
    
    private static boolean lllIIIlIIlIlIII(final int lllllllllllllIIIllllllIIlIllIIII) {
        return lllllllllllllIIIllllllIIlIllIIII == 0;
    }
    
    @Override
    public void handleEntityHeadLook(final S19PacketEntityHeadLook lllllllllllllIIlIIIIIIIIIIlIIIIl) {
        PacketThreadUtil.checkThreadAndEnqueue((Packet<NetHandlerPlayClient>)lllllllllllllIIlIIIIIIIIIIlIIIIl, this, this.gameController);
        final Entity lllllllllllllIIlIIIIIIIIIIlIIllI = lllllllllllllIIlIIIIIIIIIIlIIIIl.getEntity(this.clientWorldController);
        if (lllIIIlIIlIIlIl(lllllllllllllIIlIIIIIIIIIIlIIllI)) {
            final float lllllllllllllIIlIIIIIIIIIIlIIlII = lllllllllllllIIlIIIIIIIIIIlIIIIl.getYaw() * NetHandlerPlayClient.lIlIIIIlllllll[24] / 256.0f;
            lllllllllllllIIlIIIIIIIIIIlIIllI.setRotationYawHead(lllllllllllllIIlIIIIIIIIIIlIIlII);
        }
    }
    
    public NetworkPlayerInfo getPlayerInfo(final UUID lllllllllllllIIIllllllIlIIIllIlI) {
        return this.playerInfoMap.get(lllllllllllllIIIllllllIlIIIllIlI);
    }
    
    @Override
    public void handleEntityVelocity(final S12PacketEntityVelocity lllllllllllllIIlIIIIIIIIllIIllIl) {
        PacketThreadUtil.checkThreadAndEnqueue((Packet<NetHandlerPlayClient>)lllllllllllllIIlIIIIIIIIllIIllIl, this, this.gameController);
        final Entity lllllllllllllIIlIIIIIIIIllIIllII = this.clientWorldController.getEntityByID(lllllllllllllIIlIIIIIIIIllIIllIl.getEntityID());
        if (lllIIIlIIlIIlIl(lllllllllllllIIlIIIIIIIIllIIllII)) {
            lllllllllllllIIlIIIIIIIIllIIllII.setVelocity(lllllllllllllIIlIIIIIIIIllIIllIl.getMotionX() / 8000.0, lllllllllllllIIlIIIIIIIIllIIllIl.getMotionY() / 8000.0, lllllllllllllIIlIIIIIIIIllIIllIl.getMotionZ() / 8000.0);
        }
    }
    
    @Override
    public void handlePlayerPosLook(final S08PacketPlayerPosLook lllllllllllllIIIlllllllllllIlllI) {
        PacketThreadUtil.checkThreadAndEnqueue((Packet<NetHandlerPlayClient>)lllllllllllllIIIlllllllllllIlllI, this, this.gameController);
        final EntityPlayer lllllllllllllIIIllllllllllllIlIl = this.gameController.thePlayer;
        double lllllllllllllIIIllllllllllllIlII = lllllllllllllIIIlllllllllllIlllI.getX();
        double lllllllllllllIIIllllllllllllIIll = lllllllllllllIIIlllllllllllIlllI.getY();
        double lllllllllllllIIIllllllllllllIIlI = lllllllllllllIIIlllllllllllIlllI.getZ();
        float lllllllllllllIIIllllllllllllIIIl = lllllllllllllIIIlllllllllllIlllI.getYaw();
        float lllllllllllllIIIllllllllllllIIII = lllllllllllllIIIlllllllllllIlllI.getPitch();
        if (lllIIIlIIlIIlII(lllllllllllllIIIlllllllllllIlllI.func_179834_f().contains(S08PacketPlayerPosLook.EnumFlags.X) ? 1 : 0)) {
            lllllllllllllIIIllllllllllllIlII += lllllllllllllIIIllllllllllllIlIl.posX;
            "".length();
            if (((43 + 148 + 41 + 3 ^ 63 + 118 - 145 + 124) & (55 + 88 - 85 + 187 ^ 39 + 41 - 12 + 122 ^ -" ".length())) != 0x0) {
                return;
            }
        }
        else {
            lllllllllllllIIIllllllllllllIlIl.motionX = 0.0;
        }
        if (lllIIIlIIlIIlII(lllllllllllllIIIlllllllllllIlllI.func_179834_f().contains(S08PacketPlayerPosLook.EnumFlags.Y) ? 1 : 0)) {
            lllllllllllllIIIllllllllllllIIll += lllllllllllllIIIllllllllllllIlIl.posY;
            "".length();
            if (((0x9C ^ 0x84 ^ (0x5D ^ 0x62)) & (0x93 ^ 0xAE ^ (0x4C ^ 0x56) ^ -" ".length())) != ((0x2E ^ 0x63 ^ (0x30 ^ 0x63)) & (123 + 135 - 161 + 42 ^ 80 + 136 - 84 + 17 ^ -" ".length()))) {
                return;
            }
        }
        else {
            lllllllllllllIIIllllllllllllIlIl.motionY = 0.0;
        }
        if (lllIIIlIIlIIlII(lllllllllllllIIIlllllllllllIlllI.func_179834_f().contains(S08PacketPlayerPosLook.EnumFlags.Z) ? 1 : 0)) {
            lllllllllllllIIIllllllllllllIIlI += lllllllllllllIIIllllllllllllIlIl.posZ;
            "".length();
            if ("  ".length() <= -" ".length()) {
                return;
            }
        }
        else {
            lllllllllllllIIIllllllllllllIlIl.motionZ = 0.0;
        }
        if (lllIIIlIIlIIlII(lllllllllllllIIIlllllllllllIlllI.func_179834_f().contains(S08PacketPlayerPosLook.EnumFlags.X_ROT) ? 1 : 0)) {
            lllllllllllllIIIllllllllllllIIII += lllllllllllllIIIllllllllllllIlIl.rotationPitch;
        }
        if (lllIIIlIIlIIlII(lllllllllllllIIIlllllllllllIlllI.func_179834_f().contains(S08PacketPlayerPosLook.EnumFlags.Y_ROT) ? 1 : 0)) {
            lllllllllllllIIIllllllllllllIIIl += lllllllllllllIIIllllllllllllIlIl.rotationYaw;
        }
        lllllllllllllIIIllllllllllllIlIl.setPositionAndRotation(lllllllllllllIIIllllllllllllIlII, lllllllllllllIIIllllllllllllIIll, lllllllllllllIIIllllllllllllIIlI, lllllllllllllIIIllllllllllllIIIl, lllllllllllllIIIllllllllllllIIII);
        this.netManager.sendPacket(new C03PacketPlayer.C06PacketPlayerPosLook(lllllllllllllIIIllllllllllllIlIl.posX, lllllllllllllIIIllllllllllllIlIl.getEntityBoundingBox().minY, lllllllllllllIIIllllllllllllIlIl.posZ, lllllllllllllIIIllllllllllllIlIl.rotationYaw, lllllllllllllIIIllllllllllllIlIl.rotationPitch, (boolean)(NetHandlerPlayClient.lIlIIIIlllllll[1] != 0)));
        if (lllIIIlIIlIlIII(this.doneLoadingTerrain ? 1 : 0)) {
            this.gameController.thePlayer.prevPosX = this.gameController.thePlayer.posX;
            this.gameController.thePlayer.prevPosY = this.gameController.thePlayer.posY;
            this.gameController.thePlayer.prevPosZ = this.gameController.thePlayer.posZ;
            this.doneLoadingTerrain = (NetHandlerPlayClient.lIlIIIIlllllll[17] != 0);
            this.gameController.displayGuiScreen(null);
        }
    }
    
    @Override
    public void onDisconnect(final IChatComponent lllllllllllllIIIlllllllllIlllllI) {
        this.gameController.loadWorld(null);
        if (lllIIIlIIlIIlIl(this.guiScreenServer)) {
            if (lllIIIlIIlIIlII((this.guiScreenServer instanceof GuiScreenRealmsProxy) ? 1 : 0)) {
                this.gameController.displayGuiScreen(new DisconnectedRealmsScreen(((GuiScreenRealmsProxy)this.guiScreenServer).func_154321_a(), NetHandlerPlayClient.lIlIIIIllIIlII[NetHandlerPlayClient.lIlIIIIlllllll[17]], lllllllllllllIIIlllllllllIlllllI).getProxy());
                "".length();
                if (" ".length() >= (0x8C ^ 0xBC ^ (0x9E ^ 0xAA))) {
                    return;
                }
            }
            else {
                this.gameController.displayGuiScreen(new GuiDisconnected(this.guiScreenServer, NetHandlerPlayClient.lIlIIIIllIIlII[NetHandlerPlayClient.lIlIIIIlllllll[21]], lllllllllllllIIIlllllllllIlllllI));
                "".length();
                if ("   ".length() == 0) {
                    return;
                }
            }
        }
        else {
            this.gameController.displayGuiScreen(new GuiDisconnected(new GuiMultiplayer(new GuiMainMenu()), NetHandlerPlayClient.lIlIIIIllIIlII[NetHandlerPlayClient.lIlIIIIlllllll[25]], lllllllllllllIIIlllllllllIlllllI));
        }
    }
    
    @Override
    public void handleEntityProperties(final S20PacketEntityProperties lllllllllllllIIIllllllIlIIllIIlI) {
        PacketThreadUtil.checkThreadAndEnqueue((Packet<NetHandlerPlayClient>)lllllllllllllIIIllllllIlIIllIIlI, this, this.gameController);
        final Entity lllllllllllllIIIllllllIlIIllIIIl = this.clientWorldController.getEntityByID(lllllllllllllIIIllllllIlIIllIIlI.getEntityId());
        if (lllIIIlIIlIIlIl(lllllllllllllIIIllllllIlIIllIIIl)) {
            if (lllIIIlIIlIlIII((lllllllllllllIIIllllllIlIIllIIIl instanceof EntityLivingBase) ? 1 : 0)) {
                throw new IllegalStateException(String.valueOf(new StringBuilder(NetHandlerPlayClient.lIlIIIIllIIlII[NetHandlerPlayClient.lIlIIIIlllllll[56]]).append(lllllllllllllIIIllllllIlIIllIIIl).append(NetHandlerPlayClient.lIlIIIIllIIlII[NetHandlerPlayClient.lIlIIIIlllllll[57]])));
            }
            final BaseAttributeMap lllllllllllllIIIllllllIlIIllIIII = ((EntityLivingBase)lllllllllllllIIIllllllIlIIllIIIl).getAttributeMap();
            final byte lllllllllllllIIIllllllIlIIlIIlll = (byte)lllllllllllllIIIllllllIlIIllIIlI.func_149441_d().iterator();
            "".length();
            if (-" ".length() > 0) {
                return;
            }
            while (!lllIIIlIIlIlIII(((Iterator)lllllllllllllIIIllllllIlIIlIIlll).hasNext() ? 1 : 0)) {
                final S20PacketEntityProperties.Snapshot lllllllllllllIIIllllllIlIIlIllll = ((Iterator<S20PacketEntityProperties.Snapshot>)lllllllllllllIIIllllllIlIIlIIlll).next();
                IAttributeInstance lllllllllllllIIIllllllIlIIlIlllI = lllllllllllllIIIllllllIlIIllIIII.getAttributeInstanceByName(lllllllllllllIIIllllllIlIIlIllll.func_151409_a());
                if (lllIIIlIIlIllIl(lllllllllllllIIIllllllIlIIlIlllI)) {
                    lllllllllllllIIIllllllIlIIlIlllI = lllllllllllllIIIllllllIlIIllIIII.registerAttribute(new RangedAttribute(null, lllllllllllllIIIllllllIlIIlIllll.func_151409_a(), 0.0, Double.MIN_NORMAL, Double.MAX_VALUE));
                }
                lllllllllllllIIIllllllIlIIlIlllI.setBaseValue(lllllllllllllIIIllllllIlIIlIllll.func_151410_b());
                lllllllllllllIIIllllllIlIIlIlllI.removeAllModifiers();
                final long lllllllllllllIIIllllllIlIIlIIlII = (long)lllllllllllllIIIllllllIlIIlIllll.func_151408_c().iterator();
                "".length();
                if (-(0x4D ^ 0x49) > 0) {
                    return;
                }
                while (!lllIIIlIIlIlIII(((Iterator)lllllllllllllIIIllllllIlIIlIIlII).hasNext() ? 1 : 0)) {
                    final AttributeModifier lllllllllllllIIIllllllIlIIlIllIl = ((Iterator<AttributeModifier>)lllllllllllllIIIllllllIlIIlIIlII).next();
                    lllllllllllllIIIllllllIlIIlIlllI.applyModifier(lllllllllllllIIIllllllIlIIlIllIl);
                }
            }
        }
    }
    
    @Override
    public void handleStatistics(final S37PacketStatistics lllllllllllllIIIlllllllIIlllIIlI) {
        PacketThreadUtil.checkThreadAndEnqueue((Packet<NetHandlerPlayClient>)lllllllllllllIIIlllllllIIlllIIlI, this, this.gameController);
        boolean lllllllllllllIIIlllllllIIlllIIIl = NetHandlerPlayClient.lIlIIIIlllllll[1] != 0;
        final float lllllllllllllIIIlllllllIIllIlIII = (float)lllllllllllllIIIlllllllIIlllIIlI.func_148974_c().entrySet().iterator();
        "".length();
        if (-" ".length() >= " ".length()) {
            return;
        }
        while (!lllIIIlIIlIlIII(((Iterator)lllllllllllllIIIlllllllIIllIlIII).hasNext() ? 1 : 0)) {
            final Map.Entry<StatBase, Integer> lllllllllllllIIIlllllllIIlllIIII = ((Iterator<Map.Entry<StatBase, Integer>>)lllllllllllllIIIlllllllIIllIlIII).next();
            final StatBase lllllllllllllIIIlllllllIIllIllll = lllllllllllllIIIlllllllIIlllIIII.getKey();
            final int lllllllllllllIIIlllllllIIllIlllI = lllllllllllllIIIlllllllIIlllIIII.getValue();
            if (lllIIIlIIlIIlII(lllllllllllllIIIlllllllIIllIllll.isAchievement() ? 1 : 0) && lllIIIlIIlIIlll(lllllllllllllIIIlllllllIIllIlllI)) {
                if (lllIIIlIIlIIlII(this.field_147308_k ? 1 : 0) && lllIIIlIIlIlIII(this.gameController.thePlayer.getStatFileWriter().readStat(lllllllllllllIIIlllllllIIllIllll))) {
                    final Achievement lllllllllllllIIIlllllllIIllIllIl = (Achievement)lllllllllllllIIIlllllllIIllIllll;
                    this.gameController.guiAchievement.displayAchievement(lllllllllllllIIIlllllllIIllIllIl);
                    this.gameController.getTwitchStream().func_152911_a(new MetadataAchievement(lllllllllllllIIIlllllllIIllIllIl), 0L);
                    if (lllIIIlIIllIIII(lllllllllllllIIIlllllllIIllIllll, AchievementList.openInventory)) {
                        this.gameController.gameSettings.showInventoryAchievementHint = (NetHandlerPlayClient.lIlIIIIlllllll[1] != 0);
                        this.gameController.gameSettings.saveOptions();
                    }
                }
                lllllllllllllIIIlllllllIIlllIIIl = (NetHandlerPlayClient.lIlIIIIlllllll[17] != 0);
            }
            this.gameController.thePlayer.getStatFileWriter().unlockAchievement(this.gameController.thePlayer, lllllllllllllIIIlllllllIIllIllll, lllllllllllllIIIlllllllIIllIlllI);
        }
        if (lllIIIlIIlIlIII(this.field_147308_k ? 1 : 0) && lllIIIlIIlIlIII(lllllllllllllIIIlllllllIIlllIIIl ? 1 : 0) && lllIIIlIIlIIlII(this.gameController.gameSettings.showInventoryAchievementHint ? 1 : 0)) {
            this.gameController.guiAchievement.displayUnformattedAchievement(AchievementList.openInventory);
        }
        this.field_147308_k = (NetHandlerPlayClient.lIlIIIIlllllll[17] != 0);
        if (lllIIIlIIlIIlII((this.gameController.currentScreen instanceof IProgressMeter) ? 1 : 0)) {
            ((IProgressMeter)this.gameController.currentScreen).doneLoading();
        }
    }
    
    private static boolean lllIIIlIIlIlIll(final int lllllllllllllIIIllllllIIlIlIlllI) {
        return lllllllllllllIIIllllllIIlIlIlllI >= 0;
    }
    
    @Override
    public void handleSpawnPlayer(final S0CPacketSpawnPlayer lllllllllllllIIlIIIIIIIIlIlIIlII) {
        PacketThreadUtil.checkThreadAndEnqueue((Packet<NetHandlerPlayClient>)lllllllllllllIIlIIIIIIIIlIlIIlII, this, this.gameController);
        final double lllllllllllllIIlIIIIIIIIlIlIllIl = lllllllllllllIIlIIIIIIIIlIlIIlII.getX() / 32.0;
        final double lllllllllllllIIlIIIIIIIIlIlIllII = lllllllllllllIIlIIIIIIIIlIlIIlII.getY() / 32.0;
        final double lllllllllllllIIlIIIIIIIIlIlIlIll = lllllllllllllIIlIIIIIIIIlIlIIlII.getZ() / 32.0;
        final float lllllllllllllIIlIIIIIIIIlIlIlIlI = lllllllllllllIIlIIIIIIIIlIlIIlII.getYaw() * NetHandlerPlayClient.lIlIIIIlllllll[24] / 256.0f;
        final float lllllllllllllIIlIIIIIIIIlIlIlIIl = lllllllllllllIIlIIIIIIIIlIlIIlII.getPitch() * NetHandlerPlayClient.lIlIIIIlllllll[24] / 256.0f;
        final EntityOtherPlayerMP entityOtherPlayerMP3;
        final EntityOtherPlayerMP entityOtherPlayerMP2;
        final EntityOtherPlayerMP entityOtherPlayerMP;
        final EntityOtherPlayerMP lllllllllllllIIlIIIIIIIIlIlIlIII = entityOtherPlayerMP = (entityOtherPlayerMP2 = (entityOtherPlayerMP3 = new EntityOtherPlayerMP(this.gameController.theWorld, this.getPlayerInfo(lllllllllllllIIlIIIIIIIIlIlIIlII.getPlayer()).getGameProfile())));
        final int x = lllllllllllllIIlIIIIIIIIlIlIIlII.getX();
        entityOtherPlayerMP.serverPosX = x;
        final double n = x;
        entityOtherPlayerMP2.lastTickPosX = n;
        entityOtherPlayerMP3.prevPosX = n;
        final EntityOtherPlayerMP entityOtherPlayerMP4 = lllllllllllllIIlIIIIIIIIlIlIlIII;
        final EntityOtherPlayerMP entityOtherPlayerMP5 = lllllllllllllIIlIIIIIIIIlIlIlIII;
        final EntityOtherPlayerMP entityOtherPlayerMP6 = lllllllllllllIIlIIIIIIIIlIlIlIII;
        final int y = lllllllllllllIIlIIIIIIIIlIlIIlII.getY();
        entityOtherPlayerMP6.serverPosY = y;
        final double n2 = y;
        entityOtherPlayerMP5.lastTickPosY = n2;
        entityOtherPlayerMP4.prevPosY = n2;
        final EntityOtherPlayerMP entityOtherPlayerMP7 = lllllllllllllIIlIIIIIIIIlIlIlIII;
        final EntityOtherPlayerMP entityOtherPlayerMP8 = lllllllllllllIIlIIIIIIIIlIlIlIII;
        final EntityOtherPlayerMP entityOtherPlayerMP9 = lllllllllllllIIlIIIIIIIIlIlIlIII;
        final int z = lllllllllllllIIlIIIIIIIIlIlIIlII.getZ();
        entityOtherPlayerMP9.serverPosZ = z;
        final double n3 = z;
        entityOtherPlayerMP8.lastTickPosZ = n3;
        entityOtherPlayerMP7.prevPosZ = n3;
        final int lllllllllllllIIlIIIIIIIIlIlIIlll = lllllllllllllIIlIIIIIIIIlIlIIlII.getCurrentItemID();
        if (lllIIIlIIlIlIII(lllllllllllllIIlIIIIIIIIlIlIIlll)) {
            lllllllllllllIIlIIIIIIIIlIlIlIII.inventory.mainInventory[lllllllllllllIIlIIIIIIIIlIlIlIII.inventory.currentItem] = null;
            "".length();
            if ((0xA8 ^ 0xAD) == 0x0) {
                return;
            }
        }
        else {
            lllllllllllllIIlIIIIIIIIlIlIlIII.inventory.mainInventory[lllllllllllllIIlIIIIIIIIlIlIlIII.inventory.currentItem] = new ItemStack(Item.getItemById(lllllllllllllIIlIIIIIIIIlIlIIlll), NetHandlerPlayClient.lIlIIIIlllllll[17], NetHandlerPlayClient.lIlIIIIlllllll[1]);
        }
        lllllllllllllIIlIIIIIIIIlIlIlIII.setPositionAndRotation(lllllllllllllIIlIIIIIIIIlIlIllIl, lllllllllllllIIlIIIIIIIIlIlIllII, lllllllllllllIIlIIIIIIIIlIlIlIll, lllllllllllllIIlIIIIIIIIlIlIlIlI, lllllllllllllIIlIIIIIIIIlIlIlIIl);
        this.clientWorldController.addEntityToWorld(lllllllllllllIIlIIIIIIIIlIlIIlII.getEntityID(), lllllllllllllIIlIIIIIIIIlIlIlIII);
        final List<DataWatcher.WatchableObject> lllllllllllllIIlIIIIIIIIlIlIIllI = lllllllllllllIIlIIIIIIIIlIlIIlII.func_148944_c();
        if (lllIIIlIIlIIlIl(lllllllllllllIIlIIIIIIIIlIlIIllI)) {
            lllllllllllllIIlIIIIIIIIlIlIlIII.getDataWatcher().updateWatchedObjectsFromList(lllllllllllllIIlIIIIIIIIlIlIIllI);
        }
    }
    
    @Override
    public void handleCloseWindow(final S2EPacketCloseWindow lllllllllllllIIIlllllllIlIlllllI) {
        PacketThreadUtil.checkThreadAndEnqueue((Packet<NetHandlerPlayClient>)lllllllllllllIIIlllllllIlIlllllI, this, this.gameController);
        this.gameController.thePlayer.closeScreenAndDropStack();
    }
    
    @Override
    public void handlePlayerAbilities(final S39PacketPlayerAbilities lllllllllllllIIIllllllIllllIlIll) {
        PacketThreadUtil.checkThreadAndEnqueue((Packet<NetHandlerPlayClient>)lllllllllllllIIIllllllIllllIlIll, this, this.gameController);
        final EntityPlayer lllllllllllllIIIllllllIllllIllIl = this.gameController.thePlayer;
        lllllllllllllIIIllllllIllllIllIl.capabilities.isFlying = lllllllllllllIIIllllllIllllIlIll.isFlying();
        lllllllllllllIIIllllllIllllIllIl.capabilities.isCreativeMode = lllllllllllllIIIllllllIllllIlIll.isCreativeMode();
        lllllllllllllIIIllllllIllllIllIl.capabilities.disableDamage = lllllllllllllIIIllllllIllllIlIll.isInvulnerable();
        lllllllllllllIIIllllllIllllIllIl.capabilities.allowFlying = lllllllllllllIIIllllllIllllIlIll.isAllowFlying();
        lllllllllllllIIIllllllIllllIllIl.capabilities.setFlySpeed(lllllllllllllIIIllllllIllllIlIll.getFlySpeed());
        lllllllllllllIIIllllllIllllIllIl.capabilities.setPlayerWalkSpeed(lllllllllllllIIIllllllIllllIlIll.getWalkSpeed());
    }
    
    @Override
    public void handleTitle(final S45PacketTitle lllllllllllllIIIlllllllIIIlIIllI) {
        PacketThreadUtil.checkThreadAndEnqueue((Packet<NetHandlerPlayClient>)lllllllllllllIIIlllllllIIIlIIllI, this, this.gameController);
        final S45PacketTitle.Type lllllllllllllIIIlllllllIIIlIIlIl = lllllllllllllIIIlllllllIIIlIIllI.getType();
        String lllllllllllllIIIlllllllIIIlIIlII = null;
        String lllllllllllllIIIlllllllIIIlIIIll = null;
        String formattedText;
        if (lllIIIlIIlIIlIl(lllllllllllllIIIlllllllIIIlIIllI.getMessage())) {
            formattedText = lllllllllllllIIIlllllllIIIlIIllI.getMessage().getFormattedText();
            "".length();
            if (-"   ".length() > 0) {
                return;
            }
        }
        else {
            formattedText = NetHandlerPlayClient.lIlIIIIllIIlII[NetHandlerPlayClient.lIlIIIIlllllll[45]];
        }
        final String lllllllllllllIIIlllllllIIIlIIIlI = formattedText;
        switch ($SWITCH_TABLE$net$minecraft$network$play$server$S45PacketTitle$Type()[lllllllllllllIIIlllllllIIIlIIlIl.ordinal()]) {
            case 1: {
                lllllllllllllIIIlllllllIIIlIIlII = lllllllllllllIIIlllllllIIIlIIIlI;
                "".length();
                if (-(0xD1 ^ 0xA9 ^ (0x9 ^ 0x75)) > 0) {
                    return;
                }
                break;
            }
            case 2: {
                lllllllllllllIIIlllllllIIIlIIIll = lllllllllllllIIIlllllllIIIlIIIlI;
                "".length();
                if (((0x1D ^ 0xE) & ~(0x7B ^ 0x68)) >= "  ".length()) {
                    return;
                }
                break;
            }
            case 5: {
                this.gameController.ingameGUI.displayTitle(NetHandlerPlayClient.lIlIIIIllIIlII[NetHandlerPlayClient.lIlIIIIlllllll[46]], NetHandlerPlayClient.lIlIIIIllIIlII[NetHandlerPlayClient.lIlIIIIlllllll[0]], NetHandlerPlayClient.lIlIIIIlllllll[35], NetHandlerPlayClient.lIlIIIIlllllll[35], NetHandlerPlayClient.lIlIIIIlllllll[35]);
                this.gameController.ingameGUI.func_175177_a();
                return;
            }
        }
        this.gameController.ingameGUI.displayTitle(lllllllllllllIIIlllllllIIIlIIlII, lllllllllllllIIIlllllllIIIlIIIll, lllllllllllllIIIlllllllIIIlIIllI.getFadeInTime(), lllllllllllllIIIlllllllIIIlIIllI.getDisplayTime(), lllllllllllllIIIlllllllIIIlIIllI.getFadeOutTime());
    }
    
    @Override
    public void handleTimeUpdate(final S03PacketTimeUpdate lllllllllllllIIIllllllllIllIlIll) {
        PacketThreadUtil.checkThreadAndEnqueue((Packet<NetHandlerPlayClient>)lllllllllllllIIIllllllllIllIlIll, this, this.gameController);
        this.gameController.theWorld.setTotalWorldTime(lllllllllllllIIIllllllllIllIlIll.getTotalWorldTime());
        this.gameController.theWorld.setWorldTime(lllllllllllllIIIllllllllIllIlIll.getWorldTime());
    }
    
    public void addToSendQueue(final Packet lllllllllllllIIIlllllllllIlllIlI) {
        this.netManager.sendPacket(lllllllllllllIIIlllllllllIlllIlI);
    }
    
    @Override
    public void handleDisconnect(final S40PacketDisconnect lllllllllllllIIIllllllllllIIIlII) {
        this.netManager.closeChannel(lllllllllllllIIIllllllllllIIIlII.getReason());
    }
    
    @Override
    public void handleOpenWindow(final S2DPacketOpenWindow lllllllllllllIIIllllllllIIlIIIIl) {
        PacketThreadUtil.checkThreadAndEnqueue((Packet<NetHandlerPlayClient>)lllllllllllllIIIllllllllIIlIIIIl, this, this.gameController);
        final EntityPlayerSP lllllllllllllIIIllllllllIIlIIlIl = this.gameController.thePlayer;
        if (lllIIIlIIlIIlII(NetHandlerPlayClient.lIlIIIIllIIlII[NetHandlerPlayClient.lIlIIIIlllllll[32]].equals(lllllllllllllIIIllllllllIIlIIIIl.getGuiId()) ? 1 : 0)) {
            lllllllllllllIIIllllllllIIlIIlIl.displayGUIChest(new InventoryBasic(lllllllllllllIIIllllllllIIlIIIIl.getWindowTitle(), lllllllllllllIIIllllllllIIlIIIIl.getSlotCount()));
            lllllllllllllIIIllllllllIIlIIlIl.openContainer.windowId = lllllllllllllIIIllllllllIIlIIIIl.getWindowId();
            "".length();
            if ("  ".length() != "  ".length()) {
                return;
            }
        }
        else if (lllIIIlIIlIIlII(NetHandlerPlayClient.lIlIIIIllIIlII[NetHandlerPlayClient.lIlIIIIlllllll[33]].equals(lllllllllllllIIIllllllllIIlIIIIl.getGuiId()) ? 1 : 0)) {
            lllllllllllllIIIllllllllIIlIIlIl.displayVillagerTradeGui(new NpcMerchant(lllllllllllllIIIllllllllIIlIIlIl, lllllllllllllIIIllllllllIIlIIIIl.getWindowTitle()));
            lllllllllllllIIIllllllllIIlIIlIl.openContainer.windowId = lllllllllllllIIIllllllllIIlIIIIl.getWindowId();
            "".length();
            if (-" ".length() >= 0) {
                return;
            }
        }
        else if (lllIIIlIIlIIlII(NetHandlerPlayClient.lIlIIIIllIIlII[NetHandlerPlayClient.lIlIIIIlllllll[34]].equals(lllllllllllllIIIllllllllIIlIIIIl.getGuiId()) ? 1 : 0)) {
            final Entity lllllllllllllIIIllllllllIIlIIlII = this.clientWorldController.getEntityByID(lllllllllllllIIIllllllllIIlIIIIl.getEntityId());
            if (lllIIIlIIlIIlII((lllllllllllllIIIllllllllIIlIIlII instanceof EntityHorse) ? 1 : 0)) {
                lllllllllllllIIIllllllllIIlIIlIl.displayGUIHorse((EntityHorse)lllllllllllllIIIllllllllIIlIIlII, new AnimalChest(lllllllllllllIIIllllllllIIlIIIIl.getWindowTitle(), lllllllllllllIIIllllllllIIlIIIIl.getSlotCount()));
                lllllllllllllIIIllllllllIIlIIlIl.openContainer.windowId = lllllllllllllIIIllllllllIIlIIIIl.getWindowId();
                "".length();
                if (((0x40 ^ 0x5) & ~(0x58 ^ 0x1D)) != ((0x99 ^ 0xC3) & ~(0xF2 ^ 0xA8))) {
                    return;
                }
            }
        }
        else if (lllIIIlIIlIlIII(lllllllllllllIIIllllllllIIlIIIIl.hasSlots() ? 1 : 0)) {
            lllllllllllllIIIllllllllIIlIIlIl.displayGui(new LocalBlockIntercommunication(lllllllllllllIIIllllllllIIlIIIIl.getGuiId(), lllllllllllllIIIllllllllIIlIIIIl.getWindowTitle()));
            lllllllllllllIIIllllllllIIlIIlIl.openContainer.windowId = lllllllllllllIIIllllllllIIlIIIIl.getWindowId();
            "".length();
            if (-(0x59 ^ 0x63 ^ (0x6E ^ 0x50)) >= 0) {
                return;
            }
        }
        else {
            final ContainerLocalMenu lllllllllllllIIIllllllllIIlIIIll = new ContainerLocalMenu(lllllllllllllIIIllllllllIIlIIIIl.getGuiId(), lllllllllllllIIIllllllllIIlIIIIl.getWindowTitle(), lllllllllllllIIIllllllllIIlIIIIl.getSlotCount());
            lllllllllllllIIIllllllllIIlIIlIl.displayGUIChest(lllllllllllllIIIllllllllIIlIIIll);
            lllllllllllllIIIllllllllIIlIIlIl.openContainer.windowId = lllllllllllllIIIllllllllIIlIIIIl.getWindowId();
        }
    }
    
    static /* synthetic */ int[] $SWITCH_TABLE$net$minecraft$network$play$server$S38PacketPlayerListItem$Action() {
        final int[] $switch_TABLE$net$minecraft$network$play$server$S38PacketPlayerListItem$Action = NetHandlerPlayClient.$SWITCH_TABLE$net$minecraft$network$play$server$S38PacketPlayerListItem$Action;
        if (lllIIIlIIlIIlIl($switch_TABLE$net$minecraft$network$play$server$S38PacketPlayerListItem$Action)) {
            return $switch_TABLE$net$minecraft$network$play$server$S38PacketPlayerListItem$Action;
        }
        "".length();
        final String lllllllllllllIIIllllllIlIIIIIllI = (Object)new int[S38PacketPlayerListItem.Action.values().length];
        try {
            lllllllllllllIIIllllllIlIIIIIllI[S38PacketPlayerListItem.Action.ADD_PLAYER.ordinal()] = NetHandlerPlayClient.lIlIIIIlllllll[17];
            "".length();
            if ((0x6C ^ 0x68) <= -" ".length()) {
                return null;
            }
        }
        catch (NoSuchFieldError noSuchFieldError) {
            "".length();
        }
        try {
            lllllllllllllIIIllllllIlIIIIIllI[S38PacketPlayerListItem.Action.REMOVE_PLAYER.ordinal()] = NetHandlerPlayClient.lIlIIIIlllllll[29];
            "".length();
            if ((0xF5 ^ 0x9A ^ (0x6A ^ 0x1)) != (0x6D ^ 0x66 ^ (0x54 ^ 0x5B))) {
                return null;
            }
        }
        catch (NoSuchFieldError noSuchFieldError2) {
            "".length();
        }
        try {
            lllllllllllllIIIllllllIlIIIIIllI[S38PacketPlayerListItem.Action.UPDATE_DISPLAY_NAME.ordinal()] = NetHandlerPlayClient.lIlIIIIlllllll[26];
            "".length();
            if (null != null) {
                return null;
            }
        }
        catch (NoSuchFieldError noSuchFieldError3) {
            "".length();
        }
        try {
            lllllllllllllIIIllllllIlIIIIIllI[S38PacketPlayerListItem.Action.UPDATE_GAME_MODE.ordinal()] = NetHandlerPlayClient.lIlIIIIlllllll[21];
            "".length();
            if (((75 + 35 - 56 + 77 ^ 14 + 66 - 14 + 119) & (125 + 158 - 277 + 173 ^ 85 + 102 - 66 + 16 ^ -" ".length())) != 0x0) {
                return null;
            }
        }
        catch (NoSuchFieldError noSuchFieldError4) {
            "".length();
        }
        try {
            lllllllllllllIIIllllllIlIIIIIllI[S38PacketPlayerListItem.Action.UPDATE_LATENCY.ordinal()] = NetHandlerPlayClient.lIlIIIIlllllll[25];
            "".length();
            if ((0x79 ^ 0x7D) < 0) {
                return null;
            }
        }
        catch (NoSuchFieldError noSuchFieldError5) {
            "".length();
        }
        return NetHandlerPlayClient.$SWITCH_TABLE$net$minecraft$network$play$server$S38PacketPlayerListItem$Action = (int[])(Object)lllllllllllllIIIllllllIlIIIIIllI;
    }
    
    @Override
    public void handlePlayerListHeaderFooter(final S47PacketPlayerListHeaderFooter lllllllllllllIIIlllllllIIIIlIIII) {
        final GuiPlayerTabOverlay tabList = this.gameController.ingameGUI.getTabList();
        IChatComponent header;
        if (lllIIIlIIlIlIII(lllllllllllllIIIlllllllIIIIlIIII.getHeader().getFormattedText().length())) {
            header = null;
            "".length();
            if (null != null) {
                return;
            }
        }
        else {
            header = lllllllllllllIIIlllllllIIIIlIIII.getHeader();
        }
        tabList.setHeader(header);
        final GuiPlayerTabOverlay tabList2 = this.gameController.ingameGUI.getTabList();
        IChatComponent footer;
        if (lllIIIlIIlIlIII(lllllllllllllIIIlllllllIIIIlIIII.getFooter().getFormattedText().length())) {
            footer = null;
            "".length();
            if (-(0x13 ^ 0x6 ^ (0x6E ^ 0x7F)) > 0) {
                return;
            }
        }
        else {
            footer = lllllllllllllIIIlllllllIIIIlIIII.getFooter();
        }
        tabList2.setFooter(footer);
    }
    
    @Override
    public void handleSignEditorOpen(final S36PacketSignEditorOpen lllllllllllllIIIlllllllIllllIIlI) {
        PacketThreadUtil.checkThreadAndEnqueue((Packet<NetHandlerPlayClient>)lllllllllllllIIIlllllllIllllIIlI, this, this.gameController);
        TileEntity lllllllllllllIIIlllllllIllllIlII = this.clientWorldController.getTileEntity(lllllllllllllIIIlllllllIllllIIlI.getSignPosition());
        if (lllIIIlIIlIlIII((lllllllllllllIIIlllllllIllllIlII instanceof TileEntitySign) ? 1 : 0)) {
            lllllllllllllIIIlllllllIllllIlII = new TileEntitySign();
            lllllllllllllIIIlllllllIllllIlII.setWorldObj(this.clientWorldController);
            lllllllllllllIIIlllllllIllllIlII.setPos(lllllllllllllIIIlllllllIllllIIlI.getSignPosition());
        }
        this.gameController.thePlayer.openEditSign((TileEntitySign)lllllllllllllIIIlllllllIllllIlII);
    }
    
    private static boolean lllIIIlIIlIIlIl(final Object lllllllllllllIIIllllllIIlIlllIlI) {
        return lllllllllllllIIIllllllIIlIlllIlI != null;
    }
    
    private static void lllIIIlIIlIIIlI() {
        (lIlIIIIlllllll = new int[59])[0] = (148 + 97 - 187 + 132 ^ 13 + 52 - 39 + 144);
        NetHandlerPlayClient.lIlIIIIlllllll[1] = ((0x8E ^ 0xB4) & ~(0x88 ^ 0xB2));
        NetHandlerPlayClient.lIlIIIIlllllll[2] = (0x9C ^ 0x96);
        NetHandlerPlayClient.lIlIIIIlllllll[3] = (198 + 24 - 120 + 109 ^ 110 + 88 - 65 + 4);
        NetHandlerPlayClient.lIlIIIIlllllll[4] = (0xC ^ 0x30);
        NetHandlerPlayClient.lIlIIIIlllllll[5] = (0xBB ^ 0x86);
        NetHandlerPlayClient.lIlIIIIlllllll[6] = (0x11 ^ 0x45 ^ (0x49 ^ 0x5A));
        NetHandlerPlayClient.lIlIIIIlllllll[7] = ("   ".length() ^ (0x73 ^ 0x3D));
        NetHandlerPlayClient.lIlIIIIlllllll[8] = (0x39 ^ 0x44 ^ (0x2A ^ 0x16));
        NetHandlerPlayClient.lIlIIIIlllllll[9] = (0x69 ^ 0x62 ^ (0xF0 ^ 0xB3));
        NetHandlerPlayClient.lIlIIIIlllllll[10] = (145 + 215 - 328 + 204 ^ 44 + 139 - 165 + 142);
        NetHandlerPlayClient.lIlIIIIlllllll[11] = (0x25 ^ 0x1A);
        NetHandlerPlayClient.lIlIIIIlllllll[12] = (0x8 ^ 0x17 ^ (0xCD ^ 0x92));
        NetHandlerPlayClient.lIlIIIIlllllll[13] = (150 + 130 - 227 + 157 ^ 84 + 37 - 99 + 122);
        NetHandlerPlayClient.lIlIIIIlllllll[14] = (0x83 ^ 0xBD);
        NetHandlerPlayClient.lIlIIIIlllllll[15] = (0xCE ^ 0x87);
        NetHandlerPlayClient.lIlIIIIlllllll[16] = (0x16 ^ 0x5D);
        NetHandlerPlayClient.lIlIIIIlllllll[17] = " ".length();
        NetHandlerPlayClient.lIlIIIIlllllll[18] = (0xF ^ 0x3D);
        NetHandlerPlayClient.lIlIIIIlllllll[19] = (32 + 55 - 48 + 183 ^ 40 + 95 - 129 + 138);
        NetHandlerPlayClient.lIlIIIIlllllll[20] = (0x9D ^ 0xAE);
        NetHandlerPlayClient.lIlIIIIlllllll[21] = "  ".length();
        NetHandlerPlayClient.lIlIIIIlllllll[22] = (141 + 73 - 135 + 148 ^ 38 + 85 - 65 + 107);
        NetHandlerPlayClient.lIlIIIIlllllll[23] = (-" ".length() & (-1 & 0xFFFF));
        NetHandlerPlayClient.lIlIIIIlllllll[24] = (-(0xFFFFAFFA & 0x741D) & (0xFFFFA77F & 0x7DFF));
        NetHandlerPlayClient.lIlIIIIlllllll[25] = "   ".length();
        NetHandlerPlayClient.lIlIIIIlllllll[26] = (0x7E ^ 0x7A);
        NetHandlerPlayClient.lIlIIIIlllllll[27] = (72 + 25 - 8 + 39 ^ 60 + 117 - 77 + 43);
        NetHandlerPlayClient.lIlIIIIlllllll[28] = (-(0xFFFFFF9F & 0x4CE0) & (0xFFFFFDFF & 0x4F7F));
        NetHandlerPlayClient.lIlIIIIlllllll[29] = (67 + 17 - 60 + 170 ^ 169 + 39 - 54 + 45);
        NetHandlerPlayClient.lIlIIIIlllllll[30] = (0x1C ^ 0x44 ^ (0x79 ^ 0x27));
        NetHandlerPlayClient.lIlIIIIlllllll[31] = (0xB7 ^ 0xA2);
        NetHandlerPlayClient.lIlIIIIlllllll[32] = (0xA3 ^ 0xA4);
        NetHandlerPlayClient.lIlIIIIlllllll[33] = (0xB6 ^ 0xBE);
        NetHandlerPlayClient.lIlIIIIlllllll[34] = (0xCE ^ 0xC7);
        NetHandlerPlayClient.lIlIIIIlllllll[35] = -" ".length();
        NetHandlerPlayClient.lIlIIIIlllllll[36] = (0xBF ^ 0x9B);
        NetHandlerPlayClient.lIlIIIIlllllll[37] = (0x61 ^ 0x4C);
        NetHandlerPlayClient.lIlIIIIlllllll[38] = (0x6C ^ 0x67);
        NetHandlerPlayClient.lIlIIIIlllllll[39] = (0x63 ^ 0x6F);
        NetHandlerPlayClient.lIlIIIIlllllll[40] = (0xC5 ^ 0xBF ^ (0xE3 ^ 0x94));
        NetHandlerPlayClient.lIlIIIIlllllll[41] = (0x19 ^ 0x17);
        NetHandlerPlayClient.lIlIIIIlllllll[42] = (0x5A ^ 0x4A);
        NetHandlerPlayClient.lIlIIIIlllllll[43] = (0x7E ^ 0x11 ^ (0x51 ^ 0x2F));
        NetHandlerPlayClient.lIlIIIIlllllll[44] = (-(0xFFFFF756 & 0x5CBF) & (0xFFFFDFFD & 0x77FF));
        NetHandlerPlayClient.lIlIIIIlllllll[45] = (0x1A ^ 0x8);
        NetHandlerPlayClient.lIlIIIIlllllll[46] = (29 + 45 + 17 + 94 ^ 104 + 111 - 108 + 63);
        NetHandlerPlayClient.lIlIIIIlllllll[47] = (0x1D ^ 0xB);
        NetHandlerPlayClient.lIlIIIIlllllll[48] = (0x7A ^ 0x6D);
        NetHandlerPlayClient.lIlIIIIlllllll[49] = (0x54 ^ 0x74 ^ (0x66 ^ 0x5E));
        NetHandlerPlayClient.lIlIIIIlllllll[50] = (117 + 102 - 155 + 66 ^ 7 + 98 + 33 + 17);
        NetHandlerPlayClient.lIlIIIIlllllll[51] = (115 + 83 - 56 + 43 ^ 62 + 110 - 34 + 25);
        NetHandlerPlayClient.lIlIIIIlllllll[52] = (-1 & 0x7FFF);
        NetHandlerPlayClient.lIlIIIIlllllll[53] = (0x16 ^ 0x1A ^ (0xD0 ^ 0xC7));
        NetHandlerPlayClient.lIlIIIIlllllll[54] = (0x54 ^ 0x2 ^ (0x58 ^ 0x12));
        NetHandlerPlayClient.lIlIIIIlllllll[55] = ("   ".length() ^ (0x4E ^ 0x50));
        NetHandlerPlayClient.lIlIIIIlllllll[56] = (0x15 ^ 0xB);
        NetHandlerPlayClient.lIlIIIIlllllll[57] = (0x28 ^ 0x7 ^ (0x10 ^ 0x20));
        NetHandlerPlayClient.lIlIIIIlllllll[58] = (0x4 ^ 0x24);
    }
    
    private static boolean lllIIIlIIlIlllI(final int lllllllllllllIIIllllllIIlIlIIlll, final int lllllllllllllIIIllllllIIlIlIIllI) {
        return lllllllllllllIIIllllllIIlIlIIlll != lllllllllllllIIIllllllIIlIlIIllI;
    }
    
    @Override
    public void handleTabComplete(final S3APacketTabComplete lllllllllllllIIIllllllIllllIIIII) {
        PacketThreadUtil.checkThreadAndEnqueue((Packet<NetHandlerPlayClient>)lllllllllllllIIIllllllIllllIIIII, this, this.gameController);
        final String[] lllllllllllllIIIllllllIllllIIIll = lllllllllllllIIIllllllIllllIIIII.func_149630_c();
        if (lllIIIlIIlIIlII((this.gameController.currentScreen instanceof GuiChat) ? 1 : 0)) {
            final GuiChat lllllllllllllIIIllllllIllllIIIlI = (GuiChat)this.gameController.currentScreen;
            lllllllllllllIIIllllllIllllIIIlI.onAutocompleteResponse(lllllllllllllIIIllllllIllllIIIll);
        }
    }
    
    @Override
    public void handleEntityNBT(final S49PacketUpdateEntityNBT lllllllllllllIIIllllllIllIlllIll) {
        PacketThreadUtil.checkThreadAndEnqueue((Packet<NetHandlerPlayClient>)lllllllllllllIIIllllllIllIlllIll, this, this.gameController);
        final Entity lllllllllllllIIIllllllIllIllllIl = lllllllllllllIIIllllllIllIlllIll.getEntity(this.clientWorldController);
        if (lllIIIlIIlIIlIl(lllllllllllllIIIllllllIllIllllIl)) {
            lllllllllllllIIIllllllIllIllllIl.clientUpdateEntityNBT(lllllllllllllIIIllllllIllIlllIll.getTagCompound());
        }
    }
    
    @Override
    public void handleSetExperience(final S1FPacketSetExperience lllllllllllllIIIllllllllIIlllllI) {
        PacketThreadUtil.checkThreadAndEnqueue((Packet<NetHandlerPlayClient>)lllllllllllllIIIllllllllIIlllllI, this, this.gameController);
        this.gameController.thePlayer.setXPStats(lllllllllllllIIIllllllllIIlllllI.func_149397_c(), lllllllllllllIIIllllllllIIlllllI.getTotalExperience(), lllllllllllllIIIllllllllIIlllllI.getLevel());
    }
    
    @Override
    public void handleSpawnPainting(final S10PacketSpawnPainting lllllllllllllIIlIIIIIIIIllIlIIll) {
        PacketThreadUtil.checkThreadAndEnqueue((Packet<NetHandlerPlayClient>)lllllllllllllIIlIIIIIIIIllIlIIll, this, this.gameController);
        final EntityPainting lllllllllllllIIlIIIIIIIIllIlIlIl = new EntityPainting(this.clientWorldController, lllllllllllllIIlIIIIIIIIllIlIIll.getPosition(), lllllllllllllIIlIIIIIIIIllIlIIll.getFacing(), lllllllllllllIIlIIIIIIIIllIlIIll.getTitle());
        this.clientWorldController.addEntityToWorld(lllllllllllllIIlIIIIIIIIllIlIIll.getEntityID(), lllllllllllllIIlIIIIIIIIllIlIlIl);
    }
    
    @Override
    public void handleAnimation(final S0BPacketAnimation lllllllllllllIIIlllllllllIlIIIII) {
        PacketThreadUtil.checkThreadAndEnqueue((Packet<NetHandlerPlayClient>)lllllllllllllIIIlllllllllIlIIIII, this, this.gameController);
        final Entity lllllllllllllIIIlllllllllIIlllll = this.clientWorldController.getEntityByID(lllllllllllllIIIlllllllllIlIIIII.getEntityID());
        if (lllIIIlIIlIIlIl(lllllllllllllIIIlllllllllIIlllll)) {
            if (lllIIIlIIlIlIII(lllllllllllllIIIlllllllllIlIIIII.getAnimationType())) {
                final EntityLivingBase lllllllllllllIIIlllllllllIIllllI = (EntityLivingBase)lllllllllllllIIIlllllllllIIlllll;
                lllllllllllllIIIlllllllllIIllllI.swingItem();
                "".length();
                if (-(0x5B ^ 0x5F) >= 0) {
                    return;
                }
            }
            else if (lllIIIlIIlIIIll(lllllllllllllIIIlllllllllIlIIIII.getAnimationType(), NetHandlerPlayClient.lIlIIIIlllllll[17])) {
                lllllllllllllIIIlllllllllIIlllll.performHurtAnimation();
                "".length();
                if (((1 + 59 - 17 + 204 ^ 26 + 134 - 124 + 112) & (43 + 206 - 21 + 0 ^ 30 + 70 - 56 + 91 ^ -" ".length())) < -" ".length()) {
                    return;
                }
            }
            else if (lllIIIlIIlIIIll(lllllllllllllIIIlllllllllIlIIIII.getAnimationType(), NetHandlerPlayClient.lIlIIIIlllllll[21])) {
                final EntityPlayer lllllllllllllIIIlllllllllIIlllIl = (EntityPlayer)lllllllllllllIIIlllllllllIIlllll;
                lllllllllllllIIIlllllllllIIlllIl.wakeUpPlayer((boolean)(NetHandlerPlayClient.lIlIIIIlllllll[1] != 0), (boolean)(NetHandlerPlayClient.lIlIIIIlllllll[1] != 0), (boolean)(NetHandlerPlayClient.lIlIIIIlllllll[1] != 0));
                "".length();
                if (((0xBB ^ 0x99) & ~(0x6E ^ 0x4C)) != 0x0) {
                    return;
                }
            }
            else if (lllIIIlIIlIIIll(lllllllllllllIIIlllllllllIlIIIII.getAnimationType(), NetHandlerPlayClient.lIlIIIIlllllll[26])) {
                this.gameController.effectRenderer.emitParticleAtEntity(lllllllllllllIIIlllllllllIIlllll, EnumParticleTypes.CRIT);
                "".length();
                if ("   ".length() < ((0x21 ^ 0x19) & ~(0x66 ^ 0x5E))) {
                    return;
                }
            }
            else if (lllIIIlIIlIIIll(lllllllllllllIIIlllllllllIlIIIII.getAnimationType(), NetHandlerPlayClient.lIlIIIIlllllll[29])) {
                this.gameController.effectRenderer.emitParticleAtEntity(lllllllllllllIIIlllllllllIIlllll, EnumParticleTypes.CRIT_MAGIC);
            }
        }
    }
    
    @Override
    public void handleEntityMetadata(final S1CPacketEntityMetadata lllllllllllllIIlIIIIIIIIllIIIlII) {
        PacketThreadUtil.checkThreadAndEnqueue((Packet<NetHandlerPlayClient>)lllllllllllllIIlIIIIIIIIllIIIlII, this, this.gameController);
        final Entity lllllllllllllIIlIIIIIIIIllIIIIll = this.clientWorldController.getEntityByID(lllllllllllllIIlIIIIIIIIllIIIlII.getEntityId());
        if (lllIIIlIIlIIlIl(lllllllllllllIIlIIIIIIIIllIIIIll) && lllIIIlIIlIIlIl(lllllllllllllIIlIIIIIIIIllIIIlII.func_149376_c())) {
            lllllllllllllIIlIIIIIIIIllIIIIll.getDataWatcher().updateWatchedObjectsFromList(lllllllllllllIIlIIIIIIIIllIIIlII.func_149376_c());
        }
    }
    
    private static String lllIIIIlllIllII(String lllllllllllllIIIllllllIIlllIIIIl, final String lllllllllllllIIIllllllIIlllIIIII) {
        lllllllllllllIIIllllllIIlllIIIIl = new String(Base64.getDecoder().decode(lllllllllllllIIIllllllIIlllIIIIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIIIllllllIIlllIIlII = new StringBuilder();
        final char[] lllllllllllllIIIllllllIIlllIIIll = lllllllllllllIIIllllllIIlllIIIII.toCharArray();
        int lllllllllllllIIIllllllIIlllIIIlI = NetHandlerPlayClient.lIlIIIIlllllll[1];
        final short lllllllllllllIIIllllllIIllIlllII = (Object)lllllllllllllIIIllllllIIlllIIIIl.toCharArray();
        final String lllllllllllllIIIllllllIIllIllIll = (String)lllllllllllllIIIllllllIIllIlllII.length;
        double lllllllllllllIIIllllllIIllIllIlI = NetHandlerPlayClient.lIlIIIIlllllll[1];
        while (lllIIIlIIlIllII((int)lllllllllllllIIIllllllIIllIllIlI, (int)lllllllllllllIIIllllllIIllIllIll)) {
            final char lllllllllllllIIIllllllIIlllIIlll = lllllllllllllIIIllllllIIllIlllII[lllllllllllllIIIllllllIIllIllIlI];
            lllllllllllllIIIllllllIIlllIIlII.append((char)(lllllllllllllIIIllllllIIlllIIlll ^ lllllllllllllIIIllllllIIlllIIIll[lllllllllllllIIIllllllIIlllIIIlI % lllllllllllllIIIllllllIIlllIIIll.length]));
            "".length();
            ++lllllllllllllIIIllllllIIlllIIIlI;
            ++lllllllllllllIIIllllllIIllIllIlI;
            "".length();
            if ("  ".length() != "  ".length()) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIIIllllllIIlllIIlII);
    }
    
    private static String lllIIIIlllIllIl(final String lllllllllllllIIIllllllIIllllIllI, final String lllllllllllllIIIllllllIIllllIlIl) {
        try {
            final SecretKeySpec lllllllllllllIIIllllllIIlllllIIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIIIllllllIIllllIlIl.getBytes(StandardCharsets.UTF_8)), NetHandlerPlayClient.lIlIIIIlllllll[33]), "DES");
            final Cipher lllllllllllllIIIllllllIIlllllIII = Cipher.getInstance("DES");
            lllllllllllllIIIllllllIIlllllIII.init(NetHandlerPlayClient.lIlIIIIlllllll[21], lllllllllllllIIIllllllIIlllllIIl);
            return new String(lllllllllllllIIIllllllIIlllllIII.doFinal(Base64.getDecoder().decode(lllllllllllllIIIllllllIIllllIllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIIllllllIIllllIlll) {
            lllllllllllllIIIllllllIIllllIlll.printStackTrace();
            return null;
        }
    }
    
    @Override
    public void handleSpawnExperienceOrb(final S11PacketSpawnExperienceOrb lllllllllllllIIlIIIIIIIIlllIlllI) {
        PacketThreadUtil.checkThreadAndEnqueue((Packet<NetHandlerPlayClient>)lllllllllllllIIlIIIIIIIIlllIlllI, this, this.gameController);
        final Entity lllllllllllllIIlIIIIIIIIllllIIII = new EntityXPOrb(this.clientWorldController, lllllllllllllIIlIIIIIIIIlllIlllI.getX() / 32.0, lllllllllllllIIlIIIIIIIIlllIlllI.getY() / 32.0, lllllllllllllIIlIIIIIIIIlllIlllI.getZ() / 32.0, lllllllllllllIIlIIIIIIIIlllIlllI.getXPValue());
        lllllllllllllIIlIIIIIIIIllllIIII.serverPosX = lllllllllllllIIlIIIIIIIIlllIlllI.getX();
        lllllllllllllIIlIIIIIIIIllllIIII.serverPosY = lllllllllllllIIlIIIIIIIIlllIlllI.getY();
        lllllllllllllIIlIIIIIIIIllllIIII.serverPosZ = lllllllllllllIIlIIIIIIIIlllIlllI.getZ();
        lllllllllllllIIlIIIIIIIIllllIIII.rotationYaw = 0.0f;
        lllllllllllllIIlIIIIIIIIllllIIII.rotationPitch = 0.0f;
        lllllllllllllIIlIIIIIIIIllllIIII.setEntityId(lllllllllllllIIlIIIIIIIIlllIlllI.getEntityID());
        this.clientWorldController.addEntityToWorld(lllllllllllllIIlIIIIIIIIlllIlllI.getEntityID(), lllllllllllllIIlIIIIIIIIllllIIII);
    }
    
    static /* synthetic */ int[] $SWITCH_TABLE$net$minecraft$network$play$server$S45PacketTitle$Type() {
        final int[] $switch_TABLE$net$minecraft$network$play$server$S45PacketTitle$Type = NetHandlerPlayClient.$SWITCH_TABLE$net$minecraft$network$play$server$S45PacketTitle$Type;
        if (lllIIIlIIlIIlIl($switch_TABLE$net$minecraft$network$play$server$S45PacketTitle$Type)) {
            return $switch_TABLE$net$minecraft$network$play$server$S45PacketTitle$Type;
        }
        "".length();
        final char lllllllllllllIIIllllllIlIIIIlIII = (Object)new int[S45PacketTitle.Type.values().length];
        try {
            lllllllllllllIIIllllllIlIIIIlIII[S45PacketTitle.Type.CLEAR.ordinal()] = NetHandlerPlayClient.lIlIIIIlllllll[26];
            "".length();
            if (((103 + 38 - 106 + 183 ^ 128 + 45 - 109 + 71) & (189 + 159 - 333 + 232 ^ 42 + 168 - 174 + 134 ^ -" ".length())) <= -" ".length()) {
                return null;
            }
        }
        catch (NoSuchFieldError noSuchFieldError) {
            "".length();
        }
        try {
            lllllllllllllIIIllllllIlIIIIlIII[S45PacketTitle.Type.RESET.ordinal()] = NetHandlerPlayClient.lIlIIIIlllllll[29];
            "".length();
            if ("  ".length() != "  ".length()) {
                return null;
            }
        }
        catch (NoSuchFieldError noSuchFieldError2) {
            "".length();
        }
        try {
            lllllllllllllIIIllllllIlIIIIlIII[S45PacketTitle.Type.SUBTITLE.ordinal()] = NetHandlerPlayClient.lIlIIIIlllllll[21];
            "".length();
            if ("   ".length() != "   ".length()) {
                return null;
            }
        }
        catch (NoSuchFieldError noSuchFieldError3) {
            "".length();
        }
        try {
            lllllllllllllIIIllllllIlIIIIlIII[S45PacketTitle.Type.TIMES.ordinal()] = NetHandlerPlayClient.lIlIIIIlllllll[25];
            "".length();
            if (" ".length() > "   ".length()) {
                return null;
            }
        }
        catch (NoSuchFieldError noSuchFieldError4) {
            "".length();
        }
        try {
            lllllllllllllIIIllllllIlIIIIlIII[S45PacketTitle.Type.TITLE.ordinal()] = NetHandlerPlayClient.lIlIIIIlllllll[17];
            "".length();
            if (" ".length() == 0) {
                return null;
            }
        }
        catch (NoSuchFieldError noSuchFieldError5) {
            "".length();
        }
        return NetHandlerPlayClient.$SWITCH_TABLE$net$minecraft$network$play$server$S45PacketTitle$Type = (int[])(Object)lllllllllllllIIIllllllIlIIIIlIII;
    }
    
    @Override
    public void handleServerDifficulty(final S41PacketServerDifficulty lllllllllllllIIIlllllllIIIllllll) {
        PacketThreadUtil.checkThreadAndEnqueue((Packet<NetHandlerPlayClient>)lllllllllllllIIIlllllllIIIllllll, this, this.gameController);
        this.gameController.theWorld.getWorldInfo().setDifficulty(lllllllllllllIIIlllllllIIIllllll.getDifficulty());
        this.gameController.theWorld.getWorldInfo().setDifficultyLocked(lllllllllllllIIIlllllllIIIllllll.isDifficultyLocked());
    }
    
    @Override
    public void handleKeepAlive(final S00PacketKeepAlive lllllllllllllIIIllllllIlllllIIll) {
        this.addToSendQueue(new C00PacketKeepAlive(lllllllllllllIIIllllllIlllllIIll.func_149134_c()));
    }
    
    @Override
    public void handleBlockBreakAnim(final S25PacketBlockBreakAnim lllllllllllllIIIlllllllIlIllIIlI) {
        PacketThreadUtil.checkThreadAndEnqueue((Packet<NetHandlerPlayClient>)lllllllllllllIIIlllllllIlIllIIlI, this, this.gameController);
        this.gameController.theWorld.sendBlockBreakProgress(lllllllllllllIIIlllllllIlIllIIlI.getBreakerId(), lllllllllllllIIIlllllllIlIllIIlI.getPosition(), lllllllllllllIIIlllllllIlIllIIlI.getProgress());
    }
    
    @Override
    public void handleJoinGame(final S01PacketJoinGame lllllllllllllIIlIIIIIIIlIIIlIIll) {
        PacketThreadUtil.checkThreadAndEnqueue((Packet<NetHandlerPlayClient>)lllllllllllllIIlIIIIIIIlIIIlIIll, this, this.gameController);
        this.gameController.playerController = new PlayerControllerMP(this.gameController, this);
        this.clientWorldController = new WorldClient(this, new WorldSettings(0L, lllllllllllllIIlIIIIIIIlIIIlIIll.getGameType(), (boolean)(NetHandlerPlayClient.lIlIIIIlllllll[1] != 0), lllllllllllllIIlIIIIIIIlIIIlIIll.isHardcoreMode(), lllllllllllllIIlIIIIIIIlIIIlIIll.getWorldType()), lllllllllllllIIlIIIIIIIlIIIlIIll.getDimension(), lllllllllllllIIlIIIIIIIlIIIlIIll.getDifficulty(), this.gameController.mcProfiler);
        this.gameController.gameSettings.difficulty = lllllllllllllIIlIIIIIIIlIIIlIIll.getDifficulty();
        this.gameController.loadWorld(this.clientWorldController);
        this.gameController.thePlayer.dimension = lllllllllllllIIlIIIIIIIlIIIlIIll.getDimension();
        this.gameController.displayGuiScreen(new GuiDownloadTerrain(this));
        this.gameController.thePlayer.setEntityId(lllllllllllllIIlIIIIIIIlIIIlIIll.getEntityId());
        this.currentServerMaxPlayers = lllllllllllllIIlIIIIIIIlIIIlIIll.getMaxPlayers();
        this.gameController.thePlayer.setReducedDebug(lllllllllllllIIlIIIIIIIlIIIlIIll.isReducedDebugInfo());
        this.gameController.playerController.setGameType(lllllllllllllIIlIIIIIIIlIIIlIIll.getGameType());
        this.gameController.gameSettings.sendSettingsToServer();
        this.netManager.sendPacket(new C17PacketCustomPayload(NetHandlerPlayClient.lIlIIIIllIIlII[NetHandlerPlayClient.lIlIIIIlllllll[1]], new PacketBuffer(Unpooled.buffer()).writeString(ClientBrandRetriever.getClientModName())));
    }
    
    @Override
    public void handlePlayerListItem(final S38PacketPlayerListItem lllllllllllllIIIlllllllIIIIIIIII) {
        PacketThreadUtil.checkThreadAndEnqueue((Packet<NetHandlerPlayClient>)lllllllllllllIIIlllllllIIIIIIIII, this, this.gameController);
        final double lllllllllllllIIIllllllIllllllIlI = (double)lllllllllllllIIIlllllllIIIIIIIII.func_179767_a().iterator();
        "".length();
        if (-" ".length() == "   ".length()) {
            return;
        }
        while (!lllIIIlIIlIlIII(((Iterator)lllllllllllllIIIllllllIllllllIlI).hasNext() ? 1 : 0)) {
            final S38PacketPlayerListItem.AddPlayerData lllllllllllllIIIllllllIlllllllll = ((Iterator<S38PacketPlayerListItem.AddPlayerData>)lllllllllllllIIIllllllIllllllIlI).next();
            if (lllIIIlIIllIIII(lllllllllllllIIIlllllllIIIIIIIII.func_179768_b(), S38PacketPlayerListItem.Action.REMOVE_PLAYER)) {
                this.playerInfoMap.remove(lllllllllllllIIIllllllIlllllllll.getProfile().getId());
                "".length();
                "".length();
                if (((0xB0 ^ 0x93 ^ (0xC8 ^ 0xA5)) & (17 + 89 - 35 + 67 ^ 124 + 53 - 43 + 62 ^ -" ".length())) >= " ".length()) {
                    return;
                }
                continue;
            }
            else {
                NetworkPlayerInfo lllllllllllllIIIllllllIllllllllI = this.playerInfoMap.get(lllllllllllllIIIllllllIlllllllll.getProfile().getId());
                if (lllIIIlIIllIIII(lllllllllllllIIIlllllllIIIIIIIII.func_179768_b(), S38PacketPlayerListItem.Action.ADD_PLAYER)) {
                    lllllllllllllIIIllllllIllllllllI = new NetworkPlayerInfo(lllllllllllllIIIllllllIlllllllll);
                    this.playerInfoMap.put(lllllllllllllIIIllllllIllllllllI.getGameProfile().getId(), lllllllllllllIIIllllllIllllllllI);
                    "".length();
                }
                if (!lllIIIlIIlIIlIl(lllllllllllllIIIllllllIllllllllI)) {
                    continue;
                }
                switch ($SWITCH_TABLE$net$minecraft$network$play$server$S38PacketPlayerListItem$Action()[lllllllllllllIIIlllllllIIIIIIIII.func_179768_b().ordinal()]) {
                    case 1: {
                        lllllllllllllIIIllllllIllllllllI.setGameType(lllllllllllllIIIllllllIlllllllll.getGameMode());
                        lllllllllllllIIIllllllIllllllllI.setResponseTime(lllllllllllllIIIllllllIlllllllll.getPing());
                        "".length();
                        if (-(0x48 ^ 0x4D ^ " ".length()) >= 0) {
                            return;
                        }
                        continue;
                    }
                    case 2: {
                        lllllllllllllIIIllllllIllllllllI.setGameType(lllllllllllllIIIllllllIlllllllll.getGameMode());
                        "".length();
                        if (-" ".length() > (169 + 46 - 170 + 140 ^ 75 + 14 - 3 + 103)) {
                            return;
                        }
                        continue;
                    }
                    case 3: {
                        lllllllllllllIIIllllllIllllllllI.setResponseTime(lllllllllllllIIIllllllIlllllllll.getPing());
                        "".length();
                        if ("  ".length() <= 0) {
                            return;
                        }
                        continue;
                    }
                    case 4: {
                        lllllllllllllIIIllllllIllllllllI.setDisplayName(lllllllllllllIIIllllllIlllllllll.getDisplayName());
                    }
                    default: {
                        continue;
                    }
                }
            }
        }
    }
    
    @Override
    public void handleExplosion(final S27PacketExplosion lllllllllllllIIIllllllllIIlIllIl) {
        PacketThreadUtil.checkThreadAndEnqueue((Packet<NetHandlerPlayClient>)lllllllllllllIIIllllllllIIlIllIl, this, this.gameController);
        final Explosion lllllllllllllIIIllllllllIIlIllll = new Explosion(this.gameController.theWorld, null, lllllllllllllIIIllllllllIIlIllIl.getX(), lllllllllllllIIIllllllllIIlIllIl.getY(), lllllllllllllIIIllllllllIIlIllIl.getZ(), lllllllllllllIIIllllllllIIlIllIl.getStrength(), lllllllllllllIIIllllllllIIlIllIl.getAffectedBlockPositions());
        lllllllllllllIIIllllllllIIlIllll.doExplosionB((boolean)(NetHandlerPlayClient.lIlIIIIlllllll[17] != 0));
        final EntityPlayerSP thePlayer = this.gameController.thePlayer;
        thePlayer.motionX += lllllllllllllIIIllllllllIIlIllIl.func_149149_c();
        final EntityPlayerSP thePlayer2 = this.gameController.thePlayer;
        thePlayer2.motionY += lllllllllllllIIIllllllllIIlIllIl.func_149144_d();
        final EntityPlayerSP thePlayer3 = this.gameController.thePlayer;
        thePlayer3.motionZ += lllllllllllllIIIllllllllIIlIllIl.func_149147_e();
    }
    
    private static boolean lllIIIlIIlIIIll(final int lllllllllllllIIIllllllIIllIIlIIl, final int lllllllllllllIIIllllllIIllIIlIII) {
        return lllllllllllllIIIllllllIIllIIlIIl == lllllllllllllIIIllllllIIllIIlIII;
    }
    
    private static boolean lllIIIlIIllIIIl(final Object lllllllllllllIIIllllllIIlIllllIl, final Object lllllllllllllIIIllllllIIlIllllII) {
        return lllllllllllllIIIllllllIIlIllllIl != lllllllllllllIIIllllllIIlIllllII;
    }
    
    private static boolean lllIIIlIIlIlIlI(final int lllllllllllllIIIllllllIIlIlIllII) {
        return lllllllllllllIIIllllllIIlIlIllII < 0;
    }
    
    @Override
    public void handleMapChunkBulk(final S26PacketMapChunkBulk lllllllllllllIIIlllllllIlIlIIlII) {
        PacketThreadUtil.checkThreadAndEnqueue((Packet<NetHandlerPlayClient>)lllllllllllllIIIlllllllIlIlIIlII, this, this.gameController);
        int lllllllllllllIIIlllllllIlIlIlIIl = NetHandlerPlayClient.lIlIIIIlllllll[1];
        "".length();
        if ("   ".length() < " ".length()) {
            return;
        }
        while (!lllIIIlIIlIIllI(lllllllllllllIIIlllllllIlIlIlIIl, lllllllllllllIIIlllllllIlIlIIlII.getChunkCount())) {
            final int lllllllllllllIIIlllllllIlIlIlIII = lllllllllllllIIIlllllllIlIlIIlII.getChunkX(lllllllllllllIIIlllllllIlIlIlIIl);
            final int lllllllllllllIIIlllllllIlIlIIlll = lllllllllllllIIIlllllllIlIlIIlII.getChunkZ(lllllllllllllIIIlllllllIlIlIlIIl);
            this.clientWorldController.doPreChunk(lllllllllllllIIIlllllllIlIlIlIII, lllllllllllllIIIlllllllIlIlIIlll, (boolean)(NetHandlerPlayClient.lIlIIIIlllllll[17] != 0));
            this.clientWorldController.invalidateBlockReceiveRegion(lllllllllllllIIIlllllllIlIlIlIII << NetHandlerPlayClient.lIlIIIIlllllll[26], NetHandlerPlayClient.lIlIIIIlllllll[1], lllllllllllllIIIlllllllIlIlIIlll << NetHandlerPlayClient.lIlIIIIlllllll[26], (lllllllllllllIIIlllllllIlIlIlIII << NetHandlerPlayClient.lIlIIIIlllllll[26]) + NetHandlerPlayClient.lIlIIIIlllllll[27], NetHandlerPlayClient.lIlIIIIlllllll[28], (lllllllllllllIIIlllllllIlIlIIlll << NetHandlerPlayClient.lIlIIIIlllllll[26]) + NetHandlerPlayClient.lIlIIIIlllllll[27]);
            final Chunk lllllllllllllIIIlllllllIlIlIIllI = this.clientWorldController.getChunkFromChunkCoords(lllllllllllllIIIlllllllIlIlIlIII, lllllllllllllIIIlllllllIlIlIIlll);
            lllllllllllllIIIlllllllIlIlIIllI.fillChunk(lllllllllllllIIIlllllllIlIlIIlII.getChunkBytes(lllllllllllllIIIlllllllIlIlIlIIl), lllllllllllllIIIlllllllIlIlIIlII.getChunkSize(lllllllllllllIIIlllllllIlIlIlIIl), (boolean)(NetHandlerPlayClient.lIlIIIIlllllll[17] != 0));
            this.clientWorldController.markBlockRangeForRenderUpdate(lllllllllllllIIIlllllllIlIlIlIII << NetHandlerPlayClient.lIlIIIIlllllll[26], NetHandlerPlayClient.lIlIIIIlllllll[1], lllllllllllllIIIlllllllIlIlIIlll << NetHandlerPlayClient.lIlIIIIlllllll[26], (lllllllllllllIIIlllllllIlIlIlIII << NetHandlerPlayClient.lIlIIIIlllllll[26]) + NetHandlerPlayClient.lIlIIIIlllllll[27], NetHandlerPlayClient.lIlIIIIlllllll[28], (lllllllllllllIIIlllllllIlIlIIlll << NetHandlerPlayClient.lIlIIIIlllllll[26]) + NetHandlerPlayClient.lIlIIIIlllllll[27]);
            if (lllIIIlIIlIlIII((this.clientWorldController.provider instanceof WorldProviderSurface) ? 1 : 0)) {
                lllllllllllllIIIlllllllIlIlIIllI.resetRelightChecks();
            }
            ++lllllllllllllIIIlllllllIlIlIlIIl;
        }
    }
    
    @Override
    public void handleUpdateTileEntity(final S35PacketUpdateTileEntity lllllllllllllIIIlllllllIllIlllII) {
        PacketThreadUtil.checkThreadAndEnqueue((Packet<NetHandlerPlayClient>)lllllllllllllIIIlllllllIllIlllII, this, this.gameController);
        if (lllIIIlIIlIIlII(this.gameController.theWorld.isBlockLoaded(lllllllllllllIIIlllllllIllIlllII.getPos()) ? 1 : 0)) {
            final TileEntity lllllllllllllIIIlllllllIllIllIll = this.gameController.theWorld.getTileEntity(lllllllllllllIIIlllllllIllIlllII.getPos());
            final int lllllllllllllIIIlllllllIllIllIlI = lllllllllllllIIIlllllllIllIlllII.getTileEntityType();
            if ((lllIIIlIIlIIIll(lllllllllllllIIIlllllllIllIllIlI, NetHandlerPlayClient.lIlIIIIlllllll[17]) && !lllIIIlIIlIlIII((lllllllllllllIIIlllllllIllIllIll instanceof TileEntityMobSpawner) ? 1 : 0)) || (lllIIIlIIlIIIll(lllllllllllllIIIlllllllIllIllIlI, NetHandlerPlayClient.lIlIIIIlllllll[21]) && !lllIIIlIIlIlIII((lllllllllllllIIIlllllllIllIllIll instanceof TileEntityCommandBlock) ? 1 : 0)) || (lllIIIlIIlIIIll(lllllllllllllIIIlllllllIllIllIlI, NetHandlerPlayClient.lIlIIIIlllllll[25]) && !lllIIIlIIlIlIII((lllllllllllllIIIlllllllIllIllIll instanceof TileEntityBeacon) ? 1 : 0)) || (lllIIIlIIlIIIll(lllllllllllllIIIlllllllIllIllIlI, NetHandlerPlayClient.lIlIIIIlllllll[26]) && !lllIIIlIIlIlIII((lllllllllllllIIIlllllllIllIllIll instanceof TileEntitySkull) ? 1 : 0)) || (lllIIIlIIlIIIll(lllllllllllllIIIlllllllIllIllIlI, NetHandlerPlayClient.lIlIIIIlllllll[29]) && !lllIIIlIIlIlIII((lllllllllllllIIIlllllllIllIllIll instanceof TileEntityFlowerPot) ? 1 : 0)) || (lllIIIlIIlIIIll(lllllllllllllIIIlllllllIllIllIlI, NetHandlerPlayClient.lIlIIIIlllllll[30]) && lllIIIlIIlIIlII((lllllllllllllIIIlllllllIllIllIll instanceof TileEntityBanner) ? 1 : 0))) {
                lllllllllllllIIIlllllllIllIllIll.readFromNBT(lllllllllllllIIIlllllllIllIlllII.getNbtCompound());
            }
        }
    }
    
    public NetworkPlayerInfo getPlayerInfo(final String lllllllllllllIIIllllllIlIIIlIIlI) {
        final byte lllllllllllllIIIllllllIlIIIIllIl = (byte)this.playerInfoMap.values().iterator();
        "".length();
        if ("  ".length() < ((0x64 ^ 0x73 ^ (0x2D ^ 0x30)) & (0x31 ^ 0x4D ^ (0x7F ^ 0x9) ^ -" ".length()))) {
            return null;
        }
        while (!lllIIIlIIlIlIII(((Iterator)lllllllllllllIIIllllllIlIIIIllIl).hasNext() ? 1 : 0)) {
            final NetworkPlayerInfo lllllllllllllIIIllllllIlIIIlIIIl = ((Iterator<NetworkPlayerInfo>)lllllllllllllIIIllllllIlIIIIllIl).next();
            if (lllIIIlIIlIIlII(lllllllllllllIIIllllllIlIIIlIIIl.getGameProfile().getName().equals(lllllllllllllIIIllllllIlIIIlIIlI) ? 1 : 0)) {
                return lllllllllllllIIIllllllIlIIIlIIIl;
            }
        }
        return null;
    }
    
    @Override
    public void handleBlockAction(final S24PacketBlockAction lllllllllllllIIIlllllllIlIlllIlI) {
        PacketThreadUtil.checkThreadAndEnqueue((Packet<NetHandlerPlayClient>)lllllllllllllIIIlllllllIlIlllIlI, this, this.gameController);
        this.gameController.theWorld.addBlockEvent(lllllllllllllIIIlllllllIlIlllIlI.getBlockPosition(), lllllllllllllIIIlllllllIlIlllIlI.getBlockType(), lllllllllllllIIIlllllllIlIlllIlI.getData1(), lllllllllllllIIIlllllllIlIlllIlI.getData2());
    }
    
    private static int lllIIIlIIlIllll(final float n, final float n2) {
        return fcmpl(n, n2);
    }
    
    private static boolean lllIIIlIIlIIlll(final int lllllllllllllIIIllllllIIlIlIlIlI) {
        return lllllllllllllIIIllllllIIlIlIlIlI > 0;
    }
    
    private static int lllIIIlIIlIlIIl(final double n, final double n2) {
        return dcmpg(n, n2);
    }
    
    @Override
    public void handleEntityEquipment(final S04PacketEntityEquipment lllllllllllllIIIlllllllIllIIIlIl) {
        PacketThreadUtil.checkThreadAndEnqueue((Packet<NetHandlerPlayClient>)lllllllllllllIIIlllllllIllIIIlIl, this, this.gameController);
        final Entity lllllllllllllIIIlllllllIllIIIlll = this.clientWorldController.getEntityByID(lllllllllllllIIIlllllllIllIIIlIl.getEntityID());
        if (lllIIIlIIlIIlIl(lllllllllllllIIIlllllllIllIIIlll)) {
            lllllllllllllIIIlllllllIllIIIlll.setCurrentItemOrArmor(lllllllllllllIIIlllllllIllIIIlIl.getEquipmentSlot(), lllllllllllllIIIlllllllIllIIIlIl.getItemStack());
        }
    }
    
    static {
        lllIIIlIIlIIIlI();
        lllIIIIllllIllI();
        logger = LogManager.getLogger();
    }
    
    @Override
    public void handleWindowItems(final S30PacketWindowItems lllllllllllllIIIlllllllIlllllIll) {
        PacketThreadUtil.checkThreadAndEnqueue((Packet<NetHandlerPlayClient>)lllllllllllllIIIlllllllIlllllIll, this, this.gameController);
        final EntityPlayer lllllllllllllIIIlllllllIllllllIl = this.gameController.thePlayer;
        if (lllIIIlIIlIlIII(lllllllllllllIIIlllllllIlllllIll.func_148911_c())) {
            lllllllllllllIIIlllllllIllllllIl.inventoryContainer.putStacksInSlots(lllllllllllllIIIlllllllIlllllIll.getItemStacks());
            "".length();
            if ((0xAE ^ 0xAA) != (0x76 ^ 0x72)) {
                return;
            }
        }
        else if (lllIIIlIIlIIIll(lllllllllllllIIIlllllllIlllllIll.func_148911_c(), lllllllllllllIIIlllllllIllllllIl.openContainer.windowId)) {
            lllllllllllllIIIlllllllIllllllIl.openContainer.putStacksInSlots(lllllllllllllIIIlllllllIlllllIll.getItemStacks());
        }
    }
    
    private static String lllIIIIlllIlIll(final String lllllllllllllIIIllllllIIllIlIIIl, final String lllllllllllllIIIllllllIIllIIlllI) {
        try {
            final SecretKeySpec lllllllllllllIIIllllllIIllIlIlII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIIIllllllIIllIIlllI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lllllllllllllIIIllllllIIllIlIIll = Cipher.getInstance("Blowfish");
            lllllllllllllIIIllllllIIllIlIIll.init(NetHandlerPlayClient.lIlIIIIlllllll[21], lllllllllllllIIIllllllIIllIlIlII);
            return new String(lllllllllllllIIIllllllIIllIlIIll.doFinal(Base64.getDecoder().decode(lllllllllllllIIIllllllIIllIlIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIIllllllIIllIlIIlI) {
            lllllllllllllIIIllllllIIllIlIIlI.printStackTrace();
            return null;
        }
    }
    
    @Override
    public void handleResourcePack(final S48PacketResourcePackSend lllllllllllllIIIllllllIlllIIllll) {
        final String lllllllllllllIIIllllllIlllIIlllI = lllllllllllllIIIllllllIlllIIllll.getURL();
        final String lllllllllllllIIIllllllIlllIIllIl = lllllllllllllIIIllllllIlllIIllll.getHash();
        if (lllIIIlIIlIIlII(lllllllllllllIIIllllllIlllIIlllI.startsWith(NetHandlerPlayClient.lIlIIIIllIIlII[NetHandlerPlayClient.lIlIIIIlllllll[31]]) ? 1 : 0)) {
            final String lllllllllllllIIIllllllIlllIIllII = lllllllllllllIIIllllllIlllIIlllI.substring(NetHandlerPlayClient.lIlIIIIllIIlII[NetHandlerPlayClient.lIlIIIIlllllll[47]].length());
            final File lllllllllllllIIIllllllIlllIIlIll = new File(this.gameController.mcDataDir, NetHandlerPlayClient.lIlIIIIllIIlII[NetHandlerPlayClient.lIlIIIIlllllll[48]]);
            final File lllllllllllllIIIllllllIlllIIlIlI = new File(lllllllllllllIIIllllllIlllIIlIll, lllllllllllllIIIllllllIlllIIllII);
            if (lllIIIlIIlIIlII(lllllllllllllIIIllllllIlllIIlIlI.isFile() ? 1 : 0)) {
                this.netManager.sendPacket(new C19PacketResourcePackStatus(lllllllllllllIIIllllllIlllIIllIl, C19PacketResourcePackStatus.Action.ACCEPTED));
                Futures.addCallback((ListenableFuture)this.gameController.getResourcePackRepository().setResourcePackInstance(lllllllllllllIIIllllllIlllIIlIlI), (FutureCallback)new FutureCallback<Object>() {
                    public void onSuccess(final Object lllllllllllllIlIlIIlIIIlllIlIIIl) {
                        NetHandlerPlayClient.this.netManager.sendPacket(new C19PacketResourcePackStatus(lllllllllllllIIIllllllIlllIIllIl, C19PacketResourcePackStatus.Action.SUCCESSFULLY_LOADED));
                    }
                    
                    public void onFailure(final Throwable lllllllllllllIlIlIIlIIIlllIIllIl) {
                        NetHandlerPlayClient.this.netManager.sendPacket(new C19PacketResourcePackStatus(lllllllllllllIIIllllllIlllIIllIl, C19PacketResourcePackStatus.Action.FAILED_DOWNLOAD));
                    }
                });
                "".length();
                if ("   ".length() == 0) {
                    return;
                }
            }
            else {
                this.netManager.sendPacket(new C19PacketResourcePackStatus(lllllllllllllIIIllllllIlllIIllIl, C19PacketResourcePackStatus.Action.FAILED_DOWNLOAD));
                "".length();
                if (-"   ".length() > 0) {
                    return;
                }
            }
        }
        else if (lllIIIlIIlIIlIl(this.gameController.getCurrentServerData()) && lllIIIlIIllIIII(this.gameController.getCurrentServerData().getResourceMode(), ServerData.ServerResourceMode.ENABLED)) {
            this.netManager.sendPacket(new C19PacketResourcePackStatus(lllllllllllllIIIllllllIlllIIllIl, C19PacketResourcePackStatus.Action.ACCEPTED));
            Futures.addCallback((ListenableFuture)this.gameController.getResourcePackRepository().downloadResourcePack(lllllllllllllIIIllllllIlllIIlllI, lllllllllllllIIIllllllIlllIIllIl), (FutureCallback)new FutureCallback<Object>() {
                public void onSuccess(final Object lllllllllllllIIlIllIlIIIIIIIIIIl) {
                    NetHandlerPlayClient.this.netManager.sendPacket(new C19PacketResourcePackStatus(lllllllllllllIIIllllllIlllIIllIl, C19PacketResourcePackStatus.Action.SUCCESSFULLY_LOADED));
                }
                
                public void onFailure(final Throwable lllllllllllllIIlIllIIlllllllllIl) {
                    NetHandlerPlayClient.this.netManager.sendPacket(new C19PacketResourcePackStatus(lllllllllllllIIIllllllIlllIIllIl, C19PacketResourcePackStatus.Action.FAILED_DOWNLOAD));
                }
            });
            "".length();
            if ((112 + 70 - 127 + 83 ^ 81 + 139 - 160 + 82) != (0x5A ^ 0x22 ^ (0x73 ^ 0xF))) {
                return;
            }
        }
        else if (lllIIIlIIlIIlIl(this.gameController.getCurrentServerData()) && lllIIIlIIllIIIl(this.gameController.getCurrentServerData().getResourceMode(), ServerData.ServerResourceMode.PROMPT)) {
            this.netManager.sendPacket(new C19PacketResourcePackStatus(lllllllllllllIIIllllllIlllIIllIl, C19PacketResourcePackStatus.Action.DECLINED));
            "".length();
            if ("  ".length() <= ((0x28 ^ 0x3) & ~(0x43 ^ 0x68))) {
                return;
            }
        }
        else {
            this.gameController.addScheduledTask(new Runnable() {
                private static final /* synthetic */ int[] lIlllIIllIlllI;
                private static final /* synthetic */ String[] lIlllIIllIlIll;
                
                @Override
                public void run() {
                    NetHandlerPlayClient.this.gameController.displayGuiScreen(new GuiYesNo(new GuiYesNoCallback() {
                        private static boolean llIllIlIllIlIlI(final int lllllllllllllIIlIlIIIlIIlIIIlIIl) {
                            return lllllllllllllIIlIlIIIlIIlIIIlIIl != 0;
                        }
                        
                        @Override
                        public void confirmClicked(final boolean lllllllllllllIIlIlIIIlIIlIIIllll, final int lllllllllllllIIlIlIIIlIIlIIlIIIl) {
                            NetHandlerPlayClient.access$4(NetHandlerPlayClient.this, Minecraft.getMinecraft());
                            if (llIllIlIllIlIlI(lllllllllllllIIlIlIIIlIIlIIIllll ? 1 : 0)) {
                                if (llIllIlIllIlIll(NetHandlerPlayClient.this.gameController.getCurrentServerData())) {
                                    NetHandlerPlayClient.this.gameController.getCurrentServerData().setResourceMode(ServerData.ServerResourceMode.ENABLED);
                                }
                                NetHandlerPlayClient.this.netManager.sendPacket(new C19PacketResourcePackStatus(lllllllllllllIIIllllllIlllIIllIl, C19PacketResourcePackStatus.Action.ACCEPTED));
                                Futures.addCallback((ListenableFuture)NetHandlerPlayClient.this.gameController.getResourcePackRepository().downloadResourcePack(lllllllllllllIIIllllllIlllIIlllI, lllllllllllllIIIllllllIlllIIllIl), (FutureCallback)new FutureCallback<Object>() {
                                    public void onSuccess(final Object lllllllllllllIIIlIIlIIllIIIIlIII) {
                                        NetHandlerPlayClient.this.netManager.sendPacket(new C19PacketResourcePackStatus(lllllllllllllIIIllllllIlllIIllIl, C19PacketResourcePackStatus.Action.SUCCESSFULLY_LOADED));
                                    }
                                    
                                    public void onFailure(final Throwable lllllllllllllIIIlIIlIIllIIIIIlII) {
                                        NetHandlerPlayClient.this.netManager.sendPacket(new C19PacketResourcePackStatus(lllllllllllllIIIllllllIlllIIllIl, C19PacketResourcePackStatus.Action.FAILED_DOWNLOAD));
                                    }
                                });
                                "".length();
                                if (null != null) {
                                    return;
                                }
                            }
                            else {
                                if (llIllIlIllIlIll(NetHandlerPlayClient.this.gameController.getCurrentServerData())) {
                                    NetHandlerPlayClient.this.gameController.getCurrentServerData().setResourceMode(ServerData.ServerResourceMode.DISABLED);
                                }
                                NetHandlerPlayClient.this.netManager.sendPacket(new C19PacketResourcePackStatus(lllllllllllllIIIllllllIlllIIllIl, C19PacketResourcePackStatus.Action.DECLINED));
                            }
                            ServerList.func_147414_b(NetHandlerPlayClient.this.gameController.getCurrentServerData());
                            NetHandlerPlayClient.this.gameController.displayGuiScreen(null);
                        }
                        
                        private static boolean llIllIlIllIlIll(final Object lllllllllllllIIlIlIIIlIIlIIIlIll) {
                            return lllllllllllllIIlIlIIIlIIlIIIlIll != null;
                        }
                    }, I18n.format(NetHandlerPlayClient$3.lIlllIIllIlIll[NetHandlerPlayClient$3.lIlllIIllIlllI[0]], new Object[NetHandlerPlayClient$3.lIlllIIllIlllI[0]]), I18n.format(NetHandlerPlayClient$3.lIlllIIllIlIll[NetHandlerPlayClient$3.lIlllIIllIlllI[1]], new Object[NetHandlerPlayClient$3.lIlllIIllIlllI[0]]), NetHandlerPlayClient$3.lIlllIIllIlllI[0]));
                }
                
                private static String lIIIIIlIIIIIllll(final String llllllllllllIlllllIIlIllllllIIII, final String llllllllllllIlllllIIlIlllllIllll) {
                    try {
                        final SecretKeySpec llllllllllllIlllllIIlIllllllIIll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIlllllIIlIlllllIllll.getBytes(StandardCharsets.UTF_8)), NetHandlerPlayClient$3.lIlllIIllIlllI[3]), "DES");
                        final Cipher llllllllllllIlllllIIlIllllllIIlI = Cipher.getInstance("DES");
                        llllllllllllIlllllIIlIllllllIIlI.init(NetHandlerPlayClient$3.lIlllIIllIlllI[2], llllllllllllIlllllIIlIllllllIIll);
                        return new String(llllllllllllIlllllIIlIllllllIIlI.doFinal(Base64.getDecoder().decode(llllllllllllIlllllIIlIllllllIIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
                    }
                    catch (Exception llllllllllllIlllllIIlIllllllIIIl) {
                        llllllllllllIlllllIIlIllllllIIIl.printStackTrace();
                        return null;
                    }
                }
                
                private static void lIIIIIlIIIIlIIIl() {
                    (lIlllIIllIlIll = new String[NetHandlerPlayClient$3.lIlllIIllIlllI[2]])[NetHandlerPlayClient$3.lIlllIIllIlllI[0]] = lIIIIIlIIIIIllll("dy22rk63kYaxR3dVvJTuUaL411PflC9QWIb0y6qa+Y4=", "ivehh");
                    NetHandlerPlayClient$3.lIlllIIllIlIll[NetHandlerPlayClient$3.lIlllIIllIlllI[1]] = lIIIIIlIIIIlIIII("ID4IOC89JwU1Iz9lECk+OT4WKRY/JAk8MmMnDSIjfw==", "MKdLF");
                }
                
                private static String lIIIIIlIIIIlIIII(String llllllllllllIlllllIIlIllllIllIll, final String llllllllllllIlllllIIlIllllIllIlI) {
                    llllllllllllIlllllIIlIllllIllIll = (float)new String(Base64.getDecoder().decode(((String)llllllllllllIlllllIIlIllllIllIll).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
                    final StringBuilder llllllllllllIlllllIIlIllllIllllI = new StringBuilder();
                    final char[] llllllllllllIlllllIIlIllllIlllIl = llllllllllllIlllllIIlIllllIllIlI.toCharArray();
                    int llllllllllllIlllllIIlIllllIlllII = NetHandlerPlayClient$3.lIlllIIllIlllI[0];
                    final boolean llllllllllllIlllllIIlIllllIlIllI = (Object)((String)llllllllllllIlllllIIlIllllIllIll).toCharArray();
                    final Exception llllllllllllIlllllIIlIllllIlIlIl = (Exception)llllllllllllIlllllIIlIllllIlIllI.length;
                    double llllllllllllIlllllIIlIllllIlIlII = NetHandlerPlayClient$3.lIlllIIllIlllI[0];
                    while (lIIIIIlIIIIlIlIl((int)llllllllllllIlllllIIlIllllIlIlII, (int)llllllllllllIlllllIIlIllllIlIlIl)) {
                        final char llllllllllllIlllllIIlIlllllIIIIl = llllllllllllIlllllIIlIllllIlIllI[llllllllllllIlllllIIlIllllIlIlII];
                        llllllllllllIlllllIIlIllllIllllI.append((char)(llllllllllllIlllllIIlIlllllIIIIl ^ llllllllllllIlllllIIlIllllIlllIl[llllllllllllIlllllIIlIllllIlllII % llllllllllllIlllllIIlIllllIlllIl.length]));
                        "".length();
                        ++llllllllllllIlllllIIlIllllIlllII;
                        ++llllllllllllIlllllIIlIllllIlIlII;
                        "".length();
                        if (-(0xFE ^ 0x98 ^ (0x6B ^ 0x8)) >= 0) {
                            return null;
                        }
                    }
                    return String.valueOf(llllllllllllIlllllIIlIllllIllllI);
                }
                
                static {
                    lIIIIIlIIIIlIlII();
                    lIIIIIlIIIIlIIIl();
                }
                
                private static boolean lIIIIIlIIIIlIlIl(final int llllllllllllIlllllIIlIllllIlIIII, final int llllllllllllIlllllIIlIllllIIllll) {
                    return llllllllllllIlllllIIlIllllIlIIII < llllllllllllIlllllIIlIllllIIllll;
                }
                
                private static void lIIIIIlIIIIlIlII() {
                    (lIlllIIllIlllI = new int[4])[0] = ((0xD8 ^ 0x8A ^ (0x7E ^ 0x1B)) & (117 + 219 - 166 + 75 ^ 162 + 100 - 222 + 154 ^ -" ".length()));
                    NetHandlerPlayClient$3.lIlllIIllIlllI[1] = " ".length();
                    NetHandlerPlayClient$3.lIlllIIllIlllI[2] = "  ".length();
                    NetHandlerPlayClient$3.lIlllIIllIlllI[3] = (0x5F ^ 0x38 ^ (0xFE ^ 0x91));
                }
            });
            "".length();
        }
    }
    
    @Override
    public void handleDestroyEntities(final S13PacketDestroyEntities lllllllllllllIIlIIIIIIIIIIIlIIIl) {
        PacketThreadUtil.checkThreadAndEnqueue((Packet<NetHandlerPlayClient>)lllllllllllllIIlIIIIIIIIIIIlIIIl, this, this.gameController);
        int lllllllllllllIIlIIIIIIIIIIIlIIII = NetHandlerPlayClient.lIlIIIIlllllll[1];
        "".length();
        if ("  ".length() <= -" ".length()) {
            return;
        }
        while (!lllIIIlIIlIIllI(lllllllllllllIIlIIIIIIIIIIIlIIII, lllllllllllllIIlIIIIIIIIIIIlIIIl.getEntityIDs().length)) {
            this.clientWorldController.removeEntityFromWorld(lllllllllllllIIlIIIIIIIIIIIlIIIl.getEntityIDs()[lllllllllllllIIlIIIIIIIIIIIlIIII]);
            "".length();
            ++lllllllllllllIIlIIIIIIIIIIIlIIII;
        }
    }
    
    @Override
    public void handleSpawnMob(final S0FPacketSpawnMob lllllllllllllIIIlllllllllIIIIllI) {
        PacketThreadUtil.checkThreadAndEnqueue((Packet<NetHandlerPlayClient>)lllllllllllllIIIlllllllllIIIIllI, this, this.gameController);
        final double lllllllllllllIIIlllllllllIIIIlIl = lllllllllllllIIIlllllllllIIIIllI.getX() / 32.0;
        final double lllllllllllllIIIlllllllllIIIIlII = lllllllllllllIIIlllllllllIIIIllI.getY() / 32.0;
        final double lllllllllllllIIIlllllllllIIIIIll = lllllllllllllIIIlllllllllIIIIllI.getZ() / 32.0;
        final float lllllllllllllIIIlllllllllIIIIIlI = lllllllllllllIIIlllllllllIIIIllI.getYaw() * NetHandlerPlayClient.lIlIIIIlllllll[24] / 256.0f;
        final float lllllllllllllIIIlllllllllIIIIIIl = lllllllllllllIIIlllllllllIIIIllI.getPitch() * NetHandlerPlayClient.lIlIIIIlllllll[24] / 256.0f;
        final EntityLivingBase lllllllllllllIIIlllllllllIIIIIII = (EntityLivingBase)EntityList.createEntityByID(lllllllllllllIIIlllllllllIIIIllI.getEntityType(), this.gameController.theWorld);
        lllllllllllllIIIlllllllllIIIIIII.serverPosX = lllllllllllllIIIlllllllllIIIIllI.getX();
        lllllllllllllIIIlllllllllIIIIIII.serverPosY = lllllllllllllIIIlllllllllIIIIllI.getY();
        lllllllllllllIIIlllllllllIIIIIII.serverPosZ = lllllllllllllIIIlllllllllIIIIllI.getZ();
        final EntityLivingBase entityLivingBase = lllllllllllllIIIlllllllllIIIIIII;
        final EntityLivingBase entityLivingBase2 = lllllllllllllIIIlllllllllIIIIIII;
        final float n = lllllllllllllIIIlllllllllIIIIllI.getHeadPitch() * NetHandlerPlayClient.lIlIIIIlllllll[24] / 256.0f;
        entityLivingBase2.rotationYawHead = n;
        entityLivingBase.renderYawOffset = n;
        final Entity[] lllllllllllllIIIllllllllIlllllll = lllllllllllllIIIlllllllllIIIIIII.getParts();
        if (lllIIIlIIlIIlIl(lllllllllllllIIIllllllllIlllllll)) {
            final int lllllllllllllIIIllllllllIllllllI = lllllllllllllIIIlllllllllIIIIllI.getEntityID() - lllllllllllllIIIlllllllllIIIIIII.getEntityId();
            int lllllllllllllIIIllllllllIlllllIl = NetHandlerPlayClient.lIlIIIIlllllll[1];
            "".length();
            if (" ".length() >= (0x30 ^ 0x34)) {
                return;
            }
            while (!lllIIIlIIlIIllI(lllllllllllllIIIllllllllIlllllIl, lllllllllllllIIIllllllllIlllllll.length)) {
                lllllllllllllIIIllllllllIlllllll[lllllllllllllIIIllllllllIlllllIl].setEntityId(lllllllllllllIIIllllllllIlllllll[lllllllllllllIIIllllllllIlllllIl].getEntityId() + lllllllllllllIIIllllllllIllllllI);
                ++lllllllllllllIIIllllllllIlllllIl;
            }
        }
        lllllllllllllIIIlllllllllIIIIIII.setEntityId(lllllllllllllIIIlllllllllIIIIllI.getEntityID());
        lllllllllllllIIIlllllllllIIIIIII.setPositionAndRotation(lllllllllllllIIIlllllllllIIIIlIl, lllllllllllllIIIlllllllllIIIIlII, lllllllllllllIIIlllllllllIIIIIll, lllllllllllllIIIlllllllllIIIIIlI, lllllllllllllIIIlllllllllIIIIIIl);
        lllllllllllllIIIlllllllllIIIIIII.motionX = lllllllllllllIIIlllllllllIIIIllI.getVelocityX() / 8000.0f;
        lllllllllllllIIIlllllllllIIIIIII.motionY = lllllllllllllIIIlllllllllIIIIllI.getVelocityY() / 8000.0f;
        lllllllllllllIIIlllllllllIIIIIII.motionZ = lllllllllllllIIIlllllllllIIIIllI.getVelocityZ() / 8000.0f;
        this.clientWorldController.addEntityToWorld(lllllllllllllIIIlllllllllIIIIllI.getEntityID(), lllllllllllllIIIlllllllllIIIIIII);
        final List<DataWatcher.WatchableObject> lllllllllllllIIIllllllllIlllllII = lllllllllllllIIIlllllllllIIIIllI.func_149027_c();
        if (lllIIIlIIlIIlIl(lllllllllllllIIIllllllllIlllllII)) {
            lllllllllllllIIIlllllllllIIIIIII.getDataWatcher().updateWatchedObjectsFromList(lllllllllllllIIIllllllllIlllllII);
        }
    }
    
    public NetHandlerPlayClient(final Minecraft lllllllllllllIIlIIIIIIIlIIlIIlII, final GuiScreen lllllllllllllIIlIIIIIIIlIIIllllI, final NetworkManager lllllllllllllIIlIIIIIIIlIIlIIIlI, final GameProfile lllllllllllllIIlIIIIIIIlIIlIIIIl) {
        this.playerInfoMap = (Map<UUID, NetworkPlayerInfo>)Maps.newHashMap();
        this.currentServerMaxPlayers = NetHandlerPlayClient.lIlIIIIlllllll[0];
        this.field_147308_k = (NetHandlerPlayClient.lIlIIIIlllllll[1] != 0);
        this.avRandomizer = new Random();
        this.gameController = lllllllllllllIIlIIIIIIIlIIlIIlII;
        this.guiScreenServer = lllllllllllllIIlIIIIIIIlIIIllllI;
        this.netManager = lllllllllllllIIlIIIIIIIlIIlIIIlI;
        this.profile = lllllllllllllIIlIIIIIIIlIIlIIIIl;
    }
    
    @Override
    public void handleEntityEffect(final S1DPacketEntityEffect lllllllllllllIIIlllllllIIlIllIll) {
        PacketThreadUtil.checkThreadAndEnqueue((Packet<NetHandlerPlayClient>)lllllllllllllIIIlllllllIIlIllIll, this, this.gameController);
        final Entity lllllllllllllIIIlllllllIIlIllllI = this.clientWorldController.getEntityByID(lllllllllllllIIIlllllllIIlIllIll.getEntityId());
        if (lllIIIlIIlIIlII((lllllllllllllIIIlllllllIIlIllllI instanceof EntityLivingBase) ? 1 : 0)) {
            final PotionEffect lllllllllllllIIIlllllllIIlIlllIl = new PotionEffect(lllllllllllllIIIlllllllIIlIllIll.getEffectId(), lllllllllllllIIIlllllllIIlIllIll.getDuration(), lllllllllllllIIIlllllllIIlIllIll.getAmplifier(), (boolean)(NetHandlerPlayClient.lIlIIIIlllllll[1] != 0), lllllllllllllIIIlllllllIIlIllIll.func_179707_f());
            lllllllllllllIIIlllllllIIlIlllIl.setPotionDurationMax(lllllllllllllIIIlllllllIIlIllIll.func_149429_c());
            ((EntityLivingBase)lllllllllllllIIIlllllllIIlIllllI).addPotionEffect(lllllllllllllIIIlllllllIIlIlllIl);
        }
    }
    
    @Override
    public void handleSetSlot(final S2FPacketSetSlot lllllllllllllIIIllllllllIIIlIIlI) {
        PacketThreadUtil.checkThreadAndEnqueue((Packet<NetHandlerPlayClient>)lllllllllllllIIIllllllllIIIlIIlI, this, this.gameController);
        final EntityPlayer lllllllllllllIIIllllllllIIIlIlll = this.gameController.thePlayer;
        if (lllIIIlIIlIIIll(lllllllllllllIIIllllllllIIIlIIlI.func_149175_c(), NetHandlerPlayClient.lIlIIIIlllllll[35])) {
            lllllllllllllIIIllllllllIIIlIlll.inventory.setItemStack(lllllllllllllIIIllllllllIIIlIIlI.func_149174_e());
            "".length();
            if (-" ".length() == ((((0x1D ^ 0x3E) & ~(0x62 ^ 0x41)) ^ (0x9D ^ 0xAA)) & (0x23 ^ 0x7 ^ (0x44 ^ 0x57) ^ -" ".length()))) {
                return;
            }
        }
        else {
            boolean lllllllllllllIIIllllllllIIIlIllI = NetHandlerPlayClient.lIlIIIIlllllll[1] != 0;
            if (lllIIIlIIlIIlII((this.gameController.currentScreen instanceof GuiContainerCreative) ? 1 : 0)) {
                final GuiContainerCreative lllllllllllllIIIllllllllIIIlIlIl = (GuiContainerCreative)this.gameController.currentScreen;
                int n;
                if (lllIIIlIIlIlllI(lllllllllllllIIIllllllllIIIlIlIl.getSelectedTabIndex(), CreativeTabs.tabInventory.getTabIndex())) {
                    n = NetHandlerPlayClient.lIlIIIIlllllll[17];
                    "".length();
                    if ("   ".length() == (14 + 113 - 80 + 115 ^ 11 + 23 - 11 + 143)) {
                        return;
                    }
                }
                else {
                    n = NetHandlerPlayClient.lIlIIIIlllllll[1];
                }
                lllllllllllllIIIllllllllIIIlIllI = (n != 0);
            }
            if (lllIIIlIIlIlIII(lllllllllllllIIIllllllllIIIlIIlI.func_149175_c()) && lllIIIlIIlIIllI(lllllllllllllIIIllllllllIIIlIIlI.func_149173_d(), NetHandlerPlayClient.lIlIIIIlllllll[36]) && lllIIIlIIlIllII(lllllllllllllIIIllllllllIIIlIIlI.func_149173_d(), NetHandlerPlayClient.lIlIIIIlllllll[37])) {
                final ItemStack lllllllllllllIIIllllllllIIIlIlII = lllllllllllllIIIllllllllIIIlIlll.inventoryContainer.getSlot(lllllllllllllIIIllllllllIIIlIIlI.func_149173_d()).getStack();
                if (lllIIIlIIlIIlIl(lllllllllllllIIIllllllllIIIlIIlI.func_149174_e()) && (!lllIIIlIIlIIlIl(lllllllllllllIIIllllllllIIIlIlII) || lllIIIlIIlIllII(lllllllllllllIIIllllllllIIIlIlII.stackSize, lllllllllllllIIIllllllllIIIlIIlI.func_149174_e().stackSize))) {
                    lllllllllllllIIIllllllllIIIlIIlI.func_149174_e().animationsToGo = NetHandlerPlayClient.lIlIIIIlllllll[29];
                }
                lllllllllllllIIIllllllllIIIlIlll.inventoryContainer.putStackInSlot(lllllllllllllIIIllllllllIIIlIIlI.func_149173_d(), lllllllllllllIIIllllllllIIIlIIlI.func_149174_e());
                "".length();
                if (null != null) {
                    return;
                }
            }
            else if (lllIIIlIIlIIIll(lllllllllllllIIIllllllllIIIlIIlI.func_149175_c(), lllllllllllllIIIllllllllIIIlIlll.openContainer.windowId) && (!lllIIIlIIlIlIII(lllllllllllllIIIllllllllIIIlIIlI.func_149175_c()) || lllIIIlIIlIlIII(lllllllllllllIIIllllllllIIIlIllI ? 1 : 0))) {
                lllllllllllllIIIllllllllIIIlIlll.openContainer.putStackInSlot(lllllllllllllIIIllllllllIIIlIIlI.func_149173_d(), lllllllllllllIIIllllllllIIIlIIlI.func_149174_e());
            }
        }
    }
    
    private static void lllIIIIllllIllI() {
        (lIlIIIIllIIlII = new String[NetHandlerPlayClient.lIlIIIIlllllll[58]])[NetHandlerPlayClient.lIlIIIIlllllll[1]] = lllIIIIlllIlIll("UiagPtbsEIxdo4mXQAKDZw==", "SjXAS");
        NetHandlerPlayClient.lIlIIIIllIIlII[NetHandlerPlayClient.lIlIIIIlllllll[17]] = lllIIIIlllIllII("KSsEEBojLBIQAWMuGAAB", "MBwsu");
        NetHandlerPlayClient.lIlIIIIllIIlII[NetHandlerPlayClient.lIlIIIIlllllll[21]] = lllIIIIlllIlIll("KSnNqrJKcd9DggUeesm+OA==", "lExOg");
        NetHandlerPlayClient.lIlIIIIllIIlII[NetHandlerPlayClient.lIlIIIIlllllll[25]] = lllIIIIlllIllII("Pg8kMQY0CDIxHXQKOCEd", "ZfWRi");
        NetHandlerPlayClient.lIlIIIIllIIlII[NetHandlerPlayClient.lIlIIIIlllllll[26]] = lllIIIIlllIllII("PA4UHjYjQRUIOw==", "NozzY");
        NetHandlerPlayClient.lIlIIIIllIIlII[NetHandlerPlayClient.lIlIIIIlllllll[29]] = lllIIIIlllIllIl("eDJwH5QtctKABYMPLU2Yig==", "wotvN");
        NetHandlerPlayClient.lIlIIIIllIIlII[NetHandlerPlayClient.lIlIIIIlllllll[30]] = lllIIIIlllIllII("FwEwPwNUASszGBscIQ==", "znEQw");
        NetHandlerPlayClient.lIlIIIIllIIlII[NetHandlerPlayClient.lIlIIIIlllllll[32]] = lllIIIIlllIlIll("iZHAZwkG58femRgVbvBgGC5Txe9RJlm0", "cnqcc");
        NetHandlerPlayClient.lIlIIIIllIIlII[NetHandlerPlayClient.lIlIIIIlllllll[33]] = lllIIIIlllIllII("KD0GEg43NQ4DVzM9BBsMIjEa", "EThwm");
        NetHandlerPlayClient.lIlIIIIllIIlII[NetHandlerPlayClient.lIlIIIIlllllll[34]] = lllIIIIlllIllII("CRY8DzY1MCcUMSk=", "LxHfB");
        NetHandlerPlayClient.lIlIIIIllIIlII[NetHandlerPlayClient.lIlIIIIlllllll[2]] = lllIIIIlllIllIl("TiDK/p0aJf80CzWpshlE/I+QERciM0KkRCHsFVjbd1Q=", "uvcna");
        NetHandlerPlayClient.lIlIIIIllIIlII[NetHandlerPlayClient.lIlIIIIlllllll[38]] = lllIIIIlllIlIll("GAMkDMEafpk=", "ZpKQl");
        NetHandlerPlayClient.lIlIIIIllIIlII[NetHandlerPlayClient.lIlIIIIlllllll[39]] = lllIIIIlllIllIl("ph+STKKigOk=", "HPnit");
        NetHandlerPlayClient.lIlIIIIllIIlII[NetHandlerPlayClient.lIlIIIIlllllll[40]] = lllIIIIlllIllII("AQoiJWYNCiM6ZggAOS8lAAE7", "eoOJH");
        NetHandlerPlayClient.lIlIIIIllIIlII[NetHandlerPlayClient.lIlIIIIlllllll[41]] = lllIIIIlllIllII("BicoDUUKJykSRQg3KBI=", "bBEbk");
        NetHandlerPlayClient.lIlIIIIllIIlII[NetHandlerPlayClient.lIlIIIIlllllll[27]] = lllIIIIlllIllIl("yEBq62FZQl20A5gfTSL4iFWokQEp3P9D", "dVCqX");
        NetHandlerPlayClient.lIlIIIIllIIlII[NetHandlerPlayClient.lIlIIIIlllllll[42]] = lllIIIIlllIllIl("7x5ib7/+s0+Qhbe3/YCuCF0pVsNinwLY", "kfhUp");
        NetHandlerPlayClient.lIlIIIIllIIlII[NetHandlerPlayClient.lIlIIIIlllllll[43]] = lllIIIIlllIllIl("Iu5S6W46ADkd5xojv01Y4uivfjwv0g/1", "PWjtE");
        NetHandlerPlayClient.lIlIIIIllIIlII[NetHandlerPlayClient.lIlIIIIlllllll[45]] = lllIIIIlllIllII("", "bvFWy");
        NetHandlerPlayClient.lIlIIIIllIIlII[NetHandlerPlayClient.lIlIIIIlllllll[46]] = lllIIIIlllIllIl("MyasHBNHTXE=", "YjZGw");
        NetHandlerPlayClient.lIlIIIIllIIlII[NetHandlerPlayClient.lIlIIIIlllllll[0]] = lllIIIIlllIlIll("g/oNUNN228U=", "OfuQt");
        NetHandlerPlayClient.lIlIIIIllIIlII[NetHandlerPlayClient.lIlIIIIlllllll[31]] = lllIIIIlllIllIl("3WhGOzocq6cwAB1JnuzqgA==", "YPBgw");
        NetHandlerPlayClient.lIlIIIIllIIlII[NetHandlerPlayClient.lIlIIIIlllllll[47]] = lllIIIIlllIllIl("1TzCFW7hb1obeNoRItOGkw==", "MRegB");
        NetHandlerPlayClient.lIlIIIIllIIlII[NetHandlerPlayClient.lIlIIIIlllllll[48]] = lllIIIIlllIllIl("iguNginke3k=", "jBVrE");
        NetHandlerPlayClient.lIlIIIIllIIlII[NetHandlerPlayClient.lIlIIIIlllllll[49]] = lllIIIIlllIlIll("E+C3MW0sAc58Coem6iQXhg==", "ganvO");
        NetHandlerPlayClient.lIlIIIIllIIlII[NetHandlerPlayClient.lIlIIIIlllllll[50]] = lllIIIIlllIlIll("smUTCzoTWgmIBYVIz7DEeDenDdM/XlvAecwFzlCa5js=", "sfybW");
        NetHandlerPlayClient.lIlIIIIllIIlII[NetHandlerPlayClient.lIlIIIIlllllll[51]] = lllIIIIlllIllII("Iio5JRcOByE=", "oiEge");
        NetHandlerPlayClient.lIlIIIIllIIlII[NetHandlerPlayClient.lIlIIIIlllllll[53]] = lllIIIIlllIlIll("NHttjbAM2rxrXaEPQf6NNg==", "XIIoh");
        NetHandlerPlayClient.lIlIIIIllIIlII[NetHandlerPlayClient.lIlIIIIlllllll[54]] = lllIIIIlllIlIll("oULi7jbGystmy4XQkEdDGWQRMWHiPwQDA1P4KaGlDfJgIN+oZQ/XQA==", "fUjqo");
        NetHandlerPlayClient.lIlIIIIllIIlII[NetHandlerPlayClient.lIlIIIIlllllll[55]] = lllIIIIlllIlIll("R8T+Nn+CV0vyjtlJkdJdeo5ReSpUO/s6jIevmCeYEiVli5Elz3QdqQ==", "FBxGI");
        NetHandlerPlayClient.lIlIIIIllIIlII[NetHandlerPlayClient.lIlIIIIlllllll[56]] = lllIIIIlllIllIl("gf2XFF9UmSvGFPD22+Yl6l8xLiM5Whx42R6rZJ2BJqROqfSPibKhajVwT5umjzyKCzhpnr6RSAeYquCu/hoFt0EQc/Z/VH1n", "vExEY");
        NetHandlerPlayClient.lIlIIIIllIIlII[NetHandlerPlayClient.lIlIIIIlllllll[57]] = lllIIIIlllIllIl("BUMsuhQc9rs=", "wuCTz");
    }
    
    private static boolean lllIIIlIIlIllIl(final Object lllllllllllllIIIllllllIIlIllIlII) {
        return lllllllllllllIIIllllllIIlIllIlII == null;
    }
    
    @Override
    public void handleCamera(final S43PacketCamera lllllllllllllIIIlllllllIIIlllIII) {
        PacketThreadUtil.checkThreadAndEnqueue((Packet<NetHandlerPlayClient>)lllllllllllllIIIlllllllIIIlllIII, this, this.gameController);
        final Entity lllllllllllllIIIlllllllIIIllIlll = lllllllllllllIIIlllllllIIIlllIII.getEntity(this.clientWorldController);
        if (lllIIIlIIlIIlIl(lllllllllllllIIIlllllllIIIllIlll)) {
            this.gameController.setRenderViewEntity(lllllllllllllIIIlllllllIIIllIlll);
        }
    }
    
    @Override
    public void handleRemoveEntityEffect(final S1EPacketRemoveEntityEffect lllllllllllllIIIlllllllIIIIIlIII) {
        PacketThreadUtil.checkThreadAndEnqueue((Packet<NetHandlerPlayClient>)lllllllllllllIIIlllllllIIIIIlIII, this, this.gameController);
        final Entity lllllllllllllIIIlllllllIIIIIlIlI = this.clientWorldController.getEntityByID(lllllllllllllIIIlllllllIIIIIlIII.getEntityId());
        if (lllIIIlIIlIIlII((lllllllllllllIIIlllllllIIIIIlIlI instanceof EntityLivingBase) ? 1 : 0)) {
            ((EntityLivingBase)lllllllllllllIIIlllllllIIIIIlIlI).removePotionEffectClient(lllllllllllllIIIlllllllIIIIIlIII.getEffectId());
        }
    }
    
    @Override
    public void handleWorldBorder(final S44PacketWorldBorder lllllllllllllIIIlllllllIIIllIIII) {
        PacketThreadUtil.checkThreadAndEnqueue((Packet<NetHandlerPlayClient>)lllllllllllllIIIlllllllIIIllIIII, this, this.gameController);
        lllllllllllllIIIlllllllIIIllIIII.func_179788_a(this.clientWorldController.getWorldBorder());
    }
    
    @Override
    public void handleHeldItemChange(final S09PacketHeldItemChange lllllllllllllIIlIIIIIIIIIllIIIII) {
        PacketThreadUtil.checkThreadAndEnqueue((Packet<NetHandlerPlayClient>)lllllllllllllIIlIIIIIIIIIllIIIII, this, this.gameController);
        if (lllIIIlIIlIlIll(lllllllllllllIIlIIIIIIIIIllIIIII.getHeldItemHotbarIndex()) && lllIIIlIIlIllII(lllllllllllllIIlIIIIIIIIIllIIIII.getHeldItemHotbarIndex(), InventoryPlayer.getHotbarSize())) {
            this.gameController.thePlayer.inventory.currentItem = lllllllllllllIIlIIIIIIIIIllIIIII.getHeldItemHotbarIndex();
        }
    }
    
    @Override
    public void handleEntityTeleport(final S18PacketEntityTeleport lllllllllllllIIlIIIIIIIIIllllllI) {
        PacketThreadUtil.checkThreadAndEnqueue((Packet<NetHandlerPlayClient>)lllllllllllllIIlIIIIIIIIIllllllI, this, this.gameController);
        final Entity lllllllllllllIIlIIIIIIIIIlllllIl = this.clientWorldController.getEntityByID(lllllllllllllIIlIIIIIIIIIllllllI.getEntityId());
        if (lllIIIlIIlIIlIl(lllllllllllllIIlIIIIIIIIIlllllIl)) {
            lllllllllllllIIlIIIIIIIIIlllllIl.serverPosX = lllllllllllllIIlIIIIIIIIIllllllI.getX();
            lllllllllllllIIlIIIIIIIIIlllllIl.serverPosY = lllllllllllllIIlIIIIIIIIIllllllI.getY();
            lllllllllllllIIlIIIIIIIIIlllllIl.serverPosZ = lllllllllllllIIlIIIIIIIIIllllllI.getZ();
            final double lllllllllllllIIlIIIIIIIIIlllllII = lllllllllllllIIlIIIIIIIIIlllllIl.serverPosX / 32.0;
            final double lllllllllllllIIlIIIIIIIIIllllIll = lllllllllllllIIlIIIIIIIIIlllllIl.serverPosY / 32.0;
            final double lllllllllllllIIlIIIIIIIIIllllIlI = lllllllllllllIIlIIIIIIIIIlllllIl.serverPosZ / 32.0;
            final float lllllllllllllIIlIIIIIIIIIllllIIl = lllllllllllllIIlIIIIIIIIIllllllI.getYaw() * NetHandlerPlayClient.lIlIIIIlllllll[24] / 256.0f;
            final float lllllllllllllIIlIIIIIIIIIllllIII = lllllllllllllIIlIIIIIIIIIllllllI.getPitch() * NetHandlerPlayClient.lIlIIIIlllllll[24] / 256.0f;
            if (lllIIIlIIlIlIlI(lllIIIlIIlIlIIl(Math.abs(lllllllllllllIIlIIIIIIIIIlllllIl.posX - lllllllllllllIIlIIIIIIIIIlllllII), 0.03125)) && lllIIIlIIlIlIlI(lllIIIlIIlIlIIl(Math.abs(lllllllllllllIIlIIIIIIIIIlllllIl.posY - lllllllllllllIIlIIIIIIIIIllllIll), 0.015625)) && lllIIIlIIlIlIlI(lllIIIlIIlIlIIl(Math.abs(lllllllllllllIIlIIIIIIIIIlllllIl.posZ - lllllllllllllIIlIIIIIIIIIllllIlI), 0.03125))) {
                lllllllllllllIIlIIIIIIIIIlllllIl.setPositionAndRotation2(lllllllllllllIIlIIIIIIIIIlllllIl.posX, lllllllllllllIIlIIIIIIIIIlllllIl.posY, lllllllllllllIIlIIIIIIIIIlllllIl.posZ, lllllllllllllIIlIIIIIIIIIllllIIl, lllllllllllllIIlIIIIIIIIIllllIII, NetHandlerPlayClient.lIlIIIIlllllll[25], (boolean)(NetHandlerPlayClient.lIlIIIIlllllll[17] != 0));
                "".length();
                if (((0xFF ^ 0x9F) & ~(0x7D ^ 0x1D)) != 0x0) {
                    return;
                }
            }
            else {
                lllllllllllllIIlIIIIIIIIIlllllIl.setPositionAndRotation2(lllllllllllllIIlIIIIIIIIIlllllII, lllllllllllllIIlIIIIIIIIIllllIll, lllllllllllllIIlIIIIIIIIIllllIlI, lllllllllllllIIlIIIIIIIIIllllIIl, lllllllllllllIIlIIIIIIIIIllllIII, NetHandlerPlayClient.lIlIIIIlllllll[25], (boolean)(NetHandlerPlayClient.lIlIIIIlllllll[17] != 0));
            }
            lllllllllllllIIlIIIIIIIIIlllllIl.onGround = lllllllllllllIIlIIIIIIIIIllllllI.getOnGround();
        }
    }
    
    @Override
    public void handleScoreboardObjective(final S3BPacketScoreboardObjective lllllllllllllIIIllllllIllIIlIllI) {
        PacketThreadUtil.checkThreadAndEnqueue((Packet<NetHandlerPlayClient>)lllllllllllllIIIllllllIllIIlIllI, this, this.gameController);
        final Scoreboard lllllllllllllIIIllllllIllIIllIlI = this.clientWorldController.getScoreboard();
        if (lllIIIlIIlIlIII(lllllllllllllIIIllllllIllIIlIllI.func_149338_e())) {
            final ScoreObjective lllllllllllllIIIllllllIllIIllIIl = lllllllllllllIIIllllllIllIIllIlI.addScoreObjective(lllllllllllllIIIllllllIllIIlIllI.func_149339_c(), IScoreObjectiveCriteria.DUMMY);
            lllllllllllllIIIllllllIllIIllIIl.setDisplayName(lllllllllllllIIIllllllIllIIlIllI.func_149337_d());
            lllllllllllllIIIllllllIllIIllIIl.setRenderType(lllllllllllllIIIllllllIllIIlIllI.func_179817_d());
            "".length();
            if ("   ".length() <= -" ".length()) {
                return;
            }
        }
        else {
            final ScoreObjective lllllllllllllIIIllllllIllIIllIII = lllllllllllllIIIllllllIllIIllIlI.getObjective(lllllllllllllIIIllllllIllIIlIllI.func_149339_c());
            if (lllIIIlIIlIIIll(lllllllllllllIIIllllllIllIIlIllI.func_149338_e(), NetHandlerPlayClient.lIlIIIIlllllll[17])) {
                lllllllllllllIIIllllllIllIIllIlI.removeObjective(lllllllllllllIIIllllllIllIIllIII);
                "".length();
                if ("   ".length() != "   ".length()) {
                    return;
                }
            }
            else if (lllIIIlIIlIIIll(lllllllllllllIIIllllllIllIIlIllI.func_149338_e(), NetHandlerPlayClient.lIlIIIIlllllll[21])) {
                lllllllllllllIIIllllllIllIIllIII.setDisplayName(lllllllllllllIIIllllllIllIIlIllI.func_149337_d());
                lllllllllllllIIIllllllIllIIllIII.setRenderType(lllllllllllllIIIllllllIllIIlIllI.func_179817_d());
            }
        }
    }
    
    @Override
    public void handleChunkData(final S21PacketChunkData lllllllllllllIIIllllllllllIlIIIl) {
        PacketThreadUtil.checkThreadAndEnqueue((Packet<NetHandlerPlayClient>)lllllllllllllIIIllllllllllIlIIIl, this, this.gameController);
        if (lllIIIlIIlIIlII(lllllllllllllIIIllllllllllIlIIIl.func_149274_i() ? 1 : 0)) {
            if (lllIIIlIIlIlIII(lllllllllllllIIIllllllllllIlIIIl.getExtractedSize())) {
                this.clientWorldController.doPreChunk(lllllllllllllIIIllllllllllIlIIIl.getChunkX(), lllllllllllllIIIllllllllllIlIIIl.getChunkZ(), (boolean)(NetHandlerPlayClient.lIlIIIIlllllll[1] != 0));
                return;
            }
            this.clientWorldController.doPreChunk(lllllllllllllIIIllllllllllIlIIIl.getChunkX(), lllllllllllllIIIllllllllllIlIIIl.getChunkZ(), (boolean)(NetHandlerPlayClient.lIlIIIIlllllll[17] != 0));
        }
        this.clientWorldController.invalidateBlockReceiveRegion(lllllllllllllIIIllllllllllIlIIIl.getChunkX() << NetHandlerPlayClient.lIlIIIIlllllll[26], NetHandlerPlayClient.lIlIIIIlllllll[1], lllllllllllllIIIllllllllllIlIIIl.getChunkZ() << NetHandlerPlayClient.lIlIIIIlllllll[26], (lllllllllllllIIIllllllllllIlIIIl.getChunkX() << NetHandlerPlayClient.lIlIIIIlllllll[26]) + NetHandlerPlayClient.lIlIIIIlllllll[27], NetHandlerPlayClient.lIlIIIIlllllll[28], (lllllllllllllIIIllllllllllIlIIIl.getChunkZ() << NetHandlerPlayClient.lIlIIIIlllllll[26]) + NetHandlerPlayClient.lIlIIIIlllllll[27]);
        final Chunk lllllllllllllIIIllllllllllIlIIll = this.clientWorldController.getChunkFromChunkCoords(lllllllllllllIIIllllllllllIlIIIl.getChunkX(), lllllllllllllIIIllllllllllIlIIIl.getChunkZ());
        lllllllllllllIIIllllllllllIlIIll.fillChunk(lllllllllllllIIIllllllllllIlIIIl.func_149272_d(), lllllllllllllIIIllllllllllIlIIIl.getExtractedSize(), lllllllllllllIIIllllllllllIlIIIl.func_149274_i());
        this.clientWorldController.markBlockRangeForRenderUpdate(lllllllllllllIIIllllllllllIlIIIl.getChunkX() << NetHandlerPlayClient.lIlIIIIlllllll[26], NetHandlerPlayClient.lIlIIIIlllllll[1], lllllllllllllIIIllllllllllIlIIIl.getChunkZ() << NetHandlerPlayClient.lIlIIIIlllllll[26], (lllllllllllllIIIllllllllllIlIIIl.getChunkX() << NetHandlerPlayClient.lIlIIIIlllllll[26]) + NetHandlerPlayClient.lIlIIIIlllllll[27], NetHandlerPlayClient.lIlIIIIlllllll[28], (lllllllllllllIIIllllllllllIlIIIl.getChunkZ() << NetHandlerPlayClient.lIlIIIIlllllll[26]) + NetHandlerPlayClient.lIlIIIIlllllll[27]);
        if (!lllIIIlIIlIIlII(lllllllllllllIIIllllllllllIlIIIl.func_149274_i() ? 1 : 0) || lllIIIlIIlIlIII((this.clientWorldController.provider instanceof WorldProviderSurface) ? 1 : 0)) {
            lllllllllllllIIIllllllllllIlIIll.resetRelightChecks();
        }
    }
    
    @Override
    public void handleEntityAttach(final S1BPacketEntityAttach lllllllllllllIIIllllllllIlIlIlll) {
        PacketThreadUtil.checkThreadAndEnqueue((Packet<NetHandlerPlayClient>)lllllllllllllIIIllllllllIlIlIlll, this, this.gameController);
        Entity lllllllllllllIIIllllllllIlIlllII = this.clientWorldController.getEntityByID(lllllllllllllIIIllllllllIlIlIlll.getEntityId());
        final Entity lllllllllllllIIIllllllllIlIllIll = this.clientWorldController.getEntityByID(lllllllllllllIIIllllllllIlIlIlll.getVehicleEntityId());
        if (lllIIIlIIlIlIII(lllllllllllllIIIllllllllIlIlIlll.getLeash())) {
            boolean lllllllllllllIIIllllllllIlIllIlI = NetHandlerPlayClient.lIlIIIIlllllll[1] != 0;
            if (lllIIIlIIlIIIll(lllllllllllllIIIllllllllIlIlIlll.getEntityId(), this.gameController.thePlayer.getEntityId())) {
                lllllllllllllIIIllllllllIlIlllII = this.gameController.thePlayer;
                if (lllIIIlIIlIIlII((lllllllllllllIIIllllllllIlIllIll instanceof EntityBoat) ? 1 : 0)) {
                    ((EntityBoat)lllllllllllllIIIllllllllIlIllIll).setIsBoatEmpty((boolean)(NetHandlerPlayClient.lIlIIIIlllllll[1] != 0));
                }
                int n;
                if (lllIIIlIIlIllIl(lllllllllllllIIIllllllllIlIlllII.ridingEntity) && lllIIIlIIlIIlIl(lllllllllllllIIIllllllllIlIllIll)) {
                    n = NetHandlerPlayClient.lIlIIIIlllllll[17];
                    "".length();
                    if (-" ".length() > "   ".length()) {
                        return;
                    }
                }
                else {
                    n = NetHandlerPlayClient.lIlIIIIlllllll[1];
                }
                lllllllllllllIIIllllllllIlIllIlI = (n != 0);
                "".length();
                if (" ".length() != " ".length()) {
                    return;
                }
            }
            else if (lllIIIlIIlIIlII((lllllllllllllIIIllllllllIlIllIll instanceof EntityBoat) ? 1 : 0)) {
                ((EntityBoat)lllllllllllllIIIllllllllIlIllIll).setIsBoatEmpty((boolean)(NetHandlerPlayClient.lIlIIIIlllllll[17] != 0));
            }
            if (lllIIIlIIlIllIl(lllllllllllllIIIllllllllIlIlllII)) {
                return;
            }
            lllllllllllllIIIllllllllIlIlllII.mountEntity(lllllllllllllIIIllllllllIlIllIll);
            if (lllIIIlIIlIIlII(lllllllllllllIIIllllllllIlIllIlI ? 1 : 0)) {
                final GameSettings lllllllllllllIIIllllllllIlIllIIl = this.gameController.gameSettings;
                final GuiIngame ingameGUI = this.gameController.ingameGUI;
                final String llllllllllllIlIllIlIIIIIllllIIll = NetHandlerPlayClient.lIlIIIIllIIlII[NetHandlerPlayClient.lIlIIIIlllllll[30]];
                final Object[] llllllllllllIlIllIlIIIIIllllIIII = new Object[NetHandlerPlayClient.lIlIIIIlllllll[17]];
                llllllllllllIlIllIlIIIIIllllIIII[NetHandlerPlayClient.lIlIIIIlllllll[1]] = GameSettings.getKeyDisplayString(lllllllllllllIIIllllllllIlIllIIl.keyBindSneak.getKeyCode());
                ingameGUI.setRecordPlaying(I18n.format(llllllllllllIlIllIlIIIIIllllIIll, llllllllllllIlIllIlIIIIIllllIIII), (boolean)(NetHandlerPlayClient.lIlIIIIlllllll[1] != 0));
                "".length();
                if ("   ".length() < " ".length()) {
                    return;
                }
            }
        }
        else if (lllIIIlIIlIIIll(lllllllllllllIIIllllllllIlIlIlll.getLeash(), NetHandlerPlayClient.lIlIIIIlllllll[17]) && lllIIIlIIlIIlII((lllllllllllllIIIllllllllIlIlllII instanceof EntityLiving) ? 1 : 0)) {
            if (lllIIIlIIlIIlIl(lllllllllllllIIIllllllllIlIllIll)) {
                ((EntityLiving)lllllllllllllIIIllllllllIlIlllII).setLeashedToEntity(lllllllllllllIIIllllllllIlIllIll, (boolean)(NetHandlerPlayClient.lIlIIIIlllllll[1] != 0));
                "".length();
                if ("   ".length() != "   ".length()) {
                    return;
                }
            }
            else {
                ((EntityLiving)lllllllllllllIIIllllllllIlIlllII).clearLeashed((boolean)(NetHandlerPlayClient.lIlIIIIlllllll[1] != 0), (boolean)(NetHandlerPlayClient.lIlIIIIlllllll[1] != 0));
            }
        }
    }
    
    @Override
    public void handleSpawnGlobalEntity(final S2CPacketSpawnGlobalEntity lllllllllllllIIlIIIIIIIIllIlllll) {
        PacketThreadUtil.checkThreadAndEnqueue((Packet<NetHandlerPlayClient>)lllllllllllllIIlIIIIIIIIllIlllll, this, this.gameController);
        final double lllllllllllllIIlIIIIIIIIlllIIlII = lllllllllllllIIlIIIIIIIIllIlllll.func_149051_d() / 32.0;
        final double lllllllllllllIIlIIIIIIIIlllIIIll = lllllllllllllIIlIIIIIIIIllIlllll.func_149050_e() / 32.0;
        final double lllllllllllllIIlIIIIIIIIlllIIIlI = lllllllllllllIIlIIIIIIIIllIlllll.func_149049_f() / 32.0;
        Entity lllllllllllllIIlIIIIIIIIlllIIIIl = null;
        if (lllIIIlIIlIIIll(lllllllllllllIIlIIIIIIIIllIlllll.func_149053_g(), NetHandlerPlayClient.lIlIIIIlllllll[17])) {
            lllllllllllllIIlIIIIIIIIlllIIIIl = new EntityLightningBolt(this.clientWorldController, lllllllllllllIIlIIIIIIIIlllIIlII, lllllllllllllIIlIIIIIIIIlllIIIll, lllllllllllllIIlIIIIIIIIlllIIIlI);
        }
        if (lllIIIlIIlIIlIl(lllllllllllllIIlIIIIIIIIlllIIIIl)) {
            lllllllllllllIIlIIIIIIIIlllIIIIl.serverPosX = lllllllllllllIIlIIIIIIIIllIlllll.func_149051_d();
            lllllllllllllIIlIIIIIIIIlllIIIIl.serverPosY = lllllllllllllIIlIIIIIIIIllIlllll.func_149050_e();
            lllllllllllllIIlIIIIIIIIlllIIIIl.serverPosZ = lllllllllllllIIlIIIIIIIIllIlllll.func_149049_f();
            lllllllllllllIIlIIIIIIIIlllIIIIl.rotationYaw = 0.0f;
            lllllllllllllIIlIIIIIIIIlllIIIIl.rotationPitch = 0.0f;
            lllllllllllllIIlIIIIIIIIlllIIIIl.setEntityId(lllllllllllllIIlIIIIIIIIllIlllll.func_149052_c());
            this.clientWorldController.addWeatherEffect(lllllllllllllIIlIIIIIIIIlllIIIIl);
            "".length();
        }
    }
    
    private static boolean lllIIIlIIllIIII(final Object lllllllllllllIIIllllllIIlIllIlll, final Object lllllllllllllIIIllllllIIlIllIllI) {
        return lllllllllllllIIIllllllIIlIllIlll == lllllllllllllIIIllllllIIlIllIllI;
    }
    
    @Override
    public void handleCombatEvent(final S42PacketCombatEvent lllllllllllllIIIlllllllIIlIlIIII) {
        PacketThreadUtil.checkThreadAndEnqueue((Packet<NetHandlerPlayClient>)lllllllllllllIIIlllllllIIlIlIIII, this, this.gameController);
        final Entity lllllllllllllIIIlllllllIIlIIllll = this.clientWorldController.getEntityByID(lllllllllllllIIIlllllllIIlIlIIII.field_179775_c);
        EntityLivingBase entityLivingBase;
        if (lllIIIlIIlIIlII((lllllllllllllIIIlllllllIIlIIllll instanceof EntityLivingBase) ? 1 : 0)) {
            entityLivingBase = (EntityLivingBase)lllllllllllllIIIlllllllIIlIIllll;
            "".length();
            if ((0x3D ^ 0x39) != (0x7 ^ 0x3)) {
                return;
            }
        }
        else {
            entityLivingBase = null;
        }
        final EntityLivingBase lllllllllllllIIIlllllllIIlIIlllI = entityLivingBase;
        if (lllIIIlIIllIIII(lllllllllllllIIIlllllllIIlIlIIII.eventType, S42PacketCombatEvent.Event.END_COMBAT)) {
            final long lllllllllllllIIIlllllllIIlIIllIl = NetHandlerPlayClient.lIlIIIIlllllll[44] * lllllllllllllIIIlllllllIIlIlIIII.field_179772_d / NetHandlerPlayClient.lIlIIIIlllllll[0];
            final MetadataCombat lllllllllllllIIIlllllllIIlIIllII = new MetadataCombat(this.gameController.thePlayer, lllllllllllllIIIlllllllIIlIIlllI);
            this.gameController.getTwitchStream().func_176026_a(lllllllllllllIIIlllllllIIlIIllII, 0L - lllllllllllllIIIlllllllIIlIIllIl, 0L);
            "".length();
            if ((0x3F ^ 0x44 ^ 80 + 69 - 118 + 96) < (126 + 139 - 163 + 80 ^ 84 + 69 - 130 + 155)) {
                return;
            }
        }
        else if (lllIIIlIIllIIII(lllllllllllllIIIlllllllIIlIlIIII.eventType, S42PacketCombatEvent.Event.ENTITY_DIED)) {
            final Entity lllllllllllllIIIlllllllIIlIIlIll = this.clientWorldController.getEntityByID(lllllllllllllIIIlllllllIIlIlIIII.field_179774_b);
            if (lllIIIlIIlIIlII((lllllllllllllIIIlllllllIIlIIlIll instanceof EntityPlayer) ? 1 : 0)) {
                final MetadataPlayerDeath lllllllllllllIIIlllllllIIlIIlIlI = new MetadataPlayerDeath((EntityLivingBase)lllllllllllllIIIlllllllIIlIIlIll, lllllllllllllIIIlllllllIIlIIlllI);
                lllllllllllllIIIlllllllIIlIIlIlI.func_152807_a(lllllllllllllIIIlllllllIIlIlIIII.deathMessage);
                this.gameController.getTwitchStream().func_152911_a(lllllllllllllIIIlllllllIIlIIlIlI, 0L);
            }
        }
    }
    
    @Override
    public void handleSpawnObject(final S0EPacketSpawnObject lllllllllllllIIlIIIIIIIIllllllIl) {
        PacketThreadUtil.checkThreadAndEnqueue((Packet<NetHandlerPlayClient>)lllllllllllllIIlIIIIIIIIllllllIl, this, this.gameController);
        final double lllllllllllllIIlIIIIIIIlIIIIIlll = lllllllllllllIIlIIIIIIIIllllllIl.getX() / 32.0;
        final double lllllllllllllIIlIIIIIIIlIIIIIllI = lllllllllllllIIlIIIIIIIIllllllIl.getY() / 32.0;
        final double lllllllllllllIIlIIIIIIIlIIIIIlIl = lllllllllllllIIlIIIIIIIIllllllIl.getZ() / 32.0;
        Entity lllllllllllllIIlIIIIIIIlIIIIIlII = null;
        if (lllIIIlIIlIIIll(lllllllllllllIIlIIIIIIIIllllllIl.getType(), NetHandlerPlayClient.lIlIIIIlllllll[2])) {
            lllllllllllllIIlIIIIIIIlIIIIIlII = EntityMinecart.func_180458_a(this.clientWorldController, lllllllllllllIIlIIIIIIIlIIIIIlll, lllllllllllllIIlIIIIIIIlIIIIIllI, lllllllllllllIIlIIIIIIIlIIIIIlIl, EntityMinecart.EnumMinecartType.byNetworkID(lllllllllllllIIlIIIIIIIIllllllIl.func_149009_m()));
            "".length();
            if (" ".length() == "   ".length()) {
                return;
            }
        }
        else if (lllIIIlIIlIIIll(lllllllllllllIIlIIIIIIIIllllllIl.getType(), NetHandlerPlayClient.lIlIIIIlllllll[3])) {
            final Entity lllllllllllllIIlIIIIIIIlIIIIIIll = this.clientWorldController.getEntityByID(lllllllllllllIIlIIIIIIIIllllllIl.func_149009_m());
            if (lllIIIlIIlIIlII((lllllllllllllIIlIIIIIIIlIIIIIIll instanceof EntityPlayer) ? 1 : 0)) {
                lllllllllllllIIlIIIIIIIlIIIIIlII = new EntityFishHook(this.clientWorldController, lllllllllllllIIlIIIIIIIlIIIIIlll, lllllllllllllIIlIIIIIIIlIIIIIllI, lllllllllllllIIlIIIIIIIlIIIIIlIl, (EntityPlayer)lllllllllllllIIlIIIIIIIlIIIIIIll);
            }
            lllllllllllllIIlIIIIIIIIllllllIl.func_149002_g(NetHandlerPlayClient.lIlIIIIlllllll[1]);
            "".length();
            if (" ".length() == ((0x7C ^ 0x39 ^ " ".length()) & (0x4C ^ 0x5A ^ (0xE8 ^ 0xBA) ^ -" ".length()))) {
                return;
            }
        }
        else if (lllIIIlIIlIIIll(lllllllllllllIIlIIIIIIIIllllllIl.getType(), NetHandlerPlayClient.lIlIIIIlllllll[4])) {
            lllllllllllllIIlIIIIIIIlIIIIIlII = new EntityArrow(this.clientWorldController, lllllllllllllIIlIIIIIIIlIIIIIlll, lllllllllllllIIlIIIIIIIlIIIIIllI, lllllllllllllIIlIIIIIIIlIIIIIlIl);
            "".length();
            if ((14 + 75 - 21 + 78 ^ 38 + 76 + 33 + 3) <= "  ".length()) {
                return;
            }
        }
        else if (lllIIIlIIlIIIll(lllllllllllllIIlIIIIIIIIllllllIl.getType(), NetHandlerPlayClient.lIlIIIIlllllll[5])) {
            lllllllllllllIIlIIIIIIIlIIIIIlII = new EntitySnowball(this.clientWorldController, lllllllllllllIIlIIIIIIIlIIIIIlll, lllllllllllllIIlIIIIIIIlIIIIIllI, lllllllllllllIIlIIIIIIIlIIIIIlIl);
            "".length();
            if (null != null) {
                return;
            }
        }
        else if (lllIIIlIIlIIIll(lllllllllllllIIlIIIIIIIIllllllIl.getType(), NetHandlerPlayClient.lIlIIIIlllllll[6])) {
            lllllllllllllIIlIIIIIIIlIIIIIlII = new EntityItemFrame(this.clientWorldController, new BlockPos(MathHelper.floor_double(lllllllllllllIIlIIIIIIIlIIIIIlll), MathHelper.floor_double(lllllllllllllIIlIIIIIIIlIIIIIllI), MathHelper.floor_double(lllllllllllllIIlIIIIIIIlIIIIIlIl)), EnumFacing.getHorizontal(lllllllllllllIIlIIIIIIIIllllllIl.func_149009_m()));
            lllllllllllllIIlIIIIIIIIllllllIl.func_149002_g(NetHandlerPlayClient.lIlIIIIlllllll[1]);
            "".length();
            if ("   ".length() < -" ".length()) {
                return;
            }
        }
        else if (lllIIIlIIlIIIll(lllllllllllllIIlIIIIIIIIllllllIl.getType(), NetHandlerPlayClient.lIlIIIIlllllll[7])) {
            lllllllllllllIIlIIIIIIIlIIIIIlII = new EntityLeashKnot(this.clientWorldController, new BlockPos(MathHelper.floor_double(lllllllllllllIIlIIIIIIIlIIIIIlll), MathHelper.floor_double(lllllllllllllIIlIIIIIIIlIIIIIllI), MathHelper.floor_double(lllllllllllllIIlIIIIIIIlIIIIIlIl)));
            lllllllllllllIIlIIIIIIIIllllllIl.func_149002_g(NetHandlerPlayClient.lIlIIIIlllllll[1]);
            "".length();
            if ((0xD ^ 0x38 ^ (0xB1 ^ 0x80)) == "   ".length()) {
                return;
            }
        }
        else if (lllIIIlIIlIIIll(lllllllllllllIIlIIIIIIIIllllllIl.getType(), NetHandlerPlayClient.lIlIIIIlllllll[8])) {
            lllllllllllllIIlIIIIIIIlIIIIIlII = new EntityEnderPearl(this.clientWorldController, lllllllllllllIIlIIIIIIIlIIIIIlll, lllllllllllllIIlIIIIIIIlIIIIIllI, lllllllllllllIIlIIIIIIIlIIIIIlIl);
            "".length();
            if (-" ".length() > (0xC ^ 0x8)) {
                return;
            }
        }
        else if (lllIIIlIIlIIIll(lllllllllllllIIlIIIIIIIIllllllIl.getType(), NetHandlerPlayClient.lIlIIIIlllllll[9])) {
            lllllllllllllIIlIIIIIIIlIIIIIlII = new EntityEnderEye(this.clientWorldController, lllllllllllllIIlIIIIIIIlIIIIIlll, lllllllllllllIIlIIIIIIIlIIIIIllI, lllllllllllllIIlIIIIIIIlIIIIIlIl);
            "".length();
            if (-" ".length() >= "  ".length()) {
                return;
            }
        }
        else if (lllIIIlIIlIIIll(lllllllllllllIIlIIIIIIIIllllllIl.getType(), NetHandlerPlayClient.lIlIIIIlllllll[10])) {
            lllllllllllllIIlIIIIIIIlIIIIIlII = new EntityFireworkRocket(this.clientWorldController, lllllllllllllIIlIIIIIIIlIIIIIlll, lllllllllllllIIlIIIIIIIlIIIIIllI, lllllllllllllIIlIIIIIIIlIIIIIlIl, null);
            "".length();
            if (null != null) {
                return;
            }
        }
        else if (lllIIIlIIlIIIll(lllllllllllllIIlIIIIIIIIllllllIl.getType(), NetHandlerPlayClient.lIlIIIIlllllll[11])) {
            lllllllllllllIIlIIIIIIIlIIIIIlII = new EntityLargeFireball(this.clientWorldController, lllllllllllllIIlIIIIIIIlIIIIIlll, lllllllllllllIIlIIIIIIIlIIIIIllI, lllllllllllllIIlIIIIIIIlIIIIIlIl, lllllllllllllIIlIIIIIIIIllllllIl.getSpeedX() / 8000.0, lllllllllllllIIlIIIIIIIIllllllIl.getSpeedY() / 8000.0, lllllllllllllIIlIIIIIIIIllllllIl.getSpeedZ() / 8000.0);
            lllllllllllllIIlIIIIIIIIllllllIl.func_149002_g(NetHandlerPlayClient.lIlIIIIlllllll[1]);
            "".length();
            if (-" ".length() >= "  ".length()) {
                return;
            }
        }
        else if (lllIIIlIIlIIIll(lllllllllllllIIlIIIIIIIIllllllIl.getType(), NetHandlerPlayClient.lIlIIIIlllllll[12])) {
            lllllllllllllIIlIIIIIIIlIIIIIlII = new EntitySmallFireball(this.clientWorldController, lllllllllllllIIlIIIIIIIlIIIIIlll, lllllllllllllIIlIIIIIIIlIIIIIllI, lllllllllllllIIlIIIIIIIlIIIIIlIl, lllllllllllllIIlIIIIIIIIllllllIl.getSpeedX() / 8000.0, lllllllllllllIIlIIIIIIIIllllllIl.getSpeedY() / 8000.0, lllllllllllllIIlIIIIIIIIllllllIl.getSpeedZ() / 8000.0);
            lllllllllllllIIlIIIIIIIIllllllIl.func_149002_g(NetHandlerPlayClient.lIlIIIIlllllll[1]);
            "".length();
            if (-" ".length() > "  ".length()) {
                return;
            }
        }
        else if (lllIIIlIIlIIIll(lllllllllllllIIlIIIIIIIIllllllIl.getType(), NetHandlerPlayClient.lIlIIIIlllllll[13])) {
            lllllllllllllIIlIIIIIIIlIIIIIlII = new EntityWitherSkull(this.clientWorldController, lllllllllllllIIlIIIIIIIlIIIIIlll, lllllllllllllIIlIIIIIIIlIIIIIllI, lllllllllllllIIlIIIIIIIlIIIIIlIl, lllllllllllllIIlIIIIIIIIllllllIl.getSpeedX() / 8000.0, lllllllllllllIIlIIIIIIIIllllllIl.getSpeedY() / 8000.0, lllllllllllllIIlIIIIIIIIllllllIl.getSpeedZ() / 8000.0);
            lllllllllllllIIlIIIIIIIIllllllIl.func_149002_g(NetHandlerPlayClient.lIlIIIIlllllll[1]);
            "".length();
            if ((16 + 71 - 31 + 91 ^ 83 + 45 - 45 + 67) <= 0) {
                return;
            }
        }
        else if (lllIIIlIIlIIIll(lllllllllllllIIlIIIIIIIIllllllIl.getType(), NetHandlerPlayClient.lIlIIIIlllllll[14])) {
            lllllllllllllIIlIIIIIIIlIIIIIlII = new EntityEgg(this.clientWorldController, lllllllllllllIIlIIIIIIIlIIIIIlll, lllllllllllllIIlIIIIIIIlIIIIIllI, lllllllllllllIIlIIIIIIIlIIIIIlIl);
            "".length();
            if (-(0x59 ^ 0x5C) >= 0) {
                return;
            }
        }
        else if (lllIIIlIIlIIIll(lllllllllllllIIlIIIIIIIIllllllIl.getType(), NetHandlerPlayClient.lIlIIIIlllllll[15])) {
            lllllllllllllIIlIIIIIIIlIIIIIlII = new EntityPotion(this.clientWorldController, lllllllllllllIIlIIIIIIIlIIIIIlll, lllllllllllllIIlIIIIIIIlIIIIIllI, lllllllllllllIIlIIIIIIIlIIIIIlIl, lllllllllllllIIlIIIIIIIIllllllIl.func_149009_m());
            lllllllllllllIIlIIIIIIIIllllllIl.func_149002_g(NetHandlerPlayClient.lIlIIIIlllllll[1]);
            "".length();
            if (((7 + 59 + 46 + 27 ^ 58 + 12 + 13 + 51) & (0x32 ^ 0x4F ^ (0x52 ^ 0x22) ^ -" ".length())) > " ".length()) {
                return;
            }
        }
        else if (lllIIIlIIlIIIll(lllllllllllllIIlIIIIIIIIllllllIl.getType(), NetHandlerPlayClient.lIlIIIIlllllll[16])) {
            lllllllllllllIIlIIIIIIIlIIIIIlII = new EntityExpBottle(this.clientWorldController, lllllllllllllIIlIIIIIIIlIIIIIlll, lllllllllllllIIlIIIIIIIlIIIIIllI, lllllllllllllIIlIIIIIIIlIIIIIlIl);
            lllllllllllllIIlIIIIIIIIllllllIl.func_149002_g(NetHandlerPlayClient.lIlIIIIlllllll[1]);
            "".length();
            if (-"  ".length() >= 0) {
                return;
            }
        }
        else if (lllIIIlIIlIIIll(lllllllllllllIIlIIIIIIIIllllllIl.getType(), NetHandlerPlayClient.lIlIIIIlllllll[17])) {
            lllllllllllllIIlIIIIIIIlIIIIIlII = new EntityBoat(this.clientWorldController, lllllllllllllIIlIIIIIIIlIIIIIlll, lllllllllllllIIlIIIIIIIlIIIIIllI, lllllllllllllIIlIIIIIIIlIIIIIlIl);
            "".length();
            if (" ".length() > "   ".length()) {
                return;
            }
        }
        else if (lllIIIlIIlIIIll(lllllllllllllIIlIIIIIIIIllllllIl.getType(), NetHandlerPlayClient.lIlIIIIlllllll[18])) {
            lllllllllllllIIlIIIIIIIlIIIIIlII = new EntityTNTPrimed(this.clientWorldController, lllllllllllllIIlIIIIIIIlIIIIIlll, lllllllllllllIIlIIIIIIIlIIIIIllI, lllllllllllllIIlIIIIIIIlIIIIIlIl, null);
            "".length();
            if ((0xAB ^ 0xAF) < -" ".length()) {
                return;
            }
        }
        else if (lllIIIlIIlIIIll(lllllllllllllIIlIIIIIIIIllllllIl.getType(), NetHandlerPlayClient.lIlIIIIlllllll[19])) {
            lllllllllllllIIlIIIIIIIlIIIIIlII = new EntityArmorStand(this.clientWorldController, lllllllllllllIIlIIIIIIIlIIIIIlll, lllllllllllllIIlIIIIIIIlIIIIIllI, lllllllllllllIIlIIIIIIIlIIIIIlIl);
            "".length();
            if ("   ".length() <= 0) {
                return;
            }
        }
        else if (lllIIIlIIlIIIll(lllllllllllllIIlIIIIIIIIllllllIl.getType(), NetHandlerPlayClient.lIlIIIIlllllll[20])) {
            lllllllllllllIIlIIIIIIIlIIIIIlII = new EntityEnderCrystal(this.clientWorldController, lllllllllllllIIlIIIIIIIlIIIIIlll, lllllllllllllIIlIIIIIIIlIIIIIllI, lllllllllllllIIlIIIIIIIlIIIIIlIl);
            "".length();
            if ("  ".length() != "  ".length()) {
                return;
            }
        }
        else if (lllIIIlIIlIIIll(lllllllllllllIIlIIIIIIIIllllllIl.getType(), NetHandlerPlayClient.lIlIIIIlllllll[21])) {
            lllllllllllllIIlIIIIIIIlIIIIIlII = new EntityItem(this.clientWorldController, lllllllllllllIIlIIIIIIIlIIIIIlll, lllllllllllllIIlIIIIIIIlIIIIIllI, lllllllllllllIIlIIIIIIIlIIIIIlIl);
            "".length();
            if ("  ".length() < " ".length()) {
                return;
            }
        }
        else if (lllIIIlIIlIIIll(lllllllllllllIIlIIIIIIIIllllllIl.getType(), NetHandlerPlayClient.lIlIIIIlllllll[22])) {
            lllllllllllllIIlIIIIIIIlIIIIIlII = new EntityFallingBlock(this.clientWorldController, lllllllllllllIIlIIIIIIIlIIIIIlll, lllllllllllllIIlIIIIIIIlIIIIIllI, lllllllllllllIIlIIIIIIIlIIIIIlIl, Block.getStateById(lllllllllllllIIlIIIIIIIIllllllIl.func_149009_m() & NetHandlerPlayClient.lIlIIIIlllllll[23]));
            lllllllllllllIIlIIIIIIIIllllllIl.func_149002_g(NetHandlerPlayClient.lIlIIIIlllllll[1]);
        }
        if (lllIIIlIIlIIlIl(lllllllllllllIIlIIIIIIIlIIIIIlII)) {
            lllllllllllllIIlIIIIIIIlIIIIIlII.serverPosX = lllllllllllllIIlIIIIIIIIllllllIl.getX();
            lllllllllllllIIlIIIIIIIlIIIIIlII.serverPosY = lllllllllllllIIlIIIIIIIIllllllIl.getY();
            lllllllllllllIIlIIIIIIIlIIIIIlII.serverPosZ = lllllllllllllIIlIIIIIIIIllllllIl.getZ();
            lllllllllllllIIlIIIIIIIlIIIIIlII.rotationPitch = lllllllllllllIIlIIIIIIIIllllllIl.getPitch() * NetHandlerPlayClient.lIlIIIIlllllll[24] / 256.0f;
            lllllllllllllIIlIIIIIIIlIIIIIlII.rotationYaw = lllllllllllllIIlIIIIIIIIllllllIl.getYaw() * NetHandlerPlayClient.lIlIIIIlllllll[24] / 256.0f;
            final Entity[] lllllllllllllIIlIIIIIIIlIIIIIIlI = lllllllllllllIIlIIIIIIIlIIIIIlII.getParts();
            if (lllIIIlIIlIIlIl(lllllllllllllIIlIIIIIIIlIIIIIIlI)) {
                final int lllllllllllllIIlIIIIIIIlIIIIIIIl = lllllllllllllIIlIIIIIIIIllllllIl.getEntityID() - lllllllllllllIIlIIIIIIIlIIIIIlII.getEntityId();
                int lllllllllllllIIlIIIIIIIlIIIIIIII = NetHandlerPlayClient.lIlIIIIlllllll[1];
                "".length();
                if (-" ".length() >= 0) {
                    return;
                }
                while (!lllIIIlIIlIIllI(lllllllllllllIIlIIIIIIIlIIIIIIII, lllllllllllllIIlIIIIIIIlIIIIIIlI.length)) {
                    lllllllllllllIIlIIIIIIIlIIIIIIlI[lllllllllllllIIlIIIIIIIlIIIIIIII].setEntityId(lllllllllllllIIlIIIIIIIlIIIIIIlI[lllllllllllllIIlIIIIIIIlIIIIIIII].getEntityId() + lllllllllllllIIlIIIIIIIlIIIIIIIl);
                    ++lllllllllllllIIlIIIIIIIlIIIIIIII;
                }
            }
            lllllllllllllIIlIIIIIIIlIIIIIlII.setEntityId(lllllllllllllIIlIIIIIIIIllllllIl.getEntityID());
            this.clientWorldController.addEntityToWorld(lllllllllllllIIlIIIIIIIIllllllIl.getEntityID(), lllllllllllllIIlIIIIIIIlIIIIIlII);
            if (lllIIIlIIlIIlll(lllllllllllllIIlIIIIIIIIllllllIl.func_149009_m())) {
                if (lllIIIlIIlIIIll(lllllllllllllIIlIIIIIIIIllllllIl.getType(), NetHandlerPlayClient.lIlIIIIlllllll[4])) {
                    final Entity lllllllllllllIIlIIIIIIIIllllllll = this.clientWorldController.getEntityByID(lllllllllllllIIlIIIIIIIIllllllIl.func_149009_m());
                    if (lllIIIlIIlIIlII((lllllllllllllIIlIIIIIIIIllllllll instanceof EntityLivingBase) ? 1 : 0) && lllIIIlIIlIIlII((lllllllllllllIIlIIIIIIIlIIIIIlII instanceof EntityArrow) ? 1 : 0)) {
                        ((EntityArrow)lllllllllllllIIlIIIIIIIlIIIIIlII).shootingEntity = lllllllllllllIIlIIIIIIIIllllllll;
                    }
                }
                lllllllllllllIIlIIIIIIIlIIIIIlII.setVelocity(lllllllllllllIIlIIIIIIIIllllllIl.getSpeedX() / 8000.0, lllllllllllllIIlIIIIIIIIllllllIl.getSpeedY() / 8000.0, lllllllllllllIIlIIIIIIIIllllllIl.getSpeedZ() / 8000.0);
            }
        }
    }
    
    @Override
    public void handleSpawnPosition(final S05PacketSpawnPosition lllllllllllllIIIllllllllIllIIlll) {
        PacketThreadUtil.checkThreadAndEnqueue((Packet<NetHandlerPlayClient>)lllllllllllllIIIllllllllIllIIlll, this, this.gameController);
        this.gameController.thePlayer.setSpawnPoint(lllllllllllllIIIllllllllIllIIlll.getSpawnPos(), (boolean)(NetHandlerPlayClient.lIlIIIIlllllll[17] != 0));
        this.gameController.theWorld.getWorldInfo().setSpawn(lllllllllllllIIIllllllllIllIIlll.getSpawnPos());
    }
    
    @Override
    public void handleBlockChange(final S23PacketBlockChange lllllllllllllIIIllllllllllIIlIlI) {
        PacketThreadUtil.checkThreadAndEnqueue((Packet<NetHandlerPlayClient>)lllllllllllllIIIllllllllllIIlIlI, this, this.gameController);
        this.clientWorldController.invalidateRegionAndSetBlock(lllllllllllllIIIllllllllllIIlIlI.getBlockPosition(), lllllllllllllIIIllllllllllIIlIlI.getBlockState());
        "".length();
    }
    
    private static boolean lllIIIlIIlIIllI(final int lllllllllllllIIIllllllIIllIIIlIl, final int lllllllllllllIIIllllllIIllIIIlII) {
        return lllllllllllllIIIllllllIIllIIIlIl >= lllllllllllllIIIllllllIIllIIIlII;
    }
    
    @Override
    public void handleConfirmTransaction(final S32PacketConfirmTransaction lllllllllllllIIIllllllllIIIIlIIl) {
        PacketThreadUtil.checkThreadAndEnqueue((Packet<NetHandlerPlayClient>)lllllllllllllIIIllllllllIIIIlIIl, this, this.gameController);
        Container lllllllllllllIIIllllllllIIIIlIII = null;
        final EntityPlayer lllllllllllllIIIllllllllIIIIIlll = this.gameController.thePlayer;
        if (lllIIIlIIlIlIII(lllllllllllllIIIllllllllIIIIlIIl.getWindowId())) {
            lllllllllllllIIIllllllllIIIIlIII = lllllllllllllIIIllllllllIIIIIlll.inventoryContainer;
            "".length();
            if ((0x65 ^ 0x30 ^ (0xCD ^ 0x9C)) != (0x6D ^ 0x4F ^ (0xE ^ 0x28))) {
                return;
            }
        }
        else if (lllIIIlIIlIIIll(lllllllllllllIIIllllllllIIIIlIIl.getWindowId(), lllllllllllllIIIllllllllIIIIIlll.openContainer.windowId)) {
            lllllllllllllIIIllllllllIIIIlIII = lllllllllllllIIIllllllllIIIIIlll.openContainer;
        }
        if (lllIIIlIIlIIlIl(lllllllllllllIIIllllllllIIIIlIII) && lllIIIlIIlIlIII(lllllllllllllIIIllllllllIIIIlIIl.func_148888_e() ? 1 : 0)) {
            this.addToSendQueue(new C0FPacketConfirmTransaction(lllllllllllllIIIllllllllIIIIlIIl.getWindowId(), lllllllllllllIIIllllllllIIIIlIIl.getActionNumber(), (boolean)(NetHandlerPlayClient.lIlIIIIlllllll[17] != 0)));
        }
    }
    
    public NetworkManager getNetworkManager() {
        return this.netManager;
    }
    
    @Override
    public void handleMultiBlockChange(final S22PacketMultiBlockChange lllllllllllllIIIlllllllllllIIIII) {
        PacketThreadUtil.checkThreadAndEnqueue((Packet<NetHandlerPlayClient>)lllllllllllllIIIlllllllllllIIIII, this, this.gameController);
        final char lllllllllllllIIIllllllllllIllIIl;
        final boolean lllllllllllllIIIllllllllllIllIlI = ((S22PacketMultiBlockChange.BlockUpdateData[])(Object)(lllllllllllllIIIllllllllllIllIIl = (char)(Object)lllllllllllllIIIlllllllllllIIIII.getChangedBlocks())).length != 0;
        boolean lllllllllllllIIIllllllllllIllIll = NetHandlerPlayClient.lIlIIIIlllllll[1] != 0;
        "".length();
        if ((0xBC ^ 0x8A ^ (0xA9 ^ 0x9B)) != (0x68 ^ 0x60 ^ (0x0 ^ 0xC))) {
            return;
        }
        while (!lllIIIlIIlIIllI(lllllllllllllIIIllllllllllIllIll ? 1 : 0, lllllllllllllIIIllllllllllIllIlI ? 1 : 0)) {
            final S22PacketMultiBlockChange.BlockUpdateData lllllllllllllIIIllllllllllIlllll = lllllllllllllIIIllllllllllIllIIl[lllllllllllllIIIllllllllllIllIll];
            this.clientWorldController.invalidateRegionAndSetBlock(lllllllllllllIIIllllllllllIlllll.getPos(), lllllllllllllIIIllllllllllIlllll.getBlockState());
            "".length();
            ++lllllllllllllIIIllllllllllIllIll;
        }
    }
    
    @Override
    public void handleSoundEffect(final S29PacketSoundEffect lllllllllllllIIIllllllIlllIllIlI) {
        PacketThreadUtil.checkThreadAndEnqueue((Packet<NetHandlerPlayClient>)lllllllllllllIIIllllllIlllIllIlI, this, this.gameController);
        this.gameController.theWorld.playSound(lllllllllllllIIIllllllIlllIllIlI.getX(), lllllllllllllIIIllllllIlllIllIlI.getY(), lllllllllllllIIIllllllIlllIllIlI.getZ(), lllllllllllllIIIllllllIlllIllIlI.getSoundName(), lllllllllllllIIIllllllIlllIllIlI.getVolume(), lllllllllllllIIIllllllIlllIllIlI.getPitch(), (boolean)(NetHandlerPlayClient.lIlIIIIlllllll[1] != 0));
    }
    
    @Override
    public void handleEntityStatus(final S19PacketEntityStatus lllllllllllllIIIllllllllIlIIlIll) {
        PacketThreadUtil.checkThreadAndEnqueue((Packet<NetHandlerPlayClient>)lllllllllllllIIIllllllllIlIIlIll, this, this.gameController);
        final Entity lllllllllllllIIIllllllllIlIIllIl = lllllllllllllIIIllllllllIlIIlIll.getEntity(this.clientWorldController);
        if (lllIIIlIIlIIlIl(lllllllllllllIIIllllllllIlIIllIl)) {
            if (lllIIIlIIlIIIll(lllllllllllllIIIllllllllIlIIlIll.getOpCode(), NetHandlerPlayClient.lIlIIIIlllllll[31])) {
                this.gameController.getSoundHandler().playSound(new GuardianSound((EntityGuardian)lllllllllllllIIIllllllllIlIIllIl));
                "".length();
                if (null != null) {
                    return;
                }
            }
            else {
                lllllllllllllIIIllllllllIlIIllIl.handleStatusUpdate(lllllllllllllIIIllllllllIlIIlIll.getOpCode());
            }
        }
    }
    
    @Override
    public void handleChangeGameState(final S2BPacketChangeGameState lllllllllllllIIIlllllllIlIIlIIII) {
        PacketThreadUtil.checkThreadAndEnqueue((Packet<NetHandlerPlayClient>)lllllllllllllIIIlllllllIlIIlIIII, this, this.gameController);
        final EntityPlayer lllllllllllllIIIlllllllIlIIlIllI = this.gameController.thePlayer;
        final int lllllllllllllIIIlllllllIlIIlIlIl = lllllllllllllIIIlllllllIlIIlIIII.getGameState();
        final float lllllllllllllIIIlllllllIlIIlIlII = lllllllllllllIIIlllllllIlIIlIIII.func_149137_d();
        final int lllllllllllllIIIlllllllIlIIlIIll = MathHelper.floor_float(lllllllllllllIIIlllllllIlIIlIlII + 0.5f);
        if (lllIIIlIIlIlIll(lllllllllllllIIIlllllllIlIIlIlIl) && lllIIIlIIlIllII(lllllllllllllIIIlllllllIlIIlIlIl, S2BPacketChangeGameState.MESSAGE_NAMES.length) && lllIIIlIIlIIlIl(S2BPacketChangeGameState.MESSAGE_NAMES[lllllllllllllIIIlllllllIlIIlIlIl])) {
            lllllllllllllIIIlllllllIlIIlIllI.addChatComponentMessage(new ChatComponentTranslation(S2BPacketChangeGameState.MESSAGE_NAMES[lllllllllllllIIIlllllllIlIIlIlIl], new Object[NetHandlerPlayClient.lIlIIIIlllllll[1]]));
        }
        if (lllIIIlIIlIIIll(lllllllllllllIIIlllllllIlIIlIlIl, NetHandlerPlayClient.lIlIIIIlllllll[17])) {
            this.clientWorldController.getWorldInfo().setRaining((boolean)(NetHandlerPlayClient.lIlIIIIlllllll[17] != 0));
            this.clientWorldController.setRainStrength(0.0f);
            "".length();
            if (null != null) {
                return;
            }
        }
        else if (lllIIIlIIlIIIll(lllllllllllllIIIlllllllIlIIlIlIl, NetHandlerPlayClient.lIlIIIIlllllll[21])) {
            this.clientWorldController.getWorldInfo().setRaining((boolean)(NetHandlerPlayClient.lIlIIIIlllllll[1] != 0));
            this.clientWorldController.setRainStrength(1.0f);
            "".length();
            if ("   ".length() < 0) {
                return;
            }
        }
        else if (lllIIIlIIlIIIll(lllllllllllllIIIlllllllIlIIlIlIl, NetHandlerPlayClient.lIlIIIIlllllll[25])) {
            this.gameController.playerController.setGameType(WorldSettings.GameType.getByID(lllllllllllllIIIlllllllIlIIlIIll));
            "".length();
            if ("  ".length() < -" ".length()) {
                return;
            }
        }
        else if (lllIIIlIIlIIIll(lllllllllllllIIIlllllllIlIIlIlIl, NetHandlerPlayClient.lIlIIIIlllllll[26])) {
            this.gameController.displayGuiScreen(new GuiWinGame());
            "".length();
            if (null != null) {
                return;
            }
        }
        else if (lllIIIlIIlIIIll(lllllllllllllIIIlllllllIlIIlIlIl, NetHandlerPlayClient.lIlIIIIlllllll[29])) {
            final GameSettings lllllllllllllIIIlllllllIlIIlIIlI = this.gameController.gameSettings;
            if (lllIIIlIIlIlIII(lllIIIlIIlIllll(lllllllllllllIIIlllllllIlIIlIlII, 0.0f))) {
                this.gameController.displayGuiScreen(new GuiScreenDemo());
                "".length();
                if (-" ".length() > 0) {
                    return;
                }
            }
            else if (lllIIIlIIlIlIII(lllIIIlIIlIllll(lllllllllllllIIIlllllllIlIIlIlII, 101.0f))) {
                final GuiNewChat chatGUI = this.gameController.ingameGUI.getChatGUI();
                final String lllllllllllllIlIIlIlllIIlIIIIIlI = NetHandlerPlayClient.lIlIIIIllIIlII[NetHandlerPlayClient.lIlIIIIlllllll[40]];
                final Object[] lllllllllllllIlIIlIlllIIlIIIIIIl = new Object[NetHandlerPlayClient.lIlIIIIlllllll[26]];
                lllllllllllllIlIIlIlllIIlIIIIIIl[NetHandlerPlayClient.lIlIIIIlllllll[1]] = GameSettings.getKeyDisplayString(lllllllllllllIIIlllllllIlIIlIIlI.keyBindForward.getKeyCode());
                lllllllllllllIlIIlIlllIIlIIIIIIl[NetHandlerPlayClient.lIlIIIIlllllll[17]] = GameSettings.getKeyDisplayString(lllllllllllllIIIlllllllIlIIlIIlI.keyBindLeft.getKeyCode());
                lllllllllllllIlIIlIlllIIlIIIIIIl[NetHandlerPlayClient.lIlIIIIlllllll[21]] = GameSettings.getKeyDisplayString(lllllllllllllIIIlllllllIlIIlIIlI.keyBindBack.getKeyCode());
                lllllllllllllIlIIlIlllIIlIIIIIIl[NetHandlerPlayClient.lIlIIIIlllllll[25]] = GameSettings.getKeyDisplayString(lllllllllllllIIIlllllllIlIIlIIlI.keyBindRight.getKeyCode());
                chatGUI.printChatMessage(new ChatComponentTranslation(lllllllllllllIlIIlIlllIIlIIIIIlI, lllllllllllllIlIIlIlllIIlIIIIIIl));
                "".length();
                if (((0x62 ^ 0x21) & ~(0xCC ^ 0x8F)) != 0x0) {
                    return;
                }
            }
            else if (lllIIIlIIlIlIII(lllIIIlIIlIllll(lllllllllllllIIIlllllllIlIIlIlII, 102.0f))) {
                final GuiNewChat chatGUI2 = this.gameController.ingameGUI.getChatGUI();
                final String lllllllllllllIlIIlIlllIIlIIIIIlI2 = NetHandlerPlayClient.lIlIIIIllIIlII[NetHandlerPlayClient.lIlIIIIlllllll[41]];
                final Object[] lllllllllllllIlIIlIlllIIlIIIIIIl2 = new Object[NetHandlerPlayClient.lIlIIIIlllllll[17]];
                lllllllllllllIlIIlIlllIIlIIIIIIl2[NetHandlerPlayClient.lIlIIIIlllllll[1]] = GameSettings.getKeyDisplayString(lllllllllllllIIIlllllllIlIIlIIlI.keyBindJump.getKeyCode());
                chatGUI2.printChatMessage(new ChatComponentTranslation(lllllllllllllIlIIlIlllIIlIIIIIlI2, lllllllllllllIlIIlIlllIIlIIIIIIl2));
                "".length();
                if (-" ".length() > "   ".length()) {
                    return;
                }
            }
            else if (lllIIIlIIlIlIII(lllIIIlIIlIllll(lllllllllllllIIIlllllllIlIIlIlII, 103.0f))) {
                final GuiNewChat chatGUI3 = this.gameController.ingameGUI.getChatGUI();
                final String lllllllllllllIlIIlIlllIIlIIIIIlI3 = NetHandlerPlayClient.lIlIIIIllIIlII[NetHandlerPlayClient.lIlIIIIlllllll[27]];
                final Object[] lllllllllllllIlIIlIlllIIlIIIIIIl3 = new Object[NetHandlerPlayClient.lIlIIIIlllllll[17]];
                lllllllllllllIlIIlIlllIIlIIIIIIl3[NetHandlerPlayClient.lIlIIIIlllllll[1]] = GameSettings.getKeyDisplayString(lllllllllllllIIIlllllllIlIIlIIlI.keyBindInventory.getKeyCode());
                chatGUI3.printChatMessage(new ChatComponentTranslation(lllllllllllllIlIIlIlllIIlIIIIIlI3, lllllllllllllIlIIlIlllIIlIIIIIIl3));
                "".length();
                if (-" ".length() >= " ".length()) {
                    return;
                }
            }
        }
        else if (lllIIIlIIlIIIll(lllllllllllllIIIlllllllIlIIlIlIl, NetHandlerPlayClient.lIlIIIIlllllll[30])) {
            this.clientWorldController.playSound(lllllllllllllIIIlllllllIlIIlIllI.posX, lllllllllllllIIIlllllllIlIIlIllI.posY + lllllllllllllIIIlllllllIlIIlIllI.getEyeHeight(), lllllllllllllIIIlllllllIlIIlIllI.posZ, NetHandlerPlayClient.lIlIIIIllIIlII[NetHandlerPlayClient.lIlIIIIlllllll[42]], 0.18f, 0.45f, (boolean)(NetHandlerPlayClient.lIlIIIIlllllll[1] != 0));
            "".length();
            if ("   ".length() == "  ".length()) {
                return;
            }
        }
        else if (lllIIIlIIlIIIll(lllllllllllllIIIlllllllIlIIlIlIl, NetHandlerPlayClient.lIlIIIIlllllll[32])) {
            this.clientWorldController.setRainStrength(lllllllllllllIIIlllllllIlIIlIlII);
            "".length();
            if (((0x65 ^ 0x7E ^ (0x6F ^ 0x60)) & (0x0 ^ 0x10 ^ (0x64 ^ 0x60) ^ -" ".length())) != ((0x9F ^ 0xA3 ^ (0x5E ^ 0x42)) & (78 + 124 - 167 + 127 ^ 21 + 2 + 22 + 85 ^ -" ".length()))) {
                return;
            }
        }
        else if (lllIIIlIIlIIIll(lllllllllllllIIIlllllllIlIIlIlIl, NetHandlerPlayClient.lIlIIIIlllllll[33])) {
            this.clientWorldController.setThunderStrength(lllllllllllllIIIlllllllIlIIlIlII);
            "".length();
            if (-(0xAC ^ 0xA8) > 0) {
                return;
            }
        }
        else if (lllIIIlIIlIIIll(lllllllllllllIIIlllllllIlIIlIlIl, NetHandlerPlayClient.lIlIIIIlllllll[2])) {
            this.clientWorldController.spawnParticle(EnumParticleTypes.MOB_APPEARANCE, lllllllllllllIIIlllllllIlIIlIllI.posX, lllllllllllllIIIlllllllIlIIlIllI.posY, lllllllllllllIIIlllllllIlIIlIllI.posZ, 0.0, 0.0, 0.0, new int[NetHandlerPlayClient.lIlIIIIlllllll[1]]);
            this.clientWorldController.playSound(lllllllllllllIIIlllllllIlIIlIllI.posX, lllllllllllllIIIlllllllIlIIlIllI.posY, lllllllllllllIIIlllllllIlIIlIllI.posZ, NetHandlerPlayClient.lIlIIIIllIIlII[NetHandlerPlayClient.lIlIIIIlllllll[43]], 1.0f, 1.0f, (boolean)(NetHandlerPlayClient.lIlIIIIlllllll[1] != 0));
        }
    }
    
    public void cleanup() {
        this.clientWorldController = null;
    }
    
    public GameProfile getGameProfile() {
        return this.profile;
    }
    
    @Override
    public void handleDisplayScoreboard(final S3DPacketDisplayScoreboard lllllllllllllIIIllllllIlIlllllll) {
        PacketThreadUtil.checkThreadAndEnqueue((Packet<NetHandlerPlayClient>)lllllllllllllIIIllllllIlIlllllll, this, this.gameController);
        final Scoreboard lllllllllllllIIIllllllIlIllllllI = this.clientWorldController.getScoreboard();
        if (lllIIIlIIlIlIII(lllllllllllllIIIllllllIlIlllllll.func_149370_d().length())) {
            lllllllllllllIIIllllllIlIllllllI.setObjectiveInDisplaySlot(lllllllllllllIIIllllllIlIlllllll.func_149371_c(), null);
            "".length();
            if (null != null) {
                return;
            }
        }
        else {
            final ScoreObjective lllllllllllllIIIllllllIlIlllllIl = lllllllllllllIIIllllllIlIllllllI.getObjective(lllllllllllllIIIllllllIlIlllllll.func_149370_d());
            lllllllllllllIIIllllllIlIllllllI.setObjectiveInDisplaySlot(lllllllllllllIIIllllllIlIlllllll.func_149371_c(), lllllllllllllIIIllllllIlIlllllIl);
        }
    }
    
    @Override
    public void handleMaps(final S34PacketMaps lllllllllllllIIIlllllllIlIIIIIll) {
        PacketThreadUtil.checkThreadAndEnqueue((Packet<NetHandlerPlayClient>)lllllllllllllIIIlllllllIlIIIIIll, this, this.gameController);
        final MapData lllllllllllllIIIlllllllIlIIIIlIl = ItemMap.loadMapData(lllllllllllllIIIlllllllIlIIIIIll.getMapId(), this.gameController.theWorld);
        lllllllllllllIIIlllllllIlIIIIIll.setMapdataTo(lllllllllllllIIIlllllllIlIIIIlIl);
        this.gameController.entityRenderer.getMapItemRenderer().updateMapTexture(lllllllllllllIIIlllllllIlIIIIlIl);
    }
    
    @Override
    public void handleCollectItem(final S0DPacketCollectItem lllllllllllllIIIlllllllllIlIlllI) {
        PacketThreadUtil.checkThreadAndEnqueue((Packet<NetHandlerPlayClient>)lllllllllllllIIIlllllllllIlIlllI, this, this.gameController);
        final Entity lllllllllllllIIIlllllllllIllIIIl = this.clientWorldController.getEntityByID(lllllllllllllIIIlllllllllIlIlllI.getCollectedItemEntityID());
        EntityLivingBase lllllllllllllIIIlllllllllIllIIII = (EntityLivingBase)this.clientWorldController.getEntityByID(lllllllllllllIIIlllllllllIlIlllI.getEntityID());
        if (lllIIIlIIlIllIl(lllllllllllllIIIlllllllllIllIIII)) {
            lllllllllllllIIIlllllllllIllIIII = this.gameController.thePlayer;
        }
        if (lllIIIlIIlIIlIl(lllllllllllllIIIlllllllllIllIIIl)) {
            if (lllIIIlIIlIIlII((lllllllllllllIIIlllllllllIllIIIl instanceof EntityXPOrb) ? 1 : 0)) {
                this.clientWorldController.playSoundAtEntity(lllllllllllllIIIlllllllllIllIIIl, NetHandlerPlayClient.lIlIIIIllIIlII[NetHandlerPlayClient.lIlIIIIlllllll[26]], 0.2f, ((this.avRandomizer.nextFloat() - this.avRandomizer.nextFloat()) * 0.7f + 1.0f) * 2.0f);
                "".length();
                if (" ".length() <= ((0x70 ^ 0x48 ^ (0x7E ^ 0x6C)) & (127 + 170 - 194 + 71 ^ 101 + 127 - 176 + 80 ^ -" ".length()))) {
                    return;
                }
            }
            else {
                this.clientWorldController.playSoundAtEntity(lllllllllllllIIIlllllllllIllIIIl, NetHandlerPlayClient.lIlIIIIllIIlII[NetHandlerPlayClient.lIlIIIIlllllll[29]], 0.2f, ((this.avRandomizer.nextFloat() - this.avRandomizer.nextFloat()) * 0.7f + 1.0f) * 2.0f);
            }
            this.gameController.effectRenderer.addEffect(new EntityPickupFX(this.clientWorldController, lllllllllllllIIIlllllllllIllIIIl, lllllllllllllIIIlllllllllIllIIII, 0.5f));
            this.clientWorldController.removeEntityFromWorld(lllllllllllllIIIlllllllllIlIlllI.getCollectedItemEntityID());
            "".length();
        }
    }
    
    @Override
    public void handleSetCompressionLevel(final S46PacketSetCompressionLevel lllllllllllllIIIlllllllIIIIllIII) {
        if (lllIIIlIIlIlIII(this.netManager.isLocalChannel() ? 1 : 0)) {
            this.netManager.setCompressionTreshold(lllllllllllllIIIlllllllIIIIllIII.func_179760_a());
        }
    }
    
    @Override
    public void handleUpdateScore(final S3CPacketUpdateScore lllllllllllllIIIllllllIllIIIlIII) {
        PacketThreadUtil.checkThreadAndEnqueue((Packet<NetHandlerPlayClient>)lllllllllllllIIIllllllIllIIIlIII, this, this.gameController);
        final Scoreboard lllllllllllllIIIllllllIllIIIllII = this.clientWorldController.getScoreboard();
        final ScoreObjective lllllllllllllIIIllllllIllIIIlIll = lllllllllllllIIIllllllIllIIIllII.getObjective(lllllllllllllIIIllllllIllIIIlIII.getObjectiveName());
        if (lllIIIlIIllIIII(lllllllllllllIIIllllllIllIIIlIII.getScoreAction(), S3CPacketUpdateScore.Action.CHANGE)) {
            final Score lllllllllllllIIIllllllIllIIIlIlI = lllllllllllllIIIllllllIllIIIllII.getValueFromObjective(lllllllllllllIIIllllllIllIIIlIII.getPlayerName(), lllllllllllllIIIllllllIllIIIlIll);
            lllllllllllllIIIllllllIllIIIlIlI.setScorePoints(lllllllllllllIIIllllllIllIIIlIII.getScoreValue());
            "".length();
            if ("   ".length() == 0) {
                return;
            }
        }
        else if (lllIIIlIIllIIII(lllllllllllllIIIllllllIllIIIlIII.getScoreAction(), S3CPacketUpdateScore.Action.REMOVE)) {
            if (lllIIIlIIlIIlII(StringUtils.isNullOrEmpty(lllllllllllllIIIllllllIllIIIlIII.getObjectiveName()) ? 1 : 0)) {
                lllllllllllllIIIllllllIllIIIllII.removeObjectiveFromEntity(lllllllllllllIIIllllllIllIIIlIII.getPlayerName(), null);
                "".length();
                if (((0x50 ^ 0x46) & ~(0x5A ^ 0x4C)) != 0x0) {
                    return;
                }
            }
            else if (lllIIIlIIlIIlIl(lllllllllllllIIIllllllIllIIIlIll)) {
                lllllllllllllIIIllllllIllIIIllII.removeObjectiveFromEntity(lllllllllllllIIIllllllIllIIIlIII.getPlayerName(), lllllllllllllIIIllllllIllIIIlIll);
            }
        }
    }
    
    static /* synthetic */ void access$4(final NetHandlerPlayClient lllllllllllllIIIllllllIIllllllll, final Minecraft lllllllllllllIIIllllllIIlllllllI) {
        lllllllllllllIIIllllllIIllllllll.gameController = lllllllllllllIIIllllllIIlllllllI;
    }
    
    @Override
    public void handleChat(final S02PacketChat lllllllllllllIIIlllllllllIlIIllI) {
        PacketThreadUtil.checkThreadAndEnqueue((Packet<NetHandlerPlayClient>)lllllllllllllIIIlllllllllIlIIllI, this, this.gameController);
        if (lllIIIlIIlIIIll(lllllllllllllIIIlllllllllIlIIllI.getType(), NetHandlerPlayClient.lIlIIIIlllllll[21])) {
            this.gameController.ingameGUI.setRecordPlaying(lllllllllllllIIIlllllllllIlIIllI.getChatComponent(), (boolean)(NetHandlerPlayClient.lIlIIIIlllllll[1] != 0));
            "".length();
            if (-(0x61 ^ 0x64) >= 0) {
                return;
            }
        }
        else {
            this.gameController.ingameGUI.getChatGUI().printChatMessage(lllllllllllllIIIlllllllllIlIIllI.getChatComponent());
        }
    }
}
