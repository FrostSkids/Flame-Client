// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.client.particle;

import net.minecraft.world.World;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.MathHelper;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.BlockLiquid;
import net.minecraft.entity.Entity;
import net.minecraft.util.BlockPos;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.block.material.Material;

public class EntityDropParticleFX extends EntityFX
{
    private static final /* synthetic */ int[] lIllIIlIlIlIll;
    private /* synthetic */ Material materialType;
    private /* synthetic */ int bobTimer;
    
    private static boolean lllllIlIIIIIlII(final int lllllllllllllIIIIIIllllIlIIllIII) {
        return lllllllllllllIIIIIIllllIlIIllIII < 0;
    }
    
    private static boolean lllllIlIIIIIIIl(final int lllllllllllllIIIIIIllllIlIIlIllI) {
        return lllllllllllllIIIIIIllllIlIIlIllI <= 0;
    }
    
    private static boolean lllllIlIIIIIIll(final int lllllllllllllIIIIIIllllIlIIllIlI) {
        return lllllllllllllIIIIIIllllIlIIllIlI == 0;
    }
    
    private static boolean lllllIlIIIIIIlI(final int lllllllllllllIIIIIIllllIlIIlllII) {
        return lllllllllllllIIIIIIllllIlIIlllII != 0;
    }
    
    private static boolean lllllIlIIIIIIII(final int lllllllllllllIIIIIIllllIlIIlIlII) {
        return lllllllllllllIIIIIIllllIlIIlIlII > 0;
    }
    
    @Override
    public void onUpdate() {
        this.prevPosX = this.posX;
        this.prevPosY = this.posY;
        this.prevPosZ = this.posZ;
        if (lllllIIlllllllI(this.materialType, Material.water)) {
            this.particleRed = 0.2f;
            this.particleGreen = 0.3f;
            this.particleBlue = 1.0f;
            "".length();
            if ("  ".length() < "  ".length()) {
                return;
            }
        }
        else {
            this.particleRed = 1.0f;
            this.particleGreen = 16.0f / (EntityDropParticleFX.lIllIIlIlIlIll[1] - this.bobTimer + EntityDropParticleFX.lIllIIlIlIlIll[3]);
            this.particleBlue = 4.0f / (EntityDropParticleFX.lIllIIlIlIlIll[1] - this.bobTimer + EntityDropParticleFX.lIllIIlIlIlIll[4]);
        }
        this.motionY -= this.particleGravity;
        final int bobTimer = this.bobTimer;
        this.bobTimer = bobTimer - EntityDropParticleFX.lIllIIlIlIlIll[5];
        if (lllllIlIIIIIIII(bobTimer)) {
            this.motionX *= 0.02;
            this.motionY *= 0.02;
            this.motionZ *= 0.02;
            this.setParticleTextureIndex(EntityDropParticleFX.lIllIIlIlIlIll[0]);
            "".length();
            if ("   ".length() < 0) {
                return;
            }
        }
        else {
            this.setParticleTextureIndex(EntityDropParticleFX.lIllIIlIlIlIll[6]);
        }
        this.moveEntity(this.motionX, this.motionY, this.motionZ);
        this.motionX *= 0.9800000190734863;
        this.motionY *= 0.9800000190734863;
        this.motionZ *= 0.9800000190734863;
        final int particleMaxAge = this.particleMaxAge;
        this.particleMaxAge = particleMaxAge - EntityDropParticleFX.lIllIIlIlIlIll[5];
        if (lllllIlIIIIIIIl(particleMaxAge)) {
            this.setDead();
        }
        if (lllllIlIIIIIIlI(this.onGround ? 1 : 0)) {
            if (lllllIIlllllllI(this.materialType, Material.water)) {
                this.setDead();
                this.worldObj.spawnParticle(EnumParticleTypes.WATER_SPLASH, this.posX, this.posY, this.posZ, 0.0, 0.0, 0.0, new int[EntityDropParticleFX.lIllIIlIlIlIll[7]]);
                "".length();
                if (null != null) {
                    return;
                }
            }
            else {
                this.setParticleTextureIndex(EntityDropParticleFX.lIllIIlIlIlIll[8]);
            }
            this.motionX *= 0.699999988079071;
            this.motionZ *= 0.699999988079071;
        }
        final BlockPos lllllllllllllIIIIIIllllIlIlIllII = new BlockPos(this);
        final IBlockState lllllllllllllIIIIIIllllIlIlIlIll = this.worldObj.getBlockState(lllllllllllllIIIIIIllllIlIlIllII);
        final Material lllllllllllllIIIIIIllllIlIlIlIlI = lllllllllllllIIIIIIllllIlIlIlIll.getBlock().getMaterial();
        if (!lllllIlIIIIIIll(lllllllllllllIIIIIIllllIlIlIlIlI.isLiquid() ? 1 : 0) || lllllIlIIIIIIlI(lllllllllllllIIIIIIllllIlIlIlIlI.isSolid() ? 1 : 0)) {
            double lllllllllllllIIIIIIllllIlIlIlIIl = 0.0;
            if (lllllIlIIIIIIlI((lllllllllllllIIIIIIllllIlIlIlIll.getBlock() instanceof BlockLiquid) ? 1 : 0)) {
                lllllllllllllIIIIIIllllIlIlIlIIl = BlockLiquid.getLiquidHeightPercent(lllllllllllllIIIIIIllllIlIlIlIll.getValue((IProperty<Integer>)BlockLiquid.LEVEL));
            }
            final double lllllllllllllIIIIIIllllIlIlIlIII = MathHelper.floor_double(this.posY) + EntityDropParticleFX.lIllIIlIlIlIll[5] - lllllllllllllIIIIIIllllIlIlIlIIl;
            if (lllllIlIIIIIlII(lllllIIllllllll(this.posY, lllllllllllllIIIIIIllllIlIlIlIII))) {
                this.setDead();
            }
        }
    }
    
