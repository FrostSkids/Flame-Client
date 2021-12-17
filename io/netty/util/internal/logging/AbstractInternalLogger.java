// 
// Decompiled by Procyon v0.5.36
// 

package io.netty.util.internal.logging;

import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.io.ObjectStreamException;
import io.netty.util.internal.StringUtil;
import java.io.Serializable;

public abstract class AbstractInternalLogger implements Serializable, InternalLogger
{
    private static final /* synthetic */ String[] lIIlIlllllIIll;
    private final /* synthetic */ String name;
    private static final /* synthetic */ int[] lIIlIlllllIlIl;
    
    protected AbstractInternalLogger(final String lllllllllllllIIlIllllllIIlIllIII) {
        if (llIlIlIIlIlIIIl(lllllllllllllIIlIllllllIIlIllIII)) {
            throw new NullPointerException(AbstractInternalLogger.lIIlIlllllIIll[AbstractInternalLogger.lIIlIlllllIlIl[0]]);
        }
        this.name = lllllllllllllIIlIllllllIIlIllIII;
    }
    
    private static void llIlIlIIlIIllIl() {
        (lIIlIlllllIIll = new String[AbstractInternalLogger.lIIlIlllllIlIl[3]])[AbstractInternalLogger.lIIlIlllllIlIl[0]] = llIlIlIIlIIllII("SnKe37BC5J4=", "Vakyg");
    }
    
    @Override
    public void log(final InternalLogLevel lllllllllllllIIlIllllllIIlIIIlll, final String lllllllllllllIIlIllllllIIlIIIIlI, final Throwable lllllllllllllIIlIllllllIIlIIIlIl) {
        switch (AbstractInternalLogger$1.$SwitchMap$io$netty$util$internal$logging$InternalLogLevel[lllllllllllllIIlIllllllIIlIIIlll.ordinal()]) {
            case 1: {
                this.trace(lllllllllllllIIlIllllllIIlIIIIlI, lllllllllllllIIlIllllllIIlIIIlIl);
                "".length();
                if (((0x4F ^ 0x10) & ~(0x71 ^ 0x2E)) < ((0x67 ^ 0x55) & ~(0x7C ^ 0x4E))) {
                    return;
                }
                break;
            }
            case 2: {
                this.debug(lllllllllllllIIlIllllllIIlIIIIlI, lllllllllllllIIlIllllllIIlIIIlIl);
                "".length();
                if (null != null) {
                    return;
                }
                break;
            }
            case 3: {
                this.info(lllllllllllllIIlIllllllIIlIIIIlI, lllllllllllllIIlIllllllIIlIIIlIl);
                "".length();
                if (null != null) {
                    return;
                }
                break;
            }
            case 4: {
                this.warn(lllllllllllllIIlIllllllIIlIIIIlI, lllllllllllllIIlIllllllIIlIIIlIl);
                "".length();
                if (null != null) {
                    return;
                }
                break;
            }
            case 5: {
                this.error(lllllllllllllIIlIllllllIIlIIIIlI, lllllllllllllIIlIllllllIIlIIIlIl);
                "".length();
                if (" ".length() > "  ".length()) {
                    return;
                }
                break;
            }
            default: {
                throw new Error();
            }
        }
    }
    
    @Override
    public void log(final InternalLogLevel lllllllllllllIIlIllllllIIIIlIIll, final String lllllllllllllIIlIllllllIIIIlIIlI, final Object... lllllllllllllIIlIllllllIIIIlIlIl) {
        switch (AbstractInternalLogger$1.$SwitchMap$io$netty$util$internal$logging$InternalLogLevel[lllllllllllllIIlIllllllIIIIlIIll.ordinal()]) {
            case 1: {
                this.trace(lllllllllllllIIlIllllllIIIIlIIlI, lllllllllllllIIlIllllllIIIIlIlIl);
                "".length();
                if ("  ".length() == (0x45 ^ 0x41)) {
                    return;
                }
                break;
            }
            case 2: {
                this.debug(lllllllllllllIIlIllllllIIIIlIIlI, lllllllllllllIIlIllllllIIIIlIlIl);
                "".length();
                if ("   ".length() == 0) {
                    return;
                }
                break;
            }
            case 3: {
                this.info(lllllllllllllIIlIllllllIIIIlIIlI, lllllllllllllIIlIllllllIIIIlIlIl);
                "".length();
                if ((0xB9 ^ 0xBD) != (0x7B ^ 0x7F)) {
                    return;
                }
                break;
            }
            case 4: {
                this.warn(lllllllllllllIIlIllllllIIIIlIIlI, lllllllllllllIIlIllllllIIIIlIlIl);
                "".length();
                if ((0x6B ^ 0x6E) == 0x0) {
                    return;
                }
                break;
            }
            case 5: {
                this.error(lllllllllllllIIlIllllllIIIIlIIlI, lllllllllllllIIlIllllllIIIIlIlIl);
                "".length();
                if (-(0x34 ^ 0x59 ^ (0xD9 ^ 0xB0)) >= 0) {
                    return;
                }
                break;
            }
            default: {
                throw new Error();
            }
        }
    }
    
