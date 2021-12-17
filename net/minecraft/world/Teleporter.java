// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.world;

import net.minecraft.block.state.pattern.BlockPattern;
import net.minecraft.util.Vec3i;
import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.block.state.IBlockState;
import net.minecraft.block.properties.IProperty;
import net.minecraft.util.EnumFacing;
import net.minecraft.block.BlockPortal;
import net.minecraft.init.Blocks;
import net.minecraft.util.BlockPos;
import net.minecraft.util.MathHelper;
import net.minecraft.entity.Entity;
import com.google.common.collect.Lists;
import java.util.Iterator;
import java.util.Random;
import java.util.List;
import net.minecraft.util.LongHashMap;

public class Teleporter
{
    private final /* synthetic */ LongHashMap<PortalPosition> destinationCoordinateCache;
    private final /* synthetic */ List<Long> destinationCoordinateKeys;
    private final /* synthetic */ WorldServer worldServerInstance;
    private static final /* synthetic */ int[] lIlIlIIIlIlIll;
    private final /* synthetic */ Random random;
    
    private static boolean lllIlIlllIIIIIl(final int lllllllllllllIIIlIlIlIIIllIIIIIl) {
        return lllllllllllllIIIlIlIlIIIllIIIIIl == 0;
    }
    
    private static boolean lllIlIlllIIIIII(final int lllllllllllllIIIlIlIlIIIlIlllIII, final int lllllllllllllIIIlIlIlIIIlIllIlll) {
        return lllllllllllllIIIlIlIlIIIlIlllIII != lllllllllllllIIIlIlIlIIIlIllIlll;
    }
    
    private static boolean lllIlIlllIIIlIl(final int lllllllllllllIIIlIlIlIIIllIlIIII, final int lllllllllllllIIIlIlIlIIIllIIllll) {
        return lllllllllllllIIIlIlIlIIIllIlIIII > lllllllllllllIIIlIlIlIIIllIIllll;
    }
    
    public void removeStalePortalLocations(final long lllllllllllllIIIlIlIlIIIllIllIll) {
        if (lllIlIlllIIIIIl(lllIlIlllIlIIIl(lllllllllllllIIIlIlIlIIIllIllIll % 100L, 0L))) {
            final Iterator<Long> lllllllllllllIIIlIlIlIIIlllIIIII = this.destinationCoordinateKeys.iterator();
            final long lllllllllllllIIIlIlIlIIIllIlllll = lllllllllllllIIIlIlIlIIIllIllIll - 300L;
            "".length();
            if (-" ".length() > 0) {
                return;
            }
            while (!lllIlIlllIIIIIl(lllllllllllllIIIlIlIlIIIlllIIIII.hasNext() ? 1 : 0)) {
                final Long lllllllllllllIIIlIlIlIIIllIllllI = lllllllllllllIIIlIlIlIIIlllIIIII.next();
                final PortalPosition lllllllllllllIIIlIlIlIIIllIlllIl = this.destinationCoordinateCache.getValueByKey(lllllllllllllIIIlIlIlIIIllIllllI);
                if (!lllIlIlllIlIIlI(lllllllllllllIIIlIlIlIIIllIlllIl) || lllIlIlllIIIIlI(lllIlIlllIlIIIl(lllllllllllllIIIlIlIlIIIllIlllIl.lastUpdateTime, lllllllllllllIIIlIlIlIIIllIlllll))) {
                    lllllllllllllIIIlIlIlIIIlllIIIII.remove();
                    this.destinationCoordinateCache.remove(lllllllllllllIIIlIlIlIIIllIllllI);
                    "".length();
                }
            }
        }
    }
    
    private static boolean lllIlIlllIIIIll(final int lllllllllllllIIIlIlIlIIIllIIIIll) {
        return lllllllllllllIIIlIlIlIIIllIIIIll != 0;
    }
    
    private static int lllIlIlllIIlIlI(final double n, final double n2) {
        return dcmpg(n, n2);
    }
    
    private static boolean lllIlIlllIlIIlI(final Object lllllllllllllIIIlIlIlIIIllIIIlIl) {
        return lllllllllllllIIIlIlIlIIIllIIIlIl != null;
    }
    
    private static boolean lllIlIlllIIIlII(final int lllllllllllllIIIlIlIlIIIllIlIlII, final int lllllllllllllIIIlIlIlIIIllIlIIll) {
        return lllllllllllllIIIlIlIlIIIllIlIlII >= lllllllllllllIIIlIlIlIIIllIlIIll;
    }
    
    public Teleporter(final WorldServer lllllllllllllIIIlIlIlIIllllIIlIl) {
        this.destinationCoordinateCache = new LongHashMap<PortalPosition>();
        this.destinationCoordinateKeys = (List<Long>)Lists.newArrayList();
        this.worldServerInstance = lllllllllllllIIIlIlIlIIllllIIlIl;
        this.random = new Random(lllllllllllllIIIlIlIlIIllllIIlIl.getSeed());
    }
    
    private static boolean lllIlIlllIlIIII(final int lllllllllllllIIIlIlIlIIIlIlllIll) {
        return lllllllllllllIIIlIlIlIIIlIlllIll > 0;
    }
    
    private static int lllIlIlllIlIIIl(final long n, final long n2) {
        return lcmp(n, n2);
    }
    
    private static boolean lllIlIlllIIllII(final Object lllllllllllllIIIlIlIlIIIllIIlIII, final Object lllllllllllllIIIlIlIlIIIllIIIlll) {
        return lllllllllllllIIIlIlIlIIIllIIlIII == lllllllllllllIIIlIlIlIIIllIIIlll;
    }
    
    private static boolean lllIlIlllIIllIl(final Object lllllllllllllIIIlIlIlIIIllIIllII, final Object lllllllllllllIIIlIlIlIIIllIIlIll) {
        return lllllllllllllIIIlIlIlIIIllIIllII != lllllllllllllIIIlIlIlIIIllIIlIll;
    }
    
