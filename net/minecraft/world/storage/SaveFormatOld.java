// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.world.storage;

import org.apache.logging.log4j.LogManager;
import net.minecraft.client.AnvilConverterException;
import com.google.common.collect.Lists;
import java.util.List;
import net.minecraft.util.IProgressUpdate;
import net.minecraft.nbt.NBTTagCompound;
import java.io.OutputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import net.minecraft.nbt.CompressedStreamTools;
import java.io.FileInputStream;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import org.apache.logging.log4j.Logger;
import java.io.File;

public class SaveFormatOld implements ISaveFormat
{
    private static final /* synthetic */ String[] llIIllIIlIllII;
    protected final /* synthetic */ File savesDirectory;
    private static final /* synthetic */ Logger logger;
    private static final /* synthetic */ int[] llIIllIIlIllIl;
    
    private static void lIIIlllIlIIlllII() {
        (llIIllIIlIllIl = new int[21])[0] = ((0x54 ^ 0x6D ^ (0x79 ^ 0x7D)) & (110 + 78 - 153 + 113 ^ 114 + 98 - 209 + 166 ^ -" ".length()));
        SaveFormatOld.llIIllIIlIllIl[1] = " ".length();
        SaveFormatOld.llIIllIIlIllIl[2] = "  ".length();
        SaveFormatOld.llIIllIIlIllIl[3] = (0x23 ^ 0x26);
        SaveFormatOld.llIIllIIlIllIl[4] = "   ".length();
        SaveFormatOld.llIIllIIlIllIl[5] = (69 + 126 - 90 + 64 ^ 146 + 107 - 205 + 125);
        SaveFormatOld.llIIllIIlIllIl[6] = (0x21 ^ 0x27);
        SaveFormatOld.llIIllIIlIllIl[7] = (0x67 ^ 0x60);
        SaveFormatOld.llIIllIIlIllIl[8] = (0xCA ^ 0xC2);
        SaveFormatOld.llIIllIIlIllIl[9] = (41 + 61 - 45 + 147 ^ 104 + 181 - 97 + 9);
        SaveFormatOld.llIIllIIlIllIl[10] = (0xA5 ^ 0xAF);
        SaveFormatOld.llIIllIIlIllIl[11] = (0x7 ^ 0xC);
        SaveFormatOld.llIIllIIlIllIl[12] = (0xBA ^ 0xB6);
        SaveFormatOld.llIIllIIlIllIl[13] = (0x67 ^ 0x6A);
        SaveFormatOld.llIIllIIlIllIl[14] = (0x3F ^ 0x31);
        SaveFormatOld.llIIllIIlIllIl[15] = (0x4E ^ 0x41);
        SaveFormatOld.llIIllIIlIllIl[16] = (169 + 0 - 150 + 163 ^ 92 + 86 - 162 + 150);
        SaveFormatOld.llIIllIIlIllIl[17] = (0x92 ^ 0x83);
        SaveFormatOld.llIIllIIlIllIl[18] = (0x51 ^ 0x43);
        SaveFormatOld.llIIllIIlIllIl[19] = (0xAC ^ 0xBF);
        SaveFormatOld.llIIllIIlIllIl[20] = (0x35 ^ 0xC ^ (0x54 ^ 0x79));
    }
    
