// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.entity;

import net.minecraft.util.Vec3i;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import net.minecraft.pathfinding.PathNavigateGround;
import net.minecraft.entity.passive.EntityTameable;
import net.minecraft.entity.ai.EntityAIMoveTowardsRestriction;
import net.minecraft.world.World;
import java.util.UUID;
import net.minecraft.entity.ai.EntityAIBase;
import net.minecraft.util.BlockPos;
import net.minecraft.entity.ai.attributes.AttributeModifier;

public abstract class EntityCreature extends EntityLiving
{
    private /* synthetic */ BlockPos homePosition;
    private /* synthetic */ float maximumHomeDistance;
    private static final /* synthetic */ int[] llIIIlIlIllIlI;
    private /* synthetic */ EntityAIBase aiBase;
    private /* synthetic */ boolean isMovementAITaskSet;
    public static final /* synthetic */ UUID FLEEING_SPEED_MODIFIER_UUID;
    private static final /* synthetic */ String[] llIIIlIlIllIIl;
    
    private static boolean lIIIlIIlIlllIIIl(final int llllllllllllIlllIlIllIIllIlIIIIl) {
        return llllllllllllIlllIlIllIIllIlIIIIl < 0;
    }
    
    @Override
    public boolean getCanSpawnHere() {
        if (lIIIlIIlIllIllII(super.getCanSpawnHere() ? 1 : 0) && lIIIlIIlIllIllIl(lIIIlIIlIllIlIll(this.getBlockPathWeight(new BlockPos(this.posX, this.getEntityBoundingBox().minY, this.posZ)), 0.0f))) {
            return EntityCreature.llIIIlIlIllIlI[1] != 0;
        }
        return EntityCreature.llIIIlIlIllIlI[0] != 0;
    }
    
    private static boolean lIIIlIIlIllIllIl(final int llllllllllllIlllIlIllIIllIlIIIll) {
        return llllllllllllIlllIlIllIIllIlIIIll >= 0;
    }
    
    public BlockPos getHomePosition() {
        return this.homePosition;
    }
    
    public boolean hasPath() {
        int n;
        if (lIIIlIIlIllIllII(this.navigator.noPath() ? 1 : 0)) {
            n = EntityCreature.llIIIlIlIllIlI[0];
            "".length();
            if (((0xEB ^ 0xC6 ^ (0x69 ^ 0x10)) & (73 + 119 - 63 + 109 ^ 132 + 25 - 20 + 49 ^ -" ".length())) != 0x0) {
                return ((31 + 35 + 36 + 75 ^ 102 + 86 - 103 + 50) & (0xF0 ^ 0xB4 ^ (0xC3 ^ 0xB1) ^ -" ".length())) != 0x0;
            }
        }
        else {
            n = EntityCreature.llIIIlIlIllIlI[1];
        }
        return n != 0;
    }
    
    public EntityCreature(final World llllllllllllIlllIlIllIIllllllIII) {
        super(llllllllllllIlllIlIllIIllllllIII);
        this.homePosition = BlockPos.ORIGIN;
        this.maximumHomeDistance = -1.0f;
        this.aiBase = new EntityAIMoveTowardsRestriction(this, 1.0);
    }
    
    private static void lIIIlIIlIllIlIlI() {
        (llIIIlIlIllIlI = new int[5])[0] = ((0x2C ^ 0x31) & ~(0x48 ^ 0x55));
        EntityCreature.llIIIlIlIllIlI[1] = " ".length();
        EntityCreature.llIIIlIlIllIlI[2] = "  ".length();
        EntityCreature.llIIIlIlIllIlI[3] = (0x7 ^ 0x2);
        EntityCreature.llIIIlIlIllIlI[4] = (0x1 ^ 0x9);
    }
    
    private static int lIIIlIIlIlllIIll(final float n, final float n2) {
        return fcmpl(n, n2);
    }
    
