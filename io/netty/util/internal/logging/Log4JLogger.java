// 
// Decompiled by Procyon v0.5.36
// 

package io.netty.util.internal.logging;

import org.apache.log4j.Priority;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;

class Log4JLogger extends AbstractInternalLogger
{
    final transient /* synthetic */ Logger logger;
    final /* synthetic */ boolean traceCapable;
    static final /* synthetic */ String FQCN;
    private static final /* synthetic */ int[] lIlIllIIIIIlII;
    
    @Override
    public void debug(final String lllllllllllllIIIIllllIIIIIIIIIII, final Object... lllllllllllllIIIIlllIlllllllllll) {
        if (llllIIIIIIlIIlI(this.logger.isDebugEnabled() ? 1 : 0)) {
            final FormattingTuple lllllllllllllIIIIllllIIIIIIIIIlI = MessageFormatter.arrayFormat(lllllllllllllIIIIllllIIIIIIIIIII, lllllllllllllIIIIlllIlllllllllll);
            this.logger.log(Log4JLogger.FQCN, (Priority)Level.DEBUG, (Object)lllllllllllllIIIIllllIIIIIIIIIlI.getMessage(), lllllllllllllIIIIllllIIIIIIIIIlI.getThrowable());
        }
    }
    
    @Override
    public void error(final String lllllllllllllIIIIlllIlllIlIIlIll, final Throwable lllllllllllllIIIIlllIlllIlIIIlll) {
        this.logger.log(Log4JLogger.FQCN, (Priority)Level.ERROR, (Object)lllllllllllllIIIIlllIlllIlIIlIll, lllllllllllllIIIIlllIlllIlIIIlll);
    }
    
    static {
        llllIIIIIIlIIIl();
        FQCN = Log4JLogger.class.getName();
    }
    
    @Override
    public void debug(final String lllllllllllllIIIIllllIIIIIIIlllI, final Object lllllllllllllIIIIllllIIIIIIIllIl, final Object lllllllllllllIIIIllllIIIIIIIllII) {
        if (llllIIIIIIlIIlI(this.logger.isDebugEnabled() ? 1 : 0)) {
            final FormattingTuple lllllllllllllIIIIllllIIIIIIlIIII = MessageFormatter.format(lllllllllllllIIIIllllIIIIIIIlllI, lllllllllllllIIIIllllIIIIIIIllIl, lllllllllllllIIIIllllIIIIIIIllII);
            this.logger.log(Log4JLogger.FQCN, (Priority)Level.DEBUG, (Object)lllllllllllllIIIIllllIIIIIIlIIII.getMessage(), lllllllllllllIIIIllllIIIIIIlIIII.getThrowable());
        }
    }
    
    @Override
    public void info(final String lllllllllllllIIIIlllIllllIllllIl, final Throwable lllllllllllllIIIIlllIllllIllllII) {
        this.logger.log(Log4JLogger.FQCN, (Priority)Level.INFO, (Object)lllllllllllllIIIIlllIllllIllllIl, lllllllllllllIIIIlllIllllIllllII);
    }
    
    @Override
    public void info(final String lllllllllllllIIIIlllIlllllIlllll, final Object lllllllllllllIIIIlllIlllllIllllI) {
        if (llllIIIIIIlIIlI(this.logger.isInfoEnabled() ? 1 : 0)) {
            final FormattingTuple lllllllllllllIIIIlllIllllllIIlII = MessageFormatter.format(lllllllllllllIIIIlllIlllllIlllll, lllllllllllllIIIIlllIlllllIllllI);
            this.logger.log(Log4JLogger.FQCN, (Priority)Level.INFO, (Object)lllllllllllllIIIIlllIllllllIIlII.getMessage(), lllllllllllllIIIIlllIllllllIIlII.getThrowable());
        }
    }
    
