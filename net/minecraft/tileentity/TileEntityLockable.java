// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.tileentity;

import net.minecraft.util.ChatComponentStyle;
import net.minecraft.util.ChatComponentTranslation;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.IChatComponent;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.world.LockCode;
import net.minecraft.world.IInteractionObject;
import net.minecraft.world.ILockableContainer;

public abstract class TileEntityLockable extends TileEntity implements ILockableContainer, IInteractionObject
{
    private /* synthetic */ LockCode code;
    private static final /* synthetic */ int[] lllIlIlIlIllII;
    
    static {
        lIlIIIllIIIIIIII();
    }
    
    private static void lIlIIIllIIIIIIII() {
        (lllIlIlIlIllII = new int[2])[0] = " ".length();
        TileEntityLockable.lllIlIlIlIllII[1] = ((0x20 ^ 0xF) & ~(0xBC ^ 0x93));
    }
    
    @Override
    public void readFromNBT(final NBTTagCompound llllllllllllIlIllIllIIlIlIIlIIII) {
        super.readFromNBT(llllllllllllIlIllIllIIlIlIIlIIII);
        this.code = LockCode.fromNBT(llllllllllllIlIllIllIIlIlIIlIIII);
    }
    
    @Override
    public void setLockCode(final LockCode llllllllllllIlIllIllIIlIIlllllII) {
        this.code = llllllllllllIlIllIllIIlIIlllllII;
    }
    
    private static boolean lIlIIIllIIIIIIlI(final int llllllllllllIlIllIllIIlIIlllIIll) {
        return llllllllllllIlIllIllIIlIIlllIIll == 0;
    }
    
    public TileEntityLockable() {
        this.code = LockCode.EMPTY_CODE;
    }
    
    @Override
    public boolean isLocked() {
        if (lIlIIIllIIIIIIIl(this.code) && lIlIIIllIIIIIIlI(this.code.isEmpty() ? 1 : 0)) {
            return TileEntityLockable.lllIlIlIlIllII[0] != 0;
        }
        return TileEntityLockable.lllIlIlIlIllII[1] != 0;
    }
    
    @Override
    public void writeToNBT(final NBTTagCompound llllllllllllIlIllIllIIlIlIIIlIII) {
        super.writeToNBT(llllllllllllIlIllIllIIlIlIIIlIII);
        if (lIlIIIllIIIIIIIl(this.code)) {
            this.code.toNBT(llllllllllllIlIllIllIIlIlIIIlIII);
        }
    }
    
    private static boolean lIlIIIllIIIIIIll(final int llllllllllllIlIllIllIIlIIlllIlIl) {
        return llllllllllllIlIllIllIIlIIlllIlIl != 0;
    }
    
    @Override
    public LockCode getLockCode() {
        return this.code;
    }
    
    @Override
    public IChatComponent getDisplayName() {
        ChatComponentStyle chatComponentStyle;
        if (lIlIIIllIIIIIIll(this.hasCustomName() ? 1 : 0)) {
            chatComponentStyle = new ChatComponentText(this.getName());
            "".length();
            if ("   ".length() <= 0) {
                return null;
            }
        }
        else {
            chatComponentStyle = new ChatComponentTranslation(this.getName(), new Object[TileEntityLockable.lllIlIlIlIllII[1]]);
        }
        return chatComponentStyle;
    }
    
    private static boolean lIlIIIllIIIIIIIl(final Object llllllllllllIlIllIllIIlIIlllIlll) {
        return llllllllllllIlIllIllIIlIIlllIlll != null;
    }
}
