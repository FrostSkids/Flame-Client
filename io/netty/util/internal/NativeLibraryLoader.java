// 
// Decompiled by Procyon v0.5.36
// 

package io.netty.util.internal;

import java.util.Arrays;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.security.MessageDigest;
import java.io.OutputStream;
import java.io.InputStream;
import java.net.URL;
import java.io.IOException;
import java.io.FileOutputStream;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.Locale;
import io.netty.util.internal.logging.InternalLoggerFactory;
import java.io.File;
import io.netty.util.internal.logging.InternalLogger;

public final class NativeLibraryLoader
{
    private static final /* synthetic */ InternalLogger logger;
    private static final /* synthetic */ String[] lIIIIllllllIIl;
    private static final /* synthetic */ File WORKDIR;
    private static final /* synthetic */ String OSNAME;
    private static final /* synthetic */ int[] lIIIIllllllIlI;
    
    private static boolean isOSX() {
        int n;
        if (!lIllllIlIllIllI(NativeLibraryLoader.OSNAME.startsWith(NativeLibraryLoader.lIIIIllllllIIl[NativeLibraryLoader.lIIIIllllllIlI[22]]) ? 1 : 0) || lIllllIlIllIlII(NativeLibraryLoader.OSNAME.startsWith(NativeLibraryLoader.lIIIIllllllIIl[NativeLibraryLoader.lIIIIllllllIlI[23]]) ? 1 : 0)) {
            n = NativeLibraryLoader.lIIIIllllllIlI[1];
            "".length();
            if (((0xBD ^ 0x9C ^ (0xB5 ^ 0xAB)) & (((0x9D ^ 0x90) & ~(0x6C ^ 0x61)) ^ (0x7 ^ 0x38) ^ -" ".length())) > " ".length()) {
                return ((0x4D ^ 0x27 ^ (0xE0 ^ 0xA8)) & (0x24 ^ 0x18 ^ (0x9E ^ 0x80) ^ -" ".length())) != 0x0;
            }
        }
        else {
            n = NativeLibraryLoader.lIIIIllllllIlI[0];
        }
        return n != 0;
    }
    
    private NativeLibraryLoader() {
    }
    
    private static boolean lIllllIlIllIlII(final int lllllllllllllIlIIIlllIIIlIlIlllI) {
        return lllllllllllllIlIIIlllIIIlIlIlllI != 0;
    }
    