    @Override
    public void trace(final String lllllllllllllIIIIllllIIIIlIIIlll, final Object lllllllllllllIIIIllllIIIIlIIIllI, final Object lllllllllllllIIIIllllIIIIlIIIlIl) {
        if (llllIIIIIIlIIlI(this.isTraceEnabled() ? 1 : 0)) {
            final FormattingTuple lllllllllllllIIIIllllIIIIlIIlIIl = MessageFormatter.format(lllllllllllllIIIIllllIIIIlIIIlll, lllllllllllllIIIIllllIIIIlIIIllI, lllllllllllllIIIIllllIIIIlIIIlIl);
            final Logger logger = this.logger;
            final String fqcn = Log4JLogger.FQCN;
            Level level;
            if (llllIIIIIIlIIlI(this.traceCapable ? 1 : 0)) {
                level = Level.TRACE;
                "".length();
                if (((0xC7 ^ 0x97 ^ (0x65 ^ 0x6)) & (0x4C ^ 0x60 ^ (0x63 ^ 0x7C) ^ -" ".length())) >= " ".length()) {
                    return;
                }
            }
            else {
                level = Level.DEBUG;
            }
            logger.log(fqcn, (Priority)level, (Object)lllllllllllllIIIIllllIIIIlIIlIIl.getMessage(), lllllllllllllIIIIllllIIIIlIIlIIl.getThrowable());
        }
    }
    
    @Override
    public void error(final String lllllllllllllIIIIlllIlllIllIllIl, final Object lllllllllllllIIIIlllIlllIllIllll) {
        if (llllIIIIIIlIIlI(this.logger.isEnabledFor((Priority)Level.ERROR) ? 1 : 0)) {
            final FormattingTuple lllllllllllllIIIIlllIlllIlllIIlI = MessageFormatter.format(lllllllllllllIIIIlllIlllIllIllIl, lllllllllllllIIIIlllIlllIllIllll);
            this.logger.log(Log4JLogger.FQCN, (Priority)Level.ERROR, (Object)lllllllllllllIIIIlllIlllIlllIIlI.getMessage(), lllllllllllllIIIIlllIlllIlllIIlI.getThrowable());
        }
    }
    
    @Override
    public void debug(final String lllllllllllllIIIIlllIlllllllIIll, final Throwable lllllllllllllIIIIlllIlllllllIIlI) {
        this.logger.log(Log4JLogger.FQCN, (Priority)Level.DEBUG, (Object)lllllllllllllIIIIlllIlllllllIIll, lllllllllllllIIIIlllIlllllllIIlI);
    }
    
    @Override
    public void trace(final String lllllllllllllIIIIllllIIIIIlIllll, final Throwable lllllllllllllIIIIllllIIIIIlIlllI) {
        final Logger logger = this.logger;
        final String fqcn = Log4JLogger.FQCN;
        Level level;
        if (llllIIIIIIlIIlI(this.traceCapable ? 1 : 0)) {
            level = Level.TRACE;
            "".length();
            if ("  ".length() <= ((0xD4 ^ 0x9C ^ (0x68 ^ 0x2E)) & (177 + 99 - 170 + 85 ^ 80 + 50 - 104 + 151 ^ -" ".length()))) {
                return;
            }
        }
        else {
            level = Level.DEBUG;
        }
        logger.log(fqcn, (Priority)level, (Object)lllllllllllllIIIIllllIIIIIlIllll, lllllllllllllIIIIllllIIIIIlIlllI);
    }
    
    @Override
    public void error(final String lllllllllllllIIIIlllIlllIlIlllll, final Object lllllllllllllIIIIlllIlllIlIllllI, final Object lllllllllllllIIIIlllIlllIllIIIIl) {
        if (llllIIIIIIlIIlI(this.logger.isEnabledFor((Priority)Level.ERROR) ? 1 : 0)) {
            final FormattingTuple lllllllllllllIIIIlllIlllIllIIlIl = MessageFormatter.format(lllllllllllllIIIIlllIlllIlIlllll, lllllllllllllIIIIlllIlllIlIllllI, lllllllllllllIIIIlllIlllIllIIIIl);
            this.logger.log(Log4JLogger.FQCN, (Priority)Level.ERROR, (Object)lllllllllllllIIIIlllIlllIllIIlIl.getMessage(), lllllllllllllIIIIlllIlllIllIIlIl.getThrowable());
        }
    }
    
