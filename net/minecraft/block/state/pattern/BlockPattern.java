// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.block.state.pattern;

import java.util.Iterator;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.security.MessageDigest;
import com.google.common.base.Objects;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import net.minecraft.util.Vec3i;
import com.google.common.cache.CacheLoader;
import com.google.common.cache.CacheBuilder;
import com.google.common.cache.LoadingCache;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.BlockPos;
import net.minecraft.world.World;
import net.minecraft.block.state.BlockWorldState;
import com.google.common.base.Predicate;

public class BlockPattern
{
    private final /* synthetic */ int fingerLength;
    private final /* synthetic */ int thumbLength;
    private final /* synthetic */ Predicate<BlockWorldState>[][][] blockMatches;
    private static final /* synthetic */ String[] lIIlIlIIllIIII;
    private static final /* synthetic */ int[] lIIlIlIIllIIll;
    private final /* synthetic */ int palmLength;
    
    static {
        llIIllllllllIII();
        llIIlllllllIlll();
    }
    
    private static boolean llIIllllllllllI(final int lllllllllllllIIllIlIIIllIllIIIlI, final int lllllllllllllIIllIlIIIllIllIIIIl) {
        return lllllllllllllIIllIlIIIllIllIIIlI < lllllllllllllIIllIlIIIllIllIIIIl;
    }
    
    private static boolean llIIllllllllIIl(final int lllllllllllllIIllIlIIIllIlIlIlll) {
        return lllllllllllllIIllIlIIIllIlIlIlll > 0;
    }
    
    public int getPalmLength() {
        return this.palmLength;
    }
    
    public PatternHelper match(final World lllllllllllllIIllIlIIIlllIlllIIl, final BlockPos lllllllllllllIIllIlIIIlllIlllIII) {
        final LoadingCache<BlockPos, BlockWorldState> lllllllllllllIIllIlIIIlllIllIlll = func_181627_a(lllllllllllllIIllIlIIIlllIlllIIl, (boolean)(BlockPattern.lIIlIlIIllIIll[0] != 0));
        final int lllllllllllllIIllIlIIIlllIllIllI = Math.max(Math.max(this.palmLength, this.thumbLength), this.fingerLength);
        final short lllllllllllllIIllIlIIIlllIlIlIll = (short)BlockPos.getAllInBox(lllllllllllllIIllIlIIIlllIlllIII, lllllllllllllIIllIlIIIlllIlllIII.add(lllllllllllllIIllIlIIIlllIllIllI - BlockPattern.lIIlIlIIllIIll[1], lllllllllllllIIllIlIIIlllIllIllI - BlockPattern.lIIlIlIIllIIll[1], lllllllllllllIIllIlIIIlllIllIllI - BlockPattern.lIIlIlIIllIIll[1])).iterator();
        "".length();
        if (null != null) {
            return null;
        }
        while (!llIIllllllllIlI(((Iterator)lllllllllllllIIllIlIIIlllIlIlIll).hasNext() ? 1 : 0)) {
            final BlockPos lllllllllllllIIllIlIIIlllIllIlIl = ((Iterator<BlockPos>)lllllllllllllIIllIlIIIlllIlIlIll).next();
            final int lllllllllllllIIllIlIIIlllIlIIlll;
            final short lllllllllllllIIllIlIIIlllIlIlIII = (short)((EnumFacing[])(Object)(lllllllllllllIIllIlIIIlllIlIIlll = (int)(Object)EnumFacing.values())).length;
            int lllllllllllllIIllIlIIIlllIlIlIIl = BlockPattern.lIIlIlIIllIIll[0];
            "".length();
            if ("   ".length() != "   ".length()) {
                return null;
            }
            while (!llIIllllllllIll(lllllllllllllIIllIlIIIlllIlIlIIl, lllllllllllllIIllIlIIIlllIlIlIII)) {
                final EnumFacing lllllllllllllIIllIlIIIlllIllIlII = lllllllllllllIIllIlIIIlllIlIIlll[lllllllllllllIIllIlIIIlllIlIlIIl];
                final double lllllllllllllIIllIlIIIlllIlIIIll;
                final char lllllllllllllIIllIlIIIlllIlIIlII = (char)((EnumFacing[])(Object)(lllllllllllllIIllIlIIIlllIlIIIll = (double)(Object)EnumFacing.values())).length;
                boolean lllllllllllllIIllIlIIIlllIlIIlIl = BlockPattern.lIIlIlIIllIIll[0] != 0;
                "".length();
                if (" ".length() >= "  ".length()) {
                    return null;
                }
                while (!llIIllllllllIll(lllllllllllllIIllIlIIIlllIlIIlIl ? 1 : 0, lllllllllllllIIllIlIIIlllIlIIlII)) {
                    final EnumFacing lllllllllllllIIllIlIIIlllIllIIll = lllllllllllllIIllIlIIIlllIlIIIll[lllllllllllllIIllIlIIIlllIlIIlIl];
                    if (llIIlllllllllII(lllllllllllllIIllIlIIIlllIllIIll, lllllllllllllIIllIlIIIlllIllIlII) && llIIlllllllllII(lllllllllllllIIllIlIIIlllIllIIll, lllllllllllllIIllIlIIIlllIllIlII.getOpposite())) {
                        final PatternHelper lllllllllllllIIllIlIIIlllIllIIlI = this.checkPatternAt(lllllllllllllIIllIlIIIlllIllIlIl, lllllllllllllIIllIlIIIlllIllIlII, lllllllllllllIIllIlIIIlllIllIIll, lllllllllllllIIllIlIIIlllIllIlll);
                        if (llIIlllllllllIl(lllllllllllllIIllIlIIIlllIllIIlI)) {
                            return lllllllllllllIIllIlIIIlllIllIIlI;
                        }
                    }
                    ++lllllllllllllIIllIlIIIlllIlIIlIl;
                }
                ++lllllllllllllIIllIlIIIlllIlIlIIl;
            }
        }
        return null;
    }
    
