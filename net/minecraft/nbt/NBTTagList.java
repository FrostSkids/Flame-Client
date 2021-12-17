// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.nbt;

import java.util.Iterator;
import org.apache.logging.log4j.LogManager;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.security.MessageDigest;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.io.DataOutput;
import java.io.IOException;
import java.io.DataInput;
import com.google.common.collect.Lists;
import java.util.List;
import org.apache.logging.log4j.Logger;

public class NBTTagList extends NBTBase
{
    private static final /* synthetic */ int[] lIIIllIIlllllI;
    private static final /* synthetic */ String[] lIIIllIIllIIll;
    private static final /* synthetic */ Logger LOGGER;
    private /* synthetic */ byte tagType;
    private /* synthetic */ List<NBTBase> tagList;
    
    public NBTBase removeTag(final int lllllllllllllIlIIIIIIllIIIIlIIlI) {
        return this.tagList.remove(lllllllllllllIlIIIIIIllIIIIlIIlI);
    }
    
    private static boolean llIIIlIIIIIIlII(final int lllllllllllllIlIIIIIIlIllIIIIIll, final int lllllllllllllIlIIIIIIlIllIIIIIlI) {
        return lllllllllllllIlIIIIIIlIllIIIIIll >= lllllllllllllIlIIIIIIlIllIIIIIlI;
    }
    
    @Override
    public boolean equals(final Object lllllllllllllIlIIIIIIlIlllIIIllI) {
        if (llIIIlIIIIIIlll(super.equals(lllllllllllllIlIIIIIIlIlllIIIllI) ? 1 : 0)) {
            final NBTTagList lllllllllllllIlIIIIIIlIlllIIIlIl = (NBTTagList)lllllllllllllIlIIIIIIlIlllIIIllI;
            if (llIIIlIIIIIlIll(this.tagType, lllllllllllllIlIIIIIIlIlllIIIlIl.tagType)) {
                return this.tagList.equals(lllllllllllllIlIIIIIIlIlllIIIlIl.tagList);
            }
        }
        return NBTTagList.lIIIllIIlllllI[0] != 0;
    }
    
    public float getFloatAt(final int lllllllllllllIlIIIIIIlIllllIllll) {
        if (llIIIlIIIIIlIIl(lllllllllllllIlIIIIIIlIllllIllll) && llIIIlIIIIIlIlI(lllllllllllllIlIIIIIIlIllllIllll, this.tagList.size())) {
            final NBTBase lllllllllllllIlIIIIIIlIllllIlllI = this.tagList.get(lllllllllllllIlIIIIIIlIllllIllll);
            float float1;
            if (llIIIlIIIIIlIll(lllllllllllllIlIIIIIIlIllllIlllI.getId(), NBTTagList.lIIIllIIlllllI[10])) {
                float1 = ((NBTTagFloat)lllllllllllllIlIIIIIIlIllllIlllI).getFloat();
                "".length();
                if ("   ".length() > "   ".length()) {
                    return 0.0f;
                }
            }
            else {
                float1 = 0.0f;
            }
            return float1;
        }
        return 0.0f;
    }
    
    public double getDoubleAt(final int lllllllllllllIlIIIIIIlIlllllIlIl) {
        if (llIIIlIIIIIlIIl(lllllllllllllIlIIIIIIlIlllllIlIl) && llIIIlIIIIIlIlI(lllllllllllllIlIIIIIIlIlllllIlIl, this.tagList.size())) {
            final NBTBase lllllllllllllIlIIIIIIlIlllllIlll = this.tagList.get(lllllllllllllIlIIIIIIlIlllllIlIl);
            double double1;
            if (llIIIlIIIIIlIll(lllllllllllllIlIIIIIIlIlllllIlll.getId(), NBTTagList.lIIIllIIlllllI[11])) {
                double1 = ((NBTTagDouble)lllllllllllllIlIIIIIIlIlllllIlll).getDouble();
                "".length();
                if (null != null) {
                    return 0.0;
                }
            }
            else {
                double1 = 0.0;
            }
            return double1;
        }
        return 0.0;
    }
    
