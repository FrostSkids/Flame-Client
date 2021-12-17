// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.entity.item;

import java.util.Iterator;
import com.google.common.collect.Maps;
import java.util.Map;
import net.minecraft.entity.monster.EntityIronGolem;
import net.minecraft.util.Vec3;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemStack;
import net.minecraft.init.Items;
import net.minecraft.entity.DataWatcher;
import net.minecraft.entity.EntityMinecartCommandBlock;
import net.minecraft.entity.ai.EntityMinecartMobSpawner;
import net.minecraft.world.World;
import net.minecraft.server.MinecraftServer;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.BlockRailPowered;
import net.minecraft.block.BlockRailBase;
import net.minecraft.util.BlockPos;
import net.minecraft.util.MathHelper;
import net.minecraft.world.WorldServer;
import net.minecraft.init.Blocks;
import net.minecraft.util.ChatComponentTranslation;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.IChatComponent;
import net.minecraft.util.ResourceLocation;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.DamageSource;
import net.minecraft.util.AxisAlignedBB;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import net.minecraft.world.IWorldNameable;
import net.minecraft.entity.Entity;

public abstract class EntityMinecart extends Entity implements IWorldNameable
{
    private static final /* synthetic */ String[] lIIllIIIlIllIl;
    private /* synthetic */ int turnProgress;
    private /* synthetic */ double velocityX;
    private /* synthetic */ boolean isInReverse;
    private /* synthetic */ double minecartZ;
    private /* synthetic */ double minecartY;
    private static final /* synthetic */ int[] lIIllIIIllIlIl;
    private /* synthetic */ double velocityY;
    private /* synthetic */ String entityName;
    private /* synthetic */ double minecartX;
    private static volatile /* synthetic */ int[] $SWITCH_TABLE$net$minecraft$entity$item$EntityMinecart$EnumMinecartType;
    private /* synthetic */ double velocityZ;
    private /* synthetic */ double minecartPitch;
    private static final /* synthetic */ int[][][] matrix;
    private /* synthetic */ double minecartYaw;
    
    private static boolean llIlIllIlIlIIll(final int lllllllllllllIIlIllIIlIIlIIIIllI, final int lllllllllllllIIlIllIIlIIlIIIIlIl) {
        return lllllllllllllIIlIllIIlIIlIIIIllI == lllllllllllllIIlIllIIlIIlIIIIlIl;
    }
    
    @Override
    public boolean canBePushed() {
        return EntityMinecart.lIIllIIIllIlIl[5] != 0;
    }
    
