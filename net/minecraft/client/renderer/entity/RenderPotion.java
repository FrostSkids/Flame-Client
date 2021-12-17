// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.client.renderer.entity;

import net.minecraft.item.ItemStack;
import net.minecraft.entity.Entity;
import net.minecraft.item.Item;
import net.minecraft.init.Items;
import net.minecraft.entity.projectile.EntityPotion;

public class RenderPotion extends RenderSnowball<EntityPotion>
{
    private static final /* synthetic */ int[] lllIlIIllIIIII;
    
    public RenderPotion(final RenderManager llllllllllllIlIllIllllIIIlllIllI, final RenderItem llllllllllllIlIllIllllIIIlllIlIl) {
        super(llllllllllllIlIllIllllIIIlllIllI, Items.potionitem, llllllllllllIlIllIllllIIIlllIlIl);
    }
    
    static {
        lIlIIIlIIlIIllll();
    }
    
    private static void lIlIIIlIIlIIllll() {
        (lllIlIIllIIIII = new int[1])[0] = " ".length();
    }
    
    @Override
    public ItemStack func_177082_d(final EntityPotion llllllllllllIlIllIllllIIIllIllll) {
        return new ItemStack(this.field_177084_a, RenderPotion.lllIlIIllIIIII[0], llllllllllllIlIllIllllIIIllIllll.getPotionDamage());
    }
}
