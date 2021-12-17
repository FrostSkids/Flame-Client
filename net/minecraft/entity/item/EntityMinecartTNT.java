// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.entity.item;

import net.minecraft.entity.projectile.EntityArrow;
import net.minecraft.item.ItemStack;
import net.minecraft.util.DamageSource;
import net.minecraft.entity.Entity;
import net.minecraft.init.Blocks;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.nbt.NBTTagCompound;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import net.minecraft.block.BlockRailBase;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.Explosion;

public class EntityMinecartTNT extends EntityMinecart
{
    private /* synthetic */ int minecartTNTFuse;
    private static final /* synthetic */ String[] lIllllIlIlIIIl;
    private static final /* synthetic */ int[] lIllllIlIlIllI;
    
    static {
        lIIIIlIIlIIIllII();
        lIIIIlIIlIIIIlII();
    }
    
    private static void lIIIIlIIlIIIIlII() {
        (lIllllIlIlIIIl = new String[EntityMinecartTNT.lIllllIlIlIllI[9]])[EntityMinecartTNT.lIllllIlIlIllI[2]] = lIIIIlIIlIIIIIII("V0j4GQEK0aVjrHMey0ar2w==", "ItwHR");
        EntityMinecartTNT.lIllllIlIlIIIl[EntityMinecartTNT.lIllllIlIlIllI[1]] = lIIIIlIIlIIIIIIl("CudVjmXBc2NEJco+Kw4d/g==", "kmJXQ");
        EntityMinecartTNT.lIllllIlIlIIIl[EntityMinecartTNT.lIllllIlIlIllI[5]] = lIIIIlIIlIIIIIII("kjj3rs63cDQ=", "BgZXj");
        EntityMinecartTNT.lIllllIlIlIIIl[EntityMinecartTNT.lIllllIlIlIllI[7]] = lIIIIlIIlIIIIIll("ER8sLRI2NA==", "EQxkg");
        EntityMinecartTNT.lIllllIlIlIIIl[EntityMinecartTNT.lIllllIlIlIllI[8]] = lIIIIlIIlIIIIIll("FS0+NR8yBg==", "Acjsj");
    }
    
    @Override
    public boolean verifyExplosion(final Explosion llllllllllllIllllIlIIlIlIIIIllIl, final World llllllllllllIllllIlIIlIlIIIlIIlI, final BlockPos llllllllllllIllllIlIIlIlIIIIlIll, final IBlockState llllllllllllIllllIlIIlIlIIIlIIII, final float llllllllllllIllllIlIIlIlIIIIlIIl) {
        int verifyExplosion;
        if (!lIIIIlIIlIIlIIII(this.isIgnited() ? 1 : 0) || (lIIIIlIIlIIIllll(BlockRailBase.isRailBlock(llllllllllllIllllIlIIlIlIIIlIIII) ? 1 : 0) && lIIIIlIIlIIIllll(BlockRailBase.isRailBlock(llllllllllllIllllIlIIlIlIIIlIIlI, llllllllllllIllllIlIIlIlIIIIlIll.up()) ? 1 : 0))) {
            verifyExplosion = (super.verifyExplosion(llllllllllllIllllIlIIlIlIIIIllIl, llllllllllllIllllIlIIlIlIIIlIIlI, llllllllllllIllllIlIIlIlIIIIlIll, llllllllllllIllllIlIIlIlIIIlIIII, llllllllllllIllllIlIIlIlIIIIlIIl) ? 1 : 0);
            "".length();
            if (-" ".length() >= "  ".length()) {
                return ((0x24 ^ 0x2E ^ (0x48 ^ 0x52)) & (149 + 15 - 135 + 129 ^ 112 + 25 - 57 + 62 ^ -" ".length())) != 0x0;
            }
        }
        else {
            verifyExplosion = EntityMinecartTNT.lIllllIlIlIllI[2];
        }
        return verifyExplosion != 0;
    }
    
