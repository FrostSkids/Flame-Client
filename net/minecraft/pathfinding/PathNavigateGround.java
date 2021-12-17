// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.pathfinding;

import java.util.Iterator;
import net.minecraft.world.pathfinder.NodeProcessor;
import net.minecraft.entity.passive.EntityChicken;
import net.minecraft.entity.monster.EntityZombie;
import net.minecraft.world.World;
import net.minecraft.entity.EntityLiving;
import net.minecraft.world.IBlockAccess;
import net.minecraft.init.Blocks;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.util.BlockPos;
import net.minecraft.util.MathHelper;
import net.minecraft.util.Vec3;
import net.minecraft.world.pathfinder.WalkNodeProcessor;

public class PathNavigateGround extends PathNavigate
{
    private static final /* synthetic */ int[] lIIllIlIlIlIII;
    protected /* synthetic */ WalkNodeProcessor nodeProcessor;
    private /* synthetic */ boolean shouldAvoidSun;
    
    @Override
    protected boolean isDirectPathBetweenPoints(final Vec3 lllllllllllllIIlIlIlIlIllIIIIIll, final Vec3 lllllllllllllIIlIlIlIlIllIIllIII, int lllllllllllllIIlIlIlIlIllIIIIIIl, final int lllllllllllllIIlIlIlIlIllIIlIllI, int lllllllllllllIIlIlIlIlIllIIlIlIl) {
        int lllllllllllllIIlIlIlIlIllIIlIlII = MathHelper.floor_double(lllllllllllllIIlIlIlIlIllIIIIIll.xCoord);
        int lllllllllllllIIlIlIlIlIllIIlIIll = MathHelper.floor_double(lllllllllllllIIlIlIlIlIllIIIIIll.zCoord);
        double lllllllllllllIIlIlIlIlIllIIlIIlI = lllllllllllllIIlIlIlIlIllIIllIII.xCoord - lllllllllllllIIlIlIlIlIllIIIIIll.xCoord;
        double lllllllllllllIIlIlIlIlIllIIlIIIl = lllllllllllllIIlIlIlIlIllIIllIII.zCoord - lllllllllllllIIlIlIlIlIllIIIIIll.zCoord;
        final double lllllllllllllIIlIlIlIlIllIIlIIII = lllllllllllllIIlIlIlIlIllIIlIIlI * lllllllllllllIIlIlIlIlIllIIlIIlI + lllllllllllllIIlIlIlIlIllIIlIIIl * lllllllllllllIIlIlIlIlIllIIlIIIl;
        if (llIllIIIllIlllI(llIllIIIllIllII(lllllllllllllIIlIlIlIlIllIIlIIII, 1.0E-8))) {
            return PathNavigateGround.lIIllIlIlIlIII[1] != 0;
        }
        final double lllllllllllllIIlIlIlIlIllIIIllll = 1.0 / Math.sqrt(lllllllllllllIIlIlIlIlIllIIlIIII);
        lllllllllllllIIlIlIlIlIllIIlIIlI *= lllllllllllllIIlIlIlIlIllIIIllll;
        lllllllllllllIIlIlIlIlIllIIlIIIl *= lllllllllllllIIlIlIlIlIllIIIllll;
        lllllllllllllIIlIlIlIlIllIIIIIIl += 2;
        lllllllllllllIIlIlIlIlIllIIlIlIl += 2;
        if (llIllIIIllIIlll(this.isSafeToStandAt(lllllllllllllIIlIlIlIlIllIIlIlII, (int)lllllllllllllIIlIlIlIlIllIIIIIll.yCoord, lllllllllllllIIlIlIlIlIllIIlIIll, lllllllllllllIIlIlIlIlIllIIIIIIl, lllllllllllllIIlIlIlIlIllIIlIllI, lllllllllllllIIlIlIlIlIllIIlIlIl, lllllllllllllIIlIlIlIlIllIIIIIll, lllllllllllllIIlIlIlIlIllIIlIIlI, lllllllllllllIIlIlIlIlIllIIlIIIl) ? 1 : 0)) {
            return PathNavigateGround.lIIllIlIlIlIII[1] != 0;
        }
        lllllllllllllIIlIlIlIlIllIIIIIIl -= 2;
        lllllllllllllIIlIlIlIlIllIIlIlIl -= 2;
        final double lllllllllllllIIlIlIlIlIllIIIlllI = 1.0 / Math.abs(lllllllllllllIIlIlIlIlIllIIlIIlI);
        final double lllllllllllllIIlIlIlIlIllIIIllIl = 1.0 / Math.abs(lllllllllllllIIlIlIlIlIllIIlIIIl);
        double lllllllllllllIIlIlIlIlIllIIIllII = lllllllllllllIIlIlIlIlIllIIlIlII * PathNavigateGround.lIIllIlIlIlIII[0] - lllllllllllllIIlIlIlIlIllIIIIIll.xCoord;
        double lllllllllllllIIlIlIlIlIllIIIlIll = lllllllllllllIIlIlIlIlIllIIlIIll * PathNavigateGround.lIIllIlIlIlIII[0] - lllllllllllllIIlIlIlIlIllIIIIIll.zCoord;
        if (llIllIIIllIllll(llIllIIIllIllIl(lllllllllllllIIlIlIlIlIllIIlIIlI, 0.0))) {
            ++lllllllllllllIIlIlIlIlIllIIIllII;
        }
        if (llIllIIIllIllll(llIllIIIllIllIl(lllllllllllllIIlIlIlIlIllIIlIIIl, 0.0))) {
            ++lllllllllllllIIlIlIlIlIllIIIlIll;
        }
        lllllllllllllIIlIlIlIlIllIIIllII /= lllllllllllllIIlIlIlIlIllIIlIIlI;
        lllllllllllllIIlIlIlIlIllIIIlIll /= lllllllllllllIIlIlIlIlIllIIlIIIl;
        int n;
        if (llIllIIIllIlllI(llIllIIIllIllII(lllllllllllllIIlIlIlIlIllIIlIIlI, 0.0))) {
            n = PathNavigateGround.lIIllIlIlIlIII[3];
            "".length();
            if ("  ".length() == 0) {
                return ((130 + 55 - 93 + 134 ^ 38 + 92 - 35 + 66) & (0x40 ^ 0x18 ^ (0xBD ^ 0xA6) ^ -" ".length())) != 0x0;
            }
        }
        else {
            n = PathNavigateGround.lIIllIlIlIlIII[0];
        }
        final int lllllllllllllIIlIlIlIlIllIIIlIlI = n;
        int n2;
        if (llIllIIIllIlllI(llIllIIIllIllII(lllllllllllllIIlIlIlIlIllIIlIIIl, 0.0))) {
            n2 = PathNavigateGround.lIIllIlIlIlIII[3];
            "".length();
            if (null != null) {
                return ((0x71 ^ 0x4D ^ (0x58 ^ 0x2B)) & (0x36 ^ 0x13 ^ (0x76 ^ 0x1C) ^ -" ".length())) != 0x0;
            }
        }
        else {
            n2 = PathNavigateGround.lIIllIlIlIlIII[0];
        }
        final int lllllllllllllIIlIlIlIlIllIIIlIIl = n2;
        final int lllllllllllllIIlIlIlIlIllIIIlIII = MathHelper.floor_double(lllllllllllllIIlIlIlIlIllIIllIII.xCoord);
        final int lllllllllllllIIlIlIlIlIllIIIIlll = MathHelper.floor_double(lllllllllllllIIlIlIlIlIllIIllIII.zCoord);
        int lllllllllllllIIlIlIlIlIllIIIIllI = lllllllllllllIIlIlIlIlIllIIIlIII - lllllllllllllIIlIlIlIlIllIIlIlII;
        int lllllllllllllIIlIlIlIlIllIIIIlIl = lllllllllllllIIlIlIlIlIllIIIIlll - lllllllllllllIIlIlIlIlIllIIlIIll;
        "".length();
        if ((150 + 34 - 63 + 51 ^ 137 + 100 - 96 + 27) <= 0) {
            return ((0x76 ^ 0x3F ^ (0x3D ^ 0x49)) & (51 + 35 - 69 + 142 ^ 62 + 151 - 135 + 84 ^ -" ".length())) != 0x0;
        }
        while (!llIllIIIlllIIII(lllllllllllllIIlIlIlIlIllIIIIllI * lllllllllllllIIlIlIlIlIllIIIlIlI) || !llIllIIIlllIIII(lllllllllllllIIlIlIlIlIllIIIIlIl * lllllllllllllIIlIlIlIlIllIIIlIIl)) {
            if (llIllIIIllIlllI(llIllIIIllIllII(lllllllllllllIIlIlIlIlIllIIIllII, lllllllllllllIIlIlIlIlIllIIIlIll))) {
                lllllllllllllIIlIlIlIlIllIIIllII += lllllllllllllIIlIlIlIlIllIIIlllI;
                lllllllllllllIIlIlIlIlIllIIlIlII += lllllllllllllIIlIlIlIlIllIIIlIlI;
                lllllllllllllIIlIlIlIlIllIIIIllI = lllllllllllllIIlIlIlIlIllIIIlIII - lllllllllllllIIlIlIlIlIllIIlIlII;
                "".length();
                if (" ".length() < 0) {
                    return ((0x57 ^ 0x4B ^ (0xAE ^ 0x87)) & (0x73 ^ 0x30 ^ (0x6D ^ 0x1B) ^ -" ".length())) != 0x0;
                }
            }
            else {
                lllllllllllllIIlIlIlIlIllIIIlIll += lllllllllllllIIlIlIlIlIllIIIllIl;
                lllllllllllllIIlIlIlIlIllIIlIIll += lllllllllllllIIlIlIlIlIllIIIlIIl;
                lllllllllllllIIlIlIlIlIllIIIIlIl = lllllllllllllIIlIlIlIlIllIIIIlll - lllllllllllllIIlIlIlIlIllIIlIIll;
            }
            if (llIllIIIllIIlll(this.isSafeToStandAt(lllllllllllllIIlIlIlIlIllIIlIlII, (int)lllllllllllllIIlIlIlIlIllIIIIIll.yCoord, lllllllllllllIIlIlIlIlIllIIlIIll, lllllllllllllIIlIlIlIlIllIIIIIIl, lllllllllllllIIlIlIlIlIllIIlIllI, lllllllllllllIIlIlIlIlIllIIlIlIl, lllllllllllllIIlIlIlIlIllIIIIIll, lllllllllllllIIlIlIlIlIllIIlIIlI, lllllllllllllIIlIlIlIlIllIIlIIIl) ? 1 : 0)) {
                return PathNavigateGround.lIIllIlIlIlIII[1] != 0;
            }
        }
        return PathNavigateGround.lIIllIlIlIlIII[0] != 0;
    }
    
