// 
// Decompiled by Procyon v0.5.36
// 

package io.netty.handler.codec.http;

import java.util.NoSuchElementException;
import java.util.Calendar;
import java.util.Date;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.security.MessageDigest;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.Arrays;
import java.util.Map;
import java.util.Iterator;
import io.netty.buffer.ByteBuf;
import java.util.LinkedList;
import java.util.List;
import java.nio.charset.StandardCharsets;
import java.util.Base64;

public class DefaultHttpHeaders extends HttpHeaders
{
    private final /* synthetic */ HeaderEntry[] entries;
    private static final /* synthetic */ String[] llIIlIIIIIIIII;
    private static final /* synthetic */ int[] llIIlIIIIIIIlI;
    protected final /* synthetic */ boolean validate;
    private final /* synthetic */ HeaderEntry head;
    
    @Override
    public HttpHeaders remove(final String llllllllllllIlllIIlllIIlIlllIllI) {
        return this.remove((CharSequence)llllllllllllIlllIIlllIIlIlllIllI);
    }
    
    private static String lIIIlIllIlllIIIl(String llllllllllllIlllIIlllIIIIllllIII, final String llllllllllllIlllIIlllIIIIlllllII) {
        llllllllllllIlllIIlllIIIIllllIII = new String(Base64.getDecoder().decode(llllllllllllIlllIIlllIIIIllllIII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder llllllllllllIlllIIlllIIIIllllIll = new StringBuilder();
        final char[] llllllllllllIlllIIlllIIIIllllIlI = llllllllllllIlllIIlllIIIIlllllII.toCharArray();
        int llllllllllllIlllIIlllIIIIllllIIl = DefaultHttpHeaders.llIIlIIIIIIIlI[2];
        final double llllllllllllIlllIIlllIIIIlllIIll = (Object)llllllllllllIlllIIlllIIIIllllIII.toCharArray();
        final long llllllllllllIlllIIlllIIIIlllIIlI = llllllllllllIlllIIlllIIIIlllIIll.length;
        int llllllllllllIlllIIlllIIIIlllIIIl = DefaultHttpHeaders.llIIlIIIIIIIlI[2];
        while (lIIIlIllIllllllI(llllllllllllIlllIIlllIIIIlllIIIl, (int)llllllllllllIlllIIlllIIIIlllIIlI)) {
            final char llllllllllllIlllIIlllIIIIllllllI = llllllllllllIlllIIlllIIIIlllIIll[llllllllllllIlllIIlllIIIIlllIIIl];
            llllllllllllIlllIIlllIIIIllllIll.append((char)(llllllllllllIlllIIlllIIIIllllllI ^ llllllllllllIlllIIlllIIIIllllIlI[llllllllllllIlllIIlllIIIIllllIIl % llllllllllllIlllIIlllIIIIllllIlI.length]));
            "".length();
            ++llllllllllllIlllIIlllIIIIllllIIl;
            ++llllllllllllIlllIIlllIIIIlllIIIl;
            "".length();
            if ((0xAE ^ 0xAB) == 0x0) {
                return null;
            }
        }
        return String.valueOf(llllllllllllIlllIIlllIIIIllllIll);
    }
    
    @Override
    public List<String> getAll(final CharSequence llllllllllllIlllIIlllIIIlllIIllI) {
        if (lIIIlIllIllllIlI(llllllllllllIlllIIlllIIIlllIIllI)) {
            throw new NullPointerException(DefaultHttpHeaders.llIIlIIIIIIIII[DefaultHttpHeaders.llIIlIIIIIIIlI[4]]);
        }
        final LinkedList<String> llllllllllllIlllIIlllIIIlllIIlIl = new LinkedList<String>();
        final int llllllllllllIlllIIlllIIIlllIIlII = HttpHeaders.hash(llllllllllllIlllIIlllIIIlllIIllI);
        final int llllllllllllIlllIIlllIIIlllIIIll = index(llllllllllllIlllIIlllIIIlllIIlII);
        HeaderEntry llllllllllllIlllIIlllIIIlllIIIlI = this.entries[llllllllllllIlllIIlllIIIlllIIIll];
        while (lIIIlIllIlllllII(llllllllllllIlllIIlllIIIlllIIIlI)) {
            if (lIIIlIllIllllIll(llllllllllllIlllIIlllIIIlllIIIlI.hash, llllllllllllIlllIIlllIIIlllIIlII) && lIIIlIllIllllIII(HttpHeaders.equalsIgnoreCase(llllllllllllIlllIIlllIIIlllIIllI, llllllllllllIlllIIlllIIIlllIIIlI.key) ? 1 : 0)) {
                llllllllllllIlllIIlllIIIlllIIlIl.addFirst(llllllllllllIlllIIlllIIIlllIIIlI.getValue());
            }
            llllllllllllIlllIIlllIIIlllIIIlI = llllllllllllIlllIIlllIIIlllIIIlI.next;
            "".length();
            if (null != null) {
                return null;
            }
        }
        return llllllllllllIlllIIlllIIIlllIIlIl;
    }
    
    void encode(final ByteBuf llllllllllllIlllIIlllIIIlIIIllll) {
        HeaderEntry llllllllllllIlllIIlllIIIlIIIlllI = this.head.after;
        while (lIIIlIllIllllIIl(llllllllllllIlllIIlllIIIlIIIlllI, this.head)) {
            llllllllllllIlllIIlllIIIlIIIlllI.encode(llllllllllllIlllIIlllIIIlIIIllll);
            llllllllllllIlllIIlllIIIlIIIlllI = llllllllllllIlllIIlllIIIlIIIlllI.after;
            "".length();
            if ("   ".length() < ((0x80 ^ 0xC4) & ~(0x24 ^ 0x60))) {
                return;
            }
        }
    }
    
    @Override
    public HttpHeaders set(final CharSequence llllllllllllIlllIIlllIIlIIIlIlIl, final Iterable<?> llllllllllllIlllIIlllIIlIIIlIlII) {
        if (lIIIlIllIllllIlI(llllllllllllIlllIIlllIIlIIIlIlII)) {
            throw new NullPointerException(DefaultHttpHeaders.llIIlIIIIIIIII[DefaultHttpHeaders.llIIlIIIIIIIlI[1]]);
        }
        if (lIIIlIllIllllIII(this.validate ? 1 : 0)) {
            this.validateHeaderName0(llllllllllllIlllIIlllIIlIIIlIlIl);
        }
        final int llllllllllllIlllIIlllIIlIIIllIII = HttpHeaders.hash(llllllllllllIlllIIlllIIlIIIlIlIl);
        final int llllllllllllIlllIIlllIIlIIIlIlll = index(llllllllllllIlllIIlllIIlIIIllIII);
        this.remove0(llllllllllllIlllIIlllIIlIIIllIII, llllllllllllIlllIIlllIIlIIIlIlll, llllllllllllIlllIIlllIIlIIIlIlIl);
        final Iterator llllllllllllIlllIIlllIIlIIIlllII = llllllllllllIlllIIlllIIlIIIlIlII.iterator();
        while (lIIIlIllIllllIII(llllllllllllIlllIIlllIIlIIIlllII.hasNext() ? 1 : 0)) {
            final Object llllllllllllIlllIIlllIIlIIIlllIl = llllllllllllIlllIIlllIIlIIIlllII.next();
            if (lIIIlIllIllllIlI(llllllllllllIlllIIlllIIlIIIlllIl)) {
                "".length();
                if (" ".length() == -" ".length()) {
                    return null;
                }
                break;
            }
            else {
                final CharSequence llllllllllllIlllIIlllIIlIIIllllI = toCharSequence(llllllllllllIlllIIlllIIlIIIlllIl);
                if (lIIIlIllIllllIII(this.validate ? 1 : 0)) {
                    HttpHeaders.validateHeaderValue(llllllllllllIlllIIlllIIlIIIllllI);
                }
                this.add0(llllllllllllIlllIIlllIIlIIIllIII, llllllllllllIlllIIlllIIlIIIlIlll, llllllllllllIlllIIlllIIlIIIlIlIl, llllllllllllIlllIIlllIIlIIIllllI);
                "".length();
                if (-"   ".length() > 0) {
                    return null;
                }
                continue;
            }
        }
        return this;
    }
    
    @Override
    public HttpHeaders add(final CharSequence llllllllllllIlllIIlllIIllIIlIlll, final Iterable<?> llllllllllllIlllIIlllIIllIIlIllI) {
        if (lIIIlIllIllllIII(this.validate ? 1 : 0)) {
            this.validateHeaderName0(llllllllllllIlllIIlllIIllIIlIlll);
        }
        final int llllllllllllIlllIIlllIIllIIllIlI = HttpHeaders.hash(llllllllllllIlllIIlllIIllIIlIlll);
        final int llllllllllllIlllIIlllIIllIIllIIl = index(llllllllllllIlllIIlllIIllIIllIlI);
        final Iterator llllllllllllIlllIIlllIIllIIllllI = llllllllllllIlllIIlllIIllIIlIllI.iterator();
        while (lIIIlIllIllllIII(llllllllllllIlllIIlllIIllIIllllI.hasNext() ? 1 : 0)) {
            final Object llllllllllllIlllIIlllIIllIIlllll = llllllllllllIlllIIlllIIllIIllllI.next();
            final CharSequence llllllllllllIlllIIlllIIllIlIIIII = toCharSequence(llllllllllllIlllIIlllIIllIIlllll);
            if (lIIIlIllIllllIII(this.validate ? 1 : 0)) {
                HttpHeaders.validateHeaderValue(llllllllllllIlllIIlllIIllIlIIIII);
            }
            this.add0(llllllllllllIlllIIlllIIllIIllIlI, llllllllllllIlllIIlllIIllIIllIIl, llllllllllllIlllIIlllIIllIIlIlll, llllllllllllIlllIIlllIIllIlIIIII);
            "".length();
            if (" ".length() == 0) {
                return null;
            }
        }
        return this;
    }
    
    @Override
    public HttpHeaders set(final HttpHeaders llllllllllllIlllIIlllIIlllIlIIlI) {
        if (lIIIlIllIllllIII((llllllllllllIlllIIlllIIlllIlIIlI instanceof DefaultHttpHeaders) ? 1 : 0)) {
            this.clear();
            "".length();
            final DefaultHttpHeaders llllllllllllIlllIIlllIIlllIlIlIl = (DefaultHttpHeaders)llllllllllllIlllIIlllIIlllIlIIlI;
            HeaderEntry llllllllllllIlllIIlllIIlllIlIlII = llllllllllllIlllIIlllIIlllIlIlIl.head.after;
            while (lIIIlIllIllllIIl(llllllllllllIlllIIlllIIlllIlIlII, llllllllllllIlllIIlllIIlllIlIlIl.head)) {
                this.add(llllllllllllIlllIIlllIIlllIlIlII.key, llllllllllllIlllIIlllIIlllIlIlII.value);
                "".length();
                llllllllllllIlllIIlllIIlllIlIlII = llllllllllllIlllIIlllIIlllIlIlII.after;
                "".length();
                if (-" ".length() == " ".length()) {
                    return null;
                }
            }
            return this;
        }
        return super.set(llllllllllllIlllIIlllIIlllIlIIlI);
    }
    
    private static void lIIIlIllIlllIlll() {
        (llIIlIIIIIIIlI = new int[8])[0] = (0x10 ^ 0x16 ^ (0xB4 ^ 0xA3));
        DefaultHttpHeaders.llIIlIIIIIIIlI[1] = " ".length();
        DefaultHttpHeaders.llIIlIIIIIIIlI[2] = ((0xAC ^ 0x88 ^ (0x9 ^ 0x1D)) & (71 + 120 - 66 + 12 ^ 170 + 48 - 194 + 161 ^ -" ".length()));
        DefaultHttpHeaders.llIIlIIIIIIIlI[3] = "  ".length();
        DefaultHttpHeaders.llIIlIIIIIIIlI[4] = "   ".length();
        DefaultHttpHeaders.llIIlIIIIIIIlI[5] = (0x57 ^ 0x53);
        DefaultHttpHeaders.llIIlIIIIIIIlI[6] = (0x5E ^ 0x5B);
        DefaultHttpHeaders.llIIlIIIIIIIlI[7] = (0x59 ^ 0x51);
    }
    
    @Override
    public List<Map.Entry<String, String>> entries() {
        final List<Map.Entry<String, String>> llllllllllllIlllIIlllIIIllIlIlll = new LinkedList<Map.Entry<String, String>>();
        HeaderEntry llllllllllllIlllIIlllIIIllIlIllI = this.head.after;
        while (lIIIlIllIllllIIl(llllllllllllIlllIIlllIIIllIlIllI, this.head)) {
            llllllllllllIlllIIlllIIIllIlIlll.add(llllllllllllIlllIIlllIIIllIlIllI);
            "".length();
            llllllllllllIlllIIlllIIIllIlIllI = llllllllllllIlllIIlllIIIllIlIllI.after;
            "".length();
            if ((0x4A ^ 0x52 ^ (0xAA ^ 0xB7)) <= 0) {
                return null;
            }
        }
        return llllllllllllIlllIIlllIIIllIlIlll;
    }
    
    @Override
    public HttpHeaders remove(final CharSequence llllllllllllIlllIIlllIIlIlllIIII) {
        if (lIIIlIllIllllIlI(llllllllllllIlllIIlllIIlIlllIIII)) {
            throw new NullPointerException(DefaultHttpHeaders.llIIlIIIIIIIII[DefaultHttpHeaders.llIIlIIIIIIIlI[2]]);
        }
        final int llllllllllllIlllIIlllIIlIllIllll = HttpHeaders.hash(llllllllllllIlllIIlllIIlIlllIIII);
        final int llllllllllllIlllIIlllIIlIllIlllI = index(llllllllllllIlllIIlllIIlIllIllll);
        this.remove0(llllllllllllIlllIIlllIIlIllIllll, llllllllllllIlllIIlllIIlIllIlllI, llllllllllllIlllIIlllIIlIlllIIII);
        return this;
    }
    
    @Override
    public boolean contains(final CharSequence llllllllllllIlllIIlllIIIlIlIIlIl, final CharSequence llllllllllllIlllIIlllIIIlIlIlIll, final boolean llllllllllllIlllIIlllIIIlIlIIIll) {
        if (lIIIlIllIllllIlI(llllllllllllIlllIIlllIIIlIlIIlIl)) {
            throw new NullPointerException(DefaultHttpHeaders.llIIlIIIIIIIII[DefaultHttpHeaders.llIIlIIIIIIIlI[5]]);
        }
        final int llllllllllllIlllIIlllIIIlIlIlIIl = HttpHeaders.hash(llllllllllllIlllIIlllIIIlIlIIlIl);
        final int llllllllllllIlllIIlllIIIlIlIlIII = index(llllllllllllIlllIIlllIIIlIlIlIIl);
        HeaderEntry llllllllllllIlllIIlllIIIlIlIIlll = this.entries[llllllllllllIlllIIlllIIIlIlIlIII];
        while (lIIIlIllIlllllII(llllllllllllIlllIIlllIIIlIlIIlll)) {
            if (lIIIlIllIllllIll(llllllllllllIlllIIlllIIIlIlIIlll.hash, llllllllllllIlllIIlllIIIlIlIlIIl) && lIIIlIllIllllIII(HttpHeaders.equalsIgnoreCase(llllllllllllIlllIIlllIIIlIlIIlIl, llllllllllllIlllIIlllIIIlIlIIlll.key) ? 1 : 0)) {
                if (lIIIlIllIllllIII(llllllllllllIlllIIlllIIIlIlIIIll ? 1 : 0)) {
                    if (lIIIlIllIllllIII(HttpHeaders.equalsIgnoreCase(llllllllllllIlllIIlllIIIlIlIIlll.value, llllllllllllIlllIIlllIIIlIlIlIll) ? 1 : 0)) {
                        return DefaultHttpHeaders.llIIlIIIIIIIlI[1] != 0;
                    }
                }
                else if (lIIIlIllIllllIII(llllllllllllIlllIIlllIIIlIlIIlll.value.equals(llllllllllllIlllIIlllIIIlIlIlIll) ? 1 : 0)) {
                    return DefaultHttpHeaders.llIIlIIIIIIIlI[1] != 0;
                }
            }
            llllllllllllIlllIIlllIIIlIlIIlll = llllllllllllIlllIIlllIIIlIlIIlll.next;
            "".length();
            if (-" ".length() >= " ".length()) {
                return ((0xFB ^ 0xC1 ^ (0x7E ^ 0x8)) & (0x37 ^ 0x3E ^ (0xDB ^ 0x9E) ^ -" ".length())) != 0x0;
            }
        }
        return DefaultHttpHeaders.llIIlIIIIIIIlI[2] != 0;
    }
    
    @Override
    public HttpHeaders add(final String llllllllllllIlllIIlllIIlllIIlIIl, final Object llllllllllllIlllIIlllIIlllIIIlIl) {
        return this.add((CharSequence)llllllllllllIlllIIlllIIlllIIlIIl, llllllllllllIlllIIlllIIlllIIIlIl);
    }
    
    @Override
    public HttpHeaders clear() {
        Arrays.fill(this.entries, null);
        final HeaderEntry head = this.head;
        final HeaderEntry head2 = this.head;
        final HeaderEntry head3 = this.head;
        head2.after = head3;
        head.before = head3;
        return this;
    }
    
    @Override
    public boolean contains(final String llllllllllllIlllIIlllIIIllIIlIlI) {
        int n;
        if (lIIIlIllIlllllII(this.get(llllllllllllIlllIIlllIIIllIIlIlI))) {
            n = DefaultHttpHeaders.llIIlIIIIIIIlI[1];
            "".length();
            if ((" ".length() & ~" ".length()) <= -" ".length()) {
                return ((0x64 ^ 0x4) & ~(0x2C ^ 0x4C)) != 0x0;
            }
        }
        else {
            n = DefaultHttpHeaders.llIIlIIIIIIIlI[2];
        }
        return n != 0;
    }
    
    private static boolean lIIIlIllIlllllII(final Object llllllllllllIlllIIlllIIIIlIlIlIl) {
        return llllllllllllIlllIIlllIIIIlIlIlIl != null;
    }
    
    private void remove0(final int llllllllllllIlllIIlllIIlIlIllIll, final int llllllllllllIlllIIlllIIlIlIllIlI, final CharSequence llllllllllllIlllIIlllIIlIlIllllI) {
        HeaderEntry llllllllllllIlllIIlllIIlIlIlllIl = this.entries[llllllllllllIlllIIlllIIlIlIllIlI];
        if (lIIIlIllIllllIlI(llllllllllllIlllIIlllIIlIlIlllIl)) {
            return;
        }
        while (lIIIlIllIllllIll(llllllllllllIlllIIlllIIlIlIlllIl.hash, llllllllllllIlllIIlllIIlIlIllIll) && lIIIlIllIllllIII(HttpHeaders.equalsIgnoreCase(llllllllllllIlllIIlllIIlIlIllllI, llllllllllllIlllIIlllIIlIlIlllIl.key) ? 1 : 0)) {
            llllllllllllIlllIIlllIIlIlIlllIl.remove();
            final HeaderEntry llllllllllllIlllIIlllIIlIllIIIll = llllllllllllIlllIIlllIIlIlIlllIl.next;
            if (!lIIIlIllIlllllII(llllllllllllIlllIIlllIIlIllIIIll)) {
                this.entries[llllllllllllIlllIIlllIIlIlIllIlI] = null;
                return;
            }
            this.entries[llllllllllllIlllIIlllIIlIlIllIlI] = llllllllllllIlllIIlllIIlIllIIIll;
            llllllllllllIlllIIlllIIlIlIlllIl = llllllllllllIlllIIlllIIlIllIIIll;
            "".length();
            if (null != null) {
                return;
            }
            "".length();
            if ("   ".length() > "   ".length()) {
                return;
            }
        }
        do {
            final HeaderEntry llllllllllllIlllIIlllIIlIllIIIlI = llllllllllllIlllIIlllIIlIlIlllIl.next;
            if (lIIIlIllIllllIlI(llllllllllllIlllIIlllIIlIllIIIlI)) {
                "".length();
                if (-" ".length() > 0) {
                    return;
                }
            }
            else {
                if (lIIIlIllIllllIll(llllllllllllIlllIIlllIIlIllIIIlI.hash, llllllllllllIlllIIlllIIlIlIllIll) && lIIIlIllIllllIII(HttpHeaders.equalsIgnoreCase(llllllllllllIlllIIlllIIlIlIllllI, llllllllllllIlllIIlllIIlIllIIIlI.key) ? 1 : 0)) {
                    llllllllllllIlllIIlllIIlIlIlllIl.next = llllllllllllIlllIIlllIIlIllIIIlI.next;
                    llllllllllllIlllIIlllIIlIllIIIlI.remove();
                    "".length();
                    if (-"  ".length() >= 0) {
                        return;
                    }
                }
                else {
                    llllllllllllIlllIIlllIIlIlIlllIl = llllllllllllIlllIIlllIIlIllIIIlI;
                }
                "".length();
            }
        } while (null == null);
    }
    
    public DefaultHttpHeaders(final boolean llllllllllllIlllIIlllIIllllIlIlI) {
        this.entries = new HeaderEntry[DefaultHttpHeaders.llIIlIIIIIIIlI[0]];
        this.head = new HeaderEntry();
        this.validate = llllllllllllIlllIIlllIIllllIlIlI;
        final HeaderEntry head = this.head;
        final HeaderEntry head2 = this.head;
        final HeaderEntry head3 = this.head;
        head2.after = head3;
        head.before = head3;
    }
    
    @Override
    public Set<String> names() {
        final Set<String> llllllllllllIlllIIlllIIIlIIllIll = new LinkedHashSet<String>();
        HeaderEntry llllllllllllIlllIIlllIIIlIIllIlI = this.head.after;
        while (lIIIlIllIllllIIl(llllllllllllIlllIIlllIIIlIIllIlI, this.head)) {
            llllllllllllIlllIIlllIIIlIIllIll.add(llllllllllllIlllIIlllIIIlIIllIlI.getKey());
            "".length();
            llllllllllllIlllIIlllIIIlIIllIlI = llllllllllllIlllIIlllIIIlIIllIlI.after;
            "".length();
            if (" ".length() > (0x35 ^ 0x31)) {
                return null;
            }
        }
        return llllllllllllIlllIIlllIIIlIIllIll;
    }
    
    private static void lIIIlIllIlllIIll() {
        (llIIlIIIIIIIII = new String[DefaultHttpHeaders.llIIlIIIIIIIlI[6]])[DefaultHttpHeaders.llIIlIIIIIIIlI[2]] = lIIIlIllIlllIIIl("CycLJg==", "eFfCG");
        DefaultHttpHeaders.llIIlIIIIIIIII[DefaultHttpHeaders.llIIlIIIIIIIlI[1]] = lIIIlIllIlllIIIl("BTEjLTcA", "sPOXR");
        DefaultHttpHeaders.llIIlIIIIIIIII[DefaultHttpHeaders.llIIlIIIIIIIlI[3]] = lIIIlIllIlllIIlI("i/Iqs+x42NY=", "eDFYC");
        DefaultHttpHeaders.llIIlIIIIIIIII[DefaultHttpHeaders.llIIlIIIIIIIlI[4]] = lIIIlIllIlllIIlI("jbs4R51dRFg=", "FjZFL");
        DefaultHttpHeaders.llIIlIIIIIIIII[DefaultHttpHeaders.llIIlIIIIIIIlI[5]] = lIIIlIllIlllIIlI("3Qv/HNqgklg=", "PRXMZ");
    }
    
    @Override
    public HttpHeaders add(final HttpHeaders llllllllllllIlllIIlllIIlllIllllI) {
        if (lIIIlIllIllllIII((llllllllllllIlllIIlllIIlllIllllI instanceof DefaultHttpHeaders) ? 1 : 0)) {
            final DefaultHttpHeaders llllllllllllIlllIIlllIIllllIIIIl = (DefaultHttpHeaders)llllllllllllIlllIIlllIIlllIllllI;
            HeaderEntry llllllllllllIlllIIlllIIllllIIIII = llllllllllllIlllIIlllIIllllIIIIl.head.after;
            while (lIIIlIllIllllIIl(llllllllllllIlllIIlllIIllllIIIII, llllllllllllIlllIIlllIIllllIIIIl.head)) {
                this.add(llllllllllllIlllIIlllIIllllIIIII.key, llllllllllllIlllIIlllIIllllIIIII.value);
                "".length();
                llllllllllllIlllIIlllIIllllIIIII = llllllllllllIlllIIlllIIllllIIIII.after;
                "".length();
                if (" ".length() >= "   ".length()) {
                    return null;
                }
            }
            return this;
        }
        return super.add(llllllllllllIlllIIlllIIlllIllllI);
    }
    
    @Override
    public boolean contains(final CharSequence llllllllllllIlllIIlllIIIllIIIlII) {
        int n;
        if (lIIIlIllIlllllII(this.get(llllllllllllIlllIIlllIIIllIIIlII))) {
            n = DefaultHttpHeaders.llIIlIIIIIIIlI[1];
            "".length();
            if (((198 + 138 - 249 + 124 ^ 80 + 30 - 48 + 70) & (0x55 ^ 0x3F ^ (0x94 ^ 0xA9) ^ -" ".length())) >= (0x9C ^ 0xB2 ^ (0x86 ^ 0xAC))) {
                return ((("  ".length() & ~"  ".length()) ^ (0x7 ^ 0x3C)) & (0x72 ^ 0x2F ^ (0x2E ^ 0x48) ^ -" ".length())) != 0x0;
            }
        }
        else {
            n = DefaultHttpHeaders.llIIlIIIIIIIlI[2];
        }
        return n != 0;
    }
    
    private static String lIIIlIllIlllIIlI(final String llllllllllllIlllIIlllIIIIllIlIII, final String llllllllllllIlllIIlllIIIIllIIlll) {
        try {
            final SecretKeySpec llllllllllllIlllIIlllIIIIllIlIll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIlllIIlllIIIIllIIlll.getBytes(StandardCharsets.UTF_8)), DefaultHttpHeaders.llIIlIIIIIIIlI[7]), "DES");
            final Cipher llllllllllllIlllIIlllIIIIllIlIlI = Cipher.getInstance("DES");
            llllllllllllIlllIIlllIIIIllIlIlI.init(DefaultHttpHeaders.llIIlIIIIIIIlI[3], llllllllllllIlllIIlllIIIIllIlIll);
            return new String(llllllllllllIlllIIlllIIIIllIlIlI.doFinal(Base64.getDecoder().decode(llllllllllllIlllIIlllIIIIllIlIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIlllIIlllIIIIllIlIIl) {
            llllllllllllIlllIIlllIIIIllIlIIl.printStackTrace();
            return null;
        }
    }
    
    @Override
    public Iterator<Map.Entry<String, String>> iterator() {
        return new HeaderIterator();
    }
    
    private static CharSequence toCharSequence(final Object llllllllllllIlllIIlllIIIlIIlIlIl) {
        if (lIIIlIllIllllIlI(llllllllllllIlllIIlllIIIlIIlIlIl)) {
            return null;
        }
        if (lIIIlIllIllllIII((llllllllllllIlllIIlllIIIlIIlIlIl instanceof CharSequence) ? 1 : 0)) {
            return (CharSequence)llllllllllllIlllIIlllIIIlIIlIlIl;
        }
        if (lIIIlIllIllllIII((llllllllllllIlllIIlllIIIlIIlIlIl instanceof Number) ? 1 : 0)) {
            return llllllllllllIlllIIlllIIIlIIlIlIl.toString();
        }
        if (lIIIlIllIllllIII((llllllllllllIlllIIlllIIIlIIlIlIl instanceof Date) ? 1 : 0)) {
            return HttpHeaderDateFormat.get().format((Date)llllllllllllIlllIIlllIIIlIIlIlIl);
        }
        if (lIIIlIllIllllIII((llllllllllllIlllIIlllIIIlIIlIlIl instanceof Calendar) ? 1 : 0)) {
            return HttpHeaderDateFormat.get().format(((Calendar)llllllllllllIlllIIlllIIIlIIlIlIl).getTime());
        }
        return llllllllllllIlllIIlllIIIlIIlIlIl.toString();
    }
    
    @Override
    public HttpHeaders add(final CharSequence llllllllllllIlllIIlllIIllIllIllI, final Object llllllllllllIlllIIlllIIllIlllIll) {
        CharSequence llllllllllllIlllIIlllIIllIlllIlI;
        if (lIIIlIllIllllIII(this.validate ? 1 : 0)) {
            this.validateHeaderName0(llllllllllllIlllIIlllIIllIllIllI);
            final CharSequence llllllllllllIlllIIlllIIllIlllllI = toCharSequence(llllllllllllIlllIIlllIIllIlllIll);
            HttpHeaders.validateHeaderValue(llllllllllllIlllIIlllIIllIlllllI);
            "".length();
            if ((130 + 26 - 32 + 19 ^ 103 + 130 - 194 + 99) == 0x0) {
                return null;
            }
        }
        else {
            llllllllllllIlllIIlllIIllIlllIlI = toCharSequence(llllllllllllIlllIIlllIIllIlllIll);
        }
        final int llllllllllllIlllIIlllIIllIlllIIl = HttpHeaders.hash(llllllllllllIlllIIlllIIllIllIllI);
        final int llllllllllllIlllIIlllIIllIlllIII = index(llllllllllllIlllIIlllIIllIlllIIl);
        this.add0(llllllllllllIlllIIlllIIllIlllIIl, llllllllllllIlllIIlllIIllIlllIII, llllllllllllIlllIIlllIIllIllIllI, llllllllllllIlllIIlllIIllIlllIlI);
        return this;
    }
    
    private static boolean lIIIlIllIllllIII(final int llllllllllllIlllIIlllIIIIlIIllIl) {
        return llllllllllllIlllIIlllIIIIlIIllIl != 0;
    }
    
    void validateHeaderName0(final CharSequence llllllllllllIlllIIlllIIllllIIlll) {
        HttpHeaders.validateHeaderName(llllllllllllIlllIIlllIIllllIIlll);
    }
    
    private void add0(final int llllllllllllIlllIIlllIIllIIIlIII, final int llllllllllllIlllIIlllIIllIIIIIII, final CharSequence llllllllllllIlllIIlllIIllIIIIllI, final CharSequence llllllllllllIlllIIlllIIllIIIIlIl) {
        final HeaderEntry llllllllllllIlllIIlllIIllIIIIlII = this.entries[llllllllllllIlllIIlllIIllIIIIIII];
        final HeaderEntry llllllllllllIlllIIlllIIllIIIIIll = this.entries[llllllllllllIlllIIlllIIllIIIIIII] = new HeaderEntry(llllllllllllIlllIIlllIIllIIIlIII, llllllllllllIlllIIlllIIllIIIIllI, llllllllllllIlllIIlllIIllIIIIlIl);
        llllllllllllIlllIIlllIIllIIIIIll.next = llllllllllllIlllIIlllIIllIIIIlII;
        llllllllllllIlllIIlllIIllIIIIIll.addBefore(this.head);
    }
    
    @Override
    public HttpHeaders add(final String llllllllllllIlllIIlllIIllIlIlIlI, final Iterable<?> llllllllllllIlllIIlllIIllIlIlIIl) {
        return this.add((CharSequence)llllllllllllIlllIIlllIIllIlIlIlI, llllllllllllIlllIIlllIIllIlIlIIl);
    }
    
    private static boolean lIIIlIllIllllIll(final int llllllllllllIlllIIlllIIIIllIIIII, final int llllllllllllIlllIIlllIIIIlIlllll) {
        return llllllllllllIlllIIlllIIIIllIIIII == llllllllllllIlllIIlllIIIIlIlllll;
    }
    
    private static int index(final int llllllllllllIlllIIlllIIlllllIIll) {
        return llllllllllllIlllIIlllIIlllllIIll % DefaultHttpHeaders.llIIlIIIIIIIlI[0];
    }
    
    @Override
    public boolean contains(final String llllllllllllIlllIIlllIIIlIllIlll, final String llllllllllllIlllIIlllIIIlIlllIlI, final boolean llllllllllllIlllIIlllIIIlIlllIIl) {
        return this.contains(llllllllllllIlllIIlllIIIlIllIlll, (CharSequence)llllllllllllIlllIIlllIIIlIlllIlI, llllllllllllIlllIIlllIIIlIlllIIl);
    }
    
    public DefaultHttpHeaders() {
        this((boolean)(DefaultHttpHeaders.llIIlIIIIIIIlI[1] != 0));
    }
    
    private static boolean lIIIlIllIllllIIl(final Object llllllllllllIlllIIlllIIIIlIllIII, final Object llllllllllllIlllIIlllIIIIlIlIlll) {
        return llllllllllllIlllIIlllIIIIlIllIII != llllllllllllIlllIIlllIIIIlIlIlll;
    }
    
    @Override
    public String get(final CharSequence llllllllllllIlllIIlllIIIlllllIII) {
        if (lIIIlIllIllllIlI(llllllllllllIlllIIlllIIIlllllIII)) {
            throw new NullPointerException(DefaultHttpHeaders.llIIlIIIIIIIII[DefaultHttpHeaders.llIIlIIIIIIIlI[3]]);
        }
        final int llllllllllllIlllIIlllIIIllllllIl = HttpHeaders.hash(llllllllllllIlllIIlllIIIlllllIII);
        final int llllllllllllIlllIIlllIIIllllllII = index(llllllllllllIlllIIlllIIIllllllIl);
        HeaderEntry llllllllllllIlllIIlllIIIlllllIll = this.entries[llllllllllllIlllIIlllIIIllllllII];
        CharSequence llllllllllllIlllIIlllIIIlllllIlI = null;
        while (lIIIlIllIlllllII(llllllllllllIlllIIlllIIIlllllIll)) {
            if (lIIIlIllIllllIll(llllllllllllIlllIIlllIIIlllllIll.hash, llllllllllllIlllIIlllIIIllllllIl) && lIIIlIllIllllIII(HttpHeaders.equalsIgnoreCase(llllllllllllIlllIIlllIIIlllllIII, llllllllllllIlllIIlllIIIlllllIll.key) ? 1 : 0)) {
                llllllllllllIlllIIlllIIIlllllIlI = llllllllllllIlllIIlllIIIlllllIll.value;
            }
            llllllllllllIlllIIlllIIIlllllIll = llllllllllllIlllIIlllIIIlllllIll.next;
            "".length();
            if ((91 + 38 - 62 + 91 ^ 90 + 8 + 10 + 46) != (0x3F ^ 0x55 ^ (0xFD ^ 0x93))) {
                return null;
            }
        }
        if (lIIIlIllIllllIlI(llllllllllllIlllIIlllIIIlllllIlI)) {
            return null;
        }
        return llllllllllllIlllIIlllIIIlllllIlI.toString();
    }
    
    @Override
    public HttpHeaders set(final CharSequence llllllllllllIlllIIlllIIlIIllIlII, final Object llllllllllllIlllIIlllIIlIIllIIll) {
        CharSequence llllllllllllIlllIIlllIIlIIlllIII;
        if (lIIIlIllIllllIII(this.validate ? 1 : 0)) {
            this.validateHeaderName0(llllllllllllIlllIIlllIIlIIllIlII);
            final CharSequence llllllllllllIlllIIlllIIlIIllllII = toCharSequence(llllllllllllIlllIIlllIIlIIllIIll);
            HttpHeaders.validateHeaderValue(llllllllllllIlllIIlllIIlIIllllII);
            "".length();
            if (null != null) {
                return null;
            }
        }
        else {
            llllllllllllIlllIIlllIIlIIlllIII = toCharSequence(llllllllllllIlllIIlllIIlIIllIIll);
        }
        final int llllllllllllIlllIIlllIIlIIllIlll = HttpHeaders.hash(llllllllllllIlllIIlllIIlIIllIlII);
        final int llllllllllllIlllIIlllIIlIIllIllI = index(llllllllllllIlllIIlllIIlIIllIlll);
        this.remove0(llllllllllllIlllIIlllIIlIIllIlll, llllllllllllIlllIIlllIIlIIllIllI, llllllllllllIlllIIlllIIlIIllIlII);
        this.add0(llllllllllllIlllIIlllIIlIIllIlll, llllllllllllIlllIIlllIIlIIllIllI, llllllllllllIlllIIlllIIlIIllIlII, llllllllllllIlllIIlllIIlIIlllIII);
        return this;
    }
    
    @Override
    public HttpHeaders set(final String llllllllllllIlllIIlllIIlIlIIllIl, final Object llllllllllllIlllIIlllIIlIlIIlIII) {
        return this.set((CharSequence)llllllllllllIlllIIlllIIlIlIIllIl, llllllllllllIlllIIlllIIlIlIIlIII);
    }
    
    private static boolean lIIIlIllIllllIlI(final Object llllllllllllIlllIIlllIIIIlIIllll) {
        return llllllllllllIlllIIlllIIIIlIIllll == null;
    }
    
    static {
        lIIIlIllIlllIlll();
        lIIIlIllIlllIIll();
        BUCKET_SIZE = DefaultHttpHeaders.llIIlIIIIIIIlI[0];
    }
    
    @Override
    public boolean isEmpty() {
        int n;
        if (lIIIlIllIlllllIl(this.head, this.head.after)) {
            n = DefaultHttpHeaders.llIIlIIIIIIIlI[1];
            "".length();
            if ((0x29 ^ 0x18 ^ (0x72 ^ 0x46)) == 0x0) {
                return ((0x20 ^ 0x68 ^ (0xAF ^ 0xB0)) & (3 + 242 - 144 + 150 ^ 157 + 105 - 192 + 102 ^ -" ".length())) != 0x0;
            }
        }
        else {
            n = DefaultHttpHeaders.llIIlIIIIIIIlI[2];
        }
        return n != 0;
    }
    
    @Override
    public String get(final String llllllllllllIlllIIlllIIlIIIIIllI) {
        return this.get((CharSequence)llllllllllllIlllIIlllIIlIIIIIllI);
    }
    
    private static boolean lIIIlIllIllllllI(final int llllllllllllIlllIIlllIIIIlIlllII, final int llllllllllllIlllIIlllIIIIlIllIll) {
        return llllllllllllIlllIIlllIIIIlIlllII < llllllllllllIlllIIlllIIIIlIllIll;
    }
    
    private static boolean lIIIlIllIlllllIl(final Object llllllllllllIlllIIlllIIIIlIlIIlI, final Object llllllllllllIlllIIlllIIIIlIlIIIl) {
        return llllllllllllIlllIIlllIIIIlIlIIlI == llllllllllllIlllIIlllIIIIlIlIIIl;
    }
    
    @Override
    public List<String> getAll(final String llllllllllllIlllIIlllIIIlllIlllI) {
        return this.getAll((CharSequence)llllllllllllIlllIIlllIIIlllIlllI);
    }
    
    @Override
    public HttpHeaders set(final String llllllllllllIlllIIlllIIlIIlIlIII, final Iterable<?> llllllllllllIlllIIlllIIlIIlIIlll) {
        return this.set((CharSequence)llllllllllllIlllIIlllIIlIIlIlIII, llllllllllllIlllIIlllIIlIIlIIlll);
    }
    
    private final class HeaderIterator implements Iterator<Map.Entry<String, String>>
    {
        private /* synthetic */ HeaderEntry current;
        private static final /* synthetic */ int[] llIIlIlIIlIlll;
        
        @Override
        public Map.Entry<String, String> next() {
            this.current = this.current.after;
            if (lIIIllIIllllIlll(this.current, DefaultHttpHeaders.this.head)) {
                throw new NoSuchElementException();
            }
            return this.current;
        }
        
        static {
            lIIIllIIllllIlIl();
        }
        
        @Override
        public void remove() {
            throw new UnsupportedOperationException();
        }
        
        private static void lIIIllIIllllIlIl() {
            (llIIlIlIIlIlll = new int[2])[0] = " ".length();
            HeaderIterator.llIIlIlIIlIlll[1] = ((0x22 ^ 0x44 ^ (0x2F ^ 0x7A)) & (120 + 39 - 63 + 74 ^ 44 + 31 - 42 + 120 ^ -" ".length()));
        }
        
        private HeaderIterator() {
            this.current = DefaultHttpHeaders.this.head;
        }
        
        private static boolean lIIIllIIllllIlll(final Object llllllllllllIlllIIIllllIllIlllIl, final Object llllllllllllIlllIIIllllIllIlllII) {
            return llllllllllllIlllIIIllllIllIlllIl == llllllllllllIlllIIIllllIllIlllII;
        }
        
        private static boolean lIIIllIIllllIllI(final Object llllllllllllIlllIIIllllIlllIIIIl, final Object llllllllllllIlllIIIllllIlllIIIII) {
            return llllllllllllIlllIIIllllIlllIIIIl != llllllllllllIlllIIIllllIlllIIIII;
        }
        
        @Override
        public boolean hasNext() {
            int n;
            if (lIIIllIIllllIllI(this.current.after, DefaultHttpHeaders.this.head)) {
                n = HeaderIterator.llIIlIlIIlIlll[0];
                "".length();
                if (-(0xCE ^ 0x8D ^ (0x62 ^ 0x25)) > 0) {
                    return ((105 + 104 - 9 + 15 ^ 119 + 1 - 47 + 56) & (0x6A ^ 0x8 ^ (0x0 ^ 0x34) ^ -" ".length())) != 0x0;
                }
            }
            else {
                n = HeaderIterator.llIIlIlIIlIlll[1];
            }
            return n != 0;
        }
    }
    
    private final class HeaderEntry implements Map.Entry<String, String>
    {
        private static final /* synthetic */ int[] lIlIlIlIlIIIII;
        /* synthetic */ CharSequence value;
        private static final /* synthetic */ String[] lIlIlIlIIlllIl;
        /* synthetic */ HeaderEntry after;
        final /* synthetic */ int hash;
        final /* synthetic */ CharSequence key;
        /* synthetic */ HeaderEntry next;
        /* synthetic */ HeaderEntry before;
        
        HeaderEntry(final int lllllllllllllIIIlIIIIlIllllllIIl, final CharSequence lllllllllllllIIIlIIIIlIllllllIII, final CharSequence lllllllllllllIIIlIIIIlIlllllIIlI) {
            this.hash = lllllllllllllIIIlIIIIlIllllllIIl;
            this.key = lllllllllllllIIIlIIIIlIllllllIII;
            this.value = lllllllllllllIIIlIIIIlIlllllIIlI;
        }
        
        void encode(final ByteBuf lllllllllllllIIIlIIIIlIlllIIllII) {
            HttpHeaders.encode(this.key, this.value, lllllllllllllIIIlIIIIlIlllIIllII);
        }
        
        @Override
        public String toString() {
            return String.valueOf(new StringBuilder().append(this.key.toString()).append((char)HeaderEntry.lIlIlIlIlIIIII[2]).append(this.value.toString()));
        }
        
        void addBefore(final HeaderEntry lllllllllllllIIIlIIIIlIllllIIllI) {
            this.after = lllllllllllllIIIlIIIIlIllllIIllI;
            this.before = lllllllllllllIIIlIIIIlIllllIIllI.before;
            this.before.after = this;
            this.after.before = this;
        }
        
        private static boolean lllIlllIIIlIllI(final Object lllllllllllllIIIlIIIIlIllIllIIIl) {
            return lllllllllllllIIIlIIIIlIllIllIIIl == null;
        }
        
        HeaderEntry() {
            this.hash = HeaderEntry.lIlIlIlIlIIIII[0];
            this.key = null;
            this.value = null;
        }
        
        @Override
        public String setValue(final String lllllllllllllIIIlIIIIlIlllIllIIl) {
            if (lllIlllIIIlIllI(lllllllllllllIIIlIIIIlIlllIllIIl)) {
                throw new NullPointerException(HeaderEntry.lIlIlIlIIlllIl[HeaderEntry.lIlIlIlIlIIIII[1]]);
            }
            HttpHeaders.validateHeaderValue(lllllllllllllIIIlIIIIlIlllIllIIl);
            final CharSequence lllllllllllllIIIlIIIIlIlllIllIII = this.value;
            this.value = lllllllllllllIIIlIIIIlIlllIllIIl;
            return lllllllllllllIIIlIIIIlIlllIllIII.toString();
        }
        
        void remove() {
            this.before.after = this.after;
            this.after.before = this.before;
        }
        
        private static String lllIlllIIIlIIIl(final String lllllllllllllIIIlIIIIlIllIllIllI, final String lllllllllllllIIIlIIIIlIllIllIlll) {
            try {
                final SecretKeySpec lllllllllllllIIIlIIIIlIllIlllIll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIIIlIIIIlIllIllIlll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
                final Cipher lllllllllllllIIIlIIIIlIllIlllIlI = Cipher.getInstance("Blowfish");
                lllllllllllllIIIlIIIIlIllIlllIlI.init(HeaderEntry.lIlIlIlIlIIIII[4], lllllllllllllIIIlIIIIlIllIlllIll);
                return new String(lllllllllllllIIIlIIIIlIllIlllIlI.doFinal(Base64.getDecoder().decode(lllllllllllllIIIlIIIIlIllIllIllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
            }
            catch (Exception lllllllllllllIIIlIIIIlIllIlllIIl) {
                lllllllllllllIIIlIIIIlIllIlllIIl.printStackTrace();
                return null;
            }
        }
        
        static {
            lllIlllIIIlIlII();
            lllIlllIIIlIIlI();
        }
        
        @Override
        public String getValue() {
            return this.value.toString();
        }
        
        private static void lllIlllIIIlIIlI() {
            (lIlIlIlIIlllIl = new String[HeaderEntry.lIlIlIlIlIIIII[3]])[HeaderEntry.lIlIlIlIlIIIII[1]] = lllIlllIIIlIIIl("7EhWBGUgNbE=", "eLuLf");
        }
        
        @Override
        public String getKey() {
            return this.key.toString();
        }
        
        private static void lllIlllIIIlIlII() {
            (lIlIlIlIlIIIII = new int[5])[0] = -" ".length();
            HeaderEntry.lIlIlIlIlIIIII[1] = (("  ".length() ^ (0xDD ^ 0x97)) & (31 + 203 - 30 + 13 ^ 56 + 21 - 65 + 133 ^ -" ".length()));
            HeaderEntry.lIlIlIlIlIIIII[2] = (0xB ^ 0x4D ^ (0x74 ^ 0xF));
            HeaderEntry.lIlIlIlIlIIIII[3] = " ".length();
            HeaderEntry.lIlIlIlIlIIIII[4] = "  ".length();
        }
    }
}
