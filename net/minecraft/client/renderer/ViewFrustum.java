// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.client.renderer;

import net.minecraft.client.renderer.chunk.IRenderChunkFactory;
import net.minecraft.util.MathHelper;
import net.minecraft.util.BlockPos;
import net.minecraft.world.World;
import net.minecraft.client.renderer.chunk.RenderChunk;

public class ViewFrustum
{
    protected final /* synthetic */ RenderGlobal renderGlobal;
    public /* synthetic */ RenderChunk[] renderChunks;
    protected /* synthetic */ int countChunksY;
    private static final /* synthetic */ int[] lIIlIllIllIlII;
    protected /* synthetic */ int countChunksX;
    protected /* synthetic */ int countChunksZ;
    protected final /* synthetic */ World world;
    
    static {
        llIlIIllIIllIII();
    }
    
    protected void setCountChunksXYZ(final int lllllllllllllIIllIIIlIlIlIIllIll) {
        final int lllllllllllllIIllIIIlIlIlIIlllIl = lllllllllllllIIllIIIlIlIlIIllIll * ViewFrustum.lIIlIllIllIlII[2] + ViewFrustum.lIIlIllIllIlII[3];
        this.countChunksX = lllllllllllllIIllIIIlIlIlIIlllIl;
        this.countChunksY = ViewFrustum.lIIlIllIllIlII[1];
        this.countChunksZ = lllllllllllllIIllIIIlIlIlIIlllIl;
    }
    
    protected RenderChunk getRenderChunk(final BlockPos lllllllllllllIIllIIIlIlIIIIlIIll) {
        int lllllllllllllIIllIIIlIlIIIIllIII = MathHelper.bucketInt(lllllllllllllIIllIIIlIlIIIIlIIll.getX(), ViewFrustum.lIIlIllIllIlII[1]);
        final int lllllllllllllIIllIIIlIlIIIIlIlll = MathHelper.bucketInt(lllllllllllllIIllIIIlIlIIIIlIIll.getY(), ViewFrustum.lIIlIllIllIlII[1]);
        int lllllllllllllIIllIIIlIlIIIIlIllI = MathHelper.bucketInt(lllllllllllllIIllIIIlIlIIIIlIIll.getZ(), ViewFrustum.lIIlIllIllIlII[1]);
        if (llIlIIllIIlllIl(lllllllllllllIIllIIIlIlIIIIlIlll) && llIlIIllIIllllI(lllllllllllllIIllIIIlIlIIIIlIlll, this.countChunksY)) {
            lllllllllllllIIllIIIlIlIIIIllIII %= this.countChunksX;
            if (llIlIIllIIllIll(lllllllllllllIIllIIIlIlIIIIllIII)) {
                lllllllllllllIIllIIIlIlIIIIllIII += this.countChunksX;
            }
            lllllllllllllIIllIIIlIlIIIIlIllI %= this.countChunksZ;
            if (llIlIIllIIllIll(lllllllllllllIIllIIIlIlIIIIlIllI)) {
                lllllllllllllIIllIIIlIlIIIIlIllI += this.countChunksZ;
            }
            final int lllllllllllllIIllIIIlIlIIIIlIlIl = (lllllllllllllIIllIIIlIlIIIIlIllI * this.countChunksY + lllllllllllllIIllIIIlIlIIIIlIlll) * this.countChunksX + lllllllllllllIIllIIIlIlIIIIllIII;
            return this.renderChunks[lllllllllllllIIllIIIlIlIIIIlIlIl];
        }
        return null;
    }
    
    private static boolean llIlIIllIIlllII(final int lllllllllllllIIllIIIlIlIIIIIIlII, final int lllllllllllllIIllIIIlIlIIIIIIIll) {
        return lllllllllllllIIllIIIlIlIIIIIIlII > lllllllllllllIIllIIIlIlIIIIIIIll;
    }
    
