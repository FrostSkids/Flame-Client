// 
// Decompiled by Procyon v0.5.36
// 

package io.netty.buffer;

import java.io.InputStream;
import io.netty.util.internal.EmptyArrays;
import java.nio.channels.ScatteringByteChannel;
import java.util.Collection;
import java.util.Collections;
import java.nio.channels.GatheringByteChannel;
import java.util.ArrayList;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Iterator;
import java.util.ListIterator;
import io.netty.util.ReferenceCounted;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.nio.ByteOrder;
import java.util.List;
import io.netty.util.ResourceLeak;
import java.nio.ByteBuffer;

public class CompositeByteBuf extends AbstractReferenceCountedByteBuf
{
    private static final /* synthetic */ ByteBuffer FULL_BYTEBUFFER;
    private final /* synthetic */ int maxNumComponents;
    private final /* synthetic */ boolean direct;
    private static final /* synthetic */ int[] lIIllIIIIIlllI;
    private final /* synthetic */ ResourceLeak leak;
    private static final /* synthetic */ String[] lIIllIIIIIlIIl;
    private /* synthetic */ boolean freed;
    private final /* synthetic */ List<Component> components;
    private final /* synthetic */ ByteBufAllocator alloc;
    
    @Override
    public ByteOrder order() {
        return ByteOrder.BIG_ENDIAN;
    }
    
    private static int llIlIlIllIIIlIl(final long n, final long n2) {
        return lcmp(n, n2);
    }
    
    @Override
    public CompositeByteBuf readBytes(final ByteBuf lllllllllllllIIlIlllIIllIIIlllII, final int lllllllllllllIIlIlllIIllIIIlIllI, final int lllllllllllllIIlIlllIIllIIIlIlIl) {
        return (CompositeByteBuf)super.readBytes(lllllllllllllIIlIlllIIllIIIlllII, lllllllllllllIIlIlllIIllIIIlIllI, lllllllllllllIIlIlllIIllIIIlIlIl);
    }
    
    private int addComponent0(final int lllllllllllllIIlIllllIlIllllllII, final ByteBuf lllllllllllllIIlIllllIlIlllllIll) {
        this.checkComponentIndex(lllllllllllllIIlIllllIlIllllllII);
        if (llIlIlIlIlIlIlI(lllllllllllllIIlIllllIlIlllllIll)) {
            throw new NullPointerException(CompositeByteBuf.lIIllIIIIIlIIl[CompositeByteBuf.lIIllIIIIIlllI[8]]);
        }
        final int lllllllllllllIIlIllllIlIllllllll = lllllllllllllIIlIllllIlIlllllIll.readableBytes();
        if (llIlIlIlIlIllII(lllllllllllllIIlIllllIlIllllllll)) {
            return lllllllllllllIIlIllllIlIllllllII;
        }
        final Component lllllllllllllIIlIllllIlIlllllllI = new Component(lllllllllllllIIlIllllIlIlllllIll.order(ByteOrder.BIG_ENDIAN).slice());
        if (llIlIlIlIlIllIl(lllllllllllllIIlIllllIlIllllllII, this.components.size())) {
            this.components.add(lllllllllllllIIlIllllIlIlllllllI);
            "".length();
            if (llIlIlIlIlIllII(lllllllllllllIIlIllllIlIllllllII)) {
                lllllllllllllIIlIllllIlIlllllllI.endOffset = lllllllllllllIIlIllllIlIllllllll;
                "".length();
                if (-" ".length() >= (0xAC ^ 0xA8)) {
                    return (0x3E ^ 0x5E) & ~(0x7C ^ 0x1C);
                }
            }
            else {
                final Component lllllllllllllIIlIllllIllIIIIIIll = this.components.get(lllllllllllllIIlIllllIlIllllllII - CompositeByteBuf.lIIllIIIIIlllI[2]);
                lllllllllllllIIlIllllIlIlllllllI.offset = lllllllllllllIIlIllllIllIIIIIIll.endOffset;
                lllllllllllllIIlIllllIlIlllllllI.endOffset = lllllllllllllIIlIllllIlIlllllllI.offset + lllllllllllllIIlIllllIlIllllllll;
                "".length();
                if (-" ".length() > ((210 + 153 - 208 + 58 ^ 6 + 52 + 35 + 57) & (0xB2 ^ 0x8A ^ (0xC1 ^ 0xBA) ^ -" ".length()))) {
                    return (0x14 ^ 0x7C ^ (0x89 ^ 0xAF)) & (0x44 ^ 0x74 ^ (0x12 ^ 0x6C) ^ -" ".length());
                }
            }
        }
        else {
            this.components.add(lllllllllllllIIlIllllIlIllllllII, lllllllllllllIIlIllllIlIlllllllI);
            this.updateComponentOffsets(lllllllllllllIIlIllllIlIllllllII);
        }
        return lllllllllllllIIlIllllIlIllllllII;
    }
    
    static {
        llIlIlIlIlIlIIl();
        llIlIlIlIIlIllI();
        FULL_BYTEBUFFER = (ByteBuffer)ByteBuffer.allocate(CompositeByteBuf.lIIllIIIIIlllI[2]).position(CompositeByteBuf.lIIllIIIIIlllI[2]);
    }
    
    @Override
    public CompositeByteBuf retain(final int lllllllllllllIIlIlllIIlIIIIIIlll) {
        return (CompositeByteBuf)super.retain(lllllllllllllIIlIlllIIlIIIIIIlll);
    }
    
    @Override
    public boolean hasMemoryAddress() {
        if (llIlIlIlIlIllIl(this.components.size(), CompositeByteBuf.lIIllIIIIIlllI[2])) {
            return this.components.get(CompositeByteBuf.lIIllIIIIIlllI[1]).buf.hasMemoryAddress();
        }
        return CompositeByteBuf.lIIllIIIIIlllI[1] != 0;
    }
    
    @Override
    public CompositeByteBuf getBytes(final int lllllllllllllIIlIlllIIlllIllIIIl, final byte[] lllllllllllllIIlIlllIIlllIlIllIl) {
        return (CompositeByteBuf)super.getBytes(lllllllllllllIIlIlllIIlllIllIIIl, lllllllllllllIIlIlllIIlllIlIllIl);
    }
    
    @Override
    public CompositeByteBuf setBytes(final int lllllllllllllIIlIlllIIllIllIlllI, final ByteBuf lllllllllllllIIlIlllIIllIllIlIlI) {
        return (CompositeByteBuf)super.setBytes(lllllllllllllIIlIlllIIllIllIlllI, lllllllllllllIIlIlllIIllIllIlIlI);
    }
    
    public CompositeByteBuf addComponent(final int lllllllllllllIIlIllllIllIIIIlIll, final ByteBuf lllllllllllllIIlIllllIllIIIIlIlI) {
        this.addComponent0(lllllllllllllIIlIllllIllIIIIlIll, lllllllllllllIIlIllllIllIIIIlIlI);
        "".length();
        this.consolidateIfNeeded();
        return this;
    }
    
