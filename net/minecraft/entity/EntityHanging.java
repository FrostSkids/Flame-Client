// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.entity;

import java.util.Iterator;
import net.minecraft.block.Block;
import net.minecraft.block.BlockRedstoneDiode;
import java.util.Arrays;
import net.minecraft.nbt.NBTTagCompound;
import org.apache.commons.lang3.Validate;
import net.minecraft.util.DamageSource;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.BlockPos;

public abstract class EntityHanging extends Entity
{
    protected /* synthetic */ BlockPos hangingPosition;
    private static final /* synthetic */ int[] lIllIIIlIllIIl;
    private static final /* synthetic */ String[] lIllIIIlIlIIII;
    public /* synthetic */ EnumFacing facingDirection;
    private /* synthetic */ int tickCounter1;
    
    private double func_174858_a(final int lllllllllllllIIIIIllIIIlIllllIIl) {
        double n;
        if (lllllIIIIIlIlII(lllllllllllllIIIIIllIIIlIllllIIl % EntityHanging.lIllIIIlIllIIl[1])) {
            n = 0.5;
            "".length();
            if ((0x1D ^ 0x18) <= 0) {
                return 0.0;
            }
        }
        else {
            n = 0.0;
        }
        return n;
    }
    
    private void updateBoundingBox() {
        if (lllllIIIIIlIIlI(this.facingDirection)) {
            double lllllllllllllIIIIIllIIIllIIlIIII = this.hangingPosition.getX() + 0.5;
            double lllllllllllllIIIIIllIIIllIIIllll = this.hangingPosition.getY() + 0.5;
            double lllllllllllllIIIIIllIIIllIIIlllI = this.hangingPosition.getZ() + 0.5;
            final double lllllllllllllIIIIIllIIIllIIIllIl = 0.46875;
            final double lllllllllllllIIIIIllIIIllIIIllII = this.func_174858_a(this.getWidthPixels());
            final double lllllllllllllIIIIIllIIIllIIIlIll = this.func_174858_a(this.getHeightPixels());
            lllllllllllllIIIIIllIIIllIIlIIII -= this.facingDirection.getFrontOffsetX() * 0.46875;
            lllllllllllllIIIIIllIIIllIIIlllI -= this.facingDirection.getFrontOffsetZ() * 0.46875;
            lllllllllllllIIIIIllIIIllIIIllll += lllllllllllllIIIIIllIIIllIIIlIll;
            final EnumFacing lllllllllllllIIIIIllIIIllIIIlIlI = this.facingDirection.rotateYCCW();
            lllllllllllllIIIIIllIIIllIIlIIII += lllllllllllllIIIIIllIIIllIIIllII * lllllllllllllIIIIIllIIIllIIIlIlI.getFrontOffsetX();
            lllllllllllllIIIIIllIIIllIIIlllI += lllllllllllllIIIIIllIIIllIIIllII * lllllllllllllIIIIIllIIIllIIIlIlI.getFrontOffsetZ();
            this.posX = lllllllllllllIIIIIllIIIllIIlIIII;
            this.posY = lllllllllllllIIIIIllIIIllIIIllll;
            this.posZ = lllllllllllllIIIIIllIIIllIIIlllI;
            double lllllllllllllIIIIIllIIIllIIIlIIl = this.getWidthPixels();
            double lllllllllllllIIIIIllIIIllIIIlIII = this.getHeightPixels();
            double lllllllllllllIIIIIllIIIllIIIIlll = this.getWidthPixels();
            if (lllllIIIIIlIIll(this.facingDirection.getAxis(), EnumFacing.Axis.Z)) {
                lllllllllllllIIIIIllIIIllIIIIlll = 1.0;
                "".length();
                if ("  ".length() < 0) {
                    return;
                }
            }
            else {
                lllllllllllllIIIIIllIIIllIIIlIIl = 1.0;
            }
            lllllllllllllIIIIIllIIIllIIIlIIl /= 32.0;
            lllllllllllllIIIIIllIIIllIIIlIII /= 32.0;
            lllllllllllllIIIIIllIIIllIIIIlll /= 32.0;
            this.setEntityBoundingBox(new AxisAlignedBB(lllllllllllllIIIIIllIIIllIIlIIII - lllllllllllllIIIIIllIIIllIIIlIIl, lllllllllllllIIIIIllIIIllIIIllll - lllllllllllllIIIIIllIIIllIIIlIII, lllllllllllllIIIIIllIIIllIIIlllI - lllllllllllllIIIIIllIIIllIIIIlll, lllllllllllllIIIIIllIIIllIIlIIII + lllllllllllllIIIIIllIIIllIIIlIIl, lllllllllllllIIIIIllIIIllIIIllll + lllllllllllllIIIIIllIIIllIIIlIII, lllllllllllllIIIIIllIIIllIIIlllI + lllllllllllllIIIIIllIIIllIIIIlll));
        }
    }
    
