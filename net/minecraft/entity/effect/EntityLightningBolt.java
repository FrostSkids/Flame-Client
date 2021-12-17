// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.entity.effect;

import java.util.List;
import net.minecraft.util.AxisAlignedBB;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.security.MessageDigest;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.init.Blocks;
import net.minecraft.block.material.Material;
import net.minecraft.world.EnumDifficulty;
import net.minecraft.entity.Entity;
import net.minecraft.util.BlockPos;
import net.minecraft.world.World;

public class EntityLightningBolt extends EntityWeatherEffect
{
    private static final /* synthetic */ String[] lIIllIIlIIllll;
    private static final /* synthetic */ int[] lIIllIIlIlIIIl;
    private /* synthetic */ int boltLivingTime;
    private /* synthetic */ int lightningState;
    public /* synthetic */ long boltVertex;
    
    public EntityLightningBolt(final World lllllllllllllIIlIllIIIIlllIlIIIl, final double lllllllllllllIIlIllIIIIlllIIlIII, final double lllllllllllllIIlIllIIIIlllIIIlll, final double lllllllllllllIIlIllIIIIlllIIlllI) {
        super(lllllllllllllIIlIllIIIIlllIlIIIl);
        this.setLocationAndAngles(lllllllllllllIIlIllIIIIlllIIlIII, lllllllllllllIIlIllIIIIlllIIIlll, lllllllllllllIIlIllIIIIlllIIlllI, 0.0f, 0.0f);
        this.lightningState = EntityLightningBolt.lIIllIIlIlIIIl[0];
        this.boltVertex = this.rand.nextLong();
        this.boltLivingTime = this.rand.nextInt(EntityLightningBolt.lIIllIIlIlIIIl[1]) + EntityLightningBolt.lIIllIIlIlIIIl[2];
        final BlockPos lllllllllllllIIlIllIIIIlllIIllIl = new BlockPos(this);
        if (llIlIlllIIlIlll(lllllllllllllIIlIllIIIIlllIlIIIl.isRemote ? 1 : 0) && llIlIlllIIllIII(lllllllllllllIIlIllIIIIlllIlIIIl.getGameRules().getBoolean(EntityLightningBolt.lIIllIIlIIllll[EntityLightningBolt.lIIllIIlIlIIIl[3]]) ? 1 : 0) && (!llIlIlllIIllIIl(lllllllllllllIIlIllIIIIlllIlIIIl.getDifficulty(), EnumDifficulty.NORMAL) || llIlIlllIIllIlI(lllllllllllllIIlIllIIIIlllIlIIIl.getDifficulty(), EnumDifficulty.HARD)) && llIlIlllIIllIII(lllllllllllllIIlIllIIIIlllIlIIIl.isAreaLoaded(lllllllllllllIIlIllIIIIlllIIllIl, EntityLightningBolt.lIIllIIlIlIIIl[4]) ? 1 : 0)) {
            if (llIlIlllIIllIlI(lllllllllllllIIlIllIIIIlllIlIIIl.getBlockState(lllllllllllllIIlIllIIIIlllIIllIl).getBlock().getMaterial(), Material.air) && llIlIlllIIllIII(Blocks.fire.canPlaceBlockAt(lllllllllllllIIlIllIIIIlllIlIIIl, lllllllllllllIIlIllIIIIlllIIllIl) ? 1 : 0)) {
                lllllllllllllIIlIllIIIIlllIlIIIl.setBlockState(lllllllllllllIIlIllIIIIlllIIllIl, Blocks.fire.getDefaultState());
                "".length();
            }
            int lllllllllllllIIlIllIIIIlllIIllII = EntityLightningBolt.lIIllIIlIlIIIl[3];
            "".length();
            if ("  ".length() < " ".length()) {
                throw null;
            }
            while (!llIlIlllIIllIll(lllllllllllllIIlIllIIIIlllIIllII, EntityLightningBolt.lIIllIIlIlIIIl[5])) {
                final BlockPos lllllllllllllIIlIllIIIIlllIIlIll = lllllllllllllIIlIllIIIIlllIIllIl.add(this.rand.nextInt(EntityLightningBolt.lIIllIIlIlIIIl[1]) - EntityLightningBolt.lIIllIIlIlIIIl[2], this.rand.nextInt(EntityLightningBolt.lIIllIIlIlIIIl[1]) - EntityLightningBolt.lIIllIIlIlIIIl[2], this.rand.nextInt(EntityLightningBolt.lIIllIIlIlIIIl[1]) - EntityLightningBolt.lIIllIIlIlIIIl[2]);
                if (llIlIlllIIllIlI(lllllllllllllIIlIllIIIIlllIlIIIl.getBlockState(lllllllllllllIIlIllIIIIlllIIlIll).getBlock().getMaterial(), Material.air) && llIlIlllIIllIII(Blocks.fire.canPlaceBlockAt(lllllllllllllIIlIllIIIIlllIlIIIl, lllllllllllllIIlIllIIIIlllIIlIll) ? 1 : 0)) {
                    lllllllllllllIIlIllIIIIlllIlIIIl.setBlockState(lllllllllllllIIlIllIIIIlllIIlIll, Blocks.fire.getDefaultState());
                    "".length();
                }
                ++lllllllllllllIIlIllIIIIlllIIllII;
            }
        }
    }
    
