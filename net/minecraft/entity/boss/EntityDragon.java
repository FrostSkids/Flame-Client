// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.entity.boss;

import net.minecraft.world.Explosion;
import net.minecraft.util.Vec3;
import net.minecraft.entity.item.EntityXPOrb;
import net.minecraft.block.Block;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.block.material.Material;
import net.minecraft.util.AxisAlignedBB;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.security.MessageDigest;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.world.World;
import net.minecraft.block.properties.IProperty;
import net.minecraft.util.EnumFacing;
import net.minecraft.block.BlockTorch;
import net.minecraft.init.Blocks;
import net.minecraft.util.BlockPos;
import net.minecraft.entity.SharedMonsterAttributes;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import net.minecraft.util.EntityDamageSource;
import java.util.Iterator;
import java.util.List;
import com.google.common.collect.Lists;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.MathHelper;
import net.minecraft.util.DamageSource;
import net.minecraft.entity.Entity;
import net.minecraft.entity.item.EntityEnderCrystal;
import net.minecraft.entity.monster.IMob;
import net.minecraft.entity.IEntityMultiPart;
import net.minecraft.entity.EntityLiving;

public class EntityDragon extends EntityLiving implements IBossDisplayData, IEntityMultiPart, IMob
{
    public /* synthetic */ double[][] ringBuffer;
    public /* synthetic */ EntityDragonPart dragonPartHead;
    public /* synthetic */ EntityDragonPart dragonPartTail1;
    public /* synthetic */ double targetX;
    public /* synthetic */ EntityDragonPart dragonPartBody;
    public /* synthetic */ EntityDragonPart[] dragonPartArray;
    public /* synthetic */ int ringBufferIndex;
    private static final /* synthetic */ int[] lIIIIIllIIIIIl;
    public /* synthetic */ int deathTicks;
    private static final /* synthetic */ String[] lIIIIIlIlllIlI;
    public /* synthetic */ double targetZ;
    public /* synthetic */ EntityEnderCrystal healingEnderCrystal;
    private /* synthetic */ Entity target;
    public /* synthetic */ EntityDragonPart dragonPartTail2;
    public /* synthetic */ float prevAnimTime;
    public /* synthetic */ boolean forceNewTarget;
    public /* synthetic */ float animTime;
    public /* synthetic */ EntityDragonPart dragonPartWing1;
    public /* synthetic */ boolean slowed;
    public /* synthetic */ EntityDragonPart dragonPartTail3;
    public /* synthetic */ double targetY;
    public /* synthetic */ EntityDragonPart dragonPartWing2;
    
    private static boolean lIllIllIlIlllll(final int lllllllllllllIlIIlllIIIIIlIlllIl) {
        return lllllllllllllIlIIlllIIIIIlIlllIl != 0;
    }
    
    @Override
    public boolean attackEntityFromPart(final EntityDragonPart lllllllllllllIlIIlllIIIlIIIIIIII, final DamageSource lllllllllllllIlIIlllIIIlIIIIIllI, float lllllllllllllIlIIlllIIIIlllllllI) {
        if (lIllIllIllIlIlI(lllllllllllllIlIIlllIIIlIIIIIIII, this.dragonPartHead)) {
            lllllllllllllIlIIlllIIIIlllllllI = lllllllllllllIlIIlllIIIIlllllllI / 4.0f + 1.0f;
        }
        final float lllllllllllllIlIIlllIIIlIIIIIlII = this.rotationYaw * 3.1415927f / 180.0f;
        final float lllllllllllllIlIIlllIIIlIIIIIIll = MathHelper.sin(lllllllllllllIlIIlllIIIlIIIIIlII);
        final float lllllllllllllIlIIlllIIIlIIIIIIlI = MathHelper.cos(lllllllllllllIlIIlllIIIlIIIIIlII);
        this.targetX = this.posX + lllllllllllllIlIIlllIIIlIIIIIIll * 5.0f + (this.rand.nextFloat() - 0.5f) * 2.0f;
        this.targetY = this.posY + this.rand.nextFloat() * 3.0f + 1.0;
        this.targetZ = this.posZ - lllllllllllllIlIIlllIIIlIIIIIIlI * 5.0f + (this.rand.nextFloat() - 0.5f) * 2.0f;
        this.target = null;
        if (!lIllIllIllIIIIl((lllllllllllllIlIIlllIIIlIIIIIllI.getEntity() instanceof EntityPlayer) ? 1 : 0) || lIllIllIlIlllll(lllllllllllllIlIIlllIIIlIIIIIllI.isExplosion() ? 1 : 0)) {
            this.attackDragonFrom(lllllllllllllIlIIlllIIIlIIIIIllI, (float)lllllllllllllIlIIlllIIIIlllllllI);
            "".length();
        }
        return EntityDragon.lIIIIIllIIIIIl[5] != 0;
    }
    
    private static int lIllIllIllIlllI(final double n, final double n2) {
        return dcmpl(n, n2);
    }
    
    private void setNewTarget() {
        this.forceNewTarget = (EntityDragon.lIIIIIllIIIIIl[4] != 0);
        final List<EntityPlayer> lllllllllllllIlIIlllIIIlIlIlIIII = (List<EntityPlayer>)Lists.newArrayList((Iterable)this.worldObj.playerEntities);
        final Iterator<EntityPlayer> lllllllllllllIlIIlllIIIlIlIIllll = lllllllllllllIlIIlllIIIlIlIlIIII.iterator();
        "".length();
        if ((0x70 ^ 0x15 ^ (0xF3 ^ 0x92)) < 0) {
            return;
        }
        while (!lIllIllIllIIIIl(lllllllllllllIlIIlllIIIlIlIIllll.hasNext() ? 1 : 0)) {
            if (lIllIllIlIlllll(lllllllllllllIlIIlllIIIlIlIIllll.next().isSpectator() ? 1 : 0)) {
                lllllllllllllIlIIlllIIIlIlIIllll.remove();
            }
        }
        if (lIllIllIllIIIIl(this.rand.nextInt(EntityDragon.lIIIIIllIIIIIl[6])) && lIllIllIllIIIIl(lllllllllllllIlIIlllIIIlIlIlIIII.isEmpty() ? 1 : 0)) {
            this.target = lllllllllllllIlIIlllIIIlIlIlIIII.get(this.rand.nextInt(lllllllllllllIlIIlllIIIlIlIlIIII.size()));
            "".length();
            if ("   ".length() < 0) {
                return;
            }
        }
        else {
            boolean lllllllllllllIlIIlllIIIlIlIIlIll;
            do {
                this.targetX = 0.0;
                this.targetY = 70.0f + this.rand.nextFloat() * 50.0f;
                this.targetZ = 0.0;
                this.targetX += this.rand.nextFloat() * 120.0f - 60.0f;
                this.targetZ += this.rand.nextFloat() * 120.0f - 60.0f;
                final double lllllllllllllIlIIlllIIIlIlIIlllI = this.posX - this.targetX;
                final double lllllllllllllIlIIlllIIIlIlIIllIl = this.posY - this.targetY;
                final double lllllllllllllIlIIlllIIIlIlIIllII = this.posZ - this.targetZ;
                int n;
                if (lIllIllIllIIlIl(lIllIllIllIlIIl(lllllllllllllIlIIlllIIIlIlIIlllI * lllllllllllllIlIIlllIIIlIlIIlllI + lllllllllllllIlIIlllIIIlIlIIllIl * lllllllllllllIlIIlllIIIlIlIIllIl + lllllllllllllIlIIlllIIIlIlIIllII * lllllllllllllIlIIlllIIIlIlIIllII, 100.0))) {
                    n = EntityDragon.lIIIIIllIIIIIl[5];
                    "".length();
                    if ("  ".length() < -" ".length()) {
                        return;
                    }
                }
                else {
                    n = EntityDragon.lIIIIIllIIIIIl[4];
                }
                lllllllllllllIlIIlllIIIlIlIIlIll = (n != 0);
            } while (!lIllIllIlIlllll(lllllllllllllIlIIlllIIIlIlIIlIll ? 1 : 0));
            this.target = null;
        }
    }
    
    private static boolean lIllIllIllIIIll(final int lllllllllllllIlIIlllIIIIIlllIIlI, final int lllllllllllllIlIIlllIIIIIlllIIIl) {
        return lllllllllllllIlIIlllIIIIIlllIIlI >= lllllllllllllIlIIlllIIIIIlllIIIl;
    }
    
    @Override
    public boolean attackEntityFrom(final DamageSource lllllllllllllIlIIlllIIIIllllIIll, final float lllllllllllllIlIIlllIIIIllllIIlI) {
        if (lIllIllIlIlllll((lllllllllllllIlIIlllIIIIllllIIll instanceof EntityDamageSource) ? 1 : 0) && lIllIllIlIlllll(((EntityDamageSource)lllllllllllllIlIIlllIIIIllllIIll).getIsThornsDamage() ? 1 : 0)) {
            this.attackDragonFrom(lllllllllllllIlIIlllIIIIllllIIll, lllllllllllllIlIIlllIIIIllllIIlI);
            "".length();
        }
        return EntityDragon.lIIIIIllIIIIIl[4] != 0;
    }
    
    private static boolean lIllIllIllIIIIl(final int lllllllllllllIlIIlllIIIIIlIllIll) {
        return lllllllllllllIlIIlllIIIIIlIllIll == 0;
    }
    
    private static boolean lIllIllIllIlIll(final int lllllllllllllIlIIlllIIIIIllIIllI, final int lllllllllllllIlIIlllIIIIIllIIlIl) {
        return lllllllllllllIlIIlllIIIIIllIIllI > lllllllllllllIlIIlllIIIIIllIIlIl;
    }
    
    @Override
    protected String getLivingSound() {
        return EntityDragon.lIIIIIlIlllIlI[EntityDragon.lIIIIIllIIIIIl[11]];
    }
    
    protected boolean attackDragonFrom(final DamageSource lllllllllllllIlIIlllIIIIlllIlIlI, final float lllllllllllllIlIIlllIIIIlllIllII) {
        return super.attackEntityFrom(lllllllllllllIlIIlllIIIIlllIlIlI, lllllllllllllIlIIlllIIIIlllIllII);
    }
    
    @Override
    protected float getSoundVolume() {
        return 5.0f;
    }
    