    public boolean makePortal(final Entity lllllllllllllIIIlIlIlIIlIIIIIlII) {
        final int lllllllllllllIIIlIlIlIIlIlIIlIIl = Teleporter.lIlIlIIIlIlIll[9];
        double lllllllllllllIIIlIlIlIIlIlIIlIII = -1.0;
        final int lllllllllllllIIIlIlIlIIlIlIIIlll = MathHelper.floor_double(lllllllllllllIIIlIlIlIIlIIIIIlII.posX);
        final int lllllllllllllIIIlIlIlIIlIlIIIllI = MathHelper.floor_double(lllllllllllllIIIlIlIlIIlIIIIIlII.posY);
        final int lllllllllllllIIIlIlIlIIlIlIIIlIl = MathHelper.floor_double(lllllllllllllIIIlIlIlIIlIIIIIlII.posZ);
        int lllllllllllllIIIlIlIlIIlIlIIIlII = lllllllllllllIIIlIlIlIIlIlIIIlll;
        int lllllllllllllIIIlIlIlIIlIlIIIIll = lllllllllllllIIIlIlIlIIlIlIIIllI;
        int lllllllllllllIIIlIlIlIIlIlIIIIlI = lllllllllllllIIIlIlIlIIlIlIIIlIl;
        int lllllllllllllIIIlIlIlIIlIlIIIIIl = Teleporter.lIlIlIIIlIlIll[1];
        final int lllllllllllllIIIlIlIlIIlIlIIIIII = this.random.nextInt(Teleporter.lIlIlIIIlIlIll[10]);
        final BlockPos.MutableBlockPos lllllllllllllIIIlIlIlIIlIIllllll = new BlockPos.MutableBlockPos();
        int lllllllllllllIIIlIlIlIIlIIlllllI = lllllllllllllIIIlIlIlIIlIlIIIlll - lllllllllllllIIIlIlIlIIlIlIIlIIl;
        "".length();
        if (null != null) {
            return ((0x5A ^ 0x6E ^ (0x75 ^ 0x5)) & (0xF4 ^ 0xA8 ^ (0x94 ^ 0x8C) ^ -" ".length())) != 0x0;
        }
        while (!lllIlIlllIIIlIl(lllllllllllllIIIlIlIlIIlIIlllllI, lllllllllllllIIIlIlIlIIlIlIIIlll + lllllllllllllIIIlIlIlIIlIlIIlIIl)) {
            final double lllllllllllllIIIlIlIlIIlIIllllIl = lllllllllllllIIIlIlIlIIlIIlllllI + 0.5 - lllllllllllllIIIlIlIlIIlIIIIIlII.posX;
            int lllllllllllllIIIlIlIlIIlIIllllII = lllllllllllllIIIlIlIlIIlIlIIIlIl - lllllllllllllIIIlIlIlIIlIlIIlIIl;
            "".length();
            if ("   ".length() <= ((0x79 ^ 0x57) & ~(0xB4 ^ 0x9A))) {
                return ((0x3 ^ 0x9) & ~(0x4D ^ 0x47)) != 0x0;
            }
            while (!lllIlIlllIIIlIl(lllllllllllllIIIlIlIlIIlIIllllII, lllllllllllllIIIlIlIlIIlIlIIIlIl + lllllllllllllIIIlIlIlIIlIlIIlIIl)) {
                final double lllllllllllllIIIlIlIlIIlIIlllIll = lllllllllllllIIIlIlIlIIlIIllllII + 0.5 - lllllllllllllIIIlIlIlIIlIIIIIlII.posZ;
                int lllllllllllllIIIlIlIlIIlIIlllIlI = this.worldServerInstance.getActualHeight() - Teleporter.lIlIlIIIlIlIll[0];
                "".length();
                if (((0x1A ^ 0x3C) & ~(0x39 ^ 0x1F)) >= " ".length()) {
                    return ((0x2C ^ 0x27) & ~(0x3F ^ 0x34)) != 0x0;
                }
                while (!lllIlIlllIIIIlI(lllllllllllllIIIlIlIlIIlIIlllIlI)) {
                    Label_1025: {
                        if (lllIlIlllIIIIll(this.worldServerInstance.isAirBlock(lllllllllllllIIIlIlIlIIlIIllllll.func_181079_c(lllllllllllllIIIlIlIlIIlIIlllllI, lllllllllllllIIIlIlIlIIlIIlllIlI, lllllllllllllIIIlIlIlIIlIIllllII)) ? 1 : 0)) {
                            "".length();
                            if ("  ".length() <= 0) {
                                return ((0x2F ^ 0x29 ^ (0x20 ^ 0x3B)) & (0x4E ^ 0xB ^ (0xEE ^ 0xB6) ^ -" ".length())) != 0x0;
                            }
                            while (lllIlIlllIlIIII(lllllllllllllIIIlIlIlIIlIIlllIlI) && !lllIlIlllIIIIIl(this.worldServerInstance.isAirBlock(lllllllllllllIIIlIlIlIIlIIllllll.func_181079_c(lllllllllllllIIIlIlIlIIlIIlllllI, lllllllllllllIIIlIlIlIIlIIlllIlI - Teleporter.lIlIlIIIlIlIll[0], lllllllllllllIIIlIlIlIIlIIllllII)) ? 1 : 0)) {
                                --lllllllllllllIIIlIlIlIIlIIlllIlI;
                            }
                            int lllllllllllllIIIlIlIlIIlIIlllIIl = lllllllllllllIIIlIlIlIIlIlIIIIII;
                            "".length();
                            if ("   ".length() == 0) {
                                return ((0x6A ^ 0x9) & ~(0x6E ^ 0xD)) != 0x0;
                            }
                            while (!lllIlIlllIIIlII(lllllllllllllIIIlIlIlIIlIIlllIIl, lllllllllllllIIIlIlIlIIlIlIIIIII + Teleporter.lIlIlIIIlIlIll[10])) {
                                int lllllllllllllIIIlIlIlIIlIIlllIII = lllllllllllllIIIlIlIlIIlIIlllIIl % Teleporter.lIlIlIIIlIlIll[5];
                                int lllllllllllllIIIlIlIlIIlIIllIlll = Teleporter.lIlIlIIIlIlIll[0] - lllllllllllllIIIlIlIlIIlIIlllIII;
                                if (lllIlIlllIIIlII(lllllllllllllIIIlIlIlIIlIIlllIIl % Teleporter.lIlIlIIIlIlIll[10], Teleporter.lIlIlIIIlIlIll[5])) {
                                    lllllllllllllIIIlIlIlIIlIIlllIII = -lllllllllllllIIIlIlIlIIlIIlllIII;
                                    lllllllllllllIIIlIlIlIIlIIllIlll = -lllllllllllllIIIlIlIlIIlIIllIlll;
                                }
                                int lllllllllllllIIIlIlIlIIlIIllIllI = Teleporter.lIlIlIIIlIlIll[1];
                                "".length();
                                if ((1 + 125 - 88 + 111 ^ 104 + 82 - 47 + 6) <= " ".length()) {
                                    return ((65 + 90 - 90 + 71 ^ 61 + 17 - 76 + 133) & (91 + 94 - 36 + 19 ^ 79 + 143 - 93 + 38 ^ -" ".length())) != 0x0;
                                }
                                while (!lllIlIlllIIIlII(lllllllllllllIIIlIlIlIIlIIllIllI, Teleporter.lIlIlIIIlIlIll[4])) {
                                    int lllllllllllllIIIlIlIlIIlIIllIlIl = Teleporter.lIlIlIIIlIlIll[1];
                                    "".length();
                                    if (((0x7D ^ 0x2E) & ~(0xC4 ^ 0x97)) != 0x0) {
                                        return ((0x6 ^ 0x37) & ~(0x71 ^ 0x40)) != 0x0;
                                    }
                                    while (!lllIlIlllIIIlII(lllllllllllllIIIlIlIlIIlIIllIlIl, Teleporter.lIlIlIIIlIlIll[10])) {
                                        int lllllllllllllIIIlIlIlIIlIIllIlII = Teleporter.lIlIlIIIlIlIll[3];
                                        "".length();
                                        if (" ".length() <= ((0x6D ^ 0x22 ^ (0x49 ^ 0x53)) & (52 + 105 + 70 + 21 ^ 118 + 142 - 172 + 85 ^ -" ".length()))) {
                                            return ((0xEE ^ 0xB3 ^ (0xD4 ^ 0x93)) & (0x5F ^ 0x7 ^ (0x5F ^ 0x1D) ^ -" ".length())) != 0x0;
                                        }
                                        while (!lllIlIlllIIIlII(lllllllllllllIIIlIlIlIIlIIllIlII, Teleporter.lIlIlIIIlIlIll[10])) {
                                            final int lllllllllllllIIIlIlIlIIlIIllIIll = lllllllllllllIIIlIlIlIIlIIlllllI + (lllllllllllllIIIlIlIlIIlIIllIlIl - Teleporter.lIlIlIIIlIlIll[0]) * lllllllllllllIIIlIlIlIIlIIlllIII + lllllllllllllIIIlIlIlIIlIIllIllI * lllllllllllllIIIlIlIlIIlIIllIlll;
                                            final int lllllllllllllIIIlIlIlIIlIIllIIlI = lllllllllllllIIIlIlIlIIlIIlllIlI + lllllllllllllIIIlIlIlIIlIIllIlII;
                                            final int lllllllllllllIIIlIlIlIIlIIllIIIl = lllllllllllllIIIlIlIlIIlIIllllII + (lllllllllllllIIIlIlIlIIlIIllIlIl - Teleporter.lIlIlIIIlIlIll[0]) * lllllllllllllIIIlIlIlIIlIIllIlll - lllllllllllllIIIlIlIlIIlIIllIllI * lllllllllllllIIIlIlIlIIlIIlllIII;
                                            lllllllllllllIIIlIlIlIIlIIllllll.func_181079_c(lllllllllllllIIIlIlIlIIlIIllIIll, lllllllllllllIIIlIlIlIIlIIllIIlI, lllllllllllllIIIlIlIlIIlIIllIIIl);
                                            "".length();
                                            if (lllIlIlllIIIIlI(lllllllllllllIIIlIlIlIIlIIllIlII) && !lllIlIlllIIIIll(this.worldServerInstance.getBlockState(lllllllllllllIIIlIlIlIIlIIllllll).getBlock().getMaterial().isSolid() ? 1 : 0)) {
                                                break Label_1025;
                                            }
                                            if (lllIlIlllIIlllI(lllllllllllllIIIlIlIlIIlIIllIlII) && lllIlIlllIIIIIl(this.worldServerInstance.isAirBlock(lllllllllllllIIIlIlIlIIlIIllllll) ? 1 : 0)) {
                                                "".length();
                                                if (-"   ".length() >= 0) {
                                                    return ((0x3B ^ 0x42 ^ (0x79 ^ 0x5A)) & (0x13 ^ 0x28 ^ (0x3F ^ 0x5E) ^ -" ".length())) != 0x0;
                                                }
                                                break Label_1025;
                                            }
                                            else {
                                                ++lllllllllllllIIIlIlIlIIlIIllIlII;
                                            }
                                        }
                                        ++lllllllllllllIIIlIlIlIIlIIllIlIl;
                                    }
                                    ++lllllllllllllIIIlIlIlIIlIIllIllI;
                                }
                                final double lllllllllllllIIIlIlIlIIlIIllIIII = lllllllllllllIIIlIlIlIIlIIlllIlI + 0.5 - lllllllllllllIIIlIlIlIIlIIIIIlII.posY;
                                final double lllllllllllllIIIlIlIlIIlIIlIllll = lllllllllllllIIIlIlIlIIlIIllllIl * lllllllllllllIIIlIlIlIIlIIllllIl + lllllllllllllIIIlIlIlIIlIIllIIII * lllllllllllllIIIlIlIlIIlIIllIIII + lllllllllllllIIIlIlIlIIlIIlllIll * lllllllllllllIIIlIlIlIIlIIlllIll;
                                if (!lllIlIlllIIlllI(lllIlIlllIIllll(lllllllllllllIIIlIlIlIIlIlIIlIII, 0.0)) || lllIlIlllIIIIlI(lllIlIlllIIllll(lllllllllllllIIIlIlIlIIlIIlIllll, lllllllllllllIIIlIlIlIIlIlIIlIII))) {
                                    lllllllllllllIIIlIlIlIIlIlIIlIII = lllllllllllllIIIlIlIlIIlIIlIllll;
                                    lllllllllllllIIIlIlIlIIlIlIIIlII = lllllllllllllIIIlIlIlIIlIIlllllI;
                                    lllllllllllllIIIlIlIlIIlIlIIIIll = lllllllllllllIIIlIlIlIIlIIlllIlI;
                                    lllllllllllllIIIlIlIlIIlIlIIIIlI = lllllllllllllIIIlIlIlIIlIIllllII;
                                    lllllllllllllIIIlIlIlIIlIlIIIIIl = lllllllllllllIIIlIlIlIIlIIlllIIl % Teleporter.lIlIlIIIlIlIll[10];
                                }
                                ++lllllllllllllIIIlIlIlIIlIIlllIIl;
                            }
                        }
                    }
                    --lllllllllllllIIIlIlIlIIlIIlllIlI;
                }
                ++lllllllllllllIIIlIlIlIIlIIllllII;
            }
            ++lllllllllllllIIIlIlIlIIlIIlllllI;
        }
        if (lllIlIlllIIIIlI(lllIlIlllIIllll(lllllllllllllIIIlIlIlIIlIlIIlIII, 0.0))) {
            int lllllllllllllIIIlIlIlIIlIIlIlllI = lllllllllllllIIIlIlIlIIlIlIIIlll - lllllllllllllIIIlIlIlIIlIlIIlIIl;
            "".length();
            if (((0x5D ^ 0x5 ^ (0x24 ^ 0x2A)) & (198 + 180 - 195 + 63 ^ 145 + 7 - 66 + 74 ^ -" ".length())) > 0) {
                return ((75 + 43 - 52 + 97 ^ 42 + 89 - 128 + 136) & (0xD4 ^ 0x8F ^ (0x24 ^ 0x57) ^ -" ".length())) != 0x0;
            }
            while (!lllIlIlllIIIlIl(lllllllllllllIIIlIlIlIIlIIlIlllI, lllllllllllllIIIlIlIlIIlIlIIIlll + lllllllllllllIIIlIlIlIIlIlIIlIIl)) {
                final double lllllllllllllIIIlIlIlIIlIIlIllIl = lllllllllllllIIIlIlIlIIlIIlIlllI + 0.5 - lllllllllllllIIIlIlIlIIlIIIIIlII.posX;
                int lllllllllllllIIIlIlIlIIlIIlIllII = lllllllllllllIIIlIlIlIIlIlIIIlIl - lllllllllllllIIIlIlIlIIlIlIIlIIl;
                "".length();
                if ("   ".length() != "   ".length()) {
                    return ((23 + 5 + 88 + 12 ^ 136 + 89 - 146 + 94) & (136 + 59 - 143 + 89 ^ 61 + 156 - 153 + 96 ^ -" ".length())) != 0x0;
                }
                while (!lllIlIlllIIIlIl(lllllllllllllIIIlIlIlIIlIIlIllII, lllllllllllllIIIlIlIlIIlIlIIIlIl + lllllllllllllIIIlIlIlIIlIlIIlIIl)) {
                    final double lllllllllllllIIIlIlIlIIlIIlIlIll = lllllllllllllIIIlIlIlIIlIIlIllII + 0.5 - lllllllllllllIIIlIlIlIIlIIIIIlII.posZ;
                    int lllllllllllllIIIlIlIlIIlIIlIlIlI = this.worldServerInstance.getActualHeight() - Teleporter.lIlIlIIIlIlIll[0];
                    "".length();
                    if (null != null) {
                        return ((4 + 209 - 102 + 110 ^ 22 + 108 - 47 + 106) & (0x3B ^ 0x18 ^ (0x83 ^ 0xC0) ^ -" ".length())) != 0x0;
                    }
                    while (!lllIlIlllIIIIlI(lllllllllllllIIIlIlIlIIlIIlIlIlI)) {
                        Label_2029: {
                            if (lllIlIlllIIIIll(this.worldServerInstance.isAirBlock(lllllllllllllIIIlIlIlIIlIIllllll.func_181079_c(lllllllllllllIIIlIlIlIIlIIlIlllI, lllllllllllllIIIlIlIlIIlIIlIlIlI, lllllllllllllIIIlIlIlIIlIIlIllII)) ? 1 : 0)) {
                                "".length();
                                if (-" ".length() > ((246 + 40 - 258 + 219 ^ 123 + 79 - 159 + 122) & (54 + 80 - 122 + 241 ^ 45 + 31 + 97 + 2 ^ -" ".length()))) {
                                    return ((3 + 91 + 27 + 30 ^ 78 + 149 - 141 + 82) & (0x80 ^ 0xAD ^ (0xD6 ^ 0xC4) ^ -" ".length())) != 0x0;
                                }
                                while (lllIlIlllIlIIII(lllllllllllllIIIlIlIlIIlIIlIlIlI) && !lllIlIlllIIIIIl(this.worldServerInstance.isAirBlock(lllllllllllllIIIlIlIlIIlIIllllll.func_181079_c(lllllllllllllIIIlIlIlIIlIIlIlllI, lllllllllllllIIIlIlIlIIlIIlIlIlI - Teleporter.lIlIlIIIlIlIll[0], lllllllllllllIIIlIlIlIIlIIlIllII)) ? 1 : 0)) {
                                    --lllllllllllllIIIlIlIlIIlIIlIlIlI;
                                }
                                int lllllllllllllIIIlIlIlIIlIIlIlIIl = lllllllllllllIIIlIlIlIIlIlIIIIII;
                                "".length();
                                if (null != null) {
                                    return ((0x7A ^ 0x68) & ~(0xB7 ^ 0xA5)) != 0x0;
                                }
                                while (!lllIlIlllIIIlII(lllllllllllllIIIlIlIlIIlIIlIlIIl, lllllllllllllIIIlIlIlIIlIlIIIIII + Teleporter.lIlIlIIIlIlIll[5])) {
                                    final int lllllllllllllIIIlIlIlIIlIIlIlIII = lllllllllllllIIIlIlIlIIlIIlIlIIl % Teleporter.lIlIlIIIlIlIll[5];
                                    final int lllllllllllllIIIlIlIlIIlIIlIIlll = Teleporter.lIlIlIIIlIlIll[0] - lllllllllllllIIIlIlIlIIlIIlIlIII;
                                    int lllllllllllllIIIlIlIlIIlIIlIIllI = Teleporter.lIlIlIIIlIlIll[1];
                                    "".length();
                                    if (-"   ".length() > 0) {
                                        return ((35 + 136 - 10 + 3 ^ 32 + 90 + 16 + 15) & (0x86 ^ 0xAD ^ (0x49 ^ 0x5F) ^ -" ".length())) != 0x0;
                                    }
                                    while (!lllIlIlllIIIlII(lllllllllllllIIIlIlIlIIlIIlIIllI, Teleporter.lIlIlIIIlIlIll[10])) {
                                        int lllllllllllllIIIlIlIlIIlIIlIIlIl = Teleporter.lIlIlIIIlIlIll[3];
                                        "".length();
                                        if (-"  ".length() >= 0) {
                                            return ((0x3E ^ 0x76) & ~(0x49 ^ 0x1)) != 0x0;
                                        }
                                        while (!lllIlIlllIIIlII(lllllllllllllIIIlIlIlIIlIIlIIlIl, Teleporter.lIlIlIIIlIlIll[10])) {
                                            final int lllllllllllllIIIlIlIlIIlIIlIIlII = lllllllllllllIIIlIlIlIIlIIlIlllI + (lllllllllllllIIIlIlIlIIlIIlIIllI - Teleporter.lIlIlIIIlIlIll[0]) * lllllllllllllIIIlIlIlIIlIIlIlIII;
                                            final int lllllllllllllIIIlIlIlIIlIIlIIIll = lllllllllllllIIIlIlIlIIlIIlIlIlI + lllllllllllllIIIlIlIlIIlIIlIIlIl;
                                            final int lllllllllllllIIIlIlIlIIlIIlIIIlI = lllllllllllllIIIlIlIlIIlIIlIllII + (lllllllllllllIIIlIlIlIIlIIlIIllI - Teleporter.lIlIlIIIlIlIll[0]) * lllllllllllllIIIlIlIlIIlIIlIIlll;
                                            lllllllllllllIIIlIlIlIIlIIllllll.func_181079_c(lllllllllllllIIIlIlIlIIlIIlIIlII, lllllllllllllIIIlIlIlIIlIIlIIIll, lllllllllllllIIIlIlIlIIlIIlIIIlI);
                                            "".length();
                                            if (lllIlIlllIIIIlI(lllllllllllllIIIlIlIlIIlIIlIIlIl) && !lllIlIlllIIIIll(this.worldServerInstance.getBlockState(lllllllllllllIIIlIlIlIIlIIllllll).getBlock().getMaterial().isSolid() ? 1 : 0)) {
                                                break Label_2029;
                                            }
                                            if (lllIlIlllIIlllI(lllllllllllllIIIlIlIlIIlIIlIIlIl) && lllIlIlllIIIIIl(this.worldServerInstance.isAirBlock(lllllllllllllIIIlIlIlIIlIIllllll) ? 1 : 0)) {
                                                "".length();
                                                if (-(0xCF ^ 0xB8 ^ (0xB0 ^ 0xC3)) >= 0) {
                                                    return ((169 + 215 - 191 + 25 ^ 36 + 118 - 132 + 128) & (0xBC ^ 0xC1 ^ (0xBA ^ 0x8B) ^ -" ".length())) != 0x0;
                                                }
                                                break Label_2029;
                                            }
                                            else {
                                                ++lllllllllllllIIIlIlIlIIlIIlIIlIl;
                                            }
                                        }
                                        ++lllllllllllllIIIlIlIlIIlIIlIIllI;
                                    }
                                    final double lllllllllllllIIIlIlIlIIlIIlIIIIl = lllllllllllllIIIlIlIlIIlIIlIlIlI + 0.5 - lllllllllllllIIIlIlIlIIlIIIIIlII.posY;
                                    final double lllllllllllllIIIlIlIlIIlIIlIIIII = lllllllllllllIIIlIlIlIIlIIlIllIl * lllllllllllllIIIlIlIlIIlIIlIllIl + lllllllllllllIIIlIlIlIIlIIlIIIIl * lllllllllllllIIIlIlIlIIlIIlIIIIl + lllllllllllllIIIlIlIlIIlIIlIlIll * lllllllllllllIIIlIlIlIIlIIlIlIll;
                                    if (!lllIlIlllIIlllI(lllIlIlllIIllll(lllllllllllllIIIlIlIlIIlIlIIlIII, 0.0)) || lllIlIlllIIIIlI(lllIlIlllIIllll(lllllllllllllIIIlIlIlIIlIIlIIIII, lllllllllllllIIIlIlIlIIlIlIIlIII))) {
                                        lllllllllllllIIIlIlIlIIlIlIIlIII = lllllllllllllIIIlIlIlIIlIIlIIIII;
                                        lllllllllllllIIIlIlIlIIlIlIIIlII = lllllllllllllIIIlIlIlIIlIIlIlllI;
                                        lllllllllllllIIIlIlIlIIlIlIIIIll = lllllllllllllIIIlIlIlIIlIIlIlIlI;
                                        lllllllllllllIIIlIlIlIIlIlIIIIlI = lllllllllllllIIIlIlIlIIlIIlIllII;
                                        lllllllllllllIIIlIlIlIIlIlIIIIIl = lllllllllllllIIIlIlIlIIlIIlIlIIl % Teleporter.lIlIlIIIlIlIll[5];
                                    }
                                    ++lllllllllllllIIIlIlIlIIlIIlIlIIl;
                                }
                            }
                        }
                        --lllllllllllllIIIlIlIlIIlIIlIlIlI;
                    }
                    ++lllllllllllllIIIlIlIlIIlIIlIllII;
                }
                ++lllllllllllllIIIlIlIlIIlIIlIlllI;
            }
        }
        final int lllllllllllllIIIlIlIlIIlIIIlllll = lllllllllllllIIIlIlIlIIlIlIIIlII;
        int lllllllllllllIIIlIlIlIIlIIIllllI = lllllllllllllIIIlIlIlIIlIlIIIIll;
        final int lllllllllllllIIIlIlIlIIlIIIlllIl = lllllllllllllIIIlIlIlIIlIlIIIIlI;
        int lllllllllllllIIIlIlIlIIlIIIlllII = lllllllllllllIIIlIlIlIIlIlIIIIIl % Teleporter.lIlIlIIIlIlIll[5];
        int lllllllllllllIIIlIlIlIIlIIIllIll = Teleporter.lIlIlIIIlIlIll[0] - lllllllllllllIIIlIlIlIIlIIIlllII;
        if (lllIlIlllIIIlII(lllllllllllllIIIlIlIlIIlIlIIIIIl % Teleporter.lIlIlIIIlIlIll[10], Teleporter.lIlIlIIIlIlIll[5])) {
            lllllllllllllIIIlIlIlIIlIIIlllII = -lllllllllllllIIIlIlIlIIlIIIlllII;
            lllllllllllllIIIlIlIlIIlIIIllIll = -lllllllllllllIIIlIlIlIIlIIIllIll;
        }
        if (lllIlIlllIIIIlI(lllIlIlllIIllll(lllllllllllllIIIlIlIlIIlIlIIlIII, 0.0))) {
            lllllllllllllIIIlIlIlIIlIlIIIIll = (lllllllllllllIIIlIlIlIIlIIIllllI = MathHelper.clamp_int(lllllllllllllIIIlIlIlIIlIlIIIIll, Teleporter.lIlIlIIIlIlIll[11], this.worldServerInstance.getActualHeight() - Teleporter.lIlIlIIIlIlIll[12]));
            int lllllllllllllIIIlIlIlIIlIIIllIlI = Teleporter.lIlIlIIIlIlIll[3];
            "".length();
            if ((0x20 ^ 0x25) <= 0) {
                return ((0x3B ^ 0x74) & ~(0x3B ^ 0x74)) != 0x0;
            }
            while (!lllIlIlllIIIlIl(lllllllllllllIIIlIlIlIIlIIIllIlI, Teleporter.lIlIlIIIlIlIll[0])) {
                int lllllllllllllIIIlIlIlIIlIIIllIIl = Teleporter.lIlIlIIIlIlIll[0];
                "".length();
                if (((0x61 ^ 0x4F) & ~(0x45 ^ 0x6B)) != 0x0) {
                    return ((0x4F ^ 0xE) & ~(0x3C ^ 0x7D)) != 0x0;
                }
                while (!lllIlIlllIIIlII(lllllllllllllIIIlIlIlIIlIIIllIIl, Teleporter.lIlIlIIIlIlIll[4])) {
                    int lllllllllllllIIIlIlIlIIlIIIllIII = Teleporter.lIlIlIIIlIlIll[3];
                    "".length();
                    if ("   ".length() <= 0) {
                        return ((0x1D ^ 0x4C) & ~(0xDA ^ 0x8B)) != 0x0;
                    }
                    while (!lllIlIlllIIIlII(lllllllllllllIIIlIlIlIIlIIIllIII, Teleporter.lIlIlIIIlIlIll[4])) {
                        final int lllllllllllllIIIlIlIlIIlIIIlIlll = lllllllllllllIIIlIlIlIIlIIIlllll + (lllllllllllllIIIlIlIlIIlIIIllIIl - Teleporter.lIlIlIIIlIlIll[0]) * lllllllllllllIIIlIlIlIIlIIIlllII + lllllllllllllIIIlIlIlIIlIIIllIlI * lllllllllllllIIIlIlIlIIlIIIllIll;
                        final int lllllllllllllIIIlIlIlIIlIIIlIllI = lllllllllllllIIIlIlIlIIlIIIllllI + lllllllllllllIIIlIlIlIIlIIIllIII;
                        final int lllllllllllllIIIlIlIlIIlIIIlIlIl = lllllllllllllIIIlIlIlIIlIIIlllIl + (lllllllllllllIIIlIlIlIIlIIIllIIl - Teleporter.lIlIlIIIlIlIll[0]) * lllllllllllllIIIlIlIlIIlIIIllIll - lllllllllllllIIIlIlIlIIlIIIllIlI * lllllllllllllIIIlIlIlIIlIIIlllII;
                        int n;
                        if (lllIlIlllIIIIlI(lllllllllllllIIIlIlIlIIlIIIllIII)) {
                            n = Teleporter.lIlIlIIIlIlIll[0];
                            "".length();
                            if ((0x1 ^ 0x4) <= 0) {
                                return ((0xE0 ^ 0xA6) & ~(0x68 ^ 0x2E)) != 0x0;
                            }
                        }
                        else {
                            n = Teleporter.lIlIlIIIlIlIll[1];
                        }
                        final boolean lllllllllllllIIIlIlIlIIlIIIlIlII = n != 0;
                        final WorldServer worldServerInstance = this.worldServerInstance;
                        final BlockPos lllllllllllllIIIlIlIIIIIIllIIIlI = new BlockPos(lllllllllllllIIIlIlIlIIlIIIlIlll, lllllllllllllIIIlIlIlIIlIIIlIllI, lllllllllllllIIIlIlIlIIlIIIlIlIl);
                        IBlockState lllllllllllllIIIlIlIIIIIIllIIIIl;
                        if (lllIlIlllIIIIll(lllllllllllllIIIlIlIlIIlIIIlIlII ? 1 : 0)) {
                            lllllllllllllIIIlIlIIIIIIllIIIIl = Blocks.obsidian.getDefaultState();
                            "".length();
                            if ("  ".length() == 0) {
                                return ((0x4 ^ 0xC ^ (0xA1 ^ 0xB7)) & (0x60 ^ 0x3 ^ (0x29 ^ 0x54) ^ -" ".length())) != 0x0;
                            }
                        }
                        else {
                            lllllllllllllIIIlIlIIIIIIllIIIIl = Blocks.air.getDefaultState();
                        }
                        worldServerInstance.setBlockState(lllllllllllllIIIlIlIIIIIIllIIIlI, lllllllllllllIIIlIlIIIIIIllIIIIl);
                        "".length();
                        ++lllllllllllllIIIlIlIlIIlIIIllIII;
                    }
                    ++lllllllllllllIIIlIlIlIIlIIIllIIl;
                }
                ++lllllllllllllIIIlIlIlIIlIIIllIlI;
            }
        }
        final IBlockState defaultState = Blocks.portal.getDefaultState();
        final PropertyEnum<EnumFacing.Axis> axis = BlockPortal.AXIS;
        EnumFacing.Axis axis2;
        if (lllIlIlllIIIIll(lllllllllllllIIIlIlIlIIlIIIlllII)) {
            axis2 = EnumFacing.Axis.X;
            "".length();
            if (((0x65 ^ 0x5 ^ (0x35 ^ 0x18)) & (0xF ^ 0x58 ^ (0x6 ^ 0x1C) ^ -" ".length())) < 0) {
                return ((0x7 ^ 0x5C ^ (0x2C ^ 0x47)) & ("   ".length() ^ (0x5E ^ 0x6D) ^ -" ".length())) != 0x0;
            }
        }
        else {
            axis2 = EnumFacing.Axis.Z;
        }
        final IBlockState lllllllllllllIIIlIlIlIIlIIIlIIll = defaultState.withProperty((IProperty<Comparable>)axis, axis2);
        int lllllllllllllIIIlIlIlIIlIIIlIIlI = Teleporter.lIlIlIIIlIlIll[1];
        "".length();
        if ("   ".length() < 0) {
            return ((0x26 ^ 0x75 ^ (0x76 ^ 0x1C)) & (177 + 138 - 263 + 126 ^ 97 + 112 - 184 + 114 ^ -" ".length())) != 0x0;
        }
        while (!lllIlIlllIIIlII(lllllllllllllIIIlIlIlIIlIIIlIIlI, Teleporter.lIlIlIIIlIlIll[10])) {
            int lllllllllllllIIIlIlIlIIlIIIlIIIl = Teleporter.lIlIlIIIlIlIll[1];
            "".length();
            if (((0x3 ^ 0x5C) & ~(0x48 ^ 0x17)) != 0x0) {
                return ((0x56 ^ 0x19) & ~(0x50 ^ 0x1F)) != 0x0;
            }
            while (!lllIlIlllIIIlII(lllllllllllllIIIlIlIlIIlIIIlIIIl, Teleporter.lIlIlIIIlIlIll[10])) {
                int lllllllllllllIIIlIlIlIIlIIIlIIII = Teleporter.lIlIlIIIlIlIll[3];
                "".length();
                if ("   ".length() < "  ".length()) {
                    return ((0x31 ^ 0x7) & ~(0x59 ^ 0x6F)) != 0x0;
                }
                while (!lllIlIlllIIIlII(lllllllllllllIIIlIlIlIIlIIIlIIII, Teleporter.lIlIlIIIlIlIll[10])) {
                    final int lllllllllllllIIIlIlIlIIlIIIIllll = lllllllllllllIIIlIlIlIIlIIIlllll + (lllllllllllllIIIlIlIlIIlIIIlIIIl - Teleporter.lIlIlIIIlIlIll[0]) * lllllllllllllIIIlIlIlIIlIIIlllII;
                    final int lllllllllllllIIIlIlIlIIlIIIIlllI = lllllllllllllIIIlIlIlIIlIIIllllI + lllllllllllllIIIlIlIlIIlIIIlIIII;
                    final int lllllllllllllIIIlIlIlIIlIIIIllIl = lllllllllllllIIIlIlIlIIlIIIlllIl + (lllllllllllllIIIlIlIlIIlIIIlIIIl - Teleporter.lIlIlIIIlIlIll[0]) * lllllllllllllIIIlIlIlIIlIIIllIll;
                    int n2;
                    if (lllIlIlllIIIIll(lllllllllllllIIIlIlIlIIlIIIlIIIl) && lllIlIlllIIIIII(lllllllllllllIIIlIlIlIIlIIIlIIIl, Teleporter.lIlIlIIIlIlIll[4]) && lllIlIlllIIIIII(lllllllllllllIIIlIlIlIIlIIIlIIII, Teleporter.lIlIlIIIlIlIll[3]) && lllIlIlllIIIIII(lllllllllllllIIIlIlIlIIlIIIlIIII, Teleporter.lIlIlIIIlIlIll[4])) {
                        n2 = Teleporter.lIlIlIIIlIlIll[1];
                        "".length();
                        if ((0x32 ^ 0x36) < -" ".length()) {
                            return ((0x51 ^ 0x32) & ~(0x34 ^ 0x57)) != 0x0;
                        }
                    }
                    else {
                        n2 = Teleporter.lIlIlIIIlIlIll[0];
                    }
                    final boolean lllllllllllllIIIlIlIlIIlIIIIllII = n2 != 0;
                    final WorldServer worldServerInstance2 = this.worldServerInstance;
                    final BlockPos lllllllllllllIIIlIlIIIIIlIIIIIlI = new BlockPos(lllllllllllllIIIlIlIlIIlIIIIllll, lllllllllllllIIIlIlIlIIlIIIIlllI, lllllllllllllIIIlIlIlIIlIIIIllIl);
                    IBlockState defaultState2;
                    if (lllIlIlllIIIIll(lllllllllllllIIIlIlIlIIlIIIIllII ? 1 : 0)) {
                        defaultState2 = Blocks.obsidian.getDefaultState();
                        "".length();
                        if ((0x48 ^ 0x4E ^ "  ".length()) <= 0) {
                            return ((109 + 9 - 106 + 122 ^ 88 + 14 + 26 + 48) & (0x15 ^ 0x28 ^ (0x53 ^ 0x58) ^ -" ".length())) != 0x0;
                        }
                    }
                    else {
                        defaultState2 = lllllllllllllIIIlIlIlIIlIIIlIIll;
                    }
                    worldServerInstance2.setBlockState(lllllllllllllIIIlIlIIIIIlIIIIIlI, defaultState2, Teleporter.lIlIlIIIlIlIll[5]);
                    "".length();
                    ++lllllllllllllIIIlIlIlIIlIIIlIIII;
                }
                ++lllllllllllllIIIlIlIlIIlIIIlIIIl;
            }
            int lllllllllllllIIIlIlIlIIlIIIIlIll = Teleporter.lIlIlIIIlIlIll[1];
            "".length();
            if ((" ".length() & (" ".length() ^ -" ".length())) != 0x0) {
                return ((41 + 36 + 28 + 86 ^ 69 + 114 - 54 + 22) & (0xE2 ^ 0x93 ^ (0x27 ^ 0x7E) ^ -" ".length())) != 0x0;
            }
            while (!lllIlIlllIIIlII(lllllllllllllIIIlIlIlIIlIIIIlIll, Teleporter.lIlIlIIIlIlIll[10])) {
                int lllllllllllllIIIlIlIlIIlIIIIlIlI = Teleporter.lIlIlIIIlIlIll[3];
                "".length();
                if ((32 + 18 - 25 + 148 ^ 63 + 124 - 52 + 34) <= 0) {
                    return ((0xA ^ 0x39 ^ (0xBB ^ 0x87)) & (0xDC ^ 0xC5 ^ (0x80 ^ 0x96) ^ -" ".length())) != 0x0;
                }
                while (!lllIlIlllIIIlII(lllllllllllllIIIlIlIlIIlIIIIlIlI, Teleporter.lIlIlIIIlIlIll[10])) {
                    final int lllllllllllllIIIlIlIlIIlIIIIlIIl = lllllllllllllIIIlIlIlIIlIIIlllll + (lllllllllllllIIIlIlIlIIlIIIIlIll - Teleporter.lIlIlIIIlIlIll[0]) * lllllllllllllIIIlIlIlIIlIIIlllII;
                    final int lllllllllllllIIIlIlIlIIlIIIIlIII = lllllllllllllIIIlIlIlIIlIIIllllI + lllllllllllllIIIlIlIlIIlIIIIlIlI;
                    final int lllllllllllllIIIlIlIlIIlIIIIIlll = lllllllllllllIIIlIlIlIIlIIIlllIl + (lllllllllllllIIIlIlIlIIlIIIIlIll - Teleporter.lIlIlIIIlIlIll[0]) * lllllllllllllIIIlIlIlIIlIIIllIll;
                    final BlockPos lllllllllllllIIIlIlIlIIlIIIIIllI = new BlockPos(lllllllllllllIIIlIlIlIIlIIIIlIIl, lllllllllllllIIIlIlIlIIlIIIIlIII, lllllllllllllIIIlIlIlIIlIIIIIlll);
                    this.worldServerInstance.notifyNeighborsOfStateChange(lllllllllllllIIIlIlIlIIlIIIIIllI, this.worldServerInstance.getBlockState(lllllllllllllIIIlIlIlIIlIIIIIllI).getBlock());
                    ++lllllllllllllIIIlIlIlIIlIIIIlIlI;
                }
                ++lllllllllllllIIIlIlIlIIlIIIIlIll;
            }
            ++lllllllllllllIIIlIlIlIIlIIIlIIlI;
        }
        return Teleporter.lIlIlIIIlIlIll[0] != 0;
    }
    
