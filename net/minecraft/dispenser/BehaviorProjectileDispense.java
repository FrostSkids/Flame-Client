// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.dispenser;

import net.minecraft.entity.IProjectile;
import net.minecraft.util.EnumFacing;
import net.minecraft.world.World;
import net.minecraft.entity.Entity;
import net.minecraft.block.BlockDispenser;
import net.minecraft.item.ItemStack;

public abstract class BehaviorProjectileDispense extends BehaviorDefaultDispenseItem
{
    private static final /* synthetic */ int[] llIIIIllIllIII;
    
    private static void lIIIlIIIIIlllIIl() {
        (llIIIIllIllIII = new int[3])[0] = " ".length();
        BehaviorProjectileDispense.llIIIIllIllIII[1] = (0xFFFFA7EB & 0x5BFE);
        BehaviorProjectileDispense.llIIIIllIllIII[2] = ((118 + 46 - 26 + 9 ^ 160 + 92 - 149 + 59) & (0x4 ^ 0x56 ^ (0x9 ^ 0x6A) ^ -" ".length()));
    }
    
    @Override
    protected void playDispenseSound(final IBlockSource llllllllllllIlllIllIlIIllIllIlll) {
        llllllllllllIlllIllIlIIllIllIlll.getWorld().playAuxSFX(BehaviorProjectileDispense.llIIIIllIllIII[1], llllllllllllIlllIllIlIIllIllIlll.getBlockPos(), BehaviorProjectileDispense.llIIIIllIllIII[2]);
    }
    
    protected float func_82500_b() {
        return 1.1f;
    }
    
    protected float func_82498_a() {
        return 6.0f;
    }
    
    static {
        lIIIlIIIIIlllIIl();
    }
    
    public ItemStack dispenseStack(final IBlockSource llllllllllllIlllIllIlIIlllIIIlll, final ItemStack llllllllllllIlllIllIlIIllIllllll) {
        final World llllllllllllIlllIllIlIIlllIIIlIl = llllllllllllIlllIllIlIIlllIIIlll.getWorld();
        final IPosition llllllllllllIlllIllIlIIlllIIIlII = BlockDispenser.getDispensePosition(llllllllllllIlllIllIlIIlllIIIlll);
        final EnumFacing llllllllllllIlllIllIlIIlllIIIIll = BlockDispenser.getFacing(llllllllllllIlllIllIlIIlllIIIlll.getBlockMetadata());
        final IProjectile llllllllllllIlllIllIlIIlllIIIIlI = this.getProjectileEntity(llllllllllllIlllIllIlIIlllIIIlIl, llllllllllllIlllIllIlIIlllIIIlII);
        llllllllllllIlllIllIlIIlllIIIIlI.setThrowableHeading(llllllllllllIlllIllIlIIlllIIIIll.getFrontOffsetX(), llllllllllllIlllIllIlIIlllIIIIll.getFrontOffsetY() + 0.1f, llllllllllllIlllIllIlIIlllIIIIll.getFrontOffsetZ(), this.func_82500_b(), this.func_82498_a());
        llllllllllllIlllIllIlIIlllIIIlIl.spawnEntityInWorld((Entity)llllllllllllIlllIllIlIIlllIIIIlI);
        "".length();
        llllllllllllIlllIllIlIIllIllllll.splitStack(BehaviorProjectileDispense.llIIIIllIllIII[0]);
        "".length();
        return llllllllllllIlllIllIlIIllIllllll;
    }
    
    protected abstract IProjectile getProjectileEntity(final World p0, final IPosition p1);
}
