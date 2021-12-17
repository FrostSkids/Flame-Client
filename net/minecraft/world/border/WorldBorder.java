// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.world.border;

import java.util.Iterator;
import net.minecraft.world.ChunkCoordIntPair;
import net.minecraft.util.AxisAlignedBB;
import com.google.common.collect.Lists;
import net.minecraft.util.BlockPos;
import net.minecraft.entity.Entity;
import java.util.List;

public class WorldBorder
{
    private /* synthetic */ double centerX;
    private /* synthetic */ int warningTime;
    private /* synthetic */ double damageBuffer;
    private final /* synthetic */ List<IBorderListener> listeners;
    private /* synthetic */ int warningDistance;
    private /* synthetic */ double startDiameter;
    private /* synthetic */ int worldSize;
    private /* synthetic */ double endDiameter;
    private /* synthetic */ long endTime;
    private static final /* synthetic */ int[] llIllIlIIIllIl;
    private /* synthetic */ long startTime;
    private /* synthetic */ double damageAmount;
    private /* synthetic */ double centerZ;
    
    static {
        lIIlIllllIIllIIl();
    }
    
    private static int lIIlIllllIlIIllI(final double n, final double n2) {
        return dcmpl(n, n2);
    }
    
    public long getTimeUntilTarget() {
        long n;
        if (lIIlIllllIlIlIlI(this.getStatus(), EnumBorderStatus.STATIONARY)) {
            n = this.endTime - System.currentTimeMillis();
            "".length();
            if (null != null) {
                return 0L;
            }
        }
        else {
            n = 0L;
        }
        return n;
    }
    
    public void setTransition(final double llllllllllllIllIIllIllllIIIIIIlI, final double llllllllllllIllIIllIllllIIIIIllI, final long llllllllllllIllIIllIllllIIIIIIII) {
        this.startDiameter = llllllllllllIllIIllIllllIIIIIIlI;
        this.endDiameter = llllllllllllIllIIllIllllIIIIIllI;
        this.startTime = System.currentTimeMillis();
        this.endTime = this.startTime + llllllllllllIllIIllIllllIIIIIIII;
        final long llllllllllllIllIIllIlllIlllllllI = (long)this.getListeners().iterator();
        "".length();
        if ("   ".length() < 0) {
            return;
        }
        while (!lIIlIllllIlIlIII(((Iterator)llllllllllllIllIIllIlllIlllllllI).hasNext() ? 1 : 0)) {
            final IBorderListener llllllllllllIllIIllIllllIIIIIlII = ((Iterator<IBorderListener>)llllllllllllIllIIllIlllIlllllllI).next();
            llllllllllllIllIIllIllllIIIIIlII.onTransitionStarted(this, llllllllllllIllIIllIllllIIIIIIlI, llllllllllllIllIIllIllllIIIIIllI, llllllllllllIllIIllIllllIIIIIIII);
        }
    }
    
    private static int lIIlIllllIIlllll(final double n, final double n2) {
        return dcmpg(n, n2);
    }
    
    public double getDiameter() {
        if (lIIlIllllIlIlIlI(this.getStatus(), EnumBorderStatus.STATIONARY)) {
            final double llllllllllllIllIIllIllllIIlIIIlI = (System.currentTimeMillis() - this.startTime) / (float)(this.endTime - this.startTime);
            if (lIIlIllllIIlllIl(lIIlIllllIlIlIIl(llllllllllllIllIIllIllllIIlIIIlI, 1.0))) {
                return this.startDiameter + (this.endDiameter - this.startDiameter) * llllllllllllIllIIllIllllIIlIIIlI;
            }
            this.setTransition(this.endDiameter);
        }
        return this.startDiameter;
    }
    
    public int getSize() {
        return this.worldSize;
    }
    
    public double getTargetSize() {
        return this.endDiameter;
    }
    
    private static int lIIlIllllIlIIIlI(final double n, final double n2) {
        return dcmpg(n, n2);
    }
    
    public double maxX() {
        double llllllllllllIllIIllIllllIlIIIIlI = this.getCenterX() + this.getDiameter() / 2.0;
        if (lIIlIllllIIlllII(lIIlIllllIlIIllI(llllllllllllIllIIllIllllIlIIIIlI, this.worldSize))) {
            llllllllllllIllIIllIllllIlIIIIlI = this.worldSize;
        }
        return llllllllllllIllIIllIllllIlIIIIlI;
    }
    
