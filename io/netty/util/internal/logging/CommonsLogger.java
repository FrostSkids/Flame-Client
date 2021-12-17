// 
// Decompiled by Procyon v0.5.36
// 

package io.netty.util.internal.logging;

import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import org.apache.commons.logging.Log;

class CommonsLogger extends AbstractInternalLogger
{
    private static final /* synthetic */ String[] llIllIlIIIlIII;
    private static final /* synthetic */ int[] llIllIlIIIlIIl;
    private final transient /* synthetic */ Log logger;
    
    private static boolean lIIlIllllIIIllIl(final int llllllllllllIllIIllIlllllllllIIl) {
        return llllllllllllIllIIllIlllllllllIIl != 0;
    }
    
    private static boolean lIIlIllllIIIllII(final Object llllllllllllIllIIllIlllllllllIll) {
        return llllllllllllIllIIllIlllllllllIll == null;
    }
    
    @Override
    public void debug(final String llllllllllllIllIIlllIIIIlIllIllI, final Throwable llllllllllllIllIIlllIIIIlIlllIII) {
        this.logger.debug((Object)llllllllllllIllIIlllIIIIlIllIllI, llllllllllllIllIIlllIIIIlIlllIII);
    }
    
    @Override
    public void trace(final String llllllllllllIllIIlllIIIlIIIllllI) {
        this.logger.trace((Object)llllllllllllIllIIlllIIIlIIIllllI);
    }
    
    @Override
    public void info(final String llllllllllllIllIIlllIIIIlIIllIII, final Object llllllllllllIllIIlllIIIIlIIlIIll, final Object llllllllllllIllIIlllIIIIlIIlIllI) {
        if (lIIlIllllIIIllIl(this.logger.isInfoEnabled() ? 1 : 0)) {
            final FormattingTuple llllllllllllIllIIlllIIIIlIIllIlI = MessageFormatter.format(llllllllllllIllIIlllIIIIlIIllIII, llllllllllllIllIIlllIIIIlIIlIIll, llllllllllllIllIIlllIIIIlIIlIllI);
            this.logger.info((Object)llllllllllllIllIIlllIIIIlIIllIlI.getMessage(), llllllllllllIllIIlllIIIIlIIllIlI.getThrowable());
        }
    }
    
    @Override
    public void warn(final String llllllllllllIllIIlllIIIIIlllIlIl) {
        this.logger.warn((Object)llllllllllllIllIIlllIIIIIlllIlIl);
    }
    
    @Override
    public void trace(final String llllllllllllIllIIlllIIIIlllIllll, final Throwable llllllllllllIllIIlllIIIIlllIlllI) {
        this.logger.trace((Object)llllllllllllIllIIlllIIIIlllIllll, llllllllllllIllIIlllIIIIlllIlllI);
    }
    
    @Override
    public void debug(final String llllllllllllIllIIlllIIIIllIlIIIl, final Object llllllllllllIllIIlllIIIIllIIllII, final Object llllllllllllIllIIlllIIIIllIIlIll) {
        if (lIIlIllllIIIllIl(this.logger.isDebugEnabled() ? 1 : 0)) {
            final FormattingTuple llllllllllllIllIIlllIIIIllIlIIll = MessageFormatter.format(llllllllllllIllIIlllIIIIllIlIIIl, llllllllllllIllIIlllIIIIllIIllII, llllllllllllIllIIlllIIIIllIIlIll);
            this.logger.debug((Object)llllllllllllIllIIlllIIIIllIlIIll.getMessage(), llllllllllllIllIIlllIIIIllIlIIll.getThrowable());
        }
    }
    
    @Override
    public void warn(final String llllllllllllIllIIlllIIIIIllIllII, final Object llllllllllllIllIIlllIIIIIllIlIll) {
        if (lIIlIllllIIIllIl(this.logger.isWarnEnabled() ? 1 : 0)) {
            final FormattingTuple llllllllllllIllIIlllIIIIIllIlllI = MessageFormatter.format(llllllllllllIllIIlllIIIIIllIllII, llllllllllllIllIIlllIIIIIllIlIll);
            this.logger.warn((Object)llllllllllllIllIIlllIIIIIllIlllI.getMessage(), llllllllllllIllIIlllIIIIIllIlllI.getThrowable());
        }
    }
    