    public void setAvoidSun(final boolean lllllllllllllIIlIlIlIlIIlllIIllI) {
        this.shouldAvoidSun = lllllllllllllIIlIlIlIlIIlllIIllI;
    }
    
    private static void llIllIIIllIIllI() {
        (lIIllIlIlIlIII = new int[5])[0] = " ".length();
        PathNavigateGround.lIIllIlIlIlIII[1] = ((0x4F ^ 0x2E) & ~(0x57 ^ 0x36));
        PathNavigateGround.lIIllIlIlIlIII[2] = (0x1C ^ 0xC);
        PathNavigateGround.lIIllIlIlIlIII[3] = -" ".length();
        PathNavigateGround.lIIllIlIlIlIII[4] = "  ".length();
    }
    
    public boolean getCanSwim() {
        return this.nodeProcessor.getCanSwim();
    }
    
    private static boolean llIllIIIlllIIII(final int lllllllllllllIIlIlIlIlIIllIIllII) {
        return lllllllllllllIIlIlIlIlIIllIIllII <= 0;
    }
    
    private boolean isSafeToStandAt(final int lllllllllllllIIlIlIlIlIlIlIIlIIl, final int lllllllllllllIIlIlIlIlIlIlIIlIII, final int lllllllllllllIIlIlIlIlIlIlIIIlll, final int lllllllllllllIIlIlIlIlIlIlIIIllI, final int lllllllllllllIIlIlIlIlIlIlIlIlll, final int lllllllllllllIIlIlIlIlIlIlIlIllI, final Vec3 lllllllllllllIIlIlIlIlIlIlIlIlIl, final double lllllllllllllIIlIlIlIlIlIlIlIlII, final double lllllllllllllIIlIlIlIlIlIlIlIIll) {
        final int lllllllllllllIIlIlIlIlIlIlIlIIlI = lllllllllllllIIlIlIlIlIlIlIIlIIl - lllllllllllllIIlIlIlIlIlIlIIIllI / PathNavigateGround.lIIllIlIlIlIII[4];
        final int lllllllllllllIIlIlIlIlIlIlIlIIIl = lllllllllllllIIlIlIlIlIlIlIIIlll - lllllllllllllIIlIlIlIlIlIlIlIllI / PathNavigateGround.lIIllIlIlIlIII[4];
        if (llIllIIIllIIlll(this.isPositionClear(lllllllllllllIIlIlIlIlIlIlIlIIlI, lllllllllllllIIlIlIlIlIlIlIIlIII, lllllllllllllIIlIlIlIlIlIlIlIIIl, lllllllllllllIIlIlIlIlIlIlIIIllI, lllllllllllllIIlIlIlIlIlIlIlIlll, lllllllllllllIIlIlIlIlIlIlIlIllI, lllllllllllllIIlIlIlIlIlIlIlIlIl, lllllllllllllIIlIlIlIlIlIlIlIlII, lllllllllllllIIlIlIlIlIlIlIlIIll) ? 1 : 0)) {
            return PathNavigateGround.lIIllIlIlIlIII[1] != 0;
        }
        int lllllllllllllIIlIlIlIlIlIlIlIIII = lllllllllllllIIlIlIlIlIlIlIlIIlI;
        "".length();
        if (-"   ".length() >= 0) {
            return ((27 + 18 + 120 + 33 ^ 39 + 63 - 58 + 112) & (0x15 ^ 0x7F ^ (0xBA ^ 0x8A) ^ -" ".length())) != 0x0;
        }
        while (!llIllIIIllIlIll(lllllllllllllIIlIlIlIlIlIlIlIIII, lllllllllllllIIlIlIlIlIlIlIlIIlI + lllllllllllllIIlIlIlIlIlIlIIIllI)) {
            int lllllllllllllIIlIlIlIlIlIlIIllll = lllllllllllllIIlIlIlIlIlIlIlIIIl;
            "".length();
            if (null != null) {
                return ((0x55 ^ 0x18) & ~(0xC5 ^ 0x88)) != 0x0;
            }
            while (!llIllIIIllIlIll(lllllllllllllIIlIlIlIlIlIlIIllll, lllllllllllllIIlIlIlIlIlIlIlIIIl + lllllllllllllIIlIlIlIlIlIlIlIllI)) {
                final double lllllllllllllIIlIlIlIlIlIlIIlllI = lllllllllllllIIlIlIlIlIlIlIlIIII + 0.5 - lllllllllllllIIlIlIlIlIlIlIlIlIl.xCoord;
                final double lllllllllllllIIlIlIlIlIlIlIIllIl = lllllllllllllIIlIlIlIlIlIlIIllll + 0.5 - lllllllllllllIIlIlIlIlIlIlIlIlIl.zCoord;
                if (llIllIIIllIllll(llIllIIIlllIIIl(lllllllllllllIIlIlIlIlIlIlIIlllI * lllllllllllllIIlIlIlIlIlIlIlIlII + lllllllllllllIIlIlIlIlIlIlIIllIl * lllllllllllllIIlIlIlIlIlIlIlIIll, 0.0))) {
                    final Block lllllllllllllIIlIlIlIlIlIlIIllII = this.worldObj.getBlockState(new BlockPos(lllllllllllllIIlIlIlIlIlIlIlIIII, lllllllllllllIIlIlIlIlIlIlIIlIII - PathNavigateGround.lIIllIlIlIlIII[0], lllllllllllllIIlIlIlIlIlIlIIllll)).getBlock();
                    final Material lllllllllllllIIlIlIlIlIlIlIIlIll = lllllllllllllIIlIlIlIlIlIlIIllII.getMaterial();
                    if (llIllIIIlllIIll(lllllllllllllIIlIlIlIlIlIlIIlIll, Material.air)) {
                        return PathNavigateGround.lIIllIlIlIlIII[1] != 0;
                    }
                    if (llIllIIIlllIIll(lllllllllllllIIlIlIlIlIlIlIIlIll, Material.water) && llIllIIIllIIlll(this.theEntity.isInWater() ? 1 : 0)) {
                        return PathNavigateGround.lIIllIlIlIlIII[1] != 0;
                    }
                    if (llIllIIIlllIIll(lllllllllllllIIlIlIlIlIlIlIIlIll, Material.lava)) {
                        return PathNavigateGround.lIIllIlIlIlIII[1] != 0;
                    }
                }
                ++lllllllllllllIIlIlIlIlIlIlIIllll;
            }
            ++lllllllllllllIIlIlIlIlIlIlIlIIII;
        }
        return PathNavigateGround.lIIllIlIlIlIII[0] != 0;
    }
    
