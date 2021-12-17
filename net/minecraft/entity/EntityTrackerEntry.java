// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.entity;

import java.util.Iterator;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import net.minecraft.world.storage.MapData;
import net.minecraft.network.play.server.S19PacketEntityHeadLook;
import net.minecraft.network.play.server.S18PacketEntityTeleport;
import net.minecraft.network.play.server.S14PacketEntity;
import net.minecraft.init.Items;
import net.minecraft.item.ItemMap;
import java.util.List;
import com.google.common.collect.Sets;
import org.apache.logging.log4j.LogManager;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.ai.attributes.IAttributeInstance;
import java.util.Collection;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.network.play.server.S1DPacketEntityEffect;
import net.minecraft.potion.PotionEffect;
import net.minecraft.network.play.server.S0APacketUseBed;
import net.minecraft.network.play.server.S04PacketEntityEquipment;
import net.minecraft.network.play.server.S1BPacketEntityAttach;
import net.minecraft.network.play.server.S12PacketEntityVelocity;
import net.minecraft.network.play.server.S20PacketEntityProperties;
import net.minecraft.entity.ai.attributes.ServersideAttributeMap;
import net.minecraft.network.play.server.S49PacketUpdateEntityNBT;
import net.minecraft.network.play.server.S1CPacketEntityMetadata;
import net.minecraft.util.BlockPos;
import net.minecraft.network.play.server.S11PacketSpawnExperienceOrb;
import net.minecraft.entity.item.EntityXPOrb;
import net.minecraft.entity.item.EntityItemFrame;
import net.minecraft.network.play.server.S10PacketSpawnPainting;
import net.minecraft.entity.item.EntityPainting;
import net.minecraft.entity.item.EntityArmorStand;
import net.minecraft.block.Block;
import net.minecraft.entity.item.EntityFallingBlock;
import net.minecraft.entity.item.EntityEnderCrystal;
import net.minecraft.entity.item.EntityTNTPrimed;
import net.minecraft.entity.projectile.EntityEgg;
import net.minecraft.entity.projectile.EntityWitherSkull;
import net.minecraft.entity.projectile.EntitySmallFireball;
import net.minecraft.entity.projectile.EntityFireball;
import net.minecraft.entity.item.EntityFireworkRocket;
import net.minecraft.entity.item.EntityEnderEye;
import net.minecraft.entity.item.EntityEnderPearl;
import net.minecraft.entity.item.EntityExpBottle;
import net.minecraft.entity.projectile.EntityPotion;
import net.minecraft.entity.projectile.EntitySnowball;
import net.minecraft.entity.projectile.EntityArrow;
import net.minecraft.entity.projectile.EntityFishHook;
import net.minecraft.network.play.server.S0FPacketSpawnMob;
import net.minecraft.util.MathHelper;
import net.minecraft.entity.passive.IAnimals;
import net.minecraft.entity.item.EntityBoat;
import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.network.play.server.S0CPacketSpawnPlayer;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.network.play.server.S0EPacketSpawnObject;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.network.Packet;
import net.minecraft.entity.player.EntityPlayerMP;
import java.util.Set;
import org.apache.logging.log4j.Logger;

public class EntityTrackerEntry
{
    public /* synthetic */ int updateFrequency;
    public /* synthetic */ int trackingDistanceThreshold;
    public /* synthetic */ int encodedPosZ;
    private /* synthetic */ double lastTrackedEntityPosX;
    private /* synthetic */ boolean ridingEntity;
    public /* synthetic */ double motionZ;
    public /* synthetic */ int lastHeadMotion;
    public /* synthetic */ double lastTrackedEntityMotionY;
    public /* synthetic */ Entity trackedEntity;
    private static final /* synthetic */ Logger logger;
    private /* synthetic */ Entity field_85178_v;
    private /* synthetic */ double lastTrackedEntityPosZ;
    private /* synthetic */ boolean firstUpdateDone;
    public /* synthetic */ int encodedRotationYaw;
    public /* synthetic */ int updateCounter;
    private static final /* synthetic */ int[] lllllIIIIllII;
    public /* synthetic */ int encodedPosY;
    private /* synthetic */ int ticksSinceLastForcedTeleport;
    private /* synthetic */ boolean onGround;
    private /* synthetic */ double lastTrackedEntityPosY;
    public /* synthetic */ Set<EntityPlayerMP> trackingPlayers;
    public /* synthetic */ int encodedRotationPitch;
    private static final /* synthetic */ String[] lllllIIIIlIIl;
    public /* synthetic */ boolean playerEntitiesUpdated;
    private /* synthetic */ boolean sendVelocityUpdates;
    public /* synthetic */ double lastTrackedEntityMotionX;
    public /* synthetic */ int encodedPosX;
    
    private static boolean lIlIllIIllIIlll(final int lllllllllllllIlIllIIIIlllIIllIlI, final int lllllllllllllIlIllIIIIlllIIllIIl) {
        return lllllllllllllIlIllIIIIlllIIllIlI == lllllllllllllIlIllIIIIlllIIllIIl;
    }
    
    private static boolean lIlIllIIllIlllI(final int lllllllllllllIlIllIIIIlllIIlIIlI, final int lllllllllllllIlIllIIIIlllIIlIIIl) {
        return lllllllllllllIlIllIIIIlllIIlIIlI < lllllllllllllIlIllIIIIlllIIlIIIl;
    }
    
