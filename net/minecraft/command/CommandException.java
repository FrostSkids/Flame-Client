// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.command;

public class CommandException extends Exception
{
    private final /* synthetic */ Object[] errorObjects;
    
    public CommandException(final String lllllllllllllIlIIIIIIlIlIllIlIIl, final Object... lllllllllllllIlIIIIIIlIlIllIIlIl) {
        super(lllllllllllllIlIIIIIIlIlIllIlIIl);
        this.errorObjects = lllllllllllllIlIIIIIIlIlIllIIlIl;
    }
    
    public Object[] getErrorObjects() {
        return this.errorObjects;
    }
}
