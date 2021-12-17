// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.entity;

import net.minecraft.enchantment.EnchantmentProtection;
import net.minecraft.block.state.pattern.BlockPattern;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.nbt.NBTTagFloat;
import net.minecraft.util.MovingObjectPosition;
import java.util.concurrent.Callable;
import net.minecraft.item.Item;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.util.ChatComponentText;
import net.minecraft.event.HoverEvent;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.util.StatCollector;
import net.minecraft.block.BlockLiquid;
import net.minecraft.server.MinecraftServer;
import net.minecraft.world.WorldServer;
import java.util.Iterator;
import net.minecraft.init.Blocks;
import net.minecraft.block.BlockFenceGate;
import net.minecraft.block.BlockWall;
import net.minecraft.block.BlockFence;
import net.minecraft.block.material.Material;
import net.minecraft.world.Explosion;
import net.minecraft.util.IChatComponent;
import net.minecraft.entity.effect.EntityLightningBolt;
import net.minecraft.item.ItemStack;
import net.minecraft.util.MathHelper;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.nbt.NBTBase;
import net.minecraft.nbt.NBTTagDouble;
import net.minecraft.nbt.NBTTagList;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.ReportedException;
import net.minecraft.crash.CrashReportCategory;
import net.minecraft.crash.CrashReport;
import net.minecraft.block.Block;
import java.util.List;
import net.minecraft.util.DamageSource;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.command.CommandResultStats;
import java.util.Random;
import java.util.UUID;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.world.World;
import net.minecraft.util.Vec3;
import net.minecraft.util.BlockPos;
import net.minecraft.util.EnumFacing;
import net.minecraft.command.ICommandSender;

public abstract class Entity implements ICommandSender
{
    protected /* synthetic */ boolean isImmuneToFire;
    public /* synthetic */ boolean velocityChanged;
    protected /* synthetic */ EnumFacing field_181018_ap;
    protected /* synthetic */ boolean inPortal;
    public /* synthetic */ float height;
    public /* synthetic */ double posY;
    public /* synthetic */ int dimension;
    public /* synthetic */ float distanceWalkedModified;
    public /* synthetic */ boolean onGround;
    private static final /* synthetic */ String[] lIIlIllllIIlll;
    protected /* synthetic */ BlockPos field_181016_an;
    private /* synthetic */ int fire;
    protected /* synthetic */ Vec3 field_181017_ao;
    private /* synthetic */ int nextStepDistance;
    public /* synthetic */ int timeUntilPortal;
    public /* synthetic */ float prevRotationYaw;
    protected /* synthetic */ DataWatcher dataWatcher;
    public /* synthetic */ boolean isCollidedVertically;
    public /* synthetic */ World worldObj;
    public /* synthetic */ double motionY;
    private /* synthetic */ double entityRiderYawDelta;
    public /* synthetic */ boolean isDead;
    public /* synthetic */ float fallDistance;
    public /* synthetic */ boolean isCollided;
    private /* synthetic */ boolean isOutsideBorder;
    public /* synthetic */ Entity riddenByEntity;
    public /* synthetic */ double lastTickPosY;
    private static /* synthetic */ int nextEntityID;
    public /* synthetic */ double posX;
    public /* synthetic */ float rotationPitch;
    public /* synthetic */ double prevPosY;
    public /* synthetic */ float rotationYaw;
    private static final /* synthetic */ AxisAlignedBB ZERO_AABB;
    public /* synthetic */ double prevPosZ;
    protected /* synthetic */ UUID entityUniqueID;
    private /* synthetic */ AxisAlignedBB boundingBox;
    public /* synthetic */ double motionX;
    public /* synthetic */ double renderDistanceWeight;
    public /* synthetic */ double posZ;
    public /* synthetic */ float distanceWalkedOnStepModified;
    public /* synthetic */ Entity ridingEntity;
    protected /* synthetic */ boolean isInWeb;
    public /* synthetic */ float entityCollisionReduction;
    protected /* synthetic */ boolean inWater;
    public /* synthetic */ boolean noClip;
    private /* synthetic */ int entityId;
    protected /* synthetic */ int portalCounter;
    public /* synthetic */ float prevDistanceWalkedModified;
    public /* synthetic */ double prevPosX;
    public /* synthetic */ float width;
    private /* synthetic */ boolean invulnerable;
    public /* synthetic */ boolean isCollidedHorizontally;
    protected /* synthetic */ Random rand;
    private static final /* synthetic */ int[] lIIllIIIIIllIl;
    public /* synthetic */ double lastTickPosX;
    protected /* synthetic */ boolean firstUpdate;
    public /* synthetic */ int fireResistance;
    public /* synthetic */ double lastTickPosZ;
    private /* synthetic */ double entityRiderPitchDelta;
    public /* synthetic */ boolean isAirBorne;
    public /* synthetic */ double motionZ;
    private final /* synthetic */ CommandResultStats cmdResultStats;
    public /* synthetic */ float prevRotationPitch;
    public /* synthetic */ float stepHeight;
    
    public void updateRiderPosition() {
        if (llIlIlIlIIllIII(this.riddenByEntity)) {
            this.riddenByEntity.setPosition(this.posX, this.posY + this.getMountedYOffset() + this.riddenByEntity.getYOffset(), this.posZ);
        }
    }
    
    private static int llIlIlIlIIlllII(final double n, final double n2) {
        return dcmpg(n, n2);
    }
    
    public void setInWeb() {
        this.isInWeb = (Entity.lIIllIIIIIllIl[0] != 0);
        this.fallDistance = 0.0f;
    }
    
    public boolean isRiding() {
        if (llIlIlIlIIllIII(this.ridingEntity)) {
            return Entity.lIIllIIIIIllIl[0] != 0;
        }
        return Entity.lIIllIIIIIllIl[1] != 0;
    }
    
    public boolean isInvisibleToPlayer(final EntityPlayer lllllllllllllIIlIlllIIlIIIllllIl) {
        int invisible;
        if (llIlIlIlIIllIIl(lllllllllllllIIlIlllIIlIIIllllIl.isSpectator() ? 1 : 0)) {
            invisible = Entity.lIIllIIIIIllIl[1];
            "".length();
            if ((0x81 ^ 0x85) == 0x0) {
                return ((0x48 ^ 0x10) & ~(0x49 ^ 0x11)) != 0x0;
            }
        }
        else {
            invisible = (this.isInvisible() ? 1 : 0);
        }
        return invisible != 0;
    }
    
    public boolean writeToNBTOptional(final NBTTagCompound lllllllllllllIIlIlllIlIIlIIlIIII) {
        final String lllllllllllllIIlIlllIlIIlIIIlllI = this.getEntityString();
        if (llIlIlIlIlIIIII(this.isDead ? 1 : 0) && llIlIlIlIIllIII(lllllllllllllIIlIlllIlIIlIIIlllI) && llIlIlIlIlIIIlI(this.riddenByEntity)) {
            lllllllllllllIIlIlllIlIIlIIlIIII.setString(Entity.lIIlIllllIIlll[Entity.lIIllIIIIIllIl[17]], lllllllllllllIIlIlllIlIIlIIIlllI);
            this.writeToNBT(lllllllllllllIIlIlllIlIIlIIlIIII);
            return Entity.lIIllIIIIIllIl[0] != 0;
        }
        return Entity.lIIllIIIIIllIl[1] != 0;
    }
    
    private static boolean llIlIlIlIlIIIll(final int lllllllllllllIIlIllIlllIlllIllII, final int lllllllllllllIIlIllIlllIlllIlIlI) {
        return lllllllllllllIIlIllIlllIlllIllII >= lllllllllllllIIlIllIlllIlllIlIlI;
    }
    
    private static boolean llIlIlIlIllllII(final int lllllllllllllIIlIllIlllIlIlIlIll, final int lllllllllllllIIlIllIlllIlIlIlIIl) {
        return lllllllllllllIIlIllIlllIlIlIlIll != lllllllllllllIIlIllIlllIlIlIlIIl;
    }
    
    private static int llIlIlIlIlIIllI(final double n, final double n2) {
        return dcmpg(n, n2);
    }
    
    public boolean isOutsideBorder() {
        return this.isOutsideBorder;
    }
    
    public void onDataWatcherUpdate(final int lllllllllllllIIlIlllIIIIIllIIlIl) {
    }
    
    public void setSprinting(final boolean lllllllllllllIIlIlllIIlIIlIlIllI) {
        this.setFlag(Entity.lIIllIIIIIllIl[3], lllllllllllllIIlIlllIIlIIlIlIllI);
    }
    
    public int getEntityId() {
        return this.entityId;
    }
    
    public int getBrightnessForRender(final float lllllllllllllIIlIlllIllIlIllllll) {
        final BlockPos lllllllllllllIIlIlllIllIlIllllIl = new BlockPos(this.posX, this.posY + this.getEyeHeight(), this.posZ);
        int combinedLight;
        if (llIlIlIlIIllIIl(this.worldObj.isBlockLoaded(lllllllllllllIIlIlllIllIlIllllIl) ? 1 : 0)) {
            combinedLight = this.worldObj.getCombinedLight(lllllllllllllIIlIlllIllIlIllllIl, Entity.lIIllIIIIIllIl[1]);
            "".length();
            if (null != null) {
                return "  ".length() & ("  ".length() ^ -" ".length());
            }
        }
        else {
            combinedLight = Entity.lIIllIIIIIllIl[1];
        }
        return combinedLight;
    }
    
    public boolean isEntityInvulnerable(final DamageSource lllllllllllllIIlIlllIIIlIlIlIIIl) {
        if (llIlIlIlIIllIIl(this.invulnerable ? 1 : 0) && llIlIlIlIllIIII(lllllllllllllIIlIlllIIIlIlIlIIIl, DamageSource.outOfWorld) && llIlIlIlIlIIIII(lllllllllllllIIlIlllIIIlIlIlIIIl.isCreativePlayer() ? 1 : 0)) {
            return Entity.lIIllIIIIIllIl[0] != 0;
        }
        return Entity.lIIllIIIIIllIl[1] != 0;
    }
    
    public void addToPlayerScore(final Entity lllllllllllllIIlIlllIlIIlllIllII, final int lllllllllllllIIlIlllIlIIlllIlIll) {
    }
    
    protected boolean pushOutOfBlocks(final double lllllllllllllIIlIlllIIIllIllllIl, final double lllllllllllllIIlIlllIIIllIlIlIII, final double lllllllllllllIIlIlllIIIllIlIIllI) {
        final BlockPos lllllllllllllIIlIlllIIIllIlllIII = new BlockPos(lllllllllllllIIlIlllIIIllIllllIl, lllllllllllllIIlIlllIIIllIlIlIII, lllllllllllllIIlIlllIIIllIlIIllI);
        final double lllllllllllllIIlIlllIIIllIllIlll = lllllllllllllIIlIlllIIIllIllllIl - lllllllllllllIIlIlllIIIllIlllIII.getX();
        final double lllllllllllllIIlIlllIIIllIllIlIl = lllllllllllllIIlIlllIIIllIlIlIII - lllllllllllllIIlIlllIIIllIlllIII.getY();
        final double lllllllllllllIIlIlllIIIllIllIIll = lllllllllllllIIlIlllIIIllIlIIllI - lllllllllllllIIlIlllIIIllIlllIII.getZ();
        final List<AxisAlignedBB> lllllllllllllIIlIlllIIIllIllIIlI = this.worldObj.func_147461_a(this.getEntityBoundingBox());
        if (llIlIlIlIIllIIl(lllllllllllllIIlIlllIIIllIllIIlI.isEmpty() ? 1 : 0) && llIlIlIlIlIIIII(this.worldObj.isBlockFullCube(lllllllllllllIIlIlllIIIllIlllIII) ? 1 : 0)) {
            return Entity.lIIllIIIIIllIl[1] != 0;
        }
        int lllllllllllllIIlIlllIIIllIllIIIl = Entity.lIIllIIIIIllIl[3];
        double lllllllllllllIIlIlllIIIllIllIIII = 9999.0;
        if (llIlIlIlIlIIIII(this.worldObj.isBlockFullCube(lllllllllllllIIlIlllIIIllIlllIII.west()) ? 1 : 0) && llIlIlIlIlIIlII(llIlIlIllIIllll(lllllllllllllIIlIlllIIIllIllIlll, lllllllllllllIIlIlllIIIllIllIIII))) {
            lllllllllllllIIlIlllIIIllIllIIII = lllllllllllllIIlIlllIIIllIllIlll;
            lllllllllllllIIlIlllIIIllIllIIIl = Entity.lIIllIIIIIllIl[1];
        }
        if (llIlIlIlIlIIIII(this.worldObj.isBlockFullCube(lllllllllllllIIlIlllIIIllIlllIII.east()) ? 1 : 0) && llIlIlIlIlIIlII(llIlIlIllIIllll(1.0 - lllllllllllllIIlIlllIIIllIllIlll, lllllllllllllIIlIlllIIIllIllIIII))) {
            lllllllllllllIIlIlllIIIllIllIIII = 1.0 - lllllllllllllIIlIlllIIIllIllIlll;
            lllllllllllllIIlIlllIIIllIllIIIl = Entity.lIIllIIIIIllIl[0];
        }
        if (llIlIlIlIlIIIII(this.worldObj.isBlockFullCube(lllllllllllllIIlIlllIIIllIlllIII.up()) ? 1 : 0) && llIlIlIlIlIIlII(llIlIlIllIIllll(1.0 - lllllllllllllIIlIlllIIIllIllIlIl, lllllllllllllIIlIlllIIIllIllIIII))) {
            lllllllllllllIIlIlllIIIllIllIIII = 1.0 - lllllllllllllIIlIlllIIIllIllIlIl;
            lllllllllllllIIlIlllIIIllIllIIIl = Entity.lIIllIIIIIllIl[3];
        }
        if (llIlIlIlIlIIIII(this.worldObj.isBlockFullCube(lllllllllllllIIlIlllIIIllIlllIII.north()) ? 1 : 0) && llIlIlIlIlIIlII(llIlIlIllIIllll(lllllllllllllIIlIlllIIIllIllIIll, lllllllllllllIIlIlllIIIllIllIIII))) {
            lllllllllllllIIlIlllIIIllIllIIII = lllllllllllllIIlIlllIIIllIllIIll;
            lllllllllllllIIlIlllIIIllIllIIIl = Entity.lIIllIIIIIllIl[5];
        }
        if (llIlIlIlIlIIIII(this.worldObj.isBlockFullCube(lllllllllllllIIlIlllIIIllIlllIII.south()) ? 1 : 0) && llIlIlIlIlIIlII(llIlIlIllIIllll(1.0 - lllllllllllllIIlIlllIIIllIllIIll, lllllllllllllIIlIlllIIIllIllIIII))) {
            lllllllllllllIIlIlllIIIllIllIIII = 1.0 - lllllllllllllIIlIlllIIIllIllIIll;
            lllllllllllllIIlIlllIIIllIllIIIl = Entity.lIIllIIIIIllIl[9];
        }
        final float lllllllllllllIIlIlllIIIllIlIllll = this.rand.nextFloat() * 0.2f + 0.1f;
        if (llIlIlIlIlIIIII(lllllllllllllIIlIlllIIIllIllIIIl)) {
            this.motionX = -lllllllllllllIIlIlllIIIllIlIllll;
        }
        if (llIlIlIlIIllIlI(lllllllllllllIIlIlllIIIllIllIIIl, Entity.lIIllIIIIIllIl[0])) {
            this.motionX = lllllllllllllIIlIlllIIIllIlIllll;
        }
        if (llIlIlIlIIllIlI(lllllllllllllIIlIlllIIIllIllIIIl, Entity.lIIllIIIIIllIl[3])) {
            this.motionY = lllllllllllllIIlIlllIIIllIlIllll;
        }
        if (llIlIlIlIIllIlI(lllllllllllllIIlIlllIIIllIllIIIl, Entity.lIIllIIIIIllIl[5])) {
            this.motionZ = -lllllllllllllIIlIlllIIIllIlIllll;
        }
        if (llIlIlIlIIllIlI(lllllllllllllIIlIlllIIIllIllIIIl, Entity.lIIllIIIIIllIl[9])) {
            this.motionZ = lllllllllllllIIlIlllIIIllIlIllll;
        }
        return Entity.lIIllIIIIIllIl[0] != 0;
    }
    
    protected void updateFallState(final double lllllllllllllIIlIlllIlllllIIIIlI, final boolean lllllllllllllIIlIlllIlllllIIIIIl, final Block lllllllllllllIIlIlllIlllllIIIlll, final BlockPos lllllllllllllIIlIlllIllllIllllll) {
        if (llIlIlIlIIllIIl(lllllllllllllIIlIlllIlllllIIIIIl ? 1 : 0)) {
            if (llIlIlIlIIlllIl(llIlIlIlIllIllI(this.fallDistance, 0.0f))) {
                if (llIlIlIlIIllIII(lllllllllllllIIlIlllIlllllIIIlll)) {
                    lllllllllllllIIlIlllIlllllIIIlll.onFallenUpon(this.worldObj, lllllllllllllIIlIlllIllllIllllll, this, this.fallDistance);
                    "".length();
                    if ((" ".length() & ~" ".length()) != 0x0) {
                        return;
                    }
                }
                else {
                    this.fall(this.fallDistance, 1.0f);
                }
                this.fallDistance = 0.0f;
                "".length();
                if (" ".length() != " ".length()) {
                    return;
                }
            }
        }
        else if (llIlIlIlIlIIlII(llIlIlIlIllIlll(lllllllllllllIIlIlllIlllllIIIIlI, 0.0))) {
            this.fallDistance -= (float)lllllllllllllIIlIlllIlllllIIIIlI;
        }
    }
    
    private static int llIlIlIlIllllIl(final double n, final double n2) {
        return dcmpg(n, n2);
    }
    
    public double getDistanceSqToEntity(final Entity lllllllllllllIIlIlllIlIllIllIIII) {
        final double lllllllllllllIIlIlllIlIllIlllIII = this.posX - lllllllllllllIIlIlllIlIllIllIIII.posX;
        final double lllllllllllllIIlIlllIlIllIllIllI = this.posY - lllllllllllllIIlIlllIlIllIllIIII.posY;
        final double lllllllllllllIIlIlllIlIllIllIlII = this.posZ - lllllllllllllIIlIlllIlIllIllIIII.posZ;
        return lllllllllllllIIlIlllIlIllIlllIII * lllllllllllllIIlIlllIlIllIlllIII + lllllllllllllIIlIlllIlIllIllIllI * lllllllllllllIIlIlllIlIllIllIllI + lllllllllllllIIlIlllIlIllIllIlII * lllllllllllllIIlIlllIlIllIllIlII;
    }
    
    private static int llIlIlIlIlllIIl(final float n, final float n2) {
        return fcmpl(n, n2);
    }
    
    public boolean canBeCollidedWith() {
        return Entity.lIIllIIIIIllIl[1] != 0;
    }
    
    private static int llIlIlIlIIlllll(final float n, final float n2) {
        return fcmpl(n, n2);
    }
    
    public NBTTagCompound getNBTTagCompound() {
        return null;
    }
    
    protected void doBlockCollisions() {
        final BlockPos lllllllllllllIIlIllllIIIIlIIIlII = new BlockPos(this.getEntityBoundingBox().minX + 0.001, this.getEntityBoundingBox().minY + 0.001, this.getEntityBoundingBox().minZ + 0.001);
        final BlockPos lllllllllllllIIlIllllIIIIlIIIIlI = new BlockPos(this.getEntityBoundingBox().maxX - 0.001, this.getEntityBoundingBox().maxY - 0.001, this.getEntityBoundingBox().maxZ - 0.001);
        if (llIlIlIlIIllIIl(this.worldObj.isAreaLoaded(lllllllllllllIIlIllllIIIIlIIIlII, lllllllllllllIIlIllllIIIIlIIIIlI) ? 1 : 0)) {
            int lllllllllllllIIlIllllIIIIlIIIIII = lllllllllllllIIlIllllIIIIlIIIlII.getX();
            "".length();
            if ((0xA7 ^ 0xA3) <= 0) {
                return;
            }
            while (!llIlIlIlIllIlII(lllllllllllllIIlIllllIIIIlIIIIII, lllllllllllllIIlIllllIIIIlIIIIlI.getX())) {
                int lllllllllllllIIlIllllIIIIIlllllI = lllllllllllllIIlIllllIIIIlIIIlII.getY();
                "".length();
                if ((" ".length() & ~" ".length()) != 0x0) {
                    return;
                }
                while (!llIlIlIlIllIlII(lllllllllllllIIlIllllIIIIIlllllI, lllllllllllllIIlIllllIIIIlIIIIlI.getY())) {
                    int lllllllllllllIIlIllllIIIIIllllII = lllllllllllllIIlIllllIIIIlIIIlII.getZ();
                    "".length();
                    if (" ".length() <= ((0xD4 ^ 0xC6) & ~(0xB0 ^ 0xA2))) {
                        return;
                    }
                    while (!llIlIlIlIllIlII(lllllllllllllIIlIllllIIIIIllllII, lllllllllllllIIlIllllIIIIlIIIIlI.getZ())) {
                        final BlockPos lllllllllllllIIlIllllIIIIIlllIlI = new BlockPos(lllllllllllllIIlIllllIIIIlIIIIII, lllllllllllllIIlIllllIIIIIlllllI, lllllllllllllIIlIllllIIIIIllllII);
                        final IBlockState lllllllllllllIIlIllllIIIIIlllIII = this.worldObj.getBlockState(lllllllllllllIIlIllllIIIIIlllIlI);
                        try {
                            lllllllllllllIIlIllllIIIIIlllIII.getBlock().onEntityCollidedWithBlock(this.worldObj, lllllllllllllIIlIllllIIIIIlllIlI, lllllllllllllIIlIllllIIIIIlllIII, this);
                            "".length();
                            if (-" ".length() == "  ".length()) {
                                return;
                            }
                        }
                        catch (Throwable lllllllllllllIIlIllllIIIIIllIllI) {
                            final CrashReport lllllllllllllIIlIllllIIIIIllIlIl = CrashReport.makeCrashReport(lllllllllllllIIlIllllIIIIIllIllI, Entity.lIIlIllllIIlll[Entity.lIIllIIIIIllIl[13]]);
                            final CrashReportCategory lllllllllllllIIlIllllIIIIIllIlII = lllllllllllllIIlIllllIIIIIllIlIl.makeCategory(Entity.lIIlIllllIIlll[Entity.lIIllIIIIIllIl[14]]);
                            CrashReportCategory.addBlockInfo(lllllllllllllIIlIllllIIIIIllIlII, lllllllllllllIIlIllllIIIIIlllIlI, lllllllllllllIIlIllllIIIIIlllIII);
                            throw new ReportedException(lllllllllllllIIlIllllIIIIIllIlIl);
                        }
                        ++lllllllllllllIIlIllllIIIIIllllII;
                    }
                    ++lllllllllllllIIlIllllIIIIIlllllI;
                }
                ++lllllllllllllIIlIllllIIIIlIIIIII;
            }
        }
    }
    
    protected String getSwimSound() {
        return Entity.lIIlIllllIIlll[Entity.lIIllIIIIIllIl[11]];
    }
    
    protected void setSize(final float lllllllllllllIIlIllllIlIIllIIIII, final float lllllllllllllIIlIllllIlIIllIIlII) {
        if (!llIlIlIlIlIIIII(llIlIlIlIIlllll(lllllllllllllIIlIllllIlIIllIIIII, this.width)) || llIlIlIlIIllIIl(llIlIlIlIIlllll(lllllllllllllIIlIllllIlIIllIIlII, this.height))) {
            final float lllllllllllllIIlIllllIlIIllIIIll = this.width;
            this.width = lllllllllllllIIlIllllIlIIllIIIII;
            this.height = lllllllllllllIIlIllllIlIIllIIlII;
            this.setEntityBoundingBox(new AxisAlignedBB(this.getEntityBoundingBox().minX, this.getEntityBoundingBox().minY, this.getEntityBoundingBox().minZ, this.getEntityBoundingBox().minX + this.width, this.getEntityBoundingBox().minY + this.height, this.getEntityBoundingBox().minZ + this.width));
            if (llIlIlIlIIlllIl(llIlIlIlIIlllll(this.width, lllllllllllllIIlIllllIlIIllIIIll)) && llIlIlIlIlIIIII(this.firstUpdate ? 1 : 0) && llIlIlIlIlIIIII(this.worldObj.isRemote ? 1 : 0)) {
                this.moveEntity(lllllllllllllIIlIllllIlIIllIIIll - this.width, 0.0, lllllllllllllIIlIllllIlIIllIIIll - this.width);
            }
        }
    }
    
    protected NBTTagList newDoubleNBTList(final double... lllllllllllllIIlIlllIlIIIIIllIII) {
        final NBTTagList lllllllllllllIIlIlllIlIIIIIllIll = new NBTTagList();
        final long lllllllllllllIIlIlllIlIIIIIIlllI = (Object)lllllllllllllIIlIlllIlIIIIIllIII;
        final boolean lllllllllllllIIlIlllIlIIIIIlIIII = lllllllllllllIIlIlllIlIIIIIllIII.length != 0;
        char lllllllllllllIIlIlllIlIIIIIlIIlI = (char)Entity.lIIllIIIIIllIl[1];
        "".length();
        if (((0xB1 ^ 0xA1) & ~(0x46 ^ 0x56)) > (0xA ^ 0xE)) {
            return null;
        }
        while (!llIlIlIlIlIIIll(lllllllllllllIIlIlllIlIIIIIlIIlI, lllllllllllllIIlIlllIlIIIIIlIIII ? 1 : 0)) {
            final double lllllllllllllIIlIlllIlIIIIIllIIl = lllllllllllllIIlIlllIlIIIIIIlllI[lllllllllllllIIlIlllIlIIIIIlIIlI];
            lllllllllllllIIlIlllIlIIIIIllIll.appendTag(new NBTTagDouble(lllllllllllllIIlIlllIlIIIIIllIIl));
            ++lllllllllllllIIlIlllIlIIIIIlIIlI;
        }
        return lllllllllllllIIlIlllIlIIIIIllIll;
    }
    
    public String getCustomNameTag() {
        return this.dataWatcher.getWatchableObjectString(Entity.lIIllIIIIIllIl[4]);
    }
    
    protected void applyEnchantments(final EntityLivingBase lllllllllllllIIlIllIlllllIllIlII, final Entity lllllllllllllIIlIllIlllllIllIIll) {
        if (llIlIlIlIIllIIl((lllllllllllllIIlIllIlllllIllIIll instanceof EntityLivingBase) ? 1 : 0)) {
            EnchantmentHelper.applyThornEnchantments((EntityLivingBase)lllllllllllllIIlIllIlllllIllIIll, lllllllllllllIIlIllIlllllIllIlII);
        }
        EnchantmentHelper.applyArthropodEnchantments(lllllllllllllIIlIllIlllllIllIlII, lllllllllllllIIlIllIlllllIllIIll);
    }
    
