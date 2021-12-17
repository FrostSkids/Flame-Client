// 
// Decompiled by Procyon v0.5.36
// 

package io.netty.util.internal;

import java.nio.charset.CharsetEncoder;
import java.util.concurrent.atomic.AtomicInteger;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.Charset;
import java.util.Map;

class UnpaddedInternalThreadLocalMap
{
    /* synthetic */ Object[] indexedVariables;
    
    UnpaddedInternalThreadLocalMap(final Object[] lllllllllllllIlIIIlIllIlIIllllIl) {
        this.indexedVariables = lllllllllllllIlIIIlIllIlIIllllIl;
    }
    
    static {
        nextIndex = new AtomicInteger();
    }
}