    public EnumBorderStatus getStatus() {
        EnumBorderStatus enumBorderStatus;
        if (lIIlIllllIIlllIl(lIIlIllllIlIIIlI(this.endDiameter, this.startDiameter))) {
            enumBorderStatus = EnumBorderStatus.SHRINKING;
            "".length();
            if (((0x68 ^ 0x5E) & ~(0xAE ^ 0x98)) != ((0xDE ^ 0xC7) & ~(0x97 ^ 0x8E))) {
                return null;
            }
        }
        else if (lIIlIllllIIlllII(lIIlIllllIlIIIll(this.endDiameter, this.startDiameter))) {
            enumBorderStatus = EnumBorderStatus.GROWING;
            "".length();
            if (((127 + 101 - 120 + 110 ^ 72 + 112 - 82 + 26) & (0x6D ^ 0x30 ^ (0x10 ^ 0x17) ^ -" ".length())) != 0x0) {
                return null;
            }
        }
        else {
            enumBorderStatus = EnumBorderStatus.STATIONARY;
        }
        return enumBorderStatus;
    }
    
    public double getClosestDistance(final double llllllllllllIllIIllIllllIllIIIll, final double llllllllllllIllIIllIllllIllIIIlI) {
        final double llllllllllllIllIIllIllllIllIIIIl = llllllllllllIllIIllIllllIllIIIlI - this.minZ();
        final double llllllllllllIllIIllIllllIllIIIII = this.maxZ() - llllllllllllIllIIllIllllIllIIIlI;
        final double llllllllllllIllIIllIllllIlIlllll = llllllllllllIllIIllIllllIllIIIll - this.minX();
        final double llllllllllllIllIIllIllllIlIllllI = this.maxX() - llllllllllllIllIIllIllllIllIIIll;
        double llllllllllllIllIIllIllllIlIlllIl = Math.min(llllllllllllIllIIllIllllIlIlllll, llllllllllllIllIIllIllllIlIllllI);
        llllllllllllIllIIllIllllIlIlllIl = Math.min(llllllllllllIllIIllIllllIlIlllIl, llllllllllllIllIIllIllllIllIIIIl);
        return Math.min(llllllllllllIllIIllIllllIlIlllIl, llllllllllllIllIIllIllllIllIIIII);
    }
    
    public double minX() {
        double llllllllllllIllIIllIllllIlIIlllI = this.getCenterX() - this.getDiameter() / 2.0;
        if (lIIlIllllIIlllIl(lIIlIllllIlIIlII(llllllllllllIllIIllIllllIlIIlllI, -this.worldSize))) {
            llllllllllllIllIIllIllllIlIIlllI = -this.worldSize;
        }
        return llllllllllllIllIIllIllllIlIIlllI;
    }
    
    private static int lIIlIllllIlIIlII(final double n, final double n2) {
        return dcmpg(n, n2);
    }
    
    public double minZ() {
        double llllllllllllIllIIllIllllIlIIlIII = this.getCenterZ() - this.getDiameter() / 2.0;
        if (lIIlIllllIIlllIl(lIIlIllllIlIIlIl(llllllllllllIllIIllIllllIlIIlIII, -this.worldSize))) {
            llllllllllllIllIIllIllllIlIIlIII = -this.worldSize;
        }
        return llllllllllllIllIIllIllllIlIIlIII;
    }
    
    private static int lIIlIllllIlIIlll(final double n, final double n2) {
        return dcmpl(n, n2);
    }
    
    public double getDamageBuffer() {
        return this.damageBuffer;
    }
    
    public double getClosestDistance(final Entity llllllllllllIllIIllIllllIllIllIl) {
        return this.getClosestDistance(llllllllllllIllIIllIllllIllIllIl.posX, llllllllllllIllIIllIllllIllIllIl.posZ);
    }
    
    public boolean contains(final BlockPos llllllllllllIllIIllIllllIlllllll) {
        if (lIIlIllllIIlllII(lIIlIllllIIllIlI(llllllllllllIllIIllIllllIlllllll.getX() + WorldBorder.llIllIlIIIllIl[3], this.minX())) && lIIlIllllIIlllIl(lIIlIllllIIllIll(llllllllllllIllIIllIllllIlllllll.getX(), this.maxX())) && lIIlIllllIIlllII(lIIlIllllIIllIlI(llllllllllllIllIIllIllllIlllllll.getZ() + WorldBorder.llIllIlIIIllIl[3], this.minZ())) && lIIlIllllIIlllIl(lIIlIllllIIllIll(llllllllllllIllIIllIllllIlllllll.getZ(), this.maxZ()))) {
            return WorldBorder.llIllIlIIIllIl[3] != 0;
        }
        return WorldBorder.llIllIlIIIllIl[4] != 0;
    }
    
