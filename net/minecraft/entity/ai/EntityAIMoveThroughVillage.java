// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.entity.ai;

import java.util.Iterator;
import net.minecraft.util.MathHelper;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import com.google.common.collect.Lists;
import net.minecraft.village.Village;
import net.minecraft.util.Vec3;
import net.minecraft.pathfinding.PathNavigateGround;
import net.minecraft.entity.Entity;
import net.minecraft.util.BlockPos;
import net.minecraft.entity.EntityCreature;
import net.minecraft.pathfinding.PathEntity;
import java.util.List;
import net.minecraft.village.VillageDoorInfo;

public class EntityAIMoveThroughVillage extends EntityAIBase
{
    private /* synthetic */ VillageDoorInfo doorInfo;
    private /* synthetic */ List<VillageDoorInfo> doorList;
    private /* synthetic */ PathEntity entityPathNavigate;
    private static final /* synthetic */ String[] lIllIIlIlIIllI;
    private static final /* synthetic */ int[] lIllIIlIlIIlll;
    private /* synthetic */ double movementSpeed;
    private /* synthetic */ EntityCreature theEntity;
    private /* synthetic */ boolean isNocturnal;
    
    private static int lllllIIllllIlll(final double n, final double n2) {
        return dcmpg(n, n2);
    }
    
    @Override
    public boolean shouldExecute() {
        this.resizeDoorList();
        if (lllllIIllllIIlI(this.isNocturnal ? 1 : 0) && lllllIIllllIIlI(this.theEntity.worldObj.isDaytime() ? 1 : 0)) {
            return EntityAIMoveThroughVillage.lIllIIlIlIIlll[1] != 0;
        }
        final Village lllllllllllllIIIIIIlllllIlllIIlI = this.theEntity.worldObj.getVillageCollection().getNearestVillage(new BlockPos(this.theEntity), EntityAIMoveThroughVillage.lIllIIlIlIIlll[1]);
        if (lllllIIllllIIll(lllllllllllllIIIIIIlllllIlllIIlI)) {
            return EntityAIMoveThroughVillage.lIllIIlIlIIlll[1] != 0;
        }
        this.doorInfo = this.findNearestDoor(lllllllllllllIIIIIIlllllIlllIIlI);
        if (lllllIIllllIIll(this.doorInfo)) {
            return EntityAIMoveThroughVillage.lIllIIlIlIIlll[1] != 0;
        }
        final PathNavigateGround lllllllllllllIIIIIIlllllIlllIIIl = (PathNavigateGround)this.theEntity.getNavigator();
        final boolean lllllllllllllIIIIIIlllllIlllIIII = lllllllllllllIIIIIIlllllIlllIIIl.getEnterDoors();
        lllllllllllllIIIIIIlllllIlllIIIl.setBreakDoors((boolean)(EntityAIMoveThroughVillage.lIllIIlIlIIlll[1] != 0));
        this.entityPathNavigate = lllllllllllllIIIIIIlllllIlllIIIl.getPathToPos(this.doorInfo.getDoorBlockPos());
        lllllllllllllIIIIIIlllllIlllIIIl.setBreakDoors(lllllllllllllIIIIIIlllllIlllIIII);
        if (lllllIIllllIlII(this.entityPathNavigate)) {
            return EntityAIMoveThroughVillage.lIllIIlIlIIlll[0] != 0;
        }
        final Vec3 lllllllllllllIIIIIIlllllIllIllll = RandomPositionGenerator.findRandomTargetBlockTowards(this.theEntity, EntityAIMoveThroughVillage.lIllIIlIlIIlll[2], EntityAIMoveThroughVillage.lIllIIlIlIIlll[3], new Vec3(this.doorInfo.getDoorBlockPos().getX(), this.doorInfo.getDoorBlockPos().getY(), this.doorInfo.getDoorBlockPos().getZ()));
        if (lllllIIllllIIll(lllllllllllllIIIIIIlllllIllIllll)) {
            return EntityAIMoveThroughVillage.lIllIIlIlIIlll[1] != 0;
        }
        lllllllllllllIIIIIIlllllIlllIIIl.setBreakDoors((boolean)(EntityAIMoveThroughVillage.lIllIIlIlIIlll[1] != 0));
        this.entityPathNavigate = this.theEntity.getNavigator().getPathToXYZ(lllllllllllllIIIIIIlllllIllIllll.xCoord, lllllllllllllIIIIIIlllllIllIllll.yCoord, lllllllllllllIIIIIIlllllIllIllll.zCoord);
        lllllllllllllIIIIIIlllllIlllIIIl.setBreakDoors(lllllllllllllIIIIIIlllllIlllIIII);
        if (lllllIIllllIlII(this.entityPathNavigate)) {
            return EntityAIMoveThroughVillage.lIllIIlIlIIlll[0] != 0;
        }
        return EntityAIMoveThroughVillage.lIllIIlIlIIlll[1] != 0;
    }
    
