// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.client.particle;

import java.util.Iterator;
import net.minecraft.block.Block;
import net.minecraft.util.EnumFacing;
import net.minecraft.crash.CrashReportCategory;
import net.minecraft.util.ReportedException;
import java.util.concurrent.Callable;
import net.minecraft.crash.CrashReport;
import net.minecraft.client.renderer.vertex.DefaultVertexFormats;
import net.minecraft.client.renderer.texture.TextureMap;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.ActiveRenderInfo;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import net.minecraft.client.renderer.WorldRenderer;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.util.MathHelper;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.entity.Entity;
import net.minecraft.world.IBlockAccess;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.BlockPos;
import com.google.common.collect.Maps;
import java.util.Collection;
import com.google.common.collect.Lists;
import java.util.List;
import net.minecraft.util.ResourceLocation;
import java.util.Map;
import net.minecraft.world.World;
import java.util.Random;
import net.minecraft.client.renderer.texture.TextureManager;

public class EffectRenderer
{
    private /* synthetic */ TextureManager renderer;
    private /* synthetic */ Random rand;
    protected /* synthetic */ World worldObj;
    private /* synthetic */ Map<Integer, IParticleFactory> particleTypes;
    private static final /* synthetic */ String[] lIIlIllIllIIII;
    private static final /* synthetic */ int[] lIIlIllIllIIIl;
    private static final /* synthetic */ ResourceLocation particleTextures;
    private /* synthetic */ List<EntityParticleEmitter> particleEmitters;
    private /* synthetic */ List<EntityFX>[][] fxLayers;
    
    private void updateEffectAlphaLayer(final List<EntityFX> lllllllllllllIIllIIIllIIllIIIIIl) {
        final List<EntityFX> lllllllllllllIIllIIIllIIllIIIIII = (List<EntityFX>)Lists.newArrayList();
        int lllllllllllllIIllIIIllIIlIllllll = EffectRenderer.lIIlIllIllIIIl[0];
        "".length();
        if (null != null) {
            return;
        }
        while (!llIlIIllIIIlIIl(lllllllllllllIIllIIIllIIlIllllll, lllllllllllllIIllIIIllIIllIIIIIl.size())) {
            final EntityFX lllllllllllllIIllIIIllIIlIlllllI = lllllllllllllIIllIIIllIIllIIIIIl.get(lllllllllllllIIllIIIllIIlIllllll);
            this.tickParticle(lllllllllllllIIllIIIllIIlIlllllI);
            if (llIlIIllIIIllII(lllllllllllllIIllIIIllIIlIlllllI.isDead ? 1 : 0)) {
                lllllllllllllIIllIIIllIIllIIIIII.add(lllllllllllllIIllIIIllIIlIlllllI);
                "".length();
            }
            ++lllllllllllllIIllIIIllIIlIllllll;
        }
        lllllllllllllIIllIIIllIIllIIIIIl.removeAll(lllllllllllllIIllIIIllIIllIIIIII);
        "".length();
    }
    
    private static boolean llIlIIllIIIlIIl(final int lllllllllllllIIllIIIlIlllIIllIlI, final int lllllllllllllIIllIIIlIlllIIllIIl) {
        return lllllllllllllIIllIIIlIlllIIllIlI >= lllllllllllllIIllIIIlIlllIIllIIl;
    }
    
    public EffectRenderer(final World lllllllllllllIIllIIIllIlIIlIIIlI, final TextureManager lllllllllllllIIllIIIllIlIIlIIllI) {
        this.fxLayers = (List<EntityFX>[][])new List[EffectRenderer.lIIlIllIllIIIl[1]][];
        this.particleEmitters = (List<EntityParticleEmitter>)Lists.newArrayList();
        this.rand = new Random();
        this.particleTypes = (Map<Integer, IParticleFactory>)Maps.newHashMap();
        this.worldObj = lllllllllllllIIllIIIllIlIIlIIIlI;
        this.renderer = lllllllllllllIIllIIIllIlIIlIIllI;
        int lllllllllllllIIllIIIllIlIIlIIlIl = EffectRenderer.lIIlIllIllIIIl[0];
        "".length();
        if (-(104 + 129 - 114 + 28 ^ 96 + 109 - 76 + 21) >= 0) {
            throw null;
        }
        while (!llIlIIllIIIlIIl(lllllllllllllIIllIIIllIlIIlIIlIl, EffectRenderer.lIIlIllIllIIIl[1])) {
            this.fxLayers[lllllllllllllIIllIIIllIlIIlIIlIl] = (List<EntityFX>[])new List[EffectRenderer.lIIlIllIllIIIl[2]];
            int lllllllllllllIIllIIIllIlIIlIIlII = EffectRenderer.lIIlIllIllIIIl[0];
            "".length();
            if (" ".length() > (17 + 110 + 13 + 7 ^ 128 + 31 - 124 + 116)) {
                throw null;
            }
            while (!llIlIIllIIIlIIl(lllllllllllllIIllIIIllIlIIlIIlII, EffectRenderer.lIIlIllIllIIIl[2])) {
                this.fxLayers[lllllllllllllIIllIIIllIlIIlIIlIl][lllllllllllllIIllIIIllIlIIlIIlII] = (List<EntityFX>)Lists.newArrayList();
                ++lllllllllllllIIllIIIllIlIIlIIlII;
            }
            ++lllllllllllllIIllIIIllIlIIlIIlIl;
        }
        this.registerVanillaParticles();
    }
    
    public void addBlockDestroyEffects(final BlockPos lllllllllllllIIllIIIllIIIIlIIIlI, IBlockState lllllllllllllIIllIIIllIIIIlIlIll) {
        if (llIlIIllIIIlllI(lllllllllllllIIllIIIllIIIIlIlIll.getBlock().getMaterial(), Material.air)) {
            lllllllllllllIIllIIIllIIIIlIlIll = lllllllllllllIIllIIIllIIIIlIlIll.getBlock().getActualState(lllllllllllllIIllIIIllIIIIlIlIll, this.worldObj, lllllllllllllIIllIIIllIIIIlIIIlI);
            final int lllllllllllllIIllIIIllIIIIlIlIlI = EffectRenderer.lIIlIllIllIIIl[1];
            int lllllllllllllIIllIIIllIIIIlIlIIl = EffectRenderer.lIIlIllIllIIIl[0];
            "".length();
            if (" ".length() < " ".length()) {
                return;
            }
            while (!llIlIIllIIIlIIl(lllllllllllllIIllIIIllIIIIlIlIIl, lllllllllllllIIllIIIllIIIIlIlIlI)) {
                int lllllllllllllIIllIIIllIIIIlIlIII = EffectRenderer.lIIlIllIllIIIl[0];
                "".length();
                if (" ".length() < -" ".length()) {
                    return;
                }
                while (!llIlIIllIIIlIIl(lllllllllllllIIllIIIllIIIIlIlIII, lllllllllllllIIllIIIllIIIIlIlIlI)) {
                    int lllllllllllllIIllIIIllIIIIlIIlll = EffectRenderer.lIIlIllIllIIIl[0];
                    "".length();
                    if (-"   ".length() > 0) {
                        return;
                    }
                    while (!llIlIIllIIIlIIl(lllllllllllllIIllIIIllIIIIlIIlll, lllllllllllllIIllIIIllIIIIlIlIlI)) {
                        final double lllllllllllllIIllIIIllIIIIlIIllI = lllllllllllllIIllIIIllIIIIlIIIlI.getX() + (lllllllllllllIIllIIIllIIIIlIlIIl + 0.5) / lllllllllllllIIllIIIllIIIIlIlIlI;
                        final double lllllllllllllIIllIIIllIIIIlIIlIl = lllllllllllllIIllIIIllIIIIlIIIlI.getY() + (lllllllllllllIIllIIIllIIIIlIlIII + 0.5) / lllllllllllllIIllIIIllIIIIlIlIlI;
                        final double lllllllllllllIIllIIIllIIIIlIIlII = lllllllllllllIIllIIIllIIIIlIIIlI.getZ() + (lllllllllllllIIllIIIllIIIIlIIlll + 0.5) / lllllllllllllIIllIIIllIIIIlIlIlI;
                        this.addEffect(new EntityDiggingFX(this.worldObj, lllllllllllllIIllIIIllIIIIlIIllI, lllllllllllllIIllIIIllIIIIlIIlIl, lllllllllllllIIllIIIllIIIIlIIlII, lllllllllllllIIllIIIllIIIIlIIllI - lllllllllllllIIllIIIllIIIIlIIIlI.getX() - 0.5, lllllllllllllIIllIIIllIIIIlIIlIl - lllllllllllllIIllIIIllIIIIlIIIlI.getY() - 0.5, lllllllllllllIIllIIIllIIIIlIIlII - lllllllllllllIIllIIIllIIIIlIIIlI.getZ() - 0.5, lllllllllllllIIllIIIllIIIIlIlIll).func_174846_a(lllllllllllllIIllIIIllIIIIlIIIlI));
                        ++lllllllllllllIIllIIIllIIIIlIIlll;
                    }
                    ++lllllllllllllIIllIIIllIIIIlIlIII;
                }
                ++lllllllllllllIIllIIIllIIIIlIlIIl;
            }
        }
    }
    
