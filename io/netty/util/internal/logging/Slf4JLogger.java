// 
// Decompiled by Procyon v0.5.36
// 

package io.netty.util.internal.logging;

import org.slf4j.Logger;

class Slf4JLogger extends AbstractInternalLogger
{
    private final transient /* synthetic */ Logger logger;
    
    @Override
    public void error(final String lllllllllllllIIIIlllIIlIIIlIIIlI, final Object lllllllllllllIIIIlllIIlIIIlIIIIl) {
        this.logger.error(lllllllllllllIIIIlllIIlIIIlIIIlI, lllllllllllllIIIIlllIIlIIIlIIIIl);
    }
    
    @Override
    public boolean isDebugEnabled() {
        return this.logger.isDebugEnabled();
    }
    
    @Override
    public void debug(final String lllllllllllllIIIIlllIIlIlIllIlll) {
        this.logger.debug(lllllllllllllIIIIlllIIlIlIllIlll);
    }
    
    @Override
    public void debug(final String lllllllllllllIIIIlllIIlIlIlIlIII, final Object lllllllllllllIIIIlllIIlIlIlIIlll, final Object lllllllllllllIIIIlllIIlIlIlIIllI) {
        this.logger.debug(lllllllllllllIIIIlllIIlIlIlIlIII, lllllllllllllIIIIlllIIlIlIlIIlll, lllllllllllllIIIIlllIIlIlIlIIllI);
    }
    
    @Override
    public void info(final String lllllllllllllIIIIlllIIlIIllllIII, final Object lllllllllllllIIIIlllIIlIIlllIlll, final Object lllllllllllllIIIIlllIIlIIlllIllI) {
        this.logger.info(lllllllllllllIIIIlllIIlIIllllIII, lllllllllllllIIIIlllIIlIIlllIlll, lllllllllllllIIIIlllIIlIIlllIllI);
    }
    
    @Override
    public void error(final String lllllllllllllIIIIlllIIlIIIlIIlll) {
        this.logger.error(lllllllllllllIIIIlllIIlIIIlIIlll);
    }
    
    @Override
    public void info(final String lllllllllllllIIIIlllIIlIIllIllIl, final Object... lllllllllllllIIIIlllIIlIIllIlIIl) {
        this.logger.info(lllllllllllllIIIIlllIIlIIllIllIl, lllllllllllllIIIIlllIIlIIllIlIIl);
    }
    
    @Override
    public void error(final String lllllllllllllIIIIlllIIlIIIIIllIl, final Object... lllllllllllllIIIIlllIIlIIIIIlIIl) {
        this.logger.error(lllllllllllllIIIIlllIIlIIIIIllIl, lllllllllllllIIIIlllIIlIIIIIlIIl);
    }
    
    @Override
    public void debug(final String lllllllllllllIIIIlllIIlIlIIlllIl, final Object... lllllllllllllIIIIlllIIlIlIIllIIl) {
        this.logger.debug(lllllllllllllIIIIlllIIlIlIIlllIl, lllllllllllllIIIIlllIIlIlIIllIIl);
    }
    
    @Override
    public void debug(final String lllllllllllllIIIIlllIIlIlIIlIlII, final Throwable lllllllllllllIIIIlllIIlIlIIlIIll) {
        this.logger.debug(lllllllllllllIIIIlllIIlIlIIlIlII, lllllllllllllIIIIlllIIlIlIIlIIll);
    }
    
    @Override
    public void trace(final String lllllllllllllIIIIlllIIlIllIIllIl, final Object... lllllllllllllIIIIlllIIlIllIIllII) {
        this.logger.trace(lllllllllllllIIIIlllIIlIllIIllIl, lllllllllllllIIIIlllIIlIllIIllII);
    }
    
    @Override
    public void info(final String lllllllllllllIIIIlllIIlIIlllllll, final Object lllllllllllllIIIIlllIIlIIllllllI) {
        this.logger.info(lllllllllllllIIIIlllIIlIIlllllll, lllllllllllllIIIIlllIIlIIllllllI);
    }
    
    @Override
    public void warn(final String lllllllllllllIIIIlllIIlIIlIIlIIl, final Object... lllllllllllllIIIIlllIIlIIlIIlIII) {
        this.logger.warn(lllllllllllllIIIIlllIIlIIlIIlIIl, lllllllllllllIIIIlllIIlIIlIIlIII);
    }
    
    @Override
    public void error(final String lllllllllllllIIIIlllIIlIIIIllIII, final Object lllllllllllllIIIIlllIIlIIIIlIIll, final Object lllllllllllllIIIIlllIIlIIIIlIllI) {
        this.logger.error(lllllllllllllIIIIlllIIlIIIIllIII, lllllllllllllIIIIlllIIlIIIIlIIll, lllllllllllllIIIIlllIIlIIIIlIllI);
    }
    
