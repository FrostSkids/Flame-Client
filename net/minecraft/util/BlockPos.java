// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.util;

import net.minecraft.entity.Entity;
import com.google.common.collect.AbstractIterator;
import java.util.Iterator;

public class BlockPos extends Vec3i
{
    private static final /* synthetic */ int X_SHIFT;
    private static final /* synthetic */ int NUM_X_BITS;
    private static final /* synthetic */ int NUM_Y_BITS;
    private static final /* synthetic */ long Y_MASK;
    private static final /* synthetic */ int NUM_Z_BITS;
    private static final /* synthetic */ int Y_SHIFT;
    private static final /* synthetic */ int[] lllIIIIIlIlIIl;
    private static final /* synthetic */ long X_MASK;
    private static final /* synthetic */ long Z_MASK;
    
    public BlockPos west(final int llllllllllllIllIIIIllllIlIIlIlII) {
        return this.offset(EnumFacing.WEST, llllllllllllIllIIIIllllIlIIlIlII);
    }
    
    public BlockPos down() {
        return this.down(BlockPos.lllIIIIIlIlIIl[1]);
    }
    
    public BlockPos up() {
        return this.up(BlockPos.lllIIIIIlIlIIl[1]);
    }
    
    public BlockPos add(final Vec3i llllllllllllIllIIIIllllIllIIIlIl) {
        BlockPos blockPos;
        if (lIIlllIIIIIlllll(llllllllllllIllIIIIllllIllIIIlIl.getX()) && lIIlllIIIIIlllll(llllllllllllIllIIIIllllIllIIIlIl.getY()) && lIIlllIIIIIlllll(llllllllllllIllIIIIllllIllIIIlIl.getZ())) {
            blockPos = this;
            "".length();
            if (((0x36 ^ 0x15) & ~(0x96 ^ 0xB5)) == -" ".length()) {
                return null;
            }
        }
        else {
            blockPos = new BlockPos(this.getX() + llllllllllllIllIIIIllllIllIIIlIl.getX(), this.getY() + llllllllllllIllIIIIllllIllIIIlIl.getY(), this.getZ() + llllllllllllIllIIIIllllIllIIIlIl.getZ());
        }
        return blockPos;
    }
    
    public BlockPos add(final int llllllllllllIllIIIIllllIllIlIIIl, final int llllllllllllIllIIIIllllIllIIllII, final int llllllllllllIllIIIIllllIllIIllll) {
        BlockPos blockPos;
        if (lIIlllIIIIIlllll(llllllllllllIllIIIIllllIllIlIIIl) && lIIlllIIIIIlllll(llllllllllllIllIIIIllllIllIIllII) && lIIlllIIIIIlllll(llllllllllllIllIIIIllllIllIIllll)) {
            blockPos = this;
            "".length();
            if ((6 + 85 - 69 + 119 ^ 21 + 113 - 41 + 44) > (0xD7 ^ 0xC5 ^ (0x3D ^ 0x2B))) {
                return null;
            }
        }
        else {
            blockPos = new BlockPos(this.getX() + llllllllllllIllIIIIllllIllIlIIIl, this.getY() + llllllllllllIllIIIIllllIllIIllII, this.getZ() + llllllllllllIllIIIIllllIllIIllll);
        }
        return blockPos;
    }
    
    public BlockPos subtract(final Vec3i llllllllllllIllIIIIllllIlIllllll) {
        BlockPos blockPos;
        if (lIIlllIIIIIlllll(llllllllllllIllIIIIllllIlIllllll.getX()) && lIIlllIIIIIlllll(llllllllllllIllIIIIllllIlIllllll.getY()) && lIIlllIIIIIlllll(llllllllllllIllIIIIllllIlIllllll.getZ())) {
            blockPos = this;
            "".length();
            if (" ".length() < -" ".length()) {
                return null;
            }
        }
        else {
            blockPos = new BlockPos(this.getX() - llllllllllllIllIIIIllllIlIllllll.getX(), this.getY() - llllllllllllIllIIIIllllIlIllllll.getY(), this.getZ() - llllllllllllIllIIIIllllIlIllllll.getZ());
        }
        return blockPos;
    }
    
