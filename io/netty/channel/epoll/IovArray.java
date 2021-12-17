// 
// Decompiled by Procyon v0.5.36
// 

package io.netty.channel.epoll;

import io.netty.buffer.ByteBuf;
import io.netty.util.internal.PlatformDependent;
import io.netty.util.concurrent.FastThreadLocal;
import io.netty.channel.ChannelOutboundBuffer;

final class IovArray implements ChannelOutboundBuffer.MessageProcessor
{
    private /* synthetic */ long size;
    static final /* synthetic */ boolean $assertionsDisabled;
    private static final /* synthetic */ int ADDRESS_SIZE;
    private static final /* synthetic */ FastThreadLocal<IovArray> ARRAY;
    private final /* synthetic */ long memoryAddress;
    private static final /* synthetic */ int IOV_SIZE;
    private /* synthetic */ int count;
    private static final /* synthetic */ int[] llllIIIIlIlll;
    private static final /* synthetic */ int CAPACITY;
    
    private static boolean lIlIIlllIIlIlll(final int lllllllllllllIlIllllIlIIIIIIIIII, final int lllllllllllllIlIllllIIllllllllll) {
        return lllllllllllllIlIllllIlIIIIIIIIII != lllllllllllllIlIllllIIllllllllll;
    }
    
    long size() {
        return this.size;
    }
    
    private static boolean lIlIIlllIIlIlIl(final int lllllllllllllIlIllllIlIIIIIIlIlI, final int lllllllllllllIlIllllIlIIIIIIlIIl) {
        return lllllllllllllIlIllllIlIIIIIIlIlI == lllllllllllllIlIllllIlIIIIIIlIIl;
    }
    
    private static boolean lIlIIlllIIllIIl(final int lllllllllllllIlIllllIlIIIIIIIIll) {
        return lllllllllllllIlIllllIlIIIIIIIIll > 0;
    }
    
    long processWritten(final int lllllllllllllIlIllllIlIIIIllIIIl, final long lllllllllllllIlIllllIlIIIIllIlIl) {
        final long lllllllllllllIlIllllIlIIIIllIlII = this.memoryAddress(lllllllllllllIlIllllIlIIIIllIIIl);
        final long lllllllllllllIlIllllIlIIIIllIIll = lllllllllllllIlIllllIlIIIIllIlII + IovArray.ADDRESS_SIZE;
        if (lIlIIlllIIlIlIl(IovArray.ADDRESS_SIZE, IovArray.llllIIIIlIlll[2])) {
            final long lllllllllllllIlIllllIlIIIIlllIlI = PlatformDependent.getLong(lllllllllllllIlIllllIlIIIIllIIll);
            if (lIlIIlllIIllIIl(lIlIIlllIIllIII(lllllllllllllIlIllllIlIIIIlllIlI, lllllllllllllIlIllllIlIIIIllIlIl))) {
                final long lllllllllllllIlIllllIlIIIIlllIll = PlatformDependent.getLong(lllllllllllllIlIllllIlIIIIllIlII);
                PlatformDependent.putLong(lllllllllllllIlIllllIlIIIIllIlII, lllllllllllllIlIllllIlIIIIlllIll + lllllllllllllIlIllllIlIIIIllIlIl);
                PlatformDependent.putLong(lllllllllllllIlIllllIlIIIIllIIll, lllllllllllllIlIllllIlIIIIlllIlI - lllllllllllllIlIllllIlIIIIllIlIl);
                return -1L;
            }
            return lllllllllllllIlIllllIlIIIIlllIlI;
        }
        else {
            if (lIlIIlllIIlIllI(IovArray.$assertionsDisabled ? 1 : 0) && lIlIIlllIIlIlll(IovArray.ADDRESS_SIZE, IovArray.llllIIIIlIlll[3])) {
                throw new AssertionError();
            }
            final long lllllllllllllIlIllllIlIIIIlllIII = PlatformDependent.getInt(lllllllllllllIlIllllIlIIIIllIIll);
            if (lIlIIlllIIllIIl(lIlIIlllIIllIII(lllllllllllllIlIllllIlIIIIlllIII, lllllllllllllIlIllllIlIIIIllIlIl))) {
                final int lllllllllllllIlIllllIlIIIIlllIIl = PlatformDependent.getInt(lllllllllllllIlIllllIlIIIIllIlII);
                PlatformDependent.putInt(lllllllllllllIlIllllIlIIIIllIlII, (int)(lllllllllllllIlIllllIlIIIIlllIIl + lllllllllllllIlIllllIlIIIIllIlIl));
                PlatformDependent.putInt(lllllllllllllIlIllllIlIIIIllIIll, (int)(lllllllllllllIlIllllIlIIIIlllIII - lllllllllllllIlIllllIlIIIIllIlIl));
                return -1L;
            }
            return lllllllllllllIlIllllIlIIIIlllIII;
        }
    }
    
