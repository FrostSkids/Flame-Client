// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.entity.item;

import net.minecraft.world.storage.MapData;
import net.minecraft.item.ItemMap;
import net.minecraft.init.Items;
import net.minecraft.nbt.NBTBase;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.BlockPos;
import java.util.Arrays;
import net.minecraft.entity.Entity;
import net.minecraft.world.World;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.security.MessageDigest;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import net.minecraft.util.DamageSource;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.EntityHanging;

public class EntityItemFrame extends EntityHanging
{
    private /* synthetic */ float itemDropChance;
    private static final /* synthetic */ String[] lIlllIIIIlIllI;
    private static final /* synthetic */ int[] lIlllIIIIllIIl;
    
    private void setDisplayedItemWithUpdate(ItemStack llllllllllllIlllllIllllIIIlIIlll, final boolean llllllllllllIlllllIllllIIIlIlIIl) {
        if (lIIIIIIIlllllIII(llllllllllllIlllllIllllIIIlIIlll)) {
            llllllllllllIlllllIllllIIIlIIlll = ((ItemStack)llllllllllllIlllllIllllIIIlIIlll).copy();
            ((ItemStack)llllllllllllIlllllIllllIIIlIIlll).stackSize = EntityItemFrame.lIlllIIIIllIIl[4];
            ((ItemStack)llllllllllllIlllllIllllIIIlIIlll).setItemFrame(this);
        }
        this.getDataWatcher().updateObject(EntityItemFrame.lIlllIIIIllIIl[0], llllllllllllIlllllIllllIIIlIIlll);
        this.getDataWatcher().setObjectWatched(EntityItemFrame.lIlllIIIIllIIl[0]);
        if (lIIIIIIIllllIllI(llllllllllllIlllllIllllIIIlIlIIl ? 1 : 0) && lIIIIIIIlllllIII(this.hangingPosition)) {
            this.worldObj.updateComparatorOutputLevel(this.hangingPosition, Blocks.air);
        }
    }
    
    @Override
    public boolean attackEntityFrom(final DamageSource llllllllllllIlllllIllllIIllIIIlI, final float llllllllllllIlllllIllllIIllIIIIl) {
        if (lIIIIIIIllllIllI(this.isEntityInvulnerable(llllllllllllIlllllIllllIIllIIIlI) ? 1 : 0)) {
            return EntityItemFrame.lIlllIIIIllIIl[3] != 0;
        }
        if (lIIIIIIIllllIlll(llllllllllllIlllllIllllIIllIIIlI.isExplosion() ? 1 : 0) && lIIIIIIIlllllIII(this.getDisplayedItem())) {
            if (lIIIIIIIllllIlll(this.worldObj.isRemote ? 1 : 0)) {
                this.dropItemOrSelf(llllllllllllIlllllIllllIIllIIIlI.getEntity(), (boolean)(EntityItemFrame.lIlllIIIIllIIl[3] != 0));
                this.setDisplayedItem(null);
            }
            return EntityItemFrame.lIlllIIIIllIIl[4] != 0;
        }
        return super.attackEntityFrom(llllllllllllIlllllIllllIIllIIIlI, llllllllllllIlllllIllllIIllIIIIl);
    }
    