    public void setBreakDoors(final boolean lllllllllllllIIlIlIlIlIIlllllllI) {
        this.nodeProcessor.setBreakDoors(lllllllllllllIIlIlIlIlIIlllllllI);
    }
    
    public void setAvoidsWater(final boolean lllllllllllllIIlIlIlIlIlIIIIlIIl) {
        this.nodeProcessor.setAvoidsWater(lllllllllllllIIlIlIlIlIlIIIIlIIl);
    }
    
    private static int llIllIIIlllIlII(final double n, final double n2) {
        return dcmpl(n, n2);
    }
    
    private static boolean llIllIIIllIlIll(final int lllllllllllllIIlIlIlIlIIlllIIIll, final int lllllllllllllIIlIlIlIlIIlllIIIlI) {
        return lllllllllllllIIlIlIlIlIIlllIIIll >= lllllllllllllIIlIlIlIlIIlllIIIlI;
    }
    
    private static boolean llIllIIIllIllll(final int lllllllllllllIIlIlIlIlIIllIlIIII) {
        return lllllllllllllIIlIlIlIlIIllIlIIII >= 0;
    }
    
    private int getPathablePosY() {
        if (!llIllIIIllIlIII(this.theEntity.isInWater() ? 1 : 0) || !llIllIIIllIlIII(this.getCanSwim() ? 1 : 0)) {
            return (int)(this.theEntity.getEntityBoundingBox().minY + 0.5);
        }
        int lllllllllllllIIlIlIlIlIlllIIIIII = (int)this.theEntity.getEntityBoundingBox().minY;
        Block lllllllllllllIIlIlIlIlIllIllllll = this.worldObj.getBlockState(new BlockPos(MathHelper.floor_double(this.theEntity.posX), lllllllllllllIIlIlIlIlIlllIIIIII, MathHelper.floor_double(this.theEntity.posZ))).getBlock();
        int lllllllllllllIIlIlIlIlIllIlllllI = PathNavigateGround.lIIllIlIlIlIII[1];
        "".length();
        if ((0x76 ^ 0x72) < "  ".length()) {
            return (0x8F ^ 0xA2) & ~(0x5A ^ 0x77);
        }
        while (!llIllIIIllIlIlI(lllllllllllllIIlIlIlIlIllIllllll, Blocks.flowing_water) || !llIllIIIllIlIlI(lllllllllllllIIlIlIlIlIllIllllll, Blocks.water)) {
            ++lllllllllllllIIlIlIlIlIlllIIIIII;
            lllllllllllllIIlIlIlIlIllIllllll = this.worldObj.getBlockState(new BlockPos(MathHelper.floor_double(this.theEntity.posX), lllllllllllllIIlIlIlIlIlllIIIIII, MathHelper.floor_double(this.theEntity.posZ))).getBlock();
            if (llIllIIIllIlIIl(++lllllllllllllIIlIlIlIlIllIlllllI, PathNavigateGround.lIIllIlIlIlIII[2])) {
                return (int)this.theEntity.getEntityBoundingBox().minY;
            }
        }
        return lllllllllllllIIlIlIlIlIlllIIIIII;
    }
    