    @Override
    public boolean isErrorEnabled() {
        return this.logger.isErrorEnabled();
    }
    
    @Override
    public void error(final String lllllllllllllIIIIlllIIlIIIIIIIIl, final Throwable lllllllllllllIIIIlllIIlIIIIIIIII) {
        this.logger.error(lllllllllllllIIIIlllIIlIIIIIIIIl, lllllllllllllIIIIlllIIlIIIIIIIII);
    }
    
    @Override
    public void trace(final String lllllllllllllIIIIlllIIlIlllIlIIl) {
        this.logger.trace(lllllllllllllIIIIlllIIlIlllIlIIl);
    }
    
    @Override
    public boolean isInfoEnabled() {
        return this.logger.isInfoEnabled();
    }
    
    @Override
    public void info(final String lllllllllllllIIIIlllIIlIlIIIIlll) {
        this.logger.info(lllllllllllllIIIIlllIIlIlIIIIlll);
    }
    
    Slf4JLogger(final Logger lllllllllllllIIIIlllIIlIllllIIlI) {
        super(lllllllllllllIIIIlllIIlIllllIIlI.getName());
        this.logger = lllllllllllllIIIIlllIIlIllllIIlI;
    }
    
    @Override
    public void warn(final String lllllllllllllIIIIlllIIlIIlIlIIlI, final Object lllllllllllllIIIIlllIIlIIlIIlllI) {
        this.logger.warn(lllllllllllllIIIIlllIIlIIlIlIIlI, lllllllllllllIIIIlllIIlIIlIIlllI);
    }
    
    @Override
    public void trace(final String lllllllllllllIIIIlllIIlIlllIIIlI, final Object lllllllllllllIIIIlllIIlIllIllllI) {
        this.logger.trace(lllllllllllllIIIIlllIIlIlllIIIlI, lllllllllllllIIIIlllIIlIllIllllI);
    }
    
    @Override
    public void trace(final String lllllllllllllIIIIlllIIlIllIIIIIl, final Throwable lllllllllllllIIIIlllIIlIllIIIIll) {
        this.logger.trace(lllllllllllllIIIIlllIIlIllIIIIIl, lllllllllllllIIIIlllIIlIllIIIIll);
    }
    
    @Override
    public void debug(final String lllllllllllllIIIIlllIIlIlIllIIlI, final Object lllllllllllllIIIIlllIIlIlIlIlllI) {
        this.logger.debug(lllllllllllllIIIIlllIIlIlIllIIlI, lllllllllllllIIIIlllIIlIlIlIlllI);
    }
    
    @Override
    public void trace(final String lllllllllllllIIIIlllIIlIllIlIlII, final Object lllllllllllllIIIIlllIIlIllIlIlll, final Object lllllllllllllIIIIlllIIlIllIlIllI) {
        this.logger.trace(lllllllllllllIIIIlllIIlIllIlIlII, lllllllllllllIIIIlllIIlIllIlIlll, lllllllllllllIIIIlllIIlIllIlIllI);
    }
    
    @Override
    public void info(final String lllllllllllllIIIIlllIIlIIllIIIIl, final Throwable lllllllllllllIIIIlllIIlIIllIIIII) {
        this.logger.info(lllllllllllllIIIIlllIIlIIllIIIIl, lllllllllllllIIIIlllIIlIIllIIIII);
    }
    
    @Override
    public void warn(final String lllllllllllllIIIIlllIIlIIIllIlII, final Throwable lllllllllllllIIIIlllIIlIIIllIIll) {
        this.logger.warn(lllllllllllllIIIIlllIIlIIIllIlII, lllllllllllllIIIIlllIIlIIIllIIll);
    }
    
    @Override
    public boolean isTraceEnabled() {
        return this.logger.isTraceEnabled();
    }
    
    @Override
    public void warn(final String lllllllllllllIIIIlllIIlIIIllllll, final Object lllllllllllllIIIIlllIIlIIIlllIlI, final Object lllllllllllllIIIIlllIIlIIIlllIIl) {
        this.logger.warn(lllllllllllllIIIIlllIIlIIIllllll, lllllllllllllIIIIlllIIlIIIlllIlI, lllllllllllllIIIIlllIIlIIIlllIIl);
    }
    
    @Override
    public void warn(final String lllllllllllllIIIIlllIIlIIlIllIIl) {
        this.logger.warn(lllllllllllllIIIIlllIIlIIlIllIIl);
    }
    
    @Override
    public boolean isWarnEnabled() {
        return this.logger.isWarnEnabled();
    }
}
