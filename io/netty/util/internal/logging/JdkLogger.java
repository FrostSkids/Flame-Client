// 
// Decompiled by Procyon v0.5.36
// 

package io.netty.util.internal.logging;

import java.util.logging.LogRecord;
import java.util.logging.Level;
import java.util.logging.Logger;

class JdkLogger extends AbstractInternalLogger
{
    static final /* synthetic */ String SUPER;
    static final /* synthetic */ String SELF;
    final transient /* synthetic */ Logger logger;
    private static final /* synthetic */ int[] llIlIIlllllIll;
    
    @Override
    public void debug(final String llllllllllllIllIlIllIlIllIlIlIlI, final Throwable llllllllllllIllIlIllIlIllIlIIllI) {
        if (lIIlIIllIlIllIll(this.logger.isLoggable(Level.FINE) ? 1 : 0)) {
            this.log(JdkLogger.SELF, Level.FINE, llllllllllllIllIlIllIlIllIlIlIlI, llllllllllllIllIlIllIlIllIlIIllI);
        }
    }
    
    @Override
    public void error(final String llllllllllllIllIlIllIlIlIIlIlIll) {
        if (lIIlIIllIlIllIll(this.logger.isLoggable(Level.SEVERE) ? 1 : 0)) {
            this.log(JdkLogger.SELF, Level.SEVERE, llllllllllllIllIlIllIlIlIIlIlIll, null);
        }
    }
    
    @Override
    public void debug(final String llllllllllllIllIlIllIlIllIllIlII, final Object... llllllllllllIllIlIllIlIllIllIIII) {
        if (lIIlIIllIlIllIll(this.logger.isLoggable(Level.FINE) ? 1 : 0)) {
            final FormattingTuple llllllllllllIllIlIllIlIllIllIllI = MessageFormatter.arrayFormat(llllllllllllIllIlIllIlIllIllIlII, llllllllllllIllIlIllIlIllIllIIII);
            this.log(JdkLogger.SELF, Level.FINE, llllllllllllIllIlIllIlIllIllIllI.getMessage(), llllllllllllIllIlIllIlIllIllIllI.getThrowable());
        }
    }
    
    @Override
    public void info(final String llllllllllllIllIlIllIlIlIllllIII, final Object... llllllllllllIllIlIllIlIlIllllIlI) {
        if (lIIlIIllIlIllIll(this.logger.isLoggable(Level.INFO) ? 1 : 0)) {
            final FormattingTuple llllllllllllIllIlIllIlIlIlllllIl = MessageFormatter.arrayFormat(llllllllllllIllIlIllIlIlIllllIII, llllllllllllIllIlIllIlIlIllllIlI);
            this.log(JdkLogger.SELF, Level.INFO, llllllllllllIllIlIllIlIlIlllllIl.getMessage(), llllllllllllIllIlIllIlIlIlllllIl.getThrowable());
        }
    }
    
    @Override
    public boolean isInfoEnabled() {
        return this.logger.isLoggable(Level.INFO);
    }
    
    private static boolean lIIlIIllIlIlllII(final int llllllllllllIllIlIllIlIIllIIlllI, final int llllllllllllIllIlIllIlIIllIIllIl) {
        return llllllllllllIllIlIllIlIIllIIlllI < llllllllllllIllIlIllIlIIllIIllIl;
    }
    
    private static boolean lIIlIIllIlIllllI(final int llllllllllllIllIlIllIlIIllIIIllI, final int llllllllllllIllIlIllIlIIllIIIlIl) {
        return llllllllllllIllIlIllIlIIllIIIllI != llllllllllllIllIlIllIlIIllIIIlIl;
    }
    
