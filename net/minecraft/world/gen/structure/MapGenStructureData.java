// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.world.gen.structure;

import java.util.Arrays;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.security.MessageDigest;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import net.minecraft.nbt.NBTBase;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.world.WorldSavedData;

public class MapGenStructureData extends WorldSavedData
{
    private /* synthetic */ NBTTagCompound tagCompound;
    private static final /* synthetic */ String[] lllIIIlIlllIll;
    private static final /* synthetic */ int[] lllIIIlIllllII;
    
    public NBTTagCompound getTagCompound() {
        return this.tagCompound;
    }
    
    private static void lIIlllIllIllIIII() {
        (lllIIIlIllllII = new int[7])[0] = ((0x63 ^ 0x7A ^ (0x39 ^ 0x6E)) & (139 + 111 - 83 + 31 ^ 19 + 72 + 31 + 14 ^ -" ".length()));
        MapGenStructureData.lllIIIlIllllII[1] = " ".length();
        MapGenStructureData.lllIIIlIllllII[2] = "  ".length();
        MapGenStructureData.lllIIIlIllllII[3] = "   ".length();
        MapGenStructureData.lllIIIlIllllII[4] = (0x36 ^ 0x32);
        MapGenStructureData.lllIIIlIllllII[5] = (0x13 ^ 0x16);
        MapGenStructureData.lllIIIlIllllII[6] = (80 + 64 + 17 + 0 ^ 159 + 22 - 94 + 82);
    }
    
    static {
        lIIlllIllIllIIII();
        lIIlllIllIlIllll();
    }
    
    @Override
    public void writeToNBT(final NBTTagCompound llllllllllllIllIIIIIIlIIIlIlIIIl) {
        llllllllllllIllIIIIIIlIIIlIlIIIl.setTag(MapGenStructureData.lllIIIlIlllIll[MapGenStructureData.lllIIIlIllllII[1]], this.tagCompound);
    }
    
    @Override
    public void readFromNBT(final NBTTagCompound llllllllllllIllIIIIIIlIIIlIlIlll) {
        this.tagCompound = llllllllllllIllIIIIIIlIIIlIlIlll.getCompoundTag(MapGenStructureData.lllIIIlIlllIll[MapGenStructureData.lllIIIlIllllII[0]]);
    }
    
