// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.village;

import net.minecraft.world.WorldProvider;
import net.minecraft.util.EnumFacing;
import net.minecraft.world.IBlockAccess;
import java.util.Iterator;
import net.minecraft.util.Vec3i;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.BlockDoor;
import com.google.common.collect.Lists;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import net.minecraft.nbt.NBTBase;
import net.minecraft.nbt.NBTTagList;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.BlockPos;
import java.util.List;
import net.minecraft.world.World;
import net.minecraft.world.WorldSavedData;

public class VillageCollection extends WorldSavedData
{
    private /* synthetic */ World worldObj;
    private final /* synthetic */ List<Village> villageList;
    private final /* synthetic */ List<BlockPos> villagerPositionsList;
    private final /* synthetic */ List<VillageDoorInfo> newDoors;
    private /* synthetic */ int tickCounter;
    private static final /* synthetic */ String[] lIIllIIIIlIllI;
    private static final /* synthetic */ int[] lIIllIIIIllIIl;
    
    @Override
    public void readFromNBT(final NBTTagCompound lllllllllllllIIlIllIllIIIIllllIl) {
        this.tickCounter = lllllllllllllIIlIllIllIIIIllllIl.getInteger(VillageCollection.lIIllIIIIlIllI[VillageCollection.lIIllIIIIllIIl[3]]);
        final NBTTagList lllllllllllllIIlIllIllIIIlIIIIlI = lllllllllllllIIlIllIllIIIIllllIl.getTagList(VillageCollection.lIIllIIIIlIllI[VillageCollection.lIIllIIIIllIIl[1]], VillageCollection.lIIllIIIIllIIl[8]);
        int lllllllllllllIIlIllIllIIIlIIIIIl = VillageCollection.lIIllIIIIllIIl[3];
        "".length();
        if (-"   ".length() >= 0) {
            return;
        }
        while (!llIlIlIlllIllIl(lllllllllllllIIlIllIllIIIlIIIIIl, lllllllllllllIIlIllIllIIIlIIIIlI.tagCount())) {
            final NBTTagCompound lllllllllllllIIlIllIllIIIlIIIIII = lllllllllllllIIlIllIllIIIlIIIIlI.getCompoundTagAt(lllllllllllllIIlIllIllIIIlIIIIIl);
            final Village lllllllllllllIIlIllIllIIIIllllll = new Village();
            lllllllllllllIIlIllIllIIIIllllll.readVillageDataFromNBT(lllllllllllllIIlIllIllIIIlIIIIII);
            this.villageList.add(lllllllllllllIIlIllIllIIIIllllll);
            "".length();
            ++lllllllllllllIIlIllIllIIIlIIIIIl;
        }
    }
    
    @Override
    public void writeToNBT(final NBTTagCompound lllllllllllllIIlIllIllIIIIllIIIl) {
        lllllllllllllIIlIllIllIIIIllIIIl.setInteger(VillageCollection.lIIllIIIIlIllI[VillageCollection.lIIllIIIIllIIl[9]], this.tickCounter);
        final NBTTagList lllllllllllllIIlIllIllIIIIllIIII = new NBTTagList();
        final Exception lllllllllllllIIlIllIllIIIIlIlIIl = (Exception)this.villageList.iterator();
        "".length();
        if (((44 + 21 + 8 + 55 ^ 69 + 127 - 111 + 72) & (8 + 107 - 23 + 95 ^ 121 + 40 + 3 + 2 ^ -" ".length())) != 0x0) {
            return;
        }
        while (!llIlIlIlllIIllI(((Iterator)lllllllllllllIIlIllIllIIIIlIlIIl).hasNext() ? 1 : 0)) {
            final Village lllllllllllllIIlIllIllIIIIlIllll = ((Iterator<Village>)lllllllllllllIIlIllIllIIIIlIlIIl).next();
            final NBTTagCompound lllllllllllllIIlIllIllIIIIlIlllI = new NBTTagCompound();
            lllllllllllllIIlIllIllIIIIlIllll.writeVillageDataToNBT(lllllllllllllIIlIllIllIIIIlIlllI);
            lllllllllllllIIlIllIllIIIIllIIII.appendTag(lllllllllllllIIlIllIllIIIIlIlllI);
        }
        lllllllllllllIIlIllIllIIIIllIIIl.setTag(VillageCollection.lIIllIIIIlIllI[VillageCollection.lIIllIIIIllIIl[10]], lllllllllllllIIlIllIllIIIIllIIII);
    }
    
