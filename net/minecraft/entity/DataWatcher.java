// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.entity;

import java.util.Iterator;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import com.google.common.collect.Maps;
import net.minecraft.util.Rotations;
import net.minecraft.util.BlockPos;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import com.google.common.collect.Lists;
import org.apache.commons.lang3.ObjectUtils;
import java.util.List;
import java.io.IOException;
import net.minecraft.network.PacketBuffer;
import net.minecraft.item.ItemStack;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.Map;

public class DataWatcher
{
    private static final /* synthetic */ int[] llIlIllIlllllI;
    private /* synthetic */ boolean objectChanged;
    private static final /* synthetic */ String[] llIlIllIllIIll;
    private static final /* synthetic */ Map<Class<?>, Integer> dataTypes;
    private /* synthetic */ ReadWriteLock lock;
    private final /* synthetic */ Map<Integer, WatchableObject> watchedObjects;
    private /* synthetic */ boolean isBlank;
    private final /* synthetic */ Entity owner;
    
    public ItemStack getWatchableObjectItemStack(final int llllllllllllIllIlIIlIIlllIlIlIlI) {
        return (ItemStack)this.getWatchedObject(llllllllllllIllIlIIlIIlllIlIlIlI).getObject();
    }
    
    public void writeTo(final PacketBuffer llllllllllllIllIlIIlIIllIlIllllI) throws IOException {
        this.lock.readLock().lock();
        final String llllllllllllIllIlIIlIIllIlIllIIl = (String)this.watchedObjects.values().iterator();
        "".length();
        if ("  ".length() <= ((0x9C ^ 0xC3 ^ (0x8A ^ 0x85)) & (81 + 146 - 99 + 22 ^ 115 + 156 - 224 + 151 ^ -" ".length()))) {
            return;
        }
        while (!lIIlIlIllIIIIllI(((Iterator)llllllllllllIllIlIIlIIllIlIllIIl).hasNext() ? 1 : 0)) {
            final WatchableObject llllllllllllIllIlIIlIIllIlIlllIl = ((Iterator<WatchableObject>)llllllllllllIllIlIIlIIllIlIllIIl).next();
            writeWatchableObjectToPacketBuffer(llllllllllllIllIlIIlIIllIlIllllI, llllllllllllIllIlIIlIIllIlIlllIl);
        }
        this.lock.readLock().unlock();
        llllllllllllIllIlIIlIIllIlIllllI.writeByte(DataWatcher.llIlIllIlllllI[10]);
        "".length();
    }
    
    public static void writeWatchedListToPacketBuffer(final List<WatchableObject> llllllllllllIllIlIIlIIllIlllIIlI, final PacketBuffer llllllllllllIllIlIIlIIllIlllIlII) throws IOException {
        if (lIIlIlIllIIIIlIl(llllllllllllIllIlIIlIIllIlllIIlI)) {
            final boolean llllllllllllIllIlIIlIIllIllIllll = (boolean)llllllllllllIllIlIIlIIllIlllIIlI.iterator();
            "".length();
            if ("  ".length() == 0) {
                return;
            }
            while (!lIIlIlIllIIIIllI(((Iterator)llllllllllllIllIlIIlIIllIllIllll).hasNext() ? 1 : 0)) {
                final WatchableObject llllllllllllIllIlIIlIIllIlllIIll = ((Iterator<WatchableObject>)llllllllllllIllIlIIlIIllIllIllll).next();
                writeWatchableObjectToPacketBuffer(llllllllllllIllIlIIlIIllIlllIlII, llllllllllllIllIlIIlIIllIlllIIll);
            }
        }
        llllllllllllIllIlIIlIIllIlllIlII.writeByte(DataWatcher.llIlIllIlllllI[10]);
        "".length();
    }
    
    private static boolean lIIlIlIllIIIIllI(final int llllllllllllIllIlIIlIIlIlIlllllI) {
        return llllllllllllIllIlIIlIIlIlIlllllI == 0;
    }
    
    public <T> void updateObject(final int llllllllllllIllIlIIlIIlllIIIIlIl, final T llllllllllllIllIlIIlIIlllIIIlIII) {
        final WatchableObject llllllllllllIllIlIIlIIlllIIIIlll = this.getWatchedObject(llllllllllllIllIlIIlIIlllIIIIlIl);
        if (lIIlIlIllIIIIIll(ObjectUtils.notEqual((Object)llllllllllllIllIlIIlIIlllIIIlIII, llllllllllllIllIlIIlIIlllIIIIlll.getObject()) ? 1 : 0)) {
            llllllllllllIllIlIIlIIlllIIIIlll.setObject(llllllllllllIllIlIIlIIlllIIIlIII);
            this.owner.onDataWatcherUpdate(llllllllllllIllIlIIlIIlllIIIIlIl);
            llllllllllllIllIlIIlIIlllIIIIlll.setWatched((boolean)(DataWatcher.llIlIllIlllllI[1] != 0));
            this.objectChanged = (DataWatcher.llIlIllIlllllI[1] != 0);
        }
    }
    