    public boolean isEntityInsideOpaqueBlock() {
        if (llIlIlIlIIllIIl(this.noClip ? 1 : 0)) {
            return Entity.lIIllIIIIIllIl[1] != 0;
        }
        final BlockPos.MutableBlockPos lllllllllllllIIlIlllIIlllIIlIIIl = new BlockPos.MutableBlockPos(Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);
        int lllllllllllllIIlIlllIIlllIIlIIII = Entity.lIIllIIIIIllIl[1];
        "".length();
        if (" ".length() >= "  ".length()) {
            return ((0xD1 ^ 0x94) & ~(0x45 ^ 0x0)) != 0x0;
        }
        while (!llIlIlIlIlIIIll(lllllllllllllIIlIlllIIlllIIlIIII, Entity.lIIllIIIIIllIl[11])) {
            final int lllllllllllllIIlIlllIIlllIIIlllI = MathHelper.floor_double(this.posY + ((lllllllllllllIIlIlllIIlllIIlIIII >> Entity.lIIllIIIIIllIl[1]) % Entity.lIIllIIIIIllIl[4] - 0.5f) * 0.1f + this.getEyeHeight());
            final int lllllllllllllIIlIlllIIlllIIIllII = MathHelper.floor_double(this.posX + ((lllllllllllllIIlIlllIIlllIIlIIII >> Entity.lIIllIIIIIllIl[0]) % Entity.lIIllIIIIIllIl[4] - 0.5f) * this.width * 0.8f);
            final int lllllllllllllIIlIlllIIlllIIIlIlI = MathHelper.floor_double(this.posZ + ((lllllllllllllIIlIlllIIlllIIlIIII >> Entity.lIIllIIIIIllIl[4]) % Entity.lIIllIIIIIllIl[4] - 0.5f) * this.width * 0.8f);
            if (!llIlIlIlIIllIlI(lllllllllllllIIlIlllIIlllIIlIIIl.getX(), lllllllllllllIIlIlllIIlllIIIllII) || !llIlIlIlIIllIlI(lllllllllllllIIlIlllIIlllIIlIIIl.getY(), lllllllllllllIIlIlllIIlllIIIlllI) || llIlIlIlIllllII(lllllllllllllIIlIlllIIlllIIlIIIl.getZ(), lllllllllllllIIlIlllIIlllIIIlIlI)) {
                lllllllllllllIIlIlllIIlllIIlIIIl.func_181079_c(lllllllllllllIIlIlllIIlllIIIllII, lllllllllllllIIlIlllIIlllIIIlllI, lllllllllllllIIlIlllIIlllIIIlIlI);
                "".length();
                if (llIlIlIlIIllIIl(this.worldObj.getBlockState(lllllllllllllIIlIlllIIlllIIlIIIl).getBlock().isVisuallyOpaque() ? 1 : 0)) {
                    return Entity.lIIllIIIIIllIl[0] != 0;
                }
            }
            ++lllllllllllllIIlIlllIIlllIIlIIII;
        }
        return Entity.lIIllIIIIIllIl[1] != 0;
    }
    
    public boolean isInRangeToRender3d(final double lllllllllllllIIlIlllIlIIllIIlIIl, final double lllllllllllllIIlIlllIlIIllIlIlII, final double lllllllllllllIIlIlllIlIIllIIIlIl) {
        final double lllllllllllllIIlIlllIlIIllIlIIlI = this.posX - lllllllllllllIIlIlllIlIIllIIlIIl;
        final double lllllllllllllIIlIlllIlIIllIlIIIl = this.posY - lllllllllllllIIlIlllIlIIllIlIlII;
        final double lllllllllllllIIlIlllIlIIllIIllll = this.posZ - lllllllllllllIIlIlllIlIIllIIIlIl;
        final double lllllllllllllIIlIlllIlIIllIIllIl = lllllllllllllIIlIlllIlIIllIlIIlI * lllllllllllllIIlIlllIlIIllIlIIlI + lllllllllllllIIlIlllIlIIllIlIIIl * lllllllllllllIIlIlllIlIIllIlIIIl + lllllllllllllIIlIlllIlIIllIIllll * lllllllllllllIIlIlllIlIIllIIllll;
        return this.isInRangeToRenderDist(lllllllllllllIIlIlllIlIIllIIllIl);
    }
    
    public void setCustomNameTag(final String lllllllllllllIIlIlllIIIIlIlIlIlI) {
        this.dataWatcher.updateObject(Entity.lIIllIIIIIllIl[4], lllllllllllllIIlIlllIIIIlIlIlIlI);
    }
    
    public boolean isSprinting() {
        return this.getFlag(Entity.lIIllIIIIIllIl[3]);
    }
    
    public void mountEntity(final Entity lllllllllllllIIlIlllIIllIIlIIlIl) {
        this.entityRiderPitchDelta = 0.0;
        this.entityRiderYawDelta = 0.0;
        if (llIlIlIlIlIIIlI(lllllllllllllIIlIlllIIllIIlIIlIl)) {
            if (llIlIlIlIIllIII(this.ridingEntity)) {
                this.setLocationAndAngles(this.ridingEntity.posX, this.ridingEntity.getEntityBoundingBox().minY + this.ridingEntity.height, this.ridingEntity.posZ, this.rotationYaw, this.rotationPitch);
                this.ridingEntity.riddenByEntity = null;
            }
            this.ridingEntity = null;
            "".length();
            if (" ".length() == "   ".length()) {
                return;
            }
        }
        else {
            if (llIlIlIlIIllIII(this.ridingEntity)) {
                this.ridingEntity.riddenByEntity = null;
            }
            if (llIlIlIlIIllIII(lllllllllllllIIlIlllIIllIIlIIlIl)) {
                Entity lllllllllllllIIlIlllIIllIIlIlIIl = lllllllllllllIIlIlllIIllIIlIIlIl.ridingEntity;
                "".length();
                if (null != null) {
                    return;
                }
                while (!llIlIlIlIlIIIlI(lllllllllllllIIlIlllIIllIIlIlIIl)) {
                    if (llIlIlIlIlIlllI(lllllllllllllIIlIlllIIllIIlIlIIl, this)) {
                        return;
                    }
                    lllllllllllllIIlIlllIIllIIlIlIIl = lllllllllllllIIlIlllIIllIIlIlIIl.ridingEntity;
                }
            }
            this.ridingEntity = lllllllllllllIIlIlllIIllIIlIIlIl;
            lllllllllllllIIlIlllIIllIIlIIlIl.riddenByEntity = this;
        }
    }
    
    public void setDead() {
        this.isDead = (Entity.lIIllIIIIIllIl[0] != 0);
    }
    
    public void setCurrentItemOrArmor(final int lllllllllllllIIlIlllIIlIlIIIlllI, final ItemStack lllllllllllllIIlIlllIIlIlIIIllII) {
    }
    
    private static void llIlIlIIlIIlIll() {
        (lIIlIllllIIlll = new String[Entity.lIIllIIIIIllIl[78]])[Entity.lIIllIIIIIllIl[1]] = llIlIlIIIlIIlll("3Cl8rR6oEnE=", "IeBNk");
        Entity.lIIlIllllIIlll[Entity.lIIllIIIIIllIl[0]] = llIlIlIIIlIlllI("MhgOAjkuNBsYKAMfGQA=", "WvzkM");
        Entity.lIIlIllllIIlll[Entity.lIIllIIIIIllIl[4]] = llIlIlIIIlIllll("DoBvu6tcxHY=", "AzrOY");
        Entity.lIIlIllllIIlll[Entity.lIIllIIIIIllIl[3]] = llIlIlIIIlIlllI("GRkTEg==", "tvewT");
        Entity.lIIlIllllIIlll[Entity.lIIllIIIIIllIl[5]] = llIlIlIIIlIlllI("NSsbNw==", "GNhCq");
        Entity.lIIlIllllIIlll[Entity.lIIllIIIIIllIl[9]] = llIlIlIIIlIlllI("JB0OJDsOGwxnNQkBAjMpRxcHKDMMVQgoPAscGC4/CQ==", "gukGP");
        Entity.lIIlIllllIIlll[Entity.lIIllIIIIIllIl[10]] = llIlIlIIIlIllll("gfZB2+rjHEgQPOBVTWRIDuptisavnJH1DJsqHIwQGXM+AKAfFI3KGA==", "cHFlE");
        Entity.lIIlIllllIIlll[Entity.lIIllIIIIIllIl[12]] = llIlIlIIIlIIlll("xnKayAmjK7y72EpexzGzTw==", "boqmy");
        Entity.lIIlIllllIIlll[Entity.lIIllIIIIIllIl[11]] = llIlIlIIIlIllll("Cg0XSCck0p491699wtBfnILqZHjkrNt4", "cERBC");
        Entity.lIIlIllllIIlll[Entity.lIIllIIIIIllIl[13]] = llIlIlIIIlIllll("NLcEIC006tZ6KWkl7tUKMn03Akd+EXDyHNoF8ZWIlPw=", "duAcG");
        Entity.lIIlIllllIIlll[Entity.lIIllIIIIIllIl[14]] = llIlIlIIIlIlllI("JzgXFCFFNh0eJAJ0GxgmCT0cEi5FIxEDIg==", "eTxwJ");
        Entity.lIIlIllllIIlll[Entity.lIIllIIIIIllIl[15]] = llIlIlIIIlIlllI("MgkvJ107DTc2ATQEbDEEPAVsMQM5CTEq", "UhBBs");
        Entity.lIIlIllllIIlll[Entity.lIIllIIIIIllIl[16]] = llIlIlIIIlIIlll("7Mt9NjxSFmM=", "rOdVQ");
        Entity.lIIlIllllIIlll[Entity.lIIllIIIIIllIl[17]] = llIlIlIIIlIlllI("OBY=", "QreUu");
        Entity.lIIlIllllIIlll[Entity.lIIllIIIIIllIl[18]] = llIlIlIIIlIlllI("Nysr", "gDXoL");
        Entity.lIIlIllllIIlll[Entity.lIIllIIIIIllIl[8]] = llIlIlIIIlIllll("I4hHQa40ITs=", "JjZnq");
        Entity.lIIlIllllIIlll[Entity.lIIllIIIIIllIl[19]] = llIlIlIIIlIllll("VOPCDmZUER9SXH3qdZe9LA==", "WAzCo");
        Entity.lIIlIllllIIlll[Entity.lIIllIIIIIllIl[20]] = llIlIlIIIlIIlll("sQSkgKorayaIchLEGShsQw==", "GBhNR");
        Entity.lIIlIllllIIlll[Entity.lIIllIIIIIllIl[21]] = llIlIlIIIlIlllI("ExknBg==", "UpUcI");
        Entity.lIIlIllllIIlll[Entity.lIIllIIIIIllIl[22]] = llIlIlIIIlIIlll("ugvf4frkjX4=", "AMqiH");
        Entity.lIIlIllllIIlll[Entity.lIIllIIIIIllIl[7]] = llIlIlIIIlIllll("/OebrbMQHbDGuLPHi/ADfw==", "tWcFu");
        Entity.lIIlIllllIIlll[Entity.lIIllIIIIIllIl[23]] = llIlIlIIIlIllll("DyAk1NEa79ZtveaM/MQAcQ==", "dmbBT");
        Entity.lIIlIllllIIlll[Entity.lIIllIIIIIllIl[24]] = llIlIlIIIlIllll("FQVRmgSs05cWn6+YGEwNnA==", "sjDDC");
        Entity.lIIlIllllIIlll[Entity.lIIllIIIIIllIl[25]] = llIlIlIIIlIIlll("RM/BkcWvSQX5WQlueH8kjw==", "UQtXG");
        Entity.lIIlIllllIIlll[Entity.lIIllIIIIIllIl[26]] = llIlIlIIIlIlllI("PzsTBjoFHS4=", "jnZBw");
        Entity.lIIlIllllIIlll[Entity.lIIllIIIIIllIl[27]] = llIlIlIIIlIllll("BWMASsswBStlOd77ZnqVmA==", "SwDzY");
        Entity.lIIlIllllIIlll[Entity.lIIllIIIIIllIl[28]] = llIlIlIIIlIlllI("FQIkIxk7OTY6Ew==", "VwWWv");
        Entity.lIIlIllllIIlll[Entity.lIIllIIIIIllIl[29]] = llIlIlIIIlIlllI("GRsSMCM3IAApKQwHEi0uNgs=", "ZnaDL");
        Entity.lIIlIllllIIlll[Entity.lIIllIIIIIllIl[30]] = llIlIlIIIlIlllI("JC4UIzcD", "wGxFY");
        Entity.lIIlIllllIIlll[Entity.lIIllIIIIIllIl[31]] = llIlIlIIIlIllll("DZRvsL1RF3E=", "hbubb");
        Entity.lIIlIllllIIlll[Entity.lIIllIIIIIllIl[32]] = llIlIlIIIlIlllI("BiYeMwMyZw00GTwzEXojFxM=", "UGhZm");
        Entity.lIIlIllllIIlll[Entity.lIIllIIIIIllIl[33]] = llIlIlIIIlIllll("9OtmtDJ52T/Cg16VLH3IybSLSMLFN1cI", "XaRWE");
        Entity.lIIlIllllIIlll[Entity.lIIllIIIIIllIl[34]] = llIlIlIIIlIllll("ChSW1VlRQ5A=", "DAcGq");
        Entity.lIIlIllllIIlll[Entity.lIIllIIIIIllIl[35]] = llIlIlIIIlIlllI("GiYCJjs5", "WIvOT");
        Entity.lIIlIllllIIlll[Entity.lIIllIIIIIllIl[36]] = llIlIlIIIlIllll("ioQaGolOIRUDWLoRwvNkbg==", "wODBB");
        Entity.lIIlIllllIIlll[Entity.lIIllIIIIIllIl[37]] = llIlIlIIIlIlllI("NjQjAzwZJjsOFhMw", "pUOox");
        Entity.lIIlIllllIIlll[Entity.lIIllIIIIIllIl[38]] = llIlIlIIIlIlllI("LQwmKA==", "keTMP");
        Entity.lIIlIllllIIlll[Entity.lIIllIIIIIllIl[39]] = llIlIlIIIlIllll("1QnZYjmGqso=", "MWHlN");
        Entity.lIIlIllllIIlll[Entity.lIIllIIIIIllIl[40]] = llIlIlIIIlIllll("YsIIIYXc1JgGxxGRlxj/0A==", "Skikm");
        Entity.lIIlIllllIIlll[Entity.lIIllIIIIIllIl[41]] = llIlIlIIIlIlllI("FCYfEiUjJh0Z", "POrwK");
        Entity.lIIlIllllIIlll[Entity.lIIllIIIIIllIl[42]] = llIlIlIIIlIIlll("d3RaeXlm9QV3+lcdDP2WbQ==", "SMXDK");
        Entity.lIIlIllllIIlll[Entity.lIIllIIIIIllIl[43]] = llIlIlIIIlIllll("RTbGKCFaECoMlNI47aL+SA==", "ZQCsf");
        Entity.lIIlIllllIIlll[Entity.lIIllIIIIIllIl[44]] = llIlIlIIIlIIlll("jX/8AIbjZ9eYvUOFsJqDEA==", "DmuwY");
        Entity.lIIlIllllIIlll[Entity.lIIllIIIIIllIl[45]] = llIlIlIIIlIIlll("O9PKFGIGW7QGV5HTZL8TwA==", "xwgjf");
        Entity.lIIlIllllIIlll[Entity.lIIllIIIIIllIl[46]] = llIlIlIIIlIllll("bbzg+qjKXv3if4RxHW0g7A==", "BPSRo");
        Entity.lIIlIllllIIlll[Entity.lIIllIIIIIllIl[47]] = llIlIlIIIlIlllI("PTweAwMNCCQz", "hiWGO");
        Entity.lIIlIllllIIlll[Entity.lIIllIIIIIllIl[48]] = llIlIlIIIlIIlll("UIEwBNr0uh8=", "ujPtM");
        Entity.lIIlIllllIIlll[Entity.lIIllIIIIIllIl[49]] = llIlIlIIIlIllll("Dmxj24MHkMY=", "hzjcH");
        Entity.lIIlIllllIIlll[Entity.lIIllIIIIIllIl[50]] = llIlIlIIIlIlllI("Bgw4MQ4oNyooBA==", "EyKEa");
        Entity.lIIlIllllIIlll[Entity.lIIllIIIIIllIl[51]] = llIlIlIIIlIIlll("SkJwd+urFnjRi3eVcep3TA==", "EAuHL");
        Entity.lIIlIllllIIlll[Entity.lIIllIIIIIllIl[52]] = llIlIlIIIlIIlll("/oFDkr4eO2ZtpBa7GttpWg==", "elsSL");
        Entity.lIIlIllllIIlll[Entity.lIIllIIIIIllIl[53]] = llIlIlIIIlIllll("2jEBzr72Pc2HvidT3KAUOHGwoJBzHfW5", "jodps");
        Entity.lIIlIllllIIlll[Entity.lIIllIIIIIllIl[54]] = llIlIlIIIlIlllI("OCwhMi8f", "kEMWA");
        Entity.lIIlIllllIIlll[Entity.lIIllIIIIIllIl[55]] = llIlIlIIIlIllll("XHhzXxeGmEzr7PDv5W2bbZSVuP5ar+Hu", "CgPGZ");
        Entity.lIIlIllllIIlll[Entity.lIIllIIIIIllIl[56]] = llIlIlIIIlIlllI("FisuPyMqZTgzPj0iejo4MiE/Mg==", "SEZVW");
        Entity.lIIlIllllIIlll[Entity.lIIllIIIIIllIl[57]] = llIlIlIIIlIllll("qq9BG6Q8BHs=", "mtJmY");
        Entity.lIIlIllllIIlll[Entity.lIIllIIIIIllIl[58]] = llIlIlIIIlIlllI("IgwnLQY+TA==", "GbSDr");
        Entity.lIIlIllllIIlll[Entity.lIIllIIIIIllIl[59]] = llIlIlIIIlIllll("uQUQaVIX2Bc=", "kvval");
        Entity.lIIlIllllIIlll[Entity.lIIllIIIIIllIl[60]] = llIlIlIIIlIllll("nL9uVGj2emLpRlV2hmQruRgs2sr3EK8LkihGXP/LxbAM4QPX9n/APQToH4F10m4U", "mLJJk");
        Entity.lIIlIllllIIlll[Entity.lIIllIIIIIllIl[61]] = llIlIlIIIlIlllI("ODQRFRw4", "FzDYP");
        Entity.lIIlIllllIIlll[Entity.lIIllIIIIIllIl[62]] = llIlIlIIIlIlllI("DikELDUIBQwvNwMyDC08", "mAeBR");
        Entity.lIIlIllllIIlll[Entity.lIIllIIIIIllIl[63]] = llIlIlIIIlIIlll("/1mRLsElpGk0hfBVxgSU/w==", "aWETA");
        Entity.lIIlIllllIIlll[Entity.lIIllIIIIIllIl[64]] = llIlIlIIIlIllll("iMpQ7hifDhuizPAJfktxqQ==", "owTFf");
        Entity.lIIlIllllIIlll[Entity.lIIllIIIIIllIl[65]] = llIlIlIIIlIllll("UDgf9Qgn5yysBqN7mmFjJQ==", "nRBgh");
        Entity.lIIlIllllIIlll[Entity.lIIllIIIIIllIl[66]] = llIlIlIIIlIIlll("NraDOBjJEOtRrLo0ZpenjA==", "anuVU");
        Entity.lIIlIllllIIlll[Entity.lIIllIIIIIllIl[67]] = llIlIlIIIlIllll("QZBnwjVKi3QMAs1dhXi4fw==", "eQaOv");
        Entity.lIIlIllllIIlll[Entity.lIIllIIIIIllIl[68]] = llIlIlIIIlIllll("KBFl18xuHr0uA3B7k66PeWP30KtvylfY", "QkDXb");
        Entity.lIIlIllllIIlll[Entity.lIIllIIIIIllIl[69]] = llIlIlIIIlIllll("mXYJN/6S3RiUKJpV8tp1zXZQgMlvWvfu", "lSXqb");
        Entity.lIIlIllllIIlll[Entity.lIIllIIIIIllIl[70]] = llIlIlIIIlIlllI("Nw0TKCELRBRhFx4MBCp1HgwEICEbDAk=", "rcgAU");
        Entity.lIIlIllllIIlll[Entity.lIIllIIIIIllIl[71]] = llIlIlIIIlIIlll("cZJnF2eUWHMNtJ7zPbfmihwlSqm7dgOs", "GRZLI");
        Entity.lIIlIllllIIlll[Entity.lIIllIIIIIllIl[72]] = llIlIlIIIlIlllI("TlZ7NFtLXWdgEUdYbHxFDQ==", "kxIRw");
        Entity.lIIlIllllIIlll[Entity.lIIllIIIIIllIl[73]] = llIlIlIIIlIIlll("J3cpeBvVOGhAT4k/K7qITA==", "VbGiO");
        Entity.lIIlIllllIIlll[Entity.lIIllIIIIIllIl[74]] = llIlIlIIIlIIlll("u5zee/H8QY0jM+rl9kuqDgMOlMVHY4Ax", "gcLvv");
        Entity.lIIlIllllIIlll[Entity.lIIllIIIIIllIl[75]] = llIlIlIIIlIlllI("PTQ=", "TPJei");
        Entity.lIIlIllllIIlll[Entity.lIIllIIIIIllIl[76]] = llIlIlIIIlIlllI("GjI7FA==", "nKKqn");
        Entity.lIIlIllllIIlll[Entity.lIIllIIIIIllIl[77]] = llIlIlIIIlIllll("r+BzvBEkPAU=", "Uvwxr");
    }
    
    public double getDistanceSqToCenter(final BlockPos lllllllllllllIIlIlllIlIlllllIIlI) {
        return lllllllllllllIIlIlllIlIlllllIIlI.distanceSqToCenter(this.posX, this.posY, this.posZ);
    }
    
    public CommandResultStats getCommandStats() {
        return this.cmdResultStats;
    }
    
    public boolean isBurning() {
        int n;
        if (llIlIlIlIIllIII(this.worldObj) && llIlIlIlIIllIIl(this.worldObj.isRemote ? 1 : 0)) {
            n = Entity.lIIllIIIIIllIl[0];
            "".length();
            if (-" ".length() == ((0x54 ^ 0x4A ^ (0x8A ^ 0xA0)) & (4 + 100 - 27 + 96 ^ 18 + 42 - 16 + 109 ^ -" ".length()))) {
                return ((22 + 72 - 65 + 159 ^ 50 + 75 + 11 + 20) & (111 + 12 - 112 + 158 ^ 131 + 84 - 117 + 39 ^ -" ".length())) != 0x0;
            }
        }
        else {
            n = Entity.lIIllIIIIIllIl[1];
        }
        final boolean lllllllllllllIIlIlllIIlIIlllllIl = n != 0;
        if (llIlIlIlIlIIIII(this.isImmuneToFire ? 1 : 0) && (!llIlIlIlIllIIlI(this.fire) || (llIlIlIlIIllIIl(lllllllllllllIIlIlllIIlIIlllllIl ? 1 : 0) && llIlIlIlIIllIIl(this.getFlag(Entity.lIIllIIIIIllIl[1]) ? 1 : 0)))) {
            return Entity.lIIllIIIIIllIl[0] != 0;
        }
        return Entity.lIIllIIIIIllIl[1] != 0;
    }
    
    public EnumFacing func_181012_aH() {
        return this.field_181018_ap;
    }
    
    public void onCollideWithPlayer(final EntityPlayer lllllllllllllIIlIlllIlIllIlIIlll) {
    }
    
    public boolean getAlwaysRenderNameTag() {
        if (llIlIlIlIIllIlI(this.dataWatcher.getWatchableObjectByte(Entity.lIIllIIIIIllIl[3]), Entity.lIIllIIIIIllIl[0])) {
            return Entity.lIIllIIIIIllIl[0] != 0;
        }
        return Entity.lIIllIIIIIllIl[1] != 0;
    }
    
    public int getMaxInPortalTime() {
        return Entity.lIIllIIIIIllIl[1];
    }
    
    private static int llIlIlIllIIllIl(final double n, final double n2) {
        return dcmpl(n, n2);
    }
    
    private static int llIlIlIllIIlIll(final double n, final double n2) {
        return dcmpl(n, n2);
    }
    
    public Vec3 getPositionEyes(final float lllllllllllllIIlIlllIlIlIIIlllII) {
        if (llIlIlIlIlIIIII(llIlIlIllIIIlll(lllllllllllllIIlIlllIlIlIIIlllII, 1.0f))) {
            return new Vec3(this.posX, this.posY + this.getEyeHeight(), this.posZ);
        }
        final double lllllllllllllIIlIlllIlIlIIIllIll = this.prevPosX + (this.posX - this.prevPosX) * lllllllllllllIIlIlllIlIlIIIlllII;
        final double lllllllllllllIIlIlllIlIlIIIllIIl = this.prevPosY + (this.posY - this.prevPosY) * lllllllllllllIIlIlllIlIlIIIlllII + this.getEyeHeight();
        final double lllllllllllllIIlIlllIlIlIIIlIlll = this.prevPosZ + (this.posZ - this.prevPosZ) * lllllllllllllIIlIlllIlIlIIIlllII;
        return new Vec3(lllllllllllllIIlIlllIlIlIIIllIll, lllllllllllllIIlIlllIlIlIIIllIIl, lllllllllllllIIlIlllIlIlIIIlIlll);
    }
    
    public void onStruckByLightning(final EntityLightningBolt lllllllllllllIIlIlllIIIllllIlIlI) {
        this.attackEntityFrom(DamageSource.lightningBolt, 5.0f);
        "".length();
        this.fire += Entity.lIIllIIIIIllIl[0];
        if (llIlIlIlIlIIIII(this.fire)) {
            this.setFire(Entity.lIIllIIIIIllIl[11]);
        }
    }
    
    public void onUpdate() {
        this.onEntityUpdate();
    }
    
    @Override
    public boolean canCommandSenderUseCommand(final int lllllllllllllIIlIlllIIIIIIIlIIII, final String lllllllllllllIIlIlllIIIIIIIIlllI) {
        return Entity.lIIllIIIIIllIl[0] != 0;
    }
    
    public UUID getUniqueID() {
        return this.entityUniqueID;
    }
    
    public void copyDataFromOld(final Entity lllllllllllllIIlIlllIIIlIIlllIlI) {
        final NBTTagCompound lllllllllllllIIlIlllIIIlIIlllIII = new NBTTagCompound();
        lllllllllllllIIlIlllIIIlIIlllIlI.writeToNBT(lllllllllllllIIlIlllIIIlIIlllIII);
        this.readFromNBT(lllllllllllllIIlIlllIIIlIIlllIII);
        this.timeUntilPortal = lllllllllllllIIlIlllIIIlIIlllIlI.timeUntilPortal;
        this.field_181016_an = lllllllllllllIIlIlllIIIlIIlllIlI.field_181016_an;
        this.field_181017_ao = lllllllllllllIIlIlllIIIlIIlllIlI.field_181017_ao;
        this.field_181018_ap = lllllllllllllIIlIlllIIIlIIlllIlI.field_181018_ap;
    }
    
    public double getMountedYOffset() {
        return this.height * 0.75;
    }
    
    private static boolean llIlIlIlIIllIII(final Object lllllllllllllIIlIllIlllIllIIllll) {
        return lllllllllllllIIlIllIlllIllIIllll != null;
    }
    
    public boolean canRenderOnFire() {
        return this.isBurning();
    }
    
    private static boolean llIlIlIlIllIIlI(final int lllllllllllllIIlIllIlllIlIlllIII) {
        return lllllllllllllIIlIllIlllIlIlllIII <= 0;
    }
    
    private static int llIlIlIllIIlIII(final double n, final double n2) {
        return dcmpg(n, n2);
    }
    
