// 
// Decompiled by Procyon v0.5.36
// 

package io.netty.handler.codec.http.multipart;

import java.util.ArrayList;
import java.io.IOException;
import java.util.Iterator;
import io.netty.util.internal.PlatformDependent;
import java.nio.charset.Charset;
import java.util.List;
import io.netty.handler.codec.http.HttpRequest;
import java.util.Map;

public class DefaultHttpDataFactory implements HttpDataFactory
{
    private /* synthetic */ long minSize;
    private final /* synthetic */ boolean useDisk;
    private static final /* synthetic */ int[] lIIllllllIIIII;
    private final /* synthetic */ boolean checkSize;
    private final /* synthetic */ Map<HttpRequest, List<HttpData>> requestFileDeleteMap;
    
    static {
        llIllllIllIllII();
    }
    
    private static void llIllllIllIllII() {
        (lIIllllllIIIII = new int[2])[0] = ((0xF2 ^ 0xB0 ^ (0x9F ^ 0xC7)) & (0xD7 ^ 0x89 ^ (0x3F ^ 0x7B) ^ -" ".length()));
        DefaultHttpDataFactory.lIIllllllIIIII[1] = " ".length();
    }
    
    @Override
    public void removeHttpDataFromClean(final HttpRequest lllllllllllllIIlIIlIIIlIIlIIlllI, final InterfaceHttpData lllllllllllllIIlIIlIIIlIIlIIllIl) {
        if (llIllllIllIlllI((lllllllllllllIIlIIlIIIlIIlIIllIl instanceof HttpData) ? 1 : 0)) {
            final List<HttpData> lllllllllllllIIlIIlIIIlIIlIlIIII = this.getList(lllllllllllllIIlIIlIIIlIIlIIlllI);
            lllllllllllllIIlIIlIIIlIIlIlIIII.remove(lllllllllllllIIlIIlIIIlIIlIIllIl);
            "".length();
        }
    }
    
    @Override
    public FileUpload createFileUpload(final HttpRequest lllllllllllllIIlIIlIIIlIIllIIlIl, final String lllllllllllllIIlIIlIIIlIIlIlllII, final String lllllllllllllIIlIIlIIIlIIlIllIll, final String lllllllllllllIIlIIlIIIlIIllIIIlI, final String lllllllllllllIIlIIlIIIlIIllIIIIl, final Charset lllllllllllllIIlIIlIIIlIIlIllIII, final long lllllllllllllIIlIIlIIIlIIlIlIlll) {
        if (llIllllIllIlllI(this.useDisk ? 1 : 0)) {
            final FileUpload lllllllllllllIIlIIlIIIlIIllIlIlI = new DiskFileUpload(lllllllllllllIIlIIlIIIlIIlIlllII, lllllllllllllIIlIIlIIIlIIlIllIll, lllllllllllllIIlIIlIIIlIIllIIIlI, lllllllllllllIIlIIlIIIlIIllIIIIl, lllllllllllllIIlIIlIIIlIIlIllIII, lllllllllllllIIlIIlIIIlIIlIlIlll);
            final List<HttpData> lllllllllllllIIlIIlIIIlIIllIlIIl = this.getList(lllllllllllllIIlIIlIIIlIIllIIlIl);
            lllllllllllllIIlIIlIIIlIIllIlIIl.add(lllllllllllllIIlIIlIIIlIIllIlIlI);
            "".length();
            return lllllllllllllIIlIIlIIIlIIllIlIlI;
        }
        if (llIllllIllIlllI(this.checkSize ? 1 : 0)) {
            final FileUpload lllllllllllllIIlIIlIIIlIIllIlIII = new MixedFileUpload(lllllllllllllIIlIIlIIIlIIlIlllII, lllllllllllllIIlIIlIIIlIIlIllIll, lllllllllllllIIlIIlIIIlIIllIIIlI, lllllllllllllIIlIIlIIIlIIllIIIIl, lllllllllllllIIlIIlIIIlIIlIllIII, lllllllllllllIIlIIlIIIlIIlIlIlll, this.minSize);
            final List<HttpData> lllllllllllllIIlIIlIIIlIIllIIlll = this.getList(lllllllllllllIIlIIlIIIlIIllIIlIl);
            lllllllllllllIIlIIlIIIlIIllIIlll.add(lllllllllllllIIlIIlIIIlIIllIlIII);
            "".length();
            return lllllllllllllIIlIIlIIIlIIllIlIII;
        }
        return new MemoryFileUpload(lllllllllllllIIlIIlIIIlIIlIlllII, lllllllllllllIIlIIlIIIlIIlIllIll, lllllllllllllIIlIIlIIIlIIllIIIlI, lllllllllllllIIlIIlIIIlIIllIIIIl, lllllllllllllIIlIIlIIIlIIlIllIII, lllllllllllllIIlIIlIIIlIIlIlIlll);
    }
    