    @Override
    public boolean deleteWorldDirectory(final String llllllllllllIlllIIIIIllIIIIlIIll) {
        final File llllllllllllIlllIIIIIllIIIIlIllI = new File(this.savesDirectory, llllllllllllIlllIIIIIllIIIIlIIll);
        if (lIIIlllIlIIlllIl(llllllllllllIlllIIIIIllIIIIlIllI.exists() ? 1 : 0)) {
            return SaveFormatOld.llIIllIIlIllIl[1] != 0;
        }
        SaveFormatOld.logger.info(String.valueOf(new StringBuilder(SaveFormatOld.llIIllIIlIllII[SaveFormatOld.llIIllIIlIllIl[13]]).append(llllllllllllIlllIIIIIllIIIIlIIll)));
        int llllllllllllIlllIIIIIllIIIIlIlIl = SaveFormatOld.llIIllIIlIllIl[1];
        "".length();
        if (-"  ".length() > 0) {
            return ((0x64 ^ 0x23) & ~(0x14 ^ 0x53)) != 0x0;
        }
        while (!lIIIlllIlIlIIIlI(llllllllllllIlllIIIIIllIIIIlIlIl, SaveFormatOld.llIIllIIlIllIl[3])) {
            SaveFormatOld.logger.info(String.valueOf(new StringBuilder(SaveFormatOld.llIIllIIlIllII[SaveFormatOld.llIIllIIlIllIl[14]]).append(llllllllllllIlllIIIIIllIIIIlIlIl).append(SaveFormatOld.llIIllIIlIllII[SaveFormatOld.llIIllIIlIllIl[15]])));
            if (lIIIlllIlIlIIIII(deleteFiles(llllllllllllIlllIIIIIllIIIIlIllI.listFiles()) ? 1 : 0)) {
                "".length();
                if (-"  ".length() >= 0) {
                    return ((0x7A ^ 0x1F ^ (0x6B ^ 0x51)) & (0x29 ^ 0x58 ^ (0xA9 ^ 0x87) ^ -" ".length())) != 0x0;
                }
                break;
            }
            else {
                SaveFormatOld.logger.warn(SaveFormatOld.llIIllIIlIllII[SaveFormatOld.llIIllIIlIllIl[16]]);
                if (lIIIlllIlIlIIIIl(llllllllllllIlllIIIIIllIIIIlIlIl, SaveFormatOld.llIIllIIlIllIl[3])) {
                    try {
                        Thread.sleep(500L);
                        "".length();
                        if (((0x68 ^ 0x7B) & ~(0x4 ^ 0x17)) < 0) {
                            return ((0x77 ^ 0x4C) & ~(0x46 ^ 0x7D)) != 0x0;
                        }
                    }
                    catch (InterruptedException ex) {}
                }
                ++llllllllllllIlllIIIIIllIIIIlIlIl;
            }
        }
        return llllllllllllIlllIIIIIllIIIIlIllI.delete();
    }
    
    @Override
    public boolean canLoadWorld(final String llllllllllllIlllIIIIIlIlllllIIlI) {
        final File llllllllllllIlllIIIIIlIlllllIIIl = new File(this.savesDirectory, llllllllllllIlllIIIIIlIlllllIIlI);
        return llllllllllllIlllIIIIIlIlllllIIIl.isDirectory();
    }
    