    @Override
    public void debug(final String llllllllllllIllIlIllIlIlllIIllll, final Object llllllllllllIllIlIllIlIlllIIlllI) {
        if (lIIlIIllIlIllIll(this.logger.isLoggable(Level.FINE) ? 1 : 0)) {
            final FormattingTuple llllllllllllIllIlIllIlIlllIlIIIl = MessageFormatter.format(llllllllllllIllIlIllIlIlllIIllll, llllllllllllIllIlIllIlIlllIIlllI);
            this.log(JdkLogger.SELF, Level.FINE, llllllllllllIllIlIllIlIlllIlIIIl.getMessage(), llllllllllllIllIlIllIlIlllIlIIIl.getThrowable());
        }
    }
    
    @Override
    public void trace(final String llllllllllllIllIlIllIllIIIIlIIIl) {
        if (lIIlIIllIlIllIll(this.logger.isLoggable(Level.FINEST) ? 1 : 0)) {
            this.log(JdkLogger.SELF, Level.FINEST, llllllllllllIllIlIllIllIIIIlIIIl, null);
        }
    }
    
    private static void fillCallerData(final String llllllllllllIllIlIllIlIIllIlIlll, final LogRecord llllllllllllIllIlIllIlIIllIllIll) {
        final StackTraceElement[] llllllllllllIllIlIllIlIIllIllIlI = new Throwable().getStackTrace();
        int llllllllllllIllIlIllIlIIllIllIIl = JdkLogger.llIlIIlllllIll[0];
        int llllllllllllIllIlIllIlIIlllIIIII = JdkLogger.llIlIIlllllIll[1];
        while (lIIlIIllIlIlllII(llllllllllllIllIlIllIlIIlllIIIII, llllllllllllIllIlIllIlIIllIllIlI.length)) {
            final String llllllllllllIllIlIllIlIIlllIIIIl = llllllllllllIllIlIllIlIIllIllIlI[llllllllllllIllIlIllIlIIlllIIIII].getClassName();
            if (!lIIlIIllIlIlllIl(llllllllllllIllIlIllIlIIlllIIIIl.equals(llllllllllllIllIlIllIlIIllIlIlll) ? 1 : 0) || lIIlIIllIlIllIll(llllllllllllIllIlIllIlIIlllIIIIl.equals(JdkLogger.SUPER) ? 1 : 0)) {
                llllllllllllIllIlIllIlIIllIllIIl = llllllllllllIllIlIllIlIIlllIIIII;
                "".length();
                if (null != null) {
                    return;
                }
                break;
            }
            else {
                ++llllllllllllIllIlIllIlIIlllIIIII;
                "".length();
                if (-"   ".length() >= 0) {
                    return;
                }
                continue;
            }
        }
        int llllllllllllIllIlIllIlIIllIllIII = JdkLogger.llIlIIlllllIll[0];
        int llllllllllllIllIlIllIlIIllIllllI = llllllllllllIllIlIllIlIIllIllIIl + JdkLogger.llIlIIlllllIll[2];
        while (lIIlIIllIlIlllII(llllllllllllIllIlIllIlIIllIllllI, llllllllllllIllIlIllIlIIllIllIlI.length)) {
            final String llllllllllllIllIlIllIlIIllIlllll = llllllllllllIllIlIllIlIIllIllIlI[llllllllllllIllIlIllIlIIllIllllI].getClassName();
            if (lIIlIIllIlIlllIl(llllllllllllIllIlIllIlIIllIlllll.equals(llllllllllllIllIlIllIlIIllIlIlll) ? 1 : 0) && lIIlIIllIlIlllIl(llllllllllllIllIlIllIlIIllIlllll.equals(JdkLogger.SUPER) ? 1 : 0)) {
                llllllllllllIllIlIllIlIIllIllIII = llllllllllllIllIlIllIlIIllIllllI;
                "".length();
                if (("  ".length() & ("  ".length() ^ -" ".length())) > 0) {
                    return;
                }
                break;
            }
            else {
                ++llllllllllllIllIlIllIlIIllIllllI;
                "".length();
                if ("   ".length() >= (0x50 ^ 0x0 ^ (0x4B ^ 0x1F))) {
                    return;
                }
                continue;
            }
        }
        if (lIIlIIllIlIllllI(llllllllllllIllIlIllIlIIllIllIII, JdkLogger.llIlIIlllllIll[0])) {
            final StackTraceElement llllllllllllIllIlIllIlIIllIlllIl = llllllllllllIllIlIllIlIIllIllIlI[llllllllllllIllIlIllIlIIllIllIII];
            llllllllllllIllIlIllIlIIllIllIll.setSourceClassName(llllllllllllIllIlIllIlIIllIlllIl.getClassName());
            llllllllllllIllIlIllIlIIllIllIll.setSourceMethodName(llllllllllllIllIlIllIlIIllIlllIl.getMethodName());
        }
    }
    
