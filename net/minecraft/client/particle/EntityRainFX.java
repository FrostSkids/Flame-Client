// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.client.particle;

import net.minecraft.block.material.Material;
import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.MathHelper;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.BlockLiquid;
import net.minecraft.world.IBlockAccess;
import net.minecraft.entity.Entity;
import net.minecraft.util.BlockPos;
import net.minecraft.world.World;

public class EntityRainFX extends EntityFX
{
    private static final /* synthetic */ int[] lIlllIlIIlllII;
    
    static {
        lIIIIIlIlIllIIIl();
    }
    
    private static boolean lIIIIIlIlIllIlIl(final int llllllllllllIlllllIIIIIlIlIIllll) {
        return llllllllllllIlllllIIIIIlIlIIllll < 0;
    }
    
    protected EntityRainFX(final World llllllllllllIlllllIIIIIlIlllIIlI, final double llllllllllllIlllllIIIIIlIllIllII, final double llllllllllllIlllllIIIIIlIllIlIll, final double llllllllllllIlllllIIIIIlIllIllll) {
        super(llllllllllllIlllllIIIIIlIlllIIlI, llllllllllllIlllllIIIIIlIllIllII, llllllllllllIlllllIIIIIlIllIlIll, llllllllllllIlllllIIIIIlIllIllll, 0.0, 0.0, 0.0);
        this.motionX *= 0.30000001192092896;
        this.motionY = Math.random() * 0.20000000298023224 + 0.10000000149011612;
        this.motionZ *= 0.30000001192092896;
        this.particleRed = 1.0f;
        this.particleGreen = 1.0f;
        this.particleBlue = 1.0f;
        this.setParticleTextureIndex(EntityRainFX.lIlllIlIIlllII[0] + this.rand.nextInt(EntityRainFX.lIlllIlIIlllII[1]));
        this.setSize(0.01f, 0.01f);
        this.particleGravity = 0.06f;
        this.particleMaxAge = (int)(8.0 / (Math.random() * 0.8 + 0.2));
    }
    
    private static boolean lIIIIIlIlIllIllI(final int llllllllllllIlllllIIIIIlIlIlIIIl) {
        return llllllllllllIlllllIIIIIlIlIlIIIl == 0;
    }
    
    @Override
    public void onUpdate() {
        this.prevPosX = this.posX;
        this.prevPosY = this.posY;
        this.prevPosZ = this.posZ;
        this.motionY -= this.particleGravity;
        this.moveEntity(this.motionX, this.motionY, this.motionZ);
        this.motionX *= 0.9800000190734863;
        this.motionY *= 0.9800000190734863;
        this.motionZ *= 0.9800000190734863;
        final int particleMaxAge = this.particleMaxAge;
        this.particleMaxAge = particleMaxAge - EntityRainFX.lIlllIlIIlllII[2];
        if (lIIIIIlIlIllIIll(particleMaxAge)) {
            this.setDead();
        }
        if (lIIIIIlIlIllIlII(this.onGround ? 1 : 0)) {
            if (lIIIIIlIlIllIlIl(lIIIIIlIlIllIIlI(Math.random(), 0.5))) {
                this.setDead();
            }
            this.motionX *= 0.699999988079071;
            this.motionZ *= 0.699999988079071;
        }
        final BlockPos llllllllllllIlllllIIIIIlIllIIIIl = new BlockPos(this);
        final IBlockState llllllllllllIlllllIIIIIlIllIIIII = this.worldObj.getBlockState(llllllllllllIlllllIIIIIlIllIIIIl);
        final Block llllllllllllIlllllIIIIIlIlIlllll = llllllllllllIlllllIIIIIlIllIIIII.getBlock();
        llllllllllllIlllllIIIIIlIlIlllll.setBlockBoundsBasedOnState(this.worldObj, llllllllllllIlllllIIIIIlIllIIIIl);
        final Material llllllllllllIlllllIIIIIlIlIllllI = llllllllllllIlllllIIIIIlIllIIIII.getBlock().getMaterial();
        if (!lIIIIIlIlIllIllI(llllllllllllIlllllIIIIIlIlIllllI.isLiquid() ? 1 : 0) || lIIIIIlIlIllIlII(llllllllllllIlllllIIIIIlIlIllllI.isSolid() ? 1 : 0)) {
            double llllllllllllIlllllIIIIIlIlIlllIl = 0.0;
            if (lIIIIIlIlIllIlII((llllllllllllIlllllIIIIIlIllIIIII.getBlock() instanceof BlockLiquid) ? 1 : 0)) {
                llllllllllllIlllllIIIIIlIlIlllIl = 1.0f - BlockLiquid.getLiquidHeightPercent(llllllllllllIlllllIIIIIlIllIIIII.getValue((IProperty<Integer>)BlockLiquid.LEVEL));
                "".length();
                if ((89 + 44 - 90 + 121 ^ 114 + 151 - 191 + 86) == "  ".length()) {
                    return;
                }
            }
            else {
                llllllllllllIlllllIIIIIlIlIlllIl = llllllllllllIlllllIIIIIlIlIlllll.getBlockBoundsMaxY();
            }
            final double llllllllllllIlllllIIIIIlIlIlllII = MathHelper.floor_double(this.posY) + llllllllllllIlllllIIIIIlIlIlllIl;
            if (lIIIIIlIlIllIlIl(lIIIIIlIlIllIIlI(this.posY, llllllllllllIlllllIIIIIlIlIlllII))) {
                this.setDead();
            }
        }
    }
    
    private static boolean lIIIIIlIlIllIlII(final int llllllllllllIlllllIIIIIlIlIlIIll) {
        return llllllllllllIlllllIIIIIlIlIlIIll != 0;
    }
    
    private static boolean lIIIIIlIlIllIIll(final int llllllllllllIlllllIIIIIlIlIIllIl) {
        return llllllllllllIlllllIIIIIlIlIIllIl <= 0;
    }
    
    private static void lIIIIIlIlIllIIIl() {
        (lIlllIlIIlllII = new int[3])[0] = (0xC ^ 0x1F);
        EntityRainFX.lIlllIlIIlllII[1] = (0xBA ^ 0x8A ^ (0x18 ^ 0x2C));
        EntityRainFX.lIlllIlIIlllII[2] = " ".length();
    }
    
    private static int lIIIIIlIlIllIIlI(final double n, final double n2) {
        return dcmpg(n, n2);
    }
    
    public static class Factory implements IParticleFactory
    {
        @Override
        public EntityFX getEntityFX(final int lllllllllllllIlIIIlllIIlIlIIIllI, final World lllllllllllllIlIIIlllIIlIIllllIl, final double lllllllllllllIlIIIlllIIlIIllllII, final double lllllllllllllIlIIIlllIIlIlIIIIll, final double lllllllllllllIlIIIlllIIlIIlllIlI, final double lllllllllllllIlIIIlllIIlIlIIIIIl, final double lllllllllllllIlIIIlllIIlIlIIIIII, final double lllllllllllllIlIIIlllIIlIIllllll, final int... lllllllllllllIlIIIlllIIlIIlllllI) {
            return new EntityRainFX(lllllllllllllIlIIIlllIIlIIllllIl, lllllllllllllIlIIIlllIIlIIllllII, lllllllllllllIlIIIlllIIlIlIIIIll, lllllllllllllIlIIIlllIIlIIlllIlI);
        }
    }
}
