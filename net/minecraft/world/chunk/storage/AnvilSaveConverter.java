// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.world.chunk.storage;

import java.util.Iterator;
import org.apache.logging.log4j.LogManager;
import java.util.Collections;
import java.io.FilenameFilter;
import java.io.DataOutputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.DataOutput;
import net.minecraft.nbt.NBTBase;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.CompressedStreamTools;
import java.util.Arrays;
import net.minecraft.world.biome.WorldChunkManager;
import net.minecraft.world.biome.WorldChunkManagerHell;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.WorldType;
import java.util.Collection;
import net.minecraft.util.IProgressUpdate;
import net.minecraft.world.storage.WorldInfo;
import java.io.File;
import org.apache.commons.lang3.StringUtils;
import com.google.common.collect.Lists;
import net.minecraft.client.AnvilConverterException;
import net.minecraft.world.storage.SaveFormatComparator;
import java.util.List;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import net.minecraft.world.storage.ISaveHandler;
import org.apache.logging.log4j.Logger;
import net.minecraft.world.storage.SaveFormatOld;

public class AnvilSaveConverter extends SaveFormatOld
{
    private static final /* synthetic */ int[] lIIIIIIlllIlII;
    private static final /* synthetic */ String[] lIIIIIIlIlIllI;
    private static final /* synthetic */ Logger logger;
    
    @Override
    public ISaveHandler getSaveLoader(final String lllllllllllllIlIlIIIIIIIlIIlIlll, final boolean lllllllllllllIlIlIIIIIIIlIIllIIl) {
        return new AnvilSaveHandler(this.savesDirectory, lllllllllllllIlIlIIIIIIIlIIlIlll, lllllllllllllIlIlIIIIIIIlIIllIIl);
    }
    
    private static boolean lIllIlIIllllllI(final Object lllllllllllllIlIIllllllllIlIIIIl, final Object lllllllllllllIlIIllllllllIlIIIII) {
        return lllllllllllllIlIIllllllllIlIIIIl == lllllllllllllIlIIllllllllIlIIIII;
    }
    