    private static boolean lllIlIlllIIlllI(final int lllllllllllllIIIlIlIlIIIlIllllll) {
        return lllllllllllllIIIlIlIlIIIlIllllll >= 0;
    }
    
    private static int lllIlIlllIIllll(final double n, final double n2) {
        return dcmpg(n, n2);
    }
    
    public void placeInPortal(final Entity lllllllllllllIIIlIlIlIIlllIlIlII, final float lllllllllllllIIIlIlIlIIlllIIIlII) {
        if (lllIlIlllIIIIII(this.worldServerInstance.provider.getDimensionId(), Teleporter.lIlIlIIIlIlIll[0])) {
            if (lllIlIlllIIIIIl(this.placeInExistingPortal(lllllllllllllIIIlIlIlIIlllIlIlII, lllllllllllllIIIlIlIlIIlllIIIlII) ? 1 : 0)) {
                this.makePortal(lllllllllllllIIIlIlIlIIlllIlIlII);
                "".length();
                this.placeInExistingPortal(lllllllllllllIIIlIlIlIIlllIlIlII, lllllllllllllIIIlIlIlIIlllIIIlII);
                "".length();
                "".length();
                if ("   ".length() < 0) {
                    return;
                }
            }
        }
        else {
            final int lllllllllllllIIIlIlIlIIlllIlIIlI = MathHelper.floor_double(lllllllllllllIIIlIlIlIIlllIlIlII.posX);
            final int lllllllllllllIIIlIlIlIIlllIlIIIl = MathHelper.floor_double(lllllllllllllIIIlIlIlIIlllIlIlII.posY) - Teleporter.lIlIlIIIlIlIll[0];
            final int lllllllllllllIIIlIlIlIIlllIlIIII = MathHelper.floor_double(lllllllllllllIIIlIlIlIIlllIlIlII.posZ);
            final int lllllllllllllIIIlIlIlIIlllIIllll = Teleporter.lIlIlIIIlIlIll[0];
            final int lllllllllllllIIIlIlIlIIlllIIlllI = Teleporter.lIlIlIIIlIlIll[1];
            int lllllllllllllIIIlIlIlIIlllIIllIl = Teleporter.lIlIlIIIlIlIll[2];
            "".length();
            if (((0x2 ^ 0xB ^ (0xF6 ^ 0xBE)) & (0xD0 ^ 0xAE ^ (0xFD ^ 0xC2) ^ -" ".length())) < 0) {
                return;
            }
            while (!lllIlIlllIIIlIl(lllllllllllllIIIlIlIlIIlllIIllIl, Teleporter.lIlIlIIIlIlIll[5])) {
                int lllllllllllllIIIlIlIlIIlllIIllII = Teleporter.lIlIlIIIlIlIll[2];
                "".length();
                if ((0x3B ^ 0x45 ^ (0x6 ^ 0x7C)) < -" ".length()) {
                    return;
                }
                while (!lllIlIlllIIIlIl(lllllllllllllIIIlIlIlIIlllIIllII, Teleporter.lIlIlIIIlIlIll[5])) {
                    int lllllllllllllIIIlIlIlIIlllIIlIll = Teleporter.lIlIlIIIlIlIll[3];
                    "".length();
                    if ("  ".length() < -" ".length()) {
                        return;
                    }
                    while (!lllIlIlllIIIlII(lllllllllllllIIIlIlIlIIlllIIlIll, Teleporter.lIlIlIIIlIlIll[4])) {
                        final int lllllllllllllIIIlIlIlIIlllIIlIlI = lllllllllllllIIIlIlIlIIlllIlIIlI + lllllllllllllIIIlIlIlIIlllIIllII * lllllllllllllIIIlIlIlIIlllIIllll + lllllllllllllIIIlIlIlIIlllIIllIl * lllllllllllllIIIlIlIlIIlllIIlllI;
                        final int lllllllllllllIIIlIlIlIIlllIIlIIl = lllllllllllllIIIlIlIlIIlllIlIIIl + lllllllllllllIIIlIlIlIIlllIIlIll;
                        final int lllllllllllllIIIlIlIlIIlllIIlIII = lllllllllllllIIIlIlIlIIlllIlIIII + lllllllllllllIIIlIlIlIIlllIIllII * lllllllllllllIIIlIlIlIIlllIIlllI - lllllllllllllIIIlIlIlIIlllIIllIl * lllllllllllllIIIlIlIlIIlllIIllll;
                        int n;
                        if (lllIlIlllIIIIlI(lllllllllllllIIIlIlIlIIlllIIlIll)) {
                            n = Teleporter.lIlIlIIIlIlIll[0];
                            "".length();
                            if (-(0x9D ^ 0x98) >= 0) {
                                return;
                            }
                        }
                        else {
                            n = Teleporter.lIlIlIIIlIlIll[1];
                        }
                        final boolean lllllllllllllIIIlIlIlIIlllIIIlll = n != 0;
                        final WorldServer worldServerInstance = this.worldServerInstance;
                        final BlockPos lllllllllllllIIIlIlIIIIIIllIIIlI = new BlockPos(lllllllllllllIIIlIlIlIIlllIIlIlI, lllllllllllllIIIlIlIlIIlllIIlIIl, lllllllllllllIIIlIlIlIIlllIIlIII);
                        IBlockState lllllllllllllIIIlIlIIIIIIllIIIIl;
                        if (lllIlIlllIIIIll(lllllllllllllIIIlIlIlIIlllIIIlll ? 1 : 0)) {
                            lllllllllllllIIIlIlIIIIIIllIIIIl = Blocks.obsidian.getDefaultState();
                            "".length();
                            if ((0xB ^ 0xE) == 0x0) {
                                return;
                            }
                        }
                        else {
                            lllllllllllllIIIlIlIIIIIIllIIIIl = Blocks.air.getDefaultState();
                        }
                        worldServerInstance.setBlockState(lllllllllllllIIIlIlIIIIIIllIIIlI, lllllllllllllIIIlIlIIIIIIllIIIIl);
                        "".length();
                        ++lllllllllllllIIIlIlIlIIlllIIlIll;
                    }
                    ++lllllllllllllIIIlIlIlIIlllIIllII;
                }
                ++lllllllllllllIIIlIlIlIIlllIIllIl;
            }
            lllllllllllllIIIlIlIlIIlllIlIlII.setLocationAndAngles(lllllllllllllIIIlIlIlIIlllIlIIlI, lllllllllllllIIIlIlIlIIlllIlIIIl, lllllllllllllIIIlIlIlIIlllIlIIII, lllllllllllllIIIlIlIlIIlllIlIlII.rotationYaw, 0.0f);
            final double motionX = 0.0;
            lllllllllllllIIIlIlIlIIlllIlIlII.motionZ = motionX;
            lllllllllllllIIIlIlIlIIlllIlIlII.motionY = motionX;
            lllllllllllllIIIlIlIlIIlllIlIlII.motionX = motionX;
        }
    }
    
