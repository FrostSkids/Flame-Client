// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.pathfinding;

import java.util.Iterator;
import net.minecraft.entity.SharedMonsterAttributes;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.List;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.MathHelper;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.ChunkCache;
import net.minecraft.entity.Entity;
import net.minecraft.util.BlockPos;
import net.minecraft.util.Vec3;
import net.minecraft.world.World;
import net.minecraft.entity.ai.attributes.IAttributeInstance;
import net.minecraft.entity.EntityLiving;

public abstract class PathNavigate
{
    private /* synthetic */ int totalTicks;
    protected /* synthetic */ PathEntity currentPath;
    protected /* synthetic */ double speed;
    private /* synthetic */ float heightRequirement;
    private final /* synthetic */ PathFinder pathFinder;
    protected /* synthetic */ EntityLiving theEntity;
    private static final /* synthetic */ int[] lllIIIIlIlllll;
    private final /* synthetic */ IAttributeInstance pathSearchRange;
    private static final /* synthetic */ String[] lllIIIIlIllllI;
    private /* synthetic */ int ticksAtLastPos;
    protected /* synthetic */ World worldObj;
    private /* synthetic */ Vec3 lastPosCheck;
    
    private static boolean lIIlllIIlIllIIIl(final int llllllllllllIllIIIIlIlIIlIIIlIII) {
        return llllllllllllIllIIIIlIlIIlIIIlIII == 0;
    }
    
    public void setHeightRequirement(final float llllllllllllIllIIIIlIlIlIIlIlIIl) {
        this.heightRequirement = llllllllllllIllIIIIlIlIlIIlIlIIl;
    }
    
    public PathEntity getPathToPos(final BlockPos llllllllllllIllIIIIlIlIlIlIIIllI) {
        if (lIIlllIIlIllIIIl(this.canNavigate() ? 1 : 0)) {
            return null;
        }
        final float llllllllllllIllIIIIlIlIlIlIIllII = this.getPathSearchRange();
        this.worldObj.theProfiler.startSection(PathNavigate.lllIIIIlIllllI[PathNavigate.lllIIIIlIlllll[0]]);
        final BlockPos llllllllllllIllIIIIlIlIlIlIIlIll = new BlockPos(this.theEntity);
        final int llllllllllllIllIIIIlIlIlIlIIlIlI = (int)(llllllllllllIllIIIIlIlIlIlIIllII + 8.0f);
        final ChunkCache llllllllllllIllIIIIlIlIlIlIIlIIl = new ChunkCache(this.worldObj, llllllllllllIllIIIIlIlIlIlIIlIll.add(-llllllllllllIllIIIIlIlIlIlIIlIlI, -llllllllllllIllIIIIlIlIlIlIIlIlI, -llllllllllllIllIIIIlIlIlIlIIlIlI), llllllllllllIllIIIIlIlIlIlIIlIll.add(llllllllllllIllIIIIlIlIlIlIIlIlI, llllllllllllIllIIIIlIlIlIlIIlIlI, llllllllllllIllIIIIlIlIlIlIIlIlI), PathNavigate.lllIIIIlIlllll[0]);
        final PathEntity llllllllllllIllIIIIlIlIlIlIIlIII = this.pathFinder.createEntityPathTo(llllllllllllIllIIIIlIlIlIlIIlIIl, this.theEntity, llllllllllllIllIIIIlIlIlIlIIIllI, llllllllllllIllIIIIlIlIlIlIIllII);
        this.worldObj.theProfiler.endSection();
        return llllllllllllIllIIIIlIlIlIlIIlIII;
    }
    
    private static boolean lIIlllIIlIlllIII(final int llllllllllllIllIIIIlIlIIlIIlllIl, final int llllllllllllIllIIIIlIlIIlIIlllII) {
        return llllllllllllIllIIIIlIlIIlIIlllIl == llllllllllllIllIIIIlIlIIlIIlllII;
    }
    