    private PatternHelper checkPatternAt(final BlockPos lllllllllllllIIllIlIIIllllIllIIl, final EnumFacing lllllllllllllIIllIlIIIllllIlIIII, final EnumFacing lllllllllllllIIllIlIIIllllIlIlll, final LoadingCache<BlockPos, BlockWorldState> lllllllllllllIIllIlIIIllllIlIllI) {
        int lllllllllllllIIllIlIIIllllIlIlIl = BlockPattern.lIIlIlIIllIIll[0];
        "".length();
        if (((0xB ^ 0x1D) & ~(0x79 ^ 0x6F)) != 0x0) {
            return null;
        }
        while (!llIIllllllllIll(lllllllllllllIIllIlIIIllllIlIlIl, this.palmLength)) {
            int lllllllllllllIIllIlIIIllllIlIlII = BlockPattern.lIIlIlIIllIIll[0];
            "".length();
            if ("  ".length() <= -" ".length()) {
                return null;
            }
            while (!llIIllllllllIll(lllllllllllllIIllIlIIIllllIlIlII, this.thumbLength)) {
                int lllllllllllllIIllIlIIIllllIlIIll = BlockPattern.lIIlIlIIllIIll[0];
                "".length();
                if ("  ".length() == ((122 + 109 - 183 + 119 ^ 58 + 36 - 76 + 140) & (0x77 ^ 0x6E ^ (0x8D ^ 0xAD) ^ -" ".length()))) {
                    return null;
                }
                while (!llIIllllllllIll(lllllllllllllIIllIlIIIllllIlIIll, this.fingerLength)) {
                    if (llIIllllllllIlI(this.blockMatches[lllllllllllllIIllIlIIIllllIlIIll][lllllllllllllIIllIlIIIllllIlIlII][lllllllllllllIIllIlIIIllllIlIlIl].apply((Object)lllllllllllllIIllIlIIIllllIlIllI.getUnchecked((Object)translateOffset(lllllllllllllIIllIlIIIllllIllIIl, lllllllllllllIIllIlIIIllllIlIIII, lllllllllllllIIllIlIIIllllIlIlll, lllllllllllllIIllIlIIIllllIlIlIl, lllllllllllllIIllIlIIIllllIlIlII, lllllllllllllIIllIlIIIllllIlIIll))) ? 1 : 0)) {
                        return null;
                    }
                    ++lllllllllllllIIllIlIIIllllIlIIll;
                }
                ++lllllllllllllIIllIlIIIllllIlIlII;
            }
            ++lllllllllllllIIllIlIIIllllIlIlIl;
        }
        return new PatternHelper(lllllllllllllIIllIlIIIllllIllIIl, lllllllllllllIIllIlIIIllllIlIIII, lllllllllllllIIllIlIIIllllIlIlll, lllllllllllllIIllIlIIIllllIlIllI, this.palmLength, this.thumbLength, this.fingerLength);
    }
    