    private static String llIlIlIlIIIllll(final String lllllllllllllIIlIllIlllIlIIllIII, final String lllllllllllllIIlIllIlllIlIIllIIl) {
        try {
            final SecretKeySpec lllllllllllllIIlIllIlllIlIIlllIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIIlIllIlllIlIIllIIl.getBytes(StandardCharsets.UTF_8)), CompositeByteBuf.lIIllIIIIIlllI[9]), "DES");
            final Cipher lllllllllllllIIlIllIlllIlIIlllII = Cipher.getInstance("DES");
            lllllllllllllIIlIllIlllIlIIlllII.init(CompositeByteBuf.lIIllIIIIIlllI[3], lllllllllllllIIlIllIlllIlIIlllIl);
            return new String(lllllllllllllIIlIllIlllIlIIlllII.doFinal(Base64.getDecoder().decode(lllllllllllllIIlIllIlllIlIIllIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIlIllIlllIlIIllIll) {
            lllllllllllllIIlIllIlllIlIIllIll.printStackTrace();
            return null;
        }
    }
    
    @Override
    protected void _setInt(final int lllllllllllllIIlIlllIlllIllIlllI, final int lllllllllllllIIlIlllIlllIllIllIl) {
        final Component lllllllllllllIIlIlllIlllIllIllII = this.findComponent(lllllllllllllIIlIlllIlllIllIlllI);
        if (llIlIlIlIllIlIl(lllllllllllllIIlIlllIlllIllIlllI + CompositeByteBuf.lIIllIIIIIlllI[5], lllllllllllllIIlIlllIlllIllIllII.endOffset)) {
            lllllllllllllIIlIlllIlllIllIllII.buf.setInt(lllllllllllllIIlIlllIlllIllIlllI - lllllllllllllIIlIlllIlllIllIllII.offset, lllllllllllllIIlIlllIlllIllIllIl);
            "".length();
            "".length();
            if (((0x5 ^ 0xD ^ (0xD2 ^ 0x8B)) & (189 + 166 - 218 + 75 ^ 124 + 118 - 152 + 43 ^ -" ".length())) != 0x0) {
                return;
            }
        }
        else if (llIlIlIllIIIIII(this.order(), ByteOrder.BIG_ENDIAN)) {
            this._setShort(lllllllllllllIIlIlllIlllIllIlllI, (short)(lllllllllllllIIlIlllIlllIllIllIl >>> CompositeByteBuf.lIIllIIIIIlllI[17]));
            this._setShort(lllllllllllllIIlIlllIlllIllIlllI + CompositeByteBuf.lIIllIIIIIlllI[3], (short)lllllllllllllIIlIlllIlllIllIllIl);
            "".length();
            if (null != null) {
                return;
            }
        }
        else {
            this._setShort(lllllllllllllIIlIlllIlllIllIlllI, (short)lllllllllllllIIlIlllIlllIllIllIl);
            this._setShort(lllllllllllllIIlIlllIlllIllIlllI + CompositeByteBuf.lIIllIIIIIlllI[3], (short)(lllllllllllllIIlIlllIlllIllIllIl >>> CompositeByteBuf.lIIllIIIIIlllI[17]));
        }
    }
    
    @Override
    public CompositeByteBuf discardSomeReadBytes() {
        return this.discardReadComponents();
    }
    
    @Override
    public CompositeByteBuf writeFloat(final float lllllllllllllIIlIlllIIlIlIIIIIlI) {
        return (CompositeByteBuf)super.writeFloat(lllllllllllllIIlIlllIIlIlIIIIIlI);
    }
    
    private void consolidateIfNeeded() {
        final int lllllllllllllIIlIllllIlIlIIlIIIl = this.components.size();
        if (llIlIlIlIllIIIl(lllllllllllllIIlIllllIlIlIIlIIIl, this.maxNumComponents)) {
            final int lllllllllllllIIlIllllIlIlIIlIlIl = this.components.get(lllllllllllllIIlIllllIlIlIIlIIIl - CompositeByteBuf.lIIllIIIIIlllI[2]).endOffset;
            final ByteBuf lllllllllllllIIlIllllIlIlIIlIlII = this.allocBuffer(lllllllllllllIIlIllllIlIlIIlIlIl);
            int lllllllllllllIIlIllllIlIlIIlIllI = CompositeByteBuf.lIIllIIIIIlllI[1];
            while (llIlIlIlIlIlIll(lllllllllllllIIlIllllIlIlIIlIllI, lllllllllllllIIlIllllIlIlIIlIIIl)) {
                final Component lllllllllllllIIlIllllIlIlIIllIlI = this.components.get(lllllllllllllIIlIllllIlIlIIlIllI);
                final ByteBuf lllllllllllllIIlIllllIlIlIIllIII = lllllllllllllIIlIllllIlIlIIllIlI.buf;
                lllllllllllllIIlIllllIlIlIIlIlII.writeBytes(lllllllllllllIIlIllllIlIlIIllIII);
                "".length();
                lllllllllllllIIlIllllIlIlIIllIlI.freeIfNecessary();
                ++lllllllllllllIIlIllllIlIlIIlIllI;
                "".length();
                if (-(0x1 ^ 0x5) >= 0) {
                    return;
                }
            }
            final Component lllllllllllllIIlIllllIlIlIIlIIll = new Component(lllllllllllllIIlIllllIlIlIIlIlII);
            lllllllllllllIIlIllllIlIlIIlIIll.endOffset = lllllllllllllIIlIllllIlIlIIlIIll.length;
            this.components.clear();
            this.components.add(lllllllllllllIIlIllllIlIlIIlIIll);
            "".length();
        }
    }
    
    private static boolean llIlIlIlIlIlIlI(final Object lllllllllllllIIlIllIlllIIllIllII) {
        return lllllllllllllIIlIllIlllIIllIllII == null;
    }
    
    @Override
    public CompositeByteBuf markReaderIndex() {
        return (CompositeByteBuf)super.markReaderIndex();
    }
    
    @Override
    public long memoryAddress() {
        if (llIlIlIlIlIllIl(this.components.size(), CompositeByteBuf.lIIllIIIIIlllI[2])) {
            return this.components.get(CompositeByteBuf.lIIllIIIIIlllI[1]).buf.memoryAddress();
        }
        throw new UnsupportedOperationException();
    }
    
    @Override
    public CompositeByteBuf capacity(final int lllllllllllllIIlIllllIIllIIIIIIl) {
        this.ensureAccessible();
        if (!llIlIlIlIllIIll(lllllllllllllIIlIllllIIllIIIIIIl) || llIlIlIlIllIIIl(lllllllllllllIIlIllllIIllIIIIIIl, this.maxCapacity())) {
            throw new IllegalArgumentException(String.valueOf(new StringBuilder().append(CompositeByteBuf.lIIllIIIIIlIIl[CompositeByteBuf.lIIllIIIIIlllI[13]]).append(lllllllllllllIIlIllllIIllIIIIIIl)));
        }
        final int lllllllllllllIIlIllllIIllIIIIIll = this.capacity();
        if (llIlIlIlIllIIIl(lllllllllllllIIlIllllIIllIIIIIIl, lllllllllllllIIlIllllIIllIIIIIll)) {
            final int lllllllllllllIIlIllllIIllIIIllII = lllllllllllllIIlIllllIIllIIIIIIl - lllllllllllllIIlIllllIIllIIIIIll;
            final int lllllllllllllIIlIllllIIllIIIlIlI = this.components.size();
            if (llIlIlIlIlIlIll(lllllllllllllIIlIllllIIllIIIlIlI, this.maxNumComponents)) {
                final ByteBuf lllllllllllllIIlIllllIIllIIIllIl = this.allocBuffer(lllllllllllllIIlIllllIIllIIIllII);
                lllllllllllllIIlIllllIIllIIIllIl.setIndex(CompositeByteBuf.lIIllIIIIIlllI[1], lllllllllllllIIlIllllIIllIIIllII);
                "".length();
                this.addComponent0(this.components.size(), lllllllllllllIIlIllllIIllIIIllIl);
                "".length();
                "".length();
                if (-(0x26 ^ 0x22) >= 0) {
                    return null;
                }
            }
            else {
                final ByteBuf lllllllllllllIIlIllllIIllIIIlIll = this.allocBuffer(lllllllllllllIIlIllllIIllIIIllII);
                lllllllllllllIIlIllllIIllIIIlIll.setIndex(CompositeByteBuf.lIIllIIIIIlllI[1], lllllllllllllIIlIllllIIllIIIllII);
                "".length();
                this.addComponent0(this.components.size(), lllllllllllllIIlIllllIIllIIIlIll);
                "".length();
                this.consolidateIfNeeded();
            }
            "".length();
            if (-"   ".length() >= 0) {
                return null;
            }
        }
        else if (llIlIlIlIlIlIll(lllllllllllllIIlIllllIIllIIIIIIl, lllllllllllllIIlIllllIIllIIIIIll)) {
            int lllllllllllllIIlIllllIIllIIIIllI = lllllllllllllIIlIllllIIllIIIIIll - lllllllllllllIIlIllllIIllIIIIIIl;
            final ListIterator<Component> lllllllllllllIIlIllllIIllIIIIlll = this.components.listIterator(this.components.size());
            while (llIlIlIlIlIllll(lllllllllllllIIlIllllIIllIIIIlll.hasPrevious() ? 1 : 0)) {
                final Component lllllllllllllIIlIllllIIllIIIlIIl = lllllllllllllIIlIllllIIllIIIIlll.previous();
                if (llIlIlIlIlllIll(lllllllllllllIIlIllllIIllIIIIllI, lllllllllllllIIlIllllIIllIIIlIIl.length)) {
                    lllllllllllllIIlIllllIIllIIIIllI -= lllllllllllllIIlIllllIIllIIIlIIl.length;
                    lllllllllllllIIlIllllIIllIIIIlll.remove();
                    "".length();
                    if (-"  ".length() > 0) {
                        return null;
                    }
                    continue;
                }
                else {
                    final Component lllllllllllllIIlIllllIIllIIIlIII = new Component(lllllllllllllIIlIllllIIllIIIlIIl.buf.slice(CompositeByteBuf.lIIllIIIIIlllI[1], lllllllllllllIIlIllllIIllIIIlIIl.length - lllllllllllllIIlIllllIIllIIIIllI));
                    lllllllllllllIIlIllllIIllIIIlIII.offset = lllllllllllllIIlIllllIIllIIIlIIl.offset;
                    lllllllllllllIIlIllllIIllIIIlIII.endOffset = lllllllllllllIIlIllllIIllIIIlIII.offset + lllllllllllllIIlIllllIIllIIIlIII.length;
                    lllllllllllllIIlIllllIIllIIIIlll.set(lllllllllllllIIlIllllIIllIIIlIII);
                    "".length();
                    if (-(0xE5 ^ 0xB9 ^ (0x3F ^ 0x67)) > 0) {
                        return null;
                    }
                    break;
                }
            }
            if (llIlIlIlIllIIIl(this.readerIndex(), lllllllllllllIIlIllllIIllIIIIIIl)) {
                this.setIndex(lllllllllllllIIlIllllIIllIIIIIIl, lllllllllllllIIlIllllIIllIIIIIIl);
                "".length();
                "".length();
                if (null != null) {
                    return null;
                }
            }
            else if (llIlIlIlIllIIIl(this.writerIndex(), lllllllllllllIIlIllllIIllIIIIIIl)) {
                this.writerIndex(lllllllllllllIIlIllllIIllIIIIIIl);
                "".length();
            }
        }
        return this;
    }
    
    @Override
    public CompositeByteBuf setBytes(int lllllllllllllIIlIlllIllIlllIIIII, final ByteBuffer lllllllllllllIIlIlllIllIllIllllI) {
        final int lllllllllllllIIlIlllIllIlllIIllI = lllllllllllllIIlIlllIllIllIllllI.limit();
        int lllllllllllllIIlIlllIllIlllIIlIl = lllllllllllllIIlIlllIllIllIllllI.remaining();
        this.checkIndex((int)lllllllllllllIIlIlllIllIlllIIIII, lllllllllllllIIlIlllIllIlllIIlIl);
        if (llIlIlIlIlIllII(lllllllllllllIIlIlllIllIlllIIlIl)) {
            return this;
        }
        int lllllllllllllIIlIlllIllIlllIIIll = this.toComponentIndex((int)lllllllllllllIIlIlllIllIlllIIIII);
        try {
            while (llIlIlIllIIIIll(lllllllllllllIIlIlllIllIlllIIlIl)) {
                final Component lllllllllllllIIlIlllIllIlllIllll = this.components.get(lllllllllllllIIlIlllIllIlllIIIll);
                final ByteBuf lllllllllllllIIlIlllIllIlllIlllI = lllllllllllllIIlIlllIllIlllIllll.buf;
                final int lllllllllllllIIlIlllIllIlllIllIl = lllllllllllllIIlIlllIllIlllIllll.offset;
                final int lllllllllllllIIlIlllIllIlllIllII = Math.min(lllllllllllllIIlIlllIllIlllIIlIl, (int)(lllllllllllllIIlIlllIllIlllIlllI.capacity() - (lllllllllllllIIlIlllIllIlllIIIII - lllllllllllllIIlIlllIllIlllIllIl)));
                lllllllllllllIIlIlllIllIllIllllI.limit(lllllllllllllIIlIlllIllIllIllllI.position() + lllllllllllllIIlIlllIllIlllIllII);
                "".length();
                lllllllllllllIIlIlllIllIlllIlllI.setBytes((int)(lllllllllllllIIlIlllIllIlllIIIII - lllllllllllllIIlIlllIllIlllIllIl), lllllllllllllIIlIlllIllIllIllllI);
                "".length();
                lllllllllllllIIlIlllIllIlllIIIII += lllllllllllllIIlIlllIllIlllIllII;
                lllllllllllllIIlIlllIllIlllIIlIl -= lllllllllllllIIlIlllIllIlllIllII;
                ++lllllllllllllIIlIlllIllIlllIIIll;
                "".length();
                if ("  ".length() < 0) {
                    return null;
                }
            }
            lllllllllllllIIlIlllIllIllIllllI.limit(lllllllllllllIIlIlllIllIlllIIllI);
            "".length();
            "".length();
            if (((0x43 ^ 0x2E ^ (0x3D ^ 0x30)) & (231 + 191 - 295 + 122 ^ 94 + 72 - 87 + 74 ^ -" ".length())) > "   ".length()) {
                return null;
            }
        }
        finally {
            lllllllllllllIIlIlllIllIllIllllI.limit(lllllllllllllIIlIlllIllIlllIIllI);
            "".length();
        }
        return this;
    }
    
    private ByteBuf allocBuffer(final int lllllllllllllIIlIlllIlIIIlIIIIlI) {
        if (llIlIlIlIlIllll(this.direct ? 1 : 0)) {
            return this.alloc().directBuffer(lllllllllllllIIlIlllIlIIIlIIIIlI);
        }
        return this.alloc().heapBuffer(lllllllllllllIIlIlllIlIIIlIIIIlI);
    }
    
    @Override
    public CompositeByteBuf writeBytes(final ByteBuf lllllllllllllIIlIlllIIlIIlIlllll, final int lllllllllllllIIlIlllIIlIIlIlllIl) {
        return (CompositeByteBuf)super.writeBytes(lllllllllllllIIlIlllIIlIIlIlllll, lllllllllllllIIlIlllIIlIIlIlllIl);
    }
    
    @Override
    public CompositeByteBuf writeShort(final int lllllllllllllIIlIlllIIlIlIllIIlI) {
        return (CompositeByteBuf)super.writeShort(lllllllllllllIIlIlllIIlIlIllIIlI);
    }
    
    @Override
    protected void _setLong(final int lllllllllllllIIlIlllIlllIlIIllIl, final long lllllllllllllIIlIlllIlllIlIIllII) {
        final Component lllllllllllllIIlIlllIlllIlIIlIlI = this.findComponent(lllllllllllllIIlIlllIlllIlIIllIl);
        if (llIlIlIlIllIlIl(lllllllllllllIIlIlllIlllIlIIllIl + CompositeByteBuf.lIIllIIIIIlllI[9], lllllllllllllIIlIlllIlllIlIIlIlI.endOffset)) {
            lllllllllllllIIlIlllIlllIlIIlIlI.buf.setLong(lllllllllllllIIlIlllIlllIlIIllIl - lllllllllllllIIlIlllIlllIlIIlIlI.offset, lllllllllllllIIlIlllIlllIlIIllII);
            "".length();
            "".length();
            if ((0x69 ^ 0x6D) != (0x82 ^ 0x86)) {
                return;
            }
        }
        else if (llIlIlIllIIIIII(this.order(), ByteOrder.BIG_ENDIAN)) {
            this._setInt(lllllllllllllIIlIlllIlllIlIIllIl, (int)(lllllllllllllIIlIlllIlllIlIIllII >>> CompositeByteBuf.lIIllIIIIIlllI[18]));
            this._setInt(lllllllllllllIIlIlllIlllIlIIllIl + CompositeByteBuf.lIIllIIIIIlllI[5], (int)lllllllllllllIIlIlllIlllIlIIllII);
            "".length();
            if (-"  ".length() > 0) {
                return;
            }
        }
        else {
            this._setInt(lllllllllllllIIlIlllIlllIlIIllIl, (int)lllllllllllllIIlIlllIlllIlIIllII);
            this._setInt(lllllllllllllIIlIlllIlllIlIIllIl + CompositeByteBuf.lIIllIIIIIlllI[5], (int)(lllllllllllllIIlIlllIlllIlIIllII >>> CompositeByteBuf.lIIllIIIIIlllI[18]));
        }
    }
    
    @Override
    public CompositeByteBuf discardReadBytes() {
        this.ensureAccessible();
        final int lllllllllllllIIlIlllIlIIIlIlllII = this.readerIndex();
        if (llIlIlIlIlIllII(lllllllllllllIIlIlllIlIIIlIlllII)) {
            return this;
        }
        final int lllllllllllllIIlIlllIlIIIlIllIll = this.writerIndex();
        if (llIlIlIlIlIllIl(lllllllllllllIIlIlllIlIIIlIlllII, lllllllllllllIIlIlllIlIIIlIllIll) && llIlIlIlIlIllIl(lllllllllllllIIlIlllIlIIIlIllIll, this.capacity())) {
            final Iterator lllllllllllllIIlIlllIlIIIllIIIII = this.components.iterator();
            while (llIlIlIlIlIllll(lllllllllllllIIlIlllIlIIIllIIIII.hasNext() ? 1 : 0)) {
                final Component lllllllllllllIIlIlllIlIIIllIIIIl = lllllllllllllIIlIlllIlIIIllIIIII.next();
                lllllllllllllIIlIlllIlIIIllIIIIl.freeIfNecessary();
                "".length();
                if (null != null) {
                    return null;
                }
            }
            this.components.clear();
            this.setIndex(CompositeByteBuf.lIIllIIIIIlllI[1], CompositeByteBuf.lIIllIIIIIlllI[1]);
            "".length();
            this.adjustMarkers(lllllllllllllIIlIlllIlIIIlIlllII);
            return this;
        }
        final int lllllllllllllIIlIlllIlIIIlIllIlI = this.toComponentIndex(lllllllllllllIIlIlllIlIIIlIlllII);
        int lllllllllllllIIlIlllIlIIIlIlllll = CompositeByteBuf.lIIllIIIIIlllI[1];
        while (llIlIlIlIlIlIll(lllllllllllllIIlIlllIlIIIlIlllll, lllllllllllllIIlIlllIlIIIlIllIlI)) {
            this.components.get(lllllllllllllIIlIlllIlIIIlIlllll).freeIfNecessary();
            ++lllllllllllllIIlIlllIlIIIlIlllll;
            "".length();
            if (((0x75 ^ 0x72) & ~(0x1B ^ 0x1C)) < 0) {
                return null;
            }
        }
        this.components.subList(CompositeByteBuf.lIIllIIIIIlllI[1], lllllllllllllIIlIlllIlIIIlIllIlI).clear();
        final Component lllllllllllllIIlIlllIlIIIlIllIIl = this.components.get(CompositeByteBuf.lIIllIIIIIlllI[1]);
        final int lllllllllllllIIlIlllIlIIIlIlIlll = lllllllllllllIIlIlllIlIIIlIlllII - lllllllllllllIIlIlllIlIIIlIllIIl.offset;
        if (llIlIlIlIlIllIl(lllllllllllllIIlIlllIlIIIlIlIlll, lllllllllllllIIlIlllIlIIIlIllIIl.length)) {
            this.components.remove(CompositeByteBuf.lIIllIIIIIlllI[1]);
            "".length();
            "".length();
            if (" ".length() > "   ".length()) {
                return null;
            }
        }
        else {
            final Component lllllllllllllIIlIlllIlIIIlIllllI = new Component(lllllllllllllIIlIlllIlIIIlIllIIl.buf.slice(lllllllllllllIIlIlllIlIIIlIlIlll, lllllllllllllIIlIlllIlIIIlIllIIl.length - lllllllllllllIIlIlllIlIIIlIlIlll));
            this.components.set(CompositeByteBuf.lIIllIIIIIlllI[1], lllllllllllllIIlIlllIlIIIlIllllI);
            "".length();
        }
        this.updateComponentOffsets(CompositeByteBuf.lIIllIIIIIlllI[1]);
        this.setIndex(CompositeByteBuf.lIIllIIIIIlllI[1], lllllllllllllIIlIlllIlIIIlIllIll - lllllllllllllIIlIlllIlIIIlIlllII);
        "".length();
        this.adjustMarkers(lllllllllllllIIlIlllIlIIIlIlllII);
        return this;
    }
    
    @Override
    protected byte _getByte(final int lllllllllllllIIlIllllIIlIlIIllII) {
        final Component lllllllllllllIIlIllllIIlIlIIlllI = this.findComponent(lllllllllllllIIlIllllIIlIlIIllII);
        return lllllllllllllIIlIllllIIlIlIIlllI.buf.getByte(lllllllllllllIIlIllllIIlIlIIllII - lllllllllllllIIlIllllIIlIlIIlllI.offset);
    }
    
    @Override
    public CompositeByteBuf getBytes(int lllllllllllllIIlIllllIIIllIlIllI, final byte[] lllllllllllllIIlIllllIIIllIlIlII, int lllllllllllllIIlIllllIIIllIlIIlI, int lllllllllllllIIlIllllIIIllIlIIII) {
        this.checkDstIndex(lllllllllllllIIlIllllIIIllIlIllI, (int)lllllllllllllIIlIllllIIIllIlIIII, lllllllllllllIIlIllllIIIllIlIIlI, lllllllllllllIIlIllllIIIllIlIlII.length);
        if (llIlIlIlIlIllII((int)lllllllllllllIIlIllllIIIllIlIIII)) {
            return this;
        }
        int lllllllllllllIIlIllllIIIllIllIlI = this.toComponentIndex(lllllllllllllIIlIllllIIIllIlIllI);
        while (llIlIlIllIIIIll((int)lllllllllllllIIlIllllIIIllIlIIII)) {
            final Component lllllllllllllIIlIllllIIIlllIIlll = this.components.get(lllllllllllllIIlIllllIIIllIllIlI);
            final ByteBuf lllllllllllllIIlIllllIIIlllIIlIl = lllllllllllllIIlIllllIIIlllIIlll.buf;
            final int lllllllllllllIIlIllllIIIlllIIIll = lllllllllllllIIlIllllIIIlllIIlll.offset;
            final int lllllllllllllIIlIllllIIIlllIIIlI = Math.min((int)lllllllllllllIIlIllllIIIllIlIIII, lllllllllllllIIlIllllIIIlllIIlIl.capacity() - (lllllllllllllIIlIllllIIIllIlIllI - lllllllllllllIIlIllllIIIlllIIIll));
            lllllllllllllIIlIllllIIIlllIIlIl.getBytes(lllllllllllllIIlIllllIIIllIlIllI - lllllllllllllIIlIllllIIIlllIIIll, lllllllllllllIIlIllllIIIllIlIlII, lllllllllllllIIlIllllIIIllIlIIlI, lllllllllllllIIlIllllIIIlllIIIlI);
            "".length();
            lllllllllllllIIlIllllIIIllIlIllI += lllllllllllllIIlIllllIIIlllIIIlI;
            lllllllllllllIIlIllllIIIllIlIIlI += lllllllllllllIIlIllllIIIlllIIIlI;
            lllllllllllllIIlIllllIIIllIlIIII -= lllllllllllllIIlIllllIIIlllIIIlI;
            ++lllllllllllllIIlIllllIIIllIllIlI;
            "".length();
            if (-" ".length() > 0) {
                return null;
            }
        }
        return this;
    }
    
    @Override
    public CompositeByteBuf writeBytes(final ByteBuf lllllllllllllIIlIlllIIlIIllIlIIl) {
        return (CompositeByteBuf)super.writeBytes(lllllllllllllIIlIlllIIlIIllIlIIl);
    }
    
    @Override
    public CompositeByteBuf setFloat(final int lllllllllllllIIlIlllIIlllIIIlIII, final float lllllllllllllIIlIlllIIlllIIIIllI) {
        return (CompositeByteBuf)super.setFloat(lllllllllllllIIlIlllIIlllIIIlIII, lllllllllllllIIlIlllIIlllIIIIllI);
    }
    
    public CompositeByteBuf removeComponents(final int lllllllllllllIIlIllllIlIIIIlllII, final int lllllllllllllIIlIllllIlIIIIllIlI) {
        this.checkComponentIndex(lllllllllllllIIlIllllIlIIIIlllII, lllllllllllllIIlIllllIlIIIIllIlI);
        final List<Component> lllllllllllllIIlIllllIlIIIlIIIII = this.components.subList(lllllllllllllIIlIllllIlIIIIlllII, lllllllllllllIIlIllllIlIIIIlllII + lllllllllllllIIlIllllIlIIIIllIlI);
        final Iterator lllllllllllllIIlIllllIlIIIlIIlIl = lllllllllllllIIlIllllIlIIIlIIIII.iterator();
        while (llIlIlIlIlIllll(lllllllllllllIIlIllllIlIIIlIIlIl.hasNext() ? 1 : 0)) {
            final Component lllllllllllllIIlIllllIlIIIlIIllI = lllllllllllllIIlIllllIlIIIlIIlIl.next();
            lllllllllllllIIlIllllIlIIIlIIllI.freeIfNecessary();
            "".length();
            if ("  ".length() > "  ".length()) {
                return null;
            }
        }
        lllllllllllllIIlIllllIlIIIlIIIII.clear();
        this.updateComponentOffsets(lllllllllllllIIlIllllIlIIIIlllII);
        return this;
    }
    
    @Override
    public CompositeByteBuf getBytes(int lllllllllllllIIlIllllIIIIIIIIIll, final OutputStream lllllllllllllIIlIllllIIIIIIIlIIl, int lllllllllllllIIlIlllIlllllllllll) throws IOException {
        this.checkIndex(lllllllllllllIIlIllllIIIIIIIIIll, lllllllllllllIIlIlllIlllllllllll);
        if (llIlIlIlIlIllII(lllllllllllllIIlIlllIlllllllllll)) {
            return this;
        }
        int lllllllllllllIIlIllllIIIIIIIIllI = this.toComponentIndex(lllllllllllllIIlIllllIIIIIIIIIll);
        while (llIlIlIllIIIIll(lllllllllllllIIlIlllIlllllllllll)) {
            final Component lllllllllllllIIlIllllIIIIIIlIIlI = this.components.get(lllllllllllllIIlIllllIIIIIIIIllI);
            final ByteBuf lllllllllllllIIlIllllIIIIIIlIIII = lllllllllllllIIlIllllIIIIIIlIIlI.buf;
            final int lllllllllllllIIlIllllIIIIIIIlllI = lllllllllllllIIlIllllIIIIIIlIIlI.offset;
            final int lllllllllllllIIlIllllIIIIIIIllIl = Math.min(lllllllllllllIIlIlllIlllllllllll, lllllllllllllIIlIllllIIIIIIlIIII.capacity() - (lllllllllllllIIlIllllIIIIIIIIIll - lllllllllllllIIlIllllIIIIIIIlllI));
            lllllllllllllIIlIllllIIIIIIlIIII.getBytes(lllllllllllllIIlIllllIIIIIIIIIll - lllllllllllllIIlIllllIIIIIIIlllI, lllllllllllllIIlIllllIIIIIIIlIIl, lllllllllllllIIlIllllIIIIIIIllIl);
            "".length();
            lllllllllllllIIlIllllIIIIIIIIIll += lllllllllllllIIlIllllIIIIIIIllIl;
            lllllllllllllIIlIlllIlllllllllll -= lllllllllllllIIlIllllIIIIIIIllIl;
            ++lllllllllllllIIlIllllIIIIIIIIllI;
            "".length();
            if (-" ".length() >= ("  ".length() & ~"  ".length())) {
                return null;
            }
        }
        return this;
    }
    
    private void updateComponentOffsets(int lllllllllllllIIlIllllIlIIlIIlIlI) {
        final int lllllllllllllIIlIllllIlIIlIlIIII = this.components.size();
        if (llIlIlIlIllIlIl(lllllllllllllIIlIllllIlIIlIlIIII, lllllllllllllIIlIllllIlIIlIIlIlI)) {
            return;
        }
        final Component lllllllllllllIIlIllllIlIIlIIlllI = this.components.get(lllllllllllllIIlIllllIlIIlIIlIlI);
        if (llIlIlIlIlIllII(lllllllllllllIIlIllllIlIIlIIlIlI)) {
            lllllllllllllIIlIllllIlIIlIIlllI.offset = CompositeByteBuf.lIIllIIIIIlllI[1];
            lllllllllllllIIlIllllIlIIlIIlllI.endOffset = lllllllllllllIIlIllllIlIIlIIlllI.length;
            ++lllllllllllllIIlIllllIlIIlIIlIlI;
        }
        int lllllllllllllIIlIllllIlIIlIlIlII = lllllllllllllIIlIllllIlIIlIIlIlI;
        while (llIlIlIlIlIlIll(lllllllllllllIIlIllllIlIIlIlIlII, lllllllllllllIIlIllllIlIIlIlIIII)) {
            final Component lllllllllllllIIlIllllIlIIlIllIII = this.components.get(lllllllllllllIIlIllllIlIIlIlIlII - CompositeByteBuf.lIIllIIIIIlllI[2]);
            final Component lllllllllllllIIlIllllIlIIlIlIllI = this.components.get(lllllllllllllIIlIllllIlIIlIlIlII);
            lllllllllllllIIlIllllIlIIlIlIllI.offset = lllllllllllllIIlIllllIlIIlIllIII.endOffset;
            lllllllllllllIIlIllllIlIIlIlIllI.endOffset = lllllllllllllIIlIllllIlIIlIlIllI.offset + lllllllllllllIIlIllllIlIIlIlIllI.length;
            ++lllllllllllllIIlIllllIlIIlIlIlII;
            "".length();
            if ("   ".length() <= 0) {
                return;
            }
        }
    }
    
    private static boolean llIlIlIlIlIllIl(final int lllllllllllllIIlIllIlllIlIIIIlIl, final int lllllllllllllIIlIllIlllIlIIIIlII) {
        return lllllllllllllIIlIllIlllIlIIIIlIl == lllllllllllllIIlIllIlllIlIIIIlII;
    }
    
    @Override
    public CompositeByteBuf readBytes(final ByteBuffer lllllllllllllIIlIlllIIlIlllIIllI) {
        return (CompositeByteBuf)super.readBytes(lllllllllllllIIlIlllIIlIlllIIllI);
    }
    
    @Override
    public CompositeByteBuf setDouble(final int lllllllllllllIIlIlllIIllIlllIlII, final double lllllllllllllIIlIlllIIllIlllIIll) {
        return (CompositeByteBuf)super.setDouble(lllllllllllllIIlIlllIIllIlllIlII, lllllllllllllIIlIlllIIllIlllIIll);
    }
    
    @Override
    public CompositeByteBuf getBytes(final int lllllllllllllIIlIlllIIllllIIIIIl, final ByteBuf lllllllllllllIIlIlllIIllllIIIllI, final int lllllllllllllIIlIlllIIlllIlllllI) {
        return (CompositeByteBuf)super.getBytes(lllllllllllllIIlIlllIIllllIIIIIl, lllllllllllllIIlIlllIIllllIIIllI, lllllllllllllIIlIlllIIlllIlllllI);
    }
    
    @Override
    public CompositeByteBuf writeBytes(final byte[] lllllllllllllIIlIlllIIlIIIllllII) {
        return (CompositeByteBuf)super.writeBytes(lllllllllllllIIlIlllIIlIIIllllII);
    }
    
    @Override
    public ByteBuffer internalNioBuffer(final int lllllllllllllIIlIlllIlIlIlIlIIlI, final int lllllllllllllIIlIlllIlIlIlIlIIII) {
        if (llIlIlIlIlIllIl(this.components.size(), CompositeByteBuf.lIIllIIIIIlllI[2])) {
            return this.components.get(CompositeByteBuf.lIIllIIIIIlllI[1]).buf.internalNioBuffer(lllllllllllllIIlIlllIlIlIlIlIIlI, lllllllllllllIIlIlllIlIlIlIlIIII);
        }
        throw new UnsupportedOperationException();
    }
    
    @Override
    public CompositeByteBuf writeBoolean(final boolean lllllllllllllIIlIlllIIlIllIIlIIl) {
        return (CompositeByteBuf)super.writeBoolean(lllllllllllllIIlIlllIIlIllIIlIIl);
    }
    
    @Override
    public int capacity() {
        if (llIlIlIlIlIllll(this.components.isEmpty() ? 1 : 0)) {
            return CompositeByteBuf.lIIllIIIIIlllI[1];
        }
        return this.components.get(this.components.size() - CompositeByteBuf.lIIllIIIIIlllI[2]).endOffset;
    }
    
    @Override
    public boolean isDirect() {
        final int lllllllllllllIIlIllllIIlllIIIlII = this.components.size();
        if (llIlIlIlIlIllII(lllllllllllllIIlIllllIIlllIIIlII)) {
            return CompositeByteBuf.lIIllIIIIIlllI[1] != 0;
        }
        int lllllllllllllIIlIllllIIlllIIIllI = CompositeByteBuf.lIIllIIIIIlllI[1];
        while (llIlIlIlIlIlIll(lllllllllllllIIlIllllIIlllIIIllI, lllllllllllllIIlIllllIIlllIIIlII)) {
            if (llIlIlIlIlIllII(this.components.get(lllllllllllllIIlIllllIIlllIIIllI).buf.isDirect() ? 1 : 0)) {
                return CompositeByteBuf.lIIllIIIIIlllI[1] != 0;
            }
            ++lllllllllllllIIlIllllIIlllIIIllI;
            "".length();
            if ((" ".length() & ~" ".length()) != 0x0) {
                return ((0x73 ^ 0x76) & ~(0xBE ^ 0xBB)) != 0x0;
            }
        }
        return CompositeByteBuf.lIIllIIIIIlllI[2] != 0;
    }
    
    @Override
    public CompositeByteBuf setChar(final int lllllllllllllIIlIlllIIlllIIlIlII, final int lllllllllllllIIlIlllIIlllIIlIIlI) {
        return (CompositeByteBuf)super.setChar(lllllllllllllIIlIlllIIlllIIlIlII, lllllllllllllIIlIlllIIlllIIlIIlI);
    }
    
    public CompositeByteBuf(final ByteBufAllocator lllllllllllllIIlIllllIllIlIIlIIl, final boolean lllllllllllllIIlIllllIllIlIIIlII, final int lllllllllllllIIlIllllIllIlIIIIll) {
        super(CompositeByteBuf.lIIllIIIIIlllI[0]);
        this.components = new ArrayList<Component>();
        if (llIlIlIlIlIlIlI(lllllllllllllIIlIllllIllIlIIlIIl)) {
            throw new NullPointerException(CompositeByteBuf.lIIllIIIIIlIIl[CompositeByteBuf.lIIllIIIIIlllI[1]]);
        }
        this.alloc = lllllllllllllIIlIllllIllIlIIlIIl;
        this.direct = lllllllllllllIIlIllllIllIlIIIlII;
        this.maxNumComponents = lllllllllllllIIlIllllIllIlIIIIll;
        this.leak = CompositeByteBuf.leakDetector.open(this);
    }
    
    @Override
    public int getBytes(final int lllllllllllllIIlIllllIIIIIllIlII, final GatheringByteChannel lllllllllllllIIlIllllIIIIIllIIll, final int lllllllllllllIIlIllllIIIIIllIIlI) throws IOException {
        final int lllllllllllllIIlIllllIIIIIllIIII = this.nioBufferCount();
        if (llIlIlIlIlIllIl(lllllllllllllIIlIllllIIIIIllIIII, CompositeByteBuf.lIIllIIIIIlllI[2])) {
            return lllllllllllllIIlIllllIIIIIllIIll.write(this.internalNioBuffer(lllllllllllllIIlIllllIIIIIllIlII, lllllllllllllIIlIllllIIIIIllIIlI));
        }
        final long lllllllllllllIIlIllllIIIIIllIlll = lllllllllllllIIlIllllIIIIIllIIll.write(this.nioBuffers(lllllllllllllIIlIllllIIIIIllIlII, lllllllllllllIIlIllllIIIIIllIIlI));
        if (llIlIlIllIIIIll(llIlIlIllIIIlIl(lllllllllllllIIlIllllIIIIIllIlll, 2147483647L))) {
            return CompositeByteBuf.lIIllIIIIIlllI[0];
        }
        return (int)lllllllllllllIIlIllllIIIIIllIlll;
    }
    
    private static boolean llIlIlIlIlllIII(final int lllllllllllllIIlIllIlllIIllIIIlI) {
        return lllllllllllllIIlIllIlllIIllIIIlI <= 0;
    }
    
    private static boolean llIlIlIlIlIlIll(final int lllllllllllllIIlIllIlllIIlllllIl, final int lllllllllllllIIlIllIlllIIlllllII) {
        return lllllllllllllIIlIllIlllIIlllllIl < lllllllllllllIIlIllIlllIIlllllII;
    }
    
    public ByteBuf internalComponent(final int lllllllllllllIIlIlllIlIllIlIIIIl) {
        this.checkComponentIndex(lllllllllllllIIlIlllIlIllIlIIIIl);
        return this.components.get(lllllllllllllIIlIlllIlIllIlIIIIl).buf;
    }
    
    public List<ByteBuf> decompose(final int lllllllllllllIIlIllllIIlllIlllIl, final int lllllllllllllIIlIllllIIlllIlllII) {
        this.checkIndex(lllllllllllllIIlIllllIIlllIlllIl, lllllllllllllIIlIllllIIlllIlllII);
        if (llIlIlIlIlIllII(lllllllllllllIIlIllllIIlllIlllII)) {
            return Collections.emptyList();
        }
        int lllllllllllllIIlIllllIIllllIlIlI = this.toComponentIndex(lllllllllllllIIlIllllIIlllIlllIl);
        final List<ByteBuf> lllllllllllllIIlIllllIIllllIlIII = new ArrayList<ByteBuf>(this.components.size());
        final Component lllllllllllllIIlIllllIIllllIIllI = this.components.get(lllllllllllllIIlIllllIIllllIlIlI);
        final ByteBuf lllllllllllllIIlIllllIIllllIIlII = lllllllllllllIIlIllllIIllllIIllI.buf.duplicate();
        lllllllllllllIIlIllllIIllllIIlII.readerIndex(lllllllllllllIIlIllllIIlllIlllIl - lllllllllllllIIlIllllIIllllIIllI.offset);
        "".length();
        ByteBuf lllllllllllllIIlIllllIIllllIIIlI = lllllllllllllIIlIllllIIllllIIlII;
        int lllllllllllllIIlIllllIIllllIIIII = lllllllllllllIIlIllllIIlllIlllII;
        do {
            final int lllllllllllllIIlIllllIIlllllIIlI = lllllllllllllIIlIllllIIllllIIIlI.readableBytes();
            if (llIlIlIlIllIlIl(lllllllllllllIIlIllllIIllllIIIII, lllllllllllllIIlIllllIIlllllIIlI)) {
                lllllllllllllIIlIllllIIllllIIIlI.writerIndex(lllllllllllllIIlIllllIIllllIIIlI.readerIndex() + lllllllllllllIIlIllllIIllllIIIII);
                "".length();
                lllllllllllllIIlIllllIIllllIlIII.add(lllllllllllllIIlIllllIIllllIIIlI);
                "".length();
                "".length();
                if (null != null) {
                    return null;
                }
                break;
            }
            else {
                lllllllllllllIIlIllllIIllllIlIII.add(lllllllllllllIIlIllllIIllllIIIlI);
                "".length();
                lllllllllllllIIlIllllIIllllIIIII -= lllllllllllllIIlIllllIIlllllIIlI;
                ++lllllllllllllIIlIllllIIllllIlIlI;
                lllllllllllllIIlIllllIIllllIIIlI = this.components.get(lllllllllllllIIlIllllIIllllIlIlI).buf.duplicate();
            }
        } while (!llIlIlIlIlllIII(lllllllllllllIIlIllllIIllllIIIII));
        int lllllllllllllIIlIllllIIlllllIIIl = CompositeByteBuf.lIIllIIIIIlllI[1];
        while (llIlIlIlIlIlIll(lllllllllllllIIlIllllIIlllllIIIl, lllllllllllllIIlIllllIIllllIlIII.size())) {
            lllllllllllllIIlIllllIIllllIlIII.set(lllllllllllllIIlIllllIIlllllIIIl, lllllllllllllIIlIllllIIllllIlIII.get(lllllllllllllIIlIllllIIlllllIIIl).slice());
            "".length();
            ++lllllllllllllIIlIllllIIlllllIIIl;
            "".length();
            if ((0xC ^ 0x8) != (0xC7 ^ 0xC3)) {
                return null;
            }
        }
        return lllllllllllllIIlIllllIIllllIlIII;
    }
    
    @Override
    public CompositeByteBuf writeInt(final int lllllllllllllIIlIlllIIlIlIIllIll) {
        return (CompositeByteBuf)super.writeInt(lllllllllllllIIlIlllIIlIlIIllIll);
    }
    
    public CompositeByteBuf consolidate(final int lllllllllllllIIlIlllIlIIlIlIIIII, final int lllllllllllllIIlIlllIlIIlIIlIlIl) {
        this.checkComponentIndex(lllllllllllllIIlIlllIlIIlIlIIIII, lllllllllllllIIlIlllIlIIlIIlIlIl);
        if (llIlIlIlIllIlIl(lllllllllllllIIlIlllIlIIlIIlIlIl, CompositeByteBuf.lIIllIIIIIlllI[2])) {
            return this;
        }
        final int lllllllllllllIIlIlllIlIIlIIlllII = lllllllllllllIIlIlllIlIIlIlIIIII + lllllllllllllIIlIlllIlIIlIIlIlIl;
        final Component lllllllllllllIIlIlllIlIIlIIllIll = this.components.get(lllllllllllllIIlIlllIlIIlIIlllII - CompositeByteBuf.lIIllIIIIIlllI[2]);
        final int lllllllllllllIIlIlllIlIIlIIllIlI = lllllllllllllIIlIlllIlIIlIIllIll.endOffset - this.components.get(lllllllllllllIIlIlllIlIIlIlIIIII).offset;
        final ByteBuf lllllllllllllIIlIlllIlIIlIIllIIl = this.allocBuffer(lllllllllllllIIlIlllIlIIlIIllIlI);
        int lllllllllllllIIlIlllIlIIlIlIIIll = lllllllllllllIIlIlllIlIIlIlIIIII;
        while (llIlIlIlIlIlIll(lllllllllllllIIlIlllIlIIlIlIIIll, lllllllllllllIIlIlllIlIIlIIlllII)) {
            final Component lllllllllllllIIlIlllIlIIlIlIIlll = this.components.get(lllllllllllllIIlIlllIlIIlIlIIIll);
            final ByteBuf lllllllllllllIIlIlllIlIIlIlIIlIl = lllllllllllllIIlIlllIlIIlIlIIlll.buf;
            lllllllllllllIIlIlllIlIIlIIllIIl.writeBytes(lllllllllllllIIlIlllIlIIlIlIIlIl);
            "".length();
            lllllllllllllIIlIlllIlIIlIlIIlll.freeIfNecessary();
            ++lllllllllllllIIlIlllIlIIlIlIIIll;
            "".length();
            if (" ".length() < -" ".length()) {
                return null;
            }
        }
        this.components.subList(lllllllllllllIIlIlllIlIIlIlIIIII + CompositeByteBuf.lIIllIIIIIlllI[2], lllllllllllllIIlIlllIlIIlIIlllII).clear();
        this.components.set(lllllllllllllIIlIlllIlIIlIlIIIII, new Component(lllllllllllllIIlIlllIlIIlIIllIIl));
        "".length();
        this.updateComponentOffsets(lllllllllllllIIlIlllIlIIlIlIIIII);
        return this;
    }
    
    private static boolean llIlIlIlIlIllll(final int lllllllllllllIIlIllIlllIIllIlIlI) {
        return lllllllllllllIIlIllIlllIIllIlIlI != 0;
    }
    
    @Override
    public CompositeByteBuf getBytes(int lllllllllllllIIlIllllIIIlIIIlIll, final ByteBuffer lllllllllllllIIlIllllIIIlIIIlIIl) {
        final int lllllllllllllIIlIllllIIIlIIlIIll = lllllllllllllIIlIllllIIIlIIIlIIl.limit();
        int lllllllllllllIIlIllllIIIlIIlIIIl = lllllllllllllIIlIllllIIIlIIIlIIl.remaining();
        this.checkIndex((int)lllllllllllllIIlIllllIIIlIIIlIll, lllllllllllllIIlIllllIIIlIIlIIIl);
        if (llIlIlIlIlIllII(lllllllllllllIIlIllllIIIlIIlIIIl)) {
            return this;
        }
        int lllllllllllllIIlIllllIIIlIIIllll = this.toComponentIndex((int)lllllllllllllIIlIllllIIIlIIIlIll);
        try {
            while (llIlIlIllIIIIll(lllllllllllllIIlIllllIIIlIIlIIIl)) {
                final Component lllllllllllllIIlIllllIIIlIlIIIlI = this.components.get(lllllllllllllIIlIllllIIIlIIIllll);
                final ByteBuf lllllllllllllIIlIllllIIIlIlIIIII = lllllllllllllIIlIllllIIIlIlIIIlI.buf;
                final int lllllllllllllIIlIllllIIIlIIlllIl = lllllllllllllIIlIllllIIIlIlIIIlI.offset;
                final int lllllllllllllIIlIllllIIIlIIllIll = Math.min(lllllllllllllIIlIllllIIIlIIlIIIl, (int)(lllllllllllllIIlIllllIIIlIlIIIII.capacity() - (lllllllllllllIIlIllllIIIlIIIlIll - lllllllllllllIIlIllllIIIlIIlllIl)));
                lllllllllllllIIlIllllIIIlIIIlIIl.limit(lllllllllllllIIlIllllIIIlIIIlIIl.position() + lllllllllllllIIlIllllIIIlIIllIll);
                "".length();
                lllllllllllllIIlIllllIIIlIlIIIII.getBytes((int)(lllllllllllllIIlIllllIIIlIIIlIll - lllllllllllllIIlIllllIIIlIIlllIl), lllllllllllllIIlIllllIIIlIIIlIIl);
                "".length();
                lllllllllllllIIlIllllIIIlIIIlIll += lllllllllllllIIlIllllIIIlIIllIll;
                lllllllllllllIIlIllllIIIlIIlIIIl -= lllllllllllllIIlIllllIIIlIIllIll;
                ++lllllllllllllIIlIllllIIIlIIIllll;
                "".length();
                if (((0x27 ^ 0x50 ^ (0xC5 ^ 0x95)) & (0x71 ^ 0x21 ^ (0xCC ^ 0xBB) ^ -" ".length())) != 0x0) {
                    return null;
                }
            }
            lllllllllllllIIlIllllIIIlIIIlIIl.limit(lllllllllllllIIlIllllIIIlIIlIIll);
            "".length();
            "".length();
            if ("  ".length() == 0) {
                return null;
            }
        }
        finally {
            lllllllllllllIIlIllllIIIlIIIlIIl.limit(lllllllllllllIIlIllllIIIlIIlIIll);
            "".length();
        }
        return this;
    }
    
    public ByteBuf componentAtOffset(final int lllllllllllllIIlIlllIlIllIlIlIII) {
        return this.internalComponentAtOffset(lllllllllllllIIlIlllIlIllIlIlIII).duplicate();
    }
    
    private static boolean llIlIlIlIllIIll(final int lllllllllllllIIlIllIlllIIllIIllI) {
        return lllllllllllllIIlIllIlllIIllIIllI >= 0;
    }
    
    @Override
    public ByteBuffer[] nioBuffers() {
        return this.nioBuffers(this.readerIndex(), this.readableBytes());
    }
    
    private static void llIlIlIlIlIlIIl() {
        (lIIllIIIIIlllI = new int[23])[0] = (-1 & Integer.MAX_VALUE);
        CompositeByteBuf.lIIllIIIIIlllI[1] = ((0x25 ^ 0x21) & ~(0x38 ^ 0x3C));
        CompositeByteBuf.lIIllIIIIIlllI[2] = " ".length();
        CompositeByteBuf.lIIllIIIIIlllI[3] = "  ".length();
        CompositeByteBuf.lIIllIIIIIlllI[4] = "   ".length();
        CompositeByteBuf.lIIllIIIIIlllI[5] = (0x66 ^ 0x62);
        CompositeByteBuf.lIIllIIIIIlllI[6] = (0x55 ^ 0x50);
        CompositeByteBuf.lIIllIIIIIlllI[7] = (0xB6 ^ 0xB0);
        CompositeByteBuf.lIIllIIIIIlllI[8] = (0x32 ^ 0x6F ^ (0x41 ^ 0x1B));
        CompositeByteBuf.lIIllIIIIIlllI[9] = (0x98 ^ 0x90);
        CompositeByteBuf.lIIllIIIIIlllI[10] = (0x6 ^ 0x6F ^ (0x4C ^ 0x2C));
        CompositeByteBuf.lIIllIIIIIlllI[11] = (0x1B ^ 0x11);
        CompositeByteBuf.lIIllIIIIIlllI[12] = (0x97 ^ 0x9C);
        CompositeByteBuf.lIIllIIIIIlllI[13] = (0xA3 ^ 0xAF);
        CompositeByteBuf.lIIllIIIIIlllI[14] = (95 + 25 - 76 + 117 ^ 117 + 28 - 95 + 122);
        CompositeByteBuf.lIIllIIIIIlllI[15] = (0x50 ^ 0x5B) + (11 + 71 - 5 + 90) - (0xF6 ^ 0xA5) + (3 + 114 - 33 + 76);
        CompositeByteBuf.lIIllIIIIIlllI[16] = (-" ".length() & (-1 & 0xFFFF));
        CompositeByteBuf.lIIllIIIIIlllI[17] = (0x6E ^ 0x7E);
        CompositeByteBuf.lIIllIIIIIlllI[18] = (11 + 40 + 42 + 47 ^ 61 + 133 - 40 + 18);
        CompositeByteBuf.lIIllIIIIIlllI[19] = -" ".length();
        CompositeByteBuf.lIIllIIIIIlllI[20] = (0x14 ^ 0x1A);
        CompositeByteBuf.lIIllIIIIIlllI[21] = (0xF0 ^ 0xA1 ^ (0x6E ^ 0x30));
        CompositeByteBuf.lIIllIIIIIlllI[22] = (0x1 ^ 0x28);
    }
    
    private int addComponents0(final int lllllllllllllIIlIllllIlIlIlIllll, Iterable<ByteBuf> lllllllllllllIIlIllllIlIlIlIlllI) {
        if (llIlIlIlIlIlIlI(lllllllllllllIIlIllllIlIlIlIlllI)) {
            throw new NullPointerException(CompositeByteBuf.lIIllIIIIIlIIl[CompositeByteBuf.lIIllIIIIIlllI[10]]);
        }
        if (llIlIlIlIlIllll((lllllllllllllIIlIllllIlIlIlIlllI instanceof ByteBuf) ? 1 : 0)) {
            return this.addComponent0(lllllllllllllIIlIllllIlIlIlIllll, (ByteBuf)lllllllllllllIIlIllllIlIlIlIlllI);
        }
        if (llIlIlIlIlIllII((lllllllllllllIIlIllllIlIlIlIlllI instanceof Collection) ? 1 : 0)) {
            final List<ByteBuf> lllllllllllllIIlIllllIlIlIlllIlI = new ArrayList<ByteBuf>();
            final Iterator lllllllllllllIIlIllllIlIlIllllII = lllllllllllllIIlIllllIlIlIlIlllI.iterator();
            while (llIlIlIlIlIllll(lllllllllllllIIlIllllIlIlIllllII.hasNext() ? 1 : 0)) {
                final ByteBuf lllllllllllllIIlIllllIlIlIllllIl = lllllllllllllIIlIllllIlIlIllllII.next();
                lllllllllllllIIlIllllIlIlIlllIlI.add(lllllllllllllIIlIllllIlIlIllllIl);
                "".length();
                "".length();
                if (null != null) {
                    return (0xC4 ^ 0x87 ^ (0x2E ^ 0x34)) & (0xA1 ^ 0x97 ^ (0x58 ^ 0x37) ^ -" ".length());
                }
            }
            lllllllllllllIIlIllllIlIlIlIlllI = lllllllllllllIIlIllllIlIlIlllIlI;
        }
        final Collection<ByteBuf> lllllllllllllIIlIllllIlIlIllIIll = (Collection<ByteBuf>)(Collection)lllllllllllllIIlIllllIlIlIlIlllI;
        return this.addComponents0(lllllllllllllIIlIllllIlIlIlIllll, (ByteBuf[])lllllllllllllIIlIllllIlIlIllIIll.toArray(new ByteBuf[lllllllllllllIIlIllllIlIlIllIIll.size()]));
    }
    
    @Override
    public CompositeByteBuf skipBytes(final int lllllllllllllIIlIlllIIlIllIlIlII) {
        return (CompositeByteBuf)super.skipBytes(lllllllllllllIIlIlllIIlIllIlIlII);
    }
    
    private static boolean llIlIlIlIlllIll(final int lllllllllllllIIlIllIlllIlIIIIIIl, final int lllllllllllllIIlIllIlllIlIIIIIII) {
        return lllllllllllllIIlIllIlllIlIIIIIIl >= lllllllllllllIIlIllIlllIlIIIIIII;
    }
    
    @Override
    public CompositeByteBuf readBytes(final ByteBuf lllllllllllllIIlIlllIIllIIllIlII) {
        return (CompositeByteBuf)super.readBytes(lllllllllllllIIlIlllIIllIIllIlII);
    }
    
    @Override
    public CompositeByteBuf setLong(final int lllllllllllllIIlIlllIlllIlIlllII, final long lllllllllllllIIlIlllIlllIlIllIII) {
        return (CompositeByteBuf)super.setLong(lllllllllllllIIlIlllIlllIlIlllII, lllllllllllllIIlIlllIlllIlIllIII);
    }
    
    @Override
    public CompositeByteBuf setBytes(final int lllllllllllllIIlIlllIIllIlIllIlI, final ByteBuf lllllllllllllIIlIlllIIllIllIIIII, final int lllllllllllllIIlIlllIIllIlIlIllI) {
        return (CompositeByteBuf)super.setBytes(lllllllllllllIIlIlllIIllIlIllIlI, lllllllllllllIIlIlllIIllIllIIIII, lllllllllllllIIlIlllIIllIlIlIllI);
    }
    
    public CompositeByteBuf(final ByteBufAllocator lllllllllllllIIlIllllIllIIlIlIII, final boolean lllllllllllllIIlIllllIllIIlIIlll, final int lllllllllllllIIlIllllIllIIlIlIll, final Iterable<ByteBuf> lllllllllllllIIlIllllIllIIlIlIlI) {
        super(CompositeByteBuf.lIIllIIIIIlllI[0]);
        this.components = new ArrayList<Component>();
        if (llIlIlIlIlIlIlI(lllllllllllllIIlIllllIllIIlIlIII)) {
            throw new NullPointerException(CompositeByteBuf.lIIllIIIIIlIIl[CompositeByteBuf.lIIllIIIIIlllI[5]]);
        }
        if (llIlIlIlIlIlIll(lllllllllllllIIlIllllIllIIlIlIll, CompositeByteBuf.lIIllIIIIIlllI[3])) {
            throw new IllegalArgumentException(String.valueOf(new StringBuilder().append(CompositeByteBuf.lIIllIIIIIlIIl[CompositeByteBuf.lIIllIIIIIlllI[6]]).append(lllllllllllllIIlIllllIllIIlIlIll).append(CompositeByteBuf.lIIllIIIIIlIIl[CompositeByteBuf.lIIllIIIIIlllI[7]])));
        }
        this.alloc = lllllllllllllIIlIllllIllIIlIlIII;
        this.direct = lllllllllllllIIlIllllIllIIlIIlll;
        this.maxNumComponents = lllllllllllllIIlIllllIllIIlIlIll;
        this.addComponents0(CompositeByteBuf.lIIllIIIIIlllI[1], lllllllllllllIIlIllllIllIIlIlIlI);
        "".length();
        this.consolidateIfNeeded();
        this.setIndex(CompositeByteBuf.lIIllIIIIIlllI[1], this.capacity());
        "".length();
        this.leak = CompositeByteBuf.leakDetector.open(this);
    }
    
    @Override
    public byte[] array() {
        if (llIlIlIlIlIllIl(this.components.size(), CompositeByteBuf.lIIllIIIIIlllI[2])) {
            return this.components.get(CompositeByteBuf.lIIllIIIIIlllI[1]).buf.array();
        }
        throw new UnsupportedOperationException();
    }
    
    @Override
    public CompositeByteBuf writeDouble(final double lllllllllllllIIlIlllIIlIIlllIllI) {
        return (CompositeByteBuf)super.writeDouble(lllllllllllllIIlIlllIIlIIlllIllI);
    }
    
    public CompositeByteBuf addComponents(final int lllllllllllllIIlIllllIlIllllIIII, final ByteBuf... lllllllllllllIIlIllllIlIllllIIlI) {
        this.addComponents0(lllllllllllllIIlIllllIlIllllIIII, lllllllllllllIIlIllllIlIllllIIlI);
        "".length();
        this.consolidateIfNeeded();
        return this;
    }
    
    private Component findComponent(final int lllllllllllllIIlIlllIlIlIlllllll) {
        this.checkIndex(lllllllllllllIIlIlllIlIlIlllllll);
        int lllllllllllllIIlIlllIlIllIIIIlIl = CompositeByteBuf.lIIllIIIIIlllI[1];
        int lllllllllllllIIlIlllIlIllIIIIlII = this.components.size();
        while (llIlIlIlIllIlIl(lllllllllllllIIlIlllIlIllIIIIlIl, lllllllllllllIIlIlllIlIllIIIIlII)) {
            final int lllllllllllllIIlIlllIlIllIIIlIII = lllllllllllllIIlIlllIlIllIIIIlIl + lllllllllllllIIlIlllIlIllIIIIlII >>> CompositeByteBuf.lIIllIIIIIlllI[2];
            final Component lllllllllllllIIlIlllIlIllIIIIllI = this.components.get(lllllllllllllIIlIlllIlIllIIIlIII);
            if (llIlIlIlIlllIll(lllllllllllllIIlIlllIlIlIlllllll, lllllllllllllIIlIlllIlIllIIIIllI.endOffset)) {
                lllllllllllllIIlIlllIlIllIIIIlIl = lllllllllllllIIlIlllIlIllIIIlIII + CompositeByteBuf.lIIllIIIIIlllI[2];
                "".length();
                if (null != null) {
                    return null;
                }
            }
            else {
                if (!llIlIlIlIlIlIll(lllllllllllllIIlIlllIlIlIlllllll, lllllllllllllIIlIlllIlIllIIIIllI.offset)) {
                    return lllllllllllllIIlIlllIlIllIIIIllI;
                }
                lllllllllllllIIlIlllIlIllIIIIlII = lllllllllllllIIlIlllIlIllIIIlIII - CompositeByteBuf.lIIllIIIIIlllI[2];
                "".length();
                if ("   ".length() == 0) {
                    return null;
                }
            }
            "".length();
            if ("  ".length() <= " ".length()) {
                return null;
            }
        }
        throw new Error(CompositeByteBuf.lIIllIIIIIlIIl[CompositeByteBuf.lIIllIIIIIlllI[20]]);
    }
    
    public CompositeByteBuf addComponents(final int lllllllllllllIIlIllllIlIllIIlIII, final Iterable<ByteBuf> lllllllllllllIIlIllllIlIllIIlIlI) {
        this.addComponents0(lllllllllllllIIlIllllIlIllIIlIII, lllllllllllllIIlIllllIlIllIIlIlI);
        "".length();
        this.consolidateIfNeeded();
        return this;
    }
    
    private static boolean llIlIlIlIllIIIl(final int lllllllllllllIIlIllIlllIIlllIlIl, final int lllllllllllllIIlIllIlllIIlllIlII) {
        return lllllllllllllIIlIllIlllIIlllIlIl > lllllllllllllIIlIllIlllIIlllIlII;
    }
    
    @Override
    public CompositeByteBuf setByte(final int lllllllllllllIIlIlllIllllllIIlII, final int lllllllllllllIIlIlllIllllllIlIlI) {
        final Component lllllllllllllIIlIlllIllllllIlIII = this.findComponent(lllllllllllllIIlIlllIllllllIIlII);
        lllllllllllllIIlIlllIllllllIlIII.buf.setByte(lllllllllllllIIlIlllIllllllIIlII - lllllllllllllIIlIlllIllllllIlIII.offset, lllllllllllllIIlIlllIllllllIlIlI);
        "".length();
        return this;
    }
    
    @Override
    public int arrayOffset() {
        if (llIlIlIlIlIllIl(this.components.size(), CompositeByteBuf.lIIllIIIIIlllI[2])) {
            return this.components.get(CompositeByteBuf.lIIllIIIIIlllI[1]).buf.arrayOffset();
        }
        throw new UnsupportedOperationException();
    }
    
    @Override
    public CompositeByteBuf setInt(final int lllllllllllllIIlIlllIlllIlllllIl, final int lllllllllllllIIlIlllIlllIllllIIl) {
        return (CompositeByteBuf)super.setInt(lllllllllllllIIlIlllIlllIlllllIl, lllllllllllllIIlIlllIlllIllllIIl);
    }
    
    @Override
    public CompositeByteBuf writeChar(final int lllllllllllllIIlIlllIIlIlIIIlIIl) {
        return (CompositeByteBuf)super.writeChar(lllllllllllllIIlIlllIIlIlIIIlIIl);
    }
    
    public CompositeByteBuf addComponents(final Iterable<ByteBuf> lllllllllllllIIlIllllIllIIIlIIll) {
        this.addComponents0(this.components.size(), lllllllllllllIIlIllllIllIIIlIIll);
        "".length();
        this.consolidateIfNeeded();
        return this;
    }
    
    @Override
    public ByteBuf unwrap() {
        return null;
    }
    
    @Override
    public ByteBufAllocator alloc() {
        return this.alloc;
    }
    
    private int addComponents0(int lllllllllllllIIlIllllIlIllIlIlll, final ByteBuf... lllllllllllllIIlIllllIlIllIllIlI) {
        this.checkComponentIndex(lllllllllllllIIlIllllIlIllIlIlll);
        if (llIlIlIlIlIlIlI(lllllllllllllIIlIllllIlIllIllIlI)) {
            throw new NullPointerException(CompositeByteBuf.lIIllIIIIIlIIl[CompositeByteBuf.lIIllIIIIIlllI[9]]);
        }
        int lllllllllllllIIlIllllIlIllIllIIl = CompositeByteBuf.lIIllIIIIIlllI[1];
        final ByteBuf[] lllllllllllllIIlIllllIlIlllIIlII = lllllllllllllIIlIllllIlIllIllIlI;
        final int lllllllllllllIIlIllllIlIlllIIIll = lllllllllllllIIlIllllIlIlllIIlII.length;
        int lllllllllllllIIlIllllIlIlllIIIlI = CompositeByteBuf.lIIllIIIIIlllI[1];
        while (llIlIlIlIlIlIll(lllllllllllllIIlIllllIlIlllIIIlI, lllllllllllllIIlIllllIlIlllIIIll)) {
            final ByteBuf lllllllllllllIIlIllllIlIlllIIlIl = lllllllllllllIIlIllllIlIlllIIlII[lllllllllllllIIlIllllIlIlllIIIlI];
            if (llIlIlIlIlIlIlI(lllllllllllllIIlIllllIlIlllIIlIl)) {
                "".length();
                if (((0xCF ^ 0xB6 ^ (0x2C ^ 0xB)) & (((0x3C ^ 0x61) & ~(0x41 ^ 0x1C)) ^ (0x17 ^ 0x49) ^ -" ".length())) < 0) {
                    return (0x2 ^ 0x67 ^ (0x76 ^ 0x72)) & (0x64 ^ 0x4 ^ " ".length() ^ -" ".length());
                }
                break;
            }
            else {
                lllllllllllllIIlIllllIlIllIllIIl += lllllllllllllIIlIllllIlIlllIIlIl.readableBytes();
                ++lllllllllllllIIlIllllIlIlllIIIlI;
                "".length();
                if (((0xDF ^ 0x9E) & ~(0x40 ^ 0x1)) >= " ".length()) {
                    return (0x8B ^ 0xC5) & ~(0x54 ^ 0x1A);
                }
                continue;
            }
        }
        if (llIlIlIlIlIllII(lllllllllllllIIlIllllIlIllIllIIl)) {
            return lllllllllllllIIlIllllIlIllIlIlll;
        }
        final ByteBuf[] lllllllllllllIIlIllllIlIllIlllll = lllllllllllllIIlIllllIlIllIllIlI;
        final int lllllllllllllIIlIllllIlIllIllllI = lllllllllllllIIlIllllIlIllIlllll.length;
        int lllllllllllllIIlIllllIlIllIlllIl = CompositeByteBuf.lIIllIIIIIlllI[1];
        while (llIlIlIlIlIlIll(lllllllllllllIIlIllllIlIllIlllIl, lllllllllllllIIlIllllIlIllIllllI)) {
            final ByteBuf lllllllllllllIIlIllllIlIlllIIIII = lllllllllllllIIlIllllIlIllIlllll[lllllllllllllIIlIllllIlIllIlllIl];
            if (llIlIlIlIlIlIlI(lllllllllllllIIlIllllIlIlllIIIII)) {
                "".length();
                if ("  ".length() <= 0) {
                    return (0x8A ^ 0xC3) & ~(0xA ^ 0x43);
                }
                break;
            }
            else {
                if (llIlIlIlIlIllll(lllllllllllllIIlIllllIlIlllIIIII.isReadable() ? 1 : 0)) {
                    lllllllllllllIIlIllllIlIllIlIlll = this.addComponent0(lllllllllllllIIlIllllIlIllIlIlll, lllllllllllllIIlIllllIlIlllIIIII) + CompositeByteBuf.lIIllIIIIIlllI[2];
                    final int lllllllllllllIIlIllllIlIlllIIIIl = this.components.size();
                    if (llIlIlIlIllIIIl(lllllllllllllIIlIllllIlIllIlIlll, lllllllllllllIIlIllllIlIlllIIIIl)) {
                        lllllllllllllIIlIllllIlIllIlIlll = lllllllllllllIIlIllllIlIlllIIIIl;
                    }
                    "".length();
                    if (-" ".length() == " ".length()) {
                        return (105 + 88 - 140 + 80 ^ 11 + 102 - 4 + 47) & (0x5F ^ 0x31 ^ (0xB4 ^ 0xC3) ^ -" ".length());
                    }
                }
                else {
                    lllllllllllllIIlIllllIlIlllIIIII.release();
                    "".length();
                }
                ++lllllllllllllIIlIllllIlIllIlllIl;
                "".length();
                if ("   ".length() < 0) {
                    return (0x91 ^ 0xB4 ^ (0x6F ^ 0x7C)) & (0x92 ^ 0xBC ^ (0x60 ^ 0x78) ^ -" ".length());
                }
                continue;
            }
        }
        return lllllllllllllIIlIllllIlIllIlIlll;
    }
    
    @Override
    public CompositeByteBuf readBytes(final OutputStream lllllllllllllIIlIlllIIlIllIllIIl, final int lllllllllllllIIlIlllIIlIllIllIII) throws IOException {
        return (CompositeByteBuf)super.readBytes(lllllllllllllIIlIlllIIlIllIllIIl, lllllllllllllIIlIlllIIlIllIllIII);
    }
    
    @Override
    public boolean hasArray() {
        if (llIlIlIlIlIllIl(this.components.size(), CompositeByteBuf.lIIllIIIIIlllI[2])) {
            return this.components.get(CompositeByteBuf.lIIllIIIIIlllI[1]).buf.hasArray();
        }
        return CompositeByteBuf.lIIllIIIIIlllI[1] != 0;
    }
    
    public CompositeByteBuf(final ByteBufAllocator lllllllllllllIIlIllllIllIIllIlll, final boolean lllllllllllllIIlIllllIllIIlllIll, final int lllllllllllllIIlIllllIllIIllIlIl, final ByteBuf... lllllllllllllIIlIllllIllIIlllIIl) {
        super(CompositeByteBuf.lIIllIIIIIlllI[0]);
        this.components = new ArrayList<Component>();
        if (llIlIlIlIlIlIlI(lllllllllllllIIlIllllIllIIllIlll)) {
            throw new NullPointerException(CompositeByteBuf.lIIllIIIIIlIIl[CompositeByteBuf.lIIllIIIIIlllI[2]]);
        }
        if (llIlIlIlIlIlIll(lllllllllllllIIlIllllIllIIllIlIl, CompositeByteBuf.lIIllIIIIIlllI[3])) {
            throw new IllegalArgumentException(String.valueOf(new StringBuilder().append(CompositeByteBuf.lIIllIIIIIlIIl[CompositeByteBuf.lIIllIIIIIlllI[3]]).append(lllllllllllllIIlIllllIllIIllIlIl).append(CompositeByteBuf.lIIllIIIIIlIIl[CompositeByteBuf.lIIllIIIIIlllI[4]])));
        }
        this.alloc = lllllllllllllIIlIllllIllIIllIlll;
        this.direct = lllllllllllllIIlIllllIllIIlllIll;
        this.maxNumComponents = lllllllllllllIIlIllllIllIIllIlIl;
        this.addComponents0(CompositeByteBuf.lIIllIIIIIlllI[1], lllllllllllllIIlIllllIllIIlllIIl);
        "".length();
        this.consolidateIfNeeded();
        this.setIndex(CompositeByteBuf.lIIllIIIIIlllI[1], this.capacity());
        "".length();
        this.leak = CompositeByteBuf.leakDetector.open(this);
    }
    
    public CompositeByteBuf discardReadComponents() {
        this.ensureAccessible();
        final int lllllllllllllIIlIlllIlIIIllllIlI = this.readerIndex();
        if (llIlIlIlIlIllII(lllllllllllllIIlIlllIlIIIllllIlI)) {
            return this;
        }
        final int lllllllllllllIIlIlllIlIIIllllIII = this.writerIndex();
        if (llIlIlIlIlIllIl(lllllllllllllIIlIlllIlIIIllllIlI, lllllllllllllIIlIlllIlIIIllllIII) && llIlIlIlIlIllIl(lllllllllllllIIlIlllIlIIIllllIII, this.capacity())) {
            final Iterator lllllllllllllIIlIlllIlIIlIIIIIII = this.components.iterator();
            while (llIlIlIlIlIllll(lllllllllllllIIlIlllIlIIlIIIIIII.hasNext() ? 1 : 0)) {
                final Component lllllllllllllIIlIlllIlIIlIIIIIIl = lllllllllllllIIlIlllIlIIlIIIIIII.next();
                lllllllllllllIIlIlllIlIIlIIIIIIl.freeIfNecessary();
                "".length();
                if (" ".length() < 0) {
                    return null;
                }
            }
            this.components.clear();
            this.setIndex(CompositeByteBuf.lIIllIIIIIlllI[1], CompositeByteBuf.lIIllIIIIIlllI[1]);
            "".length();
            this.adjustMarkers(lllllllllllllIIlIlllIlIIIllllIlI);
            return this;
        }
        final int lllllllllllllIIlIlllIlIIIlllIlll = this.toComponentIndex(lllllllllllllIIlIlllIlIIIllllIlI);
        int lllllllllllllIIlIlllIlIIIllllllI = CompositeByteBuf.lIIllIIIIIlllI[1];
        while (llIlIlIlIlIlIll(lllllllllllllIIlIlllIlIIIllllllI, lllllllllllllIIlIlllIlIIIlllIlll)) {
            this.components.get(lllllllllllllIIlIlllIlIIIllllllI).freeIfNecessary();
            ++lllllllllllllIIlIlllIlIIIllllllI;
            "".length();
            if (-"  ".length() > 0) {
                return null;
            }
        }
        this.components.subList(CompositeByteBuf.lIIllIIIIIlllI[1], lllllllllllllIIlIlllIlIIIlllIlll).clear();
        final Component lllllllllllllIIlIlllIlIIIlllIllI = this.components.get(CompositeByteBuf.lIIllIIIIIlllI[1]);
        final int lllllllllllllIIlIlllIlIIIlllIlII = lllllllllllllIIlIlllIlIIIlllIllI.offset;
        this.updateComponentOffsets(CompositeByteBuf.lIIllIIIIIlllI[1]);
        this.setIndex(lllllllllllllIIlIlllIlIIIllllIlI - lllllllllllllIIlIlllIlIIIlllIlII, lllllllllllllIIlIlllIlIIIllllIII - lllllllllllllIIlIlllIlIIIlllIlII);
        "".length();
        this.adjustMarkers(lllllllllllllIIlIlllIlIIIlllIlII);
        return this;
    }
    
    @Override
    public CompositeByteBuf retain() {
        return (CompositeByteBuf)super.retain();
    }
    
    @Override
    public CompositeByteBuf writeBytes(final ByteBuffer lllllllllllllIIlIlllIIlIIIIllIII) {
        return (CompositeByteBuf)super.writeBytes(lllllllllllllIIlIlllIIlIIIIllIII);
    }
    
    @Override
    public CompositeByteBuf writeByte(final int lllllllllllllIIlIlllIIlIlIllllIl) {
        return (CompositeByteBuf)super.writeByte(lllllllllllllIIlIlllIIlIlIllllIl);
    }
    
    @Override
    public CompositeByteBuf resetReaderIndex() {
        return (CompositeByteBuf)super.resetReaderIndex();
    }
    
    @Override
    protected void _setShort(final int lllllllllllllIIlIlllIllllIllIIlI, final int lllllllllllllIIlIlllIllllIllIIII) {
        final Component lllllllllllllIIlIlllIllllIlIlllI = this.findComponent(lllllllllllllIIlIlllIllllIllIIlI);
        if (llIlIlIlIllIlIl(lllllllllllllIIlIlllIllllIllIIlI + CompositeByteBuf.lIIllIIIIIlllI[3], lllllllllllllIIlIlllIllllIlIlllI.endOffset)) {
            lllllllllllllIIlIlllIllllIlIlllI.buf.setShort(lllllllllllllIIlIlllIllllIllIIlI - lllllllllllllIIlIlllIllllIlIlllI.offset, lllllllllllllIIlIlllIllllIllIIII);
            "".length();
            "".length();
            if (((0x54 ^ 0xE ^ (0x7E ^ 0x28)) & (0x4D ^ 0x14 ^ (0xFF ^ 0xAA) ^ -" ".length())) != 0x0) {
                return;
            }
        }
        else if (llIlIlIllIIIIII(this.order(), ByteOrder.BIG_ENDIAN)) {
            this._setByte(lllllllllllllIIlIlllIllllIllIIlI, (byte)(lllllllllllllIIlIlllIllllIllIIII >>> CompositeByteBuf.lIIllIIIIIlllI[9]));
            this._setByte(lllllllllllllIIlIlllIllllIllIIlI + CompositeByteBuf.lIIllIIIIIlllI[2], (byte)lllllllllllllIIlIlllIllllIllIIII);
            "".length();
            if (-"  ".length() >= 0) {
                return;
            }
        }
        else {
            this._setByte(lllllllllllllIIlIlllIllllIllIIlI, (byte)lllllllllllllIIlIlllIllllIllIIII);
            this._setByte(lllllllllllllIIlIlllIllllIllIIlI + CompositeByteBuf.lIIllIIIIIlllI[2], (byte)(lllllllllllllIIlIlllIllllIllIIII >>> CompositeByteBuf.lIIllIIIIIlllI[9]));
        }
    }
    
    public int toByteIndex(final int lllllllllllllIIlIllllIIlIlIlllII) {
        this.checkComponentIndex(lllllllllllllIIlIllllIIlIlIlllII);
        return this.components.get(lllllllllllllIIlIllllIIlIlIlllII).offset;
    }
    
    @Override
    public ByteBuffer nioBuffer(final int lllllllllllllIIlIlllIlIlIIllIIlI, final int lllllllllllllIIlIlllIlIlIIlIIllI) {
        if (llIlIlIlIlIllIl(this.components.size(), CompositeByteBuf.lIIllIIIIIlllI[2])) {
            final ByteBuf lllllllllllllIIlIlllIlIlIIlllIII = this.components.get(CompositeByteBuf.lIIllIIIIIlllI[1]).buf;
            if (llIlIlIlIlIllIl(lllllllllllllIIlIlllIlIlIIlllIII.nioBufferCount(), CompositeByteBuf.lIIllIIIIIlllI[2])) {
                return this.components.get(CompositeByteBuf.lIIllIIIIIlllI[1]).buf.nioBuffer(lllllllllllllIIlIlllIlIlIIllIIlI, lllllllllllllIIlIlllIlIlIIlIIllI);
            }
        }
        final ByteBuffer lllllllllllllIIlIlllIlIlIIlIlllI = ByteBuffer.allocate(lllllllllllllIIlIlllIlIlIIlIIllI).order(this.order());
        final ByteBuffer[] lllllllllllllIIlIlllIlIlIIlIllII = this.nioBuffers(lllllllllllllIIlIlllIlIlIIllIIlI, lllllllllllllIIlIlllIlIlIIlIIllI);
        int lllllllllllllIIlIlllIlIlIIllIllI = CompositeByteBuf.lIIllIIIIIlllI[1];
        while (llIlIlIlIlIlIll(lllllllllllllIIlIlllIlIlIIllIllI, lllllllllllllIIlIlllIlIlIIlIllII.length)) {
            lllllllllllllIIlIlllIlIlIIlIlllI.put(lllllllllllllIIlIlllIlIlIIlIllII[lllllllllllllIIlIlllIlIlIIllIllI]);
            "".length();
            ++lllllllllllllIIlIlllIlIlIIllIllI;
            "".length();
            if (((0x19 ^ 0x65 ^ (0x98 ^ 0xC7)) & (0x99 ^ 0xB0 ^ (0xA1 ^ 0xAB) ^ -" ".length())) < -" ".length()) {
                return null;
            }
        }
        lllllllllllllIIlIlllIlIlIIlIlllI.flip();
        "".length();
        return lllllllllllllIIlIlllIlIlIIlIlllI;
    }
    
    public int maxNumComponents() {
        return this.maxNumComponents;
    }
    
    public CompositeByteBuf addComponents(final ByteBuf... lllllllllllllIIlIllllIllIIIllIll) {
        this.addComponents0(this.components.size(), lllllllllllllIIlIllllIllIIIllIll);
        "".length();
        this.consolidateIfNeeded();
        return this;
    }
    
    @Override
    public CompositeByteBuf writeBytes(final byte[] lllllllllllllIIlIlllIIlIIIlIIlIl, final int lllllllllllllIIlIlllIIlIIIlIlIlI, final int lllllllllllllIIlIlllIIlIIIlIIIlI) {
        return (CompositeByteBuf)super.writeBytes(lllllllllllllIIlIlllIIlIIIlIIlIl, lllllllllllllIIlIlllIIlIIIlIlIlI, lllllllllllllIIlIlllIIlIIIlIIIlI);
    }
    
    public CompositeByteBuf removeComponent(final int lllllllllllllIIlIllllIlIIIlllIII) {
        this.checkComponentIndex(lllllllllllllIIlIllllIlIIIlllIII);
        this.components.remove(lllllllllllllIIlIllllIlIIIlllIII).freeIfNecessary();
        this.updateComponentOffsets(lllllllllllllIIlIllllIlIIIlllIII);
        return this;
    }
    
    public CompositeByteBuf consolidate() {
        this.ensureAccessible();
        final int lllllllllllllIIlIlllIlIIllIlIIll = this.numComponents();
        if (llIlIlIlIllIlIl(lllllllllllllIIlIlllIlIIllIlIIll, CompositeByteBuf.lIIllIIIIIlllI[2])) {
            return this;
        }
        final Component lllllllllllllIIlIlllIlIIllIlIIlI = this.components.get(lllllllllllllIIlIlllIlIIllIlIIll - CompositeByteBuf.lIIllIIIIIlllI[2]);
        final int lllllllllllllIIlIlllIlIIllIlIIIl = lllllllllllllIIlIlllIlIIllIlIIlI.endOffset;
        final ByteBuf lllllllllllllIIlIlllIlIIllIlIIII = this.allocBuffer(lllllllllllllIIlIlllIlIIllIlIIIl);
        int lllllllllllllIIlIlllIlIIllIlIlll = CompositeByteBuf.lIIllIIIIIlllI[1];
        while (llIlIlIlIlIlIll(lllllllllllllIIlIlllIlIIllIlIlll, lllllllllllllIIlIlllIlIIllIlIIll)) {
            final Component lllllllllllllIIlIlllIlIIllIllIlI = this.components.get(lllllllllllllIIlIlllIlIIllIlIlll);
            final ByteBuf lllllllllllllIIlIlllIlIIllIllIIl = lllllllllllllIIlIlllIlIIllIllIlI.buf;
            lllllllllllllIIlIlllIlIIllIlIIII.writeBytes(lllllllllllllIIlIlllIlIIllIllIIl);
            "".length();
            lllllllllllllIIlIlllIlIIllIllIlI.freeIfNecessary();
            ++lllllllllllllIIlIlllIlIIllIlIlll;
            "".length();
            if (-" ".length() >= 0) {
                return null;
            }
        }
        this.components.clear();
        this.components.add(new Component(lllllllllllllIIlIlllIlIIllIlIIII));
        "".length();
        this.updateComponentOffsets(CompositeByteBuf.lIIllIIIIIlllI[1]);
        return this;
    }
    
    @Override
    protected short _getShort(final int lllllllllllllIIlIllllIIlIlIIIllI) {
        final Component lllllllllllllIIlIllllIIlIlIIIlIl = this.findComponent(lllllllllllllIIlIllllIIlIlIIIllI);
        if (llIlIlIlIllIlIl(lllllllllllllIIlIllllIIlIlIIIllI + CompositeByteBuf.lIIllIIIIIlllI[3], lllllllllllllIIlIllllIIlIlIIIlIl.endOffset)) {
            return lllllllllllllIIlIllllIIlIlIIIlIl.buf.getShort(lllllllllllllIIlIllllIIlIlIIIllI - lllllllllllllIIlIllllIIlIlIIIlIl.offset);
        }
        if (llIlIlIllIIIIII(this.order(), ByteOrder.BIG_ENDIAN)) {
            return (short)((this._getByte(lllllllllllllIIlIllllIIlIlIIIllI) & CompositeByteBuf.lIIllIIIIIlllI[15]) << CompositeByteBuf.lIIllIIIIIlllI[9] | (this._getByte(lllllllllllllIIlIllllIIlIlIIIllI + CompositeByteBuf.lIIllIIIIIlllI[2]) & CompositeByteBuf.lIIllIIIIIlllI[15]));
        }
        return (short)((this._getByte(lllllllllllllIIlIllllIIlIlIIIllI) & CompositeByteBuf.lIIllIIIIIlllI[15]) | (this._getByte(lllllllllllllIIlIllllIIlIlIIIllI + CompositeByteBuf.lIIllIIIIIlllI[2]) & CompositeByteBuf.lIIllIIIIIlllI[15]) << CompositeByteBuf.lIIllIIIIIlllI[9]);
    }
    
    @Override
    public CompositeByteBuf readBytes(final byte[] lllllllllllllIIlIlllIIlIllllllII, final int lllllllllllllIIlIlllIIlIllllIIlI, final int lllllllllllllIIlIlllIIlIllllIIII) {
        return (CompositeByteBuf)super.readBytes(lllllllllllllIIlIlllIIlIllllllII, lllllllllllllIIlIlllIIlIllllIIlI, lllllllllllllIIlIlllIIlIllllIIII);
    }
    
    private static boolean llIlIlIllIIIIll(final int lllllllllllllIIlIllIlllIIllIIIII) {
        return lllllllllllllIIlIllIlllIIllIIIII > 0;
    }
    
    public ByteBuf component(final int lllllllllllllIIlIlllIlIllIllIlll) {
        return this.internalComponent(lllllllllllllIIlIlllIlIllIllIlll).duplicate();
    }
    
    @Override
    protected long _getLong(final int lllllllllllllIIlIllllIIlIIIIIlIl) {
        final Component lllllllllllllIIlIllllIIlIIIIlIII = this.findComponent(lllllllllllllIIlIllllIIlIIIIIlIl);
        if (llIlIlIlIllIlIl(lllllllllllllIIlIllllIIlIIIIIlIl + CompositeByteBuf.lIIllIIIIIlllI[9], lllllllllllllIIlIllllIIlIIIIlIII.endOffset)) {
            return lllllllllllllIIlIllllIIlIIIIlIII.buf.getLong(lllllllllllllIIlIllllIIlIIIIIlIl - lllllllllllllIIlIllllIIlIIIIlIII.offset);
        }
        if (llIlIlIllIIIIII(this.order(), ByteOrder.BIG_ENDIAN)) {
            return ((long)this._getInt(lllllllllllllIIlIllllIIlIIIIIlIl) & 0xFFFFFFFFL) << CompositeByteBuf.lIIllIIIIIlllI[18] | ((long)this._getInt(lllllllllllllIIlIllllIIlIIIIIlIl + CompositeByteBuf.lIIllIIIIIlllI[5]) & 0xFFFFFFFFL);
        }
        return ((long)this._getInt(lllllllllllllIIlIllllIIlIIIIIlIl) & 0xFFFFFFFFL) | ((long)this._getInt(lllllllllllllIIlIllllIIlIIIIIlIl + CompositeByteBuf.lIIllIIIIIlllI[5]) & 0xFFFFFFFFL) << CompositeByteBuf.lIIllIIIIIlllI[18];
    }
    
    @Override
    public CompositeByteBuf setZero(final int lllllllllllllIIlIlllIIllIIlllllI, final int lllllllllllllIIlIlllIIllIIllllIl) {
        return (CompositeByteBuf)super.setZero(lllllllllllllIIlIlllIIllIIlllllI, lllllllllllllIIlIlllIIllIIllllIl);
    }
    
    @Override
    public byte getByte(final int lllllllllllllIIlIllllIIlIlIlIlII) {
        return this._getByte(lllllllllllllIIlIllllIIlIlIlIlII);
    }
    
    @Override
    public CompositeByteBuf setBytes(int lllllllllllllIIlIlllIlllIIIlllIl, final byte[] lllllllllllllIIlIlllIlllIIlIIIll, int lllllllllllllIIlIlllIlllIIIllIIl, int lllllllllllllIIlIlllIlllIIIlIlll) {
        this.checkSrcIndex((int)lllllllllllllIIlIlllIlllIIIlllIl, lllllllllllllIIlIlllIlllIIIlIlll, lllllllllllllIIlIlllIlllIIIllIIl, lllllllllllllIIlIlllIlllIIlIIIll.length);
        if (llIlIlIlIlIllII(lllllllllllllIIlIlllIlllIIIlIlll)) {
            return this;
        }
        int lllllllllllllIIlIlllIlllIIIlllll = this.toComponentIndex((int)lllllllllllllIIlIlllIlllIIIlllIl);
        while (llIlIlIllIIIIll(lllllllllllllIIlIlllIlllIIIlIlll)) {
            final Component lllllllllllllIIlIlllIlllIIlIlIIl = this.components.get(lllllllllllllIIlIlllIlllIIIlllll);
            final ByteBuf lllllllllllllIIlIlllIlllIIlIlIII = lllllllllllllIIlIlllIlllIIlIlIIl.buf;
            final int lllllllllllllIIlIlllIlllIIlIIlll = lllllllllllllIIlIlllIlllIIlIlIIl.offset;
            final int lllllllllllllIIlIlllIlllIIlIIllI = Math.min(lllllllllllllIIlIlllIlllIIIlIlll, (int)(lllllllllllllIIlIlllIlllIIlIlIII.capacity() - (lllllllllllllIIlIlllIlllIIIlllIl - lllllllllllllIIlIlllIlllIIlIIlll)));
            lllllllllllllIIlIlllIlllIIlIlIII.setBytes((int)(lllllllllllllIIlIlllIlllIIIlllIl - lllllllllllllIIlIlllIlllIIlIIlll), lllllllllllllIIlIlllIlllIIlIIIll, lllllllllllllIIlIlllIlllIIIllIIl, lllllllllllllIIlIlllIlllIIlIIllI);
            "".length();
            lllllllllllllIIlIlllIlllIIIlllIl += lllllllllllllIIlIlllIlllIIlIIllI;
            lllllllllllllIIlIlllIlllIIIllIIl += lllllllllllllIIlIlllIlllIIlIIllI;
            lllllllllllllIIlIlllIlllIIIlIlll -= lllllllllllllIIlIlllIlllIIlIIllI;
            ++lllllllllllllIIlIlllIlllIIIlllll;
            "".length();
            if (null != null) {
                return null;
            }
        }
        return this;
    }
    
    public CompositeByteBuf addComponent(final ByteBuf lllllllllllllIIlIllllIllIIIlllll) {
        this.addComponent0(this.components.size(), lllllllllllllIIlIllllIllIIIlllll);
        "".length();
        this.consolidateIfNeeded();
        return this;
    }
    
    @Override
    public ByteBuf copy(final int lllllllllllllIIlIlllIllIIIIIIIll, final int lllllllllllllIIlIlllIllIIIIIIIlI) {
        this.checkIndex(lllllllllllllIIlIlllIllIIIIIIIll, lllllllllllllIIlIlllIllIIIIIIIlI);
        final ByteBuf lllllllllllllIIlIlllIllIIIIIIIII = Unpooled.buffer(lllllllllllllIIlIlllIllIIIIIIIlI);
        if (llIlIlIlIlIllll(lllllllllllllIIlIlllIllIIIIIIIlI)) {
            this.copyTo(lllllllllllllIIlIlllIllIIIIIIIll, lllllllllllllIIlIlllIllIIIIIIIlI, this.toComponentIndex(lllllllllllllIIlIlllIllIIIIIIIll), lllllllllllllIIlIlllIllIIIIIIIII);
        }
        return lllllllllllllIIlIlllIllIIIIIIIII;
    }
    
    private static boolean llIlIlIllIIlllI(final Object lllllllllllllIIlIllIlllIIllIlllI) {
        return lllllllllllllIIlIllIlllIIllIlllI != null;
    }
    
    public int toComponentIndex(final int lllllllllllllIIlIllllIIlIllIIlII) {
        this.checkIndex(lllllllllllllIIlIllllIIlIllIIlII);
        int lllllllllllllIIlIllllIIlIllIlIIl = CompositeByteBuf.lIIllIIIIIlllI[1];
        int lllllllllllllIIlIllllIIlIllIlIII = this.components.size();
        while (llIlIlIlIllIlIl(lllllllllllllIIlIllllIIlIllIlIIl, lllllllllllllIIlIllllIIlIllIlIII)) {
            final int lllllllllllllIIlIllllIIlIllIlIll = lllllllllllllIIlIllllIIlIllIlIIl + lllllllllllllIIlIllllIIlIllIlIII >>> CompositeByteBuf.lIIllIIIIIlllI[2];
            final Component lllllllllllllIIlIllllIIlIllIlIlI = this.components.get(lllllllllllllIIlIllllIIlIllIlIll);
            if (llIlIlIlIlllIll(lllllllllllllIIlIllllIIlIllIIlII, lllllllllllllIIlIllllIIlIllIlIlI.endOffset)) {
                lllllllllllllIIlIllllIIlIllIlIIl = lllllllllllllIIlIllllIIlIllIlIll + CompositeByteBuf.lIIllIIIIIlllI[2];
                "".length();
                if (null != null) {
                    return (25 + 86 + 60 + 12 ^ 30 + 156 - 171 + 143) & (0xC5 ^ 0xA6 ^ (0x6E ^ 0x24) ^ -" ".length());
                }
            }
            else {
                if (!llIlIlIlIlIlIll(lllllllllllllIIlIllllIIlIllIIlII, lllllllllllllIIlIllllIIlIllIlIlI.offset)) {
                    return lllllllllllllIIlIllllIIlIllIlIll;
                }
                lllllllllllllIIlIllllIIlIllIlIII = lllllllllllllIIlIllllIIlIllIlIll - CompositeByteBuf.lIIllIIIIIlllI[2];
                "".length();
                if ("  ".length() == 0) {
                    return (0x94 ^ 0xAB) & ~(0x6F ^ 0x50);
                }
            }
            "".length();
            if (null != null) {
                return (0x89 ^ 0x8C) & ~(0x26 ^ 0x23);
            }
        }
        throw new Error(CompositeByteBuf.lIIllIIIIIlIIl[CompositeByteBuf.lIIllIIIIIlllI[14]]);
    }
    
    @Override
    public String toString() {
        String lllllllllllllIIlIlllIlIIIIllIlII = super.toString();
        lllllllllllllIIlIlllIlIIIIllIlII = lllllllllllllIIlIlllIlIIIIllIlII.substring(CompositeByteBuf.lIIllIIIIIlllI[1], lllllllllllllIIlIlllIlIIIIllIlII.length() - CompositeByteBuf.lIIllIIIIIlllI[2]);
        return String.valueOf(new StringBuilder().append(lllllllllllllIIlIlllIlIIIIllIlII).append(CompositeByteBuf.lIIllIIIIIlIIl[CompositeByteBuf.lIIllIIIIIlllI[21]]).append(this.components.size()).append((char)CompositeByteBuf.lIIllIIIIIlllI[22]));
    }
    
    @Override
    public CompositeByteBuf setBytes(final int lllllllllllllIIlIlllIIllIlIIllIl, final byte[] lllllllllllllIIlIlllIIllIlIIlIll) {
        return (CompositeByteBuf)super.setBytes(lllllllllllllIIlIlllIIllIlIIllIl, lllllllllllllIIlIlllIIllIlIIlIll);
    }
    
    @Override
    public CompositeByteBuf writerIndex(final int lllllllllllllIIlIlllIlIIIIIlllll) {
        return (CompositeByteBuf)super.writerIndex(lllllllllllllIIlIlllIlIIIIIlllll);
    }
    
    private static void llIlIlIlIIlIllI() {
        (lIIllIIIIIlIIl = new String[CompositeByteBuf.lIIllIIIIIlllI[17]])[CompositeByteBuf.lIIllIIIIIlllI[1]] = llIlIlIlIIIllll("u2tRBpKwMQE=", "lHpaj");
        CompositeByteBuf.lIIllIIIIIlIIl[CompositeByteBuf.lIIllIIIIIlllI[2]] = llIlIlIlIIlIIII("kcBvNcKf4is=", "ToIyh");
        CompositeByteBuf.lIIllIIIIIlIIl[CompositeByteBuf.lIIllIIIIIlllI[3]] = llIlIlIlIIlIIIl("JAweKjYkLgkJMyYDAwo3OldG", "ImfdC");
        CompositeByteBuf.lIIllIIIIIlIIl[CompositeByteBuf.lIIllIIIIIlllI[4]] = llIlIlIlIIlIIII("v1flrpiauUnWf7e6GKYBHRjCZ234YPw8", "SsIQI");
        CompositeByteBuf.lIIllIIIIIlIIl[CompositeByteBuf.lIIllIIIIIlllI[5]] = llIlIlIlIIIllll("VrSOUi/PqK8=", "MoRct");
        CompositeByteBuf.lIIllIIIIIlIIl[CompositeByteBuf.lIIllIIIIIlllI[6]] = llIlIlIlIIlIIII("IE4tEvPm2V7fFemkg2Ql2nat8H2Z2deJ", "eyJeq");
        CompositeByteBuf.lIIllIIIIIlIIl[CompositeByteBuf.lIIllIIIIIlllI[7]] = llIlIlIlIIlIIIl("a1kWNgMuEgcrF3FRTXNTeVg=", "KqsNs");
        CompositeByteBuf.lIIllIIIIIlIIl[CompositeByteBuf.lIIllIIIIIlllI[8]] = llIlIlIlIIIllll("ZCf+CzheT8w=", "uGThm");
        CompositeByteBuf.lIIllIIIIIlIIl[CompositeByteBuf.lIIllIIIIIlllI[9]] = llIlIlIlIIlIIIl("Ox8UBywrGQ==", "YjraI");
        CompositeByteBuf.lIIllIIIIIlIIl[CompositeByteBuf.lIIllIIIIIlllI[10]] = llIlIlIlIIlIIIl("BiYgFwQWIA==", "dSFqa");
        CompositeByteBuf.lIIllIIIIIlIIl[CompositeByteBuf.lIIllIIIIIlllI[11]] = llIlIlIlIIIllll("RzdIcneo8+RDCYJLQP2qso4rBLDpWn00EjEHhS6tD1KAYdKSC0EksOMvc4urhviOKmt/RAqar5I=", "hlYrS");
        CompositeByteBuf.lIIllIIIIIlIIl[CompositeByteBuf.lIIllIIIIIlllI[12]] = llIlIlIlIIIllll("gagDXpAsG39kvT9e0p9fQGX+RFygTry2wRCb7ZjIBQI1ORtKWTw31CBVszVgrzEvmCx8UhisFXke9pQhFNukemlvmccx0Av45eSBvtqVg25IH79YihUJdEl1LDd3lEPAo8pKzx2VNzW4SkQ5LD/Z2A==", "MwrQk");
        CompositeByteBuf.lIIllIIIIIlIIl[CompositeByteBuf.lIIllIIIIIlllI[13]] = llIlIlIlIIIllll("GBalox7LolBIP1MNJ+2TWw==", "hBEZT");
        CompositeByteBuf.lIIllIIIIIlIIl[CompositeByteBuf.lIIllIIIIIlllI[14]] = llIlIlIlIIlIIII("laz04pka81S6TDs8aQnnHG2vPyH3CX3b", "VoATV");
        CompositeByteBuf.lIIllIIIIIlIIl[CompositeByteBuf.lIIllIIIIIlllI[20]] = llIlIlIlIIlIIII("vb0kMeHdslPXgSB4SJhL2OyoWUXrsilc", "EAqvc");
        CompositeByteBuf.lIIllIIIIIlIIl[CompositeByteBuf.lIIllIIIIIlllI[21]] = llIlIlIlIIlIIII("98XC4o5StnoWmafOei9mmA==", "fqcvO");
    }
    
    @Override
    public int setBytes(int lllllllllllllIIlIlllIllIIIlIIIlI, final ScatteringByteChannel lllllllllllllIIlIlllIllIIIlIIIII, int lllllllllllllIIlIlllIllIIIlIIllI) throws IOException {
        this.checkIndex(lllllllllllllIIlIlllIllIIIlIIIlI, lllllllllllllIIlIlllIllIIIlIIllI);
        if (llIlIlIlIlIllII(lllllllllllllIIlIlllIllIIIlIIllI)) {
            return lllllllllllllIIlIlllIllIIIlIIIII.read(CompositeByteBuf.FULL_BYTEBUFFER);
        }
        int lllllllllllllIIlIlllIllIIIlIIlIl = this.toComponentIndex(lllllllllllllIIlIlllIllIIIlIIIlI);
        int lllllllllllllIIlIlllIllIIIlIIlII = CompositeByteBuf.lIIllIIIIIlllI[1];
        do {
            final Component lllllllllllllIIlIlllIllIIIllIllI = this.components.get(lllllllllllllIIlIlllIllIIIlIIlIl);
            final ByteBuf lllllllllllllIIlIlllIllIIIllIIll = lllllllllllllIIlIlllIllIIIllIllI.buf;
            final int lllllllllllllIIlIlllIllIIIllIIIl = lllllllllllllIIlIlllIllIIIllIllI.offset;
            final int lllllllllllllIIlIlllIllIIIlIllll = Math.min(lllllllllllllIIlIlllIllIIIlIIllI, lllllllllllllIIlIlllIllIIIllIIll.capacity() - (lllllllllllllIIlIlllIllIIIlIIIlI - lllllllllllllIIlIlllIllIIIllIIIl));
            final int lllllllllllllIIlIlllIllIIIlIllIl = lllllllllllllIIlIlllIllIIIllIIll.setBytes(lllllllllllllIIlIlllIllIIIlIIIlI - lllllllllllllIIlIlllIllIIIllIIIl, lllllllllllllIIlIlllIllIIIlIIIII, lllllllllllllIIlIlllIllIIIlIllll);
            if (llIlIlIlIlIllII(lllllllllllllIIlIlllIllIIIlIllIl)) {
                "".length();
                if (-" ".length() > 0) {
                    return (0x3B ^ 0x22) & ~(0x77 ^ 0x6E);
                }
                break;
            }
            else if (llIlIlIllIIlIlI(lllllllllllllIIlIlllIllIIIlIllIl)) {
                if (llIlIlIlIlIllII(lllllllllllllIIlIlllIllIIIlIIlII)) {
                    return CompositeByteBuf.lIIllIIIIIlllI[19];
                }
                break;
            }
            else if (llIlIlIlIlIllIl(lllllllllllllIIlIlllIllIIIlIllIl, lllllllllllllIIlIlllIllIIIlIllll)) {
                lllllllllllllIIlIlllIllIIIlIIIlI += lllllllllllllIIlIlllIllIIIlIllll;
                lllllllllllllIIlIlllIllIIIlIIllI -= lllllllllllllIIlIlllIllIIIlIllll;
                lllllllllllllIIlIlllIllIIIlIIlII += lllllllllllllIIlIlllIllIIIlIllll;
                ++lllllllllllllIIlIlllIllIIIlIIlIl;
                "".length();
                if ((0x96 ^ 0x92) <= " ".length()) {
                    return (0x46 ^ 0x76) & ~(0x2C ^ 0x1C);
                }
                continue;
            }
            else {
                lllllllllllllIIlIlllIllIIIlIIIlI += lllllllllllllIIlIlllIllIIIlIllIl;
                lllllllllllllIIlIlllIllIIIlIIllI -= lllllllllllllIIlIlllIllIIIlIllIl;
                lllllllllllllIIlIlllIllIIIlIIlII += lllllllllllllIIlIlllIllIIIlIllIl;
            }
        } while (!llIlIlIlIlllIII(lllllllllllllIIlIlllIllIIIlIIllI));
        return lllllllllllllIIlIlllIllIIIlIIlII;
    }
    
    @Override
    public CompositeByteBuf markWriterIndex() {
        return (CompositeByteBuf)super.markWriterIndex();
    }
    
    @Override
    public CompositeByteBuf resetWriterIndex() {
        return (CompositeByteBuf)super.resetWriterIndex();
    }
    
    private static boolean llIlIlIlIllIlIl(final int lllllllllllllIIlIllIlllIIllllIIl, final int lllllllllllllIIlIllIlllIIllllIII) {
        return lllllllllllllIIlIllIlllIIllllIIl <= lllllllllllllIIlIllIlllIIllllIII;
    }
    
    private void checkComponentIndex(final int lllllllllllllIIlIllllIlIIllIllIl, final int lllllllllllllIIlIllllIlIIllIllll) {
        this.ensureAccessible();
        if (!llIlIlIlIllIIll(lllllllllllllIIlIllllIlIIllIllIl) || llIlIlIlIllIIIl(lllllllllllllIIlIllllIlIIllIllIl + lllllllllllllIIlIllllIlIIllIllll, this.components.size())) {
            final String format = CompositeByteBuf.lIIllIIIIIlIIl[CompositeByteBuf.lIIllIIIIIlllI[12]];
            final Object[] args = new Object[CompositeByteBuf.lIIllIIIIIlllI[4]];
            args[CompositeByteBuf.lIIllIIIIIlllI[1]] = lllllllllllllIIlIllllIlIIllIllIl;
            args[CompositeByteBuf.lIIllIIIIIlllI[2]] = lllllllllllllIIlIllllIlIIllIllll;
            args[CompositeByteBuf.lIIllIIIIIlllI[3]] = this.components.size();
            throw new IndexOutOfBoundsException(String.format(format, args));
        }
    }
    
    @Override
    protected void deallocate() {
        if (llIlIlIlIlIllll(this.freed ? 1 : 0)) {
            return;
        }
        this.freed = (CompositeByteBuf.lIIllIIIIIlllI[2] != 0);
        final int lllllllllllllIIlIlllIIIllllIIlIl = this.components.size();
        int lllllllllllllIIlIlllIIIllllIIlll = CompositeByteBuf.lIIllIIIIIlllI[1];
        while (llIlIlIlIlIlIll(lllllllllllllIIlIlllIIIllllIIlll, lllllllllllllIIlIlllIIIllllIIlIl)) {
            this.components.get(lllllllllllllIIlIlllIIIllllIIlll).freeIfNecessary();
            ++lllllllllllllIIlIlllIIIllllIIlll;
            "".length();
            if (" ".length() > "  ".length()) {
                return;
            }
        }
        if (llIlIlIllIIlllI(this.leak)) {
            this.leak.close();
            "".length();
        }
    }
    
    private static String llIlIlIlIIlIIII(final String lllllllllllllIIlIllIlllIlIIIlIll, final String lllllllllllllIIlIllIlllIlIIIllII) {
        try {
            final SecretKeySpec lllllllllllllIIlIllIlllIlIIlIIII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIIlIllIlllIlIIIllII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lllllllllllllIIlIllIlllIlIIIllll = Cipher.getInstance("Blowfish");
            lllllllllllllIIlIllIlllIlIIIllll.init(CompositeByteBuf.lIIllIIIIIlllI[3], lllllllllllllIIlIllIlllIlIIlIIII);
            return new String(lllllllllllllIIlIllIlllIlIIIllll.doFinal(Base64.getDecoder().decode(lllllllllllllIIlIllIlllIlIIIlIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIlIllIlllIlIIIlllI) {
            lllllllllllllIIlIllIlllIlIIIlllI.printStackTrace();
            return null;
        }
    }
    
    @Override
    public CompositeByteBuf setBytes(int lllllllllllllIIlIlllIllIlIlIIlll, final ByteBuf lllllllllllllIIlIlllIllIlIlIllIl, int lllllllllllllIIlIlllIllIlIlIIIll, int lllllllllllllIIlIlllIllIlIlIIIIl) {
        this.checkSrcIndex(lllllllllllllIIlIlllIllIlIlIIlll, (int)lllllllllllllIIlIlllIllIlIlIIIIl, lllllllllllllIIlIlllIllIlIlIIIll, lllllllllllllIIlIlllIllIlIlIllIl.capacity());
        if (llIlIlIlIlIllII((int)lllllllllllllIIlIlllIllIlIlIIIIl)) {
            return this;
        }
        int lllllllllllllIIlIlllIllIlIlIlIlI = this.toComponentIndex(lllllllllllllIIlIlllIllIlIlIIlll);
        while (llIlIlIllIIIIll((int)lllllllllllllIIlIlllIllIlIlIIIIl)) {
            final Component lllllllllllllIIlIlllIllIlIllIllI = this.components.get(lllllllllllllIIlIlllIllIlIlIlIlI);
            final ByteBuf lllllllllllllIIlIlllIllIlIllIlII = lllllllllllllIIlIlllIllIlIllIllI.buf;
            final int lllllllllllllIIlIlllIllIlIllIIll = lllllllllllllIIlIlllIllIlIllIllI.offset;
            final int lllllllllllllIIlIlllIllIlIllIIlI = Math.min((int)lllllllllllllIIlIlllIllIlIlIIIIl, lllllllllllllIIlIlllIllIlIllIlII.capacity() - (lllllllllllllIIlIlllIllIlIlIIlll - lllllllllllllIIlIlllIllIlIllIIll));
            lllllllllllllIIlIlllIllIlIllIlII.setBytes(lllllllllllllIIlIlllIllIlIlIIlll - lllllllllllllIIlIlllIllIlIllIIll, lllllllllllllIIlIlllIllIlIlIllIl, lllllllllllllIIlIlllIllIlIlIIIll, lllllllllllllIIlIlllIllIlIllIIlI);
            "".length();
            lllllllllllllIIlIlllIllIlIlIIlll += lllllllllllllIIlIlllIllIlIllIIlI;
            lllllllllllllIIlIlllIllIlIlIIIll += lllllllllllllIIlIlllIllIlIllIIlI;
            lllllllllllllIIlIlllIllIlIlIIIIl -= lllllllllllllIIlIlllIllIlIllIIlI;
            ++lllllllllllllIIlIlllIllIlIlIlIlI;
            "".length();
            if (((0xCB ^ 0xB9 ^ (0xCF ^ 0x9E)) & (0xF ^ 0x9 ^ (0xAD ^ 0x88) ^ -" ".length())) <= -" ".length()) {
                return null;
            }
        }
        return this;
    }
    
    @Override
    public CompositeByteBuf readBytes(final ByteBuf lllllllllllllIIlIlllIIllIIlIlIlI, final int lllllllllllllIIlIlllIIllIIlIlIII) {
        return (CompositeByteBuf)super.readBytes(lllllllllllllIIlIlllIIllIIlIlIlI, lllllllllllllIIlIlllIIllIIlIlIII);
    }
    
    @Override
    public CompositeByteBuf writeZero(final int lllllllllllllIIlIlllIIlIIIIlIIIl) {
        return (CompositeByteBuf)super.writeZero(lllllllllllllIIlIlllIIlIIIIlIIIl);
    }
    
    @Override
    public CompositeByteBuf writeMedium(final int lllllllllllllIIlIlllIIlIlIlIlIll) {
        return (CompositeByteBuf)super.writeMedium(lllllllllllllIIlIlllIIlIlIlIlIll);
    }
    
    public ByteBuf internalComponentAtOffset(final int lllllllllllllIIlIlllIlIllIIlllIl) {
        return this.findComponent(lllllllllllllIIlIlllIlIllIIlllIl).buf;
    }
    
    @Override
    protected void _setMedium(final int lllllllllllllIIlIlllIllllIIIIlll, final int lllllllllllllIIlIlllIllllIIIlIlI) {
        final Component lllllllllllllIIlIlllIllllIIIlIIl = this.findComponent(lllllllllllllIIlIlllIllllIIIIlll);
        if (llIlIlIlIllIlIl(lllllllllllllIIlIlllIllllIIIIlll + CompositeByteBuf.lIIllIIIIIlllI[4], lllllllllllllIIlIlllIllllIIIlIIl.endOffset)) {
            lllllllllllllIIlIlllIllllIIIlIIl.buf.setMedium(lllllllllllllIIlIlllIllllIIIIlll - lllllllllllllIIlIlllIllllIIIlIIl.offset, lllllllllllllIIlIlllIllllIIIlIlI);
            "".length();
            "".length();
            if (null != null) {
                return;
            }
        }
        else if (llIlIlIllIIIIII(this.order(), ByteOrder.BIG_ENDIAN)) {
            this._setShort(lllllllllllllIIlIlllIllllIIIIlll, (short)(lllllllllllllIIlIlllIllllIIIlIlI >> CompositeByteBuf.lIIllIIIIIlllI[9]));
            this._setByte(lllllllllllllIIlIlllIllllIIIIlll + CompositeByteBuf.lIIllIIIIIlllI[3], (byte)lllllllllllllIIlIlllIllllIIIlIlI);
            "".length();
            if ("   ".length() <= 0) {
                return;
            }
        }
        else {
            this._setShort(lllllllllllllIIlIlllIllllIIIIlll, (short)lllllllllllllIIlIlllIllllIIIlIlI);
            this._setByte(lllllllllllllIIlIlllIllllIIIIlll + CompositeByteBuf.lIIllIIIIIlllI[3], (byte)(lllllllllllllIIlIlllIllllIIIlIlI >>> CompositeByteBuf.lIIllIIIIIlllI[17]));
        }
    }
    
    @Override
    public int nioBufferCount() {
        if (llIlIlIlIlIllIl(this.components.size(), CompositeByteBuf.lIIllIIIIIlllI[2])) {
            return this.components.get(CompositeByteBuf.lIIllIIIIIlllI[1]).buf.nioBufferCount();
        }
        int lllllllllllllIIlIlllIlIlIllIIlII = CompositeByteBuf.lIIllIIIIIlllI[1];
        final int lllllllllllllIIlIlllIlIlIllIIIll = this.components.size();
        int lllllllllllllIIlIlllIlIlIllIIllI = CompositeByteBuf.lIIllIIIIIlllI[1];
        while (llIlIlIlIlIlIll(lllllllllllllIIlIlllIlIlIllIIllI, lllllllllllllIIlIlllIlIlIllIIIll)) {
            final Component lllllllllllllIIlIlllIlIlIllIlIII = this.components.get(lllllllllllllIIlIlllIlIlIllIIllI);
            lllllllllllllIIlIlllIlIlIllIIlII += lllllllllllllIIlIlllIlIlIllIlIII.buf.nioBufferCount();
            ++lllllllllllllIIlIlllIlIlIllIIllI;
            "".length();
            if ((0x4D ^ 0x49) <= 0) {
                return (0x47 ^ 0x70) & ~(0x1E ^ 0x29);
            }
        }
        return lllllllllllllIIlIlllIlIlIllIIlII;
    }
    
    private void checkComponentIndex(final int lllllllllllllIIlIllllIlIIllllIll) {
        this.ensureAccessible();
        if (!llIlIlIlIllIIll(lllllllllllllIIlIllllIlIIllllIll) || llIlIlIlIllIIIl(lllllllllllllIIlIllllIlIIllllIll, this.components.size())) {
            final String format = CompositeByteBuf.lIIllIIIIIlIIl[CompositeByteBuf.lIIllIIIIIlllI[11]];
            final Object[] args = new Object[CompositeByteBuf.lIIllIIIIIlllI[3]];
            args[CompositeByteBuf.lIIllIIIIIlllI[1]] = lllllllllllllIIlIllllIlIIllllIll;
            args[CompositeByteBuf.lIIllIIIIIlllI[2]] = this.components.size();
            throw new IndexOutOfBoundsException(String.format(format, args));
        }
    }
    
    @Override
    public CompositeByteBuf ensureWritable(final int lllllllllllllIIlIlllIIlllllIIlII) {
        return (CompositeByteBuf)super.ensureWritable(lllllllllllllIIlIlllIIlllllIIlII);
    }
    
    @Override
    public CompositeByteBuf readerIndex(final int lllllllllllllIIlIlllIlIIIIlIlIlI) {
        return (CompositeByteBuf)super.readerIndex(lllllllllllllIIlIlllIlIIIIlIlIlI);
    }
    
    @Override
    public CompositeByteBuf setShort(final int lllllllllllllIIlIlllIlllllIIllII, final int lllllllllllllIIlIlllIlllllIIlIlI) {
        return (CompositeByteBuf)super.setShort(lllllllllllllIIlIlllIlllllIIllII, lllllllllllllIIlIlllIlllllIIlIlI);
    }
    
    @Override
    protected int _getUnsignedMedium(final int lllllllllllllIIlIllllIIlIIllIllI) {
        final Component lllllllllllllIIlIllllIIlIIllIlII = this.findComponent(lllllllllllllIIlIllllIIlIIllIllI);
        if (llIlIlIlIllIlIl(lllllllllllllIIlIllllIIlIIllIllI + CompositeByteBuf.lIIllIIIIIlllI[4], lllllllllllllIIlIllllIIlIIllIlII.endOffset)) {
            return lllllllllllllIIlIllllIIlIIllIlII.buf.getUnsignedMedium(lllllllllllllIIlIllllIIlIIllIllI - lllllllllllllIIlIllllIIlIIllIlII.offset);
        }
        if (llIlIlIllIIIIII(this.order(), ByteOrder.BIG_ENDIAN)) {
            return (this._getShort(lllllllllllllIIlIllllIIlIIllIllI) & CompositeByteBuf.lIIllIIIIIlllI[16]) << CompositeByteBuf.lIIllIIIIIlllI[9] | (this._getByte(lllllllllllllIIlIllllIIlIIllIllI + CompositeByteBuf.lIIllIIIIIlllI[3]) & CompositeByteBuf.lIIllIIIIIlllI[15]);
        }
        return (this._getShort(lllllllllllllIIlIllllIIlIIllIllI) & CompositeByteBuf.lIIllIIIIIlllI[16]) | (this._getByte(lllllllllllllIIlIllllIIlIIllIllI + CompositeByteBuf.lIIllIIIIIlllI[3]) & CompositeByteBuf.lIIllIIIIIlllI[15]) << CompositeByteBuf.lIIllIIIIIlllI[17];
    }
    
    @Override
    public CompositeByteBuf clear() {
        return (CompositeByteBuf)super.clear();
    }
    
    public int numComponents() {
        return this.components.size();
    }
    
    @Override
    public CompositeByteBuf getBytes(int lllllllllllllIIlIllllIIIIlIlIlll, final ByteBuf lllllllllllllIIlIllllIIIIlIlllII, int lllllllllllllIIlIllllIIIIlIllIll, int lllllllllllllIIlIllllIIIIlIlIIlI) {
        this.checkDstIndex((int)lllllllllllllIIlIllllIIIIlIlIlll, (int)lllllllllllllIIlIllllIIIIlIlIIlI, lllllllllllllIIlIllllIIIIlIllIll, lllllllllllllIIlIllllIIIIlIlllII.capacity());
        if (llIlIlIlIlIllII((int)lllllllllllllIIlIllllIIIIlIlIIlI)) {
            return this;
        }
        int lllllllllllllIIlIllllIIIIlIllIIl = this.toComponentIndex((int)lllllllllllllIIlIllllIIIIlIlIlll);
        while (llIlIlIllIIIIll((int)lllllllllllllIIlIllllIIIIlIlIIlI)) {
            final Component lllllllllllllIIlIllllIIIIllIIIlI = this.components.get(lllllllllllllIIlIllllIIIIlIllIIl);
            final ByteBuf lllllllllllllIIlIllllIIIIllIIIIl = lllllllllllllIIlIllllIIIIllIIIlI.buf;
            final int lllllllllllllIIlIllllIIIIllIIIII = lllllllllllllIIlIllllIIIIllIIIlI.offset;
            final int lllllllllllllIIlIllllIIIIlIlllll = Math.min((int)lllllllllllllIIlIllllIIIIlIlIIlI, (int)(lllllllllllllIIlIllllIIIIllIIIIl.capacity() - (lllllllllllllIIlIllllIIIIlIlIlll - lllllllllllllIIlIllllIIIIllIIIII)));
            lllllllllllllIIlIllllIIIIllIIIIl.getBytes((int)(lllllllllllllIIlIllllIIIIlIlIlll - lllllllllllllIIlIllllIIIIllIIIII), lllllllllllllIIlIllllIIIIlIlllII, lllllllllllllIIlIllllIIIIlIllIll, lllllllllllllIIlIllllIIIIlIlllll);
            "".length();
            lllllllllllllIIlIllllIIIIlIlIlll += lllllllllllllIIlIllllIIIIlIlllll;
            lllllllllllllIIlIllllIIIIlIllIll += lllllllllllllIIlIllllIIIIlIlllll;
            lllllllllllllIIlIllllIIIIlIlIIlI -= lllllllllllllIIlIllllIIIIlIlllll;
            ++lllllllllllllIIlIllllIIIIlIllIIl;
            "".length();
            if ((0xC5 ^ 0xA3 ^ (0x75 ^ 0x17)) == 0x0) {
                return null;
            }
        }
        return this;
    }
    
    @Override
    public CompositeByteBuf setMedium(final int lllllllllllllIIlIlllIllllIIllIII, final int lllllllllllllIIlIlllIllllIIllIll) {
        return (CompositeByteBuf)super.setMedium(lllllllllllllIIlIlllIllllIIllIII, lllllllllllllIIlIlllIllllIIllIll);
    }
    
    @Override
    public CompositeByteBuf setBoolean(final int lllllllllllllIIlIlllIIlllIlIIIlI, final boolean lllllllllllllIIlIlllIIlllIlIIIIl) {
        return (CompositeByteBuf)super.setBoolean(lllllllllllllIIlIlllIIlllIlIIIlI, lllllllllllllIIlIlllIIlllIlIIIIl);
    }
    
    private void copyTo(int lllllllllllllIIlIlllIlIlllIIllIl, int lllllllllllllIIlIlllIlIlllIIlIll, final int lllllllllllllIIlIlllIlIlllIlIlll, final ByteBuf lllllllllllllIIlIlllIlIlllIIlIII) {
        int lllllllllllllIIlIlllIlIlllIlIIll = CompositeByteBuf.lIIllIIIIIlllI[1];
        int lllllllllllllIIlIlllIlIlllIlIIIl = lllllllllllllIIlIlllIlIlllIlIlll;
        while (llIlIlIllIIIIll(lllllllllllllIIlIlllIlIlllIIlIll)) {
            final Component lllllllllllllIIlIlllIlIllllIIIII = this.components.get(lllllllllllllIIlIlllIlIlllIlIIIl);
            final ByteBuf lllllllllllllIIlIlllIlIlllIllllI = lllllllllllllIIlIlllIlIllllIIIII.buf;
            final int lllllllllllllIIlIlllIlIlllIlllII = lllllllllllllIIlIlllIlIllllIIIII.offset;
            final int lllllllllllllIIlIlllIlIlllIllIll = Math.min(lllllllllllllIIlIlllIlIlllIIlIll, lllllllllllllIIlIlllIlIlllIllllI.capacity() - (lllllllllllllIIlIlllIlIlllIIllIl - lllllllllllllIIlIlllIlIlllIlllII));
            lllllllllllllIIlIlllIlIlllIllllI.getBytes(lllllllllllllIIlIlllIlIlllIIllIl - lllllllllllllIIlIlllIlIlllIlllII, lllllllllllllIIlIlllIlIlllIIlIII, lllllllllllllIIlIlllIlIlllIlIIll, lllllllllllllIIlIlllIlIlllIllIll);
            "".length();
            lllllllllllllIIlIlllIlIlllIIllIl += lllllllllllllIIlIlllIlIlllIllIll;
            lllllllllllllIIlIlllIlIlllIlIIll += lllllllllllllIIlIlllIlIlllIllIll;
            lllllllllllllIIlIlllIlIlllIIlIll -= lllllllllllllIIlIlllIlIlllIllIll;
            ++lllllllllllllIIlIlllIlIlllIlIIIl;
            "".length();
            if ((0x14 ^ 0x30 ^ (0xB5 ^ 0x95)) == "  ".length()) {
                return;
            }
        }
        lllllllllllllIIlIlllIlIlllIIlIII.writerIndex(lllllllllllllIIlIlllIlIlllIIlIII.capacity());
        "".length();
    }
    
    @Override
    protected int _getInt(final int lllllllllllllIIlIllllIIlIIIllIll) {
        final Component lllllllllllllIIlIllllIIlIIIlllll = this.findComponent(lllllllllllllIIlIllllIIlIIIllIll);
        if (llIlIlIlIllIlIl(lllllllllllllIIlIllllIIlIIIllIll + CompositeByteBuf.lIIllIIIIIlllI[5], lllllllllllllIIlIllllIIlIIIlllll.endOffset)) {
            return lllllllllllllIIlIllllIIlIIIlllll.buf.getInt(lllllllllllllIIlIllllIIlIIIllIll - lllllllllllllIIlIllllIIlIIIlllll.offset);
        }
        if (llIlIlIllIIIIII(this.order(), ByteOrder.BIG_ENDIAN)) {
            return (this._getShort(lllllllllllllIIlIllllIIlIIIllIll) & CompositeByteBuf.lIIllIIIIIlllI[16]) << CompositeByteBuf.lIIllIIIIIlllI[17] | (this._getShort(lllllllllllllIIlIllllIIlIIIllIll + CompositeByteBuf.lIIllIIIIIlllI[3]) & CompositeByteBuf.lIIllIIIIIlllI[16]);
        }
        return (this._getShort(lllllllllllllIIlIllllIIlIIIllIll) & CompositeByteBuf.lIIllIIIIIlllI[16]) | (this._getShort(lllllllllllllIIlIllllIIlIIIllIll + CompositeByteBuf.lIIllIIIIIlllI[3]) & CompositeByteBuf.lIIllIIIIIlllI[16]) << CompositeByteBuf.lIIllIIIIIlllI[17];
    }
    
    @Override
    public CompositeByteBuf writeBytes(final ByteBuf lllllllllllllIIlIlllIIlIIlIIlllI, final int lllllllllllllIIlIlllIIlIIlIIIlll, final int lllllllllllllIIlIlllIIlIIlIIIlIl) {
        return (CompositeByteBuf)super.writeBytes(lllllllllllllIIlIlllIIlIIlIIlllI, lllllllllllllIIlIlllIIlIIlIIIlll, lllllllllllllIIlIlllIIlIIlIIIlIl);
    }
    
    @Override
    public CompositeByteBuf readBytes(final byte[] lllllllllllllIIlIlllIIllIIIIlIlI) {
        return (CompositeByteBuf)super.readBytes(lllllllllllllIIlIlllIIllIIIIlIlI);
    }
    
    private static String llIlIlIlIIlIIIl(String lllllllllllllIIlIllIlllIlIllIIll, final String lllllllllllllIIlIllIlllIlIlIlIlI) {
        lllllllllllllIIlIllIlllIlIllIIll = new String(Base64.getDecoder().decode(lllllllllllllIIlIllIlllIlIllIIll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIIlIllIlllIlIllIIII = new StringBuilder();
        final char[] lllllllllllllIIlIllIlllIlIlIllll = lllllllllllllIIlIllIlllIlIlIlIlI.toCharArray();
        int lllllllllllllIIlIllIlllIlIlIllIl = CompositeByteBuf.lIIllIIIIIlllI[1];
        final short lllllllllllllIIlIllIlllIlIlIIlIl = (Object)lllllllllllllIIlIllIlllIlIllIIll.toCharArray();
        final boolean lllllllllllllIIlIllIlllIlIlIIlII = lllllllllllllIIlIllIlllIlIlIIlIl.length != 0;
        String lllllllllllllIIlIllIlllIlIlIIIll = (String)CompositeByteBuf.lIIllIIIIIlllI[1];
        while (llIlIlIlIlIlIll((int)lllllllllllllIIlIllIlllIlIlIIIll, lllllllllllllIIlIllIlllIlIlIIlII ? 1 : 0)) {
            final char lllllllllllllIIlIllIlllIlIllIlIl = lllllllllllllIIlIllIlllIlIlIIlIl[lllllllllllllIIlIllIlllIlIlIIIll];
            lllllllllllllIIlIllIlllIlIllIIII.append((char)(lllllllllllllIIlIllIlllIlIllIlIl ^ lllllllllllllIIlIllIlllIlIlIllll[lllllllllllllIIlIllIlllIlIlIllIl % lllllllllllllIIlIllIlllIlIlIllll.length]));
            "".length();
            ++lllllllllllllIIlIllIlllIlIlIllIl;
            ++lllllllllllllIIlIllIlllIlIlIIIll;
            "".length();
            if (null != null) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIIlIllIlllIlIllIIII);
    }
    
    private static boolean llIlIlIllIIlIlI(final int lllllllllllllIIlIllIlllIIllIIlII) {
        return lllllllllllllIIlIllIlllIIllIIlII < 0;
    }
    
    @Override
    public CompositeByteBuf getBytes(final int lllllllllllllIIlIlllIIllllIllIIl, final ByteBuf lllllllllllllIIlIlllIIllllIlIIlI) {
        return (CompositeByteBuf)super.getBytes(lllllllllllllIIlIlllIIllllIllIIl, lllllllllllllIIlIlllIIllllIlIIlI);
    }
    
    @Override
    public ByteBuffer[] nioBuffers(int lllllllllllllIIlIlllIlIlIIIIIIll, int lllllllllllllIIlIlllIlIIlllllIlI) {
        this.checkIndex(lllllllllllllIIlIlllIlIlIIIIIIll, lllllllllllllIIlIlllIlIIlllllIlI);
        if (llIlIlIlIlIllII(lllllllllllllIIlIlllIlIIlllllIlI)) {
            return EmptyArrays.EMPTY_BYTE_BUFFERS;
        }
        final List<ByteBuffer> lllllllllllllIIlIlllIlIIllllllll = new ArrayList<ByteBuffer>(this.components.size());
        int lllllllllllllIIlIlllIlIIllllllIl = this.toComponentIndex(lllllllllllllIIlIlllIlIlIIIIIIll);
        while (llIlIlIllIIIIll(lllllllllllllIIlIlllIlIIlllllIlI)) {
            final Component lllllllllllllIIlIlllIlIlIIIIlIll = this.components.get(lllllllllllllIIlIlllIlIIllllllIl);
            final ByteBuf lllllllllllllIIlIlllIlIlIIIIlIIl = lllllllllllllIIlIlllIlIlIIIIlIll.buf;
            final int lllllllllllllIIlIlllIlIlIIIIIlll = lllllllllllllIIlIlllIlIlIIIIlIll.offset;
            final int lllllllllllllIIlIlllIlIlIIIIIlIl = Math.min(lllllllllllllIIlIlllIlIIlllllIlI, lllllllllllllIIlIlllIlIlIIIIlIIl.capacity() - (lllllllllllllIIlIlllIlIlIIIIIIll - lllllllllllllIIlIlllIlIlIIIIIlll));
            switch (lllllllllllllIIlIlllIlIlIIIIlIIl.nioBufferCount()) {
                case 0: {
                    throw new UnsupportedOperationException();
                }
                case 1: {
                    lllllllllllllIIlIlllIlIIllllllll.add(lllllllllllllIIlIlllIlIlIIIIlIIl.nioBuffer(lllllllllllllIIlIlllIlIlIIIIIIll - lllllllllllllIIlIlllIlIlIIIIIlll, lllllllllllllIIlIlllIlIlIIIIIlIl));
                    "".length();
                    "".length();
                    if (" ".length() == 0) {
                        return null;
                    }
                    break;
                }
                default: {
                    Collections.addAll(lllllllllllllIIlIlllIlIIllllllll, lllllllllllllIIlIlllIlIlIIIIlIIl.nioBuffers(lllllllllllllIIlIlllIlIlIIIIIIll - lllllllllllllIIlIlllIlIlIIIIIlll, lllllllllllllIIlIlllIlIlIIIIIlIl));
                    "".length();
                    break;
                }
            }
            lllllllllllllIIlIlllIlIlIIIIIIll += lllllllllllllIIlIlllIlIlIIIIIlIl;
            lllllllllllllIIlIlllIlIIlllllIlI -= lllllllllllllIIlIlllIlIlIIIIIlIl;
            ++lllllllllllllIIlIlllIlIIllllllIl;
            "".length();
            if (null != null) {
                return null;
            }
        }
        return lllllllllllllIIlIlllIlIIllllllll.toArray(new ByteBuffer[lllllllllllllIIlIlllIlIIllllllll.size()]);
    }
    
    @Override
    public CompositeByteBuf writeLong(final long lllllllllllllIIlIlllIIlIlIIlIIII) {
        return (CompositeByteBuf)super.writeLong(lllllllllllllIIlIlllIIlIlIIlIIII);
    }
    
    private static boolean llIlIlIlIlIllII(final int lllllllllllllIIlIllIlllIIllIlIII) {
        return lllllllllllllIIlIllIlllIIllIlIII == 0;
    }
    
    public Iterator<ByteBuf> iterator() {
        this.ensureAccessible();
        final List<ByteBuf> lllllllllllllIIlIllllIlIIIIIIlII = new ArrayList<ByteBuf>(this.components.size());
        final Iterator lllllllllllllIIlIllllIlIIIIIIllI = this.components.iterator();
        while (llIlIlIlIlIllll(lllllllllllllIIlIllllIlIIIIIIllI.hasNext() ? 1 : 0)) {
            final Component lllllllllllllIIlIllllIlIIIIIIlll = lllllllllllllIIlIllllIlIIIIIIllI.next();
            lllllllllllllIIlIllllIlIIIIIIlII.add(lllllllllllllIIlIllllIlIIIIIIlll.buf);
            "".length();
            "".length();
            if (null != null) {
                return null;
            }
        }
        return lllllllllllllIIlIllllIlIIIIIIlII.iterator();
    }
    
    @Override
    public CompositeByteBuf setIndex(final int lllllllllllllIIlIlllIlIIIIIlIIll, final int lllllllllllllIIlIlllIlIIIIIIllII) {
        return (CompositeByteBuf)super.setIndex(lllllllllllllIIlIlllIlIIIIIlIIll, lllllllllllllIIlIlllIlIIIIIIllII);
    }
    
    @Override
    protected void _setByte(final int lllllllllllllIIlIlllIlllllIllIlI, final int lllllllllllllIIlIlllIlllllIllIIl) {
        this.setByte(lllllllllllllIIlIlllIlllllIllIlI, lllllllllllllIIlIlllIlllllIllIIl);
        "".length();
    }
    
    private static boolean llIlIlIllIIIIII(final Object lllllllllllllIIlIllIlllIIlllIIIl, final Object lllllllllllllIIlIllIlllIIlllIIII) {
        return lllllllllllllIIlIllIlllIIlllIIIl == lllllllllllllIIlIllIlllIIlllIIII;
    }
    
    @Override
    public int setBytes(int lllllllllllllIIlIlllIllIIllIIlll, final InputStream lllllllllllllIIlIlllIllIIlllIIII, int lllllllllllllIIlIlllIllIIllIIIll) throws IOException {
        this.checkIndex(lllllllllllllIIlIlllIllIIllIIlll, (int)lllllllllllllIIlIlllIllIIllIIIll);
        if (llIlIlIlIlIllII((int)lllllllllllllIIlIlllIllIIllIIIll)) {
            return lllllllllllllIIlIlllIllIIlllIIII.read(EmptyArrays.EMPTY_BYTES);
        }
        int lllllllllllllIIlIlllIllIIllIllII = this.toComponentIndex(lllllllllllllIIlIlllIllIIllIIlll);
        int lllllllllllllIIlIlllIllIIllIlIlI = CompositeByteBuf.lIIllIIIIIlllI[1];
        do {
            final Component lllllllllllllIIlIlllIllIIllllIlI = this.components.get(lllllllllllllIIlIlllIllIIllIllII);
            final ByteBuf lllllllllllllIIlIlllIllIIllllIIl = lllllllllllllIIlIlllIllIIllllIlI.buf;
            final int lllllllllllllIIlIlllIllIIllllIII = lllllllllllllIIlIlllIllIIllllIlI.offset;
            final int lllllllllllllIIlIlllIllIIlllIlll = Math.min((int)lllllllllllllIIlIlllIllIIllIIIll, lllllllllllllIIlIlllIllIIllllIIl.capacity() - (lllllllllllllIIlIlllIllIIllIIlll - lllllllllllllIIlIlllIllIIllllIII));
            final int lllllllllllllIIlIlllIllIIlllIllI = lllllllllllllIIlIlllIllIIllllIIl.setBytes(lllllllllllllIIlIlllIllIIllIIlll - lllllllllllllIIlIlllIllIIllllIII, lllllllllllllIIlIlllIllIIlllIIII, lllllllllllllIIlIlllIllIIlllIlll);
            if (llIlIlIllIIlIlI(lllllllllllllIIlIlllIllIIlllIllI)) {
                if (llIlIlIlIlIllII(lllllllllllllIIlIlllIllIIllIlIlI)) {
                    return CompositeByteBuf.lIIllIIIIIlllI[19];
                }
                break;
            }
            else if (llIlIlIlIlIllIl(lllllllllllllIIlIlllIllIIlllIllI, lllllllllllllIIlIlllIllIIlllIlll)) {
                lllllllllllllIIlIlllIllIIllIIlll += lllllllllllllIIlIlllIllIIlllIlll;
                lllllllllllllIIlIlllIllIIllIIIll -= lllllllllllllIIlIlllIllIIlllIlll;
                lllllllllllllIIlIlllIllIIllIlIlI += lllllllllllllIIlIlllIllIIlllIlll;
                ++lllllllllllllIIlIlllIllIIllIllII;
                "".length();
                if (-(0x63 ^ 0x67) > 0) {
                    return (0xB4 ^ 0x85) & ~(0x28 ^ 0x19);
                }
                continue;
            }
            else {
                lllllllllllllIIlIlllIllIIllIIlll += lllllllllllllIIlIlllIllIIlllIllI;
                lllllllllllllIIlIlllIllIIllIIIll -= lllllllllllllIIlIlllIllIIlllIllI;
                lllllllllllllIIlIlllIllIIllIlIlI += lllllllllllllIIlIlllIllIIlllIllI;
            }
        } while (!llIlIlIlIlllIII((int)lllllllllllllIIlIlllIllIIllIIIll));
        return lllllllllllllIIlIlllIllIIllIlIlI;
    }
    
    private static final class Component
    {
        final /* synthetic */ int length;
        final /* synthetic */ ByteBuf buf;
        /* synthetic */ int offset;
        /* synthetic */ int endOffset;
        
        Component(final ByteBuf lllllllllllllIIllIlIIllIIllIlIIl) {
            this.buf = lllllllllllllIIllIlIIllIIllIlIIl;
            this.length = lllllllllllllIIllIlIIllIIllIlIIl.readableBytes();
        }
        
        void freeIfNecessary() {
            this.buf.release();
            "".length();
        }
    }
}