    public boolean noPath() {
        if (lIIlllIIlIllIIlI(this.currentPath) && lIIlllIIlIllIIIl(this.currentPath.isFinished() ? 1 : 0)) {
            return PathNavigate.lllIIIIlIlllll[0] != 0;
        }
        return PathNavigate.lllIIIIlIlllll[1] != 0;
    }
    
    protected boolean isInLiquid() {
        if (lIIlllIIlIllIIIl(this.theEntity.isInWater() ? 1 : 0) && lIIlllIIlIllIIIl(this.theEntity.isInLava() ? 1 : 0)) {
            return PathNavigate.lllIIIIlIlllll[0] != 0;
        }
        return PathNavigate.lllIIIIlIlllll[1] != 0;
    }
    
    private static boolean lIIlllIIlIllIlIl(final int llllllllllllIllIIIIlIlIIlIIIlIlI) {
        return llllllllllllIllIIIIlIlIIlIIIlIlI != 0;
    }
    
    protected abstract Vec3 getEntityPosition();
    
    public void onUpdateNavigation() {
        this.totalTicks += PathNavigate.lllIIIIlIlllll[1];
        if (lIIlllIIlIllIIIl(this.noPath() ? 1 : 0)) {
            if (lIIlllIIlIllIlIl(this.canNavigate() ? 1 : 0)) {
                this.pathFollow();
                "".length();
                if (-" ".length() > 0) {
                    return;
                }
            }
            else if (lIIlllIIlIllIIlI(this.currentPath) && lIIlllIIlIllIllI(this.currentPath.getCurrentPathIndex(), this.currentPath.getCurrentPathLength())) {
                final Vec3 llllllllllllIllIIIIlIlIIllllIIII = this.getEntityPosition();
                final Vec3 llllllllllllIllIIIIlIlIIlllIllll = this.currentPath.getVectorFromIndex(this.theEntity, this.currentPath.getCurrentPathIndex());
                if (lIIlllIIlIllIlll(lIIlllIIlIllIlII(llllllllllllIllIIIIlIlIIllllIIII.yCoord, llllllllllllIllIIIIlIlIIlllIllll.yCoord)) && lIIlllIIlIllIIIl(this.theEntity.onGround ? 1 : 0) && lIIlllIIlIlllIII(MathHelper.floor_double(llllllllllllIllIIIIlIlIIllllIIII.xCoord), MathHelper.floor_double(llllllllllllIllIIIIlIlIIlllIllll.xCoord)) && lIIlllIIlIlllIII(MathHelper.floor_double(llllllllllllIllIIIIlIlIIllllIIII.zCoord), MathHelper.floor_double(llllllllllllIllIIIIlIlIIlllIllll.zCoord))) {
                    this.currentPath.setCurrentPathIndex(this.currentPath.getCurrentPathIndex() + PathNavigate.lllIIIIlIlllll[1]);
                }
            }
            if (lIIlllIIlIllIIIl(this.noPath() ? 1 : 0)) {
                final Vec3 llllllllllllIllIIIIlIlIIlllIlllI = this.currentPath.getPosition(this.theEntity);
                if (lIIlllIIlIllIIlI(llllllllllllIllIIIIlIlIIlllIlllI)) {
                    AxisAlignedBB llllllllllllIllIIIIlIlIIlllIllIl = new AxisAlignedBB(llllllllllllIllIIIIlIlIIlllIlllI.xCoord, llllllllllllIllIIIIlIlIIlllIlllI.yCoord, llllllllllllIllIIIIlIlIIlllIlllI.zCoord, llllllllllllIllIIIIlIlIIlllIlllI.xCoord, llllllllllllIllIIIIlIlIIlllIlllI.yCoord, llllllllllllIllIIIIlIlIIlllIlllI.zCoord).expand(0.5, 0.5, 0.5);
                    final List<AxisAlignedBB> llllllllllllIllIIIIlIlIIlllIllII = this.worldObj.getCollidingBoundingBoxes(this.theEntity, llllllllllllIllIIIIlIlIIlllIllIl.addCoord(0.0, -1.0, 0.0));
                    double llllllllllllIllIIIIlIlIIlllIlIll = -1.0;
                    llllllllllllIllIIIIlIlIIlllIllIl = llllllllllllIllIIIIlIlIIlllIllIl.offset(0.0, 1.0, 0.0);
                    final double llllllllllllIllIIIIlIlIIlllIIIll = (double)llllllllllllIllIIIIlIlIIlllIllII.iterator();
                    "".length();
                    if (" ".length() >= (87 + 43 - 86 + 112 ^ 47 + 31 - 33 + 107)) {
                        return;
                    }
                    while (!lIIlllIIlIllIIIl(((Iterator)llllllllllllIllIIIIlIlIIlllIIIll).hasNext() ? 1 : 0)) {
                        final AxisAlignedBB llllllllllllIllIIIIlIlIIlllIlIlI = ((Iterator<AxisAlignedBB>)llllllllllllIllIIIIlIlIIlllIIIll).next();
                        llllllllllllIllIIIIlIlIIlllIlIll = llllllllllllIllIIIIlIlIIlllIlIlI.calculateYOffset(llllllllllllIllIIIIlIlIIlllIllIl, llllllllllllIllIIIIlIlIIlllIlIll);
                    }
                    this.theEntity.getMoveHelper().setMoveTo(llllllllllllIllIIIIlIlIIlllIlllI.xCoord, llllllllllllIllIIIIlIlIIlllIlllI.yCoord + llllllllllllIllIIIIlIlIIlllIlIll, llllllllllllIllIIIIlIlIIlllIlllI.zCoord, this.speed);
                }
            }
        }
    }
    
