// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.network;

import java.util.Iterator;
import org.apache.logging.log4j.LogManager;
import com.google.common.collect.HashBiMap;
import com.google.common.collect.Maps;
import net.minecraft.network.login.client.C01PacketEncryptionResponse;
import net.minecraft.network.login.client.C00PacketLoginStart;
import net.minecraft.network.login.server.S03PacketEnableCompression;
import net.minecraft.network.login.server.S02PacketLoginSuccess;
import net.minecraft.network.login.server.S01PacketEncryptionRequest;
import net.minecraft.network.login.server.S00PacketDisconnect;
import net.minecraft.network.status.server.S01PacketPong;
import net.minecraft.network.status.client.C01PacketPing;
import net.minecraft.network.status.server.S00PacketServerInfo;
import net.minecraft.network.status.client.C00PacketServerQuery;
import net.minecraft.network.play.client.C19PacketResourcePackStatus;
import net.minecraft.network.play.client.C18PacketSpectate;
import net.minecraft.network.play.client.C17PacketCustomPayload;
import net.minecraft.network.play.client.C16PacketClientStatus;
import net.minecraft.network.play.client.C15PacketClientSettings;
import net.minecraft.network.play.client.C14PacketTabComplete;
import net.minecraft.network.play.client.C13PacketPlayerAbilities;
import net.minecraft.network.play.client.C12PacketUpdateSign;
import net.minecraft.network.play.client.C11PacketEnchantItem;
import net.minecraft.network.play.client.C10PacketCreativeInventoryAction;
import net.minecraft.network.play.client.C0FPacketConfirmTransaction;
import net.minecraft.network.play.client.C0EPacketClickWindow;
import net.minecraft.network.play.client.C0DPacketCloseWindow;
import net.minecraft.network.play.client.C0CPacketInput;
import net.minecraft.network.play.client.C0BPacketEntityAction;
import net.minecraft.network.play.client.C0APacketAnimation;
import net.minecraft.network.play.client.C09PacketHeldItemChange;
import net.minecraft.network.play.client.C08PacketPlayerBlockPlacement;
import net.minecraft.network.play.client.C07PacketPlayerDigging;
import net.minecraft.network.play.client.C03PacketPlayer;
import net.minecraft.network.play.client.C02PacketUseEntity;
import net.minecraft.network.play.client.C01PacketChatMessage;
import net.minecraft.network.play.client.C00PacketKeepAlive;
import net.minecraft.network.play.server.S49PacketUpdateEntityNBT;
import net.minecraft.network.play.server.S48PacketResourcePackSend;
import net.minecraft.network.play.server.S47PacketPlayerListHeaderFooter;
import net.minecraft.network.play.server.S46PacketSetCompressionLevel;
import net.minecraft.network.play.server.S45PacketTitle;
import net.minecraft.network.play.server.S44PacketWorldBorder;
import net.minecraft.network.play.server.S43PacketCamera;
import net.minecraft.network.play.server.S42PacketCombatEvent;
import net.minecraft.network.play.server.S41PacketServerDifficulty;
import net.minecraft.network.play.server.S40PacketDisconnect;
import net.minecraft.network.play.server.S3FPacketCustomPayload;
import net.minecraft.network.play.server.S3EPacketTeams;
import net.minecraft.network.play.server.S3DPacketDisplayScoreboard;
import net.minecraft.network.play.server.S3CPacketUpdateScore;
import net.minecraft.network.play.server.S3BPacketScoreboardObjective;
import net.minecraft.network.play.server.S3APacketTabComplete;
import net.minecraft.network.play.server.S39PacketPlayerAbilities;
import net.minecraft.network.play.server.S38PacketPlayerListItem;
import net.minecraft.network.play.server.S37PacketStatistics;
import net.minecraft.network.play.server.S36PacketSignEditorOpen;
import net.minecraft.network.play.server.S35PacketUpdateTileEntity;
import net.minecraft.network.play.server.S34PacketMaps;
import net.minecraft.network.play.server.S33PacketUpdateSign;
import net.minecraft.network.play.server.S32PacketConfirmTransaction;
import net.minecraft.network.play.server.S31PacketWindowProperty;
import net.minecraft.network.play.server.S30PacketWindowItems;
import net.minecraft.network.play.server.S2FPacketSetSlot;
import net.minecraft.network.play.server.S2EPacketCloseWindow;
import net.minecraft.network.play.server.S2DPacketOpenWindow;
import net.minecraft.network.play.server.S2CPacketSpawnGlobalEntity;
import net.minecraft.network.play.server.S2BPacketChangeGameState;
import net.minecraft.network.play.server.S2APacketParticles;
import net.minecraft.network.play.server.S29PacketSoundEffect;
import net.minecraft.network.play.server.S28PacketEffect;
import net.minecraft.network.play.server.S27PacketExplosion;
import net.minecraft.network.play.server.S26PacketMapChunkBulk;
import net.minecraft.network.play.server.S25PacketBlockBreakAnim;
import net.minecraft.network.play.server.S24PacketBlockAction;
import net.minecraft.network.play.server.S23PacketBlockChange;
import net.minecraft.network.play.server.S22PacketMultiBlockChange;
import net.minecraft.network.play.server.S21PacketChunkData;
import net.minecraft.network.play.server.S20PacketEntityProperties;
import net.minecraft.network.play.server.S1FPacketSetExperience;
import net.minecraft.network.play.server.S1EPacketRemoveEntityEffect;
import net.minecraft.network.play.server.S1DPacketEntityEffect;
import net.minecraft.network.play.server.S1CPacketEntityMetadata;
import net.minecraft.network.play.server.S1BPacketEntityAttach;
import net.minecraft.network.play.server.S19PacketEntityStatus;
import net.minecraft.network.play.server.S19PacketEntityHeadLook;
import net.minecraft.network.play.server.S18PacketEntityTeleport;
import net.minecraft.network.play.server.S14PacketEntity;
import net.minecraft.network.play.server.S13PacketDestroyEntities;
import net.minecraft.network.play.server.S12PacketEntityVelocity;
import net.minecraft.network.play.server.S11PacketSpawnExperienceOrb;
import net.minecraft.network.play.server.S10PacketSpawnPainting;
import net.minecraft.network.play.server.S0FPacketSpawnMob;
import net.minecraft.network.play.server.S0EPacketSpawnObject;
import net.minecraft.network.play.server.S0DPacketCollectItem;
import net.minecraft.network.play.server.S0CPacketSpawnPlayer;
import net.minecraft.network.play.server.S0BPacketAnimation;
import net.minecraft.network.play.server.S0APacketUseBed;
import net.minecraft.network.play.server.S09PacketHeldItemChange;
import net.minecraft.network.play.server.S08PacketPlayerPosLook;
import net.minecraft.network.play.server.S07PacketRespawn;
import net.minecraft.network.play.server.S06PacketUpdateHealth;
import net.minecraft.network.play.server.S05PacketSpawnPosition;
import net.minecraft.network.play.server.S04PacketEntityEquipment;
import net.minecraft.network.play.server.S03PacketTimeUpdate;
import net.minecraft.network.play.server.S02PacketChat;
import net.minecraft.network.play.server.S01PacketJoinGame;
import net.minecraft.network.play.server.S00PacketKeepAlive;
import net.minecraft.network.handshake.client.C00Handshake;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import com.google.common.collect.BiMap;
import java.util.Map;

