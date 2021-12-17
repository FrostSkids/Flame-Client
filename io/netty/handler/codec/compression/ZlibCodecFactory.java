// 
// Decompiled by Procyon v0.5.36
// 

package io.netty.handler.codec.compression;

import java.nio.charset.StandardCharsets;
import java.util.Base64;
import io.netty.util.internal.PlatformDependent;
import io.netty.util.internal.SystemPropertyUtil;
import io.netty.util.internal.logging.InternalLoggerFactory;
import io.netty.util.internal.logging.InternalLogger;

public final class ZlibCodecFactory
{
    private static final /* synthetic */ boolean noJdkZlibDecoder;
    private static final /* synthetic */ int[] lIIlIIIIIllIII;
    private static final /* synthetic */ InternalLogger logger;
    private static final /* synthetic */ String[] lIIlIIIIIlIlll;
    
    private static boolean llIIlIIlIIlIlII(final int lllllllllllllIIlllIlllIllIlIlIlI, final int lllllllllllllIIlllIlllIllIlIlIIl) {
        return lllllllllllllIIlllIlllIllIlIlIlI < lllllllllllllIIlllIlllIllIlIlIIl;
    }
    
    static {
        llIIlIIlIIlIIll();
        llIIlIIlIIlIIlI();
        logger = InternalLoggerFactory.getInstance(ZlibCodecFactory.class);
        noJdkZlibDecoder = SystemPropertyUtil.getBoolean(ZlibCodecFactory.lIIlIIIIIlIlll[ZlibCodecFactory.lIIlIIIIIllIII[1]], (boolean)(ZlibCodecFactory.lIIlIIIIIllIII[2] != 0));
        ZlibCodecFactory.logger.debug(ZlibCodecFactory.lIIlIIIIIlIlll[ZlibCodecFactory.lIIlIIIIIllIII[2]], (Object)ZlibCodecFactory.noJdkZlibDecoder);
    }
    
    private static boolean llIIlIIlIIlIlIl(final int lllllllllllllIIlllIlllIllIlIlllI, final int lllllllllllllIIlllIlllIllIlIllIl) {
        return lllllllllllllIIlllIlllIllIlIlllI >= lllllllllllllIIlllIlllIllIlIllIl;
    }
    
    public static ZlibEncoder newZlibEncoder(final int lllllllllllllIIlllIlllIlllIlllll, final byte[] lllllllllllllIIlllIlllIllllIIIII) {
        if (llIIlIIlIIlIlII(PlatformDependent.javaVersion(), ZlibCodecFactory.lIIlIIIIIllIII[0])) {
            return new JZlibEncoder(lllllllllllllIIlllIlllIlllIlllll, lllllllllllllIIlllIlllIllllIIIII);
        }
        return new JdkZlibEncoder(lllllllllllllIIlllIlllIlllIlllll, lllllllllllllIIlllIlllIllllIIIII);
    }
    
    private static void llIIlIIlIIlIIlI() {
        (lIIlIIIIIlIlll = new String[ZlibCodecFactory.lIIlIIIIIllIII[3]])[ZlibCodecFactory.lIIlIIIIIllIII[1]] = llIIlIIlIIlIIIl("HgFfHQ0DGghdBhgkFRgyGwcTNw0UARUWGg==", "wnqsh");
        ZlibCodecFactory.lIIlIIIIIlIlll[ZlibCodecFactory.lIIlIIIIIllIII[2]] = llIIlIIlIIlIIIl("ZTw/FlwmHSINC2YWOTMWIyI6EBAMHTUWFi0KbFkJNQ==", "HxVyr");
    }
    