    private Packet func_151260_c() {
        if (lIlIllIIllIIllI(this.trackedEntity.isDead ? 1 : 0)) {
            EntityTrackerEntry.logger.warn(EntityTrackerEntry.lllllIIIIlIIl[EntityTrackerEntry.lllllIIIIllII[1]]);
        }
        if (lIlIllIIllIIllI((this.trackedEntity instanceof EntityItem) ? 1 : 0)) {
            return new S0EPacketSpawnObject(this.trackedEntity, EntityTrackerEntry.lllllIIIIllII[10], EntityTrackerEntry.lllllIIIIllII[0]);
        }
        if (lIlIllIIllIIllI((this.trackedEntity instanceof EntityPlayerMP) ? 1 : 0)) {
            return new S0CPacketSpawnPlayer((EntityPlayer)this.trackedEntity);
        }
        if (lIlIllIIllIIllI((this.trackedEntity instanceof EntityMinecart) ? 1 : 0)) {
            final EntityMinecart lllllllllllllIlIllIIIIllllIllIII = (EntityMinecart)this.trackedEntity;
            return new S0EPacketSpawnObject(this.trackedEntity, EntityTrackerEntry.lllllIIIIllII[3], lllllllllllllIlIllIIIIllllIllIII.getMinecartType().getNetworkID());
        }
        if (lIlIllIIllIIllI((this.trackedEntity instanceof EntityBoat) ? 1 : 0)) {
            return new S0EPacketSpawnObject(this.trackedEntity, EntityTrackerEntry.lllllIIIIllII[0]);
        }
        if (lIlIllIIllIIllI((this.trackedEntity instanceof IAnimals) ? 1 : 0)) {
            this.lastHeadMotion = MathHelper.floor_float(this.trackedEntity.getRotationYawHead() * 256.0f / 360.0f);
            return new S0FPacketSpawnMob((EntityLivingBase)this.trackedEntity);
        }
        if (lIlIllIIllIIllI((this.trackedEntity instanceof EntityFishHook) ? 1 : 0)) {
            final Entity lllllllllllllIlIllIIIIllllIlIlll = ((EntityFishHook)this.trackedEntity).angler;
            final Entity trackedEntity = this.trackedEntity;
            final int lllllllllllllIIlllIIllIllIIIIlll = EntityTrackerEntry.lllllIIIIllII[11];
            int lllllllllllllIIlllIIllIllIIIlllI;
            if (lIlIllIIllIlIll(lllllllllllllIlIllIIIIllllIlIlll)) {
                lllllllllllllIIlllIIllIllIIIlllI = lllllllllllllIlIllIIIIllllIlIlll.getEntityId();
                "".length();
                if ((0x78 ^ 0x7C) > (0x51 ^ 0x55)) {
                    return null;
                }
            }
            else {
                lllllllllllllIIlllIIllIllIIIlllI = this.trackedEntity.getEntityId();
            }
            return new S0EPacketSpawnObject(trackedEntity, lllllllllllllIIlllIIllIllIIIIlll, lllllllllllllIIlllIIllIllIIIlllI);
        }
        if (lIlIllIIllIIllI((this.trackedEntity instanceof EntityArrow) ? 1 : 0)) {
            final Entity lllllllllllllIlIllIIIIllllIlIllI = ((EntityArrow)this.trackedEntity).shootingEntity;
            final Entity trackedEntity2 = this.trackedEntity;
            final int lllllllllllllIIlllIIllIllIIIIlll2 = EntityTrackerEntry.lllllIIIIllII[2];
            int lllllllllllllIIlllIIllIllIIIlllI2;
            if (lIlIllIIllIlIll(lllllllllllllIlIllIIIIllllIlIllI)) {
                lllllllllllllIIlllIIllIllIIIlllI2 = lllllllllllllIlIllIIIIllllIlIllI.getEntityId();
                "".length();
                if ((0xA1 ^ 0xA5) == 0x0) {
                    return null;
                }
            }
            else {
                lllllllllllllIIlllIIllIllIIIlllI2 = this.trackedEntity.getEntityId();
            }
            return new S0EPacketSpawnObject(trackedEntity2, lllllllllllllIIlllIIllIllIIIIlll2, lllllllllllllIIlllIIllIllIIIlllI2);
        }
        if (lIlIllIIllIIllI((this.trackedEntity instanceof EntitySnowball) ? 1 : 0)) {
            return new S0EPacketSpawnObject(this.trackedEntity, EntityTrackerEntry.lllllIIIIllII[12]);
        }
        if (lIlIllIIllIIllI((this.trackedEntity instanceof EntityPotion) ? 1 : 0)) {
            return new S0EPacketSpawnObject(this.trackedEntity, EntityTrackerEntry.lllllIIIIllII[13], ((EntityPotion)this.trackedEntity).getPotionDamage());
        }
        if (lIlIllIIllIIllI((this.trackedEntity instanceof EntityExpBottle) ? 1 : 0)) {
            return new S0EPacketSpawnObject(this.trackedEntity, EntityTrackerEntry.lllllIIIIllII[14]);
        }
        if (lIlIllIIllIIllI((this.trackedEntity instanceof EntityEnderPearl) ? 1 : 0)) {
            return new S0EPacketSpawnObject(this.trackedEntity, EntityTrackerEntry.lllllIIIIllII[15]);
        }
        if (lIlIllIIllIIllI((this.trackedEntity instanceof EntityEnderEye) ? 1 : 0)) {
            return new S0EPacketSpawnObject(this.trackedEntity, EntityTrackerEntry.lllllIIIIllII[16]);
        }
        if (lIlIllIIllIIllI((this.trackedEntity instanceof EntityFireworkRocket) ? 1 : 0)) {
            return new S0EPacketSpawnObject(this.trackedEntity, EntityTrackerEntry.lllllIIIIllII[17]);
        }
        if (lIlIllIIllIIllI((this.trackedEntity instanceof EntityFireball) ? 1 : 0)) {
            final EntityFireball lllllllllllllIlIllIIIIllllIlIlIl = (EntityFireball)this.trackedEntity;
            S0EPacketSpawnObject lllllllllllllIlIllIIIIllllIlIlII = null;
            int lllllllllllllIlIllIIIIllllIlIIll = EntityTrackerEntry.lllllIIIIllII[18];
            if (lIlIllIIllIIllI((this.trackedEntity instanceof EntitySmallFireball) ? 1 : 0)) {
                lllllllllllllIlIllIIIIllllIlIIll = EntityTrackerEntry.lllllIIIIllII[19];
                "".length();
                if (" ".length() != " ".length()) {
                    return null;
                }
            }
            else if (lIlIllIIllIIllI((this.trackedEntity instanceof EntityWitherSkull) ? 1 : 0)) {
                lllllllllllllIlIllIIIIllllIlIIll = EntityTrackerEntry.lllllIIIIllII[20];
            }
            if (lIlIllIIllIlIll(lllllllllllllIlIllIIIIllllIlIlIl.shootingEntity)) {
                lllllllllllllIlIllIIIIllllIlIlII = new S0EPacketSpawnObject(this.trackedEntity, lllllllllllllIlIllIIIIllllIlIIll, ((EntityFireball)this.trackedEntity).shootingEntity.getEntityId());
                "".length();
                if ("  ".length() < ((0xB9 ^ 0x96 ^ (0xB ^ 0x7C)) & (0x71 ^ 0x32 ^ (0xB6 ^ 0xAD) ^ -" ".length()))) {
                    return null;
                }
            }
            else {
                lllllllllllllIlIllIIIIllllIlIlII = new S0EPacketSpawnObject(this.trackedEntity, lllllllllllllIlIllIIIIllllIlIIll, EntityTrackerEntry.lllllIIIIllII[1]);
            }
            lllllllllllllIlIllIIIIllllIlIlII.setSpeedX((int)(lllllllllllllIlIllIIIIllllIlIlIl.accelerationX * 8000.0));
            lllllllllllllIlIllIIIIllllIlIlII.setSpeedY((int)(lllllllllllllIlIllIIIIllllIlIlIl.accelerationY * 8000.0));
            lllllllllllllIlIllIIIIllllIlIlII.setSpeedZ((int)(lllllllllllllIlIllIIIIllllIlIlIl.accelerationZ * 8000.0));
            return lllllllllllllIlIllIIIIllllIlIlII;
        }
        if (lIlIllIIllIIllI((this.trackedEntity instanceof EntityEgg) ? 1 : 0)) {
            return new S0EPacketSpawnObject(this.trackedEntity, EntityTrackerEntry.lllllIIIIllII[21]);
        }
        if (lIlIllIIllIIllI((this.trackedEntity instanceof EntityTNTPrimed) ? 1 : 0)) {
            return new S0EPacketSpawnObject(this.trackedEntity, EntityTrackerEntry.lllllIIIIllII[22]);
        }
        if (lIlIllIIllIIllI((this.trackedEntity instanceof EntityEnderCrystal) ? 1 : 0)) {
            return new S0EPacketSpawnObject(this.trackedEntity, EntityTrackerEntry.lllllIIIIllII[23]);
        }
        if (lIlIllIIllIIllI((this.trackedEntity instanceof EntityFallingBlock) ? 1 : 0)) {
            final EntityFallingBlock lllllllllllllIlIllIIIIllllIlIIlI = (EntityFallingBlock)this.trackedEntity;
            return new S0EPacketSpawnObject(this.trackedEntity, EntityTrackerEntry.lllllIIIIllII[24], Block.getStateId(lllllllllllllIlIllIIIIllllIlIIlI.getBlock()));
        }
        if (lIlIllIIllIIllI((this.trackedEntity instanceof EntityArmorStand) ? 1 : 0)) {
            return new S0EPacketSpawnObject(this.trackedEntity, EntityTrackerEntry.lllllIIIIllII[25]);
        }
        if (lIlIllIIllIIllI((this.trackedEntity instanceof EntityPainting) ? 1 : 0)) {
            return new S10PacketSpawnPainting((EntityPainting)this.trackedEntity);
        }
        if (lIlIllIIllIIllI((this.trackedEntity instanceof EntityItemFrame) ? 1 : 0)) {
            final EntityItemFrame lllllllllllllIlIllIIIIllllIlIIIl = (EntityItemFrame)this.trackedEntity;
            final S0EPacketSpawnObject lllllllllllllIlIllIIIIllllIlIIII = new S0EPacketSpawnObject(this.trackedEntity, EntityTrackerEntry.lllllIIIIllII[26], lllllllllllllIlIllIIIIllllIlIIIl.facingDirection.getHorizontalIndex());
            final BlockPos lllllllllllllIlIllIIIIllllIIllll = lllllllllllllIlIllIIIIllllIlIIIl.getHangingPosition();
            lllllllllllllIlIllIIIIllllIlIIII.setX(MathHelper.floor_float((float)(lllllllllllllIlIllIIIIllllIIllll.getX() * EntityTrackerEntry.lllllIIIIllII[9])));
            lllllllllllllIlIllIIIIllllIlIIII.setY(MathHelper.floor_float((float)(lllllllllllllIlIllIIIIllllIIllll.getY() * EntityTrackerEntry.lllllIIIIllII[9])));
            lllllllllllllIlIllIIIIllllIlIIII.setZ(MathHelper.floor_float((float)(lllllllllllllIlIllIIIIllllIIllll.getZ() * EntityTrackerEntry.lllllIIIIllII[9])));
            return lllllllllllllIlIllIIIIllllIlIIII;
        }
        if (lIlIllIIllIIllI((this.trackedEntity instanceof EntityLeashKnot) ? 1 : 0)) {
            final EntityLeashKnot lllllllllllllIlIllIIIIllllIIlllI = (EntityLeashKnot)this.trackedEntity;
            final S0EPacketSpawnObject lllllllllllllIlIllIIIIllllIIllIl = new S0EPacketSpawnObject(this.trackedEntity, EntityTrackerEntry.lllllIIIIllII[27]);
            final BlockPos lllllllllllllIlIllIIIIllllIIllII = lllllllllllllIlIllIIIIllllIIlllI.getHangingPosition();
            lllllllllllllIlIllIIIIllllIIllIl.setX(MathHelper.floor_float((float)(lllllllllllllIlIllIIIIllllIIllII.getX() * EntityTrackerEntry.lllllIIIIllII[9])));
            lllllllllllllIlIllIIIIllllIIllIl.setY(MathHelper.floor_float((float)(lllllllllllllIlIllIIIIllllIIllII.getY() * EntityTrackerEntry.lllllIIIIllII[9])));
            lllllllllllllIlIllIIIIllllIIllIl.setZ(MathHelper.floor_float((float)(lllllllllllllIlIllIIIIllllIIllII.getZ() * EntityTrackerEntry.lllllIIIIllII[9])));
            return lllllllllllllIlIllIIIIllllIIllIl;
        }
        if (lIlIllIIllIIllI((this.trackedEntity instanceof EntityXPOrb) ? 1 : 0)) {
            return new S11PacketSpawnExperienceOrb((EntityXPOrb)this.trackedEntity);
        }
        throw new IllegalArgumentException(String.valueOf(new StringBuilder(EntityTrackerEntry.lllllIIIIlIIl[EntityTrackerEntry.lllllIIIIllII[0]]).append(this.trackedEntity.getClass()).append(EntityTrackerEntry.lllllIIIIlIIl[EntityTrackerEntry.lllllIIIIllII[10]])));
    }
    
