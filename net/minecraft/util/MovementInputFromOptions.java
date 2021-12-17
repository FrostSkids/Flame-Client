// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.util;

import net.minecraft.client.settings.GameSettings;

public class MovementInputFromOptions extends MovementInput
{
    private final /* synthetic */ GameSettings gameSettings;
    
    private static boolean lIIIllIIlllIIlIl(final int llllllllllllIlllIIIllllllIlIllll) {
        return llllllllllllIlllIIIllllllIlIllll != 0;
    }
    
    @Override
    public void updatePlayerMoveState() {
        this.moveStrafe = 0.0f;
        this.moveForward = 0.0f;
        if (lIIIllIIlllIIlIl(this.gameSettings.keyBindForward.isKeyDown() ? 1 : 0)) {
            ++this.moveForward;
        }
        if (lIIIllIIlllIIlIl(this.gameSettings.keyBindBack.isKeyDown() ? 1 : 0)) {
            --this.moveForward;
        }
        if (lIIIllIIlllIIlIl(this.gameSettings.keyBindLeft.isKeyDown() ? 1 : 0)) {
            ++this.moveStrafe;
        }
        if (lIIIllIIlllIIlIl(this.gameSettings.keyBindRight.isKeyDown() ? 1 : 0)) {
            --this.moveStrafe;
        }
        this.jump = this.gameSettings.keyBindJump.isKeyDown();
        this.sneak = this.gameSettings.keyBindSneak.isKeyDown();
        if (lIIIllIIlllIIlIl(this.sneak ? 1 : 0)) {
            this.moveStrafe *= (float)0.3;
            this.moveForward *= (float)0.3;
        }
    }
    
    public MovementInputFromOptions(final GameSettings llllllllllllIlllIIIllllllIllIlII) {
        this.gameSettings = llllllllllllIlllIIIllllllIllIlII;
    }
}
