// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.client.renderer.chunk;

import java.util.Queue;
import net.minecraft.util.IntegerCache;
import com.google.common.collect.Lists;
import java.util.EnumSet;
import net.minecraft.util.EnumFacing;
import java.util.Set;
import net.minecraft.util.BlockPos;
import java.util.BitSet;

public class VisGraph
{
    private static final /* synthetic */ int field_178616_a;
    private final /* synthetic */ BitSet field_178612_d;
    private static final /* synthetic */ int[] field_178613_e;
    private static final /* synthetic */ int field_178615_c;
    private static final /* synthetic */ int field_178614_b;
    private static final /* synthetic */ int[] lIIlllllIIllll;
    private /* synthetic */ int field_178611_f;
    
    private static boolean llIllllIlIIllII(final int lllllllllllllIIlIIlIIIllllIlIIII) {
        return lllllllllllllIIlIIlIIIllllIlIIII != 0;
    }
    
    public Set<EnumFacing> func_178609_b(final BlockPos lllllllllllllIIlIIlIIlIIIIIlIllI) {
        return this.func_178604_a(getIndex(lllllllllllllIIlIIlIIlIIIIIlIllI));
    }
    
    static {
        llIllllIlIIlIll();
        field_178616_a = (int)Math.pow(16.0, 0.0);
        field_178614_b = (int)Math.pow(16.0, 1.0);
        field_178615_c = (int)Math.pow(16.0, 2.0);
        field_178613_e = new int[VisGraph.lIIlllllIIllll[0]];
        final int lllllllllllllIIlIIlIIlIIIlIIlIIl = VisGraph.lIIlllllIIllll[1];
        final int lllllllllllllIIlIIlIIlIIIlIIlIII = VisGraph.lIIlllllIIllll[2];
        int lllllllllllllIIlIIlIIlIIIlIIIlll = VisGraph.lIIlllllIIllll[1];
        int lllllllllllllIIlIIlIIlIIIlIIIllI = VisGraph.lIIlllllIIllll[1];
        "".length();
        if (((0x80 ^ 0xB1) & ~(0x54 ^ 0x65)) >= " ".length()) {
            return;
        }
        while (!llIllllIlIIllll(lllllllllllllIIlIIlIIlIIIlIIIllI, VisGraph.lIIlllllIIllll[3])) {
            int lllllllllllllIIlIIlIIlIIIlIIIlIl = VisGraph.lIIlllllIIllll[1];
            "".length();
            if (null != null) {
                return;
            }
            while (!llIllllIlIIllll(lllllllllllllIIlIIlIIlIIIlIIIlIl, VisGraph.lIIlllllIIllll[3])) {
                int lllllllllllllIIlIIlIIlIIIlIIIlII = VisGraph.lIIlllllIIllll[1];
                "".length();
                if ((0x18 ^ 0x36 ^ (0x7F ^ 0x55)) < "   ".length()) {
                    return;
                }
                while (!llIllllIlIIllll(lllllllllllllIIlIIlIIlIIIlIIIlII, VisGraph.lIIlllllIIllll[3])) {
                    if (!llIllllIlIIllII(lllllllllllllIIlIIlIIlIIIlIIIllI) || !llIllllIlIIllIl(lllllllllllllIIlIIlIIlIIIlIIIllI, VisGraph.lIIlllllIIllll[2]) || !llIllllIlIIllII(lllllllllllllIIlIIlIIlIIIlIIIlIl) || !llIllllIlIIllIl(lllllllllllllIIlIIlIIlIIIlIIIlIl, VisGraph.lIIlllllIIllll[2]) || !llIllllIlIIllII(lllllllllllllIIlIIlIIlIIIlIIIlII) || llIllllIlIIlllI(lllllllllllllIIlIIlIIlIIIlIIIlII, VisGraph.lIIlllllIIllll[2])) {
                        VisGraph.field_178613_e[lllllllllllllIIlIIlIIlIIIlIIIlll++] = getIndex(lllllllllllllIIlIIlIIlIIIlIIIllI, lllllllllllllIIlIIlIIlIIIlIIIlIl, lllllllllllllIIlIIlIIlIIIlIIIlII);
                    }
                    ++lllllllllllllIIlIIlIIlIIIlIIIlII;
                }
                ++lllllllllllllIIlIIlIIlIIIlIIIlIl;
            }
            ++lllllllllllllIIlIIlIIlIIIlIIIllI;
        }
    }
    