    private static boolean lIIlllIIlIllIlll(final int llllllllllllIllIIIIlIlIIlIIIIlII) {
        return llllllllllllIllIIIIlIlIIlIIIIlII > 0;
    }
    
    public PathEntity getPathToEntityLiving(final Entity llllllllllllIllIIIIlIlIlIIlIIIII) {
        if (lIIlllIIlIllIIIl(this.canNavigate() ? 1 : 0)) {
            return null;
        }
        final float llllllllllllIllIIIIlIlIlIIIlllll = this.getPathSearchRange();
        this.worldObj.theProfiler.startSection(PathNavigate.lllIIIIlIllllI[PathNavigate.lllIIIIlIlllll[1]]);
        final BlockPos llllllllllllIllIIIIlIlIlIIIllllI = new BlockPos(this.theEntity).up();
        final int llllllllllllIllIIIIlIlIlIIIlllIl = (int)(llllllllllllIllIIIIlIlIlIIIlllll + 16.0f);
        final ChunkCache llllllllllllIllIIIIlIlIlIIIlllII = new ChunkCache(this.worldObj, llllllllllllIllIIIIlIlIlIIIllllI.add(-llllllllllllIllIIIIlIlIlIIIlllIl, -llllllllllllIllIIIIlIlIlIIIlllIl, -llllllllllllIllIIIIlIlIlIIIlllIl), llllllllllllIllIIIIlIlIlIIIllllI.add(llllllllllllIllIIIIlIlIlIIIlllIl, llllllllllllIllIIIIlIlIlIIIlllIl, llllllllllllIllIIIIlIlIlIIIlllIl), PathNavigate.lllIIIIlIlllll[0]);
        final PathEntity llllllllllllIllIIIIlIlIlIIIllIll = this.pathFinder.createEntityPathTo(llllllllllllIllIIIIlIlIlIIIlllII, this.theEntity, llllllllllllIllIIIIlIlIlIIlIIIII, llllllllllllIllIIIIlIlIlIIIlllll);
        this.worldObj.theProfiler.endSection();
        return llllllllllllIllIIIIlIlIlIIIllIll;
    }
    
