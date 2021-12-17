// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.entity.ai;

import net.minecraft.tileentity.TileEntity;
import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.BlockBed;
import net.minecraft.tileentity.TileEntityChest;
import net.minecraft.init.Blocks;
import net.minecraft.util.BlockPos;
import net.minecraft.world.World;
import net.minecraft.entity.EntityCreature;
import net.minecraft.entity.passive.EntityOcelot;

public class EntityAIOcelotSit extends EntityAIMoveToBlock
{
    private final /* synthetic */ EntityOcelot field_151493_a;
    private static final /* synthetic */ int[] llIIIlIlIIIlll;
    
    @Override
    public void updateTask() {
        super.updateTask();
        this.field_151493_a.getAISit().setSitting((boolean)(EntityAIOcelotSit.llIIIlIlIIIlll[2] != 0));
        if (lIIIlIIlIIlllIll(this.getIsAboveDestination() ? 1 : 0)) {
            this.field_151493_a.setSitting((boolean)(EntityAIOcelotSit.llIIIlIlIIIlll[2] != 0));
            "".length();
            if (((46 + 68 + 3 + 37 ^ 61 + 109 - 127 + 102) & (28 + 19 + 85 + 19 ^ 148 + 1 - 117 + 124 ^ -" ".length())) < ((0x93 ^ 0x9D ^ (0x36 ^ 0x32)) & (0xF6 ^ 0xC3 ^ (0x51 ^ 0x6E) ^ -" ".length()))) {
                return;
            }
        }
        else if (lIIIlIIlIIlllIll(this.field_151493_a.isSitting() ? 1 : 0)) {
            this.field_151493_a.setSitting((boolean)(EntityAIOcelotSit.llIIIlIlIIIlll[1] != 0));
        }
    }
    
    public EntityAIOcelotSit(final EntityOcelot llllllllllllIlllIlIlllIlIIllllII, final double llllllllllllIlllIlIlllIlIIlllllI) {
        super(llllllllllllIlllIlIlllIlIIllllII, llllllllllllIlllIlIlllIlIIlllllI, EntityAIOcelotSit.llIIIlIlIIIlll[0]);
        this.field_151493_a = llllllllllllIlllIlIlllIlIIllllII;
    }
    
    @Override
    protected boolean shouldMoveTo(final World llllllllllllIlllIlIlllIlIIlIIlIl, final BlockPos llllllllllllIlllIlIlllIlIIIlllll) {
        if (lIIIlIIlIIlllIll(llllllllllllIlllIlIlllIlIIlIIlIl.isAirBlock(llllllllllllIlllIlIlllIlIIIlllll.up()) ? 1 : 0)) {
            return EntityAIOcelotSit.llIIIlIlIIIlll[2] != 0;
        }
        final IBlockState llllllllllllIlllIlIlllIlIIlIIIll = llllllllllllIlllIlIlllIlIIlIIlIl.getBlockState(llllllllllllIlllIlIlllIlIIIlllll);
        final Block llllllllllllIlllIlIlllIlIIlIIIlI = llllllllllllIlllIlIlllIlIIlIIIll.getBlock();
        if (lIIIlIIlIIllllII(llllllllllllIlllIlIlllIlIIlIIIlI, Blocks.chest)) {
            final TileEntity llllllllllllIlllIlIlllIlIIlIIIIl = llllllllllllIlllIlIlllIlIIlIIlIl.getTileEntity(llllllllllllIlllIlIlllIlIIIlllll);
            if (lIIIlIIlIIlllIlI((llllllllllllIlllIlIlllIlIIlIIIIl instanceof TileEntityChest) ? 1 : 0) && lIIIlIIlIIllllIl(((TileEntityChest)llllllllllllIlllIlIlllIlIIlIIIIl).numPlayersUsing, EntityAIOcelotSit.llIIIlIlIIIlll[1])) {
                return EntityAIOcelotSit.llIIIlIlIIIlll[1] != 0;
            }
        }
        else {
            if (lIIIlIIlIIllllII(llllllllllllIlllIlIlllIlIIlIIIlI, Blocks.lit_furnace)) {
                return EntityAIOcelotSit.llIIIlIlIIIlll[1] != 0;
            }
            if (lIIIlIIlIIllllII(llllllllllllIlllIlIlllIlIIlIIIlI, Blocks.bed) && lIIIlIIlIIlllllI(llllllllllllIlllIlIlllIlIIlIIIll.getValue(BlockBed.PART), BlockBed.EnumPartType.HEAD)) {
                return EntityAIOcelotSit.llIIIlIlIIIlll[1] != 0;
            }
        }
        return EntityAIOcelotSit.llIIIlIlIIIlll[2] != 0;
    }
    
    private static boolean lIIIlIIlIIllllIl(final int llllllllllllIlllIlIlllIlIIIllIIl, final int llllllllllllIlllIlIlllIlIIIllIII) {
        return llllllllllllIlllIlIlllIlIIIllIIl < llllllllllllIlllIlIlllIlIIIllIII;
    }
    
    private static boolean lIIIlIIlIIllllII(final Object llllllllllllIlllIlIlllIlIIIlIIIl, final Object llllllllllllIlllIlIlllIlIIIlIIII) {
        return llllllllllllIlllIlIlllIlIIIlIIIl == llllllllllllIlllIlIlllIlIIIlIIII;
    }
    
    private static boolean lIIIlIIlIIlllIll(final int llllllllllllIlllIlIlllIlIIIIllII) {
        return llllllllllllIlllIlIlllIlIIIIllII == 0;
    }
    
    private static boolean lIIIlIIlIIlllllI(final Object llllllllllllIlllIlIlllIlIIIlIlIl, final Object llllllllllllIlllIlIlllIlIIIlIlII) {
        return llllllllllllIlllIlIlllIlIIIlIlIl != llllllllllllIlllIlIlllIlIIIlIlII;
    }
    
    @Override
    public void startExecuting() {
        super.startExecuting();
        this.field_151493_a.getAISit().setSitting((boolean)(EntityAIOcelotSit.llIIIlIlIIIlll[2] != 0));
    }
    
    @Override
    public void resetTask() {
        super.resetTask();
        this.field_151493_a.setSitting((boolean)(EntityAIOcelotSit.llIIIlIlIIIlll[2] != 0));
    }
    
    @Override
    public boolean continueExecuting() {
        return super.continueExecuting();
    }
    
    private static void lIIIlIIlIIlllIIl() {
        (llIIIlIlIIIlll = new int[3])[0] = (0xA1 ^ 0xA9);
        EntityAIOcelotSit.llIIIlIlIIIlll[1] = " ".length();
        EntityAIOcelotSit.llIIIlIlIIIlll[2] = ((0x88 ^ 0xB0) & ~(0x54 ^ 0x6C));
    }
    
    private static boolean lIIIlIIlIIlllIlI(final int llllllllllllIlllIlIlllIlIIIIlllI) {
        return llllllllllllIlllIlIlllIlIIIIlllI != 0;
    }
    
    @Override
    public boolean shouldExecute() {
        if (lIIIlIIlIIlllIlI(this.field_151493_a.isTamed() ? 1 : 0) && lIIIlIIlIIlllIll(this.field_151493_a.isSitting() ? 1 : 0) && lIIIlIIlIIlllIlI(super.shouldExecute() ? 1 : 0)) {
            return EntityAIOcelotSit.llIIIlIlIIIlll[1] != 0;
        }
        return EntityAIOcelotSit.llIIIlIlIIIlll[2] != 0;
    }
    
    static {
        lIIIlIIlIIlllIIl();
    }
}
