// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.world.gen.structure;

import java.util.Iterator;
import java.util.Arrays;
import net.minecraft.item.ItemDoor;
import net.minecraft.block.BlockDirectional;
import net.minecraft.block.BlockDoor;
import net.minecraft.block.Block;
import net.minecraft.inventory.IInventory;
import net.minecraft.tileentity.TileEntityChest;
import net.minecraft.nbt.NBTBase;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.tileentity.TileEntityDispenser;
import net.minecraft.init.Blocks;
import net.minecraft.util.Vec3i;
import net.minecraft.util.BlockPos;
import net.minecraft.util.WeightedRandomChestContent;
import java.util.Random;
import net.minecraft.world.World;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.List;
import net.minecraft.util.EnumFacing;

public abstract class StructureComponent
{
    private static final /* synthetic */ int[] llIlIIllIllIll;
    protected /* synthetic */ StructureBoundingBox boundingBox;
    private static final /* synthetic */ String[] llIlIIllIllIlI;
    protected /* synthetic */ EnumFacing coordBaseMode;
    private static volatile /* synthetic */ int[] $SWITCH_TABLE$net$minecraft$util$EnumFacing;
    protected /* synthetic */ int componentType;
    
    public static StructureComponent findIntersecting(final List<StructureComponent> llllllllllllIllIlIllllIlIlIllllI, final StructureBoundingBox llllllllllllIllIlIllllIlIlIlllIl) {
        final double llllllllllllIllIlIllllIlIlIllIll = (double)llllllllllllIllIlIllllIlIlIllllI.iterator();
        "".length();
        if ("   ".length() != "   ".length()) {
            return null;
        }
        while (!lIIlIIllIIIIlIII(((Iterator)llllllllllllIllIlIllllIlIlIllIll).hasNext() ? 1 : 0)) {
            final StructureComponent llllllllllllIllIlIllllIlIlIlllll = ((Iterator<StructureComponent>)llllllllllllIllIlIllllIlIlIllIll).next();
            if (lIIlIIllIIIIIlll(llllllllllllIllIlIllllIlIlIlllll.getBoundingBox()) && lIIlIIllIIIIIlIl(llllllllllllIllIlIllllIlIlIlllll.getBoundingBox().intersectsWith(llllllllllllIllIlIllllIlIlIlllIl) ? 1 : 0)) {
                return llllllllllllIllIlIllllIlIlIlllll;
            }
        }
        return null;
    }
    