    private static void lIlIllIIlIllllI() {
        (lllllIIIIlIIl = new String[EntityTrackerEntry.lllllIIIIllII[28]])[EntityTrackerEntry.lllllIIIIllII[1]] = lIlIllIIlIlllII("PCgbBSUTIwhGLB4pPwcuESgbRisVP08UKBciGQMpWigBEiQONA==", "zMofM");
        EntityTrackerEntry.lllllIIIIlIIl[EntityTrackerEntry.lllllIIIIllII[0]] = lIlIllIIlIlllII("KQs4Vx9NDzgfHE0MOQdLGQt2EQ8JRA==", "mdVpk");
        EntityTrackerEntry.lllllIIIIlIIl[EntityTrackerEntry.lllllIIIIllII[10]] = lIlIllIIlIlllIl("HTwJ75+K9yA=", "bdrBk");
    }
    
    private static int lIlIllIIllIlIII(final double n, final double n2) {
        return dcmpl(n, n2);
    }
    
    private static boolean lIlIllIIllIlIll(final Object lllllllllllllIlIllIIIIlllIIIIIll) {
        return lllllllllllllIlIllIIIIlllIIIIIll != null;
    }
    
    public void removeFromTrackedPlayers(final EntityPlayerMP lllllllllllllIlIllIIIlIIIIIlIlII) {
        if (lIlIllIIllIIllI(this.trackingPlayers.contains(lllllllllllllIlIllIIIlIIIIIlIlII) ? 1 : 0)) {
            lllllllllllllIlIllIIIlIIIIIlIlII.removeEntity(this.trackedEntity);
            this.trackingPlayers.remove(lllllllllllllIlIllIIIlIIIIIlIlII);
            "".length();
        }
    }
    
    public void updatePlayerEntity(final EntityPlayerMP lllllllllllllIlIllIIIlIIIIIIlIIl) {
        if (lIlIllIIlllIIlI(lllllllllllllIlIllIIIlIIIIIIlIIl, this.trackedEntity)) {
            if (lIlIllIIllIIllI(this.func_180233_c(lllllllllllllIlIllIIIlIIIIIIlIIl) ? 1 : 0)) {
                if (lIlIllIIllIllII(this.trackingPlayers.contains(lllllllllllllIlIllIIIlIIIIIIlIIl) ? 1 : 0) && (!lIlIllIIllIllII(this.isPlayerWatchingThisChunk(lllllllllllllIlIllIIIlIIIIIIlIIl) ? 1 : 0) || lIlIllIIllIIllI(this.trackedEntity.forceSpawn ? 1 : 0))) {
                    this.trackingPlayers.add(lllllllllllllIlIllIIIlIIIIIIlIIl);
                    "".length();
                    final Packet lllllllllllllIlIllIIIlIIIIIIlIII = this.func_151260_c();
                    lllllllllllllIlIllIIIlIIIIIIlIIl.playerNetServerHandler.sendPacket(lllllllllllllIlIllIIIlIIIIIIlIII);
                    if (lIlIllIIllIllII(this.trackedEntity.getDataWatcher().getIsBlank() ? 1 : 0)) {
                        lllllllllllllIlIllIIIlIIIIIIlIIl.playerNetServerHandler.sendPacket(new S1CPacketEntityMetadata(this.trackedEntity.getEntityId(), this.trackedEntity.getDataWatcher(), (boolean)(EntityTrackerEntry.lllllIIIIllII[0] != 0)));
                    }
                    final NBTTagCompound lllllllllllllIlIllIIIlIIIIIIIlll = this.trackedEntity.getNBTTagCompound();
                    if (lIlIllIIllIlIll(lllllllllllllIlIllIIIlIIIIIIIlll)) {
                        lllllllllllllIlIllIIIlIIIIIIlIIl.playerNetServerHandler.sendPacket(new S49PacketUpdateEntityNBT(this.trackedEntity.getEntityId(), lllllllllllllIlIllIIIlIIIIIIIlll));
                    }
                    if (lIlIllIIllIIllI((this.trackedEntity instanceof EntityLivingBase) ? 1 : 0)) {
                        final ServersideAttributeMap lllllllllllllIlIllIIIlIIIIIIIllI = (ServersideAttributeMap)((EntityLivingBase)this.trackedEntity).getAttributeMap();
                        final Collection<IAttributeInstance> lllllllllllllIlIllIIIlIIIIIIIlIl = lllllllllllllIlIllIIIlIIIIIIIllI.getWatchedAttributes();
                        if (lIlIllIIllIllII(lllllllllllllIlIllIIIlIIIIIIIlIl.isEmpty() ? 1 : 0)) {
                            lllllllllllllIlIllIIIlIIIIIIlIIl.playerNetServerHandler.sendPacket(new S20PacketEntityProperties(this.trackedEntity.getEntityId(), lllllllllllllIlIllIIIlIIIIIIIlIl));
                        }
                    }
                    this.lastTrackedEntityMotionX = this.trackedEntity.motionX;
                    this.lastTrackedEntityMotionY = this.trackedEntity.motionY;
                    this.motionZ = this.trackedEntity.motionZ;
                    if (lIlIllIIllIIllI(this.sendVelocityUpdates ? 1 : 0) && lIlIllIIllIllII((lllllllllllllIlIllIIIlIIIIIIlIII instanceof S0FPacketSpawnMob) ? 1 : 0)) {
                        lllllllllllllIlIllIIIlIIIIIIlIIl.playerNetServerHandler.sendPacket(new S12PacketEntityVelocity(this.trackedEntity.getEntityId(), this.trackedEntity.motionX, this.trackedEntity.motionY, this.trackedEntity.motionZ));
                    }
                    if (lIlIllIIllIlIll(this.trackedEntity.ridingEntity)) {
                        lllllllllllllIlIllIIIlIIIIIIlIIl.playerNetServerHandler.sendPacket(new S1BPacketEntityAttach(EntityTrackerEntry.lllllIIIIllII[1], this.trackedEntity, this.trackedEntity.ridingEntity));
                    }
                    if (lIlIllIIllIIllI((this.trackedEntity instanceof EntityLiving) ? 1 : 0) && lIlIllIIllIlIll(((EntityLiving)this.trackedEntity).getLeashedToEntity())) {
                        lllllllllllllIlIllIIIlIIIIIIlIIl.playerNetServerHandler.sendPacket(new S1BPacketEntityAttach(EntityTrackerEntry.lllllIIIIllII[0], this.trackedEntity, ((EntityLiving)this.trackedEntity).getLeashedToEntity()));
                    }
                    if (lIlIllIIllIIllI((this.trackedEntity instanceof EntityLivingBase) ? 1 : 0)) {
                        int lllllllllllllIlIllIIIlIIIIIIIlII = EntityTrackerEntry.lllllIIIIllII[1];
                        "".length();
                        if ((0xE4 ^ 0xB6 ^ (0x37 ^ 0x60)) == 0x0) {
                            return;
                        }
                        while (!lIlIllIIlllIIII(lllllllllllllIlIllIIIlIIIIIIIlII, EntityTrackerEntry.lllllIIIIllII[8])) {
                            final ItemStack lllllllllllllIlIllIIIlIIIIIIIIll = ((EntityLivingBase)this.trackedEntity).getEquipmentInSlot(lllllllllllllIlIllIIIlIIIIIIIlII);
                            if (lIlIllIIllIlIll(lllllllllllllIlIllIIIlIIIIIIIIll)) {
                                lllllllllllllIlIllIIIlIIIIIIlIIl.playerNetServerHandler.sendPacket(new S04PacketEntityEquipment(this.trackedEntity.getEntityId(), lllllllllllllIlIllIIIlIIIIIIIlII, lllllllllllllIlIllIIIlIIIIIIIIll));
                            }
                            ++lllllllllllllIlIllIIIlIIIIIIIlII;
                        }
                    }
                    if (lIlIllIIllIIllI((this.trackedEntity instanceof EntityPlayer) ? 1 : 0)) {
                        final EntityPlayer lllllllllllllIlIllIIIlIIIIIIIIlI = (EntityPlayer)this.trackedEntity;
                        if (lIlIllIIllIIllI(lllllllllllllIlIllIIIlIIIIIIIIlI.isPlayerSleeping() ? 1 : 0)) {
                            lllllllllllllIlIllIIIlIIIIIIlIIl.playerNetServerHandler.sendPacket(new S0APacketUseBed(lllllllllllllIlIllIIIlIIIIIIIIlI, new BlockPos(this.trackedEntity)));
                        }
                    }
                    if (lIlIllIIllIIllI((this.trackedEntity instanceof EntityLivingBase) ? 1 : 0)) {
                        final EntityLivingBase lllllllllllllIlIllIIIlIIIIIIIIIl = (EntityLivingBase)this.trackedEntity;
                        final int lllllllllllllIlIllIIIIlllllllIIl = (int)lllllllllllllIlIllIIIlIIIIIIIIIl.getActivePotionEffects().iterator();
                        "".length();
                        if (-"   ".length() >= 0) {
                            return;
                        }
                        while (!lIlIllIIllIllII(((Iterator)lllllllllllllIlIllIIIIlllllllIIl).hasNext() ? 1 : 0)) {
                            final PotionEffect lllllllllllllIlIllIIIlIIIIIIIIII = ((Iterator<PotionEffect>)lllllllllllllIlIllIIIIlllllllIIl).next();
                            lllllllllllllIlIllIIIlIIIIIIlIIl.playerNetServerHandler.sendPacket(new S1DPacketEntityEffect(this.trackedEntity.getEntityId(), lllllllllllllIlIllIIIlIIIIIIIIII));
                        }
                        "".length();
                        if (null != null) {
                            return;
                        }
                    }
                }
            }
            else if (lIlIllIIllIIllI(this.trackingPlayers.contains(lllllllllllllIlIllIIIlIIIIIIlIIl) ? 1 : 0)) {
                this.trackingPlayers.remove(lllllllllllllIlIllIIIlIIIIIIlIIl);
                "".length();
                lllllllllllllIlIllIIIlIIIIIIlIIl.removeEntity(this.trackedEntity);
            }
        }
    }
    