    @Override
    public Attribute createAttribute(final HttpRequest lllllllllllllIIlIIlIIIlIlIIIlllI, final String lllllllllllllIIlIIlIIIlIlIIlIIII) {
        if (llIllllIllIlllI(this.useDisk ? 1 : 0)) {
            final Attribute lllllllllllllIIlIIlIIIlIlIIlIllI = new DiskAttribute(lllllllllllllIIlIIlIIIlIlIIlIIII);
            final List<HttpData> lllllllllllllIIlIIlIIIlIlIIlIlIl = this.getList(lllllllllllllIIlIIlIIIlIlIIIlllI);
            lllllllllllllIIlIIlIIIlIlIIlIlIl.add(lllllllllllllIIlIIlIIIlIlIIlIllI);
            "".length();
            return lllllllllllllIIlIIlIIIlIlIIlIllI;
        }
        if (llIllllIllIlllI(this.checkSize ? 1 : 0)) {
            final Attribute lllllllllllllIIlIIlIIIlIlIIlIlII = new MixedAttribute(lllllllllllllIIlIIlIIIlIlIIlIIII, this.minSize);
            final List<HttpData> lllllllllllllIIlIIlIIIlIlIIlIIll = this.getList(lllllllllllllIIlIIlIIIlIlIIIlllI);
            lllllllllllllIIlIIlIIIlIlIIlIIll.add(lllllllllllllIIlIIlIIIlIlIIlIlII);
            "".length();
            return lllllllllllllIIlIIlIIIlIlIIlIlII;
        }
        return new MemoryAttribute(lllllllllllllIIlIIlIIIlIlIIlIIII);
    }
    
    public DefaultHttpDataFactory(final boolean lllllllllllllIIlIIlIIIlIlIlIlIll) {
        this.requestFileDeleteMap = (Map<HttpRequest, List<HttpData>>)PlatformDependent.newConcurrentHashMap();
        this.useDisk = lllllllllllllIIlIIlIIIlIlIlIlIll;
        this.checkSize = (DefaultHttpDataFactory.lIIllllllIIIII[0] != 0);
    }
    
    @Override
    public void cleanAllHttpDatas() {
        final Iterator<Map.Entry<HttpRequest, List<HttpData>>> lllllllllllllIIlIIlIIIlIIIlIlllI = this.requestFileDeleteMap.entrySet().iterator();
        while (llIllllIllIlllI(lllllllllllllIIlIIlIIIlIIIlIlllI.hasNext() ? 1 : 0)) {
            final Map.Entry<HttpRequest, List<HttpData>> lllllllllllllIIlIIlIIIlIIIllIIIl = lllllllllllllIIlIIlIIIlIIIlIlllI.next();
            lllllllllllllIIlIIlIIIlIIIlIlllI.remove();
            final List<HttpData> lllllllllllllIIlIIlIIIlIIIllIIII = lllllllllllllIIlIIlIIIlIIIllIIIl.getValue();
            if (llIllllIllIllll(lllllllllllllIIlIIlIIIlIIIllIIII)) {
                final Iterator lllllllllllllIIlIIlIIIlIIIllIIlI = lllllllllllllIIlIIlIIIlIIIllIIII.iterator();
                while (llIllllIllIlllI(lllllllllllllIIlIIlIIIlIIIllIIlI.hasNext() ? 1 : 0)) {
                    final HttpData lllllllllllllIIlIIlIIIlIIIllIIll = lllllllllllllIIlIIlIIIlIIIllIIlI.next();
                    lllllllllllllIIlIIlIIIlIIIllIIll.delete();
                    "".length();
                    if ((0x50 ^ 0x54) == 0x0) {
                        return;
                    }
                }
                lllllllllllllIIlIIlIIIlIIIllIIII.clear();
            }
            "".length();
            if (-" ".length() > (17 + 94 + 22 + 13 ^ 134 + 127 - 251 + 140)) {
                return;
            }
        }
    }
    
    @Override
    public void cleanRequestHttpDatas(final HttpRequest lllllllllllllIIlIIlIIIlIIlIIIIII) {
        final List<HttpData> lllllllllllllIIlIIlIIIlIIIllllll = this.requestFileDeleteMap.remove(lllllllllllllIIlIIlIIIlIIlIIIIII);
        if (llIllllIllIllll(lllllllllllllIIlIIlIIIlIIIllllll)) {
            final Iterator lllllllllllllIIlIIlIIIlIIlIIIIlI = lllllllllllllIIlIIlIIIlIIIllllll.iterator();
            while (llIllllIllIlllI(lllllllllllllIIlIIlIIIlIIlIIIIlI.hasNext() ? 1 : 0)) {
                final HttpData lllllllllllllIIlIIlIIIlIIlIIIIll = lllllllllllllIIlIIlIIIlIIlIIIIlI.next();
                lllllllllllllIIlIIlIIIlIIlIIIIll.delete();
                "".length();
                if (null != null) {
                    return;
                }
            }
            lllllllllllllIIlIIlIIIlIIIllllll.clear();
        }
    }
    
