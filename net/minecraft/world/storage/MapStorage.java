// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.world.storage;

import java.util.Iterator;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import java.io.DataOutput;
import java.io.DataOutputStream;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.security.MessageDigest;
import net.minecraft.nbt.NBTTagShort;
import java.io.DataInputStream;
import java.io.OutputStream;
import java.io.FileOutputStream;
import net.minecraft.nbt.NBTBase;
import net.minecraft.nbt.NBTTagCompound;
import java.lang.reflect.Constructor;
import java.io.File;
import java.io.InputStream;
import net.minecraft.nbt.CompressedStreamTools;
import java.io.FileInputStream;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.Map;
import net.minecraft.world.WorldSavedData;
import java.util.List;

public class MapStorage
{
    private /* synthetic */ List<WorldSavedData> loadedDataList;
    protected /* synthetic */ Map<String, WorldSavedData> loadedDataMap;
    private /* synthetic */ ISaveHandler saveHandler;
    private /* synthetic */ Map<String, Short> idCounts;
    private static final /* synthetic */ String[] lIIlIIIlIIIIIl;
    private static final /* synthetic */ int[] lIIlIIlIIIIlll;
    
    private static boolean llIIlIlllllllIl(final int lllllllllllllIIlllIIIIllllIIlllI, final int lllllllllllllIIlllIIIIllllIIllIl) {
        return lllllllllllllIIlllIIIIllllIIlllI >= lllllllllllllIIlllIIIIllllIIllIl;
    }
    
    private static boolean llIIlIlllllllll(final int lllllllllllllIIlllIIIIllllIIIIIl) {
        return lllllllllllllIIlllIIIIllllIIIIIl == 0;
    }
    
    public void saveAllData() {
        int lllllllllllllIIlllIIIlIIIllIIIlI = MapStorage.lIIlIIlIIIIlll[1];
        "".length();
        if (((0xDD ^ 0x8A ^ (0xB4 ^ 0xBC)) & (0xC9 ^ 0xB1 ^ (0x14 ^ 0x33) ^ -" ".length())) > 0) {
            return;
        }
        while (!llIIlIlllllllIl(lllllllllllllIIlllIIIlIIIllIIIlI, this.loadedDataList.size())) {
            final WorldSavedData lllllllllllllIIlllIIIlIIIllIIIIl = this.loadedDataList.get(lllllllllllllIIlllIIIlIIIllIIIlI);
            if (llIIlIlllllllII(lllllllllllllIIlllIIIlIIIllIIIIl.isDirty() ? 1 : 0)) {
                this.saveData(lllllllllllllIIlllIIIlIIIllIIIIl);
                lllllllllllllIIlllIIIlIIIllIIIIl.setDirty((boolean)(MapStorage.lIIlIIlIIIIlll[1] != 0));
            }
            ++lllllllllllllIIlllIIIlIIIllIIIlI;
        }
    }
    