    private static File tmpdir() {
        try {
            File lllllllllllllIlIIIlllIIlIIllIlIl = toDirectory(SystemPropertyUtil.get(NativeLibraryLoader.lIIIIllllllIIl[NativeLibraryLoader.lIIIIllllllIlI[0]]));
            if (lIllllIlIllIIll(lllllllllllllIlIIIlllIIlIIllIlIl)) {
                NativeLibraryLoader.logger.debug(String.valueOf(new StringBuilder().append(NativeLibraryLoader.lIIIIllllllIIl[NativeLibraryLoader.lIIIIllllllIlI[1]]).append(lllllllllllllIlIIIlllIIlIIllIlIl)));
                return lllllllllllllIlIIIlllIIlIIllIlIl;
            }
            lllllllllllllIlIIIlllIIlIIllIlIl = toDirectory(SystemPropertyUtil.get(NativeLibraryLoader.lIIIIllllllIIl[NativeLibraryLoader.lIIIIllllllIlI[2]]));
            if (lIllllIlIllIIll(lllllllllllllIlIIIlllIIlIIllIlIl)) {
                NativeLibraryLoader.logger.debug(String.valueOf(new StringBuilder().append(NativeLibraryLoader.lIIIIllllllIIl[NativeLibraryLoader.lIIIIllllllIlI[3]]).append(lllllllllllllIlIIIlllIIlIIllIlIl).append(NativeLibraryLoader.lIIIIllllllIIl[NativeLibraryLoader.lIIIIllllllIlI[4]])));
                return lllllllllllllIlIIIlllIIlIIllIlIl;
            }
            if (lIllllIlIllIlII(isWindows() ? 1 : 0)) {
                lllllllllllllIlIIIlllIIlIIllIlIl = toDirectory(System.getenv(NativeLibraryLoader.lIIIIllllllIIl[NativeLibraryLoader.lIIIIllllllIlI[5]]));
                if (lIllllIlIllIIll(lllllllllllllIlIIIlllIIlIIllIlIl)) {
                    NativeLibraryLoader.logger.debug(String.valueOf(new StringBuilder().append(NativeLibraryLoader.lIIIIllllllIIl[NativeLibraryLoader.lIIIIllllllIlI[6]]).append(lllllllllllllIlIIIlllIIlIIllIlIl).append(NativeLibraryLoader.lIIIIllllllIIl[NativeLibraryLoader.lIIIIllllllIlI[7]])));
                    return lllllllllllllIlIIIlllIIlIIllIlIl;
                }
                final String lllllllllllllIlIIIlllIIlIIllIlll = System.getenv(NativeLibraryLoader.lIIIIllllllIIl[NativeLibraryLoader.lIIIIllllllIlI[8]]);
                if (lIllllIlIllIIll(lllllllllllllIlIIIlllIIlIIllIlll)) {
                    lllllllllllllIlIIIlllIIlIIllIlIl = toDirectory(String.valueOf(new StringBuilder().append(lllllllllllllIlIIIlllIIlIIllIlll).append(NativeLibraryLoader.lIIIIllllllIIl[NativeLibraryLoader.lIIIIllllllIlI[9]])));
                    if (lIllllIlIllIIll(lllllllllllllIlIIIlllIIlIIllIlIl)) {
                        NativeLibraryLoader.logger.debug(String.valueOf(new StringBuilder().append(NativeLibraryLoader.lIIIIllllllIIl[NativeLibraryLoader.lIIIIllllllIlI[10]]).append(lllllllllllllIlIIIlllIIlIIllIlIl).append(NativeLibraryLoader.lIIIIllllllIIl[NativeLibraryLoader.lIIIIllllllIlI[11]])));
                        return lllllllllllllIlIIIlllIIlIIllIlIl;
                    }
                    lllllllllllllIlIIIlllIIlIIllIlIl = toDirectory(String.valueOf(new StringBuilder().append(lllllllllllllIlIIIlllIIlIIllIlll).append(NativeLibraryLoader.lIIIIllllllIIl[NativeLibraryLoader.lIIIIllllllIlI[12]])));
                    if (lIllllIlIllIIll(lllllllllllllIlIIIlllIIlIIllIlIl)) {
                        NativeLibraryLoader.logger.debug(String.valueOf(new StringBuilder().append(NativeLibraryLoader.lIIIIllllllIIl[NativeLibraryLoader.lIIIIllllllIlI[13]]).append(lllllllllllllIlIIIlllIIlIIllIlIl).append(NativeLibraryLoader.lIIIIllllllIIl[NativeLibraryLoader.lIIIIllllllIlI[14]])));
                        return lllllllllllllIlIIIlllIIlIIllIlIl;
                    }
                }
                "".length();
                if (" ".length() <= ((0xD1 ^ 0xC4) & ~(0x93 ^ 0x86))) {
                    return null;
                }
            }
            else {
                lllllllllllllIlIIIlllIIlIIllIlIl = toDirectory(System.getenv(NativeLibraryLoader.lIIIIllllllIIl[NativeLibraryLoader.lIIIIllllllIlI[15]]));
                if (lIllllIlIllIIll(lllllllllllllIlIIIlllIIlIIllIlIl)) {
                    NativeLibraryLoader.logger.debug(String.valueOf(new StringBuilder().append(NativeLibraryLoader.lIIIIllllllIIl[NativeLibraryLoader.lIIIIllllllIlI[16]]).append(lllllllllllllIlIIIlllIIlIIllIlIl).append(NativeLibraryLoader.lIIIIllllllIIl[NativeLibraryLoader.lIIIIllllllIlI[17]])));
                    return lllllllllllllIlIIIlllIIlIIllIlIl;
                }
            }
            "".length();
            if (" ".length() == "  ".length()) {
                return null;
            }
        }
        catch (Exception ex) {}
        File lllllllllllllIlIIIlllIIlIIllIlII = null;
        if (lIllllIlIllIlII(isWindows() ? 1 : 0)) {
            final File lllllllllllllIlIIIlllIIlIIllIlIl = new File(NativeLibraryLoader.lIIIIllllllIIl[NativeLibraryLoader.lIIIIllllllIlI[18]]);
            "".length();
            if (((0x34 ^ 0x7D ^ (0x37 ^ 0x73)) & (0xC0 ^ 0x9E ^ (0x4 ^ 0x57) ^ -" ".length())) <= -" ".length()) {
                return null;
            }
        }
        else {
            lllllllllllllIlIIIlllIIlIIllIlII = new File(NativeLibraryLoader.lIIIIllllllIIl[NativeLibraryLoader.lIIIIllllllIlI[19]]);
        }
        NativeLibraryLoader.logger.warn(String.valueOf(new StringBuilder().append(NativeLibraryLoader.lIIIIllllllIIl[NativeLibraryLoader.lIIIIllllllIlI[20]]).append(lllllllllllllIlIIIlllIIlIIllIlII)));
        return lllllllllllllIlIIIlllIIlIIllIlII;
    }
    
    static {
        lIllllIlIllIIlI();
        lIllllIlIllIIIl();
        NATIVE_RESOURCE_HOME = NativeLibraryLoader.lIIIIllllllIIl[NativeLibraryLoader.lIIIIllllllIlI[33]];
        logger = InternalLoggerFactory.getInstance(NativeLibraryLoader.class);
        OSNAME = SystemPropertyUtil.get(NativeLibraryLoader.lIIIIllllllIIl[NativeLibraryLoader.lIIIIllllllIlI[34]], NativeLibraryLoader.lIIIIllllllIIl[NativeLibraryLoader.lIIIIllllllIlI[35]]).toLowerCase(Locale.US).replaceAll(NativeLibraryLoader.lIIIIllllllIIl[NativeLibraryLoader.lIIIIllllllIlI[36]], NativeLibraryLoader.lIIIIllllllIIl[NativeLibraryLoader.lIIIIllllllIlI[37]]);
        final String lllllllllllllIlIIIlllIIIlllIllIl = SystemPropertyUtil.get(NativeLibraryLoader.lIIIIllllllIIl[NativeLibraryLoader.lIIIIllllllIlI[38]]);
        if (lIllllIlIllIIll(lllllllllllllIlIIIlllIIIlllIllIl)) {
            File lllllllllllllIlIIIlllIIIlllIlllI = new File(lllllllllllllIlIIIlllIIIlllIllIl);
            lllllllllllllIlIIIlllIIIlllIlllI.mkdirs();
            "".length();
            try {
                lllllllllllllIlIIIlllIIIlllIlllI = lllllllllllllIlIIIlllIIIlllIlllI.getAbsoluteFile();
                "".length();
                if (null != null) {
                    return;
                }
            }
            catch (Exception ex) {}
            WORKDIR = lllllllllllllIlIIIlllIIIlllIlllI;
            NativeLibraryLoader.logger.debug(String.valueOf(new StringBuilder().append(NativeLibraryLoader.lIIIIllllllIIl[NativeLibraryLoader.lIIIIllllllIlI[39]]).append(NativeLibraryLoader.WORKDIR)));
            "".length();
            if ("  ".length() < -" ".length()) {
                return;
            }
        }
        else {
            WORKDIR = tmpdir();
            NativeLibraryLoader.logger.debug(String.valueOf(new StringBuilder().append(NativeLibraryLoader.lIIIIllllllIIl[NativeLibraryLoader.lIIIIllllllIlI[40]]).append(NativeLibraryLoader.WORKDIR).append(NativeLibraryLoader.lIIIIllllllIIl[NativeLibraryLoader.lIIIIllllllIlI[41]])));
        }
    }
    