    private static void lIIlIlIlIlllIIlI() {
        (llIlIllIllIIll = new String[DataWatcher.llIlIllIlllllI[14]])[DataWatcher.llIlIllIlllllI[0]] = lIIlIlIlIllIlIII("1zDJg9tAsdq/pClQqctzboAit2MDSJvd", "kfaOJ");
        DataWatcher.llIlIllIllIIll[DataWatcher.llIlIllIlllllI[1]] = lIIlIlIlIllIlIIl("EhAEGWEgEBwNJHYYFFgoJVEEFy52ExkfYSEYBBBh", "VqpxA");
        DataWatcher.llIlIllIllIIll[DataWatcher.llIlIllIlllllI[2]] = lIIlIlIlIllIlIII("FABq+8ZMxfcMVgBXihKbpg==", "rmnes");
        DataWatcher.llIlIllIllIIll[DataWatcher.llIlIllIlllllI[3]] = lIIlIlIlIllIlIII("XhDRSt1MNVg=", "EnEZw");
        DataWatcher.llIlIllIllIIll[DataWatcher.llIlIllIlllllI[4]] = lIIlIlIlIllIlIlI("CUE/FgItGRmOAs+y9+j8gqjxfmffFNON", "ZfsMU");
        DataWatcher.llIlIllIllIIll[DataWatcher.llIlIllIlllllI[5]] = lIIlIlIlIllIlIII("dStJnCmk5B4=", "Tmhdt");
        DataWatcher.llIlIllIllIIll[DataWatcher.llIlIllIlllllI[6]] = lIIlIlIlIllIlIIl("NwE2BRkeA2ICCR4HKhQUUAEsBRkEHWIVEQQF", "pdBqp");
        DataWatcher.llIlIllIllIIll[DataWatcher.llIlIllIlllllI[7]] = lIIlIlIlIllIlIlI("eMP3CBsu//b84CzpMFhMKjVz117bkFGy", "SjQpP");
        DataWatcher.llIlIllIllIIll[DataWatcher.llIlIllIlllllI[9]] = lIIlIlIlIllIlIlI("5PH7tlLhH2Y=", "pHeLO");
    }
    
    public List<WatchableObject> getAllWatched() {
        List<WatchableObject> llllllllllllIllIlIIlIIllIlIlIIll = null;
        this.lock.readLock().lock();
        final float llllllllllllIllIlIIlIIllIlIIlllI = (float)this.watchedObjects.values().iterator();
        "".length();
        if (((0x19 ^ 0x3F ^ (0x36 ^ 0x2B)) & (140 + 23 - 23 + 35 ^ 13 + 76 - 0 + 59 ^ -" ".length())) < ((0x80 ^ 0x88 ^ (0x6 ^ 0x6F)) & (0xCA ^ 0xA5 ^ (0x8D ^ 0x83) ^ -" ".length()))) {
            return null;
        }
        while (!lIIlIlIllIIIIllI(((Iterator)llllllllllllIllIlIIlIIllIlIIlllI).hasNext() ? 1 : 0)) {
            final WatchableObject llllllllllllIllIlIIlIIllIlIlIIlI = ((Iterator<WatchableObject>)llllllllllllIllIlIIlIIllIlIIlllI).next();
            if (lIIlIlIllIIIIIIl(llllllllllllIllIlIIlIIllIlIlIIll)) {
                llllllllllllIllIlIIlIIllIlIlIIll = (List<WatchableObject>)Lists.newArrayList();
            }
            llllllllllllIllIlIIlIIllIlIlIIll.add(llllllllllllIllIlIIlIIllIlIlIIlI);
            "".length();
        }
        this.lock.readLock().unlock();
        return llllllllllllIllIlIIlIIllIlIlIIll;
    }
    
