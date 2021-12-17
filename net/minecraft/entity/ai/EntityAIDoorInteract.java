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
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.pathfinding.PathPoint;
import net.minecraft.pathfinding.PathEntity;
import net.minecraft.entity.Entity;
import net.minecraft.pathfinding.PathNavigateGround;
import net.minecraft.block.BlockDoor;
import net.minecraft.util.BlockPos;
import net.minecraft.entity.EntityLiving;

public abstract class EntityAIDoorInteract extends EntityAIBase
{
    protected /* synthetic */ EntityLiving theEntity;
    /* synthetic */ float entityPositionX;
    private static final /* synthetic */ String[] lIIlIIIllIIIIl;
    private static final /* synthetic */ int[] lIIlIIIllIIlIl;
    protected /* synthetic */ BlockPos doorPosition;
    /* synthetic */ float entityPositionZ;
    /* synthetic */ boolean hasStoppedDoorInteraction;
    protected /* synthetic */ BlockDoor doorBlock;
    
    private static int llIIlIllIlIIlll(final double n, final double n2) {
        return dcmpg(n, n2);
    }
    
    public EntityAIDoorInteract(final EntityLiving lllllllllllllIIlllIIlIIlllIIllII) {
        this.doorPosition = BlockPos.ORIGIN;
        this.theEntity = lllllllllllllIIlllIIlIIlllIIllII;
        if (llIIlIllIlIIllI((lllllllllllllIIlllIIlIIlllIIllII.getNavigator() instanceof PathNavigateGround) ? 1 : 0)) {
            throw new IllegalArgumentException(EntityAIDoorInteract.lIIlIIIllIIIIl[EntityAIDoorInteract.lIIlIIIllIIlIl[0]]);
        }
    }
    
    private static boolean llIIlIllIlIlllI(final int lllllllllllllIIlllIIlIIllIIIIIll) {
        return lllllllllllllIIlllIIlIIllIIIIIll < 0;
    }
    
    @Override
    public void startExecuting() {
        this.hasStoppedDoorInteraction = (EntityAIDoorInteract.lIIlIIIllIIlIl[0] != 0);
        this.entityPositionX = (float)(this.doorPosition.getX() + 0.5f - this.theEntity.posX);
        this.entityPositionZ = (float)(this.doorPosition.getZ() + 0.5f - this.theEntity.posZ);
    }
    
    private static void llIIlIllIIlllll() {
        (lIIlIIIllIIIIl = new String[EntityAIDoorInteract.lIIlIIIllIIlIl[1]])[EntityAIDoorInteract.lIIlIIIllIIlIl[0]] = llIIlIllIIllllI("zeWlWCTUzvwo5256KGBjGBY7K4DCEC88OJZkMzDzdwhgKihYPKjm6dFUJr1hj7AJ", "Fdcmv");
    }
    
    private static boolean llIIlIllIlIIllI(final int lllllllllllllIIlllIIlIIllIIIIlIl) {
        return lllllllllllllIIlllIIlIIllIIIIlIl == 0;
    }
    
    private static boolean llIIlIllIlIlIII(final Object lllllllllllllIIlllIIlIIllIIIllIl) {
        return lllllllllllllIIlllIIlIIllIIIllIl != null;
    }
    
    @Override
    public void updateTask() {
        final float lllllllllllllIIlllIIlIIllIlIllll = (float)(this.doorPosition.getX() + 0.5f - this.theEntity.posX);
        final float lllllllllllllIIlllIIlIIllIlIlllI = (float)(this.doorPosition.getZ() + 0.5f - this.theEntity.posZ);
        final float lllllllllllllIIlllIIlIIllIlIllIl = this.entityPositionX * lllllllllllllIIlllIIlIIllIlIllll + this.entityPositionZ * lllllllllllllIIlllIIlIIllIlIlllI;
        if (llIIlIllIlIlllI(llIIlIllIlIllIl(lllllllllllllIIlllIIlIIllIlIllIl, 0.0f))) {
            this.hasStoppedDoorInteraction = (EntityAIDoorInteract.lIIlIIIllIIlIl[1] != 0);
        }
    }
    
    @Override
    public boolean continueExecuting() {
        int n;
        if (llIIlIllIlIlIIl(this.hasStoppedDoorInteraction ? 1 : 0)) {
            n = EntityAIDoorInteract.lIIlIIIllIIlIl[0];
            "".length();
            if (null != null) {
                return ((0x7D ^ 0x35) & ~(0x6C ^ 0x24)) != 0x0;
            }
        }
        else {
            n = EntityAIDoorInteract.lIIlIIIllIIlIl[1];
        }
        return n != 0;
    }
    
    private static boolean llIIlIllIlIlIIl(final int lllllllllllllIIlllIIlIIllIIIIlll) {
        return lllllllllllllIIlllIIlIIllIIIIlll != 0;
    }
    
    private static boolean llIIlIllIlIllll(final Object lllllllllllllIIlllIIlIIllIIIlIlI, final Object lllllllllllllIIlllIIlIIllIIIlIIl) {
        return lllllllllllllIIlllIIlIIllIIIlIlI == lllllllllllllIIlllIIlIIllIIIlIIl;
    }
    
    private static void llIIlIllIlIIlIl() {
        (lIIlIIIllIIlIl = new int[3])[0] = ((0xFE ^ 0xBA) & ~(0x47 ^ 0x3));
        EntityAIDoorInteract.lIIlIIIllIIlIl[1] = " ".length();
        EntityAIDoorInteract.lIIlIIIllIIlIl[2] = "  ".length();
    }
    
