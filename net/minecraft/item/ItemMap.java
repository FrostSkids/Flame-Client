// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.item;

import net.minecraft.network.Packet;
import java.util.Arrays;
import net.minecraft.world.WorldSavedData;
import net.minecraft.init.Items;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.security.MessageDigest;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.List;
import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;
import net.minecraft.world.chunk.Chunk;
import com.google.common.collect.Iterables;
import com.google.common.collect.Multiset;
import com.google.common.collect.Multisets;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.BlockStone;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.BlockDirt;
import net.minecraft.init.Blocks;
import net.minecraft.util.BlockPos;
import com.google.common.collect.HashMultiset;
import net.minecraft.util.MathHelper;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.storage.MapData;
import net.minecraft.entity.Entity;
import net.minecraft.world.World;

public class ItemMap extends ItemMapBase
{
    private static final /* synthetic */ int[] lIlIIlIlllllII;
    private static final /* synthetic */ String[] lIlIIlIlllIlll;
    
    private static boolean lllIIlllIIlIIlI(final int lllllllllllllIIIllIlIIlllIIlIlIl, final int lllllllllllllIIIllIlIIlllIIlIlII) {
        return lllllllllllllIIIllIlIIlllIIlIlIl < lllllllllllllIIIllIlIIlllIIlIlII;
    }
    
