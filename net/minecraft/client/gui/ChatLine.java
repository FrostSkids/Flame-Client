// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.client.gui;

import net.minecraft.util.IChatComponent;

public class ChatLine
{
    private final /* synthetic */ int updateCounterCreated;
    private final /* synthetic */ IChatComponent lineString;
    private final /* synthetic */ int chatLineID;
    
    public ChatLine(final int llllllllllllIllIllIlIllIIlllllIl, final IChatComponent llllllllllllIllIllIlIllIIllllIII, final int llllllllllllIllIllIlIllIIlllIlll) {
        this.lineString = llllllllllllIllIllIlIllIIllllIII;
        this.updateCounterCreated = llllllllllllIllIllIlIllIIlllllIl;
        this.chatLineID = llllllllllllIllIllIlIllIIlllIlll;
    }
    
    public IChatComponent getChatComponent() {
        return this.lineString;
    }
    
    public int getChatLineID() {
        return this.chatLineID;
    }
    
    public int getUpdatedCounter() {
        return this.updateCounterCreated;
    }
}
