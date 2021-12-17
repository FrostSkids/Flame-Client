// 
// Decompiled by Procyon v0.5.36
// 

package io.netty.handler.codec.http;

import io.netty.buffer.Unpooled;
import io.netty.buffer.ByteBuf;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import io.netty.util.ReferenceCounted;
import io.netty.handler.codec.DecoderResult;
import io.netty.buffer.ByteBufHolder;

public interface LastHttpContent extends HttpContent
{
    HttpHeaders trailingHeaders();
    
    LastHttpContent copy();
    
    LastHttpContent retain(final int p0);
    
    LastHttpContent retain();
}