    private void func_178610_a(final int lllllllllllllIIlIIlIIIlllllIllIl, final Set<EnumFacing> lllllllllllllIIlIIlIIIllllllIIIl) {
        final int lllllllllllllIIlIIlIIIllllllIIII = lllllllllllllIIlIIlIIIlllllIllIl >> VisGraph.lIIlllllIIllll[1] & VisGraph.lIIlllllIIllll[2];
        if (llIllllIlIlIIIl(lllllllllllllIIlIIlIIIllllllIIII)) {
            lllllllllllllIIlIIlIIIllllllIIIl.add(EnumFacing.WEST);
            "".length();
            "".length();
            if (" ".length() <= 0) {
                return;
            }
        }
        else if (llIllllIlIIlllI(lllllllllllllIIlIIlIIIllllllIIII, VisGraph.lIIlllllIIllll[2])) {
            lllllllllllllIIlIIlIIIllllllIIIl.add(EnumFacing.EAST);
            "".length();
        }
        final int lllllllllllllIIlIIlIIIlllllIllll = lllllllllllllIIlIIlIIIlllllIllIl >> VisGraph.lIIlllllIIllll[6] & VisGraph.lIIlllllIIllll[2];
        if (llIllllIlIlIIIl(lllllllllllllIIlIIlIIIlllllIllll)) {
            lllllllllllllIIlIIlIIIllllllIIIl.add(EnumFacing.DOWN);
            "".length();
            "".length();
            if ((0x80 ^ 0x84) <= -" ".length()) {
                return;
            }
        }
        else if (llIllllIlIIlllI(lllllllllllllIIlIIlIIIlllllIllll, VisGraph.lIIlllllIIllll[2])) {
            lllllllllllllIIlIIlIIIllllllIIIl.add(EnumFacing.UP);
            "".length();
        }
        final int lllllllllllllIIlIIlIIIlllllIlllI = lllllllllllllIIlIIlIIIlllllIllIl >> VisGraph.lIIlllllIIllll[7] & VisGraph.lIIlllllIIllll[2];
        if (llIllllIlIlIIIl(lllllllllllllIIlIIlIIIlllllIlllI)) {
            lllllllllllllIIlIIlIIIllllllIIIl.add(EnumFacing.NORTH);
            "".length();
            "".length();
            if ((0x1 ^ 0x37 ^ (0x7 ^ 0x34)) <= 0) {
                return;
            }
        }
        else if (llIllllIlIIlllI(lllllllllllllIIlIIlIIIlllllIlllI, VisGraph.lIIlllllIIllll[2])) {
            lllllllllllllIIlIIlIIIllllllIIIl.add(EnumFacing.SOUTH);
            "".length();
        }
    }
    
    public VisGraph() {
        this.field_178612_d = new BitSet(VisGraph.lIIlllllIIllll[4]);
        this.field_178611_f = VisGraph.lIIlllllIIllll[4];
    }
    
    private static boolean llIllllIlIlIIII(final int lllllllllllllIIlIIlIIIllllIlIlIl, final int lllllllllllllIIlIIlIIIllllIlIlII) {
        return lllllllllllllIIlIIlIIIllllIlIlIl < lllllllllllllIIlIIlIIIllllIlIlII;
    }
    
    private static int getIndex(final int lllllllllllllIIlIIlIIlIIIIlIlIll, final int lllllllllllllIIlIIlIIlIIIIlIllIl, final int lllllllllllllIIlIIlIIlIIIIlIllII) {
        return lllllllllllllIIlIIlIIlIIIIlIlIll << VisGraph.lIIlllllIIllll[1] | lllllllllllllIIlIIlIIlIIIIlIllIl << VisGraph.lIIlllllIIllll[6] | lllllllllllllIIlIIlIIlIIIIlIllII << VisGraph.lIIlllllIIllll[7];
    }
    