    private static String llIIlIlIIlIlIIl(String lllllllllllllIIlllIIIIlllllIlIll, final String lllllllllllllIIlllIIIIlllllIIlIl) {
        lllllllllllllIIlllIIIIlllllIlIll = new String(Base64.getDecoder().decode(lllllllllllllIIlllIIIIlllllIlIll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIIlllIIIIlllllIlIIl = new StringBuilder();
        final char[] lllllllllllllIIlllIIIIlllllIlIII = lllllllllllllIIlllIIIIlllllIIlIl.toCharArray();
        int lllllllllllllIIlllIIIIlllllIIlll = MapStorage.lIIlIIlIIIIlll[1];
        final String lllllllllllllIIlllIIIIlllllIIIIl = (Object)lllllllllllllIIlllIIIIlllllIlIll.toCharArray();
        final Exception lllllllllllllIIlllIIIIlllllIIIII = (Exception)lllllllllllllIIlllIIIIlllllIIIIl.length;
        short lllllllllllllIIlllIIIIllllIlllll = (short)MapStorage.lIIlIIlIIIIlll[1];
        while (llIIllIIIIIIIIl(lllllllllllllIIlllIIIIllllIlllll, (int)lllllllllllllIIlllIIIIlllllIIIII)) {
            final char lllllllllllllIIlllIIIIlllllIllII = lllllllllllllIIlllIIIIlllllIIIIl[lllllllllllllIIlllIIIIllllIlllll];
            lllllllllllllIIlllIIIIlllllIlIIl.append((char)(lllllllllllllIIlllIIIIlllllIllII ^ lllllllllllllIIlllIIIIlllllIlIII[lllllllllllllIIlllIIIIlllllIIlll % lllllllllllllIIlllIIIIlllllIlIII.length]));
            "".length();
            ++lllllllllllllIIlllIIIIlllllIIlll;
            ++lllllllllllllIIlllIIIIllllIlllll;
            "".length();
            if (((0xB9 ^ 0x85) & ~(0x34 ^ 0x8)) < 0) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIIlllIIIIlllllIlIIl);
    }
    
    private static boolean llIIlIlllllllII(final int lllllllllllllIIlllIIIIllllIIIIll) {
        return lllllllllllllIIlllIIIIllllIIIIll != 0;
    }
    
    private static boolean llIIlIllllllIll(final Object lllllllllllllIIlllIIIIllllIIIlll) {
        return lllllllllllllIIlllIIIIllllIIIlll != null;
    }
    
    private static boolean llIIllIIIIIIIIl(final int lllllllllllllIIlllIIIIllllIIlIlI, final int lllllllllllllIIlllIIIIllllIIlIIl) {
        return lllllllllllllIIlllIIIIllllIIlIlI < lllllllllllllIIlllIIIIllllIIlIIl;
    }
    
    private static boolean llIIlIllllllllI(final Object lllllllllllllIIlllIIIIllllIIIlIl) {
        return lllllllllllllIIlllIIIIllllIIIlIl == null;
    }
    
    private static void llIIlIllllllIlI() {
        (lIIlIIlIIIIlll = new int[7])[0] = " ".length();
        MapStorage.lIIlIIlIIIIlll[1] = ((0x52 ^ 0x7D) & ~(0x1F ^ 0x30));
        MapStorage.lIIlIIlIIIIlll[2] = "  ".length();
        MapStorage.lIIlIIlIIIIlll[3] = "   ".length();
        MapStorage.lIIlIIlIIIIlll[4] = (0x6A ^ 0x6E);
        MapStorage.lIIlIIlIIIIlll[5] = (0x19 ^ 0x1C);
        MapStorage.lIIlIIlIIIIlll[6] = (0x5D ^ 0x55);
    }
    
    public WorldSavedData loadData(final Class<? extends WorldSavedData> lllllllllllllIIlllIIIlIIlIIIlIlI, final String lllllllllllllIIlllIIIlIIlIIIlIIl) {
        WorldSavedData lllllllllllllIIlllIIIlIIlIIIlIII = this.loadedDataMap.get(lllllllllllllIIlllIIIlIIlIIIlIIl);
        if (llIIlIllllllIll(lllllllllllllIIlllIIIlIIlIIIlIII)) {
            return lllllllllllllIIlllIIIlIIlIIIlIII;
        }
        if (llIIlIllllllIll(this.saveHandler)) {
            try {
                final File lllllllllllllIIlllIIIlIIlIIIIlll = this.saveHandler.getMapFileFromName(lllllllllllllIIlllIIIlIIlIIIlIIl);
                if (llIIlIllllllIll(lllllllllllllIIlllIIIlIIlIIIIlll) && llIIlIlllllllII(lllllllllllllIIlllIIIlIIlIIIIlll.exists() ? 1 : 0)) {
                    try {
                        final Class[] parameterTypes = new Class[MapStorage.lIIlIIlIIIIlll[0]];
                        parameterTypes[MapStorage.lIIlIIlIIIIlll[1]] = String.class;
                        final Constructor<? extends WorldSavedData> constructor = lllllllllllllIIlllIIIlIIlIIIlIlI.getConstructor((Class<?>[])parameterTypes);
                        final Object[] initargs = new Object[MapStorage.lIIlIIlIIIIlll[0]];
                        initargs[MapStorage.lIIlIIlIIIIlll[1]] = lllllllllllllIIlllIIIlIIlIIIlIIl;
                        lllllllllllllIIlllIIIlIIlIIIlIII = (WorldSavedData)constructor.newInstance(initargs);
                        "".length();
                        if (" ".length() <= 0) {
                            return null;
                        }
                    }
                    catch (Exception lllllllllllllIIlllIIIlIIlIIIIlIl) {
                        throw new RuntimeException(String.valueOf(new StringBuilder(MapStorage.lIIlIIIlIIIIIl[MapStorage.lIIlIIlIIIIlll[1]]).append(lllllllllllllIIlllIIIlIIlIIIlIlI.toString())), lllllllllllllIIlllIIIlIIlIIIIlIl);
                    }
                    final FileInputStream lllllllllllllIIlllIIIlIIlIIIIlII = new FileInputStream(lllllllllllllIIlllIIIlIIlIIIIlll);
                    final NBTTagCompound lllllllllllllIIlllIIIlIIlIIIIIll = CompressedStreamTools.readCompressed(lllllllllllllIIlllIIIlIIlIIIIlII);
                    lllllllllllllIIlllIIIlIIlIIIIlII.close();
                    lllllllllllllIIlllIIIlIIlIIIlIII.readFromNBT(lllllllllllllIIlllIIIlIIlIIIIIll.getCompoundTag(MapStorage.lIIlIIIlIIIIIl[MapStorage.lIIlIIlIIIIlll[0]]));
                    "".length();
                    if (-(0x41 ^ 0x1C ^ (0x75 ^ 0x2D)) >= 0) {
                        return null;
                    }
                }
            }
            catch (Exception lllllllllllllIIlllIIIlIIlIIIIIlI) {
                lllllllllllllIIlllIIIlIIlIIIIIlI.printStackTrace();
            }
        }
        if (llIIlIllllllIll(lllllllllllllIIlllIIIlIIlIIIlIII)) {
            this.loadedDataMap.put(lllllllllllllIIlllIIIlIIlIIIlIIl, lllllllllllllIIlllIIIlIIlIIIlIII);
            "".length();
            this.loadedDataList.add(lllllllllllllIIlllIIIlIIlIIIlIII);
            "".length();
        }
        return lllllllllllllIIlllIIIlIIlIIIlIII;
    }
    
    private void saveData(final WorldSavedData lllllllllllllIIlllIIIlIIIlIIIIll) {
        if (llIIlIllllllIll(this.saveHandler)) {
            try {
                final File lllllllllllllIIlllIIIlIIIlIIlIlI = this.saveHandler.getMapFileFromName(lllllllllllllIIlllIIIlIIIlIIIIll.mapName);
                if (llIIlIllllllIll(lllllllllllllIIlllIIIlIIIlIIlIlI)) {
                    final NBTTagCompound lllllllllllllIIlllIIIlIIIlIIlIII = new NBTTagCompound();
                    lllllllllllllIIlllIIIlIIIlIIIIll.writeToNBT(lllllllllllllIIlllIIIlIIIlIIlIII);
                    final NBTTagCompound lllllllllllllIIlllIIIlIIIlIIIlll = new NBTTagCompound();
                    lllllllllllllIIlllIIIlIIIlIIIlll.setTag(MapStorage.lIIlIIIlIIIIIl[MapStorage.lIIlIIlIIIIlll[2]], lllllllllllllIIlllIIIlIIIlIIlIII);
                    final FileOutputStream lllllllllllllIIlllIIIlIIIlIIIllI = new FileOutputStream(lllllllllllllIIlllIIIlIIIlIIlIlI);
                    CompressedStreamTools.writeCompressed(lllllllllllllIIlllIIIlIIIlIIIlll, lllllllllllllIIlllIIIlIIIlIIIllI);
                    lllllllllllllIIlllIIIlIIIlIIIllI.close();
                    "".length();
                    if (null != null) {
                        return;
                    }
                }
            }
            catch (Exception lllllllllllllIIlllIIIlIIIlIIIlIl) {
                lllllllllllllIIlllIIIlIIIlIIIlIl.printStackTrace();
            }
        }
    }
    
    private void loadIdCounts() {
        try {
            this.idCounts.clear();
            if (llIIlIllllllllI(this.saveHandler)) {
                return;
            }
            final File lllllllllllllIIlllIIIlIIIIlIIIll = this.saveHandler.getMapFileFromName(MapStorage.lIIlIIIlIIIIIl[MapStorage.lIIlIIlIIIIlll[3]]);
            if (llIIlIllllllIll(lllllllllllllIIlllIIIlIIIIlIIIll) && llIIlIlllllllII(lllllllllllllIIlllIIIlIIIIlIIIll.exists() ? 1 : 0)) {
                final DataInputStream lllllllllllllIIlllIIIlIIIIlIIIlI = new DataInputStream(new FileInputStream(lllllllllllllIIlllIIIlIIIIlIIIll));
                final NBTTagCompound lllllllllllllIIlllIIIlIIIIlIIIIl = CompressedStreamTools.read(lllllllllllllIIlllIIIlIIIIlIIIlI);
                lllllllllllllIIlllIIIlIIIIlIIIlI.close();
                final Exception lllllllllllllIIlllIIIlIIIIIlIIlI = (Exception)lllllllllllllIIlllIIIlIIIIlIIIIl.getKeySet().iterator();
                "".length();
                if (-(0xF2 ^ 0x9B ^ (0xA9 ^ 0xC4)) >= 0) {
                    return;
                }
                while (!llIIlIlllllllll(((Iterator)lllllllllllllIIlllIIIlIIIIIlIIlI).hasNext() ? 1 : 0)) {
                    final String lllllllllllllIIlllIIIlIIIIlIIIII = ((Iterator<String>)lllllllllllllIIlllIIIlIIIIIlIIlI).next();
                    final NBTBase lllllllllllllIIlllIIIlIIIIIlllll = lllllllllllllIIlllIIIlIIIIlIIIIl.getTag(lllllllllllllIIlllIIIlIIIIlIIIII);
                    if (llIIlIlllllllII((lllllllllllllIIlllIIIlIIIIIlllll instanceof NBTTagShort) ? 1 : 0)) {
                        final NBTTagShort lllllllllllllIIlllIIIlIIIIIllllI = (NBTTagShort)lllllllllllllIIlllIIIlIIIIIlllll;
                        final short lllllllllllllIIlllIIIlIIIIIlllIl = lllllllllllllIIlllIIIlIIIIIllllI.getShort();
                        this.idCounts.put(lllllllllllllIIlllIIIlIIIIlIIIII, lllllllllllllIIlllIIIlIIIIIlllIl);
                        "".length();
                    }
                }
                "".length();
                if (" ".length() == ((0x92 ^ 0xA9) & ~(0x70 ^ 0x4B))) {
                    return;
                }
            }
        }
        catch (Exception lllllllllllllIIlllIIIlIIIIIllIll) {
            lllllllllllllIIlllIIIlIIIIIllIll.printStackTrace();
        }
    }
    
    private static void llIIlIlIIlIlIlI() {
        (lIIlIIIlIIIIIl = new String[MapStorage.lIIlIIlIIIIlll[5]])[MapStorage.lIIlIIlIIIIlll[1]] = llIIlIlIIlIlIII("WfqwI9fBmNisHnNCCPlpnL+C90ikxYnb", "TbULl");
        MapStorage.lIIlIIIlIIIIIl[MapStorage.lIIlIIlIIIIlll[0]] = llIIlIlIIlIlIIl("IDQ7Bg==", "DUOgl");
        MapStorage.lIIlIIIlIIIIIl[MapStorage.lIIlIIlIIIIlll[2]] = llIIlIlIIlIlIIl("Bi82DQ==", "bNBlW");
        MapStorage.lIIlIIIlIIIIIl[MapStorage.lIIlIIlIIIIlll[3]] = llIIlIlIIlIlIII("YMatAA47P4Wky7UiWENZ6Q==", "eoQpS");
        MapStorage.lIIlIIIlIIIIIl[MapStorage.lIIlIIlIIIIlll[4]] = llIIlIlIIlIlIII("sTkLqotQYGMy02UXXMN6mA==", "VpsWu");
    }
    
    private static String llIIlIlIIlIlIII(final String lllllllllllllIIlllIIIIllllIlIlII, final String lllllllllllllIIlllIIIIllllIlIIll) {
        try {
            final SecretKeySpec lllllllllllllIIlllIIIIllllIllIIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIIlllIIIIllllIlIIll.getBytes(StandardCharsets.UTF_8)), MapStorage.lIIlIIlIIIIlll[6]), "DES");
            final Cipher lllllllllllllIIlllIIIIllllIllIII = Cipher.getInstance("DES");
            lllllllllllllIIlllIIIIllllIllIII.init(MapStorage.lIIlIIlIIIIlll[2], lllllllllllllIIlllIIIIllllIllIIl);
            return new String(lllllllllllllIIlllIIIIllllIllIII.doFinal(Base64.getDecoder().decode(lllllllllllllIIlllIIIIllllIlIlII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIlllIIIIllllIlIlll) {
            lllllllllllllIIlllIIIIllllIlIlll.printStackTrace();
            return null;
        }
    }
    
    public int getUniqueDataId(final String lllllllllllllIIlllIIIlIIIIIIIlIl) {
        Short lllllllllllllIIlllIIIlIIIIIIIlII = this.idCounts.get(lllllllllllllIIlllIIIlIIIIIIIlIl);
        if (llIIlIllllllllI(lllllllllllllIIlllIIIlIIIIIIIlII)) {
            lllllllllllllIIlllIIIlIIIIIIIlII = (short)MapStorage.lIIlIIlIIIIlll[1];
            "".length();
            if (" ".length() == 0) {
                return (0x4C ^ 0x73) & ~(0x82 ^ 0xBD);
            }
        }
        else {
            lllllllllllllIIlllIIIlIIIIIIIlII = (short)(lllllllllllllIIlllIIIlIIIIIIIlII + MapStorage.lIIlIIlIIIIlll[0]);
        }
        this.idCounts.put(lllllllllllllIIlllIIIlIIIIIIIlIl, lllllllllllllIIlllIIIlIIIIIIIlII);
        "".length();
        if (llIIlIllllllllI(this.saveHandler)) {
            return lllllllllllllIIlllIIIlIIIIIIIlII;
        }
        try {
            final File lllllllllllllIIlllIIIlIIIIIIIIll = this.saveHandler.getMapFileFromName(MapStorage.lIIlIIIlIIIIIl[MapStorage.lIIlIIlIIIIlll[4]]);
            if (llIIlIllllllIll(lllllllllllllIIlllIIIlIIIIIIIIll)) {
                final NBTTagCompound lllllllllllllIIlllIIIlIIIIIIIIlI = new NBTTagCompound();
                final boolean lllllllllllllIIlllIIIIllllllIlll = (boolean)this.idCounts.keySet().iterator();
                "".length();
                if ("   ".length() == 0) {
                    return (0xEC ^ 0xAD) & ~(0x81 ^ 0xC0);
                }
                while (!llIIlIlllllllll(((Iterator)lllllllllllllIIlllIIIIllllllIlll).hasNext() ? 1 : 0)) {
                    final String lllllllllllllIIlllIIIlIIIIIIIIIl = ((Iterator<String>)lllllllllllllIIlllIIIIllllllIlll).next();
                    final short lllllllllllllIIlllIIIlIIIIIIIIII = this.idCounts.get(lllllllllllllIIlllIIIlIIIIIIIIIl);
                    lllllllllllllIIlllIIIlIIIIIIIIlI.setShort(lllllllllllllIIlllIIIlIIIIIIIIIl, lllllllllllllIIlllIIIlIIIIIIIIII);
                }
                final DataOutputStream lllllllllllllIIlllIIIIllllllllll = new DataOutputStream(new FileOutputStream(lllllllllllllIIlllIIIlIIIIIIIIll));
                CompressedStreamTools.write(lllllllllllllIIlllIIIlIIIIIIIIlI, lllllllllllllIIlllIIIIllllllllll);
                lllllllllllllIIlllIIIIllllllllll.close();
                "".length();
                if (-" ".length() >= " ".length()) {
                    return (0x2E ^ 0x3) & ~(0x68 ^ 0x45);
                }
            }
        }
        catch (Exception lllllllllllllIIlllIIIIlllllllllI) {
            lllllllllllllIIlllIIIIlllllllllI.printStackTrace();
        }
        return lllllllllllllIIlllIIIlIIIIIIIlII;
    }
    
    public MapStorage(final ISaveHandler lllllllllllllIIlllIIIlIIlIIlIlIl) {
        this.loadedDataMap = (Map<String, WorldSavedData>)Maps.newHashMap();
        this.loadedDataList = (List<WorldSavedData>)Lists.newArrayList();
        this.idCounts = (Map<String, Short>)Maps.newHashMap();
        this.saveHandler = lllllllllllllIIlllIIIlIIlIIlIlIl;
        this.loadIdCounts();
    }
    
    static {
        llIIlIllllllIlI();
        llIIlIlIIlIlIlI();
    }
    
    public void setData(final String lllllllllllllIIlllIIIlIIIlllIIlI, final WorldSavedData lllllllllllllIIlllIIIlIIIllIlllI) {
        if (llIIlIlllllllII(this.loadedDataMap.containsKey(lllllllllllllIIlllIIIlIIIlllIIlI) ? 1 : 0)) {
            this.loadedDataList.remove(this.loadedDataMap.remove(lllllllllllllIIlllIIIlIIIlllIIlI));
            "".length();
        }
        this.loadedDataMap.put(lllllllllllllIIlllIIIlIIIlllIIlI, lllllllllllllIIlllIIIlIIIllIlllI);
        "".length();
        this.loadedDataList.add(lllllllllllllIIlllIIIlIIIllIlllI);
        "".length();
    }
}