    static {
        lllIlIllIllllll();
    }
    
    private static void lllIlIllIllllll() {
        (lIlIlIIIlIlIll = new int[13])[0] = " ".length();
        Teleporter.lIlIlIIIlIlIll[1] = ((0x4 ^ 0x26) & ~(0x8B ^ 0xA9));
        Teleporter.lIlIlIIIlIlIll[2] = -"  ".length();
        Teleporter.lIlIlIIIlIlIll[3] = -" ".length();
        Teleporter.lIlIlIIIlIlIll[4] = "   ".length();
        Teleporter.lIlIlIIIlIlIll[5] = "  ".length();
        Teleporter.lIlIlIIIlIlIll[6] = (0xFB ^ 0xBA) + (0x88 ^ 0xA1) - (0x38 ^ 0xD) + (0x74 ^ 0x3F);
        Teleporter.lIlIlIIIlIlIll[7] = -(8 + 88 - 70 + 102);
        Teleporter.lIlIlIIIlIlIll[8] = (0xD ^ 0x31 ^ (0xC ^ 0x6A));
        Teleporter.lIlIlIIIlIlIll[9] = (0x20 ^ 0x4D ^ (0xDD ^ 0xA0));
        Teleporter.lIlIlIIIlIlIll[10] = (0x8D ^ 0x9F ^ (0x82 ^ 0x94));
        Teleporter.lIlIlIIIlIlIll[11] = (0xDD ^ 0x9B);
        Teleporter.lIlIlIIIlIlIll[12] = (0x64 ^ 0x46 ^ (0x79 ^ 0x51));
    }
    
