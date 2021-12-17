// 
// Decompiled by Procyon v0.5.36
// 

package io.netty.util.internal;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.lang.reflect.Method;
import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import io.netty.util.internal.logging.InternalLoggerFactory;
import java.security.AccessController;
import java.security.PrivilegedAction;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import sun.misc.Unsafe;
import io.netty.util.internal.logging.InternalLogger;

final class PlatformDependent0
{
    private static final /* synthetic */ String[] llllIlllllIlI;
    private static final /* synthetic */ long ADDRESS_FIELD_OFFSET;
    private static final /* synthetic */ boolean BIG_ENDIAN;
    private static final /* synthetic */ InternalLogger logger;
    private static final /* synthetic */ Unsafe UNSAFE;
    private static final /* synthetic */ boolean UNALIGNED;
    private static final /* synthetic */ int[] lllllIIIlIIll;
    
    private static boolean lIlIllIlIIIlIII(final Object lllllllllllllIlIllIIIIlIlIIIlIll, final Object lllllllllllllIlIllIIIIlIlIIIlIlI) {
        return lllllllllllllIlIllIIIIlIlIIIlIll == lllllllllllllIlIllIIIIlIlIIIlIlI;
    }
    
    static Object getObject(final Object lllllllllllllIlIllIIIIllIllIIIIl, final long lllllllllllllIlIllIIIIllIllIIIII) {
        return PlatformDependent0.UNSAFE.getObject(lllllllllllllIlIllIIIIllIllIIIIl, lllllllllllllIlIllIIIIllIllIIIII);
    }
    
    static long getLong(final long lllllllllllllIlIllIIIIllIIlllllI) {
        if (lIlIllIlIIIIIIl(PlatformDependent0.UNALIGNED ? 1 : 0)) {
            return PlatformDependent0.UNSAFE.getLong(lllllllllllllIlIllIIIIllIIlllllI);
        }
        if (lIlIllIlIIIIIIl(PlatformDependent0.BIG_ENDIAN ? 1 : 0)) {
            return (long)getByte(lllllllllllllIlIllIIIIllIIlllllI) << PlatformDependent0.lllllIIIlIIll[6] | ((long)getByte(lllllllllllllIlIllIIIIllIIlllllI + 1L) & 0xFFL) << PlatformDependent0.lllllIIIlIIll[7] | ((long)getByte(lllllllllllllIlIllIIIIllIIlllllI + 2L) & 0xFFL) << PlatformDependent0.lllllIIIlIIll[8] | ((long)getByte(lllllllllllllIlIllIIIIllIIlllllI + 3L) & 0xFFL) << PlatformDependent0.lllllIIIlIIll[9] | ((long)getByte(lllllllllllllIlIllIIIIllIIlllllI + 4L) & 0xFFL) << PlatformDependent0.lllllIIIlIIll[4] | ((long)getByte(lllllllllllllIlIllIIIIllIIlllllI + 5L) & 0xFFL) << PlatformDependent0.lllllIIIlIIll[5] | ((long)getByte(lllllllllllllIlIllIIIIllIIlllllI + 6L) & 0xFFL) << PlatformDependent0.lllllIIIlIIll[2] | ((long)getByte(lllllllllllllIlIllIIIIllIIlllllI + 7L) & 0xFFL);
        }
        return (long)getByte(lllllllllllllIlIllIIIIllIIlllllI + 7L) << PlatformDependent0.lllllIIIlIIll[6] | ((long)getByte(lllllllllllllIlIllIIIIllIIlllllI + 6L) & 0xFFL) << PlatformDependent0.lllllIIIlIIll[7] | ((long)getByte(lllllllllllllIlIllIIIIllIIlllllI + 5L) & 0xFFL) << PlatformDependent0.lllllIIIlIIll[8] | ((long)getByte(lllllllllllllIlIllIIIIllIIlllllI + 4L) & 0xFFL) << PlatformDependent0.lllllIIIlIIll[9] | ((long)getByte(lllllllllllllIlIllIIIIllIIlllllI + 3L) & 0xFFL) << PlatformDependent0.lllllIIIlIIll[4] | ((long)getByte(lllllllllllllIlIllIIIIllIIlllllI + 2L) & 0xFFL) << PlatformDependent0.lllllIIIlIIll[5] | ((long)getByte(lllllllllllllIlIllIIIIllIIlllllI + 1L) & 0xFFL) << PlatformDependent0.lllllIIIlIIll[2] | ((long)getByte(lllllllllllllIlIllIIIIllIIlllllI) & 0xFFL);
    }
    
    static int getInt(final Object lllllllllllllIlIllIIIIllIlIlIIll, final long lllllllllllllIlIllIIIIllIlIlIlII) {
        return PlatformDependent0.UNSAFE.getInt(lllllllllllllIlIllIIIIllIlIlIIll, lllllllllllllIlIllIIIIllIlIlIlII);
    }
    