    private static void lllllIIllllIIII() {
        (lIllIIlIlIIlll = new int[8])[0] = " ".length();
        EntityAIMoveThroughVillage.lIllIIlIlIIlll[1] = ((0xFD ^ 0xAF ^ (0x3D ^ 0x28)) & (0x73 ^ 0x2D ^ (0xD9 ^ 0xC0) ^ -" ".length()));
        EntityAIMoveThroughVillage.lIllIIlIlIIlll[2] = (77 + 63 - 17 + 21 ^ 43 + 136 - 149 + 124);
        EntityAIMoveThroughVillage.lIllIIlIlIIlll[3] = (0x82 ^ 0x85);
        EntityAIMoveThroughVillage.lIllIIlIlIIlll[4] = (-1 & Integer.MAX_VALUE);
        EntityAIMoveThroughVillage.lIllIIlIlIIlll[5] = (0x40 ^ 0x4F);
        EntityAIMoveThroughVillage.lIllIIlIlIIlll[6] = (0x4 ^ 0xC);
        EntityAIMoveThroughVillage.lIllIIlIlIIlll[7] = "  ".length();
    }
    
    static {
        lllllIIllllIIII();
        lllllIIlllIllll();
    }
    
    private void resizeDoorList() {
        if (lllllIIlllllIlI(this.doorList.size(), EntityAIMoveThroughVillage.lIllIIlIlIIlll[5])) {
            this.doorList.remove(EntityAIMoveThroughVillage.lIllIIlIlIIlll[1]);
            "".length();
        }
    }
    
    private static boolean lllllIIllllIlII(final Object lllllllllllllIIIIIIlllllIIlIIlIl) {
        return lllllllllllllIIIIIIlllllIIlIIlIl != null;
    }
    
    private static void lllllIIlllIllll() {
        (lIllIIlIlIIllI = new String[EntityAIMoveThroughVillage.lIllIIlIlIIlll[0]])[EntityAIMoveThroughVillage.lIllIIlIlIIlll[1]] = lllllIIlllIlllI("q5WUJJ9frqbI+biY+XlUKE4f6dgxDOXZM8ev4y7CS4rDeCvX9cIryb9V3U0Dq4Vj", "lFTwq");
    }
    
    private static boolean lllllIIllllIllI(final int lllllllllllllIIIIIIlllllIIIllIll) {
        return lllllllllllllIIIIIIlllllIIIllIll > 0;
    }
    
    private static boolean lllllIIlllllIII(final int lllllllllllllIIIIIIlllllIIIlllIl) {
        return lllllllllllllIIIIIIlllllIIIlllIl < 0;
    }
    
    private static int lllllIIllllIlIl(final double n, final double n2) {
        return dcmpl(n, n2);
    }
    