    private static boolean llIllllIllIlllI(final int lllllllllllllIIlIIlIIIlIIIlIIIlI) {
        return lllllllllllllIIlIIlIIIlIIIlIIIlI != 0;
    }
    
    @Override
    public Attribute createAttribute(final HttpRequest lllllllllllllIIlIIlIIIlIIlllllIl, final String lllllllllllllIIlIIlIIIlIIlllllII, final String lllllllllllllIIlIIlIIIlIIlllIlll) {
        if (llIllllIllIlllI(this.useDisk ? 1 : 0)) {
            Attribute lllllllllllllIIlIIlIIIlIlIIIIIll;
            try {
                lllllllllllllIIlIIlIIIlIlIIIIIll = new DiskAttribute(lllllllllllllIIlIIlIIIlIIlllllII, lllllllllllllIIlIIlIIIlIIlllIlll);
                "".length();
                if (-" ".length() > 0) {
                    return null;
                }
            }
            catch (IOException lllllllllllllIIlIIlIIIlIlIIIIlII) {
                lllllllllllllIIlIIlIIIlIlIIIIIll = new MixedAttribute(lllllllllllllIIlIIlIIIlIIlllllII, lllllllllllllIIlIIlIIIlIIlllIlll, this.minSize);
            }
            final List<HttpData> lllllllllllllIIlIIlIIIlIlIIIIIlI = this.getList(lllllllllllllIIlIIlIIIlIIlllllIl);
            lllllllllllllIIlIIlIIIlIlIIIIIlI.add(lllllllllllllIIlIIlIIIlIlIIIIIll);
            "".length();
            return lllllllllllllIIlIIlIIIlIlIIIIIll;
        }
        if (llIllllIllIlllI(this.checkSize ? 1 : 0)) {
            final Attribute lllllllllllllIIlIIlIIIlIlIIIIIIl = new MixedAttribute(lllllllllllllIIlIIlIIIlIIlllllII, lllllllllllllIIlIIlIIIlIIlllIlll, this.minSize);
            final List<HttpData> lllllllllllllIIlIIlIIIlIlIIIIIII = this.getList(lllllllllllllIIlIIlIIIlIIlllllIl);
            lllllllllllllIIlIIlIIIlIlIIIIIII.add(lllllllllllllIIlIIlIIIlIlIIIIIIl);
            "".length();
            return lllllllllllllIIlIIlIIIlIlIIIIIIl;
        }
        try {
            return new MemoryAttribute(lllllllllllllIIlIIlIIIlIIlllllII, lllllllllllllIIlIIlIIIlIIlllIlll);
        }
        catch (IOException lllllllllllllIIlIIlIIIlIIlllllll) {
            throw new IllegalArgumentException(lllllllllllllIIlIIlIIIlIIlllllll);
        }
    }
    
    private static boolean llIllllIllIllIl(final Object lllllllllllllIIlIIlIIIlIIIlIIlII) {
        return lllllllllllllIIlIIlIIIlIIIlIIlII == null;
    }
    
    private static boolean llIllllIllIllll(final Object lllllllllllllIIlIIlIIIlIIIlIIllI) {
        return lllllllllllllIIlIIlIIIlIIIlIIllI != null;
    }
    
    public DefaultHttpDataFactory(final long lllllllllllllIIlIIlIIIlIlIlIIlll) {
        this.requestFileDeleteMap = (Map<HttpRequest, List<HttpData>>)PlatformDependent.newConcurrentHashMap();
        this.useDisk = (DefaultHttpDataFactory.lIIllllllIIIII[0] != 0);
        this.checkSize = (DefaultHttpDataFactory.lIIllllllIIIII[1] != 0);
        this.minSize = lllllllllllllIIlIIlIIIlIlIlIIlll;
    }
    
    private List<HttpData> getList(final HttpRequest lllllllllllllIIlIIlIIIlIlIlIIIII) {
        List<HttpData> lllllllllllllIIlIIlIIIlIlIIlllll = this.requestFileDeleteMap.get(lllllllllllllIIlIIlIIIlIlIlIIIII);
        if (llIllllIllIllIl(lllllllllllllIIlIIlIIIlIlIIlllll)) {
            lllllllllllllIIlIIlIIIlIlIIlllll = new ArrayList<HttpData>();
            this.requestFileDeleteMap.put(lllllllllllllIIlIIlIIIlIlIlIIIII, lllllllllllllIIlIIlIIIlIlIIlllll);
            "".length();
        }
        return lllllllllllllIIlIIlIIIlIlIIlllll;
    }
    
    public DefaultHttpDataFactory() {
        this.requestFileDeleteMap = (Map<HttpRequest, List<HttpData>>)PlatformDependent.newConcurrentHashMap();
        this.useDisk = (DefaultHttpDataFactory.lIIllllllIIIII[0] != 0);
        this.checkSize = (DefaultHttpDataFactory.lIIllllllIIIII[1] != 0);
        this.minSize = 16384L;
    }
}