    public void updateMapData(final World lllllllllllllIIIllIlIlIIIIllIIll, final Entity lllllllllllllIIIllIlIlIIIIllIIlI, final MapData lllllllllllllIIIllIlIlIIIlIlIlll) {
        if (lllIIlllIIIllIl(lllllllllllllIIIllIlIlIIIIllIIll.provider.getDimensionId(), lllllllllllllIIIllIlIlIIIlIlIlll.dimension) && lllIIlllIIIlllI((lllllllllllllIIIllIlIlIIIIllIIlI instanceof EntityPlayer) ? 1 : 0)) {
            final int lllllllllllllIIIllIlIlIIIlIlIllI = ItemMap.lIlIIlIlllllII[0] << lllllllllllllIIIllIlIlIIIlIlIlll.scale;
            final int lllllllllllllIIIllIlIlIIIlIlIlIl = lllllllllllllIIIllIlIlIIIlIlIlll.xCenter;
            final int lllllllllllllIIIllIlIlIIIlIlIlII = lllllllllllllIIIllIlIlIIIlIlIlll.zCenter;
            final int lllllllllllllIIIllIlIlIIIlIlIIll = MathHelper.floor_double(lllllllllllllIIIllIlIlIIIIllIIlI.posX - lllllllllllllIIIllIlIlIIIlIlIlIl) / lllllllllllllIIIllIlIlIIIlIlIllI + ItemMap.lIlIIlIlllllII[4];
            final int lllllllllllllIIIllIlIlIIIlIlIIlI = MathHelper.floor_double(lllllllllllllIIIllIlIlIIIIllIIlI.posZ - lllllllllllllIIIllIlIlIIIlIlIlII) / lllllllllllllIIIllIlIlIIIlIlIllI + ItemMap.lIlIIlIlllllII[4];
            int lllllllllllllIIIllIlIlIIIlIlIIIl = ItemMap.lIlIIlIlllllII[5] / lllllllllllllIIIllIlIlIIIlIlIllI;
            if (lllIIlllIIIlllI(lllllllllllllIIIllIlIlIIIIllIIll.provider.getHasNoSky() ? 1 : 0)) {
                lllllllllllllIIIllIlIlIIIlIlIIIl /= ItemMap.lIlIIlIlllllII[2];
            }
            final MapData.MapInfo mapInfo;
            final MapData.MapInfo lllllllllllllIIIllIlIlIIIlIlIIII = mapInfo = lllllllllllllIIIllIlIlIIIlIlIlll.getMapInfo((EntityPlayer)lllllllllllllIIIllIlIlIIIIllIIlI);
            mapInfo.field_82569_d += ItemMap.lIlIIlIlllllII[0];
            boolean lllllllllllllIIIllIlIlIIIlIIllll = ItemMap.lIlIIlIlllllII[1] != 0;
            int lllllllllllllIIIllIlIlIIIlIIlllI = lllllllllllllIIIllIlIlIIIlIlIIll - lllllllllllllIIIllIlIlIIIlIlIIIl + ItemMap.lIlIIlIlllllII[0];
            "".length();
            if ("   ".length() >= (0x1D ^ 0x19)) {
                return;
            }
            while (!lllIIlllIIlIIIl(lllllllllllllIIIllIlIlIIIlIIlllI, lllllllllllllIIIllIlIlIIIlIlIIll + lllllllllllllIIIllIlIlIIIlIlIIIl)) {
                if (!lllIIlllIIIllll(lllllllllllllIIIllIlIlIIIlIIlllI & ItemMap.lIlIIlIlllllII[6], lllllllllllllIIIllIlIlIIIlIlIIII.field_82569_d & ItemMap.lIlIIlIlllllII[6]) || lllIIlllIIIlllI(lllllllllllllIIIllIlIlIIIlIIllll ? 1 : 0)) {
                    lllllllllllllIIIllIlIlIIIlIIllll = (ItemMap.lIlIIlIlllllII[1] != 0);
                    double lllllllllllllIIIllIlIlIIIlIIllIl = 0.0;
                    int lllllllllllllIIIllIlIlIIIlIIllII = lllllllllllllIIIllIlIlIIIlIlIIlI - lllllllllllllIIIllIlIlIIIlIlIIIl - ItemMap.lIlIIlIlllllII[0];
                    "".length();
                    if ("  ".length() < " ".length()) {
                        return;
                    }
                    while (!lllIIlllIIlIIIl(lllllllllllllIIIllIlIlIIIlIIllII, lllllllllllllIIIllIlIlIIIlIlIIlI + lllllllllllllIIIllIlIlIIIlIlIIIl)) {
                        if (lllIIlllIIlIIII(lllllllllllllIIIllIlIlIIIlIIlllI) && lllIIlllIIlIIIl(lllllllllllllIIIllIlIlIIIlIIllII, ItemMap.lIlIIlIlllllII[7]) && lllIIlllIIlIIlI(lllllllllllllIIIllIlIlIIIlIIlllI, ItemMap.lIlIIlIlllllII[5]) && lllIIlllIIlIIlI(lllllllllllllIIIllIlIlIIIlIIllII, ItemMap.lIlIIlIlllllII[5])) {
                            final int lllllllllllllIIIllIlIlIIIlIIlIll = lllllllllllllIIIllIlIlIIIlIIlllI - lllllllllllllIIIllIlIlIIIlIlIIll;
                            final int lllllllllllllIIIllIlIlIIIlIIlIlI = lllllllllllllIIIllIlIlIIIlIIllII - lllllllllllllIIIllIlIlIIIlIlIIlI;
                            int n;
                            if (lllIIlllIIlIIll(lllllllllllllIIIllIlIlIIIlIIlIll * lllllllllllllIIIllIlIlIIIlIIlIll + lllllllllllllIIIllIlIlIIIlIIlIlI * lllllllllllllIIIllIlIlIIIlIIlIlI, (lllllllllllllIIIllIlIlIIIlIlIIIl - ItemMap.lIlIIlIlllllII[2]) * (lllllllllllllIIIllIlIlIIIlIlIIIl - ItemMap.lIlIIlIlllllII[2]))) {
                                n = ItemMap.lIlIIlIlllllII[0];
                                "".length();
                                if ("  ".length() >= "   ".length()) {
                                    return;
                                }
                            }
                            else {
                                n = ItemMap.lIlIIlIlllllII[1];
                            }
                            final boolean lllllllllllllIIIllIlIlIIIlIIlIIl = n != 0;
                            final int lllllllllllllIIIllIlIlIIIlIIlIII = (lllllllllllllIIIllIlIlIIIlIlIlIl / lllllllllllllIIIllIlIlIIIlIlIllI + lllllllllllllIIIllIlIlIIIlIIlllI - ItemMap.lIlIIlIlllllII[4]) * lllllllllllllIIIllIlIlIIIlIlIllI;
                            final int lllllllllllllIIIllIlIlIIIlIIIlll = (lllllllllllllIIIllIlIlIIIlIlIlII / lllllllllllllIIIllIlIlIIIlIlIllI + lllllllllllllIIIllIlIlIIIlIIllII - ItemMap.lIlIIlIlllllII[4]) * lllllllllllllIIIllIlIlIIIlIlIllI;
                            final Multiset<MapColor> lllllllllllllIIIllIlIlIIIlIIIllI = (Multiset<MapColor>)HashMultiset.create();
                            final Chunk lllllllllllllIIIllIlIlIIIlIIIlIl = lllllllllllllIIIllIlIlIIIIllIIll.getChunkFromBlockCoords(new BlockPos(lllllllllllllIIIllIlIlIIIlIIlIII, ItemMap.lIlIIlIlllllII[1], lllllllllllllIIIllIlIlIIIlIIIlll));
                            if (lllIIlllIIIlIlI(lllllllllllllIIIllIlIlIIIlIIIlIl.isEmpty() ? 1 : 0)) {
                                final int lllllllllllllIIIllIlIlIIIlIIIlII = lllllllllllllIIIllIlIlIIIlIIlIII & ItemMap.lIlIIlIlllllII[6];
                                final int lllllllllllllIIIllIlIlIIIlIIIIll = lllllllllllllIIIllIlIlIIIlIIIlll & ItemMap.lIlIIlIlllllII[6];
                                int lllllllllllllIIIllIlIlIIIlIIIIlI = ItemMap.lIlIIlIlllllII[1];
                                double lllllllllllllIIIllIlIlIIIlIIIIIl = 0.0;
                                if (lllIIlllIIIlllI(lllllllllllllIIIllIlIlIIIIllIIll.provider.getHasNoSky() ? 1 : 0)) {
                                    int lllllllllllllIIIllIlIlIIIlIIIIII = lllllllllllllIIIllIlIlIIIlIIlIII + lllllllllllllIIIllIlIlIIIlIIIlll * ItemMap.lIlIIlIlllllII[8];
                                    lllllllllllllIIIllIlIlIIIlIIIIII = lllllllllllllIIIllIlIlIIIlIIIIII * lllllllllllllIIIllIlIlIIIlIIIIII * ItemMap.lIlIIlIlllllII[9] + lllllllllllllIIIllIlIlIIIlIIIIII * ItemMap.lIlIIlIlllllII[10];
                                    if (lllIIlllIIIlIlI(lllllllllllllIIIllIlIlIIIlIIIIII >> ItemMap.lIlIIlIlllllII[11] & ItemMap.lIlIIlIlllllII[0])) {
                                        lllllllllllllIIIllIlIlIIIlIIIllI.add((Object)Blocks.dirt.getMapColor(Blocks.dirt.getDefaultState().withProperty(BlockDirt.VARIANT, BlockDirt.DirtType.DIRT)), ItemMap.lIlIIlIlllllII[12]);
                                        "".length();
                                        "".length();
                                        if (null != null) {
                                            return;
                                        }
                                    }
                                    else {
                                        lllllllllllllIIIllIlIlIIIlIIIllI.add((Object)Blocks.stone.getMapColor(Blocks.stone.getDefaultState().withProperty(BlockStone.VARIANT, BlockStone.EnumType.STONE)), ItemMap.lIlIIlIlllllII[13]);
                                        "".length();
                                    }
                                    lllllllllllllIIIllIlIlIIIlIIIIIl = 100.0;
                                    "".length();
                                    if (-(0x55 ^ 0x51) > 0) {
                                        return;
                                    }
                                }
                                else {
                                    final BlockPos.MutableBlockPos lllllllllllllIIIllIlIlIIIIllllll = new BlockPos.MutableBlockPos();
                                    int lllllllllllllIIIllIlIlIIIIlllllI = ItemMap.lIlIIlIlllllII[1];
                                    "".length();
                                    if ("  ".length() != "  ".length()) {
                                        return;
                                    }
                                    while (!lllIIlllIIlIIIl(lllllllllllllIIIllIlIlIIIIlllllI, lllllllllllllIIIllIlIlIIIlIlIllI)) {
                                        int lllllllllllllIIIllIlIlIIIIllllIl = ItemMap.lIlIIlIlllllII[1];
                                        "".length();
                                        if (" ".length() == -" ".length()) {
                                            return;
                                        }
                                        while (!lllIIlllIIlIIIl(lllllllllllllIIIllIlIlIIIIllllIl, lllllllllllllIIIllIlIlIIIlIlIllI)) {
                                            int lllllllllllllIIIllIlIlIIIIllllII = lllllllllllllIIIllIlIlIIIlIIIlIl.getHeightValue(lllllllllllllIIIllIlIlIIIIlllllI + lllllllllllllIIIllIlIlIIIlIIIlII, lllllllllllllIIIllIlIlIIIIllllIl + lllllllllllllIIIllIlIlIIIlIIIIll) + ItemMap.lIlIIlIlllllII[0];
                                            IBlockState lllllllllllllIIIllIlIlIIIIlllIll = Blocks.air.getDefaultState();
                                            if (lllIIlllIIlIIll(lllllllllllllIIIllIlIlIIIIllllII, ItemMap.lIlIIlIlllllII[0])) {
                                                do {
                                                    --lllllllllllllIIIllIlIlIIIIllllII;
                                                    lllllllllllllIIIllIlIlIIIIlllIll = lllllllllllllIIIllIlIlIIIlIIIlIl.getBlockState(lllllllllllllIIIllIlIlIIIIllllll.func_181079_c(lllllllllllllIIIllIlIlIIIIlllllI + lllllllllllllIIIllIlIlIIIlIIIlII, lllllllllllllIIIllIlIlIIIIllllII, lllllllllllllIIIllIlIlIIIIllllIl + lllllllllllllIIIllIlIlIIIlIIIIll));
                                                } while (lllIIlllIIlIlII(lllllllllllllIIIllIlIlIIIIlllIll.getBlock().getMapColor(lllllllllllllIIIllIlIlIIIIlllIll), MapColor.airColor) && !lllIIlllIIlIlIl(lllllllllllllIIIllIlIlIIIIllllII));
                                                if (lllIIlllIIlIllI(lllllllllllllIIIllIlIlIIIIllllII) && lllIIlllIIIlllI(lllllllllllllIIIllIlIlIIIIlllIll.getBlock().getMaterial().isLiquid() ? 1 : 0)) {
                                                    int lllllllllllllIIIllIlIlIIIIlllIlI = lllllllllllllIIIllIlIlIIIIllllII - ItemMap.lIlIIlIlllllII[0];
                                                    Block lllllllllllllIIIllIlIlIIIIlllIIl;
                                                    do {
                                                        lllllllllllllIIIllIlIlIIIIlllIIl = lllllllllllllIIIllIlIlIIIlIIIlIl.getBlock(lllllllllllllIIIllIlIlIIIIlllllI + lllllllllllllIIIllIlIlIIIlIIIlII, lllllllllllllIIIllIlIlIIIIlllIlI--, lllllllllllllIIIllIlIlIIIIllllIl + lllllllllllllIIIllIlIlIIIlIIIIll);
                                                        ++lllllllllllllIIIllIlIlIIIlIIIIlI;
                                                    } while (lllIIlllIIlIllI(lllllllllllllIIIllIlIlIIIIlllIlI) && !lllIIlllIIIlIlI(lllllllllllllIIIllIlIlIIIIlllIIl.getMaterial().isLiquid() ? 1 : 0));
                                                }
                                            }
                                            lllllllllllllIIIllIlIlIIIlIIIIIl += lllllllllllllIIIllIlIlIIIIllllII / (double)(lllllllllllllIIIllIlIlIIIlIlIllI * lllllllllllllIIIllIlIlIIIlIlIllI);
                                            lllllllllllllIIIllIlIlIIIlIIIllI.add((Object)lllllllllllllIIIllIlIlIIIIlllIll.getBlock().getMapColor(lllllllllllllIIIllIlIlIIIIlllIll));
                                            "".length();
                                            ++lllllllllllllIIIllIlIlIIIIllllIl;
                                        }
                                        ++lllllllllllllIIIllIlIlIIIIlllllI;
                                    }
                                }
                                lllllllllllllIIIllIlIlIIIlIIIIlI /= lllllllllllllIIIllIlIlIIIlIlIllI * lllllllllllllIIIllIlIlIIIlIlIllI;
                                double lllllllllllllIIIllIlIlIIIIlllIII = (lllllllllllllIIIllIlIlIIIlIIIIIl - lllllllllllllIIIllIlIlIIIlIIllIl) * 4.0 / (lllllllllllllIIIllIlIlIIIlIlIllI + ItemMap.lIlIIlIlllllII[14]) + ((lllllllllllllIIIllIlIlIIIlIIlllI + lllllllllllllIIIllIlIlIIIlIIllII & ItemMap.lIlIIlIlllllII[0]) - 0.5) * 0.4;
                                int lllllllllllllIIIllIlIlIIIIllIlll = ItemMap.lIlIIlIlllllII[0];
                                if (lllIIlllIIlIllI(lllIIlllIIIlIll(lllllllllllllIIIllIlIlIIIIlllIII, 0.6))) {
                                    lllllllllllllIIIllIlIlIIIIllIlll = ItemMap.lIlIIlIlllllII[2];
                                }
                                if (lllIIlllIIlIlll(lllIIlllIIIllII(lllllllllllllIIIllIlIlIIIIlllIII, -0.6))) {
                                    lllllllllllllIIIllIlIlIIIIllIlll = ItemMap.lIlIIlIlllllII[1];
                                }
                                final MapColor lllllllllllllIIIllIlIlIIIIllIllI = (MapColor)Iterables.getFirst((Iterable)Multisets.copyHighestCountFirst((Multiset)lllllllllllllIIIllIlIlIIIlIIIllI), (Object)MapColor.airColor);
                                if (lllIIlllIIlIlII(lllllllllllllIIIllIlIlIIIIllIllI, MapColor.waterColor)) {
                                    lllllllllllllIIIllIlIlIIIIlllIII = lllllllllllllIIIllIlIlIIIlIIIIlI * 0.1 + (lllllllllllllIIIllIlIlIIIlIIlllI + lllllllllllllIIIllIlIlIIIlIIllII & ItemMap.lIlIIlIlllllII[0]) * 0.2;
                                    lllllllllllllIIIllIlIlIIIIllIlll = ItemMap.lIlIIlIlllllII[0];
                                    if (lllIIlllIIlIlll(lllIIlllIIIllII(lllllllllllllIIIllIlIlIIIIlllIII, 0.5))) {
                                        lllllllllllllIIIllIlIlIIIIllIlll = ItemMap.lIlIIlIlllllII[2];
                                    }
                                    if (lllIIlllIIlIllI(lllIIlllIIIlIll(lllllllllllllIIIllIlIlIIIIlllIII, 0.9))) {
                                        lllllllllllllIIIllIlIlIIIIllIlll = ItemMap.lIlIIlIlllllII[1];
                                    }
                                }
                                lllllllllllllIIIllIlIlIIIlIIllIl = lllllllllllllIIIllIlIlIIIlIIIIIl;
                                if (lllIIlllIIlIIII(lllllllllllllIIIllIlIlIIIlIIllII) && lllIIlllIIlIIlI(lllllllllllllIIIllIlIlIIIlIIlIll * lllllllllllllIIIllIlIlIIIlIIlIll + lllllllllllllIIIllIlIlIIIlIIlIlI * lllllllllllllIIIllIlIlIIIlIIlIlI, lllllllllllllIIIllIlIlIIIlIlIIIl * lllllllllllllIIIllIlIlIIIlIlIIIl) && (!lllIIlllIIIlllI(lllllllllllllIIIllIlIlIIIlIIlIIl ? 1 : 0) || lllIIlllIIIlllI(lllllllllllllIIIllIlIlIIIlIIlllI + lllllllllllllIIIllIlIlIIIlIIllII & ItemMap.lIlIIlIlllllII[0]))) {
                                    final byte lllllllllllllIIIllIlIlIIIIllIlIl = lllllllllllllIIIllIlIlIIIlIlIlll.colors[lllllllllllllIIIllIlIlIIIlIIlllI + lllllllllllllIIIllIlIlIIIlIIllII * ItemMap.lIlIIlIlllllII[5]];
                                    final byte lllllllllllllIIIllIlIlIIIIllIlII = (byte)(lllllllllllllIIIllIlIlIIIIllIllI.colorIndex * ItemMap.lIlIIlIlllllII[14] + lllllllllllllIIIllIlIlIIIIllIlll);
                                    if (lllIIlllIIIllll(lllllllllllllIIIllIlIlIIIIllIlIl, lllllllllllllIIIllIlIlIIIIllIlII)) {
                                        lllllllllllllIIIllIlIlIIIlIlIlll.colors[lllllllllllllIIIllIlIlIIIlIIlllI + lllllllllllllIIIllIlIlIIIlIIllII * ItemMap.lIlIIlIlllllII[5]] = lllllllllllllIIIllIlIlIIIIllIlII;
                                        lllllllllllllIIIllIlIlIIIlIlIlll.updateMapData(lllllllllllllIIIllIlIlIIIlIIlllI, lllllllllllllIIIllIlIlIIIlIIllII);
                                        lllllllllllllIIIllIlIlIIIlIIllll = (ItemMap.lIlIIlIlllllII[0] != 0);
                                    }
                                }
                            }
                        }
                        ++lllllllllllllIIIllIlIlIIIlIIllII;
                    }
                }
                ++lllllllllllllIIIllIlIlIIIlIIlllI;
            }
        }
    }
    
