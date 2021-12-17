// 
// Decompiled by Procyon v0.5.36
// 

package io.netty.handler.timeout;

public final class ReadTimeoutException extends TimeoutException
{
    private ReadTimeoutException() {
    }
    
    static {
        INSTANCE = new ReadTimeoutException();
    }
}