    public boolean placeInExistingPortal(final Entity lllllllllllllIIIlIlIlIIllIIIIIII, final float lllllllllllllIIIlIlIlIIllIIlllII) {
        final int lllllllllllllIIIlIlIlIIllIIllIll = Teleporter.lIlIlIIIlIlIll[6];
        double lllllllllllllIIIlIlIlIIllIIllIlI = -1.0;
        final int lllllllllllllIIIlIlIlIIllIIllIIl = MathHelper.floor_double(lllllllllllllIIIlIlIlIIllIIIIIII.posX);
        final int lllllllllllllIIIlIlIlIIllIIllIII = MathHelper.floor_double(lllllllllllllIIIlIlIlIIllIIIIIII.posZ);
        boolean lllllllllllllIIIlIlIlIIllIIlIlll = Teleporter.lIlIlIIIlIlIll[0] != 0;
        BlockPos lllllllllllllIIIlIlIlIIllIIlIllI = BlockPos.ORIGIN;
        final long lllllllllllllIIIlIlIlIIllIIlIlIl = ChunkCoordIntPair.chunkXZ2Int(lllllllllllllIIIlIlIlIIllIIllIIl, lllllllllllllIIIlIlIlIIllIIllIII);
        if (lllIlIlllIIIIll(this.destinationCoordinateCache.containsItem(lllllllllllllIIIlIlIlIIllIIlIlIl) ? 1 : 0)) {
            final PortalPosition lllllllllllllIIIlIlIlIIllIIlIlII = this.destinationCoordinateCache.getValueByKey(lllllllllllllIIIlIlIlIIllIIlIlIl);
            lllllllllllllIIIlIlIlIIllIIllIlI = 0.0;
            lllllllllllllIIIlIlIlIIllIIlIllI = lllllllllllllIIIlIlIlIIllIIlIlII;
            lllllllllllllIIIlIlIlIIllIIlIlII.lastUpdateTime = this.worldServerInstance.getTotalWorldTime();
            lllllllllllllIIIlIlIlIIllIIlIlll = (Teleporter.lIlIlIIIlIlIll[1] != 0);
            "".length();
            if (((66 + 174 - 165 + 114 ^ 99 + 43 - 8 + 53) & (96 + 95 - 109 + 49 ^ 34 + 33 - 23 + 89 ^ -" ".length())) >= " ".length()) {
                return ((0x30 ^ 0x63 ^ (0xC4 ^ 0x86)) & (0x9 ^ 0x34 ^ (0x38 ^ 0x14) ^ -" ".length())) != 0x0;
            }
        }
        else {
            final BlockPos lllllllllllllIIIlIlIlIIllIIlIIll = new BlockPos(lllllllllllllIIIlIlIlIIllIIIIIII);
            int lllllllllllllIIIlIlIlIIllIIlIIlI = Teleporter.lIlIlIIIlIlIll[7];
            "".length();
            if (-"   ".length() > 0) {
                return ((62 + 54 - 77 + 89 ^ 19 + 113 - 27 + 73) & (0x63 ^ 0x40 ^ (0xBC ^ 0xAD) ^ -" ".length())) != 0x0;
            }
            while (!lllIlIlllIIIlIl(lllllllllllllIIIlIlIlIIllIIlIIlI, Teleporter.lIlIlIIIlIlIll[6])) {
                int lllllllllllllIIIlIlIlIIllIIlIIII = Teleporter.lIlIlIIIlIlIll[7];
                "".length();
                if ((0x39 ^ 0x3D) != (0x87 ^ 0x83)) {
                    return ((0x36 ^ 0x3F) & ~(0x87 ^ 0x8E)) != 0x0;
                }
                while (!lllIlIlllIIIlIl(lllllllllllllIIIlIlIlIIllIIlIIII, Teleporter.lIlIlIIIlIlIll[6])) {
                    BlockPos lllllllllllllIIIlIlIlIIllIIIllll = lllllllllllllIIIlIlIlIIllIIlIIll.add(lllllllllllllIIIlIlIlIIllIIlIIlI, this.worldServerInstance.getActualHeight() - Teleporter.lIlIlIIIlIlIll[0] - lllllllllllllIIIlIlIlIIllIIlIIll.getY(), lllllllllllllIIIlIlIlIIllIIlIIII);
                    "".length();
                    if (" ".length() > "   ".length()) {
                        return ((0x3D ^ 0x6D) & ~(0x15 ^ 0x45)) != 0x0;
                    }
                    while (!lllIlIlllIIIIlI(lllllllllllllIIIlIlIlIIllIIIllll.getY())) {
                        BlockPos lllllllllllllIIIlIlIlIIllIIlIIIl = lllllllllllllIIIlIlIlIIllIIIllll.down();
                        if (lllIlIlllIIllII(this.worldServerInstance.getBlockState(lllllllllllllIIIlIlIlIIllIIIllll).getBlock(), Blocks.portal)) {
                            "".length();
                            if ("  ".length() < 0) {
                                return ((0x70 ^ 0x43) & ~(0x46 ^ 0x75)) != 0x0;
                            }
                            while (!lllIlIlllIIllIl(this.worldServerInstance.getBlockState(lllllllllllllIIIlIlIlIIllIIlIIIl = lllllllllllllIIIlIlIlIIllIIIllll.down()).getBlock(), Blocks.portal)) {
                                lllllllllllllIIIlIlIlIIllIIIllll = lllllllllllllIIIlIlIlIIllIIlIIIl;
                            }
                            final double lllllllllllllIIIlIlIlIIllIIIlllI = lllllllllllllIIIlIlIlIIllIIIllll.distanceSq(lllllllllllllIIIlIlIlIIllIIlIIll);
                            if (!lllIlIlllIIlllI(lllIlIlllIIlIlI(lllllllllllllIIIlIlIlIIllIIllIlI, 0.0)) || lllIlIlllIIIIlI(lllIlIlllIIlIlI(lllllllllllllIIIlIlIlIIllIIIlllI, lllllllllllllIIIlIlIlIIllIIllIlI))) {
                                lllllllllllllIIIlIlIlIIllIIllIlI = lllllllllllllIIIlIlIlIIllIIIlllI;
                                lllllllllllllIIIlIlIlIIllIIlIllI = lllllllllllllIIIlIlIlIIllIIIllll;
                            }
                        }
                        lllllllllllllIIIlIlIlIIllIIIllll = lllllllllllllIIIlIlIlIIllIIlIIIl;
                    }
                    ++lllllllllllllIIIlIlIlIIllIIlIIII;
                }
                ++lllllllllllllIIIlIlIlIIllIIlIIlI;
            }
        }
        if (lllIlIlllIIlllI(lllIlIlllIIlIll(lllllllllllllIIIlIlIlIIllIIllIlI, 0.0))) {
            if (lllIlIlllIIIIll(lllllllllllllIIIlIlIlIIllIIlIlll ? 1 : 0)) {
                this.destinationCoordinateCache.add(lllllllllllllIIIlIlIlIIllIIlIlIl, new PortalPosition(lllllllllllllIIIlIlIlIIllIIlIllI, this.worldServerInstance.getTotalWorldTime()));
                this.destinationCoordinateKeys.add(lllllllllllllIIIlIlIlIIllIIlIlIl);
                "".length();
            }
            double lllllllllllllIIIlIlIlIIllIIIllIl = lllllllllllllIIIlIlIlIIllIIlIllI.getX() + 0.5;
            double lllllllllllllIIIlIlIlIIllIIIllII = lllllllllllllIIIlIlIlIIllIIlIllI.getY() + 0.5;
            double lllllllllllllIIIlIlIlIIllIIIlIll = lllllllllllllIIIlIlIlIIllIIlIllI.getZ() + 0.5;
            final BlockPattern.PatternHelper lllllllllllllIIIlIlIlIIllIIIlIlI = Blocks.portal.func_181089_f(this.worldServerInstance, lllllllllllllIIIlIlIlIIllIIlIllI);
            int n;
            if (lllIlIlllIIllII(lllllllllllllIIIlIlIlIIllIIIlIlI.getFinger().rotateY().getAxisDirection(), EnumFacing.AxisDirection.NEGATIVE)) {
                n = Teleporter.lIlIlIIIlIlIll[0];
                "".length();
                if (null != null) {
                    return ((0x82 ^ 0xBA) & ~(0x12 ^ 0x2A)) != 0x0;
                }
            }
            else {
                n = Teleporter.lIlIlIIIlIlIll[1];
            }
            final boolean lllllllllllllIIIlIlIlIIllIIIlIIl = n != 0;
            double n2;
            if (lllIlIlllIIllII(lllllllllllllIIIlIlIlIIllIIIlIlI.getFinger().getAxis(), EnumFacing.Axis.X)) {
                n2 = lllllllllllllIIIlIlIlIIllIIIlIlI.func_181117_a().getZ();
                "".length();
                if ((0x3E ^ 0x61 ^ (0x57 ^ 0xC)) < "  ".length()) {
                    return ((0xA3 ^ 0x9E ^ (0xA ^ 0x6)) & (0x37 ^ 0x4C ^ (0x6B ^ 0x21) ^ -" ".length())) != 0x0;
                }
            }
            else {
                n2 = lllllllllllllIIIlIlIlIIllIIIlIlI.func_181117_a().getX();
            }
            double lllllllllllllIIIlIlIlIIllIIIlIII = n2;
            lllllllllllllIIIlIlIlIIllIIIllII = lllllllllllllIIIlIlIlIIllIIIlIlI.func_181117_a().getY() + Teleporter.lIlIlIIIlIlIll[0] - lllllllllllllIIIlIlIlIIllIIIIIII.func_181014_aG().yCoord * lllllllllllllIIIlIlIlIIllIIIlIlI.func_181119_e();
            if (lllIlIlllIIIIll(lllllllllllllIIIlIlIlIIllIIIlIIl ? 1 : 0)) {
                ++lllllllllllllIIIlIlIlIIllIIIlIII;
            }
            if (lllIlIlllIIllII(lllllllllllllIIIlIlIlIIllIIIlIlI.getFinger().getAxis(), EnumFacing.Axis.X)) {
                lllllllllllllIIIlIlIlIIllIIIlIll = lllllllllllllIIIlIlIlIIllIIIlIII + (1.0 - lllllllllllllIIIlIlIlIIllIIIIIII.func_181014_aG().xCoord) * lllllllllllllIIIlIlIlIIllIIIlIlI.func_181118_d() * lllllllllllllIIIlIlIlIIllIIIlIlI.getFinger().rotateY().getAxisDirection().getOffset();
                "".length();
                if ("  ".length() != "  ".length()) {
                    return ((0xF9 ^ 0xA7 ^ (0x9C ^ 0xA3)) & (121 + 45 - 25 + 65 ^ 8 + 96 - 89 + 160 ^ -" ".length())) != 0x0;
                }
            }
            else {
                lllllllllllllIIIlIlIlIIllIIIllIl = lllllllllllllIIIlIlIlIIllIIIlIII + (1.0 - lllllllllllllIIIlIlIlIIllIIIIIII.func_181014_aG().xCoord) * lllllllllllllIIIlIlIlIIllIIIlIlI.func_181118_d() * lllllllllllllIIIlIlIlIIllIIIlIlI.getFinger().rotateY().getAxisDirection().getOffset();
            }
            float lllllllllllllIIIlIlIlIIllIIIIlll = 0.0f;
            float lllllllllllllIIIlIlIlIIllIIIIllI = 0.0f;
            float lllllllllllllIIIlIlIlIIllIIIIlIl = 0.0f;
            float lllllllllllllIIIlIlIlIIllIIIIlII = 0.0f;
            if (lllIlIlllIIllII(lllllllllllllIIIlIlIlIIllIIIlIlI.getFinger().getOpposite(), lllllllllllllIIIlIlIlIIllIIIIIII.func_181012_aH())) {
                lllllllllllllIIIlIlIlIIllIIIIlll = 1.0f;
                lllllllllllllIIIlIlIlIIllIIIIllI = 1.0f;
                "".length();
                if ("  ".length() < " ".length()) {
                    return ("   ".length() & ~"   ".length()) != 0x0;
                }
            }
            else if (lllIlIlllIIllII(lllllllllllllIIIlIlIlIIllIIIlIlI.getFinger().getOpposite(), lllllllllllllIIIlIlIlIIllIIIIIII.func_181012_aH().getOpposite())) {
                lllllllllllllIIIlIlIlIIllIIIIlll = -1.0f;
                lllllllllllllIIIlIlIlIIllIIIIllI = -1.0f;
                "".length();
                if (" ".length() == 0) {
                    return ((0xEA ^ 0xBA) & ~(0x4B ^ 0x1B)) != 0x0;
                }
            }
            else if (lllIlIlllIIllII(lllllllllllllIIIlIlIlIIllIIIlIlI.getFinger().getOpposite(), lllllllllllllIIIlIlIlIIllIIIIIII.func_181012_aH().rotateY())) {
                lllllllllllllIIIlIlIlIIllIIIIlIl = 1.0f;
                lllllllllllllIIIlIlIlIIllIIIIlII = -1.0f;
                "".length();
                if ("  ".length() <= -" ".length()) {
                    return (("  ".length() ^ (0x84 ^ 0x91)) & (0xD7 ^ 0x9C ^ (0x29 ^ 0x75) ^ -" ".length())) != 0x0;
                }
            }
            else {
                lllllllllllllIIIlIlIlIIllIIIIlIl = -1.0f;
                lllllllllllllIIIlIlIlIIllIIIIlII = 1.0f;
            }
            final double lllllllllllllIIIlIlIlIIllIIIIIll = lllllllllllllIIIlIlIlIIllIIIIIII.motionX;
            final double lllllllllllllIIIlIlIlIIllIIIIIlI = lllllllllllllIIIlIlIlIIllIIIIIII.motionZ;
            lllllllllllllIIIlIlIlIIllIIIIIII.motionX = lllllllllllllIIIlIlIlIIllIIIIIll * lllllllllllllIIIlIlIlIIllIIIIlll + lllllllllllllIIIlIlIlIIllIIIIIlI * lllllllllllllIIIlIlIlIIllIIIIlII;
            lllllllllllllIIIlIlIlIIllIIIIIII.motionZ = lllllllllllllIIIlIlIlIIllIIIIIll * lllllllllllllIIIlIlIlIIllIIIIlIl + lllllllllllllIIIlIlIlIIllIIIIIlI * lllllllllllllIIIlIlIlIIllIIIIllI;
            lllllllllllllIIIlIlIlIIllIIIIIII.rotationYaw = lllllllllllllIIIlIlIlIIllIIlllII - lllllllllllllIIIlIlIlIIllIIIIIII.func_181012_aH().getOpposite().getHorizontalIndex() * Teleporter.lIlIlIIIlIlIll[8] + lllllllllllllIIIlIlIlIIllIIIlIlI.getFinger().getHorizontalIndex() * Teleporter.lIlIlIIIlIlIll[8];
            lllllllllllllIIIlIlIlIIllIIIIIII.setLocationAndAngles(lllllllllllllIIIlIlIlIIllIIIllIl, lllllllllllllIIIlIlIlIIllIIIllII, lllllllllllllIIIlIlIlIIllIIIlIll, lllllllllllllIIIlIlIlIIllIIIIIII.rotationYaw, lllllllllllllIIIlIlIlIIllIIIIIII.rotationPitch);
            return Teleporter.lIlIlIIIlIlIll[0] != 0;
        }
        return Teleporter.lIlIlIIIlIlIll[1] != 0;
    }
    
    private static boolean lllIlIlllIIIIlI(final int lllllllllllllIIIlIlIlIIIlIllllIl) {
        return lllllllllllllIIIlIlIlIIIlIllllIl < 0;
    }
    
    private static int lllIlIlllIIlIll(final double n, final double n2) {
        return dcmpl(n, n2);
    }
    
    public class PortalPosition extends BlockPos
    {
        public /* synthetic */ long lastUpdateTime;
        
        public PortalPosition(final BlockPos lllllllllllllIIlIIlllIIlIIIlIIlI, final long lllllllllllllIIlIIlllIIlIIIlIlIl) {
            super(lllllllllllllIIlIIlllIIlIIIlIIlI.getX(), lllllllllllllIIlIIlllIIlIIIlIIlI.getY(), lllllllllllllIIlIIlllIIlIIIlIIlI.getZ());
            this.lastUpdateTime = lllllllllllllIIlIIlllIIlIIIlIlIl;
        }
    }
}