    private static void llIIIlIIIIIIIlI() {
        (lIIIllIIlllllI = new int[16])[0] = (("   ".length() ^ (0xB5 ^ 0xAA)) & (6 + 96 + 73 + 7 ^ 163 + 29 - 174 + 152 ^ -" ".length()));
        NBTTagList.lIIIllIIlllllI[1] = (0xFFFF9335 & 0x6ECA);
        NBTTagList.lIIIllIIlllllI[2] = " ".length();
        NBTTagList.lIIIllIIlllllI[3] = (0xE6 ^ 0xB7 ^ (0x62 ^ 0x3A));
        NBTTagList.lIIIllIIlllllI[4] = "  ".length();
        NBTTagList.lIIIllIIlllllI[5] = (0xD8 ^ 0x84 ^ (0xC4 ^ 0xB4));
        NBTTagList.lIIIllIIlllllI[6] = (31 + 15 + 39 + 70 ^ 91 + 49 - 40 + 61);
        NBTTagList.lIIIllIIlllllI[7] = (0xC5 ^ 0x98);
        NBTTagList.lIIIllIIlllllI[8] = "   ".length();
        NBTTagList.lIIIllIIlllllI[9] = (0x61 ^ 0x65);
        NBTTagList.lIIIllIIlllllI[10] = (0xCD ^ 0x97 ^ (0x41 ^ 0x1E));
        NBTTagList.lIIIllIIlllllI[11] = (0x61 ^ 0x67);
        NBTTagList.lIIIllIIlllllI[12] = (22 + 85 - 34 + 71 ^ 66 + 102 - 65 + 48);
        NBTTagList.lIIIllIIlllllI[13] = (80 + 93 - 63 + 20 ^ 56 + 76 - 87 + 91);
        NBTTagList.lIIIllIIlllllI[14] = (150 + 44 - 82 + 64 ^ 133 + 143 - 200 + 111);
        NBTTagList.lIIIllIIlllllI[15] = (6 + 102 - 61 + 122 ^ 120 + 10 + 16 + 15);
    }
    
    private static boolean llIIIlIIIIIlIIl(final int lllllllllllllIlIIIIIIlIlIlllIlII) {
        return lllllllllllllIlIIIIIIlIlIlllIlII >= 0;
    }
    
    private static boolean llIIIlIIIIIIIll(final int lllllllllllllIlIIIIIIlIlIlllIllI) {
        return lllllllllllllIlIIIIIIlIlIlllIllI == 0;
    }
    
    private static boolean llIIIlIIIIIIllI(final int lllllllllllllIlIIIIIIlIlIlllIIlI) {
        return lllllllllllllIlIIIIIIlIlIlllIIlI > 0;
    }
    
    public void set(final int lllllllllllllIlIIIIIIllIIIIllIIl, final NBTBase lllllllllllllIlIIIIIIllIIIIllIll) {
        if (llIIIlIIIIIIIll(lllllllllllllIlIIIIIIllIIIIllIll.getId())) {
            NBTTagList.LOGGER.warn(NBTTagList.lIIIllIIllIIll[NBTTagList.lIIIllIIlllllI[10]]);
            "".length();
            if (-"  ".length() > 0) {
                return;
            }
        }
        else if (llIIIlIIIIIlIIl(lllllllllllllIlIIIIIIllIIIIllIIl) && llIIIlIIIIIlIlI(lllllllllllllIlIIIIIIllIIIIllIIl, this.tagList.size())) {
            if (llIIIlIIIIIIIll(this.tagType)) {
                this.tagType = lllllllllllllIlIIIIIIllIIIIllIll.getId();
                "".length();
                if (" ".length() > "  ".length()) {
                    return;
                }
            }
            else if (llIIIlIIIIIlIII(this.tagType, lllllllllllllIlIIIIIIllIIIIllIll.getId())) {
                NBTTagList.LOGGER.warn(NBTTagList.lIIIllIIllIIll[NBTTagList.lIIIllIIlllllI[11]]);
                return;
            }
            this.tagList.set(lllllllllllllIlIIIIIIllIIIIllIIl, lllllllllllllIlIIIIIIllIIIIllIll);
            "".length();
            "".length();
            if (" ".length() <= 0) {
                return;
            }
        }
        else {
            NBTTagList.LOGGER.warn(NBTTagList.lIIIllIIllIIll[NBTTagList.lIIIllIIlllllI[12]]);
        }
    }
    
