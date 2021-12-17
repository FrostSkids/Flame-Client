// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.client.resources;

import java.util.zip.ZipEntry;
import java.io.InputStream;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.io.IOException;
import java.util.Set;
import java.io.File;
import java.util.zip.ZipFile;
import com.google.common.base.Splitter;
import java.io.Closeable;

public class FileResourcePack extends AbstractResourcePack implements Closeable
{
    private /* synthetic */ ZipFile resourcePackZipFile;
    private static final /* synthetic */ int[] lIIlIIIIlllIll;
    
    public FileResourcePack(final File lllllllllllllIIlllIlIlIlIIIlllII) {
        super(lllllllllllllIIlllIlIlIlIIIlllII);
    }
    
    @Override
    public Set<String> getResourceDomains() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: invokespecial   net/minecraft/client/resources/FileResourcePack.getResourcePackZipFile:()Ljava/util/zip/ZipFile;
        //     4: astore_1        /* lllllllllllllIIlllIlIlIIlllllIlI */
        //     5: ldc             ""
        //     7: invokevirtual   java/lang/String.length:()I
        //    10: pop            
        //    11: ldc             " "
        //    13: invokevirtual   java/lang/String.length:()I
        //    16: ldc             " "
        //    18: invokevirtual   java/lang/String.length:()I
        //    21: if_icmpge       31
        //    24: aconst_null    
        //    25: areturn        
        //    26: astore_2        /* lllllllllllllIIlllIlIlIIlllllIII */
        //    27: invokestatic    java/util/Collections.emptySet:()Ljava/util/Set;
        //    30: areturn        
        //    31: aload_1         /* lllllllllllllIIlllIlIlIIlllllIIl */
        //    32: invokevirtual   java/util/zip/ZipFile.entries:()Ljava/util/Enumeration;
        //    35: astore_2        /* lllllllllllllIIlllIlIlIIllllIlll */
        //    36: invokestatic    com/google/common/collect/Sets.newHashSet:()Ljava/util/HashSet;
        //    39: astore_3        /* lllllllllllllIIlllIlIlIIllllIllI */
        //    40: ldc             ""
        //    42: invokevirtual   java/lang/String.length:()I
        //    45: pop            
        //    46: aconst_null    
        //    47: ifnull          195
        //    50: aconst_null    
        //    51: areturn        
        //    52: aload_2         /* lllllllllllllIIlllIlIlIIllllIlll */
        //    53: invokeinterface java/util/Enumeration.nextElement:()Ljava/lang/Object;
        //    58: checkcast       Ljava/util/zip/ZipEntry;
        //    61: astore          lllllllllllllIIlllIlIlIIllllIlIl
        //    63: aload           lllllllllllllIIlllIlIlIIllllIlIl
        //    65: invokevirtual   java/util/zip/ZipEntry.getName:()Ljava/lang/String;
        //    68: astore          lllllllllllllIIlllIlIlIIllllIlII
        //    70: aload           lllllllllllllIIlllIlIlIIllllIlII
        //    72: getstatic       net/minecraft/client/resources/FileResourcePack.lIIlIIIIlllIlI:[Ljava/lang/String;
        //    75: getstatic       net/minecraft/client/resources/FileResourcePack.lIIlIIIIlllIll:[I
        //    78: iconst_3       
        //    79: iaload         
        //    80: aaload         
        //    81: invokevirtual   java/lang/String.startsWith:(Ljava/lang/String;)Z
        //    84: invokestatic    net/minecraft/client/resources/FileResourcePack.llIIlIlIIIllllI:(I)Z
        //    87: ifeq            195
        //    90: getstatic       net/minecraft/client/resources/FileResourcePack.entryNameSplitter:Lcom/google/common/base/Splitter;
        //    93: aload           lllllllllllllIIlllIlIlIIllllIlII
        //    95: invokevirtual   com/google/common/base/Splitter.split:(Ljava/lang/CharSequence;)Ljava/lang/Iterable;
        //    98: invokestatic    com/google/common/collect/Lists.newArrayList:(Ljava/lang/Iterable;)Ljava/util/ArrayList;
        //   101: astore          lllllllllllllIIlllIlIlIIllllIIll
        //   103: aload           lllllllllllllIIlllIlIlIIllllIIll
        //   105: invokeinterface java/util/List.size:()I
        //   110: getstatic       net/minecraft/client/resources/FileResourcePack.lIIlIIIIlllIll:[I
        //   113: iconst_2       
        //   114: iaload         
        //   115: invokestatic    net/minecraft/client/resources/FileResourcePack.llIIlIlIIIlllll:(II)Z
        //   118: ifeq            195
        //   121: aload           lllllllllllllIIlllIlIlIIllllIIll
        //   123: getstatic       net/minecraft/client/resources/FileResourcePack.lIIlIIIIlllIll:[I
        //   126: iconst_2       
        //   127: iaload         
        //   128: invokeinterface java/util/List.get:(I)Ljava/lang/Object;
        //   133: checkcast       Ljava/lang/String;
        //   136: astore          lllllllllllllIIlllIlIlIIllllIIlI
        //   138: aload           lllllllllllllIIlllIlIlIIllllIIlI
        //   140: aload           lllllllllllllIIlllIlIlIIllllIIlI
        //   142: invokevirtual   java/lang/String.toLowerCase:()Ljava/lang/String;
        //   145: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   148: invokestatic    net/minecraft/client/resources/FileResourcePack.llIIlIlIIlIIIII:(I)Z
        //   151: ifeq            181
        //   154: aload_0         /* lllllllllllllIIlllIlIlIIllllIIIl */
        //   155: aload           lllllllllllllIIlllIlIlIIllllIIlI
        //   157: invokevirtual   net/minecraft/client/resources/FileResourcePack.logNameNotLowercase:(Ljava/lang/String;)V
        //   160: ldc             ""
        //   162: invokevirtual   java/lang/String.length:()I
        //   165: pop            
        //   166: ldc             "   "
        //   168: invokevirtual   java/lang/String.length:()I
        //   171: ldc             " "
        //   173: invokevirtual   java/lang/String.length:()I
        //   176: if_icmpne       195
        //   179: aconst_null    
        //   180: areturn        
        //   181: aload_3         /* lllllllllllllIIlllIlIlIIllllIllI */
        //   182: aload           lllllllllllllIIlllIlIlIIllllIIlI
        //   184: invokeinterface java/util/Set.add:(Ljava/lang/Object;)Z
        //   189: ldc             ""
        //   191: invokevirtual   java/lang/String.length:()I
        //   194: pop2           
        //   195: aload_2         /* lllllllllllllIIlllIlIlIIllllIlll */
        //   196: invokeinterface java/util/Enumeration.hasMoreElements:()Z
        //   201: invokestatic    net/minecraft/client/resources/FileResourcePack.llIIlIlIIlIIIII:(I)Z
        //   204: ifeq            52
        //   207: aload_3         /* lllllllllllllIIlllIlIlIIllllIllI */
        //   208: areturn        
        //    Signature:
        //  ()Ljava/util/Set<Ljava/lang/String;>;
        //    StackMapTable: 00 05 5A 07 00 1F FC 00 04 07 00 34 FD 00 14 07 00 40 07 00 AB FF 00 80 00 08 07 00 02 07 00 34 07 00 40 07 00 AB 07 00 46 07 00 27 07 00 AD 07 00 27 00 00 FF 00 0D 00 04 07 00 02 07 00 34 07 00 40 07 00 AB 00 00
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  0      5      26     31     Ljava/io/IOException;
        // 
        // The error that occurred was:
        // 
        // java.lang.NullPointerException
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    private static boolean llIIlIlIIlIIIII(final int lllllllllllllIIlllIlIlIIllIIlIll) {
        return lllllllllllllIIlllIlIlIIllIIlIll == 0;
    }
    
