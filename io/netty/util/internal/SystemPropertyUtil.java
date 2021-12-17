// 
// Decompiled by Procyon v0.5.36
// 

package io.netty.util.internal;

import io.netty.util.internal.logging.InternalLoggerFactory;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.Arrays;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.AccessController;
import java.security.PrivilegedAction;
import io.netty.util.internal.logging.InternalLogger;
import java.util.regex.Pattern;

public final class SystemPropertyUtil
{
    private static final /* synthetic */ Pattern INTEGER_PATTERN;
    private static final /* synthetic */ InternalLogger logger;
    private static /* synthetic */ boolean loggedException;
    private static final /* synthetic */ String[] lIlIIlllllIlII;
    private static final /* synthetic */ int[] lIlIIlllllIlIl;
    private static /* synthetic */ boolean initializedLogger;
    
    public static boolean contains(final String lllllllllllllIIIlIllIlIlllllllII) {
        int n;
        if (lllIlIlIIIlllII(get(lllllllllllllIIIlIllIlIlllllllII))) {
            n = SystemPropertyUtil.lIlIIlllllIlIl[0];
            "".length();
            if ((0x75 ^ 0x71) != (0x7D ^ 0x79)) {
                return ((0xDB ^ 0x8A) & ~(0x95 ^ 0xC4)) != 0x0;
            }
        }
        else {
            n = SystemPropertyUtil.lIlIIlllllIlIl[1];
        }
        return n != 0;
    }
    
    public static String get(final String lllllllllllllIIIlIllIlIlllllIIII, final String lllllllllllllIIIlIllIlIllllIllll) {
        if (lllIlIlIIIlllIl(lllllllllllllIIIlIllIlIlllllIIII)) {
            throw new NullPointerException(SystemPropertyUtil.lIlIIlllllIlII[SystemPropertyUtil.lIlIIlllllIlIl[1]]);
        }
        if (lllIlIlIIIllllI(lllllllllllllIIIlIllIlIlllllIIII.isEmpty() ? 1 : 0)) {
            throw new IllegalArgumentException(SystemPropertyUtil.lIlIIlllllIlII[SystemPropertyUtil.lIlIIlllllIlIl[0]]);
        }
        String lllllllllllllIIIlIllIlIlllllIIIl = null;
        try {
            if (lllIlIlIIIlllIl(System.getSecurityManager())) {
                lllllllllllllIIIlIllIlIlllllIIIl = System.getProperty(lllllllllllllIIIlIllIlIlllllIIII);
                "".length();
                if (((0xF1 ^ 0xA0 ^ (0x36 ^ 0x50)) & (68 + 24 + 15 + 50 ^ 149 + 0 - 58 + 79 ^ -" ".length())) != 0x0) {
                    return null;
                }
            }
            else {
                lllllllllllllIIIlIllIlIlllllIIIl = AccessController.doPrivileged((PrivilegedAction<String>)new PrivilegedAction<String>() {
                    @Override
                    public String run() {
                        return System.getProperty(lllllllllllllIIIlIllIlIlllllIIII);
                    }
                });
            }
            "".length();
            if (-" ".length() > "  ".length()) {
                return null;
            }
        }
        catch (Exception lllllllllllllIIIlIllIlIlllllIlII) {
            if (lllIlIlIIIlllll(SystemPropertyUtil.loggedException ? 1 : 0)) {
                log(String.valueOf(new StringBuilder().append(SystemPropertyUtil.lIlIIlllllIlII[SystemPropertyUtil.lIlIIlllllIlIl[2]]).append(lllllllllllllIIIlIllIlIlllllIIII).append(SystemPropertyUtil.lIlIIlllllIlII[SystemPropertyUtil.lIlIIlllllIlIl[3]])), lllllllllllllIIIlIllIlIlllllIlII);
                SystemPropertyUtil.loggedException = (SystemPropertyUtil.lIlIIlllllIlIl[0] != 0);
            }
        }
        if (lllIlIlIIIlllIl(lllllllllllllIIIlIllIlIlllllIIIl)) {
            return lllllllllllllIIIlIllIlIllllIllll;
        }
        return lllllllllllllIIIlIllIlIlllllIIIl;
    }
    