    private static String lIIlIlIlIllIlIII(final String llllllllllllIllIlIIlIIlIllIlIlIl, final String llllllllllllIllIlIIlIIlIllIlIllI) {
        try {
            final SecretKeySpec llllllllllllIllIlIIlIIlIllIllIlI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIllIlIIlIIlIllIlIllI.getBytes(StandardCharsets.UTF_8)), DataWatcher.llIlIllIlllllI[9]), "DES");
            final Cipher llllllllllllIllIlIIlIIlIllIllIIl = Cipher.getInstance("DES");
            llllllllllllIllIlIIlIIlIllIllIIl.init(DataWatcher.llIlIllIlllllI[2], llllllllllllIllIlIIlIIlIllIllIlI);
            return new String(llllllllllllIllIlIIlIIlIllIllIIl.doFinal(Base64.getDecoder().decode(llllllllllllIllIlIIlIIlIllIlIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIllIlIIlIIlIllIllIII) {
            llllllllllllIllIlIIlIIlIllIllIII.printStackTrace();
            return null;
        }
    }
    
    private static void writeWatchableObjectToPacketBuffer(final PacketBuffer llllllllllllIllIlIIlIIllIlIIIlll, final WatchableObject llllllllllllIllIlIIlIIllIlIIIllI) throws IOException {
        final int llllllllllllIllIlIIlIIllIlIIIlIl = (llllllllllllIllIlIIlIIllIlIIIllI.getObjectType() << DataWatcher.llIlIllIlllllI[5] | (llllllllllllIllIlIIlIIllIlIIIllI.getDataValueId() & DataWatcher.llIlIllIlllllI[8])) & DataWatcher.llIlIllIlllllI[11];
        llllllllllllIllIlIIlIIllIlIIIlll.writeByte(llllllllllllIllIlIIlIIllIlIIIlIl);
        "".length();
        switch (llllllllllllIllIlIIlIIllIlIIIllI.getObjectType()) {
            case 0: {
                llllllllllllIllIlIIlIIllIlIIIlll.writeByte((byte)llllllllllllIllIlIIlIIllIlIIIllI.getObject());
                "".length();
                "".length();
                if (null != null) {
                    return;
                }
                break;
            }
            case 1: {
                llllllllllllIllIlIIlIIllIlIIIlll.writeShort((short)llllllllllllIllIlIIlIIllIlIIIllI.getObject());
                "".length();
                "".length();
                if ((0xB4 ^ 0xC0 ^ (0xC1 ^ 0xB0)) == 0x0) {
                    return;
                }
                break;
            }
            case 2: {
                llllllllllllIllIlIIlIIllIlIIIlll.writeInt((int)llllllllllllIllIlIIlIIllIlIIIllI.getObject());
                "".length();
                "".length();
                if (" ".length() <= 0) {
                    return;
                }
                break;
            }
            case 3: {
                llllllllllllIllIlIIlIIllIlIIIlll.writeFloat((float)llllllllllllIllIlIIlIIllIlIIIllI.getObject());
                "".length();
                "".length();
                if ("   ".length() < 0) {
                    return;
                }
                break;
            }
            case 4: {
                llllllllllllIllIlIIlIIllIlIIIlll.writeString((String)llllllllllllIllIlIIlIIllIlIIIllI.getObject());
                "".length();
                "".length();
                if (null != null) {
                    return;
                }
                break;
            }
            case 5: {
                final ItemStack llllllllllllIllIlIIlIIllIlIIIlII = (ItemStack)llllllllllllIllIlIIlIIllIlIIIllI.getObject();
                llllllllllllIllIlIIlIIllIlIIIlll.writeItemStackToBuffer(llllllllllllIllIlIIlIIllIlIIIlII);
                "".length();
                if ((41 + 139 - 43 + 46 ^ 32 + 98 + 4 + 44) == 0x0) {
                    return;
                }
                break;
            }
            case 6: {
                final BlockPos llllllllllllIllIlIIlIIllIlIIIIll = (BlockPos)llllllllllllIllIlIIlIIllIlIIIllI.getObject();
                llllllllllllIllIlIIlIIllIlIIIlll.writeInt(llllllllllllIllIlIIlIIllIlIIIIll.getX());
                "".length();
                llllllllllllIllIlIIlIIllIlIIIlll.writeInt(llllllllllllIllIlIIlIIllIlIIIIll.getY());
                "".length();
                llllllllllllIllIlIIlIIllIlIIIlll.writeInt(llllllllllllIllIlIIlIIllIlIIIIll.getZ());
                "".length();
                "".length();
                if ((0x92 ^ 0x96) <= 0) {
                    return;
                }
                break;
            }
            case 7: {
                final Rotations llllllllllllIllIlIIlIIllIlIIIIlI = (Rotations)llllllllllllIllIlIIlIIllIlIIIllI.getObject();
                llllllllllllIllIlIIlIIllIlIIIlll.writeFloat(llllllllllllIllIlIIlIIllIlIIIIlI.getX());
                "".length();
                llllllllllllIllIlIIlIIllIlIIIlll.writeFloat(llllllllllllIllIlIIlIIllIlIIIIlI.getY());
                "".length();
                llllllllllllIllIlIIlIIllIlIIIlll.writeFloat(llllllllllllIllIlIIlIIllIlIIIIlI.getZ());
                "".length();
                break;
            }
        }
    }
    
    public void setObjectWatched(final int llllllllllllIllIlIIlIIllIlllllll) {
        WatchableObject.access$0(this.getWatchedObject(llllllllllllIllIlIIlIIllIlllllll), (boolean)(DataWatcher.llIlIllIlllllI[1] != 0));
        this.objectChanged = (DataWatcher.llIlIllIlllllI[1] != 0);
    }
    
    public boolean getIsBlank() {
        return this.isBlank;
    }
    
    public List<WatchableObject> getChanged() {
        List<WatchableObject> llllllllllllIllIlIIlIIllIllIlIIl = null;
        if (lIIlIlIllIIIIIll(this.objectChanged ? 1 : 0)) {
            this.lock.readLock().lock();
            final String llllllllllllIllIlIIlIIllIllIIlII = (String)this.watchedObjects.values().iterator();
            "".length();
            if ("  ".length() == ((0x3 ^ 0x63 ^ (0x1A ^ 0x27)) & (57 + 127 - 124 + 135 ^ 60 + 69 - 110 + 139 ^ -" ".length()))) {
                return null;
            }
            while (!lIIlIlIllIIIIllI(((Iterator)llllllllllllIllIlIIlIIllIllIIlII).hasNext() ? 1 : 0)) {
                final WatchableObject llllllllllllIllIlIIlIIllIllIlIII = ((Iterator<WatchableObject>)llllllllllllIllIlIIlIIllIllIIlII).next();
                if (lIIlIlIllIIIIIll(llllllllllllIllIlIIlIIllIllIlIII.isWatched() ? 1 : 0)) {
                    llllllllllllIllIlIIlIIllIllIlIII.setWatched((boolean)(DataWatcher.llIlIllIlllllI[0] != 0));
                    if (lIIlIlIllIIIIIIl(llllllllllllIllIlIIlIIllIllIlIIl)) {
                        llllllllllllIllIlIIlIIllIllIlIIl = (List<WatchableObject>)Lists.newArrayList();
                    }
                    llllllllllllIllIlIIlIIllIllIlIIl.add(llllllllllllIllIlIIlIIllIllIlIII);
                    "".length();
                }
            }
            this.lock.readLock().unlock();
        }
        this.objectChanged = (DataWatcher.llIlIllIlllllI[0] != 0);
        return llllllllllllIllIlIIlIIllIllIlIIl;
    }
    
    private static void lIIlIlIllIIIIIII() {
        (llIlIllIlllllI = new int[15])[0] = ((0x6C ^ 0x7C) & ~(0x2C ^ 0x3C));
        DataWatcher.llIlIllIlllllI[1] = " ".length();
        DataWatcher.llIlIllIlllllI[2] = "  ".length();
        DataWatcher.llIlIllIlllllI[3] = "   ".length();
        DataWatcher.llIlIllIlllllI[4] = (0xA6 ^ 0xA2);
        DataWatcher.llIlIllIlllllI[5] = (0xD ^ 0x17 ^ (0x22 ^ 0x3D));
        DataWatcher.llIlIllIlllllI[6] = (0xDD ^ 0xC3 ^ (0x57 ^ 0x4F));
        DataWatcher.llIlIllIlllllI[7] = (0xFC ^ 0xB7 ^ (0xD ^ 0x41));
        DataWatcher.llIlIllIlllllI[8] = (0x34 ^ 0x2B);
        DataWatcher.llIlIllIlllllI[9] = (171 + 61 - 140 + 98 ^ 8 + 40 - 38 + 172);
        DataWatcher.llIlIllIlllllI[10] = (0x8 ^ 0x1A) + (0x6E ^ 0x35) - (0x8D ^ 0x92) + (0x90 ^ 0xA1);
        DataWatcher.llIlIllIlllllI[11] = 143 + 98 - 138 + 68 + (0x6A ^ 0xA) - (0x97 ^ 0x83) + (0x77 ^ 0x7F);
        DataWatcher.llIlIllIlllllI[12] = (0x62 ^ 0x43) + (43 + 7 + 75 + 44) - (0xFA ^ 0x99) + (0x35 ^ 0x4C);
        DataWatcher.llIlIllIlllllI[13] = (-" ".length() & (-1 & 0x7FFF));
        DataWatcher.llIlIllIlllllI[14] = (0x3E ^ 0x37);
    }
    
    static {
        lIIlIlIllIIIIIII();
        lIIlIlIlIlllIIlI();
        (dataTypes = Maps.newHashMap()).put(Byte.class, DataWatcher.llIlIllIlllllI[0]);
        "".length();
        DataWatcher.dataTypes.put(Short.class, DataWatcher.llIlIllIlllllI[1]);
        "".length();
        DataWatcher.dataTypes.put(Integer.class, DataWatcher.llIlIllIlllllI[2]);
        "".length();
        DataWatcher.dataTypes.put(Float.class, DataWatcher.llIlIllIlllllI[3]);
        "".length();
        DataWatcher.dataTypes.put(String.class, DataWatcher.llIlIllIlllllI[4]);
        "".length();
        DataWatcher.dataTypes.put(ItemStack.class, DataWatcher.llIlIllIlllllI[5]);
        "".length();
        DataWatcher.dataTypes.put(BlockPos.class, DataWatcher.llIlIllIlllllI[6]);
        "".length();
        DataWatcher.dataTypes.put(Rotations.class, DataWatcher.llIlIllIlllllI[7]);
        "".length();
    }
    
    public byte getWatchableObjectByte(final int llllllllllllIllIlIIlIIllllIIlIII) {
        return (byte)this.getWatchedObject(llllllllllllIllIlIIlIIllllIIlIII).getObject();
    }
    
    private static String lIIlIlIlIllIlIIl(String llllllllllllIllIlIIlIIlIllllIlII, final String llllllllllllIllIlIIlIIlIlllllIII) {
        llllllllllllIllIlIIlIIlIllllIlII = (Exception)new String(Base64.getDecoder().decode(((String)llllllllllllIllIlIIlIIlIllllIlII).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder llllllllllllIllIlIIlIIlIllllIlll = new StringBuilder();
        final char[] llllllllllllIllIlIIlIIlIllllIllI = llllllllllllIllIlIIlIIlIlllllIII.toCharArray();
        int llllllllllllIllIlIIlIIlIllllIlIl = DataWatcher.llIlIllIlllllI[0];
        final Exception llllllllllllIllIlIIlIIlIlllIllll = (Object)((String)llllllllllllIllIlIIlIIlIllllIlII).toCharArray();
        final boolean llllllllllllIllIlIIlIIlIlllIlllI = llllllllllllIllIlIIlIIlIlllIllll.length != 0;
        long llllllllllllIllIlIIlIIlIlllIllIl = DataWatcher.llIlIllIlllllI[0];
        while (lIIlIlIllIIIlIII((int)llllllllllllIllIlIIlIIlIlllIllIl, llllllllllllIllIlIIlIIlIlllIlllI ? 1 : 0)) {
            final char llllllllllllIllIlIIlIIlIlllllIlI = llllllllllllIllIlIIlIIlIlllIllll[llllllllllllIllIlIIlIIlIlllIllIl];
            llllllllllllIllIlIIlIIlIllllIlll.append((char)(llllllllllllIllIlIIlIIlIlllllIlI ^ llllllllllllIllIlIIlIIlIllllIllI[llllllllllllIllIlIIlIIlIllllIlIl % llllllllllllIllIlIIlIIlIllllIllI.length]));
            "".length();
            ++llllllllllllIllIlIIlIIlIllllIlIl;
            ++llllllllllllIllIlIIlIIlIlllIllIl;
            "".length();
            if ((0x85 ^ 0x80) <= 0) {
                return null;
            }
        }
        return String.valueOf(llllllllllllIllIlIIlIIlIllllIlll);
    }
    
    public String getWatchableObjectString(final int llllllllllllIllIlIIlIIlllIlIlllI) {
        return (String)this.getWatchedObject(llllllllllllIllIlIIlIIlllIlIlllI).getObject();
    }
    
    public void updateWatchedObjectsFromList(final List<WatchableObject> llllllllllllIllIlIIlIIllIIIlIIIl) {
        this.lock.writeLock().lock();
        final short llllllllllllIllIlIIlIIllIIIIlIll = (short)llllllllllllIllIlIIlIIllIIIlIIIl.iterator();
        "".length();
        if (-" ".length() >= " ".length()) {
            return;
        }
        while (!lIIlIlIllIIIIllI(((Iterator)llllllllllllIllIlIIlIIllIIIIlIll).hasNext() ? 1 : 0)) {
            final WatchableObject llllllllllllIllIlIIlIIllIIIlIIII = ((Iterator<WatchableObject>)llllllllllllIllIlIIlIIllIIIIlIll).next();
            final WatchableObject llllllllllllIllIlIIlIIllIIIIllll = this.watchedObjects.get(llllllllllllIllIlIIlIIllIIIlIIII.getDataValueId());
            if (lIIlIlIllIIIIlIl(llllllllllllIllIlIIlIIllIIIIllll)) {
                llllllllllllIllIlIIlIIllIIIIllll.setObject(llllllllllllIllIlIIlIIllIIIlIIII.getObject());
                this.owner.onDataWatcherUpdate(llllllllllllIllIlIIlIIllIIIlIIII.getDataValueId());
            }
        }
        this.lock.writeLock().unlock();
        this.objectChanged = (DataWatcher.llIlIllIlllllI[1] != 0);
    }
    
    private static String lIIlIlIlIllIlIlI(final String llllllllllllIllIlIIlIIlIlllIIlII, final String llllllllllllIllIlIIlIIlIlllIIIll) {
        try {
            final SecretKeySpec llllllllllllIllIlIIlIIlIlllIIlll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIllIlIIlIIlIlllIIIll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher llllllllllllIllIlIIlIIlIlllIIllI = Cipher.getInstance("Blowfish");
            llllllllllllIllIlIIlIIlIlllIIllI.init(DataWatcher.llIlIllIlllllI[2], llllllllllllIllIlIIlIIlIlllIIlll);
            return new String(llllllllllllIllIlIIlIIlIlllIIllI.doFinal(Base64.getDecoder().decode(llllllllllllIllIlIIlIIlIlllIIlII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIllIlIIlIIlIlllIIlIl) {
            llllllllllllIllIlIIlIIlIlllIIlIl.printStackTrace();
            return null;
        }
    }
    
    public Rotations getWatchableObjectRotations(final int llllllllllllIllIlIIlIIlllIIlIIIl) {
        return (Rotations)this.getWatchedObject(llllllllllllIllIlIIlIIlllIIlIIIl).getObject();
    }
    
    public short getWatchableObjectShort(final int llllllllllllIllIlIIlIIllllIIIIlI) {
        return (short)this.getWatchedObject(llllllllllllIllIlIIlIIllllIIIIlI).getObject();
    }
    
    private static boolean lIIlIlIllIIIIIll(final int llllllllllllIllIlIIlIIlIllIIIIII) {
        return llllllllllllIllIlIIlIIlIllIIIIII != 0;
    }
    
    public void func_111144_e() {
        this.objectChanged = (DataWatcher.llIlIllIlllllI[0] != 0);
    }
    
    private WatchableObject getWatchedObject(final int llllllllllllIllIlIIlIIlllIlIIIII) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: getfield        net/minecraft/entity/DataWatcher.lock:Ljava/util/concurrent/locks/ReadWriteLock;
        //     4: invokeinterface java/util/concurrent/locks/ReadWriteLock.readLock:()Ljava/util/concurrent/locks/Lock;
        //     9: invokeinterface java/util/concurrent/locks/Lock.lock:()V
        //    14: aload_0         /* llllllllllllIllIlIIlIIlllIIllIlI */
        //    15: getfield        net/minecraft/entity/DataWatcher.watchedObjects:Ljava/util/Map;
        //    18: iload_1         /* llllllllllllIllIlIIlIIlllIIllIIl */
        //    19: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //    22: invokeinterface java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
        //    27: checkcast       Lnet/minecraft/entity/DataWatcher$WatchableObject;
        //    30: astore_2        /* llllllllllllIllIlIIlIIlllIIlllll */
        //    31: ldc             ""
        //    33: invokevirtual   java/lang/String.length:()I
        //    36: pop            
        //    37: bipush          11
        //    39: bipush          90
        //    41: ixor           
        //    42: sipush          211
        //    45: sipush          130
        //    48: ixor           
        //    49: iconst_m1      
        //    50: ixor           
        //    51: iand           
        //    52: sipush          196
        //    55: sipush          192
        //    58: ixor           
        //    59: if_icmplt       127
        //    62: aconst_null    
        //    63: areturn        
        //    64: astore_3        /* llllllllllllIllIlIIlIIlllIIlllIl */
        //    65: aload_3         /* llllllllllllIllIlIIlIIlllIIlllIl */
        //    66: getstatic       net/minecraft/entity/DataWatcher.llIlIllIllIIll:[Ljava/lang/String;
        //    69: getstatic       net/minecraft/entity/DataWatcher.llIlIllIlllllI:[I
        //    72: bipush          6
        //    74: iaload         
        //    75: aaload         
        //    76: invokestatic    net/minecraft/crash/CrashReport.makeCrashReport:(Ljava/lang/Throwable;Ljava/lang/String;)Lnet/minecraft/crash/CrashReport;
        //    79: astore          llllllllllllIllIlIIlIIlllIIlllII
        //    81: aload           llllllllllllIllIlIIlIIlllIIlllII
        //    83: getstatic       net/minecraft/entity/DataWatcher.llIlIllIllIIll:[Ljava/lang/String;
        //    86: getstatic       net/minecraft/entity/DataWatcher.llIlIllIlllllI:[I
        //    89: bipush          7
        //    91: iaload         
        //    92: aaload         
        //    93: invokevirtual   net/minecraft/crash/CrashReport.makeCategory:(Ljava/lang/String;)Lnet/minecraft/crash/CrashReportCategory;
        //    96: astore          llllllllllllIllIlIIlIIlllIIllIll
        //    98: aload           llllllllllllIllIlIIlIIlllIIllIll
        //   100: getstatic       net/minecraft/entity/DataWatcher.llIlIllIllIIll:[Ljava/lang/String;
        //   103: getstatic       net/minecraft/entity/DataWatcher.llIlIllIlllllI:[I
        //   106: bipush          9
        //   108: iaload         
        //   109: aaload         
        //   110: iload_1         /* llllllllllllIllIlIIlIIlllIIllIIl */
        //   111: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   114: invokevirtual   net/minecraft/crash/CrashReportCategory.addCrashSection:(Ljava/lang/String;Ljava/lang/Object;)V
        //   117: new             Lnet/minecraft/util/ReportedException;
        //   120: dup            
        //   121: aload           llllllllllllIllIlIIlIIlllIIlllII
        //   123: invokespecial   net/minecraft/util/ReportedException.<init>:(Lnet/minecraft/crash/CrashReport;)V
        //   126: athrow         
        //   127: aload_0         /* llllllllllllIllIlIIlIIlllIIllIlI */
        //   128: getfield        net/minecraft/entity/DataWatcher.lock:Ljava/util/concurrent/locks/ReadWriteLock;
        //   131: invokeinterface java/util/concurrent/locks/ReadWriteLock.readLock:()Ljava/util/concurrent/locks/Lock;
        //   136: invokeinterface java/util/concurrent/locks/Lock.unlock:()V
        //   141: aload_2         /* llllllllllllIllIlIIlIIlllIIllllI */
        //   142: areturn        
        //    StackMapTable: 00 02 F7 00 40 07 02 37 FC 00 3E 07 00 06
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  14     31     64     127    Ljava/lang/Throwable;
        // 
        // The error that occurred was:
        // 
        // java.lang.NullPointerException
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    private static boolean lIIlIlIllIIIIlll(final int llllllllllllIllIlIIlIIlIllIIllll, final int llllllllllllIllIlIIlIIlIllIIlllI) {
        return llllllllllllIllIlIIlIIlIllIIllll == llllllllllllIllIlIIlIIlIllIIlllI;
    }
    
    public boolean hasObjectChanged() {
        return this.objectChanged;
    }
    
    public DataWatcher(final Entity llllllllllllIllIlIIlIIlllllIlIIl) {
        this.isBlank = (DataWatcher.llIlIllIlllllI[1] != 0);
        this.watchedObjects = (Map<Integer, WatchableObject>)Maps.newHashMap();
        this.lock = new ReentrantReadWriteLock();
        this.owner = llllllllllllIllIlIIlIIlllllIlIIl;
    }
    
    private static boolean lIIlIlIllIIIIlIl(final Object llllllllllllIllIlIIlIIlIllIIIlII) {
        return llllllllllllIllIlIIlIIlIllIIIlII != null;
    }
    
    public void addObjectByDataType(final int llllllllllllIllIlIIlIIllllIIlllI, final int llllllllllllIllIlIIlIIllllIIllIl) {
        final WatchableObject llllllllllllIllIlIIlIIllllIlIIII = new WatchableObject(llllllllllllIllIlIIlIIllllIIllIl, llllllllllllIllIlIIlIIllllIIlllI, null);
        this.lock.writeLock().lock();
        this.watchedObjects.put(llllllllllllIllIlIIlIIllllIIlllI, llllllllllllIllIlIIlIIllllIlIIII);
        "".length();
        this.lock.writeLock().unlock();
        this.isBlank = (DataWatcher.llIlIllIlllllI[0] != 0);
    }
    
    public <T> void addObject(final int llllllllllllIllIlIIlIIllllIllIll, final T llllllllllllIllIlIIlIIllllIlllll) {
        final Integer llllllllllllIllIlIIlIIllllIllllI = DataWatcher.dataTypes.get(llllllllllllIllIlIIlIIllllIlllll.getClass());
        if (lIIlIlIllIIIIIIl(llllllllllllIllIlIIlIIllllIllllI)) {
            throw new IllegalArgumentException(String.valueOf(new StringBuilder(DataWatcher.llIlIllIllIIll[DataWatcher.llIlIllIlllllI[0]]).append(llllllllllllIllIlIIlIIllllIlllll.getClass())));
        }
        if (lIIlIlIllIIIIIlI(llllllllllllIllIlIIlIIllllIllIll, DataWatcher.llIlIllIlllllI[8])) {
            throw new IllegalArgumentException(String.valueOf(new StringBuilder(DataWatcher.llIlIllIllIIll[DataWatcher.llIlIllIlllllI[1]]).append(llllllllllllIllIlIIlIIllllIllIll).append(DataWatcher.llIlIllIllIIll[DataWatcher.llIlIllIlllllI[2]]).append(DataWatcher.llIlIllIlllllI[8]).append(DataWatcher.llIlIllIllIIll[DataWatcher.llIlIllIlllllI[3]])));
        }
        if (lIIlIlIllIIIIIll(this.watchedObjects.containsKey(llllllllllllIllIlIIlIIllllIllIll) ? 1 : 0)) {
            throw new IllegalArgumentException(String.valueOf(new StringBuilder(DataWatcher.llIlIllIllIIll[DataWatcher.llIlIllIlllllI[4]]).append(llllllllllllIllIlIIlIIllllIllIll).append(DataWatcher.llIlIllIllIIll[DataWatcher.llIlIllIlllllI[5]])));
        }
        final WatchableObject llllllllllllIllIlIIlIIllllIlllIl = new WatchableObject(llllllllllllIllIlIIlIIllllIllllI, llllllllllllIllIlIIlIIllllIllIll, llllllllllllIllIlIIlIIllllIlllll);
        this.lock.writeLock().lock();
        this.watchedObjects.put(llllllllllllIllIlIIlIIllllIllIll, llllllllllllIllIlIIlIIllllIlllIl);
        "".length();
        this.lock.writeLock().unlock();
        this.isBlank = (DataWatcher.llIlIllIlllllI[0] != 0);
    }
    
    private static boolean lIIlIlIllIIIIIIl(final Object llllllllllllIllIlIIlIIlIllIIIIlI) {
        return llllllllllllIllIlIIlIIlIllIIIIlI == null;
    }
    
    public int getWatchableObjectInt(final int llllllllllllIllIlIIlIIlllIlllIlI) {
        return (int)this.getWatchedObject(llllllllllllIllIlIIlIIlllIlllIlI).getObject();
    }
    
    public float getWatchableObjectFloat(final int llllllllllllIllIlIIlIIlllIllIllI) {
        return (float)this.getWatchedObject(llllllllllllIllIlIIlIIlllIllIllI).getObject();
    }
    
    public static List<WatchableObject> readWatchedListFromPacketBuffer(final PacketBuffer llllllllllllIllIlIIlIIllIIlIllll) throws IOException {
        List<WatchableObject> llllllllllllIllIlIIlIIllIIlIlllI = null;
        int llllllllllllIllIlIIlIIllIIlIllIl = llllllllllllIllIlIIlIIllIIlIllll.readByte();
        "".length();
        if ((0x50 ^ 0xD ^ (0xF7 ^ 0xAE)) == "  ".length()) {
            return null;
        }
        while (!lIIlIlIllIIIIlll(llllllllllllIllIlIIlIIllIIlIllIl, DataWatcher.llIlIllIlllllI[10])) {
            if (lIIlIlIllIIIIIIl(llllllllllllIllIlIIlIIllIIlIlllI)) {
                llllllllllllIllIlIIlIIllIIlIlllI = (List<WatchableObject>)Lists.newArrayList();
            }
            final int llllllllllllIllIlIIlIIllIIlIllII = (llllllllllllIllIlIIlIIllIIlIllIl & DataWatcher.llIlIllIlllllI[12]) >> DataWatcher.llIlIllIlllllI[5];
            final int llllllllllllIllIlIIlIIllIIlIlIll = llllllllllllIllIlIIlIIllIIlIllIl & DataWatcher.llIlIllIlllllI[8];
            WatchableObject llllllllllllIllIlIIlIIllIIlIlIlI = null;
            switch (llllllllllllIllIlIIlIIllIIlIllII) {
                case 0: {
                    llllllllllllIllIlIIlIIllIIlIlIlI = new WatchableObject(llllllllllllIllIlIIlIIllIIlIllII, llllllllllllIllIlIIlIIllIIlIlIll, llllllllllllIllIlIIlIIllIIlIllll.readByte());
                    "".length();
                    if (-" ".length() != -" ".length()) {
                        return null;
                    }
                    break;
                }
                case 1: {
                    llllllllllllIllIlIIlIIllIIlIlIlI = new WatchableObject(llllllllllllIllIlIIlIIllIIlIllII, llllllllllllIllIlIIlIIllIIlIlIll, llllllllllllIllIlIIlIIllIIlIllll.readShort());
                    "".length();
                    if (null != null) {
                        return null;
                    }
                    break;
                }
                case 2: {
                    llllllllllllIllIlIIlIIllIIlIlIlI = new WatchableObject(llllllllllllIllIlIIlIIllIIlIllII, llllllllllllIllIlIIlIIllIIlIlIll, llllllllllllIllIlIIlIIllIIlIllll.readInt());
                    "".length();
                    if (-" ".length() >= 0) {
                        return null;
                    }
                    break;
                }
                case 3: {
                    llllllllllllIllIlIIlIIllIIlIlIlI = new WatchableObject(llllllllllllIllIlIIlIIllIIlIllII, llllllllllllIllIlIIlIIllIIlIlIll, llllllllllllIllIlIIlIIllIIlIllll.readFloat());
                    "".length();
                    if (null != null) {
                        return null;
                    }
                    break;
                }
                case 4: {
                    llllllllllllIllIlIIlIIllIIlIlIlI = new WatchableObject(llllllllllllIllIlIIlIIllIIlIllII, llllllllllllIllIlIIlIIllIIlIlIll, llllllllllllIllIlIIlIIllIIlIllll.readStringFromBuffer(DataWatcher.llIlIllIlllllI[13]));
                    "".length();
                    if (-" ".length() >= 0) {
                        return null;
                    }
                    break;
                }
                case 5: {
                    llllllllllllIllIlIIlIIllIIlIlIlI = new WatchableObject(llllllllllllIllIlIIlIIllIIlIllII, llllllllllllIllIlIIlIIllIIlIlIll, llllllllllllIllIlIIlIIllIIlIllll.readItemStackFromBuffer());
                    "".length();
                    if (null != null) {
                        return null;
                    }
                    break;
                }
                case 6: {
                    final int llllllllllllIllIlIIlIIllIIlIlIIl = llllllllllllIllIlIIlIIllIIlIllll.readInt();
                    final int llllllllllllIllIlIIlIIllIIlIlIII = llllllllllllIllIlIIlIIllIIlIllll.readInt();
                    final int llllllllllllIllIlIIlIIllIIlIIlll = llllllllllllIllIlIIlIIllIIlIllll.readInt();
                    llllllllllllIllIlIIlIIllIIlIlIlI = new WatchableObject(llllllllllllIllIlIIlIIllIIlIllII, llllllllllllIllIlIIlIIllIIlIlIll, new BlockPos(llllllllllllIllIlIIlIIllIIlIlIIl, llllllllllllIllIlIIlIIllIIlIlIII, llllllllllllIllIlIIlIIllIIlIIlll));
                    "".length();
                    if (null != null) {
                        return null;
                    }
                    break;
                }
                case 7: {
                    final float llllllllllllIllIlIIlIIllIIlIIllI = llllllllllllIllIlIIlIIllIIlIllll.readFloat();
                    final float llllllllllllIllIlIIlIIllIIlIIlIl = llllllllllllIllIlIIlIIllIIlIllll.readFloat();
                    final float llllllllllllIllIlIIlIIllIIlIIlII = llllllllllllIllIlIIlIIllIIlIllll.readFloat();
                    llllllllllllIllIlIIlIIllIIlIlIlI = new WatchableObject(llllllllllllIllIlIIlIIllIIlIllII, llllllllllllIllIlIIlIIllIIlIlIll, new Rotations(llllllllllllIllIlIIlIIllIIlIIllI, llllllllllllIllIlIIlIIllIIlIIlIl, llllllllllllIllIlIIlIIllIIlIIlII));
                    break;
                }
            }
            llllllllllllIllIlIIlIIllIIlIlllI.add(llllllllllllIllIlIIlIIllIIlIlIlI);
            "".length();
            llllllllllllIllIlIIlIIllIIlIllIl = llllllllllllIllIlIIlIIllIIlIllll.readByte();
        }
        return llllllllllllIllIlIIlIIllIIlIlllI;
    }
    
    private static boolean lIIlIlIllIIIlIII(final int llllllllllllIllIlIIlIIlIllIIlIll, final int llllllllllllIllIlIIlIIlIllIIlIlI) {
        return llllllllllllIllIlIIlIIlIllIIlIll < llllllllllllIllIlIIlIIlIllIIlIlI;
    }
    
    private static boolean lIIlIlIllIIIIIlI(final int llllllllllllIllIlIIlIIlIllIIIlll, final int llllllllllllIllIlIIlIIlIllIIIllI) {
        return llllllllllllIllIlIIlIIlIllIIIlll > llllllllllllIllIlIIlIIlIllIIIllI;
    }
    
    public static class WatchableObject
    {
        private static final /* synthetic */ int[] llIlIllIIlllIl;
        private final /* synthetic */ int dataValueId;
        private /* synthetic */ boolean watched;
        private /* synthetic */ Object watchedObject;
        private final /* synthetic */ int objectType;
        
        public int getDataValueId() {
            return this.dataValueId;
        }
        
        private static void lIIlIlIlIIllIIII() {
            (llIlIllIIlllIl = new int[1])[0] = " ".length();
        }
        
        static {
            lIIlIlIlIIllIIII();
        }
        
        public WatchableObject(final int llllllllllllIllIlIIllIIlIlIllIII, final int llllllllllllIllIlIIllIIlIlIlIIll, final Object llllllllllllIllIlIIllIIlIlIlIllI) {
            this.dataValueId = llllllllllllIllIlIIllIIlIlIlIIll;
            this.watchedObject = llllllllllllIllIlIIllIIlIlIlIllI;
            this.objectType = llllllllllllIllIlIIllIIlIlIllIII;
            this.watched = (WatchableObject.llIlIllIIlllIl[0] != 0);
        }
        
        static /* synthetic */ void access$0(final WatchableObject llllllllllllIllIlIIllIIlIIllIlll, final boolean llllllllllllIllIlIIllIIlIIllIllI) {
            llllllllllllIllIlIIllIIlIIllIlll.watched = llllllllllllIllIlIIllIIlIIllIllI;
        }
        
        public int getObjectType() {
            return this.objectType;
        }
        
        public boolean isWatched() {
            return this.watched;
        }
        
        public Object getObject() {
            return this.watchedObject;
        }
        
        public void setObject(final Object llllllllllllIllIlIIllIIlIlIIlIll) {
            this.watchedObject = llllllllllllIllIlIIllIIlIlIIlIll;
        }
        
        public void setWatched(final boolean llllllllllllIllIlIIllIIlIIlllIlI) {
            this.watched = llllllllllllIllIlIIllIIlIIlllIlI;
        }
    }
}