    private static boolean lIIIlIIlIllIllII(final int llllllllllllIlllIlIllIIllIlIIlll) {
        return llllllllllllIlllIlIllIIllIlIIlll != 0;
    }
    
    public boolean hasHome() {
        if (lIIIlIIlIllIllII(lIIIlIIlIlllIIlI(this.maximumHomeDistance, -1.0f))) {
            return EntityCreature.llIIIlIlIllIlI[1] != 0;
        }
        return EntityCreature.llIIIlIlIllIlI[0] != 0;
    }
    
    public float getMaximumHomeDistance() {
        return this.maximumHomeDistance;
    }
    
    private static boolean lIIIlIIlIlllIlIl(final Object llllllllllllIlllIlIllIIllIlIlIlI, final Object llllllllllllIlllIlIllIIllIlIlIIl) {
        return llllllllllllIlllIlIllIIllIlIlIlI == llllllllllllIlllIlIllIIllIlIlIIl;
    }
    
    private static void lIIIlIIlIllIlIIl() {
        (llIIIlIlIllIIl = new String[EntityCreature.llIIIlIlIllIlI[2]])[EntityCreature.llIIIlIlIllIlI[0]] = lIIIlIIlIllIlIII("0hChivON+DbaBOTtLr96R6/7YTrh4v7yVbuqf5ZQHWcNNiaGvfQO/Q==", "fFHUX");
        EntityCreature.llIIIlIlIllIIl[EntityCreature.llIIIlIlIllIlI[1]] = lIIIlIIlIllIlIII("6Wiuaif34t/YLQ1ofy9ynwwdbx3hV/MG", "IXKLr");
    }
    
    private static int lIIIlIIlIlllIIlI(final float n, final float n2) {
        return fcmpl(n, n2);
    }
    
    public void setHomePosAndDistance(final BlockPos llllllllllllIlllIlIllIIllllIIIII, final int llllllllllllIlllIlIllIIlllIlllII) {
        this.homePosition = llllllllllllIlllIlIllIIllllIIIII;
        this.maximumHomeDistance = (float)llllllllllllIlllIlIllIIlllIlllII;
    }
    
    public void detachHome() {
        this.maximumHomeDistance = -1.0f;
    }
    