    private static boolean isWindows() {
        return NativeLibraryLoader.OSNAME.startsWith(NativeLibraryLoader.lIIIIllllllIIl[NativeLibraryLoader.lIIIIllllllIlI[21]]);
    }
    
    private static boolean lIllllIlIllIlIl(final Object lllllllllllllIlIIIlllIIIlIllIIII) {
        return lllllllllllllIlIIIlllIIIlIllIIII == null;
    }
    
    private static String lIllllIlIllIIII(String lllllllllllllIlIIIlllIIIllIIIIII, final String lllllllllllllIlIIIlllIIIlIllllll) {
        lllllllllllllIlIIIlllIIIllIIIIII = (char)new String(Base64.getDecoder().decode(((String)lllllllllllllIlIIIlllIIIllIIIIII).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIlIIIlllIIIllIIIIll = new StringBuilder();
        final char[] lllllllllllllIlIIIlllIIIllIIIIlI = lllllllllllllIlIIIlllIIIlIllllll.toCharArray();
        int lllllllllllllIlIIIlllIIIllIIIIIl = NativeLibraryLoader.lIIIIllllllIlI[0];
        final char lllllllllllllIlIIIlllIIIlIlllIll = (Object)((String)lllllllllllllIlIIIlllIIIllIIIIII).toCharArray();
        final double lllllllllllllIlIIIlllIIIlIlllIlI = lllllllllllllIlIIIlllIIIlIlllIll.length;
        char lllllllllllllIlIIIlllIIIlIlllIIl = (char)NativeLibraryLoader.lIIIIllllllIlI[0];
        while (lIllllIlIlllIII(lllllllllllllIlIIIlllIIIlIlllIIl, (int)lllllllllllllIlIIIlllIIIlIlllIlI)) {
            final char lllllllllllllIlIIIlllIIIllIIIllI = lllllllllllllIlIIIlllIIIlIlllIll[lllllllllllllIlIIIlllIIIlIlllIIl];
            lllllllllllllIlIIIlllIIIllIIIIll.append((char)(lllllllllllllIlIIIlllIIIllIIIllI ^ lllllllllllllIlIIIlllIIIllIIIIlI[lllllllllllllIlIIIlllIIIllIIIIIl % lllllllllllllIlIIIlllIIIllIIIIlI.length]));
            "".length();
            ++lllllllllllllIlIIIlllIIIllIIIIIl;
            ++lllllllllllllIlIIIlllIIIlIlllIIl;
            "".length();
            if (null != null) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIlIIIlllIIIllIIIIll);
    }
    
    public static void load(final String lllllllllllllIlIIIlllIIlIIIIIlIl, final ClassLoader lllllllllllllIlIIIlllIIlIIIIIlII) {
        final String lllllllllllllIlIIIlllIIlIIIIllll = System.mapLibraryName(lllllllllllllIlIIIlllIIlIIIIIlIl);
        final String lllllllllllllIlIIIlllIIlIIIIlllI = String.valueOf(new StringBuilder().append(NativeLibraryLoader.lIIIIllllllIIl[NativeLibraryLoader.lIIIIllllllIlI[24]]).append(lllllllllllllIlIIIlllIIlIIIIllll));
        URL lllllllllllllIlIIIlllIIlIIIIllIl = lllllllllllllIlIIIlllIIlIIIIIlII.getResource(lllllllllllllIlIIIlllIIlIIIIlllI);
        if (lIllllIlIllIlIl(lllllllllllllIlIIIlllIIlIIIIllIl) && lIllllIlIllIlII(isOSX() ? 1 : 0)) {
            if (lIllllIlIllIlII(lllllllllllllIlIIIlllIIlIIIIlllI.endsWith(NativeLibraryLoader.lIIIIllllllIIl[NativeLibraryLoader.lIIIIllllllIlI[25]]) ? 1 : 0)) {
                lllllllllllllIlIIIlllIIlIIIIllIl = lllllllllllllIlIIIlllIIlIIIIIlII.getResource(String.valueOf(new StringBuilder().append(NativeLibraryLoader.lIIIIllllllIIl[NativeLibraryLoader.lIIIIllllllIlI[26]]).append(lllllllllllllIlIIIlllIIlIIIIIlIl).append(NativeLibraryLoader.lIIIIllllllIIl[NativeLibraryLoader.lIIIIllllllIlI[27]])));
                "".length();
                if (null != null) {
                    return;
                }
            }
            else {
                lllllllllllllIlIIIlllIIlIIIIllIl = lllllllllllllIlIIIlllIIlIIIIIlII.getResource(String.valueOf(new StringBuilder().append(NativeLibraryLoader.lIIIIllllllIIl[NativeLibraryLoader.lIIIIllllllIlI[28]]).append(lllllllllllllIlIIIlllIIlIIIIIlIl).append(NativeLibraryLoader.lIIIIllllllIIl[NativeLibraryLoader.lIIIIllllllIlI[29]])));
            }
        }
        if (lIllllIlIllIlIl(lllllllllllllIlIIIlllIIlIIIIllIl)) {
            System.loadLibrary(lllllllllllllIlIIIlllIIlIIIIIlIl);
            return;
        }
        final int lllllllllllllIlIIIlllIIlIIIIllII = lllllllllllllIlIIIlllIIlIIIIllll.lastIndexOf(NativeLibraryLoader.lIIIIllllllIlI[30]);
        final String lllllllllllllIlIIIlllIIlIIIIlIll = lllllllllllllIlIIIlllIIlIIIIllll.substring(NativeLibraryLoader.lIIIIllllllIlI[0], lllllllllllllIlIIIlllIIlIIIIllII);
        final String lllllllllllllIlIIIlllIIlIIIIlIlI = lllllllllllllIlIIIlllIIlIIIIllll.substring(lllllllllllllIlIIIlllIIlIIIIllII, lllllllllllllIlIIIlllIIlIIIIllll.length());
        InputStream lllllllllllllIlIIIlllIIlIIIIlIIl = null;
        OutputStream lllllllllllllIlIIIlllIIlIIIIlIII = null;
        File lllllllllllllIlIIIlllIIlIIIIIlll = null;
        boolean lllllllllllllIlIIIlllIIlIIIIIllI = NativeLibraryLoader.lIIIIllllllIlI[0] != 0;
        try {
            lllllllllllllIlIIIlllIIlIIIIIlll = File.createTempFile(lllllllllllllIlIIIlllIIlIIIIlIll, lllllllllllllIlIIIlllIIlIIIIlIlI, NativeLibraryLoader.WORKDIR);
            lllllllllllllIlIIIlllIIlIIIIlIIl = lllllllllllllIlIIIlllIIlIIIIllIl.openStream();
            lllllllllllllIlIIIlllIIlIIIIlIII = new FileOutputStream(lllllllllllllIlIIIlllIIlIIIIIlll);
            final byte[] lllllllllllllIlIIIlllIIlIIIllIII = new byte[NativeLibraryLoader.lIIIIllllllIlI[31]];
            int lllllllllllllIlIIIlllIIlIIIlIlll;
            while (lIllllIlIllIlll(lllllllllllllIlIIIlllIIlIIIlIlll = lllllllllllllIlIIIlllIIlIIIIlIIl.read(lllllllllllllIlIIIlllIIlIIIllIII))) {
                lllllllllllllIlIIIlllIIlIIIIlIII.write(lllllllllllllIlIIIlllIIlIIIllIII, NativeLibraryLoader.lIIIIllllllIlI[0], lllllllllllllIlIIIlllIIlIIIlIlll);
                "".length();
                if (" ".length() <= 0) {
                    return;
                }
            }
            lllllllllllllIlIIIlllIIlIIIIlIII.flush();
            lllllllllllllIlIIIlllIIlIIIIlIII.close();
            lllllllllllllIlIIIlllIIlIIIIlIII = null;
            System.load(lllllllllllllIlIIIlllIIlIIIIIlll.getPath());
            lllllllllllllIlIIIlllIIlIIIIIllI = (NativeLibraryLoader.lIIIIllllllIlI[1] != 0);
            if (lIllllIlIllIIll(lllllllllllllIlIIIlllIIlIIIIlIIl)) {
                try {
                    lllllllllllllIlIIIlllIIlIIIIlIIl.close();
                    "".length();
                    if ((0xA8 ^ 0xAD) == 0x0) {
                        return;
                    }
                }
                catch (IOException ex) {}
            }
            if (lIllllIlIllIIll(lllllllllllllIlIIIlllIIlIIIIlIII)) {
                try {
                    lllllllllllllIlIIIlllIIlIIIIlIII.close();
                    "".length();
                    if (" ".length() <= 0) {
                        return;
                    }
                }
                catch (IOException ex2) {}
            }
            if (lIllllIlIllIIll(lllllllllllllIlIIIlllIIlIIIIIlll)) {
                if (lIllllIlIllIlII(lllllllllllllIlIIIlllIIlIIIIIllI ? 1 : 0)) {
                    lllllllllllllIlIIIlllIIlIIIIIlll.deleteOnExit();
                    "".length();
                    if (null != null) {
                        return;
                    }
                }
                else if (lIllllIlIllIllI(lllllllllllllIlIIIlllIIlIIIIIlll.delete() ? 1 : 0)) {
                    lllllllllllllIlIIIlllIIlIIIIIlll.deleteOnExit();
                    "".length();
                    if (-(149 + 23 - 87 + 70 ^ 118 + 139 - 141 + 43) > 0) {
                        return;
                    }
                }
            }
        }
        catch (Exception lllllllllllllIlIIIlllIIlIIIlIlII) {
            throw (UnsatisfiedLinkError)new UnsatisfiedLinkError(String.valueOf(new StringBuilder().append(NativeLibraryLoader.lIIIIllllllIIl[NativeLibraryLoader.lIIIIllllllIlI[32]]).append(lllllllllllllIlIIIlllIIlIIIIIlIl))).initCause(lllllllllllllIlIIIlllIIlIIIlIlII);
        }
        finally {
            if (lIllllIlIllIIll(lllllllllllllIlIIIlllIIlIIIIlIIl)) {
                try {
                    lllllllllllllIlIIIlllIIlIIIIlIIl.close();
                    "".length();
                    if (((0xC4 ^ 0x9C) & ~(0xA ^ 0x52)) < 0) {
                        return;
                    }
                }
                catch (IOException ex3) {}
            }
            if (lIllllIlIllIIll(lllllllllllllIlIIIlllIIlIIIIlIII)) {
                try {
                    lllllllllllllIlIIIlllIIlIIIIlIII.close();
                    "".length();
                    if ((0x8F ^ 0x96 ^ (0x44 ^ 0x58)) == 0x0) {
                        return;
                    }
                }
                catch (IOException ex4) {}
            }
            if (lIllllIlIllIIll(lllllllllllllIlIIIlllIIlIIIIIlll)) {
                if (lIllllIlIllIlII(lllllllllllllIlIIIlllIIlIIIIIllI ? 1 : 0)) {
                    lllllllllllllIlIIIlllIIlIIIIIlll.deleteOnExit();
                    "".length();
                    if ((83 + 66 + 7 + 31 ^ 24 + 36 + 35 + 96) == 0x0) {
                        return;
                    }
                }
                else if (lIllllIlIllIllI(lllllllllllllIlIIIlllIIlIIIIIlll.delete() ? 1 : 0)) {
                    lllllllllllllIlIIIlllIIlIIIIIlll.deleteOnExit();
                }
            }
        }
    }
    
    private static String lIllllIlIlIllll(final String lllllllllllllIlIIIlllIIIllIlIlIl, final String lllllllllllllIlIIIlllIIIllIlIlII) {
        try {
            final SecretKeySpec lllllllllllllIlIIIlllIIIllIllIII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIlIIIlllIIIllIlIlII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lllllllllllllIlIIIlllIIIllIlIlll = Cipher.getInstance("Blowfish");
            lllllllllllllIlIIIlllIIIllIlIlll.init(NativeLibraryLoader.lIIIIllllllIlI[2], lllllllllllllIlIIIlllIIIllIllIII);
            return new String(lllllllllllllIlIIIlllIIIllIlIlll.doFinal(Base64.getDecoder().decode(lllllllllllllIlIIIlllIIIllIlIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIlIIIlllIIIllIlIllI) {
            lllllllllllllIlIIIlllIIIllIlIllI.printStackTrace();
            return null;
        }
    }
    
    private static File toDirectory(final String lllllllllllllIlIIIlllIIlIIlIlIll) {
        if (lIllllIlIllIlIl(lllllllllllllIlIIIlllIIlIIlIlIll)) {
            return null;
        }
        final File lllllllllllllIlIIIlllIIlIIlIllII = new File(lllllllllllllIlIIIlllIIlIIlIlIll);
        lllllllllllllIlIIIlllIIlIIlIllII.mkdirs();
        "".length();
        if (lIllllIlIllIllI(lllllllllllllIlIIIlllIIlIIlIllII.isDirectory() ? 1 : 0)) {
            return null;
        }
        try {
            return lllllllllllllIlIIIlllIIlIIlIllII.getAbsoluteFile();
        }
        catch (Exception lllllllllllllIlIIIlllIIlIIlIlllI) {
            return lllllllllllllIlIIIlllIIlIIlIllII;
        }
    }
    
    private static boolean lIllllIlIllIllI(final int lllllllllllllIlIIIlllIIIlIlIllII) {
        return lllllllllllllIlIIIlllIIIlIlIllII == 0;
    }
    
    private static String lIllllIlIlIlllI(final String lllllllllllllIlIIIlllIIIlllIIIII, final String lllllllllllllIlIIIlllIIIllIlllll) {
        try {
            final SecretKeySpec lllllllllllllIlIIIlllIIIlllIIlIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIlIIIlllIIIllIlllll.getBytes(StandardCharsets.UTF_8)), NativeLibraryLoader.lIIIIllllllIlI[8]), "DES");
            final Cipher lllllllllllllIlIIIlllIIIlllIIlII = Cipher.getInstance("DES");
            lllllllllllllIlIIIlllIIIlllIIlII.init(NativeLibraryLoader.lIIIIllllllIlI[2], lllllllllllllIlIIIlllIIIlllIIlIl);
            return new String(lllllllllllllIlIIIlllIIIlllIIlII.doFinal(Base64.getDecoder().decode(lllllllllllllIlIIIlllIIIlllIIIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIlIIIlllIIIlllIIIll) {
            lllllllllllllIlIIIlllIIIlllIIIll.printStackTrace();
            return null;
        }
    }
    
    private static void lIllllIlIllIIIl() {
        (lIIIIllllllIIl = new String[NativeLibraryLoader.lIIIIllllllIlI[42]])[NativeLibraryLoader.lIIIIllllllIlI[0]] = lIllllIlIlIlllI("QMnUmV37M7iQABfc8Mqr6A==", "durUf");
        NativeLibraryLoader.lIIIIllllllIIl[NativeLibraryLoader.lIIIIllllllIlI[1]] = lIllllIlIlIllll("ErkE+1iY2e2ME8aPdeHp+vQhLu5Pi8eY", "unObd");
        NativeLibraryLoader.lIIIIllllllIIl[NativeLibraryLoader.lIIIIllllllIlI[2]] = lIllllIlIllIIII("KTgdMFYqNkUlFTM9AiM=", "CYkQx");
        NativeLibraryLoader.lIIIIllllllIIl[NativeLibraryLoader.lIIIIllllllIlI[3]] = lIllllIlIlIlllI("uwN3l9TZBoyTzGGNc+cdaFtN+vsR+9sx", "LwLzV");
        NativeLibraryLoader.lIIIIllllllIIl[NativeLibraryLoader.lIIIIllllllIlI[4]] = lIllllIlIlIllll("jKTq25/TpRNLCzhgP7r2ha6kFE6gLA1A", "zkivx");
        NativeLibraryLoader.lIIIIllllllIIl[NativeLibraryLoader.lIIIIllllllIlI[5]] = lIllllIlIlIlllI("lRW/5ngyqOw=", "ogILa");
        NativeLibraryLoader.lIIIIllllllIIl[NativeLibraryLoader.lIIIIllllllIlI[6]] = lIllllIlIllIIII("ShInHUQJMzoGE0kiIwIODiR0Ug==", "gVNrj");
        NativeLibraryLoader.lIIIIllllllIIl[NativeLibraryLoader.lIIIIllllllIlI[7]] = lIllllIlIllIIII("UFt8ASk9I3x8", "psYUl");
        NativeLibraryLoader.lIIIIllllllIIl[NativeLibraryLoader.lIIIIllllllIlI[8]] = lIllllIlIllIIII("DTkuFyAKJS0MPB0=", "XjkEp");
        NativeLibraryLoader.lIIIIllllllIIl[NativeLibraryLoader.lIIIIllllllIlI[9]] = lIllllIlIlIlllI("BF1Cf8CrxwgQA+zL9ebFNAEWwndbncO/", "FaZBp");
        NativeLibraryLoader.lIIIIllllllIIl[NativeLibraryLoader.lIIIIllllllIlI[10]] = lIllllIlIllIIII("aQslDksqKjgVHGo7IREBLT12QQ==", "DOLae");
        NativeLibraryLoader.lIIIIllllllIIl[NativeLibraryLoader.lIIIIllllllIlI[11]] = lIllllIlIllIIII("ckxfFAQXNioTGBQtNgRyDiUKMRMzEBsdGz0HGy0LBgEXMX4=", "RdzAW");
        NativeLibraryLoader.lIIIIllllllIIl[NativeLibraryLoader.lIIIIllllllIlI[12]] = lIllllIlIlIllll("W2Nd+Pz85dlMsmQpqm05C79VS5xcBBSx", "CsaXs");
        NativeLibraryLoader.lIIIIllllllIIl[NativeLibraryLoader.lIIIIllllllIlI[13]] = lIllllIlIllIIII("ei8LAGM5DhYbNHkfDx8pPhlYTw==", "WkboM");
        NativeLibraryLoader.lIIIIllllllIIl[NativeLibraryLoader.lIIIIllllllIlI[14]] = lIllllIlIllIIII("UmN0Dzo3GQEIJjQCHR9MLgc+OQgeawI/HQYiPz0aLh80Nxlb", "rKQZi");
        NativeLibraryLoader.lIIIIllllllIIl[NativeLibraryLoader.lIIIIllllllIlI[15]] = lIllllIlIllIIII("BSkKNhkD", "QdZrP");
        NativeLibraryLoader.lIIIIllllllIIl[NativeLibraryLoader.lIIIIllllllIlI[16]] = lIllllIlIlIlllI("F3jin+pVbBRxdyLH6C3sAkgIlxiSihVK", "jTZGr");
        NativeLibraryLoader.lIIIIllllllIIl[NativeLibraryLoader.lIIIIllllllIlI[17]] = lIllllIlIlIlllI("oA5/PmJ6Z2Hiqs+6SiywqA==", "GdnAs");
        NativeLibraryLoader.lIIIIllllllIIl[NativeLibraryLoader.lIIIIllllllIlI[18]] = lIllllIlIlIllll("QBSDLmBvqx3HvXyVIvBp7g==", "WQVla");
        NativeLibraryLoader.lIIIIllllllIIl[NativeLibraryLoader.lIIIIllllllIlI[19]] = lIllllIlIllIIII("eTAGAw==", "VDksj");
        NativeLibraryLoader.lIIIIllllllIIl[NativeLibraryLoader.lIIIIllllllIlI[20]] = lIllllIlIlIlllI("BgjL0HDAayOl7gMSCckeWdejrHaT/Tdnia8+1UDyVR/k4qdnusLftU9Vdbwy0bPzU7dj+zqvY70zyT+048hgPw==", "CkUGm");
        NativeLibraryLoader.lIIIIllllllIIl[NativeLibraryLoader.lIIIIllllllIlI[21]] = lIllllIlIlIllll("g1XPEcpv9fs=", "aCmlG");
        NativeLibraryLoader.lIIIIllllllIIl[NativeLibraryLoader.lIIIIllllllIlI[22]] = lIllllIlIllIIII("DxsBCjEa", "bzbeB");
        NativeLibraryLoader.lIIIIllllllIIl[NativeLibraryLoader.lIIIIllllllIlI[23]] = lIllllIlIlIlllI("4S5hMMPjq90=", "vbytp");
        NativeLibraryLoader.lIIIIllllllIIl[NativeLibraryLoader.lIIIIllllllIlI[24]] = lIllllIlIllIIII("KQ0FCVQtBhdnFwU8OD4cSw==", "dHQHy");
        NativeLibraryLoader.lIIIIllllllIIl[NativeLibraryLoader.lIIIIllllllIlI[25]] = lIllllIlIlIllll("Rb1HVcs8ljQ=", "LHlJx");
        NativeLibraryLoader.lIIIIllllllIIl[NativeLibraryLoader.lIIIIllllllIlI[26]] = lIllllIlIllIIII("JRc5NHwhHCtaPwkmBAM0Rz4EFw==", "hRmuQ");
        NativeLibraryLoader.lIIIIllllllIIl[NativeLibraryLoader.lIIIIllllllIlI[27]] = lIllllIlIllIIII("ST4XDx4OOA==", "gZnar");
        NativeLibraryLoader.lIIIIllllllIIl[NativeLibraryLoader.lIIIIllllllIlI[28]] = lIllllIlIlIllll("MDeR5WXmqcffqHDfaW44MJdqCvAFWVql", "LTKIN");
        NativeLibraryLoader.lIIIIllllllIIl[NativeLibraryLoader.lIIIIllllllIlI[29]] = lIllllIlIllIIII("aSEiOCEuKQ==", "GKLQM");
        NativeLibraryLoader.lIIIIllllllIIl[NativeLibraryLoader.lIIIIllllllIlI[32]] = lIllllIlIlIlllI("XhzCC6KVw1FwYL3bxzXhf2eGdcv6YfIcLh0Ssd82GWsptRNaORmRdA==", "eIOHA");
        NativeLibraryLoader.lIIIIllllllIIl[NativeLibraryLoader.lIIIIllllllIlI[33]] = lIllllIlIlIlllI("YVVU48k10VdX6+F335eOpRaOy2HzZ8OA", "TwbeH");
        NativeLibraryLoader.lIIIIllllllIIl[NativeLibraryLoader.lIIIIllllllIlI[34]] = lIllllIlIlIlllI("Nra0QG5PXDM=", "DchZY");
        NativeLibraryLoader.lIIIIllllllIIl[NativeLibraryLoader.lIIIIllllllIlI[35]] = lIllllIlIllIIII("", "YekkH");
        NativeLibraryLoader.lIIIIllllllIIl[NativeLibraryLoader.lIIIIllllllIlI[36]] = lIllllIlIlIllll("nXbuNlDHGyP9lw9WHMPatw==", "UnxwV");
        NativeLibraryLoader.lIIIIllllllIIl[NativeLibraryLoader.lIIIIllllllIlI[37]] = lIllllIlIllIIII("", "ntVev");
        NativeLibraryLoader.lIIIIllllllIIl[NativeLibraryLoader.lIIIIllllllIlI[38]] = lIllllIlIllIIII("IzhhFDM+IzZUOCsjJgwzZCAgCD0uPj0=", "JWOzV");
        NativeLibraryLoader.lIIIIllllllIIl[NativeLibraryLoader.lIIIIllllllIlI[39]] = lIllllIlIllIIII("dxwKO2E0PRcgNnQ2BiA7I3YUOz0xPAomdXo=", "ZXcTO");
        NativeLibraryLoader.lIIIIllllllIIl[NativeLibraryLoader.lIIIIllllllIlI[40]] = lIllllIlIlIlllI("9D/sJursIFBitV3YPbOf4WnU0ryd9l0vJP6Ybt6wRoM=", "iRJKd");
        NativeLibraryLoader.lIIIIllllllIIl[NativeLibraryLoader.lIIIIllllllIlI[41]] = lIllllIlIlIllll("NXk+xTMi0kWSFh+OYH6gxfPTDoyNdLcG", "fcMOX");
    }
    
    private static boolean lIllllIlIllIlll(final int lllllllllllllIlIIIlllIIIlIlIlIlI) {
        return lllllllllllllIlIIIlllIIIlIlIlIlI > 0;
    }
    
    private static void lIllllIlIllIIlI() {
        (lIIIIllllllIlI = new int[43])[0] = ((0x85 ^ 0x89) & ~(0x1E ^ 0x12));
        NativeLibraryLoader.lIIIIllllllIlI[1] = " ".length();
        NativeLibraryLoader.lIIIIllllllIlI[2] = "  ".length();
        NativeLibraryLoader.lIIIIllllllIlI[3] = "   ".length();
        NativeLibraryLoader.lIIIIllllllIlI[4] = (0x4E ^ 0x4A);
        NativeLibraryLoader.lIIIIllllllIlI[5] = (0x57 ^ 0x72 ^ (0x41 ^ 0x61));
        NativeLibraryLoader.lIIIIllllllIlI[6] = (0xA ^ 0x58 ^ (0x4F ^ 0x1B));
        NativeLibraryLoader.lIIIIllllllIlI[7] = (0x91 ^ 0x98 ^ (0x93 ^ 0x9D));
        NativeLibraryLoader.lIIIIllllllIlI[8] = (0x70 ^ 0x21 ^ (0x38 ^ 0x61));
        NativeLibraryLoader.lIIIIllllllIlI[9] = (0x97 ^ 0xB3 ^ (0x4D ^ 0x60));
        NativeLibraryLoader.lIIIIllllllIlI[10] = (4 + 2 - 2 + 162 ^ 64 + 163 - 179 + 124);
        NativeLibraryLoader.lIIIIllllllIlI[11] = (0x2D ^ 0x26);
        NativeLibraryLoader.lIIIIllllllIlI[12] = (0x7B ^ 0x77);
        NativeLibraryLoader.lIIIIllllllIlI[13] = (49 + 32 + 61 + 49 ^ 153 + 4 - 146 + 167);
        NativeLibraryLoader.lIIIIllllllIlI[14] = (148 + 85 - 133 + 66 ^ 158 + 82 - 219 + 147);
        NativeLibraryLoader.lIIIIllllllIlI[15] = (0x5D ^ 0x52);
        NativeLibraryLoader.lIIIIllllllIlI[16] = (0x9A ^ 0x8A);
        NativeLibraryLoader.lIIIIllllllIlI[17] = (0x3B ^ 0x2A);
        NativeLibraryLoader.lIIIIllllllIlI[18] = (0x50 ^ 0x42);
        NativeLibraryLoader.lIIIIllllllIlI[19] = (0x3F ^ 0x2C);
        NativeLibraryLoader.lIIIIllllllIlI[20] = (212 + 95 - 268 + 175 ^ 112 + 25 - 11 + 68);
        NativeLibraryLoader.lIIIIllllllIlI[21] = (0x97 ^ 0x99 ^ (0x16 ^ 0xD));
        NativeLibraryLoader.lIIIIllllllIlI[22] = (0xA3 ^ 0xB5);
        NativeLibraryLoader.lIIIIllllllIlI[23] = (0x81 ^ 0xAF ^ (0x94 ^ 0xAD));
        NativeLibraryLoader.lIIIIllllllIlI[24] = (0xB7 ^ 0xAF);
        NativeLibraryLoader.lIIIIllllllIlI[25] = (0xAA ^ 0xB3);
        NativeLibraryLoader.lIIIIllllllIlI[26] = (0x93 ^ 0x89);
        NativeLibraryLoader.lIIIIllllllIlI[27] = (55 + 106 - 115 + 87 ^ 24 + 53 - 32 + 113);
        NativeLibraryLoader.lIIIIllllllIlI[28] = (0x4E ^ 0x52);
        NativeLibraryLoader.lIIIIllllllIlI[29] = (0xAB ^ 0xB6);
        NativeLibraryLoader.lIIIIllllllIlI[30] = (50 + 32 - 34 + 83 ^ 156 + 141 - 283 + 159);
        NativeLibraryLoader.lIIIIllllllIlI[31] = (0xFFFFF2A8 & 0x2D57);
        NativeLibraryLoader.lIIIIllllllIlI[32] = (103 + 58 - 141 + 113 ^ 148 + 63 - 105 + 49);
        NativeLibraryLoader.lIIIIllllllIlI[33] = (0x3B ^ 0x23 ^ (0x48 ^ 0x4F));
        NativeLibraryLoader.lIIIIllllllIlI[34] = (0x8A ^ 0x8C ^ (0x18 ^ 0x3E));
        NativeLibraryLoader.lIIIIllllllIlI[35] = (0x2F ^ 0xE);
        NativeLibraryLoader.lIIIIllllllIlI[36] = (38 + 66 - 74 + 161 ^ 121 + 113 - 176 + 99);
        NativeLibraryLoader.lIIIIllllllIlI[37] = (97 + 34 - 92 + 91 ^ 157 + 45 - 128 + 87);
        NativeLibraryLoader.lIIIIllllllIlI[38] = (17 + 188 + 9 + 13 ^ 97 + 181 - 206 + 127);
        NativeLibraryLoader.lIIIIllllllIlI[39] = (0x25 ^ 0x71 ^ (0xD4 ^ 0xA5));
        NativeLibraryLoader.lIIIIllllllIlI[40] = (0xD2 ^ 0x8F ^ (0x5A ^ 0x21));
        NativeLibraryLoader.lIIIIllllllIlI[41] = (0x4A ^ 0x6D);
        NativeLibraryLoader.lIIIIllllllIlI[42] = (0x8F ^ 0xA7);
    }
    
    private static boolean lIllllIlIllIIll(final Object lllllllllllllIlIIIlllIIIlIllIIlI) {
        return lllllllllllllIlIIIlllIIIlIllIIlI != null;
    }
    
    private static boolean lIllllIlIlllIII(final int lllllllllllllIlIIIlllIIIlIllIlIl, final int lllllllllllllIlIIIlllIIIlIllIlII) {
        return lllllllllllllIlIIIlllIIIlIllIlIl < lllllllllllllIlIIIlllIIIlIllIlII;
    }
}