    @Override
    public void addInformation(final ItemStack lllllllllllllIIIllIlIIllllIlllII, final EntityPlayer lllllllllllllIIIllIlIIllllIllIll, final List<String> lllllllllllllIIIllIlIIllllIllIlI, final boolean lllllllllllllIIIllIlIIllllIllIIl) {
        final MapData lllllllllllllIIIllIlIIllllIllIII = this.getMapData(lllllllllllllIIIllIlIIllllIlllII, lllllllllllllIIIllIlIIllllIllIll.worldObj);
        if (lllIIlllIIIlllI(lllllllllllllIIIllIlIIllllIllIIl ? 1 : 0)) {
            if (lllIIlllIIIlIIl(lllllllllllllIIIllIlIIllllIllIII)) {
                lllllllllllllIIIllIlIIllllIllIlI.add(ItemMap.lIlIIlIlllIlll[ItemMap.lIlIIlIlllllII[18]]);
                "".length();
                "".length();
                if (((0x3A ^ 0x1C) & ~(0x6 ^ 0x20)) != 0x0) {
                    return;
                }
            }
            else {
                lllllllllllllIIIllIlIIllllIllIlI.add(String.valueOf(new StringBuilder(ItemMap.lIlIIlIlllIlll[ItemMap.lIlIIlIlllllII[19]]).append(ItemMap.lIlIIlIlllllII[0] << lllllllllllllIIIllIlIIllllIllIII.scale)));
                "".length();
                lllllllllllllIIIllIlIIllllIllIlI.add(String.valueOf(new StringBuilder(ItemMap.lIlIIlIlllIlll[ItemMap.lIlIIlIlllllII[12]]).append(lllllllllllllIIIllIlIIllllIllIII.scale).append(ItemMap.lIlIIlIlllIlll[ItemMap.lIlIIlIlllllII[10]]).append(ItemMap.lIlIIlIlllllII[14]).append(ItemMap.lIlIIlIlllIlll[ItemMap.lIlIIlIlllllII[20]])));
                "".length();
            }
        }
    }
    