    private void updateEffectLayer(final int lllllllllllllIIllIIIllIIllIIllII) {
        int lllllllllllllIIllIIIllIIllIIlIll = EffectRenderer.lIIlIllIllIIIl[0];
        "".length();
        if (" ".length() < 0) {
            return;
        }
        while (!llIlIIllIIIlIIl(lllllllllllllIIllIIIllIIllIIlIll, EffectRenderer.lIIlIllIllIIIl[2])) {
            this.updateEffectAlphaLayer(this.fxLayers[lllllllllllllIIllIIIllIIllIIllII][lllllllllllllIIllIIIllIIllIIlIll]);
            ++lllllllllllllIIllIIIllIIllIIlIll;
        }
    }
    
    private static boolean llIlIIllIIIllII(final int lllllllllllllIIllIIIlIlllIIIlIIl) {
        return lllllllllllllIIllIIIlIlllIIIlIIl != 0;
    }
    
    public void moveToAlphaLayer(final EntityFX lllllllllllllIIllIIIlIllllllIIII) {
        this.moveToLayer(lllllllllllllIIllIIIlIllllllIIII, EffectRenderer.lIIlIllIllIIIl[3], EffectRenderer.lIIlIllIllIIIl[0]);
    }
    
    public void clearEffects(final World lllllllllllllIIllIIIllIIIIlllIlI) {
        this.worldObj = lllllllllllllIIllIIIllIIIIlllIlI;
        int lllllllllllllIIllIIIllIIIIllllIl = EffectRenderer.lIIlIllIllIIIl[0];
        "".length();
        if ("   ".length() <= ((0x4F ^ 0x47) & ~(0xBC ^ 0xB4))) {
            return;
        }
        while (!llIlIIllIIIlIIl(lllllllllllllIIllIIIllIIIIllllIl, EffectRenderer.lIIlIllIllIIIl[1])) {
            int lllllllllllllIIllIIIllIIIIllllII = EffectRenderer.lIIlIllIllIIIl[0];
            "".length();
            if (null != null) {
                return;
            }
            while (!llIlIIllIIIlIIl(lllllllllllllIIllIIIllIIIIllllII, EffectRenderer.lIIlIllIllIIIl[2])) {
                this.fxLayers[lllllllllllllIIllIIIllIIIIllllIl][lllllllllllllIIllIIIllIIIIllllII].clear();
                ++lllllllllllllIIllIIIllIIIIllllII;
            }
            ++lllllllllllllIIllIIIllIIIIllllIl;
        }
        this.particleEmitters.clear();
    }
    
    public void moveToNoAlphaLayer(final EntityFX lllllllllllllIIllIIIlIlllllIllII) {
        this.moveToLayer(lllllllllllllIIllIIIlIlllllIllII, EffectRenderer.lIIlIllIllIIIl[0], EffectRenderer.lIIlIllIllIIIl[3]);
    }
    
    private static boolean llIlIIllIIIlIlI(final Object lllllllllllllIIllIIIlIlllIIIllll) {
        return lllllllllllllIIllIIIlIlllIIIllll != null;
    }
    
    private static boolean llIlIIllIIlIIII(final Object lllllllllllllIIllIIIlIlllIIIllII, final Object lllllllllllllIIllIIIlIlllIIIlIll) {
        return lllllllllllllIIllIIIlIlllIIIllII == lllllllllllllIIllIIIlIlllIIIlIll;
    }
    
    private static boolean llIlIIllIIIlllI(final Object lllllllllllllIIllIIIlIlllIIlIIlI, final Object lllllllllllllIIllIIIlIlllIIlIIIl) {
        return lllllllllllllIIllIIIlIlllIIlIIlI != lllllllllllllIIllIIIlIlllIIlIIIl;
    }
    
    public void emitParticleAtEntity(final Entity lllllllllllllIIllIIIllIlIIIIlIll, final EnumParticleTypes lllllllllllllIIllIIIllIlIIIIlIlI) {
        this.particleEmitters.add(new EntityParticleEmitter(this.worldObj, lllllllllllllIIllIIIllIlIIIIlIll, lllllllllllllIIllIIIllIlIIIIlIlI));
        "".length();
    }
    
    private static int llIlIIllIIIlIll(final float n, final float n2) {
        return fcmpl(n, n2);
    }
    
    private void registerVanillaParticles() {
        this.registerParticle(EnumParticleTypes.EXPLOSION_NORMAL.getParticleID(), new EntityExplodeFX.Factory());
        this.registerParticle(EnumParticleTypes.WATER_BUBBLE.getParticleID(), new EntityBubbleFX.Factory());
        this.registerParticle(EnumParticleTypes.WATER_SPLASH.getParticleID(), new EntitySplashFX.Factory());
        this.registerParticle(EnumParticleTypes.WATER_WAKE.getParticleID(), new EntityFishWakeFX.Factory());
        this.registerParticle(EnumParticleTypes.WATER_DROP.getParticleID(), new EntityRainFX.Factory());
        this.registerParticle(EnumParticleTypes.SUSPENDED.getParticleID(), new EntitySuspendFX.Factory());
        this.registerParticle(EnumParticleTypes.SUSPENDED_DEPTH.getParticleID(), new EntityAuraFX.Factory());
        this.registerParticle(EnumParticleTypes.CRIT.getParticleID(), new EntityCrit2FX.Factory());
        this.registerParticle(EnumParticleTypes.CRIT_MAGIC.getParticleID(), new EntityCrit2FX.MagicFactory());
        this.registerParticle(EnumParticleTypes.SMOKE_NORMAL.getParticleID(), new EntitySmokeFX.Factory());
        this.registerParticle(EnumParticleTypes.SMOKE_LARGE.getParticleID(), new EntityCritFX.Factory());
        this.registerParticle(EnumParticleTypes.SPELL.getParticleID(), new EntitySpellParticleFX.Factory());
        this.registerParticle(EnumParticleTypes.SPELL_INSTANT.getParticleID(), new EntitySpellParticleFX.InstantFactory());
        this.registerParticle(EnumParticleTypes.SPELL_MOB.getParticleID(), new EntitySpellParticleFX.MobFactory());
        this.registerParticle(EnumParticleTypes.SPELL_MOB_AMBIENT.getParticleID(), new EntitySpellParticleFX.AmbientMobFactory());
        this.registerParticle(EnumParticleTypes.SPELL_WITCH.getParticleID(), new EntitySpellParticleFX.WitchFactory());
        this.registerParticle(EnumParticleTypes.DRIP_WATER.getParticleID(), new EntityDropParticleFX.WaterFactory());
        this.registerParticle(EnumParticleTypes.DRIP_LAVA.getParticleID(), new EntityDropParticleFX.LavaFactory());
        this.registerParticle(EnumParticleTypes.VILLAGER_ANGRY.getParticleID(), new EntityHeartFX.AngryVillagerFactory());
        this.registerParticle(EnumParticleTypes.VILLAGER_HAPPY.getParticleID(), new EntityAuraFX.HappyVillagerFactory());
        this.registerParticle(EnumParticleTypes.TOWN_AURA.getParticleID(), new EntityAuraFX.Factory());
        this.registerParticle(EnumParticleTypes.NOTE.getParticleID(), new EntityNoteFX.Factory());
        this.registerParticle(EnumParticleTypes.PORTAL.getParticleID(), new EntityPortalFX.Factory());
        this.registerParticle(EnumParticleTypes.ENCHANTMENT_TABLE.getParticleID(), new EntityEnchantmentTableParticleFX.EnchantmentTable());
        this.registerParticle(EnumParticleTypes.FLAME.getParticleID(), new EntityFlameFX.Factory());
        this.registerParticle(EnumParticleTypes.LAVA.getParticleID(), new EntityLavaFX.Factory());
        this.registerParticle(EnumParticleTypes.FOOTSTEP.getParticleID(), new EntityFootStepFX.Factory());
        this.registerParticle(EnumParticleTypes.CLOUD.getParticleID(), new EntityCloudFX.Factory());
        this.registerParticle(EnumParticleTypes.REDSTONE.getParticleID(), new EntityReddustFX.Factory());
        this.registerParticle(EnumParticleTypes.SNOWBALL.getParticleID(), new EntityBreakingFX.SnowballFactory());
        this.registerParticle(EnumParticleTypes.SNOW_SHOVEL.getParticleID(), new EntitySnowShovelFX.Factory());
        this.registerParticle(EnumParticleTypes.SLIME.getParticleID(), new EntityBreakingFX.SlimeFactory());
        this.registerParticle(EnumParticleTypes.HEART.getParticleID(), new EntityHeartFX.Factory());
        this.registerParticle(EnumParticleTypes.BARRIER.getParticleID(), new Barrier.Factory());
        this.registerParticle(EnumParticleTypes.ITEM_CRACK.getParticleID(), new EntityBreakingFX.Factory());
        this.registerParticle(EnumParticleTypes.BLOCK_CRACK.getParticleID(), new EntityDiggingFX.Factory());
        this.registerParticle(EnumParticleTypes.BLOCK_DUST.getParticleID(), new EntityBlockDustFX.Factory());
        this.registerParticle(EnumParticleTypes.EXPLOSION_HUGE.getParticleID(), new EntityHugeExplodeFX.Factory());
        this.registerParticle(EnumParticleTypes.EXPLOSION_LARGE.getParticleID(), new EntityLargeExplodeFX.Factory());
        this.registerParticle(EnumParticleTypes.FIREWORKS_SPARK.getParticleID(), new EntityFirework.Factory());
        this.registerParticle(EnumParticleTypes.MOB_APPEARANCE.getParticleID(), new MobAppearance.Factory());
    }
    
