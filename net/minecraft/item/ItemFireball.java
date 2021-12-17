// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.item;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.block.material.Material;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.BlockPos;
import net.minecraft.world.World;
import net.minecraft.entity.player.EntityPlayer;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;

public class ItemFireball extends Item
{
    private static final /* synthetic */ int[] lllIllIIIIlIIl;
    private static final /* synthetic */ String[] lllIllIIIIlIII;
    
    private static void lIlIIIlllllIlIIl() {
        (lllIllIIIIlIII = new String[ItemFireball.lllIllIIIIlIIl[0]])[ItemFireball.lllIllIIIIlIIl[1]] = lIlIIIlllllIlIII("Sgqdartpi5iU5pJAx4DtsgrtfeQeCHxG", "NojUQ");
    }
    
    private static String lIlIIIlllllIlIII(final String llllllllllllIlIllIIlllllllIlIIlI, final String llllllllllllIlIllIIlllllllIlIIIl) {
        try {
            final SecretKeySpec llllllllllllIlIllIIlllllllIlIlll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIlIllIIlllllllIlIIIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher llllllllllllIlIllIIlllllllIlIllI = Cipher.getInstance("Blowfish");
            llllllllllllIlIllIIlllllllIlIllI.init(ItemFireball.lllIllIIIIlIIl[2], llllllllllllIlIllIIlllllllIlIlll);
            return new String(llllllllllllIlIllIIlllllllIlIllI.doFinal(Base64.getDecoder().decode(llllllllllllIlIllIIlllllllIlIIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIlIllIIlllllllIlIlIl) {
            llllllllllllIlIllIIlllllllIlIlIl.printStackTrace();
            return null;
        }
    }
    
    private static void lIlIIIlllllIlIlI() {
        (lllIllIIIIlIIl = new int[3])[0] = " ".length();
        ItemFireball.lllIllIIIIlIIl[1] = ((0xF4 ^ 0xA5) & ~(0x48 ^ 0x19));
        ItemFireball.lllIllIIIIlIIl[2] = "  ".length();
    }
    
    static {
        lIlIIIlllllIlIlI();
        lIlIIIlllllIlIIl();
    }
    
    private static boolean lIlIIIlllllIllIl(final Object llllllllllllIlIllIIlllllllIIllII, final Object llllllllllllIlIllIIlllllllIIlIll) {
        return llllllllllllIlIllIIlllllllIIllII == llllllllllllIlIllIIlllllllIIlIll;
    }
    
    @Override
    public boolean onItemUse(final ItemStack llllllllllllIlIllIIllllllllIlIII, final EntityPlayer llllllllllllIlIllIIllllllllIIlll, final World llllllllllllIlIllIIllllllllIIllI, BlockPos llllllllllllIlIllIIlllllllIlllIl, final EnumFacing llllllllllllIlIllIIllllllllIIlII, final float llllllllllllIlIllIIllllllllIIIll, final float llllllllllllIlIllIIllllllllIIIlI, final float llllllllllllIlIllIIllllllllIIIIl) {
        if (lIlIIIlllllIlIll(llllllllllllIlIllIIllllllllIIllI.isRemote ? 1 : 0)) {
            return ItemFireball.lllIllIIIIlIIl[0] != 0;
        }
        llllllllllllIlIllIIlllllllIlllIl = llllllllllllIlIllIIlllllllIlllIl.offset(llllllllllllIlIllIIllllllllIIlII);
        if (lIlIIIlllllIllII(llllllllllllIlIllIIllllllllIIlll.canPlayerEdit(llllllllllllIlIllIIlllllllIlllIl, llllllllllllIlIllIIllllllllIIlII, llllllllllllIlIllIIllllllllIlIII) ? 1 : 0)) {
            return ItemFireball.lllIllIIIIlIIl[1] != 0;
        }
        if (lIlIIIlllllIllIl(llllllllllllIlIllIIllllllllIIllI.getBlockState(llllllllllllIlIllIIlllllllIlllIl).getBlock().getMaterial(), Material.air)) {
            llllllllllllIlIllIIllllllllIIllI.playSoundEffect(llllllllllllIlIllIIlllllllIlllIl.getX() + 0.5, llllllllllllIlIllIIlllllllIlllIl.getY() + 0.5, llllllllllllIlIllIIlllllllIlllIl.getZ() + 0.5, ItemFireball.lllIllIIIIlIII[ItemFireball.lllIllIIIIlIIl[1]], 1.0f, (ItemFireball.itemRand.nextFloat() - ItemFireball.itemRand.nextFloat()) * 0.2f + 1.0f);
            llllllllllllIlIllIIllllllllIIllI.setBlockState(llllllllllllIlIllIIlllllllIlllIl, Blocks.fire.getDefaultState());
            "".length();
        }
        if (lIlIIIlllllIllII(llllllllllllIlIllIIllllllllIIlll.capabilities.isCreativeMode ? 1 : 0)) {
            llllllllllllIlIllIIllllllllIlIII.stackSize -= ItemFireball.lllIllIIIIlIIl[0];
        }
        return ItemFireball.lllIllIIIIlIIl[0] != 0;
    }
    
    private static boolean lIlIIIlllllIllII(final int llllllllllllIlIllIIlllllllIIIlll) {
        return llllllllllllIlIllIIlllllllIIIlll == 0;
    }
    
    public ItemFireball() {
        this.setCreativeTab(CreativeTabs.tabMisc);
        "".length();
    }
    
    private static boolean lIlIIIlllllIlIll(final int llllllllllllIlIllIIlllllllIIlIIl) {
        return llllllllllllIlIllIIlllllllIIlIIl != 0;
    }
}