    private static void llIlIIllIIllIII() {
        (lIIlIllIllIlII = new int[5])[0] = ((110 + 48 - 29 + 2 ^ 122 + 91 - 141 + 66) & (42 + 133 - 149 + 177 ^ 138 + 0 - 40 + 96 ^ -" ".length()));
        ViewFrustum.lIIlIllIllIlII[1] = (0x32 ^ 0xD ^ (0x44 ^ 0x6B));
        ViewFrustum.lIIlIllIllIlII[2] = "  ".length();
        ViewFrustum.lIIlIllIllIlII[3] = " ".length();
        ViewFrustum.lIIlIllIllIlII[4] = (0x8 ^ 0x0);
    }
    
    public ViewFrustum(final World lllllllllllllIIllIIIlIlIllIIllIl, final int lllllllllllllIIllIIIlIlIllIIllII, final RenderGlobal lllllllllllllIIllIIIlIlIllIIlIll, final IRenderChunkFactory lllllllllllllIIllIIIlIlIllIIlIlI) {
        this.renderGlobal = lllllllllllllIIllIIIlIlIllIIlIll;
        this.world = lllllllllllllIIllIIIlIlIllIIllIl;
        this.setCountChunksXYZ(lllllllllllllIIllIIIlIlIllIIllII);
        this.createRenderChunks(lllllllllllllIIllIIIlIlIllIIlIlI);
    }
    
    private static boolean llIlIIllIIllIlI(final int lllllllllllllIIllIIIlIlIIIIIIIIl) {
        return lllllllllllllIIllIIIlIlIIIIIIIIl == 0;
    }
    
    public void updateChunkPositions(final double lllllllllllllIIllIIIlIlIIlllllII, final double lllllllllllllIIllIIIlIlIIllllIll) {
        final int lllllllllllllIIllIIIlIlIlIIIlIII = MathHelper.floor_double(lllllllllllllIIllIIIlIlIIlllllII) - ViewFrustum.lIIlIllIllIlII[4];
        final int lllllllllllllIIllIIIlIlIlIIIIlll = MathHelper.floor_double(lllllllllllllIIllIIIlIlIIllllIll) - ViewFrustum.lIIlIllIllIlII[4];
        final int lllllllllllllIIllIIIlIlIlIIIIllI = this.countChunksX * ViewFrustum.lIIlIllIllIlII[1];
        int lllllllllllllIIllIIIlIlIlIIIIlIl = ViewFrustum.lIIlIllIllIlII[0];
        "".length();
        if (null != null) {
            return;
        }
        while (!llIlIIllIIllIIl(lllllllllllllIIllIIIlIlIlIIIIlIl, this.countChunksX)) {
            final int lllllllllllllIIllIIIlIlIlIIIIlII = this.func_178157_a(lllllllllllllIIllIIIlIlIlIIIlIII, lllllllllllllIIllIIIlIlIlIIIIllI, lllllllllllllIIllIIIlIlIlIIIIlIl);
            int lllllllllllllIIllIIIlIlIlIIIIIll = ViewFrustum.lIIlIllIllIlII[0];
            "".length();
            if ("   ".length() < "   ".length()) {
                return;
            }
            while (!llIlIIllIIllIIl(lllllllllllllIIllIIIlIlIlIIIIIll, this.countChunksZ)) {
                final int lllllllllllllIIllIIIlIlIlIIIIIlI = this.func_178157_a(lllllllllllllIIllIIIlIlIlIIIIlll, lllllllllllllIIllIIIlIlIlIIIIllI, lllllllllllllIIllIIIlIlIlIIIIIll);
                int lllllllllllllIIllIIIlIlIlIIIIIIl = ViewFrustum.lIIlIllIllIlII[0];
                "".length();
                if (-" ".length() != -" ".length()) {
                    return;
                }
                while (!llIlIIllIIllIIl(lllllllllllllIIllIIIlIlIlIIIIIIl, this.countChunksY)) {
                    final int lllllllllllllIIllIIIlIlIlIIIIIII = lllllllllllllIIllIIIlIlIlIIIIIIl * ViewFrustum.lIIlIllIllIlII[1];
                    final RenderChunk lllllllllllllIIllIIIlIlIIlllllll = this.renderChunks[(lllllllllllllIIllIIIlIlIlIIIIIll * this.countChunksY + lllllllllllllIIllIIIlIlIlIIIIIIl) * this.countChunksX + lllllllllllllIIllIIIlIlIlIIIIlIl];
                    final BlockPos lllllllllllllIIllIIIlIlIIllllllI = new BlockPos(lllllllllllllIIllIIIlIlIlIIIIlII, lllllllllllllIIllIIIlIlIlIIIIIII, lllllllllllllIIllIIIlIlIlIIIIIlI);
                    if (llIlIIllIIllIlI(lllllllllllllIIllIIIlIlIIllllllI.equals(lllllllllllllIIllIIIlIlIIlllllll.getPosition()) ? 1 : 0)) {
                        lllllllllllllIIllIIIlIlIIlllllll.setPosition(lllllllllllllIIllIIIlIlIIllllllI);
                    }
                    ++lllllllllllllIIllIIIlIlIlIIIIIIl;
                }
                ++lllllllllllllIIllIIIlIlIlIIIIIll;
            }
            ++lllllllllllllIIllIIIlIlIlIIIIlIl;
        }
    }
    
