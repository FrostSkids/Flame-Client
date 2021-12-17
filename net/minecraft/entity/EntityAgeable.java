// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.entity;

import net.minecraft.world.World;
import net.minecraft.util.MathHelper;
import net.minecraft.item.ItemStack;
import net.minecraft.init.Items;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.nbt.NBTTagCompound;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;

public abstract class EntityAgeable extends EntityCreature
{
    protected /* synthetic */ int field_175503_c;
    private static final /* synthetic */ String[] lIIIllIllIlIll;
    private /* synthetic */ float ageWidth;
    private /* synthetic */ float ageHeight;
    protected /* synthetic */ int field_175502_b;
    private static final /* synthetic */ int[] lIIIllIllIllIl;
    protected /* synthetic */ int growingAge;
    
    private static int llIIIlIlIlIllIl(final float n, final float n2) {
        return fcmpl(n, n2);
    }
    
    private static void llIIIlIlIlIIIlI() {
        (lIIIllIllIlIll = new String[EntityAgeable.lIIIllIllIllIl[9]])[EntityAgeable.lIIIllIllIllIl[2]] = llIIIlIlIlIIIII("dYu2ifvZW30=", "bbhYj");
        EntityAgeable.lIIIllIllIlIll[EntityAgeable.lIIIllIllIllIl[1]] = llIIIlIlIlIIIII("m0w3mz1ql1Tw0OEZBlZ9tw==", "qvbuJ");
        EntityAgeable.lIIIllIllIlIll[EntityAgeable.lIIIllIllIllIl[7]] = llIIIlIlIlIIIII("1wBxk4RzShE=", "iCjRQ");
        EntityAgeable.lIIIllIllIlIll[EntityAgeable.lIIIllIllIllIl[8]] = llIIIlIlIlIIIIl("cBIEt78SZEz7m/gWA29oxQ==", "Mwetv");
    }
    
    protected void onGrowingAdult() {
    }
    