    public void func_178606_a(final BlockPos lllllllllllllIIlIIlIIlIIIIllIlIl) {
        this.field_178612_d.set(getIndex(lllllllllllllIIlIIlIIlIIIIllIlIl), (boolean)(VisGraph.lIIlllllIIllll[5] != 0));
        this.field_178611_f -= VisGraph.lIIlllllIIllll[5];
    }
    
    private static void llIllllIlIIlIll() {
        (lIIlllllIIllll = new int[14])[0] = (-(0xFFFFEBE8 & 0x7EBF) & (-1 & 0x6FEF));
        VisGraph.lIIlllllIIllll[1] = ((0x9C ^ 0x9B ^ (0x63 ^ 0x54)) & (61 + 9 + 61 + 46 ^ 81 + 52 - 11 + 7 ^ -" ".length()));
        VisGraph.lIIlllllIIllll[2] = (134 + 117 - 142 + 47 ^ 102 + 61 - 101 + 85);
        VisGraph.lIIlllllIIllll[3] = (0xDB ^ 0xB6 ^ (0xEA ^ 0x97));
        VisGraph.lIIlllllIIllll[4] = (0xFFFFBCE9 & 0x5316);
        VisGraph.lIIlllllIIllll[5] = " ".length();
        VisGraph.lIIlllllIIllll[6] = (133 + 93 - 125 + 60 ^ 133 + 144 - 274 + 166);
        VisGraph.lIIlllllIIllll[7] = (0x30 ^ 0x34);
        VisGraph.lIIlllllIIllll[8] = (-(0xFFFFFF3B & 0x76DD) & (0xFFFFF77B & 0x7F9C));
        VisGraph.lIIlllllIIllll[9] = -" ".length();
        VisGraph.lIIlllllIIllll[10] = (129 + 95 - 183 + 134 ^ 139 + 132 - 201 + 99);
        VisGraph.lIIlllllIIllll[11] = "   ".length();
        VisGraph.lIIlllllIIllll[12] = "  ".length();
        VisGraph.lIIlllllIIllll[13] = (0xE4 ^ 0x91 ^ (0x60 ^ 0x10));
    }
    
    private static boolean llIllllIlIIlllI(final int lllllllllllllIIlIIlIIIllllIlllIl, final int lllllllllllllIIlIIlIIIllllIlllII) {
        return lllllllllllllIIlIIlIIIllllIlllIl == lllllllllllllIIlIIlIIIllllIlllII;
    }
    