    private static boolean llIIIlIIIIIlIII(final int lllllllllllllIlIIIIIIlIlIllIllll, final int lllllllllllllIlIIIIIIlIlIllIlllI) {
        return lllllllllllllIlIIIIIIlIlIllIllll != lllllllllllllIlIIIIIIlIlIllIlllI;
    }
    
    @Override
    public NBTBase copy() {
        final NBTTagList lllllllllllllIlIIIIIIlIlllIlIIlI = new NBTTagList();
        lllllllllllllIlIIIIIIlIlllIlIIlI.tagType = this.tagType;
        final String lllllllllllllIlIIIIIIlIlllIIllII = (String)this.tagList.iterator();
        "".length();
        if (((0x5A ^ 0x4 ^ (0x3B ^ 0x68)) & (141 + 120 - 247 + 159 ^ 25 + 124 - 61 + 72 ^ -" ".length())) < 0) {
            return null;
        }
        while (!llIIIlIIIIIIIll(((Iterator)lllllllllllllIlIIIIIIlIlllIIllII).hasNext() ? 1 : 0)) {
            final NBTBase lllllllllllllIlIIIIIIlIlllIlIIIl = ((Iterator<NBTBase>)lllllllllllllIlIIIIIIlIlllIIllII).next();
            final NBTBase lllllllllllllIlIIIIIIlIlllIlIIII = lllllllllllllIlIIIIIIlIlllIlIIIl.copy();
            lllllllllllllIlIIIIIIlIlllIlIIlI.tagList.add(lllllllllllllIlIIIIIIlIlllIlIIII);
            "".length();
        }
        return lllllllllllllIlIIIIIIlIlllIlIIlI;
    }
    
    public NBTTagList() {
        this.tagList = (List<NBTBase>)Lists.newArrayList();
        this.tagType = (byte)NBTTagList.lIIIllIIlllllI[0];
    }
    
    @Override
    public int hashCode() {
        return super.hashCode() ^ this.tagList.hashCode();
    }
    
    @Override
    public String toString() {
        final StringBuilder lllllllllllllIlIIIIIIllIIIlIlIll = new StringBuilder(NBTTagList.lIIIllIIllIIll[NBTTagList.lIIIllIIlllllI[4]]);
        int lllllllllllllIlIIIIIIllIIIlIlIlI = NBTTagList.lIIIllIIlllllI[0];
        "".length();
        if ("   ".length() <= 0) {
            return null;
        }
        while (!llIIIlIIIIIIlII(lllllllllllllIlIIIIIIllIIIlIlIlI, this.tagList.size())) {
            if (llIIIlIIIIIIlll(lllllllllllllIlIIIIIIllIIIlIlIlI)) {
                lllllllllllllIlIIIIIIllIIIlIlIll.append((char)NBTTagList.lIIIllIIlllllI[5]);
                "".length();
            }
            lllllllllllllIlIIIIIIllIIIlIlIll.append(lllllllllllllIlIIIIIIllIIIlIlIlI).append((char)NBTTagList.lIIIllIIlllllI[6]).append(this.tagList.get(lllllllllllllIlIIIIIIllIIIlIlIlI));
            "".length();
            ++lllllllllllllIlIIIIIIllIIIlIlIlI;
        }
        return String.valueOf(lllllllllllllIlIIIIIIllIIIlIlIll.append((char)NBTTagList.lIIIllIIlllllI[7]));
    }
    
    public int getTagType() {
        return this.tagType;
    }
    
    public void appendTag(final NBTBase lllllllllllllIlIIIIIIllIIIlIIIll) {
        if (llIIIlIIIIIIIll(lllllllllllllIlIIIIIIllIIIlIIIll.getId())) {
            NBTTagList.LOGGER.warn(NBTTagList.lIIIllIIllIIll[NBTTagList.lIIIllIIlllllI[8]]);
            "".length();
            if (-" ".length() > 0) {
                return;
            }
        }
        else {
            if (llIIIlIIIIIIIll(this.tagType)) {
                this.tagType = lllllllllllllIlIIIIIIllIIIlIIIll.getId();
                "".length();
                if (-" ".length() == (0x4B ^ 0x4F)) {
                    return;
                }
            }
            else if (llIIIlIIIIIlIII(this.tagType, lllllllllllllIlIIIIIIllIIIlIIIll.getId())) {
                NBTTagList.LOGGER.warn(NBTTagList.lIIIllIIllIIll[NBTTagList.lIIIllIIlllllI[9]]);
                return;
            }
            this.tagList.add(lllllllllllllIlIIIIIIllIIIlIIIll);
            "".length();
        }
    }
    
