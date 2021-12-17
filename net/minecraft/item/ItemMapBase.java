// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.item;

import net.minecraft.network.Packet;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;

public class ItemMapBase extends Item
{
    private static final /* synthetic */ int[] llIlllIIIIlllI;
    
    @Override
    public boolean isMap() {
        return ItemMapBase.llIlllIIIIlllI[0] != 0;
    }
    
    static {
        lIIllIIlIIIlIIll();
    }
    
    private static void lIIllIIlIIIlIIll() {
        (llIlllIIIIlllI = new int[1])[0] = " ".length();
    }
    
    public Packet createMapDataPacket(final ItemStack llllllllllllIllIIlIlIlIlIlIllIll, final World llllllllllllIllIIlIlIlIlIlIllIlI, final EntityPlayer llllllllllllIllIIlIlIlIlIlIllIIl) {
        return null;
    }
}