    public void performHurtAnimation() {
    }
    
    public AxisAlignedBB getEntityBoundingBox() {
        return this.boundingBox;
    }
    
    @Override
    public void addChatMessage(final IChatComponent lllllllllllllIIlIlllIIIIIIIlIIll) {
    }
    
    private static void llIlIlIlIIlIlll() {
        (lIIllIIIIIllIl = new int[79])[0] = " ".length();
        Entity.lIIllIIIIIllIl[1] = ((0xD ^ 0x41) & ~(0x14 ^ 0x58));
        Entity.lIIllIIIIIllIl[2] = (0xFFFF8BFD & 0x752E);
        Entity.lIIllIIIIIllIl[3] = "   ".length();
        Entity.lIIllIIIIIllIl[4] = "  ".length();
        Entity.lIIllIIIIIllIl[5] = (0xD ^ 0x9);
        Entity.lIIllIIIIIllIl[6] = -" ".length();
        Entity.lIIllIIIIIllIl[7] = (0x3 ^ 0x17);
        Entity.lIIllIIIIIllIl[8] = (0x89 ^ 0x86);
        Entity.lIIllIIIIIllIl[9] = (0xB4 ^ 0xB1);
        Entity.lIIllIIIIIllIl[10] = (0xA5 ^ 0xA3);
        Entity.lIIllIIIIIllIl[11] = (0xC6 ^ 0xA1 ^ (0xC2 ^ 0xAD));
        Entity.lIIllIIIIIllIl[12] = (0x7F ^ 0x78);
        Entity.lIIllIIIIIllIl[13] = (0x31 ^ 0x61 ^ (0x4A ^ 0x13));
        Entity.lIIllIIIIIllIl[14] = (0xB5 ^ 0xBF);
        Entity.lIIllIIIIIllIl[15] = (0x7C ^ 0x77);
        Entity.lIIllIIIIIllIl[16] = (0x7E ^ 0x1E ^ (0xF ^ 0x63));
        Entity.lIIllIIIIIllIl[17] = (0x66 ^ 0x6B);
        Entity.lIIllIIIIIllIl[18] = (77 + 51 - 21 + 24 ^ 10 + 43 + 9 + 79);
        Entity.lIIllIIIIIllIl[19] = (148 + 153 - 144 + 21 ^ 51 + 46 - 69 + 134);
        Entity.lIIllIIIIIllIl[20] = (0x10 ^ 0x1);
        Entity.lIIllIIIIIllIl[21] = (0x43 ^ 0x51);
        Entity.lIIllIIIIIllIl[22] = (0x97 ^ 0x84);
        Entity.lIIllIIIIIllIl[23] = (0xD3 ^ 0xC6);
        Entity.lIIllIIIIIllIl[24] = (0x51 ^ 0x47);
        Entity.lIIllIIIIIllIl[25] = (35 + 18 - 35 + 147 ^ 74 + 109 - 30 + 25);
        Entity.lIIllIIIIIllIl[26] = (80 + 93 - 164 + 129 ^ 144 + 27 - 92 + 67);
        Entity.lIIllIIIIIllIl[27] = (39 + 147 - 103 + 77 ^ 51 + 43 + 12 + 79);
        Entity.lIIllIIIIIllIl[28] = (0xBD ^ 0xA7);
        Entity.lIIllIIIIIllIl[29] = (0x5 ^ 0x1E);
        Entity.lIIllIIIIIllIl[30] = (0x7B ^ 0x67);
        Entity.lIIllIIIIIllIl[31] = (0x5D ^ 0x17 ^ (0xDE ^ 0x89));
        Entity.lIIllIIIIIllIl[32] = (0x38 ^ 0x76 ^ (0x29 ^ 0x79));
        Entity.lIIllIIIIIllIl[33] = (152 + 17 - 5 + 20 ^ 15 + 163 - 111 + 100);
        Entity.lIIllIIIIIllIl[34] = (0xAB ^ 0x8B);
        Entity.lIIllIIIIIllIl[35] = (0x88 ^ 0xA9);
        Entity.lIIllIIIIIllIl[36] = (0x9F ^ 0x89 ^ (0x55 ^ 0x61));
        Entity.lIIllIIIIIllIl[37] = (0x15 ^ 0x36);
        Entity.lIIllIIIIIllIl[38] = (18 + 27 + 40 + 55 ^ 72 + 64 - 60 + 92);
        Entity.lIIllIIIIIllIl[39] = (0x86 ^ 0xA3);
        Entity.lIIllIIIIIllIl[40] = (0x0 ^ 0x1A ^ (0x13 ^ 0x2F));
        Entity.lIIllIIIIIllIl[41] = (1 + 28 + 78 + 33 ^ 20 + 27 + 123 + 1);
        Entity.lIIllIIIIIllIl[42] = (0x4C ^ 0x64);
        Entity.lIIllIIIIIllIl[43] = (0x7E ^ 0x57);
        Entity.lIIllIIIIIllIl[44] = (0x85 ^ 0x8B ^ (0xB0 ^ 0x94));
        Entity.lIIllIIIIIllIl[45] = (0x4F ^ 0x36 ^ (0xC5 ^ 0x97));
        Entity.lIIllIIIIIllIl[46] = (0x44 ^ 0x38 ^ (0x4 ^ 0x54));
        Entity.lIIllIIIIIllIl[47] = (0x84 ^ 0xA9);
        Entity.lIIllIIIIIllIl[48] = (37 + 56 + 9 + 37 ^ 1 + 90 + 46 + 28);
        Entity.lIIllIIIIIllIl[49] = (0x2A ^ 0x24 ^ (0x1C ^ 0x3D));
        Entity.lIIllIIIIIllIl[50] = (0xC9 ^ 0xBB ^ (0x75 ^ 0x37));
        Entity.lIIllIIIIIllIl[51] = (0x1D ^ 0x22 ^ (0xA9 ^ 0xA7));
        Entity.lIIllIIIIIllIl[52] = (0x6F ^ 0x5D);
        Entity.lIIllIIIIIllIl[53] = (0xB2 ^ 0x81);
        Entity.lIIllIIIIIllIl[54] = (0xB6 ^ 0x82);
        Entity.lIIllIIIIIllIl[55] = (0xB4 ^ 0x81);
        Entity.lIIllIIIIIllIl[56] = (0x2E ^ 0x18);
        Entity.lIIllIIIIIllIl[57] = (0x2F ^ 0x63 ^ (0x40 ^ 0x3B));
        Entity.lIIllIIIIIllIl[58] = (0x5A ^ 0x62);
        Entity.lIIllIIIIIllIl[59] = (98 + 62 - 39 + 58 ^ 6 + 133 - 93 + 92);
        Entity.lIIllIIIIIllIl[60] = (0x80 ^ 0x95 ^ (0xAF ^ 0x80));
        Entity.lIIllIIIIIllIl[61] = (0x50 ^ 0x6B);
        Entity.lIIllIIIIIllIl[62] = (0xF ^ 0x33 ^ ((0xAA ^ 0x8B) & ~(0x41 ^ 0x60)));
        Entity.lIIllIIIIIllIl[63] = (0xE ^ 0x0 ^ (0x58 ^ 0x6B));
        Entity.lIIllIIIIIllIl[64] = (50 + 30 + 102 + 3 ^ 31 + 73 - 38 + 69);
        Entity.lIIllIIIIIllIl[65] = (0x7E ^ 0x0 ^ (0xE7 ^ 0xA6));
        Entity.lIIllIIIIIllIl[66] = (0x4C ^ 0xC);
        Entity.lIIllIIIIIllIl[67] = (0xC9 ^ 0x88);
        Entity.lIIllIIIIIllIl[68] = (61 + 144 - 3 + 9 ^ 140 + 32 - 32 + 5);
        Entity.lIIllIIIIIllIl[69] = (0x60 ^ 0x23);
        Entity.lIIllIIIIIllIl[70] = (0xDE ^ 0x9A);
        Entity.lIIllIIIIIllIl[71] = (0xC2 ^ 0x87);
        Entity.lIIllIIIIIllIl[72] = (0x89 ^ 0xB7 ^ (0x55 ^ 0x2D));
        Entity.lIIllIIIIIllIl[73] = (0x33 ^ 0x74);
        Entity.lIIllIIIIIllIl[74] = (0x53 ^ 0x62 ^ (0x3C ^ 0x45));
        Entity.lIIllIIIIIllIl[75] = (0x37 ^ 0x71 ^ (0x97 ^ 0x98));
        Entity.lIIllIIIIIllIl[76] = (0x23 ^ 0x2 ^ (0xFE ^ 0x95));
        Entity.lIIllIIIIIllIl[77] = (0xFB ^ 0x8C ^ (0x3B ^ 0x7));
        Entity.lIIllIIIIIllIl[78] = ("   ".length() ^ (0x4B ^ 0x4));
    }
    
    private static int llIlIlIlIIllIll(final double n, final double n2) {
        return dcmpl(n, n2);
    }
    
    public void setLocationAndAngles(final double lllllllllllllIIlIlllIllIIlIlIIlI, final double lllllllllllllIIlIlllIllIIlIIlIll, final double lllllllllllllIIlIlllIllIIlIIlIlI, final float lllllllllllllIIlIlllIllIIlIIllll, final float lllllllllllllIIlIlllIllIIlIIlllI) {
        this.posX = lllllllllllllIIlIlllIllIIlIlIIlI;
        this.prevPosX = lllllllllllllIIlIlllIllIIlIlIIlI;
        this.lastTickPosX = lllllllllllllIIlIlllIllIIlIlIIlI;
        this.posY = lllllllllllllIIlIlllIllIIlIIlIll;
        this.prevPosY = lllllllllllllIIlIlllIllIIlIIlIll;
        this.lastTickPosY = lllllllllllllIIlIlllIllIIlIIlIll;
        this.posZ = lllllllllllllIIlIlllIllIIlIIlIlI;
        this.prevPosZ = lllllllllllllIIlIlllIllIIlIIlIlI;
        this.lastTickPosZ = lllllllllllllIIlIlllIllIIlIIlIlI;
        this.rotationYaw = lllllllllllllIIlIlllIllIIlIIllll;
        this.rotationPitch = lllllllllllllIIlIlllIllIIlIIlllI;
        this.setPosition(this.posX, this.posY, this.posZ);
    }
    
    public float getExplosionResistance(final Explosion lllllllllllllIIlIlllIIIIllllIlII, final World lllllllllllllIIlIlllIIIIllllIIlI, final BlockPos lllllllllllllIIlIlllIIIIllllIIIl, final IBlockState lllllllllllllIIlIlllIIIIlllIllll) {
        return lllllllllllllIIlIlllIIIIlllIllll.getBlock().getExplosionResistance(this);
    }
    
    public void setPositionAndRotation(final double lllllllllllllIIlIlllIllIlIIlIIIl, final double lllllllllllllIIlIlllIllIlIIIllll, final double lllllllllllllIIlIlllIllIlIIIIIIl, final float lllllllllllllIIlIlllIllIIlllllll, final float lllllllllllllIIlIlllIllIlIIIlIll) {
        this.posX = lllllllllllllIIlIlllIllIlIIlIIIl;
        this.prevPosX = lllllllllllllIIlIlllIllIlIIlIIIl;
        this.posY = lllllllllllllIIlIlllIllIlIIIllll;
        this.prevPosY = lllllllllllllIIlIlllIllIlIIIllll;
        this.posZ = lllllllllllllIIlIlllIllIlIIIIIIl;
        this.prevPosZ = lllllllllllllIIlIlllIllIlIIIIIIl;
        this.rotationYaw = lllllllllllllIIlIlllIllIIlllllll;
        this.prevRotationYaw = lllllllllllllIIlIlllIllIIlllllll;
        this.rotationPitch = lllllllllllllIIlIlllIllIlIIIlIll;
        this.prevRotationPitch = lllllllllllllIIlIlllIllIlIIIlIll;
        final double lllllllllllllIIlIlllIllIlIIIlIIl = this.prevRotationYaw - lllllllllllllIIlIlllIllIIlllllll;
        if (llIlIlIlIlIIlII(llIlIlIllIIIIIl(lllllllllllllIIlIlllIllIlIIIlIIl, -180.0))) {
            this.prevRotationYaw += 360.0f;
        }
        if (llIlIlIlIIllllI(llIlIlIllIIIIlI(lllllllllllllIIlIlllIllIlIIIlIIl, 180.0))) {
            this.prevRotationYaw -= 360.0f;
        }
        this.setPosition(this.posX, this.posY, this.posZ);
        this.setRotation(lllllllllllllIIlIlllIllIIlllllll, lllllllllllllIIlIlllIllIlIIIlIll);
    }
    
    private static boolean llIlIlIlIlIIIII(final int lllllllllllllIIlIllIlllIllIIIlIl) {
        return lllllllllllllIIlIllIlllIllIIIlIl == 0;
    }
    
    public Vec3 func_181014_aG() {
        return this.field_181017_ao;
    }
    
    public boolean isSilent() {
        if (llIlIlIlIIllIlI(this.dataWatcher.getWatchableObjectByte(Entity.lIIllIIIIIllIl[5]), Entity.lIIllIIIIIllIl[0])) {
            return Entity.lIIllIIIIIllIl[0] != 0;
        }
        return Entity.lIIllIIIIIllIl[1] != 0;
    }
    
    public boolean doesEntityNotTriggerPressurePlate() {
        return Entity.lIIllIIIIIllIl[1] != 0;
    }
    
    @Override
    public World getEntityWorld() {
        return this.worldObj;
    }
    
    public final boolean isImmuneToFire() {
        return this.isImmuneToFire;
    }
    
    public void handleStatusUpdate(final byte lllllllllllllIIlIlllIIlIlIIlIllI) {
    }
    
    private static int llIlIlIlIlllIlI(final float n, final float n2) {
        return fcmpg(n, n2);
    }
    
