// 
// Decompiled by Procyon v0.5.36
// 

package io.netty.channel.local;

import io.netty.util.internal.PlatformDependent;
import io.netty.util.internal.StringUtil;
import io.netty.channel.ChannelException;
import java.net.SocketAddress;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import io.netty.channel.Channel;
import java.util.concurrent.ConcurrentMap;

final class LocalChannelRegistry
{
    private static final /* synthetic */ ConcurrentMap<LocalAddress, Channel> boundChannels;
    private static final /* synthetic */ String[] lIIlllIIllIIlI;
    private static final /* synthetic */ int[] lIIlllIIllIllI;
    
    private static String llIllIllIIIlIIl(final String lllllllllllllIIlIlIIIIIllllllIlI, final String lllllllllllllIIlIlIIIIIllllllIIl) {
        try {
            final SecretKeySpec lllllllllllllIIlIlIIIIIlllllllll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIIlIlIIIIIllllllIIl.getBytes(StandardCharsets.UTF_8)), LocalChannelRegistry.lIIlllIIllIllI[4]), "DES");
            final Cipher lllllllllllllIIlIlIIIIIllllllllI = Cipher.getInstance("DES");
            lllllllllllllIIlIlIIIIIllllllllI.init(LocalChannelRegistry.lIIlllIIllIllI[2], lllllllllllllIIlIlIIIIIlllllllll);
            return new String(lllllllllllllIIlIlIIIIIllllllllI.doFinal(Base64.getDecoder().decode(lllllllllllllIIlIlIIIIIllllllIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIlIlIIIIIlllllllIl) {
            lllllllllllllIIlIlIIIIIlllllllIl.printStackTrace();
            return null;
        }
    }
    
    private static boolean llIllIllIIlIIII(final int lllllllllllllIIlIlIIIIIlllllIIll) {
        return lllllllllllllIIlIlIIIIIlllllIIll != 0;
    }
    
    private static boolean llIllIllIIIllll(final int lllllllllllllIIlIlIIIIIlllllIIIl) {
        return lllllllllllllIIlIlIIIIIlllllIIIl == 0;
    }
    
    static void unregister(final LocalAddress lllllllllllllIIlIlIIIIlIIIIIlIII) {
        LocalChannelRegistry.boundChannels.remove(lllllllllllllIIlIlIIIIlIIIIIlIII);
        "".length();
    }
    
    static LocalAddress register(final Channel lllllllllllllIIlIlIIIIlIIIIlIIIl, final LocalAddress lllllllllllllIIlIlIIIIlIIIIlIIII, final SocketAddress lllllllllllllIIlIlIIIIlIIIIlIlII) {
        if (llIllIllIIIlllI(lllllllllllllIIlIlIIIIlIIIIlIIII)) {
            throw new ChannelException(LocalChannelRegistry.lIIlllIIllIIlI[LocalChannelRegistry.lIIlllIIllIllI[0]]);
        }
        if (llIllIllIIIllll((lllllllllllllIIlIlIIIIlIIIIlIlII instanceof LocalAddress) ? 1 : 0)) {
            throw new ChannelException(String.valueOf(new StringBuilder().append(LocalChannelRegistry.lIIlllIIllIIlI[LocalChannelRegistry.lIIlllIIllIllI[1]]).append(StringUtil.simpleClassName(lllllllllllllIIlIlIIIIlIIIIlIlII))));
        }
        LocalAddress lllllllllllllIIlIlIIIIlIIIIlIIll = (LocalAddress)lllllllllllllIIlIlIIIIlIIIIlIlII;
        if (llIllIllIIlIIII(LocalAddress.ANY.equals(lllllllllllllIIlIlIIIIlIIIIlIIll) ? 1 : 0)) {
            lllllllllllllIIlIlIIIIlIIIIlIIll = new LocalAddress(lllllllllllllIIlIlIIIIlIIIIlIIIl);
        }
        final Channel lllllllllllllIIlIlIIIIlIIIIlIIlI = LocalChannelRegistry.boundChannels.putIfAbsent(lllllllllllllIIlIlIIIIlIIIIlIIll, lllllllllllllIIlIlIIIIlIIIIlIIIl);
        if (llIllIllIIIlllI(lllllllllllllIIlIlIIIIlIIIIlIIlI)) {
            throw new ChannelException(String.valueOf(new StringBuilder().append(LocalChannelRegistry.lIIlllIIllIIlI[LocalChannelRegistry.lIIlllIIllIllI[2]]).append(lllllllllllllIIlIlIIIIlIIIIlIIlI)));
        }
        return lllllllllllllIIlIlIIIIlIIIIlIIll;
    }
    
    private LocalChannelRegistry() {
    }
    
    private static boolean llIllIllIIIlllI(final Object lllllllllllllIIlIlIIIIIlllllIlIl) {
        return lllllllllllllIIlIlIIIIIlllllIlIl != null;
    }
    
    static Channel get(final SocketAddress lllllllllllllIIlIlIIIIlIIIIIlIll) {
        return LocalChannelRegistry.boundChannels.get(lllllllllllllIIlIlIIIIlIIIIIlIll);
    }
    
    static {
        llIllIllIIIllIl();
        llIllIllIIIlIlI();
        boundChannels = PlatformDependent.newConcurrentHashMap();
    }
    
    private static void llIllIllIIIllIl() {
        (lIIlllIIllIllI = new int[5])[0] = ((133 + 136 - 52 + 12 ^ 175 + 39 - 205 + 183) & (0xEA ^ 0xC2 ^ (0x5 ^ 0x8) ^ -" ".length()));
        LocalChannelRegistry.lIIlllIIllIllI[1] = " ".length();
        LocalChannelRegistry.lIIlllIIllIllI[2] = "  ".length();
        LocalChannelRegistry.lIIlllIIllIllI[3] = "   ".length();
        LocalChannelRegistry.lIIlllIIllIllI[4] = (0xF0 ^ 0xBC ^ (0x23 ^ 0x67));
    }
    
    private static void llIllIllIIIlIlI() {
        (lIIlllIIllIIlI = new String[LocalChannelRegistry.lIIlllIIllIllI[3]])[LocalChannelRegistry.lIIlllIIllIllI[0]] = llIllIllIIIlIIl("eDYax57dQFbJ2vqOe8LL9Q==", "YBXzx");
        LocalChannelRegistry.lIIlllIIllIIlI[LocalChannelRegistry.lIIlllIIllIllI[1]] = llIllIllIIIlIIl("msKb6PnI5Kndyzv8n6Vo+/rws93vLg4HrvQ/pgfrwvQ=", "VpkSM");
        LocalChannelRegistry.lIIlllIIllIIlI[LocalChannelRegistry.lIIlllIIllIllI[2]] = llIllIllIIIlIIl("4AV2aHSnV2nHioBcmoM/5+Po27WyyaiuPfX/prKQbVY=", "wUtYI");
    }
}