    private static boolean llIIlIlIIIlllII(final Object lllllllllllllIIlllIlIlIIllIIllll) {
        return lllllllllllllIIlllIlIlIIllIIllll == null;
    }
    
    @Override
    public void close() throws IOException {
        if (llIIlIlIIIlllIl(this.resourcePackZipFile)) {
            this.resourcePackZipFile.close();
            this.resourcePackZipFile = null;
        }
    }
    
    private static boolean llIIlIlIIIlllll(final int lllllllllllllIIlllIlIlIIllIlIlII, final int lllllllllllllIIlllIlIlIIllIlIIll) {
        return lllllllllllllIIlllIlIlIIllIlIlII > lllllllllllllIIlllIlIlIIllIlIIll;
    }
    
    private static void llIIlIlIIIllIlI() {
        (lIIlIIIIlllIlI = new String[FileResourcePack.lIIlIIIIlllIll[2]])[FileResourcePack.lIIlIIIIlllIll[3]] = llIIlIlIIIllIIl("XguWyf5vsRI=", "MISgg");
    }
    
    static {
        llIIlIlIIIllIll();
        llIIlIlIIIllIlI();
        entryNameSplitter = Splitter.on((char)FileResourcePack.lIIlIIIIlllIll[0]).omitEmptyStrings().limit(FileResourcePack.lIIlIIIIlllIll[1]);
    }
    
