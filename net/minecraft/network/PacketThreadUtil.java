// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.network;

import net.minecraft.util.IThreadListener;

public class PacketThreadUtil
{
    private static boolean lIlIIIIIIlIIIlll(final int llllllllllllIlIllllIIIIIllIlIllI) {
        return llllllllllllIlIllllIIIIIllIlIllI == 0;
    }
    
    public static <T extends INetHandler> void checkThreadAndEnqueue(final Packet<T> llllllllllllIlIllllIIIIIllIlllIl, final T llllllllllllIlIllllIIIIIllIllIIl, final IThreadListener llllllllllllIlIllllIIIIIllIllIII) throws ThreadQuickExitException {
        if (lIlIIIIIIlIIIlll(llllllllllllIlIllllIIIIIllIllIII.isCallingFromMinecraftThread() ? 1 : 0)) {
            llllllllllllIlIllllIIIIIllIllIII.addScheduledTask(new Runnable() {
                @Override
                public void run() {
                    llllllllllllIlIllllIIIIIllIlllIl.processPacket(llllllllllllIlIllllIIIIIllIllIIl);
                }
            });
            "".length();
            throw ThreadQuickExitException.field_179886_a;
        }
    }
}
