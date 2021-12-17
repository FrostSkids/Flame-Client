// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.entity.passive;

import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.block.Block;
import net.minecraft.entity.Entity;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.item.ItemStack;
import net.minecraft.init.Items;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.world.World;
import net.minecraft.entity.EntityAgeable;

public class EntityMooshroom extends EntityCow
{
    private static final /* synthetic */ String[] lIlllIIlllllll;
    private static final /* synthetic */ int[] lIlllIlIIIIIll;
    
    private static boolean lIIIIIlIIlllIlII(final int llllllllllllIlllllIIIlIlllIIllll, final int llllllllllllIlllllIIIlIlllIIlllI) {
        return llllllllllllIlllllIIIlIlllIIllll >= llllllllllllIlllllIIIlIlllIIlllI;
    }
    
    private static boolean lIIIIIlIIllIlllI(final Object llllllllllllIlllllIIIlIlllIIlIIl, final Object llllllllllllIlllllIIIlIlllIIlIII) {
        return llllllllllllIlllllIIIlIlllIIlIIl == llllllllllllIlllllIIIlIlllIIlIII;
    }
    
    public EntityMooshroom(final World llllllllllllIlllllIIIllIIIIIIIII) {
        super(llllllllllllIlllllIIIllIIIIIIIII);
        this.setSize(0.9f, 1.3f);
        this.spawnableBlock = Blocks.mycelium;
    }
    
    private static boolean lIIIIIlIIlllIIII(final int llllllllllllIlllllIIIlIlllIlIIll, final int llllllllllllIlllllIIIlIlllIlIIlI) {
        return llllllllllllIlllllIIIlIlllIlIIll == llllllllllllIlllllIIIlIlllIlIIlI;
    }
    
    private static boolean lIIIIIlIIlllIIlI(final int llllllllllllIlllllIIIlIlllIIIllI) {
        return llllllllllllIlllllIIIlIlllIIIllI != 0;
    }
    
    @Override
    public boolean interact(final EntityPlayer llllllllllllIlllllIIIlIlllllIIlI) {
        final ItemStack llllllllllllIlllllIIIlIlllllIllI = llllllllllllIlllllIIIlIlllllIIlI.inventory.getCurrentItem();
        if (lIIIIIlIIllIllIl(llllllllllllIlllllIIIlIlllllIllI) && lIIIIIlIIllIlllI(llllllllllllIlllllIIIlIlllllIllI.getItem(), Items.bowl) && lIIIIIlIIllIllll(this.getGrowingAge())) {
            if (lIIIIIlIIlllIIII(llllllllllllIlllllIIIlIlllllIllI.stackSize, EntityMooshroom.lIlllIlIIIIIll[0])) {
                llllllllllllIlllllIIIlIlllllIIlI.inventory.setInventorySlotContents(llllllllllllIlllllIIIlIlllllIIlI.inventory.currentItem, new ItemStack(Items.mushroom_stew));
                return EntityMooshroom.lIlllIlIIIIIll[0] != 0;
            }
            if (lIIIIIlIIlllIIlI(llllllllllllIlllllIIIlIlllllIIlI.inventory.addItemStackToInventory(new ItemStack(Items.mushroom_stew)) ? 1 : 0) && lIIIIIlIIlllIIll(llllllllllllIlllllIIIlIlllllIIlI.capabilities.isCreativeMode ? 1 : 0)) {
                llllllllllllIlllllIIIlIlllllIIlI.inventory.decrStackSize(llllllllllllIlllllIIIlIlllllIIlI.inventory.currentItem, EntityMooshroom.lIlllIlIIIIIll[0]);
                "".length();
                return EntityMooshroom.lIlllIlIIIIIll[0] != 0;
            }
        }
        if (lIIIIIlIIllIllIl(llllllllllllIlllllIIIlIlllllIllI) && lIIIIIlIIllIlllI(llllllllllllIlllllIIIlIlllllIllI.getItem(), Items.shears) && lIIIIIlIIllIllll(this.getGrowingAge())) {
            this.setDead();
            this.worldObj.spawnParticle(EnumParticleTypes.EXPLOSION_LARGE, this.posX, this.posY + this.height / 2.0f, this.posZ, 0.0, 0.0, 0.0, new int[EntityMooshroom.lIlllIlIIIIIll[1]]);
            if (lIIIIIlIIlllIIll(this.worldObj.isRemote ? 1 : 0)) {
                final EntityCow llllllllllllIlllllIIIlIlllllIlIl = new EntityCow(this.worldObj);
                llllllllllllIlllllIIIlIlllllIlIl.setLocationAndAngles(this.posX, this.posY, this.posZ, this.rotationYaw, this.rotationPitch);
                llllllllllllIlllllIIIlIlllllIlIl.setHealth(this.getHealth());
                llllllllllllIlllllIIIlIlllllIlIl.renderYawOffset = this.renderYawOffset;
                if (lIIIIIlIIlllIIlI(this.hasCustomName() ? 1 : 0)) {
                    llllllllllllIlllllIIIlIlllllIlIl.setCustomNameTag(this.getCustomNameTag());
                }
                this.worldObj.spawnEntityInWorld(llllllllllllIlllllIIIlIlllllIlIl);
                "".length();
                int llllllllllllIlllllIIIlIlllllIlII = EntityMooshroom.lIlllIlIIIIIll[1];
                "".length();
                if (-"  ".length() > 0) {
                    return ((0x6F ^ 0x73) & ~(0x1C ^ 0x0)) != 0x0;
                }
                while (!lIIIIIlIIlllIlII(llllllllllllIlllllIIIlIlllllIlII, EntityMooshroom.lIlllIlIIIIIll[2])) {
                    this.worldObj.spawnEntityInWorld(new EntityItem(this.worldObj, this.posX, this.posY + this.height, this.posZ, new ItemStack(Blocks.red_mushroom)));
                    "".length();
                    ++llllllllllllIlllllIIIlIlllllIlII;
                }
                llllllllllllIlllllIIIlIlllllIllI.damageItem(EntityMooshroom.lIlllIlIIIIIll[0], llllllllllllIlllllIIIlIlllllIIlI);
                this.playSound(EntityMooshroom.lIlllIIlllllll[EntityMooshroom.lIlllIlIIIIIll[1]], 1.0f, 1.0f);
            }
            return EntityMooshroom.lIlllIlIIIIIll[0] != 0;
        }
        return super.interact(llllllllllllIlllllIIIlIlllllIIlI);
    }
    