    private static String lIIlIIlIllllllll(final String llllllllllllIllIlIlllIlIllllIlII, final String llllllllllllIllIlIlllIlIllllIlIl) {
        try {
            final SecretKeySpec llllllllllllIllIlIlllIlIlllllIIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIllIlIlllIlIllllIlIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher llllllllllllIllIlIlllIlIlllllIII = Cipher.getInstance("Blowfish");
            llllllllllllIllIlIlllIlIlllllIII.init(StructureComponent.llIlIIllIllIll[2], llllllllllllIllIlIlllIlIlllllIIl);
            return new String(llllllllllllIllIlIlllIlIlllllIII.doFinal(Base64.getDecoder().decode(llllllllllllIllIlIlllIlIllllIlII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIllIlIlllIlIllllIlll) {
            llllllllllllIllIlIlllIlIllllIlll.printStackTrace();
            return null;
        }
    }
    
    private static void lIIlIIllIIIIIIll() {
        (llIlIIllIllIll = new int[11])[0] = ((83 + 164 - 219 + 163 ^ 68 + 132 - 84 + 23) & (0x56 ^ 0x73 ^ (0xA0 ^ 0xB1) ^ -" ".length()));
        StructureComponent.llIlIIllIllIll[1] = " ".length();
        StructureComponent.llIlIIllIllIll[2] = "  ".length();
        StructureComponent.llIlIIllIllIll[3] = -" ".length();
        StructureComponent.llIlIIllIllIll[4] = "   ".length();
        StructureComponent.llIlIIllIllIll[5] = (66 + 3 + 76 + 21 ^ 125 + 80 - 115 + 72);
        StructureComponent.llIlIIllIllIll[6] = (0x25 ^ 0x20);
        StructureComponent.llIlIIllIllIll[7] = (136 + 120 - 211 + 148 ^ 124 + 179 - 139 + 35);
        StructureComponent.llIlIIllIllIll[8] = (0x40 ^ 0x47);
        StructureComponent.llIlIIllIllIll[9] = 79 + 39 + 23 + 114;
        StructureComponent.llIlIIllIllIll[10] = (0x47 ^ 0x4F);
    }
    
    protected boolean generateDispenserContents(final World llllllllllllIllIlIlllIllIllIIIII, final StructureBoundingBox llllllllllllIllIlIlllIllIlIlllll, final Random llllllllllllIllIlIlllIllIlIlIIlI, final int llllllllllllIllIlIlllIllIlIlllIl, final int llllllllllllIllIlIlllIllIlIlllII, final int llllllllllllIllIlIlllIllIlIIllll, final int llllllllllllIllIlIlllIllIlIIlllI, final List<WeightedRandomChestContent> llllllllllllIllIlIlllIllIlIIllIl, final int llllllllllllIllIlIlllIllIlIIllII) {
        final BlockPos llllllllllllIllIlIlllIllIlIlIlll = new BlockPos(this.getXWithOffset(llllllllllllIllIlIlllIllIlIlllIl, llllllllllllIllIlIlllIllIlIIllll), this.getYWithOffset(llllllllllllIllIlIlllIllIlIlllII), this.getZWithOffset(llllllllllllIllIlIlllIllIlIlllIl, llllllllllllIllIlIlllIllIlIIllll));
        if (lIIlIIllIIIIIlIl(llllllllllllIllIlIlllIllIlIlllll.isVecInside(llllllllllllIllIlIlllIllIlIlIlll) ? 1 : 0) && lIIlIIllIIIIlIll(llllllllllllIllIlIlllIllIllIIIII.getBlockState(llllllllllllIllIlIlllIllIlIlIlll).getBlock(), Blocks.dispenser)) {
            llllllllllllIllIlIlllIllIllIIIII.setBlockState(llllllllllllIllIlIlllIllIlIlIlll, Blocks.dispenser.getStateFromMeta(this.getMetadataWithOffset(Blocks.dispenser, llllllllllllIllIlIlllIllIlIIlllI)), StructureComponent.llIlIIllIllIll[2]);
            "".length();
            final TileEntity llllllllllllIllIlIlllIllIlIlIllI = llllllllllllIllIlIlllIllIllIIIII.getTileEntity(llllllllllllIllIlIlllIllIlIlIlll);
            if (lIIlIIllIIIIIlIl((llllllllllllIllIlIlllIllIlIlIllI instanceof TileEntityDispenser) ? 1 : 0)) {
                WeightedRandomChestContent.generateDispenserContents(llllllllllllIllIlIlllIllIlIlIIlI, llllllllllllIllIlIlllIllIlIIllIl, (TileEntityDispenser)llllllllllllIllIlIlllIllIlIlIllI, llllllllllllIllIlIlllIllIlIIllII);
            }
            return StructureComponent.llIlIIllIllIll[1] != 0;
        }
        return StructureComponent.llIlIIllIllIll[0] != 0;
    }
    
    protected IBlockState getBlockStateFromPos(final World llllllllllllIllIlIllllIIllIllllI, final int llllllllllllIllIlIllllIIlllIIlll, final int llllllllllllIllIlIllllIIlllIIllI, final int llllllllllllIllIlIllllIIlllIIlIl, final StructureBoundingBox llllllllllllIllIlIllllIIllIllIlI) {
        final int llllllllllllIllIlIllllIIlllIIIll = this.getXWithOffset(llllllllllllIllIlIllllIIlllIIlll, llllllllllllIllIlIllllIIlllIIlIl);
        final int llllllllllllIllIlIllllIIlllIIIlI = this.getYWithOffset(llllllllllllIllIlIllllIIlllIIllI);
        final int llllllllllllIllIlIllllIIlllIIIIl = this.getZWithOffset(llllllllllllIllIlIllllIIlllIIlll, llllllllllllIllIlIllllIIlllIIlIl);
        final BlockPos llllllllllllIllIlIllllIIlllIIIII = new BlockPos(llllllllllllIllIlIllllIIlllIIIll, llllllllllllIllIlIllllIIlllIIIlI, llllllllllllIllIlIllllIIlllIIIIl);
        IBlockState blockState;
        if (lIIlIIllIIIIlIII(llllllllllllIllIlIllllIIllIllIlI.isVecInside(llllllllllllIllIlIllllIIlllIIIII) ? 1 : 0)) {
            blockState = Blocks.air.getDefaultState();
            "".length();
            if ("  ".length() <= 0) {
                return null;
            }
        }
        else {
            blockState = llllllllllllIllIlIllllIIllIllllI.getBlockState(llllllllllllIllIlIllllIIlllIIIII);
        }
        return blockState;
    }
    
    protected void fillWithRandomizedBlocks(final World llllllllllllIllIlIllllIIIllIIlIl, final StructureBoundingBox llllllllllllIllIlIllllIIIlllIIll, final int llllllllllllIllIlIllllIIIllIIIll, final int llllllllllllIllIlIllllIIIlllIIIl, final int llllllllllllIllIlIllllIIIlllIIII, final int llllllllllllIllIlIllllIIIllIllll, final int llllllllllllIllIlIllllIIIlIlllll, final int llllllllllllIllIlIllllIIIllIllIl, final boolean llllllllllllIllIlIllllIIIlIlllIl, final Random llllllllllllIllIlIllllIIIlIlllII, final BlockSelector llllllllllllIllIlIllllIIIllIlIlI) {
        int llllllllllllIllIlIllllIIIllIlIIl = llllllllllllIllIlIllllIIIlllIIIl;
        "".length();
        if ("  ".length() != "  ".length()) {
            return;
        }
        while (!lIIlIIllIIIIlIIl(llllllllllllIllIlIllllIIIllIlIIl, llllllllllllIllIlIllllIIIlIlllll)) {
            int llllllllllllIllIlIllllIIIllIlIII = llllllllllllIllIlIllllIIIllIIIll;
            "".length();
            if (-"  ".length() > 0) {
                return;
            }
            while (!lIIlIIllIIIIlIIl(llllllllllllIllIlIllllIIIllIlIII, llllllllllllIllIlIllllIIIllIllll)) {
                int llllllllllllIllIlIllllIIIllIIlll = llllllllllllIllIlIllllIIIlllIIII;
                "".length();
                if ((112 + 63 - 109 + 114 ^ 170 + 61 - 120 + 66) == 0x0) {
                    return;
                }
                while (!lIIlIIllIIIIlIIl(llllllllllllIllIlIllllIIIllIIlll, llllllllllllIllIlIllllIIIllIllIl)) {
                    if (!lIIlIIllIIIIIlIl(llllllllllllIllIlIllllIIIlIlllIl ? 1 : 0) || lIIlIIllIIIIlIll(this.getBlockStateFromPos(llllllllllllIllIlIllllIIIllIIlIl, llllllllllllIllIlIllllIIIllIlIII, llllllllllllIllIlIllllIIIllIlIIl, llllllllllllIllIlIllllIIIllIIlll, llllllllllllIllIlIllllIIIlllIIll).getBlock().getMaterial(), Material.air)) {
                        final int n = llllllllllllIllIlIllllIIIllIlIII;
                        final int n2 = llllllllllllIllIlIllllIIIllIlIIl;
                        final int n3 = llllllllllllIllIlIllllIIIllIIlll;
                        int n4;
                        if (lIIlIIllIIIIllII(llllllllllllIllIlIllllIIIllIlIIl, llllllllllllIllIlIllllIIIlllIIIl) && lIIlIIllIIIIllII(llllllllllllIllIlIllllIIIllIlIIl, llllllllllllIllIlIllllIIIlIlllll) && lIIlIIllIIIIllII(llllllllllllIllIlIllllIIIllIlIII, llllllllllllIllIlIllllIIIllIIIll) && lIIlIIllIIIIllII(llllllllllllIllIlIllllIIIllIlIII, llllllllllllIllIlIllllIIIllIllll) && lIIlIIllIIIIllII(llllllllllllIllIlIllllIIIllIIlll, llllllllllllIllIlIllllIIIlllIIII) && lIIlIIllIIIIllII(llllllllllllIllIlIllllIIIllIIlll, llllllllllllIllIlIllllIIIllIllIl)) {
                            n4 = StructureComponent.llIlIIllIllIll[0];
                            "".length();
                            if (" ".length() <= 0) {
                                return;
                            }
                        }
                        else {
                            n4 = StructureComponent.llIlIIllIllIll[1];
                        }
                        llllllllllllIllIlIllllIIIllIlIlI.selectBlocks(llllllllllllIllIlIllllIIIlIlllII, n, n2, n3, (boolean)(n4 != 0));
                        this.setBlockState(llllllllllllIllIlIllllIIIllIIlIl, llllllllllllIllIlIllllIIIllIlIlI.getBlockState(), llllllllllllIllIlIllllIIIllIlIII, llllllllllllIllIlIllllIIIllIlIIl, llllllllllllIllIlIllllIIIllIIlll, llllllllllllIllIlIllllIIIlllIIll);
                    }
                    ++llllllllllllIllIlIllllIIIllIIlll;
                }
                ++llllllllllllIllIlIllllIIIllIlIII;
            }
            ++llllllllllllIllIlIllllIIIllIlIIl;
        }
    }
    
    private static String lIIlIIllIIIIIIIl(String llllllllllllIllIlIlllIllIIIlIIll, final String llllllllllllIllIlIlllIllIIIlIlll) {
        llllllllllllIllIlIlllIllIIIlIIll = (boolean)new String(Base64.getDecoder().decode(((String)llllllllllllIllIlIlllIllIIIlIIll).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder llllllllllllIllIlIlllIllIIIlIllI = new StringBuilder();
        final char[] llllllllllllIllIlIlllIllIIIlIlIl = llllllllllllIllIlIlllIllIIIlIlll.toCharArray();
        int llllllllllllIllIlIlllIllIIIlIlII = StructureComponent.llIlIIllIllIll[0];
        final byte llllllllllllIllIlIlllIllIIIIlllI = (Object)((String)llllllllllllIllIlIlllIllIIIlIIll).toCharArray();
        final short llllllllllllIllIlIlllIllIIIIllIl = (short)llllllllllllIllIlIlllIllIIIIlllI.length;
        short llllllllllllIllIlIlllIllIIIIllII = (short)StructureComponent.llIlIIllIllIll[0];
        while (lIIlIIllIIIlIlII(llllllllllllIllIlIlllIllIIIIllII, llllllllllllIllIlIlllIllIIIIllIl)) {
            final char llllllllllllIllIlIlllIllIIIllIIl = llllllllllllIllIlIlllIllIIIIlllI[llllllllllllIllIlIlllIllIIIIllII];
            llllllllllllIllIlIlllIllIIIlIllI.append((char)(llllllllllllIllIlIlllIllIIIllIIl ^ llllllllllllIllIlIlllIllIIIlIlIl[llllllllllllIllIlIlllIllIIIlIlII % llllllllllllIllIlIlllIllIIIlIlIl.length]));
            "".length();
            ++llllllllllllIllIlIlllIllIIIlIlII;
            ++llllllllllllIllIlIlllIllIIIIllII;
            "".length();
            if ("  ".length() < 0) {
                return null;
            }
        }
        return String.valueOf(llllllllllllIllIlIlllIllIIIlIllI);
    }
    
    public NBTTagCompound createStructureBaseNBT() {
        final NBTTagCompound llllllllllllIllIlIllllIlIlllllII = new NBTTagCompound();
        llllllllllllIllIlIllllIlIlllllII.setString(StructureComponent.llIlIIllIllIlI[StructureComponent.llIlIIllIllIll[0]], MapGenStructureIO.getStructureComponentName(this));
        llllllllllllIllIlIllllIlIlllllII.setTag(StructureComponent.llIlIIllIllIlI[StructureComponent.llIlIIllIllIll[1]], this.boundingBox.toNBTTagIntArray());
        final NBTTagCompound nbtTagCompound = llllllllllllIllIlIllllIlIlllllII;
        final String lllllllllllllIIIIIlIIIlIIlIIlllI = StructureComponent.llIlIIllIllIlI[StructureComponent.llIlIIllIllIll[2]];
        int horizontalIndex;
        if (lIIlIIllIIIIIlII(this.coordBaseMode)) {
            horizontalIndex = StructureComponent.llIlIIllIllIll[3];
            "".length();
            if (("   ".length() & ("   ".length() ^ -" ".length())) != 0x0) {
                return null;
            }
        }
        else {
            horizontalIndex = this.coordBaseMode.getHorizontalIndex();
        }
        nbtTagCompound.setInteger(lllllllllllllIIIIIlIIIlIIlIIlllI, horizontalIndex);
        llllllllllllIllIlIllllIlIlllllII.setInteger(StructureComponent.llIlIIllIllIlI[StructureComponent.llIlIIllIllIll[4]], this.componentType);
        this.writeStructureToNBT(llllllllllllIllIlIllllIlIlllllII);
        return llllllllllllIllIlIllllIlIlllllII;
    }
    
    protected abstract void writeStructureToNBT(final NBTTagCompound p0);
    
    private static boolean lIIlIIllIIIIlIIl(final int llllllllllllIllIlIlllIlIllIllllI, final int llllllllllllIllIlIlllIlIllIlllIl) {
        return llllllllllllIllIlIlllIlIllIllllI > llllllllllllIllIlIlllIlIllIlllIl;
    }
    
    private static boolean lIIlIIllIIIlIIII(final int llllllllllllIllIlIlllIlIllIIlIll) {
        return llllllllllllIllIlIlllIlIllIIlIll < 0;
    }
    
    protected void randomlyRareFillWithBlocks(final World llllllllllllIllIlIlllIllllIllIlI, final StructureBoundingBox llllllllllllIllIlIlllIllllllIIII, final int llllllllllllIllIlIlllIlllllIllll, final int llllllllllllIllIlIlllIlllllIlllI, final int llllllllllllIllIlIlllIlllllIllIl, final int llllllllllllIllIlIlllIlllllIllII, final int llllllllllllIllIlIlllIllllIlIlII, final int llllllllllllIllIlIlllIllllIlIIll, final IBlockState llllllllllllIllIlIlllIlllllIlIIl, final boolean llllllllllllIllIlIlllIllllIlIIIl) {
        final float llllllllllllIllIlIlllIlllllIIlll = (float)(llllllllllllIllIlIlllIlllllIllII - llllllllllllIllIlIlllIlllllIllll + StructureComponent.llIlIIllIllIll[1]);
        final float llllllllllllIllIlIlllIlllllIIllI = (float)(llllllllllllIllIlIlllIllllIlIlII - llllllllllllIllIlIlllIlllllIlllI + StructureComponent.llIlIIllIllIll[1]);
        final float llllllllllllIllIlIlllIlllllIIlIl = (float)(llllllllllllIllIlIlllIllllIlIIll - llllllllllllIllIlIlllIlllllIllIl + StructureComponent.llIlIIllIllIll[1]);
        final float llllllllllllIllIlIlllIlllllIIlII = llllllllllllIllIlIlllIlllllIllll + llllllllllllIllIlIlllIlllllIIlll / 2.0f;
        final float llllllllllllIllIlIlllIlllllIIIll = llllllllllllIllIlIlllIlllllIllIl + llllllllllllIllIlIlllIlllllIIlIl / 2.0f;
        int llllllllllllIllIlIlllIlllllIIIlI = llllllllllllIllIlIlllIlllllIlllI;
        "".length();
        if (((0x41 ^ 0xC) & ~(0x53 ^ 0x1E)) < 0) {
            return;
        }
        while (!lIIlIIllIIIIlIIl(llllllllllllIllIlIlllIlllllIIIlI, llllllllllllIllIlIlllIllllIlIlII)) {
            final float llllllllllllIllIlIlllIlllllIIIIl = (llllllllllllIllIlIlllIlllllIIIlI - llllllllllllIllIlIlllIlllllIlllI) / llllllllllllIllIlIlllIlllllIIllI;
            int llllllllllllIllIlIlllIlllllIIIII = llllllllllllIllIlIlllIlllllIllll;
            "".length();
            if (-" ".length() >= 0) {
                return;
            }
            while (!lIIlIIllIIIIlIIl(llllllllllllIllIlIlllIlllllIIIII, llllllllllllIllIlIlllIlllllIllII)) {
                final float llllllllllllIllIlIlllIllllIlllll = (llllllllllllIllIlIlllIlllllIIIII - llllllllllllIllIlIlllIlllllIIlII) / (llllllllllllIllIlIlllIlllllIIlll * 0.5f);
                int llllllllllllIllIlIlllIllllIllllI = llllllllllllIllIlIlllIlllllIllIl;
                "".length();
                if (((0x64 ^ 0x24 ^ (0x43 ^ 0x37)) & (0x6E ^ 0x7C ^ (0x58 ^ 0x7E) ^ -" ".length())) != 0x0) {
                    return;
                }
                while (!lIIlIIllIIIIlIIl(llllllllllllIllIlIlllIllllIllllI, llllllllllllIllIlIlllIllllIlIIll)) {
                    final float llllllllllllIllIlIlllIllllIlllIl = (llllllllllllIllIlIlllIllllIllllI - llllllllllllIllIlIlllIlllllIIIll) / (llllllllllllIllIlIlllIlllllIIlIl * 0.5f);
                    if (!lIIlIIllIIIIIlIl(llllllllllllIllIlIlllIllllIlIIIl ? 1 : 0) || lIIlIIllIIIIlIll(this.getBlockStateFromPos(llllllllllllIllIlIlllIllllIllIlI, llllllllllllIllIlIlllIlllllIIIII, llllllllllllIllIlIlllIlllllIIIlI, llllllllllllIllIlIlllIllllIllllI, llllllllllllIllIlIlllIllllllIIII).getBlock().getMaterial(), Material.air)) {
                        final float llllllllllllIllIlIlllIllllIlllII = llllllllllllIllIlIlllIllllIlllll * llllllllllllIllIlIlllIllllIlllll + llllllllllllIllIlIlllIlllllIIIIl * llllllllllllIllIlIlllIlllllIIIIl + llllllllllllIllIlIlllIllllIlllIl * llllllllllllIllIlIlllIllllIlllIl;
                        if (lIIlIIllIIIIlllI(lIIlIIllIIIlIIIl(llllllllllllIllIlIlllIllllIlllII, 1.05f))) {
                            this.setBlockState(llllllllllllIllIlIlllIllllIllIlI, llllllllllllIllIlIlllIlllllIlIIl, llllllllllllIllIlIlllIlllllIIIII, llllllllllllIllIlIlllIlllllIIIlI, llllllllllllIllIlIlllIllllIllllI, llllllllllllIllIlIlllIllllllIIII);
                        }
                    }
                    ++llllllllllllIllIlIlllIllllIllllI;
                }
                ++llllllllllllIllIlIlllIlllllIIIII;
            }
            ++llllllllllllIllIlIlllIlllllIIIlI;
        }
    }
    
    protected boolean isLiquidInStructureBoundingBox(final World llllllllllllIllIlIllllIlIIlllIlI, final StructureBoundingBox llllllllllllIllIlIllllIlIlIIlIIl) {
        final int llllllllllllIllIlIllllIlIlIIlIII = Math.max(this.boundingBox.minX - StructureComponent.llIlIIllIllIll[1], llllllllllllIllIlIllllIlIlIIlIIl.minX);
        final int llllllllllllIllIlIllllIlIlIIIlll = Math.max(this.boundingBox.minY - StructureComponent.llIlIIllIllIll[1], llllllllllllIllIlIllllIlIlIIlIIl.minY);
        final int llllllllllllIllIlIllllIlIlIIIllI = Math.max(this.boundingBox.minZ - StructureComponent.llIlIIllIllIll[1], llllllllllllIllIlIllllIlIlIIlIIl.minZ);
        final int llllllllllllIllIlIllllIlIlIIIlIl = Math.min(this.boundingBox.maxX + StructureComponent.llIlIIllIllIll[1], llllllllllllIllIlIllllIlIlIIlIIl.maxX);
        final int llllllllllllIllIlIllllIlIlIIIlII = Math.min(this.boundingBox.maxY + StructureComponent.llIlIIllIllIll[1], llllllllllllIllIlIllllIlIlIIlIIl.maxY);
        final int llllllllllllIllIlIllllIlIlIIIIll = Math.min(this.boundingBox.maxZ + StructureComponent.llIlIIllIllIll[1], llllllllllllIllIlIllllIlIlIIlIIl.maxZ);
        final BlockPos.MutableBlockPos llllllllllllIllIlIllllIlIlIIIIlI = new BlockPos.MutableBlockPos();
        int llllllllllllIllIlIllllIlIlIIIIIl = llllllllllllIllIlIllllIlIlIIlIII;
        "".length();
        if ("   ".length() <= -" ".length()) {
            return ((0x61 ^ 0x5C) & ~(0x90 ^ 0xAD)) != 0x0;
        }
        while (!lIIlIIllIIIIlIIl(llllllllllllIllIlIllllIlIlIIIIIl, llllllllllllIllIlIllllIlIlIIIlIl)) {
            int llllllllllllIllIlIllllIlIlIIIIII = llllllllllllIllIlIllllIlIlIIIllI;
            "".length();
            if (((0x9 ^ 0x1F) & ~(0x4B ^ 0x5D) & ~((0xE1 ^ 0xBC) & ~(0xC8 ^ 0x95))) >= " ".length()) {
                return ((0x28 ^ 0x6D) & ~(0x2F ^ 0x6A)) != 0x0;
            }
            while (!lIIlIIllIIIIlIIl(llllllllllllIllIlIllllIlIlIIIIII, llllllllllllIllIlIllllIlIlIIIIll)) {
                if (lIIlIIllIIIIIlIl(llllllllllllIllIlIllllIlIIlllIlI.getBlockState(llllllllllllIllIlIllllIlIlIIIIlI.func_181079_c(llllllllllllIllIlIllllIlIlIIIIIl, llllllllllllIllIlIllllIlIlIIIlll, llllllllllllIllIlIllllIlIlIIIIII)).getBlock().getMaterial().isLiquid() ? 1 : 0)) {
                    return StructureComponent.llIlIIllIllIll[1] != 0;
                }
                if (lIIlIIllIIIIIlIl(llllllllllllIllIlIllllIlIIlllIlI.getBlockState(llllllllllllIllIlIllllIlIlIIIIlI.func_181079_c(llllllllllllIllIlIllllIlIlIIIIIl, llllllllllllIllIlIllllIlIlIIIlII, llllllllllllIllIlIllllIlIlIIIIII)).getBlock().getMaterial().isLiquid() ? 1 : 0)) {
                    return StructureComponent.llIlIIllIllIll[1] != 0;
                }
                ++llllllllllllIllIlIllllIlIlIIIIII;
            }
            ++llllllllllllIllIlIllllIlIlIIIIIl;
        }
        int llllllllllllIllIlIllllIlIIllllll = llllllllllllIllIlIllllIlIlIIlIII;
        "".length();
        if (-" ".length() == (0xE7 ^ 0xA1 ^ (0x53 ^ 0x11))) {
            return ((0xA8 ^ 0x86 ^ (0x50 ^ 0x5D)) & (84 + 15 - 50 + 83 ^ 77 + 7 - 70 + 153 ^ -" ".length())) != 0x0;
        }
        while (!lIIlIIllIIIIlIIl(llllllllllllIllIlIllllIlIIllllll, llllllllllllIllIlIllllIlIlIIIlIl)) {
            int llllllllllllIllIlIllllIlIIlllllI = llllllllllllIllIlIllllIlIlIIIlll;
            "".length();
            if ((0x50 ^ 0x3B ^ (0xAE ^ 0xC1)) < (108 + 144 - 197 + 122 ^ 33 + 85 + 39 + 24)) {
                return ((0xDB ^ 0x9C ^ (0x6C ^ 0x17)) & (0x84 ^ 0xB7 ^ (0x5 ^ 0xA) ^ -" ".length())) != 0x0;
            }
            while (!lIIlIIllIIIIlIIl(llllllllllllIllIlIllllIlIIlllllI, llllllllllllIllIlIllllIlIlIIIlII)) {
                if (lIIlIIllIIIIIlIl(llllllllllllIllIlIllllIlIIlllIlI.getBlockState(llllllllllllIllIlIllllIlIlIIIIlI.func_181079_c(llllllllllllIllIlIllllIlIIllllll, llllllllllllIllIlIllllIlIIlllllI, llllllllllllIllIlIllllIlIlIIIllI)).getBlock().getMaterial().isLiquid() ? 1 : 0)) {
                    return StructureComponent.llIlIIllIllIll[1] != 0;
                }
                if (lIIlIIllIIIIIlIl(llllllllllllIllIlIllllIlIIlllIlI.getBlockState(llllllllllllIllIlIllllIlIlIIIIlI.func_181079_c(llllllllllllIllIlIllllIlIIllllll, llllllllllllIllIlIllllIlIIlllllI, llllllllllllIllIlIllllIlIlIIIIll)).getBlock().getMaterial().isLiquid() ? 1 : 0)) {
                    return StructureComponent.llIlIIllIllIll[1] != 0;
                }
                ++llllllllllllIllIlIllllIlIIlllllI;
            }
            ++llllllllllllIllIlIllllIlIIllllll;
        }
        int llllllllllllIllIlIllllIlIIllllIl = llllllllllllIllIlIllllIlIlIIIllI;
        "".length();
        if (null != null) {
            return ((0x8C ^ 0x89) & ~(0x84 ^ 0x81)) != 0x0;
        }
        while (!lIIlIIllIIIIlIIl(llllllllllllIllIlIllllIlIIllllIl, llllllllllllIllIlIllllIlIlIIIIll)) {
            int llllllllllllIllIlIllllIlIIllllII = llllllllllllIllIlIllllIlIlIIIlll;
            "".length();
            if ("   ".length() == 0) {
                return ((0xE7 ^ 0xA4) & ~(0xC6 ^ 0x85)) != 0x0;
            }
            while (!lIIlIIllIIIIlIIl(llllllllllllIllIlIllllIlIIllllII, llllllllllllIllIlIllllIlIlIIIlII)) {
                if (lIIlIIllIIIIIlIl(llllllllllllIllIlIllllIlIIlllIlI.getBlockState(llllllllllllIllIlIllllIlIlIIIIlI.func_181079_c(llllllllllllIllIlIllllIlIlIIlIII, llllllllllllIllIlIllllIlIIllllII, llllllllllllIllIlIllllIlIIllllIl)).getBlock().getMaterial().isLiquid() ? 1 : 0)) {
                    return StructureComponent.llIlIIllIllIll[1] != 0;
                }
                if (lIIlIIllIIIIIlIl(llllllllllllIllIlIllllIlIIlllIlI.getBlockState(llllllllllllIllIlIllllIlIlIIIIlI.func_181079_c(llllllllllllIllIlIllllIlIlIIIlIl, llllllllllllIllIlIllllIlIIllllII, llllllllllllIllIlIllllIlIIllllIl)).getBlock().getMaterial().isLiquid() ? 1 : 0)) {
                    return StructureComponent.llIlIIllIllIll[1] != 0;
                }
                ++llllllllllllIllIlIllllIlIIllllII;
            }
            ++llllllllllllIllIlIllllIlIIllllIl;
        }
        return StructureComponent.llIlIIllIllIll[0] != 0;
    }
    
    private static boolean lIIlIIllIIIlIlII(final int llllllllllllIllIlIlllIlIlllIIllI, final int llllllllllllIllIlIlllIlIlllIIlIl) {
        return llllllllllllIllIlIlllIlIlllIIllI < llllllllllllIllIlIlllIlIlllIIlIl;
    }
    
    private static boolean lIIlIIllIIIlIIlI(final int llllllllllllIllIlIlllIlIlllIlIlI, final int llllllllllllIllIlIlllIlIlllIlIIl) {
        return llllllllllllIllIlIlllIlIlllIlIlI >= llllllllllllIllIlIlllIlIlllIlIIl;
    }
    
    private static boolean lIIlIIllIIIIlIll(final Object llllllllllllIllIlIlllIlIllIllIlI, final Object llllllllllllIllIlIlllIlIllIllIIl) {
        return llllllllllllIllIlIlllIlIllIllIlI != llllllllllllIllIlIlllIlIllIllIIl;
    }
    
    public void func_181138_a(final int llllllllllllIllIlIlllIllIIlIlIll, final int llllllllllllIllIlIlllIllIIlIIllI, final int llllllllllllIllIlIlllIllIIlIlIIl) {
        this.boundingBox.offset(llllllllllllIllIlIlllIllIIlIlIll, llllllllllllIllIlIlllIllIIlIIllI, llllllllllllIllIlIlllIllIIlIlIIl);
    }
    
    private static int lIIlIIllIIIIllIl(final float n, final float n2) {
        return fcmpg(n, n2);
    }
    
    protected boolean generateChestContents(final World llllllllllllIllIlIlllIllIllllIII, final StructureBoundingBox llllllllllllIllIlIlllIlllIIIIIll, final Random llllllllllllIllIlIlllIlllIIIIIlI, final int llllllllllllIllIlIlllIlllIIIIIIl, final int llllllllllllIllIlIlllIllIlllIlII, final int llllllllllllIllIlIlllIllIlllllll, final List<WeightedRandomChestContent> llllllllllllIllIlIlllIllIlllIIlI, final int llllllllllllIllIlIlllIllIlllIIIl) {
        final BlockPos llllllllllllIllIlIlllIllIlllllII = new BlockPos(this.getXWithOffset(llllllllllllIllIlIlllIlllIIIIIIl, llllllllllllIllIlIlllIllIlllllll), this.getYWithOffset(llllllllllllIllIlIlllIllIlllIlII), this.getZWithOffset(llllllllllllIllIlIlllIlllIIIIIIl, llllllllllllIllIlIlllIllIlllllll));
        if (lIIlIIllIIIIIlIl(llllllllllllIllIlIlllIlllIIIIIll.isVecInside(llllllllllllIllIlIlllIllIlllllII) ? 1 : 0) && lIIlIIllIIIIlIll(llllllllllllIllIlIlllIllIllllIII.getBlockState(llllllllllllIllIlIlllIllIlllllII).getBlock(), Blocks.chest)) {
            final IBlockState llllllllllllIllIlIlllIllIllllIll = Blocks.chest.getDefaultState();
            llllllllllllIllIlIlllIllIllllIII.setBlockState(llllllllllllIllIlIlllIllIlllllII, Blocks.chest.correctFacing(llllllllllllIllIlIlllIllIllllIII, llllllllllllIllIlIlllIllIlllllII, llllllllllllIllIlIlllIllIllllIll), StructureComponent.llIlIIllIllIll[2]);
            "".length();
            final TileEntity llllllllllllIllIlIlllIllIllllIlI = llllllllllllIllIlIlllIllIllllIII.getTileEntity(llllllllllllIllIlIlllIllIlllllII);
            if (lIIlIIllIIIIIlIl((llllllllllllIllIlIlllIllIllllIlI instanceof TileEntityChest) ? 1 : 0)) {
                WeightedRandomChestContent.generateChestContents(llllllllllllIllIlIlllIlllIIIIIlI, llllllllllllIllIlIlllIllIlllIIlI, (IInventory)llllllllllllIllIlIlllIllIllllIlI, llllllllllllIllIlIlllIllIlllIIIl);
            }
            return StructureComponent.llIlIIllIllIll[1] != 0;
        }
        return StructureComponent.llIlIIllIllIll[0] != 0;
    }
    
    protected void fillWithBlocks(final World llllllllllllIllIlIllllIIlIIlIIlI, final StructureBoundingBox llllllllllllIllIlIllllIIlIIlIIIl, final int llllllllllllIllIlIllllIIlIIlIIII, final int llllllllllllIllIlIllllIIlIIllllI, final int llllllllllllIllIlIllllIIlIIlllIl, final int llllllllllllIllIlIllllIIlIIIllIl, final int llllllllllllIllIlIllllIIlIIIllII, final int llllllllllllIllIlIllllIIlIIllIlI, final IBlockState llllllllllllIllIlIllllIIlIIIlIlI, final IBlockState llllllllllllIllIlIllllIIlIIllIII, final boolean llllllllllllIllIlIllllIIlIIIlIII) {
        int llllllllllllIllIlIllllIIlIIlIllI = llllllllllllIllIlIllllIIlIIllllI;
        "".length();
        if ("   ".length() <= " ".length()) {
            return;
        }
        while (!lIIlIIllIIIIlIIl(llllllllllllIllIlIllllIIlIIlIllI, llllllllllllIllIlIllllIIlIIIllII)) {
            int llllllllllllIllIlIllllIIlIIlIlIl = llllllllllllIllIlIllllIIlIIlIIII;
            "".length();
            if ("  ".length() == -" ".length()) {
                return;
            }
            while (!lIIlIIllIIIIlIIl(llllllllllllIllIlIllllIIlIIlIlIl, llllllllllllIllIlIllllIIlIIIllIl)) {
                int llllllllllllIllIlIllllIIlIIlIlII = llllllllllllIllIlIllllIIlIIlllIl;
                "".length();
                if ("   ".length() < "  ".length()) {
                    return;
                }
                while (!lIIlIIllIIIIlIIl(llllllllllllIllIlIllllIIlIIlIlII, llllllllllllIllIlIllllIIlIIllIlI)) {
                    if (!lIIlIIllIIIIIlIl(llllllllllllIllIlIllllIIlIIIlIII ? 1 : 0) || lIIlIIllIIIIlIll(this.getBlockStateFromPos(llllllllllllIllIlIllllIIlIIlIIlI, llllllllllllIllIlIllllIIlIIlIlIl, llllllllllllIllIlIllllIIlIIlIllI, llllllllllllIllIlIllllIIlIIlIlII, llllllllllllIllIlIllllIIlIIlIIIl).getBlock().getMaterial(), Material.air)) {
                        if (lIIlIIllIIIIllII(llllllllllllIllIlIllllIIlIIlIllI, llllllllllllIllIlIllllIIlIIllllI) && lIIlIIllIIIIllII(llllllllllllIllIlIllllIIlIIlIllI, llllllllllllIllIlIllllIIlIIIllII) && lIIlIIllIIIIllII(llllllllllllIllIlIllllIIlIIlIlIl, llllllllllllIllIlIllllIIlIIlIIII) && lIIlIIllIIIIllII(llllllllllllIllIlIllllIIlIIlIlIl, llllllllllllIllIlIllllIIlIIIllIl) && lIIlIIllIIIIllII(llllllllllllIllIlIllllIIlIIlIlII, llllllllllllIllIlIllllIIlIIlllIl) && lIIlIIllIIIIllII(llllllllllllIllIlIllllIIlIIlIlII, llllllllllllIllIlIllllIIlIIllIlI)) {
                            this.setBlockState(llllllllllllIllIlIllllIIlIIlIIlI, llllllllllllIllIlIllllIIlIIllIII, llllllllllllIllIlIllllIIlIIlIlIl, llllllllllllIllIlIllllIIlIIlIllI, llllllllllllIllIlIllllIIlIIlIlII, llllllllllllIllIlIllllIIlIIlIIIl);
                            "".length();
                            if (-(0x7B ^ 0x7F) >= 0) {
                                return;
                            }
                        }
                        else {
                            this.setBlockState(llllllllllllIllIlIllllIIlIIlIIlI, llllllllllllIllIlIllllIIlIIIlIlI, llllllllllllIllIlIllllIIlIIlIlIl, llllllllllllIllIlIllllIIlIIlIllI, llllllllllllIllIlIllllIIlIIlIlII, llllllllllllIllIlIllllIIlIIlIIIl);
                        }
                    }
                    ++llllllllllllIllIlIllllIIlIIlIlII;
                }
                ++llllllllllllIllIlIllllIIlIIlIlIl;
            }
            ++llllllllllllIllIlIllllIIlIIlIllI;
        }
    }
    
    private static boolean lIIlIIllIIIlIIll(final int llllllllllllIllIlIlllIlIlllIIIlI, final int llllllllllllIllIlIlllIlIlllIIIIl) {
        return llllllllllllIllIlIlllIlIlllIIIlI <= llllllllllllIllIlIlllIlIlllIIIIl;
    }
    
    protected int getMetadataWithOffset(final Block llllllllllllIllIlIllllIlIIIlIIlI, final int llllllllllllIllIlIllllIlIIIlIIIl) {
        if (lIIlIIllIIIIlIlI(llllllllllllIllIlIllllIlIIIlIIlI, Blocks.rail)) {
            if (!lIIlIIllIIIIlIll(this.coordBaseMode, EnumFacing.WEST) || lIIlIIllIIIIlIlI(this.coordBaseMode, EnumFacing.EAST)) {
                if (lIIlIIllIIIIIllI(llllllllllllIllIlIllllIlIIIlIIIl, StructureComponent.llIlIIllIllIll[1])) {
                    return StructureComponent.llIlIIllIllIll[0];
                }
                return StructureComponent.llIlIIllIllIll[1];
            }
        }
        else if (lIIlIIllIIIIIlIl((llllllllllllIllIlIllllIlIIIlIIlI instanceof BlockDoor) ? 1 : 0)) {
            if (lIIlIIllIIIIlIlI(this.coordBaseMode, EnumFacing.SOUTH)) {
                if (lIIlIIllIIIIlIII(llllllllllllIllIlIllllIlIIIlIIIl)) {
                    return StructureComponent.llIlIIllIllIll[2];
                }
                if (lIIlIIllIIIIIllI(llllllllllllIllIlIllllIlIIIlIIIl, StructureComponent.llIlIIllIllIll[2])) {
                    return StructureComponent.llIlIIllIllIll[0];
                }
            }
            else {
                if (lIIlIIllIIIIlIlI(this.coordBaseMode, EnumFacing.WEST)) {
                    return llllllllllllIllIlIllllIlIIIlIIIl + StructureComponent.llIlIIllIllIll[1] & StructureComponent.llIlIIllIllIll[4];
                }
                if (lIIlIIllIIIIlIlI(this.coordBaseMode, EnumFacing.EAST)) {
                    return llllllllllllIllIlIllllIlIIIlIIIl + StructureComponent.llIlIIllIllIll[4] & StructureComponent.llIlIIllIllIll[4];
                }
            }
        }
        else if (lIIlIIllIIIIlIll(llllllllllllIllIlIllllIlIIIlIIlI, Blocks.stone_stairs) && lIIlIIllIIIIlIll(llllllllllllIllIlIllllIlIIIlIIlI, Blocks.oak_stairs) && lIIlIIllIIIIlIll(llllllllllllIllIlIllllIlIIIlIIlI, Blocks.nether_brick_stairs) && lIIlIIllIIIIlIll(llllllllllllIllIlIllllIlIIIlIIlI, Blocks.stone_brick_stairs) && lIIlIIllIIIIlIll(llllllllllllIllIlIllllIlIIIlIIlI, Blocks.sandstone_stairs)) {
            if (lIIlIIllIIIIlIlI(llllllllllllIllIlIllllIlIIIlIIlI, Blocks.ladder)) {
                if (lIIlIIllIIIIlIlI(this.coordBaseMode, EnumFacing.SOUTH)) {
                    if (lIIlIIllIIIIIllI(llllllllllllIllIlIllllIlIIIlIIIl, EnumFacing.NORTH.getIndex())) {
                        return EnumFacing.SOUTH.getIndex();
                    }
                    if (lIIlIIllIIIIIllI(llllllllllllIllIlIllllIlIIIlIIIl, EnumFacing.SOUTH.getIndex())) {
                        return EnumFacing.NORTH.getIndex();
                    }
                }
                else if (lIIlIIllIIIIlIlI(this.coordBaseMode, EnumFacing.WEST)) {
                    if (lIIlIIllIIIIIllI(llllllllllllIllIlIllllIlIIIlIIIl, EnumFacing.NORTH.getIndex())) {
                        return EnumFacing.WEST.getIndex();
                    }
                    if (lIIlIIllIIIIIllI(llllllllllllIllIlIllllIlIIIlIIIl, EnumFacing.SOUTH.getIndex())) {
                        return EnumFacing.EAST.getIndex();
                    }
                    if (lIIlIIllIIIIIllI(llllllllllllIllIlIllllIlIIIlIIIl, EnumFacing.WEST.getIndex())) {
                        return EnumFacing.NORTH.getIndex();
                    }
                    if (lIIlIIllIIIIIllI(llllllllllllIllIlIllllIlIIIlIIIl, EnumFacing.EAST.getIndex())) {
                        return EnumFacing.SOUTH.getIndex();
                    }
                }
                else if (lIIlIIllIIIIlIlI(this.coordBaseMode, EnumFacing.EAST)) {
                    if (lIIlIIllIIIIIllI(llllllllllllIllIlIllllIlIIIlIIIl, EnumFacing.NORTH.getIndex())) {
                        return EnumFacing.EAST.getIndex();
                    }
                    if (lIIlIIllIIIIIllI(llllllllllllIllIlIllllIlIIIlIIIl, EnumFacing.SOUTH.getIndex())) {
                        return EnumFacing.WEST.getIndex();
                    }
                    if (lIIlIIllIIIIIllI(llllllllllllIllIlIllllIlIIIlIIIl, EnumFacing.WEST.getIndex())) {
                        return EnumFacing.NORTH.getIndex();
                    }
                    if (lIIlIIllIIIIIllI(llllllllllllIllIlIllllIlIIIlIIIl, EnumFacing.EAST.getIndex())) {
                        return EnumFacing.SOUTH.getIndex();
                    }
                }
            }
            else if (lIIlIIllIIIIlIlI(llllllllllllIllIlIllllIlIIIlIIlI, Blocks.stone_button)) {
                if (lIIlIIllIIIIlIlI(this.coordBaseMode, EnumFacing.SOUTH)) {
                    if (lIIlIIllIIIIIllI(llllllllllllIllIlIllllIlIIIlIIIl, StructureComponent.llIlIIllIllIll[4])) {
                        return StructureComponent.llIlIIllIllIll[5];
                    }
                    if (lIIlIIllIIIIIllI(llllllllllllIllIlIllllIlIIIlIIIl, StructureComponent.llIlIIllIllIll[5])) {
                        return StructureComponent.llIlIIllIllIll[4];
                    }
                }
                else if (lIIlIIllIIIIlIlI(this.coordBaseMode, EnumFacing.WEST)) {
                    if (lIIlIIllIIIIIllI(llllllllllllIllIlIllllIlIIIlIIIl, StructureComponent.llIlIIllIllIll[4])) {
                        return StructureComponent.llIlIIllIllIll[1];
                    }
                    if (lIIlIIllIIIIIllI(llllllllllllIllIlIllllIlIIIlIIIl, StructureComponent.llIlIIllIllIll[5])) {
                        return StructureComponent.llIlIIllIllIll[2];
                    }
                    if (lIIlIIllIIIIIllI(llllllllllllIllIlIllllIlIIIlIIIl, StructureComponent.llIlIIllIllIll[2])) {
                        return StructureComponent.llIlIIllIllIll[4];
                    }
                    if (lIIlIIllIIIIIllI(llllllllllllIllIlIllllIlIIIlIIIl, StructureComponent.llIlIIllIllIll[1])) {
                        return StructureComponent.llIlIIllIllIll[5];
                    }
                }
                else if (lIIlIIllIIIIlIlI(this.coordBaseMode, EnumFacing.EAST)) {
                    if (lIIlIIllIIIIIllI(llllllllllllIllIlIllllIlIIIlIIIl, StructureComponent.llIlIIllIllIll[4])) {
                        return StructureComponent.llIlIIllIllIll[2];
                    }
                    if (lIIlIIllIIIIIllI(llllllllllllIllIlIllllIlIIIlIIIl, StructureComponent.llIlIIllIllIll[5])) {
                        return StructureComponent.llIlIIllIllIll[1];
                    }
                    if (lIIlIIllIIIIIllI(llllllllllllIllIlIllllIlIIIlIIIl, StructureComponent.llIlIIllIllIll[2])) {
                        return StructureComponent.llIlIIllIllIll[4];
                    }
                    if (lIIlIIllIIIIIllI(llllllllllllIllIlIllllIlIIIlIIIl, StructureComponent.llIlIIllIllIll[1])) {
                        return StructureComponent.llIlIIllIllIll[5];
                    }
                }
            }
            else if (lIIlIIllIIIIlIll(llllllllllllIllIlIllllIlIIIlIIlI, Blocks.tripwire_hook) && lIIlIIllIIIIlIII((llllllllllllIllIlIllllIlIIIlIIlI instanceof BlockDirectional) ? 1 : 0)) {
                if (!lIIlIIllIIIIlIll(llllllllllllIllIlIllllIlIIIlIIlI, Blocks.piston) || !lIIlIIllIIIIlIll(llllllllllllIllIlIllllIlIIIlIIlI, Blocks.sticky_piston) || !lIIlIIllIIIIlIll(llllllllllllIllIlIllllIlIIIlIIlI, Blocks.lever) || lIIlIIllIIIIlIlI(llllllllllllIllIlIllllIlIIIlIIlI, Blocks.dispenser)) {
                    if (lIIlIIllIIIIlIlI(this.coordBaseMode, EnumFacing.SOUTH)) {
                        if (!lIIlIIllIIIIllII(llllllllllllIllIlIllllIlIIIlIIIl, EnumFacing.NORTH.getIndex()) || lIIlIIllIIIIIllI(llllllllllllIllIlIllllIlIIIlIIIl, EnumFacing.SOUTH.getIndex())) {
                            return EnumFacing.getFront(llllllllllllIllIlIllllIlIIIlIIIl).getOpposite().getIndex();
                        }
                    }
                    else if (lIIlIIllIIIIlIlI(this.coordBaseMode, EnumFacing.WEST)) {
                        if (lIIlIIllIIIIIllI(llllllllllllIllIlIllllIlIIIlIIIl, EnumFacing.NORTH.getIndex())) {
                            return EnumFacing.WEST.getIndex();
                        }
                        if (lIIlIIllIIIIIllI(llllllllllllIllIlIllllIlIIIlIIIl, EnumFacing.SOUTH.getIndex())) {
                            return EnumFacing.EAST.getIndex();
                        }
                        if (lIIlIIllIIIIIllI(llllllllllllIllIlIllllIlIIIlIIIl, EnumFacing.WEST.getIndex())) {
                            return EnumFacing.NORTH.getIndex();
                        }
                        if (lIIlIIllIIIIIllI(llllllllllllIllIlIllllIlIIIlIIIl, EnumFacing.EAST.getIndex())) {
                            return EnumFacing.SOUTH.getIndex();
                        }
                    }
                    else if (lIIlIIllIIIIlIlI(this.coordBaseMode, EnumFacing.EAST)) {
                        if (lIIlIIllIIIIIllI(llllllllllllIllIlIllllIlIIIlIIIl, EnumFacing.NORTH.getIndex())) {
                            return EnumFacing.EAST.getIndex();
                        }
                        if (lIIlIIllIIIIIllI(llllllllllllIllIlIllllIlIIIlIIIl, EnumFacing.SOUTH.getIndex())) {
                            return EnumFacing.WEST.getIndex();
                        }
                        if (lIIlIIllIIIIIllI(llllllllllllIllIlIllllIlIIIlIIIl, EnumFacing.WEST.getIndex())) {
                            return EnumFacing.NORTH.getIndex();
                        }
                        if (lIIlIIllIIIIIllI(llllllllllllIllIlIllllIlIIIlIIIl, EnumFacing.EAST.getIndex())) {
                            return EnumFacing.SOUTH.getIndex();
                        }
                    }
                }
            }
            else {
                final EnumFacing llllllllllllIllIlIllllIlIIIlIIII = EnumFacing.getHorizontal(llllllllllllIllIlIllllIlIIIlIIIl);
                if (lIIlIIllIIIIlIlI(this.coordBaseMode, EnumFacing.SOUTH)) {
                    if (!lIIlIIllIIIIlIll(llllllllllllIllIlIllllIlIIIlIIII, EnumFacing.SOUTH) || lIIlIIllIIIIlIlI(llllllllllllIllIlIllllIlIIIlIIII, EnumFacing.NORTH)) {
                        return llllllllllllIllIlIllllIlIIIlIIII.getOpposite().getHorizontalIndex();
                    }
                }
                else if (lIIlIIllIIIIlIlI(this.coordBaseMode, EnumFacing.WEST)) {
                    if (lIIlIIllIIIIlIlI(llllllllllllIllIlIllllIlIIIlIIII, EnumFacing.NORTH)) {
                        return EnumFacing.WEST.getHorizontalIndex();
                    }
                    if (lIIlIIllIIIIlIlI(llllllllllllIllIlIllllIlIIIlIIII, EnumFacing.SOUTH)) {
                        return EnumFacing.EAST.getHorizontalIndex();
                    }
                    if (lIIlIIllIIIIlIlI(llllllllllllIllIlIllllIlIIIlIIII, EnumFacing.WEST)) {
                        return EnumFacing.NORTH.getHorizontalIndex();
                    }
                    if (lIIlIIllIIIIlIlI(llllllllllllIllIlIllllIlIIIlIIII, EnumFacing.EAST)) {
                        return EnumFacing.SOUTH.getHorizontalIndex();
                    }
                }
                else if (lIIlIIllIIIIlIlI(this.coordBaseMode, EnumFacing.EAST)) {
                    if (lIIlIIllIIIIlIlI(llllllllllllIllIlIllllIlIIIlIIII, EnumFacing.NORTH)) {
                        return EnumFacing.EAST.getHorizontalIndex();
                    }
                    if (lIIlIIllIIIIlIlI(llllllllllllIllIlIllllIlIIIlIIII, EnumFacing.SOUTH)) {
                        return EnumFacing.WEST.getHorizontalIndex();
                    }
                    if (lIIlIIllIIIIlIlI(llllllllllllIllIlIllllIlIIIlIIII, EnumFacing.WEST)) {
                        return EnumFacing.NORTH.getHorizontalIndex();
                    }
                    if (lIIlIIllIIIIlIlI(llllllllllllIllIlIllllIlIIIlIIII, EnumFacing.EAST)) {
                        return EnumFacing.SOUTH.getHorizontalIndex();
                    }
                }
            }
        }
        else if (lIIlIIllIIIIlIlI(this.coordBaseMode, EnumFacing.SOUTH)) {
            if (lIIlIIllIIIIIllI(llllllllllllIllIlIllllIlIIIlIIIl, StructureComponent.llIlIIllIllIll[2])) {
                return StructureComponent.llIlIIllIllIll[4];
            }
            if (lIIlIIllIIIIIllI(llllllllllllIllIlIllllIlIIIlIIIl, StructureComponent.llIlIIllIllIll[4])) {
                return StructureComponent.llIlIIllIllIll[2];
            }
        }
        else if (lIIlIIllIIIIlIlI(this.coordBaseMode, EnumFacing.WEST)) {
            if (lIIlIIllIIIIlIII(llllllllllllIllIlIllllIlIIIlIIIl)) {
                return StructureComponent.llIlIIllIllIll[2];
            }
            if (lIIlIIllIIIIIllI(llllllllllllIllIlIllllIlIIIlIIIl, StructureComponent.llIlIIllIllIll[1])) {
                return StructureComponent.llIlIIllIllIll[4];
            }
            if (lIIlIIllIIIIIllI(llllllllllllIllIlIllllIlIIIlIIIl, StructureComponent.llIlIIllIllIll[2])) {
                return StructureComponent.llIlIIllIllIll[0];
            }
            if (lIIlIIllIIIIIllI(llllllllllllIllIlIllllIlIIIlIIIl, StructureComponent.llIlIIllIllIll[4])) {
                return StructureComponent.llIlIIllIllIll[1];
            }
        }
        else if (lIIlIIllIIIIlIlI(this.coordBaseMode, EnumFacing.EAST)) {
            if (lIIlIIllIIIIlIII(llllllllllllIllIlIllllIlIIIlIIIl)) {
                return StructureComponent.llIlIIllIllIll[2];
            }
            if (lIIlIIllIIIIIllI(llllllllllllIllIlIllllIlIIIlIIIl, StructureComponent.llIlIIllIllIll[1])) {
                return StructureComponent.llIlIIllIllIll[4];
            }
            if (lIIlIIllIIIIIllI(llllllllllllIllIlIllllIlIIIlIIIl, StructureComponent.llIlIIllIllIll[2])) {
                return StructureComponent.llIlIIllIllIll[1];
            }
            if (lIIlIIllIIIIIllI(llllllllllllIllIlIllllIlIIIlIIIl, StructureComponent.llIlIIllIllIll[4])) {
                return StructureComponent.llIlIIllIllIll[0];
            }
        }
        return llllllllllllIllIlIllllIlIIIlIIIl;
    }
    
    public abstract boolean addComponentParts(final World p0, final Random p1, final StructureBoundingBox p2);
    
    private static boolean lIIlIIllIIIIIlll(final Object llllllllllllIllIlIlllIlIllIlIlll) {
        return llllllllllllIllIlIlllIlIllIlIlll != null;
    }
    
    public StructureBoundingBox getBoundingBox() {
        return this.boundingBox;
    }
    
    private static int lIIlIIllIIIIllll(final float n, final float n2) {
        return fcmpg(n, n2);
    }
    
    public StructureComponent() {
    }
    
    protected abstract void readStructureFromNBT(final NBTTagCompound p0);
    
    private static boolean lIIlIIllIIIIlIlI(final Object llllllllllllIllIlIlllIlIllIlIlII, final Object llllllllllllIllIlIlllIlIllIlIIll) {
        return llllllllllllIllIlIlllIlIllIlIlII == llllllllllllIllIlIlllIlIllIlIIll;
    }
    
    public BlockPos getBoundingBoxCenter() {
        return new BlockPos(this.boundingBox.getCenter());
    }
    
    private static boolean lIIlIIllIIIIlIII(final int llllllllllllIllIlIlllIlIllIIllIl) {
        return llllllllllllIllIlIlllIlIllIIllIl == 0;
    }
    
    protected int getYWithOffset(final int llllllllllllIllIlIllllIlIIlIIIll) {
        int n;
        if (lIIlIIllIIIIIlII(this.coordBaseMode)) {
            n = llllllllllllIllIlIllllIlIIlIIIll;
            "".length();
            if ("   ".length() != "   ".length()) {
                return (0xF1 ^ 0xA5) & ~(0xF1 ^ 0xA5);
            }
        }
        else {
            n = llllllllllllIllIlIllllIlIIlIIIll + this.boundingBox.minY;
        }
        return n;
    }
    
    protected int getZWithOffset(final int llllllllllllIllIlIllllIlIIIllIIl, final int llllllllllllIllIlIllllIlIIIllIll) {
        if (lIIlIIllIIIIIlII(this.coordBaseMode)) {
            return llllllllllllIllIlIllllIlIIIllIll;
        }
        switch ($SWITCH_TABLE$net$minecraft$util$EnumFacing()[this.coordBaseMode.ordinal()]) {
            case 3: {
                return this.boundingBox.maxZ - llllllllllllIllIlIllllIlIIIllIll;
            }
            case 4: {
                return this.boundingBox.minZ + llllllllllllIllIlIllllIlIIIllIll;
            }
            case 5:
            case 6: {
                return this.boundingBox.minZ + llllllllllllIllIlIllllIlIIIllIIl;
            }
            default: {
                return llllllllllllIllIlIllllIlIIIllIll;
            }
        }
    }
    
    public int getComponentType() {
        return this.componentType;
    }
    
    static /* synthetic */ int[] $SWITCH_TABLE$net$minecraft$util$EnumFacing() {
        final int[] $switch_TABLE$net$minecraft$util$EnumFacing = StructureComponent.$SWITCH_TABLE$net$minecraft$util$EnumFacing;
        if (lIIlIIllIIIIIlll($switch_TABLE$net$minecraft$util$EnumFacing)) {
            return $switch_TABLE$net$minecraft$util$EnumFacing;
        }
        "".length();
        final byte llllllllllllIllIlIlllIllIIlIIIll = (Object)new int[EnumFacing.values().length];
        try {
            llllllllllllIllIlIlllIllIIlIIIll[EnumFacing.DOWN.ordinal()] = StructureComponent.llIlIIllIllIll[1];
            "".length();
            if (null != null) {
                return null;
            }
        }
        catch (NoSuchFieldError noSuchFieldError) {
            "".length();
        }
        try {
            llllllllllllIllIlIlllIllIIlIIIll[EnumFacing.EAST.ordinal()] = StructureComponent.llIlIIllIllIll[7];
            "".length();
            if ("  ".length() < 0) {
                return null;
            }
        }
        catch (NoSuchFieldError noSuchFieldError2) {
            "".length();
        }
        try {
            llllllllllllIllIlIlllIllIIlIIIll[EnumFacing.NORTH.ordinal()] = StructureComponent.llIlIIllIllIll[4];
            "".length();
            if ("   ".length() == 0) {
                return null;
            }
        }
        catch (NoSuchFieldError noSuchFieldError3) {
            "".length();
        }
        try {
            llllllllllllIllIlIlllIllIIlIIIll[EnumFacing.SOUTH.ordinal()] = StructureComponent.llIlIIllIllIll[5];
            "".length();
            if ("   ".length() == -" ".length()) {
                return null;
            }
        }
        catch (NoSuchFieldError noSuchFieldError4) {
            "".length();
        }
        try {
            llllllllllllIllIlIlllIllIIlIIIll[EnumFacing.UP.ordinal()] = StructureComponent.llIlIIllIllIll[2];
            "".length();
            if (-"   ".length() > 0) {
                return null;
            }
        }
        catch (NoSuchFieldError noSuchFieldError5) {
            "".length();
        }
        try {
            llllllllllllIllIlIlllIllIIlIIIll[EnumFacing.WEST.ordinal()] = StructureComponent.llIlIIllIllIll[6];
            "".length();
            if (" ".length() > "  ".length()) {
                return null;
            }
        }
        catch (NoSuchFieldError noSuchFieldError6) {
            "".length();
        }
        return StructureComponent.$SWITCH_TABLE$net$minecraft$util$EnumFacing = (int[])(Object)llllllllllllIllIlIlllIllIIlIIIll;
    }
    
    protected void func_175805_a(final World llllllllllllIllIlIllllIIIIllIlII, final StructureBoundingBox llllllllllllIllIlIllllIIIlIIIlII, final Random llllllllllllIllIlIllllIIIIllIIlI, final float llllllllllllIllIlIllllIIIlIIIIlI, final int llllllllllllIllIlIllllIIIlIIIIIl, final int llllllllllllIllIlIllllIIIIlIllll, final int llllllllllllIllIlIllllIIIIlIlllI, final int llllllllllllIllIlIllllIIIIlIllIl, final int llllllllllllIllIlIllllIIIIlIllII, final int llllllllllllIllIlIllllIIIIllllII, final IBlockState llllllllllllIllIlIllllIIIIlIlIlI, final IBlockState llllllllllllIllIlIllllIIIIlIlIIl, final boolean llllllllllllIllIlIllllIIIIlIlIII) {
        int llllllllllllIllIlIllllIIIIlllIII = llllllllllllIllIlIllllIIIIlIllll;
        "".length();
        if (((0x4D ^ 0x10 ^ (0x82 ^ 0x93)) & (155 + 118 - 173 + 103 ^ 21 + 30 - 8 + 92 ^ -" ".length())) > 0) {
            return;
        }
        while (!lIIlIIllIIIIlIIl(llllllllllllIllIlIllllIIIIlllIII, llllllllllllIllIlIllllIIIIlIllII)) {
            int llllllllllllIllIlIllllIIIIllIlll = llllllllllllIllIlIllllIIIlIIIIIl;
            "".length();
            if (((40 + 126 - 108 + 86 ^ 81 + 55 - 127 + 130) & (0x42 ^ 0x51 ^ (0xB9 ^ 0xB1) ^ -" ".length())) == "   ".length()) {
                return;
            }
            while (!lIIlIIllIIIIlIIl(llllllllllllIllIlIllllIIIIllIlll, llllllllllllIllIlIllllIIIIlIllIl)) {
                int llllllllllllIllIlIllllIIIIllIllI = llllllllllllIllIlIllllIIIIlIlllI;
                "".length();
                if (-"  ".length() >= 0) {
                    return;
                }
                while (!lIIlIIllIIIIlIIl(llllllllllllIllIlIllllIIIIllIllI, llllllllllllIllIlIllllIIIIllllII)) {
                    if (lIIlIIllIIIIlllI(lIIlIIllIIIIllIl(llllllllllllIllIlIllllIIIIllIIlI.nextFloat(), llllllllllllIllIlIllllIIIlIIIIlI)) && (!lIIlIIllIIIIIlIl(llllllllllllIllIlIllllIIIIlIlIII ? 1 : 0) || lIIlIIllIIIIlIll(this.getBlockStateFromPos(llllllllllllIllIlIllllIIIIllIlII, llllllllllllIllIlIllllIIIIllIlll, llllllllllllIllIlIllllIIIIlllIII, llllllllllllIllIlIllllIIIIllIllI, llllllllllllIllIlIllllIIIlIIIlII).getBlock().getMaterial(), Material.air))) {
                        if (lIIlIIllIIIIllII(llllllllllllIllIlIllllIIIIlllIII, llllllllllllIllIlIllllIIIIlIllll) && lIIlIIllIIIIllII(llllllllllllIllIlIllllIIIIlllIII, llllllllllllIllIlIllllIIIIlIllII) && lIIlIIllIIIIllII(llllllllllllIllIlIllllIIIIllIlll, llllllllllllIllIlIllllIIIlIIIIIl) && lIIlIIllIIIIllII(llllllllllllIllIlIllllIIIIllIlll, llllllllllllIllIlIllllIIIIlIllIl) && lIIlIIllIIIIllII(llllllllllllIllIlIllllIIIIllIllI, llllllllllllIllIlIllllIIIIlIlllI) && lIIlIIllIIIIllII(llllllllllllIllIlIllllIIIIllIllI, llllllllllllIllIlIllllIIIIllllII)) {
                            this.setBlockState(llllllllllllIllIlIllllIIIIllIlII, llllllllllllIllIlIllllIIIIlIlIIl, llllllllllllIllIlIllllIIIIllIlll, llllllllllllIllIlIllllIIIIlllIII, llllllllllllIllIlIllllIIIIllIllI, llllllllllllIllIlIllllIIIlIIIlII);
                            "".length();
                            if ("  ".length() <= 0) {
                                return;
                            }
                        }
                        else {
                            this.setBlockState(llllllllllllIllIlIllllIIIIllIlII, llllllllllllIllIlIllllIIIIlIlIlI, llllllllllllIllIlIllllIIIIllIlll, llllllllllllIllIlIllllIIIIlllIII, llllllllllllIllIlIllllIIIIllIllI, llllllllllllIllIlIllllIIIlIIIlII);
                        }
                    }
                    ++llllllllllllIllIlIllllIIIIllIllI;
                }
                ++llllllllllllIllIlIllllIIIIllIlll;
            }
            ++llllllllllllIllIlIllllIIIIlllIII;
        }
    }
    
    protected void placeDoorCurrentPosition(final World llllllllllllIllIlIlllIllIIllIlll, final StructureBoundingBox llllllllllllIllIlIlllIllIIllIllI, final Random llllllllllllIllIlIlllIllIIlllllI, final int llllllllllllIllIlIlllIllIIllllIl, final int llllllllllllIllIlIlllIllIIllllII, final int llllllllllllIllIlIlllIllIIlllIll, final EnumFacing llllllllllllIllIlIlllIllIIllIIlI) {
        final BlockPos llllllllllllIllIlIlllIllIIlllIIl = new BlockPos(this.getXWithOffset(llllllllllllIllIlIlllIllIIllllIl, llllllllllllIllIlIlllIllIIlllIll), this.getYWithOffset(llllllllllllIllIlIlllIllIIllllII), this.getZWithOffset(llllllllllllIllIlIlllIllIIllllIl, llllllllllllIllIlIlllIllIIlllIll));
        if (lIIlIIllIIIIIlIl(llllllllllllIllIlIlllIllIIllIllI.isVecInside(llllllllllllIllIlIlllIllIIlllIIl) ? 1 : 0)) {
            ItemDoor.placeDoor(llllllllllllIllIlIlllIllIIllIlll, llllllllllllIllIlIlllIllIIlllIIl, llllllllllllIllIlIlllIllIIllIIlI.rotateYCCW(), Blocks.oak_door);
        }
    }
    
    private static boolean lIIlIIllIIIIllII(final int llllllllllllIllIlIlllIlIllIIIllI, final int llllllllllllIllIlIlllIlIllIIIlIl) {
        return llllllllllllIllIlIlllIlIllIIIllI != llllllllllllIllIlIlllIlIllIIIlIl;
    }
    
    private static boolean lIIlIIllIIIIIllI(final int llllllllllllIllIlIlllIlIlllIlllI, final int llllllllllllIllIlIlllIlIlllIllIl) {
        return llllllllllllIllIlIlllIlIlllIlllI == llllllllllllIllIlIlllIlIlllIllIl;
    }
    
    private static String lIIlIIllIIIIIIII(final String llllllllllllIllIlIlllIllIIIIIIIl, final String llllllllllllIllIlIlllIllIIIIIIII) {
        try {
            final SecretKeySpec llllllllllllIllIlIlllIllIIIIIllI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIllIlIlllIllIIIIIIII.getBytes(StandardCharsets.UTF_8)), StructureComponent.llIlIIllIllIll[10]), "DES");
            final Cipher llllllllllllIllIlIlllIllIIIIIlIl = Cipher.getInstance("DES");
            llllllllllllIllIlIlllIllIIIIIlIl.init(StructureComponent.llIlIIllIllIll[2], llllllllllllIllIlIlllIllIIIIIllI);
            return new String(llllllllllllIllIlIlllIllIIIIIlIl.doFinal(Base64.getDecoder().decode(llllllllllllIllIlIlllIllIIIIIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIllIlIlllIllIIIIIlII) {
            llllllllllllIllIlIlllIllIIIIIlII.printStackTrace();
            return null;
        }
    }
    
    static {
        lIIlIIllIIIIIIll();
        lIIlIIllIIIIIIlI();
    }
    
    protected void clearCurrentPositionBlocksUpwards(final World llllllllllllIllIlIlllIlllIllllII, final int llllllllllllIllIlIlllIlllIlllIll, final int llllllllllllIllIlIlllIlllIlllIlI, final int llllllllllllIllIlIlllIlllIlllIIl, final StructureBoundingBox llllllllllllIllIlIlllIlllIlllIII) {
        BlockPos llllllllllllIllIlIlllIlllIllIlll = new BlockPos(this.getXWithOffset(llllllllllllIllIlIlllIlllIlllIll, llllllllllllIllIlIlllIlllIlllIIl), this.getYWithOffset(llllllllllllIllIlIlllIlllIlllIlI), this.getZWithOffset(llllllllllllIllIlIlllIlllIlllIll, llllllllllllIllIlIlllIlllIlllIIl));
        if (lIIlIIllIIIIIlIl(llllllllllllIllIlIlllIlllIlllIII.isVecInside(llllllllllllIllIlIlllIlllIllIlll) ? 1 : 0)) {
            "".length();
            if (-"  ".length() >= 0) {
                return;
            }
            while (lIIlIIllIIIIlIII(llllllllllllIllIlIlllIlllIllllII.isAirBlock(llllllllllllIllIlIlllIlllIllIlll) ? 1 : 0) && !lIIlIIllIIIlIIlI(llllllllllllIllIlIlllIlllIllIlll.getY(), StructureComponent.llIlIIllIllIll[9])) {
                llllllllllllIllIlIlllIlllIllllII.setBlockState(llllllllllllIllIlIlllIlllIllIlll, Blocks.air.getDefaultState(), StructureComponent.llIlIIllIllIll[2]);
                "".length();
                llllllllllllIllIlIlllIlllIllIlll = llllllllllllIllIlIlllIlllIllIlll.up();
            }
        }
    }
    
    protected StructureComponent(final int llllllllllllIllIlIllllIllIIIIIlI) {
        this.componentType = llllllllllllIllIlIllllIllIIIIIlI;
    }
    
    private static boolean lIIlIIllIIIIlllI(final int llllllllllllIllIlIlllIlIllIIlIIl) {
        return llllllllllllIllIlIlllIlIllIIlIIl <= 0;
    }
    
    protected int getXWithOffset(final int llllllllllllIllIlIllllIlIIlIlIll, final int llllllllllllIllIlIllllIlIIlIIlll) {
        if (lIIlIIllIIIIIlII(this.coordBaseMode)) {
            return llllllllllllIllIlIllllIlIIlIlIll;
        }
        switch ($SWITCH_TABLE$net$minecraft$util$EnumFacing()[this.coordBaseMode.ordinal()]) {
            case 3:
            case 4: {
                return this.boundingBox.minX + llllllllllllIllIlIllllIlIIlIlIll;
            }
            case 5: {
                return this.boundingBox.maxX - llllllllllllIllIlIllllIlIIlIIlll;
            }
            case 6: {
                return this.boundingBox.minX + llllllllllllIllIlIllllIlIIlIIlll;
            }
            default: {
                return llllllllllllIllIlIllllIlIIlIlIll;
            }
        }
    }
    
    protected void fillWithAir(final World llllllllllllIllIlIllllIIllIIlIII, final StructureBoundingBox llllllllllllIllIlIllllIIllIIIlll, final int llllllllllllIllIlIllllIIlIlllIlI, final int llllllllllllIllIlIllllIIllIIIlIl, final int llllllllllllIllIlIllllIIllIIIlII, final int llllllllllllIllIlIllllIIlIllIlll, final int llllllllllllIllIlIllllIIllIIIIlI, final int llllllllllllIllIlIllllIIlIllIlIl) {
        int llllllllllllIllIlIllllIIllIIIIII = llllllllllllIllIlIllllIIllIIIlIl;
        "".length();
        if ("   ".length() >= (0x33 ^ 0x37)) {
            return;
        }
        while (!lIIlIIllIIIIlIIl(llllllllllllIllIlIllllIIllIIIIII, llllllllllllIllIlIllllIIllIIIIlI)) {
            int llllllllllllIllIlIllllIIlIllllll = llllllllllllIllIlIllllIIlIlllIlI;
            "".length();
            if (" ".length() <= -" ".length()) {
                return;
            }
            while (!lIIlIIllIIIIlIIl(llllllllllllIllIlIllllIIlIllllll, llllllllllllIllIlIllllIIlIllIlll)) {
                int llllllllllllIllIlIllllIIlIlllllI = llllllllllllIllIlIllllIIllIIIlII;
                "".length();
                if (" ".length() == 0) {
                    return;
                }
                while (!lIIlIIllIIIIlIIl(llllllllllllIllIlIllllIIlIlllllI, llllllllllllIllIlIllllIIlIllIlIl)) {
                    this.setBlockState(llllllllllllIllIlIllllIIllIIlIII, Blocks.air.getDefaultState(), llllllllllllIllIlIllllIIlIllllll, llllllllllllIllIlIllllIIllIIIIII, llllllllllllIllIlIllllIIlIlllllI, llllllllllllIllIlIllllIIllIIIlll);
                    ++llllllllllllIllIlIllllIIlIlllllI;
                }
                ++llllllllllllIllIlIllllIIlIllllll;
            }
            ++llllllllllllIllIlIllllIIllIIIIII;
        }
    }
    
    private static void lIIlIIllIIIIIIlI() {
        (llIlIIllIllIlI = new String[StructureComponent.llIlIIllIllIll[10]])[StructureComponent.llIlIIllIllIll[0]] = lIIlIIlIllllllll("cPmPzsgvTeU=", "XRZEA");
        StructureComponent.llIlIIllIllIlI[StructureComponent.llIlIIllIllIll[1]] = lIIlIIlIllllllll("z/H4NzmtmTU=", "sVwvG");
        StructureComponent.llIlIIllIllIlI[StructureComponent.llIlIIllIllIll[2]] = lIIlIIlIllllllll("QWreBAeLXGc=", "lWygS");
        StructureComponent.llIlIIllIllIlI[StructureComponent.llIlIIllIllIll[4]] = lIIlIIllIIIIIIII("+BbpuqWynQM=", "pPlKa");
        StructureComponent.llIlIIllIllIlI[StructureComponent.llIlIIllIllIll[5]] = lIIlIIllIIIIIIIl("FxA=", "URaxn");
        StructureComponent.llIlIIllIllIlI[StructureComponent.llIlIIllIllIll[6]] = lIIlIIlIllllllll("E/Z/IVGEKyI=", "FlsnY");
        StructureComponent.llIlIIllIllIlI[StructureComponent.llIlIIllIllIll[7]] = lIIlIIlIllllllll("9sdqC5zoszA=", "Fdbxj");
        StructureComponent.llIlIIllIllIlI[StructureComponent.llIlIIllIllIll[8]] = lIIlIIlIllllllll("aPrjM3pDfSk=", "TKELE");
    }
    
    protected void replaceAirAndLiquidDownwards(final World llllllllllllIllIlIlllIlllIlIIlII, final IBlockState llllllllllllIllIlIlllIlllIIllIIl, final int llllllllllllIllIlIlllIlllIlIIIlI, final int llllllllllllIllIlIlllIlllIIlIlll, final int llllllllllllIllIlIlllIlllIIlIllI, final StructureBoundingBox llllllllllllIllIlIlllIlllIIlIlIl) {
        final int llllllllllllIllIlIlllIlllIIllllI = this.getXWithOffset(llllllllllllIllIlIlllIlllIlIIIlI, llllllllllllIllIlIlllIlllIIlIllI);
        int llllllllllllIllIlIlllIlllIIlllIl = this.getYWithOffset(llllllllllllIllIlIlllIlllIIlIlll);
        final int llllllllllllIllIlIlllIlllIIlllII = this.getZWithOffset(llllllllllllIllIlIlllIlllIlIIIlI, llllllllllllIllIlIlllIlllIIlIllI);
        if (lIIlIIllIIIIIlIl(llllllllllllIllIlIlllIlllIIlIlIl.isVecInside(new BlockPos(llllllllllllIllIlIlllIlllIIllllI, llllllllllllIllIlIlllIlllIIlllIl, llllllllllllIllIlIlllIlllIIlllII)) ? 1 : 0)) {
            "".length();
            if (null != null) {
                return;
            }
            while ((!lIIlIIllIIIIlIII(llllllllllllIllIlIlllIlllIlIIlII.isAirBlock(new BlockPos(llllllllllllIllIlIlllIlllIIllllI, llllllllllllIllIlIlllIlllIIlllIl, llllllllllllIllIlIlllIlllIIlllII)) ? 1 : 0) || lIIlIIllIIIIIlIl(llllllllllllIllIlIlllIlllIlIIlII.getBlockState(new BlockPos(llllllllllllIllIlIlllIlllIIllllI, llllllllllllIllIlIlllIlllIIlllIl, llllllllllllIllIlIlllIlllIIlllII)).getBlock().getMaterial().isLiquid() ? 1 : 0)) && !lIIlIIllIIIlIIll(llllllllllllIllIlIlllIlllIIlllIl, StructureComponent.llIlIIllIllIll[1])) {
                llllllllllllIllIlIlllIlllIlIIlII.setBlockState(new BlockPos(llllllllllllIllIlIlllIlllIIllllI, llllllllllllIllIlIlllIlllIIlllIl, llllllllllllIllIlIlllIlllIIlllII), llllllllllllIllIlIlllIlllIIllIIl, StructureComponent.llIlIIllIllIll[2]);
                "".length();
                --llllllllllllIllIlIlllIlllIIlllIl;
            }
        }
    }
    
    private static boolean lIIlIIllIIIIIlII(final Object llllllllllllIllIlIlllIlIllIlIIIl) {
        return llllllllllllIllIlIlllIlIllIlIIIl == null;
    }
    
    private static int lIIlIIllIIIlIIIl(final float n, final float n2) {
        return fcmpg(n, n2);
    }
    
    protected void setBlockState(final World llllllllllllIllIlIllllIIlllllIlI, final IBlockState llllllllllllIllIlIllllIIlllllIIl, final int llllllllllllIllIlIllllIlIIIIIIII, final int llllllllllllIllIlIllllIIllllIlll, final int llllllllllllIllIlIllllIIllllIllI, final StructureBoundingBox llllllllllllIllIlIllllIIllllIlIl) {
        final BlockPos llllllllllllIllIlIllllIIllllllII = new BlockPos(this.getXWithOffset(llllllllllllIllIlIllllIlIIIIIIII, llllllllllllIllIlIllllIIllllIllI), this.getYWithOffset(llllllllllllIllIlIllllIIllllIlll), this.getZWithOffset(llllllllllllIllIlIllllIlIIIIIIII, llllllllllllIllIlIllllIIllllIllI));
        if (lIIlIIllIIIIIlIl(llllllllllllIllIlIllllIIllllIlIl.isVecInside(llllllllllllIllIlIllllIIllllllII) ? 1 : 0)) {
            llllllllllllIllIlIllllIIlllllIlI.setBlockState(llllllllllllIllIlIllllIIllllllII, llllllllllllIllIlIllllIIlllllIIl, StructureComponent.llIlIIllIllIll[2]);
            "".length();
        }
    }
    
    private static boolean lIIlIIllIIIIIlIl(final int llllllllllllIllIlIlllIlIllIIllll) {
        return llllllllllllIllIlIlllIlIllIIllll != 0;
    }
    
    public void readStructureBaseNBT(final World llllllllllllIllIlIllllIlIlllIlIl, final NBTTagCompound llllllllllllIllIlIllllIlIlllIIIl) {
        if (lIIlIIllIIIIIlIl(llllllllllllIllIlIllllIlIlllIIIl.hasKey(StructureComponent.llIlIIllIllIlI[StructureComponent.llIlIIllIllIll[5]]) ? 1 : 0)) {
            this.boundingBox = new StructureBoundingBox(llllllllllllIllIlIllllIlIlllIIIl.getIntArray(StructureComponent.llIlIIllIllIlI[StructureComponent.llIlIIllIllIll[6]]));
        }
        final int llllllllllllIllIlIllllIlIlllIIll = llllllllllllIllIlIllllIlIlllIIIl.getInteger(StructureComponent.llIlIIllIllIlI[StructureComponent.llIlIIllIllIll[7]]);
        EnumFacing horizontal;
        if (lIIlIIllIIIIIllI(llllllllllllIllIlIllllIlIlllIIll, StructureComponent.llIlIIllIllIll[3])) {
            horizontal = null;
            "".length();
            if ("   ".length() <= 0) {
                return;
            }
        }
        else {
            horizontal = EnumFacing.getHorizontal(llllllllllllIllIlIllllIlIlllIIll);
        }
        this.coordBaseMode = horizontal;
        this.componentType = llllllllllllIllIlIllllIlIlllIIIl.getInteger(StructureComponent.llIlIIllIllIlI[StructureComponent.llIlIIllIllIll[8]]);
        this.readStructureFromNBT(llllllllllllIllIlIllllIlIlllIIIl);
    }
    
    protected void randomlyPlaceBlock(final World llllllllllllIllIlIllllIIIIIlIIIl, final StructureBoundingBox llllllllllllIllIlIllllIIIIIlIIII, final Random llllllllllllIllIlIllllIIIIIIllll, final float llllllllllllIllIlIllllIIIIIIlllI, final int llllllllllllIllIlIllllIIIIIIllIl, final int llllllllllllIllIlIllllIIIIIIllII, final int llllllllllllIllIlIllllIIIIIIlIll, final IBlockState llllllllllllIllIlIllllIIIIIlIIll) {
        if (lIIlIIllIIIlIIII(lIIlIIllIIIIllll(llllllllllllIllIlIllllIIIIIIllll.nextFloat(), llllllllllllIllIlIllllIIIIIIlllI))) {
            this.setBlockState(llllllllllllIllIlIllllIIIIIlIIIl, llllllllllllIllIlIllllIIIIIlIIll, llllllllllllIllIlIllllIIIIIIllIl, llllllllllllIllIlIllllIIIIIIllII, llllllllllllIllIlIllllIIIIIIlIll, llllllllllllIllIlIllllIIIIIlIIII);
        }
    }
    
    public void buildComponent(final StructureComponent llllllllllllIllIlIllllIlIllIlllI, final List<StructureComponent> llllllllllllIllIlIllllIlIllIllIl, final Random llllllllllllIllIlIllllIlIllIllII) {
    }
    
    public abstract static class BlockSelector
    {
        protected /* synthetic */ IBlockState blockstate;
        
        public abstract void selectBlocks(final Random p0, final int p1, final int p2, final int p3, final boolean p4);
        
        public IBlockState getBlockState() {
            return this.blockstate;
        }
        
        public BlockSelector() {
            this.blockstate = Blocks.air.getDefaultState();
        }
    }
}