    static {
        llIllIIIllIIllI();
    }
    
    public void setEnterDoors(final boolean lllllllllllllIIlIlIlIlIIlllllIII) {
        this.nodeProcessor.setEnterDoors(lllllllllllllIIlIlIlIlIIlllllIII);
    }
    
    private boolean isPositionClear(final int lllllllllllllIIlIlIlIlIlIIlIlIII, final int lllllllllllllIIlIlIlIlIlIIIllIIl, final int lllllllllllllIIlIlIlIlIlIIlIIllI, final int lllllllllllllIIlIlIlIlIlIIIlIlll, final int lllllllllllllIIlIlIlIlIlIIlIIlII, final int lllllllllllllIIlIlIlIlIlIIIlIlIl, final Vec3 lllllllllllllIIlIlIlIlIlIIlIIIlI, final double lllllllllllllIIlIlIlIlIlIIlIIIIl, final double lllllllllllllIIlIlIlIlIlIIlIIIII) {
        final short lllllllllllllIIlIlIlIlIlIIIlIIII = (short)BlockPos.getAllInBox(new BlockPos(lllllllllllllIIlIlIlIlIlIIlIlIII, lllllllllllllIIlIlIlIlIlIIIllIIl, lllllllllllllIIlIlIlIlIlIIlIIllI), new BlockPos(lllllllllllllIIlIlIlIlIlIIlIlIII + lllllllllllllIIlIlIlIlIlIIIlIlll - PathNavigateGround.lIIllIlIlIlIII[0], lllllllllllllIIlIlIlIlIlIIIllIIl + lllllllllllllIIlIlIlIlIlIIlIIlII - PathNavigateGround.lIIllIlIlIlIII[0], lllllllllllllIIlIlIlIlIlIIlIIllI + lllllllllllllIIlIlIlIlIlIIIlIlIl - PathNavigateGround.lIIllIlIlIlIII[0])).iterator();
        "".length();
        if ("   ".length() != "   ".length()) {
            return ((0x34 ^ 0x7C) & ~(0xC5 ^ 0x8D)) != 0x0;
        }
        while (!llIllIIIllIIlll(((Iterator)lllllllllllllIIlIlIlIlIlIIIlIIII).hasNext() ? 1 : 0)) {
            final BlockPos lllllllllllllIIlIlIlIlIlIIIlllll = ((Iterator<BlockPos>)lllllllllllllIIlIlIlIlIlIIIlIIII).next();
            final double lllllllllllllIIlIlIlIlIlIIIllllI = lllllllllllllIIlIlIlIlIlIIIlllll.getX() + 0.5 - lllllllllllllIIlIlIlIlIlIIlIIIlI.xCoord;
            final double lllllllllllllIIlIlIlIlIlIIIlllIl = lllllllllllllIIlIlIlIlIlIIIlllll.getZ() + 0.5 - lllllllllllllIIlIlIlIlIlIIlIIIlI.zCoord;
            if (llIllIIIllIllll(llIllIIIlllIlII(lllllllllllllIIlIlIlIlIlIIIllllI * lllllllllllllIIlIlIlIlIlIIlIIIIl + lllllllllllllIIlIlIlIlIlIIIlllIl * lllllllllllllIIlIlIlIlIlIIlIIIII, 0.0))) {
                final Block lllllllllllllIIlIlIlIlIlIIIlllII = this.worldObj.getBlockState(lllllllllllllIIlIlIlIlIlIIIlllll).getBlock();
                if (llIllIIIllIIlll(lllllllllllllIIlIlIlIlIlIIIlllII.isPassable(this.worldObj, lllllllllllllIIlIlIlIlIlIIIlllll) ? 1 : 0)) {
                    return PathNavigateGround.lIIllIlIlIlIII[1] != 0;
                }
                continue;
            }
        }
        return PathNavigateGround.lIIllIlIlIlIII[0] != 0;
    }
    
