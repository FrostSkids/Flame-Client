// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.world.gen.structure;

import java.util.Iterator;
import java.util.Arrays;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Random;
import net.minecraft.world.World;
import net.minecraft.nbt.NBTTagList;
import net.minecraft.nbt.NBTBase;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.world.ChunkCoordIntPair;
import java.util.LinkedList;

public abstract class StructureStart
{
    private /* synthetic */ int chunkPosZ;
    private static final /* synthetic */ String[] lIlIllIllllllI;
    protected /* synthetic */ StructureBoundingBox boundingBox;
    protected /* synthetic */ LinkedList<StructureComponent> components;
    private static final /* synthetic */ int[] lIlIllIlllllll;
    private /* synthetic */ int chunkPosX;
    
    public int getChunkPosZ() {
        return this.chunkPosZ;
    }
    
    public StructureBoundingBox getBoundingBox() {
        return this.boundingBox;
    }
    
    public LinkedList<StructureComponent> getComponents() {
        return this.components;
    }
    
    public void func_175787_b(final ChunkCoordIntPair lllllllllllllIIIIllIIIIIllIIIIll) {
    }
    
    private static boolean llllIIlIllIIlII(final int lllllllllllllIIIIllIIIIIIlIlIIIl, final int lllllllllllllIIIIllIIIIIIlIIllll) {
        return lllllllllllllIIIIllIIIIIIlIlIIIl < lllllllllllllIIIIllIIIIIIlIIllll;
    }
    
    public NBTTagCompound writeStructureComponentsToNBT(final int lllllllllllllIIIIllIIIIlIIlIIIlI, final int lllllllllllllIIIIllIIIIlIIlIIIIl) {
        final NBTTagCompound lllllllllllllIIIIllIIIIlIIlIIIII = new NBTTagCompound();
        lllllllllllllIIIIllIIIIlIIlIIIII.setString(StructureStart.lIlIllIllllllI[StructureStart.lIlIllIlllllll[0]], MapGenStructureIO.getStructureStartName(this));
        lllllllllllllIIIIllIIIIlIIlIIIII.setInteger(StructureStart.lIlIllIllllllI[StructureStart.lIlIllIlllllll[1]], lllllllllllllIIIIllIIIIlIIlIIIlI);
        lllllllllllllIIIIllIIIIlIIlIIIII.setInteger(StructureStart.lIlIllIllllllI[StructureStart.lIlIllIlllllll[2]], lllllllllllllIIIIllIIIIlIIlIIIIl);
        lllllllllllllIIIIllIIIIlIIlIIIII.setTag(StructureStart.lIlIllIllllllI[StructureStart.lIlIllIlllllll[3]], this.boundingBox.toNBTTagIntArray());
        final NBTTagList lllllllllllllIIIIllIIIIlIIIlllll = new NBTTagList();
        final long lllllllllllllIIIIllIIIIlIIIlIlll = (long)this.components.iterator();
        "".length();
        if (-" ".length() != -" ".length()) {
            return null;
        }
        while (!llllIIlIllIIIlI(((Iterator)lllllllllllllIIIIllIIIIlIIIlIlll).hasNext() ? 1 : 0)) {
            final StructureComponent lllllllllllllIIIIllIIIIlIIIllllI = ((Iterator<StructureComponent>)lllllllllllllIIIIllIIIIlIIIlIlll).next();
            lllllllllllllIIIIllIIIIlIIIlllll.appendTag(lllllllllllllIIIIllIIIIlIIIllllI.createStructureBaseNBT());
        }
        lllllllllllllIIIIllIIIIlIIlIIIII.setTag(StructureStart.lIlIllIllllllI[StructureStart.lIlIllIlllllll[4]], lllllllllllllIIIIllIIIIlIIIlllll);
        this.writeToNBT(lllllllllllllIIIIllIIIIlIIlIIIII);
        return lllllllllllllIIIIllIIIIlIIlIIIII;
    }
    
    protected void updateBoundingBox() {
        this.boundingBox = StructureBoundingBox.getNewBoundingBox();
        final byte lllllllllllllIIIIllIIIIlIIlIlIll = (byte)this.components.iterator();
        "".length();
        if ("   ".length() == 0) {
            return;
        }
        while (!llllIIlIllIIIlI(((Iterator)lllllllllllllIIIIllIIIIlIIlIlIll).hasNext() ? 1 : 0)) {
            final StructureComponent lllllllllllllIIIIllIIIIlIIlIlllI = ((Iterator<StructureComponent>)lllllllllllllIIIIllIIIIlIIlIlIll).next();
            this.boundingBox.expandTo(lllllllllllllIIIIllIIIIlIIlIlllI.getBoundingBox());
        }
    }
    
