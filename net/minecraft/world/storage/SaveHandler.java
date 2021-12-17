// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.world.storage;

import net.minecraft.server.MinecraftServer;
import net.minecraft.world.MinecraftException;
import java.io.DataInputStream;
import org.apache.logging.log4j.LogManager;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.io.InputStream;
import java.io.FileInputStream;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.nbt.CompressedStreamTools;
import net.minecraft.nbt.NBTBase;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.world.chunk.storage.IChunkLoader;
import net.minecraft.world.WorldProvider;
import java.io.IOException;
import java.io.OutputStream;
import java.io.DataOutputStream;
import java.io.FileOutputStream;
import org.apache.logging.log4j.Logger;
import java.io.File;

public class SaveHandler implements ISaveHandler, IPlayerFileData
{
    private static final /* synthetic */ String[] llIIlllIllIllI;
    private final /* synthetic */ File mapDataDir;
    private final /* synthetic */ String saveDirectoryName;
    private static final /* synthetic */ int[] llIIlllIlllIlI;
    private static final /* synthetic */ Logger logger;
    private final /* synthetic */ File playersDirectory;
    private final /* synthetic */ long initializationTime;
    private final /* synthetic */ File worldDirectory;
    
    private void setSessionLock() {
        try {
            final File llllllllllllIllIllllIIIIIllIllII = new File(this.worldDirectory, SaveHandler.llIIlllIllIllI[SaveHandler.llIIlllIlllIlI[2]]);
            final DataOutputStream llllllllllllIllIllllIIIIIllIlIll = new DataOutputStream(new FileOutputStream(llllllllllllIllIllllIIIIIllIllII));
            try {
                llllllllllllIllIllllIIIIIllIlIll.writeLong(this.initializationTime);
                "".length();
                if (-"   ".length() > 0) {
                    return;
                }
            }
            finally {
                llllllllllllIllIllllIIIIIllIlIll.close();
            }
            llllllllllllIllIllllIIIIIllIlIll.close();
            "".length();
            if (((0x8D ^ 0x88) & ~(0xB1 ^ 0xB4)) != ((0x50 ^ 0x18) & ~(0xF8 ^ 0xB0))) {
                return;
            }
        }
        catch (IOException llllllllllllIllIllllIIIIIllIlIlI) {
            llllllllllllIllIllllIIIIIllIlIlI.printStackTrace();
            throw new RuntimeException(SaveHandler.llIIlllIllIllI[SaveHandler.llIIlllIlllIlI[3]]);
        }
    }
    
    @Override
    public IChunkLoader getChunkLoader(final WorldProvider llllllllllllIllIllllIIIIIlIlIlIl) {
        throw new RuntimeException(SaveHandler.llIIlllIllIllI[SaveHandler.llIIlllIlllIlI[7]]);
    }
    