    private static int lIIlIllllIlIIIIl(final double n, final double n2) {
        return dcmpg(n, n2);
    }
    
    private static boolean lIIlIllllIlIlIlI(final Object llllllllllllIllIIllIlllIlIlIlllI, final Object llllllllllllIllIIllIlllIlIlIllIl) {
        return llllllllllllIllIIllIlllIlIlIlllI != llllllllllllIllIIllIlllIlIlIllIl;
    }
    
    private static void lIIlIllllIIllIIl() {
        (llIllIlIIIllIl = new int[5])[0] = (0xFFFFC37B & 0x1C9FFF4);
        WorldBorder.llIllIlIIIllIl[1] = (0x1A ^ 0x15);
        WorldBorder.llIllIlIIIllIl[2] = (0x43 ^ 0x46);
        WorldBorder.llIllIlIIIllIl[3] = " ".length();
        WorldBorder.llIllIlIIIllIl[4] = ((0xDA ^ 0xB8 ^ (0x19 ^ 0x25)) & (0xB5 ^ 0x9B ^ (0xF9 ^ 0x89) ^ -" ".length()));
    }
    
    public void setSize(final int llllllllllllIllIIllIlllIlllIllll) {
        this.worldSize = llllllllllllIllIIllIlllIlllIllll;
    }
    
    public double maxZ() {
        double llllllllllllIllIIllIllllIIllllII = this.getCenterZ() + this.getDiameter() / 2.0;
        if (lIIlIllllIIlllII(lIIlIllllIlIIlll(llllllllllllIllIIllIllllIIllllII, this.worldSize))) {
            llllllllllllIllIIllIllllIIllllII = this.worldSize;
        }
        return llllllllllllIllIIllIllllIIllllII;
    }
    
    public WorldBorder() {
        this.listeners = (List<IBorderListener>)Lists.newArrayList();
        this.centerX = 0.0;
        this.centerZ = 0.0;
        this.startDiameter = 6.0E7;
        this.endDiameter = this.startDiameter;
        this.worldSize = WorldBorder.llIllIlIIIllIl[0];
        this.damageAmount = 0.2;
        this.damageBuffer = 5.0;
        this.warningTime = WorldBorder.llIllIlIIIllIl[1];
        this.warningDistance = WorldBorder.llIllIlIIIllIl[2];
    }
    
    private static boolean lIIlIllllIIlllII(final int llllllllllllIllIIllIlllIlIlIIlll) {
        return llllllllllllIllIIllIlllIlIlIIlll > 0;
    }
    
    public int getWarningDistance() {
        return this.warningDistance;
    }
    
    public void setWarningTime(final int llllllllllllIllIIllIlllIllIIIlII) {
        this.warningTime = llllllllllllIllIIllIlllIllIIIlII;
        final char llllllllllllIllIIllIlllIlIllllll = (char)this.getListeners().iterator();
        "".length();
        if (((0x44 ^ 0x7A) & ~(0xFE ^ 0xC0)) > "   ".length()) {
            return;
        }
        while (!lIIlIllllIlIlIII(((Iterator)llllllllllllIllIIllIlllIlIllllll).hasNext() ? 1 : 0)) {
            final IBorderListener llllllllllllIllIIllIlllIllIIIIll = ((Iterator<IBorderListener>)llllllllllllIllIIllIlllIlIllllll).next();
            llllllllllllIllIIllIlllIllIIIIll.onWarningTimeChanged(this, llllllllllllIllIIllIlllIllIIIlII);
        }
    }
    
    private static boolean lIIlIllllIIlllIl(final int llllllllllllIllIIllIlllIlIlIlIIl) {
        return llllllllllllIllIIllIlllIlIlIlIIl < 0;
    }
    
    private static int lIIlIllllIlIIlIl(final double n, final double n2) {
        return dcmpg(n, n2);
    }
    