    private static String llIIlIIlIIlIIIl(String lllllllllllllIIlllIlllIllIlllIIl, final String lllllllllllllIIlllIlllIllIlllIII) {
        lllllllllllllIIlllIlllIllIlllIIl = new String(Base64.getDecoder().decode(lllllllllllllIIlllIlllIllIlllIIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIIlllIlllIllIllllII = new StringBuilder();
        final char[] lllllllllllllIIlllIlllIllIlllIll = lllllllllllllIIlllIlllIllIlllIII.toCharArray();
        int lllllllllllllIIlllIlllIllIlllIlI = ZlibCodecFactory.lIIlIIIIIllIII[1];
        final char lllllllllllllIIlllIlllIllIllIlII = (Object)lllllllllllllIIlllIlllIllIlllIIl.toCharArray();
        final short lllllllllllllIIlllIlllIllIllIIll = (short)lllllllllllllIIlllIlllIllIllIlII.length;
        boolean lllllllllllllIIlllIlllIllIllIIlI = ZlibCodecFactory.lIIlIIIIIllIII[1] != 0;
        while (llIIlIIlIIlIlII(lllllllllllllIIlllIlllIllIllIIlI ? 1 : 0, lllllllllllllIIlllIlllIllIllIIll)) {
            final char lllllllllllllIIlllIlllIllIllllll = lllllllllllllIIlllIlllIllIllIlII[lllllllllllllIIlllIlllIllIllIIlI];
            lllllllllllllIIlllIlllIllIllllII.append((char)(lllllllllllllIIlllIlllIllIllllll ^ lllllllllllllIIlllIlllIllIlllIll[lllllllllllllIIlllIlllIllIlllIlI % lllllllllllllIIlllIlllIllIlllIll.length]));
            "".length();
            ++lllllllllllllIIlllIlllIllIlllIlI;
            ++lllllllllllllIIlllIlllIllIllIIlI;
            "".length();
            if (" ".length() <= 0) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIIlllIlllIllIllllII);
    }
    
    public static ZlibEncoder newZlibEncoder(final ZlibWrapper lllllllllllllIIlllIlllIllllllIlI) {
        if (llIIlIIlIIlIlII(PlatformDependent.javaVersion(), ZlibCodecFactory.lIIlIIIIIllIII[0])) {
            return new JZlibEncoder(lllllllllllllIIlllIlllIllllllIlI);
        }
        return new JdkZlibEncoder(lllllllllllllIIlllIlllIllllllIlI);
    }
    
    public static ZlibEncoder newZlibEncoder(final ZlibWrapper lllllllllllllIIlllIlllIlllllIllI, final int lllllllllllllIIlllIlllIlllllIlIl) {
        if (llIIlIIlIIlIlII(PlatformDependent.javaVersion(), ZlibCodecFactory.lIIlIIIIIllIII[0])) {
            return new JZlibEncoder(lllllllllllllIIlllIlllIlllllIllI, lllllllllllllIIlllIlllIlllllIlIl);
        }
        return new JdkZlibEncoder(lllllllllllllIIlllIlllIlllllIllI, lllllllllllllIIlllIlllIlllllIlIl);
    }
    
    public static ZlibEncoder newZlibEncoder(final int lllllllllllllIIlllIlllIlllllllII) {
        if (llIIlIIlIIlIlII(PlatformDependent.javaVersion(), ZlibCodecFactory.lIIlIIIIIllIII[0])) {
            return new JZlibEncoder(lllllllllllllIIlllIlllIlllllllII);
        }
        return new JdkZlibEncoder(lllllllllllllIIlllIlllIlllllllII);
    }
    
    public static ZlibDecoder newZlibDecoder(final byte[] lllllllllllllIIlllIlllIlllIIllII) {
        if (!llIIlIIlIIlIlIl(PlatformDependent.javaVersion(), ZlibCodecFactory.lIIlIIIIIllIII[0]) || llIIlIIlIIlIllI(ZlibCodecFactory.noJdkZlibDecoder ? 1 : 0)) {
            return new JZlibDecoder(lllllllllllllIIlllIlllIlllIIllII);
        }
        return new JdkZlibDecoder(lllllllllllllIIlllIlllIlllIIllII);
    }
    
    public static ZlibEncoder newZlibEncoder(final int lllllllllllllIIlllIlllIlllIlIlIl, final int lllllllllllllIIlllIlllIlllIlIlII, final int lllllllllllllIIlllIlllIlllIlIlll, final byte[] lllllllllllllIIlllIlllIlllIlIIlI) {
        if (llIIlIIlIIlIlII(PlatformDependent.javaVersion(), ZlibCodecFactory.lIIlIIIIIllIII[0])) {
            return new JZlibEncoder(lllllllllllllIIlllIlllIlllIlIlIl, lllllllllllllIIlllIlllIlllIlIlII, lllllllllllllIIlllIlllIlllIlIlll, lllllllllllllIIlllIlllIlllIlIIlI);
        }
        return new JdkZlibEncoder(lllllllllllllIIlllIlllIlllIlIlIl, lllllllllllllIIlllIlllIlllIlIIlI);
    }
    
    public static ZlibEncoder newZlibEncoder(final byte[] lllllllllllllIIlllIlllIllllIIlIl) {
        if (llIIlIIlIIlIlII(PlatformDependent.javaVersion(), ZlibCodecFactory.lIIlIIIIIllIII[0])) {
            return new JZlibEncoder(lllllllllllllIIlllIlllIllllIIlIl);
        }
        return new JdkZlibEncoder(lllllllllllllIIlllIlllIllllIIlIl);
    }
    
    private static boolean llIIlIIlIIlIllI(final int lllllllllllllIIlllIlllIllIlIIlll) {
        return lllllllllllllIIlllIlllIllIlIIlll != 0;
    }
    
    private ZlibCodecFactory() {
    }
    
    public static ZlibDecoder newZlibDecoder(final ZlibWrapper lllllllllllllIIlllIlllIlllIlIIII) {
        if (!llIIlIIlIIlIlIl(PlatformDependent.javaVersion(), ZlibCodecFactory.lIIlIIIIIllIII[0]) || llIIlIIlIIlIllI(ZlibCodecFactory.noJdkZlibDecoder ? 1 : 0)) {
            return new JZlibDecoder(lllllllllllllIIlllIlllIlllIlIIII);
        }
        return new JdkZlibDecoder(lllllllllllllIIlllIlllIlllIlIIII);
    }
    
    public static ZlibEncoder newZlibEncoder(final ZlibWrapper lllllllllllllIIlllIlllIllllIlllI, final int lllllllllllllIIlllIlllIllllIlIIl, final int lllllllllllllIIlllIlllIllllIlIII, final int lllllllllllllIIlllIlllIllllIIlll) {
        if (llIIlIIlIIlIlII(PlatformDependent.javaVersion(), ZlibCodecFactory.lIIlIIIIIllIII[0])) {
            return new JZlibEncoder(lllllllllllllIIlllIlllIllllIlllI, lllllllllllllIIlllIlllIllllIlIIl, lllllllllllllIIlllIlllIllllIlIII, lllllllllllllIIlllIlllIllllIIlll);
        }
        return new JdkZlibEncoder(lllllllllllllIIlllIlllIllllIlllI, lllllllllllllIIlllIlllIllllIlIIl);
    }
    
    public static ZlibDecoder newZlibDecoder() {
        if (!llIIlIIlIIlIlIl(PlatformDependent.javaVersion(), ZlibCodecFactory.lIIlIIIIIllIII[0]) || llIIlIIlIIlIllI(ZlibCodecFactory.noJdkZlibDecoder ? 1 : 0)) {
            return new JZlibDecoder();
        }
        return new JdkZlibDecoder();
    }
    
    private static void llIIlIIlIIlIIll() {
        (lIIlIIIIIllIII = new int[4])[0] = (0xBF ^ 0xA3 ^ (0x47 ^ 0x5C));
        ZlibCodecFactory.lIIlIIIIIllIII[1] = ((0xF4 ^ 0xC5) & ~(0x36 ^ 0x7));
        ZlibCodecFactory.lIIlIIIIIllIII[2] = " ".length();
        ZlibCodecFactory.lIIlIIIIIllIII[3] = "  ".length();
    }
}
