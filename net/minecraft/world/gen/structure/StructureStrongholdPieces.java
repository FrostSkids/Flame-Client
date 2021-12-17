// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.world.gen.structure;

import java.util.Iterator;
import net.minecraft.item.Item;
import net.minecraft.init.Items;
import net.minecraft.util.WeightedRandomChestContent;
import net.minecraft.block.BlockStoneSlab;
import net.minecraft.block.BlockSilverfish;
import net.minecraft.block.BlockStoneBrick;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.block.properties.PropertyBool;
import net.minecraft.block.state.IBlockState;
import net.minecraft.tileentity.TileEntityMobSpawner;
import net.minecraft.util.Vec3i;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.BlockEndPortalFrame;
import net.minecraft.util.BlockPos;
import net.minecraft.init.Blocks;
import net.minecraft.world.World;
import net.minecraft.nbt.NBTTagCompound;
import java.util.Arrays;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.security.MessageDigest;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import com.google.common.collect.Lists;
import net.minecraft.util.EnumFacing;
import java.util.Random;
import java.util.List;

public class StructureStrongholdPieces
{
    private static final /* synthetic */ PieceWeight[] pieceWeightArray;
    private static /* synthetic */ List<PieceWeight> structurePieceList;
    private static final /* synthetic */ int[] lllIllIlllIIll;
    private static /* synthetic */ Class<? extends Stronghold> strongComponentType;
    private static final /* synthetic */ String[] lllIlIlllIlllI;
    static /* synthetic */ int totalWeight;
    private static final /* synthetic */ Stones strongholdStones;
    
    static {
        lIlIIlIlIIlllIII();
        lIlIIlIlIIlIlllI();
        final PieceWeight[] pieceWeightArray2 = new PieceWeight[StructureStrongholdPieces.lllIllIlllIIll[0]];
        pieceWeightArray2[StructureStrongholdPieces.lllIllIlllIIll[1]] = new PieceWeight(Straight.class, StructureStrongholdPieces.lllIllIlllIIll[2], StructureStrongholdPieces.lllIllIlllIIll[1]);
        pieceWeightArray2[StructureStrongholdPieces.lllIllIlllIIll[3]] = new PieceWeight(Prison.class, StructureStrongholdPieces.lllIllIlllIIll[4], StructureStrongholdPieces.lllIllIlllIIll[4]);
        pieceWeightArray2[StructureStrongholdPieces.lllIllIlllIIll[5]] = new PieceWeight(LeftTurn.class, StructureStrongholdPieces.lllIllIlllIIll[6], StructureStrongholdPieces.lllIllIlllIIll[1]);
        pieceWeightArray2[StructureStrongholdPieces.lllIllIlllIIll[7]] = new PieceWeight(RightTurn.class, StructureStrongholdPieces.lllIllIlllIIll[6], StructureStrongholdPieces.lllIllIlllIIll[1]);
        pieceWeightArray2[StructureStrongholdPieces.lllIllIlllIIll[8]] = new PieceWeight(RoomCrossing.class, StructureStrongholdPieces.lllIllIlllIIll[9], StructureStrongholdPieces.lllIllIlllIIll[10]);
        pieceWeightArray2[StructureStrongholdPieces.lllIllIlllIIll[4]] = new PieceWeight(StairsStraight.class, StructureStrongholdPieces.lllIllIlllIIll[4], StructureStrongholdPieces.lllIllIlllIIll[4]);
        pieceWeightArray2[StructureStrongholdPieces.lllIllIlllIIll[10]] = new PieceWeight(Stairs.class, StructureStrongholdPieces.lllIllIlllIIll[4], StructureStrongholdPieces.lllIllIlllIIll[4]);
        pieceWeightArray2[StructureStrongholdPieces.lllIllIlllIIll[11]] = new PieceWeight(Crossing.class, StructureStrongholdPieces.lllIllIlllIIll[4], StructureStrongholdPieces.lllIllIlllIIll[8]);
        pieceWeightArray2[StructureStrongholdPieces.lllIllIlllIIll[12]] = new PieceWeight(ChestCorridor.class, StructureStrongholdPieces.lllIllIlllIIll[4], StructureStrongholdPieces.lllIllIlllIIll[8]);
        pieceWeightArray2[StructureStrongholdPieces.lllIllIlllIIll[13]] = new PieceWeight(StructureStrongholdPieces.lllIllIlllIIll[9], StructureStrongholdPieces.lllIllIlllIIll[5]) {
            private static final /* synthetic */ int[] llIIIIlIIIlllI;
            
            private static boolean lIIIIllllIlIlIIl(final int llllllllllllIlllIlllIIIllllllIll) {
                return llllllllllllIlllIlllIIIllllllIll != 0;
            }
            
            private static void lIIIIllllIlIlIII() {
                (llIIIIlIIIlllI = new int[3])[0] = (0x26 ^ 0x22);
                StructureStrongholdPieces$1.llIIIIlIIIlllI[1] = " ".length();
                StructureStrongholdPieces$1.llIIIIlIIIlllI[2] = ((0x3A ^ 0x1F) & ~(0xA0 ^ 0x85));
            }
            
            private static boolean lIIIIllllIlIlIlI(final int llllllllllllIlllIlllIIIllllllllI, final int llllllllllllIlllIlllIIIlllllllIl) {
                return llllllllllllIlllIlllIIIllllllllI > llllllllllllIlllIlllIIIlllllllIl;
            }
            
            static {
                lIIIIllllIlIlIII();
            }
            
            @Override
            public boolean canSpawnMoreStructuresOfType(final int llllllllllllIlllIlllIIlIIIIIIIll) {
                if (lIIIIllllIlIlIIl(super.canSpawnMoreStructuresOfType(llllllllllllIlllIlllIIlIIIIIIIll) ? 1 : 0) && lIIIIllllIlIlIlI(llllllllllllIlllIlllIIlIIIIIIIll, StructureStrongholdPieces$1.llIIIIlIIIlllI[0])) {
                    return StructureStrongholdPieces$1.llIIIIlIIIlllI[1] != 0;
                }
                return StructureStrongholdPieces$1.llIIIIlIIIlllI[2] != 0;
            }
        };
        pieceWeightArray2[StructureStrongholdPieces.lllIllIlllIIll[9]] = new PieceWeight(StructureStrongholdPieces.lllIllIlllIIll[6], StructureStrongholdPieces.lllIllIlllIIll[3]) {
            private static final /* synthetic */ int[] llIlllllllIllI;
            
            private static boolean lIIllIlllIIlllll(final int llllllllllllIllIIIlIlIIlIIlIllIl, final int llllllllllllIllIIIlIlIIlIIlIllII) {
                return llllllllllllIllIIIlIlIIlIIlIllIl > llllllllllllIllIIIlIlIIlIIlIllII;
            }
            
            static {
                lIIllIlllIIlllIl();
            }
            
            private static void lIIllIlllIIlllIl() {
                (llIlllllllIllI = new int[3])[0] = (0x44 ^ 0x41);
                StructureStrongholdPieces$2.llIlllllllIllI[1] = " ".length();
                StructureStrongholdPieces$2.llIlllllllIllI[2] = ((112 + 92 - 21 + 65 ^ 81 + 153 - 223 + 161) & (0x82 ^ 0xC0 ^ (0x69 ^ 0x7F) ^ -" ".length()));
            }
            
            @Override
            public boolean canSpawnMoreStructuresOfType(final int llllllllllllIllIIIlIlIIlIIllIIII) {
                if (lIIllIlllIIllllI(super.canSpawnMoreStructuresOfType(llllllllllllIllIIIlIlIIlIIllIIII) ? 1 : 0) && lIIllIlllIIlllll(llllllllllllIllIIIlIlIIlIIllIIII, StructureStrongholdPieces$2.llIlllllllIllI[0])) {
                    return StructureStrongholdPieces$2.llIlllllllIllI[1] != 0;
                }
                return StructureStrongholdPieces$2.llIlllllllIllI[2] != 0;
            }
            
            private static boolean lIIllIlllIIllllI(final int llllllllllllIllIIIlIlIIlIIlIlIlI) {
                return llllllllllllIllIIIlIlIIlIIlIlIlI != 0;
            }
        };
        pieceWeightArray = pieceWeightArray2;
        strongholdStones = new Stones(null);
    }
    
    private static StructureComponent func_175953_c(final Stairs2 llllllllllllIlIllIIIllIIIIlIllll, final List<StructureComponent> llllllllllllIlIllIIIllIIIIlIlllI, final Random llllllllllllIlIllIIIllIIIIllIllI, final int llllllllllllIlIllIIIllIIIIllIlIl, final int llllllllllllIlIllIIIllIIIIlIlIll, final int llllllllllllIlIllIIIllIIIIlIlIlI, final EnumFacing llllllllllllIlIllIIIllIIIIllIIlI, final int llllllllllllIlIllIIIllIIIIlIlIII) {
        if (lIlIIlIlIlIIIIIl(llllllllllllIlIllIIIllIIIIlIlIII, StructureStrongholdPieces.lllIllIlllIIll[15])) {
            return null;
        }
        if (lIlIIlIlIlIIIIlI(Math.abs(llllllllllllIlIllIIIllIIIIllIlIl - llllllllllllIlIllIIIllIIIIlIllll.getBoundingBox().minX), StructureStrongholdPieces.lllIllIlllIIll[16]) && lIlIIlIlIlIIIIlI(Math.abs(llllllllllllIlIllIIIllIIIIlIlIlI - llllllllllllIlIllIIIllIIIIlIllll.getBoundingBox().minZ), StructureStrongholdPieces.lllIllIlllIIll[16])) {
            final StructureComponent llllllllllllIlIllIIIllIIIIllIIII = func_175955_b(llllllllllllIlIllIIIllIIIIlIllll, llllllllllllIlIllIIIllIIIIlIlllI, llllllllllllIlIllIIIllIIIIllIllI, llllllllllllIlIllIIIllIIIIllIlIl, llllllllllllIlIllIIIllIIIIlIlIll, llllllllllllIlIllIIIllIIIIlIlIlI, llllllllllllIlIllIIIllIIIIllIIlI, llllllllllllIlIllIIIllIIIIlIlIII + StructureStrongholdPieces.lllIllIlllIIll[3]);
            if (lIlIIlIlIIlllllI(llllllllllllIlIllIIIllIIIIllIIII)) {
                llllllllllllIlIllIIIllIIIIlIlllI.add(llllllllllllIlIllIIIllIIIIllIIII);
                "".length();
                llllllllllllIlIllIIIllIIIIlIllll.field_75026_c.add(llllllllllllIlIllIIIllIIIIllIIII);
                "".length();
            }
            return llllllllllllIlIllIIIllIIIIllIIII;
        }
        return null;
    }
    
    private static boolean lIlIIlIlIIlllIIl(final int llllllllllllIlIllIIIlIlllllIIIII, final int llllllllllllIlIllIIIlIllllIlllll) {
        return llllllllllllIlIllIIIlIlllllIIIII >= llllllllllllIlIllIIIlIllllIlllll;
    }
    
    private static boolean lIlIIlIlIIllllIl(final Object llllllllllllIlIllIIIlIllllIlIIII, final Object llllllllllllIlIllIIIlIllllIIllll) {
        return llllllllllllIlIllIIIlIllllIlIIII == llllllllllllIlIllIIIlIllllIIllll;
    }
    
    private static boolean lIlIIlIlIIlllIll(final int llllllllllllIlIllIIIlIllllIlllII, final int llllllllllllIlIllIIIlIllllIllIll) {
        return llllllllllllIlIllIIIlIllllIlllII < llllllllllllIlIllIIIlIllllIllIll;
    }
    
    private static boolean lIlIIlIlIlIIIIII(final int llllllllllllIlIllIIIlIllllIIlIll) {
        return llllllllllllIlIllIIIlIllllIIlIll != 0;
    }
    
    private static boolean lIlIIlIlIIllllll(final int llllllllllllIlIllIIIlIllllIIIlll) {
        return llllllllllllIlIllIIIlIllllIIIlll < 0;
    }
    
    public static void prepareStructurePieces() {
        StructureStrongholdPieces.structurePieceList = (List<PieceWeight>)Lists.newArrayList();
        final char llllllllllllIlIllIIIllIIlIIlIlIl;
        final double llllllllllllIlIllIIIllIIlIIlIllI = ((PieceWeight[])(Object)(llllllllllllIlIllIIIllIIlIIlIlIl = (char)(Object)StructureStrongholdPieces.pieceWeightArray)).length;
        int llllllllllllIlIllIIIllIIlIIlIlll = StructureStrongholdPieces.lllIllIlllIIll[1];
        "".length();
        if ((0x75 ^ 0x71) != (0x53 ^ 0x57)) {
            return;
        }
        while (!lIlIIlIlIIlllIIl(llllllllllllIlIllIIIllIIlIIlIlll, (int)llllllllllllIlIllIIIllIIlIIlIllI)) {
            final PieceWeight llllllllllllIlIllIIIllIIlIIllIIl = llllllllllllIlIllIIIllIIlIIlIlIl[llllllllllllIlIllIIIllIIlIIlIlll];
            llllllllllllIlIllIIIllIIlIIllIIl.instancesSpawned = StructureStrongholdPieces.lllIllIlllIIll[1];
            StructureStrongholdPieces.structurePieceList.add(llllllllllllIlIllIIIllIIlIIllIIl);
            "".length();
            ++llllllllllllIlIllIIIllIIlIIlIlll;
        }
        StructureStrongholdPieces.strongComponentType = null;
    }
    
    static /* synthetic */ void access$2(final Class llllllllllllIlIllIIIllIIIIlIIlIl) {
        StructureStrongholdPieces.strongComponentType = (Class<? extends Stronghold>)llllllllllllIlIllIIIllIIIIlIIlIl;
    }
    
    private static String lIlIIIlllIIlIIIl(String llllllllllllIlIllIIIlIlllllllIII, final String llllllllllllIlIllIIIlIllllllllII) {
        llllllllllllIlIllIIIlIlllllllIII = new String(Base64.getDecoder().decode(llllllllllllIlIllIIIlIlllllllIII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder llllllllllllIlIllIIIlIlllllllIll = new StringBuilder();
        final char[] llllllllllllIlIllIIIlIlllllllIlI = llllllllllllIlIllIIIlIllllllllII.toCharArray();
        int llllllllllllIlIllIIIlIlllllllIIl = StructureStrongholdPieces.lllIllIlllIIll[1];
        final char llllllllllllIlIllIIIlIllllllIIll = (Object)llllllllllllIlIllIIIlIlllllllIII.toCharArray();
        final int llllllllllllIlIllIIIlIllllllIIlI = llllllllllllIlIllIIIlIllllllIIll.length;
        short llllllllllllIlIllIIIlIllllllIIIl = (short)StructureStrongholdPieces.lllIllIlllIIll[1];
        while (lIlIIlIlIIlllIll(llllllllllllIlIllIIIlIllllllIIIl, llllllllllllIlIllIIIlIllllllIIlI)) {
            final char llllllllllllIlIllIIIlIlllllllllI = llllllllllllIlIllIIIlIllllllIIll[llllllllllllIlIllIIIlIllllllIIIl];
            llllllllllllIlIllIIIlIlllllllIll.append((char)(llllllllllllIlIllIIIlIlllllllllI ^ llllllllllllIlIllIIIlIlllllllIlI[llllllllllllIlIllIIIlIlllllllIIl % llllllllllllIlIllIIIlIlllllllIlI.length]));
            "".length();
            ++llllllllllllIlIllIIIlIlllllllIIl;
            ++llllllllllllIlIllIIIlIllllllIIIl;
            "".length();
            if (" ".length() == "   ".length()) {
                return null;
            }
        }
        return String.valueOf(llllllllllllIlIllIIIlIlllllllIll);
    }
    
    private static boolean lIlIIlIlIlIIIIIl(final int llllllllllllIlIllIIIlIllllIlIlII, final int llllllllllllIlIllIIIlIllllIlIIll) {
        return llllllllllllIlIllIIIlIllllIlIlII > llllllllllllIlIllIIIlIllllIlIIll;
    }
    
    private static void lIlIIlIlIIlIlllI() {
        (lllIlIlllIlllI = new String[StructureStrongholdPieces.lllIllIlllIIll[17]])[StructureStrongholdPieces.lllIllIlllIIll[1]] = lIlIIIlllIIIlllI("GybDRcHIVmI=", "cXoSB");
        StructureStrongholdPieces.lllIlIlllIlllI[StructureStrongholdPieces.lllIllIlllIIll[3]] = lIlIIIlllIIIllll("p+W06Gk0kZQ=", "bVLEI");
        StructureStrongholdPieces.lllIlIlllIlllI[StructureStrongholdPieces.lllIllIlllIIll[5]] = lIlIIIlllIIlIIIl("Hj9NCA==", "MwxKQ");
        StructureStrongholdPieces.lllIlIlllIlllI[StructureStrongholdPieces.lllIllIlllIIll[7]] = lIlIIIlllIIlIIIl("Iyk/Dg==", "pasZI");
        StructureStrongholdPieces.lllIlIlllIlllI[StructureStrongholdPieces.lllIllIlllIIll[8]] = lIlIIIlllIIIlllI("6C/ZJKjf/6s=", "spZFW");
        StructureStrongholdPieces.lllIlIlllIlllI[StructureStrongholdPieces.lllIllIlllIIll[4]] = lIlIIIlllIIIllll("3tySh77aUsI=", "PIKAg");
        StructureStrongholdPieces.lllIlIlllIlllI[StructureStrongholdPieces.lllIllIlllIIll[10]] = lIlIIIlllIIIlllI("fAGRctQbpIk=", "RVIij");
        StructureStrongholdPieces.lllIlIlllIlllI[StructureStrongholdPieces.lllIllIlllIIll[11]] = lIlIIIlllIIlIIIl("PQ8EIA==", "nGVtd");
        StructureStrongholdPieces.lllIlIlllIlllI[StructureStrongholdPieces.lllIllIlllIIll[12]] = lIlIIIlllIIIlllI("8ldQBu7F4eI=", "VYyOA");
        StructureStrongholdPieces.lllIlIlllIlllI[StructureStrongholdPieces.lllIllIlllIIll[13]] = lIlIIIlllIIIllll("fiG/8zofy0w=", "FnFJV");
        StructureStrongholdPieces.lllIlIlllIlllI[StructureStrongholdPieces.lllIllIlllIIll[9]] = lIlIIIlllIIlIIIl("CyYAHyYqGg==", "XnSkG");
        StructureStrongholdPieces.lllIlIlllIlllI[StructureStrongholdPieces.lllIllIlllIIll[0]] = lIlIIIlllIIlIIIl("FiIp", "EjzPA");
        StructureStrongholdPieces.lllIlIlllIlllI[StructureStrongholdPieces.lllIllIlllIIll[14]] = lIlIIIlllIIIllll("tNAqkK8apm4=", "EGZmV");
    }
    
    private static boolean lIlIIlIlIlIIIIlI(final int llllllllllllIlIllIIIlIllllIllIII, final int llllllllllllIlIllIIIlIllllIlIlll) {
        return llllllllllllIlIllIIIlIllllIllIII <= llllllllllllIlIllIIIlIllllIlIlll;
    }
    
    private static boolean lIlIIlIlIIlllIlI(final int llllllllllllIlIllIIIlIllllIIIlIl) {
        return llllllllllllIlIllIIIlIllllIIIlIl > 0;
    }
    
    private static boolean lIlIIlIlIIllllII(final int llllllllllllIlIllIIIlIllllIIlIIl) {
        return llllllllllllIlIllIIIlIllllIIlIIl == 0;
    }
    
    private static String lIlIIIlllIIIllll(final String llllllllllllIlIllIIIlIlllllIIllI, final String llllllllllllIlIllIIIlIlllllIIlll) {
        try {
            final SecretKeySpec llllllllllllIlIllIIIlIlllllIlIll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIlIllIIIlIlllllIIlll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher llllllllllllIlIllIIIlIlllllIlIlI = Cipher.getInstance("Blowfish");
            llllllllllllIlIllIIIlIlllllIlIlI.init(StructureStrongholdPieces.lllIllIlllIIll[5], llllllllllllIlIllIIIlIlllllIlIll);
            return new String(llllllllllllIlIllIIIlIlllllIlIlI.doFinal(Base64.getDecoder().decode(llllllllllllIlIllIIIlIlllllIIllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIlIllIIIlIlllllIlIIl) {
            llllllllllllIlIllIIIlIlllllIlIIl.printStackTrace();
            return null;
        }
    }
    
    private static boolean lIlIIlIlIIlllllI(final Object llllllllllllIlIllIIIlIllllIIllIl) {
        return llllllllllllIlIllIIIlIllllIIllIl != null;
    }
    
    private static boolean canAddStructurePieces() {
        boolean llllllllllllIlIllIIIllIIlIIIllIl = StructureStrongholdPieces.lllIllIlllIIll[1] != 0;
        StructureStrongholdPieces.totalWeight = StructureStrongholdPieces.lllIllIlllIIll[1];
        final float llllllllllllIlIllIIIllIIlIIIIllI = (float)StructureStrongholdPieces.structurePieceList.iterator();
        "".length();
        if ((0x31 ^ 0x35) <= -" ".length()) {
            return ((0x7 ^ 0x9) & ~(0xBA ^ 0xB4)) != 0x0;
        }
        while (!lIlIIlIlIIllllII(((Iterator)llllllllllllIlIllIIIllIIlIIIIllI).hasNext() ? 1 : 0)) {
            final PieceWeight llllllllllllIlIllIIIllIIlIIIlIll = ((Iterator<PieceWeight>)llllllllllllIlIllIIIllIIlIIIIllI).next();
            if (lIlIIlIlIIlllIlI(llllllllllllIlIllIIIllIIlIIIlIll.instancesLimit) && lIlIIlIlIIlllIll(llllllllllllIlIllIIIllIIlIIIlIll.instancesSpawned, llllllllllllIlIllIIIllIIlIIIlIll.instancesLimit)) {
                llllllllllllIlIllIIIllIIlIIIllIl = (StructureStrongholdPieces.lllIllIlllIIll[3] != 0);
            }
            StructureStrongholdPieces.totalWeight += llllllllllllIlIllIIIllIIlIIIlIll.pieceWeight;
        }
        return llllllllllllIlIllIIIllIIlIIIllIl;
    }
    
    private static Stronghold func_175955_b(final Stairs2 llllllllllllIlIllIIIllIIIlIlllII, final List<StructureComponent> llllllllllllIlIllIIIllIIIlIllIll, final Random llllllllllllIlIllIIIllIIIlIllIlI, final int llllllllllllIlIllIIIllIIIlIllIIl, final int llllllllllllIlIllIIIllIIIlIllIII, final int llllllllllllIlIllIIIllIIIlIlIlll, final EnumFacing llllllllllllIlIllIIIllIIIlIIlIII, final int llllllllllllIlIllIIIllIIIlIlIlIl) {
        if (lIlIIlIlIIllllII(canAddStructurePieces() ? 1 : 0)) {
            return null;
        }
        if (lIlIIlIlIIlllllI(StructureStrongholdPieces.strongComponentType)) {
            final Stronghold llllllllllllIlIllIIIllIIIlIlIlII = func_175954_a(StructureStrongholdPieces.strongComponentType, llllllllllllIlIllIIIllIIIlIllIll, llllllllllllIlIllIIIllIIIlIllIlI, llllllllllllIlIllIIIllIIIlIllIIl, llllllllllllIlIllIIIllIIIlIllIII, llllllllllllIlIllIIIllIIIlIlIlll, llllllllllllIlIllIIIllIIIlIIlIII, llllllllllllIlIllIIIllIIIlIlIlIl);
            StructureStrongholdPieces.strongComponentType = null;
            if (lIlIIlIlIIlllllI(llllllllllllIlIllIIIllIIIlIlIlII)) {
                return llllllllllllIlIllIIIllIIIlIlIlII;
            }
        }
        int llllllllllllIlIllIIIllIIIlIlIIll = StructureStrongholdPieces.lllIllIlllIIll[1];
        "".length();
        if (null != null) {
            return null;
        }
        while (!lIlIIlIlIIlllIIl(llllllllllllIlIllIIIllIIIlIlIIll, StructureStrongholdPieces.lllIllIlllIIll[4])) {
            ++llllllllllllIlIllIIIllIIIlIlIIll;
            int llllllllllllIlIllIIIllIIIlIlIIlI = llllllllllllIlIllIIIllIIIlIllIlI.nextInt(StructureStrongholdPieces.totalWeight);
            final double llllllllllllIlIllIIIllIIIlIIIIll = (double)StructureStrongholdPieces.structurePieceList.iterator();
            "".length();
            if (-"   ".length() >= 0) {
                return null;
            }
            while (!lIlIIlIlIIllllII(((Iterator)llllllllllllIlIllIIIllIIIlIIIIll).hasNext() ? 1 : 0)) {
                final PieceWeight llllllllllllIlIllIIIllIIIlIlIIIl = ((Iterator<PieceWeight>)llllllllllllIlIllIIIllIIIlIIIIll).next();
                llllllllllllIlIllIIIllIIIlIlIIlI -= llllllllllllIlIllIIIllIIIlIlIIIl.pieceWeight;
                if (lIlIIlIlIIllllll(llllllllllllIlIllIIIllIIIlIlIIlI)) {
                    if (!lIlIIlIlIlIIIIII(llllllllllllIlIllIIIllIIIlIlIIIl.canSpawnMoreStructuresOfType(llllllllllllIlIllIIIllIIIlIlIlIl) ? 1 : 0)) {
                        break;
                    }
                    if (lIlIIlIlIIllllIl(llllllllllllIlIllIIIllIIIlIlIIIl, llllllllllllIlIllIIIllIIIlIlllII.strongholdPieceWeight)) {
                        "".length();
                        if ("  ".length() < 0) {
                            return null;
                        }
                        break;
                    }
                    else {
                        final Stronghold llllllllllllIlIllIIIllIIIlIlIIII = func_175954_a(llllllllllllIlIllIIIllIIIlIlIIIl.pieceClass, llllllllllllIlIllIIIllIIIlIllIll, llllllllllllIlIllIIIllIIIlIllIlI, llllllllllllIlIllIIIllIIIlIllIIl, llllllllllllIlIllIIIllIIIlIllIII, llllllllllllIlIllIIIllIIIlIlIlll, llllllllllllIlIllIIIllIIIlIIlIII, llllllllllllIlIllIIIllIIIlIlIlIl);
                        if (lIlIIlIlIIlllllI(llllllllllllIlIllIIIllIIIlIlIIII)) {
                            final PieceWeight pieceWeight = llllllllllllIlIllIIIllIIIlIlIIIl;
                            pieceWeight.instancesSpawned += StructureStrongholdPieces.lllIllIlllIIll[3];
                            llllllllllllIlIllIIIllIIIlIlllII.strongholdPieceWeight = llllllllllllIlIllIIIllIIIlIlIIIl;
                            if (lIlIIlIlIIllllII(llllllllllllIlIllIIIllIIIlIlIIIl.canSpawnMoreStructures() ? 1 : 0)) {
                                StructureStrongholdPieces.structurePieceList.remove(llllllllllllIlIllIIIllIIIlIlIIIl);
                                "".length();
                            }
                            return llllllllllllIlIllIIIllIIIlIlIIII;
                        }
                        continue;
                    }
                }
            }
        }
        final StructureBoundingBox llllllllllllIlIllIIIllIIIlIIllll = Corridor.func_175869_a(llllllllllllIlIllIIIllIIIlIllIll, llllllllllllIlIllIIIllIIIlIllIlI, llllllllllllIlIllIIIllIIIlIllIIl, llllllllllllIlIllIIIllIIIlIllIII, llllllllllllIlIllIIIllIIIlIlIlll, llllllllllllIlIllIIIllIIIlIIlIII);
        if (lIlIIlIlIIlllllI(llllllllllllIlIllIIIllIIIlIIllll) && lIlIIlIlIlIIIIIl(llllllllllllIlIllIIIllIIIlIIllll.minY, StructureStrongholdPieces.lllIllIlllIIll[3])) {
            return new Corridor(llllllllllllIlIllIIIllIIIlIlIlIl, llllllllllllIlIllIIIllIIIlIllIlI, llllllllllllIlIllIIIllIIIlIIllll, llllllllllllIlIllIIIllIIIlIIlIII);
        }
        return null;
    }
    
    private static void lIlIIlIlIIlllIII() {
        (lllIllIlllIIll = new int[18])[0] = (0x85 ^ 0x8E);
        StructureStrongholdPieces.lllIllIlllIIll[1] = ((0x41 ^ 0x58 ^ ((0xAD ^ 0x9E) & ~(0xA5 ^ 0x96))) & (16 + 9 + 109 + 8 ^ 77 + 99 - 173 + 148 ^ -" ".length()));
        StructureStrongholdPieces.lllIllIlllIIll[2] = (0xC6 ^ 0xB8 ^ (0xF9 ^ 0xAF));
        StructureStrongholdPieces.lllIllIlllIIll[3] = " ".length();
        StructureStrongholdPieces.lllIllIlllIIll[4] = (98 + 95 - 191 + 135 ^ 28 + 94 - 81 + 99);
        StructureStrongholdPieces.lllIllIlllIIll[5] = "  ".length();
        StructureStrongholdPieces.lllIllIlllIIll[6] = (0xA8 ^ 0xBC);
        StructureStrongholdPieces.lllIllIlllIIll[7] = "   ".length();
        StructureStrongholdPieces.lllIllIlllIIll[8] = (0x3E ^ 0x3A);
        StructureStrongholdPieces.lllIllIlllIIll[9] = (0x47 ^ 0x2E ^ (0x66 ^ 0x5));
        StructureStrongholdPieces.lllIllIlllIIll[10] = (6 + 123 - 94 + 93 ^ 56 + 33 - 82 + 127);
        StructureStrongholdPieces.lllIllIlllIIll[11] = (0x17 ^ 0x4F ^ (0xD4 ^ 0x8B));
        StructureStrongholdPieces.lllIllIlllIIll[12] = (0xB3 ^ 0xBB);
        StructureStrongholdPieces.lllIllIlllIIll[13] = (67 + 38 - 56 + 110 ^ 118 + 91 - 65 + 6);
        StructureStrongholdPieces.lllIllIlllIIll[14] = (0xEC ^ 0x96 ^ (0xA ^ 0x7C));
        StructureStrongholdPieces.lllIllIlllIIll[15] = (0x6 ^ 0x34);
        StructureStrongholdPieces.lllIllIlllIIll[16] = (0xB4 ^ 0xC4);
        StructureStrongholdPieces.lllIllIlllIIll[17] = (0x57 ^ 0x5A);
    }
    
    public static void registerStrongholdPieces() {
        MapGenStructureIO.registerStructureComponent(ChestCorridor.class, StructureStrongholdPieces.lllIlIlllIlllI[StructureStrongholdPieces.lllIllIlllIIll[1]]);
        MapGenStructureIO.registerStructureComponent(Corridor.class, StructureStrongholdPieces.lllIlIlllIlllI[StructureStrongholdPieces.lllIllIlllIIll[3]]);
        MapGenStructureIO.registerStructureComponent(Crossing.class, StructureStrongholdPieces.lllIlIlllIlllI[StructureStrongholdPieces.lllIllIlllIIll[5]]);
        MapGenStructureIO.registerStructureComponent(LeftTurn.class, StructureStrongholdPieces.lllIlIlllIlllI[StructureStrongholdPieces.lllIllIlllIIll[7]]);
        MapGenStructureIO.registerStructureComponent(Library.class, StructureStrongholdPieces.lllIlIlllIlllI[StructureStrongholdPieces.lllIllIlllIIll[8]]);
        MapGenStructureIO.registerStructureComponent(PortalRoom.class, StructureStrongholdPieces.lllIlIlllIlllI[StructureStrongholdPieces.lllIllIlllIIll[4]]);
        MapGenStructureIO.registerStructureComponent(Prison.class, StructureStrongholdPieces.lllIlIlllIlllI[StructureStrongholdPieces.lllIllIlllIIll[10]]);
        MapGenStructureIO.registerStructureComponent(RightTurn.class, StructureStrongholdPieces.lllIlIlllIlllI[StructureStrongholdPieces.lllIllIlllIIll[11]]);
        MapGenStructureIO.registerStructureComponent(RoomCrossing.class, StructureStrongholdPieces.lllIlIlllIlllI[StructureStrongholdPieces.lllIllIlllIIll[12]]);
        MapGenStructureIO.registerStructureComponent(Stairs.class, StructureStrongholdPieces.lllIlIlllIlllI[StructureStrongholdPieces.lllIllIlllIIll[13]]);
        MapGenStructureIO.registerStructureComponent(Stairs2.class, StructureStrongholdPieces.lllIlIlllIlllI[StructureStrongholdPieces.lllIllIlllIIll[9]]);
        MapGenStructureIO.registerStructureComponent(Straight.class, StructureStrongholdPieces.lllIlIlllIlllI[StructureStrongholdPieces.lllIllIlllIIll[0]]);
        MapGenStructureIO.registerStructureComponent(StairsStraight.class, StructureStrongholdPieces.lllIlIlllIlllI[StructureStrongholdPieces.lllIllIlllIIll[14]]);
    }
    
    private static Stronghold func_175954_a(final Class<? extends Stronghold> llllllllllllIlIllIIIllIIIllllIll, final List<StructureComponent> llllllllllllIlIllIIIllIIIlllIIIl, final Random llllllllllllIlIllIIIllIIIllllIIl, final int llllllllllllIlIllIIIllIIIllllIII, final int llllllllllllIlIllIIIllIIIlllIlll, final int llllllllllllIlIllIIIllIIIllIllIl, final EnumFacing llllllllllllIlIllIIIllIIIlllIlIl, final int llllllllllllIlIllIIIllIIIllIlIll) {
        Stronghold llllllllllllIlIllIIIllIIIlllIIll = null;
        if (lIlIIlIlIIllllIl(llllllllllllIlIllIIIllIIIllllIll, Straight.class)) {
            llllllllllllIlIllIIIllIIIlllIIll = Straight.func_175862_a(llllllllllllIlIllIIIllIIIlllIIIl, llllllllllllIlIllIIIllIIIllllIIl, llllllllllllIlIllIIIllIIIllllIII, llllllllllllIlIllIIIllIIIlllIlll, llllllllllllIlIllIIIllIIIllIllIl, llllllllllllIlIllIIIllIIIlllIlIl, llllllllllllIlIllIIIllIIIllIlIll);
            "".length();
            if ("   ".length() != "   ".length()) {
                return null;
            }
        }
        else if (lIlIIlIlIIllllIl(llllllllllllIlIllIIIllIIIllllIll, Prison.class)) {
            llllllllllllIlIllIIIllIIIlllIIll = Prison.func_175860_a(llllllllllllIlIllIIIllIIIlllIIIl, llllllllllllIlIllIIIllIIIllllIIl, llllllllllllIlIllIIIllIIIllllIII, llllllllllllIlIllIIIllIIIlllIlll, llllllllllllIlIllIIIllIIIllIllIl, llllllllllllIlIllIIIllIIIlllIlIl, llllllllllllIlIllIIIllIIIllIlIll);
            "".length();
            if (null != null) {
                return null;
            }
        }
        else if (lIlIIlIlIIllllIl(llllllllllllIlIllIIIllIIIllllIll, LeftTurn.class)) {
            llllllllllllIlIllIIIllIIIlllIIll = LeftTurn.func_175867_a(llllllllllllIlIllIIIllIIIlllIIIl, llllllllllllIlIllIIIllIIIllllIIl, llllllllllllIlIllIIIllIIIllllIII, llllllllllllIlIllIIIllIIIlllIlll, llllllllllllIlIllIIIllIIIllIllIl, llllllllllllIlIllIIIllIIIlllIlIl, llllllllllllIlIllIIIllIIIllIlIll);
            "".length();
            if ("   ".length() >= (0x20 ^ 0x24)) {
                return null;
            }
        }
        else if (lIlIIlIlIIllllIl(llllllllllllIlIllIIIllIIIllllIll, RightTurn.class)) {
            llllllllllllIlIllIIIllIIIlllIIll = LeftTurn.func_175867_a(llllllllllllIlIllIIIllIIIlllIIIl, llllllllllllIlIllIIIllIIIllllIIl, llllllllllllIlIllIIIllIIIllllIII, llllllllllllIlIllIIIllIIIlllIlll, llllllllllllIlIllIIIllIIIllIllIl, llllllllllllIlIllIIIllIIIlllIlIl, llllllllllllIlIllIIIllIIIllIlIll);
            "".length();
            if (((0x42 ^ 0x10 ^ (0x8 ^ 0x3A)) & (0x3 ^ 0x54 ^ (0xF2 ^ 0xC5) ^ -" ".length())) >= (0x50 ^ 0xA ^ (0x22 ^ 0x7C))) {
                return null;
            }
        }
        else if (lIlIIlIlIIllllIl(llllllllllllIlIllIIIllIIIllllIll, RoomCrossing.class)) {
            llllllllllllIlIllIIIllIIIlllIIll = RoomCrossing.func_175859_a(llllllllllllIlIllIIIllIIIlllIIIl, llllllllllllIlIllIIIllIIIllllIIl, llllllllllllIlIllIIIllIIIllllIII, llllllllllllIlIllIIIllIIIlllIlll, llllllllllllIlIllIIIllIIIllIllIl, llllllllllllIlIllIIIllIIIlllIlIl, llllllllllllIlIllIIIllIIIllIlIll);
            "".length();
            if (" ".length() != " ".length()) {
                return null;
            }
        }
        else if (lIlIIlIlIIllllIl(llllllllllllIlIllIIIllIIIllllIll, StairsStraight.class)) {
            llllllllllllIlIllIIIllIIIlllIIll = StairsStraight.func_175861_a(llllllllllllIlIllIIIllIIIlllIIIl, llllllllllllIlIllIIIllIIIllllIIl, llllllllllllIlIllIIIllIIIllllIII, llllllllllllIlIllIIIllIIIlllIlll, llllllllllllIlIllIIIllIIIllIllIl, llllllllllllIlIllIIIllIIIlllIlIl, llllllllllllIlIllIIIllIIIllIlIll);
            "".length();
            if ("   ".length() < 0) {
                return null;
            }
        }
        else if (lIlIIlIlIIllllIl(llllllllllllIlIllIIIllIIIllllIll, Stairs.class)) {
            llllllllllllIlIllIIIllIIIlllIIll = Stairs.func_175863_a(llllllllllllIlIllIIIllIIIlllIIIl, llllllllllllIlIllIIIllIIIllllIIl, llllllllllllIlIllIIIllIIIllllIII, llllllllllllIlIllIIIllIIIlllIlll, llllllllllllIlIllIIIllIIIllIllIl, llllllllllllIlIllIIIllIIIlllIlIl, llllllllllllIlIllIIIllIIIllIlIll);
            "".length();
            if (-" ".length() == "   ".length()) {
                return null;
            }
        }
        else if (lIlIIlIlIIllllIl(llllllllllllIlIllIIIllIIIllllIll, Crossing.class)) {
            llllllllllllIlIllIIIllIIIlllIIll = Crossing.func_175866_a(llllllllllllIlIllIIIllIIIlllIIIl, llllllllllllIlIllIIIllIIIllllIIl, llllllllllllIlIllIIIllIIIllllIII, llllllllllllIlIllIIIllIIIlllIlll, llllllllllllIlIllIIIllIIIllIllIl, llllllllllllIlIllIIIllIIIlllIlIl, llllllllllllIlIllIIIllIIIllIlIll);
            "".length();
            if (" ".length() != " ".length()) {
                return null;
            }
        }
        else if (lIlIIlIlIIllllIl(llllllllllllIlIllIIIllIIIllllIll, ChestCorridor.class)) {
            llllllllllllIlIllIIIllIIIlllIIll = ChestCorridor.func_175868_a(llllllllllllIlIllIIIllIIIlllIIIl, llllllllllllIlIllIIIllIIIllllIIl, llllllllllllIlIllIIIllIIIllllIII, llllllllllllIlIllIIIllIIIlllIlll, llllllllllllIlIllIIIllIIIllIllIl, llllllllllllIlIllIIIllIIIlllIlIl, llllllllllllIlIllIIIllIIIllIlIll);
            "".length();
            if (" ".length() == "  ".length()) {
                return null;
            }
        }
        else if (lIlIIlIlIIllllIl(llllllllllllIlIllIIIllIIIllllIll, Library.class)) {
            llllllllllllIlIllIIIllIIIlllIIll = Library.func_175864_a(llllllllllllIlIllIIIllIIIlllIIIl, llllllllllllIlIllIIIllIIIllllIIl, llllllllllllIlIllIIIllIIIllllIII, llllllllllllIlIllIIIllIIIlllIlll, llllllllllllIlIllIIIllIIIllIllIl, llllllllllllIlIllIIIllIIIlllIlIl, llllllllllllIlIllIIIllIIIllIlIll);
            "".length();
            if (" ".length() <= -" ".length()) {
                return null;
            }
        }
        else if (lIlIIlIlIIllllIl(llllllllllllIlIllIIIllIIIllllIll, PortalRoom.class)) {
            llllllllllllIlIllIIIllIIIlllIIll = PortalRoom.func_175865_a(llllllllllllIlIllIIIllIIIlllIIIl, llllllllllllIlIllIIIllIIIllllIIl, llllllllllllIlIllIIIllIIIllllIII, llllllllllllIlIllIIIllIIIlllIlll, llllllllllllIlIllIIIllIIIllIllIl, llllllllllllIlIllIIIllIIIlllIlIl, llllllllllllIlIllIIIllIIIllIlIll);
        }
        return llllllllllllIlIllIIIllIIIlllIIll;
    }
    
    private static String lIlIIIlllIIIlllI(final String llllllllllllIlIllIIIllIIIIIIlIll, final String llllllllllllIlIllIIIllIIIIIIlIlI) {
        try {
            final SecretKeySpec llllllllllllIlIllIIIllIIIIIlIIII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIlIllIIIllIIIIIIlIlI.getBytes(StandardCharsets.UTF_8)), StructureStrongholdPieces.lllIllIlllIIll[12]), "DES");
            final Cipher llllllllllllIlIllIIIllIIIIIIllll = Cipher.getInstance("DES");
            llllllllllllIlIllIIIllIIIIIIllll.init(StructureStrongholdPieces.lllIllIlllIIll[5], llllllllllllIlIllIIIllIIIIIlIIII);
            return new String(llllllllllllIlIllIIIllIIIIIIllll.doFinal(Base64.getDecoder().decode(llllllllllllIlIllIIIllIIIIIIlIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIlIllIIIllIIIIIIlllI) {
            llllllllllllIlIllIIIllIIIIIIlllI.printStackTrace();
            return null;
        }
    }
    
    public static class Corridor extends Stronghold
    {
        private /* synthetic */ int field_74993_a;
        private static final /* synthetic */ int[] lIIIlllIIlIIll;
        private static final /* synthetic */ String[] lIIIlllIIlIIlI;
        
        private static boolean llIIIlIlllllIlI(final int lllllllllllllIIlllllIlllIIlIIIlI, final int lllllllllllllIIlllllIlllIIlIIIIl) {
            return lllllllllllllIIlllllIlllIIlIIIlI > lllllllllllllIIlllllIlllIIlIIIIl;
        }
        
        private static String llIIIlIllllIIII(final String lllllllllllllIIlllllIlllIlIIlllI, final String lllllllllllllIIlllllIlllIlIIllIl) {
            try {
                final SecretKeySpec lllllllllllllIIlllllIlllIlIlIIIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIIlllllIlllIlIIllIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
                final Cipher lllllllllllllIIlllllIlllIlIlIIII = Cipher.getInstance("Blowfish");
                lllllllllllllIIlllllIlllIlIlIIII.init(Corridor.lIIIlllIIlIIll[6], lllllllllllllIIlllllIlllIlIlIIIl);
                return new String(lllllllllllllIIlllllIlllIlIlIIII.doFinal(Base64.getDecoder().decode(lllllllllllllIIlllllIlllIlIIlllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
            }
            catch (Exception lllllllllllllIIlllllIlllIlIIllll) {
                lllllllllllllIIlllllIlllIlIIllll.printStackTrace();
                return null;
            }
        }
        
        private static boolean llIIIlIllllIllI(final int lllllllllllllIIlllllIlllIIlIlllI, final int lllllllllllllIIlllllIlllIIlIllIl) {
            return lllllllllllllIIlllllIlllIIlIlllI == lllllllllllllIIlllllIlllIIlIllIl;
        }
        
        private static void llIIIlIllllIIlI() {
            (lIIIlllIIlIIlI = new String[Corridor.lIIIlllIIlIIll[6]])[Corridor.lIIIlllIIlIIll[0]] = llIIIlIllllIIII("xuit6ijxR+U=", "AFWWQ");
            Corridor.lIIIlllIIlIIlI[Corridor.lIIIlllIIlIIll[1]] = llIIIlIllllIIIl("FCYsEQY=", "GRIau");
        }
        
        private static void llIIIlIllllIIll() {
            (lIIIlllIIlIIll = new int[7])[0] = ((0x18 ^ 0x10) & ~(0x76 ^ 0x7E));
            Corridor.lIIIlllIIlIIll[1] = " ".length();
            Corridor.lIIIlllIIlIIll[2] = "   ".length();
            Corridor.lIIIlllIIlIIll[3] = -" ".length();
            Corridor.lIIIlllIIlIIll[4] = (0x52 ^ 0x57);
            Corridor.lIIIlllIIlIIll[5] = (0x30 ^ 0x34);
            Corridor.lIIIlllIIlIIll[6] = "  ".length();
        }
        
        private static boolean llIIIlIlllllIll(final int lllllllllllllIIlllllIlllIIlIlIlI, final int lllllllllllllIIlllllIlllIIlIlIIl) {
            return lllllllllllllIIlllllIlllIIlIlIlI >= lllllllllllllIIlllllIlllIIlIlIIl;
        }
        
        public static StructureBoundingBox func_175869_a(final List<StructureComponent> lllllllllllllIIlllllIlllIllllIII, final Random lllllllllllllIIlllllIlllIlllIlll, final int lllllllllllllIIlllllIlllIlllIllI, final int lllllllllllllIIlllllIlllIlllIlIl, final int lllllllllllllIIlllllIlllIlllIlII, final EnumFacing lllllllllllllIIlllllIlllIlllIIll) {
            final int lllllllllllllIIlllllIlllIlllIIlI = Corridor.lIIIlllIIlIIll[2];
            StructureBoundingBox lllllllllllllIIlllllIlllIlllIIIl = StructureBoundingBox.getComponentToAddBoundingBox(lllllllllllllIIlllllIlllIlllIllI, lllllllllllllIIlllllIlllIlllIlIl, lllllllllllllIIlllllIlllIlllIlII, Corridor.lIIIlllIIlIIll[3], Corridor.lIIIlllIIlIIll[3], Corridor.lIIIlllIIlIIll[0], Corridor.lIIIlllIIlIIll[4], Corridor.lIIIlllIIlIIll[4], Corridor.lIIIlllIIlIIll[5], lllllllllllllIIlllllIlllIlllIIll);
            final StructureComponent lllllllllllllIIlllllIlllIlllIIII = StructureComponent.findIntersecting(lllllllllllllIIlllllIlllIllllIII, lllllllllllllIIlllllIlllIlllIIIl);
            if (llIIIlIllllIlIl(lllllllllllllIIlllllIlllIlllIIII)) {
                return null;
            }
            if (llIIIlIllllIllI(lllllllllllllIIlllllIlllIlllIIII.getBoundingBox().minY, lllllllllllllIIlllllIlllIlllIIIl.minY)) {
                int lllllllllllllIIlllllIlllIllIllll = Corridor.lIIIlllIIlIIll[2];
                "".length();
                if (null != null) {
                    return null;
                }
                while (!llIIIlIlllllIII(lllllllllllllIIlllllIlllIllIllll, Corridor.lIIIlllIIlIIll[1])) {
                    lllllllllllllIIlllllIlllIlllIIIl = StructureBoundingBox.getComponentToAddBoundingBox(lllllllllllllIIlllllIlllIlllIllI, lllllllllllllIIlllllIlllIlllIlIl, lllllllllllllIIlllllIlllIlllIlII, Corridor.lIIIlllIIlIIll[3], Corridor.lIIIlllIIlIIll[3], Corridor.lIIIlllIIlIIll[0], Corridor.lIIIlllIIlIIll[4], Corridor.lIIIlllIIlIIll[4], lllllllllllllIIlllllIlllIllIllll - Corridor.lIIIlllIIlIIll[1], lllllllllllllIIlllllIlllIlllIIll);
                    if (llIIIlIllllIlll(lllllllllllllIIlllllIlllIlllIIII.getBoundingBox().intersectsWith(lllllllllllllIIlllllIlllIlllIIIl) ? 1 : 0)) {
                        return StructureBoundingBox.getComponentToAddBoundingBox(lllllllllllllIIlllllIlllIlllIllI, lllllllllllllIIlllllIlllIlllIlIl, lllllllllllllIIlllllIlllIlllIlII, Corridor.lIIIlllIIlIIll[3], Corridor.lIIIlllIIlIIll[3], Corridor.lIIIlllIIlIIll[0], Corridor.lIIIlllIIlIIll[4], Corridor.lIIIlllIIlIIll[4], lllllllllllllIIlllllIlllIllIllll, lllllllllllllIIlllllIlllIlllIIll);
                    }
                    --lllllllllllllIIlllllIlllIllIllll;
                }
            }
            return null;
        }
        
        private static boolean llIIIlIllllIlIl(final Object lllllllllllllIIlllllIlllIIIllIll) {
            return lllllllllllllIIlllllIlllIIIllIll == null;
        }
        
        public Corridor(final int lllllllllllllIIlllllIllllIIlIIII, final Random lllllllllllllIIlllllIllllIIlIlII, final StructureBoundingBox lllllllllllllIIlllllIllllIIlIIll, final EnumFacing lllllllllllllIIlllllIllllIIlIIlI) {
            super(lllllllllllllIIlllllIllllIIlIIII);
            this.coordBaseMode = lllllllllllllIIlllllIllllIIlIIlI;
            this.boundingBox = lllllllllllllIIlllllIllllIIlIIll;
            int field_74993_a;
            if (llIIIlIllllIlII(lllllllllllllIIlllllIllllIIlIIlI, EnumFacing.NORTH) && llIIIlIllllIlII(lllllllllllllIIlllllIllllIIlIIlI, EnumFacing.SOUTH)) {
                field_74993_a = lllllllllllllIIlllllIllllIIlIIll.getXSize();
                "".length();
                if ("   ".length() <= -" ".length()) {
                    throw null;
                }
            }
            else {
                field_74993_a = lllllllllllllIIlllllIllllIIlIIll.getZSize();
            }
            this.field_74993_a = field_74993_a;
        }
        
        @Override
        protected void writeStructureToNBT(final NBTTagCompound lllllllllllllIIlllllIllllIIIlIII) {
            super.writeStructureToNBT(lllllllllllllIIlllllIllllIIIlIII);
            lllllllllllllIIlllllIllllIIIlIII.setInteger(Corridor.lIIIlllIIlIIlI[Corridor.lIIIlllIIlIIll[0]], this.field_74993_a);
        }
        
        static {
            llIIIlIllllIIll();
            llIIIlIllllIIlI();
        }
        
        public Corridor() {
        }
        
        private static boolean llIIIlIllllIlll(final int lllllllllllllIIlllllIlllIIIlIlll) {
            return lllllllllllllIIlllllIlllIIIlIlll == 0;
        }
        
        private static boolean llIIIlIllllIlII(final Object lllllllllllllIIlllllIlllIIIllllI, final Object lllllllllllllIIlllllIlllIIIlllIl) {
            return lllllllllllllIIlllllIlllIIIllllI != lllllllllllllIIlllllIlllIIIlllIl;
        }
        
        private static boolean llIIIlIlllllIII(final int lllllllllllllIIlllllIlllIIlIIllI, final int lllllllllllllIIlllllIlllIIlIIlIl) {
            return lllllllllllllIIlllllIlllIIlIIllI < lllllllllllllIIlllllIlllIIlIIlIl;
        }
        
        @Override
        protected void readStructureFromNBT(final NBTTagCompound lllllllllllllIIlllllIllllIIIIIlI) {
            super.readStructureFromNBT(lllllllllllllIIlllllIllllIIIIIlI);
            this.field_74993_a = lllllllllllllIIlllllIllllIIIIIlI.getInteger(Corridor.lIIIlllIIlIIlI[Corridor.lIIIlllIIlIIll[1]]);
        }
        
        private static String llIIIlIllllIIIl(String lllllllllllllIIlllllIlllIIlllIIl, final String lllllllllllllIIlllllIlllIIlllIII) {
            lllllllllllllIIlllllIlllIIlllIIl = new String(Base64.getDecoder().decode(lllllllllllllIIlllllIlllIIlllIIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
            final StringBuilder lllllllllllllIIlllllIlllIIllllII = new StringBuilder();
            final char[] lllllllllllllIIlllllIlllIIlllIll = lllllllllllllIIlllllIlllIIlllIII.toCharArray();
            int lllllllllllllIIlllllIlllIIlllIlI = Corridor.lIIIlllIIlIIll[0];
            final short lllllllllllllIIlllllIlllIIllIlII = (Object)lllllllllllllIIlllllIlllIIlllIIl.toCharArray();
            final float lllllllllllllIIlllllIlllIIllIIll = lllllllllllllIIlllllIlllIIllIlII.length;
            int lllllllllllllIIlllllIlllIIllIIlI = Corridor.lIIIlllIIlIIll[0];
            while (llIIIlIlllllIII(lllllllllllllIIlllllIlllIIllIIlI, (int)lllllllllllllIIlllllIlllIIllIIll)) {
                final char lllllllllllllIIlllllIlllIIllllll = lllllllllllllIIlllllIlllIIllIlII[lllllllllllllIIlllllIlllIIllIIlI];
                lllllllllllllIIlllllIlllIIllllII.append((char)(lllllllllllllIIlllllIlllIIllllll ^ lllllllllllllIIlllllIlllIIlllIll[lllllllllllllIIlllllIlllIIlllIlI % lllllllllllllIIlllllIlllIIlllIll.length]));
                "".length();
                ++lllllllllllllIIlllllIlllIIlllIlI;
                ++lllllllllllllIIlllllIlllIIllIIlI;
                "".length();
                if (null != null) {
                    return null;
                }
            }
            return String.valueOf(lllllllllllllIIlllllIlllIIllllII);
        }
        
        private static boolean llIIIlIlllllIIl(final int lllllllllllllIIlllllIlllIIIllIIl) {
            return lllllllllllllIIlllllIlllIIIllIIl != 0;
        }
        
        @Override
        public boolean addComponentParts(final World lllllllllllllIIlllllIlllIlIlllll, final Random lllllllllllllIIlllllIlllIlIllllI, final StructureBoundingBox lllllllllllllIIlllllIlllIlIlllIl) {
            if (llIIIlIlllllIIl(this.isLiquidInStructureBoundingBox(lllllllllllllIIlllllIlllIlIlllll, lllllllllllllIIlllllIlllIlIlllIl) ? 1 : 0)) {
                return Corridor.lIIIlllIIlIIll[0] != 0;
            }
            int lllllllllllllIIlllllIlllIlIlllII = Corridor.lIIIlllIIlIIll[0];
            "".length();
            if ((0xB0 ^ 0xB4) < 0) {
                return ((0xD8 ^ 0x89) & ~(0x95 ^ 0xC4)) != 0x0;
            }
            while (!llIIIlIlllllIll(lllllllllllllIIlllllIlllIlIlllII, this.field_74993_a)) {
                this.setBlockState(lllllllllllllIIlllllIlllIlIlllll, Blocks.stonebrick.getDefaultState(), Corridor.lIIIlllIIlIIll[0], Corridor.lIIIlllIIlIIll[0], lllllllllllllIIlllllIlllIlIlllII, lllllllllllllIIlllllIlllIlIlllIl);
                this.setBlockState(lllllllllllllIIlllllIlllIlIlllll, Blocks.stonebrick.getDefaultState(), Corridor.lIIIlllIIlIIll[1], Corridor.lIIIlllIIlIIll[0], lllllllllllllIIlllllIlllIlIlllII, lllllllllllllIIlllllIlllIlIlllIl);
                this.setBlockState(lllllllllllllIIlllllIlllIlIlllll, Blocks.stonebrick.getDefaultState(), Corridor.lIIIlllIIlIIll[6], Corridor.lIIIlllIIlIIll[0], lllllllllllllIIlllllIlllIlIlllII, lllllllllllllIIlllllIlllIlIlllIl);
                this.setBlockState(lllllllllllllIIlllllIlllIlIlllll, Blocks.stonebrick.getDefaultState(), Corridor.lIIIlllIIlIIll[2], Corridor.lIIIlllIIlIIll[0], lllllllllllllIIlllllIlllIlIlllII, lllllllllllllIIlllllIlllIlIlllIl);
                this.setBlockState(lllllllllllllIIlllllIlllIlIlllll, Blocks.stonebrick.getDefaultState(), Corridor.lIIIlllIIlIIll[5], Corridor.lIIIlllIIlIIll[0], lllllllllllllIIlllllIlllIlIlllII, lllllllllllllIIlllllIlllIlIlllIl);
                int lllllllllllllIIlllllIlllIlIllIll = Corridor.lIIIlllIIlIIll[1];
                "".length();
                if (-"   ".length() >= 0) {
                    return ((0xD9 ^ 0xC0) & ~(0xAB ^ 0xB2)) != 0x0;
                }
                while (!llIIIlIlllllIlI(lllllllllllllIIlllllIlllIlIllIll, Corridor.lIIIlllIIlIIll[2])) {
                    this.setBlockState(lllllllllllllIIlllllIlllIlIlllll, Blocks.stonebrick.getDefaultState(), Corridor.lIIIlllIIlIIll[0], lllllllllllllIIlllllIlllIlIllIll, lllllllllllllIIlllllIlllIlIlllII, lllllllllllllIIlllllIlllIlIlllIl);
                    this.setBlockState(lllllllllllllIIlllllIlllIlIlllll, Blocks.air.getDefaultState(), Corridor.lIIIlllIIlIIll[1], lllllllllllllIIlllllIlllIlIllIll, lllllllllllllIIlllllIlllIlIlllII, lllllllllllllIIlllllIlllIlIlllIl);
                    this.setBlockState(lllllllllllllIIlllllIlllIlIlllll, Blocks.air.getDefaultState(), Corridor.lIIIlllIIlIIll[6], lllllllllllllIIlllllIlllIlIllIll, lllllllllllllIIlllllIlllIlIlllII, lllllllllllllIIlllllIlllIlIlllIl);
                    this.setBlockState(lllllllllllllIIlllllIlllIlIlllll, Blocks.air.getDefaultState(), Corridor.lIIIlllIIlIIll[2], lllllllllllllIIlllllIlllIlIllIll, lllllllllllllIIlllllIlllIlIlllII, lllllllllllllIIlllllIlllIlIlllIl);
                    this.setBlockState(lllllllllllllIIlllllIlllIlIlllll, Blocks.stonebrick.getDefaultState(), Corridor.lIIIlllIIlIIll[5], lllllllllllllIIlllllIlllIlIllIll, lllllllllllllIIlllllIlllIlIlllII, lllllllllllllIIlllllIlllIlIlllIl);
                    ++lllllllllllllIIlllllIlllIlIllIll;
                }
                this.setBlockState(lllllllllllllIIlllllIlllIlIlllll, Blocks.stonebrick.getDefaultState(), Corridor.lIIIlllIIlIIll[0], Corridor.lIIIlllIIlIIll[5], lllllllllllllIIlllllIlllIlIlllII, lllllllllllllIIlllllIlllIlIlllIl);
                this.setBlockState(lllllllllllllIIlllllIlllIlIlllll, Blocks.stonebrick.getDefaultState(), Corridor.lIIIlllIIlIIll[1], Corridor.lIIIlllIIlIIll[5], lllllllllllllIIlllllIlllIlIlllII, lllllllllllllIIlllllIlllIlIlllIl);
                this.setBlockState(lllllllllllllIIlllllIlllIlIlllll, Blocks.stonebrick.getDefaultState(), Corridor.lIIIlllIIlIIll[6], Corridor.lIIIlllIIlIIll[5], lllllllllllllIIlllllIlllIlIlllII, lllllllllllllIIlllllIlllIlIlllIl);
                this.setBlockState(lllllllllllllIIlllllIlllIlIlllll, Blocks.stonebrick.getDefaultState(), Corridor.lIIIlllIIlIIll[2], Corridor.lIIIlllIIlIIll[5], lllllllllllllIIlllllIlllIlIlllII, lllllllllllllIIlllllIlllIlIlllIl);
                this.setBlockState(lllllllllllllIIlllllIlllIlIlllll, Blocks.stonebrick.getDefaultState(), Corridor.lIIIlllIIlIIll[5], Corridor.lIIIlllIIlIIll[5], lllllllllllllIIlllllIlllIlIlllII, lllllllllllllIIlllllIlllIlIlllIl);
                ++lllllllllllllIIlllllIlllIlIlllII;
            }
            return Corridor.lIIIlllIIlIIll[1] != 0;
        }
    }
    
    abstract static class Stronghold extends StructureComponent
    {
        private static volatile /* synthetic */ int[] $SWITCH_TABLE$net$minecraft$util$EnumFacing;
        private static final /* synthetic */ int[] lIIllIlIlIIIII;
        private static final /* synthetic */ String[] lIIllIIlllllll;
        protected /* synthetic */ Door field_143013_d;
        
        protected StructureComponent getNextComponentZ(final Stairs2 lllllllllllllIIlIlIlIllIIlIlllIl, final List<StructureComponent> lllllllllllllIIlIlIlIllIIllIIIlI, final Random lllllllllllllIIlIlIlIllIIllIIIIl, final int lllllllllllllIIlIlIlIllIIlIllIlI, final int lllllllllllllIIlIlIlIllIIlIlllll) {
            if (llIllIIIlIllllI(this.coordBaseMode)) {
                switch ($SWITCH_TABLE$net$minecraft$util$EnumFacing()[this.coordBaseMode.ordinal()]) {
                    case 3: {
                        return func_175953_c(lllllllllllllIIlIlIlIllIIlIlllIl, lllllllllllllIIlIlIlIllIIllIIIlI, lllllllllllllIIlIlIlIllIIllIIIIl, this.boundingBox.maxX + Stronghold.lIIllIlIlIIIII[1], this.boundingBox.minY + lllllllllllllIIlIlIlIllIIlIllIlI, this.boundingBox.minZ + lllllllllllllIIlIlIlIllIIlIlllll, EnumFacing.EAST, this.getComponentType());
                    }
                    case 4: {
                        return func_175953_c(lllllllllllllIIlIlIlIllIIlIlllIl, lllllllllllllIIlIlIlIllIIllIIIlI, lllllllllllllIIlIlIlIllIIllIIIIl, this.boundingBox.maxX + Stronghold.lIIllIlIlIIIII[1], this.boundingBox.minY + lllllllllllllIIlIlIlIllIIlIllIlI, this.boundingBox.minZ + lllllllllllllIIlIlIlIllIIlIlllll, EnumFacing.EAST, this.getComponentType());
                    }
                    case 5: {
                        return func_175953_c(lllllllllllllIIlIlIlIllIIlIlllIl, lllllllllllllIIlIlIlIllIIllIIIlI, lllllllllllllIIlIlIlIllIIllIIIIl, this.boundingBox.minX + lllllllllllllIIlIlIlIllIIlIlllll, this.boundingBox.minY + lllllllllllllIIlIlIlIllIIlIllIlI, this.boundingBox.maxZ + Stronghold.lIIllIlIlIIIII[1], EnumFacing.SOUTH, this.getComponentType());
                    }
                    case 6: {
                        return func_175953_c(lllllllllllllIIlIlIlIllIIlIlllIl, lllllllllllllIIlIlIlIllIIllIIIlI, lllllllllllllIIlIlIlIllIIllIIIIl, this.boundingBox.minX + lllllllllllllIIlIlIlIllIIlIlllll, this.boundingBox.minY + lllllllllllllIIlIlIlIllIIlIllIlI, this.boundingBox.maxZ + Stronghold.lIIllIlIlIIIII[1], EnumFacing.SOUTH, this.getComponentType());
                    }
                }
            }
            return null;
        }
        
        protected StructureComponent getNextComponentNormal(final Stairs2 lllllllllllllIIlIlIlIllIlIIIIlll, final List<StructureComponent> lllllllllllllIIlIlIlIllIlIIIIIII, final Random lllllllllllllIIlIlIlIllIIlllllll, final int lllllllllllllIIlIlIlIllIIllllllI, final int lllllllllllllIIlIlIlIllIlIIIIIll) {
            if (llIllIIIlIllllI(this.coordBaseMode)) {
                switch ($SWITCH_TABLE$net$minecraft$util$EnumFacing()[this.coordBaseMode.ordinal()]) {
                    case 3: {
                        return func_175953_c(lllllllllllllIIlIlIlIllIlIIIIlll, lllllllllllllIIlIlIlIllIlIIIIIII, lllllllllllllIIlIlIlIllIIlllllll, this.boundingBox.minX + lllllllllllllIIlIlIlIllIIllllllI, this.boundingBox.minY + lllllllllllllIIlIlIlIllIlIIIIIll, this.boundingBox.minZ - Stronghold.lIIllIlIlIIIII[1], this.coordBaseMode, this.getComponentType());
                    }
                    case 4: {
                        return func_175953_c(lllllllllllllIIlIlIlIllIlIIIIlll, lllllllllllllIIlIlIlIllIlIIIIIII, lllllllllllllIIlIlIlIllIIlllllll, this.boundingBox.minX + lllllllllllllIIlIlIlIllIIllllllI, this.boundingBox.minY + lllllllllllllIIlIlIlIllIlIIIIIll, this.boundingBox.maxZ + Stronghold.lIIllIlIlIIIII[1], this.coordBaseMode, this.getComponentType());
                    }
                    case 5: {
                        return func_175953_c(lllllllllllllIIlIlIlIllIlIIIIlll, lllllllllllllIIlIlIlIllIlIIIIIII, lllllllllllllIIlIlIlIllIIlllllll, this.boundingBox.minX - Stronghold.lIIllIlIlIIIII[1], this.boundingBox.minY + lllllllllllllIIlIlIlIllIlIIIIIll, this.boundingBox.minZ + lllllllllllllIIlIlIlIllIIllllllI, this.coordBaseMode, this.getComponentType());
                    }
                    case 6: {
                        return func_175953_c(lllllllllllllIIlIlIlIllIlIIIIlll, lllllllllllllIIlIlIlIllIlIIIIIII, lllllllllllllIIlIlIlIllIIlllllll, this.boundingBox.maxX + Stronghold.lIIllIlIlIIIII[1], this.boundingBox.minY + lllllllllllllIIlIlIlIllIlIIIIIll, this.boundingBox.minZ + lllllllllllllIIlIlIlIllIIllllllI, this.coordBaseMode, this.getComponentType());
                    }
                }
            }
            return null;
        }
        
        @Override
        protected void readStructureFromNBT(final NBTTagCompound lllllllllllllIIlIlIlIllIlIlIllII) {
            this.field_143013_d = Door.valueOf(lllllllllllllIIlIlIlIllIlIlIllII.getString(Stronghold.lIIllIIlllllll[Stronghold.lIIllIlIlIIIII[1]]));
        }
        
        private static boolean llIllIIIllIIIII(final int lllllllllllllIIlIlIlIllIIIlIlIlI, final int lllllllllllllIIlIlIlIllIIIlIlIIl) {
            return lllllllllllllIIlIlIlIllIIIlIlIlI < lllllllllllllIIlIlIlIllIIIlIlIIl;
        }
        
        protected Stronghold(final int lllllllllllllIIlIlIlIllIlIlllIII) {
            super(lllllllllllllIIlIlIlIllIlIlllIII);
            this.field_143013_d = Door.OPENING;
        }
        
        @Override
        protected void writeStructureToNBT(final NBTTagCompound lllllllllllllIIlIlIlIllIlIllIlII) {
            lllllllllllllIIlIlIlIllIlIllIlII.setString(Stronghold.lIIllIIlllllll[Stronghold.lIIllIlIlIIIII[0]], this.field_143013_d.name());
        }
        
        public Stronghold() {
            this.field_143013_d = Door.OPENING;
        }
        
        private static boolean llIllIIIlIlllll(final int lllllllllllllIIlIlIlIllIIIlIIllI, final int lllllllllllllIIlIlIlIllIIIlIIlIl) {
            return lllllllllllllIIlIlIlIllIIIlIIllI > lllllllllllllIIlIlIlIllIIIlIIlIl;
        }
        
        static {
            llIllIIIlIlllIl();
            llIllIIIIIIIlll();
        }
        
        private static void llIllIIIlIlllIl() {
            (lIIllIlIlIIIII = new int[9])[0] = ((0xB1 ^ 0xAA) & ~(0x80 ^ 0x9B));
            Stronghold.lIIllIlIlIIIII[1] = " ".length();
            Stronghold.lIIllIlIlIIIII[2] = "   ".length();
            Stronghold.lIIllIlIlIIIII[3] = "  ".length();
            Stronghold.lIIllIlIlIIIII[4] = (0x7B ^ 0x69 ^ (0x39 ^ 0x23));
            Stronghold.lIIllIlIlIIIII[5] = (0x9 ^ 0x43 ^ (0x2D ^ 0x63));
            Stronghold.lIIllIlIlIIIII[6] = (101 + 65 - 31 + 19 ^ 94 + 155 - 106 + 16);
            Stronghold.lIIllIlIlIIIII[7] = (0x7D ^ 0x31 ^ (0x71 ^ 0x37));
            Stronghold.lIIllIlIlIIIII[8] = (0x79 ^ 0x58 ^ (0x92 ^ 0xB5));
        }
        
        static /* synthetic */ int[] $SWITCH_TABLE$net$minecraft$world$gen$structure$StructureStrongholdPieces$Stronghold$Door() {
            final int[] $switch_TABLE$net$minecraft$world$gen$structure$StructureStrongholdPieces$Stronghold$Door = Stronghold.$SWITCH_TABLE$net$minecraft$world$gen$structure$StructureStrongholdPieces$Stronghold$Door;
            if (llIllIIIlIllllI($switch_TABLE$net$minecraft$world$gen$structure$StructureStrongholdPieces$Stronghold$Door)) {
                return $switch_TABLE$net$minecraft$world$gen$structure$StructureStrongholdPieces$Stronghold$Door;
            }
            "".length();
            final Exception lllllllllllllIIlIlIlIllIIlIlIlII = (Object)new int[Door.values().length];
            try {
                lllllllllllllIIlIlIlIllIIlIlIlII[Door.GRATES.ordinal()] = Stronghold.lIIllIlIlIIIII[2];
                "".length();
                if (((0x57 ^ 0x5B) & ~(0x52 ^ 0x5E)) > 0) {
                    return null;
                }
            }
            catch (NoSuchFieldError noSuchFieldError) {
                "".length();
            }
            try {
                lllllllllllllIIlIlIlIllIIlIlIlII[Door.IRON_DOOR.ordinal()] = Stronghold.lIIllIlIlIIIII[5];
                "".length();
                if (((0x76 ^ 0x65) & ~(0x62 ^ 0x71)) == "   ".length()) {
                    return null;
                }
            }
            catch (NoSuchFieldError noSuchFieldError2) {
                "".length();
            }
            try {
                lllllllllllllIIlIlIlIllIIlIlIlII[Door.OPENING.ordinal()] = Stronghold.lIIllIlIlIIIII[1];
                "".length();
                if (-"  ".length() >= 0) {
                    return null;
                }
            }
            catch (NoSuchFieldError noSuchFieldError3) {
                "".length();
            }
            try {
                lllllllllllllIIlIlIlIllIIlIlIlII[Door.WOOD_DOOR.ordinal()] = Stronghold.lIIllIlIlIIIII[3];
                "".length();
                if (" ".length() <= 0) {
                    return null;
                }
            }
            catch (NoSuchFieldError noSuchFieldError4) {
                "".length();
            }
            return Stronghold.$SWITCH_TABLE$net$minecraft$world$gen$structure$StructureStrongholdPieces$Stronghold$Door = (int[])(Object)lllllllllllllIIlIlIlIllIIlIlIlII;
        }
        
        private static String llIllIIIIIIIlIl(String lllllllllllllIIlIlIlIllIIlIIIIlI, final String lllllllllllllIIlIlIlIllIIlIIIllI) {
            lllllllllllllIIlIlIlIllIIlIIIIlI = (byte)new String(Base64.getDecoder().decode(((String)lllllllllllllIIlIlIlIllIIlIIIIlI).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
            final StringBuilder lllllllllllllIIlIlIlIllIIlIIIlIl = new StringBuilder();
            final char[] lllllllllllllIIlIlIlIllIIlIIIlII = lllllllllllllIIlIlIlIllIIlIIIllI.toCharArray();
            int lllllllllllllIIlIlIlIllIIlIIIIll = Stronghold.lIIllIlIlIIIII[0];
            final long lllllllllllllIIlIlIlIllIIIllllIl = (Object)((String)lllllllllllllIIlIlIlIllIIlIIIIlI).toCharArray();
            final byte lllllllllllllIIlIlIlIllIIIllllII = (byte)lllllllllllllIIlIlIlIllIIIllllIl.length;
            byte lllllllllllllIIlIlIlIllIIIlllIll = (byte)Stronghold.lIIllIlIlIIIII[0];
            while (llIllIIIllIIIII(lllllllllllllIIlIlIlIllIIIlllIll, lllllllllllllIIlIlIlIllIIIllllII)) {
                final char lllllllllllllIIlIlIlIllIIlIIlIII = lllllllllllllIIlIlIlIllIIIllllIl[lllllllllllllIIlIlIlIllIIIlllIll];
                lllllllllllllIIlIlIlIllIIlIIIlIl.append((char)(lllllllllllllIIlIlIlIllIIlIIlIII ^ lllllllllllllIIlIlIlIllIIlIIIlII[lllllllllllllIIlIlIlIllIIlIIIIll % lllllllllllllIIlIlIlIllIIlIIIlII.length]));
                "".length();
                ++lllllllllllllIIlIlIlIllIIlIIIIll;
                ++lllllllllllllIIlIlIlIllIIIlllIll;
                "".length();
                if (((80 + 42 + 1 + 32 ^ 138 + 16 - 62 + 92) & (0xBA ^ 0xC0 ^ (0x5 ^ 0x5C) ^ -" ".length())) >= (22 + 6 + 57 + 93 ^ 12 + 106 - 52 + 116)) {
                    return null;
                }
            }
            return String.valueOf(lllllllllllllIIlIlIlIllIIlIIIlIl);
        }
        
        protected Door getRandomDoor(final Random lllllllllllllIIlIlIlIllIlIIlIIII) {
            final int lllllllllllllIIlIlIlIllIlIIlIIIl = lllllllllllllIIlIlIlIllIlIIlIIII.nextInt(Stronghold.lIIllIlIlIIIII[6]);
            switch (lllllllllllllIIlIlIlIllIlIIlIIIl) {
                default: {
                    return Door.OPENING;
                }
                case 2: {
                    return Door.WOOD_DOOR;
                }
                case 3: {
                    return Door.GRATES;
                }
                case 4: {
                    return Door.IRON_DOOR;
                }
            }
        }
        
        private static void llIllIIIIIIIlll() {
            (lIIllIIlllllll = new String[Stronghold.lIIllIlIlIIIII[3]])[Stronghold.lIIllIlIlIIIII[0]] = llIllIIIIIIIlIl("CCsQJhUJKgsm", "MEdTl");
            Stronghold.lIIllIIlllllll[Stronghold.lIIllIlIlIIIII[1]] = llIllIIIIIIIllI("KDF9SpeZn4x+Vox73R2f9g==", "RdxOX");
        }
        
        private static String llIllIIIIIIIllI(final String lllllllllllllIIlIlIlIllIIIllIIII, final String lllllllllllllIIlIlIlIllIIIlIllll) {
            try {
                final SecretKeySpec lllllllllllllIIlIlIlIllIIIllIlIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIIlIlIlIllIIIlIllll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
                final Cipher lllllllllllllIIlIlIlIllIIIllIlII = Cipher.getInstance("Blowfish");
                lllllllllllllIIlIlIlIllIIIllIlII.init(Stronghold.lIIllIlIlIIIII[3], lllllllllllllIIlIlIlIllIIIllIlIl);
                return new String(lllllllllllllIIlIlIlIllIIIllIlII.doFinal(Base64.getDecoder().decode(lllllllllllllIIlIlIlIllIIIllIIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
            }
            catch (Exception lllllllllllllIIlIlIlIllIIIllIIll) {
                lllllllllllllIIlIlIlIllIIIllIIll.printStackTrace();
                return null;
            }
        }
        
        static /* synthetic */ int[] $SWITCH_TABLE$net$minecraft$util$EnumFacing() {
            final int[] $switch_TABLE$net$minecraft$util$EnumFacing = Stronghold.$SWITCH_TABLE$net$minecraft$util$EnumFacing;
            if (llIllIIIlIllllI($switch_TABLE$net$minecraft$util$EnumFacing)) {
                return $switch_TABLE$net$minecraft$util$EnumFacing;
            }
            "".length();
            final boolean lllllllllllllIIlIlIlIllIIlIlIIlI = (Object)new int[EnumFacing.values().length];
            try {
                lllllllllllllIIlIlIlIllIIlIlIIlI[EnumFacing.DOWN.ordinal()] = Stronghold.lIIllIlIlIIIII[1];
                "".length();
                if (-"  ".length() > 0) {
                    return null;
                }
            }
            catch (NoSuchFieldError noSuchFieldError) {
                "".length();
            }
            try {
                lllllllllllllIIlIlIlIllIIlIlIIlI[EnumFacing.EAST.ordinal()] = Stronghold.lIIllIlIlIIIII[8];
                "".length();
                if ("  ".length() <= 0) {
                    return null;
                }
            }
            catch (NoSuchFieldError noSuchFieldError2) {
                "".length();
            }
            try {
                lllllllllllllIIlIlIlIllIIlIlIIlI[EnumFacing.NORTH.ordinal()] = Stronghold.lIIllIlIlIIIII[2];
                "".length();
                if (((26 + 3 + 192 + 32 ^ 37 + 91 + 21 + 15) & (0x43 ^ 0x16 ^ (0x84 ^ 0x88) ^ -" ".length())) > 0) {
                    return null;
                }
            }
            catch (NoSuchFieldError noSuchFieldError3) {
                "".length();
            }
            try {
                lllllllllllllIIlIlIlIllIIlIlIIlI[EnumFacing.SOUTH.ordinal()] = Stronghold.lIIllIlIlIIIII[5];
                "".length();
                if ("  ".length() == 0) {
                    return null;
                }
            }
            catch (NoSuchFieldError noSuchFieldError4) {
                "".length();
            }
            try {
                lllllllllllllIIlIlIlIllIIlIlIIlI[EnumFacing.UP.ordinal()] = Stronghold.lIIllIlIlIIIII[3];
                "".length();
                if (((0x30 ^ 0x17 ^ (0x27 ^ 0xF)) & (9 + 154 - 154 + 180 ^ 44 + 53 + 23 + 58 ^ -" ".length())) != 0x0) {
                    return null;
                }
            }
            catch (NoSuchFieldError noSuchFieldError5) {
                "".length();
            }
            try {
                lllllllllllllIIlIlIlIllIIlIlIIlI[EnumFacing.WEST.ordinal()] = Stronghold.lIIllIlIlIIIII[6];
                "".length();
                if (" ".length() >= "  ".length()) {
                    return null;
                }
            }
            catch (NoSuchFieldError noSuchFieldError6) {
                "".length();
            }
            return Stronghold.$SWITCH_TABLE$net$minecraft$util$EnumFacing = (int[])(Object)lllllllllllllIIlIlIlIllIIlIlIIlI;
        }
        
        private static boolean llIllIIIlIllllI(final Object lllllllllllllIIlIlIlIllIIIlIIIll) {
            return lllllllllllllIIlIlIlIllIIIlIIIll != null;
        }
        
        protected StructureComponent getNextComponentX(final Stairs2 lllllllllllllIIlIlIlIllIIlllIlIl, final List<StructureComponent> lllllllllllllIIlIlIlIllIIllIlllI, final Random lllllllllllllIIlIlIlIllIIlllIIll, final int lllllllllllllIIlIlIlIllIIlllIIlI, final int lllllllllllllIIlIlIlIllIIllIlIll) {
            if (llIllIIIlIllllI(this.coordBaseMode)) {
                switch ($SWITCH_TABLE$net$minecraft$util$EnumFacing()[this.coordBaseMode.ordinal()]) {
                    case 3: {
                        return func_175953_c(lllllllllllllIIlIlIlIllIIlllIlIl, lllllllllllllIIlIlIlIllIIllIlllI, lllllllllllllIIlIlIlIllIIlllIIll, this.boundingBox.minX - Stronghold.lIIllIlIlIIIII[1], this.boundingBox.minY + lllllllllllllIIlIlIlIllIIlllIIlI, this.boundingBox.minZ + lllllllllllllIIlIlIlIllIIllIlIll, EnumFacing.WEST, this.getComponentType());
                    }
                    case 4: {
                        return func_175953_c(lllllllllllllIIlIlIlIllIIlllIlIl, lllllllllllllIIlIlIlIllIIllIlllI, lllllllllllllIIlIlIlIllIIlllIIll, this.boundingBox.minX - Stronghold.lIIllIlIlIIIII[1], this.boundingBox.minY + lllllllllllllIIlIlIlIllIIlllIIlI, this.boundingBox.minZ + lllllllllllllIIlIlIlIllIIllIlIll, EnumFacing.WEST, this.getComponentType());
                    }
                    case 5: {
                        return func_175953_c(lllllllllllllIIlIlIlIllIIlllIlIl, lllllllllllllIIlIlIlIllIIllIlllI, lllllllllllllIIlIlIlIllIIlllIIll, this.boundingBox.minX + lllllllllllllIIlIlIlIllIIllIlIll, this.boundingBox.minY + lllllllllllllIIlIlIlIllIIlllIIlI, this.boundingBox.minZ - Stronghold.lIIllIlIlIIIII[1], EnumFacing.NORTH, this.getComponentType());
                    }
                    case 6: {
                        return func_175953_c(lllllllllllllIIlIlIlIllIIlllIlIl, lllllllllllllIIlIlIlIllIIllIlllI, lllllllllllllIIlIlIlIllIIlllIIll, this.boundingBox.minX + lllllllllllllIIlIlIlIllIIllIlIll, this.boundingBox.minY + lllllllllllllIIlIlIlIllIIlllIIlI, this.boundingBox.minZ - Stronghold.lIIllIlIlIIIII[1], EnumFacing.NORTH, this.getComponentType());
                    }
                }
            }
            return null;
        }
        
        protected static boolean canStrongholdGoDeeper(final StructureBoundingBox lllllllllllllIIlIlIlIllIIlIlIllI) {
            if (llIllIIIlIllllI(lllllllllllllIIlIlIlIllIIlIlIllI) && llIllIIIlIlllll(lllllllllllllIIlIlIlIllIIlIlIllI.minY, Stronghold.lIIllIlIlIIIII[7])) {
                return Stronghold.lIIllIlIlIIIII[1] != 0;
            }
            return Stronghold.lIIllIlIlIIIII[0] != 0;
        }
        
        protected void placeDoor(final World lllllllllllllIIlIlIlIllIlIIllIll, final Random lllllllllllllIIlIlIlIllIlIlIIIlI, final StructureBoundingBox lllllllllllllIIlIlIlIllIlIlIIIIl, final Door lllllllllllllIIlIlIlIllIlIlIIIII, final int lllllllllllllIIlIlIlIllIlIIlllll, final int lllllllllllllIIlIlIlIllIlIIllllI, final int lllllllllllllIIlIlIlIllIlIIlIllI) {
            switch ($SWITCH_TABLE$net$minecraft$world$gen$structure$StructureStrongholdPieces$Stronghold$Door()[lllllllllllllIIlIlIlIllIlIlIIIII.ordinal()]) {
                default: {
                    this.fillWithBlocks(lllllllllllllIIlIlIlIllIlIIllIll, lllllllllllllIIlIlIlIllIlIlIIIIl, lllllllllllllIIlIlIlIllIlIIlllll, lllllllllllllIIlIlIlIllIlIIllllI, lllllllllllllIIlIlIlIllIlIIlIllI, lllllllllllllIIlIlIlIllIlIIlllll + Stronghold.lIIllIlIlIIIII[2] - Stronghold.lIIllIlIlIIIII[1], lllllllllllllIIlIlIlIllIlIIllllI + Stronghold.lIIllIlIlIIIII[2] - Stronghold.lIIllIlIlIIIII[1], lllllllllllllIIlIlIlIllIlIIlIllI, Blocks.air.getDefaultState(), Blocks.air.getDefaultState(), (boolean)(Stronghold.lIIllIlIlIIIII[0] != 0));
                    "".length();
                    if ("  ".length() > "   ".length()) {
                        return;
                    }
                    break;
                }
                case 2: {
                    this.setBlockState(lllllllllllllIIlIlIlIllIlIIllIll, Blocks.stonebrick.getDefaultState(), lllllllllllllIIlIlIlIllIlIIlllll, lllllllllllllIIlIlIlIllIlIIllllI, lllllllllllllIIlIlIlIllIlIIlIllI, lllllllllllllIIlIlIlIllIlIlIIIIl);
                    this.setBlockState(lllllllllllllIIlIlIlIllIlIIllIll, Blocks.stonebrick.getDefaultState(), lllllllllllllIIlIlIlIllIlIIlllll, lllllllllllllIIlIlIlIllIlIIllllI + Stronghold.lIIllIlIlIIIII[1], lllllllllllllIIlIlIlIllIlIIlIllI, lllllllllllllIIlIlIlIllIlIlIIIIl);
                    this.setBlockState(lllllllllllllIIlIlIlIllIlIIllIll, Blocks.stonebrick.getDefaultState(), lllllllllllllIIlIlIlIllIlIIlllll, lllllllllllllIIlIlIlIllIlIIllllI + Stronghold.lIIllIlIlIIIII[3], lllllllllllllIIlIlIlIllIlIIlIllI, lllllllllllllIIlIlIlIllIlIlIIIIl);
                    this.setBlockState(lllllllllllllIIlIlIlIllIlIIllIll, Blocks.stonebrick.getDefaultState(), lllllllllllllIIlIlIlIllIlIIlllll + Stronghold.lIIllIlIlIIIII[1], lllllllllllllIIlIlIlIllIlIIllllI + Stronghold.lIIllIlIlIIIII[3], lllllllllllllIIlIlIlIllIlIIlIllI, lllllllllllllIIlIlIlIllIlIlIIIIl);
                    this.setBlockState(lllllllllllllIIlIlIlIllIlIIllIll, Blocks.stonebrick.getDefaultState(), lllllllllllllIIlIlIlIllIlIIlllll + Stronghold.lIIllIlIlIIIII[3], lllllllllllllIIlIlIlIllIlIIllllI + Stronghold.lIIllIlIlIIIII[3], lllllllllllllIIlIlIlIllIlIIlIllI, lllllllllllllIIlIlIlIllIlIlIIIIl);
                    this.setBlockState(lllllllllllllIIlIlIlIllIlIIllIll, Blocks.stonebrick.getDefaultState(), lllllllllllllIIlIlIlIllIlIIlllll + Stronghold.lIIllIlIlIIIII[3], lllllllllllllIIlIlIlIllIlIIllllI + Stronghold.lIIllIlIlIIIII[1], lllllllllllllIIlIlIlIllIlIIlIllI, lllllllllllllIIlIlIlIllIlIlIIIIl);
                    this.setBlockState(lllllllllllllIIlIlIlIllIlIIllIll, Blocks.stonebrick.getDefaultState(), lllllllllllllIIlIlIlIllIlIIlllll + Stronghold.lIIllIlIlIIIII[3], lllllllllllllIIlIlIlIllIlIIllllI, lllllllllllllIIlIlIlIllIlIIlIllI, lllllllllllllIIlIlIlIllIlIlIIIIl);
                    this.setBlockState(lllllllllllllIIlIlIlIllIlIIllIll, Blocks.oak_door.getDefaultState(), lllllllllllllIIlIlIlIllIlIIlllll + Stronghold.lIIllIlIlIIIII[1], lllllllllllllIIlIlIlIllIlIIllllI, lllllllllllllIIlIlIlIllIlIIlIllI, lllllllllllllIIlIlIlIllIlIlIIIIl);
                    this.setBlockState(lllllllllllllIIlIlIlIllIlIIllIll, Blocks.oak_door.getStateFromMeta(Stronghold.lIIllIlIlIIIII[4]), lllllllllllllIIlIlIlIllIlIIlllll + Stronghold.lIIllIlIlIIIII[1], lllllllllllllIIlIlIlIllIlIIllllI + Stronghold.lIIllIlIlIIIII[1], lllllllllllllIIlIlIlIllIlIIlIllI, lllllllllllllIIlIlIlIllIlIlIIIIl);
                    "".length();
                    if (null != null) {
                        return;
                    }
                    break;
                }
                case 3: {
                    this.setBlockState(lllllllllllllIIlIlIlIllIlIIllIll, Blocks.air.getDefaultState(), lllllllllllllIIlIlIlIllIlIIlllll + Stronghold.lIIllIlIlIIIII[1], lllllllllllllIIlIlIlIllIlIIllllI, lllllllllllllIIlIlIlIllIlIIlIllI, lllllllllllllIIlIlIlIllIlIlIIIIl);
                    this.setBlockState(lllllllllllllIIlIlIlIllIlIIllIll, Blocks.air.getDefaultState(), lllllllllllllIIlIlIlIllIlIIlllll + Stronghold.lIIllIlIlIIIII[1], lllllllllllllIIlIlIlIllIlIIllllI + Stronghold.lIIllIlIlIIIII[1], lllllllllllllIIlIlIlIllIlIIlIllI, lllllllllllllIIlIlIlIllIlIlIIIIl);
                    this.setBlockState(lllllllllllllIIlIlIlIllIlIIllIll, Blocks.iron_bars.getDefaultState(), lllllllllllllIIlIlIlIllIlIIlllll, lllllllllllllIIlIlIlIllIlIIllllI, lllllllllllllIIlIlIlIllIlIIlIllI, lllllllllllllIIlIlIlIllIlIlIIIIl);
                    this.setBlockState(lllllllllllllIIlIlIlIllIlIIllIll, Blocks.iron_bars.getDefaultState(), lllllllllllllIIlIlIlIllIlIIlllll, lllllllllllllIIlIlIlIllIlIIllllI + Stronghold.lIIllIlIlIIIII[1], lllllllllllllIIlIlIlIllIlIIlIllI, lllllllllllllIIlIlIlIllIlIlIIIIl);
                    this.setBlockState(lllllllllllllIIlIlIlIllIlIIllIll, Blocks.iron_bars.getDefaultState(), lllllllllllllIIlIlIlIllIlIIlllll, lllllllllllllIIlIlIlIllIlIIllllI + Stronghold.lIIllIlIlIIIII[3], lllllllllllllIIlIlIlIllIlIIlIllI, lllllllllllllIIlIlIlIllIlIlIIIIl);
                    this.setBlockState(lllllllllllllIIlIlIlIllIlIIllIll, Blocks.iron_bars.getDefaultState(), lllllllllllllIIlIlIlIllIlIIlllll + Stronghold.lIIllIlIlIIIII[1], lllllllllllllIIlIlIlIllIlIIllllI + Stronghold.lIIllIlIlIIIII[3], lllllllllllllIIlIlIlIllIlIIlIllI, lllllllllllllIIlIlIlIllIlIlIIIIl);
                    this.setBlockState(lllllllllllllIIlIlIlIllIlIIllIll, Blocks.iron_bars.getDefaultState(), lllllllllllllIIlIlIlIllIlIIlllll + Stronghold.lIIllIlIlIIIII[3], lllllllllllllIIlIlIlIllIlIIllllI + Stronghold.lIIllIlIlIIIII[3], lllllllllllllIIlIlIlIllIlIIlIllI, lllllllllllllIIlIlIlIllIlIlIIIIl);
                    this.setBlockState(lllllllllllllIIlIlIlIllIlIIllIll, Blocks.iron_bars.getDefaultState(), lllllllllllllIIlIlIlIllIlIIlllll + Stronghold.lIIllIlIlIIIII[3], lllllllllllllIIlIlIlIllIlIIllllI + Stronghold.lIIllIlIlIIIII[1], lllllllllllllIIlIlIlIllIlIIlIllI, lllllllllllllIIlIlIlIllIlIlIIIIl);
                    this.setBlockState(lllllllllllllIIlIlIlIllIlIIllIll, Blocks.iron_bars.getDefaultState(), lllllllllllllIIlIlIlIllIlIIlllll + Stronghold.lIIllIlIlIIIII[3], lllllllllllllIIlIlIlIllIlIIllllI, lllllllllllllIIlIlIlIllIlIIlIllI, lllllllllllllIIlIlIlIllIlIlIIIIl);
                    "".length();
                    if (((0x42 ^ 0x15 ^ (0xB2 ^ 0xAD)) & (0xA7 ^ 0xB6 ^ (0xEA ^ 0xB3) ^ -" ".length())) != 0x0) {
                        return;
                    }
                    break;
                }
                case 4: {
                    this.setBlockState(lllllllllllllIIlIlIlIllIlIIllIll, Blocks.stonebrick.getDefaultState(), lllllllllllllIIlIlIlIllIlIIlllll, lllllllllllllIIlIlIlIllIlIIllllI, lllllllllllllIIlIlIlIllIlIIlIllI, lllllllllllllIIlIlIlIllIlIlIIIIl);
                    this.setBlockState(lllllllllllllIIlIlIlIllIlIIllIll, Blocks.stonebrick.getDefaultState(), lllllllllllllIIlIlIlIllIlIIlllll, lllllllllllllIIlIlIlIllIlIIllllI + Stronghold.lIIllIlIlIIIII[1], lllllllllllllIIlIlIlIllIlIIlIllI, lllllllllllllIIlIlIlIllIlIlIIIIl);
                    this.setBlockState(lllllllllllllIIlIlIlIllIlIIllIll, Blocks.stonebrick.getDefaultState(), lllllllllllllIIlIlIlIllIlIIlllll, lllllllllllllIIlIlIlIllIlIIllllI + Stronghold.lIIllIlIlIIIII[3], lllllllllllllIIlIlIlIllIlIIlIllI, lllllllllllllIIlIlIlIllIlIlIIIIl);
                    this.setBlockState(lllllllllllllIIlIlIlIllIlIIllIll, Blocks.stonebrick.getDefaultState(), lllllllllllllIIlIlIlIllIlIIlllll + Stronghold.lIIllIlIlIIIII[1], lllllllllllllIIlIlIlIllIlIIllllI + Stronghold.lIIllIlIlIIIII[3], lllllllllllllIIlIlIlIllIlIIlIllI, lllllllllllllIIlIlIlIllIlIlIIIIl);
                    this.setBlockState(lllllllllllllIIlIlIlIllIlIIllIll, Blocks.stonebrick.getDefaultState(), lllllllllllllIIlIlIlIllIlIIlllll + Stronghold.lIIllIlIlIIIII[3], lllllllllllllIIlIlIlIllIlIIllllI + Stronghold.lIIllIlIlIIIII[3], lllllllllllllIIlIlIlIllIlIIlIllI, lllllllllllllIIlIlIlIllIlIlIIIIl);
                    this.setBlockState(lllllllllllllIIlIlIlIllIlIIllIll, Blocks.stonebrick.getDefaultState(), lllllllllllllIIlIlIlIllIlIIlllll + Stronghold.lIIllIlIlIIIII[3], lllllllllllllIIlIlIlIllIlIIllllI + Stronghold.lIIllIlIlIIIII[1], lllllllllllllIIlIlIlIllIlIIlIllI, lllllllllllllIIlIlIlIllIlIlIIIIl);
                    this.setBlockState(lllllllllllllIIlIlIlIllIlIIllIll, Blocks.stonebrick.getDefaultState(), lllllllllllllIIlIlIlIllIlIIlllll + Stronghold.lIIllIlIlIIIII[3], lllllllllllllIIlIlIlIllIlIIllllI, lllllllllllllIIlIlIlIllIlIIlIllI, lllllllllllllIIlIlIlIllIlIlIIIIl);
                    this.setBlockState(lllllllllllllIIlIlIlIllIlIIllIll, Blocks.iron_door.getDefaultState(), lllllllllllllIIlIlIlIllIlIIlllll + Stronghold.lIIllIlIlIIIII[1], lllllllllllllIIlIlIlIllIlIIllllI, lllllllllllllIIlIlIlIllIlIIlIllI, lllllllllllllIIlIlIlIllIlIlIIIIl);
                    this.setBlockState(lllllllllllllIIlIlIlIllIlIIllIll, Blocks.iron_door.getStateFromMeta(Stronghold.lIIllIlIlIIIII[4]), lllllllllllllIIlIlIlIllIlIIlllll + Stronghold.lIIllIlIlIIIII[1], lllllllllllllIIlIlIlIllIlIIllllI + Stronghold.lIIllIlIlIIIII[1], lllllllllllllIIlIlIlIllIlIIlIllI, lllllllllllllIIlIlIlIllIlIlIIIIl);
                    this.setBlockState(lllllllllllllIIlIlIlIllIlIIllIll, Blocks.stone_button.getStateFromMeta(this.getMetadataWithOffset(Blocks.stone_button, Stronghold.lIIllIlIlIIIII[5])), lllllllllllllIIlIlIlIllIlIIlllll + Stronghold.lIIllIlIlIIIII[3], lllllllllllllIIlIlIlIllIlIIllllI + Stronghold.lIIllIlIlIIIII[1], lllllllllllllIIlIlIlIllIlIIlIllI + Stronghold.lIIllIlIlIIIII[1], lllllllllllllIIlIlIlIllIlIlIIIIl);
                    this.setBlockState(lllllllllllllIIlIlIlIllIlIIllIll, Blocks.stone_button.getStateFromMeta(this.getMetadataWithOffset(Blocks.stone_button, Stronghold.lIIllIlIlIIIII[2])), lllllllllllllIIlIlIlIllIlIIlllll + Stronghold.lIIllIlIlIIIII[3], lllllllllllllIIlIlIlIllIlIIllllI + Stronghold.lIIllIlIlIIIII[1], lllllllllllllIIlIlIlIllIlIIlIllI - Stronghold.lIIllIlIlIIIII[1], lllllllllllllIIlIlIlIllIlIlIIIIl);
                    break;
                }
            }
        }
        
        public enum Door
        {
            private static final /* synthetic */ int[] lllIlllIllIllI;
            private static final /* synthetic */ String[] lllIlllIllIIII;
            
            OPENING(Door.lllIlllIllIIII[Door.lllIlllIllIllI[0]], Door.lllIlllIllIllI[0]), 
            WOOD_DOOR(Door.lllIlllIllIIII[Door.lllIlllIllIllI[1]], Door.lllIlllIllIllI[1]), 
            GRATES(Door.lllIlllIllIIII[Door.lllIlllIllIllI[2]], Door.lllIlllIllIllI[2]), 
            IRON_DOOR(Door.lllIlllIllIIII[Door.lllIlllIllIllI[3]], Door.lllIlllIllIllI[3]);
            
            private static void lIlIIlIlllIIlIll() {
                (lllIlllIllIllI = new int[6])[0] = ((0xAC ^ 0x96 ^ (0x12 ^ 0x22)) & (0x84 ^ 0x88 ^ (0x49 ^ 0x4F) ^ -" ".length()));
                Door.lllIlllIllIllI[1] = " ".length();
                Door.lllIlllIllIllI[2] = "  ".length();
                Door.lllIlllIllIllI[3] = "   ".length();
                Door.lllIlllIllIllI[4] = (0x9E ^ 0x9A);
                Door.lllIlllIllIllI[5] = (0xE7 ^ 0x9E ^ (0x78 ^ 0x9));
            }
            
            private static String lIlIIlIlllIIIIII(final String llllllllllllIlIllIIIIIllIIlIIlll, final String llllllllllllIlIllIIIIIllIIlIIlII) {
                try {
                    final SecretKeySpec llllllllllllIlIllIIIIIllIIlIlIlI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIlIllIIIIIllIIlIIlII.getBytes(StandardCharsets.UTF_8)), Door.lllIlllIllIllI[5]), "DES");
                    final Cipher llllllllllllIlIllIIIIIllIIlIlIIl = Cipher.getInstance("DES");
                    llllllllllllIlIllIIIIIllIIlIlIIl.init(Door.lllIlllIllIllI[2], llllllllllllIlIllIIIIIllIIlIlIlI);
                    return new String(llllllllllllIlIllIIIIIllIIlIlIIl.doFinal(Base64.getDecoder().decode(llllllllllllIlIllIIIIIllIIlIIlll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
                }
                catch (Exception llllllllllllIlIllIIIIIllIIlIlIII) {
                    llllllllllllIlIllIIIIIllIIlIlIII.printStackTrace();
                    return null;
                }
            }
            
            private static void lIlIIlIlllIIIlII() {
                (lllIlllIllIIII = new String[Door.lllIlllIllIllI[4]])[Door.lllIlllIllIllI[0]] = lIlIIlIlllIIIIII("0rC+c5xjU30=", "zYlQs");
                Door.lllIlllIllIIII[Door.lllIlllIllIllI[1]] = lIlIIlIlllIIIIlI("Gw4LDzwIDgsZ", "LADKc");
                Door.lllIlllIllIIII[Door.lllIlllIllIllI[2]] = lIlIIlIlllIIIIII("heSbmIVvW5Y=", "RapCx");
                Door.lllIlllIllIIII[Door.lllIlllIllIllI[3]] = lIlIIlIlllIIIIll("Mkw06Bcxoi4URB9H7ZJsfA==", "giosX");
            }
            
            static {
                lIlIIlIlllIIlIll();
                lIlIIlIlllIIIlII();
                final Door[] enum$VALUES = new Door[Door.lllIlllIllIllI[4]];
                enum$VALUES[Door.lllIlllIllIllI[0]] = Door.OPENING;
                enum$VALUES[Door.lllIlllIllIllI[1]] = Door.WOOD_DOOR;
                enum$VALUES[Door.lllIlllIllIllI[2]] = Door.GRATES;
                enum$VALUES[Door.lllIlllIllIllI[3]] = Door.IRON_DOOR;
                ENUM$VALUES = enum$VALUES;
            }
            
            private static String lIlIIlIlllIIIIlI(String llllllllllllIlIllIIIIIllIIIIlIlI, final String llllllllllllIlIllIIIIIllIIIIlIIl) {
                llllllllllllIlIllIIIIIllIIIIlIlI = new String(Base64.getDecoder().decode(llllllllllllIlIllIIIIIllIIIIlIlI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
                final StringBuilder llllllllllllIlIllIIIIIllIIIIlIII = new StringBuilder();
                final char[] llllllllllllIlIllIIIIIllIIIIIlll = llllllllllllIlIllIIIIIllIIIIlIIl.toCharArray();
                int llllllllllllIlIllIIIIIllIIIIIllI = Door.lllIlllIllIllI[0];
                final float llllllllllllIlIllIIIIIllIIIIIIII = (Object)llllllllllllIlIllIIIIIllIIIIlIlI.toCharArray();
                final boolean llllllllllllIlIllIIIIIlIllllllll = llllllllllllIlIllIIIIIllIIIIIIII.length != 0;
                char llllllllllllIlIllIIIIIlIlllllllI = (char)Door.lllIlllIllIllI[0];
                while (lIlIIlIlllIIllII(llllllllllllIlIllIIIIIlIlllllllI, llllllllllllIlIllIIIIIlIllllllll ? 1 : 0)) {
                    final char llllllllllllIlIllIIIIIllIIIIlIll = llllllllllllIlIllIIIIIllIIIIIIII[llllllllllllIlIllIIIIIlIlllllllI];
                    llllllllllllIlIllIIIIIllIIIIlIII.append((char)(llllllllllllIlIllIIIIIllIIIIlIll ^ llllllllllllIlIllIIIIIllIIIIIlll[llllllllllllIlIllIIIIIllIIIIIllI % llllllllllllIlIllIIIIIllIIIIIlll.length]));
                    "".length();
                    ++llllllllllllIlIllIIIIIllIIIIIllI;
                    ++llllllllllllIlIllIIIIIlIlllllllI;
                    "".length();
                    if (((0x14 ^ 0x55) & ~(0x6C ^ 0x2D)) != 0x0) {
                        return null;
                    }
                }
                return String.valueOf(llllllllllllIlIllIIIIIllIIIIlIII);
            }
            
            private static boolean lIlIIlIlllIIllII(final int llllllllllllIlIllIIIIIlIlllllIlI, final int llllllllllllIlIllIIIIIlIlllllIIl) {
                return llllllllllllIlIllIIIIIlIlllllIlI < llllllllllllIlIllIIIIIlIlllllIIl;
            }
            
            private Door(final String llllllllllllIlIllIIIIIllIIlllIII, final int llllllllllllIlIllIIIIIllIIllIlll) {
            }
            
            private static String lIlIIlIlllIIIIll(final String llllllllllllIlIllIIIIIllIIIllIII, final String llllllllllllIlIllIIIIIllIIIlIlll) {
                try {
                    final SecretKeySpec llllllllllllIlIllIIIIIllIIIlllIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIlIllIIIIIllIIIlIlll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
                    final Cipher llllllllllllIlIllIIIIIllIIIlllII = Cipher.getInstance("Blowfish");
                    llllllllllllIlIllIIIIIllIIIlllII.init(Door.lllIlllIllIllI[2], llllllllllllIlIllIIIIIllIIIlllIl);
                    return new String(llllllllllllIlIllIIIIIllIIIlllII.doFinal(Base64.getDecoder().decode(llllllllllllIlIllIIIIIllIIIllIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
                }
                catch (Exception llllllllllllIlIllIIIIIllIIIllIll) {
                    llllllllllllIlIllIIIIIllIIIllIll.printStackTrace();
                    return null;
                }
            }
        }
    }
    
    public static class Stairs2 extends Stairs
    {
        public /* synthetic */ PieceWeight strongholdPieceWeight;
        public /* synthetic */ PortalRoom strongholdPortalRoom;
        private static final /* synthetic */ int[] lIlllIIlIllIIl;
        public /* synthetic */ List<StructureComponent> field_75026_c;
        
        private static boolean lIIIIIIllllIIlII(final Object llllllllllllIlllllIIlllllIlllIll) {
            return llllllllllllIlllllIIlllllIlllIll != null;
        }
        
        public Stairs2() {
            this.field_75026_c = (List<StructureComponent>)Lists.newArrayList();
        }
        
        static {
            lIIIIIIllllIIIll();
        }
        
        private static void lIIIIIIllllIIIll() {
            (lIlllIIlIllIIl = new int[1])[0] = ((24 + 128 - 106 + 129 ^ 13 + 94 - 12 + 50) & (115 + 3 - 70 + 103 ^ 29 + 10 - 22 + 152 ^ -" ".length()));
        }
        
        public Stairs2(final int llllllllllllIlllllIIllllllIIIlll, final Random llllllllllllIlllllIIllllllIIIllI, final int llllllllllllIlllllIIllllllIIIlIl, final int llllllllllllIlllllIIllllllIIIlII) {
            super(Stairs2.lIlllIIlIllIIl[0], llllllllllllIlllllIIllllllIIIllI, llllllllllllIlllllIIllllllIIIlIl, llllllllllllIlllllIIllllllIIIlII);
            this.field_75026_c = (List<StructureComponent>)Lists.newArrayList();
        }
        
        @Override
        public BlockPos getBoundingBoxCenter() {
            BlockPos blockPos;
            if (lIIIIIIllllIIlII(this.strongholdPortalRoom)) {
                blockPos = this.strongholdPortalRoom.getBoundingBoxCenter();
                "".length();
                if (" ".length() < -" ".length()) {
                    return null;
                }
            }
            else {
                blockPos = super.getBoundingBoxCenter();
            }
            return blockPos;
        }
    }
    
    public static class PortalRoom extends Stronghold
    {
        private /* synthetic */ boolean hasSpawner;
        private static final /* synthetic */ int[] llIIlIllIIllII;
        private static final /* synthetic */ String[] llIIlIllIIlIll;
        
        static /* synthetic */ int[] $SWITCH_TABLE$net$minecraft$util$EnumFacing() {
            final int[] $switch_TABLE$net$minecraft$util$EnumFacing = PortalRoom.$SWITCH_TABLE$net$minecraft$util$EnumFacing;
            if (lIIIllIllIIllIII($switch_TABLE$net$minecraft$util$EnumFacing)) {
                return $switch_TABLE$net$minecraft$util$EnumFacing;
            }
            "".length();
            final byte llllllllllllIlllIIIlIlIlIIlIllII = (Object)new int[EnumFacing.values().length];
            try {
                llllllllllllIlllIIIlIlIlIIlIllII[EnumFacing.DOWN.ordinal()] = PortalRoom.llIIlIllIIllII[1];
                "".length();
                if ("  ".length() <= ((0x18 ^ 0x3 ^ (0xA5 ^ 0x88)) & (0xFE ^ 0xAD ^ (0x1B ^ 0x7E) ^ -" ".length()))) {
                    return null;
                }
            }
            catch (NoSuchFieldError noSuchFieldError) {
                "".length();
            }
            try {
                llllllllllllIlllIIIlIlIlIIlIllII[EnumFacing.EAST.ordinal()] = PortalRoom.llIIlIllIIllII[11];
                "".length();
                if (-" ".length() == (0xE1 ^ 0xA2 ^ (0xD1 ^ 0x96))) {
                    return null;
                }
            }
            catch (NoSuchFieldError noSuchFieldError2) {
                "".length();
            }
            try {
                llllllllllllIlllIIIlIlIlIIlIllII[EnumFacing.NORTH.ordinal()] = PortalRoom.llIIlIllIIllII[15];
                "".length();
                if ("   ".length() <= 0) {
                    return null;
                }
            }
            catch (NoSuchFieldError noSuchFieldError3) {
                "".length();
            }
            try {
                llllllllllllIlllIIIlIlIlIIlIllII[EnumFacing.SOUTH.ordinal()] = PortalRoom.llIIlIllIIllII[10];
                "".length();
                if (((0x14 ^ 0x11) & ~(0x24 ^ 0x21)) <= -" ".length()) {
                    return null;
                }
            }
            catch (NoSuchFieldError noSuchFieldError4) {
                "".length();
            }
            try {
                llllllllllllIlllIIIlIlIlIIlIllII[EnumFacing.UP.ordinal()] = PortalRoom.llIIlIllIIllII[14];
                "".length();
                if (((0xE ^ 0x25 ^ (0xF5 ^ 0x8E)) & (177 + 8 + 12 + 39 ^ 27 + 24 - 16 + 153 ^ -" ".length())) >= (0x43 ^ 0x77 ^ (0xF5 ^ 0xC5))) {
                    return null;
                }
            }
            catch (NoSuchFieldError noSuchFieldError5) {
                "".length();
            }
            try {
                llllllllllllIlllIIIlIlIlIIlIllII[EnumFacing.WEST.ordinal()] = PortalRoom.llIIlIllIIllII[17];
                "".length();
                if (((168 + 154 - 104 + 3 ^ 40 + 47 + 34 + 76) & (11 + 73 - 78 + 169 ^ 63 + 141 - 143 + 122 ^ -" ".length())) != 0x0) {
                    return null;
                }
            }
            catch (NoSuchFieldError noSuchFieldError6) {
                "".length();
            }
            return PortalRoom.$SWITCH_TABLE$net$minecraft$util$EnumFacing = (int[])(Object)llllllllllllIlllIIIlIlIlIIlIllII;
        }
        
        private static boolean lIIIllIllIIllIIl(final int llllllllllllIlllIIIlIlIlIIIIIlII) {
            return llllllllllllIlllIIIlIlIlIIIIIlII != 0;
        }
        
        private static boolean lIIIllIllIIllIII(final Object llllllllllllIlllIIIlIlIlIIIIlIII) {
            return llllllllllllIlllIIIlIlIlIIIIlIII != null;
        }
        
        private static boolean lIIIllIllIIllllI(final int llllllllllllIlllIIIlIlIlIIIIIIII) {
            return llllllllllllIlllIIIlIlIlIIIIIIII > 0;
        }
        
        private static String lIIIllIllIIlIlIl(final String llllllllllllIlllIIIlIlIlIIIlIlIl, final String llllllllllllIlllIIIlIlIlIIIlIllI) {
            try {
                final SecretKeySpec llllllllllllIlllIIIlIlIlIIIllIlI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIlllIIIlIlIlIIIlIllI.getBytes(StandardCharsets.UTF_8)), PortalRoom.llIIlIllIIllII[5]), "DES");
                final Cipher llllllllllllIlllIIIlIlIlIIIllIIl = Cipher.getInstance("DES");
                llllllllllllIlllIIIlIlIlIIIllIIl.init(PortalRoom.llIIlIllIIllII[14], llllllllllllIlllIIIlIlIlIIIllIlI);
                return new String(llllllllllllIlllIIIlIlIlIIIllIIl.doFinal(Base64.getDecoder().decode(llllllllllllIlllIIIlIlIlIIIlIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
            }
            catch (Exception llllllllllllIlllIIIlIlIlIIIllIII) {
                llllllllllllIlllIIIlIlIlIIIllIII.printStackTrace();
                return null;
            }
        }
        
        @Override
        public void buildComponent(final StructureComponent llllllllllllIlllIIIlIlIlIlllIIIl, final List<StructureComponent> llllllllllllIlllIIIlIlIlIlllIIII, final Random llllllllllllIlllIIIlIlIlIllIllll) {
            if (lIIIllIllIIllIII(llllllllllllIlllIIIlIlIlIlllIIIl)) {
                ((Stairs2)llllllllllllIlllIIIlIlIlIlllIIIl).strongholdPortalRoom = this;
            }
        }
        
        private static boolean lIIIllIllIIlllIl(final int llllllllllllIlllIIIlIlIlIIIIlIll, final int llllllllllllIlllIIIlIlIlIIIIlIlI) {
            return llllllllllllIlllIIIlIlIlIIIIlIll > llllllllllllIlllIIIlIlIlIIIIlIlI;
        }
        
        @Override
        public boolean addComponentParts(final World llllllllllllIlllIIIlIlIlIlIIIlll, final Random llllllllllllIlllIIIlIlIlIIllIlll, final StructureBoundingBox llllllllllllIlllIIIlIlIlIIllIllI) {
            this.fillWithRandomizedBlocks(llllllllllllIlllIIIlIlIlIlIIIlll, llllllllllllIlllIIIlIlIlIIllIllI, PortalRoom.llIIlIllIIllII[0], PortalRoom.llIIlIllIIllII[0], PortalRoom.llIIlIllIIllII[0], PortalRoom.llIIlIllIIllII[7], PortalRoom.llIIlIllIIllII[8], PortalRoom.llIIlIllIIllII[9], (boolean)(PortalRoom.llIIlIllIIllII[0] != 0), llllllllllllIlllIIIlIlIlIIllIlll, StructureStrongholdPieces.strongholdStones);
            this.placeDoor(llllllllllllIlllIIIlIlIlIlIIIlll, llllllllllllIlllIIIlIlIlIIllIlll, llllllllllllIlllIIIlIlIlIIllIllI, Door.GRATES, PortalRoom.llIIlIllIIllII[10], PortalRoom.llIIlIllIIllII[1], PortalRoom.llIIlIllIIllII[0]);
            int llllllllllllIlllIIIlIlIlIlIIIlII = PortalRoom.llIIlIllIIllII[11];
            this.fillWithRandomizedBlocks(llllllllllllIlllIIIlIlIlIlIIIlll, llllllllllllIlllIIIlIlIlIIllIllI, PortalRoom.llIIlIllIIllII[1], llllllllllllIlllIIIlIlIlIlIIIlII, PortalRoom.llIIlIllIIllII[1], PortalRoom.llIIlIllIIllII[1], llllllllllllIlllIIIlIlIlIlIIIlII, PortalRoom.llIIlIllIIllII[12], (boolean)(PortalRoom.llIIlIllIIllII[0] != 0), llllllllllllIlllIIIlIlIlIIllIlll, StructureStrongholdPieces.strongholdStones);
            this.fillWithRandomizedBlocks(llllllllllllIlllIIIlIlIlIlIIIlll, llllllllllllIlllIIIlIlIlIIllIllI, PortalRoom.llIIlIllIIllII[13], llllllllllllIlllIIIlIlIlIlIIIlII, PortalRoom.llIIlIllIIllII[1], PortalRoom.llIIlIllIIllII[13], llllllllllllIlllIIIlIlIlIlIIIlII, PortalRoom.llIIlIllIIllII[12], (boolean)(PortalRoom.llIIlIllIIllII[0] != 0), llllllllllllIlllIIIlIlIlIIllIlll, StructureStrongholdPieces.strongholdStones);
            this.fillWithRandomizedBlocks(llllllllllllIlllIIIlIlIlIlIIIlll, llllllllllllIlllIIIlIlIlIIllIllI, PortalRoom.llIIlIllIIllII[14], llllllllllllIlllIIIlIlIlIlIIIlII, PortalRoom.llIIlIllIIllII[1], PortalRoom.llIIlIllIIllII[5], llllllllllllIlllIIIlIlIlIlIIIlII, PortalRoom.llIIlIllIIllII[14], (boolean)(PortalRoom.llIIlIllIIllII[0] != 0), llllllllllllIlllIIIlIlIlIIllIlll, StructureStrongholdPieces.strongholdStones);
            this.fillWithRandomizedBlocks(llllllllllllIlllIIIlIlIlIlIIIlll, llllllllllllIlllIIIlIlIlIIllIllI, PortalRoom.llIIlIllIIllII[14], llllllllllllIlllIIIlIlIlIlIIIlII, PortalRoom.llIIlIllIIllII[12], PortalRoom.llIIlIllIIllII[5], llllllllllllIlllIIIlIlIlIlIIIlII, PortalRoom.llIIlIllIIllII[12], (boolean)(PortalRoom.llIIlIllIIllII[0] != 0), llllllllllllIlllIIIlIlIlIIllIlll, StructureStrongholdPieces.strongholdStones);
            this.fillWithRandomizedBlocks(llllllllllllIlllIIIlIlIlIlIIIlll, llllllllllllIlllIIIlIlIlIIllIllI, PortalRoom.llIIlIllIIllII[1], PortalRoom.llIIlIllIIllII[1], PortalRoom.llIIlIllIIllII[1], PortalRoom.llIIlIllIIllII[14], PortalRoom.llIIlIllIIllII[1], PortalRoom.llIIlIllIIllII[10], (boolean)(PortalRoom.llIIlIllIIllII[0] != 0), llllllllllllIlllIIIlIlIlIIllIlll, StructureStrongholdPieces.strongholdStones);
            this.fillWithRandomizedBlocks(llllllllllllIlllIIIlIlIlIlIIIlll, llllllllllllIlllIIIlIlIlIIllIllI, PortalRoom.llIIlIllIIllII[5], PortalRoom.llIIlIllIIllII[1], PortalRoom.llIIlIllIIllII[1], PortalRoom.llIIlIllIIllII[13], PortalRoom.llIIlIllIIllII[1], PortalRoom.llIIlIllIIllII[10], (boolean)(PortalRoom.llIIlIllIIllII[0] != 0), llllllllllllIlllIIIlIlIlIIllIlll, StructureStrongholdPieces.strongholdStones);
            this.fillWithBlocks(llllllllllllIlllIIIlIlIlIlIIIlll, llllllllllllIlllIIIlIlIlIIllIllI, PortalRoom.llIIlIllIIllII[1], PortalRoom.llIIlIllIIllII[1], PortalRoom.llIIlIllIIllII[1], PortalRoom.llIIlIllIIllII[1], PortalRoom.llIIlIllIIllII[1], PortalRoom.llIIlIllIIllII[15], Blocks.flowing_lava.getDefaultState(), Blocks.flowing_lava.getDefaultState(), (boolean)(PortalRoom.llIIlIllIIllII[0] != 0));
            this.fillWithBlocks(llllllllllllIlllIIIlIlIlIlIIIlll, llllllllllllIlllIIIlIlIlIIllIllI, PortalRoom.llIIlIllIIllII[13], PortalRoom.llIIlIllIIllII[1], PortalRoom.llIIlIllIIllII[1], PortalRoom.llIIlIllIIllII[13], PortalRoom.llIIlIllIIllII[1], PortalRoom.llIIlIllIIllII[15], Blocks.flowing_lava.getDefaultState(), Blocks.flowing_lava.getDefaultState(), (boolean)(PortalRoom.llIIlIllIIllII[0] != 0));
            this.fillWithRandomizedBlocks(llllllllllllIlllIIIlIlIlIlIIIlll, llllllllllllIlllIIIlIlIlIIllIllI, PortalRoom.llIIlIllIIllII[15], PortalRoom.llIIlIllIIllII[1], PortalRoom.llIIlIllIIllII[5], PortalRoom.llIIlIllIIllII[8], PortalRoom.llIIlIllIIllII[1], PortalRoom.llIIlIllIIllII[16], (boolean)(PortalRoom.llIIlIllIIllII[0] != 0), llllllllllllIlllIIIlIlIlIIllIlll, StructureStrongholdPieces.strongholdStones);
            this.fillWithBlocks(llllllllllllIlllIIIlIlIlIlIIIlll, llllllllllllIlllIIIlIlIlIIllIllI, PortalRoom.llIIlIllIIllII[10], PortalRoom.llIIlIllIIllII[1], PortalRoom.llIIlIllIIllII[13], PortalRoom.llIIlIllIIllII[11], PortalRoom.llIIlIllIIllII[1], PortalRoom.llIIlIllIIllII[4], Blocks.flowing_lava.getDefaultState(), Blocks.flowing_lava.getDefaultState(), (boolean)(PortalRoom.llIIlIllIIllII[0] != 0));
            int llllllllllllIlllIIIlIlIlIlIIIIll = PortalRoom.llIIlIllIIllII[15];
            "".length();
            if ((0x80 ^ 0xC2 ^ (0xC0 ^ 0x86)) != (0x1D ^ 0x4B ^ (0x3 ^ 0x51))) {
                return ((0x41 ^ 0x5 ^ (0x71 ^ 0x3F)) & (130 + 16 - 52 + 49 ^ 110 + 57 - 76 + 42 ^ -" ".length())) != 0x0;
            }
            while (!lIIIllIllIIlllII(llllllllllllIlllIIIlIlIlIlIIIIll, PortalRoom.llIIlIllIIllII[12])) {
                this.fillWithBlocks(llllllllllllIlllIIIlIlIlIlIIIlll, llllllllllllIlllIIIlIlIlIIllIllI, PortalRoom.llIIlIllIIllII[0], PortalRoom.llIIlIllIIllII[15], llllllllllllIlllIIIlIlIlIlIIIIll, PortalRoom.llIIlIllIIllII[0], PortalRoom.llIIlIllIIllII[10], llllllllllllIlllIIIlIlIlIlIIIIll, Blocks.iron_bars.getDefaultState(), Blocks.iron_bars.getDefaultState(), (boolean)(PortalRoom.llIIlIllIIllII[0] != 0));
                this.fillWithBlocks(llllllllllllIlllIIIlIlIlIlIIIlll, llllllllllllIlllIIIlIlIlIIllIllI, PortalRoom.llIIlIllIIllII[7], PortalRoom.llIIlIllIIllII[15], llllllllllllIlllIIIlIlIlIlIIIIll, PortalRoom.llIIlIllIIllII[7], PortalRoom.llIIlIllIIllII[10], llllllllllllIlllIIIlIlIlIlIIIIll, Blocks.iron_bars.getDefaultState(), Blocks.iron_bars.getDefaultState(), (boolean)(PortalRoom.llIIlIllIIllII[0] != 0));
                llllllllllllIlllIIIlIlIlIlIIIIll += 2;
            }
            int llllllllllllIlllIIIlIlIlIlIIIIlI = PortalRoom.llIIlIllIIllII[14];
            "".length();
            if ((0x15 ^ 0x7F ^ (0x1 ^ 0x6F)) <= 0) {
                return ((0x3C ^ 0x54 ^ (0xE6 ^ 0x94)) & (47 + 20 - 15 + 115 ^ 168 + 25 - 12 + 8 ^ -" ".length())) != 0x0;
            }
            while (!lIIIllIllIIlllII(llllllllllllIlllIIIlIlIlIlIIIIlI, PortalRoom.llIIlIllIIllII[13])) {
                this.fillWithBlocks(llllllllllllIlllIIIlIlIlIlIIIlll, llllllllllllIlllIIIlIlIlIIllIllI, llllllllllllIlllIIIlIlIlIlIIIIlI, PortalRoom.llIIlIllIIllII[15], PortalRoom.llIIlIllIIllII[9], llllllllllllIlllIIIlIlIlIlIIIIlI, PortalRoom.llIIlIllIIllII[10], PortalRoom.llIIlIllIIllII[9], Blocks.iron_bars.getDefaultState(), Blocks.iron_bars.getDefaultState(), (boolean)(PortalRoom.llIIlIllIIllII[0] != 0));
                llllllllllllIlllIIIlIlIlIlIIIIlI += 2;
            }
            final int llllllllllllIlllIIIlIlIlIlIIIIIl = this.getMetadataWithOffset(Blocks.stone_brick_stairs, PortalRoom.llIIlIllIIllII[15]);
            this.fillWithRandomizedBlocks(llllllllllllIlllIIIlIlIlIlIIIlll, llllllllllllIlllIIIlIlIlIIllIllI, PortalRoom.llIIlIllIIllII[10], PortalRoom.llIIlIllIIllII[1], PortalRoom.llIIlIllIIllII[17], PortalRoom.llIIlIllIIllII[11], PortalRoom.llIIlIllIIllII[1], PortalRoom.llIIlIllIIllII[8], (boolean)(PortalRoom.llIIlIllIIllII[0] != 0), llllllllllllIlllIIIlIlIlIIllIlll, StructureStrongholdPieces.strongholdStones);
            this.fillWithRandomizedBlocks(llllllllllllIlllIIIlIlIlIlIIIlll, llllllllllllIlllIIIlIlIlIIllIllI, PortalRoom.llIIlIllIIllII[10], PortalRoom.llIIlIllIIllII[14], PortalRoom.llIIlIllIIllII[11], PortalRoom.llIIlIllIIllII[11], PortalRoom.llIIlIllIIllII[14], PortalRoom.llIIlIllIIllII[8], (boolean)(PortalRoom.llIIlIllIIllII[0] != 0), llllllllllllIlllIIIlIlIlIIllIlll, StructureStrongholdPieces.strongholdStones);
            this.fillWithRandomizedBlocks(llllllllllllIlllIIIlIlIlIlIIIlll, llllllllllllIlllIIIlIlIlIIllIllI, PortalRoom.llIIlIllIIllII[10], PortalRoom.llIIlIllIIllII[15], PortalRoom.llIIlIllIIllII[8], PortalRoom.llIIlIllIIllII[11], PortalRoom.llIIlIllIIllII[15], PortalRoom.llIIlIllIIllII[8], (boolean)(PortalRoom.llIIlIllIIllII[0] != 0), llllllllllllIlllIIIlIlIlIIllIlll, StructureStrongholdPieces.strongholdStones);
            int llllllllllllIlllIIIlIlIlIlIIIIII = PortalRoom.llIIlIllIIllII[10];
            "".length();
            if (-" ".length() != -" ".length()) {
                return ((0x28 ^ 0x30) & ~(0x65 ^ 0x7D)) != 0x0;
            }
            while (!lIIIllIllIIlllIl(llllllllllllIlllIIIlIlIlIlIIIIII, PortalRoom.llIIlIllIIllII[11])) {
                this.setBlockState(llllllllllllIlllIIIlIlIlIlIIIlll, Blocks.stone_brick_stairs.getStateFromMeta(llllllllllllIlllIIIlIlIlIlIIIIIl), llllllllllllIlllIIIlIlIlIlIIIIII, PortalRoom.llIIlIllIIllII[1], PortalRoom.llIIlIllIIllII[10], llllllllllllIlllIIIlIlIlIIllIllI);
                this.setBlockState(llllllllllllIlllIIIlIlIlIlIIIlll, Blocks.stone_brick_stairs.getStateFromMeta(llllllllllllIlllIIIlIlIlIlIIIIIl), llllllllllllIlllIIIlIlIlIlIIIIII, PortalRoom.llIIlIllIIllII[14], PortalRoom.llIIlIllIIllII[17], llllllllllllIlllIIIlIlIlIIllIllI);
                this.setBlockState(llllllllllllIlllIIIlIlIlIlIIIlll, Blocks.stone_brick_stairs.getStateFromMeta(llllllllllllIlllIIIlIlIlIlIIIIIl), llllllllllllIlllIIIlIlIlIlIIIIII, PortalRoom.llIIlIllIIllII[15], PortalRoom.llIIlIllIIllII[11], llllllllllllIlllIIIlIlIlIIllIllI);
                ++llllllllllllIlllIIIlIlIlIlIIIIII;
            }
            int llllllllllllIlllIIIlIlIlIIllllll = EnumFacing.NORTH.getHorizontalIndex();
            int llllllllllllIlllIIIlIlIlIIlllllI = EnumFacing.SOUTH.getHorizontalIndex();
            int llllllllllllIlllIIIlIlIlIIllllIl = EnumFacing.EAST.getHorizontalIndex();
            int llllllllllllIlllIIIlIlIlIIllllII = EnumFacing.WEST.getHorizontalIndex();
            if (lIIIllIllIIllIII(this.coordBaseMode)) {
                switch ($SWITCH_TABLE$net$minecraft$util$EnumFacing()[this.coordBaseMode.ordinal()]) {
                    case 4: {
                        llllllllllllIlllIIIlIlIlIIllllll = EnumFacing.SOUTH.getHorizontalIndex();
                        llllllllllllIlllIIIlIlIlIIlllllI = EnumFacing.NORTH.getHorizontalIndex();
                        "".length();
                        if (((0x2F ^ 0x3F ^ (0x21 ^ 0x13)) & (0x61 ^ 0x8 ^ (0x1B ^ 0x50) ^ -" ".length())) != ((0x77 ^ 0x6D ^ (0xC3 ^ 0x95)) & (116 + 44 - 74 + 155 ^ 84 + 185 - 162 + 82 ^ -" ".length()))) {
                            return ((88 + 158 - 240 + 158 ^ 12 + 51 - 46 + 118) & (0xCA ^ 0xA1 ^ (0xDD ^ 0x95) ^ -" ".length())) != 0x0;
                        }
                        break;
                    }
                    case 5: {
                        llllllllllllIlllIIIlIlIlIIllllll = EnumFacing.WEST.getHorizontalIndex();
                        llllllllllllIlllIIIlIlIlIIlllllI = EnumFacing.EAST.getHorizontalIndex();
                        llllllllllllIlllIIIlIlIlIIllllIl = EnumFacing.SOUTH.getHorizontalIndex();
                        llllllllllllIlllIIIlIlIlIIllllII = EnumFacing.NORTH.getHorizontalIndex();
                        "".length();
                        if ("  ".length() == 0) {
                            return ((0xC3 ^ 0x99 ^ (0x79 ^ 0x42)) & (0x9A ^ 0xB0 ^ (0x6E ^ 0x25) ^ -" ".length())) != 0x0;
                        }
                        break;
                    }
                    case 6: {
                        llllllllllllIlllIIIlIlIlIIllllll = EnumFacing.EAST.getHorizontalIndex();
                        llllllllllllIlllIIIlIlIlIIlllllI = EnumFacing.WEST.getHorizontalIndex();
                        llllllllllllIlllIIIlIlIlIIllllIl = EnumFacing.SOUTH.getHorizontalIndex();
                        llllllllllllIlllIIIlIlIlIIllllII = EnumFacing.NORTH.getHorizontalIndex();
                        break;
                    }
                }
            }
            final IBlockState stateFromMeta = Blocks.end_portal_frame.getStateFromMeta(llllllllllllIlllIIIlIlIlIIllllll);
            final PropertyBool eye = BlockEndPortalFrame.EYE;
            int b;
            if (lIIIllIllIIllllI(lIIIllIllIIllIll(llllllllllllIlllIIIlIlIlIIllIlll.nextFloat(), 0.9f))) {
                b = PortalRoom.llIIlIllIIllII[1];
                "".length();
                if ((0xA4 ^ 0xA0) < -" ".length()) {
                    return ((0xA7 ^ 0xB3) & ~(0x41 ^ 0x55)) != 0x0;
                }
            }
            else {
                b = PortalRoom.llIIlIllIIllII[0];
            }
            this.setBlockState(llllllllllllIlllIIIlIlIlIlIIIlll, stateFromMeta.withProperty((IProperty<Comparable>)eye, (boolean)(b != 0)), PortalRoom.llIIlIllIIllII[10], PortalRoom.llIIlIllIIllII[15], PortalRoom.llIIlIllIIllII[5], llllllllllllIlllIIIlIlIlIIllIllI);
            final IBlockState stateFromMeta2 = Blocks.end_portal_frame.getStateFromMeta(llllllllllllIlllIIIlIlIlIIllllll);
            final PropertyBool eye2 = BlockEndPortalFrame.EYE;
            int b2;
            if (lIIIllIllIIllllI(lIIIllIllIIllIll(llllllllllllIlllIIIlIlIlIIllIlll.nextFloat(), 0.9f))) {
                b2 = PortalRoom.llIIlIllIIllII[1];
                "".length();
                if (((0x8D ^ 0xC4) & ~(0x74 ^ 0x3D)) < ((0x79 ^ 0x61) & ~(0x18 ^ 0x0))) {
                    return ((0x87 ^ 0xAC) & ~(0x2 ^ 0x29)) != 0x0;
                }
            }
            else {
                b2 = PortalRoom.llIIlIllIIllII[0];
            }
            this.setBlockState(llllllllllllIlllIIIlIlIlIlIIIlll, stateFromMeta2.withProperty((IProperty<Comparable>)eye2, (boolean)(b2 != 0)), PortalRoom.llIIlIllIIllII[17], PortalRoom.llIIlIllIIllII[15], PortalRoom.llIIlIllIIllII[5], llllllllllllIlllIIIlIlIlIIllIllI);
            final IBlockState stateFromMeta3 = Blocks.end_portal_frame.getStateFromMeta(llllllllllllIlllIIIlIlIlIIllllll);
            final PropertyBool eye3 = BlockEndPortalFrame.EYE;
            int b3;
            if (lIIIllIllIIllllI(lIIIllIllIIllIll(llllllllllllIlllIIIlIlIlIIllIlll.nextFloat(), 0.9f))) {
                b3 = PortalRoom.llIIlIllIIllII[1];
                "".length();
                if (null != null) {
                    return ((0xF1 ^ 0x88 ^ (0x6F ^ 0x1A)) & (0xFE ^ 0xA9 ^ (0x70 ^ 0x2B) ^ -" ".length())) != 0x0;
                }
            }
            else {
                b3 = PortalRoom.llIIlIllIIllII[0];
            }
            this.setBlockState(llllllllllllIlllIIIlIlIlIlIIIlll, stateFromMeta3.withProperty((IProperty<Comparable>)eye3, (boolean)(b3 != 0)), PortalRoom.llIIlIllIIllII[11], PortalRoom.llIIlIllIIllII[15], PortalRoom.llIIlIllIIllII[5], llllllllllllIlllIIIlIlIlIIllIllI);
            final IBlockState stateFromMeta4 = Blocks.end_portal_frame.getStateFromMeta(llllllllllllIlllIIIlIlIlIIlllllI);
            final PropertyBool eye4 = BlockEndPortalFrame.EYE;
            int b4;
            if (lIIIllIllIIllllI(lIIIllIllIIllIll(llllllllllllIlllIIIlIlIlIIllIlll.nextFloat(), 0.9f))) {
                b4 = PortalRoom.llIIlIllIIllII[1];
                "".length();
                if (((0x59 ^ 0x2 ^ (0xDA ^ 0x90)) & (0x4D ^ 0x37 ^ (0x79 ^ 0x12) ^ -" ".length())) > 0) {
                    return ((184 + 172 - 344 + 206 ^ 9 + 29 + 91 + 0) & (0x2D ^ 0x32 ^ (0x2E ^ 0x6A) ^ -" ".length())) != 0x0;
                }
            }
            else {
                b4 = PortalRoom.llIIlIllIIllII[0];
            }
            this.setBlockState(llllllllllllIlllIIIlIlIlIlIIIlll, stateFromMeta4.withProperty((IProperty<Comparable>)eye4, (boolean)(b4 != 0)), PortalRoom.llIIlIllIIllII[10], PortalRoom.llIIlIllIIllII[15], PortalRoom.llIIlIllIIllII[16], llllllllllllIlllIIIlIlIlIIllIllI);
            final IBlockState stateFromMeta5 = Blocks.end_portal_frame.getStateFromMeta(llllllllllllIlllIIIlIlIlIIlllllI);
            final PropertyBool eye5 = BlockEndPortalFrame.EYE;
            int b5;
            if (lIIIllIllIIllllI(lIIIllIllIIllIll(llllllllllllIlllIIIlIlIlIIllIlll.nextFloat(), 0.9f))) {
                b5 = PortalRoom.llIIlIllIIllII[1];
                "".length();
                if (" ".length() == ((0xEC ^ 0xB8 ^ (0x3D ^ 0x9)) & (0x14 ^ 0x30 ^ (0xDB ^ 0x9F) ^ -" ".length()))) {
                    return ((0xB6 ^ 0x8E ^ (0xB2 ^ 0xA3)) & ("   ".length() ^ (0x25 ^ 0xF) ^ -" ".length())) != 0x0;
                }
            }
            else {
                b5 = PortalRoom.llIIlIllIIllII[0];
            }
            this.setBlockState(llllllllllllIlllIIIlIlIlIlIIIlll, stateFromMeta5.withProperty((IProperty<Comparable>)eye5, (boolean)(b5 != 0)), PortalRoom.llIIlIllIIllII[17], PortalRoom.llIIlIllIIllII[15], PortalRoom.llIIlIllIIllII[16], llllllllllllIlllIIIlIlIlIIllIllI);
            final IBlockState stateFromMeta6 = Blocks.end_portal_frame.getStateFromMeta(llllllllllllIlllIIIlIlIlIIlllllI);
            final PropertyBool eye6 = BlockEndPortalFrame.EYE;
            int b6;
            if (lIIIllIllIIllllI(lIIIllIllIIllIll(llllllllllllIlllIIIlIlIlIIllIlll.nextFloat(), 0.9f))) {
                b6 = PortalRoom.llIIlIllIIllII[1];
                "".length();
                if (-" ".length() > 0) {
                    return ((0x3 ^ 0x19) & ~(0x13 ^ 0x9)) != 0x0;
                }
            }
            else {
                b6 = PortalRoom.llIIlIllIIllII[0];
            }
            this.setBlockState(llllllllllllIlllIIIlIlIlIlIIIlll, stateFromMeta6.withProperty((IProperty<Comparable>)eye6, (boolean)(b6 != 0)), PortalRoom.llIIlIllIIllII[11], PortalRoom.llIIlIllIIllII[15], PortalRoom.llIIlIllIIllII[16], llllllllllllIlllIIIlIlIlIIllIllI);
            final IBlockState stateFromMeta7 = Blocks.end_portal_frame.getStateFromMeta(llllllllllllIlllIIIlIlIlIIllllIl);
            final PropertyBool eye7 = BlockEndPortalFrame.EYE;
            int b7;
            if (lIIIllIllIIllllI(lIIIllIllIIllIll(llllllllllllIlllIIIlIlIlIIllIlll.nextFloat(), 0.9f))) {
                b7 = PortalRoom.llIIlIllIIllII[1];
                "".length();
                if (null != null) {
                    return ((0x4D ^ 0x57 ^ (0x68 ^ 0x2B)) & (0x78 ^ 0x60 ^ (0x25 ^ 0x64) ^ -" ".length())) != 0x0;
                }
            }
            else {
                b7 = PortalRoom.llIIlIllIIllII[0];
            }
            this.setBlockState(llllllllllllIlllIIIlIlIlIlIIIlll, stateFromMeta7.withProperty((IProperty<Comparable>)eye7, (boolean)(b7 != 0)), PortalRoom.llIIlIllIIllII[15], PortalRoom.llIIlIllIIllII[15], PortalRoom.llIIlIllIIllII[13], llllllllllllIlllIIIlIlIlIIllIllI);
            final IBlockState stateFromMeta8 = Blocks.end_portal_frame.getStateFromMeta(llllllllllllIlllIIIlIlIlIIllllIl);
            final PropertyBool eye8 = BlockEndPortalFrame.EYE;
            int b8;
            if (lIIIllIllIIllllI(lIIIllIllIIllIll(llllllllllllIlllIIIlIlIlIIllIlll.nextFloat(), 0.9f))) {
                b8 = PortalRoom.llIIlIllIIllII[1];
                "".length();
                if ((0x92 ^ 0x96) < 0) {
                    return ((0x44 ^ 0x1E) & ~(0xD3 ^ 0x89)) != 0x0;
                }
            }
            else {
                b8 = PortalRoom.llIIlIllIIllII[0];
            }
            this.setBlockState(llllllllllllIlllIIIlIlIlIlIIIlll, stateFromMeta8.withProperty((IProperty<Comparable>)eye8, (boolean)(b8 != 0)), PortalRoom.llIIlIllIIllII[15], PortalRoom.llIIlIllIIllII[15], PortalRoom.llIIlIllIIllII[7], llllllllllllIlllIIIlIlIlIIllIllI);
            final IBlockState stateFromMeta9 = Blocks.end_portal_frame.getStateFromMeta(llllllllllllIlllIIIlIlIlIIllllIl);
            final PropertyBool eye9 = BlockEndPortalFrame.EYE;
            int b9;
            if (lIIIllIllIIllllI(lIIIllIllIIllIll(llllllllllllIlllIIIlIlIlIIllIlll.nextFloat(), 0.9f))) {
                b9 = PortalRoom.llIIlIllIIllII[1];
                "".length();
                if (-" ".length() > -" ".length()) {
                    return ((0xBA ^ 0x8D) & ~(0x34 ^ 0x3)) != 0x0;
                }
            }
            else {
                b9 = PortalRoom.llIIlIllIIllII[0];
            }
            this.setBlockState(llllllllllllIlllIIIlIlIlIlIIIlll, stateFromMeta9.withProperty((IProperty<Comparable>)eye9, (boolean)(b9 != 0)), PortalRoom.llIIlIllIIllII[15], PortalRoom.llIIlIllIIllII[15], PortalRoom.llIIlIllIIllII[4], llllllllllllIlllIIIlIlIlIIllIllI);
            final IBlockState stateFromMeta10 = Blocks.end_portal_frame.getStateFromMeta(llllllllllllIlllIIIlIlIlIIllllII);
            final PropertyBool eye10 = BlockEndPortalFrame.EYE;
            int b10;
            if (lIIIllIllIIllllI(lIIIllIllIIllIll(llllllllllllIlllIIIlIlIlIIllIlll.nextFloat(), 0.9f))) {
                b10 = PortalRoom.llIIlIllIIllII[1];
                "".length();
                if (((0x7 ^ 0x39 ^ (0x38 ^ 0x55)) & (107 + 11 - 74 + 199 ^ 147 + 93 - 111 + 31 ^ -" ".length())) > 0) {
                    return ("  ".length() & ("  ".length() ^ -" ".length()) & (((70 + 152 - 121 + 60 ^ 104 + 51 - 149 + 131) & (0x8C ^ 0xA0 ^ (0x1B ^ 0x1F) ^ -" ".length())) ^ -" ".length())) != 0x0;
                }
            }
            else {
                b10 = PortalRoom.llIIlIllIIllII[0];
            }
            this.setBlockState(llllllllllllIlllIIIlIlIlIlIIIlll, stateFromMeta10.withProperty((IProperty<Comparable>)eye10, (boolean)(b10 != 0)), PortalRoom.llIIlIllIIllII[8], PortalRoom.llIIlIllIIllII[15], PortalRoom.llIIlIllIIllII[13], llllllllllllIlllIIIlIlIlIIllIllI);
            final IBlockState stateFromMeta11 = Blocks.end_portal_frame.getStateFromMeta(llllllllllllIlllIIIlIlIlIIllllII);
            final PropertyBool eye11 = BlockEndPortalFrame.EYE;
            int b11;
            if (lIIIllIllIIllllI(lIIIllIllIIllIll(llllllllllllIlllIIIlIlIlIIllIlll.nextFloat(), 0.9f))) {
                b11 = PortalRoom.llIIlIllIIllII[1];
                "".length();
                if (((41 + 187 - 77 + 76 ^ 156 + 162 - 299 + 175) & (0xCF ^ 0xA0 ^ (0x10 ^ 0x5E) ^ -" ".length())) != ((41 + 191 - 199 + 164 ^ 65 + 133 - 117 + 63) & (203 + 237 - 362 + 160 ^ 150 + 57 - 71 + 51 ^ -" ".length()))) {
                    return ((0xE3 ^ 0xC0 ^ (0x72 ^ 0x4E)) & (0xE3 ^ 0x80 ^ (0x50 ^ 0x2C) ^ -" ".length())) != 0x0;
                }
            }
            else {
                b11 = PortalRoom.llIIlIllIIllII[0];
            }
            this.setBlockState(llllllllllllIlllIIIlIlIlIlIIIlll, stateFromMeta11.withProperty((IProperty<Comparable>)eye11, (boolean)(b11 != 0)), PortalRoom.llIIlIllIIllII[8], PortalRoom.llIIlIllIIllII[15], PortalRoom.llIIlIllIIllII[7], llllllllllllIlllIIIlIlIlIIllIllI);
            final IBlockState stateFromMeta12 = Blocks.end_portal_frame.getStateFromMeta(llllllllllllIlllIIIlIlIlIIllllII);
            final PropertyBool eye12 = BlockEndPortalFrame.EYE;
            int b12;
            if (lIIIllIllIIllllI(lIIIllIllIIllIll(llllllllllllIlllIIIlIlIlIIllIlll.nextFloat(), 0.9f))) {
                b12 = PortalRoom.llIIlIllIIllII[1];
                "".length();
                if ((0xE3 ^ 0x8C ^ (0xCD ^ 0xA6)) <= 0) {
                    return ((0x60 ^ 0x29 ^ (0x6 ^ 0x52)) & (0xCE ^ 0x82 ^ (0x35 ^ 0x64) ^ -" ".length())) != 0x0;
                }
            }
            else {
                b12 = PortalRoom.llIIlIllIIllII[0];
            }
            this.setBlockState(llllllllllllIlllIIIlIlIlIlIIIlll, stateFromMeta12.withProperty((IProperty<Comparable>)eye12, (boolean)(b12 != 0)), PortalRoom.llIIlIllIIllII[8], PortalRoom.llIIlIllIIllII[15], PortalRoom.llIIlIllIIllII[4], llllllllllllIlllIIIlIlIlIIllIllI);
            if (lIIIllIllIIlllll(this.hasSpawner ? 1 : 0)) {
                llllllllllllIlllIIIlIlIlIlIIIlII = this.getYWithOffset(PortalRoom.llIIlIllIIllII[15]);
                final BlockPos llllllllllllIlllIIIlIlIlIIlllIll = new BlockPos(this.getXWithOffset(PortalRoom.llIIlIllIIllII[17], PortalRoom.llIIlIllIIllII[11]), llllllllllllIlllIIIlIlIlIlIIIlII, this.getZWithOffset(PortalRoom.llIIlIllIIllII[17], PortalRoom.llIIlIllIIllII[11]));
                if (lIIIllIllIIllIIl(llllllllllllIlllIIIlIlIlIIllIllI.isVecInside(llllllllllllIlllIIIlIlIlIIlllIll) ? 1 : 0)) {
                    this.hasSpawner = (PortalRoom.llIIlIllIIllII[1] != 0);
                    llllllllllllIlllIIIlIlIlIlIIIlll.setBlockState(llllllllllllIlllIIIlIlIlIIlllIll, Blocks.mob_spawner.getDefaultState(), PortalRoom.llIIlIllIIllII[14]);
                    "".length();
                    final TileEntity llllllllllllIlllIIIlIlIlIIlllIlI = llllllllllllIlllIIIlIlIlIlIIIlll.getTileEntity(llllllllllllIlllIIIlIlIlIIlllIll);
                    if (lIIIllIllIIllIIl((llllllllllllIlllIIIlIlIlIIlllIlI instanceof TileEntityMobSpawner) ? 1 : 0)) {
                        ((TileEntityMobSpawner)llllllllllllIlllIIIlIlIlIIlllIlI).getSpawnerBaseLogic().setEntityName(PortalRoom.llIIlIllIIlIll[PortalRoom.llIIlIllIIllII[14]]);
                    }
                }
            }
            return PortalRoom.llIIlIllIIllII[1] != 0;
        }
        
        static {
            lIIIllIllIIlIlll();
            lIIIllIllIIlIllI();
        }
        
        private static void lIIIllIllIIlIlll() {
            (llIIlIllIIllII = new int[18])[0] = ((27 + 171 - 106 + 84 ^ 78 + 115 - 189 + 155) & (70 + 9 + 40 + 51 ^ 0 + 71 - 10 + 72 ^ -" ".length()));
            PortalRoom.llIIlIllIIllII[1] = " ".length();
            PortalRoom.llIIlIllIIllII[2] = -(135 + 159 - 176 + 65 ^ 64 + 2 - 14 + 127);
            PortalRoom.llIIlIllIIllII[3] = -" ".length();
            PortalRoom.llIIlIllIIllII[4] = (0x84 ^ 0x8F);
            PortalRoom.llIIlIllIIllII[5] = (0x9E ^ 0x84 ^ (0x5A ^ 0x48));
            PortalRoom.llIIlIllIIllII[6] = (0x22 ^ 0x32);
            PortalRoom.llIIlIllIIllII[7] = (0x27 ^ 0x48 ^ (0x5B ^ 0x3E));
            PortalRoom.llIIlIllIIllII[8] = (0x16 ^ 0x19 ^ (0xC8 ^ 0xC0));
            PortalRoom.llIIlIllIIllII[9] = (0x40 ^ 0x4F);
            PortalRoom.llIIlIllIIllII[10] = (0xAD ^ 0xA9);
            PortalRoom.llIIlIllIIllII[11] = (0x1D ^ 0x71 ^ (0x78 ^ 0x12));
            PortalRoom.llIIlIllIIllII[12] = (133 + 4 + 38 + 6 ^ 8 + 3 + 88 + 88);
            PortalRoom.llIIlIllIIllII[13] = (0x6E ^ 0x67);
            PortalRoom.llIIlIllIIllII[14] = "  ".length();
            PortalRoom.llIIlIllIIllII[15] = "   ".length();
            PortalRoom.llIIlIllIIllII[16] = (0x47 ^ 0x4B);
            PortalRoom.llIIlIllIIllII[17] = (0x8A ^ 0x8F);
        }
        
        public PortalRoom(final int llllllllllllIlllIIIlIlIllIIIIIll, final Random llllllllllllIlllIIIlIlIllIIIIlll, final StructureBoundingBox llllllllllllIlllIIIlIlIllIIIIllI, final EnumFacing llllllllllllIlllIIIlIlIllIIIIlIl) {
            super(llllllllllllIlllIIIlIlIllIIIIIll);
            this.coordBaseMode = llllllllllllIlllIIIlIlIllIIIIlIl;
            this.boundingBox = llllllllllllIlllIIIlIlIllIIIIllI;
        }
        
        private static void lIIIllIllIIlIllI() {
            (llIIlIllIIlIll = new String[PortalRoom.llIIlIllIIllII[15]])[PortalRoom.llIIlIllIIllII[0]] = lIIIllIllIIlIlII("9oZLhwpPq6Q=", "nCpXM");
            PortalRoom.llIIlIllIIlIll[PortalRoom.llIIlIllIIllII[1]] = lIIIllIllIIlIlIl("mFwy2FcFpBQ=", "RrqVM");
            PortalRoom.llIIlIllIIlIll[PortalRoom.llIIlIllIIllII[14]] = lIIIllIllIIlIlIl("ILi9V+8AFdcMNdGjBDH3TA==", "dVCeF");
        }
        
        @Override
        protected void writeStructureToNBT(final NBTTagCompound llllllllllllIlllIIIlIlIlIlllllIl) {
            super.writeStructureToNBT(llllllllllllIlllIIIlIlIlIlllllIl);
            llllllllllllIlllIIIlIlIlIlllllIl.setBoolean(PortalRoom.llIIlIllIIlIll[PortalRoom.llIIlIllIIllII[0]], this.hasSpawner);
        }
        
        private static int lIIIllIllIIllIll(final float n, final float n2) {
            return fcmpl(n, n2);
        }
        
        private static boolean lIIIllIllIIlllII(final int llllllllllllIlllIIIlIlIlIIIIllll, final int llllllllllllIlllIIIlIlIlIIIIlllI) {
            return llllllllllllIlllIIIlIlIlIIIIllll >= llllllllllllIlllIIIlIlIlIIIIlllI;
        }
        
        public PortalRoom() {
        }
        
        @Override
        protected void readStructureFromNBT(final NBTTagCompound llllllllllllIlllIIIlIlIlIlllIlll) {
            super.readStructureFromNBT(llllllllllllIlllIIIlIlIlIlllIlll);
            this.hasSpawner = llllllllllllIlllIIIlIlIlIlllIlll.getBoolean(PortalRoom.llIIlIllIIlIll[PortalRoom.llIIlIllIIllII[1]]);
        }
        
        private static boolean lIIIllIllIIlllll(final int llllllllllllIlllIIIlIlIlIIIIIIlI) {
            return llllllllllllIlllIIIlIlIlIIIIIIlI == 0;
        }
        
        private static boolean lIIIllIllIIllIlI(final Object llllllllllllIlllIIIlIlIlIIIIIllI) {
            return llllllllllllIlllIIIlIlIlIIIIIllI == null;
        }
        
        public static PortalRoom func_175865_a(final List<StructureComponent> llllllllllllIlllIIIlIlIlIlIlllII, final Random llllllllllllIlllIIIlIlIlIlIllIll, final int llllllllllllIlllIIIlIlIlIllIIIlI, final int llllllllllllIlllIIIlIlIlIlIllIIl, final int llllllllllllIlllIIIlIlIlIlIllIII, final EnumFacing llllllllllllIlllIIIlIlIlIlIlIlll, final int llllllllllllIlllIIIlIlIlIlIlIllI) {
            final StructureBoundingBox llllllllllllIlllIIIlIlIlIlIlllIl = StructureBoundingBox.getComponentToAddBoundingBox(llllllllllllIlllIIIlIlIlIllIIIlI, llllllllllllIlllIIIlIlIlIlIllIIl, llllllllllllIlllIIIlIlIlIlIllIII, PortalRoom.llIIlIllIIllII[2], PortalRoom.llIIlIllIIllII[3], PortalRoom.llIIlIllIIllII[0], PortalRoom.llIIlIllIIllII[4], PortalRoom.llIIlIllIIllII[5], PortalRoom.llIIlIllIIllII[6], llllllllllllIlllIIIlIlIlIlIlIlll);
            PortalRoom portalRoom;
            if (lIIIllIllIIllIIl(Stronghold.canStrongholdGoDeeper(llllllllllllIlllIIIlIlIlIlIlllIl) ? 1 : 0) && lIIIllIllIIllIlI(StructureComponent.findIntersecting(llllllllllllIlllIIIlIlIlIlIlllII, llllllllllllIlllIIIlIlIlIlIlllIl))) {
                portalRoom = new PortalRoom(llllllllllllIlllIIIlIlIlIlIlIllI, llllllllllllIlllIIIlIlIlIlIllIll, llllllllllllIlllIIIlIlIlIlIlllIl, llllllllllllIlllIIIlIlIlIlIlIlll);
                "".length();
                if (((0x3E ^ 0x65 ^ (0x6E ^ 0x72)) & (125 + 88 - 193 + 109 ^ 39 + 193 - 218 + 184 ^ -" ".length())) == " ".length()) {
                    return null;
                }
            }
            else {
                portalRoom = null;
            }
            return portalRoom;
        }
        
        private static String lIIIllIllIIlIlII(final String llllllllllllIlllIIIlIlIlIIlIIIlI, final String llllllllllllIlllIIIlIlIlIIlIIIll) {
            try {
                final SecretKeySpec llllllllllllIlllIIIlIlIlIIlIIlll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIlllIIIlIlIlIIlIIIll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
                final Cipher llllllllllllIlllIIIlIlIlIIlIIllI = Cipher.getInstance("Blowfish");
                llllllllllllIlllIIIlIlIlIIlIIllI.init(PortalRoom.llIIlIllIIllII[14], llllllllllllIlllIIIlIlIlIIlIIlll);
                return new String(llllllllllllIlllIIIlIlIlIIlIIllI.doFinal(Base64.getDecoder().decode(llllllllllllIlllIIIlIlIlIIlIIIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
            }
            catch (Exception llllllllllllIlllIIIlIlIlIIlIIlIl) {
                llllllllllllIlllIIIlIlIlIIlIIlIl.printStackTrace();
                return null;
            }
        }
    }
    
    static class Stones extends StructureComponent.BlockSelector
    {
        private Stones() {
        }
        
        private static boolean llIlllIIlIIIlIl(final int lllllllllllllIIlIIllIlIlIllIllll) {
            return lllllllllllllIIlIIllIlIlIllIllll != 0;
        }
        
        private static boolean llIlllIIlIIIllI(final int lllllllllllllIIlIIllIlIlIllIllIl) {
            return lllllllllllllIIlIIllIlIlIllIllIl < 0;
        }
        
        private static int llIlllIIlIIIlII(final float n, final float n2) {
            return fcmpg(n, n2);
        }
        
        @Override
        public void selectBlocks(final Random lllllllllllllIIlIIllIlIlIlllllII, final int lllllllllllllIIlIIllIlIlIllllIll, final int lllllllllllllIIlIIllIlIlIllllIlI, final int lllllllllllllIIlIIllIlIlIllllIIl, final boolean lllllllllllllIIlIIllIlIlIllllIII) {
            if (llIlllIIlIIIlIl(lllllllllllllIIlIIllIlIlIllllIII ? 1 : 0)) {
                final float lllllllllllllIIlIIllIlIlIlllIlll = lllllllllllllIIlIIllIlIlIlllllII.nextFloat();
                if (llIlllIIlIIIllI(llIlllIIlIIIlII(lllllllllllllIIlIIllIlIlIlllIlll, 0.2f))) {
                    this.blockstate = Blocks.stonebrick.getStateFromMeta(BlockStoneBrick.CRACKED_META);
                    "".length();
                    if (-" ".length() == "  ".length()) {
                        return;
                    }
                }
                else if (llIlllIIlIIIllI(llIlllIIlIIIlII(lllllllllllllIIlIIllIlIlIlllIlll, 0.5f))) {
                    this.blockstate = Blocks.stonebrick.getStateFromMeta(BlockStoneBrick.MOSSY_META);
                    "".length();
                    if ((0x3C ^ 0x38) < ((0xA1 ^ 0xB6) & ~(0x5 ^ 0x12))) {
                        return;
                    }
                }
                else if (llIlllIIlIIIllI(llIlllIIlIIIlII(lllllllllllllIIlIIllIlIlIlllIlll, 0.55f))) {
                    this.blockstate = Blocks.monster_egg.getStateFromMeta(BlockSilverfish.EnumType.STONEBRICK.getMetadata());
                    "".length();
                    if (" ".length() < 0) {
                        return;
                    }
                }
                else {
                    this.blockstate = Blocks.stonebrick.getDefaultState();
                    "".length();
                    if ("   ".length() <= 0) {
                        return;
                    }
                }
            }
            else {
                this.blockstate = Blocks.air.getDefaultState();
            }
        }
    }
    
    static class PieceWeight
    {
        public /* synthetic */ int instancesLimit;
        public /* synthetic */ Class<? extends Stronghold> pieceClass;
        private static final /* synthetic */ int[] lIIlIllllIIllI;
        public final /* synthetic */ int pieceWeight;
        public /* synthetic */ int instancesSpawned;
        
        public PieceWeight(final Class<? extends Stronghold> lllllllllllllIIllIIIIIIIlIlIIIlI, final int lllllllllllllIIllIIIIIIIlIlIIIIl, final int lllllllllllllIIllIIIIIIIlIlIIIII) {
            this.pieceClass = lllllllllllllIIllIIIIIIIlIlIIIlI;
            this.pieceWeight = lllllllllllllIIllIIIIIIIlIlIIIIl;
            this.instancesLimit = lllllllllllllIIllIIIIIIIlIlIIIII;
        }
        
        static {
            llIlIlIIIlIIlII();
        }
        
        private static boolean llIlIlIIIlIIlIl(final int lllllllllllllIIllIIIIIIIlIIlIIll) {
            return lllllllllllllIIllIIIIIIIlIIlIIll != 0;
        }
        
        private static void llIlIlIIIlIIlII() {
            (lIIlIllllIIllI = new int[2])[0] = ((114 + 22 - 54 + 54 ^ 58 + 26 + 46 + 16) & (0x9C ^ 0xBF ^ (0x7D ^ 0x44) ^ -" ".length()));
            PieceWeight.lIIlIllllIIllI[1] = " ".length();
        }
        
        public boolean canSpawnMoreStructures() {
            if (llIlIlIIIlIIlIl(this.instancesLimit) && llIlIlIIIlIIllI(this.instancesSpawned, this.instancesLimit)) {
                return PieceWeight.lIIlIllllIIllI[0] != 0;
            }
            return PieceWeight.lIIlIllllIIllI[1] != 0;
        }
        
        public boolean canSpawnMoreStructuresOfType(final int lllllllllllllIIllIIIIIIIlIIlllIl) {
            if (llIlIlIIIlIIlIl(this.instancesLimit) && llIlIlIIIlIIllI(this.instancesSpawned, this.instancesLimit)) {
                return PieceWeight.lIIlIllllIIllI[0] != 0;
            }
            return PieceWeight.lIIlIllllIIllI[1] != 0;
        }
        
        private static boolean llIlIlIIIlIIllI(final int lllllllllllllIIllIIIIIIIlIIlIllI, final int lllllllllllllIIllIIIIIIIlIIlIlIl) {
            return lllllllllllllIIllIIIIIIIlIIlIllI >= lllllllllllllIIllIIIIIIIlIIlIlIl;
        }
    }
    
    public static class Stairs extends Stronghold
    {
        private static final /* synthetic */ int[] llIIIIlIllIlIl;
        private static final /* synthetic */ String[] llIIIIlIlIllll;
        private /* synthetic */ boolean field_75024_a;
        
        @Override
        public boolean addComponentParts(final World llllllllllllIlllIllIlllIIIlIllIl, final Random llllllllllllIlllIllIlllIIIlIIlII, final StructureBoundingBox llllllllllllIlllIllIlllIIIlIIIlI) {
            if (lIIIIlllllllllII(this.isLiquidInStructureBoundingBox(llllllllllllIlllIllIlllIIIlIllIl, llllllllllllIlllIllIlllIIIlIIIlI) ? 1 : 0)) {
                return Stairs.llIIIIlIllIlIl[4] != 0;
            }
            this.fillWithRandomizedBlocks(llllllllllllIlllIllIlllIIIlIllIl, llllllllllllIlllIllIlllIIIlIIIlI, Stairs.llIIIIlIllIlIl[4], Stairs.llIIIIlIllIlIl[4], Stairs.llIIIIlIllIlIl[4], Stairs.llIIIIlIllIlIl[8], Stairs.llIIIIlIllIlIl[9], Stairs.llIIIIlIllIlIl[8], (boolean)(Stairs.llIIIIlIllIlIl[0] != 0), llllllllllllIlllIllIlllIIIlIIlII, StructureStrongholdPieces.strongholdStones);
            this.placeDoor(llllllllllllIlllIllIlllIIIlIllIl, llllllllllllIlllIllIlllIIIlIIlII, llllllllllllIlllIllIlllIIIlIIIlI, this.field_143013_d, Stairs.llIIIIlIllIlIl[0], Stairs.llIIIIlIllIlIl[10], Stairs.llIIIIlIllIlIl[4]);
            this.placeDoor(llllllllllllIlllIllIlllIIIlIllIl, llllllllllllIlllIllIlllIIIlIIlII, llllllllllllIlllIllIlllIIIlIIIlI, Door.OPENING, Stairs.llIIIIlIllIlIl[0], Stairs.llIIIIlIllIlIl[0], Stairs.llIIIIlIllIlIl[8]);
            this.setBlockState(llllllllllllIlllIllIlllIIIlIllIl, Blocks.stonebrick.getDefaultState(), Stairs.llIIIIlIllIlIl[11], Stairs.llIIIIlIllIlIl[12], Stairs.llIIIIlIllIlIl[0], llllllllllllIlllIllIlllIIIlIIIlI);
            this.setBlockState(llllllllllllIlllIllIlllIIIlIllIl, Blocks.stonebrick.getDefaultState(), Stairs.llIIIIlIllIlIl[0], Stairs.llIIIIlIllIlIl[2], Stairs.llIIIIlIllIlIl[0], llllllllllllIlllIllIlllIIIlIIIlI);
            this.setBlockState(llllllllllllIlllIllIlllIIIlIllIl, Blocks.stone_slab.getStateFromMeta(BlockStoneSlab.EnumType.STONE.getMetadata()), Stairs.llIIIIlIllIlIl[0], Stairs.llIIIIlIllIlIl[12], Stairs.llIIIIlIllIlIl[0], llllllllllllIlllIllIlllIIIlIIIlI);
            this.setBlockState(llllllllllllIlllIllIlllIIIlIllIl, Blocks.stonebrick.getDefaultState(), Stairs.llIIIIlIllIlIl[0], Stairs.llIIIIlIllIlIl[2], Stairs.llIIIIlIllIlIl[11], llllllllllllIlllIllIlllIIIlIIIlI);
            this.setBlockState(llllllllllllIlllIllIlllIIIlIllIl, Blocks.stonebrick.getDefaultState(), Stairs.llIIIIlIllIlIl[0], Stairs.llIIIIlIllIlIl[8], Stairs.llIIIIlIllIlIl[13], llllllllllllIlllIllIlllIIIlIIIlI);
            this.setBlockState(llllllllllllIlllIllIlllIIIlIllIl, Blocks.stone_slab.getStateFromMeta(BlockStoneSlab.EnumType.STONE.getMetadata()), Stairs.llIIIIlIllIlIl[0], Stairs.llIIIIlIllIlIl[2], Stairs.llIIIIlIllIlIl[13], llllllllllllIlllIllIlllIIIlIIIlI);
            this.setBlockState(llllllllllllIlllIllIlllIIIlIllIl, Blocks.stonebrick.getDefaultState(), Stairs.llIIIIlIllIlIl[11], Stairs.llIIIIlIllIlIl[8], Stairs.llIIIIlIllIlIl[13], llllllllllllIlllIllIlllIIIlIIIlI);
            this.setBlockState(llllllllllllIlllIllIlllIIIlIllIl, Blocks.stonebrick.getDefaultState(), Stairs.llIIIIlIllIlIl[13], Stairs.llIIIIlIllIlIl[13], Stairs.llIIIIlIllIlIl[13], llllllllllllIlllIllIlllIIIlIIIlI);
            this.setBlockState(llllllllllllIlllIllIlllIIIlIllIl, Blocks.stone_slab.getStateFromMeta(BlockStoneSlab.EnumType.STONE.getMetadata()), Stairs.llIIIIlIllIlIl[13], Stairs.llIIIIlIllIlIl[8], Stairs.llIIIIlIllIlIl[13], llllllllllllIlllIllIlllIIIlIIIlI);
            this.setBlockState(llllllllllllIlllIllIlllIIIlIllIl, Blocks.stonebrick.getDefaultState(), Stairs.llIIIIlIllIlIl[13], Stairs.llIIIIlIllIlIl[13], Stairs.llIIIIlIllIlIl[11], llllllllllllIlllIllIlllIIIlIIIlI);
            this.setBlockState(llllllllllllIlllIllIlllIIIlIllIl, Blocks.stonebrick.getDefaultState(), Stairs.llIIIIlIllIlIl[13], Stairs.llIIIIlIllIlIl[11], Stairs.llIIIIlIllIlIl[0], llllllllllllIlllIllIlllIIIlIIIlI);
            this.setBlockState(llllllllllllIlllIllIlllIIIlIllIl, Blocks.stone_slab.getStateFromMeta(BlockStoneSlab.EnumType.STONE.getMetadata()), Stairs.llIIIIlIllIlIl[13], Stairs.llIIIIlIllIlIl[13], Stairs.llIIIIlIllIlIl[0], llllllllllllIlllIllIlllIIIlIIIlI);
            this.setBlockState(llllllllllllIlllIllIlllIIIlIllIl, Blocks.stonebrick.getDefaultState(), Stairs.llIIIIlIllIlIl[11], Stairs.llIIIIlIllIlIl[11], Stairs.llIIIIlIllIlIl[0], llllllllllllIlllIllIlllIIIlIIIlI);
            this.setBlockState(llllllllllllIlllIllIlllIIIlIllIl, Blocks.stonebrick.getDefaultState(), Stairs.llIIIIlIllIlIl[0], Stairs.llIIIIlIllIlIl[0], Stairs.llIIIIlIllIlIl[0], llllllllllllIlllIllIlllIIIlIIIlI);
            this.setBlockState(llllllllllllIlllIllIlllIIIlIllIl, Blocks.stone_slab.getStateFromMeta(BlockStoneSlab.EnumType.STONE.getMetadata()), Stairs.llIIIIlIllIlIl[0], Stairs.llIIIIlIllIlIl[11], Stairs.llIIIIlIllIlIl[0], llllllllllllIlllIllIlllIIIlIIIlI);
            this.setBlockState(llllllllllllIlllIllIlllIIIlIllIl, Blocks.stonebrick.getDefaultState(), Stairs.llIIIIlIllIlIl[0], Stairs.llIIIIlIllIlIl[0], Stairs.llIIIIlIllIlIl[11], llllllllllllIlllIllIlllIIIlIIIlI);
            this.setBlockState(llllllllllllIlllIllIlllIIIlIllIl, Blocks.stone_slab.getStateFromMeta(BlockStoneSlab.EnumType.STONE.getMetadata()), Stairs.llIIIIlIllIlIl[0], Stairs.llIIIIlIllIlIl[0], Stairs.llIIIIlIllIlIl[13], llllllllllllIlllIllIlllIIIlIIIlI);
            return Stairs.llIIIIlIllIlIl[0] != 0;
        }
        
        static /* synthetic */ int[] $SWITCH_TABLE$net$minecraft$util$EnumFacing() {
            final int[] $switch_TABLE$net$minecraft$util$EnumFacing = Stairs.$SWITCH_TABLE$net$minecraft$util$EnumFacing;
            if (lIIIIllllllllllI($switch_TABLE$net$minecraft$util$EnumFacing)) {
                return $switch_TABLE$net$minecraft$util$EnumFacing;
            }
            "".length();
            final float llllllllllllIlllIllIlllIIIIllIIl = (Object)new int[EnumFacing.values().length];
            try {
                llllllllllllIlllIllIlllIIIIllIIl[EnumFacing.DOWN.ordinal()] = Stairs.llIIIIlIllIlIl[0];
                "".length();
                if (null != null) {
                    return null;
                }
            }
            catch (NoSuchFieldError noSuchFieldError) {
                "".length();
            }
            try {
                llllllllllllIlllIllIlllIIIIllIIl[EnumFacing.EAST.ordinal()] = Stairs.llIIIIlIllIlIl[12];
                "".length();
                if (" ".length() <= 0) {
                    return null;
                }
            }
            catch (NoSuchFieldError noSuchFieldError2) {
                "".length();
            }
            try {
                llllllllllllIlllIllIlllIIIIllIIl[EnumFacing.NORTH.ordinal()] = Stairs.llIIIIlIllIlIl[13];
                "".length();
                if ((0x11 ^ 0x15) <= -" ".length()) {
                    return null;
                }
            }
            catch (NoSuchFieldError noSuchFieldError3) {
                "".length();
            }
            try {
                llllllllllllIlllIllIlllIIIIllIIl[EnumFacing.SOUTH.ordinal()] = Stairs.llIIIIlIllIlIl[8];
                "".length();
                if ((113 + 2 - 20 + 42 ^ 138 + 54 - 125 + 74) == 0x0) {
                    return null;
                }
            }
            catch (NoSuchFieldError noSuchFieldError4) {
                "".length();
            }
            try {
                llllllllllllIlllIllIlllIIIIllIIl[EnumFacing.UP.ordinal()] = Stairs.llIIIIlIllIlIl[11];
                "".length();
                if (((0xF ^ 0x5B) & ~(0x48 ^ 0x1C)) > 0) {
                    return null;
                }
            }
            catch (NoSuchFieldError noSuchFieldError5) {
                "".length();
            }
            try {
                llllllllllllIlllIllIlllIIIIllIIl[EnumFacing.WEST.ordinal()] = Stairs.llIIIIlIllIlIl[2];
                "".length();
                if (" ".length() == "   ".length()) {
                    return null;
                }
            }
            catch (NoSuchFieldError noSuchFieldError6) {
                "".length();
            }
            return Stairs.$SWITCH_TABLE$net$minecraft$util$EnumFacing = (int[])(Object)llllllllllllIlllIllIlllIIIIllIIl;
        }
        
        public Stairs() {
        }
        
        public Stairs(final int llllllllllllIlllIllIlllIlIIIlllI, final Random llllllllllllIlllIllIlllIlIIIlIII, final int llllllllllllIlllIllIlllIlIIIIlll, final int llllllllllllIlllIllIlllIlIIIlIll) {
            super(llllllllllllIlllIllIlllIlIIIlllI);
            this.field_75024_a = (Stairs.llIIIIlIllIlIl[0] != 0);
            this.coordBaseMode = EnumFacing.Plane.HORIZONTAL.random(llllllllllllIlllIllIlllIlIIIlIII);
            this.field_143013_d = Door.OPENING;
            switch ($SWITCH_TABLE$net$minecraft$util$EnumFacing()[this.coordBaseMode.ordinal()]) {
                case 3:
                case 4: {
                    this.boundingBox = new StructureBoundingBox(llllllllllllIlllIllIlllIlIIIIlll, Stairs.llIIIIlIllIlIl[1], llllllllllllIlllIllIlllIlIIIlIll, llllllllllllIlllIllIlllIlIIIIlll + Stairs.llIIIIlIllIlIl[2] - Stairs.llIIIIlIllIlIl[0], Stairs.llIIIIlIllIlIl[3], llllllllllllIlllIllIlllIlIIIlIll + Stairs.llIIIIlIllIlIl[2] - Stairs.llIIIIlIllIlIl[0]);
                    "".length();
                    if (((0x4F ^ 0x46) & ~(0x55 ^ 0x5C)) != 0x0) {
                        throw null;
                    }
                    break;
                }
                default: {
                    this.boundingBox = new StructureBoundingBox(llllllllllllIlllIllIlllIlIIIIlll, Stairs.llIIIIlIllIlIl[1], llllllllllllIlllIllIlllIlIIIlIll, llllllllllllIlllIllIlllIlIIIIlll + Stairs.llIIIIlIllIlIl[2] - Stairs.llIIIIlIllIlIl[0], Stairs.llIIIIlIllIlIl[3], llllllllllllIlllIllIlllIlIIIlIll + Stairs.llIIIIlIllIlIl[2] - Stairs.llIIIIlIllIlIl[0]);
                    break;
                }
            }
        }
        
        private static String lIIIIllllllIlllI(final String llllllllllllIlllIllIlllIIIIIllll, final String llllllllllllIlllIllIlllIIIIIlllI) {
            try {
                final SecretKeySpec llllllllllllIlllIllIlllIIIIlIlII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIlllIllIlllIIIIIlllI.getBytes(StandardCharsets.UTF_8)), Stairs.llIIIIlIllIlIl[14]), "DES");
                final Cipher llllllllllllIlllIllIlllIIIIlIIll = Cipher.getInstance("DES");
                llllllllllllIlllIllIlllIIIIlIIll.init(Stairs.llIIIIlIllIlIl[11], llllllllllllIlllIllIlllIIIIlIlII);
                return new String(llllllllllllIlllIllIlllIIIIlIIll.doFinal(Base64.getDecoder().decode(llllllllllllIlllIllIlllIIIIIllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
            }
            catch (Exception llllllllllllIlllIllIlllIIIIlIIlI) {
                llllllllllllIlllIllIlllIIIIlIIlI.printStackTrace();
                return null;
            }
        }
        
        private static void lIIIIllllllIllll() {
            (llIIIIlIlIllll = new String[Stairs.llIIIIlIllIlIl[11]])[Stairs.llIIIIlIllIlIl[4]] = lIIIIllllllIlllI("Ansf7hyobQk=", "mtcQT");
            Stairs.llIIIIlIlIllll[Stairs.llIIIIlIllIlIl[0]] = lIIIIllllllIlllI("groi+7DlsYc=", "KnXeO");
        }
        
        private static boolean lIIIIlllllllllII(final int llllllllllllIlllIllIlllIIIIIIllI) {
            return llllllllllllIlllIllIlllIIIIIIllI != 0;
        }
        
        @Override
        public void buildComponent(final StructureComponent llllllllllllIlllIllIlllIIllIIIIl, final List<StructureComponent> llllllllllllIlllIllIlllIIllIIIII, final Random llllllllllllIlllIllIlllIIllIIIll) {
            if (lIIIIlllllllllII(this.field_75024_a ? 1 : 0)) {
                StructureStrongholdPieces.access$2(Crossing.class);
            }
            this.getNextComponentNormal((Stairs2)llllllllllllIlllIllIlllIIllIIIIl, llllllllllllIlllIllIlllIIllIIIII, llllllllllllIlllIllIlllIIllIIIll, Stairs.llIIIIlIllIlIl[0], Stairs.llIIIIlIllIlIl[0]);
            "".length();
        }
        
        public Stairs(final int llllllllllllIlllIllIlllIIllllIlI, final Random llllllllllllIlllIllIlllIIllllIIl, final StructureBoundingBox llllllllllllIlllIllIlllIIllllIII, final EnumFacing llllllllllllIlllIllIlllIIlllllII) {
            super(llllllllllllIlllIllIlllIIllllIlI);
            this.field_75024_a = (Stairs.llIIIIlIllIlIl[4] != 0);
            this.coordBaseMode = llllllllllllIlllIllIlllIIlllllII;
            this.field_143013_d = this.getRandomDoor(llllllllllllIlllIllIlllIIllllIIl);
            this.boundingBox = llllllllllllIlllIllIlllIIllllIII;
        }
        
        private static void lIIIIllllllllIll() {
            (llIIIIlIllIlIl = new int[15])[0] = " ".length();
            Stairs.llIIIIlIllIlIl[1] = (0x5E ^ 0x34 ^ (0x26 ^ 0xC));
            Stairs.llIIIIlIllIlIl[2] = (0x56 ^ 0x53);
            Stairs.llIIIIlIllIlIl[3] = (0x5A ^ 0x10);
            Stairs.llIIIIlIllIlIl[4] = ((0x39 ^ 0x34) & ~(0x25 ^ 0x28));
            Stairs.llIIIIlIllIlIl[5] = -" ".length();
            Stairs.llIIIIlIllIlIl[6] = -(0xBC ^ 0xA8 ^ (0x98 ^ 0x8B));
            Stairs.llIIIIlIllIlIl[7] = (0x72 ^ 0x32 ^ (0x7E ^ 0x35));
            Stairs.llIIIIlIllIlIl[8] = (0x13 ^ 0x4C ^ (0x32 ^ 0x69));
            Stairs.llIIIIlIllIlIl[9] = (0x67 ^ 0x6D);
            Stairs.llIIIIlIllIlIl[10] = (145 + 126 - 229 + 109 ^ 77 + 43 - 40 + 64);
            Stairs.llIIIIlIllIlIl[11] = "  ".length();
            Stairs.llIIIIlIllIlIl[12] = (0x5F ^ 0x59);
            Stairs.llIIIIlIllIlIl[13] = "   ".length();
            Stairs.llIIIIlIllIlIl[14] = (0x59 ^ 0x51);
        }
        
        public static Stairs func_175863_a(final List<StructureComponent> llllllllllllIlllIllIlllIIlIIllIl, final Random llllllllllllIlllIllIlllIIlIIlIll, final int llllllllllllIlllIllIlllIIlIlIlII, final int llllllllllllIlllIllIlllIIlIlIIll, final int llllllllllllIlllIllIlllIIlIIIlll, final EnumFacing llllllllllllIlllIllIlllIIlIIIllI, final int llllllllllllIlllIllIlllIIlIIIlII) {
            final StructureBoundingBox llllllllllllIlllIllIlllIIlIIlllI = StructureBoundingBox.getComponentToAddBoundingBox(llllllllllllIlllIllIlllIIlIlIlII, llllllllllllIlllIllIlllIIlIlIIll, llllllllllllIlllIllIlllIIlIIIlll, Stairs.llIIIIlIllIlIl[5], Stairs.llIIIIlIllIlIl[6], Stairs.llIIIIlIllIlIl[4], Stairs.llIIIIlIllIlIl[2], Stairs.llIIIIlIllIlIl[7], Stairs.llIIIIlIllIlIl[2], llllllllllllIlllIllIlllIIlIIIllI);
            Stairs stairs;
            if (lIIIIlllllllllII(Stronghold.canStrongholdGoDeeper(llllllllllllIlllIllIlllIIlIIlllI) ? 1 : 0) && lIIIIlllllllllIl(StructureComponent.findIntersecting(llllllllllllIlllIllIlllIIlIIllIl, llllllllllllIlllIllIlllIIlIIlllI))) {
                stairs = new Stairs(llllllllllllIlllIllIlllIIlIIIlII, llllllllllllIlllIllIlllIIlIIlIll, llllllllllllIlllIllIlllIIlIIlllI, llllllllllllIlllIllIlllIIlIIIllI);
                "".length();
                if ("   ".length() > "   ".length()) {
                    return null;
                }
            }
            else {
                stairs = null;
            }
            return stairs;
        }
        
        private static boolean lIIIIllllllllllI(final Object llllllllllllIlllIllIlllIIIIIlIlI) {
            return llllllllllllIlllIllIlllIIIIIlIlI != null;
        }
        
        private static boolean lIIIIlllllllllIl(final Object llllllllllllIlllIllIlllIIIIIlIII) {
            return llllllllllllIlllIllIlllIIIIIlIII == null;
        }
        
        @Override
        protected void readStructureFromNBT(final NBTTagCompound llllllllllllIlllIllIlllIIllIlIll) {
            super.readStructureFromNBT(llllllllllllIlllIllIlllIIllIlIll);
            this.field_75024_a = llllllllllllIlllIllIlllIIllIlIll.getBoolean(Stairs.llIIIIlIlIllll[Stairs.llIIIIlIllIlIl[0]]);
        }
        
        @Override
        protected void writeStructureToNBT(final NBTTagCompound llllllllllllIlllIllIlllIIlllIIll) {
            super.writeStructureToNBT(llllllllllllIlllIllIlllIIlllIIll);
            llllllllllllIlllIllIlllIIlllIIll.setBoolean(Stairs.llIIIIlIlIllll[Stairs.llIIIIlIllIlIl[4]], this.field_75024_a);
        }
        
        static {
            lIIIIllllllllIll();
            lIIIIllllllIllll();
        }
    }
    
    public static class Crossing extends Stronghold
    {
        private static final /* synthetic */ String[] llIIlIIlllllll;
        private /* synthetic */ boolean field_74997_c;
        private /* synthetic */ boolean field_74995_d;
        private /* synthetic */ boolean field_74999_h;
        private static final /* synthetic */ int[] llIIlIlIIIIIII;
        private /* synthetic */ boolean field_74996_b;
        
        private static boolean lIIIllIIllIIllIl(final int llllllllllllIlllIIlIIIIllIIlIIll) {
            return llllllllllllIlllIIlIIIIllIIlIIll > 0;
        }
        
        @Override
        public boolean addComponentParts(final World llllllllllllIlllIIlIIIIlllIlllIl, final Random llllllllllllIlllIIlIIIIlllIlllII, final StructureBoundingBox llllllllllllIlllIIlIIIIlllIlIlll) {
            if (lIIIllIIllIlIIII(this.isLiquidInStructureBoundingBox(llllllllllllIlllIIlIIIIlllIlllIl, llllllllllllIlllIIlIIIIlllIlIlll) ? 1 : 0)) {
                return Crossing.llIIlIlIIIIIII[2] != 0;
            }
            this.fillWithRandomizedBlocks(llllllllllllIlllIIlIIIIlllIlllIl, llllllllllllIlllIIlIIIIlllIlIlll, Crossing.llIIlIlIIIIIII[2], Crossing.llIIlIlIIIIIII[2], Crossing.llIIlIlIIIIIII[2], Crossing.llIIlIlIIIIIII[12], Crossing.llIIlIlIIIIIII[8], Crossing.llIIlIlIIIIIII[11], (boolean)(Crossing.llIIlIlIIIIIII[1] != 0), llllllllllllIlllIIlIIIIlllIlllII, StructureStrongholdPieces.strongholdStones);
            this.placeDoor(llllllllllllIlllIIlIIIIlllIlllIl, llllllllllllIlllIIlIIIIlllIlllII, llllllllllllIlllIIlIIIIlllIlIlll, this.field_143013_d, Crossing.llIIlIlIIIIIII[4], Crossing.llIIlIlIIIIIII[0], Crossing.llIIlIlIIIIIII[2]);
            if (lIIIllIIllIlIIII(this.field_74996_b ? 1 : 0)) {
                this.fillWithBlocks(llllllllllllIlllIIlIIIIlllIlllIl, llllllllllllIlllIIlIIIIlllIlIlll, Crossing.llIIlIlIIIIIII[2], Crossing.llIIlIlIIIIIII[0], Crossing.llIIlIlIIIIIII[1], Crossing.llIIlIlIIIIIII[2], Crossing.llIIlIlIIIIIII[5], Crossing.llIIlIlIIIIIII[0], Blocks.air.getDefaultState(), Blocks.air.getDefaultState(), (boolean)(Crossing.llIIlIlIIIIIII[2] != 0));
            }
            if (lIIIllIIllIlIIII(this.field_74995_d ? 1 : 0)) {
                this.fillWithBlocks(llllllllllllIlllIIlIIIIlllIlllIl, llllllllllllIlllIIlIIIIlllIlIlll, Crossing.llIIlIlIIIIIII[12], Crossing.llIIlIlIIIIIII[0], Crossing.llIIlIlIIIIIII[1], Crossing.llIIlIlIIIIIII[12], Crossing.llIIlIlIIIIIII[5], Crossing.llIIlIlIIIIIII[0], Blocks.air.getDefaultState(), Blocks.air.getDefaultState(), (boolean)(Crossing.llIIlIlIIIIIII[2] != 0));
            }
            if (lIIIllIIllIlIIII(this.field_74997_c ? 1 : 0)) {
                this.fillWithBlocks(llllllllllllIlllIIlIIIIlllIlllIl, llllllllllllIlllIIlIIIIlllIlIlll, Crossing.llIIlIlIIIIIII[2], Crossing.llIIlIlIIIIIII[5], Crossing.llIIlIlIIIIIII[7], Crossing.llIIlIlIIIIIII[2], Crossing.llIIlIlIIIIIII[7], Crossing.llIIlIlIIIIIII[12], Blocks.air.getDefaultState(), Blocks.air.getDefaultState(), (boolean)(Crossing.llIIlIlIIIIIII[2] != 0));
            }
            if (lIIIllIIllIlIIII(this.field_74999_h ? 1 : 0)) {
                this.fillWithBlocks(llllllllllllIlllIIlIIIIlllIlllIl, llllllllllllIlllIIlIIIIlllIlIlll, Crossing.llIIlIlIIIIIII[12], Crossing.llIIlIlIIIIIII[5], Crossing.llIIlIlIIIIIII[7], Crossing.llIIlIlIIIIIII[12], Crossing.llIIlIlIIIIIII[7], Crossing.llIIlIlIIIIIII[12], Blocks.air.getDefaultState(), Blocks.air.getDefaultState(), (boolean)(Crossing.llIIlIlIIIIIII[2] != 0));
            }
            this.fillWithBlocks(llllllllllllIlllIIlIIIIlllIlllIl, llllllllllllIlllIIlIIIIlllIlIlll, Crossing.llIIlIlIIIIIII[5], Crossing.llIIlIlIIIIIII[1], Crossing.llIIlIlIIIIIII[11], Crossing.llIIlIlIIIIIII[7], Crossing.llIIlIlIIIIIII[0], Crossing.llIIlIlIIIIIII[11], Blocks.air.getDefaultState(), Blocks.air.getDefaultState(), (boolean)(Crossing.llIIlIlIIIIIII[2] != 0));
            this.fillWithRandomizedBlocks(llllllllllllIlllIIlIIIIlllIlllIl, llllllllllllIlllIIlIIIIlllIlIlll, Crossing.llIIlIlIIIIIII[1], Crossing.llIIlIlIIIIIII[3], Crossing.llIIlIlIIIIIII[1], Crossing.llIIlIlIIIIIII[8], Crossing.llIIlIlIIIIIII[3], Crossing.llIIlIlIIIIIII[6], (boolean)(Crossing.llIIlIlIIIIIII[2] != 0), llllllllllllIlllIIlIIIIlllIlllII, StructureStrongholdPieces.strongholdStones);
            this.fillWithRandomizedBlocks(llllllllllllIlllIIlIIIIlllIlllIl, llllllllllllIlllIIlIIIIlllIlIlll, Crossing.llIIlIlIIIIIII[4], Crossing.llIIlIlIIIIIII[1], Crossing.llIIlIlIIIIIII[5], Crossing.llIIlIlIIIIIII[4], Crossing.llIIlIlIIIIIII[4], Crossing.llIIlIlIIIIIII[12], (boolean)(Crossing.llIIlIlIIIIIII[2] != 0), llllllllllllIlllIIlIIIIlllIlllII, StructureStrongholdPieces.strongholdStones);
            this.fillWithRandomizedBlocks(llllllllllllIlllIIlIIIIlllIlllIl, llllllllllllIlllIIlIIIIlllIlIlll, Crossing.llIIlIlIIIIIII[8], Crossing.llIIlIlIIIIIII[1], Crossing.llIIlIlIIIIIII[5], Crossing.llIIlIlIIIIIII[8], Crossing.llIIlIlIIIIIII[4], Crossing.llIIlIlIIIIIII[12], (boolean)(Crossing.llIIlIlIIIIIII[2] != 0), llllllllllllIlllIIlIIIIlllIlllII, StructureStrongholdPieces.strongholdStones);
            this.fillWithRandomizedBlocks(llllllllllllIlllIIlIIIIlllIlllIl, llllllllllllIlllIIlIIIIlllIlIlll, Crossing.llIIlIlIIIIIII[1], Crossing.llIIlIlIIIIIII[4], Crossing.llIIlIlIIIIIII[7], Crossing.llIIlIlIIIIIII[0], Crossing.llIIlIlIIIIIII[4], Crossing.llIIlIlIIIIIII[12], (boolean)(Crossing.llIIlIlIIIIIII[2] != 0), llllllllllllIlllIIlIIIIlllIlllII, StructureStrongholdPieces.strongholdStones);
            this.fillWithRandomizedBlocks(llllllllllllIlllIIlIIIIlllIlllIl, llllllllllllIlllIIlIIIIlllIlIlll, Crossing.llIIlIlIIIIIII[1], Crossing.llIIlIlIIIIIII[0], Crossing.llIIlIlIIIIIII[5], Crossing.llIIlIlIIIIIII[0], Crossing.llIIlIlIIIIIII[0], Crossing.llIIlIlIIIIIII[6], (boolean)(Crossing.llIIlIlIIIIIII[2] != 0), llllllllllllIlllIIlIIIIlllIlllII, StructureStrongholdPieces.strongholdStones);
            this.fillWithBlocks(llllllllllllIlllIIlIIIIlllIlllIl, llllllllllllIlllIIlIIIIlllIlIlll, Crossing.llIIlIlIIIIIII[1], Crossing.llIIlIlIIIIIII[0], Crossing.llIIlIlIIIIIII[4], Crossing.llIIlIlIIIIIII[0], Crossing.llIIlIlIIIIIII[0], Crossing.llIIlIlIIIIIII[4], Blocks.stone_slab.getDefaultState(), Blocks.stone_slab.getDefaultState(), (boolean)(Crossing.llIIlIlIIIIIII[2] != 0));
            this.fillWithBlocks(llllllllllllIlllIIlIIIIlllIlllIl, llllllllllllIlllIIlIIIIlllIlIlll, Crossing.llIIlIlIIIIIII[1], Crossing.llIIlIlIIIIIII[4], Crossing.llIIlIlIIIIIII[6], Crossing.llIIlIlIIIIIII[0], Crossing.llIIlIlIIIIIII[4], Crossing.llIIlIlIIIIIII[6], Blocks.stone_slab.getDefaultState(), Blocks.stone_slab.getDefaultState(), (boolean)(Crossing.llIIlIlIIIIIII[2] != 0));
            this.fillWithRandomizedBlocks(llllllllllllIlllIIlIIIIlllIlllIl, llllllllllllIlllIIlIIIIlllIlIlll, Crossing.llIIlIlIIIIIII[5], Crossing.llIIlIlIIIIIII[1], Crossing.llIIlIlIIIIIII[7], Crossing.llIIlIlIIIIIII[7], Crossing.llIIlIlIIIIIII[1], Crossing.llIIlIlIIIIIII[8], (boolean)(Crossing.llIIlIlIIIIIII[2] != 0), llllllllllllIlllIIlIIIIlllIlllII, StructureStrongholdPieces.strongholdStones);
            this.fillWithBlocks(llllllllllllIlllIIlIIIIlllIlllIl, llllllllllllIlllIIlIIIIlllIlIlll, Crossing.llIIlIlIIIIIII[5], Crossing.llIIlIlIIIIIII[1], Crossing.llIIlIlIIIIIII[12], Crossing.llIIlIlIIIIIII[7], Crossing.llIIlIlIIIIIII[1], Crossing.llIIlIlIIIIIII[12], Blocks.stone_slab.getDefaultState(), Blocks.stone_slab.getDefaultState(), (boolean)(Crossing.llIIlIlIIIIIII[2] != 0));
            this.fillWithBlocks(llllllllllllIlllIIlIIIIlllIlllIl, llllllllllllIlllIIlIIIIlllIlIlll, Crossing.llIIlIlIIIIIII[5], Crossing.llIIlIlIIIIIII[3], Crossing.llIIlIlIIIIIII[7], Crossing.llIIlIlIIIIIII[7], Crossing.llIIlIlIIIIIII[3], Crossing.llIIlIlIIIIIII[7], Blocks.stone_slab.getDefaultState(), Blocks.stone_slab.getDefaultState(), (boolean)(Crossing.llIIlIlIIIIIII[2] != 0));
            this.fillWithBlocks(llllllllllllIlllIIlIIIIlllIlllIl, llllllllllllIlllIIlIIIIlllIlIlll, Crossing.llIIlIlIIIIIII[4], Crossing.llIIlIlIIIIIII[5], Crossing.llIIlIlIIIIIII[7], Crossing.llIIlIlIIIIIII[4], Crossing.llIIlIlIIIIIII[5], Crossing.llIIlIlIIIIIII[12], Blocks.stone_slab.getDefaultState(), Blocks.stone_slab.getDefaultState(), (boolean)(Crossing.llIIlIlIIIIIII[2] != 0));
            this.fillWithBlocks(llllllllllllIlllIIlIIIIlllIlllIl, llllllllllllIlllIIlIIIIlllIlIlll, Crossing.llIIlIlIIIIIII[8], Crossing.llIIlIlIIIIIII[5], Crossing.llIIlIlIIIIIII[7], Crossing.llIIlIlIIIIIII[8], Crossing.llIIlIlIIIIIII[5], Crossing.llIIlIlIIIIIII[12], Blocks.stone_slab.getDefaultState(), Blocks.stone_slab.getDefaultState(), (boolean)(Crossing.llIIlIlIIIIIII[2] != 0));
            this.fillWithBlocks(llllllllllllIlllIIlIIIIlllIlllIl, llllllllllllIlllIIlIIIIlllIlIlll, Crossing.llIIlIlIIIIIII[5], Crossing.llIIlIlIIIIIII[5], Crossing.llIIlIlIIIIIII[7], Crossing.llIIlIlIIIIIII[7], Crossing.llIIlIlIIIIIII[5], Crossing.llIIlIlIIIIIII[12], Blocks.double_stone_slab.getDefaultState(), Blocks.double_stone_slab.getDefaultState(), (boolean)(Crossing.llIIlIlIIIIIII[2] != 0));
            this.setBlockState(llllllllllllIlllIIlIIIIlllIlllIl, Blocks.torch.getDefaultState(), Crossing.llIIlIlIIIIIII[6], Crossing.llIIlIlIIIIIII[5], Crossing.llIIlIlIIIIIII[6], llllllllllllIlllIIlIIIIlllIlIlll);
            return Crossing.llIIlIlIIIIIII[1] != 0;
        }
        
        @Override
        protected void writeStructureToNBT(final NBTTagCompound llllllllllllIlllIIlIIIlIIIIlIlIl) {
            super.writeStructureToNBT(llllllllllllIlllIIlIIIlIIIIlIlIl);
            llllllllllllIlllIIlIIIlIIIIlIlIl.setBoolean(Crossing.llIIlIIlllllll[Crossing.llIIlIlIIIIIII[2]], this.field_74996_b);
            llllllllllllIlllIIlIIIlIIIIlIlIl.setBoolean(Crossing.llIIlIIlllllll[Crossing.llIIlIlIIIIIII[1]], this.field_74997_c);
            llllllllllllIlllIIlIIIlIIIIlIlIl.setBoolean(Crossing.llIIlIIlllllll[Crossing.llIIlIlIIIIIII[3]], this.field_74995_d);
            llllllllllllIlllIIlIIIlIIIIlIlIl.setBoolean(Crossing.llIIlIIlllllll[Crossing.llIIlIlIIIIIII[0]], this.field_74999_h);
        }
        
        public Crossing() {
        }
        
        public Crossing(final int llllllllllllIlllIIlIIIlIIIlIIIIl, final Random llllllllllllIlllIIlIIIlIIIIllIll, final StructureBoundingBox llllllllllllIlllIIlIIIlIIIIlllll, final EnumFacing llllllllllllIlllIIlIIIlIIIIllIIl) {
            super(llllllllllllIlllIIlIIIlIIIlIIIIl);
            this.coordBaseMode = llllllllllllIlllIIlIIIlIIIIllIIl;
            this.field_143013_d = this.getRandomDoor(llllllllllllIlllIIlIIIlIIIIllIll);
            this.boundingBox = llllllllllllIlllIIlIIIlIIIIlllll;
            this.field_74996_b = llllllllllllIlllIIlIIIlIIIIllIll.nextBoolean();
            this.field_74997_c = llllllllllllIlllIIlIIIlIIIIllIll.nextBoolean();
            this.field_74995_d = llllllllllllIlllIIlIIIlIIIIllIll.nextBoolean();
            int field_74999_h;
            if (lIIIllIIllIIllIl(llllllllllllIlllIIlIIIlIIIIllIll.nextInt(Crossing.llIIlIlIIIIIII[0]))) {
                field_74999_h = Crossing.llIIlIlIIIIIII[1];
                "".length();
                if (null != null) {
                    throw null;
                }
            }
            else {
                field_74999_h = Crossing.llIIlIlIIIIIII[2];
            }
            this.field_74999_h = (field_74999_h != 0);
        }
        
        private static void lIIIllIIllIIllII() {
            (llIIlIlIIIIIII = new int[14])[0] = "   ".length();
            Crossing.llIIlIlIIIIIII[1] = " ".length();
            Crossing.llIIlIlIIIIIII[2] = ((184 + 31 - 206 + 236 ^ 119 + 127 - 173 + 119) & (0x4A ^ 0x5B ^ (0x88 ^ 0xAC) ^ -" ".length()));
            Crossing.llIIlIlIIIIIII[3] = "  ".length();
            Crossing.llIIlIlIIIIIII[4] = (96 + 70 - 122 + 150 ^ 87 + 31 + 3 + 77);
            Crossing.llIIlIlIIIIIII[5] = (0x28 ^ 0x6C ^ (0xFD ^ 0xBC));
            Crossing.llIIlIlIIIIIII[6] = (0xBA ^ 0xBC);
            Crossing.llIIlIlIIIIIII[7] = (0x96 ^ 0x91);
            Crossing.llIIlIlIIIIIII[8] = (4 + 56 + 81 + 61 ^ 83 + 0 - 31 + 142);
            Crossing.llIIlIlIIIIIII[9] = -(0x3 ^ 0x7);
            Crossing.llIIlIlIIIIIII[10] = -"   ".length();
            Crossing.llIIlIlIIIIIII[11] = (17 + 139 - 47 + 64 ^ 97 + 119 - 54 + 5);
            Crossing.llIIlIlIIIIIII[12] = (0xB0 ^ 0xB9);
            Crossing.llIIlIlIIIIIII[13] = (0x79 ^ 0x15 ^ (0xD8 ^ 0xBF));
        }
        
        static {
            lIIIllIIllIIllII();
            lIIIllIIllIIlIll();
        }
        
        private static String lIIIllIIllIIlIlI(final String llllllllllllIlllIIlIIIIllIlIlIII, final String llllllllllllIlllIIlIIIIllIlIIlll) {
            try {
                final SecretKeySpec llllllllllllIlllIIlIIIIllIlIllIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIlllIIlIIIIllIlIIlll.getBytes(StandardCharsets.UTF_8)), Crossing.llIIlIlIIIIIII[8]), "DES");
                final Cipher llllllllllllIlllIIlIIIIllIlIllII = Cipher.getInstance("DES");
                llllllllllllIlllIIlIIIIllIlIllII.init(Crossing.llIIlIlIIIIIII[3], llllllllllllIlllIIlIIIIllIlIllIl);
                return new String(llllllllllllIlllIIlIIIIllIlIllII.doFinal(Base64.getDecoder().decode(llllllllllllIlllIIlIIIIllIlIlIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
            }
            catch (Exception llllllllllllIlllIIlIIIIllIlIlIll) {
                llllllllllllIlllIIlIIIIllIlIlIll.printStackTrace();
                return null;
            }
        }
        
        private static boolean lIIIllIIllIlIIII(final int llllllllllllIlllIIlIIIIllIIlIlIl) {
            return llllllllllllIlllIIlIIIIllIIlIlIl != 0;
        }
        
        private static String lIIIllIIllIIlIII(String llllllllllllIlllIIlIIIIllIlllIlI, final String llllllllllllIlllIIlIIIIllIlllIIl) {
            llllllllllllIlllIIlIIIIllIlllIlI = (long)new String(Base64.getDecoder().decode(((String)llllllllllllIlllIIlIIIIllIlllIlI).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
            final StringBuilder llllllllllllIlllIIlIIIIllIllllIl = new StringBuilder();
            final char[] llllllllllllIlllIIlIIIIllIllllII = llllllllllllIlllIIlIIIIllIlllIIl.toCharArray();
            int llllllllllllIlllIIlIIIIllIlllIll = Crossing.llIIlIlIIIIIII[2];
            final float llllllllllllIlllIIlIIIIllIllIlIl = (Object)((String)llllllllllllIlllIIlIIIIllIlllIlI).toCharArray();
            final short llllllllllllIlllIIlIIIIllIllIlII = (short)llllllllllllIlllIIlIIIIllIllIlIl.length;
            char llllllllllllIlllIIlIIIIllIllIIll = (char)Crossing.llIIlIlIIIIIII[2];
            while (lIIIllIIllIlIIlI(llllllllllllIlllIIlIIIIllIllIIll, llllllllllllIlllIIlIIIIllIllIlII)) {
                final char llllllllllllIlllIIlIIIIlllIIIIII = llllllllllllIlllIIlIIIIllIllIlIl[llllllllllllIlllIIlIIIIllIllIIll];
                llllllllllllIlllIIlIIIIllIllllIl.append((char)(llllllllllllIlllIIlIIIIlllIIIIII ^ llllllllllllIlllIIlIIIIllIllllII[llllllllllllIlllIIlIIIIllIlllIll % llllllllllllIlllIIlIIIIllIllllII.length]));
                "".length();
                ++llllllllllllIlllIIlIIIIllIlllIll;
                ++llllllllllllIlllIIlIIIIllIllIIll;
                "".length();
                if (null != null) {
                    return null;
                }
            }
            return String.valueOf(llllllllllllIlllIIlIIIIllIllllIl);
        }
        
        private static boolean lIIIllIIllIIllll(final Object llllllllllllIlllIIlIIIIllIIllIlI, final Object llllllllllllIlllIIlIIIIllIIllIIl) {
            return llllllllllllIlllIIlIIIIllIIllIlI == llllllllllllIlllIIlIIIIllIIllIIl;
        }
        
        private static boolean lIIIllIIllIlIIIl(final Object llllllllllllIlllIIlIIIIllIIlIlll) {
            return llllllllllllIlllIIlIIIIllIIlIlll == null;
        }
        
        private static String lIIIllIIllIIlIIl(final String llllllllllllIlllIIlIIIIlllIIllll, final String llllllllllllIlllIIlIIIIlllIIlllI) {
            try {
                final SecretKeySpec llllllllllllIlllIIlIIIIlllIlIIlI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIlllIIlIIIIlllIIlllI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
                final Cipher llllllllllllIlllIIlIIIIlllIlIIIl = Cipher.getInstance("Blowfish");
                llllllllllllIlllIIlIIIIlllIlIIIl.init(Crossing.llIIlIlIIIIIII[3], llllllllllllIlllIIlIIIIlllIlIIlI);
                return new String(llllllllllllIlllIIlIIIIlllIlIIIl.doFinal(Base64.getDecoder().decode(llllllllllllIlllIIlIIIIlllIIllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
            }
            catch (Exception llllllllllllIlllIIlIIIIlllIlIIII) {
                llllllllllllIlllIIlIIIIlllIlIIII.printStackTrace();
                return null;
            }
        }
        
        private static boolean lIIIllIIllIIlllI(final Object llllllllllllIlllIIlIIIIllIIllllI, final Object llllllllllllIlllIIlIIIIllIIlllIl) {
            return llllllllllllIlllIIlIIIIllIIllllI != llllllllllllIlllIIlIIIIllIIlllIl;
        }
        
        @Override
        protected void readStructureFromNBT(final NBTTagCompound llllllllllllIlllIIlIIIlIIIIIllIl) {
            super.readStructureFromNBT(llllllllllllIlllIIlIIIlIIIIIllIl);
            this.field_74996_b = llllllllllllIlllIIlIIIlIIIIIllIl.getBoolean(Crossing.llIIlIIlllllll[Crossing.llIIlIlIIIIIII[4]]);
            this.field_74997_c = llllllllllllIlllIIlIIIlIIIIIllIl.getBoolean(Crossing.llIIlIIlllllll[Crossing.llIIlIlIIIIIII[5]]);
            this.field_74995_d = llllllllllllIlllIIlIIIlIIIIIllIl.getBoolean(Crossing.llIIlIIlllllll[Crossing.llIIlIlIIIIIII[6]]);
            this.field_74999_h = llllllllllllIlllIIlIIIlIIIIIllIl.getBoolean(Crossing.llIIlIIlllllll[Crossing.llIIlIlIIIIIII[7]]);
        }
        
        private static boolean lIIIllIIllIlIIlI(final int llllllllllllIlllIIlIIIIllIlIIIlI, final int llllllllllllIlllIIlIIIIllIlIIIIl) {
            return llllllllllllIlllIIlIIIIllIlIIIlI < llllllllllllIlllIIlIIIIllIlIIIIl;
        }
        
        @Override
        public void buildComponent(final StructureComponent llllllllllllIlllIIlIIIIlllllllll, final List<StructureComponent> llllllllllllIlllIIlIIIlIIIIIIlII, final Random llllllllllllIlllIIlIIIlIIIIIIIll) {
            int llllllllllllIlllIIlIIIlIIIIIIIlI = Crossing.llIIlIlIIIIIII[0];
            int llllllllllllIlllIIlIIIlIIIIIIIIl = Crossing.llIIlIlIIIIIII[5];
            if (!lIIIllIIllIIlllI(this.coordBaseMode, EnumFacing.WEST) || lIIIllIIllIIllll(this.coordBaseMode, EnumFacing.NORTH)) {
                llllllllllllIlllIIlIIIlIIIIIIIlI = Crossing.llIIlIlIIIIIII[8] - llllllllllllIlllIIlIIIlIIIIIIIlI;
                llllllllllllIlllIIlIIIlIIIIIIIIl = Crossing.llIIlIlIIIIIII[8] - llllllllllllIlllIIlIIIlIIIIIIIIl;
            }
            this.getNextComponentNormal((Stairs2)llllllllllllIlllIIlIIIIlllllllll, llllllllllllIlllIIlIIIlIIIIIIlII, llllllllllllIlllIIlIIIlIIIIIIIll, Crossing.llIIlIlIIIIIII[5], Crossing.llIIlIlIIIIIII[1]);
            "".length();
            if (lIIIllIIllIlIIII(this.field_74996_b ? 1 : 0)) {
                this.getNextComponentX((Stairs2)llllllllllllIlllIIlIIIIlllllllll, llllllllllllIlllIIlIIIlIIIIIIlII, llllllllllllIlllIIlIIIlIIIIIIIll, llllllllllllIlllIIlIIIlIIIIIIIlI, Crossing.llIIlIlIIIIIII[1]);
                "".length();
            }
            if (lIIIllIIllIlIIII(this.field_74997_c ? 1 : 0)) {
                this.getNextComponentX((Stairs2)llllllllllllIlllIIlIIIIlllllllll, llllllllllllIlllIIlIIIlIIIIIIlII, llllllllllllIlllIIlIIIlIIIIIIIll, llllllllllllIlllIIlIIIlIIIIIIIIl, Crossing.llIIlIlIIIIIII[7]);
                "".length();
            }
            if (lIIIllIIllIlIIII(this.field_74995_d ? 1 : 0)) {
                this.getNextComponentZ((Stairs2)llllllllllllIlllIIlIIIIlllllllll, llllllllllllIlllIIlIIIlIIIIIIlII, llllllllllllIlllIIlIIIlIIIIIIIll, llllllllllllIlllIIlIIIlIIIIIIIlI, Crossing.llIIlIlIIIIIII[1]);
                "".length();
            }
            if (lIIIllIIllIlIIII(this.field_74999_h ? 1 : 0)) {
                this.getNextComponentZ((Stairs2)llllllllllllIlllIIlIIIIlllllllll, llllllllllllIlllIIlIIIlIIIIIIlII, llllllllllllIlllIIlIIIlIIIIIIIll, llllllllllllIlllIIlIIIlIIIIIIIIl, Crossing.llIIlIlIIIIIII[7]);
                "".length();
            }
        }
        
        private static void lIIIllIIllIIlIll() {
            (llIIlIIlllllll = new String[Crossing.llIIlIlIIIIIII[8]])[Crossing.llIIlIlIIIIIII[2]] = lIIIllIIllIIlIII("LhACPgstAg==", "BudJG");
            Crossing.llIIlIIlllllll[Crossing.llIIlIlIIIIIII[1]] = lIIIllIIllIIlIIl("XauhnraEdmF1J6sZwd96gg==", "LVSNL");
            Crossing.llIIlIIlllllll[Crossing.llIIlIlIIIIIII[3]] = lIIIllIIllIIlIlI("3x2wFatYrQWktM6xPIfycg==", "NvRgL");
            Crossing.llIIlIIlllllll[Crossing.llIIlIlIIIIIII[0]] = lIIIllIIllIIlIIl("bmPGpykpZgxDcC5Uq9I7yA==", "DcMcB");
            Crossing.llIIlIIlllllll[Crossing.llIIlIlIIIIIII[4]] = lIIIllIIllIIlIII("JicFMTQlNQ==", "JBcEx");
            Crossing.llIIlIIlllllll[Crossing.llIIlIlIIIIIII[5]] = lIIIllIIllIIlIIl("WkkegiuJ8XMv516V+StXEg==", "ISEGF");
            Crossing.llIIlIIlllllll[Crossing.llIIlIlIIIIIII[6]] = lIIIllIIllIIlIlI("c9rAG+mei8k07fzHNi1nag==", "rnziB");
            Crossing.llIIlIIlllllll[Crossing.llIIlIlIIIIIII[7]] = lIIIllIIllIIlIIl("ItaRxPyEEcAMP24058poNQ==", "iyZDn");
        }
        
        public static Crossing func_175866_a(final List<StructureComponent> llllllllllllIlllIIlIIIIllllIlIlI, final Random llllllllllllIlllIIlIIIIllllIlIIl, final int llllllllllllIlllIIlIIIIllllIlIII, final int llllllllllllIlllIIlIIIIllllIIlll, final int llllllllllllIlllIIlIIIIllllIlllI, final EnumFacing llllllllllllIlllIIlIIIIllllIIlIl, final int llllllllllllIlllIIlIIIIllllIllII) {
            final StructureBoundingBox llllllllllllIlllIIlIIIIllllIlIll = StructureBoundingBox.getComponentToAddBoundingBox(llllllllllllIlllIIlIIIIllllIlIII, llllllllllllIlllIIlIIIIllllIIlll, llllllllllllIlllIIlIIIIllllIlllI, Crossing.llIIlIlIIIIIII[9], Crossing.llIIlIlIIIIIII[10], Crossing.llIIlIlIIIIIII[2], Crossing.llIIlIlIIIIIII[11], Crossing.llIIlIlIIIIIII[12], Crossing.llIIlIlIIIIIII[13], llllllllllllIlllIIlIIIIllllIIlIl);
            Crossing crossing;
            if (lIIIllIIllIlIIII(Stronghold.canStrongholdGoDeeper(llllllllllllIlllIIlIIIIllllIlIll) ? 1 : 0) && lIIIllIIllIlIIIl(StructureComponent.findIntersecting(llllllllllllIlllIIlIIIIllllIlIlI, llllllllllllIlllIIlIIIIllllIlIll))) {
                crossing = new Crossing(llllllllllllIlllIIlIIIIllllIllII, llllllllllllIlllIIlIIIIllllIlIIl, llllllllllllIlllIIlIIIIllllIlIll, llllllllllllIlllIIlIIIIllllIIlIl);
                "".length();
                if (" ".length() >= "  ".length()) {
                    return null;
                }
            }
            else {
                crossing = null;
            }
            return crossing;
        }
    }
    
    public static class ChestCorridor extends Stronghold
    {
        private /* synthetic */ boolean hasMadeChest;
        private static final /* synthetic */ List<WeightedRandomChestContent> strongholdChestContents;
        private static final /* synthetic */ String[] lIIIlllIIIIllI;
        private static final /* synthetic */ int[] lIIIlllIIIIlll;
        
        private static boolean llIIIlIllIlIllI(final int lllllllllllllIIllllllIIIIllIIlII) {
            return lllllllllllllIIllllllIIIIllIIlII == 0;
        }
        
        private static String llIIIlIllIIlllI(final String lllllllllllllIIllllllIIIlIIIllll, final String lllllllllllllIIllllllIIIlIIIllII) {
            try {
                final SecretKeySpec lllllllllllllIIllllllIIIlIIlIIlI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIIllllllIIIlIIIllII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
                final Cipher lllllllllllllIIllllllIIIlIIlIIIl = Cipher.getInstance("Blowfish");
                lllllllllllllIIllllllIIIlIIlIIIl.init(ChestCorridor.lIIIlllIIIIlll[5], lllllllllllllIIllllllIIIlIIlIIlI);
                return new String(lllllllllllllIIllllllIIIlIIlIIIl.doFinal(Base64.getDecoder().decode(lllllllllllllIIllllllIIIlIIIllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
            }
            catch (Exception lllllllllllllIIllllllIIIlIIlIIII) {
                lllllllllllllIIllllllIIIlIIlIIII.printStackTrace();
                return null;
            }
        }
        
        public static ChestCorridor func_175868_a(final List<StructureComponent> lllllllllllllIIllllllIIIlIllIlIl, final Random lllllllllllllIIllllllIIIlIllIlII, final int lllllllllllllIIllllllIIIlIllIIll, final int lllllllllllllIIllllllIIIlIlIlIlI, final int lllllllllllllIIllllllIIIlIlIlIIl, final EnumFacing lllllllllllllIIllllllIIIlIllIIII, final int lllllllllllllIIllllllIIIlIlIllll) {
            final StructureBoundingBox lllllllllllllIIllllllIIIlIlIlllI = StructureBoundingBox.getComponentToAddBoundingBox(lllllllllllllIIllllllIIIlIllIIll, lllllllllllllIIllllllIIIlIlIlIlI, lllllllllllllIIllllllIIIlIlIlIIl, ChestCorridor.lIIIlllIIIIlll[19], ChestCorridor.lIIIlllIIIIlll[19], ChestCorridor.lIIIlllIIIIlll[1], ChestCorridor.lIIIlllIIIIlll[6], ChestCorridor.lIIIlllIIIIlll[6], ChestCorridor.lIIIlllIIIIlll[11], lllllllllllllIIllllllIIIlIllIIII);
            ChestCorridor chestCorridor;
            if (llIIIlIllIlIIll(Stronghold.canStrongholdGoDeeper(lllllllllllllIIllllllIIIlIlIlllI) ? 1 : 0) && llIIIlIllIlIlII(StructureComponent.findIntersecting(lllllllllllllIIllllllIIIlIllIlIl, lllllllllllllIIllllllIIIlIlIlllI))) {
                chestCorridor = new ChestCorridor(lllllllllllllIIllllllIIIlIlIllll, lllllllllllllIIllllllIIIlIllIlII, lllllllllllllIIllllllIIIlIlIlllI, lllllllllllllIIllllllIIIlIllIIII);
                "".length();
                if (-" ".length() >= ((0x95 ^ 0xA0 ^ (0x60 ^ 0x65)) & (0x77 ^ 0x5E ^ (0x1C ^ 0x5) ^ -" ".length()))) {
                    return null;
                }
            }
            else {
                chestCorridor = null;
            }
            return chestCorridor;
        }
        
        @Override
        public void buildComponent(final StructureComponent lllllllllllllIIllllllIIIllIIIlII, final List<StructureComponent> lllllllllllllIIllllllIIIlIllllll, final Random lllllllllllllIIllllllIIIlIlllllI) {
            this.getNextComponentNormal((Stairs2)lllllllllllllIIllllllIIIllIIIlII, lllllllllllllIIllllllIIIlIllllll, lllllllllllllIIllllllIIIlIlllllI, ChestCorridor.lIIIlllIIIIlll[2], ChestCorridor.lIIIlllIIIIlll[2]);
            "".length();
        }
        
        @Override
        protected void writeStructureToNBT(final NBTTagCompound lllllllllllllIIllllllIIIllIlIIlI) {
            super.writeStructureToNBT(lllllllllllllIIllllllIIIllIlIIlI);
            lllllllllllllIIllllllIIIllIlIIlI.setBoolean(ChestCorridor.lIIIlllIIIIllI[ChestCorridor.lIIIlllIIIIlll[1]], this.hasMadeChest);
        }
        
        @Override
        public boolean addComponentParts(final World lllllllllllllIIllllllIIIlIIllIlI, final Random lllllllllllllIIllllllIIIlIIllIIl, final StructureBoundingBox lllllllllllllIIllllllIIIlIIlllIl) {
            if (llIIIlIllIlIIll(this.isLiquidInStructureBoundingBox(lllllllllllllIIllllllIIIlIIllIlI, lllllllllllllIIllllllIIIlIIlllIl) ? 1 : 0)) {
                return ChestCorridor.lIIIlllIIIIlll[1] != 0;
            }
            this.fillWithRandomizedBlocks(lllllllllllllIIllllllIIIlIIllIlI, lllllllllllllIIllllllIIIlIIlllIl, ChestCorridor.lIIIlllIIIIlll[1], ChestCorridor.lIIIlllIIIIlll[1], ChestCorridor.lIIIlllIIIIlll[1], ChestCorridor.lIIIlllIIIIlll[7], ChestCorridor.lIIIlllIIIIlll[7], ChestCorridor.lIIIlllIIIIlll[10], (boolean)(ChestCorridor.lIIIlllIIIIlll[2] != 0), lllllllllllllIIllllllIIIlIIllIIl, StructureStrongholdPieces.strongholdStones);
            this.placeDoor(lllllllllllllIIllllllIIIlIIllIlI, lllllllllllllIIllllllIIIlIIllIIl, lllllllllllllIIllllllIIIlIIlllIl, this.field_143013_d, ChestCorridor.lIIIlllIIIIlll[2], ChestCorridor.lIIIlllIIIIlll[2], ChestCorridor.lIIIlllIIIIlll[1]);
            this.placeDoor(lllllllllllllIIllllllIIIlIIllIlI, lllllllllllllIIllllllIIIlIIllIIl, lllllllllllllIIllllllIIIlIIlllIl, Door.OPENING, ChestCorridor.lIIIlllIIIIlll[2], ChestCorridor.lIIIlllIIIIlll[2], ChestCorridor.lIIIlllIIIIlll[10]);
            this.fillWithBlocks(lllllllllllllIIllllllIIIlIIllIlI, lllllllllllllIIllllllIIIlIIlllIl, ChestCorridor.lIIIlllIIIIlll[4], ChestCorridor.lIIIlllIIIIlll[2], ChestCorridor.lIIIlllIIIIlll[5], ChestCorridor.lIIIlllIIIIlll[4], ChestCorridor.lIIIlllIIIIlll[2], ChestCorridor.lIIIlllIIIIlll[7], Blocks.stonebrick.getDefaultState(), Blocks.stonebrick.getDefaultState(), (boolean)(ChestCorridor.lIIIlllIIIIlll[1] != 0));
            this.setBlockState(lllllllllllllIIllllllIIIlIIllIlI, Blocks.stone_slab.getStateFromMeta(BlockStoneSlab.EnumType.SMOOTHBRICK.getMetadata()), ChestCorridor.lIIIlllIIIIlll[4], ChestCorridor.lIIIlllIIIIlll[2], ChestCorridor.lIIIlllIIIIlll[2], lllllllllllllIIllllllIIIlIIlllIl);
            this.setBlockState(lllllllllllllIIllllllIIIlIIllIlI, Blocks.stone_slab.getStateFromMeta(BlockStoneSlab.EnumType.SMOOTHBRICK.getMetadata()), ChestCorridor.lIIIlllIIIIlll[4], ChestCorridor.lIIIlllIIIIlll[2], ChestCorridor.lIIIlllIIIIlll[6], lllllllllllllIIllllllIIIlIIlllIl);
            this.setBlockState(lllllllllllllIIllllllIIIlIIllIlI, Blocks.stone_slab.getStateFromMeta(BlockStoneSlab.EnumType.SMOOTHBRICK.getMetadata()), ChestCorridor.lIIIlllIIIIlll[4], ChestCorridor.lIIIlllIIIIlll[5], ChestCorridor.lIIIlllIIIIlll[5], lllllllllllllIIllllllIIIlIIlllIl);
            this.setBlockState(lllllllllllllIIllllllIIIlIIllIlI, Blocks.stone_slab.getStateFromMeta(BlockStoneSlab.EnumType.SMOOTHBRICK.getMetadata()), ChestCorridor.lIIIlllIIIIlll[4], ChestCorridor.lIIIlllIIIIlll[5], ChestCorridor.lIIIlllIIIIlll[7], lllllllllllllIIllllllIIIlIIlllIl);
            int lllllllllllllIIllllllIIIlIIlllII = ChestCorridor.lIIIlllIIIIlll[5];
            "".length();
            if (((0x5C ^ 0x7 ^ (0xCB ^ 0xC1)) & (0x2F ^ 0x17 ^ (0x74 ^ 0x1D) ^ -" ".length())) != ((228 + 2 - 127 + 135 ^ 52 + 24 + 80 + 43) & (0x2 ^ 0x6 ^ (0xB5 ^ 0x98) ^ -" ".length()))) {
                return ((112 + 127 - 164 + 119 ^ 125 + 149 - 182 + 66) & (0xAD ^ 0xB1 ^ (0xD4 ^ 0x94) ^ -" ".length())) != 0x0;
            }
            while (!llIIIlIllIlIlIl(lllllllllllllIIllllllIIIlIIlllII, ChestCorridor.lIIIlllIIIIlll[7])) {
                this.setBlockState(lllllllllllllIIllllllIIIlIIllIlI, Blocks.stone_slab.getStateFromMeta(BlockStoneSlab.EnumType.SMOOTHBRICK.getMetadata()), ChestCorridor.lIIIlllIIIIlll[5], ChestCorridor.lIIIlllIIIIlll[2], lllllllllllllIIllllllIIIlIIlllII, lllllllllllllIIllllllIIIlIIlllIl);
                ++lllllllllllllIIllllllIIIlIIlllII;
            }
            if (llIIIlIllIlIllI(this.hasMadeChest ? 1 : 0) && llIIIlIllIlIIll(lllllllllllllIIllllllIIIlIIlllIl.isVecInside(new BlockPos(this.getXWithOffset(ChestCorridor.lIIIlllIIIIlll[4], ChestCorridor.lIIIlllIIIIlll[4]), this.getYWithOffset(ChestCorridor.lIIIlllIIIIlll[5]), this.getZWithOffset(ChestCorridor.lIIIlllIIIIlll[4], ChestCorridor.lIIIlllIIIIlll[4]))) ? 1 : 0)) {
                this.hasMadeChest = (ChestCorridor.lIIIlllIIIIlll[2] != 0);
                final int llllllllllllIllIlIlllIlllIIIIIIl = ChestCorridor.lIIIlllIIIIlll[4];
                final int llllllllllllIllIlIlllIllIlllIlII = ChestCorridor.lIIIlllIIIIlll[5];
                final int llllllllllllIllIlIlllIllIlllllll = ChestCorridor.lIIIlllIIIIlll[4];
                final List<WeightedRandomChestContent> strongholdChestContents = ChestCorridor.strongholdChestContents;
                final WeightedRandomChestContent[] llllllllllllIlIlllIIlllIllIIIlIl = new WeightedRandomChestContent[ChestCorridor.lIIIlllIIIIlll[2]];
                llllllllllllIlIlllIIlllIllIIIlIl[ChestCorridor.lIIIlllIIIIlll[1]] = Items.enchanted_book.getRandom(lllllllllllllIIllllllIIIlIIllIIl);
                this.generateChestContents(lllllllllllllIIllllllIIIlIIllIlI, lllllllllllllIIllllllIIIlIIlllIl, lllllllllllllIIllllllIIIlIIllIIl, llllllllllllIllIlIlllIlllIIIIIIl, llllllllllllIllIlIlllIllIlllIlII, llllllllllllIllIlIlllIllIlllllll, WeightedRandomChestContent.func_177629_a(strongholdChestContents, llllllllllllIlIlllIIlllIllIIIlIl), ChestCorridor.lIIIlllIIIIlll[5] + lllllllllllllIIllllllIIIlIIllIIl.nextInt(ChestCorridor.lIIIlllIIIIlll[5]));
                "".length();
            }
            return ChestCorridor.lIIIlllIIIIlll[2] != 0;
        }
        
        static {
            llIIIlIllIlIIlI();
            llIIIlIllIlIIIl();
            final WeightedRandomChestContent[] array = new WeightedRandomChestContent[ChestCorridor.lIIIlllIIIIlll[0]];
            array[ChestCorridor.lIIIlllIIIIlll[1]] = new WeightedRandomChestContent(Items.ender_pearl, ChestCorridor.lIIIlllIIIIlll[1], ChestCorridor.lIIIlllIIIIlll[2], ChestCorridor.lIIIlllIIIIlll[2], ChestCorridor.lIIIlllIIIIlll[3]);
            array[ChestCorridor.lIIIlllIIIIlll[2]] = new WeightedRandomChestContent(Items.diamond, ChestCorridor.lIIIlllIIIIlll[1], ChestCorridor.lIIIlllIIIIlll[2], ChestCorridor.lIIIlllIIIIlll[4], ChestCorridor.lIIIlllIIIIlll[4]);
            array[ChestCorridor.lIIIlllIIIIlll[5]] = new WeightedRandomChestContent(Items.iron_ingot, ChestCorridor.lIIIlllIIIIlll[1], ChestCorridor.lIIIlllIIIIlll[2], ChestCorridor.lIIIlllIIIIlll[6], ChestCorridor.lIIIlllIIIIlll[3]);
            array[ChestCorridor.lIIIlllIIIIlll[4]] = new WeightedRandomChestContent(Items.gold_ingot, ChestCorridor.lIIIlllIIIIlll[1], ChestCorridor.lIIIlllIIIIlll[2], ChestCorridor.lIIIlllIIIIlll[4], ChestCorridor.lIIIlllIIIIlll[6]);
            array[ChestCorridor.lIIIlllIIIIlll[7]] = new WeightedRandomChestContent(Items.redstone, ChestCorridor.lIIIlllIIIIlll[1], ChestCorridor.lIIIlllIIIIlll[7], ChestCorridor.lIIIlllIIIIlll[8], ChestCorridor.lIIIlllIIIIlll[6]);
            array[ChestCorridor.lIIIlllIIIIlll[6]] = new WeightedRandomChestContent(Items.bread, ChestCorridor.lIIIlllIIIIlll[1], ChestCorridor.lIIIlllIIIIlll[2], ChestCorridor.lIIIlllIIIIlll[4], ChestCorridor.lIIIlllIIIIlll[9]);
            array[ChestCorridor.lIIIlllIIIIlll[10]] = new WeightedRandomChestContent(Items.apple, ChestCorridor.lIIIlllIIIIlll[1], ChestCorridor.lIIIlllIIIIlll[2], ChestCorridor.lIIIlllIIIIlll[4], ChestCorridor.lIIIlllIIIIlll[9]);
            array[ChestCorridor.lIIIlllIIIIlll[11]] = new WeightedRandomChestContent(Items.iron_pickaxe, ChestCorridor.lIIIlllIIIIlll[1], ChestCorridor.lIIIlllIIIIlll[2], ChestCorridor.lIIIlllIIIIlll[2], ChestCorridor.lIIIlllIIIIlll[6]);
            array[ChestCorridor.lIIIlllIIIIlll[12]] = new WeightedRandomChestContent(Items.iron_sword, ChestCorridor.lIIIlllIIIIlll[1], ChestCorridor.lIIIlllIIIIlll[2], ChestCorridor.lIIIlllIIIIlll[2], ChestCorridor.lIIIlllIIIIlll[6]);
            array[ChestCorridor.lIIIlllIIIIlll[8]] = new WeightedRandomChestContent(Items.iron_chestplate, ChestCorridor.lIIIlllIIIIlll[1], ChestCorridor.lIIIlllIIIIlll[2], ChestCorridor.lIIIlllIIIIlll[2], ChestCorridor.lIIIlllIIIIlll[6]);
            array[ChestCorridor.lIIIlllIIIIlll[3]] = new WeightedRandomChestContent(Items.iron_helmet, ChestCorridor.lIIIlllIIIIlll[1], ChestCorridor.lIIIlllIIIIlll[2], ChestCorridor.lIIIlllIIIIlll[2], ChestCorridor.lIIIlllIIIIlll[6]);
            array[ChestCorridor.lIIIlllIIIIlll[13]] = new WeightedRandomChestContent(Items.iron_leggings, ChestCorridor.lIIIlllIIIIlll[1], ChestCorridor.lIIIlllIIIIlll[2], ChestCorridor.lIIIlllIIIIlll[2], ChestCorridor.lIIIlllIIIIlll[6]);
            array[ChestCorridor.lIIIlllIIIIlll[14]] = new WeightedRandomChestContent(Items.iron_boots, ChestCorridor.lIIIlllIIIIlll[1], ChestCorridor.lIIIlllIIIIlll[2], ChestCorridor.lIIIlllIIIIlll[2], ChestCorridor.lIIIlllIIIIlll[6]);
            array[ChestCorridor.lIIIlllIIIIlll[15]] = new WeightedRandomChestContent(Items.golden_apple, ChestCorridor.lIIIlllIIIIlll[1], ChestCorridor.lIIIlllIIIIlll[2], ChestCorridor.lIIIlllIIIIlll[2], ChestCorridor.lIIIlllIIIIlll[2]);
            array[ChestCorridor.lIIIlllIIIIlll[16]] = new WeightedRandomChestContent(Items.saddle, ChestCorridor.lIIIlllIIIIlll[1], ChestCorridor.lIIIlllIIIIlll[2], ChestCorridor.lIIIlllIIIIlll[2], ChestCorridor.lIIIlllIIIIlll[2]);
            array[ChestCorridor.lIIIlllIIIIlll[9]] = new WeightedRandomChestContent(Items.iron_horse_armor, ChestCorridor.lIIIlllIIIIlll[1], ChestCorridor.lIIIlllIIIIlll[2], ChestCorridor.lIIIlllIIIIlll[2], ChestCorridor.lIIIlllIIIIlll[2]);
            array[ChestCorridor.lIIIlllIIIIlll[17]] = new WeightedRandomChestContent(Items.golden_horse_armor, ChestCorridor.lIIIlllIIIIlll[1], ChestCorridor.lIIIlllIIIIlll[2], ChestCorridor.lIIIlllIIIIlll[2], ChestCorridor.lIIIlllIIIIlll[2]);
            array[ChestCorridor.lIIIlllIIIIlll[18]] = new WeightedRandomChestContent(Items.diamond_horse_armor, ChestCorridor.lIIIlllIIIIlll[1], ChestCorridor.lIIIlllIIIIlll[2], ChestCorridor.lIIIlllIIIIlll[2], ChestCorridor.lIIIlllIIIIlll[2]);
            strongholdChestContents = Lists.newArrayList((Object[])array);
        }
        
        private static boolean llIIIlIllIlIlll(final int lllllllllllllIIllllllIIIIllIllll, final int lllllllllllllIIllllllIIIIllIlllI) {
            return lllllllllllllIIllllllIIIIllIllll < lllllllllllllIIllllllIIIIllIlllI;
        }
        
        @Override
        protected void readStructureFromNBT(final NBTTagCompound lllllllllllllIIllllllIIIllIIllII) {
            super.readStructureFromNBT(lllllllllllllIIllllllIIIllIIllII);
            this.hasMadeChest = lllllllllllllIIllllllIIIllIIllII.getBoolean(ChestCorridor.lIIIlllIIIIllI[ChestCorridor.lIIIlllIIIIlll[2]]);
        }
        
        private static void llIIIlIllIlIIIl() {
            (lIIIlllIIIIllI = new String[ChestCorridor.lIIIlllIIIIlll[5]])[ChestCorridor.lIIIlllIIIIlll[1]] = llIIIlIllIIlllI("NaonlVSRTF8=", "DbrWD");
            ChestCorridor.lIIIlllIIIIllI[ChestCorridor.lIIIlllIIIIlll[2]] = llIIIlIllIlIIII("KjwHAQY=", "iTbrr");
        }
        
        private static void llIIIlIllIlIIlI() {
            (lIIIlllIIIIlll = new int[20])[0] = (0x94 ^ 0x86);
            ChestCorridor.lIIIlllIIIIlll[1] = ((0x8E ^ 0xA0) & ~(0x94 ^ 0xBA));
            ChestCorridor.lIIIlllIIIIlll[2] = " ".length();
            ChestCorridor.lIIIlllIIIIlll[3] = (0xAD ^ 0xA7);
            ChestCorridor.lIIIlllIIIIlll[4] = "   ".length();
            ChestCorridor.lIIIlllIIIIlll[5] = "  ".length();
            ChestCorridor.lIIIlllIIIIlll[6] = (0xB8 ^ 0xBD);
            ChestCorridor.lIIIlllIIIIlll[7] = (175 + 35 - 126 + 105 ^ 179 + 117 - 235 + 124);
            ChestCorridor.lIIIlllIIIIlll[8] = (0xCC ^ 0xC5);
            ChestCorridor.lIIIlllIIIIlll[9] = (0xAC ^ 0xA3);
            ChestCorridor.lIIIlllIIIIlll[10] = (0x8F ^ 0x89);
            ChestCorridor.lIIIlllIIIIlll[11] = (0x53 ^ 0x3F ^ (0xF1 ^ 0x9A));
            ChestCorridor.lIIIlllIIIIlll[12] = (0x6E ^ 0x66);
            ChestCorridor.lIIIlllIIIIlll[13] = (0xA6 ^ 0xAD);
            ChestCorridor.lIIIlllIIIIlll[14] = (0x1C ^ 0x73 ^ (0xC2 ^ 0xA1));
            ChestCorridor.lIIIlllIIIIlll[15] = (0xBA ^ 0xB7);
            ChestCorridor.lIIIlllIIIIlll[16] = (0xB9 ^ 0xB7);
            ChestCorridor.lIIIlllIIIIlll[17] = (0x3E ^ 0x2E);
            ChestCorridor.lIIIlllIIIIlll[18] = (0x27 ^ 0x68 ^ (0xD0 ^ 0x8E));
            ChestCorridor.lIIIlllIIIIlll[19] = -" ".length();
        }
        
        public ChestCorridor() {
        }
        
        public ChestCorridor(final int lllllllllllllIIllllllIIIllIllllI, final Random lllllllllllllIIllllllIIIllIllIII, final StructureBoundingBox lllllllllllllIIllllllIIIllIlllII, final EnumFacing lllllllllllllIIllllllIIIllIllIll) {
            super(lllllllllllllIIllllllIIIllIllllI);
            this.coordBaseMode = lllllllllllllIIllllllIIIllIllIll;
            this.field_143013_d = this.getRandomDoor(lllllllllllllIIllllllIIIllIllIII);
            this.boundingBox = lllllllllllllIIllllllIIIllIlllII;
        }
        
        private static boolean llIIIlIllIlIlIl(final int lllllllllllllIIllllllIIIIllIlIll, final int lllllllllllllIIllllllIIIIllIlIlI) {
            return lllllllllllllIIllllllIIIIllIlIll > lllllllllllllIIllllllIIIIllIlIlI;
        }
        
        private static boolean llIIIlIllIlIIll(final int lllllllllllllIIllllllIIIIllIIllI) {
            return lllllllllllllIIllllllIIIIllIIllI != 0;
        }
        
        private static String llIIIlIllIlIIII(String lllllllllllllIIllllllIIIIllllIlI, final String lllllllllllllIIllllllIIIIllllIIl) {
            lllllllllllllIIllllllIIIIllllIlI = (double)new String(Base64.getDecoder().decode(((String)lllllllllllllIIllllllIIIIllllIlI).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
            final StringBuilder lllllllllllllIIllllllIIIIlllllIl = new StringBuilder();
            final char[] lllllllllllllIIllllllIIIIlllllII = lllllllllllllIIllllllIIIIllllIIl.toCharArray();
            int lllllllllllllIIllllllIIIIllllIll = ChestCorridor.lIIIlllIIIIlll[1];
            final String lllllllllllllIIllllllIIIIlllIlIl = (Object)((String)lllllllllllllIIllllllIIIIllllIlI).toCharArray();
            final String lllllllllllllIIllllllIIIIlllIlII = (String)lllllllllllllIIllllllIIIIlllIlIl.length;
            short lllllllllllllIIllllllIIIIlllIIll = (short)ChestCorridor.lIIIlllIIIIlll[1];
            while (llIIIlIllIlIlll(lllllllllllllIIllllllIIIIlllIIll, (int)lllllllllllllIIllllllIIIIlllIlII)) {
                final char lllllllllllllIIllllllIIIlIIIIIII = lllllllllllllIIllllllIIIIlllIlIl[lllllllllllllIIllllllIIIIlllIIll];
                lllllllllllllIIllllllIIIIlllllIl.append((char)(lllllllllllllIIllllllIIIlIIIIIII ^ lllllllllllllIIllllllIIIIlllllII[lllllllllllllIIllllllIIIIllllIll % lllllllllllllIIllllllIIIIlllllII.length]));
                "".length();
                ++lllllllllllllIIllllllIIIIllllIll;
                ++lllllllllllllIIllllllIIIIlllIIll;
                "".length();
                if (" ".length() >= "   ".length()) {
                    return null;
                }
            }
            return String.valueOf(lllllllllllllIIllllllIIIIlllllIl);
        }
        
        private static boolean llIIIlIllIlIlII(final Object lllllllllllllIIllllllIIIIllIlIII) {
            return lllllllllllllIIllllllIIIIllIlIII == null;
        }
    }
    
    public static class Straight extends Stronghold
    {
        private static final /* synthetic */ String[] lIIllllIIlIlll;
        private static final /* synthetic */ int[] lIIllllIIllIll;
        private /* synthetic */ boolean expandsX;
        private /* synthetic */ boolean expandsZ;
        
        private static void llIlllIllIlIlIl() {
            (lIIllllIIlIlll = new String[Straight.lIIllllIIllIll[7]])[Straight.lIIllllIIllIll[2]] = llIlllIllIlIIlI("SkoAruHrnv8=", "nJdwQ");
            Straight.lIIllllIIlIlll[Straight.lIIllllIIllIll[1]] = llIlllIllIlIIll("5M7FFPU7bCI=", "egOxd");
            Straight.lIIllllIIlIlll[Straight.lIIllllIIllIll[0]] = llIlllIllIlIIlI("xMqlzaTu3hs=", "vsJbl");
            Straight.lIIllllIIlIlll[Straight.lIIllllIIllIll[3]] = llIlllIllIlIIll("ZpIfzv5J/JU=", "ambUP");
        }
        
        public Straight() {
        }
        
        private static boolean llIlllIllIllIll(final Object lllllllllllllIIlIIlIllIIIllIIIII) {
            return lllllllllllllIIlIIlIllIIIllIIIII == null;
        }
        
        private static void llIlllIllIllIII() {
            (lIIllllIIllIll = new int[10])[0] = "  ".length();
            Straight.lIIllllIIllIll[1] = " ".length();
            Straight.lIIllllIIllIll[2] = ((0xA0 ^ 0xB5) & ~(0x3E ^ 0x2B));
            Straight.lIIllllIIllIll[3] = "   ".length();
            Straight.lIIllllIIllIll[4] = -" ".length();
            Straight.lIIllllIIllIll[5] = ("   ".length() ^ (0x40 ^ 0x46));
            Straight.lIIllllIIllIll[6] = (0x78 ^ 0x7F);
            Straight.lIIllllIIllIll[7] = (0xFF ^ 0x86 ^ (0xBF ^ 0xC2));
            Straight.lIIllllIIllIll[8] = (0x98 ^ 0x9E);
            Straight.lIIllllIIllIll[9] = (0x42 ^ 0x4A);
        }
        
        private static String llIlllIllIlIIll(final String lllllllllllllIIlIIlIllIIIllIIlIl, final String lllllllllllllIIlIIlIllIIIllIIllI) {
            try {
                final SecretKeySpec lllllllllllllIIlIIlIllIIIllIlIlI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIIlIIlIllIIIllIIllI.getBytes(StandardCharsets.UTF_8)), Straight.lIIllllIIllIll[9]), "DES");
                final Cipher lllllllllllllIIlIIlIllIIIllIlIIl = Cipher.getInstance("DES");
                lllllllllllllIIlIIlIllIIIllIlIIl.init(Straight.lIIllllIIllIll[0], lllllllllllllIIlIIlIllIIIllIlIlI);
                return new String(lllllllllllllIIlIIlIllIIIllIlIIl.doFinal(Base64.getDecoder().decode(lllllllllllllIIlIIlIllIIIllIIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
            }
            catch (Exception lllllllllllllIIlIIlIllIIIllIlIII) {
                lllllllllllllIIlIIlIllIIIllIlIII.printStackTrace();
                return null;
            }
        }
        
        @Override
        public void buildComponent(final StructureComponent lllllllllllllIIlIIlIllIIlIlIIIlI, final List<StructureComponent> lllllllllllllIIlIIlIllIIlIlIIIIl, final Random lllllllllllllIIlIIlIllIIlIlIIIII) {
            this.getNextComponentNormal((Stairs2)lllllllllllllIIlIIlIllIIlIlIIIlI, lllllllllllllIIlIIlIllIIlIlIIIIl, lllllllllllllIIlIIlIllIIlIlIIIII, Straight.lIIllllIIllIll[1], Straight.lIIllllIIllIll[1]);
            "".length();
            if (llIlllIllIllIlI(this.expandsX ? 1 : 0)) {
                this.getNextComponentX((Stairs2)lllllllllllllIIlIIlIllIIlIlIIIlI, lllllllllllllIIlIIlIllIIlIlIIIIl, lllllllllllllIIlIIlIllIIlIlIIIII, Straight.lIIllllIIllIll[1], Straight.lIIllllIIllIll[0]);
                "".length();
            }
            if (llIlllIllIllIlI(this.expandsZ ? 1 : 0)) {
                this.getNextComponentZ((Stairs2)lllllllllllllIIlIIlIllIIlIlIIIlI, lllllllllllllIIlIIlIllIIlIlIIIIl, lllllllllllllIIlIIlIllIIlIlIIIII, Straight.lIIllllIIllIll[1], Straight.lIIllllIIllIll[0]);
                "".length();
            }
        }
        
        @Override
        protected void readStructureFromNBT(final NBTTagCompound lllllllllllllIIlIIlIllIIlIlIlllI) {
            super.readStructureFromNBT(lllllllllllllIIlIIlIllIIlIlIlllI);
            this.expandsX = lllllllllllllIIlIIlIllIIlIlIlllI.getBoolean(Straight.lIIllllIIlIlll[Straight.lIIllllIIllIll[0]]);
            this.expandsZ = lllllllllllllIIlIIlIllIIlIlIlllI.getBoolean(Straight.lIIllllIIlIlll[Straight.lIIllllIIllIll[3]]);
        }
        
        private static boolean llIlllIllIllIIl(final int lllllllllllllIIlIIlIllIIIlIlllII) {
            return lllllllllllllIIlIIlIllIIIlIlllII == 0;
        }
        
        private static boolean llIlllIllIllIlI(final int lllllllllllllIIlIIlIllIIIlIllllI) {
            return lllllllllllllIIlIIlIllIIIlIllllI != 0;
        }
        
        public static Straight func_175862_a(final List<StructureComponent> lllllllllllllIIlIIlIllIIlIIlIlll, final Random lllllllllllllIIlIIlIllIIlIIIlllI, final int lllllllllllllIIlIIlIllIIlIIIllIl, final int lllllllllllllIIlIIlIllIIlIIlIlII, final int lllllllllllllIIlIIlIllIIlIIlIIll, final EnumFacing lllllllllllllIIlIIlIllIIlIIlIIlI, final int lllllllllllllIIlIIlIllIIlIIIlIIl) {
            final StructureBoundingBox lllllllllllllIIlIIlIllIIlIIlIIII = StructureBoundingBox.getComponentToAddBoundingBox(lllllllllllllIIlIIlIllIIlIIIllIl, lllllllllllllIIlIIlIllIIlIIlIlII, lllllllllllllIIlIIlIllIIlIIlIIll, Straight.lIIllllIIllIll[4], Straight.lIIllllIIllIll[4], Straight.lIIllllIIllIll[2], Straight.lIIllllIIllIll[5], Straight.lIIllllIIllIll[5], Straight.lIIllllIIllIll[6], lllllllllllllIIlIIlIllIIlIIlIIlI);
            Straight straight;
            if (llIlllIllIllIlI(Stronghold.canStrongholdGoDeeper(lllllllllllllIIlIIlIllIIlIIlIIII) ? 1 : 0) && llIlllIllIllIll(StructureComponent.findIntersecting(lllllllllllllIIlIIlIllIIlIIlIlll, lllllllllllllIIlIIlIllIIlIIlIIII))) {
                straight = new Straight(lllllllllllllIIlIIlIllIIlIIIlIIl, lllllllllllllIIlIIlIllIIlIIIlllI, lllllllllllllIIlIIlIllIIlIIlIIII, lllllllllllllIIlIIlIllIIlIIlIIlI);
                "".length();
                if (((0x59 ^ 0x33 ^ (0x7 ^ 0x75)) & (0x96 ^ 0xA4 ^ (0x94 ^ 0xBE) ^ -" ".length())) != 0x0) {
                    return null;
                }
            }
            else {
                straight = null;
            }
            return straight;
        }
        
        @Override
        public boolean addComponentParts(final World lllllllllllllIIlIIlIllIIlIIIIIlI, final Random lllllllllllllIIlIIlIllIIIlllllIl, final StructureBoundingBox lllllllllllllIIlIIlIllIIlIIIIIII) {
            if (llIlllIllIllIlI(this.isLiquidInStructureBoundingBox(lllllllllllllIIlIIlIllIIlIIIIIlI, lllllllllllllIIlIIlIllIIlIIIIIII) ? 1 : 0)) {
                return Straight.lIIllllIIllIll[2] != 0;
            }
            this.fillWithRandomizedBlocks(lllllllllllllIIlIIlIllIIlIIIIIlI, lllllllllllllIIlIIlIllIIlIIIIIII, Straight.lIIllllIIllIll[2], Straight.lIIllllIIllIll[2], Straight.lIIllllIIllIll[2], Straight.lIIllllIIllIll[7], Straight.lIIllllIIllIll[7], Straight.lIIllllIIllIll[8], (boolean)(Straight.lIIllllIIllIll[1] != 0), lllllllllllllIIlIIlIllIIIlllllIl, StructureStrongholdPieces.strongholdStones);
            this.placeDoor(lllllllllllllIIlIIlIllIIlIIIIIlI, lllllllllllllIIlIIlIllIIIlllllIl, lllllllllllllIIlIIlIllIIlIIIIIII, this.field_143013_d, Straight.lIIllllIIllIll[1], Straight.lIIllllIIllIll[1], Straight.lIIllllIIllIll[2]);
            this.placeDoor(lllllllllllllIIlIIlIllIIlIIIIIlI, lllllllllllllIIlIIlIllIIIlllllIl, lllllllllllllIIlIIlIllIIlIIIIIII, Door.OPENING, Straight.lIIllllIIllIll[1], Straight.lIIllllIIllIll[1], Straight.lIIllllIIllIll[8]);
            this.randomlyPlaceBlock(lllllllllllllIIlIIlIllIIlIIIIIlI, lllllllllllllIIlIIlIllIIlIIIIIII, lllllllllllllIIlIIlIllIIIlllllIl, 0.1f, Straight.lIIllllIIllIll[1], Straight.lIIllllIIllIll[0], Straight.lIIllllIIllIll[1], Blocks.torch.getDefaultState());
            this.randomlyPlaceBlock(lllllllllllllIIlIIlIllIIlIIIIIlI, lllllllllllllIIlIIlIllIIlIIIIIII, lllllllllllllIIlIIlIllIIIlllllIl, 0.1f, Straight.lIIllllIIllIll[3], Straight.lIIllllIIllIll[0], Straight.lIIllllIIllIll[1], Blocks.torch.getDefaultState());
            this.randomlyPlaceBlock(lllllllllllllIIlIIlIllIIlIIIIIlI, lllllllllllllIIlIIlIllIIlIIIIIII, lllllllllllllIIlIIlIllIIIlllllIl, 0.1f, Straight.lIIllllIIllIll[1], Straight.lIIllllIIllIll[0], Straight.lIIllllIIllIll[5], Blocks.torch.getDefaultState());
            this.randomlyPlaceBlock(lllllllllllllIIlIIlIllIIlIIIIIlI, lllllllllllllIIlIIlIllIIlIIIIIII, lllllllllllllIIlIIlIllIIIlllllIl, 0.1f, Straight.lIIllllIIllIll[3], Straight.lIIllllIIllIll[0], Straight.lIIllllIIllIll[5], Blocks.torch.getDefaultState());
            if (llIlllIllIllIlI(this.expandsX ? 1 : 0)) {
                this.fillWithBlocks(lllllllllllllIIlIIlIllIIlIIIIIlI, lllllllllllllIIlIIlIllIIlIIIIIII, Straight.lIIllllIIllIll[2], Straight.lIIllllIIllIll[1], Straight.lIIllllIIllIll[0], Straight.lIIllllIIllIll[2], Straight.lIIllllIIllIll[3], Straight.lIIllllIIllIll[7], Blocks.air.getDefaultState(), Blocks.air.getDefaultState(), (boolean)(Straight.lIIllllIIllIll[2] != 0));
            }
            if (llIlllIllIllIlI(this.expandsZ ? 1 : 0)) {
                this.fillWithBlocks(lllllllllllllIIlIIlIllIIlIIIIIlI, lllllllllllllIIlIIlIllIIlIIIIIII, Straight.lIIllllIIllIll[7], Straight.lIIllllIIllIll[1], Straight.lIIllllIIllIll[0], Straight.lIIllllIIllIll[7], Straight.lIIllllIIllIll[3], Straight.lIIllllIIllIll[7], Blocks.air.getDefaultState(), Blocks.air.getDefaultState(), (boolean)(Straight.lIIllllIIllIll[2] != 0));
            }
            return Straight.lIIllllIIllIll[1] != 0;
        }
        
        @Override
        protected void writeStructureToNBT(final NBTTagCompound lllllllllllllIIlIIlIllIIlIllIlII) {
            super.writeStructureToNBT(lllllllllllllIIlIIlIllIIlIllIlII);
            lllllllllllllIIlIIlIllIIlIllIlII.setBoolean(Straight.lIIllllIIlIlll[Straight.lIIllllIIllIll[2]], this.expandsX);
            lllllllllllllIIlIIlIllIIlIllIlII.setBoolean(Straight.lIIllllIIlIlll[Straight.lIIllllIIllIll[1]], this.expandsZ);
        }
        
        private static String llIlllIllIlIIlI(final String lllllllllllllIIlIIlIllIIIlllIIlI, final String lllllllllllllIIlIIlIllIIIlllIIll) {
            try {
                final SecretKeySpec lllllllllllllIIlIIlIllIIIlllIlll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIIlIIlIllIIIlllIIll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
                final Cipher lllllllllllllIIlIIlIllIIIlllIllI = Cipher.getInstance("Blowfish");
                lllllllllllllIIlIIlIllIIIlllIllI.init(Straight.lIIllllIIllIll[0], lllllllllllllIIlIIlIllIIIlllIlll);
                return new String(lllllllllllllIIlIIlIllIIIlllIllI.doFinal(Base64.getDecoder().decode(lllllllllllllIIlIIlIllIIIlllIIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
            }
            catch (Exception lllllllllllllIIlIIlIllIIIlllIlIl) {
                lllllllllllllIIlIIlIllIIIlllIlIl.printStackTrace();
                return null;
            }
        }
        
        public Straight(final int lllllllllllllIIlIIlIllIIllIIIIII, final Random lllllllllllllIIlIIlIllIIlIllllll, final StructureBoundingBox lllllllllllllIIlIIlIllIIlIlllllI, final EnumFacing lllllllllllllIIlIIlIllIIlIlllIII) {
            super(lllllllllllllIIlIIlIllIIllIIIIII);
            this.coordBaseMode = lllllllllllllIIlIIlIllIIlIlllIII;
            this.field_143013_d = this.getRandomDoor(lllllllllllllIIlIIlIllIIlIllllll);
            this.boundingBox = lllllllllllllIIlIIlIllIIlIlllllI;
            int expandsX;
            if (llIlllIllIllIIl(lllllllllllllIIlIIlIllIIlIllllll.nextInt(Straight.lIIllllIIllIll[0]))) {
                expandsX = Straight.lIIllllIIllIll[1];
                "".length();
                if (-"  ".length() >= 0) {
                    throw null;
                }
            }
            else {
                expandsX = Straight.lIIllllIIllIll[2];
            }
            this.expandsX = (expandsX != 0);
            int expandsZ;
            if (llIlllIllIllIIl(lllllllllllllIIlIIlIllIIlIllllll.nextInt(Straight.lIIllllIIllIll[0]))) {
                expandsZ = Straight.lIIllllIIllIll[1];
                "".length();
                if (" ".length() <= 0) {
                    throw null;
                }
            }
            else {
                expandsZ = Straight.lIIllllIIllIll[2];
            }
            this.expandsZ = (expandsZ != 0);
        }
        
        static {
            llIlllIllIllIII();
            llIlllIllIlIlIl();
        }
    }
    
    public static class RoomCrossing extends Stronghold
    {
        protected /* synthetic */ int roomType;
        private static final /* synthetic */ int[] llllIIIIIIllI;
        private static final /* synthetic */ List<WeightedRandomChestContent> strongholdRoomCrossingChestContents;
        private static final /* synthetic */ String[] llllIIIIIIIIl;
        
        private static void lIlIIllIlIlIlIl() {
            (llllIIIIIIllI = new int[15])[0] = (99 + 3 - 78 + 114 ^ 20 + 53 + 20 + 48);
            RoomCrossing.llllIIIIIIllI[1] = ((0x72 ^ 0x44) & ~(0x59 ^ 0x6F));
            RoomCrossing.llllIIIIIIllI[2] = " ".length();
            RoomCrossing.llllIIIIIIllI[3] = (83 + 110 - 98 + 64 ^ 29 + 88 - 48 + 85);
            RoomCrossing.llllIIIIIIllI[4] = (0xBD ^ 0xB7);
            RoomCrossing.llllIIIIIIllI[5] = "   ".length();
            RoomCrossing.llllIIIIIIllI[6] = "  ".length();
            RoomCrossing.llllIIIIIIllI[7] = (0x89 ^ 0x8D);
            RoomCrossing.llllIIIIIIllI[8] = ("  ".length() ^ (0x4E ^ 0x45));
            RoomCrossing.llllIIIIIIllI[9] = (0x2A ^ 0x22);
            RoomCrossing.llllIIIIIIllI[10] = (0xD1 ^ 0xB0 ^ (0x2F ^ 0x41));
            RoomCrossing.llllIIIIIIllI[11] = (0xA3 ^ 0xA5);
            RoomCrossing.llllIIIIIIllI[12] = -(0x9 ^ 0x60 ^ (0xF8 ^ 0x95));
            RoomCrossing.llllIIIIIIllI[13] = -" ".length();
            RoomCrossing.llllIIIIIIllI[14] = (0x78 ^ 0x73);
        }
        
        private static boolean lIlIIllIlIlIllI(final int lllllllllllllIlIlllllIIlllIIIIll) {
            return lllllllllllllIlIlllllIIlllIIIIll != 0;
        }
        
        @Override
        public boolean addComponentParts(final World lllllllllllllIlIlllllIIllllIllII, final Random lllllllllllllIlIlllllIIllllIlIll, final StructureBoundingBox lllllllllllllIlIlllllIIlllllIIll) {
            if (lIlIIllIlIlIllI(this.isLiquidInStructureBoundingBox(lllllllllllllIlIlllllIIllllIllII, lllllllllllllIlIlllllIIlllllIIll) ? 1 : 0)) {
                return RoomCrossing.llllIIIIIIllI[1] != 0;
            }
            this.fillWithRandomizedBlocks(lllllllllllllIlIlllllIIllllIllII, lllllllllllllIlIlllllIIlllllIIll, RoomCrossing.llllIIIIIIllI[1], RoomCrossing.llllIIIIIIllI[1], RoomCrossing.llllIIIIIIllI[1], RoomCrossing.llllIIIIIIllI[4], RoomCrossing.llllIIIIIIllI[11], RoomCrossing.llllIIIIIIllI[4], (boolean)(RoomCrossing.llllIIIIIIllI[2] != 0), lllllllllllllIlIlllllIIllllIlIll, StructureStrongholdPieces.strongholdStones);
            this.placeDoor(lllllllllllllIlIlllllIIllllIllII, lllllllllllllIlIlllllIIllllIlIll, lllllllllllllIlIlllllIIlllllIIll, this.field_143013_d, RoomCrossing.llllIIIIIIllI[7], RoomCrossing.llllIIIIIIllI[2], RoomCrossing.llllIIIIIIllI[1]);
            this.fillWithBlocks(lllllllllllllIlIlllllIIllllIllII, lllllllllllllIlIlllllIIlllllIIll, RoomCrossing.llllIIIIIIllI[7], RoomCrossing.llllIIIIIIllI[2], RoomCrossing.llllIIIIIIllI[4], RoomCrossing.llllIIIIIIllI[11], RoomCrossing.llllIIIIIIllI[5], RoomCrossing.llllIIIIIIllI[4], Blocks.air.getDefaultState(), Blocks.air.getDefaultState(), (boolean)(RoomCrossing.llllIIIIIIllI[1] != 0));
            this.fillWithBlocks(lllllllllllllIlIlllllIIllllIllII, lllllllllllllIlIlllllIIlllllIIll, RoomCrossing.llllIIIIIIllI[1], RoomCrossing.llllIIIIIIllI[2], RoomCrossing.llllIIIIIIllI[7], RoomCrossing.llllIIIIIIllI[1], RoomCrossing.llllIIIIIIllI[5], RoomCrossing.llllIIIIIIllI[11], Blocks.air.getDefaultState(), Blocks.air.getDefaultState(), (boolean)(RoomCrossing.llllIIIIIIllI[1] != 0));
            this.fillWithBlocks(lllllllllllllIlIlllllIIllllIllII, lllllllllllllIlIlllllIIlllllIIll, RoomCrossing.llllIIIIIIllI[4], RoomCrossing.llllIIIIIIllI[2], RoomCrossing.llllIIIIIIllI[7], RoomCrossing.llllIIIIIIllI[4], RoomCrossing.llllIIIIIIllI[5], RoomCrossing.llllIIIIIIllI[11], Blocks.air.getDefaultState(), Blocks.air.getDefaultState(), (boolean)(RoomCrossing.llllIIIIIIllI[1] != 0));
            switch (this.roomType) {
                case 0: {
                    this.setBlockState(lllllllllllllIlIlllllIIllllIllII, Blocks.stonebrick.getDefaultState(), RoomCrossing.llllIIIIIIllI[3], RoomCrossing.llllIIIIIIllI[2], RoomCrossing.llllIIIIIIllI[3], lllllllllllllIlIlllllIIlllllIIll);
                    this.setBlockState(lllllllllllllIlIlllllIIllllIllII, Blocks.stonebrick.getDefaultState(), RoomCrossing.llllIIIIIIllI[3], RoomCrossing.llllIIIIIIllI[6], RoomCrossing.llllIIIIIIllI[3], lllllllllllllIlIlllllIIlllllIIll);
                    this.setBlockState(lllllllllllllIlIlllllIIllllIllII, Blocks.stonebrick.getDefaultState(), RoomCrossing.llllIIIIIIllI[3], RoomCrossing.llllIIIIIIllI[5], RoomCrossing.llllIIIIIIllI[3], lllllllllllllIlIlllllIIlllllIIll);
                    this.setBlockState(lllllllllllllIlIlllllIIllllIllII, Blocks.torch.getDefaultState(), RoomCrossing.llllIIIIIIllI[7], RoomCrossing.llllIIIIIIllI[5], RoomCrossing.llllIIIIIIllI[3], lllllllllllllIlIlllllIIlllllIIll);
                    this.setBlockState(lllllllllllllIlIlllllIIllllIllII, Blocks.torch.getDefaultState(), RoomCrossing.llllIIIIIIllI[11], RoomCrossing.llllIIIIIIllI[5], RoomCrossing.llllIIIIIIllI[3], lllllllllllllIlIlllllIIlllllIIll);
                    this.setBlockState(lllllllllllllIlIlllllIIllllIllII, Blocks.torch.getDefaultState(), RoomCrossing.llllIIIIIIllI[3], RoomCrossing.llllIIIIIIllI[5], RoomCrossing.llllIIIIIIllI[7], lllllllllllllIlIlllllIIlllllIIll);
                    this.setBlockState(lllllllllllllIlIlllllIIllllIllII, Blocks.torch.getDefaultState(), RoomCrossing.llllIIIIIIllI[3], RoomCrossing.llllIIIIIIllI[5], RoomCrossing.llllIIIIIIllI[11], lllllllllllllIlIlllllIIlllllIIll);
                    this.setBlockState(lllllllllllllIlIlllllIIllllIllII, Blocks.stone_slab.getDefaultState(), RoomCrossing.llllIIIIIIllI[7], RoomCrossing.llllIIIIIIllI[2], RoomCrossing.llllIIIIIIllI[7], lllllllllllllIlIlllllIIlllllIIll);
                    this.setBlockState(lllllllllllllIlIlllllIIllllIllII, Blocks.stone_slab.getDefaultState(), RoomCrossing.llllIIIIIIllI[7], RoomCrossing.llllIIIIIIllI[2], RoomCrossing.llllIIIIIIllI[3], lllllllllllllIlIlllllIIlllllIIll);
                    this.setBlockState(lllllllllllllIlIlllllIIllllIllII, Blocks.stone_slab.getDefaultState(), RoomCrossing.llllIIIIIIllI[7], RoomCrossing.llllIIIIIIllI[2], RoomCrossing.llllIIIIIIllI[11], lllllllllllllIlIlllllIIlllllIIll);
                    this.setBlockState(lllllllllllllIlIlllllIIllllIllII, Blocks.stone_slab.getDefaultState(), RoomCrossing.llllIIIIIIllI[11], RoomCrossing.llllIIIIIIllI[2], RoomCrossing.llllIIIIIIllI[7], lllllllllllllIlIlllllIIlllllIIll);
                    this.setBlockState(lllllllllllllIlIlllllIIllllIllII, Blocks.stone_slab.getDefaultState(), RoomCrossing.llllIIIIIIllI[11], RoomCrossing.llllIIIIIIllI[2], RoomCrossing.llllIIIIIIllI[3], lllllllllllllIlIlllllIIlllllIIll);
                    this.setBlockState(lllllllllllllIlIlllllIIllllIllII, Blocks.stone_slab.getDefaultState(), RoomCrossing.llllIIIIIIllI[11], RoomCrossing.llllIIIIIIllI[2], RoomCrossing.llllIIIIIIllI[11], lllllllllllllIlIlllllIIlllllIIll);
                    this.setBlockState(lllllllllllllIlIlllllIIllllIllII, Blocks.stone_slab.getDefaultState(), RoomCrossing.llllIIIIIIllI[3], RoomCrossing.llllIIIIIIllI[2], RoomCrossing.llllIIIIIIllI[7], lllllllllllllIlIlllllIIlllllIIll);
                    this.setBlockState(lllllllllllllIlIlllllIIllllIllII, Blocks.stone_slab.getDefaultState(), RoomCrossing.llllIIIIIIllI[3], RoomCrossing.llllIIIIIIllI[2], RoomCrossing.llllIIIIIIllI[11], lllllllllllllIlIlllllIIlllllIIll);
                    "".length();
                    if (null != null) {
                        return ((0x65 ^ 0x12 ^ (0x2B ^ 0x61)) & (0xA6 ^ 0x80 ^ (0x44 ^ 0x5F) ^ -" ".length())) != 0x0;
                    }
                    break;
                }
                case 1: {
                    int lllllllllllllIlIlllllIIlllllIIlI = RoomCrossing.llllIIIIIIllI[1];
                    "".length();
                    if (-" ".length() >= 0) {
                        return ((0x4D ^ 0x65) & ~(0x28 ^ 0x0)) != 0x0;
                    }
                    while (!lIlIIllIlIllIII(lllllllllllllIlIlllllIIlllllIIlI, RoomCrossing.llllIIIIIIllI[3])) {
                        this.setBlockState(lllllllllllllIlIlllllIIllllIllII, Blocks.stonebrick.getDefaultState(), RoomCrossing.llllIIIIIIllI[5], RoomCrossing.llllIIIIIIllI[2], RoomCrossing.llllIIIIIIllI[5] + lllllllllllllIlIlllllIIlllllIIlI, lllllllllllllIlIlllllIIlllllIIll);
                        this.setBlockState(lllllllllllllIlIlllllIIllllIllII, Blocks.stonebrick.getDefaultState(), RoomCrossing.llllIIIIIIllI[0], RoomCrossing.llllIIIIIIllI[2], RoomCrossing.llllIIIIIIllI[5] + lllllllllllllIlIlllllIIlllllIIlI, lllllllllllllIlIlllllIIlllllIIll);
                        this.setBlockState(lllllllllllllIlIlllllIIllllIllII, Blocks.stonebrick.getDefaultState(), RoomCrossing.llllIIIIIIllI[5] + lllllllllllllIlIlllllIIlllllIIlI, RoomCrossing.llllIIIIIIllI[2], RoomCrossing.llllIIIIIIllI[5], lllllllllllllIlIlllllIIlllllIIll);
                        this.setBlockState(lllllllllllllIlIlllllIIllllIllII, Blocks.stonebrick.getDefaultState(), RoomCrossing.llllIIIIIIllI[5] + lllllllllllllIlIlllllIIlllllIIlI, RoomCrossing.llllIIIIIIllI[2], RoomCrossing.llllIIIIIIllI[0], lllllllllllllIlIlllllIIlllllIIll);
                        ++lllllllllllllIlIlllllIIlllllIIlI;
                    }
                    this.setBlockState(lllllllllllllIlIlllllIIllllIllII, Blocks.stonebrick.getDefaultState(), RoomCrossing.llllIIIIIIllI[3], RoomCrossing.llllIIIIIIllI[2], RoomCrossing.llllIIIIIIllI[3], lllllllllllllIlIlllllIIlllllIIll);
                    this.setBlockState(lllllllllllllIlIlllllIIllllIllII, Blocks.stonebrick.getDefaultState(), RoomCrossing.llllIIIIIIllI[3], RoomCrossing.llllIIIIIIllI[6], RoomCrossing.llllIIIIIIllI[3], lllllllllllllIlIlllllIIlllllIIll);
                    this.setBlockState(lllllllllllllIlIlllllIIllllIllII, Blocks.stonebrick.getDefaultState(), RoomCrossing.llllIIIIIIllI[3], RoomCrossing.llllIIIIIIllI[5], RoomCrossing.llllIIIIIIllI[3], lllllllllllllIlIlllllIIlllllIIll);
                    this.setBlockState(lllllllllllllIlIlllllIIllllIllII, Blocks.flowing_water.getDefaultState(), RoomCrossing.llllIIIIIIllI[3], RoomCrossing.llllIIIIIIllI[7], RoomCrossing.llllIIIIIIllI[3], lllllllllllllIlIlllllIIlllllIIll);
                    "".length();
                    if ("   ".length() < 0) {
                        return ((0x34 ^ 0x3 ^ (0xA8 ^ 0xB8)) & (0x51 ^ 0x3F ^ (0xC4 ^ 0x8D) ^ -" ".length())) != 0x0;
                    }
                    break;
                }
                case 2: {
                    int lllllllllllllIlIlllllIIlllllIIIl = RoomCrossing.llllIIIIIIllI[2];
                    "".length();
                    if ((0x25 ^ 0x71 ^ (0x90 ^ 0xC0)) == "   ".length()) {
                        return ("   ".length() & ("   ".length() ^ -" ".length())) != 0x0;
                    }
                    while (!lIlIIllIlIlllII(lllllllllllllIlIlllllIIlllllIIIl, RoomCrossing.llllIIIIIIllI[8])) {
                        this.setBlockState(lllllllllllllIlIlllllIIllllIllII, Blocks.cobblestone.getDefaultState(), RoomCrossing.llllIIIIIIllI[2], RoomCrossing.llllIIIIIIllI[5], lllllllllllllIlIlllllIIlllllIIIl, lllllllllllllIlIlllllIIlllllIIll);
                        this.setBlockState(lllllllllllllIlIlllllIIllllIllII, Blocks.cobblestone.getDefaultState(), RoomCrossing.llllIIIIIIllI[8], RoomCrossing.llllIIIIIIllI[5], lllllllllllllIlIlllllIIlllllIIIl, lllllllllllllIlIlllllIIlllllIIll);
                        ++lllllllllllllIlIlllllIIlllllIIIl;
                    }
                    int lllllllllllllIlIlllllIIlllllIIII = RoomCrossing.llllIIIIIIllI[2];
                    "".length();
                    if ("  ".length() >= "   ".length()) {
                        return ((0xFC ^ 0xC7) & ~(0x0 ^ 0x3B)) != 0x0;
                    }
                    while (!lIlIIllIlIlllII(lllllllllllllIlIlllllIIlllllIIII, RoomCrossing.llllIIIIIIllI[8])) {
                        this.setBlockState(lllllllllllllIlIlllllIIllllIllII, Blocks.cobblestone.getDefaultState(), lllllllllllllIlIlllllIIlllllIIII, RoomCrossing.llllIIIIIIllI[5], RoomCrossing.llllIIIIIIllI[2], lllllllllllllIlIlllllIIlllllIIll);
                        this.setBlockState(lllllllllllllIlIlllllIIllllIllII, Blocks.cobblestone.getDefaultState(), lllllllllllllIlIlllllIIlllllIIII, RoomCrossing.llllIIIIIIllI[5], RoomCrossing.llllIIIIIIllI[8], lllllllllllllIlIlllllIIlllllIIll);
                        ++lllllllllllllIlIlllllIIlllllIIII;
                    }
                    this.setBlockState(lllllllllllllIlIlllllIIllllIllII, Blocks.cobblestone.getDefaultState(), RoomCrossing.llllIIIIIIllI[3], RoomCrossing.llllIIIIIIllI[2], RoomCrossing.llllIIIIIIllI[7], lllllllllllllIlIlllllIIlllllIIll);
                    this.setBlockState(lllllllllllllIlIlllllIIllllIllII, Blocks.cobblestone.getDefaultState(), RoomCrossing.llllIIIIIIllI[3], RoomCrossing.llllIIIIIIllI[2], RoomCrossing.llllIIIIIIllI[11], lllllllllllllIlIlllllIIlllllIIll);
                    this.setBlockState(lllllllllllllIlIlllllIIllllIllII, Blocks.cobblestone.getDefaultState(), RoomCrossing.llllIIIIIIllI[3], RoomCrossing.llllIIIIIIllI[5], RoomCrossing.llllIIIIIIllI[7], lllllllllllllIlIlllllIIlllllIIll);
                    this.setBlockState(lllllllllllllIlIlllllIIllllIllII, Blocks.cobblestone.getDefaultState(), RoomCrossing.llllIIIIIIllI[3], RoomCrossing.llllIIIIIIllI[5], RoomCrossing.llllIIIIIIllI[11], lllllllllllllIlIlllllIIlllllIIll);
                    this.setBlockState(lllllllllllllIlIlllllIIllllIllII, Blocks.cobblestone.getDefaultState(), RoomCrossing.llllIIIIIIllI[7], RoomCrossing.llllIIIIIIllI[2], RoomCrossing.llllIIIIIIllI[3], lllllllllllllIlIlllllIIlllllIIll);
                    this.setBlockState(lllllllllllllIlIlllllIIllllIllII, Blocks.cobblestone.getDefaultState(), RoomCrossing.llllIIIIIIllI[11], RoomCrossing.llllIIIIIIllI[2], RoomCrossing.llllIIIIIIllI[3], lllllllllllllIlIlllllIIlllllIIll);
                    this.setBlockState(lllllllllllllIlIlllllIIllllIllII, Blocks.cobblestone.getDefaultState(), RoomCrossing.llllIIIIIIllI[7], RoomCrossing.llllIIIIIIllI[5], RoomCrossing.llllIIIIIIllI[3], lllllllllllllIlIlllllIIlllllIIll);
                    this.setBlockState(lllllllllllllIlIlllllIIllllIllII, Blocks.cobblestone.getDefaultState(), RoomCrossing.llllIIIIIIllI[11], RoomCrossing.llllIIIIIIllI[5], RoomCrossing.llllIIIIIIllI[3], lllllllllllllIlIlllllIIlllllIIll);
                    int lllllllllllllIlIlllllIIllllIllll = RoomCrossing.llllIIIIIIllI[2];
                    "".length();
                    if (null != null) {
                        return ((0x27 ^ 0x4D ^ (0x63 ^ 0x29)) & (0x38 ^ 0x31 ^ (0x25 ^ 0xC) ^ -" ".length())) != 0x0;
                    }
                    while (!lIlIIllIlIlllII(lllllllllllllIlIlllllIIllllIllll, RoomCrossing.llllIIIIIIllI[5])) {
                        this.setBlockState(lllllllllllllIlIlllllIIllllIllII, Blocks.cobblestone.getDefaultState(), RoomCrossing.llllIIIIIIllI[7], lllllllllllllIlIlllllIIllllIllll, RoomCrossing.llllIIIIIIllI[7], lllllllllllllIlIlllllIIlllllIIll);
                        this.setBlockState(lllllllllllllIlIlllllIIllllIllII, Blocks.cobblestone.getDefaultState(), RoomCrossing.llllIIIIIIllI[11], lllllllllllllIlIlllllIIllllIllll, RoomCrossing.llllIIIIIIllI[7], lllllllllllllIlIlllllIIlllllIIll);
                        this.setBlockState(lllllllllllllIlIlllllIIllllIllII, Blocks.cobblestone.getDefaultState(), RoomCrossing.llllIIIIIIllI[7], lllllllllllllIlIlllllIIllllIllll, RoomCrossing.llllIIIIIIllI[11], lllllllllllllIlIlllllIIlllllIIll);
                        this.setBlockState(lllllllllllllIlIlllllIIllllIllII, Blocks.cobblestone.getDefaultState(), RoomCrossing.llllIIIIIIllI[11], lllllllllllllIlIlllllIIllllIllll, RoomCrossing.llllIIIIIIllI[11], lllllllllllllIlIlllllIIlllllIIll);
                        ++lllllllllllllIlIlllllIIllllIllll;
                    }
                    this.setBlockState(lllllllllllllIlIlllllIIllllIllII, Blocks.torch.getDefaultState(), RoomCrossing.llllIIIIIIllI[3], RoomCrossing.llllIIIIIIllI[5], RoomCrossing.llllIIIIIIllI[3], lllllllllllllIlIlllllIIlllllIIll);
                    int lllllllllllllIlIlllllIIllllIlllI = RoomCrossing.llllIIIIIIllI[6];
                    "".length();
                    if ("   ".length() < ("  ".length() & ("  ".length() ^ -" ".length()))) {
                        return ((0xD0 ^ 0x99 ^ (0xEF ^ 0x82)) & (0x6A ^ 0x46 ^ (0x19 ^ 0x11) ^ -" ".length())) != 0x0;
                    }
                    while (!lIlIIllIlIlllII(lllllllllllllIlIlllllIIllllIlllI, RoomCrossing.llllIIIIIIllI[9])) {
                        this.setBlockState(lllllllllllllIlIlllllIIllllIllII, Blocks.planks.getDefaultState(), RoomCrossing.llllIIIIIIllI[6], RoomCrossing.llllIIIIIIllI[5], lllllllllllllIlIlllllIIllllIlllI, lllllllllllllIlIlllllIIlllllIIll);
                        this.setBlockState(lllllllllllllIlIlllllIIllllIllII, Blocks.planks.getDefaultState(), RoomCrossing.llllIIIIIIllI[5], RoomCrossing.llllIIIIIIllI[5], lllllllllllllIlIlllllIIllllIlllI, lllllllllllllIlIlllllIIlllllIIll);
                        if (!lIlIIllIlIlllII(lllllllllllllIlIlllllIIllllIlllI, RoomCrossing.llllIIIIIIllI[5]) || lIlIIllIlIllIII(lllllllllllllIlIlllllIIllllIlllI, RoomCrossing.llllIIIIIIllI[0])) {
                            this.setBlockState(lllllllllllllIlIlllllIIllllIllII, Blocks.planks.getDefaultState(), RoomCrossing.llllIIIIIIllI[7], RoomCrossing.llllIIIIIIllI[5], lllllllllllllIlIlllllIIllllIlllI, lllllllllllllIlIlllllIIlllllIIll);
                            this.setBlockState(lllllllllllllIlIlllllIIllllIllII, Blocks.planks.getDefaultState(), RoomCrossing.llllIIIIIIllI[3], RoomCrossing.llllIIIIIIllI[5], lllllllllllllIlIlllllIIllllIlllI, lllllllllllllIlIlllllIIlllllIIll);
                            this.setBlockState(lllllllllllllIlIlllllIIllllIllII, Blocks.planks.getDefaultState(), RoomCrossing.llllIIIIIIllI[11], RoomCrossing.llllIIIIIIllI[5], lllllllllllllIlIlllllIIllllIlllI, lllllllllllllIlIlllllIIlllllIIll);
                        }
                        this.setBlockState(lllllllllllllIlIlllllIIllllIllII, Blocks.planks.getDefaultState(), RoomCrossing.llllIIIIIIllI[0], RoomCrossing.llllIIIIIIllI[5], lllllllllllllIlIlllllIIllllIlllI, lllllllllllllIlIlllllIIlllllIIll);
                        this.setBlockState(lllllllllllllIlIlllllIIllllIllII, Blocks.planks.getDefaultState(), RoomCrossing.llllIIIIIIllI[9], RoomCrossing.llllIIIIIIllI[5], lllllllllllllIlIlllllIIllllIlllI, lllllllllllllIlIlllllIIlllllIIll);
                        ++lllllllllllllIlIlllllIIllllIlllI;
                    }
                    this.setBlockState(lllllllllllllIlIlllllIIllllIllII, Blocks.ladder.getStateFromMeta(this.getMetadataWithOffset(Blocks.ladder, EnumFacing.WEST.getIndex())), RoomCrossing.llllIIIIIIllI[8], RoomCrossing.llllIIIIIIllI[2], RoomCrossing.llllIIIIIIllI[5], lllllllllllllIlIlllllIIlllllIIll);
                    this.setBlockState(lllllllllllllIlIlllllIIllllIllII, Blocks.ladder.getStateFromMeta(this.getMetadataWithOffset(Blocks.ladder, EnumFacing.WEST.getIndex())), RoomCrossing.llllIIIIIIllI[8], RoomCrossing.llllIIIIIIllI[6], RoomCrossing.llllIIIIIIllI[5], lllllllllllllIlIlllllIIlllllIIll);
                    this.setBlockState(lllllllllllllIlIlllllIIllllIllII, Blocks.ladder.getStateFromMeta(this.getMetadataWithOffset(Blocks.ladder, EnumFacing.WEST.getIndex())), RoomCrossing.llllIIIIIIllI[8], RoomCrossing.llllIIIIIIllI[5], RoomCrossing.llllIIIIIIllI[5], lllllllllllllIlIlllllIIlllllIIll);
                    final int llllllllllllIllIlIlllIlllIIIIIIl = RoomCrossing.llllIIIIIIllI[5];
                    final int llllllllllllIllIlIlllIllIlllIlII = RoomCrossing.llllIIIIIIllI[7];
                    final int llllllllllllIllIlIlllIllIlllllll = RoomCrossing.llllIIIIIIllI[9];
                    final List<WeightedRandomChestContent> strongholdRoomCrossingChestContents = RoomCrossing.strongholdRoomCrossingChestContents;
                    final WeightedRandomChestContent[] llllllllllllIlIlllIIlllIllIIIlIl = new WeightedRandomChestContent[RoomCrossing.llllIIIIIIllI[2]];
                    llllllllllllIlIlllIIlllIllIIIlIl[RoomCrossing.llllIIIIIIllI[1]] = Items.enchanted_book.getRandom(lllllllllllllIlIlllllIIllllIlIll);
                    this.generateChestContents(lllllllllllllIlIlllllIIllllIllII, lllllllllllllIlIlllllIIlllllIIll, lllllllllllllIlIlllllIIllllIlIll, llllllllllllIllIlIlllIlllIIIIIIl, llllllllllllIllIlIlllIllIlllIlII, llllllllllllIllIlIlllIllIlllllll, WeightedRandomChestContent.func_177629_a(strongholdRoomCrossingChestContents, llllllllllllIlIlllIIlllIllIIIlIl), RoomCrossing.llllIIIIIIllI[2] + lllllllllllllIlIlllllIIllllIlIll.nextInt(RoomCrossing.llllIIIIIIllI[7]));
                    "".length();
                    break;
                }
            }
            return RoomCrossing.llllIIIIIIllI[2] != 0;
        }
        
        public RoomCrossing() {
        }
        
        private static boolean lIlIIllIlIlllII(final int lllllllllllllIlIlllllIIlllIIlIII, final int lllllllllllllIlIlllllIIlllIIIlll) {
            return lllllllllllllIlIlllllIIlllIIlIII > lllllllllllllIlIlllllIIlllIIIlll;
        }
        
        private static String lIlIIllIlIIIlll(final String lllllllllllllIlIlllllIIlllIlIlII, final String lllllllllllllIlIlllllIIlllIlIIIl) {
            try {
                final SecretKeySpec lllllllllllllIlIlllllIIlllIlIlll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIlIlllllIIlllIlIIIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
                final Cipher lllllllllllllIlIlllllIIlllIlIllI = Cipher.getInstance("Blowfish");
                lllllllllllllIlIlllllIIlllIlIllI.init(RoomCrossing.llllIIIIIIllI[6], lllllllllllllIlIlllllIIlllIlIlll);
                return new String(lllllllllllllIlIlllllIIlllIlIllI.doFinal(Base64.getDecoder().decode(lllllllllllllIlIlllllIIlllIlIlII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
            }
            catch (Exception lllllllllllllIlIlllllIIlllIlIlIl) {
                lllllllllllllIlIlllllIIlllIlIlIl.printStackTrace();
                return null;
            }
        }
        
        @Override
        protected void writeStructureToNBT(final NBTTagCompound lllllllllllllIlIlllllIlIIIlIIllI) {
            super.writeStructureToNBT(lllllllllllllIlIlllllIlIIIlIIllI);
            lllllllllllllIlIlllllIlIIIlIIllI.setInteger(RoomCrossing.llllIIIIIIIIl[RoomCrossing.llllIIIIIIllI[1]], this.roomType);
        }
        
        @Override
        public void buildComponent(final StructureComponent lllllllllllllIlIlllllIlIIIIlIllI, final List<StructureComponent> lllllllllllllIlIlllllIlIIIIlIlIl, final Random lllllllllllllIlIlllllIlIIIIllIII) {
            this.getNextComponentNormal((Stairs2)lllllllllllllIlIlllllIlIIIIlIllI, lllllllllllllIlIlllllIlIIIIlIlIl, lllllllllllllIlIlllllIlIIIIllIII, RoomCrossing.llllIIIIIIllI[7], RoomCrossing.llllIIIIIIllI[2]);
            "".length();
            this.getNextComponentX((Stairs2)lllllllllllllIlIlllllIlIIIIlIllI, lllllllllllllIlIlllllIlIIIIlIlIl, lllllllllllllIlIlllllIlIIIIllIII, RoomCrossing.llllIIIIIIllI[2], RoomCrossing.llllIIIIIIllI[7]);
            "".length();
            this.getNextComponentZ((Stairs2)lllllllllllllIlIlllllIlIIIIlIllI, lllllllllllllIlIlllllIlIIIIlIlIl, lllllllllllllIlIlllllIlIIIIllIII, RoomCrossing.llllIIIIIIllI[2], RoomCrossing.llllIIIIIIllI[7]);
            "".length();
        }
        
        public static RoomCrossing func_175859_a(final List<StructureComponent> lllllllllllllIlIlllllIlIIIIIlIll, final Random lllllllllllllIlIlllllIlIIIIIlIlI, final int lllllllllllllIlIlllllIlIIIIIlIIl, final int lllllllllllllIlIlllllIlIIIIIlIII, final int lllllllllllllIlIlllllIlIIIIIIlll, final EnumFacing lllllllllllllIlIlllllIlIIIIIIllI, final int lllllllllllllIlIlllllIIlllllllIl) {
            final StructureBoundingBox lllllllllllllIlIlllllIlIIIIIIlII = StructureBoundingBox.getComponentToAddBoundingBox(lllllllllllllIlIlllllIlIIIIIlIIl, lllllllllllllIlIlllllIlIIIIIlIII, lllllllllllllIlIlllllIlIIIIIIlll, RoomCrossing.llllIIIIIIllI[12], RoomCrossing.llllIIIIIIllI[13], RoomCrossing.llllIIIIIIllI[1], RoomCrossing.llllIIIIIIllI[14], RoomCrossing.llllIIIIIIllI[0], RoomCrossing.llllIIIIIIllI[14], lllllllllllllIlIlllllIlIIIIIIllI);
            RoomCrossing roomCrossing;
            if (lIlIIllIlIlIllI(Stronghold.canStrongholdGoDeeper(lllllllllllllIlIlllllIlIIIIIIlII) ? 1 : 0) && lIlIIllIlIlIlll(StructureComponent.findIntersecting(lllllllllllllIlIlllllIlIIIIIlIll, lllllllllllllIlIlllllIlIIIIIIlII))) {
                roomCrossing = new RoomCrossing(lllllllllllllIlIlllllIIlllllllIl, lllllllllllllIlIlllllIlIIIIIlIlI, lllllllllllllIlIlllllIlIIIIIIlII, lllllllllllllIlIlllllIlIIIIIIllI);
                "".length();
                if ("   ".length() > "   ".length()) {
                    return null;
                }
            }
            else {
                roomCrossing = null;
            }
            return roomCrossing;
        }
        
        private static void lIlIIllIlIIlIII() {
            (llllIIIIIIIIl = new String[RoomCrossing.llllIIIIIIllI[6]])[RoomCrossing.llllIIIIIIllI[1]] = lIlIIllIIlllIll("Tzv8rm6/4dQ=", "vkhed");
            RoomCrossing.llllIIIIIIIIl[RoomCrossing.llllIIIIIIllI[2]] = lIlIIllIlIIIlll("n/ZSlLZkbgY=", "IwSfB");
        }
        
        public RoomCrossing(final int lllllllllllllIlIlllllIlIIIlIllll, final Random lllllllllllllIlIlllllIlIIIllIIll, final StructureBoundingBox lllllllllllllIlIlllllIlIIIllIIlI, final EnumFacing lllllllllllllIlIlllllIlIIIllIIIl) {
            super(lllllllllllllIlIlllllIlIIIlIllll);
            this.coordBaseMode = lllllllllllllIlIlllllIlIIIllIIIl;
            this.field_143013_d = this.getRandomDoor(lllllllllllllIlIlllllIlIIIllIIll);
            this.boundingBox = lllllllllllllIlIlllllIlIIIllIIlI;
            this.roomType = lllllllllllllIlIlllllIlIIIllIIll.nextInt(RoomCrossing.llllIIIIIIllI[3]);
        }
        
        static {
            lIlIIllIlIlIlIl();
            lIlIIllIlIIlIII();
            final WeightedRandomChestContent[] array = new WeightedRandomChestContent[RoomCrossing.llllIIIIIIllI[0]];
            array[RoomCrossing.llllIIIIIIllI[1]] = new WeightedRandomChestContent(Items.iron_ingot, RoomCrossing.llllIIIIIIllI[1], RoomCrossing.llllIIIIIIllI[2], RoomCrossing.llllIIIIIIllI[3], RoomCrossing.llllIIIIIIllI[4]);
            array[RoomCrossing.llllIIIIIIllI[2]] = new WeightedRandomChestContent(Items.gold_ingot, RoomCrossing.llllIIIIIIllI[1], RoomCrossing.llllIIIIIIllI[2], RoomCrossing.llllIIIIIIllI[5], RoomCrossing.llllIIIIIIllI[3]);
            array[RoomCrossing.llllIIIIIIllI[6]] = new WeightedRandomChestContent(Items.redstone, RoomCrossing.llllIIIIIIllI[1], RoomCrossing.llllIIIIIIllI[7], RoomCrossing.llllIIIIIIllI[8], RoomCrossing.llllIIIIIIllI[3]);
            array[RoomCrossing.llllIIIIIIllI[5]] = new WeightedRandomChestContent(Items.coal, RoomCrossing.llllIIIIIIllI[1], RoomCrossing.llllIIIIIIllI[5], RoomCrossing.llllIIIIIIllI[9], RoomCrossing.llllIIIIIIllI[4]);
            array[RoomCrossing.llllIIIIIIllI[7]] = new WeightedRandomChestContent(Items.bread, RoomCrossing.llllIIIIIIllI[1], RoomCrossing.llllIIIIIIllI[2], RoomCrossing.llllIIIIIIllI[5], RoomCrossing.llllIIIIIIllI[10]);
            array[RoomCrossing.llllIIIIIIllI[3]] = new WeightedRandomChestContent(Items.apple, RoomCrossing.llllIIIIIIllI[1], RoomCrossing.llllIIIIIIllI[2], RoomCrossing.llllIIIIIIllI[5], RoomCrossing.llllIIIIIIllI[10]);
            array[RoomCrossing.llllIIIIIIllI[11]] = new WeightedRandomChestContent(Items.iron_pickaxe, RoomCrossing.llllIIIIIIllI[1], RoomCrossing.llllIIIIIIllI[2], RoomCrossing.llllIIIIIIllI[2], RoomCrossing.llllIIIIIIllI[2]);
            strongholdRoomCrossingChestContents = Lists.newArrayList((Object[])array);
        }
        
        private static boolean lIlIIllIlIllIII(final int lllllllllllllIlIlllllIIlllIIllII, final int lllllllllllllIlIlllllIIlllIIlIll) {
            return lllllllllllllIlIlllllIIlllIIllII >= lllllllllllllIlIlllllIIlllIIlIll;
        }
        
        private static boolean lIlIIllIlIlIlll(final Object lllllllllllllIlIlllllIIlllIIIlIl) {
            return lllllllllllllIlIlllllIIlllIIIlIl == null;
        }
        
        private static String lIlIIllIIlllIll(final String lllllllllllllIlIlllllIIllllIIIIl, final String lllllllllllllIlIlllllIIllllIIIII) {
            try {
                final SecretKeySpec lllllllllllllIlIlllllIIllllIIlII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIlIlllllIIllllIIIII.getBytes(StandardCharsets.UTF_8)), RoomCrossing.llllIIIIIIllI[9]), "DES");
                final Cipher lllllllllllllIlIlllllIIllllIIIll = Cipher.getInstance("DES");
                lllllllllllllIlIlllllIIllllIIIll.init(RoomCrossing.llllIIIIIIllI[6], lllllllllllllIlIlllllIIllllIIlII);
                return new String(lllllllllllllIlIlllllIIllllIIIll.doFinal(Base64.getDecoder().decode(lllllllllllllIlIlllllIIllllIIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
            }
            catch (Exception lllllllllllllIlIlllllIIllllIIIlI) {
                lllllllllllllIlIlllllIIllllIIIlI.printStackTrace();
                return null;
            }
        }
        
        @Override
        protected void readStructureFromNBT(final NBTTagCompound lllllllllllllIlIlllllIlIIIlIIIlI) {
            super.readStructureFromNBT(lllllllllllllIlIlllllIlIIIlIIIlI);
            this.roomType = lllllllllllllIlIlllllIlIIIlIIIlI.getInteger(RoomCrossing.llllIIIIIIIIl[RoomCrossing.llllIIIIIIllI[2]]);
        }
    }
    
    public static class Library extends Stronghold
    {
        private /* synthetic */ boolean isLargeRoom;
        private static final /* synthetic */ String[] lIlIllIIllllll;
        private static final /* synthetic */ List<WeightedRandomChestContent> strongholdLibraryChestContents;
        private static final /* synthetic */ int[] lIlIllIlIIIIII;
        
        static {
            llllIIIlIllIlll();
            llllIIIlIllIllI();
            final WeightedRandomChestContent[] array = new WeightedRandomChestContent[Library.lIlIllIlIIIIII[0]];
            array[Library.lIlIllIlIIIIII[1]] = new WeightedRandomChestContent(Items.book, Library.lIlIllIlIIIIII[1], Library.lIlIllIlIIIIII[2], Library.lIlIllIlIIIIII[3], Library.lIlIllIlIIIIII[4]);
            array[Library.lIlIllIlIIIIII[2]] = new WeightedRandomChestContent(Items.paper, Library.lIlIllIlIIIIII[1], Library.lIlIllIlIIIIII[5], Library.lIlIllIlIIIIII[6], Library.lIlIllIlIIIIII[4]);
            array[Library.lIlIllIlIIIIII[5]] = new WeightedRandomChestContent(Items.map, Library.lIlIllIlIIIIII[1], Library.lIlIllIlIIIIII[2], Library.lIlIllIlIIIIII[2], Library.lIlIllIlIIIIII[2]);
            array[Library.lIlIllIlIIIIII[3]] = new WeightedRandomChestContent(Items.compass, Library.lIlIllIlIIIIII[1], Library.lIlIllIlIIIIII[2], Library.lIlIllIlIIIIII[2], Library.lIlIllIlIIIIII[2]);
            strongholdLibraryChestContents = Lists.newArrayList((Object[])array);
        }
        
        @Override
        protected void readStructureFromNBT(final NBTTagCompound lllllllllllllIIIIllIllIllIllllII) {
            super.readStructureFromNBT(lllllllllllllIIIIllIllIllIllllII);
            this.isLargeRoom = lllllllllllllIIIIllIllIllIllllII.getBoolean(Library.lIlIllIIllllll[Library.lIlIllIlIIIIII[2]]);
        }
        
        private static boolean llllIIIlIlllIlI(final Object lllllllllllllIIIIllIllIlIllIlIll) {
            return lllllllllllllIIIIllIllIlIllIlIll != null;
        }
        
        private static boolean llllIIIlIlllIIl(final int lllllllllllllIIIIllIllIlIllIlIIl) {
            return lllllllllllllIIIIllIllIlIllIlIIl != 0;
        }
        
        public Library() {
        }
        
        private static boolean llllIIIlIlllIll(final int lllllllllllllIIIIllIllIlIllIIlll) {
            return lllllllllllllIIIIllIllIlIllIIlll == 0;
        }
        
        private static void llllIIIlIllIllI() {
            (lIlIllIIllllll = new String[Library.lIlIllIlIIIIII[5]])[Library.lIlIllIlIIIIII[1]] = llllIIIlIllIlIl("GJxHojylLEw=", "dKLLW");
            Library.lIlIllIIllllll[Library.lIlIllIlIIIIII[2]] = llllIIIlIllIlIl("tJdELoUN7Io=", "drxmd");
        }
        
        private static boolean llllIIIlIlllIII(final int lllllllllllllIIIIllIllIlIllIlllI, final int lllllllllllllIIIIllIllIlIllIllIl) {
            return lllllllllllllIIIIllIllIlIllIlllI > lllllllllllllIIIIllIllIlIllIllIl;
        }
        
        private static boolean llllIIIlIllllII(final int lllllllllllllIIIIllIllIlIlllIIlI, final int lllllllllllllIIIIllIllIlIlllIIIl) {
            return lllllllllllllIIIIllIllIlIlllIIlI >= lllllllllllllIIIIllIllIlIlllIIIl;
        }
        
        @Override
        public boolean addComponentParts(final World lllllllllllllIIIIllIllIllIIIlIlI, final Random lllllllllllllIIIIllIllIllIIIlIIl, final StructureBoundingBox lllllllllllllIIIIllIllIllIIIlIII) {
            if (llllIIIlIlllIIl(this.isLiquidInStructureBoundingBox(lllllllllllllIIIIllIllIllIIIlIlI, lllllllllllllIIIIllIllIllIIIlIII) ? 1 : 0)) {
                return Library.lIlIllIlIIIIII[1] != 0;
            }
            int lllllllllllllIIIIllIllIllIIlIIll = Library.lIlIllIlIIIIII[11];
            if (llllIIIlIlllIll(this.isLargeRoom ? 1 : 0)) {
                lllllllllllllIIIIllIllIllIIlIIll = Library.lIlIllIlIIIIII[7];
            }
            this.fillWithRandomizedBlocks(lllllllllllllIIIIllIllIllIIIlIlI, lllllllllllllIIIIllIllIllIIIlIII, Library.lIlIllIlIIIIII[1], Library.lIlIllIlIIIIII[1], Library.lIlIllIlIIIIII[1], Library.lIlIllIlIIIIII[13], lllllllllllllIIIIllIllIllIIlIIll - Library.lIlIllIlIIIIII[2], Library.lIlIllIlIIIIII[10], (boolean)(Library.lIlIllIlIIIIII[2] != 0), lllllllllllllIIIIllIllIllIIIlIIl, StructureStrongholdPieces.strongholdStones);
            this.placeDoor(lllllllllllllIIIIllIllIllIIIlIlI, lllllllllllllIIIIllIllIllIIIlIIl, lllllllllllllIIIIllIllIllIIIlIII, this.field_143013_d, Library.lIlIllIlIIIIII[0], Library.lIlIllIlIIIIII[2], Library.lIlIllIlIIIIII[1]);
            this.func_175805_a(lllllllllllllIIIIllIllIllIIIlIlI, lllllllllllllIIIIllIllIllIIIlIII, lllllllllllllIIIIllIllIllIIIlIIl, 0.07f, Library.lIlIllIlIIIIII[5], Library.lIlIllIlIIIIII[2], Library.lIlIllIlIIIIII[2], Library.lIlIllIlIIIIII[11], Library.lIlIllIlIIIIII[0], Library.lIlIllIlIIIIII[13], Blocks.web.getDefaultState(), Blocks.web.getDefaultState(), (boolean)(Library.lIlIllIlIIIIII[1] != 0));
            final int lllllllllllllIIIIllIllIllIIlIIlI = Library.lIlIllIlIIIIII[2];
            final int lllllllllllllIIIIllIllIllIIlIIIl = Library.lIlIllIlIIIIII[14];
            int lllllllllllllIIIIllIllIllIIlIIII = Library.lIlIllIlIIIIII[2];
            "".length();
            if ("  ".length() == 0) {
                return ((0x4B ^ 0xE) & ~(0xC8 ^ 0x8D)) != 0x0;
            }
            while (!llllIIIlIlllIII(lllllllllllllIIIIllIllIllIIlIIII, Library.lIlIllIlIIIIII[13])) {
                if (llllIIIlIlllIll((lllllllllllllIIIIllIllIllIIlIIII - Library.lIlIllIlIIIIII[2]) % Library.lIlIllIlIIIIII[0])) {
                    this.fillWithBlocks(lllllllllllllIIIIllIllIllIIIlIlI, lllllllllllllIIIIllIllIllIIIlIII, Library.lIlIllIlIIIIII[2], Library.lIlIllIlIIIIII[2], lllllllllllllIIIIllIllIllIIlIIII, Library.lIlIllIlIIIIII[2], Library.lIlIllIlIIIIII[0], lllllllllllllIIIIllIllIllIIlIIII, Blocks.planks.getDefaultState(), Blocks.planks.getDefaultState(), (boolean)(Library.lIlIllIlIIIIII[1] != 0));
                    this.fillWithBlocks(lllllllllllllIIIIllIllIllIIIlIlI, lllllllllllllIIIIllIllIllIIIlIII, Library.lIlIllIlIIIIII[14], Library.lIlIllIlIIIIII[2], lllllllllllllIIIIllIllIllIIlIIII, Library.lIlIllIlIIIIII[14], Library.lIlIllIlIIIIII[0], lllllllllllllIIIIllIllIllIIlIIII, Blocks.planks.getDefaultState(), Blocks.planks.getDefaultState(), (boolean)(Library.lIlIllIlIIIIII[1] != 0));
                    this.setBlockState(lllllllllllllIIIIllIllIllIIIlIlI, Blocks.torch.getDefaultState(), Library.lIlIllIlIIIIII[5], Library.lIlIllIlIIIIII[3], lllllllllllllIIIIllIllIllIIlIIII, lllllllllllllIIIIllIllIllIIIlIII);
                    this.setBlockState(lllllllllllllIIIIllIllIllIIIlIlI, Blocks.torch.getDefaultState(), Library.lIlIllIlIIIIII[11], Library.lIlIllIlIIIIII[3], lllllllllllllIIIIllIllIllIIlIIII, lllllllllllllIIIIllIllIllIIIlIII);
                    if (llllIIIlIlllIIl(this.isLargeRoom ? 1 : 0)) {
                        this.fillWithBlocks(lllllllllllllIIIIllIllIllIIIlIlI, lllllllllllllIIIIllIllIllIIIlIII, Library.lIlIllIlIIIIII[2], Library.lIlIllIlIIIIII[7], lllllllllllllIIIIllIllIllIIlIIII, Library.lIlIllIlIIIIII[2], Library.lIlIllIlIIIIII[15], lllllllllllllIIIIllIllIllIIlIIII, Blocks.planks.getDefaultState(), Blocks.planks.getDefaultState(), (boolean)(Library.lIlIllIlIIIIII[1] != 0));
                        this.fillWithBlocks(lllllllllllllIIIIllIllIllIIIlIlI, lllllllllllllIIIIllIllIllIIIlIII, Library.lIlIllIlIIIIII[14], Library.lIlIllIlIIIIII[7], lllllllllllllIIIIllIllIllIIlIIII, Library.lIlIllIlIIIIII[14], Library.lIlIllIlIIIIII[15], lllllllllllllIIIIllIllIllIIlIIII, Blocks.planks.getDefaultState(), Blocks.planks.getDefaultState(), (boolean)(Library.lIlIllIlIIIIII[1] != 0));
                        "".length();
                        if ("  ".length() == 0) {
                            return ((0x4E ^ 0x64 ^ (0x52 ^ 0x76)) & (92 + 15 + 41 + 29 ^ 32 + 146 - 104 + 117 ^ -" ".length())) != 0x0;
                        }
                    }
                }
                else {
                    this.fillWithBlocks(lllllllllllllIIIIllIllIllIIIlIlI, lllllllllllllIIIIllIllIllIIIlIII, Library.lIlIllIlIIIIII[2], Library.lIlIllIlIIIIII[2], lllllllllllllIIIIllIllIllIIlIIII, Library.lIlIllIlIIIIII[2], Library.lIlIllIlIIIIII[0], lllllllllllllIIIIllIllIllIIlIIII, Blocks.bookshelf.getDefaultState(), Blocks.bookshelf.getDefaultState(), (boolean)(Library.lIlIllIlIIIIII[1] != 0));
                    this.fillWithBlocks(lllllllllllllIIIIllIllIllIIIlIlI, lllllllllllllIIIIllIllIllIIIlIII, Library.lIlIllIlIIIIII[14], Library.lIlIllIlIIIIII[2], lllllllllllllIIIIllIllIllIIlIIII, Library.lIlIllIlIIIIII[14], Library.lIlIllIlIIIIII[0], lllllllllllllIIIIllIllIllIIlIIII, Blocks.bookshelf.getDefaultState(), Blocks.bookshelf.getDefaultState(), (boolean)(Library.lIlIllIlIIIIII[1] != 0));
                    if (llllIIIlIlllIIl(this.isLargeRoom ? 1 : 0)) {
                        this.fillWithBlocks(lllllllllllllIIIIllIllIllIIIlIlI, lllllllllllllIIIIllIllIllIIIlIII, Library.lIlIllIlIIIIII[2], Library.lIlIllIlIIIIII[7], lllllllllllllIIIIllIllIllIIlIIII, Library.lIlIllIlIIIIII[2], Library.lIlIllIlIIIIII[15], lllllllllllllIIIIllIllIllIIlIIII, Blocks.bookshelf.getDefaultState(), Blocks.bookshelf.getDefaultState(), (boolean)(Library.lIlIllIlIIIIII[1] != 0));
                        this.fillWithBlocks(lllllllllllllIIIIllIllIllIIIlIlI, lllllllllllllIIIIllIllIllIIIlIII, Library.lIlIllIlIIIIII[14], Library.lIlIllIlIIIIII[7], lllllllllllllIIIIllIllIllIIlIIII, Library.lIlIllIlIIIIII[14], Library.lIlIllIlIIIIII[15], lllllllllllllIIIIllIllIllIIlIIII, Blocks.bookshelf.getDefaultState(), Blocks.bookshelf.getDefaultState(), (boolean)(Library.lIlIllIlIIIIII[1] != 0));
                    }
                }
                ++lllllllllllllIIIIllIllIllIIlIIII;
            }
            int lllllllllllllIIIIllIllIllIIIllll = Library.lIlIllIlIIIIII[3];
            "".length();
            if ((0x27 ^ 0x23) != (0x55 ^ 0x51)) {
                return ((0x2C ^ 0xF) & ~(0xA1 ^ 0x82)) != 0x0;
            }
            while (!llllIIIlIllllII(lllllllllllllIIIIllIllIllIIIllll, Library.lIlIllIlIIIIII[14])) {
                this.fillWithBlocks(lllllllllllllIIIIllIllIllIIIlIlI, lllllllllllllIIIIllIllIllIIIlIII, Library.lIlIllIlIIIIII[3], Library.lIlIllIlIIIIII[2], lllllllllllllIIIIllIllIllIIIllll, Library.lIlIllIlIIIIII[0], Library.lIlIllIlIIIIII[3], lllllllllllllIIIIllIllIllIIIllll, Blocks.bookshelf.getDefaultState(), Blocks.bookshelf.getDefaultState(), (boolean)(Library.lIlIllIlIIIIII[1] != 0));
                this.fillWithBlocks(lllllllllllllIIIIllIllIllIIIlIlI, lllllllllllllIIIIllIllIllIIIlIII, Library.lIlIllIlIIIIII[7], Library.lIlIllIlIIIIII[2], lllllllllllllIIIIllIllIllIIIllll, Library.lIlIllIlIIIIII[6], Library.lIlIllIlIIIIII[3], lllllllllllllIIIIllIllIllIIIllll, Blocks.bookshelf.getDefaultState(), Blocks.bookshelf.getDefaultState(), (boolean)(Library.lIlIllIlIIIIII[1] != 0));
                this.fillWithBlocks(lllllllllllllIIIIllIllIllIIIlIlI, lllllllllllllIIIIllIllIllIIIlIII, Library.lIlIllIlIIIIII[15], Library.lIlIllIlIIIIII[2], lllllllllllllIIIIllIllIllIIIllll, Library.lIlIllIlIIIIII[16], Library.lIlIllIlIIIIII[3], lllllllllllllIIIIllIllIllIIIllll, Blocks.bookshelf.getDefaultState(), Blocks.bookshelf.getDefaultState(), (boolean)(Library.lIlIllIlIIIIII[1] != 0));
                lllllllllllllIIIIllIllIllIIIllll += 2;
            }
            if (llllIIIlIlllIIl(this.isLargeRoom ? 1 : 0)) {
                this.fillWithBlocks(lllllllllllllIIIIllIllIllIIIlIlI, lllllllllllllIIIIllIllIllIIIlIII, Library.lIlIllIlIIIIII[2], Library.lIlIllIlIIIIII[17], Library.lIlIllIlIIIIII[2], Library.lIlIllIlIIIIII[3], Library.lIlIllIlIIIIII[17], Library.lIlIllIlIIIIII[13], Blocks.planks.getDefaultState(), Blocks.planks.getDefaultState(), (boolean)(Library.lIlIllIlIIIIII[1] != 0));
                this.fillWithBlocks(lllllllllllllIIIIllIllIllIIIlIlI, lllllllllllllIIIIllIllIllIIIlIII, Library.lIlIllIlIIIIII[16], Library.lIlIllIlIIIIII[17], Library.lIlIllIlIIIIII[2], Library.lIlIllIlIIIIII[14], Library.lIlIllIlIIIIII[17], Library.lIlIllIlIIIIII[13], Blocks.planks.getDefaultState(), Blocks.planks.getDefaultState(), (boolean)(Library.lIlIllIlIIIIII[1] != 0));
                this.fillWithBlocks(lllllllllllllIIIIllIllIllIIIlIlI, lllllllllllllIIIIllIllIllIIIlIII, Library.lIlIllIlIIIIII[0], Library.lIlIllIlIIIIII[17], Library.lIlIllIlIIIIII[2], Library.lIlIllIlIIIIII[15], Library.lIlIllIlIIIIII[17], Library.lIlIllIlIIIIII[5], Blocks.planks.getDefaultState(), Blocks.planks.getDefaultState(), (boolean)(Library.lIlIllIlIIIIII[1] != 0));
                this.fillWithBlocks(lllllllllllllIIIIllIllIllIIIlIlI, lllllllllllllIIIIllIllIllIIIlIII, Library.lIlIllIlIIIIII[0], Library.lIlIllIlIIIIII[17], Library.lIlIllIlIIIIII[14], Library.lIlIllIlIIIIII[15], Library.lIlIllIlIIIIII[17], Library.lIlIllIlIIIIII[13], Blocks.planks.getDefaultState(), Blocks.planks.getDefaultState(), (boolean)(Library.lIlIllIlIIIIII[1] != 0));
                this.setBlockState(lllllllllllllIIIIllIllIllIIIlIlI, Blocks.planks.getDefaultState(), Library.lIlIllIlIIIIII[15], Library.lIlIllIlIIIIII[17], Library.lIlIllIlIIIIII[11], lllllllllllllIIIIllIllIllIIIlIII);
                this.setBlockState(lllllllllllllIIIIllIllIllIIIlIlI, Blocks.planks.getDefaultState(), Library.lIlIllIlIIIIII[18], Library.lIlIllIlIIIIII[17], Library.lIlIllIlIIIIII[11], lllllllllllllIIIIllIllIllIIIlIII);
                this.setBlockState(lllllllllllllIIIIllIllIllIIIlIlI, Blocks.planks.getDefaultState(), Library.lIlIllIlIIIIII[15], Library.lIlIllIlIIIIII[17], Library.lIlIllIlIIIIII[16], lllllllllllllIIIIllIllIllIIIlIII);
                this.fillWithBlocks(lllllllllllllIIIIllIllIllIIIlIlI, lllllllllllllIIIIllIllIllIIIlIII, Library.lIlIllIlIIIIII[3], Library.lIlIllIlIIIIII[7], Library.lIlIllIlIIIIII[5], Library.lIlIllIlIIIIII[3], Library.lIlIllIlIIIIII[7], Library.lIlIllIlIIIIII[14], Blocks.oak_fence.getDefaultState(), Blocks.oak_fence.getDefaultState(), (boolean)(Library.lIlIllIlIIIIII[1] != 0));
                this.fillWithBlocks(lllllllllllllIIIIllIllIllIIIlIlI, lllllllllllllIIIIllIllIllIIIlIII, Library.lIlIllIlIIIIII[16], Library.lIlIllIlIIIIII[7], Library.lIlIllIlIIIIII[5], Library.lIlIllIlIIIIII[16], Library.lIlIllIlIIIIII[7], Library.lIlIllIlIIIIII[16], Blocks.oak_fence.getDefaultState(), Blocks.oak_fence.getDefaultState(), (boolean)(Library.lIlIllIlIIIIII[1] != 0));
                this.fillWithBlocks(lllllllllllllIIIIllIllIllIIIlIlI, lllllllllllllIIIIllIllIllIIIlIII, Library.lIlIllIlIIIIII[0], Library.lIlIllIlIIIIII[7], Library.lIlIllIlIIIIII[5], Library.lIlIllIlIIIIII[15], Library.lIlIllIlIIIIII[7], Library.lIlIllIlIIIIII[5], Blocks.oak_fence.getDefaultState(), Blocks.oak_fence.getDefaultState(), (boolean)(Library.lIlIllIlIIIIII[1] != 0));
                this.fillWithBlocks(lllllllllllllIIIIllIllIllIIIlIlI, lllllllllllllIIIIllIllIllIIIlIII, Library.lIlIllIlIIIIII[0], Library.lIlIllIlIIIIII[7], Library.lIlIllIlIIIIII[14], Library.lIlIllIlIIIIII[18], Library.lIlIllIlIIIIII[7], Library.lIlIllIlIIIIII[14], Blocks.oak_fence.getDefaultState(), Blocks.oak_fence.getDefaultState(), (boolean)(Library.lIlIllIlIIIIII[1] != 0));
                this.setBlockState(lllllllllllllIIIIllIllIllIIIlIlI, Blocks.oak_fence.getDefaultState(), Library.lIlIllIlIIIIII[15], Library.lIlIllIlIIIIII[7], Library.lIlIllIlIIIIII[11], lllllllllllllIIIIllIllIllIIIlIII);
                this.setBlockState(lllllllllllllIIIIllIllIllIIIlIlI, Blocks.oak_fence.getDefaultState(), Library.lIlIllIlIIIIII[18], Library.lIlIllIlIIIIII[7], Library.lIlIllIlIIIIII[11], lllllllllllllIIIIllIllIllIIIlIII);
                this.setBlockState(lllllllllllllIIIIllIllIllIIIlIlI, Blocks.oak_fence.getDefaultState(), Library.lIlIllIlIIIIII[15], Library.lIlIllIlIIIIII[7], Library.lIlIllIlIIIIII[16], lllllllllllllIIIIllIllIllIIIlIII);
                final int lllllllllllllIIIIllIllIllIIIlllI = this.getMetadataWithOffset(Blocks.ladder, Library.lIlIllIlIIIIII[3]);
                this.setBlockState(lllllllllllllIIIIllIllIllIIIlIlI, Blocks.ladder.getStateFromMeta(lllllllllllllIIIIllIllIllIIIlllI), Library.lIlIllIlIIIIII[16], Library.lIlIllIlIIIIII[2], Library.lIlIllIlIIIIII[13], lllllllllllllIIIIllIllIllIIIlIII);
                this.setBlockState(lllllllllllllIIIIllIllIllIIIlIlI, Blocks.ladder.getStateFromMeta(lllllllllllllIIIIllIllIllIIIlllI), Library.lIlIllIlIIIIII[16], Library.lIlIllIlIIIIII[5], Library.lIlIllIlIIIIII[13], lllllllllllllIIIIllIllIllIIIlIII);
                this.setBlockState(lllllllllllllIIIIllIllIllIIIlIlI, Blocks.ladder.getStateFromMeta(lllllllllllllIIIIllIllIllIIIlllI), Library.lIlIllIlIIIIII[16], Library.lIlIllIlIIIIII[3], Library.lIlIllIlIIIIII[13], lllllllllllllIIIIllIllIllIIIlIII);
                this.setBlockState(lllllllllllllIIIIllIllIllIIIlIlI, Blocks.ladder.getStateFromMeta(lllllllllllllIIIIllIllIllIIIlllI), Library.lIlIllIlIIIIII[16], Library.lIlIllIlIIIIII[0], Library.lIlIllIlIIIIII[13], lllllllllllllIIIIllIllIllIIIlIII);
                this.setBlockState(lllllllllllllIIIIllIllIllIIIlIlI, Blocks.ladder.getStateFromMeta(lllllllllllllIIIIllIllIllIIIlllI), Library.lIlIllIlIIIIII[16], Library.lIlIllIlIIIIII[17], Library.lIlIllIlIIIIII[13], lllllllllllllIIIIllIllIllIIIlIII);
                this.setBlockState(lllllllllllllIIIIllIllIllIIIlIlI, Blocks.ladder.getStateFromMeta(lllllllllllllIIIIllIllIllIIIlllI), Library.lIlIllIlIIIIII[16], Library.lIlIllIlIIIIII[7], Library.lIlIllIlIIIIII[13], lllllllllllllIIIIllIllIllIIIlIII);
                this.setBlockState(lllllllllllllIIIIllIllIllIIIlIlI, Blocks.ladder.getStateFromMeta(lllllllllllllIIIIllIllIllIIIlllI), Library.lIlIllIlIIIIII[16], Library.lIlIllIlIIIIII[6], Library.lIlIllIlIIIIII[13], lllllllllllllIIIIllIllIllIIIlIII);
                final int lllllllllllllIIIIllIllIllIIIllIl = Library.lIlIllIlIIIIII[6];
                final int lllllllllllllIIIIllIllIllIIIllII = Library.lIlIllIlIIIIII[6];
                this.setBlockState(lllllllllllllIIIIllIllIllIIIlIlI, Blocks.oak_fence.getDefaultState(), lllllllllllllIIIIllIllIllIIIllIl - Library.lIlIllIlIIIIII[2], Library.lIlIllIlIIIIII[15], lllllllllllllIIIIllIllIllIIIllII, lllllllllllllIIIIllIllIllIIIlIII);
                this.setBlockState(lllllllllllllIIIIllIllIllIIIlIlI, Blocks.oak_fence.getDefaultState(), lllllllllllllIIIIllIllIllIIIllIl, Library.lIlIllIlIIIIII[15], lllllllllllllIIIIllIllIllIIIllII, lllllllllllllIIIIllIllIllIIIlIII);
                this.setBlockState(lllllllllllllIIIIllIllIllIIIlIlI, Blocks.oak_fence.getDefaultState(), lllllllllllllIIIIllIllIllIIIllIl - Library.lIlIllIlIIIIII[2], Library.lIlIllIlIIIIII[18], lllllllllllllIIIIllIllIllIIIllII, lllllllllllllIIIIllIllIllIIIlIII);
                this.setBlockState(lllllllllllllIIIIllIllIllIIIlIlI, Blocks.oak_fence.getDefaultState(), lllllllllllllIIIIllIllIllIIIllIl, Library.lIlIllIlIIIIII[18], lllllllllllllIIIIllIllIllIIIllII, lllllllllllllIIIIllIllIllIIIlIII);
                this.setBlockState(lllllllllllllIIIIllIllIllIIIlIlI, Blocks.oak_fence.getDefaultState(), lllllllllllllIIIIllIllIllIIIllIl - Library.lIlIllIlIIIIII[2], Library.lIlIllIlIIIIII[6], lllllllllllllIIIIllIllIllIIIllII, lllllllllllllIIIIllIllIllIIIlIII);
                this.setBlockState(lllllllllllllIIIIllIllIllIIIlIlI, Blocks.oak_fence.getDefaultState(), lllllllllllllIIIIllIllIllIIIllIl, Library.lIlIllIlIIIIII[6], lllllllllllllIIIIllIllIllIIIllII, lllllllllllllIIIIllIllIllIIIlIII);
                this.setBlockState(lllllllllllllIIIIllIllIllIIIlIlI, Blocks.oak_fence.getDefaultState(), lllllllllllllIIIIllIllIllIIIllIl - Library.lIlIllIlIIIIII[5], Library.lIlIllIlIIIIII[6], lllllllllllllIIIIllIllIllIIIllII, lllllllllllllIIIIllIllIllIIIlIII);
                this.setBlockState(lllllllllllllIIIIllIllIllIIIlIlI, Blocks.oak_fence.getDefaultState(), lllllllllllllIIIIllIllIllIIIllIl + Library.lIlIllIlIIIIII[2], Library.lIlIllIlIIIIII[6], lllllllllllllIIIIllIllIllIIIllII, lllllllllllllIIIIllIllIllIIIlIII);
                this.setBlockState(lllllllllllllIIIIllIllIllIIIlIlI, Blocks.oak_fence.getDefaultState(), lllllllllllllIIIIllIllIllIIIllIl - Library.lIlIllIlIIIIII[2], Library.lIlIllIlIIIIII[6], lllllllllllllIIIIllIllIllIIIllII - Library.lIlIllIlIIIIII[2], lllllllllllllIIIIllIllIllIIIlIII);
                this.setBlockState(lllllllllllllIIIIllIllIllIIIlIlI, Blocks.oak_fence.getDefaultState(), lllllllllllllIIIIllIllIllIIIllIl - Library.lIlIllIlIIIIII[2], Library.lIlIllIlIIIIII[6], lllllllllllllIIIIllIllIllIIIllII + Library.lIlIllIlIIIIII[2], lllllllllllllIIIIllIllIllIIIlIII);
                this.setBlockState(lllllllllllllIIIIllIllIllIIIlIlI, Blocks.oak_fence.getDefaultState(), lllllllllllllIIIIllIllIllIIIllIl, Library.lIlIllIlIIIIII[6], lllllllllllllIIIIllIllIllIIIllII - Library.lIlIllIlIIIIII[2], lllllllllllllIIIIllIllIllIIIlIII);
                this.setBlockState(lllllllllllllIIIIllIllIllIIIlIlI, Blocks.oak_fence.getDefaultState(), lllllllllllllIIIIllIllIllIIIllIl, Library.lIlIllIlIIIIII[6], lllllllllllllIIIIllIllIllIIIllII + Library.lIlIllIlIIIIII[2], lllllllllllllIIIIllIllIllIIIlIII);
                this.setBlockState(lllllllllllllIIIIllIllIllIIIlIlI, Blocks.torch.getDefaultState(), lllllllllllllIIIIllIllIllIIIllIl - Library.lIlIllIlIIIIII[5], Library.lIlIllIlIIIIII[18], lllllllllllllIIIIllIllIllIIIllII, lllllllllllllIIIIllIllIllIIIlIII);
                this.setBlockState(lllllllllllllIIIIllIllIllIIIlIlI, Blocks.torch.getDefaultState(), lllllllllllllIIIIllIllIllIIIllIl + Library.lIlIllIlIIIIII[2], Library.lIlIllIlIIIIII[18], lllllllllllllIIIIllIllIllIIIllII, lllllllllllllIIIIllIllIllIIIlIII);
                this.setBlockState(lllllllllllllIIIIllIllIllIIIlIlI, Blocks.torch.getDefaultState(), lllllllllllllIIIIllIllIllIIIllIl - Library.lIlIllIlIIIIII[2], Library.lIlIllIlIIIIII[18], lllllllllllllIIIIllIllIllIIIllII - Library.lIlIllIlIIIIII[2], lllllllllllllIIIIllIllIllIIIlIII);
                this.setBlockState(lllllllllllllIIIIllIllIllIIIlIlI, Blocks.torch.getDefaultState(), lllllllllllllIIIIllIllIllIIIllIl - Library.lIlIllIlIIIIII[2], Library.lIlIllIlIIIIII[18], lllllllllllllIIIIllIllIllIIIllII + Library.lIlIllIlIIIIII[2], lllllllllllllIIIIllIllIllIIIlIII);
                this.setBlockState(lllllllllllllIIIIllIllIllIIIlIlI, Blocks.torch.getDefaultState(), lllllllllllllIIIIllIllIllIIIllIl, Library.lIlIllIlIIIIII[18], lllllllllllllIIIIllIllIllIIIllII - Library.lIlIllIlIIIIII[2], lllllllllllllIIIIllIllIllIIIlIII);
                this.setBlockState(lllllllllllllIIIIllIllIllIIIlIlI, Blocks.torch.getDefaultState(), lllllllllllllIIIIllIllIllIIIllIl, Library.lIlIllIlIIIIII[18], lllllllllllllIIIIllIllIllIIIllII + Library.lIlIllIlIIIIII[2], lllllllllllllIIIIllIllIllIIIlIII);
            }
            final int llllllllllllIllIlIlllIlllIIIIIIl = Library.lIlIllIlIIIIII[3];
            final int llllllllllllIllIlIlllIllIlllIlII = Library.lIlIllIlIIIIII[3];
            final int llllllllllllIllIlIlllIllIlllllll = Library.lIlIllIlIIIIII[17];
            final List<WeightedRandomChestContent> strongholdLibraryChestContents = Library.strongholdLibraryChestContents;
            final WeightedRandomChestContent[] llllllllllllIlIlllIIlllIllIIIlIl = new WeightedRandomChestContent[Library.lIlIllIlIIIIII[2]];
            llllllllllllIlIlllIIlllIllIIIlIl[Library.lIlIllIlIIIIII[1]] = Items.enchanted_book.getRandom(lllllllllllllIIIIllIllIllIIIlIIl, Library.lIlIllIlIIIIII[2], Library.lIlIllIlIIIIII[17], Library.lIlIllIlIIIIII[5]);
            this.generateChestContents(lllllllllllllIIIIllIllIllIIIlIlI, lllllllllllllIIIIllIllIllIIIlIII, lllllllllllllIIIIllIllIllIIIlIIl, llllllllllllIllIlIlllIlllIIIIIIl, llllllllllllIllIlIlllIllIlllIlII, llllllllllllIllIlIlllIllIlllllll, WeightedRandomChestContent.func_177629_a(strongholdLibraryChestContents, llllllllllllIlIlllIIlllIllIIIlIl), Library.lIlIllIlIIIIII[2] + lllllllllllllIIIIllIllIllIIIlIIl.nextInt(Library.lIlIllIlIIIIII[0]));
            "".length();
            if (llllIIIlIlllIIl(this.isLargeRoom ? 1 : 0)) {
                this.setBlockState(lllllllllllllIIIIllIllIllIIIlIlI, Blocks.air.getDefaultState(), Library.lIlIllIlIIIIII[14], Library.lIlIllIlIIIIII[15], Library.lIlIllIlIIIIII[2], lllllllllllllIIIIllIllIllIIIlIII);
                final int llllllllllllIllIlIlllIlllIIIIIIl2 = Library.lIlIllIlIIIIII[14];
                final int llllllllllllIllIlIlllIllIlllIlII2 = Library.lIlIllIlIIIIII[18];
                final int llllllllllllIllIlIlllIllIlllllll2 = Library.lIlIllIlIIIIII[2];
                final List<WeightedRandomChestContent> strongholdLibraryChestContents2 = Library.strongholdLibraryChestContents;
                final WeightedRandomChestContent[] llllllllllllIlIlllIIlllIllIIIlIl2 = new WeightedRandomChestContent[Library.lIlIllIlIIIIII[2]];
                llllllllllllIlIlllIIlllIllIIIlIl2[Library.lIlIllIlIIIIII[1]] = Items.enchanted_book.getRandom(lllllllllllllIIIIllIllIllIIIlIIl, Library.lIlIllIlIIIIII[2], Library.lIlIllIlIIIIII[17], Library.lIlIllIlIIIIII[5]);
                this.generateChestContents(lllllllllllllIIIIllIllIllIIIlIlI, lllllllllllllIIIIllIllIllIIIlIII, lllllllllllllIIIIllIllIllIIIlIIl, llllllllllllIllIlIlllIlllIIIIIIl2, llllllllllllIllIlIlllIllIlllIlII2, llllllllllllIllIlIlllIllIlllllll2, WeightedRandomChestContent.func_177629_a(strongholdLibraryChestContents2, llllllllllllIlIlllIIlllIllIIIlIl2), Library.lIlIllIlIIIIII[2] + lllllllllllllIIIIllIllIllIIIlIIl.nextInt(Library.lIlIllIlIIIIII[0]));
                "".length();
            }
            return Library.lIlIllIlIIIIII[2] != 0;
        }
        
        public Library(final int lllllllllllllIIIIllIllIlllIIlllI, final Random lllllllllllllIIIIllIllIlllIIllIl, final StructureBoundingBox lllllllllllllIIIIllIllIlllIIllII, final EnumFacing lllllllllllllIIIIllIllIlllIIIllI) {
            super(lllllllllllllIIIIllIllIlllIIlllI);
            this.coordBaseMode = lllllllllllllIIIIllIllIlllIIIllI;
            this.field_143013_d = this.getRandomDoor(lllllllllllllIIIIllIllIlllIIllIl);
            this.boundingBox = lllllllllllllIIIIllIllIlllIIllII;
            int isLargeRoom;
            if (llllIIIlIlllIII(lllllllllllllIIIIllIllIlllIIllII.getYSize(), Library.lIlIllIlIIIIII[7])) {
                isLargeRoom = Library.lIlIllIlIIIIII[2];
                "".length();
                if ("  ".length() != "  ".length()) {
                    throw null;
                }
            }
            else {
                isLargeRoom = Library.lIlIllIlIIIIII[1];
            }
            this.isLargeRoom = (isLargeRoom != 0);
        }
        
        private static void llllIIIlIllIlll() {
            (lIlIllIlIIIIII = new int[19])[0] = (0xBE ^ 0xBA);
            Library.lIlIllIlIIIIII[1] = ((169 + 30 - 158 + 131 ^ 5 + 56 - 38 + 106) & (29 + 30 - 53 + 165 ^ 20 + 88 - 44 + 70 ^ -" ".length()));
            Library.lIlIllIlIIIIII[2] = " ".length();
            Library.lIlIllIlIIIIII[3] = "   ".length();
            Library.lIlIllIlIIIIII[4] = (78 + 20 + 46 + 8 ^ 72 + 97 - 146 + 117);
            Library.lIlIllIlIIIIII[5] = "  ".length();
            Library.lIlIllIlIIIIII[6] = (0x27 ^ 0x20);
            Library.lIlIllIlIIIIII[7] = (0x56 ^ 0x44 ^ (0x37 ^ 0x23));
            Library.lIlIllIlIIIIII[8] = -(0x21 ^ 0x25);
            Library.lIlIllIlIIIIII[9] = -" ".length();
            Library.lIlIllIlIIIIII[10] = (0xB8 ^ 0xB6 ^ ((0xA5 ^ 0x95) & ~(0x43 ^ 0x73)));
            Library.lIlIllIlIIIIII[11] = (0x6 ^ 0xD);
            Library.lIlIllIlIIIIII[12] = (0x3D ^ 0x2C ^ (0xB1 ^ 0xAF));
            Library.lIlIllIlIIIIII[13] = (131 + 72 - 162 + 137 ^ 66 + 171 - 72 + 26);
            Library.lIlIllIlIIIIII[14] = (0xA4 ^ 0xA8);
            Library.lIlIllIlIIIIII[15] = (81 + 181 - 112 + 40 ^ 174 + 136 - 176 + 49);
            Library.lIlIllIlIIIIII[16] = (0x23 ^ 0x29);
            Library.lIlIllIlIIIIII[17] = (132 + 107 - 162 + 118 ^ 10 + 187 - 152 + 153);
            Library.lIlIllIlIIIIII[18] = (0xB0 ^ 0xB8);
        }
        
        @Override
        protected void writeStructureToNBT(final NBTTagCompound lllllllllllllIIIIllIllIlllIIIIlI) {
            super.writeStructureToNBT(lllllllllllllIIIIllIllIlllIIIIlI);
            lllllllllllllIIIIllIllIlllIIIIlI.setBoolean(Library.lIlIllIIllllll[Library.lIlIllIlIIIIII[1]], this.isLargeRoom);
        }
        
        private static String llllIIIlIllIlIl(final String lllllllllllllIIIIllIllIlIllllIII, final String lllllllllllllIIIIllIllIlIllllIIl) {
            try {
                final SecretKeySpec lllllllllllllIIIIllIllIlIlllllIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIIIIllIllIlIllllIIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
                final Cipher lllllllllllllIIIIllIllIlIlllllII = Cipher.getInstance("Blowfish");
                lllllllllllllIIIIllIllIlIlllllII.init(Library.lIlIllIlIIIIII[5], lllllllllllllIIIIllIllIlIlllllIl);
                return new String(lllllllllllllIIIIllIllIlIlllllII.doFinal(Base64.getDecoder().decode(lllllllllllllIIIIllIllIlIllllIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
            }
            catch (Exception lllllllllllllIIIIllIllIlIllllIll) {
                lllllllllllllIIIIllIllIlIllllIll.printStackTrace();
                return null;
            }
        }
        
        public static Library func_175864_a(final List<StructureComponent> lllllllllllllIIIIllIllIllIllIIIl, final Random lllllllllllllIIIIllIllIllIllIIII, final int lllllllllllllIIIIllIllIllIlIllll, final int lllllllllllllIIIIllIllIllIlIlllI, final int lllllllllllllIIIIllIllIllIlIIlIl, final EnumFacing lllllllllllllIIIIllIllIllIlIIlII, final int lllllllllllllIIIIllIllIllIlIlIll) {
            StructureBoundingBox lllllllllllllIIIIllIllIllIlIlIlI = StructureBoundingBox.getComponentToAddBoundingBox(lllllllllllllIIIIllIllIllIlIllll, lllllllllllllIIIIllIllIllIlIlllI, lllllllllllllIIIIllIllIllIlIIlIl, Library.lIlIllIlIIIIII[8], Library.lIlIllIlIIIIII[9], Library.lIlIllIlIIIIII[1], Library.lIlIllIlIIIIII[10], Library.lIlIllIlIIIIII[11], Library.lIlIllIlIIIIII[12], lllllllllllllIIIIllIllIllIlIIlII);
            if (!llllIIIlIlllIIl(Stronghold.canStrongholdGoDeeper(lllllllllllllIIIIllIllIllIlIlIlI) ? 1 : 0) || llllIIIlIlllIlI(StructureComponent.findIntersecting(lllllllllllllIIIIllIllIllIllIIIl, lllllllllllllIIIIllIllIllIlIlIlI))) {
                lllllllllllllIIIIllIllIllIlIlIlI = StructureBoundingBox.getComponentToAddBoundingBox(lllllllllllllIIIIllIllIllIlIllll, lllllllllllllIIIIllIllIllIlIlllI, lllllllllllllIIIIllIllIllIlIIlIl, Library.lIlIllIlIIIIII[8], Library.lIlIllIlIIIIII[9], Library.lIlIllIlIIIIII[1], Library.lIlIllIlIIIIII[10], Library.lIlIllIlIIIIII[7], Library.lIlIllIlIIIIII[12], lllllllllllllIIIIllIllIllIlIIlII);
                if (!llllIIIlIlllIIl(Stronghold.canStrongholdGoDeeper(lllllllllllllIIIIllIllIllIlIlIlI) ? 1 : 0) || llllIIIlIlllIlI(StructureComponent.findIntersecting(lllllllllllllIIIIllIllIllIllIIIl, lllllllllllllIIIIllIllIllIlIlIlI))) {
                    return null;
                }
            }
            return new Library(lllllllllllllIIIIllIllIllIlIlIll, lllllllllllllIIIIllIllIllIllIIII, lllllllllllllIIIIllIllIllIlIlIlI, lllllllllllllIIIIllIllIllIlIIlII);
        }
    }
    
    public static class RightTurn extends LeftTurn
    {
        private static final /* synthetic */ int[] lIlIllIllIIIll;
        
        private static boolean llllIIIlllllIll(final Object lllllllllllllIIIIllIlIIIllllIIll, final Object lllllllllllllIIIIllIlIIIllllIIlI) {
            return lllllllllllllIIIIllIlIIIllllIIll != lllllllllllllIIIIllIlIIIllllIIlI;
        }
        
        @Override
        public void buildComponent(final StructureComponent lllllllllllllIIIIllIlIIlIIIIlIII, final List<StructureComponent> lllllllllllllIIIIllIlIIlIIIIIIll, final Random lllllllllllllIIIIllIlIIlIIIIIllI) {
            if (llllIIIlllllIll(this.coordBaseMode, EnumFacing.NORTH) && llllIIIlllllIll(this.coordBaseMode, EnumFacing.EAST)) {
                this.getNextComponentX((Stairs2)lllllllllllllIIIIllIlIIlIIIIlIII, lllllllllllllIIIIllIlIIlIIIIIIll, lllllllllllllIIIIllIlIIlIIIIIllI, RightTurn.lIlIllIllIIIll[0], RightTurn.lIlIllIllIIIll[0]);
                "".length();
                "".length();
                if (null != null) {
                    return;
                }
            }
            else {
                this.getNextComponentZ((Stairs2)lllllllllllllIIIIllIlIIlIIIIlIII, lllllllllllllIIIIllIlIIlIIIIIIll, lllllllllllllIIIIllIlIIlIIIIIllI, RightTurn.lIlIllIllIIIll[0], RightTurn.lIlIllIllIIIll[0]);
                "".length();
            }
        }
        
        private static boolean llllIIIllllllII(final int lllllllllllllIIIIllIlIIIllllIIII) {
            return lllllllllllllIIIIllIlIIIllllIIII != 0;
        }
        
        private static void llllIIIlllllIlI() {
            (lIlIllIllIIIll = new int[4])[0] = " ".length();
            RightTurn.lIlIllIllIIIll[1] = ((0x12 ^ 0xB) & ~(0x36 ^ 0x2F));
            RightTurn.lIlIllIllIIIll[2] = (52 + 41 + 73 + 13 ^ 60 + 56 - 33 + 100);
            RightTurn.lIlIllIllIIIll[3] = "   ".length();
        }
        
        @Override
        public boolean addComponentParts(final World lllllllllllllIIIIllIlIIIlllllIII, final Random lllllllllllllIIIIllIlIIIlllllIll, final StructureBoundingBox lllllllllllllIIIIllIlIIIllllIllI) {
            if (llllIIIllllllII(this.isLiquidInStructureBoundingBox(lllllllllllllIIIIllIlIIIlllllIII, lllllllllllllIIIIllIlIIIllllIllI) ? 1 : 0)) {
                return RightTurn.lIlIllIllIIIll[1] != 0;
            }
            this.fillWithRandomizedBlocks(lllllllllllllIIIIllIlIIIlllllIII, lllllllllllllIIIIllIlIIIllllIllI, RightTurn.lIlIllIllIIIll[1], RightTurn.lIlIllIllIIIll[1], RightTurn.lIlIllIllIIIll[1], RightTurn.lIlIllIllIIIll[2], RightTurn.lIlIllIllIIIll[2], RightTurn.lIlIllIllIIIll[2], (boolean)(RightTurn.lIlIllIllIIIll[0] != 0), lllllllllllllIIIIllIlIIIlllllIll, StructureStrongholdPieces.strongholdStones);
            this.placeDoor(lllllllllllllIIIIllIlIIIlllllIII, lllllllllllllIIIIllIlIIIlllllIll, lllllllllllllIIIIllIlIIIllllIllI, this.field_143013_d, RightTurn.lIlIllIllIIIll[0], RightTurn.lIlIllIllIIIll[0], RightTurn.lIlIllIllIIIll[1]);
            if (llllIIIlllllIll(this.coordBaseMode, EnumFacing.NORTH) && llllIIIlllllIll(this.coordBaseMode, EnumFacing.EAST)) {
                this.fillWithBlocks(lllllllllllllIIIIllIlIIIlllllIII, lllllllllllllIIIIllIlIIIllllIllI, RightTurn.lIlIllIllIIIll[1], RightTurn.lIlIllIllIIIll[0], RightTurn.lIlIllIllIIIll[0], RightTurn.lIlIllIllIIIll[1], RightTurn.lIlIllIllIIIll[3], RightTurn.lIlIllIllIIIll[3], Blocks.air.getDefaultState(), Blocks.air.getDefaultState(), (boolean)(RightTurn.lIlIllIllIIIll[1] != 0));
                "".length();
                if (((0x7D ^ 0x1D ^ (0x97 ^ 0xA9)) & (209 + 140 - 348 + 213 ^ 61 + 91 - 83 + 67 ^ -" ".length())) < 0) {
                    return ("   ".length() & ("   ".length() ^ -" ".length())) != 0x0;
                }
            }
            else {
                this.fillWithBlocks(lllllllllllllIIIIllIlIIIlllllIII, lllllllllllllIIIIllIlIIIllllIllI, RightTurn.lIlIllIllIIIll[2], RightTurn.lIlIllIllIIIll[0], RightTurn.lIlIllIllIIIll[0], RightTurn.lIlIllIllIIIll[2], RightTurn.lIlIllIllIIIll[3], RightTurn.lIlIllIllIIIll[3], Blocks.air.getDefaultState(), Blocks.air.getDefaultState(), (boolean)(RightTurn.lIlIllIllIIIll[1] != 0));
            }
            return RightTurn.lIlIllIllIIIll[0] != 0;
        }
        
        static {
            llllIIIlllllIlI();
        }
    }
    
    public static class LeftTurn extends Stronghold
    {
        private static final /* synthetic */ int[] lIlllIlIIlIlIl;
        
        public static LeftTurn func_175867_a(final List<StructureComponent> llllllllllllIlllllIIIIlIllllIIIl, final Random llllllllllllIlllllIIIIlIllllIIII, final int llllllllllllIlllllIIIIlIllllIlll, final int llllllllllllIlllllIIIIlIllllIllI, final int llllllllllllIlllllIIIIlIlllIllIl, final EnumFacing llllllllllllIlllllIIIIlIllllIlII, final int llllllllllllIlllllIIIIlIllllIIll) {
            final StructureBoundingBox llllllllllllIlllllIIIIlIllllIIlI = StructureBoundingBox.getComponentToAddBoundingBox(llllllllllllIlllllIIIIlIllllIlll, llllllllllllIlllllIIIIlIllllIllI, llllllllllllIlllllIIIIlIlllIllIl, LeftTurn.lIlllIlIIlIlIl[1], LeftTurn.lIlllIlIIlIlIl[1], LeftTurn.lIlllIlIIlIlIl[2], LeftTurn.lIlllIlIIlIlIl[3], LeftTurn.lIlllIlIIlIlIl[3], LeftTurn.lIlllIlIIlIlIl[3], llllllllllllIlllllIIIIlIllllIlII);
            LeftTurn leftTurn;
            if (lIIIIIlIlIIlllIl(Stronghold.canStrongholdGoDeeper(llllllllllllIlllllIIIIlIllllIIlI) ? 1 : 0) && lIIIIIlIlIIllllI(StructureComponent.findIntersecting(llllllllllllIlllllIIIIlIllllIIIl, llllllllllllIlllllIIIIlIllllIIlI))) {
                leftTurn = new LeftTurn(llllllllllllIlllllIIIIlIllllIIll, llllllllllllIlllllIIIIlIllllIIII, llllllllllllIlllllIIIIlIllllIIlI, llllllllllllIlllllIIIIlIllllIlII);
                "".length();
                if (" ".length() == 0) {
                    return null;
                }
            }
            else {
                leftTurn = null;
            }
            return leftTurn;
        }
        
        @Override
        public boolean addComponentParts(final World llllllllllllIlllllIIIIlIlllIIIII, final Random llllllllllllIlllllIIIIlIlllIIIll, final StructureBoundingBox llllllllllllIlllllIIIIlIllIllllI) {
            if (lIIIIIlIlIIlllIl(this.isLiquidInStructureBoundingBox(llllllllllllIlllllIIIIlIlllIIIII, llllllllllllIlllllIIIIlIllIllllI) ? 1 : 0)) {
                return LeftTurn.lIlllIlIIlIlIl[2] != 0;
            }
            this.fillWithRandomizedBlocks(llllllllllllIlllllIIIIlIlllIIIII, llllllllllllIlllllIIIIlIllIllllI, LeftTurn.lIlllIlIIlIlIl[2], LeftTurn.lIlllIlIIlIlIl[2], LeftTurn.lIlllIlIIlIlIl[2], LeftTurn.lIlllIlIIlIlIl[4], LeftTurn.lIlllIlIIlIlIl[4], LeftTurn.lIlllIlIIlIlIl[4], (boolean)(LeftTurn.lIlllIlIIlIlIl[0] != 0), llllllllllllIlllllIIIIlIlllIIIll, StructureStrongholdPieces.strongholdStones);
            this.placeDoor(llllllllllllIlllllIIIIlIlllIIIII, llllllllllllIlllllIIIIlIlllIIIll, llllllllllllIlllllIIIIlIllIllllI, this.field_143013_d, LeftTurn.lIlllIlIIlIlIl[0], LeftTurn.lIlllIlIIlIlIl[0], LeftTurn.lIlllIlIIlIlIl[2]);
            if (lIIIIIlIlIIlllII(this.coordBaseMode, EnumFacing.NORTH) && lIIIIIlIlIIlllII(this.coordBaseMode, EnumFacing.EAST)) {
                this.fillWithBlocks(llllllllllllIlllllIIIIlIlllIIIII, llllllllllllIlllllIIIIlIllIllllI, LeftTurn.lIlllIlIIlIlIl[4], LeftTurn.lIlllIlIIlIlIl[0], LeftTurn.lIlllIlIIlIlIl[0], LeftTurn.lIlllIlIIlIlIl[4], LeftTurn.lIlllIlIIlIlIl[5], LeftTurn.lIlllIlIIlIlIl[5], Blocks.air.getDefaultState(), Blocks.air.getDefaultState(), (boolean)(LeftTurn.lIlllIlIIlIlIl[2] != 0));
                "".length();
                if ("   ".length() > (0x23 ^ 0x1B ^ (0xB3 ^ 0x8F))) {
                    return ((0x12 ^ 0x15 ^ "   ".length()) & (0x33 ^ 0x6A ^ (0x55 ^ 0x8) ^ -" ".length())) != 0x0;
                }
            }
            else {
                this.fillWithBlocks(llllllllllllIlllllIIIIlIlllIIIII, llllllllllllIlllllIIIIlIllIllllI, LeftTurn.lIlllIlIIlIlIl[2], LeftTurn.lIlllIlIIlIlIl[0], LeftTurn.lIlllIlIIlIlIl[0], LeftTurn.lIlllIlIIlIlIl[2], LeftTurn.lIlllIlIIlIlIl[5], LeftTurn.lIlllIlIIlIlIl[5], Blocks.air.getDefaultState(), Blocks.air.getDefaultState(), (boolean)(LeftTurn.lIlllIlIIlIlIl[2] != 0));
            }
            return LeftTurn.lIlllIlIIlIlIl[0] != 0;
        }
        
        private static boolean lIIIIIlIlIIlllII(final Object llllllllllllIlllllIIIIlIllIllIll, final Object llllllllllllIlllllIIIIlIllIllIlI) {
            return llllllllllllIlllllIIIIlIllIllIll != llllllllllllIlllllIIIIlIllIllIlI;
        }
        
        public LeftTurn() {
        }
        
        @Override
        public void buildComponent(final StructureComponent llllllllllllIlllllIIIIllIIIIlIII, final List<StructureComponent> llllllllllllIlllllIIIIllIIIIIlll, final Random llllllllllllIlllllIIIIllIIIIIIlI) {
            if (lIIIIIlIlIIlllII(this.coordBaseMode, EnumFacing.NORTH) && lIIIIIlIlIIlllII(this.coordBaseMode, EnumFacing.EAST)) {
                this.getNextComponentZ((Stairs2)llllllllllllIlllllIIIIllIIIIlIII, llllllllllllIlllllIIIIllIIIIIlll, llllllllllllIlllllIIIIllIIIIIIlI, LeftTurn.lIlllIlIIlIlIl[0], LeftTurn.lIlllIlIIlIlIl[0]);
                "".length();
                "".length();
                if ("   ".length() < 0) {
                    return;
                }
            }
            else {
                this.getNextComponentX((Stairs2)llllllllllllIlllllIIIIllIIIIlIII, llllllllllllIlllllIIIIllIIIIIlll, llllllllllllIlllllIIIIllIIIIIIlI, LeftTurn.lIlllIlIIlIlIl[0], LeftTurn.lIlllIlIIlIlIl[0]);
                "".length();
            }
        }
        
        static {
            lIIIIIlIlIIllIll();
        }
        
        private static boolean lIIIIIlIlIIlllIl(final int llllllllllllIlllllIIIIlIllIlIllI) {
            return llllllllllllIlllllIIIIlIllIlIllI != 0;
        }
        
        public LeftTurn(final int llllllllllllIlllllIIIIllIIIlIIIl, final Random llllllllllllIlllllIIIIllIIIlIIII, final StructureBoundingBox llllllllllllIlllllIIIIllIIIIllll, final EnumFacing llllllllllllIlllllIIIIllIIIlIIll) {
            super(llllllllllllIlllllIIIIllIIIlIIIl);
            this.coordBaseMode = llllllllllllIlllllIIIIllIIIlIIll;
            this.field_143013_d = this.getRandomDoor(llllllllllllIlllllIIIIllIIIlIIII);
            this.boundingBox = llllllllllllIlllllIIIIllIIIIllll;
        }
        
        private static void lIIIIIlIlIIllIll() {
            (lIlllIlIIlIlIl = new int[6])[0] = " ".length();
            LeftTurn.lIlllIlIIlIlIl[1] = -" ".length();
            LeftTurn.lIlllIlIIlIlIl[2] = ((47 + 47 - 45 + 143 ^ 61 + 5 + 59 + 29) & (0x23 ^ 0x4B ^ (0x98 ^ 0xAA) ^ -" ".length()));
            LeftTurn.lIlllIlIIlIlIl[3] = (33 + 133 - 150 + 130 ^ 91 + 78 - 116 + 98);
            LeftTurn.lIlllIlIIlIlIl[4] = (0xD5 ^ 0x8A ^ (0x9E ^ 0xC5));
            LeftTurn.lIlllIlIIlIlIl[5] = "   ".length();
        }
        
        private static boolean lIIIIIlIlIIllllI(final Object llllllllllllIlllllIIIIlIllIllIII) {
            return llllllllllllIlllllIIIIlIllIllIII == null;
        }
    }
    
    public static class StairsStraight extends Stronghold
    {
        private static final /* synthetic */ int[] llIllllIlIIIII;
        
        public StairsStraight(final int llllllllllllIllIIIlllIllIllIllIl, final Random llllllllllllIllIIIlllIllIllIllII, final StructureBoundingBox llllllllllllIllIIIlllIllIllIlIll, final EnumFacing llllllllllllIllIIIlllIllIllIIlIl) {
            super(llllllllllllIllIIIlllIllIllIllIl);
            this.coordBaseMode = llllllllllllIllIIIlllIllIllIIlIl;
            this.field_143013_d = this.getRandomDoor(llllllllllllIllIIIlllIllIllIllII);
            this.boundingBox = llllllllllllIllIIIlllIllIllIlIll;
        }
        
        private static boolean lIIllIlIlIlIIIIl(final Object llllllllllllIllIIIlllIllIIlIIlIl) {
            return llllllllllllIllIIIlllIllIIlIIlIl == null;
        }
        
        @Override
        public boolean addComponentParts(final World llllllllllllIllIIIlllIllIIlllIIl, final Random llllllllllllIllIIIlllIllIIllIIlI, final StructureBoundingBox llllllllllllIllIIIlllIllIIllIlll) {
            if (lIIllIlIlIlIIIII(this.isLiquidInStructureBoundingBox(llllllllllllIllIIIlllIllIIlllIIl, llllllllllllIllIIIlllIllIIllIlll) ? 1 : 0)) {
                return StairsStraight.llIllllIlIIIII[3] != 0;
            }
            this.fillWithRandomizedBlocks(llllllllllllIllIIIlllIllIIlllIIl, llllllllllllIllIIIlllIllIIllIlll, StairsStraight.llIllllIlIIIII[3], StairsStraight.llIllllIlIIIII[3], StairsStraight.llIllllIlIIIII[3], StairsStraight.llIllllIlIIIII[7], StairsStraight.llIllllIlIIIII[8], StairsStraight.llIllllIlIIIII[9], (boolean)(StairsStraight.llIllllIlIIIII[0] != 0), llllllllllllIllIIIlllIllIIllIIlI, StructureStrongholdPieces.strongholdStones);
            this.placeDoor(llllllllllllIllIIIlllIllIIlllIIl, llllllllllllIllIIIlllIllIIllIIlI, llllllllllllIllIIIlllIllIIllIlll, this.field_143013_d, StairsStraight.llIllllIlIIIII[0], StairsStraight.llIllllIlIIIII[9], StairsStraight.llIllllIlIIIII[3]);
            this.placeDoor(llllllllllllIllIIIlllIllIIlllIIl, llllllllllllIllIIIlllIllIIllIIlI, llllllllllllIllIIIlllIllIIllIlll, Door.OPENING, StairsStraight.llIllllIlIIIII[0], StairsStraight.llIllllIlIIIII[0], StairsStraight.llIllllIlIIIII[9]);
            final int llllllllllllIllIIIlllIllIIllIllI = this.getMetadataWithOffset(Blocks.stone_stairs, StairsStraight.llIllllIlIIIII[10]);
            int llllllllllllIllIIIlllIllIIllIlIl = StairsStraight.llIllllIlIIIII[3];
            "".length();
            if ((0x3D ^ 0xB ^ (0x71 ^ 0x43)) < 0) {
                return ((0x8A ^ 0xA2 ^ (0xF6 ^ 0x8B)) & (0x83 ^ 0xA0 ^ (0xE4 ^ 0x92) ^ -" ".length())) != 0x0;
            }
            while (!lIIllIlIlIlIIIll(llllllllllllIllIIIlllIllIIllIlIl, StairsStraight.llIllllIlIIIII[11])) {
                this.setBlockState(llllllllllllIllIIIlllIllIIlllIIl, Blocks.stone_stairs.getStateFromMeta(llllllllllllIllIIIlllIllIIllIllI), StairsStraight.llIllllIlIIIII[0], StairsStraight.llIllllIlIIIII[11] - llllllllllllIllIIIlllIllIIllIlIl, StairsStraight.llIllllIlIIIII[0] + llllllllllllIllIIIlllIllIIllIlIl, llllllllllllIllIIIlllIllIIllIlll);
                this.setBlockState(llllllllllllIllIIIlllIllIIlllIIl, Blocks.stone_stairs.getStateFromMeta(llllllllllllIllIIIlllIllIIllIllI), StairsStraight.llIllllIlIIIII[10], StairsStraight.llIllllIlIIIII[11] - llllllllllllIllIIIlllIllIIllIlIl, StairsStraight.llIllllIlIIIII[0] + llllllllllllIllIIIlllIllIIllIlIl, llllllllllllIllIIIlllIllIIllIlll);
                this.setBlockState(llllllllllllIllIIIlllIllIIlllIIl, Blocks.stone_stairs.getStateFromMeta(llllllllllllIllIIIlllIllIIllIllI), StairsStraight.llIllllIlIIIII[12], StairsStraight.llIllllIlIIIII[11] - llllllllllllIllIIIlllIllIIllIlIl, StairsStraight.llIllllIlIIIII[0] + llllllllllllIllIIIlllIllIIllIlIl, llllllllllllIllIIIlllIllIIllIlll);
                if (lIIllIlIlIlIIIlI(llllllllllllIllIIIlllIllIIllIlIl, StairsStraight.llIllllIlIIIII[4])) {
                    this.setBlockState(llllllllllllIllIIIlllIllIIlllIIl, Blocks.stonebrick.getDefaultState(), StairsStraight.llIllllIlIIIII[0], StairsStraight.llIllllIlIIIII[4] - llllllllllllIllIIIlllIllIIllIlIl, StairsStraight.llIllllIlIIIII[0] + llllllllllllIllIIIlllIllIIllIlIl, llllllllllllIllIIIlllIllIIllIlll);
                    this.setBlockState(llllllllllllIllIIIlllIllIIlllIIl, Blocks.stonebrick.getDefaultState(), StairsStraight.llIllllIlIIIII[10], StairsStraight.llIllllIlIIIII[4] - llllllllllllIllIIIlllIllIIllIlIl, StairsStraight.llIllllIlIIIII[0] + llllllllllllIllIIIlllIllIIllIlIl, llllllllllllIllIIIlllIllIIllIlll);
                    this.setBlockState(llllllllllllIllIIIlllIllIIlllIIl, Blocks.stonebrick.getDefaultState(), StairsStraight.llIllllIlIIIII[12], StairsStraight.llIllllIlIIIII[4] - llllllllllllIllIIIlllIllIIllIlIl, StairsStraight.llIllllIlIIIII[0] + llllllllllllIllIIIlllIllIIllIlIl, llllllllllllIllIIIlllIllIIllIlll);
                }
                ++llllllllllllIllIIIlllIllIIllIlIl;
            }
            return StairsStraight.llIllllIlIIIII[0] != 0;
        }
        
        static {
            lIIllIlIlIIlllll();
        }
        
        private static boolean lIIllIlIlIlIIIII(final int llllllllllllIllIIIlllIllIIlIIIll) {
            return llllllllllllIllIIIlllIllIIlIIIll != 0;
        }
        
        public static StairsStraight func_175861_a(final List<StructureComponent> llllllllllllIllIIIlllIllIlIIlIII, final Random llllllllllllIllIIIlllIllIlIIllll, final int llllllllllllIllIIIlllIllIlIIlllI, final int llllllllllllIllIIIlllIllIlIIIlIl, final int llllllllllllIllIIIlllIllIlIIIlII, final EnumFacing llllllllllllIllIIIlllIllIlIIlIll, final int llllllllllllIllIIIlllIllIlIIIIlI) {
            final StructureBoundingBox llllllllllllIllIIIlllIllIlIIlIIl = StructureBoundingBox.getComponentToAddBoundingBox(llllllllllllIllIIIlllIllIlIIlllI, llllllllllllIllIIIlllIllIlIIIlIl, llllllllllllIllIIIlllIllIlIIIlII, StairsStraight.llIllllIlIIIII[1], StairsStraight.llIllllIlIIIII[2], StairsStraight.llIllllIlIIIII[3], StairsStraight.llIllllIlIIIII[4], StairsStraight.llIllllIlIIIII[5], StairsStraight.llIllllIlIIIII[6], llllllllllllIllIIIlllIllIlIIlIll);
            StairsStraight stairsStraight;
            if (lIIllIlIlIlIIIII(Stronghold.canStrongholdGoDeeper(llllllllllllIllIIIlllIllIlIIlIIl) ? 1 : 0) && lIIllIlIlIlIIIIl(StructureComponent.findIntersecting(llllllllllllIllIIIlllIllIlIIlIII, llllllllllllIllIIIlllIllIlIIlIIl))) {
                stairsStraight = new StairsStraight(llllllllllllIllIIIlllIllIlIIIIlI, llllllllllllIllIIIlllIllIlIIllll, llllllllllllIllIIIlllIllIlIIlIIl, llllllllllllIllIIIlllIllIlIIlIll);
                "".length();
                if ("  ".length() <= -" ".length()) {
                    return null;
                }
            }
            else {
                stairsStraight = null;
            }
            return stairsStraight;
        }
        
        private static void lIIllIlIlIIlllll() {
            (llIllllIlIIIII = new int[13])[0] = " ".length();
            StairsStraight.llIllllIlIIIII[1] = -" ".length();
            StairsStraight.llIllllIlIIIII[2] = -(0x68 ^ 0x46 ^ (0x6 ^ 0x2F));
            StairsStraight.llIllllIlIIIII[3] = ((0x2B ^ 0x1) & ~(0x11 ^ 0x3B));
            StairsStraight.llIllllIlIIIII[4] = (0x28 ^ 0x2D);
            StairsStraight.llIllllIlIIIII[5] = (0x87 ^ 0x96 ^ (0x3D ^ 0x27));
            StairsStraight.llIllllIlIIIII[6] = (0x54 ^ 0x35 ^ (0x49 ^ 0x20));
            StairsStraight.llIllllIlIIIII[7] = (0xAC ^ 0xA8);
            StairsStraight.llIllllIlIIIII[8] = (36 + 60 + 72 + 13 ^ 175 + 17 - 166 + 165);
            StairsStraight.llIllllIlIIIII[9] = (0x78 ^ 0x7F);
            StairsStraight.llIllllIlIIIII[10] = "  ".length();
            StairsStraight.llIllllIlIIIII[11] = (0x89 ^ 0x8F);
            StairsStraight.llIllllIlIIIII[12] = "   ".length();
        }
        
        private static boolean lIIllIlIlIlIIIlI(final int llllllllllllIllIIIlllIllIIlIlIII, final int llllllllllllIllIIIlllIllIIlIIlll) {
            return llllllllllllIllIIIlllIllIIlIlIII < llllllllllllIllIIIlllIllIIlIIlll;
        }
        
        public StairsStraight() {
        }
        
        @Override
        public void buildComponent(final StructureComponent llllllllllllIllIIIlllIllIlIllIll, final List<StructureComponent> llllllllllllIllIIIlllIllIlIllIlI, final Random llllllllllllIllIIIlllIllIlIlllIl) {
            this.getNextComponentNormal((Stairs2)llllllllllllIllIIIlllIllIlIllIll, llllllllllllIllIIIlllIllIlIllIlI, llllllllllllIllIIIlllIllIlIlllIl, StairsStraight.llIllllIlIIIII[0], StairsStraight.llIllllIlIIIII[0]);
            "".length();
        }
        
        private static boolean lIIllIlIlIlIIIll(final int llllllllllllIllIIIlllIllIIlIllII, final int llllllllllllIllIIIlllIllIIlIlIll) {
            return llllllllllllIllIIIlllIllIIlIllII >= llllllllllllIllIIIlllIllIIlIlIll;
        }
    }
    
    public static class Prison extends Stronghold
    {
        private static final /* synthetic */ int[] lllllllIIlllI;
        
        private static boolean lIllIIIlIIIlIIl(final int lllllllllllllIlIlIlIIIIIIlIIIllI) {
            return lllllllllllllIlIlIlIIIIIIlIIIllI != 0;
        }
        
        private static void lIllIIIlIIIlIII() {
            (lllllllIIlllI = new int[13])[0] = " ".length();
            Prison.lllllllIIlllI[1] = -" ".length();
            Prison.lllllllIIlllI[2] = ((0x24 ^ 0x74) & ~(0x26 ^ 0x76));
            Prison.lllllllIIlllI[3] = (0x86 ^ 0x8F);
            Prison.lllllllIIlllI[4] = (0xA9 ^ 0xAC);
            Prison.lllllllIIlllI[5] = (6 + 129 - 105 + 118 ^ 130 + 110 - 190 + 109);
            Prison.lllllllIIlllI[6] = (0x8B ^ 0x83);
            Prison.lllllllIIlllI[7] = (50 + 10 - 20 + 101 ^ 36 + 29 - 27 + 99);
            Prison.lllllllIIlllI[8] = (0x49 ^ 0x43);
            Prison.lllllllIIlllI[9] = "   ".length();
            Prison.lllllllIIlllI[10] = (0x2E ^ 0x36 ^ (0x65 ^ 0x7A));
            Prison.lllllllIIlllI[11] = (41 + 75 - 49 + 71 ^ 1 + 94 - 10 + 55);
            Prison.lllllllIIlllI[12] = "  ".length();
        }
        
        @Override
        public boolean addComponentParts(final World lllllllllllllIlIlIlIIIIIIlIlIIII, final Random lllllllllllllIlIlIlIIIIIIlIIllll, final StructureBoundingBox lllllllllllllIlIlIlIIIIIIlIIlIlI) {
            if (lIllIIIlIIIlIIl(this.isLiquidInStructureBoundingBox(lllllllllllllIlIlIlIIIIIIlIlIIII, lllllllllllllIlIlIlIIIIIIlIIlIlI) ? 1 : 0)) {
                return Prison.lllllllIIlllI[2] != 0;
            }
            this.fillWithRandomizedBlocks(lllllllllllllIlIlIlIIIIIIlIlIIII, lllllllllllllIlIlIlIIIIIIlIIlIlI, Prison.lllllllIIlllI[2], Prison.lllllllIIlllI[2], Prison.lllllllIIlllI[2], Prison.lllllllIIlllI[6], Prison.lllllllIIlllI[7], Prison.lllllllIIlllI[8], (boolean)(Prison.lllllllIIlllI[0] != 0), lllllllllllllIlIlIlIIIIIIlIIllll, StructureStrongholdPieces.strongholdStones);
            this.placeDoor(lllllllllllllIlIlIlIIIIIIlIlIIII, lllllllllllllIlIlIlIIIIIIlIIllll, lllllllllllllIlIlIlIIIIIIlIIlIlI, this.field_143013_d, Prison.lllllllIIlllI[0], Prison.lllllllIIlllI[0], Prison.lllllllIIlllI[2]);
            this.fillWithBlocks(lllllllllllllIlIlIlIIIIIIlIlIIII, lllllllllllllIlIlIlIIIIIIlIIlIlI, Prison.lllllllIIlllI[0], Prison.lllllllIIlllI[0], Prison.lllllllIIlllI[8], Prison.lllllllIIlllI[9], Prison.lllllllIIlllI[9], Prison.lllllllIIlllI[8], Blocks.air.getDefaultState(), Blocks.air.getDefaultState(), (boolean)(Prison.lllllllIIlllI[2] != 0));
            this.fillWithRandomizedBlocks(lllllllllllllIlIlIlIIIIIIlIlIIII, lllllllllllllIlIlIlIIIIIIlIIlIlI, Prison.lllllllIIlllI[7], Prison.lllllllIIlllI[0], Prison.lllllllIIlllI[0], Prison.lllllllIIlllI[7], Prison.lllllllIIlllI[9], Prison.lllllllIIlllI[0], (boolean)(Prison.lllllllIIlllI[2] != 0), lllllllllllllIlIlIlIIIIIIlIIllll, StructureStrongholdPieces.strongholdStones);
            this.fillWithRandomizedBlocks(lllllllllllllIlIlIlIIIIIIlIlIIII, lllllllllllllIlIlIlIIIIIIlIIlIlI, Prison.lllllllIIlllI[7], Prison.lllllllIIlllI[0], Prison.lllllllIIlllI[9], Prison.lllllllIIlllI[7], Prison.lllllllIIlllI[9], Prison.lllllllIIlllI[9], (boolean)(Prison.lllllllIIlllI[2] != 0), lllllllllllllIlIlIlIIIIIIlIIllll, StructureStrongholdPieces.strongholdStones);
            this.fillWithRandomizedBlocks(lllllllllllllIlIlIlIIIIIIlIlIIII, lllllllllllllIlIlIlIIIIIIlIIlIlI, Prison.lllllllIIlllI[7], Prison.lllllllIIlllI[0], Prison.lllllllIIlllI[10], Prison.lllllllIIlllI[7], Prison.lllllllIIlllI[9], Prison.lllllllIIlllI[10], (boolean)(Prison.lllllllIIlllI[2] != 0), lllllllllllllIlIlIlIIIIIIlIIllll, StructureStrongholdPieces.strongholdStones);
            this.fillWithRandomizedBlocks(lllllllllllllIlIlIlIIIIIIlIlIIII, lllllllllllllIlIlIlIIIIIIlIIlIlI, Prison.lllllllIIlllI[7], Prison.lllllllIIlllI[0], Prison.lllllllIIlllI[3], Prison.lllllllIIlllI[7], Prison.lllllllIIlllI[9], Prison.lllllllIIlllI[3], (boolean)(Prison.lllllllIIlllI[2] != 0), lllllllllllllIlIlIlIIIIIIlIIllll, StructureStrongholdPieces.strongholdStones);
            this.fillWithBlocks(lllllllllllllIlIlIlIIIIIIlIlIIII, lllllllllllllIlIlIlIIIIIIlIIlIlI, Prison.lllllllIIlllI[7], Prison.lllllllIIlllI[0], Prison.lllllllIIlllI[7], Prison.lllllllIIlllI[7], Prison.lllllllIIlllI[9], Prison.lllllllIIlllI[11], Blocks.iron_bars.getDefaultState(), Blocks.iron_bars.getDefaultState(), (boolean)(Prison.lllllllIIlllI[2] != 0));
            this.fillWithBlocks(lllllllllllllIlIlIlIIIIIIlIlIIII, lllllllllllllIlIlIlIIIIIIlIIlIlI, Prison.lllllllIIlllI[4], Prison.lllllllIIlllI[0], Prison.lllllllIIlllI[4], Prison.lllllllIIlllI[10], Prison.lllllllIIlllI[9], Prison.lllllllIIlllI[4], Blocks.iron_bars.getDefaultState(), Blocks.iron_bars.getDefaultState(), (boolean)(Prison.lllllllIIlllI[2] != 0));
            this.setBlockState(lllllllllllllIlIlIlIIIIIIlIlIIII, Blocks.iron_bars.getDefaultState(), Prison.lllllllIIlllI[7], Prison.lllllllIIlllI[9], Prison.lllllllIIlllI[12], lllllllllllllIlIlIlIIIIIIlIIlIlI);
            this.setBlockState(lllllllllllllIlIlIlIIIIIIlIlIIII, Blocks.iron_bars.getDefaultState(), Prison.lllllllIIlllI[7], Prison.lllllllIIlllI[9], Prison.lllllllIIlllI[6], lllllllllllllIlIlIlIIIIIIlIIlIlI);
            this.setBlockState(lllllllllllllIlIlIlIIIIIIlIlIIII, Blocks.iron_door.getStateFromMeta(this.getMetadataWithOffset(Blocks.iron_door, Prison.lllllllIIlllI[9])), Prison.lllllllIIlllI[7], Prison.lllllllIIlllI[0], Prison.lllllllIIlllI[12], lllllllllllllIlIlIlIIIIIIlIIlIlI);
            this.setBlockState(lllllllllllllIlIlIlIIIIIIlIlIIII, Blocks.iron_door.getStateFromMeta(this.getMetadataWithOffset(Blocks.iron_door, Prison.lllllllIIlllI[9]) + Prison.lllllllIIlllI[6]), Prison.lllllllIIlllI[7], Prison.lllllllIIlllI[12], Prison.lllllllIIlllI[12], lllllllllllllIlIlIlIIIIIIlIIlIlI);
            this.setBlockState(lllllllllllllIlIlIlIIIIIIlIlIIII, Blocks.iron_door.getStateFromMeta(this.getMetadataWithOffset(Blocks.iron_door, Prison.lllllllIIlllI[9])), Prison.lllllllIIlllI[7], Prison.lllllllIIlllI[0], Prison.lllllllIIlllI[6], lllllllllllllIlIlIlIIIIIIlIIlIlI);
            this.setBlockState(lllllllllllllIlIlIlIIIIIIlIlIIII, Blocks.iron_door.getStateFromMeta(this.getMetadataWithOffset(Blocks.iron_door, Prison.lllllllIIlllI[9]) + Prison.lllllllIIlllI[6]), Prison.lllllllIIlllI[7], Prison.lllllllIIlllI[12], Prison.lllllllIIlllI[6], lllllllllllllIlIlIlIIIIIIlIIlIlI);
            return Prison.lllllllIIlllI[0] != 0;
        }
        
        static {
            lIllIIIlIIIlIII();
        }
        
        private static boolean lIllIIIlIIIlIlI(final Object lllllllllllllIlIlIlIIIIIIlIIlIII) {
            return lllllllllllllIlIlIlIIIIIIlIIlIII == null;
        }
        
        public Prison() {
        }
        
        public Prison(final int lllllllllllllIlIlIlIIIIIIlllllIl, final Random lllllllllllllIlIlIlIIIIIIlllllII, final StructureBoundingBox lllllllllllllIlIlIlIIIIIIllllIll, final EnumFacing lllllllllllllIlIlIlIIIIIIlllllll) {
            super(lllllllllllllIlIlIlIIIIIIlllllIl);
            this.coordBaseMode = lllllllllllllIlIlIlIIIIIIlllllll;
            this.field_143013_d = this.getRandomDoor(lllllllllllllIlIlIlIIIIIIlllllII);
            this.boundingBox = lllllllllllllIlIlIlIIIIIIllllIll;
        }
        
        public static Prison func_175860_a(final List<StructureComponent> lllllllllllllIlIlIlIIIIIIlIlllIl, final Random lllllllllllllIlIlIlIIIIIIlIlllII, final int lllllllllllllIlIlIlIIIIIIllIIIll, final int lllllllllllllIlIlIlIIIIIIllIIIlI, final int lllllllllllllIlIlIlIIIIIIllIIIIl, final EnumFacing lllllllllllllIlIlIlIIIIIIlIllIII, final int lllllllllllllIlIlIlIIIIIIlIlllll) {
            final StructureBoundingBox lllllllllllllIlIlIlIIIIIIlIllllI = StructureBoundingBox.getComponentToAddBoundingBox(lllllllllllllIlIlIlIIIIIIllIIIll, lllllllllllllIlIlIlIIIIIIllIIIlI, lllllllllllllIlIlIlIIIIIIllIIIIl, Prison.lllllllIIlllI[1], Prison.lllllllIIlllI[1], Prison.lllllllIIlllI[2], Prison.lllllllIIlllI[3], Prison.lllllllIIlllI[4], Prison.lllllllIIlllI[5], lllllllllllllIlIlIlIIIIIIlIllIII);
            Prison prison;
            if (lIllIIIlIIIlIIl(Stronghold.canStrongholdGoDeeper(lllllllllllllIlIlIlIIIIIIlIllllI) ? 1 : 0) && lIllIIIlIIIlIlI(StructureComponent.findIntersecting(lllllllllllllIlIlIlIIIIIIlIlllIl, lllllllllllllIlIlIlIIIIIIlIllllI))) {
                prison = new Prison(lllllllllllllIlIlIlIIIIIIlIlllll, lllllllllllllIlIlIlIIIIIIlIlllII, lllllllllllllIlIlIlIIIIIIlIllllI, lllllllllllllIlIlIlIIIIIIlIllIII);
                "".length();
                if (-"  ".length() > 0) {
                    return null;
                }
            }
            else {
                prison = null;
            }
            return prison;
        }
        
        @Override
        public void buildComponent(final StructureComponent lllllllllllllIlIlIlIIIIIIlllIlII, final List<StructureComponent> lllllllllllllIlIlIlIIIIIIlllIIll, final Random lllllllllllllIlIlIlIIIIIIlllIIlI) {
            this.getNextComponentNormal((Stairs2)lllllllllllllIlIlIlIIIIIIlllIlII, lllllllllllllIlIlIlIIIIIIlllIIll, lllllllllllllIlIlIlIIIIIIlllIIlI, Prison.lllllllIIlllI[0], Prison.lllllllIIlllI[0]);
            "".length();
        }
    }
}