    private Set<EnumFacing> func_178604_a(final int lllllllllllllIIlIIlIIlIIIIIIlIII) {
        final Set<EnumFacing> lllllllllllllIIlIIlIIlIIIIIIIlll = EnumSet.noneOf(EnumFacing.class);
        final Queue<Integer> lllllllllllllIIlIIlIIlIIIIIIIllI = (Queue<Integer>)Lists.newLinkedList();
        lllllllllllllIIlIIlIIlIIIIIIIllI.add(IntegerCache.func_181756_a(lllllllllllllIIlIIlIIlIIIIIIlIII));
        "".length();
        this.field_178612_d.set(lllllllllllllIIlIIlIIlIIIIIIlIII, (boolean)(VisGraph.lIIlllllIIllll[5] != 0));
        "".length();
        if ("   ".length() <= -" ".length()) {
            return null;
        }
        while (!llIllllIlIIllII(lllllllllllllIIlIIlIIlIIIIIIIllI.isEmpty() ? 1 : 0)) {
            final int lllllllllllllIIlIIlIIlIIIIIIIlIl = lllllllllllllIIlIIlIIlIIIIIIIllI.poll();
            this.func_178610_a(lllllllllllllIIlIIlIIlIIIIIIIlIl, lllllllllllllIIlIIlIIlIIIIIIIlll);
            final short lllllllllllllIIlIIlIIIlllllllIlI;
            final float lllllllllllllIIlIIlIIIlllllllIll = ((EnumFacing[])(Object)(lllllllllllllIIlIIlIIIlllllllIlI = (short)(Object)EnumFacing.values())).length;
            float lllllllllllllIIlIIlIIIllllllllII = VisGraph.lIIlllllIIllll[1];
            "".length();
            if ((0x8D ^ 0x89) > (0xF ^ 0xB)) {
                return null;
            }
            while (!llIllllIlIIllll((int)lllllllllllllIIlIIlIIIllllllllII, (int)lllllllllllllIIlIIlIIIlllllllIll)) {
                final EnumFacing lllllllllllllIIlIIlIIlIIIIIIIlII = lllllllllllllIIlIIlIIIlllllllIlI[lllllllllllllIIlIIlIIIllllllllII];
                final int lllllllllllllIIlIIlIIlIIIIIIIIll = this.func_178603_a(lllllllllllllIIlIIlIIlIIIIIIIlIl, lllllllllllllIIlIIlIIlIIIIIIIlII);
                if (llIllllIlIlIIlI(lllllllllllllIIlIIlIIlIIIIIIIIll) && llIllllIlIlIIIl(this.field_178612_d.get(lllllllllllllIIlIIlIIlIIIIIIIIll) ? 1 : 0)) {
                    this.field_178612_d.set(lllllllllllllIIlIIlIIlIIIIIIIIll, (boolean)(VisGraph.lIIlllllIIllll[5] != 0));
                    lllllllllllllIIlIIlIIlIIIIIIIllI.add(IntegerCache.func_181756_a(lllllllllllllIIlIIlIIlIIIIIIIIll));
                    "".length();
                }
                ++lllllllllllllIIlIIlIIIllllllllII;
            }
        }
        return lllllllllllllIIlIIlIIlIIIIIIIlll;
    }
    
    private static boolean llIllllIlIIllll(final int lllllllllllllIIlIIlIIIllllIllIIl, final int lllllllllllllIIlIIlIIIllllIllIII) {
        return lllllllllllllIIlIIlIIIllllIllIIl >= lllllllllllllIIlIIlIIIllllIllIII;
    }
    
    private static int getIndex(final BlockPos lllllllllllllIIlIIlIIlIIIIllIIll) {
        return getIndex(lllllllllllllIIlIIlIIlIIIIllIIll.getX() & VisGraph.lIIlllllIIllll[2], lllllllllllllIIlIIlIIlIIIIllIIll.getY() & VisGraph.lIIlllllIIllll[2], lllllllllllllIIlIIlIIlIIIIllIIll.getZ() & VisGraph.lIIlllllIIllll[2]);
    }
    
