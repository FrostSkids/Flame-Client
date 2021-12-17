// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.client.resources;

import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.io.IOException;
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.FileFilter;
import org.apache.commons.io.filefilter.DirectoryFileFilter;
import com.google.common.collect.Sets;
import java.util.Set;
import java.io.File;

public class FolderResourcePack extends AbstractResourcePack
{
    private static final /* synthetic */ int[] llllIIlllIIll;
    private static final /* synthetic */ String[] llllIIlllIIlI;
    
    private static void lIlIlIIlIIlIIll() {
        (llllIIlllIIlI = new String[FolderResourcePack.llllIIlllIIll[1]])[FolderResourcePack.llllIIlllIIll[0]] = lIlIlIIlIIlIIlI("OD80HTIqYw==", "YLGxF");
    }
    
    @Override
    protected boolean hasResourceName(final String lllllllllllllIlIlllIIIllIIlIIlIl) {
        return new File(this.resourcePackFile, lllllllllllllIlIlllIIIllIIlIIlIl).isFile();
    }
    
    @Override
    public Set<String> getResourceDomains() {
        final Set<String> lllllllllllllIlIlllIIIllIIIllIll = (Set<String>)Sets.newHashSet();
        final File lllllllllllllIlIlllIIIllIIIllIlI = new File(this.resourcePackFile, FolderResourcePack.llllIIlllIIlI[FolderResourcePack.llllIIlllIIll[0]]);
        if (lIlIlIIlIIlIlIl(lllllllllllllIlIlllIIIllIIIllIlI.isDirectory() ? 1 : 0)) {
            final long lllllllllllllIlIlllIIIllIIIlIIIl;
            final short lllllllllllllIlIlllIIIllIIIlIIlI = (short)((File[])(Object)(lllllllllllllIlIlllIIIllIIIlIIIl = (long)(Object)lllllllllllllIlIlllIIIllIIIllIlI.listFiles((FileFilter)DirectoryFileFilter.DIRECTORY))).length;
            char lllllllllllllIlIlllIIIllIIIlIIll = (char)FolderResourcePack.llllIIlllIIll[0];
            "".length();
            if (((0x25 ^ 0x15) & ~(0x20 ^ 0x10)) >= " ".length()) {
                return null;
            }
            while (!lIlIlIIlIIlIlll(lllllllllllllIlIlllIIIllIIIlIIll, lllllllllllllIlIlllIIIllIIIlIIlI)) {
                final File lllllllllllllIlIlllIIIllIIIllIIl = lllllllllllllIlIlllIIIllIIIlIIIl[lllllllllllllIlIlllIIIllIIIlIIll];
                final String lllllllllllllIlIlllIIIllIIIllIII = AbstractResourcePack.getRelativeName(lllllllllllllIlIlllIIIllIIIllIlI, lllllllllllllIlIlllIIIllIIIllIIl);
                if (lIlIlIIlIIlIllI(lllllllllllllIlIlllIIIllIIIllIII.equals(lllllllllllllIlIlllIIIllIIIllIII.toLowerCase()) ? 1 : 0)) {
                    this.logNameNotLowercase(lllllllllllllIlIlllIIIllIIIllIII);
                    "".length();
                    if ("  ".length() != "  ".length()) {
                        return null;
                    }
                }
                else {
                    lllllllllllllIlIlllIIIllIIIllIll.add(lllllllllllllIlIlllIIIllIIIllIII.substring(FolderResourcePack.llllIIlllIIll[0], lllllllllllllIlIlllIIIllIIIllIII.length() - FolderResourcePack.llllIIlllIIll[1]));
                    "".length();
                }
                ++lllllllllllllIlIlllIIIllIIIlIIll;
            }
        }
        return lllllllllllllIlIlllIIIllIIIllIll;
    }
    