    private static void lIIlIllllIIIlIlI() {
        (llIllIlIIIlIII = new String[CommonsLogger.llIllIlIIIlIIl[1]])[CommonsLogger.llIllIlIIIlIIl[0]] = lIIlIllllIIIlIIl("IDeIGf1IMdA=", "qFVUR");
    }
    
    @Override
    public void warn(final String llllllllllllIllIIlllIIIIIlIIIlII, final Throwable llllllllllllIllIIlllIIIIIlIIIIll) {
        this.logger.warn((Object)llllllllllllIllIIlllIIIIIlIIIlII, llllllllllllIllIIlllIIIIIlIIIIll);
    }
    
    @Override
    public void warn(final String llllllllllllIllIIlllIIIIIlIllIll, final Object llllllllllllIllIIlllIIIIIlIllIlI, final Object llllllllllllIllIIlllIIIIIlIllIIl) {
        if (lIIlIllllIIIllIl(this.logger.isWarnEnabled() ? 1 : 0)) {
            final FormattingTuple llllllllllllIllIIlllIIIIIllIIIIl = MessageFormatter.format(llllllllllllIllIIlllIIIIIlIllIll, llllllllllllIllIIlllIIIIIlIllIlI, llllllllllllIllIIlllIIIIIlIllIIl);
            this.logger.warn((Object)llllllllllllIllIIlllIIIIIllIIIIl.getMessage(), llllllllllllIllIIlllIIIIIllIIIIl.getThrowable());
        }
    }
    
    @Override
    public void warn(final String llllllllllllIllIIlllIIIIIlIIlllI, final Object... llllllllllllIllIIlllIIIIIlIIllIl) {
        if (lIIlIllllIIIllIl(this.logger.isWarnEnabled() ? 1 : 0)) {
            final FormattingTuple llllllllllllIllIIlllIIIIIlIlIIll = MessageFormatter.arrayFormat(llllllllllllIllIIlllIIIIIlIIlllI, llllllllllllIllIIlllIIIIIlIIllIl);
            this.logger.warn((Object)llllllllllllIllIIlllIIIIIlIlIIll.getMessage(), llllllllllllIllIIlllIIIIIlIlIIll.getThrowable());
        }
    }
    
    @Override
    public void debug(final String llllllllllllIllIIlllIIIIllIIIIII, final Object... llllllllllllIllIIlllIIIIllIIIIlI) {
        if (lIIlIllllIIIllIl(this.logger.isDebugEnabled() ? 1 : 0)) {
            final FormattingTuple llllllllllllIllIIlllIIIIllIIIlIl = MessageFormatter.arrayFormat(llllllllllllIllIIlllIIIIllIIIIII, llllllllllllIllIIlllIIIIllIIIIlI);
            this.logger.debug((Object)llllllllllllIllIIlllIIIIllIIIlIl.getMessage(), llllllllllllIllIIlllIIIIllIIIlIl.getThrowable());
        }
    }
    
    @Override
    public boolean isInfoEnabled() {
        return this.logger.isInfoEnabled();
    }
    
    @Override
    public boolean isWarnEnabled() {
        return this.logger.isWarnEnabled();
    }
    
    @Override
    public boolean isErrorEnabled() {
        return this.logger.isErrorEnabled();
    }
    
    static {
        lIIlIllllIIIlIll();
        lIIlIllllIIIlIlI();
    }
    
    @Override
    public void info(final String llllllllllllIllIIlllIIIIlIlIlllI) {
        this.logger.info((Object)llllllllllllIllIIlllIIIIlIlIlllI);
    }
    
    @Override
    public void debug(final String llllllllllllIllIIlllIIIIllIllIll, final Object llllllllllllIllIIlllIIIIllIlllIl) {
        if (lIIlIllllIIIllIl(this.logger.isDebugEnabled() ? 1 : 0)) {
            final FormattingTuple llllllllllllIllIIlllIIIIlllIIIII = MessageFormatter.format(llllllllllllIllIIlllIIIIllIllIll, llllllllllllIllIIlllIIIIllIlllIl);
            this.logger.debug((Object)llllllllllllIllIIlllIIIIlllIIIII.getMessage(), llllllllllllIllIIlllIIIIlllIIIII.getThrowable());
        }
    }
    
