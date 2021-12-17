// 
// Decompiled by Procyon v0.5.36
// 

package io.netty.util.internal.logging;

import java.util.HashMap;
import org.apache.commons.logging.LogFactory;
import java.util.Map;

public class CommonsLoggerFactory extends InternalLoggerFactory
{
    /* synthetic */ Map<String, InternalLogger> loggerMap;
    
    public InternalLogger newInstance(final String lllllllllllllIIllllIIIIllIIllIlI) {
        return new CommonsLogger(LogFactory.getLog(lllllllllllllIIllllIIIIllIIllIlI), lllllllllllllIIllllIIIIllIIllIlI);
    }
    
    public CommonsLoggerFactory() {
        this.loggerMap = new HashMap<String, InternalLogger>();
    }
}