public enum EnumConnectionState
{
    private static final /* synthetic */ Map<Class<? extends Packet>, EnumConnectionState> STATES_BY_CLASS;
    
    LOGIN(EnumConnectionState.llIIllllIlIlII[4], EnumConnectionState.llIIllllIlIlII[3]) {
        {
            this.registerPacket(EnumPacketDirection.CLIENTBOUND, S00PacketDisconnect.class);
            "".length();
            this.registerPacket(EnumPacketDirection.CLIENTBOUND, S01PacketEncryptionRequest.class);
            "".length();
            this.registerPacket(EnumPacketDirection.CLIENTBOUND, S02PacketLoginSuccess.class);
            "".length();
            this.registerPacket(EnumPacketDirection.CLIENTBOUND, S03PacketEnableCompression.class);
            "".length();
            this.registerPacket(EnumPacketDirection.SERVERBOUND, C00PacketLoginStart.class);
            "".length();
            this.registerPacket(EnumPacketDirection.SERVERBOUND, C01PacketEncryptionResponse.class);
            "".length();
        }
    }, 
    HANDSHAKING(EnumConnectionState.llIIllllIlIlII[0], EnumConnectionState.llIIllllIlIlII[1]) {
        {
            this.registerPacket(EnumPacketDirection.SERVERBOUND, C00Handshake.class);
            "".length();
        }
    };
    
    private final /* synthetic */ int id;
    private static final /* synthetic */ int[] llIIllllIlIlII;
    private static /* synthetic */ int field_181137_f;
    private static final /* synthetic */ EnumConnectionState[] STATES_BY_ID;
    private static /* synthetic */ int field_181136_e;
    