    public boolean contains(final AxisAlignedBB llllllllllllIllIIllIllllIlllIlIl) {
        if (lIIlIllllIIlllII(lIIlIllllIlIIIII(llllllllllllIllIIllIllllIlllIlIl.maxX, this.minX())) && lIIlIllllIIlllIl(lIIlIllllIlIIIIl(llllllllllllIllIIllIllllIlllIlIl.minX, this.maxX())) && lIIlIllllIIlllII(lIIlIllllIlIIIII(llllllllllllIllIIllIllllIlllIlIl.maxZ, this.minZ())) && lIIlIllllIIlllIl(lIIlIllllIlIIIIl(llllllllllllIllIIllIllllIlllIlIl.minZ, this.maxZ()))) {
            return WorldBorder.llIllIlIIIllIl[3] != 0;
        }
        return WorldBorder.llIllIlIIIllIl[4] != 0;
    }
    
    protected List<IBorderListener> getListeners() {
        return (List<IBorderListener>)Lists.newArrayList((Iterable)this.listeners);
    }
    
    public void setDamageBuffer(final double llllllllllllIllIIllIlllIlllIIIll) {
        this.damageBuffer = llllllllllllIllIIllIlllIlllIIIll;
        final String llllllllllllIllIIllIlllIllIllllI = (String)this.getListeners().iterator();
        "".length();
        if (-"  ".length() > 0) {
            return;
        }
        while (!lIIlIllllIlIlIII(((Iterator)llllllllllllIllIIllIlllIllIllllI).hasNext() ? 1 : 0)) {
            final IBorderListener llllllllllllIllIIllIlllIlllIIIlI = ((Iterator<IBorderListener>)llllllllllllIllIIllIlllIllIllllI).next();
            llllllllllllIllIIllIlllIlllIIIlI.onDamageBufferChanged(this, llllllllllllIllIIllIlllIlllIIIll);
        }
    }
    
    private static int lIIlIllllIIllllI(final double n, final double n2) {
        return dcmpl(n, n2);
    }
    
    public void setCenter(final double llllllllllllIllIIllIllllIIlIllIl, final double llllllllllllIllIIllIllllIIlIllII) {
        this.centerX = llllllllllllIllIIllIllllIIlIllIl;
        this.centerZ = llllllllllllIllIIllIllllIIlIllII;
        final int llllllllllllIllIIllIllllIIlIIllI = (int)this.getListeners().iterator();
        "".length();
        if (((0xE5 ^ 0x85 ^ (0x75 ^ 0x2)) & (0x77 ^ 0xB ^ (0xFE ^ 0x95) ^ -" ".length())) != 0x0) {
            return;
        }
        while (!lIIlIllllIlIlIII(((Iterator)llllllllllllIllIIllIllllIIlIIllI).hasNext() ? 1 : 0)) {
            final IBorderListener llllllllllllIllIIllIllllIIlIlIll = ((Iterator<IBorderListener>)llllllllllllIllIIllIllllIIlIIllI).next();
            llllllllllllIllIIllIllllIIlIlIll.onCenterChanged(this, llllllllllllIllIIllIllllIIlIllIl, llllllllllllIllIIllIllllIIlIllII);
        }
    }
    
    private static boolean lIIlIllllIlIlIII(final int llllllllllllIllIIllIlllIlIlIlIll) {
        return llllllllllllIllIIllIlllIlIlIlIll == 0;
    }
    
    private static int lIIlIllllIIllIlI(final double n, final double n2) {
        return dcmpl(n, n2);
    }
    
    public void setWarningDistance(final int llllllllllllIllIIllIlllIlIllIllI) {
        this.warningDistance = llllllllllllIllIIllIlllIlIllIllI;
        final double llllllllllllIllIIllIlllIlIllIIIl = (double)this.getListeners().iterator();
        "".length();
        if (((0xEF ^ 0xBC) & ~(0x4B ^ 0x18)) > "   ".length()) {
            return;
        }
        while (!lIIlIllllIlIlIII(((Iterator)llllllllllllIllIIllIlllIlIllIIIl).hasNext() ? 1 : 0)) {
            final IBorderListener llllllllllllIllIIllIlllIlIllIlIl = ((Iterator<IBorderListener>)llllllllllllIllIIllIlllIlIllIIIl).next();
            llllllllllllIllIIllIlllIlIllIlIl.onWarningDistanceChanged(this, llllllllllllIllIIllIlllIlIllIllI);
        }
    }
    