    private static void lllllIIIIIlIIIl() {
        (lIllIIIlIllIIl = new int[18])[0] = (0xE5 ^ 0xBF);
        EntityHanging.lIllIIIlIllIIl[1] = (0xA5 ^ 0x85);
        EntityHanging.lIllIIIlIllIIl[2] = " ".length();
        EntityHanging.lIllIIIlIllIIl[3] = (0x57 ^ 0x64 ^ (0xF2 ^ 0xA5));
        EntityHanging.lIllIIIlIllIIl[4] = ((0x2A ^ 0x60) & ~(0x7 ^ 0x4D));
        EntityHanging.lIllIIIlIllIIl[5] = (0x74 ^ 0x64);
        EntityHanging.lIllIIIlIllIIl[6] = "  ".length();
        EntityHanging.lIllIIIlIllIIl[7] = "   ".length();
        EntityHanging.lIllIIIlIllIIl[8] = (0xE ^ 0xA);
        EntityHanging.lIllIIIlIllIIl[9] = (0x69 ^ 0x44 ^ (0x2A ^ 0x2));
        EntityHanging.lIllIIIlIllIIl[10] = (((0x1B ^ 0x28) & ~(0x9 ^ 0x3A)) ^ (0x40 ^ 0x46));
        EntityHanging.lIllIIIlIllIIl[11] = (0x6E ^ 0x69);
        EntityHanging.lIllIIIlIllIIl[12] = (0xD9 ^ 0xBA);
        EntityHanging.lIllIIIlIllIIl[13] = (0x23 ^ 0x2B);
        EntityHanging.lIllIIIlIllIIl[14] = (0x6 ^ 0x6D ^ (0x36 ^ 0x54));
        EntityHanging.lIllIIIlIllIIl[15] = (81 + 154 - 178 + 104 ^ 47 + 111 - 55 + 68);
        EntityHanging.lIllIIIlIllIIl[16] = (0x77 ^ 0x3B ^ (0xC8 ^ 0x8F));
        EntityHanging.lIllIIIlIllIIl[17] = (0x31 ^ 0x3D);
    }
    
    static {
        lllllIIIIIlIIIl();
        llllIlllllllIlI();
    }
    
    @Override
    public void setPosition(final double lllllllllllllIIIIIllIIIlIIIlIlll, final double lllllllllllllIIIIIllIIIlIIIlIIIl, final double lllllllllllllIIIIIllIIIlIIIlIIII) {
        this.posX = lllllllllllllIIIIIllIIIlIIIlIlll;
        this.posY = lllllllllllllIIIIIllIIIlIIIlIIIl;
        this.posZ = lllllllllllllIIIIIllIIIlIIIlIIII;
        final BlockPos lllllllllllllIIIIIllIIIlIIIlIlII = this.hangingPosition;
        this.hangingPosition = new BlockPos(lllllllllllllIIIIIllIIIlIIIlIlll, lllllllllllllIIIIIllIIIlIIIlIIIl, lllllllllllllIIIIIllIIIlIIIlIIII);
        if (lllllIIIIIlIlII(this.hangingPosition.equals(lllllllllllllIIIIIllIIIlIIIlIlII) ? 1 : 0)) {
            this.updateBoundingBox();
            this.isAirBorne = (EntityHanging.lIllIIIlIllIIl[2] != 0);
        }
    }
    