    PLAY(EnumConnectionState.llIIllllIlIlII[2], EnumConnectionState.llIIllllIlIlII[0]) {
        {
            this.registerPacket(EnumPacketDirection.CLIENTBOUND, S00PacketKeepAlive.class);
            "".length();
            this.registerPacket(EnumPacketDirection.CLIENTBOUND, S01PacketJoinGame.class);
            "".length();
            this.registerPacket(EnumPacketDirection.CLIENTBOUND, S02PacketChat.class);
            "".length();
            this.registerPacket(EnumPacketDirection.CLIENTBOUND, S03PacketTimeUpdate.class);
            "".length();
            this.registerPacket(EnumPacketDirection.CLIENTBOUND, S04PacketEntityEquipment.class);
            "".length();
            this.registerPacket(EnumPacketDirection.CLIENTBOUND, S05PacketSpawnPosition.class);
            "".length();
            this.registerPacket(EnumPacketDirection.CLIENTBOUND, S06PacketUpdateHealth.class);
            "".length();
            this.registerPacket(EnumPacketDirection.CLIENTBOUND, S07PacketRespawn.class);
            "".length();
            this.registerPacket(EnumPacketDirection.CLIENTBOUND, S08PacketPlayerPosLook.class);
            "".length();
            this.registerPacket(EnumPacketDirection.CLIENTBOUND, S09PacketHeldItemChange.class);
            "".length();
            this.registerPacket(EnumPacketDirection.CLIENTBOUND, S0APacketUseBed.class);
            "".length();
            this.registerPacket(EnumPacketDirection.CLIENTBOUND, S0BPacketAnimation.class);
            "".length();
            this.registerPacket(EnumPacketDirection.CLIENTBOUND, S0CPacketSpawnPlayer.class);
            "".length();
            this.registerPacket(EnumPacketDirection.CLIENTBOUND, S0DPacketCollectItem.class);
            "".length();
            this.registerPacket(EnumPacketDirection.CLIENTBOUND, S0EPacketSpawnObject.class);
            "".length();
            this.registerPacket(EnumPacketDirection.CLIENTBOUND, S0FPacketSpawnMob.class);
            "".length();
            this.registerPacket(EnumPacketDirection.CLIENTBOUND, S10PacketSpawnPainting.class);
            "".length();
            this.registerPacket(EnumPacketDirection.CLIENTBOUND, S11PacketSpawnExperienceOrb.class);
            "".length();
            this.registerPacket(EnumPacketDirection.CLIENTBOUND, S12PacketEntityVelocity.class);
            "".length();
            this.registerPacket(EnumPacketDirection.CLIENTBOUND, S13PacketDestroyEntities.class);
            "".length();
            this.registerPacket(EnumPacketDirection.CLIENTBOUND, S14PacketEntity.class);
            "".length();
            this.registerPacket(EnumPacketDirection.CLIENTBOUND, S14PacketEntity.S15PacketEntityRelMove.class);
            "".length();
            this.registerPacket(EnumPacketDirection.CLIENTBOUND, S14PacketEntity.S16PacketEntityLook.class);
            "".length();
            this.registerPacket(EnumPacketDirection.CLIENTBOUND, S14PacketEntity.S17PacketEntityLookMove.class);
            "".length();
            this.registerPacket(EnumPacketDirection.CLIENTBOUND, S18PacketEntityTeleport.class);
            "".length();
            this.registerPacket(EnumPacketDirection.CLIENTBOUND, S19PacketEntityHeadLook.class);
            "".length();
            this.registerPacket(EnumPacketDirection.CLIENTBOUND, S19PacketEntityStatus.class);
            "".length();
            this.registerPacket(EnumPacketDirection.CLIENTBOUND, S1BPacketEntityAttach.class);
            "".length();
            this.registerPacket(EnumPacketDirection.CLIENTBOUND, S1CPacketEntityMetadata.class);
            "".length();
            this.registerPacket(EnumPacketDirection.CLIENTBOUND, S1DPacketEntityEffect.class);
            "".length();
            this.registerPacket(EnumPacketDirection.CLIENTBOUND, S1EPacketRemoveEntityEffect.class);
            "".length();
            this.registerPacket(EnumPacketDirection.CLIENTBOUND, S1FPacketSetExperience.class);
            "".length();
            this.registerPacket(EnumPacketDirection.CLIENTBOUND, S20PacketEntityProperties.class);
            "".length();
            this.registerPacket(EnumPacketDirection.CLIENTBOUND, S21PacketChunkData.class);
            "".length();
            this.registerPacket(EnumPacketDirection.CLIENTBOUND, S22PacketMultiBlockChange.class);
            "".length();
            this.registerPacket(EnumPacketDirection.CLIENTBOUND, S23PacketBlockChange.class);
            "".length();
            this.registerPacket(EnumPacketDirection.CLIENTBOUND, S24PacketBlockAction.class);
            "".length();
            this.registerPacket(EnumPacketDirection.CLIENTBOUND, S25PacketBlockBreakAnim.class);
            "".length();
            this.registerPacket(EnumPacketDirection.CLIENTBOUND, S26PacketMapChunkBulk.class);
            "".length();
            this.registerPacket(EnumPacketDirection.CLIENTBOUND, S27PacketExplosion.class);
            "".length();
            this.registerPacket(EnumPacketDirection.CLIENTBOUND, S28PacketEffect.class);
            "".length();
            this.registerPacket(EnumPacketDirection.CLIENTBOUND, S29PacketSoundEffect.class);
            "".length();
            this.registerPacket(EnumPacketDirection.CLIENTBOUND, S2APacketParticles.class);
            "".length();
            this.registerPacket(EnumPacketDirection.CLIENTBOUND, S2BPacketChangeGameState.class);
            "".length();
            this.registerPacket(EnumPacketDirection.CLIENTBOUND, S2CPacketSpawnGlobalEntity.class);
            "".length();
            this.registerPacket(EnumPacketDirection.CLIENTBOUND, S2DPacketOpenWindow.class);
            "".length();
            this.registerPacket(EnumPacketDirection.CLIENTBOUND, S2EPacketCloseWindow.class);
            "".length();
            this.registerPacket(EnumPacketDirection.CLIENTBOUND, S2FPacketSetSlot.class);
            "".length();
            this.registerPacket(EnumPacketDirection.CLIENTBOUND, S30PacketWindowItems.class);
            "".length();
            this.registerPacket(EnumPacketDirection.CLIENTBOUND, S31PacketWindowProperty.class);
            "".length();
            this.registerPacket(EnumPacketDirection.CLIENTBOUND, S32PacketConfirmTransaction.class);
            "".length();
            this.registerPacket(EnumPacketDirection.CLIENTBOUND, S33PacketUpdateSign.class);
            "".length();
            this.registerPacket(EnumPacketDirection.CLIENTBOUND, S34PacketMaps.class);
            "".length();
            this.registerPacket(EnumPacketDirection.CLIENTBOUND, S35PacketUpdateTileEntity.class);
            "".length();
            this.registerPacket(EnumPacketDirection.CLIENTBOUND, S36PacketSignEditorOpen.class);
            "".length();
            this.registerPacket(EnumPacketDirection.CLIENTBOUND, S37PacketStatistics.class);
            "".length();
            this.registerPacket(EnumPacketDirection.CLIENTBOUND, S38PacketPlayerListItem.class);
            "".length();
            this.registerPacket(EnumPacketDirection.CLIENTBOUND, S39PacketPlayerAbilities.class);
            "".length();
            this.registerPacket(EnumPacketDirection.CLIENTBOUND, S3APacketTabComplete.class);
            "".length();
            this.registerPacket(EnumPacketDirection.CLIENTBOUND, S3BPacketScoreboardObjective.class);
            "".length();
            this.registerPacket(EnumPacketDirection.CLIENTBOUND, S3CPacketUpdateScore.class);
            "".length();
            this.registerPacket(EnumPacketDirection.CLIENTBOUND, S3DPacketDisplayScoreboard.class);
            "".length();
            this.registerPacket(EnumPacketDirection.CLIENTBOUND, S3EPacketTeams.class);
            "".length();
            this.registerPacket(EnumPacketDirection.CLIENTBOUND, S3FPacketCustomPayload.class);
            "".length();
            this.registerPacket(EnumPacketDirection.CLIENTBOUND, S40PacketDisconnect.class);
            "".length();
            this.registerPacket(EnumPacketDirection.CLIENTBOUND, S41PacketServerDifficulty.class);
            "".length();
            this.registerPacket(EnumPacketDirection.CLIENTBOUND, S42PacketCombatEvent.class);
            "".length();
            this.registerPacket(EnumPacketDirection.CLIENTBOUND, S43PacketCamera.class);
            "".length();
            this.registerPacket(EnumPacketDirection.CLIENTBOUND, S44PacketWorldBorder.class);
            "".length();
            this.registerPacket(EnumPacketDirection.CLIENTBOUND, S45PacketTitle.class);
            "".length();
            this.registerPacket(EnumPacketDirection.CLIENTBOUND, S46PacketSetCompressionLevel.class);
            "".length();
            this.registerPacket(EnumPacketDirection.CLIENTBOUND, S47PacketPlayerListHeaderFooter.class);
            "".length();
            this.registerPacket(EnumPacketDirection.CLIENTBOUND, S48PacketResourcePackSend.class);
            "".length();
            this.registerPacket(EnumPacketDirection.CLIENTBOUND, S49PacketUpdateEntityNBT.class);
            "".length();
            this.registerPacket(EnumPacketDirection.SERVERBOUND, C00PacketKeepAlive.class);
            "".length();
            this.registerPacket(EnumPacketDirection.SERVERBOUND, C01PacketChatMessage.class);
            "".length();
            this.registerPacket(EnumPacketDirection.SERVERBOUND, C02PacketUseEntity.class);
            "".length();
            this.registerPacket(EnumPacketDirection.SERVERBOUND, C03PacketPlayer.class);
            "".length();
            this.registerPacket(EnumPacketDirection.SERVERBOUND, C03PacketPlayer.C04PacketPlayerPosition.class);
            "".length();
            this.registerPacket(EnumPacketDirection.SERVERBOUND, C03PacketPlayer.C05PacketPlayerLook.class);
            "".length();
            this.registerPacket(EnumPacketDirection.SERVERBOUND, C03PacketPlayer.C06PacketPlayerPosLook.class);
            "".length();
            this.registerPacket(EnumPacketDirection.SERVERBOUND, C07PacketPlayerDigging.class);
            "".length();
            this.registerPacket(EnumPacketDirection.SERVERBOUND, C08PacketPlayerBlockPlacement.class);
            "".length();
            this.registerPacket(EnumPacketDirection.SERVERBOUND, C09PacketHeldItemChange.class);
            "".length();
            this.registerPacket(EnumPacketDirection.SERVERBOUND, C0APacketAnimation.class);
            "".length();
            this.registerPacket(EnumPacketDirection.SERVERBOUND, C0BPacketEntityAction.class);
            "".length();
            this.registerPacket(EnumPacketDirection.SERVERBOUND, C0CPacketInput.class);
            "".length();
            this.registerPacket(EnumPacketDirection.SERVERBOUND, C0DPacketCloseWindow.class);
            "".length();
            this.registerPacket(EnumPacketDirection.SERVERBOUND, C0EPacketClickWindow.class);
            "".length();
            this.registerPacket(EnumPacketDirection.SERVERBOUND, C0FPacketConfirmTransaction.class);
            "".length();
            this.registerPacket(EnumPacketDirection.SERVERBOUND, C10PacketCreativeInventoryAction.class);
            "".length();
            this.registerPacket(EnumPacketDirection.SERVERBOUND, C11PacketEnchantItem.class);
            "".length();
            this.registerPacket(EnumPacketDirection.SERVERBOUND, C12PacketUpdateSign.class);
            "".length();
            this.registerPacket(EnumPacketDirection.SERVERBOUND, C13PacketPlayerAbilities.class);
            "".length();
            this.registerPacket(EnumPacketDirection.SERVERBOUND, C14PacketTabComplete.class);
            "".length();
            this.registerPacket(EnumPacketDirection.SERVERBOUND, C15PacketClientSettings.class);
            "".length();
            this.registerPacket(EnumPacketDirection.SERVERBOUND, C16PacketClientStatus.class);
            "".length();
            this.registerPacket(EnumPacketDirection.SERVERBOUND, C17PacketCustomPayload.class);
            "".length();
            this.registerPacket(EnumPacketDirection.SERVERBOUND, C18PacketSpectate.class);
            "".length();
            this.registerPacket(EnumPacketDirection.SERVERBOUND, C19PacketResourcePackStatus.class);
            "".length();
        }
    }, 
    STATUS(EnumConnectionState.llIIllllIlIlII[3], EnumConnectionState.llIIllllIlIlII[2]) {
        {
            this.registerPacket(EnumPacketDirection.SERVERBOUND, C00PacketServerQuery.class);
            "".length();
            this.registerPacket(EnumPacketDirection.CLIENTBOUND, S00PacketServerInfo.class);
            "".length();
            this.registerPacket(EnumPacketDirection.SERVERBOUND, C01PacketPing.class);
            "".length();
            this.registerPacket(EnumPacketDirection.CLIENTBOUND, S01PacketPong.class);
            "".length();
        }
    };
    