    @Override
    public boolean isEnabled(final InternalLogLevel lllllllllllllIIlIllllllIIlIIllll) {
        switch (AbstractInternalLogger$1.$SwitchMap$io$netty$util$internal$logging$InternalLogLevel[lllllllllllllIIlIllllllIIlIIllll.ordinal()]) {
            case 1: {
                return this.isTraceEnabled();
            }
            case 2: {
                return this.isDebugEnabled();
            }
            case 3: {
                return this.isInfoEnabled();
            }
            case 4: {
                return this.isWarnEnabled();
            }
            case 5: {
                return this.isErrorEnabled();
            }
            default: {
                throw new Error();
            }
        }
    }
    
    @Override
    public void log(final InternalLogLevel lllllllllllllIIlIllllllIIIllIIlI, final String lllllllllllllIIlIllllllIIIlIllIl, final Object lllllllllllllIIlIllllllIIIllIIII) {
        switch (AbstractInternalLogger$1.$SwitchMap$io$netty$util$internal$logging$InternalLogLevel[lllllllllllllIIlIllllllIIIllIIlI.ordinal()]) {
            case 1: {
                this.trace(lllllllllllllIIlIllllllIIIlIllIl, lllllllllllllIIlIllllllIIIllIIII);
                "".length();
                if ((0x70 ^ 0x75) == 0x0) {
                    return;
                }
                break;
            }
            case 2: {
                this.debug(lllllllllllllIIlIllllllIIIlIllIl, lllllllllllllIIlIllllllIIIllIIII);
                "".length();
                if (((0x77 ^ 0x1D ^ (0x51 ^ 0x1D)) & (0x62 ^ 0x4A ^ (0x87 ^ 0x89) ^ -" ".length())) != 0x0) {
                    return;
                }
                break;
            }
            case 3: {
                this.info(lllllllllllllIIlIllllllIIIlIllIl, lllllllllllllIIlIllllllIIIllIIII);
                "".length();
                if (-(0xD7 ^ 0xB3 ^ (0x7A ^ 0x1A)) > 0) {
                    return;
                }
                break;
            }
            case 4: {
                this.warn(lllllllllllllIIlIllllllIIIlIllIl, lllllllllllllIIlIllllllIIIllIIII);
                "".length();
                if (" ".length() != " ".length()) {
                    return;
                }
                break;
            }
            case 5: {
                this.error(lllllllllllllIIlIllllllIIIlIllIl, lllllllllllllIIlIllllllIIIllIIII);
                "".length();
                if (-"   ".length() >= 0) {
                    return;
                }
                break;
            }
            default: {
                throw new Error();
            }
        }
    }
    
    static {
        llIlIlIIlIlIIII();
        llIlIlIIlIIllIl();
    }
    
    @Override
    public String toString() {
        return String.valueOf(new StringBuilder().append(StringUtil.simpleClassName(this)).append((char)AbstractInternalLogger.lIIlIlllllIlIl[1]).append(this.name()).append((char)AbstractInternalLogger.lIIlIlllllIlIl[2]));
    }
    
    protected Object readResolve() throws ObjectStreamException {
        return InternalLoggerFactory.getInstance(this.name());
    }
    
