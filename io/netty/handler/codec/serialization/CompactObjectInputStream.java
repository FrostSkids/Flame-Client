// 
// Decompiled by Procyon v0.5.36
// 

package io.netty.handler.codec.serialization;

import java.io.EOFException;
import java.io.ObjectStreamClass;
import java.io.StreamCorruptedException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.io.ObjectInputStream;

class CompactObjectInputStream extends ObjectInputStream
{
    private final /* synthetic */ ClassResolver classResolver;
    private static final /* synthetic */ String[] lIlIlIlIIlllll;
    private static final /* synthetic */ int[] lIlIlIlIlIIIIl;
    
    private static String lllIlllIIIlIIll(String lllllllllllllIIIlIIIIlIlIllllIlI, final String lllllllllllllIIIlIIIIlIlIllllllI) {
        lllllllllllllIIIlIIIIlIlIllllIlI = (double)new String(Base64.getDecoder().decode(((String)lllllllllllllIIIlIIIIlIlIllllIlI).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIIIlIIIIlIlIlllllIl = new StringBuilder();
        final char[] lllllllllllllIIIlIIIIlIlIlllllII = lllllllllllllIIIlIIIIlIlIllllllI.toCharArray();
        int lllllllllllllIIIlIIIIlIlIllllIll = CompactObjectInputStream.lIlIlIlIlIIIIl[2];
        final byte lllllllllllllIIIlIIIIlIlIlllIlIl = (Object)((String)lllllllllllllIIIlIIIIlIlIllllIlI).toCharArray();
        final boolean lllllllllllllIIIlIIIIlIlIlllIlII = lllllllllllllIIIlIIIIlIlIlllIlIl.length != 0;
        char lllllllllllllIIIlIIIIlIlIlllIIll = (char)CompactObjectInputStream.lIlIlIlIlIIIIl[2];
        while (lllIlllIIIllIlI(lllllllllllllIIIlIIIIlIlIlllIIll, lllllllllllllIIIlIIIIlIlIlllIlII ? 1 : 0)) {
            final char lllllllllllllIIIlIIIIlIllIIIIIII = lllllllllllllIIIlIIIIlIlIlllIlIl[lllllllllllllIIIlIIIIlIlIlllIIll];
            lllllllllllllIIIlIIIIlIlIlllllIl.append((char)(lllllllllllllIIIlIIIIlIllIIIIIII ^ lllllllllllllIIIlIIIIlIlIlllllII[lllllllllllllIIIlIIIIlIlIllllIll % lllllllllllllIIIlIIIIlIlIlllllII.length]));
            "".length();
            ++lllllllllllllIIIlIIIIlIlIllllIll;
            ++lllllllllllllIIIlIIIIlIlIlllIIll;
            "".length();
            if (((0xB2 ^ 0xAA) & ~(0x18 ^ 0x0)) != 0x0) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIIIlIIIIlIlIlllllIl);
    }
    
    private static void lllIlllIIIlIlll() {
        (lIlIlIlIlIIIIl = new int[5])[0] = 141 + 16 + 89 + 9;
        CompactObjectInputStream.lIlIlIlIlIIIIl[1] = (0xB6 ^ 0xB3);
        CompactObjectInputStream.lIlIlIlIlIIIIl[2] = ((0x89 ^ 0xA5) & ~(0x8A ^ 0xA6));
        CompactObjectInputStream.lIlIlIlIlIIIIl[3] = " ".length();
        CompactObjectInputStream.lIlIlIlIlIIIIl[4] = "  ".length();
    }
    
    private static boolean lllIlllIIIllIIl(final int lllllllllllllIIIlIIIIlIlIllIllII) {
        return lllllllllllllIIIlIIIIlIlIllIllII < 0;
    }
    
    private static boolean lllIlllIIIllIlI(final int lllllllllllllIIIlIIIIlIlIllIllll, final int lllllllllllllIIIlIIIIlIlIllIlllI) {
        return lllllllllllllIIIlIIIIlIlIllIllll < lllllllllllllIIIlIIIIlIlIllIlllI;
    }
    
    private static boolean lllIlllIIIllIII(final int lllllllllllllIIIlIIIIlIlIllIlIIl, final int lllllllllllllIIIlIIIIlIlIllIlIII) {
        return lllllllllllllIIIlIIIIlIlIllIlIIl != lllllllllllllIIIlIIIIlIlIllIlIII;
    }
    
    CompactObjectInputStream(final InputStream lllllllllllllIIIlIIIIlIllIlIllII, final ClassResolver lllllllllllllIIIlIIIIlIllIlIlIll) throws IOException {
        super(lllllllllllllIIIlIIIIlIllIlIllII);
        this.classResolver = lllllllllllllIIIlIIIIlIllIlIlIll;
    }
    
    static {
        lllIlllIIIlIlll();
        lllIlllIIIlIlIl();
    }
    
    @Override
    protected void readStreamHeader() throws IOException {
        final int lllllllllllllIIIlIIIIlIllIlIIlII = this.readByte() & CompactObjectInputStream.lIlIlIlIlIIIIl[0];
        if (lllIlllIIIllIII(lllllllllllllIIIlIIIIlIllIlIIlII, CompactObjectInputStream.lIlIlIlIlIIIIl[1])) {
            throw new StreamCorruptedException(String.valueOf(new StringBuilder().append(CompactObjectInputStream.lIlIlIlIIlllll[CompactObjectInputStream.lIlIlIlIlIIIIl[2]]).append(lllllllllllllIIIlIIIIlIllIlIIlII)));
        }
    }
    
    @Override
    protected ObjectStreamClass readClassDescriptor() throws ClassNotFoundException, IOException {
        final int lllllllllllllIIIlIIIIlIllIIllIlI = this.read();
        if (lllIlllIIIllIIl(lllllllllllllIIIlIIIIlIllIIllIlI)) {
            throw new EOFException();
        }
        switch (lllllllllllllIIIlIIIIlIllIIllIlI) {
            case 0: {
                return super.readClassDescriptor();
            }
            case 1: {
                final String lllllllllllllIIIlIIIIlIllIIlllIl = this.readUTF();
                final Class<?> lllllllllllllIIIlIIIIlIllIIlllII = this.classResolver.resolve(lllllllllllllIIIlIIIIlIllIIlllIl);
                return ObjectStreamClass.lookupAny(lllllllllllllIIIlIIIIlIllIIlllII);
            }
            default: {
                throw new StreamCorruptedException(String.valueOf(new StringBuilder().append(CompactObjectInputStream.lIlIlIlIIlllll[CompactObjectInputStream.lIlIlIlIlIIIIl[3]]).append(lllllllllllllIIIlIIIIlIllIIllIlI)));
            }
        }
    }
    
    private static void lllIlllIIIlIlIl() {
        (lIlIlIlIIlllll = new String[CompactObjectInputStream.lIlIlIlIlIIIIl[4]])[CompactObjectInputStream.lIlIlIlIlIIIIl[2]] = lllIlllIIIlIIll("NigQFhgTKREXDQdmFQYaEC8MDVJD", "cFcch");
        CompactObjectInputStream.lIlIlIlIIlllll[CompactObjectInputStream.lIlIlIlIlIIIIl[3]] = lllIlllIIIlIIll("IQk2MRERBCcsBVQEPygSB0c3LBIXFTo5FRsVcz0YBAJpaQ==", "tgSIa");
    }
    
    @Override
    protected Class<?> resolveClass(final ObjectStreamClass lllllllllllllIIIlIIIIlIllIIIllll) throws ClassNotFoundException, IOException {
        Class<?> lllllllllllllIIIlIIIIlIllIIIlllI;
        try {
            lllllllllllllIIIlIIIIlIllIIIlllI = this.classResolver.resolve(lllllllllllllIIIlIIIIlIllIIIllll.getName());
            "".length();
            if (" ".length() >= "   ".length()) {
                return null;
            }
        }
        catch (ClassNotFoundException lllllllllllllIIIlIIIIlIllIIlIIIl) {
            lllllllllllllIIIlIIIIlIllIIIlllI = super.resolveClass(lllllllllllllIIIlIIIIlIllIIIllll);
        }
        return lllllllllllllIIIlIIIIlIllIIIlllI;
    }
}