    public void addListener(final IBorderListener llllllllllllIllIIllIlllIllllIlll) {
        this.listeners.add(llllllllllllIllIIllIlllIllllIlll);
        "".length();
    }
    
    public boolean contains(final ChunkCoordIntPair llllllllllllIllIIllIllllIllllIll) {
        if (lIIlIllllIIlllII(lIIlIllllIIllllI(llllllllllllIllIIllIllllIllllIll.getXEnd(), this.minX())) && lIIlIllllIIlllIl(lIIlIllllIIlllll(llllllllllllIllIIllIllllIllllIll.getXStart(), this.maxX())) && lIIlIllllIIlllII(lIIlIllllIIllllI(llllllllllllIllIIllIllllIllllIll.getZEnd(), this.minZ())) && lIIlIllllIIlllIl(lIIlIllllIIlllll(llllllllllllIllIIllIllllIllllIll.getZStart(), this.maxZ()))) {
            return WorldBorder.llIllIlIIIllIl[3] != 0;
        }
        return WorldBorder.llIllIlIIIllIl[4] != 0;
    }
    
    public double getDamageAmount() {
        return this.damageAmount;
    }
    
    private static int lIIlIllllIlIlIll(final long n, final long n2) {
        return lcmp(n, n2);
    }
    
    public double getCenterZ() {
        return this.centerZ;
    }
    
    private static int lIIlIllllIlIlIIl(final double n, final double n2) {
        return dcmpg(n, n2);
    }
    
    public void setDamageAmount(final double llllllllllllIllIIllIlllIllIlIIlI) {
        this.damageAmount = llllllllllllIllIIllIlllIllIlIIlI;
        final Exception llllllllllllIllIIllIlllIllIlIIII = (Exception)this.getListeners().iterator();
        "".length();
        if ("  ".length() == ("  ".length() & ~"  ".length())) {
            return;
        }
        while (!lIIlIllllIlIlIII(((Iterator)llllllllllllIllIIllIlllIllIlIIII).hasNext() ? 1 : 0)) {
            final IBorderListener llllllllllllIllIIllIlllIllIlIlII = ((Iterator<IBorderListener>)llllllllllllIllIIllIlllIllIlIIII).next();
            llllllllllllIllIIllIlllIllIlIlII.onDamageAmountChanged(this, llllllllllllIllIIllIlllIllIlIIlI);
        }
    }
    
    public void setTransition(final double llllllllllllIllIIllIllllIIIlIlII) {
        this.startDiameter = llllllllllllIllIIllIllllIIIlIlII;
        this.endDiameter = llllllllllllIllIIllIllllIIIlIlII;
        this.endTime = System.currentTimeMillis();
        this.startTime = this.endTime;
        final String llllllllllllIllIIllIllllIIIIllll = (String)this.getListeners().iterator();
        "".length();
        if (-" ".length() < -" ".length()) {
            return;
        }
        while (!lIIlIllllIlIlIII(((Iterator)llllllllllllIllIIllIllllIIIIllll).hasNext() ? 1 : 0)) {
            final IBorderListener llllllllllllIllIIllIllllIIIlIIll = ((Iterator<IBorderListener>)llllllllllllIllIIllIllllIIIIllll).next();
            llllllllllllIllIIllIllllIIIlIIll.onSizeChanged(this, llllllllllllIllIIllIllllIIIlIlII);
        }
    }
    
    private static int lIIlIllllIIllIll(final double n, final double n2) {
        return dcmpg(n, n2);
    }
    
    public double getResizeSpeed() {
        double n;
        if (lIIlIllllIlIlIII(lIIlIllllIlIlIll(this.endTime, this.startTime))) {
            n = 0.0;
            "".length();
            if ((0x23 ^ 0x1B ^ (0x53 ^ 0x6E)) == 0x0) {
                return 0.0;
            }
        }
        else {
            n = Math.abs(this.startDiameter - this.endDiameter) / (this.endTime - this.startTime);
        }
        return n;
    }
    
    private static int lIIlIllllIlIIIll(final double n, final double n2) {
        return dcmpl(n, n2);
    }
    
    public double getCenterX() {
        return this.centerX;
    }
    
    public int getWarningTime() {
        return this.warningTime;
    }
    
    private static int lIIlIllllIlIIIII(final double n, final double n2) {
        return dcmpl(n, n2);
    }
}