    public int tagCount() {
        return this.tagList.size();
    }
    
    public NBTBase get(final int lllllllllllllIlIIIIIIlIlllIlllII) {
        NBTBase nbtBase;
        if (llIIIlIIIIIlIIl(lllllllllllllIlIIIIIIlIlllIlllII) && llIIIlIIIIIlIlI(lllllllllllllIlIIIIIIlIlllIlllII, this.tagList.size())) {
            nbtBase = this.tagList.get(lllllllllllllIlIIIIIIlIlllIlllII);
            "".length();
            if (((0xA6 ^ 0x91) & ~(0x5A ^ 0x6D)) > 0) {
                return null;
            }
        }
        else {
            nbtBase = new NBTTagEnd();
        }
        return nbtBase;
    }
    
    @Override
    public byte getId() {
        return (byte)NBTTagList.lIIIllIIlllllI[3];
    }
    
    public NBTTagCompound getCompoundTagAt(final int lllllllllllllIlIIIIIIllIIIIIlIlI) {
        if (llIIIlIIIIIlIIl(lllllllllllllIlIIIIIIllIIIIIlIlI) && llIIIlIIIIIlIlI(lllllllllllllIlIIIIIIllIIIIIlIlI, this.tagList.size())) {
            final NBTBase lllllllllllllIlIIIIIIllIIIIIlIIl = this.tagList.get(lllllllllllllIlIIIIIIllIIIIIlIlI);
            NBTTagCompound nbtTagCompound;
            if (llIIIlIIIIIlIll(lllllllllllllIlIIIIIIllIIIIIlIIl.getId(), NBTTagList.lIIIllIIlllllI[13])) {
                nbtTagCompound = (NBTTagCompound)lllllllllllllIlIIIIIIllIIIIIlIIl;
                "".length();
                if ("   ".length() <= 0) {
                    return null;
                }
            }
            else {
                nbtTagCompound = new NBTTagCompound();
            }
            return nbtTagCompound;
        }
        return new NBTTagCompound();
    }
    
    private static boolean llIIIlIIIIIIlll(final int lllllllllllllIlIIIIIIlIlIllllIII) {
        return lllllllllllllIlIIIIIIlIlIllllIII != 0;
    }
    
    @Override
    void read(final DataInput lllllllllllllIlIIIIIIllIIIllllIl, final int lllllllllllllIlIIIIIIllIIIllllII, final NBTSizeTracker lllllllllllllIlIIIIIIllIIIllIlII) throws IOException {
        lllllllllllllIlIIIIIIllIIIllIlII.read(296L);
        if (llIIIlIIIIIIlIl(lllllllllllllIlIIIIIIllIIIllllII, NBTTagList.lIIIllIIlllllI[1])) {
            throw new RuntimeException(NBTTagList.lIIIllIIllIIll[NBTTagList.lIIIllIIlllllI[0]]);
        }
        this.tagType = lllllllllllllIlIIIIIIllIIIllllIl.readByte();
        final int lllllllllllllIlIIIIIIllIIIlllIlI = lllllllllllllIlIIIIIIllIIIllllIl.readInt();
        if (llIIIlIIIIIIIll(this.tagType) && llIIIlIIIIIIllI(lllllllllllllIlIIIIIIllIIIlllIlI)) {
            throw new RuntimeException(NBTTagList.lIIIllIIllIIll[NBTTagList.lIIIllIIlllllI[2]]);
        }
        lllllllllllllIlIIIIIIllIIIllIlII.read(32L * lllllllllllllIlIIIIIIllIIIlllIlI);
        this.tagList = (List<NBTBase>)Lists.newArrayListWithCapacity(lllllllllllllIlIIIIIIllIIIlllIlI);
        int lllllllllllllIlIIIIIIllIIIlllIIl = NBTTagList.lIIIllIIlllllI[0];
        "".length();
        if ("  ".length() == 0) {
            return;
        }
        while (!llIIIlIIIIIIlII(lllllllllllllIlIIIIIIllIIIlllIIl, lllllllllllllIlIIIIIIllIIIlllIlI)) {
            final NBTBase lllllllllllllIlIIIIIIllIIIlllIII = NBTBase.createNewByType(this.tagType);
            lllllllllllllIlIIIIIIllIIIlllIII.read(lllllllllllllIlIIIIIIllIIIllllIl, lllllllllllllIlIIIIIIllIIIllllII + NBTTagList.lIIIllIIlllllI[2], lllllllllllllIlIIIIIIllIIIllIlII);
            this.tagList.add(lllllllllllllIlIIIIIIllIIIlllIII);
            "".length();
            ++lllllllllllllIlIIIIIIllIIIlllIIl;
        }
    }
    