    @Override
    public BlockPos crossProduct(final Vec3i llllllllllllIllIIIIllllIIlllIllI) {
        return new BlockPos(this.getY() * llllllllllllIllIIIIllllIIlllIllI.getZ() - this.getZ() * llllllllllllIllIIIIllllIIlllIllI.getY(), this.getZ() * llllllllllllIllIIIIllllIIlllIllI.getX() - this.getX() * llllllllllllIllIIIIllllIIlllIllI.getZ(), this.getX() * llllllllllllIllIIIIllllIIlllIllI.getY() - this.getY() * llllllllllllIllIIIIllllIIlllIllI.getX());
    }
    
    public static Iterable<MutableBlockPos> getAllInBoxMutable(final BlockPos llllllllllllIllIIIIllllIIlIlIlII, final BlockPos llllllllllllIllIIIIllllIIlIIllll) {
        final BlockPos llllllllllllIllIIIIllllIIlIlIIlI = new BlockPos(Math.min(llllllllllllIllIIIIllllIIlIlIlII.getX(), llllllllllllIllIIIIllllIIlIIllll.getX()), Math.min(llllllllllllIllIIIIllllIIlIlIlII.getY(), llllllllllllIllIIIIllllIIlIIllll.getY()), Math.min(llllllllllllIllIIIIllllIIlIlIlII.getZ(), llllllllllllIllIIIIllllIIlIIllll.getZ()));
        final BlockPos llllllllllllIllIIIIllllIIlIlIIIl = new BlockPos(Math.max(llllllllllllIllIIIIllllIIlIlIlII.getX(), llllllllllllIllIIIIllllIIlIIllll.getX()), Math.max(llllllllllllIllIIIIllllIIlIlIlII.getY(), llllllllllllIllIIIIllllIIlIIllll.getY()), Math.max(llllllllllllIllIIIIllllIIlIlIlII.getZ(), llllllllllllIllIIIIllllIIlIIllll.getZ()));
        return new Iterable<MutableBlockPos>() {
            @Override
            public Iterator<MutableBlockPos> iterator() {
                return (Iterator<MutableBlockPos>)new AbstractIterator<MutableBlockPos>() {
                    private /* synthetic */ MutableBlockPos theBlockPos = null;
                    
                    private static boolean llIIIlIIIlIIlIl(final int lllllllllllllIlIIIIIIIllllIIlIIl) {
                        return lllllllllllllIlIIIIIIIllllIIlIIl != 0;
                    }
                    
                    private static boolean llIIIlIIIlIIllI(final int lllllllllllllIlIIIIIIIllllIIlllI, final int lllllllllllllIlIIIIIIIllllIIllIl) {
                        return lllllllllllllIlIIIIIIIllllIIlllI < lllllllllllllIlIIIIIIIllllIIllIl;
                    }
                    
                    private static boolean llIIIlIIIlIIlII(final Object lllllllllllllIlIIIIIIIllllIIlIll) {
                        return lllllllllllllIlIIIIIIIllllIIlIll == null;
                    }
                    
                    protected MutableBlockPos computeNext() {
                        if (llIIIlIIIlIIlII(this.theBlockPos)) {
                            this.theBlockPos = new MutableBlockPos(llllllllllllIllIIIIllllIIlIlIIlI.getX(), llllllllllllIllIIIIllllIIlIlIIlI.getY(), llllllllllllIllIIIIllllIIlIlIIlI.getZ());
                            return this.theBlockPos;
                        }
                        if (llIIIlIIIlIIlIl(this.theBlockPos.equals(llllllllllllIllIIIIllllIIlIlIIIl) ? 1 : 0)) {
                            return (MutableBlockPos)this.endOfData();
                        }
                        int lllllllllllllIlIIIIIIIllllIllIIl = this.theBlockPos.getX();
                        int lllllllllllllIlIIIIIIIllllIllIII = this.theBlockPos.getY();
                        int lllllllllllllIlIIIIIIIllllIlIlll = this.theBlockPos.getZ();
                        if (llIIIlIIIlIIllI(lllllllllllllIlIIIIIIIllllIllIIl, llllllllllllIllIIIIllllIIlIlIIIl.getX())) {
                            ++lllllllllllllIlIIIIIIIllllIllIIl;
                            "".length();
                            if (null != null) {
                                return null;
                            }
                        }
                        else if (llIIIlIIIlIIllI(lllllllllllllIlIIIIIIIllllIllIII, llllllllllllIllIIIIllllIIlIlIIIl.getY())) {
                            lllllllllllllIlIIIIIIIllllIllIIl = llllllllllllIllIIIIllllIIlIlIIlI.getX();
                            ++lllllllllllllIlIIIIIIIllllIllIII;
                            "".length();
                            if (" ".length() >= (0x2 ^ 0x63 ^ (0x6B ^ 0xE))) {
                                return null;
                            }
                        }
                        else if (llIIIlIIIlIIllI(lllllllllllllIlIIIIIIIllllIlIlll, llllllllllllIllIIIIllllIIlIlIIIl.getZ())) {
                            lllllllllllllIlIIIIIIIllllIllIIl = llllllllllllIllIIIIllllIIlIlIIlI.getX();
                            lllllllllllllIlIIIIIIIllllIllIII = llllllllllllIllIIIIllllIIlIlIIlI.getY();
                            ++lllllllllllllIlIIIIIIIllllIlIlll;
                        }
                        MutableBlockPos.access$0(this.theBlockPos, lllllllllllllIlIIIIIIIllllIllIIl);
                        MutableBlockPos.access$1(this.theBlockPos, lllllllllllllIlIIIIIIIllllIllIII);
                        MutableBlockPos.access$2(this.theBlockPos, lllllllllllllIlIIIIIIIllllIlIlll);
                        return this.theBlockPos;
                    }
                };
            }
        };
    }
    