    @Override
    public float getBrightness(final float lllllllllllllIIIIIIllllIlIllIlII) {
        float brightness;
        if (lllllIIlllllllI(this.materialType, Material.water)) {
            brightness = super.getBrightness(lllllllllllllIIIIIIllllIlIllIlII);
            "".length();
            if (((0x67 ^ 0x2C ^ (0x66 ^ 0x4F)) & (0x2 ^ 0x4E ^ (0x4 ^ 0x2A) ^ -" ".length())) != 0x0) {
                return 0.0f;
            }
        }
        else {
            brightness = 1.0f;
        }
        return brightness;
    }
    
    private static boolean lllllIIlllllllI(final Object lllllllllllllIIIIIIllllIlIIlllll, final Object lllllllllllllIIIIIIllllIlIIllllI) {
        return lllllllllllllIIIIIIllllIlIIlllll == lllllllllllllIIIIIIllllIlIIllllI;
    }
    
    protected EntityDropParticleFX(final World lllllllllllllIIIIIIllllIllIIlIlI, final double lllllllllllllIIIIIIllllIllIIlIIl, final double lllllllllllllIIIIIIllllIllIIIIlI, final double lllllllllllllIIIIIIllllIllIIIlll, final Material lllllllllllllIIIIIIllllIllIIIIII) {
        super(lllllllllllllIIIIIIllllIllIIlIlI, lllllllllllllIIIIIIllllIllIIlIIl, lllllllllllllIIIIIIllllIllIIIIlI, lllllllllllllIIIIIIllllIllIIIlll, 0.0, 0.0, 0.0);
        final double motionX = 0.0;
        this.motionZ = motionX;
        this.motionY = motionX;
        this.motionX = motionX;
        if (lllllIIlllllllI(lllllllllllllIIIIIIllllIllIIIIII, Material.water)) {
            this.particleRed = 0.0f;
            this.particleGreen = 0.0f;
            this.particleBlue = 1.0f;
            "".length();
            if (" ".length() == 0) {
                throw null;
            }
        }
        else {
            this.particleRed = 1.0f;
            this.particleGreen = 0.0f;
            this.particleBlue = 0.0f;
        }
        this.setParticleTextureIndex(EntityDropParticleFX.lIllIIlIlIlIll[0]);
        this.setSize(0.01f, 0.01f);
        this.particleGravity = 0.06f;
        this.materialType = lllllllllllllIIIIIIllllIllIIIIII;
        this.bobTimer = EntityDropParticleFX.lIllIIlIlIlIll[1];
        this.particleMaxAge = (int)(64.0 / (Math.random() * 0.8 + 0.2));
        final double motionX2 = 0.0;
        this.motionZ = motionX2;
        this.motionY = motionX2;
        this.motionX = motionX2;
    }
    
