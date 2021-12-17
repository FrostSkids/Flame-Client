// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.item;

import java.nio.charset.StandardCharsets;
import java.util.Base64;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.stats.StatList;
import net.minecraft.world.WorldSavedData;
import net.minecraft.world.storage.MapData;
import net.minecraft.init.Items;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;

public class ItemEmptyMap extends ItemMapBase
{
    private static final /* synthetic */ int[] lIIIlllllIllIl;
    private static final /* synthetic */ String[] lIIIlllllIllII;
    
    @Override
    public ItemStack onItemRightClick(final ItemStack lllllllllllllIIllllIIIlIlIIllIII, final World lllllllllllllIIllllIIIlIlIIlIIII, final EntityPlayer lllllllllllllIIllllIIIlIlIIlIllI) {
        final ItemStack lllllllllllllIIllllIIIlIlIIlIlIl = new ItemStack(Items.filled_map, ItemEmptyMap.lIIIlllllIllIl[0], lllllllllllllIIllllIIIlIlIIlIIII.getUniqueDataId(ItemEmptyMap.lIIIlllllIllII[ItemEmptyMap.lIIIlllllIllIl[1]]));
        final String lllllllllllllIIllllIIIlIlIIlIlII = String.valueOf(new StringBuilder(ItemEmptyMap.lIIIlllllIllII[ItemEmptyMap.lIIIlllllIllIl[0]]).append(lllllllllllllIIllllIIIlIlIIlIlIl.getMetadata()));
        final MapData lllllllllllllIIllllIIIlIlIIlIIll = new MapData(lllllllllllllIIllllIIIlIlIIlIlII);
        lllllllllllllIIllllIIIlIlIIlIIII.setItemData(lllllllllllllIIllllIIIlIlIIlIlII, lllllllllllllIIllllIIIlIlIIlIIll);
        lllllllllllllIIllllIIIlIlIIlIIll.scale = (byte)ItemEmptyMap.lIIIlllllIllIl[1];
        lllllllllllllIIllllIIIlIlIIlIIll.calculateMapCenter(lllllllllllllIIllllIIIlIlIIlIllI.posX, lllllllllllllIIllllIIIlIlIIlIllI.posZ, lllllllllllllIIllllIIIlIlIIlIIll.scale);
        lllllllllllllIIllllIIIlIlIIlIIll.dimension = (byte)lllllllllllllIIllllIIIlIlIIlIIII.provider.getDimensionId();
        lllllllllllllIIllllIIIlIlIIlIIll.markDirty();
        lllllllllllllIIllllIIIlIlIIllIII.stackSize -= ItemEmptyMap.lIIIlllllIllIl[0];
        if (llIIlIIIlIIIIll(lllllllllllllIIllllIIIlIlIIllIII.stackSize)) {
            return lllllllllllllIIllllIIIlIlIIlIlIl;
        }
        if (llIIlIIIlIIIlII(lllllllllllllIIllllIIIlIlIIlIllI.inventory.addItemStackToInventory(lllllllllllllIIllllIIIlIlIIlIlIl.copy()) ? 1 : 0)) {
            lllllllllllllIIllllIIIlIlIIlIllI.dropPlayerItemWithRandomChoice(lllllllllllllIIllllIIIlIlIIlIlIl, (boolean)(ItemEmptyMap.lIIIlllllIllIl[1] != 0));
            "".length();
        }
        lllllllllllllIIllllIIIlIlIIlIllI.triggerAchievement(StatList.objectUseStats[Item.getIdFromItem(this)]);
        return lllllllllllllIIllllIIIlIlIIllIII;
    }
    
    private static boolean llIIlIIIlIIIlIl(final int lllllllllllllIIllllIIIlIIlllIIIl, final int lllllllllllllIIllllIIIlIIlllIIII) {
        return lllllllllllllIIllllIIIlIIlllIIIl < lllllllllllllIIllllIIIlIIlllIIII;
    }
    
    static {
        llIIlIIIlIIIIlI();
        llIIlIIIlIIIIII();
    }
    
    private static boolean llIIlIIIlIIIlII(final int lllllllllllllIIllllIIIlIIllIlllI) {
        return lllllllllllllIIllllIIIlIIllIlllI == 0;
    }
    
    protected ItemEmptyMap() {
        this.setCreativeTab(CreativeTabs.tabMisc);
        "".length();
    }
    
    private static void llIIlIIIlIIIIlI() {
        (lIIIlllllIllIl = new int[3])[0] = " ".length();
        ItemEmptyMap.lIIIlllllIllIl[1] = ((0x75 ^ 0xC ^ (0x37 ^ 0x1B)) & (0x7B ^ 0x2B ^ (0xA7 ^ 0xA2) ^ -" ".length()));
        ItemEmptyMap.lIIIlllllIllIl[2] = "  ".length();
    }
    
    private static boolean llIIlIIIlIIIIll(final int lllllllllllllIIllllIIIlIIllIllII) {
        return lllllllllllllIIllllIIIlIIllIllII <= 0;
    }
    
    private static String llIIlIIIIllllll(String lllllllllllllIIllllIIIlIIlllllII, final String lllllllllllllIIllllIIIlIlIIIIIII) {
        lllllllllllllIIllllIIIlIIlllllII = (boolean)new String(Base64.getDecoder().decode(((String)lllllllllllllIIllllIIIlIIlllllII).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIIllllIIIlIIlllllll = new StringBuilder();
        final char[] lllllllllllllIIllllIIIlIIllllllI = lllllllllllllIIllllIIIlIlIIIIIII.toCharArray();
        int lllllllllllllIIllllIIIlIIlllllIl = ItemEmptyMap.lIIIlllllIllIl[1];
        final float lllllllllllllIIllllIIIlIIlllIlll = (Object)((String)lllllllllllllIIllllIIIlIIlllllII).toCharArray();
        final Exception lllllllllllllIIllllIIIlIIlllIllI = (Exception)lllllllllllllIIllllIIIlIIlllIlll.length;
        byte lllllllllllllIIllllIIIlIIlllIlIl = (byte)ItemEmptyMap.lIIIlllllIllIl[1];
        while (llIIlIIIlIIIlIl(lllllllllllllIIllllIIIlIIlllIlIl, (int)lllllllllllllIIllllIIIlIIlllIllI)) {
            final char lllllllllllllIIllllIIIlIlIIIIIlI = lllllllllllllIIllllIIIlIIlllIlll[lllllllllllllIIllllIIIlIIlllIlIl];
            lllllllllllllIIllllIIIlIIlllllll.append((char)(lllllllllllllIIllllIIIlIlIIIIIlI ^ lllllllllllllIIllllIIIlIIllllllI[lllllllllllllIIllllIIIlIIlllllIl % lllllllllllllIIllllIIIlIIllllllI.length]));
            "".length();
            ++lllllllllllllIIllllIIIlIIlllllIl;
            ++lllllllllllllIIllllIIIlIIlllIlIl;
            "".length();
            if ("   ".length() < 0) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIIllllIIIlIIlllllll);
    }
    
    private static void llIIlIIIlIIIIII() {
        (lIIIlllllIllII = new String[ItemEmptyMap.lIIIlllllIllIl[2]])[ItemEmptyMap.lIIIlllllIllIl[1]] = llIIlIIIIllllll("FCk4", "yHHzd");
        ItemEmptyMap.lIIIlllllIllII[ItemEmptyMap.lIIIlllllIllIl[0]] = llIIlIIIIllllll("KycROA==", "FFagK");
    }
}