    static {
        lIIlllIIIIIlllIl();
        ORIGIN = new BlockPos(BlockPos.lllIIIIIlIlIIl[0], BlockPos.lllIIIIIlIlIIl[0], BlockPos.lllIIIIIlIlIIl[0]);
        NUM_X_BITS = BlockPos.lllIIIIIlIlIIl[1] + MathHelper.calculateLogBaseTwo(MathHelper.roundUpToPowerOfTwo(BlockPos.lllIIIIIlIlIIl[2]));
        NUM_Z_BITS = BlockPos.NUM_X_BITS;
        NUM_Y_BITS = BlockPos.lllIIIIIlIlIIl[3] - BlockPos.NUM_X_BITS - BlockPos.NUM_Z_BITS;
        Y_SHIFT = BlockPos.lllIIIIIlIlIIl[0] + BlockPos.NUM_Z_BITS;
        X_SHIFT = BlockPos.Y_SHIFT + BlockPos.NUM_Y_BITS;
        X_MASK = (1L << BlockPos.NUM_X_BITS) - 1L;
        Y_MASK = (1L << BlockPos.NUM_Y_BITS) - 1L;
        Z_MASK = (1L << BlockPos.NUM_Z_BITS) - 1L;
    }
    
    public BlockPos north(final int llllllllllllIllIIIIllllIlIlIIllI) {
        return this.offset(EnumFacing.NORTH, llllllllllllIllIIIIllllIlIlIIllI);
    }
    