    public void moveEntity(double lllllllllllllIIlIllllIIIlIllIIII, double lllllllllllllIIlIllllIIIlIlIllll, double lllllllllllllIIlIllllIIIlIlIlllI) {
        if (llIlIlIlIIllIIl(this.noClip ? 1 : 0)) {
            this.setEntityBoundingBox(this.getEntityBoundingBox().offset(lllllllllllllIIlIllllIIIlIllIIII, lllllllllllllIIlIllllIIIlIlIllll, (double)lllllllllllllIIlIllllIIIlIlIlllI));
            this.resetPositionToBB();
            "".length();
            if (" ".length() < " ".length()) {
                return;
            }
        }
        else {
            this.worldObj.theProfiler.startSection(Entity.lIIlIllllIIlll[Entity.lIIllIIIIIllIl[3]]);
            final double lllllllllllllIIlIllllIIIllllllII = this.posX;
            final double lllllllllllllIIlIllllIIIlllllIll = this.posY;
            final double lllllllllllllIIlIllllIIIlllllIIl = this.posZ;
            if (llIlIlIlIIllIIl(this.isInWeb ? 1 : 0)) {
                this.isInWeb = (Entity.lIIllIIIIIllIl[1] != 0);
                lllllllllllllIIlIllllIIIlIllIIII *= 0.25;
                lllllllllllllIIlIllllIIIlIlIllll *= 0.05000000074505806;
                lllllllllllllIIlIllllIIIlIlIlllI *= 0.25;
                this.motionX = 0.0;
                this.motionY = 0.0;
                this.motionZ = 0.0;
            }
            double lllllllllllllIIlIllllIIIlllllIII = lllllllllllllIIlIllllIIIlIllIIII;
            final double lllllllllllllIIlIllllIIIllllIlll = lllllllllllllIIlIllllIIIlIlIllll;
            double lllllllllllllIIlIllllIIIllllIlIl = (double)lllllllllllllIIlIllllIIIlIlIlllI;
            int n;
            if (llIlIlIlIIllIIl(this.onGround ? 1 : 0) && llIlIlIlIIllIIl(this.isSneaking() ? 1 : 0) && llIlIlIlIIllIIl((this instanceof EntityPlayer) ? 1 : 0)) {
                n = Entity.lIIllIIIIIllIl[0];
                "".length();
                if ((0x9D ^ 0x89 ^ (0xAE ^ 0xBE)) == 0x0) {
                    return;
                }
            }
            else {
                n = Entity.lIIllIIIIIllIl[1];
            }
            final boolean lllllllllllllIIlIllllIIIllllIIll = n != 0;
            if (llIlIlIlIIllIIl(lllllllllllllIIlIllllIIIllllIIll ? 1 : 0)) {
                final double lllllllllllllIIlIllllIIIllllIIIl = 0.05;
                "".length();
                if (" ".length() < -" ".length()) {
                    return;
                }
                while (llIlIlIlIIllIIl(llIlIlIlIlIIlll(lllllllllllllIIlIllllIIIlIllIIII, 0.0))) {
                    if (llIlIlIlIlIIIII(this.worldObj.getCollidingBoundingBoxes(this, this.getEntityBoundingBox().offset(lllllllllllllIIlIllllIIIlIllIIII, -1.0, 0.0)).isEmpty() ? 1 : 0)) {
                        "".length();
                        if (((132 + 27 - 155 + 228 ^ 85 + 1 - 56 + 108) & (63 + 169 - 66 + 81 ^ 87 + 31 - 49 + 80 ^ -" ".length())) != ((0xD2 ^ 0xB5 ^ (0x45 ^ 0x3B)) & (0xC9 ^ 0x8E ^ (0xFB ^ 0xA5) ^ -" ".length()))) {
                            return;
                        }
                        break;
                    }
                    else {
                        if (llIlIlIlIlIIlII(llIlIlIlIlIIllI(lllllllllllllIIlIllllIIIlIllIIII, lllllllllllllIIlIllllIIIllllIIIl)) && llIlIlIlIIllllI(llIlIlIlIlIIlll(lllllllllllllIIlIllllIIIlIllIIII, -lllllllllllllIIlIllllIIIllllIIIl))) {
                            lllllllllllllIIlIllllIIIlIllIIII = 0.0;
                            "".length();
                            if ("  ".length() <= ((0x2E ^ 0x5) & ~(0x65 ^ 0x4E))) {
                                return;
                            }
                        }
                        else if (llIlIlIlIIlllIl(llIlIlIlIlIIlll(lllllllllllllIIlIllllIIIlIllIIII, 0.0))) {
                            lllllllllllllIIlIllllIIIlIllIIII -= lllllllllllllIIlIllllIIIllllIIIl;
                            "".length();
                            if (null != null) {
                                return;
                            }
                        }
                        else {
                            lllllllllllllIIlIllllIIIlIllIIII += lllllllllllllIIlIllllIIIllllIIIl;
                        }
                        lllllllllllllIIlIllllIIIlllllIII = lllllllllllllIIlIllllIIIlIllIIII;
                    }
                }
                while (llIlIlIlIIllIIl(llIlIlIlIlIIlll((double)lllllllllllllIIlIllllIIIlIlIlllI, 0.0))) {
                    if (llIlIlIlIlIIIII(this.worldObj.getCollidingBoundingBoxes(this, this.getEntityBoundingBox().offset(0.0, -1.0, (double)lllllllllllllIIlIllllIIIlIlIlllI)).isEmpty() ? 1 : 0)) {
                        "".length();
                        if (((152 + 75 - 84 + 32 ^ 98 + 72 - 154 + 120) & (0x57 ^ 0x3B ^ (0x19 ^ 0x52) ^ -" ".length())) > 0) {
                            return;
                        }
                        break;
                    }
                    else {
                        if (llIlIlIlIlIIlII(llIlIlIlIlIIllI((double)lllllllllllllIIlIllllIIIlIlIlllI, lllllllllllllIIlIllllIIIllllIIIl)) && llIlIlIlIIllllI(llIlIlIlIlIIlll((double)lllllllllllllIIlIllllIIIlIlIlllI, -lllllllllllllIIlIllllIIIllllIIIl))) {
                            lllllllllllllIIlIllllIIIlIlIlllI = 0.0;
                            "".length();
                            if ("  ".length() == (0xBE ^ 0x91 ^ (0x8 ^ 0x23))) {
                                return;
                            }
                        }
                        else if (llIlIlIlIIlllIl(llIlIlIlIlIIlll((double)lllllllllllllIIlIllllIIIlIlIlllI, 0.0))) {
                            lllllllllllllIIlIllllIIIlIlIlllI -= lllllllllllllIIlIllllIIIllllIIIl;
                            "".length();
                            if ("  ".length() >= "   ".length()) {
                                return;
                            }
                        }
                        else {
                            lllllllllllllIIlIllllIIIlIlIlllI += lllllllllllllIIlIllllIIIllllIIIl;
                        }
                        lllllllllllllIIlIllllIIIllllIlIl = (double)lllllllllllllIIlIllllIIIlIlIlllI;
                    }
                }
                while (llIlIlIlIIllIIl(llIlIlIlIlIIlll(lllllllllllllIIlIllllIIIlIllIIII, 0.0)) && llIlIlIlIIllIIl(llIlIlIlIlIIlll((double)lllllllllllllIIlIllllIIIlIlIlllI, 0.0)) && !llIlIlIlIlIIIII(this.worldObj.getCollidingBoundingBoxes(this, this.getEntityBoundingBox().offset(lllllllllllllIIlIllllIIIlIllIIII, -1.0, (double)lllllllllllllIIlIllllIIIlIlIlllI)).isEmpty() ? 1 : 0)) {
                    if (llIlIlIlIlIIlII(llIlIlIlIlIIllI(lllllllllllllIIlIllllIIIlIllIIII, lllllllllllllIIlIllllIIIllllIIIl)) && llIlIlIlIIllllI(llIlIlIlIlIIlll(lllllllllllllIIlIllllIIIlIllIIII, -lllllllllllllIIlIllllIIIllllIIIl))) {
                        lllllllllllllIIlIllllIIIlIllIIII = 0.0;
                        "".length();
                        if (-"   ".length() >= 0) {
                            return;
                        }
                    }
                    else if (llIlIlIlIIlllIl(llIlIlIlIlIIlll(lllllllllllllIIlIllllIIIlIllIIII, 0.0))) {
                        lllllllllllllIIlIllllIIIlIllIIII -= lllllllllllllIIlIllllIIIllllIIIl;
                        "".length();
                        if ((0x5C ^ 0x64 ^ (0x82 ^ 0xBE)) <= ((222 + 121 - 182 + 88 ^ 23 + 165 - 11 + 5) & (0xD3 ^ 0xA1 ^ (0x9C ^ 0xA1) ^ -" ".length()))) {
                            return;
                        }
                    }
                    else {
                        lllllllllllllIIlIllllIIIlIllIIII += lllllllllllllIIlIllllIIIllllIIIl;
                    }
                    lllllllllllllIIlIllllIIIlllllIII = lllllllllllllIIlIllllIIIlIllIIII;
                    if (llIlIlIlIlIIlII(llIlIlIlIlIIllI((double)lllllllllllllIIlIllllIIIlIlIlllI, lllllllllllllIIlIllllIIIllllIIIl)) && llIlIlIlIIllllI(llIlIlIlIlIIlll((double)lllllllllllllIIlIllllIIIlIlIlllI, -lllllllllllllIIlIllllIIIllllIIIl))) {
                        lllllllllllllIIlIllllIIIlIlIlllI = 0.0;
                        "".length();
                        if ((0x90 ^ 0x94) <= -" ".length()) {
                            return;
                        }
                    }
                    else if (llIlIlIlIIlllIl(llIlIlIlIlIIlll((double)lllllllllllllIIlIllllIIIlIlIlllI, 0.0))) {
                        lllllllllllllIIlIllllIIIlIlIlllI -= lllllllllllllIIlIllllIIIllllIIIl;
                        "".length();
                        if ("  ".length() <= ((95 + 110 - 127 + 109 ^ 31 + 55 + 48 + 29) & (88 + 13 - 83 + 199 ^ 150 + 70 - 70 + 43 ^ -" ".length()))) {
                            return;
                        }
                    }
                    else {
                        lllllllllllllIIlIllllIIIlIlIlllI += lllllllllllllIIlIllllIIIllllIIIl;
                    }
                    lllllllllllllIIlIllllIIIllllIlIl = (double)lllllllllllllIIlIllllIIIlIlIlllI;
                }
            }
            final List<AxisAlignedBB> lllllllllllllIIlIllllIIIlllIllll = this.worldObj.getCollidingBoundingBoxes(this, this.getEntityBoundingBox().addCoord(lllllllllllllIIlIllllIIIlIllIIII, lllllllllllllIIlIllllIIIlIlIllll, (double)lllllllllllllIIlIllllIIIlIlIlllI));
            final AxisAlignedBB lllllllllllllIIlIllllIIIlllIllIl = this.getEntityBoundingBox();
            final float lllllllllllllIIlIllllIIIlIIlllII = (float)lllllllllllllIIlIllllIIIlllIllll.iterator();
            "".length();
            if ("   ".length() < 0) {
                return;
            }
            while (!llIlIlIlIlIIIII(((Iterator)lllllllllllllIIlIllllIIIlIIlllII).hasNext() ? 1 : 0)) {
                final AxisAlignedBB lllllllllllllIIlIllllIIIlllIlIll = ((Iterator<AxisAlignedBB>)lllllllllllllIIlIllllIIIlIIlllII).next();
                lllllllllllllIIlIllllIIIlIlIllll = lllllllllllllIIlIllllIIIlllIlIll.calculateYOffset(this.getEntityBoundingBox(), lllllllllllllIIlIllllIIIlIlIllll);
            }
            this.setEntityBoundingBox(this.getEntityBoundingBox().offset(0.0, lllllllllllllIIlIllllIIIlIlIllll, 0.0));
            int n2;
            if (llIlIlIlIlIIIII(this.onGround ? 1 : 0) && (!llIlIlIlIIllIIl(llIlIlIlIlIIlll(lllllllllllllIIlIllllIIIllllIlll, lllllllllllllIIlIllllIIIlIlIllll)) || llIlIlIlIIllllI(llIlIlIlIlIIllI(lllllllllllllIIlIllllIIIllllIlll, 0.0)))) {
                n2 = Entity.lIIllIIIIIllIl[1];
                "".length();
                if (null != null) {
                    return;
                }
            }
            else {
                n2 = Entity.lIIllIIIIIllIl[0];
            }
            final boolean lllllllllllllIIlIllllIIIlllIlIlI = n2 != 0;
            boolean lllllllllllllIIlIllllIIIlIIllIlI = (boolean)lllllllllllllIIlIllllIIIlllIllll.iterator();
            "".length();
            if ((0xA0 ^ 0xA4) < 0) {
                return;
            }
            while (!llIlIlIlIlIIIII(((Iterator)lllllllllllllIIlIllllIIIlIIllIlI).hasNext() ? 1 : 0)) {
                final AxisAlignedBB lllllllllllllIIlIllllIIIlllIlIII = ((Iterator<AxisAlignedBB>)lllllllllllllIIlIllllIIIlIIllIlI).next();
                lllllllllllllIIlIllllIIIlIllIIII = lllllllllllllIIlIllllIIIlllIlIII.calculateXOffset(this.getEntityBoundingBox(), lllllllllllllIIlIllllIIIlIllIIII);
            }
            this.setEntityBoundingBox(this.getEntityBoundingBox().offset(lllllllllllllIIlIllllIIIlIllIIII, 0.0, 0.0));
            lllllllllllllIIlIllllIIIlIIllIlI = (boolean)lllllllllllllIIlIllllIIIlllIllll.iterator();
            "".length();
            if (null != null) {
                return;
            }
            while (!llIlIlIlIlIIIII(((Iterator)lllllllllllllIIlIllllIIIlIIllIlI).hasNext() ? 1 : 0)) {
                final AxisAlignedBB lllllllllllllIIlIllllIIIlllIIllI = ((Iterator<AxisAlignedBB>)lllllllllllllIIlIllllIIIlIIllIlI).next();
                lllllllllllllIIlIllllIIIlIlIlllI = lllllllllllllIIlIllllIIIlllIIllI.calculateZOffset(this.getEntityBoundingBox(), (double)lllllllllllllIIlIllllIIIlIlIlllI);
            }
            this.setEntityBoundingBox(this.getEntityBoundingBox().offset(0.0, 0.0, (double)lllllllllllllIIlIllllIIIlIlIlllI));
            if (llIlIlIlIIlllIl(llIlIlIlIlIlIII(this.stepHeight, 0.0f)) && llIlIlIlIIllIIl(lllllllllllllIIlIllllIIIlllIlIlI ? 1 : 0) && (!llIlIlIlIlIIIII(llIlIlIlIlIIlll(lllllllllllllIIlIllllIIIlllllIII, lllllllllllllIIlIllllIIIlIllIIII)) || llIlIlIlIIllIIl(llIlIlIlIlIIlll(lllllllllllllIIlIllllIIIllllIlIl, (double)lllllllllllllIIlIllllIIIlIlIlllI)))) {
                final double lllllllllllllIIlIllllIIIlllIIlIl = lllllllllllllIIlIllllIIIlIllIIII;
                final double lllllllllllllIIlIllllIIIlllIIlII = lllllllllllllIIlIllllIIIlIlIllll;
                final double lllllllllllllIIlIllllIIIlllIIIlI = (double)lllllllllllllIIlIllllIIIlIlIlllI;
                final AxisAlignedBB lllllllllllllIIlIllllIIIlllIIIIl = this.getEntityBoundingBox();
                this.setEntityBoundingBox(lllllllllllllIIlIllllIIIlllIllIl);
                lllllllllllllIIlIllllIIIlIlIllll = this.stepHeight;
                final List<AxisAlignedBB> lllllllllllllIIlIllllIIIlllIIIII = this.worldObj.getCollidingBoundingBoxes(this, this.getEntityBoundingBox().addCoord(lllllllllllllIIlIllllIIIlllllIII, lllllllllllllIIlIllllIIIlIlIllll, lllllllllllllIIlIllllIIIllllIlIl));
                AxisAlignedBB lllllllllllllIIlIllllIIIllIlllll = this.getEntityBoundingBox();
                final AxisAlignedBB lllllllllllllIIlIllllIIIllIllllI = lllllllllllllIIlIllllIIIllIlllll.addCoord(lllllllllllllIIlIllllIIIlllllIII, 0.0, lllllllllllllIIlIllllIIIllllIlIl);
                double lllllllllllllIIlIllllIIIllIlllIl = lllllllllllllIIlIllllIIIlIlIllll;
                final String lllllllllllllIIlIllllIIIlIIIIIlI = (String)lllllllllllllIIlIllllIIIlllIIIII.iterator();
                "".length();
                if (((111 + 81 - 67 + 46 ^ 170 + 165 - 244 + 87) & (62 + 15 - 4 + 66 ^ 99 + 122 - 103 + 28 ^ -" ".length())) == -" ".length()) {
                    return;
                }
                while (!llIlIlIlIlIIIII(((Iterator)lllllllllllllIIlIllllIIIlIIIIIlI).hasNext() ? 1 : 0)) {
                    final AxisAlignedBB lllllllllllllIIlIllllIIIllIllIll = ((Iterator<AxisAlignedBB>)lllllllllllllIIlIllllIIIlIIIIIlI).next();
                    lllllllllllllIIlIllllIIIllIlllIl = lllllllllllllIIlIllllIIIllIllIll.calculateYOffset(lllllllllllllIIlIllllIIIllIllllI, lllllllllllllIIlIllllIIIllIlllIl);
                }
                lllllllllllllIIlIllllIIIllIlllll = lllllllllllllIIlIllllIIIllIlllll.offset(0.0, lllllllllllllIIlIllllIIIllIlllIl, 0.0);
                double lllllllllllllIIlIllllIIIllIllIIl = lllllllllllllIIlIllllIIIlllllIII;
                final short lllllllllllllIIlIllllIIIIllllllI = (short)lllllllllllllIIlIllllIIIlllIIIII.iterator();
                "".length();
                if (((0x12 ^ 0x57) & ~(0x2F ^ 0x6A)) != 0x0) {
                    return;
                }
                while (!llIlIlIlIlIIIII(((Iterator)lllllllllllllIIlIllllIIIIllllllI).hasNext() ? 1 : 0)) {
                    final AxisAlignedBB lllllllllllllIIlIllllIIIllIlIlll = ((Iterator<AxisAlignedBB>)lllllllllllllIIlIllllIIIIllllllI).next();
                    lllllllllllllIIlIllllIIIllIllIIl = lllllllllllllIIlIllllIIIllIlIlll.calculateXOffset(lllllllllllllIIlIllllIIIllIlllll, lllllllllllllIIlIllllIIIllIllIIl);
                }
                lllllllllllllIIlIllllIIIllIlllll = lllllllllllllIIlIllllIIIllIlllll.offset(lllllllllllllIIlIllllIIIllIllIIl, 0.0, 0.0);
                double lllllllllllllIIlIllllIIIllIlIlIl = lllllllllllllIIlIllllIIIllllIlIl;
                final Iterator<AxisAlignedBB> iterator = lllllllllllllIIlIllllIIIlllIIIII.iterator();
                "".length();
                if ("  ".length() == -" ".length()) {
                    return;
                }
                while (!llIlIlIlIlIIIII(iterator.hasNext() ? 1 : 0)) {
                    final AxisAlignedBB lllllllllllllIIlIllllIIIllIlIlII = iterator.next();
                    lllllllllllllIIlIllllIIIllIlIlIl = lllllllllllllIIlIllllIIIllIlIlII.calculateZOffset(lllllllllllllIIlIllllIIIllIlllll, lllllllllllllIIlIllllIIIllIlIlIl);
                }
                lllllllllllllIIlIllllIIIllIlllll = lllllllllllllIIlIllllIIIllIlllll.offset(0.0, 0.0, lllllllllllllIIlIllllIIIllIlIlIl);
                AxisAlignedBB lllllllllllllIIlIllllIIIllIlIIll = this.getEntityBoundingBox();
                double lllllllllllllIIlIllllIIIllIlIIIl = lllllllllllllIIlIllllIIIlIlIllll;
                final int lllllllllllllIIlIllllIIIIlllIlll = (int)lllllllllllllIIlIllllIIIlllIIIII.iterator();
                "".length();
                if ("   ".length() > "   ".length()) {
                    return;
                }
                while (!llIlIlIlIlIIIII(((Iterator)lllllllllllllIIlIllllIIIIlllIlll).hasNext() ? 1 : 0)) {
                    final AxisAlignedBB lllllllllllllIIlIllllIIIllIIllll = ((Iterator<AxisAlignedBB>)lllllllllllllIIlIllllIIIIlllIlll).next();
                    lllllllllllllIIlIllllIIIllIlIIIl = lllllllllllllIIlIllllIIIllIIllll.calculateYOffset(lllllllllllllIIlIllllIIIllIlIIll, lllllllllllllIIlIllllIIIllIlIIIl);
                }
                lllllllllllllIIlIllllIIIllIlIIll = lllllllllllllIIlIllllIIIllIlIIll.offset(0.0, lllllllllllllIIlIllllIIIllIlIIIl, 0.0);
                double lllllllllllllIIlIllllIIIllIIllIl = lllllllllllllIIlIllllIIIlllllIII;
                final float lllllllllllllIIlIllllIIIIlllIlIl = (float)lllllllllllllIIlIllllIIIlllIIIII.iterator();
                "".length();
                if (null != null) {
                    return;
                }
                while (!llIlIlIlIlIIIII(((Iterator)lllllllllllllIIlIllllIIIIlllIlIl).hasNext() ? 1 : 0)) {
                    final AxisAlignedBB lllllllllllllIIlIllllIIIllIIlIll = ((Iterator<AxisAlignedBB>)lllllllllllllIIlIllllIIIIlllIlIl).next();
                    lllllllllllllIIlIllllIIIllIIllIl = lllllllllllllIIlIllllIIIllIIlIll.calculateXOffset(lllllllllllllIIlIllllIIIllIlIIll, lllllllllllllIIlIllllIIIllIIllIl);
                }
                lllllllllllllIIlIllllIIIllIlIIll = lllllllllllllIIlIllllIIIllIlIIll.offset(lllllllllllllIIlIllllIIIllIIllIl, 0.0, 0.0);
                double lllllllllllllIIlIllllIIIllIIlIlI = lllllllllllllIIlIllllIIIllllIlIl;
                final int lllllllllllllIIlIllllIIIIlllIIll = (int)lllllllllllllIIlIllllIIIlllIIIII.iterator();
                "".length();
                if (-"   ".length() > 0) {
                    return;
                }
                while (!llIlIlIlIlIIIII(((Iterator)lllllllllllllIIlIllllIIIIlllIIll).hasNext() ? 1 : 0)) {
                    final AxisAlignedBB lllllllllllllIIlIllllIIIllIIlIIl = ((Iterator<AxisAlignedBB>)lllllllllllllIIlIllllIIIIlllIIll).next();
                    lllllllllllllIIlIllllIIIllIIlIlI = lllllllllllllIIlIllllIIIllIIlIIl.calculateZOffset(lllllllllllllIIlIllllIIIllIlIIll, lllllllllllllIIlIllllIIIllIIlIlI);
                }
                lllllllllllllIIlIllllIIIllIlIIll = lllllllllllllIIlIllllIIIllIlIIll.offset(0.0, 0.0, lllllllllllllIIlIllllIIIllIIlIlI);
                final double lllllllllllllIIlIllllIIIllIIIlll = lllllllllllllIIlIllllIIIllIllIIl * lllllllllllllIIlIllllIIIllIllIIl + lllllllllllllIIlIllllIIIllIlIlIl * lllllllllllllIIlIllllIIIllIlIlIl;
                final double lllllllllllllIIlIllllIIIllIIIlIl = lllllllllllllIIlIllllIIIllIIllIl * lllllllllllllIIlIllllIIIllIIllIl + lllllllllllllIIlIllllIIIllIIlIlI * lllllllllllllIIlIllllIIIllIIlIlI;
                if (llIlIlIlIIlllIl(llIlIlIlIlIIlll(lllllllllllllIIlIllllIIIllIIIlll, lllllllllllllIIlIllllIIIllIIIlIl))) {
                    lllllllllllllIIlIllllIIIlIllIIII = lllllllllllllIIlIllllIIIllIllIIl;
                    lllllllllllllIIlIllllIIIlIlIlllI = lllllllllllllIIlIllllIIIllIlIlIl;
                    lllllllllllllIIlIllllIIIlIlIllll = -lllllllllllllIIlIllllIIIllIlllIl;
                    this.setEntityBoundingBox(lllllllllllllIIlIllllIIIllIlllll);
                    "".length();
                    if (" ".length() < ((0x7C ^ 0x58 ^ (0xA5 ^ 0xC4)) & (0x7 ^ 0x42 ^ ((0xB ^ 0x2C) & ~(0xA5 ^ 0x82)) ^ -" ".length()) & (((56 + 107 - 44 + 80 ^ 146 + 101 - 160 + 78) & (0x9 ^ 0x7F ^ (0x85 ^ 0x91) ^ -" ".length())) ^ -" ".length()))) {
                        return;
                    }
                }
                else {
                    lllllllllllllIIlIllllIIIlIllIIII = lllllllllllllIIlIllllIIIllIIllIl;
                    lllllllllllllIIlIllllIIIlIlIlllI = lllllllllllllIIlIllllIIIllIIlIlI;
                    lllllllllllllIIlIllllIIIlIlIllll = -lllllllllllllIIlIllllIIIllIlIIIl;
                    this.setEntityBoundingBox(lllllllllllllIIlIllllIIIllIlIIll);
                }
                final String lllllllllllllIIlIllllIIIIlllIIII = (String)lllllllllllllIIlIllllIIIlllIIIII.iterator();
                "".length();
                if ("  ".length() <= -" ".length()) {
                    return;
                }
                while (!llIlIlIlIlIIIII(((Iterator)lllllllllllllIIlIllllIIIIlllIIII).hasNext() ? 1 : 0)) {
                    final AxisAlignedBB lllllllllllllIIlIllllIIIllIIIlII = ((Iterator<AxisAlignedBB>)lllllllllllllIIlIllllIIIIlllIIII).next();
                    lllllllllllllIIlIllllIIIlIlIllll = lllllllllllllIIlIllllIIIllIIIlII.calculateYOffset(this.getEntityBoundingBox(), lllllllllllllIIlIllllIIIlIlIllll);
                }
                this.setEntityBoundingBox(this.getEntityBoundingBox().offset(0.0, lllllllllllllIIlIllllIIIlIlIllll, 0.0));
                if (llIlIlIlIIllllI(llIlIlIlIlIIlll(lllllllllllllIIlIllllIIIlllIIlIl * lllllllllllllIIlIllllIIIlllIIlIl + lllllllllllllIIlIllllIIIlllIIIlI * lllllllllllllIIlIllllIIIlllIIIlI, (double)(lllllllllllllIIlIllllIIIlIllIIII * lllllllllllllIIlIllllIIIlIllIIII + lllllllllllllIIlIllllIIIlIlIlllI * lllllllllllllIIlIllllIIIlIlIlllI)))) {
                    lllllllllllllIIlIllllIIIlIllIIII = lllllllllllllIIlIllllIIIlllIIlIl;
                    lllllllllllllIIlIllllIIIlIlIllll = lllllllllllllIIlIllllIIIlllIIlII;
                    lllllllllllllIIlIllllIIIlIlIlllI = lllllllllllllIIlIllllIIIlllIIIlI;
                    this.setEntityBoundingBox(lllllllllllllIIlIllllIIIlllIIIIl);
                }
            }
            this.worldObj.theProfiler.endSection();
            this.worldObj.theProfiler.startSection(Entity.lIIlIllllIIlll[Entity.lIIllIIIIIllIl[5]]);
            this.resetPositionToBB();
            int isCollidedHorizontally;
            if (llIlIlIlIlIIIII(llIlIlIlIlIIlll(lllllllllllllIIlIllllIIIlllllIII, lllllllllllllIIlIllllIIIlIllIIII)) && llIlIlIlIlIIIII(llIlIlIlIlIIlll(lllllllllllllIIlIllllIIIllllIlIl, (double)lllllllllllllIIlIllllIIIlIlIlllI))) {
                isCollidedHorizontally = Entity.lIIllIIIIIllIl[1];
                "".length();
                if ((0xD1 ^ 0x8F ^ (0xDE ^ 0x84)) == 0x0) {
                    return;
                }
            }
            else {
                isCollidedHorizontally = Entity.lIIllIIIIIllIl[0];
            }
            this.isCollidedHorizontally = (isCollidedHorizontally != 0);
            int isCollidedVertically;
            if (llIlIlIlIIllIIl(llIlIlIlIlIIlll(lllllllllllllIIlIllllIIIllllIlll, lllllllllllllIIlIllllIIIlIlIllll))) {
                isCollidedVertically = Entity.lIIllIIIIIllIl[0];
                "".length();
                if (" ".length() < 0) {
                    return;
                }
            }
            else {
                isCollidedVertically = Entity.lIIllIIIIIllIl[1];
            }
            this.isCollidedVertically = (isCollidedVertically != 0);
            int onGround;
            if (llIlIlIlIIllIIl(this.isCollidedVertically ? 1 : 0) && llIlIlIlIlIIlII(llIlIlIlIlIIllI(lllllllllllllIIlIllllIIIllllIlll, 0.0))) {
                onGround = Entity.lIIllIIIIIllIl[0];
                "".length();
                if (-(100 + 166 - 184 + 116 ^ 136 + 120 - 194 + 132) >= 0) {
                    return;
                }
            }
            else {
                onGround = Entity.lIIllIIIIIllIl[1];
            }
            this.onGround = (onGround != 0);
            int isCollided;
            if (llIlIlIlIlIIIII(this.isCollidedHorizontally ? 1 : 0) && llIlIlIlIlIIIII(this.isCollidedVertically ? 1 : 0)) {
                isCollided = Entity.lIIllIIIIIllIl[1];
                "".length();
                if (null != null) {
                    return;
                }
            }
            else {
                isCollided = Entity.lIIllIIIIIllIl[0];
            }
            this.isCollided = (isCollided != 0);
            final int lllllllllllllIIlIllllIIIllIIIIll = MathHelper.floor_double(this.posX);
            final int lllllllllllllIIlIllllIIIllIIIIlI = MathHelper.floor_double(this.posY - 0.20000000298023224);
            final int lllllllllllllIIlIllllIIIllIIIIIl = MathHelper.floor_double(this.posZ);
            BlockPos lllllllllllllIIlIllllIIIllIIIIII = new BlockPos(lllllllllllllIIlIllllIIIllIIIIll, lllllllllllllIIlIllllIIIllIIIIlI, lllllllllllllIIlIllllIIIllIIIIIl);
            Block lllllllllllllIIlIllllIIIlIllllll = this.worldObj.getBlockState(lllllllllllllIIlIllllIIIllIIIIII).getBlock();
            if (llIlIlIlIlIlllI(lllllllllllllIIlIllllIIIlIllllll.getMaterial(), Material.air)) {
                final Block lllllllllllllIIlIllllIIIlIlllllI = this.worldObj.getBlockState(lllllllllllllIIlIllllIIIllIIIIII.down()).getBlock();
                if (!llIlIlIlIlIIIII((lllllllllllllIIlIllllIIIlIlllllI instanceof BlockFence) ? 1 : 0) || !llIlIlIlIlIIIII((lllllllllllllIIlIllllIIIlIlllllI instanceof BlockWall) ? 1 : 0) || llIlIlIlIIllIIl((lllllllllllllIIlIllllIIIlIlllllI instanceof BlockFenceGate) ? 1 : 0)) {
                    lllllllllllllIIlIllllIIIlIllllll = lllllllllllllIIlIllllIIIlIlllllI;
                    lllllllllllllIIlIllllIIIllIIIIII = lllllllllllllIIlIllllIIIllIIIIII.down();
                }
            }
            this.updateFallState(lllllllllllllIIlIllllIIIlIlIllll, this.onGround, lllllllllllllIIlIllllIIIlIllllll, lllllllllllllIIlIllllIIIllIIIIII);
            if (llIlIlIlIIllIIl(llIlIlIlIlIIlll(lllllllllllllIIlIllllIIIlllllIII, lllllllllllllIIlIllllIIIlIllIIII))) {
                this.motionX = 0.0;
            }
            if (llIlIlIlIIllIIl(llIlIlIlIlIIlll(lllllllllllllIIlIllllIIIllllIlIl, (double)lllllllllllllIIlIllllIIIlIlIlllI))) {
                this.motionZ = 0.0;
            }
            if (llIlIlIlIIllIIl(llIlIlIlIlIIlll(lllllllllllllIIlIllllIIIllllIlll, lllllllllllllIIlIllllIIIlIlIllll))) {
                lllllllllllllIIlIllllIIIlIllllll.onLanded(this.worldObj, this);
            }
            if (llIlIlIlIIllIIl(this.canTriggerWalking() ? 1 : 0) && llIlIlIlIlIIIII(lllllllllllllIIlIllllIIIllllIIll ? 1 : 0) && llIlIlIlIlIIIlI(this.ridingEntity)) {
                final double lllllllllllllIIlIllllIIIlIllllIl = this.posX - lllllllllllllIIlIllllIIIllllllII;
                double lllllllllllllIIlIllllIIIlIllllII = this.posY - lllllllllllllIIlIllllIIIlllllIll;
                final double lllllllllllllIIlIllllIIIlIlllIll = this.posZ - lllllllllllllIIlIllllIIIlllllIIl;
                if (llIlIlIlIllIIII(lllllllllllllIIlIllllIIIlIllllll, Blocks.ladder)) {
                    lllllllllllllIIlIllllIIIlIllllII = 0.0;
                }
                if (llIlIlIlIIllIII(lllllllllllllIIlIllllIIIlIllllll) && llIlIlIlIIllIIl(this.onGround ? 1 : 0)) {
                    lllllllllllllIIlIllllIIIlIllllll.onEntityCollidedWithBlock(this.worldObj, lllllllllllllIIlIllllIIIllIIIIII, this);
                }
                this.distanceWalkedModified += (float)(MathHelper.sqrt_double(lllllllllllllIIlIllllIIIlIllllIl * lllllllllllllIIlIllllIIIlIllllIl + lllllllllllllIIlIllllIIIlIlllIll * lllllllllllllIIlIllllIIIlIlllIll) * 0.6);
                this.distanceWalkedOnStepModified += (float)(MathHelper.sqrt_double(lllllllllllllIIlIllllIIIlIllllIl * lllllllllllllIIlIllllIIIlIllllIl + lllllllllllllIIlIllllIIIlIllllII * lllllllllllllIIlIllllIIIlIllllII + lllllllllllllIIlIllllIIIlIlllIll * lllllllllllllIIlIllllIIIlIlllIll) * 0.6);
                if (llIlIlIlIIlllIl(llIlIlIlIlIlIII(this.distanceWalkedOnStepModified, (float)this.nextStepDistance)) && llIlIlIlIllIIII(lllllllllllllIIlIllllIIIlIllllll.getMaterial(), Material.air)) {
                    this.nextStepDistance = (int)this.distanceWalkedOnStepModified + Entity.lIIllIIIIIllIl[0];
                    if (llIlIlIlIIllIIl(this.isInWater() ? 1 : 0)) {
                        float lllllllllllllIIlIllllIIIlIlllIlI = MathHelper.sqrt_double(this.motionX * this.motionX * 0.20000000298023224 + this.motionY * this.motionY + this.motionZ * this.motionZ * 0.20000000298023224) * 0.35f;
                        if (llIlIlIlIIlllIl(llIlIlIlIlIlIII(lllllllllllllIIlIllllIIIlIlllIlI, 1.0f))) {
                            lllllllllllllIIlIllllIIIlIlllIlI = 1.0f;
                        }
                        this.playSound(this.getSwimSound(), lllllllllllllIIlIllllIIIlIlllIlI, 1.0f + (this.rand.nextFloat() - this.rand.nextFloat()) * 0.4f);
                    }
                    this.playStepSound(lllllllllllllIIlIllllIIIllIIIIII, lllllllllllllIIlIllllIIIlIllllll);
                }
            }
            try {
                this.doBlockCollisions();
                "".length();
                if (-" ".length() >= 0) {
                    return;
                }
            }
            catch (Throwable lllllllllllllIIlIllllIIIlIlllIII) {
                final CrashReport lllllllllllllIIlIllllIIIlIllIlll = CrashReport.makeCrashReport(lllllllllllllIIlIllllIIIlIlllIII, Entity.lIIlIllllIIlll[Entity.lIIllIIIIIllIl[9]]);
                final CrashReportCategory lllllllllllllIIlIllllIIIlIllIlIl = lllllllllllllIIlIllllIIIlIllIlll.makeCategory(Entity.lIIlIllllIIlll[Entity.lIIllIIIIIllIl[10]]);
                this.addEntityCrashInfo(lllllllllllllIIlIllllIIIlIllIlIl);
                throw new ReportedException(lllllllllllllIIlIllllIIIlIllIlll);
            }
            final boolean lllllllllllllIIlIllllIIIlIllIlII = this.isWet();
            if (llIlIlIlIIllIIl(this.worldObj.isFlammableWithin(this.getEntityBoundingBox().contract(0.001, 0.001, 0.001)) ? 1 : 0)) {
                this.dealFireDamage(Entity.lIIllIIIIIllIl[0]);
                if (llIlIlIlIlIIIII(lllllllllllllIIlIllllIIIlIllIlII ? 1 : 0)) {
                    this.fire += Entity.lIIllIIIIIllIl[0];
                    if (llIlIlIlIlIIIII(this.fire)) {
                        this.setFire(Entity.lIIllIIIIIllIl[11]);
                        "".length();
                        if (((0x4D ^ 0x58 ^ (0x12 ^ 0x1)) & (0xE ^ 0x9 ^ " ".length() ^ -" ".length())) != 0x0) {
                            return;
                        }
                    }
                }
            }
            else if (llIlIlIlIllIIlI(this.fire)) {
                this.fire = -this.fireResistance;
            }
            if (llIlIlIlIIllIIl(lllllllllllllIIlIllllIIIlIllIlII ? 1 : 0) && llIlIlIlIIlllIl(this.fire)) {
                this.playSound(Entity.lIIlIllllIIlll[Entity.lIIllIIIIIllIl[12]], 0.7f, 1.6f + (this.rand.nextFloat() - this.rand.nextFloat()) * 0.4f);
                this.fire = -this.fireResistance;
            }
            this.worldObj.theProfiler.endSection();
        }
    }
    
    public double getDistanceSq(final double lllllllllllllIIlIlllIllIIIIlIIlI, final double lllllllllllllIIlIlllIllIIIIlIIIl, final double lllllllllllllIIlIlllIllIIIIlIIII) {
        final double lllllllllllllIIlIlllIllIIIIIllll = this.posX - lllllllllllllIIlIlllIllIIIIlIIlI;
        final double lllllllllllllIIlIlllIllIIIIIlllI = this.posY - lllllllllllllIIlIlllIllIIIIlIIIl;
        final double lllllllllllllIIlIlllIllIIIIIllII = this.posZ - lllllllllllllIIlIlllIllIIIIlIIII;
        return lllllllllllllIIlIlllIllIIIIIllll * lllllllllllllIIlIlllIllIIIIIllll + lllllllllllllIIlIlllIllIIIIIlllI * lllllllllllllIIlIlllIllIIIIIlllI + lllllllllllllIIlIlllIllIIIIIllII * lllllllllllllIIlIlllIllIIIIIllII;
    }
    
    public void copyLocationAndAnglesFrom(final Entity lllllllllllllIIlIlllIIIlIlIIlIIl) {
        this.setLocationAndAngles(lllllllllllllIIlIlllIIIlIlIIlIIl.posX, lllllllllllllIIlIlllIIIlIlIIlIIl.posY, lllllllllllllIIlIlllIIIlIlIIlIIl.posZ, lllllllllllllIIlIlllIIIlIlIIlIIl.rotationYaw, lllllllllllllIIlIlllIIIlIlIIlIIl.rotationPitch);
    }
    
    private static int llIlIlIllIIIIIl(final double n, final double n2) {
        return dcmpg(n, n2);
    }
    