    public String getStatistics() {
        int lllllllllllllIIllIIIlIllllIlIlIl = EffectRenderer.lIIlIllIllIIIl[0];
        int lllllllllllllIIllIIIlIllllIlIlII = EffectRenderer.lIIlIllIllIIIl[0];
        "".length();
        if ((0x7F ^ 0x6F ^ (0x74 ^ 0x60)) <= -" ".length()) {
            return null;
        }
        while (!llIlIIllIIIlIIl(lllllllllllllIIllIIIlIllllIlIlII, EffectRenderer.lIIlIllIllIIIl[1])) {
            int lllllllllllllIIllIIIlIllllIlIIll = EffectRenderer.lIIlIllIllIIIl[0];
            "".length();
            if (-(0xBE ^ 0xBB) >= 0) {
                return null;
            }
            while (!llIlIIllIIIlIIl(lllllllllllllIIllIIIlIllllIlIIll, EffectRenderer.lIIlIllIllIIIl[2])) {
                lllllllllllllIIllIIIlIllllIlIlIl += this.fxLayers[lllllllllllllIIllIIIlIllllIlIlII][lllllllllllllIIllIIIlIllllIlIIll].size();
                ++lllllllllllllIIllIIIlIllllIlIIll;
            }
            ++lllllllllllllIIllIIIlIllllIlIlII;
        }
        return String.valueOf(new StringBuilder().append(lllllllllllllIIllIIIlIllllIlIlIl));
    }
    
    public void registerParticle(final int lllllllllllllIIllIIIllIlIIIlIlII, final IParticleFactory lllllllllllllIIllIIIllIlIIIlIIll) {
        this.particleTypes.put(lllllllllllllIIllIIIllIlIIIlIlII, lllllllllllllIIllIIIllIlIIIlIIll);
        "".length();
    }
    
    private static boolean llIlIIllIIIllIl(final int lllllllllllllIIllIIIlIlllIIIIlll) {
        return lllllllllllllIIllIIIlIlllIIIIlll == 0;
    }
    
    public EntityFX spawnEffectParticle(final int lllllllllllllIIllIIIllIIllllIIIl, final double lllllllllllllIIllIIIllIIllllllII, final double lllllllllllllIIllIIIllIIlllllIll, final double lllllllllllllIIllIIIllIIlllllIlI, final double lllllllllllllIIllIIIllIIlllIllIl, final double lllllllllllllIIllIIIllIIlllllIII, final double lllllllllllllIIllIIIllIIlllIlIll, final int... lllllllllllllIIllIIIllIIllllIllI) {
        final IParticleFactory lllllllllllllIIllIIIllIIllllIlIl = this.particleTypes.get(lllllllllllllIIllIIIllIIllllIIIl);
        if (llIlIIllIIIlIlI(lllllllllllllIIllIIIllIIllllIlIl)) {
            final EntityFX lllllllllllllIIllIIIllIIllllIlII = lllllllllllllIIllIIIllIIllllIlIl.getEntityFX(lllllllllllllIIllIIIllIIllllIIIl, this.worldObj, lllllllllllllIIllIIIllIIllllllII, lllllllllllllIIllIIIllIIlllllIll, lllllllllllllIIllIIIllIIlllllIlI, lllllllllllllIIllIIIllIIlllIllIl, lllllllllllllIIllIIIllIIlllllIII, lllllllllllllIIllIIIllIIlllIlIll, lllllllllllllIIllIIIllIIllllIllI);
            if (llIlIIllIIIlIlI(lllllllllllllIIllIIIllIIllllIlII)) {
                this.addEffect(lllllllllllllIIllIIIllIIllllIlII);
                return lllllllllllllIIllIIIllIIllllIlII;
            }
        }
        return null;
    }
    
    private void moveToLayer(final EntityFX lllllllllllllIIllIIIlIlllllIIIll, final int lllllllllllllIIllIIIlIllllIlllIl, final int lllllllllllllIIllIIIlIllllIlllII) {
        int lllllllllllllIIllIIIlIlllllIIIII = EffectRenderer.lIIlIllIllIIIl[0];
        "".length();
        if (-" ".length() > 0) {
            return;
        }
        while (!llIlIIllIIIlIIl(lllllllllllllIIllIIIlIlllllIIIII, EffectRenderer.lIIlIllIllIIIl[1])) {
            if (llIlIIllIIIllII(this.fxLayers[lllllllllllllIIllIIIlIlllllIIIII][lllllllllllllIIllIIIlIllllIlllIl].contains(lllllllllllllIIllIIIlIlllllIIIll) ? 1 : 0)) {
                this.fxLayers[lllllllllllllIIllIIIlIlllllIIIII][lllllllllllllIIllIIIlIllllIlllIl].remove(lllllllllllllIIllIIIlIlllllIIIll);
                "".length();
                this.fxLayers[lllllllllllllIIllIIIlIlllllIIIII][lllllllllllllIIllIIIlIllllIlllII].add(lllllllllllllIIllIIIlIlllllIIIll);
                "".length();
            }
            ++lllllllllllllIIllIIIlIlllllIIIII;
        }
    }
    
    private static boolean llIlIIllIIlIIIl(final int lllllllllllllIIllIIIlIlllIIlIllI, final int lllllllllllllIIllIIIlIlllIIlIlIl) {
        return lllllllllllllIIllIIIlIlllIIlIllI < lllllllllllllIIllIIIlIlllIIlIlIl;
    }
    
    static {
        llIlIIllIIIlIII();
        llIlIIllIIIIlll();
        particleTextures = new ResourceLocation(EffectRenderer.lIIlIllIllIIII[EffectRenderer.lIIlIllIllIIIl[0]]);
    }
    
    public void renderLitParticles(final Entity lllllllllllllIIllIIIllIIIlIlIIIl, final float lllllllllllllIIllIIIllIIIlIlIIII) {
        final float lllllllllllllIIllIIIllIIIlIllllI = 0.017453292f;
        final float lllllllllllllIIllIIIllIIIlIlllIl = MathHelper.cos(lllllllllllllIIllIIIllIIIlIlIIIl.rotationYaw * 0.017453292f);
        final float lllllllllllllIIllIIIllIIIlIlllII = MathHelper.sin(lllllllllllllIIllIIIllIIIlIlIIIl.rotationYaw * 0.017453292f);
        final float lllllllllllllIIllIIIllIIIlIllIll = -lllllllllllllIIllIIIllIIIlIlllII * MathHelper.sin(lllllllllllllIIllIIIllIIIlIlIIIl.rotationPitch * 0.017453292f);
        final float lllllllllllllIIllIIIllIIIlIllIlI = lllllllllllllIIllIIIllIIIlIlllIl * MathHelper.sin(lllllllllllllIIllIIIllIIIlIlIIIl.rotationPitch * 0.017453292f);
        final float lllllllllllllIIllIIIllIIIlIllIIl = MathHelper.cos(lllllllllllllIIllIIIllIIIlIlIIIl.rotationPitch * 0.017453292f);
        int lllllllllllllIIllIIIllIIIlIllIII = EffectRenderer.lIIlIllIllIIIl[0];
        "".length();
        if ((0x40 ^ 0x27 ^ (0x9 ^ 0x6A)) < 0) {
            return;
        }
        while (!llIlIIllIIIlIIl(lllllllllllllIIllIIIllIIIlIllIII, EffectRenderer.lIIlIllIllIIIl[2])) {
            final List<EntityFX> lllllllllllllIIllIIIllIIIlIlIlll = this.fxLayers[EffectRenderer.lIIlIllIllIIIl[5]][lllllllllllllIIllIIIllIIIlIllIII];
            if (llIlIIllIIIllIl(lllllllllllllIIllIIIllIIIlIlIlll.isEmpty() ? 1 : 0)) {
                final Tessellator lllllllllllllIIllIIIllIIIlIlIllI = Tessellator.getInstance();
                final WorldRenderer lllllllllllllIIllIIIllIIIlIlIlIl = lllllllllllllIIllIIIllIIIlIlIllI.getWorldRenderer();
                int lllllllllllllIIllIIIllIIIlIlIlII = EffectRenderer.lIIlIllIllIIIl[0];
                "".length();
                if ("   ".length() <= 0) {
                    return;
                }
                while (!llIlIIllIIIlIIl(lllllllllllllIIllIIIllIIIlIlIlII, lllllllllllllIIllIIIllIIIlIlIlll.size())) {
                    final EntityFX lllllllllllllIIllIIIllIIIlIlIIll = lllllllllllllIIllIIIllIIIlIlIlll.get(lllllllllllllIIllIIIllIIIlIlIlII);
                    lllllllllllllIIllIIIllIIIlIlIIll.renderParticle(lllllllllllllIIllIIIllIIIlIlIlIl, lllllllllllllIIllIIIllIIIlIlIIIl, lllllllllllllIIllIIIllIIIlIlIIII, lllllllllllllIIllIIIllIIIlIlllIl, lllllllllllllIIllIIIllIIIlIllIIl, lllllllllllllIIllIIIllIIIlIlllII, lllllllllllllIIllIIIllIIIlIllIll, lllllllllllllIIllIIIllIIIlIllIlI);
                    ++lllllllllllllIIllIIIllIIIlIlIlII;
                }
            }
            ++lllllllllllllIIllIIIllIIIlIllIII;
        }
    }
    