    private static boolean llllIIIIIIlIIlI(final int lllllllllllllIIIIlllIlllIlIIIlIl) {
        return lllllllllllllIIIIlllIlllIlIIIlIl != 0;
    }
    
    @Override
    public void warn(final String lllllllllllllIIIIlllIllllIIIlllI, final Object... lllllllllllllIIIIlllIllllIIIllIl) {
        if (llllIIIIIIlIIlI(this.logger.isEnabledFor((Priority)Level.WARN) ? 1 : 0)) {
            final FormattingTuple lllllllllllllIIIIlllIllllIIlIIII = MessageFormatter.arrayFormat(lllllllllllllIIIIlllIllllIIIlllI, lllllllllllllIIIIlllIllllIIIllIl);
            this.logger.log(Log4JLogger.FQCN, (Priority)Level.WARN, (Object)lllllllllllllIIIIlllIllllIIlIIII.getMessage(), lllllllllllllIIIIlllIllllIIlIIII.getThrowable());
        }
    }
    
    @Override
    public void warn(final String lllllllllllllIIIIlllIllllIlIlIIl, final Object lllllllllllllIIIIlllIllllIlIIlIl) {
        if (llllIIIIIIlIIlI(this.logger.isEnabledFor((Priority)Level.WARN) ? 1 : 0)) {
            final FormattingTuple lllllllllllllIIIIlllIllllIlIlIll = MessageFormatter.format(lllllllllllllIIIIlllIllllIlIlIIl, lllllllllllllIIIIlllIllllIlIIlIl);
            this.logger.log(Log4JLogger.FQCN, (Priority)Level.WARN, (Object)lllllllllllllIIIIlllIllllIlIlIll.getMessage(), lllllllllllllIIIIlllIllllIlIlIll.getThrowable());
        }
    }
    
    @Override
    public void trace(final String lllllllllllllIIIIllllIIIIlIlIlII, final Object lllllllllllllIIIIllllIIIIlIlIIII) {
        if (llllIIIIIIlIIlI(this.isTraceEnabled() ? 1 : 0)) {
            final FormattingTuple lllllllllllllIIIIllllIIIIlIlIllI = MessageFormatter.format(lllllllllllllIIIIllllIIIIlIlIlII, lllllllllllllIIIIllllIIIIlIlIIII);
            final Logger logger = this.logger;
            final String fqcn = Log4JLogger.FQCN;
            Level level;
            if (llllIIIIIIlIIlI(this.traceCapable ? 1 : 0)) {
                level = Level.TRACE;
                "".length();
                if ((0x1B ^ 0x1C ^ "  ".length()) == 0x0) {
                    return;
                }
            }
            else {
                level = Level.DEBUG;
            }
            logger.log(fqcn, (Priority)level, (Object)lllllllllllllIIIIllllIIIIlIlIllI.getMessage(), lllllllllllllIIIIllllIIIIlIlIllI.getThrowable());
        }
    }
    
    @Override
    public void error(final String lllllllllllllIIIIlllIlllIllllIIl) {
        this.logger.log(Log4JLogger.FQCN, (Priority)Level.ERROR, (Object)lllllllllllllIIIIlllIlllIllllIIl, (Throwable)null);
    }
    
    @Override
    public void info(final String lllllllllllllIIIIlllIllllllIlIIl) {
        this.logger.log(Log4JLogger.FQCN, (Priority)Level.INFO, (Object)lllllllllllllIIIIlllIllllllIlIIl, (Throwable)null);
    }
    
    @Override
    public boolean isInfoEnabled() {
        return this.logger.isInfoEnabled();
    }
    
    @Override
    public void debug(final String lllllllllllllIIIIllllIIIIIlIIlII) {
        this.logger.log(Log4JLogger.FQCN, (Priority)Level.DEBUG, (Object)lllllllllllllIIIIllllIIIIIlIIlII, (Throwable)null);
    }
    