    public BlockPos(final Entity llllllllllllIllIIIIllllIlllIllll) {
        this(llllllllllllIllIIIIllllIlllIllll.posX, llllllllllllIllIIIIllllIlllIllll.posY, llllllllllllIllIIIIllllIlllIllll.posZ);
    }
    
    public BlockPos(final int llllllllllllIllIIIIlllllIIIIIIll, final int llllllllllllIllIIIIlllllIIIIIIlI, final int llllllllllllIllIIIIlllllIIIIIlIl) {
        super(llllllllllllIllIIIIlllllIIIIIIll, llllllllllllIllIIIIlllllIIIIIIlI, llllllllllllIllIIIIlllllIIIIIlIl);
    }
    
    public BlockPos(final Vec3i llllllllllllIllIIIIllllIlllIIlIl) {
        this(llllllllllllIllIIIIllllIlllIIlIl.getX(), llllllllllllIllIIIIllllIlllIIlIl.getY(), llllllllllllIllIIIIllllIlllIIlIl.getZ());
    }
    
    public BlockPos offset(final EnumFacing llllllllllllIllIIIIllllIIllllllI, final int llllllllllllIllIIIIllllIIllllIlI) {
        BlockPos blockPos;
        if (lIIlllIIIIIlllll(llllllllllllIllIIIIllllIIllllIlI)) {
            blockPos = this;
            "".length();
            if (-" ".length() > 0) {
                return null;
            }
        }
        else {
            blockPos = new BlockPos(this.getX() + llllllllllllIllIIIIllllIIllllllI.getFrontOffsetX() * llllllllllllIllIIIIllllIIllllIlI, this.getY() + llllllllllllIllIIIIllllIIllllllI.getFrontOffsetY() * llllllllllllIllIIIIllllIIllllIlI, this.getZ() + llllllllllllIllIIIIllllIIllllllI.getFrontOffsetZ() * llllllllllllIllIIIIllllIIllllIlI);
        }
        return blockPos;
    }
    
    public BlockPos add(final double llllllllllllIllIIIIllllIllIllIIl, final double llllllllllllIllIIIIllllIllIlllII, final double llllllllllllIllIIIIllllIllIllIll) {
        BlockPos blockPos;
        if (lIIlllIIIIIlllll(lIIlllIIIIIllllI(llllllllllllIllIIIIllllIllIllIIl, 0.0)) && lIIlllIIIIIlllll(lIIlllIIIIIllllI(llllllllllllIllIIIIllllIllIlllII, 0.0)) && lIIlllIIIIIlllll(lIIlllIIIIIllllI(llllllllllllIllIIIIllllIllIllIll, 0.0))) {
            blockPos = this;
            "".length();
            if ("  ".length() < 0) {
                return null;
            }
        }
        else {
            blockPos = new BlockPos(this.getX() + llllllllllllIllIIIIllllIllIllIIl, this.getY() + llllllllllllIllIIIIllllIllIlllII, this.getZ() + llllllllllllIllIIIIllllIllIllIll);
        }
        return blockPos;
    }
    
    public BlockPos east() {
        return this.east(BlockPos.lllIIIIIlIlIIl[1]);
    }
    
    public BlockPos(final Vec3 llllllllllllIllIIIIllllIlllIlIll) {
        this(llllllllllllIllIIIIllllIlllIlIll.xCoord, llllllllllllIllIIIIllllIlllIlIll.yCoord, llllllllllllIllIIIIllllIlllIlIll.zCoord);
    }
    
    public BlockPos offset(final EnumFacing llllllllllllIllIIIIllllIlIIIIlIl) {
        return this.offset(llllllllllllIllIIIIllllIlIIIIlIl, BlockPos.lllIIIIIlIlIIl[1]);
    }
    
    private static boolean lIIlllIIIIIlllll(final int llllllllllllIllIIIIllllIIlIIIlll) {
        return llllllllllllIllIIIIllllIIlIIIlll == 0;
    }
    