    private static boolean llIIlllllllllIl(final Object lllllllllllllIIllIlIIIllIlIllIll) {
        return lllllllllllllIIllIlIIIllIlIllIll != null;
    }
    
    private static boolean llIIlllllllllII(final Object lllllllllllllIIllIlIIIllIlIllllI, final Object lllllllllllllIIllIlIIIllIlIlllIl) {
        return lllllllllllllIIllIlIIIllIlIllllI != lllllllllllllIIllIlIIIllIlIlllIl;
    }
    
    public static LoadingCache<BlockPos, BlockWorldState> func_181627_a(final World lllllllllllllIIllIlIIIlllIIlllIl, final boolean lllllllllllllIIllIlIIIlllIIllllI) {
        return (LoadingCache<BlockPos, BlockWorldState>)CacheBuilder.newBuilder().build((com.google.common.cache.CacheLoader)new CacheLoader(lllllllllllllIIllIlIIIlllIIlllIl, lllllllllllllIIllIlIIIlllIIllllI));
    }
    
    protected static BlockPos translateOffset(final BlockPos lllllllllllllIIllIlIIIlllIIlIIlI, final EnumFacing lllllllllllllIIllIlIIIlllIIIlIII, final EnumFacing lllllllllllllIIllIlIIIlllIIIIlll, final int lllllllllllllIIllIlIIIlllIIIllll, final int lllllllllllllIIllIlIIIlllIIIlllI, final int lllllllllllllIIllIlIIIlllIIIllIl) {
        if (llIIlllllllllII(lllllllllllllIIllIlIIIlllIIIlIII, lllllllllllllIIllIlIIIlllIIIIlll) && llIIlllllllllII(lllllllllllllIIllIlIIIlllIIIlIII, lllllllllllllIIllIlIIIlllIIIIlll.getOpposite())) {
            final Vec3i lllllllllllllIIllIlIIIlllIIIllII = new Vec3i(lllllllllllllIIllIlIIIlllIIIlIII.getFrontOffsetX(), lllllllllllllIIllIlIIIlllIIIlIII.getFrontOffsetY(), lllllllllllllIIllIlIIIlllIIIlIII.getFrontOffsetZ());
            final Vec3i lllllllllllllIIllIlIIIlllIIIlIll = new Vec3i(lllllllllllllIIllIlIIIlllIIIIlll.getFrontOffsetX(), lllllllllllllIIllIlIIIlllIIIIlll.getFrontOffsetY(), lllllllllllllIIllIlIIIlllIIIIlll.getFrontOffsetZ());
            final Vec3i lllllllllllllIIllIlIIIlllIIIlIlI = lllllllllllllIIllIlIIIlllIIIllII.crossProduct(lllllllllllllIIllIlIIIlllIIIlIll);
            return lllllllllllllIIllIlIIIlllIIlIIlI.add(lllllllllllllIIllIlIIIlllIIIlIll.getX() * -lllllllllllllIIllIlIIIlllIIIlllI + lllllllllllllIIllIlIIIlllIIIlIlI.getX() * lllllllllllllIIllIlIIIlllIIIllll + lllllllllllllIIllIlIIIlllIIIllII.getX() * lllllllllllllIIllIlIIIlllIIIllIl, lllllllllllllIIllIlIIIlllIIIlIll.getY() * -lllllllllllllIIllIlIIIlllIIIlllI + lllllllllllllIIllIlIIIlllIIIlIlI.getY() * lllllllllllllIIllIlIIIlllIIIllll + lllllllllllllIIllIlIIIlllIIIllII.getY() * lllllllllllllIIllIlIIIlllIIIllIl, lllllllllllllIIllIlIIIlllIIIlIll.getZ() * -lllllllllllllIIllIlIIIlllIIIlllI + lllllllllllllIIllIlIIIlllIIIlIlI.getZ() * lllllllllllllIIllIlIIIlllIIIllll + lllllllllllllIIllIlIIIlllIIIllII.getZ() * lllllllllllllIIllIlIIIlllIIIllIl);
        }
        throw new IllegalArgumentException(BlockPattern.lIIlIlIIllIIII[BlockPattern.lIIlIlIIllIIll[0]]);
    }
    
