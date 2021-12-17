// 
// Decompiled by Procyon v0.5.36
// 

package io.netty.channel.group;

import java.util.Collections;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Iterator;
import java.util.Collection;
import io.netty.channel.Channel;
import java.util.Map;
import io.netty.channel.ChannelException;

public class ChannelGroupException extends ChannelException implements Iterable<Map.Entry<Channel, Throwable>>
{
    private static final /* synthetic */ int[] lIlllIIllIlIlI;
    private final /* synthetic */ Collection<Map.Entry<Channel, Throwable>> failed;
    private static final /* synthetic */ String[] lIlllIIllIlIIl;
    
    private static boolean lIIIIIlIIIIIllIl(final Object llllllllllllIlllllIIllIIIIIlIlll) {
        return llllllllllllIlllllIIllIIIIIlIlll == null;
    }
    
    @Override
    public Iterator<Map.Entry<Channel, Throwable>> iterator() {
        return this.failed.iterator();
    }
    
    private static void lIIIIIlIIIIIllII() {
        (lIlllIIllIlIlI = new int[4])[0] = ((0x53 ^ 0x1) & ~(0xD8 ^ 0x8A));
        ChannelGroupException.lIlllIIllIlIlI[1] = " ".length();
        ChannelGroupException.lIlllIIllIlIlI[2] = "  ".length();
        ChannelGroupException.lIlllIIllIlIlI[3] = (0x7B ^ 0x74 ^ (0xAB ^ 0xAC));
    }
    
    private static String lIIIIIlIIIIIlIlI(final String llllllllllllIlllllIIllIIIIIlllII, final String llllllllllllIlllllIIllIIIIIlllIl) {
        try {
            final SecretKeySpec llllllllllllIlllllIIllIIIIlIIIIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIlllllIIllIIIIIlllIl.getBytes(StandardCharsets.UTF_8)), ChannelGroupException.lIlllIIllIlIlI[3]), "DES");
            final Cipher llllllllllllIlllllIIllIIIIlIIIII = Cipher.getInstance("DES");
            llllllllllllIlllllIIllIIIIlIIIII.init(ChannelGroupException.lIlllIIllIlIlI[2], llllllllllllIlllllIIllIIIIlIIIIl);
            return new String(llllllllllllIlllllIIllIIIIlIIIII.doFinal(Base64.getDecoder().decode(llllllllllllIlllllIIllIIIIIlllII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIlllllIIllIIIIIlllll) {
            llllllllllllIlllllIIllIIIIIlllll.printStackTrace();
            return null;
        }
    }
    
    private static boolean lIIIIIlIIIIIlllI(final int llllllllllllIlllllIIllIIIIIlIlIl) {
        return llllllllllllIlllllIIllIIIIIlIlIl != 0;
    }
    
    private static void lIIIIIlIIIIIlIll() {
        (lIlllIIllIlIIl = new String[ChannelGroupException.lIlllIIllIlIlI[2]])[ChannelGroupException.lIlllIIllIlIlI[0]] = lIIIIIlIIIIIlIlI("NliI+EXZkqE=", "bNRWX");
        ChannelGroupException.lIlllIIllIlIIl[ChannelGroupException.lIlllIIllIlIlI[1]] = lIIIIIlIIIIIlIlI("kfRRgY0lxFCnYRyMavmYqe5lYY3DC5jomOMRq1IP74Y=", "FqOhR");
    }
    
    static {
        lIIIIIlIIIIIllII();
        lIIIIIlIIIIIlIll();
    }
    
    public ChannelGroupException(final Collection<Map.Entry<Channel, Throwable>> llllllllllllIlllllIIllIIIIlIlIIl) {
        if (lIIIIIlIIIIIllIl(llllllllllllIlllllIIllIIIIlIlIIl)) {
            throw new NullPointerException(ChannelGroupException.lIlllIIllIlIIl[ChannelGroupException.lIlllIIllIlIlI[0]]);
        }
        if (lIIIIIlIIIIIlllI(llllllllllllIlllllIIllIIIIlIlIIl.isEmpty() ? 1 : 0)) {
            throw new IllegalArgumentException(ChannelGroupException.lIlllIIllIlIIl[ChannelGroupException.lIlllIIllIlIlI[1]]);
        }
        this.failed = Collections.unmodifiableCollection((Collection<? extends Map.Entry<Channel, Throwable>>)llllllllllllIlllllIIllIIIIlIlIIl);
    }
}
