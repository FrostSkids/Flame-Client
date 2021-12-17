// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.tileentity;

import net.minecraft.block.BlockDaylightDetector;
import net.minecraft.util.ITickable;

public class TileEntityDaylightDetector extends TileEntity implements ITickable
{
    private static boolean llIllllIlIlIlll(final int lllllllllllllIIlIIlIIIlllIlIIIII) {
        return lllllllllllllIIlIIlIIIlllIlIIIII != 0;
    }
    
    private static boolean llIllllIlIlIlIl(final Object lllllllllllllIIlIIlIIIlllIlIIIlI) {
        return lllllllllllllIIlIIlIIIlllIlIIIlI != null;
    }
    
    @Override
    public void update() {
        if (llIllllIlIlIlIl(this.worldObj) && llIllllIlIlIllI(this.worldObj.isRemote ? 1 : 0) && llIllllIlIlIllI(llIllllIlIlIlII(this.worldObj.getTotalWorldTime() % 20L, 0L))) {
            this.blockType = this.getBlockType();
            if (llIllllIlIlIlll((this.blockType instanceof BlockDaylightDetector) ? 1 : 0)) {
                ((BlockDaylightDetector)this.blockType).updatePower(this.worldObj, this.pos);
            }
        }
    }
    
    private static int llIllllIlIlIlII(final long n, final long n2) {
        return lcmp(n, n2);
    }
    
    private static boolean llIllllIlIlIllI(final int lllllllllllllIIlIIlIIIlllIIllllI) {
        return lllllllllllllIIlIIlIIIlllIIllllI == 0;
    }
}