    private static boolean llIIIlIIIIIlIll(final int lllllllllllllIlIIIIIIlIllIIIIlll, final int lllllllllllllIlIIIIIIlIllIIIIllI) {
        return lllllllllllllIlIIIIIIlIllIIIIlll == lllllllllllllIlIIIIIIlIllIIIIllI;
    }
    
    @Override
    void write(final DataOutput lllllllllllllIlIIIIIIllIIlIIlIlI) throws IOException {
        if (llIIIlIIIIIIIll(this.tagList.isEmpty() ? 1 : 0)) {
            this.tagType = this.tagList.get(NBTTagList.lIIIllIIlllllI[0]).getId();
            "".length();
            if (" ".length() == 0) {
                return;
            }
        }
        else {
            this.tagType = (byte)NBTTagList.lIIIllIIlllllI[0];
        }
        lllllllllllllIlIIIIIIllIIlIIlIlI.writeByte(this.tagType);
        lllllllllllllIlIIIIIIllIIlIIlIlI.writeInt(this.tagList.size());
        int lllllllllllllIlIIIIIIllIIlIIlIIl = NBTTagList.lIIIllIIlllllI[0];
        "".length();
        if (null != null) {
            return;
        }
        while (!llIIIlIIIIIIlII(lllllllllllllIlIIIIIIllIIlIIlIIl, this.tagList.size())) {
            this.tagList.get(lllllllllllllIlIIIIIIllIIlIIlIIl).write(lllllllllllllIlIIIIIIllIIlIIlIlI);
            ++lllllllllllllIlIIIIIIllIIlIIlIIl;
        }
    }
    
    private static boolean llIIIlIIIIIlIlI(final int lllllllllllllIlIIIIIIlIlIlllllll, final int lllllllllllllIlIIIIIIlIlIllllllI) {
        return lllllllllllllIlIIIIIIlIlIlllllll < lllllllllllllIlIIIIIIlIlIllllllI;
    }
    
    public String getStringTagAt(final int lllllllllllllIlIIIIIIlIllllIIIll) {
        if (llIIIlIIIIIlIIl(lllllllllllllIlIIIIIIlIllllIIIll) && llIIIlIIIIIlIlI(lllllllllllllIlIIIIIIlIllllIIIll, this.tagList.size())) {
            final NBTBase lllllllllllllIlIIIIIIlIllllIIlIl = this.tagList.get(lllllllllllllIlIIIIIIlIllllIIIll);
            String s;
            if (llIIIlIIIIIlIll(lllllllllllllIlIIIIIIlIllllIIlIl.getId(), NBTTagList.lIIIllIIlllllI[15])) {
                s = lllllllllllllIlIIIIIIlIllllIIlIl.getString();
                "".length();
                if (-" ".length() > "   ".length()) {
                    return null;
                }
            }
            else {
                s = lllllllllllllIlIIIIIIlIllllIIlIl.toString();
            }
            return s;
        }
        return NBTTagList.lIIIllIIllIIll[NBTTagList.lIIIllIIlllllI[15]];
    }
    