    private static boolean lIIlllIIlIllIllI(final int llllllllllllIllIIIIlIlIIlIIlIlIl, final int llllllllllllIllIIIIlIlIIlIIlIlII) {
        return llllllllllllIllIIIIlIlIIlIIlIlIl < llllllllllllIllIIIIlIlIIlIIlIlII;
    }
    
    private static void lIIlllIIlIlIllll() {
        (lllIIIIlIllllI = new String[PathNavigate.lllIIIIlIlllll[3]])[PathNavigate.lllIIIIlIlllll[0]] = lIIlllIIlIlIlllI("JSAaLRI8Lwo=", "UAnEt");
        PathNavigate.lllIIIIlIllllI[PathNavigate.lllIIIIlIlllll[1]] = lIIlllIIlIlIlllI("NAAhBAAtDzE=", "DaUlf");
    }
    
    public void setSpeed(final double llllllllllllIllIIIIlIlIlIllIIlll) {
        this.speed = llllllllllllIllIIIIlIlIlIllIIlll;
    }
    
    private static void lIIlllIIlIllIIII() {
        (lllIIIIlIlllll = new int[4])[0] = ((0xC1 ^ 0x8F ^ (0xF ^ 0x5B)) & (115 + 74 - 45 + 73 ^ 125 + 124 - 112 + 58 ^ -" ".length()));
        PathNavigate.lllIIIIlIlllll[1] = " ".length();
        PathNavigate.lllIIIIlIlllll[2] = (0xE ^ 0x6A);
        PathNavigate.lllIIIIlIlllll[3] = "  ".length();
    }
    
    public boolean tryMoveToXYZ(final double llllllllllllIllIIIIlIlIlIIllIIll, final double llllllllllllIllIIIIlIlIlIIlllIII, final double llllllllllllIllIIIIlIlIlIIllIIIl, final double llllllllllllIllIIIIlIlIlIIllIllI) {
        final PathEntity llllllllllllIllIIIIlIlIlIIllIlIl = this.getPathToXYZ(MathHelper.floor_double(llllllllllllIllIIIIlIlIlIIllIIll), (int)llllllllllllIllIIIIlIlIlIIlllIII, MathHelper.floor_double(llllllllllllIllIIIIlIlIlIIllIIIl));
        return this.setPath(llllllllllllIllIIIIlIlIlIIllIlIl, llllllllllllIllIIIIlIlIlIIllIllI);
    }
    
    public void clearPathEntity() {
        this.currentPath = null;
    }
    
    protected void checkForStuck(final Vec3 llllllllllllIllIIIIlIlIIllIIIIlI) {
        if (lIIlllIIlIlllllI(this.totalTicks - this.ticksAtLastPos, PathNavigate.lllIIIIlIlllll[2])) {
            if (lIIlllIIlIllllII(lIIlllIIlIllllIl(llllllllllllIllIIIIlIlIIllIIIIlI.squareDistanceTo(this.lastPosCheck), 2.25))) {
                this.clearPathEntity();
            }
            this.ticksAtLastPos = this.totalTicks;
            this.lastPosCheck = llllllllllllIllIIIIlIlIIllIIIIlI;
        }
    }
    
    private static int lIIlllIIlIllIlII(final double n, final double n2) {
        return dcmpl(n, n2);
    }
    
    protected void removeSunnyPath() {
    }
    
    private static int lIIlllIIlIlllIIl(final double n, final double n2) {
        return dcmpg(n, n2);
    }
    
    static {
        lIIlllIIlIllIIII();
        lIIlllIIlIlIllll();
    }
    
    protected abstract boolean canNavigate();
    
    private static boolean lIIlllIIlIlllllI(final int llllllllllllIllIIIIlIlIIlIIlIIIl, final int llllllllllllIllIIIIlIlIIlIIlIIII) {
        return llllllllllllIllIIIIlIlIIlIIlIIIl > llllllllllllIllIIIIlIlIIlIIlIIII;
    }
    
