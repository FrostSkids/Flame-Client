// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.block.state;

import java.util.Arrays;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.security.MessageDigest;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.Iterator;
import java.util.Collection;
import com.google.common.collect.Iterables;
import net.minecraft.block.Block;
import net.minecraft.block.properties.IProperty;
import java.util.Map;
import com.google.common.base.Function;
import com.google.common.base.Joiner;

public abstract class BlockStateBase implements IBlockState
{
    private static final /* synthetic */ int[] llIIlIlllIlIlI;
    private static final /* synthetic */ String[] llIIlIlllIlIIl;
    private static final /* synthetic */ Joiner COMMA_JOINER;
    private static final /* synthetic */ Function<Map.Entry<IProperty, Comparable>, String> MAP_ENTRY_TO_STRING;
    
    @Override
    public String toString() {
        final StringBuilder llllllllllllIlllIIIlIIIIlIlIIlIl = new StringBuilder();
        llllllllllllIlllIIIlIIIIlIlIIlIl.append(Block.blockRegistry.getNameForObject(this.getBlock()));
        "".length();
        if (lIIIllIlllllIlll(this.getProperties().isEmpty() ? 1 : 0)) {
            llllllllllllIlllIIIlIIIIlIlIIlIl.append(BlockStateBase.llIIlIlllIlIIl[BlockStateBase.llIIlIlllIlIlI[1]]);
            "".length();
            BlockStateBase.COMMA_JOINER.appendTo(llllllllllllIlllIIIlIIIIlIlIIlIl, Iterables.transform((Iterable)this.getProperties().entrySet(), (Function)BlockStateBase.MAP_ENTRY_TO_STRING));
            "".length();
            llllllllllllIlllIIIlIIIIlIlIIlIl.append(BlockStateBase.llIIlIlllIlIIl[BlockStateBase.llIIlIlllIlIlI[2]]);
            "".length();
        }
        return String.valueOf(llllllllllllIlllIIIlIIIIlIlIIlIl);
    }
    
    private static void lIIIllIlllllIlII() {
        (llIIlIlllIlIIl = new String[BlockStateBase.llIIlIlllIlIlI[3]])[BlockStateBase.llIIlIlllIlIlI[1]] = lIIIllIlllllIIll("GQ==", "BDweW");
        BlockStateBase.llIIlIlllIlIIl[BlockStateBase.llIIlIlllIlIlI[2]] = lIIIllIlllllIIll("Jw==", "zqnLY");
    }
    
    protected static <T> T cyclePropertyValue(final Collection<T> llllllllllllIlllIIIlIIIIlIlIlllI, final T llllllllllllIlllIIIlIIIIlIlIllIl) {
        final Iterator<T> llllllllllllIlllIIIlIIIIlIlIllII = llllllllllllIlllIIIlIIIIlIlIlllI.iterator();
        "".length();
        if (" ".length() == 0) {
            return null;
        }
        while (!lIIIllIlllllIlll(llllllllllllIlllIIIlIIIIlIlIllII.hasNext() ? 1 : 0)) {
            if (lIIIllIlllllIllI(llllllllllllIlllIIIlIIIIlIlIllII.next().equals(llllllllllllIlllIIIlIIIIlIlIllIl) ? 1 : 0)) {
                if (lIIIllIlllllIllI(llllllllllllIlllIIIlIIIIlIlIllII.hasNext() ? 1 : 0)) {
                    return llllllllllllIlllIIIlIIIIlIlIllII.next();
                }
                return llllllllllllIlllIIIlIIIIlIlIlllI.iterator().next();
            }
        }
        return llllllllllllIlllIIIlIIIIlIlIllII.next();
    }
    
    @Override
    public <T extends Comparable<T>> IBlockState cycleProperty(final IProperty<T> llllllllllllIlllIIIlIIIIlIllIlII) {
        return this.withProperty(llllllllllllIlllIIIlIIIIlIllIlII, (Comparable)cyclePropertyValue((Collection<V>)llllllllllllIlllIIIlIIIIlIllIlII.getAllowedValues(), (V)this.getValue((IProperty<T>)llllllllllllIlllIIIlIIIIlIllIlII)));
    }
    