    private static String lIIIlllIlIIllIII(final String llllllllllllIlllIIIIIlIllIllllll, final String llllllllllllIlllIIIIIlIlllIIIIII) {
        try {
            final SecretKeySpec llllllllllllIlllIIIIIlIlllIIIlII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIlllIIIIIlIlllIIIIII.getBytes(StandardCharsets.UTF_8)), SaveFormatOld.llIIllIIlIllIl[8]), "DES");
            final Cipher llllllllllllIlllIIIIIlIlllIIIIll = Cipher.getInstance("DES");
            llllllllllllIlllIIIIIlIlllIIIIll.init(SaveFormatOld.llIIllIIlIllIl[2], llllllllllllIlllIIIIIlIlllIIIlII);
            return new String(llllllllllllIlllIIIIIlIlllIIIIll.doFinal(Base64.getDecoder().decode(llllllllllllIlllIIIIIlIllIllllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIlllIIIIIlIlllIIIIlI) {
            llllllllllllIlllIIIIIlIlllIIIIlI.printStackTrace();
            return null;
        }
    }
    
    @Override
    public boolean isOldMapFormat(final String llllllllllllIlllIIIIIlIllllllIlI) {
        return SaveFormatOld.llIIllIIlIllIl[0] != 0;
    }
    
    @Override
    public ISaveHandler getSaveLoader(final String llllllllllllIlllIIIIIlIlllllllll, final boolean llllllllllllIlllIIIIIlIllllllllI) {
        return new SaveHandler(this.savesDirectory, llllllllllllIlllIIIIIlIlllllllll, llllllllllllIlllIIIIIlIllllllllI);
    }
    
    @Override
    public String getName() {
        return SaveFormatOld.llIIllIIlIllII[SaveFormatOld.llIIllIIlIllIl[0]];
    }
    
    private static void lIIIlllIlIIllIll() {
        (llIIllIIlIllII = new String[SaveFormatOld.llIIllIIlIllIl[20]])[SaveFormatOld.llIIllIIlIllIl[0]] = lIIIlllIlIIllIII("ILVEc351eBf17499QfmLeQ==", "aqyyg");
        SaveFormatOld.llIIllIIlIllII[SaveFormatOld.llIIllIIlIllIl[1]] = lIIIlllIlIIllIIl("EB0oKQU=", "GrZEa");
        SaveFormatOld.llIIllIIlIllII[SaveFormatOld.llIIllIIlIllIl[2]] = lIIIlllIlIIllIIl("", "MQyEr");
        SaveFormatOld.llIIllIIlIllII[SaveFormatOld.llIIllIIlIllIl[4]] = lIIIlllIlIIllIII("ROltas9rHljbIpl9U7tKBg==", "hrcKc");
        SaveFormatOld.llIIllIIlIllII[SaveFormatOld.llIIllIIlIllIl[5]] = lIIIlllIlIIllIII("Ae6fAdnVlBw=", "ijmjT");
        SaveFormatOld.llIIllIIlIllII[SaveFormatOld.llIIllIIlIllIl[3]] = lIIIlllIlIIllIII("r5ke2ToNjfSaAXDYM/DQHgGMnLICuf47", "tZLxJ");
        SaveFormatOld.llIIllIIlIllII[SaveFormatOld.llIIllIIlIllIl[6]] = lIIIlllIlIIllIlI("knWqbQCxX0QXZp6P/9ndjw==", "YtGzX");
        SaveFormatOld.llIIllIIlIllII[SaveFormatOld.llIIllIIlIllIl[7]] = lIIIlllIlIIllIlI("BdN2GAR8MMM=", "lKfDS");
        SaveFormatOld.llIIllIIlIllII[SaveFormatOld.llIIllIIlIllIl[8]] = lIIIlllIlIIllIII("OD4FIrip8lOk3ppN/+X6BcYFQ4Wu4MWT", "stxWJ");
        SaveFormatOld.llIIllIIlIllII[SaveFormatOld.llIIllIIlIllIl[9]] = lIIIlllIlIIllIlI("jLOfg2f6/WWgyx+vvjQ4jA==", "JZyTb");
        SaveFormatOld.llIIllIIlIllII[SaveFormatOld.llIIllIIlIllIl[10]] = lIIIlllIlIIllIII("UVwJbMNzoqQ=", "yvDDZ");
        SaveFormatOld.llIIllIIlIllII[SaveFormatOld.llIIllIIlIllIl[11]] = lIIIlllIlIIllIIl("JwIjKyElBjgr", "kgUNM");
        SaveFormatOld.llIIllIIlIllII[SaveFormatOld.llIIllIIlIllIl[12]] = lIIIlllIlIIllIIl("Gy4EOBc2ZgV0HjkqFHQdPTZROBYuJB0=", "XAqTs");
        SaveFormatOld.llIIllIIlIllII[SaveFormatOld.llIIllIIlIllIl[13]] = lIIIlllIlIIllIlI("vL7bAAIrzsonBh18Ay6vlA==", "mzNLP");
        SaveFormatOld.llIIllIIlIllII[SaveFormatOld.llIIllIIlIllIl[14]] = lIIIlllIlIIllIIl("MAIDHSoBAlc=", "qvwxG");
        SaveFormatOld.llIIllIIlIllII[SaveFormatOld.llIIllIIlIllIl[15]] = lIIIlllIlIIllIII("9YJsZcgh6R8=", "eQOcO");
        SaveFormatOld.llIIllIIlIllII[SaveFormatOld.llIIllIIlIllIl[16]] = lIIIlllIlIIllIII("L2k3cEdvI57/fguQTxLq4ejKVP3G4aKzuq4UvwHBoyezxIJIK/Ux3Q==", "spbpR");
        SaveFormatOld.llIIllIIlIllII[SaveFormatOld.llIIllIIlIllIl[17]] = lIIIlllIlIIllIlI("PdIqm2DV96nVkXQKzZtTFQ==", "oqVvn");
        SaveFormatOld.llIIllIIlIllII[SaveFormatOld.llIIllIIlIllIl[18]] = lIIIlllIlIIllIII("1wjMzNfEcLRQQm9FT0CbbuQWZM39sYHfAe6PqfqYmTk=", "khgsv");
        SaveFormatOld.llIIllIIlIllII[SaveFormatOld.llIIllIIlIllIl[19]] = lIIIlllIlIIllIIl("EwwvDS4+RC5BLjUPPxUvcAUzDS9w", "PcZaJ");
    }
    
    @Override
    public void renameWorld(final String llllllllllllIlllIIIIIllIIIllIlll, final String llllllllllllIlllIIIIIllIIIllIllI) {
        final File llllllllllllIlllIIIIIllIIIllIlIl = new File(this.savesDirectory, llllllllllllIlllIIIIIllIIIllIlll);
        if (lIIIlllIlIlIIIII(llllllllllllIlllIIIIIllIIIllIlIl.exists() ? 1 : 0)) {
            final File llllllllllllIlllIIIIIllIIIllIlII = new File(llllllllllllIlllIIIIIllIIIllIlIl, SaveFormatOld.llIIllIIlIllII[SaveFormatOld.llIIllIIlIllIl[9]]);
            if (lIIIlllIlIlIIIII(llllllllllllIlllIIIIIllIIIllIlII.exists() ? 1 : 0)) {
                try {
                    final NBTTagCompound llllllllllllIlllIIIIIllIIIllIIll = CompressedStreamTools.readCompressed(new FileInputStream(llllllllllllIlllIIIIIllIIIllIlII));
                    final NBTTagCompound llllllllllllIlllIIIIIllIIIllIIlI = llllllllllllIlllIIIIIllIIIllIIll.getCompoundTag(SaveFormatOld.llIIllIIlIllII[SaveFormatOld.llIIllIIlIllIl[10]]);
                    llllllllllllIlllIIIIIllIIIllIIlI.setString(SaveFormatOld.llIIllIIlIllII[SaveFormatOld.llIIllIIlIllIl[11]], llllllllllllIlllIIIIIllIIIllIllI);
                    CompressedStreamTools.writeCompressed(llllllllllllIlllIIIIIllIIIllIIll, new FileOutputStream(llllllllllllIlllIIIIIllIIIllIlII));
                    "".length();
                    if ((0x39 ^ 0x3D) < " ".length()) {
                        return;
                    }
                }
                catch (Exception llllllllllllIlllIIIIIllIIIllIIIl) {
                    llllllllllllIlllIIIIIllIIIllIIIl.printStackTrace();
                }
            }
        }
    }
    
    private static boolean lIIIlllIlIIlllll(final int llllllllllllIlllIIIIIlIllIlllIIl, final int llllllllllllIlllIIIIIlIllIlllIII) {
        return llllllllllllIlllIIIIIlIllIlllIIl >= llllllllllllIlllIIIIIlIllIlllIII;
    }
    
    @Override
    public WorldInfo getWorldInfo(final String llllllllllllIlllIIIIIllIIlIIlllI) {
        final File llllllllllllIlllIIIIIllIIlIIllIl = new File(this.savesDirectory, llllllllllllIlllIIIIIllIIlIIlllI);
        if (lIIIlllIlIIlllIl(llllllllllllIlllIIIIIllIIlIIllIl.exists() ? 1 : 0)) {
            return null;
        }
        File llllllllllllIlllIIIIIllIIlIIllII = new File(llllllllllllIlllIIIIIllIIlIIllIl, SaveFormatOld.llIIllIIlIllII[SaveFormatOld.llIIllIIlIllIl[4]]);
        if (lIIIlllIlIlIIIII(llllllllllllIlllIIIIIllIIlIIllII.exists() ? 1 : 0)) {
            try {
                final NBTTagCompound llllllllllllIlllIIIIIllIIlIIlIll = CompressedStreamTools.readCompressed(new FileInputStream(llllllllllllIlllIIIIIllIIlIIllII));
                final NBTTagCompound llllllllllllIlllIIIIIllIIlIIlIlI = llllllllllllIlllIIIIIllIIlIIlIll.getCompoundTag(SaveFormatOld.llIIllIIlIllII[SaveFormatOld.llIIllIIlIllIl[5]]);
                return new WorldInfo(llllllllllllIlllIIIIIllIIlIIlIlI);
            }
            catch (Exception llllllllllllIlllIIIIIllIIlIIlIIl) {
                SaveFormatOld.logger.error(String.valueOf(new StringBuilder(SaveFormatOld.llIIllIIlIllII[SaveFormatOld.llIIllIIlIllIl[3]]).append(llllllllllllIlllIIIIIllIIlIIllII)), (Throwable)llllllllllllIlllIIIIIllIIlIIlIIl);
            }
        }
        llllllllllllIlllIIIIIllIIlIIllII = new File(llllllllllllIlllIIIIIllIIlIIllIl, SaveFormatOld.llIIllIIlIllII[SaveFormatOld.llIIllIIlIllIl[6]]);
        if (lIIIlllIlIlIIIII(llllllllllllIlllIIIIIllIIlIIllII.exists() ? 1 : 0)) {
            try {
                final NBTTagCompound llllllllllllIlllIIIIIllIIlIIlIII = CompressedStreamTools.readCompressed(new FileInputStream(llllllllllllIlllIIIIIllIIlIIllII));
                final NBTTagCompound llllllllllllIlllIIIIIllIIlIIIlll = llllllllllllIlllIIIIIllIIlIIlIII.getCompoundTag(SaveFormatOld.llIIllIIlIllII[SaveFormatOld.llIIllIIlIllIl[7]]);
                return new WorldInfo(llllllllllllIlllIIIIIllIIlIIIlll);
            }
            catch (Exception llllllllllllIlllIIIIIllIIlIIIllI) {
                SaveFormatOld.logger.error(String.valueOf(new StringBuilder(SaveFormatOld.llIIllIIlIllII[SaveFormatOld.llIIllIIlIllIl[8]]).append(llllllllllllIlllIIIIIllIIlIIllII)), (Throwable)llllllllllllIlllIIIIIllIIlIIIllI);
            }
        }
        return null;
    }
    
    private static boolean lIIIlllIlIlIIIIl(final int llllllllllllIlllIIIIIlIllIllIlIl, final int llllllllllllIlllIIIIIlIllIllIlII) {
        return llllllllllllIlllIIIIIlIllIllIlIl < llllllllllllIlllIIIIIlIllIllIlII;
    }
    
    @Override
    public boolean convertMapFormat(final String llllllllllllIlllIIIIIlIllllllIII, final IProgressUpdate llllllllllllIlllIIIIIlIlllllIlll) {
        return SaveFormatOld.llIIllIIlIllIl[0] != 0;
    }
    
    private static String lIIIlllIlIIllIIl(String llllllllllllIlllIIIIIlIlllIllllI, final String llllllllllllIlllIIIIIlIlllIlllIl) {
        llllllllllllIlllIIIIIlIlllIllllI = (short)new String(Base64.getDecoder().decode(((String)llllllllllllIlllIIIIIlIlllIllllI).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder llllllllllllIlllIIIIIlIllllIIIIl = new StringBuilder();
        final char[] llllllllllllIlllIIIIIlIllllIIIII = llllllllllllIlllIIIIIlIlllIlllIl.toCharArray();
        int llllllllllllIlllIIIIIlIlllIlllll = SaveFormatOld.llIIllIIlIllIl[0];
        final short llllllllllllIlllIIIIIlIlllIllIIl = (Object)((String)llllllllllllIlllIIIIIlIlllIllllI).toCharArray();
        final Exception llllllllllllIlllIIIIIlIlllIllIII = (Exception)llllllllllllIlllIIIIIlIlllIllIIl.length;
        short llllllllllllIlllIIIIIlIlllIlIlll = (short)SaveFormatOld.llIIllIIlIllIl[0];
        while (lIIIlllIlIlIIIIl(llllllllllllIlllIIIIIlIlllIlIlll, (int)llllllllllllIlllIIIIIlIlllIllIII)) {
            final char llllllllllllIlllIIIIIlIllllIIlII = llllllllllllIlllIIIIIlIlllIllIIl[llllllllllllIlllIIIIIlIlllIlIlll];
            llllllllllllIlllIIIIIlIllllIIIIl.append((char)(llllllllllllIlllIIIIIlIllllIIlII ^ llllllllllllIlllIIIIIlIllllIIIII[llllllllllllIlllIIIIIlIlllIlllll % llllllllllllIlllIIIIIlIllllIIIII.length]));
            "".length();
            ++llllllllllllIlllIIIIIlIlllIlllll;
            ++llllllllllllIlllIIIIIlIlllIlIlll;
            "".length();
            if ("   ".length() == (154 + 2 - 108 + 121 ^ 57 + 6 + 27 + 83)) {
                return null;
            }
        }
        return String.valueOf(llllllllllllIlllIIIIIlIllllIIIIl);
    }
    
    private static boolean lIIIlllIlIIlllIl(final int llllllllllllIlllIIIIIlIllIlIlIlI) {
        return llllllllllllIlllIIIIIlIllIlIlIlI == 0;
    }
    
    @Override
    public List<SaveFormatComparator> getSaveList() throws AnvilConverterException {
        final List<SaveFormatComparator> llllllllllllIlllIIIIIllIIlIlllll = (List<SaveFormatComparator>)Lists.newArrayList();
        int llllllllllllIlllIIIIIllIIlIllllI = SaveFormatOld.llIIllIIlIllIl[0];
        "".length();
        if (null != null) {
            return null;
        }
        while (!lIIIlllIlIIlllll(llllllllllllIlllIIIIIllIIlIllllI, SaveFormatOld.llIIllIIlIllIl[3])) {
            final String llllllllllllIlllIIIIIllIIlIlllIl = String.valueOf(new StringBuilder(SaveFormatOld.llIIllIIlIllII[SaveFormatOld.llIIllIIlIllIl[1]]).append(llllllllllllIlllIIIIIllIIlIllllI + SaveFormatOld.llIIllIIlIllIl[1]));
            final WorldInfo llllllllllllIlllIIIIIllIIlIlllII = this.getWorldInfo(llllllllllllIlllIIIIIllIIlIlllIl);
            if (lIIIlllIlIIllllI(llllllllllllIlllIIIIIllIIlIlllII)) {
                llllllllllllIlllIIIIIllIIlIlllll.add(new SaveFormatComparator(llllllllllllIlllIIIIIllIIlIlllIl, SaveFormatOld.llIIllIIlIllII[SaveFormatOld.llIIllIIlIllIl[2]], llllllllllllIlllIIIIIllIIlIlllII.getLastTimePlayed(), llllllllllllIlllIIIIIllIIlIlllII.getSizeOnDisk(), llllllllllllIlllIIIIIllIIlIlllII.getGameType(), (boolean)(SaveFormatOld.llIIllIIlIllIl[0] != 0), llllllllllllIlllIIIIIllIIlIlllII.isHardcoreModeEnabled(), llllllllllllIlllIIIIIllIIlIlllII.areCommandsAllowed()));
                "".length();
            }
            ++llllllllllllIlllIIIIIllIIlIllllI;
        }
        return llllllllllllIlllIIIIIllIIlIlllll;
    }
    
    @Override
    public void flushCache() {
    }
    
    static {
        lIIIlllIlIIlllII();
        lIIIlllIlIIllIll();
        logger = LogManager.getLogger();
    }
    
    public SaveFormatOld(final File llllllllllllIlllIIIIIllIIllIIlll) {
        if (lIIIlllIlIIlllIl(llllllllllllIlllIIIIIllIIllIIlll.exists() ? 1 : 0)) {
            llllllllllllIlllIIIIIllIIllIIlll.mkdirs();
            "".length();
        }
        this.savesDirectory = llllllllllllIlllIIIIIllIIllIIlll;
    }
    
    @Override
    public boolean func_154335_d(final String llllllllllllIlllIIIIIllIIIlIIlII) {
        final File llllllllllllIlllIIIIIllIIIlIIIll = new File(this.savesDirectory, llllllllllllIlllIIIIIllIIIlIIlII);
        if (lIIIlllIlIlIIIII(llllllllllllIlllIIIIIllIIIlIIIll.exists() ? 1 : 0)) {
            return SaveFormatOld.llIIllIIlIllIl[0] != 0;
        }
        try {
            llllllllllllIlllIIIIIllIIIlIIIll.mkdir();
            "".length();
            llllllllllllIlllIIIIIllIIIlIIIll.delete();
            "".length();
            return SaveFormatOld.llIIllIIlIllIl[1] != 0;
        }
        catch (Throwable llllllllllllIlllIIIIIllIIIlIIIlI) {
            SaveFormatOld.logger.warn(SaveFormatOld.llIIllIIlIllII[SaveFormatOld.llIIllIIlIllIl[12]], llllllllllllIlllIIIIIllIIIlIIIlI);
            return SaveFormatOld.llIIllIIlIllIl[0] != 0;
        }
    }
    
    @Override
    public boolean func_154334_a(final String llllllllllllIlllIIIIIlIlllllllII) {
        return SaveFormatOld.llIIllIIlIllIl[0] != 0;
    }
    
    private static String lIIIlllIlIIllIlI(final String llllllllllllIlllIIIIIlIlllIIlllI, final String llllllllllllIlllIIIIIlIlllIIllIl) {
        try {
            final SecretKeySpec llllllllllllIlllIIIIIlIlllIlIIIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIlllIIIIIlIlllIIllIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher llllllllllllIlllIIIIIlIlllIlIIII = Cipher.getInstance("Blowfish");
            llllllllllllIlllIIIIIlIlllIlIIII.init(SaveFormatOld.llIIllIIlIllIl[2], llllllllllllIlllIIIIIlIlllIlIIIl);
            return new String(llllllllllllIlllIIIIIlIlllIlIIII.doFinal(Base64.getDecoder().decode(llllllllllllIlllIIIIIlIlllIIlllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIlllIIIIIlIlllIIllll) {
            llllllllllllIlllIIIIIlIlllIIllll.printStackTrace();
            return null;
        }
    }
    
    protected static boolean deleteFiles(final File[] llllllllllllIlllIIIIIllIIIIIllII) {
        int llllllllllllIlllIIIIIllIIIIIlIll = SaveFormatOld.llIIllIIlIllIl[0];
        "".length();
        if (" ".length() == "   ".length()) {
            return ((0x3 ^ 0x42) & ~(0xCE ^ 0x8F)) != 0x0;
        }
        while (!lIIIlllIlIIlllll(llllllllllllIlllIIIIIllIIIIIlIll, llllllllllllIlllIIIIIllIIIIIllII.length)) {
            final File llllllllllllIlllIIIIIllIIIIIlIlI = llllllllllllIlllIIIIIllIIIIIllII[llllllllllllIlllIIIIIllIIIIIlIll];
            SaveFormatOld.logger.debug(String.valueOf(new StringBuilder(SaveFormatOld.llIIllIIlIllII[SaveFormatOld.llIIllIIlIllIl[17]]).append(llllllllllllIlllIIIIIllIIIIIlIlI)));
            if (lIIIlllIlIlIIIII(llllllllllllIlllIIIIIllIIIIIlIlI.isDirectory() ? 1 : 0) && lIIIlllIlIIlllIl(deleteFiles(llllllllllllIlllIIIIIllIIIIIlIlI.listFiles()) ? 1 : 0)) {
                SaveFormatOld.logger.warn(String.valueOf(new StringBuilder(SaveFormatOld.llIIllIIlIllII[SaveFormatOld.llIIllIIlIllIl[18]]).append(llllllllllllIlllIIIIIllIIIIIlIlI)));
                return SaveFormatOld.llIIllIIlIllIl[0] != 0;
            }
            if (lIIIlllIlIIlllIl(llllllllllllIlllIIIIIllIIIIIlIlI.delete() ? 1 : 0)) {
                SaveFormatOld.logger.warn(String.valueOf(new StringBuilder(SaveFormatOld.llIIllIIlIllII[SaveFormatOld.llIIllIIlIllIl[19]]).append(llllllllllllIlllIIIIIllIIIIIlIlI)));
                return SaveFormatOld.llIIllIIlIllIl[0] != 0;
            }
            ++llllllllllllIlllIIIIIllIIIIIlIll;
        }
        return SaveFormatOld.llIIllIIlIllIl[1] != 0;
    }
    
    private static boolean lIIIlllIlIlIIIII(final int llllllllllllIlllIIIIIlIllIlIllII) {
        return llllllllllllIlllIIIIIlIllIlIllII != 0;
    }
    
    private static boolean lIIIlllIlIlIIIlI(final int llllllllllllIlllIIIIIlIllIllIIIl, final int llllllllllllIlllIIIIIlIllIllIIII) {
        return llllllllllllIlllIIIIIlIllIllIIIl > llllllllllllIlllIIIIIlIllIllIIII;
    }
    
    private static boolean lIIIlllIlIIllllI(final Object llllllllllllIlllIIIIIlIllIlIlllI) {
        return llllllllllllIlllIIIIIlIllIlIlllI != null;
    }
}