    @Override
    protected void writeEntityToNBT(final NBTTagCompound lllllllllllllIIlIllIIIIllIlIlllI) {
    }
    
    @Override
    protected void entityInit() {
    }
    
    private static String llIlIlllIIIlIll(String lllllllllllllIIlIllIIIIllIIlIIIl, final String lllllllllllllIIlIllIIIIllIIlIlIl) {
        lllllllllllllIIlIllIIIIllIIlIIIl = new String(Base64.getDecoder().decode(lllllllllllllIIlIllIIIIllIIlIIIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIIlIllIIIIllIIlIlII = new StringBuilder();
        final char[] lllllllllllllIIlIllIIIIllIIlIIll = lllllllllllllIIlIllIIIIllIIlIlIl.toCharArray();
        int lllllllllllllIIlIllIIIIllIIlIIlI = EntityLightningBolt.lIIllIIlIlIIIl[3];
        final String lllllllllllllIIlIllIIIIllIIIllII = (Object)lllllllllllllIIlIllIIIIllIIlIIIl.toCharArray();
        final byte lllllllllllllIIlIllIIIIllIIIlIll = (byte)lllllllllllllIIlIllIIIIllIIIllII.length;
        short lllllllllllllIIlIllIIIIllIIIlIlI = (short)EntityLightningBolt.lIIllIIlIlIIIl[3];
        while (llIlIlllIIllllI(lllllllllllllIIlIllIIIIllIIIlIlI, lllllllllllllIIlIllIIIIllIIIlIll)) {
            final char lllllllllllllIIlIllIIIIllIIlIlll = lllllllllllllIIlIllIIIIllIIIllII[lllllllllllllIIlIllIIIIllIIIlIlI];
            lllllllllllllIIlIllIIIIllIIlIlII.append((char)(lllllllllllllIIlIllIIIIllIIlIlll ^ lllllllllllllIIlIllIIIIllIIlIIll[lllllllllllllIIlIllIIIIllIIlIIlI % lllllllllllllIIlIllIIIIllIIlIIll.length]));
            "".length();
            ++lllllllllllllIIlIllIIIIllIIlIIlI;
            ++lllllllllllllIIlIllIIIIllIIIlIlI;
            "".length();
            if (((0x3 ^ 0x38) & ~(0x43 ^ 0x78)) == "  ".length()) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIIlIllIIIIllIIlIlII);
    }
    
    private static boolean llIlIlllIIllIII(final int lllllllllllllIIlIllIIIIlIlllIIll) {
        return lllllllllllllIIlIllIIIIlIlllIIll != 0;
    }
    
    @Override
    protected void readEntityFromNBT(final NBTTagCompound lllllllllllllIIlIllIIIIllIllIIII) {
    }
    
    private static String llIlIlllIIIlIlI(final String lllllllllllllIIlIllIIIIllIlIIlII, final String lllllllllllllIIlIllIIIIllIlIIIll) {
        try {
            final SecretKeySpec lllllllllllllIIlIllIIIIllIlIlIIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIIlIllIIIIllIlIIIll.getBytes(StandardCharsets.UTF_8)), EntityLightningBolt.lIIllIIlIlIIIl[6]), "DES");
            final Cipher lllllllllllllIIlIllIIIIllIlIlIII = Cipher.getInstance("DES");
            lllllllllllllIIlIllIIIIllIlIlIII.init(EntityLightningBolt.lIIllIIlIlIIIl[0], lllllllllllllIIlIllIIIIllIlIlIIl);
            return new String(lllllllllllllIIlIllIIIIllIlIlIII.doFinal(Base64.getDecoder().decode(lllllllllllllIIlIllIIIIllIlIIlII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIlIllIIIIllIlIIlll) {
            lllllllllllllIIlIllIIIIllIlIIlll.printStackTrace();
            return null;
        }
    }
    
    private static boolean llIlIlllIIlllII(final int lllllllllllllIIlIllIIIIllIIIIllI, final int lllllllllllllIIlIllIIIIllIIIIlIl) {
        return lllllllllllllIIlIllIIIIllIIIIllI == lllllllllllllIIlIllIIIIllIIIIlIl;
    }
    
    private static boolean llIlIlllIIlIlll(final int lllllllllllllIIlIllIIIIlIlllIIIl) {
        return lllllllllllllIIlIllIIIIlIlllIIIl == 0;
    }
    
    private static boolean llIlIlllIIlllIl(final int lllllllllllllIIlIllIIIIlIllIllIl) {
        return lllllllllllllIIlIllIIIIlIllIllIl < 0;
    }
    
    @Override
    public void onUpdate() {
        super.onUpdate();
        if (llIlIlllIIlllII(this.lightningState, EntityLightningBolt.lIIllIIlIlIIIl[0])) {
            this.worldObj.playSoundEffect(this.posX, this.posY, this.posZ, EntityLightningBolt.lIIllIIlIIllll[EntityLightningBolt.lIIllIIlIlIIIl[2]], 10000.0f, 0.8f + this.rand.nextFloat() * 0.2f);
            this.worldObj.playSoundEffect(this.posX, this.posY, this.posZ, EntityLightningBolt.lIIllIIlIIllll[EntityLightningBolt.lIIllIIlIlIIIl[0]], 2.0f, 0.5f + this.rand.nextFloat() * 0.2f);
        }
        this.lightningState -= EntityLightningBolt.lIIllIIlIlIIIl[2];
        if (llIlIlllIIlllIl(this.lightningState)) {
            if (llIlIlllIIlIlll(this.boltLivingTime)) {
                this.setDead();
                "".length();
                if (-" ".length() == "   ".length()) {
                    return;
                }
            }
            else if (llIlIlllIIllllI(this.lightningState, -this.rand.nextInt(EntityLightningBolt.lIIllIIlIlIIIl[4]))) {
                this.boltLivingTime -= EntityLightningBolt.lIIllIIlIlIIIl[2];
                this.lightningState = EntityLightningBolt.lIIllIIlIlIIIl[2];
                this.boltVertex = this.rand.nextLong();
                final BlockPos lllllllllllllIIlIllIIIIllIllllII = new BlockPos(this);
                if (llIlIlllIIlIlll(this.worldObj.isRemote ? 1 : 0) && llIlIlllIIllIII(this.worldObj.getGameRules().getBoolean(EntityLightningBolt.lIIllIIlIIllll[EntityLightningBolt.lIIllIIlIlIIIl[1]]) ? 1 : 0) && llIlIlllIIllIII(this.worldObj.isAreaLoaded(lllllllllllllIIlIllIIIIllIllllII, EntityLightningBolt.lIIllIIlIlIIIl[4]) ? 1 : 0) && llIlIlllIIllIlI(this.worldObj.getBlockState(lllllllllllllIIlIllIIIIllIllllII).getBlock().getMaterial(), Material.air) && llIlIlllIIllIII(Blocks.fire.canPlaceBlockAt(this.worldObj, lllllllllllllIIlIllIIIIllIllllII) ? 1 : 0)) {
                    this.worldObj.setBlockState(lllllllllllllIIlIllIIIIllIllllII, Blocks.fire.getDefaultState());
                    "".length();
                }
            }
        }
        if (llIlIlllIIlllll(this.lightningState)) {
            if (llIlIlllIIllIII(this.worldObj.isRemote ? 1 : 0)) {
                this.worldObj.setLastLightningBolt(EntityLightningBolt.lIIllIIlIlIIIl[0]);
                "".length();
                if (null != null) {
                    return;
                }
            }
            else {
                final double lllllllllllllIIlIllIIIIllIlllIll = 3.0;
                final List<Entity> lllllllllllllIIlIllIIIIllIlllIlI = this.worldObj.getEntitiesWithinAABBExcludingEntity(this, new AxisAlignedBB(this.posX - lllllllllllllIIlIllIIIIllIlllIll, this.posY - lllllllllllllIIlIllIIIIllIlllIll, this.posZ - lllllllllllllIIlIllIIIIllIlllIll, this.posX + lllllllllllllIIlIllIIIIllIlllIll, this.posY + 6.0 + lllllllllllllIIlIllIIIIllIlllIll, this.posZ + lllllllllllllIIlIllIIIIllIlllIll));
                int lllllllllllllIIlIllIIIIllIlllIIl = EntityLightningBolt.lIIllIIlIlIIIl[3];
                "".length();
                if (null != null) {
                    return;
                }
                while (!llIlIlllIIllIll(lllllllllllllIIlIllIIIIllIlllIIl, lllllllllllllIIlIllIIIIllIlllIlI.size())) {
                    final Entity lllllllllllllIIlIllIIIIllIlllIII = lllllllllllllIIlIllIIIIllIlllIlI.get(lllllllllllllIIlIllIIIIllIlllIIl);
                    lllllllllllllIIlIllIIIIllIlllIII.onStruckByLightning(this);
                    ++lllllllllllllIIlIllIIIIllIlllIIl;
                }
            }
        }
    }
    
    private static void llIlIlllIIIllII() {
        (lIIllIIlIIllll = new String[EntityLightningBolt.lIIllIIlIlIIIl[5]])[EntityLightningBolt.lIIllIIlIlIIIl[3]] = llIlIlllIIIlIlI("L310zrFtMSVUTEWVqpzvvQ==", "anHMK");
        EntityLightningBolt.lIIllIIlIIllll[EntityLightningBolt.lIIllIIlIlIIIl[2]] = llIlIlllIIIlIlI("cQeh82+M9ryL81mV8FpaTeJCHO5zhlzx", "rXpTu");
        EntityLightningBolt.lIIllIIlIIllll[EntityLightningBolt.lIIllIIlIlIIIl[0]] = llIlIlllIIIlIll("AQk5MQceRjItGB8HMzA=", "shWUh");
        EntityLightningBolt.lIIllIIlIIllll[EntityLightningBolt.lIIllIIlIlIIIl[1]] = llIlIlllIIIlIll("Ci0vOgsLFgAwEg==", "nBiSy");
    }
    
    private static boolean llIlIlllIIllIll(final int lllllllllllllIIlIllIIIIllIIIIIlI, final int lllllllllllllIIlIllIIIIllIIIIIIl) {
        return lllllllllllllIIlIllIIIIllIIIIIlI >= lllllllllllllIIlIllIIIIllIIIIIIl;
    }
    
    private static void llIlIlllIIlIllI() {
        (lIIllIIlIlIIIl = new int[7])[0] = "  ".length();
        EntityLightningBolt.lIIllIIlIlIIIl[1] = "   ".length();
        EntityLightningBolt.lIIllIIlIlIIIl[2] = " ".length();
        EntityLightningBolt.lIIllIIlIlIIIl[3] = ((0x4 ^ 0x73 ^ (0xD6 ^ 0xB2)) & (0xB0 ^ 0xAA ^ (0x25 ^ 0x2C) ^ -" ".length()));
        EntityLightningBolt.lIIllIIlIlIIIl[4] = (0x8D ^ 0x87);
        EntityLightningBolt.lIIllIIlIlIIIl[5] = (0xA0 ^ 0xA4);
        EntityLightningBolt.lIIllIIlIlIIIl[6] = (0x3C ^ 0x34);
    }
    
    static {
        llIlIlllIIlIllI();
        llIlIlllIIIllII();
    }
    
    private static boolean llIlIlllIIllllI(final int lllllllllllllIIlIllIIIIlIllllllI, final int lllllllllllllIIlIllIIIIlIlllllIl) {
        return lllllllllllllIIlIllIIIIlIllllllI < lllllllllllllIIlIllIIIIlIlllllIl;
    }
    
    private static boolean llIlIlllIIllIIl(final Object lllllllllllllIIlIllIIIIlIllllIlI, final Object lllllllllllllIIlIllIIIIlIllllIIl) {
        return lllllllllllllIIlIllIIIIlIllllIlI != lllllllllllllIIlIllIIIIlIllllIIl;
    }
    
    private static boolean llIlIlllIIlllll(final int lllllllllllllIIlIllIIIIlIllIllll) {
        return lllllllllllllIIlIllIIIIlIllIllll >= 0;
    }
    
    private static boolean llIlIlllIIllIlI(final Object lllllllllllllIIlIllIIIIlIlllIllI, final Object lllllllllllllIIlIllIIIIlIlllIlIl) {
        return lllllllllllllIIlIllIIIIlIlllIllI == lllllllllllllIIlIllIIIIlIlllIlIl;
    }
}
