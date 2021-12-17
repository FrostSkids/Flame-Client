// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.entity.item;

import net.minecraft.util.EnumParticleTypes;
import net.minecraft.init.Items;
import net.minecraft.entity.player.EntityPlayer;
import java.util.Arrays;
import net.minecraft.block.Block;
import net.minecraft.block.properties.IProperty;
import net.minecraft.util.EnumFacing;
import net.minecraft.block.BlockFurnace;
import net.minecraft.nbt.NBTTagCompound;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import net.minecraft.world.World;
import net.minecraft.util.MathHelper;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.BlockPos;
import net.minecraft.item.ItemStack;
import net.minecraft.init.Blocks;
import net.minecraft.util.DamageSource;

public class EntityMinecartFurnace extends EntityMinecart
{
    public /* synthetic */ double pushZ;
    private static final /* synthetic */ int[] lllIlIIllIlIlI;
    private static final /* synthetic */ String[] lllIlIIllIIlII;
    private /* synthetic */ int fuel;
    public /* synthetic */ double pushX;
    
    private static boolean lIlIIIlIIllIIllI(final int llllllllllllIlIllIlllIlIllIIllII) {
        return llllllllllllIlIllIlllIlIllIIllII <= 0;
    }
    
    private static int lIlIIIlIIllIlIIl(final double n, final double n2) {
        return dcmpl(n, n2);
    }
    
    @Override
    public void killMinecart(final DamageSource llllllllllllIlIllIlllIllIlIIlIll) {
        super.killMinecart(llllllllllllIlIllIlllIllIlIIlIll);
        if (lIlIIIlIIllIlIII(llllllllllllIlIllIlllIllIlIIlIll.isExplosion() ? 1 : 0) && lIlIIIlIIllIIlll(this.worldObj.getGameRules().getBoolean(EntityMinecartFurnace.lllIlIIllIIlII[EntityMinecartFurnace.lllIlIIllIlIlI[1]]) ? 1 : 0)) {
            this.entityDropItem(new ItemStack(Blocks.furnace, EntityMinecartFurnace.lllIlIIllIlIlI[2]), 0.0f);
            "".length();
        }
    }
    
    @Override
    public EnumMinecartType getMinecartType() {
        return EnumMinecartType.FURNACE;
    }
    
    @Override
    protected void func_180460_a(final BlockPos llllllllllllIlIllIlllIllIIllllIl, final IBlockState llllllllllllIlIllIlllIllIlIIIIIl) {
        super.func_180460_a(llllllllllllIlIllIlllIllIIllllIl, llllllllllllIlIllIlllIllIlIIIIIl);
        double llllllllllllIlIllIlllIllIlIIIIII = this.pushX * this.pushX + this.pushZ * this.pushZ;
        if (lIlIIIlIIllIIlIl(lIlIIIlIIllIlIIl(llllllllllllIlIllIlllIllIlIIIIII, 1.0E-4)) && lIlIIIlIIllIIlIl(lIlIIIlIIllIlIIl(this.motionX * this.motionX + this.motionZ * this.motionZ, 0.001))) {
            llllllllllllIlIllIlllIllIlIIIIII = MathHelper.sqrt_double(llllllllllllIlIllIlllIllIlIIIIII);
            this.pushX /= llllllllllllIlIllIlllIllIlIIIIII;
            this.pushZ /= llllllllllllIlIllIlllIllIlIIIIII;
            if (lIlIIIlIIllIlIll(lIlIIIlIIllIlIlI(this.pushX * this.motionX + this.pushZ * this.motionZ, 0.0))) {
                this.pushX = 0.0;
                this.pushZ = 0.0;
                "".length();
                if ((0xBD ^ 0xB9) != (0x59 ^ 0x5D)) {
                    return;
                }
            }
            else {
                final double llllllllllllIlIllIlllIllIIllllll = llllllllllllIlIllIlllIllIlIIIIII / this.getMaximumSpeed();
                this.pushX *= llllllllllllIlIllIlllIllIIllllll;
                this.pushZ *= llllllllllllIlIllIlllIllIIllllll;
            }
        }
    }
    
    private static boolean lIlIIIlIIllIlIII(final int llllllllllllIlIllIlllIlIllIlIIII) {
        return llllllllllllIlIllIlllIlIllIlIIII == 0;
    }
    
    private static boolean lIlIIIlIIllIIlIl(final int llllllllllllIlIllIlllIlIllIIlIlI) {
        return llllllllllllIlIllIlllIlIllIIlIlI > 0;
    }
    
