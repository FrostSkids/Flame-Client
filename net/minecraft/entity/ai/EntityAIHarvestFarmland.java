// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.entity.ai;

import net.minecraft.entity.EntityCreature;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import net.minecraft.inventory.InventoryBasic;
import net.minecraft.item.ItemStack;
import net.minecraft.init.Items;
import net.minecraft.block.state.IBlockState;
import net.minecraft.block.Block;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.BlockCrops;
import net.minecraft.init.Blocks;
import net.minecraft.util.BlockPos;
import net.minecraft.world.World;
import net.minecraft.entity.passive.EntityVillager;

public class EntityAIHarvestFarmland extends EntityAIMoveToBlock
{
    private static final /* synthetic */ int[] lllIlIIIIIIIlI;
    private /* synthetic */ boolean hasFarmItem;
    private final /* synthetic */ EntityVillager theVillager;
    private /* synthetic */ int field_179501_f;
    private static final /* synthetic */ String[] lllIlIIIIIIIIl;
    private /* synthetic */ boolean field_179503_e;
    
    private static boolean lIlIIIIlIlIIIlII(final int llllllllllllIlIlllIIllllllIIlIIl, final int llllllllllllIlIlllIIllllllIIlIII) {
        return llllllllllllIlIlllIIllllllIIlIIl == llllllllllllIlIlllIIllllllIIlIII;
    }
    
    private static boolean lIlIIIIlIlIIIIIl(final int llllllllllllIlIlllIIlllllIlllIlI) {
        return llllllllllllIlIlllIIlllllIlllIlI == 0;
    }
    
    @Override
    protected boolean shouldMoveTo(final World llllllllllllIlIlllIIllllllIlllII, BlockPos llllllllllllIlIlllIIllllllIllIll) {
        Block llllllllllllIlIlllIIllllllIlllll = llllllllllllIlIlllIIllllllIlllII.getBlockState(llllllllllllIlIlllIIllllllIllIll).getBlock();
        if (lIlIIIIlIlIIIlIl(llllllllllllIlIlllIIllllllIlllll, Blocks.farmland)) {
            llllllllllllIlIlllIIllllllIllIll = llllllllllllIlIlllIIllllllIllIll.up();
            final IBlockState llllllllllllIlIlllIIllllllIllllI = llllllllllllIlIlllIIllllllIlllII.getBlockState(llllllllllllIlIlllIIllllllIllIll);
            llllllllllllIlIlllIIllllllIlllll = llllllllllllIlIlllIIllllllIllllI.getBlock();
            if (lIlIIIIlIlIIIIll((llllllllllllIlIlllIIllllllIlllll instanceof BlockCrops) ? 1 : 0) && lIlIIIIlIlIIIlII(llllllllllllIlIlllIIllllllIllllI.getValue((IProperty<Integer>)BlockCrops.AGE), EntityAIHarvestFarmland.lllIlIIIIIIIlI[4]) && lIlIIIIlIlIIIIll(this.field_179503_e ? 1 : 0) && (!lIlIIIIlIlIIIIll(this.field_179501_f) || lIlIIIIlIlIIlIII(this.field_179501_f))) {
                this.field_179501_f = EntityAIHarvestFarmland.lllIlIIIIIIIlI[1];
                return EntityAIHarvestFarmland.lllIlIIIIIIIlI[3] != 0;
            }
            if (lIlIIIIlIlIIIlIl(llllllllllllIlIlllIIllllllIlllll, Blocks.air) && lIlIIIIlIlIIIIll(this.hasFarmItem ? 1 : 0) && (!lIlIIIIlIlIIlIIl(this.field_179501_f, EntityAIHarvestFarmland.lllIlIIIIIIIlI[3]) || lIlIIIIlIlIIlIII(this.field_179501_f))) {
                this.field_179501_f = EntityAIHarvestFarmland.lllIlIIIIIIIlI[3];
                return EntityAIHarvestFarmland.lllIlIIIIIIIlI[3] != 0;
            }
        }
        return EntityAIHarvestFarmland.lllIlIIIIIIIlI[1] != 0;
    }
    
