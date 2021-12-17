// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.item;

import java.nio.charset.StandardCharsets;
import java.util.Base64;
import net.minecraft.entity.Entity;
import net.minecraft.entity.passive.EntityPig;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.EntityLivingBase;

public class ItemSaddle extends Item
{
    private static final /* synthetic */ String[] lIIIIIlIllllIl;
    private static final /* synthetic */ int[] lIIIIIlIlllllI;
    
    @Override
    public boolean hitEntity(final ItemStack lllllllllllllIlIIlllIIlIIlllIlII, final EntityLivingBase lllllllllllllIlIIlllIIlIIlllIIll, final EntityLivingBase lllllllllllllIlIIlllIIlIIlllIllI) {
        this.itemInteractionForEntity(lllllllllllllIlIIlllIIlIIlllIlII, null, lllllllllllllIlIIlllIIlIIlllIIll);
        "".length();
        return ItemSaddle.lIIIIIlIlllllI[0] != 0;
    }
    
    public ItemSaddle() {
        this.maxStackSize = ItemSaddle.lIIIIIlIlllllI[0];
        this.setCreativeTab(CreativeTabs.tabTransport);
        "".length();
    }
    
    private static void lIllIllIlIlIIII() {
        (lIIIIIlIlllllI = new int[2])[0] = " ".length();
        ItemSaddle.lIIIIIlIlllllI[1] = ((0x85 ^ 0x9F ^ (0x3A ^ 0x72)) & (0x91 ^ 0x88 ^ (0x7D ^ 0x36) ^ -" ".length()));
    }
    
    private static void lIllIllIlIIllll() {
        (lIIIIIlIllllIl = new String[ItemSaddle.lIIIIIlIlllllI[0]])[ItemSaddle.lIIIIIlIlllllI[1]] = lIllIllIlIIlllI("Ahc4fR8ACik2WQMdOycfCgo=", "oxZSw");
    }
    
    @Override
    public boolean itemInteractionForEntity(final ItemStack lllllllllllllIlIIlllIIlIlIIIIIll, final EntityPlayer lllllllllllllIlIIlllIIlIlIIIIIlI, final EntityLivingBase lllllllllllllIlIIlllIIlIIllllllI) {
        if (lIllIllIlIlIIIl((lllllllllllllIlIIlllIIlIIllllllI instanceof EntityPig) ? 1 : 0)) {
            final EntityPig lllllllllllllIlIIlllIIlIlIIIIIII = (EntityPig)lllllllllllllIlIIlllIIlIIllllllI;
            if (lIllIllIlIlIIlI(lllllllllllllIlIIlllIIlIlIIIIIII.getSaddled() ? 1 : 0) && lIllIllIlIlIIlI(lllllllllllllIlIIlllIIlIlIIIIIII.isChild() ? 1 : 0)) {
                lllllllllllllIlIIlllIIlIlIIIIIII.setSaddled((boolean)(ItemSaddle.lIIIIIlIlllllI[0] != 0));
                lllllllllllllIlIIlllIIlIlIIIIIII.worldObj.playSoundAtEntity(lllllllllllllIlIIlllIIlIlIIIIIII, ItemSaddle.lIIIIIlIllllIl[ItemSaddle.lIIIIIlIlllllI[1]], 0.5f, 1.0f);
                lllllllllllllIlIIlllIIlIlIIIIIll.stackSize -= ItemSaddle.lIIIIIlIlllllI[0];
            }
            return ItemSaddle.lIIIIIlIlllllI[0] != 0;
        }
        return ItemSaddle.lIIIIIlIlllllI[1] != 0;
    }
    
    private static boolean lIllIllIlIlIIIl(final int lllllllllllllIlIIlllIIlIIlIlIlIl) {
        return lllllllllllllIlIIlllIIlIIlIlIlIl != 0;
    }
    
    private static String lIllIllIlIIlllI(String lllllllllllllIlIIlllIIlIIllIIIll, final String lllllllllllllIlIIlllIIlIIllIIIlI) {
        lllllllllllllIlIIlllIIlIIllIIIll = (long)new String(Base64.getDecoder().decode(((String)lllllllllllllIlIIlllIIlIIllIIIll).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIlIIlllIIlIIllIIllI = new StringBuilder();
        final char[] lllllllllllllIlIIlllIIlIIllIIlIl = lllllllllllllIlIIlllIIlIIllIIIlI.toCharArray();
        int lllllllllllllIlIIlllIIlIIllIIlII = ItemSaddle.lIIIIIlIlllllI[1];
        final float lllllllllllllIlIIlllIIlIIlIllllI = (Object)((String)lllllllllllllIlIIlllIIlIIllIIIll).toCharArray();
        final char lllllllllllllIlIIlllIIlIIlIlllIl = (char)lllllllllllllIlIIlllIIlIIlIllllI.length;
        int lllllllllllllIlIIlllIIlIIlIlllII = ItemSaddle.lIIIIIlIlllllI[1];
        while (lIllIllIlIlIIll(lllllllllllllIlIIlllIIlIIlIlllII, lllllllllllllIlIIlllIIlIIlIlllIl)) {
            final char lllllllllllllIlIIlllIIlIIllIlIIl = lllllllllllllIlIIlllIIlIIlIllllI[lllllllllllllIlIIlllIIlIIlIlllII];
            lllllllllllllIlIIlllIIlIIllIIllI.append((char)(lllllllllllllIlIIlllIIlIIllIlIIl ^ lllllllllllllIlIIlllIIlIIllIIlIl[lllllllllllllIlIIlllIIlIIllIIlII % lllllllllllllIlIIlllIIlIIllIIlIl.length]));
            "".length();
            ++lllllllllllllIlIIlllIIlIIllIIlII;
            ++lllllllllllllIlIIlllIIlIIlIlllII;
            "".length();
            if (null != null) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIlIIlllIIlIIllIIllI);
    }
    
    private static boolean lIllIllIlIlIIll(final int lllllllllllllIlIIlllIIlIIlIllIII, final int lllllllllllllIlIIlllIIlIIlIlIlll) {
        return lllllllllllllIlIIlllIIlIIlIllIII < lllllllllllllIlIIlllIIlIIlIlIlll;
    }
    
    static {
        lIllIllIlIlIIII();
        lIllIllIlIIllll();
    }
    
    private static boolean lIllIllIlIlIIlI(final int lllllllllllllIlIIlllIIlIIlIlIIll) {
        return lllllllllllllIlIIlllIIlIIlIlIIll == 0;
    }
}
