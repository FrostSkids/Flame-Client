// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.world.gen.structure;

import java.util.Iterator;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.tileentity.TileEntityMobSpawner;
import net.minecraft.block.Block;
import com.google.common.collect.Lists;
import net.minecraft.item.Item;
import net.minecraft.init.Items;
import net.minecraft.util.WeightedRandomChestContent;
import net.minecraft.util.Vec3i;
import net.minecraft.util.BlockPos;
import net.minecraft.init.Blocks;
import net.minecraft.world.World;
import net.minecraft.nbt.NBTTagCompound;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import net.minecraft.util.EnumFacing;
import java.util.Random;
import java.util.List;

public class StructureNetherBridgePieces
{
    private static final /* synthetic */ int[] lIlIIIIllIlllI;
    private static final /* synthetic */ PieceWeight[] secondaryComponents;
    private static final /* synthetic */ String[] lIlIIIIllIllIl;
    private static final /* synthetic */ PieceWeight[] primaryComponents;
    
    public static void registerNetherFortressPieces() {
        MapGenStructureIO.registerStructureComponent(Crossing3.class, StructureNetherBridgePieces.lIlIIIIllIllIl[StructureNetherBridgePieces.lIlIIIIllIlllI[1]]);
        MapGenStructureIO.registerStructureComponent(End.class, StructureNetherBridgePieces.lIlIIIIllIllIl[StructureNetherBridgePieces.lIlIIIIllIlllI[3]]);
        MapGenStructureIO.registerStructureComponent(Straight.class, StructureNetherBridgePieces.lIlIIIIllIllIl[StructureNetherBridgePieces.lIlIIIIllIlllI[6]]);
        MapGenStructureIO.registerStructureComponent(Corridor3.class, StructureNetherBridgePieces.lIlIIIIllIllIl[StructureNetherBridgePieces.lIlIIIIllIlllI[7]]);
        MapGenStructureIO.registerStructureComponent(Corridor4.class, StructureNetherBridgePieces.lIlIIIIllIllIl[StructureNetherBridgePieces.lIlIIIIllIlllI[5]]);
        MapGenStructureIO.registerStructureComponent(Entrance.class, StructureNetherBridgePieces.lIlIIIIllIllIl[StructureNetherBridgePieces.lIlIIIIllIlllI[8]]);
        MapGenStructureIO.registerStructureComponent(Crossing2.class, StructureNetherBridgePieces.lIlIIIIllIllIl[StructureNetherBridgePieces.lIlIIIIllIlllI[0]]);
        MapGenStructureIO.registerStructureComponent(Corridor.class, StructureNetherBridgePieces.lIlIIIIllIllIl[StructureNetherBridgePieces.lIlIIIIllIlllI[9]]);
        MapGenStructureIO.registerStructureComponent(Corridor5.class, StructureNetherBridgePieces.lIlIIIIllIllIl[StructureNetherBridgePieces.lIlIIIIllIlllI[12]]);
        MapGenStructureIO.registerStructureComponent(Corridor2.class, StructureNetherBridgePieces.lIlIIIIllIllIl[StructureNetherBridgePieces.lIlIIIIllIlllI[13]]);
        MapGenStructureIO.registerStructureComponent(NetherStalkRoom.class, StructureNetherBridgePieces.lIlIIIIllIllIl[StructureNetherBridgePieces.lIlIIIIllIlllI[4]]);
        MapGenStructureIO.registerStructureComponent(Throne.class, StructureNetherBridgePieces.lIlIIIIllIllIl[StructureNetherBridgePieces.lIlIIIIllIlllI[14]]);
        MapGenStructureIO.registerStructureComponent(Crossing.class, StructureNetherBridgePieces.lIlIIIIllIllIl[StructureNetherBridgePieces.lIlIIIIllIlllI[15]]);
        MapGenStructureIO.registerStructureComponent(Stairs.class, StructureNetherBridgePieces.lIlIIIIllIllIl[StructureNetherBridgePieces.lIlIIIIllIlllI[16]]);
        MapGenStructureIO.registerStructureComponent(Start.class, StructureNetherBridgePieces.lIlIIIIllIllIl[StructureNetherBridgePieces.lIlIIIIllIlllI[17]]);
    }
    
    private static void lllIIIIlllllIII() {
        (lIlIIIIllIlllI = new int[18])[0] = (0x50 ^ 0x0 ^ (0x58 ^ 0xE));
        StructureNetherBridgePieces.lIlIIIIllIlllI[1] = ((0xAF ^ 0x9B) & ~(0x59 ^ 0x6D));
        StructureNetherBridgePieces.lIlIIIIllIlllI[2] = (0xD0 ^ 0x93 ^ (0x58 ^ 0x5));
        StructureNetherBridgePieces.lIlIIIIllIlllI[3] = " ".length();
        StructureNetherBridgePieces.lIlIIIIllIlllI[4] = (0x4F ^ 0x45);
        StructureNetherBridgePieces.lIlIIIIllIlllI[5] = (0x6B ^ 0x6F);
        StructureNetherBridgePieces.lIlIIIIllIlllI[6] = "  ".length();
        StructureNetherBridgePieces.lIlIIIIllIlllI[7] = "   ".length();
        StructureNetherBridgePieces.lIlIIIIllIlllI[8] = (0x68 ^ 0x6D);
        StructureNetherBridgePieces.lIlIIIIllIlllI[9] = (128 + 26 - 97 + 113 ^ 77 + 72 - 135 + 159);
        StructureNetherBridgePieces.lIlIIIIllIlllI[10] = (0xB9 ^ 0x95 ^ (0x5D ^ 0x68));
        StructureNetherBridgePieces.lIlIIIIllIlllI[11] = (0xBA ^ 0xB5);
        StructureNetherBridgePieces.lIlIIIIllIlllI[12] = (0x3F ^ 0x37);
        StructureNetherBridgePieces.lIlIIIIllIlllI[13] = (0x8E ^ 0x87);
        StructureNetherBridgePieces.lIlIIIIllIlllI[14] = (0xB9 ^ 0x9E ^ (0x14 ^ 0x38));
        StructureNetherBridgePieces.lIlIIIIllIlllI[15] = (109 + 170 - 268 + 160 ^ 96 + 68 - 95 + 98);
        StructureNetherBridgePieces.lIlIIIIllIlllI[16] = (0xF4 ^ 0x9B ^ (0x3E ^ 0x5C));
        StructureNetherBridgePieces.lIlIIIIllIlllI[17] = (0xB6 ^ 0xB8);
    }
    
    private static Piece func_175887_b(final PieceWeight lllllllllllllIIlIIIIIlIIIllIlIII, final List<StructureComponent> lllllllllllllIIlIIIIIlIIIlIlllIl, final Random lllllllllllllIIlIIIIIlIIIllIIllI, final int lllllllllllllIIlIIIIIlIIIlIllIll, final int lllllllllllllIIlIIIIIlIIIllIIlII, final int lllllllllllllIIlIIIIIlIIIllIIIll, final EnumFacing lllllllllllllIIlIIIIIlIIIlIllIII, final int lllllllllllllIIlIIIIIlIIIlIlIlll) {
        final Class<? extends Piece> lllllllllllllIIlIIIIIlIIIllIIIII = lllllllllllllIIlIIIIIlIIIllIlIII.weightClass;
        Piece lllllllllllllIIlIIIIIlIIIlIlllll = null;
        if (lllIIIIlllllIIl(lllllllllllllIIlIIIIIlIIIllIIIII, Straight.class)) {
            lllllllllllllIIlIIIIIlIIIlIlllll = Straight.func_175882_a(lllllllllllllIIlIIIIIlIIIlIlllIl, lllllllllllllIIlIIIIIlIIIllIIllI, lllllllllllllIIlIIIIIlIIIlIllIll, lllllllllllllIIlIIIIIlIIIllIIlII, lllllllllllllIIlIIIIIlIIIllIIIll, lllllllllllllIIlIIIIIlIIIlIllIII, lllllllllllllIIlIIIIIlIIIlIlIlll);
            "".length();
            if (" ".length() > "   ".length()) {
                return null;
            }
        }
        else if (lllIIIIlllllIIl(lllllllllllllIIlIIIIIlIIIllIIIII, Crossing3.class)) {
            lllllllllllllIIlIIIIIlIIIlIlllll = Crossing3.func_175885_a(lllllllllllllIIlIIIIIlIIIlIlllIl, lllllllllllllIIlIIIIIlIIIllIIllI, lllllllllllllIIlIIIIIlIIIlIllIll, lllllllllllllIIlIIIIIlIIIllIIlII, lllllllllllllIIlIIIIIlIIIllIIIll, lllllllllllllIIlIIIIIlIIIlIllIII, lllllllllllllIIlIIIIIlIIIlIlIlll);
            "".length();
            if ((0x13 ^ 0x2F ^ (0x54 ^ 0x6C)) < " ".length()) {
                return null;
            }
        }
        else if (lllIIIIlllllIIl(lllllllllllllIIlIIIIIlIIIllIIIII, Crossing.class)) {
            lllllllllllllIIlIIIIIlIIIlIlllll = Crossing.func_175873_a(lllllllllllllIIlIIIIIlIIIlIlllIl, lllllllllllllIIlIIIIIlIIIllIIllI, lllllllllllllIIlIIIIIlIIIlIllIll, lllllllllllllIIlIIIIIlIIIllIIlII, lllllllllllllIIlIIIIIlIIIllIIIll, lllllllllllllIIlIIIIIlIIIlIllIII, lllllllllllllIIlIIIIIlIIIlIlIlll);
            "".length();
            if ("  ".length() < 0) {
                return null;
            }
        }
        else if (lllIIIIlllllIIl(lllllllllllllIIlIIIIIlIIIllIIIII, Stairs.class)) {
            lllllllllllllIIlIIIIIlIIIlIlllll = Stairs.func_175872_a(lllllllllllllIIlIIIIIlIIIlIlllIl, lllllllllllllIIlIIIIIlIIIllIIllI, lllllllllllllIIlIIIIIlIIIlIllIll, lllllllllllllIIlIIIIIlIIIllIIlII, lllllllllllllIIlIIIIIlIIIllIIIll, lllllllllllllIIlIIIIIlIIIlIlIlll, lllllllllllllIIlIIIIIlIIIlIllIII);
            "".length();
            if ((0x20 ^ 0x24) <= 0) {
                return null;
            }
        }
        else if (lllIIIIlllllIIl(lllllllllllllIIlIIIIIlIIIllIIIII, Throne.class)) {
            lllllllllllllIIlIIIIIlIIIlIlllll = Throne.func_175874_a(lllllllllllllIIlIIIIIlIIIlIlllIl, lllllllllllllIIlIIIIIlIIIllIIllI, lllllllllllllIIlIIIIIlIIIlIllIll, lllllllllllllIIlIIIIIlIIIllIIlII, lllllllllllllIIlIIIIIlIIIllIIIll, lllllllllllllIIlIIIIIlIIIlIlIlll, lllllllllllllIIlIIIIIlIIIlIllIII);
            "".length();
            if ("  ".length() >= "   ".length()) {
                return null;
            }
        }
        else if (lllIIIIlllllIIl(lllllllllllllIIlIIIIIlIIIllIIIII, Entrance.class)) {
            lllllllllllllIIlIIIIIlIIIlIlllll = Entrance.func_175881_a(lllllllllllllIIlIIIIIlIIIlIlllIl, lllllllllllllIIlIIIIIlIIIllIIllI, lllllllllllllIIlIIIIIlIIIlIllIll, lllllllllllllIIlIIIIIlIIIllIIlII, lllllllllllllIIlIIIIIlIIIllIIIll, lllllllllllllIIlIIIIIlIIIlIllIII, lllllllllllllIIlIIIIIlIIIlIlIlll);
            "".length();
            if (null != null) {
                return null;
            }
        }
        else if (lllIIIIlllllIIl(lllllllllllllIIlIIIIIlIIIllIIIII, Corridor5.class)) {
            lllllllllllllIIlIIIIIlIIIlIlllll = Corridor5.func_175877_a(lllllllllllllIIlIIIIIlIIIlIlllIl, lllllllllllllIIlIIIIIlIIIllIIllI, lllllllllllllIIlIIIIIlIIIlIllIll, lllllllllllllIIlIIIIIlIIIllIIlII, lllllllllllllIIlIIIIIlIIIllIIIll, lllllllllllllIIlIIIIIlIIIlIllIII, lllllllllllllIIlIIIIIlIIIlIlIlll);
            "".length();
            if ((0xF ^ 0xB) < 0) {
                return null;
            }
        }
        else if (lllIIIIlllllIIl(lllllllllllllIIlIIIIIlIIIllIIIII, Corridor2.class)) {
            lllllllllllllIIlIIIIIlIIIlIlllll = Corridor2.func_175876_a(lllllllllllllIIlIIIIIlIIIlIlllIl, lllllllllllllIIlIIIIIlIIIllIIllI, lllllllllllllIIlIIIIIlIIIlIllIll, lllllllllllllIIlIIIIIlIIIllIIlII, lllllllllllllIIlIIIIIlIIIllIIIll, lllllllllllllIIlIIIIIlIIIlIllIII, lllllllllllllIIlIIIIIlIIIlIlIlll);
            "".length();
            if (-"   ".length() > 0) {
                return null;
            }
        }
        else if (lllIIIIlllllIIl(lllllllllllllIIlIIIIIlIIIllIIIII, Corridor.class)) {
            lllllllllllllIIlIIIIIlIIIlIlllll = Corridor.func_175879_a(lllllllllllllIIlIIIIIlIIIlIlllIl, lllllllllllllIIlIIIIIlIIIllIIllI, lllllllllllllIIlIIIIIlIIIlIllIll, lllllllllllllIIlIIIIIlIIIllIIlII, lllllllllllllIIlIIIIIlIIIllIIIll, lllllllllllllIIlIIIIIlIIIlIllIII, lllllllllllllIIlIIIIIlIIIlIlIlll);
            "".length();
            if (((38 + 123 - 145 + 119 ^ 110 + 62 - 44 + 32) & (39 + 35 + 14 + 45 ^ 143 + 113 - 236 + 142 ^ -" ".length())) > (0xF7 ^ 0xC6 ^ (0x9E ^ 0xAB))) {
                return null;
            }
        }
        else if (lllIIIIlllllIIl(lllllllllllllIIlIIIIIlIIIllIIIII, Corridor3.class)) {
            lllllllllllllIIlIIIIIlIIIlIlllll = Corridor3.func_175883_a(lllllllllllllIIlIIIIIlIIIlIlllIl, lllllllllllllIIlIIIIIlIIIllIIllI, lllllllllllllIIlIIIIIlIIIlIllIll, lllllllllllllIIlIIIIIlIIIllIIlII, lllllllllllllIIlIIIIIlIIIllIIIll, lllllllllllllIIlIIIIIlIIIlIllIII, lllllllllllllIIlIIIIIlIIIlIlIlll);
            "".length();
            if (null != null) {
                return null;
            }
        }
        else if (lllIIIIlllllIIl(lllllllllllllIIlIIIIIlIIIllIIIII, Corridor4.class)) {
            lllllllllllllIIlIIIIIlIIIlIlllll = Corridor4.func_175880_a(lllllllllllllIIlIIIIIlIIIlIlllIl, lllllllllllllIIlIIIIIlIIIllIIllI, lllllllllllllIIlIIIIIlIIIlIllIll, lllllllllllllIIlIIIIIlIIIllIIlII, lllllllllllllIIlIIIIIlIIIllIIIll, lllllllllllllIIlIIIIIlIIIlIllIII, lllllllllllllIIlIIIIIlIIIlIlIlll);
            "".length();
            if (-"   ".length() >= 0) {
                return null;
            }
        }
        else if (lllIIIIlllllIIl(lllllllllllllIIlIIIIIlIIIllIIIII, Crossing2.class)) {
            lllllllllllllIIlIIIIIlIIIlIlllll = Crossing2.func_175878_a(lllllllllllllIIlIIIIIlIIIlIlllIl, lllllllllllllIIlIIIIIlIIIllIIllI, lllllllllllllIIlIIIIIlIIIlIllIll, lllllllllllllIIlIIIIIlIIIllIIlII, lllllllllllllIIlIIIIIlIIIllIIIll, lllllllllllllIIlIIIIIlIIIlIllIII, lllllllllllllIIlIIIIIlIIIlIlIlll);
            "".length();
            if (" ".length() > "   ".length()) {
                return null;
            }
        }
        else if (lllIIIIlllllIIl(lllllllllllllIIlIIIIIlIIIllIIIII, NetherStalkRoom.class)) {
            lllllllllllllIIlIIIIIlIIIlIlllll = NetherStalkRoom.func_175875_a(lllllllllllllIIlIIIIIlIIIlIlllIl, lllllllllllllIIlIIIIIlIIIllIIllI, lllllllllllllIIlIIIIIlIIIlIllIll, lllllllllllllIIlIIIIIlIIIllIIlII, lllllllllllllIIlIIIIIlIIIllIIIll, lllllllllllllIIlIIIIIlIIIlIllIII, lllllllllllllIIlIIIIIlIIIlIlIlll);
        }
        return lllllllllllllIIlIIIIIlIIIlIlllll;
    }
    
    private static boolean lllIIIIlllllIlI(final int lllllllllllllIIlIIIIIlIIIIIlIIII, final int lllllllllllllIIlIIIIIlIIIIIIllll) {
        return lllllllllllllIIlIIIIIlIIIIIlIIII < lllllllllllllIIlIIIIIlIIIIIIllll;
    }
    
    private static String lllIIIIllllIlIl(final String lllllllllllllIIlIIIIIlIIIIlIIIll, final String lllllllllllllIIlIIIIIlIIIIlIIlII) {
        try {
            final SecretKeySpec lllllllllllllIIlIIIIIlIIIIlIlIII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIIlIIIIIlIIIIlIIlII.getBytes(StandardCharsets.UTF_8)), StructureNetherBridgePieces.lIlIIIIllIlllI[12]), "DES");
            final Cipher lllllllllllllIIlIIIIIlIIIIlIIlll = Cipher.getInstance("DES");
            lllllllllllllIIlIIIIIlIIIIlIIlll.init(StructureNetherBridgePieces.lIlIIIIllIlllI[6], lllllllllllllIIlIIIIIlIIIIlIlIII);
            return new String(lllllllllllllIIlIIIIIlIIIIlIIlll.doFinal(Base64.getDecoder().decode(lllllllllllllIIlIIIIIlIIIIlIIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIlIIIIIlIIIIlIIllI) {
            lllllllllllllIIlIIIIIlIIIIlIIllI.printStackTrace();
            return null;
        }
    }
    
    private static String lllIIIIllllIlII(final String lllllllllllllIIlIIIIIlIIIIIllIII, final String lllllllllllllIIlIIIIIlIIIIIlIlIl) {
        try {
            final SecretKeySpec lllllllllllllIIlIIIIIlIIIIIllIll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIIlIIIIIlIIIIIlIlIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lllllllllllllIIlIIIIIlIIIIIllIlI = Cipher.getInstance("Blowfish");
            lllllllllllllIIlIIIIIlIIIIIllIlI.init(StructureNetherBridgePieces.lIlIIIIllIlllI[6], lllllllllllllIIlIIIIIlIIIIIllIll);
            return new String(lllllllllllllIIlIIIIIlIIIIIllIlI.doFinal(Base64.getDecoder().decode(lllllllllllllIIlIIIIIlIIIIIllIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIlIIIIIlIIIIIllIIl) {
            lllllllllllllIIlIIIIIlIIIIIllIIl.printStackTrace();
            return null;
        }
    }
    
    private static void lllIIIIllllIlll() {
        (lIlIIIIllIllIl = new String[StructureNetherBridgePieces.lIlIIIIllIlllI[11]])[StructureNetherBridgePieces.lIlIIIIllIlllI[1]] = lllIIIIllllIIll("JgcXMQI=", "hbUrp");
        StructureNetherBridgePieces.lIlIIIIllIllIl[StructureNetherBridgePieces.lIlIIIIllIlllI[3]] = lllIIIIllllIIll("PQ4pPyA=", "skkzf");
        StructureNetherBridgePieces.lIlIIIIllIllIl[StructureNetherBridgePieces.lIlIIIIllIlllI[6]] = lllIIIIllllIlII("rzVpTGOL5/Y=", "RCcNm");
        StructureNetherBridgePieces.lIlIIIIllIllIl[StructureNetherBridgePieces.lIlIIIIllIlllI[7]] = lllIIIIllllIlIl("7mfbhojw97s=", "Idfqk");
        StructureNetherBridgePieces.lIlIIIIllIllIl[StructureNetherBridgePieces.lIlIIIIllIlllI[5]] = lllIIIIllllIlIl("XWG+AbDDWJA=", "WBNUt");
        StructureNetherBridgePieces.lIlIIIIllIllIl[StructureNetherBridgePieces.lIlIIIIllIlllI[8]] = lllIIIIllllIlII("wR2BA6rZgV8=", "hGhTI");
        StructureNetherBridgePieces.lIlIIIIllIllIl[StructureNetherBridgePieces.lIlIIIIllIlllI[0]] = lllIIIIllllIlII("r9NMysiP454=", "onqeY");
        StructureNetherBridgePieces.lIlIIIIllIllIl[StructureNetherBridgePieces.lIlIIIIllIlllI[9]] = lllIIIIllllIlII("uwYsIy8a4Ic=", "BpOqA");
        StructureNetherBridgePieces.lIlIIIIllIllIl[StructureNetherBridgePieces.lIlIIIIllIlllI[12]] = lllIIIIllllIlIl("OIGQb2g9hpY=", "ldPkX");
        StructureNetherBridgePieces.lIlIIIIllIllIl[StructureNetherBridgePieces.lIlIIIIllIlllI[13]] = lllIIIIllllIIll("LzQ+KDE1", "aQmkc");
        StructureNetherBridgePieces.lIlIIIIllIllIl[StructureNetherBridgePieces.lIlIIIIllIlllI[4]] = lllIIIIllllIlII("u1I7jiS/6rA=", "iyRfo");
        StructureNetherBridgePieces.lIlIIIIllIllIl[StructureNetherBridgePieces.lIlIIIIllIlllI[14]] = lllIIIIllllIIll("NDYdPg==", "zSPjw");
        StructureNetherBridgePieces.lIlIIIIllIllIl[StructureNetherBridgePieces.lIlIIIIllIlllI[15]] = lllIIIIllllIlIl("KAQ5KWnXFzE=", "wGpSj");
        StructureNetherBridgePieces.lIlIIIIllIllIl[StructureNetherBridgePieces.lIlIIIIllIlllI[16]] = lllIIIIllllIIll("ICgqGA==", "nMyJY");
        StructureNetherBridgePieces.lIlIIIIllIllIl[StructureNetherBridgePieces.lIlIIIIllIlllI[17]] = lllIIIIllllIlIl("vzy8A9+68f8=", "bJNZc");
    }
    
    private static String lllIIIIllllIIll(String lllllllllllllIIlIIIIIlIIIIllIlIl, final String lllllllllllllIIlIIIIIlIIIIllIlII) {
        lllllllllllllIIlIIIIIlIIIIllIlIl = new String(Base64.getDecoder().decode(lllllllllllllIIlIIIIIlIIIIllIlIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIIlIIIIIlIIIIlllIII = new StringBuilder();
        final char[] lllllllllllllIIlIIIIIlIIIIllIlll = lllllllllllllIIlIIIIIlIIIIllIlII.toCharArray();
        int lllllllllllllIIlIIIIIlIIIIllIllI = StructureNetherBridgePieces.lIlIIIIllIlllI[1];
        final double lllllllllllllIIlIIIIIlIIIIllIIII = (Object)lllllllllllllIIlIIIIIlIIIIllIlIl.toCharArray();
        final String lllllllllllllIIlIIIIIlIIIIlIllll = (String)lllllllllllllIIlIIIIIlIIIIllIIII.length;
        Exception lllllllllllllIIlIIIIIlIIIIlIlllI = (Exception)StructureNetherBridgePieces.lIlIIIIllIlllI[1];
        while (lllIIIIlllllIlI((int)lllllllllllllIIlIIIIIlIIIIlIlllI, (int)lllllllllllllIIlIIIIIlIIIIlIllll)) {
            final char lllllllllllllIIlIIIIIlIIIIlllIll = lllllllllllllIIlIIIIIlIIIIllIIII[lllllllllllllIIlIIIIIlIIIIlIlllI];
            lllllllllllllIIlIIIIIlIIIIlllIII.append((char)(lllllllllllllIIlIIIIIlIIIIlllIll ^ lllllllllllllIIlIIIIIlIIIIllIlll[lllllllllllllIIlIIIIIlIIIIllIllI % lllllllllllllIIlIIIIIlIIIIllIlll.length]));
            "".length();
            ++lllllllllllllIIlIIIIIlIIIIllIllI;
            ++lllllllllllllIIlIIIIIlIIIIlIlllI;
            "".length();
            if (-" ".length() > " ".length()) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIIlIIIIIlIIIIlllIII);
    }
    
    static {
        lllIIIIlllllIII();
        lllIIIIllllIlll();
        final PieceWeight[] primaryComponents2 = new PieceWeight[StructureNetherBridgePieces.lIlIIIIllIlllI[0]];
        primaryComponents2[StructureNetherBridgePieces.lIlIIIIllIlllI[1]] = new PieceWeight(Straight.class, StructureNetherBridgePieces.lIlIIIIllIlllI[2], StructureNetherBridgePieces.lIlIIIIllIlllI[1], (boolean)(StructureNetherBridgePieces.lIlIIIIllIlllI[3] != 0));
        primaryComponents2[StructureNetherBridgePieces.lIlIIIIllIlllI[3]] = new PieceWeight(Crossing3.class, StructureNetherBridgePieces.lIlIIIIllIlllI[4], StructureNetherBridgePieces.lIlIIIIllIlllI[5]);
        primaryComponents2[StructureNetherBridgePieces.lIlIIIIllIlllI[6]] = new PieceWeight(Crossing.class, StructureNetherBridgePieces.lIlIIIIllIlllI[4], StructureNetherBridgePieces.lIlIIIIllIlllI[5]);
        primaryComponents2[StructureNetherBridgePieces.lIlIIIIllIlllI[7]] = new PieceWeight(Stairs.class, StructureNetherBridgePieces.lIlIIIIllIlllI[4], StructureNetherBridgePieces.lIlIIIIllIlllI[7]);
        primaryComponents2[StructureNetherBridgePieces.lIlIIIIllIlllI[5]] = new PieceWeight(Throne.class, StructureNetherBridgePieces.lIlIIIIllIlllI[8], StructureNetherBridgePieces.lIlIIIIllIlllI[6]);
        primaryComponents2[StructureNetherBridgePieces.lIlIIIIllIlllI[8]] = new PieceWeight(Entrance.class, StructureNetherBridgePieces.lIlIIIIllIlllI[8], StructureNetherBridgePieces.lIlIIIIllIlllI[3]);
        primaryComponents = primaryComponents2;
        final PieceWeight[] secondaryComponents2 = new PieceWeight[StructureNetherBridgePieces.lIlIIIIllIlllI[9]];
        secondaryComponents2[StructureNetherBridgePieces.lIlIIIIllIlllI[1]] = new PieceWeight(Corridor5.class, StructureNetherBridgePieces.lIlIIIIllIlllI[10], StructureNetherBridgePieces.lIlIIIIllIlllI[1], (boolean)(StructureNetherBridgePieces.lIlIIIIllIlllI[3] != 0));
        secondaryComponents2[StructureNetherBridgePieces.lIlIIIIllIlllI[3]] = new PieceWeight(Crossing2.class, StructureNetherBridgePieces.lIlIIIIllIlllI[11], StructureNetherBridgePieces.lIlIIIIllIlllI[8]);
        secondaryComponents2[StructureNetherBridgePieces.lIlIIIIllIlllI[6]] = new PieceWeight(Corridor2.class, StructureNetherBridgePieces.lIlIIIIllIlllI[8], StructureNetherBridgePieces.lIlIIIIllIlllI[4]);
        secondaryComponents2[StructureNetherBridgePieces.lIlIIIIllIlllI[7]] = new PieceWeight(Corridor.class, StructureNetherBridgePieces.lIlIIIIllIlllI[8], StructureNetherBridgePieces.lIlIIIIllIlllI[4]);
        secondaryComponents2[StructureNetherBridgePieces.lIlIIIIllIlllI[5]] = new PieceWeight(Corridor3.class, StructureNetherBridgePieces.lIlIIIIllIlllI[4], StructureNetherBridgePieces.lIlIIIIllIlllI[7], (boolean)(StructureNetherBridgePieces.lIlIIIIllIlllI[3] != 0));
        secondaryComponents2[StructureNetherBridgePieces.lIlIIIIllIlllI[8]] = new PieceWeight(Corridor4.class, StructureNetherBridgePieces.lIlIIIIllIlllI[9], StructureNetherBridgePieces.lIlIIIIllIlllI[6]);
        secondaryComponents2[StructureNetherBridgePieces.lIlIIIIllIlllI[0]] = new PieceWeight(NetherStalkRoom.class, StructureNetherBridgePieces.lIlIIIIllIlllI[8], StructureNetherBridgePieces.lIlIIIIllIlllI[6]);
        secondaryComponents = secondaryComponents2;
    }
    
    private static boolean lllIIIIlllllIIl(final Object lllllllllllllIIlIIIIIlIIIIIIllII, final Object lllllllllllllIIlIIIIIlIIIIIIlIll) {
        return lllllllllllllIIlIIIIIlIIIIIIllII == lllllllllllllIIlIIIIIlIIIIIIlIll;
    }
    
    public static class Corridor extends Piece
    {
        private static final /* synthetic */ String[] lllIIIIllIIIII;
        private static final /* synthetic */ int[] lllIIIIllIIlII;
        private /* synthetic */ boolean field_111021_b;
        
        public static Corridor func_175879_a(final List<StructureComponent> llllllllllllIllIIIIlIlIIIIlIlIIl, final Random llllllllllllIllIIIIlIlIIIIlIlIII, final int llllllllllllIllIIIIlIlIIIIlIIlll, final int llllllllllllIllIIIIlIlIIIIlIIllI, final int llllllllllllIllIIIIlIlIIIIlIllIl, final EnumFacing llllllllllllIllIIIIlIlIIIIlIIlII, final int llllllllllllIllIIIIlIlIIIIlIIIll) {
            final StructureBoundingBox llllllllllllIllIIIIlIlIIIIlIlIlI = StructureBoundingBox.getComponentToAddBoundingBox(llllllllllllIllIIIIlIlIIIIlIIlll, llllllllllllIllIIIIlIlIIIIlIIllI, llllllllllllIllIIIIlIlIIIIlIllIl, Corridor.lllIIIIllIIlII[3], Corridor.lllIIIIllIIlII[2], Corridor.lllIIIIllIIlII[2], Corridor.lllIIIIllIIlII[4], Corridor.lllIIIIllIIlII[5], Corridor.lllIIIIllIIlII[4], llllllllllllIllIIIIlIlIIIIlIIlII);
            Corridor corridor;
            if (lIIlllIIllIIlIII(Piece.isAboveGround(llllllllllllIllIIIIlIlIIIIlIlIlI) ? 1 : 0) && lIIlllIIllIIlIIl(StructureComponent.findIntersecting(llllllllllllIllIIIIlIlIIIIlIlIIl, llllllllllllIllIIIIlIlIIIIlIlIlI))) {
                corridor = new Corridor(llllllllllllIllIIIIlIlIIIIlIIIll, llllllllllllIllIIIIlIlIIIIlIlIII, llllllllllllIllIIIIlIlIIIIlIlIlI, llllllllllllIllIIIIlIlIIIIlIIlII);
                "".length();
                if ("   ".length() <= " ".length()) {
                    return null;
                }
            }
            else {
                corridor = null;
            }
            return corridor;
        }
        
        public Corridor(final int llllllllllllIllIIIIlIlIIIlIllIlI, final Random llllllllllllIllIIIIlIlIIIlIllIIl, final StructureBoundingBox llllllllllllIllIIIIlIlIIIlIllIII, final EnumFacing llllllllllllIllIIIIlIlIIIlIlIIlI) {
            super(llllllllllllIllIIIIlIlIIIlIllIlI);
            this.coordBaseMode = llllllllllllIllIIIIlIlIIIlIlIIlI;
            this.boundingBox = llllllllllllIllIIIIlIlIIIlIllIII;
            int field_111021_b;
            if (lIIlllIIllIIIlll(llllllllllllIllIIIIlIlIIIlIllIIl.nextInt(Corridor.lllIIIIllIIlII[0]))) {
                field_111021_b = Corridor.lllIIIIllIIlII[1];
                "".length();
                if (" ".length() >= (0x33 ^ 0x37)) {
                    throw null;
                }
            }
            else {
                field_111021_b = Corridor.lllIIIIllIIlII[2];
            }
            this.field_111021_b = (field_111021_b != 0);
        }
        
        static {
            lIIlllIIllIIIllI();
            lIIlllIIllIIIIIl();
        }
        
        @Override
        protected void writeStructureToNBT(final NBTTagCompound llllllllllllIllIIIIlIlIIIlIIIllI) {
            super.writeStructureToNBT(llllllllllllIllIIIIlIlIIIlIIIllI);
            llllllllllllIllIIIIlIlIIIlIIIllI.setBoolean(Corridor.lllIIIIllIIIII[Corridor.lllIIIIllIIlII[1]], this.field_111021_b);
        }
        
        private static boolean lIIlllIIllIIlIII(final int llllllllllllIllIIIIlIIllllIlllll) {
            return llllllllllllIllIIIIlIIllllIlllll != 0;
        }
        
        private static String lIIlllIIllIIIIII(String llllllllllllIllIIIIlIIllllllIIll, final String llllllllllllIllIIIIlIIllllllIlll) {
            llllllllllllIllIIIIlIIllllllIIll = new String(Base64.getDecoder().decode(llllllllllllIllIIIIlIIllllllIIll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
            final StringBuilder llllllllllllIllIIIIlIIllllllIllI = new StringBuilder();
            final char[] llllllllllllIllIIIIlIIllllllIlIl = llllllllllllIllIIIIlIIllllllIlll.toCharArray();
            int llllllllllllIllIIIIlIIllllllIlII = Corridor.lllIIIIllIIlII[2];
            final float llllllllllllIllIIIIlIIlllllIlllI = (Object)llllllllllllIllIIIIlIIllllllIIll.toCharArray();
            final short llllllllllllIllIIIIlIIlllllIllIl = (short)llllllllllllIllIIIIlIIlllllIlllI.length;
            int llllllllllllIllIIIIlIIlllllIllII = Corridor.lllIIIIllIIlII[2];
            while (lIIlllIIllIIlIll(llllllllllllIllIIIIlIIlllllIllII, llllllllllllIllIIIIlIIlllllIllIl)) {
                final char llllllllllllIllIIIIlIIlllllllIIl = llllllllllllIllIIIIlIIlllllIlllI[llllllllllllIllIIIIlIIlllllIllII];
                llllllllllllIllIIIIlIIllllllIllI.append((char)(llllllllllllIllIIIIlIIlllllllIIl ^ llllllllllllIllIIIIlIIllllllIlIl[llllllllllllIllIIIIlIIllllllIlII % llllllllllllIllIIIIlIIllllllIlIl.length]));
                "".length();
                ++llllllllllllIllIIIIlIIllllllIlII;
                ++llllllllllllIllIIIIlIIlllllIllII;
                "".length();
                if ("  ".length() > "   ".length()) {
                    return null;
                }
            }
            return String.valueOf(llllllllllllIllIIIIlIIllllllIllI);
        }
        
        private static void lIIlllIIllIIIllI() {
            (lllIIIIllIIlII = new int[9])[0] = "   ".length();
            Corridor.lllIIIIllIIlII[1] = " ".length();
            Corridor.lllIIIIllIIlII[2] = ((0xD1 ^ 0x9D) & ~(0xC ^ 0x40));
            Corridor.lllIIIIllIIlII[3] = -" ".length();
            Corridor.lllIIIIllIIlII[4] = (112 + 130 - 93 + 15 ^ 124 + 51 - 123 + 109);
            Corridor.lllIIIIllIIlII[5] = (0x71 ^ 0x76);
            Corridor.lllIIIIllIIlII[6] = (0x83 ^ 0x87);
            Corridor.lllIIIIllIIlII[7] = "  ".length();
            Corridor.lllIIIIllIIlII[8] = (135 + 99 - 181 + 88 ^ 16 + 98 - 59 + 84);
        }
        
        private static String lIIlllIIlIllllll(final String llllllllllllIllIIIIlIlIIIIIIIllI, final String llllllllllllIllIIIIlIlIIIIIIIlll) {
            try {
                final SecretKeySpec llllllllllllIllIIIIlIlIIIIIIlIll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIllIIIIlIlIIIIIIIlll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
                final Cipher llllllllllllIllIIIIlIlIIIIIIlIlI = Cipher.getInstance("Blowfish");
                llllllllllllIllIIIIlIlIIIIIIlIlI.init(Corridor.lllIIIIllIIlII[7], llllllllllllIllIIIIlIlIIIIIIlIll);
                return new String(llllllllllllIllIIIIlIlIIIIIIlIlI.doFinal(Base64.getDecoder().decode(llllllllllllIllIIIIlIlIIIIIIIllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
            }
            catch (Exception llllllllllllIllIIIIlIlIIIIIIlIIl) {
                llllllllllllIllIIIIlIlIIIIIIlIIl.printStackTrace();
                return null;
            }
        }
        
        @Override
        public void buildComponent(final StructureComponent llllllllllllIllIIIIlIlIIIIllllII, final List<StructureComponent> llllllllllllIllIIIIlIlIIIIllllll, final Random llllllllllllIllIIIIlIlIIIIlllllI) {
            this.getNextComponentX((Start)llllllllllllIllIIIIlIlIIIIllllII, llllllllllllIllIIIIlIlIIIIllllll, llllllllllllIllIIIIlIlIIIIlllllI, Corridor.lllIIIIllIIlII[2], Corridor.lllIIIIllIIlII[1], (boolean)(Corridor.lllIIIIllIIlII[1] != 0));
            "".length();
        }
        
        private static boolean lIIlllIIllIIlIlI(final int llllllllllllIllIIIIlIIlllllIIlII, final int llllllllllllIllIIIIlIIlllllIIIll) {
            return llllllllllllIllIIIIlIIlllllIIlII > llllllllllllIllIIIIlIIlllllIIIll;
        }
        
        @Override
        protected void readStructureFromNBT(final NBTTagCompound llllllllllllIllIIIIlIlIIIlIIlllI) {
            super.readStructureFromNBT(llllllllllllIllIIIIlIlIIIlIIlllI);
            this.field_111021_b = llllllllllllIllIIIIlIlIIIlIIlllI.getBoolean(Corridor.lllIIIIllIIIII[Corridor.lllIIIIllIIlII[2]]);
        }
        
        private static void lIIlllIIllIIIIIl() {
            (lllIIIIllIIIII = new String[Corridor.lllIIIIllIIlII[7]])[Corridor.lllIIIIllIIlII[2]] = lIIlllIIlIllllll("hpjTJNRGoc0=", "aXjgV");
            Corridor.lllIIIIllIIIII[Corridor.lllIIIIllIIlII[1]] = lIIlllIIllIIIIII("Lz4pFgw=", "lVLex");
        }
        
        private static boolean lIIlllIIllIIlIIl(final Object llllllllllllIllIIIIlIIlllllIIIIl) {
            return llllllllllllIllIIIIlIIlllllIIIIl == null;
        }
        
        private static boolean lIIlllIIllIIIlll(final int llllllllllllIllIIIIlIIllllIlllIl) {
            return llllllllllllIllIIIIlIIllllIlllIl == 0;
        }
        
        private static boolean lIIlllIIllIIlIll(final int llllllllllllIllIIIIlIIlllllIlIII, final int llllllllllllIllIIIIlIIlllllIIlll) {
            return llllllllllllIllIIIIlIIlllllIlIII < llllllllllllIllIIIIlIIlllllIIlll;
        }
        
        public Corridor() {
        }
        
        @Override
        public boolean addComponentParts(final World llllllllllllIllIIIIlIlIIIIIllIlI, final Random llllllllllllIllIIIIlIlIIIIIllIIl, final StructureBoundingBox llllllllllllIllIIIIlIlIIIIIllIII) {
            this.fillWithBlocks(llllllllllllIllIIIIlIlIIIIIllIlI, llllllllllllIllIIIIlIlIIIIIllIII, Corridor.lllIIIIllIIlII[2], Corridor.lllIIIIllIIlII[2], Corridor.lllIIIIllIIlII[2], Corridor.lllIIIIllIIlII[6], Corridor.lllIIIIllIIlII[1], Corridor.lllIIIIllIIlII[6], Blocks.nether_brick.getDefaultState(), Blocks.nether_brick.getDefaultState(), (boolean)(Corridor.lllIIIIllIIlII[2] != 0));
            this.fillWithBlocks(llllllllllllIllIIIIlIlIIIIIllIlI, llllllllllllIllIIIIlIlIIIIIllIII, Corridor.lllIIIIllIIlII[2], Corridor.lllIIIIllIIlII[7], Corridor.lllIIIIllIIlII[2], Corridor.lllIIIIllIIlII[6], Corridor.lllIIIIllIIlII[4], Corridor.lllIIIIllIIlII[6], Blocks.air.getDefaultState(), Blocks.air.getDefaultState(), (boolean)(Corridor.lllIIIIllIIlII[2] != 0));
            this.fillWithBlocks(llllllllllllIllIIIIlIlIIIIIllIlI, llllllllllllIllIIIIlIlIIIIIllIII, Corridor.lllIIIIllIIlII[6], Corridor.lllIIIIllIIlII[7], Corridor.lllIIIIllIIlII[2], Corridor.lllIIIIllIIlII[6], Corridor.lllIIIIllIIlII[4], Corridor.lllIIIIllIIlII[6], Blocks.nether_brick.getDefaultState(), Blocks.nether_brick.getDefaultState(), (boolean)(Corridor.lllIIIIllIIlII[2] != 0));
            this.fillWithBlocks(llllllllllllIllIIIIlIlIIIIIllIlI, llllllllllllIllIIIIlIlIIIIIllIII, Corridor.lllIIIIllIIlII[6], Corridor.lllIIIIllIIlII[0], Corridor.lllIIIIllIIlII[1], Corridor.lllIIIIllIIlII[6], Corridor.lllIIIIllIIlII[6], Corridor.lllIIIIllIIlII[1], Blocks.nether_brick_fence.getDefaultState(), Blocks.nether_brick_fence.getDefaultState(), (boolean)(Corridor.lllIIIIllIIlII[2] != 0));
            this.fillWithBlocks(llllllllllllIllIIIIlIlIIIIIllIlI, llllllllllllIllIIIIlIlIIIIIllIII, Corridor.lllIIIIllIIlII[6], Corridor.lllIIIIllIIlII[0], Corridor.lllIIIIllIIlII[0], Corridor.lllIIIIllIIlII[6], Corridor.lllIIIIllIIlII[6], Corridor.lllIIIIllIIlII[0], Blocks.nether_brick_fence.getDefaultState(), Blocks.nether_brick_fence.getDefaultState(), (boolean)(Corridor.lllIIIIllIIlII[2] != 0));
            this.fillWithBlocks(llllllllllllIllIIIIlIlIIIIIllIlI, llllllllllllIllIIIIlIlIIIIIllIII, Corridor.lllIIIIllIIlII[2], Corridor.lllIIIIllIIlII[7], Corridor.lllIIIIllIIlII[2], Corridor.lllIIIIllIIlII[2], Corridor.lllIIIIllIIlII[4], Corridor.lllIIIIllIIlII[2], Blocks.nether_brick.getDefaultState(), Blocks.nether_brick.getDefaultState(), (boolean)(Corridor.lllIIIIllIIlII[2] != 0));
            this.fillWithBlocks(llllllllllllIllIIIIlIlIIIIIllIlI, llllllllllllIllIIIIlIlIIIIIllIII, Corridor.lllIIIIllIIlII[2], Corridor.lllIIIIllIIlII[7], Corridor.lllIIIIllIIlII[6], Corridor.lllIIIIllIIlII[0], Corridor.lllIIIIllIIlII[4], Corridor.lllIIIIllIIlII[6], Blocks.nether_brick.getDefaultState(), Blocks.nether_brick.getDefaultState(), (boolean)(Corridor.lllIIIIllIIlII[2] != 0));
            this.fillWithBlocks(llllllllllllIllIIIIlIlIIIIIllIlI, llllllllllllIllIIIIlIlIIIIIllIII, Corridor.lllIIIIllIIlII[1], Corridor.lllIIIIllIIlII[0], Corridor.lllIIIIllIIlII[6], Corridor.lllIIIIllIIlII[1], Corridor.lllIIIIllIIlII[6], Corridor.lllIIIIllIIlII[6], Blocks.nether_brick_fence.getDefaultState(), Blocks.nether_brick.getDefaultState(), (boolean)(Corridor.lllIIIIllIIlII[2] != 0));
            this.fillWithBlocks(llllllllllllIllIIIIlIlIIIIIllIlI, llllllllllllIllIIIIlIlIIIIIllIII, Corridor.lllIIIIllIIlII[0], Corridor.lllIIIIllIIlII[0], Corridor.lllIIIIllIIlII[6], Corridor.lllIIIIllIIlII[0], Corridor.lllIIIIllIIlII[6], Corridor.lllIIIIllIIlII[6], Blocks.nether_brick_fence.getDefaultState(), Blocks.nether_brick.getDefaultState(), (boolean)(Corridor.lllIIIIllIIlII[2] != 0));
            if (lIIlllIIllIIlIII(this.field_111021_b ? 1 : 0) && lIIlllIIllIIlIII(llllllllllllIllIIIIlIlIIIIIllIII.isVecInside(new BlockPos(this.getXWithOffset(Corridor.lllIIIIllIIlII[0], Corridor.lllIIIIllIIlII[0]), this.getYWithOffset(Corridor.lllIIIIllIIlII[7]), this.getZWithOffset(Corridor.lllIIIIllIIlII[0], Corridor.lllIIIIllIIlII[0]))) ? 1 : 0)) {
                this.field_111021_b = (Corridor.lllIIIIllIIlII[2] != 0);
                this.generateChestContents(llllllllllllIllIIIIlIlIIIIIllIlI, llllllllllllIllIIIIlIlIIIIIllIII, llllllllllllIllIIIIlIlIIIIIllIIl, Corridor.lllIIIIllIIlII[0], Corridor.lllIIIIllIIlII[7], Corridor.lllIIIIllIIlII[0], Corridor.field_111019_a, Corridor.lllIIIIllIIlII[7] + llllllllllllIllIIIIlIlIIIIIllIIl.nextInt(Corridor.lllIIIIllIIlII[6]));
                "".length();
            }
            this.fillWithBlocks(llllllllllllIllIIIIlIlIIIIIllIlI, llllllllllllIllIIIIlIlIIIIIllIII, Corridor.lllIIIIllIIlII[2], Corridor.lllIIIIllIIlII[8], Corridor.lllIIIIllIIlII[2], Corridor.lllIIIIllIIlII[6], Corridor.lllIIIIllIIlII[8], Corridor.lllIIIIllIIlII[6], Blocks.nether_brick.getDefaultState(), Blocks.nether_brick.getDefaultState(), (boolean)(Corridor.lllIIIIllIIlII[2] != 0));
            int llllllllllllIllIIIIlIlIIIIIlIlll = Corridor.lllIIIIllIIlII[2];
            "".length();
            if ((0x9 ^ 0xD) < 0) {
                return ((0x3 ^ 0x45) & ~(0xA ^ 0x4C)) != 0x0;
            }
            while (!lIIlllIIllIIlIlI(llllllllllllIllIIIIlIlIIIIIlIlll, Corridor.lllIIIIllIIlII[6])) {
                int llllllllllllIllIIIIlIlIIIIIlIllI = Corridor.lllIIIIllIIlII[2];
                "".length();
                if (-(0xC3 ^ 0xC6) >= 0) {
                    return ((0x38 ^ 0x13) & ~(0xA7 ^ 0x8C)) != 0x0;
                }
                while (!lIIlllIIllIIlIlI(llllllllllllIllIIIIlIlIIIIIlIllI, Corridor.lllIIIIllIIlII[6])) {
                    this.replaceAirAndLiquidDownwards(llllllllllllIllIIIIlIlIIIIIllIlI, Blocks.nether_brick.getDefaultState(), llllllllllllIllIIIIlIlIIIIIlIlll, Corridor.lllIIIIllIIlII[3], llllllllllllIllIIIIlIlIIIIIlIllI, llllllllllllIllIIIIlIlIIIIIllIII);
                    ++llllllllllllIllIIIIlIlIIIIIlIllI;
                }
                ++llllllllllllIllIIIIlIlIIIIIlIlll;
            }
            return Corridor.lllIIIIllIIlII[1] != 0;
        }
    }
    
    abstract static class Piece extends StructureComponent
    {
        private static volatile /* synthetic */ int[] $SWITCH_TABLE$net$minecraft$util$EnumFacing;
        private static final /* synthetic */ int[] lIIlIllIlIIIll;
        protected static final /* synthetic */ List<WeightedRandomChestContent> field_111019_a;
        
        static {
            llIlIIlIIllIllI();
            final WeightedRandomChestContent[] array = new WeightedRandomChestContent[Piece.lIIlIllIlIIIll[0]];
            array[Piece.lIIlIllIlIIIll[1]] = new WeightedRandomChestContent(Items.diamond, Piece.lIIlIllIlIIIll[1], Piece.lIIlIllIlIIIll[2], Piece.lIIlIllIlIIIll[3], Piece.lIIlIllIlIIIll[4]);
            array[Piece.lIIlIllIlIIIll[2]] = new WeightedRandomChestContent(Items.iron_ingot, Piece.lIIlIllIlIIIll[1], Piece.lIIlIllIlIIIll[2], Piece.lIIlIllIlIIIll[4], Piece.lIIlIllIlIIIll[4]);
            array[Piece.lIIlIllIlIIIll[5]] = new WeightedRandomChestContent(Items.gold_ingot, Piece.lIIlIllIlIIIll[1], Piece.lIIlIllIlIIIll[2], Piece.lIIlIllIlIIIll[3], Piece.lIIlIllIlIIIll[6]);
            array[Piece.lIIlIllIlIIIll[3]] = new WeightedRandomChestContent(Items.golden_sword, Piece.lIIlIllIlIIIll[1], Piece.lIIlIllIlIIIll[2], Piece.lIIlIllIlIIIll[2], Piece.lIIlIllIlIIIll[4]);
            array[Piece.lIIlIllIlIIIll[7]] = new WeightedRandomChestContent(Items.golden_chestplate, Piece.lIIlIllIlIIIll[1], Piece.lIIlIllIlIIIll[2], Piece.lIIlIllIlIIIll[2], Piece.lIIlIllIlIIIll[4]);
            array[Piece.lIIlIllIlIIIll[4]] = new WeightedRandomChestContent(Items.flint_and_steel, Piece.lIIlIllIlIIIll[1], Piece.lIIlIllIlIIIll[2], Piece.lIIlIllIlIIIll[2], Piece.lIIlIllIlIIIll[4]);
            array[Piece.lIIlIllIlIIIll[8]] = new WeightedRandomChestContent(Items.nether_wart, Piece.lIIlIllIlIIIll[1], Piece.lIIlIllIlIIIll[3], Piece.lIIlIllIlIIIll[9], Piece.lIIlIllIlIIIll[4]);
            array[Piece.lIIlIllIlIIIll[9]] = new WeightedRandomChestContent(Items.saddle, Piece.lIIlIllIlIIIll[1], Piece.lIIlIllIlIIIll[2], Piece.lIIlIllIlIIIll[2], Piece.lIIlIllIlIIIll[10]);
            array[Piece.lIIlIllIlIIIll[11]] = new WeightedRandomChestContent(Items.golden_horse_armor, Piece.lIIlIllIlIIIll[1], Piece.lIIlIllIlIIIll[2], Piece.lIIlIllIlIIIll[2], Piece.lIIlIllIlIIIll[11]);
            array[Piece.lIIlIllIlIIIll[12]] = new WeightedRandomChestContent(Items.iron_horse_armor, Piece.lIIlIllIlIIIll[1], Piece.lIIlIllIlIIIll[2], Piece.lIIlIllIlIIIll[2], Piece.lIIlIllIlIIIll[4]);
            array[Piece.lIIlIllIlIIIll[10]] = new WeightedRandomChestContent(Items.diamond_horse_armor, Piece.lIIlIllIlIIIll[1], Piece.lIIlIllIlIIIll[2], Piece.lIIlIllIlIIIll[2], Piece.lIIlIllIlIIIll[3]);
            array[Piece.lIIlIllIlIIIll[13]] = new WeightedRandomChestContent(Item.getItemFromBlock(Blocks.obsidian), Piece.lIIlIllIlIIIll[1], Piece.lIIlIllIlIIIll[5], Piece.lIIlIllIlIIIll[7], Piece.lIIlIllIlIIIll[5]);
            field_111019_a = Lists.newArrayList((Object[])array);
        }
        
        @Override
        protected void readStructureFromNBT(final NBTTagCompound lllllllllllllIIllIIlIIIlllIIllIl) {
        }
        
        private static boolean llIlIIlIIlllIIl(final int lllllllllllllIIllIIlIIIlIIIIllII) {
            return lllllllllllllIIllIIlIIIlIIIIllII == 0;
        }
        
        protected StructureComponent getNextComponentX(final Start lllllllllllllIIllIIlIIIlIlIIIIIl, final List<StructureComponent> lllllllllllllIIllIIlIIIlIlIIIIII, final Random lllllllllllllIIllIIlIIIlIIllllll, final int lllllllllllllIIllIIlIIIlIlIIIlIl, final int lllllllllllllIIllIIlIIIlIlIIIlII, final boolean lllllllllllllIIllIIlIIIlIlIIIIll) {
            if (llIlIIlIIlllllI(this.coordBaseMode)) {
                switch ($SWITCH_TABLE$net$minecraft$util$EnumFacing()[this.coordBaseMode.ordinal()]) {
                    case 3: {
                        return this.func_175870_a(lllllllllllllIIllIIlIIIlIlIIIIIl, lllllllllllllIIllIIlIIIlIlIIIIII, lllllllllllllIIllIIlIIIlIIllllll, this.boundingBox.minX - Piece.lIIlIllIlIIIll[2], this.boundingBox.minY + lllllllllllllIIllIIlIIIlIlIIIlIl, this.boundingBox.minZ + lllllllllllllIIllIIlIIIlIlIIIlII, EnumFacing.WEST, this.getComponentType(), lllllllllllllIIllIIlIIIlIlIIIIll);
                    }
                    case 4: {
                        return this.func_175870_a(lllllllllllllIIllIIlIIIlIlIIIIIl, lllllllllllllIIllIIlIIIlIlIIIIII, lllllllllllllIIllIIlIIIlIIllllll, this.boundingBox.minX - Piece.lIIlIllIlIIIll[2], this.boundingBox.minY + lllllllllllllIIllIIlIIIlIlIIIlIl, this.boundingBox.minZ + lllllllllllllIIllIIlIIIlIlIIIlII, EnumFacing.WEST, this.getComponentType(), lllllllllllllIIllIIlIIIlIlIIIIll);
                    }
                    case 5: {
                        return this.func_175870_a(lllllllllllllIIllIIlIIIlIlIIIIIl, lllllllllllllIIllIIlIIIlIlIIIIII, lllllllllllllIIllIIlIIIlIIllllll, this.boundingBox.minX + lllllllllllllIIllIIlIIIlIlIIIlII, this.boundingBox.minY + lllllllllllllIIllIIlIIIlIlIIIlIl, this.boundingBox.minZ - Piece.lIIlIllIlIIIll[2], EnumFacing.NORTH, this.getComponentType(), lllllllllllllIIllIIlIIIlIlIIIIll);
                    }
                    case 6: {
                        return this.func_175870_a(lllllllllllllIIllIIlIIIlIlIIIIIl, lllllllllllllIIllIIlIIIlIlIIIIII, lllllllllllllIIllIIlIIIlIIllllll, this.boundingBox.minX + lllllllllllllIIllIIlIIIlIlIIIlII, this.boundingBox.minY + lllllllllllllIIllIIlIIIlIlIIIlIl, this.boundingBox.minZ - Piece.lIIlIllIlIIIll[2], EnumFacing.NORTH, this.getComponentType(), lllllllllllllIIllIIlIIIlIlIIIIll);
                    }
                }
            }
            return null;
        }
        
        protected StructureComponent getNextComponentNormal(final Start lllllllllllllIIllIIlIIIlIlIlIllI, final List<StructureComponent> lllllllllllllIIllIIlIIIlIlIlIlIl, final Random lllllllllllllIIllIIlIIIlIlIllIll, final int lllllllllllllIIllIIlIIIlIlIllIlI, final int lllllllllllllIIllIIlIIIlIlIllIIl, final boolean lllllllllllllIIllIIlIIIlIlIlIIIl) {
            if (llIlIIlIIlllllI(this.coordBaseMode)) {
                switch ($SWITCH_TABLE$net$minecraft$util$EnumFacing()[this.coordBaseMode.ordinal()]) {
                    case 3: {
                        return this.func_175870_a(lllllllllllllIIllIIlIIIlIlIlIllI, lllllllllllllIIllIIlIIIlIlIlIlIl, lllllllllllllIIllIIlIIIlIlIllIll, this.boundingBox.minX + lllllllllllllIIllIIlIIIlIlIllIlI, this.boundingBox.minY + lllllllllllllIIllIIlIIIlIlIllIIl, this.boundingBox.minZ - Piece.lIIlIllIlIIIll[2], this.coordBaseMode, this.getComponentType(), lllllllllllllIIllIIlIIIlIlIlIIIl);
                    }
                    case 4: {
                        return this.func_175870_a(lllllllllllllIIllIIlIIIlIlIlIllI, lllllllllllllIIllIIlIIIlIlIlIlIl, lllllllllllllIIllIIlIIIlIlIllIll, this.boundingBox.minX + lllllllllllllIIllIIlIIIlIlIllIlI, this.boundingBox.minY + lllllllllllllIIllIIlIIIlIlIllIIl, this.boundingBox.maxZ + Piece.lIIlIllIlIIIll[2], this.coordBaseMode, this.getComponentType(), lllllllllllllIIllIIlIIIlIlIlIIIl);
                    }
                    case 5: {
                        return this.func_175870_a(lllllllllllllIIllIIlIIIlIlIlIllI, lllllllllllllIIllIIlIIIlIlIlIlIl, lllllllllllllIIllIIlIIIlIlIllIll, this.boundingBox.minX - Piece.lIIlIllIlIIIll[2], this.boundingBox.minY + lllllllllllllIIllIIlIIIlIlIllIIl, this.boundingBox.minZ + lllllllllllllIIllIIlIIIlIlIllIlI, this.coordBaseMode, this.getComponentType(), lllllllllllllIIllIIlIIIlIlIlIIIl);
                    }
                    case 6: {
                        return this.func_175870_a(lllllllllllllIIllIIlIIIlIlIlIllI, lllllllllllllIIllIIlIIIlIlIlIlIl, lllllllllllllIIllIIlIIIlIlIllIll, this.boundingBox.maxX + Piece.lIIlIllIlIIIll[2], this.boundingBox.minY + lllllllllllllIIllIIlIIIlIlIllIIl, this.boundingBox.minZ + lllllllllllllIIllIIlIIIlIlIllIlI, this.coordBaseMode, this.getComponentType(), lllllllllllllIIllIIlIIIlIlIlIIIl);
                    }
                }
            }
            return null;
        }
        
        protected Piece(final int lllllllllllllIIllIIlIIIlllIlIIIl) {
            super(lllllllllllllIIllIIlIIIlllIlIIIl);
        }
        
        protected StructureComponent getNextComponentZ(final Start lllllllllllllIIllIIlIIIlIIllIIll, final List<StructureComponent> lllllllllllllIIllIIlIIIlIIlIlIll, final Random lllllllllllllIIllIIlIIIlIIllIIIl, final int lllllllllllllIIllIIlIIIlIIlIlIIl, final int lllllllllllllIIllIIlIIIlIIlIllll, final boolean lllllllllllllIIllIIlIIIlIIlIlllI) {
            if (llIlIIlIIlllllI(this.coordBaseMode)) {
                switch ($SWITCH_TABLE$net$minecraft$util$EnumFacing()[this.coordBaseMode.ordinal()]) {
                    case 3: {
                        return this.func_175870_a(lllllllllllllIIllIIlIIIlIIllIIll, lllllllllllllIIllIIlIIIlIIlIlIll, lllllllllllllIIllIIlIIIlIIllIIIl, this.boundingBox.maxX + Piece.lIIlIllIlIIIll[2], this.boundingBox.minY + lllllllllllllIIllIIlIIIlIIlIlIIl, this.boundingBox.minZ + lllllllllllllIIllIIlIIIlIIlIllll, EnumFacing.EAST, this.getComponentType(), lllllllllllllIIllIIlIIIlIIlIlllI);
                    }
                    case 4: {
                        return this.func_175870_a(lllllllllllllIIllIIlIIIlIIllIIll, lllllllllllllIIllIIlIIIlIIlIlIll, lllllllllllllIIllIIlIIIlIIllIIIl, this.boundingBox.maxX + Piece.lIIlIllIlIIIll[2], this.boundingBox.minY + lllllllllllllIIllIIlIIIlIIlIlIIl, this.boundingBox.minZ + lllllllllllllIIllIIlIIIlIIlIllll, EnumFacing.EAST, this.getComponentType(), lllllllllllllIIllIIlIIIlIIlIlllI);
                    }
                    case 5: {
                        return this.func_175870_a(lllllllllllllIIllIIlIIIlIIllIIll, lllllllllllllIIllIIlIIIlIIlIlIll, lllllllllllllIIllIIlIIIlIIllIIIl, this.boundingBox.minX + lllllllllllllIIllIIlIIIlIIlIllll, this.boundingBox.minY + lllllllllllllIIllIIlIIIlIIlIlIIl, this.boundingBox.maxZ + Piece.lIIlIllIlIIIll[2], EnumFacing.SOUTH, this.getComponentType(), lllllllllllllIIllIIlIIIlIIlIlllI);
                    }
                    case 6: {
                        return this.func_175870_a(lllllllllllllIIllIIlIIIlIIllIIll, lllllllllllllIIllIIlIIIlIIlIlIll, lllllllllllllIIllIIlIIIlIIllIIIl, this.boundingBox.minX + lllllllllllllIIllIIlIIIlIIlIllll, this.boundingBox.minY + lllllllllllllIIllIIlIIIlIIlIlIIl, this.boundingBox.maxZ + Piece.lIIlIllIlIIIll[2], EnumFacing.SOUTH, this.getComponentType(), lllllllllllllIIllIIlIIIlIIlIlllI);
                    }
                }
            }
            return null;
        }
        
        @Override
        protected void writeStructureToNBT(final NBTTagCompound lllllllllllllIIllIIlIIIlllIIlIll) {
        }
        
        private static void llIlIIlIIllIllI() {
            (lIIlIllIlIIIll = new int[17])[0] = (0xB3 ^ 0xBF);
            Piece.lIIlIllIlIIIll[1] = ((0x5 ^ 0x29) & ~(0xEC ^ 0xC0));
            Piece.lIIlIllIlIIIll[2] = " ".length();
            Piece.lIIlIllIlIIIll[3] = "   ".length();
            Piece.lIIlIllIlIIIll[4] = (0xB5 ^ 0xB0);
            Piece.lIIlIllIlIIIll[5] = "  ".length();
            Piece.lIIlIllIlIIIll[6] = (0x88 ^ 0x87);
            Piece.lIIlIllIlIIIll[7] = (0x93 ^ 0x97);
            Piece.lIIlIllIlIIIll[8] = (0x59 ^ 0x5F);
            Piece.lIIlIllIlIIIll[9] = (136 + 56 - 127 + 76 ^ 112 + 31 - 7 + 2);
            Piece.lIIlIllIlIIIll[10] = (32 + 33 - 63 + 133 ^ 83 + 34 - 47 + 71);
            Piece.lIIlIllIlIIIll[11] = (0xA1 ^ 0xB2 ^ (0xA3 ^ 0xB8));
            Piece.lIIlIllIlIIIll[12] = (0x5B ^ 0x29 ^ (0x2 ^ 0x79));
            Piece.lIIlIllIlIIIll[13] = (39 + 98 - 40 + 45 ^ 11 + 58 + 1 + 63);
            Piece.lIIlIllIlIIIll[14] = -" ".length();
            Piece.lIIlIllIlIIIll[15] = (0x2D ^ 0x33);
            Piece.lIIlIllIlIIIll[16] = (0x3F ^ 0x4F);
        }
        
        private static boolean llIlIIlIlIIIIII(final int lllllllllllllIIllIIlIIIlIIIlIlll, final int lllllllllllllIIllIIlIIIlIIIlIllI) {
            return lllllllllllllIIllIIlIIIlIIIlIlll > lllllllllllllIIllIIlIIIlIIIlIllI;
        }
        
        private StructureComponent func_175870_a(final Start lllllllllllllIIllIIlIIIlIlllIIII, final List<StructureComponent> lllllllllllllIIllIIlIIIlIllllIll, final Random lllllllllllllIIllIIlIIIlIllllIlI, final int lllllllllllllIIllIIlIIIlIllllIIl, final int lllllllllllllIIllIIlIIIlIllllIII, final int lllllllllllllIIllIIlIIIlIlllIlll, final EnumFacing lllllllllllllIIllIIlIIIlIlllIllI, final int lllllllllllllIIllIIlIIIlIlllIlIl, final boolean lllllllllllllIIllIIlIIIlIlllIlII) {
            if (llIlIIlIIlllIll(Math.abs(lllllllllllllIIllIIlIIIlIllllIIl - lllllllllllllIIllIIlIIIlIlllIIII.getBoundingBox().minX), Piece.lIIlIllIlIIIll[16]) && llIlIIlIIlllIll(Math.abs(lllllllllllllIIllIIlIIIlIlllIlll - lllllllllllllIIllIIlIIIlIlllIIII.getBoundingBox().minZ), Piece.lIIlIllIlIIIll[16])) {
                List<PieceWeight> lllllllllllllIIllIIlIIIlIlllIIll = lllllllllllllIIllIIlIIIlIlllIIII.primaryWeights;
                if (llIlIIlIIlllIlI(lllllllllllllIIllIIlIIIlIlllIlII ? 1 : 0)) {
                    lllllllllllllIIllIIlIIIlIlllIIll = lllllllllllllIIllIIlIIIlIlllIIII.secondaryWeights;
                }
                final StructureComponent lllllllllllllIIllIIlIIIlIlllIIlI = this.func_175871_a(lllllllllllllIIllIIlIIIlIlllIIII, lllllllllllllIIllIIlIIIlIlllIIll, lllllllllllllIIllIIlIIIlIllllIll, lllllllllllllIIllIIlIIIlIllllIlI, lllllllllllllIIllIIlIIIlIllllIIl, lllllllllllllIIllIIlIIIlIllllIII, lllllllllllllIIllIIlIIIlIlllIlll, lllllllllllllIIllIIlIIIlIlllIllI, lllllllllllllIIllIIlIIIlIlllIlIl + Piece.lIIlIllIlIIIll[2]);
                if (llIlIIlIIlllllI(lllllllllllllIIllIIlIIIlIlllIIlI)) {
                    lllllllllllllIIllIIlIIIlIllllIll.add(lllllllllllllIIllIIlIIIlIlllIIlI);
                    "".length();
                    lllllllllllllIIllIIlIIIlIlllIIII.field_74967_d.add(lllllllllllllIIllIIlIIIlIlllIIlI);
                    "".length();
                }
                return lllllllllllllIIllIIlIIIlIlllIIlI;
            }
            return End.func_175884_a(lllllllllllllIIllIIlIIIlIllllIll, lllllllllllllIIllIIlIIIlIllllIlI, lllllllllllllIIllIIlIIIlIllllIIl, lllllllllllllIIllIIlIIIlIllllIII, lllllllllllllIIllIIlIIIlIlllIlll, lllllllllllllIIllIIlIIIlIlllIllI, lllllllllllllIIllIIlIIIlIlllIlIl);
        }
        
        private int getTotalWeight(final List<PieceWeight> lllllllllllllIIllIIlIIIlllIIIIII) {
            boolean lllllllllllllIIllIIlIIIlllIIIIll = Piece.lIIlIllIlIIIll[1] != 0;
            int lllllllllllllIIllIIlIIIlllIIIIlI = Piece.lIIlIllIlIIIll[1];
            final boolean lllllllllllllIIllIIlIIIllIllllII = (boolean)lllllllllllllIIllIIlIIIlllIIIIII.iterator();
            "".length();
            if (" ".length() == 0) {
                return (0x38 ^ 0x22 ^ (0x77 ^ 0x4F)) & (0xF0 ^ 0xAC ^ (0x4A ^ 0x34) ^ -" ".length());
            }
            while (!llIlIIlIIlllIIl(((Iterator)lllllllllllllIIllIIlIIIllIllllII).hasNext() ? 1 : 0)) {
                final PieceWeight lllllllllllllIIllIIlIIIlllIIIIIl = ((Iterator<PieceWeight>)lllllllllllllIIllIIlIIIllIllllII).next();
                if (llIlIIlIIllIlll(lllllllllllllIIllIIlIIIlllIIIIIl.field_78824_d) && llIlIIlIIlllIII(lllllllllllllIIllIIlIIIlllIIIIIl.field_78827_c, lllllllllllllIIllIIlIIIlllIIIIIl.field_78824_d)) {
                    lllllllllllllIIllIIlIIIlllIIIIll = (Piece.lIIlIllIlIIIll[2] != 0);
                }
                lllllllllllllIIllIIlIIIlllIIIIlI += lllllllllllllIIllIIlIIIlllIIIIIl.field_78826_b;
            }
            int n;
            if (llIlIIlIIlllIlI(lllllllllllllIIllIIlIIIlllIIIIll ? 1 : 0)) {
                n = lllllllllllllIIllIIlIIIlllIIIIlI;
                "".length();
                if ("  ".length() != "  ".length()) {
                    return (0x34 ^ 0x23) & ~(0x86 ^ 0x91);
                }
            }
            else {
                n = Piece.lIIlIllIlIIIll[14];
            }
            return n;
        }
        
        private static boolean llIlIIlIIllllIl(final Object lllllllllllllIIllIIlIIIlIIIlIIll, final Object lllllllllllllIIllIIlIIIlIIIlIIlI) {
            return lllllllllllllIIllIIlIIIlIIIlIIll == lllllllllllllIIllIIlIIIlIIIlIIlI;
        }
        
        private static boolean llIlIIlIIlllIll(final int lllllllllllllIIllIIlIIIlIIIllIll, final int lllllllllllllIIllIIlIIIlIIIllIlI) {
            return lllllllllllllIIllIIlIIIlIIIllIll <= lllllllllllllIIllIIlIIIlIIIllIlI;
        }
        
        private static boolean llIlIIlIIllllII(final int lllllllllllllIIllIIlIIIlIIIIlIlI) {
            return lllllllllllllIIllIIlIIIlIIIIlIlI < 0;
        }
        
        private Piece func_175871_a(final Start lllllllllllllIIllIIlIIIllIlIlIIl, final List<PieceWeight> lllllllllllllIIllIIlIIIllIlIlIII, final List<StructureComponent> lllllllllllllIIllIIlIIIllIIlIlll, final Random lllllllllllllIIllIIlIIIllIlIIllI, final int lllllllllllllIIllIIlIIIllIIlIlIl, final int lllllllllllllIIllIIlIIIllIIlIlII, final int lllllllllllllIIllIIlIIIllIIlIIll, final EnumFacing lllllllllllllIIllIIlIIIllIIlIIlI, final int lllllllllllllIIllIIlIIIllIlIIIIl) {
            final int lllllllllllllIIllIIlIIIllIlIIIII = this.getTotalWeight(lllllllllllllIIllIIlIIIllIlIlIII);
            int n;
            if (llIlIIlIIllIlll(lllllllllllllIIllIIlIIIllIlIIIII) && llIlIIlIIlllIll(lllllllllllllIIllIIlIIIllIlIIIIl, Piece.lIIlIllIlIIIll[15])) {
                n = Piece.lIIlIllIlIIIll[2];
                "".length();
                if (("  ".length() ^ (0x56 ^ 0x50)) < ((175 + 113 - 96 + 17 ^ 49 + 166 - 60 + 41) & (0x94 ^ 0xB4 ^ (0x72 ^ 0x47) ^ -" ".length()))) {
                    return null;
                }
            }
            else {
                n = Piece.lIIlIllIlIIIll[1];
            }
            final boolean lllllllllllllIIllIIlIIIllIIlllll = n != 0;
            int lllllllllllllIIllIIlIIIllIIllllI = Piece.lIIlIllIlIIIll[1];
            "".length();
            if ((0xA3 ^ 0xA7) != (0xA5 ^ 0xA1)) {
                return null;
            }
            while (llIlIIlIIlllIII(lllllllllllllIIllIIlIIIllIIllllI, Piece.lIIlIllIlIIIll[4]) && !llIlIIlIIlllIIl(lllllllllllllIIllIIlIIIllIIlllll ? 1 : 0)) {
                ++lllllllllllllIIllIIlIIIllIIllllI;
                int lllllllllllllIIllIIlIIIllIIlllIl = lllllllllllllIIllIIlIIIllIlIIllI.nextInt(lllllllllllllIIllIIlIIIllIlIIIII);
                final float lllllllllllllIIllIIlIIIllIIIlIll = (float)lllllllllllllIIllIIlIIIllIlIlIII.iterator();
                "".length();
                if (null != null) {
                    return null;
                }
                while (!llIlIIlIIlllIIl(((Iterator)lllllllllllllIIllIIlIIIllIIIlIll).hasNext() ? 1 : 0)) {
                    final PieceWeight lllllllllllllIIllIIlIIIllIIlllII = ((Iterator<PieceWeight>)lllllllllllllIIllIIlIIIllIIIlIll).next();
                    lllllllllllllIIllIIlIIIllIIlllIl -= lllllllllllllIIllIIlIIIllIIlllII.field_78826_b;
                    if (llIlIIlIIllllII(lllllllllllllIIllIIlIIIllIIlllIl)) {
                        if (!llIlIIlIIlllIlI(lllllllllllllIIllIIlIIIllIIlllII.func_78822_a(lllllllllllllIIllIIlIIIllIlIIIIl) ? 1 : 0)) {
                            break;
                        }
                        if (llIlIIlIIllllIl(lllllllllllllIIllIIlIIIllIIlllII, lllllllllllllIIllIIlIIIllIlIlIIl.theNetherBridgePieceWeight) && llIlIIlIIlllIIl(lllllllllllllIIllIIlIIIllIIlllII.field_78825_e ? 1 : 0)) {
                            "".length();
                            if (null != null) {
                                return null;
                            }
                            break;
                        }
                        else {
                            final Piece lllllllllllllIIllIIlIIIllIIllIll = func_175887_b(lllllllllllllIIllIIlIIIllIIlllII, lllllllllllllIIllIIlIIIllIIlIlll, lllllllllllllIIllIIlIIIllIlIIllI, lllllllllllllIIllIIlIIIllIIlIlIl, lllllllllllllIIllIIlIIIllIIlIlII, lllllllllllllIIllIIlIIIllIIlIIll, lllllllllllllIIllIIlIIIllIIlIIlI, lllllllllllllIIllIIlIIIllIlIIIIl);
                            if (llIlIIlIIlllllI(lllllllllllllIIllIIlIIIllIIllIll)) {
                                final PieceWeight pieceWeight = lllllllllllllIIllIIlIIIllIIlllII;
                                pieceWeight.field_78827_c += Piece.lIIlIllIlIIIll[2];
                                lllllllllllllIIllIIlIIIllIlIlIIl.theNetherBridgePieceWeight = lllllllllllllIIllIIlIIIllIIlllII;
                                if (llIlIIlIIlllIIl(lllllllllllllIIllIIlIIIllIIlllII.func_78823_a() ? 1 : 0)) {
                                    lllllllllllllIIllIIlIIIllIlIlIII.remove(lllllllllllllIIllIIlIIIllIIlllII);
                                    "".length();
                                }
                                return lllllllllllllIIllIIlIIIllIIllIll;
                            }
                            continue;
                        }
                    }
                }
            }
            return End.func_175884_a(lllllllllllllIIllIIlIIIllIIlIlll, lllllllllllllIIllIIlIIIllIlIIllI, lllllllllllllIIllIIlIIIllIIlIlIl, lllllllllllllIIllIIlIIIllIIlIlII, lllllllllllllIIllIIlIIIllIIlIIll, lllllllllllllIIllIIlIIIllIIlIIlI, lllllllllllllIIllIIlIIIllIlIIIIl);
        }
        
        private static boolean llIlIIlIIlllIII(final int lllllllllllllIIllIIlIIIlIIIlllll, final int lllllllllllllIIllIIlIIIlIIIllllI) {
            return lllllllllllllIIllIIlIIIlIIIlllll < lllllllllllllIIllIIlIIIlIIIllllI;
        }
        
        public Piece() {
        }
        
        static /* synthetic */ int[] $SWITCH_TABLE$net$minecraft$util$EnumFacing() {
            final int[] $switch_TABLE$net$minecraft$util$EnumFacing = Piece.$SWITCH_TABLE$net$minecraft$util$EnumFacing;
            if (llIlIIlIIlllllI($switch_TABLE$net$minecraft$util$EnumFacing)) {
                return $switch_TABLE$net$minecraft$util$EnumFacing;
            }
            "".length();
            final int lllllllllllllIIllIIlIIIlIIlIIIlI = (Object)new int[EnumFacing.values().length];
            try {
                lllllllllllllIIllIIlIIIlIIlIIIlI[EnumFacing.DOWN.ordinal()] = Piece.lIIlIllIlIIIll[2];
                "".length();
                if ((0xBF ^ 0xBA) <= 0) {
                    return null;
                }
            }
            catch (NoSuchFieldError noSuchFieldError) {
                "".length();
            }
            try {
                lllllllllllllIIllIIlIIIlIIlIIIlI[EnumFacing.EAST.ordinal()] = Piece.lIIlIllIlIIIll[8];
                "".length();
                if (-" ".length() != -" ".length()) {
                    return null;
                }
            }
            catch (NoSuchFieldError noSuchFieldError2) {
                "".length();
            }
            try {
                lllllllllllllIIllIIlIIIlIIlIIIlI[EnumFacing.NORTH.ordinal()] = Piece.lIIlIllIlIIIll[3];
                "".length();
                if (-" ".length() == "   ".length()) {
                    return null;
                }
            }
            catch (NoSuchFieldError noSuchFieldError3) {
                "".length();
            }
            try {
                lllllllllllllIIllIIlIIIlIIlIIIlI[EnumFacing.SOUTH.ordinal()] = Piece.lIIlIllIlIIIll[7];
                "".length();
                if ("   ".length() == 0) {
                    return null;
                }
            }
            catch (NoSuchFieldError noSuchFieldError4) {
                "".length();
            }
            try {
                lllllllllllllIIllIIlIIIlIIlIIIlI[EnumFacing.UP.ordinal()] = Piece.lIIlIllIlIIIll[5];
                "".length();
                if ("  ".length() < "  ".length()) {
                    return null;
                }
            }
            catch (NoSuchFieldError noSuchFieldError5) {
                "".length();
            }
            try {
                lllllllllllllIIllIIlIIIlIIlIIIlI[EnumFacing.WEST.ordinal()] = Piece.lIIlIllIlIIIll[4];
                "".length();
                if (-"   ".length() >= 0) {
                    return null;
                }
            }
            catch (NoSuchFieldError noSuchFieldError6) {
                "".length();
            }
            return Piece.$SWITCH_TABLE$net$minecraft$util$EnumFacing = (int[])(Object)lllllllllllllIIllIIlIIIlIIlIIIlI;
        }
        
        private static boolean llIlIIlIIlllIlI(final int lllllllllllllIIllIIlIIIlIIIIlllI) {
            return lllllllllllllIIllIIlIIIlIIIIlllI != 0;
        }
        
        private static boolean llIlIIlIIllIlll(final int lllllllllllllIIllIIlIIIlIIIIlIII) {
            return lllllllllllllIIllIIlIIIlIIIIlIII > 0;
        }
        
        private static boolean llIlIIlIIlllllI(final Object lllllllllllllIIllIIlIIIlIIIlIIII) {
            return lllllllllllllIIllIIlIIIlIIIlIIII != null;
        }
        
        protected static boolean isAboveGround(final StructureBoundingBox lllllllllllllIIllIIlIIIlIIlIIlII) {
            if (llIlIIlIIlllllI(lllllllllllllIIllIIlIIIlIIlIIlII) && llIlIIlIlIIIIII(lllllllllllllIIllIIlIIIlIIlIIlII.minY, Piece.lIIlIllIlIIIll[10])) {
                return Piece.lIIlIllIlIIIll[2] != 0;
            }
            return Piece.lIIlIllIlIIIll[1] != 0;
        }
    }
    
    static class PieceWeight
    {
        public /* synthetic */ Class<? extends Piece> weightClass;
        private static final /* synthetic */ int[] llllIIlIIIIll;
        public /* synthetic */ boolean field_78825_e;
        public /* synthetic */ int field_78824_d;
        public final /* synthetic */ int field_78826_b;
        public /* synthetic */ int field_78827_c;
        
        public boolean func_78823_a() {
            if (lIlIlIIIIIlIIlI(this.field_78824_d) && lIlIlIIIIIlIIll(this.field_78827_c, this.field_78824_d)) {
                return PieceWeight.llllIIlIIIIll[0] != 0;
            }
            return PieceWeight.llllIIlIIIIll[1] != 0;
        }
        
        private static void lIlIlIIIIIlIIIl() {
            (llllIIlIIIIll = new int[2])[0] = ((0x4F ^ 0x14) & ~(0x41 ^ 0x1A));
            PieceWeight.llllIIlIIIIll[1] = " ".length();
        }
        
        public boolean func_78822_a(final int lllllllllllllIlIlllIlIlIIllIllIl) {
            if (lIlIlIIIIIlIIlI(this.field_78824_d) && lIlIlIIIIIlIIll(this.field_78827_c, this.field_78824_d)) {
                return PieceWeight.llllIIlIIIIll[0] != 0;
            }
            return PieceWeight.llllIIlIIIIll[1] != 0;
        }
        
        private static boolean lIlIlIIIIIlIIlI(final int lllllllllllllIlIlllIlIlIIllIIIll) {
            return lllllllllllllIlIlllIlIlIIllIIIll != 0;
        }
        
        public PieceWeight(final Class<? extends Piece> lllllllllllllIlIlllIlIlIIlllIllI, final int lllllllllllllIlIlllIlIlIIlllIlIl, final int lllllllllllllIlIlllIlIlIIlllIlII) {
            this(lllllllllllllIlIlllIlIlIIlllIllI, lllllllllllllIlIlllIlIlIIlllIlIl, lllllllllllllIlIlllIlIlIIlllIlII, (boolean)(PieceWeight.llllIIlIIIIll[0] != 0));
        }
        
        private static boolean lIlIlIIIIIlIIll(final int lllllllllllllIlIlllIlIlIIllIIllI, final int lllllllllllllIlIlllIlIlIIllIIlIl) {
            return lllllllllllllIlIlllIlIlIIllIIllI >= lllllllllllllIlIlllIlIlIIllIIlIl;
        }
        
        static {
            lIlIlIIIIIlIIIl();
        }
        
        public PieceWeight(final Class<? extends Piece> lllllllllllllIlIlllIlIlIIlllllll, final int lllllllllllllIlIlllIlIlIlIIIIIll, final int lllllllllllllIlIlllIlIlIlIIIIIlI, final boolean lllllllllllllIlIlllIlIlIlIIIIIIl) {
            this.weightClass = lllllllllllllIlIlllIlIlIIlllllll;
            this.field_78826_b = lllllllllllllIlIlllIlIlIlIIIIIll;
            this.field_78824_d = lllllllllllllIlIlllIlIlIlIIIIIlI;
            this.field_78825_e = lllllllllllllIlIlllIlIlIlIIIIIIl;
        }
    }
    
    public static class End extends Piece
    {
        private static final /* synthetic */ int[] llIllIIllIlIlI;
        private /* synthetic */ int fillSeed;
        private static final /* synthetic */ String[] llIllIIlIlIIIl;
        
        static {
            lIIlIlllIIllIIII();
            lIIlIllIllllllll();
        }
        
        private static void lIIlIlllIIllIIII() {
            (llIllIIllIlIlI = new int[10])[0] = -" ".length();
            End.llIllIIllIlIlI[1] = -"   ".length();
            End.llIllIIllIlIlI[2] = ((0xF2 ^ 0xB4 ^ (0x8D ^ 0x90)) & (0x79 ^ 0x13 ^ (0x4B ^ 0x7A) ^ -" ".length()));
            End.llIllIIllIlIlI[3] = (0x39 ^ 0x65 ^ (0x7C ^ 0x25));
            End.llIllIIllIlIlI[4] = (0xB4 ^ 0xBE);
            End.llIllIIllIlIlI[5] = (0x84 ^ 0x8C);
            End.llIllIIllIlIlI[6] = " ".length();
            End.llIllIIllIlIlI[7] = "   ".length();
            End.llIllIIllIlIlI[8] = (11 + 123 + 15 + 50 ^ 41 + 20 + 46 + 88);
            End.llIllIIllIlIlI[9] = "  ".length();
        }
        
        @Override
        protected void writeStructureToNBT(final NBTTagCompound llllllllllllIllIIlllIllllIIIIlIl) {
            super.writeStructureToNBT(llllllllllllIllIIlllIllllIIIIlIl);
            llllllllllllIllIIlllIllllIIIIlIl.setInteger(End.llIllIIlIlIIIl[End.llIllIIllIlIlI[6]], this.fillSeed);
        }
        
        public End(final int llllllllllllIllIIlllIllllIllIIIl, final Random llllllllllllIllIIlllIllllIlIlIll, final StructureBoundingBox llllllllllllIllIIlllIllllIlIlIlI, final EnumFacing llllllllllllIllIIlllIllllIlIlllI) {
            super(llllllllllllIllIIlllIllllIllIIIl);
            this.coordBaseMode = llllllllllllIllIIlllIllllIlIlllI;
            this.boundingBox = llllllllllllIllIIlllIllllIlIlIlI;
            this.fillSeed = llllllllllllIllIIlllIllllIlIlIll.nextInt();
        }
        
        private static void lIIlIllIllllllll() {
            (llIllIIlIlIIIl = new String[End.llIllIIllIlIlI[9]])[End.llIllIIllIlIlI[2]] = lIIlIllIllllIIIl("O6RPygUskQI=", "TCJjI");
            End.llIllIIlIlIIIl[End.llIllIIllIlIlI[6]] = lIIlIllIlllllllI("BAEWNw==", "WdsSG");
        }
        
        @Override
        public boolean addComponentParts(final World llllllllllllIllIIlllIlllIlllIIII, final Random llllllllllllIllIIlllIlllIllllIll, final StructureBoundingBox llllllllllllIllIIlllIlllIllIllll) {
            final Random llllllllllllIllIIlllIlllIllllIIl = new Random(this.fillSeed);
            int llllllllllllIllIIlllIlllIllllIII = End.llIllIIllIlIlI[2];
            "".length();
            if (null != null) {
                return ((0x13 ^ 0x2B ^ (0x33 ^ 0x35)) & (0x77 ^ 0x10 ^ (0xFD ^ 0xA4) ^ -" ".length())) != 0x0;
            }
            while (!lIIlIlllIIllIIll(llllllllllllIllIIlllIlllIllllIII, End.llIllIIllIlIlI[8])) {
                int llllllllllllIllIIlllIlllIlllIlll = End.llIllIIllIlIlI[7];
                "".length();
                if (-"   ".length() > 0) {
                    return ((67 + 19 + 62 + 84 ^ 163 + 31 - 70 + 75) & (0x81 ^ 0xA3 ^ (0x9E ^ 0x93) ^ -" ".length())) != 0x0;
                }
                while (!lIIlIlllIIllIIll(llllllllllllIllIIlllIlllIlllIlll, End.llIllIIllIlIlI[8])) {
                    final int llllllllllllIllIIlllIlllIlllIllI = llllllllllllIllIIlllIlllIllllIIl.nextInt(End.llIllIIllIlIlI[5]);
                    this.fillWithBlocks(llllllllllllIllIIlllIlllIlllIIII, llllllllllllIllIIlllIlllIllIllll, llllllllllllIllIIlllIlllIllllIII, llllllllllllIllIIlllIlllIlllIlll, End.llIllIIllIlIlI[2], llllllllllllIllIIlllIlllIllllIII, llllllllllllIllIIlllIlllIlllIlll, llllllllllllIllIIlllIlllIlllIllI, Blocks.nether_brick.getDefaultState(), Blocks.nether_brick.getDefaultState(), (boolean)(End.llIllIIllIlIlI[2] != 0));
                    ++llllllllllllIllIIlllIlllIlllIlll;
                }
                ++llllllllllllIllIIlllIlllIllllIII;
            }
            int llllllllllllIllIIlllIlllIlllIlIl = llllllllllllIllIIlllIlllIllllIIl.nextInt(End.llIllIIllIlIlI[5]);
            this.fillWithBlocks(llllllllllllIllIIlllIlllIlllIIII, llllllllllllIllIIlllIlllIllIllll, End.llIllIIllIlIlI[2], End.llIllIIllIlIlI[3], End.llIllIIllIlIlI[2], End.llIllIIllIlIlI[2], End.llIllIIllIlIlI[3], llllllllllllIllIIlllIlllIlllIlIl, Blocks.nether_brick.getDefaultState(), Blocks.nether_brick.getDefaultState(), (boolean)(End.llIllIIllIlIlI[2] != 0));
            llllllllllllIllIIlllIlllIlllIlIl = llllllllllllIllIIlllIlllIllllIIl.nextInt(End.llIllIIllIlIlI[5]);
            this.fillWithBlocks(llllllllllllIllIIlllIlllIlllIIII, llllllllllllIllIIlllIlllIllIllll, End.llIllIIllIlIlI[8], End.llIllIIllIlIlI[3], End.llIllIIllIlIlI[2], End.llIllIIllIlIlI[8], End.llIllIIllIlIlI[3], llllllllllllIllIIlllIlllIlllIlIl, Blocks.nether_brick.getDefaultState(), Blocks.nether_brick.getDefaultState(), (boolean)(End.llIllIIllIlIlI[2] != 0));
            llllllllllllIllIIlllIlllIlllIlIl = End.llIllIIllIlIlI[2];
            "".length();
            if (" ".length() >= "   ".length()) {
                return ((0xC ^ 0x36) & ~(0x2A ^ 0x10)) != 0x0;
            }
            while (!lIIlIlllIIllIIll(llllllllllllIllIIlllIlllIlllIlIl, End.llIllIIllIlIlI[8])) {
                final int llllllllllllIllIIlllIlllIlllIlII = llllllllllllIllIIlllIlllIllllIIl.nextInt(End.llIllIIllIlIlI[3]);
                this.fillWithBlocks(llllllllllllIllIIlllIlllIlllIIII, llllllllllllIllIIlllIlllIllIllll, llllllllllllIllIIlllIlllIlllIlIl, End.llIllIIllIlIlI[9], End.llIllIIllIlIlI[2], llllllllllllIllIIlllIlllIlllIlIl, End.llIllIIllIlIlI[9], llllllllllllIllIIlllIlllIlllIlII, Blocks.nether_brick.getDefaultState(), Blocks.nether_brick.getDefaultState(), (boolean)(End.llIllIIllIlIlI[2] != 0));
                ++llllllllllllIllIIlllIlllIlllIlIl;
            }
            llllllllllllIllIIlllIlllIlllIlIl = End.llIllIIllIlIlI[2];
            "".length();
            if (" ".length() <= -" ".length()) {
                return ((0x48 ^ 0x50) & ~(0xBA ^ 0xA2)) != 0x0;
            }
            while (!lIIlIlllIIllIIll(llllllllllllIllIIlllIlllIlllIlIl, End.llIllIIllIlIlI[8])) {
                int llllllllllllIllIIlllIlllIlllIIll = End.llIllIIllIlIlI[2];
                "".length();
                if ((0x2E ^ 0x6A ^ (0x83 ^ 0xC3)) <= " ".length()) {
                    return ((48 + 133 - 119 + 115 ^ 35 + 20 + 38 + 96) & (88 + 58 - 77 + 137 ^ 13 + 42 - 3 + 142 ^ -" ".length())) != 0x0;
                }
                while (!lIIlIlllIIllIIll(llllllllllllIllIIlllIlllIlllIIll, End.llIllIIllIlIlI[6])) {
                    final int llllllllllllIllIIlllIlllIlllIIlI = llllllllllllIllIIlllIlllIllllIIl.nextInt(End.llIllIIllIlIlI[7]);
                    this.fillWithBlocks(llllllllllllIllIIlllIlllIlllIIII, llllllllllllIllIIlllIlllIllIllll, llllllllllllIllIIlllIlllIlllIlIl, llllllllllllIllIIlllIlllIlllIIll, End.llIllIIllIlIlI[2], llllllllllllIllIIlllIlllIlllIlIl, llllllllllllIllIIlllIlllIlllIIll, llllllllllllIllIIlllIlllIlllIIlI, Blocks.nether_brick.getDefaultState(), Blocks.nether_brick.getDefaultState(), (boolean)(End.llIllIIllIlIlI[2] != 0));
                    ++llllllllllllIllIIlllIlllIlllIIll;
                }
                ++llllllllllllIllIIlllIlllIlllIlIl;
            }
            return End.llIllIIllIlIlI[6] != 0;
        }
        
        private static boolean lIIlIlllIIllIlII(final int llllllllllllIllIIlllIlllIlIIIIll, final int llllllllllllIllIIlllIlllIlIIIIlI) {
            return llllllllllllIllIIlllIlllIlIIIIll < llllllllllllIllIIlllIlllIlIIIIlI;
        }
        
        private static String lIIlIllIlllllllI(String llllllllllllIllIIlllIlllIlIllIll, final String llllllllllllIllIIlllIlllIlIlllll) {
            llllllllllllIllIIlllIlllIlIllIll = new String(Base64.getDecoder().decode(llllllllllllIllIIlllIlllIlIllIll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
            final StringBuilder llllllllllllIllIIlllIlllIlIllllI = new StringBuilder();
            final char[] llllllllllllIllIIlllIlllIlIlllIl = llllllllllllIllIIlllIlllIlIlllll.toCharArray();
            int llllllllllllIllIIlllIlllIlIlllII = End.llIllIIllIlIlI[2];
            final long llllllllllllIllIIlllIlllIlIlIllI = (Object)llllllllllllIllIIlllIlllIlIllIll.toCharArray();
            final String llllllllllllIllIIlllIlllIlIlIlIl = (String)llllllllllllIllIIlllIlllIlIlIllI.length;
            boolean llllllllllllIllIIlllIlllIlIlIlII = End.llIllIIllIlIlI[2] != 0;
            while (lIIlIlllIIllIlII(llllllllllllIllIIlllIlllIlIlIlII ? 1 : 0, (int)llllllllllllIllIIlllIlllIlIlIlIl)) {
                final char llllllllllllIllIIlllIlllIllIIIIl = llllllllllllIllIIlllIlllIlIlIllI[llllllllllllIllIIlllIlllIlIlIlII];
                llllllllllllIllIIlllIlllIlIllllI.append((char)(llllllllllllIllIIlllIlllIllIIIIl ^ llllllllllllIllIIlllIlllIlIlllIl[llllllllllllIllIIlllIlllIlIlllII % llllllllllllIllIIlllIlllIlIlllIl.length]));
                "".length();
                ++llllllllllllIllIIlllIlllIlIlllII;
                ++llllllllllllIllIIlllIlllIlIlIlII;
                "".length();
                if ((0x5A ^ 0x22 ^ (0xCD ^ 0xB1)) != (152 + 74 - 110 + 44 ^ 49 + 47 + 49 + 19)) {
                    return null;
                }
            }
            return String.valueOf(llllllllllllIllIIlllIlllIlIllllI);
        }
        
        @Override
        protected void readStructureFromNBT(final NBTTagCompound llllllllllllIllIIlllIllllIIIllIl) {
            super.readStructureFromNBT(llllllllllllIllIIlllIllllIIIllIl);
            this.fillSeed = llllllllllllIllIIlllIllllIIIllIl.getInteger(End.llIllIIlIlIIIl[End.llIllIIllIlIlI[2]]);
        }
        
        private static boolean lIIlIlllIIllIIIl(final int llllllllllllIllIIlllIlllIIlllIlI) {
            return llllllllllllIllIIlllIlllIIlllIlI != 0;
        }
        
        public static End func_175884_a(final List<StructureComponent> llllllllllllIllIIlllIllllIlIIIII, final Random llllllllllllIllIIlllIllllIIlllll, final int llllllllllllIllIIlllIllllIIllllI, final int llllllllllllIllIIlllIllllIIlllIl, final int llllllllllllIllIIlllIllllIIlIlII, final EnumFacing llllllllllllIllIIlllIllllIIllIll, final int llllllllllllIllIIlllIllllIIllIlI) {
            final StructureBoundingBox llllllllllllIllIIlllIllllIIllIIl = StructureBoundingBox.getComponentToAddBoundingBox(llllllllllllIllIIlllIllllIIllllI, llllllllllllIllIIlllIllllIIlllIl, llllllllllllIllIIlllIllllIIlIlII, End.llIllIIllIlIlI[0], End.llIllIIllIlIlI[1], End.llIllIIllIlIlI[2], End.llIllIIllIlIlI[3], End.llIllIIllIlIlI[4], End.llIllIIllIlIlI[5], llllllllllllIllIIlllIllllIIllIll);
            End end;
            if (lIIlIlllIIllIIIl(Piece.isAboveGround(llllllllllllIllIIlllIllllIIllIIl) ? 1 : 0) && lIIlIlllIIllIIlI(StructureComponent.findIntersecting(llllllllllllIllIIlllIllllIlIIIII, llllllllllllIllIIlllIllllIIllIIl))) {
                end = new End(llllllllllllIllIIlllIllllIIllIlI, llllllllllllIllIIlllIllllIIlllll, llllllllllllIllIIlllIllllIIllIIl, llllllllllllIllIIlllIllllIIllIll);
                "".length();
                if (((0x73 ^ 0x56) & ~(0x7D ^ 0x58)) == "   ".length()) {
                    return null;
                }
            }
            else {
                end = null;
            }
            return end;
        }
        
        private static boolean lIIlIlllIIllIIlI(final Object llllllllllllIllIIlllIlllIIllllII) {
            return llllllllllllIllIIlllIlllIIllllII == null;
        }
        
        private static boolean lIIlIlllIIllIIll(final int llllllllllllIllIIlllIlllIIllllll, final int llllllllllllIllIIlllIlllIIlllllI) {
            return llllllllllllIllIIlllIlllIIllllll > llllllllllllIllIIlllIlllIIlllllI;
        }
        
        public End() {
        }
        
        private static String lIIlIllIllllIIIl(final String llllllllllllIllIIlllIlllIlIIlIll, final String llllllllllllIllIIlllIlllIlIIlIII) {
            try {
                final SecretKeySpec llllllllllllIllIIlllIlllIlIIlllI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIllIIlllIlllIlIIlIII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
                final Cipher llllllllllllIllIIlllIlllIlIIllIl = Cipher.getInstance("Blowfish");
                llllllllllllIllIIlllIlllIlIIllIl.init(End.llIllIIllIlIlI[9], llllllllllllIllIIlllIlllIlIIlllI);
                return new String(llllllllllllIllIIlllIlllIlIIllIl.doFinal(Base64.getDecoder().decode(llllllllllllIllIIlllIlllIlIIlIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
            }
            catch (Exception llllllllllllIllIIlllIlllIlIIllII) {
                llllllllllllIllIIlllIlllIlIIllII.printStackTrace();
                return null;
            }
        }
    }
    
    public static class Start extends Crossing3
    {
        private static final /* synthetic */ int[] lIIllIllIIlIII;
        public /* synthetic */ List<StructureComponent> field_74967_d;
        public /* synthetic */ PieceWeight theNetherBridgePieceWeight;
        public /* synthetic */ List<PieceWeight> primaryWeights;
        public /* synthetic */ List<PieceWeight> secondaryWeights;
        
        private static boolean llIllIIllIIllll(final int lllllllllllllIIlIlIIlllIlIIIlllI, final int lllllllllllllIIlIlIIlllIlIIIllIl) {
            return lllllllllllllIIlIlIIlllIlIIIlllI >= lllllllllllllIIlIlIIlllIlIIIllIl;
        }
        
        @Override
        protected void writeStructureToNBT(final NBTTagCompound lllllllllllllIIlIlIIlllIlIIlIIIl) {
            super.writeStructureToNBT(lllllllllllllIIlIlIIlllIlIIlIIIl);
        }
        
        @Override
        protected void readStructureFromNBT(final NBTTagCompound lllllllllllllIIlIlIIlllIlIIllIIl) {
            super.readStructureFromNBT(lllllllllllllIIlIlIIlllIlIIllIIl);
        }
        
        static {
            llIllIIllIIlllI();
        }
        
        private static void llIllIIllIIlllI() {
            (lIIllIllIIlIII = new int[1])[0] = ((0x3B ^ 0xD) & ~(0x42 ^ 0x74));
        }
        
        public Start() {
            this.field_74967_d = (List<StructureComponent>)Lists.newArrayList();
        }
        
        public Start(final Random lllllllllllllIIlIlIIlllIlIlIIIll, final int lllllllllllllIIlIlIIlllIlIlIlIII, final int lllllllllllllIIlIlIIlllIlIlIIlll) {
            super(lllllllllllllIIlIlIIlllIlIlIIIll, lllllllllllllIIlIlIIlllIlIlIlIII, lllllllllllllIIlIlIIlllIlIlIIlll);
            this.field_74967_d = (List<StructureComponent>)Lists.newArrayList();
            this.primaryWeights = (List<PieceWeight>)Lists.newArrayList();
            int lllllllllllllIIlIlIIlllIlIIlllIl;
            double lllllllllllllIIlIlIIlllIlIIllllI = ((PieceWeight[])(Object)(lllllllllllllIIlIlIIlllIlIIlllIl = (int)(Object)StructureNetherBridgePieces.primaryComponents)).length;
            char lllllllllllllIIlIlIIlllIlIIlllll = (char)Start.lIIllIllIIlIII[0];
            "".length();
            if ("  ".length() < "  ".length()) {
                throw null;
            }
            while (!llIllIIllIIllll(lllllllllllllIIlIlIIlllIlIIlllll, (int)lllllllllllllIIlIlIIlllIlIIllllI)) {
                final PieceWeight lllllllllllllIIlIlIIlllIlIlIIllI = lllllllllllllIIlIlIIlllIlIIlllIl[lllllllllllllIIlIlIIlllIlIIlllll];
                lllllllllllllIIlIlIIlllIlIlIIllI.field_78827_c = Start.lIIllIllIIlIII[0];
                this.primaryWeights.add(lllllllllllllIIlIlIIlllIlIlIIllI);
                "".length();
                ++lllllllllllllIIlIlIIlllIlIIlllll;
            }
            this.secondaryWeights = (List<PieceWeight>)Lists.newArrayList();
            lllllllllllllIIlIlIIlllIlIIllllI = ((PieceWeight[])(Object)(lllllllllllllIIlIlIIlllIlIIlllIl = (int)(Object)StructureNetherBridgePieces.secondaryComponents)).length;
            lllllllllllllIIlIlIIlllIlIIlllll = (char)Start.lIIllIllIIlIII[0];
            "".length();
            if ((0x82 ^ 0xAA ^ (0x67 ^ 0x4B)) < 0) {
                throw null;
            }
            while (!llIllIIllIIllll(lllllllllllllIIlIlIIlllIlIIlllll, (int)lllllllllllllIIlIlIIlllIlIIllllI)) {
                final PieceWeight lllllllllllllIIlIlIIlllIlIlIIlIl = lllllllllllllIIlIlIIlllIlIIlllIl[lllllllllllllIIlIlIIlllIlIIlllll];
                lllllllllllllIIlIlIIlllIlIlIIlIl.field_78827_c = Start.lIIllIllIIlIII[0];
                this.secondaryWeights.add(lllllllllllllIIlIlIIlllIlIlIIlIl);
                "".length();
                ++lllllllllllllIIlIlIIlllIlIIlllll;
            }
        }
    }
    
    public static class Crossing3 extends Piece
    {
        private static final /* synthetic */ int[] llIIlIllIllllI;
        private static volatile /* synthetic */ int[] $SWITCH_TABLE$net$minecraft$util$EnumFacing;
        
        @Override
        public void buildComponent(final StructureComponent llllllllllllIlllIIIlIIlIlIlIIIII, final List<StructureComponent> llllllllllllIlllIIIlIIlIlIlIIIll, final Random llllllllllllIlllIIIlIIlIlIIllllI) {
            this.getNextComponentNormal((Start)llllllllllllIlllIIIlIIlIlIlIIIII, llllllllllllIlllIIIlIIlIlIlIIIll, llllllllllllIlllIIIlIIlIlIIllllI, Crossing3.llIIlIllIllllI[5], Crossing3.llIIlIllIllllI[6], (boolean)(Crossing3.llIIlIllIllllI[0] != 0));
            "".length();
            this.getNextComponentX((Start)llllllllllllIlllIIIlIIlIlIlIIIII, llllllllllllIlllIIIlIIlIlIlIIIll, llllllllllllIlllIIIlIIlIlIIllllI, Crossing3.llIIlIllIllllI[6], Crossing3.llIIlIllIllllI[5], (boolean)(Crossing3.llIIlIllIllllI[0] != 0));
            "".length();
            this.getNextComponentZ((Start)llllllllllllIlllIIIlIIlIlIlIIIII, llllllllllllIlllIIIlIIlIlIlIIIll, llllllllllllIlllIIIlIIlIlIIllllI, Crossing3.llIIlIllIllllI[6], Crossing3.llIIlIllIllllI[5], (boolean)(Crossing3.llIIlIllIllllI[0] != 0));
            "".length();
        }
        
        private static boolean lIIIllIlllIllIIl(final int llllllllllllIlllIIIlIIlIIllIlIII) {
            return llllllllllllIlllIIIlIIlIIllIlIII != 0;
        }
        
        private static boolean lIIIllIlllIllIll(final int llllllllllllIlllIIIlIIlIIllIllll, final int llllllllllllIlllIIIlIIlIIllIlllI) {
            return llllllllllllIlllIIIlIIlIIllIllll > llllllllllllIlllIIIlIIlIIllIlllI;
        }
        
        private static void lIIIllIlllIllIII() {
            (llIIlIllIllllI = new int[20])[0] = ((" ".length() ^ (0x73 ^ 0x45)) & (0x55 ^ 0x64 ^ (0x66 ^ 0x60) ^ -" ".length()));
            Crossing3.llIIlIllIllllI[1] = (29 + 173 - 195 + 187 ^ 61 + 97 - 83 + 55);
            Crossing3.llIIlIllIllllI[2] = (0x2 ^ 0x11);
            Crossing3.llIIlIllIllllI[3] = " ".length();
            Crossing3.llIIlIllIllllI[4] = (0xF9 ^ 0xB0);
            Crossing3.llIIlIllIllllI[5] = (0x7D ^ 0x75);
            Crossing3.llIIlIllIllllI[6] = "   ".length();
            Crossing3.llIIlIllIllllI[7] = -(0xC3 ^ 0x80 ^ (0xF1 ^ 0xBA));
            Crossing3.llIIlIllIllllI[8] = -"   ".length();
            Crossing3.llIIlIllIllllI[9] = (0x9A ^ 0x90);
            Crossing3.llIIlIllIllllI[10] = (0x53 ^ 0x65 ^ (0x4F ^ 0x7E));
            Crossing3.llIIlIllIllllI[11] = (0x6E ^ 0x65);
            Crossing3.llIIlIllIllllI[12] = (9 + 44 + 9 + 121 ^ 156 + 75 - 159 + 107);
            Crossing3.llIIlIllIllllI[13] = (0x8D ^ 0x9F);
            Crossing3.llIIlIllIllllI[14] = (108 + 69 - 45 + 4 ^ 53 + 11 + 41 + 36);
            Crossing3.llIIlIllIllllI[15] = "  ".length();
            Crossing3.llIIlIllIllllI[16] = (0x5C ^ 0x51);
            Crossing3.llIIlIllIllllI[17] = (0xAC ^ 0xA3);
            Crossing3.llIIlIllIllllI[18] = -" ".length();
            Crossing3.llIIlIllIllllI[19] = (0x53 ^ 0x61 ^ (0x7F ^ 0x4B));
        }
        
        private static boolean lIIIllIlllIlllII(final Object llllllllllllIlllIIIlIIlIIllIllII) {
            return llllllllllllIlllIIIlIIlIIllIllII != null;
        }
        
        @Override
        public boolean addComponentParts(final World llllllllllllIlllIIIlIIlIIlllIlll, final Random llllllllllllIlllIIIlIIlIIllllllI, final StructureBoundingBox llllllllllllIlllIIIlIIlIIlllllIl) {
            this.fillWithBlocks(llllllllllllIlllIIIlIIlIIlllIlll, llllllllllllIlllIIIlIIlIIlllllIl, Crossing3.llIIlIllIllllI[10], Crossing3.llIIlIllIllllI[6], Crossing3.llIIlIllIllllI[0], Crossing3.llIIlIllIllllI[11], Crossing3.llIIlIllIllllI[12], Crossing3.llIIlIllIllllI[13], Blocks.nether_brick.getDefaultState(), Blocks.nether_brick.getDefaultState(), (boolean)(Crossing3.llIIlIllIllllI[0] != 0));
            this.fillWithBlocks(llllllllllllIlllIIIlIIlIIlllIlll, llllllllllllIlllIIIlIIlIIlllllIl, Crossing3.llIIlIllIllllI[0], Crossing3.llIIlIllIllllI[6], Crossing3.llIIlIllIllllI[10], Crossing3.llIIlIllIllllI[13], Crossing3.llIIlIllIllllI[12], Crossing3.llIIlIllIllllI[11], Blocks.nether_brick.getDefaultState(), Blocks.nether_brick.getDefaultState(), (boolean)(Crossing3.llIIlIllIllllI[0] != 0));
            this.fillWithBlocks(llllllllllllIlllIIIlIIlIIlllIlll, llllllllllllIlllIIIlIIlIIlllllIl, Crossing3.llIIlIllIllllI[5], Crossing3.llIIlIllIllllI[14], Crossing3.llIIlIllIllllI[0], Crossing3.llIIlIllIllllI[9], Crossing3.llIIlIllIllllI[10], Crossing3.llIIlIllIllllI[13], Blocks.air.getDefaultState(), Blocks.air.getDefaultState(), (boolean)(Crossing3.llIIlIllIllllI[0] != 0));
            this.fillWithBlocks(llllllllllllIlllIIIlIIlIIlllIlll, llllllllllllIlllIIIlIIlIIlllllIl, Crossing3.llIIlIllIllllI[0], Crossing3.llIIlIllIllllI[14], Crossing3.llIIlIllIllllI[5], Crossing3.llIIlIllIllllI[13], Crossing3.llIIlIllIllllI[10], Crossing3.llIIlIllIllllI[9], Blocks.air.getDefaultState(), Blocks.air.getDefaultState(), (boolean)(Crossing3.llIIlIllIllllI[0] != 0));
            this.fillWithBlocks(llllllllllllIlllIIIlIIlIIlllIlll, llllllllllllIlllIIIlIIlIIlllllIl, Crossing3.llIIlIllIllllI[10], Crossing3.llIIlIllIllllI[14], Crossing3.llIIlIllIllllI[0], Crossing3.llIIlIllIllllI[10], Crossing3.llIIlIllIllllI[14], Crossing3.llIIlIllIllllI[10], Blocks.nether_brick.getDefaultState(), Blocks.nether_brick.getDefaultState(), (boolean)(Crossing3.llIIlIllIllllI[0] != 0));
            this.fillWithBlocks(llllllllllllIlllIIIlIIlIIlllIlll, llllllllllllIlllIIIlIIlIIlllllIl, Crossing3.llIIlIllIllllI[10], Crossing3.llIIlIllIllllI[14], Crossing3.llIIlIllIllllI[11], Crossing3.llIIlIllIllllI[10], Crossing3.llIIlIllIllllI[14], Crossing3.llIIlIllIllllI[13], Blocks.nether_brick.getDefaultState(), Blocks.nether_brick.getDefaultState(), (boolean)(Crossing3.llIIlIllIllllI[0] != 0));
            this.fillWithBlocks(llllllllllllIlllIIIlIIlIIlllIlll, llllllllllllIlllIIIlIIlIIlllllIl, Crossing3.llIIlIllIllllI[11], Crossing3.llIIlIllIllllI[14], Crossing3.llIIlIllIllllI[0], Crossing3.llIIlIllIllllI[11], Crossing3.llIIlIllIllllI[14], Crossing3.llIIlIllIllllI[10], Blocks.nether_brick.getDefaultState(), Blocks.nether_brick.getDefaultState(), (boolean)(Crossing3.llIIlIllIllllI[0] != 0));
            this.fillWithBlocks(llllllllllllIlllIIIlIIlIIlllIlll, llllllllllllIlllIIIlIIlIIlllllIl, Crossing3.llIIlIllIllllI[11], Crossing3.llIIlIllIllllI[14], Crossing3.llIIlIllIllllI[11], Crossing3.llIIlIllIllllI[11], Crossing3.llIIlIllIllllI[14], Crossing3.llIIlIllIllllI[13], Blocks.nether_brick.getDefaultState(), Blocks.nether_brick.getDefaultState(), (boolean)(Crossing3.llIIlIllIllllI[0] != 0));
            this.fillWithBlocks(llllllllllllIlllIIIlIIlIIlllIlll, llllllllllllIlllIIIlIIlIIlllllIl, Crossing3.llIIlIllIllllI[0], Crossing3.llIIlIllIllllI[14], Crossing3.llIIlIllIllllI[10], Crossing3.llIIlIllIllllI[10], Crossing3.llIIlIllIllllI[14], Crossing3.llIIlIllIllllI[10], Blocks.nether_brick.getDefaultState(), Blocks.nether_brick.getDefaultState(), (boolean)(Crossing3.llIIlIllIllllI[0] != 0));
            this.fillWithBlocks(llllllllllllIlllIIIlIIlIIlllIlll, llllllllllllIlllIIIlIIlIIlllllIl, Crossing3.llIIlIllIllllI[11], Crossing3.llIIlIllIllllI[14], Crossing3.llIIlIllIllllI[10], Crossing3.llIIlIllIllllI[13], Crossing3.llIIlIllIllllI[14], Crossing3.llIIlIllIllllI[10], Blocks.nether_brick.getDefaultState(), Blocks.nether_brick.getDefaultState(), (boolean)(Crossing3.llIIlIllIllllI[0] != 0));
            this.fillWithBlocks(llllllllllllIlllIIIlIIlIIlllIlll, llllllllllllIlllIIIlIIlIIlllllIl, Crossing3.llIIlIllIllllI[0], Crossing3.llIIlIllIllllI[14], Crossing3.llIIlIllIllllI[11], Crossing3.llIIlIllIllllI[10], Crossing3.llIIlIllIllllI[14], Crossing3.llIIlIllIllllI[11], Blocks.nether_brick.getDefaultState(), Blocks.nether_brick.getDefaultState(), (boolean)(Crossing3.llIIlIllIllllI[0] != 0));
            this.fillWithBlocks(llllllllllllIlllIIIlIIlIIlllIlll, llllllllllllIlllIIIlIIlIIlllllIl, Crossing3.llIIlIllIllllI[11], Crossing3.llIIlIllIllllI[14], Crossing3.llIIlIllIllllI[11], Crossing3.llIIlIllIllllI[13], Crossing3.llIIlIllIllllI[14], Crossing3.llIIlIllIllllI[11], Blocks.nether_brick.getDefaultState(), Blocks.nether_brick.getDefaultState(), (boolean)(Crossing3.llIIlIllIllllI[0] != 0));
            this.fillWithBlocks(llllllllllllIlllIIIlIIlIIlllIlll, llllllllllllIlllIIIlIIlIIlllllIl, Crossing3.llIIlIllIllllI[10], Crossing3.llIIlIllIllllI[15], Crossing3.llIIlIllIllllI[0], Crossing3.llIIlIllIllllI[11], Crossing3.llIIlIllIllllI[15], Crossing3.llIIlIllIllllI[14], Blocks.nether_brick.getDefaultState(), Blocks.nether_brick.getDefaultState(), (boolean)(Crossing3.llIIlIllIllllI[0] != 0));
            this.fillWithBlocks(llllllllllllIlllIIIlIIlIIlllIlll, llllllllllllIlllIIIlIIlIIlllllIl, Crossing3.llIIlIllIllllI[10], Crossing3.llIIlIllIllllI[15], Crossing3.llIIlIllIllllI[16], Crossing3.llIIlIllIllllI[11], Crossing3.llIIlIllIllllI[15], Crossing3.llIIlIllIllllI[13], Blocks.nether_brick.getDefaultState(), Blocks.nether_brick.getDefaultState(), (boolean)(Crossing3.llIIlIllIllllI[0] != 0));
            this.fillWithBlocks(llllllllllllIlllIIIlIIlIIlllIlll, llllllllllllIlllIIIlIIlIIlllllIl, Crossing3.llIIlIllIllllI[10], Crossing3.llIIlIllIllllI[0], Crossing3.llIIlIllIllllI[0], Crossing3.llIIlIllIllllI[11], Crossing3.llIIlIllIllllI[3], Crossing3.llIIlIllIllllI[6], Blocks.nether_brick.getDefaultState(), Blocks.nether_brick.getDefaultState(), (boolean)(Crossing3.llIIlIllIllllI[0] != 0));
            this.fillWithBlocks(llllllllllllIlllIIIlIIlIIlllIlll, llllllllllllIlllIIIlIIlIIlllllIl, Crossing3.llIIlIllIllllI[10], Crossing3.llIIlIllIllllI[0], Crossing3.llIIlIllIllllI[17], Crossing3.llIIlIllIllllI[11], Crossing3.llIIlIllIllllI[3], Crossing3.llIIlIllIllllI[13], Blocks.nether_brick.getDefaultState(), Blocks.nether_brick.getDefaultState(), (boolean)(Crossing3.llIIlIllIllllI[0] != 0));
            int llllllllllllIlllIIIlIIlIIlllllII = Crossing3.llIIlIllIllllI[10];
            "".length();
            if (-"   ".length() >= 0) {
                return ((0xC4 ^ 0xC2) & ~(0x59 ^ 0x5F)) != 0x0;
            }
            while (!lIIIllIlllIllIll(llllllllllllIlllIIIlIIlIIlllllII, Crossing3.llIIlIllIllllI[11])) {
                int llllllllllllIlllIIIlIIlIIllllIll = Crossing3.llIIlIllIllllI[0];
                "".length();
                if (null != null) {
                    return ((0xFC ^ 0xBB ^ (0x41 ^ 0x36)) & (0x18 ^ 0x1E ^ (0xB0 ^ 0x86) ^ -" ".length())) != 0x0;
                }
                while (!lIIIllIlllIllIll(llllllllllllIlllIIIlIIlIIllllIll, Crossing3.llIIlIllIllllI[15])) {
                    this.replaceAirAndLiquidDownwards(llllllllllllIlllIIIlIIlIIlllIlll, Blocks.nether_brick.getDefaultState(), llllllllllllIlllIIIlIIlIIlllllII, Crossing3.llIIlIllIllllI[18], llllllllllllIlllIIIlIIlIIllllIll, llllllllllllIlllIIIlIIlIIlllllIl);
                    this.replaceAirAndLiquidDownwards(llllllllllllIlllIIIlIIlIIlllIlll, Blocks.nether_brick.getDefaultState(), llllllllllllIlllIIIlIIlIIlllllII, Crossing3.llIIlIllIllllI[18], Crossing3.llIIlIllIllllI[13] - llllllllllllIlllIIIlIIlIIllllIll, llllllllllllIlllIIIlIIlIIlllllIl);
                    ++llllllllllllIlllIIIlIIlIIllllIll;
                }
                ++llllllllllllIlllIIIlIIlIIlllllII;
            }
            this.fillWithBlocks(llllllllllllIlllIIIlIIlIIlllIlll, llllllllllllIlllIIIlIIlIIlllllIl, Crossing3.llIIlIllIllllI[0], Crossing3.llIIlIllIllllI[15], Crossing3.llIIlIllIllllI[10], Crossing3.llIIlIllIllllI[14], Crossing3.llIIlIllIllllI[15], Crossing3.llIIlIllIllllI[11], Blocks.nether_brick.getDefaultState(), Blocks.nether_brick.getDefaultState(), (boolean)(Crossing3.llIIlIllIllllI[0] != 0));
            this.fillWithBlocks(llllllllllllIlllIIIlIIlIIlllIlll, llllllllllllIlllIIIlIIlIIlllllIl, Crossing3.llIIlIllIllllI[16], Crossing3.llIIlIllIllllI[15], Crossing3.llIIlIllIllllI[10], Crossing3.llIIlIllIllllI[13], Crossing3.llIIlIllIllllI[15], Crossing3.llIIlIllIllllI[11], Blocks.nether_brick.getDefaultState(), Blocks.nether_brick.getDefaultState(), (boolean)(Crossing3.llIIlIllIllllI[0] != 0));
            this.fillWithBlocks(llllllllllllIlllIIIlIIlIIlllIlll, llllllllllllIlllIIIlIIlIIlllllIl, Crossing3.llIIlIllIllllI[0], Crossing3.llIIlIllIllllI[0], Crossing3.llIIlIllIllllI[10], Crossing3.llIIlIllIllllI[6], Crossing3.llIIlIllIllllI[3], Crossing3.llIIlIllIllllI[11], Blocks.nether_brick.getDefaultState(), Blocks.nether_brick.getDefaultState(), (boolean)(Crossing3.llIIlIllIllllI[0] != 0));
            this.fillWithBlocks(llllllllllllIlllIIIlIIlIIlllIlll, llllllllllllIlllIIIlIIlIIlllllIl, Crossing3.llIIlIllIllllI[17], Crossing3.llIIlIllIllllI[0], Crossing3.llIIlIllIllllI[10], Crossing3.llIIlIllIllllI[13], Crossing3.llIIlIllIllllI[3], Crossing3.llIIlIllIllllI[11], Blocks.nether_brick.getDefaultState(), Blocks.nether_brick.getDefaultState(), (boolean)(Crossing3.llIIlIllIllllI[0] != 0));
            int llllllllllllIlllIIIlIIlIIllllIlI = Crossing3.llIIlIllIllllI[0];
            "".length();
            if (-"  ".length() > 0) {
                return ((0x37 ^ 0x22) & ~(0x3 ^ 0x16)) != 0x0;
            }
            while (!lIIIllIlllIllIll(llllllllllllIlllIIIlIIlIIllllIlI, Crossing3.llIIlIllIllllI[15])) {
                int llllllllllllIlllIIIlIIlIIllllIIl = Crossing3.llIIlIllIllllI[10];
                "".length();
                if ("  ".length() == 0) {
                    return ((0x2C ^ 0x17) & ~(0x6 ^ 0x3D)) != 0x0;
                }
                while (!lIIIllIlllIllIll(llllllllllllIlllIIIlIIlIIllllIIl, Crossing3.llIIlIllIllllI[11])) {
                    this.replaceAirAndLiquidDownwards(llllllllllllIlllIIIlIIlIIlllIlll, Blocks.nether_brick.getDefaultState(), llllllllllllIlllIIIlIIlIIllllIlI, Crossing3.llIIlIllIllllI[18], llllllllllllIlllIIIlIIlIIllllIIl, llllllllllllIlllIIIlIIlIIlllllIl);
                    this.replaceAirAndLiquidDownwards(llllllllllllIlllIIIlIIlIIlllIlll, Blocks.nether_brick.getDefaultState(), Crossing3.llIIlIllIllllI[13] - llllllllllllIlllIIIlIIlIIllllIlI, Crossing3.llIIlIllIllllI[18], llllllllllllIlllIIIlIIlIIllllIIl, llllllllllllIlllIIIlIIlIIlllllIl);
                    ++llllllllllllIlllIIIlIIlIIllllIIl;
                }
                ++llllllllllllIlllIIIlIIlIIllllIlI;
            }
            return Crossing3.llIIlIllIllllI[3] != 0;
        }
        
        public static Crossing3 func_175885_a(final List<StructureComponent> llllllllllllIlllIIIlIIlIlIIIllIl, final Random llllllllllllIlllIIIlIIlIlIIlIlII, final int llllllllllllIlllIIIlIIlIlIIlIIll, final int llllllllllllIlllIIIlIIlIlIIIlIlI, final int llllllllllllIlllIIIlIIlIlIIIlIIl, final EnumFacing llllllllllllIlllIIIlIIlIlIIlIIII, final int llllllllllllIlllIIIlIIlIlIIIIlll) {
            final StructureBoundingBox llllllllllllIlllIIIlIIlIlIIIlllI = StructureBoundingBox.getComponentToAddBoundingBox(llllllllllllIlllIIIlIIlIlIIlIIll, llllllllllllIlllIIIlIIlIlIIIlIlI, llllllllllllIlllIIIlIIlIlIIIlIIl, Crossing3.llIIlIllIllllI[7], Crossing3.llIIlIllIllllI[8], Crossing3.llIIlIllIllllI[0], Crossing3.llIIlIllIllllI[2], Crossing3.llIIlIllIllllI[9], Crossing3.llIIlIllIllllI[2], llllllllllllIlllIIIlIIlIlIIlIIII);
            Crossing3 crossing3;
            if (lIIIllIlllIllIIl(Piece.isAboveGround(llllllllllllIlllIIIlIIlIlIIIlllI) ? 1 : 0) && lIIIllIlllIllIlI(StructureComponent.findIntersecting(llllllllllllIlllIIIlIIlIlIIIllIl, llllllllllllIlllIIIlIIlIlIIIlllI))) {
                crossing3 = new Crossing3(llllllllllllIlllIIIlIIlIlIIIIlll, llllllllllllIlllIIIlIIlIlIIlIlII, llllllllllllIlllIIIlIIlIlIIIlllI, llllllllllllIlllIIIlIIlIlIIlIIII);
                "".length();
                if ("   ".length() <= " ".length()) {
                    return null;
                }
            }
            else {
                crossing3 = null;
            }
            return crossing3;
        }
        
        private static boolean lIIIllIlllIllIlI(final Object llllllllllllIlllIIIlIIlIIllIlIlI) {
            return llllllllllllIlllIIIlIIlIIllIlIlI == null;
        }
        
        protected Crossing3(final Random llllllllllllIlllIIIlIIlIlIlIllII, final int llllllllllllIlllIIIlIIlIlIlIllll, final int llllllllllllIlllIIIlIIlIlIlIlIlI) {
            super(Crossing3.llIIlIllIllllI[0]);
            this.coordBaseMode = EnumFacing.Plane.HORIZONTAL.random(llllllllllllIlllIIIlIIlIlIlIllII);
            switch ($SWITCH_TABLE$net$minecraft$util$EnumFacing()[this.coordBaseMode.ordinal()]) {
                case 3:
                case 4: {
                    this.boundingBox = new StructureBoundingBox(llllllllllllIlllIIIlIIlIlIlIllll, Crossing3.llIIlIllIllllI[1], llllllllllllIlllIIIlIIlIlIlIlIlI, llllllllllllIlllIIIlIIlIlIlIllll + Crossing3.llIIlIllIllllI[2] - Crossing3.llIIlIllIllllI[3], Crossing3.llIIlIllIllllI[4], llllllllllllIlllIIIlIIlIlIlIlIlI + Crossing3.llIIlIllIllllI[2] - Crossing3.llIIlIllIllllI[3]);
                    "".length();
                    if (((0x89 ^ 0x96) & ~(0xBB ^ 0xA4)) != ((0x4B ^ 0x57) & ~(0x8D ^ 0x91))) {
                        throw null;
                    }
                    break;
                }
                default: {
                    this.boundingBox = new StructureBoundingBox(llllllllllllIlllIIIlIIlIlIlIllll, Crossing3.llIIlIllIllllI[1], llllllllllllIlllIIIlIIlIlIlIlIlI, llllllllllllIlllIIIlIIlIlIlIllll + Crossing3.llIIlIllIllllI[2] - Crossing3.llIIlIllIllllI[3], Crossing3.llIIlIllIllllI[4], llllllllllllIlllIIIlIIlIlIlIlIlI + Crossing3.llIIlIllIllllI[2] - Crossing3.llIIlIllIllllI[3]);
                    break;
                }
            }
        }
        
        public Crossing3() {
        }
        
        static /* synthetic */ int[] $SWITCH_TABLE$net$minecraft$util$EnumFacing() {
            final int[] $switch_TABLE$net$minecraft$util$EnumFacing = Crossing3.$SWITCH_TABLE$net$minecraft$util$EnumFacing;
            if (lIIIllIlllIlllII($switch_TABLE$net$minecraft$util$EnumFacing)) {
                return $switch_TABLE$net$minecraft$util$EnumFacing;
            }
            "".length();
            final boolean llllllllllllIlllIIIlIIlIIlllIIlI = (Object)new int[EnumFacing.values().length];
            try {
                llllllllllllIlllIIIlIIlIIlllIIlI[EnumFacing.DOWN.ordinal()] = Crossing3.llIIlIllIllllI[3];
                "".length();
                if (-(0x56 ^ 0x5F ^ (0x51 ^ 0x5D)) >= 0) {
                    return null;
                }
            }
            catch (NoSuchFieldError noSuchFieldError) {
                "".length();
            }
            try {
                llllllllllllIlllIIIlIIlIIlllIIlI[EnumFacing.EAST.ordinal()] = Crossing3.llIIlIllIllllI[19];
                "".length();
                if ("   ".length() < "   ".length()) {
                    return null;
                }
            }
            catch (NoSuchFieldError noSuchFieldError2) {
                "".length();
            }
            try {
                llllllllllllIlllIIIlIIlIIlllIIlI[EnumFacing.NORTH.ordinal()] = Crossing3.llIIlIllIllllI[6];
                "".length();
                if (((0x4C ^ 0x44) & ~(0xAA ^ 0xA2)) != 0x0) {
                    return null;
                }
            }
            catch (NoSuchFieldError noSuchFieldError3) {
                "".length();
            }
            try {
                llllllllllllIlllIIIlIIlIIlllIIlI[EnumFacing.SOUTH.ordinal()] = Crossing3.llIIlIllIllllI[12];
                "".length();
                if (-(0 + 137 - 73 + 105 ^ 20 + 46 + 48 + 58) >= 0) {
                    return null;
                }
            }
            catch (NoSuchFieldError noSuchFieldError4) {
                "".length();
            }
            try {
                llllllllllllIlllIIIlIIlIIlllIIlI[EnumFacing.UP.ordinal()] = Crossing3.llIIlIllIllllI[15];
                "".length();
                if (-" ".length() == (108 + 92 - 65 + 0 ^ 0 + 14 + 84 + 33)) {
                    return null;
                }
            }
            catch (NoSuchFieldError noSuchFieldError5) {
                "".length();
            }
            try {
                llllllllllllIlllIIIlIIlIIlllIIlI[EnumFacing.WEST.ordinal()] = Crossing3.llIIlIllIllllI[14];
                "".length();
                if (" ".length() != " ".length()) {
                    return null;
                }
            }
            catch (NoSuchFieldError noSuchFieldError6) {
                "".length();
            }
            return Crossing3.$SWITCH_TABLE$net$minecraft$util$EnumFacing = (int[])(Object)llllllllllllIlllIIIlIIlIIlllIIlI;
        }
        
        public Crossing3(final int llllllllllllIlllIIIlIIlIlIllllIl, final Random llllllllllllIlllIIIlIIlIlIllllII, final StructureBoundingBox llllllllllllIlllIIIlIIlIlIlllIll, final EnumFacing llllllllllllIlllIIIlIIlIlIllIllI) {
            super(llllllllllllIlllIIIlIIlIlIllllIl);
            this.coordBaseMode = llllllllllllIlllIIIlIIlIlIllIllI;
            this.boundingBox = llllllllllllIlllIIIlIIlIlIlllIll;
        }
        
        static {
            lIIIllIlllIllIII();
        }
    }
    
    public static class Corridor5 extends Piece
    {
        private static final /* synthetic */ int[] llIllIIIIIllll;
        
        @Override
        public void buildComponent(final StructureComponent llllllllllllIllIlIIIIllIIlIlllll, final List<StructureComponent> llllllllllllIllIlIIIIllIIlIllIlI, final Random llllllllllllIllIlIIIIllIIlIllIIl) {
            this.getNextComponentNormal((Start)llllllllllllIllIlIIIIllIIlIlllll, llllllllllllIllIlIIIIllIIlIllIlI, llllllllllllIllIlIIIIllIIlIllIIl, Corridor5.llIllIIIIIllll[0], Corridor5.llIllIIIIIllll[1], (boolean)(Corridor5.llIllIIIIIllll[0] != 0));
            "".length();
        }
        
        public Corridor5() {
        }
        
        private static boolean lIIlIllIIlIIIIlI(final int llllllllllllIllIlIIIIllIIIlIlllI, final int llllllllllllIllIlIIIIllIIIlIllIl) {
            return llllllllllllIllIlIIIIllIIIlIlllI > llllllllllllIllIlIIIIllIIIlIllIl;
        }
        
        private static boolean lIIlIllIIlIIIIIl(final Object llllllllllllIllIlIIIIllIIIlIlIll) {
            return llllllllllllIllIlIIIIllIIIlIlIll == null;
        }
        
        public static Corridor5 func_175877_a(final List<StructureComponent> llllllllllllIllIlIIIIllIIlIIlIII, final Random llllllllllllIllIlIIIIllIIlIIllll, final int llllllllllllIllIlIIIIllIIlIIlllI, final int llllllllllllIllIlIIIIllIIlIIIlIl, final int llllllllllllIllIlIIIIllIIlIIllII, final EnumFacing llllllllllllIllIlIIIIllIIlIIlIll, final int llllllllllllIllIlIIIIllIIlIIIIlI) {
            final StructureBoundingBox llllllllllllIllIlIIIIllIIlIIlIIl = StructureBoundingBox.getComponentToAddBoundingBox(llllllllllllIllIlIIIIllIIlIIlllI, llllllllllllIllIlIIIIllIIlIIIlIl, llllllllllllIllIlIIIIllIIlIIllII, Corridor5.llIllIIIIIllll[2], Corridor5.llIllIIIIIllll[1], Corridor5.llIllIIIIIllll[1], Corridor5.llIllIIIIIllll[3], Corridor5.llIllIIIIIllll[4], Corridor5.llIllIIIIIllll[3], llllllllllllIllIlIIIIllIIlIIlIll);
            Corridor5 corridor5;
            if (lIIlIllIIlIIIIII(Piece.isAboveGround(llllllllllllIllIlIIIIllIIlIIlIIl) ? 1 : 0) && lIIlIllIIlIIIIIl(StructureComponent.findIntersecting(llllllllllllIllIlIIIIllIIlIIlIII, llllllllllllIllIlIIIIllIIlIIlIIl))) {
                corridor5 = new Corridor5(llllllllllllIllIlIIIIllIIlIIIIlI, llllllllllllIllIlIIIIllIIlIIllll, llllllllllllIllIlIIIIllIIlIIlIIl, llllllllllllIllIlIIIIllIIlIIlIll);
                "".length();
                if (null != null) {
                    return null;
                }
            }
            else {
                corridor5 = null;
            }
            return corridor5;
        }
        
        @Override
        public boolean addComponentParts(final World llllllllllllIllIlIIIIllIIIlllIlI, final Random llllllllllllIllIlIIIIllIIIlllIIl, final StructureBoundingBox llllllllllllIllIlIIIIllIIIlllIII) {
            this.fillWithBlocks(llllllllllllIllIlIIIIllIIIlllIlI, llllllllllllIllIlIIIIllIIIlllIII, Corridor5.llIllIIIIIllll[1], Corridor5.llIllIIIIIllll[1], Corridor5.llIllIIIIIllll[1], Corridor5.llIllIIIIIllll[5], Corridor5.llIllIIIIIllll[0], Corridor5.llIllIIIIIllll[5], Blocks.nether_brick.getDefaultState(), Blocks.nether_brick.getDefaultState(), (boolean)(Corridor5.llIllIIIIIllll[1] != 0));
            this.fillWithBlocks(llllllllllllIllIlIIIIllIIIlllIlI, llllllllllllIllIlIIIIllIIIlllIII, Corridor5.llIllIIIIIllll[1], Corridor5.llIllIIIIIllll[6], Corridor5.llIllIIIIIllll[1], Corridor5.llIllIIIIIllll[5], Corridor5.llIllIIIIIllll[3], Corridor5.llIllIIIIIllll[5], Blocks.air.getDefaultState(), Blocks.air.getDefaultState(), (boolean)(Corridor5.llIllIIIIIllll[1] != 0));
            this.fillWithBlocks(llllllllllllIllIlIIIIllIIIlllIlI, llllllllllllIllIlIIIIllIIIlllIII, Corridor5.llIllIIIIIllll[1], Corridor5.llIllIIIIIllll[6], Corridor5.llIllIIIIIllll[1], Corridor5.llIllIIIIIllll[1], Corridor5.llIllIIIIIllll[3], Corridor5.llIllIIIIIllll[5], Blocks.nether_brick.getDefaultState(), Blocks.nether_brick.getDefaultState(), (boolean)(Corridor5.llIllIIIIIllll[1] != 0));
            this.fillWithBlocks(llllllllllllIllIlIIIIllIIIlllIlI, llllllllllllIllIlIIIIllIIIlllIII, Corridor5.llIllIIIIIllll[5], Corridor5.llIllIIIIIllll[6], Corridor5.llIllIIIIIllll[1], Corridor5.llIllIIIIIllll[5], Corridor5.llIllIIIIIllll[3], Corridor5.llIllIIIIIllll[5], Blocks.nether_brick.getDefaultState(), Blocks.nether_brick.getDefaultState(), (boolean)(Corridor5.llIllIIIIIllll[1] != 0));
            this.fillWithBlocks(llllllllllllIllIlIIIIllIIIlllIlI, llllllllllllIllIlIIIIllIIIlllIII, Corridor5.llIllIIIIIllll[1], Corridor5.llIllIIIIIllll[7], Corridor5.llIllIIIIIllll[0], Corridor5.llIllIIIIIllll[1], Corridor5.llIllIIIIIllll[5], Corridor5.llIllIIIIIllll[0], Blocks.nether_brick_fence.getDefaultState(), Blocks.nether_brick_fence.getDefaultState(), (boolean)(Corridor5.llIllIIIIIllll[1] != 0));
            this.fillWithBlocks(llllllllllllIllIlIIIIllIIIlllIlI, llllllllllllIllIlIIIIllIIIlllIII, Corridor5.llIllIIIIIllll[1], Corridor5.llIllIIIIIllll[7], Corridor5.llIllIIIIIllll[7], Corridor5.llIllIIIIIllll[1], Corridor5.llIllIIIIIllll[5], Corridor5.llIllIIIIIllll[7], Blocks.nether_brick_fence.getDefaultState(), Blocks.nether_brick_fence.getDefaultState(), (boolean)(Corridor5.llIllIIIIIllll[1] != 0));
            this.fillWithBlocks(llllllllllllIllIlIIIIllIIIlllIlI, llllllllllllIllIlIIIIllIIIlllIII, Corridor5.llIllIIIIIllll[5], Corridor5.llIllIIIIIllll[7], Corridor5.llIllIIIIIllll[0], Corridor5.llIllIIIIIllll[5], Corridor5.llIllIIIIIllll[5], Corridor5.llIllIIIIIllll[0], Blocks.nether_brick_fence.getDefaultState(), Blocks.nether_brick_fence.getDefaultState(), (boolean)(Corridor5.llIllIIIIIllll[1] != 0));
            this.fillWithBlocks(llllllllllllIllIlIIIIllIIIlllIlI, llllllllllllIllIlIIIIllIIIlllIII, Corridor5.llIllIIIIIllll[5], Corridor5.llIllIIIIIllll[7], Corridor5.llIllIIIIIllll[7], Corridor5.llIllIIIIIllll[5], Corridor5.llIllIIIIIllll[5], Corridor5.llIllIIIIIllll[7], Blocks.nether_brick_fence.getDefaultState(), Blocks.nether_brick_fence.getDefaultState(), (boolean)(Corridor5.llIllIIIIIllll[1] != 0));
            this.fillWithBlocks(llllllllllllIllIlIIIIllIIIlllIlI, llllllllllllIllIlIIIIllIIIlllIII, Corridor5.llIllIIIIIllll[1], Corridor5.llIllIIIIIllll[8], Corridor5.llIllIIIIIllll[1], Corridor5.llIllIIIIIllll[5], Corridor5.llIllIIIIIllll[8], Corridor5.llIllIIIIIllll[5], Blocks.nether_brick.getDefaultState(), Blocks.nether_brick.getDefaultState(), (boolean)(Corridor5.llIllIIIIIllll[1] != 0));
            int llllllllllllIllIlIIIIllIIIllIlll = Corridor5.llIllIIIIIllll[1];
            "".length();
            if ("   ".length() == 0) {
                return ((0xB8 ^ 0x99) & ~(0xD ^ 0x2C)) != 0x0;
            }
            while (!lIIlIllIIlIIIIlI(llllllllllllIllIlIIIIllIIIllIlll, Corridor5.llIllIIIIIllll[5])) {
                int llllllllllllIllIlIIIIllIIIllIllI = Corridor5.llIllIIIIIllll[1];
                "".length();
                if (" ".length() == 0) {
                    return ((0x95 ^ 0xB6 ^ (0x12 ^ 0x38)) & (0xA4 ^ 0x81 ^ (0x60 ^ 0x4C) ^ -" ".length())) != 0x0;
                }
                while (!lIIlIllIIlIIIIlI(llllllllllllIllIlIIIIllIIIllIllI, Corridor5.llIllIIIIIllll[5])) {
                    this.replaceAirAndLiquidDownwards(llllllllllllIllIlIIIIllIIIlllIlI, Blocks.nether_brick.getDefaultState(), llllllllllllIllIlIIIIllIIIllIlll, Corridor5.llIllIIIIIllll[2], llllllllllllIllIlIIIIllIIIllIllI, llllllllllllIllIlIIIIllIIIlllIII);
                    ++llllllllllllIllIlIIIIllIIIllIllI;
                }
                ++llllllllllllIllIlIIIIllIIIllIlll;
            }
            return Corridor5.llIllIIIIIllll[0] != 0;
        }
        
        private static boolean lIIlIllIIlIIIIII(final int llllllllllllIllIlIIIIllIIIlIlIIl) {
            return llllllllllllIllIlIIIIllIIIlIlIIl != 0;
        }
        
        static {
            lIIlIllIIIllllll();
        }
        
        public Corridor5(final int llllllllllllIllIlIIIIllIIllIllII, final Random llllllllllllIllIlIIIIllIIllIlIll, final StructureBoundingBox llllllllllllIllIlIIIIllIIllIlIlI, final EnumFacing llllllllllllIllIlIIIIllIIllIIlIl) {
            super(llllllllllllIllIlIIIIllIIllIllII);
            this.coordBaseMode = llllllllllllIllIlIIIIllIIllIIlIl;
            this.boundingBox = llllllllllllIllIlIIIIllIIllIlIlI;
        }
        
        private static void lIIlIllIIIllllll() {
            (llIllIIIIIllll = new int[9])[0] = " ".length();
            Corridor5.llIllIIIIIllll[1] = ((0xE5 ^ 0xC7 ^ (0x80 ^ 0xB8)) & (36 + 160 - 86 + 57 ^ 64 + 161 - 206 + 170 ^ -" ".length()));
            Corridor5.llIllIIIIIllll[2] = -" ".length();
            Corridor5.llIllIIIIIllll[3] = (0x7B ^ 0x3F ^ (0x69 ^ 0x28));
            Corridor5.llIllIIIIIllll[4] = (0x81 ^ 0x86);
            Corridor5.llIllIIIIIllll[5] = (0x4D ^ 0x26 ^ (0xE ^ 0x61));
            Corridor5.llIllIIIIIllll[6] = "  ".length();
            Corridor5.llIllIIIIIllll[7] = "   ".length();
            Corridor5.llIllIIIIIllll[8] = (0x80 ^ 0x86);
        }
    }
    
    public static class Entrance extends Piece
    {
        private static final /* synthetic */ int[] lIllIlIlIllIII;
        
        public Entrance() {
        }
        
        public static Entrance func_175881_a(final List<StructureComponent> llllllllllllIlllllllllIllllIlIll, final Random llllllllllllIlllllllllIlllllIIlI, final int llllllllllllIlllllllllIlllllIIIl, final int llllllllllllIlllllllllIllllIlIII, final int llllllllllllIlllllllllIllllIllll, final EnumFacing llllllllllllIlllllllllIllllIIllI, final int llllllllllllIlllllllllIllllIllIl) {
            final StructureBoundingBox llllllllllllIlllllllllIllllIllII = StructureBoundingBox.getComponentToAddBoundingBox(llllllllllllIlllllllllIlllllIIIl, llllllllllllIlllllllllIllllIlIII, llllllllllllIlllllllllIllllIllll, Entrance.lIllIlIlIllIII[3], Entrance.lIllIlIlIllIII[4], Entrance.lIllIlIlIllIII[5], Entrance.lIllIlIlIllIII[6], Entrance.lIllIlIlIllIII[7], Entrance.lIllIlIlIllIII[6], llllllllllllIlllllllllIllllIIllI);
            Entrance entrance;
            if (llllllIllIlIIII(Piece.isAboveGround(llllllllllllIlllllllllIllllIllII) ? 1 : 0) && llllllIllIlIIIl(StructureComponent.findIntersecting(llllllllllllIlllllllllIllllIlIll, llllllllllllIlllllllllIllllIllII))) {
                entrance = new Entrance(llllllllllllIlllllllllIllllIllIl, llllllllllllIlllllllllIlllllIIlI, llllllllllllIlllllllllIllllIllII, llllllllllllIlllllllllIllllIIllI);
                "".length();
                if ((0x19 ^ 0x1C) == 0x0) {
                    return null;
                }
            }
            else {
                entrance = null;
            }
            return entrance;
        }
        
        private static boolean llllllIllIlIIlI(final int llllllllllllIlllllllllIlllIIlIlI, final int llllllllllllIlllllllllIlllIIlIIl) {
            return llllllllllllIlllllllllIlllIIlIlI > llllllllllllIlllllllllIlllIIlIIl;
        }
        
        private static void llllllIllIIllll() {
            (lIllIlIlIllIII = new int[18])[0] = (0x5F ^ 0x31 ^ (0x64 ^ 0xF));
            Entrance.lIllIlIlIllIII[1] = "   ".length();
            Entrance.lIllIlIlIllIII[2] = " ".length();
            Entrance.lIllIlIlIllIII[3] = -(0x8A ^ 0x8F);
            Entrance.lIllIlIlIllIII[4] = -"   ".length();
            Entrance.lIllIlIlIllIII[5] = ((0xF7 ^ 0xA2) & ~(0xE3 ^ 0xB6));
            Entrance.lIllIlIlIllIII[6] = (0x28 ^ 0x25);
            Entrance.lIllIlIlIllIII[7] = (0x71 ^ 0x7F);
            Entrance.lIllIlIlIllIII[8] = (0xBA ^ 0xB6);
            Entrance.lIllIlIlIllIII[9] = (0xD3 ^ 0x9F ^ (0x27 ^ 0x6F));
            Entrance.lIllIlIlIllIII[10] = (54 + 63 - 106 + 180 ^ 116 + 20 - 66 + 110);
            Entrance.lIllIlIlIllIII[11] = "  ".length();
            Entrance.lIllIlIlIllIII[12] = (159 + 164 - 136 + 1 ^ 127 + 32 - 124 + 145);
            Entrance.lIllIlIlIllIII[13] = (0x4 ^ 0xE);
            Entrance.lIllIlIlIllIII[14] = (0x1E ^ 0x1B ^ (0xA3 ^ 0xAF));
            Entrance.lIllIlIlIllIII[15] = (106 + 12 - 63 + 87 ^ 111 + 33 - 73 + 66);
            Entrance.lIllIlIlIllIII[16] = -" ".length();
            Entrance.lIllIlIlIllIII[17] = (81 + 35 - 75 + 115 ^ 93 + 124 - 79 + 16);
        }
        
        private static boolean llllllIllIlIIII(final int llllllllllllIlllllllllIlllIIIlIl) {
            return llllllllllllIlllllllllIlllIIIlIl != 0;
        }
        
        private static boolean llllllIllIlIIIl(final Object llllllllllllIlllllllllIlllIIIlll) {
            return llllllllllllIlllllllllIlllIIIlll == null;
        }
        
        @Override
        public boolean addComponentParts(final World llllllllllllIlllllllllIlllIlIIIl, final Random llllllllllllIlllllllllIlllIllIll, final StructureBoundingBox llllllllllllIlllllllllIlllIIllll) {
            this.fillWithBlocks(llllllllllllIlllllllllIlllIlIIIl, llllllllllllIlllllllllIlllIIllll, Entrance.lIllIlIlIllIII[5], Entrance.lIllIlIlIllIII[1], Entrance.lIllIlIlIllIII[5], Entrance.lIllIlIlIllIII[8], Entrance.lIllIlIlIllIII[9], Entrance.lIllIlIlIllIII[8], Blocks.nether_brick.getDefaultState(), Blocks.nether_brick.getDefaultState(), (boolean)(Entrance.lIllIlIlIllIII[5] != 0));
            this.fillWithBlocks(llllllllllllIlllllllllIlllIlIIIl, llllllllllllIlllllllllIlllIIllll, Entrance.lIllIlIlIllIII[5], Entrance.lIllIlIlIllIII[0], Entrance.lIllIlIlIllIII[5], Entrance.lIllIlIlIllIII[8], Entrance.lIllIlIlIllIII[6], Entrance.lIllIlIlIllIII[8], Blocks.air.getDefaultState(), Blocks.air.getDefaultState(), (boolean)(Entrance.lIllIlIlIllIII[5] != 0));
            this.fillWithBlocks(llllllllllllIlllllllllIlllIlIIIl, llllllllllllIlllllllllIlllIIllll, Entrance.lIllIlIlIllIII[5], Entrance.lIllIlIlIllIII[0], Entrance.lIllIlIlIllIII[5], Entrance.lIllIlIlIllIII[2], Entrance.lIllIlIlIllIII[8], Entrance.lIllIlIlIllIII[8], Blocks.nether_brick.getDefaultState(), Blocks.nether_brick.getDefaultState(), (boolean)(Entrance.lIllIlIlIllIII[5] != 0));
            this.fillWithBlocks(llllllllllllIlllllllllIlllIlIIIl, llllllllllllIlllllllllIlllIIllll, Entrance.lIllIlIlIllIII[10], Entrance.lIllIlIlIllIII[0], Entrance.lIllIlIlIllIII[5], Entrance.lIllIlIlIllIII[8], Entrance.lIllIlIlIllIII[8], Entrance.lIllIlIlIllIII[8], Blocks.nether_brick.getDefaultState(), Blocks.nether_brick.getDefaultState(), (boolean)(Entrance.lIllIlIlIllIII[5] != 0));
            this.fillWithBlocks(llllllllllllIlllllllllIlllIlIIIl, llllllllllllIlllllllllIlllIIllll, Entrance.lIllIlIlIllIII[11], Entrance.lIllIlIlIllIII[0], Entrance.lIllIlIlIllIII[10], Entrance.lIllIlIlIllIII[9], Entrance.lIllIlIlIllIII[8], Entrance.lIllIlIlIllIII[8], Blocks.nether_brick.getDefaultState(), Blocks.nether_brick.getDefaultState(), (boolean)(Entrance.lIllIlIlIllIII[5] != 0));
            this.fillWithBlocks(llllllllllllIlllllllllIlllIlIIIl, llllllllllllIlllllllllIlllIIllll, Entrance.lIllIlIlIllIII[12], Entrance.lIllIlIlIllIII[0], Entrance.lIllIlIlIllIII[10], Entrance.lIllIlIlIllIII[13], Entrance.lIllIlIlIllIII[8], Entrance.lIllIlIlIllIII[8], Blocks.nether_brick.getDefaultState(), Blocks.nether_brick.getDefaultState(), (boolean)(Entrance.lIllIlIlIllIII[5] != 0));
            this.fillWithBlocks(llllllllllllIlllllllllIlllIlIIIl, llllllllllllIlllllllllIlllIIllll, Entrance.lIllIlIlIllIII[0], Entrance.lIllIlIlIllIII[14], Entrance.lIllIlIlIllIII[10], Entrance.lIllIlIlIllIII[15], Entrance.lIllIlIlIllIII[8], Entrance.lIllIlIlIllIII[8], Blocks.nether_brick.getDefaultState(), Blocks.nether_brick.getDefaultState(), (boolean)(Entrance.lIllIlIlIllIII[5] != 0));
            this.fillWithBlocks(llllllllllllIlllllllllIlllIlIIIl, llllllllllllIlllllllllIlllIIllll, Entrance.lIllIlIlIllIII[11], Entrance.lIllIlIlIllIII[0], Entrance.lIllIlIlIllIII[5], Entrance.lIllIlIlIllIII[9], Entrance.lIllIlIlIllIII[8], Entrance.lIllIlIlIllIII[2], Blocks.nether_brick.getDefaultState(), Blocks.nether_brick.getDefaultState(), (boolean)(Entrance.lIllIlIlIllIII[5] != 0));
            this.fillWithBlocks(llllllllllllIlllllllllIlllIlIIIl, llllllllllllIlllllllllIlllIIllll, Entrance.lIllIlIlIllIII[12], Entrance.lIllIlIlIllIII[0], Entrance.lIllIlIlIllIII[5], Entrance.lIllIlIlIllIII[13], Entrance.lIllIlIlIllIII[8], Entrance.lIllIlIlIllIII[2], Blocks.nether_brick.getDefaultState(), Blocks.nether_brick.getDefaultState(), (boolean)(Entrance.lIllIlIlIllIII[5] != 0));
            this.fillWithBlocks(llllllllllllIlllllllllIlllIlIIIl, llllllllllllIlllllllllIlllIIllll, Entrance.lIllIlIlIllIII[0], Entrance.lIllIlIlIllIII[14], Entrance.lIllIlIlIllIII[5], Entrance.lIllIlIlIllIII[15], Entrance.lIllIlIlIllIII[8], Entrance.lIllIlIlIllIII[2], Blocks.nether_brick.getDefaultState(), Blocks.nether_brick.getDefaultState(), (boolean)(Entrance.lIllIlIlIllIII[5] != 0));
            this.fillWithBlocks(llllllllllllIlllllllllIlllIlIIIl, llllllllllllIlllllllllIlllIIllll, Entrance.lIllIlIlIllIII[11], Entrance.lIllIlIlIllIII[10], Entrance.lIllIlIlIllIII[11], Entrance.lIllIlIlIllIII[13], Entrance.lIllIlIlIllIII[8], Entrance.lIllIlIlIllIII[13], Blocks.nether_brick.getDefaultState(), Blocks.nether_brick.getDefaultState(), (boolean)(Entrance.lIllIlIlIllIII[5] != 0));
            this.fillWithBlocks(llllllllllllIlllllllllIlllIlIIIl, llllllllllllIlllllllllIlllIIllll, Entrance.lIllIlIlIllIII[0], Entrance.lIllIlIlIllIII[12], Entrance.lIllIlIlIllIII[5], Entrance.lIllIlIlIllIII[15], Entrance.lIllIlIlIllIII[12], Entrance.lIllIlIlIllIII[5], Blocks.nether_brick_fence.getDefaultState(), Blocks.nether_brick_fence.getDefaultState(), (boolean)(Entrance.lIllIlIlIllIII[5] != 0));
            int llllllllllllIlllllllllIlllIllIIl = Entrance.lIllIlIlIllIII[2];
            "".length();
            if (null != null) {
                return ((0x49 ^ 0x5B) & ~(0x1A ^ 0x8)) != 0x0;
            }
            while (!llllllIllIlIIlI(llllllllllllIlllllllllIlllIllIIl, Entrance.lIllIlIlIllIII[10])) {
                this.fillWithBlocks(llllllllllllIlllllllllIlllIlIIIl, llllllllllllIlllllllllIlllIIllll, llllllllllllIlllllllllIlllIllIIl, Entrance.lIllIlIlIllIII[13], Entrance.lIllIlIlIllIII[5], llllllllllllIlllllllllIlllIllIIl, Entrance.lIllIlIlIllIII[10], Entrance.lIllIlIlIllIII[5], Blocks.nether_brick_fence.getDefaultState(), Blocks.nether_brick_fence.getDefaultState(), (boolean)(Entrance.lIllIlIlIllIII[5] != 0));
                this.fillWithBlocks(llllllllllllIlllllllllIlllIlIIIl, llllllllllllIlllllllllIlllIIllll, llllllllllllIlllllllllIlllIllIIl, Entrance.lIllIlIlIllIII[13], Entrance.lIllIlIlIllIII[8], llllllllllllIlllllllllIlllIllIIl, Entrance.lIllIlIlIllIII[10], Entrance.lIllIlIlIllIII[8], Blocks.nether_brick_fence.getDefaultState(), Blocks.nether_brick_fence.getDefaultState(), (boolean)(Entrance.lIllIlIlIllIII[5] != 0));
                this.fillWithBlocks(llllllllllllIlllllllllIlllIlIIIl, llllllllllllIlllllllllIlllIIllll, Entrance.lIllIlIlIllIII[5], Entrance.lIllIlIlIllIII[13], llllllllllllIlllllllllIlllIllIIl, Entrance.lIllIlIlIllIII[5], Entrance.lIllIlIlIllIII[10], llllllllllllIlllllllllIlllIllIIl, Blocks.nether_brick_fence.getDefaultState(), Blocks.nether_brick_fence.getDefaultState(), (boolean)(Entrance.lIllIlIlIllIII[5] != 0));
                this.fillWithBlocks(llllllllllllIlllllllllIlllIlIIIl, llllllllllllIlllllllllIlllIIllll, Entrance.lIllIlIlIllIII[8], Entrance.lIllIlIlIllIII[13], llllllllllllIlllllllllIlllIllIIl, Entrance.lIllIlIlIllIII[8], Entrance.lIllIlIlIllIII[10], llllllllllllIlllllllllIlllIllIIl, Blocks.nether_brick_fence.getDefaultState(), Blocks.nether_brick_fence.getDefaultState(), (boolean)(Entrance.lIllIlIlIllIII[5] != 0));
                this.setBlockState(llllllllllllIlllllllllIlllIlIIIl, Blocks.nether_brick.getDefaultState(), llllllllllllIlllllllllIlllIllIIl, Entrance.lIllIlIlIllIII[6], Entrance.lIllIlIlIllIII[5], llllllllllllIlllllllllIlllIIllll);
                this.setBlockState(llllllllllllIlllllllllIlllIlIIIl, Blocks.nether_brick.getDefaultState(), llllllllllllIlllllllllIlllIllIIl, Entrance.lIllIlIlIllIII[6], Entrance.lIllIlIlIllIII[8], llllllllllllIlllllllllIlllIIllll);
                this.setBlockState(llllllllllllIlllllllllIlllIlIIIl, Blocks.nether_brick.getDefaultState(), Entrance.lIllIlIlIllIII[5], Entrance.lIllIlIlIllIII[6], llllllllllllIlllllllllIlllIllIIl, llllllllllllIlllllllllIlllIIllll);
                this.setBlockState(llllllllllllIlllllllllIlllIlIIIl, Blocks.nether_brick.getDefaultState(), Entrance.lIllIlIlIllIII[8], Entrance.lIllIlIlIllIII[6], llllllllllllIlllllllllIlllIllIIl, llllllllllllIlllllllllIlllIIllll);
                this.setBlockState(llllllllllllIlllllllllIlllIlIIIl, Blocks.nether_brick_fence.getDefaultState(), llllllllllllIlllllllllIlllIllIIl + Entrance.lIllIlIlIllIII[2], Entrance.lIllIlIlIllIII[6], Entrance.lIllIlIlIllIII[5], llllllllllllIlllllllllIlllIIllll);
                this.setBlockState(llllllllllllIlllllllllIlllIlIIIl, Blocks.nether_brick_fence.getDefaultState(), llllllllllllIlllllllllIlllIllIIl + Entrance.lIllIlIlIllIII[2], Entrance.lIllIlIlIllIII[6], Entrance.lIllIlIlIllIII[8], llllllllllllIlllllllllIlllIIllll);
                this.setBlockState(llllllllllllIlllllllllIlllIlIIIl, Blocks.nether_brick_fence.getDefaultState(), Entrance.lIllIlIlIllIII[5], Entrance.lIllIlIlIllIII[6], llllllllllllIlllllllllIlllIllIIl + Entrance.lIllIlIlIllIII[2], llllllllllllIlllllllllIlllIIllll);
                this.setBlockState(llllllllllllIlllllllllIlllIlIIIl, Blocks.nether_brick_fence.getDefaultState(), Entrance.lIllIlIlIllIII[8], Entrance.lIllIlIlIllIII[6], llllllllllllIlllllllllIlllIllIIl + Entrance.lIllIlIlIllIII[2], llllllllllllIlllllllllIlllIIllll);
                llllllllllllIlllllllllIlllIllIIl += 2;
            }
            this.setBlockState(llllllllllllIlllllllllIlllIlIIIl, Blocks.nether_brick_fence.getDefaultState(), Entrance.lIllIlIlIllIII[5], Entrance.lIllIlIlIllIII[6], Entrance.lIllIlIlIllIII[5], llllllllllllIlllllllllIlllIIllll);
            this.setBlockState(llllllllllllIlllllllllIlllIlIIIl, Blocks.nether_brick_fence.getDefaultState(), Entrance.lIllIlIlIllIII[5], Entrance.lIllIlIlIllIII[6], Entrance.lIllIlIlIllIII[8], llllllllllllIlllllllllIlllIIllll);
            this.setBlockState(llllllllllllIlllllllllIlllIlIIIl, Blocks.nether_brick_fence.getDefaultState(), Entrance.lIllIlIlIllIII[5], Entrance.lIllIlIlIllIII[6], Entrance.lIllIlIlIllIII[5], llllllllllllIlllllllllIlllIIllll);
            this.setBlockState(llllllllllllIlllllllllIlllIlIIIl, Blocks.nether_brick_fence.getDefaultState(), Entrance.lIllIlIlIllIII[8], Entrance.lIllIlIlIllIII[6], Entrance.lIllIlIlIllIII[5], llllllllllllIlllllllllIlllIIllll);
            int llllllllllllIlllllllllIlllIllIII = Entrance.lIllIlIlIllIII[1];
            "".length();
            if ("   ".length() == (0xC6 ^ 0xC2)) {
                return ((0x58 ^ 0x14) & ~(0x48 ^ 0x4)) != 0x0;
            }
            while (!llllllIllIlIIlI(llllllllllllIlllllllllIlllIllIII, Entrance.lIllIlIlIllIII[14])) {
                this.fillWithBlocks(llllllllllllIlllllllllIlllIlIIIl, llllllllllllIlllllllllIlllIIllll, Entrance.lIllIlIlIllIII[2], Entrance.lIllIlIlIllIII[15], llllllllllllIlllllllllIlllIllIII, Entrance.lIllIlIlIllIII[2], Entrance.lIllIlIlIllIII[12], llllllllllllIlllllllllIlllIllIII, Blocks.nether_brick_fence.getDefaultState(), Blocks.nether_brick_fence.getDefaultState(), (boolean)(Entrance.lIllIlIlIllIII[5] != 0));
                this.fillWithBlocks(llllllllllllIlllllllllIlllIlIIIl, llllllllllllIlllllllllIlllIIllll, Entrance.lIllIlIlIllIII[10], Entrance.lIllIlIlIllIII[15], llllllllllllIlllllllllIlllIllIII, Entrance.lIllIlIlIllIII[10], Entrance.lIllIlIlIllIII[12], llllllllllllIlllllllllIlllIllIII, Blocks.nether_brick_fence.getDefaultState(), Blocks.nether_brick_fence.getDefaultState(), (boolean)(Entrance.lIllIlIlIllIII[5] != 0));
                llllllllllllIlllllllllIlllIllIII += 2;
            }
            this.fillWithBlocks(llllllllllllIlllllllllIlllIlIIIl, llllllllllllIlllllllllIlllIIllll, Entrance.lIllIlIlIllIII[9], Entrance.lIllIlIlIllIII[11], Entrance.lIllIlIlIllIII[5], Entrance.lIllIlIlIllIII[12], Entrance.lIllIlIlIllIII[11], Entrance.lIllIlIlIllIII[8], Blocks.nether_brick.getDefaultState(), Blocks.nether_brick.getDefaultState(), (boolean)(Entrance.lIllIlIlIllIII[5] != 0));
            this.fillWithBlocks(llllllllllllIlllllllllIlllIlIIIl, llllllllllllIlllllllllIlllIIllll, Entrance.lIllIlIlIllIII[5], Entrance.lIllIlIlIllIII[11], Entrance.lIllIlIlIllIII[9], Entrance.lIllIlIlIllIII[8], Entrance.lIllIlIlIllIII[11], Entrance.lIllIlIlIllIII[12], Blocks.nether_brick.getDefaultState(), Blocks.nether_brick.getDefaultState(), (boolean)(Entrance.lIllIlIlIllIII[5] != 0));
            this.fillWithBlocks(llllllllllllIlllllllllIlllIlIIIl, llllllllllllIlllllllllIlllIIllll, Entrance.lIllIlIlIllIII[9], Entrance.lIllIlIlIllIII[5], Entrance.lIllIlIlIllIII[5], Entrance.lIllIlIlIllIII[12], Entrance.lIllIlIlIllIII[2], Entrance.lIllIlIlIllIII[1], Blocks.nether_brick.getDefaultState(), Blocks.nether_brick.getDefaultState(), (boolean)(Entrance.lIllIlIlIllIII[5] != 0));
            this.fillWithBlocks(llllllllllllIlllllllllIlllIlIIIl, llllllllllllIlllllllllIlllIIllll, Entrance.lIllIlIlIllIII[9], Entrance.lIllIlIlIllIII[5], Entrance.lIllIlIlIllIII[14], Entrance.lIllIlIlIllIII[12], Entrance.lIllIlIlIllIII[2], Entrance.lIllIlIlIllIII[8], Blocks.nether_brick.getDefaultState(), Blocks.nether_brick.getDefaultState(), (boolean)(Entrance.lIllIlIlIllIII[5] != 0));
            this.fillWithBlocks(llllllllllllIlllllllllIlllIlIIIl, llllllllllllIlllllllllIlllIIllll, Entrance.lIllIlIlIllIII[5], Entrance.lIllIlIlIllIII[5], Entrance.lIllIlIlIllIII[9], Entrance.lIllIlIlIllIII[1], Entrance.lIllIlIlIllIII[2], Entrance.lIllIlIlIllIII[12], Blocks.nether_brick.getDefaultState(), Blocks.nether_brick.getDefaultState(), (boolean)(Entrance.lIllIlIlIllIII[5] != 0));
            this.fillWithBlocks(llllllllllllIlllllllllIlllIlIIIl, llllllllllllIlllllllllIlllIIllll, Entrance.lIllIlIlIllIII[14], Entrance.lIllIlIlIllIII[5], Entrance.lIllIlIlIllIII[9], Entrance.lIllIlIlIllIII[8], Entrance.lIllIlIlIllIII[2], Entrance.lIllIlIlIllIII[12], Blocks.nether_brick.getDefaultState(), Blocks.nether_brick.getDefaultState(), (boolean)(Entrance.lIllIlIlIllIII[5] != 0));
            int llllllllllllIlllllllllIlllIlIlll = Entrance.lIllIlIlIllIII[9];
            "".length();
            if (((0x9C ^ 0xC7) & ~(0xEA ^ 0xB1)) != 0x0) {
                return ((0xB9 ^ 0x98) & ~(0x46 ^ 0x67)) != 0x0;
            }
            while (!llllllIllIlIIlI(llllllllllllIlllllllllIlllIlIlll, Entrance.lIllIlIlIllIII[12])) {
                int llllllllllllIlllllllllIlllIlIllI = Entrance.lIllIlIlIllIII[5];
                "".length();
                if ("  ".length() == 0) {
                    return ((107 + 144 - 123 + 17 ^ 40 + 153 - 84 + 77) & (139 + 129 - 115 + 81 ^ 62 + 176 - 155 + 110 ^ -" ".length())) != 0x0;
                }
                while (!llllllIllIlIIlI(llllllllllllIlllllllllIlllIlIllI, Entrance.lIllIlIlIllIII[11])) {
                    this.replaceAirAndLiquidDownwards(llllllllllllIlllllllllIlllIlIIIl, Blocks.nether_brick.getDefaultState(), llllllllllllIlllllllllIlllIlIlll, Entrance.lIllIlIlIllIII[16], llllllllllllIlllllllllIlllIlIllI, llllllllllllIlllllllllIlllIIllll);
                    this.replaceAirAndLiquidDownwards(llllllllllllIlllllllllIlllIlIIIl, Blocks.nether_brick.getDefaultState(), llllllllllllIlllllllllIlllIlIlll, Entrance.lIllIlIlIllIII[16], Entrance.lIllIlIlIllIII[8] - llllllllllllIlllllllllIlllIlIllI, llllllllllllIlllllllllIlllIIllll);
                    ++llllllllllllIlllllllllIlllIlIllI;
                }
                ++llllllllllllIlllllllllIlllIlIlll;
            }
            int llllllllllllIlllllllllIlllIlIlIl = Entrance.lIllIlIlIllIII[5];
            "".length();
            if ((0x10 ^ 0x1B ^ (0x71 ^ 0x7E)) <= "  ".length()) {
                return ((0x99 ^ 0xB0 ^ (0x28 ^ 0xF)) & (0x27 ^ 0x2A ^ "   ".length() ^ -" ".length())) != 0x0;
            }
            while (!llllllIllIlIIlI(llllllllllllIlllllllllIlllIlIlIl, Entrance.lIllIlIlIllIII[11])) {
                int llllllllllllIlllllllllIlllIlIlII = Entrance.lIllIlIlIllIII[9];
                "".length();
                if (-(0xB8 ^ 0xBC) >= 0) {
                    return ((0x69 ^ 0x3F) & ~(0xD8 ^ 0x8E)) != 0x0;
                }
                while (!llllllIllIlIIlI(llllllllllllIlllllllllIlllIlIlII, Entrance.lIllIlIlIllIII[12])) {
                    this.replaceAirAndLiquidDownwards(llllllllllllIlllllllllIlllIlIIIl, Blocks.nether_brick.getDefaultState(), llllllllllllIlllllllllIlllIlIlIl, Entrance.lIllIlIlIllIII[16], llllllllllllIlllllllllIlllIlIlII, llllllllllllIlllllllllIlllIIllll);
                    this.replaceAirAndLiquidDownwards(llllllllllllIlllllllllIlllIlIIIl, Blocks.nether_brick.getDefaultState(), Entrance.lIllIlIlIllIII[8] - llllllllllllIlllllllllIlllIlIlIl, Entrance.lIllIlIlIllIII[16], llllllllllllIlllllllllIlllIlIlII, llllllllllllIlllllllllIlllIIllll);
                    ++llllllllllllIlllllllllIlllIlIlII;
                }
                ++llllllllllllIlllllllllIlllIlIlIl;
            }
            this.fillWithBlocks(llllllllllllIlllllllllIlllIlIIIl, llllllllllllIlllllllllIlllIIllll, Entrance.lIllIlIlIllIII[0], Entrance.lIllIlIlIllIII[0], Entrance.lIllIlIlIllIII[0], Entrance.lIllIlIlIllIII[15], Entrance.lIllIlIlIllIII[0], Entrance.lIllIlIlIllIII[15], Blocks.nether_brick.getDefaultState(), Blocks.nether_brick.getDefaultState(), (boolean)(Entrance.lIllIlIlIllIII[5] != 0));
            this.fillWithBlocks(llllllllllllIlllllllllIlllIlIIIl, llllllllllllIlllllllllIlllIIllll, Entrance.lIllIlIlIllIII[17], Entrance.lIllIlIlIllIII[2], Entrance.lIllIlIlIllIII[17], Entrance.lIllIlIlIllIII[17], Entrance.lIllIlIlIllIII[9], Entrance.lIllIlIlIllIII[17], Blocks.air.getDefaultState(), Blocks.air.getDefaultState(), (boolean)(Entrance.lIllIlIlIllIII[5] != 0));
            this.setBlockState(llllllllllllIlllllllllIlllIlIIIl, Blocks.nether_brick.getDefaultState(), Entrance.lIllIlIlIllIII[17], Entrance.lIllIlIlIllIII[5], Entrance.lIllIlIlIllIII[17], llllllllllllIlllllllllIlllIIllll);
            this.setBlockState(llllllllllllIlllllllllIlllIlIIIl, Blocks.flowing_lava.getDefaultState(), Entrance.lIllIlIlIllIII[17], Entrance.lIllIlIlIllIII[0], Entrance.lIllIlIlIllIII[17], llllllllllllIlllllllllIlllIIllll);
            final BlockPos llllllllllllIlllllllllIlllIlIIll = new BlockPos(this.getXWithOffset(Entrance.lIllIlIlIllIII[17], Entrance.lIllIlIlIllIII[17]), this.getYWithOffset(Entrance.lIllIlIlIllIII[0]), this.getZWithOffset(Entrance.lIllIlIlIllIII[17], Entrance.lIllIlIlIllIII[17]));
            if (llllllIllIlIIII(llllllllllllIlllllllllIlllIIllll.isVecInside(llllllllllllIlllllllllIlllIlIIll) ? 1 : 0)) {
                llllllllllllIlllllllllIlllIlIIIl.forceBlockUpdateTick(Blocks.flowing_lava, llllllllllllIlllllllllIlllIlIIll, llllllllllllIlllllllllIlllIllIll);
            }
            return Entrance.lIllIlIlIllIII[2] != 0;
        }
        
        public Entrance(final int llllllllllllIllllllllllIIIIIllll, final Random llllllllllllIllllllllllIIIIIlllI, final StructureBoundingBox llllllllllllIllllllllllIIIIIllIl, final EnumFacing llllllllllllIllllllllllIIIIIllII) {
            super(llllllllllllIllllllllllIIIIIllll);
            this.coordBaseMode = llllllllllllIllllllllllIIIIIllII;
            this.boundingBox = llllllllllllIllllllllllIIIIIllIl;
        }
        
        static {
            llllllIllIIllll();
        }
        
        @Override
        public void buildComponent(final StructureComponent llllllllllllIlllllllllIllllllllI, final List<StructureComponent> llllllllllllIlllllllllIlllllllIl, final Random llllllllllllIllllllllllIIIIIIIII) {
            this.getNextComponentNormal((Start)llllllllllllIlllllllllIllllllllI, llllllllllllIlllllllllIlllllllIl, llllllllllllIllllllllllIIIIIIIII, Entrance.lIllIlIlIllIII[0], Entrance.lIllIlIlIllIII[1], (boolean)(Entrance.lIllIlIlIllIII[2] != 0));
            "".length();
        }
    }
    
    public static class Stairs extends Piece
    {
        private static final /* synthetic */ int[] lIlIllIlIIIlIl;
        
        public static Stairs func_175872_a(final List<StructureComponent> lllllllllllllIIIIllIllIIllllIIlI, final Random lllllllllllllIIIIllIllIIllllIIIl, final int lllllllllllllIIIIllIllIIlllIlIII, final int lllllllllllllIIIIllIllIIlllIIlll, final int lllllllllllllIIIIllIllIIlllIlllI, final int lllllllllllllIIIIllIllIIlllIIlIl, final EnumFacing lllllllllllllIIIIllIllIIlllIllII) {
            final StructureBoundingBox lllllllllllllIIIIllIllIIlllIlIll = StructureBoundingBox.getComponentToAddBoundingBox(lllllllllllllIIIIllIllIIlllIlIII, lllllllllllllIIIIllIllIIlllIIlll, lllllllllllllIIIIllIllIIlllIlllI, Stairs.lIlIllIlIIIlIl[3], Stairs.lIlIllIlIIIlIl[2], Stairs.lIlIllIlIIIlIl[2], Stairs.lIlIllIlIIIlIl[4], Stairs.lIlIllIlIIIlIl[5], Stairs.lIlIllIlIIIlIl[4], lllllllllllllIIIIllIllIIlllIllII);
            Stairs stairs;
            if (llllIIIllIIIIll(Piece.isAboveGround(lllllllllllllIIIIllIllIIlllIlIll) ? 1 : 0) && llllIIIllIIIlII(StructureComponent.findIntersecting(lllllllllllllIIIIllIllIIllllIIlI, lllllllllllllIIIIllIllIIlllIlIll))) {
                stairs = new Stairs(lllllllllllllIIIIllIllIIlllIIlIl, lllllllllllllIIIIllIllIIllllIIIl, lllllllllllllIIIIllIllIIlllIlIll, lllllllllllllIIIIllIllIIlllIllII);
                "".length();
                if (((0xCF ^ 0xC4) & ~(0x5 ^ 0xE)) >= (0x8A ^ 0x8E)) {
                    return null;
                }
            }
            else {
                stairs = null;
            }
            return stairs;
        }
        
        static {
            llllIIIllIIIIlI();
        }
        
        private static void llllIIIllIIIIlI() {
            (lIlIllIlIIIlIl = new int[13])[0] = (0xBE ^ 0xB8);
            Stairs.lIlIllIlIIIlIl[1] = "  ".length();
            Stairs.lIlIllIlIIIlIl[2] = ((0x0 ^ 0x3E ^ (0x78 ^ 0x10)) & (118 + 4 - 59 + 85 ^ 164 + 151 - 293 + 172 ^ -" ".length()));
            Stairs.lIlIllIlIIIlIl[3] = -"  ".length();
            Stairs.lIlIllIlIIIlIl[4] = (0x75 ^ 0x79 ^ (0x83 ^ 0x88));
            Stairs.lIlIllIlIIIlIl[5] = (176 + 130 - 224 + 100 ^ 188 + 48 - 123 + 76);
            Stairs.lIlIllIlIIIlIl[6] = " ".length();
            Stairs.lIlIllIlIIIlIl[7] = (100 + 79 - 11 + 7 ^ 10 + 111 - 60 + 104);
            Stairs.lIlIllIlIIIlIl[8] = (110 + 23 - 129 + 164 ^ 42 + 86 - 62 + 94);
            Stairs.lIlIllIlIIIlIl[9] = (0x43 ^ 0x32 ^ (0xC1 ^ 0xB5));
            Stairs.lIlIllIlIIIlIl[10] = "   ".length();
            Stairs.lIlIllIlIIIlIl[11] = (173 + 113 - 166 + 75 ^ 57 + 164 - 143 + 121);
            Stairs.lIlIllIlIIIlIl[12] = -" ".length();
        }
        
        public Stairs() {
        }
        
        private static boolean llllIIIllIIIlII(final Object lllllllllllllIIIIllIllIIllIIllIl) {
            return lllllllllllllIIIIllIllIIllIIllIl == null;
        }
        
        private static boolean llllIIIllIIIIll(final int lllllllllllllIIIIllIllIIllIIlIll) {
            return lllllllllllllIIIIllIllIIllIIlIll != 0;
        }
        
        @Override
        public void buildComponent(final StructureComponent lllllllllllllIIIIllIllIlIIIIIIIl, final List<StructureComponent> lllllllllllllIIIIllIllIlIIIIIIII, final Random lllllllllllllIIIIllIllIIllllllll) {
            this.getNextComponentZ((Start)lllllllllllllIIIIllIllIlIIIIIIIl, lllllllllllllIIIIllIllIlIIIIIIII, lllllllllllllIIIIllIllIIllllllll, Stairs.lIlIllIlIIIlIl[0], Stairs.lIlIllIlIIIlIl[1], (boolean)(Stairs.lIlIllIlIIIlIl[2] != 0));
            "".length();
        }
        
        private static boolean llllIIIllIIIlIl(final int lllllllllllllIIIIllIllIIllIlIIII, final int lllllllllllllIIIIllIllIIllIIllll) {
            return lllllllllllllIIIIllIllIIllIlIIII > lllllllllllllIIIIllIllIIllIIllll;
        }
        
        @Override
        public boolean addComponentParts(final World lllllllllllllIIIIllIllIIllIlIllI, final Random lllllllllllllIIIIllIllIIllIllIll, final StructureBoundingBox lllllllllllllIIIIllIllIIllIlIlIl) {
            this.fillWithBlocks(lllllllllllllIIIIllIllIIllIlIllI, lllllllllllllIIIIllIllIIllIlIlIl, Stairs.lIlIllIlIIIlIl[2], Stairs.lIlIllIlIIIlIl[2], Stairs.lIlIllIlIIIlIl[2], Stairs.lIlIllIlIIIlIl[0], Stairs.lIlIllIlIIIlIl[6], Stairs.lIlIllIlIIIlIl[0], Blocks.nether_brick.getDefaultState(), Blocks.nether_brick.getDefaultState(), (boolean)(Stairs.lIlIllIlIIIlIl[2] != 0));
            this.fillWithBlocks(lllllllllllllIIIIllIllIIllIlIllI, lllllllllllllIIIIllIllIIllIlIlIl, Stairs.lIlIllIlIIIlIl[2], Stairs.lIlIllIlIIIlIl[1], Stairs.lIlIllIlIIIlIl[2], Stairs.lIlIllIlIIIlIl[0], Stairs.lIlIllIlIIIlIl[7], Stairs.lIlIllIlIIIlIl[0], Blocks.air.getDefaultState(), Blocks.air.getDefaultState(), (boolean)(Stairs.lIlIllIlIIIlIl[2] != 0));
            this.fillWithBlocks(lllllllllllllIIIIllIllIIllIlIllI, lllllllllllllIIIIllIllIIllIlIlIl, Stairs.lIlIllIlIIIlIl[2], Stairs.lIlIllIlIIIlIl[1], Stairs.lIlIllIlIIIlIl[2], Stairs.lIlIllIlIIIlIl[6], Stairs.lIlIllIlIIIlIl[8], Stairs.lIlIllIlIIIlIl[2], Blocks.nether_brick.getDefaultState(), Blocks.nether_brick.getDefaultState(), (boolean)(Stairs.lIlIllIlIIIlIl[2] != 0));
            this.fillWithBlocks(lllllllllllllIIIIllIllIIllIlIllI, lllllllllllllIIIIllIllIIllIlIlIl, Stairs.lIlIllIlIIIlIl[9], Stairs.lIlIllIlIIIlIl[1], Stairs.lIlIllIlIIIlIl[2], Stairs.lIlIllIlIIIlIl[0], Stairs.lIlIllIlIIIlIl[8], Stairs.lIlIllIlIIIlIl[2], Blocks.nether_brick.getDefaultState(), Blocks.nether_brick.getDefaultState(), (boolean)(Stairs.lIlIllIlIIIlIl[2] != 0));
            this.fillWithBlocks(lllllllllllllIIIIllIllIIllIlIllI, lllllllllllllIIIIllIllIIllIlIlIl, Stairs.lIlIllIlIIIlIl[2], Stairs.lIlIllIlIIIlIl[1], Stairs.lIlIllIlIIIlIl[6], Stairs.lIlIllIlIIIlIl[2], Stairs.lIlIllIlIIIlIl[8], Stairs.lIlIllIlIIIlIl[0], Blocks.nether_brick.getDefaultState(), Blocks.nether_brick.getDefaultState(), (boolean)(Stairs.lIlIllIlIIIlIl[2] != 0));
            this.fillWithBlocks(lllllllllllllIIIIllIllIIllIlIllI, lllllllllllllIIIIllIllIIllIlIlIl, Stairs.lIlIllIlIIIlIl[0], Stairs.lIlIllIlIIIlIl[1], Stairs.lIlIllIlIIIlIl[6], Stairs.lIlIllIlIIIlIl[0], Stairs.lIlIllIlIIIlIl[8], Stairs.lIlIllIlIIIlIl[0], Blocks.nether_brick.getDefaultState(), Blocks.nether_brick.getDefaultState(), (boolean)(Stairs.lIlIllIlIIIlIl[2] != 0));
            this.fillWithBlocks(lllllllllllllIIIIllIllIIllIlIllI, lllllllllllllIIIIllIllIIllIlIlIl, Stairs.lIlIllIlIIIlIl[6], Stairs.lIlIllIlIIIlIl[1], Stairs.lIlIllIlIIIlIl[0], Stairs.lIlIllIlIIIlIl[9], Stairs.lIlIllIlIIIlIl[8], Stairs.lIlIllIlIIIlIl[0], Blocks.nether_brick.getDefaultState(), Blocks.nether_brick.getDefaultState(), (boolean)(Stairs.lIlIllIlIIIlIl[2] != 0));
            this.fillWithBlocks(lllllllllllllIIIIllIllIIllIlIllI, lllllllllllllIIIIllIllIIllIlIlIl, Stairs.lIlIllIlIIIlIl[2], Stairs.lIlIllIlIIIlIl[10], Stairs.lIlIllIlIIIlIl[1], Stairs.lIlIllIlIIIlIl[2], Stairs.lIlIllIlIIIlIl[9], Stairs.lIlIllIlIIIlIl[11], Blocks.nether_brick_fence.getDefaultState(), Blocks.nether_brick_fence.getDefaultState(), (boolean)(Stairs.lIlIllIlIIIlIl[2] != 0));
            this.fillWithBlocks(lllllllllllllIIIIllIllIIllIlIllI, lllllllllllllIIIIllIllIIllIlIlIl, Stairs.lIlIllIlIIIlIl[0], Stairs.lIlIllIlIIIlIl[10], Stairs.lIlIllIlIIIlIl[1], Stairs.lIlIllIlIIIlIl[0], Stairs.lIlIllIlIIIlIl[9], Stairs.lIlIllIlIIIlIl[1], Blocks.nether_brick_fence.getDefaultState(), Blocks.nether_brick_fence.getDefaultState(), (boolean)(Stairs.lIlIllIlIIIlIl[2] != 0));
            this.fillWithBlocks(lllllllllllllIIIIllIllIIllIlIllI, lllllllllllllIIIIllIllIIllIlIlIl, Stairs.lIlIllIlIIIlIl[0], Stairs.lIlIllIlIIIlIl[10], Stairs.lIlIllIlIIIlIl[11], Stairs.lIlIllIlIIIlIl[0], Stairs.lIlIllIlIIIlIl[9], Stairs.lIlIllIlIIIlIl[11], Blocks.nether_brick_fence.getDefaultState(), Blocks.nether_brick_fence.getDefaultState(), (boolean)(Stairs.lIlIllIlIIIlIl[2] != 0));
            this.setBlockState(lllllllllllllIIIIllIllIIllIlIllI, Blocks.nether_brick.getDefaultState(), Stairs.lIlIllIlIIIlIl[9], Stairs.lIlIllIlIIIlIl[1], Stairs.lIlIllIlIIIlIl[9], lllllllllllllIIIIllIllIIllIlIlIl);
            this.fillWithBlocks(lllllllllllllIIIIllIllIIllIlIllI, lllllllllllllIIIIllIllIIllIlIlIl, Stairs.lIlIllIlIIIlIl[11], Stairs.lIlIllIlIIIlIl[1], Stairs.lIlIllIlIIIlIl[9], Stairs.lIlIllIlIIIlIl[11], Stairs.lIlIllIlIIIlIl[10], Stairs.lIlIllIlIIIlIl[9], Blocks.nether_brick.getDefaultState(), Blocks.nether_brick.getDefaultState(), (boolean)(Stairs.lIlIllIlIIIlIl[2] != 0));
            this.fillWithBlocks(lllllllllllllIIIIllIllIIllIlIllI, lllllllllllllIIIIllIllIIllIlIlIl, Stairs.lIlIllIlIIIlIl[10], Stairs.lIlIllIlIIIlIl[1], Stairs.lIlIllIlIIIlIl[9], Stairs.lIlIllIlIIIlIl[10], Stairs.lIlIllIlIIIlIl[11], Stairs.lIlIllIlIIIlIl[9], Blocks.nether_brick.getDefaultState(), Blocks.nether_brick.getDefaultState(), (boolean)(Stairs.lIlIllIlIIIlIl[2] != 0));
            this.fillWithBlocks(lllllllllllllIIIIllIllIIllIlIllI, lllllllllllllIIIIllIllIIllIlIlIl, Stairs.lIlIllIlIIIlIl[1], Stairs.lIlIllIlIIIlIl[1], Stairs.lIlIllIlIIIlIl[9], Stairs.lIlIllIlIIIlIl[1], Stairs.lIlIllIlIIIlIl[9], Stairs.lIlIllIlIIIlIl[9], Blocks.nether_brick.getDefaultState(), Blocks.nether_brick.getDefaultState(), (boolean)(Stairs.lIlIllIlIIIlIl[2] != 0));
            this.fillWithBlocks(lllllllllllllIIIIllIllIIllIlIllI, lllllllllllllIIIIllIllIIllIlIlIl, Stairs.lIlIllIlIIIlIl[6], Stairs.lIlIllIlIIIlIl[1], Stairs.lIlIllIlIIIlIl[9], Stairs.lIlIllIlIIIlIl[6], Stairs.lIlIllIlIIIlIl[0], Stairs.lIlIllIlIIIlIl[9], Blocks.nether_brick.getDefaultState(), Blocks.nether_brick.getDefaultState(), (boolean)(Stairs.lIlIllIlIIIlIl[2] != 0));
            this.fillWithBlocks(lllllllllllllIIIIllIllIIllIlIllI, lllllllllllllIIIIllIllIIllIlIlIl, Stairs.lIlIllIlIIIlIl[6], Stairs.lIlIllIlIIIlIl[4], Stairs.lIlIllIlIIIlIl[6], Stairs.lIlIllIlIIIlIl[9], Stairs.lIlIllIlIIIlIl[4], Stairs.lIlIllIlIIIlIl[11], Blocks.nether_brick.getDefaultState(), Blocks.nether_brick.getDefaultState(), (boolean)(Stairs.lIlIllIlIIIlIl[2] != 0));
            this.fillWithBlocks(lllllllllllllIIIIllIllIIllIlIllI, lllllllllllllIIIIllIllIIllIlIlIl, Stairs.lIlIllIlIIIlIl[0], Stairs.lIlIllIlIIIlIl[8], Stairs.lIlIllIlIIIlIl[1], Stairs.lIlIllIlIIIlIl[0], Stairs.lIlIllIlIIIlIl[8], Stairs.lIlIllIlIIIlIl[11], Blocks.air.getDefaultState(), Blocks.air.getDefaultState(), (boolean)(Stairs.lIlIllIlIIIlIl[2] != 0));
            this.fillWithBlocks(lllllllllllllIIIIllIllIIllIlIllI, lllllllllllllIIIIllIllIIllIlIlIl, Stairs.lIlIllIlIIIlIl[1], Stairs.lIlIllIlIIIlIl[0], Stairs.lIlIllIlIIIlIl[2], Stairs.lIlIllIlIIIlIl[11], Stairs.lIlIllIlIIIlIl[8], Stairs.lIlIllIlIIIlIl[2], Blocks.nether_brick.getDefaultState(), Blocks.nether_brick.getDefaultState(), (boolean)(Stairs.lIlIllIlIIIlIl[2] != 0));
            this.fillWithBlocks(lllllllllllllIIIIllIllIIllIlIllI, lllllllllllllIIIIllIllIIllIlIlIl, Stairs.lIlIllIlIIIlIl[1], Stairs.lIlIllIlIIIlIl[9], Stairs.lIlIllIlIIIlIl[2], Stairs.lIlIllIlIIIlIl[11], Stairs.lIlIllIlIIIlIl[9], Stairs.lIlIllIlIIIlIl[2], Blocks.nether_brick_fence.getDefaultState(), Blocks.nether_brick_fence.getDefaultState(), (boolean)(Stairs.lIlIllIlIIIlIl[2] != 0));
            int lllllllllllllIIIIllIllIIllIllIIl = Stairs.lIlIllIlIIIlIl[2];
            "".length();
            if (-" ".length() != -" ".length()) {
                return ((0xA3 ^ 0x8D) & ~(0x98 ^ 0xB6)) != 0x0;
            }
            while (!llllIIIllIIIlIl(lllllllllllllIIIIllIllIIllIllIIl, Stairs.lIlIllIlIIIlIl[0])) {
                int lllllllllllllIIIIllIllIIllIllIII = Stairs.lIlIllIlIIIlIl[2];
                "".length();
                if (-"   ".length() > 0) {
                    return ((0x56 ^ 0x12) & ~(0xE4 ^ 0xA0)) != 0x0;
                }
                while (!llllIIIllIIIlIl(lllllllllllllIIIIllIllIIllIllIII, Stairs.lIlIllIlIIIlIl[0])) {
                    this.replaceAirAndLiquidDownwards(lllllllllllllIIIIllIllIIllIlIllI, Blocks.nether_brick.getDefaultState(), lllllllllllllIIIIllIllIIllIllIIl, Stairs.lIlIllIlIIIlIl[12], lllllllllllllIIIIllIllIIllIllIII, lllllllllllllIIIIllIllIIllIlIlIl);
                    ++lllllllllllllIIIIllIllIIllIllIII;
                }
                ++lllllllllllllIIIIllIllIIllIllIIl;
            }
            return Stairs.lIlIllIlIIIlIl[6] != 0;
        }
        
        public Stairs(final int lllllllllllllIIIIllIllIlIIIIlllI, final Random lllllllllllllIIIIllIllIlIIIIllIl, final StructureBoundingBox lllllllllllllIIIIllIllIlIIIIllII, final EnumFacing lllllllllllllIIIIllIllIlIIIIlIll) {
            super(lllllllllllllIIIIllIllIlIIIIlllI);
            this.coordBaseMode = lllllllllllllIIIIllIllIlIIIIlIll;
            this.boundingBox = lllllllllllllIIIIllIllIlIIIIllII;
        }
    }
    
    public static class NetherStalkRoom extends Piece
    {
        private static final /* synthetic */ int[] lIIIlIIlllllll;
        
        private static boolean llIIIIIIIIIllll(final Object lllllllllllllIlIIIlIIIlIIlllIIIl) {
            return lllllllllllllIlIIIlIIIlIIlllIIIl == null;
        }
        
        private static boolean llIIIIIIIIlIIIl(final int lllllllllllllIlIIIlIIIlIIlllllII, final int lllllllllllllIlIIIlIIIlIIllllIll) {
            return lllllllllllllIlIIIlIIIlIIlllllII >= lllllllllllllIlIIIlIIIlIIllllIll;
        }
        
        public NetherStalkRoom() {
        }
        
        private static void llIIIIIIIIIllIl() {
            (lIIIlIIlllllll = new int[18])[0] = (0xFB ^ 0xC4 ^ (0x32 ^ 0x8));
            NetherStalkRoom.lIIIlIIlllllll[1] = "   ".length();
            NetherStalkRoom.lIIIlIIlllllll[2] = " ".length();
            NetherStalkRoom.lIIIlIIlllllll[3] = (19 + 45 - 33 + 131 ^ 21 + 7 - 26 + 167);
            NetherStalkRoom.lIIIlIIlllllll[4] = -(0xBE ^ 0x9A ^ (0x8A ^ 0xAB));
            NetherStalkRoom.lIIIlIIlllllll[5] = -"   ".length();
            NetherStalkRoom.lIIIlIIlllllll[6] = ((0x72 ^ 0x6F) & ~(0x72 ^ 0x6F));
            NetherStalkRoom.lIIIlIIlllllll[7] = (0x36 ^ 0x3B);
            NetherStalkRoom.lIIIlIIlllllll[8] = (0xC9 ^ 0xC7);
            NetherStalkRoom.lIIIlIIlllllll[9] = (0x1A ^ 0x73 ^ (0xA2 ^ 0xC7));
            NetherStalkRoom.lIIIlIIlllllll[10] = (31 + 102 - 112 + 146 ^ 19 + 94 - 71 + 121);
            NetherStalkRoom.lIIIlIIlllllll[11] = "  ".length();
            NetherStalkRoom.lIIIlIIlllllll[12] = (0x54 ^ 0x5C);
            NetherStalkRoom.lIIIlIIlllllll[13] = (0x34 ^ 0x3E);
            NetherStalkRoom.lIIIlIIlllllll[14] = (0x85 ^ 0x8C);
            NetherStalkRoom.lIIIlIIlllllll[15] = (0x59 ^ 0x5E);
            NetherStalkRoom.lIIIlIIlllllll[16] = (0x3 ^ 0x5);
            NetherStalkRoom.lIIIlIIlllllll[17] = -" ".length();
        }
        
        public static NetherStalkRoom func_175875_a(final List<StructureComponent> lllllllllllllIlIIIlIIIlIlIlIllll, final Random lllllllllllllIlIIIlIIIlIlIlIlllI, final int lllllllllllllIlIIIlIIIlIlIlIIlIl, final int lllllllllllllIlIIIlIIIlIlIlIIlII, final int lllllllllllllIlIIIlIIIlIlIlIlIll, final EnumFacing lllllllllllllIlIIIlIIIlIlIlIIIlI, final int lllllllllllllIlIIIlIIIlIlIlIlIIl) {
            final StructureBoundingBox lllllllllllllIlIIIlIIIlIlIlIlIII = StructureBoundingBox.getComponentToAddBoundingBox(lllllllllllllIlIIIlIIIlIlIlIIlIl, lllllllllllllIlIIIlIIIlIlIlIIlII, lllllllllllllIlIIIlIIIlIlIlIlIll, NetherStalkRoom.lIIIlIIlllllll[4], NetherStalkRoom.lIIIlIIlllllll[5], NetherStalkRoom.lIIIlIIlllllll[6], NetherStalkRoom.lIIIlIIlllllll[7], NetherStalkRoom.lIIIlIIlllllll[8], NetherStalkRoom.lIIIlIIlllllll[7], lllllllllllllIlIIIlIIIlIlIlIIIlI);
            NetherStalkRoom netherStalkRoom;
            if (llIIIIIIIIIlllI(Piece.isAboveGround(lllllllllllllIlIIIlIIIlIlIlIlIII) ? 1 : 0) && llIIIIIIIIIllll(StructureComponent.findIntersecting(lllllllllllllIlIIIlIIIlIlIlIllll, lllllllllllllIlIIIlIIIlIlIlIlIII))) {
                netherStalkRoom = new NetherStalkRoom(lllllllllllllIlIIIlIIIlIlIlIlIIl, lllllllllllllIlIIIlIIIlIlIlIlllI, lllllllllllllIlIIIlIIIlIlIlIlIII, lllllllllllllIlIIIlIIIlIlIlIIIlI);
                "".length();
                if ("   ".length() == 0) {
                    return null;
                }
            }
            else {
                netherStalkRoom = null;
            }
            return netherStalkRoom;
        }
        
        @Override
        public void buildComponent(final StructureComponent lllllllllllllIlIIIlIIIlIlIlllllI, final List<StructureComponent> lllllllllllllIlIIIlIIIlIlIlllIIl, final Random lllllllllllllIlIIIlIIIlIlIllllII) {
            this.getNextComponentNormal((Start)lllllllllllllIlIIIlIIIlIlIlllllI, lllllllllllllIlIIIlIIIlIlIlllIIl, lllllllllllllIlIIIlIIIlIlIllllII, NetherStalkRoom.lIIIlIIlllllll[0], NetherStalkRoom.lIIIlIIlllllll[1], (boolean)(NetherStalkRoom.lIIIlIIlllllll[2] != 0));
            "".length();
            this.getNextComponentNormal((Start)lllllllllllllIlIIIlIIIlIlIlllllI, lllllllllllllIlIIIlIIIlIlIlllIIl, lllllllllllllIlIIIlIIIlIlIllllII, NetherStalkRoom.lIIIlIIlllllll[0], NetherStalkRoom.lIIIlIIlllllll[3], (boolean)(NetherStalkRoom.lIIIlIIlllllll[2] != 0));
            "".length();
        }
        
        private static boolean llIIIIIIIIIlllI(final int lllllllllllllIlIIIlIIIlIIllIllll) {
            return lllllllllllllIlIIIlIIIlIIllIllll != 0;
        }
        
        @Override
        public boolean addComponentParts(final World lllllllllllllIlIIIlIIIlIlIIlIllI, final Random lllllllllllllIlIIIlIIIlIlIIlIlIl, final StructureBoundingBox lllllllllllllIlIIIlIIIlIlIIIIlII) {
            this.fillWithBlocks(lllllllllllllIlIIIlIIIlIlIIlIllI, lllllllllllllIlIIIlIIIlIlIIIIlII, NetherStalkRoom.lIIIlIIlllllll[6], NetherStalkRoom.lIIIlIIlllllll[1], NetherStalkRoom.lIIIlIIlllllll[6], NetherStalkRoom.lIIIlIIlllllll[9], NetherStalkRoom.lIIIlIIlllllll[10], NetherStalkRoom.lIIIlIIlllllll[9], Blocks.nether_brick.getDefaultState(), Blocks.nether_brick.getDefaultState(), (boolean)(NetherStalkRoom.lIIIlIIlllllll[6] != 0));
            this.fillWithBlocks(lllllllllllllIlIIIlIIIlIlIIlIllI, lllllllllllllIlIIIlIIIlIlIIIIlII, NetherStalkRoom.lIIIlIIlllllll[6], NetherStalkRoom.lIIIlIIlllllll[0], NetherStalkRoom.lIIIlIIlllllll[6], NetherStalkRoom.lIIIlIIlllllll[9], NetherStalkRoom.lIIIlIIlllllll[7], NetherStalkRoom.lIIIlIIlllllll[9], Blocks.air.getDefaultState(), Blocks.air.getDefaultState(), (boolean)(NetherStalkRoom.lIIIlIIlllllll[6] != 0));
            this.fillWithBlocks(lllllllllllllIlIIIlIIIlIlIIlIllI, lllllllllllllIlIIIlIIIlIlIIIIlII, NetherStalkRoom.lIIIlIIlllllll[6], NetherStalkRoom.lIIIlIIlllllll[0], NetherStalkRoom.lIIIlIIlllllll[6], NetherStalkRoom.lIIIlIIlllllll[2], NetherStalkRoom.lIIIlIIlllllll[9], NetherStalkRoom.lIIIlIIlllllll[9], Blocks.nether_brick.getDefaultState(), Blocks.nether_brick.getDefaultState(), (boolean)(NetherStalkRoom.lIIIlIIlllllll[6] != 0));
            this.fillWithBlocks(lllllllllllllIlIIIlIIIlIlIIlIllI, lllllllllllllIlIIIlIIIlIlIIIIlII, NetherStalkRoom.lIIIlIIlllllll[3], NetherStalkRoom.lIIIlIIlllllll[0], NetherStalkRoom.lIIIlIIlllllll[6], NetherStalkRoom.lIIIlIIlllllll[9], NetherStalkRoom.lIIIlIIlllllll[9], NetherStalkRoom.lIIIlIIlllllll[9], Blocks.nether_brick.getDefaultState(), Blocks.nether_brick.getDefaultState(), (boolean)(NetherStalkRoom.lIIIlIIlllllll[6] != 0));
            this.fillWithBlocks(lllllllllllllIlIIIlIIIlIlIIlIllI, lllllllllllllIlIIIlIIIlIlIIIIlII, NetherStalkRoom.lIIIlIIlllllll[11], NetherStalkRoom.lIIIlIIlllllll[0], NetherStalkRoom.lIIIlIIlllllll[3], NetherStalkRoom.lIIIlIIlllllll[10], NetherStalkRoom.lIIIlIIlllllll[9], NetherStalkRoom.lIIIlIIlllllll[9], Blocks.nether_brick.getDefaultState(), Blocks.nether_brick.getDefaultState(), (boolean)(NetherStalkRoom.lIIIlIIlllllll[6] != 0));
            this.fillWithBlocks(lllllllllllllIlIIIlIIIlIlIIlIllI, lllllllllllllIlIIIlIIIlIlIIIIlII, NetherStalkRoom.lIIIlIIlllllll[12], NetherStalkRoom.lIIIlIIlllllll[0], NetherStalkRoom.lIIIlIIlllllll[3], NetherStalkRoom.lIIIlIIlllllll[13], NetherStalkRoom.lIIIlIIlllllll[9], NetherStalkRoom.lIIIlIIlllllll[9], Blocks.nether_brick.getDefaultState(), Blocks.nether_brick.getDefaultState(), (boolean)(NetherStalkRoom.lIIIlIIlllllll[6] != 0));
            this.fillWithBlocks(lllllllllllllIlIIIlIIIlIlIIlIllI, lllllllllllllIlIIIlIIIlIlIIIIlII, NetherStalkRoom.lIIIlIIlllllll[0], NetherStalkRoom.lIIIlIIlllllll[14], NetherStalkRoom.lIIIlIIlllllll[3], NetherStalkRoom.lIIIlIIlllllll[15], NetherStalkRoom.lIIIlIIlllllll[9], NetherStalkRoom.lIIIlIIlllllll[9], Blocks.nether_brick.getDefaultState(), Blocks.nether_brick.getDefaultState(), (boolean)(NetherStalkRoom.lIIIlIIlllllll[6] != 0));
            this.fillWithBlocks(lllllllllllllIlIIIlIIIlIlIIlIllI, lllllllllllllIlIIIlIIIlIlIIIIlII, NetherStalkRoom.lIIIlIIlllllll[11], NetherStalkRoom.lIIIlIIlllllll[0], NetherStalkRoom.lIIIlIIlllllll[6], NetherStalkRoom.lIIIlIIlllllll[10], NetherStalkRoom.lIIIlIIlllllll[9], NetherStalkRoom.lIIIlIIlllllll[2], Blocks.nether_brick.getDefaultState(), Blocks.nether_brick.getDefaultState(), (boolean)(NetherStalkRoom.lIIIlIIlllllll[6] != 0));
            this.fillWithBlocks(lllllllllllllIlIIIlIIIlIlIIlIllI, lllllllllllllIlIIIlIIIlIlIIIIlII, NetherStalkRoom.lIIIlIIlllllll[12], NetherStalkRoom.lIIIlIIlllllll[0], NetherStalkRoom.lIIIlIIlllllll[6], NetherStalkRoom.lIIIlIIlllllll[13], NetherStalkRoom.lIIIlIIlllllll[9], NetherStalkRoom.lIIIlIIlllllll[2], Blocks.nether_brick.getDefaultState(), Blocks.nether_brick.getDefaultState(), (boolean)(NetherStalkRoom.lIIIlIIlllllll[6] != 0));
            this.fillWithBlocks(lllllllllllllIlIIIlIIIlIlIIlIllI, lllllllllllllIlIIIlIIIlIlIIIIlII, NetherStalkRoom.lIIIlIIlllllll[0], NetherStalkRoom.lIIIlIIlllllll[14], NetherStalkRoom.lIIIlIIlllllll[6], NetherStalkRoom.lIIIlIIlllllll[15], NetherStalkRoom.lIIIlIIlllllll[9], NetherStalkRoom.lIIIlIIlllllll[2], Blocks.nether_brick.getDefaultState(), Blocks.nether_brick.getDefaultState(), (boolean)(NetherStalkRoom.lIIIlIIlllllll[6] != 0));
            this.fillWithBlocks(lllllllllllllIlIIIlIIIlIlIIlIllI, lllllllllllllIlIIIlIIIlIlIIIIlII, NetherStalkRoom.lIIIlIIlllllll[11], NetherStalkRoom.lIIIlIIlllllll[3], NetherStalkRoom.lIIIlIIlllllll[11], NetherStalkRoom.lIIIlIIlllllll[13], NetherStalkRoom.lIIIlIIlllllll[9], NetherStalkRoom.lIIIlIIlllllll[13], Blocks.nether_brick.getDefaultState(), Blocks.nether_brick.getDefaultState(), (boolean)(NetherStalkRoom.lIIIlIIlllllll[6] != 0));
            int lllllllllllllIlIIIlIIIlIlIIlIIll = NetherStalkRoom.lIIIlIIlllllll[2];
            "".length();
            if (("  ".length() & ("  ".length() ^ -" ".length())) < 0) {
                return ((0xFC ^ 0xB8 ^ (0x28 ^ 0x39)) & (0x30 ^ 0x60 ^ (0xAA ^ 0xAF) ^ -" ".length())) != 0x0;
            }
            while (!llIIIIIIIIlIIII(lllllllllllllIlIIIlIIIlIlIIlIIll, NetherStalkRoom.lIIIlIIlllllll[3])) {
                this.fillWithBlocks(lllllllllllllIlIIIlIIIlIlIIlIllI, lllllllllllllIlIIIlIIIlIlIIIIlII, lllllllllllllIlIIIlIIIlIlIIlIIll, NetherStalkRoom.lIIIlIIlllllll[13], NetherStalkRoom.lIIIlIIlllllll[6], lllllllllllllIlIIIlIIIlIlIIlIIll, NetherStalkRoom.lIIIlIIlllllll[3], NetherStalkRoom.lIIIlIIlllllll[6], Blocks.nether_brick_fence.getDefaultState(), Blocks.nether_brick_fence.getDefaultState(), (boolean)(NetherStalkRoom.lIIIlIIlllllll[6] != 0));
                this.fillWithBlocks(lllllllllllllIlIIIlIIIlIlIIlIllI, lllllllllllllIlIIIlIIIlIlIIIIlII, lllllllllllllIlIIIlIIIlIlIIlIIll, NetherStalkRoom.lIIIlIIlllllll[13], NetherStalkRoom.lIIIlIIlllllll[9], lllllllllllllIlIIIlIIIlIlIIlIIll, NetherStalkRoom.lIIIlIIlllllll[3], NetherStalkRoom.lIIIlIIlllllll[9], Blocks.nether_brick_fence.getDefaultState(), Blocks.nether_brick_fence.getDefaultState(), (boolean)(NetherStalkRoom.lIIIlIIlllllll[6] != 0));
                this.fillWithBlocks(lllllllllllllIlIIIlIIIlIlIIlIllI, lllllllllllllIlIIIlIIIlIlIIIIlII, NetherStalkRoom.lIIIlIIlllllll[6], NetherStalkRoom.lIIIlIIlllllll[13], lllllllllllllIlIIIlIIIlIlIIlIIll, NetherStalkRoom.lIIIlIIlllllll[6], NetherStalkRoom.lIIIlIIlllllll[3], lllllllllllllIlIIIlIIIlIlIIlIIll, Blocks.nether_brick_fence.getDefaultState(), Blocks.nether_brick_fence.getDefaultState(), (boolean)(NetherStalkRoom.lIIIlIIlllllll[6] != 0));
                this.fillWithBlocks(lllllllllllllIlIIIlIIIlIlIIlIllI, lllllllllllllIlIIIlIIIlIlIIIIlII, NetherStalkRoom.lIIIlIIlllllll[9], NetherStalkRoom.lIIIlIIlllllll[13], lllllllllllllIlIIIlIIIlIlIIlIIll, NetherStalkRoom.lIIIlIIlllllll[9], NetherStalkRoom.lIIIlIIlllllll[3], lllllllllllllIlIIIlIIIlIlIIlIIll, Blocks.nether_brick_fence.getDefaultState(), Blocks.nether_brick_fence.getDefaultState(), (boolean)(NetherStalkRoom.lIIIlIIlllllll[6] != 0));
                this.setBlockState(lllllllllllllIlIIIlIIIlIlIIlIllI, Blocks.nether_brick.getDefaultState(), lllllllllllllIlIIIlIIIlIlIIlIIll, NetherStalkRoom.lIIIlIIlllllll[7], NetherStalkRoom.lIIIlIIlllllll[6], lllllllllllllIlIIIlIIIlIlIIIIlII);
                this.setBlockState(lllllllllllllIlIIIlIIIlIlIIlIllI, Blocks.nether_brick.getDefaultState(), lllllllllllllIlIIIlIIIlIlIIlIIll, NetherStalkRoom.lIIIlIIlllllll[7], NetherStalkRoom.lIIIlIIlllllll[9], lllllllllllllIlIIIlIIIlIlIIIIlII);
                this.setBlockState(lllllllllllllIlIIIlIIIlIlIIlIllI, Blocks.nether_brick.getDefaultState(), NetherStalkRoom.lIIIlIIlllllll[6], NetherStalkRoom.lIIIlIIlllllll[7], lllllllllllllIlIIIlIIIlIlIIlIIll, lllllllllllllIlIIIlIIIlIlIIIIlII);
                this.setBlockState(lllllllllllllIlIIIlIIIlIlIIlIllI, Blocks.nether_brick.getDefaultState(), NetherStalkRoom.lIIIlIIlllllll[9], NetherStalkRoom.lIIIlIIlllllll[7], lllllllllllllIlIIIlIIIlIlIIlIIll, lllllllllllllIlIIIlIIIlIlIIIIlII);
                this.setBlockState(lllllllllllllIlIIIlIIIlIlIIlIllI, Blocks.nether_brick_fence.getDefaultState(), lllllllllllllIlIIIlIIIlIlIIlIIll + NetherStalkRoom.lIIIlIIlllllll[2], NetherStalkRoom.lIIIlIIlllllll[7], NetherStalkRoom.lIIIlIIlllllll[6], lllllllllllllIlIIIlIIIlIlIIIIlII);
                this.setBlockState(lllllllllllllIlIIIlIIIlIlIIlIllI, Blocks.nether_brick_fence.getDefaultState(), lllllllllllllIlIIIlIIIlIlIIlIIll + NetherStalkRoom.lIIIlIIlllllll[2], NetherStalkRoom.lIIIlIIlllllll[7], NetherStalkRoom.lIIIlIIlllllll[9], lllllllllllllIlIIIlIIIlIlIIIIlII);
                this.setBlockState(lllllllllllllIlIIIlIIIlIlIIlIllI, Blocks.nether_brick_fence.getDefaultState(), NetherStalkRoom.lIIIlIIlllllll[6], NetherStalkRoom.lIIIlIIlllllll[7], lllllllllllllIlIIIlIIIlIlIIlIIll + NetherStalkRoom.lIIIlIIlllllll[2], lllllllllllllIlIIIlIIIlIlIIIIlII);
                this.setBlockState(lllllllllllllIlIIIlIIIlIlIIlIllI, Blocks.nether_brick_fence.getDefaultState(), NetherStalkRoom.lIIIlIIlllllll[9], NetherStalkRoom.lIIIlIIlllllll[7], lllllllllllllIlIIIlIIIlIlIIlIIll + NetherStalkRoom.lIIIlIIlllllll[2], lllllllllllllIlIIIlIIIlIlIIIIlII);
                lllllllllllllIlIIIlIIIlIlIIlIIll += 2;
            }
            this.setBlockState(lllllllllllllIlIIIlIIIlIlIIlIllI, Blocks.nether_brick_fence.getDefaultState(), NetherStalkRoom.lIIIlIIlllllll[6], NetherStalkRoom.lIIIlIIlllllll[7], NetherStalkRoom.lIIIlIIlllllll[6], lllllllllllllIlIIIlIIIlIlIIIIlII);
            this.setBlockState(lllllllllllllIlIIIlIIIlIlIIlIllI, Blocks.nether_brick_fence.getDefaultState(), NetherStalkRoom.lIIIlIIlllllll[6], NetherStalkRoom.lIIIlIIlllllll[7], NetherStalkRoom.lIIIlIIlllllll[9], lllllllllllllIlIIIlIIIlIlIIIIlII);
            this.setBlockState(lllllllllllllIlIIIlIIIlIlIIlIllI, Blocks.nether_brick_fence.getDefaultState(), NetherStalkRoom.lIIIlIIlllllll[6], NetherStalkRoom.lIIIlIIlllllll[7], NetherStalkRoom.lIIIlIIlllllll[6], lllllllllllllIlIIIlIIIlIlIIIIlII);
            this.setBlockState(lllllllllllllIlIIIlIIIlIlIIlIllI, Blocks.nether_brick_fence.getDefaultState(), NetherStalkRoom.lIIIlIIlllllll[9], NetherStalkRoom.lIIIlIIlllllll[7], NetherStalkRoom.lIIIlIIlllllll[6], lllllllllllllIlIIIlIIIlIlIIIIlII);
            int lllllllllllllIlIIIlIIIlIlIIlIIlI = NetherStalkRoom.lIIIlIIlllllll[1];
            "".length();
            if ("  ".length() == "   ".length()) {
                return ((0x78 ^ 0x36 ^ (0x3B ^ 0x30)) & (0x45 ^ 0x32 ^ (0x59 ^ 0x6B) ^ -" ".length())) != 0x0;
            }
            while (!llIIIIIIIIlIIII(lllllllllllllIlIIIlIIIlIlIIlIIlI, NetherStalkRoom.lIIIlIIlllllll[14])) {
                this.fillWithBlocks(lllllllllllllIlIIIlIIIlIlIIlIllI, lllllllllllllIlIIIlIIIlIlIIIIlII, NetherStalkRoom.lIIIlIIlllllll[2], NetherStalkRoom.lIIIlIIlllllll[15], lllllllllllllIlIIIlIIIlIlIIlIIlI, NetherStalkRoom.lIIIlIIlllllll[2], NetherStalkRoom.lIIIlIIlllllll[12], lllllllllllllIlIIIlIIIlIlIIlIIlI, Blocks.nether_brick_fence.getDefaultState(), Blocks.nether_brick_fence.getDefaultState(), (boolean)(NetherStalkRoom.lIIIlIIlllllll[6] != 0));
                this.fillWithBlocks(lllllllllllllIlIIIlIIIlIlIIlIllI, lllllllllllllIlIIIlIIIlIlIIIIlII, NetherStalkRoom.lIIIlIIlllllll[3], NetherStalkRoom.lIIIlIIlllllll[15], lllllllllllllIlIIIlIIIlIlIIlIIlI, NetherStalkRoom.lIIIlIIlllllll[3], NetherStalkRoom.lIIIlIIlllllll[12], lllllllllllllIlIIIlIIIlIlIIlIIlI, Blocks.nether_brick_fence.getDefaultState(), Blocks.nether_brick_fence.getDefaultState(), (boolean)(NetherStalkRoom.lIIIlIIlllllll[6] != 0));
                lllllllllllllIlIIIlIIIlIlIIlIIlI += 2;
            }
            final int lllllllllllllIlIIIlIIIlIlIIlIIIl = this.getMetadataWithOffset(Blocks.nether_brick_stairs, NetherStalkRoom.lIIIlIIlllllll[1]);
            int lllllllllllllIlIIIlIIIlIlIIlIIII = NetherStalkRoom.lIIIlIIlllllll[6];
            "".length();
            if ("  ".length() >= "   ".length()) {
                return ((91 + 21 - 7 + 103 ^ 95 + 52 - 93 + 77) & (0x68 ^ 0x44 ^ 112 + 110 - 205 + 110 ^ -" ".length())) != 0x0;
            }
            while (!llIIIIIIIIlIIII(lllllllllllllIlIIIlIIIlIlIIlIIII, NetherStalkRoom.lIIIlIIlllllll[16])) {
                final int lllllllllllllIlIIIlIIIlIlIIIllll = lllllllllllllIlIIIlIIIlIlIIlIIII + NetherStalkRoom.lIIIlIIlllllll[10];
                int lllllllllllllIlIIIlIIIlIlIIIlllI = NetherStalkRoom.lIIIlIIlllllll[0];
                "".length();
                if ("   ".length() <= 0) {
                    return ((0x46 ^ 0x18) & ~(0xFB ^ 0xA5)) != 0x0;
                }
                while (!llIIIIIIIIlIIII(lllllllllllllIlIIIlIIIlIlIIIlllI, NetherStalkRoom.lIIIlIIlllllll[15])) {
                    this.setBlockState(lllllllllllllIlIIIlIIIlIlIIlIllI, Blocks.nether_brick_stairs.getStateFromMeta(lllllllllllllIlIIIlIIIlIlIIlIIIl), lllllllllllllIlIIIlIIIlIlIIIlllI, NetherStalkRoom.lIIIlIIlllllll[0] + lllllllllllllIlIIIlIIIlIlIIlIIII, lllllllllllllIlIIIlIIIlIlIIIllll, lllllllllllllIlIIIlIIIlIlIIIIlII);
                    ++lllllllllllllIlIIIlIIIlIlIIIlllI;
                }
                if (llIIIIIIIIlIIIl(lllllllllllllIlIIIlIIIlIlIIIllll, NetherStalkRoom.lIIIlIIlllllll[0]) && llIIIIIIIIlIIlI(lllllllllllllIlIIIlIIIlIlIIIllll, NetherStalkRoom.lIIIlIIlllllll[12])) {
                    this.fillWithBlocks(lllllllllllllIlIIIlIIIlIlIIlIllI, lllllllllllllIlIIIlIIIlIlIIIIlII, NetherStalkRoom.lIIIlIIlllllll[0], NetherStalkRoom.lIIIlIIlllllll[0], lllllllllllllIlIIIlIIIlIlIIIllll, NetherStalkRoom.lIIIlIIlllllll[15], lllllllllllllIlIIIlIIIlIlIIlIIII + NetherStalkRoom.lIIIlIIlllllll[10], lllllllllllllIlIIIlIIIlIlIIIllll, Blocks.nether_brick.getDefaultState(), Blocks.nether_brick.getDefaultState(), (boolean)(NetherStalkRoom.lIIIlIIlllllll[6] != 0));
                    "".length();
                    if (-"   ".length() >= 0) {
                        return ((0x87 ^ 0xA7) & ~(0x26 ^ 0x6)) != 0x0;
                    }
                }
                else if (llIIIIIIIIlIIIl(lllllllllllllIlIIIlIIIlIlIIIllll, NetherStalkRoom.lIIIlIIlllllll[14]) && llIIIIIIIIlIIlI(lllllllllllllIlIIIlIIIlIlIIIllll, NetherStalkRoom.lIIIlIIlllllll[13])) {
                    this.fillWithBlocks(lllllllllllllIlIIIlIIIlIlIIlIllI, lllllllllllllIlIIIlIIIlIlIIIIlII, NetherStalkRoom.lIIIlIIlllllll[0], NetherStalkRoom.lIIIlIIlllllll[12], lllllllllllllIlIIIlIIIlIlIIIllll, NetherStalkRoom.lIIIlIIlllllll[15], lllllllllllllIlIIIlIIIlIlIIlIIII + NetherStalkRoom.lIIIlIIlllllll[10], lllllllllllllIlIIIlIIIlIlIIIllll, Blocks.nether_brick.getDefaultState(), Blocks.nether_brick.getDefaultState(), (boolean)(NetherStalkRoom.lIIIlIIlllllll[6] != 0));
                }
                if (llIIIIIIIIlIIIl(lllllllllllllIlIIIlIIIlIlIIlIIII, NetherStalkRoom.lIIIlIIlllllll[2])) {
                    this.fillWithBlocks(lllllllllllllIlIIIlIIIlIlIIlIllI, lllllllllllllIlIIIlIIIlIlIIIIlII, NetherStalkRoom.lIIIlIIlllllll[0], NetherStalkRoom.lIIIlIIlllllll[16] + lllllllllllllIlIIIlIIIlIlIIlIIII, lllllllllllllIlIIIlIIIlIlIIIllll, NetherStalkRoom.lIIIlIIlllllll[15], NetherStalkRoom.lIIIlIIlllllll[14] + lllllllllllllIlIIIlIIIlIlIIlIIII, lllllllllllllIlIIIlIIIlIlIIIllll, Blocks.air.getDefaultState(), Blocks.air.getDefaultState(), (boolean)(NetherStalkRoom.lIIIlIIlllllll[6] != 0));
                }
                ++lllllllllllllIlIIIlIIIlIlIIlIIII;
            }
            int lllllllllllllIlIIIlIIIlIlIIIllIl = NetherStalkRoom.lIIIlIIlllllll[0];
            "".length();
            if (" ".length() > "  ".length()) {
                return ((0xCD ^ 0x85) & ~(0x4 ^ 0x4C)) != 0x0;
            }
            while (!llIIIIIIIIlIIII(lllllllllllllIlIIIlIIIlIlIIIllIl, NetherStalkRoom.lIIIlIIlllllll[15])) {
                this.setBlockState(lllllllllllllIlIIIlIIIlIlIIlIllI, Blocks.nether_brick_stairs.getStateFromMeta(lllllllllllllIlIIIlIIIlIlIIlIIIl), lllllllllllllIlIIIlIIIlIlIIIllIl, NetherStalkRoom.lIIIlIIlllllll[9], NetherStalkRoom.lIIIlIIlllllll[3], lllllllllllllIlIIIlIIIlIlIIIIlII);
                ++lllllllllllllIlIIIlIIIlIlIIIllIl;
            }
            this.fillWithBlocks(lllllllllllllIlIIIlIIIlIlIIlIllI, lllllllllllllIlIIIlIIIlIlIIIIlII, NetherStalkRoom.lIIIlIIlllllll[0], NetherStalkRoom.lIIIlIIlllllll[16], NetherStalkRoom.lIIIlIIlllllll[15], NetherStalkRoom.lIIIlIIlllllll[0], NetherStalkRoom.lIIIlIIlllllll[15], NetherStalkRoom.lIIIlIIlllllll[15], Blocks.nether_brick_fence.getDefaultState(), Blocks.nether_brick_fence.getDefaultState(), (boolean)(NetherStalkRoom.lIIIlIIlllllll[6] != 0));
            this.fillWithBlocks(lllllllllllllIlIIIlIIIlIlIIlIllI, lllllllllllllIlIIIlIIIlIlIIIIlII, NetherStalkRoom.lIIIlIIlllllll[15], NetherStalkRoom.lIIIlIIlllllll[16], NetherStalkRoom.lIIIlIIlllllll[15], NetherStalkRoom.lIIIlIIlllllll[15], NetherStalkRoom.lIIIlIIlllllll[15], NetherStalkRoom.lIIIlIIlllllll[15], Blocks.nether_brick_fence.getDefaultState(), Blocks.nether_brick_fence.getDefaultState(), (boolean)(NetherStalkRoom.lIIIlIIlllllll[6] != 0));
            this.fillWithBlocks(lllllllllllllIlIIIlIIIlIlIIlIllI, lllllllllllllIlIIIlIIIlIlIIIIlII, NetherStalkRoom.lIIIlIIlllllll[0], NetherStalkRoom.lIIIlIIlllllll[7], NetherStalkRoom.lIIIlIIlllllll[9], NetherStalkRoom.lIIIlIIlllllll[15], NetherStalkRoom.lIIIlIIlllllll[7], NetherStalkRoom.lIIIlIIlllllll[9], Blocks.air.getDefaultState(), Blocks.air.getDefaultState(), (boolean)(NetherStalkRoom.lIIIlIIlllllll[6] != 0));
            this.fillWithBlocks(lllllllllllllIlIIIlIIIlIlIIlIllI, lllllllllllllIlIIIlIIIlIlIIIIlII, NetherStalkRoom.lIIIlIIlllllll[11], NetherStalkRoom.lIIIlIIlllllll[0], NetherStalkRoom.lIIIlIIlllllll[11], NetherStalkRoom.lIIIlIIlllllll[1], NetherStalkRoom.lIIIlIIlllllll[0], NetherStalkRoom.lIIIlIIlllllll[1], Blocks.nether_brick.getDefaultState(), Blocks.nether_brick.getDefaultState(), (boolean)(NetherStalkRoom.lIIIlIIlllllll[6] != 0));
            this.fillWithBlocks(lllllllllllllIlIIIlIIIlIlIIlIllI, lllllllllllllIlIIIlIIIlIlIIIIlII, NetherStalkRoom.lIIIlIIlllllll[11], NetherStalkRoom.lIIIlIIlllllll[0], NetherStalkRoom.lIIIlIIlllllll[14], NetherStalkRoom.lIIIlIIlllllll[1], NetherStalkRoom.lIIIlIIlllllll[0], NetherStalkRoom.lIIIlIIlllllll[13], Blocks.nether_brick.getDefaultState(), Blocks.nether_brick.getDefaultState(), (boolean)(NetherStalkRoom.lIIIlIIlllllll[6] != 0));
            this.fillWithBlocks(lllllllllllllIlIIIlIIIlIlIIlIllI, lllllllllllllIlIIIlIIIlIlIIIIlII, NetherStalkRoom.lIIIlIIlllllll[11], NetherStalkRoom.lIIIlIIlllllll[0], NetherStalkRoom.lIIIlIIlllllll[10], NetherStalkRoom.lIIIlIIlllllll[11], NetherStalkRoom.lIIIlIIlllllll[0], NetherStalkRoom.lIIIlIIlllllll[12], Blocks.nether_brick.getDefaultState(), Blocks.nether_brick.getDefaultState(), (boolean)(NetherStalkRoom.lIIIlIIlllllll[6] != 0));
            this.fillWithBlocks(lllllllllllllIlIIIlIIIlIlIIlIllI, lllllllllllllIlIIIlIIIlIlIIIIlII, NetherStalkRoom.lIIIlIIlllllll[14], NetherStalkRoom.lIIIlIIlllllll[0], NetherStalkRoom.lIIIlIIlllllll[11], NetherStalkRoom.lIIIlIIlllllll[13], NetherStalkRoom.lIIIlIIlllllll[0], NetherStalkRoom.lIIIlIIlllllll[1], Blocks.nether_brick.getDefaultState(), Blocks.nether_brick.getDefaultState(), (boolean)(NetherStalkRoom.lIIIlIIlllllll[6] != 0));
            this.fillWithBlocks(lllllllllllllIlIIIlIIIlIlIIlIllI, lllllllllllllIlIIIlIIIlIlIIIIlII, NetherStalkRoom.lIIIlIIlllllll[14], NetherStalkRoom.lIIIlIIlllllll[0], NetherStalkRoom.lIIIlIIlllllll[14], NetherStalkRoom.lIIIlIIlllllll[13], NetherStalkRoom.lIIIlIIlllllll[0], NetherStalkRoom.lIIIlIIlllllll[13], Blocks.nether_brick.getDefaultState(), Blocks.nether_brick.getDefaultState(), (boolean)(NetherStalkRoom.lIIIlIIlllllll[6] != 0));
            this.fillWithBlocks(lllllllllllllIlIIIlIIIlIlIIlIllI, lllllllllllllIlIIIlIIIlIlIIIIlII, NetherStalkRoom.lIIIlIIlllllll[13], NetherStalkRoom.lIIIlIIlllllll[0], NetherStalkRoom.lIIIlIIlllllll[10], NetherStalkRoom.lIIIlIIlllllll[13], NetherStalkRoom.lIIIlIIlllllll[0], NetherStalkRoom.lIIIlIIlllllll[12], Blocks.nether_brick.getDefaultState(), Blocks.nether_brick.getDefaultState(), (boolean)(NetherStalkRoom.lIIIlIIlllllll[6] != 0));
            final int lllllllllllllIlIIIlIIIlIlIIIllII = this.getMetadataWithOffset(Blocks.nether_brick_stairs, NetherStalkRoom.lIIIlIIlllllll[6]);
            final int lllllllllllllIlIIIlIIIlIlIIIlIll = this.getMetadataWithOffset(Blocks.nether_brick_stairs, NetherStalkRoom.lIIIlIIlllllll[2]);
            this.setBlockState(lllllllllllllIlIIIlIIIlIlIIlIllI, Blocks.nether_brick_stairs.getStateFromMeta(lllllllllllllIlIIIlIIIlIlIIIlIll), NetherStalkRoom.lIIIlIIlllllll[10], NetherStalkRoom.lIIIlIIlllllll[0], NetherStalkRoom.lIIIlIIlllllll[11], lllllllllllllIlIIIlIIIlIlIIIIlII);
            this.setBlockState(lllllllllllllIlIIIlIIIlIlIIlIllI, Blocks.nether_brick_stairs.getStateFromMeta(lllllllllllllIlIIIlIIIlIlIIIlIll), NetherStalkRoom.lIIIlIIlllllll[10], NetherStalkRoom.lIIIlIIlllllll[0], NetherStalkRoom.lIIIlIIlllllll[1], lllllllllllllIlIIIlIIIlIlIIIIlII);
            this.setBlockState(lllllllllllllIlIIIlIIIlIlIIlIllI, Blocks.nether_brick_stairs.getStateFromMeta(lllllllllllllIlIIIlIIIlIlIIIlIll), NetherStalkRoom.lIIIlIIlllllll[10], NetherStalkRoom.lIIIlIIlllllll[0], NetherStalkRoom.lIIIlIIlllllll[14], lllllllllllllIlIIIlIIIlIlIIIIlII);
            this.setBlockState(lllllllllllllIlIIIlIIIlIlIIlIllI, Blocks.nether_brick_stairs.getStateFromMeta(lllllllllllllIlIIIlIIIlIlIIIlIll), NetherStalkRoom.lIIIlIIlllllll[10], NetherStalkRoom.lIIIlIIlllllll[0], NetherStalkRoom.lIIIlIIlllllll[13], lllllllllllllIlIIIlIIIlIlIIIIlII);
            this.setBlockState(lllllllllllllIlIIIlIIIlIlIIlIllI, Blocks.nether_brick_stairs.getStateFromMeta(lllllllllllllIlIIIlIIIlIlIIIllII), NetherStalkRoom.lIIIlIIlllllll[12], NetherStalkRoom.lIIIlIIlllllll[0], NetherStalkRoom.lIIIlIIlllllll[11], lllllllllllllIlIIIlIIIlIlIIIIlII);
            this.setBlockState(lllllllllllllIlIIIlIIIlIlIIlIllI, Blocks.nether_brick_stairs.getStateFromMeta(lllllllllllllIlIIIlIIIlIlIIIllII), NetherStalkRoom.lIIIlIIlllllll[12], NetherStalkRoom.lIIIlIIlllllll[0], NetherStalkRoom.lIIIlIIlllllll[1], lllllllllllllIlIIIlIIIlIlIIIIlII);
            this.setBlockState(lllllllllllllIlIIIlIIIlIlIIlIllI, Blocks.nether_brick_stairs.getStateFromMeta(lllllllllllllIlIIIlIIIlIlIIIllII), NetherStalkRoom.lIIIlIIlllllll[12], NetherStalkRoom.lIIIlIIlllllll[0], NetherStalkRoom.lIIIlIIlllllll[14], lllllllllllllIlIIIlIIIlIlIIIIlII);
            this.setBlockState(lllllllllllllIlIIIlIIIlIlIIlIllI, Blocks.nether_brick_stairs.getStateFromMeta(lllllllllllllIlIIIlIIIlIlIIIllII), NetherStalkRoom.lIIIlIIlllllll[12], NetherStalkRoom.lIIIlIIlllllll[0], NetherStalkRoom.lIIIlIIlllllll[13], lllllllllllllIlIIIlIIIlIlIIIIlII);
            this.fillWithBlocks(lllllllllllllIlIIIlIIIlIlIIlIllI, lllllllllllllIlIIIlIIIlIlIIIIlII, NetherStalkRoom.lIIIlIIlllllll[1], NetherStalkRoom.lIIIlIIlllllll[10], NetherStalkRoom.lIIIlIIlllllll[10], NetherStalkRoom.lIIIlIIlllllll[10], NetherStalkRoom.lIIIlIIlllllll[10], NetherStalkRoom.lIIIlIIlllllll[12], Blocks.soul_sand.getDefaultState(), Blocks.soul_sand.getDefaultState(), (boolean)(NetherStalkRoom.lIIIlIIlllllll[6] != 0));
            this.fillWithBlocks(lllllllllllllIlIIIlIIIlIlIIlIllI, lllllllllllllIlIIIlIIIlIlIIIIlII, NetherStalkRoom.lIIIlIIlllllll[12], NetherStalkRoom.lIIIlIIlllllll[10], NetherStalkRoom.lIIIlIIlllllll[10], NetherStalkRoom.lIIIlIIlllllll[14], NetherStalkRoom.lIIIlIIlllllll[10], NetherStalkRoom.lIIIlIIlllllll[12], Blocks.soul_sand.getDefaultState(), Blocks.soul_sand.getDefaultState(), (boolean)(NetherStalkRoom.lIIIlIIlllllll[6] != 0));
            this.fillWithBlocks(lllllllllllllIlIIIlIIIlIlIIlIllI, lllllllllllllIlIIIlIIIlIlIIIIlII, NetherStalkRoom.lIIIlIIlllllll[1], NetherStalkRoom.lIIIlIIlllllll[0], NetherStalkRoom.lIIIlIIlllllll[10], NetherStalkRoom.lIIIlIIlllllll[10], NetherStalkRoom.lIIIlIIlllllll[0], NetherStalkRoom.lIIIlIIlllllll[12], Blocks.nether_wart.getDefaultState(), Blocks.nether_wart.getDefaultState(), (boolean)(NetherStalkRoom.lIIIlIIlllllll[6] != 0));
            this.fillWithBlocks(lllllllllllllIlIIIlIIIlIlIIlIllI, lllllllllllllIlIIIlIIIlIlIIIIlII, NetherStalkRoom.lIIIlIIlllllll[12], NetherStalkRoom.lIIIlIIlllllll[0], NetherStalkRoom.lIIIlIIlllllll[10], NetherStalkRoom.lIIIlIIlllllll[14], NetherStalkRoom.lIIIlIIlllllll[0], NetherStalkRoom.lIIIlIIlllllll[12], Blocks.nether_wart.getDefaultState(), Blocks.nether_wart.getDefaultState(), (boolean)(NetherStalkRoom.lIIIlIIlllllll[6] != 0));
            this.fillWithBlocks(lllllllllllllIlIIIlIIIlIlIIlIllI, lllllllllllllIlIIIlIIIlIlIIIIlII, NetherStalkRoom.lIIIlIIlllllll[10], NetherStalkRoom.lIIIlIIlllllll[11], NetherStalkRoom.lIIIlIIlllllll[6], NetherStalkRoom.lIIIlIIlllllll[12], NetherStalkRoom.lIIIlIIlllllll[11], NetherStalkRoom.lIIIlIIlllllll[9], Blocks.nether_brick.getDefaultState(), Blocks.nether_brick.getDefaultState(), (boolean)(NetherStalkRoom.lIIIlIIlllllll[6] != 0));
            this.fillWithBlocks(lllllllllllllIlIIIlIIIlIlIIlIllI, lllllllllllllIlIIIlIIIlIlIIIIlII, NetherStalkRoom.lIIIlIIlllllll[6], NetherStalkRoom.lIIIlIIlllllll[11], NetherStalkRoom.lIIIlIIlllllll[10], NetherStalkRoom.lIIIlIIlllllll[9], NetherStalkRoom.lIIIlIIlllllll[11], NetherStalkRoom.lIIIlIIlllllll[12], Blocks.nether_brick.getDefaultState(), Blocks.nether_brick.getDefaultState(), (boolean)(NetherStalkRoom.lIIIlIIlllllll[6] != 0));
            this.fillWithBlocks(lllllllllllllIlIIIlIIIlIlIIlIllI, lllllllllllllIlIIIlIIIlIlIIIIlII, NetherStalkRoom.lIIIlIIlllllll[10], NetherStalkRoom.lIIIlIIlllllll[6], NetherStalkRoom.lIIIlIIlllllll[6], NetherStalkRoom.lIIIlIIlllllll[12], NetherStalkRoom.lIIIlIIlllllll[2], NetherStalkRoom.lIIIlIIlllllll[1], Blocks.nether_brick.getDefaultState(), Blocks.nether_brick.getDefaultState(), (boolean)(NetherStalkRoom.lIIIlIIlllllll[6] != 0));
            this.fillWithBlocks(lllllllllllllIlIIIlIIIlIlIIlIllI, lllllllllllllIlIIIlIIIlIlIIIIlII, NetherStalkRoom.lIIIlIIlllllll[10], NetherStalkRoom.lIIIlIIlllllll[6], NetherStalkRoom.lIIIlIIlllllll[14], NetherStalkRoom.lIIIlIIlllllll[12], NetherStalkRoom.lIIIlIIlllllll[2], NetherStalkRoom.lIIIlIIlllllll[9], Blocks.nether_brick.getDefaultState(), Blocks.nether_brick.getDefaultState(), (boolean)(NetherStalkRoom.lIIIlIIlllllll[6] != 0));
            this.fillWithBlocks(lllllllllllllIlIIIlIIIlIlIIlIllI, lllllllllllllIlIIIlIIIlIlIIIIlII, NetherStalkRoom.lIIIlIIlllllll[6], NetherStalkRoom.lIIIlIIlllllll[6], NetherStalkRoom.lIIIlIIlllllll[10], NetherStalkRoom.lIIIlIIlllllll[1], NetherStalkRoom.lIIIlIIlllllll[2], NetherStalkRoom.lIIIlIIlllllll[12], Blocks.nether_brick.getDefaultState(), Blocks.nether_brick.getDefaultState(), (boolean)(NetherStalkRoom.lIIIlIIlllllll[6] != 0));
            this.fillWithBlocks(lllllllllllllIlIIIlIIIlIlIIlIllI, lllllllllllllIlIIIlIIIlIlIIIIlII, NetherStalkRoom.lIIIlIIlllllll[14], NetherStalkRoom.lIIIlIIlllllll[6], NetherStalkRoom.lIIIlIIlllllll[10], NetherStalkRoom.lIIIlIIlllllll[9], NetherStalkRoom.lIIIlIIlllllll[2], NetherStalkRoom.lIIIlIIlllllll[12], Blocks.nether_brick.getDefaultState(), Blocks.nether_brick.getDefaultState(), (boolean)(NetherStalkRoom.lIIIlIIlllllll[6] != 0));
            int lllllllllllllIlIIIlIIIlIlIIIlIlI = NetherStalkRoom.lIIIlIIlllllll[10];
            "".length();
            if ((0x7D ^ 0x79) == ((0x8B ^ 0x9A) & ~(0x27 ^ 0x36))) {
                return ((0x32 ^ 0x78) & ~(0x35 ^ 0x7F) & ~((0x76 ^ 0x59) & ~(0x45 ^ 0x6A))) != 0x0;
            }
            while (!llIIIIIIIIlIIII(lllllllllllllIlIIIlIIIlIlIIIlIlI, NetherStalkRoom.lIIIlIIlllllll[12])) {
                int lllllllllllllIlIIIlIIIlIlIIIlIIl = NetherStalkRoom.lIIIlIIlllllll[6];
                "".length();
                if ((0x72 ^ 0x76) == 0x0) {
                    return ((0x41 ^ 0x1) & ~(0x38 ^ 0x78)) != 0x0;
                }
                while (!llIIIIIIIIlIIII(lllllllllllllIlIIIlIIIlIlIIIlIIl, NetherStalkRoom.lIIIlIIlllllll[11])) {
                    this.replaceAirAndLiquidDownwards(lllllllllllllIlIIIlIIIlIlIIlIllI, Blocks.nether_brick.getDefaultState(), lllllllllllllIlIIIlIIIlIlIIIlIlI, NetherStalkRoom.lIIIlIIlllllll[17], lllllllllllllIlIIIlIIIlIlIIIlIIl, lllllllllllllIlIIIlIIIlIlIIIIlII);
                    this.replaceAirAndLiquidDownwards(lllllllllllllIlIIIlIIIlIlIIlIllI, Blocks.nether_brick.getDefaultState(), lllllllllllllIlIIIlIIIlIlIIIlIlI, NetherStalkRoom.lIIIlIIlllllll[17], NetherStalkRoom.lIIIlIIlllllll[9] - lllllllllllllIlIIIlIIIlIlIIIlIIl, lllllllllllllIlIIIlIIIlIlIIIIlII);
                    ++lllllllllllllIlIIIlIIIlIlIIIlIIl;
                }
                ++lllllllllllllIlIIIlIIIlIlIIIlIlI;
            }
            int lllllllllllllIlIIIlIIIlIlIIIlIII = NetherStalkRoom.lIIIlIIlllllll[6];
            "".length();
            if (((0xB6 ^ 0xAB) & ~(0xB7 ^ 0xAA)) > ((0x29 ^ 0x1E) & ~(0x57 ^ 0x60))) {
                return ((0xCA ^ 0x84) & ~(0x5F ^ 0x11)) != 0x0;
            }
            while (!llIIIIIIIIlIIII(lllllllllllllIlIIIlIIIlIlIIIlIII, NetherStalkRoom.lIIIlIIlllllll[11])) {
                int lllllllllllllIlIIIlIIIlIlIIIIlll = NetherStalkRoom.lIIIlIIlllllll[10];
                "".length();
                if (" ".length() >= "   ".length()) {
                    return ((0x8D ^ 0xB5) & ~(0x67 ^ 0x5F)) != 0x0;
                }
                while (!llIIIIIIIIlIIII(lllllllllllllIlIIIlIIIlIlIIIIlll, NetherStalkRoom.lIIIlIIlllllll[12])) {
                    this.replaceAirAndLiquidDownwards(lllllllllllllIlIIIlIIIlIlIIlIllI, Blocks.nether_brick.getDefaultState(), lllllllllllllIlIIIlIIIlIlIIIlIII, NetherStalkRoom.lIIIlIIlllllll[17], lllllllllllllIlIIIlIIIlIlIIIIlll, lllllllllllllIlIIIlIIIlIlIIIIlII);
                    this.replaceAirAndLiquidDownwards(lllllllllllllIlIIIlIIIlIlIIlIllI, Blocks.nether_brick.getDefaultState(), NetherStalkRoom.lIIIlIIlllllll[9] - lllllllllllllIlIIIlIIIlIlIIIlIII, NetherStalkRoom.lIIIlIIlllllll[17], lllllllllllllIlIIIlIIIlIlIIIIlll, lllllllllllllIlIIIlIIIlIlIIIIlII);
                    ++lllllllllllllIlIIIlIIIlIlIIIIlll;
                }
                ++lllllllllllllIlIIIlIIIlIlIIIlIII;
            }
            return NetherStalkRoom.lIIIlIIlllllll[2] != 0;
        }
        
        public NetherStalkRoom(final int lllllllllllllIlIIIlIIIlIllIIIllI, final Random lllllllllllllIlIIIlIIIlIllIIlIlI, final StructureBoundingBox lllllllllllllIlIIIlIIIlIllIIlIIl, final EnumFacing lllllllllllllIlIIIlIIIlIllIIIlII) {
            super(lllllllllllllIlIIIlIIIlIllIIIllI);
            this.coordBaseMode = lllllllllllllIlIIIlIIIlIllIIIlII;
            this.boundingBox = lllllllllllllIlIIIlIIIlIllIIlIIl;
        }
        
        private static boolean llIIIIIIIIlIIII(final int lllllllllllllIlIIIlIIIlIIlllIlII, final int lllllllllllllIlIIIlIIIlIIlllIIll) {
            return lllllllllllllIlIIIlIIIlIIlllIlII > lllllllllllllIlIIIlIIIlIIlllIIll;
        }
        
        private static boolean llIIIIIIIIlIIlI(final int lllllllllllllIlIIIlIIIlIIllllIII, final int lllllllllllllIlIIIlIIIlIIlllIlll) {
            return lllllllllllllIlIIIlIIIlIIllllIII <= lllllllllllllIlIIIlIIIlIIlllIlll;
        }
        
        static {
            llIIIIIIIIIllIl();
        }
    }
    
    public static class Corridor2 extends Piece
    {
        private /* synthetic */ boolean field_111020_b;
        private static final /* synthetic */ String[] llIIlIIIllllll;
        private static final /* synthetic */ int[] llIIlIIlIIIIII;
        
        private static void lIIIllIIIIlIIlII() {
            (llIIlIIIllllll = new String[Corridor2.llIIlIIlIIIIII[7]])[Corridor2.llIIlIIlIIIIII[2]] = lIIIllIIIIlIIIll("NwMDHSU=", "tkfnQ");
            Corridor2.llIIlIIIllllll[Corridor2.llIIlIIlIIIIII[1]] = lIIIllIIIIlIIIll("ACosAA0=", "CBIsy");
        }
        
        @Override
        protected void readStructureFromNBT(final NBTTagCompound llllllllllllIlllIIlIllIllIIIIlIl) {
            super.readStructureFromNBT(llllllllllllIlllIIlIllIllIIIIlIl);
            this.field_111020_b = llllllllllllIlllIIlIllIllIIIIlIl.getBoolean(Corridor2.llIIlIIIllllll[Corridor2.llIIlIIlIIIIII[2]]);
        }
        
        public Corridor2() {
        }
        
        private static boolean lIIIllIIIIlIlIlI(final int llllllllllllIlllIIlIllIlIIlIlllI, final int llllllllllllIlllIIlIllIlIIlIllIl) {
            return llllllllllllIlllIIlIllIlIIlIlllI < llllllllllllIlllIIlIllIlIIlIllIl;
        }
        
        static {
            lIIIllIIIIlIIlIl();
            lIIIllIIIIlIIlII();
        }
        
        @Override
        protected void writeStructureToNBT(final NBTTagCompound llllllllllllIlllIIlIllIllIIIIIIl) {
            super.writeStructureToNBT(llllllllllllIlllIIlIllIllIIIIIIl);
            llllllllllllIlllIIlIllIllIIIIIIl.setBoolean(Corridor2.llIIlIIIllllll[Corridor2.llIIlIIlIIIIII[1]], this.field_111020_b);
        }
        
        public Corridor2(final int llllllllllllIlllIIlIllIllIIlIIll, final Random llllllllllllIlllIIlIllIllIIlIIlI, final StructureBoundingBox llllllllllllIlllIIlIllIllIIlIIIl, final EnumFacing llllllllllllIlllIIlIllIllIIlIIII) {
            super(llllllllllllIlllIIlIllIllIIlIIll);
            this.coordBaseMode = llllllllllllIlllIIlIllIllIIlIIII;
            this.boundingBox = llllllllllllIlllIIlIllIllIIlIIIl;
            int field_111020_b;
            if (lIIIllIIIIlIIllI(llllllllllllIlllIIlIllIllIIlIIlI.nextInt(Corridor2.llIIlIIlIIIIII[0]))) {
                field_111020_b = Corridor2.llIIlIIlIIIIII[1];
                "".length();
                if ((0x87 ^ 0x9C ^ (0x5C ^ 0x42)) <= 0) {
                    throw null;
                }
            }
            else {
                field_111020_b = Corridor2.llIIlIIlIIIIII[2];
            }
            this.field_111020_b = (field_111020_b != 0);
        }
        
        public static Corridor2 func_175876_a(final List<StructureComponent> llllllllllllIlllIIlIllIlIllIlIlI, final Random llllllllllllIlllIIlIllIlIllIlIIl, final int llllllllllllIlllIIlIllIlIllIlIII, final int llllllllllllIlllIIlIllIlIlIlllll, final int llllllllllllIlllIIlIllIlIllIIllI, final EnumFacing llllllllllllIlllIIlIllIlIllIIlIl, final int llllllllllllIlllIIlIllIlIlIlllII) {
            final StructureBoundingBox llllllllllllIlllIIlIllIlIllIIIll = StructureBoundingBox.getComponentToAddBoundingBox(llllllllllllIlllIIlIllIlIllIlIII, llllllllllllIlllIIlIllIlIlIlllll, llllllllllllIlllIIlIllIlIllIIllI, Corridor2.llIIlIIlIIIIII[3], Corridor2.llIIlIIlIIIIII[2], Corridor2.llIIlIIlIIIIII[2], Corridor2.llIIlIIlIIIIII[4], Corridor2.llIIlIIlIIIIII[5], Corridor2.llIIlIIlIIIIII[4], llllllllllllIlllIIlIllIlIllIIlIl);
            Corridor2 corridor2;
            if (lIIIllIIIIlIIlll(Piece.isAboveGround(llllllllllllIlllIIlIllIlIllIIIll) ? 1 : 0) && lIIIllIIIIlIlIII(StructureComponent.findIntersecting(llllllllllllIlllIIlIllIlIllIlIlI, llllllllllllIlllIIlIllIlIllIIIll))) {
                corridor2 = new Corridor2(llllllllllllIlllIIlIllIlIlIlllII, llllllllllllIlllIIlIllIlIllIlIIl, llllllllllllIlllIIlIllIlIllIIIll, llllllllllllIlllIIlIllIlIllIIlIl);
                "".length();
                if (("   ".length() & ("   ".length() ^ -" ".length())) != ((0xDA ^ 0x9D ^ (0x72 ^ 0x2F)) & (73 + 151 - 195 + 135 ^ 90 + 124 - 115 + 91 ^ -" ".length()))) {
                    return null;
                }
            }
            else {
                corridor2 = null;
            }
            return corridor2;
        }
        
        private static void lIIIllIIIIlIIlIl() {
            (llIIlIIlIIIIII = new int[9])[0] = "   ".length();
            Corridor2.llIIlIIlIIIIII[1] = " ".length();
            Corridor2.llIIlIIlIIIIII[2] = ((0xA0 ^ 0xA6 ^ (0xE ^ 0x23)) & (0xDF ^ 0x98 ^ (0x71 ^ 0x1D) ^ -" ".length()));
            Corridor2.llIIlIIlIIIIII[3] = -" ".length();
            Corridor2.llIIlIIlIIIIII[4] = (0x51 ^ 0x54);
            Corridor2.llIIlIIlIIIIII[5] = (0xB1 ^ 0xB6);
            Corridor2.llIIlIIlIIIIII[6] = (0xB5 ^ 0xBD ^ (0x66 ^ 0x6A));
            Corridor2.llIIlIIlIIIIII[7] = "  ".length();
            Corridor2.llIIlIIlIIIIII[8] = (0x3D ^ 0x3B);
        }
        
        @Override
        public boolean addComponentParts(final World llllllllllllIlllIIlIllIlIlIIllIl, final Random llllllllllllIlllIIlIllIlIlIlIIlI, final StructureBoundingBox llllllllllllIlllIIlIllIlIlIlIIIl) {
            this.fillWithBlocks(llllllllllllIlllIIlIllIlIlIIllIl, llllllllllllIlllIIlIllIlIlIlIIIl, Corridor2.llIIlIIlIIIIII[2], Corridor2.llIIlIIlIIIIII[2], Corridor2.llIIlIIlIIIIII[2], Corridor2.llIIlIIlIIIIII[6], Corridor2.llIIlIIlIIIIII[1], Corridor2.llIIlIIlIIIIII[6], Blocks.nether_brick.getDefaultState(), Blocks.nether_brick.getDefaultState(), (boolean)(Corridor2.llIIlIIlIIIIII[2] != 0));
            this.fillWithBlocks(llllllllllllIlllIIlIllIlIlIIllIl, llllllllllllIlllIIlIllIlIlIlIIIl, Corridor2.llIIlIIlIIIIII[2], Corridor2.llIIlIIlIIIIII[7], Corridor2.llIIlIIlIIIIII[2], Corridor2.llIIlIIlIIIIII[6], Corridor2.llIIlIIlIIIIII[4], Corridor2.llIIlIIlIIIIII[6], Blocks.air.getDefaultState(), Blocks.air.getDefaultState(), (boolean)(Corridor2.llIIlIIlIIIIII[2] != 0));
            this.fillWithBlocks(llllllllllllIlllIIlIllIlIlIIllIl, llllllllllllIlllIIlIllIlIlIlIIIl, Corridor2.llIIlIIlIIIIII[2], Corridor2.llIIlIIlIIIIII[7], Corridor2.llIIlIIlIIIIII[2], Corridor2.llIIlIIlIIIIII[2], Corridor2.llIIlIIlIIIIII[4], Corridor2.llIIlIIlIIIIII[6], Blocks.nether_brick.getDefaultState(), Blocks.nether_brick.getDefaultState(), (boolean)(Corridor2.llIIlIIlIIIIII[2] != 0));
            this.fillWithBlocks(llllllllllllIlllIIlIllIlIlIIllIl, llllllllllllIlllIIlIllIlIlIlIIIl, Corridor2.llIIlIIlIIIIII[2], Corridor2.llIIlIIlIIIIII[0], Corridor2.llIIlIIlIIIIII[1], Corridor2.llIIlIIlIIIIII[2], Corridor2.llIIlIIlIIIIII[6], Corridor2.llIIlIIlIIIIII[1], Blocks.nether_brick_fence.getDefaultState(), Blocks.nether_brick_fence.getDefaultState(), (boolean)(Corridor2.llIIlIIlIIIIII[2] != 0));
            this.fillWithBlocks(llllllllllllIlllIIlIllIlIlIIllIl, llllllllllllIlllIIlIllIlIlIlIIIl, Corridor2.llIIlIIlIIIIII[2], Corridor2.llIIlIIlIIIIII[0], Corridor2.llIIlIIlIIIIII[0], Corridor2.llIIlIIlIIIIII[2], Corridor2.llIIlIIlIIIIII[6], Corridor2.llIIlIIlIIIIII[0], Blocks.nether_brick_fence.getDefaultState(), Blocks.nether_brick_fence.getDefaultState(), (boolean)(Corridor2.llIIlIIlIIIIII[2] != 0));
            this.fillWithBlocks(llllllllllllIlllIIlIllIlIlIIllIl, llllllllllllIlllIIlIllIlIlIlIIIl, Corridor2.llIIlIIlIIIIII[6], Corridor2.llIIlIIlIIIIII[7], Corridor2.llIIlIIlIIIIII[2], Corridor2.llIIlIIlIIIIII[6], Corridor2.llIIlIIlIIIIII[4], Corridor2.llIIlIIlIIIIII[2], Blocks.nether_brick.getDefaultState(), Blocks.nether_brick.getDefaultState(), (boolean)(Corridor2.llIIlIIlIIIIII[2] != 0));
            this.fillWithBlocks(llllllllllllIlllIIlIllIlIlIIllIl, llllllllllllIlllIIlIllIlIlIlIIIl, Corridor2.llIIlIIlIIIIII[1], Corridor2.llIIlIIlIIIIII[7], Corridor2.llIIlIIlIIIIII[6], Corridor2.llIIlIIlIIIIII[6], Corridor2.llIIlIIlIIIIII[4], Corridor2.llIIlIIlIIIIII[6], Blocks.nether_brick.getDefaultState(), Blocks.nether_brick.getDefaultState(), (boolean)(Corridor2.llIIlIIlIIIIII[2] != 0));
            this.fillWithBlocks(llllllllllllIlllIIlIllIlIlIIllIl, llllllllllllIlllIIlIllIlIlIlIIIl, Corridor2.llIIlIIlIIIIII[1], Corridor2.llIIlIIlIIIIII[0], Corridor2.llIIlIIlIIIIII[6], Corridor2.llIIlIIlIIIIII[1], Corridor2.llIIlIIlIIIIII[6], Corridor2.llIIlIIlIIIIII[6], Blocks.nether_brick_fence.getDefaultState(), Blocks.nether_brick.getDefaultState(), (boolean)(Corridor2.llIIlIIlIIIIII[2] != 0));
            this.fillWithBlocks(llllllllllllIlllIIlIllIlIlIIllIl, llllllllllllIlllIIlIllIlIlIlIIIl, Corridor2.llIIlIIlIIIIII[0], Corridor2.llIIlIIlIIIIII[0], Corridor2.llIIlIIlIIIIII[6], Corridor2.llIIlIIlIIIIII[0], Corridor2.llIIlIIlIIIIII[6], Corridor2.llIIlIIlIIIIII[6], Blocks.nether_brick_fence.getDefaultState(), Blocks.nether_brick.getDefaultState(), (boolean)(Corridor2.llIIlIIlIIIIII[2] != 0));
            if (lIIIllIIIIlIIlll(this.field_111020_b ? 1 : 0) && lIIIllIIIIlIIlll(llllllllllllIlllIIlIllIlIlIlIIIl.isVecInside(new BlockPos(this.getXWithOffset(Corridor2.llIIlIIlIIIIII[1], Corridor2.llIIlIIlIIIIII[0]), this.getYWithOffset(Corridor2.llIIlIIlIIIIII[7]), this.getZWithOffset(Corridor2.llIIlIIlIIIIII[1], Corridor2.llIIlIIlIIIIII[0]))) ? 1 : 0)) {
                this.field_111020_b = (Corridor2.llIIlIIlIIIIII[2] != 0);
                this.generateChestContents(llllllllllllIlllIIlIllIlIlIIllIl, llllllllllllIlllIIlIllIlIlIlIIIl, llllllllllllIlllIIlIllIlIlIlIIlI, Corridor2.llIIlIIlIIIIII[1], Corridor2.llIIlIIlIIIIII[7], Corridor2.llIIlIIlIIIIII[0], Corridor2.field_111019_a, Corridor2.llIIlIIlIIIIII[7] + llllllllllllIlllIIlIllIlIlIlIIlI.nextInt(Corridor2.llIIlIIlIIIIII[6]));
                "".length();
            }
            this.fillWithBlocks(llllllllllllIlllIIlIllIlIlIIllIl, llllllllllllIlllIIlIllIlIlIlIIIl, Corridor2.llIIlIIlIIIIII[2], Corridor2.llIIlIIlIIIIII[8], Corridor2.llIIlIIlIIIIII[2], Corridor2.llIIlIIlIIIIII[6], Corridor2.llIIlIIlIIIIII[8], Corridor2.llIIlIIlIIIIII[6], Blocks.nether_brick.getDefaultState(), Blocks.nether_brick.getDefaultState(), (boolean)(Corridor2.llIIlIIlIIIIII[2] != 0));
            int llllllllllllIlllIIlIllIlIlIlIIII = Corridor2.llIIlIIlIIIIII[2];
            "".length();
            if ((0x5F ^ 0x40 ^ (0x63 ^ 0x78)) != (0x24 ^ 0x33 ^ (0x4C ^ 0x5F))) {
                return ((53 + 34 - 83 + 179 ^ 165 + 151 - 254 + 107) & (0xC4 ^ 0x9E ^ (0xDC ^ 0x98) ^ -" ".length())) != 0x0;
            }
            while (!lIIIllIIIIlIlIIl(llllllllllllIlllIIlIllIlIlIlIIII, Corridor2.llIIlIIlIIIIII[6])) {
                int llllllllllllIlllIIlIllIlIlIIllll = Corridor2.llIIlIIlIIIIII[2];
                "".length();
                if ((169 + 60 - 85 + 52 ^ 102 + 23 - 9 + 76) == -" ".length()) {
                    return ((33 + 97 + 71 + 44 ^ 108 + 55 + 2 + 4) & (11 + 31 - 39 + 206 ^ 17 + 25 + 90 + 9 ^ -" ".length())) != 0x0;
                }
                while (!lIIIllIIIIlIlIIl(llllllllllllIlllIIlIllIlIlIIllll, Corridor2.llIIlIIlIIIIII[6])) {
                    this.replaceAirAndLiquidDownwards(llllllllllllIlllIIlIllIlIlIIllIl, Blocks.nether_brick.getDefaultState(), llllllllllllIlllIIlIllIlIlIlIIII, Corridor2.llIIlIIlIIIIII[3], llllllllllllIlllIIlIllIlIlIIllll, llllllllllllIlllIIlIllIlIlIlIIIl);
                    ++llllllllllllIlllIIlIllIlIlIIllll;
                }
                ++llllllllllllIlllIIlIllIlIlIlIIII;
            }
            return Corridor2.llIIlIIlIIIIII[1] != 0;
        }
        
        private static boolean lIIIllIIIIlIIlll(final int llllllllllllIlllIIlIllIlIIlIIlIl) {
            return llllllllllllIlllIIlIllIlIIlIIlIl != 0;
        }
        
        private static boolean lIIIllIIIIlIIllI(final int llllllllllllIlllIIlIllIlIIlIIIll) {
            return llllllllllllIlllIIlIllIlIIlIIIll == 0;
        }
        
        private static boolean lIIIllIIIIlIlIIl(final int llllllllllllIlllIIlIllIlIIlIlIlI, final int llllllllllllIlllIIlIllIlIIlIlIIl) {
            return llllllllllllIlllIIlIllIlIIlIlIlI > llllllllllllIlllIIlIllIlIIlIlIIl;
        }
        
        @Override
        public void buildComponent(final StructureComponent llllllllllllIlllIIlIllIlIlllIlIl, final List<StructureComponent> llllllllllllIlllIIlIllIlIllllIII, final Random llllllllllllIlllIIlIllIlIlllIIll) {
            this.getNextComponentZ((Start)llllllllllllIlllIIlIllIlIlllIlIl, llllllllllllIlllIIlIllIlIllllIII, llllllllllllIlllIIlIllIlIlllIIll, Corridor2.llIIlIIlIIIIII[2], Corridor2.llIIlIIlIIIIII[1], (boolean)(Corridor2.llIIlIIlIIIIII[1] != 0));
            "".length();
        }
        
        private static boolean lIIIllIIIIlIlIII(final Object llllllllllllIlllIIlIllIlIIlIIlll) {
            return llllllllllllIlllIIlIllIlIIlIIlll == null;
        }
        
        private static String lIIIllIIIIlIIIll(String llllllllllllIlllIIlIllIlIIlllIIl, final String llllllllllllIlllIIlIllIlIIllllIl) {
            llllllllllllIlllIIlIllIlIIlllIIl = (float)new String(Base64.getDecoder().decode(((String)llllllllllllIlllIIlIllIlIIlllIIl).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
            final StringBuilder llllllllllllIlllIIlIllIlIIllllII = new StringBuilder();
            final char[] llllllllllllIlllIIlIllIlIIlllIll = llllllllllllIlllIIlIllIlIIllllIl.toCharArray();
            int llllllllllllIlllIIlIllIlIIlllIlI = Corridor2.llIIlIIlIIIIII[2];
            final int llllllllllllIlllIIlIllIlIIllIlII = (Object)((String)llllllllllllIlllIIlIllIlIIlllIIl).toCharArray();
            final char llllllllllllIlllIIlIllIlIIllIIll = (char)llllllllllllIlllIIlIllIlIIllIlII.length;
            float llllllllllllIlllIIlIllIlIIllIIlI = Corridor2.llIIlIIlIIIIII[2];
            while (lIIIllIIIIlIlIlI((int)llllllllllllIlllIIlIllIlIIllIIlI, llllllllllllIlllIIlIllIlIIllIIll)) {
                final char llllllllllllIlllIIlIllIlIIllllll = llllllllllllIlllIIlIllIlIIllIlII[llllllllllllIlllIIlIllIlIIllIIlI];
                llllllllllllIlllIIlIllIlIIllllII.append((char)(llllllllllllIlllIIlIllIlIIllllll ^ llllllllllllIlllIIlIllIlIIlllIll[llllllllllllIlllIIlIllIlIIlllIlI % llllllllllllIlllIIlIllIlIIlllIll.length]));
                "".length();
                ++llllllllllllIlllIIlIllIlIIlllIlI;
                ++llllllllllllIlllIIlIllIlIIllIIlI;
                "".length();
                if (null != null) {
                    return null;
                }
            }
            return String.valueOf(llllllllllllIlllIIlIllIlIIllllII);
        }
    }
    
    public static class Crossing2 extends Piece
    {
        private static final /* synthetic */ int[] llIIlIlIllIIIl;
        
        static {
            lIIIllIlIlIIIIII();
        }
        
        public Crossing2(final int llllllllllllIlllIIIllIIllIIlIIII, final Random llllllllllllIlllIIIllIIllIIlIlII, final StructureBoundingBox llllllllllllIlllIIIllIIllIIIllll, final EnumFacing llllllllllllIlllIIIllIIllIIIlllI) {
            super(llllllllllllIlllIIIllIIllIIlIIII);
            this.coordBaseMode = llllllllllllIlllIIIllIIllIIIlllI;
            this.boundingBox = llllllllllllIlllIIIllIIllIIIllll;
        }
        
        private static boolean lIIIllIlIlIIIIll(final int llllllllllllIlllIIIllIIlIlIlIlll, final int llllllllllllIlllIIIllIIlIlIlIllI) {
            return llllllllllllIlllIIIllIIlIlIlIlll > llllllllllllIlllIIIllIIlIlIlIllI;
        }
        
        @Override
        public boolean addComponentParts(final World llllllllllllIlllIIIllIIlIllIIIll, final Random llllllllllllIlllIIIllIIlIllIIIlI, final StructureBoundingBox llllllllllllIlllIIIllIIlIlIlllII) {
            this.fillWithBlocks(llllllllllllIlllIIIllIIlIllIIIll, llllllllllllIlllIIIllIIlIlIlllII, Crossing2.llIIlIlIllIIIl[1], Crossing2.llIIlIlIllIIIl[1], Crossing2.llIIlIlIllIIIl[1], Crossing2.llIIlIlIllIIIl[5], Crossing2.llIIlIlIllIIIl[0], Crossing2.llIIlIlIllIIIl[5], Blocks.nether_brick.getDefaultState(), Blocks.nether_brick.getDefaultState(), (boolean)(Crossing2.llIIlIlIllIIIl[1] != 0));
            this.fillWithBlocks(llllllllllllIlllIIIllIIlIllIIIll, llllllllllllIlllIIIllIIlIlIlllII, Crossing2.llIIlIlIllIIIl[1], Crossing2.llIIlIlIllIIIl[6], Crossing2.llIIlIlIllIIIl[1], Crossing2.llIIlIlIllIIIl[5], Crossing2.llIIlIlIllIIIl[3], Crossing2.llIIlIlIllIIIl[5], Blocks.air.getDefaultState(), Blocks.air.getDefaultState(), (boolean)(Crossing2.llIIlIlIllIIIl[1] != 0));
            this.fillWithBlocks(llllllllllllIlllIIIllIIlIllIIIll, llllllllllllIlllIIIllIIlIlIlllII, Crossing2.llIIlIlIllIIIl[1], Crossing2.llIIlIlIllIIIl[6], Crossing2.llIIlIlIllIIIl[1], Crossing2.llIIlIlIllIIIl[1], Crossing2.llIIlIlIllIIIl[3], Crossing2.llIIlIlIllIIIl[1], Blocks.nether_brick.getDefaultState(), Blocks.nether_brick.getDefaultState(), (boolean)(Crossing2.llIIlIlIllIIIl[1] != 0));
            this.fillWithBlocks(llllllllllllIlllIIIllIIlIllIIIll, llllllllllllIlllIIIllIIlIlIlllII, Crossing2.llIIlIlIllIIIl[5], Crossing2.llIIlIlIllIIIl[6], Crossing2.llIIlIlIllIIIl[1], Crossing2.llIIlIlIllIIIl[5], Crossing2.llIIlIlIllIIIl[3], Crossing2.llIIlIlIllIIIl[1], Blocks.nether_brick.getDefaultState(), Blocks.nether_brick.getDefaultState(), (boolean)(Crossing2.llIIlIlIllIIIl[1] != 0));
            this.fillWithBlocks(llllllllllllIlllIIIllIIlIllIIIll, llllllllllllIlllIIIllIIlIlIlllII, Crossing2.llIIlIlIllIIIl[1], Crossing2.llIIlIlIllIIIl[6], Crossing2.llIIlIlIllIIIl[5], Crossing2.llIIlIlIllIIIl[1], Crossing2.llIIlIlIllIIIl[3], Crossing2.llIIlIlIllIIIl[5], Blocks.nether_brick.getDefaultState(), Blocks.nether_brick.getDefaultState(), (boolean)(Crossing2.llIIlIlIllIIIl[1] != 0));
            this.fillWithBlocks(llllllllllllIlllIIIllIIlIllIIIll, llllllllllllIlllIIIllIIlIlIlllII, Crossing2.llIIlIlIllIIIl[5], Crossing2.llIIlIlIllIIIl[6], Crossing2.llIIlIlIllIIIl[5], Crossing2.llIIlIlIllIIIl[5], Crossing2.llIIlIlIllIIIl[3], Crossing2.llIIlIlIllIIIl[5], Blocks.nether_brick.getDefaultState(), Blocks.nether_brick.getDefaultState(), (boolean)(Crossing2.llIIlIlIllIIIl[1] != 0));
            this.fillWithBlocks(llllllllllllIlllIIIllIIlIllIIIll, llllllllllllIlllIIIllIIlIlIlllII, Crossing2.llIIlIlIllIIIl[1], Crossing2.llIIlIlIllIIIl[7], Crossing2.llIIlIlIllIIIl[1], Crossing2.llIIlIlIllIIIl[5], Crossing2.llIIlIlIllIIIl[7], Crossing2.llIIlIlIllIIIl[5], Blocks.nether_brick.getDefaultState(), Blocks.nether_brick.getDefaultState(), (boolean)(Crossing2.llIIlIlIllIIIl[1] != 0));
            int llllllllllllIlllIIIllIIlIllIIIII = Crossing2.llIIlIlIllIIIl[1];
            "".length();
            if ("  ".length() < 0) {
                return ((0x29 ^ 0x16) & ~(0x88 ^ 0xB7)) != 0x0;
            }
            while (!lIIIllIlIlIIIIll(llllllllllllIlllIIIllIIlIllIIIII, Crossing2.llIIlIlIllIIIl[5])) {
                int llllllllllllIlllIIIllIIlIlIlllll = Crossing2.llIIlIlIllIIIl[1];
                "".length();
                if ("   ".length() < ((0xE8 ^ 0xB5 ^ ((0x96 ^ 0xA9) & ~(0x80 ^ 0xBF))) & (80 + 53 + 30 + 54 ^ 92 + 125 - 88 + 3 ^ -" ".length()))) {
                    return ((0x83 ^ 0x91 ^ (0xFE ^ 0xA5)) & (0xB2 ^ 0xA8 ^ (0xD3 ^ 0x80) ^ -" ".length())) != 0x0;
                }
                while (!lIIIllIlIlIIIIll(llllllllllllIlllIIIllIIlIlIlllll, Crossing2.llIIlIlIllIIIl[5])) {
                    this.replaceAirAndLiquidDownwards(llllllllllllIlllIIIllIIlIllIIIll, Blocks.nether_brick.getDefaultState(), llllllllllllIlllIIIllIIlIllIIIII, Crossing2.llIIlIlIllIIIl[2], llllllllllllIlllIIIllIIlIlIlllll, llllllllllllIlllIIIllIIlIlIlllII);
                    ++llllllllllllIlllIIIllIIlIlIlllll;
                }
                ++llllllllllllIlllIIIllIIlIllIIIII;
            }
            return Crossing2.llIIlIlIllIIIl[0] != 0;
        }
        
        public Crossing2() {
        }
        
        private static boolean lIIIllIlIlIIIIIl(final int llllllllllllIlllIIIllIIlIlIlIIlI) {
            return llllllllllllIlllIIIllIIlIlIlIIlI != 0;
        }
        
        private static boolean lIIIllIlIlIIIIlI(final Object llllllllllllIlllIIIllIIlIlIlIlII) {
            return llllllllllllIlllIIIllIIlIlIlIlII == null;
        }
        
        @Override
        public void buildComponent(final StructureComponent llllllllllllIlllIIIllIIllIIIIlII, final List<StructureComponent> llllllllllllIlllIIIllIIllIIIIIll, final Random llllllllllllIlllIIIllIIllIIIIIlI) {
            this.getNextComponentNormal((Start)llllllllllllIlllIIIllIIllIIIIlII, llllllllllllIlllIIIllIIllIIIIIll, llllllllllllIlllIIIllIIllIIIIIlI, Crossing2.llIIlIlIllIIIl[0], Crossing2.llIIlIlIllIIIl[1], (boolean)(Crossing2.llIIlIlIllIIIl[0] != 0));
            "".length();
            this.getNextComponentX((Start)llllllllllllIlllIIIllIIllIIIIlII, llllllllllllIlllIIIllIIllIIIIIll, llllllllllllIlllIIIllIIllIIIIIlI, Crossing2.llIIlIlIllIIIl[1], Crossing2.llIIlIlIllIIIl[0], (boolean)(Crossing2.llIIlIlIllIIIl[0] != 0));
            "".length();
            this.getNextComponentZ((Start)llllllllllllIlllIIIllIIllIIIIlII, llllllllllllIlllIIIllIIllIIIIIll, llllllllllllIlllIIIllIIllIIIIIlI, Crossing2.llIIlIlIllIIIl[1], Crossing2.llIIlIlIllIIIl[0], (boolean)(Crossing2.llIIlIlIllIIIl[0] != 0));
            "".length();
        }
        
        private static void lIIIllIlIlIIIIII() {
            (llIIlIlIllIIIl = new int[8])[0] = " ".length();
            Crossing2.llIIlIlIllIIIl[1] = ((0x1A ^ 0x2D) & ~(0x4B ^ 0x7C));
            Crossing2.llIIlIlIllIIIl[2] = -" ".length();
            Crossing2.llIIlIlIllIIIl[3] = (0x21 ^ 0x5F ^ (0x32 ^ 0x49));
            Crossing2.llIIlIlIllIIIl[4] = (0x2B ^ 0x4A ^ (0x67 ^ 0x1));
            Crossing2.llIIlIlIllIIIl[5] = (0x28 ^ 0x2C);
            Crossing2.llIIlIlIllIIIl[6] = "  ".length();
            Crossing2.llIIlIlIllIIIl[7] = (0x41 ^ 0xB ^ (0x7 ^ 0x4B));
        }
        
        public static Crossing2 func_175878_a(final List<StructureComponent> llllllllllllIlllIIIllIIlIlllIIIl, final Random llllllllllllIlllIIIllIIlIlllIIII, final int llllllllllllIlllIIIllIIlIlllIlll, final int llllllllllllIlllIIIllIIlIlllIllI, final int llllllllllllIlllIIIllIIlIllIllIl, final EnumFacing llllllllllllIlllIIIllIIlIlllIlII, final int llllllllllllIlllIIIllIIlIlllIIll) {
            final StructureBoundingBox llllllllllllIlllIIIllIIlIlllIIlI = StructureBoundingBox.getComponentToAddBoundingBox(llllllllllllIlllIIIllIIlIlllIlll, llllllllllllIlllIIIllIIlIlllIllI, llllllllllllIlllIIIllIIlIllIllIl, Crossing2.llIIlIlIllIIIl[2], Crossing2.llIIlIlIllIIIl[1], Crossing2.llIIlIlIllIIIl[1], Crossing2.llIIlIlIllIIIl[3], Crossing2.llIIlIlIllIIIl[4], Crossing2.llIIlIlIllIIIl[3], llllllllllllIlllIIIllIIlIlllIlII);
            Crossing2 crossing2;
            if (lIIIllIlIlIIIIIl(Piece.isAboveGround(llllllllllllIlllIIIllIIlIlllIIlI) ? 1 : 0) && lIIIllIlIlIIIIlI(StructureComponent.findIntersecting(llllllllllllIlllIIIllIIlIlllIIIl, llllllllllllIlllIIIllIIlIlllIIlI))) {
                crossing2 = new Crossing2(llllllllllllIlllIIIllIIlIlllIIll, llllllllllllIlllIIIllIIlIlllIIII, llllllllllllIlllIIIllIIlIlllIIlI, llllllllllllIlllIIIllIIlIlllIlII);
                "".length();
                if ("   ".length() <= -" ".length()) {
                    return null;
                }
            }
            else {
                crossing2 = null;
            }
            return crossing2;
        }
    }
    
    public static class Corridor4 extends Piece
    {
        private static final /* synthetic */ int[] lIIIIIIIllIIll;
        
        private static boolean lIllIIllIlIIllI(final int lllllllllllllIlIlIIIlllIlllIllll) {
            return lllllllllllllIlIlIIIlllIlllIllll != 0;
        }
        
        public static Corridor4 func_175880_a(final List<StructureComponent> lllllllllllllIlIlIIIllllIIIlIllI, final Random lllllllllllllIlIlIIIllllIIIlIlIl, final int lllllllllllllIlIlIIIllllIIIlllII, final int lllllllllllllIlIlIIIllllIIIlIIll, final int lllllllllllllIlIlIIIllllIIIllIlI, final EnumFacing lllllllllllllIlIlIIIllllIIIllIIl, final int lllllllllllllIlIlIIIllllIIIlIIII) {
            final StructureBoundingBox lllllllllllllIlIlIIIllllIIIlIlll = StructureBoundingBox.getComponentToAddBoundingBox(lllllllllllllIlIlIIIllllIIIlllII, lllllllllllllIlIlIIIllllIIIlIIll, lllllllllllllIlIlIIIllllIIIllIlI, Corridor4.lIIIIIIIllIIll[4], Corridor4.lIIIIIIIllIIll[2], Corridor4.lIIIIIIIllIIll[2], Corridor4.lIIIIIIIllIIll[5], Corridor4.lIIIIIIIllIIll[6], Corridor4.lIIIIIIIllIIll[5], lllllllllllllIlIlIIIllllIIIllIIl);
            Corridor4 corridor4;
            if (lIllIIllIlIIllI(Piece.isAboveGround(lllllllllllllIlIlIIIllllIIIlIlll) ? 1 : 0) && lIllIIllIlIIlll(StructureComponent.findIntersecting(lllllllllllllIlIlIIIllllIIIlIllI, lllllllllllllIlIlIIIllllIIIlIlll))) {
                corridor4 = new Corridor4(lllllllllllllIlIlIIIllllIIIlIIII, lllllllllllllIlIlIIIllllIIIlIlIl, lllllllllllllIlIlIIIllllIIIlIlll, lllllllllllllIlIlIIIllllIIIllIIl);
                "".length();
                if (((0x1A ^ 0x4F) & ~(0xC6 ^ 0x93)) != ((0x61 ^ 0x54) & ~(0x81 ^ 0xB4))) {
                    return null;
                }
            }
            else {
                corridor4 = null;
            }
            return corridor4;
        }
        
        private static boolean lIllIIllIlIIlll(final Object lllllllllllllIlIlIIIlllIllllIIIl) {
            return lllllllllllllIlIlIIIlllIllllIIIl == null;
        }
        
        public Corridor4() {
        }
        
        private static boolean lIllIIllIlIlIII(final int lllllllllllllIlIlIIIlllIllllllII, final int lllllllllllllIlIlIIIlllIlllllIll) {
            return lllllllllllllIlIlIIIlllIllllllII > lllllllllllllIlIlIIIlllIlllllIll;
        }
        
        @Override
        public void buildComponent(final StructureComponent lllllllllllllIlIlIIIllllIIlIllll, final List<StructureComponent> lllllllllllllIlIlIIIllllIIlIlllI, final Random lllllllllllllIlIlIIIllllIIlIlIII) {
            int lllllllllllllIlIlIIIllllIIlIllII = Corridor4.lIIIIIIIllIIll[0];
            if (!lIllIIllIlIIIll(this.coordBaseMode, EnumFacing.WEST) || lIllIIllIlIIlII(this.coordBaseMode, EnumFacing.NORTH)) {
                lllllllllllllIlIlIIIllllIIlIllII = Corridor4.lIIIIIIIllIIll[1];
            }
            final Start lllllllllllllIIllIIlIIIlIlIIIIIl = (Start)lllllllllllllIlIlIIIllllIIlIllll;
            final int lllllllllllllIIllIIlIIIlIlIIIlIl = Corridor4.lIIIIIIIllIIll[2];
            final int lllllllllllllIIllIIlIIIlIlIIIlII = lllllllllllllIlIlIIIllllIIlIllII;
            int lllllllllllllIIllIIlIIIlIlIIIIll;
            if (lIllIIllIlIIlIl(lllllllllllllIlIlIIIllllIIlIlIII.nextInt(Corridor4.lIIIIIIIllIIll[3]))) {
                lllllllllllllIIllIIlIIIlIlIIIIll = Corridor4.lIIIIIIIllIIll[0];
                "".length();
                if (-(125 + 193 - 259 + 137 ^ 101 + 123 - 50 + 19) >= 0) {
                    return;
                }
            }
            else {
                lllllllllllllIIllIIlIIIlIlIIIIll = Corridor4.lIIIIIIIllIIll[2];
            }
            this.getNextComponentX(lllllllllllllIIllIIlIIIlIlIIIIIl, lllllllllllllIlIlIIIllllIIlIlllI, lllllllllllllIlIlIIIllllIIlIlIII, lllllllllllllIIllIIlIIIlIlIIIlIl, lllllllllllllIIllIIlIIIlIlIIIlII, (boolean)(lllllllllllllIIllIIlIIIlIlIIIIll != 0));
            "".length();
            final Start lllllllllllllIIllIIlIIIlIIllIIll = (Start)lllllllllllllIlIlIIIllllIIlIllll;
            final int lllllllllllllIIllIIlIIIlIIlIlIIl = Corridor4.lIIIIIIIllIIll[2];
            final int lllllllllllllIIllIIlIIIlIIlIllll = lllllllllllllIlIlIIIllllIIlIllII;
            int lllllllllllllIIllIIlIIIlIIlIlllI;
            if (lIllIIllIlIIlIl(lllllllllllllIlIlIIIllllIIlIlIII.nextInt(Corridor4.lIIIIIIIllIIll[3]))) {
                lllllllllllllIIllIIlIIIlIIlIlllI = Corridor4.lIIIIIIIllIIll[0];
                "".length();
                if ("  ".length() == -" ".length()) {
                    return;
                }
            }
            else {
                lllllllllllllIIllIIlIIIlIIlIlllI = Corridor4.lIIIIIIIllIIll[2];
            }
            this.getNextComponentZ(lllllllllllllIIllIIlIIIlIIllIIll, lllllllllllllIlIlIIIllllIIlIlllI, lllllllllllllIlIlIIIllllIIlIlIII, lllllllllllllIIllIIlIIIlIIlIlIIl, lllllllllllllIIllIIlIIIlIIlIllll, (boolean)(lllllllllllllIIllIIlIIIlIIlIlllI != 0));
            "".length();
        }
        
        private static boolean lIllIIllIlIIIll(final Object lllllllllllllIlIlIIIlllIlllllIII, final Object lllllllllllllIlIlIIIlllIllllIlll) {
            return lllllllllllllIlIlIIIlllIlllllIII != lllllllllllllIlIlIIIlllIllllIlll;
        }
        
        private static void lIllIIllIlIIIlI() {
            (lIIIIIIIllIIll = new int[12])[0] = " ".length();
            Corridor4.lIIIIIIIllIIll[1] = (0x44 ^ 0x41);
            Corridor4.lIIIIIIIllIIll[2] = ((0x30 ^ 0x51) & ~(0xC1 ^ 0xA0));
            Corridor4.lIIIIIIIllIIll[3] = (31 + 145 - 3 + 12 ^ 18 + 11 + 36 + 112);
            Corridor4.lIIIIIIIllIIll[4] = -"   ".length();
            Corridor4.lIIIIIIIllIIll[5] = (0x66 ^ 0x40 ^ (0xA8 ^ 0x87));
            Corridor4.lIIIIIIIllIIll[6] = (33 + 16 - 15 + 102 ^ 122 + 65 - 56 + 12);
            Corridor4.lIIIIIIIllIIll[7] = "  ".length();
            Corridor4.lIIIIIIIllIIll[8] = (0xAD ^ 0xAB);
            Corridor4.lIIIIIIIllIIll[9] = "   ".length();
            Corridor4.lIIIIIIIllIIll[10] = (0xB ^ 0xF);
            Corridor4.lIIIIIIIllIIll[11] = -" ".length();
        }
        
        public Corridor4(final int lllllllllllllIlIlIIIllllIIlllIII, final Random lllllllllllllIlIlIIIllllIIllllII, final StructureBoundingBox lllllllllllllIlIlIIIllllIIllIlll, final EnumFacing lllllllllllllIlIlIIIllllIIlllIlI) {
            super(lllllllllllllIlIlIIIllllIIlllIII);
            this.coordBaseMode = lllllllllllllIlIlIIIllllIIlllIlI;
            this.boundingBox = lllllllllllllIlIlIIIllllIIllIlll;
        }
        
        @Override
        public boolean addComponentParts(final World lllllllllllllIlIlIIIllllIIIIIIlI, final Random lllllllllllllIlIlIIIllllIIIIIlll, final StructureBoundingBox lllllllllllllIlIlIIIllllIIIIIIIl) {
            this.fillWithBlocks(lllllllllllllIlIlIIIllllIIIIIIlI, lllllllllllllIlIlIIIllllIIIIIIIl, Corridor4.lIIIIIIIllIIll[2], Corridor4.lIIIIIIIllIIll[2], Corridor4.lIIIIIIIllIIll[2], Corridor4.lIIIIIIIllIIll[3], Corridor4.lIIIIIIIllIIll[0], Corridor4.lIIIIIIIllIIll[3], Blocks.nether_brick.getDefaultState(), Blocks.nether_brick.getDefaultState(), (boolean)(Corridor4.lIIIIIIIllIIll[2] != 0));
            this.fillWithBlocks(lllllllllllllIlIlIIIllllIIIIIIlI, lllllllllllllIlIlIIIllllIIIIIIIl, Corridor4.lIIIIIIIllIIll[2], Corridor4.lIIIIIIIllIIll[7], Corridor4.lIIIIIIIllIIll[2], Corridor4.lIIIIIIIllIIll[3], Corridor4.lIIIIIIIllIIll[1], Corridor4.lIIIIIIIllIIll[3], Blocks.air.getDefaultState(), Blocks.air.getDefaultState(), (boolean)(Corridor4.lIIIIIIIllIIll[2] != 0));
            this.fillWithBlocks(lllllllllllllIlIlIIIllllIIIIIIlI, lllllllllllllIlIlIIIllllIIIIIIIl, Corridor4.lIIIIIIIllIIll[2], Corridor4.lIIIIIIIllIIll[8], Corridor4.lIIIIIIIllIIll[2], Corridor4.lIIIIIIIllIIll[3], Corridor4.lIIIIIIIllIIll[8], Corridor4.lIIIIIIIllIIll[1], Blocks.nether_brick.getDefaultState(), Blocks.nether_brick.getDefaultState(), (boolean)(Corridor4.lIIIIIIIllIIll[2] != 0));
            this.fillWithBlocks(lllllllllllllIlIlIIIllllIIIIIIlI, lllllllllllllIlIlIIIllllIIIIIIIl, Corridor4.lIIIIIIIllIIll[2], Corridor4.lIIIIIIIllIIll[7], Corridor4.lIIIIIIIllIIll[2], Corridor4.lIIIIIIIllIIll[7], Corridor4.lIIIIIIIllIIll[1], Corridor4.lIIIIIIIllIIll[2], Blocks.nether_brick.getDefaultState(), Blocks.nether_brick.getDefaultState(), (boolean)(Corridor4.lIIIIIIIllIIll[2] != 0));
            this.fillWithBlocks(lllllllllllllIlIlIIIllllIIIIIIlI, lllllllllllllIlIlIIIllllIIIIIIIl, Corridor4.lIIIIIIIllIIll[8], Corridor4.lIIIIIIIllIIll[7], Corridor4.lIIIIIIIllIIll[2], Corridor4.lIIIIIIIllIIll[3], Corridor4.lIIIIIIIllIIll[1], Corridor4.lIIIIIIIllIIll[2], Blocks.nether_brick.getDefaultState(), Blocks.nether_brick.getDefaultState(), (boolean)(Corridor4.lIIIIIIIllIIll[2] != 0));
            this.fillWithBlocks(lllllllllllllIlIlIIIllllIIIIIIlI, lllllllllllllIlIlIIIllllIIIIIIIl, Corridor4.lIIIIIIIllIIll[0], Corridor4.lIIIIIIIllIIll[9], Corridor4.lIIIIIIIllIIll[2], Corridor4.lIIIIIIIllIIll[0], Corridor4.lIIIIIIIllIIll[10], Corridor4.lIIIIIIIllIIll[2], Blocks.nether_brick_fence.getDefaultState(), Blocks.nether_brick_fence.getDefaultState(), (boolean)(Corridor4.lIIIIIIIllIIll[2] != 0));
            this.fillWithBlocks(lllllllllllllIlIlIIIllllIIIIIIlI, lllllllllllllIlIlIIIllllIIIIIIIl, Corridor4.lIIIIIIIllIIll[6], Corridor4.lIIIIIIIllIIll[9], Corridor4.lIIIIIIIllIIll[2], Corridor4.lIIIIIIIllIIll[6], Corridor4.lIIIIIIIllIIll[10], Corridor4.lIIIIIIIllIIll[2], Blocks.nether_brick_fence.getDefaultState(), Blocks.nether_brick_fence.getDefaultState(), (boolean)(Corridor4.lIIIIIIIllIIll[2] != 0));
            this.fillWithBlocks(lllllllllllllIlIlIIIllllIIIIIIlI, lllllllllllllIlIlIIIllllIIIIIIIl, Corridor4.lIIIIIIIllIIll[2], Corridor4.lIIIIIIIllIIll[7], Corridor4.lIIIIIIIllIIll[10], Corridor4.lIIIIIIIllIIll[3], Corridor4.lIIIIIIIllIIll[7], Corridor4.lIIIIIIIllIIll[3], Blocks.nether_brick.getDefaultState(), Blocks.nether_brick.getDefaultState(), (boolean)(Corridor4.lIIIIIIIllIIll[2] != 0));
            this.fillWithBlocks(lllllllllllllIlIlIIIllllIIIIIIlI, lllllllllllllIlIlIIIllllIIIIIIIl, Corridor4.lIIIIIIIllIIll[0], Corridor4.lIIIIIIIllIIll[0], Corridor4.lIIIIIIIllIIll[10], Corridor4.lIIIIIIIllIIll[7], Corridor4.lIIIIIIIllIIll[7], Corridor4.lIIIIIIIllIIll[10], Blocks.air.getDefaultState(), Blocks.air.getDefaultState(), (boolean)(Corridor4.lIIIIIIIllIIll[2] != 0));
            this.fillWithBlocks(lllllllllllllIlIlIIIllllIIIIIIlI, lllllllllllllIlIlIIIllllIIIIIIIl, Corridor4.lIIIIIIIllIIll[8], Corridor4.lIIIIIIIllIIll[0], Corridor4.lIIIIIIIllIIll[10], Corridor4.lIIIIIIIllIIll[6], Corridor4.lIIIIIIIllIIll[7], Corridor4.lIIIIIIIllIIll[10], Blocks.air.getDefaultState(), Blocks.air.getDefaultState(), (boolean)(Corridor4.lIIIIIIIllIIll[2] != 0));
            this.fillWithBlocks(lllllllllllllIlIlIIIllllIIIIIIlI, lllllllllllllIlIlIIIllllIIIIIIIl, Corridor4.lIIIIIIIllIIll[2], Corridor4.lIIIIIIIllIIll[9], Corridor4.lIIIIIIIllIIll[3], Corridor4.lIIIIIIIllIIll[3], Corridor4.lIIIIIIIllIIll[9], Corridor4.lIIIIIIIllIIll[3], Blocks.nether_brick_fence.getDefaultState(), Blocks.nether_brick_fence.getDefaultState(), (boolean)(Corridor4.lIIIIIIIllIIll[2] != 0));
            this.fillWithBlocks(lllllllllllllIlIlIIIllllIIIIIIlI, lllllllllllllIlIlIIIllllIIIIIIIl, Corridor4.lIIIIIIIllIIll[2], Corridor4.lIIIIIIIllIIll[9], Corridor4.lIIIIIIIllIIll[8], Corridor4.lIIIIIIIllIIll[2], Corridor4.lIIIIIIIllIIll[9], Corridor4.lIIIIIIIllIIll[6], Blocks.nether_brick_fence.getDefaultState(), Blocks.nether_brick_fence.getDefaultState(), (boolean)(Corridor4.lIIIIIIIllIIll[2] != 0));
            this.fillWithBlocks(lllllllllllllIlIlIIIllllIIIIIIlI, lllllllllllllIlIlIIIllllIIIIIIIl, Corridor4.lIIIIIIIllIIll[3], Corridor4.lIIIIIIIllIIll[9], Corridor4.lIIIIIIIllIIll[8], Corridor4.lIIIIIIIllIIll[3], Corridor4.lIIIIIIIllIIll[9], Corridor4.lIIIIIIIllIIll[6], Blocks.nether_brick_fence.getDefaultState(), Blocks.nether_brick_fence.getDefaultState(), (boolean)(Corridor4.lIIIIIIIllIIll[2] != 0));
            this.fillWithBlocks(lllllllllllllIlIlIIIllllIIIIIIlI, lllllllllllllIlIlIIIllllIIIIIIIl, Corridor4.lIIIIIIIllIIll[2], Corridor4.lIIIIIIIllIIll[9], Corridor4.lIIIIIIIllIIll[10], Corridor4.lIIIIIIIllIIll[2], Corridor4.lIIIIIIIllIIll[1], Corridor4.lIIIIIIIllIIll[1], Blocks.nether_brick.getDefaultState(), Blocks.nether_brick.getDefaultState(), (boolean)(Corridor4.lIIIIIIIllIIll[2] != 0));
            this.fillWithBlocks(lllllllllllllIlIlIIIllllIIIIIIlI, lllllllllllllIlIlIIIllllIIIIIIIl, Corridor4.lIIIIIIIllIIll[3], Corridor4.lIIIIIIIllIIll[9], Corridor4.lIIIIIIIllIIll[10], Corridor4.lIIIIIIIllIIll[3], Corridor4.lIIIIIIIllIIll[1], Corridor4.lIIIIIIIllIIll[1], Blocks.nether_brick.getDefaultState(), Blocks.nether_brick.getDefaultState(), (boolean)(Corridor4.lIIIIIIIllIIll[2] != 0));
            this.fillWithBlocks(lllllllllllllIlIlIIIllllIIIIIIlI, lllllllllllllIlIlIIIllllIIIIIIIl, Corridor4.lIIIIIIIllIIll[0], Corridor4.lIIIIIIIllIIll[9], Corridor4.lIIIIIIIllIIll[1], Corridor4.lIIIIIIIllIIll[7], Corridor4.lIIIIIIIllIIll[1], Corridor4.lIIIIIIIllIIll[1], Blocks.nether_brick.getDefaultState(), Blocks.nether_brick.getDefaultState(), (boolean)(Corridor4.lIIIIIIIllIIll[2] != 0));
            this.fillWithBlocks(lllllllllllllIlIlIIIllllIIIIIIlI, lllllllllllllIlIlIIIllllIIIIIIIl, Corridor4.lIIIIIIIllIIll[8], Corridor4.lIIIIIIIllIIll[9], Corridor4.lIIIIIIIllIIll[1], Corridor4.lIIIIIIIllIIll[6], Corridor4.lIIIIIIIllIIll[1], Corridor4.lIIIIIIIllIIll[1], Blocks.nether_brick.getDefaultState(), Blocks.nether_brick.getDefaultState(), (boolean)(Corridor4.lIIIIIIIllIIll[2] != 0));
            this.fillWithBlocks(lllllllllllllIlIlIIIllllIIIIIIlI, lllllllllllllIlIlIIIllllIIIIIIIl, Corridor4.lIIIIIIIllIIll[0], Corridor4.lIIIIIIIllIIll[10], Corridor4.lIIIIIIIllIIll[1], Corridor4.lIIIIIIIllIIll[0], Corridor4.lIIIIIIIllIIll[1], Corridor4.lIIIIIIIllIIll[1], Blocks.nether_brick_fence.getDefaultState(), Blocks.nether_brick_fence.getDefaultState(), (boolean)(Corridor4.lIIIIIIIllIIll[2] != 0));
            this.fillWithBlocks(lllllllllllllIlIlIIIllllIIIIIIlI, lllllllllllllIlIlIIIllllIIIIIIIl, Corridor4.lIIIIIIIllIIll[6], Corridor4.lIIIIIIIllIIll[10], Corridor4.lIIIIIIIllIIll[1], Corridor4.lIIIIIIIllIIll[6], Corridor4.lIIIIIIIllIIll[1], Corridor4.lIIIIIIIllIIll[1], Blocks.nether_brick_fence.getDefaultState(), Blocks.nether_brick_fence.getDefaultState(), (boolean)(Corridor4.lIIIIIIIllIIll[2] != 0));
            int lllllllllllllIlIlIIIllllIIIIIlIl = Corridor4.lIIIIIIIllIIll[2];
            "".length();
            if (((3 + 204 - 2 + 26 ^ 106 + 26 - 20 + 58) & (0xD4 ^ 0xAD ^ (0xB0 ^ 0x84) ^ -" ".length())) < -" ".length()) {
                return ((0xDB ^ 0x92 ^ (0x43 ^ 0x5A)) & (0x3C ^ 0x1D ^ (0xDD ^ 0xAC) ^ -" ".length())) != 0x0;
            }
            while (!lIllIIllIlIlIII(lllllllllllllIlIlIIIllllIIIIIlIl, Corridor4.lIIIIIIIllIIll[1])) {
                int lllllllllllllIlIlIIIllllIIIIIlII = Corridor4.lIIIIIIIllIIll[2];
                "".length();
                if ("  ".length() != "  ".length()) {
                    return ((0x6D ^ 0x5D ^ (0x24 ^ 0x1A)) & (12 + 70 - 0 + 58 ^ 63 + 68 - 114 + 113 ^ -" ".length())) != 0x0;
                }
                while (!lIllIIllIlIlIII(lllllllllllllIlIlIIIllllIIIIIlII, Corridor4.lIIIIIIIllIIll[3])) {
                    this.replaceAirAndLiquidDownwards(lllllllllllllIlIlIIIllllIIIIIIlI, Blocks.nether_brick.getDefaultState(), lllllllllllllIlIlIIIllllIIIIIlII, Corridor4.lIIIIIIIllIIll[11], lllllllllllllIlIlIIIllllIIIIIlIl, lllllllllllllIlIlIIIllllIIIIIIIl);
                    ++lllllllllllllIlIlIIIllllIIIIIlII;
                }
                ++lllllllllllllIlIlIIIllllIIIIIlIl;
            }
            return Corridor4.lIIIIIIIllIIll[0] != 0;
        }
        
        private static boolean lIllIIllIlIIlIl(final int lllllllllllllIlIlIIIlllIlllIllIl) {
            return lllllllllllllIlIlIIIlllIlllIllIl > 0;
        }
        
        static {
            lIllIIllIlIIIlI();
        }
        
        private static boolean lIllIIllIlIIlII(final Object lllllllllllllIlIlIIIlllIllllIlII, final Object lllllllllllllIlIlIIIlllIllllIIll) {
            return lllllllllllllIlIlIIIlllIllllIlII == lllllllllllllIlIlIIIlllIllllIIll;
        }
    }
    
    public static class Crossing extends Piece
    {
        private static final /* synthetic */ int[] llIIIIIlIIIIlI;
        
        private static boolean lIIIIlllIIlIIIll(final int llllllllllllIlllIllllIlIIlIlIIll) {
            return llllllllllllIlllIllllIlIIlIlIIll != 0;
        }
        
        private static boolean lIIIIlllIIlIIlll(final int llllllllllllIlllIllllIlIIllIIIII, final int llllllllllllIlllIllllIlIIlIllllI) {
            return llllllllllllIlllIllllIlIIllIIIII > llllllllllllIlllIllllIlIIlIllllI;
        }
        
        public static Crossing func_175873_a(final List<StructureComponent> llllllllllllIlllIllllIlIlIIlIlll, final Random llllllllllllIlllIllllIlIlIIlIllI, final int llllllllllllIlllIllllIlIlIIlIlIl, final int llllllllllllIlllIllllIlIlIIlIlII, final int llllllllllllIlllIllllIlIlIIlIIlI, final EnumFacing llllllllllllIlllIllllIlIlIIllIll, final int llllllllllllIlllIllllIlIlIIIllll) {
            final StructureBoundingBox llllllllllllIlllIllllIlIlIIllIII = StructureBoundingBox.getComponentToAddBoundingBox(llllllllllllIlllIllllIlIlIIlIlIl, llllllllllllIlllIllllIlIlIIlIlII, llllllllllllIlllIllllIlIlIIlIIlI, Crossing.llIIIIIlIIIIlI[2], Crossing.llIIIIIlIIIIlI[1], Crossing.llIIIIIlIIIIlI[1], Crossing.llIIIIIlIIIIlI[3], Crossing.llIIIIIlIIIIlI[4], Crossing.llIIIIIlIIIIlI[3], llllllllllllIlllIllllIlIlIIllIll);
            Crossing crossing;
            if (lIIIIlllIIlIIIll(Piece.isAboveGround(llllllllllllIlllIllllIlIlIIllIII) ? 1 : 0) && lIIIIlllIIlIIlII(StructureComponent.findIntersecting(llllllllllllIlllIllllIlIlIIlIlll, llllllllllllIlllIllllIlIlIIllIII))) {
                crossing = new Crossing(llllllllllllIlllIllllIlIlIIIllll, llllllllllllIlllIllllIlIlIIlIllI, llllllllllllIlllIllllIlIlIIllIII, llllllllllllIlllIllllIlIlIIllIll);
                "".length();
                if (-" ".length() >= (0xDD ^ 0xAD ^ (0x27 ^ 0x53))) {
                    return null;
                }
            }
            else {
                crossing = null;
            }
            return crossing;
        }
        
        @Override
        public boolean addComponentParts(final World llllllllllllIlllIllllIlIIllllIlI, final Random llllllllllllIlllIllllIlIIllllIIl, final StructureBoundingBox llllllllllllIlllIllllIlIIllIlllI) {
            this.fillWithBlocks(llllllllllllIlllIllllIlIIllllIlI, llllllllllllIlllIllllIlIIllIlllI, Crossing.llIIIIIlIIIIlI[1], Crossing.llIIIIIlIIIIlI[1], Crossing.llIIIIIlIIIIlI[1], Crossing.llIIIIIlIIIIlI[5], Crossing.llIIIIIlIIIIlI[6], Crossing.llIIIIIlIIIIlI[5], Blocks.nether_brick.getDefaultState(), Blocks.nether_brick.getDefaultState(), (boolean)(Crossing.llIIIIIlIIIIlI[1] != 0));
            this.fillWithBlocks(llllllllllllIlllIllllIlIIllllIlI, llllllllllllIlllIllllIlIIllIlllI, Crossing.llIIIIIlIIIIlI[1], Crossing.llIIIIIlIIIIlI[0], Crossing.llIIIIIlIIIIlI[1], Crossing.llIIIIIlIIIIlI[5], Crossing.llIIIIIlIIIIlI[3], Crossing.llIIIIIlIIIIlI[5], Blocks.air.getDefaultState(), Blocks.air.getDefaultState(), (boolean)(Crossing.llIIIIIlIIIIlI[1] != 0));
            this.fillWithBlocks(llllllllllllIlllIllllIlIIllllIlI, llllllllllllIlllIllllIlIIllIlllI, Crossing.llIIIIIlIIIIlI[1], Crossing.llIIIIIlIIIIlI[0], Crossing.llIIIIIlIIIIlI[1], Crossing.llIIIIIlIIIIlI[6], Crossing.llIIIIIlIIIIlI[5], Crossing.llIIIIIlIIIIlI[1], Blocks.nether_brick.getDefaultState(), Blocks.nether_brick.getDefaultState(), (boolean)(Crossing.llIIIIIlIIIIlI[1] != 0));
            this.fillWithBlocks(llllllllllllIlllIllllIlIIllllIlI, llllllllllllIlllIllllIlIIllIlllI, Crossing.llIIIIIlIIIIlI[1], Crossing.llIIIIIlIIIIlI[0], Crossing.llIIIIIlIIIIlI[5], Crossing.llIIIIIlIIIIlI[6], Crossing.llIIIIIlIIIIlI[5], Crossing.llIIIIIlIIIIlI[5], Blocks.nether_brick.getDefaultState(), Blocks.nether_brick.getDefaultState(), (boolean)(Crossing.llIIIIIlIIIIlI[1] != 0));
            this.fillWithBlocks(llllllllllllIlllIllllIlIIllllIlI, llllllllllllIlllIllllIlIIllIlllI, Crossing.llIIIIIlIIIIlI[7], Crossing.llIIIIIlIIIIlI[0], Crossing.llIIIIIlIIIIlI[1], Crossing.llIIIIIlIIIIlI[5], Crossing.llIIIIIlIIIIlI[5], Crossing.llIIIIIlIIIIlI[1], Blocks.nether_brick.getDefaultState(), Blocks.nether_brick.getDefaultState(), (boolean)(Crossing.llIIIIIlIIIIlI[1] != 0));
            this.fillWithBlocks(llllllllllllIlllIllllIlIIllllIlI, llllllllllllIlllIllllIlIIllIlllI, Crossing.llIIIIIlIIIIlI[7], Crossing.llIIIIIlIIIIlI[0], Crossing.llIIIIIlIIIIlI[5], Crossing.llIIIIIlIIIIlI[5], Crossing.llIIIIIlIIIIlI[5], Crossing.llIIIIIlIIIIlI[5], Blocks.nether_brick.getDefaultState(), Blocks.nether_brick.getDefaultState(), (boolean)(Crossing.llIIIIIlIIIIlI[1] != 0));
            this.fillWithBlocks(llllllllllllIlllIllllIlIIllllIlI, llllllllllllIlllIllllIlIIllIlllI, Crossing.llIIIIIlIIIIlI[1], Crossing.llIIIIIlIIIIlI[0], Crossing.llIIIIIlIIIIlI[1], Crossing.llIIIIIlIIIIlI[1], Crossing.llIIIIIlIIIIlI[5], Crossing.llIIIIIlIIIIlI[6], Blocks.nether_brick.getDefaultState(), Blocks.nether_brick.getDefaultState(), (boolean)(Crossing.llIIIIIlIIIIlI[1] != 0));
            this.fillWithBlocks(llllllllllllIlllIllllIlIIllllIlI, llllllllllllIlllIllllIlIIllIlllI, Crossing.llIIIIIlIIIIlI[1], Crossing.llIIIIIlIIIIlI[0], Crossing.llIIIIIlIIIIlI[7], Crossing.llIIIIIlIIIIlI[1], Crossing.llIIIIIlIIIIlI[5], Crossing.llIIIIIlIIIIlI[5], Blocks.nether_brick.getDefaultState(), Blocks.nether_brick.getDefaultState(), (boolean)(Crossing.llIIIIIlIIIIlI[1] != 0));
            this.fillWithBlocks(llllllllllllIlllIllllIlIIllllIlI, llllllllllllIlllIllllIlIIllIlllI, Crossing.llIIIIIlIIIIlI[5], Crossing.llIIIIIlIIIIlI[0], Crossing.llIIIIIlIIIIlI[1], Crossing.llIIIIIlIIIIlI[5], Crossing.llIIIIIlIIIIlI[5], Crossing.llIIIIIlIIIIlI[6], Blocks.nether_brick.getDefaultState(), Blocks.nether_brick.getDefaultState(), (boolean)(Crossing.llIIIIIlIIIIlI[1] != 0));
            this.fillWithBlocks(llllllllllllIlllIllllIlIIllllIlI, llllllllllllIlllIllllIlIIllIlllI, Crossing.llIIIIIlIIIIlI[5], Crossing.llIIIIIlIIIIlI[0], Crossing.llIIIIIlIIIIlI[7], Crossing.llIIIIIlIIIIlI[5], Crossing.llIIIIIlIIIIlI[5], Crossing.llIIIIIlIIIIlI[5], Blocks.nether_brick.getDefaultState(), Blocks.nether_brick.getDefaultState(), (boolean)(Crossing.llIIIIIlIIIIlI[1] != 0));
            this.fillWithBlocks(llllllllllllIlllIllllIlIIllllIlI, llllllllllllIlllIllllIlIIllIlllI, Crossing.llIIIIIlIIIIlI[0], Crossing.llIIIIIlIIIIlI[5], Crossing.llIIIIIlIIIIlI[1], Crossing.llIIIIIlIIIIlI[8], Crossing.llIIIIIlIIIIlI[5], Crossing.llIIIIIlIIIIlI[1], Blocks.nether_brick.getDefaultState(), Blocks.nether_brick.getDefaultState(), (boolean)(Crossing.llIIIIIlIIIIlI[1] != 0));
            this.fillWithBlocks(llllllllllllIlllIllllIlIIllllIlI, llllllllllllIlllIllllIlIIllIlllI, Crossing.llIIIIIlIIIIlI[0], Crossing.llIIIIIlIIIIlI[7], Crossing.llIIIIIlIIIIlI[1], Crossing.llIIIIIlIIIIlI[8], Crossing.llIIIIIlIIIIlI[7], Crossing.llIIIIIlIIIIlI[1], Blocks.nether_brick_fence.getDefaultState(), Blocks.nether_brick_fence.getDefaultState(), (boolean)(Crossing.llIIIIIlIIIIlI[1] != 0));
            this.fillWithBlocks(llllllllllllIlllIllllIlIIllllIlI, llllllllllllIlllIllllIlIIllIlllI, Crossing.llIIIIIlIIIIlI[0], Crossing.llIIIIIlIIIIlI[5], Crossing.llIIIIIlIIIIlI[5], Crossing.llIIIIIlIIIIlI[8], Crossing.llIIIIIlIIIIlI[5], Crossing.llIIIIIlIIIIlI[5], Blocks.nether_brick.getDefaultState(), Blocks.nether_brick.getDefaultState(), (boolean)(Crossing.llIIIIIlIIIIlI[1] != 0));
            this.fillWithBlocks(llllllllllllIlllIllllIlIIllllIlI, llllllllllllIlllIllllIlIIllIlllI, Crossing.llIIIIIlIIIIlI[0], Crossing.llIIIIIlIIIIlI[7], Crossing.llIIIIIlIIIIlI[5], Crossing.llIIIIIlIIIIlI[8], Crossing.llIIIIIlIIIIlI[7], Crossing.llIIIIIlIIIIlI[5], Blocks.nether_brick_fence.getDefaultState(), Blocks.nether_brick_fence.getDefaultState(), (boolean)(Crossing.llIIIIIlIIIIlI[1] != 0));
            this.fillWithBlocks(llllllllllllIlllIllllIlIIllllIlI, llllllllllllIlllIllllIlIIllIlllI, Crossing.llIIIIIlIIIIlI[1], Crossing.llIIIIIlIIIIlI[5], Crossing.llIIIIIlIIIIlI[0], Crossing.llIIIIIlIIIIlI[1], Crossing.llIIIIIlIIIIlI[5], Crossing.llIIIIIlIIIIlI[8], Blocks.nether_brick.getDefaultState(), Blocks.nether_brick.getDefaultState(), (boolean)(Crossing.llIIIIIlIIIIlI[1] != 0));
            this.fillWithBlocks(llllllllllllIlllIllllIlIIllllIlI, llllllllllllIlllIllllIlIIllIlllI, Crossing.llIIIIIlIIIIlI[1], Crossing.llIIIIIlIIIIlI[7], Crossing.llIIIIIlIIIIlI[0], Crossing.llIIIIIlIIIIlI[1], Crossing.llIIIIIlIIIIlI[7], Crossing.llIIIIIlIIIIlI[8], Blocks.nether_brick_fence.getDefaultState(), Blocks.nether_brick_fence.getDefaultState(), (boolean)(Crossing.llIIIIIlIIIIlI[1] != 0));
            this.fillWithBlocks(llllllllllllIlllIllllIlIIllllIlI, llllllllllllIlllIllllIlIIllIlllI, Crossing.llIIIIIlIIIIlI[5], Crossing.llIIIIIlIIIIlI[5], Crossing.llIIIIIlIIIIlI[0], Crossing.llIIIIIlIIIIlI[5], Crossing.llIIIIIlIIIIlI[5], Crossing.llIIIIIlIIIIlI[8], Blocks.nether_brick.getDefaultState(), Blocks.nether_brick.getDefaultState(), (boolean)(Crossing.llIIIIIlIIIIlI[1] != 0));
            this.fillWithBlocks(llllllllllllIlllIllllIlIIllllIlI, llllllllllllIlllIllllIlIIllIlllI, Crossing.llIIIIIlIIIIlI[5], Crossing.llIIIIIlIIIIlI[7], Crossing.llIIIIIlIIIIlI[0], Crossing.llIIIIIlIIIIlI[5], Crossing.llIIIIIlIIIIlI[7], Crossing.llIIIIIlIIIIlI[8], Blocks.nether_brick_fence.getDefaultState(), Blocks.nether_brick_fence.getDefaultState(), (boolean)(Crossing.llIIIIIlIIIIlI[1] != 0));
            int llllllllllllIlllIllllIlIIlllIlIl = Crossing.llIIIIIlIIIIlI[1];
            "".length();
            if (-(0xD ^ 0x9) > 0) {
                return ((0xA1 ^ 0xAA) & ~(0xA6 ^ 0xAD)) != 0x0;
            }
            while (!lIIIIlllIIlIIlll(llllllllllllIlllIllllIlIIlllIlIl, Crossing.llIIIIIlIIIIlI[5])) {
                int llllllllllllIlllIllllIlIIlllIlII = Crossing.llIIIIIlIIIIlI[1];
                "".length();
                if ((0x65 ^ 0x61) <= 0) {
                    return ((0x2 ^ 0x4C) & ~(0x65 ^ 0x2B)) != 0x0;
                }
                while (!lIIIIlllIIlIIlll(llllllllllllIlllIllllIlIIlllIlII, Crossing.llIIIIIlIIIIlI[5])) {
                    this.replaceAirAndLiquidDownwards(llllllllllllIlllIllllIlIIllllIlI, Blocks.nether_brick.getDefaultState(), llllllllllllIlllIllllIlIIlllIlIl, Crossing.llIIIIIlIIIIlI[9], llllllllllllIlllIllllIlIIlllIlII, llllllllllllIlllIllllIlIIllIlllI);
                    ++llllllllllllIlllIllllIlIIlllIlII;
                }
                ++llllllllllllIlllIllllIlIIlllIlIl;
            }
            return Crossing.llIIIIIlIIIIlI[6] != 0;
        }
        
        public Crossing() {
        }
        
        private static boolean lIIIIlllIIlIIlII(final Object llllllllllllIlllIllllIlIIlIllIII) {
            return llllllllllllIlllIllllIlIIlIllIII == null;
        }
        
        private static void lIIIIlllIIlIIIlI() {
            (llIIIIIlIIIIlI = new int[10])[0] = "  ".length();
            Crossing.llIIIIIlIIIIlI[1] = ((0x63 ^ 0x7A) & ~(0x59 ^ 0x40));
            Crossing.llIIIIIlIIIIlI[2] = -"  ".length();
            Crossing.llIIIIIlIIIIlI[3] = (69 + 2 + 39 + 36 ^ 143 + 56 - 142 + 92);
            Crossing.llIIIIIlIIIIlI[4] = (0xC ^ 0x5);
            Crossing.llIIIIIlIIIIlI[5] = (0x48 ^ 0x4E);
            Crossing.llIIIIIlIIIIlI[6] = " ".length();
            Crossing.llIIIIIlIIIIlI[7] = (111 + 31 - 19 + 7 ^ 2 + 108 - 59 + 84);
            Crossing.llIIIIIlIIIIlI[8] = (111 + 21 - 66 + 80 ^ 85 + 68 - 55 + 52);
            Crossing.llIIIIIlIIIIlI[9] = -" ".length();
        }
        
        public Crossing(final int llllllllllllIlllIllllIlIlIlllIIl, final Random llllllllllllIlllIllllIlIlIllllIl, final StructureBoundingBox llllllllllllIlllIllllIlIlIlllIII, final EnumFacing llllllllllllIlllIllllIlIlIlllIll) {
            super(llllllllllllIlllIllllIlIlIlllIIl);
            this.coordBaseMode = llllllllllllIlllIllllIlIlIlllIll;
            this.boundingBox = llllllllllllIlllIllllIlIlIlllIII;
        }
        
        static {
            lIIIIlllIIlIIIlI();
        }
        
        @Override
        public void buildComponent(final StructureComponent llllllllllllIlllIllllIlIlIllIIIl, final List<StructureComponent> llllllllllllIlllIllllIlIlIlIllII, final Random llllllllllllIlllIllllIlIlIlIlIll) {
            this.getNextComponentNormal((Start)llllllllllllIlllIllllIlIlIllIIIl, llllllllllllIlllIllllIlIlIlIllII, llllllllllllIlllIllllIlIlIlIlIll, Crossing.llIIIIIlIIIIlI[0], Crossing.llIIIIIlIIIIlI[1], (boolean)(Crossing.llIIIIIlIIIIlI[1] != 0));
            "".length();
            this.getNextComponentX((Start)llllllllllllIlllIllllIlIlIllIIIl, llllllllllllIlllIllllIlIlIlIllII, llllllllllllIlllIllllIlIlIlIlIll, Crossing.llIIIIIlIIIIlI[1], Crossing.llIIIIIlIIIIlI[0], (boolean)(Crossing.llIIIIIlIIIIlI[1] != 0));
            "".length();
            this.getNextComponentZ((Start)llllllllllllIlllIllllIlIlIllIIIl, llllllllllllIlllIllllIlIlIlIllII, llllllllllllIlllIllllIlIlIlIlIll, Crossing.llIIIIIlIIIIlI[1], Crossing.llIIIIIlIIIIlI[0], (boolean)(Crossing.llIIIIIlIIIIlI[1] != 0));
            "".length();
        }
    }
    
    public static class Throne extends Piece
    {
        private static final /* synthetic */ String[] llIllllIIIlllI;
        private /* synthetic */ boolean hasSpawner;
        private static final /* synthetic */ int[] llIllllIIIllll;
        
        private static String lIIllIlIIlIlIIll(final String llllllllllllIllIIIllllllIlIIIlIl, final String llllllllllllIllIIIllllllIlIIIIlI) {
            try {
                final SecretKeySpec llllllllllllIllIIIllllllIlIIlIII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIllIIIllllllIlIIIIlI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
                final Cipher llllllllllllIllIIIllllllIlIIIlll = Cipher.getInstance("Blowfish");
                llllllllllllIllIIIllllllIlIIIlll.init(Throne.llIllllIIIllll[6], llllllllllllIllIIIllllllIlIIlIII);
                return new String(llllllllllllIllIIIllllllIlIIIlll.doFinal(Base64.getDecoder().decode(llllllllllllIllIIIllllllIlIIIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
            }
            catch (Exception llllllllllllIllIIIllllllIlIIIllI) {
                llllllllllllIllIIIllllllIlIIIllI.printStackTrace();
                return null;
            }
        }
        
        private static void lIIllIlIIlIllIII() {
            (llIllllIIIlllI = new String[Throne.llIllllIIIllll[9]])[Throne.llIllllIIIllll[0]] = lIIllIlIIlIlIIll("7PsMf460pN8=", "TIHpk");
            Throne.llIllllIIIlllI[Throne.llIllllIIIllll[1]] = lIIllIlIIlIlIIll("YP1fzHzrcGY=", "TivIM");
            Throne.llIllllIIIlllI[Throne.llIllllIIIllll[6]] = lIIllIlIIlIlIlll("DQgELQ0=", "OdeWh");
        }
        
        private static boolean lIIllIlIIlIllIll(final Object llllllllllllIllIIIllllllIIllIllI) {
            return llllllllllllIllIIIllllllIIllIllI == null;
        }
        
        private static String lIIllIlIIlIlIlll(String llllllllllllIllIIIllllllIlIlIlIl, final String llllllllllllIllIIIllllllIlIllIIl) {
            llllllllllllIllIIIllllllIlIlIlIl = (Exception)new String(Base64.getDecoder().decode(((String)llllllllllllIllIIIllllllIlIlIlIl).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
            final StringBuilder llllllllllllIllIIIllllllIlIllIII = new StringBuilder();
            final char[] llllllllllllIllIIIllllllIlIlIlll = llllllllllllIllIIIllllllIlIllIIl.toCharArray();
            int llllllllllllIllIIIllllllIlIlIllI = Throne.llIllllIIIllll[0];
            final String llllllllllllIllIIIllllllIlIlIIII = (Object)((String)llllllllllllIllIIIllllllIlIlIlIl).toCharArray();
            final int llllllllllllIllIIIllllllIlIIllll = llllllllllllIllIIIllllllIlIlIIII.length;
            double llllllllllllIllIIIllllllIlIIlllI = Throne.llIllllIIIllll[0];
            while (lIIllIlIIlIllllI((int)llllllllllllIllIIIllllllIlIIlllI, llllllllllllIllIIIllllllIlIIllll)) {
                final char llllllllllllIllIIIllllllIlIllIll = llllllllllllIllIIIllllllIlIlIIII[llllllllllllIllIIIllllllIlIIlllI];
                llllllllllllIllIIIllllllIlIllIII.append((char)(llllllllllllIllIIIllllllIlIllIll ^ llllllllllllIllIIIllllllIlIlIlll[llllllllllllIllIIIllllllIlIlIllI % llllllllllllIllIIIllllllIlIlIlll.length]));
                "".length();
                ++llllllllllllIllIIIllllllIlIlIllI;
                ++llllllllllllIllIIIllllllIlIIlllI;
                "".length();
                if (((0xF0 ^ 0xA2) & ~(0xD3 ^ 0x81)) >= "  ".length()) {
                    return null;
                }
            }
            return String.valueOf(llllllllllllIllIIIllllllIlIllIII);
        }
        
        @Override
        protected void writeStructureToNBT(final NBTTagCompound llllllllllllIllIIIlllllllIIIllll) {
            super.writeStructureToNBT(llllllllllllIllIIIlllllllIIIllll);
            llllllllllllIllIIIlllllllIIIllll.setBoolean(Throne.llIllllIIIlllI[Throne.llIllllIIIllll[1]], this.hasSpawner);
        }
        
        public Throne() {
        }
        
        static {
            lIIllIlIIlIllIIl();
            lIIllIlIIlIllIII();
        }
        
        private static boolean lIIllIlIIlIlllII(final int llllllllllllIllIIIllllllIIllIIlI) {
            return llllllllllllIllIIIllllllIIllIIlI == 0;
        }
        
        private static void lIIllIlIIlIllIIl() {
            (llIllllIIIllll = new int[12])[0] = ((0xA7 ^ 0x88) & ~(0x90 ^ 0xBF));
            Throne.llIllllIIIllll[1] = " ".length();
            Throne.llIllllIIIllll[2] = -"  ".length();
            Throne.llIllllIIIllll[3] = (0x4F ^ 0x48);
            Throne.llIllllIIIllll[4] = (0x17 ^ 0x21 ^ (0xFD ^ 0xC3));
            Throne.llIllllIIIllll[5] = (0x3 ^ 0xA);
            Throne.llIllllIIIllll[6] = "  ".length();
            Throne.llIllllIIIllll[7] = (0xAA ^ 0x89 ^ (0x74 ^ 0x51));
            Throne.llIllllIIIllll[8] = (0x6 ^ 0x3);
            Throne.llIllllIIIllll[9] = "   ".length();
            Throne.llIllllIIIllll[10] = (57 + 26 + 38 + 25 ^ 19 + 2 + 94 + 35);
            Throne.llIllllIIIllll[11] = -" ".length();
        }
        
        private static boolean lIIllIlIIlIllIlI(final int llllllllllllIllIIIllllllIIllIlII) {
            return llllllllllllIllIIIllllllIIllIlII != 0;
        }
        
        private static boolean lIIllIlIIlIlllIl(final int llllllllllllIllIIIllllllIIlllIIl, final int llllllllllllIllIIIllllllIIlllIII) {
            return llllllllllllIllIIIllllllIIlllIIl > llllllllllllIllIIIllllllIIlllIII;
        }
        
        @Override
        public boolean addComponentParts(final World llllllllllllIllIIIllllllIlllIIII, final Random llllllllllllIllIIIllllllIllIllll, final StructureBoundingBox llllllllllllIllIIIllllllIllIIlll) {
            this.fillWithBlocks(llllllllllllIllIIIllllllIlllIIII, llllllllllllIllIIIllllllIllIIlll, Throne.llIllllIIIllll[0], Throne.llIllllIIIllll[6], Throne.llIllllIIIllll[0], Throne.llIllllIIIllll[7], Throne.llIllllIIIllll[3], Throne.llIllllIIIllll[3], Blocks.air.getDefaultState(), Blocks.air.getDefaultState(), (boolean)(Throne.llIllllIIIllll[0] != 0));
            this.fillWithBlocks(llllllllllllIllIIIllllllIlllIIII, llllllllllllIllIIIllllllIllIIlll, Throne.llIllllIIIllll[1], Throne.llIllllIIIllll[0], Throne.llIllllIIIllll[0], Throne.llIllllIIIllll[8], Throne.llIllllIIIllll[1], Throne.llIllllIIIllll[3], Blocks.nether_brick.getDefaultState(), Blocks.nether_brick.getDefaultState(), (boolean)(Throne.llIllllIIIllll[0] != 0));
            this.fillWithBlocks(llllllllllllIllIIIllllllIlllIIII, llllllllllllIllIIIllllllIllIIlll, Throne.llIllllIIIllll[1], Throne.llIllllIIIllll[6], Throne.llIllllIIIllll[1], Throne.llIllllIIIllll[8], Throne.llIllllIIIllll[6], Throne.llIllllIIIllll[3], Blocks.nether_brick.getDefaultState(), Blocks.nether_brick.getDefaultState(), (boolean)(Throne.llIllllIIIllll[0] != 0));
            this.fillWithBlocks(llllllllllllIllIIIllllllIlllIIII, llllllllllllIllIIIllllllIllIIlll, Throne.llIllllIIIllll[1], Throne.llIllllIIIllll[9], Throne.llIllllIIIllll[6], Throne.llIllllIIIllll[8], Throne.llIllllIIIllll[9], Throne.llIllllIIIllll[3], Blocks.nether_brick.getDefaultState(), Blocks.nether_brick.getDefaultState(), (boolean)(Throne.llIllllIIIllll[0] != 0));
            this.fillWithBlocks(llllllllllllIllIIIllllllIlllIIII, llllllllllllIllIIIllllllIllIIlll, Throne.llIllllIIIllll[1], Throne.llIllllIIIllll[10], Throne.llIllllIIIllll[9], Throne.llIllllIIIllll[8], Throne.llIllllIIIllll[10], Throne.llIllllIIIllll[3], Blocks.nether_brick.getDefaultState(), Blocks.nether_brick.getDefaultState(), (boolean)(Throne.llIllllIIIllll[0] != 0));
            this.fillWithBlocks(llllllllllllIllIIIllllllIlllIIII, llllllllllllIllIIIllllllIllIIlll, Throne.llIllllIIIllll[1], Throne.llIllllIIIllll[6], Throne.llIllllIIIllll[0], Throne.llIllllIIIllll[1], Throne.llIllllIIIllll[10], Throne.llIllllIIIllll[6], Blocks.nether_brick.getDefaultState(), Blocks.nether_brick.getDefaultState(), (boolean)(Throne.llIllllIIIllll[0] != 0));
            this.fillWithBlocks(llllllllllllIllIIIllllllIlllIIII, llllllllllllIllIIIllllllIllIIlll, Throne.llIllllIIIllll[8], Throne.llIllllIIIllll[6], Throne.llIllllIIIllll[0], Throne.llIllllIIIllll[8], Throne.llIllllIIIllll[10], Throne.llIllllIIIllll[6], Blocks.nether_brick.getDefaultState(), Blocks.nether_brick.getDefaultState(), (boolean)(Throne.llIllllIIIllll[0] != 0));
            this.fillWithBlocks(llllllllllllIllIIIllllllIlllIIII, llllllllllllIllIIIllllllIllIIlll, Throne.llIllllIIIllll[1], Throne.llIllllIIIllll[8], Throne.llIllllIIIllll[6], Throne.llIllllIIIllll[1], Throne.llIllllIIIllll[8], Throne.llIllllIIIllll[9], Blocks.nether_brick.getDefaultState(), Blocks.nether_brick.getDefaultState(), (boolean)(Throne.llIllllIIIllll[0] != 0));
            this.fillWithBlocks(llllllllllllIllIIIllllllIlllIIII, llllllllllllIllIIIllllllIllIIlll, Throne.llIllllIIIllll[8], Throne.llIllllIIIllll[8], Throne.llIllllIIIllll[6], Throne.llIllllIIIllll[8], Throne.llIllllIIIllll[8], Throne.llIllllIIIllll[9], Blocks.nether_brick.getDefaultState(), Blocks.nether_brick.getDefaultState(), (boolean)(Throne.llIllllIIIllll[0] != 0));
            this.fillWithBlocks(llllllllllllIllIIIllllllIlllIIII, llllllllllllIllIIIllllllIllIIlll, Throne.llIllllIIIllll[0], Throne.llIllllIIIllll[8], Throne.llIllllIIIllll[9], Throne.llIllllIIIllll[0], Throne.llIllllIIIllll[8], Throne.llIllllIIIllll[4], Blocks.nether_brick.getDefaultState(), Blocks.nether_brick.getDefaultState(), (boolean)(Throne.llIllllIIIllll[0] != 0));
            this.fillWithBlocks(llllllllllllIllIIIllllllIlllIIII, llllllllllllIllIIIllllllIllIIlll, Throne.llIllllIIIllll[7], Throne.llIllllIIIllll[8], Throne.llIllllIIIllll[9], Throne.llIllllIIIllll[7], Throne.llIllllIIIllll[8], Throne.llIllllIIIllll[4], Blocks.nether_brick.getDefaultState(), Blocks.nether_brick.getDefaultState(), (boolean)(Throne.llIllllIIIllll[0] != 0));
            this.fillWithBlocks(llllllllllllIllIIIllllllIlllIIII, llllllllllllIllIIIllllllIllIIlll, Throne.llIllllIIIllll[1], Throne.llIllllIIIllll[8], Throne.llIllllIIIllll[4], Throne.llIllllIIIllll[8], Throne.llIllllIIIllll[8], Throne.llIllllIIIllll[4], Blocks.nether_brick.getDefaultState(), Blocks.nether_brick.getDefaultState(), (boolean)(Throne.llIllllIIIllll[0] != 0));
            this.setBlockState(llllllllllllIllIIIllllllIlllIIII, Blocks.nether_brick_fence.getDefaultState(), Throne.llIllllIIIllll[1], Throne.llIllllIIIllll[7], Throne.llIllllIIIllll[9], llllllllllllIllIIIllllllIllIIlll);
            this.setBlockState(llllllllllllIllIIIllllllIlllIIII, Blocks.nether_brick_fence.getDefaultState(), Throne.llIllllIIIllll[8], Throne.llIllllIIIllll[7], Throne.llIllllIIIllll[9], llllllllllllIllIIIllllllIllIIlll);
            this.fillWithBlocks(llllllllllllIllIIIllllllIlllIIII, llllllllllllIllIIIllllllIllIIlll, Throne.llIllllIIIllll[0], Throne.llIllllIIIllll[7], Throne.llIllllIIIllll[9], Throne.llIllllIIIllll[0], Throne.llIllllIIIllll[7], Throne.llIllllIIIllll[4], Blocks.nether_brick_fence.getDefaultState(), Blocks.nether_brick_fence.getDefaultState(), (boolean)(Throne.llIllllIIIllll[0] != 0));
            this.fillWithBlocks(llllllllllllIllIIIllllllIlllIIII, llllllllllllIllIIIllllllIllIIlll, Throne.llIllllIIIllll[7], Throne.llIllllIIIllll[7], Throne.llIllllIIIllll[9], Throne.llIllllIIIllll[7], Throne.llIllllIIIllll[7], Throne.llIllllIIIllll[4], Blocks.nether_brick_fence.getDefaultState(), Blocks.nether_brick_fence.getDefaultState(), (boolean)(Throne.llIllllIIIllll[0] != 0));
            this.fillWithBlocks(llllllllllllIllIIIllllllIlllIIII, llllllllllllIllIIIllllllIllIIlll, Throne.llIllllIIIllll[1], Throne.llIllllIIIllll[7], Throne.llIllllIIIllll[4], Throne.llIllllIIIllll[8], Throne.llIllllIIIllll[3], Throne.llIllllIIIllll[4], Blocks.nether_brick_fence.getDefaultState(), Blocks.nether_brick_fence.getDefaultState(), (boolean)(Throne.llIllllIIIllll[0] != 0));
            this.fillWithBlocks(llllllllllllIllIIIllllllIlllIIII, llllllllllllIllIIIllllllIllIIlll, Throne.llIllllIIIllll[6], Throne.llIllllIIIllll[4], Throne.llIllllIIIllll[4], Throne.llIllllIIIllll[10], Throne.llIllllIIIllll[4], Throne.llIllllIIIllll[4], Blocks.nether_brick_fence.getDefaultState(), Blocks.nether_brick_fence.getDefaultState(), (boolean)(Throne.llIllllIIIllll[0] != 0));
            if (lIIllIlIIlIlllII(this.hasSpawner ? 1 : 0)) {
                final BlockPos llllllllllllIllIIIllllllIllIllIl = new BlockPos(this.getXWithOffset(Throne.llIllllIIIllll[9], Throne.llIllllIIIllll[8]), this.getYWithOffset(Throne.llIllllIIIllll[8]), this.getZWithOffset(Throne.llIllllIIIllll[9], Throne.llIllllIIIllll[8]));
                if (lIIllIlIIlIllIlI(llllllllllllIllIIIllllllIllIIlll.isVecInside(llllllllllllIllIIIllllllIllIllIl) ? 1 : 0)) {
                    this.hasSpawner = (Throne.llIllllIIIllll[1] != 0);
                    llllllllllllIllIIIllllllIlllIIII.setBlockState(llllllllllllIllIIIllllllIllIllIl, Blocks.mob_spawner.getDefaultState(), Throne.llIllllIIIllll[6]);
                    "".length();
                    final TileEntity llllllllllllIllIIIllllllIllIllII = llllllllllllIllIIIllllllIlllIIII.getTileEntity(llllllllllllIllIIIllllllIllIllIl);
                    if (lIIllIlIIlIllIlI((llllllllllllIllIIIllllllIllIllII instanceof TileEntityMobSpawner) ? 1 : 0)) {
                        ((TileEntityMobSpawner)llllllllllllIllIIIllllllIllIllII).getSpawnerBaseLogic().setEntityName(Throne.llIllllIIIlllI[Throne.llIllllIIIllll[6]]);
                    }
                }
            }
            int llllllllllllIllIIIllllllIllIlIll = Throne.llIllllIIIllll[0];
            "".length();
            if (((0x7B ^ 0x49) & ~(0x74 ^ 0x46)) < 0) {
                return ((0x42 ^ 0x4B) & ~(0x1E ^ 0x17)) != 0x0;
            }
            while (!lIIllIlIIlIlllIl(llllllllllllIllIIIllllllIllIlIll, Throne.llIllllIIIllll[7])) {
                int llllllllllllIllIIIllllllIllIlIlI = Throne.llIllllIIIllll[0];
                "".length();
                if (" ".length() == "  ".length()) {
                    return ((0xE ^ 0x45) & ~(0xE0 ^ 0xAB)) != 0x0;
                }
                while (!lIIllIlIIlIlllIl(llllllllllllIllIIIllllllIllIlIlI, Throne.llIllllIIIllll[7])) {
                    this.replaceAirAndLiquidDownwards(llllllllllllIllIIIllllllIlllIIII, Blocks.nether_brick.getDefaultState(), llllllllllllIllIIIllllllIllIlIll, Throne.llIllllIIIllll[11], llllllllllllIllIIIllllllIllIlIlI, llllllllllllIllIIIllllllIllIIlll);
                    ++llllllllllllIllIIIllllllIllIlIlI;
                }
                ++llllllllllllIllIIIllllllIllIlIll;
            }
            return Throne.llIllllIIIllll[1] != 0;
        }
        
        private static boolean lIIllIlIIlIllllI(final int llllllllllllIllIIIllllllIIllllIl, final int llllllllllllIllIIIllllllIIllllII) {
            return llllllllllllIllIIIllllllIIllllIl < llllllllllllIllIIIllllllIIllllII;
        }
        
        public static Throne func_175874_a(final List<StructureComponent> llllllllllllIllIIIllllllIllllllI, final Random llllllllllllIllIIIllllllIlllllIl, final int llllllllllllIllIIIllllllIlllllII, final int llllllllllllIllIIIlllllllIIIIIll, final int llllllllllllIllIIIllllllIllllIlI, final int llllllllllllIllIIIlllllllIIIIIIl, final EnumFacing llllllllllllIllIIIlllllllIIIIIII) {
            final StructureBoundingBox llllllllllllIllIIIllllllIlllllll = StructureBoundingBox.getComponentToAddBoundingBox(llllllllllllIllIIIllllllIlllllII, llllllllllllIllIIIlllllllIIIIIll, llllllllllllIllIIIllllllIllllIlI, Throne.llIllllIIIllll[2], Throne.llIllllIIIllll[0], Throne.llIllllIIIllll[0], Throne.llIllllIIIllll[3], Throne.llIllllIIIllll[4], Throne.llIllllIIIllll[5], llllllllllllIllIIIlllllllIIIIIII);
            Throne throne;
            if (lIIllIlIIlIllIlI(Piece.isAboveGround(llllllllllllIllIIIllllllIlllllll) ? 1 : 0) && lIIllIlIIlIllIll(StructureComponent.findIntersecting(llllllllllllIllIIIllllllIllllllI, llllllllllllIllIIIllllllIlllllll))) {
                throne = new Throne(llllllllllllIllIIIlllllllIIIIIIl, llllllllllllIllIIIllllllIlllllIl, llllllllllllIllIIIllllllIlllllll, llllllllllllIllIIIlllllllIIIIIII);
                "".length();
                if (-" ".length() >= 0) {
                    return null;
                }
            }
            else {
                throne = null;
            }
            return throne;
        }
        
        public Throne(final int llllllllllllIllIIIlllllllIIlllIl, final Random llllllllllllIllIIIlllllllIlIIIIl, final StructureBoundingBox llllllllllllIllIIIlllllllIIlllII, final EnumFacing llllllllllllIllIIIlllllllIIlllll) {
            super(llllllllllllIllIIIlllllllIIlllIl);
            this.coordBaseMode = llllllllllllIllIIIlllllllIIlllll;
            this.boundingBox = llllllllllllIllIIIlllllllIIlllII;
        }
        
        @Override
        protected void readStructureFromNBT(final NBTTagCompound llllllllllllIllIIIlllllllIIlIlIl) {
            super.readStructureFromNBT(llllllllllllIllIIIlllllllIIlIlIl);
            this.hasSpawner = llllllllllllIllIIIlllllllIIlIlIl.getBoolean(Throne.llIllllIIIlllI[Throne.llIllllIIIllll[0]]);
        }
    }
    
    public static class Corridor3 extends Piece
    {
        private static final /* synthetic */ int[] lIIIlIIlIlIllI;
        
        private static boolean lIllllllIlIIlIl(final int lllllllllllllIlIIIlIlIlIIIlIIlll) {
            return lllllllllllllIlIIIlIlIlIIIlIIlll == 0;
        }
        
        public Corridor3() {
        }
        
        public static Corridor3 func_175883_a(final List<StructureComponent> lllllllllllllIlIIIlIlIlIIllIIIII, final Random lllllllllllllIlIIIlIlIlIIlIlIlll, final int lllllllllllllIlIIIlIlIlIIlIlIllI, final int lllllllllllllIlIIIlIlIlIIlIlIlIl, final int lllllllllllllIlIIIlIlIlIIlIlllII, final EnumFacing lllllllllllllIlIIIlIlIlIIlIllIll, final int lllllllllllllIlIIIlIlIlIIlIllIlI) {
            final StructureBoundingBox lllllllllllllIlIIIlIlIlIIlIllIIl = StructureBoundingBox.getComponentToAddBoundingBox(lllllllllllllIlIIIlIlIlIIlIlIllI, lllllllllllllIlIIIlIlIlIIlIlIlIl, lllllllllllllIlIIIlIlIlIIlIlllII, Corridor3.lIIIlIIlIlIllI[2], Corridor3.lIIIlIIlIlIllI[3], Corridor3.lIIIlIIlIlIllI[1], Corridor3.lIIIlIIlIlIllI[4], Corridor3.lIIIlIIlIlIllI[5], Corridor3.lIIIlIIlIlIllI[6], lllllllllllllIlIIIlIlIlIIlIllIll);
            Corridor3 corridor3;
            if (lIllllllIlIIIlI(Piece.isAboveGround(lllllllllllllIlIIIlIlIlIIlIllIIl) ? 1 : 0) && lIllllllIlIIIll(StructureComponent.findIntersecting(lllllllllllllIlIIIlIlIlIIllIIIII, lllllllllllllIlIIIlIlIlIIlIllIIl))) {
                corridor3 = new Corridor3(lllllllllllllIlIIIlIlIlIIlIllIlI, lllllllllllllIlIIIlIlIlIIlIlIlll, lllllllllllllIlIIIlIlIlIIlIllIIl, lllllllllllllIlIIIlIlIlIIlIllIll);
                "".length();
                if (((0x21 ^ 0x7F) & ~(0xEB ^ 0xB5)) >= " ".length()) {
                    return null;
                }
            }
            else {
                corridor3 = null;
            }
            return corridor3;
        }
        
        private static void lIllllllIlIIIIl() {
            (lIIIlIIlIlIllI = new int[14])[0] = " ".length();
            Corridor3.lIIIlIIlIlIllI[1] = ((158 + 195 - 233 + 111 ^ 70 + 74 - 78 + 116) & (240 + 25 - 141 + 130 ^ 48 + 27 - 19 + 119 ^ -" ".length()));
            Corridor3.lIIIlIIlIlIllI[2] = -" ".length();
            Corridor3.lIIIlIIlIlIllI[3] = -(117 + 65 - 108 + 71 ^ 60 + 69 - 56 + 77);
            Corridor3.lIIIlIIlIlIllI[4] = (0x27 ^ 0x13 ^ (0x9 ^ 0x38));
            Corridor3.lIIIlIIlIlIllI[5] = (0x9D ^ 0x93);
            Corridor3.lIIIlIIlIlIllI[6] = (0x15 ^ 0x35 ^ (0x21 ^ 0xB));
            Corridor3.lIIIlIIlIlIllI[7] = "  ".length();
            Corridor3.lIIIlIIlIlIllI[8] = (44 + 82 - 103 + 140 ^ 150 + 47 - 159 + 126);
            Corridor3.lIIIlIIlIlIllI[9] = (0x5E ^ 0x59 ^ (0xB2 ^ 0xB8));
            Corridor3.lIIIlIIlIlIllI[10] = (0x72 ^ 0x76);
            Corridor3.lIIIlIIlIlIllI[11] = "   ".length();
            Corridor3.lIIIlIIlIlIllI[12] = (0x46 ^ 0x40);
            Corridor3.lIIIlIIlIlIllI[13] = (0xC7 ^ 0xBE ^ (0x7E ^ 0xE));
        }
        
        private static boolean lIllllllIlIIIlI(final int lllllllllllllIlIIIlIlIlIIIlIlIIl) {
            return lllllllllllllIlIIIlIlIlIIIlIlIIl != 0;
        }
        
        private static boolean lIllllllIlIIlII(final int lllllllllllllIlIIIlIlIlIIIllIIlI, final int lllllllllllllIlIIIlIlIlIIIllIIIl) {
            return lllllllllllllIlIIIlIlIlIIIllIIlI <= lllllllllllllIlIIIlIlIlIIIllIIIl;
        }
        
        @Override
        public void buildComponent(final StructureComponent lllllllllllllIlIIIlIlIlIIllIlIll, final List<StructureComponent> lllllllllllllIlIIIlIlIlIIllIlIlI, final Random lllllllllllllIlIIIlIlIlIIllIllIl) {
            this.getNextComponentNormal((Start)lllllllllllllIlIIIlIlIlIIllIlIll, lllllllllllllIlIIIlIlIlIIllIlIlI, lllllllllllllIlIIIlIlIlIIllIllIl, Corridor3.lIIIlIIlIlIllI[0], Corridor3.lIIIlIIlIlIllI[1], (boolean)(Corridor3.lIIIlIIlIlIllI[0] != 0));
            "".length();
        }
        
        static {
            lIllllllIlIIIIl();
        }
        
        @Override
        public boolean addComponentParts(final World lllllllllllllIlIIIlIlIlIIIllllII, final Random lllllllllllllIlIIIlIlIlIIlIIIlIl, final StructureBoundingBox lllllllllllllIlIIIlIlIlIIlIIIlII) {
            final int lllllllllllllIlIIIlIlIlIIlIIIIll = this.getMetadataWithOffset(Blocks.nether_brick_stairs, Corridor3.lIIIlIIlIlIllI[7]);
            int lllllllllllllIlIIIlIlIlIIlIIIIlI = Corridor3.lIIIlIIlIlIllI[1];
            "".length();
            if (" ".length() == 0) {
                return ((0x75 ^ 0x6C ^ (0x1D ^ 0xB)) & (0x72 ^ 0x34 ^ (0x23 ^ 0x6A) ^ -" ".length())) != 0x0;
            }
            while (!lIllllllIlIIllI(lllllllllllllIlIIIlIlIlIIlIIIIlI, Corridor3.lIIIlIIlIlIllI[13])) {
                final int lllllllllllllIlIIIlIlIlIIlIIIIIl = Math.max(Corridor3.lIIIlIIlIlIllI[0], Corridor3.lIIIlIIlIlIllI[8] - lllllllllllllIlIIIlIlIlIIlIIIIlI);
                final int lllllllllllllIlIIIlIlIlIIlIIIIII = Math.min(Math.max(lllllllllllllIlIIIlIlIlIIlIIIIIl + Corridor3.lIIIlIIlIlIllI[4], Corridor3.lIIIlIIlIlIllI[5] - lllllllllllllIlIIIlIlIlIIlIIIIlI), Corridor3.lIIIlIIlIlIllI[9]);
                final int lllllllllllllIlIIIlIlIlIIIllllll = lllllllllllllIlIIIlIlIlIIlIIIIlI;
                this.fillWithBlocks(lllllllllllllIlIIIlIlIlIIIllllII, lllllllllllllIlIIIlIlIlIIlIIIlII, Corridor3.lIIIlIIlIlIllI[1], Corridor3.lIIIlIIlIlIllI[1], lllllllllllllIlIIIlIlIlIIlIIIIlI, Corridor3.lIIIlIIlIlIllI[10], lllllllllllllIlIIIlIlIlIIlIIIIIl, lllllllllllllIlIIIlIlIlIIlIIIIlI, Blocks.nether_brick.getDefaultState(), Blocks.nether_brick.getDefaultState(), (boolean)(Corridor3.lIIIlIIlIlIllI[1] != 0));
                this.fillWithBlocks(lllllllllllllIlIIIlIlIlIIIllllII, lllllllllllllIlIIIlIlIlIIlIIIlII, Corridor3.lIIIlIIlIlIllI[0], lllllllllllllIlIIIlIlIlIIlIIIIIl + Corridor3.lIIIlIIlIlIllI[0], lllllllllllllIlIIIlIlIlIIlIIIIlI, Corridor3.lIIIlIIlIlIllI[11], lllllllllllllIlIIIlIlIlIIlIIIIII - Corridor3.lIIIlIIlIlIllI[0], lllllllllllllIlIIIlIlIlIIlIIIIlI, Blocks.air.getDefaultState(), Blocks.air.getDefaultState(), (boolean)(Corridor3.lIIIlIIlIlIllI[1] != 0));
                if (lIllllllIlIIlII(lllllllllllllIlIIIlIlIlIIlIIIIlI, Corridor3.lIIIlIIlIlIllI[12])) {
                    this.setBlockState(lllllllllllllIlIIIlIlIlIIIllllII, Blocks.nether_brick_stairs.getStateFromMeta(lllllllllllllIlIIIlIlIlIIlIIIIll), Corridor3.lIIIlIIlIlIllI[0], lllllllllllllIlIIIlIlIlIIlIIIIIl + Corridor3.lIIIlIIlIlIllI[0], lllllllllllllIlIIIlIlIlIIlIIIIlI, lllllllllllllIlIIIlIlIlIIlIIIlII);
                    this.setBlockState(lllllllllllllIlIIIlIlIlIIIllllII, Blocks.nether_brick_stairs.getStateFromMeta(lllllllllllllIlIIIlIlIlIIlIIIIll), Corridor3.lIIIlIIlIlIllI[7], lllllllllllllIlIIIlIlIlIIlIIIIIl + Corridor3.lIIIlIIlIlIllI[0], lllllllllllllIlIIIlIlIlIIlIIIIlI, lllllllllllllIlIIIlIlIlIIlIIIlII);
                    this.setBlockState(lllllllllllllIlIIIlIlIlIIIllllII, Blocks.nether_brick_stairs.getStateFromMeta(lllllllllllllIlIIIlIlIlIIlIIIIll), Corridor3.lIIIlIIlIlIllI[11], lllllllllllllIlIIIlIlIlIIlIIIIIl + Corridor3.lIIIlIIlIlIllI[0], lllllllllllllIlIIIlIlIlIIlIIIIlI, lllllllllllllIlIIIlIlIlIIlIIIlII);
                }
                this.fillWithBlocks(lllllllllllllIlIIIlIlIlIIIllllII, lllllllllllllIlIIIlIlIlIIlIIIlII, Corridor3.lIIIlIIlIlIllI[1], lllllllllllllIlIIIlIlIlIIlIIIIII, lllllllllllllIlIIIlIlIlIIlIIIIlI, Corridor3.lIIIlIIlIlIllI[10], lllllllllllllIlIIIlIlIlIIlIIIIII, lllllllllllllIlIIIlIlIlIIlIIIIlI, Blocks.nether_brick.getDefaultState(), Blocks.nether_brick.getDefaultState(), (boolean)(Corridor3.lIIIlIIlIlIllI[1] != 0));
                this.fillWithBlocks(lllllllllllllIlIIIlIlIlIIIllllII, lllllllllllllIlIIIlIlIlIIlIIIlII, Corridor3.lIIIlIIlIlIllI[1], lllllllllllllIlIIIlIlIlIIlIIIIIl + Corridor3.lIIIlIIlIlIllI[0], lllllllllllllIlIIIlIlIlIIlIIIIlI, Corridor3.lIIIlIIlIlIllI[1], lllllllllllllIlIIIlIlIlIIlIIIIII - Corridor3.lIIIlIIlIlIllI[0], lllllllllllllIlIIIlIlIlIIlIIIIlI, Blocks.nether_brick.getDefaultState(), Blocks.nether_brick.getDefaultState(), (boolean)(Corridor3.lIIIlIIlIlIllI[1] != 0));
                this.fillWithBlocks(lllllllllllllIlIIIlIlIlIIIllllII, lllllllllllllIlIIIlIlIlIIlIIIlII, Corridor3.lIIIlIIlIlIllI[10], lllllllllllllIlIIIlIlIlIIlIIIIIl + Corridor3.lIIIlIIlIlIllI[0], lllllllllllllIlIIIlIlIlIIlIIIIlI, Corridor3.lIIIlIIlIlIllI[10], lllllllllllllIlIIIlIlIlIIlIIIIII - Corridor3.lIIIlIIlIlIllI[0], lllllllllllllIlIIIlIlIlIIlIIIIlI, Blocks.nether_brick.getDefaultState(), Blocks.nether_brick.getDefaultState(), (boolean)(Corridor3.lIIIlIIlIlIllI[1] != 0));
                if (lIllllllIlIIlIl(lllllllllllllIlIIIlIlIlIIlIIIIlI & Corridor3.lIIIlIIlIlIllI[0])) {
                    this.fillWithBlocks(lllllllllllllIlIIIlIlIlIIIllllII, lllllllllllllIlIIIlIlIlIIlIIIlII, Corridor3.lIIIlIIlIlIllI[1], lllllllllllllIlIIIlIlIlIIlIIIIIl + Corridor3.lIIIlIIlIlIllI[7], lllllllllllllIlIIIlIlIlIIlIIIIlI, Corridor3.lIIIlIIlIlIllI[1], lllllllllllllIlIIIlIlIlIIlIIIIIl + Corridor3.lIIIlIIlIlIllI[11], lllllllllllllIlIIIlIlIlIIlIIIIlI, Blocks.nether_brick_fence.getDefaultState(), Blocks.nether_brick_fence.getDefaultState(), (boolean)(Corridor3.lIIIlIIlIlIllI[1] != 0));
                    this.fillWithBlocks(lllllllllllllIlIIIlIlIlIIIllllII, lllllllllllllIlIIIlIlIlIIlIIIlII, Corridor3.lIIIlIIlIlIllI[10], lllllllllllllIlIIIlIlIlIIlIIIIIl + Corridor3.lIIIlIIlIlIllI[7], lllllllllllllIlIIIlIlIlIIlIIIIlI, Corridor3.lIIIlIIlIlIllI[10], lllllllllllllIlIIIlIlIlIIlIIIIIl + Corridor3.lIIIlIIlIlIllI[11], lllllllllllllIlIIIlIlIlIIlIIIIlI, Blocks.nether_brick_fence.getDefaultState(), Blocks.nether_brick_fence.getDefaultState(), (boolean)(Corridor3.lIIIlIIlIlIllI[1] != 0));
                }
                int lllllllllllllIlIIIlIlIlIIIlllllI = Corridor3.lIIIlIIlIlIllI[1];
                "".length();
                if ((0x71 ^ 0x4E ^ (0x18 ^ 0x23)) <= " ".length()) {
                    return ((0x3C ^ 0x23 ^ (0x67 ^ 0x53)) & (0x56 ^ 0x42 ^ (0x2D ^ 0x12) ^ -" ".length())) != 0x0;
                }
                while (!lIllllllIlIIllI(lllllllllllllIlIIIlIlIlIIIlllllI, Corridor3.lIIIlIIlIlIllI[10])) {
                    this.replaceAirAndLiquidDownwards(lllllllllllllIlIIIlIlIlIIIllllII, Blocks.nether_brick.getDefaultState(), lllllllllllllIlIIIlIlIlIIIlllllI, Corridor3.lIIIlIIlIlIllI[2], lllllllllllllIlIIIlIlIlIIIllllll, lllllllllllllIlIIIlIlIlIIlIIIlII);
                    ++lllllllllllllIlIIIlIlIlIIIlllllI;
                }
                ++lllllllllllllIlIIIlIlIlIIlIIIIlI;
            }
            return Corridor3.lIIIlIIlIlIllI[0] != 0;
        }
        
        public Corridor3(final int lllllllllllllIlIIIlIlIlIIlllllII, final Random lllllllllllllIlIIIlIlIlIIllllIll, final StructureBoundingBox lllllllllllllIlIIIlIlIlIIllllIlI, final EnumFacing lllllllllllllIlIIIlIlIlIIlllIlIl) {
            super(lllllllllllllIlIIIlIlIlIIlllllII);
            this.coordBaseMode = lllllllllllllIlIIIlIlIlIIlllIlIl;
            this.boundingBox = lllllllllllllIlIIIlIlIlIIllllIlI;
        }
        
        private static boolean lIllllllIlIIIll(final Object lllllllllllllIlIIIlIlIlIIIlIlIll) {
            return lllllllllllllIlIIIlIlIlIIIlIlIll == null;
        }
        
        private static boolean lIllllllIlIIllI(final int lllllllllllllIlIIIlIlIlIIIlIlllI, final int lllllllllllllIlIIIlIlIlIIIlIllIl) {
            return lllllllllllllIlIIIlIlIlIIIlIlllI > lllllllllllllIlIIIlIlIlIIIlIllIl;
        }
    }
    
    public static class Straight extends Piece
    {
        private static final /* synthetic */ int[] llIllllIIllllI;
        
        static {
            lIIllIlIlIIllIll();
        }
        
        private static boolean lIIllIlIlIIllllI(final int llllllllllllIllIIIlllIllIlllllII, final int llllllllllllIllIIIlllIllIllllIll) {
            return llllllllllllIllIIIlllIllIlllllII > llllllllllllIllIIIlllIllIllllIll;
        }
        
        @Override
        public void buildComponent(final StructureComponent llllllllllllIllIIIlllIlllIlIlIIl, final List<StructureComponent> llllllllllllIllIIIlllIlllIlIllII, final Random llllllllllllIllIIIlllIlllIlIlIll) {
            this.getNextComponentNormal((Start)llllllllllllIllIIIlllIlllIlIlIIl, llllllllllllIllIIIlllIlllIlIllII, llllllllllllIllIIIlllIlllIlIlIll, Straight.llIllllIIllllI[0], Straight.llIllllIIllllI[1], (boolean)(Straight.llIllllIIllllI[2] != 0));
            "".length();
        }
        
        public Straight(final int llllllllllllIllIIIlllIlllIlllIlI, final Random llllllllllllIllIIIlllIlllIlllIIl, final StructureBoundingBox llllllllllllIllIIIlllIlllIllIlII, final EnumFacing llllllllllllIllIIIlllIlllIllIIll) {
            super(llllllllllllIllIIIlllIlllIlllIlI);
            this.coordBaseMode = llllllllllllIllIIIlllIlllIllIIll;
            this.boundingBox = llllllllllllIllIIIlllIlllIllIlII;
        }
        
        private static boolean lIIllIlIlIIlllII(final int llllllllllllIllIIIlllIllIlllIlll) {
            return llllllllllllIllIIIlllIllIlllIlll != 0;
        }
        
        private static boolean lIIllIlIlIIlllIl(final Object llllllllllllIllIIIlllIllIllllIIl) {
            return llllllllllllIllIIIlllIllIllllIIl == null;
        }
        
        public static Straight func_175882_a(final List<StructureComponent> llllllllllllIllIIIlllIlllIIlIllI, final Random llllllllllllIllIIIlllIlllIIlIlIl, final int llllllllllllIllIIIlllIlllIIlIlII, final int llllllllllllIllIIIlllIlllIIllIll, final int llllllllllllIllIIIlllIlllIIlIIlI, final EnumFacing llllllllllllIllIIIlllIlllIIllIIl, final int llllllllllllIllIIIlllIlllIIlIIII) {
            final StructureBoundingBox llllllllllllIllIIIlllIlllIIlIlll = StructureBoundingBox.getComponentToAddBoundingBox(llllllllllllIllIIIlllIlllIIlIlII, llllllllllllIllIIIlllIlllIIllIll, llllllllllllIllIIIlllIlllIIlIIlI, Straight.llIllllIIllllI[3], Straight.llIllllIIllllI[4], Straight.llIllllIIllllI[2], Straight.llIllllIIllllI[5], Straight.llIllllIIllllI[6], Straight.llIllllIIllllI[7], llllllllllllIllIIIlllIlllIIllIIl);
            Straight straight;
            if (lIIllIlIlIIlllII(Piece.isAboveGround(llllllllllllIllIIIlllIlllIIlIlll) ? 1 : 0) && lIIllIlIlIIlllIl(StructureComponent.findIntersecting(llllllllllllIllIIIlllIlllIIlIllI, llllllllllllIllIIIlllIlllIIlIlll))) {
                straight = new Straight(llllllllllllIllIIIlllIlllIIlIIII, llllllllllllIllIIIlllIlllIIlIlIl, llllllllllllIllIIIlllIlllIIlIlll, llllllllllllIllIIIlllIlllIIllIIl);
                "".length();
                if (((36 + 40 + 2 + 69 ^ 21 + 3 + 69 + 45) & (0xD8 ^ 0x82 ^ (0x1D ^ 0x5E) ^ -" ".length())) != 0x0) {
                    return null;
                }
            }
            else {
                straight = null;
            }
            return straight;
        }
        
        public Straight() {
        }
        
        @Override
        public boolean addComponentParts(final World llllllllllllIllIIIlllIlllIIIIIlI, final Random llllllllllllIllIIIlllIlllIIIIlll, final StructureBoundingBox llllllllllllIllIIIlllIlllIIIIIIl) {
            this.fillWithBlocks(llllllllllllIllIIIlllIlllIIIIIlI, llllllllllllIllIIIlllIlllIIIIIIl, Straight.llIllllIIllllI[2], Straight.llIllllIIllllI[1], Straight.llIllllIIllllI[2], Straight.llIllllIIllllI[8], Straight.llIllllIIllllI[8], Straight.llIllllIIllllI[9], Blocks.nether_brick.getDefaultState(), Blocks.nether_brick.getDefaultState(), (boolean)(Straight.llIllllIIllllI[2] != 0));
            this.fillWithBlocks(llllllllllllIllIIIlllIlllIIIIIlI, llllllllllllIllIIIlllIlllIIIIIIl, Straight.llIllllIIllllI[0], Straight.llIllllIIllllI[5], Straight.llIllllIIllllI[2], Straight.llIllllIIllllI[1], Straight.llIllllIIllllI[10], Straight.llIllllIIllllI[9], Blocks.air.getDefaultState(), Blocks.air.getDefaultState(), (boolean)(Straight.llIllllIIllllI[2] != 0));
            this.fillWithBlocks(llllllllllllIllIIIlllIlllIIIIIlI, llllllllllllIllIIIlllIlllIIIIIIl, Straight.llIllllIIllllI[2], Straight.llIllllIIllllI[5], Straight.llIllllIIllllI[2], Straight.llIllllIIllllI[2], Straight.llIllllIIllllI[5], Straight.llIllllIIllllI[9], Blocks.nether_brick.getDefaultState(), Blocks.nether_brick.getDefaultState(), (boolean)(Straight.llIllllIIllllI[2] != 0));
            this.fillWithBlocks(llllllllllllIllIIIlllIlllIIIIIlI, llllllllllllIllIIIlllIlllIIIIIIl, Straight.llIllllIIllllI[8], Straight.llIllllIIllllI[5], Straight.llIllllIIllllI[2], Straight.llIllllIIllllI[8], Straight.llIllllIIllllI[5], Straight.llIllllIIllllI[9], Blocks.nether_brick.getDefaultState(), Blocks.nether_brick.getDefaultState(), (boolean)(Straight.llIllllIIllllI[2] != 0));
            this.fillWithBlocks(llllllllllllIllIIIlllIlllIIIIIlI, llllllllllllIllIIIlllIlllIIIIIIl, Straight.llIllllIIllllI[2], Straight.llIllllIIllllI[11], Straight.llIllllIIllllI[2], Straight.llIllllIIllllI[8], Straight.llIllllIIllllI[11], Straight.llIllllIIllllI[5], Blocks.nether_brick.getDefaultState(), Blocks.nether_brick.getDefaultState(), (boolean)(Straight.llIllllIIllllI[2] != 0));
            this.fillWithBlocks(llllllllllllIllIIIlllIlllIIIIIlI, llllllllllllIllIIIlllIlllIIIIIIl, Straight.llIllllIIllllI[2], Straight.llIllllIIllllI[11], Straight.llIllllIIllllI[12], Straight.llIllllIIllllI[8], Straight.llIllllIIllllI[11], Straight.llIllllIIllllI[9], Blocks.nether_brick.getDefaultState(), Blocks.nether_brick.getDefaultState(), (boolean)(Straight.llIllllIIllllI[2] != 0));
            this.fillWithBlocks(llllllllllllIllIIIlllIlllIIIIIlI, llllllllllllIllIIIlllIlllIIIIIIl, Straight.llIllllIIllllI[2], Straight.llIllllIIllllI[2], Straight.llIllllIIllllI[2], Straight.llIllllIIllllI[8], Straight.llIllllIIllllI[0], Straight.llIllllIIllllI[1], Blocks.nether_brick.getDefaultState(), Blocks.nether_brick.getDefaultState(), (boolean)(Straight.llIllllIIllllI[2] != 0));
            this.fillWithBlocks(llllllllllllIllIIIlllIlllIIIIIlI, llllllllllllIllIIIlllIlllIIIIIIl, Straight.llIllllIIllllI[2], Straight.llIllllIIllllI[2], Straight.llIllllIIllllI[13], Straight.llIllllIIllllI[8], Straight.llIllllIIllllI[0], Straight.llIllllIIllllI[9], Blocks.nether_brick.getDefaultState(), Blocks.nether_brick.getDefaultState(), (boolean)(Straight.llIllllIIllllI[2] != 0));
            int llllllllllllIllIIIlllIlllIIIIlIl = Straight.llIllllIIllllI[2];
            "".length();
            if (-"   ".length() >= 0) {
                return ((162 + 64 - 172 + 114 ^ 165 + 79 - 131 + 66) & (0x61 ^ 0x4 ^ (0x0 ^ 0x7E) ^ -" ".length())) != 0x0;
            }
            while (!lIIllIlIlIIllllI(llllllllllllIllIIIlllIlllIIIIlIl, Straight.llIllllIIllllI[8])) {
                int llllllllllllIllIIIlllIlllIIIIlII = Straight.llIllllIIllllI[2];
                "".length();
                if (null != null) {
                    return ((0xD5 ^ 0x96 ^ (0x6B ^ 0x62)) & (162 + 18 - 173 + 240 ^ 72 + 110 - 79 + 86 ^ -" ".length())) != 0x0;
                }
                while (!lIIllIlIlIIllllI(llllllllllllIllIIIlllIlllIIIIlII, Straight.llIllllIIllllI[11])) {
                    this.replaceAirAndLiquidDownwards(llllllllllllIllIIIlllIlllIIIIIlI, Blocks.nether_brick.getDefaultState(), llllllllllllIllIIIlllIlllIIIIlIl, Straight.llIllllIIllllI[3], llllllllllllIllIIIlllIlllIIIIlII, llllllllllllIllIIIlllIlllIIIIIIl);
                    this.replaceAirAndLiquidDownwards(llllllllllllIllIIIlllIlllIIIIIlI, Blocks.nether_brick.getDefaultState(), llllllllllllIllIIIlllIlllIIIIlIl, Straight.llIllllIIllllI[3], Straight.llIllllIIllllI[9] - llllllllllllIllIIIlllIlllIIIIlII, llllllllllllIllIIIlllIlllIIIIIIl);
                    ++llllllllllllIllIIIlllIlllIIIIlII;
                }
                ++llllllllllllIllIIIlllIlllIIIIlIl;
            }
            this.fillWithBlocks(llllllllllllIllIIIlllIlllIIIIIlI, llllllllllllIllIIIlllIlllIIIIIIl, Straight.llIllllIIllllI[2], Straight.llIllllIIllllI[0], Straight.llIllllIIllllI[0], Straight.llIllllIIllllI[2], Straight.llIllllIIllllI[8], Straight.llIllllIIllllI[0], Blocks.nether_brick_fence.getDefaultState(), Blocks.nether_brick_fence.getDefaultState(), (boolean)(Straight.llIllllIIllllI[2] != 0));
            this.fillWithBlocks(llllllllllllIllIIIlllIlllIIIIIlI, llllllllllllIllIIIlllIlllIIIIIIl, Straight.llIllllIIllllI[2], Straight.llIllllIIllllI[1], Straight.llIllllIIllllI[8], Straight.llIllllIIllllI[2], Straight.llIllllIIllllI[8], Straight.llIllllIIllllI[8], Blocks.nether_brick_fence.getDefaultState(), Blocks.nether_brick_fence.getDefaultState(), (boolean)(Straight.llIllllIIllllI[2] != 0));
            this.fillWithBlocks(llllllllllllIllIIIlllIlllIIIIIlI, llllllllllllIllIIIlllIlllIIIIIIl, Straight.llIllllIIllllI[2], Straight.llIllllIIllllI[1], Straight.llIllllIIllllI[14], Straight.llIllllIIllllI[2], Straight.llIllllIIllllI[8], Straight.llIllllIIllllI[14], Blocks.nether_brick_fence.getDefaultState(), Blocks.nether_brick_fence.getDefaultState(), (boolean)(Straight.llIllllIIllllI[2] != 0));
            this.fillWithBlocks(llllllllllllIllIIIlllIlllIIIIIlI, llllllllllllIllIIIlllIlllIIIIIIl, Straight.llIllllIIllllI[2], Straight.llIllllIIllllI[0], Straight.llIllllIIllllI[15], Straight.llIllllIIllllI[2], Straight.llIllllIIllllI[8], Straight.llIllllIIllllI[15], Blocks.nether_brick_fence.getDefaultState(), Blocks.nether_brick_fence.getDefaultState(), (boolean)(Straight.llIllllIIllllI[2] != 0));
            this.fillWithBlocks(llllllllllllIllIIIlllIlllIIIIIlI, llllllllllllIllIIIlllIlllIIIIIIl, Straight.llIllllIIllllI[8], Straight.llIllllIIllllI[0], Straight.llIllllIIllllI[0], Straight.llIllllIIllllI[8], Straight.llIllllIIllllI[8], Straight.llIllllIIllllI[0], Blocks.nether_brick_fence.getDefaultState(), Blocks.nether_brick_fence.getDefaultState(), (boolean)(Straight.llIllllIIllllI[2] != 0));
            this.fillWithBlocks(llllllllllllIllIIIlllIlllIIIIIlI, llllllllllllIllIIIlllIlllIIIIIIl, Straight.llIllllIIllllI[8], Straight.llIllllIIllllI[1], Straight.llIllllIIllllI[8], Straight.llIllllIIllllI[8], Straight.llIllllIIllllI[8], Straight.llIllllIIllllI[8], Blocks.nether_brick_fence.getDefaultState(), Blocks.nether_brick_fence.getDefaultState(), (boolean)(Straight.llIllllIIllllI[2] != 0));
            this.fillWithBlocks(llllllllllllIllIIIlllIlllIIIIIlI, llllllllllllIllIIIlllIlllIIIIIIl, Straight.llIllllIIllllI[8], Straight.llIllllIIllllI[1], Straight.llIllllIIllllI[14], Straight.llIllllIIllllI[8], Straight.llIllllIIllllI[8], Straight.llIllllIIllllI[14], Blocks.nether_brick_fence.getDefaultState(), Blocks.nether_brick_fence.getDefaultState(), (boolean)(Straight.llIllllIIllllI[2] != 0));
            this.fillWithBlocks(llllllllllllIllIIIlllIlllIIIIIlI, llllllllllllIllIIIlllIlllIIIIIIl, Straight.llIllllIIllllI[8], Straight.llIllllIIllllI[0], Straight.llIllllIIllllI[15], Straight.llIllllIIllllI[8], Straight.llIllllIIllllI[8], Straight.llIllllIIllllI[15], Blocks.nether_brick_fence.getDefaultState(), Blocks.nether_brick_fence.getDefaultState(), (boolean)(Straight.llIllllIIllllI[2] != 0));
            return Straight.llIllllIIllllI[0] != 0;
        }
        
        private static void lIIllIlIlIIllIll() {
            (llIllllIIllllI = new int[16])[0] = " ".length();
            Straight.llIllllIIllllI[1] = "   ".length();
            Straight.llIllllIIllllI[2] = ((0x95 ^ 0xAE ^ (0xE7 ^ 0x8E)) & (228 + 241 - 451 + 232 ^ 59 + 99 - 69 + 79 ^ -" ".length()));
            Straight.llIllllIIllllI[3] = -" ".length();
            Straight.llIllllIIllllI[4] = -"   ".length();
            Straight.llIllllIIllllI[5] = (0x41 ^ 0x44);
            Straight.llIllllIIllllI[6] = (37 + 133 - 127 + 138 ^ 109 + 89 - 74 + 67);
            Straight.llIllllIIllllI[7] = (0x75 ^ 0x66);
            Straight.llIllllIIllllI[8] = (0x33 ^ 0x6F ^ (0x67 ^ 0x3F));
            Straight.llIllllIIllllI[9] = (0x6B ^ 0x50 ^ (0x3 ^ 0x2A));
            Straight.llIllllIIllllI[10] = (0xE6 ^ 0xBF ^ (0x79 ^ 0x27));
            Straight.llIllllIIllllI[11] = "  ".length();
            Straight.llIllllIIllllI[12] = (0x86 ^ 0x8B);
            Straight.llIllllIIllllI[13] = (0x89 ^ 0xA1 ^ (0x4E ^ 0x69));
            Straight.llIllllIIllllI[14] = (16 + 36 + 44 + 61 ^ 1 + 121 - 73 + 98);
            Straight.llIllllIIllllI[15] = (0x5C ^ 0x2D ^ (0x2A ^ 0x4A));
        }
    }
}