    protected void markAvailableHeight(final World lllllllllllllIIIIllIIIIIllllIIIl, final Random lllllllllllllIIIIllIIIIIlllllIII, final int lllllllllllllIIIIllIIIIIllllIlll) {
        final int lllllllllllllIIIIllIIIIIllllIllI = lllllllllllllIIIIllIIIIIllllIIIl.func_181545_F() - lllllllllllllIIIIllIIIIIllllIlll;
        int lllllllllllllIIIIllIIIIIllllIlIl = this.boundingBox.getYSize() + StructureStart.lIlIllIlllllll[1];
        if (llllIIlIllIIlII(lllllllllllllIIIIllIIIIIllllIlIl, lllllllllllllIIIIllIIIIIllllIllI)) {
            lllllllllllllIIIIllIIIIIllllIlIl += lllllllllllllIIIIllIIIIIlllllIII.nextInt(lllllllllllllIIIIllIIIIIllllIllI - lllllllllllllIIIIllIIIIIllllIlIl);
        }
        final int lllllllllllllIIIIllIIIIIllllIlII = lllllllllllllIIIIllIIIIIllllIlIl - this.boundingBox.maxY;
        this.boundingBox.offset(StructureStart.lIlIllIlllllll[0], lllllllllllllIIIIllIIIIIllllIlII, StructureStart.lIlIllIlllllll[0]);
        final char lllllllllllllIIIIllIIIIIlllIlIlI = (char)this.components.iterator();
        "".length();
        if ("  ".length() != "  ".length()) {
            return;
        }
        while (!llllIIlIllIIIlI(((Iterator)lllllllllllllIIIIllIIIIIlllIlIlI).hasNext() ? 1 : 0)) {
            final StructureComponent lllllllllllllIIIIllIIIIIllllIIll = ((Iterator<StructureComponent>)lllllllllllllIIIIllIIIIIlllIlIlI).next();
            lllllllllllllIIIIllIIIIIllllIIll.func_181138_a(StructureStart.lIlIllIlllllll[0], lllllllllllllIIIIllIIIIIllllIlII, StructureStart.lIlIllIlllllll[0]);
        }
    }
    
    public void readFromNBT(final NBTTagCompound lllllllllllllIIIIllIIIIlIIIIIlII) {
    }
    
    private static boolean llllIIlIllIIIlI(final int lllllllllllllIIIIllIIIIIIIllllll) {
        return lllllllllllllIIIIllIIIIIIIllllll == 0;
    }
    
    public boolean func_175788_a(final ChunkCoordIntPair lllllllllllllIIIIllIIIIIllIIIllI) {
        return StructureStart.lIlIllIlllllll[1] != 0;
    }
    
    private static void llllIIlIlIllllI() {
        (lIlIllIllllllI = new String[StructureStart.lIlIllIlllllll[10]])[StructureStart.lIlIllIlllllll[0]] = llllIIlIlIllIll("LxI=", "FvjVi");
        StructureStart.lIlIllIllllllI[StructureStart.lIlIllIlllllll[1]] = llllIIlIlIllIll("ByAAJCwc", "DHuJG");
        StructureStart.lIlIllIllllllI[StructureStart.lIlIllIlllllll[2]] = llllIIlIlIlllII("YZD2OuKFQQ4=", "Yjwtc");
        StructureStart.lIlIllIllllllI[StructureStart.lIlIllIlllllll[3]] = llllIIlIlIllIll("Fyo=", "Uhhyz");
        StructureStart.lIlIllIllllllI[StructureStart.lIlIllIlllllll[4]] = llllIIlIlIlllII("gTuxo50EYYhhEPizFGWk5A==", "aICJF");
        StructureStart.lIlIllIllllllI[StructureStart.lIlIllIlllllll[5]] = llllIIlIlIlllII("taxUhbxYzP4=", "iyItJ");
        StructureStart.lIlIllIllllllI[StructureStart.lIlIllIlllllll[6]] = llllIIlIlIllIll("Nh4wPR0v", "uvESv");
        StructureStart.lIlIllIllllllI[StructureStart.lIlIllIlllllll[7]] = llllIIlIlIlllIl("AwnhJfpULAU=", "hPwYm");
        StructureStart.lIlIllIllllllI[StructureStart.lIlIllIlllllll[8]] = llllIIlIlIllIll("BTI=", "GpRWl");
        StructureStart.lIlIllIllllllI[StructureStart.lIlIllIlllllll[9]] = llllIIlIlIlllIl("iIErDr9fSOk6q+yKVCqlaw==", "EIxYK");
    }
    
