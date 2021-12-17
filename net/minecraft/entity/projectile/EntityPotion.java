// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.entity.projectile;

import java.util.Iterator;
import net.minecraft.nbt.NBTBase;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.AxisAlignedBB;
import java.util.List;
import net.minecraft.util.BlockPos;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.item.Item;
import net.minecraft.init.Items;
import net.minecraft.world.World;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import net.minecraft.item.ItemStack;

public class EntityPotion extends EntityThrowable
{
    private static final /* synthetic */ int[] lIIllIIllIIlII;
    private /* synthetic */ ItemStack potionDamage;
    private static final /* synthetic */ String[] lIIllIIllIIIlI;
    
    private static String llIlIllllIIlIIl(final String lllllllllllllIIlIlIlllllIlIllIll, final String lllllllllllllIIlIlIlllllIlIllIlI) {
        try {
            final SecretKeySpec lllllllllllllIIlIlIlllllIlIllllI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIIlIlIlllllIlIllIlI.getBytes(StandardCharsets.UTF_8)), EntityPotion.lIIllIIllIIlII[8]), "DES");
            final Cipher lllllllllllllIIlIlIlllllIlIlllIl = Cipher.getInstance("DES");
            lllllllllllllIIlIlIlllllIlIlllIl.init(EntityPotion.lIIllIIllIIlII[5], lllllllllllllIIlIlIlllllIlIllllI);
            return new String(lllllllllllllIIlIlIlllllIlIlllIl.doFinal(Base64.getDecoder().decode(lllllllllllllIIlIlIlllllIlIllIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIlIlIlllllIlIlllII) {
            lllllllllllllIIlIlIlllllIlIlllII.printStackTrace();
            return null;
        }
    }
    
    public EntityPotion(final World lllllllllllllIIlIlIllllllIlIIlII, final double lllllllllllllIIlIlIllllllIlIlIIl, final double lllllllllllllIIlIlIllllllIlIlIII, final double lllllllllllllIIlIlIllllllIlIIlll, final ItemStack lllllllllllllIIlIlIllllllIlIIIII) {
        super(lllllllllllllIIlIlIllllllIlIIlII, lllllllllllllIIlIlIllllllIlIlIIl, lllllllllllllIIlIlIllllllIlIlIII, lllllllllllllIIlIlIllllllIlIIlll);
        this.potionDamage = lllllllllllllIIlIlIllllllIlIIIII;
    }
    
    public int getPotionDamage() {
        if (llIlIllllIIllIl(this.potionDamage)) {
            this.potionDamage = new ItemStack(Items.potionitem, EntityPotion.lIIllIIllIIlII[0], EntityPotion.lIIllIIllIIlII[1]);
        }
        return this.potionDamage.getMetadata();
    }
    
    private static boolean llIlIllllIlIIll(final int lllllllllllllIIlIlIlllllIIlIllII) {
        return lllllllllllllIIlIlIlllllIIlIllII != 0;
    }
    
    private static boolean llIlIllllIlIlIl(final int lllllllllllllIIlIlIlllllIIlllIll, final int lllllllllllllIIlIlIlllllIIlllIlI) {
        return lllllllllllllIIlIlIlllllIIlllIll < lllllllllllllIIlIlIlllllIIlllIlI;
    }
    
    private static void llIlIllllIIlIlI() {
        (lIIllIIllIIIlI = new String[EntityPotion.lIIllIIllIIlII[7]])[EntityPotion.lIIllIIllIIlII[1]] = llIlIllllIIlIII("EiIeHjos", "BMjwU");
        EntityPotion.lIIllIIllIIIlI[EntityPotion.lIIllIIllIIlII[0]] = llIlIllllIIlIIl("8JI1LpK/Kpw=", "jSpLJ");
        EntityPotion.lIIllIIllIIIlI[EntityPotion.lIIllIIllIIlII[5]] = llIlIllllIIlIII("EyMAAhUNGhUHDwY=", "cLtkz");
        EntityPotion.lIIllIIllIIIlI[EntityPotion.lIIllIIllIIlII[6]] = llIlIllllIIlIIl("UxgCpSujNj8=", "bvrcn");
    }
    
    private static boolean llIlIllllIlIlII(final int lllllllllllllIIlIlIlllllIIllIlll, final int lllllllllllllIIlIlIlllllIIllIllI) {
        return lllllllllllllIIlIlIlllllIIllIlll > lllllllllllllIIlIlIlllllIIllIllI;
    }
    
    @Override
    protected void onImpact(final MovingObjectPosition lllllllllllllIIlIlIllllllIIIIlIl) {
        if (llIlIllllIIllll(this.worldObj.isRemote ? 1 : 0)) {
            final List<PotionEffect> lllllllllllllIIlIlIllllllIIIIlII = Items.potionitem.getEffects(this.potionDamage);
            if (llIlIllllIlIIII(lllllllllllllIIlIlIllllllIIIIlII) && llIlIllllIIllll(lllllllllllllIIlIlIllllllIIIIlII.isEmpty() ? 1 : 0)) {
                final AxisAlignedBB lllllllllllllIIlIlIllllllIIIIIll = this.getEntityBoundingBox().expand(4.0, 2.0, 4.0);
                final List<EntityLivingBase> lllllllllllllIIlIlIllllllIIIIIlI = this.worldObj.getEntitiesWithinAABB((Class<? extends EntityLivingBase>)EntityLivingBase.class, lllllllllllllIIlIlIllllllIIIIIll);
                if (llIlIllllIIllll(lllllllllllllIIlIlIllllllIIIIIlI.isEmpty() ? 1 : 0)) {
                    final Exception lllllllllllllIIlIlIlllllIlllIlIl = (Exception)lllllllllllllIIlIlIllllllIIIIIlI.iterator();
                    "".length();
                    if (("  ".length() & ("  ".length() ^ -" ".length())) != 0x0) {
                        return;
                    }
                    while (!llIlIllllIIllll(((Iterator)lllllllllllllIIlIlIlllllIlllIlIl).hasNext() ? 1 : 0)) {
                        final EntityLivingBase lllllllllllllIIlIlIllllllIIIIIIl = ((Iterator<EntityLivingBase>)lllllllllllllIIlIlIlllllIlllIlIl).next();
                        final double lllllllllllllIIlIlIllllllIIIIIII = this.getDistanceSqToEntity(lllllllllllllIIlIlIllllllIIIIIIl);
                        if (llIlIllllIlIIIl(llIlIllllIIlllI(lllllllllllllIIlIlIllllllIIIIIII, 16.0))) {
                            double lllllllllllllIIlIlIlllllIlllllll = 1.0 - Math.sqrt(lllllllllllllIIlIlIllllllIIIIIII) / 4.0;
                            if (llIlIllllIlIIlI(lllllllllllllIIlIlIllllllIIIIIIl, lllllllllllllIIlIlIllllllIIIIlIl.entityHit)) {
                                lllllllllllllIIlIlIlllllIlllllll = 1.0;
                            }
                            final boolean lllllllllllllIIlIlIlllllIlllIIIl = (boolean)lllllllllllllIIlIlIllllllIIIIlII.iterator();
                            "".length();
                            if (null != null) {
                                return;
                            }
                            while (!llIlIllllIIllll(((Iterator)lllllllllllllIIlIlIlllllIlllIIIl).hasNext() ? 1 : 0)) {
                                final PotionEffect lllllllllllllIIlIlIlllllIllllllI = ((Iterator<PotionEffect>)lllllllllllllIIlIlIlllllIlllIIIl).next();
                                final int lllllllllllllIIlIlIlllllIlllllIl = lllllllllllllIIlIlIlllllIllllllI.getPotionID();
                                if (llIlIllllIlIIll(Potion.potionTypes[lllllllllllllIIlIlIlllllIlllllIl].isInstant() ? 1 : 0)) {
                                    Potion.potionTypes[lllllllllllllIIlIlIlllllIlllllIl].affectEntity(this, this.getThrower(), lllllllllllllIIlIlIllllllIIIIIIl, lllllllllllllIIlIlIlllllIllllllI.getAmplifier(), lllllllllllllIIlIlIlllllIlllllll);
                                    "".length();
                                    if (((0xFA ^ 0x9F ^ (0x72 ^ 0x46)) & (0x92 ^ 0x94 ^ (0xB ^ 0x5C) ^ -" ".length())) != ((90 + 17 - 72 + 136 ^ 51 + 51 - 8 + 41) & (0x36 ^ 0xF ^ (0x4B ^ 0x5E) ^ -" ".length()))) {
                                        return;
                                    }
                                    continue;
                                }
                                else {
                                    final int lllllllllllllIIlIlIlllllIlllllII = (int)(lllllllllllllIIlIlIlllllIlllllll * lllllllllllllIIlIlIlllllIllllllI.getDuration() + 0.5);
                                    if (!llIlIllllIlIlII(lllllllllllllIIlIlIlllllIlllllII, EntityPotion.lIIllIIllIIlII[2])) {
                                        continue;
                                    }
                                    lllllllllllllIIlIlIllllllIIIIIIl.addPotionEffect(new PotionEffect(lllllllllllllIIlIlIlllllIlllllIl, lllllllllllllIIlIlIlllllIlllllII, lllllllllllllIIlIlIlllllIllllllI.getAmplifier()));
                                }
                            }
                        }
                    }
                }
            }
            this.worldObj.playAuxSFX(EntityPotion.lIIllIIllIIlII[3], new BlockPos(this), this.getPotionDamage());
            this.setDead();
        }
    }
    
    static {
        llIlIllllIIllII();
        llIlIllllIIlIlI();
    }
    
    public EntityPotion(final World lllllllllllllIIlIlIlllllllIIIllI, final EntityLivingBase lllllllllllllIIlIlIlllllllIIIlIl, final ItemStack lllllllllllllIIlIlIlllllllIIIlII) {
        super(lllllllllllllIIlIlIlllllllIIIllI, lllllllllllllIIlIlIlllllllIIIlIl);
        this.potionDamage = lllllllllllllIIlIlIlllllllIIIlII;
    }
    
    private static String llIlIllllIIlIII(String lllllllllllllIIlIlIlllllIlIIIllI, final String lllllllllllllIIlIlIlllllIlIIIlIl) {
        lllllllllllllIIlIlIlllllIlIIIllI = (boolean)new String(Base64.getDecoder().decode(((String)lllllllllllllIIlIlIlllllIlIIIllI).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIIlIlIlllllIlIIlIIl = new StringBuilder();
        final char[] lllllllllllllIIlIlIlllllIlIIlIII = lllllllllllllIIlIlIlllllIlIIIlIl.toCharArray();
        int lllllllllllllIIlIlIlllllIlIIIlll = EntityPotion.lIIllIIllIIlII[1];
        final long lllllllllllllIIlIlIlllllIlIIIIIl = (Object)((String)lllllllllllllIIlIlIlllllIlIIIllI).toCharArray();
        final boolean lllllllllllllIIlIlIlllllIlIIIIII = lllllllllllllIIlIlIlllllIlIIIIIl.length != 0;
        boolean lllllllllllllIIlIlIlllllIIllllll = EntityPotion.lIIllIIllIIlII[1] != 0;
        while (llIlIllllIlIlIl(lllllllllllllIIlIlIlllllIIllllll ? 1 : 0, lllllllllllllIIlIlIlllllIlIIIIII ? 1 : 0)) {
            final char lllllllllllllIIlIlIlllllIlIIllII = lllllllllllllIIlIlIlllllIlIIIIIl[lllllllllllllIIlIlIlllllIIllllll];
            lllllllllllllIIlIlIlllllIlIIlIIl.append((char)(lllllllllllllIIlIlIlllllIlIIllII ^ lllllllllllllIIlIlIlllllIlIIlIII[lllllllllllllIIlIlIlllllIlIIIlll % lllllllllllllIIlIlIlllllIlIIlIII.length]));
            "".length();
            ++lllllllllllllIIlIlIlllllIlIIIlll;
            ++lllllllllllllIIlIlIlllllIIllllll;
            "".length();
            if ((0x3D ^ 0x39) < "   ".length()) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIIlIlIlllllIlIIlIIl);
    }
    
    private static boolean llIlIllllIIllll(final int lllllllllllllIIlIlIlllllIIlIlIlI) {
        return lllllllllllllIIlIlIlllllIIlIlIlI == 0;
    }
    
    public EntityPotion(final World lllllllllllllIIlIlIllllllIllIllI, final double lllllllllllllIIlIlIllllllIllIlIl, final double lllllllllllllIIlIlIllllllIllIlII, final double lllllllllllllIIlIlIllllllIlllIIl, final int lllllllllllllIIlIlIllllllIllIIlI) {
        this(lllllllllllllIIlIlIllllllIllIllI, lllllllllllllIIlIlIllllllIllIlIl, lllllllllllllIIlIlIllllllIllIlII, lllllllllllllIIlIlIllllllIlllIIl, new ItemStack(Items.potionitem, EntityPotion.lIIllIIllIIlII[0], lllllllllllllIIlIlIllllllIllIIlI));
    }
    
    @Override
    protected float getVelocity() {
        return 0.5f;
    }
    
    private static boolean llIlIllllIIllIl(final Object lllllllllllllIIlIlIlllllIIlIlllI) {
        return lllllllllllllIIlIlIlllllIIlIlllI == null;
    }
    
    @Override
    protected float getInaccuracy() {
        return -20.0f;
    }
    
    public void setPotionDamage(final int lllllllllllllIIlIlIllllllIIlIlll) {
        if (llIlIllllIIllIl(this.potionDamage)) {
            this.potionDamage = new ItemStack(Items.potionitem, EntityPotion.lIIllIIllIIlII[0], EntityPotion.lIIllIIllIIlII[1]);
        }
        this.potionDamage.setItemDamage(lllllllllllllIIlIlIllllllIIlIlll);
    }
    
    @Override
    protected float getGravityVelocity() {
        return 0.05f;
    }
    
    public EntityPotion(final World lllllllllllllIIlIlIlllllllIlIllI, final EntityLivingBase lllllllllllllIIlIlIlllllllIlIlIl, final int lllllllllllllIIlIlIlllllllIlIlII) {
        this(lllllllllllllIIlIlIlllllllIlIllI, lllllllllllllIIlIlIlllllllIlIlIl, new ItemStack(Items.potionitem, EntityPotion.lIIllIIllIIlII[0], lllllllllllllIIlIlIlllllllIlIlII));
    }
    
    @Override
    public void writeEntityToNBT(final NBTTagCompound lllllllllllllIIlIlIlllllIllIIIll) {
        super.writeEntityToNBT(lllllllllllllIIlIlIlllllIllIIIll);
        if (llIlIllllIlIIII(this.potionDamage)) {
            lllllllllllllIIlIlIlllllIllIIIll.setTag(EntityPotion.lIIllIIllIIIlI[EntityPotion.lIIllIIllIIlII[6]], this.potionDamage.writeToNBT(new NBTTagCompound()));
        }
    }
    
    private static void llIlIllllIIllII() {
        (lIIllIIllIIlII = new int[9])[0] = " ".length();
        EntityPotion.lIIllIIllIIlII[1] = ((0xC9 ^ 0x8E) & ~(0x25 ^ 0x62));
        EntityPotion.lIIllIIllIIlII[2] = (0x76 ^ 0x40 ^ (0x7C ^ 0x5E));
        EntityPotion.lIIllIIllIIlII[3] = (0xFFFFF7DA & 0xFF7);
        EntityPotion.lIIllIIllIIlII[4] = (0x59 ^ 0x7C ^ (0x57 ^ 0x78));
        EntityPotion.lIIllIIllIIlII[5] = "  ".length();
        EntityPotion.lIIllIIllIIlII[6] = "   ".length();
        EntityPotion.lIIllIIllIIlII[7] = (0xAF ^ 0x8C ^ (0x36 ^ 0x11));
        EntityPotion.lIIllIIllIIlII[8] = (0x8C ^ 0xA1 ^ (0x3B ^ 0x1E));
    }
    
    @Override
    public void readEntityFromNBT(final NBTTagCompound lllllllllllllIIlIlIlllllIllIlIIl) {
        super.readEntityFromNBT(lllllllllllllIIlIlIlllllIllIlIIl);
        if (llIlIllllIlIIll(lllllllllllllIIlIlIlllllIllIlIIl.hasKey(EntityPotion.lIIllIIllIIIlI[EntityPotion.lIIllIIllIIlII[1]], EntityPotion.lIIllIIllIIlII[4]) ? 1 : 0)) {
            this.potionDamage = ItemStack.loadItemStackFromNBT(lllllllllllllIIlIlIlllllIllIlIIl.getCompoundTag(EntityPotion.lIIllIIllIIIlI[EntityPotion.lIIllIIllIIlII[0]]));
            "".length();
            if ((0xA1 ^ 0xA5) <= ((0x4D ^ 0x5D) & ~(0xB8 ^ 0xA8))) {
                return;
            }
        }
        else {
            this.setPotionDamage(lllllllllllllIIlIlIlllllIllIlIIl.getInteger(EntityPotion.lIIllIIllIIIlI[EntityPotion.lIIllIIllIIlII[5]]));
        }
        if (llIlIllllIIllIl(this.potionDamage)) {
            this.setDead();
        }
    }
    
    private static int llIlIllllIIlllI(final double n, final double n2) {
        return dcmpg(n, n2);
    }
    
    public EntityPotion(final World lllllllllllllIIlIlIlllllllIlllII) {
        super(lllllllllllllIIlIlIlllllllIlllII);
    }
    
    private static boolean llIlIllllIlIIIl(final int lllllllllllllIIlIlIlllllIIlIlIII) {
        return lllllllllllllIIlIlIlllllIIlIlIII < 0;
    }
    
    private static boolean llIlIllllIlIIII(final Object lllllllllllllIIlIlIlllllIIllIlII) {
        return lllllllllllllIIlIlIlllllIIllIlII != null;
    }
    
    private static boolean llIlIllllIlIIlI(final Object lllllllllllllIIlIlIlllllIIllIIIl, final Object lllllllllllllIIlIlIlllllIIllIIII) {
        return lllllllllllllIIlIlIlllllIIllIIIl == lllllllllllllIIlIlIlllllIIllIIII;
    }
}