    private static boolean lllllIIIIIlIlll(final int lllllllllllllIIIIIllIIIIllIIIllI) {
        return lllllllllllllIIIIIllIIIIllIIIllI != 0;
    }
    
    private static int lllllIIIIIllIII(final double n, final double n2) {
        return dcmpl(n, n2);
    }
    
    private static boolean lllllIIIIIlIIlI(final Object lllllllllllllIIIIIllIIIIllIIllII) {
        return lllllllllllllIIIIIllIIIIllIIllII != null;
    }
    
    public abstract void onBroken(final Entity p0);
    
    private static String llllIllllllIlIl(final String lllllllllllllIIIIIllIIIIllIlllll, final String lllllllllllllIIIIIllIIIIllIllllI) {
        try {
            final SecretKeySpec lllllllllllllIIIIIllIIIIlllIIIlI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIIIIIllIIIIllIllllI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lllllllllllllIIIIIllIIIIlllIIIIl = Cipher.getInstance("Blowfish");
            lllllllllllllIIIIIllIIIIlllIIIIl.init(EntityHanging.lIllIIIlIllIIl[6], lllllllllllllIIIIIllIIIIlllIIIlI);
            return new String(lllllllllllllIIIIIllIIIIlllIIIIl.doFinal(Base64.getDecoder().decode(lllllllllllllIIIIIllIIIIllIlllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIIIIllIIIIlllIIIII) {
            lllllllllllllIIIIIllIIIIlllIIIII.printStackTrace();
            return null;
        }
    }
    
    private static String llllIllllllIllI(String lllllllllllllIIIIIllIIIIllllllII, final String lllllllllllllIIIIIllIIIlIIIIIIII) {
        lllllllllllllIIIIIllIIIIllllllII = new String(Base64.getDecoder().decode(lllllllllllllIIIIIllIIIIllllllII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIIIIIllIIIIllllllll = new StringBuilder();
        final char[] lllllllllllllIIIIIllIIIIlllllllI = lllllllllllllIIIIIllIIIlIIIIIIII.toCharArray();
        int lllllllllllllIIIIIllIIIIllllllIl = EntityHanging.lIllIIIlIllIIl[4];
        final short lllllllllllllIIIIIllIIIIllllIlll = (Object)lllllllllllllIIIIIllIIIIllllllII.toCharArray();
        final double lllllllllllllIIIIIllIIIIllllIllI = lllllllllllllIIIIIllIIIIllllIlll.length;
        long lllllllllllllIIIIIllIIIIllllIlIl = EntityHanging.lIllIIIlIllIIl[4];
        while (lllllIIIIIllIll((int)lllllllllllllIIIIIllIIIIllllIlIl, (int)lllllllllllllIIIIIllIIIIllllIllI)) {
            final char lllllllllllllIIIIIllIIIlIIIIIIlI = lllllllllllllIIIIIllIIIIllllIlll[lllllllllllllIIIIIllIIIIllllIlIl];
            lllllllllllllIIIIIllIIIIllllllll.append((char)(lllllllllllllIIIIIllIIIlIIIIIIlI ^ lllllllllllllIIIIIllIIIIlllllllI[lllllllllllllIIIIIllIIIIllllllIl % lllllllllllllIIIIIllIIIIlllllllI.length]));
            "".length();
            ++lllllllllllllIIIIIllIIIIllllllIl;
            ++lllllllllllllIIIIIllIIIIllllIlIl;
            "".length();
            if (((0xF3 ^ 0xC5) & ~(0xB4 ^ 0x82)) > "   ".length()) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIIIIIllIIIIllllllll);
    }
    
    @Override
    public boolean canBeCollidedWith() {
        return EntityHanging.lIllIIIlIllIIl[2] != 0;
    }
    
    public EntityHanging(final World lllllllllllllIIIIIllIIIllIlIllll) {
        super(lllllllllllllIIIIIllIIIllIlIllll);
        this.setSize(0.5f, 0.5f);
    }
    
    private static int lllllIIIIIllIlI(final double n, final double n2) {
        return dcmpl(n, n2);
    }
    
    public BlockPos getHangingPosition() {
        return this.hangingPosition;
    }
    
    private static boolean lllllIIIIIllIll(final int lllllllllllllIIIIIllIIIIllIIllll, final int lllllllllllllIIIIIllIIIIllIIlllI) {
        return lllllllllllllIIIIIllIIIIllIIllll < lllllllllllllIIIIIllIIIIllIIlllI;
    }
    
    @Override
    public boolean hitByEntity(final Entity lllllllllllllIIIIIllIIIlIlIlIlII) {
        int attackEntity;
        if (lllllIIIIIlIlll((lllllllllllllIIIIIllIIIlIlIlIlII instanceof EntityPlayer) ? 1 : 0)) {
            attackEntity = (this.attackEntityFrom(DamageSource.causePlayerDamage((EntityPlayer)lllllllllllllIIIIIllIIIlIlIlIlII), 0.0f) ? 1 : 0);
            "".length();
            if (-" ".length() > 0) {
                return ((0xE9 ^ 0x9B ^ (0x2A ^ 0x73)) & (0x45 ^ 0x48 ^ (0xB ^ 0x2D) ^ -" ".length())) != 0x0;
            }
        }
        else {
            attackEntity = EntityHanging.lIllIIIlIllIIl[4];
        }
        return attackEntity != 0;
    }
    
    public EntityHanging(final World lllllllllllllIIIIIllIIIllIlIlIII, final BlockPos lllllllllllllIIIIIllIIIllIlIIlII) {
        this(lllllllllllllIIIIIllIIIllIlIlIII);
        this.hangingPosition = lllllllllllllIIIIIllIIIllIlIIlII;
    }
    
    private static void llllIlllllllIlI() {
        (lIllIIIlIlIIII = new String[EntityHanging.lIllIIIlIllIIl[17]])[EntityHanging.lIllIIIlIllIIl[4]] = llllIllllllIlII("znju0C6AC0s=", "tRlgh");
        EntityHanging.lIllIIIlIlIIII[EntityHanging.lIllIIIlIllIIl[2]] = llllIllllllIlIl("LKBCZAixJSg=", "evehV");
        EntityHanging.lIllIIIlIlIIII[EntityHanging.lIllIIIlIllIIl[6]] = llllIllllllIlII("Kuvn6dfWl9E=", "CezTe");
        EntityHanging.lIllIIIlIlIIII[EntityHanging.lIllIIIlIllIIl[7]] = llllIllllllIlIl("CA30yv0zVhw=", "kaDXE");
        EntityHanging.lIllIIIlIlIIII[EntityHanging.lIllIIIlIllIIl[8]] = llllIllllllIlIl("WbeW0+V95v0=", "WhPPz");
        EntityHanging.lIllIIIlIlIIII[EntityHanging.lIllIIIlIllIIl[9]] = llllIllllllIlIl("eXUiemxKV6Q=", "VDInn");
        EntityHanging.lIllIIIlIlIIII[EntityHanging.lIllIIIlIllIIl[10]] = llllIllllllIllI("GgUbMB4=", "NlwUD");
        EntityHanging.lIllIIIlIlIIII[EntityHanging.lIllIIIlIllIIl[11]] = llllIllllllIlII("7vQfqXjBdtMGRTvr//BkGg==", "TCLOL");
        EntityHanging.lIllIIIlIlIIII[EntityHanging.lIllIIIlIllIIl[13]] = llllIllllllIlIl("0RTqzVih3bWxezdqhecMHg==", "rdWiE");
        EntityHanging.lIllIIIlIlIIII[EntityHanging.lIllIIIlIllIIl[14]] = llllIllllllIlIl("bCgQMOckRVs=", "YoxTz");
        EntityHanging.lIllIIIlIlIIII[EntityHanging.lIllIIIlIllIIl[15]] = llllIllllllIlIl("Lur3npRR444=", "pIUIx");
        EntityHanging.lIllIIIlIlIIII[EntityHanging.lIllIIIlIllIIl[16]] = llllIllllllIlII("B8hcHVkbWgg=", "KxEdr");
    }
    
    protected void updateFacingWithBoundingBox(final EnumFacing lllllllllllllIIIIIllIIIllIIlllIl) {
        Validate.notNull((Object)lllllllllllllIIIIIllIIIllIIlllIl);
        "".length();
        Validate.isTrue(lllllllllllllIIIIIllIIIllIIlllIl.getAxis().isHorizontal());
        this.facingDirection = lllllllllllllIIIIIllIIIllIIlllIl;
        final float n = (float)(this.facingDirection.getHorizontalIndex() * EntityHanging.lIllIIIlIllIIl[0]);
        this.rotationYaw = n;
        this.prevRotationYaw = n;
        this.updateBoundingBox();
    }
    
    public void readEntityFromNBT(final NBTTagCompound lllllllllllllIIIIIllIIIlIIlIIIII) {
        this.hangingPosition = new BlockPos(lllllllllllllIIIIIllIIIlIIlIIIII.getInteger(EntityHanging.lIllIIIlIlIIII[EntityHanging.lIllIIIlIllIIl[8]]), lllllllllllllIIIIIllIIIlIIlIIIII.getInteger(EntityHanging.lIllIIIlIlIIII[EntityHanging.lIllIIIlIllIIl[9]]), lllllllllllllIIIIIllIIIlIIlIIIII.getInteger(EntityHanging.lIllIIIlIlIIII[EntityHanging.lIllIIIlIllIIl[10]]));
        EnumFacing lllllllllllllIIIIIllIIIlIIlIIIlI = null;
        if (lllllIIIIIlIlll(lllllllllllllIIIIIllIIIlIIlIIIII.hasKey(EntityHanging.lIllIIIlIlIIII[EntityHanging.lIllIIIlIllIIl[11]], EntityHanging.lIllIIIlIllIIl[12]) ? 1 : 0)) {
            final EnumFacing lllllllllllllIIIIIllIIIlIIlIIlII = EnumFacing.getHorizontal(lllllllllllllIIIIIllIIIlIIlIIIII.getByte(EntityHanging.lIllIIIlIlIIII[EntityHanging.lIllIIIlIllIIl[13]]));
            this.hangingPosition = this.hangingPosition.offset(lllllllllllllIIIIIllIIIlIIlIIlII);
            "".length();
            if (-" ".length() > 0) {
                return;
            }
        }
        else if (lllllIIIIIlIlll(lllllllllllllIIIIIllIIIlIIlIIIII.hasKey(EntityHanging.lIllIIIlIlIIII[EntityHanging.lIllIIIlIllIIl[14]], EntityHanging.lIllIIIlIllIIl[12]) ? 1 : 0)) {
            final EnumFacing lllllllllllllIIIIIllIIIlIIlIIIll = EnumFacing.getHorizontal(lllllllllllllIIIIIllIIIlIIlIIIII.getByte(EntityHanging.lIllIIIlIlIIII[EntityHanging.lIllIIIlIllIIl[15]]));
            "".length();
            if (" ".length() != " ".length()) {
                return;
            }
        }
        else {
            lllllllllllllIIIIIllIIIlIIlIIIlI = EnumFacing.getHorizontal(lllllllllllllIIIIIllIIIlIIlIIIII.getByte(EntityHanging.lIllIIIlIlIIII[EntityHanging.lIllIIIlIllIIl[16]]));
        }
        this.updateFacingWithBoundingBox(lllllllllllllIIIIIllIIIlIIlIIIlI);
    }
    
    public abstract int getWidthPixels();
    
    private static boolean lllllIIIIIllIIl(final int lllllllllllllIIIIIllIIIIllIIIIlI) {
        return lllllllllllllIIIIIllIIIIllIIIIlI > 0;
    }
    
    private static boolean lllllIIIIIlIllI(final int lllllllllllllIIIIIllIIIIllIlIIll, final int lllllllllllllIIIIIllIIIIllIlIIlI) {
        return lllllllllllllIIIIIllIIIIllIlIIll >= lllllllllllllIIIIIllIIIIllIlIIlI;
    }
    
    public abstract int getHeightPixels();
    
    @Override
    public void addVelocity(final double lllllllllllllIIIIIllIIIlIIllIIlI, final double lllllllllllllIIIIIllIIIlIIllIlIl, final double lllllllllllllIIIIIllIIIlIIllIIII) {
        if (lllllIIIIIlIlII(this.worldObj.isRemote ? 1 : 0) && lllllIIIIIlIlII(this.isDead ? 1 : 0) && lllllIIIIIllIIl(lllllIIIIIllIlI(lllllllllllllIIIIIllIIIlIIllIIlI * lllllllllllllIIIIIllIIIlIIllIIlI + lllllllllllllIIIIIllIIIlIIllIlIl * lllllllllllllIIIIIllIIIlIIllIlIl + lllllllllllllIIIIIllIIIlIIllIIII * lllllllllllllIIIIIllIIIlIIllIIII, 0.0))) {
            this.setDead();
            this.onBroken(null);
        }
    }
    
    @Override
    public EnumFacing getHorizontalFacing() {
        return this.facingDirection;
    }
    
    @Override
    public void moveEntity(final double lllllllllllllIIIIIllIIIlIIlllllI, final double lllllllllllllIIIIIllIIIlIIllllIl, final double lllllllllllllIIIIIllIIIlIlIIIIII) {
        if (lllllIIIIIlIlII(this.worldObj.isRemote ? 1 : 0) && lllllIIIIIlIlII(this.isDead ? 1 : 0) && lllllIIIIIllIIl(lllllIIIIIllIII(lllllllllllllIIIIIllIIIlIIlllllI * lllllllllllllIIIIIllIIIlIIlllllI + lllllllllllllIIIIIllIIIlIIllllIl * lllllllllllllIIIIIllIIIlIIllllIl + lllllllllllllIIIIIllIIIlIlIIIIII * lllllllllllllIIIIIllIIIlIlIIIIII, 0.0))) {
            this.setDead();
            this.onBroken(null);
        }
    }
    
    @Override
    protected void entityInit() {
    }
    
    private static boolean lllllIIIIIlIlII(final int lllllllllllllIIIIIllIIIIllIIIlII) {
        return lllllllllllllIIIIIllIIIIllIIIlII == 0;
    }
    
    public void writeEntityToNBT(final NBTTagCompound lllllllllllllIIIIIllIIIlIIlIllII) {
        lllllllllllllIIIIIllIIIlIIlIllII.setByte(EntityHanging.lIllIIIlIlIIII[EntityHanging.lIllIIIlIllIIl[4]], (byte)this.facingDirection.getHorizontalIndex());
        lllllllllllllIIIIIllIIIlIIlIllII.setInteger(EntityHanging.lIllIIIlIlIIII[EntityHanging.lIllIIIlIllIIl[2]], this.getHangingPosition().getX());
        lllllllllllllIIIIIllIIIlIIlIllII.setInteger(EntityHanging.lIllIIIlIlIIII[EntityHanging.lIllIIIlIllIIl[6]], this.getHangingPosition().getY());
        lllllllllllllIIIIIllIIIlIIlIllII.setInteger(EntityHanging.lIllIIIlIlIIII[EntityHanging.lIllIIIlIllIIl[7]], this.getHangingPosition().getZ());
    }
    
    @Override
    protected boolean shouldSetPosAfterLoading() {
        return EntityHanging.lIllIIIlIllIIl[4] != 0;
    }
    
    private static String llllIllllllIlII(final String lllllllllllllIIIIIllIIIIlllIllII, final String lllllllllllllIIIIIllIIIIlllIlIll) {
        try {
            final SecretKeySpec lllllllllllllIIIIIllIIIIlllIllll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIIIIIllIIIIlllIlIll.getBytes(StandardCharsets.UTF_8)), EntityHanging.lIllIIIlIllIIl[13]), "DES");
            final Cipher lllllllllllllIIIIIllIIIIlllIlllI = Cipher.getInstance("DES");
            lllllllllllllIIIIIllIIIIlllIlllI.init(EntityHanging.lIllIIIlIllIIl[6], lllllllllllllIIIIIllIIIIlllIllll);
            return new String(lllllllllllllIIIIIllIIIIlllIlllI.doFinal(Base64.getDecoder().decode(lllllllllllllIIIIIllIIIIlllIllII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIIIIllIIIIlllIllIl) {
            lllllllllllllIIIIIllIIIIlllIllIl.printStackTrace();
            return null;
        }
    }
    
    public boolean onValidSurface() {
        if (lllllIIIIIlIlII(this.worldObj.getCollidingBoundingBoxes(this, this.getEntityBoundingBox()).isEmpty() ? 1 : 0)) {
            return EntityHanging.lIllIIIlIllIIl[4] != 0;
        }
        final int lllllllllllllIIIIIllIIIlIllIlIlI = Math.max(EntityHanging.lIllIIIlIllIIl[2], this.getWidthPixels() / EntityHanging.lIllIIIlIllIIl[5]);
        final int lllllllllllllIIIIIllIIIlIllIlIIl = Math.max(EntityHanging.lIllIIIlIllIIl[2], this.getHeightPixels() / EntityHanging.lIllIIIlIllIIl[5]);
        final BlockPos lllllllllllllIIIIIllIIIlIllIlIII = this.hangingPosition.offset(this.facingDirection.getOpposite());
        final EnumFacing lllllllllllllIIIIIllIIIlIllIIlll = this.facingDirection.rotateYCCW();
        int lllllllllllllIIIIIllIIIlIllIIllI = EntityHanging.lIllIIIlIllIIl[4];
        "".length();
        if (null != null) {
            return ((0x69 ^ 0x4E) & ~(0x56 ^ 0x71)) != 0x0;
        }
        while (!lllllIIIIIlIllI(lllllllllllllIIIIIllIIIlIllIIllI, lllllllllllllIIIIIllIIIlIllIlIlI)) {
            int lllllllllllllIIIIIllIIIlIllIIlIl = EntityHanging.lIllIIIlIllIIl[4];
            "".length();
            if (-" ".length() > 0) {
                return ("  ".length() & ~"  ".length()) != 0x0;
            }
            while (!lllllIIIIIlIllI(lllllllllllllIIIIIllIIIlIllIIlIl, lllllllllllllIIIIIllIIIlIllIlIIl)) {
                final BlockPos lllllllllllllIIIIIllIIIlIllIIlII = lllllllllllllIIIIIllIIIlIllIlIII.offset(lllllllllllllIIIIIllIIIlIllIIlll, lllllllllllllIIIIIllIIIlIllIIllI).up(lllllllllllllIIIIIllIIIlIllIIlIl);
                final Block lllllllllllllIIIIIllIIIlIllIIIll = this.worldObj.getBlockState(lllllllllllllIIIIIllIIIlIllIIlII).getBlock();
                if (lllllIIIIIlIlII(lllllllllllllIIIIIllIIIlIllIIIll.getMaterial().isSolid() ? 1 : 0) && lllllIIIIIlIlII(BlockRedstoneDiode.isRedstoneRepeaterBlockID(lllllllllllllIIIIIllIIIlIllIIIll) ? 1 : 0)) {
                    return EntityHanging.lIllIIIlIllIIl[4] != 0;
                }
                ++lllllllllllllIIIIIllIIIlIllIIlIl;
            }
            ++lllllllllllllIIIIIllIIIlIllIIllI;
        }
        final Iterator<Entity> iterator = this.worldObj.getEntitiesWithinAABBExcludingEntity(this, this.getEntityBoundingBox()).iterator();
        "".length();
        if (" ".length() < 0) {
            return ((0x16 ^ 0x3D) & ~(0x7B ^ 0x50)) != 0x0;
        }
        while (!lllllIIIIIlIlII(iterator.hasNext() ? 1 : 0)) {
            final Entity lllllllllllllIIIIIllIIIlIllIIIlI = iterator.next();
            if (lllllIIIIIlIlll((lllllllllllllIIIIIllIIIlIllIIIlI instanceof EntityHanging) ? 1 : 0)) {
                return EntityHanging.lIllIIIlIllIIl[4] != 0;
            }
        }
        return EntityHanging.lIllIIIlIllIIl[2] != 0;
    }
    
    private static boolean lllllIIIIIlIIll(final Object lllllllllllllIIIIIllIIIIllIIlIIl, final Object lllllllllllllIIIIIllIIIIllIIlIII) {
        return lllllllllllllIIIIIllIIIIllIIlIIl == lllllllllllllIIIIIllIIIIllIIlIII;
    }
    
    @Override
    public void onUpdate() {
        this.prevPosX = this.posX;
        this.prevPosY = this.posY;
        this.prevPosZ = this.posZ;
        final int tickCounter1 = this.tickCounter1;
        this.tickCounter1 = tickCounter1 + EntityHanging.lIllIIIlIllIIl[2];
        if (lllllIIIIIlIlIl(tickCounter1, EntityHanging.lIllIIIlIllIIl[3]) && lllllIIIIIlIlII(this.worldObj.isRemote ? 1 : 0)) {
            this.tickCounter1 = EntityHanging.lIllIIIlIllIIl[4];
            if (lllllIIIIIlIlII(this.isDead ? 1 : 0) && lllllIIIIIlIlII(this.onValidSurface() ? 1 : 0)) {
                this.setDead();
                this.onBroken(null);
            }
        }
    }
    
    @Override
    public boolean attackEntityFrom(final DamageSource lllllllllllllIIIIIllIIIlIlIIlIII, final float lllllllllllllIIIIIllIIIlIlIIlIlI) {
        if (lllllIIIIIlIlll(this.isEntityInvulnerable(lllllllllllllIIIIIllIIIlIlIIlIII) ? 1 : 0)) {
            return EntityHanging.lIllIIIlIllIIl[4] != 0;
        }
        if (lllllIIIIIlIlII(this.isDead ? 1 : 0) && lllllIIIIIlIlII(this.worldObj.isRemote ? 1 : 0)) {
            this.setDead();
            this.setBeenAttacked();
            this.onBroken(lllllllllllllIIIIIllIIIlIlIIlIII.getEntity());
        }
        return EntityHanging.lIllIIIlIllIIl[2] != 0;
    }
    
    private static boolean lllllIIIIIlIlIl(final int lllllllllllllIIIIIllIIIIllIlIlll, final int lllllllllllllIIIIIllIIIIllIlIllI) {
        return lllllllllllllIIIIIllIIIIllIlIlll == lllllllllllllIIIIIllIIIIllIlIllI;
    }
}