    private static boolean llIllIIIllIIlll(final int lllllllllllllIIlIlIlIlIIllIlIIlI) {
        return lllllllllllllIIlIlIlIlIIllIlIIlI == 0;
    }
    
    @Override
    protected void removeSunnyPath() {
        super.removeSunnyPath();
        if (llIllIIIllIlIII(this.shouldAvoidSun ? 1 : 0)) {
            if (llIllIIIllIlIII(this.worldObj.canSeeSky(new BlockPos(MathHelper.floor_double(this.theEntity.posX), (int)(this.theEntity.getEntityBoundingBox().minY + 0.5), MathHelper.floor_double(this.theEntity.posZ))) ? 1 : 0)) {
                return;
            }
            int lllllllllllllIIlIlIlIlIllIllIlIl = PathNavigateGround.lIIllIlIlIlIII[1];
            "".length();
            if ((" ".length() & (" ".length() ^ -" ".length())) != 0x0) {
                return;
            }
            while (!llIllIIIllIlIll(lllllllllllllIIlIlIlIlIllIllIlIl, this.currentPath.getCurrentPathLength())) {
                final PathPoint lllllllllllllIIlIlIlIlIllIllIlII = this.currentPath.getPathPointFromIndex(lllllllllllllIIlIlIlIlIllIllIlIl);
                if (llIllIIIllIlIII(this.worldObj.canSeeSky(new BlockPos(lllllllllllllIIlIlIlIlIllIllIlII.xCoord, lllllllllllllIIlIlIlIlIllIllIlII.yCoord, lllllllllllllIIlIlIlIlIllIllIlII.zCoord)) ? 1 : 0)) {
                    this.currentPath.setCurrentPathLength(lllllllllllllIIlIlIlIlIllIllIlIl - PathNavigateGround.lIIllIlIlIlIII[0]);
                    return;
                }
                ++lllllllllllllIIlIlIlIlIllIllIlIl;
            }
        }
    }
    