    private static String llIlIllIIllllIl(final String lllllllllllllIIlIllIIlIIlIllIIIl, final String lllllllllllllIIlIllIIlIIlIllIIlI) {
        try {
            final SecretKeySpec lllllllllllllIIlIllIIlIIlIllIllI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIIlIllIIlIIlIllIIlI.getBytes(StandardCharsets.UTF_8)), EntityMinecart.lIIllIIIllIlIl[10]), "DES");
            final Cipher lllllllllllllIIlIllIIlIIlIllIlIl = Cipher.getInstance("DES");
            lllllllllllllIIlIllIIlIIlIllIlIl.init(EntityMinecart.lIIllIIIllIlIl[2], lllllllllllllIIlIllIIlIIlIllIllI);
            return new String(lllllllllllllIIlIllIIlIIlIllIlIl.doFinal(Base64.getDecoder().decode(lllllllllllllIIlIllIIlIIlIllIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIlIllIIlIIlIllIlII) {
            lllllllllllllIIlIllIIlIIlIllIlII.printStackTrace();
            return null;
        }
    }
    
    private static boolean llIlIllIlIlIlIl(final int lllllllllllllIIlIllIIlIIIllIlIll) {
        return lllllllllllllIIlIllIIlIIIllIlIll >= 0;
    }
    
    private static String llIlIllIIllllll(String lllllllllllllIIlIllIIlIIlIIllllI, final String lllllllllllllIIlIllIIlIIlIIlllIl) {
        lllllllllllllIIlIllIIlIIlIIllllI = new String(Base64.getDecoder().decode(lllllllllllllIIlIllIIlIIlIIllllI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIIlIllIIlIIlIlIIIIl = new StringBuilder();
        final char[] lllllllllllllIIlIllIIlIIlIlIIIII = lllllllllllllIIlIllIIlIIlIIlllIl.toCharArray();
        int lllllllllllllIIlIllIIlIIlIIlllll = EntityMinecart.lIIllIIIllIlIl[1];
        final float lllllllllllllIIlIllIIlIIlIIllIIl = (Object)lllllllllllllIIlIllIIlIIlIIllllI.toCharArray();
        final short lllllllllllllIIlIllIIlIIlIIllIII = (short)lllllllllllllIIlIllIIlIIlIIllIIl.length;
        byte lllllllllllllIIlIllIIlIIlIIlIlll = (byte)EntityMinecart.lIIllIIIllIlIl[1];
        while (llIlIllIlIllllI(lllllllllllllIIlIllIIlIIlIIlIlll, lllllllllllllIIlIllIIlIIlIIllIII)) {
            final char lllllllllllllIIlIllIIlIIlIlIIlII = lllllllllllllIIlIllIIlIIlIIllIIl[lllllllllllllIIlIllIIlIIlIIlIlll];
            lllllllllllllIIlIllIIlIIlIlIIIIl.append((char)(lllllllllllllIIlIllIIlIIlIlIIlII ^ lllllllllllllIIlIllIIlIIlIlIIIII[lllllllllllllIIlIllIIlIIlIIlllll % lllllllllllllIIlIllIIlIIlIlIIIII.length]));
            "".length();
            ++lllllllllllllIIlIllIIlIIlIIlllll;
            ++lllllllllllllIIlIllIIlIIlIIlIlll;
            "".length();
            if ((13 + 85 - 21 + 51 ^ 0 + 67 + 33 + 32) < ((0x3C ^ 0x27 ^ (0x14 ^ 0x34)) & (0xEA ^ 0xA7 ^ (0xB3 ^ 0xC5) ^ -" ".length()))) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIIlIllIIlIIlIlIIIIl);
    }
    
    @Override
    public AxisAlignedBB getCollisionBox(final Entity lllllllllllllIIlIllIIlllIIIIIllI) {
        AxisAlignedBB entityBoundingBox;
        if (llIlIllIlIIlIII(lllllllllllllIIlIllIIlllIIIIIllI.canBePushed() ? 1 : 0)) {
            entityBoundingBox = lllllllllllllIIlIllIIlllIIIIIllI.getEntityBoundingBox();
            "".length();
            if (null != null) {
                return null;
            }
        }
        else {
            entityBoundingBox = null;
        }
        return entityBoundingBox;
    }
    
    @Override
    public boolean attackEntityFrom(final DamageSource lllllllllllllIIlIllIIllIlllIllIl, final float lllllllllllllIIlIllIIllIlllIllII) {
        if (!llIlIllIlIIlIlI(this.worldObj.isRemote ? 1 : 0) || !llIlIllIlIIlIlI(this.isDead ? 1 : 0)) {
            return EntityMinecart.lIIllIIIllIlIl[5] != 0;
        }
        if (llIlIllIlIIlIII(this.isEntityInvulnerable(lllllllllllllIIlIllIIllIlllIllIl) ? 1 : 0)) {
            return EntityMinecart.lIIllIIIllIlIl[1] != 0;
        }
        this.setRollingDirection(-this.getRollingDirection());
        this.setRollingAmplitude(EntityMinecart.lIIllIIIllIlIl[0]);
        this.setBeenAttacked();
        this.setDamage(this.getDamage() + lllllllllllllIIlIllIIllIlllIllII * 10.0f);
        int n;
        if (llIlIllIlIIlIII((lllllllllllllIIlIllIIllIlllIllIl.getEntity() instanceof EntityPlayer) ? 1 : 0) && llIlIllIlIIlIII(((EntityPlayer)lllllllllllllIIlIllIIllIlllIllIl.getEntity()).capabilities.isCreativeMode ? 1 : 0)) {
            n = EntityMinecart.lIIllIIIllIlIl[5];
            "".length();
            if (((0x63 ^ 0x1F ^ (0x1D ^ 0x3F)) & (0x64 ^ 0x1E ^ (0x4E ^ 0x6A) ^ -" ".length())) != ((0x13 ^ 0x5F ^ (0x8D ^ 0x9F)) & (0x62 ^ 0x28 ^ (0x78 ^ 0x6C) ^ -" ".length()))) {
                return ((173 + 141 - 153 + 83 ^ 92 + 144 - 72 + 19) & (185 + 158 - 323 + 172 ^ 21 + 5 + 4 + 101 ^ -" ".length())) != 0x0;
            }
        }
        else {
            n = EntityMinecart.lIIllIIIllIlIl[1];
        }
        final boolean lllllllllllllIIlIllIIllIlllIlIll = n != 0;
        if (!llIlIllIlIIlIlI(lllllllllllllIIlIllIIllIlllIlIll ? 1 : 0) || llIlIllIlIIlIll(llIlIllIlIIlIIl(this.getDamage(), 40.0f))) {
            if (llIlIllIlIIllII(this.riddenByEntity)) {
                this.riddenByEntity.mountEntity(null);
            }
            if (llIlIllIlIIlIII(lllllllllllllIIlIllIIllIlllIlIll ? 1 : 0) && llIlIllIlIIlIlI(this.hasCustomName() ? 1 : 0)) {
                this.setDead();
                "".length();
                if ("   ".length() == 0) {
                    return ((0xA9 ^ 0xA0) & ~(0x1E ^ 0x17)) != 0x0;
                }
            }
            else {
                this.killMinecart(lllllllllllllIIlIllIIllIlllIllIl);
            }
        }
        return EntityMinecart.lIIllIIIllIlIl[5] != 0;
    }
    
    @Override
    protected boolean canTriggerWalking() {
        return EntityMinecart.lIIllIIIllIlIl[1] != 0;
    }
    
    @Override
    public boolean hasCustomName() {
        if (llIlIllIlIIllII(this.entityName)) {
            return EntityMinecart.lIIllIIIllIlIl[5] != 0;
        }
        return EntityMinecart.lIIllIIIllIlIl[1] != 0;
    }
    
    private static int llIlIllIlIlllII(final double n, final double n2) {
        return dcmpl(n, n2);
    }
    
    private static boolean llIlIllIlIIlIll(final int lllllllllllllIIlIllIIlIIIllIIlll) {
        return lllllllllllllIIlIllIIlIIIllIIlll > 0;
    }
    
    public void func_174899_a(final IBlockState lllllllllllllIIlIllIIlIIlllIIlII) {
        this.getDataWatcher().updateObject(EntityMinecart.lIIllIIIllIlIl[15], Block.getStateId(lllllllllllllIIlIllIIlIIlllIIlII));
        this.setHasDisplayTile((boolean)(EntityMinecart.lIIllIIIllIlIl[5] != 0));
    }
    
    @Override
    public boolean canBeCollidedWith() {
        int n;
        if (llIlIllIlIIlIII(this.isDead ? 1 : 0)) {
            n = EntityMinecart.lIIllIIIllIlIl[1];
            "".length();
            if (" ".length() < -" ".length()) {
                return ((0x4E ^ 0x6E) & ~(0x7E ^ 0x5E)) != 0x0;
            }
        }
        else {
            n = EntityMinecart.lIIllIIIllIlIl[5];
        }
        return n != 0;
    }
    
    public float getDamage() {
        return this.dataWatcher.getWatchableObjectFloat(EntityMinecart.lIIllIIIllIlIl[14]);
    }
    
    @Override
    protected void writeEntityToNBT(final NBTTagCompound lllllllllllllIIlIllIIlIlIlIllIII) {
        if (llIlIllIlIIlIII(this.hasDisplayTile() ? 1 : 0)) {
            lllllllllllllIIlIllIIlIlIlIllIII.setBoolean(EntityMinecart.lIIllIIIlIllIl[EntityMinecart.lIIllIIIllIlIl[18]], (boolean)(EntityMinecart.lIIllIIIllIlIl[5] != 0));
            final IBlockState lllllllllllllIIlIllIIlIlIlIllIll = this.getDisplayTile();
            final ResourceLocation lllllllllllllIIlIllIIlIlIlIllIlI = Block.blockRegistry.getNameForObject(lllllllllllllIIlIllIIlIlIlIllIll.getBlock());
            final String lllllllllllllIIIIIlIIIlIIIIIIllI = EntityMinecart.lIIllIIIlIllIl[EntityMinecart.lIIllIIIllIlIl[19]];
            String string;
            if (llIlIllIlIlIIIl(lllllllllllllIIlIllIIlIlIlIllIlI)) {
                string = EntityMinecart.lIIllIIIlIllIl[EntityMinecart.lIIllIIIllIlIl[20]];
                "".length();
                if ((0x57 ^ 0x53) == 0x0) {
                    return;
                }
            }
            else {
                string = lllllllllllllIIlIllIIlIlIlIllIlI.toString();
            }
            lllllllllllllIIlIllIIlIlIlIllIII.setString(lllllllllllllIIIIIlIIIlIIIIIIllI, string);
            lllllllllllllIIlIllIIlIlIlIllIII.setInteger(EntityMinecart.lIIllIIIlIllIl[EntityMinecart.lIIllIIIllIlIl[21]], lllllllllllllIIlIllIIlIlIlIllIll.getBlock().getMetaFromState(lllllllllllllIIlIllIIlIlIlIllIll));
            lllllllllllllIIlIllIIlIlIlIllIII.setInteger(EntityMinecart.lIIllIIIlIllIl[EntityMinecart.lIIllIIIllIlIl[22]], this.getDisplayTileOffset());
        }
        if (llIlIllIlIIllII(this.entityName) && llIlIllIlIIlIll(this.entityName.length())) {
            lllllllllllllIIlIllIIlIlIlIllIII.setString(EntityMinecart.lIIllIIIlIllIl[EntityMinecart.lIIllIIIllIlIl[23]], this.entityName);
        }
    }
    
    @Override
    public void setVelocity(final double lllllllllllllIIlIllIIlIlIIIIllll, final double lllllllllllllIIlIllIIlIlIIIIlllI, final double lllllllllllllIIlIllIIlIlIIIIllIl) {
        this.motionX = lllllllllllllIIlIllIIlIlIIIIllll;
        this.velocityX = lllllllllllllIIlIllIIlIlIIIIllll;
        this.motionY = lllllllllllllIIlIllIIlIlIIIIlllI;
        this.velocityY = lllllllllllllIIlIllIIlIlIIIIlllI;
        this.motionZ = lllllllllllllIIlIllIIlIlIIIIllIl;
        this.velocityZ = lllllllllllllIIlIllIIlIlIIIIllIl;
    }
    
    public void onActivatorRailPass(final int lllllllllllllIIlIllIIllIlIlIlIlI, final int lllllllllllllIIlIllIIllIlIlIlIIl, final int lllllllllllllIIlIllIIllIlIlIlIII, final boolean lllllllllllllIIlIllIIllIlIlIIlll) {
    }
    
    static {
        llIlIllIlIIIlll();
        llIlIllIlIIIIIl();
        final int[][][] matrix2 = new int[EntityMinecart.lIIllIIIllIlIl[0]][][];
        final int n = EntityMinecart.lIIllIIIllIlIl[1];
        final int[][] array = new int[EntityMinecart.lIIllIIIllIlIl[2]][];
        final int n2 = EntityMinecart.lIIllIIIllIlIl[1];
        final int[] array2 = new int[EntityMinecart.lIIllIIIllIlIl[3]];
        array2[EntityMinecart.lIIllIIIllIlIl[2]] = EntityMinecart.lIIllIIIllIlIl[4];
        array[n2] = array2;
        final int n3 = EntityMinecart.lIIllIIIllIlIl[5];
        final int[] array3 = new int[EntityMinecart.lIIllIIIllIlIl[3]];
        array3[EntityMinecart.lIIllIIIllIlIl[2]] = EntityMinecart.lIIllIIIllIlIl[5];
        array[n3] = array3;
        matrix2[n] = array;
        final int n4 = EntityMinecart.lIIllIIIllIlIl[5];
        final int[][] array4 = new int[EntityMinecart.lIIllIIIllIlIl[2]][];
        final int n5 = EntityMinecart.lIIllIIIllIlIl[1];
        final int[] array5 = new int[EntityMinecart.lIIllIIIllIlIl[3]];
        array5[EntityMinecart.lIIllIIIllIlIl[1]] = EntityMinecart.lIIllIIIllIlIl[4];
        array4[n5] = array5;
        final int n6 = EntityMinecart.lIIllIIIllIlIl[5];
        final int[] array6 = new int[EntityMinecart.lIIllIIIllIlIl[3]];
        array6[EntityMinecart.lIIllIIIllIlIl[1]] = EntityMinecart.lIIllIIIllIlIl[5];
        array4[n6] = array6;
        matrix2[n4] = array4;
        final int n7 = EntityMinecart.lIIllIIIllIlIl[2];
        final int[][] array7 = new int[EntityMinecart.lIIllIIIllIlIl[2]][];
        final int n8 = EntityMinecart.lIIllIIIllIlIl[1];
        final int[] array8 = new int[EntityMinecart.lIIllIIIllIlIl[3]];
        array8[EntityMinecart.lIIllIIIllIlIl[1]] = EntityMinecart.lIIllIIIllIlIl[4];
        array8[EntityMinecart.lIIllIIIllIlIl[5]] = EntityMinecart.lIIllIIIllIlIl[4];
        array7[n8] = array8;
        final int n9 = EntityMinecart.lIIllIIIllIlIl[5];
        final int[] array9 = new int[EntityMinecart.lIIllIIIllIlIl[3]];
        array9[EntityMinecart.lIIllIIIllIlIl[1]] = EntityMinecart.lIIllIIIllIlIl[5];
        array7[n9] = array9;
        matrix2[n7] = array7;
        final int n10 = EntityMinecart.lIIllIIIllIlIl[3];
        final int[][] array10 = new int[EntityMinecart.lIIllIIIllIlIl[2]][];
        final int n11 = EntityMinecart.lIIllIIIllIlIl[1];
        final int[] array11 = new int[EntityMinecart.lIIllIIIllIlIl[3]];
        array11[EntityMinecart.lIIllIIIllIlIl[1]] = EntityMinecart.lIIllIIIllIlIl[4];
        array10[n11] = array11;
        final int n12 = EntityMinecart.lIIllIIIllIlIl[5];
        final int[] array12 = new int[EntityMinecart.lIIllIIIllIlIl[3]];
        array12[EntityMinecart.lIIllIIIllIlIl[1]] = EntityMinecart.lIIllIIIllIlIl[5];
        array12[EntityMinecart.lIIllIIIllIlIl[5]] = EntityMinecart.lIIllIIIllIlIl[4];
        array10[n12] = array12;
        matrix2[n10] = array10;
        final int n13 = EntityMinecart.lIIllIIIllIlIl[6];
        final int[][] array13 = new int[EntityMinecart.lIIllIIIllIlIl[2]][];
        final int n14 = EntityMinecart.lIIllIIIllIlIl[1];
        final int[] array14 = new int[EntityMinecart.lIIllIIIllIlIl[3]];
        array14[EntityMinecart.lIIllIIIllIlIl[2]] = EntityMinecart.lIIllIIIllIlIl[4];
        array13[n14] = array14;
        final int n15 = EntityMinecart.lIIllIIIllIlIl[5];
        final int[] array15 = new int[EntityMinecart.lIIllIIIllIlIl[3]];
        array15[EntityMinecart.lIIllIIIllIlIl[5]] = EntityMinecart.lIIllIIIllIlIl[4];
        array15[EntityMinecart.lIIllIIIllIlIl[2]] = EntityMinecart.lIIllIIIllIlIl[5];
        array13[n15] = array15;
        matrix2[n13] = array13;
        final int n16 = EntityMinecart.lIIllIIIllIlIl[7];
        final int[][] array16 = new int[EntityMinecart.lIIllIIIllIlIl[2]][];
        final int n17 = EntityMinecart.lIIllIIIllIlIl[1];
        final int[] array17 = new int[EntityMinecart.lIIllIIIllIlIl[3]];
        array17[EntityMinecart.lIIllIIIllIlIl[5]] = EntityMinecart.lIIllIIIllIlIl[4];
        array17[EntityMinecart.lIIllIIIllIlIl[2]] = EntityMinecart.lIIllIIIllIlIl[4];
        array16[n17] = array17;
        final int n18 = EntityMinecart.lIIllIIIllIlIl[5];
        final int[] array18 = new int[EntityMinecart.lIIllIIIllIlIl[3]];
        array18[EntityMinecart.lIIllIIIllIlIl[2]] = EntityMinecart.lIIllIIIllIlIl[5];
        array16[n18] = array18;
        matrix2[n16] = array16;
        final int n19 = EntityMinecart.lIIllIIIllIlIl[8];
        final int[][] array19 = new int[EntityMinecart.lIIllIIIllIlIl[2]][];
        final int n20 = EntityMinecart.lIIllIIIllIlIl[1];
        final int[] array20 = new int[EntityMinecart.lIIllIIIllIlIl[3]];
        array20[EntityMinecart.lIIllIIIllIlIl[2]] = EntityMinecart.lIIllIIIllIlIl[5];
        array19[n20] = array20;
        final int n21 = EntityMinecart.lIIllIIIllIlIl[5];
        final int[] array21 = new int[EntityMinecart.lIIllIIIllIlIl[3]];
        array21[EntityMinecart.lIIllIIIllIlIl[1]] = EntityMinecart.lIIllIIIllIlIl[5];
        array19[n21] = array21;
        matrix2[n19] = array19;
        final int n22 = EntityMinecart.lIIllIIIllIlIl[9];
        final int[][] array22 = new int[EntityMinecart.lIIllIIIllIlIl[2]][];
        final int n23 = EntityMinecart.lIIllIIIllIlIl[1];
        final int[] array23 = new int[EntityMinecart.lIIllIIIllIlIl[3]];
        array23[EntityMinecart.lIIllIIIllIlIl[2]] = EntityMinecart.lIIllIIIllIlIl[5];
        array22[n23] = array23;
        final int n24 = EntityMinecart.lIIllIIIllIlIl[5];
        final int[] array24 = new int[EntityMinecart.lIIllIIIllIlIl[3]];
        array24[EntityMinecart.lIIllIIIllIlIl[1]] = EntityMinecart.lIIllIIIllIlIl[4];
        array22[n24] = array24;
        matrix2[n22] = array22;
        final int n25 = EntityMinecart.lIIllIIIllIlIl[10];
        final int[][] array25 = new int[EntityMinecart.lIIllIIIllIlIl[2]][];
        final int n26 = EntityMinecart.lIIllIIIllIlIl[1];
        final int[] array26 = new int[EntityMinecart.lIIllIIIllIlIl[3]];
        array26[EntityMinecart.lIIllIIIllIlIl[2]] = EntityMinecart.lIIllIIIllIlIl[4];
        array25[n26] = array26;
        final int n27 = EntityMinecart.lIIllIIIllIlIl[5];
        final int[] array27 = new int[EntityMinecart.lIIllIIIllIlIl[3]];
        array27[EntityMinecart.lIIllIIIllIlIl[1]] = EntityMinecart.lIIllIIIllIlIl[4];
        array25[n27] = array27;
        matrix2[n25] = array25;
        final int n28 = EntityMinecart.lIIllIIIllIlIl[11];
        final int[][] array28 = new int[EntityMinecart.lIIllIIIllIlIl[2]][];
        final int n29 = EntityMinecart.lIIllIIIllIlIl[1];
        final int[] array29 = new int[EntityMinecart.lIIllIIIllIlIl[3]];
        array29[EntityMinecart.lIIllIIIllIlIl[2]] = EntityMinecart.lIIllIIIllIlIl[4];
        array28[n29] = array29;
        final int n30 = EntityMinecart.lIIllIIIllIlIl[5];
        final int[] array30 = new int[EntityMinecart.lIIllIIIllIlIl[3]];
        array30[EntityMinecart.lIIllIIIllIlIl[1]] = EntityMinecart.lIIllIIIllIlIl[5];
        array28[n30] = array30;
        matrix2[n28] = array28;
        matrix = matrix2;
    }
    
    @Override
    public IChatComponent getDisplayName() {
        if (llIlIllIlIIlIII(this.hasCustomName() ? 1 : 0)) {
            final ChatComponentText lllllllllllllIIlIllIIlIIllIIIIlI = new ChatComponentText(this.entityName);
            lllllllllllllIIlIllIIlIIllIIIIlI.getChatStyle().setChatHoverEvent(this.getHoverEvent());
            "".length();
            lllllllllllllIIlIllIIlIIllIIIIlI.getChatStyle().setInsertion(this.getUniqueID().toString());
            "".length();
            return lllllllllllllIIlIllIIlIIllIIIIlI;
        }
        final ChatComponentTranslation lllllllllllllIIlIllIIlIIllIIIIIl = new ChatComponentTranslation(this.getName(), new Object[EntityMinecart.lIIllIIIllIlIl[1]]);
        lllllllllllllIIlIllIIlIIllIIIIIl.getChatStyle().setChatHoverEvent(this.getHoverEvent());
        "".length();
        lllllllllllllIIlIllIIlIIllIIIIIl.getChatStyle().setInsertion(this.getUniqueID().toString());
        "".length();
        return lllllllllllllIIlIllIIlIIllIIIIIl;
    }
    
    private static int llIlIllIlIllIll(final double n, final double n2) {
        return dcmpg(n, n2);
    }
    
    @Override
    public double getMountedYOffset() {
        return 0.0;
    }
    
    public IBlockState getDefaultDisplayTile() {
        return Blocks.air.getDefaultState();
    }
    
    @Override
    public void onUpdate() {
        if (llIlIllIlIIlIll(this.getRollingAmplitude())) {
            this.setRollingAmplitude(this.getRollingAmplitude() - EntityMinecart.lIIllIIIllIlIl[5]);
        }
        if (llIlIllIlIIlIll(llIlIllIlIIllIl(this.getDamage(), 0.0f))) {
            this.setDamage(this.getDamage() - 1.0f);
        }
        if (llIlIllIlIlIIII(llIlIllIlIIlllI(this.posY, -64.0))) {
            this.kill();
        }
        if (llIlIllIlIIlIlI(this.worldObj.isRemote ? 1 : 0) && llIlIllIlIIlIII((this.worldObj instanceof WorldServer) ? 1 : 0)) {
            this.worldObj.theProfiler.startSection(EntityMinecart.lIIllIIIlIllIl[EntityMinecart.lIIllIIIllIlIl[5]]);
            final MinecraftServer lllllllllllllIIlIllIIllIllIIlIIl = ((WorldServer)this.worldObj).getMinecraftServer();
            final int lllllllllllllIIlIllIIllIllIIlIII = this.getMaxInPortalTime();
            if (llIlIllIlIIlIII(this.inPortal ? 1 : 0)) {
                if (llIlIllIlIIlIII(lllllllllllllIIlIllIIllIllIIlIIl.getAllowNether() ? 1 : 0)) {
                    if (llIlIllIlIlIIIl(this.ridingEntity)) {
                        final int portalCounter = this.portalCounter;
                        this.portalCounter = portalCounter + EntityMinecart.lIIllIIIllIlIl[5];
                        if (llIlIllIlIlIIlI(portalCounter, lllllllllllllIIlIllIIllIllIIlIII)) {
                            this.portalCounter = lllllllllllllIIlIllIIllIllIIlIII;
                            this.timeUntilPortal = this.getPortalCooldown();
                            int lllllllllllllIIlIllIIllIllIIIllI = 0;
                            if (llIlIllIlIlIIll(this.worldObj.provider.getDimensionId(), EntityMinecart.lIIllIIIllIlIl[4])) {
                                final int lllllllllllllIIlIllIIllIllIIIlll = EntityMinecart.lIIllIIIllIlIl[1];
                                "".length();
                                if ("  ".length() <= 0) {
                                    return;
                                }
                            }
                            else {
                                lllllllllllllIIlIllIIllIllIIIllI = EntityMinecart.lIIllIIIllIlIl[4];
                            }
                            this.travelToDimension(lllllllllllllIIlIllIIllIllIIIllI);
                        }
                    }
                    this.inPortal = (EntityMinecart.lIIllIIIllIlIl[1] != 0);
                    "".length();
                    if (null != null) {
                        return;
                    }
                }
            }
            else {
                if (llIlIllIlIIlIll(this.portalCounter)) {
                    this.portalCounter -= EntityMinecart.lIIllIIIllIlIl[6];
                }
                if (llIlIllIlIlIIII(this.portalCounter)) {
                    this.portalCounter = EntityMinecart.lIIllIIIllIlIl[1];
                }
            }
            if (llIlIllIlIIlIll(this.timeUntilPortal)) {
                this.timeUntilPortal -= EntityMinecart.lIIllIIIllIlIl[5];
            }
            this.worldObj.theProfiler.endSection();
        }
        if (llIlIllIlIIlIII(this.worldObj.isRemote ? 1 : 0)) {
            if (llIlIllIlIIlIll(this.turnProgress)) {
                final double lllllllllllllIIlIllIIllIllIIIlIl = this.posX + (this.minecartX - this.posX) / this.turnProgress;
                final double lllllllllllllIIlIllIIllIllIIIlII = this.posY + (this.minecartY - this.posY) / this.turnProgress;
                final double lllllllllllllIIlIllIIllIllIIIIll = this.posZ + (this.minecartZ - this.posZ) / this.turnProgress;
                final double lllllllllllllIIlIllIIllIllIIIIlI = MathHelper.wrapAngleTo180_double(this.minecartYaw - this.rotationYaw);
                this.rotationYaw += (float)(lllllllllllllIIlIllIIllIllIIIIlI / this.turnProgress);
                this.rotationPitch += (float)((this.minecartPitch - this.rotationPitch) / this.turnProgress);
                this.turnProgress -= EntityMinecart.lIIllIIIllIlIl[5];
                this.setPosition(lllllllllllllIIlIllIIllIllIIIlIl, lllllllllllllIIlIllIIllIllIIIlII, lllllllllllllIIlIllIIllIllIIIIll);
                this.setRotation(this.rotationYaw, this.rotationPitch);
                "".length();
                if ((0xCE ^ 0xA2 ^ (0x4A ^ 0x22)) <= "   ".length()) {
                    return;
                }
            }
            else {
                this.setPosition(this.posX, this.posY, this.posZ);
                this.setRotation(this.rotationYaw, this.rotationPitch);
                "".length();
                if (" ".length() < 0) {
                    return;
                }
            }
        }
        else {
            this.prevPosX = this.posX;
            this.prevPosY = this.posY;
            this.prevPosZ = this.posZ;
            this.motionY -= 0.03999999910593033;
            final int lllllllllllllIIlIllIIllIllIIIIIl = MathHelper.floor_double(this.posX);
            int lllllllllllllIIlIllIIllIllIIIIII = MathHelper.floor_double(this.posY);
            final int lllllllllllllIIlIllIIllIlIllllll = MathHelper.floor_double(this.posZ);
            if (llIlIllIlIIlIII(BlockRailBase.isRailBlock(this.worldObj, new BlockPos(lllllllllllllIIlIllIIllIllIIIIIl, lllllllllllllIIlIllIIllIllIIIIII - EntityMinecart.lIIllIIIllIlIl[5], lllllllllllllIIlIllIIllIlIllllll)) ? 1 : 0)) {
                --lllllllllllllIIlIllIIllIllIIIIII;
            }
            final BlockPos lllllllllllllIIlIllIIllIlIlllllI = new BlockPos(lllllllllllllIIlIllIIllIllIIIIIl, lllllllllllllIIlIllIIllIllIIIIII, lllllllllllllIIlIllIIllIlIllllll);
            final IBlockState lllllllllllllIIlIllIIllIlIllllIl = this.worldObj.getBlockState(lllllllllllllIIlIllIIllIlIlllllI);
            if (llIlIllIlIIlIII(BlockRailBase.isRailBlock(lllllllllllllIIlIllIIllIlIllllIl) ? 1 : 0)) {
                this.func_180460_a(lllllllllllllIIlIllIIllIlIlllllI, lllllllllllllIIlIllIIllIlIllllIl);
                if (llIlIllIlIlIlII(lllllllllllllIIlIllIIllIlIllllIl.getBlock(), Blocks.activator_rail)) {
                    this.onActivatorRailPass(lllllllllllllIIlIllIIllIllIIIIIl, lllllllllllllIIlIllIIllIllIIIIII, lllllllllllllIIlIllIIllIlIllllll, lllllllllllllIIlIllIIllIlIllllIl.getValue((IProperty<Boolean>)BlockRailPowered.POWERED));
                    "".length();
                    if (((0x81 ^ 0xB1) & ~(0x6D ^ 0x5D)) >= "   ".length()) {
                        return;
                    }
                }
            }
            else {
                this.moveDerailedMinecart();
            }
            this.doBlockCollisions();
            this.rotationPitch = 0.0f;
            final double lllllllllllllIIlIllIIllIlIllllII = this.prevPosX - this.posX;
            final double lllllllllllllIIlIllIIllIlIlllIll = this.prevPosZ - this.posZ;
            if (llIlIllIlIIlIll(llIlIllIlIIllll(lllllllllllllIIlIllIIllIlIllllII * lllllllllllllIIlIllIIllIlIllllII + lllllllllllllIIlIllIIllIlIlllIll * lllllllllllllIIlIllIIllIlIlllIll, 0.001))) {
                this.rotationYaw = (float)(MathHelper.func_181159_b(lllllllllllllIIlIllIIllIlIlllIll, lllllllllllllIIlIllIIllIlIllllII) * 180.0 / 3.141592653589793);
                if (llIlIllIlIIlIII(this.isInReverse ? 1 : 0)) {
                    this.rotationYaw += 180.0f;
                }
            }
            final double lllllllllllllIIlIllIIllIlIlllIlI = MathHelper.wrapAngleTo180_float(this.rotationYaw - this.prevRotationYaw);
            if (!llIlIllIlIlIlIl(llIlIllIlIIlllI(lllllllllllllIIlIllIIllIlIlllIlI, -170.0)) || llIlIllIlIlIlIl(llIlIllIlIIllll(lllllllllllllIIlIllIIllIlIlllIlI, 170.0))) {
                this.rotationYaw += 180.0f;
                int isInReverse;
                if (llIlIllIlIIlIII(this.isInReverse ? 1 : 0)) {
                    isInReverse = EntityMinecart.lIIllIIIllIlIl[1];
                    "".length();
                    if (-"   ".length() >= 0) {
                        return;
                    }
                }
                else {
                    isInReverse = EntityMinecart.lIIllIIIllIlIl[5];
                }
                this.isInReverse = (isInReverse != 0);
            }
            this.setRotation(this.rotationYaw, this.rotationPitch);
            final boolean lllllllllllllIIlIllIIllIlIlIllIl = (boolean)this.worldObj.getEntitiesWithinAABBExcludingEntity(this, this.getEntityBoundingBox().expand(0.20000000298023224, 0.0, 0.20000000298023224)).iterator();
            "".length();
            if ("   ".length() < " ".length()) {
                return;
            }
            while (!llIlIllIlIIlIlI(((Iterator)lllllllllllllIIlIllIIllIlIlIllIl).hasNext() ? 1 : 0)) {
                final Entity lllllllllllllIIlIllIIllIlIlllIIl = ((Iterator<Entity>)lllllllllllllIIlIllIIllIlIlIllIl).next();
                if (llIlIllIlIlIllI(lllllllllllllIIlIllIIllIlIlllIIl, this.riddenByEntity) && llIlIllIlIIlIII(lllllllllllllIIlIllIIllIlIlllIIl.canBePushed() ? 1 : 0) && llIlIllIlIIlIII((lllllllllllllIIlIllIIllIlIlllIIl instanceof EntityMinecart) ? 1 : 0)) {
                    lllllllllllllIIlIllIIllIlIlllIIl.applyEntityCollision(this);
                }
            }
            if (llIlIllIlIIllII(this.riddenByEntity) && llIlIllIlIIlIII(this.riddenByEntity.isDead ? 1 : 0)) {
                if (llIlIllIlIlIlII(this.riddenByEntity.ridingEntity, this)) {
                    this.riddenByEntity.ridingEntity = null;
                }
                this.riddenByEntity = null;
            }
            this.handleWaterMovement();
            "".length();
        }
    }
    
    public void setRollingDirection(final int lllllllllllllIIlIllIIlIIllllIlll) {
        this.dataWatcher.updateObject(EntityMinecart.lIIllIIIllIlIl[13], lllllllllllllIIlIllIIlIIllllIlll);
    }
    
    private static int llIlIllIlIIlllI(final double n, final double n2) {
        return dcmpg(n, n2);
    }
    
    private static boolean llIlIllIlIIlIII(final int lllllllllllllIIlIllIIlIIIllIllll) {
        return lllllllllllllIIlIllIIlIIIllIllll != 0;
    }
    
    public static EntityMinecart func_180458_a(final World lllllllllllllIIlIllIIlllIIIlIIIl, final double lllllllllllllIIlIllIIlllIIIlIlIl, final double lllllllllllllIIlIllIIlllIIIlIlII, final double lllllllllllllIIlIllIIlllIIIIlllI, final EnumMinecartType lllllllllllllIIlIllIIlllIIIIllIl) {
        switch ($SWITCH_TABLE$net$minecraft$entity$item$EntityMinecart$EnumMinecartType()[lllllllllllllIIlIllIIlllIIIIllIl.ordinal()]) {
            case 2: {
                return new EntityMinecartChest(lllllllllllllIIlIllIIlllIIIlIIIl, lllllllllllllIIlIllIIlllIIIlIlIl, lllllllllllllIIlIllIIlllIIIlIlII, lllllllllllllIIlIllIIlllIIIIlllI);
            }
            case 3: {
                return new EntityMinecartFurnace(lllllllllllllIIlIllIIlllIIIlIIIl, lllllllllllllIIlIllIIlllIIIlIlIl, lllllllllllllIIlIllIIlllIIIlIlII, lllllllllllllIIlIllIIlllIIIIlllI);
            }
            case 4: {
                return new EntityMinecartTNT(lllllllllllllIIlIllIIlllIIIlIIIl, lllllllllllllIIlIllIIlllIIIlIlIl, lllllllllllllIIlIllIIlllIIIlIlII, lllllllllllllIIlIllIIlllIIIIlllI);
            }
            case 5: {
                return new EntityMinecartMobSpawner(lllllllllllllIIlIllIIlllIIIlIIIl, lllllllllllllIIlIllIIlllIIIlIlIl, lllllllllllllIIlIllIIlllIIIlIlII, lllllllllllllIIlIllIIlllIIIIlllI);
            }
            case 6: {
                return new EntityMinecartHopper(lllllllllllllIIlIllIIlllIIIlIIIl, lllllllllllllIIlIllIIlllIIIlIlIl, lllllllllllllIIlIllIIlllIIIlIlII, lllllllllllllIIlIllIIlllIIIIlllI);
            }
            case 7: {
                return new EntityMinecartCommandBlock(lllllllllllllIIlIllIIlllIIIlIIIl, lllllllllllllIIlIllIIlllIIIlIlIl, lllllllllllllIIlIllIIlllIIIlIlII, lllllllllllllIIlIllIIlllIIIIlllI);
            }
            default: {
                return new EntityMinecartEmpty(lllllllllllllIIlIllIIlllIIIlIIIl, lllllllllllllIIlIllIIlllIIIlIlIl, lllllllllllllIIlIllIIlllIIIlIlII, lllllllllllllIIlIllIIlllIIIIlllI);
            }
        }
    }
    
    static /* synthetic */ int[] $SWITCH_TABLE$net$minecraft$entity$item$EntityMinecart$EnumMinecartType() {
        final int[] $switch_TABLE$net$minecraft$entity$item$EntityMinecart$EnumMinecartType = EntityMinecart.$SWITCH_TABLE$net$minecraft$entity$item$EntityMinecart$EnumMinecartType;
        if (llIlIllIlIIllII($switch_TABLE$net$minecraft$entity$item$EntityMinecart$EnumMinecartType)) {
            return $switch_TABLE$net$minecraft$entity$item$EntityMinecart$EnumMinecartType;
        }
        "".length();
        final char lllllllllllllIIlIllIIlIIlIllllIl = (Object)new int[EnumMinecartType.values().length];
        try {
            lllllllllllllIIlIllIIlIIlIllllIl[EnumMinecartType.CHEST.ordinal()] = EntityMinecart.lIIllIIIllIlIl[2];
            "".length();
            if (-(0xAF ^ 0xAB) > 0) {
                return null;
            }
        }
        catch (NoSuchFieldError noSuchFieldError) {
            "".length();
        }
        try {
            lllllllllllllIIlIllIIlIIlIllllIl[EnumMinecartType.COMMAND_BLOCK.ordinal()] = EntityMinecart.lIIllIIIllIlIl[9];
            "".length();
            if (null != null) {
                return null;
            }
        }
        catch (NoSuchFieldError noSuchFieldError2) {
            "".length();
        }
        try {
            lllllllllllllIIlIllIIlIIlIllllIl[EnumMinecartType.FURNACE.ordinal()] = EntityMinecart.lIIllIIIllIlIl[3];
            "".length();
            if (" ".length() > "  ".length()) {
                return null;
            }
        }
        catch (NoSuchFieldError noSuchFieldError3) {
            "".length();
        }
        try {
            lllllllllllllIIlIllIIlIIlIllllIl[EnumMinecartType.HOPPER.ordinal()] = EntityMinecart.lIIllIIIllIlIl[8];
            "".length();
            if (((((0x2E ^ 0x4E) & ~(0x0 ^ 0x60)) ^ (0x1D ^ 0x3D)) & (109 + 157 - 191 + 95 ^ 86 + 94 - 157 + 115 ^ -" ".length())) != 0x0) {
                return null;
            }
        }
        catch (NoSuchFieldError noSuchFieldError4) {
            "".length();
        }
        try {
            lllllllllllllIIlIllIIlIIlIllllIl[EnumMinecartType.RIDEABLE.ordinal()] = EntityMinecart.lIIllIIIllIlIl[5];
            "".length();
            if (" ".length() <= 0) {
                return null;
            }
        }
        catch (NoSuchFieldError noSuchFieldError5) {
            "".length();
        }
        try {
            lllllllllllllIIlIllIIlIIlIllllIl[EnumMinecartType.SPAWNER.ordinal()] = EntityMinecart.lIIllIIIllIlIl[7];
            "".length();
            if (null != null) {
                return null;
            }
        }
        catch (NoSuchFieldError noSuchFieldError6) {
            "".length();
        }
        try {
            lllllllllllllIIlIllIIlIIlIllllIl[EnumMinecartType.TNT.ordinal()] = EntityMinecart.lIIllIIIllIlIl[6];
            "".length();
            if (null != null) {
                return null;
            }
        }
        catch (NoSuchFieldError noSuchFieldError7) {
            "".length();
        }
        return EntityMinecart.$SWITCH_TABLE$net$minecraft$entity$item$EntityMinecart$EnumMinecartType = (int[])(Object)lllllllllllllIIlIllIIlIIlIllllIl;
    }
    
    public EntityMinecart(final World lllllllllllllIIlIllIIllIllllIlll, final double lllllllllllllIIlIllIIllIlllllIll, final double lllllllllllllIIlIllIIllIllllIlIl, final double lllllllllllllIIlIllIIllIlllllIIl) {
        this(lllllllllllllIIlIllIIllIllllIlll);
        this.setPosition(lllllllllllllIIlIllIIllIlllllIll, lllllllllllllIIlIllIIllIllllIlIl, lllllllllllllIIlIllIIllIlllllIIl);
        this.motionX = 0.0;
        this.motionY = 0.0;
        this.motionZ = 0.0;
        this.prevPosX = lllllllllllllIIlIllIIllIlllllIll;
        this.prevPosY = lllllllllllllIIlIllIIllIllllIlIl;
        this.prevPosZ = lllllllllllllIIlIllIIllIlllllIIl;
    }
    
    private static boolean llIlIllIlIlIIlI(final int lllllllllllllIIlIllIIlIIlIIIIIlI, final int lllllllllllllIIlIllIIlIIlIIIIIIl) {
        return lllllllllllllIIlIllIIlIIlIIIIIlI >= lllllllllllllIIlIllIIlIIlIIIIIIl;
    }
    
    static /* synthetic */ int[] $SWITCH_TABLE$net$minecraft$block$BlockRailBase$EnumRailDirection() {
        final int[] $switch_TABLE$net$minecraft$block$BlockRailBase$EnumRailDirection = EntityMinecart.$SWITCH_TABLE$net$minecraft$block$BlockRailBase$EnumRailDirection;
        if (llIlIllIlIIllII($switch_TABLE$net$minecraft$block$BlockRailBase$EnumRailDirection)) {
            return $switch_TABLE$net$minecraft$block$BlockRailBase$EnumRailDirection;
        }
        "".length();
        final String lllllllllllllIIlIllIIlIIlIlllIll = (Object)new int[BlockRailBase.EnumRailDirection.values().length];
        try {
            lllllllllllllIIlIllIIlIIlIlllIll[BlockRailBase.EnumRailDirection.ASCENDING_EAST.ordinal()] = EntityMinecart.lIIllIIIllIlIl[3];
            "".length();
            if (-" ".length() >= ((0x13 ^ 0x1D ^ (0x5E ^ 0x41)) & (0x4A ^ 0x15 ^ (0x24 ^ 0x6A) ^ -" ".length()))) {
                return null;
            }
        }
        catch (NoSuchFieldError noSuchFieldError) {
            "".length();
        }
        try {
            lllllllllllllIIlIllIIlIIlIlllIll[BlockRailBase.EnumRailDirection.ASCENDING_NORTH.ordinal()] = EntityMinecart.lIIllIIIllIlIl[7];
            "".length();
            if (" ".length() == 0) {
                return null;
            }
        }
        catch (NoSuchFieldError noSuchFieldError2) {
            "".length();
        }
        try {
            lllllllllllllIIlIllIIlIIlIlllIll[BlockRailBase.EnumRailDirection.ASCENDING_SOUTH.ordinal()] = EntityMinecart.lIIllIIIllIlIl[8];
            "".length();
            if (" ".length() >= (123 + 80 - 92 + 35 ^ 8 + 138 - 72 + 76)) {
                return null;
            }
        }
        catch (NoSuchFieldError noSuchFieldError3) {
            "".length();
        }
        try {
            lllllllllllllIIlIllIIlIIlIlllIll[BlockRailBase.EnumRailDirection.ASCENDING_WEST.ordinal()] = EntityMinecart.lIIllIIIllIlIl[6];
            "".length();
            if (-(9 + 46 + 28 + 90 ^ 55 + 13 + 80 + 21) >= 0) {
                return null;
            }
        }
        catch (NoSuchFieldError noSuchFieldError4) {
            "".length();
        }
        try {
            lllllllllllllIIlIllIIlIIlIlllIll[BlockRailBase.EnumRailDirection.EAST_WEST.ordinal()] = EntityMinecart.lIIllIIIllIlIl[2];
            "".length();
            if (" ".length() == 0) {
                return null;
            }
        }
        catch (NoSuchFieldError noSuchFieldError5) {
            "".length();
        }
        try {
            lllllllllllllIIlIllIIlIIlIlllIll[BlockRailBase.EnumRailDirection.NORTH_EAST.ordinal()] = EntityMinecart.lIIllIIIllIlIl[0];
            "".length();
            if (null != null) {
                return null;
            }
        }
        catch (NoSuchFieldError noSuchFieldError6) {
            "".length();
        }
        try {
            lllllllllllllIIlIllIIlIIlIlllIll[BlockRailBase.EnumRailDirection.NORTH_SOUTH.ordinal()] = EntityMinecart.lIIllIIIllIlIl[5];
            "".length();
            if (-"   ".length() >= 0) {
                return null;
            }
        }
        catch (NoSuchFieldError noSuchFieldError7) {
            "".length();
        }
        try {
            lllllllllllllIIlIllIIlIIlIlllIll[BlockRailBase.EnumRailDirection.NORTH_WEST.ordinal()] = EntityMinecart.lIIllIIIllIlIl[11];
            "".length();
            if (null != null) {
                return null;
            }
        }
        catch (NoSuchFieldError noSuchFieldError8) {
            "".length();
        }
        try {
            lllllllllllllIIlIllIIlIIlIlllIll[BlockRailBase.EnumRailDirection.SOUTH_EAST.ordinal()] = EntityMinecart.lIIllIIIllIlIl[9];
            "".length();
            if (-"   ".length() > 0) {
                return null;
            }
        }
        catch (NoSuchFieldError noSuchFieldError9) {
            "".length();
        }
        try {
            lllllllllllllIIlIllIIlIIlIlllIll[BlockRailBase.EnumRailDirection.SOUTH_WEST.ordinal()] = EntityMinecart.lIIllIIIllIlIl[10];
            "".length();
            if (((127 + 159 - 169 + 59 ^ 70 + 113 - 176 + 137) & (147 + 105 - 85 + 21 ^ 110 + 115 - 130 + 61 ^ -" ".length())) >= "   ".length()) {
                return null;
            }
        }
        catch (NoSuchFieldError noSuchFieldError10) {
            "".length();
        }
        return EntityMinecart.$SWITCH_TABLE$net$minecraft$block$BlockRailBase$EnumRailDirection = (int[])(Object)lllllllllllllIIlIllIIlIIlIlllIll;
    }
    
    @Override
    public String getName() {
        String s;
        if (llIlIllIlIIllII(this.entityName)) {
            s = this.entityName;
            "".length();
            if ((0x57 ^ 0x64 ^ (0x9E ^ 0xA9)) != (49 + 36 - 59 + 151 ^ 113 + 148 - 193 + 113)) {
                return null;
            }
        }
        else {
            s = super.getName();
        }
        return s;
    }
    
    private static int llIlIllIlIIlIIl(final float n, final float n2) {
        return fcmpl(n, n2);
    }
    
    @Override
    public void setDead() {
        super.setDead();
    }
    
    public int getRollingAmplitude() {
        return this.dataWatcher.getWatchableObjectInt(EntityMinecart.lIIllIIIllIlIl[12]);
    }
    
    @Override
    public void setPositionAndRotation2(final double lllllllllllllIIlIllIIlIlIIIllllI, final double lllllllllllllIIlIllIIlIlIIIlllIl, final double lllllllllllllIIlIllIIlIlIIlIIlII, final float lllllllllllllIIlIllIIlIlIIlIIIll, final float lllllllllllllIIlIllIIlIlIIIllIlI, final int lllllllllllllIIlIllIIlIlIIIllIIl, final boolean lllllllllllllIIlIllIIlIlIIlIIIII) {
        this.minecartX = lllllllllllllIIlIllIIlIlIIIllllI;
        this.minecartY = lllllllllllllIIlIllIIlIlIIIlllIl;
        this.minecartZ = lllllllllllllIIlIllIIlIlIIlIIlII;
        this.minecartYaw = lllllllllllllIIlIllIIlIlIIlIIIll;
        this.minecartPitch = lllllllllllllIIlIllIIlIlIIIllIlI;
        this.turnProgress = lllllllllllllIIlIllIIlIlIIIllIIl + EntityMinecart.lIIllIIIllIlIl[2];
        this.motionX = this.velocityX;
        this.motionY = this.velocityY;
        this.motionZ = this.velocityZ;
    }
    
    private static int llIlIllIlIllIlI(final double n, final double n2) {
        return dcmpl(n, n2);
    }
    
    private static String llIlIllIlIIIIII(final String lllllllllllllIIlIllIIlIIlIIIllII, final String lllllllllllllIIlIllIIlIIlIIIllIl) {
        try {
            final SecretKeySpec lllllllllllllIIlIllIIlIIlIIlIIIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIIlIllIIlIIlIIIllIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lllllllllllllIIlIllIIlIIlIIlIIII = Cipher.getInstance("Blowfish");
            lllllllllllllIIlIllIIlIIlIIlIIII.init(EntityMinecart.lIIllIIIllIlIl[2], lllllllllllllIIlIllIIlIIlIIlIIIl);
            return new String(lllllllllllllIIlIllIIlIIlIIlIIII.doFinal(Base64.getDecoder().decode(lllllllllllllIIlIllIIlIIlIIIllII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIlIllIIlIIlIIIllll) {
            lllllllllllllIIlIllIIlIIlIIIllll.printStackTrace();
            return null;
        }
    }
    
    private static boolean llIlIllIlIlIIIl(final Object lllllllllllllIIlIllIIlIIIlllIIIl) {
        return lllllllllllllIIlIllIIlIIIlllIIIl == null;
    }
    
    private static void llIlIllIlIIIlll() {
        (lIIllIIIllIlIl = new int[24])[0] = (0x3F ^ 0x35);
        EntityMinecart.lIIllIIIllIlIl[1] = ((0x78 ^ 0x5E ^ (0x5E ^ 0x60)) & (0x4E ^ 0x67 ^ (0x93 ^ 0xA2) ^ -" ".length()));
        EntityMinecart.lIIllIIIllIlIl[2] = "  ".length();
        EntityMinecart.lIIllIIIllIlIl[3] = "   ".length();
        EntityMinecart.lIIllIIIllIlIl[4] = -" ".length();
        EntityMinecart.lIIllIIIllIlIl[5] = " ".length();
        EntityMinecart.lIIllIIIllIlIl[6] = (0x5A ^ 0x5E);
        EntityMinecart.lIIllIIIllIlIl[7] = (0x62 ^ 0x79 ^ (0x3A ^ 0x24));
        EntityMinecart.lIIllIIIllIlIl[8] = (0x3B ^ 0x3D);
        EntityMinecart.lIIllIIIllIlIl[9] = (0xC7 ^ 0xC0);
        EntityMinecart.lIIllIIIllIlIl[10] = (0x2C ^ 0x24);
        EntityMinecart.lIIllIIIllIlIl[11] = (0xB0 ^ 0xB9);
        EntityMinecart.lIIllIIIllIlIl[12] = (0x89 ^ 0x98);
        EntityMinecart.lIIllIIIllIlIl[13] = (0x6B ^ 0x43 ^ (0x63 ^ 0x59));
        EntityMinecart.lIIllIIIllIlIl[14] = (0xF ^ 0x1C);
        EntityMinecart.lIIllIIIllIlIl[15] = (0x13 ^ 0x78 ^ 58 + 96 - 38 + 11);
        EntityMinecart.lIIllIIIllIlIl[16] = (0x3C ^ 0x7A ^ (0x54 ^ 0x7));
        EntityMinecart.lIIllIIIllIlIl[17] = (0x47 ^ 0x51 ^ ((0x75 ^ 0x56) & ~(0x10 ^ 0x33)));
        EntityMinecart.lIIllIIIllIlIl[18] = (0x16 ^ 0x1D);
        EntityMinecart.lIIllIIIllIlIl[19] = (0x42 ^ 0x61 ^ (0x3B ^ 0x14));
        EntityMinecart.lIIllIIIllIlIl[20] = (0x4F ^ 0x42);
        EntityMinecart.lIIllIIIllIlIl[21] = (0x1C ^ 0x12);
        EntityMinecart.lIIllIIIllIlIl[22] = (0x3B ^ 0x34);
        EntityMinecart.lIIllIIIllIlIl[23] = (0x63 ^ 0x73);
    }
    
    protected double getMaximumSpeed() {
        return 0.4;
    }
    
    @Override
    public void performHurtAnimation() {
        this.setRollingDirection(-this.getRollingDirection());
        this.setRollingAmplitude(EntityMinecart.lIIllIIIllIlIl[0]);
        this.setDamage(this.getDamage() + this.getDamage() * 10.0f);
    }
    
    private static boolean llIlIllIlIIlIlI(final int lllllllllllllIIlIllIIlIIIllIllIl) {
        return lllllllllllllIIlIllIIlIIIllIllIl == 0;
    }
    
    public void setHasDisplayTile(final boolean lllllllllllllIIlIllIIlIIllIlIlIl) {
        final DataWatcher dataWatcher = this.getDataWatcher();
        final int llllllllllllIllIlIIlIIlllIIIIlIl = EntityMinecart.lIIllIIIllIlIl[17];
        int n;
        if (llIlIllIlIIlIII(lllllllllllllIIlIllIIlIIllIlIlIl ? 1 : 0)) {
            n = EntityMinecart.lIIllIIIllIlIl[5];
            "".length();
            if ("   ".length() == 0) {
                return;
            }
        }
        else {
            n = EntityMinecart.lIIllIIIllIlIl[1];
        }
        dataWatcher.updateObject(llllllllllllIllIlIIlIIlllIIIIlIl, (byte)n);
    }
    
    public void killMinecart(final DamageSource lllllllllllllIIlIllIIllIlllIIIll) {
        this.setDead();
        if (llIlIllIlIIlIII(this.worldObj.getGameRules().getBoolean(EntityMinecart.lIIllIIIlIllIl[EntityMinecart.lIIllIIIllIlIl[1]]) ? 1 : 0)) {
            final ItemStack lllllllllllllIIlIllIIllIlllIIIlI = new ItemStack(Items.minecart, EntityMinecart.lIIllIIIllIlIl[5]);
            if (llIlIllIlIIllII(this.entityName)) {
                lllllllllllllIIlIllIIllIlllIIIlI.setStackDisplayName(this.entityName);
                "".length();
            }
            this.entityDropItem(lllllllllllllIIlIllIIllIlllIIIlI, 0.0f);
            "".length();
        }
    }
    
    public boolean hasDisplayTile() {
        if (llIlIllIlIlIIll(this.getDataWatcher().getWatchableObjectByte(EntityMinecart.lIIllIIIllIlIl[17]), EntityMinecart.lIIllIIIllIlIl[5])) {
            return EntityMinecart.lIIllIIIllIlIl[5] != 0;
        }
        return EntityMinecart.lIIllIIIllIlIl[1] != 0;
    }
    
    protected void func_180460_a(final BlockPos lllllllllllllIIlIllIIllIIllllllI, final IBlockState lllllllllllllIIlIllIIllIIlllllIl) {
        this.fallDistance = 0.0f;
        final Vec3 lllllllllllllIIlIllIIllIIlllllII = this.func_70489_a(this.posX, this.posY, this.posZ);
        this.posY = lllllllllllllIIlIllIIllIIllllllI.getY();
        boolean lllllllllllllIIlIllIIllIIllllIlI = EntityMinecart.lIIllIIIllIlIl[1] != 0;
        boolean lllllllllllllIIlIllIIllIIllllIIl = EntityMinecart.lIIllIIIllIlIl[1] != 0;
        final BlockRailBase lllllllllllllIIlIllIIllIIlllIlll = (BlockRailBase)lllllllllllllIIlIllIIllIIlllllIl.getBlock();
        if (llIlIllIlIlIlII(lllllllllllllIIlIllIIllIIlllIlll, Blocks.golden_rail)) {
            lllllllllllllIIlIllIIllIIllllIlI = lllllllllllllIIlIllIIllIIlllllIl.getValue((IProperty<Boolean>)BlockRailPowered.POWERED);
            int n;
            if (llIlIllIlIIlIII(lllllllllllllIIlIllIIllIIllllIlI ? 1 : 0)) {
                n = EntityMinecart.lIIllIIIllIlIl[1];
                "".length();
                if (((0x64 ^ 0x69) & ~(0x63 ^ 0x6E)) != 0x0) {
                    return;
                }
            }
            else {
                n = EntityMinecart.lIIllIIIllIlIl[5];
            }
            lllllllllllllIIlIllIIllIIllllIIl = (n != 0);
        }
        final double lllllllllllllIIlIllIIllIIlllIlIl = 0.0078125;
        final BlockRailBase.EnumRailDirection lllllllllllllIIlIllIIllIIlllIlII = lllllllllllllIIlIllIIllIIlllllIl.getValue(lllllllllllllIIlIllIIllIIlllIlll.getShapeProperty());
        switch ($SWITCH_TABLE$net$minecraft$block$BlockRailBase$EnumRailDirection()[lllllllllllllIIlIllIIllIIlllIlII.ordinal()]) {
            case 3: {
                this.motionX -= 0.0078125;
                ++this.posY;
                "".length();
                if (-(0x35 ^ 0x31) > 0) {
                    return;
                }
                break;
            }
            case 4: {
                this.motionX += 0.0078125;
                ++this.posY;
                "".length();
                if ("   ".length() < 0) {
                    return;
                }
                break;
            }
            case 5: {
                this.motionZ += 0.0078125;
                ++this.posY;
                "".length();
                if (((0xE2 ^ 0xAE) & ~(0xCC ^ 0x80)) != ((0xA ^ 0x1F) & ~(0x8E ^ 0x9B))) {
                    return;
                }
                break;
            }
            case 6: {
                this.motionZ -= 0.0078125;
                ++this.posY;
                break;
            }
        }
        final int[][] lllllllllllllIIlIllIIllIIlllIIlI = EntityMinecart.matrix[lllllllllllllIIlIllIIllIIlllIlII.getMetadata()];
        double lllllllllllllIIlIllIIllIIlllIIII = lllllllllllllIIlIllIIllIIlllIIlI[EntityMinecart.lIIllIIIllIlIl[5]][EntityMinecart.lIIllIIIllIlIl[1]] - lllllllllllllIIlIllIIllIIlllIIlI[EntityMinecart.lIIllIIIllIlIl[1]][EntityMinecart.lIIllIIIllIlIl[1]];
        double lllllllllllllIIlIllIIllIIllIlllI = lllllllllllllIIlIllIIllIIlllIIlI[EntityMinecart.lIIllIIIllIlIl[5]][EntityMinecart.lIIllIIIllIlIl[2]] - lllllllllllllIIlIllIIllIIlllIIlI[EntityMinecart.lIIllIIIllIlIl[1]][EntityMinecart.lIIllIIIllIlIl[2]];
        final double lllllllllllllIIlIllIIllIIllIllII = Math.sqrt(lllllllllllllIIlIllIIllIIlllIIII * lllllllllllllIIlIllIIllIIlllIIII + lllllllllllllIIlIllIIllIIllIlllI * lllllllllllllIIlIllIIllIIllIlllI);
        final double lllllllllllllIIlIllIIllIIllIlIlI = this.motionX * lllllllllllllIIlIllIIllIIlllIIII + this.motionZ * lllllllllllllIIlIllIIllIIllIlllI;
        if (llIlIllIlIlIIII(llIlIllIlIlIlll(lllllllllllllIIlIllIIllIIllIlIlI, 0.0))) {
            lllllllllllllIIlIllIIllIIlllIIII = -lllllllllllllIIlIllIIllIIlllIIII;
            lllllllllllllIIlIllIIllIIllIlllI = -lllllllllllllIIlIllIIllIIllIlllI;
        }
        double lllllllllllllIIlIllIIllIIllIlIII = Math.sqrt(this.motionX * this.motionX + this.motionZ * this.motionZ);
        if (llIlIllIlIIlIll(llIlIllIlIllIII(lllllllllllllIIlIllIIllIIllIlIII, 2.0))) {
            lllllllllllllIIlIllIIllIIllIlIII = 2.0;
        }
        this.motionX = lllllllllllllIIlIllIIllIIllIlIII * lllllllllllllIIlIllIIllIIlllIIII / lllllllllllllIIlIllIIllIIllIllII;
        this.motionZ = lllllllllllllIIlIllIIllIIllIlIII * lllllllllllllIIlIllIIllIIllIlllI / lllllllllllllIIlIllIIllIIllIllII;
        if (llIlIllIlIIlIII((this.riddenByEntity instanceof EntityLivingBase) ? 1 : 0)) {
            final double lllllllllllllIIlIllIIllIIllIIllI = ((EntityLivingBase)this.riddenByEntity).moveForward;
            if (llIlIllIlIIlIll(llIlIllIlIllIII(lllllllllllllIIlIllIIllIIllIIllI, 0.0))) {
                final double lllllllllllllIIlIllIIllIIllIIlII = -Math.sin(this.riddenByEntity.rotationYaw * 3.1415927f / 180.0f);
                final double lllllllllllllIIlIllIIllIIllIIIlI = Math.cos(this.riddenByEntity.rotationYaw * 3.1415927f / 180.0f);
                final double lllllllllllllIIlIllIIllIIllIIIII = this.motionX * this.motionX + this.motionZ * this.motionZ;
                if (llIlIllIlIlIIII(llIlIllIlIlIlll(lllllllllllllIIlIllIIllIIllIIIII, 0.01))) {
                    this.motionX += lllllllllllllIIlIllIIllIIllIIlII * 0.1;
                    this.motionZ += lllllllllllllIIlIllIIllIIllIIIlI * 0.1;
                    lllllllllllllIIlIllIIllIIllllIIl = (EntityMinecart.lIIllIIIllIlIl[1] != 0);
                }
            }
        }
        if (llIlIllIlIIlIII(lllllllllllllIIlIllIIllIIllllIIl ? 1 : 0)) {
            final double lllllllllllllIIlIllIIllIIlIlllll = Math.sqrt(this.motionX * this.motionX + this.motionZ * this.motionZ);
            if (llIlIllIlIlIIII(llIlIllIlIlIlll(lllllllllllllIIlIllIIllIIlIlllll, 0.03))) {
                this.motionX *= 0.0;
                this.motionY *= 0.0;
                this.motionZ *= 0.0;
                "".length();
                if (" ".length() != " ".length()) {
                    return;
                }
            }
            else {
                this.motionX *= 0.5;
                this.motionY *= 0.0;
                this.motionZ *= 0.5;
            }
        }
        double lllllllllllllIIlIllIIllIIlIllllI = 0.0;
        final double lllllllllllllIIlIllIIllIIlIlllII = lllllllllllllIIlIllIIllIIllllllI.getX() + 0.5 + lllllllllllllIIlIllIIllIIlllIIlI[EntityMinecart.lIIllIIIllIlIl[1]][EntityMinecart.lIIllIIIllIlIl[1]] * 0.5;
        final double lllllllllllllIIlIllIIllIIlIllIlI = lllllllllllllIIlIllIIllIIllllllI.getZ() + 0.5 + lllllllllllllIIlIllIIllIIlllIIlI[EntityMinecart.lIIllIIIllIlIl[1]][EntityMinecart.lIIllIIIllIlIl[2]] * 0.5;
        final double lllllllllllllIIlIllIIllIIlIllIIl = lllllllllllllIIlIllIIllIIllllllI.getX() + 0.5 + lllllllllllllIIlIllIIllIIlllIIlI[EntityMinecart.lIIllIIIllIlIl[5]][EntityMinecart.lIIllIIIllIlIl[1]] * 0.5;
        final double lllllllllllllIIlIllIIllIIlIlIlll = lllllllllllllIIlIllIIllIIllllllI.getZ() + 0.5 + lllllllllllllIIlIllIIllIIlllIIlI[EntityMinecart.lIIllIIIllIlIl[5]][EntityMinecart.lIIllIIIllIlIl[2]] * 0.5;
        lllllllllllllIIlIllIIllIIlllIIII = lllllllllllllIIlIllIIllIIlIllIIl - lllllllllllllIIlIllIIllIIlIlllII;
        lllllllllllllIIlIllIIllIIllIlllI = lllllllllllllIIlIllIIllIIlIlIlll - lllllllllllllIIlIllIIllIIlIllIlI;
        if (llIlIllIlIIlIlI(llIlIllIlIllIII(lllllllllllllIIlIllIIllIIlllIIII, 0.0))) {
            this.posX = lllllllllllllIIlIllIIllIIllllllI.getX() + 0.5;
            lllllllllllllIIlIllIIllIIlIllllI = this.posZ - lllllllllllllIIlIllIIllIIllllllI.getZ();
            "".length();
            if (-"  ".length() > 0) {
                return;
            }
        }
        else if (llIlIllIlIIlIlI(llIlIllIlIllIII(lllllllllllllIIlIllIIllIIllIlllI, 0.0))) {
            this.posZ = lllllllllllllIIlIllIIllIIllllllI.getZ() + 0.5;
            lllllllllllllIIlIllIIllIIlIllllI = this.posX - lllllllllllllIIlIllIIllIIllllllI.getX();
            "".length();
            if (((44 + 72 - 48 + 102 ^ 122 + 34 - 19 + 4) & (0x8F ^ 0x99 ^ (0x93 ^ 0xA2) ^ -" ".length())) != 0x0) {
                return;
            }
        }
        else {
            final double lllllllllllllIIlIllIIllIIlIlIlIl = this.posX - lllllllllllllIIlIllIIllIIlIlllII;
            final double lllllllllllllIIlIllIIllIIlIlIIll = this.posZ - lllllllllllllIIlIllIIllIIlIllIlI;
            lllllllllllllIIlIllIIllIIlIllllI = (lllllllllllllIIlIllIIllIIlIlIlIl * lllllllllllllIIlIllIIllIIlllIIII + lllllllllllllIIlIllIIllIIlIlIIll * lllllllllllllIIlIllIIllIIllIlllI) * 2.0;
        }
        this.posX = lllllllllllllIIlIllIIllIIlIlllII + lllllllllllllIIlIllIIllIIlllIIII * lllllllllllllIIlIllIIllIIlIllllI;
        this.posZ = lllllllllllllIIlIllIIllIIlIllIlI + lllllllllllllIIlIllIIllIIllIlllI * lllllllllllllIIlIllIIllIIlIllllI;
        this.setPosition(this.posX, this.posY, this.posZ);
        double lllllllllllllIIlIllIIllIIlIlIIIl = this.motionX;
        double lllllllllllllIIlIllIIllIIlIlIIII = this.motionZ;
        if (llIlIllIlIIllII(this.riddenByEntity)) {
            lllllllllllllIIlIllIIllIIlIlIIIl *= 0.75;
            lllllllllllllIIlIllIIllIIlIlIIII *= 0.75;
        }
        final double lllllllllllllIIlIllIIllIIlIIllll = this.getMaximumSpeed();
        lllllllllllllIIlIllIIllIIlIlIIIl = MathHelper.clamp_double(lllllllllllllIIlIllIIllIIlIlIIIl, -lllllllllllllIIlIllIIllIIlIIllll, lllllllllllllIIlIllIIllIIlIIllll);
        lllllllllllllIIlIllIIllIIlIlIIII = MathHelper.clamp_double(lllllllllllllIIlIllIIllIIlIlIIII, -lllllllllllllIIlIllIIllIIlIIllll, lllllllllllllIIlIllIIllIIlIIllll);
        this.moveEntity(lllllllllllllIIlIllIIllIIlIlIIIl, 0.0, lllllllllllllIIlIllIIllIIlIlIIII);
        if (llIlIllIlIIlIII(lllllllllllllIIlIllIIllIIlllIIlI[EntityMinecart.lIIllIIIllIlIl[1]][EntityMinecart.lIIllIIIllIlIl[5]]) && llIlIllIlIlIIll(MathHelper.floor_double(this.posX) - lllllllllllllIIlIllIIllIIllllllI.getX(), lllllllllllllIIlIllIIllIIlllIIlI[EntityMinecart.lIIllIIIllIlIl[1]][EntityMinecart.lIIllIIIllIlIl[1]]) && llIlIllIlIlIIll(MathHelper.floor_double(this.posZ) - lllllllllllllIIlIllIIllIIllllllI.getZ(), lllllllllllllIIlIllIIllIIlllIIlI[EntityMinecart.lIIllIIIllIlIl[1]][EntityMinecart.lIIllIIIllIlIl[2]])) {
            this.setPosition(this.posX, this.posY + lllllllllllllIIlIllIIllIIlllIIlI[EntityMinecart.lIIllIIIllIlIl[1]][EntityMinecart.lIIllIIIllIlIl[5]], this.posZ);
            "".length();
            if ((0xE ^ 0xA) == 0x0) {
                return;
            }
        }
        else if (llIlIllIlIIlIII(lllllllllllllIIlIllIIllIIlllIIlI[EntityMinecart.lIIllIIIllIlIl[5]][EntityMinecart.lIIllIIIllIlIl[5]]) && llIlIllIlIlIIll(MathHelper.floor_double(this.posX) - lllllllllllllIIlIllIIllIIllllllI.getX(), lllllllllllllIIlIllIIllIIlllIIlI[EntityMinecart.lIIllIIIllIlIl[5]][EntityMinecart.lIIllIIIllIlIl[1]]) && llIlIllIlIlIIll(MathHelper.floor_double(this.posZ) - lllllllllllllIIlIllIIllIIllllllI.getZ(), lllllllllllllIIlIllIIllIIlllIIlI[EntityMinecart.lIIllIIIllIlIl[5]][EntityMinecart.lIIllIIIllIlIl[2]])) {
            this.setPosition(this.posX, this.posY + lllllllllllllIIlIllIIllIIlllIIlI[EntityMinecart.lIIllIIIllIlIl[5]][EntityMinecart.lIIllIIIllIlIl[5]], this.posZ);
        }
        this.applyDrag();
        final Vec3 lllllllllllllIIlIllIIllIIlIIllIl = this.func_70489_a(this.posX, this.posY, this.posZ);
        if (llIlIllIlIIllII(lllllllllllllIIlIllIIllIIlIIllIl) && llIlIllIlIIllII(lllllllllllllIIlIllIIllIIlllllII)) {
            final double lllllllllllllIIlIllIIllIIlIIllII = (lllllllllllllIIlIllIIllIIlllllII.yCoord - lllllllllllllIIlIllIIllIIlIIllIl.yCoord) * 0.05;
            lllllllllllllIIlIllIIllIIllIlIII = Math.sqrt(this.motionX * this.motionX + this.motionZ * this.motionZ);
            if (llIlIllIlIIlIll(llIlIllIlIllIII(lllllllllllllIIlIllIIllIIllIlIII, 0.0))) {
                this.motionX = this.motionX / lllllllllllllIIlIllIIllIIllIlIII * (lllllllllllllIIlIllIIllIIllIlIII + lllllllllllllIIlIllIIllIIlIIllII);
                this.motionZ = this.motionZ / lllllllllllllIIlIllIIllIIllIlIII * (lllllllllllllIIlIllIIllIIllIlIII + lllllllllllllIIlIllIIllIIlIIllII);
            }
            this.setPosition(this.posX, lllllllllllllIIlIllIIllIIlIIllIl.yCoord, this.posZ);
        }
        final int lllllllllllllIIlIllIIllIIlIIlIll = MathHelper.floor_double(this.posX);
        final int lllllllllllllIIlIllIIllIIlIIlIlI = MathHelper.floor_double(this.posZ);
        if (!llIlIllIlIlIIll(lllllllllllllIIlIllIIllIIlIIlIll, lllllllllllllIIlIllIIllIIllllllI.getX()) || llIlIllIlIllIIl(lllllllllllllIIlIllIIllIIlIIlIlI, lllllllllllllIIlIllIIllIIllllllI.getZ())) {
            lllllllllllllIIlIllIIllIIllIlIII = Math.sqrt(this.motionX * this.motionX + this.motionZ * this.motionZ);
            this.motionX = lllllllllllllIIlIllIIllIIllIlIII * (lllllllllllllIIlIllIIllIIlIIlIll - lllllllllllllIIlIllIIllIIllllllI.getX());
            this.motionZ = lllllllllllllIIlIllIIllIIllIlIII * (lllllllllllllIIlIllIIllIIlIIlIlI - lllllllllllllIIlIllIIllIIllllllI.getZ());
        }
        if (llIlIllIlIIlIII(lllllllllllllIIlIllIIllIIllllIlI ? 1 : 0)) {
            final double lllllllllllllIIlIllIIllIIlIIlIIl = Math.sqrt(this.motionX * this.motionX + this.motionZ * this.motionZ);
            if (llIlIllIlIIlIll(llIlIllIlIllIII(lllllllllllllIIlIllIIllIIlIIlIIl, 0.01))) {
                final double lllllllllllllIIlIllIIllIIlIIlIII = 0.06;
                this.motionX += this.motionX / lllllllllllllIIlIllIIllIIlIIlIIl * lllllllllllllIIlIllIIllIIlIIlIII;
                this.motionZ += this.motionZ / lllllllllllllIIlIllIIllIIlIIlIIl * lllllllllllllIIlIllIIllIIlIIlIII;
                "".length();
                if (" ".length() == 0) {
                    return;
                }
            }
            else if (llIlIllIlIlIlII(lllllllllllllIIlIllIIllIIlllIlII, BlockRailBase.EnumRailDirection.EAST_WEST)) {
                if (llIlIllIlIIlIII(this.worldObj.getBlockState(lllllllllllllIIlIllIIllIIllllllI.west()).getBlock().isNormalCube() ? 1 : 0)) {
                    this.motionX = 0.02;
                    "".length();
                    if ("   ".length() < "   ".length()) {
                        return;
                    }
                }
                else if (llIlIllIlIIlIII(this.worldObj.getBlockState(lllllllllllllIIlIllIIllIIllllllI.east()).getBlock().isNormalCube() ? 1 : 0)) {
                    this.motionX = -0.02;
                    "".length();
                    if (((0x52 ^ 0x62) & ~(0x34 ^ 0x4)) != ((0x1B ^ 0xB) & ~(0xA2 ^ 0xB2))) {
                        return;
                    }
                }
            }
            else if (llIlIllIlIlIlII(lllllllllllllIIlIllIIllIIlllIlII, BlockRailBase.EnumRailDirection.NORTH_SOUTH)) {
                if (llIlIllIlIIlIII(this.worldObj.getBlockState(lllllllllllllIIlIllIIllIIllllllI.north()).getBlock().isNormalCube() ? 1 : 0)) {
                    this.motionZ = 0.02;
                    "".length();
                    if (null != null) {
                        return;
                    }
                }
                else if (llIlIllIlIIlIII(this.worldObj.getBlockState(lllllllllllllIIlIllIIllIIllllllI.south()).getBlock().isNormalCube() ? 1 : 0)) {
                    this.motionZ = -0.02;
                }
            }
        }
    }
    
    private static boolean llIlIllIlIllllI(final int lllllllllllllIIlIllIIlIIIllllllI, final int lllllllllllllIIlIllIIlIIIlllllIl) {
        return lllllllllllllIIlIllIIlIIIllllllI < lllllllllllllIIlIllIIlIIIlllllIl;
    }
    
    private static boolean llIlIllIlIlIlII(final Object lllllllllllllIIlIllIIlIIIlllIlII, final Object lllllllllllllIIlIllIIlIIIlllIIll) {
        return lllllllllllllIIlIllIIlIIIlllIlII == lllllllllllllIIlIllIIlIIIlllIIll;
    }
    
    private static int llIlIllIlIlllIl(final double n, final double n2) {
        return dcmpg(n, n2);
    }
    
    private static int llIlIllIlIlIlll(final double n, final double n2) {
        return dcmpg(n, n2);
    }
    
    public int getDefaultDisplayTileOffset() {
        return EntityMinecart.lIIllIIIllIlIl[8];
    }
    
    @Override
    public void setCustomNameTag(final String lllllllllllllIIlIllIIlIIllIIllll) {
        this.entityName = lllllllllllllIIlIllIIlIIllIIllll;
    }
    
    protected void applyDrag() {
        if (llIlIllIlIIllII(this.riddenByEntity)) {
            this.motionX *= 0.996999979019165;
            this.motionY *= 0.0;
            this.motionZ *= 0.996999979019165;
            "".length();
            if (((0x1 ^ 0x39 ^ (0x23 ^ 0x12)) & (120 + 38 - 116 + 85 ^ (0x70 ^ 0x6) ^ -" ".length())) != 0x0) {
                return;
            }
        }
        else {
            this.motionX *= 0.9599999785423279;
            this.motionY *= 0.0;
            this.motionZ *= 0.9599999785423279;
        }
    }
    
    @Override
    public void setPosition(final double lllllllllllllIIlIllIIllIIIIIIIIl, final double lllllllllllllIIlIllIIlIlllllllll, final double lllllllllllllIIlIllIIlIlllllllIl) {
        this.posX = lllllllllllllIIlIllIIllIIIIIIIIl;
        this.posY = lllllllllllllIIlIllIIlIlllllllll;
        this.posZ = lllllllllllllIIlIllIIlIlllllllIl;
        final float lllllllllllllIIlIllIIlIllllllIll = this.width / 2.0f;
        final float lllllllllllllIIlIllIIlIllllllIIl = this.height;
        this.setEntityBoundingBox(new AxisAlignedBB(lllllllllllllIIlIllIIllIIIIIIIIl - lllllllllllllIIlIllIIlIllllllIll, lllllllllllllIIlIllIIlIlllllllll, lllllllllllllIIlIllIIlIlllllllIl - lllllllllllllIIlIllIIlIllllllIll, lllllllllllllIIlIllIIllIIIIIIIIl + lllllllllllllIIlIllIIlIllllllIll, lllllllllllllIIlIllIIlIlllllllll + lllllllllllllIIlIllIIlIllllllIIl, lllllllllllllIIlIllIIlIlllllllIl + lllllllllllllIIlIllIIlIllllllIll));
    }
    
    public void setRollingAmplitude(final int lllllllllllllIIlIllIIlIlIIIIIIII) {
        this.dataWatcher.updateObject(EntityMinecart.lIIllIIIllIlIl[12], lllllllllllllIIlIllIIlIlIIIIIIII);
    }
    
    private static boolean llIlIllIlIlIIII(final int lllllllllllllIIlIllIIlIIIllIlIIl) {
        return lllllllllllllIIlIllIIlIIIllIlIIl < 0;
    }
    
    public EntityMinecart(final World lllllllllllllIIlIllIIlllIIIllllI) {
        super(lllllllllllllIIlIllIIlllIIIllllI);
        this.preventEntitySpawning = (EntityMinecart.lIIllIIIllIlIl[5] != 0);
        this.setSize(0.98f, 0.7f);
    }
    
    @Override
    public void applyEntityCollision(final Entity lllllllllllllIIlIllIIlIlIIlllIlI) {
        if (llIlIllIlIIlIlI(this.worldObj.isRemote ? 1 : 0) && llIlIllIlIIlIlI(lllllllllllllIIlIllIIlIlIIlllIlI.noClip ? 1 : 0) && llIlIllIlIIlIlI(this.noClip ? 1 : 0) && llIlIllIlIlIllI(lllllllllllllIIlIllIIlIlIIlllIlI, this.riddenByEntity)) {
            if (llIlIllIlIIlIII((lllllllllllllIIlIllIIlIlIIlllIlI instanceof EntityLivingBase) ? 1 : 0) && llIlIllIlIIlIlI((lllllllllllllIIlIllIIlIlIIlllIlI instanceof EntityPlayer) ? 1 : 0) && llIlIllIlIIlIlI((lllllllllllllIIlIllIIlIlIIlllIlI instanceof EntityIronGolem) ? 1 : 0) && llIlIllIlIlIlII(this.getMinecartType(), EnumMinecartType.RIDEABLE) && llIlIllIlIIlIll(llIlIllIlIlllII(this.motionX * this.motionX + this.motionZ * this.motionZ, 0.01)) && llIlIllIlIlIIIl(this.riddenByEntity) && llIlIllIlIlIIIl(lllllllllllllIIlIllIIlIlIIlllIlI.ridingEntity)) {
                lllllllllllllIIlIllIIlIlIIlllIlI.mountEntity(this);
            }
            double lllllllllllllIIlIllIIlIlIlIIIllI = lllllllllllllIIlIllIIlIlIIlllIlI.posX - this.posX;
            double lllllllllllllIIlIllIIlIlIlIIIlIl = lllllllllllllIIlIllIIlIlIIlllIlI.posZ - this.posZ;
            double lllllllllllllIIlIllIIlIlIlIIIlII = lllllllllllllIIlIllIIlIlIlIIIllI * lllllllllllllIIlIllIIlIlIlIIIllI + lllllllllllllIIlIllIIlIlIlIIIlIl * lllllllllllllIIlIllIIlIlIlIIIlIl;
            if (llIlIllIlIlIlIl(llIlIllIlIlllII(lllllllllllllIIlIllIIlIlIlIIIlII, 9.999999747378752E-5))) {
                lllllllllllllIIlIllIIlIlIlIIIlII = MathHelper.sqrt_double(lllllllllllllIIlIllIIlIlIlIIIlII);
                lllllllllllllIIlIllIIlIlIlIIIllI /= lllllllllllllIIlIllIIlIlIlIIIlII;
                lllllllllllllIIlIllIIlIlIlIIIlIl /= lllllllllllllIIlIllIIlIlIlIIIlII;
                double lllllllllllllIIlIllIIlIlIlIIIIll = 1.0 / lllllllllllllIIlIllIIlIlIlIIIlII;
                if (llIlIllIlIIlIll(llIlIllIlIlllII(lllllllllllllIIlIllIIlIlIlIIIIll, 1.0))) {
                    lllllllllllllIIlIllIIlIlIlIIIIll = 1.0;
                }
                lllllllllllllIIlIllIIlIlIlIIIllI *= lllllllllllllIIlIllIIlIlIlIIIIll;
                lllllllllllllIIlIllIIlIlIlIIIlIl *= lllllllllllllIIlIllIIlIlIlIIIIll;
                lllllllllllllIIlIllIIlIlIlIIIllI *= 0.10000000149011612;
                lllllllllllllIIlIllIIlIlIlIIIlIl *= 0.10000000149011612;
                lllllllllllllIIlIllIIlIlIlIIIllI *= 1.0f - this.entityCollisionReduction;
                lllllllllllllIIlIllIIlIlIlIIIlIl *= 1.0f - this.entityCollisionReduction;
                lllllllllllllIIlIllIIlIlIlIIIllI *= 0.5;
                lllllllllllllIIlIllIIlIlIlIIIlIl *= 0.5;
                if (llIlIllIlIIlIII((lllllllllllllIIlIllIIlIlIIlllIlI instanceof EntityMinecart) ? 1 : 0)) {
                    final double lllllllllllllIIlIllIIlIlIlIIIIlI = lllllllllllllIIlIllIIlIlIIlllIlI.posX - this.posX;
                    final double lllllllllllllIIlIllIIlIlIlIIIIIl = lllllllllllllIIlIllIIlIlIIlllIlI.posZ - this.posZ;
                    final Vec3 lllllllllllllIIlIllIIlIlIlIIIIII = new Vec3(lllllllllllllIIlIllIIlIlIlIIIIlI, 0.0, lllllllllllllIIlIllIIlIlIlIIIIIl).normalize();
                    final Vec3 lllllllllllllIIlIllIIlIlIIllllll = new Vec3(MathHelper.cos(this.rotationYaw * 3.1415927f / 180.0f), 0.0, MathHelper.sin(this.rotationYaw * 3.1415927f / 180.0f)).normalize();
                    final double lllllllllllllIIlIllIIlIlIIlllllI = Math.abs(lllllllllllllIIlIllIIlIlIlIIIIII.dotProduct(lllllllllllllIIlIllIIlIlIIllllll));
                    if (llIlIllIlIlIIII(llIlIllIlIlllIl(lllllllllllllIIlIllIIlIlIIlllllI, 0.800000011920929))) {
                        return;
                    }
                    double lllllllllllllIIlIllIIlIlIIllllIl = lllllllllllllIIlIllIIlIlIIlllIlI.motionX + this.motionX;
                    double lllllllllllllIIlIllIIlIlIIllllII = lllllllllllllIIlIllIIlIlIIlllIlI.motionZ + this.motionZ;
                    if (llIlIllIlIlIlII(((EntityMinecart)lllllllllllllIIlIllIIlIlIIlllIlI).getMinecartType(), EnumMinecartType.FURNACE) && llIlIllIlIlIllI(this.getMinecartType(), EnumMinecartType.FURNACE)) {
                        this.motionX *= 0.20000000298023224;
                        this.motionZ *= 0.20000000298023224;
                        this.addVelocity(lllllllllllllIIlIllIIlIlIIlllIlI.motionX - lllllllllllllIIlIllIIlIlIlIIIllI, 0.0, lllllllllllllIIlIllIIlIlIIlllIlI.motionZ - lllllllllllllIIlIllIIlIlIlIIIlIl);
                        lllllllllllllIIlIllIIlIlIIlllIlI.motionX *= 0.949999988079071;
                        lllllllllllllIIlIllIIlIlIIlllIlI.motionZ *= 0.949999988079071;
                        "".length();
                        if (((130 + 177 - 152 + 44 ^ 87 + 67 - 35 + 16) & (0x55 ^ 0x33 ^ (0x5D ^ 0x7B) ^ -" ".length())) < 0) {
                            return;
                        }
                    }
                    else if (llIlIllIlIlIllI(((EntityMinecart)lllllllllllllIIlIllIIlIlIIlllIlI).getMinecartType(), EnumMinecartType.FURNACE) && llIlIllIlIlIlII(this.getMinecartType(), EnumMinecartType.FURNACE)) {
                        lllllllllllllIIlIllIIlIlIIlllIlI.motionX *= 0.20000000298023224;
                        lllllllllllllIIlIllIIlIlIIlllIlI.motionZ *= 0.20000000298023224;
                        lllllllllllllIIlIllIIlIlIIlllIlI.addVelocity(this.motionX + lllllllllllllIIlIllIIlIlIlIIIllI, 0.0, this.motionZ + lllllllllllllIIlIllIIlIlIlIIIlIl);
                        this.motionX *= 0.949999988079071;
                        this.motionZ *= 0.949999988079071;
                        "".length();
                        if (-"   ".length() >= 0) {
                            return;
                        }
                    }
                    else {
                        lllllllllllllIIlIllIIlIlIIllllIl /= 2.0;
                        lllllllllllllIIlIllIIlIlIIllllII /= 2.0;
                        this.motionX *= 0.20000000298023224;
                        this.motionZ *= 0.20000000298023224;
                        this.addVelocity(lllllllllllllIIlIllIIlIlIIllllIl - lllllllllllllIIlIllIIlIlIlIIIllI, 0.0, lllllllllllllIIlIllIIlIlIIllllII - lllllllllllllIIlIllIIlIlIlIIIlIl);
                        lllllllllllllIIlIllIIlIlIIlllIlI.motionX *= 0.20000000298023224;
                        lllllllllllllIIlIllIIlIlIIlllIlI.motionZ *= 0.20000000298023224;
                        lllllllllllllIIlIllIIlIlIIlllIlI.addVelocity(lllllllllllllIIlIllIIlIlIIllllIl + lllllllllllllIIlIllIIlIlIlIIIllI, 0.0, lllllllllllllIIlIllIIlIlIIllllII + lllllllllllllIIlIllIIlIlIlIIIlIl);
                        "".length();
                        if ((0x2C ^ 0x48 ^ (0xED ^ 0x8D)) < -" ".length()) {
                            return;
                        }
                    }
                }
                else {
                    this.addVelocity(-lllllllllllllIIlIllIIlIlIlIIIllI, 0.0, -lllllllllllllIIlIllIIlIlIlIIIlIl);
                    lllllllllllllIIlIllIIlIlIIlllIlI.addVelocity(lllllllllllllIIlIllIIlIlIlIIIllI / 4.0, 0.0, lllllllllllllIIlIllIIlIlIlIIIlIl / 4.0);
                }
            }
        }
    }
    
    public void setDamage(final float lllllllllllllIIlIllIIlIlIIIIlIIl) {
        this.dataWatcher.updateObject(EntityMinecart.lIIllIIIllIlIl[14], lllllllllllllIIlIllIIlIlIIIIlIIl);
    }
    
    @Override
    protected void entityInit() {
        this.dataWatcher.addObject(EntityMinecart.lIIllIIIllIlIl[12], new Integer(EntityMinecart.lIIllIIIllIlIl[1]));
        this.dataWatcher.addObject(EntityMinecart.lIIllIIIllIlIl[13], new Integer(EntityMinecart.lIIllIIIllIlIl[5]));
        this.dataWatcher.addObject(EntityMinecart.lIIllIIIllIlIl[14], new Float(0.0f));
        this.dataWatcher.addObject(EntityMinecart.lIIllIIIllIlIl[15], new Integer(EntityMinecart.lIIllIIIllIlIl[1]));
        this.dataWatcher.addObject(EntityMinecart.lIIllIIIllIlIl[16], new Integer(EntityMinecart.lIIllIIIllIlIl[8]));
        this.dataWatcher.addObject(EntityMinecart.lIIllIIIllIlIl[17], (byte)EntityMinecart.lIIllIIIllIlIl[1]);
    }
    
    private static boolean llIlIllIlIllIIl(final int lllllllllllllIIlIllIIlIIIllIIlII, final int lllllllllllllIIlIllIIlIIIllIIIll) {
        return lllllllllllllIIlIllIIlIIIllIIlII != lllllllllllllIIlIllIIlIIIllIIIll;
    }
    
    private static void llIlIllIlIIIIIl() {
        (lIIllIIIlIllIl = new String[EntityMinecart.lIIllIIIllIlIl[12]])[EntityMinecart.lIIllIIIllIlIl[1]] = llIlIllIIllllIl("6Qm5pKffB9JlanaNFnQx8g==", "ACBNz");
        EntityMinecart.lIIllIIIlIllIl[EntityMinecart.lIIllIIIllIlIl[5]] = llIlIllIIllllIl("zvquelZzt9E=", "qToMf");
        EntityMinecart.lIIllIIIlIllIl[EntityMinecart.lIIllIIIllIlIl[2]] = llIlIllIIllllll("NwADJAQZMRkjGxgUCQQCGBA=", "tupPk");
        EntityMinecart.lIIllIIIlIllIl[EntityMinecart.lIIllIIIllIlIl[3]] = llIlIllIIllllIl("9tX79aQPsog/rtWboK74Kg==", "QIhLq");
        EntityMinecart.lIIllIIIlIllIl[EntityMinecart.lIIllIIIllIlIl[6]] = llIlIllIIllllIl("i/doB9b2oXgbCsOquCMDHA==", "ClLcf");
        EntityMinecart.lIIllIIIlIllIl[EntityMinecart.lIIllIIIllIlIl[7]] = llIlIllIIllllll("FSYxJj0wNhY/PTQ=", "QOBVQ");
        EntityMinecart.lIIllIIIlIllIl[EntityMinecart.lIIllIIIllIlIl[8]] = llIlIllIIllllll("BQUyFicgFRUPJyQ=", "AlAfK");
        EntityMinecart.lIIllIIIlIllIl[EntityMinecart.lIIllIIIllIlIl[9]] = llIlIllIIllllll("HAQDPRs5FD8rESsIBA==", "XmpMw");
        EntityMinecart.lIIllIIIlIllIl[EntityMinecart.lIIllIIIllIlIl[10]] = llIlIllIIllllIl("4WK9B6TCtmw9jW+8AaUYEQ==", "XZCeV");
        EntityMinecart.lIIllIIIlIllIl[EntityMinecart.lIIllIIIllIlIl[11]] = llIlIllIlIIIIII("5qKxZygTC0cAlhTmpMM9vQ==", "HwhvI");
        EntityMinecart.lIIllIIIlIllIl[EntityMinecart.lIIllIIIllIlIl[0]] = llIlIllIIllllIl("6aTxLdUO4LM7sgp21DSx7A==", "cvAXt");
        EntityMinecart.lIIllIIIlIllIl[EntityMinecart.lIIllIIIllIlIl[18]] = llIlIllIIllllll("Mw8AIyUdPhokOhwbCgMjHB8=", "pzsWJ");
        EntityMinecart.lIIllIIIlIllIl[EntityMinecart.lIIllIIIllIlIl[19]] = llIlIllIlIIIIII("bsQiwKle7OF64jXctn3MZw==", "iYbPE");
        EntityMinecart.lIIllIIIlIllIl[EntityMinecart.lIIllIIIllIlIl[20]] = llIlIllIlIIIIII("34OxhBbrCt4=", "YYETf");
        EntityMinecart.lIIllIIIlIllIl[EntityMinecart.lIIllIIIllIlIl[21]] = llIlIllIIllllIl("MU6E70GXgRx0T4DoZulPNA==", "JqenK");
        EntityMinecart.lIIllIIIlIllIl[EntityMinecart.lIIllIIIllIlIl[22]] = llIlIllIlIIIIII("UoG62gUQWdqXDvr1xDjoqQ==", "DsAhU");
        EntityMinecart.lIIllIIIlIllIl[EntityMinecart.lIIllIIIllIlIl[23]] = llIlIllIIllllIl("n7S4ktySnubMLesLX1+UGQ==", "wsFzO");
    }
    
    private static boolean llIlIllIlIlIllI(final Object lllllllllllllIIlIllIIlIIIllllIlI, final Object lllllllllllllIIlIllIIlIIIllllIIl) {
        return lllllllllllllIIlIllIIlIIIllllIlI != lllllllllllllIIlIllIIlIIIllllIIl;
    }
    
    public int getDisplayTileOffset() {
        int n;
        if (llIlIllIlIIlIlI(this.hasDisplayTile() ? 1 : 0)) {
            n = this.getDefaultDisplayTileOffset();
            "".length();
            if ((0x5D ^ 0x60 ^ (0x63 ^ 0x5A)) < 0) {
                return (169 + 80 - 64 + 11 ^ 80 + 71 - 141 + 141) & (88 + 47 - 21 + 78 ^ 114 + 34 - 46 + 45 ^ -" ".length());
            }
        }
        else {
            n = this.getDataWatcher().getWatchableObjectInt(EntityMinecart.lIIllIIIllIlIl[16]);
        }
        return n;
    }
    
    @Override
    public AxisAlignedBB getCollisionBoundingBox() {
        return null;
    }
    
    private static boolean llIlIllIlIIllII(final Object lllllllllllllIIlIllIIlIIIlllIlll) {
        return lllllllllllllIIlIllIIlIIIlllIlll != null;
    }
    
    public IBlockState getDisplayTile() {
        IBlockState blockState;
        if (llIlIllIlIIlIlI(this.hasDisplayTile() ? 1 : 0)) {
            blockState = this.getDefaultDisplayTile();
            "".length();
            if ("   ".length() == "  ".length()) {
                return null;
            }
        }
        else {
            blockState = Block.getStateById(this.getDataWatcher().getWatchableObjectInt(EntityMinecart.lIIllIIIllIlIl[15]));
        }
        return blockState;
    }
    
    public void setDisplayTileOffset(final int lllllllllllllIIlIllIIlIIlllIIIII) {
        this.getDataWatcher().updateObject(EntityMinecart.lIIllIIIllIlIl[16], lllllllllllllIIlIllIIlIIlllIIIII);
        this.setHasDisplayTile((boolean)(EntityMinecart.lIIllIIIllIlIl[5] != 0));
    }
    
    private static int llIlIllIlIIllll(final double n, final double n2) {
        return dcmpl(n, n2);
    }
    
    @Override
    protected void readEntityFromNBT(final NBTTagCompound lllllllllllllIIlIllIIlIlIllIIlII) {
        if (llIlIllIlIIlIII(lllllllllllllIIlIllIIlIlIllIIlII.getBoolean(EntityMinecart.lIIllIIIlIllIl[EntityMinecart.lIIllIIIllIlIl[2]]) ? 1 : 0)) {
            final int lllllllllllllIIlIllIIlIlIllIlIII = lllllllllllllIIlIllIIlIlIllIIlII.getInteger(EntityMinecart.lIIllIIIlIllIl[EntityMinecart.lIIllIIIllIlIl[3]]);
            if (llIlIllIlIIlIII(lllllllllllllIIlIllIIlIlIllIIlII.hasKey(EntityMinecart.lIIllIIIlIllIl[EntityMinecart.lIIllIIIllIlIl[6]], EntityMinecart.lIIllIIIllIlIl[10]) ? 1 : 0)) {
                final Block lllllllllllllIIlIllIIlIlIllIIlll = Block.getBlockFromName(lllllllllllllIIlIllIIlIlIllIIlII.getString(EntityMinecart.lIIllIIIlIllIl[EntityMinecart.lIIllIIIllIlIl[7]]));
                if (llIlIllIlIlIIIl(lllllllllllllIIlIllIIlIlIllIIlll)) {
                    this.func_174899_a(Blocks.air.getDefaultState());
                    "".length();
                    if (((0x42 ^ 0x7E ^ (0x18 ^ 0x74)) & (0xD ^ 0x2D ^ (0x21 ^ 0x51) ^ -" ".length())) > 0) {
                        return;
                    }
                }
                else {
                    this.func_174899_a(lllllllllllllIIlIllIIlIlIllIIlll.getStateFromMeta(lllllllllllllIIlIllIIlIlIllIlIII));
                    "".length();
                    if (((0xD1 ^ 0xC6) & ~(0x5D ^ 0x4A)) != 0x0) {
                        return;
                    }
                }
            }
            else {
                final Block lllllllllllllIIlIllIIlIlIllIIllI = Block.getBlockById(lllllllllllllIIlIllIIlIlIllIIlII.getInteger(EntityMinecart.lIIllIIIlIllIl[EntityMinecart.lIIllIIIllIlIl[8]]));
                if (llIlIllIlIlIIIl(lllllllllllllIIlIllIIlIlIllIIllI)) {
                    this.func_174899_a(Blocks.air.getDefaultState());
                    "".length();
                    if (-"   ".length() > 0) {
                        return;
                    }
                }
                else {
                    this.func_174899_a(lllllllllllllIIlIllIIlIlIllIIllI.getStateFromMeta(lllllllllllllIIlIllIIlIlIllIlIII));
                }
            }
            this.setDisplayTileOffset(lllllllllllllIIlIllIIlIlIllIIlII.getInteger(EntityMinecart.lIIllIIIlIllIl[EntityMinecart.lIIllIIIllIlIl[9]]));
        }
        if (llIlIllIlIIlIII(lllllllllllllIIlIllIIlIlIllIIlII.hasKey(EntityMinecart.lIIllIIIlIllIl[EntityMinecart.lIIllIIIllIlIl[10]], EntityMinecart.lIIllIIIllIlIl[10]) ? 1 : 0) && llIlIllIlIIlIll(lllllllllllllIIlIllIIlIlIllIIlII.getString(EntityMinecart.lIIllIIIlIllIl[EntityMinecart.lIIllIIIllIlIl[11]]).length())) {
            this.entityName = lllllllllllllIIlIllIIlIlIllIIlII.getString(EntityMinecart.lIIllIIIlIllIl[EntityMinecart.lIIllIIIllIlIl[0]]);
        }
    }
    
    public Vec3 func_70495_a(double lllllllllllllIIlIllIIlIllIllllIl, double lllllllllllllIIlIllIIlIllIllllII, double lllllllllllllIIlIllIIlIllIlllIll, final double lllllllllllllIIlIllIIlIlllIIlIII) {
        final int lllllllllllllIIlIllIIlIlllIIIlll = MathHelper.floor_double(lllllllllllllIIlIllIIlIllIllllIl);
        int lllllllllllllIIlIllIIlIlllIIIllI = MathHelper.floor_double(lllllllllllllIIlIllIIlIllIllllII);
        final int lllllllllllllIIlIllIIlIlllIIIlIl = MathHelper.floor_double(lllllllllllllIIlIllIIlIllIlllIll);
        if (llIlIllIlIIlIII(BlockRailBase.isRailBlock(this.worldObj, new BlockPos(lllllllllllllIIlIllIIlIlllIIIlll, lllllllllllllIIlIllIIlIlllIIIllI - EntityMinecart.lIIllIIIllIlIl[5], lllllllllllllIIlIllIIlIlllIIIlIl)) ? 1 : 0)) {
            --lllllllllllllIIlIllIIlIlllIIIllI;
        }
        final IBlockState lllllllllllllIIlIllIIlIlllIIIlII = this.worldObj.getBlockState(new BlockPos(lllllllllllllIIlIllIIlIlllIIIlll, lllllllllllllIIlIllIIlIlllIIIllI, lllllllllllllIIlIllIIlIlllIIIlIl));
        if (llIlIllIlIIlIII(BlockRailBase.isRailBlock(lllllllllllllIIlIllIIlIlllIIIlII) ? 1 : 0)) {
            final BlockRailBase.EnumRailDirection lllllllllllllIIlIllIIlIlllIIIIll = lllllllllllllIIlIllIIlIlllIIIlII.getValue(((BlockRailBase)lllllllllllllIIlIllIIlIlllIIIlII.getBlock()).getShapeProperty());
            lllllllllllllIIlIllIIlIllIllllII = lllllllllllllIIlIllIIlIlllIIIllI;
            if (llIlIllIlIIlIII(lllllllllllllIIlIllIIlIlllIIIIll.isAscending() ? 1 : 0)) {
                lllllllllllllIIlIllIIlIllIllllII = lllllllllllllIIlIllIIlIlllIIIllI + EntityMinecart.lIIllIIIllIlIl[5];
            }
            final int[][] lllllllllllllIIlIllIIlIlllIIIIlI = EntityMinecart.matrix[lllllllllllllIIlIllIIlIlllIIIIll.getMetadata()];
            double lllllllllllllIIlIllIIlIlllIIIIIl = lllllllllllllIIlIllIIlIlllIIIIlI[EntityMinecart.lIIllIIIllIlIl[5]][EntityMinecart.lIIllIIIllIlIl[1]] - lllllllllllllIIlIllIIlIlllIIIIlI[EntityMinecart.lIIllIIIllIlIl[1]][EntityMinecart.lIIllIIIllIlIl[1]];
            double lllllllllllllIIlIllIIlIlllIIIIII = lllllllllllllIIlIllIIlIlllIIIIlI[EntityMinecart.lIIllIIIllIlIl[5]][EntityMinecart.lIIllIIIllIlIl[2]] - lllllllllllllIIlIllIIlIlllIIIIlI[EntityMinecart.lIIllIIIllIlIl[1]][EntityMinecart.lIIllIIIllIlIl[2]];
            final double lllllllllllllIIlIllIIlIllIllllll = Math.sqrt(lllllllllllllIIlIllIIlIlllIIIIIl * lllllllllllllIIlIllIIlIlllIIIIIl + lllllllllllllIIlIllIIlIlllIIIIII * lllllllllllllIIlIllIIlIlllIIIIII);
            lllllllllllllIIlIllIIlIlllIIIIIl /= lllllllllllllIIlIllIIlIllIllllll;
            lllllllllllllIIlIllIIlIlllIIIIII /= lllllllllllllIIlIllIIlIllIllllll;
            lllllllllllllIIlIllIIlIllIllllIl += lllllllllllllIIlIllIIlIlllIIIIIl * lllllllllllllIIlIllIIlIlllIIlIII;
            lllllllllllllIIlIllIIlIllIlllIll += lllllllllllllIIlIllIIlIlllIIIIII * lllllllllllllIIlIllIIlIlllIIlIII;
            if (llIlIllIlIIlIII(lllllllllllllIIlIllIIlIlllIIIIlI[EntityMinecart.lIIllIIIllIlIl[1]][EntityMinecart.lIIllIIIllIlIl[5]]) && llIlIllIlIlIIll(MathHelper.floor_double(lllllllllllllIIlIllIIlIllIllllIl) - lllllllllllllIIlIllIIlIlllIIIlll, lllllllllllllIIlIllIIlIlllIIIIlI[EntityMinecart.lIIllIIIllIlIl[1]][EntityMinecart.lIIllIIIllIlIl[1]]) && llIlIllIlIlIIll(MathHelper.floor_double(lllllllllllllIIlIllIIlIllIlllIll) - lllllllllllllIIlIllIIlIlllIIIlIl, lllllllllllllIIlIllIIlIlllIIIIlI[EntityMinecart.lIIllIIIllIlIl[1]][EntityMinecart.lIIllIIIllIlIl[2]])) {
                lllllllllllllIIlIllIIlIllIllllII += lllllllllllllIIlIllIIlIlllIIIIlI[EntityMinecart.lIIllIIIllIlIl[1]][EntityMinecart.lIIllIIIllIlIl[5]];
                "".length();
                if ((0xB8 ^ 0xB7 ^ (0x4A ^ 0x41)) < "   ".length()) {
                    return null;
                }
            }
            else if (llIlIllIlIIlIII(lllllllllllllIIlIllIIlIlllIIIIlI[EntityMinecart.lIIllIIIllIlIl[5]][EntityMinecart.lIIllIIIllIlIl[5]]) && llIlIllIlIlIIll(MathHelper.floor_double(lllllllllllllIIlIllIIlIllIllllIl) - lllllllllllllIIlIllIIlIlllIIIlll, lllllllllllllIIlIllIIlIlllIIIIlI[EntityMinecart.lIIllIIIllIlIl[5]][EntityMinecart.lIIllIIIllIlIl[1]]) && llIlIllIlIlIIll(MathHelper.floor_double(lllllllllllllIIlIllIIlIllIlllIll) - lllllllllllllIIlIllIIlIlllIIIlIl, lllllllllllllIIlIllIIlIlllIIIIlI[EntityMinecart.lIIllIIIllIlIl[5]][EntityMinecart.lIIllIIIllIlIl[2]])) {
                lllllllllllllIIlIllIIlIllIllllII += lllllllllllllIIlIllIIlIlllIIIIlI[EntityMinecart.lIIllIIIllIlIl[5]][EntityMinecart.lIIllIIIllIlIl[5]];
            }
            return this.func_70489_a(lllllllllllllIIlIllIIlIllIllllIl, lllllllllllllIIlIllIIlIllIllllII, lllllllllllllIIlIllIIlIllIlllIll);
        }
        return null;
    }
    
    @Override
    public String getCustomNameTag() {
        return this.entityName;
    }
    
    public Vec3 func_70489_a(double lllllllllllllIIlIllIIlIllIIIIIll, double lllllllllllllIIlIllIIlIllIIIIIIl, double lllllllllllllIIlIllIIlIlIlllllll) {
        final int lllllllllllllIIlIllIIlIllIIlIllI = MathHelper.floor_double(lllllllllllllIIlIllIIlIllIIIIIll);
        int lllllllllllllIIlIllIIlIllIIlIlIl = MathHelper.floor_double(lllllllllllllIIlIllIIlIllIIIIIIl);
        final int lllllllllllllIIlIllIIlIllIIlIlII = MathHelper.floor_double(lllllllllllllIIlIllIIlIlIlllllll);
        if (llIlIllIlIIlIII(BlockRailBase.isRailBlock(this.worldObj, new BlockPos(lllllllllllllIIlIllIIlIllIIlIllI, lllllllllllllIIlIllIIlIllIIlIlIl - EntityMinecart.lIIllIIIllIlIl[5], lllllllllllllIIlIllIIlIllIIlIlII)) ? 1 : 0)) {
            --lllllllllllllIIlIllIIlIllIIlIlIl;
        }
        final IBlockState lllllllllllllIIlIllIIlIllIIlIIll = this.worldObj.getBlockState(new BlockPos(lllllllllllllIIlIllIIlIllIIlIllI, lllllllllllllIIlIllIIlIllIIlIlIl, lllllllllllllIIlIllIIlIllIIlIlII));
        if (llIlIllIlIIlIII(BlockRailBase.isRailBlock(lllllllllllllIIlIllIIlIllIIlIIll) ? 1 : 0)) {
            final BlockRailBase.EnumRailDirection lllllllllllllIIlIllIIlIllIIlIIlI = lllllllllllllIIlIllIIlIllIIlIIll.getValue(((BlockRailBase)lllllllllllllIIlIllIIlIllIIlIIll.getBlock()).getShapeProperty());
            final int[][] lllllllllllllIIlIllIIlIllIIlIIIl = EntityMinecart.matrix[lllllllllllllIIlIllIIlIllIIlIIlI.getMetadata()];
            double lllllllllllllIIlIllIIlIllIIlIIII = 0.0;
            final double lllllllllllllIIlIllIIlIllIIIllll = lllllllllllllIIlIllIIlIllIIlIllI + 0.5 + lllllllllllllIIlIllIIlIllIIlIIIl[EntityMinecart.lIIllIIIllIlIl[1]][EntityMinecart.lIIllIIIllIlIl[1]] * 0.5;
            final double lllllllllllllIIlIllIIlIllIIIlllI = lllllllllllllIIlIllIIlIllIIlIlIl + 0.0625 + lllllllllllllIIlIllIIlIllIIlIIIl[EntityMinecart.lIIllIIIllIlIl[1]][EntityMinecart.lIIllIIIllIlIl[5]] * 0.5;
            final double lllllllllllllIIlIllIIlIllIIIllIl = lllllllllllllIIlIllIIlIllIIlIlII + 0.5 + lllllllllllllIIlIllIIlIllIIlIIIl[EntityMinecart.lIIllIIIllIlIl[1]][EntityMinecart.lIIllIIIllIlIl[2]] * 0.5;
            final double lllllllllllllIIlIllIIlIllIIIllII = lllllllllllllIIlIllIIlIllIIlIllI + 0.5 + lllllllllllllIIlIllIIlIllIIlIIIl[EntityMinecart.lIIllIIIllIlIl[5]][EntityMinecart.lIIllIIIllIlIl[1]] * 0.5;
            final double lllllllllllllIIlIllIIlIllIIIlIll = lllllllllllllIIlIllIIlIllIIlIlIl + 0.0625 + lllllllllllllIIlIllIIlIllIIlIIIl[EntityMinecart.lIIllIIIllIlIl[5]][EntityMinecart.lIIllIIIllIlIl[5]] * 0.5;
            final double lllllllllllllIIlIllIIlIllIIIlIlI = lllllllllllllIIlIllIIlIllIIlIlII + 0.5 + lllllllllllllIIlIllIIlIllIIlIIIl[EntityMinecart.lIIllIIIllIlIl[5]][EntityMinecart.lIIllIIIllIlIl[2]] * 0.5;
            final double lllllllllllllIIlIllIIlIllIIIlIIl = lllllllllllllIIlIllIIlIllIIIllII - lllllllllllllIIlIllIIlIllIIIllll;
            final double lllllllllllllIIlIllIIlIllIIIlIII = (lllllllllllllIIlIllIIlIllIIIlIll - lllllllllllllIIlIllIIlIllIIIlllI) * 2.0;
            final double lllllllllllllIIlIllIIlIllIIIIlll = lllllllllllllIIlIllIIlIllIIIlIlI - lllllllllllllIIlIllIIlIllIIIllIl;
            if (llIlIllIlIIlIlI(llIlIllIlIllIlI(lllllllllllllIIlIllIIlIllIIIlIIl, 0.0))) {
                lllllllllllllIIlIllIIlIllIIIIIll = lllllllllllllIIlIllIIlIllIIlIllI + 0.5;
                lllllllllllllIIlIllIIlIllIIlIIII = lllllllllllllIIlIllIIlIlIlllllll - lllllllllllllIIlIllIIlIllIIlIlII;
                "".length();
                if (-" ".length() > (0x57 ^ 0x6 ^ (0xFF ^ 0xAA))) {
                    return null;
                }
            }
            else if (llIlIllIlIIlIlI(llIlIllIlIllIlI(lllllllllllllIIlIllIIlIllIIIIlll, 0.0))) {
                lllllllllllllIIlIllIIlIlIlllllll = lllllllllllllIIlIllIIlIllIIlIlII + 0.5;
                lllllllllllllIIlIllIIlIllIIlIIII = lllllllllllllIIlIllIIlIllIIIIIll - lllllllllllllIIlIllIIlIllIIlIllI;
                "".length();
                if ((0x63 ^ 0x67) <= " ".length()) {
                    return null;
                }
            }
            else {
                final double lllllllllllllIIlIllIIlIllIIIIllI = lllllllllllllIIlIllIIlIllIIIIIll - lllllllllllllIIlIllIIlIllIIIllll;
                final double lllllllllllllIIlIllIIlIllIIIIlIl = lllllllllllllIIlIllIIlIlIlllllll - lllllllllllllIIlIllIIlIllIIIllIl;
                lllllllllllllIIlIllIIlIllIIlIIII = (lllllllllllllIIlIllIIlIllIIIIllI * lllllllllllllIIlIllIIlIllIIIlIIl + lllllllllllllIIlIllIIlIllIIIIlIl * lllllllllllllIIlIllIIlIllIIIIlll) * 2.0;
            }
            lllllllllllllIIlIllIIlIllIIIIIll = lllllllllllllIIlIllIIlIllIIIllll + lllllllllllllIIlIllIIlIllIIIlIIl * lllllllllllllIIlIllIIlIllIIlIIII;
            lllllllllllllIIlIllIIlIllIIIIIIl = lllllllllllllIIlIllIIlIllIIIlllI + lllllllllllllIIlIllIIlIllIIIlIII * lllllllllllllIIlIllIIlIllIIlIIII;
            lllllllllllllIIlIllIIlIlIlllllll = lllllllllllllIIlIllIIlIllIIIllIl + lllllllllllllIIlIllIIlIllIIIIlll * lllllllllllllIIlIllIIlIllIIlIIII;
            if (llIlIllIlIlIIII(llIlIllIlIllIll(lllllllllllllIIlIllIIlIllIIIlIII, 0.0))) {
                ++lllllllllllllIIlIllIIlIllIIIIIIl;
            }
            if (llIlIllIlIIlIll(llIlIllIlIllIlI(lllllllllllllIIlIllIIlIllIIIlIII, 0.0))) {
                lllllllllllllIIlIllIIlIllIIIIIIl += 0.5;
            }
            return new Vec3(lllllllllllllIIlIllIIlIllIIIIIll, lllllllllllllIIlIllIIlIllIIIIIIl, lllllllllllllIIlIllIIlIlIlllllll);
        }
        return null;
    }
    
    public abstract EnumMinecartType getMinecartType();
    
    private static int llIlIllIlIllIII(final double n, final double n2) {
        return dcmpl(n, n2);
    }
    
    private static int llIlIllIlIIllIl(final float n, final float n2) {
        return fcmpl(n, n2);
    }
    
    protected void moveDerailedMinecart() {
        final double lllllllllllllIIlIllIIllIlIlIIIll = this.getMaximumSpeed();
        this.motionX = MathHelper.clamp_double(this.motionX, -lllllllllllllIIlIllIIllIlIlIIIll, lllllllllllllIIlIllIIllIlIlIIIll);
        this.motionZ = MathHelper.clamp_double(this.motionZ, -lllllllllllllIIlIllIIllIlIlIIIll, lllllllllllllIIlIllIIllIlIlIIIll);
        if (llIlIllIlIIlIII(this.onGround ? 1 : 0)) {
            this.motionX *= 0.5;
            this.motionY *= 0.5;
            this.motionZ *= 0.5;
        }
        this.moveEntity(this.motionX, this.motionY, this.motionZ);
        if (llIlIllIlIIlIlI(this.onGround ? 1 : 0)) {
            this.motionX *= 0.949999988079071;
            this.motionY *= 0.949999988079071;
            this.motionZ *= 0.949999988079071;
        }
    }
    
    public int getRollingDirection() {
        return this.dataWatcher.getWatchableObjectInt(EntityMinecart.lIIllIIIllIlIl[13]);
    }
    
    public enum EnumMinecartType
    {
        private static final /* synthetic */ Map<Integer, EnumMinecartType> ID_LOOKUP;
        
        RIDEABLE(EnumMinecartType.lIIIlIIlllIIIl[EnumMinecartType.lIIIlIIlllIlII[0]], EnumMinecartType.lIIIlIIlllIlII[0], EnumMinecartType.lIIIlIIlllIlII[0], EnumMinecartType.lIIIlIIlllIIIl[EnumMinecartType.lIIIlIIlllIlII[1]]), 
        COMMAND_BLOCK(EnumMinecartType.lIIIlIIlllIIIl[EnumMinecartType.lIIIlIIlllIlII[12]], EnumMinecartType.lIIIlIIlllIlII[6], EnumMinecartType.lIIIlIIlllIlII[6], EnumMinecartType.lIIIlIIlllIIIl[EnumMinecartType.lIIIlIIlllIlII[13]]), 
        CHEST(EnumMinecartType.lIIIlIIlllIIIl[EnumMinecartType.lIIIlIIlllIlII[2]], EnumMinecartType.lIIIlIIlllIlII[1], EnumMinecartType.lIIIlIIlllIlII[1], EnumMinecartType.lIIIlIIlllIIIl[EnumMinecartType.lIIIlIIlllIlII[3]]), 
        HOPPER(EnumMinecartType.lIIIlIIlllIIIl[EnumMinecartType.lIIIlIIlllIlII[10]], EnumMinecartType.lIIIlIIlllIlII[5], EnumMinecartType.lIIIlIIlllIlII[5], EnumMinecartType.lIIIlIIlllIIIl[EnumMinecartType.lIIIlIIlllIlII[11]]), 
        FURNACE(EnumMinecartType.lIIIlIIlllIIIl[EnumMinecartType.lIIIlIIlllIlII[4]], EnumMinecartType.lIIIlIIlllIlII[2], EnumMinecartType.lIIIlIIlllIlII[2], EnumMinecartType.lIIIlIIlllIIIl[EnumMinecartType.lIIIlIIlllIlII[5]]);
        
        private final /* synthetic */ int networkID;
        private static final /* synthetic */ String[] lIIIlIIlllIIIl;
        private final /* synthetic */ String name;
        private static final /* synthetic */ int[] lIIIlIIlllIlII;
        
        TNT(EnumMinecartType.lIIIlIIlllIIIl[EnumMinecartType.lIIIlIIlllIlII[6]], EnumMinecartType.lIIIlIIlllIlII[3], EnumMinecartType.lIIIlIIlllIlII[3], EnumMinecartType.lIIIlIIlllIIIl[EnumMinecartType.lIIIlIIlllIlII[7]]), 
        SPAWNER(EnumMinecartType.lIIIlIIlllIIIl[EnumMinecartType.lIIIlIIlllIlII[8]], EnumMinecartType.lIIIlIIlllIlII[4], EnumMinecartType.lIIIlIIlllIlII[4], EnumMinecartType.lIIIlIIlllIIIl[EnumMinecartType.lIIIlIIlllIlII[9]]);
        
        public static EnumMinecartType byNetworkID(final int lllllllllllllIlIIIlIIlllIlIlIIII) {
            final EnumMinecartType lllllllllllllIlIIIlIIlllIlIlIIIl = EnumMinecartType.ID_LOOKUP.get(lllllllllllllIlIIIlIIlllIlIlIIII);
            EnumMinecartType rideable;
            if (lIlllllllIllllI(lllllllllllllIlIIIlIIlllIlIlIIIl)) {
                rideable = EnumMinecartType.RIDEABLE;
                "".length();
                if ("   ".length() == -" ".length()) {
                    return null;
                }
            }
            else {
                rideable = lllllllllllllIlIIIlIIlllIlIlIIIl;
            }
            return rideable;
        }
        
        private EnumMinecartType(final String lllllllllllllIlIIIlIIlllIlIllllI, final int lllllllllllllIlIIIlIIlllIlIlllIl, final int lllllllllllllIlIIIlIIlllIllIIIIl, final String lllllllllllllIlIIIlIIlllIllIIIII) {
            this.networkID = lllllllllllllIlIIIlIIlllIllIIIIl;
            this.name = lllllllllllllIlIIIlIIlllIllIIIII;
        }
        
        public String getName() {
            return this.name;
        }
        
        private static boolean lIlllllllIlllIl(final int lllllllllllllIlIIIlIIlllIIIlIIlI, final int lllllllllllllIlIIIlIIlllIIIlIIIl) {
            return lllllllllllllIlIIIlIIlllIIIlIIlI >= lllllllllllllIlIIIlIIlllIIIlIIIl;
        }
        
        private static String lIlllllllIIlllI(final String lllllllllllllIlIIIlIIlllIIIllIlI, final String lllllllllllllIlIIIlIIlllIIIlIlll) {
            try {
                final SecretKeySpec lllllllllllllIlIIIlIIlllIIIlllIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIlIIIlIIlllIIIlIlll.getBytes(StandardCharsets.UTF_8)), EnumMinecartType.lIIIlIIlllIlII[8]), "DES");
                final Cipher lllllllllllllIlIIIlIIlllIIIlllII = Cipher.getInstance("DES");
                lllllllllllllIlIIIlIIlllIIIlllII.init(EnumMinecartType.lIIIlIIlllIlII[2], lllllllllllllIlIIIlIIlllIIIlllIl);
                return new String(lllllllllllllIlIIIlIIlllIIIlllII.doFinal(Base64.getDecoder().decode(lllllllllllllIlIIIlIIlllIIIllIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
            }
            catch (Exception lllllllllllllIlIIIlIIlllIIIllIll) {
                lllllllllllllIlIIIlIIlllIIIllIll.printStackTrace();
                return null;
            }
        }
        
        public int getNetworkID() {
            return this.networkID;
        }
        
        private static boolean lIlllllllIllllI(final Object lllllllllllllIlIIIlIIlllIIIIlIll) {
            return lllllllllllllIlIIIlIIlllIIIIlIll == null;
        }
        
        private static String lIlllllllIlIlII(String lllllllllllllIlIIIlIIlllIIllIlll, final String lllllllllllllIlIIIlIIlllIIllIllI) {
            lllllllllllllIlIIIlIIlllIIllIlll = new String(Base64.getDecoder().decode(lllllllllllllIlIIIlIIlllIIllIlll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
            final StringBuilder lllllllllllllIlIIIlIIlllIIlllIlI = new StringBuilder();
            final char[] lllllllllllllIlIIIlIIlllIIlllIIl = lllllllllllllIlIIIlIIlllIIllIllI.toCharArray();
            int lllllllllllllIlIIIlIIlllIIlllIII = EnumMinecartType.lIIIlIIlllIlII[0];
            final Exception lllllllllllllIlIIIlIIlllIIllIIlI = (Object)lllllllllllllIlIIIlIIlllIIllIlll.toCharArray();
            final Exception lllllllllllllIlIIIlIIlllIIllIIIl = (Exception)lllllllllllllIlIIIlIIlllIIllIIlI.length;
            int lllllllllllllIlIIIlIIlllIIllIIII = EnumMinecartType.lIIIlIIlllIlII[0];
            while (lIlllllllIlllll(lllllllllllllIlIIIlIIlllIIllIIII, (int)lllllllllllllIlIIIlIIlllIIllIIIl)) {
                final char lllllllllllllIlIIIlIIlllIIllllIl = lllllllllllllIlIIIlIIlllIIllIIlI[lllllllllllllIlIIIlIIlllIIllIIII];
                lllllllllllllIlIIIlIIlllIIlllIlI.append((char)(lllllllllllllIlIIIlIIlllIIllllIl ^ lllllllllllllIlIIIlIIlllIIlllIIl[lllllllllllllIlIIIlIIlllIIlllIII % lllllllllllllIlIIIlIIlllIIlllIIl.length]));
                "".length();
                ++lllllllllllllIlIIIlIIlllIIlllIII;
                ++lllllllllllllIlIIIlIIlllIIllIIII;
                "".length();
                if (" ".length() != " ".length()) {
                    return null;
                }
            }
            return String.valueOf(lllllllllllllIlIIIlIIlllIIlllIlI);
        }
        
        private static void lIlllllllIllIII() {
            (lIIIlIIlllIIIl = new String[EnumMinecartType.lIIIlIIlllIlII[14]])[EnumMinecartType.lIIIlIIlllIlII[0]] = lIlllllllIIlIll("3jX+ASjq7DmXzJ4LSpgwUg==", "kkYXM");
            EnumMinecartType.lIIIlIIlllIIIl[EnumMinecartType.lIIIlIIlllIlII[1]] = lIlllllllIIlllI("mv0i5LGqw9dLbaGHAYylXUC5EEPqgOSu", "UyUTR");
            EnumMinecartType.lIIIlIIlllIIIl[EnumMinecartType.lIIIlIIlllIlII[2]] = lIlllllllIlIlII("AhATPCQ=", "AXVop");
            EnumMinecartType.lIIIlIIlllIIIl[EnumMinecartType.lIIIlIIlllIlII[3]] = lIlllllllIIlIll("uTkzUNEV1t2ClSQ0cD46Jw==", "OZPUP");
            EnumMinecartType.lIIIlIIlllIIIl[EnumMinecartType.lIIIlIIlllIlII[4]] = lIlllllllIIlIll("pv7d1qfEbV4=", "fYceQ");
            EnumMinecartType.lIIIlIIlllIIIl[EnumMinecartType.lIIIlIIlllIlII[5]] = lIlllllllIIlIll("M5R9CteqONMMXDo2qa4ifg==", "QsUph");
            EnumMinecartType.lIIIlIIlllIIIl[EnumMinecartType.lIIIlIIlllIlII[6]] = lIlllllllIIlllI("drFQgraM19M=", "qDtyz");
            EnumMinecartType.lIIIlIIlllIIIl[EnumMinecartType.lIIIlIIlllIlII[7]] = lIlllllllIIlllI("111Tlcoy+HKGVDNbuNxxjA==", "TTJGJ");
            EnumMinecartType.lIIIlIIlllIIIl[EnumMinecartType.lIIIlIIlllIlII[8]] = lIlllllllIIlllI("ktm7ufNUNNI=", "EIqXS");
            EnumMinecartType.lIIIlIIlllIIIl[EnumMinecartType.lIIIlIIlllIlII[9]] = lIlllllllIlIlII("Ixw6KQ8PByAfHA8COike", "nuTLl");
            EnumMinecartType.lIIIlIIlllIIIl[EnumMinecartType.lIIIlIIlllIlII[10]] = lIlllllllIIlIll("7ivoQXx2v7Y=", "DVeVI");
            EnumMinecartType.lIIIlIIlllIIIl[EnumMinecartType.lIIIlIIlllIlII[11]] = lIlllllllIIlIll("1o58Ahl6dGonL1JxqF3DiA==", "VSWrq");
            EnumMinecartType.lIIIlIIlllIIIl[EnumMinecartType.lIIIlIIlllIlII[12]] = lIlllllllIlIlII("KhomHxgnETQQFSYWIA==", "iUkRY");
            EnumMinecartType.lIIIlIIlllIIIl[EnumMinecartType.lIIIlIIlllIlII[13]] = lIlllllllIIlIll("Q3YbhY20/ajt63RAvK71N+18X0XLL+2X", "uXNDt");
        }
        
        static {
            lIlllllllIlllII();
            lIlllllllIllIII();
            final EnumMinecartType[] enum$VALUES = new EnumMinecartType[EnumMinecartType.lIIIlIIlllIlII[7]];
            enum$VALUES[EnumMinecartType.lIIIlIIlllIlII[0]] = EnumMinecartType.RIDEABLE;
            enum$VALUES[EnumMinecartType.lIIIlIIlllIlII[1]] = EnumMinecartType.CHEST;
            enum$VALUES[EnumMinecartType.lIIIlIIlllIlII[2]] = EnumMinecartType.FURNACE;
            enum$VALUES[EnumMinecartType.lIIIlIIlllIlII[3]] = EnumMinecartType.TNT;
            enum$VALUES[EnumMinecartType.lIIIlIIlllIlII[4]] = EnumMinecartType.SPAWNER;
            enum$VALUES[EnumMinecartType.lIIIlIIlllIlII[5]] = EnumMinecartType.HOPPER;
            enum$VALUES[EnumMinecartType.lIIIlIIlllIlII[6]] = EnumMinecartType.COMMAND_BLOCK;
            ENUM$VALUES = enum$VALUES;
            ID_LOOKUP = Maps.newHashMap();
            final float lllllllllllllIlIIIlIIlllIllIlIII;
            final byte lllllllllllllIlIIIlIIlllIllIlIIl = (byte)((EnumMinecartType[])(Object)(lllllllllllllIlIIIlIIlllIllIlIII = (float)(Object)values())).length;
            double lllllllllllllIlIIIlIIlllIllIlIlI = EnumMinecartType.lIIIlIIlllIlII[0];
            "".length();
            if ("  ".length() == -" ".length()) {
                return;
            }
            while (!lIlllllllIlllIl((int)lllllllllllllIlIIIlIIlllIllIlIlI, lllllllllllllIlIIIlIIlllIllIlIIl)) {
                final EnumMinecartType lllllllllllllIlIIIlIIlllIllIllII = lllllllllllllIlIIIlIIlllIllIlIII[lllllllllllllIlIIIlIIlllIllIlIlI];
                EnumMinecartType.ID_LOOKUP.put(lllllllllllllIlIIIlIIlllIllIllII.getNetworkID(), lllllllllllllIlIIIlIIlllIllIllII);
                "".length();
                ++lllllllllllllIlIIIlIIlllIllIlIlI;
            }
        }
        
        private static boolean lIlllllllIlllll(final int lllllllllllllIlIIIlIIlllIIIIlllI, final int lllllllllllllIlIIIlIIlllIIIIllIl) {
            return lllllllllllllIlIIIlIIlllIIIIlllI < lllllllllllllIlIIIlIIlllIIIIllIl;
        }
        
        private static String lIlllllllIIlIll(final String lllllllllllllIlIIIlIIlllIIlIIlll, final String lllllllllllllIlIIIlIIlllIIlIIllI) {
            try {
                final SecretKeySpec lllllllllllllIlIIIlIIlllIIlIlIlI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIlIIIlIIlllIIlIIllI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
                final Cipher lllllllllllllIlIIIlIIlllIIlIlIIl = Cipher.getInstance("Blowfish");
                lllllllllllllIlIIIlIIlllIIlIlIIl.init(EnumMinecartType.lIIIlIIlllIlII[2], lllllllllllllIlIIIlIIlllIIlIlIlI);
                return new String(lllllllllllllIlIIIlIIlllIIlIlIIl.doFinal(Base64.getDecoder().decode(lllllllllllllIlIIIlIIlllIIlIIlll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
            }
            catch (Exception lllllllllllllIlIIIlIIlllIIlIlIII) {
                lllllllllllllIlIIIlIIlllIIlIlIII.printStackTrace();
                return null;
            }
        }
        
        private static void lIlllllllIlllII() {
            (lIIIlIIlllIlII = new int[15])[0] = ((0x5C ^ 0x4C) & ~(0xA3 ^ 0xB3));
            EnumMinecartType.lIIIlIIlllIlII[1] = " ".length();
            EnumMinecartType.lIIIlIIlllIlII[2] = "  ".length();
            EnumMinecartType.lIIIlIIlllIlII[3] = "   ".length();
            EnumMinecartType.lIIIlIIlllIlII[4] = (0x32 ^ 0x36);
            EnumMinecartType.lIIIlIIlllIlII[5] = (0x88 ^ 0xA0 ^ (0x21 ^ 0xC));
            EnumMinecartType.lIIIlIIlllIlII[6] = (0x45 ^ 0x5A ^ (0x3E ^ 0x27));
            EnumMinecartType.lIIIlIIlllIlII[7] = (0x86 ^ 0x81);
            EnumMinecartType.lIIIlIIlllIlII[8] = (0x42 ^ 0x12 ^ (0x7C ^ 0x24));
            EnumMinecartType.lIIIlIIlllIlII[9] = (0x46 ^ 0x4F);
            EnumMinecartType.lIIIlIIlllIlII[10] = (0xA1 ^ 0x9B ^ (0x51 ^ 0x61));
            EnumMinecartType.lIIIlIIlllIlII[11] = (0x4 ^ 0xF);
            EnumMinecartType.lIIIlIIlllIlII[12] = (0x78 ^ 0x74);
            EnumMinecartType.lIIIlIIlllIlII[13] = (56 + 51 + 13 + 15 ^ 10 + 101 + 16 + 11);
            EnumMinecartType.lIIIlIIlllIlII[14] = (0xA5 ^ 0xAB);
        }
    }
}