    public BlockPos east(final int llllllllllllIllIIIIllllIlIIIlIIl) {
        return this.offset(EnumFacing.EAST, llllllllllllIllIIIIllllIlIIIlIIl);
    }
    
    public long toLong() {
        return ((long)this.getX() & BlockPos.X_MASK) << BlockPos.X_SHIFT | ((long)this.getY() & BlockPos.Y_MASK) << BlockPos.Y_SHIFT | ((long)this.getZ() & BlockPos.Z_MASK) << BlockPos.lllIIIIIlIlIIl[0];
    }
    
    public BlockPos up(final int llllllllllllIllIIIIllllIlIlllIII) {
        return this.offset(EnumFacing.UP, llllllllllllIllIIIIllllIlIlllIII);
    }
    
    public BlockPos south(final int llllllllllllIllIIIIllllIlIIllIll) {
        return this.offset(EnumFacing.SOUTH, llllllllllllIllIIIIllllIlIIllIll);
    }
    
    public BlockPos down(final int llllllllllllIllIIIIllllIlIlIllll) {
        return this.offset(EnumFacing.DOWN, llllllllllllIllIIIIllllIlIlIllll);
    }
    
    public static BlockPos fromLong(final long llllllllllllIllIIIIllllIIllIllII) {
        final int llllllllllllIllIIIIllllIIllIlIll = (int)(llllllllllllIllIIIIllllIIllIllII << BlockPos.lllIIIIIlIlIIl[3] - BlockPos.X_SHIFT - BlockPos.NUM_X_BITS >> BlockPos.lllIIIIIlIlIIl[3] - BlockPos.NUM_X_BITS);
        final int llllllllllllIllIIIIllllIIllIlIlI = (int)(llllllllllllIllIIIIllllIIllIllII << BlockPos.lllIIIIIlIlIIl[3] - BlockPos.Y_SHIFT - BlockPos.NUM_Y_BITS >> BlockPos.lllIIIIIlIlIIl[3] - BlockPos.NUM_Y_BITS);
        final int llllllllllllIllIIIIllllIIllIlIIl = (int)(llllllllllllIllIIIIllllIIllIllII << BlockPos.lllIIIIIlIlIIl[3] - BlockPos.NUM_Z_BITS >> BlockPos.lllIIIIIlIlIIl[3] - BlockPos.NUM_Z_BITS);
        return new BlockPos(llllllllllllIllIIIIllllIIllIlIll, llllllllllllIllIIIIllllIIllIlIlI, llllllllllllIllIIIIllllIIllIlIIl);
    }
    
    private static void lIIlllIIIIIlllIl() {
        (lllIIIIIlIlIIl = new int[4])[0] = ((0x74 ^ 0x54) & ~(0x1F ^ 0x3F) & ~((0x2D ^ 0x1) & ~(0xB4 ^ 0x98)));
        BlockPos.lllIIIIIlIlIIl[1] = " ".length();
        BlockPos.lllIIIIIlIlIIl[2] = (0xFFFFEB9F & 0x1C9D7E0);
        BlockPos.lllIIIIIlIlIIl[3] = (0x41 ^ 0x1);
    }
    
    public BlockPos west() {
        return this.west(BlockPos.lllIIIIIlIlIIl[1]);
    }
    
    public BlockPos north() {
        return this.north(BlockPos.lllIIIIIlIlIIl[1]);
    }
    
