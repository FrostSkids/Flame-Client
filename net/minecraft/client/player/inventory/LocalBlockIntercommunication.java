// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.client.player.inventory;

import net.minecraft.inventory.Container;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.util.IChatComponent;
import net.minecraft.world.IInteractionObject;

public class LocalBlockIntercommunication implements IInteractionObject
{
    private static final /* synthetic */ int[] lllIIIlIIIlIII;
    private /* synthetic */ IChatComponent displayName;
    private /* synthetic */ String guiID;
    
    @Override
    public IChatComponent getDisplayName() {
        return this.displayName;
    }
    
    @Override
    public Container createContainer(final InventoryPlayer llllllllllllIllIIIIIllIlIlIIIlll, final EntityPlayer llllllllllllIllIIIIIllIlIlIIIllI) {
        throw new UnsupportedOperationException();
    }
    
    private static void lIIlllIlIIlIIlIl() {
        (lllIIIlIIIlIII = new int[1])[0] = " ".length();
    }
    
    @Override
    public String getName() {
        return this.displayName.getUnformattedText();
    }
    
    static {
        lIIlllIlIIlIIlIl();
    }
    
    @Override
    public String getGuiID() {
        return this.guiID;
    }
    
    @Override
    public boolean hasCustomName() {
        return LocalBlockIntercommunication.lllIIIlIIIlIII[0] != 0;
    }
    
    public LocalBlockIntercommunication(final String llllllllllllIllIIIIIllIlIlIIllIl, final IChatComponent llllllllllllIllIIIIIllIlIlIIlIIl) {
        this.guiID = llllllllllllIllIIIIIllIlIlIIllIl;
        this.displayName = llllllllllllIllIIIIIllIlIlIIlIIl;
    }
}