    private static boolean llIIllllllllIll(final int lllllllllllllIIllIlIIIllIllIIllI, final int lllllllllllllIIllIlIIIllIllIIlIl) {
        return lllllllllllllIIllIlIIIllIllIIllI >= lllllllllllllIIllIlIIIllIllIIlIl;
    }
    
    private static String llIIlllllllIllI(String lllllllllllllIIllIlIIIllIlllIIIl, final String lllllllllllllIIllIlIIIllIlllIlIl) {
        lllllllllllllIIllIlIIIllIlllIIIl = (Exception)new String(Base64.getDecoder().decode(((String)lllllllllllllIIllIlIIIllIlllIIIl).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIIllIlIIIllIlllIlII = new StringBuilder();
        final char[] lllllllllllllIIllIlIIIllIlllIIll = lllllllllllllIIllIlIIIllIlllIlIl.toCharArray();
        int lllllllllllllIIllIlIIIllIlllIIlI = BlockPattern.lIIlIlIIllIIll[0];
        final char lllllllllllllIIllIlIIIllIllIllII = (Object)((String)lllllllllllllIIllIlIIIllIlllIIIl).toCharArray();
        final boolean lllllllllllllIIllIlIIIllIllIlIll = lllllllllllllIIllIlIIIllIllIllII.length != 0;
        byte lllllllllllllIIllIlIIIllIllIlIlI = (byte)BlockPattern.lIIlIlIIllIIll[0];
        while (llIIllllllllllI(lllllllllllllIIllIlIIIllIllIlIlI, lllllllllllllIIllIlIIIllIllIlIll ? 1 : 0)) {
            final char lllllllllllllIIllIlIIIllIlllIlll = lllllllllllllIIllIlIIIllIllIllII[lllllllllllllIIllIlIIIllIllIlIlI];
            lllllllllllllIIllIlIIIllIlllIlII.append((char)(lllllllllllllIIllIlIIIllIlllIlll ^ lllllllllllllIIllIlIIIllIlllIIll[lllllllllllllIIllIlIIIllIlllIIlI % lllllllllllllIIllIlIIIllIlllIIll.length]));
            "".length();
            ++lllllllllllllIIllIlIIIllIlllIIlI;
            ++lllllllllllllIIllIlIIIllIllIlIlI;
            "".length();
            if ((10 + 54 + 40 + 40 ^ 90 + 99 - 127 + 87) == 0x0) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIIllIlIIIllIlllIlII);
    }
    
    public BlockPattern(final Predicate<BlockWorldState>[][][] lllllllllllllIIllIlIIIlllllIlIIl) {
        this.blockMatches = lllllllllllllIIllIlIIIlllllIlIIl;
        this.fingerLength = lllllllllllllIIllIlIIIlllllIlIIl.length;
        if (llIIllllllllIIl(this.fingerLength)) {
            this.thumbLength = lllllllllllllIIllIlIIIlllllIlIIl[BlockPattern.lIIlIlIIllIIll[0]].length;
            if (llIIllllllllIIl(this.thumbLength)) {
                this.palmLength = lllllllllllllIIllIlIIIlllllIlIIl[BlockPattern.lIIlIlIIllIIll[0]][BlockPattern.lIIlIlIIllIIll[0]].length;
                "".length();
                if (" ".length() < 0) {
                    throw null;
                }
            }
            else {
                this.palmLength = BlockPattern.lIIlIlIIllIIll[0];
                "".length();
                if ("  ".length() <= 0) {
                    throw null;
                }
            }
        }
        else {
            this.thumbLength = BlockPattern.lIIlIlIIllIIll[0];
            this.palmLength = BlockPattern.lIIlIlIIllIIll[0];
        }
    }
    
    private static void llIIllllllllIII() {
        (lIIlIlIIllIIll = new int[2])[0] = ((0xE2 ^ 0x91 ^ (0x8B ^ 0xBE)) & (0xE8 ^ 0xB9 ^ (0x65 ^ 0x72) ^ -" ".length()));
        BlockPattern.lIIlIlIIllIIll[1] = " ".length();
    }
    
    private static void llIIlllllllIlll() {
        (lIIlIlIIllIIII = new String[BlockPattern.lIIlIlIIllIIll[1]])[BlockPattern.lIIlIlIIllIIll[0]] = llIIlllllllIllI("MzYkChwTPHINHwgvMxkUCXh0SwUKeDEEHRgxPAoEEzc8", "zXRkp");
    }
    
    private static boolean llIIllllllllIlI(final int lllllllllllllIIllIlIIIllIlIllIIl) {
        return lllllllllllllIIllIlIIIllIlIllIIl == 0;
    }
    
    public int getThumbLength() {
        return this.thumbLength;
    }
    
    public static class PatternHelper
    {
        private final /* synthetic */ EnumFacing thumb;
        private static final /* synthetic */ int[] lIIIIlllIlIIIl;
        private final /* synthetic */ BlockPos pos;
        private final /* synthetic */ LoadingCache<BlockPos, BlockWorldState> lcache;
        private final /* synthetic */ int field_181121_f;
        private final /* synthetic */ int field_181122_g;
        private final /* synthetic */ EnumFacing finger;
        private final /* synthetic */ int field_181120_e;
        private static final /* synthetic */ String[] lIIIIlllIlIIII;
        
        public BlockPos func_181117_a() {
            return this.pos;
        }
        
        private static void lIllllIIlIlIlII() {
            (lIIIIlllIlIIIl = new int[5])[0] = ((0x28 ^ 0x42 ^ (0x35 ^ 0x56)) & (0x77 ^ 0x4A ^ (0xA ^ 0x3E) ^ -" ".length()));
            PatternHelper.lIIIIlllIlIIIl[1] = " ".length();
            PatternHelper.lIIIIlllIlIIIl[2] = "  ".length();
            PatternHelper.lIIIIlllIlIIIl[3] = "   ".length();
            PatternHelper.lIIIIlllIlIIIl[4] = (0xBE ^ 0xB6);
        }
        
        public PatternHelper(final BlockPos lllllllllllllIlIIlIIIIIlIIIIIIIl, final EnumFacing lllllllllllllIlIIlIIIIIlIIIIIIII, final EnumFacing lllllllllllllIlIIlIIIIIIllllIlll, final LoadingCache<BlockPos, BlockWorldState> lllllllllllllIlIIlIIIIIIlllllllI, final int lllllllllllllIlIIlIIIIIIllllIlIl, final int lllllllllllllIlIIlIIIIIIllllIlII, final int lllllllllllllIlIIlIIIIIIlllllIll) {
            this.pos = lllllllllllllIlIIlIIIIIlIIIIIIIl;
            this.finger = lllllllllllllIlIIlIIIIIlIIIIIIII;
            this.thumb = lllllllllllllIlIIlIIIIIIllllIlll;
            this.lcache = lllllllllllllIlIIlIIIIIIlllllllI;
            this.field_181120_e = lllllllllllllIlIIlIIIIIIllllIlIl;
            this.field_181121_f = lllllllllllllIlIIlIIIIIIllllIlII;
            this.field_181122_g = lllllllllllllIlIIlIIIIIIlllllIll;
        }
        
        @Override
        public String toString() {
            return Objects.toStringHelper((Object)this).add(PatternHelper.lIIIIlllIlIIII[PatternHelper.lIIIIlllIlIIIl[0]], (Object)this.thumb).add(PatternHelper.lIIIIlllIlIIII[PatternHelper.lIIIIlllIlIIIl[1]], (Object)this.finger).add(PatternHelper.lIIIIlllIlIIII[PatternHelper.lIIIIlllIlIIIl[2]], (Object)this.pos).toString();
        }
        
        private static String lIllllIIlIlIIIl(final String lllllllllllllIlIIlIIIIIIllIIlIll, final String lllllllllllllIlIIlIIIIIIllIIlIlI) {
            try {
                final SecretKeySpec lllllllllllllIlIIlIIIIIIllIlIIII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIlIIlIIIIIIllIIlIlI.getBytes(StandardCharsets.UTF_8)), PatternHelper.lIIIIlllIlIIIl[4]), "DES");
                final Cipher lllllllllllllIlIIlIIIIIIllIIllll = Cipher.getInstance("DES");
                lllllllllllllIlIIlIIIIIIllIIllll.init(PatternHelper.lIIIIlllIlIIIl[2], lllllllllllllIlIIlIIIIIIllIlIIII);
                return new String(lllllllllllllIlIIlIIIIIIllIIllll.doFinal(Base64.getDecoder().decode(lllllllllllllIlIIlIIIIIIllIIlIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
            }
            catch (Exception lllllllllllllIlIIlIIIIIIllIIlllI) {
                lllllllllllllIlIIlIIIIIIllIIlllI.printStackTrace();
                return null;
            }
        }
        
        public BlockWorldState translateOffset(final int lllllllllllllIlIIlIIIIIIllIllIlI, final int lllllllllllllIlIIlIIIIIIllIlllIl, final int lllllllllllllIlIIlIIIIIIllIllIII) {
            return (BlockWorldState)this.lcache.getUnchecked((Object)BlockPattern.translateOffset(this.pos, this.getFinger(), this.getThumb(), lllllllllllllIlIIlIIIIIIllIllIlI, lllllllllllllIlIIlIIIIIIllIlllIl, lllllllllllllIlIIlIIIIIIllIllIII));
        }
        
        static {
            lIllllIIlIlIlII();
            lIllllIIlIlIIll();
        }
        
        public int func_181118_d() {
            return this.field_181120_e;
        }
        
        public EnumFacing getFinger() {
            return this.finger;
        }
        
        private static void lIllllIIlIlIIll() {
            (lIIIIlllIlIIII = new String[PatternHelper.lIIIIlllIlIIIl[3]])[PatternHelper.lIIIIlllIlIIIl[0]] = lIllllIIlIlIIIl("SMb/t52+8r8=", "GMtVA");
            PatternHelper.lIIIIlllIlIIII[PatternHelper.lIIIIlllIlIIIl[1]] = lIllllIIlIlIIIl("7eOaTM+0Lk2mpGhET9Iavw==", "XKSPd");
            PatternHelper.lIIIIlllIlIIII[PatternHelper.lIIIIlllIlIIIl[2]] = lIllllIIlIlIIIl("G1NFOjJWarT5Uj/CA2osdg==", "SIWon");
        }
        
        public int func_181119_e() {
            return this.field_181121_f;
        }
        
        public EnumFacing getThumb() {
            return this.thumb;
        }
    }
    
    static class CacheLoader extends com.google.common.cache.CacheLoader<BlockPos, BlockWorldState>
    {
        private final /* synthetic */ World world;
        private final /* synthetic */ boolean field_181626_b;
        
        public BlockWorldState load(final BlockPos llllllllllllIllllIlllIIlIlIIlIlI) throws Exception {
            return new BlockWorldState(this.world, llllllllllllIllllIlllIIlIlIIlIlI, this.field_181626_b);
        }
        
        public CacheLoader(final World llllllllllllIllllIlllIIlIlIllllI, final boolean llllllllllllIllllIlllIIlIlIlllIl) {
            this.world = llllllllllllIllllIlllIIlIlIllllI;
            this.field_181626_b = llllllllllllIllllIlllIIlIlIlllIl;
        }
    }
}