    @Override
    public void error(final String lllllllllllllIIIIlllIlllIlIlIIlI, final Object... lllllllllllllIIIIlllIlllIlIlIlII) {
        if (llllIIIIIIlIIlI(this.logger.isEnabledFor((Priority)Level.ERROR) ? 1 : 0)) {
            final FormattingTuple lllllllllllllIIIIlllIlllIlIlIlll = MessageFormatter.arrayFormat(lllllllllllllIIIIlllIlllIlIlIIlI, lllllllllllllIIIIlllIlllIlIlIlII);
            this.logger.log(Log4JLogger.FQCN, (Priority)Level.ERROR, (Object)lllllllllllllIIIIlllIlllIlIlIlll.getMessage(), lllllllllllllIIIIlllIlllIlIlIlll.getThrowable());
        }
    }
    
    @Override
    public void trace(final String lllllllllllllIIIIllllIIIIIllIllI, final Object... lllllllllllllIIIIllllIIIIIllIlIl) {
        if (llllIIIIIIlIIlI(this.isTraceEnabled() ? 1 : 0)) {
            final FormattingTuple lllllllllllllIIIIllllIIIIIlllIll = MessageFormatter.arrayFormat(lllllllllllllIIIIllllIIIIIllIllI, lllllllllllllIIIIllllIIIIIllIlIl);
            final Logger logger = this.logger;
            final String fqcn = Log4JLogger.FQCN;
            Level level;
            if (llllIIIIIIlIIlI(this.traceCapable ? 1 : 0)) {
                level = Level.TRACE;
                "".length();
                if ("  ".length() <= -" ".length()) {
                    return;
                }
            }
            else {
                level = Level.DEBUG;
            }
            logger.log(fqcn, (Priority)level, (Object)lllllllllllllIIIIllllIIIIIlllIll.getMessage(), lllllllllllllIIIIllllIIIIIlllIll.getThrowable());
        }
    }
    
    @Override
    public void debug(final String lllllllllllllIIIIllllIIIIIIllIll, final Object lllllllllllllIIIIllllIIIIIIllIlI) {
        if (llllIIIIIIlIIlI(this.logger.isDebugEnabled() ? 1 : 0)) {
            final FormattingTuple lllllllllllllIIIIllllIIIIIIlllIl = MessageFormatter.format(lllllllllllllIIIIllllIIIIIIllIll, lllllllllllllIIIIllllIIIIIIllIlI);
            this.logger.log(Log4JLogger.FQCN, (Priority)Level.DEBUG, (Object)lllllllllllllIIIIllllIIIIIIlllIl.getMessage(), lllllllllllllIIIIllllIIIIIIlllIl.getThrowable());
        }
    }
    
    private static void llllIIIIIIlIIIl() {
        (lIlIllIIIIIlII = new int[2])[0] = " ".length();
        Log4JLogger.lIlIllIIIIIlII[1] = ((((0x5A ^ 0x1A) & ~(0xFC ^ 0xBC)) ^ (0x17 ^ 0x9)) & (73 + 186 - 258 + 186 ^ 98 + 36 + 14 + 17 ^ -" ".length()));
    }
    
    Log4JLogger(final Logger lllllllllllllIIIIllllIIIIllIlIlI) {
        super(lllllllllllllIIIIllllIIIIllIlIlI.getName());
        this.logger = lllllllllllllIIIIllllIIIIllIlIlI;
        this.traceCapable = this.isTraceCapable();
    }
    
    @Override
    public void trace(final String lllllllllllllIIIIllllIIIIlIlllIl) {
        final Logger logger = this.logger;
        final String fqcn = Log4JLogger.FQCN;
        Level level;
        if (llllIIIIIIlIIlI(this.traceCapable ? 1 : 0)) {
            level = Level.TRACE;
            "".length();
            if (null != null) {
                return;
            }
        }
        else {
            level = Level.DEBUG;
        }
        logger.log(fqcn, (Priority)level, (Object)lllllllllllllIIIIllllIIIIlIlllIl, (Throwable)null);
    }
    
    @Override
    public boolean isWarnEnabled() {
        return this.logger.isEnabledFor((Priority)Level.WARN);
    }
    