    private static void lIlIlIIlIIlIlII() {
        (llllIIlllIIll = new int[2])[0] = ((0x26 ^ 0x73) & ~(0x30 ^ 0x65));
        FolderResourcePack.llllIIlllIIll[1] = " ".length();
    }
    
    @Override
    protected InputStream getInputStreamByName(final String lllllllllllllIlIlllIIIllIIlIllIl) throws IOException {
        return new BufferedInputStream(new FileInputStream(new File(this.resourcePackFile, lllllllllllllIlIlllIIIllIIlIllIl)));
    }
    
    private static String lIlIlIIlIIlIIlI(String lllllllllllllIlIlllIIIllIIIIIIII, final String lllllllllllllIlIlllIIIlIllllllll) {
        lllllllllllllIlIlllIIIllIIIIIIII = new String(Base64.getDecoder().decode(lllllllllllllIlIlllIIIllIIIIIIII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIlIlllIIIllIIIIIIll = new StringBuilder();
        final char[] lllllllllllllIlIlllIIIllIIIIIIlI = lllllllllllllIlIlllIIIlIllllllll.toCharArray();
        int lllllllllllllIlIlllIIIllIIIIIIIl = FolderResourcePack.llllIIlllIIll[0];
        final Exception lllllllllllllIlIlllIIIlIlllllIll = (Object)lllllllllllllIlIlllIIIllIIIIIIII.toCharArray();
        final String lllllllllllllIlIlllIIIlIlllllIlI = (String)lllllllllllllIlIlllIIIlIlllllIll.length;
        String lllllllllllllIlIlllIIIlIlllllIIl = (String)FolderResourcePack.llllIIlllIIll[0];
        while (lIlIlIIlIIllIII((int)lllllllllllllIlIlllIIIlIlllllIIl, (int)lllllllllllllIlIlllIIIlIlllllIlI)) {
            final char lllllllllllllIlIlllIIIllIIIIIllI = lllllllllllllIlIlllIIIlIlllllIll[lllllllllllllIlIlllIIIlIlllllIIl];
            lllllllllllllIlIlllIIIllIIIIIIll.append((char)(lllllllllllllIlIlllIIIllIIIIIllI ^ lllllllllllllIlIlllIIIllIIIIIIlI[lllllllllllllIlIlllIIIllIIIIIIIl % lllllllllllllIlIlllIIIllIIIIIIlI.length]));
            "".length();
            ++lllllllllllllIlIlllIIIllIIIIIIIl;
            ++lllllllllllllIlIlllIIIlIlllllIIl;
            "".length();
            if ("  ".length() >= "   ".length()) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIlIlllIIIllIIIIIIll);
    }
    
    private static boolean lIlIlIIlIIlIllI(final int lllllllllllllIlIlllIIIlIlllIllII) {
        return lllllllllllllIlIlllIIIlIlllIllII == 0;
    }
    
    private static boolean lIlIlIIlIIlIlIl(final int lllllllllllllIlIlllIIIlIlllIlllI) {
        return lllllllllllllIlIlllIIIlIlllIlllI != 0;
    }
    
    private static boolean lIlIlIIlIIllIII(final int lllllllllllllIlIlllIIIlIllllIIIl, final int lllllllllllllIlIlllIIIlIllllIIII) {
        return lllllllllllllIlIlllIIIlIllllIIIl < lllllllllllllIlIlllIIIlIllllIIII;
    }
    
    public FolderResourcePack(final File lllllllllllllIlIlllIIIllIIllIIIl) {
        super(lllllllllllllIlIlllIIIllIIllIIIl);
    }
    
    static {
        lIlIlIIlIIlIlII();
        lIlIlIIlIIlIIll();
    }
    
    private static boolean lIlIlIIlIIlIlll(final int lllllllllllllIlIlllIIIlIllllIlIl, final int lllllllllllllIlIlllIIIlIllllIlII) {
        return lllllllllllllIlIlllIIIlIllllIlIl >= lllllllllllllIlIlllIIIlIllllIlII;
    }
}
