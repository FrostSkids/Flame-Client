// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.block;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.util.EnumWorldBlockLayer;
import net.minecraft.entity.Entity;
import net.minecraft.util.BlockPos;
import net.minecraft.world.World;

public class BlockSlime extends BlockBreakable
{
    private static final /* synthetic */ int[] lIIllIIIIIlIll;
    
    static {
        llIlIlIlIIIlIIl();
    }
    
    private static void llIlIlIlIIIlIIl() {
        (lIIllIIIIIlIll = new int[1])[0] = ((0x48 ^ 0x5E) & ~(0x2E ^ 0x38));
    }
    
    private static boolean llIlIlIlIIIllII(final int lllllllllllllIIlIllllIllIlIIllll) {
        return lllllllllllllIIlIllllIllIlIIllll < 0;
    }
    
    @Override
    public void onFallenUpon(final World lllllllllllllIIlIllllIllIlllIlIl, final BlockPos lllllllllllllIIlIllllIllIlllIlII, final Entity lllllllllllllIIlIllllIllIllIlllI, final float lllllllllllllIIlIllllIllIllIllIl) {
        if (llIlIlIlIIIlIlI(lllllllllllllIIlIllllIllIllIlllI.isSneaking() ? 1 : 0)) {
            super.onFallenUpon(lllllllllllllIIlIllllIllIlllIlIl, lllllllllllllIIlIllllIllIlllIlII, lllllllllllllIIlIllllIllIllIlllI, lllllllllllllIIlIllllIllIllIllIl);
            "".length();
            if (null != null) {
                return;
            }
        }
        else {
            lllllllllllllIIlIllllIllIllIlllI.fall(lllllllllllllIIlIllllIllIllIllIl, 0.0f);
        }
    }
    
    private static boolean llIlIlIlIIIlIlI(final int lllllllllllllIIlIllllIllIlIlIIll) {
        return lllllllllllllIIlIllllIllIlIlIIll != 0;
    }
    
    @Override
    public EnumWorldBlockLayer getBlockLayer() {
        return EnumWorldBlockLayer.TRANSLUCENT;
    }
    
    private static boolean llIlIlIlIIIlllI(final int lllllllllllllIIlIllllIllIlIlIIIl) {
        return lllllllllllllIIlIllllIllIlIlIIIl == 0;
    }
    
    public BlockSlime() {
        super(Material.clay, (boolean)(BlockSlime.lIIllIIIIIlIll[0] != 0), MapColor.grassColor);
        this.setCreativeTab(CreativeTabs.tabDecorations);
        "".length();
        this.slipperiness = 0.8f;
    }
    
    private static int llIlIlIlIIIlIll(final double n, final double n2) {
        return dcmpg(n, n2);
    }
    
    @Override
    public void onEntityCollidedWithBlock(final World lllllllllllllIIlIllllIllIlIlllIl, final BlockPos lllllllllllllIIlIllllIllIlIlIlll, final Entity lllllllllllllIIlIllllIllIlIllIll) {
        if (llIlIlIlIIIllII(llIlIlIlIIIllIl(Math.abs(lllllllllllllIIlIllllIllIlIllIll.motionY), 0.1)) && llIlIlIlIIIlllI(lllllllllllllIIlIllllIllIlIllIll.isSneaking() ? 1 : 0)) {
            final double lllllllllllllIIlIllllIllIlIllIlI = 0.4 + Math.abs(lllllllllllllIIlIllllIllIlIllIll.motionY) * 0.2;
            lllllllllllllIIlIllllIllIlIllIll.motionX *= lllllllllllllIIlIllllIllIlIllIlI;
            lllllllllllllIIlIllllIllIlIllIll.motionZ *= lllllllllllllIIlIllllIllIlIllIlI;
        }
        super.onEntityCollidedWithBlock(lllllllllllllIIlIllllIllIlIlllIl, lllllllllllllIIlIllllIllIlIlIlll, lllllllllllllIIlIllllIllIlIllIll);
    }
    
    private static int llIlIlIlIIIllIl(final double n, final double n2) {
        return dcmpg(n, n2);
    }
    
    @Override
    public void onLanded(final World lllllllllllllIIlIllllIllIllIIlIl, final Entity lllllllllllllIIlIllllIllIllIIlll) {
        if (llIlIlIlIIIlIlI(lllllllllllllIIlIllllIllIllIIlll.isSneaking() ? 1 : 0)) {
            super.onLanded(lllllllllllllIIlIllllIllIllIIlIl, lllllllllllllIIlIllllIllIllIIlll);
            "".length();
            if (" ".length() == 0) {
                return;
            }
        }
        else if (llIlIlIlIIIllII(llIlIlIlIIIlIll(lllllllllllllIIlIllllIllIllIIlll.motionY, 0.0))) {
            lllllllllllllIIlIllllIllIllIIlll.motionY = -lllllllllllllIIlIllllIllIllIIlll.motionY;
        }
    }
}