    static {
        lIlIllIIllIIlII();
        lIlIllIIlIllllI();
        logger = LogManager.getLogger();
    }
    
    private static boolean lIlIllIIlllIlIl(final int lllllllllllllIlIllIIIIllIllllIll) {
        return lllllllllllllIlIllIIIIllIllllIll >= 0;
    }
    
    private static int lIlIllIIlllIIll(final double n, final double n2) {
        return dcmpl(n, n2);
    }
    
    private static boolean lIlIllIIllIlIIl(final int lllllllllllllIlIllIIIIllIlllIlll) {
        return lllllllllllllIlIllIIIIllIlllIlll > 0;
    }
    
    public void func_151261_b(final Packet lllllllllllllIlIllIIIlIIIIlIIIlI) {
        this.sendPacketToTrackedPlayers(lllllllllllllIlIllIIIlIIIIlIIIlI);
        if (lIlIllIIllIIllI((this.trackedEntity instanceof EntityPlayerMP) ? 1 : 0)) {
            ((EntityPlayerMP)this.trackedEntity).playerNetServerHandler.sendPacket(lllllllllllllIlIllIIIlIIIIlIIIlI);
        }
    }
    
    public EntityTrackerEntry(final Entity lllllllllllllIlIllIIIlIIlIIIlllI, final int lllllllllllllIlIllIIIlIIlIIIllIl, final int lllllllllllllIlIllIIIlIIlIIIIlll, final boolean lllllllllllllIlIllIIIlIIlIIIlIll) {
        this.trackingPlayers = (Set<EntityPlayerMP>)Sets.newHashSet();
        this.trackedEntity = lllllllllllllIlIllIIIlIIlIIIlllI;
        this.trackingDistanceThreshold = lllllllllllllIlIllIIIlIIlIIIllIl;
        this.updateFrequency = lllllllllllllIlIllIIIlIIlIIIIlll;
        this.sendVelocityUpdates = lllllllllllllIlIllIIIlIIlIIIlIll;
        this.encodedPosX = MathHelper.floor_double(lllllllllllllIlIllIIIlIIlIIIlllI.posX * 32.0);
        this.encodedPosY = MathHelper.floor_double(lllllllllllllIlIllIIIlIIlIIIlllI.posY * 32.0);
        this.encodedPosZ = MathHelper.floor_double(lllllllllllllIlIllIIIlIIlIIIlllI.posZ * 32.0);
        this.encodedRotationYaw = MathHelper.floor_float(lllllllllllllIlIllIIIlIIlIIIlllI.rotationYaw * 256.0f / 360.0f);
        this.encodedRotationPitch = MathHelper.floor_float(lllllllllllllIlIllIIIlIIlIIIlllI.rotationPitch * 256.0f / 360.0f);
        this.lastHeadMotion = MathHelper.floor_float(lllllllllllllIlIllIIIlIIlIIIlllI.getRotationYawHead() * 256.0f / 360.0f);
        this.onGround = lllllllllllllIlIllIIIlIIlIIIlllI.onGround;
    }
    
    private static boolean lIlIllIIllIlIlI(final Object lllllllllllllIlIllIIIIlllIIIIllI, final Object lllllllllllllIlIllIIIIlllIIIIlIl) {
        return lllllllllllllIlIllIIIIlllIIIIllI == lllllllllllllIlIllIIIIlllIIIIlIl;
    }
    
    private boolean isPlayerWatchingThisChunk(final EntityPlayerMP lllllllllllllIlIllIIIIlllllIIlll) {
        return lllllllllllllIlIllIIIIlllllIIlll.getServerForPlayer().getPlayerManager().isPlayerWatchingChunk(lllllllllllllIlIllIIIIlllllIIlll, this.trackedEntity.chunkCoordX, this.trackedEntity.chunkCoordZ);
    }
    
    public void updatePlayerEntities(final List<EntityPlayer> lllllllllllllIlIllIIIIlllllIIIlI) {
        int lllllllllllllIlIllIIIIlllllIIIIl = EntityTrackerEntry.lllllIIIIllII[1];
        "".length();
        if (((106 + 0 + 130 + 9 ^ 18 + 63 + 78 + 39) & (0x0 ^ 0x6F ^ (0x15 ^ 0x49) ^ -" ".length())) != 0x0) {
            return;
        }
        while (!lIlIllIIlllIIII(lllllllllllllIlIllIIIIlllllIIIIl, lllllllllllllIlIllIIIIlllllIIIlI.size())) {
            this.updatePlayerEntity(lllllllllllllIlIllIIIIlllllIIIlI.get(lllllllllllllIlIllIIIIlllllIIIIl));
            ++lllllllllllllIlIllIIIIlllllIIIIl;
        }
    }
    