    public boolean setPath(final PathEntity llllllllllllIllIIIIlIlIIlllllllI, final double llllllllllllIllIIIIlIlIIllllllIl) {
        if (lIIlllIIlIllIIll(llllllllllllIllIIIIlIlIIlllllllI)) {
            this.currentPath = null;
            return PathNavigate.lllIIIIlIlllll[0] != 0;
        }
        if (lIIlllIIlIllIIIl(llllllllllllIllIIIIlIlIIlllllllI.isSamePath(this.currentPath) ? 1 : 0)) {
            this.currentPath = llllllllllllIllIIIIlIlIIlllllllI;
        }
        this.removeSunnyPath();
        if (lIIlllIIlIllIIIl(this.currentPath.getCurrentPathLength())) {
            return PathNavigate.lllIIIIlIlllll[0] != 0;
        }
        this.speed = llllllllllllIllIIIIlIlIIllllllIl;
        final Vec3 llllllllllllIllIIIIlIlIlIIIIIIII = this.getEntityPosition();
        this.ticksAtLastPos = this.totalTicks;
        this.lastPosCheck = llllllllllllIllIIIIlIlIlIIIIIIII;
        return PathNavigate.lllIIIIlIlllll[1] != 0;
    }
    
    private static boolean lIIlllIIlIllllII(final int llllllllllllIllIIIIlIlIIlIIIIllI) {
        return llllllllllllIllIIIIlIlIIlIIIIllI < 0;
    }
    
    public boolean tryMoveToEntityLiving(final Entity llllllllllllIllIIIIlIlIlIIIIlIlI, final double llllllllllllIllIIIIlIlIlIIIIlIIl) {
        final PathEntity llllllllllllIllIIIIlIlIlIIIIllII = this.getPathToEntityLiving(llllllllllllIllIIIIlIlIlIIIIlIlI);
        int setPath;
        if (lIIlllIIlIllIIlI(llllllllllllIllIIIIlIlIlIIIIllII)) {
            setPath = (this.setPath(llllllllllllIllIIIIlIlIlIIIIllII, llllllllllllIllIIIIlIlIlIIIIlIIl) ? 1 : 0);
            "".length();
            if (" ".length() == 0) {
                return ((0xDC ^ 0x80 ^ (0x4E ^ 0x59)) & (0x43 ^ 0xA ^ "  ".length() ^ -" ".length())) != 0x0;
            }
        }
        else {
            setPath = PathNavigate.lllIIIIlIlllll[0];
        }
        return setPath != 0;
    }
    
