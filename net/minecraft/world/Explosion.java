// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.world;

import java.util.Iterator;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.util.EnumParticleTypes;
import com.google.common.collect.Maps;
import com.google.common.collect.Lists;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import net.minecraft.block.state.IBlockState;
import java.util.Set;
import net.minecraft.enchantment.EnchantmentProtection;
import net.minecraft.util.DamageSource;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.MathHelper;
import java.util.Collection;
import net.minecraft.block.material.Material;
import com.google.common.collect.Sets;
import net.minecraft.entity.item.EntityTNTPrimed;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.Entity;
import java.util.Random;
import net.minecraft.util.BlockPos;
import java.util.List;
import net.minecraft.util.Vec3;
import net.minecraft.entity.player.EntityPlayer;
import java.util.Map;

public class Explosion
{
    private final /* synthetic */ Map<EntityPlayer, Vec3> playerKnockbackMap;
    private final /* synthetic */ List<BlockPos> affectedBlockPositions;
    private final /* synthetic */ double explosionY;
    private final /* synthetic */ World worldObj;
    private final /* synthetic */ double explosionZ;
    private final /* synthetic */ boolean isSmoking;
    private static final /* synthetic */ int[] lllIlIlIIIlIlI;
    private final /* synthetic */ boolean isFlaming;
    private final /* synthetic */ Random explosionRNG;
    private final /* synthetic */ Entity exploder;
    private final /* synthetic */ float explosionSize;
    private static final /* synthetic */ String[] lllIlIlIIIlIIl;
    private final /* synthetic */ double explosionX;
    
    private static int lIlIIIlIlIlIllll(final double n, final double n2) {
        return dcmpl(n, n2);
    }
    
    private static boolean lIlIIIlIlIllIlll(final int llllllllllllIlIllIllIllIllIIIIlI, final int llllllllllllIlIllIllIllIllIIIIIl) {
        return llllllllllllIlIllIllIllIllIIIIlI >= llllllllllllIlIllIllIllIllIIIIIl;
    }
    
    public Map<EntityPlayer, Vec3> getPlayerKnockbackMap() {
        return this.playerKnockbackMap;
    }
    
    public void func_180342_d() {
        this.affectedBlockPositions.clear();
    }
    
    public EntityLivingBase getExplosivePlacedBy() {
        EntityLivingBase tntPlacedBy;
        if (lIlIIIlIlIllllII(this.exploder)) {
            tntPlacedBy = null;
            "".length();
            if (-" ".length() < -" ".length()) {
                return null;
            }
        }
        else if (lIlIIIlIlIllIIII((this.exploder instanceof EntityTNTPrimed) ? 1 : 0)) {
            tntPlacedBy = ((EntityTNTPrimed)this.exploder).getTntPlacedBy();
            "".length();
            if ((0xB ^ 0x5 ^ (0x49 ^ 0x43)) == " ".length()) {
                return null;
            }
        }
        else if (lIlIIIlIlIllIIII((this.exploder instanceof EntityLivingBase) ? 1 : 0)) {
            tntPlacedBy = (EntityLivingBase)this.exploder;
            "".length();
            if (" ".length() == 0) {
                return null;
            }
        }
        else {
            tntPlacedBy = null;
        }
        return tntPlacedBy;
    }
    
    private static void lIlIIIlIlIlIllII() {
        (lllIlIlIIIlIlI = new int[7])[0] = ((0x32 ^ 0x64) & ~(0x79 ^ 0x2F));
        Explosion.lllIlIlIIIlIlI[1] = " ".length();
        Explosion.lllIlIlIIIlIlI[2] = (0x30 ^ 0x20);
        Explosion.lllIlIlIIIlIlI[3] = (0xC5 ^ 0x90 ^ (0x53 ^ 0x9));
        Explosion.lllIlIlIIIlIlI[4] = "   ".length();
        Explosion.lllIlIlIIIlIlI[5] = (0x19 ^ 0x11);
        Explosion.lllIlIlIIIlIlI[6] = "  ".length();
    }
    
    private static boolean lIlIIIlIlIllIIlI(final int llllllllllllIlIllIllIllIllIIIllI, final int llllllllllllIlIllIllIllIllIIIlIl) {
        return llllllllllllIlIllIllIllIllIIIllI == llllllllllllIlIllIllIllIllIIIlIl;
    }
    