    private static boolean lIlIIIlIIllIllll(final Object llllllllllllIlIllIlllIlIllIlIlIl, final Object llllllllllllIlIllIlllIlIllIlIlII) {
        return llllllllllllIlIllIlllIlIllIlIlIl == llllllllllllIlIllIlllIlIllIlIlII;
    }
    
    private static boolean lIlIIIlIIlllIIII(final int llllllllllllIlIllIlllIlIllIllIll, final int llllllllllllIlIllIlllIlIllIllIlI) {
        return llllllllllllIlIllIlllIlIllIllIll < llllllllllllIlIllIlllIlIllIllIlI;
    }
    
    public EntityMinecartFurnace(final World llllllllllllIlIllIlllIllIllIlIII) {
        super(llllllllllllIlIllIlllIllIllIlIII);
    }
    
    private static boolean lIlIIIlIIllIlllI(final Object llllllllllllIlIllIlllIlIllIllIII) {
        return llllllllllllIlIllIlllIlIllIllIII != null;
    }
    
    private static boolean lIlIIIlIIllIlIll(final int llllllllllllIlIllIlllIlIllIIlllI) {
        return llllllllllllIlIllIlllIlIllIIlllI < 0;
    }
    
    protected void setMinecartPowered(final boolean llllllllllllIlIllIlllIllIIIlIlIl) {
        if (lIlIIIlIIllIIlll(llllllllllllIlIllIlllIllIIIlIlIl ? 1 : 0)) {
            this.dataWatcher.updateObject(EntityMinecartFurnace.lllIlIIllIlIlI[0], (byte)(this.dataWatcher.getWatchableObjectByte(EntityMinecartFurnace.lllIlIIllIlIlI[0]) | EntityMinecartFurnace.lllIlIIllIlIlI[2]));
            "".length();
            if (((0x2C ^ 0x19) & ~(0x3A ^ 0xF)) != 0x0) {
                return;
            }
        }
        else {
            this.dataWatcher.updateObject(EntityMinecartFurnace.lllIlIIllIlIlI[0], (byte)(this.dataWatcher.getWatchableObjectByte(EntityMinecartFurnace.lllIlIIllIlIlI[0]) & EntityMinecartFurnace.lllIlIIllIlIlI[9]));
        }
    }
    