    static {
        llllIIlIllIIIII();
        llllIIlIlIllllI();
    }
    
    public void readStructureComponentsFromNBT(final World lllllllllllllIIIIllIIIIlIIIIlIIl, final NBTTagCompound lllllllllllllIIIIllIIIIlIIIIllIl) {
        this.chunkPosX = lllllllllllllIIIIllIIIIlIIIIllIl.getInteger(StructureStart.lIlIllIllllllI[StructureStart.lIlIllIlllllll[5]]);
        this.chunkPosZ = lllllllllllllIIIIllIIIIlIIIIllIl.getInteger(StructureStart.lIlIllIllllllI[StructureStart.lIlIllIlllllll[6]]);
        if (llllIIlIllIIIIl(lllllllllllllIIIIllIIIIlIIIIllIl.hasKey(StructureStart.lIlIllIllllllI[StructureStart.lIlIllIlllllll[7]]) ? 1 : 0)) {
            this.boundingBox = new StructureBoundingBox(lllllllllllllIIIIllIIIIlIIIIllIl.getIntArray(StructureStart.lIlIllIllllllI[StructureStart.lIlIllIlllllll[8]]));
        }
        final NBTTagList lllllllllllllIIIIllIIIIlIIIIllII = lllllllllllllIIIIllIIIIlIIIIllIl.getTagList(StructureStart.lIlIllIllllllI[StructureStart.lIlIllIlllllll[9]], StructureStart.lIlIllIlllllll[10]);
        int lllllllllllllIIIIllIIIIlIIIIlIll = StructureStart.lIlIllIlllllll[0];
        "".length();
        if ((0x2F ^ 0x2A) <= 0) {
            return;
        }
        while (!llllIIlIllIIIll(lllllllllllllIIIIllIIIIlIIIIlIll, lllllllllllllIIIIllIIIIlIIIIllII.tagCount())) {
            this.components.add(MapGenStructureIO.getStructureComponent(lllllllllllllIIIIllIIIIlIIIIllII.getCompoundTagAt(lllllllllllllIIIIllIIIIlIIIIlIll), lllllllllllllIIIIllIIIIlIIIIlIIl));
            "".length();
            ++lllllllllllllIIIIllIIIIlIIIIlIll;
        }
        this.readFromNBT(lllllllllllllIIIIllIIIIlIIIIllIl);
    }
    
    private static boolean llllIIlIllIIIIl(final int lllllllllllllIIIIllIIIIIIlIIIlII) {
        return lllllllllllllIIIIllIIIIIIlIIIlII != 0;
    }
    
    public void writeToNBT(final NBTTagCompound lllllllllllllIIIIllIIIIlIIIlIlIl) {
    }
    
    public StructureStart(final int lllllllllllllIIIIllIIIIlIlIIllII, final int lllllllllllllIIIIllIIIIlIlIIlIll) {
        this.components = new LinkedList<StructureComponent>();
        this.chunkPosX = lllllllllllllIIIIllIIIIlIlIIllII;
        this.chunkPosZ = lllllllllllllIIIIllIIIIlIlIIlIll;
    }
    
    protected void setRandomHeight(final World lllllllllllllIIIIllIIIIIllIlllll, final Random lllllllllllllIIIIllIIIIIllIlIllI, final int lllllllllllllIIIIllIIIIIllIlllIl, final int lllllllllllllIIIIllIIIIIllIlllII) {
        final int lllllllllllllIIIIllIIIIIllIllIll = lllllllllllllIIIIllIIIIIllIlllII - lllllllllllllIIIIllIIIIIllIlllIl + StructureStart.lIlIllIlllllll[1] - this.boundingBox.getYSize();
        int lllllllllllllIIIIllIIIIIllIllIlI = StructureStart.lIlIllIlllllll[1];
        if (llllIIlIllIIlIl(lllllllllllllIIIIllIIIIIllIllIll, StructureStart.lIlIllIlllllll[1])) {
            lllllllllllllIIIIllIIIIIllIllIlI = lllllllllllllIIIIllIIIIIllIlllIl + lllllllllllllIIIIllIIIIIllIlIllI.nextInt(lllllllllllllIIIIllIIIIIllIllIll);
            "".length();
            if (null != null) {
                return;
            }
        }
        else {
            lllllllllllllIIIIllIIIIIllIllIlI = lllllllllllllIIIIllIIIIIllIlllIl;
        }
        final int lllllllllllllIIIIllIIIIIllIllIIl = lllllllllllllIIIIllIIIIIllIllIlI - this.boundingBox.minY;
        this.boundingBox.offset(StructureStart.lIlIllIlllllll[0], lllllllllllllIIIIllIIIIIllIllIIl, StructureStart.lIlIllIlllllll[0]);
        final String lllllllllllllIIIIllIIIIIllIIllII = (String)this.components.iterator();
        "".length();
        if (((126 + 140 - 92 + 10 ^ 98 + 54 - 16 + 17) & ("  ".length() ^ (0x5D ^ 0x7E) ^ -" ".length())) != 0x0) {
            return;
        }
        while (!llllIIlIllIIIlI(((Iterator)lllllllllllllIIIIllIIIIIllIIllII).hasNext() ? 1 : 0)) {
            final StructureComponent lllllllllllllIIIIllIIIIIllIllIII = ((Iterator<StructureComponent>)lllllllllllllIIIIllIIIIIllIIllII).next();
            lllllllllllllIIIIllIIIIIllIllIII.func_181138_a(StructureStart.lIlIllIlllllll[0], lllllllllllllIIIIllIIIIIllIllIIl, StructureStart.lIlIllIlllllll[0]);
        }
    }
    