    @Override
    public void updateTask() {
        super.updateTask();
        this.theVillager.getLookHelper().setLookPosition(this.destinationBlock.getX() + 0.5, this.destinationBlock.getY() + EntityAIHarvestFarmland.lllIlIIIIIIIlI[3], this.destinationBlock.getZ() + 0.5, 10.0f, (float)this.theVillager.getVerticalFaceSpeed());
        if (lIlIIIIlIlIIIIll(this.getIsAboveDestination() ? 1 : 0)) {
            final World llllllllllllIlIlllIIlllllllllIII = this.theVillager.worldObj;
            final BlockPos llllllllllllIlIlllIIllllllllIlll = this.destinationBlock.up();
            final IBlockState llllllllllllIlIlllIIllllllllIllI = llllllllllllIlIlllIIlllllllllIII.getBlockState(llllllllllllIlIlllIIllllllllIlll);
            final Block llllllllllllIlIlllIIllllllllIlIl = llllllllllllIlIlllIIllllllllIllI.getBlock();
            if (lIlIIIIlIlIIIIIl(this.field_179501_f) && lIlIIIIlIlIIIIll((llllllllllllIlIlllIIllllllllIlIl instanceof BlockCrops) ? 1 : 0) && lIlIIIIlIlIIIlII(llllllllllllIlIlllIIllllllllIllI.getValue((IProperty<Integer>)BlockCrops.AGE), EntityAIHarvestFarmland.lllIlIIIIIIIlI[4])) {
                llllllllllllIlIlllIIlllllllllIII.destroyBlock(llllllllllllIlIlllIIllllllllIlll, (boolean)(EntityAIHarvestFarmland.lllIlIIIIIIIlI[3] != 0));
                "".length();
                "".length();
                if (((0x5A ^ 0x1A ^ (0x23 ^ 0x59)) & (0xBD ^ 0xC0 ^ (0x1B ^ 0x5C) ^ -" ".length())) != 0x0) {
                    return;
                }
            }
            else if (lIlIIIIlIlIIIlII(this.field_179501_f, EntityAIHarvestFarmland.lllIlIIIIIIIlI[3]) && lIlIIIIlIlIIIlIl(llllllllllllIlIlllIIllllllllIlIl, Blocks.air)) {
                final InventoryBasic llllllllllllIlIlllIIllllllllIlII = this.theVillager.getVillagerInventory();
                int llllllllllllIlIlllIIllllllllIIll = EntityAIHarvestFarmland.lllIlIIIIIIIlI[1];
                "".length();
                if (((0xF6 ^ 0xC4) & ~(0x74 ^ 0x46)) < 0) {
                    return;
                }
                while (!lIlIIIIlIlIIIlll(llllllllllllIlIlllIIllllllllIIll, llllllllllllIlIlllIIllllllllIlII.getSizeInventory())) {
                    final ItemStack llllllllllllIlIlllIIllllllllIIlI = llllllllllllIlIlllIIllllllllIlII.getStackInSlot(llllllllllllIlIlllIIllllllllIIll);
                    boolean llllllllllllIlIlllIIllllllllIIIl = EntityAIHarvestFarmland.lllIlIIIIIIIlI[1] != 0;
                    if (lIlIIIIlIlIIIllI(llllllllllllIlIlllIIllllllllIIlI)) {
                        if (lIlIIIIlIlIIIlIl(llllllllllllIlIlllIIllllllllIIlI.getItem(), Items.wheat_seeds)) {
                            llllllllllllIlIlllIIlllllllllIII.setBlockState(llllllllllllIlIlllIIllllllllIlll, Blocks.wheat.getDefaultState(), EntityAIHarvestFarmland.lllIlIIIIIIIlI[5]);
                            "".length();
                            llllllllllllIlIlllIIllllllllIIIl = (EntityAIHarvestFarmland.lllIlIIIIIIIlI[3] != 0);
                            "".length();
                            if (-"  ".length() >= 0) {
                                return;
                            }
                        }
                        else if (lIlIIIIlIlIIIlIl(llllllllllllIlIlllIIllllllllIIlI.getItem(), Items.potato)) {
                            llllllllllllIlIlllIIlllllllllIII.setBlockState(llllllllllllIlIlllIIllllllllIlll, Blocks.potatoes.getDefaultState(), EntityAIHarvestFarmland.lllIlIIIIIIIlI[5]);
                            "".length();
                            llllllllllllIlIlllIIllllllllIIIl = (EntityAIHarvestFarmland.lllIlIIIIIIIlI[3] != 0);
                            "".length();
                            if ((0x99 ^ 0x9D) < (0x3D ^ 0x39)) {
                                return;
                            }
                        }
                        else if (lIlIIIIlIlIIIlIl(llllllllllllIlIlllIIllllllllIIlI.getItem(), Items.carrot)) {
                            llllllllllllIlIlllIIlllllllllIII.setBlockState(llllllllllllIlIlllIIllllllllIlll, Blocks.carrots.getDefaultState(), EntityAIHarvestFarmland.lllIlIIIIIIIlI[5]);
                            "".length();
                            llllllllllllIlIlllIIllllllllIIIl = (EntityAIHarvestFarmland.lllIlIIIIIIIlI[3] != 0);
                        }
                    }
                    if (lIlIIIIlIlIIIIll(llllllllllllIlIlllIIllllllllIIIl ? 1 : 0)) {
                        final ItemStack itemStack = llllllllllllIlIlllIIllllllllIIlI;
                        itemStack.stackSize -= EntityAIHarvestFarmland.lllIlIIIIIIIlI[3];
                        if (!lIlIIIIlIlIIIIII(llllllllllllIlIlllIIllllllllIIlI.stackSize)) {
                            break;
                        }
                        llllllllllllIlIlllIIllllllllIlII.setInventorySlotContents(llllllllllllIlIlllIIllllllllIIll, null);
                        "".length();
                        if (" ".length() > (0x2A ^ 0x2E)) {
                            return;
                        }
                        break;
                    }
                    else {
                        ++llllllllllllIlIlllIIllllllllIIll;
                    }
                }
            }
            this.field_179501_f = EntityAIHarvestFarmland.lllIlIIIIIIIlI[2];
            this.runDelay = EntityAIHarvestFarmland.lllIlIIIIIIIlI[6];
        }
    }
    