    static /* synthetic */ int[] $SWITCH_TABLE$net$minecraft$util$EnumFacing() {
        final int[] $switch_TABLE$net$minecraft$util$EnumFacing = VisGraph.$SWITCH_TABLE$net$minecraft$util$EnumFacing;
        if (llIllllIlIlIIll($switch_TABLE$net$minecraft$util$EnumFacing)) {
            return $switch_TABLE$net$minecraft$util$EnumFacing;
        }
        "".length();
        final char lllllllllllllIIlIIlIIIlllllIIIII = (Object)new int[EnumFacing.values().length];
        try {
            lllllllllllllIIlIIlIIIlllllIIIII[EnumFacing.DOWN.ordinal()] = VisGraph.lIIlllllIIllll[5];
            "".length();
            if (((0xB5 ^ 0xA6) & ~(0x3E ^ 0x2D)) > (0x96 ^ 0x92)) {
                return null;
            }
        }
        catch (NoSuchFieldError noSuchFieldError) {
            "".length();
        }
        try {
            lllllllllllllIIlIIlIIIlllllIIIII[EnumFacing.EAST.ordinal()] = VisGraph.lIIlllllIIllll[10];
            "".length();
            if (null != null) {
                return null;
            }
        }
        catch (NoSuchFieldError noSuchFieldError2) {
            "".length();
        }
        try {
            lllllllllllllIIlIIlIIIlllllIIIII[EnumFacing.NORTH.ordinal()] = VisGraph.lIIlllllIIllll[11];
            "".length();
            if ("  ".length() >= "   ".length()) {
                return null;
            }
        }
        catch (NoSuchFieldError noSuchFieldError3) {
            "".length();
        }
        try {
            lllllllllllllIIlIIlIIIlllllIIIII[EnumFacing.SOUTH.ordinal()] = VisGraph.lIIlllllIIllll[7];
            "".length();
            if ("   ".length() < 0) {
                return null;
            }
        }
        catch (NoSuchFieldError noSuchFieldError4) {
            "".length();
        }
        try {
            lllllllllllllIIlIIlIIIlllllIIIII[EnumFacing.UP.ordinal()] = VisGraph.lIIlllllIIllll[12];
            "".length();
            if (-" ".length() >= 0) {
                return null;
            }
        }
        catch (NoSuchFieldError noSuchFieldError5) {
            "".length();
        }
        try {
            lllllllllllllIIlIIlIIIlllllIIIII[EnumFacing.WEST.ordinal()] = VisGraph.lIIlllllIIllll[13];
            "".length();
            if (null != null) {
                return null;
            }
        }
        catch (NoSuchFieldError noSuchFieldError6) {
            "".length();
        }
        return VisGraph.$SWITCH_TABLE$net$minecraft$util$EnumFacing = (int[])(Object)lllllllllllllIIlIIlIIIlllllIIIII;
    }
    
    private static boolean llIllllIlIlIIlI(final int lllllllllllllIIlIIlIIIllllIIllII) {
        return lllllllllllllIIlIIlIIIllllIIllII >= 0;
    }
    
    private static boolean llIllllIlIIllIl(final int lllllllllllllIIlIIlIIIllllIIlIIl, final int lllllllllllllIIlIIlIIIllllIIlIII) {
        return lllllllllllllIIlIIlIIIllllIIlIIl != lllllllllllllIIlIIlIIIllllIIlIII;
    }
    
    private static boolean llIllllIlIlIIll(final Object lllllllllllllIIlIIlIIIllllIlIIlI) {
        return lllllllllllllIIlIIlIIIllllIlIIlI != null;
    }
    
    private static boolean llIllllIlIlIIIl(final int lllllllllllllIIlIIlIIIllllIIlllI) {
        return lllllllllllllIIlIIlIIIllllIIlllI == 0;
    }
    