    private static String llIIIIlllIlIIll(String lllllllllllllIlIIIIIIlIllIIlIIlI, final String lllllllllllllIlIIIIIIlIllIIlIllI) {
        lllllllllllllIlIIIIIIlIllIIlIIlI = (short)new String(Base64.getDecoder().decode(((String)lllllllllllllIlIIIIIIlIllIIlIIlI).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIlIIIIIIlIllIIlIlIl = new StringBuilder();
        final char[] lllllllllllllIlIIIIIIlIllIIlIlII = lllllllllllllIlIIIIIIlIllIIlIllI.toCharArray();
        int lllllllllllllIlIIIIIIlIllIIlIIll = NBTTagList.lIIIllIIlllllI[0];
        final short lllllllllllllIlIIIIIIlIllIIIllIl = (Object)((String)lllllllllllllIlIIIIIIlIllIIlIIlI).toCharArray();
        final byte lllllllllllllIlIIIIIIlIllIIIllII = (byte)lllllllllllllIlIIIIIIlIllIIIllIl.length;
        Exception lllllllllllllIlIIIIIIlIllIIIlIll = (Exception)NBTTagList.lIIIllIIlllllI[0];
        while (llIIIlIIIIIlIlI((int)lllllllllllllIlIIIIIIlIllIIIlIll, lllllllllllllIlIIIIIIlIllIIIllII)) {
            final char lllllllllllllIlIIIIIIlIllIIllIII = lllllllllllllIlIIIIIIlIllIIIllIl[lllllllllllllIlIIIIIIlIllIIIlIll];
            lllllllllllllIlIIIIIIlIllIIlIlIl.append((char)(lllllllllllllIlIIIIIIlIllIIllIII ^ lllllllllllllIlIIIIIIlIllIIlIlII[lllllllllllllIlIIIIIIlIllIIlIIll % lllllllllllllIlIIIIIIlIllIIlIlII.length]));
            "".length();
            ++lllllllllllllIlIIIIIIlIllIIlIIll;
            ++lllllllllllllIlIIIIIIlIllIIIlIll;
            "".length();
            if (null != null) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIlIIIIIIlIllIIlIlIl);
    }
    
    private static void llIIIIlllIlIlIl() {
        (lIIIllIIllIIll = new String[NBTTagList.lIIIllIIlllllI[3]])[NBTTagList.lIIIllIIlllllI[0]] = llIIIIlllIlIIlI("n5TDFqaynv1VYW/w7NWUgwFE+zTdFlTI4ia5qRVHYy2WfCEZls4jHn8dgW7RHbGYkyc8AVfdiTXPkZnhzgbfgA==", "YYDgW");
        NBTTagList.lIIIllIIllIIll[NBTTagList.lIIIllIIlllllI[2]] = llIIIIlllIlIIlI("Q1HeojXuH9yPdCmOK/pd1QB+UQAT79Iv", "NAzjc");
        NBTTagList.lIIIllIIllIIll[NBTTagList.lIIIllIIlllllI[4]] = llIIIIlllIlIIll("DQ==", "Vtceg");
        NBTTagList.lIIIllIIllIIll[NBTTagList.lIIIllIIlllllI[8]] = llIIIIlllIlIIlI("ScH3c5YExEb+K+ge6zRKqVoy8M/2fnN0N/RjnTZevaU=", "dyeaC");
        NBTTagList.lIIIllIIllIIll[NBTTagList.lIIIllIIlllllI[9]] = llIIIIlllIlIIll("OCsvKCQebyYoORQuPyIiECEsYT4YKGs1MwkqOGE+Fm8/IC1ZIyIyPg==", "yOKAJ");
        NBTTagList.lIIIllIIllIIll[NBTTagList.lIIIllIIlllllI[10]] = llIIIIlllIlIIlI("WaT4WafJG+F4j5DpHt9Mee5ZOx4pnp1JT4siHpKewqk=", "nRbuA");
        NBTTagList.lIIIllIIllIIll[NBTTagList.lIIIllIIlllllI[11]] = llIIIIlllIlIIlI("XPo4SCMhTyxxfSYXxeaDAsuyu62wT2yeUB9+AbxaPizrHLKrl8aMb3LvcA+itcKX", "QHkoe");
        NBTTagList.lIIIllIIllIIll[NBTTagList.lIIIllIIlllllI[12]] = llIIIIlllIlIlII("N3il3rDMUaYbaybOAO2O9as6mKbaVcnKbkqfD/Ez9D31i45d15Nj6+E6ULPbEQb/", "Zpqst");
        NBTTagList.lIIIllIIllIIll[NBTTagList.lIIIllIIlllllI[15]] = llIIIIlllIlIlII("vQU7ZxocLQ4=", "VLbxC");
    }
    
    private static String llIIIIlllIlIlII(final String lllllllllllllIlIIIIIIlIllIllIlII, final String lllllllllllllIlIIIIIIlIllIllIIll) {
        try {
            final SecretKeySpec lllllllllllllIlIIIIIIlIllIllIlll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIlIIIIIIlIllIllIIll.getBytes(StandardCharsets.UTF_8)), NBTTagList.lIIIllIIlllllI[15]), "DES");
            final Cipher lllllllllllllIlIIIIIIlIllIllIllI = Cipher.getInstance("DES");
            lllllllllllllIlIIIIIIlIllIllIllI.init(NBTTagList.lIIIllIIlllllI[4], lllllllllllllIlIIIIIIlIllIllIlll);
            return new String(lllllllllllllIlIIIIIIlIllIllIllI.doFinal(Base64.getDecoder().decode(lllllllllllllIlIIIIIIlIllIllIlII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIlIIIIIIlIllIllIlIl) {
            lllllllllllllIlIIIIIIlIllIllIlIl.printStackTrace();
            return null;
        }
    }
    
    @Override
    public boolean hasNoTags() {
        return this.tagList.isEmpty();
    }
    
    private static boolean llIIIlIIIIIIlIl(final int lllllllllllllIlIIIIIIlIlIllllIll, final int lllllllllllllIlIIIIIIlIlIllllIlI) {
        return lllllllllllllIlIIIIIIlIlIllllIll > lllllllllllllIlIIIIIIlIlIllllIlI;
    }
    
    private static String llIIIIlllIlIIlI(final String lllllllllllllIlIIIIIIlIllIlIIlIl, final String lllllllllllllIlIIIIIIlIllIlIIllI) {
        try {
            final SecretKeySpec lllllllllllllIlIIIIIIlIllIlIlIlI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIlIIIIIIlIllIlIIllI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lllllllllllllIlIIIIIIlIllIlIlIIl = Cipher.getInstance("Blowfish");
            lllllllllllllIlIIIIIIlIllIlIlIIl.init(NBTTagList.lIIIllIIlllllI[4], lllllllllllllIlIIIIIIlIllIlIlIlI);
            return new String(lllllllllllllIlIIIIIIlIllIlIlIIl.doFinal(Base64.getDecoder().decode(lllllllllllllIlIIIIIIlIllIlIIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIlIIIIIIlIllIlIlIII) {
            lllllllllllllIlIIIIIIlIllIlIlIII.printStackTrace();
            return null;
        }
    }
    
    static {
        llIIIlIIIIIIIlI();
        llIIIIlllIlIlIl();
        LOGGER = LogManager.getLogger();
    }
    
    public int[] getIntArrayAt(final int lllllllllllllIlIIIIIIllIIIIIIIIl) {
        if (llIIIlIIIIIlIIl(lllllllllllllIlIIIIIIllIIIIIIIIl) && llIIIlIIIIIlIlI(lllllllllllllIlIIIIIIllIIIIIIIIl, this.tagList.size())) {
            final NBTBase lllllllllllllIlIIIIIIllIIIIIIIII = this.tagList.get(lllllllllllllIlIIIIIIllIIIIIIIIl);
            int[] intArray;
            if (llIIIlIIIIIlIll(lllllllllllllIlIIIIIIllIIIIIIIII.getId(), NBTTagList.lIIIllIIlllllI[14])) {
                intArray = ((NBTTagIntArray)lllllllllllllIlIIIIIIllIIIIIIIII).getIntArray();
                "".length();
                if (-"  ".length() >= 0) {
                    return null;
                }
            }
            else {
                intArray = new int[NBTTagList.lIIIllIIlllllI[0]];
            }
            return intArray;
        }
        return new int[NBTTagList.lIIIllIIlllllI[0]];
    }
}