    private static void lIlIllIIllIIlII() {
        (lllllIIIIllII = new int[29])[0] = " ".length();
        EntityTrackerEntry.lllllIIIIllII[1] = ((0x25 ^ 0x6A) & ~(0x32 ^ 0x7D));
        EntityTrackerEntry.lllllIIIIllII[2] = (0x85 ^ 0xBE ^ (0x12 ^ 0x15));
        EntityTrackerEntry.lllllIIIIllII[3] = (0xAA ^ 0x99 ^ (0x7D ^ 0x44));
        EntityTrackerEntry.lllllIIIIllII[4] = (126 + 1 - 97 + 120 ^ 44 + 106 - 110 + 106);
        EntityTrackerEntry.lllllIIIIllII[5] = -(107 + 111 - 102 + 12);
        EntityTrackerEntry.lllllIIIIllII[6] = "   ".length() + (0x4D ^ 0x23) - " ".length() + (0xC ^ 0x1C);
        EntityTrackerEntry.lllllIIIIllII[7] = (0xFFFFC9BF & 0x37D0);
        EntityTrackerEntry.lllllIIIIllII[8] = (0xC4 ^ 0xC1);
        EntityTrackerEntry.lllllIIIIllII[9] = (0x35 ^ 0x44 ^ (0x41 ^ 0x10));
        EntityTrackerEntry.lllllIIIIllII[10] = "  ".length();
        EntityTrackerEntry.lllllIIIIllII[11] = (0x10 ^ 0x4A);
        EntityTrackerEntry.lllllIIIIllII[12] = (31 + 47 + 53 + 25 ^ 78 + 86 - 34 + 31);
        EntityTrackerEntry.lllllIIIIllII[13] = (0x59 ^ 0x10);
        EntityTrackerEntry.lllllIIIIllII[14] = (0xC9 ^ 0x82);
        EntityTrackerEntry.lllllIIIIllII[15] = (109 + 47 - 101 + 80 ^ 185 + 181 - 353 + 185);
        EntityTrackerEntry.lllllIIIIllII[16] = (0xB9 ^ 0x96 ^ (0xF0 ^ 0x97));
        EntityTrackerEntry.lllllIIIIllII[17] = (0x93 ^ 0xB5 ^ (0x35 ^ 0x5F));
        EntityTrackerEntry.lllllIIIIllII[18] = ("   ".length() ^ (0x0 ^ 0x3C));
        EntityTrackerEntry.lllllIIIIllII[19] = (0xA4 ^ 0xC6 ^ (0x5C ^ 0x7E));
        EntityTrackerEntry.lllllIIIIllII[20] = (0x1F ^ 0x5D);
        EntityTrackerEntry.lllllIIIIllII[21] = (0xAD ^ 0x93);
        EntityTrackerEntry.lllllIIIIllII[22] = (0xFE ^ 0x9D ^ (0x51 ^ 0x0));
        EntityTrackerEntry.lllllIIIIllII[23] = (0x78 ^ 0x4B);
        EntityTrackerEntry.lllllIIIIllII[24] = (0x1B ^ 0x5D);
        EntityTrackerEntry.lllllIIIIllII[25] = (139 + 62 + 8 + 44 ^ 48 + 6 + 29 + 96);
        EntityTrackerEntry.lllllIIIIllII[26] = (178 + 226 - 239 + 77 ^ 58 + 61 - 53 + 115);
        EntityTrackerEntry.lllllIIIIllII[27] = (0xD2 ^ 0x9F);
        EntityTrackerEntry.lllllIIIIllII[28] = "   ".length();
    }
    
    public void sendPacketToTrackedPlayers(final Packet lllllllllllllIlIllIIIlIIIIlIlIll) {
        final byte lllllllllllllIlIllIIIlIIIIlIIllI = (byte)this.trackingPlayers.iterator();
        "".length();
        if (null != null) {
            return;
        }
        while (!lIlIllIIllIllII(((Iterator)lllllllllllllIlIllIIIlIIIIlIIllI).hasNext() ? 1 : 0)) {
            final EntityPlayerMP lllllllllllllIlIllIIIlIIIIlIlIlI = ((Iterator<EntityPlayerMP>)lllllllllllllIlIllIIIlIIIIlIIllI).next();
            lllllllllllllIlIllIIIlIIIIlIlIlI.playerNetServerHandler.sendPacket(lllllllllllllIlIllIIIlIIIIlIlIll);
        }
    }
    
    private static boolean lIlIllIIlllIIIl(final int lllllllllllllIlIllIIIIlllIIIlllI, final int lllllllllllllIlIllIIIIlllIIIllIl) {
        return lllllllllllllIlIllIIIIlllIIIlllI <= lllllllllllllIlIllIIIIlllIIIllIl;
    }
    