    @Override
    public void saveWorldInfoWithPlayer(final WorldInfo llllllllllllIllIllllIIIIIIllIIlI, final NBTTagCompound llllllllllllIllIllllIIIIIIllIIIl) {
        final NBTTagCompound llllllllllllIllIllllIIIIIIlllIIl = llllllllllllIllIllllIIIIIIllIIlI.cloneNBTCompound(llllllllllllIllIllllIIIIIIllIIIl);
        final NBTTagCompound llllllllllllIllIllllIIIIIIlllIII = new NBTTagCompound();
        llllllllllllIllIllllIIIIIIlllIII.setTag(SaveHandler.llIIlllIllIllI[SaveHandler.llIIlllIlllIlI[12]], llllllllllllIllIllllIIIIIIlllIIl);
        try {
            final File llllllllllllIllIllllIIIIIIllIlll = new File(this.worldDirectory, SaveHandler.llIIlllIllIllI[SaveHandler.llIIlllIlllIlI[13]]);
            final File llllllllllllIllIllllIIIIIIllIllI = new File(this.worldDirectory, SaveHandler.llIIlllIllIllI[SaveHandler.llIIlllIlllIlI[14]]);
            final File llllllllllllIllIllllIIIIIIllIlIl = new File(this.worldDirectory, SaveHandler.llIIlllIllIllI[SaveHandler.llIIlllIlllIlI[15]]);
            CompressedStreamTools.writeCompressed(llllllllllllIllIllllIIIIIIlllIII, new FileOutputStream(llllllllllllIllIllllIIIIIIllIlll));
            if (lIIIlllllllIlllI(llllllllllllIllIllllIIIIIIllIllI.exists() ? 1 : 0)) {
                llllllllllllIllIllllIIIIIIllIllI.delete();
                "".length();
            }
            llllllllllllIllIllllIIIIIIllIlIl.renameTo(llllllllllllIllIllllIIIIIIllIllI);
            "".length();
            if (lIIIlllllllIlllI(llllllllllllIllIllllIIIIIIllIlIl.exists() ? 1 : 0)) {
                llllllllllllIllIllllIIIIIIllIlIl.delete();
                "".length();
            }
            llllllllllllIllIllllIIIIIIllIlll.renameTo(llllllllllllIllIllllIIIIIIllIlIl);
            "".length();
            if (lIIIlllllllIlllI(llllllllllllIllIllllIIIIIIllIlll.exists() ? 1 : 0)) {
                llllllllllllIllIllllIIIIIIllIlll.delete();
                "".length();
                "".length();
                if (((0x9B ^ 0x8C) & ~(0x53 ^ 0x44)) != 0x0) {
                    return;
                }
            }
        }
        catch (Exception llllllllllllIllIllllIIIIIIllIlII) {
            llllllllllllIllIllllIIIIIIllIlII.printStackTrace();
        }
    }
    
    @Override
    public NBTTagCompound readPlayerData(final EntityPlayer llllllllllllIllIlllIlllllllllIll) {
        NBTTagCompound llllllllllllIllIlllIllllllllllll = null;
        try {
            final File llllllllllllIllIlllIlllllllllllI = new File(this.playersDirectory, String.valueOf(new StringBuilder(String.valueOf(llllllllllllIllIlllIlllllllllIll.getUniqueID().toString())).append(SaveHandler.llIIlllIllIllI[SaveHandler.llIIlllIlllIlI[23]])));
            if (lIIIlllllllIlllI(llllllllllllIllIlllIlllllllllllI.exists() ? 1 : 0) && lIIIlllllllIlllI(llllllllllllIllIlllIlllllllllllI.isFile() ? 1 : 0)) {
                llllllllllllIllIlllIllllllllllll = CompressedStreamTools.readCompressed(new FileInputStream(llllllllllllIllIlllIlllllllllllI));
                "".length();
                if ("  ".length() < " ".length()) {
                    return null;
                }
            }
        }
        catch (Exception llllllllllllIllIlllIllllllllllIl) {
            SaveHandler.logger.warn(String.valueOf(new StringBuilder(SaveHandler.llIIlllIllIllI[SaveHandler.llIIlllIlllIlI[24]]).append(llllllllllllIllIlllIlllllllllIll.getName())));
        }
        if (lIIIllllllllIIIl(llllllllllllIllIlllIllllllllllll)) {
            llllllllllllIllIlllIlllllllllIll.readFromNBT(llllllllllllIllIlllIllllllllllll);
        }
        return llllllllllllIllIlllIllllllllllll;
    }
    
