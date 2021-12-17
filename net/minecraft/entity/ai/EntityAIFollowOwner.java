// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.entity.ai;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.world.IBlockAccess;
import net.minecraft.util.BlockPos;
import net.minecraft.util.MathHelper;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import net.minecraft.entity.Entity;
import net.minecraft.pathfinding.PathNavigateGround;
import net.minecraft.entity.passive.EntityTameable;
import net.minecraft.world.World;
import net.minecraft.pathfinding.PathNavigate;
import net.minecraft.entity.EntityLivingBase;

public class EntityAIFollowOwner extends EntityAIBase
{
    private /* synthetic */ double followSpeed;
    private /* synthetic */ int field_75343_h;
    private /* synthetic */ EntityLivingBase theOwner;
    private /* synthetic */ PathNavigate petPathfinder;
    /* synthetic */ float minDist;
    /* synthetic */ World theWorld;
    private static final /* synthetic */ String[] lIllIlIlIIlIlI;
    private static final /* synthetic */ int[] lIllIlIlIIllII;
    private /* synthetic */ EntityTameable thePet;
    private /* synthetic */ boolean field_75344_i;
    /* synthetic */ float maxDist;
    
    private static boolean llllllIlIllIlll(final int lllllllllllllIIIIIIIIIIIIlIlIIIl) {
        return lllllllllllllIIIIIIIIIIIIlIlIIIl <= 0;
    }
    
    private static boolean llllllIlIllIlII(final int lllllllllllllIIIIIIIIIIIIlIIllII) {
        return lllllllllllllIIIIIIIIIIIIlIIllII > 0;
    }
    
    public EntityAIFollowOwner(final EntityTameable lllllllllllllIIIIIIIIIIIllIIllll, final double lllllllllllllIIIIIIIIIIIllIIlllI, final float lllllllllllllIIIIIIIIIIIllIIllIl, final float lllllllllllllIIIIIIIIIIIllIIllII) {
        this.thePet = lllllllllllllIIIIIIIIIIIllIIllll;
        this.theWorld = lllllllllllllIIIIIIIIIIIllIIllll.worldObj;
        this.followSpeed = lllllllllllllIIIIIIIIIIIllIIlllI;
        this.petPathfinder = lllllllllllllIIIIIIIIIIIllIIllll.getNavigator();
        this.minDist = lllllllllllllIIIIIIIIIIIllIIllIl;
        this.maxDist = lllllllllllllIIIIIIIIIIIllIIllII;
        this.setMutexBits(EntityAIFollowOwner.lIllIlIlIIllII[0]);
        if (llllllIlIlIllIl((lllllllllllllIIIIIIIIIIIllIIllll.getNavigator() instanceof PathNavigateGround) ? 1 : 0)) {
            throw new IllegalArgumentException(EntityAIFollowOwner.lIllIlIlIIlIlI[EntityAIFollowOwner.lIllIlIlIIllII[1]]);
        }
    }
    
    @Override
    public boolean continueExecuting() {
        if (llllllIlIlIllIl(this.petPathfinder.noPath() ? 1 : 0) && llllllIlIllIlII(llllllIlIllIIll(this.thePet.getDistanceSqToEntity(this.theOwner), this.maxDist * this.maxDist)) && llllllIlIlIllIl(this.thePet.isSitting() ? 1 : 0)) {
            return EntityAIFollowOwner.lIllIlIlIIllII[2] != 0;
        }
        return EntityAIFollowOwner.lIllIlIlIIllII[1] != 0;
    }
    