    private static String lIlIIIIlIIllllIl(final String llllllllllllIlIlllIIllllllIIllll, final String llllllllllllIlIlllIIllllllIIlllI) {
        try {
            final SecretKeySpec llllllllllllIlIlllIIllllllIlIlII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIlIlllIIllllllIIlllI.getBytes(StandardCharsets.UTF_8)), EntityAIHarvestFarmland.lllIlIIIIIIIlI[7]), "DES");
            final Cipher llllllllllllIlIlllIIllllllIlIIll = Cipher.getInstance("DES");
            llllllllllllIlIlllIIllllllIlIIll.init(EntityAIHarvestFarmland.lllIlIIIIIIIlI[8], llllllllllllIlIlllIIllllllIlIlII);
            return new String(llllllllllllIlIlllIIllllllIlIIll.doFinal(Base64.getDecoder().decode(llllllllllllIlIlllIIllllllIIllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIlIlllIIllllllIlIIlI) {
            llllllllllllIlIlllIIllllllIlIIlI.printStackTrace();
            return null;
        }
    }
    
    private static boolean lIlIIIIlIlIIIIlI(final int llllllllllllIlIlllIIlllllIlllIII) {
        return llllllllllllIlIlllIIlllllIlllIII >= 0;
    }
    
    @Override
    public void startExecuting() {
        super.startExecuting();
    }
    
    private static boolean lIlIIIIlIlIIlIII(final int llllllllllllIlIlllIIlllllIllIllI) {
        return llllllllllllIlIlllIIlllllIllIllI < 0;
    }
    
    private static boolean lIlIIIIlIlIIIIII(final int llllllllllllIlIlllIIlllllIllIlII) {
        return llllllllllllIlIlllIIlllllIllIlII <= 0;
    }
    
    @Override
    public boolean shouldExecute() {
        if (lIlIIIIlIlIIIIII(this.runDelay)) {
            if (lIlIIIIlIlIIIIIl(this.theVillager.worldObj.getGameRules().getBoolean(EntityAIHarvestFarmland.lllIlIIIIIIIIl[EntityAIHarvestFarmland.lllIlIIIIIIIlI[1]]) ? 1 : 0)) {
                return EntityAIHarvestFarmland.lllIlIIIIIIIlI[1] != 0;
            }
            this.field_179501_f = EntityAIHarvestFarmland.lllIlIIIIIIIlI[2];
            this.hasFarmItem = this.theVillager.isFarmItemInInventory();
            this.field_179503_e = this.theVillager.func_175557_cr();
        }
        return super.shouldExecute();
    }
    
    private static boolean lIlIIIIlIlIIIIll(final int llllllllllllIlIlllIIlllllIllllII) {
        return llllllllllllIlIlllIIlllllIllllII != 0;
    }
    
    private static void lIlIIIIlIIlllllI() {
        (lllIlIIIIIIIIl = new String[EntityAIHarvestFarmland.lllIlIIIIIIIlI[3]])[EntityAIHarvestFarmland.lllIlIIIIIIIlI[1]] = lIlIIIIlIIllllIl("S/q9u5cyfEMHgQ4rjdmjvg==", "FpgyQ");
    }
    
    @Override
    public boolean continueExecuting() {
        if (lIlIIIIlIlIIIIlI(this.field_179501_f) && lIlIIIIlIlIIIIll(super.continueExecuting() ? 1 : 0)) {
            return EntityAIHarvestFarmland.lllIlIIIIIIIlI[3] != 0;
        }
        return EntityAIHarvestFarmland.lllIlIIIIIIIlI[1] != 0;
    }
    
    private static void lIlIIIIlIIllllll() {
        (lllIlIIIIIIIlI = new int[9])[0] = (0xF5 ^ 0xA6 ^ (0x4F ^ 0xC));
        EntityAIHarvestFarmland.lllIlIIIIIIIlI[1] = ((0x68 ^ 0x5B) & ~(0x3B ^ 0x8));
        EntityAIHarvestFarmland.lllIlIIIIIIIlI[2] = -" ".length();
        EntityAIHarvestFarmland.lllIlIIIIIIIlI[3] = " ".length();
        EntityAIHarvestFarmland.lllIlIIIIIIIlI[4] = (122 + 43 - 36 + 19 ^ 106 + 15 + 12 + 14);
        EntityAIHarvestFarmland.lllIlIIIIIIIlI[5] = "   ".length();
        EntityAIHarvestFarmland.lllIlIIIIIIIlI[6] = (0x8 ^ 0x2);
        EntityAIHarvestFarmland.lllIlIIIIIIIlI[7] = (0x28 ^ 0x20);
        EntityAIHarvestFarmland.lllIlIIIIIIIlI[8] = "  ".length();
    }
    
    static {
        lIlIIIIlIIllllll();
        lIlIIIIlIIlllllI();
    }
    
    private static boolean lIlIIIIlIlIIlIIl(final int llllllllllllIlIlllIIlllllIllIIIl, final int llllllllllllIlIlllIIlllllIllIIII) {
        return llllllllllllIlIlllIIlllllIllIIIl != llllllllllllIlIlllIIlllllIllIIII;
    }
    
    @Override
    public void resetTask() {
        super.resetTask();
    }
    
    public EntityAIHarvestFarmland(final EntityVillager llllllllllllIlIlllIlIIIIIIIlIIll, final double llllllllllllIlIlllIlIIIIIIIlIIlI) {
        super(llllllllllllIlIlllIlIIIIIIIlIIll, llllllllllllIlIlllIlIIIIIIIlIIlI, EntityAIHarvestFarmland.lllIlIIIIIIIlI[0]);
        this.theVillager = llllllllllllIlIlllIlIIIIIIIlIIll;
    }
    
    private static boolean lIlIIIIlIlIIIlll(final int llllllllllllIlIlllIIllllllIIIlIl, final int llllllllllllIlIlllIIllllllIIIlII) {
        return llllllllllllIlIlllIIllllllIIIlIl >= llllllllllllIlIlllIIllllllIIIlII;
    }
    
    private static boolean lIlIIIIlIlIIIllI(final Object llllllllllllIlIlllIIlllllIlllllI) {
        return llllllllllllIlIlllIIlllllIlllllI != null;
    }
    
    private static boolean lIlIIIIlIlIIIlIl(final Object llllllllllllIlIlllIIllllllIIIIIl, final Object llllllllllllIlIlllIIllllllIIIIII) {
        return llllllllllllIlIlllIIllllllIIIIIl == llllllllllllIlIlllIIllllllIIIIII;
    }
}