    private static String llIlIlIIlIIllII(final String lllllllllllllIIlIllllllIIIIIIIIl, final String lllllllllllllIIlIllllllIIIIIIIlI) {
        try {
            final SecretKeySpec lllllllllllllIIlIllllllIIIIIIllI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIIlIllllllIIIIIIIlI.getBytes(StandardCharsets.UTF_8)), AbstractInternalLogger.lIIlIlllllIlIl[4]), "DES");
            final Cipher lllllllllllllIIlIllllllIIIIIIlIl = Cipher.getInstance("DES");
            lllllllllllllIIlIllllllIIIIIIlIl.init(AbstractInternalLogger.lIIlIlllllIlIl[5], lllllllllllllIIlIllllllIIIIIIllI);
            return new String(lllllllllllllIIlIllllllIIIIIIlIl.doFinal(Base64.getDecoder().decode(lllllllllllllIIlIllllllIIIIIIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIlIllllllIIIIIIlII) {
            lllllllllllllIIlIllllllIIIIIIlII.printStackTrace();
            return null;
        }
    }
    
    @Override
    public void log(final InternalLogLevel lllllllllllllIIlIllllllIIIlIIIII, final String lllllllllllllIIlIllllllIIIIlllll, final Object lllllllllllllIIlIllllllIIIIllllI, final Object lllllllllllllIIlIllllllIIIIlllIl) {
        switch (AbstractInternalLogger$1.$SwitchMap$io$netty$util$internal$logging$InternalLogLevel[lllllllllllllIIlIllllllIIIlIIIII.ordinal()]) {
            case 1: {
                this.trace(lllllllllllllIIlIllllllIIIIlllll, lllllllllllllIIlIllllllIIIIllllI, lllllllllllllIIlIllllllIIIIlllIl);
                "".length();
                if (-" ".length() == "   ".length()) {
                    return;
                }
                break;
            }
            case 2: {
                this.debug(lllllllllllllIIlIllllllIIIIlllll, lllllllllllllIIlIllllllIIIIllllI, lllllllllllllIIlIllllllIIIIlllIl);
                "".length();
                if (" ".length() == 0) {
                    return;
                }
                break;
            }
            case 3: {
                this.info(lllllllllllllIIlIllllllIIIIlllll, lllllllllllllIIlIllllllIIIIllllI, lllllllllllllIIlIllllllIIIIlllIl);
                "".length();
                if (-" ".length() == (0x7 ^ 0x32 ^ (0x5D ^ 0x6C))) {
                    return;
                }
                break;
            }
            case 4: {
                this.warn(lllllllllllllIIlIllllllIIIIlllll, lllllllllllllIIlIllllllIIIIllllI, lllllllllllllIIlIllllllIIIIlllIl);
                "".length();
                if (((0x20 ^ 0x12) & ~(0x1E ^ 0x2C)) != 0x0) {
                    return;
                }
                break;
            }
            case 5: {
                this.error(lllllllllllllIIlIllllllIIIIlllll, lllllllllllllIIlIllllllIIIIllllI, lllllllllllllIIlIllllllIIIIlllIl);
                "".length();
                if (((0x2C ^ 0x16 ^ (0xA1 ^ 0x86)) & (0x87 ^ 0xAB ^ (0xB4 ^ 0x85) ^ -" ".length())) > 0) {
                    return;
                }
                break;
            }
            default: {
                throw new Error();
            }
        }
    }
    
    private static void llIlIlIIlIlIIII() {
        (lIIlIlllllIlIl = new int[6])[0] = ((0x1E ^ 0x5F) & ~(0xCE ^ 0x8F));
        AbstractInternalLogger.lIIlIlllllIlIl[1] = (0x4E ^ 0x66);
        AbstractInternalLogger.lIIlIlllllIlIl[2] = (49 + 90 + 19 + 9 ^ 134 + 130 - 253 + 131);
        AbstractInternalLogger.lIIlIlllllIlIl[3] = " ".length();
        AbstractInternalLogger.lIIlIlllllIlIl[4] = (0xF2 ^ 0x8A ^ (0xEA ^ 0x9A));
        AbstractInternalLogger.lIIlIlllllIlIl[5] = "  ".length();
    }
    
    private static boolean llIlIlIIlIlIIIl(final Object lllllllllllllIIlIlllllIlllllllII) {
        return lllllllllllllIIlIlllllIlllllllII == null;
    }
    
    @Override
    public String name() {
        return this.name;
    }
    
    @Override
    public void log(final InternalLogLevel lllllllllllllIIlIllllllIIIlllIIl, final String lllllllllllllIIlIllllllIIIlllIll) {
        switch (AbstractInternalLogger$1.$SwitchMap$io$netty$util$internal$logging$InternalLogLevel[lllllllllllllIIlIllllllIIIlllIIl.ordinal()]) {
            case 1: {
                this.trace(lllllllllllllIIlIllllllIIIlllIll);
                "".length();
                if (((0x14 ^ 0x4E) & ~(0x4E ^ 0x14) & ~("  ".length() & ~"  ".length())) != ((0x3F ^ 0x16) & ~(0x63 ^ 0x4A))) {
                    return;
                }
                break;
            }
            case 2: {
                this.debug(lllllllllllllIIlIllllllIIIlllIll);
                "".length();
                if ("  ".length() < -" ".length()) {
                    return;
                }
                break;
            }
            case 3: {
                this.info(lllllllllllllIIlIllllllIIIlllIll);
                "".length();
                if (-(0xA5 ^ 0xA1) > 0) {
                    return;
                }
                break;
            }
            case 4: {
                this.warn(lllllllllllllIIlIllllllIIIlllIll);
                "".length();
                if (((0x1F ^ 0x3F ^ (0xB1 ^ 0xBD)) & (128 + 57 - 128 + 100 ^ 159 + 64 - 149 + 103 ^ -" ".length())) < 0) {
                    return;
                }
                break;
            }
            case 5: {
                this.error(lllllllllllllIIlIllllllIIIlllIll);
                "".length();
                if (null != null) {
                    return;
                }
                break;
            }
            default: {
                throw new Error();
            }
        }
    }
}