    public static Iterable<BlockPos> getAllInBox(final BlockPos llllllllllllIllIIIIllllIIllIIIII, final BlockPos llllllllllllIllIIIIllllIIlIlllll) {
        final BlockPos llllllllllllIllIIIIllllIIlIllllI = new BlockPos(Math.min(llllllllllllIllIIIIllllIIllIIIII.getX(), llllllllllllIllIIIIllllIIlIlllll.getX()), Math.min(llllllllllllIllIIIIllllIIllIIIII.getY(), llllllllllllIllIIIIllllIIlIlllll.getY()), Math.min(llllllllllllIllIIIIllllIIllIIIII.getZ(), llllllllllllIllIIIIllllIIlIlllll.getZ()));
        final BlockPos llllllllllllIllIIIIllllIIlIlllIl = new BlockPos(Math.max(llllllllllllIllIIIIllllIIllIIIII.getX(), llllllllllllIllIIIIllllIIlIlllll.getX()), Math.max(llllllllllllIllIIIIllllIIllIIIII.getY(), llllllllllllIllIIIIllllIIlIlllll.getY()), Math.max(llllllllllllIllIIIIllllIIllIIIII.getZ(), llllllllllllIllIIIIllllIIlIlllll.getZ()));
        return new Iterable<BlockPos>() {
            @Override
            public Iterator<BlockPos> iterator() {
                return (Iterator<BlockPos>)new AbstractIterator<BlockPos>() {
                    private /* synthetic */ BlockPos lastReturned = null;
                    
                    private static boolean lIllIIIllIllIll(final Object lllllllllllllIlIlIIllIIlllIlIIIl) {
                        return lllllllllllllIlIlIIllIIlllIlIIIl == null;
                    }
                    
                    private static boolean lIllIIIllIlllII(final int lllllllllllllIlIlIIllIIlllIIllll) {
                        return lllllllllllllIlIlIIllIIlllIIllll != 0;
                    }
                    
                    private static boolean lIllIIIllIlllIl(final int lllllllllllllIlIlIIllIIlllIlIlII, final int lllllllllllllIlIlIIllIIlllIlIIll) {
                        return lllllllllllllIlIlIIllIIlllIlIlII < lllllllllllllIlIlIIllIIlllIlIIll;
                    }
                    
                    protected BlockPos computeNext() {
                        if (lIllIIIllIllIll(this.lastReturned)) {
                            this.lastReturned = llllllllllllIllIIIIllllIIlIllllI;
                            return this.lastReturned;
                        }
                        if (lIllIIIllIlllII(this.lastReturned.equals(llllllllllllIllIIIIllllIIlIlllIl) ? 1 : 0)) {
                            return (BlockPos)this.endOfData();
                        }
                        int lllllllllllllIlIlIIllIIlllIlllll = this.lastReturned.getX();
                        int lllllllllllllIlIlIIllIIlllIllllI = this.lastReturned.getY();
                        int lllllllllllllIlIlIIllIIlllIlllIl = this.lastReturned.getZ();
                        if (lIllIIIllIlllIl(lllllllllllllIlIlIIllIIlllIlllll, llllllllllllIllIIIIllllIIlIlllIl.getX())) {
                            ++lllllllllllllIlIlIIllIIlllIlllll;
                            "".length();
                            if ("   ".length() < 0) {
                                return null;
                            }
                        }
                        else if (lIllIIIllIlllIl(lllllllllllllIlIlIIllIIlllIllllI, llllllllllllIllIIIIllllIIlIlllIl.getY())) {
                            lllllllllllllIlIlIIllIIlllIlllll = llllllllllllIllIIIIllllIIlIllllI.getX();
                            ++lllllllllllllIlIlIIllIIlllIllllI;
                            "".length();
                            if (null != null) {
                                return null;
                            }
                        }
                        else if (lIllIIIllIlllIl(lllllllllllllIlIlIIllIIlllIlllIl, llllllllllllIllIIIIllllIIlIlllIl.getZ())) {
                            lllllllllllllIlIlIIllIIlllIlllll = llllllllllllIllIIIIllllIIlIllllI.getX();
                            lllllllllllllIlIlIIllIIlllIllllI = llllllllllllIllIIIIllllIIlIllllI.getY();
                            ++lllllllllllllIlIlIIllIIlllIlllIl;
                        }
                        this.lastReturned = new BlockPos(lllllllllllllIlIlIIllIIlllIlllll, lllllllllllllIlIlIIllIIlllIllllI, lllllllllllllIlIlIIllIIlllIlllIl);
                        return this.lastReturned;
                    }
                };
            }
        };
    }
    
