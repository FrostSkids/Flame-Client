// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.nbt;

import java.io.BufferedOutputStream;
import java.util.zip.GZIPOutputStream;
import java.io.OutputStream;
import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.File;
import net.minecraft.crash.CrashReportCategory;
import net.minecraft.util.ReportedException;
import net.minecraft.crash.CrashReport;
import java.io.InputStream;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.io.DataOutput;
import java.io.IOException;
import java.io.DataInput;
import java.io.DataInputStream;

public class CompressedStreamTools
{
    private static final /* synthetic */ String[] lIlIlIIIllllIl;
    private static final /* synthetic */ int[] lIlIlIIIlllllI;
    
    public static NBTTagCompound read(final DataInputStream lllllllllllllIIIlIlIIlIlIIIlllIl) throws IOException {
        return read(lllllllllllllIIIlIlIIlIlIIIlllIl, NBTSizeTracker.INFINITE);
    }
    
    private static void lllIlIllllllllI() {
        (lIlIlIIIlllllI = new int[10])[0] = ((0xEE ^ 0xB9) & ~(0x0 ^ 0x57));
        CompressedStreamTools.lIlIlIIIlllllI[1] = " ".length();
        CompressedStreamTools.lIlIlIIIlllllI[2] = "  ".length();
        CompressedStreamTools.lIlIlIIIlllllI[3] = "   ".length();
        CompressedStreamTools.lIlIlIIIlllllI[4] = (0x96 ^ 0x8A ^ (0x88 ^ 0x90));
        CompressedStreamTools.lIlIlIIIlllllI[5] = (92 + 80 - 38 + 44 ^ 123 + 161 - 241 + 140);
        CompressedStreamTools.lIlIlIIIlllllI[6] = (0x1F ^ 0x19);
        CompressedStreamTools.lIlIlIIIlllllI[7] = (0xBF ^ 0xB8);
        CompressedStreamTools.lIlIlIIIlllllI[8] = (0xBC ^ 0xC4 ^ (0xF1 ^ 0x81));
        CompressedStreamTools.lIlIlIIIlllllI[9] = (0x3 ^ 0xA);
    }
    
    private static void writeTag(final NBTBase lllllllllllllIIIlIlIIlIlIIIIlIIl, final DataOutput lllllllllllllIIIlIlIIlIlIIIIlIlI) throws IOException {
        lllllllllllllIIIlIlIIlIlIIIIlIlI.writeByte(lllllllllllllIIIlIlIIlIlIIIIlIIl.getId());
        if (lllIlIlllllllll(lllllllllllllIIIlIlIIlIlIIIIlIIl.getId())) {
            lllllllllllllIIIlIlIIlIlIIIIlIlI.writeUTF(CompressedStreamTools.lIlIlIIIllllIl[CompressedStreamTools.lIlIlIIIlllllI[3]]);
            lllllllllllllIIIlIlIIlIlIIIIlIIl.write(lllllllllllllIIIlIlIIlIlIIIIlIlI);
        }
    }
    