    @Override
    protected void updateLeashedState() {
        super.updateLeashedState();
        if (lIIIlIIlIllIllII(this.getLeashed() ? 1 : 0) && lIIIlIIlIlllIlII(this.getLeashedToEntity()) && lIIIlIIlIlllIlIl(this.getLeashedToEntity().worldObj, this.worldObj)) {
            final Entity llllllllllllIlllIlIllIIlllIIlIII = this.getLeashedToEntity();
            this.setHomePosAndDistance(new BlockPos((int)llllllllllllIlllIlIllIIlllIIlIII.posX, (int)llllllllllllIlllIlIllIIlllIIlIII.posY, (int)llllllllllllIlllIlIllIIlllIIlIII.posZ), EntityCreature.llIIIlIlIllIlI[3]);
            final float llllllllllllIlllIlIllIIlllIIIlll = this.getDistanceToEntity(llllllllllllIlllIlIllIIlllIIlIII);
            if (lIIIlIIlIllIllII((this instanceof EntityTameable) ? 1 : 0) && lIIIlIIlIllIllII(((EntityTameable)this).isSitting() ? 1 : 0)) {
                if (lIIIlIIlIlllIllI(lIIIlIIlIlllIIll(llllllllllllIlllIlIllIIlllIIIlll, 10.0f))) {
                    this.clearLeashed((boolean)(EntityCreature.llIIIlIlIllIlI[1] != 0), (boolean)(EntityCreature.llIIIlIlIllIlI[1] != 0));
                }
                return;
            }
            if (lIIIlIIlIlllIIII(this.isMovementAITaskSet ? 1 : 0)) {
                this.tasks.addTask(EntityCreature.llIIIlIlIllIlI[2], this.aiBase);
                if (lIIIlIIlIllIllII((this.getNavigator() instanceof PathNavigateGround) ? 1 : 0)) {
                    ((PathNavigateGround)this.getNavigator()).setAvoidsWater((boolean)(EntityCreature.llIIIlIlIllIlI[0] != 0));
                }
                this.isMovementAITaskSet = (EntityCreature.llIIIlIlIllIlI[1] != 0);
            }
            this.func_142017_o(llllllllllllIlllIlIllIIlllIIIlll);
            if (lIIIlIIlIlllIllI(lIIIlIIlIlllIIll(llllllllllllIlllIlIllIIlllIIIlll, 4.0f))) {
                this.getNavigator().tryMoveToEntityLiving(llllllllllllIlllIlIllIIlllIIlIII, 1.0);
                "".length();
            }
            if (lIIIlIIlIlllIllI(lIIIlIIlIlllIIll(llllllllllllIlllIlIllIIlllIIIlll, 6.0f))) {
                final double llllllllllllIlllIlIllIIlllIIIllI = (llllllllllllIlllIlIllIIlllIIlIII.posX - this.posX) / llllllllllllIlllIlIllIIlllIIIlll;
                final double llllllllllllIlllIlIllIIlllIIIlIl = (llllllllllllIlllIlIllIIlllIIlIII.posY - this.posY) / llllllllllllIlllIlIllIIlllIIIlll;
                final double llllllllllllIlllIlIllIIlllIIIlII = (llllllllllllIlllIlIllIIlllIIlIII.posZ - this.posZ) / llllllllllllIlllIlIllIIlllIIIlll;
                this.motionX += llllllllllllIlllIlIllIIlllIIIllI * Math.abs(llllllllllllIlllIlIllIIlllIIIllI) * 0.4;
                this.motionY += llllllllllllIlllIlIllIIlllIIIlIl * Math.abs(llllllllllllIlllIlIllIIlllIIIlIl) * 0.4;
                this.motionZ += llllllllllllIlllIlIllIIlllIIIlII * Math.abs(llllllllllllIlllIlIllIIlllIIIlII) * 0.4;
            }
            if (lIIIlIIlIlllIllI(lIIIlIIlIlllIIll(llllllllllllIlllIlIllIIlllIIIlll, 10.0f))) {
                this.clearLeashed((boolean)(EntityCreature.llIIIlIlIllIlI[1] != 0), (boolean)(EntityCreature.llIIIlIlIllIlI[1] != 0));
                "".length();
                if (((0x48 ^ 0x72 ^ (0x86 ^ 0xA1)) & (41 + 80 - 81 + 133 ^ 56 + 156 - 177 + 141 ^ -" ".length())) != 0x0) {
                    return;
                }
            }
        }
        else if (lIIIlIIlIlllIIII(this.getLeashed() ? 1 : 0) && lIIIlIIlIllIllII(this.isMovementAITaskSet ? 1 : 0)) {
            this.isMovementAITaskSet = (EntityCreature.llIIIlIlIllIlI[0] != 0);
            this.tasks.removeTask(this.aiBase);
            if (lIIIlIIlIllIllII((this.getNavigator() instanceof PathNavigateGround) ? 1 : 0)) {
                ((PathNavigateGround)this.getNavigator()).setAvoidsWater((boolean)(EntityCreature.llIIIlIlIllIlI[1] != 0));
            }
            this.detachHome();
        }
    }
    
    public float getBlockPathWeight(final BlockPos llllllllllllIlllIlIllIIlllllIlII) {
        return 0.0f;
    }
    
    private static int lIIIlIIlIllIlllI(final float n, final float n2) {
        return fcmpl(n, n2);
    }
    
    public boolean isWithinHomeDistanceCurrentPosition() {
        return this.isWithinHomeDistanceFromPosition(new BlockPos(this));
    }
    
