// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.item;

import net.minecraft.stats.StatList;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.projectile.EntityEgg;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import net.minecraft.creativetab.CreativeTabs;

public class ItemEgg extends Item
{
    private static final /* synthetic */ String[] llIlllIlllIlII;
    private static final /* synthetic */ int[] llIlllIlllIlIl;
    
    private static void lIIllIlIIIlIlIlI() {
        (llIlllIlllIlII = new String[ItemEgg.llIlllIlllIlIl[1]])[ItemEgg.llIlllIlllIlIl[2]] = lIIllIlIIIlIlIIl("7u4h4E3hqHgyfrxk8VF35A==", "vyTFq");
    }
    
    public ItemEgg() {
        this.maxStackSize = ItemEgg.llIlllIlllIlIl[0];
        this.setCreativeTab(CreativeTabs.tabMaterials);
        "".length();
    }
    
    static {
        lIIllIlIIIlIlIll();
        lIIllIlIIIlIlIlI();
    }
    
    private static String lIIllIlIIIlIlIIl(final String llllllllllllIllIIlIIIIlIlIllIIII, final String llllllllllllIllIIlIIIIlIlIllIIIl) {
        try {
            final SecretKeySpec llllllllllllIllIIlIIIIlIlIllIlIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIllIIlIIIIlIlIllIIIl.getBytes(StandardCharsets.UTF_8)), ItemEgg.llIlllIlllIlIl[3]), "DES");
            final Cipher llllllllllllIllIIlIIIIlIlIllIlII = Cipher.getInstance("DES");
            llllllllllllIllIIlIIIIlIlIllIlII.init(ItemEgg.llIlllIlllIlIl[4], llllllllllllIllIIlIIIIlIlIllIlIl);
            return new String(llllllllllllIllIIlIIIIlIlIllIlII.doFinal(Base64.getDecoder().decode(llllllllllllIllIIlIIIIlIlIllIIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIllIIlIIIIlIlIllIIll) {
            llllllllllllIllIIlIIIIlIlIllIIll.printStackTrace();
            return null;
        }
    }
    
    @Override
    public ItemStack onItemRightClick(final ItemStack llllllllllllIllIIlIIIIlIlIllllII, final World llllllllllllIllIIlIIIIlIlIlllIll, final EntityPlayer llllllllllllIllIIlIIIIlIlIlllllI) {
        if (lIIllIlIIIlIllII(llllllllllllIllIIlIIIIlIlIlllllI.capabilities.isCreativeMode ? 1 : 0)) {
            llllllllllllIllIIlIIIIlIlIllllII.stackSize -= ItemEgg.llIlllIlllIlIl[1];
        }
        llllllllllllIllIIlIIIIlIlIlllIll.playSoundAtEntity(llllllllllllIllIIlIIIIlIlIlllllI, ItemEgg.llIlllIlllIlII[ItemEgg.llIlllIlllIlIl[2]], 0.5f, 0.4f / (ItemEgg.itemRand.nextFloat() * 0.4f + 0.8f));
        if (lIIllIlIIIlIllII(llllllllllllIllIIlIIIIlIlIlllIll.isRemote ? 1 : 0)) {
            llllllllllllIllIIlIIIIlIlIlllIll.spawnEntityInWorld(new EntityEgg(llllllllllllIllIIlIIIIlIlIlllIll, llllllllllllIllIIlIIIIlIlIlllllI));
            "".length();
        }
        llllllllllllIllIIlIIIIlIlIlllllI.triggerAchievement(StatList.objectUseStats[Item.getIdFromItem(this)]);
        return llllllllllllIllIIlIIIIlIlIllllII;
    }
    
    private static void lIIllIlIIIlIlIll() {
        (llIlllIlllIlIl = new int[5])[0] = (2 + 37 + 49 + 126 ^ 175 + 22 - 2 + 3);
        ItemEgg.llIlllIlllIlIl[1] = " ".length();
        ItemEgg.llIlllIlllIlIl[2] = ((0x5B ^ 0x40) & ~(0x7E ^ 0x65));
        ItemEgg.llIlllIlllIlIl[3] = (0x3E ^ 0x36);
        ItemEgg.llIlllIlllIlIl[4] = "  ".length();
    }
    
    private static boolean lIIllIlIIIlIllII(final int llllllllllllIllIIlIIIIlIlIlIlIll) {
        return llllllllllllIllIIlIIIIlIlIlIlIll == 0;
    }
}