    public void updatePlayerList(final List<EntityPlayer> lllllllllllllIlIllIIIlIIIlIIllIl) {
        this.playerEntitiesUpdated = (EntityTrackerEntry.lllllIIIIllII[1] != 0);
        if (!lIlIllIIllIIllI(this.firstUpdateDone ? 1 : 0) || lIlIllIIllIlIIl(lIlIllIIllIlIII(this.trackedEntity.getDistanceSq(this.lastTrackedEntityPosX, this.lastTrackedEntityPosY, this.lastTrackedEntityPosZ), 16.0))) {
            this.lastTrackedEntityPosX = this.trackedEntity.posX;
            this.lastTrackedEntityPosY = this.trackedEntity.posY;
            this.lastTrackedEntityPosZ = this.trackedEntity.posZ;
            this.firstUpdateDone = (EntityTrackerEntry.lllllIIIIllII[0] != 0);
            this.playerEntitiesUpdated = (EntityTrackerEntry.lllllIIIIllII[0] != 0);
            this.updatePlayerEntities(lllllllllllllIlIllIIIlIIIlIIllIl);
        }
        if (!lIlIllIIllIlIlI(this.field_85178_v, this.trackedEntity.ridingEntity) || (lIlIllIIllIlIll(this.trackedEntity.ridingEntity) && lIlIllIIllIllII(this.updateCounter % EntityTrackerEntry.lllllIIIIllII[2]))) {
            this.field_85178_v = this.trackedEntity.ridingEntity;
            this.sendPacketToTrackedPlayers(new S1BPacketEntityAttach(EntityTrackerEntry.lllllIIIIllII[1], this.trackedEntity, this.trackedEntity.ridingEntity));
        }
        if (lIlIllIIllIIllI((this.trackedEntity instanceof EntityItemFrame) ? 1 : 0) && lIlIllIIllIllII(this.updateCounter % EntityTrackerEntry.lllllIIIIllII[3])) {
            final EntityItemFrame lllllllllllllIlIllIIIlIIIllIlIII = (EntityItemFrame)this.trackedEntity;
            final ItemStack lllllllllllllIlIllIIIlIIIllIIlll = lllllllllllllIlIllIIIlIIIllIlIII.getDisplayedItem();
            if (lIlIllIIllIlIll(lllllllllllllIlIllIIIlIIIllIIlll) && lIlIllIIllIIllI((lllllllllllllIlIllIIIlIIIllIIlll.getItem() instanceof ItemMap) ? 1 : 0)) {
                final MapData lllllllllllllIlIllIIIlIIIllIIllI = Items.filled_map.getMapData(lllllllllllllIlIllIIIlIIIllIIlll, this.trackedEntity.worldObj);
                final boolean lllllllllllllIlIllIIIlIIIlIIlIII = (boolean)lllllllllllllIlIllIIIlIIIlIIllIl.iterator();
                "".length();
                if ((0xE7 ^ 0xA9 ^ (0x3F ^ 0x75)) < (63 + 83 - 121 + 121 ^ 17 + 142 - 87 + 78)) {
                    return;
                }
                while (!lIlIllIIllIllII(((Iterator)lllllllllllllIlIllIIIlIIIlIIlIII).hasNext() ? 1 : 0)) {
                    final EntityPlayer lllllllllllllIlIllIIIlIIIllIIlIl = ((Iterator<EntityPlayer>)lllllllllllllIlIllIIIlIIIlIIlIII).next();
                    final EntityPlayerMP lllllllllllllIlIllIIIlIIIllIIlII = (EntityPlayerMP)lllllllllllllIlIllIIIlIIIllIIlIl;
                    lllllllllllllIlIllIIIlIIIllIIllI.updateVisiblePlayers(lllllllllllllIlIllIIIlIIIllIIlII, lllllllllllllIlIllIIIlIIIllIIlll);
                    final Packet lllllllllllllIlIllIIIlIIIllIIIll = Items.filled_map.createMapDataPacket(lllllllllllllIlIllIIIlIIIllIIlll, this.trackedEntity.worldObj, lllllllllllllIlIllIIIlIIIllIIlII);
                    if (lIlIllIIllIlIll(lllllllllllllIlIllIIIlIIIllIIIll)) {
                        lllllllllllllIlIllIIIlIIIllIIlII.playerNetServerHandler.sendPacket(lllllllllllllIlIllIIIlIIIllIIIll);
                    }
                }
            }
            this.sendMetadataToAllAssociatedPlayers();
        }
        if (!lIlIllIIllIIllI(this.updateCounter % this.updateFrequency) || !lIlIllIIllIllII(this.trackedEntity.isAirBorne ? 1 : 0) || lIlIllIIllIIllI(this.trackedEntity.getDataWatcher().hasObjectChanged() ? 1 : 0)) {
            if (lIlIllIIllIllIl(this.trackedEntity.ridingEntity)) {
                this.ticksSinceLastForcedTeleport += EntityTrackerEntry.lllllIIIIllII[0];
                final int lllllllllllllIlIllIIIlIIIllIIIlI = MathHelper.floor_double(this.trackedEntity.posX * 32.0);
                final int lllllllllllllIlIllIIIlIIIllIIIIl = MathHelper.floor_double(this.trackedEntity.posY * 32.0);
                final int lllllllllllllIlIllIIIlIIIllIIIII = MathHelper.floor_double(this.trackedEntity.posZ * 32.0);
                final int lllllllllllllIlIllIIIlIIIlIlllll = MathHelper.floor_float(this.trackedEntity.rotationYaw * 256.0f / 360.0f);
                final int lllllllllllllIlIllIIIlIIIlIllllI = MathHelper.floor_float(this.trackedEntity.rotationPitch * 256.0f / 360.0f);
                final int lllllllllllllIlIllIIIlIIIlIlllIl = lllllllllllllIlIllIIIlIIIllIIIlI - this.encodedPosX;
                final int lllllllllllllIlIllIIIlIIIlIlllII = lllllllllllllIlIllIIIlIIIllIIIIl - this.encodedPosY;
                final int lllllllllllllIlIllIIIlIIIlIllIll = lllllllllllllIlIllIIIlIIIllIIIII - this.encodedPosZ;
                Packet lllllllllllllIlIllIIIlIIIlIllIlI = null;
                int n;
                if (lIlIllIIllIlllI(Math.abs(lllllllllllllIlIllIIIlIIIlIlllIl), EntityTrackerEntry.lllllIIIIllII[4]) && lIlIllIIllIlllI(Math.abs(lllllllllllllIlIllIIIlIIIlIlllII), EntityTrackerEntry.lllllIIIIllII[4]) && lIlIllIIllIlllI(Math.abs(lllllllllllllIlIllIIIlIIIlIllIll), EntityTrackerEntry.lllllIIIIllII[4]) && lIlIllIIllIIllI(this.updateCounter % EntityTrackerEntry.lllllIIIIllII[2])) {
                    n = EntityTrackerEntry.lllllIIIIllII[1];
                    "".length();
                    if (" ".length() > "   ".length()) {
                        return;
                    }
                }
                else {
                    n = EntityTrackerEntry.lllllIIIIllII[0];
                }
                final boolean lllllllllllllIlIllIIIlIIIlIllIIl = n != 0;
                int n2;
                if (lIlIllIIllIlllI(Math.abs(lllllllllllllIlIllIIIlIIIlIlllll - this.encodedRotationYaw), EntityTrackerEntry.lllllIIIIllII[4]) && lIlIllIIllIlllI(Math.abs(lllllllllllllIlIllIIIlIIIlIllllI - this.encodedRotationPitch), EntityTrackerEntry.lllllIIIIllII[4])) {
                    n2 = EntityTrackerEntry.lllllIIIIllII[1];
                    "".length();
                    if ("   ".length() <= ((0x9A ^ 0xA8 ^ (0x1C ^ 0x8)) & (102 + 114 - 160 + 108 ^ 9 + 129 - 113 + 105 ^ -" ".length()))) {
                        return;
                    }
                }
                else {
                    n2 = EntityTrackerEntry.lllllIIIIllII[0];
                }
                final boolean lllllllllllllIlIllIIIlIIIlIllIII = n2 != 0;
                if (!lIlIllIIllIllll(this.updateCounter) || lIlIllIIllIIllI((this.trackedEntity instanceof EntityArrow) ? 1 : 0)) {
                    if (lIlIllIIlllIIII(lllllllllllllIlIllIIIlIIIlIlllIl, EntityTrackerEntry.lllllIIIIllII[5]) && lIlIllIIllIlllI(lllllllllllllIlIllIIIlIIIlIlllIl, EntityTrackerEntry.lllllIIIIllII[6]) && lIlIllIIlllIIII(lllllllllllllIlIllIIIlIIIlIlllII, EntityTrackerEntry.lllllIIIIllII[5]) && lIlIllIIllIlllI(lllllllllllllIlIllIIIlIIIlIlllII, EntityTrackerEntry.lllllIIIIllII[6]) && lIlIllIIlllIIII(lllllllllllllIlIllIIIlIIIlIllIll, EntityTrackerEntry.lllllIIIIllII[5]) && lIlIllIIllIlllI(lllllllllllllIlIllIIIlIIIlIllIll, EntityTrackerEntry.lllllIIIIllII[6]) && lIlIllIIlllIIIl(this.ticksSinceLastForcedTeleport, EntityTrackerEntry.lllllIIIIllII[7]) && lIlIllIIllIllII(this.ridingEntity ? 1 : 0) && lIlIllIIllIIlll(this.onGround ? 1 : 0, this.trackedEntity.onGround ? 1 : 0)) {
                        if ((!lIlIllIIllIIllI(lllllllllllllIlIllIIIlIIIlIllIIl ? 1 : 0) || lIlIllIIllIllII(lllllllllllllIlIllIIIlIIIlIllIII ? 1 : 0)) && lIlIllIIllIllII((this.trackedEntity instanceof EntityArrow) ? 1 : 0)) {
                            if (lIlIllIIllIIllI(lllllllllllllIlIllIIIlIIIlIllIIl ? 1 : 0)) {
                                lllllllllllllIlIllIIIlIIIlIllIlI = new S14PacketEntity.S15PacketEntityRelMove(this.trackedEntity.getEntityId(), (byte)lllllllllllllIlIllIIIlIIIlIlllIl, (byte)lllllllllllllIlIllIIIlIIIlIlllII, (byte)lllllllllllllIlIllIIIlIIIlIllIll, this.trackedEntity.onGround);
                                "".length();
                                if ((52 + 142 - 163 + 119 ^ 65 + 57 + 15 + 9) < 0) {
                                    return;
                                }
                            }
                            else if (lIlIllIIllIIllI(lllllllllllllIlIllIIIlIIIlIllIII ? 1 : 0)) {
                                lllllllllllllIlIllIIIlIIIlIllIlI = new S14PacketEntity.S16PacketEntityLook(this.trackedEntity.getEntityId(), (byte)lllllllllllllIlIllIIIlIIIlIlllll, (byte)lllllllllllllIlIllIIIlIIIlIllllI, this.trackedEntity.onGround);
                                "".length();
                                if ("  ".length() < " ".length()) {
                                    return;
                                }
                            }
                        }
                        else {
                            lllllllllllllIlIllIIIlIIIlIllIlI = new S14PacketEntity.S17PacketEntityLookMove(this.trackedEntity.getEntityId(), (byte)lllllllllllllIlIllIIIlIIIlIlllIl, (byte)lllllllllllllIlIllIIIlIIIlIlllII, (byte)lllllllllllllIlIllIIIlIIIlIllIll, (byte)lllllllllllllIlIllIIIlIIIlIlllll, (byte)lllllllllllllIlIllIIIlIIIlIllllI, this.trackedEntity.onGround);
                            "".length();
                            if (((0x42 ^ 0xB) & ~(0x24 ^ 0x6D)) != 0x0) {
                                return;
                            }
                        }
                    }
                    else {
                        this.onGround = this.trackedEntity.onGround;
                        this.ticksSinceLastForcedTeleport = EntityTrackerEntry.lllllIIIIllII[1];
                        lllllllllllllIlIllIIIlIIIlIllIlI = new S18PacketEntityTeleport(this.trackedEntity.getEntityId(), lllllllllllllIlIllIIIlIIIllIIIlI, lllllllllllllIlIllIIIlIIIllIIIIl, lllllllllllllIlIllIIIlIIIllIIIII, (byte)lllllllllllllIlIllIIIlIIIlIlllll, (byte)lllllllllllllIlIllIIIlIIIlIllllI, this.trackedEntity.onGround);
                    }
                }
                if (lIlIllIIllIIllI(this.sendVelocityUpdates ? 1 : 0)) {
                    final double lllllllllllllIlIllIIIlIIIlIlIlll = this.trackedEntity.motionX - this.lastTrackedEntityMotionX;
                    final double lllllllllllllIlIllIIIlIIIlIlIllI = this.trackedEntity.motionY - this.lastTrackedEntityMotionY;
                    final double lllllllllllllIlIllIIIlIIIlIlIlIl = this.trackedEntity.motionZ - this.motionZ;
                    final double lllllllllllllIlIllIIIlIIIlIlIlII = 0.02;
                    final double lllllllllllllIlIllIIIlIIIlIlIIll = lllllllllllllIlIllIIIlIIIlIlIlll * lllllllllllllIlIllIIIlIIIlIlIlll + lllllllllllllIlIllIIIlIIIlIlIllI * lllllllllllllIlIllIIIlIIIlIlIllI + lllllllllllllIlIllIIIlIIIlIlIlIl * lllllllllllllIlIllIIIlIIIlIlIlIl;
                    if (!lIlIllIIllIllll(lIlIllIIllIlIII(lllllllllllllIlIllIIIlIIIlIlIIll, lllllllllllllIlIllIIIlIIIlIlIlII * lllllllllllllIlIllIIIlIIIlIlIlII)) || (lIlIllIIllIlIIl(lIlIllIIllIlIII(lllllllllllllIlIllIIIlIIIlIlIIll, 0.0)) && lIlIllIIllIllII(lIlIllIIllIlIII(this.trackedEntity.motionX, 0.0)) && lIlIllIIllIllII(lIlIllIIllIlIII(this.trackedEntity.motionY, 0.0)) && lIlIllIIllIllII(lIlIllIIllIlIII(this.trackedEntity.motionZ, 0.0)))) {
                        this.lastTrackedEntityMotionX = this.trackedEntity.motionX;
                        this.lastTrackedEntityMotionY = this.trackedEntity.motionY;
                        this.motionZ = this.trackedEntity.motionZ;
                        this.sendPacketToTrackedPlayers(new S12PacketEntityVelocity(this.trackedEntity.getEntityId(), this.lastTrackedEntityMotionX, this.lastTrackedEntityMotionY, this.motionZ));
                    }
                }
                if (lIlIllIIllIlIll(lllllllllllllIlIllIIIlIIIlIllIlI)) {
                    this.sendPacketToTrackedPlayers(lllllllllllllIlIllIIIlIIIlIllIlI);
                }
                this.sendMetadataToAllAssociatedPlayers();
                if (lIlIllIIllIIllI(lllllllllllllIlIllIIIlIIIlIllIIl ? 1 : 0)) {
                    this.encodedPosX = lllllllllllllIlIllIIIlIIIllIIIlI;
                    this.encodedPosY = lllllllllllllIlIllIIIlIIIllIIIIl;
                    this.encodedPosZ = lllllllllllllIlIllIIIlIIIllIIIII;
                }
                if (lIlIllIIllIIllI(lllllllllllllIlIllIIIlIIIlIllIII ? 1 : 0)) {
                    this.encodedRotationYaw = lllllllllllllIlIllIIIlIIIlIlllll;
                    this.encodedRotationPitch = lllllllllllllIlIllIIIlIIIlIllllI;
                }
                this.ridingEntity = (EntityTrackerEntry.lllllIIIIllII[1] != 0);
                "".length();
                if ((0x2B ^ 0x2F) != (0x64 ^ 0x60)) {
                    return;
                }
            }
            else {
                final int lllllllllllllIlIllIIIlIIIlIlIIlI = MathHelper.floor_float(this.trackedEntity.rotationYaw * 256.0f / 360.0f);
                final int lllllllllllllIlIllIIIlIIIlIlIIIl = MathHelper.floor_float(this.trackedEntity.rotationPitch * 256.0f / 360.0f);
                int n3;
                if (lIlIllIIllIlllI(Math.abs(lllllllllllllIlIllIIIlIIIlIlIIlI - this.encodedRotationYaw), EntityTrackerEntry.lllllIIIIllII[4]) && lIlIllIIllIlllI(Math.abs(lllllllllllllIlIllIIIlIIIlIlIIIl - this.encodedRotationPitch), EntityTrackerEntry.lllllIIIIllII[4])) {
                    n3 = EntityTrackerEntry.lllllIIIIllII[1];
                    "".length();
                    if ((166 + 72 - 83 + 15 ^ 66 + 35 + 24 + 49) != (0x6D ^ 0x28 ^ (0x6D ^ 0x2C))) {
                        return;
                    }
                }
                else {
                    n3 = EntityTrackerEntry.lllllIIIIllII[0];
                }
                final boolean lllllllllllllIlIllIIIlIIIlIlIIII = n3 != 0;
                if (lIlIllIIllIIllI(lllllllllllllIlIllIIIlIIIlIlIIII ? 1 : 0)) {
                    this.sendPacketToTrackedPlayers(new S14PacketEntity.S16PacketEntityLook(this.trackedEntity.getEntityId(), (byte)lllllllllllllIlIllIIIlIIIlIlIIlI, (byte)lllllllllllllIlIllIIIlIIIlIlIIIl, this.trackedEntity.onGround));
                    this.encodedRotationYaw = lllllllllllllIlIllIIIlIIIlIlIIlI;
                    this.encodedRotationPitch = lllllllllllllIlIllIIIlIIIlIlIIIl;
                }
                this.encodedPosX = MathHelper.floor_double(this.trackedEntity.posX * 32.0);
                this.encodedPosY = MathHelper.floor_double(this.trackedEntity.posY * 32.0);
                this.encodedPosZ = MathHelper.floor_double(this.trackedEntity.posZ * 32.0);
                this.sendMetadataToAllAssociatedPlayers();
                this.ridingEntity = (EntityTrackerEntry.lllllIIIIllII[0] != 0);
            }
            final int lllllllllllllIlIllIIIlIIIlIIllll = MathHelper.floor_float(this.trackedEntity.getRotationYawHead() * 256.0f / 360.0f);
            if (lIlIllIIlllIIII(Math.abs(lllllllllllllIlIllIIIlIIIlIIllll - this.lastHeadMotion), EntityTrackerEntry.lllllIIIIllII[4])) {
                this.sendPacketToTrackedPlayers(new S19PacketEntityHeadLook(this.trackedEntity, (byte)lllllllllllllIlIllIIIlIIIlIIllll));
                this.lastHeadMotion = lllllllllllllIlIllIIIlIIIlIIllll;
            }
            this.trackedEntity.isAirBorne = (EntityTrackerEntry.lllllIIIIllII[1] != 0);
        }
        this.updateCounter += EntityTrackerEntry.lllllIIIIllII[0];
        if (lIlIllIIllIIllI(this.trackedEntity.velocityChanged ? 1 : 0)) {
            this.func_151261_b(new S12PacketEntityVelocity(this.trackedEntity));
            this.trackedEntity.velocityChanged = (EntityTrackerEntry.lllllIIIIllII[1] != 0);
        }
    }
    