    private static void lIIlIIllIlIllIlI() {
        (llIlIIlllllIll = new int[3])[0] = -" ".length();
        JdkLogger.llIlIIlllllIll[1] = ((0x4D ^ 0x53 ^ (0xD8 ^ 0x89)) & (0x78 ^ 0x10 ^ (0x9E ^ 0xB9) ^ -" ".length()));
        JdkLogger.llIlIIlllllIll[2] = " ".length();
    }
    
    @Override
    public void trace(final String llllllllllllIllIlIllIlIllllllIll, final Object llllllllllllIllIlIllIlIlllllIllI, final Object llllllllllllIllIlIllIlIllllllIIl) {
        if (lIIlIIllIlIllIll(this.logger.isLoggable(Level.FINEST) ? 1 : 0)) {
            final FormattingTuple llllllllllllIllIlIllIlIlllllllIl = MessageFormatter.format(llllllllllllIllIlIllIlIllllllIll, llllllllllllIllIlIllIlIlllllIllI, llllllllllllIllIlIllIlIllllllIIl);
            this.log(JdkLogger.SELF, Level.FINEST, llllllllllllIllIlIllIlIlllllllIl.getMessage(), llllllllllllIllIlIllIlIlllllllIl.getThrowable());
        }
    }
    
    @Override
    public void warn(final String llllllllllllIllIlIllIlIlIllIIlII) {
        if (lIIlIIllIlIllIll(this.logger.isLoggable(Level.WARNING) ? 1 : 0)) {
            this.log(JdkLogger.SELF, Level.WARNING, llllllllllllIllIlIllIlIlIllIIlII, null);
        }
    }
    
    @Override
    public void error(final String llllllllllllIllIlIllIlIlIIIlIlll, final Object llllllllllllIllIlIllIlIlIIIlIllI, final Object llllllllllllIllIlIllIlIlIIIlIlIl) {
        if (lIIlIIllIlIllIll(this.logger.isLoggable(Level.SEVERE) ? 1 : 0)) {
            final FormattingTuple llllllllllllIllIlIllIlIlIIIllIIl = MessageFormatter.format(llllllllllllIllIlIllIlIlIIIlIlll, llllllllllllIllIlIllIlIlIIIlIllI, llllllllllllIllIlIllIlIlIIIlIlIl);
            this.log(JdkLogger.SELF, Level.SEVERE, llllllllllllIllIlIllIlIlIIIllIIl.getMessage(), llllllllllllIllIlIllIlIlIIIllIIl.getThrowable());
        }
    }
    
    @Override
    public void info(final String llllllllllllIllIlIllIlIllIIlIIll, final Object llllllllllllIllIlIllIlIllIIlIlIl) {
        if (lIIlIIllIlIllIll(this.logger.isLoggable(Level.INFO) ? 1 : 0)) {
            final FormattingTuple llllllllllllIllIlIllIlIllIIllIII = MessageFormatter.format(llllllllllllIllIlIllIlIllIIlIIll, llllllllllllIllIlIllIlIllIIlIlIl);
            this.log(JdkLogger.SELF, Level.INFO, llllllllllllIllIlIllIlIllIIllIII.getMessage(), llllllllllllIllIlIllIlIllIIllIII.getThrowable());
        }
    }
    