    private static void lIlIllIIlIlIIll() {
        (llllIlllllIlI = new String[PlatformDependent0.lllllIIIlIIll[24]])[PlatformDependent0.lllllIIIlIIll[1]] = lIlIllIIlIIllIl("rQ/AOoVRHhA=", "NmLWZ");
        PlatformDependent0.llllIlllllIlI[PlatformDependent0.lllllIIIlIIll[0]] = lIlIllIIlIIllIl("RlD6ngt2wxp48llhMrmlA/t2SjQ0PH5cy14pspkt2gY=", "GbvPy");
        PlatformDependent0.llllIlllllIlI[PlatformDependent0.lllllIIIlIIll[10]] = lIlIllIIlIIlllI("MCM4GDUwNzUU", "QUYqY");
        PlatformDependent0.llllIlllllIlI[PlatformDependent0.lllllIIIlIIll[11]] = lIlIllIIlIIlllI("NiorITQqKCs1OSY=", "CDJWU");
        PlatformDependent0.llllIlllllIlI[PlatformDependent0.lllllIIIlIIll[12]] = lIlIllIIlIIllll("WsI9usltp2gU+th6AowhMQ==", "cTvAE");
        PlatformDependent0.llllIlllllIlI[PlatformDependent0.lllllIIIlIIll[13]] = lIlIllIIlIIlllI("EiUmfQ4IIyt9Ng8jKTUGTyQgNjYPIyk1BltwMy4=", "aPHSc");
        PlatformDependent0.llllIlllllIlI[PlatformDependent0.lllllIIIlIIll[14]] = lIlIllIIlIIllIl("+YMvYWwo+YKm9W9nwOwaoQ==", "mlnAf");
        PlatformDependent0.llllIlllllIlI[PlatformDependent0.lllllIIIlIIll[15]] = lIlIllIIlIIllIl("lJfeZVLB/CKQeEIea5QWMw==", "PkOvy");
        PlatformDependent0.llllIlllllIlI[PlatformDependent0.lllllIIIlIIll[2]] = lIlIllIIlIIllll("sly0ym3ogQni8/0Jjc67/w==", "cQfJE");
        PlatformDependent0.llllIlllllIlI[PlatformDependent0.lllllIIIlIIll[16]] = lIlIllIIlIIlllI("BCwIXx4eKgVfJhkqBxcWWToJAQo6PAseAQ5jRhAFFjAKEBEbPA==", "wYfqs");
        PlatformDependent0.llllIlllllIlI[PlatformDependent0.lllllIIIlIIll[17]] = lIlIllIIlIIlllI("ASIPfTQbJAJ9DBwkADU8XDQOIyA/Mgw8KwttQSY3EyEAOjUTNQ02", "rWaSY");
        PlatformDependent0.llllIlllllIlI[PlatformDependent0.lllllIIIlIIll[18]] = lIlIllIIlIIlllI("ADIvSQ4aNCJJNh00IAEGXSQuFxo+IiwIEQp9YRINEjEgDg8SJS0C", "sGAgc");
        PlatformDependent0.llllIlllllIlI[PlatformDependent0.lllllIIIlIIll[19]] = lIlIllIIlIIllll("6MBCUURU2tZJrfZT03mCLg==", "KnQVo");
        PlatformDependent0.llllIlllllIlI[PlatformDependent0.lllllIIIlIIll[20]] = lIlIllIIlIIllIl("W72YN7ASf5jqgAg5ycERHw==", "lPAWM");
        PlatformDependent0.llllIlllllIlI[PlatformDependent0.lllllIIIlIIll[21]] = lIlIllIIlIIllll("HMtmHIuzopM=", "jxIZz");
        PlatformDependent0.llllIlllllIlI[PlatformDependent0.lllllIIIlIIll[22]] = lIlIllIIlIIllIl("T9h8JpOqnBI=", "aAKmy");
        PlatformDependent0.llllIlllllIlI[PlatformDependent0.lllllIIIlIIll[5]] = lIlIllIIlIIllll("HBQF7YxtwG7dS6IHBqxEVKM6h94GDuok5ip0qS3LwKL784uf1TJvHQ==", "IhoCZ");
        PlatformDependent0.llllIlllllIlI[PlatformDependent0.lllllIIIlIIll[23]] = lIlIllIIlIIlllI("Gg4zCH0eBipHERkbNkcmHg4pADQeCiFTcwsS", "poEiS");
    }
    
    private static boolean lIlIllIlIIIIllI(final Object lllllllllllllIlIllIIIIlIlIIIlIII) {
        return lllllllllllllIlIllIIIIlIlIIIlIII == null;
    }
    
    private static int lIlIllIlIIIIlll(final long n, final long n2) {
        return lcmp(n, n2);
    }
    
    static long allocateMemory(final long lllllllllllllIlIllIIIIlIlllIIllI) {
        return PlatformDependent0.UNSAFE.allocateMemory(lllllllllllllIlIllIIIIlIlllIIllI);
    }
    