    private static boolean llIlIIllIIllIll(final int lllllllllllllIIllIIIlIIlllllllIl) {
        return lllllllllllllIIllIIIlIIlllllllIl < 0;
    }
    
    private static boolean llIlIIllIIllllI(final int lllllllllllllIIllIIIlIlIIIIIlIII, final int lllllllllllllIIllIIIlIlIIIIIIlll) {
        return lllllllllllllIIllIIIlIlIIIIIlIII < lllllllllllllIIllIIIlIlIIIIIIlll;
    }
    
    private static boolean llIlIIllIIlllIl(final int lllllllllllllIIllIIIlIIlllllllll) {
        return lllllllllllllIIllIIIlIIlllllllll >= 0;
    }
    
    private static boolean llIlIIllIIllIIl(final int lllllllllllllIIllIIIlIlIIIIIllII, final int lllllllllllllIIllIIIlIlIIIIIlIll) {
        return lllllllllllllIIllIIIlIlIIIIIllII >= lllllllllllllIIllIIIlIlIIIIIlIll;
    }
    
    protected void createRenderChunks(final IRenderChunkFactory lllllllllllllIIllIIIlIlIlIllllll) {
        final int lllllllllllllIIllIIIlIlIlIlllllI = this.countChunksX * this.countChunksY * this.countChunksZ;
        this.renderChunks = new RenderChunk[lllllllllllllIIllIIIlIlIlIlllllI];
        int lllllllllllllIIllIIIlIlIlIllllIl = ViewFrustum.lIIlIllIllIlII[0];
        int lllllllllllllIIllIIIlIlIlIllllII = ViewFrustum.lIIlIllIllIlII[0];
        "".length();
        if (null != null) {
            return;
        }
        while (!llIlIIllIIllIIl(lllllllllllllIIllIIIlIlIlIllllII, this.countChunksX)) {
            int lllllllllllllIIllIIIlIlIlIlllIll = ViewFrustum.lIIlIllIllIlII[0];
            "".length();
            if (-" ".length() == (0x52 ^ 0x56)) {
                return;
            }
            while (!llIlIIllIIllIIl(lllllllllllllIIllIIIlIlIlIlllIll, this.countChunksY)) {
                int lllllllllllllIIllIIIlIlIlIlllIlI = ViewFrustum.lIIlIllIllIlII[0];
                "".length();
                if ("   ".length() == (0x5D ^ 0x59)) {
                    return;
                }
                while (!llIlIIllIIllIIl(lllllllllllllIIllIIIlIlIlIlllIlI, this.countChunksZ)) {
                    final int lllllllllllllIIllIIIlIlIlIlllIIl = (lllllllllllllIIllIIIlIlIlIlllIlI * this.countChunksY + lllllllllllllIIllIIIlIlIlIlllIll) * this.countChunksX + lllllllllllllIIllIIIlIlIlIllllII;
                    final BlockPos lllllllllllllIIllIIIlIlIlIlllIII = new BlockPos(lllllllllllllIIllIIIlIlIlIllllII * ViewFrustum.lIIlIllIllIlII[1], lllllllllllllIIllIIIlIlIlIlllIll * ViewFrustum.lIIlIllIllIlII[1], lllllllllllllIIllIIIlIlIlIlllIlI * ViewFrustum.lIIlIllIllIlII[1]);
                    this.renderChunks[lllllllllllllIIllIIIlIlIlIlllIIl] = lllllllllllllIIllIIIlIlIlIllllll.makeRenderChunk(this.world, this.renderGlobal, lllllllllllllIIllIIIlIlIlIlllIII, lllllllllllllIIllIIIlIlIlIllllIl++);
                    ++lllllllllllllIIllIIIlIlIlIlllIlI;
                }
                ++lllllllllllllIIllIIIlIlIlIlllIll;
            }
            ++lllllllllllllIIllIIIlIlIlIllllII;
        }
    }
    