    private static String llllllIlIlIIIll(final String lllllllllllllIIIIIIIIIIIlIIlIIII, final String lllllllllllllIIIIIIIIIIIlIIIlllI) {
        try {
            final SecretKeySpec lllllllllllllIIIIIIIIIIIlIIlIllI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIIIIIIIIIIIlIIIlllI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lllllllllllllIIIIIIIIIIIlIIlIlIl = Cipher.getInstance("Blowfish");
            lllllllllllllIIIIIIIIIIIlIIlIlIl.init(EntityAIFollowOwner.lIllIlIlIIllII[4], lllllllllllllIIIIIIIIIIIlIIlIllI);
            return new String(lllllllllllllIIIIIIIIIIIlIIlIlIl.doFinal(Base64.getDecoder().decode(lllllllllllllIIIIIIIIIIIlIIlIIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIIIIIIIIIIlIIlIIll) {
            lllllllllllllIIIIIIIIIIIlIIlIIll.printStackTrace();
            return null;
        }
    }
    
    private static boolean llllllIlIlllIlI(final int lllllllllllllIIIIIIIIIIIlIIIIlIl, final int lllllllllllllIIIIIIIIIIIlIIIIIll) {
        return lllllllllllllIIIIIIIIIIIlIIIIlIl >= lllllllllllllIIIIIIIIIIIlIIIIIll;
    }
    
    private static int llllllIlIlIlllI(final double n, final double n2) {
        return dcmpg(n, n2);
    }
    
    private static boolean llllllIlIllIlIl(final Object lllllllllllllIIIIIIIIIIIIllIlllI, final Object lllllllllllllIIIIIIIIIIIIllIllII) {
        return lllllllllllllIIIIIIIIIIIIllIlllI == lllllllllllllIIIIIIIIIIIIllIllII;
    }
    
    private static int llllllIlIllIllI(final double n, final double n2) {
        return dcmpl(n, n2);
    }
    
    private static boolean llllllIlIllIIlI(final int lllllllllllllIIIIIIIIIIIIlIlIlII) {
        return lllllllllllllIIIIIIIIIIIIlIlIlII < 0;
    }
    
    private static boolean llllllIlIllIIII(final Object lllllllllllllIIIIIIIIIIIIllIIlll) {
        return lllllllllllllIIIIIIIIIIIIllIIlll == null;
    }
    
    @Override
    public void updateTask() {
        this.thePet.getLookHelper().setLookPositionWithEntity(this.theOwner, 10.0f, (float)this.thePet.getVerticalFaceSpeed());
        if (llllllIlIlIllIl(this.thePet.isSitting() ? 1 : 0)) {
            final int n = this.field_75343_h - EntityAIFollowOwner.lIllIlIlIIllII[2];
            this.field_75343_h = n;
            if (llllllIlIllIlll(n)) {
                this.field_75343_h = EntityAIFollowOwner.lIllIlIlIIllII[3];
                if (llllllIlIlIllIl(this.petPathfinder.tryMoveToEntityLiving(this.theOwner, this.followSpeed) ? 1 : 0) && llllllIlIlIllIl(this.thePet.getLeashed() ? 1 : 0) && llllllIlIlllIII(llllllIlIllIllI(this.thePet.getDistanceSqToEntity(this.theOwner), 144.0))) {
                    final int lllllllllllllIIIIIIIIIIIlIlIlIIl = MathHelper.floor_double(this.theOwner.posX) - EntityAIFollowOwner.lIllIlIlIIllII[4];
                    final int lllllllllllllIIIIIIIIIIIlIlIlIII = MathHelper.floor_double(this.theOwner.posZ) - EntityAIFollowOwner.lIllIlIlIIllII[4];
                    final int lllllllllllllIIIIIIIIIIIlIlIIlll = MathHelper.floor_double(this.theOwner.getEntityBoundingBox().minY);
                    int lllllllllllllIIIIIIIIIIIlIlIIllI = EntityAIFollowOwner.lIllIlIlIIllII[1];
                    "".length();
                    if (null != null) {
                        return;
                    }
                    while (!llllllIlIllllII(lllllllllllllIIIIIIIIIIIlIlIIllI, EntityAIFollowOwner.lIllIlIlIIllII[5])) {
                        int lllllllllllllIIIIIIIIIIIlIlIIlIl = EntityAIFollowOwner.lIllIlIlIIllII[1];
                        "".length();
                        if ("  ".length() < "  ".length()) {
                            return;
                        }
                        while (!llllllIlIllllII(lllllllllllllIIIIIIIIIIIlIlIIlIl, EntityAIFollowOwner.lIllIlIlIIllII[5])) {
                            if ((!llllllIlIlllIlI(lllllllllllllIIIIIIIIIIIlIlIIllI, EntityAIFollowOwner.lIllIlIlIIllII[2]) || !llllllIlIlllIlI(lllllllllllllIIIIIIIIIIIlIlIIlIl, EntityAIFollowOwner.lIllIlIlIIllII[2]) || !llllllIlIlllIll(lllllllllllllIIIIIIIIIIIlIlIIllI, EntityAIFollowOwner.lIllIlIlIIllII[0]) || llllllIlIllllII(lllllllllllllIIIIIIIIIIIlIlIIlIl, EntityAIFollowOwner.lIllIlIlIIllII[0])) && llllllIlIllIIIl(World.doesBlockHaveSolidTopSurface(this.theWorld, new BlockPos(lllllllllllllIIIIIIIIIIIlIlIlIIl + lllllllllllllIIIIIIIIIIIlIlIIllI, lllllllllllllIIIIIIIIIIIlIlIIlll - EntityAIFollowOwner.lIllIlIlIIllII[2], lllllllllllllIIIIIIIIIIIlIlIlIII + lllllllllllllIIIIIIIIIIIlIlIIlIl)) ? 1 : 0) && llllllIlIllIIIl(this.func_181065_a(new BlockPos(lllllllllllllIIIIIIIIIIIlIlIlIIl + lllllllllllllIIIIIIIIIIIlIlIIllI, lllllllllllllIIIIIIIIIIIlIlIIlll, lllllllllllllIIIIIIIIIIIlIlIlIII + lllllllllllllIIIIIIIIIIIlIlIIlIl)) ? 1 : 0) && llllllIlIllIIIl(this.func_181065_a(new BlockPos(lllllllllllllIIIIIIIIIIIlIlIlIIl + lllllllllllllIIIIIIIIIIIlIlIIllI, lllllllllllllIIIIIIIIIIIlIlIIlll + EntityAIFollowOwner.lIllIlIlIIllII[2], lllllllllllllIIIIIIIIIIIlIlIlIII + lllllllllllllIIIIIIIIIIIlIlIIlIl)) ? 1 : 0)) {
                                this.thePet.setLocationAndAngles(lllllllllllllIIIIIIIIIIIlIlIlIIl + lllllllllllllIIIIIIIIIIIlIlIIllI + 0.5f, lllllllllllllIIIIIIIIIIIlIlIIlll, lllllllllllllIIIIIIIIIIIlIlIlIII + lllllllllllllIIIIIIIIIIIlIlIIlIl + 0.5f, this.thePet.rotationYaw, this.thePet.rotationPitch);
                                this.petPathfinder.clearPathEntity();
                                return;
                            }
                            ++lllllllllllllIIIIIIIIIIIlIlIIlIl;
                        }
                        ++lllllllllllllIIIIIIIIIIIlIlIIllI;
                    }
                }
            }
        }
    }
    
    static {
        llllllIlIlIllII();
        llllllIlIlIIlIl();
    }
    
    private static void llllllIlIlIllII() {
        (lIllIlIlIIllII = new int[6])[0] = "   ".length();
        EntityAIFollowOwner.lIllIlIlIIllII[1] = ((0xD9 ^ 0x9D ^ (0xC4 ^ 0xB2)) & (45 + 156 - 162 + 124 ^ 0 + 76 + 8 + 61 ^ -" ".length()));
        EntityAIFollowOwner.lIllIlIlIIllII[2] = " ".length();
        EntityAIFollowOwner.lIllIlIlIIllII[3] = (72 + 175 - 200 + 132 ^ 158 + 39 - 38 + 26);
        EntityAIFollowOwner.lIllIlIlIIllII[4] = "  ".length();
        EntityAIFollowOwner.lIllIlIlIIllII[5] = (0x3D ^ 0x14 ^ (0x6B ^ 0x46));
    }
    
    private boolean func_181065_a(final BlockPos lllllllllllllIIIIIIIIIIIlIllIlll) {
        final IBlockState lllllllllllllIIIIIIIIIIIlIllIllI = this.theWorld.getBlockState(lllllllllllllIIIIIIIIIIIlIllIlll);
        final Block lllllllllllllIIIIIIIIIIIlIllIlIl = lllllllllllllIIIIIIIIIIIlIllIllI.getBlock();
        int n;
        if (llllllIlIllIlIl(lllllllllllllIIIIIIIIIIIlIllIlIl, Blocks.air)) {
            n = EntityAIFollowOwner.lIllIlIlIIllII[2];
            "".length();
            if (-" ".length() < -" ".length()) {
                return ((0xBE ^ 0xC0 ^ (0x7C ^ 0x5B)) & (0x66 ^ 0x53 ^ (0x75 ^ 0x19) ^ -" ".length())) != 0x0;
            }
        }
        else if (llllllIlIllIIIl(lllllllllllllIIIIIIIIIIIlIllIlIl.isFullCube() ? 1 : 0)) {
            n = EntityAIFollowOwner.lIllIlIlIIllII[1];
            "".length();
            if ((0x89 ^ 0x8D) <= ((0x14 ^ 0x3) & ~(0x30 ^ 0x27))) {
                return ((0x6B ^ 0x72) & ~(0x60 ^ 0x79)) != 0x0;
            }
        }
        else {
            n = EntityAIFollowOwner.lIllIlIlIIllII[2];
        }
        return n != 0;
    }
    
    private static boolean llllllIlIlllIll(final int lllllllllllllIIIIIIIIIIIIlllllII, final int lllllllllllllIIIIIIIIIIIIllllIlI) {
        return lllllllllllllIIIIIIIIIIIIlllllII <= lllllllllllllIIIIIIIIIIIIllllIlI;
    }
    
    @Override
    public boolean shouldExecute() {
        final EntityLivingBase lllllllllllllIIIIIIIIIIIllIIlIII = this.thePet.getOwner();
        if (llllllIlIllIIII(lllllllllllllIIIIIIIIIIIllIIlIII)) {
            return EntityAIFollowOwner.lIllIlIlIIllII[1] != 0;
        }
        if (llllllIlIllIIIl((lllllllllllllIIIIIIIIIIIllIIlIII instanceof EntityPlayer) ? 1 : 0) && llllllIlIllIIIl(((EntityPlayer)lllllllllllllIIIIIIIIIIIllIIlIII).isSpectator() ? 1 : 0)) {
            return EntityAIFollowOwner.lIllIlIlIIllII[1] != 0;
        }
        if (llllllIlIllIIIl(this.thePet.isSitting() ? 1 : 0)) {
            return EntityAIFollowOwner.lIllIlIlIIllII[1] != 0;
        }
        if (llllllIlIllIIlI(llllllIlIlIlllI(this.thePet.getDistanceSqToEntity(lllllllllllllIIIIIIIIIIIllIIlIII), this.minDist * this.minDist))) {
            return EntityAIFollowOwner.lIllIlIlIIllII[1] != 0;
        }
        this.theOwner = lllllllllllllIIIIIIIIIIIllIIlIII;
        return EntityAIFollowOwner.lIllIlIlIIllII[2] != 0;
    }
    
    private static boolean llllllIlIlllIII(final int lllllllllllllIIIIIIIIIIIIlIllIlI) {
        return lllllllllllllIIIIIIIIIIIIlIllIlI >= 0;
    }
    
    @Override
    public void resetTask() {
        this.theOwner = null;
        this.petPathfinder.clearPathEntity();
        ((PathNavigateGround)this.thePet.getNavigator()).setAvoidsWater((boolean)(EntityAIFollowOwner.lIllIlIlIIllII[2] != 0));
    }
    
    private static boolean llllllIlIllIIIl(final int lllllllllllllIIIIIIIIIIIIllIIIll) {
        return lllllllllllllIIIIIIIIIIIIllIIIll != 0;
    }
    
    private static int llllllIlIllIIll(final double n, final double n2) {
        return dcmpl(n, n2);
    }
    
    private static boolean llllllIlIllllII(final int lllllllllllllIIIIIIIIIIIIlllIlIl, final int lllllllllllllIIIIIIIIIIIIlllIlII) {
        return lllllllllllllIIIIIIIIIIIIlllIlIl > lllllllllllllIIIIIIIIIIIIlllIlII;
    }
    
    private static boolean llllllIlIlIllIl(final int lllllllllllllIIIIIIIIIIIIlIlllll) {
        return lllllllllllllIIIIIIIIIIIIlIlllll == 0;
    }
    
    private static void llllllIlIlIIlIl() {
        (lIllIlIlIIlIlI = new String[EntityAIFollowOwner.lIllIlIlIIllII[2]])[EntityAIFollowOwner.lIllIlIlIIllII[1]] = llllllIlIlIIIll("5DWeqVz7Lbgc7BDpO7fS1z5/Na7F4WgEL3apXmDpTucvl/BFV2UN3+IuwJWsBckx", "LQxQo");
    }
    
    @Override
    public void startExecuting() {
        this.field_75343_h = EntityAIFollowOwner.lIllIlIlIIllII[1];
        this.field_75344_i = ((PathNavigateGround)this.thePet.getNavigator()).getAvoidsWater();
        ((PathNavigateGround)this.thePet.getNavigator()).setAvoidsWater((boolean)(EntityAIFollowOwner.lIllIlIlIIllII[1] != 0));
    }
}