    private static String lIllIllIlIIlIll(String lllllllllllllIlIIlllIIIIlIIllIll, final String lllllllllllllIlIIlllIIIIlIIllIlI) {
        lllllllllllllIlIIlllIIIIlIIllIll = (int)new String(Base64.getDecoder().decode(((String)lllllllllllllIlIIlllIIIIlIIllIll).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIlIIlllIIIIlIIllllI = new StringBuilder();
        final char[] lllllllllllllIlIIlllIIIIlIIlllIl = lllllllllllllIlIIlllIIIIlIIllIlI.toCharArray();
        int lllllllllllllIlIIlllIIIIlIIlllII = EntityDragon.lIIIIIllIIIIIl[4];
        final boolean lllllllllllllIlIIlllIIIIlIIlIllI = (Object)((String)lllllllllllllIlIIlllIIIIlIIllIll).toCharArray();
        final char lllllllllllllIlIIlllIIIIlIIlIlIl = (char)lllllllllllllIlIIlllIIIIlIIlIllI.length;
        short lllllllllllllIlIIlllIIIIlIIlIlII = (short)EntityDragon.lIIIIIllIIIIIl[4];
        while (lIllIllIllIllll(lllllllllllllIlIIlllIIIIlIIlIlII, lllllllllllllIlIIlllIIIIlIIlIlIl)) {
            final char lllllllllllllIlIIlllIIIIlIlIIIIl = lllllllllllllIlIIlllIIIIlIIlIllI[lllllllllllllIlIIlllIIIIlIIlIlII];
            lllllllllllllIlIIlllIIIIlIIllllI.append((char)(lllllllllllllIlIIlllIIIIlIlIIIIl ^ lllllllllllllIlIIlllIIIIlIIlllIl[lllllllllllllIlIIlllIIIIlIIlllII % lllllllllllllIlIIlllIIIIlIIlllIl.length]));
            "".length();
            ++lllllllllllllIlIIlllIIIIlIIlllII;
            ++lllllllllllllIlIIlllIIIIlIIlIlII;
            "".length();
            if (-(0x7F ^ 0x41 ^ (0xB6 ^ 0x8D)) >= 0) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIlIIlllIIIIlIIllllI);
    }
    
    @Override
    public boolean canBeCollidedWith() {
        return EntityDragon.lIIIIIllIIIIIl[4] != 0;
    }
    
    private static int lIllIllIlIlllII(final float n, final float n2) {
        return fcmpl(n, n2);
    }
    
    private static int lIllIllIllIlIII(final double n, final double n2) {
        return dcmpg(n, n2);
    }
    
    @Override
    protected void applyEntityAttributes() {
        super.applyEntityAttributes();
        this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(200.0);
    }
    
    private void generatePortal(final BlockPos lllllllllllllIlIIlllIIIIllIIlIIl) {
        final int lllllllllllllIlIIlllIIIIllIIlIII = EntityDragon.lIIIIIllIIIIIl[7];
        final double lllllllllllllIlIIlllIIIIllIIIlll = 12.25;
        final double lllllllllllllIlIIlllIIIIllIIIllI = 6.25;
        int lllllllllllllIlIIlllIIIIllIIIlIl = EntityDragon.lIIIIIllIIIIIl[2];
        "".length();
        if ("   ".length() == 0) {
            return;
        }
        while (!lIllIllIllIlIll(lllllllllllllIlIIlllIIIIllIIIlIl, EntityDragon.lIIIIIllIIIIIl[22])) {
            int lllllllllllllIlIIlllIIIIllIIIlII = EntityDragon.lIIIIIllIIIIIl[21];
            "".length();
            if (-"   ".length() >= 0) {
                return;
            }
            while (!lIllIllIllIlIll(lllllllllllllIlIIlllIIIIllIIIlII, EntityDragon.lIIIIIllIIIIIl[7])) {
                int lllllllllllllIlIIlllIIIIllIIIIll = EntityDragon.lIIIIIllIIIIIl[21];
                "".length();
                if (-"   ".length() > 0) {
                    return;
                }
                while (!lIllIllIllIlIll(lllllllllllllIlIIlllIIIIllIIIIll, EntityDragon.lIIIIIllIIIIIl[7])) {
                    final double lllllllllllllIlIIlllIIIIllIIIIlI = lllllllllllllIlIIlllIIIIllIIIlII * lllllllllllllIlIIlllIIIIllIIIlII + lllllllllllllIlIIlllIIIIllIIIIll * lllllllllllllIlIIlllIIIIllIIIIll;
                    if (lIllIllIlIllIIl(lIllIllIllIllIl(lllllllllllllIlIIlllIIIIllIIIIlI, 12.25))) {
                        final BlockPos lllllllllllllIlIIlllIIIIllIIIIIl = lllllllllllllIlIIlllIIIIllIIlIIl.add(lllllllllllllIlIIlllIIIIllIIIlII, lllllllllllllIlIIlllIIIIllIIIlIl, lllllllllllllIlIIlllIIIIllIIIIll);
                        if (lIllIllIllIIIlI(lllllllllllllIlIIlllIIIIllIIIlIl)) {
                            if (lIllIllIlIllIIl(lIllIllIllIllIl(lllllllllllllIlIIlllIIIIllIIIIlI, 6.25))) {
                                this.worldObj.setBlockState(lllllllllllllIlIIlllIIIIllIIIIIl, Blocks.bedrock.getDefaultState());
                                "".length();
                                "".length();
                                if (" ".length() >= (0x28 ^ 0x23 ^ (0x2D ^ 0x22))) {
                                    return;
                                }
                            }
                        }
                        else if (lIllIllIllIIlIl(lllllllllllllIlIIlllIIIIllIIIlIl)) {
                            this.worldObj.setBlockState(lllllllllllllIlIIlllIIIIllIIIIIl, Blocks.air.getDefaultState());
                            "".length();
                            "".length();
                            if (-"  ".length() >= 0) {
                                return;
                            }
                        }
                        else if (lIllIllIllIIlIl(lIllIllIllIlllI(lllllllllllllIlIIlllIIIIllIIIIlI, 6.25))) {
                            this.worldObj.setBlockState(lllllllllllllIlIIlllIIIIllIIIIIl, Blocks.bedrock.getDefaultState());
                            "".length();
                            "".length();
                            if (((0xFE ^ 0xC7) & ~(0x1 ^ 0x38)) > 0) {
                                return;
                            }
                        }
                        else {
                            this.worldObj.setBlockState(lllllllllllllIlIIlllIIIIllIIIIIl, Blocks.end_portal.getDefaultState());
                            "".length();
                        }
                    }
                    ++lllllllllllllIlIIlllIIIIllIIIIll;
                }
                ++lllllllllllllIlIIlllIIIIllIIIlII;
            }
            ++lllllllllllllIlIIlllIIIIllIIIlIl;
        }
        this.worldObj.setBlockState(lllllllllllllIlIIlllIIIIllIIlIIl, Blocks.bedrock.getDefaultState());
        "".length();
        this.worldObj.setBlockState(lllllllllllllIlIIlllIIIIllIIlIIl.up(), Blocks.bedrock.getDefaultState());
        "".length();
        final BlockPos lllllllllllllIlIIlllIIIIllIIIIII = lllllllllllllIlIIlllIIIIllIIlIIl.up(EntityDragon.lIIIIIllIIIIIl[6]);
        this.worldObj.setBlockState(lllllllllllllIlIIlllIIIIllIIIIII, Blocks.bedrock.getDefaultState());
        "".length();
        this.worldObj.setBlockState(lllllllllllllIlIIlllIIIIllIIIIII.west(), Blocks.torch.getDefaultState().withProperty((IProperty<Comparable>)BlockTorch.FACING, EnumFacing.EAST));
        "".length();
        this.worldObj.setBlockState(lllllllllllllIlIIlllIIIIllIIIIII.east(), Blocks.torch.getDefaultState().withProperty((IProperty<Comparable>)BlockTorch.FACING, EnumFacing.WEST));
        "".length();
        this.worldObj.setBlockState(lllllllllllllIlIIlllIIIIllIIIIII.north(), Blocks.torch.getDefaultState().withProperty((IProperty<Comparable>)BlockTorch.FACING, EnumFacing.SOUTH));
        "".length();
        this.worldObj.setBlockState(lllllllllllllIlIIlllIIIIllIIIIII.south(), Blocks.torch.getDefaultState().withProperty((IProperty<Comparable>)BlockTorch.FACING, EnumFacing.NORTH));
        "".length();
        this.worldObj.setBlockState(lllllllllllllIlIIlllIIIIllIIlIIl.up(EntityDragon.lIIIIIllIIIIIl[1]), Blocks.bedrock.getDefaultState());
        "".length();
        this.worldObj.setBlockState(lllllllllllllIlIIlllIIIIllIIlIIl.up(EntityDragon.lIIIIIllIIIIIl[7]), Blocks.dragon_egg.getDefaultState());
        "".length();
    }
    
    private static boolean lIllIllIllIIllI(final Object lllllllllllllIlIIlllIIIIIlIlllll) {
        return lllllllllllllIlIIlllIIIIIlIlllll != null;
    }
    
    @Override
    public World getWorld() {
        return this.worldObj;
    }
    
    private static int lIllIllIllIllIl(final double n, final double n2) {
        return dcmpg(n, n2);
    }
    
    @Override
    public void onKillCommand() {
        this.setDead();
    }
    
    private void attackEntitiesInList(final List<Entity> lllllllllllllIlIIlllIIIlIlIllIll) {
        int lllllllllllllIlIIlllIIIlIlIllllI = EntityDragon.lIIIIIllIIIIIl[4];
        "".length();
        if (-" ".length() >= 0) {
            return;
        }
        while (!lIllIllIllIIIll(lllllllllllllIlIIlllIIIlIlIllllI, lllllllllllllIlIIlllIIIlIlIllIll.size())) {
            final Entity lllllllllllllIlIIlllIIIlIlIlllIl = lllllllllllllIlIIlllIIIlIlIllIll.get(lllllllllllllIlIIlllIIIlIlIllllI);
            if (lIllIllIlIlllll((lllllllllllllIlIIlllIIIlIlIlllIl instanceof EntityLivingBase) ? 1 : 0)) {
                lllllllllllllIlIIlllIIIlIlIlllIl.attackEntityFrom(DamageSource.causeMobDamage(this), 10.0f);
                "".length();
                this.applyEnchantments(this, lllllllllllllIlIIlllIIIlIlIlllIl);
            }
            ++lllllllllllllIlIIlllIIIlIlIllllI;
        }
    }
    
    private static String lIllIllIlIIlIlI(final String lllllllllllllIlIIlllIIIIIlllllII, final String lllllllllllllIlIIlllIIIIIllllIll) {
        try {
            final SecretKeySpec lllllllllllllIlIIlllIIIIlIIIIIIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIlIIlllIIIIIllllIll.getBytes(StandardCharsets.UTF_8)), EntityDragon.lIIIIIllIIIIIl[13]), "DES");
            final Cipher lllllllllllllIlIIlllIIIIlIIIIIII = Cipher.getInstance("DES");
            lllllllllllllIlIIlllIIIIlIIIIIII.init(EntityDragon.lIIIIIllIIIIIl[6], lllllllllllllIlIIlllIIIIlIIIIIIl);
            return new String(lllllllllllllIlIIlllIIIIlIIIIIII.doFinal(Base64.getDecoder().decode(lllllllllllllIlIIlllIIIIIlllllII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIlIIlllIIIIIlllllll) {
            lllllllllllllIlIIlllIIIIIlllllll.printStackTrace();
            return null;
        }
    }
    
    @Override
    public Entity[] getParts() {
        return this.dragonPartArray;
    }
    
    @Override
    protected void entityInit() {
        super.entityInit();
    }
    
    private float simplifyAngle(final double lllllllllllllIlIIlllIIIlIlIIIIIl) {
        return (float)MathHelper.wrapAngleTo180_double(lllllllllllllIlIIlllIIIlIlIIIIIl);
    }
    
    private static boolean lIllIllIllIIIlI(final int lllllllllllllIlIIlllIIIIIlIlIlll) {
        return lllllllllllllIlIIlllIIIIIlIlIlll < 0;
    }
    
    private static void lIllIllIlIlIlll() {
        (lIIIIIllIIIIIl = new int[24])[0] = (237 + 86 - 220 + 136 ^ 73 + 100 - 27 + 29);
        EntityDragon.lIIIIIllIIIIIl[1] = "   ".length();
        EntityDragon.lIIIIIllIIIIIl[2] = -" ".length();
        EntityDragon.lIIIIIllIIIIIl[3] = (22 + 119 - 107 + 134 ^ 9 + 132 - 27 + 61);
        EntityDragon.lIIIIIllIIIIIl[4] = ("  ".length() & ("  ".length() ^ -" ".length()));
        EntityDragon.lIIIIIllIIIIIl[5] = " ".length();
        EntityDragon.lIIIIIllIIIIIl[6] = "  ".length();
        EntityDragon.lIIIIIllIIIIIl[7] = (0x32 ^ 0x36);
        EntityDragon.lIIIIIllIIIIIl[8] = (0x68 ^ 0x6D);
        EntityDragon.lIIIIIllIIIIIl[9] = (34 + 130 - 116 + 96 ^ 111 + 104 - 97 + 32);
        EntityDragon.lIIIIIllIIIIIl[10] = (0x35 ^ 0xA);
        EntityDragon.lIIIIIllIIIIIl[11] = (0xE6 ^ 0x88 ^ (0x76 ^ 0x12));
        EntityDragon.lIIIIIllIIIIIl[12] = (0x81 ^ 0x8D);
        EntityDragon.lIIIIIllIIIIIl[13] = (0xA0 ^ 0xA8);
        EntityDragon.lIIIIIllIIIIIl[14] = (0x1D ^ 0x2) + (9 + 27 + 72 + 25) - (0x41 ^ 0x34) + (102 + 30 - 114 + 115);
        EntityDragon.lIIIIIllIIIIIl[15] = (0x28 ^ 0x6C) + (0x2D ^ 0x59) - (55 + 54 - 23 + 82) + (179 + 123 - 125 + 7);
        EntityDragon.lIIIIIllIIIIIl[16] = ("  ".length() ^ (0x2B ^ 0x20));
        EntityDragon.lIIIIIllIIIIIl[17] = 101 + 71 - 71 + 49;
        EntityDragon.lIIIIIllIIIIIl[18] = (-(0xFFFFF29E & 0x6D73) & (0xFFFFEBFF & 0x77F9));
        EntityDragon.lIIIIIllIIIIIl[19] = (0xFFFFAFFB & 0x53FE);
        EntityDragon.lIIIIIllIIIIIl[20] = (0xFFFFC7D0 & 0x3FFF);
        EntityDragon.lIIIIIllIIIIIl[21] = -(0x3C ^ 0x38);
        EntityDragon.lIIIIIllIIIIIl[22] = (0x5C ^ 0x60 ^ (0x7E ^ 0x62));
        EntityDragon.lIIIIIllIIIIIl[23] = (0x8B ^ 0x80);
    }
    
    private static int lIllIllIlIllIII(final float n, final float n2) {
        return fcmpg(n, n2);
    }
    
    private static int lIllIllIlIllllI(final double n, final double n2) {
        return dcmpg(n, n2);
    }
    
    public EntityDragon(final World lllllllllllllIlIIlllIIlIIIIlllIl) {
        super(lllllllllllllIlIIlllIIlIIIIlllIl);
        this.ringBuffer = new double[EntityDragon.lIIIIIllIIIIIl[0]][EntityDragon.lIIIIIllIIIIIl[1]];
        this.ringBufferIndex = EntityDragon.lIIIIIllIIIIIl[2];
        final EntityDragonPart[] dragonPartArray = new EntityDragonPart[EntityDragon.lIIIIIllIIIIIl[3]];
        final int n = EntityDragon.lIIIIIllIIIIIl[4];
        final EntityDragonPart dragonPartHead = new EntityDragonPart(this, EntityDragon.lIIIIIlIlllIlI[EntityDragon.lIIIIIllIIIIIl[4]], 6.0f, 6.0f);
        this.dragonPartHead = dragonPartHead;
        dragonPartArray[n] = dragonPartHead;
        final int n2 = EntityDragon.lIIIIIllIIIIIl[5];
        final EntityDragonPart dragonPartBody = new EntityDragonPart(this, EntityDragon.lIIIIIlIlllIlI[EntityDragon.lIIIIIllIIIIIl[5]], 8.0f, 8.0f);
        this.dragonPartBody = dragonPartBody;
        dragonPartArray[n2] = dragonPartBody;
        final int n3 = EntityDragon.lIIIIIllIIIIIl[6];
        final EntityDragonPart dragonPartTail1 = new EntityDragonPart(this, EntityDragon.lIIIIIlIlllIlI[EntityDragon.lIIIIIllIIIIIl[6]], 4.0f, 4.0f);
        this.dragonPartTail1 = dragonPartTail1;
        dragonPartArray[n3] = dragonPartTail1;
        final int n4 = EntityDragon.lIIIIIllIIIIIl[1];
        final EntityDragonPart dragonPartTail2 = new EntityDragonPart(this, EntityDragon.lIIIIIlIlllIlI[EntityDragon.lIIIIIllIIIIIl[1]], 4.0f, 4.0f);
        this.dragonPartTail2 = dragonPartTail2;
        dragonPartArray[n4] = dragonPartTail2;
        final int n5 = EntityDragon.lIIIIIllIIIIIl[7];
        final EntityDragonPart dragonPartTail3 = new EntityDragonPart(this, EntityDragon.lIIIIIlIlllIlI[EntityDragon.lIIIIIllIIIIIl[7]], 4.0f, 4.0f);
        this.dragonPartTail3 = dragonPartTail3;
        dragonPartArray[n5] = dragonPartTail3;
        final int n6 = EntityDragon.lIIIIIllIIIIIl[8];
        final EntityDragonPart dragonPartWing1 = new EntityDragonPart(this, EntityDragon.lIIIIIlIlllIlI[EntityDragon.lIIIIIllIIIIIl[8]], 4.0f, 4.0f);
        this.dragonPartWing1 = dragonPartWing1;
        dragonPartArray[n6] = dragonPartWing1;
        final int n7 = EntityDragon.lIIIIIllIIIIIl[9];
        final EntityDragonPart dragonPartWing2 = new EntityDragonPart(this, EntityDragon.lIIIIIlIlllIlI[EntityDragon.lIIIIIllIIIIIl[9]], 4.0f, 4.0f);
        this.dragonPartWing2 = dragonPartWing2;
        dragonPartArray[n7] = dragonPartWing2;
        this.dragonPartArray = dragonPartArray;
        this.setHealth(this.getMaxHealth());
        this.setSize(16.0f, 8.0f);
        this.noClip = (EntityDragon.lIIIIIllIIIIIl[5] != 0);
        this.isImmuneToFire = (EntityDragon.lIIIIIllIIIIIl[5] != 0);
        this.targetY = 100.0;
        this.ignoreFrustumCheck = (EntityDragon.lIIIIIllIIIIIl[5] != 0);
    }
    
    @Override
    protected String getHurtSound() {
        return EntityDragon.lIIIIIlIlllIlI[EntityDragon.lIIIIIllIIIIIl[23]];
    }
    
    private static boolean lIllIllIllIllII(final int lllllllllllllIlIIlllIIIIIllIlIlI, final int lllllllllllllIlIIlllIIIIIllIlIIl) {
        return lllllllllllllIlIIlllIIIIIllIlIlI <= lllllllllllllIlIIlllIIIIIllIlIIl;
    }
    
    private boolean destroyBlocksInAABB(final AxisAlignedBB lllllllllllllIlIIlllIIIlIIlIllll) {
        final int lllllllllllllIlIIlllIIIlIIlIlllI = MathHelper.floor_double(lllllllllllllIlIIlllIIIlIIlIllll.minX);
        final int lllllllllllllIlIIlllIIIlIIlIllIl = MathHelper.floor_double(lllllllllllllIlIIlllIIIlIIlIllll.minY);
        final int lllllllllllllIlIIlllIIIlIIlIllII = MathHelper.floor_double(lllllllllllllIlIIlllIIIlIIlIllll.minZ);
        final int lllllllllllllIlIIlllIIIlIIlIlIll = MathHelper.floor_double(lllllllllllllIlIIlllIIIlIIlIllll.maxX);
        final int lllllllllllllIlIIlllIIIlIIlIlIlI = MathHelper.floor_double(lllllllllllllIlIIlllIIIlIIlIllll.maxY);
        final int lllllllllllllIlIIlllIIIlIIlIlIIl = MathHelper.floor_double(lllllllllllllIlIIlllIIIlIIlIllll.maxZ);
        boolean lllllllllllllIlIIlllIIIlIIlIlIII = EntityDragon.lIIIIIllIIIIIl[4] != 0;
        boolean lllllllllllllIlIIlllIIIlIIlIIlll = EntityDragon.lIIIIIllIIIIIl[4] != 0;
        int lllllllllllllIlIIlllIIIlIIlIIllI = lllllllllllllIlIIlllIIIlIIlIlllI;
        "".length();
        if (((21 + 119 - 1 + 2 ^ 13 + 113 + 35 + 3) & (73 + 80 - 142 + 118 ^ 140 + 116 - 168 + 80 ^ -" ".length())) != 0x0) {
            return ((0x86 ^ 0x9B ^ (0xD0 ^ 0x8D)) & (0x1 ^ 0x13 ^ (0x4B ^ 0x19) ^ -" ".length())) != 0x0;
        }
        while (!lIllIllIllIlIll(lllllllllllllIlIIlllIIIlIIlIIllI, lllllllllllllIlIIlllIIIlIIlIlIll)) {
            int lllllllllllllIlIIlllIIIlIIlIIlIl = lllllllllllllIlIIlllIIIlIIlIllIl;
            "".length();
            if (null != null) {
                return ((38 + 2 + 41 + 84 ^ 142 + 54 - 53 + 38) & (0x39 ^ 0x73 ^ (0xDE ^ 0x84) ^ -" ".length())) != 0x0;
            }
            while (!lIllIllIllIlIll(lllllllllllllIlIIlllIIIlIIlIIlIl, lllllllllllllIlIIlllIIIlIIlIlIlI)) {
                int lllllllllllllIlIIlllIIIlIIlIIlII = lllllllllllllIlIIlllIIIlIIlIllII;
                "".length();
                if ("   ".length() < "   ".length()) {
                    return ((0x69 ^ 0x77) & ~(0x12 ^ 0xC)) != 0x0;
                }
                while (!lIllIllIllIlIll(lllllllllllllIlIIlllIIIlIIlIIlII, lllllllllllllIlIIlllIIIlIIlIlIIl)) {
                    final BlockPos lllllllllllllIlIIlllIIIlIIlIIIll = new BlockPos(lllllllllllllIlIIlllIIIlIIlIIllI, lllllllllllllIlIIlllIIIlIIlIIlIl, lllllllllllllIlIIlllIIIlIIlIIlII);
                    final Block lllllllllllllIlIIlllIIIlIIlIIIlI = this.worldObj.getBlockState(lllllllllllllIlIIlllIIIlIIlIIIll).getBlock();
                    if (lIllIllIllIlIlI(lllllllllllllIlIIlllIIIlIIlIIIlI.getMaterial(), Material.air)) {
                        if (lIllIllIllIlIlI(lllllllllllllIlIIlllIIIlIIlIIIlI, Blocks.barrier) && lIllIllIllIlIlI(lllllllllllllIlIIlllIIIlIIlIIIlI, Blocks.obsidian) && lIllIllIllIlIlI(lllllllllllllIlIIlllIIIlIIlIIIlI, Blocks.end_stone) && lIllIllIllIlIlI(lllllllllllllIlIIlllIIIlIIlIIIlI, Blocks.bedrock) && lIllIllIllIlIlI(lllllllllllllIlIIlllIIIlIIlIIIlI, Blocks.command_block) && lIllIllIlIlllll(this.worldObj.getGameRules().getBoolean(EntityDragon.lIIIIIlIlllIlI[EntityDragon.lIIIIIllIIIIIl[13]]) ? 1 : 0)) {
                            int n;
                            if (lIllIllIllIIIIl(this.worldObj.setBlockToAir(lllllllllllllIlIIlllIIIlIIlIIIll) ? 1 : 0) && lIllIllIllIIIIl(lllllllllllllIlIIlllIIIlIIlIIlll ? 1 : 0)) {
                                n = EntityDragon.lIIIIIllIIIIIl[4];
                                "".length();
                                if (-" ".length() != -" ".length()) {
                                    return ((27 + 32 - 28 + 133 ^ 25 + 70 + 15 + 41) & (77 + 27 - 24 + 59 ^ 46 + 161 - 62 + 39 ^ -" ".length())) != 0x0;
                                }
                            }
                            else {
                                n = EntityDragon.lIIIIIllIIIIIl[5];
                            }
                            lllllllllllllIlIIlllIIIlIIlIIlll = (n != 0);
                            "".length();
                            if ("   ".length() == ((0x33 ^ 0x6 ^ (0x10 ^ 0x70)) & (174 + 152 - 243 + 153 ^ 133 + 98 - 79 + 33 ^ -" ".length()))) {
                                return ((133 + 26 + 25 + 41 ^ 172 + 71 - 101 + 44) & (95 + 167 - 154 + 104 ^ 91 + 47 - 41 + 46 ^ -" ".length())) != 0x0;
                            }
                        }
                        else {
                            lllllllllllllIlIIlllIIIlIIlIlIII = (EntityDragon.lIIIIIllIIIIIl[5] != 0);
                        }
                    }
                    ++lllllllllllllIlIIlllIIIlIIlIIlII;
                }
                ++lllllllllllllIlIIlllIIIlIIlIIlIl;
            }
            ++lllllllllllllIlIIlllIIIlIIlIIllI;
        }
        if (lIllIllIlIlllll(lllllllllllllIlIIlllIIIlIIlIIlll ? 1 : 0)) {
            final double lllllllllllllIlIIlllIIIlIIlIIIIl = lllllllllllllIlIIlllIIIlIIlIllll.minX + (lllllllllllllIlIIlllIIIlIIlIllll.maxX - lllllllllllllIlIIlllIIIlIIlIllll.minX) * this.rand.nextFloat();
            final double lllllllllllllIlIIlllIIIlIIlIIIII = lllllllllllllIlIIlllIIIlIIlIllll.minY + (lllllllllllllIlIIlllIIIlIIlIllll.maxY - lllllllllllllIlIIlllIIIlIIlIllll.minY) * this.rand.nextFloat();
            final double lllllllllllllIlIIlllIIIlIIIlllll = lllllllllllllIlIIlllIIIlIIlIllll.minZ + (lllllllllllllIlIIlllIIIlIIlIllll.maxZ - lllllllllllllIlIIlllIIIlIIlIllll.minZ) * this.rand.nextFloat();
            this.worldObj.spawnParticle(EnumParticleTypes.EXPLOSION_LARGE, lllllllllllllIlIIlllIIIlIIlIIIIl, lllllllllllllIlIIlllIIIlIIlIIIII, lllllllllllllIlIIlllIIIlIIIlllll, 0.0, 0.0, 0.0, new int[EntityDragon.lIIIIIllIIIIIl[4]]);
        }
        return lllllllllllllIlIIlllIIIlIIlIlIII;
    }
    
    private static boolean lIllIllIlIllIIl(final int lllllllllllllIlIIlllIIIIIlIlIlIl) {
        return lllllllllllllIlIIlllIIIIIlIlIlIl <= 0;
    }
    
    private static int lIllIllIllIlIIl(final double n, final double n2) {
        return dcmpl(n, n2);
    }
    
    @Override
    protected void onDeathUpdate() {
        this.deathTicks += EntityDragon.lIIIIIllIIIIIl[5];
        if (lIllIllIllIIIll(this.deathTicks, EntityDragon.lIIIIIllIIIIIl[14]) && lIllIllIllIllII(this.deathTicks, EntityDragon.lIIIIIllIIIIIl[15])) {
            final float lllllllllllllIlIIlllIIIIlllIIIII = (this.rand.nextFloat() - 0.5f) * 8.0f;
            final float lllllllllllllIlIIlllIIIIllIlllll = (this.rand.nextFloat() - 0.5f) * 4.0f;
            final float lllllllllllllIlIIlllIIIIllIllllI = (this.rand.nextFloat() - 0.5f) * 8.0f;
            this.worldObj.spawnParticle(EnumParticleTypes.EXPLOSION_HUGE, this.posX + lllllllllllllIlIIlllIIIIlllIIIII, this.posY + 2.0 + lllllllllllllIlIIlllIIIIllIlllll, this.posZ + lllllllllllllIlIIlllIIIIllIllllI, 0.0, 0.0, 0.0, new int[EntityDragon.lIIIIIllIIIIIl[4]]);
        }
        final boolean lllllllllllllIlIIlllIIIIllIlllIl = this.worldObj.getGameRules().getBoolean(EntityDragon.lIIIIIlIlllIlI[EntityDragon.lIIIIIllIIIIIl[16]]);
        if (lIllIllIllIIIIl(this.worldObj.isRemote ? 1 : 0)) {
            if (lIllIllIllIlIll(this.deathTicks, EntityDragon.lIIIIIllIIIIIl[17]) && lIllIllIllIIIIl(this.deathTicks % EntityDragon.lIIIIIllIIIIIl[8]) && lIllIllIlIlllll(lllllllllllllIlIIlllIIIIllIlllIl ? 1 : 0)) {
                int lllllllllllllIlIIlllIIIIllIlllII = EntityDragon.lIIIIIllIIIIIl[18];
                "".length();
                if ((0xC4 ^ 0xC1) == 0x0) {
                    return;
                }
                while (!lIllIllIlIllIIl(lllllllllllllIlIIlllIIIIllIlllII)) {
                    final int lllllllllllllIlIIlllIIIIllIllIll = EntityXPOrb.getXPSplit(lllllllllllllIlIIlllIIIIllIlllII);
                    lllllllllllllIlIIlllIIIIllIlllII -= lllllllllllllIlIIlllIIIIllIllIll;
                    this.worldObj.spawnEntityInWorld(new EntityXPOrb(this.worldObj, this.posX, this.posY, this.posZ, lllllllllllllIlIIlllIIIIllIllIll));
                    "".length();
                }
            }
            if (lIllIllIllIIlII(this.deathTicks, EntityDragon.lIIIIIllIIIIIl[5])) {
                this.worldObj.playBroadcastSound(EntityDragon.lIIIIIllIIIIIl[19], new BlockPos(this), EntityDragon.lIIIIIllIIIIIl[4]);
            }
        }
        this.moveEntity(0.0, 0.10000000149011612, 0.0);
        final float n = this.rotationYaw + 20.0f;
        this.rotationYaw = n;
        this.renderYawOffset = n;
        if (lIllIllIllIIlII(this.deathTicks, EntityDragon.lIIIIIllIIIIIl[15]) && lIllIllIllIIIIl(this.worldObj.isRemote ? 1 : 0)) {
            if (lIllIllIlIlllll(lllllllllllllIlIIlllIIIIllIlllIl ? 1 : 0)) {
                int lllllllllllllIlIIlllIIIIllIllIlI = EntityDragon.lIIIIIllIIIIIl[20];
                "".length();
                if (" ".length() == "  ".length()) {
                    return;
                }
                while (!lIllIllIlIllIIl(lllllllllllllIlIIlllIIIIllIllIlI)) {
                    final int lllllllllllllIlIIlllIIIIllIllIIl = EntityXPOrb.getXPSplit(lllllllllllllIlIIlllIIIIllIllIlI);
                    lllllllllllllIlIIlllIIIIllIllIlI -= lllllllllllllIlIIlllIIIIllIllIIl;
                    this.worldObj.spawnEntityInWorld(new EntityXPOrb(this.worldObj, this.posX, this.posY, this.posZ, lllllllllllllIlIIlllIIIIllIllIIl));
                    "".length();
                }
            }
            this.generatePortal(new BlockPos(this.posX, 64.0, this.posZ));
            this.setDead();
        }
    }
    
    private static boolean lIllIllIllIIlII(final int lllllllllllllIlIIlllIIIIIlllIllI, final int lllllllllllllIlIIlllIIIIIlllIlIl) {
        return lllllllllllllIlIIlllIIIIIlllIllI == lllllllllllllIlIIlllIIIIIlllIlIl;
    }
    
    private static boolean lIllIllIllIlIlI(final Object lllllllllllllIlIIlllIIIIIllIIIlI, final Object lllllllllllllIlIIlllIIIIIllIIIIl) {
        return lllllllllllllIlIIlllIIIIIllIIIlI != lllllllllllllIlIIlllIIIIIllIIIIl;
    }
    
    private static int lIllIllIlIlllIl(final double n, final double n2) {
        return dcmpl(n, n2);
    }
    
    private static boolean lIllIllIllIIlIl(final int lllllllllllllIlIIlllIIIIIlIlIIll) {
        return lllllllllllllIlIIlllIIIIIlIlIIll > 0;
    }
    
    private static String lIllIllIlIIllIl(final String lllllllllllllIlIIlllIIIIlIIIlIIl, final String lllllllllllllIlIIlllIIIIlIIIlIlI) {
        try {
            final SecretKeySpec lllllllllllllIlIIlllIIIIlIIIlllI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIlIIlllIIIIlIIIlIlI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lllllllllllllIlIIlllIIIIlIIIllIl = Cipher.getInstance("Blowfish");
            lllllllllllllIlIIlllIIIIlIIIllIl.init(EntityDragon.lIIIIIllIIIIIl[6], lllllllllllllIlIIlllIIIIlIIIlllI);
            return new String(lllllllllllllIlIIlllIIIIlIIIllIl.doFinal(Base64.getDecoder().decode(lllllllllllllIlIIlllIIIIlIIIlIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIlIIlllIIIIlIIIllII) {
            lllllllllllllIlIIlllIIIIlIIIllII.printStackTrace();
            return null;
        }
    }
    
    private void collideWithEntities(final List<Entity> lllllllllllllIlIIlllIIIlIllIllII) {
        final double lllllllllllllIlIIlllIIIlIlllIIll = (this.dragonPartBody.getEntityBoundingBox().minX + this.dragonPartBody.getEntityBoundingBox().maxX) / 2.0;
        final double lllllllllllllIlIIlllIIIlIlllIIlI = (this.dragonPartBody.getEntityBoundingBox().minZ + this.dragonPartBody.getEntityBoundingBox().maxZ) / 2.0;
        final Exception lllllllllllllIlIIlllIIIlIllIlIII = (Exception)lllllllllllllIlIIlllIIIlIllIllII.iterator();
        "".length();
        if ("   ".length() < 0) {
            return;
        }
        while (!lIllIllIllIIIIl(((Iterator)lllllllllllllIlIIlllIIIlIllIlIII).hasNext() ? 1 : 0)) {
            final Entity lllllllllllllIlIIlllIIIlIlllIIIl = ((Iterator<Entity>)lllllllllllllIlIIlllIIIlIllIlIII).next();
            if (lIllIllIlIlllll((lllllllllllllIlIIlllIIIlIlllIIIl instanceof EntityLivingBase) ? 1 : 0)) {
                final double lllllllllllllIlIIlllIIIlIlllIIII = lllllllllllllIlIIlllIIIlIlllIIIl.posX - lllllllllllllIlIIlllIIIlIlllIIll;
                final double lllllllllllllIlIIlllIIIlIllIllll = lllllllllllllIlIIlllIIIlIlllIIIl.posZ - lllllllllllllIlIIlllIIIlIlllIIlI;
                final double lllllllllllllIlIIlllIIIlIllIlllI = lllllllllllllIlIIlllIIIlIlllIIII * lllllllllllllIlIIlllIIIlIlllIIII + lllllllllllllIlIIlllIIIlIllIllll * lllllllllllllIlIIlllIIIlIllIllll;
                lllllllllllllIlIIlllIIIlIlllIIIl.addVelocity(lllllllllllllIlIIlllIIIlIlllIIII / lllllllllllllIlIIlllIIIlIllIlllI * 4.0, 0.20000000298023224, lllllllllllllIlIIlllIIIlIllIllll / lllllllllllllIlIIlllIIIlIllIlllI * 4.0);
            }
        }
    }
    
    private static int lIllIllIllIIlll(final float n, final float n2) {
        return fcmpg(n, n2);
    }
    
    private static boolean lIllIllIllIIIII(final int lllllllllllllIlIIlllIIIIIlIllIIl) {
        return lllllllllllllIlIIlllIIIIIlIllIIl >= 0;
    }
    
    private static void lIllIllIlIlIlII() {
        (lIIIIIlIlllIlI = new String[EntityDragon.lIIIIIllIIIIIl[12]])[EntityDragon.lIIIIIllIIIIIl[4]] = lIllIllIlIIlIlI("IluCCIdjwtQ=", "pJRgF");
        EntityDragon.lIIIIIlIlllIlI[EntityDragon.lIIIIIllIIIIIl[5]] = lIllIllIlIIlIll("CTUzDg==", "kZWwG");
        EntityDragon.lIIIIIlIlllIlI[EntityDragon.lIIIIIllIIIIIl[6]] = lIllIllIlIIlIlI("B8JAQHRZeJ4=", "TsTmD");
        EntityDragon.lIIIIIlIlllIlI[EntityDragon.lIIIIIllIIIIIl[1]] = lIllIllIlIIlIlI("C6MTkxjgnvY=", "LeMgV");
        EntityDragon.lIIIIIlIlllIlI[EntityDragon.lIIIIIllIIIIIl[7]] = lIllIllIlIIllIl("OTSOo3Fyys0=", "PsRqi");
        EntityDragon.lIIIIIlIlllIlI[EntityDragon.lIIIIIllIIIIIl[8]] = lIllIllIlIIllIl("+6nZ/Z6i3SA=", "JcQyD");
        EntityDragon.lIIIIIlIlllIlI[EntityDragon.lIIIIIllIIIIIl[9]] = lIllIllIlIIlIll("JwocNA==", "PcrSy");
        EntityDragon.lIIIIIlIlllIlI[EntityDragon.lIIIIIllIIIIIl[3]] = lIllIllIlIIllIl("P/zrlUfopwX2KsH/IaYSNdTzJwzddgEh", "WhSCv");
        EntityDragon.lIIIIIlIlllIlI[EntityDragon.lIIIIIllIIIIIl[13]] = lIllIllIlIIlIlI("4JkyDzb2z+vKKWA3w4W0Wg==", "RYvxW");
        EntityDragon.lIIIIIlIlllIlI[EntityDragon.lIIIIIllIIIIIl[16]] = lIllIllIlIIlIll("EBg3IjI4GBU5", "twzMP");
        EntityDragon.lIIIIIlIlllIlI[EntityDragon.lIIIIIllIIIIIl[11]] = lIllIllIlIIlIll("BSs1SAQGIDIUBRolMAkPRiMlCRYE", "hDWfa");
        EntityDragon.lIIIIIlIlllIlI[EntityDragon.lIIIIIllIIIIIl[23]] = lIllIllIlIIlIlI("I5UluLSeR0dETlTtTfc8jSrsNSNDgSCs", "GHBeN");
    }
    
    @Override
    public void onLivingUpdate() {
        if (lIllIllIlIlllll(this.worldObj.isRemote ? 1 : 0)) {
            final float lllllllllllllIlIIlllIIIllllIIIIl = MathHelper.cos(this.animTime * 3.1415927f * 2.0f);
            final float lllllllllllllIlIIlllIIIllllIIIII = MathHelper.cos(this.prevAnimTime * 3.1415927f * 2.0f);
            if (lIllIllIlIllIIl(lIllIllIlIllIll(lllllllllllllIlIIlllIIIllllIIIII, -0.3f)) && lIllIllIllIIIII(lIllIllIlIlllII(lllllllllllllIlIIlllIIIllllIIIIl, -0.3f)) && lIllIllIllIIIIl(this.isSilent() ? 1 : 0)) {
                this.worldObj.playSound(this.posX, this.posY, this.posZ, EntityDragon.lIIIIIlIlllIlI[EntityDragon.lIIIIIllIIIIIl[3]], 5.0f, 0.8f + this.rand.nextFloat() * 0.3f, (boolean)(EntityDragon.lIIIIIllIIIIIl[4] != 0));
            }
        }
        this.prevAnimTime = this.animTime;
        if (lIllIllIlIllIIl(lIllIllIlIllIll(this.getHealth(), 0.0f))) {
            final float lllllllllllllIlIIlllIIIlllIlllll = (this.rand.nextFloat() - 0.5f) * 8.0f;
            final float lllllllllllllIlIIlllIIIlllIllllI = (this.rand.nextFloat() - 0.5f) * 4.0f;
            final float lllllllllllllIlIIlllIIIlllIlllIl = (this.rand.nextFloat() - 0.5f) * 8.0f;
            this.worldObj.spawnParticle(EnumParticleTypes.EXPLOSION_LARGE, this.posX + lllllllllllllIlIIlllIIIlllIlllll, this.posY + 2.0 + lllllllllllllIlIIlllIIIlllIllllI, this.posZ + lllllllllllllIlIIlllIIIlllIlllIl, 0.0, 0.0, 0.0, new int[EntityDragon.lIIIIIllIIIIIl[4]]);
            "".length();
            if (null != null) {
                return;
            }
        }
        else {
            this.updateDragonEnderCrystal();
            float lllllllllllllIlIIlllIIIlllIlllII = 0.2f / (MathHelper.sqrt_double(this.motionX * this.motionX + this.motionZ * this.motionZ) * 10.0f + 1.0f);
            lllllllllllllIlIIlllIIIlllIlllII *= (float)Math.pow(2.0, this.motionY);
            if (lIllIllIlIlllll(this.slowed ? 1 : 0)) {
                this.animTime += lllllllllllllIlIIlllIIIlllIlllII * 0.5f;
                "".length();
                if (" ".length() < 0) {
                    return;
                }
            }
            else {
                this.animTime += lllllllllllllIlIIlllIIIlllIlllII;
            }
            this.rotationYaw = MathHelper.wrapAngleTo180_float(this.rotationYaw);
            if (lIllIllIlIlllll(this.isAIDisabled() ? 1 : 0)) {
                this.animTime = 0.5f;
                "".length();
                if ("   ".length() != "   ".length()) {
                    return;
                }
            }
            else {
                if (lIllIllIllIIIlI(this.ringBufferIndex)) {
                    int lllllllllllllIlIIlllIIIlllIllIll = EntityDragon.lIIIIIllIIIIIl[4];
                    "".length();
                    if (null != null) {
                        return;
                    }
                    while (!lIllIllIllIIIll(lllllllllllllIlIIlllIIIlllIllIll, this.ringBuffer.length)) {
                        this.ringBuffer[lllllllllllllIlIIlllIIIlllIllIll][EntityDragon.lIIIIIllIIIIIl[4]] = this.rotationYaw;
                        this.ringBuffer[lllllllllllllIlIIlllIIIlllIllIll][EntityDragon.lIIIIIllIIIIIl[5]] = this.posY;
                        ++lllllllllllllIlIIlllIIIlllIllIll;
                    }
                }
                final int n = this.ringBufferIndex + EntityDragon.lIIIIIllIIIIIl[5];
                this.ringBufferIndex = n;
                if (lIllIllIllIIlII(n, this.ringBuffer.length)) {
                    this.ringBufferIndex = EntityDragon.lIIIIIllIIIIIl[4];
                }
                this.ringBuffer[this.ringBufferIndex][EntityDragon.lIIIIIllIIIIIl[4]] = this.rotationYaw;
                this.ringBuffer[this.ringBufferIndex][EntityDragon.lIIIIIllIIIIIl[5]] = this.posY;
                if (lIllIllIlIlllll(this.worldObj.isRemote ? 1 : 0)) {
                    if (lIllIllIllIIlIl(this.newPosRotationIncrements)) {
                        final double lllllllllllllIlIIlllIIIlllIllIlI = this.posX + (this.newPosX - this.posX) / this.newPosRotationIncrements;
                        final double lllllllllllllIlIIlllIIIlllIllIIl = this.posY + (this.newPosY - this.posY) / this.newPosRotationIncrements;
                        final double lllllllllllllIlIIlllIIIlllIllIII = this.posZ + (this.newPosZ - this.posZ) / this.newPosRotationIncrements;
                        final double lllllllllllllIlIIlllIIIlllIlIlll = MathHelper.wrapAngleTo180_double(this.newRotationYaw - this.rotationYaw);
                        this.rotationYaw += (float)(lllllllllllllIlIIlllIIIlllIlIlll / this.newPosRotationIncrements);
                        this.rotationPitch += (float)((this.newRotationPitch - this.rotationPitch) / this.newPosRotationIncrements);
                        this.newPosRotationIncrements -= EntityDragon.lIIIIIllIIIIIl[5];
                        this.setPosition(lllllllllllllIlIIlllIIIlllIllIlI, lllllllllllllIlIIlllIIIlllIllIIl, lllllllllllllIlIIlllIIIlllIllIII);
                        this.setRotation(this.rotationYaw, this.rotationPitch);
                        "".length();
                        if ("   ".length() <= ((0x6E ^ 0x23 ^ (0x3A ^ 0x7A)) & (0x1F ^ 0x74 ^ (0x28 ^ 0x4E) ^ -" ".length()))) {
                            return;
                        }
                    }
                }
                else {
                    final double lllllllllllllIlIIlllIIIlllIlIllI = this.targetX - this.posX;
                    double lllllllllllllIlIIlllIIIlllIlIlIl = this.targetY - this.posY;
                    final double lllllllllllllIlIIlllIIIlllIlIlII = this.targetZ - this.posZ;
                    final double lllllllllllllIlIIlllIIIlllIlIIll = lllllllllllllIlIIlllIIIlllIlIllI * lllllllllllllIlIIlllIIIlllIlIllI + lllllllllllllIlIIlllIIIlllIlIlIl * lllllllllllllIlIIlllIIIlllIlIlIl + lllllllllllllIlIIlllIIIlllIlIlII * lllllllllllllIlIIlllIIIlllIlIlII;
                    if (lIllIllIllIIllI(this.target)) {
                        this.targetX = this.target.posX;
                        this.targetZ = this.target.posZ;
                        final double lllllllllllllIlIIlllIIIlllIlIIlI = this.targetX - this.posX;
                        final double lllllllllllllIlIIlllIIIlllIlIIIl = this.targetZ - this.posZ;
                        final double lllllllllllllIlIIlllIIIlllIlIIII = Math.sqrt(lllllllllllllIlIIlllIIIlllIlIIlI * lllllllllllllIlIIlllIIIlllIlIIlI + lllllllllllllIlIIlllIIIlllIlIIIl * lllllllllllllIlIIlllIIIlllIlIIIl);
                        double lllllllllllllIlIIlllIIIlllIIllll = 0.4000000059604645 + lllllllllllllIlIIlllIIIlllIlIIII / 80.0 - 1.0;
                        if (lIllIllIllIIlIl(lIllIllIlIlllIl(lllllllllllllIlIIlllIIIlllIIllll, 10.0))) {
                            lllllllllllllIlIIlllIIIlllIIllll = 10.0;
                        }
                        this.targetY = this.target.getEntityBoundingBox().minY + lllllllllllllIlIIlllIIIlllIIllll;
                        "".length();
                        if (-(0x7C ^ 0x78) > 0) {
                            return;
                        }
                    }
                    else {
                        this.targetX += this.rand.nextGaussian() * 2.0;
                        this.targetZ += this.rand.nextGaussian() * 2.0;
                    }
                    if (!lIllIllIllIIIIl(this.forceNewTarget ? 1 : 0) || !lIllIllIllIIIII(lIllIllIlIllllI(lllllllllllllIlIIlllIIIlllIlIIll, 100.0)) || !lIllIllIlIllIIl(lIllIllIlIlllIl(lllllllllllllIlIIlllIIIlllIlIIll, 22500.0)) || !lIllIllIllIIIIl(this.isCollidedHorizontally ? 1 : 0) || lIllIllIlIlllll(this.isCollidedVertically ? 1 : 0)) {
                        this.setNewTarget();
                    }
                    lllllllllllllIlIIlllIIIlllIlIlIl /= MathHelper.sqrt_double(lllllllllllllIlIIlllIIIlllIlIllI * lllllllllllllIlIIlllIIIlllIlIllI + lllllllllllllIlIIlllIIIlllIlIlII * lllllllllllllIlIIlllIIIlllIlIlII);
                    final float lllllllllllllIlIIlllIIIlllIIlllI = 0.6f;
                    lllllllllllllIlIIlllIIIlllIlIlIl = MathHelper.clamp_double(lllllllllllllIlIIlllIIIlllIlIlIl, -lllllllllllllIlIIlllIIIlllIIlllI, lllllllllllllIlIIlllIIIlllIIlllI);
                    this.motionY += lllllllllllllIlIIlllIIIlllIlIlIl * 0.10000000149011612;
                    this.rotationYaw = MathHelper.wrapAngleTo180_float(this.rotationYaw);
                    final double lllllllllllllIlIIlllIIIlllIIllIl = 180.0 - MathHelper.func_181159_b(lllllllllllllIlIIlllIIIlllIlIllI, lllllllllllllIlIIlllIIIlllIlIlII) * 180.0 / 3.141592653589793;
                    double lllllllllllllIlIIlllIIIlllIIllII = MathHelper.wrapAngleTo180_double(lllllllllllllIlIIlllIIIlllIIllIl - this.rotationYaw);
                    if (lIllIllIllIIlIl(lIllIllIlIlllIl(lllllllllllllIlIIlllIIIlllIIllII, 50.0))) {
                        lllllllllllllIlIIlllIIIlllIIllII = 50.0;
                    }
                    if (lIllIllIllIIIlI(lIllIllIlIllllI(lllllllllllllIlIIlllIIIlllIIllII, -50.0))) {
                        lllllllllllllIlIIlllIIIlllIIllII = -50.0;
                    }
                    final Vec3 lllllllllllllIlIIlllIIIlllIIlIll = new Vec3(this.targetX - this.posX, this.targetY - this.posY, this.targetZ - this.posZ).normalize();
                    final double lllllllllllllIlIIlllIIIlllIIlIlI = -MathHelper.cos(this.rotationYaw * 3.1415927f / 180.0f);
                    final Vec3 lllllllllllllIlIIlllIIIlllIIlIIl = new Vec3(MathHelper.sin(this.rotationYaw * 3.1415927f / 180.0f), this.motionY, lllllllllllllIlIIlllIIIlllIIlIlI).normalize();
                    float lllllllllllllIlIIlllIIIlllIIlIII = ((float)lllllllllllllIlIIlllIIIlllIIlIIl.dotProduct(lllllllllllllIlIIlllIIIlllIIlIll) + 0.5f) / 1.5f;
                    if (lIllIllIllIIIlI(lIllIllIlIllIll(lllllllllllllIlIIlllIIIlllIIlIII, 0.0f))) {
                        lllllllllllllIlIIlllIIIlllIIlIII = 0.0f;
                    }
                    this.randomYawVelocity *= 0.8f;
                    final float lllllllllllllIlIIlllIIIlllIIIlll = MathHelper.sqrt_double(this.motionX * this.motionX + this.motionZ * this.motionZ) * 1.0f + 1.0f;
                    double lllllllllllllIlIIlllIIIlllIIIllI = Math.sqrt(this.motionX * this.motionX + this.motionZ * this.motionZ) * 1.0 + 1.0;
                    if (lIllIllIllIIlIl(lIllIllIlIlllIl(lllllllllllllIlIIlllIIIlllIIIllI, 40.0))) {
                        lllllllllllllIlIIlllIIIlllIIIllI = 40.0;
                    }
                    this.randomYawVelocity += (float)(lllllllllllllIlIIlllIIIlllIIllII * (0.699999988079071 / lllllllllllllIlIIlllIIIlllIIIllI / lllllllllllllIlIIlllIIIlllIIIlll));
                    this.rotationYaw += this.randomYawVelocity * 0.1f;
                    final float lllllllllllllIlIIlllIIIlllIIIlIl = (float)(2.0 / (lllllllllllllIlIIlllIIIlllIIIllI + 1.0));
                    final float lllllllllllllIlIIlllIIIlllIIIlII = 0.06f;
                    this.moveFlying(0.0f, -1.0f, lllllllllllllIlIIlllIIIlllIIIlII * (lllllllllllllIlIIlllIIIlllIIlIII * lllllllllllllIlIIlllIIIlllIIIlIl + (1.0f - lllllllllllllIlIIlllIIIlllIIIlIl)));
                    if (lIllIllIlIlllll(this.slowed ? 1 : 0)) {
                        this.moveEntity(this.motionX * 0.800000011920929, this.motionY * 0.800000011920929, this.motionZ * 0.800000011920929);
                        "".length();
                        if (-(0xF5 ^ 0xBE ^ (0x5D ^ 0x12)) > 0) {
                            return;
                        }
                    }
                    else {
                        this.moveEntity(this.motionX, this.motionY, this.motionZ);
                    }
                    final Vec3 lllllllllllllIlIIlllIIIlllIIIIll = new Vec3(this.motionX, this.motionY, this.motionZ).normalize();
                    float lllllllllllllIlIIlllIIIlllIIIIlI = ((float)lllllllllllllIlIIlllIIIlllIIIIll.dotProduct(lllllllllllllIlIIlllIIIlllIIlIIl) + 1.0f) / 2.0f;
                    lllllllllllllIlIIlllIIIlllIIIIlI = 0.8f + 0.15f * lllllllllllllIlIIlllIIIlllIIIIlI;
                    this.motionX *= lllllllllllllIlIIlllIIIlllIIIIlI;
                    this.motionZ *= lllllllllllllIlIIlllIIIlllIIIIlI;
                    this.motionY *= 0.9100000262260437;
                }
                this.renderYawOffset = this.rotationYaw;
                final EntityDragonPart dragonPartHead = this.dragonPartHead;
                final EntityDragonPart dragonPartHead2 = this.dragonPartHead;
                final float n2 = 3.0f;
                dragonPartHead2.height = n2;
                dragonPartHead.width = n2;
                final EntityDragonPart dragonPartTail1 = this.dragonPartTail1;
                final EntityDragonPart dragonPartTail2 = this.dragonPartTail1;
                final float n3 = 2.0f;
                dragonPartTail2.height = n3;
                dragonPartTail1.width = n3;
                final EntityDragonPart dragonPartTail3 = this.dragonPartTail2;
                final EntityDragonPart dragonPartTail4 = this.dragonPartTail2;
                final float n4 = 2.0f;
                dragonPartTail4.height = n4;
                dragonPartTail3.width = n4;
                final EntityDragonPart dragonPartTail5 = this.dragonPartTail3;
                final EntityDragonPart dragonPartTail6 = this.dragonPartTail3;
                final float n5 = 2.0f;
                dragonPartTail6.height = n5;
                dragonPartTail5.width = n5;
                this.dragonPartBody.height = 3.0f;
                this.dragonPartBody.width = 5.0f;
                this.dragonPartWing1.height = 2.0f;
                this.dragonPartWing1.width = 4.0f;
                this.dragonPartWing2.height = 3.0f;
                this.dragonPartWing2.width = 4.0f;
                final float lllllllllllllIlIIlllIIIlllIIIIIl = (float)(this.getMovementOffsets(EntityDragon.lIIIIIllIIIIIl[8], 1.0f)[EntityDragon.lIIIIIllIIIIIl[5]] - this.getMovementOffsets(EntityDragon.lIIIIIllIIIIIl[11], 1.0f)[EntityDragon.lIIIIIllIIIIIl[5]]) * 10.0f / 180.0f * 3.1415927f;
                final float lllllllllllllIlIIlllIIIlllIIIIII = MathHelper.cos(lllllllllllllIlIIlllIIIlllIIIIIl);
                final float lllllllllllllIlIIlllIIIllIllllll = -MathHelper.sin(lllllllllllllIlIIlllIIIlllIIIIIl);
                final float lllllllllllllIlIIlllIIIllIlllllI = this.rotationYaw * 3.1415927f / 180.0f;
                final float lllllllllllllIlIIlllIIIllIllllIl = MathHelper.sin(lllllllllllllIlIIlllIIIllIlllllI);
                final float lllllllllllllIlIIlllIIIllIllllII = MathHelper.cos(lllllllllllllIlIIlllIIIllIlllllI);
                this.dragonPartBody.onUpdate();
                this.dragonPartBody.setLocationAndAngles(this.posX + lllllllllllllIlIIlllIIIllIllllIl * 0.5f, this.posY, this.posZ - lllllllllllllIlIIlllIIIllIllllII * 0.5f, 0.0f, 0.0f);
                this.dragonPartWing1.onUpdate();
                this.dragonPartWing1.setLocationAndAngles(this.posX + lllllllllllllIlIIlllIIIllIllllII * 4.5f, this.posY + 2.0, this.posZ + lllllllllllllIlIIlllIIIllIllllIl * 4.5f, 0.0f, 0.0f);
                this.dragonPartWing2.onUpdate();
                this.dragonPartWing2.setLocationAndAngles(this.posX - lllllllllllllIlIIlllIIIllIllllII * 4.5f, this.posY + 2.0, this.posZ - lllllllllllllIlIIlllIIIllIllllIl * 4.5f, 0.0f, 0.0f);
                if (lIllIllIllIIIIl(this.worldObj.isRemote ? 1 : 0) && lIllIllIllIIIIl(this.hurtTime)) {
                    this.collideWithEntities(this.worldObj.getEntitiesWithinAABBExcludingEntity(this, this.dragonPartWing1.getEntityBoundingBox().expand(4.0, 2.0, 4.0).offset(0.0, -2.0, 0.0)));
                    this.collideWithEntities(this.worldObj.getEntitiesWithinAABBExcludingEntity(this, this.dragonPartWing2.getEntityBoundingBox().expand(4.0, 2.0, 4.0).offset(0.0, -2.0, 0.0)));
                    this.attackEntitiesInList(this.worldObj.getEntitiesWithinAABBExcludingEntity(this, this.dragonPartHead.getEntityBoundingBox().expand(1.0, 1.0, 1.0)));
                }
                final double[] lllllllllllllIlIIlllIIIllIlllIll = this.getMovementOffsets(EntityDragon.lIIIIIllIIIIIl[8], 1.0f);
                final double[] lllllllllllllIlIIlllIIIllIlllIlI = this.getMovementOffsets(EntityDragon.lIIIIIllIIIIIl[4], 1.0f);
                final float lllllllllllllIlIIlllIIIllIlllIIl = MathHelper.sin(this.rotationYaw * 3.1415927f / 180.0f - this.randomYawVelocity * 0.01f);
                final float lllllllllllllIlIIlllIIIllIlllIII = MathHelper.cos(this.rotationYaw * 3.1415927f / 180.0f - this.randomYawVelocity * 0.01f);
                this.dragonPartHead.onUpdate();
                this.dragonPartHead.setLocationAndAngles(this.posX + lllllllllllllIlIIlllIIIllIlllIIl * 5.5f * lllllllllllllIlIIlllIIIlllIIIIII, this.posY + (lllllllllllllIlIIlllIIIllIlllIlI[EntityDragon.lIIIIIllIIIIIl[5]] - lllllllllllllIlIIlllIIIllIlllIll[EntityDragon.lIIIIIllIIIIIl[5]]) * 1.0 + lllllllllllllIlIIlllIIIllIllllll * 5.5f, this.posZ - lllllllllllllIlIIlllIIIllIlllIII * 5.5f * lllllllllllllIlIIlllIIIlllIIIIII, 0.0f, 0.0f);
                int lllllllllllllIlIIlllIIIllIllIlll = EntityDragon.lIIIIIllIIIIIl[4];
                "".length();
                if (-" ".length() != -" ".length()) {
                    return;
                }
                while (!lIllIllIllIIIll(lllllllllllllIlIIlllIIIllIllIlll, EntityDragon.lIIIIIllIIIIIl[1])) {
                    EntityDragonPart lllllllllllllIlIIlllIIIllIllIllI = null;
                    if (lIllIllIllIIIIl(lllllllllllllIlIIlllIIIllIllIlll)) {
                        lllllllllllllIlIIlllIIIllIllIllI = this.dragonPartTail1;
                    }
                    if (lIllIllIllIIlII(lllllllllllllIlIIlllIIIllIllIlll, EntityDragon.lIIIIIllIIIIIl[5])) {
                        lllllllllllllIlIIlllIIIllIllIllI = this.dragonPartTail2;
                    }
                    if (lIllIllIllIIlII(lllllllllllllIlIIlllIIIllIllIlll, EntityDragon.lIIIIIllIIIIIl[6])) {
                        lllllllllllllIlIIlllIIIllIllIllI = this.dragonPartTail3;
                    }
                    final double[] lllllllllllllIlIIlllIIIllIllIlIl = this.getMovementOffsets(EntityDragon.lIIIIIllIIIIIl[12] + lllllllllllllIlIIlllIIIllIllIlll * EntityDragon.lIIIIIllIIIIIl[6], 1.0f);
                    final float lllllllllllllIlIIlllIIIllIllIlII = this.rotationYaw * 3.1415927f / 180.0f + this.simplifyAngle(lllllllllllllIlIIlllIIIllIllIlIl[EntityDragon.lIIIIIllIIIIIl[4]] - lllllllllllllIlIIlllIIIllIlllIll[EntityDragon.lIIIIIllIIIIIl[4]]) * 3.1415927f / 180.0f * 1.0f;
                    final float lllllllllllllIlIIlllIIIllIllIIll = MathHelper.sin(lllllllllllllIlIIlllIIIllIllIlII);
                    final float lllllllllllllIlIIlllIIIllIllIIlI = MathHelper.cos(lllllllllllllIlIIlllIIIllIllIlII);
                    final float lllllllllllllIlIIlllIIIllIllIIIl = 1.5f;
                    final float lllllllllllllIlIIlllIIIllIllIIII = (lllllllllllllIlIIlllIIIllIllIlll + EntityDragon.lIIIIIllIIIIIl[5]) * 2.0f;
                    lllllllllllllIlIIlllIIIllIllIllI.onUpdate();
                    lllllllllllllIlIIlllIIIllIllIllI.setLocationAndAngles(this.posX - (lllllllllllllIlIIlllIIIllIllllIl * lllllllllllllIlIIlllIIIllIllIIIl + lllllllllllllIlIIlllIIIllIllIIll * lllllllllllllIlIIlllIIIllIllIIII) * lllllllllllllIlIIlllIIIlllIIIIII, this.posY + (lllllllllllllIlIIlllIIIllIllIlIl[EntityDragon.lIIIIIllIIIIIl[5]] - lllllllllllllIlIIlllIIIllIlllIll[EntityDragon.lIIIIIllIIIIIl[5]]) * 1.0 - (lllllllllllllIlIIlllIIIllIllIIII + lllllllllllllIlIIlllIIIllIllIIIl) * lllllllllllllIlIIlllIIIllIllllll + 1.5, this.posZ + (lllllllllllllIlIIlllIIIllIllllII * lllllllllllllIlIIlllIIIllIllIIIl + lllllllllllllIlIIlllIIIllIllIIlI * lllllllllllllIlIIlllIIIllIllIIII) * lllllllllllllIlIIlllIIIlllIIIIII, 0.0f, 0.0f);
                    ++lllllllllllllIlIIlllIIIllIllIlll;
                }
                if (lIllIllIllIIIIl(this.worldObj.isRemote ? 1 : 0)) {
                    this.slowed = (this.destroyBlocksInAABB(this.dragonPartHead.getEntityBoundingBox()) | this.destroyBlocksInAABB(this.dragonPartBody.getEntityBoundingBox()));
                }
            }
        }
    }
    
    static {
        lIllIllIlIlIlll();
        lIllIllIlIlIlII();
    }
    
    private static int lIllIllIlIllIll(final float n, final float n2) {
        return fcmpg(n, n2);
    }
    
    private void updateDragonEnderCrystal() {
        if (lIllIllIllIIllI(this.healingEnderCrystal)) {
            if (lIllIllIlIlllll(this.healingEnderCrystal.isDead ? 1 : 0)) {
                if (lIllIllIllIIIIl(this.worldObj.isRemote ? 1 : 0)) {
                    this.attackEntityFromPart(this.dragonPartHead, DamageSource.setExplosionSource(null), 10.0f);
                    "".length();
                }
                this.healingEnderCrystal = null;
                "".length();
                if (((0x35 ^ 0x69) & ~(0xC2 ^ 0x9E)) != 0x0) {
                    return;
                }
            }
            else if (lIllIllIllIIIIl(this.ticksExisted % EntityDragon.lIIIIIllIIIIIl[11]) && lIllIllIllIIIlI(lIllIllIllIIlll(this.getHealth(), this.getMaxHealth()))) {
                this.setHealth(this.getHealth() + 1.0f);
            }
        }
        if (lIllIllIllIIIIl(this.rand.nextInt(EntityDragon.lIIIIIllIIIIIl[11]))) {
            final float lllllllllllllIlIIlllIIIllIIIllII = 32.0f;
            final List<EntityEnderCrystal> lllllllllllllIlIIlllIIIllIIIlIll = this.worldObj.getEntitiesWithinAABB((Class<? extends EntityEnderCrystal>)EntityEnderCrystal.class, this.getEntityBoundingBox().expand(lllllllllllllIlIIlllIIIllIIIllII, lllllllllllllIlIIlllIIIllIIIllII, lllllllllllllIlIIlllIIIllIIIllII));
            EntityEnderCrystal lllllllllllllIlIIlllIIIllIIIlIlI = null;
            double lllllllllllllIlIIlllIIIllIIIlIIl = Double.MAX_VALUE;
            final boolean lllllllllllllIlIIlllIIIllIIIIIII = (boolean)lllllllllllllIlIIlllIIIllIIIlIll.iterator();
            "".length();
            if (((0x2B ^ 0x12) & ~(0x4A ^ 0x73)) > " ".length()) {
                return;
            }
            while (!lIllIllIllIIIIl(((Iterator)lllllllllllllIlIIlllIIIllIIIIIII).hasNext() ? 1 : 0)) {
                final EntityEnderCrystal lllllllllllllIlIIlllIIIllIIIlIII = ((Iterator<EntityEnderCrystal>)lllllllllllllIlIIlllIIIllIIIIIII).next();
                final double lllllllllllllIlIIlllIIIllIIIIlll = lllllllllllllIlIIlllIIIllIIIlIII.getDistanceSqToEntity(this);
                if (lIllIllIllIIIlI(lIllIllIllIlIII(lllllllllllllIlIIlllIIIllIIIIlll, lllllllllllllIlIIlllIIIllIIIlIIl))) {
                    lllllllllllllIlIIlllIIIllIIIlIIl = lllllllllllllIlIIlllIIIllIIIIlll;
                    lllllllllllllIlIIlllIIIllIIIlIlI = lllllllllllllIlIIlllIIIllIIIlIII;
                }
            }
            this.healingEnderCrystal = lllllllllllllIlIIlllIIIllIIIlIlI;
        }
    }
    
    public double[] getMovementOffsets(final int lllllllllllllIlIIlllIIlIIIIIlIll, float lllllllllllllIlIIlllIIlIIIIIIIlI) {
        if (lIllIllIlIllIIl(lIllIllIlIllIII(this.getHealth(), 0.0f))) {
            lllllllllllllIlIIlllIIlIIIIIIIlI = 0.0f;
        }
        lllllllllllllIlIIlllIIlIIIIIIIlI = 1.0f - lllllllllllllIlIIlllIIlIIIIIIIlI;
        final int lllllllllllllIlIIlllIIlIIIIIlIIl = this.ringBufferIndex - lllllllllllllIlIIlllIIlIIIIIlIll * EntityDragon.lIIIIIllIIIIIl[5] & EntityDragon.lIIIIIllIIIIIl[10];
        final int lllllllllllllIlIIlllIIlIIIIIlIII = this.ringBufferIndex - lllllllllllllIlIIlllIIlIIIIIlIll * EntityDragon.lIIIIIllIIIIIl[5] - EntityDragon.lIIIIIllIIIIIl[5] & EntityDragon.lIIIIIllIIIIIl[10];
        final double[] lllllllllllllIlIIlllIIlIIIIIIlll = new double[EntityDragon.lIIIIIllIIIIIl[1]];
        double lllllllllllllIlIIlllIIlIIIIIIllI = this.ringBuffer[lllllllllllllIlIIlllIIlIIIIIlIIl][EntityDragon.lIIIIIllIIIIIl[4]];
        double lllllllllllllIlIIlllIIlIIIIIIlIl = MathHelper.wrapAngleTo180_double(this.ringBuffer[lllllllllllllIlIIlllIIlIIIIIlIII][EntityDragon.lIIIIIllIIIIIl[4]] - lllllllllllllIlIIlllIIlIIIIIIllI);
        lllllllllllllIlIIlllIIlIIIIIIlll[EntityDragon.lIIIIIllIIIIIl[4]] = lllllllllllllIlIIlllIIlIIIIIIllI + lllllllllllllIlIIlllIIlIIIIIIlIl * lllllllllllllIlIIlllIIlIIIIIIIlI;
        lllllllllllllIlIIlllIIlIIIIIIllI = this.ringBuffer[lllllllllllllIlIIlllIIlIIIIIlIIl][EntityDragon.lIIIIIllIIIIIl[5]];
        lllllllllllllIlIIlllIIlIIIIIIlIl = this.ringBuffer[lllllllllllllIlIIlllIIlIIIIIlIII][EntityDragon.lIIIIIllIIIIIl[5]] - lllllllllllllIlIIlllIIlIIIIIIllI;
        lllllllllllllIlIIlllIIlIIIIIIlll[EntityDragon.lIIIIIllIIIIIl[5]] = lllllllllllllIlIIlllIIlIIIIIIllI + lllllllllllllIlIIlllIIlIIIIIIlIl * lllllllllllllIlIIlllIIlIIIIIIIlI;
        lllllllllllllIlIIlllIIlIIIIIIlll[EntityDragon.lIIIIIllIIIIIl[6]] = this.ringBuffer[lllllllllllllIlIIlllIIlIIIIIlIIl][EntityDragon.lIIIIIllIIIIIl[6]] + (this.ringBuffer[lllllllllllllIlIIlllIIlIIIIIlIII][EntityDragon.lIIIIIllIIIIIl[6]] - this.ringBuffer[lllllllllllllIlIIlllIIlIIIIIlIIl][EntityDragon.lIIIIIllIIIIIl[6]]) * lllllllllllllIlIIlllIIlIIIIIIIlI;
        return lllllllllllllIlIIlllIIlIIIIIIlll;
    }
    
    private static boolean lIllIllIllIllll(final int lllllllllllllIlIIlllIIIIIllIlllI, final int lllllllllllllIlIIlllIIIIIllIllIl) {
        return lllllllllllllIlIIlllIIIIIllIlllI < lllllllllllllIlIIlllIIIIIllIllIl;
    }
    
    @Override
    protected void despawnEntity() {
    }
}