    private static String llIIIlIlIlIIIIl(final String lllllllllllllIIllllllIllIIIlllll, final String lllllllllllllIIllllllIllIIlIIIII) {
        try {
            final SecretKeySpec lllllllllllllIIllllllIllIIlIIlII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIIllllllIllIIlIIIII.getBytes(StandardCharsets.UTF_8)), EntityAgeable.lIIIllIllIllIl[10]), "DES");
            final Cipher lllllllllllllIIllllllIllIIlIIIll = Cipher.getInstance("DES");
            lllllllllllllIIllllllIllIIlIIIll.init(EntityAgeable.lIIIllIllIllIl[7], lllllllllllllIIllllllIllIIlIIlII);
            return new String(lllllllllllllIIllllllIllIIlIIIll.doFinal(Base64.getDecoder().decode(lllllllllllllIIllllllIllIIIlllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIllllllIllIIlIIIlI) {
            lllllllllllllIIllllllIllIIlIIIlI.printStackTrace();
            return null;
        }
    }
    
    @Override
    public void writeEntityToNBT(final NBTTagCompound lllllllllllllIIllllllIllIlIlIIll) {
        super.writeEntityToNBT(lllllllllllllIIllllllIllIlIlIIll);
        lllllllllllllIIllllllIllIlIlIIll.setInteger(EntityAgeable.lIIIllIllIlIll[EntityAgeable.lIIIllIllIllIl[2]], this.getGrowingAge());
        lllllllllllllIIllllllIllIlIlIIll.setInteger(EntityAgeable.lIIIllIllIlIll[EntityAgeable.lIIIllIllIllIl[1]], this.field_175502_b);
    }
    
    private static void llIIIlIlIlIIlIl() {
        (lIIIllIllIllIl = new int[11])[0] = -(-(0xFFFFB6FC & 0x6B17) & (-1 & 0x7FD3));
        EntityAgeable.lIIIllIllIllIl[1] = " ".length();
        EntityAgeable.lIIIllIllIllIl[2] = ((0x67 ^ 0x11 ^ (0x79 ^ 0x9)) & (0x80 ^ 0xBF ^ (0xA ^ 0x33) ^ -" ".length()));
        EntityAgeable.lIIIllIllIllIl[3] = (0x39 ^ 0x24 ^ (0x80 ^ 0x91));
        EntityAgeable.lIIIllIllIllIl[4] = (0x63 ^ 0x47 ^ (0x5 ^ 0x35));
        EntityAgeable.lIIIllIllIllIl[5] = (0xE ^ 0x26);
        EntityAgeable.lIIIllIllIllIl[6] = -" ".length();
        EntityAgeable.lIIIllIllIllIl[7] = "  ".length();
        EntityAgeable.lIIIllIllIllIl[8] = "   ".length();
        EntityAgeable.lIIIllIllIllIl[9] = (0x4A ^ 0x4E);
        EntityAgeable.lIIIllIllIllIl[10] = (0x74 ^ 0x7C);
    }
    
    public void func_175501_a(final int lllllllllllllIIllllllIllIllIllIl, final boolean lllllllllllllIIllllllIllIllIllII) {
        final int lllllllllllllIIllllllIllIllIlIlI;
        int lllllllllllllIIllllllIllIllIlIll = lllllllllllllIIllllllIllIllIlIlI = this.getGrowingAge();
        lllllllllllllIIllllllIllIllIlIll += lllllllllllllIIllllllIllIllIllIl * EntityAgeable.lIIIllIllIllIl[4];
        if (llIIIlIlIlIlIll(lllllllllllllIIllllllIllIllIlIll)) {
            lllllllllllllIIllllllIllIllIlIll = EntityAgeable.lIIIllIllIllIl[2];
            if (llIIIlIlIlIllII(lllllllllllllIIllllllIllIllIlIlI)) {
                this.onGrowingAdult();
            }
        }
        final int lllllllllllllIIllllllIllIllIlIIl = lllllllllllllIIllllllIllIllIlIll - lllllllllllllIIllllllIllIllIlIlI;
        this.setGrowingAge(lllllllllllllIIllllllIllIllIlIll);
        if (llIIIlIlIlIlIIl(lllllllllllllIIllllllIllIllIllII ? 1 : 0)) {
            this.field_175502_b += lllllllllllllIIllllllIllIllIlIIl;
            if (llIIIlIlIlIlIII(this.field_175503_c)) {
                this.field_175503_c = EntityAgeable.lIIIllIllIllIl[5];
            }
        }
        if (llIIIlIlIlIlIII(this.getGrowingAge())) {
            this.setGrowingAge(this.field_175502_b);
        }
    }
    
    @Override
    public void onLivingUpdate() {
        super.onLivingUpdate();
        if (llIIIlIlIlIlIIl(this.worldObj.isRemote ? 1 : 0)) {
            if (llIIIlIlIlIlIll(this.field_175503_c)) {
                if (llIIIlIlIlIlIII(this.field_175503_c % EntityAgeable.lIIIllIllIllIl[9])) {
                    this.worldObj.spawnParticle(EnumParticleTypes.VILLAGER_HAPPY, this.posX + this.rand.nextFloat() * this.width * 2.0f - this.width, this.posY + 0.5 + this.rand.nextFloat() * this.height, this.posZ + this.rand.nextFloat() * this.width * 2.0f - this.width, 0.0, 0.0, 0.0, new int[EntityAgeable.lIIIllIllIllIl[2]]);
                }
                this.field_175503_c -= EntityAgeable.lIIIllIllIllIl[1];
            }
            this.setScaleForAge(this.isChild());
            "".length();
            if (null != null) {
                return;
            }
        }
        else {
            int lllllllllllllIIllllllIllIlIIIlll = this.getGrowingAge();
            if (llIIIlIlIlIllII(lllllllllllllIIllllllIllIlIIIlll)) {
                ++lllllllllllllIIllllllIllIlIIIlll;
                this.setGrowingAge(lllllllllllllIIllllllIllIlIIIlll);
                if (llIIIlIlIlIlIII(lllllllllllllIIllllllIllIlIIIlll)) {
                    this.onGrowingAdult();
                    "".length();
                    if (-"  ".length() > 0) {
                        return;
                    }
                }
            }
            else if (llIIIlIlIlIlIll(lllllllllllllIIllllllIllIlIIIlll)) {
                --lllllllllllllIIllllllIllIlIIIlll;
                this.setGrowingAge(lllllllllllllIIllllllIllIlIIIlll);
            }
        }
    }
    
    private static boolean llIIIlIlIlIlIIl(final int lllllllllllllIIllllllIllIIIIIlll) {
        return lllllllllllllIIllllllIllIIIIIlll != 0;
    }
    
    public boolean interact(final EntityPlayer lllllllllllllIIllllllIlllIIIIIll) {
        final ItemStack lllllllllllllIIllllllIlllIIIIIlI = lllllllllllllIIllllllIlllIIIIIll.inventory.getCurrentItem();
        if (llIIIlIlIlIIllI(lllllllllllllIIllllllIlllIIIIIlI) && llIIIlIlIlIIlll(lllllllllllllIIllllllIlllIIIIIlI.getItem(), Items.spawn_egg)) {
            if (llIIIlIlIlIlIII(this.worldObj.isRemote ? 1 : 0)) {
                final Class<? extends Entity> lllllllllllllIIllllllIlllIIIIIIl = EntityList.getClassFromID(lllllllllllllIIllllllIlllIIIIIlI.getMetadata());
                if (llIIIlIlIlIIllI(lllllllllllllIIllllllIlllIIIIIIl) && llIIIlIlIlIIlll(this.getClass(), lllllllllllllIIllllllIlllIIIIIIl)) {
                    final EntityAgeable lllllllllllllIIllllllIlllIIIIIII = this.createChild(this);
                    if (llIIIlIlIlIIllI(lllllllllllllIIllllllIlllIIIIIII)) {
                        lllllllllllllIIllllllIlllIIIIIII.setGrowingAge(EntityAgeable.lIIIllIllIllIl[0]);
                        lllllllllllllIIllllllIlllIIIIIII.setLocationAndAngles(this.posX, this.posY, this.posZ, 0.0f, 0.0f);
                        this.worldObj.spawnEntityInWorld(lllllllllllllIIllllllIlllIIIIIII);
                        "".length();
                        if (llIIIlIlIlIlIIl(lllllllllllllIIllllllIlllIIIIIlI.hasDisplayName() ? 1 : 0)) {
                            lllllllllllllIIllllllIlllIIIIIII.setCustomNameTag(lllllllllllllIIllllllIlllIIIIIlI.getDisplayName());
                        }
                        if (llIIIlIlIlIlIII(lllllllllllllIIllllllIlllIIIIIll.capabilities.isCreativeMode ? 1 : 0)) {
                            final ItemStack itemStack = lllllllllllllIIllllllIlllIIIIIlI;
                            itemStack.stackSize -= EntityAgeable.lIIIllIllIllIl[1];
                            if (llIIIlIlIlIlIlI(lllllllllllllIIllllllIlllIIIIIlI.stackSize)) {
                                lllllllllllllIIllllllIlllIIIIIll.inventory.setInventorySlotContents(lllllllllllllIIllllllIlllIIIIIll.inventory.currentItem, null);
                            }
                        }
                    }
                }
            }
            return EntityAgeable.lIIIllIllIllIl[1] != 0;
        }
        return EntityAgeable.lIIIllIllIllIl[2] != 0;
    }
    
    @Override
    public boolean isChild() {
        if (llIIIlIlIlIllII(this.getGrowingAge())) {
            return EntityAgeable.lIIIllIllIllIl[1] != 0;
        }
        return EntityAgeable.lIIIllIllIllIl[2] != 0;
    }
    
    public void setScaleForAge(final boolean lllllllllllllIIllllllIllIIlllIll) {
        float scale;
        if (llIIIlIlIlIlIIl(lllllllllllllIIllllllIllIIlllIll ? 1 : 0)) {
            scale = 0.5f;
            "".length();
            if ((0x6C ^ 0x69 ^ " ".length()) == 0x0) {
                return;
            }
        }
        else {
            scale = 1.0f;
        }
        this.setScale(scale);
    }
    
    public abstract EntityAgeable createChild(final EntityAgeable p0);
    
    private static boolean llIIIlIlIlIlIll(final int lllllllllllllIIllllllIlIllllllll) {
        return lllllllllllllIIllllllIlIllllllll > 0;
    }
    
    @Override
    protected final void setSize(final float lllllllllllllIIllllllIllIIllIIIl, final float lllllllllllllIIllllllIllIIllIlII) {
        int n;
        if (llIIIlIlIlIlIll(llIIIlIlIlIllIl(this.ageWidth, 0.0f))) {
            n = EntityAgeable.lIIIllIllIllIl[1];
            "".length();
            if (null != null) {
                return;
            }
        }
        else {
            n = EntityAgeable.lIIIllIllIllIl[2];
        }
        final boolean lllllllllllllIIllllllIllIIllIIll = n != 0;
        this.ageWidth = lllllllllllllIIllllllIllIIllIIIl;
        this.ageHeight = lllllllllllllIIllllllIllIIllIlII;
        if (llIIIlIlIlIlIII(lllllllllllllIIllllllIllIIllIIll ? 1 : 0)) {
            this.setScale(1.0f);
        }
    }
    
    @Override
    protected void entityInit() {
        super.entityInit();
        this.dataWatcher.addObject(EntityAgeable.lIIIllIllIllIl[3], (byte)EntityAgeable.lIIIllIllIllIl[2]);
    }
    
    private static boolean llIIIlIlIlIlIII(final int lllllllllllllIIllllllIllIIIIIlIl) {
        return lllllllllllllIIllllllIllIIIIIlIl == 0;
    }
    
    @Override
    public void readEntityFromNBT(final NBTTagCompound lllllllllllllIIllllllIllIlIIllIl) {
        super.readEntityFromNBT(lllllllllllllIIllllllIllIlIIllIl);
        this.setGrowingAge(lllllllllllllIIllllllIllIlIIllIl.getInteger(EntityAgeable.lIIIllIllIlIll[EntityAgeable.lIIIllIllIllIl[7]]));
        this.field_175502_b = lllllllllllllIIllllllIllIlIIllIl.getInteger(EntityAgeable.lIIIllIllIlIll[EntityAgeable.lIIIllIllIllIl[8]]);
    }
    
    protected final void setScale(final float lllllllllllllIIllllllIllIIlIlIIl) {
        super.setSize(this.ageWidth * lllllllllllllIIllllllIllIIlIlIIl, this.ageHeight * lllllllllllllIIllllllIllIIlIlIIl);
    }
    
    static {
        llIIIlIlIlIIlIl();
        llIIIlIlIlIIIlI();
    }
    
    public int getGrowingAge() {
        int n;
        if (llIIIlIlIlIlIIl(this.worldObj.isRemote ? 1 : 0)) {
            n = this.dataWatcher.getWatchableObjectByte(EntityAgeable.lIIIllIllIllIl[3]);
            "".length();
            if (null != null) {
                return (0x6C ^ 0x5B) & ~(0x9A ^ 0xAD);
            }
        }
        else {
            n = this.growingAge;
        }
        return n;
    }
    
    private static boolean llIIIlIlIlIllII(final int lllllllllllllIIllllllIllIIIIIIll) {
        return lllllllllllllIIllllllIllIIIIIIll < 0;
    }
    
    public void setGrowingAge(final int lllllllllllllIIllllllIllIlIllIIl) {
        this.dataWatcher.updateObject(EntityAgeable.lIIIllIllIllIl[3], (byte)MathHelper.clamp_int(lllllllllllllIIllllllIllIlIllIIl, EntityAgeable.lIIIllIllIllIl[6], EntityAgeable.lIIIllIllIllIl[1]));
        this.growingAge = lllllllllllllIIllllllIllIlIllIIl;
        this.setScaleForAge(this.isChild());
    }
    
    private static boolean llIIIlIlIlIIllI(final Object lllllllllllllIIllllllIllIIIIllIl) {
        return lllllllllllllIIllllllIllIIIIllIl != null;
    }
    
    private static boolean llIIIlIlIlIIlll(final Object lllllllllllllIIllllllIllIIIIlIlI, final Object lllllllllllllIIllllllIllIIIIlIIl) {
        return lllllllllllllIIllllllIllIIIIlIlI == lllllllllllllIIllllllIllIIIIlIIl;
    }
    
    private static boolean llIIIlIlIlIlIlI(final int lllllllllllllIIllllllIllIIIIIIIl) {
        return lllllllllllllIIllllllIllIIIIIIIl <= 0;
    }
    
    public void addGrowth(final int lllllllllllllIIllllllIllIlIlllll) {
        this.func_175501_a(lllllllllllllIIllllllIllIlIlllll, (boolean)(EntityAgeable.lIIIllIllIllIl[2] != 0));
    }
    
    private static String llIIIlIlIlIIIII(final String lllllllllllllIIllllllIllIIIlIIlI, final String lllllllllllllIIllllllIllIIIlIIIl) {
        try {
            final SecretKeySpec lllllllllllllIIllllllIllIIIlIlll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIIllllllIllIIIlIIIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lllllllllllllIIllllllIllIIIlIllI = Cipher.getInstance("Blowfish");
            lllllllllllllIIllllllIllIIIlIllI.init(EntityAgeable.lIIIllIllIllIl[7], lllllllllllllIIllllllIllIIIlIlll);
            return new String(lllllllllllllIIllllllIllIIIlIllI.doFinal(Base64.getDecoder().decode(lllllllllllllIIllllllIllIIIlIIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIllllllIllIIIlIlIl) {
            lllllllllllllIIllllllIllIIIlIlIl.printStackTrace();
            return null;
        }
    }
    
    public EntityAgeable(final World lllllllllllllIIllllllIlllIIIllII) {
        super(lllllllllllllIIllllllIlllIIIllII);
        this.ageWidth = -1.0f;
    }
}