    private static boolean lIIIIlIIlIIllIIl(final int llllllllllllIllllIlIIlIIllIIIIII, final int llllllllllllIllllIlIIlIIlIllllll) {
        return llllllllllllIllllIlIIlIIllIIIIII > llllllllllllIllllIlIIlIIlIllllll;
    }
    
    private static String lIIIIlIIlIIIIIIl(final String llllllllllllIllllIlIIlIIllllIlIl, final String llllllllllllIllllIlIIlIIllllIIlI) {
        try {
            final SecretKeySpec llllllllllllIllllIlIIlIIlllllIII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIllllIlIIlIIllllIIlI.getBytes(StandardCharsets.UTF_8)), EntityMinecartTNT.lIllllIlIlIllI[10]), "DES");
            final Cipher llllllllllllIllllIlIIlIIllllIlll = Cipher.getInstance("DES");
            llllllllllllIllllIlIIlIIllllIlll.init(EntityMinecartTNT.lIllllIlIlIllI[5], llllllllllllIllllIlIIlIIlllllIII);
            return new String(llllllllllllIllllIlIIlIIllllIlll.doFinal(Base64.getDecoder().decode(llllllllllllIllllIlIIlIIllllIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIllllIlIIlIIllllIllI) {
            llllllllllllIllllIlIIlIIllllIllI.printStackTrace();
            return null;
        }
    }
    
    @Override
    public void fall(final float llllllllllllIllllIlIIlIlIlIIIlII, final float llllllllllllIllllIlIIlIlIlIIIlll) {
        if (lIIIIlIIlIIlIIIl(lIIIIlIIlIIlIllI(llllllllllllIllllIlIIlIlIlIIIlII, 3.0f))) {
            final float llllllllllllIllllIlIIlIlIlIIIllI = llllllllllllIllllIlIIlIlIlIIIlII / 10.0f;
            this.explodeCart(llllllllllllIllllIlIIlIlIlIIIllI * llllllllllllIllllIlIIlIlIlIIIllI);
        }
        super.fall(llllllllllllIllllIlIIlIlIlIIIlII, llllllllllllIllllIlIIlIlIlIIIlll);
    }
    
    @Override
    protected void writeEntityToNBT(final NBTTagCompound llllllllllllIllllIlIIlIIllllllll) {
        super.writeEntityToNBT(llllllllllllIllllIlIIlIIllllllll);
        llllllllllllIllllIlIIlIIllllllll.setInteger(EntityMinecartTNT.lIllllIlIlIIIl[EntityMinecartTNT.lIllllIlIlIllI[8]], this.minecartTNTFuse);
    }
    
    @Override
    protected void readEntityFromNBT(final NBTTagCompound llllllllllllIllllIlIIlIlIIIIIlIl) {
        super.readEntityFromNBT(llllllllllllIllllIlIIlIlIIIIIlIl);
        if (lIIIIlIIlIIlIIII(llllllllllllIllllIlIIlIlIIIIIlIl.hasKey(EntityMinecartTNT.lIllllIlIlIIIl[EntityMinecartTNT.lIllllIlIlIllI[5]], EntityMinecartTNT.lIllllIlIlIllI[6]) ? 1 : 0)) {
            this.minecartTNTFuse = llllllllllllIllllIlIIlIlIIIIIlIl.getInteger(EntityMinecartTNT.lIllllIlIlIIIl[EntityMinecartTNT.lIllllIlIlIllI[7]]);
        }
    }
    
    @Override
    public void onUpdate() {
        super.onUpdate();
        if (lIIIIlIIlIIIlllI(this.minecartTNTFuse)) {
            this.minecartTNTFuse -= EntityMinecartTNT.lIllllIlIlIllI[1];
            this.worldObj.spawnParticle(EnumParticleTypes.SMOKE_NORMAL, this.posX, this.posY + 0.5, this.posZ, 0.0, 0.0, 0.0, new int[EntityMinecartTNT.lIllllIlIlIllI[2]]);
            "".length();
            if (((0xF0 ^ 0xC0) & ~(0x95 ^ 0xA5)) != 0x0) {
                return;
            }
        }
        else if (lIIIIlIIlIIIllll(this.minecartTNTFuse)) {
            this.explodeCart(this.motionX * this.motionX + this.motionZ * this.motionZ);
        }
        if (lIIIIlIIlIIlIIII(this.isCollidedHorizontally ? 1 : 0)) {
            final double llllllllllllIllllIlIIlIlIlllIIIl = this.motionX * this.motionX + this.motionZ * this.motionZ;
            if (lIIIIlIIlIIlIIIl(lIIIIlIIlIIIllIl(llllllllllllIllllIlIIlIlIlllIIIl, 0.009999999776482582))) {
                this.explodeCart(llllllllllllIllllIlIIlIlIlllIIIl);
            }
        }
    }
    
    @Override
    public IBlockState getDefaultDisplayTile() {
        return Blocks.tnt.getDefaultState();
    }
    
    private static boolean lIIIIlIIlIIlIIIl(final int llllllllllllIllllIlIIlIIlIlllIIl) {
        return llllllllllllIllllIlIIlIIlIlllIIl >= 0;
    }
    
    private static int lIIIIlIIlIIIllIl(final double n, final double n2) {
        return dcmpl(n, n2);
    }
    
    @Override
    public void handleStatusUpdate(final byte llllllllllllIllllIlIIlIlIIllIIll) {
        if (lIIIIlIIlIIllIII(llllllllllllIllllIlIIlIlIIllIIll, EntityMinecartTNT.lIllllIlIlIllI[3])) {
            this.ignite();
            "".length();
            if (-"  ".length() > 0) {
                return;
            }
        }
        else {
            super.handleStatusUpdate(llllllllllllIllllIlIIlIlIIllIIll);
        }
    }
    
    @Override
    public void onActivatorRailPass(final int llllllllllllIllllIlIIlIlIIlllllI, final int llllllllllllIllllIlIIlIlIIllllIl, final int llllllllllllIllllIlIIlIlIIllllII, final boolean llllllllllllIllllIlIIlIlIIlllIll) {
        if (lIIIIlIIlIIlIIII(llllllllllllIllllIlIIlIlIIlllIll ? 1 : 0) && lIIIIlIIlIIlIlll(this.minecartTNTFuse)) {
            this.ignite();
        }
    }
    
    private static int lIIIIlIIlIIlIlII(final double n, final double n2) {
        return dcmpl(n, n2);
    }
    
    public void ignite() {
        this.minecartTNTFuse = EntityMinecartTNT.lIllllIlIlIllI[4];
        if (lIIIIlIIlIIIllll(this.worldObj.isRemote ? 1 : 0)) {
            this.worldObj.setEntityState(this, (byte)EntityMinecartTNT.lIllllIlIlIllI[3]);
            if (lIIIIlIIlIIIllll(this.isSilent() ? 1 : 0)) {
                this.worldObj.playSoundAtEntity(this, EntityMinecartTNT.lIllllIlIlIIIl[EntityMinecartTNT.lIllllIlIlIllI[1]], 1.0f, 1.0f);
            }
        }
    }
    
    private static int lIIIIlIIlIIlIllI(final float n, final float n2) {
        return fcmpl(n, n2);
    }
    
    private static String lIIIIlIIlIIIIIll(String llllllllllllIllllIlIIlIIlllIIIII, final String llllllllllllIllllIlIIlIIllIlllll) {
        llllllllllllIllllIlIIlIIlllIIIII = new String(Base64.getDecoder().decode(llllllllllllIllllIlIIlIIlllIIIII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder llllllllllllIllllIlIIlIIlllIIIll = new StringBuilder();
        final char[] llllllllllllIllllIlIIlIIlllIIIlI = llllllllllllIllllIlIIlIIllIlllll.toCharArray();
        int llllllllllllIllllIlIIlIIlllIIIIl = EntityMinecartTNT.lIllllIlIlIllI[2];
        final boolean llllllllllllIllllIlIIlIIllIllIll = (Object)llllllllllllIllllIlIIlIIlllIIIII.toCharArray();
        final Exception llllllllllllIllllIlIIlIIllIllIlI = (Exception)llllllllllllIllllIlIIlIIllIllIll.length;
        int llllllllllllIllllIlIIlIIllIllIIl = EntityMinecartTNT.lIllllIlIlIllI[2];
        while (lIIIIlIIlIIllIlI(llllllllllllIllllIlIIlIIllIllIIl, (int)llllllllllllIllllIlIIlIIllIllIlI)) {
            final char llllllllllllIllllIlIIlIIlllIIllI = llllllllllllIllllIlIIlIIllIllIll[llllllllllllIllllIlIIlIIllIllIIl];
            llllllllllllIllllIlIIlIIlllIIIll.append((char)(llllllllllllIllllIlIIlIIlllIIllI ^ llllllllllllIllllIlIIlIIlllIIIlI[llllllllllllIllllIlIIlIIlllIIIIl % llllllllllllIllllIlIIlIIlllIIIlI.length]));
            "".length();
            ++llllllllllllIllllIlIIlIIlllIIIIl;
            ++llllllllllllIllllIlIIlIIllIllIIl;
            "".length();
            if ((0xBC ^ 0xB8) <= 0) {
                return null;
            }
        }
        return String.valueOf(llllllllllllIllllIlIIlIIlllIIIll);
    }
    
    public EntityMinecartTNT(final World llllllllllllIllllIlIIlIlIlllllll, final double llllllllllllIllllIlIIlIlIllllllI, final double llllllllllllIllllIlIIlIlIllllIII, final double llllllllllllIllllIlIIlIlIlllllII) {
        super(llllllllllllIllllIlIIlIlIlllllll, llllllllllllIllllIlIIlIlIllllllI, llllllllllllIllllIlIIlIlIllllIII, llllllllllllIllllIlIIlIlIlllllII);
        this.minecartTNTFuse = EntityMinecartTNT.lIllllIlIlIllI[0];
    }
    
    private static boolean lIIIIlIIlIIIllll(final int llllllllllllIllllIlIIlIIlIlllIll) {
        return llllllllllllIllllIlIIlIIlIlllIll == 0;
    }
    
    private static int lIIIIlIIlIIlIIll(final double n, final double n2) {
        return dcmpl(n, n2);
    }
    
    public boolean isIgnited() {
        if (lIIIIlIIlIIllIIl(this.minecartTNTFuse, EntityMinecartTNT.lIllllIlIlIllI[0])) {
            return EntityMinecartTNT.lIllllIlIlIllI[1] != 0;
        }
        return EntityMinecartTNT.lIllllIlIlIllI[2] != 0;
    }
    
    private static boolean lIIIIlIIlIIlIIII(final int llllllllllllIllllIlIIlIIlIllllIl) {
        return llllllllllllIllllIlIIlIIlIllllIl != 0;
    }
    
    protected void explodeCart(final double llllllllllllIllllIlIIlIlIlIlIIlI) {
        if (lIIIIlIIlIIIllll(this.worldObj.isRemote ? 1 : 0)) {
            double llllllllllllIllllIlIIlIlIlIlIIIl = Math.sqrt(llllllllllllIllllIlIIlIlIlIlIIlI);
            if (lIIIIlIIlIIIlllI(lIIIIlIIlIIlIlII(llllllllllllIllllIlIIlIlIlIlIIIl, 5.0))) {
                llllllllllllIllllIlIIlIlIlIlIIIl = 5.0;
            }
            this.worldObj.createExplosion(this, this.posX, this.posY, this.posZ, (float)(4.0 + this.rand.nextDouble() * 1.5 * llllllllllllIllllIlIIlIlIlIlIIIl), (boolean)(EntityMinecartTNT.lIllllIlIlIllI[1] != 0));
            "".length();
            this.setDead();
        }
    }
    
    private static boolean lIIIIlIIlIIllIII(final int llllllllllllIllllIlIIlIIllIIlIII, final int llllllllllllIllllIlIIlIIllIIIlll) {
        return llllllllllllIllllIlIIlIIllIIlIII == llllllllllllIllllIlIIlIIllIIIlll;
    }
    
    @Override
    public EnumMinecartType getMinecartType() {
        return EnumMinecartType.TNT;
    }
    
    private static boolean lIIIIlIIlIIllIlI(final int llllllllllllIllllIlIIlIIllIIIlII, final int llllllllllllIllllIlIIlIIllIIIIll) {
        return llllllllllllIllllIlIIlIIllIIIlII < llllllllllllIllllIlIIlIIllIIIIll;
    }
    
    private static void lIIIIlIIlIIIllII() {
        (lIllllIlIlIllI = new int[11])[0] = -" ".length();
        EntityMinecartTNT.lIllllIlIlIllI[1] = " ".length();
        EntityMinecartTNT.lIllllIlIlIllI[2] = ((0x32 ^ 0x49 ^ (0x69 ^ 0x17)) & (0x43 ^ 0x46 ^ ((0x1A ^ 0x3F) & ~(0xE7 ^ 0xC2)) ^ -" ".length()));
        EntityMinecartTNT.lIllllIlIlIllI[3] = (0xDF ^ 0x8F ^ (0x39 ^ 0x63));
        EntityMinecartTNT.lIllllIlIlIllI[4] = (0xC4 ^ 0x9E ^ (0x8E ^ 0x84));
        EntityMinecartTNT.lIllllIlIlIllI[5] = "  ".length();
        EntityMinecartTNT.lIllllIlIlIllI[6] = (0x33 ^ 0x50);
        EntityMinecartTNT.lIllllIlIlIllI[7] = "   ".length();
        EntityMinecartTNT.lIllllIlIlIllI[8] = (0xA ^ 0xE);
        EntityMinecartTNT.lIllllIlIlIllI[9] = (0x1 ^ 0x51 ^ (0xEA ^ 0xBF));
        EntityMinecartTNT.lIllllIlIlIllI[10] = (((0xAC ^ 0xB2) & ~(0x4D ^ 0x53)) ^ (0x9F ^ 0x97));
    }
    
    private static boolean lIIIIlIIlIIlIlll(final int llllllllllllIllllIlIIlIIlIllIlll) {
        return llllllllllllIllllIlIIlIIlIllIlll < 0;
    }
    
    private static String lIIIIlIIlIIIIIII(final String llllllllllllIllllIlIIlIIllIlIIII, final String llllllllllllIllllIlIIlIIllIIllIl) {
        try {
            final SecretKeySpec llllllllllllIllllIlIIlIIllIlIIll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIllllIlIIlIIllIIllIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher llllllllllllIllllIlIIlIIllIlIIlI = Cipher.getInstance("Blowfish");
            llllllllllllIllllIlIIlIIllIlIIlI.init(EntityMinecartTNT.lIllllIlIlIllI[5], llllllllllllIllllIlIIlIIllIlIIll);
            return new String(llllllllllllIllllIlIIlIIllIlIIlI.doFinal(Base64.getDecoder().decode(llllllllllllIllllIlIIlIIllIlIIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIllllIlIIlIIllIlIIIl) {
            llllllllllllIllllIlIIlIIllIlIIIl.printStackTrace();
            return null;
        }
    }
    
    @Override
    public float getExplosionResistance(final Explosion llllllllllllIllllIlIIlIlIIlIIIll, final World llllllllllllIllllIlIIlIlIIIlllIl, final BlockPos llllllllllllIllllIlIIlIlIIIlllII, final IBlockState llllllllllllIllllIlIIlIlIIlIIIII) {
        float explosionResistance;
        if (!lIIIIlIIlIIlIIII(this.isIgnited() ? 1 : 0) || (lIIIIlIIlIIIllll(BlockRailBase.isRailBlock(llllllllllllIllllIlIIlIlIIlIIIII) ? 1 : 0) && lIIIIlIIlIIIllll(BlockRailBase.isRailBlock(llllllllllllIllllIlIIlIlIIIlllIl, llllllllllllIllllIlIIlIlIIIlllII.up()) ? 1 : 0))) {
            explosionResistance = super.getExplosionResistance(llllllllllllIllllIlIIlIlIIlIIIll, llllllllllllIllllIlIIlIlIIIlllIl, llllllllllllIllllIlIIlIlIIIlllII, llllllllllllIllllIlIIlIlIIlIIIII);
            "".length();
            if ((0xC2 ^ 0xC6) == -" ".length()) {
                return 0.0f;
            }
        }
        else {
            explosionResistance = 0.0f;
        }
        return explosionResistance;
    }
    
    public int getFuseTicks() {
        return this.minecartTNTFuse;
    }
    
    @Override
    public void killMinecart(final DamageSource llllllllllllIllllIlIIlIlIlIllIII) {
        super.killMinecart(llllllllllllIllllIlIIlIlIlIllIII);
        final double llllllllllllIllllIlIIlIlIlIllIlI = this.motionX * this.motionX + this.motionZ * this.motionZ;
        if (lIIIIlIIlIIIllll(llllllllllllIllllIlIIlIlIlIllIII.isExplosion() ? 1 : 0) && lIIIIlIIlIIlIIII(this.worldObj.getGameRules().getBoolean(EntityMinecartTNT.lIllllIlIlIIIl[EntityMinecartTNT.lIllllIlIlIllI[2]]) ? 1 : 0)) {
            this.entityDropItem(new ItemStack(Blocks.tnt, EntityMinecartTNT.lIllllIlIlIllI[1]), 0.0f);
            "".length();
        }
        if (!lIIIIlIIlIIIllll(llllllllllllIllllIlIIlIlIlIllIII.isFireDamage() ? 1 : 0) || !lIIIIlIIlIIIllll(llllllllllllIllllIlIIlIlIlIllIII.isExplosion() ? 1 : 0) || lIIIIlIIlIIlIIIl(lIIIIlIIlIIlIIll(llllllllllllIllllIlIIlIlIlIllIlI, 0.009999999776482582))) {
            this.explodeCart(llllllllllllIllllIlIIlIlIlIllIlI);
        }
    }
    
    private static boolean lIIIIlIIlIIIlllI(final int llllllllllllIllllIlIIlIIlIllIlIl) {
        return llllllllllllIllllIlIIlIIlIllIlIl > 0;
    }
    
    @Override
    public boolean attackEntityFrom(final DamageSource llllllllllllIllllIlIIlIlIllIIIll, final float llllllllllllIllllIlIIlIlIllIIIlI) {
        final Entity llllllllllllIllllIlIIlIlIllIIllI = llllllllllllIllllIlIIlIlIllIIIll.getSourceOfDamage();
        if (lIIIIlIIlIIlIIII((llllllllllllIllllIlIIlIlIllIIllI instanceof EntityArrow) ? 1 : 0)) {
            final EntityArrow llllllllllllIllllIlIIlIlIllIIlIl = (EntityArrow)llllllllllllIllllIlIIlIlIllIIllI;
            if (lIIIIlIIlIIlIIII(llllllllllllIllllIlIIlIlIllIIlIl.isBurning() ? 1 : 0)) {
                this.explodeCart(llllllllllllIllllIlIIlIlIllIIlIl.motionX * llllllllllllIllllIlIIlIlIllIIlIl.motionX + llllllllllllIllllIlIIlIlIllIIlIl.motionY * llllllllllllIllllIlIIlIlIllIIlIl.motionY + llllllllllllIllllIlIIlIlIllIIlIl.motionZ * llllllllllllIllllIlIIlIlIllIIlIl.motionZ);
            }
        }
        return super.attackEntityFrom(llllllllllllIllllIlIIlIlIllIIIll, llllllllllllIllllIlIIlIlIllIIIlI);
    }
    
    public EntityMinecartTNT(final World llllllllllllIllllIlIIlIllIIIIllI) {
        super(llllllllllllIllllIlIIlIllIIIIllI);
        this.minecartTNTFuse = EntityMinecartTNT.lIllllIlIlIllI[0];
    }
}