    @Override
    public boolean isTraceEnabled() {
        if (llllIIIIIIlIIlI(this.traceCapable ? 1 : 0)) {
            return this.logger.isTraceEnabled();
        }
        return this.logger.isDebugEnabled();
    }
    
    @Override
    public void warn(final String lllllllllllllIIIIlllIllllIllIIII) {
        this.logger.log(Log4JLogger.FQCN, (Priority)Level.WARN, (Object)lllllllllllllIIIIlllIllllIllIIII, (Throwable)null);
    }
    
    @Override
    public void warn(final String lllllllllllllIIIIlllIllllIIllIII, final Object lllllllllllllIIIIlllIllllIIlIlll, final Object lllllllllllllIIIIlllIllllIIlIllI) {
        if (llllIIIIIIlIIlI(this.logger.isEnabledFor((Priority)Level.WARN) ? 1 : 0)) {
            final FormattingTuple lllllllllllllIIIIlllIllllIIllllI = MessageFormatter.format(lllllllllllllIIIIlllIllllIIllIII, lllllllllllllIIIIlllIllllIIlIlll, lllllllllllllIIIIlllIllllIIlIllI);
            this.logger.log(Log4JLogger.FQCN, (Priority)Level.WARN, (Object)lllllllllllllIIIIlllIllllIIllllI.getMessage(), lllllllllllllIIIIlllIllllIIllllI.getThrowable());
        }
    }
    
    @Override
    public void info(final String lllllllllllllIIIIlllIlllllIlIlIl, final Object lllllllllllllIIIIlllIlllllIlIIII, final Object lllllllllllllIIIIlllIlllllIIllll) {
        if (llllIIIIIIlIIlI(this.logger.isInfoEnabled() ? 1 : 0)) {
            final FormattingTuple lllllllllllllIIIIlllIlllllIlIlll = MessageFormatter.format(lllllllllllllIIIIlllIlllllIlIlIl, lllllllllllllIIIIlllIlllllIlIIII, lllllllllllllIIIIlllIlllllIIllll);
            this.logger.log(Log4JLogger.FQCN, (Priority)Level.INFO, (Object)lllllllllllllIIIIlllIlllllIlIlll.getMessage(), lllllllllllllIIIIlllIlllllIlIlll.getThrowable());
        }
    }
    
    @Override
    public void warn(final String lllllllllllllIIIIlllIllllIIIIIIl, final Throwable lllllllllllllIIIIlllIllllIIIIIll) {
        this.logger.log(Log4JLogger.FQCN, (Priority)Level.WARN, (Object)lllllllllllllIIIIlllIllllIIIIIIl, lllllllllllllIIIIlllIllllIIIIIll);
    }
    
    @Override
    public boolean isErrorEnabled() {
        return this.logger.isEnabledFor((Priority)Level.ERROR);
    }
    
    @Override
    public boolean isDebugEnabled() {
        return this.logger.isDebugEnabled();
    }
    
    private boolean isTraceCapable() {
        try {
            this.logger.isTraceEnabled();
            "".length();
            return Log4JLogger.lIlIllIIIIIlII[0] != 0;
        }
        catch (NoSuchMethodError lllllllllllllIIIIllllIIIIllIIlll) {
            return Log4JLogger.lIlIllIIIIIlII[1] != 0;
        }
    }
    
    @Override
    public void info(final String lllllllllllllIIIIlllIlllllIIIlll, final Object... lllllllllllllIIIIlllIlllllIIIllI) {
        if (llllIIIIIIlIIlI(this.logger.isInfoEnabled() ? 1 : 0)) {
            final FormattingTuple lllllllllllllIIIIlllIlllllIIlIIl = MessageFormatter.arrayFormat(lllllllllllllIIIIlllIlllllIIIlll, lllllllllllllIIIIlllIlllllIIIllI);
            this.logger.log(Log4JLogger.FQCN, (Priority)Level.INFO, (Object)lllllllllllllIIIIlllIlllllIIlIIl.getMessage(), lllllllllllllIIIIlllIlllllIIlIIl.getThrowable());
        }
    }
}
