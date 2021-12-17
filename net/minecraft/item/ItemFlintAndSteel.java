// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.item;

import net.minecraft.util.Vec3i;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.init.Blocks;
import net.minecraft.block.material.Material;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.BlockPos;
import net.minecraft.world.World;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.creativetab.CreativeTabs;

public class ItemFlintAndSteel extends Item
{
    private static final /* synthetic */ String[] llIllIllIIIIII;
    private static final /* synthetic */ int[] llIllIllIIIIIl;
    
    static {
        lIIllIIIIIlIlIIl();
        lIIllIIIIIlIlIII();
    }
    
    public ItemFlintAndSteel() {
        this.maxStackSize = ItemFlintAndSteel.llIllIllIIIIIl[0];
        this.setMaxDamage(ItemFlintAndSteel.llIllIllIIIIIl[1]);
        "".length();
        this.setCreativeTab(CreativeTabs.tabTools);
        "".length();
    }
    
    @Override
    public boolean onItemUse(final ItemStack llllllllllllIllIIllIIllIIllIIllI, final EntityPlayer llllllllllllIllIIllIIllIIlIlllIl, final World llllllllllllIllIIllIIllIIllIIlII, BlockPos llllllllllllIllIIllIIllIIlIllIll, final EnumFacing llllllllllllIllIIllIIllIIllIIIlI, final float llllllllllllIllIIllIIllIIllIIIIl, final float llllllllllllIllIIllIIllIIllIIIII, final float llllllllllllIllIIllIIllIIlIlllll) {
        llllllllllllIllIIllIIllIIlIllIll = (short)((BlockPos)llllllllllllIllIIllIIllIIlIllIll).offset(llllllllllllIllIIllIIllIIllIIIlI);
        if (lIIllIIIIIlIlIlI(llllllllllllIllIIllIIllIIlIlllIl.canPlayerEdit((BlockPos)llllllllllllIllIIllIIllIIlIllIll, llllllllllllIllIIllIIllIIllIIIlI, llllllllllllIllIIllIIllIIllIIllI) ? 1 : 0)) {
            return ItemFlintAndSteel.llIllIllIIIIIl[2] != 0;
        }
        if (lIIllIIIIIlIlIll(llllllllllllIllIIllIIllIIllIIlII.getBlockState((BlockPos)llllllllllllIllIIllIIllIIlIllIll).getBlock().getMaterial(), Material.air)) {
            llllllllllllIllIIllIIllIIllIIlII.playSoundEffect(((Vec3i)llllllllllllIllIIllIIllIIlIllIll).getX() + 0.5, ((Vec3i)llllllllllllIllIIllIIllIIlIllIll).getY() + 0.5, ((Vec3i)llllllllllllIllIIllIIllIIlIllIll).getZ() + 0.5, ItemFlintAndSteel.llIllIllIIIIII[ItemFlintAndSteel.llIllIllIIIIIl[2]], 1.0f, ItemFlintAndSteel.itemRand.nextFloat() * 0.4f + 0.8f);
            llllllllllllIllIIllIIllIIllIIlII.setBlockState((BlockPos)llllllllllllIllIIllIIllIIlIllIll, Blocks.fire.getDefaultState());
            "".length();
        }
        llllllllllllIllIIllIIllIIllIIllI.damageItem(ItemFlintAndSteel.llIllIllIIIIIl[0], llllllllllllIllIIllIIllIIlIlllIl);
        return ItemFlintAndSteel.llIllIllIIIIIl[0] != 0;
    }
    
    private static boolean lIIllIIIIIlIlIlI(final int llllllllllllIllIIllIIllIIIlllIII) {
        return llllllllllllIllIIllIIllIIIlllIII == 0;
    }
    
    private static void lIIllIIIIIlIlIIl() {
        (llIllIllIIIIIl = new int[3])[0] = " ".length();
        ItemFlintAndSteel.llIllIllIIIIIl[1] = (0xCC ^ 0x9F ^ (0xB0 ^ 0xA3));
        ItemFlintAndSteel.llIllIllIIIIIl[2] = ((0x11 ^ 0x59) & ~(0x7A ^ 0x32));
    }
    
    private static boolean lIIllIIIIIlIlIll(final Object llllllllllllIllIIllIIllIIIlllIll, final Object llllllllllllIllIIllIIllIIIlllIlI) {
        return llllllllllllIllIIllIIllIIIlllIll == llllllllllllIllIIllIIllIIIlllIlI;
    }
    
    private static void lIIllIIIIIlIlIII() {
        (llIllIllIIIIII = new String[ItemFlintAndSteel.llIllIllIIIIIl[0]])[ItemFlintAndSteel.llIllIllIIIIIl[2]] = lIIllIIIIIlIIlll("LQYECXgiCBgFIi4=", "KovlV");
    }
    
    private static boolean lIIllIIIIIlIllII(final int llllllllllllIllIIllIIllIIIllllll, final int llllllllllllIllIIllIIllIIIlllllI) {
        return llllllllllllIllIIllIIllIIIllllll < llllllllllllIllIIllIIllIIIlllllI;
    }
    
    private static String lIIllIIIIIlIIlll(String llllllllllllIllIIllIIllIIlIIlIlI, final String llllllllllllIllIIllIIllIIlIIlIIl) {
        llllllllllllIllIIllIIllIIlIIlIlI = new String(Base64.getDecoder().decode(llllllllllllIllIIllIIllIIlIIlIlI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder llllllllllllIllIIllIIllIIlIIllIl = new StringBuilder();
        final char[] llllllllllllIllIIllIIllIIlIIllII = llllllllllllIllIIllIIllIIlIIlIIl.toCharArray();
        int llllllllllllIllIIllIIllIIlIIlIll = ItemFlintAndSteel.llIllIllIIIIIl[2];
        final double llllllllllllIllIIllIIllIIlIIIlIl = (Object)llllllllllllIllIIllIIllIIlIIlIlI.toCharArray();
        final int llllllllllllIllIIllIIllIIlIIIlII = llllllllllllIllIIllIIllIIlIIIlIl.length;
        String llllllllllllIllIIllIIllIIlIIIIll = (String)ItemFlintAndSteel.llIllIllIIIIIl[2];
        while (lIIllIIIIIlIllII((int)llllllllllllIllIIllIIllIIlIIIIll, llllllllllllIllIIllIIllIIlIIIlII)) {
            final char llllllllllllIllIIllIIllIIlIlIIII = llllllllllllIllIIllIIllIIlIIIlIl[llllllllllllIllIIllIIllIIlIIIIll];
            llllllllllllIllIIllIIllIIlIIllIl.append((char)(llllllllllllIllIIllIIllIIlIlIIII ^ llllllllllllIllIIllIIllIIlIIllII[llllllllllllIllIIllIIllIIlIIlIll % llllllllllllIllIIllIIllIIlIIllII.length]));
            "".length();
            ++llllllllllllIllIIllIIllIIlIIlIll;
            ++llllllllllllIllIIllIIllIIlIIIIll;
            "".length();
            if ("   ".length() <= -" ".length()) {
                return null;
            }
        }
        return String.valueOf(llllllllllllIllIIllIIllIIlIIllIl);
    }
}
