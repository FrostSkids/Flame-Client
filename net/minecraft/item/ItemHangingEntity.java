// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.item;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.item.EntityItemFrame;
import net.minecraft.entity.item.EntityPainting;
import net.minecraft.entity.Entity;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.BlockPos;
import net.minecraft.world.World;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.EntityHanging;

public class ItemHangingEntity extends Item
{
    private static final /* synthetic */ int[] lIIIIllIIIIlII;
    private final /* synthetic */ Class<? extends EntityHanging> hangingEntityClass;
    
    private static boolean lIlllIlIlllIlll(final int lllllllllllllIlIIlIlIIIIIIIllIII) {
        return lllllllllllllIlIIlIlIIIIIIIllIII != 0;
    }
    
    @Override
    public boolean onItemUse(final ItemStack lllllllllllllIlIIlIlIIIIIIllIIlI, final EntityPlayer lllllllllllllIlIIlIlIIIIIIllllII, final World lllllllllllllIlIIlIlIIIIIIlllIll, final BlockPos lllllllllllllIlIIlIlIIIIIIlIllll, final EnumFacing lllllllllllllIlIIlIlIIIIIIlIlllI, final float lllllllllllllIlIIlIlIIIIIIlllIII, final float lllllllllllllIlIIlIlIIIIIIllIlll, final float lllllllllllllIlIIlIlIIIIIIllIllI) {
        if (lIlllIlIlllIlII(lllllllllllllIlIIlIlIIIIIIlIlllI, EnumFacing.DOWN)) {
            return ItemHangingEntity.lIIIIllIIIIlII[0] != 0;
        }
        if (lIlllIlIlllIlII(lllllllllllllIlIIlIlIIIIIIlIlllI, EnumFacing.UP)) {
            return ItemHangingEntity.lIIIIllIIIIlII[0] != 0;
        }
        final BlockPos lllllllllllllIlIIlIlIIIIIIllIlIl = lllllllllllllIlIIlIlIIIIIIlIllll.offset(lllllllllllllIlIIlIlIIIIIIlIlllI);
        if (lIlllIlIlllIlIl(lllllllllllllIlIIlIlIIIIIIllllII.canPlayerEdit(lllllllllllllIlIIlIlIIIIIIllIlIl, lllllllllllllIlIIlIlIIIIIIlIlllI, lllllllllllllIlIIlIlIIIIIIllIIlI) ? 1 : 0)) {
            return ItemHangingEntity.lIIIIllIIIIlII[0] != 0;
        }
        final EntityHanging lllllllllllllIlIIlIlIIIIIIllIlII = this.createEntity(lllllllllllllIlIIlIlIIIIIIlllIll, lllllllllllllIlIIlIlIIIIIIllIlIl, lllllllllllllIlIIlIlIIIIIIlIlllI);
        if (lIlllIlIlllIllI(lllllllllllllIlIIlIlIIIIIIllIlII) && lIlllIlIlllIlll(lllllllllllllIlIIlIlIIIIIIllIlII.onValidSurface() ? 1 : 0)) {
            if (lIlllIlIlllIlIl(lllllllllllllIlIIlIlIIIIIIlllIll.isRemote ? 1 : 0)) {
                lllllllllllllIlIIlIlIIIIIIlllIll.spawnEntityInWorld(lllllllllllllIlIIlIlIIIIIIllIlII);
                "".length();
            }
            lllllllllllllIlIIlIlIIIIIIllIIlI.stackSize -= ItemHangingEntity.lIIIIllIIIIlII[1];
        }
        return ItemHangingEntity.lIIIIllIIIIlII[1] != 0;
    }
    
    static {
        lIlllIlIlllIIll();
    }
    
    private static boolean lIlllIlIlllIllI(final Object lllllllllllllIlIIlIlIIIIIIIllIlI) {
        return lllllllllllllIlIIlIlIIIIIIIllIlI != null;
    }
    
    private EntityHanging createEntity(final World lllllllllllllIlIIlIlIIIIIIlIIllI, final BlockPos lllllllllllllIlIIlIlIIIIIIlIIIIl, final EnumFacing lllllllllllllIlIIlIlIIIIIIlIIIII) {
        EntityHanging entityHanging;
        if (lIlllIlIlllIlII(this.hangingEntityClass, EntityPainting.class)) {
            entityHanging = new EntityPainting(lllllllllllllIlIIlIlIIIIIIlIIllI, lllllllllllllIlIIlIlIIIIIIlIIIIl, lllllllllllllIlIIlIlIIIIIIlIIIII);
            "".length();
            if (-" ".length() >= (0x2A ^ 0x7B ^ (0x90 ^ 0xC5))) {
                return null;
            }
        }
        else if (lIlllIlIlllIlII(this.hangingEntityClass, EntityItemFrame.class)) {
            entityHanging = new EntityItemFrame(lllllllllllllIlIIlIlIIIIIIlIIllI, lllllllllllllIlIIlIlIIIIIIlIIIIl, lllllllllllllIlIIlIlIIIIIIlIIIII);
            "".length();
            if ((0x9 ^ 0xD) != (0x5E ^ 0x5A)) {
                return null;
            }
        }
        else {
            entityHanging = null;
        }
        return entityHanging;
    }
    
    private static boolean lIlllIlIlllIlII(final Object lllllllllllllIlIIlIlIIIIIIIlllIl, final Object lllllllllllllIlIIlIlIIIIIIIlllII) {
        return lllllllllllllIlIIlIlIIIIIIIlllIl == lllllllllllllIlIIlIlIIIIIIIlllII;
    }
    
    private static boolean lIlllIlIlllIlIl(final int lllllllllllllIlIIlIlIIIIIIIlIllI) {
        return lllllllllllllIlIIlIlIIIIIIIlIllI == 0;
    }
    
    public ItemHangingEntity(final Class<? extends EntityHanging> lllllllllllllIlIIlIlIIIIIlIIIlll) {
        this.hangingEntityClass = lllllllllllllIlIIlIlIIIIIlIIIlll;
        this.setCreativeTab(CreativeTabs.tabDecorations);
        "".length();
    }
    
    private static void lIlllIlIlllIIll() {
        (lIIIIllIIIIlII = new int[2])[0] = ((0x9C ^ 0x98) & ~(0xB3 ^ 0xB7));
        ItemHangingEntity.lIIIIllIIIIlII[1] = " ".length();
    }
}