    private VillageDoorInfo checkDoorExistence(final BlockPos lllllllllllllIIlIllIllIIlIIIIllI) {
        char lllllllllllllIIlIllIllIIlIIIIlII = (char)this.newDoors.iterator();
        "".length();
        if ("   ".length() <= -" ".length()) {
            return null;
        }
        while (!llIlIlIlllIIllI(((Iterator)lllllllllllllIIlIllIllIIlIIIIlII).hasNext() ? 1 : 0)) {
            final VillageDoorInfo lllllllllllllIIlIllIllIIlIIIlIlI = ((Iterator<VillageDoorInfo>)lllllllllllllIIlIllIllIIlIIIIlII).next();
            if (llIlIlIlllIlllI(lllllllllllllIIlIllIllIIlIIIlIlI.getDoorBlockPos().getX(), lllllllllllllIIlIllIllIIlIIIIllI.getX()) && llIlIlIlllIlllI(lllllllllllllIIlIllIllIIlIIIlIlI.getDoorBlockPos().getZ(), lllllllllllllIIlIllIllIIlIIIIllI.getZ()) && llIlIlIlllIIlll(Math.abs(lllllllllllllIIlIllIllIIlIIIlIlI.getDoorBlockPos().getY() - lllllllllllllIIlIllIllIIlIIIIllI.getY()), VillageCollection.lIIllIIIIllIIl[1])) {
                return lllllllllllllIIlIllIllIIlIIIlIlI;
            }
        }
        lllllllllllllIIlIllIllIIlIIIIlII = (char)this.villageList.iterator();
        "".length();
        if (null != null) {
            return null;
        }
        while (!llIlIlIlllIIllI(((Iterator)lllllllllllllIIlIllIllIIlIIIIlII).hasNext() ? 1 : 0)) {
            final Village lllllllllllllIIlIllIllIIlIIIlIIl = ((Iterator<Village>)lllllllllllllIIlIllIllIIlIIIIlII).next();
            final VillageDoorInfo lllllllllllllIIlIllIllIIlIIIlIII = lllllllllllllIIlIllIllIIlIIIlIIl.getExistedDoor(lllllllllllllIIlIllIllIIlIIIIllI);
            if (llIlIlIlllIllll(lllllllllllllIIlIllIllIIlIIIlIII)) {
                return lllllllllllllIIlIllIllIIlIIIlIII;
            }
        }
        return null;
    }
    
