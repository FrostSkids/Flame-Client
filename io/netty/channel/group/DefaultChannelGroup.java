// 
// Decompiled by Procyon v0.5.36
// 

package io.netty.channel.group;

import io.netty.buffer.ByteBufHolder;
import io.netty.buffer.ByteBuf;
import io.netty.util.concurrent.Future;
import io.netty.util.concurrent.GenericFutureListener;
import io.netty.channel.ServerChannel;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.security.MessageDigest;
import io.netty.util.internal.StringUtil;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.Collection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import io.netty.util.ReferenceCountUtil;
import io.netty.channel.ChannelFuture;
import java.util.LinkedHashMap;
import io.netty.channel.ChannelFutureListener;
import java.util.concurrent.atomic.AtomicInteger;
import io.netty.util.internal.ConcurrentSet;
import io.netty.util.concurrent.EventExecutor;
import io.netty.channel.Channel;
import java.util.AbstractSet;

public class DefaultChannelGroup extends AbstractSet<Channel> implements ChannelGroup
{
    private final /* synthetic */ String name;
    private final /* synthetic */ EventExecutor executor;
    private final /* synthetic */ ConcurrentSet<Channel> nonServerChannels;
    private static final /* synthetic */ String[] llIlIIIlllIlll;
    private static final /* synthetic */ int[] llIlIIlIIIIIlI;
    private static final /* synthetic */ AtomicInteger nextId;
    private final /* synthetic */ ConcurrentSet<Channel> serverChannels;
    private final /* synthetic */ ChannelFutureListener remover;
    
    @Override
    public String name() {
        return this.name;
    }
    
    private static void lIIlIIlIIlIIIIIl() {
        (llIlIIlIIIIIlI = new int[12])[0] = ((0x43 ^ 0x4D ^ (0x56 ^ 0x7F)) & (23 + 7 + 111 + 27 ^ 73 + 134 - 87 + 23 ^ -" ".length()));
        DefaultChannelGroup.llIlIIlIIIIIlI[1] = " ".length();
        DefaultChannelGroup.llIlIIlIIIIIlI[2] = "  ".length();
        DefaultChannelGroup.llIlIIlIIIIIlI[3] = "   ".length();
        DefaultChannelGroup.llIlIIlIIIIIlI[4] = (124 + 59 - 166 + 117 ^ 54 + 20 - 20 + 76);
        DefaultChannelGroup.llIlIIlIIIIIlI[5] = (76 + 1 + 14 + 74 ^ 101 + 17 + 37 + 5);
        DefaultChannelGroup.llIlIIlIIIIIlI[6] = (0xD6 ^ 0x91 ^ (0xF7 ^ 0xB6));
        DefaultChannelGroup.llIlIIlIIIIIlI[7] = (0x5C ^ 0x5B);
        DefaultChannelGroup.llIlIIlIIIIIlI[8] = (0xCD ^ 0xC5);
        DefaultChannelGroup.llIlIIlIIIIIlI[9] = (0xA4 ^ 0xAD);
        DefaultChannelGroup.llIlIIlIIIIIlI[10] = (0x99 ^ 0x9D ^ (0xA9 ^ 0x84));
        DefaultChannelGroup.llIlIIlIIIIIlI[11] = (0xAE ^ 0xA4);
    }
    
    @Override
    public ChannelGroupFuture writeAndFlush(final Object llllllllllllIllIllIIlIIIlllIIIlI, final ChannelMatcher llllllllllllIllIllIIlIIIllIlllIl) {
        if (lIIlIIlIIlIIIIlI(llllllllllllIllIllIIlIIIlllIIIlI)) {
            throw new NullPointerException(DefaultChannelGroup.llIlIIIlllIlll[DefaultChannelGroup.llIlIIlIIIIIlI[7]]);
        }
        final Map<Channel, ChannelFuture> llllllllllllIllIllIIlIIIlllIIIII = new LinkedHashMap<Channel, ChannelFuture>(this.size());
        final Iterator llllllllllllIllIllIIlIIIlllIIlII = this.nonServerChannels.iterator();
        while (lIIlIIlIIlIIIIll(llllllllllllIllIllIIlIIIlllIIlII.hasNext() ? 1 : 0)) {
            final Channel llllllllllllIllIllIIlIIIlllIIlIl = llllllllllllIllIllIIlIIIlllIIlII.next();
            if (lIIlIIlIIlIIIIll(llllllllllllIllIllIIlIIIllIlllIl.matches(llllllllllllIllIllIIlIIIlllIIlIl) ? 1 : 0)) {
                llllllllllllIllIllIIlIIIlllIIIII.put(llllllllllllIllIllIIlIIIlllIIlIl, llllllllllllIllIllIIlIIIlllIIlIl.writeAndFlush(safeDuplicate(llllllllllllIllIllIIlIIIlllIIIlI)));
                "".length();
            }
            "".length();
            if (-" ".length() == ((0x96 ^ 0xB0) & ~(0xA0 ^ 0x86))) {
                return null;
            }
        }
        ReferenceCountUtil.release(llllllllllllIllIllIIlIIIlllIIIlI);
        "".length();
        return new DefaultChannelGroupFuture(this, llllllllllllIllIllIIlIIIlllIIIII, this.executor);
    }
    
