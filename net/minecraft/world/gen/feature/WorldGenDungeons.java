// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.world.gen.feature;

import java.util.Iterator;
import com.google.common.collect.Lists;
import org.apache.logging.log4j.LogManager;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.security.MessageDigest;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.block.material.Material;
import net.minecraft.tileentity.TileEntityMobSpawner;
import net.minecraft.inventory.IInventory;
import net.minecraft.tileentity.TileEntityChest;
import net.minecraft.init.Items;
import net.minecraft.util.EnumFacing;
import net.minecraft.init.Blocks;
import net.minecraft.util.BlockPos;
import net.minecraft.world.World;
import java.util.Random;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import org.apache.logging.log4j.Logger;
import net.minecraft.util.WeightedRandomChestContent;
import java.util.List;

public class WorldGenDungeons extends WorldGenerator
{
    private static final /* synthetic */ List<WeightedRandomChestContent> CHESTCONTENT;
    private static final /* synthetic */ Logger field_175918_a;
    private static final /* synthetic */ String[] SPAWNERTYPES;
    private static final /* synthetic */ int[] lIlllllllIlIIl;
    private static final /* synthetic */ String[] lIllllllIlllIl;
    
    private static boolean lIIIIllIIIlIlIlI(final int llllllllllllIllllIIIllIlllIIIlll) {
        return llllllllllllIllllIIIllIlllIIIlll == 0;
    }
    
    private static boolean lIIIIllIIIlIllII(final int llllllllllllIllllIIIllIlllIIlIIl) {
        return llllllllllllIllllIIIllIlllIIlIIl != 0;
    }
    
    private static boolean lIIIIllIIIlIlIIl(final int llllllllllllIllllIIIllIllllIIIII, final int llllllllllllIllllIIIllIlllIlllll) {
        return llllllllllllIllllIIIllIllllIIIII == llllllllllllIllllIIIllIlllIlllll;
    }
    