    public BlockPos south() {
        return this.south(BlockPos.lllIIIIIlIlIIl[1]);
    }
    
    private static int lIIlllIIIIIllllI(final double n, final double n2) {
        return dcmpl(n, n2);
    }
    
    public BlockPos(final double llllllllllllIllIIIIllllIllllIlll, final double llllllllllllIllIIIIllllIlllllIlI, final double llllllllllllIllIIIIllllIlllllIIl) {
        super(llllllllllllIllIIIIllllIllllIlll, llllllllllllIllIIIIllllIlllllIlI, llllllllllllIllIIIIllllIlllllIIl);
    }
    
    public static final class MutableBlockPos extends BlockPos
    {
        private /* synthetic */ int y;
        private static final /* synthetic */ int[] lllIIIIlIllIlI;
        private /* synthetic */ int z;
        private /* synthetic */ int x;
        
        public MutableBlockPos func_181079_c(final int llllllllllllIllIIIIlIllIIllllIIl, final int llllllllllllIllIIIIlIllIIllllIII, final int llllllllllllIllIIIIlIllIIlllIlll) {
            this.x = llllllllllllIllIIIIlIllIIllllIIl;
            this.y = llllllllllllIllIIIIlIllIIllllIII;
            this.z = llllllllllllIllIIIIlIllIIlllIlll;
            return this;
        }
        
        @Override
        public int getZ() {
            return this.z;
        }
        
        static /* synthetic */ void access$1(final MutableBlockPos llllllllllllIllIIIIlIllIIllIllII, final int llllllllllllIllIIIIlIllIIllIlIll) {
            llllllllllllIllIIIIlIllIIllIllII.y = llllllllllllIllIIIIlIllIIllIlIll;
        }
        
        @Override
        public int getX() {
            return this.x;
        }
        
        static /* synthetic */ void access$0(final MutableBlockPos llllllllllllIllIIIIlIllIIlllIIII, final int llllllllllllIllIIIIlIllIIllIllll) {
            llllllllllllIllIIIIlIllIIlllIIII.x = llllllllllllIllIIIIlIllIIllIllll;
        }
        
        static {
            lIIlllIIlIIlllII();
        }
        
        private static void lIIlllIIlIIlllII() {
            (lllIIIIlIllIlI = new int[1])[0] = ((0xC9 ^ 0x88) & ~(0x4D ^ 0xC));
        }
        
        public MutableBlockPos(final int llllllllllllIllIIIIlIllIlIIIlIlI, final int llllllllllllIllIIIIlIllIlIIIlIIl, final int llllllllllllIllIIIIlIllIlIIIlIII) {
            super(MutableBlockPos.lllIIIIlIllIlI[0], MutableBlockPos.lllIIIIlIllIlI[0], MutableBlockPos.lllIIIIlIllIlI[0]);
            this.x = llllllllllllIllIIIIlIllIlIIIlIlI;
            this.y = llllllllllllIllIIIIlIllIlIIIlIIl;
            this.z = llllllllllllIllIIIIlIllIlIIIlIII;
        }
        
        static /* synthetic */ void access$2(final MutableBlockPos llllllllllllIllIIIIlIllIIllIlIII, final int llllllllllllIllIIIIlIllIIllIIlll) {
            llllllllllllIllIIIIlIllIIllIlIII.z = llllllllllllIllIIIIlIllIIllIIlll;
        }
        
        @Override
        public int getY() {
            return this.y;
        }
        
        public MutableBlockPos() {
            this(MutableBlockPos.lllIIIIlIllIlI[0], MutableBlockPos.lllIIIIlIllIlI[0], MutableBlockPos.lllIIIIlIllIlI[0]);
        }
    }
}