    @Override
    public Object[] toArray() {
        final Collection<Channel> llllllllllllIllIllIIlIIlIlllIIlI = new ArrayList<Channel>(this.size());
        llllllllllllIllIllIIlIIlIlllIIlI.addAll(this.serverChannels);
        "".length();
        llllllllllllIllIllIIlIIlIlllIIlI.addAll(this.nonServerChannels);
        "".length();
        return llllllllllllIllIllIIlIIlIlllIIlI.toArray();
    }
    
    @Override
    public ChannelGroup flush() {
        return this.flush(ChannelMatchers.all());
    }
    
    private static String lIIlIIlIIIlIlllI(String llllllllllllIllIllIIlIIIlIIlllII, final String llllllllllllIllIllIIlIIIlIIllIll) {
        llllllllllllIllIllIIlIIIlIIlllII = new String(Base64.getDecoder().decode(llllllllllllIllIllIIlIIIlIIlllII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder llllllllllllIllIllIIlIIIlIIlllll = new StringBuilder();
        final char[] llllllllllllIllIllIIlIIIlIIllllI = llllllllllllIllIllIIlIIIlIIllIll.toCharArray();
        int llllllllllllIllIllIIlIIIlIIlllIl = DefaultChannelGroup.llIlIIlIIIIIlI[0];
        final char llllllllllllIllIllIIlIIIlIIlIlll = (Object)llllllllllllIllIllIIlIIIlIIlllII.toCharArray();
        final short llllllllllllIllIllIIlIIIlIIlIllI = (short)llllllllllllIllIllIIlIIIlIIlIlll.length;
        byte llllllllllllIllIllIIlIIIlIIlIlIl = (byte)DefaultChannelGroup.llIlIIlIIIIIlI[0];
        while (lIIlIIlIIlIIIllI(llllllllllllIllIllIIlIIIlIIlIlIl, llllllllllllIllIllIIlIIIlIIlIllI)) {
            final char llllllllllllIllIllIIlIIIlIlIIIlI = llllllllllllIllIllIIlIIIlIIlIlll[llllllllllllIllIllIIlIIIlIIlIlIl];
            llllllllllllIllIllIIlIIIlIIlllll.append((char)(llllllllllllIllIllIIlIIIlIlIIIlI ^ llllllllllllIllIllIIlIIIlIIllllI[llllllllllllIllIllIIlIIIlIIlllIl % llllllllllllIllIllIIlIIIlIIllllI.length]));
            "".length();
            ++llllllllllllIllIllIIlIIIlIIlllIl;
            ++llllllllllllIllIllIIlIIIlIIlIlIl;
            "".length();
            if (" ".length() >= "   ".length()) {
                return null;
            }
        }
        return String.valueOf(llllllllllllIllIllIIlIIIlIIlllll);
    }
    
    @Override
    public ChannelGroupFuture write(final Object llllllllllllIllIllIIlIIlIlIIlIll, final ChannelMatcher llllllllllllIllIllIIlIIlIlIIIllI) {
        if (lIIlIIlIIlIIIIlI(llllllllllllIllIllIIlIIlIlIIlIll)) {
            throw new NullPointerException(DefaultChannelGroup.llIlIIIlllIlll[DefaultChannelGroup.llIlIIlIIIIIlI[2]]);
        }
        if (lIIlIIlIIlIIIIlI(llllllllllllIllIllIIlIIlIlIIIllI)) {
            throw new NullPointerException(DefaultChannelGroup.llIlIIIlllIlll[DefaultChannelGroup.llIlIIlIIIIIlI[3]]);
        }
        final Map<Channel, ChannelFuture> llllllllllllIllIllIIlIIlIlIIlIIl = new LinkedHashMap<Channel, ChannelFuture>(this.size());
        final Iterator llllllllllllIllIllIIlIIlIlIIllIl = this.nonServerChannels.iterator();
        while (lIIlIIlIIlIIIIll(llllllllllllIllIllIIlIIlIlIIllIl.hasNext() ? 1 : 0)) {
            final Channel llllllllllllIllIllIIlIIlIlIIlllI = llllllllllllIllIllIIlIIlIlIIllIl.next();
            if (lIIlIIlIIlIIIIll(llllllllllllIllIllIIlIIlIlIIIllI.matches(llllllllllllIllIllIIlIIlIlIIlllI) ? 1 : 0)) {
                llllllllllllIllIllIIlIIlIlIIlIIl.put(llllllllllllIllIllIIlIIlIlIIlllI, llllllllllllIllIllIIlIIlIlIIlllI.write(safeDuplicate(llllllllllllIllIllIIlIIlIlIIlIll)));
                "".length();
            }
            "".length();
            if (-" ".length() != -" ".length()) {
                return null;
            }
        }
        ReferenceCountUtil.release(llllllllllllIllIllIIlIIlIlIIlIll);
        "".length();
        return new DefaultChannelGroupFuture(this, llllllllllllIllIllIIlIIlIlIIlIIl, this.executor);
    }
    
    private static boolean lIIlIIlIIlIIIIlI(final Object llllllllllllIllIllIIlIIIIlllllIl) {
        return llllllllllllIllIllIIlIIIIlllllIl == null;
    }
    
    @Override
    public String toString() {
        return String.valueOf(new StringBuilder().append(StringUtil.simpleClassName(this)).append(DefaultChannelGroup.llIlIIIlllIlll[DefaultChannelGroup.llIlIIlIIIIIlI[8]]).append(this.name()).append(DefaultChannelGroup.llIlIIIlllIlll[DefaultChannelGroup.llIlIIlIIIIIlI[9]]).append(this.size()).append((char)DefaultChannelGroup.llIlIIlIIIIIlI[10]));
    }
    
    @Override
    public ChannelGroupFuture deregister() {
        return this.deregister(ChannelMatchers.all());
    }
    
    @Override
    public int size() {
        return this.nonServerChannels.size() + this.serverChannels.size();
    }
    
    private static void lIIlIIlIIIllIlII() {
        (llIlIIIlllIlll = new String[DefaultChannelGroup.llIlIIlIIIIIlI[11]])[DefaultChannelGroup.llIlIIlIIIIIlI[0]] = lIIlIIlIIIlIllIl("P0/ikgRti/28SSKq+LEf0g==", "IBpVw");
        DefaultChannelGroup.llIlIIIlllIlll[DefaultChannelGroup.llIlIIlIIIIIlI[1]] = lIIlIIlIIIlIlllI("DwA1Cg==", "aaXoG");
        DefaultChannelGroup.llIlIIIlllIlll[DefaultChannelGroup.llIlIIlIIIIIlI[2]] = lIIlIIlIIIlIllll("Ej4obw2hJFI=", "ZqSKk");
        DefaultChannelGroup.llIlIIIlllIlll[DefaultChannelGroup.llIlIIlIIIIIlI[3]] = lIIlIIlIIIlIllIl("7iPxsg+LFy4=", "UkmNQ");
        DefaultChannelGroup.llIlIIIlllIlll[DefaultChannelGroup.llIlIIlIIIIIlI[4]] = lIIlIIlIIIlIlllI("FzUdOTofJg==", "zTiZR");
        DefaultChannelGroup.llIlIIIlllIlll[DefaultChannelGroup.llIlIIlIIIIIlI[5]] = lIIlIIlIIIlIllll("qjkAXDtSE4c=", "Qvgqi");
        DefaultChannelGroup.llIlIIIlllIlll[DefaultChannelGroup.llIlIIlIIIIIlI[6]] = lIIlIIlIIIlIllIl("+ieJiI8snnI=", "AMQuK");
        DefaultChannelGroup.llIlIIIlllIlll[DefaultChannelGroup.llIlIIlIIIIIlI[7]] = lIIlIIlIIIlIllIl("hUk0lF0WcjU=", "KztpC");
        DefaultChannelGroup.llIlIIIlllIlll[DefaultChannelGroup.llIlIIlIIIIIlI[8]] = lIIlIIlIIIlIllIl("ncxZVkIS51w=", "TSIhf");
        DefaultChannelGroup.llIlIIIlllIlll[DefaultChannelGroup.llIlIIlIIIIIlI[9]] = lIIlIIlIIIlIllIl("0ET0w/3z1znj6lsxSi+XNg==", "Aoxgy");
    }
    
    private static String lIIlIIlIIIlIllll(final String llllllllllllIllIllIIlIIIlIIIlIlI, final String llllllllllllIllIllIIlIIIlIIIlIIl) {
        try {
            final SecretKeySpec llllllllllllIllIllIIlIIIlIIIllll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIllIllIIlIIIlIIIlIIl.getBytes(StandardCharsets.UTF_8)), DefaultChannelGroup.llIlIIlIIIIIlI[8]), "DES");
            final Cipher llllllllllllIllIllIIlIIIlIIIlllI = Cipher.getInstance("DES");
            llllllllllllIllIllIIlIIIlIIIlllI.init(DefaultChannelGroup.llIlIIlIIIIIlI[2], llllllllllllIllIllIIlIIIlIIIllll);
            return new String(llllllllllllIllIllIIlIIIlIIIlllI.doFinal(Base64.getDecoder().decode(llllllllllllIllIllIIlIIIlIIIlIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIllIllIIlIIIlIIIllIl) {
            llllllllllllIllIllIIlIIIlIIIllIl.printStackTrace();
            return null;
        }
    }
    
    private static boolean lIIlIIlIIlIIIlIl(final Object llllllllllllIllIllIIlIIIlIIIIIII, final Object llllllllllllIllIllIIlIIIIlllllll) {
        return llllllllllllIllIllIIlIIIlIIIIIII == llllllllllllIllIllIIlIIIIlllllll;
    }
    
    @Override
    public boolean remove(final Object llllllllllllIllIllIIlIIlIllllllI) {
        if (lIIlIIlIIlIIIlII((llllllllllllIllIllIIlIIlIllllllI instanceof Channel) ? 1 : 0)) {
            return DefaultChannelGroup.llIlIIlIIIIIlI[0] != 0;
        }
        final Channel llllllllllllIllIllIIlIIllIIIIIII = (Channel)llllllllllllIllIllIIlIIlIllllllI;
        boolean llllllllllllIllIllIIlIIllIIIIIIl = false;
        if (lIIlIIlIIlIIIIll((llllllllllllIllIllIIlIIllIIIIIII instanceof ServerChannel) ? 1 : 0)) {
            final boolean llllllllllllIllIllIIlIIllIIIIlII = this.serverChannels.remove(llllllllllllIllIllIIlIIllIIIIIII);
            "".length();
            if ((0xBE ^ 0xA1 ^ (0x2B ^ 0x30)) < " ".length()) {
                return ((0x1A ^ 0x2E ^ "  ".length()) & (3 + 100 - 20 + 69 ^ 63 + 10 - 33 + 134 ^ -" ".length())) != 0x0;
            }
        }
        else {
            llllllllllllIllIllIIlIIllIIIIIIl = this.nonServerChannels.remove(llllllllllllIllIllIIlIIllIIIIIII);
        }
        if (lIIlIIlIIlIIIlII(llllllllllllIllIllIIlIIllIIIIIIl ? 1 : 0)) {
            return DefaultChannelGroup.llIlIIlIIIIIlI[0] != 0;
        }
        llllllllllllIllIllIIlIIllIIIIIII.closeFuture().removeListener((GenericFutureListener<? extends Future<? super Void>>)this.remover);
        "".length();
        return DefaultChannelGroup.llIlIIlIIIIIlI[1] != 0;
    }
    
    @Override
    public ChannelGroupFuture deregister(final ChannelMatcher llllllllllllIllIllIIlIIlIIIIIlll) {
        if (lIIlIIlIIlIIIIlI(llllllllllllIllIllIIlIIlIIIIIlll)) {
            throw new NullPointerException(DefaultChannelGroup.llIlIIIlllIlll[DefaultChannelGroup.llIlIIlIIIIIlI[6]]);
        }
        final Map<Channel, ChannelFuture> llllllllllllIllIllIIlIIlIIIIIllI = new LinkedHashMap<Channel, ChannelFuture>(this.size());
        final Iterator llllllllllllIllIllIIlIIlIIIIlIll = this.serverChannels.iterator();
        while (lIIlIIlIIlIIIIll(llllllllllllIllIllIIlIIlIIIIlIll.hasNext() ? 1 : 0)) {
            final Channel llllllllllllIllIllIIlIIlIIIIllII = llllllllllllIllIllIIlIIlIIIIlIll.next();
            if (lIIlIIlIIlIIIIll(llllllllllllIllIllIIlIIlIIIIIlll.matches(llllllllllllIllIllIIlIIlIIIIllII) ? 1 : 0)) {
                llllllllllllIllIllIIlIIlIIIIIllI.put(llllllllllllIllIllIIlIIlIIIIllII, llllllllllllIllIllIIlIIlIIIIllII.deregister());
                "".length();
            }
            "".length();
            if (" ".length() > "  ".length()) {
                return null;
            }
        }
        final Iterator llllllllllllIllIllIIlIIlIIIIlIIl = this.nonServerChannels.iterator();
        while (lIIlIIlIIlIIIIll(llllllllllllIllIllIIlIIlIIIIlIIl.hasNext() ? 1 : 0)) {
            final Channel llllllllllllIllIllIIlIIlIIIIlIlI = llllllllllllIllIllIIlIIlIIIIlIIl.next();
            if (lIIlIIlIIlIIIIll(llllllllllllIllIllIIlIIlIIIIIlll.matches(llllllllllllIllIllIIlIIlIIIIlIlI) ? 1 : 0)) {
                llllllllllllIllIllIIlIIlIIIIIllI.put(llllllllllllIllIllIIlIIlIIIIlIlI, llllllllllllIllIllIIlIIlIIIIlIlI.deregister());
                "".length();
            }
            "".length();
            if (null != null) {
                return null;
            }
        }
        return new DefaultChannelGroupFuture(this, llllllllllllIllIllIIlIIlIIIIIllI, this.executor);
    }
    
    @Override
    public ChannelGroupFuture flushAndWrite(final Object llllllllllllIllIllIIlIIIllllIIII, final ChannelMatcher llllllllllllIllIllIIlIIIlllIllII) {
        return this.writeAndFlush(llllllllllllIllIllIIlIIIllllIIII, llllllllllllIllIllIIlIIIlllIllII);
    }
    
    @Override
    public boolean equals(final Object llllllllllllIllIllIIlIIIllIlIIIl) {
        int n;
        if (lIIlIIlIIlIIIlIl(this, llllllllllllIllIllIIlIIIllIlIIIl)) {
            n = DefaultChannelGroup.llIlIIlIIIIIlI[1];
            "".length();
            if (-" ".length() != -" ".length()) {
                return ((118 + 45 - 68 + 130 ^ 74 + 170 - 139 + 93) & (0xEB ^ 0xA8 ^ (0xC6 ^ 0xA2) ^ -" ".length())) != 0x0;
            }
        }
        else {
            n = DefaultChannelGroup.llIlIIlIIIIIlI[0];
        }
        return n != 0;
    }
    
    @Override
    public void clear() {
        this.nonServerChannels.clear();
        this.serverChannels.clear();
    }
    
    @Override
    public ChannelGroupFuture writeAndFlush(final Object llllllllllllIllIllIIlIIlIIllIllI) {
        return this.writeAndFlush(llllllllllllIllIllIIlIIlIIllIllI, ChannelMatchers.all());
    }
    
    private static Object safeDuplicate(final Object llllllllllllIllIllIIlIIlIlIlIllI) {
        if (lIIlIIlIIlIIIIll((llllllllllllIllIllIIlIIlIlIlIllI instanceof ByteBuf) ? 1 : 0)) {
            return ((ByteBuf)llllllllllllIllIllIIlIIlIlIlIllI).duplicate().retain();
        }
        if (lIIlIIlIIlIIIIll((llllllllllllIllIllIIlIIlIlIlIllI instanceof ByteBufHolder) ? 1 : 0)) {
            return ((ByteBufHolder)llllllllllllIllIllIIlIIlIlIlIllI).duplicate().retain();
        }
        return ReferenceCountUtil.retain(llllllllllllIllIllIIlIIlIlIlIllI);
    }
    
    @Override
    public ChannelGroupFuture disconnect(final ChannelMatcher llllllllllllIllIllIIlIIlIIlIlIIl) {
        if (lIIlIIlIIlIIIIlI(llllllllllllIllIllIIlIIlIIlIlIIl)) {
            throw new NullPointerException(DefaultChannelGroup.llIlIIIlllIlll[DefaultChannelGroup.llIlIIlIIIIIlI[4]]);
        }
        final Map<Channel, ChannelFuture> llllllllllllIllIllIIlIIlIIlIlIII = new LinkedHashMap<Channel, ChannelFuture>(this.size());
        final Iterator llllllllllllIllIllIIlIIlIIlIllIl = this.serverChannels.iterator();
        while (lIIlIIlIIlIIIIll(llllllllllllIllIllIIlIIlIIlIllIl.hasNext() ? 1 : 0)) {
            final Channel llllllllllllIllIllIIlIIlIIlIlllI = llllllllllllIllIllIIlIIlIIlIllIl.next();
            if (lIIlIIlIIlIIIIll(llllllllllllIllIllIIlIIlIIlIlIIl.matches(llllllllllllIllIllIIlIIlIIlIlllI) ? 1 : 0)) {
                llllllllllllIllIllIIlIIlIIlIlIII.put(llllllllllllIllIllIIlIIlIIlIlllI, llllllllllllIllIllIIlIIlIIlIlllI.disconnect());
                "".length();
            }
            "".length();
            if ("  ".length() >= (0x6E ^ 0x6A)) {
                return null;
            }
        }
        final Iterator llllllllllllIllIllIIlIIlIIlIlIll = this.nonServerChannels.iterator();
        while (lIIlIIlIIlIIIIll(llllllllllllIllIllIIlIIlIIlIlIll.hasNext() ? 1 : 0)) {
            final Channel llllllllllllIllIllIIlIIlIIlIllII = llllllllllllIllIllIIlIIlIIlIlIll.next();
            if (lIIlIIlIIlIIIIll(llllllllllllIllIllIIlIIlIIlIlIIl.matches(llllllllllllIllIllIIlIIlIIlIllII) ? 1 : 0)) {
                llllllllllllIllIllIIlIIlIIlIlIII.put(llllllllllllIllIllIIlIIlIIlIllII, llllllllllllIllIllIIlIIlIIlIllII.disconnect());
                "".length();
            }
            "".length();
            if (" ".length() <= 0) {
                return null;
            }
        }
        return new DefaultChannelGroupFuture(this, llllllllllllIllIllIIlIIlIIlIlIII, this.executor);
    }
    
    @Override
    public ChannelGroupFuture disconnect() {
        return this.disconnect(ChannelMatchers.all());
    }
    
    private static String lIIlIIlIIIlIllIl(final String llllllllllllIllIllIIlIIIlIllIIIl, final String llllllllllllIllIllIIlIIIlIlIlllI) {
        try {
            final SecretKeySpec llllllllllllIllIllIIlIIIlIllIlII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIllIllIIlIIIlIlIlllI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher llllllllllllIllIllIIlIIIlIllIIll = Cipher.getInstance("Blowfish");
            llllllllllllIllIllIIlIIIlIllIIll.init(DefaultChannelGroup.llIlIIlIIIIIlI[2], llllllllllllIllIllIIlIIIlIllIlII);
            return new String(llllllllllllIllIllIIlIIIlIllIIll.doFinal(Base64.getDecoder().decode(llllllllllllIllIllIIlIIIlIllIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIllIllIIlIIIlIllIIlI) {
            llllllllllllIllIllIIlIIIlIllIIlI.printStackTrace();
            return null;
        }
    }
    
    @Override
    public ChannelGroupFuture flushAndWrite(final Object llllllllllllIllIllIIlIIlIIlllIlI) {
        return this.writeAndFlush(llllllllllllIllIllIIlIIlIIlllIlI);
    }
    
    @Override
    public Iterator<Channel> iterator() {
        return new CombinedIterator<Channel>(this.serverChannels.iterator(), this.nonServerChannels.iterator());
    }
    
    private static boolean lIIlIIlIIlIIIIll(final int llllllllllllIllIllIIlIIIIllllIll) {
        return llllllllllllIllIllIIlIIIIllllIll != 0;
    }
    
    @Override
    public int compareTo(final ChannelGroup llllllllllllIllIllIIlIIIllIIllII) {
        final int llllllllllllIllIllIIlIIIllIIlIll = this.name().compareTo(llllllllllllIllIllIIlIIIllIIllII.name());
        if (lIIlIIlIIlIIIIll(llllllllllllIllIllIIlIIIllIIlIll)) {
            return llllllllllllIllIllIIlIIIllIIlIll;
        }
        return System.identityHashCode(this) - System.identityHashCode(llllllllllllIllIllIIlIIIllIIllII);
    }
    
    @Override
    public boolean add(final Channel llllllllllllIllIllIIlIIllIIIlIll) {
        ConcurrentSet<Channel> set;
        if (lIIlIIlIIlIIIIll((llllllllllllIllIllIIlIIllIIIlIll instanceof ServerChannel) ? 1 : 0)) {
            set = this.serverChannels;
            "".length();
            if (((0xAF ^ 0x8F) & ~(0x4E ^ 0x6E)) != 0x0) {
                return ((0xA0 ^ 0x82) & ~(0x36 ^ 0x14)) != 0x0;
            }
        }
        else {
            set = this.nonServerChannels;
        }
        final ConcurrentSet<Channel> llllllllllllIllIllIIlIIllIIIlllI = set;
        final boolean llllllllllllIllIllIIlIIllIIIllIl = llllllllllllIllIllIIlIIllIIIlllI.add(llllllllllllIllIllIIlIIllIIIlIll);
        if (lIIlIIlIIlIIIIll(llllllllllllIllIllIIlIIllIIIllIl ? 1 : 0)) {
            llllllllllllIllIllIIlIIllIIIlIll.closeFuture().addListener((GenericFutureListener<? extends Future<? super Void>>)this.remover);
            "".length();
        }
        return llllllllllllIllIllIIlIIllIIIllIl;
    }
    
    @Override
    public boolean contains(final Object llllllllllllIllIllIIlIIllIIllIII) {
        if (!lIIlIIlIIlIIIIll((llllllllllllIllIllIIlIIllIIllIII instanceof Channel) ? 1 : 0)) {
            return DefaultChannelGroup.llIlIIlIIIIIlI[0] != 0;
        }
        final Channel llllllllllllIllIllIIlIIllIIllIlI = (Channel)llllllllllllIllIllIIlIIllIIllIII;
        if (lIIlIIlIIlIIIIll((llllllllllllIllIllIIlIIllIIllIII instanceof ServerChannel) ? 1 : 0)) {
            return this.serverChannels.contains(llllllllllllIllIllIIlIIllIIllIlI);
        }
        return this.nonServerChannels.contains(llllllllllllIllIllIIlIIllIIllIlI);
    }
    
    @Override
    public ChannelGroupFuture close(final ChannelMatcher llllllllllllIllIllIIlIIlIIIllIII) {
        if (lIIlIIlIIlIIIIlI(llllllllllllIllIllIIlIIlIIIllIII)) {
            throw new NullPointerException(DefaultChannelGroup.llIlIIIlllIlll[DefaultChannelGroup.llIlIIlIIIIIlI[5]]);
        }
        final Map<Channel, ChannelFuture> llllllllllllIllIllIIlIIlIIIlIlll = new LinkedHashMap<Channel, ChannelFuture>(this.size());
        final Iterator llllllllllllIllIllIIlIIlIIIlllII = this.serverChannels.iterator();
        while (lIIlIIlIIlIIIIll(llllllllllllIllIllIIlIIlIIIlllII.hasNext() ? 1 : 0)) {
            final Channel llllllllllllIllIllIIlIIlIIIlllIl = llllllllllllIllIllIIlIIlIIIlllII.next();
            if (lIIlIIlIIlIIIIll(llllllllllllIllIllIIlIIlIIIllIII.matches(llllllllllllIllIllIIlIIlIIIlllIl) ? 1 : 0)) {
                llllllllllllIllIllIIlIIlIIIlIlll.put(llllllllllllIllIllIIlIIlIIIlllIl, llllllllllllIllIllIIlIIlIIIlllIl.close());
                "".length();
            }
            "".length();
            if ("   ".length() < ((0x27 ^ 0x22 ^ (0x23 ^ 0x1C)) & (91 + 109 - 105 + 95 ^ 54 + 21 - 1 + 58 ^ -" ".length()))) {
                return null;
            }
        }
        final Iterator llllllllllllIllIllIIlIIlIIIllIlI = this.nonServerChannels.iterator();
        while (lIIlIIlIIlIIIIll(llllllllllllIllIllIIlIIlIIIllIlI.hasNext() ? 1 : 0)) {
            final Channel llllllllllllIllIllIIlIIlIIIllIll = llllllllllllIllIllIIlIIlIIIllIlI.next();
            if (lIIlIIlIIlIIIIll(llllllllllllIllIllIIlIIlIIIllIII.matches(llllllllllllIllIllIIlIIlIIIllIll) ? 1 : 0)) {
                llllllllllllIllIllIIlIIlIIIlIlll.put(llllllllllllIllIllIIlIIlIIIllIll, llllllllllllIllIllIIlIIlIIIllIll.close());
                "".length();
            }
            "".length();
            if ("  ".length() <= 0) {
                return null;
            }
        }
        return new DefaultChannelGroupFuture(this, llllllllllllIllIllIIlIIlIIIlIlll, this.executor);
    }
    
    @Override
    public <T> T[] toArray(final T[] llllllllllllIllIllIIlIIlIllIlIll) {
        final Collection<Channel> llllllllllllIllIllIIlIIlIllIlIlI = new ArrayList<Channel>(this.size());
        llllllllllllIllIllIIlIIlIllIlIlI.addAll(this.serverChannels);
        "".length();
        llllllllllllIllIllIIlIIlIllIlIlI.addAll(this.nonServerChannels);
        "".length();
        return llllllllllllIllIllIIlIIlIllIlIlI.toArray(llllllllllllIllIllIIlIIlIllIlIll);
    }
    
    private static boolean lIIlIIlIIlIIIlII(final int llllllllllllIllIllIIlIIIIllllIIl) {
        return llllllllllllIllIllIIlIIIIllllIIl == 0;
    }
    
    @Override
    public ChannelGroupFuture close() {
        return this.close(ChannelMatchers.all());
    }
    
    @Override
    public ChannelGroupFuture write(final Object llllllllllllIllIllIIlIIlIlIllIII) {
        return this.write(llllllllllllIllIllIIlIIlIlIllIII, ChannelMatchers.all());
    }
    
    private static boolean lIIlIIlIIlIIIllI(final int llllllllllllIllIllIIlIIIlIIIIlII, final int llllllllllllIllIllIIlIIIlIIIIIll) {
        return llllllllllllIllIllIIlIIIlIIIIlII < llllllllllllIllIllIIlIIIlIIIIIll;
    }
    
    public DefaultChannelGroup(final String llllllllllllIllIllIIlIIllIlIlIII, final EventExecutor llllllllllllIllIllIIlIIllIlIIlll) {
        this.serverChannels = new ConcurrentSet<Channel>();
        this.nonServerChannels = new ConcurrentSet<Channel>();
        this.remover = new ChannelFutureListener() {
            @Override
            public void operationComplete(final ChannelFuture lllllllllllllIlIIllIIIlIlIlIIIII) throws Exception {
                DefaultChannelGroup.this.remove(lllllllllllllIlIIllIIIlIlIlIIIII.channel());
                "".length();
            }
        };
        if (lIIlIIlIIlIIIIlI(llllllllllllIllIllIIlIIllIlIlIII)) {
            throw new NullPointerException(DefaultChannelGroup.llIlIIIlllIlll[DefaultChannelGroup.llIlIIlIIIIIlI[1]]);
        }
        this.name = llllllllllllIllIllIIlIIllIlIlIII;
        this.executor = llllllllllllIllIllIIlIIllIlIIlll;
    }
    
    public DefaultChannelGroup(final EventExecutor llllllllllllIllIllIIlIIllIllIIlI) {
        this(String.valueOf(new StringBuilder().append(DefaultChannelGroup.llIlIIIlllIlll[DefaultChannelGroup.llIlIIlIIIIIlI[0]]).append(Integer.toHexString(DefaultChannelGroup.nextId.incrementAndGet()))), llllllllllllIllIllIIlIIllIllIIlI);
    }
    
    static {
        lIIlIIlIIlIIIIIl();
        lIIlIIlIIIllIlII();
        nextId = new AtomicInteger();
    }
    
    @Override
    public ChannelGroup flush(final ChannelMatcher llllllllllllIllIllIIlIIIlllllIIl) {
        final Iterator llllllllllllIllIllIIlIIIlllllIll = this.nonServerChannels.iterator();
        while (lIIlIIlIIlIIIIll(llllllllllllIllIllIIlIIIlllllIll.hasNext() ? 1 : 0)) {
            final Channel llllllllllllIllIllIIlIIIllllllII = llllllllllllIllIllIIlIIIlllllIll.next();
            if (lIIlIIlIIlIIIIll(llllllllllllIllIllIIlIIIlllllIIl.matches(llllllllllllIllIllIIlIIIllllllII) ? 1 : 0)) {
                llllllllllllIllIllIIlIIIllllllII.flush();
                "".length();
            }
            "".length();
            if ((0x38 ^ 0x4B ^ (0x37 ^ 0x40)) == " ".length()) {
                return null;
            }
        }
        return this;
    }
    
    @Override
    public boolean isEmpty() {
        int n;
        if (lIIlIIlIIlIIIIll(this.nonServerChannels.isEmpty() ? 1 : 0) && lIIlIIlIIlIIIIll(this.serverChannels.isEmpty() ? 1 : 0)) {
            n = DefaultChannelGroup.llIlIIlIIIIIlI[1];
            "".length();
            if (((0xC5 ^ 0xA1 ^ (0x20 ^ 0x56)) & (0xFD ^ 0x9D ^ (0x25 ^ 0x57) ^ -" ".length())) != 0x0) {
                return ((0xF7 ^ 0x8C ^ (0x7E ^ 0x2A)) & (174 + 98 - 224 + 131 ^ 107 + 39 - 116 + 126 ^ -" ".length())) != 0x0;
            }
        }
        else {
            n = DefaultChannelGroup.llIlIIlIIIIIlI[0];
        }
        return n != 0;
    }
    
    @Override
    public int hashCode() {
        return System.identityHashCode(this);
    }
}