    private boolean add(final ByteBuf lllllllllllllIlIllllIlIIIlIIllll) {
        if (lIlIIlllIIlIlIl(this.count, Native.IOV_MAX)) {
            return IovArray.llllIIIIlIlll[0] != 0;
        }
        final int lllllllllllllIlIllllIlIIIlIIlllI = lllllllllllllIlIllllIlIIIlIIllll.readableBytes();
        if (lIlIIlllIIlIllI(lllllllllllllIlIllllIlIIIlIIlllI)) {
            return IovArray.llllIIIIlIlll[1] != 0;
        }
        final long lllllllllllllIlIllllIlIIIlIIllIl = lllllllllllllIlIllllIlIIIlIIllll.memoryAddress();
        final int lllllllllllllIlIllllIlIIIlIIllII = lllllllllllllIlIllllIlIIIlIIllll.readerIndex();
        final int count = this.count;
        this.count = count + IovArray.llllIIIIlIlll[1];
        final long lllllllllllllIlIllllIlIIIlIIlIll = this.memoryAddress(count);
        final long lllllllllllllIlIllllIlIIIlIIlIlI = lllllllllllllIlIllllIlIIIlIIlIll + IovArray.ADDRESS_SIZE;
        if (lIlIIlllIIlIlIl(IovArray.ADDRESS_SIZE, IovArray.llllIIIIlIlll[2])) {
            PlatformDependent.putLong(lllllllllllllIlIllllIlIIIlIIlIll, lllllllllllllIlIllllIlIIIlIIllIl + lllllllllllllIlIllllIlIIIlIIllII);
            PlatformDependent.putLong(lllllllllllllIlIllllIlIIIlIIlIlI, lllllllllllllIlIllllIlIIIlIIlllI);
            "".length();
            if (((0x1 ^ 0x20 ^ (0xA ^ 0x27)) & (143 + 135 - 253 + 148 ^ 9 + 154 - 79 + 77 ^ -" ".length())) <= -" ".length()) {
                return ((0x4B ^ 0x59 ^ (0x73 ^ 0x28)) & (0x86 ^ 0xAD ^ (0x15 ^ 0x77) ^ -" ".length())) != 0x0;
            }
        }
        else {
            if (lIlIIlllIIlIllI(IovArray.$assertionsDisabled ? 1 : 0) && lIlIIlllIIlIlll(IovArray.ADDRESS_SIZE, IovArray.llllIIIIlIlll[3])) {
                throw new AssertionError();
            }
            PlatformDependent.putInt(lllllllllllllIlIllllIlIIIlIIlIll, (int)lllllllllllllIlIllllIlIIIlIIllIl + lllllllllllllIlIllllIlIIIlIIllII);
            PlatformDependent.putInt(lllllllllllllIlIllllIlIIIlIIlIlI, lllllllllllllIlIllllIlIIIlIIlllI);
        }
        this.size += lllllllllllllIlIllllIlIIIlIIlllI;
        return IovArray.llllIIIIlIlll[1] != 0;
    }
    
    private static boolean lIlIIlllIIllIlI(final int lllllllllllllIlIllllIlIIIIIIIlll) {
        return lllllllllllllIlIllllIlIIIIIIIlll != 0;
    }
    