    private static String lIIlllIIlIlIlllI(String llllllllllllIllIIIIlIlIIlIlIlIII, final String llllllllllllIllIIIIlIlIIlIlIIlll) {
        llllllllllllIllIIIIlIlIIlIlIlIII = new String(Base64.getDecoder().decode(llllllllllllIllIIIIlIlIIlIlIlIII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder llllllllllllIllIIIIlIlIIlIlIlIll = new StringBuilder();
        final char[] llllllllllllIllIIIIlIlIIlIlIlIlI = llllllllllllIllIIIIlIlIIlIlIIlll.toCharArray();
        int llllllllllllIllIIIIlIlIIlIlIlIIl = PathNavigate.lllIIIIlIlllll[0];
        final Exception llllllllllllIllIIIIlIlIIlIlIIIll = (Object)llllllllllllIllIIIIlIlIIlIlIlIII.toCharArray();
        final int llllllllllllIllIIIIlIlIIlIlIIIlI = llllllllllllIllIIIIlIlIIlIlIIIll.length;
        Exception llllllllllllIllIIIIlIlIIlIlIIIIl = (Exception)PathNavigate.lllIIIIlIlllll[0];
        while (lIIlllIIlIllIllI((int)llllllllllllIllIIIIlIlIIlIlIIIIl, llllllllllllIllIIIIlIlIIlIlIIIlI)) {
            final char llllllllllllIllIIIIlIlIIlIlIlllI = llllllllllllIllIIIIlIlIIlIlIIIll[llllllllllllIllIIIIlIlIIlIlIIIIl];
            llllllllllllIllIIIIlIlIIlIlIlIll.append((char)(llllllllllllIllIIIIlIlIIlIlIlllI ^ llllllllllllIllIIIIlIlIIlIlIlIlI[llllllllllllIllIIIIlIlIIlIlIlIIl % llllllllllllIllIIIIlIlIIlIlIlIlI.length]));
            "".length();
            ++llllllllllllIllIIIIlIlIIlIlIlIIl;
            ++llllllllllllIllIIIIlIlIIlIlIIIIl;
            "".length();
            if (null != null) {
                return null;
            }
        }
        return String.valueOf(llllllllllllIllIIIIlIlIIlIlIlIll);
    }
    
    private static boolean lIIlllIIlIlllIlI(final int llllllllllllIllIIIIlIlIIlIIIIIIl, final int llllllllllllIllIIIIlIlIIlIIIIIII) {
        return llllllllllllIllIIIIlIlIIlIIIIIIl != llllllllllllIllIIIIlIlIIlIIIIIII;
    }
    
    public PathNavigate(final EntityLiving llllllllllllIllIIIIlIlIlIllIllll, final World llllllllllllIllIIIIlIlIlIllIlIll) {
        this.lastPosCheck = new Vec3(0.0, 0.0, 0.0);
        this.heightRequirement = 1.0f;
        this.theEntity = llllllllllllIllIIIIlIlIlIllIllll;
        this.worldObj = llllllllllllIllIIIIlIlIlIllIlIll;
        this.pathSearchRange = llllllllllllIllIIIIlIlIlIllIllll.getEntityAttribute(SharedMonsterAttributes.followRange);
        this.pathFinder = this.getPathFinder();
    }
    
    public PathEntity getPath() {
        return this.currentPath;
    }
    
    private static boolean lIIlllIIlIllIIll(final Object llllllllllllIllIIIIlIlIIlIIIllII) {
        return llllllllllllIllIIIIlIlIIlIIIllII == null;
    }
    
    protected abstract PathFinder getPathFinder();
    
    private static boolean lIIlllIIlIlllIll(final int llllllllllllIllIIIIlIlIIlIIllIIl, final int llllllllllllIllIIIIlIlIIlIIllIII) {
        return llllllllllllIllIIIIlIlIIlIIllIIl >= llllllllllllIllIIIIlIlIIlIIllIII;
    }
    
    public final PathEntity getPathToXYZ(final double llllllllllllIllIIIIlIlIlIlIllIII, final double llllllllllllIllIIIIlIlIlIlIlIlll, final double llllllllllllIllIIIIlIlIlIlIlIllI) {
        return this.getPathToPos(new BlockPos(MathHelper.floor_double(llllllllllllIllIIIIlIlIlIlIllIII), (int)llllllllllllIllIIIIlIlIlIlIlIlll, MathHelper.floor_double(llllllllllllIllIIIIlIlIlIlIlIllI)));
    }
    
    protected void pathFollow() {
        final Vec3 llllllllllllIllIIIIlIlIIllIllIIl = this.getEntityPosition();
        int llllllllllllIllIIIIlIlIIllIllIII = this.currentPath.getCurrentPathLength();
        int llllllllllllIllIIIIlIlIIllIlIlll = this.currentPath.getCurrentPathIndex();
        "".length();
        if (((0xBC ^ 0xA5) & ~(0x22 ^ 0x3B)) == "  ".length()) {
            return;
        }
        while (!lIIlllIIlIlllIll(llllllllllllIllIIIIlIlIIllIlIlll, this.currentPath.getCurrentPathLength())) {
            if (lIIlllIIlIlllIlI(this.currentPath.getPathPointFromIndex(llllllllllllIllIIIIlIlIIllIlIlll).yCoord, (int)llllllllllllIllIIIIlIlIIllIllIIl.yCoord)) {
                llllllllllllIllIIIIlIlIIllIllIII = llllllllllllIllIIIIlIlIIllIlIlll;
                "".length();
                if ("   ".length() <= ((0x64 ^ 0x6C) & ~(0x8E ^ 0x86))) {
                    return;
                }
                break;
            }
            else {
                ++llllllllllllIllIIIIlIlIIllIlIlll;
            }
        }
        final float llllllllllllIllIIIIlIlIIllIlIllI = this.theEntity.width * this.theEntity.width * this.heightRequirement;
        int llllllllllllIllIIIIlIlIIllIlIlIl = this.currentPath.getCurrentPathIndex();
        "".length();
        if (-" ".length() >= 0) {
            return;
        }
        while (!lIIlllIIlIlllIll(llllllllllllIllIIIIlIlIIllIlIlIl, llllllllllllIllIIIIlIlIIllIllIII)) {
            final Vec3 llllllllllllIllIIIIlIlIIllIlIlII = this.currentPath.getVectorFromIndex(this.theEntity, llllllllllllIllIIIIlIlIIllIlIlIl);
            if (lIIlllIIlIllllII(lIIlllIIlIlllIIl(llllllllllllIllIIIIlIlIIllIllIIl.squareDistanceTo(llllllllllllIllIIIIlIlIIllIlIlII), llllllllllllIllIIIIlIlIIllIlIllI))) {
                this.currentPath.setCurrentPathIndex(llllllllllllIllIIIIlIlIIllIlIlIl + PathNavigate.lllIIIIlIlllll[1]);
            }
            ++llllllllllllIllIIIIlIlIIllIlIlIl;
        }
        final int llllllllllllIllIIIIlIlIIllIlIIll = MathHelper.ceiling_float_int(this.theEntity.width);
        final int llllllllllllIllIIIIlIlIIllIlIIlI = (int)this.theEntity.height + PathNavigate.lllIIIIlIlllll[1];
        final int llllllllllllIllIIIIlIlIIllIlIIIl = llllllllllllIllIIIIlIlIIllIlIIll;
        int llllllllllllIllIIIIlIlIIllIlIIII = llllllllllllIllIIIIlIlIIllIllIII - PathNavigate.lllIIIIlIlllll[1];
        "".length();
        if (" ".length() >= "  ".length()) {
            return;
        }
        while (!lIIlllIIlIllIllI(llllllllllllIllIIIIlIlIIllIlIIII, this.currentPath.getCurrentPathIndex())) {
            if (lIIlllIIlIllIlIl(this.isDirectPathBetweenPoints(llllllllllllIllIIIIlIlIIllIllIIl, this.currentPath.getVectorFromIndex(this.theEntity, llllllllllllIllIIIIlIlIIllIlIIII), llllllllllllIllIIIIlIlIIllIlIIll, llllllllllllIllIIIIlIlIIllIlIIlI, llllllllllllIllIIIIlIlIIllIlIIIl) ? 1 : 0)) {
                this.currentPath.setCurrentPathIndex(llllllllllllIllIIIIlIlIIllIlIIII);
                "".length();
                if ("  ".length() > "  ".length()) {
                    return;
                }
                break;
            }
            else {
                --llllllllllllIllIIIIlIlIIllIlIIII;
            }
        }
        this.checkForStuck(llllllllllllIllIIIIlIlIIllIllIIl);
    }
    
    private static int lIIlllIIlIllllIl(final double n, final double n2) {
        return dcmpg(n, n2);
    }
    
    public float getPathSearchRange() {
        return (float)this.pathSearchRange.getAttributeValue();
    }
    
    private static boolean lIIlllIIlIllIIlI(final Object llllllllllllIllIIIIlIlIIlIIIlllI) {
        return llllllllllllIllIIIIlIlIIlIIIlllI != null;
    }
    
    protected abstract boolean isDirectPathBetweenPoints(final Vec3 p0, final Vec3 p1, final int p2, final int p3, final int p4);
}
