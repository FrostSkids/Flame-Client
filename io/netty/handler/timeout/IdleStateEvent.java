// 
// Decompiled by Procyon v0.5.36
// 

package io.netty.handler.timeout;

public final class IdleStateEvent
{
    private final /* synthetic */ boolean first;
    private static final /* synthetic */ int[] lIIlllIIIIIlII;
    private final /* synthetic */ IdleState state;
    
    private static void llIllIlIlIIIlII() {
        (lIIlllIIIIIlII = new int[2])[0] = " ".length();
        IdleStateEvent.lIIlllIIIIIlII[1] = ((0xA3 ^ 0xAD) & ~(0x21 ^ 0x2F));
    }
    
    private IdleStateEvent(final IdleState lllllllllllllIIlIlIIlIIIIlIIIlll, final boolean lllllllllllllIIlIlIIlIIIIlIIIllI) {
        this.state = lllllllllllllIIlIlIIlIIIIlIIIlll;
        this.first = lllllllllllllIIlIlIIlIIIIlIIIllI;
    }
    
    static {
        llIllIlIlIIIlII();
        FIRST_READER_IDLE_STATE_EVENT = new IdleStateEvent(IdleState.READER_IDLE, (boolean)(IdleStateEvent.lIIlllIIIIIlII[0] != 0));
        READER_IDLE_STATE_EVENT = new IdleStateEvent(IdleState.READER_IDLE, (boolean)(IdleStateEvent.lIIlllIIIIIlII[1] != 0));
        FIRST_WRITER_IDLE_STATE_EVENT = new IdleStateEvent(IdleState.WRITER_IDLE, (boolean)(IdleStateEvent.lIIlllIIIIIlII[0] != 0));
        WRITER_IDLE_STATE_EVENT = new IdleStateEvent(IdleState.WRITER_IDLE, (boolean)(IdleStateEvent.lIIlllIIIIIlII[1] != 0));
        FIRST_ALL_IDLE_STATE_EVENT = new IdleStateEvent(IdleState.ALL_IDLE, (boolean)(IdleStateEvent.lIIlllIIIIIlII[0] != 0));
        ALL_IDLE_STATE_EVENT = new IdleStateEvent(IdleState.ALL_IDLE, (boolean)(IdleStateEvent.lIIlllIIIIIlII[1] != 0));
    }
    
    public boolean isFirst() {
        return this.first;
    }
    
    public IdleState state() {
        return this.state;
    }
}
