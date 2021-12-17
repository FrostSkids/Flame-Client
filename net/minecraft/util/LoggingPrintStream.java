// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.util;

import org.apache.logging.log4j.LogManager;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import org.apache.logging.log4j.Logger;
import java.io.PrintStream;

public class LoggingPrintStream extends PrintStream
{
    private static final /* synthetic */ String[] llIIIllllllIll;
    private final /* synthetic */ String domain;
    private static final /* synthetic */ Logger LOGGER;
    private static final /* synthetic */ int[] llIIIlllllllII;
    
    private static void lIIIlIllIllIIlll() {
        (llIIIllllllIll = new String[LoggingPrintStream.llIIIlllllllII[3]])[LoggingPrintStream.llIIIlllllllII[1]] = lIIIlIllIllIIlIl("EBk/JSFlSjkFWzAfa0JBMB8=", "KbBxa");
    }
    
    private static String lIIIlIllIllIIlIl(String llllllllllllIlllIIlllIlIIlllIIll, final String llllllllllllIlllIIlllIlIIlllIlll) {
        llllllllllllIlllIIlllIlIIlllIIll = new String(Base64.getDecoder().decode(llllllllllllIlllIIlllIlIIlllIIll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder llllllllllllIlllIIlllIlIIlllIllI = new StringBuilder();
        final char[] llllllllllllIlllIIlllIlIIlllIlIl = llllllllllllIlllIIlllIlIIlllIlll.toCharArray();
        int llllllllllllIlllIIlllIlIIlllIlII = LoggingPrintStream.llIIIlllllllII[1];
        final float llllllllllllIlllIIlllIlIIllIlllI = (Object)llllllllllllIlllIIlllIlIIlllIIll.toCharArray();
        final String llllllllllllIlllIIlllIlIIllIllIl = (String)llllllllllllIlllIIlllIlIIllIlllI.length;
        char llllllllllllIlllIIlllIlIIllIllII = (char)LoggingPrintStream.llIIIlllllllII[1];
        while (lIIIlIllIllIlIIl(llllllllllllIlllIIlllIlIIllIllII, (int)llllllllllllIlllIIlllIlIIllIllIl)) {
            final char llllllllllllIlllIIlllIlIIllllIIl = llllllllllllIlllIIlllIlIIllIlllI[llllllllllllIlllIIlllIlIIllIllII];
            llllllllllllIlllIIlllIlIIlllIllI.append((char)(llllllllllllIlllIIlllIlIIllllIIl ^ llllllllllllIlllIIlllIlIIlllIlIl[llllllllllllIlllIIlllIlIIlllIlII % llllllllllllIlllIIlllIlIIlllIlIl.length]));
            "".length();
            ++llllllllllllIlllIIlllIlIIlllIlII;
            ++llllllllllllIlllIIlllIlIIllIllII;
            "".length();
            if (((0x50 ^ 0x7B) & ~(0x7D ^ 0x56)) != 0x0) {
                return null;
            }
        }
        return String.valueOf(llllllllllllIlllIIlllIlIIlllIllI);
    }
    
    @Override
    public void println(final String llllllllllllIlllIIlllIlIlIIlIlll) {
        this.logString(llllllllllllIlllIIlllIlIlIIlIlll);
    }
    
    public LoggingPrintStream(final String llllllllllllIlllIIlllIlIlIIlllll, final OutputStream llllllllllllIlllIIlllIlIlIIllIll) {
        super(llllllllllllIlllIIlllIlIlIIllIll);
        this.domain = llllllllllllIlllIIlllIlIlIIlllll;
    }
    
    @Override
    public void println(final Object llllllllllllIlllIIlllIlIlIIIllll) {
        this.logString(String.valueOf(llllllllllllIlllIIlllIlIlIIIllll));
    }
    
    private static void lIIIlIllIllIlIII() {
        (llIIIlllllllII = new int[5])[0] = "   ".length();
        LoggingPrintStream.llIIIlllllllII[1] = ((116 + 91 - 102 + 148 ^ 19 + 190 - 137 + 119) & (0xC9 ^ 0xBF ^ (0x64 ^ 0x50) ^ -" ".length()));
        LoggingPrintStream.llIIIlllllllII[2] = (4 + 75 - 0 + 65 ^ 88 + 94 - 60 + 26);
        LoggingPrintStream.llIIIlllllllII[3] = " ".length();
        LoggingPrintStream.llIIIlllllllII[4] = "  ".length();
    }
    
    private static boolean lIIIlIllIllIlIIl(final int llllllllllllIlllIIlllIlIIllIlIII, final int llllllllllllIlllIIlllIlIIllIIlll) {
        return llllllllllllIlllIIlllIlIIllIlIII < llllllllllllIlllIIlllIlIIllIIlll;
    }
    
    private void logString(final String llllllllllllIlllIIlllIlIlIIIlIIl) {
        final StackTraceElement[] llllllllllllIlllIIlllIlIlIIIlIII = Thread.currentThread().getStackTrace();
        final StackTraceElement llllllllllllIlllIIlllIlIlIIIIlll = llllllllllllIlllIIlllIlIlIIIlIII[Math.min(LoggingPrintStream.llIIIlllllllII[0], llllllllllllIlllIIlllIlIlIIIlIII.length)];
        final Logger logger = LoggingPrintStream.LOGGER;
        final String s = LoggingPrintStream.llIIIllllllIll[LoggingPrintStream.llIIIlllllllII[1]];
        final Object[] array = new Object[LoggingPrintStream.llIIIlllllllII[2]];
        array[LoggingPrintStream.llIIIlllllllII[1]] = this.domain;
        array[LoggingPrintStream.llIIIlllllllII[3]] = llllllllllllIlllIIlllIlIlIIIIlll.getFileName();
        array[LoggingPrintStream.llIIIlllllllII[4]] = llllllllllllIlllIIlllIlIlIIIIlll.getLineNumber();
        array[LoggingPrintStream.llIIIlllllllII[0]] = llllllllllllIlllIIlllIlIlIIIlIIl;
        logger.info(s, array);
    }
    
    static {
        lIIIlIllIllIlIII();
        lIIIlIllIllIIlll();
        LOGGER = LogManager.getLogger();
    }
}