    private static String lIlIIIlIIlIllIlI(final String llllllllllllIlIllIlllIllIIIIIllI, final String llllllllllllIlIllIlllIllIIIIIlIl) {
        try {
            final SecretKeySpec llllllllllllIlIllIlllIllIIIIlIll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIlIllIlllIllIIIIIlIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher llllllllllllIlIllIlllIllIIIIlIlI = Cipher.getInstance("Blowfish");
            llllllllllllIlIllIlllIllIIIIlIlI.init(EntityMinecartFurnace.lllIlIIllIlIlI[5], llllllllllllIlIllIlllIllIIIIlIll);
            return new String(llllllllllllIlIllIlllIllIIIIlIlI.doFinal(Base64.getDecoder().decode(llllllllllllIlIllIlllIllIIIIIllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIlIllIlllIllIIIIlIIl) {
            llllllllllllIlIllIlllIllIIIIlIIl.printStackTrace();
            return null;
        }
    }
    
    static {
        lIlIIIlIIllIIlII();
        lIlIIIlIIlIllIll();
    }
    
    @Override
    protected void writeEntityToNBT(final NBTTagCompound llllllllllllIlIllIlllIllIIlIIlII) {
        super.writeEntityToNBT(llllllllllllIlIllIlllIllIIlIIlII);
        llllllllllllIlIllIlllIllIIlIIlII.setDouble(EntityMinecartFurnace.lllIlIIllIIlII[EntityMinecartFurnace.lllIlIIllIlIlI[2]], this.pushX);
        llllllllllllIlIllIlllIllIIlIIlII.setDouble(EntityMinecartFurnace.lllIlIIllIIlII[EntityMinecartFurnace.lllIlIIllIlIlI[5]], this.pushZ);
        llllllllllllIlIllIlllIllIIlIIlII.setShort(EntityMinecartFurnace.lllIlIIllIIlII[EntityMinecartFurnace.lllIlIIllIlIlI[6]], (short)this.fuel);
    }
    
    @Override
    public IBlockState getDefaultDisplayTile() {
        Block block;
        if (lIlIIIlIIllIIlll(this.isMinecartPowered() ? 1 : 0)) {
            block = Blocks.lit_furnace;
            "".length();
            if (((0x6F ^ 0x32 ^ (0xC9 ^ 0xA3)) & (0x66 ^ 0x38 ^ (0xFC ^ 0x95) ^ -" ".length())) > (5 + 34 + 21 + 93 ^ 86 + 82 - 111 + 100)) {
                return null;
            }
        }
        else {
            block = Blocks.furnace;
        }
        return block.getDefaultState().withProperty((IProperty<Comparable>)BlockFurnace.FACING, EnumFacing.NORTH);
    }
    
    private static void lIlIIIlIIllIIlII() {
        (lllIlIIllIlIlI = new int[12])[0] = (0x2A ^ 0x3A);
        EntityMinecartFurnace.lllIlIIllIlIlI[1] = ((90 + 10 - 16 + 94 ^ 138 + 28 - 126 + 129) & (0x1E ^ 0x39 ^ (0x3C ^ 0x0) ^ -" ".length()));
        EntityMinecartFurnace.lllIlIIllIlIlI[2] = " ".length();
        EntityMinecartFurnace.lllIlIIllIlIlI[3] = (0x99 ^ 0xA2 ^ (0x81 ^ 0xBE));
        EntityMinecartFurnace.lllIlIIllIlIlI[4] = (-(0xFFFFF8EF & 0x577F) & (0xFFFFFF7E & 0x5EFF));
        EntityMinecartFurnace.lllIlIIllIlIlI[5] = "  ".length();
        EntityMinecartFurnace.lllIlIIllIlIlI[6] = "   ".length();
        EntityMinecartFurnace.lllIlIIllIlIlI[7] = (0xAF ^ 0xAA);
        EntityMinecartFurnace.lllIlIIllIlIlI[8] = (0x3D ^ 0x20 ^ (0xBD ^ 0xA6));
        EntityMinecartFurnace.lllIlIIllIlIlI[9] = -"  ".length();
        EntityMinecartFurnace.lllIlIIllIlIlI[10] = (0x36 ^ 0x73 ^ (0xE9 ^ 0xAB));
        EntityMinecartFurnace.lllIlIIllIlIlI[11] = (0x7 ^ 0xF);
    }
    
    private static int lIlIIIlIIllIlIlI(final double n, final double n2) {
        return dcmpg(n, n2);
    }
    
    private static void lIlIIIlIIlIllIll() {
        (lllIlIIllIIlII = new String[EntityMinecartFurnace.lllIlIIllIlIlI[10]])[EntityMinecartFurnace.lllIlIIllIlIlI[1]] = lIlIIIlIIlIllIII("RKkL6C3BGi/pFgbvv7SpmQ==", "yQsWR");
        EntityMinecartFurnace.lllIlIIllIIlII[EntityMinecartFurnace.lllIlIIllIlIlI[2]] = lIlIIIlIIlIllIIl("KBE+BTA=", "xdMmh");
        EntityMinecartFurnace.lllIlIIllIIlII[EntityMinecartFurnace.lllIlIIllIlIlI[5]] = lIlIIIlIIlIllIIl("GjYQACI=", "JCchx");
        EntityMinecartFurnace.lllIlIIllIIlII[EntityMinecartFurnace.lllIlIIllIlIlI[6]] = lIlIIIlIIlIllIII("aNwG3zCF9C8=", "YIbTw");
        EntityMinecartFurnace.lllIlIIllIIlII[EntityMinecartFurnace.lllIlIIllIlIlI[3]] = lIlIIIlIIlIllIlI("/i9hAWaJPgs=", "GmCzD");
        EntityMinecartFurnace.lllIlIIllIIlII[EntityMinecartFurnace.lllIlIIllIlIlI[7]] = lIlIIIlIIlIllIII("o/iRCOMDxc8=", "iQvbb");
        EntityMinecartFurnace.lllIlIIllIIlII[EntityMinecartFurnace.lllIlIIllIlIlI[8]] = lIlIIIlIIlIllIIl("NiULNQ==", "pPnYa");
    }
    
    private static String lIlIIIlIIlIllIII(final String llllllllllllIlIllIlllIlIlllllIIl, final String llllllllllllIlIllIlllIlIlllllIlI) {
        try {
            final SecretKeySpec llllllllllllIlIllIlllIlIlllllllI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIlIllIlllIlIlllllIlI.getBytes(StandardCharsets.UTF_8)), EntityMinecartFurnace.lllIlIIllIlIlI[11]), "DES");
            final Cipher llllllllllllIlIllIlllIlIllllllIl = Cipher.getInstance("DES");
            llllllllllllIlIllIlllIlIllllllIl.init(EntityMinecartFurnace.lllIlIIllIlIlI[5], llllllllllllIlIllIlllIlIlllllllI);
            return new String(llllllllllllIlIllIlllIlIllllllIl.doFinal(Base64.getDecoder().decode(llllllllllllIlIllIlllIlIlllllIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIlIllIlllIlIllllllII) {
            llllllllllllIlIllIlllIlIllllllII.printStackTrace();
            return null;
        }
    }
    
    private static int lIlIIIlIIllIllII(final double n, final double n2) {
        return dcmpl(n, n2);
    }
    
    protected boolean isMinecartPowered() {
        if (lIlIIIlIIllIIlll(this.dataWatcher.getWatchableObjectByte(EntityMinecartFurnace.lllIlIIllIlIlI[0]) & EntityMinecartFurnace.lllIlIIllIlIlI[2])) {
            return EntityMinecartFurnace.lllIlIIllIlIlI[2] != 0;
        }
        return EntityMinecartFurnace.lllIlIIllIlIlI[1] != 0;
    }
    
    private static boolean lIlIIIlIIllIIlll(final int llllllllllllIlIllIlllIlIllIlIIlI) {
        return llllllllllllIlIllIlllIlIllIlIIlI != 0;
    }
    
    private static String lIlIIIlIIlIllIIl(String llllllllllllIlIllIlllIlIlllIIllI, final String llllllllllllIlIllIlllIlIlllIIlIl) {
        llllllllllllIlIllIlllIlIlllIIllI = new String(Base64.getDecoder().decode(llllllllllllIlIllIlllIlIlllIIllI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder llllllllllllIlIllIlllIlIlllIlIIl = new StringBuilder();
        final char[] llllllllllllIlIllIlllIlIlllIlIII = llllllllllllIlIllIlllIlIlllIIlIl.toCharArray();
        int llllllllllllIlIllIlllIlIlllIIlll = EntityMinecartFurnace.lllIlIIllIlIlI[1];
        final float llllllllllllIlIllIlllIlIlllIIIIl = (Object)llllllllllllIlIllIlllIlIlllIIllI.toCharArray();
        final char llllllllllllIlIllIlllIlIlllIIIII = (char)llllllllllllIlIllIlllIlIlllIIIIl.length;
        double llllllllllllIlIllIlllIlIllIlllll = EntityMinecartFurnace.lllIlIIllIlIlI[1];
        while (lIlIIIlIIlllIIII((int)llllllllllllIlIllIlllIlIllIlllll, llllllllllllIlIllIlllIlIlllIIIII)) {
            final char llllllllllllIlIllIlllIlIlllIllII = llllllllllllIlIllIlllIlIlllIIIIl[llllllllllllIlIllIlllIlIllIlllll];
            llllllllllllIlIllIlllIlIlllIlIIl.append((char)(llllllllllllIlIllIlllIlIlllIllII ^ llllllllllllIlIllIlllIlIlllIlIII[llllllllllllIlIllIlllIlIlllIIlll % llllllllllllIlIllIlllIlIlllIlIII.length]));
            "".length();
            ++llllllllllllIlIllIlllIlIlllIIlll;
            ++llllllllllllIlIllIlllIlIllIlllll;
            "".length();
            if ("   ".length() == 0) {
                return null;
            }
        }
        return String.valueOf(llllllllllllIlIllIlllIlIlllIlIIl);
    }
    
    @Override
    protected void entityInit() {
        super.entityInit();
        this.dataWatcher.addObject(EntityMinecartFurnace.lllIlIIllIlIlI[0], new Byte((byte)EntityMinecartFurnace.lllIlIIllIlIlI[1]));
    }
    
    @Override
    protected void readEntityFromNBT(final NBTTagCompound llllllllllllIlIllIlllIllIIIlllII) {
        super.readEntityFromNBT(llllllllllllIlIllIlllIllIIIlllII);
        this.pushX = llllllllllllIlIllIlllIllIIIlllII.getDouble(EntityMinecartFurnace.lllIlIIllIIlII[EntityMinecartFurnace.lllIlIIllIlIlI[3]]);
        this.pushZ = llllllllllllIlIllIlllIllIIIlllII.getDouble(EntityMinecartFurnace.lllIlIIllIIlII[EntityMinecartFurnace.lllIlIIllIlIlI[7]]);
        this.fuel = llllllllllllIlIllIlllIllIIIlllII.getShort(EntityMinecartFurnace.lllIlIIllIIlII[EntityMinecartFurnace.lllIlIIllIlIlI[8]]);
    }
    
    @Override
    protected double getMaximumSpeed() {
        return 0.2;
    }
    
    @Override
    public boolean interactFirst(final EntityPlayer llllllllllllIlIllIlllIllIIlIlIIl) {
        final ItemStack llllllllllllIlIllIlllIllIIlIlIll = llllllllllllIlIllIlllIllIIlIlIIl.inventory.getCurrentItem();
        if (lIlIIIlIIllIlllI(llllllllllllIlIllIlllIllIIlIlIll) && lIlIIIlIIllIllll(llllllllllllIlIllIlllIllIIlIlIll.getItem(), Items.coal)) {
            if (lIlIIIlIIllIlIII(llllllllllllIlIllIlllIllIIlIlIIl.capabilities.isCreativeMode ? 1 : 0)) {
                final ItemStack itemStack = llllllllllllIlIllIlllIllIIlIlIll;
                final int n = itemStack.stackSize - EntityMinecartFurnace.lllIlIIllIlIlI[2];
                itemStack.stackSize = n;
                if (lIlIIIlIIllIlIII(n)) {
                    llllllllllllIlIllIlllIllIIlIlIIl.inventory.setInventorySlotContents(llllllllllllIlIllIlllIllIIlIlIIl.inventory.currentItem, null);
                }
            }
            this.fuel += EntityMinecartFurnace.lllIlIIllIlIlI[4];
        }
        this.pushX = this.posX - llllllllllllIlIllIlllIllIIlIlIIl.posX;
        this.pushZ = this.posZ - llllllllllllIlIllIlllIllIIlIlIIl.posZ;
        return EntityMinecartFurnace.lllIlIIllIlIlI[2] != 0;
    }
    
    @Override
    public void onUpdate() {
        super.onUpdate();
        if (lIlIIIlIIllIIlIl(this.fuel)) {
            this.fuel -= EntityMinecartFurnace.lllIlIIllIlIlI[2];
        }
        if (lIlIIIlIIllIIllI(this.fuel)) {
            final double n = 0.0;
            this.pushZ = n;
            this.pushX = n;
        }
        int minecartPowered;
        if (lIlIIIlIIllIIlIl(this.fuel)) {
            minecartPowered = EntityMinecartFurnace.lllIlIIllIlIlI[2];
            "".length();
            if ("   ".length() <= 0) {
                return;
            }
        }
        else {
            minecartPowered = EntityMinecartFurnace.lllIlIIllIlIlI[1];
        }
        this.setMinecartPowered((boolean)(minecartPowered != 0));
        if (lIlIIIlIIllIIlll(this.isMinecartPowered() ? 1 : 0) && lIlIIIlIIllIlIII(this.rand.nextInt(EntityMinecartFurnace.lllIlIIllIlIlI[3]))) {
            this.worldObj.spawnParticle(EnumParticleTypes.SMOKE_LARGE, this.posX, this.posY + 0.8, this.posZ, 0.0, 0.0, 0.0, new int[EntityMinecartFurnace.lllIlIIllIlIlI[1]]);
        }
    }
    
    public EntityMinecartFurnace(final World llllllllllllIlIllIlllIllIlIllIlI, final double llllllllllllIlIllIlllIllIlIllIIl, final double llllllllllllIlIllIlllIllIlIlllIl, final double llllllllllllIlIllIlllIllIlIlllII) {
        super(llllllllllllIlIllIlllIllIlIllIlI, llllllllllllIlIllIlllIllIlIllIIl, llllllllllllIlIllIlllIllIlIlllIl, llllllllllllIlIllIlllIllIlIlllII);
    }
    
    @Override
    protected void applyDrag() {
        double llllllllllllIlIllIlllIllIIllIlIl = this.pushX * this.pushX + this.pushZ * this.pushZ;
        if (lIlIIIlIIllIIlIl(lIlIIIlIIllIllII(llllllllllllIlIllIlllIllIIllIlIl, 1.0E-4))) {
            llllllllllllIlIllIlllIllIIllIlIl = MathHelper.sqrt_double(llllllllllllIlIllIlllIllIIllIlIl);
            this.pushX /= llllllllllllIlIllIlllIllIIllIlIl;
            this.pushZ /= llllllllllllIlIllIlllIllIIllIlIl;
            final double llllllllllllIlIllIlllIllIIllIlII = 1.0;
            this.motionX *= 0.800000011920929;
            this.motionY *= 0.0;
            this.motionZ *= 0.800000011920929;
            this.motionX += this.pushX * llllllllllllIlIllIlllIllIIllIlII;
            this.motionZ += this.pushZ * llllllllllllIlIllIlllIllIIllIlII;
            "".length();
            if (-"  ".length() > 0) {
                return;
            }
        }
        else {
            this.motionX *= 0.9800000190734863;
            this.motionY *= 0.0;
            this.motionZ *= 0.9800000190734863;
        }
        super.applyDrag();
    }
}