    private static String lIIlIllllIIIlIIl(final String llllllllllllIllIIlllIIIIIIIIIIII, final String llllllllllllIllIIlllIIIIIIIIIIIl) {
        try {
            final SecretKeySpec llllllllllllIllIIlllIIIIIIIIIlIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIllIIlllIIIIIIIIIIIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher llllllllllllIllIIlllIIIIIIIIIlII = Cipher.getInstance("Blowfish");
            llllllllllllIllIIlllIIIIIIIIIlII.init(CommonsLogger.llIllIlIIIlIIl[2], llllllllllllIllIIlllIIIIIIIIIlIl);
            return new String(llllllllllllIllIIlllIIIIIIIIIlII.doFinal(Base64.getDecoder().decode(llllllllllllIllIIlllIIIIIIIIIIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIllIIlllIIIIIIIIIIll) {
            llllllllllllIllIIlllIIIIIIIIIIll.printStackTrace();
            return null;
        }
    }
    
    @Override
    public void error(final String llllllllllllIllIIlllIIIIIIIIlIll, final Throwable llllllllllllIllIIlllIIIIIIIIllIl) {
        this.logger.error((Object)llllllllllllIllIIlllIIIIIIIIlIll, llllllllllllIllIIlllIIIIIIIIllIl);
    }
    
    @Override
    public void error(final String llllllllllllIllIIlllIIIIIIIllIII, final Object... llllllllllllIllIIlllIIIIIIIlIlll) {
        if (lIIlIllllIIIllIl(this.logger.isErrorEnabled() ? 1 : 0)) {
            final FormattingTuple llllllllllllIllIIlllIIIIIIIllIlI = MessageFormatter.arrayFormat(llllllllllllIllIIlllIIIIIIIllIII, llllllllllllIllIIlllIIIIIIIlIlll);
            this.logger.error((Object)llllllllllllIllIIlllIIIIIIIllIlI.getMessage(), llllllllllllIllIIlllIIIIIIIllIlI.getThrowable());
        }
    }
    
    @Override
    public void info(final String llllllllllllIllIIlllIIIIlIlIIIlI, final Object llllllllllllIllIIlllIIIIlIlIIIIl) {
        if (lIIlIllllIIIllIl(this.logger.isInfoEnabled() ? 1 : 0)) {
            final FormattingTuple llllllllllllIllIIlllIIIIlIlIIlll = MessageFormatter.format(llllllllllllIllIIlllIIIIlIlIIIlI, llllllllllllIllIIlllIIIIlIlIIIIl);
            this.logger.info((Object)llllllllllllIllIIlllIIIIlIlIIlll.getMessage(), llllllllllllIllIIlllIIIIlIlIIlll.getThrowable());
        }
    }
    
    @Override
    public void info(final String llllllllllllIllIIlllIIIIlIIIIlll, final Object... llllllllllllIllIIlllIIIIlIIIlIIl) {
        if (lIIlIllllIIIllIl(this.logger.isInfoEnabled() ? 1 : 0)) {
            final FormattingTuple llllllllllllIllIIlllIIIIlIIIllII = MessageFormatter.arrayFormat(llllllllllllIllIIlllIIIIlIIIIlll, llllllllllllIllIIlllIIIIlIIIlIIl);
            this.logger.info((Object)llllllllllllIllIIlllIIIIlIIIllII.getMessage(), llllllllllllIllIIlllIIIIlIIIllII.getThrowable());
        }
    }
    
    @Override
    public void trace(final String llllllllllllIllIIlllIIIlIIIlIlll, final Object llllllllllllIllIIlllIIIlIIIlIIll) {
        if (lIIlIllllIIIllIl(this.logger.isTraceEnabled() ? 1 : 0)) {
            final FormattingTuple llllllllllllIllIIlllIIIlIIIllIIl = MessageFormatter.format(llllllllllllIllIIlllIIIlIIIlIlll, llllllllllllIllIIlllIIIlIIIlIIll);
            this.logger.trace((Object)llllllllllllIllIIlllIIIlIIIllIIl.getMessage(), llllllllllllIllIIlllIIIlIIIllIIl.getThrowable());
        }
    }
    
    @Override
    public boolean isDebugEnabled() {
        return this.logger.isDebugEnabled();
    }
    
    @Override
    public boolean isTraceEnabled() {
        return this.logger.isTraceEnabled();
    }
    
    CommonsLogger(final Log llllllllllllIllIIlllIIIlIIlIlIll, final String llllllllllllIllIIlllIIIlIIlIIlll) {
        super(llllllllllllIllIIlllIIIlIIlIIlll);
        if (lIIlIllllIIIllII(llllllllllllIllIIlllIIIlIIlIlIll)) {
            throw new NullPointerException(CommonsLogger.llIllIlIIIlIII[CommonsLogger.llIllIlIIIlIIl[0]]);
        }
        this.logger = llllllllllllIllIIlllIIIlIIlIlIll;
    }
    
    @Override
    public void trace(final String llllllllllllIllIIlllIIIIllllllII, final Object... llllllllllllIllIIlllIIIIlllllIll) {
        if (lIIlIllllIIIllIl(this.logger.isTraceEnabled() ? 1 : 0)) {
            final FormattingTuple llllllllllllIllIIlllIIIIlllllllI = MessageFormatter.arrayFormat(llllllllllllIllIIlllIIIIllllllII, llllllllllllIllIIlllIIIIlllllIll);
            this.logger.trace((Object)llllllllllllIllIIlllIIIIlllllllI.getMessage(), llllllllllllIllIIlllIIIIlllllllI.getThrowable());
        }
    }
    
    @Override
    public void debug(final String llllllllllllIllIIlllIIIIlllIIlll) {
        this.logger.debug((Object)llllllllllllIllIIlllIIIIlllIIlll);
    }
    
    @Override
    public void error(final String llllllllllllIllIIlllIIIIIIlllIlI) {
        this.logger.error((Object)llllllllllllIllIIlllIIIIIIlllIlI);
    }
    
    private static void lIIlIllllIIIlIll() {
        (llIllIlIIIlIIl = new int[3])[0] = ((0x6 ^ 0x6D ^ (0x14 ^ 0x60)) & (0x30 ^ 0x2A ^ (0x87 ^ 0x82) ^ -" ".length()));
        CommonsLogger.llIllIlIIIlIIl[1] = " ".length();
        CommonsLogger.llIllIlIIIlIIl[2] = "  ".length();
    }
    
    @Override
    public void error(final String llllllllllllIllIIlllIIIIIIlIIIlI, final Object llllllllllllIllIIlllIIIIIIlIIlIl, final Object llllllllllllIllIIlllIIIIIIlIIlII) {
        if (lIIlIllllIIIllIl(this.logger.isErrorEnabled() ? 1 : 0)) {
            final FormattingTuple llllllllllllIllIIlllIIIIIIlIlIII = MessageFormatter.format(llllllllllllIllIIlllIIIIIIlIIIlI, llllllllllllIllIIlllIIIIIIlIIlIl, llllllllllllIllIIlllIIIIIIlIIlII);
            this.logger.error((Object)llllllllllllIllIIlllIIIIIIlIlIII.getMessage(), llllllllllllIllIIlllIIIIIIlIlIII.getThrowable());
        }
    }
    
    @Override
    public void error(final String llllllllllllIllIIlllIIIIIIllIIII, final Object llllllllllllIllIIlllIIIIIIllIIlI) {
        if (lIIlIllllIIIllIl(this.logger.isErrorEnabled() ? 1 : 0)) {
            final FormattingTuple llllllllllllIllIIlllIIIIIIllIlIl = MessageFormatter.format(llllllllllllIllIIlllIIIIIIllIIII, llllllllllllIllIIlllIIIIIIllIIlI);
            this.logger.error((Object)llllllllllllIllIIlllIIIIIIllIlIl.getMessage(), llllllllllllIllIIlllIIIIIIllIlIl.getThrowable());
        }
    }
    
    @Override
    public void trace(final String llllllllllllIllIIlllIIIlIIIIIllI, final Object llllllllllllIllIIlllIIIlIIIIIlIl, final Object llllllllllllIllIIlllIIIlIIIIIlII) {
        if (lIIlIllllIIIllIl(this.logger.isTraceEnabled() ? 1 : 0)) {
            final FormattingTuple llllllllllllIllIIlllIIIlIIIIllII = MessageFormatter.format(llllllllllllIllIIlllIIIlIIIIIllI, llllllllllllIllIIlllIIIlIIIIIlIl, llllllllllllIllIIlllIIIlIIIIIlII);
            this.logger.trace((Object)llllllllllllIllIIlllIIIlIIIIllII.getMessage(), llllllllllllIllIIlllIIIlIIIIllII.getThrowable());
        }
    }
    
    @Override
    public void info(final String llllllllllllIllIIlllIIIIlIIIIIII, final Throwable llllllllllllIllIIlllIIIIIlllllII) {
        this.logger.info((Object)llllllllllllIllIIlllIIIIlIIIIIII, llllllllllllIllIIlllIIIIIlllllII);
    }
}