    private static void lIIIlllllllIlIIl() {
        (llIIlllIllIllI = new String[SaveHandler.llIIlllIlllIlI[27]])[SaveHandler.llIIlllIlllIlI[0]] = lIIIlllllllIIlII("sFKiifxdrevdEE+7vqPC7g==", "gnjcw");
        SaveHandler.llIIlllIllIllI[SaveHandler.llIIlllIlllIlI[1]] = lIIIlllllllIIlIl("KvVlFPdDI4w=", "zuafS");
        SaveHandler.llIIlllIllIllI[SaveHandler.llIIlllIlllIlI[2]] = lIIIlllllllIIlIl("tATahi8Ghe4Bvh0R8dxJQA==", "Hnvxc");
        SaveHandler.llIIlllIllIllI[SaveHandler.llIIlllIlllIlI[3]] = lIIIlllllllIIllI("ExUQNRIxVA02VzYcHDocdQccKgQ8Gxd5GzoXEnVXNBYWKwM8Gh4=", "UtyYw");
        SaveHandler.llIIlllIllIllI[SaveHandler.llIIlllIlllIlI[4]] = lIIIlllllllIIllI("GA8eHiIEBEMBJAgB", "kjmmK");
        SaveHandler.llIIlllIllIllI[SaveHandler.llIIlllIlllIlI[5]] = lIIIlllllllIIlIl("qF8dPRrCkSFG3x1U5jVYJEiMydznXV/9G0MFgFocrLrAoIe4Zu86Vl373KDX3jpdP11t+QvOVyj2Yvo9O1FAIw==", "PPEKz");
        SaveHandler.llIIlllIllIllI[SaveHandler.llIIlllIlllIlI[6]] = lIIIlllllllIIlII("fw2FjIpqKJL6BROha3Bn159xYZ3fXjS9obxOsoFQyOCu132GRlMQdQ==", "LhZkk");
        SaveHandler.llIIlllIllIllI[SaveHandler.llIIlllIlllIlI[7]] = lIIIlllllllIIlIl("0hJ6/1EQaqCLjCV7qEkQhjOWPLMQedJTvXGiErRPJWrV3zSmXWUHSJ5+D6JRm61j", "Gfxqk");
        SaveHandler.llIIlllIllIllI[SaveHandler.llIIlllIlllIlI[8]] = lIIIlllllllIIlII("Yo7Vl5xaNZmsyPp/UjLSpQ==", "mRyFu");
        SaveHandler.llIIlllIllIllI[SaveHandler.llIIlllIlllIlI[9]] = lIIIlllllllIIllI("CjI/BQ==", "NSKdm");
        SaveHandler.llIIlllIllIllI[SaveHandler.llIIlllIlllIlI[10]] = lIIIlllllllIIlIl("RoWFEAA4E9pSwkjtqmcuVQ==", "TxaXK");
        SaveHandler.llIIlllIllIllI[SaveHandler.llIIlllIlllIlI[11]] = lIIIlllllllIIlIl("5NVW50/xhDM=", "oXctW");
        SaveHandler.llIIlllIllIllI[SaveHandler.llIIlllIlllIlI[12]] = lIIIlllllllIIllI("FQoEOw==", "QkpZI");
        SaveHandler.llIIlllIllIllI[SaveHandler.llIIlllIlllIlI[13]] = lIIIlllllllIIlIl("weha0eLiHWMb4nIqhUYdEg==", "LlGAV");
        SaveHandler.llIIlllIllIllI[SaveHandler.llIIlllIlllIlI[14]] = lIIIlllllllIIllI("ASYUEh5DJwMDLQIvBg==", "mCbwr");
        SaveHandler.llIIlllIllIllI[SaveHandler.llIIlllIlllIlI[15]] = lIIIlllllllIIllI("NjQvKxR0NTg6", "ZQYNx");
        SaveHandler.llIIlllIllIllI[SaveHandler.llIIlllIlllIlI[16]] = lIIIlllllllIIlIl("XlQCZKB5hMc=", "siAsv");
        SaveHandler.llIIlllIllIllI[SaveHandler.llIIlllIlllIlI[17]] = lIIIlllllllIIllI("PCQuCBZ+JTkZJT4kLw==", "PAXmz");
        SaveHandler.llIIlllIllIllI[SaveHandler.llIIlllIlllIlI[18]] = lIIIlllllllIIllI("CRE6IhpLEC0zKQoYKA==", "etLGv");
        SaveHandler.llIIlllIllIllI[SaveHandler.llIIlllIlllIlI[19]] = lIIIlllllllIIlIl("CCljFUvFRHDfErkQoJbzTw==", "YsxHX");
        SaveHandler.llIIlllIllIllI[SaveHandler.llIIlllIlllIlI[20]] = lIIIlllllllIIlIl("iVX08yeiNIuAXONj+YOq6Q==", "vKcbf");
        SaveHandler.llIIlllIllIllI[SaveHandler.llIIlllIlllIlI[21]] = lIIIlllllllIIlII("64SOBqjRLIw=", "ryvZm");
        SaveHandler.llIIlllIllIllI[SaveHandler.llIIlllIlllIlI[22]] = lIIIlllllllIIlII("z/4qf6SKB9KSiq524VM89UYmy6k1J83FxQoBDhGjqGU=", "vUSjc");
        SaveHandler.llIIlllIllIllI[SaveHandler.llIIlllIlllIlI[23]] = lIIIlllllllIIllI("VhIXNQ==", "xvvAb");
        SaveHandler.llIIlllIllIllI[SaveHandler.llIIlllIlllIlI[24]] = lIIIlllllllIIlII("hcmLlEkG9rvFGmmOTXkL65dO19/kLwO5DV6ds7oyQXA=", "MeJOO");
        SaveHandler.llIIlllIllIllI[SaveHandler.llIIlllIlllIlI[25]] = lIIIlllllllIIllI("TwMWJQ==", "agwQj");
        SaveHandler.llIIlllIllIllI[SaveHandler.llIIlllIlllIlI[26]] = lIIIlllllllIIllI("fA02Fg==", "RiWbE");
    }
    
