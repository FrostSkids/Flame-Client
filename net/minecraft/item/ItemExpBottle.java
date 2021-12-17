// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.item;

import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.stats.StatList;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.item.EntityExpBottle;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;

public class ItemExpBottle extends Item
{
    private static final /* synthetic */ int[] lIllIlIIllIIlI;
    private static final /* synthetic */ String[] lIllIlIIllIIIl;
    
    @Override
    public ItemStack onItemRightClick(final ItemStack lllllllllllllIIIIIIIIIllIIIIllIl, final World lllllllllllllIIIIIIIIIllIIIlIIII, final EntityPlayer lllllllllllllIIIIIIIIIllIIIIlIll) {
        if (llllllIIlllIIII(lllllllllllllIIIIIIIIIllIIIIlIll.capabilities.isCreativeMode ? 1 : 0)) {
            lllllllllllllIIIIIIIIIllIIIIllIl.stackSize -= ItemExpBottle.lIllIlIIllIIlI[0];
        }
        lllllllllllllIIIIIIIIIllIIIlIIII.playSoundAtEntity(lllllllllllllIIIIIIIIIllIIIIlIll, ItemExpBottle.lIllIlIIllIIIl[ItemExpBottle.lIllIlIIllIIlI[1]], 0.5f, 0.4f / (ItemExpBottle.itemRand.nextFloat() * 0.4f + 0.8f));
        if (llllllIIlllIIII(lllllllllllllIIIIIIIIIllIIIlIIII.isRemote ? 1 : 0)) {
            lllllllllllllIIIIIIIIIllIIIlIIII.spawnEntityInWorld(new EntityExpBottle(lllllllllllllIIIIIIIIIllIIIlIIII, lllllllllllllIIIIIIIIIllIIIIlIll));
            "".length();
        }
        lllllllllllllIIIIIIIIIllIIIIlIll.triggerAchievement(StatList.objectUseStats[Item.getIdFromItem(this)]);
        return lllllllllllllIIIIIIIIIllIIIIllIl;
    }
    
    public ItemExpBottle() {
        this.setCreativeTab(CreativeTabs.tabMisc);
        "".length();
    }
    
    private static boolean llllllIIlllIIII(final int lllllllllllllIIIIIIIIIlIllllllII) {
        return lllllllllllllIIIIIIIIIlIllllllII == 0;
    }
    
    private static void llllllIIllIlllI() {
        (lIllIlIIllIIIl = new String[ItemExpBottle.lIllIlIIllIIlI[0]])[ItemExpBottle.lIllIlIIllIIlI[1]] = llllllIIllIllIl("u2WynjyEfEz0tueQBwl0xQ==", "aZRTK");
    }
    
    private static String llllllIIllIllIl(final String lllllllllllllIIIIIIIIIllIIIIIIll, final String lllllllllllllIIIIIIIIIllIIIIIIlI) {
        try {
            final SecretKeySpec lllllllllllllIIIIIIIIIllIIIIIllI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIIIIIIIIIllIIIIIIlI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lllllllllllllIIIIIIIIIllIIIIIlIl = Cipher.getInstance("Blowfish");
            lllllllllllllIIIIIIIIIllIIIIIlIl.init(ItemExpBottle.lIllIlIIllIIlI[2], lllllllllllllIIIIIIIIIllIIIIIllI);
            return new String(lllllllllllllIIIIIIIIIllIIIIIlIl.doFinal(Base64.getDecoder().decode(lllllllllllllIIIIIIIIIllIIIIIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIIIIIIIIllIIIIIlII) {
            lllllllllllllIIIIIIIIIllIIIIIlII.printStackTrace();
            return null;
        }
    }
    
    private static void llllllIIllIllll() {
        (lIllIlIIllIIlI = new int[3])[0] = " ".length();
        ItemExpBottle.lIllIlIIllIIlI[1] = ((0x7 ^ 0x31) & ~(0x2E ^ 0x18));
        ItemExpBottle.lIllIlIIllIIlI[2] = "  ".length();
    }
    
    static {
        llllllIIllIllll();
        llllllIIllIlllI();
    }
    
    @Override
    public boolean hasEffect(final ItemStack lllllllllllllIIIIIIIIIllIIIlIlll) {
        return ItemExpBottle.lIllIlIIllIIlI[0] != 0;
    }
}