    private static String lllIlIlIIIllIIl(final String lllllllllllllIIIlIllIlIllIllIllI, final String lllllllllllllIIIlIllIlIllIllIlll) {
        try {
            final SecretKeySpec lllllllllllllIIIlIllIlIllIlllIll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIIIlIllIlIllIllIlll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lllllllllllllIIIlIllIlIllIlllIlI = Cipher.getInstance("Blowfish");
            lllllllllllllIIIlIllIlIllIlllIlI.init(SystemPropertyUtil.lIlIIlllllIlIl[2], lllllllllllllIIIlIllIlIllIlllIll);
            return new String(lllllllllllllIIIlIllIlIllIlllIlI.doFinal(Base64.getDecoder().decode(lllllllllllllIIIlIllIlIllIllIllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIIlIllIlIllIlllIIl) {
            lllllllllllllIIIlIllIlIllIlllIIl.printStackTrace();
            return null;
        }
    }
    
    private SystemPropertyUtil() {
    }
    
    public static boolean getBoolean(final String lllllllllllllIIIlIllIlIllllIIllI, final boolean lllllllllllllIIIlIllIlIllllIlIII) {
        String lllllllllllllIIIlIllIlIllllIIlll = get(lllllllllllllIIIlIllIlIllllIIllI);
        if (lllIlIlIIIlllIl(lllllllllllllIIIlIllIlIllllIIlll)) {
            return lllllllllllllIIIlIllIlIllllIlIII;
        }
        lllllllllllllIIIlIllIlIllllIIlll = lllllllllllllIIIlIllIlIllllIIlll.trim().toLowerCase();
        if (lllIlIlIIIllllI(lllllllllllllIIIlIllIlIllllIIlll.isEmpty() ? 1 : 0)) {
            return SystemPropertyUtil.lIlIIlllllIlIl[0] != 0;
        }
        if (!lllIlIlIIIlllll(SystemPropertyUtil.lIlIIlllllIlII[SystemPropertyUtil.lIlIIlllllIlIl[4]].equals(lllllllllllllIIIlIllIlIllllIIlll) ? 1 : 0) || !lllIlIlIIIlllll(SystemPropertyUtil.lIlIIlllllIlII[SystemPropertyUtil.lIlIIlllllIlIl[5]].equals(lllllllllllllIIIlIllIlIllllIIlll) ? 1 : 0) || lllIlIlIIIllllI(SystemPropertyUtil.lIlIIlllllIlII[SystemPropertyUtil.lIlIIlllllIlIl[6]].equals(lllllllllllllIIIlIllIlIllllIIlll) ? 1 : 0)) {
            return SystemPropertyUtil.lIlIIlllllIlIl[0] != 0;
        }
        if (!lllIlIlIIIlllll(SystemPropertyUtil.lIlIIlllllIlII[SystemPropertyUtil.lIlIIlllllIlIl[7]].equals(lllllllllllllIIIlIllIlIllllIIlll) ? 1 : 0) || !lllIlIlIIIlllll(SystemPropertyUtil.lIlIIlllllIlII[SystemPropertyUtil.lIlIIlllllIlIl[8]].equals(lllllllllllllIIIlIllIlIllllIIlll) ? 1 : 0) || lllIlIlIIIllllI(SystemPropertyUtil.lIlIIlllllIlII[SystemPropertyUtil.lIlIIlllllIlIl[9]].equals(lllllllllllllIIIlIllIlIllllIIlll) ? 1 : 0)) {
            return SystemPropertyUtil.lIlIIlllllIlIl[1] != 0;
        }
        log(String.valueOf(new StringBuilder().append(SystemPropertyUtil.lIlIIlllllIlII[SystemPropertyUtil.lIlIIlllllIlIl[10]]).append(lllllllllllllIIIlIllIlIllllIIllI).append(SystemPropertyUtil.lIlIIlllllIlII[SystemPropertyUtil.lIlIIlllllIlIl[11]]).append(lllllllllllllIIIlIllIlIllllIIlll).append(SystemPropertyUtil.lIlIIlllllIlII[SystemPropertyUtil.lIlIIlllllIlIl[12]]).append(SystemPropertyUtil.lIlIIlllllIlII[SystemPropertyUtil.lIlIIlllllIlIl[13]]).append(lllllllllllllIIIlIllIlIllllIlIII)));
        return lllllllllllllIIIlIllIlIllllIlIII;
    }
    
    public static int getInt(final String lllllllllllllIIIlIllIlIlllIllllI, final int lllllllllllllIIIlIllIlIlllIllIlI) {
        String lllllllllllllIIIlIllIlIlllIlllII = get(lllllllllllllIIIlIllIlIlllIllllI);
        if (lllIlIlIIIlllIl(lllllllllllllIIIlIllIlIlllIlllII)) {
            return lllllllllllllIIIlIllIlIlllIllIlI;
        }
        lllllllllllllIIIlIllIlIlllIlllII = lllllllllllllIIIlIllIlIlllIlllII.trim().toLowerCase();
        if (lllIlIlIIIllllI(SystemPropertyUtil.INTEGER_PATTERN.matcher(lllllllllllllIIIlIllIlIlllIlllII).matches() ? 1 : 0)) {
            try {
                return Integer.parseInt(lllllllllllllIIIlIllIlIlllIlllII);
            }
            catch (Exception ex) {}
        }
        log(String.valueOf(new StringBuilder().append(SystemPropertyUtil.lIlIIlllllIlII[SystemPropertyUtil.lIlIIlllllIlIl[14]]).append(lllllllllllllIIIlIllIlIlllIllllI).append(SystemPropertyUtil.lIlIIlllllIlII[SystemPropertyUtil.lIlIIlllllIlIl[15]]).append(lllllllllllllIIIlIllIlIlllIlllII).append(SystemPropertyUtil.lIlIIlllllIlII[SystemPropertyUtil.lIlIIlllllIlIl[16]]).append(SystemPropertyUtil.lIlIIlllllIlII[SystemPropertyUtil.lIlIIlllllIlIl[17]]).append(lllllllllllllIIIlIllIlIlllIllIlI)));
        return lllllllllllllIIIlIllIlIlllIllIlI;
    }
    
    private static boolean lllIlIlIIIlllIl(final Object lllllllllllllIIIlIllIlIllIIIIllI) {
        return lllllllllllllIIIlIllIlIllIIIIllI == null;
    }
    
    private static boolean lllIlIlIIIlllII(final Object lllllllllllllIIIlIllIlIllIIIlIII) {
        return lllllllllllllIIIlIllIlIllIIIlIII != null;
    }
    
    private static String lllIlIlIIIllIII(final String lllllllllllllIIIlIllIlIllIlIlIll, final String lllllllllllllIIIlIllIlIllIlIlIII) {
        try {
            final SecretKeySpec lllllllllllllIIIlIllIlIllIlIlllI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIIIlIllIlIllIlIlIII.getBytes(StandardCharsets.UTF_8)), SystemPropertyUtil.lIlIIlllllIlIl[8]), "DES");
            final Cipher lllllllllllllIIIlIllIlIllIlIllIl = Cipher.getInstance("DES");
            lllllllllllllIIIlIllIlIllIlIllIl.init(SystemPropertyUtil.lIlIIlllllIlIl[2], lllllllllllllIIIlIllIlIllIlIlllI);
            return new String(lllllllllllllIIIlIllIlIllIlIllIl.doFinal(Base64.getDecoder().decode(lllllllllllllIIIlIllIlIllIlIlIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIIlIllIlIllIlIllII) {
            lllllllllllllIIIlIllIlIllIlIllII.printStackTrace();
            return null;
        }
    }
    
    private static void log(final String lllllllllllllIIIlIllIlIlllIIlIlI) {
        if (lllIlIlIIIllllI(SystemPropertyUtil.initializedLogger ? 1 : 0)) {
            SystemPropertyUtil.logger.warn(lllllllllllllIIIlIllIlIlllIIlIlI);
            "".length();
            if ("   ".length() <= 0) {
                return;
            }
        }
        else {
            Logger.getLogger(SystemPropertyUtil.class.getName()).log(Level.WARNING, lllllllllllllIIIlIllIlIlllIIlIlI);
        }
    }
    
    private static void lllIlIlIIIllIlI() {
        (lIlIIlllllIlII = new String[SystemPropertyUtil.lIlIIlllllIlIl[23]])[SystemPropertyUtil.lIlIIlllllIlIl[1]] = lllIlIlIIIlIlll("LRcR", "FrhFF");
        SystemPropertyUtil.lIlIIlllllIlII[SystemPropertyUtil.lIlIIlllllIlIl[0]] = lllIlIlIIIlIlll("ChcebxgUARNvGw4GRy0QQRcKPwEYXA==", "argOu");
        SystemPropertyUtil.lIlIIlllllIlII[SystemPropertyUtil.lIlIIlllllIlIl[2]] = lllIlIlIIIllIII("W8imjqP2dNT/P0ts7s2TqM2wQ4hJ3PBu/4lNV/lZZUVGQdCnbeWfzQ==", "ougVQ");
        SystemPropertyUtil.lIlIIlllllIlII[SystemPropertyUtil.lIlIIlllllIlIl[3]] = lllIlIlIIIlIlll("QVphBTUAADQNJEYXIA0lAxJhFjkKDWEDNUYUMgQ0SA==", "faAaP");
        SystemPropertyUtil.lIlIIlllllIlII[SystemPropertyUtil.lIlIIlllllIlIl[4]] = lllIlIlIIIllIIl("alFq8j7JWeY=", "oiYKQ");
        SystemPropertyUtil.lIlIIlllllIlII[SystemPropertyUtil.lIlIIlllllIlIl[5]] = lllIlIlIIIllIII("Bo2KAvz3BQk=", "dAzKd");
        SystemPropertyUtil.lIlIIlllllIlII[SystemPropertyUtil.lIlIIlllllIlIl[6]] = lllIlIlIIIllIIl("tw64165L+3c=", "hJPCv");
        SystemPropertyUtil.lIlIIlllllIlII[SystemPropertyUtil.lIlIIlllllIlIl[7]] = lllIlIlIIIllIIl("ZudpFwSS/xE=", "vWuAF");
        SystemPropertyUtil.lIlIIlllllIlII[SystemPropertyUtil.lIlIIlllllIlIl[8]] = lllIlIlIIIlIlll("FDw=", "zShXS");
        SystemPropertyUtil.lIlIIlllllIlII[SystemPropertyUtil.lIlIIlllllIlIl[9]] = lllIlIlIIIllIII("FFCLAl262Uk=", "ZJmLv");
        SystemPropertyUtil.lIlIIlllllIlII[SystemPropertyUtil.lIlIIlllllIlIl[10]] = lllIlIlIIIllIIl("qulyGLqaMe0fWwAAwHtbZz5bRYba2l9vdD0Py3GDAO9I4TMHfmVkg753UeLf+7f6", "WLovi");
        SystemPropertyUtil.lIlIIlllllIlII[SystemPropertyUtil.lIlIIlllllIlIl[11]] = lllIlIlIIIllIIl("cm+eHonbDaU=", "BCZsv");
        SystemPropertyUtil.lIlIIlllllIlII[SystemPropertyUtil.lIlIIlllllIlIl[12]] = lllIlIlIIIllIIl("blYad/26wzM=", "CTPrg");
        SystemPropertyUtil.lIlIIlllllIlII[SystemPropertyUtil.lIlIIlllllIlIl[13]] = lllIlIlIIIllIIl("7Z1+UvRj+/h5xzJjlg+oTxOwdlPeSJuUfNgdTfdDbUk=", "qcuzq");
        SystemPropertyUtil.lIlIIlllllIlII[SystemPropertyUtil.lIlIIlllllIlIl[14]] = lllIlIlIIIlIlll("FxgNMScnVhg8azIXHiAuYgIENmsrGBg2LCcETCAyMQIJPmsyBAMjLjACFXNs", "BvlSK");
        SystemPropertyUtil.lIlIIlllllIlII[SystemPropertyUtil.lIlIIlllllIlIl[15]] = lllIlIlIIIllIIl("WyKuF7bG3zs=", "Hcjtf");
        SystemPropertyUtil.lIlIIlllllIlII[SystemPropertyUtil.lIlIIlllllIlIl[16]] = lllIlIlIIIllIII("A9mTFaZJxTc=", "uZFXW");
        SystemPropertyUtil.lIlIIlllllIlII[SystemPropertyUtil.lIlIIlllllIlIl[17]] = lllIlIlIIIllIIl("YCHww8FJQss6INPkFIvZOZzzLTm7cI1k75F27FmLzic=", "MAwUw");
        SystemPropertyUtil.lIlIIlllllIlII[SystemPropertyUtil.lIlIIlllllIlIl[18]] = lllIlIlIIIlIlll("MCs0NR0AZSE4URUkJyQURTE9MlEJKjswUQwrITIWADd1JAgWMTA6URU3OicUFzEsd1Y=", "eEUWq");
        SystemPropertyUtil.lIlIIlllllIlII[SystemPropertyUtil.lIlIIlllllIlIl[19]] = lllIlIlIIIllIIl("JXJ9XxQnCfw=", "xGPYe");
        SystemPropertyUtil.lIlIIlllllIlII[SystemPropertyUtil.lIlIIlllllIlIl[20]] = lllIlIlIIIllIII("uIHfcBws91g=", "SXIXM");
        SystemPropertyUtil.lIlIIlllllIlII[SystemPropertyUtil.lIlIIlllllIlIl[21]] = lllIlIlIIIllIII("sBVckCZYpV8zjIvUcnIvgSSG0SOAghCzKskXIbfA1vI=", "ELevL");
        SystemPropertyUtil.lIlIIlllllIlII[SystemPropertyUtil.lIlIIlllllIlIl[22]] = lllIlIlIIIllIII("eFfeQVEiyQTI4IvTfwVwFQ==", "PkvNa");
    }
    
    private static boolean lllIlIlIIIlllll(final int lllllllllllllIIIlIllIlIllIIIIIlI) {
        return lllllllllllllIIIlIllIlIllIIIIIlI == 0;
    }
    
    private static void log(final String lllllllllllllIIIlIllIlIlllIIIlII, final Exception lllllllllllllIIIlIllIlIlllIIIlIl) {
        if (lllIlIlIIIllllI(SystemPropertyUtil.initializedLogger ? 1 : 0)) {
            SystemPropertyUtil.logger.warn(lllllllllllllIIIlIllIlIlllIIIlII, lllllllllllllIIIlIllIlIlllIIIlIl);
            "".length();
            if ("   ".length() < 0) {
                return;
            }
        }
        else {
            Logger.getLogger(SystemPropertyUtil.class.getName()).log(Level.WARNING, lllllllllllllIIIlIllIlIlllIIIlII, lllllllllllllIIIlIllIlIlllIIIlIl);
        }
    }
    
    public static String get(final String lllllllllllllIIIlIllIlIllllllIlI) {
        return get(lllllllllllllIIIlIllIlIllllllIlI, null);
    }
    
    private static boolean lllIlIlIIlIIIII(final int lllllllllllllIIIlIllIlIllIIIlIll, final int lllllllllllllIIIlIllIlIllIIIlIlI) {
        return lllllllllllllIIIlIllIlIllIIIlIll < lllllllllllllIIIlIllIlIllIIIlIlI;
    }
    
    private static String lllIlIlIIIlIlll(String lllllllllllllIIIlIllIlIllIIlIllI, final String lllllllllllllIIIlIllIlIllIIlIlIl) {
        lllllllllllllIIIlIllIlIllIIlIllI = new String(Base64.getDecoder().decode(lllllllllllllIIIlIllIlIllIIlIllI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIIIlIllIlIllIIllIIl = new StringBuilder();
        final char[] lllllllllllllIIIlIllIlIllIIllIII = lllllllllllllIIIlIllIlIllIIlIlIl.toCharArray();
        int lllllllllllllIIIlIllIlIllIIlIlll = SystemPropertyUtil.lIlIIlllllIlIl[1];
        final int lllllllllllllIIIlIllIlIllIIlIIIl = (Object)lllllllllllllIIIlIllIlIllIIlIllI.toCharArray();
        final char lllllllllllllIIIlIllIlIllIIlIIII = (char)lllllllllllllIIIlIllIlIllIIlIIIl.length;
        float lllllllllllllIIIlIllIlIllIIIllll = SystemPropertyUtil.lIlIIlllllIlIl[1];
        while (lllIlIlIIlIIIII((int)lllllllllllllIIIlIllIlIllIIIllll, lllllllllllllIIIlIllIlIllIIlIIII)) {
            final char lllllllllllllIIIlIllIlIllIIlllII = lllllllllllllIIIlIllIlIllIIlIIIl[lllllllllllllIIIlIllIlIllIIIllll];
            lllllllllllllIIIlIllIlIllIIllIIl.append((char)(lllllllllllllIIIlIllIlIllIIlllII ^ lllllllllllllIIIlIllIlIllIIllIII[lllllllllllllIIIlIllIlIllIIlIlll % lllllllllllllIIIlIllIlIllIIllIII.length]));
            "".length();
            ++lllllllllllllIIIlIllIlIllIIlIlll;
            ++lllllllllllllIIIlIllIlIllIIIllll;
            "".length();
            if (-" ".length() > 0) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIIIlIllIlIllIIllIIl);
    }
    
    public static long getLong(final String lllllllllllllIIIlIllIlIlllIIllll, final long lllllllllllllIIIlIllIlIlllIIlllI) {
        String lllllllllllllIIIlIllIlIlllIlIIII = get(lllllllllllllIIIlIllIlIlllIIllll);
        if (lllIlIlIIIlllIl(lllllllllllllIIIlIllIlIlllIlIIII)) {
            return lllllllllllllIIIlIllIlIlllIIlllI;
        }
        lllllllllllllIIIlIllIlIlllIlIIII = lllllllllllllIIIlIllIlIlllIlIIII.trim().toLowerCase();
        if (lllIlIlIIIllllI(SystemPropertyUtil.INTEGER_PATTERN.matcher(lllllllllllllIIIlIllIlIlllIlIIII).matches() ? 1 : 0)) {
            try {
                return Long.parseLong(lllllllllllllIIIlIllIlIlllIlIIII);
            }
            catch (Exception ex) {}
        }
        log(String.valueOf(new StringBuilder().append(SystemPropertyUtil.lIlIIlllllIlII[SystemPropertyUtil.lIlIIlllllIlIl[18]]).append(lllllllllllllIIIlIllIlIlllIIllll).append(SystemPropertyUtil.lIlIIlllllIlII[SystemPropertyUtil.lIlIIlllllIlIl[19]]).append(lllllllllllllIIIlIllIlIlllIlIIII).append(SystemPropertyUtil.lIlIIlllllIlII[SystemPropertyUtil.lIlIIlllllIlIl[20]]).append(SystemPropertyUtil.lIlIIlllllIlII[SystemPropertyUtil.lIlIIlllllIlIl[21]]).append(lllllllllllllIIIlIllIlIlllIIlllI)));
        return lllllllllllllIIIlIllIlIlllIIlllI;
    }
    
    private static void lllIlIlIIIllIll() {
        (lIlIIlllllIlIl = new int[24])[0] = " ".length();
        SystemPropertyUtil.lIlIIlllllIlIl[1] = ((0xE7 ^ 0xBA) & ~(0x23 ^ 0x7E));
        SystemPropertyUtil.lIlIIlllllIlIl[2] = "  ".length();
        SystemPropertyUtil.lIlIIlllllIlIl[3] = "   ".length();
        SystemPropertyUtil.lIlIIlllllIlIl[4] = (0x6A ^ 0x3D ^ (0x2F ^ 0x7C));
        SystemPropertyUtil.lIlIIlllllIlIl[5] = (40 + 130 - 136 + 132 ^ 158 + 110 - 199 + 94);
        SystemPropertyUtil.lIlIIlllllIlIl[6] = (0xEC ^ 0xC6 ^ (0x9A ^ 0xB6));
        SystemPropertyUtil.lIlIIlllllIlIl[7] = (0x42 ^ 0x2B ^ (0xD3 ^ 0xBD));
        SystemPropertyUtil.lIlIIlllllIlIl[8] = (0x78 ^ 0x70);
        SystemPropertyUtil.lIlIIlllllIlIl[9] = (0x90 ^ 0x99);
        SystemPropertyUtil.lIlIIlllllIlIl[10] = (0x15 ^ 0x1F);
        SystemPropertyUtil.lIlIIlllllIlIl[11] = (0x28 ^ 0x23);
        SystemPropertyUtil.lIlIIlllllIlIl[12] = (0xA5 ^ 0xA9);
        SystemPropertyUtil.lIlIIlllllIlIl[13] = (0x84 ^ 0xC0 ^ (0x8B ^ 0xC2));
        SystemPropertyUtil.lIlIIlllllIlIl[14] = (0xA ^ 0x2F ^ (0x40 ^ 0x6B));
        SystemPropertyUtil.lIlIIlllllIlIl[15] = (0x13 ^ 0x1C);
        SystemPropertyUtil.lIlIIlllllIlIl[16] = (0xA4 ^ 0xB4);
        SystemPropertyUtil.lIlIIlllllIlIl[17] = (31 + 128 - 119 + 109 ^ 114 + 78 - 72 + 12);
        SystemPropertyUtil.lIlIIlllllIlIl[18] = (0xA5 ^ 0xB7);
        SystemPropertyUtil.lIlIIlllllIlIl[19] = (0xC6 ^ 0xBA ^ (0xD1 ^ 0xBE));
        SystemPropertyUtil.lIlIIlllllIlIl[20] = (0x1E ^ 0xA);
        SystemPropertyUtil.lIlIIlllllIlIl[21] = (28 + 45 - 72 + 153 ^ 61 + 117 - 75 + 40);
        SystemPropertyUtil.lIlIIlllllIlIl[22] = (166 + 179 - 338 + 208 ^ 182 + 153 - 186 + 44);
        SystemPropertyUtil.lIlIIlllllIlIl[23] = (0x8B ^ 0x9C);
    }
    
    private static boolean lllIlIlIIIllllI(final int lllllllllllllIIIlIllIlIllIIIIlII) {
        return lllllllllllllIIIlIllIlIllIIIIlII != 0;
    }
    
    static {
        lllIlIlIIIllIll();
        lllIlIlIIIllIlI();
        SystemPropertyUtil.initializedLogger = (SystemPropertyUtil.lIlIIlllllIlIl[1] != 0);
        logger = InternalLoggerFactory.getInstance(SystemPropertyUtil.class);
        SystemPropertyUtil.initializedLogger = (SystemPropertyUtil.lIlIIlllllIlIl[0] != 0);
        INTEGER_PATTERN = Pattern.compile(SystemPropertyUtil.lIlIIlllllIlII[SystemPropertyUtil.lIlIIlllllIlIl[22]]);
    }
}
