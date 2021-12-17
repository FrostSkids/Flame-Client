// 
// Decompiled by Procyon v0.5.36
// 

package io.netty.handler.timeout;

public final class WriteTimeoutException extends TimeoutException
{
    static {
        INSTANCE = new WriteTimeoutException();
    }
    
    private WriteTimeoutException() {
    }
}
