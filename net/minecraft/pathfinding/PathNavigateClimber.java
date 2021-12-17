// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.pathfinding;

import net.minecraft.util.MathHelper;
import net.minecraft.world.World;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.Entity;
import net.minecraft.util.BlockPos;

public class PathNavigateClimber extends PathNavigateGround
{
    private /* synthetic */ BlockPos targetPosition;
    private static final /* synthetic */ int[] lllIIlIlIlllIl;
    
    @Override
    public boolean tryMoveToEntityLiving(final Entity llllllllllllIlIllllIIlllllIIllll, final double llllllllllllIlIllllIIlllllIIlIlI) {
        final PathEntity llllllllllllIlIllllIIlllllIIllIl = this.getPathToEntityLiving(llllllllllllIlIllllIIlllllIIllll);
        if (lIIllllllIlIllll(llllllllllllIlIllllIIlllllIIllIl)) {
            return this.setPath(llllllllllllIlIllllIIlllllIIllIl, llllllllllllIlIllllIIlllllIIlIlI);
        }
        this.targetPosition = new BlockPos(llllllllllllIlIllllIIlllllIIllll);
        this.speed = llllllllllllIlIllllIIlllllIIlIlI;
        return PathNavigateClimber.lllIIlIlIlllIl[0] != 0;
    }
    
    @Override
    public PathEntity getPathToEntityLiving(final Entity llllllllllllIlIllllIIlllllIlIlIl) {
        this.targetPosition = new BlockPos(llllllllllllIlIllllIIlllllIlIlIl);
        return super.getPathToEntityLiving(llllllllllllIlIllllIIlllllIlIlIl);
    }
    
    private static boolean lIIllllllIllIIll(final int llllllllllllIlIllllIIllllIllllIl) {
        return llllllllllllIlIllllIIllllIllllIl >= 0;
    }
    
    static {
        lIIllllllIlIlllI();
    }
    
    private static boolean lIIllllllIllIIlI(final int llllllllllllIlIllllIIllllIllllll) {
        return llllllllllllIlIllllIIllllIllllll == 0;
    }
    
    private static int lIIllllllIllIIII(final double n, final double n2) {
        return dcmpl(n, n2);
    }
    
    private static boolean lIIllllllIlIllll(final Object llllllllllllIlIllllIIlllllIIIIIl) {
        return llllllllllllIlIllllIIlllllIIIIIl != null;
    }
    
    private static int lIIllllllIllIIIl(final double n, final double n2) {
        return dcmpg(n, n2);
    }
    
    public PathNavigateClimber(final EntityLiving llllllllllllIlIllllIIllllllIIIlI, final World llllllllllllIlIllllIIllllllIIlII) {
        super(llllllllllllIlIllllIIllllllIIIlI, llllllllllllIlIllllIIllllllIIlII);
    }
    
    @Override
    public PathEntity getPathToPos(final BlockPos llllllllllllIlIllllIIlllllIlllIl) {
        this.targetPosition = llllllllllllIlIllllIIlllllIlllIl;
        return super.getPathToPos(llllllllllllIlIllllIIlllllIlllIl);
    }
    
    private static boolean lIIllllllIllIlII(final int llllllllllllIlIllllIIllllIlllIll) {
        return llllllllllllIlIllllIIllllIlllIll > 0;
    }
    
    private static void lIIllllllIlIlllI() {
        (lllIIlIlIlllIl = new int[1])[0] = " ".length();
    }
    
    @Override
    public void onUpdateNavigation() {
        if (lIIllllllIllIIlI(this.noPath() ? 1 : 0)) {
            super.onUpdateNavigation();
            "".length();
            if (null != null) {
                return;
            }
        }
        else if (lIIllllllIlIllll(this.targetPosition)) {
            final double llllllllllllIlIllllIIlllllIIIlIl = this.theEntity.width * this.theEntity.width;
            if (lIIllllllIllIIll(lIIllllllIllIIII(this.theEntity.getDistanceSqToCenter(this.targetPosition), llllllllllllIlIllllIIlllllIIIlIl)) && (!lIIllllllIllIlII(lIIllllllIllIIIl(this.theEntity.posY, this.targetPosition.getY())) || lIIllllllIllIIll(lIIllllllIllIIII(this.theEntity.getDistanceSqToCenter(new BlockPos(this.targetPosition.getX(), MathHelper.floor_double(this.theEntity.posY), this.targetPosition.getZ())), llllllllllllIlIllllIIlllllIIIlIl)))) {
                this.theEntity.getMoveHelper().setMoveTo(this.targetPosition.getX(), this.targetPosition.getY(), this.targetPosition.getZ(), this.speed);
                "".length();
                if (-"   ".length() > 0) {
                    return;
                }
            }
            else {
                this.targetPosition = null;
            }
        }
    }
}