    private static String lIlIllIIlIIllIl(final String lllllllllllllIlIllIIIIlIlIIllIIl, final String lllllllllllllIlIllIIIIlIlIIllIII) {
        try {
            final SecretKeySpec lllllllllllllIlIllIIIIlIlIIlllII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIlIllIIIIlIlIIllIII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lllllllllllllIlIllIIIIlIlIIllIll = Cipher.getInstance("Blowfish");
            lllllllllllllIlIllIIIIlIlIIllIll.init(PlatformDependent0.lllllIIIlIIll[10], lllllllllllllIlIllIIIIlIlIIlllII);
            return new String(lllllllllllllIlIllIIIIlIlIIllIll.doFinal(Base64.getDecoder().decode(lllllllllllllIlIllIIIIlIlIIllIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIlIllIIIIlIlIIllIlI) {
            lllllllllllllIlIllIIIIlIlIIllIlI.printStackTrace();
            return null;
        }
    }
    
    static <T> AtomicLongFieldUpdater<T> newAtomicLongFieldUpdater(final Class<?> lllllllllllllIlIllIIIIlIlllIllIl, final String lllllllllllllIlIllIIIIlIlllIllII) throws Exception {
        return new UnsafeAtomicLongFieldUpdater<T>(PlatformDependent0.UNSAFE, lllllllllllllIlIllIIIIlIlllIllIl, lllllllllllllIlIllIIIIlIlllIllII);
    }
    
    static long arrayBaseOffset() {
        return PlatformDependent0.UNSAFE.arrayBaseOffset(byte[].class);
    }
    
    private static long getLong(final Object lllllllllllllIlIllIIIIllIlIIllIl, final long lllllllllllllIlIllIIIIllIlIIllII) {
        return PlatformDependent0.UNSAFE.getLong(lllllllllllllIlIllIIIIllIlIIllIl, lllllllllllllIlIllIIIIllIlIIllII);
    }
    
    static void throwException(final Throwable lllllllllllllIlIllIIIIllIllIlIlI) {
        PlatformDependent0.UNSAFE.throwException(lllllllllllllIlIllIIIIllIllIlIlI);
    }
    
    private PlatformDependent0() {
    }
    
    static ClassLoader getSystemClassLoader() {
        if (lIlIllIlIIIIllI(System.getSecurityManager())) {
            return ClassLoader.getSystemClassLoader();
        }
        return AccessController.doPrivileged((PrivilegedAction<ClassLoader>)new PrivilegedAction<ClassLoader>() {
            @Override
            public ClassLoader run() {
                return ClassLoader.getSystemClassLoader();
            }
        });
    }
    
    static {
        lIlIllIIllllllI();
        lIlIllIIlIlIIll();
        logger = InternalLoggerFactory.getInstance(PlatformDependent0.class);
        int big_ENDIAN;
        if (lIlIllIlIIIlIII(ByteOrder.nativeOrder(), ByteOrder.BIG_ENDIAN)) {
            big_ENDIAN = PlatformDependent0.lllllIIIlIIll[0];
            "".length();
            if (" ".length() > "   ".length()) {
                return;
            }
        }
        else {
            big_ENDIAN = PlatformDependent0.lllllIIIlIIll[1];
        }
        BIG_ENDIAN = (big_ENDIAN != 0);
        final ByteBuffer lllllllllllllIlIllIIIIlIllIIlllI = ByteBuffer.allocateDirect(PlatformDependent0.lllllIIIlIIll[0]);
        Field lllllllllllllIlIllIIIIlIllIIllIl;
        try {
            lllllllllllllIlIllIIIIlIllIIllIl = Buffer.class.getDeclaredField(PlatformDependent0.llllIlllllIlI[PlatformDependent0.lllllIIIlIIll[1]]);
            lllllllllllllIlIllIIIIlIllIIllIl.setAccessible((boolean)(PlatformDependent0.lllllIIIlIIll[0] != 0));
            if (lIlIllIlIIIIIIl(lIlIllIlIIIIlll(lllllllllllllIlIllIIIIlIllIIllIl.getLong(ByteBuffer.allocate(PlatformDependent0.lllllIIIlIIll[0])), 0L))) {
                lllllllllllllIlIllIIIIlIllIIllIl = null;
                "".length();
                if ((105 + 56 - 97 + 85 ^ 80 + 58 - 50 + 57) < 0) {
                    return;
                }
            }
            else if (lIlIllIlIIIlIIl(lIlIllIlIIIIlll(lllllllllllllIlIllIIIIlIllIIllIl.getLong(lllllllllllllIlIllIIIIlIllIIlllI), 0L))) {
                lllllllllllllIlIllIIIIlIllIIllIl = null;
            }
            "".length();
            if (null != null) {
                return;
            }
        }
        catch (Throwable lllllllllllllIlIllIIIIlIllIllIIl) {
            lllllllllllllIlIllIIIIlIllIIllIl = null;
        }
        final InternalLogger logger2 = PlatformDependent0.logger;
        final String s = PlatformDependent0.llllIlllllIlI[PlatformDependent0.lllllIIIlIIll[0]];
        String s2;
        if (lIlIllIIlllllll(lllllllllllllIlIllIIIIlIllIIllIl)) {
            s2 = PlatformDependent0.llllIlllllIlI[PlatformDependent0.lllllIIIlIIll[10]];
            "".length();
            if (" ".length() < 0) {
                return;
            }
        }
        else {
            s2 = PlatformDependent0.llllIlllllIlI[PlatformDependent0.lllllIIIlIIll[11]];
        }
        logger2.debug(s, s2);
        final Unsafe lllllllllllllIlIllIIIIlIllIIllII;
        Label_0608: {
            if (lIlIllIIlllllll(lllllllllllllIlIllIIIIlIllIIllIl)) {
                try {
                    final Field lllllllllllllIlIllIIIIlIllIlIllI = Unsafe.class.getDeclaredField(PlatformDependent0.llllIlllllIlI[PlatformDependent0.lllllIIIlIIll[12]]);
                    lllllllllllllIlIllIIIIlIllIlIllI.setAccessible((boolean)(PlatformDependent0.lllllIIIlIIll[0] != 0));
                    final Unsafe lllllllllllllIlIllIIIIlIllIlIlII = (Unsafe)lllllllllllllIlIllIIIIlIllIlIllI.get(null);
                    final InternalLogger logger3 = PlatformDependent0.logger;
                    final String s3 = PlatformDependent0.llllIlllllIlI[PlatformDependent0.lllllIIIlIIll[13]];
                    String s4;
                    if (lIlIllIIlllllll(lllllllllllllIlIllIIIIlIllIlIlII)) {
                        s4 = PlatformDependent0.llllIlllllIlI[PlatformDependent0.lllllIIIlIIll[14]];
                        "".length();
                        if ("  ".length() < 0) {
                            return;
                        }
                    }
                    else {
                        s4 = PlatformDependent0.llllIlllllIlI[PlatformDependent0.lllllIIIlIIll[15]];
                    }
                    logger3.debug(s3, s4);
                    try {
                        if (lIlIllIIlllllll(lllllllllllllIlIllIIIIlIllIlIlII)) {
                            final Class<? extends Unsafe> class1 = lllllllllllllIlIllIIIIlIllIlIlII.getClass();
                            final String name = PlatformDependent0.llllIlllllIlI[PlatformDependent0.lllllIIIlIIll[2]];
                            final Class[] parameterTypes = new Class[PlatformDependent0.lllllIIIlIIll[13]];
                            parameterTypes[PlatformDependent0.lllllIIIlIIll[1]] = Object.class;
                            parameterTypes[PlatformDependent0.lllllIIIlIIll[0]] = Long.TYPE;
                            parameterTypes[PlatformDependent0.lllllIIIlIIll[10]] = Object.class;
                            parameterTypes[PlatformDependent0.lllllIIIlIIll[11]] = Long.TYPE;
                            parameterTypes[PlatformDependent0.lllllIIIlIIll[12]] = Long.TYPE;
                            class1.getDeclaredMethod(name, (Class<?>[])parameterTypes);
                            "".length();
                            PlatformDependent0.logger.debug(PlatformDependent0.llllIlllllIlI[PlatformDependent0.lllllIIIlIIll[16]]);
                        }
                        "".length();
                        if (((0xF1 ^ 0xAC) & ~(0xA ^ 0x57)) > "   ".length()) {
                            return;
                        }
                    }
                    catch (NoSuchMethodError lllllllllllllIlIllIIIIlIllIllIII) {
                        PlatformDependent0.logger.debug(PlatformDependent0.llllIlllllIlI[PlatformDependent0.lllllIIIlIIll[17]]);
                        throw lllllllllllllIlIllIIIIlIllIllIII;
                    }
                    catch (NoSuchMethodException lllllllllllllIlIllIIIIlIllIlIlll) {
                        PlatformDependent0.logger.debug(PlatformDependent0.llllIlllllIlI[PlatformDependent0.lllllIIIlIIll[18]]);
                        throw lllllllllllllIlIllIIIIlIllIlIlll;
                    }
                    "".length();
                    if ((0x30 ^ 0x5C ^ (0x66 ^ 0xF)) <= 0) {
                        return;
                    }
                    break Label_0608;
                }
                catch (Throwable lllllllllllllIlIllIIIIlIllIlIlIl) {
                    final Unsafe lllllllllllllIlIllIIIIlIllIlIlII = null;
                    "".length();
                    if ((32 + 7 + 83 + 23 ^ 3 + 80 - 68 + 134) < (0xC ^ 0x1E ^ (0x53 ^ 0x45))) {
                        return;
                    }
                    break Label_0608;
                }
            }
            lllllllllllllIlIllIIIIlIllIIllII = null;
        }
        UNSAFE = lllllllllllllIlIllIIIIlIllIIllII;
        if (lIlIllIlIIIIllI(lllllllllllllIlIllIIIIlIllIIllII)) {
            ADDRESS_FIELD_OFFSET = -1L;
            UNALIGNED = (PlatformDependent0.lllllIIIlIIll[1] != 0);
            "".length();
            if (((0x51 ^ 0x19) & ~(0x18 ^ 0x50)) != ((0x14 ^ 0x48) & ~(0x3A ^ 0x66))) {
                return;
            }
        }
        else {
            ADDRESS_FIELD_OFFSET = objectFieldOffset(lllllllllllllIlIllIIIIlIllIIllIl);
            boolean lllllllllllllIlIllIIIIlIllIIllll;
            try {
                final Class<?> lllllllllllllIlIllIIIIlIllIlIIll = Class.forName(PlatformDependent0.llllIlllllIlI[PlatformDependent0.lllllIIIlIIll[19]], (boolean)(PlatformDependent0.lllllIIIlIIll[1] != 0), ClassLoader.getSystemClassLoader());
                final Method lllllllllllllIlIllIIIIlIllIlIIlI = lllllllllllllIlIllIIIIlIllIlIIll.getDeclaredMethod(PlatformDependent0.llllIlllllIlI[PlatformDependent0.lllllIIIlIIll[20]], (Class<?>[])new Class[PlatformDependent0.lllllIIIlIIll[1]]);
                lllllllllllllIlIllIIIIlIllIlIIlI.setAccessible((boolean)(PlatformDependent0.lllllIIIlIIll[0] != 0));
                lllllllllllllIlIllIIIIlIllIIllll = Boolean.TRUE.equals(lllllllllllllIlIllIIIIlIllIlIIlI.invoke(null, new Object[PlatformDependent0.lllllIIIlIIll[1]]));
                "".length();
                if (null != null) {
                    return;
                }
            }
            catch (Throwable lllllllllllllIlIllIIIIlIllIlIIII) {
                final String lllllllllllllIlIllIIIIlIllIlIIIl = SystemPropertyUtil.get(PlatformDependent0.llllIlllllIlI[PlatformDependent0.lllllIIIlIIll[21]], PlatformDependent0.llllIlllllIlI[PlatformDependent0.lllllIIIlIIll[22]]);
                lllllllllllllIlIllIIIIlIllIIllll = lllllllllllllIlIllIIIIlIllIlIIIl.matches(PlatformDependent0.llllIlllllIlI[PlatformDependent0.lllllIIIlIIll[5]]);
            }
            UNALIGNED = lllllllllllllIlIllIIIIlIllIIllll;
            PlatformDependent0.logger.debug(PlatformDependent0.llllIlllllIlI[PlatformDependent0.lllllIIIlIIll[23]], (Object)PlatformDependent0.UNALIGNED);
        }
    }
    
    static <T> AtomicIntegerFieldUpdater<T> newAtomicIntegerFieldUpdater(final Class<?> lllllllllllllIlIllIIIIlIllllIlIl, final String lllllllllllllIlIllIIIIlIllllIIlI) throws Exception {
        return new UnsafeAtomicIntegerFieldUpdater<T>(PlatformDependent0.UNSAFE, lllllllllllllIlIllIIIIlIllllIlIl, lllllllllllllIlIllIIIIlIllllIIlI);
    }
    
    private static int lIlIllIlIIIIlII(final long n, final long n2) {
        return lcmp(n, n2);
    }
    
    static short getShort(final long lllllllllllllIlIllIIIIllIlIIIIll) {
        if (lIlIllIlIIIIIIl(PlatformDependent0.UNALIGNED ? 1 : 0)) {
            return PlatformDependent0.UNSAFE.getShort(lllllllllllllIlIllIIIIllIlIIIIll);
        }
        if (lIlIllIlIIIIIIl(PlatformDependent0.BIG_ENDIAN ? 1 : 0)) {
            return (short)(getByte(lllllllllllllIlIllIIIIllIlIIIIll) << PlatformDependent0.lllllIIIlIIll[2] | (getByte(lllllllllllllIlIllIIIIllIlIIIIll + 1L) & PlatformDependent0.lllllIIIlIIll[3]));
        }
        return (short)(getByte(lllllllllllllIlIllIIIIllIlIIIIll + 1L) << PlatformDependent0.lllllIIIlIIll[2] | (getByte(lllllllllllllIlIllIIIIllIlIIIIll) & PlatformDependent0.lllllIIIlIIll[3]));
    }
    
    private static String lIlIllIIlIIlllI(String lllllllllllllIlIllIIIIlIlIllIllI, final String lllllllllllllIlIllIIIIlIlIlllIlI) {
        lllllllllllllIlIllIIIIlIlIllIllI = (boolean)new String(Base64.getDecoder().decode(((String)lllllllllllllIlIllIIIIlIlIllIllI).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIlIllIIIIlIlIlllIIl = new StringBuilder();
        final char[] lllllllllllllIlIllIIIIlIlIlllIII = lllllllllllllIlIllIIIIlIlIlllIlI.toCharArray();
        int lllllllllllllIlIllIIIIlIlIllIlll = PlatformDependent0.lllllIIIlIIll[1];
        final int lllllllllllllIlIllIIIIlIlIllIIIl = (Object)((String)lllllllllllllIlIllIIIIlIlIllIllI).toCharArray();
        final double lllllllllllllIlIllIIIIlIlIllIIII = lllllllllllllIlIllIIIIlIlIllIIIl.length;
        byte lllllllllllllIlIllIIIIlIlIlIllll = (byte)PlatformDependent0.lllllIIIlIIll[1];
        while (lIlIllIlIIIlIlI(lllllllllllllIlIllIIIIlIlIlIllll, (int)lllllllllllllIlIllIIIIlIlIllIIII)) {
            final char lllllllllllllIlIllIIIIlIlIllllII = lllllllllllllIlIllIIIIlIlIllIIIl[lllllllllllllIlIllIIIIlIlIlIllll];
            lllllllllllllIlIllIIIIlIlIlllIIl.append((char)(lllllllllllllIlIllIIIIlIlIllllII ^ lllllllllllllIlIllIIIIlIlIlllIII[lllllllllllllIlIllIIIIlIlIllIlll % lllllllllllllIlIllIIIIlIlIlllIII.length]));
            "".length();
            ++lllllllllllllIlIllIIIIlIlIllIlll;
            ++lllllllllllllIlIllIIIIlIlIlIllll;
            "".length();
            if (null != null) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIlIllIIIIlIlIlllIIl);
    }
    
    private static boolean lIlIllIlIIIlIIl(final int lllllllllllllIlIllIIIIlIlIIIIlII) {
        return lllllllllllllIlIllIIIIlIlIIIIlII == 0;
    }
    
    private static int lIlIllIlIIIIIlI(final long n, final long n2) {
        return lcmp(n, n2);
    }
    
    static void freeMemory(final long lllllllllllllIlIllIIIIlIlllIIIll) {
        PlatformDependent0.UNSAFE.freeMemory(lllllllllllllIlIllIIIIlIlllIIIll);
    }
    
    private static String lIlIllIIlIIllll(final String lllllllllllllIlIllIIIIlIlIlIIllI, final String lllllllllllllIlIllIIIIlIlIlIIIll) {
        try {
            final SecretKeySpec lllllllllllllIlIllIIIIlIlIlIlIIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIlIllIIIIlIlIlIIIll.getBytes(StandardCharsets.UTF_8)), PlatformDependent0.lllllIIIlIIll[2]), "DES");
            final Cipher lllllllllllllIlIllIIIIlIlIlIlIII = Cipher.getInstance("DES");
            lllllllllllllIlIllIIIIlIlIlIlIII.init(PlatformDependent0.lllllIIIlIIll[10], lllllllllllllIlIllIIIIlIlIlIlIIl);
            return new String(lllllllllllllIlIllIIIIlIlIlIlIII.doFinal(Base64.getDecoder().decode(lllllllllllllIlIllIIIIlIlIlIIllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIlIllIIIIlIlIlIIlll) {
            lllllllllllllIlIllIIIIlIlIlIIlll.printStackTrace();
            return null;
        }
    }
    
    static void putShort(final long lllllllllllllIlIllIIIIllIIlIlIIl, final short lllllllllllllIlIllIIIIllIIlIlIII) {
        if (lIlIllIlIIIIIIl(PlatformDependent0.UNALIGNED ? 1 : 0)) {
            PlatformDependent0.UNSAFE.putShort(lllllllllllllIlIllIIIIllIIlIlIIl, lllllllllllllIlIllIIIIllIIlIlIII);
            "".length();
            if (-(110 + 41 - 6 + 14 ^ 154 + 42 - 45 + 4) > 0) {
                return;
            }
        }
        else if (lIlIllIlIIIIIIl(PlatformDependent0.BIG_ENDIAN ? 1 : 0)) {
            putByte(lllllllllllllIlIllIIIIllIIlIlIIl, (byte)(lllllllllllllIlIllIIIIllIIlIlIII >>> PlatformDependent0.lllllIIIlIIll[2]));
            putByte(lllllllllllllIlIllIIIIllIIlIlIIl + 1L, (byte)lllllllllllllIlIllIIIIllIIlIlIII);
            "".length();
            if (-"  ".length() > 0) {
                return;
            }
        }
        else {
            putByte(lllllllllllllIlIllIIIIllIIlIlIIl + 1L, (byte)(lllllllllllllIlIllIIIIllIIlIlIII >>> PlatformDependent0.lllllIIIlIIll[2]));
            putByte(lllllllllllllIlIllIIIIllIIlIlIIl, (byte)lllllllllllllIlIllIIIIllIIlIlIII);
        }
    }
    
    static ClassLoader getContextClassLoader() {
        if (lIlIllIlIIIIllI(System.getSecurityManager())) {
            return Thread.currentThread().getContextClassLoader();
        }
        return AccessController.doPrivileged((PrivilegedAction<ClassLoader>)new PrivilegedAction<ClassLoader>() {
            @Override
            public ClassLoader run() {
                return Thread.currentThread().getContextClassLoader();
            }
        });
    }
    
    private static boolean lIlIllIlIIIIIll(final int lllllllllllllIlIllIIIIlIlIIIIIlI) {
        return lllllllllllllIlIllIIIIlIlIIIIIlI > 0;
    }
    
    static int addressSize() {
        return PlatformDependent0.UNSAFE.addressSize();
    }
    
    static void putInt(final long lllllllllllllIlIllIIIIllIIlIIlIl, final int lllllllllllllIlIllIIIIllIIlIIlII) {
        if (lIlIllIlIIIIIIl(PlatformDependent0.UNALIGNED ? 1 : 0)) {
            PlatformDependent0.UNSAFE.putInt(lllllllllllllIlIllIIIIllIIlIIlIl, lllllllllllllIlIllIIIIllIIlIIlII);
            "".length();
            if (null != null) {
                return;
            }
        }
        else if (lIlIllIlIIIIIIl(PlatformDependent0.BIG_ENDIAN ? 1 : 0)) {
            putByte(lllllllllllllIlIllIIIIllIIlIIlIl, (byte)(lllllllllllllIlIllIIIIllIIlIIlII >>> PlatformDependent0.lllllIIIlIIll[4]));
            putByte(lllllllllllllIlIllIIIIllIIlIIlIl + 1L, (byte)(lllllllllllllIlIllIIIIllIIlIIlII >>> PlatformDependent0.lllllIIIlIIll[5]));
            putByte(lllllllllllllIlIllIIIIllIIlIIlIl + 2L, (byte)(lllllllllllllIlIllIIIIllIIlIIlII >>> PlatformDependent0.lllllIIIlIIll[2]));
            putByte(lllllllllllllIlIllIIIIllIIlIIlIl + 3L, (byte)lllllllllllllIlIllIIIIllIIlIIlII);
            "".length();
            if (-" ".length() != -" ".length()) {
                return;
            }
        }
        else {
            putByte(lllllllllllllIlIllIIIIllIIlIIlIl + 3L, (byte)(lllllllllllllIlIllIIIIllIIlIIlII >>> PlatformDependent0.lllllIIIlIIll[4]));
            putByte(lllllllllllllIlIllIIIIllIIlIIlIl + 2L, (byte)(lllllllllllllIlIllIIIIllIIlIIlII >>> PlatformDependent0.lllllIIIlIIll[5]));
            putByte(lllllllllllllIlIllIIIIllIIlIIlIl + 1L, (byte)(lllllllllllllIlIllIIIIllIIlIIlII >>> PlatformDependent0.lllllIIIlIIll[2]));
            putByte(lllllllllllllIlIllIIIIllIIlIIlIl, (byte)lllllllllllllIlIllIIIIllIIlIIlII);
        }
    }
    
    private static boolean lIlIllIIlllllll(final Object lllllllllllllIlIllIIIIlIlIIIlllI) {
        return lllllllllllllIlIllIIIIlIlIIIlllI != null;
    }
    
    static byte getByte(final long lllllllllllllIlIllIIIIllIlIIIllI) {
        return PlatformDependent0.UNSAFE.getByte(lllllllllllllIlIllIIIIllIlIIIllI);
    }
    
    private static void lIlIllIIllllllI() {
        (lllllIIIlIIll = new int[25])[0] = " ".length();
        PlatformDependent0.lllllIIIlIIll[1] = ((0x16 ^ 0x8 ^ (0x1D ^ 0x9)) & (51 + 106 - 52 + 34 ^ 114 + 49 - 146 + 112 ^ -" ".length()));
        PlatformDependent0.lllllIIIlIIll[2] = (0x2 ^ 0x1E ^ (0x8B ^ 0x9F));
        PlatformDependent0.lllllIIIlIIll[3] = 125 + 3 + 27 + 100;
        PlatformDependent0.lllllIIIlIIll[4] = (0x9C ^ 0xC5 ^ (0x66 ^ 0x27));
        PlatformDependent0.lllllIIIlIIll[5] = (86 + 117 - 185 + 133 ^ 88 + 87 - 48 + 8);
        PlatformDependent0.lllllIIIlIIll[6] = (0x57 ^ 0x6F);
        PlatformDependent0.lllllIIIlIIll[7] = (0x1C ^ 0x2C);
        PlatformDependent0.lllllIIIlIIll[8] = (0x33 ^ 0x8 ^ (0x7F ^ 0x6C));
        PlatformDependent0.lllllIIIlIIll[9] = (0x28 ^ 0x8);
        PlatformDependent0.lllllIIIlIIll[10] = "  ".length();
        PlatformDependent0.lllllIIIlIIll[11] = "   ".length();
        PlatformDependent0.lllllIIIlIIll[12] = (0x2F ^ 0x26 ^ (0xBF ^ 0xB2));
        PlatformDependent0.lllllIIIlIIll[13] = (0xB ^ 0xE);
        PlatformDependent0.lllllIIIlIIll[14] = (0x15 ^ 0x34 ^ (0xA7 ^ 0x80));
        PlatformDependent0.lllllIIIlIIll[15] = (89 + 139 - 127 + 54 ^ 105 + 105 - 66 + 12);
        PlatformDependent0.lllllIIIlIIll[16] = (0xD8 ^ 0xA1 ^ (0x21 ^ 0x51));
        PlatformDependent0.lllllIIIlIIll[17] = (0x46 ^ 0x11 ^ (0x9C ^ 0xC1));
        PlatformDependent0.lllllIIIlIIll[18] = (0xB5 ^ 0xC3 ^ (0xF5 ^ 0x88));
        PlatformDependent0.lllllIIIlIIll[19] = (0xA0 ^ 0x86 ^ (0xB1 ^ 0x9B));
        PlatformDependent0.lllllIIIlIIll[20] = (0x1 ^ 0xC);
        PlatformDependent0.lllllIIIlIIll[21] = (0xF ^ 0x1);
        PlatformDependent0.lllllIIIlIIll[22] = (0x83 ^ 0x8C);
        PlatformDependent0.lllllIIIlIIll[23] = (0x8B ^ 0x9D ^ (0x3D ^ 0x3A));
        PlatformDependent0.lllllIIIlIIll[24] = (0x82 ^ 0x90);
    }
    
    static void copyMemory(long lllllllllllllIlIllIIIIllIIIlIIll, long lllllllllllllIlIllIIIIllIIIlIIlI, long lllllllllllllIlIllIIIIllIIIlIIIl) {
        while (lIlIllIlIIIIIll(lIlIllIlIIIIIlI(lllllllllllllIlIllIIIIllIIIlIIIl, 0L))) {
            final long lllllllllllllIlIllIIIIllIIIlIlll = Math.min(lllllllllllllIlIllIIIIllIIIlIIIl, 1048576L);
            PlatformDependent0.UNSAFE.copyMemory(lllllllllllllIlIllIIIIllIIIlIIll, lllllllllllllIlIllIIIIllIIIlIIlI, lllllllllllllIlIllIIIIllIIIlIlll);
            lllllllllllllIlIllIIIIllIIIlIIIl -= lllllllllllllIlIllIIIIllIIIlIlll;
            lllllllllllllIlIllIIIIllIIIlIIll += lllllllllllllIlIllIIIIllIIIlIlll;
            lllllllllllllIlIllIIIIllIIIlIIlI += lllllllllllllIlIllIIIIllIIIlIlll;
            "".length();
            if ("   ".length() <= " ".length()) {
                return;
            }
        }
    }
    
    static void freeDirectBuffer(final ByteBuffer lllllllllllllIlIllIIIIllIllIlIII) {
        Cleaner0.freeDirectBuffer(lllllllllllllIlIllIIIIllIllIlIII);
    }
    
    private static boolean lIlIllIlIIIlIlI(final int lllllllllllllIlIllIIIIlIlIIlIIIl, final int lllllllllllllIlIllIIIIlIlIIlIIII) {
        return lllllllllllllIlIllIIIIlIlIIlIIIl < lllllllllllllIlIllIIIIlIlIIlIIII;
    }
    
    static <U, W> AtomicReferenceFieldUpdater<U, W> newAtomicReferenceFieldUpdater(final Class<U> lllllllllllllIlIllIIIIlIlllllIIl, final String lllllllllllllIlIllIIIIlIlllllIlI) throws Exception {
        return new UnsafeAtomicReferenceFieldUpdater<U, W>(PlatformDependent0.UNSAFE, lllllllllllllIlIllIIIIlIlllllIIl, lllllllllllllIlIllIIIIlIlllllIlI);
    }
    
    static long directBufferAddress(final ByteBuffer lllllllllllllIlIllIIIIllIllIIlIl) {
        return getLong(lllllllllllllIlIllIIIIllIllIIlIl, PlatformDependent0.ADDRESS_FIELD_OFFSET);
    }
    
    static boolean hasUnsafe() {
        int n;
        if (lIlIllIIlllllll(PlatformDependent0.UNSAFE)) {
            n = PlatformDependent0.lllllIIIlIIll[0];
            "".length();
            if ("   ".length() < "   ".length()) {
                return ((0x15 ^ 0x76) & ~(0x11 ^ 0x72)) != 0x0;
            }
        }
        else {
            n = PlatformDependent0.lllllIIIlIIll[1];
        }
        return n != 0;
    }
    
    static void putByte(final long lllllllllllllIlIllIIIIllIIlIllll, final byte lllllllllllllIlIllIIIIllIIlIlllI) {
        PlatformDependent0.UNSAFE.putByte(lllllllllllllIlIllIIIIllIIlIllll, lllllllllllllIlIllIIIIllIIlIlllI);
    }
    
    static long objectFieldOffset(final Field lllllllllllllIlIllIIIIllIlIIlIIl) {
        return PlatformDependent0.UNSAFE.objectFieldOffset(lllllllllllllIlIllIIIIllIlIIlIIl);
    }
    
    static void copyMemory(final Object lllllllllllllIlIllIIIIllIIIIlIII, long lllllllllllllIlIllIIIIllIIIIIIlI, final Object lllllllllllllIlIllIIIIllIIIIIIIl, long lllllllllllllIlIllIIIIllIIIIIIII, long lllllllllllllIlIllIIIIlIllllllll) {
        while (lIlIllIlIIIIIll(lIlIllIlIIIIlII(lllllllllllllIlIllIIIIlIllllllll, 0L))) {
            final long lllllllllllllIlIllIIIIllIIIIlIIl = Math.min(lllllllllllllIlIllIIIIlIllllllll, 1048576L);
            PlatformDependent0.UNSAFE.copyMemory(lllllllllllllIlIllIIIIllIIIIlIII, lllllllllllllIlIllIIIIllIIIIIIlI, lllllllllllllIlIllIIIIllIIIIIIIl, lllllllllllllIlIllIIIIllIIIIIIII, lllllllllllllIlIllIIIIllIIIIlIIl);
            lllllllllllllIlIllIIIIlIllllllll -= lllllllllllllIlIllIIIIllIIIIlIIl;
            lllllllllllllIlIllIIIIllIIIIIIlI += lllllllllllllIlIllIIIIllIIIIlIIl;
            lllllllllllllIlIllIIIIllIIIIIIII += lllllllllllllIlIllIIIIllIIIIlIIl;
            "".length();
            if ("  ".length() < ((0xAF ^ 0xA8 ^ (0x84 ^ 0x8D)) & (99 + 123 - 211 + 123 ^ 20 + 116 - 84 + 84 ^ -" ".length()))) {
                return;
            }
        }
    }
    
    static int getInt(final long lllllllllllllIlIllIIIIllIlIIIIIl) {
        if (lIlIllIlIIIIIIl(PlatformDependent0.UNALIGNED ? 1 : 0)) {
            return PlatformDependent0.UNSAFE.getInt(lllllllllllllIlIllIIIIllIlIIIIIl);
        }
        if (lIlIllIlIIIIIIl(PlatformDependent0.BIG_ENDIAN ? 1 : 0)) {
            return getByte(lllllllllllllIlIllIIIIllIlIIIIIl) << PlatformDependent0.lllllIIIlIIll[4] | (getByte(lllllllllllllIlIllIIIIllIlIIIIIl + 1L) & PlatformDependent0.lllllIIIlIIll[3]) << PlatformDependent0.lllllIIIlIIll[5] | (getByte(lllllllllllllIlIllIIIIllIlIIIIIl + 2L) & PlatformDependent0.lllllIIIlIIll[3]) << PlatformDependent0.lllllIIIlIIll[2] | (getByte(lllllllllllllIlIllIIIIllIlIIIIIl + 3L) & PlatformDependent0.lllllIIIlIIll[3]);
        }
        return getByte(lllllllllllllIlIllIIIIllIlIIIIIl + 3L) << PlatformDependent0.lllllIIIlIIll[4] | (getByte(lllllllllllllIlIllIIIIllIlIIIIIl + 2L) & PlatformDependent0.lllllIIIlIIll[3]) << PlatformDependent0.lllllIIIlIIll[5] | (getByte(lllllllllllllIlIllIIIIllIlIIIIIl + 1L) & PlatformDependent0.lllllIIIlIIll[3]) << PlatformDependent0.lllllIIIlIIll[2] | (getByte(lllllllllllllIlIllIIIIllIlIIIIIl) & PlatformDependent0.lllllIIIlIIll[3]);
    }
    
    static void putOrderedObject(final Object lllllllllllllIlIllIIIIllIIllIllI, final long lllllllllllllIlIllIIIIllIIllIlIl, final Object lllllllllllllIlIllIIIIllIIllIlII) {
        PlatformDependent0.UNSAFE.putOrderedObject(lllllllllllllIlIllIIIIllIIllIllI, lllllllllllllIlIllIIIIllIIllIlIl, lllllllllllllIlIllIIIIllIIllIlII);
    }
    
    static Object getObjectVolatile(final Object lllllllllllllIlIllIIIIllIlIllIll, final long lllllllllllllIlIllIIIIllIlIllIII) {
        return PlatformDependent0.UNSAFE.getObjectVolatile(lllllllllllllIlIllIIIIllIlIllIll, lllllllllllllIlIllIIIIllIlIllIII);
    }
    
    private static boolean lIlIllIlIIIIIIl(final int lllllllllllllIlIllIIIIlIlIIIIllI) {
        return lllllllllllllIlIllIIIIlIlIIIIllI != 0;
    }
    
    static ClassLoader getClassLoader(final Class<?> lllllllllllllIlIllIIIIlIlllIlIIl) {
        if (lIlIllIlIIIIllI(System.getSecurityManager())) {
            return lllllllllllllIlIllIIIIlIlllIlIIl.getClassLoader();
        }
        return AccessController.doPrivileged((PrivilegedAction<ClassLoader>)new PrivilegedAction<ClassLoader>() {
            @Override
            public ClassLoader run() {
                return lllllllllllllIlIllIIIIlIlllIlIIl.getClassLoader();
            }
        });
    }
    
    static void putLong(final long lllllllllllllIlIllIIIIllIIIlllIl, final long lllllllllllllIlIllIIIIllIIIlllII) {
        if (lIlIllIlIIIIIIl(PlatformDependent0.UNALIGNED ? 1 : 0)) {
            PlatformDependent0.UNSAFE.putLong(lllllllllllllIlIllIIIIllIIIlllIl, lllllllllllllIlIllIIIIllIIIlllII);
            "".length();
            if ("   ".length() <= -" ".length()) {
                return;
            }
        }
        else if (lIlIllIlIIIIIIl(PlatformDependent0.BIG_ENDIAN ? 1 : 0)) {
            putByte(lllllllllllllIlIllIIIIllIIIlllIl, (byte)(lllllllllllllIlIllIIIIllIIIlllII >>> PlatformDependent0.lllllIIIlIIll[6]));
            putByte(lllllllllllllIlIllIIIIllIIIlllIl + 1L, (byte)(lllllllllllllIlIllIIIIllIIIlllII >>> PlatformDependent0.lllllIIIlIIll[7]));
            putByte(lllllllllllllIlIllIIIIllIIIlllIl + 2L, (byte)(lllllllllllllIlIllIIIIllIIIlllII >>> PlatformDependent0.lllllIIIlIIll[8]));
            putByte(lllllllllllllIlIllIIIIllIIIlllIl + 3L, (byte)(lllllllllllllIlIllIIIIllIIIlllII >>> PlatformDependent0.lllllIIIlIIll[9]));
            putByte(lllllllllllllIlIllIIIIllIIIlllIl + 4L, (byte)(lllllllllllllIlIllIIIIllIIIlllII >>> PlatformDependent0.lllllIIIlIIll[4]));
            putByte(lllllllllllllIlIllIIIIllIIIlllIl + 5L, (byte)(lllllllllllllIlIllIIIIllIIIlllII >>> PlatformDependent0.lllllIIIlIIll[5]));
            putByte(lllllllllllllIlIllIIIIllIIIlllIl + 6L, (byte)(lllllllllllllIlIllIIIIllIIIlllII >>> PlatformDependent0.lllllIIIlIIll[2]));
            putByte(lllllllllllllIlIllIIIIllIIIlllIl + 7L, (byte)lllllllllllllIlIllIIIIllIIIlllII);
            "".length();
            if (-" ".length() > " ".length()) {
                return;
            }
        }
        else {
            putByte(lllllllllllllIlIllIIIIllIIIlllIl + 7L, (byte)(lllllllllllllIlIllIIIIllIIIlllII >>> PlatformDependent0.lllllIIIlIIll[6]));
            putByte(lllllllllllllIlIllIIIIllIIIlllIl + 6L, (byte)(lllllllllllllIlIllIIIIllIIIlllII >>> PlatformDependent0.lllllIIIlIIll[7]));
            putByte(lllllllllllllIlIllIIIIllIIIlllIl + 5L, (byte)(lllllllllllllIlIllIIIIllIIIlllII >>> PlatformDependent0.lllllIIIlIIll[8]));
            putByte(lllllllllllllIlIllIIIIllIIIlllIl + 4L, (byte)(lllllllllllllIlIllIIIIllIIIlllII >>> PlatformDependent0.lllllIIIlIIll[9]));
            putByte(lllllllllllllIlIllIIIIllIIIlllIl + 3L, (byte)(lllllllllllllIlIllIIIIllIIIlllII >>> PlatformDependent0.lllllIIIlIIll[4]));
            putByte(lllllllllllllIlIllIIIIllIIIlllIl + 2L, (byte)(lllllllllllllIlIllIIIIllIIIlllII >>> PlatformDependent0.lllllIIIlIIll[5]));
            putByte(lllllllllllllIlIllIIIIllIIIlllIl + 1L, (byte)(lllllllllllllIlIllIIIIllIIIlllII >>> PlatformDependent0.lllllIIIlIIll[2]));
            putByte(lllllllllllllIlIllIIIIllIIIlllIl, (byte)lllllllllllllIlIllIIIIllIIIlllII);
        }
    }
}