    @Override
    public void warn(final String llllllllllllIllIlIllIlIlIlIllIlI, final Object llllllllllllIllIlIllIlIlIlIlllII) {
        if (lIIlIIllIlIllIll(this.logger.isLoggable(Level.WARNING) ? 1 : 0)) {
            final FormattingTuple llllllllllllIllIlIllIlIlIlIlllll = MessageFormatter.format(llllllllllllIllIlIllIlIlIlIllIlI, llllllllllllIllIlIllIlIlIlIlllII);
            this.log(JdkLogger.SELF, Level.WARNING, llllllllllllIllIlIllIlIlIlIlllll.getMessage(), llllllllllllIllIlIllIlIlIlIlllll.getThrowable());
        }
    }
    
    @Override
    public void warn(final String llllllllllllIllIlIllIlIlIlIIIIlI, final Object... llllllllllllIllIlIllIlIlIIlllllI) {
        if (lIIlIIllIlIllIll(this.logger.isLoggable(Level.WARNING) ? 1 : 0)) {
            final FormattingTuple llllllllllllIllIlIllIlIlIlIIIlII = MessageFormatter.arrayFormat(llllllllllllIllIlIllIlIlIlIIIIlI, llllllllllllIllIlIllIlIlIIlllllI);
            this.log(JdkLogger.SELF, Level.WARNING, llllllllllllIllIlIllIlIlIlIIIlII.getMessage(), llllllllllllIllIlIllIlIlIlIIIlII.getThrowable());
        }
    }
    
    @Override
    public void trace(final String llllllllllllIllIlIllIlIllllIlIlI, final Object... llllllllllllIllIlIllIlIllllIlIIl) {
        if (lIIlIIllIlIllIll(this.logger.isLoggable(Level.FINEST) ? 1 : 0)) {
            final FormattingTuple llllllllllllIllIlIllIlIllllIllll = MessageFormatter.arrayFormat(llllllllllllIllIlIllIlIllllIlIlI, llllllllllllIllIlIllIlIllllIlIIl);
            this.log(JdkLogger.SELF, Level.FINEST, llllllllllllIllIlIllIlIllllIllll.getMessage(), llllllllllllIllIlIllIlIllllIllll.getThrowable());
        }
    }
    
    @Override
    public boolean isTraceEnabled() {
        return this.logger.isLoggable(Level.FINEST);
    }
    
    @Override
    public void error(final String llllllllllllIllIlIllIlIlIIIIIllI, final Object... llllllllllllIllIlIllIlIlIIIIlIII) {
        if (lIIlIIllIlIllIll(this.logger.isLoggable(Level.SEVERE) ? 1 : 0)) {
            final FormattingTuple llllllllllllIllIlIllIlIlIIIIlIll = MessageFormatter.arrayFormat(llllllllllllIllIlIllIlIlIIIIIllI, llllllllllllIllIlIllIlIlIIIIlIII);
            this.log(JdkLogger.SELF, Level.SEVERE, llllllllllllIllIlIllIlIlIIIIlIll.getMessage(), llllllllllllIllIlIllIlIlIIIIlIll.getThrowable());
        }
    }
    
    @Override
    public void trace(final String llllllllllllIllIlIllIlIllllIIIII, final Throwable llllllllllllIllIlIllIlIllllIIIlI) {
        if (lIIlIIllIlIllIll(this.logger.isLoggable(Level.FINEST) ? 1 : 0)) {
            this.log(JdkLogger.SELF, Level.FINEST, llllllllllllIllIlIllIlIllllIIIII, llllllllllllIllIlIllIlIllllIIIlI);
        }
    }
    
    @Override
    public void info(final String llllllllllllIllIlIllIlIllIIlllll) {
        if (lIIlIIllIlIllIll(this.logger.isLoggable(Level.INFO) ? 1 : 0)) {
            this.log(JdkLogger.SELF, Level.INFO, llllllllllllIllIlIllIlIllIIlllll, null);
        }
    }
    