    private static String lllIlIllllllIll(final String lllllllllllllIIIlIlIIlIIllIIIIll, final String lllllllllllllIIIlIlIIlIIllIIIIII) {
        try {
            final SecretKeySpec lllllllllllllIIIlIlIIlIIllIIIllI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIIIlIlIIlIIllIIIIII.getBytes(StandardCharsets.UTF_8)), CompressedStreamTools.lIlIlIIIlllllI[8]), "DES");
            final Cipher lllllllllllllIIIlIlIIlIIllIIIlIl = Cipher.getInstance("DES");
            lllllllllllllIIIlIlIIlIIllIIIlIl.init(CompressedStreamTools.lIlIlIIIlllllI[2], lllllllllllllIIIlIlIIlIIllIIIllI);
            return new String(lllllllllllllIIIlIlIIlIIllIIIlIl.doFinal(Base64.getDecoder().decode(lllllllllllllIIIlIlIIlIIllIIIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIIlIlIIlIIllIIIlII) {
            lllllllllllllIIIlIlIIlIIllIIIlII.printStackTrace();
            return null;
        }
    }
    
    public static NBTTagCompound readCompressed(final InputStream lllllllllllllIIIlIlIIlIlIlIIlllI) throws IOException {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: new             Ljava/io/BufferedInputStream;
        //     7: dup            
        //     8: new             Ljava/util/zip/GZIPInputStream;
        //    11: dup            
        //    12: aload_0         /* lllllllllllllIIIlIlIIlIlIlIlIIlI */
        //    13: invokespecial   java/util/zip/GZIPInputStream.<init>:(Ljava/io/InputStream;)V
        //    16: invokespecial   java/io/BufferedInputStream.<init>:(Ljava/io/InputStream;)V
        //    19: invokespecial   java/io/DataInputStream.<init>:(Ljava/io/InputStream;)V
        //    22: astore_1        /* lllllllllllllIIIlIlIIlIlIlIlIIIl */
        //    23: aload_1         /* lllllllllllllIIIlIlIIlIlIlIlIIIl */
        //    24: getstatic       net/minecraft/nbt/NBTSizeTracker.INFINITE:Lnet/minecraft/nbt/NBTSizeTracker;
        //    27: invokestatic    net/minecraft/nbt/CompressedStreamTools.read:(Ljava/io/DataInput;Lnet/minecraft/nbt/NBTSizeTracker;)Lnet/minecraft/nbt/NBTTagCompound;
        //    30: astore_2        /* lllllllllllllIIIlIlIIlIlIlIlIIII */
        //    31: ldc             ""
        //    33: invokevirtual   java/lang/String.length:()I
        //    36: pop            
        //    37: ldc             "   "
        //    39: invokevirtual   java/lang/String.length:()I
        //    42: ineg           
        //    43: iflt            55
        //    46: aconst_null    
        //    47: areturn        
        //    48: astore_3        /* lllllllllllllIIIlIlIIlIlIlIIlIll */
        //    49: aload_1         /* lllllllllllllIIIlIlIIlIlIlIlIIIl */
        //    50: invokevirtual   java/io/DataInputStream.close:()V
        //    53: aload_3         /* lllllllllllllIIIlIlIIlIlIlIIlIll */
        //    54: athrow         
        //    55: aload_1         /* lllllllllllllIIIlIlIIlIlIlIlIIIl */
        //    56: invokevirtual   java/io/DataInputStream.close:()V
        //    59: aload_2         /* lllllllllllllIIIlIlIIlIlIlIIllll */
        //    60: areturn        
        //    Exceptions:
        //  throws java.io.IOException
        //    StackMapTable: 00 02 FF 00 30 00 02 07 00 C5 07 00 AB 00 01 07 00 C7 FC 00 06 07 00 C9
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type
        //  -----  -----  -----  -----  ----
        //  23     48     48     55     Any
        // 
        // The error that occurred was:
        // 
        // java.lang.NullPointerException
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    private static NBTBase func_152455_a(final DataInput lllllllllllllIIIlIlIIlIIllllIlll, final int lllllllllllllIIIlIlIIlIIllllIllI, final NBTSizeTracker lllllllllllllIIIlIlIIlIIllllllIl) throws IOException {
        final byte lllllllllllllIIIlIlIIlIIllllllII = lllllllllllllIIIlIlIIlIIllllIlll.readByte();
        if (lllIllIIIIIIIII(lllllllllllllIIIlIlIIlIIllllllII)) {
            return new NBTTagEnd();
        }
        lllllllllllllIIIlIlIIlIIllllIlll.readUTF();
        "".length();
        final NBTBase lllllllllllllIIIlIlIIlIIlllllIll = NBTBase.createNewByType(lllllllllllllIIIlIlIIlIIllllllII);
        try {
            lllllllllllllIIIlIlIIlIIlllllIll.read(lllllllllllllIIIlIlIIlIIllllIlll, lllllllllllllIIIlIlIIlIIllllIllI, lllllllllllllIIIlIlIIlIIllllllIl);
            return lllllllllllllIIIlIlIIlIIlllllIll;
        }
        catch (IOException lllllllllllllIIIlIlIIlIIlllllIlI) {
            final CrashReport lllllllllllllIIIlIlIIlIIlllllIIl = CrashReport.makeCrashReport(lllllllllllllIIIlIlIIlIIlllllIlI, CompressedStreamTools.lIlIlIIIllllIl[CompressedStreamTools.lIlIlIIIlllllI[4]]);
            final CrashReportCategory lllllllllllllIIIlIlIIlIIlllllIII = lllllllllllllIIIlIlIIlIIlllllIIl.makeCategory(CompressedStreamTools.lIlIlIIIllllIl[CompressedStreamTools.lIlIlIIIlllllI[5]]);
            lllllllllllllIIIlIlIIlIIlllllIII.addCrashSection(CompressedStreamTools.lIlIlIIIllllIl[CompressedStreamTools.lIlIlIIIlllllI[6]], CompressedStreamTools.lIlIlIIIllllIl[CompressedStreamTools.lIlIlIIIlllllI[7]]);
            lllllllllllllIIIlIlIIlIIlllllIII.addCrashSection(CompressedStreamTools.lIlIlIIIllllIl[CompressedStreamTools.lIlIlIIIlllllI[8]], lllllllllllllIIIlIlIIlIIllllllII);
            throw new ReportedException(lllllllllllllIIIlIlIIlIIlllllIIl);
        }
    }
    
    public static void write(final NBTTagCompound lllllllllllllIIIlIlIIlIlIIIIllll, final DataOutput lllllllllllllIIIlIlIIlIlIIIIlllI) throws IOException {
        writeTag(lllllllllllllIIIlIlIIlIlIIIIllll, lllllllllllllIIIlIlIIlIlIIIIlllI);
    }
    
    public static void write(final NBTTagCompound lllllllllllllIIIlIlIIlIlIIlIllll, final File lllllllllllllIIIlIlIIlIlIIlIlllI) throws IOException {
        final DataOutputStream lllllllllllllIIIlIlIIlIlIIllIIII = new DataOutputStream(new FileOutputStream(lllllllllllllIIIlIlIIlIlIIlIlllI));
        try {
            write(lllllllllllllIIIlIlIIlIlIIlIllll, lllllllllllllIIIlIlIIlIlIIllIIII);
            "".length();
            if (" ".length() >= (0x94 ^ 0x90)) {
                return;
            }
        }
        finally {
            lllllllllllllIIIlIlIIlIlIIllIIII.close();
        }
        lllllllllllllIIIlIlIIlIlIIllIIII.close();
    }
    
    private static void lllIlIlllllllIl() {
        (lIlIlIIIllllIl = new String[CompressedStreamTools.lIlIlIIIlllllI[9]])[CompressedStreamTools.lIlIlIIIlllllI[0]] = lllIlIllllllIIl("JTAIOw==", "zDeKj");
        CompressedStreamTools.lIlIlIIIllllIl[CompressedStreamTools.lIlIlIIIlllllI[1]] = lllIlIllllllIlI("EaqPSKBsExPJyZ19uCQqdqreaggJwEeD", "fPAoT");
        CompressedStreamTools.lIlIlIIIllllIl[CompressedStreamTools.lIlIlIIIlllllI[2]] = lllIlIllllllIll("12g6V6APymR8r7qx4ahqeTiajd7LkPVqrSEvoYn4S2RqRLiWKDXIxQ==", "Ohrdb");
        CompressedStreamTools.lIlIlIIIllllIl[CompressedStreamTools.lIlIlIIIlllllI[3]] = lllIlIllllllIlI("Qbab9H//X34=", "eXQqO");
        CompressedStreamTools.lIlIlIIIllllIl[CompressedStreamTools.lIlIlIIIlllllI[4]] = lllIlIllllllIlI("aBfgNjIYAAq5hfmU4X78KkSBbTb3BABU", "RLRcB");
        CompressedStreamTools.lIlIlIIIllllIl[CompressedStreamTools.lIlIlIIIlllllI[5]] = lllIlIllllllIIl("CCY2SxInAw==", "FdbkF");
        CompressedStreamTools.lIlIlIIIllllIl[CompressedStreamTools.lIlIlIIIlllllI[6]] = lllIlIllllllIlI("3hYFUdLbqjGQ5GVmmVxYqw==", "oEuHh");
        CompressedStreamTools.lIlIlIIIllllIl[CompressedStreamTools.lIlIlIIIlllllI[7]] = lllIlIllllllIIl("Kjk9ARg8KTdvDTArLg==", "qlsOY");
        CompressedStreamTools.lIlIlIIIllllIl[CompressedStreamTools.lIlIlIIIlllllI[8]] = lllIlIllllllIIl("ISwrbwMMPSk=", "uMLOw");
    }
    
    private static String lllIlIllllllIlI(final String lllllllllllllIIIlIlIIlIIllIIlllI, final String lllllllllllllIIIlIlIIlIIllIIllIl) {
        try {
            final SecretKeySpec lllllllllllllIIIlIlIIlIIllIlIIll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIIIlIlIIlIIllIIllIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lllllllllllllIIIlIlIIlIIllIlIIlI = Cipher.getInstance("Blowfish");
            lllllllllllllIIIlIlIIlIIllIlIIlI.init(CompressedStreamTools.lIlIlIIIlllllI[2], lllllllllllllIIIlIlIIlIIllIlIIll);
            return new String(lllllllllllllIIIlIlIIlIIllIlIIlI.doFinal(Base64.getDecoder().decode(lllllllllllllIIIlIlIIlIIllIIlllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIIlIlIIlIIllIlIIIl) {
            lllllllllllllIIIlIlIIlIIllIlIIIl.printStackTrace();
            return null;
        }
    }
    
    static {
        lllIlIllllllllI();
        lllIlIlllllllIl();
    }
    
    public static NBTTagCompound read(final DataInput lllllllllllllIIIlIlIIlIlIIIllIIl, final NBTSizeTracker lllllllllllllIIIlIlIIlIlIIIlIlIl) throws IOException {
        final NBTBase lllllllllllllIIIlIlIIlIlIIIlIlll = func_152455_a(lllllllllllllIIIlIlIIlIlIIIllIIl, CompressedStreamTools.lIlIlIIIlllllI[0], lllllllllllllIIIlIlIIlIlIIIlIlIl);
        if (lllIlIlllllllll((lllllllllllllIIIlIlIIlIlIIIlIlll instanceof NBTTagCompound) ? 1 : 0)) {
            return (NBTTagCompound)lllllllllllllIIIlIlIIlIlIIIlIlll;
        }
        throw new IOException(CompressedStreamTools.lIlIlIIIllllIl[CompressedStreamTools.lIlIlIIIlllllI[2]]);
    }
    
    public static void safeWrite(final NBTTagCompound lllllllllllllIIIlIlIIlIlIIlllIIl, final File lllllllllllllIIIlIlIIlIlIIlllIII) throws IOException {
        final File lllllllllllllIIIlIlIIlIlIIlllIlI = new File(String.valueOf(new StringBuilder(String.valueOf(lllllllllllllIIIlIlIIlIlIIlllIII.getAbsolutePath())).append(CompressedStreamTools.lIlIlIIIllllIl[CompressedStreamTools.lIlIlIIIlllllI[0]])));
        if (lllIlIlllllllll(lllllllllllllIIIlIlIIlIlIIlllIlI.exists() ? 1 : 0)) {
            lllllllllllllIIIlIlIIlIlIIlllIlI.delete();
            "".length();
        }
        write(lllllllllllllIIIlIlIIlIlIIlllIIl, lllllllllllllIIIlIlIIlIlIIlllIlI);
        if (lllIlIlllllllll(lllllllllllllIIIlIlIIlIlIIlllIII.exists() ? 1 : 0)) {
            lllllllllllllIIIlIlIIlIlIIlllIII.delete();
            "".length();
        }
        if (lllIlIlllllllll(lllllllllllllIIIlIlIIlIlIIlllIII.exists() ? 1 : 0)) {
            throw new IOException(String.valueOf(new StringBuilder(CompressedStreamTools.lIlIlIIIllllIl[CompressedStreamTools.lIlIlIIIlllllI[1]]).append(lllllllllllllIIIlIlIIlIlIIlllIII)));
        }
        lllllllllllllIIIlIlIIlIlIIlllIlI.renameTo(lllllllllllllIIIlIlIIlIlIIlllIII);
        "".length();
    }
    
    private static boolean lllIlIlllllllll(final int lllllllllllllIIIlIlIIlIIlIlllIII) {
        return lllllllllllllIIIlIlIIlIIlIlllIII != 0;
    }
    
    private static boolean lllIllIIIIIIIIl(final int lllllllllllllIIIlIlIIlIIlIlllIll, final int lllllllllllllIIIlIlIIlIIlIlllIlI) {
        return lllllllllllllIIIlIlIIlIIlIlllIll < lllllllllllllIIIlIlIIlIIlIlllIlI;
    }
    
    private static String lllIlIllllllIIl(String lllllllllllllIIIlIlIIlIIlllIIIII, final String lllllllllllllIIIlIlIIlIIllIlllll) {
        lllllllllllllIIIlIlIIlIIlllIIIII = (double)new String(Base64.getDecoder().decode(((String)lllllllllllllIIIlIlIIlIIlllIIIII).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIIIlIlIIlIIlllIIIll = new StringBuilder();
        final char[] lllllllllllllIIIlIlIIlIIlllIIIlI = lllllllllllllIIIlIlIIlIIllIlllll.toCharArray();
        int lllllllllllllIIIlIlIIlIIlllIIIIl = CompressedStreamTools.lIlIlIIIlllllI[0];
        final String lllllllllllllIIIlIlIIlIIllIllIll = (Object)((String)lllllllllllllIIIlIlIIlIIlllIIIII).toCharArray();
        final char lllllllllllllIIIlIlIIlIIllIllIlI = (char)lllllllllllllIIIlIlIIlIIllIllIll.length;
        String lllllllllllllIIIlIlIIlIIllIllIIl = (String)CompressedStreamTools.lIlIlIIIlllllI[0];
        while (lllIllIIIIIIIIl((int)lllllllllllllIIIlIlIIlIIllIllIIl, lllllllllllllIIIlIlIIlIIllIllIlI)) {
            final char lllllllllllllIIIlIlIIlIIlllIIllI = lllllllllllllIIIlIlIIlIIllIllIll[lllllllllllllIIIlIlIIlIIllIllIIl];
            lllllllllllllIIIlIlIIlIIlllIIIll.append((char)(lllllllllllllIIIlIlIIlIIlllIIllI ^ lllllllllllllIIIlIlIIlIIlllIIIlI[lllllllllllllIIIlIlIIlIIlllIIIIl % lllllllllllllIIIlIlIIlIIlllIIIlI.length]));
            "".length();
            ++lllllllllllllIIIlIlIIlIIlllIIIIl;
            ++lllllllllllllIIIlIlIIlIIllIllIIl;
            "".length();
            if (-" ".length() >= (0x5B ^ 0x56 ^ (0x2A ^ 0x23))) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIIIlIlIIlIIlllIIIll);
    }
    
    public static NBTTagCompound read(final File lllllllllllllIIIlIlIIlIlIIlIIlll) throws IOException {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: invokevirtual   java/io/File.exists:()Z
        //     4: invokestatic    net/minecraft/nbt/CompressedStreamTools.lllIllIIIIIIIII:(I)Z
        //     7: ifeq            12
        //    10: aconst_null    
        //    11: areturn        
        //    12: new             Ljava/io/DataInputStream;
        //    15: dup            
        //    16: new             Ljava/io/FileInputStream;
        //    19: dup            
        //    20: aload_0         /* lllllllllllllIIIlIlIIlIlIIlIIIll */
        //    21: invokespecial   java/io/FileInputStream.<init>:(Ljava/io/File;)V
        //    24: invokespecial   java/io/DataInputStream.<init>:(Ljava/io/InputStream;)V
        //    27: astore_1        /* lllllllllllllIIIlIlIIlIlIIlIIllI */
        //    28: aload_1         /* lllllllllllllIIIlIlIIlIlIIlIIllI */
        //    29: getstatic       net/minecraft/nbt/NBTSizeTracker.INFINITE:Lnet/minecraft/nbt/NBTSizeTracker;
        //    32: invokestatic    net/minecraft/nbt/CompressedStreamTools.read:(Ljava/io/DataInput;Lnet/minecraft/nbt/NBTSizeTracker;)Lnet/minecraft/nbt/NBTTagCompound;
        //    35: astore_2        /* lllllllllllllIIIlIlIIlIlIIlIIIIl */
        //    36: ldc             ""
        //    38: invokevirtual   java/lang/String.length:()I
        //    41: pop            
        //    42: ldc             " "
        //    44: invokevirtual   java/lang/String.length:()I
        //    47: ldc             "   "
        //    49: invokevirtual   java/lang/String.length:()I
        //    52: if_icmple       64
        //    55: aconst_null    
        //    56: areturn        
        //    57: astore_3        /* lllllllllllllIIIlIlIIlIlIIlIIIII */
        //    58: aload_1         /* lllllllllllllIIIlIlIIlIlIIlIIllI */
        //    59: invokevirtual   java/io/DataInputStream.close:()V
        //    62: aload_3         /* lllllllllllllIIIlIlIIlIlIIlIIIII */
        //    63: athrow         
        //    64: aload_1         /* lllllllllllllIIIlIlIIlIlIIlIIllI */
        //    65: invokevirtual   java/io/DataInputStream.close:()V
        //    68: aload_2         /* lllllllllllllIIIlIlIIlIlIIlIIlII */
        //    69: areturn        
        //    Exceptions:
        //  throws java.io.IOException
        //    StackMapTable: 00 03 0C FF 00 2C 00 02 07 01 31 07 00 AB 00 01 07 00 C7 FC 00 06 07 00 C9
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type
        //  -----  -----  -----  -----  ----
        //  28     57     57     64     Any
        // 
        // The error that occurred was:
        // 
        // java.lang.NullPointerException
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    public static void writeCompressed(final NBTTagCompound lllllllllllllIIIlIlIIlIlIlIIIllI, final OutputStream lllllllllllllIIIlIlIIlIlIlIIIlIl) throws IOException {
        final DataOutputStream lllllllllllllIIIlIlIIlIlIlIIIlII = new DataOutputStream(new BufferedOutputStream(new GZIPOutputStream(lllllllllllllIIIlIlIIlIlIlIIIlIl)));
        try {
            write(lllllllllllllIIIlIlIIlIlIlIIIllI, lllllllllllllIIIlIlIIlIlIlIIIlII);
            "".length();
            if (" ".length() <= ((0x5D ^ 0xD ^ (0x59 ^ 0x3D)) & (0x1A ^ 0x3 ^ (0x61 ^ 0x4C) ^ -" ".length()))) {
                return;
            }
        }
        finally {
            lllllllllllllIIIlIlIIlIlIlIIIlII.close();
        }
        lllllllllllllIIIlIlIIlIlIlIIIlII.close();
    }
    
    private static boolean lllIllIIIIIIIII(final int lllllllllllllIIIlIlIIlIIlIllIllI) {
        return lllllllllllllIIIlIlIIlIIlIllIllI == 0;
    }
}