    private static String lIllIlIIIIlIIll(final String lllllllllllllIlIIlllllllllIlIIIl, final String lllllllllllllIlIIlllllllllIlIIII) {
        try {
            final SecretKeySpec lllllllllllllIlIIlllllllllIlIllI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIlIIlllllllllIlIIII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lllllllllllllIlIIlllllllllIlIlIl = Cipher.getInstance("Blowfish");
            lllllllllllllIlIIlllllllllIlIlIl.init(AnvilSaveConverter.lIIIIIIlllIlII[4], lllllllllllllIlIIlllllllllIlIllI);
            return new String(lllllllllllllIlIIlllllllllIlIlIl.doFinal(Base64.getDecoder().decode(lllllllllllllIlIIlllllllllIlIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIlIIlllllllllIlIlII) {
            lllllllllllllIlIIlllllllllIlIlII.printStackTrace();
            return null;
        }
    }
    
    @Override
    public List<SaveFormatComparator> getSaveList() throws AnvilConverterException {
        if (!lIllIlIIllllIIl(this.savesDirectory) || !lIllIlIIllllIlI(this.savesDirectory.exists() ? 1 : 0) || !lIllIlIIllllIlI(this.savesDirectory.isDirectory() ? 1 : 0)) {
            throw new AnvilConverterException(AnvilSaveConverter.lIIIIIIlIlIllI[AnvilSaveConverter.lIIIIIIlllIlII[3]]);
        }
        final List<SaveFormatComparator> lllllllllllllIlIlIIIIIIIlIllIlII = (List<SaveFormatComparator>)Lists.newArrayList();
        final File[] lllllllllllllIlIlIIIIIIIlIllIIll = this.savesDirectory.listFiles();
        final Exception lllllllllllllIlIlIIIIIIIlIlIIllI;
        final short lllllllllllllIlIlIIIIIIIlIlIIlll = (short)((File[])(Object)(lllllllllllllIlIlIIIIIIIlIlIIllI = (Exception)(Object)lllllllllllllIlIlIIIIIIIlIllIIll)).length;
        float lllllllllllllIlIlIIIIIIIlIlIlIII = AnvilSaveConverter.lIIIIIIlllIlII[0];
        "".length();
        if (((0x9B ^ 0xC7 ^ (0xF9 ^ 0x9D)) & (0x1B ^ 0x1E ^ (0x54 ^ 0x69) ^ -" ".length())) > 0) {
            return null;
        }
        while (!lIllIlIIlllllIl((int)lllllllllllllIlIlIIIIIIIlIlIlIII, lllllllllllllIlIlIIIIIIIlIlIIlll)) {
            final File lllllllllllllIlIlIIIIIIIlIllIIlI = lllllllllllllIlIlIIIIIIIlIlIIllI[lllllllllllllIlIlIIIIIIIlIlIlIII];
            if (lIllIlIIllllIlI(lllllllllllllIlIlIIIIIIIlIllIIlI.isDirectory() ? 1 : 0)) {
                final String lllllllllllllIlIlIIIIIIIlIllIIIl = lllllllllllllIlIlIIIIIIIlIllIIlI.getName();
                final WorldInfo lllllllllllllIlIlIIIIIIIlIllIIII = this.getWorldInfo(lllllllllllllIlIlIIIIIIIlIllIIIl);
                if (lIllIlIIllllIIl(lllllllllllllIlIlIIIIIIIlIllIIII) && (!lIllIlIIllllIll(lllllllllllllIlIlIIIIIIIlIllIIII.getSaveVersion(), AnvilSaveConverter.lIIIIIIlllIlII[1]) || lIllIlIIlllllII(lllllllllllllIlIlIIIIIIIlIllIIII.getSaveVersion(), AnvilSaveConverter.lIIIIIIlllIlII[2]))) {
                    int n;
                    if (lIllIlIIllllIll(lllllllllllllIlIlIIIIIIIlIllIIII.getSaveVersion(), this.getSaveVersion())) {
                        n = AnvilSaveConverter.lIIIIIIlllIlII[3];
                        "".length();
                        if ((0x6D ^ 0x69) < 0) {
                            return null;
                        }
                    }
                    else {
                        n = AnvilSaveConverter.lIIIIIIlllIlII[0];
                    }
                    final boolean lllllllllllllIlIlIIIIIIIlIlIllll = n != 0;
                    String lllllllllllllIlIlIIIIIIIlIlIlllI = lllllllllllllIlIlIIIIIIIlIllIIII.getWorldName();
                    if (lIllIlIIllllIlI(StringUtils.isEmpty((CharSequence)lllllllllllllIlIlIIIIIIIlIlIlllI) ? 1 : 0)) {
                        lllllllllllllIlIlIIIIIIIlIlIlllI = lllllllllllllIlIlIIIIIIIlIllIIIl;
                    }
                    final long lllllllllllllIlIlIIIIIIIlIlIllIl = 0L;
                    lllllllllllllIlIlIIIIIIIlIllIlII.add(new SaveFormatComparator(lllllllllllllIlIlIIIIIIIlIllIIIl, lllllllllllllIlIlIIIIIIIlIlIlllI, lllllllllllllIlIlIIIIIIIlIllIIII.getLastTimePlayed(), lllllllllllllIlIlIIIIIIIlIlIllIl, lllllllllllllIlIlIIIIIIIlIllIIII.getGameType(), lllllllllllllIlIlIIIIIIIlIlIllll, lllllllllllllIlIlIIIIIIIlIllIIII.isHardcoreModeEnabled(), lllllllllllllIlIlIIIIIIIlIllIIII.areCommandsAllowed()));
                    "".length();
                }
            }
            ++lllllllllllllIlIlIIIIIIIlIlIlIII;
        }
        return lllllllllllllIlIlIIIIIIIlIllIlII;
    }
    
    @Override
    public void flushCache() {
        RegionFileCache.clearRegionFileReferences();
    }
    
    private static boolean lIllIlIIllllIll(final int lllllllllllllIlIIllllllllIIlIlll, final int lllllllllllllIlIIllllllllIIlIllI) {
        return lllllllllllllIlIIllllllllIIlIlll != lllllllllllllIlIIllllllllIIlIllI;
    }
    
    private static boolean lIllIlIIlllllll(final int lllllllllllllIlIIllllllllIIllIlI) {
        return lllllllllllllIlIIllllllllIIllIlI == 0;
    }
    
    private static boolean lIllIlIlIIIIIIl(final int lllllllllllllIlIIllllllllIlIIlll, final int lllllllllllllIlIIllllllllIlIIllI) {
        return lllllllllllllIlIIllllllllIlIIlll > lllllllllllllIlIIllllllllIlIIllI;
    }
    
    private static String lIllIlIIIIIlllI(String lllllllllllllIlIIllllllllIlllllI, final String lllllllllllllIlIIlllllllllIIIIlI) {
        lllllllllllllIlIIllllllllIlllllI = new String(Base64.getDecoder().decode(lllllllllllllIlIIllllllllIlllllI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIlIIlllllllllIIIIIl = new StringBuilder();
        final char[] lllllllllllllIlIIlllllllllIIIIII = lllllllllllllIlIIlllllllllIIIIlI.toCharArray();
        int lllllllllllllIlIIllllllllIllllll = AnvilSaveConverter.lIIIIIIlllIlII[0];
        final long lllllllllllllIlIIllllllllIlllIIl = (Object)lllllllllllllIlIIllllllllIlllllI.toCharArray();
        final int lllllllllllllIlIIllllllllIlllIII = lllllllllllllIlIIllllllllIlllIIl.length;
        char lllllllllllllIlIIllllllllIllIlll = (char)AnvilSaveConverter.lIIIIIIlllIlII[0];
        while (lIllIlIlIIIIIlI(lllllllllllllIlIIllllllllIllIlll, lllllllllllllIlIIllllllllIlllIII)) {
            final char lllllllllllllIlIIlllllllllIIIlII = lllllllllllllIlIIllllllllIlllIIl[lllllllllllllIlIIllllllllIllIlll];
            lllllllllllllIlIIlllllllllIIIIIl.append((char)(lllllllllllllIlIIlllllllllIIIlII ^ lllllllllllllIlIIlllllllllIIIIII[lllllllllllllIlIIllllllllIllllll % lllllllllllllIlIIlllllllllIIIIII.length]));
            "".length();
            ++lllllllllllllIlIIllllllllIllllll;
            ++lllllllllllllIlIIllllllllIllIlll;
            "".length();
            if (" ".length() > "   ".length()) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIlIIlllllllllIIIIIl);
    }
    
    private static boolean lIllIlIIlllllIl(final int lllllllllllllIlIIllllllllIlIllll, final int lllllllllllllIlIIllllllllIlIlllI) {
        return lllllllllllllIlIIllllllllIlIllll >= lllllllllllllIlIIllllllllIlIlllI;
    }
    
    private static void lIllIlIIIIlllll() {
        (lIIIIIIlIlIllI = new String[AnvilSaveConverter.lIIIIIIlllIlII[24]])[AnvilSaveConverter.lIIIIIIlllIlII[0]] = lIllIlIIIIIlllI("LwknOSo=", "ngQPF");
        AnvilSaveConverter.lIIIIIIlIlIllI[AnvilSaveConverter.lIIIIIIlllIlII[3]] = lIllIlIIIIIllll("FGEwfi2CtJCbc6ex3pMvQfI5Lh/ZAcUGPdxjx44yQM9EMASThTmD21n+Jtoe9nPwAJI6IQ0h9V+0pUuARVaAzw==", "jmddp");
        AnvilSaveConverter.lIIIIIIlIlIllI[AnvilSaveConverter.lIIIIIIlllIlII[4]] = lIllIlIIIIIllll("EiCabj2Y1yM=", "quVeZ");
        AnvilSaveConverter.lIIIIIIlIlIllI[AnvilSaveConverter.lIIIIIIlllIlII[5]] = lIllIlIIIIIllll("coMWueodABQ=", "ioEfi");
        AnvilSaveConverter.lIIIIIIlIlIllI[AnvilSaveConverter.lIIIIIIlllIlII[6]] = lIllIlIIIIIlllI("AAUgIzY6CCZtPjwKJSgqIEhvYw==", "SfAMX");
        AnvilSaveConverter.lIIIIIIlIlIllI[AnvilSaveConverter.lIIIIIIlllIlII[7]] = lIllIlIIIIIlllI("IycnGQ5XKzwWFBI6IBENGWgwFxcZPHMREVc=", "wHSxb");
        AnvilSaveConverter.lIIIIIIlIlIllI[AnvilSaveConverter.lIIIIIIlllIlII[8]] = lIllIlIIIIIllll("hu3lHW065pE=", "NwNzY");
        AnvilSaveConverter.lIIIIIIlIlIllI[AnvilSaveConverter.lIIIIIIlllIlII[9]] = lIllIlIIIIIllll("lYQoCPzoBQA=", "IUohr");
        AnvilSaveConverter.lIIIIIIlIlIllI[AnvilSaveConverter.lIIIIIIlllIlII[10]] = lIllIlIIIIIllll("ThqunCV4YtE=", "fXxPV");
        AnvilSaveConverter.lIIIIIIlIlIllI[AnvilSaveConverter.lIIIIIIlllIlII[11]] = lIllIlIIIIlIIll("dR1evxQ54aqOkKHdTekBZutFyjTCHjyLrWj1/SBh/dupGfrxtOL4RA==", "gdXVd");
        AnvilSaveConverter.lIIIIIIlIlIllI[AnvilSaveConverter.lIIIIIIlllIlII[12]] = lIllIlIIIIIllll("e7kzgp7djKxQy9ILhjiuXw==", "xkHTd");
        AnvilSaveConverter.lIIIIIIlIlIllI[AnvilSaveConverter.lIIIIIIlllIlII[13]] = lIllIlIIIIIllll("1az8C4Au6iWVG/oneb9Oe5JOp9JBIoIEyerRMf2Pk9w6mCh5uQ47Mg==", "GcoQm");
        AnvilSaveConverter.lIIIIIIlIlIllI[AnvilSaveConverter.lIIIIIIlllIlII[14]] = lIllIlIIIIlIIll("PbpXU4Zm281biE0EvjaW+g==", "agmEn");
        AnvilSaveConverter.lIIIIIIlIlIllI[AnvilSaveConverter.lIIIIIIlllIlII[15]] = lIllIlIIIIIllll("+Glpbi9zyaNme7Hf7ZnHrcxT62H6UkVwLbYBt4NSegj7A9+RJbaGUA==", "USnnc");
        AnvilSaveConverter.lIIIIIIlIlIllI[AnvilSaveConverter.lIIIIIIlllIlII[16]] = lIllIlIIIIIlllI("aAQlFg==", "FiFdd");
        AnvilSaveConverter.lIIIIIIlIlIllI[AnvilSaveConverter.lIIIIIIlllIlII[17]] = lIllIlIIIIIlllI("VB0yJg==", "zpQGj");
        AnvilSaveConverter.lIIIIIIlIlIllI[AnvilSaveConverter.lIIIIIIlllIlII[18]] = lIllIlIIIIIllll("GawzgC3em5j4R5LD2vEiS5792353FDWb4ONrRxP1gh4=", "IqyNF");
        AnvilSaveConverter.lIIIIIIlIlIllI[AnvilSaveConverter.lIIIIIIlllIlII[19]] = lIllIlIIIIIlllI("Di4yIC0=", "BKDEA");
        AnvilSaveConverter.lIIIIIIlIlIllI[AnvilSaveConverter.lIIIIIIlllIlII[20]] = lIllIlIIIIIllll("ZYgTUJoUUkQ=", "gneAI");
        AnvilSaveConverter.lIIIIIIlIlIllI[AnvilSaveConverter.lIIIIIIlllIlII[23]] = lIllIlIIIIIllll("yFD9Re1sd6k=", "nwbTZ");
    }
    
    @Override
    public boolean convertMapFormat(final String lllllllllllllIlIlIIIIIIIIlllIlIl, final IProgressUpdate lllllllllllllIlIlIIIIIIIIllIIlll) {
        lllllllllllllIlIlIIIIIIIIllIIlll.setLoadingProgress(AnvilSaveConverter.lIIIIIIlllIlII[0]);
        final List<File> lllllllllllllIlIlIIIIIIIIlllIIll = (List<File>)Lists.newArrayList();
        final List<File> lllllllllllllIlIlIIIIIIIIlllIIlI = (List<File>)Lists.newArrayList();
        final List<File> lllllllllllllIlIlIIIIIIIIlllIIIl = (List<File>)Lists.newArrayList();
        final File lllllllllllllIlIlIIIIIIIIlllIIII = new File(this.savesDirectory, lllllllllllllIlIlIIIIIIIIlllIlIl);
        final File lllllllllllllIlIlIIIIIIIIllIllll = new File(lllllllllllllIlIlIIIIIIIIlllIIII, AnvilSaveConverter.lIIIIIIlIlIllI[AnvilSaveConverter.lIIIIIIlllIlII[4]]);
        final File lllllllllllllIlIlIIIIIIIIllIlllI = new File(lllllllllllllIlIlIIIIIIIIlllIIII, AnvilSaveConverter.lIIIIIIlIlIllI[AnvilSaveConverter.lIIIIIIlllIlII[5]]);
        AnvilSaveConverter.logger.info(AnvilSaveConverter.lIIIIIIlIlIllI[AnvilSaveConverter.lIIIIIIlllIlII[6]]);
        this.addRegionFilesToCollection(lllllllllllllIlIlIIIIIIIIlllIIII, lllllllllllllIlIlIIIIIIIIlllIIll);
        if (lIllIlIIllllIlI(lllllllllllllIlIlIIIIIIIIllIllll.exists() ? 1 : 0)) {
            this.addRegionFilesToCollection(lllllllllllllIlIlIIIIIIIIllIllll, lllllllllllllIlIlIIIIIIIIlllIIlI);
        }
        if (lIllIlIIllllIlI(lllllllllllllIlIlIIIIIIIIllIlllI.exists() ? 1 : 0)) {
            this.addRegionFilesToCollection(lllllllllllllIlIlIIIIIIIIllIlllI, lllllllllllllIlIlIIIIIIIIlllIIIl);
        }
        final int lllllllllllllIlIlIIIIIIIIllIllIl = lllllllllllllIlIlIIIIIIIIlllIIll.size() + lllllllllllllIlIlIIIIIIIIlllIIlI.size() + lllllllllllllIlIlIIIIIIIIlllIIIl.size();
        AnvilSaveConverter.logger.info(String.valueOf(new StringBuilder(AnvilSaveConverter.lIIIIIIlIlIllI[AnvilSaveConverter.lIIIIIIlllIlII[7]]).append(lllllllllllllIlIlIIIIIIIIllIllIl)));
        final WorldInfo lllllllllllllIlIlIIIIIIIIllIllII = this.getWorldInfo(lllllllllllllIlIlIIIIIIIIlllIlIl);
        WorldChunkManager lllllllllllllIlIlIIIIIIIIllIlIll = null;
        if (lIllIlIIllllllI(lllllllllllllIlIlIIIIIIIIllIllII.getTerrainType(), WorldType.FLAT)) {
            lllllllllllllIlIlIIIIIIIIllIlIll = new WorldChunkManagerHell(BiomeGenBase.plains, 0.5f);
            "".length();
            if (-" ".length() != -" ".length()) {
                return ((100 + 57 + 24 + 68 ^ 178 + 128 - 251 + 136) & (0x2D ^ 0x6B ^ ((0x43 ^ 0x6C) & ~(0xAF ^ 0x80)) ^ -" ".length())) != 0x0;
            }
        }
        else {
            lllllllllllllIlIlIIIIIIIIllIlIll = new WorldChunkManager(lllllllllllllIlIlIIIIIIIIllIllII.getSeed(), lllllllllllllIlIlIIIIIIIIllIllII.getTerrainType(), lllllllllllllIlIlIIIIIIIIllIllII.getGeneratorOptions());
        }
        this.convertFile(new File(lllllllllllllIlIlIIIIIIIIlllIIII, AnvilSaveConverter.lIIIIIIlIlIllI[AnvilSaveConverter.lIIIIIIlllIlII[8]]), lllllllllllllIlIlIIIIIIIIlllIIll, lllllllllllllIlIlIIIIIIIIllIlIll, AnvilSaveConverter.lIIIIIIlllIlII[0], lllllllllllllIlIlIIIIIIIIllIllIl, lllllllllllllIlIlIIIIIIIIllIIlll);
        this.convertFile(new File(lllllllllllllIlIlIIIIIIIIllIllll, AnvilSaveConverter.lIIIIIIlIlIllI[AnvilSaveConverter.lIIIIIIlllIlII[9]]), lllllllllllllIlIlIIIIIIIIlllIIlI, new WorldChunkManagerHell(BiomeGenBase.hell, 0.0f), lllllllllllllIlIlIIIIIIIIlllIIll.size(), lllllllllllllIlIlIIIIIIIIllIllIl, lllllllllllllIlIlIIIIIIIIllIIlll);
        this.convertFile(new File(lllllllllllllIlIlIIIIIIIIllIlllI, AnvilSaveConverter.lIIIIIIlIlIllI[AnvilSaveConverter.lIIIIIIlllIlII[10]]), lllllllllllllIlIlIIIIIIIIlllIIIl, new WorldChunkManagerHell(BiomeGenBase.sky, 0.0f), lllllllllllllIlIlIIIIIIIIlllIIll.size() + lllllllllllllIlIlIIIIIIIIlllIIlI.size(), lllllllllllllIlIlIIIIIIIIllIllIl, lllllllllllllIlIlIIIIIIIIllIIlll);
        lllllllllllllIlIlIIIIIIIIllIllII.setSaveVersion(AnvilSaveConverter.lIIIIIIlllIlII[2]);
        if (lIllIlIIllllllI(lllllllllllllIlIlIIIIIIIIllIllII.getTerrainType(), WorldType.DEFAULT_1_1)) {
            lllllllllllllIlIlIIIIIIIIllIllII.setTerrainType(WorldType.DEFAULT);
        }
        this.createFile(lllllllllllllIlIlIIIIIIIIlllIlIl);
        final ISaveHandler lllllllllllllIlIlIIIIIIIIllIlIlI = this.getSaveLoader(lllllllllllllIlIlIIIIIIIIlllIlIl, (boolean)(AnvilSaveConverter.lIIIIIIlllIlII[0] != 0));
        lllllllllllllIlIlIIIIIIIIllIlIlI.saveWorldInfo(lllllllllllllIlIlIIIIIIIIllIllII);
        return AnvilSaveConverter.lIIIIIIlllIlII[3] != 0;
    }
    
    private static String lIllIlIIIIIllll(final String lllllllllllllIlIIlllllllllIllllI, final String lllllllllllllIlIIlllllllllIlllIl) {
        try {
            final SecretKeySpec lllllllllllllIlIIllllllllllIIIll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIlIIlllllllllIlllIl.getBytes(StandardCharsets.UTF_8)), AnvilSaveConverter.lIIIIIIlllIlII[10]), "DES");
            final Cipher lllllllllllllIlIIllllllllllIIIlI = Cipher.getInstance("DES");
            lllllllllllllIlIIllllllllllIIIlI.init(AnvilSaveConverter.lIIIIIIlllIlII[4], lllllllllllllIlIIllllllllllIIIll);
            return new String(lllllllllllllIlIIllllllllllIIIlI.doFinal(Base64.getDecoder().decode(lllllllllllllIlIIlllllllllIllllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIlIIllllllllllIIIIl) {
            lllllllllllllIlIIllllllllllIIIIl.printStackTrace();
            return null;
        }
    }
    
    private static boolean lIllIlIlIIIIIII(final Object lllllllllllllIlIIllllllllIIllllI) {
        return lllllllllllllIlIIllllllllIIllllI == null;
    }
    
    private static boolean lIllIlIIllllIIl(final Object lllllllllllllIlIIllllllllIlIIlII) {
        return lllllllllllllIlIIllllllllIlIIlII != null;
    }
    
    protected int getSaveVersion() {
        return AnvilSaveConverter.lIIIIIIlllIlII[2];
    }
    
    private static void lIllIlIIllllIII() {
        (lIIIIIIlllIlII = new int[25])[0] = ((0xAC ^ 0x81) & ~(0x2B ^ 0x6));
        AnvilSaveConverter.lIIIIIIlllIlII[1] = (-(0xFFFF8F5F & 0x75E1) & (0xFFFFDFFD & 0x6FFE));
        AnvilSaveConverter.lIIIIIIlllIlII[2] = (0xFFFFFEFD & 0x4BBF);
        AnvilSaveConverter.lIIIIIIlllIlII[3] = " ".length();
        AnvilSaveConverter.lIIIIIIlllIlII[4] = "  ".length();
        AnvilSaveConverter.lIIIIIIlllIlII[5] = "   ".length();
        AnvilSaveConverter.lIIIIIIlllIlII[6] = (39 + 134 - 48 + 46 ^ 5 + 108 + 30 + 32);
        AnvilSaveConverter.lIIIIIIlllIlII[7] = (0x8F ^ 0xBF ^ (0xF2 ^ 0xC7));
        AnvilSaveConverter.lIIIIIIlllIlII[8] = (108 + 146 - 235 + 141 ^ 102 + 94 - 135 + 105);
        AnvilSaveConverter.lIIIIIIlllIlII[9] = (0x4F ^ 0x48);
        AnvilSaveConverter.lIIIIIIlllIlII[10] = (0xA7 ^ 0xAF);
        AnvilSaveConverter.lIIIIIIlllIlII[11] = (0x85 ^ 0x8C);
        AnvilSaveConverter.lIIIIIIlllIlII[12] = (0x4 ^ 0x31 ^ (0x19 ^ 0x26));
        AnvilSaveConverter.lIIIIIIlllIlII[13] = (0x65 ^ 0x6E);
        AnvilSaveConverter.lIIIIIIlllIlII[14] = (0x5D ^ 0x70 ^ (0x98 ^ 0xB9));
        AnvilSaveConverter.lIIIIIIlllIlII[15] = (0x3E ^ 0x33);
        AnvilSaveConverter.lIIIIIIlllIlII[16] = (0x72 ^ 0x7C);
        AnvilSaveConverter.lIIIIIIlllIlII[17] = (0x84 ^ 0xB9 ^ (0xB ^ 0x39));
        AnvilSaveConverter.lIIIIIIlllIlII[18] = (0x51 ^ 0xE ^ (0xFC ^ 0xB3));
        AnvilSaveConverter.lIIIIIIlllIlII[19] = (45 + 93 - 41 + 68 ^ 89 + 33 + 17 + 41);
        AnvilSaveConverter.lIIIIIIlllIlII[20] = (115 + 108 - 154 + 83 ^ 5 + 0 + 26 + 107);
        AnvilSaveConverter.lIIIIIIlllIlII[21] = (163 + 10 - 54 + 57 ^ 71 + 117 - 176 + 132);
        AnvilSaveConverter.lIIIIIIlllIlII[22] = (-(0xFFFFEBBF & 0x5C6D) & (0xFFFFEC7D & 0x5FAE));
        AnvilSaveConverter.lIIIIIIlllIlII[23] = (0x4F ^ 0x2 ^ (0x7E ^ 0x20));
        AnvilSaveConverter.lIIIIIIlllIlII[24] = (57 + 144 - 190 + 201 ^ 68 + 111 - 82 + 95);
    }
    
    private static boolean lIllIlIIllllIlI(final int lllllllllllllIlIIllllllllIIlllII) {
        return lllllllllllllIlIIllllllllIIlllII != 0;
    }
    
    private static boolean lIllIlIIlllllII(final int lllllllllllllIlIIllllllllIllIIll, final int lllllllllllllIlIIllllllllIllIIlI) {
        return lllllllllllllIlIIllllllllIllIIll == lllllllllllllIlIIllllllllIllIIlI;
    }
    
    private void convertChunks(final File lllllllllllllIlIlIIIIIIIIIIlllIl, final File lllllllllllllIlIlIIIIIIIIIIlllII, final WorldChunkManager lllllllllllllIlIlIIIIIIIIIIIIllI, final int lllllllllllllIlIlIIIIIIIIIIIIlIl, final int lllllllllllllIlIlIIIIIIIIIIllIIl, final IProgressUpdate lllllllllllllIlIlIIIIIIIIIIIIIll) {
        try {
            final String lllllllllllllIlIlIIIIIIIIIIlIlll = lllllllllllllIlIlIIIIIIIIIIlllII.getName();
            final RegionFile lllllllllllllIlIlIIIIIIIIIIlIllI = new RegionFile(lllllllllllllIlIlIIIIIIIIIIlllII);
            final RegionFile lllllllllllllIlIlIIIIIIIIIIlIlIl = new RegionFile(new File(lllllllllllllIlIlIIIIIIIIIIlllIl, String.valueOf(new StringBuilder(String.valueOf(lllllllllllllIlIlIIIIIIIIIIlIlll.substring(AnvilSaveConverter.lIIIIIIlllIlII[0], lllllllllllllIlIlIIIIIIIIIIlIlll.length() - AnvilSaveConverter.lIIIIIIlIlIllI[AnvilSaveConverter.lIIIIIIlllIlII[16]].length()))).append(AnvilSaveConverter.lIIIIIIlIlIllI[AnvilSaveConverter.lIIIIIIlllIlII[17]]))));
            int lllllllllllllIlIlIIIIIIIIIIlIlII = AnvilSaveConverter.lIIIIIIlllIlII[0];
            "".length();
            if (((125 + 130 - 184 + 80 ^ 50 + 48 + 32 + 7) & (0x9A ^ 0xA0 ^ (0x95 ^ 0xB1) ^ -" ".length())) != ((0x8B ^ 0xB1 ^ (0x11 ^ 0x14)) & (0xAE ^ 0x81 ^ (0x27 ^ 0x37) ^ -" ".length()))) {
                return;
            }
            while (!lIllIlIIlllllIl(lllllllllllllIlIlIIIIIIIIIIlIlII, AnvilSaveConverter.lIIIIIIlllIlII[21])) {
                int lllllllllllllIlIlIIIIIIIIIIlIIll = AnvilSaveConverter.lIIIIIIlllIlII[0];
                "".length();
                if ((0x75 ^ 0x67 ^ (0x55 ^ 0x43)) < (0x41 ^ 0x71 ^ (0x14 ^ 0x20))) {
                    return;
                }
                while (!lIllIlIIlllllIl(lllllllllllllIlIlIIIIIIIIIIlIIll, AnvilSaveConverter.lIIIIIIlllIlII[21])) {
                    if (lIllIlIIllllIlI(lllllllllllllIlIlIIIIIIIIIIlIllI.isChunkSaved(lllllllllllllIlIlIIIIIIIIIIlIlII, lllllllllllllIlIlIIIIIIIIIIlIIll) ? 1 : 0) && lIllIlIIlllllll(lllllllllllllIlIlIIIIIIIIIIlIlIl.isChunkSaved(lllllllllllllIlIlIIIIIIIIIIlIlII, lllllllllllllIlIlIIIIIIIIIIlIIll) ? 1 : 0)) {
                        final DataInputStream lllllllllllllIlIlIIIIIIIIIIlIIlI = lllllllllllllIlIlIIIIIIIIIIlIllI.getChunkDataInputStream(lllllllllllllIlIlIIIIIIIIIIlIlII, lllllllllllllIlIlIIIIIIIIIIlIIll);
                        if (lIllIlIlIIIIIII(lllllllllllllIlIlIIIIIIIIIIlIIlI)) {
                            AnvilSaveConverter.logger.warn(AnvilSaveConverter.lIIIIIIlIlIllI[AnvilSaveConverter.lIIIIIIlllIlII[18]]);
                            "".length();
                            if (-"  ".length() >= 0) {
                                return;
                            }
                        }
                        else {
                            final NBTTagCompound lllllllllllllIlIlIIIIIIIIIIlIIIl = CompressedStreamTools.read(lllllllllllllIlIlIIIIIIIIIIlIIlI);
                            lllllllllllllIlIlIIIIIIIIIIlIIlI.close();
                            final NBTTagCompound lllllllllllllIlIlIIIIIIIIIIlIIII = lllllllllllllIlIlIIIIIIIIIIlIIIl.getCompoundTag(AnvilSaveConverter.lIIIIIIlIlIllI[AnvilSaveConverter.lIIIIIIlllIlII[19]]);
                            final ChunkLoader.AnvilConverterData lllllllllllllIlIlIIIIIIIIIIIllll = ChunkLoader.load(lllllllllllllIlIlIIIIIIIIIIlIIII);
                            final NBTTagCompound lllllllllllllIlIlIIIIIIIIIIIlllI = new NBTTagCompound();
                            final NBTTagCompound lllllllllllllIlIlIIIIIIIIIIIllIl = new NBTTagCompound();
                            lllllllllllllIlIlIIIIIIIIIIIlllI.setTag(AnvilSaveConverter.lIIIIIIlIlIllI[AnvilSaveConverter.lIIIIIIlllIlII[20]], lllllllllllllIlIlIIIIIIIIIIIllIl);
                            ChunkLoader.convertToAnvilFormat(lllllllllllllIlIlIIIIIIIIIIIllll, lllllllllllllIlIlIIIIIIIIIIIllIl, lllllllllllllIlIlIIIIIIIIIIIIllI);
                            final DataOutputStream lllllllllllllIlIlIIIIIIIIIIIllII = lllllllllllllIlIlIIIIIIIIIIlIlIl.getChunkDataOutputStream(lllllllllllllIlIlIIIIIIIIIIlIlII, lllllllllllllIlIlIIIIIIIIIIlIIll);
                            CompressedStreamTools.write(lllllllllllllIlIlIIIIIIIIIIIlllI, lllllllllllllIlIlIIIIIIIIIIIllII);
                            lllllllllllllIlIlIIIIIIIIIIIllII.close();
                        }
                    }
                    ++lllllllllllllIlIlIIIIIIIIIIlIIll;
                }
                final int lllllllllllllIlIlIIIIIIIIIIIlIll = (int)Math.round(100.0 * (lllllllllllllIlIlIIIIIIIIIIIIlIl * AnvilSaveConverter.lIIIIIIlllIlII[22]) / (lllllllllllllIlIlIIIIIIIIIIllIIl * AnvilSaveConverter.lIIIIIIlllIlII[22]));
                final int lllllllllllllIlIlIIIIIIIIIIIlIlI = (int)Math.round(100.0 * ((lllllllllllllIlIlIIIIIIIIIIlIlII + AnvilSaveConverter.lIIIIIIlllIlII[3]) * AnvilSaveConverter.lIIIIIIlllIlII[21] + lllllllllllllIlIlIIIIIIIIIIIIlIl * AnvilSaveConverter.lIIIIIIlllIlII[22]) / (lllllllllllllIlIlIIIIIIIIIIllIIl * AnvilSaveConverter.lIIIIIIlllIlII[22]));
                if (lIllIlIlIIIIIIl(lllllllllllllIlIlIIIIIIIIIIIlIlI, lllllllllllllIlIlIIIIIIIIIIIlIll)) {
                    lllllllllllllIlIlIIIIIIIIIIIIIll.setLoadingProgress(lllllllllllllIlIlIIIIIIIIIIIlIlI);
                }
                ++lllllllllllllIlIlIIIIIIIIIIlIlII;
            }
            lllllllllllllIlIlIIIIIIIIIIlIllI.close();
            lllllllllllllIlIlIIIIIIIIIIlIlIl.close();
            "".length();
            if (((0x61 ^ 0x58) & ~(0xA3 ^ 0x9A)) == " ".length()) {
                return;
            }
        }
        catch (IOException lllllllllllllIlIlIIIIIIIIIIIlIIl) {
            lllllllllllllIlIlIIIIIIIIIIIlIIl.printStackTrace();
        }
    }
    
    @Override
    public String getName() {
        return AnvilSaveConverter.lIIIIIIlIlIllI[AnvilSaveConverter.lIIIIIIlllIlII[0]];
    }
    
    private void createFile(final String lllllllllllllIlIlIIIIIIIIlIlIIIl) {
        final File lllllllllllllIlIlIIIIIIIIlIlIlIl = new File(this.savesDirectory, lllllllllllllIlIlIIIIIIIIlIlIIIl);
        if (lIllIlIIlllllll(lllllllllllllIlIlIIIIIIIIlIlIlIl.exists() ? 1 : 0)) {
            AnvilSaveConverter.logger.warn(AnvilSaveConverter.lIIIIIIlIlIllI[AnvilSaveConverter.lIIIIIIlllIlII[11]]);
            "".length();
            if ("  ".length() == " ".length()) {
                return;
            }
        }
        else {
            final File lllllllllllllIlIlIIIIIIIIlIlIlII = new File(lllllllllllllIlIlIIIIIIIIlIlIlIl, AnvilSaveConverter.lIIIIIIlIlIllI[AnvilSaveConverter.lIIIIIIlllIlII[12]]);
            if (lIllIlIIlllllll(lllllllllllllIlIlIIIIIIIIlIlIlII.exists() ? 1 : 0)) {
                AnvilSaveConverter.logger.warn(AnvilSaveConverter.lIIIIIIlIlIllI[AnvilSaveConverter.lIIIIIIlllIlII[13]]);
                "".length();
                if (-" ".length() >= 0) {
                    return;
                }
            }
            else {
                final File lllllllllllllIlIlIIIIIIIIlIlIIll = new File(lllllllllllllIlIlIIIIIIIIlIlIlIl, AnvilSaveConverter.lIIIIIIlIlIllI[AnvilSaveConverter.lIIIIIIlllIlII[14]]);
                if (lIllIlIIlllllll(lllllllllllllIlIlIIIIIIIIlIlIlII.renameTo(lllllllllllllIlIlIIIIIIIIlIlIIll) ? 1 : 0)) {
                    AnvilSaveConverter.logger.warn(AnvilSaveConverter.lIIIIIIlIlIllI[AnvilSaveConverter.lIIIIIIlllIlII[15]]);
                }
            }
        }
    }
    
    private static boolean lIllIlIlIIIIIlI(final int lllllllllllllIlIIllllllllIlIlIll, final int lllllllllllllIlIIllllllllIlIlIlI) {
        return lllllllllllllIlIIllllllllIlIlIll < lllllllllllllIlIIllllllllIlIlIlI;
    }
    
    private void convertFile(final File lllllllllllllIlIlIIIIIIIIlIIIIlI, final Iterable<File> lllllllllllllIlIlIIIIIIIIIlllIII, final WorldChunkManager lllllllllllllIlIlIIIIIIIIlIIIIII, int lllllllllllllIlIlIIIIIIIIIllIllI, final int lllllllllllllIlIlIIIIIIIIIllIlIl, final IProgressUpdate lllllllllllllIlIlIIIIIIIIIllIlII) {
        final long lllllllllllllIlIlIIIIIIIIIllIIlI = (long)lllllllllllllIlIlIIIIIIIIIlllIII.iterator();
        "".length();
        if (null != null) {
            return;
        }
        while (!lIllIlIIlllllll(((Iterator)lllllllllllllIlIlIIIIIIIIIllIIlI).hasNext() ? 1 : 0)) {
            final File lllllllllllllIlIlIIIIIIIIIllllII = ((Iterator<File>)lllllllllllllIlIlIIIIIIIIIllIIlI).next();
            this.convertChunks(lllllllllllllIlIlIIIIIIIIlIIIIlI, lllllllllllllIlIlIIIIIIIIIllllII, lllllllllllllIlIlIIIIIIIIlIIIIII, lllllllllllllIlIlIIIIIIIIIllIllI, lllllllllllllIlIlIIIIIIIIIllIlIl, lllllllllllllIlIlIIIIIIIIIllIlII);
            ++lllllllllllllIlIlIIIIIIIIIllIllI;
            final int lllllllllllllIlIlIIIIIIIIIlllIll = (int)Math.round(100.0 * lllllllllllllIlIlIIIIIIIIIllIllI / lllllllllllllIlIlIIIIIIIIIllIlIl);
            lllllllllllllIlIlIIIIIIIIIllIlII.setLoadingProgress(lllllllllllllIlIlIIIIIIIIIlllIll);
        }
    }
    
    @Override
    public boolean func_154334_a(final String lllllllllllllIlIlIIIIIIIlIIIlllI) {
        final WorldInfo lllllllllllllIlIlIIIIIIIlIIlIIII = this.getWorldInfo(lllllllllllllIlIlIIIIIIIlIIIlllI);
        if (lIllIlIIllllIIl(lllllllllllllIlIlIIIIIIIlIIlIIII) && lIllIlIIlllllII(lllllllllllllIlIlIIIIIIIlIIlIIII.getSaveVersion(), AnvilSaveConverter.lIIIIIIlllIlII[1])) {
            return AnvilSaveConverter.lIIIIIIlllIlII[3] != 0;
        }
        return AnvilSaveConverter.lIIIIIIlllIlII[0] != 0;
    }
    
    @Override
    public boolean isOldMapFormat(final String lllllllllllllIlIlIIIIIIIlIIIlIII) {
        final WorldInfo lllllllllllllIlIlIIIIIIIlIIIIlll = this.getWorldInfo(lllllllllllllIlIlIIIIIIIlIIIlIII);
        if (lIllIlIIllllIIl(lllllllllllllIlIlIIIIIIIlIIIIlll) && lIllIlIIllllIll(lllllllllllllIlIlIIIIIIIlIIIIlll.getSaveVersion(), this.getSaveVersion())) {
            return AnvilSaveConverter.lIIIIIIlllIlII[3] != 0;
        }
        return AnvilSaveConverter.lIIIIIIlllIlII[0] != 0;
    }
    
    public AnvilSaveConverter(final File lllllllllllllIlIlIIIIIIIllIIIIll) {
        super(lllllllllllllIlIlIIIIIIIllIIIIll);
    }
    
    private void addRegionFilesToCollection(final File lllllllllllllIlIIllllllllllIlIll, final Collection<File> lllllllllllllIlIIllllllllllIllll) {
        final File lllllllllllllIlIIllllllllllIlllI = new File(lllllllllllllIlIIllllllllllIlIll, AnvilSaveConverter.lIIIIIIlIlIllI[AnvilSaveConverter.lIIIIIIlllIlII[23]]);
        final File[] lllllllllllllIlIIllllllllllIllIl = lllllllllllllIlIIllllllllllIlllI.listFiles(new FilenameFilter() {
            private static final /* synthetic */ int[] lIlIllIlIlIllI;
            private static final /* synthetic */ String[] lIlIllIlIlIlII;
            
            static {
                llllIIIlllIlIII();
                llllIIIlllIIIII();
            }
            
            private static void llllIIIlllIlIII() {
                (lIlIllIlIlIllI = new int[4])[0] = ((0x75 ^ 0x27 ^ (0xBA ^ 0xB1)) & (0xF8 ^ 0x98 ^ (0x8 ^ 0x31) ^ -" ".length()));
                AnvilSaveConverter$1.lIlIllIlIlIllI[1] = " ".length();
                AnvilSaveConverter$1.lIlIllIlIlIllI[2] = (0x55 ^ 0x5D);
                AnvilSaveConverter$1.lIlIllIlIlIllI[3] = "  ".length();
            }
            
            private static String llllIIIllIlllll(final String lllllllllllllIIIIllIlIlIlllIIIll, final String lllllllllllllIIIIllIlIlIlllIIIII) {
                try {
                    final SecretKeySpec lllllllllllllIIIIllIlIlIlllIIllI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIIIIllIlIlIlllIIIII.getBytes(StandardCharsets.UTF_8)), AnvilSaveConverter$1.lIlIllIlIlIllI[2]), "DES");
                    final Cipher lllllllllllllIIIIllIlIlIlllIIlIl = Cipher.getInstance("DES");
                    lllllllllllllIIIIllIlIlIlllIIlIl.init(AnvilSaveConverter$1.lIlIllIlIlIllI[3], lllllllllllllIIIIllIlIlIlllIIllI);
                    return new String(lllllllllllllIIIIllIlIlIlllIIlIl.doFinal(Base64.getDecoder().decode(lllllllllllllIIIIllIlIlIlllIIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
                }
                catch (Exception lllllllllllllIIIIllIlIlIlllIIlII) {
                    lllllllllllllIIIIllIlIlIlllIIlII.printStackTrace();
                    return null;
                }
            }
            
            private static void llllIIIlllIIIII() {
                (lIlIllIlIlIlII = new String[AnvilSaveConverter$1.lIlIllIlIlIllI[1]])[AnvilSaveConverter$1.lIlIllIlIlIllI[0]] = llllIIIllIlllll("prjI7uP8NSE=", "nGsms");
            }
            
            @Override
            public boolean accept(final File lllllllllllllIIIIllIlIlIlllIllIl, final String lllllllllllllIIIIllIlIlIlllIlIll) {
                return lllllllllllllIIIIllIlIlIlllIlIll.endsWith(AnvilSaveConverter$1.lIlIllIlIlIlII[AnvilSaveConverter$1.lIlIllIlIlIllI[0]]);
            }
        });
        if (lIllIlIIllllIIl(lllllllllllllIlIIllllllllllIllIl)) {
            Collections.addAll(lllllllllllllIlIIllllllllllIllll, lllllllllllllIlIIllllllllllIllIl);
            "".length();
        }
    }
    
    static {
        lIllIlIIllllIII();
        lIllIlIIIIlllll();
        logger = LogManager.getLogger();
    }
}