    private static void lIlIIlllIIlIlII() {
        (llllIIIIlIlll = new int[5])[0] = ((0xA1 ^ 0x92 ^ (0x63 ^ 0x47)) & (66 + 45 - 44 + 83 ^ 27 + 126 - 96 + 72 ^ -" ".length()));
        IovArray.llllIIIIlIlll[1] = " ".length();
        IovArray.llllIIIIlIlll[2] = (0x81 ^ 0x89);
        IovArray.llllIIIIlIlll[3] = (0x77 ^ 0x73);
        IovArray.llllIIIIlIlll[4] = "  ".length();
    }
    
    int count() {
        return this.count;
    }
    
    static {
        lIlIIlllIIlIlII();
        int $assertionsDisabled2;
        if (lIlIIlllIIlIllI(IovArray.class.desiredAssertionStatus() ? 1 : 0)) {
            $assertionsDisabled2 = IovArray.llllIIIIlIlll[1];
            "".length();
            if ("  ".length() > "  ".length()) {
                return;
            }
        }
        else {
            $assertionsDisabled2 = IovArray.llllIIIIlIlll[0];
        }
        $assertionsDisabled = ($assertionsDisabled2 != 0);
        ADDRESS_SIZE = PlatformDependent.addressSize();
        IOV_SIZE = IovArray.llllIIIIlIlll[4] * IovArray.ADDRESS_SIZE;
        CAPACITY = Native.IOV_MAX * IovArray.IOV_SIZE;
        ARRAY = new FastThreadLocal<IovArray>() {
            @Override
            protected IovArray initialValue() throws Exception {
                return new IovArray(null);
            }
            
            @Override
            protected void onRemoval(final IovArray llllllllllllIlllIllllIllllIIlIII) throws Exception {
                PlatformDependent.freeMemory(llllllllllllIlllIllllIllllIIlIII.memoryAddress);
            }
        };
    }
    
    @Override
    public boolean processMessage(final Object lllllllllllllIlIllllIlIIIIIlllII) throws Exception {
        int n;
        if (lIlIIlllIIllIlI((lllllllllllllIlIllllIlIIIIIlllII instanceof ByteBuf) ? 1 : 0) && lIlIIlllIIllIlI(this.add((ByteBuf)lllllllllllllIlIllllIlIIIIIlllII) ? 1 : 0)) {
            n = IovArray.llllIIIIlIlll[1];
            "".length();
            if (-" ".length() >= " ".length()) {
                return ((0xD3 ^ 0x91) & ~(0xED ^ 0xAF)) != 0x0;
            }
        }
        else {
            n = IovArray.llllIIIIlIlll[0];
        }
        return n != 0;
    }
    
    private static boolean lIlIIlllIIlIllI(final int lllllllllllllIlIllllIlIIIIIIIlIl) {
        return lllllllllllllIlIllllIlIIIIIIIlIl == 0;
    }
    
    private static int lIlIIlllIIllIII(final long n, final long n2) {
        return lcmp(n, n2);
    }
    
    static IovArray get(final ChannelOutboundBuffer lllllllllllllIlIllllIlIIIIIlIlIl) throws Exception {
        final IovArray lllllllllllllIlIllllIlIIIIIlIllI = IovArray.ARRAY.get();
        lllllllllllllIlIllllIlIIIIIlIllI.size = 0L;
        lllllllllllllIlIllllIlIIIIIlIllI.count = IovArray.llllIIIIlIlll[0];
        lllllllllllllIlIllllIlIIIIIlIlIl.forEachFlushedMessage(lllllllllllllIlIllllIlIIIIIlIllI);
        return lllllllllllllIlIllllIlIIIIIlIllI;
    }
    
    private IovArray() {
        this.memoryAddress = PlatformDependent.allocateMemory(IovArray.CAPACITY);
    }
    
    long memoryAddress(final int lllllllllllllIlIllllIlIIIIlIIIlI) {
        return this.memoryAddress + IovArray.IOV_SIZE * lllllllllllllIlIllllIlIIIIlIIIlI;
    }
}