    @Override
    public void debug(final String llllllllllllIllIlIllIlIlllIllIII) {
        if (lIIlIIllIlIllIll(this.logger.isLoggable(Level.FINE) ? 1 : 0)) {
            this.log(JdkLogger.SELF, Level.FINE, llllllllllllIllIlIllIlIlllIllIII, null);
        }
    }
    
    @Override
    public void warn(final String llllllllllllIllIlIllIlIlIlIIllII, final Object llllllllllllIllIlIllIlIlIlIIllll, final Object llllllllllllIllIlIllIlIlIlIIlllI) {
        if (lIIlIIllIlIllIll(this.logger.isLoggable(Level.WARNING) ? 1 : 0)) {
            final FormattingTuple llllllllllllIllIlIllIlIlIlIlIIlI = MessageFormatter.format(llllllllllllIllIlIllIlIlIlIIllII, llllllllllllIllIlIllIlIlIlIIllll, llllllllllllIllIlIllIlIlIlIIlllI);
            this.log(JdkLogger.SELF, Level.WARNING, llllllllllllIllIlIllIlIlIlIlIIlI.getMessage(), llllllllllllIllIlIllIlIlIlIlIIlI.getThrowable());
        }
    }
    
    @Override
    public void error(final String llllllllllllIllIlIllIlIIllllllII, final Throwable llllllllllllIllIlIllIlIIlllllIll) {
        if (lIIlIIllIlIllIll(this.logger.isLoggable(Level.SEVERE) ? 1 : 0)) {
            this.log(JdkLogger.SELF, Level.SEVERE, llllllllllllIllIlIllIlIIllllllII, llllllllllllIllIlIllIlIIlllllIll);
        }
    }
    
    @Override
    public void trace(final String llllllllllllIllIlIllIllIIIIIIlIl, final Object llllllllllllIllIlIllIllIIIIIIlII) {
        if (lIIlIIllIlIllIll(this.logger.isLoggable(Level.FINEST) ? 1 : 0)) {
            final FormattingTuple llllllllllllIllIlIllIllIIIIIlIlI = MessageFormatter.format(llllllllllllIllIlIllIllIIIIIIlIl, llllllllllllIllIlIllIllIIIIIIlII);
            this.log(JdkLogger.SELF, Level.FINEST, llllllllllllIllIlIllIllIIIIIlIlI.getMessage(), llllllllllllIllIlIllIllIIIIIlIlI.getThrowable());
        }
    }
    
    @Override
    public boolean isWarnEnabled() {
        return this.logger.isLoggable(Level.WARNING);
    }
    
    private void log(final String llllllllllllIllIlIllIlIIllllIIll, final Level llllllllllllIllIlIllIlIIlllIllII, final String llllllllllllIllIlIllIlIIlllIlIll, final Throwable llllllllllllIllIlIllIlIIllllIIII) {
        final LogRecord llllllllllllIllIlIllIlIIlllIllll = new LogRecord(llllllllllllIllIlIllIlIIlllIllII, llllllllllllIllIlIllIlIIlllIlIll);
        llllllllllllIllIlIllIlIIlllIllll.setLoggerName(this.name());
        llllllllllllIllIlIllIlIIlllIllll.setThrown(llllllllllllIllIlIllIlIIllllIIII);
        fillCallerData(llllllllllllIllIlIllIlIIllllIIll, llllllllllllIllIlIllIlIIlllIllll);
        this.logger.log(llllllllllllIllIlIllIlIIlllIllll);
    }
    
    private static boolean lIIlIIllIlIllIll(final int llllllllllllIllIlIllIlIIllIIlIll) {
        return llllllllllllIllIlIllIlIIllIIlIll != 0;
    }
    
    @Override
    public void info(final String llllllllllllIllIlIllIlIlIlllIIIl, final Throwable llllllllllllIllIlIllIlIlIllIllIl) {
        if (lIIlIIllIlIllIll(this.logger.isLoggable(Level.INFO) ? 1 : 0)) {
            this.log(JdkLogger.SELF, Level.INFO, llllllllllllIllIlIllIlIlIlllIIIl, llllllllllllIllIlIllIlIlIllIllIl);
        }
    }
    