    private static int lIlIIIlIlIlIllIl(final float n, final float n2) {
        return fcmpl(n, n2);
    }
    
    public void doExplosionA() {
        final Set<BlockPos> llllllllllllIlIllIllIlllIlIIIlll = (Set<BlockPos>)Sets.newHashSet();
        final int llllllllllllIlIllIllIlllIlIIIllI = Explosion.lllIlIlIIIlIlI[2];
        int llllllllllllIlIllIllIlllIlIIIlIl = Explosion.lllIlIlIIIlIlI[0];
        "".length();
        if ("  ".length() != "  ".length()) {
            return;
        }
        while (!lIlIIIlIlIllIlll(llllllllllllIlIllIllIlllIlIIIlIl, Explosion.lllIlIlIIIlIlI[2])) {
            int llllllllllllIlIllIllIlllIlIIIlII = Explosion.lllIlIlIIIlIlI[0];
            "".length();
            if (((0xC5 ^ 0x89) & ~(0x18 ^ 0x54)) > "  ".length()) {
                return;
            }
            while (!lIlIIIlIlIllIlll(llllllllllllIlIllIllIlllIlIIIlII, Explosion.lllIlIlIIIlIlI[2])) {
                int llllllllllllIlIllIllIlllIlIIIIll = Explosion.lllIlIlIIIlIlI[0];
                "".length();
                if (-" ".length() != -" ".length()) {
                    return;
                }
                while (!lIlIIIlIlIllIlll(llllllllllllIlIllIllIlllIlIIIIll, Explosion.lllIlIlIIIlIlI[2])) {
                    if (!lIlIIIlIlIllIIII(llllllllllllIlIllIllIlllIlIIIlIl) || !lIlIIIlIlIllIIIl(llllllllllllIlIllIllIlllIlIIIlIl, Explosion.lllIlIlIIIlIlI[3]) || !lIlIIIlIlIllIIII(llllllllllllIlIllIllIlllIlIIIlII) || !lIlIIIlIlIllIIIl(llllllllllllIlIllIllIlllIlIIIlII, Explosion.lllIlIlIIIlIlI[3]) || !lIlIIIlIlIllIIII(llllllllllllIlIllIllIlllIlIIIIll) || lIlIIIlIlIllIIlI(llllllllllllIlIllIllIlllIlIIIIll, Explosion.lllIlIlIIIlIlI[3])) {
                        double llllllllllllIlIllIllIlllIlIIIIlI = llllllllllllIlIllIllIlllIlIIIlIl / 15.0f * 2.0f - 1.0f;
                        double llllllllllllIlIllIllIlllIlIIIIIl = llllllllllllIlIllIllIlllIlIIIlII / 15.0f * 2.0f - 1.0f;
                        double llllllllllllIlIllIllIlllIlIIIIII = llllllllllllIlIllIllIlllIlIIIIll / 15.0f * 2.0f - 1.0f;
                        final double llllllllllllIlIllIllIlllIIllllll = Math.sqrt(llllllllllllIlIllIllIlllIlIIIIlI * llllllllllllIlIllIllIlllIlIIIIlI + llllllllllllIlIllIllIlllIlIIIIIl * llllllllllllIlIllIllIlllIlIIIIIl + llllllllllllIlIllIllIlllIlIIIIII * llllllllllllIlIllIllIlllIlIIIIII);
                        llllllllllllIlIllIllIlllIlIIIIlI /= llllllllllllIlIllIllIlllIIllllll;
                        llllllllllllIlIllIllIlllIlIIIIIl /= llllllllllllIlIllIllIlllIIllllll;
                        llllllllllllIlIllIllIlllIlIIIIII /= llllllllllllIlIllIllIlllIIllllll;
                        float llllllllllllIlIllIllIlllIIlllllI = this.explosionSize * (0.7f + this.worldObj.rand.nextFloat() * 0.6f);
                        double llllllllllllIlIllIllIlllIIllllIl = this.explosionX;
                        double llllllllllllIlIllIllIlllIIllllII = this.explosionY;
                        double llllllllllllIlIllIllIlllIIlllIll = this.explosionZ;
                        final float llllllllllllIlIllIllIlllIIlllIlI = 0.3f;
                        "".length();
                        if (null != null) {
                            return;
                        }
                        while (!lIlIIIlIlIllIllI(lIlIIIlIlIlIllIl(llllllllllllIlIllIllIlllIIlllllI, 0.0f))) {
                            final BlockPos llllllllllllIlIllIllIlllIIlllIIl = new BlockPos(llllllllllllIlIllIllIlllIIllllIl, llllllllllllIlIllIllIlllIIllllII, llllllllllllIlIllIllIlllIIlllIll);
                            final IBlockState llllllllllllIlIllIllIlllIIlllIII = this.worldObj.getBlockState(llllllllllllIlIllIllIlllIIlllIIl);
                            if (lIlIIIlIlIllIIll(llllllllllllIlIllIllIlllIIlllIII.getBlock().getMaterial(), Material.air)) {
                                float n;
                                if (lIlIIIlIlIllIlII(this.exploder)) {
                                    n = this.exploder.getExplosionResistance(this, this.worldObj, llllllllllllIlIllIllIlllIIlllIIl, llllllllllllIlIllIllIlllIIlllIII);
                                    "".length();
                                    if ("  ".length() <= -" ".length()) {
                                        return;
                                    }
                                }
                                else {
                                    n = llllllllllllIlIllIllIlllIIlllIII.getBlock().getExplosionResistance(null);
                                }
                                final float llllllllllllIlIllIllIlllIIllIlll = n;
                                llllllllllllIlIllIllIlllIIlllllI -= (llllllllllllIlIllIllIlllIIllIlll + 0.3f) * 0.3f;
                            }
                            if (lIlIIIlIlIllIlIl(lIlIIIlIlIlIllIl(llllllllllllIlIllIllIlllIIlllllI, 0.0f)) && (!lIlIIIlIlIllIlII(this.exploder) || lIlIIIlIlIllIIII(this.exploder.verifyExplosion(this, this.worldObj, llllllllllllIlIllIllIlllIIlllIIl, llllllllllllIlIllIllIlllIIlllIII, llllllllllllIlIllIllIlllIIlllllI) ? 1 : 0))) {
                                llllllllllllIlIllIllIlllIlIIIlll.add(llllllllllllIlIllIllIlllIIlllIIl);
                                "".length();
                            }
                            llllllllllllIlIllIllIlllIIllllIl += llllllllllllIlIllIllIlllIlIIIIlI * 0.30000001192092896;
                            llllllllllllIlIllIllIlllIIllllII += llllllllllllIlIllIllIlllIlIIIIIl * 0.30000001192092896;
                            llllllllllllIlIllIllIlllIIlllIll += llllllllllllIlIllIllIlllIlIIIIII * 0.30000001192092896;
                            llllllllllllIlIllIllIlllIIlllllI -= 0.22500001f;
                        }
                    }
                    ++llllllllllllIlIllIllIlllIlIIIIll;
                }
                ++llllllllllllIlIllIllIlllIlIIIlII;
            }
            ++llllllllllllIlIllIllIlllIlIIIlIl;
        }
        this.affectedBlockPositions.addAll(llllllllllllIlIllIllIlllIlIIIlll);
        "".length();
        final float llllllllllllIlIllIllIlllIIllIllI = this.explosionSize * 2.0f;
        final int llllllllllllIlIllIllIlllIIllIlIl = MathHelper.floor_double(this.explosionX - llllllllllllIlIllIllIlllIIllIllI - 1.0);
        final int llllllllllllIlIllIllIlllIIllIlII = MathHelper.floor_double(this.explosionX + llllllllllllIlIllIllIlllIIllIllI + 1.0);
        final int llllllllllllIlIllIllIlllIIllIIll = MathHelper.floor_double(this.explosionY - llllllllllllIlIllIllIlllIIllIllI - 1.0);
        final int llllllllllllIlIllIllIlllIIllIIlI = MathHelper.floor_double(this.explosionY + llllllllllllIlIllIllIlllIIllIllI + 1.0);
        final int llllllllllllIlIllIllIlllIIllIIIl = MathHelper.floor_double(this.explosionZ - llllllllllllIlIllIllIlllIIllIllI - 1.0);
        final int llllllllllllIlIllIllIlllIIllIIII = MathHelper.floor_double(this.explosionZ + llllllllllllIlIllIllIlllIIllIllI + 1.0);
        final List<Entity> llllllllllllIlIllIllIlllIIlIllll = this.worldObj.getEntitiesWithinAABBExcludingEntity(this.exploder, new AxisAlignedBB(llllllllllllIlIllIllIlllIIllIlIl, llllllllllllIlIllIllIlllIIllIIll, llllllllllllIlIllIllIlllIIllIIIl, llllllllllllIlIllIllIlllIIllIlII, llllllllllllIlIllIllIlllIIllIIlI, llllllllllllIlIllIllIlllIIllIIII));
        final Vec3 llllllllllllIlIllIllIlllIIlIlllI = new Vec3(this.explosionX, this.explosionY, this.explosionZ);
        int llllllllllllIlIllIllIlllIIlIllIl = Explosion.lllIlIlIIIlIlI[0];
        "".length();
        if (" ".length() <= ((0xA3 ^ 0xBB) & ~(0x1D ^ 0x5))) {
            return;
        }
        while (!lIlIIIlIlIllIlll(llllllllllllIlIllIllIlllIIlIllIl, llllllllllllIlIllIllIlllIIlIllll.size())) {
            final Entity llllllllllllIlIllIllIlllIIlIllII = llllllllllllIlIllIllIlllIIlIllll.get(llllllllllllIlIllIllIlllIIlIllIl);
            if (lIlIIIlIlIlllIII(llllllllllllIlIllIllIlllIIlIllII.isImmuneToExplosions() ? 1 : 0)) {
                final double llllllllllllIlIllIllIlllIIlIlIll = llllllllllllIlIllIllIlllIIlIllII.getDistance(this.explosionX, this.explosionY, this.explosionZ) / llllllllllllIlIllIllIlllIIllIllI;
                if (lIlIIIlIlIllIllI(lIlIIIlIlIlIlllI(llllllllllllIlIllIllIlllIIlIlIll, 1.0))) {
                    double llllllllllllIlIllIllIlllIIlIlIlI = llllllllllllIlIllIllIlllIIlIllII.posX - this.explosionX;
                    double llllllllllllIlIllIllIlllIIlIlIIl = llllllllllllIlIllIllIlllIIlIllII.posY + llllllllllllIlIllIllIlllIIlIllII.getEyeHeight() - this.explosionY;
                    double llllllllllllIlIllIllIlllIIlIlIII = llllllllllllIlIllIllIlllIIlIllII.posZ - this.explosionZ;
                    final double llllllllllllIlIllIllIlllIIlIIlll = MathHelper.sqrt_double(llllllllllllIlIllIllIlllIIlIlIlI * llllllllllllIlIllIllIlllIIlIlIlI + llllllllllllIlIllIllIlllIIlIlIIl * llllllllllllIlIllIllIlllIIlIlIIl + llllllllllllIlIllIllIlllIIlIlIII * llllllllllllIlIllIllIlllIIlIlIII);
                    if (lIlIIIlIlIllIIII(lIlIIIlIlIlIllll(llllllllllllIlIllIllIlllIIlIIlll, 0.0))) {
                        llllllllllllIlIllIllIlllIIlIlIlI /= llllllllllllIlIllIllIlllIIlIIlll;
                        llllllllllllIlIllIllIlllIIlIlIIl /= llllllllllllIlIllIllIlllIIlIIlll;
                        llllllllllllIlIllIllIlllIIlIlIII /= llllllllllllIlIllIllIlllIIlIIlll;
                        final double llllllllllllIlIllIllIlllIIlIIllI = this.worldObj.getBlockDensity(llllllllllllIlIllIllIlllIIlIlllI, llllllllllllIlIllIllIlllIIlIllII.getEntityBoundingBox());
                        final double llllllllllllIlIllIllIlllIIlIIlIl = (1.0 - llllllllllllIlIllIllIlllIIlIlIll) * llllllllllllIlIllIllIlllIIlIIllI;
                        llllllllllllIlIllIllIlllIIlIllII.attackEntityFrom(DamageSource.setExplosionSource(this), (float)(int)((llllllllllllIlIllIllIlllIIlIIlIl * llllllllllllIlIllIllIlllIIlIIlIl + llllllllllllIlIllIllIlllIIlIIlIl) / 2.0 * 8.0 * llllllllllllIlIllIllIlllIIllIllI + 1.0));
                        "".length();
                        final double llllllllllllIlIllIllIlllIIlIIlII = EnchantmentProtection.func_92092_a(llllllllllllIlIllIllIlllIIlIllII, llllllllllllIlIllIllIlllIIlIIlIl);
                        final Entity entity = llllllllllllIlIllIllIlllIIlIllII;
                        entity.motionX += llllllllllllIlIllIllIlllIIlIlIlI * llllllllllllIlIllIllIlllIIlIIlII;
                        final Entity entity2 = llllllllllllIlIllIllIlllIIlIllII;
                        entity2.motionY += llllllllllllIlIllIllIlllIIlIlIIl * llllllllllllIlIllIllIlllIIlIIlII;
                        final Entity entity3 = llllllllllllIlIllIllIlllIIlIllII;
                        entity3.motionZ += llllllllllllIlIllIllIlllIIlIlIII * llllllllllllIlIllIllIlllIIlIIlII;
                        if (lIlIIIlIlIllIIII((llllllllllllIlIllIllIlllIIlIllII instanceof EntityPlayer) ? 1 : 0) && lIlIIIlIlIlllIII(((EntityPlayer)llllllllllllIlIllIllIlllIIlIllII).capabilities.disableDamage ? 1 : 0)) {
                            this.playerKnockbackMap.put((EntityPlayer)llllllllllllIlIllIllIlllIIlIllII, new Vec3(llllllllllllIlIllIllIlllIIlIlIlI * llllllllllllIlIllIllIlllIIlIIlIl, llllllllllllIlIllIllIlllIIlIlIIl * llllllllllllIlIllIllIlllIIlIIlIl, llllllllllllIlIllIllIlllIIlIlIII * llllllllllllIlIllIllIlllIIlIIlIl));
                            "".length();
                        }
                    }
                }
            }
            ++llllllllllllIlIllIllIlllIIlIllIl;
        }
    }
    
