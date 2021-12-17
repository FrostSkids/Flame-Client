// 
// Decompiled by Procyon v0.5.36
// 

package io.netty.util;

import io.netty.util.internal.StringUtil;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.security.MessageDigest;
import io.netty.util.internal.logging.InternalLoggerFactory;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import io.netty.util.internal.logging.InternalLogger;

public final class ReferenceCountUtil
{
    private static final /* synthetic */ String[] lllIllIllIllll;
    private static final /* synthetic */ InternalLogger logger;
    private static final /* synthetic */ int[] lllIllIlllIIII;
    
    public static <T> T retain(final T llllllllllllIlIllIIIllIlIIlllIII, final int llllllllllllIlIllIIIllIlIIllIlll) {
        if (lIlIIlIlIIllIIlI((llllllllllllIlIllIIIllIlIIlllIII instanceof ReferenceCounted) ? 1 : 0)) {
            return (T)((ReferenceCounted)llllllllllllIlIllIIIllIlIIlllIII).retain(llllllllllllIlIllIIIllIlIIllIlll);
        }
        return llllllllllllIlIllIIIllIlIIlllIII;
    }
    
    private static boolean lIlIIlIlIIllIIll(final int llllllllllllIlIllIIIllIIlllIlIIl, final int llllllllllllIlIllIIIllIIlllIlIII) {
        return llllllllllllIlIllIIIllIIlllIlIIl < llllllllllllIlIllIIIllIIlllIlIII;
    }
    
    private static void lIlIIlIlIIllIIIl() {
        (lllIllIlllIIII = new int[5])[0] = ((0x80 ^ 0xA0) & ~(0xAE ^ 0x8E));
        ReferenceCountUtil.lllIllIlllIIII[1] = " ".length();
        ReferenceCountUtil.lllIllIlllIIII[2] = "   ".length();
        ReferenceCountUtil.lllIllIlllIIII[3] = "  ".length();
        ReferenceCountUtil.lllIllIlllIIII[4] = (81 + 112 - 98 + 71 ^ 104 + 152 - 227 + 145);
    }
    
    public static <T> T releaseLater(final T llllllllllllIlIllIIIllIlIIIlIlll, final int llllllllllllIlIllIIIllIlIIIlIlII) {
        if (lIlIIlIlIIllIIlI((llllllllllllIlIllIIIllIlIIIlIlll instanceof ReferenceCounted) ? 1 : 0)) {
            ThreadDeathWatcher.watch(Thread.currentThread(), new ReleasingTask((ReferenceCounted)llllllllllllIlIllIIIllIlIIIlIlll, llllllllllllIlIllIIIllIlIIIlIlII));
        }
        return llllllllllllIlIllIIIllIlIIIlIlll;
    }
    
    public static boolean release(final Object llllllllllllIlIllIIIllIlIIllIIll) {
        if (lIlIIlIlIIllIIlI((llllllllllllIlIllIIIllIlIIllIIll instanceof ReferenceCounted) ? 1 : 0)) {
            return ((ReferenceCounted)llllllllllllIlIllIIIllIlIIllIIll).release();
        }
        return ReferenceCountUtil.lllIllIlllIIII[0] != 0;
    }
    
    public static <T> T retain(final T llllllllllllIlIllIIIllIlIIllllII) {
        if (lIlIIlIlIIllIIlI((llllllllllllIlIllIIIllIlIIllllII instanceof ReferenceCounted) ? 1 : 0)) {
            return (T)((ReferenceCounted)llllllllllllIlIllIIIllIlIIllllII).retain();
        }
        return llllllllllllIlIllIIIllIlIIllllII;
    }
    
    private ReferenceCountUtil() {
    }
    
    private static boolean lIlIIlIlIIllIIlI(final int llllllllllllIlIllIIIllIIlllIIllI) {
        return llllllllllllIlIllIIIllIIlllIIllI != 0;
    }
    