    public EntityAIMoveThroughVillage(final EntityCreature lllllllllllllIIIIIIlllllIllllIll, final double lllllllllllllIIIIIIlllllIllllllI, final boolean lllllllllllllIIIIIIlllllIllllIIl) {
        this.doorList = (List<VillageDoorInfo>)Lists.newArrayList();
        this.theEntity = lllllllllllllIIIIIIlllllIllllIll;
        this.movementSpeed = lllllllllllllIIIIIIlllllIllllllI;
        this.isNocturnal = lllllllllllllIIIIIIlllllIllllIIl;
        this.setMutexBits(EntityAIMoveThroughVillage.lIllIIlIlIIlll[0]);
        if (lllllIIllllIIIl((lllllllllllllIIIIIIlllllIllllIll.getNavigator() instanceof PathNavigateGround) ? 1 : 0)) {
            throw new IllegalArgumentException(EntityAIMoveThroughVillage.lIllIIlIlIIllI[EntityAIMoveThroughVillage.lIllIIlIlIIlll[1]]);
        }
    }
    
    @Override
    public void startExecuting() {
        this.theEntity.getNavigator().setPath(this.entityPathNavigate, this.movementSpeed);
        "".length();
    }
    
    private static boolean lllllIIllllIIll(final Object lllllllllllllIIIIIIlllllIIlIIIll) {
        return lllllllllllllIIIIIIlllllIIlIIIll == null;
    }
    