    public void onEntityUpdate() {
        this.worldObj.theProfiler.startSection(Entity.lIIlIllllIIlll[Entity.lIIllIIIIIllIl[0]]);
        if (llIlIlIlIIllIII(this.ridingEntity) && llIlIlIlIIllIIl(this.ridingEntity.isDead ? 1 : 0)) {
            this.ridingEntity = null;
        }
        this.prevDistanceWalkedModified = this.distanceWalkedModified;
        this.prevPosX = this.posX;
        this.prevPosY = this.posY;
        this.prevPosZ = this.posZ;
        this.prevRotationPitch = this.rotationPitch;
        this.prevRotationYaw = this.rotationYaw;
        if (llIlIlIlIlIIIII(this.worldObj.isRemote ? 1 : 0) && llIlIlIlIIllIIl((this.worldObj instanceof WorldServer) ? 1 : 0)) {
            this.worldObj.theProfiler.startSection(Entity.lIIlIllllIIlll[Entity.lIIllIIIIIllIl[4]]);
            final MinecraftServer lllllllllllllIIlIllllIIllllIllll = ((WorldServer)this.worldObj).getMinecraftServer();
            final int lllllllllllllIIlIllllIIllllIllIl = this.getMaxInPortalTime();
            if (llIlIlIlIIllIIl(this.inPortal ? 1 : 0)) {
                if (llIlIlIlIIllIIl(lllllllllllllIIlIllllIIllllIllll.getAllowNether() ? 1 : 0)) {
                    if (llIlIlIlIlIIIlI(this.ridingEntity)) {
                        final int portalCounter = this.portalCounter;
                        this.portalCounter = portalCounter + Entity.lIIllIIIIIllIl[0];
                        if (llIlIlIlIlIIIll(portalCounter, lllllllllllllIIlIllllIIllllIllIl)) {
                            this.portalCounter = lllllllllllllIIlIllllIIllllIllIl;
                            this.timeUntilPortal = this.getPortalCooldown();
                            int lllllllllllllIIlIllllIIllllIlIIl = 0;
                            if (llIlIlIlIIllIlI(this.worldObj.provider.getDimensionId(), Entity.lIIllIIIIIllIl[6])) {
                                final int lllllllllllllIIlIllllIIllllIlIll = Entity.lIIllIIIIIllIl[1];
                                "".length();
                                if (-(32 + 137 - 139 + 108 ^ 120 + 29 - 123 + 116) >= 0) {
                                    return;
                                }
                            }
                            else {
                                lllllllllllllIIlIllllIIllllIlIIl = Entity.lIIllIIIIIllIl[6];
                            }
                            this.travelToDimension(lllllllllllllIIlIllllIIllllIlIIl);
                        }
                    }
                    this.inPortal = (Entity.lIIllIIIIIllIl[1] != 0);
                    "".length();
                    if ((0xB2 ^ 0xB6) < (0x8E ^ 0x8A)) {
                        return;
                    }
                }
            }
            else {
                if (llIlIlIlIIlllIl(this.portalCounter)) {
                    this.portalCounter -= Entity.lIIllIIIIIllIl[5];
                }
                if (llIlIlIlIlIIlII(this.portalCounter)) {
                    this.portalCounter = Entity.lIIllIIIIIllIl[1];
                }
            }
            if (llIlIlIlIIlllIl(this.timeUntilPortal)) {
                this.timeUntilPortal -= Entity.lIIllIIIIIllIl[0];
            }
            this.worldObj.theProfiler.endSection();
        }
        this.spawnRunningParticles();
        this.handleWaterMovement();
        "".length();
        if (llIlIlIlIIllIIl(this.worldObj.isRemote ? 1 : 0)) {
            this.fire = Entity.lIIllIIIIIllIl[1];
            "".length();
            if (((0xDD ^ 0x93) & ~(0x26 ^ 0x68)) != 0x0) {
                return;
            }
        }
        else if (llIlIlIlIIlllIl(this.fire)) {
            if (llIlIlIlIIllIIl(this.isImmuneToFire ? 1 : 0)) {
                this.fire -= Entity.lIIllIIIIIllIl[5];
                if (llIlIlIlIlIIlII(this.fire)) {
                    this.fire = Entity.lIIllIIIIIllIl[1];
                    "".length();
                    if (-" ".length() > (0xAF ^ 0xAB)) {
                        return;
                    }
                }
            }
            else {
                if (llIlIlIlIlIIIII(this.fire % Entity.lIIllIIIIIllIl[7])) {
                    this.attackEntityFrom(DamageSource.onFire, 1.0f);
                    "".length();
                }
                this.fire -= Entity.lIIllIIIIIllIl[0];
            }
        }
        if (llIlIlIlIIllIIl(this.isInLava() ? 1 : 0)) {
            this.setOnFireFromLava();
            this.fallDistance *= 0.5f;
        }
        if (llIlIlIlIlIIlII(llIlIlIlIlIIIIl(this.posY, -64.0))) {
            this.kill();
        }
        if (llIlIlIlIlIIIII(this.worldObj.isRemote ? 1 : 0)) {
            final int lllllllllllllIIlIlllIIlIIIIIIlll = Entity.lIIllIIIIIllIl[1];
            int lllllllllllllIIlIlllIIIlllllllll;
            if (llIlIlIlIIlllIl(this.fire)) {
                lllllllllllllIIlIlllIIIlllllllll = Entity.lIIllIIIIIllIl[0];
                "".length();
                if (null != null) {
                    return;
                }
            }
            else {
                lllllllllllllIIlIlllIIIlllllllll = Entity.lIIllIIIIIllIl[1];
            }
            this.setFlag(lllllllllllllIIlIlllIIlIIIIIIlll, (boolean)(lllllllllllllIIlIlllIIIlllllllll != 0));
        }
        this.firstUpdate = (Entity.lIIllIIIIIllIl[1] != 0);
        this.worldObj.theProfiler.endSection();
    }
    
    protected String getSplashSound() {
        return Entity.lIIlIllllIIlll[Entity.lIIllIIIIIllIl[15]];
    }
    
    public void moveToBlockPosAndAngles(final BlockPos lllllllllllllIIlIlllIllIIllIllIl, final float lllllllllllllIIlIlllIllIIllIIIlI, final float lllllllllllllIIlIlllIllIIllIlIIl) {
        this.setLocationAndAngles(lllllllllllllIIlIlllIllIIllIllIl.getX() + 0.5, lllllllllllllIIlIlllIllIIllIllIl.getY(), lllllllllllllIIlIlllIllIIllIllIl.getZ() + 0.5, lllllllllllllIIlIlllIllIIllIIIlI, lllllllllllllIIlIlllIllIIllIlIIl);
    }
    
    public void onChunkLoad() {
    }
    
    public double getYOffset() {
        return 0.0;
    }
    
    private static boolean llIlIlIlIlIIlIl(final int lllllllllllllIIlIllIlllIlllIIIll, final int lllllllllllllIIlIllIlllIlllIIIII) {
        return lllllllllllllIIlIllIlllIlllIIIll < lllllllllllllIIlIllIlllIlllIIIII;
    }
    
    public boolean getAlwaysRenderNameTagForRender() {
        return this.getAlwaysRenderNameTag();
    }
    
    private static int llIlIlIlIllllll(final float n, final float n2) {
        return fcmpg(n, n2);
    }
    
    protected final Vec3 getVectorForRotation(final float lllllllllllllIIlIlllIlIlIIlllIlI, final float lllllllllllllIIlIlllIlIlIIlIllll) {
        final float lllllllllllllIIlIlllIlIlIIlllIII = MathHelper.cos(-lllllllllllllIIlIlllIlIlIIlIllll * 0.017453292f - 3.1415927f);
        final float lllllllllllllIIlIlllIlIlIIllIlll = MathHelper.sin(-lllllllllllllIIlIlllIlIlIIlIllll * 0.017453292f - 3.1415927f);
        final float lllllllllllllIIlIlllIlIlIIllIlIl = -MathHelper.cos(-lllllllllllllIIlIlllIlIlIIlllIlI * 0.017453292f);
        final float lllllllllllllIIlIlllIlIlIIllIIll = MathHelper.sin(-lllllllllllllIIlIlllIlIlIIlllIlI * 0.017453292f);
        return new Vec3(lllllllllllllIIlIlllIlIlIIllIlll * lllllllllllllIIlIlllIlIlIIllIlIl, lllllllllllllIIlIlllIlIlIIllIIll, lllllllllllllIIlIlllIlIlIIlllIII * lllllllllllllIIlIlllIlIlIIllIlIl);
    }
    
    public boolean isInsideOfMaterial(final Material lllllllllllllIIlIlllIlllIIIIIlII) {
        final double lllllllllllllIIlIlllIlllIIIIllII = this.posY + this.getEyeHeight();
        final BlockPos lllllllllllllIIlIlllIlllIIIIlIll = new BlockPos(this.posX, lllllllllllllIIlIlllIlllIIIIllII, this.posZ);
        final IBlockState lllllllllllllIIlIlllIlllIIIIlIlI = this.worldObj.getBlockState(lllllllllllllIIlIlllIlllIIIIlIll);
        final Block lllllllllllllIIlIlllIlllIIIIlIIl = lllllllllllllIIlIlllIlllIIIIlIlI.getBlock();
        if (llIlIlIlIlIlllI(lllllllllllllIIlIlllIlllIIIIlIIl.getMaterial(), lllllllllllllIIlIlllIlllIIIIIlII)) {
            final float lllllllllllllIIlIlllIlllIIIIlIII = BlockLiquid.getLiquidHeightPercent(lllllllllllllIIlIlllIlllIIIIlIlI.getBlock().getMetaFromState(lllllllllllllIIlIlllIlllIIIIlIlI)) - 0.11111111f;
            final float lllllllllllllIIlIlllIlllIIIIIlll = lllllllllllllIIlIlllIlllIIIIlIll.getY() + Entity.lIIllIIIIIllIl[0] - lllllllllllllIIlIlllIlllIIIIlIII;
            int n;
            if (llIlIlIlIlIIlII(llIlIlIlIllllIl(lllllllllllllIIlIlllIlllIIIIllII, lllllllllllllIIlIlllIlllIIIIIlll))) {
                n = Entity.lIIllIIIIIllIl[0];
                "".length();
                if (("  ".length() ^ (0x56 ^ 0x51)) == 0x0) {
                    return ("   ".length() & ("   ".length() ^ -" ".length())) != 0x0;
                }
            }
            else {
                n = Entity.lIIllIIIIIllIl[1];
            }
            final boolean lllllllllllllIIlIlllIlllIIIIIllI = n != 0;
            int n2;
            if (llIlIlIlIlIIIII(lllllllllllllIIlIlllIlllIIIIIllI ? 1 : 0) && llIlIlIlIIllIIl((this instanceof EntityPlayer) ? 1 : 0)) {
                n2 = Entity.lIIllIIIIIllIl[1];
                "".length();
                if (-(0xE ^ 0xA) >= 0) {
                    return ((0x3D ^ 0x7F) & ~(0x55 ^ 0x17)) != 0x0;
                }
            }
            else {
                n2 = (lllllllllllllIIlIlllIlllIIIIIllI ? 1 : 0);
            }
            return n2 != 0;
        }
        return Entity.lIIllIIIIIllIl[1] != 0;
    }
    
    static {
        llIlIlIlIIlIlll();
        llIlIlIIlIIlIll();
        ZERO_AABB = new AxisAlignedBB(0.0, 0.0, 0.0, 0.0, 0.0, 0.0);
    }
    
    @Override
    public String getName() {
        if (llIlIlIlIIllIIl(this.hasCustomName() ? 1 : 0)) {
            return this.getCustomNameTag();
        }
        String lllllllllllllIIlIlllIIIllIIIlIII = EntityList.getEntityString(this);
        if (llIlIlIlIlIIIlI(lllllllllllllIIlIlllIIIllIIIlIII)) {
            lllllllllllllIIlIlllIIIllIIIlIII = Entity.lIIlIllllIIlll[Entity.lIIllIIIIIllIl[57]];
        }
        return StatCollector.translateToLocal(String.valueOf(new StringBuilder(Entity.lIIlIllllIIlll[Entity.lIIllIIIIIllIl[58]]).append(lllllllllllllIIlIlllIIIllIIIlIII).append(Entity.lIIlIllllIIlll[Entity.lIIllIIIIIllIl[59]])));
    }
    
    private static int llIlIlIllIIIIlI(final double n, final double n2) {
        return dcmpl(n, n2);
    }
    
    public void moveFlying(float lllllllllllllIIlIlllIllIllIIllII, float lllllllllllllIIlIlllIllIllIlIllI, final float lllllllllllllIIlIlllIllIllIIlIlI) {
        float lllllllllllllIIlIlllIllIllIlIIll = lllllllllllllIIlIlllIllIllIIllII * lllllllllllllIIlIlllIllIllIIllII + lllllllllllllIIlIlllIllIllIlIllI * lllllllllllllIIlIlllIllIllIlIllI;
        if (llIlIlIlIIllllI(llIlIlIlIlllllI(lllllllllllllIIlIlllIllIllIlIIll, 1.0E-4f))) {
            lllllllllllllIIlIlllIllIllIlIIll = MathHelper.sqrt_float(lllllllllllllIIlIlllIllIllIlIIll);
            if (llIlIlIlIlIIlII(llIlIlIlIllllll(lllllllllllllIIlIlllIllIllIlIIll, 1.0f))) {
                lllllllllllllIIlIlllIllIllIlIIll = 1.0f;
            }
            lllllllllllllIIlIlllIllIllIlIIll = lllllllllllllIIlIlllIllIllIIlIlI / lllllllllllllIIlIlllIllIllIlIIll;
            lllllllllllllIIlIlllIllIllIIllII *= lllllllllllllIIlIlllIllIllIlIIll;
            lllllllllllllIIlIlllIllIllIlIllI *= lllllllllllllIIlIlllIllIllIlIIll;
            final float lllllllllllllIIlIlllIllIllIlIIIl = MathHelper.sin(this.rotationYaw * 3.1415927f / 180.0f);
            final float lllllllllllllIIlIlllIllIllIIllll = MathHelper.cos(this.rotationYaw * 3.1415927f / 180.0f);
            this.motionX += lllllllllllllIIlIlllIllIllIIllII * lllllllllllllIIlIlllIllIllIIllll - lllllllllllllIIlIlllIllIllIlIllI * lllllllllllllIIlIlllIllIllIlIIIl;
            this.motionZ += lllllllllllllIIlIlllIllIllIlIllI * lllllllllllllIIlIlllIllIllIIllll + lllllllllllllIIlIlllIllIllIIllII * lllllllllllllIIlIlllIllIllIlIIIl;
        }
    }
    
    protected void createRunningParticles() {
        final int lllllllllllllIIlIlllIlllIlIIIIII = MathHelper.floor_double(this.posX);
        final int lllllllllllllIIlIlllIlllIIllllll = MathHelper.floor_double(this.posY - 0.20000000298023224);
        final int lllllllllllllIIlIlllIlllIIlllllI = MathHelper.floor_double(this.posZ);
        final BlockPos lllllllllllllIIlIlllIlllIIllllIl = new BlockPos(lllllllllllllIIlIlllIlllIlIIIIII, lllllllllllllIIlIlllIlllIIllllll, lllllllllllllIIlIlllIlllIIlllllI);
        final IBlockState lllllllllllllIIlIlllIlllIIllllII = this.worldObj.getBlockState(lllllllllllllIIlIlllIlllIIllllIl);
        final Block lllllllllllllIIlIlllIlllIIlllIll = lllllllllllllIIlIlllIlllIIllllII.getBlock();
        if (llIlIlIlIllllII(lllllllllllllIIlIlllIlllIIlllIll.getRenderType(), Entity.lIIllIIIIIllIl[6])) {
            final World worldObj = this.worldObj;
            final EnumParticleTypes block_CRACK = EnumParticleTypes.BLOCK_CRACK;
            final double lllllllllllllIIIlIIllllIIlIlllll = this.posX + (this.rand.nextFloat() - 0.5) * this.width;
            final double lllllllllllllIIIlIIllllIIlIllllI = this.getEntityBoundingBox().minY + 0.1;
            final double lllllllllllllIIIlIIllllIIlIlllIl = this.posZ + (this.rand.nextFloat() - 0.5) * this.width;
            final double lllllllllllllIIIlIIllllIIllIIlIl = -this.motionX * 4.0;
            final double lllllllllllllIIIlIIllllIIllIIlII = 1.5;
            final double lllllllllllllIIIlIIllllIIlIllIlI = -this.motionZ * 4.0;
            final int[] lllllllllllllIIIlIIllllIIlIllIIl = new int[Entity.lIIllIIIIIllIl[0]];
            lllllllllllllIIIlIIllllIIlIllIIl[Entity.lIIllIIIIIllIl[1]] = Block.getStateId(lllllllllllllIIlIlllIlllIIllllII);
            worldObj.spawnParticle(block_CRACK, lllllllllllllIIIlIIllllIIlIlllll, lllllllllllllIIIlIIllllIIlIllllI, lllllllllllllIIIlIIllllIIlIlllIl, lllllllllllllIIIlIIllllIIllIIlIl, lllllllllllllIIIlIIllllIIllIIlII, lllllllllllllIIIlIIllllIIlIllIlI, lllllllllllllIIIlIIllllIIlIllIIl);
        }
    }
    
    public boolean canBePushed() {
        return Entity.lIIllIIIIIllIl[1] != 0;
    }
    
    private static int llIlIlIllIIIlll(final float n, final float n2) {
        return fcmpl(n, n2);
    }
    
    public Vec3 getLook(final float lllllllllllllIIlIlllIlIlIlIIllll) {
        if (llIlIlIlIlIIIII(llIlIlIllIIIllI(lllllllllllllIIlIlllIlIlIlIIllll, 1.0f))) {
            return this.getVectorForRotation(this.rotationPitch, this.rotationYaw);
        }
        final float lllllllllllllIIlIlllIlIlIlIIllIl = this.prevRotationPitch + (this.rotationPitch - this.prevRotationPitch) * lllllllllllllIIlIlllIlIlIlIIllll;
        final float lllllllllllllIIlIlllIlIlIlIIlIll = this.prevRotationYaw + (this.rotationYaw - this.prevRotationYaw) * lllllllllllllIIlIlllIlIlIlIIllll;
        return this.getVectorForRotation(lllllllllllllIIlIlllIlIlIlIIllIl, lllllllllllllIIlIlllIlIlIlIIlIll);
    }
    
    public float getRotationYawHead() {
        return 0.0f;
    }
    
    public boolean isInWater() {
        return this.inWater;
    }
    
    @Override
    public String toString() {
        final String format = Entity.lIIlIllllIIlll[Entity.lIIllIIIIIllIl[60]];
        final Object[] args = new Object[Entity.lIIllIIIIIllIl[12]];
        args[Entity.lIIllIIIIIllIl[1]] = this.getClass().getSimpleName();
        args[Entity.lIIllIIIIIllIl[0]] = this.getName();
        args[Entity.lIIllIIIIIllIl[4]] = this.entityId;
        final int n = Entity.lIIllIIIIIllIl[3];
        String worldName;
        if (llIlIlIlIlIIIlI(this.worldObj)) {
            worldName = Entity.lIIlIllllIIlll[Entity.lIIllIIIIIllIl[61]];
            "".length();
            if (" ".length() == 0) {
                return null;
            }
        }
        else {
            worldName = this.worldObj.getWorldInfo().getWorldName();
        }
        args[n] = worldName;
        args[Entity.lIIllIIIIIllIl[5]] = this.posX;
        args[Entity.lIIllIIIIIllIl[9]] = this.posY;
        args[Entity.lIIllIIIIIllIl[10]] = this.posZ;
        return String.format(format, args);
    }
    
    private static int llIlIlIlIlllllI(final float n, final float n2) {
        return fcmpl(n, n2);
    }
    
    public void setEntityBoundingBox(final AxisAlignedBB lllllllllllllIIlIlllIIIIIIlllIIl) {
        this.boundingBox = lllllllllllllIIlIlllIIIIIIlllIIl;
    }
    
    public AxisAlignedBB getCollisionBoundingBox() {
        return null;
    }
    
    public boolean isImmuneToExplosions() {
        return Entity.lIIllIIIIIllIl[1] != 0;
    }
    
    public void setWorld(final World lllllllllllllIIlIlllIllIlIlIIIlI) {
        this.worldObj = lllllllllllllIIlIlllIllIlIlIIIlI;
    }
    
    protected HoverEvent getHoverEvent() {
        final NBTTagCompound lllllllllllllIIlIlllIIIIIlIlIIIl = new NBTTagCompound();
        final String lllllllllllllIIlIlllIIIIIlIIllll = EntityList.getEntityString(this);
        lllllllllllllIIlIlllIIIIIlIlIIIl.setString(Entity.lIIlIllllIIlll[Entity.lIIllIIIIIllIl[75]], this.getUniqueID().toString());
        if (llIlIlIlIIllIII(lllllllllllllIIlIlllIIIIIlIIllll)) {
            lllllllllllllIIlIlllIIIIIlIlIIIl.setString(Entity.lIIlIllllIIlll[Entity.lIIllIIIIIllIl[76]], lllllllllllllIIlIlllIIIIIlIIllll);
        }
        lllllllllllllIIlIlllIIIIIlIlIIIl.setString(Entity.lIIlIllllIIlll[Entity.lIIllIIIIIllIl[77]], this.getName());
        return new HoverEvent(HoverEvent.Action.SHOW_ENTITY, new ChatComponentText(lllllllllllllIIlIlllIIIIIlIlIIIl.toString()));
    }
    
    public void clientUpdateEntityNBT(final NBTTagCompound lllllllllllllIIlIllIllllllIIlIll) {
    }
    
    public void extinguish() {
        this.fire = Entity.lIIllIIIIIllIl[1];
    }
    
    public boolean isInLava() {
        return this.worldObj.isMaterialInBB(this.getEntityBoundingBox().expand(-0.10000000149011612, -0.4000000059604645, -0.10000000149011612), Material.lava);
    }
    
    public boolean canAttackWithItem() {
        return Entity.lIIllIIIIIllIl[0] != 0;
    }
    
    public DataWatcher getDataWatcher() {
        return this.dataWatcher;
    }
    
    public AxisAlignedBB getCollisionBox(final Entity lllllllllllllIIlIlllIIllIllllIIl) {
        return null;
    }
    
    public void setAlwaysRenderNameTag(final boolean lllllllllllllIIlIlllIIIIlIIlIIIl) {
        final DataWatcher dataWatcher = this.dataWatcher;
        final int llllllllllllIllIlIIlIIlllIIIIlIl = Entity.lIIllIIIIIllIl[3];
        int n;
        if (llIlIlIlIIllIIl(lllllllllllllIIlIlllIIIIlIIlIIIl ? 1 : 0)) {
            n = Entity.lIIllIIIIIllIl[0];
            "".length();
            if (-" ".length() == "   ".length()) {
                return;
            }
        }
        else {
            n = Entity.lIIllIIIIIllIl[1];
        }
        dataWatcher.updateObject(llllllllllllIllIlIIlIIlllIIIIlIl, (byte)n);
    }
    
    private static boolean llIlIlIlIIllllI(final int lllllllllllllIIlIllIlllIllIIIIIl) {
        return lllllllllllllIIlIllIlllIllIIIIIl >= 0;
    }
    
    public boolean isInRangeToRenderDist(final double lllllllllllllIIlIlllIlIIlIlllIIl) {
        double lllllllllllllIIlIlllIlIIlIlllIII = this.getEntityBoundingBox().getAverageEdgeLength();
        if (llIlIlIlIIllIIl(Double.isNaN(lllllllllllllIIlIlllIlIIlIlllIII) ? 1 : 0)) {
            lllllllllllllIIlIlllIlIIlIlllIII = 1.0;
        }
        lllllllllllllIIlIlllIlIIlIlllIII = lllllllllllllIIlIlllIlIIlIlllIII * 64.0 * this.renderDistanceWeight;
        if (llIlIlIlIlIIlII(llIlIlIllIIlIII(lllllllllllllIIlIlllIlIIlIlllIIl, lllllllllllllIIlIlllIlIIlIlllIII * lllllllllllllIIlIlllIlIIlIlllIII))) {
            return Entity.lIIllIIIIIllIl[0] != 0;
        }
        return Entity.lIIllIIIIIllIl[1] != 0;
    }
    
    public void setOutsideBorder(final boolean lllllllllllllIIlIlllIIIIIIlIIIlI) {
        this.isOutsideBorder = lllllllllllllIIlIlllIIIIIIlIIIlI;
    }
    
    public void writeToNBT(final NBTTagCompound lllllllllllllIIlIlllIlIIIllIllIl) {
        try {
            final String lllllllllllllIIIIIlIIIlIIllllIlI = Entity.lIIlIllllIIlll[Entity.lIIllIIIIIllIl[18]];
            final double[] lllllllllllllIIlIlllIlIIIIIllIII = new double[Entity.lIIllIIIIIllIl[3]];
            lllllllllllllIIlIlllIlIIIIIllIII[Entity.lIIllIIIIIllIl[1]] = this.posX;
            lllllllllllllIIlIlllIlIIIIIllIII[Entity.lIIllIIIIIllIl[0]] = this.posY;
            lllllllllllllIIlIlllIlIIIIIllIII[Entity.lIIllIIIIIllIl[4]] = this.posZ;
            lllllllllllllIIlIlllIlIIIllIllIl.setTag(lllllllllllllIIIIIlIIIlIIllllIlI, this.newDoubleNBTList(lllllllllllllIIlIlllIlIIIIIllIII));
            final String lllllllllllllIIIIIlIIIlIIllllIlI2 = Entity.lIIlIllllIIlll[Entity.lIIllIIIIIllIl[8]];
            final double[] lllllllllllllIIlIlllIlIIIIIllIII2 = new double[Entity.lIIllIIIIIllIl[3]];
            lllllllllllllIIlIlllIlIIIIIllIII2[Entity.lIIllIIIIIllIl[1]] = this.motionX;
            lllllllllllllIIlIlllIlIIIIIllIII2[Entity.lIIllIIIIIllIl[0]] = this.motionY;
            lllllllllllllIIlIlllIlIIIIIllIII2[Entity.lIIllIIIIIllIl[4]] = this.motionZ;
            lllllllllllllIIlIlllIlIIIllIllIl.setTag(lllllllllllllIIIIIlIIIlIIllllIlI2, this.newDoubleNBTList(lllllllllllllIIlIlllIlIIIIIllIII2));
            final String lllllllllllllIIIIIlIIIlIIllllIlI3 = Entity.lIIlIllllIIlll[Entity.lIIllIIIIIllIl[19]];
            final float[] lllllllllllllIIlIlllIIllllllllIl = new float[Entity.lIIllIIIIIllIl[4]];
            lllllllllllllIIlIlllIIllllllllIl[Entity.lIIllIIIIIllIl[1]] = this.rotationYaw;
            lllllllllllllIIlIlllIIllllllllIl[Entity.lIIllIIIIIllIl[0]] = this.rotationPitch;
            lllllllllllllIIlIlllIlIIIllIllIl.setTag(lllllllllllllIIIIIlIIIlIIllllIlI3, this.newFloatNBTList(lllllllllllllIIlIlllIIllllllllIl));
            lllllllllllllIIlIlllIlIIIllIllIl.setFloat(Entity.lIIlIllllIIlll[Entity.lIIllIIIIIllIl[20]], this.fallDistance);
            lllllllllllllIIlIlllIlIIIllIllIl.setShort(Entity.lIIlIllllIIlll[Entity.lIIllIIIIIllIl[21]], (short)this.fire);
            lllllllllllllIIlIlllIlIIIllIllIl.setShort(Entity.lIIlIllllIIlll[Entity.lIIllIIIIIllIl[22]], (short)this.getAir());
            lllllllllllllIIlIlllIlIIIllIllIl.setBoolean(Entity.lIIlIllllIIlll[Entity.lIIllIIIIIllIl[7]], this.onGround);
            lllllllllllllIIlIlllIlIIIllIllIl.setInteger(Entity.lIIlIllllIIlll[Entity.lIIllIIIIIllIl[23]], this.dimension);
            lllllllllllllIIlIlllIlIIIllIllIl.setBoolean(Entity.lIIlIllllIIlll[Entity.lIIllIIIIIllIl[24]], this.invulnerable);
            lllllllllllllIIlIlllIlIIIllIllIl.setInteger(Entity.lIIlIllllIIlll[Entity.lIIllIIIIIllIl[25]], this.timeUntilPortal);
            lllllllllllllIIlIlllIlIIIllIllIl.setLong(Entity.lIIlIllllIIlll[Entity.lIIllIIIIIllIl[26]], this.getUniqueID().getMostSignificantBits());
            lllllllllllllIIlIlllIlIIIllIllIl.setLong(Entity.lIIlIllllIIlll[Entity.lIIllIIIIIllIl[27]], this.getUniqueID().getLeastSignificantBits());
            if (llIlIlIlIIllIII(this.getCustomNameTag()) && llIlIlIlIIlllIl(this.getCustomNameTag().length())) {
                lllllllllllllIIlIlllIlIIIllIllIl.setString(Entity.lIIlIllllIIlll[Entity.lIIllIIIIIllIl[28]], this.getCustomNameTag());
                lllllllllllllIIlIlllIlIIIllIllIl.setBoolean(Entity.lIIlIllllIIlll[Entity.lIIllIIIIIllIl[29]], this.getAlwaysRenderNameTag());
            }
            this.cmdResultStats.writeStatsToNBT(lllllllllllllIIlIlllIlIIIllIllIl);
            if (llIlIlIlIIllIIl(this.isSilent() ? 1 : 0)) {
                lllllllllllllIIlIlllIlIIIllIllIl.setBoolean(Entity.lIIlIllllIIlll[Entity.lIIllIIIIIllIl[30]], this.isSilent());
            }
            this.writeEntityToNBT(lllllllllllllIIlIlllIlIIIllIllIl);
            if (llIlIlIlIIllIII(this.ridingEntity)) {
                final NBTTagCompound lllllllllllllIIlIlllIlIIIlllIIll = new NBTTagCompound();
                if (llIlIlIlIIllIIl(this.ridingEntity.writeMountToNBT(lllllllllllllIIlIlllIlIIIlllIIll) ? 1 : 0)) {
                    lllllllllllllIIlIlllIlIIIllIllIl.setTag(Entity.lIIlIllllIIlll[Entity.lIIllIIIIIllIl[31]], lllllllllllllIIlIlllIlIIIlllIIll);
                    "".length();
                    if (-" ".length() >= 0) {
                        return;
                    }
                }
            }
        }
        catch (Throwable lllllllllllllIIlIlllIlIIIlllIIlI) {
            final CrashReport lllllllllllllIIlIlllIlIIIlllIIII = CrashReport.makeCrashReport(lllllllllllllIIlIlllIlIIIlllIIlI, Entity.lIIlIllllIIlll[Entity.lIIllIIIIIllIl[32]]);
            final CrashReportCategory lllllllllllllIIlIlllIlIIIllIllll = lllllllllllllIIlIlllIlIIIlllIIII.makeCategory(Entity.lIIlIllllIIlll[Entity.lIIllIIIIIllIl[33]]);
            this.addEntityCrashInfo(lllllllllllllIIlIlllIlIIIllIllll);
            throw new ReportedException(lllllllllllllIIlIlllIlIIIlllIIII);
        }
    }
    