    private static String lIlIIlIlIIlIllll(String llllllllllllIlIllIIIllIIllllIlII, final String llllllllllllIlIllIIIllIIlllllIII) {
        llllllllllllIlIllIIIllIIllllIlII = new String(Base64.getDecoder().decode(llllllllllllIlIllIIIllIIllllIlII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder llllllllllllIlIllIIIllIIllllIlll = new StringBuilder();
        final char[] llllllllllllIlIllIIIllIIllllIllI = llllllllllllIlIllIIIllIIlllllIII.toCharArray();
        int llllllllllllIlIllIIIllIIllllIlIl = ReferenceCountUtil.lllIllIlllIIII[0];
        final float llllllllllllIlIllIIIllIIlllIllll = (Object)llllllllllllIlIllIIIllIIllllIlII.toCharArray();
        final char llllllllllllIlIllIIIllIIlllIlllI = (char)llllllllllllIlIllIIIllIIlllIllll.length;
        boolean llllllllllllIlIllIIIllIIlllIllIl = ReferenceCountUtil.lllIllIlllIIII[0] != 0;
        while (lIlIIlIlIIllIIll(llllllllllllIlIllIIIllIIlllIllIl ? 1 : 0, llllllllllllIlIllIIIllIIlllIlllI)) {
            final char llllllllllllIlIllIIIllIIlllllIlI = llllllllllllIlIllIIIllIIlllIllll[llllllllllllIlIllIIIllIIlllIllIl];
            llllllllllllIlIllIIIllIIllllIlll.append((char)(llllllllllllIlIllIIIllIIlllllIlI ^ llllllllllllIlIllIIIllIIllllIllI[llllllllllllIlIllIIIllIIllllIlIl % llllllllllllIlIllIIIllIIllllIllI.length]));
            "".length();
            ++llllllllllllIlIllIIIllIIllllIlIl;
            ++llllllllllllIlIllIIIllIIlllIllIl;
            "".length();
            if (((0x98 ^ 0x84) & ~(0x9D ^ 0x81)) >= " ".length()) {
                return null;
            }
        }
        return String.valueOf(llllllllllllIlIllIIIllIIllllIlll);
    }
    
    public static boolean release(final Object llllllllllllIlIllIIIllIlIIlIllll, final int llllllllllllIlIllIIIllIlIIlIlllI) {
        if (lIlIIlIlIIllIIlI((llllllllllllIlIllIIIllIlIIlIllll instanceof ReferenceCounted) ? 1 : 0)) {
            return ((ReferenceCounted)llllllllllllIlIllIIIllIlIIlIllll).release(llllllllllllIlIllIIIllIlIIlIlllI);
        }
        return ReferenceCountUtil.lllIllIlllIIII[0] != 0;
    }
    
    public static void safeRelease(final Object llllllllllllIlIllIIIllIlIIlIIIIl, final int llllllllllllIlIllIIIllIlIIIllllI) {
        try {
            release(llllllllllllIlIllIIIllIlIIlIIIIl, llllllllllllIlIllIIIllIlIIIllllI);
            "".length();
            "".length();
            if ("  ".length() <= " ".length()) {
                return;
            }
        }
        catch (Throwable llllllllllllIlIllIIIllIlIIlIIIlI) {
            if (lIlIIlIlIIllIIlI(ReferenceCountUtil.logger.isWarnEnabled() ? 1 : 0)) {
                final InternalLogger logger = ReferenceCountUtil.logger;
                final String s = ReferenceCountUtil.lllIllIllIllll[ReferenceCountUtil.lllIllIlllIIII[1]];
                final Object[] array = new Object[ReferenceCountUtil.lllIllIlllIIII[2]];
                array[ReferenceCountUtil.lllIllIlllIIII[0]] = llllllllllllIlIllIIIllIlIIlIIIIl;
                array[ReferenceCountUtil.lllIllIlllIIII[1]] = llllllllllllIlIllIIIllIlIIIllllI;
                array[ReferenceCountUtil.lllIllIlllIIII[3]] = llllllllllllIlIllIIIllIlIIlIIIlI;
                logger.warn(s, array);
            }
        }
    }
    
    private static void lIlIIlIlIIllIIII() {
        (lllIllIllIllll = new String[ReferenceCountUtil.lllIllIlllIIII[3]])[ReferenceCountUtil.lllIllIlllIIII[0]] = lIlIIlIlIIlIllIl("4sKqGK8kbFLmU3G1/z51TLsl6+vJUZBJnHoLwnv/gnc=", "ggZrn");
        ReferenceCountUtil.lllIllIllIllll[ReferenceCountUtil.lllIllIlllIIII[1]] = lIlIIlIlIIlIllll("NRshPBUXWjw/UAEfJDURAB9oMVAeHzsjERQfcnALDlpgNBUQCC09FR0OcnALDlM=", "szHPp");
    }
    
    public static void safeRelease(final Object llllllllllllIlIllIIIllIlIIlIIlll) {
        try {
            release(llllllllllllIlIllIIIllIlIIlIIlll);
            "".length();
            "".length();
            if (-" ".length() == "  ".length()) {
                return;
            }
        }
        catch (Throwable llllllllllllIlIllIIIllIlIIlIlIIl) {
            ReferenceCountUtil.logger.warn(ReferenceCountUtil.lllIllIllIllll[ReferenceCountUtil.lllIllIlllIIII[0]], llllllllllllIlIllIIIllIlIIlIIlll, llllllllllllIlIllIIIllIlIIlIlIIl);
        }
    }
    
    public static <T> T releaseLater(final T llllllllllllIlIllIIIllIlIIIllIlI) {
        return releaseLater(llllllllllllIlIllIIIllIlIIIllIlI, ReferenceCountUtil.lllIllIlllIIII[1]);
    }
    
    static {
        lIlIIlIlIIllIIIl();
        lIlIIlIlIIllIIII();
        logger = InternalLoggerFactory.getInstance(ReferenceCountUtil.class);
    }
    
    private static String lIlIIlIlIIlIllIl(final String llllllllllllIlIllIIIllIlIIIIIlll, final String llllllllllllIlIllIIIllIlIIIIIllI) {
        try {
            final SecretKeySpec llllllllllllIlIllIIIllIlIIIIllII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIlIllIIIllIlIIIIIllI.getBytes(StandardCharsets.UTF_8)), ReferenceCountUtil.lllIllIlllIIII[4]), "DES");
            final Cipher llllllllllllIlIllIIIllIlIIIIlIll = Cipher.getInstance("DES");
            llllllllllllIlIllIIIllIlIIIIlIll.init(ReferenceCountUtil.lllIllIlllIIII[3], llllllllllllIlIllIIIllIlIIIIllII);
            return new String(llllllllllllIlIllIIIllIlIIIIlIll.doFinal(Base64.getDecoder().decode(llllllllllllIlIllIIIllIlIIIIIlll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIlIllIIIllIlIIIIlIlI) {
            llllllllllllIlIllIIIllIlIIIIlIlI.printStackTrace();
            return null;
        }
    }
    
    private static final class ReleasingTask implements Runnable
    {
        private static final /* synthetic */ String[] llIllllllllIIl;
        private final /* synthetic */ ReferenceCounted obj;
        private static final /* synthetic */ int[] llIllllllllIll;
        private final /* synthetic */ int decrement;
        
        private static String lIIllIlllIlIIIlI(final String llllllllllllIllIIIlIlIIIllIIIIlI, final String llllllllllllIllIIIlIlIIIllIIIIll) {
            try {
                final SecretKeySpec llllllllllllIllIIIlIlIIIllIIIlll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIllIIIlIlIIIllIIIIll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
                final Cipher llllllllllllIllIIIlIlIIIllIIIllI = Cipher.getInstance("Blowfish");
                llllllllllllIllIIIlIlIIIllIIIllI.init(ReleasingTask.llIllllllllIll[2], llllllllllllIllIIIlIlIIIllIIIlll);
                return new String(llllllllllllIllIIIlIlIIIllIIIllI.doFinal(Base64.getDecoder().decode(llllllllllllIllIIIlIlIIIllIIIIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
            }
            catch (Exception llllllllllllIllIIIlIlIIIllIIIlIl) {
                llllllllllllIllIIIlIlIIIllIIIlIl.printStackTrace();
                return null;
            }
        }
        
        @Override
        public String toString() {
            return String.valueOf(new StringBuilder().append(StringUtil.simpleClassName(this.obj)).append(ReleasingTask.llIllllllllIIl[ReleasingTask.llIllllllllIll[3]]).append(this.decrement).append(ReleasingTask.llIllllllllIIl[ReleasingTask.llIllllllllIll[4]]).append(this.obj.refCnt()));
        }
        
        static {
            lIIllIlllIlIlIIl();
            lIIllIlllIlIIlII();
        }
        
        ReleasingTask(final ReferenceCounted llllllllllllIllIIIlIlIIIllIllIIl, final int llllllllllllIllIIIlIlIIIllIlIlIl) {
            this.obj = llllllllllllIllIIIlIlIIIllIllIIl;
            this.decrement = llllllllllllIllIIIlIlIIIllIlIlIl;
        }
        
        private static void lIIllIlllIlIlIIl() {
            (llIllllllllIll = new int[7])[0] = ((0x7B ^ 0x69 ^ (0xA0 ^ 0x8A)) & (0x16 ^ 0x28 ^ (0x6E ^ 0x68) ^ -" ".length()));
            ReleasingTask.llIllllllllIll[1] = " ".length();
            ReleasingTask.llIllllllllIll[2] = "  ".length();
            ReleasingTask.llIllllllllIll[3] = "   ".length();
            ReleasingTask.llIllllllllIll[4] = (0x6B ^ 0x6F);
            ReleasingTask.llIllllllllIll[5] = (0x3D ^ 0x38);
            ReleasingTask.llIllllllllIll[6] = (0x99 ^ 0x91);
        }
        
        @Override
        public void run() {
            try {
                if (lIIllIlllIlIlIlI(this.obj.release(this.decrement) ? 1 : 0)) {
                    ReferenceCountUtil.logger.warn(ReleasingTask.llIllllllllIIl[ReleasingTask.llIllllllllIll[0]], this);
                    "".length();
                    if (null != null) {
                        return;
                    }
                }
                else {
                    ReferenceCountUtil.logger.debug(ReleasingTask.llIllllllllIIl[ReleasingTask.llIllllllllIll[1]], this);
                }
                "".length();
                if (-"   ".length() > 0) {
                    return;
                }
            }
            catch (Exception llllllllllllIllIIIlIlIIIllIlIIlI) {
                ReferenceCountUtil.logger.warn(ReleasingTask.llIllllllllIIl[ReleasingTask.llIllllllllIll[2]], this.obj, llllllllllllIllIIIlIlIIIllIlIIlI);
            }
        }
        
        private static void lIIllIlllIlIIlII() {
            (llIllllllllIIl = new String[ReleasingTask.llIllllllllIll[5]])[ReleasingTask.llIllllllllIll[0]] = lIIllIlllIlIIIlI("8aRK912lXOCaokypprpvPdyDQsKj5vYt", "WYzdp");
            ReleasingTask.llIllllllllIIl[ReleasingTask.llIllllllllIll[1]] = lIIllIlllIlIIIll("eKBEJzsbX86ccNP0B7uEug==", "IhNZW");
            ReleasingTask.llIllllllllIIl[ReleasingTask.llIllllllllIll[2]] = lIIllIlllIlIIIlI("TywNxEbhHDJA/CUfSq/A7zmWSzJBYfI3PdqLXxP4uGI=", "RxFKt");
            ReleasingTask.llIllllllllIIl[ReleasingTask.llIllllllllIll[3]] = lIIllIlllIlIIIll("ba2dJHNz3QjsF4lMqVnJQQ==", "gmBzG");
            ReleasingTask.llIllllllllIIl[ReleasingTask.llIllllllllIll[4]] = lIIllIlllIlIIIlI("yucOzQkmAcYfHafbTqPeyw==", "tsZbn");
        }
        
        private static String lIIllIlllIlIIIll(final String llllllllllllIllIIIlIlIIIlIllIlIl, final String llllllllllllIllIIIlIlIIIlIllIllI) {
            try {
                final SecretKeySpec llllllllllllIllIIIlIlIIIlIlllIlI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIllIIIlIlIIIlIllIllI.getBytes(StandardCharsets.UTF_8)), ReleasingTask.llIllllllllIll[6]), "DES");
                final Cipher llllllllllllIllIIIlIlIIIlIlllIIl = Cipher.getInstance("DES");
                llllllllllllIllIIIlIlIIIlIlllIIl.init(ReleasingTask.llIllllllllIll[2], llllllllllllIllIIIlIlIIIlIlllIlI);
                return new String(llllllllllllIllIIIlIlIIIlIlllIIl.doFinal(Base64.getDecoder().decode(llllllllllllIllIIIlIlIIIlIllIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
            }
            catch (Exception llllllllllllIllIIIlIlIIIlIlllIII) {
                llllllllllllIllIIIlIlIIIlIlllIII.printStackTrace();
                return null;
            }
        }
        
        private static boolean lIIllIlllIlIlIlI(final int llllllllllllIllIIIlIlIIIlIllIIII) {
            return llllllllllllIllIIIlIlIIIlIllIIII == 0;
        }
    }
}