    private static String lllllIIlllIlllI(final String lllllllllllllIIIIIIlllllIIllIIlI, final String lllllllllllllIIIIIIlllllIIllIIll) {
        try {
            final SecretKeySpec lllllllllllllIIIIIIlllllIIllIlll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIIIIIIlllllIIllIIll.getBytes(StandardCharsets.UTF_8)), EntityAIMoveThroughVillage.lIllIIlIlIIlll[6]), "DES");
            final Cipher lllllllllllllIIIIIIlllllIIllIllI = Cipher.getInstance("DES");
            lllllllllllllIIIIIIlllllIIllIllI.init(EntityAIMoveThroughVillage.lIllIIlIlIIlll[7], lllllllllllllIIIIIIlllllIIllIlll);
            return new String(lllllllllllllIIIIIIlllllIIllIllI.doFinal(Base64.getDecoder().decode(lllllllllllllIIIIIIlllllIIllIIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIIIIIlllllIIllIlIl) {
            lllllllllllllIIIIIIlllllIIllIlIl.printStackTrace();
            return null;
        }
    }
    
    private static boolean lllllIIllllIIIl(final int lllllllllllllIIIIIIlllllIIIlllll) {
        return lllllllllllllIIIIIIlllllIIIlllll == 0;
    }
    
    private VillageDoorInfo findNearestDoor(final Village lllllllllllllIIIIIIlllllIlIIllll) {
        VillageDoorInfo lllllllllllllIIIIIIlllllIlIlIlII = null;
        int lllllllllllllIIIIIIlllllIlIlIIll = EntityAIMoveThroughVillage.lIllIIlIlIIlll[4];
        final boolean lllllllllllllIIIIIIlllllIlIIlIll = (boolean)lllllllllllllIIIIIIlllllIlIIllll.getVillageDoorInfoList().iterator();
        "".length();
        if (((0xD ^ 0x3D) & ~(0x43 ^ 0x73)) != 0x0) {
            return null;
        }
        while (!lllllIIllllIIIl(((Iterator)lllllllllllllIIIIIIlllllIlIIlIll).hasNext() ? 1 : 0)) {
            final VillageDoorInfo lllllllllllllIIIIIIlllllIlIlIIlI = ((Iterator<VillageDoorInfo>)lllllllllllllIIIIIIlllllIlIIlIll).next();
            final int lllllllllllllIIIIIIlllllIlIlIIIl = lllllllllllllIIIIIIlllllIlIlIIlI.getDistanceSquared(MathHelper.floor_double(this.theEntity.posX), MathHelper.floor_double(this.theEntity.posY), MathHelper.floor_double(this.theEntity.posZ));
            if (lllllIIlllllIIl(lllllllllllllIIIIIIlllllIlIlIIIl, lllllllllllllIIIIIIlllllIlIlIIll) && lllllIIllllIIIl(this.doesDoorListContain(lllllllllllllIIIIIIlllllIlIlIIlI) ? 1 : 0)) {
                lllllllllllllIIIIIIlllllIlIlIlII = lllllllllllllIIIIIIlllllIlIlIIlI;
                lllllllllllllIIIIIIlllllIlIlIIll = lllllllllllllIIIIIIlllllIlIlIIIl;
            }
        }
        return lllllllllllllIIIIIIlllllIlIlIlII;
    }
    
    private static boolean lllllIIllllIIlI(final int lllllllllllllIIIIIIlllllIIlIIIIl) {
        return lllllllllllllIIIIIIlllllIIlIIIIl != 0;
    }
    
    private static boolean lllllIIlllllIIl(final int lllllllllllllIIIIIIlllllIIlIllII, final int lllllllllllllIIIIIIlllllIIlIlIll) {
        return lllllllllllllIIIIIIlllllIIlIllII < lllllllllllllIIIIIIlllllIIlIlIll;
    }
    
    private static boolean lllllIIlllllIlI(final int lllllllllllllIIIIIIlllllIIlIlIII, final int lllllllllllllIIIIIIlllllIIlIIlll) {
        return lllllllllllllIIIIIIlllllIIlIlIII > lllllllllllllIIIIIIlllllIIlIIlll;
    }
    
    @Override
    public void resetTask() {
        if (!lllllIIllllIIIl(this.theEntity.getNavigator().noPath() ? 1 : 0) || lllllIIlllllIII(lllllIIllllIlll(this.theEntity.getDistanceSq(this.doorInfo.getDoorBlockPos()), 16.0))) {
            this.doorList.add(this.doorInfo);
            "".length();
        }
    }
    
    @Override
    public boolean continueExecuting() {
        if (lllllIIllllIIlI(this.theEntity.getNavigator().noPath() ? 1 : 0)) {
            return EntityAIMoveThroughVillage.lIllIIlIlIIlll[1] != 0;
        }
        final float lllllllllllllIIIIIIlllllIllIIllI = this.theEntity.width + 4.0f;
        if (lllllIIllllIllI(lllllIIllllIlIl(this.theEntity.getDistanceSq(this.doorInfo.getDoorBlockPos()), lllllllllllllIIIIIIlllllIllIIllI * lllllllllllllIIIIIIlllllIllIIllI))) {
            return EntityAIMoveThroughVillage.lIllIIlIlIIlll[0] != 0;
        }
        return EntityAIMoveThroughVillage.lIllIIlIlIIlll[1] != 0;
    }
    
    private boolean doesDoorListContain(final VillageDoorInfo lllllllllllllIIIIIIlllllIlIIIIIl) {
        final double lllllllllllllIIIIIIlllllIIllllll = (double)this.doorList.iterator();
        "".length();
        if (null != null) {
            return ((0x92 ^ 0x96) & ~(0x61 ^ 0x65)) != 0x0;
        }
        while (!lllllIIllllIIIl(((Iterator)lllllllllllllIIIIIIlllllIIllllll).hasNext() ? 1 : 0)) {
            final VillageDoorInfo lllllllllllllIIIIIIlllllIlIIIIll = ((Iterator<VillageDoorInfo>)lllllllllllllIIIIIIlllllIIllllll).next();
            if (lllllIIllllIIlI(lllllllllllllIIIIIIlllllIlIIIIIl.getDoorBlockPos().equals(lllllllllllllIIIIIIlllllIlIIIIll.getDoorBlockPos()) ? 1 : 0)) {
                return EntityAIMoveThroughVillage.lIllIIlIlIIlll[0] != 0;
            }
        }
        return EntityAIMoveThroughVillage.lIllIIlIlIIlll[1] != 0;
    }
}
