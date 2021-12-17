// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.client.stream;

import tv.twitch.chat.ChatUserInfo;
import tv.twitch.ErrorCode;
import tv.twitch.broadcast.IngestServer;

public class NullStream implements IStream
{
    private final /* synthetic */ Throwable field_152938_a;
    private static final /* synthetic */ int[] lIIllIIllIllll;
    
    private static void llIlIlllllIIIIl() {
        (lIIllIIllIllll = new int[1])[0] = ((0x3 ^ 0x4D) & ~(0xC8 ^ 0x86));
    }
    
    @Override
    public IngestServerTester func_152932_y() {
        return null;
    }
    
    @Override
    public void func_152930_t() {
    }
    
    @Override
    public void func_152922_k() {
    }
    
    @Override
    public boolean func_152936_l() {
        return NullStream.lIIllIIllIllll[0] != 0;
    }
    
    @Override
    public boolean func_152927_B() {
        return NullStream.lIIllIIllIllll[0] != 0;
    }
    
    @Override
    public boolean func_152929_G() {
        return NullStream.lIIllIIllIllll[0] != 0;
    }
    
    public Throwable func_152937_a() {
        return this.field_152938_a;
    }
    
    @Override
    public int func_152920_A() {
        return NullStream.lIIllIIllIllll[0];
    }
    
    @Override
    public IngestServer[] func_152925_v() {
        return new IngestServer[NullStream.lIIllIIllIllll[0]];
    }
    
    static {
        llIlIlllllIIIIl();
    }
    
    @Override
    public void func_176026_a(final Metadata lllllllllllllIIlIlIllllIIIllIIII, final long lllllllllllllIIlIlIllllIIIlIllll, final long lllllllllllllIIlIlIllllIIIlIlllI) {
    }
    
    @Override
    public String func_152921_C() {
        return null;
    }
    
    @Override
    public boolean func_152928_D() {
        return NullStream.lIIllIIllIllll[0] != 0;
    }
    
    @Override
    public boolean isPaused() {
        return NullStream.lIIllIIllIllll[0] != 0;
    }
    
    @Override
    public void pause() {
    }
    
    @Override
    public void func_152917_b(final String lllllllllllllIIlIlIllllIIIIlllII) {
    }
    
    @Override
    public boolean func_152913_F() {
        return NullStream.lIIllIIllIllll[0] != 0;
    }
    
    @Override
    public void stopBroadcasting() {
    }
    
    @Override
    public boolean isReadyToBroadcast() {
        return NullStream.lIIllIIllIllll[0] != 0;
    }
    
    @Override
    public void unpause() {
    }
    
    @Override
    public void shutdownStream() {
    }
    
    @Override
    public void func_152911_a(final Metadata lllllllllllllIIlIlIllllIIIllIIll, final long lllllllllllllIIlIlIllllIIIllIIlI) {
    }
    
    public NullStream(final Throwable lllllllllllllIIlIlIllllIIIllllIl) {
        this.field_152938_a = lllllllllllllIIlIlIllllIIIllllIl;
    }
    
    @Override
    public ErrorCode func_152912_E() {
        return null;
    }
    
    @Override
    public void requestCommercial() {
    }
    
    @Override
    public void func_152935_j() {
    }
    
    @Override
    public void func_152909_x() {
    }
    
    @Override
    public AuthFailureReason func_152918_H() {
        return AuthFailureReason.ERROR;
    }
    
    @Override
    public void updateStreamVolume() {
    }
    
    @Override
    public void muteMicrophone(final boolean lllllllllllllIIlIlIllllIIIIlIlll) {
    }
    
    @Override
    public ChatUserInfo func_152926_a(final String lllllllllllllIIlIlIllllIIIIllllI) {
        return null;
    }
    
    @Override
    public boolean func_152908_z() {
        return NullStream.lIIllIIllIllll[0] != 0;
    }
    
    @Override
    public boolean isBroadcasting() {
        return NullStream.lIIllIIllIllll[0] != 0;
    }
}