    private static String lIIIlllllllIIlIl(final String llllllllllllIllIlllIllllllIllIll, final String llllllllllllIllIlllIllllllIllIlI) {
        try {
            final SecretKeySpec llllllllllllIllIlllIllllllIllllI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIllIlllIllllllIllIlI.getBytes(StandardCharsets.UTF_8)), SaveHandler.llIIlllIlllIlI[8]), "DES");
            final Cipher llllllllllllIllIlllIllllllIlllIl = Cipher.getInstance("DES");
            llllllllllllIllIlllIllllllIlllIl.init(SaveHandler.llIIlllIlllIlI[2], llllllllllllIllIlllIllllllIllllI);
            return new String(llllllllllllIllIlllIllllllIlllIl.doFinal(Base64.getDecoder().decode(llllllllllllIllIlllIllllllIllIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIllIlllIllllllIlllII) {
            llllllllllllIllIlllIllllllIlllII.printStackTrace();
            return null;
        }
    }
    
    @Override
    public File getWorldDirectory() {
        return this.worldDirectory;
    }
    
    private static String lIIIlllllllIIllI(String llllllllllllIllIlllIllllllIIIllI, final String llllllllllllIllIlllIllllllIIlIlI) {
        llllllllllllIllIlllIllllllIIIllI = new String(Base64.getDecoder().decode(llllllllllllIllIlllIllllllIIIllI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder llllllllllllIllIlllIllllllIIlIIl = new StringBuilder();
        final char[] llllllllllllIllIlllIllllllIIlIII = llllllllllllIllIlllIllllllIIlIlI.toCharArray();
        int llllllllllllIllIlllIllllllIIIlll = SaveHandler.llIIlllIlllIlI[0];
        final long llllllllllllIllIlllIllllllIIIIIl = (Object)llllllllllllIllIlllIllllllIIIllI.toCharArray();
        final double llllllllllllIllIlllIllllllIIIIII = llllllllllllIllIlllIllllllIIIIIl.length;
        double llllllllllllIllIlllIlllllIllllll = SaveHandler.llIIlllIlllIlI[0];
        while (lIIIllllllllIlII((int)llllllllllllIllIlllIlllllIllllll, (int)llllllllllllIllIlllIllllllIIIIII)) {
            final char llllllllllllIllIlllIllllllIIllII = llllllllllllIllIlllIllllllIIIIIl[llllllllllllIllIlllIlllllIllllll];
            llllllllllllIllIlllIllllllIIlIIl.append((char)(llllllllllllIllIlllIllllllIIllII ^ llllllllllllIllIlllIllllllIIlIII[llllllllllllIllIlllIllllllIIIlll % llllllllllllIllIlllIllllllIIlIII.length]));
            "".length();
            ++llllllllllllIllIlllIllllllIIIlll;
            ++llllllllllllIllIlllIlllllIllllll;
            "".length();
            if (-"  ".length() > 0) {
                return null;
            }
        }
        return String.valueOf(llllllllllllIllIlllIllllllIIlIIl);
    }
    
    @Override
    public void writePlayerData(final EntityPlayer llllllllllllIllIllllIIIIIIIIlIIl) {
        try {
            final NBTTagCompound llllllllllllIllIllllIIIIIIIIlllI = new NBTTagCompound();
            llllllllllllIllIllllIIIIIIIIlIIl.writeToNBT(llllllllllllIllIllllIIIIIIIIlllI);
            final File llllllllllllIllIllllIIIIIIIIllIl = new File(this.playersDirectory, String.valueOf(new StringBuilder(String.valueOf(llllllllllllIllIllllIIIIIIIIlIIl.getUniqueID().toString())).append(SaveHandler.llIIlllIllIllI[SaveHandler.llIIlllIlllIlI[20]])));
            final File llllllllllllIllIllllIIIIIIIIllII = new File(this.playersDirectory, String.valueOf(new StringBuilder(String.valueOf(llllllllllllIllIllllIIIIIIIIlIIl.getUniqueID().toString())).append(SaveHandler.llIIlllIllIllI[SaveHandler.llIIlllIlllIlI[21]])));
            CompressedStreamTools.writeCompressed(llllllllllllIllIllllIIIIIIIIlllI, new FileOutputStream(llllllllllllIllIllllIIIIIIIIllIl));
            if (lIIIlllllllIlllI(llllllllllllIllIllllIIIIIIIIllII.exists() ? 1 : 0)) {
                llllllllllllIllIllllIIIIIIIIllII.delete();
                "".length();
            }
            llllllllllllIllIllllIIIIIIIIllIl.renameTo(llllllllllllIllIllllIIIIIIIIllII);
            "".length();
            "".length();
            if ("  ".length() != "  ".length()) {
                return;
            }
        }
        catch (Exception llllllllllllIllIllllIIIIIIIIlIll) {
            SaveHandler.logger.warn(String.valueOf(new StringBuilder(SaveHandler.llIIlllIllIllI[SaveHandler.llIIlllIlllIlI[22]]).append(llllllllllllIllIllllIIIIIIIIlIIl.getName())));
        }
    }
    
    static {
        lIIIlllllllIllIl();
        lIIIlllllllIlIIl();
        logger = LogManager.getLogger();
    }
    
    private static boolean lIIIlllllllIlllI(final int llllllllllllIllIlllIlllllIlIIIll) {
        return llllllllllllIllIlllIlllllIlIIIll != 0;
    }
    
    private static boolean lIIIllllllllIIIl(final Object llllllllllllIllIlllIlllllIlIIlll) {
        return llllllllllllIllIlllIlllllIlIIlll != null;
    }
    
    @Override
    public String getWorldDirectoryName() {
        return this.saveDirectoryName;
    }
    
    private static String lIIIlllllllIIlII(final String llllllllllllIllIlllIlllllIllIlII, final String llllllllllllIllIlllIlllllIllIIll) {
        try {
            final SecretKeySpec llllllllllllIllIlllIlllllIlllIIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIllIlllIlllllIllIIll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher llllllllllllIllIlllIlllllIlllIII = Cipher.getInstance("Blowfish");
            llllllllllllIllIlllIlllllIlllIII.init(SaveHandler.llIIlllIlllIlI[2], llllllllllllIllIlllIlllllIlllIIl);
            return new String(llllllllllllIllIlllIlllllIlllIII.doFinal(Base64.getDecoder().decode(llllllllllllIllIlllIlllllIllIlII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIllIlllIlllllIllIlll) {
            llllllllllllIllIlllIlllllIllIlll.printStackTrace();
            return null;
        }
    }
    
    private static boolean lIIIllllllllIIll(final int llllllllllllIllIlllIlllllIlIlllI, final int llllllllllllIllIlllIlllllIlIllIl) {
        return llllllllllllIllIlllIlllllIlIlllI >= llllllllllllIllIlllIlllllIlIllIl;
    }
    
    private static boolean lIIIllllllllIlII(final int llllllllllllIllIlllIlllllIlIlIlI, final int llllllllllllIllIlllIlllllIlIlIIl) {
        return llllllllllllIllIlllIlllllIlIlIlI < llllllllllllIllIlllIlllllIlIlIIl;
    }
    
    @Override
    public WorldInfo loadWorldInfo() {
        File llllllllllllIllIllllIIIIIlIIllll = new File(this.worldDirectory, SaveHandler.llIIlllIllIllI[SaveHandler.llIIlllIlllIlI[8]]);
        if (lIIIlllllllIlllI(llllllllllllIllIllllIIIIIlIIllll.exists() ? 1 : 0)) {
            try {
                final NBTTagCompound llllllllllllIllIllllIIIIIlIIlllI = CompressedStreamTools.readCompressed(new FileInputStream(llllllllllllIllIllllIIIIIlIIllll));
                final NBTTagCompound llllllllllllIllIllllIIIIIlIIllIl = llllllllllllIllIllllIIIIIlIIlllI.getCompoundTag(SaveHandler.llIIlllIllIllI[SaveHandler.llIIlllIlllIlI[9]]);
                return new WorldInfo(llllllllllllIllIllllIIIIIlIIllIl);
            }
            catch (Exception llllllllllllIllIllllIIIIIlIIllII) {
                llllllllllllIllIllllIIIIIlIIllII.printStackTrace();
            }
        }
        llllllllllllIllIllllIIIIIlIIllll = new File(this.worldDirectory, SaveHandler.llIIlllIllIllI[SaveHandler.llIIlllIlllIlI[10]]);
        if (lIIIlllllllIlllI(llllllllllllIllIllllIIIIIlIIllll.exists() ? 1 : 0)) {
            try {
                final NBTTagCompound llllllllllllIllIllllIIIIIlIIlIll = CompressedStreamTools.readCompressed(new FileInputStream(llllllllllllIllIllllIIIIIlIIllll));
                final NBTTagCompound llllllllllllIllIllllIIIIIlIIlIlI = llllllllllllIllIllllIIIIIlIIlIll.getCompoundTag(SaveHandler.llIIlllIllIllI[SaveHandler.llIIlllIlllIlI[11]]);
                return new WorldInfo(llllllllllllIllIllllIIIIIlIIlIlI);
            }
            catch (Exception llllllllllllIllIllllIIIIIlIIlIIl) {
                llllllllllllIllIllllIIIIIlIIlIIl.printStackTrace();
            }
        }
        return null;
    }
    
    @Override
    public void checkSessionLock() throws MinecraftException {
        try {
            final File llllllllllllIllIllllIIIIIlIlllIl = new File(this.worldDirectory, SaveHandler.llIIlllIllIllI[SaveHandler.llIIlllIlllIlI[4]]);
            final DataInputStream llllllllllllIllIllllIIIIIlIlllII = new DataInputStream(new FileInputStream(llllllllllllIllIllllIIIIIlIlllIl));
            try {
                if (lIIIlllllllIlllI(lIIIllllllllIIII(llllllllllllIllIllllIIIIIlIlllII.readLong(), this.initializationTime))) {
                    throw new MinecraftException(SaveHandler.llIIlllIllIllI[SaveHandler.llIIlllIlllIlI[5]]);
                }
            }
            finally {
                llllllllllllIllIllllIIIIIlIlllII.close();
            }
            llllllllllllIllIllllIIIIIlIlllII.close();
            "".length();
            if ("  ".length() == 0) {
                return;
            }
        }
        catch (IOException llllllllllllIllIllllIIIIIlIllIll) {
            throw new MinecraftException(SaveHandler.llIIlllIllIllI[SaveHandler.llIIlllIlllIlI[6]]);
        }
    }
    
    @Override
    public String[] getAvailablePlayerDat() {
        String[] llllllllllllIllIlllIllllllllIIIl = this.playersDirectory.list();
        if (lIIIllllllllIIlI(llllllllllllIllIlllIllllllllIIIl)) {
            llllllllllllIllIlllIllllllllIIIl = new String[SaveHandler.llIIlllIlllIlI[0]];
        }
        int llllllllllllIllIlllIllllllllIIII = SaveHandler.llIIlllIlllIlI[0];
        "".length();
        if ("  ".length() > "  ".length()) {
            return null;
        }
        while (!lIIIllllllllIIll(llllllllllllIllIlllIllllllllIIII, llllllllllllIllIlllIllllllllIIIl.length)) {
            if (lIIIlllllllIlllI(llllllllllllIllIlllIllllllllIIIl[llllllllllllIllIlllIllllllllIIII].endsWith(SaveHandler.llIIlllIllIllI[SaveHandler.llIIlllIlllIlI[25]]) ? 1 : 0)) {
                llllllllllllIllIlllIllllllllIIIl[llllllllllllIllIlllIllllllllIIII] = llllllllllllIllIlllIllllllllIIIl[llllllllllllIllIlllIllllllllIIII].substring(SaveHandler.llIIlllIlllIlI[0], llllllllllllIllIlllIllllllllIIIl[llllllllllllIllIlllIllllllllIIII].length() - SaveHandler.llIIlllIlllIlI[4]);
            }
            ++llllllllllllIllIlllIllllllllIIII;
        }
        return llllllllllllIllIlllIllllllllIIIl;
    }
    
    @Override
    public File getMapFileFromName(final String llllllllllllIllIlllIlllllllIIllI) {
        return new File(this.mapDataDir, String.valueOf(new StringBuilder(String.valueOf(llllllllllllIllIlllIlllllllIIllI)).append(SaveHandler.llIIlllIllIllI[SaveHandler.llIIlllIlllIlI[26]])));
    }
    
    private static int lIIIllllllllIIII(final long n, final long n2) {
        return lcmp(n, n2);
    }
    
    private static boolean lIIIllllllllIIlI(final Object llllllllllllIllIlllIlllllIlIIlIl) {
        return llllllllllllIllIlllIlllllIlIIlIl == null;
    }
    
    private static void lIIIlllllllIllIl() {
        (llIIlllIlllIlI = new int[28])[0] = ((0x41 ^ 0x36 ^ (0xF6 ^ 0xA9)) & (0xD5 ^ 0x98 ^ (0x5 ^ 0x60) ^ -" ".length()));
        SaveHandler.llIIlllIlllIlI[1] = " ".length();
        SaveHandler.llIIlllIlllIlI[2] = "  ".length();
        SaveHandler.llIIlllIlllIlI[3] = "   ".length();
        SaveHandler.llIIlllIlllIlI[4] = ("   ".length() ^ (0xB1 ^ 0xB6));
        SaveHandler.llIIlllIlllIlI[5] = (0x15 ^ 0x10);
        SaveHandler.llIIlllIlllIlI[6] = (0x18 ^ 0x1E);
        SaveHandler.llIIlllIlllIlI[7] = (0xA6 ^ 0xA1);
        SaveHandler.llIIlllIlllIlI[8] = (0x2C ^ 0x24);
        SaveHandler.llIIlllIlllIlI[9] = (0x82 ^ 0x90 ^ (0x79 ^ 0x62));
        SaveHandler.llIIlllIlllIlI[10] = (0x7D ^ 0x6F ^ (0x67 ^ 0x7F));
        SaveHandler.llIIlllIlllIlI[11] = (0x87 ^ 0x8C);
        SaveHandler.llIIlllIlllIlI[12] = (0x49 ^ 0x45);
        SaveHandler.llIIlllIlllIlI[13] = (0xB0 ^ 0xC3 ^ (0x14 ^ 0x6A));
        SaveHandler.llIIlllIlllIlI[14] = (0x48 ^ 0x1E ^ (0x8 ^ 0x50));
        SaveHandler.llIIlllIlllIlI[15] = (0xA2 ^ 0xAD);
        SaveHandler.llIIlllIlllIlI[16] = (0x1B ^ 0xB);
        SaveHandler.llIIlllIlllIlI[17] = (0xBE ^ 0xAF);
        SaveHandler.llIIlllIlllIlI[18] = (0x73 ^ 0x3E ^ (0xCD ^ 0x92));
        SaveHandler.llIIlllIlllIlI[19] = (0x8F ^ 0x9C);
        SaveHandler.llIIlllIlllIlI[20] = (0x9C ^ 0x88);
        SaveHandler.llIIlllIlllIlI[21] = (118 + 29 - 91 + 130 ^ 97 + 118 - 194 + 154);
        SaveHandler.llIIlllIlllIlI[22] = (0x1A ^ 0x43 ^ (0xF4 ^ 0xBB));
        SaveHandler.llIIlllIlllIlI[23] = (0xD ^ 0x2F ^ (0x5A ^ 0x6F));
        SaveHandler.llIIlllIlllIlI[24] = (0x43 ^ 0x53 ^ (0x31 ^ 0x39));
        SaveHandler.llIIlllIlllIlI[25] = (0x78 ^ 0x61);
        SaveHandler.llIIlllIlllIlI[26] = (0x4A ^ 0x50);
        SaveHandler.llIIlllIlllIlI[27] = (0x58 ^ 0xC ^ (0xC0 ^ 0x8F));
    }
    
    @Override
    public void flush() {
    }
    
    public SaveHandler(final File llllllllllllIllIllllIIIIIllllIII, final String llllllllllllIllIllllIIIIIlllIIll, final boolean llllllllllllIllIllllIIIIIlllIIlI) {
        this.initializationTime = MinecraftServer.getCurrentTimeMillis();
        this.worldDirectory = new File(llllllllllllIllIllllIIIIIllllIII, llllllllllllIllIllllIIIIIlllIIll);
        this.worldDirectory.mkdirs();
        "".length();
        this.playersDirectory = new File(this.worldDirectory, SaveHandler.llIIlllIllIllI[SaveHandler.llIIlllIlllIlI[0]]);
        this.mapDataDir = new File(this.worldDirectory, SaveHandler.llIIlllIllIllI[SaveHandler.llIIlllIlllIlI[1]]);
        this.mapDataDir.mkdirs();
        "".length();
        this.saveDirectoryName = llllllllllllIllIllllIIIIIlllIIll;
        if (lIIIlllllllIlllI(llllllllllllIllIllllIIIIIlllIIlI ? 1 : 0)) {
            this.playersDirectory.mkdirs();
            "".length();
        }
        this.setSessionLock();
    }
    
    @Override
    public IPlayerFileData getPlayerNBTManager() {
        return this;
    }
    
    @Override
    public void saveWorldInfo(final WorldInfo llllllllllllIllIllllIIIIIIIllIll) {
        final NBTTagCompound llllllllllllIllIllllIIIIIIlIIIlI = llllllllllllIllIllllIIIIIIIllIll.getNBTTagCompound();
        final NBTTagCompound llllllllllllIllIllllIIIIIIlIIIIl = new NBTTagCompound();
        llllllllllllIllIllllIIIIIIlIIIIl.setTag(SaveHandler.llIIlllIllIllI[SaveHandler.llIIlllIlllIlI[16]], llllllllllllIllIllllIIIIIIlIIIlI);
        try {
            final File llllllllllllIllIllllIIIIIIlIIIII = new File(this.worldDirectory, SaveHandler.llIIlllIllIllI[SaveHandler.llIIlllIlllIlI[17]]);
            final File llllllllllllIllIllllIIIIIIIlllll = new File(this.worldDirectory, SaveHandler.llIIlllIllIllI[SaveHandler.llIIlllIlllIlI[18]]);
            final File llllllllllllIllIllllIIIIIIIllllI = new File(this.worldDirectory, SaveHandler.llIIlllIllIllI[SaveHandler.llIIlllIlllIlI[19]]);
            CompressedStreamTools.writeCompressed(llllllllllllIllIllllIIIIIIlIIIIl, new FileOutputStream(llllllllllllIllIllllIIIIIIlIIIII));
            if (lIIIlllllllIlllI(llllllllllllIllIllllIIIIIIIlllll.exists() ? 1 : 0)) {
                llllllllllllIllIllllIIIIIIIlllll.delete();
                "".length();
            }
            llllllllllllIllIllllIIIIIIIllllI.renameTo(llllllllllllIllIllllIIIIIIIlllll);
            "".length();
            if (lIIIlllllllIlllI(llllllllllllIllIllllIIIIIIIllllI.exists() ? 1 : 0)) {
                llllllllllllIllIllllIIIIIIIllllI.delete();
                "".length();
            }
            llllllllllllIllIllllIIIIIIlIIIII.renameTo(llllllllllllIllIllllIIIIIIIllllI);
            "".length();
            if (lIIIlllllllIlllI(llllllllllllIllIllllIIIIIIlIIIII.exists() ? 1 : 0)) {
                llllllllllllIllIllllIIIIIIlIIIII.delete();
                "".length();
                "".length();
                if ("   ".length() <= -" ".length()) {
                    return;
                }
            }
        }
        catch (Exception llllllllllllIllIllllIIIIIIIlllIl) {
            llllllllllllIllIllllIIIIIIIlllIl.printStackTrace();
        }
    }
}