    private static boolean lllIIlllIIlIIII(final int lllllllllllllIIIllIlIIlllIIIIlII) {
        return lllllllllllllIIIllIlIIlllIIIIlII >= 0;
    }
    
    private static boolean lllIIlllIIIlIIl(final Object lllllllllllllIIIllIlIIlllIIIlIlI) {
        return lllllllllllllIIIllIlIIlllIIIlIlI == null;
    }
    
    private static boolean lllIIlllIIIllll(final int lllllllllllllIIIllIlIIllIllllIll, final int lllllllllllllIIIllIlIIllIllllIlI) {
        return lllllllllllllIIIllIlIIllIllllIll != lllllllllllllIIIllIlIIllIllllIlI;
    }
    
    private static boolean lllIIlllIIlIllI(final int lllllllllllllIIIllIlIIllIllllllI) {
        return lllllllllllllIIIllIlIIllIllllllI > 0;
    }
    
    private static boolean lllIIlllIIlIIll(final int lllllllllllllIIIllIlIIlllIIlIIIl, final int lllllllllllllIIIllIlIIlllIIlIIII) {
        return lllllllllllllIIIllIlIIlllIIlIIIl > lllllllllllllIIIllIlIIlllIIlIIII;
    }
    
    private static String lllIIllIlllIlIl(String lllllllllllllIIIllIlIIlllIlIlIII, final String lllllllllllllIIIllIlIIlllIlIIlll) {
        lllllllllllllIIIllIlIIlllIlIlIII = new String(Base64.getDecoder().decode(lllllllllllllIIIllIlIIlllIlIlIII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIIIllIlIIlllIlIlIll = new StringBuilder();
        final char[] lllllllllllllIIIllIlIIlllIlIlIlI = lllllllllllllIIIllIlIIlllIlIIlll.toCharArray();
        int lllllllllllllIIIllIlIIlllIlIlIIl = ItemMap.lIlIIlIlllllII[1];
        final boolean lllllllllllllIIIllIlIIlllIlIIIll = (Object)lllllllllllllIIIllIlIIlllIlIlIII.toCharArray();
        final byte lllllllllllllIIIllIlIIlllIlIIIlI = (byte)lllllllllllllIIIllIlIIlllIlIIIll.length;
        char lllllllllllllIIIllIlIIlllIlIIIIl = (char)ItemMap.lIlIIlIlllllII[1];
        while (lllIIlllIIlIIlI(lllllllllllllIIIllIlIIlllIlIIIIl, lllllllllllllIIIllIlIIlllIlIIIlI)) {
            final char lllllllllllllIIIllIlIIlllIlIlllI = lllllllllllllIIIllIlIIlllIlIIIll[lllllllllllllIIIllIlIIlllIlIIIIl];
            lllllllllllllIIIllIlIIlllIlIlIll.append((char)(lllllllllllllIIIllIlIIlllIlIlllI ^ lllllllllllllIIIllIlIIlllIlIlIlI[lllllllllllllIIIllIlIIlllIlIlIIl % lllllllllllllIIIllIlIIlllIlIlIlI.length]));
            "".length();
            ++lllllllllllllIIIllIlIIlllIlIlIIl;
            ++lllllllllllllIIIllIlIIlllIlIIIIl;
            "".length();
            if (" ".length() == 0) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIIIllIlIIlllIlIlIll);
    }
    
    private static int lllIIlllIIIlIll(final double n, final double n2) {
        return dcmpl(n, n2);
    }
    
    private static void lllIIllIllllIIl() {
        (lIlIIlIlllIlll = new String[ItemMap.lIlIIlIlllllII[21]])[ItemMap.lIlIIlIlllllII[1]] = lllIIllIlllIIll("SsYW+eWo5Xs=", "QJzQy");
        ItemMap.lIlIIlIlllIlll[ItemMap.lIlIIlIlllllII[0]] = lllIIllIlllIlII("G5A2EPDR4Cs=", "XrQvN");
        ItemMap.lIlIIlIlllIlll[ItemMap.lIlIIlIlllllII[2]] = lllIIllIlllIlIl("CC00", "eLDSj");
        ItemMap.lIlIIlIlllIlll[ItemMap.lIlIIlIlllllII[3]] = lllIIllIlllIlII("YAeSJw83+Hk=", "isAda");
        ItemMap.lIlIIlIlllIlll[ItemMap.lIlIIlIlllllII[14]] = lllIIllIlllIlII("+wiNYu6pDiTcTg5bmCHqVg==", "Aosnc");
        ItemMap.lIlIIlIlllIlll[ItemMap.lIlIIlIlllllII[15]] = lllIIllIlllIlIl("NBEW", "YpfGF");
        ItemMap.lIlIIlIlllIlll[ItemMap.lIlIIlIlllllII[16]] = lllIIllIlllIIll("6+PmcpxFM9o=", "TWUue");
        ItemMap.lIlIIlIlllIlll[ItemMap.lIlIIlIlllllII[17]] = lllIIllIlllIIll("aD8f2SAg2XA=", "svHUk");
        ItemMap.lIlIIlIlllIlll[ItemMap.lIlIIlIlllllII[18]] = lllIIllIlllIlII("0xLW+6VDortJS4CPFrTw2w==", "aofDf");
        ItemMap.lIlIIlIlllIlll[ItemMap.lIlIIlIlllllII[19]] = lllIIllIlllIlII("5PuxDqHqjUtD9m5P1twuNQ==", "nFlqJ");
        ItemMap.lIlIIlIlllIlll[ItemMap.lIlIIlIlllllII[12]] = lllIIllIlllIlII("fUPi+CiK6QE=", "ZjXTy");
        ItemMap.lIlIIlIlllIlll[ItemMap.lIlIIlIlllllII[10]] = lllIIllIlllIlII("SQaLTRRDTHA=", "thHoE");
        ItemMap.lIlIIlIlllIlll[ItemMap.lIlIIlIlllllII[20]] = lllIIllIlllIlIl("fA==", "UAhjL");
    }
    
    private static String lllIIllIlllIlII(final String lllllllllllllIIIllIlIIllllIIlIII, final String lllllllllllllIIIllIlIIllllIIIlll) {
        try {
            final SecretKeySpec lllllllllllllIIIllIlIIllllIIllIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIIIllIlIIllllIIIlll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lllllllllllllIIIllIlIIllllIIllII = Cipher.getInstance("Blowfish");
            lllllllllllllIIIllIlIIllllIIllII.init(ItemMap.lIlIIlIlllllII[2], lllllllllllllIIIllIlIIllllIIllIl);
            return new String(lllllllllllllIIIllIlIIllllIIllII.doFinal(Base64.getDecoder().decode(lllllllllllllIIIllIlIIllllIIlIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIIllIlIIllllIIlIll) {
            lllllllllllllIIIllIlIIllllIIlIll.printStackTrace();
            return null;
        }
    }
    
    protected ItemMap() {
        this.setHasSubtypes((boolean)(ItemMap.lIlIIlIlllllII[0] != 0));
        "".length();
    }
    
    @Override
    public void onCreated(final ItemStack lllllllllllllIIIllIlIIlllllIllII, final World lllllllllllllIIIllIlIIlllllIlIll, final EntityPlayer lllllllllllllIIIllIlIIlllllIlIlI) {
        if (lllIIlllIIIlllI(lllllllllllllIIIllIlIIlllllIllII.hasTagCompound() ? 1 : 0) && lllIIlllIIIlllI(lllllllllllllIIIllIlIIlllllIllII.getTagCompound().getBoolean(ItemMap.lIlIIlIlllIlll[ItemMap.lIlIIlIlllllII[14]]) ? 1 : 0)) {
            final MapData lllllllllllllIIIllIlIIlllllIlIIl = Items.filled_map.getMapData(lllllllllllllIIIllIlIIlllllIllII, lllllllllllllIIIllIlIIlllllIlIll);
            lllllllllllllIIIllIlIIlllllIllII.setItemDamage(lllllllllllllIIIllIlIIlllllIlIll.getUniqueDataId(ItemMap.lIlIIlIlllIlll[ItemMap.lIlIIlIlllllII[15]]));
            final MapData lllllllllllllIIIllIlIIlllllIlIII = new MapData(String.valueOf(new StringBuilder(ItemMap.lIlIIlIlllIlll[ItemMap.lIlIIlIlllllII[16]]).append(lllllllllllllIIIllIlIIlllllIllII.getMetadata())));
            lllllllllllllIIIllIlIIlllllIlIII.scale = (byte)(lllllllllllllIIIllIlIIlllllIlIIl.scale + ItemMap.lIlIIlIlllllII[0]);
            if (lllIIlllIIlIIll(lllllllllllllIIIllIlIIlllllIlIII.scale, ItemMap.lIlIIlIlllllII[14])) {
                lllllllllllllIIIllIlIIlllllIlIII.scale = (byte)ItemMap.lIlIIlIlllllII[14];
            }
            lllllllllllllIIIllIlIIlllllIlIII.calculateMapCenter(lllllllllllllIIIllIlIIlllllIlIIl.xCenter, lllllllllllllIIIllIlIIlllllIlIIl.zCenter, lllllllllllllIIIllIlIIlllllIlIII.scale);
            lllllllllllllIIIllIlIIlllllIlIII.dimension = lllllllllllllIIIllIlIIlllllIlIIl.dimension;
            lllllllllllllIIIllIlIIlllllIlIII.markDirty();
            lllllllllllllIIIllIlIIlllllIlIll.setItemData(String.valueOf(new StringBuilder(ItemMap.lIlIIlIlllIlll[ItemMap.lIlIIlIlllllII[17]]).append(lllllllllllllIIIllIlIIlllllIllII.getMetadata())), lllllllllllllIIIllIlIIlllllIlIII);
        }
    }
    
    static {
        lllIIlllIIIlIII();
        lllIIllIllllIIl();
    }
    
    private static int lllIIlllIIIllII(final double n, final double n2) {
        return dcmpg(n, n2);
    }
    
    private static void lllIIlllIIIlIII() {
        (lIlIIlIlllllII = new int[22])[0] = " ".length();
        ItemMap.lIlIIlIlllllII[1] = ((0x1F ^ 0xC) & ~(0x8E ^ 0x9D));
        ItemMap.lIlIIlIlllllII[2] = "  ".length();
        ItemMap.lIlIIlIlllllII[3] = "   ".length();
        ItemMap.lIlIIlIlllllII[4] = (68 + 103 - 32 + 82 ^ 46 + 23 - 43 + 131);
        ItemMap.lIlIIlIlllllII[5] = 51 + 15 + 20 + 42;
        ItemMap.lIlIIlIlllllII[6] = (0x95 ^ 0xAC ^ (0x6 ^ 0x30));
        ItemMap.lIlIIlIlllllII[7] = -" ".length();
        ItemMap.lIlIIlIlllllII[8] = (0xFFFF9FFF & 0x3E9BF);
        ItemMap.lIlIIlIlllllII[9] = (0xFFFFE7F9 & 0x1DD7F57);
        ItemMap.lIlIIlIlllllII[10] = (80 + 137 - 144 + 67 ^ 41 + 11 + 79 + 4);
        ItemMap.lIlIIlIlllllII[11] = (0xC ^ 0x18);
        ItemMap.lIlIIlIlllllII[12] = (0x33 ^ 0x5B ^ (0x2D ^ 0x4F));
        ItemMap.lIlIIlIlllllII[13] = ("  ".length() ^ (0xA3 ^ 0xC5));
        ItemMap.lIlIIlIlllllII[14] = (0x8D ^ 0x89);
        ItemMap.lIlIIlIlllllII[15] = (106 + 39 - 76 + 76 ^ 146 + 86 - 217 + 133);
        ItemMap.lIlIIlIlllllII[16] = (0x2A ^ 0x3B ^ (0x66 ^ 0x71));
        ItemMap.lIlIIlIlllllII[17] = (0x87 ^ 0x80);
        ItemMap.lIlIIlIlllllII[18] = (0x38 ^ 0x30);
        ItemMap.lIlIIlIlllllII[19] = (0x66 ^ 0x6F);
        ItemMap.lIlIIlIlllllII[20] = (0x3B ^ 0x37);
        ItemMap.lIlIIlIlllllII[21] = (0xA0 ^ 0xAD);
    }
    
    public MapData getMapData(final ItemStack lllllllllllllIIIllIlIlIIIllllllI, final World lllllllllllllIIIllIlIlIIlIIIIIIl) {
        String lllllllllllllIIIllIlIlIIlIIIIIII = String.valueOf(new StringBuilder(ItemMap.lIlIIlIlllIlll[ItemMap.lIlIIlIlllllII[0]]).append(lllllllllllllIIIllIlIlIIIllllllI.getMetadata()));
        MapData lllllllllllllIIIllIlIlIIIlllllll = (MapData)lllllllllllllIIIllIlIlIIlIIIIIIl.loadItemData(MapData.class, lllllllllllllIIIllIlIlIIlIIIIIII);
        if (lllIIlllIIIlIIl(lllllllllllllIIIllIlIlIIIlllllll) && lllIIlllIIIlIlI(lllllllllllllIIIllIlIlIIlIIIIIIl.isRemote ? 1 : 0)) {
            lllllllllllllIIIllIlIlIIIllllllI.setItemDamage(lllllllllllllIIIllIlIlIIlIIIIIIl.getUniqueDataId(ItemMap.lIlIIlIlllIlll[ItemMap.lIlIIlIlllllII[2]]));
            lllllllllllllIIIllIlIlIIlIIIIIII = String.valueOf(new StringBuilder(ItemMap.lIlIIlIlllIlll[ItemMap.lIlIIlIlllllII[3]]).append(lllllllllllllIIIllIlIlIIIllllllI.getMetadata()));
            lllllllllllllIIIllIlIlIIIlllllll = new MapData(lllllllllllllIIIllIlIlIIlIIIIIII);
            lllllllllllllIIIllIlIlIIIlllllll.scale = (byte)ItemMap.lIlIIlIlllllII[3];
            lllllllllllllIIIllIlIlIIIlllllll.calculateMapCenter(lllllllllllllIIIllIlIlIIlIIIIIIl.getWorldInfo().getSpawnX(), lllllllllllllIIIllIlIlIIlIIIIIIl.getWorldInfo().getSpawnZ(), lllllllllllllIIIllIlIlIIIlllllll.scale);
            lllllllllllllIIIllIlIlIIIlllllll.dimension = (byte)lllllllllllllIIIllIlIlIIlIIIIIIl.provider.getDimensionId();
            lllllllllllllIIIllIlIlIIIlllllll.markDirty();
            lllllllllllllIIIllIlIlIIlIIIIIIl.setItemData(lllllllllllllIIIllIlIlIIlIIIIIII, lllllllllllllIIIllIlIlIIIlllllll);
        }
        return lllllllllllllIIIllIlIlIIIlllllll;
    }
    
    private static String lllIIllIlllIIll(final String lllllllllllllIIIllIlIIlllIlllIll, final String lllllllllllllIIIllIlIIlllIlllIlI) {
        try {
            final SecretKeySpec lllllllllllllIIIllIlIIllllIIIIII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIIIllIlIIlllIlllIlI.getBytes(StandardCharsets.UTF_8)), ItemMap.lIlIIlIlllllII[18]), "DES");
            final Cipher lllllllllllllIIIllIlIIlllIllllll = Cipher.getInstance("DES");
            lllllllllllllIIIllIlIIlllIllllll.init(ItemMap.lIlIIlIlllllII[2], lllllllllllllIIIllIlIIllllIIIIII);
            return new String(lllllllllllllIIIllIlIIlllIllllll.doFinal(Base64.getDecoder().decode(lllllllllllllIIIllIlIIlllIlllIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIIllIlIIlllIlllllI) {
            lllllllllllllIIIllIlIIlllIlllllI.printStackTrace();
            return null;
        }
    }
    
    private static boolean lllIIlllIIIlllI(final int lllllllllllllIIIllIlIIlllIIIlIII) {
        return lllllllllllllIIIllIlIIlllIIIlIII != 0;
    }
    
    private static boolean lllIIlllIIlIIIl(final int lllllllllllllIIIllIlIIlllIIllIIl, final int lllllllllllllIIIllIlIIlllIIllIII) {
        return lllllllllllllIIIllIlIIlllIIllIIl >= lllllllllllllIIIllIlIIlllIIllIII;
    }
    
    private static boolean lllIIlllIIlIlII(final Object lllllllllllllIIIllIlIIlllIIIllIl, final Object lllllllllllllIIIllIlIIlllIIIllII) {
        return lllllllllllllIIIllIlIIlllIIIllIl == lllllllllllllIIIllIlIIlllIIIllII;
    }
    
    private static boolean lllIIlllIIlIlll(final int lllllllllllllIIIllIlIIlllIIIIIlI) {
        return lllllllllllllIIIllIlIIlllIIIIIlI < 0;
    }
    
    public static MapData loadMapData(final int lllllllllllllIIIllIlIlIIlIIIlIll, final World lllllllllllllIIIllIlIlIIlIIIlllI) {
        final String lllllllllllllIIIllIlIlIIlIIIllIl = String.valueOf(new StringBuilder(ItemMap.lIlIIlIlllIlll[ItemMap.lIlIIlIlllllII[1]]).append(lllllllllllllIIIllIlIlIIlIIIlIll));
        MapData lllllllllllllIIIllIlIlIIlIIIllII = (MapData)lllllllllllllIIIllIlIlIIlIIIlllI.loadItemData(MapData.class, lllllllllllllIIIllIlIlIIlIIIllIl);
        if (lllIIlllIIIlIIl(lllllllllllllIIIllIlIlIIlIIIllII)) {
            lllllllllllllIIIllIlIlIIlIIIllII = new MapData(lllllllllllllIIIllIlIlIIlIIIllIl);
            lllllllllllllIIIllIlIlIIlIIIlllI.setItemData(lllllllllllllIIIllIlIlIIlIIIllIl, lllllllllllllIIIllIlIlIIlIIIllII);
        }
        return lllllllllllllIIIllIlIlIIlIIIllII;
    }
    
    private static boolean lllIIlllIIlIlIl(final int lllllllllllllIIIllIlIIlllIIIIIII) {
        return lllllllllllllIIIllIlIIlllIIIIIII <= 0;
    }
    
    @Override
    public void onUpdate(final ItemStack lllllllllllllIIIllIlIlIIIIIIIIll, final World lllllllllllllIIIllIlIlIIIIIIIIlI, final Entity lllllllllllllIIIllIlIlIIIIIIIIIl, final int lllllllllllllIIIllIlIlIIIIIIlIII, final boolean lllllllllllllIIIllIlIlIIIIIIIlll) {
        if (lllIIlllIIIlIlI(lllllllllllllIIIllIlIlIIIIIIIIlI.isRemote ? 1 : 0)) {
            final MapData lllllllllllllIIIllIlIlIIIIIIIllI = this.getMapData(lllllllllllllIIIllIlIlIIIIIIIIll, lllllllllllllIIIllIlIlIIIIIIIIlI);
            if (lllIIlllIIIlllI((lllllllllllllIIIllIlIlIIIIIIIIIl instanceof EntityPlayer) ? 1 : 0)) {
                final EntityPlayer lllllllllllllIIIllIlIlIIIIIIIlIl = (EntityPlayer)lllllllllllllIIIllIlIlIIIIIIIIIl;
                lllllllllllllIIIllIlIlIIIIIIIllI.updateVisiblePlayers(lllllllllllllIIIllIlIlIIIIIIIlIl, lllllllllllllIIIllIlIlIIIIIIIIll);
            }
            if (lllIIlllIIIlllI(lllllllllllllIIIllIlIlIIIIIIIlll ? 1 : 0)) {
                this.updateMapData(lllllllllllllIIIllIlIlIIIIIIIIlI, lllllllllllllIIIllIlIlIIIIIIIIIl, lllllllllllllIIIllIlIlIIIIIIIllI);
            }
        }
    }
    
    private static boolean lllIIlllIIIllIl(final int lllllllllllllIIIllIlIIlllIIlllIl, final int lllllllllllllIIIllIlIIlllIIlllII) {
        return lllllllllllllIIIllIlIIlllIIlllIl == lllllllllllllIIIllIlIIlllIIlllII;
    }
    
    private static boolean lllIIlllIIIlIlI(final int lllllllllllllIIIllIlIIlllIIIIllI) {
        return lllllllllllllIIIllIlIIlllIIIIllI == 0;
    }
    
    @Override
    public Packet createMapDataPacket(final ItemStack lllllllllllllIIIllIlIIllllllIlII, final World lllllllllllllIIIllIlIIllllllIIll, final EntityPlayer lllllllllllllIIIllIlIIllllllIllI) {
        return this.getMapData(lllllllllllllIIIllIlIIllllllIlII, lllllllllllllIIIllIlIIllllllIIll).getMapPacket(lllllllllllllIIIllIlIIllllllIlII, lllllllllllllIIIllIlIIllllllIIll, lllllllllllllIIIllIlIIllllllIllI);
    }
}