    private static String llIIlIlIIIllIIl(final String lllllllllllllIIlllIlIlIIllIllIlI, final String lllllllllllllIIlllIlIlIIllIllIll) {
        try {
            final SecretKeySpec lllllllllllllIIlllIlIlIIllIlllll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIIlllIlIlIIllIllIll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lllllllllllllIIlllIlIlIIllIllllI = Cipher.getInstance("Blowfish");
            lllllllllllllIIlllIlIlIIllIllllI.init(FileResourcePack.lIIlIIIIlllIll[4], lllllllllllllIIlllIlIlIIllIlllll);
            return new String(lllllllllllllIIlllIlIlIIllIllllI.doFinal(Base64.getDecoder().decode(lllllllllllllIIlllIlIlIIllIllIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIlllIlIlIIllIlllIl) {
            lllllllllllllIIlllIlIlIIllIlllIl.printStackTrace();
            return null;
        }
    }
    
    private ZipFile getResourcePackZipFile() throws IOException {
        if (llIIlIlIIIlllII(this.resourcePackZipFile)) {
            this.resourcePackZipFile = new ZipFile(this.resourcePackFile);
        }
        return this.resourcePackZipFile;
    }
    
    private static boolean llIIlIlIIIlllIl(final Object lllllllllllllIIlllIlIlIIllIlIIIl) {
        return lllllllllllllIIlllIlIlIIllIlIIIl != null;
    }
    
    @Override
    protected void finalize() throws Throwable {
        this.close();
        super.finalize();
    }
    
    private static boolean llIIlIlIIIllllI(final int lllllllllllllIIlllIlIlIIllIIllIl) {
        return lllllllllllllIIlllIlIlIIllIIllIl != 0;
    }
    
    private static void llIIlIlIIIllIll() {
        (lIIlIIIIlllIll = new int[5])[0] = (0x61 ^ 0x4E);
        FileResourcePack.lIIlIIIIlllIll[1] = "   ".length();
        FileResourcePack.lIIlIIIIlllIll[2] = " ".length();
        FileResourcePack.lIIlIIIIlllIll[3] = ((64 + 53 - 55 + 67 ^ 123 + 46 + 4 + 25) & (0x76 ^ 0x4D ^ (0x18 ^ 0x64) ^ -" ".length()));
        FileResourcePack.lIIlIIIIlllIll[4] = "  ".length();
    }
    
    public boolean hasResourceName(final String lllllllllllllIIlllIlIlIlIIIIlIII) {
        try {
            if (llIIlIlIIIlllIl(this.getResourcePackZipFile().getEntry(lllllllllllllIIlllIlIlIlIIIIlIII))) {
                return FileResourcePack.lIIlIIIIlllIll[2] != 0;
            }
            return FileResourcePack.lIIlIIIIlllIll[3] != 0;
        }
        catch (IOException lllllllllllllIIlllIlIlIlIIIIIlll) {
            return FileResourcePack.lIIlIIIIlllIll[3] != 0;
        }
    }
    
    @Override
    protected InputStream getInputStreamByName(final String lllllllllllllIIlllIlIlIlIIIlIIll) throws IOException {
        final ZipFile lllllllllllllIIlllIlIlIlIIIlIIlI = this.getResourcePackZipFile();
        final ZipEntry lllllllllllllIIlllIlIlIlIIIlIIIl = lllllllllllllIIlllIlIlIlIIIlIIlI.getEntry(lllllllllllllIIlllIlIlIlIIIlIIll);
        if (llIIlIlIIIlllII(lllllllllllllIIlllIlIlIlIIIlIIIl)) {
            throw new ResourcePackFileNotFoundException(this.resourcePackFile, lllllllllllllIIlllIlIlIlIIIlIIll);
        }
        return lllllllllllllIIlllIlIlIlIIIlIIlI.getInputStream(lllllllllllllIIlllIlIlIlIIIlIIIl);
    }
}
