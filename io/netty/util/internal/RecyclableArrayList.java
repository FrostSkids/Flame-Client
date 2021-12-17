// 
// Decompiled by Procyon v0.5.36
// 

package io.netty.util.internal;

import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;
import java.util.Collection;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import io.netty.util.Recycler;
import java.util.ArrayList;

public final class RecyclableArrayList extends ArrayList<Object>
{
    private static final /* synthetic */ Recycler<RecyclableArrayList> RECYCLER;
    private static final /* synthetic */ int[] lllIlIlIIIIIlI;
    private final /* synthetic */ Recycler.Handle handle;
    private static final /* synthetic */ String[] lllIlIlIIIIIII;
    
    private RecyclableArrayList(final Recycler.Handle llllllllllllIlIllIlllIIIlIIlIIll, final int llllllllllllIlIllIlllIIIlIIlIlIl) {
        super(llllllllllllIlIllIlllIIIlIIlIlIl);
        this.handle = llllllllllllIlIllIlllIIIlIIlIIll;
    }
    
    private static void lIlIIIlIlIIllllI() {
        (lllIlIlIIIIIlI = new int[7])[0] = (0x3D ^ 0x35);
        RecyclableArrayList.lllIlIlIIIIIlI[1] = ((63 + 3 + 70 + 23 ^ 13 + 120 + 31 + 8) & (0x58 ^ 0x73 ^ (0x84 ^ 0x9C) ^ -" ".length()));
        RecyclableArrayList.lllIlIlIIIIIlI[2] = " ".length();
        RecyclableArrayList.lllIlIlIIIIIlI[3] = "  ".length();
        RecyclableArrayList.lllIlIlIIIIIlI[4] = "   ".length();
        RecyclableArrayList.lllIlIlIIIIIlI[5] = (0xC5 ^ 0xC1);
        RecyclableArrayList.lllIlIlIIIIIlI[6] = (113 + 119 - 111 + 47 ^ 46 + 82 - 85 + 130);
    }
    