    public void setCanSwim(final boolean lllllllllllllIIlIlIlIlIIlllIllll) {
        this.nodeProcessor.setCanSwim(lllllllllllllIIlIlIlIlIIlllIllll);
    }
    
    private static boolean llIllIIIlllIIll(final Object lllllllllllllIIlIlIlIlIIllIlIlll, final Object lllllllllllllIIlIlIlIlIIllIlIllI) {
        return lllllllllllllIIlIlIlIlIIllIlIlll == lllllllllllllIIlIlIlIlIIllIlIllI;
    }
    
    public PathNavigateGround(final EntityLiving lllllllllllllIIlIlIlIlIlllIlIIll, final World lllllllllllllIIlIlIlIlIlllIlIIlI) {
        super(lllllllllllllIIlIlIlIlIlllIlIIll, lllllllllllllIIlIlIlIlIlllIlIIlI);
    }
    
    public boolean getAvoidsWater() {
        return this.nodeProcessor.getAvoidsWater();
    }
    
    @Override
    protected Vec3 getEntityPosition() {
        return new Vec3(this.theEntity.posX, this.getPathablePosY(), this.theEntity.posZ);
    }
    
    private static int llIllIIIllIllII(final double n, final double n2) {
        return dcmpg(n, n2);
    }
    