    private static boolean lIlIllIIlllIIII(final int lllllllllllllIlIllIIIIlllIIlIllI, final int lllllllllllllIlIllIIIIlllIIlIlIl) {
        return lllllllllllllIlIllIIIIlllIIlIllI >= lllllllllllllIlIllIIIIlllIIlIlIl;
    }
    
    private static boolean lIlIllIIlllIIlI(final Object lllllllllllllIlIllIIIIlllIIIlIlI, final Object lllllllllllllIlIllIIIIlllIIIlIIl) {
        return lllllllllllllIlIllIIIIlllIIIlIlI != lllllllllllllIlIllIIIIlllIIIlIIl;
    }
    
    private static boolean lIlIllIIllIllII(final int lllllllllllllIlIllIIIIllIlllllIl) {
        return lllllllllllllIlIllIIIIllIlllllIl == 0;
    }
    
    private static String lIlIllIIlIlllIl(final String lllllllllllllIlIllIIIIlllIlllIII, final String lllllllllllllIlIllIIIIlllIllIlll) {
        try {
            final SecretKeySpec lllllllllllllIlIllIIIIlllIllllIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIlIllIIIIlllIllIlll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lllllllllllllIlIllIIIIlllIllllII = Cipher.getInstance("Blowfish");
            lllllllllllllIlIllIIIIlllIllllII.init(EntityTrackerEntry.lllllIIIIllII[10], lllllllllllllIlIllIIIIlllIllllIl);
            return new String(lllllllllllllIlIllIIIIlllIllllII.doFinal(Base64.getDecoder().decode(lllllllllllllIlIllIIIIlllIlllIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIlIllIIIIlllIlllIll) {
            lllllllllllllIlIllIIIIlllIlllIll.printStackTrace();
            return null;
        }
    }
    
    public boolean func_180233_c(final EntityPlayerMP lllllllllllllIlIllIIIIllllllIIll) {
        final double lllllllllllllIlIllIIIIllllllIIlI = lllllllllllllIlIllIIIIllllllIIll.posX - this.encodedPosX / EntityTrackerEntry.lllllIIIIllII[9];
        final double lllllllllllllIlIllIIIIllllllIIIl = lllllllllllllIlIllIIIIllllllIIll.posZ - this.encodedPosZ / EntityTrackerEntry.lllllIIIIllII[9];
        if (lIlIllIIlllIlIl(lIlIllIIlllIIll(lllllllllllllIlIllIIIIllllllIIlI, -this.trackingDistanceThreshold)) && lIlIllIIllIllll(lIlIllIIlllIlII(lllllllllllllIlIllIIIIllllllIIlI, this.trackingDistanceThreshold)) && lIlIllIIlllIlIl(lIlIllIIlllIIll(lllllllllllllIlIllIIIIllllllIIIl, -this.trackingDistanceThreshold)) && lIlIllIIllIllll(lIlIllIIlllIlII(lllllllllllllIlIllIIIIllllllIIIl, this.trackingDistanceThreshold)) && lIlIllIIllIIllI(this.trackedEntity.isSpectatedByPlayer(lllllllllllllIlIllIIIIllllllIIll) ? 1 : 0)) {
            return EntityTrackerEntry.lllllIIIIllII[0] != 0;
        }
        return EntityTrackerEntry.lllllIIIIllII[1] != 0;
    }
    
    private void sendMetadataToAllAssociatedPlayers() {
        final DataWatcher lllllllllllllIlIllIIIlIIIIllIlll = this.trackedEntity.getDataWatcher();
        if (lIlIllIIllIIllI(lllllllllllllIlIllIIIlIIIIllIlll.hasObjectChanged() ? 1 : 0)) {
            this.func_151261_b(new S1CPacketEntityMetadata(this.trackedEntity.getEntityId(), lllllllllllllIlIllIIIlIIIIllIlll, (boolean)(EntityTrackerEntry.lllllIIIIllII[1] != 0)));
        }
        if (lIlIllIIllIIllI((this.trackedEntity instanceof EntityLivingBase) ? 1 : 0)) {
            final ServersideAttributeMap lllllllllllllIlIllIIIlIIIIllIllI = (ServersideAttributeMap)((EntityLivingBase)this.trackedEntity).getAttributeMap();
            final Set<IAttributeInstance> lllllllllllllIlIllIIIlIIIIllIlIl = lllllllllllllIlIllIIIlIIIIllIllI.getAttributeInstanceSet();
            if (lIlIllIIllIllII(lllllllllllllIlIllIIIlIIIIllIlIl.isEmpty() ? 1 : 0)) {
                this.func_151261_b(new S20PacketEntityProperties(this.trackedEntity.getEntityId(), lllllllllllllIlIllIIIlIIIIllIlIl));
            }
            lllllllllllllIlIllIIIlIIIIllIlIl.clear();
        }
    }
    
    private static boolean lIlIllIIllIllIl(final Object lllllllllllllIlIllIIIIlllIIIIIIl) {
        return lllllllllllllIlIllIIIIlllIIIIIIl == null;
    }
    
    @Override
    public int hashCode() {
        return this.trackedEntity.getEntityId();
    }
    
    @Override
    public boolean equals(final Object lllllllllllllIlIllIIIlIIlIIIIIII) {
        int n;
        if (lIlIllIIllIIllI((lllllllllllllIlIllIIIlIIlIIIIIII instanceof EntityTrackerEntry) ? 1 : 0)) {
            if (lIlIllIIllIIlll(((EntityTrackerEntry)lllllllllllllIlIllIIIlIIlIIIIIII).trackedEntity.getEntityId(), this.trackedEntity.getEntityId())) {
                n = EntityTrackerEntry.lllllIIIIllII[0];
                "".length();
                if (" ".length() <= ((176 + 117 - 152 + 83 ^ 58 + 93 - 71 + 51) & (0x16 ^ 0x20 ^ (0xFE ^ 0xAB) ^ -" ".length()))) {
                    return ((0x21 ^ 0x15 ^ (0xEB ^ 0x83)) & (202 + 131 - 178 + 56 ^ 31 + 68 - 73 + 117 ^ -" ".length())) != 0x0;
                }
            }
            else {
                n = EntityTrackerEntry.lllllIIIIllII[1];
                "".length();
                if (((0x42 ^ 0x1C) & ~(0x0 ^ 0x5E)) > (0x7A ^ 0x7E)) {
                    return ((0xCA ^ 0xC0) & ~(0x9E ^ 0x94)) != 0x0;
                }
            }
        }
        else {
            n = EntityTrackerEntry.lllllIIIIllII[1];
        }
        return n != 0;
    }
    
    private static int lIlIllIIlllIlII(final double n, final double n2) {
        return dcmpg(n, n2);
    }
    
    public void removeTrackedPlayerSymmetric(final EntityPlayerMP lllllllllllllIlIllIIIIllllIIIlII) {
        if (lIlIllIIllIIllI(this.trackingPlayers.contains(lllllllllllllIlIllIIIIllllIIIlII) ? 1 : 0)) {
            this.trackingPlayers.remove(lllllllllllllIlIllIIIIllllIIIlII);
            "".length();
            lllllllllllllIlIllIIIIllllIIIlII.removeEntity(this.trackedEntity);
        }
    }
    
    private static String lIlIllIIlIlllII(String lllllllllllllIlIllIIIIlllIlIIlIl, final String lllllllllllllIlIllIIIIlllIlIlIIl) {
        lllllllllllllIlIllIIIIlllIlIIlIl = new String(Base64.getDecoder().decode(lllllllllllllIlIllIIIIlllIlIIlIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIlIllIIIIlllIlIlIII = new StringBuilder();
        final char[] lllllllllllllIlIllIIIIlllIlIIlll = lllllllllllllIlIllIIIIlllIlIlIIl.toCharArray();
        int lllllllllllllIlIllIIIIlllIlIIllI = EntityTrackerEntry.lllllIIIIllII[1];
        final short lllllllllllllIlIllIIIIlllIlIIIII = (Object)lllllllllllllIlIllIIIIlllIlIIlIl.toCharArray();
        final char lllllllllllllIlIllIIIIlllIIlllll = (char)lllllllllllllIlIllIIIIlllIlIIIII.length;
        double lllllllllllllIlIllIIIIlllIIllllI = EntityTrackerEntry.lllllIIIIllII[1];
        while (lIlIllIIllIlllI((int)lllllllllllllIlIllIIIIlllIIllllI, lllllllllllllIlIllIIIIlllIIlllll)) {
            final char lllllllllllllIlIllIIIIlllIlIlIll = lllllllllllllIlIllIIIIlllIlIIIII[lllllllllllllIlIllIIIIlllIIllllI];
            lllllllllllllIlIllIIIIlllIlIlIII.append((char)(lllllllllllllIlIllIIIIlllIlIlIll ^ lllllllllllllIlIllIIIIlllIlIIlll[lllllllllllllIlIllIIIIlllIlIIllI % lllllllllllllIlIllIIIIlllIlIIlll.length]));
            "".length();
            ++lllllllllllllIlIllIIIIlllIlIIllI;
            ++lllllllllllllIlIllIIIIlllIIllllI;
            "".length();
            if (-"  ".length() >= 0) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIlIllIIIIlllIlIlIII);
    }
    
    private static boolean lIlIllIIllIllll(final int lllllllllllllIlIllIIIIllIllllIIl) {
        return lllllllllllllIlIllIIIIllIllllIIl <= 0;
    }
    
    public void sendDestroyEntityPacketToTrackedPlayers() {
        final int lllllllllllllIlIllIIIlIIIIIllIII = (int)this.trackingPlayers.iterator();
        "".length();
        if (null != null) {
            return;
        }
        while (!lIlIllIIllIllII(((Iterator)lllllllllllllIlIllIIIlIIIIIllIII).hasNext() ? 1 : 0)) {
            final EntityPlayerMP lllllllllllllIlIllIIIlIIIIIllIll = ((Iterator<EntityPlayerMP>)lllllllllllllIlIllIIIlIIIIIllIII).next();
            lllllllllllllIlIllIIIlIIIIIllIll.removeEntity(this.trackedEntity);
        }
    }
    
    private static boolean lIlIllIIllIIllI(final int lllllllllllllIlIllIIIIllIlllllll) {
        return lllllllllllllIlIllIIIIllIlllllll != 0;
    }
}