    private static String llIlIIllIIIIlII(final String lllllllllllllIIllIIIlIlllIlIllll, final String lllllllllllllIIllIIIlIlllIlIllII) {
        try {
            final SecretKeySpec lllllllllllllIIllIIIlIlllIllIIlI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIIllIIIlIlllIlIllII.getBytes(StandardCharsets.UTF_8)), EffectRenderer.lIIlIllIllIIIl[12]), "DES");
            final Cipher lllllllllllllIIllIIIlIlllIllIIIl = Cipher.getInstance("DES");
            lllllllllllllIIllIIIlIlllIllIIIl.init(EffectRenderer.lIIlIllIllIIIl[2], lllllllllllllIIllIIIlIlllIllIIlI);
            return new String(lllllllllllllIIllIIIlIlllIllIIIl.doFinal(Base64.getDecoder().decode(lllllllllllllIIllIIIlIlllIlIllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIllIIIlIlllIllIIII) {
            lllllllllllllIIllIIIlIlllIllIIII.printStackTrace();
            return null;
        }
    }
    
    private static boolean llIlIIllIIIllll(final int lllllllllllllIIllIIIlIlllIIIIlII, final int lllllllllllllIIllIIIlIlllIIIIIll) {
        return lllllllllllllIIllIIIlIlllIIIIlII != lllllllllllllIIllIIIlIlllIIIIIll;
    }
    
    private static void llIlIIllIIIIlll() {
        (lIIlIllIllIIII = new String[EffectRenderer.lIIlIllIllIIIl[14]])[EffectRenderer.lIIlIllIllIIIl[0]] = llIlIIllIIIIIll("DjESEzIIMRlINxsmHg4kFjFFFyYIIAMEKx8nRBcpHQ==", "zTjgG");
        EffectRenderer.lIIlIllIllIIII[EffectRenderer.lIIlIllIllIIIl[3]] = llIlIIllIIIIlII("cCc1CrSw8WqvMwIAhfjBxei2EE63sgea", "JfxzH");
        EffectRenderer.lIIlIllIllIIII[EffectRenderer.lIIlIllIllIIIl[2]] = llIlIIllIIIIlIl("FcuPn/gA396XMJup2kVWjBAF0uHmdBHJ", "eatSw");
        EffectRenderer.lIIlIllIllIIII[EffectRenderer.lIIlIllIllIIIl[5]] = llIlIIllIIIIlII("V/nd2kh0AkjoDYt0QZekVw==", "dDFob");
        EffectRenderer.lIIlIllIllIIII[EffectRenderer.lIIlIllIllIIIl[1]] = llIlIIllIIIIlIl("N46+04WKEkTfL10yg7Y1ew==", "LLCgK");
        EffectRenderer.lIIlIllIllIIII[EffectRenderer.lIIlIllIllIIIl[10]] = llIlIIllIIIIIll("BAAeNS0kDB42aAYEAiUhNQkV", "VepQH");
        EffectRenderer.lIIlIllIllIIII[EffectRenderer.lIIlIllIllIIIl[11]] = llIlIIllIIIIlII("qEIbawaFB8yRN86bA/t8KHGNFqoepGk/", "TiKeA");
        EffectRenderer.lIIlIllIllIIII[EffectRenderer.lIIlIllIllIIIl[9]] = llIlIIllIIIIIll("BxsHLQg0FhA=", "WzuYa");
        EffectRenderer.lIIlIllIllIIII[EffectRenderer.lIIlIllIllIIIl[12]] = llIlIIllIIIIlIl("c7b7xlo64Pkxd+PuMTtzag==", "VZEne");
    }
    
    private static String llIlIIllIIIIIll(String lllllllllllllIIllIIIlIlllIllllll, final String lllllllllllllIIllIIIlIlllIlllllI) {
        lllllllllllllIIllIIIlIlllIllllll = (long)new String(Base64.getDecoder().decode(((String)lllllllllllllIIllIIIlIlllIllllll).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIIllIIIlIllllIIIIlI = new StringBuilder();
        final char[] lllllllllllllIIllIIIlIllllIIIIIl = lllllllllllllIIllIIIlIlllIlllllI.toCharArray();
        int lllllllllllllIIllIIIlIllllIIIIII = EffectRenderer.lIIlIllIllIIIl[0];
        final char lllllllllllllIIllIIIlIlllIlllIlI = (Object)((String)lllllllllllllIIllIIIlIlllIllllll).toCharArray();
        final double lllllllllllllIIllIIIlIlllIlllIIl = lllllllllllllIIllIIIlIlllIlllIlI.length;
        char lllllllllllllIIllIIIlIlllIlllIII = (char)EffectRenderer.lIIlIllIllIIIl[0];
        while (llIlIIllIIlIIIl(lllllllllllllIIllIIIlIlllIlllIII, (int)lllllllllllllIIllIIIlIlllIlllIIl)) {
            final char lllllllllllllIIllIIIlIllllIIIlIl = lllllllllllllIIllIIIlIlllIlllIlI[lllllllllllllIIllIIIlIlllIlllIII];
            lllllllllllllIIllIIIlIllllIIIIlI.append((char)(lllllllllllllIIllIIIlIllllIIIlIl ^ lllllllllllllIIllIIIlIllllIIIIIl[lllllllllllllIIllIIIlIllllIIIIII % lllllllllllllIIllIIIlIllllIIIIIl.length]));
            "".length();
            ++lllllllllllllIIllIIIlIllllIIIIII;
            ++lllllllllllllIIllIIIlIlllIlllIII;
            "".length();
            if (-(0x9E ^ 0xAB ^ (0x9A ^ 0xAA)) >= 0) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIIllIIIlIllllIIIIlI);
    }
    
    public void renderParticles(final Entity lllllllllllllIIllIIIllIIlIIIIIIl, final float lllllllllllllIIllIIIllIIlIIlIIlI) {
        final float lllllllllllllIIllIIIllIIlIIlIIIl = ActiveRenderInfo.getRotationX();
        final float lllllllllllllIIllIIIllIIlIIlIIII = ActiveRenderInfo.getRotationZ();
        final float lllllllllllllIIllIIIllIIlIIIllll = ActiveRenderInfo.getRotationYZ();
        final float lllllllllllllIIllIIIllIIlIIIlllI = ActiveRenderInfo.getRotationXY();
        final float lllllllllllllIIllIIIllIIlIIIllIl = ActiveRenderInfo.getRotationXZ();
        EntityFX.interpPosX = lllllllllllllIIllIIIllIIlIIIIIIl.lastTickPosX + (lllllllllllllIIllIIIllIIlIIIIIIl.posX - lllllllllllllIIllIIIllIIlIIIIIIl.lastTickPosX) * lllllllllllllIIllIIIllIIlIIlIIlI;
        EntityFX.interpPosY = lllllllllllllIIllIIIllIIlIIIIIIl.lastTickPosY + (lllllllllllllIIllIIIllIIlIIIIIIl.posY - lllllllllllllIIllIIIllIIlIIIIIIl.lastTickPosY) * lllllllllllllIIllIIIllIIlIIlIIlI;
        EntityFX.interpPosZ = lllllllllllllIIllIIIllIIlIIIIIIl.lastTickPosZ + (lllllllllllllIIllIIIllIIlIIIIIIl.posZ - lllllllllllllIIllIIIllIIlIIIIIIl.lastTickPosZ) * lllllllllllllIIllIIIllIIlIIlIIlI;
        GlStateManager.enableBlend();
        GlStateManager.blendFunc(EffectRenderer.lIIlIllIllIIIl[6], EffectRenderer.lIIlIllIllIIIl[7]);
        GlStateManager.alphaFunc(EffectRenderer.lIIlIllIllIIIl[8], 0.003921569f);
        int lllllllllllllIIllIIIllIIlIIIllII = EffectRenderer.lIIlIllIllIIIl[0];
        "".length();
        if (" ".length() > "  ".length()) {
            return;
        }
        while (!llIlIIllIIIlIIl(lllllllllllllIIllIIIllIIlIIIllII, EffectRenderer.lIIlIllIllIIIl[5])) {
            int lllllllllllllIIllIIIllIIlIIIlIll = EffectRenderer.lIIlIllIllIIIl[0];
            "".length();
            if ("  ".length() > "  ".length()) {
                return;
            }
            while (!llIlIIllIIIlIIl(lllllllllllllIIllIIIllIIlIIIlIll, EffectRenderer.lIIlIllIllIIIl[2])) {
                final int lllllllllllllIIllIIIllIIlIIIlIlI = lllllllllllllIIllIIIllIIlIIIllII;
                if (llIlIIllIIIllIl(this.fxLayers[lllllllllllllIIllIIIllIIlIIIllII][lllllllllllllIIllIIIllIIlIIIlIll].isEmpty() ? 1 : 0)) {
                    switch (lllllllllllllIIllIIIllIIlIIIlIll) {
                        case 0: {
                            GlStateManager.depthMask((boolean)(EffectRenderer.lIIlIllIllIIIl[0] != 0));
                            "".length();
                            if ("   ".length() < 0) {
                                return;
                            }
                            break;
                        }
                        case 1: {
                            GlStateManager.depthMask((boolean)(EffectRenderer.lIIlIllIllIIIl[3] != 0));
                            break;
                        }
                    }
                    switch (lllllllllllllIIllIIIllIIlIIIllII) {
                        default: {
                            this.renderer.bindTexture(EffectRenderer.particleTextures);
                            "".length();
                            if (((0x91 ^ 0x94) & ~(0x70 ^ 0x75)) != 0x0) {
                                return;
                            }
                            break;
                        }
                        case 1: {
                            this.renderer.bindTexture(TextureMap.locationBlocksTexture);
                            break;
                        }
                    }
                    GlStateManager.color(1.0f, 1.0f, 1.0f, 1.0f);
                    final Tessellator lllllllllllllIIllIIIllIIlIIIlIIl = Tessellator.getInstance();
                    final WorldRenderer lllllllllllllIIllIIIllIIlIIIlIII = lllllllllllllIIllIIIllIIlIIIlIIl.getWorldRenderer();
                    lllllllllllllIIllIIIllIIlIIIlIII.begin(EffectRenderer.lIIlIllIllIIIl[9], DefaultVertexFormats.PARTICLE_POSITION_TEX_COLOR_LMAP);
                    int lllllllllllllIIllIIIllIIlIIIIlll = EffectRenderer.lIIlIllIllIIIl[0];
                    "".length();
                    if (-(0xDA ^ 0xAB ^ (0x8 ^ 0x7C)) >= 0) {
                        return;
                    }
                    while (!llIlIIllIIIlIIl(lllllllllllllIIllIIIllIIlIIIIlll, this.fxLayers[lllllllllllllIIllIIIllIIlIIIllII][lllllllllllllIIllIIIllIIlIIIlIll].size())) {
                        final EntityFX lllllllllllllIIllIIIllIIlIIIIllI = this.fxLayers[lllllllllllllIIllIIIllIIlIIIllII][lllllllllllllIIllIIIllIIlIIIlIll].get(lllllllllllllIIllIIIllIIlIIIIlll);
                        try {
                            lllllllllllllIIllIIIllIIlIIIIllI.renderParticle(lllllllllllllIIllIIIllIIlIIIlIII, lllllllllllllIIllIIIllIIlIIIIIIl, lllllllllllllIIllIIIllIIlIIlIIlI, lllllllllllllIIllIIIllIIlIIlIIIl, lllllllllllllIIllIIIllIIlIIIllIl, lllllllllllllIIllIIIllIIlIIlIIII, lllllllllllllIIllIIIllIIlIIIllll, lllllllllllllIIllIIIllIIlIIIlllI);
                            "".length();
                            if (((0x28 ^ 0x11) & ~(0xFB ^ 0xC2)) != 0x0) {
                                return;
                            }
                        }
                        catch (Throwable lllllllllllllIIllIIIllIIlIIIIlIl) {
                            final CrashReport lllllllllllllIIllIIIllIIlIIIIlII = CrashReport.makeCrashReport(lllllllllllllIIllIIIllIIlIIIIlIl, EffectRenderer.lIIlIllIllIIII[EffectRenderer.lIIlIllIllIIIl[10]]);
                            final CrashReportCategory lllllllllllllIIllIIIllIIlIIIIIll = lllllllllllllIIllIIIllIIlIIIIlII.makeCategory(EffectRenderer.lIIlIllIllIIII[EffectRenderer.lIIlIllIllIIIl[11]]);
                            lllllllllllllIIllIIIllIIlIIIIIll.addCrashSectionCallable(EffectRenderer.lIIlIllIllIIII[EffectRenderer.lIIlIllIllIIIl[9]], new Callable<String>() {
                                @Override
                                public String call() throws Exception {
                                    return lllllllllllllIIllIIIllIIlIIIIllI.toString();
                                }
                            });
                            lllllllllllllIIllIIIllIIlIIIIIll.addCrashSectionCallable(EffectRenderer.lIIlIllIllIIII[EffectRenderer.lIIlIllIllIIIl[12]], new Callable<String>() {
                                private static final /* synthetic */ int[] lIlIIIIIlIIlII;
                                private static final /* synthetic */ String[] lIlIIIIIlIIIII;
                                
                                private static String lllIIIIIIllIlII(final String lllllllllllllIIlIIIlIIIIlIIllllI, final String lllllllllllllIIlIIIlIIIIlIIlllIl) {
                                    try {
                                        final SecretKeySpec lllllllllllllIIlIIIlIIIIlIlIIIIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIIlIIIlIIIIlIIlllIl.getBytes(StandardCharsets.UTF_8)), EffectRenderer$4.lIlIIIIIlIIlII[5]), "DES");
                                        final Cipher lllllllllllllIIlIIIlIIIIlIlIIIII = Cipher.getInstance("DES");
                                        lllllllllllllIIlIIIlIIIIlIlIIIII.init(EffectRenderer$4.lIlIIIIIlIIlII[3], lllllllllllllIIlIIIlIIIIlIlIIIIl);
                                        return new String(lllllllllllllIIlIIIlIIIIlIlIIIII.doFinal(Base64.getDecoder().decode(lllllllllllllIIlIIIlIIIIlIIllllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
                                    }
                                    catch (Exception lllllllllllllIIlIIIlIIIIlIIlllll) {
                                        lllllllllllllIIlIIIlIIIIlIIlllll.printStackTrace();
                                        return null;
                                    }
                                }
                                
                                private static void lllIIIIIIllIlIl() {
                                    (lIlIIIIIlIIIII = new String[EffectRenderer$4.lIlIIIIIlIIlII[4]])[EffectRenderer$4.lIlIIIIIlIIlII[0]] = lllIIIIIIllIIlI("PB8ZCS8lExIeJSMT", "qVJJp");
                                    EffectRenderer$4.lIlIIIIIlIIIII[EffectRenderer$4.lIlIIIIIlIIlII[1]] = lllIIIIIIllIIlI("AyEnChgeKioMHA8wIAoc", "WduXY");
                                    EffectRenderer$4.lIlIIIIIlIIIII[EffectRenderer$4.lIlIIIIIlIIlII[3]] = lllIIIIIIllIIll("vQf+JjuSf1lndrfRSPviICNtfroTsnQA", "hqSHL");
                                    EffectRenderer$4.lIlIIIIIlIIIII[EffectRenderer$4.lIlIIIIIlIIlII[2]] = lllIIIIIIllIlII("nzKpSnVt0pvzR0sEj3kp5A==", "igBmu");
                                }
                                
                                private static String lllIIIIIIllIIlI(String lllllllllllllIIlIIIlIIIIlIIIlIIl, final String lllllllllllllIIlIIIlIIIIlIIIlIII) {
                                    lllllllllllllIIlIIIlIIIIlIIIlIIl = new String(Base64.getDecoder().decode(lllllllllllllIIlIIIlIIIIlIIIlIIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
                                    final StringBuilder lllllllllllllIIlIIIlIIIIlIIIllII = new StringBuilder();
                                    final char[] lllllllllllllIIlIIIlIIIIlIIIlIll = lllllllllllllIIlIIIlIIIIlIIIlIII.toCharArray();
                                    int lllllllllllllIIlIIIlIIIIlIIIlIlI = EffectRenderer$4.lIlIIIIIlIIlII[0];
                                    final double lllllllllllllIIlIIIlIIIIlIIIIlII = (Object)lllllllllllllIIlIIIlIIIIlIIIlIIl.toCharArray();
                                    final double lllllllllllllIIlIIIlIIIIlIIIIIll = lllllllllllllIIlIIIlIIIIlIIIIlII.length;
                                    char lllllllllllllIIlIIIlIIIIlIIIIIlI = (char)EffectRenderer$4.lIlIIIIIlIIlII[0];
                                    while (lllIIIIIIllllll(lllllllllllllIIlIIIlIIIIlIIIIIlI, (int)lllllllllllllIIlIIIlIIIIlIIIIIll)) {
                                        final char lllllllllllllIIlIIIlIIIIlIIIllll = lllllllllllllIIlIIIlIIIIlIIIIlII[lllllllllllllIIlIIIlIIIIlIIIIIlI];
                                        lllllllllllllIIlIIIlIIIIlIIIllII.append((char)(lllllllllllllIIlIIIlIIIIlIIIllll ^ lllllllllllllIIlIIIlIIIIlIIIlIll[lllllllllllllIIlIIIlIIIIlIIIlIlI % lllllllllllllIIlIIIlIIIIlIIIlIll.length]));
                                        "".length();
                                        ++lllllllllllllIIlIIIlIIIIlIIIlIlI;
                                        ++lllllllllllllIIlIIIlIIIIlIIIIIlI;
                                        "".length();
                                        if (-(0xC6 ^ 0xC3) >= 0) {
                                            return null;
                                        }
                                    }
                                    return String.valueOf(lllllllllllllIIlIIIlIIIIlIIIllII);
                                }
                                
                                private static String lllIIIIIIllIIll(final String lllllllllllllIIlIIIlIIIIlIlIlIIl, final String lllllllllllllIIlIIIlIIIIlIlIlIlI) {
                                    try {
                                        final SecretKeySpec lllllllllllllIIlIIIlIIIIlIlIlllI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIIlIIIlIIIIlIlIlIlI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
                                        final Cipher lllllllllllllIIlIIIlIIIIlIlIllIl = Cipher.getInstance("Blowfish");
                                        lllllllllllllIIlIIIlIIIIlIlIllIl.init(EffectRenderer$4.lIlIIIIIlIIlII[3], lllllllllllllIIlIIIlIIIIlIlIlllI);
                                        return new String(lllllllllllllIIlIIIlIIIIlIlIllIl.doFinal(Base64.getDecoder().decode(lllllllllllllIIlIIIlIIIIlIlIlIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
                                    }
                                    catch (Exception lllllllllllllIIlIIIlIIIIlIlIllII) {
                                        lllllllllllllIIlIIIlIIIIlIlIllII.printStackTrace();
                                        return null;
                                    }
                                }
                                
                                private static boolean lllIIIIIIllllIl(final int lllllllllllllIIlIIIlIIIIIlllIlll) {
                                    return lllllllllllllIIlIIIlIIIIIlllIlll == 0;
                                }
                                
                                @Override
                                public String call() throws Exception {
                                    String value;
                                    if (lllIIIIIIllllIl(lllllllllllllIIllIIIllIIlIIIlIlI)) {
                                        value = EffectRenderer$4.lIlIIIIIlIIIII[EffectRenderer$4.lIlIIIIIlIIlII[0]];
                                        "".length();
                                        if ("   ".length() != "   ".length()) {
                                            return null;
                                        }
                                    }
                                    else if (lllIIIIIIlllllI(lllllllllllllIIllIIIllIIlIIIlIlI, EffectRenderer$4.lIlIIIIIlIIlII[1])) {
                                        value = EffectRenderer$4.lIlIIIIIlIIIII[EffectRenderer$4.lIlIIIIIlIIlII[1]];
                                        "".length();
                                        if (null != null) {
                                            return null;
                                        }
                                    }
                                    else if (lllIIIIIIlllllI(lllllllllllllIIllIIIllIIlIIIlIlI, EffectRenderer$4.lIlIIIIIlIIlII[2])) {
                                        value = EffectRenderer$4.lIlIIIIIlIIIII[EffectRenderer$4.lIlIIIIIlIIlII[3]];
                                        "".length();
                                        if (null != null) {
                                            return null;
                                        }
                                    }
                                    else {
                                        value = String.valueOf(new StringBuilder(EffectRenderer$4.lIlIIIIIlIIIII[EffectRenderer$4.lIlIIIIIlIIlII[2]]).append(lllllllllllllIIllIIIllIIlIIIlIlI));
                                    }
                                    return value;
                                }
                                
                                static {
                                    lllIIIIIIllllII();
                                    lllIIIIIIllIlIl();
                                }
                                
                                private static void lllIIIIIIllllII() {
                                    (lIlIIIIIlIIlII = new int[6])[0] = ((176 + 85 - 207 + 161 ^ 51 + 32 - 60 + 111) & (0x52 ^ 0x4B ^ (0x20 ^ 0x68) ^ -" ".length()));
                                    EffectRenderer$4.lIlIIIIIlIIlII[1] = " ".length();
                                    EffectRenderer$4.lIlIIIIIlIIlII[2] = "   ".length();
                                    EffectRenderer$4.lIlIIIIIlIIlII[3] = "  ".length();
                                    EffectRenderer$4.lIlIIIIIlIIlII[4] = (0xB5 ^ 0xB1);
                                    EffectRenderer$4.lIlIIIIIlIIlII[5] = (0x33 ^ 0x3B);
                                }
                                
                                private static boolean lllIIIIIIlllllI(final int lllllllllllllIIlIIIlIIIIIllllllI, final int lllllllllllllIIlIIIlIIIIIlllllIl) {
                                    return lllllllllllllIIlIIIlIIIIIllllllI == lllllllllllllIIlIIIlIIIIIlllllIl;
                                }
                                
                                private static boolean lllIIIIIIllllll(final int lllllllllllllIIlIIIlIIIIIllllIlI, final int lllllllllllllIIlIIIlIIIIIllllIIl) {
                                    return lllllllllllllIIlIIIlIIIIIllllIlI < lllllllllllllIIlIIIlIIIIIllllIIl;
                                }
                            });
                            throw new ReportedException(lllllllllllllIIllIIIllIIlIIIIlII);
                        }
                        ++lllllllllllllIIllIIIllIIlIIIIlll;
                    }
                    lllllllllllllIIllIIIllIIlIIIlIIl.draw();
                }
                ++lllllllllllllIIllIIIllIIlIIIlIll;
            }
            ++lllllllllllllIIllIIIllIIlIIIllII;
        }
        GlStateManager.depthMask((boolean)(EffectRenderer.lIIlIllIllIIIl[3] != 0));
        GlStateManager.disableBlend();
        GlStateManager.alphaFunc(EffectRenderer.lIIlIllIllIIIl[8], 0.1f);
    }
    
    public void addBlockHitEffects(final BlockPos lllllllllllllIIllIIIllIIIIIIllII, final EnumFacing lllllllllllllIIllIIIlIllllllllll) {
        final IBlockState lllllllllllllIIllIIIllIIIIIIlIlI = this.worldObj.getBlockState(lllllllllllllIIllIIIllIIIIIIllII);
        final Block lllllllllllllIIllIIIllIIIIIIlIIl = lllllllllllllIIllIIIllIIIIIIlIlI.getBlock();
        if (llIlIIllIIIllll(lllllllllllllIIllIIIllIIIIIIlIIl.getRenderType(), EffectRenderer.lIIlIllIllIIIl[13])) {
            final int lllllllllllllIIllIIIllIIIIIIlIII = lllllllllllllIIllIIIllIIIIIIllII.getX();
            final int lllllllllllllIIllIIIllIIIIIIIlll = lllllllllllllIIllIIIllIIIIIIllII.getY();
            final int lllllllllllllIIllIIIllIIIIIIIllI = lllllllllllllIIllIIIllIIIIIIllII.getZ();
            final float lllllllllllllIIllIIIllIIIIIIIlIl = 0.1f;
            double lllllllllllllIIllIIIllIIIIIIIlII = lllllllllllllIIllIIIllIIIIIIlIII + this.rand.nextDouble() * (lllllllllllllIIllIIIllIIIIIIlIIl.getBlockBoundsMaxX() - lllllllllllllIIllIIIllIIIIIIlIIl.getBlockBoundsMinX() - lllllllllllllIIllIIIllIIIIIIIlIl * 2.0f) + lllllllllllllIIllIIIllIIIIIIIlIl + lllllllllllllIIllIIIllIIIIIIlIIl.getBlockBoundsMinX();
            double lllllllllllllIIllIIIllIIIIIIIIll = lllllllllllllIIllIIIllIIIIIIIlll + this.rand.nextDouble() * (lllllllllllllIIllIIIllIIIIIIlIIl.getBlockBoundsMaxY() - lllllllllllllIIllIIIllIIIIIIlIIl.getBlockBoundsMinY() - lllllllllllllIIllIIIllIIIIIIIlIl * 2.0f) + lllllllllllllIIllIIIllIIIIIIIlIl + lllllllllllllIIllIIIllIIIIIIlIIl.getBlockBoundsMinY();
            double lllllllllllllIIllIIIllIIIIIIIIlI = lllllllllllllIIllIIIllIIIIIIIllI + this.rand.nextDouble() * (lllllllllllllIIllIIIllIIIIIIlIIl.getBlockBoundsMaxZ() - lllllllllllllIIllIIIllIIIIIIlIIl.getBlockBoundsMinZ() - lllllllllllllIIllIIIllIIIIIIIlIl * 2.0f) + lllllllllllllIIllIIIllIIIIIIIlIl + lllllllllllllIIllIIIllIIIIIIlIIl.getBlockBoundsMinZ();
            if (llIlIIllIIlIIII(lllllllllllllIIllIIIlIllllllllll, EnumFacing.DOWN)) {
                lllllllllllllIIllIIIllIIIIIIIIll = lllllllllllllIIllIIIllIIIIIIIlll + lllllllllllllIIllIIIllIIIIIIlIIl.getBlockBoundsMinY() - lllllllllllllIIllIIIllIIIIIIIlIl;
            }
            if (llIlIIllIIlIIII(lllllllllllllIIllIIIlIllllllllll, EnumFacing.UP)) {
                lllllllllllllIIllIIIllIIIIIIIIll = lllllllllllllIIllIIIllIIIIIIIlll + lllllllllllllIIllIIIllIIIIIIlIIl.getBlockBoundsMaxY() + lllllllllllllIIllIIIllIIIIIIIlIl;
            }
            if (llIlIIllIIlIIII(lllllllllllllIIllIIIlIllllllllll, EnumFacing.NORTH)) {
                lllllllllllllIIllIIIllIIIIIIIIlI = lllllllllllllIIllIIIllIIIIIIIllI + lllllllllllllIIllIIIllIIIIIIlIIl.getBlockBoundsMinZ() - lllllllllllllIIllIIIllIIIIIIIlIl;
            }
            if (llIlIIllIIlIIII(lllllllllllllIIllIIIlIllllllllll, EnumFacing.SOUTH)) {
                lllllllllllllIIllIIIllIIIIIIIIlI = lllllllllllllIIllIIIllIIIIIIIllI + lllllllllllllIIllIIIllIIIIIIlIIl.getBlockBoundsMaxZ() + lllllllllllllIIllIIIllIIIIIIIlIl;
            }
            if (llIlIIllIIlIIII(lllllllllllllIIllIIIlIllllllllll, EnumFacing.WEST)) {
                lllllllllllllIIllIIIllIIIIIIIlII = lllllllllllllIIllIIIllIIIIIIlIII + lllllllllllllIIllIIIllIIIIIIlIIl.getBlockBoundsMinX() - lllllllllllllIIllIIIllIIIIIIIlIl;
            }
            if (llIlIIllIIlIIII(lllllllllllllIIllIIIlIllllllllll, EnumFacing.EAST)) {
                lllllllllllllIIllIIIllIIIIIIIlII = lllllllllllllIIllIIIllIIIIIIlIII + lllllllllllllIIllIIIllIIIIIIlIIl.getBlockBoundsMaxX() + lllllllllllllIIllIIIllIIIIIIIlIl;
            }
            this.addEffect(new EntityDiggingFX(this.worldObj, lllllllllllllIIllIIIllIIIIIIIlII, lllllllllllllIIllIIIllIIIIIIIIll, lllllllllllllIIllIIIllIIIIIIIIlI, 0.0, 0.0, 0.0, lllllllllllllIIllIIIllIIIIIIlIlI).func_174846_a(lllllllllllllIIllIIIllIIIIIIllII).multiplyVelocity(0.2f).multipleParticleScaleBy(0.6f));
        }
    }
    
    public void addEffect(final EntityFX lllllllllllllIIllIIIllIIllIlllll) {
        final int lllllllllllllIIllIIIllIIlllIIIlI = lllllllllllllIIllIIIllIIllIlllll.getFXLayer();
        int n;
        if (llIlIIllIIIllII(llIlIIllIIIlIll(lllllllllllllIIllIIIllIIllIlllll.getAlpha(), 1.0f))) {
            n = EffectRenderer.lIIlIllIllIIIl[0];
            "".length();
            if ((0x96 ^ 0x92) <= "   ".length()) {
                return;
            }
        }
        else {
            n = EffectRenderer.lIIlIllIllIIIl[3];
        }
        final int lllllllllllllIIllIIIllIIlllIIIIl = n;
        if (llIlIIllIIIlIIl(this.fxLayers[lllllllllllllIIllIIIllIIlllIIIlI][lllllllllllllIIllIIIllIIlllIIIIl].size(), EffectRenderer.lIIlIllIllIIIl[4])) {
            this.fxLayers[lllllllllllllIIllIIIllIIlllIIIlI][lllllllllllllIIllIIIllIIlllIIIIl].remove(EffectRenderer.lIIlIllIllIIIl[0]);
            "".length();
        }
        this.fxLayers[lllllllllllllIIllIIIllIIlllIIIlI][lllllllllllllIIllIIIllIIlllIIIIl].add(lllllllllllllIIllIIIllIIllIlllll);
        "".length();
    }
    
    public void updateEffects() {
        int lllllllllllllIIllIIIllIIllIlIlll = EffectRenderer.lIIlIllIllIIIl[0];
        "".length();
        if ("   ".length() < -" ".length()) {
            return;
        }
        while (!llIlIIllIIIlIIl(lllllllllllllIIllIIIllIIllIlIlll, EffectRenderer.lIIlIllIllIIIl[1])) {
            this.updateEffectLayer(lllllllllllllIIllIIIllIIllIlIlll);
            ++lllllllllllllIIllIIIllIIllIlIlll;
        }
        final List<EntityParticleEmitter> lllllllllllllIIllIIIllIIllIlIllI = (List<EntityParticleEmitter>)Lists.newArrayList();
        final double lllllllllllllIIllIIIllIIllIlIIIl = (double)this.particleEmitters.iterator();
        "".length();
        if (" ".length() <= ((73 + 87 - 138 + 119 ^ 87 + 118 - 110 + 65) & (0xF1 ^ 0xAD ^ (0x38 ^ 0x49) ^ -" ".length()))) {
            return;
        }
        while (!llIlIIllIIIllIl(((Iterator)lllllllllllllIIllIIIllIIllIlIIIl).hasNext() ? 1 : 0)) {
            final EntityParticleEmitter lllllllllllllIIllIIIllIIllIlIlIl = ((Iterator<EntityParticleEmitter>)lllllllllllllIIllIIIllIIllIlIIIl).next();
            lllllllllllllIIllIIIllIIllIlIlIl.onUpdate();
            if (llIlIIllIIIllII(lllllllllllllIIllIIIllIIllIlIlIl.isDead ? 1 : 0)) {
                lllllllllllllIIllIIIllIIllIlIllI.add(lllllllllllllIIllIIIllIIllIlIlIl);
                "".length();
            }
        }
        this.particleEmitters.removeAll(lllllllllllllIIllIIIllIIllIlIllI);
        "".length();
    }
    
    private void tickParticle(final EntityFX lllllllllllllIIllIIIllIIlIllIIIl) {
        try {
            lllllllllllllIIllIIIllIIlIllIIIl.onUpdate();
            "".length();
            if (-" ".length() >= " ".length()) {
                return;
            }
        }
        catch (Throwable lllllllllllllIIllIIIllIIlIllIIII) {
            final CrashReport lllllllllllllIIllIIIllIIlIlIllll = CrashReport.makeCrashReport(lllllllllllllIIllIIIllIIlIllIIII, EffectRenderer.lIIlIllIllIIII[EffectRenderer.lIIlIllIllIIIl[3]]);
            final CrashReportCategory lllllllllllllIIllIIIllIIlIlIlllI = lllllllllllllIIllIIIllIIlIlIllll.makeCategory(EffectRenderer.lIIlIllIllIIII[EffectRenderer.lIIlIllIllIIIl[2]]);
            final int lllllllllllllIIllIIIllIIlIlIllIl = lllllllllllllIIllIIIllIIlIllIIIl.getFXLayer();
            lllllllllllllIIllIIIllIIlIlIlllI.addCrashSectionCallable(EffectRenderer.lIIlIllIllIIII[EffectRenderer.lIIlIllIllIIIl[5]], new Callable<String>() {
                @Override
                public String call() throws Exception {
                    return lllllllllllllIIllIIIllIIlIllIIIl.toString();
                }
            });
            lllllllllllllIIllIIIllIIlIlIlllI.addCrashSectionCallable(EffectRenderer.lIIlIllIllIIII[EffectRenderer.lIIlIllIllIIIl[1]], new Callable<String>() {
                private static final /* synthetic */ String[] lIIllIlIIllIll;
                private static final /* synthetic */ int[] lIIllIlIlIIIIl;
                
                private static void llIllIIIllIIIIl() {
                    (lIIllIlIlIIIIl = new int[6])[0] = (" ".length() & (" ".length() ^ -" ".length()));
                    EffectRenderer$2.lIIllIlIlIIIIl[1] = " ".length();
                    EffectRenderer$2.lIIllIlIlIIIIl[2] = "   ".length();
                    EffectRenderer$2.lIIllIlIlIIIIl[3] = "  ".length();
                    EffectRenderer$2.lIIllIlIlIIIIl[4] = (0xE ^ 0x68 ^ (0xDB ^ 0xB9));
                    EffectRenderer$2.lIIllIlIlIIIIl[5] = (0x6E ^ 0x7B ^ (0x9 ^ 0x14));
                }
                
                private static String llIllIIIlIllIII(final String lllllllllllllIIlIlIlIlIllllIlIII, final String lllllllllllllIIlIlIlIlIllllIIlll) {
                    try {
                        final SecretKeySpec lllllllllllllIIlIlIlIlIllllIllIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIIlIlIlIlIllllIIlll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
                        final Cipher lllllllllllllIIlIlIlIlIllllIllII = Cipher.getInstance("Blowfish");
                        lllllllllllllIIlIlIlIlIllllIllII.init(EffectRenderer$2.lIIllIlIlIIIIl[3], lllllllllllllIIlIlIlIlIllllIllIl);
                        return new String(lllllllllllllIIlIlIlIlIllllIllII.doFinal(Base64.getDecoder().decode(lllllllllllllIIlIlIlIlIllllIlIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
                    }
                    catch (Exception lllllllllllllIIlIlIlIlIllllIlIll) {
                        lllllllllllllIIlIlIlIlIllllIlIll.printStackTrace();
                        return null;
                    }
                }
                
                private static boolean llIllIIIllIIIll(final int lllllllllllllIIlIlIlIlIllllIIIlI, final int lllllllllllllIIlIlIlIlIllllIIIIl) {
                    return lllllllllllllIIlIlIlIlIllllIIIlI == lllllllllllllIIlIlIlIlIllllIIIIl;
                }
                
                private static void llIllIIIlIllIIl() {
                    (lIIllIlIIllIll = new String[EffectRenderer$2.lIIllIlIlIIIIl[4]])[EffectRenderer$2.lIIllIlIlIIIIl[0]] = llIllIIIlIlIllI("Fw0cADQOARcXPggB", "ZDOCk");
                    EffectRenderer$2.lIIllIlIIllIll[EffectRenderer$2.lIIllIlIlIIIIl[1]] = llIllIIIlIlIllI("EggWHC4PAxsaKh4ZERwq", "FMDNo");
                    EffectRenderer$2.lIIllIlIIllIll[EffectRenderer$2.lIIllIlIlIIIIl[3]] = llIllIIIlIlIlll("Yd2s21JyRBFw/miNV/tDTL0ea7JX6EqQ", "VfhfV");
                    EffectRenderer$2.lIIllIlIIllIll[EffectRenderer$2.lIIllIlIlIIIIl[2]] = llIllIIIlIllIII("vvrBXZ08lixKyz5YTi6DNA==", "whGnj");
                }
                
                private static String llIllIIIlIlIllI(String lllllllllllllIIlIlIlIllIIIIIIlll, final String lllllllllllllIIlIlIlIllIIIIIlIll) {
                    lllllllllllllIIlIlIlIllIIIIIIlll = (long)new String(Base64.getDecoder().decode(((String)lllllllllllllIIlIlIlIllIIIIIIlll).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
                    final StringBuilder lllllllllllllIIlIlIlIllIIIIIlIlI = new StringBuilder();
                    final char[] lllllllllllllIIlIlIlIllIIIIIlIIl = lllllllllllllIIlIlIlIllIIIIIlIll.toCharArray();
                    int lllllllllllllIIlIlIlIllIIIIIlIII = EffectRenderer$2.lIIllIlIlIIIIl[0];
                    final String lllllllllllllIIlIlIlIllIIIIIIIlI = (Object)((String)lllllllllllllIIlIlIlIllIIIIIIlll).toCharArray();
                    final float lllllllllllllIIlIlIlIllIIIIIIIIl = lllllllllllllIIlIlIlIllIIIIIIIlI.length;
                    byte lllllllllllllIIlIlIlIllIIIIIIIII = (byte)EffectRenderer$2.lIIllIlIlIIIIl[0];
                    while (llIllIIIllIIlII(lllllllllllllIIlIlIlIllIIIIIIIII, (int)lllllllllllllIIlIlIlIllIIIIIIIIl)) {
                        final char lllllllllllllIIlIlIlIllIIIIIllIl = lllllllllllllIIlIlIlIllIIIIIIIlI[lllllllllllllIIlIlIlIllIIIIIIIII];
                        lllllllllllllIIlIlIlIllIIIIIlIlI.append((char)(lllllllllllllIIlIlIlIllIIIIIllIl ^ lllllllllllllIIlIlIlIllIIIIIlIIl[lllllllllllllIIlIlIlIllIIIIIlIII % lllllllllllllIIlIlIlIllIIIIIlIIl.length]));
                        "".length();
                        ++lllllllllllllIIlIlIlIllIIIIIlIII;
                        ++lllllllllllllIIlIlIlIllIIIIIIIII;
                        "".length();
                        if (((51 + 206 - 49 + 15 ^ 106 + 155 - 256 + 187) & (138 + 18 - 55 + 53 ^ 8 + 113 - 21 + 33 ^ -" ".length())) != 0x0) {
                            return null;
                        }
                    }
                    return String.valueOf(lllllllllllllIIlIlIlIllIIIIIlIlI);
                }
                
                @Override
                public String call() throws Exception {
                    String value;
                    if (llIllIIIllIIIlI(lllllllllllllIIllIIIllIIlIlIllIl)) {
                        value = EffectRenderer$2.lIIllIlIIllIll[EffectRenderer$2.lIIllIlIlIIIIl[0]];
                        "".length();
                        if (-(0x34 ^ 0x30) > 0) {
                            return null;
                        }
                    }
                    else if (llIllIIIllIIIll(lllllllllllllIIllIIIllIIlIlIllIl, EffectRenderer$2.lIIllIlIlIIIIl[1])) {
                        value = EffectRenderer$2.lIIllIlIIllIll[EffectRenderer$2.lIIllIlIlIIIIl[1]];
                        "".length();
                        if (-" ".length() > (0x38 ^ 0x27 ^ (0x64 ^ 0x7F))) {
                            return null;
                        }
                    }
                    else if (llIllIIIllIIIll(lllllllllllllIIllIIIllIIlIlIllIl, EffectRenderer$2.lIIllIlIlIIIIl[2])) {
                        value = EffectRenderer$2.lIIllIlIIllIll[EffectRenderer$2.lIIllIlIlIIIIl[3]];
                        "".length();
                        if (((61 + 132 - 71 + 39 ^ 47 + 59 - 105 + 182) & (0x4B ^ 0x5B ^ (0x43 ^ 0x45) ^ -" ".length())) == "  ".length()) {
                            return null;
                        }
                    }
                    else {
                        value = String.valueOf(new StringBuilder(EffectRenderer$2.lIIllIlIIllIll[EffectRenderer$2.lIIllIlIlIIIIl[2]]).append(lllllllllllllIIllIIIllIIlIlIllIl));
                    }
                    return value;
                }
                
                private static boolean llIllIIIllIIlII(final int lllllllllllllIIlIlIlIlIlllIllllI, final int lllllllllllllIIlIlIlIlIlllIlllIl) {
                    return lllllllllllllIIlIlIlIlIlllIllllI < lllllllllllllIIlIlIlIlIlllIlllIl;
                }
                
                static {
                    llIllIIIllIIIIl();
                    llIllIIIlIllIIl();
                }
                
                private static String llIllIIIlIlIlll(final String lllllllllllllIIlIlIlIlIlllllIlll, final String lllllllllllllIIlIlIlIlIlllllIllI) {
                    try {
                        final SecretKeySpec lllllllllllllIIlIlIlIlIllllllIlI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIIlIlIlIlIlllllIllI.getBytes(StandardCharsets.UTF_8)), EffectRenderer$2.lIIllIlIlIIIIl[5]), "DES");
                        final Cipher lllllllllllllIIlIlIlIlIllllllIIl = Cipher.getInstance("DES");
                        lllllllllllllIIlIlIlIlIllllllIIl.init(EffectRenderer$2.lIIllIlIlIIIIl[3], lllllllllllllIIlIlIlIlIllllllIlI);
                        return new String(lllllllllllllIIlIlIlIlIllllllIIl.doFinal(Base64.getDecoder().decode(lllllllllllllIIlIlIlIlIlllllIlll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
                    }
                    catch (Exception lllllllllllllIIlIlIlIlIllllllIII) {
                        lllllllllllllIIlIlIlIlIllllllIII.printStackTrace();
                        return null;
                    }
                }
                
                private static boolean llIllIIIllIIIlI(final int lllllllllllllIIlIlIlIlIlllIllIll) {
                    return lllllllllllllIIlIlIlIlIlllIllIll == 0;
                }
            });
            throw new ReportedException(lllllllllllllIIllIIIllIIlIlIllll);
        }
    }
    
    private static void llIlIIllIIIlIII() {
        (lIIlIllIllIIIl = new int[15])[0] = ((0x29 ^ 0x3 ^ (0x81 ^ 0xA0)) & (0x37 ^ 0x79 ^ (0xDF ^ 0x9A) ^ -" ".length()));
        EffectRenderer.lIIlIllIllIIIl[1] = (0x27 ^ 0x23);
        EffectRenderer.lIIlIllIllIIIl[2] = "  ".length();
        EffectRenderer.lIIlIllIllIIIl[3] = " ".length();
        EffectRenderer.lIIlIllIllIIIl[4] = (-(0xFFFFB6F6 & 0x795D) & (-1 & 0x3FF3));
        EffectRenderer.lIIlIllIllIIIl[5] = "   ".length();
        EffectRenderer.lIIlIllIllIIIl[6] = (0xFFFF8B33 & 0x77CE);
        EffectRenderer.lIIlIllIllIIIl[7] = (-(0xFFFFBD45 & 0x5EBF) & (0xFFFFDFA7 & 0x3F5F));
        EffectRenderer.lIIlIllIllIIIl[8] = (-(0xFFFFBBE9 & 0x4DFF) & (0xFFFFEFFF & 0x1BEC));
        EffectRenderer.lIIlIllIllIIIl[9] = (0x89 ^ 0x8E);
        EffectRenderer.lIIlIllIllIIIl[10] = (0x7E ^ 0x7B);
        EffectRenderer.lIIlIllIllIIIl[11] = (0x4C ^ 0x4A);
        EffectRenderer.lIIlIllIllIIIl[12] = (0xE7 ^ 0xA4 ^ (0x10 ^ 0x5B));
        EffectRenderer.lIIlIllIllIIIl[13] = -" ".length();
        EffectRenderer.lIIlIllIllIIIl[14] = (192 + 187 - 369 + 193 ^ 0 + 5 + 42 + 147);
    }
    
    private static String llIlIIllIIIIlIl(final String lllllllllllllIIllIIIlIlllIlIIIlI, final String lllllllllllllIIllIIIlIlllIIlllll) {
        try {
            final SecretKeySpec lllllllllllllIIllIIIlIlllIlIIlIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIIllIIIlIlllIIlllll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lllllllllllllIIllIIIlIlllIlIIlII = Cipher.getInstance("Blowfish");
            lllllllllllllIIllIIIlIlllIlIIlII.init(EffectRenderer.lIIlIllIllIIIl[2], lllllllllllllIIllIIIlIlllIlIIlIl);
            return new String(lllllllllllllIIllIIIlIlllIlIIlII.doFinal(Base64.getDecoder().decode(lllllllllllllIIllIIIlIlllIlIIIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIllIIIlIlllIlIIIll) {
            lllllllllllllIIllIIIlIlllIlIIIll.printStackTrace();
            return null;
        }
    }
}