    private static String lIlIIIlIlIIllIlI(final String llllllllllllIlIllIlllIIIIIllIIll, final String llllllllllllIlIllIlllIIIIIllIIlI) {
        try {
            final SecretKeySpec llllllllllllIlIllIlllIIIIIllIllI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIlIllIlllIIIIIllIIlI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher llllllllllllIlIllIlllIIIIIllIlIl = Cipher.getInstance("Blowfish");
            llllllllllllIlIllIlllIIIIIllIlIl.init(RecyclableArrayList.lllIlIlIIIIIlI[3], llllllllllllIlIllIlllIIIIIllIllI);
            return new String(llllllllllllIlIllIlllIIIIIllIlIl.doFinal(Base64.getDecoder().decode(llllllllllllIlIllIlllIIIIIllIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIlIllIlllIIIIIllIlII) {
            llllllllllllIlIllIlllIIIIIllIlII.printStackTrace();
            return null;
        }
    }
    
    private static String lIlIIIlIlIIllIIl(String llllllllllllIlIllIlllIIIIlIIIIll, final String llllllllllllIlIllIlllIIIIlIIIlll) {
        llllllllllllIlIllIlllIIIIlIIIIll = (short)new String(Base64.getDecoder().decode(((String)llllllllllllIlIllIlllIIIIlIIIIll).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder llllllllllllIlIllIlllIIIIlIIIllI = new StringBuilder();
        final char[] llllllllllllIlIllIlllIIIIlIIIlIl = llllllllllllIlIllIlllIIIIlIIIlll.toCharArray();
        int llllllllllllIlIllIlllIIIIlIIIlII = RecyclableArrayList.lllIlIlIIIIIlI[1];
        final Exception llllllllllllIlIllIlllIIIIIlllllI = (Object)((String)llllllllllllIlIllIlllIIIIlIIIIll).toCharArray();
        final int llllllllllllIlIllIlllIIIIIllllIl = llllllllllllIlIllIlllIIIIIlllllI.length;
        Exception llllllllllllIlIllIlllIIIIIllllII = (Exception)RecyclableArrayList.lllIlIlIIIIIlI[1];
        while (lIlIIIlIlIlIIIII((int)llllllllllllIlIllIlllIIIIIllllII, llllllllllllIlIllIlllIIIIIllllIl)) {
            final char llllllllllllIlIllIlllIIIIlIIlIIl = llllllllllllIlIllIlllIIIIIlllllI[llllllllllllIlIllIlllIIIIIllllII];
            llllllllllllIlIllIlllIIIIlIIIllI.append((char)(llllllllllllIlIllIlllIIIIlIIlIIl ^ llllllllllllIlIllIlllIIIIlIIIlIl[llllllllllllIlIllIlllIIIIlIIIlII % llllllllllllIlIllIlllIIIIlIIIlIl.length]));
            "".length();
            ++llllllllllllIlIllIlllIIIIlIIIlII;
            ++llllllllllllIlIllIlllIIIIIllllII;
            "".length();
            if (-" ".length() >= " ".length()) {
                return null;
            }
        }
        return String.valueOf(llllllllllllIlIllIlllIIIIlIIIllI);
    }
    
    @Override
    public void add(final int llllllllllllIlIllIlllIIIIllIlIlI, final Object llllllllllllIlIllIlllIIIIllIlIIl) {
        if (lIlIIIlIlIlIIIIl(llllllllllllIlIllIlllIIIIllIlIIl)) {
            throw new NullPointerException(RecyclableArrayList.lllIlIlIIIIIII[RecyclableArrayList.lllIlIlIIIIIlI[4]]);
        }
        super.add(llllllllllllIlIllIlllIIIIllIlIlI, llllllllllllIlIllIlllIIIIllIlIIl);
    }
    
    private RecyclableArrayList(final Recycler.Handle llllllllllllIlIllIlllIIIlIIlllIl) {
        this(llllllllllllIlIllIlllIIIlIIlllIl, RecyclableArrayList.lllIlIlIIIIIlI[0]);
    }
    
    public boolean recycle() {
        this.clear();
        return RecyclableArrayList.RECYCLER.recycle(this, this.handle);
    }
    
    private static void checkNullElements(final Collection<?> llllllllllllIlIllIlllIIIIllllIII) {
        if (lIlIIIlIlIIlllll((llllllllllllIlIllIlllIIIIllllIII instanceof RandomAccess) ? 1 : 0) && lIlIIIlIlIIlllll((llllllllllllIlIllIlllIIIIllllIII instanceof List) ? 1 : 0)) {
            final List<?> llllllllllllIlIllIlllIIIIlllllIl = (List<?>)(List)llllllllllllIlIllIlllIIIIllllIII;
            final int llllllllllllIlIllIlllIIIIlllllII = llllllllllllIlIllIlllIIIIlllllIl.size();
            int llllllllllllIlIllIlllIIIIllllllI = RecyclableArrayList.lllIlIlIIIIIlI[1];
            while (lIlIIIlIlIlIIIII(llllllllllllIlIllIlllIIIIllllllI, llllllllllllIlIllIlllIIIIlllllII)) {
                if (lIlIIIlIlIlIIIIl(llllllllllllIlIllIlllIIIIlllllIl.get(llllllllllllIlIllIlllIIIIllllllI))) {
                    throw new IllegalArgumentException(RecyclableArrayList.lllIlIlIIIIIII[RecyclableArrayList.lllIlIlIIIIIlI[1]]);
                }
                ++llllllllllllIlIllIlllIIIIllllllI;
                "".length();
                if (null != null) {
                    return;
                }
            }
            "".length();
            if (null != null) {
                return;
            }
        }
        else {
            final Iterator llllllllllllIlIllIlllIIIIllllIlI = llllllllllllIlIllIlllIIIIllllIII.iterator();
            while (lIlIIIlIlIIlllll(llllllllllllIlIllIlllIIIIllllIlI.hasNext() ? 1 : 0)) {
                final Object llllllllllllIlIllIlllIIIIllllIll = llllllllllllIlIllIlllIIIIllllIlI.next();
                if (lIlIIIlIlIlIIIIl(llllllllllllIlIllIlllIIIIllllIll)) {
                    throw new IllegalArgumentException(RecyclableArrayList.lllIlIlIIIIIII[RecyclableArrayList.lllIlIlIIIIIlI[2]]);
                }
                "".length();
                if ((0x35 ^ 0x31) <= 0) {
                    return;
                }
            }
        }
    }
    
    @Override
    public boolean add(final Object llllllllllllIlIllIlllIIIIllIllll) {
        if (lIlIIIlIlIlIIIIl(llllllllllllIlIllIlllIIIIllIllll)) {
            throw new NullPointerException(RecyclableArrayList.lllIlIlIIIIIII[RecyclableArrayList.lllIlIlIIIIIlI[3]]);
        }
        return super.add(llllllllllllIlIllIlllIIIIllIllll);
    }
    
    private static void lIlIIIlIlIIllIll() {
        (lllIlIlIIIIIII = new String[RecyclableArrayList.lllIlIlIIIIIlI[6]])[RecyclableArrayList.lllIlIlIIIIIlI[1]] = lIlIIIlIlIIllIIl("M2QhKzQkJSsqKXAqNyg2cDIjKC81Nw==", "PDBDZ");
        RecyclableArrayList.lllIlIlIIIIIII[RecyclableArrayList.lllIlIlIIIIIlI[2]] = lIlIIIlIlIIllIIl("CW4hIi0eLysjMEogNyEvSjgjITYPPQ==", "jNBMC");
        RecyclableArrayList.lllIlIlIIIIIII[RecyclableArrayList.lllIlIlIIIIIlI[3]] = lIlIIIlIlIIllIlI("DBSqSXdq1yg=", "kLtEj");
        RecyclableArrayList.lllIlIlIIIIIII[RecyclableArrayList.lllIlIlIIIIIlI[4]] = lIlIIIlIlIIllIIl("NTgpKh8+IA==", "PTLGz");
        RecyclableArrayList.lllIlIlIIIIIII[RecyclableArrayList.lllIlIlIIIIIlI[5]] = lIlIIIlIlIIllIIl("LT8fICsmJw==", "HSzMN");
    }
    
    public static RecyclableArrayList newInstance() {
        return newInstance(RecyclableArrayList.lllIlIlIIIIIlI[0]);
    }
    
    private static boolean lIlIIIlIlIIlllll(final int llllllllllllIlIllIlllIIIIIlIIllI) {
        return llllllllllllIlIllIlllIIIIIlIIllI != 0;
    }
    
    static {
        lIlIIIlIlIIllllI();
        lIlIIIlIlIIllIll();
        DEFAULT_INITIAL_CAPACITY = RecyclableArrayList.lllIlIlIIIIIlI[0];
        RECYCLER = new Recycler<RecyclableArrayList>() {
            @Override
            protected RecyclableArrayList newObject(final Handle llllllllllllIlllIllIIIIIIlllllIl) {
                return new RecyclableArrayList(llllllllllllIlllIllIIIIIIlllllIl, null);
            }
        };
    }
    
    private static boolean lIlIIIlIlIlIIIIl(final Object llllllllllllIlIllIlllIIIIIlIlIII) {
        return llllllllllllIlIllIlllIIIIIlIlIII == null;
    }
    
    @Override
    public boolean addAll(final Collection<?> llllllllllllIlIllIlllIIIlIIIlllI) {
        checkNullElements(llllllllllllIlIllIlllIIIlIIIlllI);
        return super.addAll(llllllllllllIlIllIlllIIIlIIIlllI);
    }
    
    @Override
    public Object set(final int llllllllllllIlIllIlllIIIIlIllllI, final Object llllllllllllIlIllIlllIIIIlIlllIl) {
        if (lIlIIIlIlIlIIIIl(llllllllllllIlIllIlllIIIIlIlllIl)) {
            throw new NullPointerException(RecyclableArrayList.lllIlIlIIIIIII[RecyclableArrayList.lllIlIlIIIIIlI[5]]);
        }
        return super.set(llllllllllllIlIllIlllIIIIlIllllI, llllllllllllIlIllIlllIIIIlIlllIl);
    }
    
    public static RecyclableArrayList newInstance(final int llllllllllllIlIllIlllIIIlIlIIIlI) {
        final RecyclableArrayList llllllllllllIlIllIlllIIIlIlIIIll = RecyclableArrayList.RECYCLER.get();
        llllllllllllIlIllIlllIIIlIlIIIll.ensureCapacity(llllllllllllIlIllIlllIIIlIlIIIlI);
        return llllllllllllIlIllIlllIIIlIlIIIll;
    }
    
    @Override
    public boolean addAll(final int llllllllllllIlIllIlllIIIlIIIIlll, final Collection<?> llllllllllllIlIllIlllIIIlIIIIIll) {
        checkNullElements(llllllllllllIlIllIlllIIIlIIIIIll);
        return super.addAll(llllllllllllIlIllIlllIIIlIIIIlll, llllllllllllIlIllIlllIIIlIIIIIll);
    }
    
    private static boolean lIlIIIlIlIlIIIII(final int llllllllllllIlIllIlllIIIIIlIlIll, final int llllllllllllIlIllIlllIIIIIlIlIlI) {
        return llllllllllllIlIllIlllIIIIIlIlIll < llllllllllllIlIllIlllIIIIIlIlIlI;
    }
}