    private int func_178603_a(final int lllllllllllllIIlIIlIIIlllllIIlIl, final EnumFacing lllllllllllllIIlIIlIIIlllllIIlII) {
        switch ($SWITCH_TABLE$net$minecraft$util$EnumFacing()[lllllllllllllIIlIIlIIIlllllIIlII.ordinal()]) {
            case 1: {
                if (llIllllIlIlIIIl(lllllllllllllIIlIIlIIIlllllIIlIl >> VisGraph.lIIlllllIIllll[6] & VisGraph.lIIlllllIIllll[2])) {
                    return VisGraph.lIIlllllIIllll[9];
                }
                return lllllllllllllIIlIIlIIIlllllIIlIl - VisGraph.field_178615_c;
            }
            case 2: {
                if (llIllllIlIIlllI(lllllllllllllIIlIIlIIIlllllIIlIl >> VisGraph.lIIlllllIIllll[6] & VisGraph.lIIlllllIIllll[2], VisGraph.lIIlllllIIllll[2])) {
                    return VisGraph.lIIlllllIIllll[9];
                }
                return lllllllllllllIIlIIlIIIlllllIIlIl + VisGraph.field_178615_c;
            }
            case 3: {
                if (llIllllIlIlIIIl(lllllllllllllIIlIIlIIIlllllIIlIl >> VisGraph.lIIlllllIIllll[7] & VisGraph.lIIlllllIIllll[2])) {
                    return VisGraph.lIIlllllIIllll[9];
                }
                return lllllllllllllIIlIIlIIIlllllIIlIl - VisGraph.field_178614_b;
            }
            case 4: {
                if (llIllllIlIIlllI(lllllllllllllIIlIIlIIIlllllIIlIl >> VisGraph.lIIlllllIIllll[7] & VisGraph.lIIlllllIIllll[2], VisGraph.lIIlllllIIllll[2])) {
                    return VisGraph.lIIlllllIIllll[9];
                }
                return lllllllllllllIIlIIlIIIlllllIIlIl + VisGraph.field_178614_b;
            }
            case 5: {
                if (llIllllIlIlIIIl(lllllllllllllIIlIIlIIIlllllIIlIl >> VisGraph.lIIlllllIIllll[1] & VisGraph.lIIlllllIIllll[2])) {
                    return VisGraph.lIIlllllIIllll[9];
                }
                return lllllllllllllIIlIIlIIIlllllIIlIl - VisGraph.field_178616_a;
            }
            case 6: {
                if (llIllllIlIIlllI(lllllllllllllIIlIIlIIIlllllIIlIl >> VisGraph.lIIlllllIIllll[1] & VisGraph.lIIlllllIIllll[2], VisGraph.lIIlllllIIllll[2])) {
                    return VisGraph.lIIlllllIIllll[9];
                }
                return lllllllllllllIIlIIlIIIlllllIIlIl + VisGraph.field_178616_a;
            }
            default: {
                return VisGraph.lIIlllllIIllll[9];
            }
        }
    }
    
    public SetVisibility computeVisibility() {
        final SetVisibility lllllllllllllIIlIIlIIlIIIIlIIIIl = new SetVisibility();
        if (llIllllIlIlIIII(VisGraph.lIIlllllIIllll[4] - this.field_178611_f, VisGraph.lIIlllllIIllll[8])) {
            lllllllllllllIIlIIlIIlIIIIlIIIIl.setAllVisible((boolean)(VisGraph.lIIlllllIIllll[5] != 0));
            "".length();
            if (null != null) {
                return null;
            }
        }
        else if (llIllllIlIlIIIl(this.field_178611_f)) {
            lllllllllllllIIlIIlIIlIIIIlIIIIl.setAllVisible((boolean)(VisGraph.lIIlllllIIllll[1] != 0));
            "".length();
            if (null != null) {
                return null;
            }
        }
        else {
            final short lllllllllllllIIlIIlIIlIIIIIllIlI;
            final Exception lllllllllllllIIlIIlIIlIIIIIllIll = (Exception)((int[])(Object)(lllllllllllllIIlIIlIIlIIIIIllIlI = (short)(Object)VisGraph.field_178613_e)).length;
            String lllllllllllllIIlIIlIIlIIIIIlllII = (String)VisGraph.lIIlllllIIllll[1];
            "".length();
            if ((0x34 ^ 0x30) == "  ".length()) {
                return null;
            }
            while (!llIllllIlIIllll((int)lllllllllllllIIlIIlIIlIIIIIlllII, (int)lllllllllllllIIlIIlIIlIIIIIllIll)) {
                final int lllllllllllllIIlIIlIIlIIIIlIIIII = lllllllllllllIIlIIlIIlIIIIIllIlI[lllllllllllllIIlIIlIIlIIIIIlllII];
                if (llIllllIlIlIIIl(this.field_178612_d.get(lllllllllllllIIlIIlIIlIIIIlIIIII) ? 1 : 0)) {
                    lllllllllllllIIlIIlIIlIIIIlIIIIl.setManyVisible(this.func_178604_a(lllllllllllllIIlIIlIIlIIIIlIIIII));
                }
                ++lllllllllllllIIlIIlIIlIIIIIlllII;
            }
        }
        return lllllllllllllIIlIIlIIlIIIIlIIIIl;
    }
}