    private static final /* synthetic */ String[] llIIllllIlIIlI;
    private final /* synthetic */ Map<EnumPacketDirection, BiMap<Integer, Class<? extends Packet>>> directionMaps;
    
    public int getId() {
        return this.id;
    }
    
    private static boolean lIIlIIIIIlIIIIIl(final int llllllllllllIllIlllIlIllIlIIIIlI, final int llllllllllllIllIlllIlIllIlIIIIIl) {
        return llllllllllllIllIlllIlIllIlIIIIlI > llllllllllllIllIlllIlIllIlIIIIIl;
    }
    
    private static void lIIlIIIIIIllllll() {
        (llIIllllIlIlII = new int[14])[0] = ((0x2D ^ 0x63) & ~(0xD2 ^ 0x9C));
        EnumConnectionState.llIIllllIlIlII[1] = -" ".length();
        EnumConnectionState.llIIllllIlIlII[2] = " ".length();
        EnumConnectionState.llIIllllIlIlII[3] = "  ".length();
        EnumConnectionState.llIIllllIlIlII[4] = "   ".length();
        EnumConnectionState.llIIllllIlIlII[5] = (145 + 175 - 259 + 125 ^ 42 + 85 + 27 + 36);
        EnumConnectionState.llIIllllIlIlII[6] = (0x43 ^ 0x46);
        EnumConnectionState.llIIllllIlIlII[7] = (0x43 ^ 0x45);
        EnumConnectionState.llIIllllIlIlII[8] = (0x71 ^ 0x69 ^ (0xA9 ^ 0xB6));
        EnumConnectionState.llIIllllIlIlII[9] = (0x6D ^ 0x65);
        EnumConnectionState.llIIllllIlIlII[10] = (0x17 ^ 0x1E);
        EnumConnectionState.llIIllllIlIlII[11] = (0xA2 ^ 0x96 ^ (0x24 ^ 0x1A));
        EnumConnectionState.llIIllllIlIlII[12] = (0x1D ^ 0x7 ^ (0x6E ^ 0x7F));
        EnumConnectionState.llIIllllIlIlII[13] = (0x98 ^ 0x94);
    }
    
