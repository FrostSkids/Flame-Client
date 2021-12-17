// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.item;

import net.minecraft.creativetab.CreativeTabs;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import net.minecraft.stats.StatList;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.item.EntityEnderPearl;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;

public class ItemEnderPearl extends Item
{
    private static final /* synthetic */ int[] lIIlIlIlIlIIIl;
    private static final /* synthetic */ String[] lIIlIlIlIlIIII;
    
    private static boolean llIlIIIIlIIllII(final int lllllllllllllIIllIIllllllIlIllII) {
        return lllllllllllllIIllIIllllllIlIllII != 0;
    }
    
    static {
        llIlIIIIlIIlIll();
        llIlIIIIlIIlIlI();
    }
    
    @Override
    public ItemStack onItemRightClick(final ItemStack lllllllllllllIIllIIlllllllIlIIII, final World lllllllllllllIIllIIlllllllIIllll, final EntityPlayer lllllllllllllIIllIIlllllllIIlIlI) {
        if (llIlIIIIlIIllII(lllllllllllllIIllIIlllllllIIlIlI.capabilities.isCreativeMode ? 1 : 0)) {
            return lllllllllllllIIllIIlllllllIlIIII;
        }
        lllllllllllllIIllIIlllllllIlIIII.stackSize -= ItemEnderPearl.lIIlIlIlIlIIIl[1];
        lllllllllllllIIllIIlllllllIIllll.playSoundAtEntity(lllllllllllllIIllIIlllllllIIlIlI, ItemEnderPearl.lIIlIlIlIlIIII[ItemEnderPearl.lIIlIlIlIlIIIl[2]], 0.5f, 0.4f / (ItemEnderPearl.itemRand.nextFloat() * 0.4f + 0.8f));
        if (llIlIIIIlIIllIl(lllllllllllllIIllIIlllllllIIllll.isRemote ? 1 : 0)) {
            lllllllllllllIIllIIlllllllIIllll.spawnEntityInWorld(new EntityEnderPearl(lllllllllllllIIllIIlllllllIIllll, lllllllllllllIIllIIlllllllIIlIlI));
            "".length();
        }
        lllllllllllllIIllIIlllllllIIlIlI.triggerAchievement(StatList.objectUseStats[Item.getIdFromItem(this)]);
        return lllllllllllllIIllIIlllllllIlIIII;
    }
    
    private static void llIlIIIIlIIlIlI() {
        (lIIlIlIlIlIIII = new String[ItemEnderPearl.lIIlIlIlIlIIIl[1]])[ItemEnderPearl.lIIlIlIlIlIIIl[2]] = llIlIIIIlIIlIIl("ECIDFSUPbQ8ePQ==", "bCmqJ");
    }
    
    private static boolean llIlIIIIlIIllIl(final int lllllllllllllIIllIIllllllIlIlIlI) {
        return lllllllllllllIIllIIllllllIlIlIlI == 0;
    }
    
    private static boolean llIlIIIIlIIlllI(final int lllllllllllllIIllIIllllllIlIllll, final int lllllllllllllIIllIIllllllIlIlllI) {
        return lllllllllllllIIllIIllllllIlIllll < lllllllllllllIIllIIllllllIlIlllI;
    }
    
    private static String llIlIIIIlIIlIIl(String lllllllllllllIIllIIllllllIlllIlI, final String lllllllllllllIIllIIllllllIlllIIl) {
        lllllllllllllIIllIIllllllIlllIlI = (float)new String(Base64.getDecoder().decode(((String)lllllllllllllIIllIIllllllIlllIlI).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIIllIIllllllIllllIl = new StringBuilder();
        final char[] lllllllllllllIIllIIllllllIllllII = lllllllllllllIIllIIllllllIlllIIl.toCharArray();
        int lllllllllllllIIllIIllllllIlllIll = ItemEnderPearl.lIIlIlIlIlIIIl[2];
        final double lllllllllllllIIllIIllllllIllIlIl = (Object)((String)lllllllllllllIIllIIllllllIlllIlI).toCharArray();
        final Exception lllllllllllllIIllIIllllllIllIlII = (Exception)lllllllllllllIIllIIllllllIllIlIl.length;
        boolean lllllllllllllIIllIIllllllIllIIll = ItemEnderPearl.lIIlIlIlIlIIIl[2] != 0;
        while (llIlIIIIlIIlllI(lllllllllllllIIllIIllllllIllIIll ? 1 : 0, (int)lllllllllllllIIllIIllllllIllIlII)) {
            final char lllllllllllllIIllIIlllllllIIIIII = lllllllllllllIIllIIllllllIllIlIl[lllllllllllllIIllIIllllllIllIIll];
            lllllllllllllIIllIIllllllIllllIl.append((char)(lllllllllllllIIllIIlllllllIIIIII ^ lllllllllllllIIllIIllllllIllllII[lllllllllllllIIllIIllllllIlllIll % lllllllllllllIIllIIllllllIllllII.length]));
            "".length();
            ++lllllllllllllIIllIIllllllIlllIll;
            ++lllllllllllllIIllIIllllllIllIIll;
            "".length();
            if (((0x26 ^ 0x7E) & ~(0x6 ^ 0x5E)) != 0x0) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIIllIIllllllIllllIl);
    }
    
    public ItemEnderPearl() {
        this.maxStackSize = ItemEnderPearl.lIIlIlIlIlIIIl[0];
        this.setCreativeTab(CreativeTabs.tabMisc);
        "".length();
    }
    
    private static void llIlIIIIlIIlIll() {
        (lIIlIlIlIlIIIl = new int[3])[0] = (0x6F ^ 0x7F);
        ItemEnderPearl.lIIlIlIlIlIIIl[1] = " ".length();
        ItemEnderPearl.lIIlIlIlIlIIIl[2] = ((37 + 94 - 55 + 75 ^ 99 + 92 - 17 + 11) & (0x39 ^ 0x7C ^ (0xEB ^ 0x80) ^ -" ".length()));
    }
}