    public void markBlocksForUpdate(final int lllllllllllllIIllIIIlIlIIIllIlII, final int lllllllllllllIIllIIIlIlIIlIIlIII, final int lllllllllllllIIllIIIlIlIIIllIIlI, final int lllllllllllllIIllIIIlIlIIlIIIllI, final int lllllllllllllIIllIIIlIlIIlIIIlIl, final int lllllllllllllIIllIIIlIlIIIlIllll) {
        final int lllllllllllllIIllIIIlIlIIlIIIIll = MathHelper.bucketInt(lllllllllllllIIllIIIlIlIIIllIlII, ViewFrustum.lIIlIllIllIlII[1]);
        final int lllllllllllllIIllIIIlIlIIlIIIIlI = MathHelper.bucketInt(lllllllllllllIIllIIIlIlIIlIIlIII, ViewFrustum.lIIlIllIllIlII[1]);
        final int lllllllllllllIIllIIIlIlIIlIIIIIl = MathHelper.bucketInt(lllllllllllllIIllIIIlIlIIIllIIlI, ViewFrustum.lIIlIllIllIlII[1]);
        final int lllllllllllllIIllIIIlIlIIlIIIIII = MathHelper.bucketInt(lllllllllllllIIllIIIlIlIIlIIIllI, ViewFrustum.lIIlIllIllIlII[1]);
        final int lllllllllllllIIllIIIlIlIIIllllll = MathHelper.bucketInt(lllllllllllllIIllIIIlIlIIlIIIlIl, ViewFrustum.lIIlIllIllIlII[1]);
        final int lllllllllllllIIllIIIlIlIIIlllllI = MathHelper.bucketInt(lllllllllllllIIllIIIlIlIIIlIllll, ViewFrustum.lIIlIllIllIlII[1]);
        int lllllllllllllIIllIIIlIlIIIllllIl = lllllllllllllIIllIIIlIlIIlIIIIll;
        "".length();
        if (-" ".length() > 0) {
            return;
        }
        while (!llIlIIllIIlllII(lllllllllllllIIllIIIlIlIIIllllIl, lllllllllllllIIllIIIlIlIIlIIIIII)) {
            int lllllllllllllIIllIIIlIlIIIllllII = lllllllllllllIIllIIIlIlIIIllllIl % this.countChunksX;
            if (llIlIIllIIllIll(lllllllllllllIIllIIIlIlIIIllllII)) {
                lllllllllllllIIllIIIlIlIIIllllII += this.countChunksX;
            }
            int lllllllllllllIIllIIIlIlIIIlllIll = lllllllllllllIIllIIIlIlIIlIIIIlI;
            "".length();
            if ((0x5A ^ 0x5F) <= 0) {
                return;
            }
            while (!llIlIIllIIlllII(lllllllllllllIIllIIIlIlIIIlllIll, lllllllllllllIIllIIIlIlIIIllllll)) {
                int lllllllllllllIIllIIIlIlIIIlllIlI = lllllllllllllIIllIIIlIlIIIlllIll % this.countChunksY;
                if (llIlIIllIIllIll(lllllllllllllIIllIIIlIlIIIlllIlI)) {
                    lllllllllllllIIllIIIlIlIIIlllIlI += this.countChunksY;
                }
                int lllllllllllllIIllIIIlIlIIIlllIIl = lllllllllllllIIllIIIlIlIIlIIIIIl;
                "".length();
                if ((133 + 23 - 53 + 55 ^ 4 + 1 + 27 + 122) <= "   ".length()) {
                    return;
                }
                while (!llIlIIllIIlllII(lllllllllllllIIllIIIlIlIIIlllIIl, lllllllllllllIIllIIIlIlIIIlllllI)) {
                    int lllllllllllllIIllIIIlIlIIIlllIII = lllllllllllllIIllIIIlIlIIIlllIIl % this.countChunksZ;
                    if (llIlIIllIIllIll(lllllllllllllIIllIIIlIlIIIlllIII)) {
                        lllllllllllllIIllIIIlIlIIIlllIII += this.countChunksZ;
                    }
                    final int lllllllllllllIIllIIIlIlIIIllIlll = (lllllllllllllIIllIIIlIlIIIlllIII * this.countChunksY + lllllllllllllIIllIIIlIlIIIlllIlI) * this.countChunksX + lllllllllllllIIllIIIlIlIIIllllII;
                    final RenderChunk lllllllllllllIIllIIIlIlIIIllIllI = this.renderChunks[lllllllllllllIIllIIIlIlIIIllIlll];
                    lllllllllllllIIllIIIlIlIIIllIllI.setNeedsUpdate((boolean)(ViewFrustum.lIIlIllIllIlII[3] != 0));
                    ++lllllllllllllIIllIIIlIlIIIlllIIl;
                }
                ++lllllllllllllIIllIIIlIlIIIlllIll;
            }
            ++lllllllllllllIIllIIIlIlIIIllllIl;
        }
    }
    
