// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.block.state;

import com.google.common.base.Predicate;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import net.minecraft.util.BlockPos;

public class BlockWorldState
{
    private static final /* synthetic */ int[] llIIIIIllIIIlI;
    private final /* synthetic */ BlockPos pos;
    private final /* synthetic */ World world;
    private /* synthetic */ TileEntity tileEntity;
    private /* synthetic */ IBlockState state;
    private /* synthetic */ boolean tileEntityInitialized;
    private final /* synthetic */ boolean field_181628_c;
    
    public static Predicate<BlockWorldState> hasState(final Predicate<IBlockState> llllllllllllIlllIlllIllllIllllII) {
        return (Predicate<BlockWorldState>)new Predicate<BlockWorldState>() {
            private static final /* synthetic */ int[] llIlIIIIIIIIIl;
            
            private static boolean lIIlIIIIlllIIlIl(final int llllllllllllIllIlllIIIIlIIlIIIIl) {
                return llllllllllllIllIlllIIIIlIIlIIIIl != 0;
            }
            
            private static void lIIlIIIIlllIIIll() {
                (llIlIIIIIIIIIl = new int[2])[0] = " ".length();
                BlockWorldState$1.llIlIIIIIIIIIl[1] = ((0x30 ^ 0x64) & ~(0x52 ^ 0x6));
            }
            
            public boolean apply(final BlockWorldState llllllllllllIllIlllIIIIlIIlIlIIl) {
                if (lIIlIIIIlllIIlII(llllllllllllIllIlllIIIIlIIlIlIIl) && lIIlIIIIlllIIlIl(llllllllllllIlllIlllIllllIllllII.apply((Object)llllllllllllIllIlllIIIIlIIlIlIIl.getBlockState()) ? 1 : 0)) {
                    return BlockWorldState$1.llIlIIIIIIIIIl[0] != 0;
                }
                return BlockWorldState$1.llIlIIIIIIIIIl[1] != 0;
            }
            
            private static boolean lIIlIIIIlllIIlII(final Object llllllllllllIllIlllIIIIlIIlIIIll) {
                return llllllllllllIllIlllIIIIlIIlIIIll != null;
            }
            
            static {
                lIIlIIIIlllIIIll();
            }
        };
    }
    
    static {
        lIIIIlllIlIlIIIl();
    }
    
    public BlockWorldState(final World llllllllllllIlllIlllIlllllIIllIl, final BlockPos llllllllllllIlllIlllIlllllIIllII, final boolean llllllllllllIlllIlllIlllllIIlIll) {
        this.world = llllllllllllIlllIlllIlllllIIllIl;
        this.pos = llllllllllllIlllIlllIlllllIIllII;
        this.field_181628_c = llllllllllllIlllIlllIlllllIIlIll;
    }
    
    private static boolean lIIIIlllIlIlIlII(final int llllllllllllIlllIlllIllllIllIlll) {
        return llllllllllllIlllIlllIllllIllIlll != 0;
    }
    
    private static boolean lIIIIlllIlIlIIlI(final Object llllllllllllIlllIlllIllllIlllIIl) {
        return llllllllllllIlllIlllIllllIlllIIl == null;
    }
    
    public BlockPos getPos() {
        return this.pos;
    }
    
    public IBlockState getBlockState() {
        if (lIIIIlllIlIlIIlI(this.state) && (!lIIIIlllIlIlIIll(this.field_181628_c ? 1 : 0) || lIIIIlllIlIlIlII(this.world.isBlockLoaded(this.pos) ? 1 : 0))) {
            this.state = this.world.getBlockState(this.pos);
        }
        return this.state;
    }
    
    public TileEntity getTileEntity() {
        if (lIIIIlllIlIlIIlI(this.tileEntity) && lIIIIlllIlIlIIll(this.tileEntityInitialized ? 1 : 0)) {
            this.tileEntity = this.world.getTileEntity(this.pos);
            this.tileEntityInitialized = (BlockWorldState.llIIIIIllIIIlI[0] != 0);
        }
        return this.tileEntity;
    }
    
    private static boolean lIIIIlllIlIlIIll(final int llllllllllllIlllIlllIllllIllIlIl) {
        return llllllllllllIlllIlllIllllIllIlIl == 0;
    }
    
    private static void lIIIIlllIlIlIIIl() {
        (llIIIIIllIIIlI = new int[1])[0] = " ".length();
    }
}