    private static String lIIIIIIIlllIlIIl(String llllllllllllIlllllIlllIlllIlllII, final String llllllllllllIlllllIlllIllllIIIII) {
        llllllllllllIlllllIlllIlllIlllII = new String(Base64.getDecoder().decode(llllllllllllIlllllIlllIlllIlllII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder llllllllllllIlllllIlllIlllIlllll = new StringBuilder();
        final char[] llllllllllllIlllllIlllIlllIllllI = llllllllllllIlllllIlllIllllIIIII.toCharArray();
        int llllllllllllIlllllIlllIlllIlllIl = EntityItemFrame.lIlllIIIIllIIl[3];
        final Exception llllllllllllIlllllIlllIlllIlIlll = (Object)llllllllllllIlllllIlllIlllIlllII.toCharArray();
        final int llllllllllllIlllllIlllIlllIlIllI = llllllllllllIlllllIlllIlllIlIlll.length;
        double llllllllllllIlllllIlllIlllIlIlIl = EntityItemFrame.lIlllIIIIllIIl[3];
        while (lIIIIIIIllllllll((int)llllllllllllIlllllIlllIlllIlIlIl, llllllllllllIlllllIlllIlllIlIllI)) {
            final char llllllllllllIlllllIlllIllllIIIlI = llllllllllllIlllllIlllIlllIlIlll[llllllllllllIlllllIlllIlllIlIlIl];
            llllllllllllIlllllIlllIlllIlllll.append((char)(llllllllllllIlllllIlllIllllIIIlI ^ llllllllllllIlllllIlllIlllIllllI[llllllllllllIlllllIlllIlllIlllIl % llllllllllllIlllllIlllIlllIllllI.length]));
            "".length();
            ++llllllllllllIlllllIlllIlllIlllIl;
            ++llllllllllllIlllllIlllIlllIlIlIl;
            "".length();
            if (-(0x10 ^ 0x14) > 0) {
                return null;
            }
        }
        return String.valueOf(llllllllllllIlllllIlllIlllIlllll);
    }
    
    private static boolean lIIIIIIIlllllIlI(final int llllllllllllIlllllIlllIllIllIlIl) {
        return llllllllllllIlllllIlllIllIllIlIl < 0;
    }
    
    private static int lIIIIIIIlllllIIl(final double n, final double n2) {
        return dcmpg(n, n2);
    }
    
    public void setItemRotation(final int llllllllllllIlllllIllllIIIIlllIl) {
        this.func_174865_a(llllllllllllIlllllIllllIIIIlllIl, (boolean)(EntityItemFrame.lIlllIIIIllIIl[4] != 0));
    }
    
    private static boolean lIIIIIIIllllIlll(final int llllllllllllIlllllIlllIllIllIlll) {
        return llllllllllllIlllllIlllIllIllIlll == 0;
    }
    
    private static String lIIIIIIIlllIlIlI(final String llllllllllllIlllllIlllIlllIIllII, final String llllllllllllIlllllIlllIlllIIlIll) {
        try {
            final SecretKeySpec llllllllllllIlllllIlllIlllIIllll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIlllllIlllIlllIIlIll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher llllllllllllIlllllIlllIlllIIlllI = Cipher.getInstance("Blowfish");
            llllllllllllIlllllIlllIlllIIlllI.init(EntityItemFrame.lIlllIIIIllIIl[6], llllllllllllIlllllIlllIlllIIllll);
            return new String(llllllllllllIlllllIlllIlllIIlllI.doFinal(Base64.getDecoder().decode(llllllllllllIlllllIlllIlllIIllII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIlllllIlllIlllIIllIl) {
            llllllllllllIlllllIlllIlllIIllIl.printStackTrace();
            return null;
        }
    }
    
    public EntityItemFrame(final World llllllllllllIlllllIllllIIlllllII) {
        super(llllllllllllIlllllIllllIIlllllII);
        this.itemDropChance = 1.0f;
    }
    
    @Override
    public void onBroken(final Entity llllllllllllIlllllIllllIIlIlIIlI) {
        this.dropItemOrSelf(llllllllllllIlllllIllllIIlIlIIlI, (boolean)(EntityItemFrame.lIlllIIIIllIIl[4] != 0));
    }
    
    private static boolean lIIIIIIIlllllllI(final int llllllllllllIlllllIlllIllIllIIll) {
        return llllllllllllIlllllIlllIllIllIIll <= 0;
    }
    
    private static String lIIIIIIIlllIlIII(final String llllllllllllIlllllIlllIlllllIIIl, final String llllllllllllIlllllIlllIllllIlllI) {
        try {
            final SecretKeySpec llllllllllllIlllllIlllIlllllIlII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIlllllIlllIllllIlllI.getBytes(StandardCharsets.UTF_8)), EntityItemFrame.lIlllIIIIllIIl[0]), "DES");
            final Cipher llllllllllllIlllllIlllIlllllIIll = Cipher.getInstance("DES");
            llllllllllllIlllllIlllIlllllIIll.init(EntityItemFrame.lIlllIIIIllIIl[6], llllllllllllIlllllIlllIlllllIlII);
            return new String(llllllllllllIlllllIlllIlllllIIll.doFinal(Base64.getDecoder().decode(llllllllllllIlllllIlllIlllllIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIlllllIlllIlllllIIlI) {
            llllllllllllIlllllIlllIlllllIIlI.printStackTrace();
            return null;
        }
    }
    
    @Override
    public boolean isInRangeToRenderDist(final double llllllllllllIlllllIllllIIlIllIlI) {
        double llllllllllllIlllllIllllIIlIllIIl = 16.0;
        llllllllllllIlllllIllllIIlIllIIl = llllllllllllIlllllIllllIIlIllIIl * 64.0 * this.renderDistanceWeight;
        if (lIIIIIIIlllllIlI(lIIIIIIIlllllIIl(llllllllllllIlllllIllllIIlIllIlI, llllllllllllIlllllIllllIIlIllIIl * llllllllllllIlllllIllllIIlIllIIl))) {
            return EntityItemFrame.lIlllIIIIllIIl[4] != 0;
        }
        return EntityItemFrame.lIlllIIIIllIIl[3] != 0;
    }
    
    public EntityItemFrame(final World llllllllllllIlllllIllllIIlllIlII, final BlockPos llllllllllllIlllllIllllIIllIllll, final EnumFacing llllllllllllIlllllIllllIIllIlllI) {
        super(llllllllllllIlllllIllllIIlllIlII, llllllllllllIlllllIllllIIllIllll);
        this.itemDropChance = 1.0f;
        this.updateFacingWithBoundingBox(llllllllllllIlllllIllllIIllIlllI);
    }
    
    @Override
    public int getWidthPixels() {
        return EntityItemFrame.lIlllIIIIllIIl[5];
    }
    
    static {
        lIIIIIIIllllIlIl();
        lIIIIIIIlllIllII();
    }
    
    @Override
    public boolean interactFirst(final EntityPlayer llllllllllllIlllllIllllIIIIIIIII) {
        if (lIIIIIIIllllllIl(this.getDisplayedItem())) {
            final ItemStack llllllllllllIlllllIlllIlllllllll = llllllllllllIlllllIllllIIIIIIIII.getHeldItem();
            if (lIIIIIIIlllllIII(llllllllllllIlllllIlllIlllllllll) && lIIIIIIIllllIlll(this.worldObj.isRemote ? 1 : 0)) {
                this.setDisplayedItem(llllllllllllIlllllIlllIlllllllll);
                if (lIIIIIIIllllIlll(llllllllllllIlllllIllllIIIIIIIII.capabilities.isCreativeMode ? 1 : 0)) {
                    final ItemStack itemStack = llllllllllllIlllllIlllIlllllllll;
                    final int n = itemStack.stackSize - EntityItemFrame.lIlllIIIIllIIl[4];
                    itemStack.stackSize = n;
                    if (lIIIIIIIlllllllI(n)) {
                        llllllllllllIlllllIllllIIIIIIIII.inventory.setInventorySlotContents(llllllllllllIlllllIllllIIIIIIIII.inventory.currentItem, null);
                        "".length();
                        if (-" ".length() >= ((0x4F ^ 0x48) & ~(0xA2 ^ 0xA5))) {
                            return ((0xBF ^ 0x8B) & ~(0x7A ^ 0x4E)) != 0x0;
                        }
                    }
                }
            }
        }
        else if (lIIIIIIIllllIlll(this.worldObj.isRemote ? 1 : 0)) {
            this.setItemRotation(this.getRotation() + EntityItemFrame.lIlllIIIIllIIl[4]);
        }
        return EntityItemFrame.lIlllIIIIllIIl[4] != 0;
    }
    
    private static int lIIIIIIIlllllIll(final float n, final float n2) {
        return fcmpg(n, n2);
    }
    
    @Override
    public int getHeightPixels() {
        return EntityItemFrame.lIlllIIIIllIIl[5];
    }
    
    private static boolean lIIIIIIIllllllll(final int llllllllllllIlllllIlllIlllIIIlII, final int llllllllllllIlllllIlllIlllIIIIll) {
        return llllllllllllIlllllIlllIlllIIIlII < llllllllllllIlllllIlllIlllIIIIll;
    }
    
    private static void lIIIIIIIlllIllII() {
        (lIlllIIIIlIllI = new String[EntityItemFrame.lIlllIIIIllIIl[12]])[EntityItemFrame.lIlllIIIIllIIl[3]] = lIIIIIIIlllIlIII("+w+EeRV3/xU+TeAI0Hc0lw==", "polhs");
        EntityItemFrame.lIlllIIIIlIllI[EntityItemFrame.lIlllIIIIllIIl[4]] = lIIIIIIIlllIlIIl("Ax4gLD9I", "elAAZ");
        EntityItemFrame.lIlllIIIIlIllI[EntityItemFrame.lIlllIIIIllIIl[6]] = lIIIIIIIlllIlIIl("EDcMNA==", "YCiYa");
        EntityItemFrame.lIlllIIIIlIllI[EntityItemFrame.lIlllIIIIllIIl[7]] = lIIIIIIIlllIlIlI("M6vo5Fgkc4VasO2qOywLQA==", "zYQuC");
        EntityItemFrame.lIlllIIIIlIllI[EntityItemFrame.lIlllIIIIllIIl[8]] = lIIIIIIIlllIlIII("+CxylPxI96GLKY5fKDD+/A==", "ojjxc");
        EntityItemFrame.lIlllIIIIlIllI[EntityItemFrame.lIlllIIIIllIIl[1]] = lIIIIIIIlllIlIII("zcuo3QiZQ9M=", "qtUFq");
        EntityItemFrame.lIlllIIIIlIllI[EntityItemFrame.lIlllIIIIllIIl[9]] = lIIIIIIIlllIlIlI("4twrwWRx5ziEcilNi6h41A==", "FhLuO");
        EntityItemFrame.lIlllIIIIlIllI[EntityItemFrame.lIlllIIIIllIIl[10]] = lIIIIIIIlllIlIII("CCLamO11FvpSHBMNWNstSw==", "vHEog");
        EntityItemFrame.lIlllIIIIlIllI[EntityItemFrame.lIlllIIIIllIIl[0]] = lIIIIIIIlllIlIII("5+89RHdEPcpqmw4gqCGeOQ==", "YtLHL");
        EntityItemFrame.lIlllIIIIlIllI[EntityItemFrame.lIlllIIIIllIIl[2]] = lIIIIIIIlllIlIlI("K1F9UYhE7F8+5osePmrPOQ==", "XtrSK");
    }
    
    @Override
    protected void entityInit() {
        this.getDataWatcher().addObjectByDataType(EntityItemFrame.lIlllIIIIllIIl[0], EntityItemFrame.lIlllIIIIllIIl[1]);
        this.getDataWatcher().addObject(EntityItemFrame.lIlllIIIIllIIl[2], (byte)EntityItemFrame.lIlllIIIIllIIl[3]);
    }
    
    private static boolean lIIIIIIIlllllIII(final Object llllllllllllIlllllIlllIlllIIIIIl) {
        return llllllllllllIlllllIlllIlllIIIIIl != null;
    }
    
    @Override
    public void writeEntityToNBT(final NBTTagCompound llllllllllllIlllllIllllIIIIIlllI) {
        if (lIIIIIIIlllllIII(this.getDisplayedItem())) {
            llllllllllllIlllllIllllIIIIIlllI.setTag(EntityItemFrame.lIlllIIIIlIllI[EntityItemFrame.lIlllIIIIllIIl[6]], this.getDisplayedItem().writeToNBT(new NBTTagCompound()));
            llllllllllllIlllllIllllIIIIIlllI.setByte(EntityItemFrame.lIlllIIIIlIllI[EntityItemFrame.lIlllIIIIllIIl[7]], (byte)this.getRotation());
            llllllllllllIlllllIllllIIIIIlllI.setFloat(EntityItemFrame.lIlllIIIIlIllI[EntityItemFrame.lIlllIIIIllIIl[8]], this.itemDropChance);
        }
        super.writeEntityToNBT(llllllllllllIlllllIllllIIIIIlllI);
    }
    
    private static boolean lIIIIIIIllllllII(final Object llllllllllllIlllllIlllIllIlllllI, final Object llllllllllllIlllllIlllIllIllllIl) {
        return llllllllllllIlllllIlllIllIlllllI == llllllllllllIlllllIlllIllIllllIl;
    }
    
    @Override
    public void readEntityFromNBT(final NBTTagCompound llllllllllllIlllllIllllIIIIIlIIl) {
        final NBTTagCompound llllllllllllIlllllIllllIIIIIlIII = llllllllllllIlllllIllllIIIIIlIIl.getCompoundTag(EntityItemFrame.lIlllIIIIlIllI[EntityItemFrame.lIlllIIIIllIIl[1]]);
        if (lIIIIIIIlllllIII(llllllllllllIlllllIllllIIIIIlIII) && lIIIIIIIllllIlll(llllllllllllIlllllIllllIIIIIlIII.hasNoTags() ? 1 : 0)) {
            this.setDisplayedItemWithUpdate(ItemStack.loadItemStackFromNBT(llllllllllllIlllllIllllIIIIIlIII), (boolean)(EntityItemFrame.lIlllIIIIllIIl[3] != 0));
            this.func_174865_a(llllllllllllIlllllIllllIIIIIlIIl.getByte(EntityItemFrame.lIlllIIIIlIllI[EntityItemFrame.lIlllIIIIllIIl[9]]), (boolean)(EntityItemFrame.lIlllIIIIllIIl[3] != 0));
            if (lIIIIIIIllllIllI(llllllllllllIlllllIllllIIIIIlIIl.hasKey(EntityItemFrame.lIlllIIIIlIllI[EntityItemFrame.lIlllIIIIllIIl[10]], EntityItemFrame.lIlllIIIIllIIl[11]) ? 1 : 0)) {
                this.itemDropChance = llllllllllllIlllllIllllIIIIIlIIl.getFloat(EntityItemFrame.lIlllIIIIlIllI[EntityItemFrame.lIlllIIIIllIIl[0]]);
            }
            if (lIIIIIIIllllIllI(llllllllllllIlllllIllllIIIIIlIIl.hasKey(EntityItemFrame.lIlllIIIIlIllI[EntityItemFrame.lIlllIIIIllIIl[2]]) ? 1 : 0)) {
                this.func_174865_a(this.getRotation() * EntityItemFrame.lIlllIIIIllIIl[6], (boolean)(EntityItemFrame.lIlllIIIIllIIl[3] != 0));
            }
        }
        super.readEntityFromNBT(llllllllllllIlllllIllllIIIIIlIIl);
    }
    
    private void removeFrameFromMap(final ItemStack llllllllllllIlllllIllllIIIllllII) {
        if (lIIIIIIIlllllIII(llllllllllllIlllllIllllIIIllllII)) {
            if (lIIIIIIIllllllII(llllllllllllIlllllIllllIIIllllII.getItem(), Items.filled_map)) {
                final MapData llllllllllllIlllllIllllIIIlllIll = ((ItemMap)llllllllllllIlllllIllllIIIllllII.getItem()).getMapData(llllllllllllIlllllIllllIIIllllII, this.worldObj);
                llllllllllllIlllllIllllIIIlllIll.mapDecorations.remove(String.valueOf(new StringBuilder(EntityItemFrame.lIlllIIIIlIllI[EntityItemFrame.lIlllIIIIllIIl[4]]).append(this.getEntityId())));
                "".length();
            }
            llllllllllllIlllllIllllIIIllllII.setItemFrame(null);
        }
    }
    
    public void dropItemOrSelf(final Entity llllllllllllIlllllIllllIIlIIlIIl, final boolean llllllllllllIlllllIllllIIlIIIIll) {
        if (lIIIIIIIllllIllI(this.worldObj.getGameRules().getBoolean(EntityItemFrame.lIlllIIIIlIllI[EntityItemFrame.lIlllIIIIllIIl[3]]) ? 1 : 0)) {
            ItemStack llllllllllllIlllllIllllIIlIIIlll = this.getDisplayedItem();
            if (lIIIIIIIllllIllI((llllllllllllIlllllIllllIIlIIlIIl instanceof EntityPlayer) ? 1 : 0)) {
                final EntityPlayer llllllllllllIlllllIllllIIlIIIllI = (EntityPlayer)llllllllllllIlllllIllllIIlIIlIIl;
                if (lIIIIIIIllllIllI(llllllllllllIlllllIllllIIlIIIllI.capabilities.isCreativeMode ? 1 : 0)) {
                    this.removeFrameFromMap(llllllllllllIlllllIllllIIlIIIlll);
                    return;
                }
            }
            if (lIIIIIIIllllIllI(llllllllllllIlllllIllllIIlIIIIll ? 1 : 0)) {
                this.entityDropItem(new ItemStack(Items.item_frame), 0.0f);
                "".length();
            }
            if (lIIIIIIIlllllIII(llllllllllllIlllllIllllIIlIIIlll) && lIIIIIIIlllllIlI(lIIIIIIIlllllIll(this.rand.nextFloat(), this.itemDropChance))) {
                llllllllllllIlllllIllllIIlIIIlll = llllllllllllIlllllIllllIIlIIIlll.copy();
                this.removeFrameFromMap(llllllllllllIlllllIllllIIlIIIlll);
                this.entityDropItem(llllllllllllIlllllIllllIIlIIIlll, 0.0f);
                "".length();
            }
        }
    }
    
    private static void lIIIIIIIllllIlIl() {
        (lIlllIIIIllIIl = new int[13])[0] = (124 + 96 - 219 + 164 ^ 14 + 157 - 67 + 69);
        EntityItemFrame.lIlllIIIIllIIl[1] = (0x5 ^ 0x0);
        EntityItemFrame.lIlllIIIIllIIl[2] = (0x61 ^ 0x68);
        EntityItemFrame.lIlllIIIIllIIl[3] = ((0x4F ^ 0x1B) & ~(0x45 ^ 0x11));
        EntityItemFrame.lIlllIIIIllIIl[4] = " ".length();
        EntityItemFrame.lIlllIIIIllIIl[5] = (0x67 ^ 0x49 ^ (0x8E ^ 0xAC));
        EntityItemFrame.lIlllIIIIllIIl[6] = "  ".length();
        EntityItemFrame.lIlllIIIIllIIl[7] = "   ".length();
        EntityItemFrame.lIlllIIIIllIIl[8] = (0x2C ^ 0x17 ^ (0xFC ^ 0xC3));
        EntityItemFrame.lIlllIIIIllIIl[9] = (164 + 51 - 184 + 143 ^ 72 + 98 - 72 + 70);
        EntityItemFrame.lIlllIIIIllIIl[10] = (0x27 ^ 0x20);
        EntityItemFrame.lIlllIIIIllIIl[11] = (0xE0 ^ 0x83);
        EntityItemFrame.lIlllIIIIllIIl[12] = (0x4C ^ 0x46);
    }
    
    public int getRotation() {
        return this.getDataWatcher().getWatchableObjectByte(EntityItemFrame.lIlllIIIIllIIl[2]);
    }
    
    @Override
    public float getCollisionBorderSize() {
        return 0.0f;
    }
    
    private void func_174865_a(final int llllllllllllIlllllIllllIIIIlIlIl, final boolean llllllllllllIlllllIllllIIIIlIlll) {
        this.getDataWatcher().updateObject(EntityItemFrame.lIlllIIIIllIIl[2], (byte)(llllllllllllIlllllIllllIIIIlIlIl % EntityItemFrame.lIlllIIIIllIIl[0]));
        if (lIIIIIIIllllIllI(llllllllllllIlllllIllllIIIIlIlll ? 1 : 0) && lIIIIIIIlllllIII(this.hangingPosition)) {
            this.worldObj.updateComparatorOutputLevel(this.hangingPosition, Blocks.air);
        }
    }
    
    public ItemStack getDisplayedItem() {
        return this.getDataWatcher().getWatchableObjectItemStack(EntityItemFrame.lIlllIIIIllIIl[0]);
    }
    
    private static boolean lIIIIIIIllllIllI(final int llllllllllllIlllllIlllIllIlllIIl) {
        return llllllllllllIlllllIlllIllIlllIIl != 0;
    }
    
    public void setDisplayedItem(final ItemStack llllllllllllIlllllIllllIIIllIIIl) {
        this.setDisplayedItemWithUpdate(llllllllllllIlllllIllllIIIllIIIl, (boolean)(EntityItemFrame.lIlllIIIIllIIl[4] != 0));
    }
    
    public int func_174866_q() {
        int n;
        if (lIIIIIIIllllllIl(this.getDisplayedItem())) {
            n = EntityItemFrame.lIlllIIIIllIIl[3];
            "".length();
            if (((0x9A ^ 0xB6) & ~(0x4F ^ 0x63)) == "  ".length()) {
                return (0xAE ^ 0x88) & ~(0x86 ^ 0xA0) & ~((0x2F ^ 0x4D) & ~(0xD8 ^ 0xBA));
            }
        }
        else {
            n = this.getRotation() % EntityItemFrame.lIlllIIIIllIIl[0] + EntityItemFrame.lIlllIIIIllIIl[4];
        }
        return n;
    }
    
    private static boolean lIIIIIIIllllllIl(final Object llllllllllllIlllllIlllIllIlllIll) {
        return llllllllllllIlllllIlllIllIlllIll == null;
    }
}