    private static boolean lIIlIIIIIlIIIlll(final int llllllllllllIllIlllIlIllIlIIIllI, final int llllllllllllIllIlllIlIllIlIIIlIl) {
        return llllllllllllIllIlllIlIllIlIIIllI <= llllllllllllIllIlllIlIllIlIIIlIl;
    }
    
    private static String lIIlIIIIIIlllIll(final String llllllllllllIllIlllIlIllIllllIIl, final String llllllllllllIllIlllIlIllIllllIII) {
        try {
            final SecretKeySpec llllllllllllIllIlllIlIllIllllllI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIllIlllIlIllIllllIII.getBytes(StandardCharsets.UTF_8)), EnumConnectionState.llIIllllIlIlII[9]), "DES");
            final Cipher llllllllllllIllIlllIlIllIlllllIl = Cipher.getInstance("DES");
            llllllllllllIllIlllIlIllIlllllIl.init(EnumConnectionState.llIIllllIlIlII[3], llllllllllllIllIlllIlIllIllllllI);
            return new String(llllllllllllIllIlllIlIllIlllllIl.doFinal(Base64.getDecoder().decode(llllllllllllIllIlllIlIllIllllIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIllIlllIlIllIlllllII) {
            llllllllllllIllIlllIlIllIlllllII.printStackTrace();
            return null;
        }
    }
    
    private static String lIIlIIIIIIlllIIl(String llllllllllllIllIlllIlIllIlIllIIl, final String llllllllllllIllIlllIlIllIlIllIII) {
        llllllllllllIllIlllIlIllIlIllIIl = (float)new String(Base64.getDecoder().decode(((String)llllllllllllIllIlllIlIllIlIllIIl).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder llllllllllllIllIlllIlIllIlIlllII = new StringBuilder();
        final char[] llllllllllllIllIlllIlIllIlIllIll = llllllllllllIllIlllIlIllIlIllIII.toCharArray();
        int llllllllllllIllIlllIlIllIlIllIlI = EnumConnectionState.llIIllllIlIlII[0];
        final Exception llllllllllllIllIlllIlIllIlIlIlII = (Object)((String)llllllllllllIllIlllIlIllIlIllIIl).toCharArray();
        final String llllllllllllIllIlllIlIllIlIlIIll = (String)llllllllllllIllIlllIlIllIlIlIlII.length;
        Exception llllllllllllIllIlllIlIllIlIlIIlI = (Exception)EnumConnectionState.llIIllllIlIlII[0];
        while (lIIlIIIIIlIIlIII((int)llllllllllllIllIlllIlIllIlIlIIlI, (int)llllllllllllIllIlllIlIllIlIlIIll)) {
            final char llllllllllllIllIlllIlIllIlIlllll = llllllllllllIllIlllIlIllIlIlIlII[llllllllllllIllIlllIlIllIlIlIIlI];
            llllllllllllIllIlllIlIllIlIlllII.append((char)(llllllllllllIllIlllIlIllIlIlllll ^ llllllllllllIllIlllIlIllIlIllIll[llllllllllllIllIlllIlIllIlIllIlI % llllllllllllIllIlllIlIllIlIllIll.length]));
            "".length();
            ++llllllllllllIllIlllIlIllIlIllIlI;
            ++llllllllllllIllIlllIlIllIlIlIIlI;
            "".length();
            if (((0xD4 ^ 0x90) & ~(0x56 ^ 0x12)) != 0x0) {
                return null;
            }
        }
        return String.valueOf(llllllllllllIllIlllIlIllIlIlllII);
    }
    
    public static EnumConnectionState getFromPacket(final Packet llllllllllllIllIlllIlIlllIIlIIll) {
        return EnumConnectionState.STATES_BY_CLASS.get(llllllllllllIllIlllIlIlllIIlIIll.getClass());
    }
    
    private static void lIIlIIIIIIllllII() {
        (llIIllllIlIIlI = new String[EnumConnectionState.llIIllllIlIlII[13]])[EnumConnectionState.llIIllllIlIlII[0]] = lIIlIIIIIIlllIIl("JSkgMBwlKSU9ASo=", "mhntO");
        EnumConnectionState.llIIllllIlIIlI[EnumConnectionState.llIIllllIlIlII[2]] = lIIlIIIIIIlllIlI("Fqzjnml8CLM=", "GhKUC");
        EnumConnectionState.llIIllllIlIIlI[EnumConnectionState.llIIllllIlIlII[3]] = lIIlIIIIIIlllIlI("m5o6kfT7Izc=", "QaDNM");
        EnumConnectionState.llIIllllIlIIlI[EnumConnectionState.llIIllllIlIlII[4]] = lIIlIIIIIIlllIll("fxEpE/RztoY=", "EltKa");
        EnumConnectionState.llIIllllIlIIlI[EnumConnectionState.llIIllllIlIlII[5]] = lIIlIIIIIIlllIIl("MzsaOScTMUwoORUhAzskFnUlHGs=", "zUlXK");
        EnumConnectionState.llIIllllIlIIlI[EnumConnectionState.llIIllllIlIlII[6]] = lIIlIIIIIIlllIIl("Py8nJjUbbg==", "oNDMP");
        EnumConnectionState.llIIllllIlIIlI[EnumConnectionState.llIIllllIlIlII[7]] = lIIlIIIIIIlllIll("QvgYxtM+EnoQa6wH3Fkovkba7ud8FKXa5K6qzQ66PZG8TC0F+1BtgA==", "IKVnJ");
        EnumConnectionState.llIIllllIlIIlI[EnumConnectionState.llIIllllIlIlII[8]] = lIIlIIIIIIlllIIl("S0tLDSgFQR9OOw4HGB0gDAhLGiZL", "kfknI");
        EnumConnectionState.llIIllllIlIIlI[EnumConnectionState.llIIllllIlIlII[9]] = lIIlIIIIIIlllIll("lV19N5snNJM=", "gFsRA");
        EnumConnectionState.llIIllllIlIIlI[EnumConnectionState.llIIllllIlIlII[10]] = lIIlIIIIIIlllIll("efGQqhkKDmJsufRzd7+0XyelJxPKo7FMnt+O+++fEHE=", "KzVdL");
        EnumConnectionState.llIIllllIlIIlI[EnumConnectionState.llIIllllIlIlII[11]] = lIIlIIIIIIlllIll("RAe7U1AKxGHOSLIMBoGmUw==", "Tqnvi");
        EnumConnectionState.llIIllllIlIIlI[EnumConnectionState.llIIllllIlIlII[12]] = lIIlIIIIIIlllIIl("RggmTjQKEzAPMR9BPgA6EQ91GjpGKBFO", "faUnU");
    }
    
    static {
        lIIlIIIIIIllllll();
        lIIlIIIIIIllllII();
        final EnumConnectionState[] enum$VALUES = new EnumConnectionState[EnumConnectionState.llIIllllIlIlII[5]];
        enum$VALUES[EnumConnectionState.llIIllllIlIlII[0]] = EnumConnectionState.HANDSHAKING;
        enum$VALUES[EnumConnectionState.llIIllllIlIlII[2]] = EnumConnectionState.PLAY;
        enum$VALUES[EnumConnectionState.llIIllllIlIlII[3]] = EnumConnectionState.STATUS;
        enum$VALUES[EnumConnectionState.llIIllllIlIlII[4]] = EnumConnectionState.LOGIN;
        ENUM$VALUES = enum$VALUES;
        EnumConnectionState.field_181136_e = EnumConnectionState.llIIllllIlIlII[1];
        EnumConnectionState.field_181137_f = EnumConnectionState.llIIllllIlIlII[3];
        STATES_BY_ID = new EnumConnectionState[EnumConnectionState.field_181137_f - EnumConnectionState.field_181136_e + EnumConnectionState.llIIllllIlIlII[2]];
        STATES_BY_CLASS = Maps.newHashMap();
        final double llllllllllllIllIlllIlIllllIlIIII;
        final double llllllllllllIllIlllIlIllllIlIIIl = ((EnumConnectionState[])(Object)(llllllllllllIllIlllIlIllllIlIIII = (double)(Object)values())).length;
        Exception llllllllllllIllIlllIlIllllIlIIlI = (Exception)EnumConnectionState.llIIllllIlIlII[0];
        "".length();
        if (((0x16 ^ 0x7B ^ (0x37 ^ 0x43)) & (0x2 ^ 0x6 ^ (0x2B ^ 0x36) ^ -" ".length())) != 0x0) {
            return;
        }
        while (!lIIlIIIIIlIIIIII((int)llllllllllllIllIlllIlIllllIlIIlI, (int)llllllllllllIllIlllIlIllllIlIIIl)) {
            final EnumConnectionState llllllllllllIllIlllIlIllllIllIII = llllllllllllIllIlllIlIllllIlIIII[llllllllllllIllIlllIlIllllIlIIlI];
            final int llllllllllllIllIlllIlIllllIlIlll = llllllllllllIllIlllIlIllllIllIII.getId();
            if (!lIIlIIIIIlIIIIII(llllllllllllIllIlllIlIllllIlIlll, EnumConnectionState.field_181136_e) || lIIlIIIIIlIIIIIl(llllllllllllIllIlllIlIllllIlIlll, EnumConnectionState.field_181137_f)) {
                throw new Error(String.valueOf(new StringBuilder(EnumConnectionState.llIIllllIlIIlI[EnumConnectionState.llIIllllIlIlII[5]]).append(Integer.toString(llllllllllllIllIlllIlIllllIlIlll))));
            }
            EnumConnectionState.STATES_BY_ID[llllllllllllIllIlllIlIllllIlIlll - EnumConnectionState.field_181136_e] = llllllllllllIllIlllIlIllllIllIII;
            final long llllllllllllIllIlllIlIllllIIllIl = (long)llllllllllllIllIlllIlIllllIllIII.directionMaps.keySet().iterator();
            "".length();
            if (((0xD5 ^ 0x93) & ~(0x27 ^ 0x61)) == "   ".length()) {
                return;
            }
            while (!lIIlIIIIIlIIIlII(((Iterator)llllllllllllIllIlllIlIllllIIllIl).hasNext() ? 1 : 0)) {
                final EnumPacketDirection llllllllllllIllIlllIlIllllIlIllI = ((Iterator<EnumPacketDirection>)llllllllllllIllIlllIlIllllIIllIl).next();
                final boolean llllllllllllIllIlllIlIllllIIlIll = (boolean)llllllllllllIllIlllIlIllllIllIII.directionMaps.get(llllllllllllIllIlllIlIllllIlIllI).values().iterator();
                "".length();
                if ("  ".length() <= 0) {
                    return;
                }
                while (!lIIlIIIIIlIIIlII(((Iterator)llllllllllllIllIlllIlIllllIIlIll).hasNext() ? 1 : 0)) {
                    final Class<? extends Packet> llllllllllllIllIlllIlIllllIlIlIl = ((Iterator<Class<? extends Packet>>)llllllllllllIllIlllIlIllllIIlIll).next();
                    if (lIIlIIIIIlIIIIlI(EnumConnectionState.STATES_BY_CLASS.containsKey(llllllllllllIllIlllIlIllllIlIlIl) ? 1 : 0) && lIIlIIIIIlIIIIll(EnumConnectionState.STATES_BY_CLASS.get(llllllllllllIllIlllIlIllllIlIlIl), llllllllllllIllIlllIlIllllIllIII)) {
                        throw new Error(String.valueOf(new StringBuilder(EnumConnectionState.llIIllllIlIIlI[EnumConnectionState.llIIllllIlIlII[6]]).append(llllllllllllIllIlllIlIllllIlIlIl).append(EnumConnectionState.llIIllllIlIIlI[EnumConnectionState.llIIllllIlIlII[7]]).append(EnumConnectionState.STATES_BY_CLASS.get(llllllllllllIllIlllIlIllllIlIlIl)).append(EnumConnectionState.llIIllllIlIIlI[EnumConnectionState.llIIllllIlIlII[8]]).append(llllllllllllIllIlllIlIllllIllIII)));
                    }
                    try {
                        llllllllllllIllIlllIlIllllIlIlIl.newInstance();
                        "".length();
                        "".length();
                        if (((0xDE ^ 0xC5) & ~(0x7C ^ 0x67)) > " ".length()) {
                            return;
                        }
                    }
                    catch (Throwable llllllllllllIllIlllIlIllllIlIlII) {
                        throw new Error(String.valueOf(new StringBuilder(EnumConnectionState.llIIllllIlIIlI[EnumConnectionState.llIIllllIlIlII[9]]).append(llllllllllllIllIlllIlIllllIlIlIl).append(EnumConnectionState.llIIllllIlIIlI[EnumConnectionState.llIIllllIlIlII[10]]).append(llllllllllllIllIlllIlIllllIlIlIl)));
                    }
                    EnumConnectionState.STATES_BY_CLASS.put(llllllllllllIllIlllIlIllllIlIlIl, llllllllllllIllIlllIlIllllIllIII);
                    "".length();
                }
            }
            ++llllllllllllIllIlllIlIllllIlIIlI;
        }
    }
    
    private static String lIIlIIIIIIlllIlI(final String llllllllllllIllIlllIlIllIllIllII, final String llllllllllllIllIlllIlIllIllIlIll) {
        try {
            final SecretKeySpec llllllllllllIllIlllIlIllIlllIIIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIllIlllIlIllIllIlIll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher llllllllllllIllIlllIlIllIlllIIII = Cipher.getInstance("Blowfish");
            llllllllllllIllIlllIlIllIlllIIII.init(EnumConnectionState.llIIllllIlIlII[3], llllllllllllIllIlllIlIllIlllIIIl);
            return new String(llllllllllllIllIlllIlIllIlllIIII.doFinal(Base64.getDecoder().decode(llllllllllllIllIlllIlIllIllIllII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIllIlllIlIllIllIllll) {
            llllllllllllIllIlllIlIllIllIllll.printStackTrace();
            return null;
        }
    }
    
    private EnumConnectionState(final String llllllllllllIllIlllIlIllllIIIIlI, final int llllllllllllIllIlllIlIllllIIIIIl, final int llllllllllllIllIlllIlIllllIIIlII) {
        this.directionMaps = (Map<EnumPacketDirection, BiMap<Integer, Class<? extends Packet>>>)Maps.newEnumMap((Class)EnumPacketDirection.class);
        this.id = llllllllllllIllIlllIlIllllIIIlII;
    }
    
    public Integer getPacketId(final EnumPacketDirection llllllllllllIllIlllIlIlllIlIlIIl, final Packet llllllllllllIllIlllIlIlllIlIlIII) {
        return (Integer)this.directionMaps.get(llllllllllllIllIlllIlIlllIlIlIIl).inverse().get((Object)llllllllllllIllIlllIlIlllIlIlIII.getClass());
    }
    
    public static EnumConnectionState getById(final int llllllllllllIllIlllIlIlllIIlIlll) {
        EnumConnectionState enumConnectionState;
        if (lIIlIIIIIlIIIIII(llllllllllllIllIlllIlIlllIIlIlll, EnumConnectionState.field_181136_e) && lIIlIIIIIlIIIlll(llllllllllllIllIlllIlIlllIIlIlll, EnumConnectionState.field_181137_f)) {
            enumConnectionState = EnumConnectionState.STATES_BY_ID[llllllllllllIllIlllIlIlllIIlIlll - EnumConnectionState.field_181136_e];
            "".length();
            if ("  ".length() > "   ".length()) {
                return null;
            }
        }
        else {
            enumConnectionState = null;
        }
        return enumConnectionState;
    }
    
    private static boolean lIIlIIIIIlIIIIlI(final int llllllllllllIllIlllIlIllIIlllIIl) {
        return llllllllllllIllIlllIlIllIIlllIIl != 0;
    }
    
    private static boolean lIIlIIIIIlIIlIII(final int llllllllllllIllIlllIlIllIlIIlIlI, final int llllllllllllIllIlllIlIllIlIIlIIl) {
        return llllllllllllIllIlllIlIllIlIIlIlI < llllllllllllIllIlllIlIllIlIIlIIl;
    }
    
    private static boolean lIIlIIIIIlIIIlIl(final Object llllllllllllIllIlllIlIllIIlllIll) {
        return llllllllllllIllIlllIlIllIIlllIll == null;
    }
    
    private static boolean lIIlIIIIIlIIIIII(final int llllllllllllIllIlllIlIllIlIIlllI, final int llllllllllllIllIlllIlIllIlIIllIl) {
        return llllllllllllIllIlllIlIllIlIIlllI >= llllllllllllIllIlllIlIllIlIIllIl;
    }
    
    private static boolean lIIlIIIIIlIIIlII(final int llllllllllllIllIlllIlIllIIllIlll) {
        return llllllllllllIllIlllIlIllIIllIlll == 0;
    }
    
    public Packet getPacket(final EnumPacketDirection llllllllllllIllIlllIlIlllIlIIIlI, final int llllllllllllIllIlllIlIlllIIlllIl) throws IllegalAccessException, InstantiationException {
        final Class<? extends Packet> llllllllllllIllIlllIlIlllIlIIIII = (Class<? extends Packet>)this.directionMaps.get(llllllllllllIllIlllIlIlllIlIIIlI).get((Object)llllllllllllIllIlllIlIlllIIlllIl);
        Packet packet;
        if (lIIlIIIIIlIIIlIl(llllllllllllIllIlllIlIlllIlIIIII)) {
            packet = null;
            "".length();
            if (null != null) {
                return null;
            }
        }
        else {
            packet = (Packet)llllllllllllIllIlllIlIlllIlIIIII.newInstance();
        }
        return packet;
    }
    
    protected EnumConnectionState registerPacket(final EnumPacketDirection llllllllllllIllIlllIlIlllIllIlII, final Class<? extends Packet> llllllllllllIllIlllIlIlllIllIIll) {
        BiMap<Integer, Class<? extends Packet>> llllllllllllIllIlllIlIlllIllIlll = this.directionMaps.get(llllllllllllIllIlllIlIlllIllIlII);
        if (lIIlIIIIIlIIIlIl(llllllllllllIllIlllIlIlllIllIlll)) {
            llllllllllllIllIlllIlIlllIllIlll = (BiMap<Integer, Class<? extends Packet>>)HashBiMap.create();
            this.directionMaps.put(llllllllllllIllIlllIlIlllIllIlII, llllllllllllIllIlllIlIlllIllIlll);
            "".length();
        }
        if (lIIlIIIIIlIIIIlI(llllllllllllIllIlllIlIlllIllIlll.containsValue((Object)llllllllllllIllIlllIlIlllIllIIll) ? 1 : 0)) {
            final String llllllllllllIllIlllIlIlllIllIllI = String.valueOf(new StringBuilder().append(llllllllllllIllIlllIlIlllIllIlII).append(EnumConnectionState.llIIllllIlIIlI[EnumConnectionState.llIIllllIlIlII[11]]).append(llllllllllllIllIlllIlIlllIllIIll).append(EnumConnectionState.llIIllllIlIIlI[EnumConnectionState.llIIllllIlIlII[12]]).append(llllllllllllIllIlllIlIlllIllIlll.inverse().get((Object)llllllllllllIllIlllIlIlllIllIIll)));
            LogManager.getLogger().fatal(llllllllllllIllIlllIlIlllIllIllI);
            throw new IllegalArgumentException(llllllllllllIllIlllIlIlllIllIllI);
        }
        llllllllllllIllIlllIlIlllIllIlll.put((Object)llllllllllllIllIlllIlIlllIllIlll.size(), (Object)llllllllllllIllIlllIlIlllIllIIll);
        "".length();
        return this;
    }
    
    private static boolean lIIlIIIIIlIIIIll(final Object llllllllllllIllIlllIlIllIIlllllI, final Object llllllllllllIllIlllIlIllIIllllIl) {
        return llllllllllllIllIlllIlIllIIlllllI != llllllllllllIllIlllIlIllIIllllIl;
    }
}