    private static String llllIIlIlIlllII(final String lllllllllllllIIIIllIIIIIIllIIlII, final String lllllllllllllIIIIllIIIIIIllIIIll) {
        try {
            final SecretKeySpec lllllllllllllIIIIllIIIIIIllIlIIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIIIIllIIIIIIllIIIll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lllllllllllllIIIIllIIIIIIllIIlll = Cipher.getInstance("Blowfish");
            lllllllllllllIIIIllIIIIIIllIIlll.init(StructureStart.lIlIllIlllllll[2], lllllllllllllIIIIllIIIIIIllIlIIl);
            return new String(lllllllllllllIIIIllIIIIIIllIIlll.doFinal(Base64.getDecoder().decode(lllllllllllllIIIIllIIIIIIllIIlII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIIIllIIIIIIllIIlIl) {
            lllllllllllllIIIIllIIIIIIllIIlIl.printStackTrace();
            return null;
        }
    }
    
    private static String llllIIlIlIlllIl(final String lllllllllllllIIIIllIIIIIlIlIlIII, final String lllllllllllllIIIIllIIIIIlIlIIlll) {
        try {
            final SecretKeySpec lllllllllllllIIIIllIIIIIlIlIllIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIIIIllIIIIIlIlIIlll.getBytes(StandardCharsets.UTF_8)), StructureStart.lIlIllIlllllll[8]), "DES");
            final Cipher lllllllllllllIIIIllIIIIIlIlIllII = Cipher.getInstance("DES");
            lllllllllllllIIIIllIIIIIlIlIllII.init(StructureStart.lIlIllIlllllll[2], lllllllllllllIIIIllIIIIIlIlIllIl);
            return new String(lllllllllllllIIIIllIIIIIlIlIllII.doFinal(Base64.getDecoder().decode(lllllllllllllIIIIllIIIIIlIlIlIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIIIllIIIIIlIlIlIll) {
            lllllllllllllIIIIllIIIIIlIlIlIll.printStackTrace();
            return null;
        }
    }
    
    public StructureStart() {
        this.components = new LinkedList<StructureComponent>();
    }
    
    private static void llllIIlIllIIIII() {
        (lIlIllIlllllll = new int[11])[0] = ((0x98 ^ 0xB0) & ~(0x9F ^ 0xB7));
        StructureStart.lIlIllIlllllll[1] = " ".length();
        StructureStart.lIlIllIlllllll[2] = "  ".length();
        StructureStart.lIlIllIlllllll[3] = "   ".length();
        StructureStart.lIlIllIlllllll[4] = (0x48 ^ 0x4C);
        StructureStart.lIlIllIlllllll[5] = (0x29 ^ 0x2C);
        StructureStart.lIlIllIlllllll[6] = (0x46 ^ 0x6C ^ (0x9E ^ 0xB2));
        StructureStart.lIlIllIlllllll[7] = (0xC1 ^ 0xC6);
        StructureStart.lIlIllIlllllll[8] = (0x5D ^ 0x55);
        StructureStart.lIlIllIlllllll[9] = (80 + 139 - 210 + 154 ^ 49 + 91 - 126 + 156);
        StructureStart.lIlIllIlllllll[10] = (0x48 ^ 0x42);
    }
    
    public int getChunkPosX() {
        return this.chunkPosX;
    }
    
    public void generateStructure(final World lllllllllllllIIIIllIIIIlIIllIlll, final Random lllllllllllllIIIIllIIIIlIIllIllI, final StructureBoundingBox lllllllllllllIIIIllIIIIlIIllIlIl) {
        final Iterator<StructureComponent> lllllllllllllIIIIllIIIIlIIlllIlI = this.components.iterator();
        "".length();
        if (" ".length() != " ".length()) {
            return;
        }
        while (!llllIIlIllIIIlI(lllllllllllllIIIIllIIIIlIIlllIlI.hasNext() ? 1 : 0)) {
            final StructureComponent lllllllllllllIIIIllIIIIlIIlllIIl = lllllllllllllIIIIllIIIIlIIlllIlI.next();
            if (llllIIlIllIIIIl(lllllllllllllIIIIllIIIIlIIlllIIl.getBoundingBox().intersectsWith(lllllllllllllIIIIllIIIIlIIllIlIl) ? 1 : 0) && llllIIlIllIIIlI(lllllllllllllIIIIllIIIIlIIlllIIl.addComponentParts(lllllllllllllIIIIllIIIIlIIllIlll, lllllllllllllIIIIllIIIIlIIllIllI, lllllllllllllIIIIllIIIIlIIllIlIl) ? 1 : 0)) {
                lllllllllllllIIIIllIIIIlIIlllIlI.remove();
            }
        }
    }
    
    private static boolean llllIIlIllIIlIl(final int lllllllllllllIIIIllIIIIIIlIIlIlI, final int lllllllllllllIIIIllIIIIIIlIIlIIl) {
        return lllllllllllllIIIIllIIIIIIlIIlIlI > lllllllllllllIIIIllIIIIIIlIIlIIl;
    }
    
    public boolean isSizeableStructure() {
        return StructureStart.lIlIllIlllllll[1] != 0;
    }
    
    private static boolean llllIIlIllIIIll(final int lllllllllllllIIIIllIIIIIIlIllIlI, final int lllllllllllllIIIIllIIIIIIlIllIII) {
        return lllllllllllllIIIIllIIIIIIlIllIlI >= lllllllllllllIIIIllIIIIIIlIllIII;
    }
    
    private static String llllIIlIlIllIll(String lllllllllllllIIIIllIIIIIlIIIIIll, final String lllllllllllllIIIIllIIIIIlIIIlIlI) {
        lllllllllllllIIIIllIIIIIlIIIIIll = (double)new String(Base64.getDecoder().decode(((String)lllllllllllllIIIIllIIIIIlIIIIIll).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIIIIllIIIIIlIIIlIII = new StringBuilder();
        final char[] lllllllllllllIIIIllIIIIIlIIIIllI = lllllllllllllIIIIllIIIIIlIIIlIlI.toCharArray();
        int lllllllllllllIIIIllIIIIIlIIIIlIl = StructureStart.lIlIllIlllllll[0];
        final byte lllllllllllllIIIIllIIIIIIlllllII = (Object)((String)lllllllllllllIIIIllIIIIIlIIIIIll).toCharArray();
        final Exception lllllllllllllIIIIllIIIIIIllllIlI = (Exception)lllllllllllllIIIIllIIIIIIlllllII.length;
        int lllllllllllllIIIIllIIIIIIllllIII = StructureStart.lIlIllIlllllll[0];
        while (llllIIlIllIIlII(lllllllllllllIIIIllIIIIIIllllIII, (int)lllllllllllllIIIIllIIIIIIllllIlI)) {
            final char lllllllllllllIIIIllIIIIIlIIIllIl = lllllllllllllIIIIllIIIIIIlllllII[lllllllllllllIIIIllIIIIIIllllIII];
            lllllllllllllIIIIllIIIIIlIIIlIII.append((char)(lllllllllllllIIIIllIIIIIlIIIllIl ^ lllllllllllllIIIIllIIIIIlIIIIllI[lllllllllllllIIIIllIIIIIlIIIIlIl % lllllllllllllIIIIllIIIIIlIIIIllI.length]));
            "".length();
            ++lllllllllllllIIIIllIIIIIlIIIIlIl;
            ++lllllllllllllIIIIllIIIIIIllllIII;
            "".length();
            if (((0xBC ^ 0xA8 ^ (0xA ^ 0x10)) & (0xFA ^ 0x80 ^ (0x54 ^ 0x20) ^ -" ".length())) > ((0xD4 ^ 0xC3 ^ (0xE7 ^ 0xC6)) & (0x95 ^ 0xA7 ^ (0x82 ^ 0x86) ^ -" ".length()))) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIIIIllIIIIIlIIIlIII);
    }
}