    @Override
    public IChatComponent getDisplayName() {
        final ChatComponentText lllllllllllllIIlIlllIIIIlIllIlIl = new ChatComponentText(this.getName());
        lllllllllllllIIlIlllIIIIlIllIlIl.getChatStyle().setChatHoverEvent(this.getHoverEvent());
        "".length();
        lllllllllllllIIlIlllIIIIlIllIlIl.getChatStyle().setInsertion(this.getUniqueID().toString());
        "".length();
        return lllllllllllllIIlIlllIIIIlIllIlIl;
    }
    
    protected void setFlag(final int lllllllllllllIIlIlllIIlIIIIIIlll, final boolean lllllllllllllIIlIlllIIIlllllllll) {
        final byte lllllllllllllIIlIlllIIlIIIIIIlII = this.dataWatcher.getWatchableObjectByte(Entity.lIIllIIIIIllIl[1]);
        if (llIlIlIlIIllIIl(lllllllllllllIIlIlllIIIlllllllll ? 1 : 0)) {
            this.dataWatcher.updateObject(Entity.lIIllIIIIIllIl[1], (byte)(lllllllllllllIIlIlllIIlIIIIIIlII | Entity.lIIllIIIIIllIl[0] << lllllllllllllIIlIlllIIlIIIIIIlll));
            "".length();
            if (null != null) {
                return;
            }
        }
        else {
            this.dataWatcher.updateObject(Entity.lIIllIIIIIllIl[1], (byte)(lllllllllllllIIlIlllIIlIIIIIIlII & (Entity.lIIllIIIIIllIl[0] << lllllllllllllIIlIlllIIlIIIIIIlll ^ Entity.lIIllIIIIIllIl[6])));
        }
    }
    
    public void fall(final float lllllllllllllIIlIlllIllllIlIIIlI, final float lllllllllllllIIlIlllIllllIlIIIII) {
        if (llIlIlIlIIllIII(this.riddenByEntity)) {
            this.riddenByEntity.fall(lllllllllllllIIlIlllIllllIlIIIlI, lllllllllllllIIlIlllIllllIlIIIII);
        }
    }
    
    public void onKillEntity(final EntityLivingBase lllllllllllllIIlIlllIIIllllIIlIl) {
    }
    
    public void readFromNBT(final NBTTagCompound lllllllllllllIIlIlllIlIIIlIIlIll) {
        try {
            final NBTTagList lllllllllllllIIlIlllIlIIIlIIlIlI = lllllllllllllIIlIlllIlIIIlIIlIll.getTagList(Entity.lIIlIllllIIlll[Entity.lIIllIIIIIllIl[34]], Entity.lIIllIIIIIllIl[10]);
            final NBTTagList lllllllllllllIIlIlllIlIIIlIIlIIl = lllllllllllllIIlIlllIlIIIlIIlIll.getTagList(Entity.lIIlIllllIIlll[Entity.lIIllIIIIIllIl[35]], Entity.lIIllIIIIIllIl[10]);
            final NBTTagList lllllllllllllIIlIlllIlIIIlIIIlll = lllllllllllllIIlIlllIlIIIlIIlIll.getTagList(Entity.lIIlIllllIIlll[Entity.lIIllIIIIIllIl[36]], Entity.lIIllIIIIIllIl[9]);
            this.motionX = lllllllllllllIIlIlllIlIIIlIIlIIl.getDoubleAt(Entity.lIIllIIIIIllIl[1]);
            this.motionY = lllllllllllllIIlIlllIlIIIlIIlIIl.getDoubleAt(Entity.lIIllIIIIIllIl[0]);
            this.motionZ = lllllllllllllIIlIlllIlIIIlIIlIIl.getDoubleAt(Entity.lIIllIIIIIllIl[4]);
            if (llIlIlIlIIlllIl(llIlIlIllIIlIIl(Math.abs(this.motionX), 10.0))) {
                this.motionX = 0.0;
            }
            if (llIlIlIlIIlllIl(llIlIlIllIIlIIl(Math.abs(this.motionY), 10.0))) {
                this.motionY = 0.0;
            }
            if (llIlIlIlIIlllIl(llIlIlIllIIlIIl(Math.abs(this.motionZ), 10.0))) {
                this.motionZ = 0.0;
            }
            final double double1 = lllllllllllllIIlIlllIlIIIlIIlIlI.getDoubleAt(Entity.lIIllIIIIIllIl[1]);
            this.posX = double1;
            this.lastTickPosX = double1;
            this.prevPosX = double1;
            final double double2 = lllllllllllllIIlIlllIlIIIlIIlIlI.getDoubleAt(Entity.lIIllIIIIIllIl[0]);
            this.posY = double2;
            this.lastTickPosY = double2;
            this.prevPosY = double2;
            final double double3 = lllllllllllllIIlIlllIlIIIlIIlIlI.getDoubleAt(Entity.lIIllIIIIIllIl[4]);
            this.posZ = double3;
            this.lastTickPosZ = double3;
            this.prevPosZ = double3;
            final float float1 = lllllllllllllIIlIlllIlIIIlIIIlll.getFloatAt(Entity.lIIllIIIIIllIl[1]);
            this.rotationYaw = float1;
            this.prevRotationYaw = float1;
            final float float2 = lllllllllllllIIlIlllIlIIIlIIIlll.getFloatAt(Entity.lIIllIIIIIllIl[0]);
            this.rotationPitch = float2;
            this.prevRotationPitch = float2;
            this.setRotationYawHead(this.rotationYaw);
            this.func_181013_g(this.rotationYaw);
            this.fallDistance = lllllllllllllIIlIlllIlIIIlIIlIll.getFloat(Entity.lIIlIllllIIlll[Entity.lIIllIIIIIllIl[37]]);
            this.fire = lllllllllllllIIlIlllIlIIIlIIlIll.getShort(Entity.lIIlIllllIIlll[Entity.lIIllIIIIIllIl[38]]);
            this.setAir(lllllllllllllIIlIlllIlIIIlIIlIll.getShort(Entity.lIIlIllllIIlll[Entity.lIIllIIIIIllIl[39]]));
            this.onGround = lllllllllllllIIlIlllIlIIIlIIlIll.getBoolean(Entity.lIIlIllllIIlll[Entity.lIIllIIIIIllIl[40]]);
            this.dimension = lllllllllllllIIlIlllIlIIIlIIlIll.getInteger(Entity.lIIlIllllIIlll[Entity.lIIllIIIIIllIl[41]]);
            this.invulnerable = lllllllllllllIIlIlllIlIIIlIIlIll.getBoolean(Entity.lIIlIllllIIlll[Entity.lIIllIIIIIllIl[42]]);
            this.timeUntilPortal = lllllllllllllIIlIlllIlIIIlIIlIll.getInteger(Entity.lIIlIllllIIlll[Entity.lIIllIIIIIllIl[43]]);
            if (llIlIlIlIIllIIl(lllllllllllllIIlIlllIlIIIlIIlIll.hasKey(Entity.lIIlIllllIIlll[Entity.lIIllIIIIIllIl[44]], Entity.lIIllIIIIIllIl[5]) ? 1 : 0) && llIlIlIlIIllIIl(lllllllllllllIIlIlllIlIIIlIIlIll.hasKey(Entity.lIIlIllllIIlll[Entity.lIIllIIIIIllIl[45]], Entity.lIIllIIIIIllIl[5]) ? 1 : 0)) {
                this.entityUniqueID = new UUID(lllllllllllllIIlIlllIlIIIlIIlIll.getLong(Entity.lIIlIllllIIlll[Entity.lIIllIIIIIllIl[46]]), lllllllllllllIIlIlllIlIIIlIIlIll.getLong(Entity.lIIlIllllIIlll[Entity.lIIllIIIIIllIl[47]]));
                "".length();
                if (null != null) {
                    return;
                }
            }
            else if (llIlIlIlIIllIIl(lllllllllllllIIlIlllIlIIIlIIlIll.hasKey(Entity.lIIlIllllIIlll[Entity.lIIllIIIIIllIl[48]], Entity.lIIllIIIIIllIl[11]) ? 1 : 0)) {
                this.entityUniqueID = UUID.fromString(lllllllllllllIIlIlllIlIIIlIIlIll.getString(Entity.lIIlIllllIIlll[Entity.lIIllIIIIIllIl[49]]));
            }
            this.setPosition(this.posX, this.posY, this.posZ);
            this.setRotation(this.rotationYaw, this.rotationPitch);
            if (llIlIlIlIIllIIl(lllllllllllllIIlIlllIlIIIlIIlIll.hasKey(Entity.lIIlIllllIIlll[Entity.lIIllIIIIIllIl[50]], Entity.lIIllIIIIIllIl[11]) ? 1 : 0) && llIlIlIlIIlllIl(lllllllllllllIIlIlllIlIIIlIIlIll.getString(Entity.lIIlIllllIIlll[Entity.lIIllIIIIIllIl[51]]).length())) {
                this.setCustomNameTag(lllllllllllllIIlIlllIlIIIlIIlIll.getString(Entity.lIIlIllllIIlll[Entity.lIIllIIIIIllIl[52]]));
            }
            this.setAlwaysRenderNameTag(lllllllllllllIIlIlllIlIIIlIIlIll.getBoolean(Entity.lIIlIllllIIlll[Entity.lIIllIIIIIllIl[53]]));
            this.cmdResultStats.readStatsFromNBT(lllllllllllllIIlIlllIlIIIlIIlIll);
            this.setSilent(lllllllllllllIIlIlllIlIIIlIIlIll.getBoolean(Entity.lIIlIllllIIlll[Entity.lIIllIIIIIllIl[54]]));
            this.readEntityFromNBT(lllllllllllllIIlIlllIlIIIlIIlIll);
            if (llIlIlIlIIllIIl(this.shouldSetPosAfterLoading() ? 1 : 0)) {
                this.setPosition(this.posX, this.posY, this.posZ);
                "".length();
                if ("  ".length() <= " ".length()) {
                    return;
                }
            }
        }
        catch (Throwable lllllllllllllIIlIlllIlIIIlIIIlIl) {
            final CrashReport lllllllllllllIIlIlllIlIIIlIIIIll = CrashReport.makeCrashReport(lllllllllllllIIlIlllIlIIIlIIIlIl, Entity.lIIlIllllIIlll[Entity.lIIllIIIIIllIl[55]]);
            final CrashReportCategory lllllllllllllIIlIlllIlIIIlIIIIlI = lllllllllllllIIlIlllIlIIIlIIIIll.makeCategory(Entity.lIIlIllllIIlll[Entity.lIIllIIIIIllIl[56]]);
            this.addEntityCrashInfo(lllllllllllllIIlIlllIlIIIlIIIIlI);
            throw new ReportedException(lllllllllllllIIlIlllIlIIIlIIIIll);
        }
    }
    
    public void setPositionAndUpdate(final double lllllllllllllIIlIlllIIIIIlllIIIl, final double lllllllllllllIIlIlllIIIIIlllIlll, final double lllllllllllllIIlIlllIIIIIllIllll) {
        this.setLocationAndAngles(lllllllllllllIIlIlllIIIIIlllIIIl, lllllllllllllIIlIlllIIIIIlllIlll, lllllllllllllIIlIlllIIIIIllIllll, this.rotationYaw, this.rotationPitch);
    }
    
    public float getEyeHeight() {
        return this.height * 0.85f;
    }
    
    public void addVelocity(final double lllllllllllllIIlIlllIlIlIllllIII, final double lllllllllllllIIlIlllIlIlIlllIllI, final double lllllllllllllIIlIlllIlIlIlllIIIl) {
        this.motionX += lllllllllllllIIlIlllIlIlIllllIII;
        this.motionY += lllllllllllllIIlIlllIlIlIlllIllI;
        this.motionZ += lllllllllllllIIlIlllIlIlIlllIIIl;
        this.isAirBorne = (Entity.lIIllIIIIIllIl[0] != 0);
    }
    
    public void spawnRunningParticles() {
        if (llIlIlIlIIllIIl(this.isSprinting() ? 1 : 0) && llIlIlIlIlIIIII(this.isInWater() ? 1 : 0)) {
            this.createRunningParticles();
        }
    }
    
    private static int llIlIlIlIllIllI(final float n, final float n2) {
        return fcmpl(n, n2);
    }
    
    public int getMaxFallHeight() {
        return Entity.lIIllIIIIIllIl[3];
    }
    
    protected boolean shouldSetPosAfterLoading() {
        return Entity.lIIllIIIIIllIl[0] != 0;
    }
    
    protected abstract void writeEntityToNBT(final NBTTagCompound p0);
    
    public boolean attackEntityFrom(final DamageSource lllllllllllllIIlIlllIlIlIlIllIll, final float lllllllllllllIIlIlllIlIlIlIlllll) {
        if (llIlIlIlIIllIIl(this.isEntityInvulnerable(lllllllllllllIIlIlllIlIlIlIllIll) ? 1 : 0)) {
            return Entity.lIIllIIIIIllIl[1] != 0;
        }
        this.setBeenAttacked();
        return Entity.lIIllIIIIIllIl[1] != 0;
    }
    
    public int getAir() {
        return this.dataWatcher.getWatchableObjectShort(Entity.lIIllIIIIIllIl[0]);
    }
    
    protected void kill() {
        this.setDead();
    }
    
    protected void setOnFireFromLava() {
        if (llIlIlIlIlIIIII(this.isImmuneToFire ? 1 : 0)) {
            this.attackEntityFrom(DamageSource.lava, 4.0f);
            "".length();
            this.setFire(Entity.lIIllIIIIIllIl[8]);
        }
    }
    
    public void setAir(final int lllllllllllllIIlIlllIIIlllllIIII) {
        this.dataWatcher.updateObject(Entity.lIIllIIIIIllIl[0], (short)lllllllllllllIIlIlllIIIlllllIIII);
    }
    
    public EntityItem entityDropItem(final ItemStack lllllllllllllIIlIlllIIlllIllllII, final float lllllllllllllIIlIlllIIlllIllIlII) {
        if (llIlIlIlIIllIIl(lllllllllllllIIlIlllIIlllIllllII.stackSize) && llIlIlIlIIllIII(lllllllllllllIIlIlllIIlllIllllII.getItem())) {
            final EntityItem lllllllllllllIIlIlllIIlllIlllIIl = new EntityItem(this.worldObj, this.posX, this.posY + lllllllllllllIIlIlllIIlllIllIlII, this.posZ, lllllllllllllIIlIlllIIlllIllllII);
            lllllllllllllIIlIlllIIlllIlllIIl.setDefaultPickupDelay();
            this.worldObj.spawnEntityInWorld(lllllllllllllIIlIlllIIlllIlllIIl);
            "".length();
            return lllllllllllllIIlIlllIIlllIlllIIl;
        }
        return null;
    }
    
    private static int llIlIlIllIIIlII(final double n, final double n2) {
        return dcmpl(n, n2);
    }
    
    private static boolean llIlIlIlIlIIlII(final int lllllllllllllIIlIllIlllIlIllllII) {
        return lllllllllllllIIlIllIlllIlIllllII < 0;
    }
    
    protected abstract void entityInit();
    
    public double getDistanceSq(final BlockPos lllllllllllllIIlIlllIlIllllllIII) {
        return lllllllllllllIIlIlllIlIllllllIII.distanceSq(this.posX, this.posY, this.posZ);
    }
    
    protected abstract void readEntityFromNBT(final NBTTagCompound p0);
    
    public boolean hasCustomName() {
        if (llIlIlIlIIlllIl(this.dataWatcher.getWatchableObjectString(Entity.lIIllIIIIIllIl[4]).length())) {
            return Entity.lIIllIIIIIllIl[0] != 0;
        }
        return Entity.lIIllIIIIIllIl[1] != 0;
    }
    
    public ItemStack[] getInventory() {
        return null;
    }
    
    public Entity(final World lllllllllllllIIlIllllIlIlIlIIIIl) {
        final int nextEntityID = Entity.nextEntityID;
        Entity.nextEntityID = nextEntityID + Entity.lIIllIIIIIllIl[0];
        this.entityId = nextEntityID;
        this.renderDistanceWeight = 1.0;
        this.boundingBox = Entity.ZERO_AABB;
        this.width = 0.6f;
        this.height = 1.8f;
        this.nextStepDistance = Entity.lIIllIIIIIllIl[0];
        this.rand = new Random();
        this.fireResistance = Entity.lIIllIIIIIllIl[0];
        this.firstUpdate = (Entity.lIIllIIIIIllIl[0] != 0);
        this.entityUniqueID = MathHelper.getRandomUuid(this.rand);
        this.cmdResultStats = new CommandResultStats();
        this.worldObj = lllllllllllllIIlIllllIlIlIlIIIIl;
        this.setPosition(0.0, 0.0, 0.0);
        if (llIlIlIlIIllIII(lllllllllllllIIlIllllIlIlIlIIIIl)) {
            this.dimension = lllllllllllllIIlIllllIlIlIlIIIIl.provider.getDimensionId();
        }
        this.dataWatcher = new DataWatcher(this);
        this.dataWatcher.addObject(Entity.lIIllIIIIIllIl[1], (byte)Entity.lIIllIIIIIllIl[1]);
        this.dataWatcher.addObject(Entity.lIIllIIIIIllIl[0], (short)Entity.lIIllIIIIIllIl[2]);
        this.dataWatcher.addObject(Entity.lIIllIIIIIllIl[3], (byte)Entity.lIIllIIIIIllIl[1]);
        this.dataWatcher.addObject(Entity.lIIllIIIIIllIl[4], Entity.lIIlIllllIIlll[Entity.lIIllIIIIIllIl[1]]);
        this.dataWatcher.addObject(Entity.lIIllIIIIIllIl[5], (byte)Entity.lIIllIIIIIllIl[1]);
        this.entityInit();
    }
    
    public float getCollisionBorderSize() {
        return 0.1f;
    }
    
    @Override
    public BlockPos getPosition() {
        return new BlockPos(this.posX, this.posY + 0.5, this.posZ);
    }
    
