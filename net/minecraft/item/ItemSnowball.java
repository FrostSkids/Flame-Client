// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.item;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.stats.StatList;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.projectile.EntitySnowball;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;
import java.nio.charset.StandardCharsets;
import java.util.Base64;

public class ItemSnowball extends Item
{
    private static final /* synthetic */ String[] lllIlIIIlllIIl;
    private static final /* synthetic */ int[] lllIlIIIlllIlI;
    
    private static String lIlIIIIllllIIIlI(String llllllllllllIlIlllIIIllIllIlIIll, final String llllllllllllIlIlllIIIllIllIlIIlI) {
        llllllllllllIlIlllIIIllIllIlIIll = (double)new String(Base64.getDecoder().decode(((String)llllllllllllIlIlllIIIllIllIlIIll).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder llllllllllllIlIlllIIIllIllIlIllI = new StringBuilder();
        final char[] llllllllllllIlIlllIIIllIllIlIlIl = llllllllllllIlIlllIIIllIllIlIIlI.toCharArray();
        int llllllllllllIlIlllIIIllIllIlIlII = ItemSnowball.lllIlIIIlllIlI[2];
        final byte llllllllllllIlIlllIIIllIllIIlllI = (Object)((String)llllllllllllIlIlllIIIllIllIlIIll).toCharArray();
        final boolean llllllllllllIlIlllIIIllIllIIllIl = llllllllllllIlIlllIIIllIllIIlllI.length != 0;
        int llllllllllllIlIlllIIIllIllIIllII = ItemSnowball.lllIlIIIlllIlI[2];
        while (lIlIIIIllllIIllI(llllllllllllIlIlllIIIllIllIIllII, llllllllllllIlIlllIIIllIllIIllIl ? 1 : 0)) {
            final char llllllllllllIlIlllIIIllIllIllIIl = llllllllllllIlIlllIIIllIllIIlllI[llllllllllllIlIlllIIIllIllIIllII];
            llllllllllllIlIlllIIIllIllIlIllI.append((char)(llllllllllllIlIlllIIIllIllIllIIl ^ llllllllllllIlIlllIIIllIllIlIlIl[llllllllllllIlIlllIIIllIllIlIlII % llllllllllllIlIlllIIIllIllIlIlIl.length]));
            "".length();
            ++llllllllllllIlIlllIIIllIllIlIlII;
            ++llllllllllllIlIlllIIIllIllIIllII;
            "".length();
            if (-(0xD ^ 0x9) > 0) {
                return null;
            }
        }
        return String.valueOf(llllllllllllIlIlllIIIllIllIlIllI);
    }
    
    private static boolean lIlIIIIllllIIlIl(final int llllllllllllIlIlllIIIllIllIIIlIl) {
        return llllllllllllIlIlllIIIllIllIIIlIl == 0;
    }
    
    static {
        lIlIIIIllllIIlII();
        lIlIIIIllllIIIll();
    }
    
    private static boolean lIlIIIIllllIIllI(final int llllllllllllIlIlllIIIllIllIIlIII, final int llllllllllllIlIlllIIIllIllIIIlll) {
        return llllllllllllIlIlllIIIllIllIIlIII < llllllllllllIlIlllIIIllIllIIIlll;
    }
    
    private static void lIlIIIIllllIIIll() {
        (lllIlIIIlllIIl = new String[ItemSnowball.lllIlIIIlllIlI[1]])[ItemSnowball.lllIlIIIlllIlI[2]] = lIlIIIIllllIIIlI("MzIhEy4sfS0YNg==", "ASOwA");
    }
    
    @Override
    public ItemStack onItemRightClick(final ItemStack llllllllllllIlIlllIIIllIlllIlIIl, final World llllllllllllIlIlllIIIllIlllIlIII, final EntityPlayer llllllllllllIlIlllIIIllIlllIIIll) {
        if (lIlIIIIllllIIlIl(llllllllllllIlIlllIIIllIlllIIIll.capabilities.isCreativeMode ? 1 : 0)) {
            llllllllllllIlIlllIIIllIlllIlIIl.stackSize -= ItemSnowball.lllIlIIIlllIlI[1];
        }
        llllllllllllIlIlllIIIllIlllIlIII.playSoundAtEntity(llllllllllllIlIlllIIIllIlllIIIll, ItemSnowball.lllIlIIIlllIIl[ItemSnowball.lllIlIIIlllIlI[2]], 0.5f, 0.4f / (ItemSnowball.itemRand.nextFloat() * 0.4f + 0.8f));
        if (lIlIIIIllllIIlIl(llllllllllllIlIlllIIIllIlllIlIII.isRemote ? 1 : 0)) {
            llllllllllllIlIlllIIIllIlllIlIII.spawnEntityInWorld(new EntitySnowball(llllllllllllIlIlllIIIllIlllIlIII, llllllllllllIlIlllIIIllIlllIIIll));
            "".length();
        }
        llllllllllllIlIlllIIIllIlllIIIll.triggerAchievement(StatList.objectUseStats[Item.getIdFromItem(this)]);
        return llllllllllllIlIlllIIIllIlllIlIIl;
    }
    
    private static void lIlIIIIllllIIlII() {
        (lllIlIIIlllIlI = new int[3])[0] = (0x4E ^ 0x5E);
        ItemSnowball.lllIlIIIlllIlI[1] = " ".length();
        ItemSnowball.lllIlIIIlllIlI[2] = ((0x6C ^ 0x35 ^ (0x13 ^ 0x2B)) & (237 + 109 - 180 + 79 ^ 121 + 69 - 184 + 142 ^ -" ".length()));
    }
    
    public ItemSnowball() {
        this.maxStackSize = ItemSnowball.lllIlIIIlllIlI[0];
        this.setCreativeTab(CreativeTabs.tabMisc);
        "".length();
    }
}