    private static String lIIIIlIlllllllll(String llllllllllllIllllIIIllIllllllIII, final String llllllllllllIllllIIIllIlllllllII) {
        llllllllllllIllllIIIllIllllllIII = new String(Base64.getDecoder().decode(llllllllllllIllllIIIllIllllllIII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder llllllllllllIllllIIIllIllllllIll = new StringBuilder();
        final char[] llllllllllllIllllIIIllIllllllIlI = llllllllllllIllllIIIllIlllllllII.toCharArray();
        int llllllllllllIllllIIIllIllllllIIl = WorldGenDungeons.lIlllllllIlIIl[1];
        final int llllllllllllIllllIIIllIlllllIIll = (Object)llllllllllllIllllIIIllIllllllIII.toCharArray();
        final double llllllllllllIllllIIIllIlllllIIlI = llllllllllllIllllIIIllIlllllIIll.length;
        double llllllllllllIllllIIIllIlllllIIIl = WorldGenDungeons.lIlllllllIlIIl[1];
        while (lIIIIllIIIllIIlI((int)llllllllllllIllllIIIllIlllllIIIl, (int)llllllllllllIllllIIIllIlllllIIlI)) {
            final char llllllllllllIllllIIIllIllllllllI = llllllllllllIllllIIIllIlllllIIll[llllllllllllIllllIIIllIlllllIIIl];
            llllllllllllIllllIIIllIllllllIll.append((char)(llllllllllllIllllIIIllIllllllllI ^ llllllllllllIllllIIIllIllllllIlI[llllllllllllIllllIIIllIllllllIIl % llllllllllllIllllIIIllIllllllIlI.length]));
            "".length();
            ++llllllllllllIllllIIIllIllllllIIl;
            ++llllllllllllIllllIIIllIlllllIIIl;
            "".length();
            if (null != null) {
                return null;
            }
        }
        return String.valueOf(llllllllllllIllllIIIllIllllllIll);
    }
    
    private static boolean lIIIIllIIIllIIlI(final int llllllllllllIllllIIIllIlllIllIII, final int llllllllllllIllllIIIllIlllIlIlll) {
        return llllllllllllIllllIIIllIlllIllIII < llllllllllllIllllIIIllIlllIlIlll;
    }
    
    private String pickMobSpawner(final Random llllllllllllIllllIIIlllIIIIlIllI) {
        return WorldGenDungeons.SPAWNERTYPES[llllllllllllIllllIIIlllIIIIlIllI.nextInt(WorldGenDungeons.SPAWNERTYPES.length)];
    }
    
    private static boolean lIIIIllIIIllIIII(final Object llllllllllllIllllIIIllIlllIIllII, final Object llllllllllllIllllIIIllIlllIIlIll) {
        return llllllllllllIllllIIIllIlllIIllII != llllllllllllIllllIIIllIlllIIlIll;
    }
    
    private static void lIIIIllIIIlIlIII() {
        (lIlllllllIlIIl = new int[17])[0] = (0x40 ^ 0x44);
        WorldGenDungeons.lIlllllllIlIIl[1] = ((0x57 ^ 0x44) & ~(0xF ^ 0x1C));
        WorldGenDungeons.lIlllllllIlIIl[2] = " ".length();
        WorldGenDungeons.lIlllllllIlIIl[3] = "  ".length();
        WorldGenDungeons.lIlllllllIlIIl[4] = "   ".length();
        WorldGenDungeons.lIlllllllIlIIl[5] = (0x4 ^ 0x2A ^ (0x0 ^ 0x21));
        WorldGenDungeons.lIlllllllIlIIl[6] = (0x2 ^ 0x8);
        WorldGenDungeons.lIlllllllIlIIl[7] = (0x7B ^ 0x6 ^ (0x67 ^ 0x1F));
        WorldGenDungeons.lIlllllllIlIIl[8] = (13 + 19 - 11 + 107 ^ 51 + 40 + 41 + 2);
        WorldGenDungeons.lIlllllllIlIIl[9] = (133 + 138 - 269 + 170 ^ 45 + 143 - 17 + 0);
        WorldGenDungeons.lIlllllllIlIIl[10] = (0x39 ^ 0x31);
        WorldGenDungeons.lIlllllllIlIIl[11] = (0xB9 ^ 0xB0);
        WorldGenDungeons.lIlllllllIlIIl[12] = (51 + 92 + 1 + 13 ^ 56 + 73 - 117 + 138);
        WorldGenDungeons.lIlllllllIlIIl[13] = (0x3F ^ 0x6C ^ (0x74 ^ 0x2B));
        WorldGenDungeons.lIlllllllIlIIl[14] = (0x2D ^ 0x20);
        WorldGenDungeons.lIlllllllIlIIl[15] = (0xE ^ 0x26 ^ (0x51 ^ 0x77));
        WorldGenDungeons.lIlllllllIlIIl[16] = -" ".length();
    }
    
    @Override
    public boolean generate(final World llllllllllllIllllIIIlllIIlIlIIIl, final Random llllllllllllIllllIIIlllIIlIlIIII, final BlockPos llllllllllllIllllIIIlllIIIlIllII) {
        final int llllllllllllIllllIIIlllIIlIIlllI = WorldGenDungeons.lIlllllllIlIIl[4];
        final int llllllllllllIllllIIIlllIIlIIllIl = llllllllllllIllllIIIlllIIlIlIIII.nextInt(WorldGenDungeons.lIlllllllIlIIl[3]) + WorldGenDungeons.lIlllllllIlIIl[3];
        final int llllllllllllIllllIIIlllIIlIIllII = -llllllllllllIllllIIIlllIIlIIllIl - WorldGenDungeons.lIlllllllIlIIl[2];
        final int llllllllllllIllllIIIlllIIlIIlIll = llllllllllllIllllIIIlllIIlIIllIl + WorldGenDungeons.lIlllllllIlIIl[2];
        final int llllllllllllIllllIIIlllIIlIIlIlI = WorldGenDungeons.lIlllllllIlIIl[16];
        final int llllllllllllIllllIIIlllIIlIIlIIl = WorldGenDungeons.lIlllllllIlIIl[0];
        final int llllllllllllIllllIIIlllIIlIIlIII = llllllllllllIllllIIIlllIIlIlIIII.nextInt(WorldGenDungeons.lIlllllllIlIIl[3]) + WorldGenDungeons.lIlllllllIlIIl[3];
        final int llllllllllllIllllIIIlllIIlIIIlll = -llllllllllllIllllIIIlllIIlIIlIII - WorldGenDungeons.lIlllllllIlIIl[2];
        final int llllllllllllIllllIIIlllIIlIIIllI = llllllllllllIllllIIIlllIIlIIlIII + WorldGenDungeons.lIlllllllIlIIl[2];
        int llllllllllllIllllIIIlllIIlIIIlIl = WorldGenDungeons.lIlllllllIlIIl[1];
        int llllllllllllIllllIIIlllIIlIIIlII = llllllllllllIllllIIIlllIIlIIllII;
        "".length();
        if ((0x96 ^ 0x92) != (0x3A ^ 0x3E)) {
            return ("  ".length() & ~"  ".length()) != 0x0;
        }
        while (!lIIIIllIIIlIllIl(llllllllllllIllllIIIlllIIlIIIlII, llllllllllllIllllIIIlllIIlIIlIll)) {
            int llllllllllllIllllIIIlllIIlIIIIll = WorldGenDungeons.lIlllllllIlIIl[16];
            "".length();
            if (" ".length() == -" ".length()) {
                return ((53 + 98 - 41 + 25 ^ 52 + 67 - 4 + 76) & (0xBE ^ 0xB3 ^ (0x2A ^ 0x1F) ^ -" ".length())) != 0x0;
            }
            while (!lIIIIllIIIlIllIl(llllllllllllIllllIIIlllIIlIIIIll, WorldGenDungeons.lIlllllllIlIIl[0])) {
                int llllllllllllIllllIIIlllIIlIIIIlI = llllllllllllIllllIIIlllIIlIIIlll;
                "".length();
                if ("   ".length() < "   ".length()) {
                    return ((0xB ^ 0x69 ^ (0xF0 ^ 0xA2)) & (0x41 ^ 0x16 ^ (0xE1 ^ 0x86) ^ -" ".length())) != 0x0;
                }
                while (!lIIIIllIIIlIllIl(llllllllllllIllllIIIlllIIlIIIIlI, llllllllllllIllllIIIlllIIlIIIllI)) {
                    final BlockPos llllllllllllIllllIIIlllIIlIIIIIl = llllllllllllIllllIIIlllIIIlIllII.add(llllllllllllIllllIIIlllIIlIIIlII, llllllllllllIllllIIIlllIIlIIIIll, llllllllllllIllllIIIlllIIlIIIIlI);
                    final Material llllllllllllIllllIIIlllIIlIIIIII = llllllllllllIllllIIIlllIIlIlIIIl.getBlockState(llllllllllllIllllIIIlllIIlIIIIIl).getBlock().getMaterial();
                    final boolean llllllllllllIllllIIIlllIIIllllll = llllllllllllIllllIIIlllIIlIIIIII.isSolid();
                    if (lIIIIllIIIlIlIIl(llllllllllllIllllIIIlllIIlIIIIll, WorldGenDungeons.lIlllllllIlIIl[16]) && lIIIIllIIIlIlIlI(llllllllllllIllllIIIlllIIIllllll ? 1 : 0)) {
                        return WorldGenDungeons.lIlllllllIlIIl[1] != 0;
                    }
                    if (lIIIIllIIIlIlIIl(llllllllllllIllllIIIlllIIlIIIIll, WorldGenDungeons.lIlllllllIlIIl[0]) && lIIIIllIIIlIlIlI(llllllllllllIllllIIIlllIIIllllll ? 1 : 0)) {
                        return WorldGenDungeons.lIlllllllIlIIl[1] != 0;
                    }
                    if ((!lIIIIllIIIlIlIll(llllllllllllIllllIIIlllIIlIIIlII, llllllllllllIllllIIIlllIIlIIllII) || !lIIIIllIIIlIlIll(llllllllllllIllllIIIlllIIlIIIlII, llllllllllllIllllIIIlllIIlIIlIll) || !lIIIIllIIIlIlIll(llllllllllllIllllIIIlllIIlIIIIlI, llllllllllllIllllIIIlllIIlIIIlll) || lIIIIllIIIlIlIIl(llllllllllllIllllIIIlllIIlIIIIlI, llllllllllllIllllIIIlllIIlIIIllI)) && lIIIIllIIIlIlIlI(llllllllllllIllllIIIlllIIlIIIIll) && lIIIIllIIIlIllII(llllllllllllIllllIIIlllIIlIlIIIl.isAirBlock(llllllllllllIllllIIIlllIIlIIIIIl) ? 1 : 0) && lIIIIllIIIlIllII(llllllllllllIllllIIIlllIIlIlIIIl.isAirBlock(llllllllllllIllllIIIlllIIlIIIIIl.up()) ? 1 : 0)) {
                        ++llllllllllllIllllIIIlllIIlIIIlIl;
                    }
                    ++llllllllllllIllllIIIlllIIlIIIIlI;
                }
                ++llllllllllllIllllIIIlllIIlIIIIll;
            }
            ++llllllllllllIllllIIIlllIIlIIIlII;
        }
        if (!lIIIIllIIIlIlllI(llllllllllllIllllIIIlllIIlIIIlIl, WorldGenDungeons.lIlllllllIlIIl[2]) || !lIIIIllIIIlIllll(llllllllllllIllllIIIlllIIlIIIlIl, WorldGenDungeons.lIlllllllIlIIl[7])) {
            return WorldGenDungeons.lIlllllllIlIIl[1] != 0;
        }
        int llllllllllllIllllIIIlllIIIlllllI = llllllllllllIllllIIIlllIIlIIllII;
        "".length();
        if (" ".length() <= 0) {
            return ((0x0 ^ 0x60) & ~(0xEB ^ 0x8B)) != 0x0;
        }
        while (!lIIIIllIIIlIllIl(llllllllllllIllllIIIlllIIIlllllI, llllllllllllIllllIIIlllIIlIIlIll)) {
            int llllllllllllIllllIIIlllIIIllllIl = WorldGenDungeons.lIlllllllIlIIl[4];
            "".length();
            if ((105 + 43 - 107 + 110 ^ 144 + 93 - 197 + 107) == 0x0) {
                return ((133 + 45 - 73 + 59 ^ 57 + 94 - 45 + 73) & (0x49 ^ 0x10 ^ (0x6 ^ 0x48) ^ -" ".length())) != 0x0;
            }
            while (!lIIIIllIIIllIIlI(llllllllllllIllllIIIlllIIIllllIl, WorldGenDungeons.lIlllllllIlIIl[16])) {
                int llllllllllllIllllIIIlllIIIllllII = llllllllllllIllllIIIlllIIlIIIlll;
                "".length();
                if (-" ".length() >= 0) {
                    return ((63 + 51 - 29 + 167 ^ 50 + 61 + 35 + 21) & (177 + 165 - 277 + 132 ^ 120 + 125 - 188 + 101 ^ -" ".length())) != 0x0;
                }
                while (!lIIIIllIIIlIllIl(llllllllllllIllllIIIlllIIIllllII, llllllllllllIllllIIIlllIIlIIIllI)) {
                    final BlockPos llllllllllllIllllIIIlllIIIlllIll = llllllllllllIllllIIIlllIIIlIllII.add(llllllllllllIllllIIIlllIIIlllllI, llllllllllllIllllIIIlllIIIllllIl, llllllllllllIllllIIIlllIIIllllII);
                    if (lIIIIllIIIlIlIll(llllllllllllIllllIIIlllIIIlllllI, llllllllllllIllllIIIlllIIlIIllII) && lIIIIllIIIlIlIll(llllllllllllIllllIIIlllIIIllllIl, WorldGenDungeons.lIlllllllIlIIl[16]) && lIIIIllIIIlIlIll(llllllllllllIllllIIIlllIIIllllII, llllllllllllIllllIIIlllIIlIIIlll) && lIIIIllIIIlIlIll(llllllllllllIllllIIIlllIIIlllllI, llllllllllllIllllIIIlllIIlIIlIll) && lIIIIllIIIlIlIll(llllllllllllIllllIIIlllIIIllllIl, WorldGenDungeons.lIlllllllIlIIl[0]) && lIIIIllIIIlIlIll(llllllllllllIllllIIIlllIIIllllII, llllllllllllIllllIIIlllIIlIIIllI)) {
                        if (lIIIIllIIIllIIII(llllllllllllIllllIIIlllIIlIlIIIl.getBlockState(llllllllllllIllllIIIlllIIIlllIll).getBlock(), Blocks.chest)) {
                            llllllllllllIllllIIIlllIIlIlIIIl.setBlockToAir(llllllllllllIllllIIIlllIIIlllIll);
                            "".length();
                            "".length();
                            if (null != null) {
                                return ("   ".length() & ("   ".length() ^ -" ".length())) != 0x0;
                            }
                        }
                    }
                    else if (lIIIIllIIIllIIIl(llllllllllllIllllIIIlllIIIlllIll.getY()) && lIIIIllIIIlIlIlI(llllllllllllIllllIIIlllIIlIlIIIl.getBlockState(llllllllllllIllllIIIlllIIIlllIll.down()).getBlock().getMaterial().isSolid() ? 1 : 0)) {
                        llllllllllllIllllIIIlllIIlIlIIIl.setBlockToAir(llllllllllllIllllIIIlllIIIlllIll);
                        "".length();
                        "".length();
                        if (" ".length() < " ".length()) {
                            return ((0xA3 ^ 0xC2) & ~(0x9 ^ 0x68)) != 0x0;
                        }
                    }
                    else if (lIIIIllIIIlIllII(llllllllllllIllllIIIlllIIlIlIIIl.getBlockState(llllllllllllIllllIIIlllIIIlllIll).getBlock().getMaterial().isSolid() ? 1 : 0) && lIIIIllIIIllIIII(llllllllllllIllllIIIlllIIlIlIIIl.getBlockState(llllllllllllIllllIIIlllIIIlllIll).getBlock(), Blocks.chest)) {
                        if (lIIIIllIIIlIlIIl(llllllllllllIllllIIIlllIIIllllIl, WorldGenDungeons.lIlllllllIlIIl[16]) && lIIIIllIIIlIllII(llllllllllllIllllIIIlllIIlIlIIII.nextInt(WorldGenDungeons.lIlllllllIlIIl[0]))) {
                            llllllllllllIllllIIIlllIIlIlIIIl.setBlockState(llllllllllllIllllIIIlllIIIlllIll, Blocks.mossy_cobblestone.getDefaultState(), WorldGenDungeons.lIlllllllIlIIl[3]);
                            "".length();
                            "".length();
                            if (-"  ".length() > 0) {
                                return ((149 + 96 - 244 + 157 ^ 48 + 184 - 156 + 118) & (81 + 64 + 59 + 31 ^ 146 + 144 - 147 + 40 ^ -" ".length())) != 0x0;
                            }
                        }
                        else {
                            llllllllllllIllllIIIlllIIlIlIIIl.setBlockState(llllllllllllIllllIIIlllIIIlllIll, Blocks.cobblestone.getDefaultState(), WorldGenDungeons.lIlllllllIlIIl[3]);
                            "".length();
                        }
                    }
                    ++llllllllllllIllllIIIlllIIIllllII;
                }
                --llllllllllllIllllIIIlllIIIllllIl;
            }
            ++llllllllllllIllllIIIlllIIIlllllI;
        }
        int llllllllllllIllllIIIlllIIIlllIlI = WorldGenDungeons.lIlllllllIlIIl[1];
        "".length();
        if (((0x8C ^ 0xA5) & ~(0x9F ^ 0xB6)) > "   ".length()) {
            return ((0x83 ^ 0x87) & ~(0x72 ^ 0x76)) != 0x0;
        }
        while (!lIIIIllIIIlIlllI(llllllllllllIllllIIIlllIIIlllIlI, WorldGenDungeons.lIlllllllIlIIl[3])) {
            int llllllllllllIllllIIIlllIIIlllIIl = WorldGenDungeons.lIlllllllIlIIl[1];
            "".length();
            if (((0xE9 ^ 0xB9) & ~(0xD9 ^ 0x89)) != 0x0) {
                return ((0x62 ^ 0x35) & ~(0xEA ^ 0xBD)) != 0x0;
            }
            while (!lIIIIllIIIlIlllI(llllllllllllIllllIIIlllIIIlllIIl, WorldGenDungeons.lIlllllllIlIIl[4])) {
                final int llllllllllllIllllIIIlllIIIlllIII = llllllllllllIllllIIIlllIIIlIllII.getX() + llllllllllllIllllIIIlllIIlIlIIII.nextInt(llllllllllllIllllIIIlllIIlIIllIl * WorldGenDungeons.lIlllllllIlIIl[3] + WorldGenDungeons.lIlllllllIlIIl[2]) - llllllllllllIllllIIIlllIIlIIllIl;
                final int llllllllllllIllllIIIlllIIIllIlll = llllllllllllIllllIIIlllIIIlIllII.getY();
                final int llllllllllllIllllIIIlllIIIllIllI = llllllllllllIllllIIIlllIIIlIllII.getZ() + llllllllllllIllllIIIlllIIlIlIIII.nextInt(llllllllllllIllllIIIlllIIlIIlIII * WorldGenDungeons.lIlllllllIlIIl[3] + WorldGenDungeons.lIlllllllIlIIl[2]) - llllllllllllIllllIIIlllIIlIIlIII;
                final BlockPos llllllllllllIllllIIIlllIIIllIlIl = new BlockPos(llllllllllllIllllIIIlllIIIlllIII, llllllllllllIllllIIIlllIIIllIlll, llllllllllllIllllIIIlllIIIllIllI);
                if (lIIIIllIIIlIllII(llllllllllllIllllIIIlllIIlIlIIIl.isAirBlock(llllllllllllIllllIIIlllIIIllIlIl) ? 1 : 0)) {
                    int llllllllllllIllllIIIlllIIIllIlII = WorldGenDungeons.lIlllllllIlIIl[1];
                    final long llllllllllllIllllIIIlllIIIIllIIl = (long)EnumFacing.Plane.HORIZONTAL.iterator();
                    "".length();
                    if (((0x13 ^ 0x39) & ~(0x7D ^ 0x57)) != ((0x56 ^ 0x51) & ~(0x15 ^ 0x12))) {
                        return ((0x9A ^ 0x91) & ~(0xB7 ^ 0xBC)) != 0x0;
                    }
                    while (!lIIIIllIIIlIlIlI(((Iterator)llllllllllllIllllIIIlllIIIIllIIl).hasNext() ? 1 : 0)) {
                        final EnumFacing llllllllllllIllllIIIlllIIIllIIll = ((Iterator<EnumFacing>)llllllllllllIllllIIIlllIIIIllIIl).next();
                        if (lIIIIllIIIlIllII(llllllllllllIllllIIIlllIIlIlIIIl.getBlockState(llllllllllllIllllIIIlllIIIllIlIl.offset(llllllllllllIllllIIIlllIIIllIIll)).getBlock().getMaterial().isSolid() ? 1 : 0)) {
                            ++llllllllllllIllllIIIlllIIIllIlII;
                        }
                    }
                    if (lIIIIllIIIlIlIIl(llllllllllllIllllIIIlllIIIllIlII, WorldGenDungeons.lIlllllllIlIIl[2])) {
                        llllllllllllIllllIIIlllIIlIlIIIl.setBlockState(llllllllllllIllllIIIlllIIIllIlIl, Blocks.chest.correctFacing(llllllllllllIllllIIIlllIIlIlIIIl, llllllllllllIllllIIIlllIIIllIlIl, Blocks.chest.getDefaultState()), WorldGenDungeons.lIlllllllIlIIl[3]);
                        "".length();
                        final List<WeightedRandomChestContent> chestcontent = WorldGenDungeons.CHESTCONTENT;
                        final WeightedRandomChestContent[] llllllllllllIlIlllIIlllIllIIIlIl = new WeightedRandomChestContent[WorldGenDungeons.lIlllllllIlIIl[2]];
                        llllllllllllIlIlllIIlllIllIIIlIl[WorldGenDungeons.lIlllllllIlIIl[1]] = Items.enchanted_book.getRandom(llllllllllllIllllIIIlllIIlIlIIII);
                        final List<WeightedRandomChestContent> llllllllllllIllllIIIlllIIIllIIlI = WeightedRandomChestContent.func_177629_a(chestcontent, llllllllllllIlIlllIIlllIllIIIlIl);
                        final TileEntity llllllllllllIllllIIIlllIIIllIIIl = llllllllllllIllllIIIlllIIlIlIIIl.getTileEntity(llllllllllllIllllIIIlllIIIllIlIl);
                        if (!lIIIIllIIIlIllII((llllllllllllIllllIIIlllIIIllIIIl instanceof TileEntityChest) ? 1 : 0)) {
                            break;
                        }
                        WeightedRandomChestContent.generateChestContents(llllllllllllIllllIIIlllIIlIlIIII, llllllllllllIllllIIIlllIIIllIIlI, (IInventory)llllllllllllIllllIIIlllIIIllIIIl, WorldGenDungeons.lIlllllllIlIIl[10]);
                        "".length();
                        if ("  ".length() < 0) {
                            return ((0x72 ^ 0x62) & ~(0x41 ^ 0x51)) != 0x0;
                        }
                        break;
                    }
                }
                ++llllllllllllIllllIIIlllIIIlllIIl;
            }
            ++llllllllllllIllllIIIlllIIIlllIlI;
        }
        llllllllllllIllllIIIlllIIlIlIIIl.setBlockState(llllllllllllIllllIIIlllIIIlIllII, Blocks.mob_spawner.getDefaultState(), WorldGenDungeons.lIlllllllIlIIl[3]);
        "".length();
        final TileEntity llllllllllllIllllIIIlllIIIllIIII = llllllllllllIllllIIIlllIIlIlIIIl.getTileEntity(llllllllllllIllllIIIlllIIIlIllII);
        if (lIIIIllIIIlIllII((llllllllllllIllllIIIlllIIIllIIII instanceof TileEntityMobSpawner) ? 1 : 0)) {
            ((TileEntityMobSpawner)llllllllllllIllllIIIlllIIIllIIII).getSpawnerBaseLogic().setEntityName(this.pickMobSpawner(llllllllllllIllllIIIlllIIlIlIIII));
            "".length();
            if (((0x65 ^ 0x2D) & ~(0x62 ^ 0x2A)) < 0) {
                return ("   ".length() & ~"   ".length()) != 0x0;
            }
        }
        else {
            WorldGenDungeons.field_175918_a.error(String.valueOf(new StringBuilder(WorldGenDungeons.lIllllllIlllIl[WorldGenDungeons.lIlllllllIlIIl[0]]).append(llllllllllllIllllIIIlllIIIlIllII.getX()).append(WorldGenDungeons.lIllllllIlllIl[WorldGenDungeons.lIlllllllIlIIl[7]]).append(llllllllllllIllllIIIlllIIIlIllII.getY()).append(WorldGenDungeons.lIllllllIlllIl[WorldGenDungeons.lIlllllllIlIIl[8]]).append(llllllllllllIllllIIIlllIIIlIllII.getZ()).append(WorldGenDungeons.lIllllllIlllIl[WorldGenDungeons.lIlllllllIlIIl[9]])));
        }
        return WorldGenDungeons.lIlllllllIlIIl[2] != 0;
    }
    
    private static boolean lIIIIllIIIlIllIl(final int llllllllllllIllllIIIllIlllIlIIII, final int llllllllllllIllllIIIllIlllIIllll) {
        return llllllllllllIllllIIIllIlllIlIIII > llllllllllllIllllIIIllIlllIIllll;
    }
    
    private static void lIIIIllIIIIIIIIl() {
        (lIllllllIlllIl = new String[WorldGenDungeons.lIlllllllIlIIl[10]])[WorldGenDungeons.lIlllllllIlIIl[1]] = lIIIIlIllllllllI("FUaXSMoJamTD3hipZzHV1A==", "OTvDg");
        WorldGenDungeons.lIllllllIlllIl[WorldGenDungeons.lIlllllllIlIIl[2]] = lIIIIlIlllllllll("GBUpDgQn", "BzDlm");
        WorldGenDungeons.lIllllllIlllIl[WorldGenDungeons.lIlllllllIlIIl[3]] = lIIIIlIlllllllll("AgE1IS89", "XnXCF");
        WorldGenDungeons.lIllllllIlllIl[WorldGenDungeons.lIlllllllIlIIl[4]] = lIIIIllIIIIIIIII("OZAe11TzX8o=", "ixyYW");
        WorldGenDungeons.lIllllllIlllIl[WorldGenDungeons.lIlllllllIlIIl[0]] = lIIIIlIllllllllI("oxvnrqk5e6pYP/ahZZif879a1PsLIndlNRLE8kEFp+oq72wSQToPog==", "lfLoO");
        WorldGenDungeons.lIllllllIlllIl[WorldGenDungeons.lIlllllllIlIIl[7]] = lIIIIlIlllllllll("SkQ=", "fduFL");
        WorldGenDungeons.lIllllllIlllIl[WorldGenDungeons.lIlllllllIlIIl[8]] = lIIIIlIlllllllll("Qk8=", "noPCR");
        WorldGenDungeons.lIllllllIlllIl[WorldGenDungeons.lIlllllllIlIIl[9]] = lIIIIllIIIIIIIII("xMtT8Hb9hgs=", "JliQE");
    }
    
    private static String lIIIIllIIIIIIIII(final String llllllllllllIllllIIIlllIIIIIlIll, final String llllllllllllIllllIIIlllIIIIIlIlI) {
        try {
            final SecretKeySpec llllllllllllIllllIIIlllIIIIlIIII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIllllIIIlllIIIIIlIlI.getBytes(StandardCharsets.UTF_8)), WorldGenDungeons.lIlllllllIlIIl[10]), "DES");
            final Cipher llllllllllllIllllIIIlllIIIIIllll = Cipher.getInstance("DES");
            llllllllllllIllllIIIlllIIIIIllll.init(WorldGenDungeons.lIlllllllIlIIl[3], llllllllllllIllllIIIlllIIIIlIIII);
            return new String(llllllllllllIllllIIIlllIIIIIllll.doFinal(Base64.getDecoder().decode(llllllllllllIllllIIIlllIIIIIlIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIllllIIIlllIIIIIlllI) {
            llllllllllllIllllIIIlllIIIIIlllI.printStackTrace();
            return null;
        }
    }
    
    private static boolean lIIIIllIIIlIlllI(final int llllllllllllIllllIIIllIlllIlllII, final int llllllllllllIllllIIIllIlllIllIll) {
        return llllllllllllIllllIIIllIlllIlllII >= llllllllllllIllllIIIllIlllIllIll;
    }
    
    private static boolean lIIIIllIIIlIlIll(final int llllllllllllIllllIIIllIlllIIIIlI, final int llllllllllllIllllIIIllIlllIIIIIl) {
        return llllllllllllIllllIIIllIlllIIIIlI != llllllllllllIllllIIIllIlllIIIIIl;
    }
    
    static {
        lIIIIllIIIlIlIII();
        lIIIIllIIIIIIIIl();
        field_175918_a = LogManager.getLogger();
        final String[] spawnertypes = new String[WorldGenDungeons.lIlllllllIlIIl[0]];
        spawnertypes[WorldGenDungeons.lIlllllllIlIIl[1]] = WorldGenDungeons.lIllllllIlllIl[WorldGenDungeons.lIlllllllIlIIl[1]];
        spawnertypes[WorldGenDungeons.lIlllllllIlIIl[2]] = WorldGenDungeons.lIllllllIlllIl[WorldGenDungeons.lIlllllllIlIIl[2]];
        spawnertypes[WorldGenDungeons.lIlllllllIlIIl[3]] = WorldGenDungeons.lIllllllIlllIl[WorldGenDungeons.lIlllllllIlIIl[3]];
        spawnertypes[WorldGenDungeons.lIlllllllIlIIl[4]] = WorldGenDungeons.lIllllllIlllIl[WorldGenDungeons.lIlllllllIlIIl[4]];
        SPAWNERTYPES = spawnertypes;
        final WeightedRandomChestContent[] array = new WeightedRandomChestContent[WorldGenDungeons.lIlllllllIlIIl[5]];
        array[WorldGenDungeons.lIlllllllIlIIl[1]] = new WeightedRandomChestContent(Items.saddle, WorldGenDungeons.lIlllllllIlIIl[1], WorldGenDungeons.lIlllllllIlIIl[2], WorldGenDungeons.lIlllllllIlIIl[2], WorldGenDungeons.lIlllllllIlIIl[6]);
        array[WorldGenDungeons.lIlllllllIlIIl[2]] = new WeightedRandomChestContent(Items.iron_ingot, WorldGenDungeons.lIlllllllIlIIl[1], WorldGenDungeons.lIlllllllIlIIl[2], WorldGenDungeons.lIlllllllIlIIl[0], WorldGenDungeons.lIlllllllIlIIl[6]);
        array[WorldGenDungeons.lIlllllllIlIIl[3]] = new WeightedRandomChestContent(Items.bread, WorldGenDungeons.lIlllllllIlIIl[1], WorldGenDungeons.lIlllllllIlIIl[2], WorldGenDungeons.lIlllllllIlIIl[2], WorldGenDungeons.lIlllllllIlIIl[6]);
        array[WorldGenDungeons.lIlllllllIlIIl[4]] = new WeightedRandomChestContent(Items.wheat, WorldGenDungeons.lIlllllllIlIIl[1], WorldGenDungeons.lIlllllllIlIIl[2], WorldGenDungeons.lIlllllllIlIIl[0], WorldGenDungeons.lIlllllllIlIIl[6]);
        array[WorldGenDungeons.lIlllllllIlIIl[0]] = new WeightedRandomChestContent(Items.gunpowder, WorldGenDungeons.lIlllllllIlIIl[1], WorldGenDungeons.lIlllllllIlIIl[2], WorldGenDungeons.lIlllllllIlIIl[0], WorldGenDungeons.lIlllllllIlIIl[6]);
        array[WorldGenDungeons.lIlllllllIlIIl[7]] = new WeightedRandomChestContent(Items.string, WorldGenDungeons.lIlllllllIlIIl[1], WorldGenDungeons.lIlllllllIlIIl[2], WorldGenDungeons.lIlllllllIlIIl[0], WorldGenDungeons.lIlllllllIlIIl[6]);
        array[WorldGenDungeons.lIlllllllIlIIl[8]] = new WeightedRandomChestContent(Items.bucket, WorldGenDungeons.lIlllllllIlIIl[1], WorldGenDungeons.lIlllllllIlIIl[2], WorldGenDungeons.lIlllllllIlIIl[2], WorldGenDungeons.lIlllllllIlIIl[6]);
        array[WorldGenDungeons.lIlllllllIlIIl[9]] = new WeightedRandomChestContent(Items.golden_apple, WorldGenDungeons.lIlllllllIlIIl[1], WorldGenDungeons.lIlllllllIlIIl[2], WorldGenDungeons.lIlllllllIlIIl[2], WorldGenDungeons.lIlllllllIlIIl[2]);
        array[WorldGenDungeons.lIlllllllIlIIl[10]] = new WeightedRandomChestContent(Items.redstone, WorldGenDungeons.lIlllllllIlIIl[1], WorldGenDungeons.lIlllllllIlIIl[2], WorldGenDungeons.lIlllllllIlIIl[0], WorldGenDungeons.lIlllllllIlIIl[6]);
        array[WorldGenDungeons.lIlllllllIlIIl[11]] = new WeightedRandomChestContent(Items.record_13, WorldGenDungeons.lIlllllllIlIIl[1], WorldGenDungeons.lIlllllllIlIIl[2], WorldGenDungeons.lIlllllllIlIIl[2], WorldGenDungeons.lIlllllllIlIIl[0]);
        array[WorldGenDungeons.lIlllllllIlIIl[6]] = new WeightedRandomChestContent(Items.record_cat, WorldGenDungeons.lIlllllllIlIIl[1], WorldGenDungeons.lIlllllllIlIIl[2], WorldGenDungeons.lIlllllllIlIIl[2], WorldGenDungeons.lIlllllllIlIIl[0]);
        array[WorldGenDungeons.lIlllllllIlIIl[12]] = new WeightedRandomChestContent(Items.name_tag, WorldGenDungeons.lIlllllllIlIIl[1], WorldGenDungeons.lIlllllllIlIIl[2], WorldGenDungeons.lIlllllllIlIIl[2], WorldGenDungeons.lIlllllllIlIIl[6]);
        array[WorldGenDungeons.lIlllllllIlIIl[13]] = new WeightedRandomChestContent(Items.golden_horse_armor, WorldGenDungeons.lIlllllllIlIIl[1], WorldGenDungeons.lIlllllllIlIIl[2], WorldGenDungeons.lIlllllllIlIIl[2], WorldGenDungeons.lIlllllllIlIIl[3]);
        array[WorldGenDungeons.lIlllllllIlIIl[14]] = new WeightedRandomChestContent(Items.iron_horse_armor, WorldGenDungeons.lIlllllllIlIIl[1], WorldGenDungeons.lIlllllllIlIIl[2], WorldGenDungeons.lIlllllllIlIIl[2], WorldGenDungeons.lIlllllllIlIIl[7]);
        array[WorldGenDungeons.lIlllllllIlIIl[15]] = new WeightedRandomChestContent(Items.diamond_horse_armor, WorldGenDungeons.lIlllllllIlIIl[1], WorldGenDungeons.lIlllllllIlIIl[2], WorldGenDungeons.lIlllllllIlIIl[2], WorldGenDungeons.lIlllllllIlIIl[2]);
        CHESTCONTENT = Lists.newArrayList((Object[])array);
    }
    
    private static boolean lIIIIllIIIllIIIl(final int llllllllllllIllllIIIllIlllIIIlIl) {
        return llllllllllllIllllIIIllIlllIIIlIl >= 0;
    }
    
    private static String lIIIIlIllllllllI(final String llllllllllllIllllIIIllIllllIIllI, final String llllllllllllIllllIIIllIllllIIlIl) {
        try {
            final SecretKeySpec llllllllllllIllllIIIllIllllIlIll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIllllIIIllIllllIIlIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher llllllllllllIllllIIIllIllllIlIlI = Cipher.getInstance("Blowfish");
            llllllllllllIllllIIIllIllllIlIlI.init(WorldGenDungeons.lIlllllllIlIIl[3], llllllllllllIllllIIIllIllllIlIll);
            return new String(llllllllllllIllllIIIllIllllIlIlI.doFinal(Base64.getDecoder().decode(llllllllllllIllllIIIllIllllIIllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIllllIIIllIllllIlIIl) {
            llllllllllllIllllIIIllIllllIlIIl.printStackTrace();
            return null;
        }
    }
    
    private static boolean lIIIIllIIIlIllll(final int llllllllllllIllllIIIllIlllIlIlII, final int llllllllllllIllllIIIllIlllIlIIll) {
        return llllllllllllIllllIIIllIlllIlIlII <= llllllllllllIllllIIIllIlllIlIIll;
    }
}
