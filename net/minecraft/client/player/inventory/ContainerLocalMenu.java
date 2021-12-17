// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.client.player.inventory;

import com.google.common.collect.Maps;
import net.minecraft.util.IChatComponent;
import net.minecraft.world.LockCode;
import net.minecraft.inventory.Container;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import java.util.Map;
import net.minecraft.world.ILockableContainer;
import net.minecraft.inventory.InventoryBasic;

public class ContainerLocalMenu extends InventoryBasic implements ILockableContainer
{
    private /* synthetic */ Map<Integer, Integer> field_174895_b;
    private static final /* synthetic */ int[] lIIIlIlIIIIllI;
    private /* synthetic */ String guiID;
    
    @Override
    public Container createContainer(final InventoryPlayer lllllllllllllIlIIIlIIIIllllllIlI, final EntityPlayer lllllllllllllIlIIIlIIIIllllllIIl) {
        throw new UnsupportedOperationException();
    }
    
    @Override
    public void setLockCode(final LockCode lllllllllllllIlIIIlIIIlIIIIIIIII) {
    }
    
    public ContainerLocalMenu(final String lllllllllllllIlIIIlIIIlIIIIllIll, final IChatComponent lllllllllllllIlIIIlIIIlIIIIlIllI, final int lllllllllllllIlIIIlIIIlIIIIllIIl) {
        super(lllllllllllllIlIIIlIIIlIIIIlIllI, lllllllllllllIlIIIlIIIlIIIIllIIl);
        this.field_174895_b = (Map<Integer, Integer>)Maps.newHashMap();
        this.guiID = lllllllllllllIlIIIlIIIlIIIIllIll;
    }
    
    @Override
    public boolean isLocked() {
        return ContainerLocalMenu.lIIIlIlIIIIllI[0] != 0;
    }
    
    @Override
    public int getFieldCount() {
        return this.field_174895_b.size();
    }
    
    @Override
    public void setField(final int lllllllllllllIlIIIlIIIlIIIIIIlll, final int lllllllllllllIlIIIlIIIlIIIIIIllI) {
        this.field_174895_b.put(lllllllllllllIlIIIlIIIlIIIIIIlll, lllllllllllllIlIIIlIIIlIIIIIIllI);
        "".length();
    }
    
    private static void llIIIIIIIIllIII() {
        (lIIIlIlIIIIllI = new int[1])[0] = ((121 + 133 - 166 + 68 ^ 158 + 8 - 73 + 76) & (0x8F ^ 0xB5 ^ (0x95 ^ 0x9A) ^ -" ".length()));
    }
    
    @Override
    public LockCode getLockCode() {
        return LockCode.EMPTY_CODE;
    }
    
    static {
        llIIIIIIIIllIII();
    }
    
    @Override
    public int getField(final int lllllllllllllIlIIIlIIIlIIIIIllll) {
        int intValue;
        if (llIIIIIIIIllIIl(this.field_174895_b.containsKey(lllllllllllllIlIIIlIIIlIIIIIllll) ? 1 : 0)) {
            intValue = this.field_174895_b.get(lllllllllllllIlIIIlIIIlIIIIIllll);
            "".length();
            if (((0x19 ^ 0x29) & ~(0x44 ^ 0x74)) != 0x0) {
                return (0x9C ^ 0xAB) & ~(0x5D ^ 0x6A);
            }
        }
        else {
            intValue = ContainerLocalMenu.lIIIlIlIIIIllI[0];
        }
        return intValue;
    }
    
    @Override
    public String getGuiID() {
        return this.guiID;
    }
    
    private static boolean llIIIIIIIIllIIl(final int lllllllllllllIlIIIlIIIIlllllIlll) {
        return lllllllllllllIlIIIlIIIIlllllIlll != 0;
    }
}