    @Override
    protected boolean canNavigate() {
        if (llIllIIIllIIlll(this.theEntity.onGround ? 1 : 0) && (!llIllIIIllIlIII(this.getCanSwim() ? 1 : 0) || llIllIIIllIIlll(this.isInLiquid() ? 1 : 0)) && (!llIllIIIllIlIII(this.theEntity.isRiding() ? 1 : 0) || !llIllIIIllIlIII((this.theEntity instanceof EntityZombie) ? 1 : 0) || llIllIIIllIIlll((this.theEntity.ridingEntity instanceof EntityChicken) ? 1 : 0))) {
            return PathNavigateGround.lIIllIlIlIlIII[1] != 0;
        }
        return PathNavigateGround.lIIllIlIlIlIII[0] != 0;
    }
    
    @Override
    protected PathFinder getPathFinder() {
        this.nodeProcessor = new WalkNodeProcessor();
        this.nodeProcessor.setEnterDoors((boolean)(PathNavigateGround.lIIllIlIlIlIII[0] != 0));
        return new PathFinder(this.nodeProcessor);
    }
    
    private static int llIllIIIlllIIIl(final double n, final double n2) {
        return dcmpl(n, n2);
    }
    
    private static int llIllIIIllIllIl(final double n, final double n2) {
        return dcmpl(n, n2);
    }
    
    private static boolean llIllIIIllIlIlI(final Object lllllllllllllIIlIlIlIlIIllIllIll, final Object lllllllllllllIIlIlIlIlIIllIllIlI) {
        return lllllllllllllIIlIlIlIlIIllIllIll != lllllllllllllIIlIlIlIlIIllIllIlI;
    }
    
    public boolean getEnterDoors() {
        return this.nodeProcessor.getEnterDoors();
    }
    
    private static boolean llIllIIIllIlIII(final int lllllllllllllIIlIlIlIlIIllIlIlII) {
        return lllllllllllllIIlIlIlIlIIllIlIlII != 0;
    }
    
    private static boolean llIllIIIllIlIIl(final int lllllllllllllIIlIlIlIlIIllIlllll, final int lllllllllllllIIlIlIlIlIIllIllllI) {
        return lllllllllllllIIlIlIlIlIIllIlllll > lllllllllllllIIlIlIlIlIIllIllllI;
    }
    
    private static boolean llIllIIIllIlllI(final int lllllllllllllIIlIlIlIlIIllIIlllI) {
        return lllllllllllllIIlIlIlIlIIllIIlllI < 0;
    }
}