    private static boolean lIIIIIlIIllIllIl(final Object llllllllllllIlllllIIIlIlllIIllII) {
        return llllllllllllIlllllIIIlIlllIIllII != null;
    }
    
    private static void lIIIIIlIIllIllII() {
        (lIlllIlIIIIIll = new int[5])[0] = " ".length();
        EntityMooshroom.lIlllIlIIIIIll[1] = ((0x60 ^ 0x38) & ~(0x21 ^ 0x79));
        EntityMooshroom.lIlllIlIIIIIll[2] = (79 + 66 - 55 + 56 ^ 64 + 26 + 24 + 37);
        EntityMooshroom.lIlllIlIIIIIll[3] = (0x6D ^ 0x65);
        EntityMooshroom.lIlllIlIIIIIll[4] = "  ".length();
    }
    
    @Override
    public EntityMooshroom createChild(final EntityAgeable llllllllllllIlllllIIIlIllllIllII) {
        return new EntityMooshroom(this.worldObj);
    }
    
    static {
        lIIIIIlIIllIllII();
        lIIIIIlIIllIIlll();
    }
    
    private static String lIIIIIlIIllIIllI(final String llllllllllllIlllllIIIlIlllIllIIl, final String llllllllllllIlllllIIIlIlllIllIlI) {
        try {
            final SecretKeySpec llllllllllllIlllllIIIlIlllIllllI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIlllllIIIlIlllIllIlI.getBytes(StandardCharsets.UTF_8)), EntityMooshroom.lIlllIlIIIIIll[3]), "DES");
            final Cipher llllllllllllIlllllIIIlIlllIlllIl = Cipher.getInstance("DES");
            llllllllllllIlllllIIIlIlllIlllIl.init(EntityMooshroom.lIlllIlIIIIIll[4], llllllllllllIlllllIIIlIlllIllllI);
            return new String(llllllllllllIlllllIIIlIlllIlllIl.doFinal(Base64.getDecoder().decode(llllllllllllIlllllIIIlIlllIllIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIlllllIIIlIlllIlllII) {
            llllllllllllIlllllIIIlIlllIlllII.printStackTrace();
            return null;
        }
    }
    
    private static boolean lIIIIIlIIllIllll(final int llllllllllllIlllllIIIlIlllIIIIlI) {
        return llllllllllllIlllllIIIlIlllIIIIlI >= 0;
    }
    
    private static void lIIIIIlIIllIIlll() {
        (lIlllIIlllllll = new String[EntityMooshroom.lIlllIlIIIIIll[0]])[EntityMooshroom.lIlllIlIIIIIll[1]] = lIIIIIlIIllIIllI("T+EvOhKGuswHI88po2632Q==", "hUBOj");
    }
    
    private static boolean lIIIIIlIIlllIIll(final int llllllllllllIlllllIIIlIlllIIIlII) {
        return llllllllllllIlllllIIIlIlllIIIlII == 0;
    }
}