    private static boolean lIIlIIllIlIlllIl(final int llllllllllllIllIlIllIlIIllIIlIIl) {
        return llllllllllllIllIlIllIlIIllIIlIIl == 0;
    }
    
    @Override
    public void info(final String llllllllllllIllIlIllIlIllIIIlIIl, final Object llllllllllllIllIlIllIlIllIIIIlII, final Object llllllllllllIllIlIllIlIllIIIIIll) {
        if (lIIlIIllIlIllIll(this.logger.isLoggable(Level.INFO) ? 1 : 0)) {
            final FormattingTuple llllllllllllIllIlIllIlIllIIIlIll = MessageFormatter.format(llllllllllllIllIlIllIlIllIIIlIIl, llllllllllllIllIlIllIlIllIIIIlII, llllllllllllIllIlIllIlIllIIIIIll);
            this.log(JdkLogger.SELF, Level.INFO, llllllllllllIllIlIllIlIllIIIlIll.getMessage(), llllllllllllIllIlIllIlIllIIIlIll.getThrowable());
        }
    }
    
    @Override
    public boolean isDebugEnabled() {
        return this.logger.isLoggable(Level.FINE);
    }
    
    JdkLogger(final Logger llllllllllllIllIlIllIllIIIIllIII) {
        super(llllllllllllIllIlIllIllIIIIllIII.getName());
        this.logger = llllllllllllIllIlIllIllIIIIllIII;
    }
    
    static {
        lIIlIIllIlIllIlI();
        SELF = JdkLogger.class.getName();
        SUPER = AbstractInternalLogger.class.getName();
    }
    
    @Override
    public void debug(final String llllllllllllIllIlIllIlIllIlllllI, final Object llllllllllllIllIlIllIlIlllIIIIIl, final Object llllllllllllIllIlIllIlIllIllllII) {
        if (lIIlIIllIlIllIll(this.logger.isLoggable(Level.FINE) ? 1 : 0)) {
            final FormattingTuple llllllllllllIllIlIllIlIlllIIIlII = MessageFormatter.format(llllllllllllIllIlIllIlIllIlllllI, llllllllllllIllIlIllIlIlllIIIIIl, llllllllllllIllIlIllIlIllIllllII);
            this.log(JdkLogger.SELF, Level.FINE, llllllllllllIllIlIllIlIlllIIIlII.getMessage(), llllllllllllIllIlIllIlIlllIIIlII.getThrowable());
        }
    }
    
    @Override
    public void error(final String llllllllllllIllIlIllIlIlIIlIIIIl, final Object llllllllllllIllIlIllIlIlIIlIIIII) {
        if (lIIlIIllIlIllIll(this.logger.isLoggable(Level.SEVERE) ? 1 : 0)) {
            final FormattingTuple llllllllllllIllIlIllIlIlIIlIIllI = MessageFormatter.format(llllllllllllIllIlIllIlIlIIlIIIIl, llllllllllllIllIlIllIlIlIIlIIIII);
            this.log(JdkLogger.SELF, Level.SEVERE, llllllllllllIllIlIllIlIlIIlIIllI.getMessage(), llllllllllllIllIlIllIlIlIIlIIllI.getThrowable());
        }
    }
    
    @Override
    public void warn(final String llllllllllllIllIlIllIlIlIIlllIII, final Throwable llllllllllllIllIlIllIlIlIIllIlll) {
        if (lIIlIIllIlIllIll(this.logger.isLoggable(Level.WARNING) ? 1 : 0)) {
            this.log(JdkLogger.SELF, Level.WARNING, llllllllllllIllIlIllIlIlIIlllIII, llllllllllllIllIlIllIlIlIIllIlll);
        }
    }
    
    @Override
    public boolean isErrorEnabled() {
        return this.logger.isLoggable(Level.SEVERE);
    }
}