    private static String lIIlllIllIlIllII(String llllllllllllIllIIIIIIlIIIIIlIIlI, final String llllllllllllIllIIIIIIlIIIIIlIllI) {
        llllllllllllIllIIIIIIlIIIIIlIIlI = (float)new String(Base64.getDecoder().decode(((String)llllllllllllIllIIIIIIlIIIIIlIIlI).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder llllllllllllIllIIIIIIlIIIIIlIlIl = new StringBuilder();
        final char[] llllllllllllIllIIIIIIlIIIIIlIlII = llllllllllllIllIIIIIIlIIIIIlIllI.toCharArray();
        int llllllllllllIllIIIIIIlIIIIIlIIll = MapGenStructureData.lllIIIlIllllII[0];
        final Exception llllllllllllIllIIIIIIlIIIIIIllIl = (Object)((String)llllllllllllIllIIIIIIlIIIIIlIIlI).toCharArray();
        final double llllllllllllIllIIIIIIlIIIIIIllII = llllllllllllIllIIIIIIlIIIIIIllIl.length;
        String llllllllllllIllIIIIIIlIIIIIIlIll = (String)MapGenStructureData.lllIIIlIllllII[0];
        while (lIIlllIllIllIIIl((int)llllllllllllIllIIIIIIlIIIIIIlIll, (int)llllllllllllIllIIIIIIlIIIIIIllII)) {
            final char llllllllllllIllIIIIIIlIIIIIllIII = llllllllllllIllIIIIIIlIIIIIIllIl[llllllllllllIllIIIIIIlIIIIIIlIll];
            llllllllllllIllIIIIIIlIIIIIlIlIl.append((char)(llllllllllllIllIIIIIIlIIIIIllIII ^ llllllllllllIllIIIIIIlIIIIIlIlII[llllllllllllIllIIIIIIlIIIIIlIIll % llllllllllllIllIIIIIIlIIIIIlIlII.length]));
            "".length();
            ++llllllllllllIllIIIIIIlIIIIIlIIll;
            ++llllllllllllIllIIIIIIlIIIIIIlIll;
            "".length();
            if (((121 + 92 - 183 + 145 ^ 104 + 80 - 54 + 23) & (0xFB ^ 0xB0 ^ (0x2E ^ 0x53) ^ -" ".length())) >= (0x66 ^ 0x15 ^ (0x4F ^ 0x38))) {
                return null;
            }
        }
        return String.valueOf(llllllllllllIllIIIIIIlIIIIIlIlIl);
    }
    
    private static String lIIlllIllIlIllIl(final String llllllllllllIllIIIIIIlIIIIllIIlI, final String llllllllllllIllIIIIIIlIIIIllIIIl) {
        try {
            final SecretKeySpec llllllllllllIllIIIIIIlIIIIllIlll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIllIIIIIIlIIIIllIIIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher llllllllllllIllIIIIIIlIIIIllIllI = Cipher.getInstance("Blowfish");
            llllllllllllIllIIIIIIlIIIIllIllI.init(MapGenStructureData.lllIIIlIllllII[2], llllllllllllIllIIIIIIlIIIIllIlll);
            return new String(llllllllllllIllIIIIIIlIIIIllIllI.doFinal(Base64.getDecoder().decode(llllllllllllIllIIIIIIlIIIIllIIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIllIIIIIIlIIIIllIlIl) {
            llllllllllllIllIIIIIIlIIIIllIlIl.printStackTrace();
            return null;
        }
    }
    
    private static void lIIlllIllIlIllll() {
        (lllIIIlIlllIll = new String[MapGenStructureData.lllIIIlIllllII[5]])[MapGenStructureData.lllIIIlIllllII[0]] = lIIlllIllIlIllII("BT0AJQMxPRI=", "CXaQv");
        MapGenStructureData.lllIIIlIlllIll[MapGenStructureData.lllIIIlIllllII[1]] = lIIlllIllIlIllIl("joPqdPcXfRyDZKD5fGQGFQ==", "ZdvPh");
        MapGenStructureData.lllIIIlIlllIll[MapGenStructureData.lllIIIlIllllII[2]] = lIIlllIllIlIllIl("ICA9HZHMtmM=", "REEiR");
        MapGenStructureData.lllIIIlIlllIll[MapGenStructureData.lllIIIlIllllII[3]] = lIIlllIllIlIllIl("9dSXqyCBQ8M=", "Xqcrf");
        MapGenStructureData.lllIIIlIlllIll[MapGenStructureData.lllIIIlIllllII[4]] = lIIlllIllIlIlllI("c22m+ZkThBc=", "pOcDS");
    }
    
    private static String lIIlllIllIlIlllI(final String llllllllllllIllIIIIIIlIIIIlIIlll, final String llllllllllllIllIIIIIIlIIIIlIIllI) {
        try {
            final SecretKeySpec llllllllllllIllIIIIIIlIIIIlIlIlI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIllIIIIIIlIIIIlIIllI.getBytes(StandardCharsets.UTF_8)), MapGenStructureData.lllIIIlIllllII[6]), "DES");
            final Cipher llllllllllllIllIIIIIIlIIIIlIlIIl = Cipher.getInstance("DES");
            llllllllllllIllIIIIIIlIIIIlIlIIl.init(MapGenStructureData.lllIIIlIllllII[2], llllllllllllIllIIIIIIlIIIIlIlIlI);
            return new String(llllllllllllIllIIIIIIlIIIIlIlIIl.doFinal(Base64.getDecoder().decode(llllllllllllIllIIIIIIlIIIIlIIlll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIllIIIIIIlIIIIlIlIII) {
            llllllllllllIllIIIIIIlIIIIlIlIII.printStackTrace();
            return null;
        }
    }
    
    public static String formatChunkCoords(final int llllllllllllIllIIIIIIlIIIlIIIIlI, final int llllllllllllIllIIIIIIlIIIlIIIIIl) {
        return String.valueOf(new StringBuilder(MapGenStructureData.lllIIIlIlllIll[MapGenStructureData.lllIIIlIllllII[2]]).append(llllllllllllIllIIIIIIlIIIlIIIIlI).append(MapGenStructureData.lllIIIlIlllIll[MapGenStructureData.lllIIIlIllllII[3]]).append(llllllllllllIllIIIIIIlIIIlIIIIIl).append(MapGenStructureData.lllIIIlIlllIll[MapGenStructureData.lllIIIlIllllII[4]]));
    }
    
    public void writeInstance(final NBTTagCompound llllllllllllIllIIIIIIlIIIlIIlIll, final int llllllllllllIllIIIIIIlIIIlIIlIlI, final int llllllllllllIllIIIIIIlIIIlIIlIIl) {
        this.tagCompound.setTag(formatChunkCoords(llllllllllllIllIIIIIIlIIIlIIlIlI, llllllllllllIllIIIIIIlIIIlIIlIIl), llllllllllllIllIIIIIIlIIIlIIlIll);
    }
    
    private static boolean lIIlllIllIllIIIl(final int llllllllllllIllIIIIIIlIIIIIIIlll, final int llllllllllllIllIIIIIIlIIIIIIIllI) {
        return llllllllllllIllIIIIIIlIIIIIIIlll < llllllllllllIllIIIIIIlIIIIIIIllI;
    }
    
    public MapGenStructureData(final String llllllllllllIllIIIIIIlIIIlIlllll) {
        super(llllllllllllIllIIIIIIlIIIlIlllll);
        this.tagCompound = new NBTTagCompound();
    }
}