    private static String llIlIlIIIlIIlll(final String lllllllllllllIIlIllIllllIlIIIIlI, final String lllllllllllllIIlIllIllllIIllllII) {
        try {
            final SecretKeySpec lllllllllllllIIlIllIllllIlIIIlll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIIlIllIllllIIllllII.getBytes(StandardCharsets.UTF_8)), Entity.lIIllIIIIIllIl[11]), "DES");
            final Cipher lllllllllllllIIlIllIllllIlIIIllI = Cipher.getInstance("DES");
            lllllllllllllIIlIllIllllIlIIIllI.init(Entity.lIIllIIIIIllIl[4], lllllllllllllIIlIllIllllIlIIIlll);
            return new String(lllllllllllllIIlIllIllllIlIIIllI.doFinal(Base64.getDecoder().decode(lllllllllllllIIlIllIllllIlIIIIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIlIllIllllIlIIIlII) {
            lllllllllllllIIlIllIllllIlIIIlII.printStackTrace();
            return null;
        }
    }
    
    protected void setRotation(final float lllllllllllllIIlIllllIlIIlIIllIl, final float lllllllllllllIIlIllllIlIIlIlIIII) {
        this.rotationYaw = lllllllllllllIIlIllllIlIIlIIllIl % 360.0f;
        this.rotationPitch = lllllllllllllIIlIllllIlIIlIlIIII % 360.0f;
    }
    
    public void setEating(final boolean lllllllllllllIIlIlllIIlIIIlIIIII) {
        this.setFlag(Entity.lIIllIIIIIllIl[5], lllllllllllllIIlIlllIIlIIIlIIIII);
    }
    
    public EntityItem dropItemWithOffset(final Item lllllllllllllIIlIlllIIllllIIlllI, final int lllllllllllllIIlIlllIIllllIlIIIl, final float lllllllllllllIIlIlllIIllllIlIIII) {
        return this.entityDropItem(new ItemStack(lllllllllllllIIlIlllIIllllIIlllI, lllllllllllllIIlIlllIIllllIlIIIl, Entity.lIIllIIIIIllIl[1]), lllllllllllllIIlIlllIIllllIlIIII);
    }
    
    public void setRotationYawHead(final float lllllllllllllIIlIlllIIIlIllIllll) {
    }
    
    public EntityItem dropItem(final Item lllllllllllllIIlIlllIIlllllIIlll, final int lllllllllllllIIlIlllIIlllllIIIIl) {
        return this.dropItemWithOffset(lllllllllllllIIlIlllIIlllllIIlll, lllllllllllllIIlIlllIIlllllIIIIl, 0.0f);
    }
    
    @Override
    public void setCommandStat(final CommandResultStats.Type lllllllllllllIIlIllIlllllllIlIIl, final int lllllllllllllIIlIllIlllllllIIIll) {
        this.cmdResultStats.func_179672_a(this, lllllllllllllIIlIllIlllllllIlIIl, lllllllllllllIIlIllIlllllllIIIll);
    }
    
    protected boolean canTriggerWalking() {
        return Entity.lIIllIIIIIllIl[0] != 0;
    }
    
    private static boolean llIlIlIlIIlllIl(final int lllllllllllllIIlIllIlllIlIllIIlI) {
        return lllllllllllllIIlIllIlllIlIllIIlI > 0;
    }
    
    public void addEntityCrashInfo(final CrashReportCategory lllllllllllllIIlIlllIIIIllIIlIll) {
        lllllllllllllIIlIlllIIIIllIIlIll.addCrashSectionCallable(Entity.lIIlIllllIIlll[Entity.lIIllIIIIIllIl[65]], new Callable<String>() {
            private static final /* synthetic */ int[] lllIIllIIIlIII;
            private static final /* synthetic */ String[] lllIIllIIIIlll;
            
            private static String lIlIIIIIIIIlIlll(final String llllllllllllIlIllllIIIlIllIlIIll, final String llllllllllllIlIllllIIIlIllIlIIlI) {
                try {
                    final SecretKeySpec llllllllllllIlIllllIIIlIllIllIII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIlIllllIIIlIllIlIIlI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
                    final Cipher llllllllllllIlIllllIIIlIllIlIlll = Cipher.getInstance("Blowfish");
                    llllllllllllIlIllllIIIlIllIlIlll.init(Entity$1.lllIIllIIIlIII[2], llllllllllllIlIllllIIIlIllIllIII);
                    return new String(llllllllllllIlIllllIIIlIllIlIlll.doFinal(Base64.getDecoder().decode(llllllllllllIlIllllIIIlIllIlIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
                }
                catch (Exception llllllllllllIlIllllIIIlIllIlIllI) {
                    llllllllllllIlIllllIIIlIllIlIllI.printStackTrace();
                    return null;
                }
            }
            
            private static void lIlIIIIIIIIllIII() {
                (lllIIllIIIIlll = new String[Entity$1.lllIIllIIIlIII[2]])[Entity$1.lllIIllIIIlIII[0]] = lIlIIIIIIIIlIllI("blA=", "NxZLb");
                Entity$1.lllIIllIIIIlll[Entity$1.lllIIllIIIlIII[1]] = lIlIIIIIIIIlIlll("MRi9avH7m4I=", "DABVO");
            }
            
            @Override
            public String call() throws Exception {
                return String.valueOf(new StringBuilder(String.valueOf(EntityList.getEntityString(Entity.this))).append(Entity$1.lllIIllIIIIlll[Entity$1.lllIIllIIIlIII[0]]).append(Entity.this.getClass().getCanonicalName()).append(Entity$1.lllIIllIIIIlll[Entity$1.lllIIllIIIlIII[1]]));
            }
            
            static {
                lIlIIIIIIIIllIIl();
                lIlIIIIIIIIllIII();
            }
            
            private static void lIlIIIIIIIIllIIl() {
                (lllIIllIIIlIII = new int[3])[0] = ((0xD4 ^ 0xC1) & ~(0x2 ^ 0x17));
                Entity$1.lllIIllIIIlIII[1] = " ".length();
                Entity$1.lllIIllIIIlIII[2] = "  ".length();
            }
            
            private static boolean lIlIIIIIIIIllIlI(final int llllllllllllIlIllllIIIlIlIllIlIl, final int llllllllllllIlIllllIIIlIlIllIlII) {
                return llllllllllllIlIllllIIIlIlIllIlIl < llllllllllllIlIllllIIIlIlIllIlII;
            }
            
            private static String lIlIIIIIIIIlIllI(String llllllllllllIlIllllIIIlIllIIIIII, final String llllllllllllIlIllllIIIlIlIllllll) {
                llllllllllllIlIllllIIIlIllIIIIII = new String(Base64.getDecoder().decode(llllllllllllIlIllllIIIlIllIIIIII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
                final StringBuilder llllllllllllIlIllllIIIlIllIIIIll = new StringBuilder();
                final char[] llllllllllllIlIllllIIIlIllIIIIlI = llllllllllllIlIllllIIIlIlIllllll.toCharArray();
                int llllllllllllIlIllllIIIlIllIIIIIl = Entity$1.lllIIllIIIlIII[0];
                final float llllllllllllIlIllllIIIlIlIlllIll = (Object)llllllllllllIlIllllIIIlIllIIIIII.toCharArray();
                final long llllllllllllIlIllllIIIlIlIlllIlI = llllllllllllIlIllllIIIlIlIlllIll.length;
                long llllllllllllIlIllllIIIlIlIlllIIl = Entity$1.lllIIllIIIlIII[0];
                while (lIlIIIIIIIIllIlI((int)llllllllllllIlIllllIIIlIlIlllIIl, (int)llllllllllllIlIllllIIIlIlIlllIlI)) {
                    final char llllllllllllIlIllllIIIlIllIIIllI = llllllllllllIlIllllIIIlIlIlllIll[llllllllllllIlIllllIIIlIlIlllIIl];
                    llllllllllllIlIllllIIIlIllIIIIll.append((char)(llllllllllllIlIllllIIIlIllIIIllI ^ llllllllllllIlIllllIIIlIllIIIIlI[llllllllllllIlIllllIIIlIllIIIIIl % llllllllllllIlIllllIIIlIllIIIIlI.length]));
                    "".length();
                    ++llllllllllllIlIllllIIIlIllIIIIIl;
                    ++llllllllllllIlIllllIIIlIlIlllIIl;
                    "".length();
                    if ((0x23 ^ 0x27) == 0x0) {
                        return null;
                    }
                }
                return String.valueOf(llllllllllllIlIllllIIIlIllIIIIll);
            }
        });
        lllllllllllllIIlIlllIIIIllIIlIll.addCrashSection(Entity.lIIlIllllIIlll[Entity.lIIllIIIIIllIl[66]], this.entityId);
        lllllllllllllIIlIlllIIIIllIIlIll.addCrashSectionCallable(Entity.lIIlIllllIIlll[Entity.lIIllIIIIIllIl[67]], new Callable<String>() {
            @Override
            public String call() throws Exception {
                return Entity.this.getName();
            }
        });
        final String lllllllllllllIlIllIlIIIIIIlIIlll = Entity.lIIlIllllIIlll[Entity.lIIllIIIIIllIl[68]];
        final String format = Entity.lIIlIllllIIlll[Entity.lIIllIIIIIllIl[69]];
        final Object[] args = new Object[Entity.lIIllIIIIIllIl[3]];
        args[Entity.lIIllIIIIIllIl[1]] = this.posX;
        args[Entity.lIIllIIIIIllIl[0]] = this.posY;
        args[Entity.lIIllIIIIIllIl[4]] = this.posZ;
        lllllllllllllIIlIlllIIIIllIIlIll.addCrashSection(lllllllllllllIlIllIlIIIIIIlIIlll, String.format(format, args));
        lllllllllllllIIlIlllIIIIllIIlIll.addCrashSection(Entity.lIIlIllllIIlll[Entity.lIIllIIIIIllIl[70]], CrashReportCategory.getCoordinateInfo(MathHelper.floor_double(this.posX), MathHelper.floor_double(this.posY), MathHelper.floor_double(this.posZ)));
        final String lllllllllllllIlIllIlIIIIIIlIIlll2 = Entity.lIIlIllllIIlll[Entity.lIIllIIIIIllIl[71]];
        final String format2 = Entity.lIIlIllllIIlll[Entity.lIIllIIIIIllIl[72]];
        final Object[] args2 = new Object[Entity.lIIllIIIIIllIl[3]];
        args2[Entity.lIIllIIIIIllIl[1]] = this.motionX;
        args2[Entity.lIIllIIIIIllIl[0]] = this.motionY;
        args2[Entity.lIIllIIIIIllIl[4]] = this.motionZ;
        lllllllllllllIIlIlllIIIIllIIlIll.addCrashSection(lllllllllllllIlIllIlIIIIIIlIIlll2, String.format(format2, args2));
        lllllllllllllIIlIlllIIIIllIIlIll.addCrashSectionCallable(Entity.lIIlIllllIIlll[Entity.lIIllIIIIIllIl[73]], new Callable<String>() {
            @Override
            public String call() throws Exception {
                return Entity.this.riddenByEntity.toString();
            }
        });
        lllllllllllllIIlIlllIIIIllIIlIll.addCrashSectionCallable(Entity.lIIlIllllIIlll[Entity.lIIllIIIIIllIl[74]], new Callable<String>() {
            @Override
            public String call() throws Exception {
                return Entity.this.ridingEntity.toString();
            }
        });
    }
    
    public boolean hitByEntity(final Entity lllllllllllllIIlIlllIIIlIllIIlll) {
        return Entity.lIIllIIIIIllIl[1] != 0;
    }
    
    public float getBrightness(final float lllllllllllllIIlIlllIllIlIllIIII) {
        final BlockPos lllllllllllllIIlIlllIllIlIlIlllI = new BlockPos(this.posX, this.posY + this.getEyeHeight(), this.posZ);
        float lightBrightness;
        if (llIlIlIlIIllIIl(this.worldObj.isBlockLoaded(lllllllllllllIIlIlllIllIlIlIlllI) ? 1 : 0)) {
            lightBrightness = this.worldObj.getLightBrightness(lllllllllllllIIlIlllIllIlIlIlllI);
            "".length();
            if (-" ".length() == ((0x34 ^ 0x1E) & ~(0xBC ^ 0x96))) {
                return 0.0f;
            }
        }
        else {
            lightBrightness = 0.0f;
        }
        return lightBrightness;
    }
    
    private static boolean llIlIlIlIlIlllI(final Object lllllllllllllIIlIllIlllIllIIllII, final Object lllllllllllllIIlIllIlllIllIIlIll) {
        return lllllllllllllIIlIllIlllIllIIllII == lllllllllllllIIlIllIlllIllIIlIll;
    }
    
    @Override
    public boolean equals(final Object lllllllllllllIIlIllllIlIlIIIIllI) {
        int n;
        if (llIlIlIlIIllIIl((lllllllllllllIIlIllllIlIlIIIIllI instanceof Entity) ? 1 : 0)) {
            if (llIlIlIlIIllIlI(((Entity)lllllllllllllIIlIllllIlIlIIIIllI).entityId, this.entityId)) {
                n = Entity.lIIllIIIIIllIl[0];
                "".length();
                if (((0x19 ^ 0x14) & ~(0xA ^ 0x7)) != 0x0) {
                    return ((0xAF ^ 0x8C) & ~(0x7A ^ 0x59)) != 0x0;
                }
            }
            else {
                n = Entity.lIIllIIIIIllIl[1];
                "".length();
                if (" ".length() < " ".length()) {
                    return ((0x20 ^ 0x19) & ~(0xC ^ 0x35)) != 0x0;
                }
            }
        }
        else {
            n = Entity.lIIllIIIIIllIl[1];
        }
        return n != 0;
    }
    
    public void onKillCommand() {
        this.setDead();
    }
    
    public boolean isSneaking() {
        return this.getFlag(Entity.lIIllIIIIIllIl[0]);
    }
    
    private static String llIlIlIIIlIlllI(String lllllllllllllIIlIllIllllIllIIlII, final String lllllllllllllIIlIllIllllIllIllII) {
        lllllllllllllIIlIllIllllIllIIlII = new String(Base64.getDecoder().decode(lllllllllllllIIlIllIllllIllIIlII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIIlIllIllllIllIlIlI = new StringBuilder();
        final char[] lllllllllllllIIlIllIllllIllIlIII = lllllllllllllIIlIllIllllIllIllII.toCharArray();
        int lllllllllllllIIlIllIllllIllIIllI = Entity.lIIllIIIIIllIl[1];
        final int lllllllllllllIIlIllIllllIlIlllII = (Object)lllllllllllllIIlIllIllllIllIIlII.toCharArray();
        final Exception lllllllllllllIIlIllIllllIlIllIlI = (Exception)lllllllllllllIIlIllIllllIlIlllII.length;
        float lllllllllllllIIlIllIllllIlIllIII = Entity.lIIllIIIIIllIl[1];
        while (llIlIlIlIlIIlIl((int)lllllllllllllIIlIllIllllIlIllIII, (int)lllllllllllllIIlIllIllllIlIllIlI)) {
            final char lllllllllllllIIlIllIllllIlllIIII = lllllllllllllIIlIllIllllIlIlllII[lllllllllllllIIlIllIllllIlIllIII];
            lllllllllllllIIlIllIllllIllIlIlI.append((char)(lllllllllllllIIlIllIllllIlllIIII ^ lllllllllllllIIlIllIllllIllIlIII[lllllllllllllIIlIllIllllIllIIllI % lllllllllllllIIlIllIllllIllIlIII.length]));
            "".length();
            ++lllllllllllllIIlIllIllllIllIIllI;
            ++lllllllllllllIIlIllIllllIlIllIII;
            "".length();
            if ((0x93 ^ 0xA4 ^ (0x5D ^ 0x6F)) <= 0) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIIlIllIllllIllIlIlI);
    }
    
    public void travelToDimension(final int lllllllllllllIIlIlllIIIlIIIIIllI) {
        if (llIlIlIlIlIIIII(this.worldObj.isRemote ? 1 : 0) && llIlIlIlIlIIIII(this.isDead ? 1 : 0)) {
            this.worldObj.theProfiler.startSection(Entity.lIIlIllllIIlll[Entity.lIIllIIIIIllIl[62]]);
            final MinecraftServer lllllllllllllIIlIlllIIIlIIIlIlII = MinecraftServer.getServer();
            final int lllllllllllllIIlIlllIIIlIIIlIIlI = this.dimension;
            final WorldServer lllllllllllllIIlIlllIIIlIIIlIIII = lllllllllllllIIlIlllIIIlIIIlIlII.worldServerForDimension(lllllllllllllIIlIlllIIIlIIIlIIlI);
            WorldServer lllllllllllllIIlIlllIIIlIIIIlllI = lllllllllllllIIlIlllIIIlIIIlIlII.worldServerForDimension(lllllllllllllIIlIlllIIIlIIIIIllI);
            this.dimension = lllllllllllllIIlIlllIIIlIIIIIllI;
            if (llIlIlIlIIllIlI(lllllllllllllIIlIlllIIIlIIIlIIlI, Entity.lIIllIIIIIllIl[0]) && llIlIlIlIIllIlI(lllllllllllllIIlIlllIIIlIIIIIllI, Entity.lIIllIIIIIllIl[0])) {
                lllllllllllllIIlIlllIIIlIIIIlllI = lllllllllllllIIlIlllIIIlIIIlIlII.worldServerForDimension(Entity.lIIllIIIIIllIl[1]);
                this.dimension = Entity.lIIllIIIIIllIl[1];
            }
            this.worldObj.removeEntity(this);
            this.isDead = (Entity.lIIllIIIIIllIl[1] != 0);
            this.worldObj.theProfiler.startSection(Entity.lIIlIllllIIlll[Entity.lIIllIIIIIllIl[63]]);
            lllllllllllllIIlIlllIIIlIIIlIlII.getConfigurationManager().transferEntityToWorld(this, lllllllllllllIIlIlllIIIlIIIlIIlI, lllllllllllllIIlIlllIIIlIIIlIIII, lllllllllllllIIlIlllIIIlIIIIlllI);
            this.worldObj.theProfiler.endStartSection(Entity.lIIlIllllIIlll[Entity.lIIllIIIIIllIl[64]]);
            final Entity lllllllllllllIIlIlllIIIlIIIIllII = EntityList.createEntityByName(EntityList.getEntityString(this), lllllllllllllIIlIlllIIIlIIIIlllI);
            if (llIlIlIlIIllIII(lllllllllllllIIlIlllIIIlIIIIllII)) {
                lllllllllllllIIlIlllIIIlIIIIllII.copyDataFromOld(this);
                if (llIlIlIlIIllIlI(lllllllllllllIIlIlllIIIlIIIlIIlI, Entity.lIIllIIIIIllIl[0]) && llIlIlIlIIllIlI(lllllllllllllIIlIlllIIIlIIIIIllI, Entity.lIIllIIIIIllIl[0])) {
                    final BlockPos lllllllllllllIIlIlllIIIlIIIIlIlI = this.worldObj.getTopSolidOrLiquidBlock(lllllllllllllIIlIlllIIIlIIIIlllI.getSpawnPoint());
                    lllllllllllllIIlIlllIIIlIIIIllII.moveToBlockPosAndAngles(lllllllllllllIIlIlllIIIlIIIIlIlI, lllllllllllllIIlIlllIIIlIIIIllII.rotationYaw, lllllllllllllIIlIlllIIIlIIIIllII.rotationPitch);
                }
                lllllllllllllIIlIlllIIIlIIIIlllI.spawnEntityInWorld(lllllllllllllIIlIlllIIIlIIIIllII);
                "".length();
            }
            this.isDead = (Entity.lIIllIIIIIllIl[0] != 0);
            this.worldObj.theProfiler.endSection();
            lllllllllllllIIlIlllIIIlIIIlIIII.resetUpdateEntityTick();
            lllllllllllllIIlIlllIIIlIIIIlllI.resetUpdateEntityTick();
            this.worldObj.theProfiler.endSection();
        }
    }
    
    protected final String getEntityString() {
        return EntityList.getEntityString(this);
    }
    
    public boolean isInvisible() {
        return this.getFlag(Entity.lIIllIIIIIllIl[9]);
    }
    
    public void setVelocity(final double lllllllllllllIIlIlllIIlIlIIllllI, final double lllllllllllllIIlIlllIIlIlIlIIIll, final double lllllllllllllIIlIlllIIlIlIIllIlI) {
        this.motionX = lllllllllllllIIlIlllIIlIlIIllllI;
        this.motionY = lllllllllllllIIlIlllIIlIlIlIIIll;
        this.motionZ = lllllllllllllIIlIlllIIlIlIIllIlI;
    }
    
    public int getPortalCooldown() {
        return Entity.lIIllIIIIIllIl[2];
    }
    
    public void setInvisible(final boolean lllllllllllllIIlIlllIIlIIIllIIlI) {
        this.setFlag(Entity.lIIllIIIIIllIl[9], lllllllllllllIIlIlllIIlIIIllIIlI);
    }
    
    protected void preparePlayerToSpawn() {
        if (llIlIlIlIIllIII(this.worldObj)) {
            "".length();
            if ((0x10 ^ 0x15) <= 0) {
                return;
            }
            while (llIlIlIlIIlllIl(llIlIlIlIIllIll(this.posY, 0.0)) && !llIlIlIlIIllllI(llIlIlIlIIlllII(this.posY, 256.0))) {
                this.setPosition(this.posX, this.posY, this.posZ);
                if (llIlIlIlIIllIIl(this.worldObj.getCollidingBoundingBoxes(this, this.getEntityBoundingBox()).isEmpty() ? 1 : 0)) {
                    "".length();
                    if (null != null) {
                        return;
                    }
                    break;
                }
                else {
                    ++this.posY;
                }
            }
            final double motionX = 0.0;
            this.motionZ = motionX;
            this.motionY = motionX;
            this.motionX = motionX;
            this.rotationPitch = 0.0f;
        }
    }
    
    public boolean replaceItemInInventory(final int lllllllllllllIIlIlllIIIIIIIllIlI, final ItemStack lllllllllllllIIlIlllIIIIIIIllIII) {
        return Entity.lIIllIIIIIllIl[1] != 0;
    }
    
    public void setPosition(final double lllllllllllllIIlIllllIlIIIllIIIl, final double lllllllllllllIIlIllllIlIIIllIllI, final double lllllllllllllIIlIllllIlIIIlIllIl) {
        this.posX = lllllllllllllIIlIllllIlIIIllIIIl;
        this.posY = lllllllllllllIIlIllllIlIIIllIllI;
        this.posZ = lllllllllllllIIlIllllIlIIIlIllIl;
        final float lllllllllllllIIlIllllIlIIIllIlII = this.width / 2.0f;
        final float lllllllllllllIIlIllllIlIIIllIIll = this.height;
        this.setEntityBoundingBox(new AxisAlignedBB(lllllllllllllIIlIllllIlIIIllIIIl - lllllllllllllIIlIllllIlIIIllIlII, lllllllllllllIIlIllllIlIIIllIllI, lllllllllllllIIlIllllIlIIIlIllIl - lllllllllllllIIlIllllIlIIIllIlII, lllllllllllllIIlIllllIlIIIllIIIl + lllllllllllllIIlIllllIlIIIllIlII, lllllllllllllIIlIllllIlIIIllIllI + lllllllllllllIIlIllllIlIIIllIIll, lllllllllllllIIlIllllIlIIIlIllIl + lllllllllllllIIlIllllIlIIIllIlII));
    }
    
    protected void dealFireDamage(final int lllllllllllllIIlIlllIllllIllIlII) {
        if (llIlIlIlIlIIIII(this.isImmuneToFire ? 1 : 0)) {
            this.attackEntityFrom(DamageSource.inFire, (float)lllllllllllllIIlIlllIllllIllIlII);
            "".length();
        }
    }
    
    private void resetPositionToBB() {
        this.posX = (this.getEntityBoundingBox().minX + this.getEntityBoundingBox().maxX) / 2.0;
        this.posY = this.getEntityBoundingBox().minY;
        this.posZ = (this.getEntityBoundingBox().minZ + this.getEntityBoundingBox().maxZ) / 2.0;
    }
    
    public EnumFacing getHorizontalFacing() {
        return EnumFacing.getHorizontal(MathHelper.floor_double(this.rotationYaw * 4.0f / 360.0f + 0.5) & Entity.lIIllIIIIIllIl[3]);
    }
    
    public MovingObjectPosition rayTrace(final double lllllllllllllIIlIlllIlIIllllIllI, final float lllllllllllllIIlIlllIlIIlllllIll) {
        final Vec3 lllllllllllllIIlIlllIlIIlllllIlI = this.getPositionEyes(lllllllllllllIIlIlllIlIIlllllIll);
        final Vec3 lllllllllllllIIlIlllIlIIlllllIIl = this.getLook(lllllllllllllIIlIlllIlIIlllllIll);
        final Vec3 lllllllllllllIIlIlllIlIIlllllIII = lllllllllllllIIlIlllIlIIlllllIlI.addVector(lllllllllllllIIlIlllIlIIlllllIIl.xCoord * lllllllllllllIIlIlllIlIIllllIllI, lllllllllllllIIlIlllIlIIlllllIIl.yCoord * lllllllllllllIIlIlllIlIIllllIllI, lllllllllllllIIlIlllIlIIlllllIIl.zCoord * lllllllllllllIIlIlllIlIIllllIllI);
        return this.worldObj.rayTraceBlocks(lllllllllllllIIlIlllIlIIlllllIlI, lllllllllllllIIlIlllIlIIlllllIII, (boolean)(Entity.lIIllIIIIIllIl[1] != 0), (boolean)(Entity.lIIllIIIIIllIl[1] != 0), (boolean)(Entity.lIIllIIIIIllIl[0] != 0));
    }
    
    @Override
    public int hashCode() {
        return this.entityId;
    }
    
    protected NBTTagList newFloatNBTList(final float... lllllllllllllIIlIlllIIllllllllIl) {
        final NBTTagList lllllllllllllIIlIlllIIlllllllIll = new NBTTagList();
        final byte lllllllllllllIIlIlllIIllllllIIIl = (Object)lllllllllllllIIlIlllIIllllllllIl;
        final char lllllllllllllIIlIlllIIllllllIIlI = (char)lllllllllllllIIlIlllIIllllllllIl.length;
        short lllllllllllllIIlIlllIIllllllIlII = (short)Entity.lIIllIIIIIllIl[1];
        "".length();
        if (null != null) {
            return null;
        }
        while (!llIlIlIlIlIIIll(lllllllllllllIIlIlllIIllllllIlII, lllllllllllllIIlIlllIIllllllIIlI)) {
            final float lllllllllllllIIlIlllIIlllllllIlI = lllllllllllllIIlIlllIIllllllIIIl[lllllllllllllIIlIlllIIllllllIlII];
            lllllllllllllIIlIlllIIlllllllIll.appendTag(new NBTTagFloat(lllllllllllllIIlIlllIIlllllllIlI));
            ++lllllllllllllIIlIlllIIllllllIlII;
        }
        return lllllllllllllIIlIlllIIlllllllIll;
    }
    
    private static int llIlIlIlIlIlIII(final float n, final float n2) {
        return fcmpl(n, n2);
    }
    
    @Override
    public boolean sendCommandFeedback() {
        return Entity.lIIllIIIIIllIl[1] != 0;
    }
    
    private static boolean llIlIlIlIIllIIl(final int lllllllllllllIIlIllIlllIllIIIlll) {
        return lllllllllllllIIlIllIlllIllIIIlll != 0;
    }
    
    private boolean isLiquidPresentInAABB(final AxisAlignedBB lllllllllllllIIlIllllIIllIIllIlI) {
        if (llIlIlIlIIllIIl(this.worldObj.getCollidingBoundingBoxes(this, lllllllllllllIIlIllllIIllIIllIlI).isEmpty() ? 1 : 0) && llIlIlIlIlIIIII(this.worldObj.isAnyLiquid(lllllllllllllIIlIllllIIllIIllIlI) ? 1 : 0)) {
            return Entity.lIIllIIIIIllIl[0] != 0;
        }
        return Entity.lIIllIIIIIllIl[1] != 0;
    }
    
    public boolean isSpectatedByPlayer(final EntityPlayerMP lllllllllllllIIlIlllIIIIIlIIIlll) {
        return Entity.lIIllIIIIIllIl[0] != 0;
    }
    
    private static int llIlIlIlIlIIlll(final double n, final double n2) {
        return dcmpl(n, n2);
    }
    
    public void setPositionAndRotation2(final double lllllllllllllIIlIlllIIllIIIIIlIl, double lllllllllllllIIlIlllIIllIIIIIlII, final double lllllllllllllIIlIlllIIlIlllIllll, final float lllllllllllllIIlIlllIIllIIIIIIIl, final float lllllllllllllIIlIlllIIlIlllIllII, final int lllllllllllllIIlIlllIIlIllllllIl, final boolean lllllllllllllIIlIlllIIlIllllllII) {
        this.setPosition(lllllllllllllIIlIlllIIllIIIIIlIl, lllllllllllllIIlIlllIIllIIIIIlII, lllllllllllllIIlIlllIIlIlllIllll);
        this.setRotation(lllllllllllllIIlIlllIIllIIIIIIIl, lllllllllllllIIlIlllIIlIlllIllII);
        final List<AxisAlignedBB> lllllllllllllIIlIlllIIlIlllllIll = this.worldObj.getCollidingBoundingBoxes(this, this.getEntityBoundingBox().contract(0.03125, 0.0, 0.03125));
        if (llIlIlIlIlIIIII(lllllllllllllIIlIlllIIlIlllllIll.isEmpty() ? 1 : 0)) {
            double lllllllllllllIIlIlllIIlIlllllIIl = 0.0;
            final double lllllllllllllIIlIlllIIlIlllIIlIl = (double)lllllllllllllIIlIlllIIlIlllllIll.iterator();
            "".length();
            if (-"  ".length() >= 0) {
                return;
            }
            while (!llIlIlIlIlIIIII(((Iterator)lllllllllllllIIlIlllIIlIlllIIlIl).hasNext() ? 1 : 0)) {
                final AxisAlignedBB lllllllllllllIIlIlllIIlIllllIlll = ((Iterator<AxisAlignedBB>)lllllllllllllIIlIlllIIlIlllIIlIl).next();
                if (llIlIlIlIIlllIl(llIlIlIllIIllIl(lllllllllllllIIlIlllIIlIllllIlll.maxY, lllllllllllllIIlIlllIIlIlllllIIl))) {
                    lllllllllllllIIlIlllIIlIlllllIIl = lllllllllllllIIlIlllIIlIllllIlll.maxY;
                }
            }
            lllllllllllllIIlIlllIIllIIIIIlII += lllllllllllllIIlIlllIIlIlllllIIl - this.getEntityBoundingBox().minY;
            this.setPosition(lllllllllllllIIlIlllIIllIIIIIlIl, lllllllllllllIIlIlllIIllIIIIIlII, lllllllllllllIIlIlllIIlIlllIllll);
        }
    }
    
    public boolean isEntityAlive() {
        int n;
        if (llIlIlIlIIllIIl(this.isDead ? 1 : 0)) {
            n = Entity.lIIllIIIIIllIl[1];
            "".length();
            if (null != null) {
                return ("   ".length() & ~"   ".length()) != 0x0;
            }
        }
        else {
            n = Entity.lIIllIIIIIllIl[0];
        }
        return n != 0;
    }
    
    public void func_181015_d(final BlockPos lllllllllllllIIlIlllIIlIlIlllIIl) {
        if (llIlIlIlIIlllIl(this.timeUntilPortal)) {
            this.timeUntilPortal = this.getPortalCooldown();
            "".length();
            if (((0xFF ^ 0xB9) & ~(0xF4 ^ 0xB2)) != ((0x73 ^ 0x40) & ~(0x97 ^ 0xA4))) {
                return;
            }
        }
        else {
            if (llIlIlIlIlIIIII(this.worldObj.isRemote ? 1 : 0) && llIlIlIlIlIIIII(lllllllllllllIIlIlllIIlIlIlllIIl.equals(this.field_181016_an) ? 1 : 0)) {
                this.field_181016_an = lllllllllllllIIlIlllIIlIlIlllIIl;
                final BlockPattern.PatternHelper lllllllllllllIIlIlllIIlIllIIIIlI = Blocks.portal.func_181089_f(this.worldObj, lllllllllllllIIlIlllIIlIlIlllIIl);
                double n;
                if (llIlIlIlIlIlllI(lllllllllllllIIlIlllIIlIllIIIIlI.getFinger().getAxis(), EnumFacing.Axis.X)) {
                    n = lllllllllllllIIlIlllIIlIllIIIIlI.func_181117_a().getZ();
                    "".length();
                    if (((0x55 ^ 0x44 ^ (0x11 ^ 0xF)) & (26 + 149 - 93 + 93 ^ 22 + 17 - 29 + 150 ^ -" ".length())) > 0) {
                        return;
                    }
                }
                else {
                    n = lllllllllllllIIlIlllIIlIllIIIIlI.func_181117_a().getX();
                }
                final double lllllllllllllIIlIlllIIlIllIIIIII = n;
                double n2;
                if (llIlIlIlIlIlllI(lllllllllllllIIlIlllIIlIllIIIIlI.getFinger().getAxis(), EnumFacing.Axis.X)) {
                    n2 = this.posZ;
                    "".length();
                    if (-(0xA8 ^ 0xB5 ^ (0x46 ^ 0x5F)) > 0) {
                        return;
                    }
                }
                else {
                    n2 = this.posX;
                }
                final double n3;
                double lllllllllllllIIlIlllIIlIlIlllllI = n3 = n2;
                int n4;
                if (llIlIlIlIlIlllI(lllllllllllllIIlIlllIIlIllIIIIlI.getFinger().rotateY().getAxisDirection(), EnumFacing.AxisDirection.NEGATIVE)) {
                    n4 = Entity.lIIllIIIIIllIl[0];
                    "".length();
                    if ("  ".length() >= (0x1A ^ 0x38 ^ (0x59 ^ 0x7F))) {
                        return;
                    }
                }
                else {
                    n4 = Entity.lIIllIIIIIllIl[1];
                }
                lllllllllllllIIlIlllIIlIlIlllllI = Math.abs(MathHelper.func_181160_c(n3 - n4, lllllllllllllIIlIlllIIlIllIIIIII, lllllllllllllIIlIlllIIlIllIIIIII - lllllllllllllIIlIlllIIlIllIIIIlI.func_181118_d()));
                final double lllllllllllllIIlIlllIIlIlIllllII = MathHelper.func_181160_c(this.posY - 1.0, lllllllllllllIIlIlllIIlIllIIIIlI.func_181117_a().getY(), lllllllllllllIIlIlllIIlIllIIIIlI.func_181117_a().getY() - lllllllllllllIIlIlllIIlIllIIIIlI.func_181119_e());
                this.field_181017_ao = new Vec3(lllllllllllllIIlIlllIIlIlIlllllI, lllllllllllllIIlIlllIIlIlIllllII, 0.0);
                this.field_181018_ap = lllllllllllllIIlIlllIIlIllIIIIlI.getFinger();
            }
            this.inPortal = (Entity.lIIllIIIIIllIl[0] != 0);
        }
    }
    
    public Vec3 getLookVec() {
        return null;
    }
    
    public boolean interactAt(final EntityPlayer lllllllllllllIIlIllIllllllIIIllI, final Vec3 lllllllllllllIIlIllIllllllIIIlII) {
        return Entity.lIIllIIIIIllIl[1] != 0;
    }
    
    public boolean isOffsetPositionInLiquid(final double lllllllllllllIIlIllllIIllIlIIllI, final double lllllllllllllIIlIllllIIllIlIllII, final double lllllllllllllIIlIllllIIllIlIlIlI) {
        final AxisAlignedBB lllllllllllllIIlIllllIIllIlIlIIl = this.getEntityBoundingBox().offset(lllllllllllllIIlIllllIIllIlIIllI, lllllllllllllIIlIllllIIllIlIllII, lllllllllllllIIlIllllIIllIlIlIlI);
        return this.isLiquidPresentInAABB(lllllllllllllIIlIllllIIllIlIlIIl);
    }
    
    public boolean handleWaterMovement() {
        if (llIlIlIlIIllIIl(this.worldObj.handleMaterialAcceleration(this.getEntityBoundingBox().expand(0.0, -0.4000000059604645, 0.0).contract(0.001, 0.001, 0.001), Material.water, this) ? 1 : 0)) {
            if (llIlIlIlIlIIIII(this.inWater ? 1 : 0) && llIlIlIlIlIIIII(this.firstUpdate ? 1 : 0)) {
                this.resetHeight();
            }
            this.fallDistance = 0.0f;
            this.inWater = (Entity.lIIllIIIIIllIl[0] != 0);
            this.fire = Entity.lIIllIIIIIllIl[1];
            "".length();
            if (-(0xB5 ^ 0xB2 ^ "   ".length()) >= 0) {
                return ((0x63 ^ 0x4D ^ (0x39 ^ 0x2B)) & (16 + 25 + 77 + 12 ^ 126 + 20 - 57 + 101 ^ -" ".length())) != 0x0;
            }
        }
        else {
            this.inWater = (Entity.lIIllIIIIIllIl[1] != 0);
        }
        return this.inWater;
    }
    
    public Entity[] getParts() {
        return null;
    }
    
    public void applyEntityCollision(final Entity lllllllllllllIIlIlllIlIllIIIlIll) {
        if (llIlIlIlIllIIII(lllllllllllllIIlIlllIlIllIIIlIll.riddenByEntity, this) && llIlIlIlIllIIII(lllllllllllllIIlIlllIlIllIIIlIll.ridingEntity, this) && llIlIlIlIlIIIII(lllllllllllllIIlIlllIlIllIIIlIll.noClip ? 1 : 0) && llIlIlIlIlIIIII(this.noClip ? 1 : 0)) {
            double lllllllllllllIIlIlllIlIllIIlIIlI = lllllllllllllIIlIlllIlIllIIIlIll.posX - this.posX;
            double lllllllllllllIIlIlllIlIllIIlIIIl = lllllllllllllIIlIlllIlIllIIIlIll.posZ - this.posZ;
            double lllllllllllllIIlIlllIlIllIIIllll = MathHelper.abs_max(lllllllllllllIIlIlllIlIllIIlIIlI, lllllllllllllIIlIlllIlIllIIlIIIl);
            if (llIlIlIlIIllllI(llIlIlIllIIIlII(lllllllllllllIIlIlllIlIllIIIllll, 0.009999999776482582))) {
                lllllllllllllIIlIlllIlIllIIIllll = MathHelper.sqrt_double(lllllllllllllIIlIlllIlIllIIIllll);
                lllllllllllllIIlIlllIlIllIIlIIlI /= lllllllllllllIIlIlllIlIllIIIllll;
                lllllllllllllIIlIlllIlIllIIlIIIl /= lllllllllllllIIlIlllIlIllIIIllll;
                double lllllllllllllIIlIlllIlIllIIIllIl = 1.0 / lllllllllllllIIlIlllIlIllIIIllll;
                if (llIlIlIlIIlllIl(llIlIlIllIIIlII(lllllllllllllIIlIlllIlIllIIIllIl, 1.0))) {
                    lllllllllllllIIlIlllIlIllIIIllIl = 1.0;
                }
                lllllllllllllIIlIlllIlIllIIlIIlI *= lllllllllllllIIlIlllIlIllIIIllIl;
                lllllllllllllIIlIlllIlIllIIlIIIl *= lllllllllllllIIlIlllIlIllIIIllIl;
                lllllllllllllIIlIlllIlIllIIlIIlI *= 0.05000000074505806;
                lllllllllllllIIlIlllIlIllIIlIIIl *= 0.05000000074505806;
                lllllllllllllIIlIlllIlIllIIlIIlI *= 1.0f - this.entityCollisionReduction;
                lllllllllllllIIlIlllIlIllIIlIIIl *= 1.0f - this.entityCollisionReduction;
                if (llIlIlIlIlIIIlI(this.riddenByEntity)) {
                    this.addVelocity(-lllllllllllllIIlIlllIlIllIIlIIlI, 0.0, -lllllllllllllIIlIlllIlIllIIlIIIl);
                }
                if (llIlIlIlIlIIIlI(lllllllllllllIIlIlllIlIllIIIlIll.riddenByEntity)) {
                    lllllllllllllIIlIlllIlIllIIIlIll.addVelocity(lllllllllllllIIlIlllIlIllIIlIIlI, 0.0, lllllllllllllIIlIlllIlIllIIlIIIl);
                }
            }
        }
    }
    
    private static boolean llIlIlIlIIllIlI(final int lllllllllllllIIlIllIlllIllllIllI, final int lllllllllllllIIlIllIlllIllllIlII) {
        return lllllllllllllIIlIllIlllIllllIllI == lllllllllllllIIlIllIlllIllllIlII;
    }
    
    public boolean isEntityEqual(final Entity lllllllllllllIIlIlllIIIlIllllIIl) {
        if (llIlIlIlIlIlllI(this, lllllllllllllIIlIlllIIIlIllllIIl)) {
            return Entity.lIIllIIIIIllIl[0] != 0;
        }
        return Entity.lIIllIIIIIllIl[1] != 0;
    }
    
    public boolean isEating() {
        return this.getFlag(Entity.lIIllIIIIIllIl[5]);
    }
    
    public void setFire(final int lllllllllllllIIlIllllIIlllIIlllI) {
        int lllllllllllllIIlIllllIIlllIIllII = lllllllllllllIIlIllllIIlllIIlllI * Entity.lIIllIIIIIllIl[7];
        lllllllllllllIIlIllllIIlllIIllII = EnchantmentProtection.getFireTimeForEntity(this, lllllllllllllIIlIllllIIlllIIllII);
        if (llIlIlIlIlIIlIl(this.fire, lllllllllllllIIlIllllIIlllIIllII)) {
            this.fire = lllllllllllllIIlIllllIIlllIIllII;
        }
    }
    
    public double getDistance(final double lllllllllllllIIlIlllIlIlllIllllI, final double lllllllllllllIIlIlllIlIlllIlllIl, final double lllllllllllllIIlIlllIlIlllIlIIII) {
        final double lllllllllllllIIlIlllIlIlllIllIlI = this.posX - lllllllllllllIIlIlllIlIlllIllllI;
        final double lllllllllllllIIlIlllIlIlllIllIIl = this.posY - lllllllllllllIIlIlllIlIlllIlllIl;
        final double lllllllllllllIIlIlllIlIlllIllIII = this.posZ - lllllllllllllIIlIlllIlIlllIlIIII;
        return MathHelper.sqrt_double(lllllllllllllIIlIlllIlIlllIllIlI * lllllllllllllIIlIlllIlIlllIllIlI + lllllllllllllIIlIlllIlIlllIllIIl * lllllllllllllIIlIlllIlIlllIllIIl + lllllllllllllIIlIlllIlIlllIllIII * lllllllllllllIIlIlllIlIlllIllIII);
    }
    
    protected void playStepSound(final BlockPos lllllllllllllIIlIllllIIIIIIllIIl, final Block lllllllllllllIIlIllllIIIIIIllIII) {
        Block.SoundType lllllllllllllIIlIllllIIIIIIlIlll = lllllllllllllIIlIllllIIIIIIllIII.stepSound;
        if (llIlIlIlIlIlllI(this.worldObj.getBlockState(lllllllllllllIIlIllllIIIIIIllIIl.up()).getBlock(), Blocks.snow_layer)) {
            lllllllllllllIIlIllllIIIIIIlIlll = Blocks.snow_layer.stepSound;
            this.playSound(lllllllllllllIIlIllllIIIIIIlIlll.getStepSound(), lllllllllllllIIlIllllIIIIIIlIlll.getVolume() * 0.15f, lllllllllllllIIlIllllIIIIIIlIlll.getFrequency());
            "".length();
            if ("   ".length() < ((138 + 34 - 15 + 36 ^ 6 + 76 - 8 + 60) & (0xB2 ^ 0xAE ^ (0xD6 ^ 0x8D) ^ -" ".length()))) {
                return;
            }
        }
        else if (llIlIlIlIlIIIII(lllllllllllllIIlIllllIIIIIIllIII.getMaterial().isLiquid() ? 1 : 0)) {
            this.playSound(lllllllllllllIIlIllllIIIIIIlIlll.getStepSound(), lllllllllllllIIlIllllIIIIIIlIlll.getVolume() * 0.15f, lllllllllllllIIlIllllIIIIIIlIlll.getFrequency());
        }
    }
    
    private static String llIlIlIIIlIllll(final String lllllllllllllIIlIllIllllIIlIIlII, final String lllllllllllllIIlIllIllllIIlIIIIl) {
        try {
            final SecretKeySpec lllllllllllllIIlIllIllllIIlIlIlI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIIlIllIllllIIlIIIIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lllllllllllllIIlIllIllllIIlIlIII = Cipher.getInstance("Blowfish");
            lllllllllllllIIlIllIllllIIlIlIII.init(Entity.lIIllIIIIIllIl[4], lllllllllllllIIlIllIllllIIlIlIlI);
            return new String(lllllllllllllIIlIllIllllIIlIlIII.doFinal(Base64.getDecoder().decode(lllllllllllllIIlIllIllllIIlIIlII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIlIllIllllIIlIIllI) {
            lllllllllllllIIlIllIllllIIlIIllI.printStackTrace();
            return null;
        }
    }
    
    private static boolean llIlIlIlIllIIII(final Object lllllllllllllIIlIllIlllIllIlIIlI, final Object lllllllllllllIIlIllIlllIllIlIIIl) {
        return lllllllllllllIIlIllIlllIllIlIIlI != lllllllllllllIIlIllIlllIllIlIIIl;
    }
    
    public void updateRidden() {
        if (llIlIlIlIIllIIl(this.ridingEntity.isDead ? 1 : 0)) {
            this.ridingEntity = null;
            "".length();
            if ("   ".length() < 0) {
                return;
            }
        }
        else {
            this.motionX = 0.0;
            this.motionY = 0.0;
            this.motionZ = 0.0;
            this.onUpdate();
            if (llIlIlIlIIllIII(this.ridingEntity)) {
                this.ridingEntity.updateRiderPosition();
                this.entityRiderYawDelta += this.ridingEntity.rotationYaw - this.ridingEntity.prevRotationYaw;
                this.entityRiderPitchDelta += this.ridingEntity.rotationPitch - this.ridingEntity.prevRotationPitch;
                "".length();
                if ((0xC1 ^ 0xA2 ^ (0x72 ^ 0x15)) <= 0) {
                    return;
                }
                while (!llIlIlIlIlIIlII(llIlIlIllIIlIll(this.entityRiderYawDelta, 180.0))) {
                    this.entityRiderYawDelta -= 360.0;
                }
                "".length();
                if (-" ".length() > (0x77 ^ 0x31 ^ (0xF6 ^ 0xB4))) {
                    return;
                }
                while (!llIlIlIlIIllllI(llIlIlIllIIllII(this.entityRiderYawDelta, -180.0))) {
                    this.entityRiderYawDelta += 360.0;
                }
                "".length();
                if (((0x9 ^ 0x48 ^ (0xB3 ^ 0xA3)) & (0xF ^ 0x3E ^ (0x62 ^ 0x2) ^ -" ".length())) != 0x0) {
                    return;
                }
                while (!llIlIlIlIlIIlII(llIlIlIllIIlIll(this.entityRiderPitchDelta, 180.0))) {
                    this.entityRiderPitchDelta -= 360.0;
                }
                "".length();
                if ((0x4E ^ 0x4A) <= 0) {
                    return;
                }
                while (!llIlIlIlIIllllI(llIlIlIllIIllII(this.entityRiderPitchDelta, -180.0))) {
                    this.entityRiderPitchDelta += 360.0;
                }
                double lllllllllllllIIlIlllIIllIlIlllIl = this.entityRiderYawDelta * 0.5;
                double lllllllllllllIIlIlllIIllIlIllIll = this.entityRiderPitchDelta * 0.5;
                final float lllllllllllllIIlIlllIIllIlIllIIl = 10.0f;
                if (llIlIlIlIIlllIl(llIlIlIllIIlIll(lllllllllllllIIlIlllIIllIlIlllIl, lllllllllllllIIlIlllIIllIlIllIIl))) {
                    lllllllllllllIIlIlllIIllIlIlllIl = lllllllllllllIIlIlllIIllIlIllIIl;
                }
                if (llIlIlIlIlIIlII(llIlIlIllIIllII(lllllllllllllIIlIlllIIllIlIlllIl, -lllllllllllllIIlIlllIIllIlIllIIl))) {
                    lllllllllllllIIlIlllIIllIlIlllIl = -lllllllllllllIIlIlllIIllIlIllIIl;
                }
                if (llIlIlIlIIlllIl(llIlIlIllIIlIll(lllllllllllllIIlIlllIIllIlIllIll, lllllllllllllIIlIlllIIllIlIllIIl))) {
                    lllllllllllllIIlIlllIIllIlIllIll = lllllllllllllIIlIlllIIllIlIllIIl;
                }
                if (llIlIlIlIlIIlII(llIlIlIllIIllII(lllllllllllllIIlIlllIIllIlIllIll, -lllllllllllllIIlIlllIIllIlIllIIl))) {
                    lllllllllllllIIlIlllIIllIlIllIll = -lllllllllllllIIlIlllIIllIlIllIIl;
                }
                this.entityRiderYawDelta -= lllllllllllllIIlIlllIIllIlIlllIl;
                this.entityRiderPitchDelta -= lllllllllllllIIlIlllIIllIlIllIll;
            }
        }
    }
    
    public boolean writeMountToNBT(final NBTTagCompound lllllllllllllIIlIlllIlIIlIIlllll) {
        final String lllllllllllllIIlIlllIlIIlIlIIlII = this.getEntityString();
        if (llIlIlIlIlIIIII(this.isDead ? 1 : 0) && llIlIlIlIIllIII(lllllllllllllIIlIlllIlIIlIlIIlII)) {
            lllllllllllllIIlIlllIlIIlIIlllll.setString(Entity.lIIlIllllIIlll[Entity.lIIllIIIIIllIl[16]], lllllllllllllIIlIlllIlIIlIlIIlII);
            this.writeToNBT(lllllllllllllIIlIlllIlIIlIIlllll);
            return Entity.lIIllIIIIIllIl[0] != 0;
        }
        return Entity.lIIllIIIIIllIl[1] != 0;
    }
    
    public boolean isPushedByWater() {
        return Entity.lIIllIIIIIllIl[0] != 0;
    }
    
    @Override
    public Entity getCommandSenderEntity() {
        return this;
    }
    
    private static int llIlIlIllIIIllI(final float n, final float n2) {
        return fcmpl(n, n2);
    }
    
    private static int llIlIlIllIIllII(final double n, final double n2) {
        return dcmpg(n, n2);
    }
    
    private static int llIlIlIlIlIIIIl(final double n, final double n2) {
        return dcmpg(n, n2);
    }
    
    public boolean verifyExplosion(final Explosion lllllllllllllIIlIlllIIIIlllIIllI, final World lllllllllllllIIlIlllIIIIlllIIlII, final BlockPos lllllllllllllIIlIlllIIIIlllIIIll, final IBlockState lllllllllllllIIlIlllIIIIlllIIIlI, final float lllllllllllllIIlIlllIIIIlllIIIIl) {
        return Entity.lIIllIIIIIllIl[0] != 0;
    }
    
    protected boolean getFlag(final int lllllllllllllIIlIlllIIlIIIIlIlIl) {
        if (llIlIlIlIIllIIl(this.dataWatcher.getWatchableObjectByte(Entity.lIIllIIIIIllIl[1]) & Entity.lIIllIIIIIllIl[0] << lllllllllllllIIlIlllIIlIIIIlIlIl)) {
            return Entity.lIIllIIIIIllIl[0] != 0;
        }
        return Entity.lIIllIIIIIllIl[1] != 0;
    }
    
    @Override
    public Vec3 getPositionVector() {
        return new Vec3(this.posX, this.posY, this.posZ);
    }
    
    public void setSilent(final boolean lllllllllllllIIlIlllIllllllIIlIl) {
        final DataWatcher dataWatcher = this.dataWatcher;
        final int llllllllllllIllIlIIlIIlllIIIIlIl = Entity.lIIllIIIIIllIl[5];
        int n;
        if (llIlIlIlIIllIIl(lllllllllllllIIlIlllIllllllIIlIl ? 1 : 0)) {
            n = Entity.lIIllIIIIIllIl[0];
            "".length();
            if (" ".length() == -" ".length()) {
                return;
            }
        }
        else {
            n = Entity.lIIllIIIIIllIl[1];
        }
        dataWatcher.updateObject(llllllllllllIllIlIIlIIlllIIIIlIl, (byte)n);
    }
    
    public boolean interactFirst(final EntityPlayer lllllllllllllIIlIlllIIllIlllllIl) {
        return Entity.lIIllIIIIIllIl[1] != 0;
    }
    
    public void setEntityId(final int lllllllllllllIIlIllllIlIlIllIlII) {
        this.entityId = lllllllllllllIIlIllllIlIlIllIlII;
    }
    
    public void func_181013_g(final float lllllllllllllIIlIlllIIIlIllIllII) {
    }
    
    protected void resetHeight() {
        float lllllllllllllIIlIlllIlllIllIllIl = MathHelper.sqrt_double(this.motionX * this.motionX * 0.20000000298023224 + this.motionY * this.motionY + this.motionZ * this.motionZ * 0.20000000298023224) * 0.2f;
        if (llIlIlIlIIlllIl(llIlIlIlIlllIIl(lllllllllllllIIlIlllIlllIllIllIl, 1.0f))) {
            lllllllllllllIIlIlllIlllIllIllIl = 1.0f;
        }
        this.playSound(this.getSplashSound(), lllllllllllllIIlIlllIlllIllIllIl, 1.0f + (this.rand.nextFloat() - this.rand.nextFloat()) * 0.4f);
        final float lllllllllllllIIlIlllIlllIllIllII = (float)MathHelper.floor_double(this.getEntityBoundingBox().minY);
        int lllllllllllllIIlIlllIlllIllIlIll = Entity.lIIllIIIIIllIl[1];
        "".length();
        if (-"   ".length() >= 0) {
            return;
        }
        while (!llIlIlIlIIllllI(llIlIlIlIlllIlI((float)lllllllllllllIIlIlllIlllIllIlIll, 1.0f + this.width * 20.0f))) {
            final float lllllllllllllIIlIlllIlllIllIlIIl = (this.rand.nextFloat() * 2.0f - 1.0f) * this.width;
            final float lllllllllllllIIlIlllIlllIllIIlll = (this.rand.nextFloat() * 2.0f - 1.0f) * this.width;
            this.worldObj.spawnParticle(EnumParticleTypes.WATER_BUBBLE, this.posX + lllllllllllllIIlIlllIlllIllIlIIl, lllllllllllllIIlIlllIlllIllIllII + 1.0f, this.posZ + lllllllllllllIIlIlllIlllIllIIlll, this.motionX, this.motionY - this.rand.nextFloat() * 0.2f, this.motionZ, new int[Entity.lIIllIIIIIllIl[1]]);
            ++lllllllllllllIIlIlllIlllIllIlIll;
        }
        int lllllllllllllIIlIlllIlllIllIIlIl = Entity.lIIllIIIIIllIl[1];
        "".length();
        if (" ".length() <= -" ".length()) {
            return;
        }
        while (!llIlIlIlIIllllI(llIlIlIlIlllIlI((float)lllllllllllllIIlIlllIlllIllIIlIl, 1.0f + this.width * 20.0f))) {
            final float lllllllllllllIIlIlllIlllIllIIlII = (this.rand.nextFloat() * 2.0f - 1.0f) * this.width;
            final float lllllllllllllIIlIlllIlllIllIIIlI = (this.rand.nextFloat() * 2.0f - 1.0f) * this.width;
            this.worldObj.spawnParticle(EnumParticleTypes.WATER_SPLASH, this.posX + lllllllllllllIIlIlllIlllIllIIlII, lllllllllllllIIlIlllIlllIllIllII + 1.0f, this.posZ + lllllllllllllIIlIlllIlllIllIIIlI, this.motionX, this.motionY, this.motionZ, new int[Entity.lIIllIIIIIllIl[1]]);
            ++lllllllllllllIIlIlllIlllIllIIlIl;
        }
    }
    
    private static int llIlIlIlIllIlll(final double n, final double n2) {
        return dcmpg(n, n2);
    }
    
    protected void setBeenAttacked() {
        this.velocityChanged = (Entity.lIIllIIIIIllIl[0] != 0);
    }
    
    public float getDistanceToEntity(final Entity lllllllllllllIIlIlllIllIIIllIlIl) {
        final float lllllllllllllIIlIlllIllIIIllIlII = (float)(this.posX - lllllllllllllIIlIlllIllIIIllIlIl.posX);
        final float lllllllllllllIIlIlllIllIIIllIIlI = (float)(this.posY - lllllllllllllIIlIlllIllIIIllIlIl.posY);
        final float lllllllllllllIIlIlllIllIIIllIIII = (float)(this.posZ - lllllllllllllIIlIlllIllIIIllIlIl.posZ);
        return MathHelper.sqrt_float(lllllllllllllIIlIlllIllIIIllIlII * lllllllllllllIIlIlllIllIIIllIlII + lllllllllllllIIlIlllIllIIIllIIlI * lllllllllllllIIlIlllIllIIIllIIlI + lllllllllllllIIlIlllIllIIIllIIII * lllllllllllllIIlIlllIllIIIllIIII);
    }
    
    public void setSneaking(final boolean lllllllllllllIIlIlllIIlIIllIIlIl) {
        this.setFlag(Entity.lIIllIIIIIllIl[0], lllllllllllllIIlIlllIIlIIllIIlIl);
    }
    
    private static int llIlIlIllIIlIIl(final double n, final double n2) {
        return dcmpl(n, n2);
    }
    
    public boolean isWet() {
        if (llIlIlIlIlIIIII(this.inWater ? 1 : 0) && llIlIlIlIlIIIII(this.worldObj.canLightningStrike(new BlockPos(this.posX, this.posY, this.posZ)) ? 1 : 0) && llIlIlIlIlIIIII(this.worldObj.canLightningStrike(new BlockPos(this.posX, this.posY + this.height, this.posZ)) ? 1 : 0)) {
            return Entity.lIIllIIIIIllIl[1] != 0;
        }
        return Entity.lIIllIIIIIllIl[0] != 0;
    }
    
    public void setAngles(final float lllllllllllllIIlIllllIlIIIIlIlll, final float lllllllllllllIIlIllllIlIIIIlIllI) {
        final float lllllllllllllIIlIllllIlIIIIlIlII = this.rotationPitch;
        final float lllllllllllllIIlIllllIlIIIIlIIll = this.rotationYaw;
        this.rotationYaw += (float)(lllllllllllllIIlIllllIlIIIIlIlll * 0.15);
        this.rotationPitch -= (float)(lllllllllllllIIlIllllIlIIIIlIllI * 0.15);
        this.rotationPitch = MathHelper.clamp_float(this.rotationPitch, -90.0f, 90.0f);
        this.prevRotationPitch += this.rotationPitch - lllllllllllllIIlIllllIlIIIIlIlII;
        this.prevRotationYaw += this.rotationYaw - lllllllllllllIIlIllllIlIIIIlIIll;
    }
    
    public void playSound(final String lllllllllllllIIlIlllIllllllllIIl, final float lllllllllllllIIlIlllIllllllllllI, final float lllllllllllllIIlIlllIlllllllllII) {
        if (llIlIlIlIlIIIII(this.isSilent() ? 1 : 0)) {
            this.worldObj.playSoundAtEntity(this, lllllllllllllIIlIlllIllllllllIIl, lllllllllllllIIlIlllIllllllllllI, lllllllllllllIIlIlllIlllllllllII);
        }
    }
    
    private static boolean llIlIlIlIlIIIlI(final Object lllllllllllllIIlIllIlllIllIIlIIl) {
        return lllllllllllllIIlIllIlllIllIIlIIl == null;
    }
    
    public void func_174817_o(final Entity lllllllllllllIIlIllIllllllIlIIIl) {
        this.cmdResultStats.func_179671_a(lllllllllllllIIlIllIllllllIlIIIl.getCommandStats());
    }
    
    private static int llIlIlIllIIllll(final double n, final double n2) {
        return dcmpg(n, n2);
    }
    
    private static boolean llIlIlIlIllIlII(final int lllllllllllllIIlIllIlllIllIllIIl, final int lllllllllllllIIlIllIlllIllIlIlll) {
        return lllllllllllllIIlIllIlllIllIllIIl > lllllllllllllIIlIllIlllIllIlIlll;
    }
}