    static {
        lllllIIllllllIl();
    }
    
    private static void lllllIIllllllIl() {
        (lIllIIlIlIlIll = new int[9])[0] = (0x41 ^ 0x12 ^ (0xAA ^ 0x88));
        EntityDropParticleFX.lIllIIlIlIlIll[1] = (0x32 ^ 0x1A);
        EntityDropParticleFX.lIllIIlIlIlIll[2] = (0xFFFFF7DB & 0x925);
        EntityDropParticleFX.lIllIIlIlIlIll[3] = (48 + 49 + 64 + 51 ^ 60 + 70 + 60 + 6);
        EntityDropParticleFX.lIllIIlIlIlIll[4] = (0x21 ^ 0x74 ^ (0x5C ^ 0x1));
        EntityDropParticleFX.lIllIIlIlIlIll[5] = " ".length();
        EntityDropParticleFX.lIllIIlIlIlIll[6] = (0x72 ^ 0x76 ^ (0x4A ^ 0x3E));
        EntityDropParticleFX.lIllIIlIlIlIll[7] = ((0x71 ^ 0x46) & ~(0xB8 ^ 0x8F));
        EntityDropParticleFX.lIllIIlIlIlIll[8] = (0x3B ^ 0x55 ^ (0x9 ^ 0x15));
    }
    
    private static int lllllIIllllllll(final double n, final double n2) {
        return dcmpg(n, n2);
    }
    
    @Override
    public int getBrightnessForRender(final float lllllllllllllIIIIIIllllIlIlllIlI) {
        int brightnessForRender;
        if (lllllIIlllllllI(this.materialType, Material.water)) {
            brightnessForRender = super.getBrightnessForRender(lllllllllllllIIIIIIllllIlIlllIlI);
            "".length();
            if (((0xD9 ^ 0x83) & ~(0x64 ^ 0x3E)) != 0x0) {
                return (0xD3 ^ 0x8F) & ~(0xE0 ^ 0xBC);
            }
        }
        else {
            brightnessForRender = EntityDropParticleFX.lIllIIlIlIlIll[2];
        }
        return brightnessForRender;
    }
    
    public static class LavaFactory implements IParticleFactory
    {
        @Override
        public EntityFX getEntityFX(final int llllllllllllIlIllllIlIIIIlIIlIII, final World llllllllllllIlIllllIlIIIIIllllll, final double llllllllllllIlIllllIlIIIIIlllllI, final double llllllllllllIlIllllIlIIIIIllllIl, final double llllllllllllIlIllllIlIIIIIllllII, final double llllllllllllIlIllllIlIIIIlIIIIll, final double llllllllllllIlIllllIlIIIIlIIIIlI, final double llllllllllllIlIllllIlIIIIlIIIIIl, final int... llllllllllllIlIllllIlIIIIlIIIIII) {
            return new EntityDropParticleFX(llllllllllllIlIllllIlIIIIIllllll, llllllllllllIlIllllIlIIIIIlllllI, llllllllllllIlIllllIlIIIIIllllIl, llllllllllllIlIllllIlIIIIIllllII, Material.lava);
        }
    }
    
    public static class WaterFactory implements IParticleFactory
    {
        @Override
        public EntityFX getEntityFX(final int lllllllllllllIIlIIIlIlIlllIlllll, final World lllllllllllllIIlIIIlIlIlllIllllI, final double lllllllllllllIIlIIIlIlIlllIlllIl, final double lllllllllllllIIlIIIlIlIlllIlllII, final double lllllllllllllIIlIIIlIlIlllIlIIll, final double lllllllllllllIIlIIIlIlIlllIllIlI, final double lllllllllllllIIlIIIlIlIlllIllIIl, final double lllllllllllllIIlIIIlIlIlllIllIII, final int... lllllllllllllIIlIIIlIlIlllIlIlll) {
            return new EntityDropParticleFX(lllllllllllllIIlIIIlIlIlllIllllI, lllllllllllllIIlIIIlIlIlllIlllIl, lllllllllllllIIlIIIlIlIlllIlllII, lllllllllllllIIlIIIlIlIlllIlIIll, Material.water);
        }
    }
}