    private static String lIlIIIlIlIlIlIlI(final String llllllllllllIlIllIllIllIllIIlllI, final String llllllllllllIlIllIllIllIllIIllIl) {
        try {
            final SecretKeySpec llllllllllllIlIllIllIllIllIlIIIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIlIllIllIllIllIIllIl.getBytes(StandardCharsets.UTF_8)), Explosion.lllIlIlIIIlIlI[5]), "DES");
            final Cipher llllllllllllIlIllIllIllIllIlIIII = Cipher.getInstance("DES");
            llllllllllllIlIllIllIllIllIlIIII.init(Explosion.lllIlIlIIIlIlI[6], llllllllllllIlIllIllIllIllIlIIIl);
            return new String(llllllllllllIlIllIllIllIllIlIIII.doFinal(Base64.getDecoder().decode(llllllllllllIlIllIllIllIllIIlllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIlIllIllIllIllIIllll) {
            llllllllllllIlIllIllIllIllIIllll.printStackTrace();
            return null;
        }
    }
    
    public Explosion(final World llllllllllllIlIllIllIlllIlllIlII, final Entity llllllllllllIlIllIllIlllIlllIIll, final double llllllllllllIlIllIllIlllIllIlIIl, final double llllllllllllIlIllIllIlllIlllIIIl, final double llllllllllllIlIllIllIlllIllIIlll, final float llllllllllllIlIllIllIlllIllIllll, final boolean llllllllllllIlIllIllIlllIllIIlIl, final boolean llllllllllllIlIllIllIlllIllIllIl) {
        this.explosionRNG = new Random();
        this.affectedBlockPositions = (List<BlockPos>)Lists.newArrayList();
        this.playerKnockbackMap = (Map<EntityPlayer, Vec3>)Maps.newHashMap();
        this.worldObj = llllllllllllIlIllIllIlllIlllIlII;
        this.exploder = llllllllllllIlIllIllIlllIlllIIll;
        this.explosionSize = llllllllllllIlIllIllIlllIllIllll;
        this.explosionX = llllllllllllIlIllIllIlllIllIlIIl;
        this.explosionY = llllllllllllIlIllIllIlllIlllIIIl;
        this.explosionZ = llllllllllllIlIllIllIlllIllIIlll;
        this.isFlaming = llllllllllllIlIllIllIlllIllIIlIl;
        this.isSmoking = llllllllllllIlIllIllIlllIllIllIl;
    }
    
    private static boolean lIlIIIlIlIllIlII(final Object llllllllllllIlIllIllIllIlIlllIll) {
        return llllllllllllIlIllIllIllIlIlllIll != null;
    }
    
    private static int lIlIIIlIlIlIlllI(final double n, final double n2) {
        return dcmpg(n, n2);
    }
    
    private static boolean lIlIIIlIlIllIllI(final int llllllllllllIlIllIllIllIlIlIllIl) {
        return llllllllllllIlIllIllIllIlIlIllIl <= 0;
    }
    
    private static boolean lIlIIIlIlIllIIll(final Object llllllllllllIlIllIllIllIlIlllllI, final Object llllllllllllIlIllIllIllIlIllllIl) {
        return llllllllllllIlIllIllIllIlIlllllI != llllllllllllIlIllIllIllIlIllllIl;
    }
    
    static {
        lIlIIIlIlIlIllII();
        lIlIIIlIlIlIlIll();
    }
    
    private static int lIlIIIlIlIlllIIl(final float n, final float n2) {
        return fcmpl(n, n2);
    }
    
    private static void lIlIIIlIlIlIlIll() {
        (lllIlIlIIIlIIl = new String[Explosion.lllIlIlIIIlIlI[1]])[Explosion.lllIlIlIIIlIlI[0]] = lIlIIIlIlIlIlIlI("MiRFMU2867lU4EyYz34bNg==", "XnaoQ");
    }
    
    private static boolean lIlIIIlIlIllIIIl(final int llllllllllllIlIllIllIllIlIlIlIII, final int llllllllllllIlIllIllIllIlIlIIlll) {
        return llllllllllllIlIllIllIllIlIlIlIII != llllllllllllIlIllIllIllIlIlIIlll;
    }
    
    public void doExplosionB(final boolean llllllllllllIlIllIllIllIlllllIlI) {
        this.worldObj.playSoundEffect(this.explosionX, this.explosionY, this.explosionZ, Explosion.lllIlIlIIIlIIl[Explosion.lllIlIlIIIlIlI[0]], 4.0f, (1.0f + (this.worldObj.rand.nextFloat() - this.worldObj.rand.nextFloat()) * 0.2f) * 0.7f);
        if (lIlIIIlIlIlllIlI(lIlIIIlIlIlllIIl(this.explosionSize, 2.0f)) && lIlIIIlIlIllIIII(this.isSmoking ? 1 : 0)) {
            this.worldObj.spawnParticle(EnumParticleTypes.EXPLOSION_HUGE, this.explosionX, this.explosionY, this.explosionZ, 1.0, 0.0, 0.0, new int[Explosion.lllIlIlIIIlIlI[0]]);
            "".length();
            if (" ".length() == 0) {
                return;
            }
        }
        else {
            this.worldObj.spawnParticle(EnumParticleTypes.EXPLOSION_LARGE, this.explosionX, this.explosionY, this.explosionZ, 1.0, 0.0, 0.0, new int[Explosion.lllIlIlIIIlIlI[0]]);
        }
        if (lIlIIIlIlIllIIII(this.isSmoking ? 1 : 0)) {
            final float llllllllllllIlIllIllIllIlllIlIll = (float)this.affectedBlockPositions.iterator();
            "".length();
            if (-"   ".length() > 0) {
                return;
            }
            while (!lIlIIIlIlIlllIII(((Iterator)llllllllllllIlIllIllIllIlllIlIll).hasNext() ? 1 : 0)) {
                final BlockPos llllllllllllIlIllIllIllIlllllIIl = ((Iterator<BlockPos>)llllllllllllIlIllIllIllIlllIlIll).next();
                final Block llllllllllllIlIllIllIllIlllllIII = this.worldObj.getBlockState(llllllllllllIlIllIllIllIlllllIIl).getBlock();
                if (lIlIIIlIlIllIIII(llllllllllllIlIllIllIllIlllllIlI ? 1 : 0)) {
                    final double llllllllllllIlIllIllIllIllllIlll = llllllllllllIlIllIllIllIlllllIIl.getX() + this.worldObj.rand.nextFloat();
                    final double llllllllllllIlIllIllIllIllllIllI = llllllllllllIlIllIllIllIlllllIIl.getY() + this.worldObj.rand.nextFloat();
                    final double llllllllllllIlIllIllIllIllllIlIl = llllllllllllIlIllIllIllIlllllIIl.getZ() + this.worldObj.rand.nextFloat();
                    double llllllllllllIlIllIllIllIllllIlII = llllllllllllIlIllIllIllIllllIlll - this.explosionX;
                    double llllllllllllIlIllIllIllIllllIIll = llllllllllllIlIllIllIllIllllIllI - this.explosionY;
                    double llllllllllllIlIllIllIllIllllIIlI = llllllllllllIlIllIllIllIllllIlIl - this.explosionZ;
                    final double llllllllllllIlIllIllIllIllllIIIl = MathHelper.sqrt_double(llllllllllllIlIllIllIllIllllIlII * llllllllllllIlIllIllIllIllllIlII + llllllllllllIlIllIllIllIllllIIll * llllllllllllIlIllIllIllIllllIIll + llllllllllllIlIllIllIllIllllIIlI * llllllllllllIlIllIllIllIllllIIlI);
                    llllllllllllIlIllIllIllIllllIlII /= llllllllllllIlIllIllIllIllllIIIl;
                    llllllllllllIlIllIllIllIllllIIll /= llllllllllllIlIllIllIllIllllIIIl;
                    llllllllllllIlIllIllIllIllllIIlI /= llllllllllllIlIllIllIllIllllIIIl;
                    double llllllllllllIlIllIllIllIllllIIII = 0.5 / (llllllllllllIlIllIllIllIllllIIIl / this.explosionSize + 0.1);
                    llllllllllllIlIllIllIllIllllIIII *= this.worldObj.rand.nextFloat() * this.worldObj.rand.nextFloat() + 0.3f;
                    llllllllllllIlIllIllIllIllllIlII *= llllllllllllIlIllIllIllIllllIIII;
                    llllllllllllIlIllIllIllIllllIIll *= llllllllllllIlIllIllIllIllllIIII;
                    llllllllllllIlIllIllIllIllllIIlI *= llllllllllllIlIllIllIllIllllIIII;
                    this.worldObj.spawnParticle(EnumParticleTypes.EXPLOSION_NORMAL, (llllllllllllIlIllIllIllIllllIlll + this.explosionX * 1.0) / 2.0, (llllllllllllIlIllIllIllIllllIllI + this.explosionY * 1.0) / 2.0, (llllllllllllIlIllIllIllIllllIlIl + this.explosionZ * 1.0) / 2.0, llllllllllllIlIllIllIllIllllIlII, llllllllllllIlIllIllIllIllllIIll, llllllllllllIlIllIllIllIllllIIlI, new int[Explosion.lllIlIlIIIlIlI[0]]);
                    this.worldObj.spawnParticle(EnumParticleTypes.SMOKE_NORMAL, llllllllllllIlIllIllIllIllllIlll, llllllllllllIlIllIllIllIllllIllI, llllllllllllIlIllIllIllIllllIlIl, llllllllllllIlIllIllIllIllllIlII, llllllllllllIlIllIllIllIllllIIll, llllllllllllIlIllIllIllIllllIIlI, new int[Explosion.lllIlIlIIIlIlI[0]]);
                }
                if (lIlIIIlIlIllIIll(llllllllllllIlIllIllIllIlllllIII.getMaterial(), Material.air)) {
                    if (lIlIIIlIlIllIIII(llllllllllllIlIllIllIllIlllllIII.canDropFromExplosion(this) ? 1 : 0)) {
                        llllllllllllIlIllIllIllIlllllIII.dropBlockAsItemWithChance(this.worldObj, llllllllllllIlIllIllIllIlllllIIl, this.worldObj.getBlockState(llllllllllllIlIllIllIllIlllllIIl), 1.0f / this.explosionSize, Explosion.lllIlIlIIIlIlI[0]);
                    }
                    this.worldObj.setBlockState(llllllllllllIlIllIllIllIlllllIIl, Blocks.air.getDefaultState(), Explosion.lllIlIlIIIlIlI[4]);
                    "".length();
                    llllllllllllIlIllIllIllIlllllIII.onBlockDestroyedByExplosion(this.worldObj, llllllllllllIlIllIllIllIlllllIIl, this);
                }
            }
        }
        if (lIlIIIlIlIllIIII(this.isFlaming ? 1 : 0)) {
            final float llllllllllllIlIllIllIllIlllIlIll = (float)this.affectedBlockPositions.iterator();
            "".length();
            if (-"   ".length() > 0) {
                return;
            }
            while (!lIlIIIlIlIlllIII(((Iterator)llllllllllllIlIllIllIllIlllIlIll).hasNext() ? 1 : 0)) {
                final BlockPos llllllllllllIlIllIllIllIlllIllll = ((Iterator<BlockPos>)llllllllllllIlIllIllIllIlllIlIll).next();
                if (lIlIIIlIlIlllIll(this.worldObj.getBlockState(llllllllllllIlIllIllIllIlllIllll).getBlock().getMaterial(), Material.air) && lIlIIIlIlIllIIII(this.worldObj.getBlockState(llllllllllllIlIllIllIllIlllIllll.down()).getBlock().isFullBlock() ? 1 : 0) && lIlIIIlIlIlllIII(this.explosionRNG.nextInt(Explosion.lllIlIlIIIlIlI[4]))) {
                    this.worldObj.setBlockState(llllllllllllIlIllIllIllIlllIllll, Blocks.fire.getDefaultState());
                    "".length();
                }
            }
        }
    }
    
    private static boolean lIlIIIlIlIllIlIl(final int llllllllllllIlIllIllIllIlIlIlIll) {
        return llllllllllllIlIllIllIllIlIlIlIll > 0;
    }
    
    private static boolean lIlIIIlIlIlllIll(final Object llllllllllllIlIllIllIllIlIlllIII, final Object llllllllllllIlIllIllIllIlIllIlll) {
        return llllllllllllIlIllIllIllIlIlllIII == llllllllllllIlIllIllIllIlIllIlll;
    }
    
    private static boolean lIlIIIlIlIllIIII(final int llllllllllllIlIllIllIllIlIllIIll) {
        return llllllllllllIlIllIllIllIlIllIIll != 0;
    }
    
    private static boolean lIlIIIlIlIlllIII(final int llllllllllllIlIllIllIllIlIllIIIl) {
        return llllllllllllIlIllIllIllIlIllIIIl == 0;
    }
    
    private static boolean lIlIIIlIlIllllII(final Object llllllllllllIlIllIllIllIlIllIlIl) {
        return llllllllllllIlIllIllIllIlIllIlIl == null;
    }
    
    public Explosion(final World llllllllllllIlIllIllIllllIIlIIIl, final Entity llllllllllllIlIllIllIllllIIlIIII, final double llllllllllllIlIllIllIllllIIIllll, final double llllllllllllIlIllIllIllllIIIlllI, final double llllllllllllIlIllIllIllllIIIIIll, final float llllllllllllIlIllIllIllllIIIllII, final boolean llllllllllllIlIllIllIllllIIIlIll, final boolean llllllllllllIlIllIllIllllIIIIIII, final List<BlockPos> llllllllllllIlIllIllIllllIIIlIIl) {
        this(llllllllllllIlIllIllIllllIIlIIIl, llllllllllllIlIllIllIllllIIlIIII, llllllllllllIlIllIllIllllIIIllll, llllllllllllIlIllIllIllllIIIlllI, llllllllllllIlIllIllIllllIIIIIll, llllllllllllIlIllIllIllllIIIllII, llllllllllllIlIllIllIllllIIIlIll, llllllllllllIlIllIllIllllIIIIIII);
        this.affectedBlockPositions.addAll(llllllllllllIlIllIllIllllIIIlIIl);
        "".length();
    }
    
    private static boolean lIlIIIlIlIlllIlI(final int llllllllllllIlIllIllIllIlIlIllll) {
        return llllllllllllIlIllIllIllIlIlIllll >= 0;
    }
    
    public List<BlockPos> getAffectedBlockPositions() {
        return this.affectedBlockPositions;
    }
    
    public Explosion(final World llllllllllllIlIllIllIllllIlIlIll, final Entity llllllllllllIlIllIllIllllIlIlIlI, final double llllllllllllIlIllIllIllllIlIlIIl, final double llllllllllllIlIllIllIllllIlIlIII, final double llllllllllllIlIllIllIllllIlIIlll, final float llllllllllllIlIllIllIllllIIllllI, final List<BlockPos> llllllllllllIlIllIllIllllIlIIlIl) {
        this(llllllllllllIlIllIllIllllIlIlIll, llllllllllllIlIllIllIllllIlIlIlI, llllllllllllIlIllIllIllllIlIlIIl, llllllllllllIlIllIllIllllIlIlIII, llllllllllllIlIllIllIllllIlIIlll, llllllllllllIlIllIllIllllIIllllI, (boolean)(Explosion.lllIlIlIIIlIlI[0] != 0), (boolean)(Explosion.lllIlIlIIIlIlI[1] != 0), llllllllllllIlIllIllIllllIlIIlIl);
    }
}