    @Override
    public boolean shouldExecute() {
        if (llIIlIllIlIIllI(this.theEntity.isCollidedHorizontally ? 1 : 0)) {
            return EntityAIDoorInteract.lIIlIIIllIIlIl[0] != 0;
        }
        final PathNavigateGround lllllllllllllIIlllIIlIIlllIIIIll = (PathNavigateGround)this.theEntity.getNavigator();
        final PathEntity lllllllllllllIIlllIIlIIlllIIIIlI = lllllllllllllIIlllIIlIIlllIIIIll.getPath();
        if (!llIIlIllIlIlIII(lllllllllllllIIlllIIlIIlllIIIIlI) || !llIIlIllIlIIllI(lllllllllllllIIlllIIlIIlllIIIIlI.isFinished() ? 1 : 0) || !llIIlIllIlIlIIl(lllllllllllllIIlllIIlIIlllIIIIll.getEnterDoors() ? 1 : 0)) {
            return EntityAIDoorInteract.lIIlIIIllIIlIl[0] != 0;
        }
        int lllllllllllllIIlllIIlIIlllIIIIIl = EntityAIDoorInteract.lIIlIIIllIIlIl[0];
        "".length();
        if ((0x18 ^ 0x1D) <= 0) {
            return ((0x28 ^ 0x22) & ~(0xC9 ^ 0xC3)) != 0x0;
        }
        while (!llIIlIllIlIlIll(lllllllllllllIIlllIIlIIlllIIIIIl, Math.min(lllllllllllllIIlllIIlIIlllIIIIlI.getCurrentPathIndex() + EntityAIDoorInteract.lIIlIIIllIIlIl[2], lllllllllllllIIlllIIlIIlllIIIIlI.getCurrentPathLength()))) {
            final PathPoint lllllllllllllIIlllIIlIIlllIIIIII = lllllllllllllIIlllIIlIIlllIIIIlI.getPathPointFromIndex(lllllllllllllIIlllIIlIIlllIIIIIl);
            this.doorPosition = new BlockPos(lllllllllllllIIlllIIlIIlllIIIIII.xCoord, lllllllllllllIIlllIIlIIlllIIIIII.yCoord + EntityAIDoorInteract.lIIlIIIllIIlIl[1], lllllllllllllIIlllIIlIIlllIIIIII.zCoord);
            if (llIIlIllIlIlIlI(llIIlIllIlIIlll(this.theEntity.getDistanceSq(this.doorPosition.getX(), this.theEntity.posY, this.doorPosition.getZ()), 2.25))) {
                this.doorBlock = this.getBlockDoor(this.doorPosition);
                if (llIIlIllIlIlIII(this.doorBlock)) {
                    return EntityAIDoorInteract.lIIlIIIllIIlIl[1] != 0;
                }
            }
            ++lllllllllllllIIlllIIlIIlllIIIIIl;
        }
        this.doorPosition = new BlockPos(this.theEntity).up();
        this.doorBlock = this.getBlockDoor(this.doorPosition);
        if (llIIlIllIlIlIII(this.doorBlock)) {
            return EntityAIDoorInteract.lIIlIIIllIIlIl[1] != 0;
        }
        return EntityAIDoorInteract.lIIlIIIllIIlIl[0] != 0;
    }
    
    private static boolean llIIlIllIlIlIll(final int lllllllllllllIIlllIIlIIllIIlIIII, final int lllllllllllllIIlllIIlIIllIIIllll) {
        return lllllllllllllIIlllIIlIIllIIlIIII >= lllllllllllllIIlllIIlIIllIIIllll;
    }
    
    private BlockDoor getBlockDoor(final BlockPos lllllllllllllIIlllIIlIIllIlIIIIl) {
        final Block lllllllllllllIIlllIIlIIllIlIIIll = this.theEntity.worldObj.getBlockState(lllllllllllllIIlllIIlIIllIlIIIIl).getBlock();
        BlockDoor blockDoor;
        if (llIIlIllIlIlIIl((lllllllllllllIIlllIIlIIllIlIIIll instanceof BlockDoor) ? 1 : 0) && llIIlIllIlIllll(lllllllllllllIIlllIIlIIllIlIIIll.getMaterial(), Material.wood)) {
            blockDoor = (BlockDoor)lllllllllllllIIlllIIlIIllIlIIIll;
            "".length();
            if (-" ".length() >= "   ".length()) {
                return null;
            }
        }
        else {
            blockDoor = null;
        }
        return blockDoor;
    }
    
    private static boolean llIIlIllIlIlIlI(final int lllllllllllllIIlllIIlIIllIIIIIIl) {
        return lllllllllllllIIlllIIlIIllIIIIIIl <= 0;
    }
    
    static {
        llIIlIllIlIIlIl();
        llIIlIllIIlllll();
    }
    
    private static int llIIlIllIlIllIl(final float n, final float n2) {
        return fcmpg(n, n2);
    }
    
    private static String llIIlIllIIllllI(final String lllllllllllllIIlllIIlIIllIIlIllI, final String lllllllllllllIIlllIIlIIllIIlIlIl) {
        try {
            final SecretKeySpec lllllllllllllIIlllIIlIIllIIllIll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIIlllIIlIIllIIlIlIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lllllllllllllIIlllIIlIIllIIllIlI = Cipher.getInstance("Blowfish");
            lllllllllllllIIlllIIlIIllIIllIlI.init(EntityAIDoorInteract.lIIlIIIllIIlIl[2], lllllllllllllIIlllIIlIIllIIllIll);
            return new String(lllllllllllllIIlllIIlIIllIIllIlI.doFinal(Base64.getDecoder().decode(lllllllllllllIIlllIIlIIllIIlIllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIlllIIlIIllIIllIIl) {
            lllllllllllllIIlllIIlIIllIIllIIl.printStackTrace();
            return null;
        }
    }
}
