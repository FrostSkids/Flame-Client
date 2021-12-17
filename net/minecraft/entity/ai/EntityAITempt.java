// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.entity.ai;

import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.Entity;
import net.minecraft.pathfinding.PathNavigateGround;
import net.minecraft.item.Item;
import net.minecraft.entity.EntityCreature;
import net.minecraft.entity.player.EntityPlayer;

public class EntityAITempt extends EntityAIBase
{
    private static final /* synthetic */ String[] lIlIIlIllIIlII;
    private /* synthetic */ double targetY;
    private /* synthetic */ double pitch;
    private /* synthetic */ EntityPlayer temptingPlayer;
    private /* synthetic */ boolean isRunning;
    private /* synthetic */ boolean avoidWater;
    private /* synthetic */ double targetX;
    private /* synthetic */ boolean scaredByPlayerMovement;
    private /* synthetic */ EntityCreature temptedEntity;
    private /* synthetic */ double yaw;
    private static final /* synthetic */ int[] lIlIIlIllIlIII;
    private /* synthetic */ double speed;
    private /* synthetic */ Item temptItem;
    private /* synthetic */ int delayTemptCounter;
    private /* synthetic */ double targetZ;
    
    @Override
    public void resetTask() {
        this.temptingPlayer = null;
        this.temptedEntity.getNavigator().clearPathEntity();
        this.delayTemptCounter = EntityAITempt.lIlIIlIllIlIII[3];
        this.isRunning = (EntityAITempt.lIlIIlIllIlIII[1] != 0);
        ((PathNavigateGround)this.temptedEntity.getNavigator()).setAvoidsWater(this.avoidWater);
    }
    
    private static boolean lllIIllIlIIllIl(final Object lllllllllllllIIIllIllIIIIlIlllII, final Object lllllllllllllIIIllIllIIIIlIllIll) {
        return lllllllllllllIIIllIllIIIIlIlllII == lllllllllllllIIIllIllIIIIlIllIll;
    }
    
    @Override
    public boolean shouldExecute() {
        if (lllIIllIlIIlIll(this.delayTemptCounter)) {
            this.delayTemptCounter -= EntityAITempt.lIlIIlIllIlIII[2];
            return EntityAITempt.lIlIIlIllIlIII[1] != 0;
        }
        this.temptingPlayer = this.temptedEntity.worldObj.getClosestPlayerToEntity(this.temptedEntity, 10.0);
        if (lllIIllIlIIllII(this.temptingPlayer)) {
            return EntityAITempt.lIlIIlIllIlIII[1] != 0;
        }
        final ItemStack lllllllllllllIIIllIllIIIIlllllIl = this.temptingPlayer.getCurrentEquippedItem();
        int n;
        if (lllIIllIlIIllII(lllllllllllllIIIllIllIIIIlllllIl)) {
            n = EntityAITempt.lIlIIlIllIlIII[1];
            "".length();
            if ((101 + 33 - 21 + 53 ^ 92 + 123 - 93 + 40) == 0x0) {
                return ((18 + 50 - 15 + 91 ^ 105 + 4 - 13 + 58) & (0x77 ^ 0x4A ^ (0xAE ^ 0x99) ^ -" ".length())) != 0x0;
            }
        }
        else if (lllIIllIlIIllIl(lllllllllllllIIIllIllIIIIlllllIl.getItem(), this.temptItem)) {
            n = EntityAITempt.lIlIIlIllIlIII[2];
            "".length();
            if ((0x80 ^ 0x84) <= 0) {
                return ((0xBD ^ 0x84) & ~(0x2D ^ 0x14)) != 0x0;
            }
        }
        else {
            n = EntityAITempt.lIlIIlIllIlIII[1];
        }
        return n != 0;
    }
    
    private static boolean lllIIllIlIlIIIl(final int lllllllllllllIIIllIllIIIIlIlIIll) {
        return lllllllllllllIIIllIllIIIIlIlIIll < 0;
    }
    