    private static String llIlIlIlllIIIlI(final String lllllllllllllIIlIllIlIllllllIllI, final String lllllllllllllIIlIllIlIllllllIlIl) {
        try {
            final SecretKeySpec lllllllllllllIIlIllIlIlllllllIll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIIlIllIlIllllllIlIl.getBytes(StandardCharsets.UTF_8)), VillageCollection.lIIllIIIIllIIl[11]), "DES");
            final Cipher lllllllllllllIIlIllIlIlllllllIlI = Cipher.getInstance("DES");
            lllllllllllllIIlIllIlIlllllllIlI.init(VillageCollection.lIIllIIIIllIIl[9], lllllllllllllIIlIllIlIlllllllIll);
            return new String(lllllllllllllIIlIllIlIlllllllIlI.doFinal(Base64.getDecoder().decode(lllllllllllllIIlIllIlIllllllIllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIlIllIlIlllllllIIl) {
            lllllllllllllIIlIllIlIlllllllIIl.printStackTrace();
            return null;
        }
    }
    
    public VillageCollection(final World lllllllllllllIIlIllIllIIlllllllI) {
        super(fileNameForProvider(lllllllllllllIIlIllIllIIlllllllI.provider));
        this.villagerPositionsList = (List<BlockPos>)Lists.newArrayList();
        this.newDoors = (List<VillageDoorInfo>)Lists.newArrayList();
        this.villageList = (List<Village>)Lists.newArrayList();
        this.worldObj = lllllllllllllIIlIllIllIIlllllllI;
        this.markDirty();
    }
    
    private void dropOldestVillagerPosition() {
        if (llIlIlIlllIIllI(this.villagerPositionsList.isEmpty() ? 1 : 0)) {
            this.addDoorsAround(this.villagerPositionsList.remove(VillageCollection.lIIllIIIIllIIl[3]));
        }
    }
    
    private boolean isWoodDoor(final BlockPos lllllllllllllIIlIllIllIIIlIIllll) {
        final Block lllllllllllllIIlIllIllIIIlIIlllI = this.worldObj.getBlockState(lllllllllllllIIlIllIllIIIlIIllll).getBlock();
        int n;
        if (llIlIlIlllIlIII((lllllllllllllIIlIllIllIIIlIIlllI instanceof BlockDoor) ? 1 : 0)) {
            if (llIlIlIllllIIll(lllllllllllllIIlIllIllIIIlIIlllI.getMaterial(), Material.wood)) {
                n = VillageCollection.lIIllIIIIllIIl[1];
                "".length();
                if ("  ".length() <= 0) {
                    return ((32 + 90 - 110 + 141 ^ 115 + 59 - 53 + 25) & (0x18 ^ 0xC ^ (0xA4 ^ 0xBB) ^ -" ".length())) != 0x0;
                }
            }
            else {
                n = VillageCollection.lIIllIIIIllIIl[3];
                "".length();
                if (((0xC1 ^ 0x9D) & ~(0x64 ^ 0x38)) < 0) {
                    return ((0xB8 ^ 0x8D) & ~(0x8 ^ 0x3D)) != 0x0;
                }
            }
        }
        else {
            n = VillageCollection.lIIllIIIIllIIl[3];
        }
        return n != 0;
    }
    
    private static void llIlIlIlllIIlII() {
        (lIIllIIIIlIllI = new String[VillageCollection.lIIllIIIIllIIl[7]])[VillageCollection.lIIllIIIIllIIl[3]] = llIlIlIlllIIIIl("PCYIEg==", "hOkyH");
        VillageCollection.lIIllIIIIlIllI[VillageCollection.lIIllIIIIllIIl[1]] = llIlIlIlllIIIlI("dEb6svfzH3RPAz5Ro52XNA==", "GwedO");
        VillageCollection.lIIllIIIIlIllI[VillageCollection.lIIllIIIIllIIl[9]] = llIlIlIlllIIIlI("hrTZlGkhL0o=", "ZMaJA");
        VillageCollection.lIIllIIIIlIllI[VillageCollection.lIIllIIIIllIIl[10]] = llIlIlIlllIIIIl("GBEnDykpHTg=", "NxKcH");
        VillageCollection.lIIllIIIIlIllI[VillageCollection.lIIllIIIIllIIl[6]] = llIlIlIlllIIIll("JOIeHdlDT8/DJkA5SMNwGA==", "TnfdM");
    }
    
    public Village getNearestVillage(final BlockPos lllllllllllllIIlIllIllIIllIIlllI, final int lllllllllllllIIlIllIllIIllIIIlIl) {
        Village lllllllllllllIIlIllIllIIllIIllII = null;
        double lllllllllllllIIlIllIllIIllIIlIll = 3.4028234663852886E38;
        final String lllllllllllllIIlIllIllIIllIIIIIl = (String)this.villageList.iterator();
        "".length();
        if (null != null) {
            return null;
        }
        while (!llIlIlIlllIIllI(((Iterator)lllllllllllllIIlIllIllIIllIIIIIl).hasNext() ? 1 : 0)) {
            final Village lllllllllllllIIlIllIllIIllIIlIlI = ((Iterator<Village>)lllllllllllllIIlIllIllIIllIIIIIl).next();
            final double lllllllllllllIIlIllIllIIllIIlIIl = lllllllllllllIIlIllIllIIllIIlIlI.getCenter().distanceSq(lllllllllllllIIlIllIllIIllIIlllI);
            if (llIlIlIlllIlIlI(llIlIlIlllIlIIl(lllllllllllllIIlIllIllIIllIIlIIl, lllllllllllllIIlIllIllIIllIIlIll))) {
                final float lllllllllllllIIlIllIllIIllIIlIII = (float)(lllllllllllllIIlIllIllIIllIIIlIl + lllllllllllllIIlIllIllIIllIIlIlI.getVillageRadius());
                if (!llIlIlIlllIlIll(llIlIlIlllIlIIl(lllllllllllllIIlIllIllIIllIIlIIl, lllllllllllllIIlIllIllIIllIIlIII * lllllllllllllIIlIllIllIIllIIlIII))) {
                    continue;
                }
                lllllllllllllIIlIllIllIIllIIllII = lllllllllllllIIlIllIllIIllIIlIlI;
                lllllllllllllIIlIllIllIIllIIlIll = lllllllllllllIIlIllIllIIllIIlIIl;
            }
        }
        return lllllllllllllIIlIllIllIIllIIllII;
    }
    
    private static boolean llIlIlIlllIlllI(final int lllllllllllllIIlIllIlIllllllIIII, final int lllllllllllllIIlIllIlIlllllIllll) {
        return lllllllllllllIIlIllIlIllllllIIII == lllllllllllllIIlIllIlIlllllIllll;
    }
    
    private void addNewDoorsToVillageOrCreateVillage() {
        int lllllllllllllIIlIllIllIIlIllIllI = VillageCollection.lIIllIIIIllIIl[3];
        "".length();
        if (-"  ".length() > 0) {
            return;
        }
        while (!llIlIlIlllIllIl(lllllllllllllIIlIllIllIIlIllIllI, this.newDoors.size())) {
            final VillageDoorInfo lllllllllllllIIlIllIllIIlIllIlIl = this.newDoors.get(lllllllllllllIIlIllIllIIlIllIllI);
            Village lllllllllllllIIlIllIllIIlIllIlII = this.getNearestVillage(lllllllllllllIIlIllIllIIlIllIlIl.getDoorBlockPos(), VillageCollection.lIIllIIIIllIIl[4]);
            if (llIlIlIlllIllII(lllllllllllllIIlIllIllIIlIllIlII)) {
                lllllllllllllIIlIllIllIIlIllIlII = new Village(this.worldObj);
                this.villageList.add(lllllllllllllIIlIllIllIIlIllIlII);
                "".length();
                this.markDirty();
            }
            lllllllllllllIIlIllIllIIlIllIlII.addVillageDoorInfo(lllllllllllllIIlIllIllIIlIllIlIl);
            ++lllllllllllllIIlIllIllIIlIllIllI;
        }
        this.newDoors.clear();
    }
    
    private static boolean llIlIlIlllIlIll(final int lllllllllllllIIlIllIlIllllIIllll) {
        return lllllllllllllIIlIllIlIllllIIllll <= 0;
    }
    
    private static String llIlIlIlllIIIIl(String lllllllllllllIIlIllIllIIIIIlIlIl, final String lllllllllllllIIlIllIllIIIIIlIlII) {
        lllllllllllllIIlIllIllIIIIIlIlIl = (Exception)new String(Base64.getDecoder().decode(((String)lllllllllllllIIlIllIllIIIIIlIlIl).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIIlIllIllIIIIIllIII = new StringBuilder();
        final char[] lllllllllllllIIlIllIllIIIIIlIlll = lllllllllllllIIlIllIllIIIIIlIlII.toCharArray();
        int lllllllllllllIIlIllIllIIIIIlIllI = VillageCollection.lIIllIIIIllIIl[3];
        final String lllllllllllllIIlIllIllIIIIIlIIII = (Object)((String)lllllllllllllIIlIllIllIIIIIlIlIl).toCharArray();
        final String lllllllllllllIIlIllIllIIIIIIllll = (String)lllllllllllllIIlIllIllIIIIIlIIII.length;
        long lllllllllllllIIlIllIllIIIIIIlllI = VillageCollection.lIIllIIIIllIIl[3];
        while (llIlIlIllllIIIl((int)lllllllllllllIIlIllIllIIIIIIlllI, (int)lllllllllllllIIlIllIllIIIIIIllll)) {
            final char lllllllllllllIIlIllIllIIIIIllIll = lllllllllllllIIlIllIllIIIIIlIIII[lllllllllllllIIlIllIllIIIIIIlllI];
            lllllllllllllIIlIllIllIIIIIllIII.append((char)(lllllllllllllIIlIllIllIIIIIllIll ^ lllllllllllllIIlIllIllIIIIIlIlll[lllllllllllllIIlIllIllIIIIIlIllI % lllllllllllllIIlIllIllIIIIIlIlll.length]));
            "".length();
            ++lllllllllllllIIlIllIllIIIIIlIllI;
            ++lllllllllllllIIlIllIllIIIIIIlllI;
            "".length();
            if ("  ".length() < ((0x51 ^ 0x66 ^ (0x30 ^ 0x1C)) & (0x84 ^ 0xAA ^ (0xB9 ^ 0x8C) ^ -" ".length()))) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIIlIllIllIIIIIllIII);
    }
    
    private static int llIlIlIlllIlIIl(final double n, final double n2) {
        return dcmpg(n, n2);
    }
    
    private void removeAnnihilatedVillages() {
        final Iterator<Village> lllllllllllllIIlIllIllIIlllIIIII = this.villageList.iterator();
        "".length();
        if (((0xE ^ 0x59 ^ (0xC1 ^ 0x91)) & (0x52 ^ 0x39 ^ (0x78 ^ 0x14) ^ -" ".length())) < 0) {
            return;
        }
        while (!llIlIlIlllIIllI(lllllllllllllIIlIllIllIIlllIIIII.hasNext() ? 1 : 0)) {
            final Village lllllllllllllIIlIllIllIIllIlllll = lllllllllllllIIlIllIllIIlllIIIII.next();
            if (llIlIlIlllIlIII(lllllllllllllIIlIllIllIIllIlllll.isAnnihilated() ? 1 : 0)) {
                lllllllllllllIIlIllIllIIlllIIIII.remove();
                this.markDirty();
            }
        }
    }
    
    static {
        llIlIlIlllIIlIl();
        llIlIlIlllIIlII();
    }
    
    private static boolean llIlIlIlllIllII(final Object lllllllllllllIIlIllIlIllllIlIlll) {
        return lllllllllllllIIlIllIlIllllIlIlll == null;
    }
    
    private void addToNewDoorsList(final BlockPos lllllllllllllIIlIllIllIIIllllIll) {
        final EnumFacing lllllllllllllIIlIllIllIIIllllIlI = BlockDoor.getFacing(this.worldObj, lllllllllllllIIlIllIllIIIllllIll);
        final EnumFacing lllllllllllllIIlIllIllIIIllllIIl = lllllllllllllIIlIllIllIIIllllIlI.getOpposite();
        final int lllllllllllllIIlIllIllIIIllllIII = this.countBlocksCanSeeSky(lllllllllllllIIlIllIllIIIllllIll, lllllllllllllIIlIllIllIIIllllIlI, VillageCollection.lIIllIIIIllIIl[7]);
        final int lllllllllllllIIlIllIllIIIlllIlll = this.countBlocksCanSeeSky(lllllllllllllIIlIllIllIIIllllIll, lllllllllllllIIlIllIllIIIllllIIl, lllllllllllllIIlIllIllIIIllllIII + VillageCollection.lIIllIIIIllIIl[1]);
        if (llIlIlIllllIIII(lllllllllllllIIlIllIllIIIllllIII, lllllllllllllIIlIllIllIIIlllIlll)) {
            final List<VillageDoorInfo> newDoors = this.newDoors;
            EnumFacing lllllllllllllIIIllIIllIIlIllllII;
            if (llIlIlIllllIIIl(lllllllllllllIIlIllIllIIIllllIII, lllllllllllllIIlIllIllIIIlllIlll)) {
                lllllllllllllIIIllIIllIIlIllllII = lllllllllllllIIlIllIllIIIllllIlI;
                "".length();
                if (null != null) {
                    return;
                }
            }
            else {
                lllllllllllllIIIllIIllIIlIllllII = lllllllllllllIIlIllIllIIIllllIIl;
            }
            newDoors.add(new VillageDoorInfo(lllllllllllllIIlIllIllIIIllllIll, lllllllllllllIIIllIIllIIlIllllII, this.tickCounter));
            "".length();
        }
    }
    
    private static boolean llIlIlIlllIlIlI(final int lllllllllllllIIlIllIlIllllIlIIIl) {
        return lllllllllllllIIlIllIlIllllIlIIIl < 0;
    }
    
    private static boolean llIlIlIllllIIIl(final int lllllllllllllIIlIllIlIlllllIlIII, final int lllllllllllllIIlIllIlIlllllIIlll) {
        return lllllllllllllIIlIllIlIlllllIlIII < lllllllllllllIIlIllIlIlllllIIlll;
    }
    
    private static boolean llIlIlIllllIIlI(final int lllllllllllllIIlIllIlIlllllIIIII, final int lllllllllllllIIlIllIlIllllIlllll) {
        return lllllllllllllIIlIllIlIlllllIIIII > lllllllllllllIIlIllIlIllllIlllll;
    }
    
    private static boolean llIlIlIllllIIll(final Object lllllllllllllIIlIllIlIllllIllIlI, final Object lllllllllllllIIlIllIlIllllIllIIl) {
        return lllllllllllllIIlIllIlIllllIllIlI == lllllllllllllIIlIllIlIllllIllIIl;
    }
    
    public void setWorldsForAll(final World lllllllllllllIIlIllIllIIlllllIII) {
        this.worldObj = lllllllllllllIIlIllIllIIlllllIII;
        final short lllllllllllllIIlIllIllIIllllIIll = (short)this.villageList.iterator();
        "".length();
        if ((151 + 131 - 133 + 6 ^ 130 + 145 - 183 + 67) <= "   ".length()) {
            return;
        }
        while (!llIlIlIlllIIllI(((Iterator)lllllllllllllIIlIllIllIIllllIIll).hasNext() ? 1 : 0)) {
            final Village lllllllllllllIIlIllIllIIllllIlll = ((Iterator<Village>)lllllllllllllIIlIllIllIIllllIIll).next();
            lllllllllllllIIlIllIllIIllllIlll.setWorld(lllllllllllllIIlIllIllIIlllllIII);
        }
    }
    
    public List<Village> getVillageList() {
        return this.villageList;
    }
    
    private static void llIlIlIlllIIlIl() {
        (lIIllIIIIllIIl = new int[12])[0] = (0x2B ^ 0x6B);
        VillageCollection.lIIllIIIIllIIl[1] = " ".length();
        VillageCollection.lIIllIIIIllIIl[2] = (-(0xFFFFFF7D & 0x7EEF) & (0xFFFFFFFD & 0x7FFE));
        VillageCollection.lIIllIIIIllIIl[3] = ((0x42 ^ 0x70 ^ "   ".length()) & (73 + 131 - 156 + 88 ^ 180 + 24 - 114 + 95 ^ -" ".length()));
        VillageCollection.lIIllIIIIllIIl[4] = (0xF ^ 0x6 ^ (0xE8 ^ 0xC1));
        VillageCollection.lIIllIIIIllIIl[5] = (0xA2 ^ 0xC3 ^ (0x1A ^ 0x6B));
        VillageCollection.lIIllIIIIllIIl[6] = (0x38 ^ 0x3C);
        VillageCollection.lIIllIIIIllIIl[7] = (0xB7 ^ 0xB2);
        VillageCollection.lIIllIIIIllIIl[8] = (0xC5 ^ 0xB5 ^ (0x17 ^ 0x6D));
        VillageCollection.lIIllIIIIllIIl[9] = "  ".length();
        VillageCollection.lIIllIIIIllIIl[10] = "   ".length();
        VillageCollection.lIIllIIIIllIIl[11] = (0x58 ^ 0x7 ^ (0x49 ^ 0x1E));
    }
    
    private static boolean llIlIlIllllIIII(final int lllllllllllllIIlIllIlIllllIIllII, final int lllllllllllllIIlIllIlIllllIIlIll) {
        return lllllllllllllIIlIllIlIllllIIllII != lllllllllllllIIlIllIlIllllIIlIll;
    }
    
    private static boolean llIlIlIlllIllIl(final int lllllllllllllIIlIllIlIlllllIllII, final int lllllllllllllIIlIllIlIlllllIlIll) {
        return lllllllllllllIIlIllIlIlllllIllII >= lllllllllllllIIlIllIlIlllllIlIll;
    }
    
    private static boolean llIlIlIlllIlIII(final int lllllllllllllIIlIllIlIllllIlIlIl) {
        return lllllllllllllIIlIllIlIllllIlIlIl != 0;
    }
    
    private static String llIlIlIlllIIIll(final String lllllllllllllIIlIllIllIIIIIIIlIl, final String lllllllllllllIIlIllIllIIIIIIIlII) {
        try {
            final SecretKeySpec lllllllllllllIIlIllIllIIIIIIlIII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIIlIllIllIIIIIIIlII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lllllllllllllIIlIllIllIIIIIIIlll = Cipher.getInstance("Blowfish");
            lllllllllllllIIlIllIllIIIIIIIlll.init(VillageCollection.lIIllIIIIllIIl[9], lllllllllllllIIlIllIllIIIIIIlIII);
            return new String(lllllllllllllIIlIllIllIIIIIIIlll.doFinal(Base64.getDecoder().decode(lllllllllllllIIlIllIllIIIIIIIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIlIllIllIIIIIIIllI) {
            lllllllllllllIIlIllIllIIIIIIIllI.printStackTrace();
            return null;
        }
    }
    
    public void addToVillagerPositionList(final BlockPos lllllllllllllIIlIllIllIIlllIllll) {
        if (llIlIlIlllIIlll(this.villagerPositionsList.size(), VillageCollection.lIIllIIIIllIIl[0]) && llIlIlIlllIIllI(this.positionInList(lllllllllllllIIlIllIllIIlllIllll) ? 1 : 0)) {
            this.villagerPositionsList.add(lllllllllllllIIlIllIllIIlllIllll);
            "".length();
        }
    }
    
    public static String fileNameForProvider(final WorldProvider lllllllllllllIIlIllIllIIIIlIIlIl) {
        return String.valueOf(new StringBuilder(VillageCollection.lIIllIIIIlIllI[VillageCollection.lIIllIIIIllIIl[6]]).append(lllllllllllllIIlIllIllIIIIlIIlIl.getInternalNameSuffix()));
    }
    
    private boolean positionInList(final BlockPos lllllllllllllIIlIllIllIIIlIlIllI) {
        final double lllllllllllllIIlIllIllIIIlIlIlII = (double)this.villagerPositionsList.iterator();
        "".length();
        if ((0x85 ^ 0x81) != (0x33 ^ 0x37)) {
            return ((0xA ^ 0x58) & ~(0x43 ^ 0x11)) != 0x0;
        }
        while (!llIlIlIlllIIllI(((Iterator)lllllllllllllIIlIllIllIIIlIlIlII).hasNext() ? 1 : 0)) {
            final BlockPos lllllllllllllIIlIllIllIIIlIllIII = ((Iterator<BlockPos>)lllllllllllllIIlIllIllIIIlIlIlII).next();
            if (llIlIlIlllIlIII(lllllllllllllIIlIllIllIIIlIllIII.equals(lllllllllllllIIlIllIllIIIlIlIllI) ? 1 : 0)) {
                return VillageCollection.lIIllIIIIllIIl[1] != 0;
            }
        }
        return VillageCollection.lIIllIIIIllIIl[3] != 0;
    }
    
    private static boolean llIlIlIlllIIlll(final int lllllllllllllIIlIllIlIlllllIIlII, final int lllllllllllllIIlIllIlIlllllIIIll) {
        return lllllllllllllIIlIllIlIlllllIIlII <= lllllllllllllIIlIllIlIlllllIIIll;
    }
    
    private void addDoorsAround(final BlockPos lllllllllllllIIlIllIllIIlIlIIlII) {
        final int lllllllllllllIIlIllIllIIlIlIIIll = VillageCollection.lIIllIIIIllIIl[5];
        final int lllllllllllllIIlIllIllIIlIlIIIlI = VillageCollection.lIIllIIIIllIIl[6];
        final int lllllllllllllIIlIllIllIIlIlIIIIl = VillageCollection.lIIllIIIIllIIl[5];
        int lllllllllllllIIlIllIllIIlIlIIIII = -lllllllllllllIIlIllIllIIlIlIIIll;
        "".length();
        if (((0x2A ^ 0x2D) & ~(0x6D ^ 0x6A)) != 0x0) {
            return;
        }
        while (!llIlIlIlllIllIl(lllllllllllllIIlIllIllIIlIlIIIII, lllllllllllllIIlIllIllIIlIlIIIll)) {
            int lllllllllllllIIlIllIllIIlIIlllll = -lllllllllllllIIlIllIllIIlIlIIIlI;
            "".length();
            if ((0xC4 ^ 0xC0) < " ".length()) {
                return;
            }
            while (!llIlIlIlllIllIl(lllllllllllllIIlIllIllIIlIIlllll, lllllllllllllIIlIllIllIIlIlIIIlI)) {
                int lllllllllllllIIlIllIllIIlIIllllI = -lllllllllllllIIlIllIllIIlIlIIIIl;
                "".length();
                if (((102 + 227 - 160 + 59 ^ 156 + 164 - 175 + 24) & (0x77 ^ 0x23 ^ (0x93 ^ 0x8A) ^ -" ".length())) < 0) {
                    return;
                }
                while (!llIlIlIlllIllIl(lllllllllllllIIlIllIllIIlIIllllI, lllllllllllllIIlIllIllIIlIlIIIIl)) {
                    final BlockPos lllllllllllllIIlIllIllIIlIIlllIl = lllllllllllllIIlIllIllIIlIlIIlII.add(lllllllllllllIIlIllIllIIlIlIIIII, lllllllllllllIIlIllIllIIlIIlllll, lllllllllllllIIlIllIllIIlIIllllI);
                    if (llIlIlIlllIlIII(this.isWoodDoor(lllllllllllllIIlIllIllIIlIIlllIl) ? 1 : 0)) {
                        final VillageDoorInfo lllllllllllllIIlIllIllIIlIIlllII = this.checkDoorExistence(lllllllllllllIIlIllIllIIlIIlllIl);
                        if (llIlIlIlllIllII(lllllllllllllIIlIllIllIIlIIlllII)) {
                            this.addToNewDoorsList(lllllllllllllIIlIllIllIIlIIlllIl);
                            "".length();
                            if (-(62 + 77 - 93 + 97 ^ 80 + 77 - 111 + 93) >= 0) {
                                return;
                            }
                        }
                        else {
                            lllllllllllllIIlIllIllIIlIIlllII.func_179849_a(this.tickCounter);
                        }
                    }
                    ++lllllllllllllIIlIllIllIIlIIllllI;
                }
                ++lllllllllllllIIlIllIllIIlIIlllll;
            }
            ++lllllllllllllIIlIllIllIIlIlIIIII;
        }
    }
    
    private static boolean llIlIlIlllIIllI(final int lllllllllllllIIlIllIlIllllIlIIll) {
        return lllllllllllllIIlIllIlIllllIlIIll == 0;
    }
    
    public VillageCollection(final String lllllllllllllIIlIllIllIlIIIIIlII) {
        super(lllllllllllllIIlIllIllIlIIIIIlII);
        this.villagerPositionsList = (List<BlockPos>)Lists.newArrayList();
        this.newDoors = (List<VillageDoorInfo>)Lists.newArrayList();
        this.villageList = (List<Village>)Lists.newArrayList();
    }
    
    public void tick() {
        this.tickCounter += VillageCollection.lIIllIIIIllIIl[1];
        final double lllllllllllllIIlIllIllIIlllIIlIl = (double)this.villageList.iterator();
        "".length();
        if (((0x99 ^ 0xA7 ^ (0xD6 ^ 0xB5)) & (0x54 ^ 0x5C ^ (0xC7 ^ 0x92) ^ -" ".length())) <= -" ".length()) {
            return;
        }
        while (!llIlIlIlllIIllI(((Iterator)lllllllllllllIIlIllIllIIlllIIlIl).hasNext() ? 1 : 0)) {
            final Village lllllllllllllIIlIllIllIIlllIlIII = ((Iterator<Village>)lllllllllllllIIlIllIllIIlllIIlIl).next();
            lllllllllllllIIlIllIllIIlllIlIII.tick(this.tickCounter);
        }
        this.removeAnnihilatedVillages();
        this.dropOldestVillagerPosition();
        this.addNewDoorsToVillageOrCreateVillage();
        if (llIlIlIlllIIllI(this.tickCounter % VillageCollection.lIIllIIIIllIIl[2])) {
            this.markDirty();
        }
    }
    
    private static boolean llIlIlIlllIllll(final Object lllllllllllllIIlIllIlIllllIlllIl) {
        return lllllllllllllIIlIllIlIllllIlllIl != null;
    }
    
    private int countBlocksCanSeeSky(final BlockPos lllllllllllllIIlIllIllIIIllIIIll, final EnumFacing lllllllllllllIIlIllIllIIIllIIIlI, final int lllllllllllllIIlIllIllIIIllIIIIl) {
        int lllllllllllllIIlIllIllIIIllIIllI = VillageCollection.lIIllIIIIllIIl[3];
        int lllllllllllllIIlIllIllIIIllIIlIl = VillageCollection.lIIllIIIIllIIl[1];
        "".length();
        if (" ".length() == 0) {
            return (0x37 ^ 0x3E) & ~(0x1A ^ 0x13);
        }
        while (!llIlIlIllllIIlI(lllllllllllllIIlIllIllIIIllIIlIl, VillageCollection.lIIllIIIIllIIl[7])) {
            if (llIlIlIlllIlIII(this.worldObj.canSeeSky(lllllllllllllIIlIllIllIIIllIIIll.offset(lllllllllllllIIlIllIllIIIllIIIlI, lllllllllllllIIlIllIllIIIllIIlIl)) ? 1 : 0) && llIlIlIlllIllIl(++lllllllllllllIIlIllIllIIIllIIllI, lllllllllllllIIlIllIllIIIllIIIIl)) {
                return lllllllllllllIIlIllIllIIIllIIllI;
            }
            ++lllllllllllllIIlIllIllIIIllIIlIl;
        }
        return lllllllllllllIIlIllIllIIIllIIllI;
    }
}