    public void deleteGlResources() {
        final char lllllllllllllIIllIIIlIlIlIlIIIll;
        final double lllllllllllllIIllIIIlIlIlIlIIlII = ((RenderChunk[])(Object)(lllllllllllllIIllIIIlIlIlIlIIIll = (char)(Object)this.renderChunks)).length;
        boolean lllllllllllllIIllIIIlIlIlIlIIlIl = ViewFrustum.lIIlIllIllIlII[0] != 0;
        "".length();
        if ("  ".length() == 0) {
            return;
        }
        while (!llIlIIllIIllIIl(lllllllllllllIIllIIIlIlIlIlIIlIl ? 1 : 0, (int)lllllllllllllIIllIIIlIlIlIlIIlII)) {
            final RenderChunk lllllllllllllIIllIIIlIlIlIlIlIII = lllllllllllllIIllIIIlIlIlIlIIIll[lllllllllllllIIllIIIlIlIlIlIIlIl];
            lllllllllllllIIllIIIlIlIlIlIlIII.deleteGlResources();
            ++lllllllllllllIIllIIIlIlIlIlIIlIl;
        }
    }
    
    private int func_178157_a(final int lllllllllllllIIllIIIlIlIIllIIlII, final int lllllllllllllIIllIIIlIlIIllIlIII, final int lllllllllllllIIllIIIlIlIIllIIIlI) {
        final int lllllllllllllIIllIIIlIlIIllIIllI = lllllllllllllIIllIIIlIlIIllIIIlI * ViewFrustum.lIIlIllIllIlII[1];
        int lllllllllllllIIllIIIlIlIIllIIlIl = lllllllllllllIIllIIIlIlIIllIIllI - lllllllllllllIIllIIIlIlIIllIIlII + lllllllllllllIIllIIIlIlIIllIlIII / ViewFrustum.lIIlIllIllIlII[2];
        if (llIlIIllIIllIll(lllllllllllllIIllIIIlIlIIllIIlIl)) {
            lllllllllllllIIllIIIlIlIIllIIlIl -= lllllllllllllIIllIIIlIlIIllIlIII - ViewFrustum.lIIlIllIllIlII[3];
        }
        return lllllllllllllIIllIIIlIlIIllIIllI - lllllllllllllIIllIIIlIlIIllIIlIl / lllllllllllllIIllIIIlIlIIllIlIII * lllllllllllllIIllIIIlIlIIllIlIII;
    }
}
