// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.block.state.pattern;

import java.util.Iterator;
import com.google.common.collect.Maps;
import net.minecraft.block.Block;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import net.minecraft.block.state.BlockState;
import net.minecraft.block.properties.IProperty;
import java.util.Map;
import net.minecraft.block.state.IBlockState;
import com.google.common.base.Predicate;

public class BlockStateHelper implements Predicate<IBlockState>
{
    private final /* synthetic */ Map<IProperty, Predicate> propertyPredicates;
    private static final /* synthetic */ int[] lIlIllIlIlIIll;
    private final /* synthetic */ BlockState blockstate;
    private static final /* synthetic */ String[] lIlIllIlIlIIlI;
    
    private static String llllIIIllIlIlIl(final String lllllllllllllIIIIllIlIlIlllllllI, final String lllllllllllllIIIIllIlIlIllllllIl) {
        try {
            final SecretKeySpec lllllllllllllIIIIllIlIllIIIIIIll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIIIIllIlIlIllllllIl.getBytes(StandardCharsets.UTF_8)), BlockStateHelper.lIlIllIlIlIIll[2]), "DES");
            final Cipher lllllllllllllIIIIllIlIllIIIIIIlI = Cipher.getInstance("DES");
            lllllllllllllIIIIllIlIllIIIIIIlI.init(BlockStateHelper.lIlIllIlIlIIll[3], lllllllllllllIIIIllIlIllIIIIIIll);
            return new String(lllllllllllllIIIIllIlIllIIIIIIlI.doFinal(Base64.getDecoder().decode(lllllllllllllIIIIllIlIlIlllllllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIIIllIlIllIIIIIIIl) {
            lllllllllllllIIIIllIlIllIIIIIIIl.printStackTrace();
            return null;
        }
    }
    
    private static void llllIIIllIllIII() {
        (lIlIllIlIlIIlI = new String[BlockStateHelper.lIlIllIlIlIIll[1]])[BlockStateHelper.lIlIllIlIlIIll[0]] = llllIIIllIlIlIl("PL9yXs+5ms5SlGAD5rM/BIjHqNlVGL51tpIYqaP0DFs=", "jvoAX");
    }
    
    private static void llllIIIllIllIll() {
        (lIlIllIlIlIIll = new int[4])[0] = ((36 + 118 - 125 + 122 ^ 159 + 106 - 257 + 155) & (149 + 131 - 105 + 15 ^ 56 + 112 - 72 + 42 ^ -" ".length()));
        BlockStateHelper.lIlIllIlIlIIll[1] = " ".length();
        BlockStateHelper.lIlIllIlIlIIll[2] = (107 + 71 - 115 + 74 ^ 115 + 112 - 106 + 8);
        BlockStateHelper.lIlIllIlIlIIll[3] = "  ".length();
    }
    
    private static boolean llllIIIllIlllIl(final int lllllllllllllIIIIllIlIlIllllIlll) {
        return lllllllllllllIIIIllIlIlIllllIlll != 0;
    }
    
    public static BlockStateHelper forBlock(final Block lllllllllllllIIIIllIlIllIIlIIlII) {
        return new BlockStateHelper(lllllllllllllIIIIllIlIllIIlIIlII.getBlockState());
    }
    
    public <V extends Comparable<V>> BlockStateHelper where(final IProperty<V> lllllllllllllIIIIllIlIllIIIIllIl, final Predicate<? extends V> lllllllllllllIIIIllIlIllIIIIllII) {
        if (llllIIIllIllllI(this.blockstate.getProperties().contains(lllllllllllllIIIIllIlIllIIIIllIl) ? 1 : 0)) {
            throw new IllegalArgumentException(String.valueOf(new StringBuilder().append(this.blockstate).append(BlockStateHelper.lIlIllIlIlIIlI[BlockStateHelper.lIlIllIlIlIIll[0]]).append(lllllllllllllIIIIllIlIllIIIIllIl)));
        }
        this.propertyPredicates.put(lllllllllllllIIIIllIlIllIIIIllIl, lllllllllllllIIIIllIlIllIIIIllII);
        "".length();
        return this;
    }
    
    private static boolean llllIIIllIllllI(final int lllllllllllllIIIIllIlIlIllllIlIl) {
        return lllllllllllllIIIIllIlIlIllllIlIl == 0;
    }
    
    static {
        llllIIIllIllIll();
        llllIIIllIllIII();
    }
    
    private BlockStateHelper(final BlockState lllllllllllllIIIIllIlIllIIlIlIII) {
        this.propertyPredicates = (Map<IProperty, Predicate>)Maps.newHashMap();
        this.blockstate = lllllllllllllIIIIllIlIllIIlIlIII;
    }
    
    public boolean apply(final IBlockState lllllllllllllIIIIllIlIllIIIlllII) {
        if (!llllIIIllIlllII(lllllllllllllIIIIllIlIllIIIlllII) || !llllIIIllIlllIl(lllllllllllllIIIIllIlIllIIIlllII.getBlock().equals(this.blockstate.getBlock()) ? 1 : 0)) {
            return BlockStateHelper.lIlIllIlIlIIll[0] != 0;
        }
        final char lllllllllllllIIIIllIlIllIIIlIllI = (char)this.propertyPredicates.entrySet().iterator();
        "".length();
        if (-"   ".length() >= 0) {
            return ((0x2F ^ 0x4D) & ~(0x1 ^ 0x63)) != 0x0;
        }
        while (!llllIIIllIllllI(((Iterator)lllllllllllllIIIIllIlIllIIIlIllI).hasNext() ? 1 : 0)) {
            final Map.Entry<IProperty, Predicate> lllllllllllllIIIIllIlIllIIIllIll = ((Iterator<Map.Entry<IProperty, Predicate>>)lllllllllllllIIIIllIlIllIIIlIllI).next();
            final Object lllllllllllllIIIIllIlIllIIIllIlI = lllllllllllllIIIIllIlIllIIIlllII.getValue(lllllllllllllIIIIllIlIllIIIllIll.getKey());
            if (llllIIIllIllllI(lllllllllllllIIIIllIlIllIIIllIll.getValue().apply(lllllllllllllIIIIllIlIllIIIllIlI) ? 1 : 0)) {
                return BlockStateHelper.lIlIllIlIlIIll[0] != 0;
            }
        }
        return BlockStateHelper.lIlIllIlIlIIll[1] != 0;
    }
    
    private static boolean llllIIIllIlllII(final Object lllllllllllllIIIIllIlIlIlllllIIl) {
        return lllllllllllllIIIIllIlIlIlllllIIl != null;
    }
}
