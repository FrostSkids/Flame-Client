// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.client.particle;

import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;
import net.minecraft.world.World;

public class EntityBlockDustFX extends EntityDiggingFX
{
    protected EntityBlockDustFX(final World llllllllllllIllIIIIlIIlIlIllllIl, final double llllllllllllIllIIIIlIIlIlIllllII, final double llllllllllllIllIIIIlIIlIllIIIlII, final double llllllllllllIllIIIIlIIlIllIIIIll, final double llllllllllllIllIIIIlIIlIllIIIIlI, final double llllllllllllIllIIIIlIIlIllIIIIIl, final double llllllllllllIllIIIIlIIlIllIIIIII, final IBlockState llllllllllllIllIIIIlIIlIlIllllll) {
        super(llllllllllllIllIIIIlIIlIlIllllIl, llllllllllllIllIIIIlIIlIlIllllII, llllllllllllIllIIIIlIIlIllIIIlII, llllllllllllIllIIIIlIIlIllIIIIll, llllllllllllIllIIIIlIIlIllIIIIlI, llllllllllllIllIIIIlIIlIllIIIIIl, llllllllllllIllIIIIlIIlIllIIIIII, llllllllllllIllIIIIlIIlIlIllllll);
        this.motionX = llllllllllllIllIIIIlIIlIllIIIIlI;
        this.motionY = llllllllllllIllIIIIlIIlIllIIIIIl;
        this.motionZ = llllllllllllIllIIIIlIIlIllIIIIII;
    }
    
    public static class Factory implements IParticleFactory
    {
        private static final /* synthetic */ int[] lIIIIlIlllIlll;
        
        static {
            lIlllIlIllIIlll();
        }
        
        private static void lIlllIlIllIIlll() {
            (lIIIIlIlllIlll = new int[2])[0] = ((0x73 ^ 0x2F) & ~(0xC1 ^ 0x9D));
            Factory.lIIIIlIlllIlll[1] = -" ".length();
        }
        
        @Override
        public EntityFX getEntityFX(final int lllllllllllllIlIIlIlIIIIllIlIllI, final World lllllllllllllIlIIlIlIIIIllIlIlIl, final double lllllllllllllIlIIlIlIIIIllIlIlII, final double lllllllllllllIlIIlIlIIIIllIIlIIl, final double lllllllllllllIlIIlIlIIIIllIIlIII, final double lllllllllllllIlIIlIlIIIIllIlIIIl, final double lllllllllllllIlIIlIlIIIIllIIIllI, final double lllllllllllllIlIIlIlIIIIllIIllll, final int... lllllllllllllIlIIlIlIIIIllIIlllI) {
            final IBlockState lllllllllllllIlIIlIlIIIIllIIllIl = Block.getStateById(lllllllllllllIlIIlIlIIIIllIIlllI[Factory.lIIIIlIlllIlll[0]]);
            EntityFX func_174845_l;
            if (lIlllIlIllIlIII(lllllllllllllIlIIlIlIIIIllIIllIl.getBlock().getRenderType(), Factory.lIIIIlIlllIlll[1])) {
                func_174845_l = null;
                "".length();
                if (-(177 + 128 - 183 + 75 ^ 5 + 191 - 146 + 143) >= 0) {
                    return null;
                }
            }
            else {
                func_174845_l = new EntityBlockDustFX(lllllllllllllIlIIlIlIIIIllIlIlIl, lllllllllllllIlIIlIlIIIIllIlIlII, lllllllllllllIlIIlIlIIIIllIIlIIl, lllllllllllllIlIIlIlIIIIllIIlIII, lllllllllllllIlIIlIlIIIIllIlIIIl, lllllllllllllIlIIlIlIIIIllIIIllI, lllllllllllllIlIIlIlIIIIllIIllll, lllllllllllllIlIIlIlIIIIllIIllIl).func_174845_l();
            }
            return func_174845_l;
        }
        
        private static boolean lIlllIlIllIlIII(final int lllllllllllllIlIIlIlIIIIllIIIIIl, final int lllllllllllllIlIIlIlIIIIllIIIIII) {
            return lllllllllllllIlIIlIlIIIIllIIIIIl == lllllllllllllIlIIlIlIIIIllIIIIII;
        }
    }
}