    private static String lIIIllIlllllIIll(String llllllllllllIlllIIIlIIIIlIIlIIll, final String llllllllllllIlllIIIlIIIIlIIlIlll) {
        llllllllllllIlllIIIlIIIIlIIlIIll = new String(Base64.getDecoder().decode(llllllllllllIlllIIIlIIIIlIIlIIll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder llllllllllllIlllIIIlIIIIlIIlIllI = new StringBuilder();
        final char[] llllllllllllIlllIIIlIIIIlIIlIlIl = llllllllllllIlllIIIlIIIIlIIlIlll.toCharArray();
        int llllllllllllIlllIIIlIIIIlIIlIlII = BlockStateBase.llIIlIlllIlIlI[1];
        final boolean llllllllllllIlllIIIlIIIIlIIIlllI = (Object)llllllllllllIlllIIIlIIIIlIIlIIll.toCharArray();
        final boolean llllllllllllIlllIIIlIIIIlIIIllIl = llllllllllllIlllIIIlIIIIlIIIlllI.length != 0;
        Exception llllllllllllIlllIIIlIIIIlIIIllII = (Exception)BlockStateBase.llIIlIlllIlIlI[1];
        while (lIIIllIllllllIII((int)llllllllllllIlllIIIlIIIIlIIIllII, llllllllllllIlllIIIlIIIIlIIIllIl ? 1 : 0)) {
            final char llllllllllllIlllIIIlIIIIlIIllIIl = llllllllllllIlllIIIlIIIIlIIIlllI[llllllllllllIlllIIIlIIIIlIIIllII];
            llllllllllllIlllIIIlIIIIlIIlIllI.append((char)(llllllllllllIlllIIIlIIIIlIIllIIl ^ llllllllllllIlllIIIlIIIIlIIlIlIl[llllllllllllIlllIIIlIIIIlIIlIlII % llllllllllllIlllIIIlIIIIlIIlIlIl.length]));
            "".length();
            ++llllllllllllIlllIIIlIIIIlIIlIlII;
            ++llllllllllllIlllIIIlIIIIlIIIllII;
            "".length();
            if ((0x58 ^ 0x5C) <= -" ".length()) {
                return null;
            }
        }
        return String.valueOf(llllllllllllIlllIIIlIIIIlIIlIllI);
    }
    
    private static boolean lIIIllIlllllIlll(final int llllllllllllIlllIIIlIIIIlIIIIIll) {
        return llllllllllllIlllIIIlIIIIlIIIIIll == 0;
    }
    
    static {
        lIIIllIlllllIlIl();
        lIIIllIlllllIlII();
        COMMA_JOINER = Joiner.on((char)BlockStateBase.llIIlIlllIlIlI[0]);
        MAP_ENTRY_TO_STRING = (Function)new Function<Map.Entry<IProperty, Comparable>, String>() {
            private static final /* synthetic */ int[] llllIIllIIIlI;
            private static final /* synthetic */ String[] llllIIlIlllII;
            
            public String apply(final Map.Entry<IProperty, Comparable> lllllllllllllIlIlllIIlIlIIllIllI) {
                if (lIlIlIIIlIlllll(lllllllllllllIlIlllIIlIlIIllIllI)) {
                    return BlockStateBase$1.llllIIlIlllII[BlockStateBase$1.llllIIllIIIlI[0]];
                }
                final IProperty lllllllllllllIlIlllIIlIlIIllIlll = lllllllllllllIlIlllIIlIlIIllIllI.getKey();
                return String.valueOf(new StringBuilder(String.valueOf(lllllllllllllIlIlllIIlIlIIllIlll.getName())).append(BlockStateBase$1.llllIIlIlllII[BlockStateBase$1.llllIIllIIIlI[1]]).append(lllllllllllllIlIlllIIlIlIIllIlll.getName(lllllllllllllIlIlllIIlIlIIllIllI.getValue())));
            }
            
            private static void lIlIlIIIlIllllI() {
                (llllIIllIIIlI = new int[4])[0] = ((0x29 ^ 0x3E) & ~(0x5B ^ 0x4C));
                BlockStateBase$1.llllIIllIIIlI[1] = " ".length();
                BlockStateBase$1.llllIIllIIIlI[2] = "  ".length();
                BlockStateBase$1.llllIIllIIIlI[3] = (0x25 ^ 0x2D);
            }
            
            private static String lIlIlIIIlIlIIIl(final String lllllllllllllIlIlllIIlIlIIIlllII, final String lllllllllllllIlIlllIIlIlIIIllIIl) {
                try {
                    final SecretKeySpec lllllllllllllIlIlllIIlIlIIIlllll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIlIlllIIlIlIIIllIIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
                    final Cipher lllllllllllllIlIlllIIlIlIIIllllI = Cipher.getInstance("Blowfish");
                    lllllllllllllIlIlllIIlIlIIIllllI.init(BlockStateBase$1.llllIIllIIIlI[2], lllllllllllllIlIlllIIlIlIIIlllll);
                    return new String(lllllllllllllIlIlllIIlIlIIIllllI.doFinal(Base64.getDecoder().decode(lllllllllllllIlIlllIIlIlIIIlllII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
                }
                catch (Exception lllllllllllllIlIlllIIlIlIIIlllIl) {
                    lllllllllllllIlIlllIIlIlIIIlllIl.printStackTrace();
                    return null;
                }
            }
            
            private static String lIlIlIIIlIlIlIl(final String lllllllllllllIlIlllIIlIlIIlIlIIl, final String lllllllllllllIlIlllIIlIlIIlIlIII) {
                try {
                    final SecretKeySpec lllllllllllllIlIlllIIlIlIIlIllII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIlIlllIIlIlIIlIlIII.getBytes(StandardCharsets.UTF_8)), BlockStateBase$1.llllIIllIIIlI[3]), "DES");
                    final Cipher lllllllllllllIlIlllIIlIlIIlIlIll = Cipher.getInstance("DES");
                    lllllllllllllIlIlllIIlIlIIlIlIll.init(BlockStateBase$1.llllIIllIIIlI[2], lllllllllllllIlIlllIIlIlIIlIllII);
                    return new String(lllllllllllllIlIlllIIlIlIIlIlIll.doFinal(Base64.getDecoder().decode(lllllllllllllIlIlllIIlIlIIlIlIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
                }
                catch (Exception lllllllllllllIlIlllIIlIlIIlIlIlI) {
                    lllllllllllllIlIlllIIlIlIIlIlIlI.printStackTrace();
                    return null;
                }
            }
            
            private static boolean lIlIlIIIlIlllll(final Object lllllllllllllIlIlllIIlIlIIIlIlIl) {
                return lllllllllllllIlIlllIIlIlIIIlIlIl == null;
            }
            
            private static void lIlIlIIIlIlIllI() {
                (llllIIlIlllII = new String[BlockStateBase$1.llllIIllIIIlI[2]])[BlockStateBase$1.llllIIllIIIlI[0]] = lIlIlIIIlIlIIIl("wV38VUswofw=", "lJlqv");
                BlockStateBase$1.llllIIlIlllII[BlockStateBase$1.llllIIllIIIlI[1]] = lIlIlIIIlIlIlIl("o+0eFUOH6Kw=", "PzTbv");
            }
            
            static {
                lIlIlIIIlIllllI();
                lIlIlIIIlIlIllI();
            }
        };
    }
    
    private static boolean lIIIllIllllllIII(final int llllllllllllIlllIIIlIIIIlIIIlIII, final int llllllllllllIlllIIIlIIIIlIIIIlll) {
        return llllllllllllIlllIIIlIIIIlIIIlIII < llllllllllllIlllIIIlIIIIlIIIIlll;
    }
    
    private static boolean lIIIllIlllllIllI(final int llllllllllllIlllIIIlIIIIlIIIIlIl) {
        return llllllllllllIlllIIIlIIIIlIIIIlIl != 0;
    }
    
    private static void lIIIllIlllllIlIl() {
        (llIIlIlllIlIlI = new int[4])[0] = (0x0 ^ 0x66 ^ (0xD4 ^ 0x9E));
        BlockStateBase.llIIlIlllIlIlI[1] = ((0x1E ^ 0x4B) & ~(0xFA ^ 0xAF));
        BlockStateBase.llIIlIlllIlIlI[2] = " ".length();
        BlockStateBase.llIIlIlllIlIlI[3] = "  ".length();
    }
}
