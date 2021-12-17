// 
// Decompiled by Procyon v0.5.36
// 

package io.netty.util.internal.logging;

import java.nio.charset.StandardCharsets;
import java.util.Base64;

class FormattingTuple
{
    private final /* synthetic */ String message;
    private static final /* synthetic */ String[] lIIIIIlIllIIlI;
    private final /* synthetic */ Throwable throwable;
    private static final /* synthetic */ int[] lIIIIIlIllIlII;
    private final /* synthetic */ Object[] argArray;
    
    FormattingTuple(final String lllllllllllllIlIIlllIIlllIIIIIlI, final Object[] lllllllllllllIlIIlllIIlllIIIIlIl, final Throwable lllllllllllllIlIIlllIIlllIIIIlII) {
        this.message = lllllllllllllIlIIlllIIlllIIIIIlI;
        this.throwable = lllllllllllllIlIIlllIIlllIIIIlII;
        if (lIllIllIIlllIII(lllllllllllllIlIIlllIIlllIIIIlII)) {
            this.argArray = lllllllllllllIlIIlllIIlllIIIIlIl;
            "".length();
            if (-(48 + 167 - 199 + 169 ^ 26 + 53 - 28 + 138) >= 0) {
                throw null;
            }
        }
        else {
            this.argArray = trimmedCopy(lllllllllllllIlIIlllIIlllIIIIlIl);
        }
    }
    
    private static boolean lIllIllIIlllIll(final int lllllllllllllIlIIlllIIllIlIlIIll, final int lllllllllllllIlIIlllIIllIlIlIIlI) {
        return lllllllllllllIlIIlllIIllIlIlIIll < lllllllllllllIlIIlllIIllIlIlIIlI;
    }
    
    private static void lIllIllIIllIlll() {
        (lIIIIIlIllIlII = new int[2])[0] = ((136 + 108 - 59 + 11 ^ 29 + 84 - 43 + 70) & (0x95 ^ 0xB2 ^ (0xF4 ^ 0x9B) ^ -" ".length()));
        FormattingTuple.lIIIIIlIllIlII[1] = " ".length();
    }
    
    FormattingTuple(final String lllllllllllllIlIIlllIIlllIIIlllI) {
        this(lllllllllllllIlIIlllIIlllIIIlllI, null, null);
    }
    
    private static boolean lIllIllIIlllIII(final Object lllllllllllllIlIIlllIIllIlIIlllI) {
        return lllllllllllllIlIIlllIIllIlIIlllI == null;
    }
    
    public String getMessage() {
        return this.message;
    }
    
    static {
        lIllIllIIllIlll();
        lIllIllIIllIlIl();
        NULL = new FormattingTuple(null);
    }
    
    private static boolean lIllIllIIlllIlI(final int lllllllllllllIlIIlllIIllIlIIllII) {
        return lllllllllllllIlIIlllIIllIlIIllII == 0;
    }
    
    public Object[] getArgArray() {
        return this.argArray;
    }
    
    private static boolean lIllIllIIlllIIl(final Object lllllllllllllIlIIlllIIllIlIlIIII) {
        return lllllllllllllIlIIlllIIllIlIlIIII != null;
    }
    
    private static String lIllIllIIllIlII(String lllllllllllllIlIIlllIIllIlIllllI, final String lllllllllllllIlIIlllIIllIlIlllIl) {
        lllllllllllllIlIIlllIIllIlIllllI = new String(Base64.getDecoder().decode(lllllllllllllIlIIlllIIllIlIllllI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIlIIlllIIllIllIIIIl = new StringBuilder();
        final char[] lllllllllllllIlIIlllIIllIllIIIII = lllllllllllllIlIIlllIIllIlIlllIl.toCharArray();
        int lllllllllllllIlIIlllIIllIlIlllll = FormattingTuple.lIIIIIlIllIlII[0];
        final char lllllllllllllIlIIlllIIllIlIllIIl = (Object)lllllllllllllIlIIlllIIllIlIllllI.toCharArray();
        final char lllllllllllllIlIIlllIIllIlIllIII = (char)lllllllllllllIlIIlllIIllIlIllIIl.length;
        byte lllllllllllllIlIIlllIIllIlIlIlll = (byte)FormattingTuple.lIIIIIlIllIlII[0];
        while (lIllIllIIlllIll(lllllllllllllIlIIlllIIllIlIlIlll, lllllllllllllIlIIlllIIllIlIllIII)) {
            final char lllllllllllllIlIIlllIIllIllIIlII = lllllllllllllIlIIlllIIllIlIllIIl[lllllllllllllIlIIlllIIllIlIlIlll];
            lllllllllllllIlIIlllIIllIllIIIIl.append((char)(lllllllllllllIlIIlllIIllIllIIlII ^ lllllllllllllIlIIlllIIllIllIIIII[lllllllllllllIlIIlllIIllIlIlllll % lllllllllllllIlIIlllIIllIllIIIII.length]));
            "".length();
            ++lllllllllllllIlIIlllIIllIlIlllll;
            ++lllllllllllllIlIIlllIIllIlIlIlll;
            "".length();
            if ("   ".length() > (0x4A ^ 0x4E)) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIlIIlllIIllIllIIIIl);
    }
    
    static Object[] trimmedCopy(final Object[] lllllllllllllIlIIlllIIllIllllIIl) {
        if (!lIllIllIIlllIIl(lllllllllllllIlIIlllIIllIllllIIl) || lIllIllIIlllIlI(lllllllllllllIlIIlllIIllIllllIIl.length)) {
            throw new IllegalStateException(FormattingTuple.lIIIIIlIllIIlI[FormattingTuple.lIIIIIlIllIlII[0]]);
        }
        final int lllllllllllllIlIIlllIIllIllllIll = lllllllllllllIlIIlllIIllIllllIIl.length - FormattingTuple.lIIIIIlIllIlII[1];
        final Object[] lllllllllllllIlIIlllIIllIllllIlI = new Object[lllllllllllllIlIIlllIIllIllllIll];
        System.arraycopy(lllllllllllllIlIIlllIIllIllllIIl, FormattingTuple.lIIIIIlIllIlII[0], lllllllllllllIlIIlllIIllIllllIlI, FormattingTuple.lIIIIIlIllIlII[0], lllllllllllllIlIIlllIIllIllllIll);
        return lllllllllllllIlIIlllIIllIllllIlI;
    }
    
    public Throwable getThrowable() {
        return this.throwable;
    }
    
    private static void lIllIllIIllIlIl() {
        (lIIIIIlIllIIlI = new String[FormattingTuple.lIIIIIlIllIlII[1]])[FormattingTuple.lIIIIIlIllIlII[0]] = lIllIllIIllIlII("JgUlRzwtBDgDLCkGaw8iOB4ySiA6SiUfIyRKKhgoPQcuBDtoCzkYLjE=", "HjKjO");
    }
}