    private static String lllIIllIlIIIIll(final String lllllllllllllIIIllIllIIIIllIIlII, final String lllllllllllllIIIllIllIIIIllIIIIl) {
        try {
            final SecretKeySpec lllllllllllllIIIllIllIIIIllIIlll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIIIllIllIIIIllIIIIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lllllllllllllIIIllIllIIIIllIIllI = Cipher.getInstance("Blowfish");
            lllllllllllllIIIllIllIIIIllIIllI.init(EntityAITempt.lIlIIlIllIlIII[4], lllllllllllllIIIllIllIIIIllIIlll);
            return new String(lllllllllllllIIIllIllIIIIllIIllI.doFinal(Base64.getDecoder().decode(lllllllllllllIIIllIllIIIIllIIlII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIIllIllIIIIllIIlIl) {
            lllllllllllllIIIllIllIIIIllIIlIl.printStackTrace();
            return null;
        }
    }
    
    private static boolean lllIIllIlIlIIII(final int lllllllllllllIIIllIllIIIIlIlIlll) {
        return lllllllllllllIIIllIllIIIIlIlIlll != 0;
    }
    
    public boolean isRunning() {
        return this.isRunning;
    }
    
    @Override
    public void updateTask() {
        this.temptedEntity.getLookHelper().setLookPositionWithEntity(this.temptingPlayer, 30.0f, (float)this.temptedEntity.getVerticalFaceSpeed());
        if (lllIIllIlIlIIIl(lllIIllIlIlIIll(this.temptedEntity.getDistanceSqToEntity(this.temptingPlayer), 6.25))) {
            this.temptedEntity.getNavigator().clearPathEntity();
            "".length();
            if ("   ".length() <= 0) {
                return;
            }
        }
        else {
            this.temptedEntity.getNavigator().tryMoveToEntityLiving(this.temptingPlayer, this.speed);
            "".length();
        }
    }
    
    static {
        lllIIllIlIIlIIl();
        lllIIllIlIIIllI();
    }
    
    private static int lllIIllIlIlIIll(final double n, final double n2) {
        return dcmpg(n, n2);
    }
    
    private static int lllIIllIlIIlllI(final double n, final double n2) {
        return dcmpg(n, n2);
    }
    
    private static void lllIIllIlIIlIIl() {
        (lIlIIlIllIlIII = new int[5])[0] = "   ".length();
        EntityAITempt.lIlIIlIllIlIII[1] = ((0x4B ^ 0x4) & ~(0xDA ^ 0x95));
        EntityAITempt.lIlIIlIllIlIII[2] = " ".length();
        EntityAITempt.lIlIIlIllIlIII[3] = (0xD9 ^ 0xBD);
        EntityAITempt.lIlIIlIllIlIII[4] = "  ".length();
    }
    
    private static boolean lllIIllIlIlIIlI(final int lllllllllllllIIIllIllIIIIlIlIIIl) {
        return lllllllllllllIIIllIllIIIIlIlIIIl <= 0;
    }
    
    private static boolean lllIIllIlIIllII(final Object lllllllllllllIIIllIllIIIIlIllIIl) {
        return lllllllllllllIIIllIllIIIIlIllIIl == null;
    }
    
    private static boolean lllIIllIlIIlIll(final int lllllllllllllIIIllIllIIIIlIIllll) {
        return lllllllllllllIIIllIllIIIIlIIllll > 0;
    }
    
    private static int lllIIllIlIIllll(final double n, final double n2) {
        return dcmpl(n, n2);
    }
    
    @Override
    public void startExecuting() {
        this.targetX = this.temptingPlayer.posX;
        this.targetY = this.temptingPlayer.posY;
        this.targetZ = this.temptingPlayer.posZ;
        this.isRunning = (EntityAITempt.lIlIIlIllIlIII[2] != 0);
        this.avoidWater = ((PathNavigateGround)this.temptedEntity.getNavigator()).getAvoidsWater();
        ((PathNavigateGround)this.temptedEntity.getNavigator()).setAvoidsWater((boolean)(EntityAITempt.lIlIIlIllIlIII[1] != 0));
    }
    
    public EntityAITempt(final EntityCreature lllllllllllllIIIllIllIIIlIIIIlII, final double lllllllllllllIIIllIllIIIlIIIlIII, final Item lllllllllllllIIIllIllIIIlIIIIlll, final boolean lllllllllllllIIIllIllIIIlIIIIllI) {
        this.temptedEntity = lllllllllllllIIIllIllIIIlIIIIlII;
        this.speed = lllllllllllllIIIllIllIIIlIIIlIII;
        this.temptItem = lllllllllllllIIIllIllIIIlIIIIlll;
        this.scaredByPlayerMovement = lllllllllllllIIIllIllIIIlIIIIllI;
        this.setMutexBits(EntityAITempt.lIlIIlIllIlIII[0]);
        if (lllIIllIlIIlIlI((lllllllllllllIIIllIllIIIlIIIIlII.getNavigator() instanceof PathNavigateGround) ? 1 : 0)) {
            throw new IllegalArgumentException(EntityAITempt.lIlIIlIllIIlII[EntityAITempt.lIlIIlIllIlIII[1]]);
        }
    }
    
    private static void lllIIllIlIIIllI() {
        (lIlIIlIllIIlII = new String[EntityAITempt.lIlIIlIllIlIII[2]])[EntityAITempt.lIlIIlIllIlIII[1]] = lllIIllIlIIIIll("eIp84vxiK5JN+yKfy0G6nE+3WM+EkwjjeUJme5n1++YU8VAmzH/Kgw==", "EhUVU");
    }
    
    private static boolean lllIIllIlIIlIlI(final int lllllllllllllIIIllIllIIIIlIlIlIl) {
        return lllllllllllllIIIllIllIIIIlIlIlIl == 0;
    }
    
    @Override
    public boolean continueExecuting() {
        if (lllIIllIlIlIIII(this.scaredByPlayerMovement ? 1 : 0)) {
            if (lllIIllIlIlIIIl(lllIIllIlIIlllI(this.temptedEntity.getDistanceSqToEntity(this.temptingPlayer), 36.0))) {
                if (lllIIllIlIIlIll(lllIIllIlIIllll(this.temptingPlayer.getDistanceSq(this.targetX, this.targetY, this.targetZ), 0.010000000000000002))) {
                    return EntityAITempt.lIlIIlIllIlIII[1] != 0;
                }
                if (!lllIIllIlIlIIlI(lllIIllIlIIllll(Math.abs(this.temptingPlayer.rotationPitch - this.pitch), 5.0)) || lllIIllIlIIlIll(lllIIllIlIIllll(Math.abs(this.temptingPlayer.rotationYaw - this.yaw), 5.0))) {
                    return EntityAITempt.lIlIIlIllIlIII[1] != 0;
                }
            }
            else {
                this.targetX = this.temptingPlayer.posX;
                this.targetY = this.temptingPlayer.posY;
                this.targetZ = this.temptingPlayer.posZ;
            }
            this.pitch = this.temptingPlayer.rotationPitch;
            this.yaw = this.temptingPlayer.rotationYaw;
        }
        return this.shouldExecute();
    }
}