    private static String lIIIlIIlIllIlIII(final String llllllllllllIlllIlIllIIllIllIlII, final String llllllllllllIlllIlIllIIllIllIIIl) {
        try {
            final SecretKeySpec llllllllllllIlllIlIllIIllIllIlll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIlllIlIllIIllIllIIIl.getBytes(StandardCharsets.UTF_8)), EntityCreature.llIIIlIlIllIlI[4]), "DES");
            final Cipher llllllllllllIlllIlIllIIllIllIllI = Cipher.getInstance("DES");
            llllllllllllIlllIlIllIIllIllIllI.init(EntityCreature.llIIIlIlIllIlI[2], llllllllllllIlllIlIllIIllIllIlll);
            return new String(llllllllllllIlllIlIllIIllIllIllI.doFinal(Base64.getDecoder().decode(llllllllllllIlllIlIllIIllIllIlII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIlllIlIllIIllIllIlIl) {
            llllllllllllIlllIlIllIIllIllIlIl.printStackTrace();
            return null;
        }
    }
    
    protected void func_142017_o(final float llllllllllllIlllIlIllIIllIllllII) {
    }
    
    private static int lIIIlIIlIllIlIll(final float n, final float n2) {
        return fcmpl(n, n2);
    }
    
    static {
        lIIIlIIlIllIlIlI();
        lIIIlIIlIllIlIIl();
        FLEEING_SPEED_MODIFIER_UUID = UUID.fromString(EntityCreature.llIIIlIlIllIIl[EntityCreature.llIIIlIlIllIlI[0]]);
        FLEEING_SPEED_MODIFIER = new AttributeModifier(EntityCreature.FLEEING_SPEED_MODIFIER_UUID, EntityCreature.llIIIlIlIllIIl[EntityCreature.llIIIlIlIllIlI[1]], 2.0, EntityCreature.llIIIlIlIllIlI[2]).setSaved((boolean)(EntityCreature.llIIIlIlIllIlI[0] != 0));
    }
    
    private static boolean lIIIlIIlIlllIlII(final Object llllllllllllIlllIlIllIIllIlIllIl) {
        return llllllllllllIlllIlIllIIllIlIllIl != null;
    }
    
    public boolean isWithinHomeDistanceFromPosition(final BlockPos llllllllllllIlllIlIllIIllllIIlIl) {
        int n;
        if (lIIIlIIlIlllIIII(lIIIlIIlIllIlllI(this.maximumHomeDistance, -1.0f))) {
            n = EntityCreature.llIIIlIlIllIlI[1];
            "".length();
            if ("  ".length() <= -" ".length()) {
                return ((93 + 97 - 66 + 12 ^ 141 + 115 - 229 + 129) & ("   ".length() ^ (0x38 ^ 0x2F) ^ -" ".length())) != 0x0;
            }
        }
        else if (lIIIlIIlIlllIIIl(lIIIlIIlIllIllll(this.homePosition.distanceSq(llllllllllllIlllIlIllIIllllIIlIl), this.maximumHomeDistance * this.maximumHomeDistance))) {
            n = EntityCreature.llIIIlIlIllIlI[1];
            "".length();
            if ("  ".length() <= 0) {
                return ((0xA6 ^ 0x86) & ~(0x72 ^ 0x52)) != 0x0;
            }
        }
        else {
            n = EntityCreature.llIIIlIlIllIlI[0];
        }
        return n != 0;
    }
    
    private static int lIIIlIIlIllIllll(final double n, final double n2) {
        return dcmpg(n, n2);
    }
    
    private static boolean lIIIlIIlIlllIllI(final int llllllllllllIlllIlIllIIllIIlllll) {
        return llllllllllllIlllIlIllIIllIIlllll > 0;
    }
    
    private static boolean lIIIlIIlIlllIIII(final int llllllllllllIlllIlIllIIllIlIIlIl) {
        return llllllllllllIlllIlIllIIllIlIIlIl == 0;
    }
}
