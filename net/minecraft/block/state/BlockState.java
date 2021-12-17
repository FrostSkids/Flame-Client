// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.block.state;

import java.util.Iterator;
import com.google.common.collect.Table;
import com.google.common.collect.HashBasedTable;
import java.util.Collections;
import com.google.common.collect.ImmutableTable;
import java.util.Map;
import com.google.common.collect.ImmutableMap;
import net.minecraft.util.MapPopulator;
import java.util.List;
import net.minecraft.util.Cartesian;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import java.util.Comparator;
import java.util.Arrays;
import com.google.common.collect.Iterables;
import com.google.common.base.Objects;
import java.util.Collection;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import net.minecraft.block.Block;
import com.google.common.base.Function;
import net.minecraft.block.properties.IProperty;
import com.google.common.collect.ImmutableList;
import com.google.common.base.Joiner;

public class BlockState
{
    private final /* synthetic */ ImmutableList<IBlockState> validStates;
    private final /* synthetic */ ImmutableList<IProperty> properties;
    private static final /* synthetic */ Function<IProperty, String> GET_NAME_FUNC;
    private static final /* synthetic */ int[] lIllllllllllII;
    private static final /* synthetic */ String[] lIlllllllllIlI;
    private final /* synthetic */ Block block;
    
    public Block getBlock() {
        return this.block;
    }
    
    private static String lIIIIllIIlIlllll(final String llllllllllllIllllIIIlIlIIIIllIII, final String llllllllllllIllllIIIlIlIIIIlIlll) {
        try {
            final SecretKeySpec llllllllllllIllllIIIlIlIIIIllIll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIllllIIIlIlIIIIlIlll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher llllllllllllIllllIIIlIlIIIIllIlI = Cipher.getInstance("Blowfish");
            llllllllllllIllllIIIlIlIIIIllIlI.init(BlockState.lIllllllllllII[2], llllllllllllIllllIIIlIlIIIIllIll);
            return new String(llllllllllllIllllIIIlIlIIIIllIlI.doFinal(Base64.getDecoder().decode(llllllllllllIllllIIIlIlIIIIllIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIllllIIIlIlIIIIllIIl) {
            llllllllllllIllllIIIlIlIIIIllIIl.printStackTrace();
            return null;
        }
    }
    
    public Collection<IProperty> getProperties() {
        return (Collection<IProperty>)this.properties;
    }
    
    public IBlockState getBaseState() {
        return (IBlockState)this.validStates.get(BlockState.lIllllllllllII[0]);
    }
    
    private static boolean lIIIIllIIllIlIII(final int llllllllllllIllllIIIlIlIIIIIIIll, final int llllllllllllIllllIIIlIlIIIIIIIlI) {
        return llllllllllllIllllIIIlIlIIIIIIIll >= llllllllllllIllllIIIlIlIIIIIIIlI;
    }
    
    @Override
    public String toString() {
        return Objects.toStringHelper((Object)this).add(BlockState.lIlllllllllIlI[BlockState.lIllllllllllII[1]], Block.blockRegistry.getNameForObject(this.block)).add(BlockState.lIlllllllllIlI[BlockState.lIllllllllllII[2]], (Object)Iterables.transform((Iterable)this.properties, (Function)BlockState.GET_NAME_FUNC)).toString();
    }
    
    private static void lIIIIllIIllIIllI() {
        (lIllllllllllII = new int[5])[0] = ((0x3 ^ 0x5C) & ~(0xD7 ^ 0x88));
        BlockState.lIllllllllllII[1] = " ".length();
        BlockState.lIllllllllllII[2] = "  ".length();
        BlockState.lIllllllllllII[3] = "   ".length();
        BlockState.lIllllllllllII[4] = (0x5 ^ 0x0 ^ (0x91 ^ 0x9C));
    }
    
    private static String lIIIIllIIllIIIII(final String llllllllllllIllllIIIlIlIIIIIlIIl, final String llllllllllllIllllIIIlIlIIIIIlIlI) {
        try {
            final SecretKeySpec llllllllllllIllllIIIlIlIIIIIlllI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIllllIIIlIlIIIIIlIlI.getBytes(StandardCharsets.UTF_8)), BlockState.lIllllllllllII[4]), "DES");
            final Cipher llllllllllllIllllIIIlIlIIIIIllIl = Cipher.getInstance("DES");
            llllllllllllIllllIIIlIlIIIIIllIl.init(BlockState.lIllllllllllII[2], llllllllllllIllllIIIlIlIIIIIlllI);
            return new String(llllllllllllIllllIIIlIlIIIIIllIl.doFinal(Base64.getDecoder().decode(llllllllllllIllllIIIlIlIIIIIlIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIllllIIIlIlIIIIIllII) {
            llllllllllllIllllIIIlIlIIIIIllII.printStackTrace();
            return null;
        }
    }
    
    public ImmutableList<IBlockState> getValidStates() {
        return this.validStates;
    }
    
    static {
        lIIIIllIIllIIllI();
        lIIIIllIIllIIIIl();
        COMMA_JOINER = Joiner.on(BlockState.lIlllllllllIlI[BlockState.lIllllllllllII[0]]);
        GET_NAME_FUNC = (Function)new Function<IProperty, String>() {
            private static final /* synthetic */ String[] lIIllllIIlIIlI;
            private static final /* synthetic */ int[] lIIllllIIlIIll;
            
            private static boolean llIlllIlIllIlll(final Object lllllllllllllIIlIIlIlllIIIllIIll) {
                return lllllllllllllIIlIIlIlllIIIllIIll == null;
            }
            
            private static boolean llIlllIlIlllIII(final int lllllllllllllIIlIIlIlllIIIllIllI, final int lllllllllllllIIlIIlIlllIIIllIlIl) {
                return lllllllllllllIIlIIlIlllIIIllIllI < lllllllllllllIIlIIlIlllIIIllIlIl;
            }
            
            private static String llIlllIlIllIIll(String lllllllllllllIIlIIlIlllIIlIIIIIl, final String lllllllllllllIIlIIlIlllIIlIIIlIl) {
                lllllllllllllIIlIIlIlllIIlIIIIIl = (long)new String(Base64.getDecoder().decode(((String)lllllllllllllIIlIIlIlllIIlIIIIIl).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
                final StringBuilder lllllllllllllIIlIIlIlllIIlIIIlII = new StringBuilder();
                final char[] lllllllllllllIIlIIlIlllIIlIIIIll = lllllllllllllIIlIIlIlllIIlIIIlIl.toCharArray();
                int lllllllllllllIIlIIlIlllIIlIIIIlI = BlockState$1.lIIllllIIlIIll[0];
                final byte lllllllllllllIIlIIlIlllIIIllllII = (byte)(Object)((String)lllllllllllllIIlIIlIlllIIlIIIIIl).toCharArray();
                final Exception lllllllllllllIIlIIlIlllIIIlllIll = (Exception)lllllllllllllIIlIIlIlllIIIllllII.length;
                long lllllllllllllIIlIIlIlllIIIlllIlI = BlockState$1.lIIllllIIlIIll[0];
                while (llIlllIlIlllIII((int)lllllllllllllIIlIIlIlllIIIlllIlI, (int)lllllllllllllIIlIIlIlllIIIlllIll)) {
                    final char lllllllllllllIIlIIlIlllIIlIIIlll = lllllllllllllIIlIIlIlllIIIllllII[lllllllllllllIIlIIlIlllIIIlllIlI];
                    lllllllllllllIIlIIlIlllIIlIIIlII.append((char)(lllllllllllllIIlIIlIlllIIlIIIlll ^ lllllllllllllIIlIIlIlllIIlIIIIll[lllllllllllllIIlIIlIlllIIlIIIIlI % lllllllllllllIIlIIlIlllIIlIIIIll.length]));
                    "".length();
                    ++lllllllllllllIIlIIlIlllIIlIIIIlI;
                    ++lllllllllllllIIlIIlIlllIIIlllIlI;
                    "".length();
                    if (((0xDC ^ 0x86) & ~(0xD ^ 0x57)) != 0x0) {
                        return null;
                    }
                }
                return String.valueOf(lllllllllllllIIlIIlIlllIIlIIIlII);
            }
            
            private static void llIlllIlIllIlII() {
                (lIIllllIIlIIlI = new String[BlockState$1.lIIllllIIlIIll[1]])[BlockState$1.lIIllllIIlIIll[0]] = llIlllIlIllIIll("WDkfHzxa", "dwJSp");
            }
            
            static {
                llIlllIlIllIllI();
                llIlllIlIllIlII();
            }
            
            private static void llIlllIlIllIllI() {
                (lIIllllIIlIIll = new int[2])[0] = ("  ".length() & ~"  ".length());
                BlockState$1.lIIllllIIlIIll[1] = " ".length();
            }
            
            public String apply(final IProperty lllllllllllllIIlIIlIlllIIlIlIlIl) {
                String name;
                if (llIlllIlIllIlll(lllllllllllllIIlIIlIlllIIlIlIlIl)) {
                    name = BlockState$1.lIIllllIIlIIlI[BlockState$1.lIIllllIIlIIll[0]];
                    "".length();
                    if ("   ".length() < " ".length()) {
                        return null;
                    }
                }
                else {
                    name = lllllllllllllIIlIIlIlllIIlIlIlIl.getName();
                }
                return name;
            }
        };
    }
    
    private static void lIIIIllIIllIIIIl() {
        (lIlllllllllIlI = new String[BlockState.lIllllllllllII[3]])[BlockState.lIllllllllllII[0]] = lIIIIllIIlIlllll("ZAm4l/lobcU=", "qWEJB");
        BlockState.lIlllllllllIlI[BlockState.lIllllllllllII[1]] = lIIIIllIIllIIIII("u6eb2D/VaXU=", "mvvZG");
        BlockState.lIlllllllllIlI[BlockState.lIllllllllllII[2]] = lIIIIllIIllIIIII("zBX2R9QoEAPb5fS80iKZkQ==", "kdbLk");
    }
    
    private static boolean lIIIIllIIllIIlll(final int llllllllllllIllllIIIlIlIIIIIIIII) {
        return llllllllllllIllllIIIlIlIIIIIIIII == 0;
    }
    
    public BlockState(final Block llllllllllllIllllIIIlIlIIlIIlIII, final IProperty... llllllllllllIllllIIIlIlIIlIIIlll) {
        this.block = llllllllllllIllllIIIlIlIIlIIlIII;
        Arrays.sort(llllllllllllIllllIIIlIlIIlIIIlll, new Comparator<IProperty>() {
            @Override
            public int compare(final IProperty llllllllllllIllllllIIIIIIIllllIl, final IProperty llllllllllllIllllllIIIIIIIlllIlI) {
                return llllllllllllIllllllIIIIIIIllllIl.getName().compareTo(llllllllllllIllllllIIIIIIIlllIlI.getName());
            }
        });
        this.properties = (ImmutableList<IProperty>)ImmutableList.copyOf((Object[])llllllllllllIllllIIIlIlIIlIIIlll);
        final Map<Map<IProperty, Comparable>, StateImplementation> llllllllllllIllllIIIlIlIIlIIIllI = (Map<Map<IProperty, Comparable>, StateImplementation>)Maps.newLinkedHashMap();
        final List<StateImplementation> llllllllllllIllllIIIlIlIIlIIIlIl = (List<StateImplementation>)Lists.newArrayList();
        int llllllllllllIllllIIIlIlIIIlllIlI = (int)Cartesian.cartesianProduct((Iterable<? extends Iterable<?>>)this.getAllowedValues()).iterator();
        "".length();
        if (((0xEA ^ 0x9D ^ (0xE9 ^ 0xC3)) & (0xFF ^ 0x97 ^ (0x3B ^ 0xE) ^ -" ".length())) != 0x0) {
            throw null;
        }
        while (!lIIIIllIIllIIlll(((Iterator)llllllllllllIllllIIIlIlIIIlllIlI).hasNext() ? 1 : 0)) {
            final List<Comparable> llllllllllllIllllIIIlIlIIlIIIlII = ((Iterator<List<Comparable>>)llllllllllllIllllIIIlIlIIIlllIlI).next();
            final Map<IProperty, Comparable> llllllllllllIllllIIIlIlIIlIIIIll = (Map<IProperty, Comparable>)MapPopulator.createMap((Iterable<IProperty>)this.properties, llllllllllllIllllIIIlIlIIlIIIlII);
            final StateImplementation llllllllllllIllllIIIlIlIIlIIIIlI = new StateImplementation(llllllllllllIllllIIIlIlIIlIIlIII, ImmutableMap.copyOf((Map)llllllllllllIllllIIIlIlIIlIIIIll), null);
            llllllllllllIllllIIIlIlIIlIIIllI.put(llllllllllllIllllIIIlIlIIlIIIIll, llllllllllllIllllIIIlIlIIlIIIIlI);
            "".length();
            llllllllllllIllllIIIlIlIIlIIIlIl.add(llllllllllllIllllIIIlIlIIlIIIIlI);
            "".length();
        }
        llllllllllllIllllIIIlIlIIIlllIlI = (int)llllllllllllIllllIIIlIlIIlIIIlIl.iterator();
        "".length();
        if (((0x6B ^ 0x3F) & ~(0xFC ^ 0xA8)) >= (0x94 ^ 0x90)) {
            throw null;
        }
        while (!lIIIIllIIllIIlll(((Iterator)llllllllllllIllllIIIlIlIIIlllIlI).hasNext() ? 1 : 0)) {
            final StateImplementation llllllllllllIllllIIIlIlIIlIIIIIl = ((Iterator<StateImplementation>)llllllllllllIllllIIIlIlIIIlllIlI).next();
            llllllllllllIllllIIIlIlIIlIIIIIl.buildPropertyValueTable(llllllllllllIllllIIIlIlIIlIIIllI);
        }
        this.validStates = (ImmutableList<IBlockState>)ImmutableList.copyOf((Collection)llllllllllllIllllIIIlIlIIlIIIlIl);
    }
    
    private List<Iterable<Comparable>> getAllowedValues() {
        final List<Iterable<Comparable>> llllllllllllIllllIIIlIlIIIllIIII = (List<Iterable<Comparable>>)Lists.newArrayList();
        int llllllllllllIllllIIIlIlIIIlIllll = BlockState.lIllllllllllII[0];
        "".length();
        if (" ".length() < 0) {
            return null;
        }
        while (!lIIIIllIIllIlIII(llllllllllllIllllIIIlIlIIIlIllll, this.properties.size())) {
            llllllllllllIllllIIIlIlIIIllIIII.add(((IProperty)this.properties.get(llllllllllllIllllIIIlIlIIIlIllll)).getAllowedValues());
            "".length();
            ++llllllllllllIllllIIIlIlIIIlIllll;
        }
        return llllllllllllIllllIIIlIlIIIllIIII;
    }
    
    static class StateImplementation extends BlockStateBase
    {
        private static final /* synthetic */ int[] lIIlIllllIlIII;
        private static final /* synthetic */ String[] lIIlIllIlllIll;
        private final /* synthetic */ ImmutableMap<IProperty, Comparable> properties;
        private /* synthetic */ ImmutableTable<IProperty, Comparable, IBlockState> propertyValueTable;
        private final /* synthetic */ Block block;
        
        private static boolean llIlIlIIIlIllIl(final int lllllllllllllIIllIIIIIIIIIIIllll, final int lllllllllllllIIllIIIIIIIIIIIlllI) {
            return lllllllllllllIIllIIIIIIIIIIIllll < lllllllllllllIIllIIIIIIIIIIIlllI;
        }
        
        static {
            llIlIlIIIlIlIII();
            llIlIIllIlllllI();
        }
        
        @Override
        public <T extends Comparable<T>> T getValue(final IProperty<T> lllllllllllllIIllIIIIIIIlIIIIIIl) {
            if (llIlIlIIIlIlIIl(this.properties.containsKey((Object)lllllllllllllIIllIIIIIIIlIIIIIIl) ? 1 : 0)) {
                throw new IllegalArgumentException(String.valueOf(new StringBuilder(StateImplementation.lIIlIllIlllIll[StateImplementation.lIIlIllllIlIII[0]]).append(lllllllllllllIIllIIIIIIIlIIIIIIl).append(StateImplementation.lIIlIllIlllIll[StateImplementation.lIIlIllllIlIII[1]]).append(this.block.getBlockState())));
            }
            return lllllllllllllIIllIIIIIIIlIIIIIIl.getValueClass().cast(this.properties.get((Object)lllllllllllllIIllIIIIIIIlIIIIIIl));
        }
        
        @Override
        public ImmutableMap<IProperty, Comparable> getProperties() {
            return this.properties;
        }
        
        private static boolean llIlIlIIIlIlIll(final Object lllllllllllllIIllIIIIIIIIIIIIlII) {
            return lllllllllllllIIllIIIIIIIIIIIIlII != null;
        }
        
        private StateImplementation(final Block lllllllllllllIIllIIIIIIIlIIIlllI, final ImmutableMap<IProperty, Comparable> lllllllllllllIIllIIIIIIIlIIIlIlI) {
            this.block = lllllllllllllIIllIIIIIIIlIIIlllI;
            this.properties = lllllllllllllIIllIIIIIIIlIIIlIlI;
        }
        
        private static boolean llIlIlIIIlIlIlI(final Object lllllllllllllIIllIIIIIIIIIIIIlll, final Object lllllllllllllIIllIIIIIIIIIIIIllI) {
            return lllllllllllllIIllIIIIIIIIIIIIlll == lllllllllllllIIllIIIIIIIIIIIIllI;
        }
        
        @Override
        public boolean equals(final Object lllllllllllllIIllIIIIIIIIllIllII) {
            if (llIlIlIIIlIlIlI(this, lllllllllllllIIllIIIIIIIIllIllII)) {
                return StateImplementation.lIIlIllllIlIII[1] != 0;
            }
            return StateImplementation.lIIlIllllIlIII[0] != 0;
        }
        
        private static String llIlIIllIllIlIl(String lllllllllllllIIllIIIIIIIIIIllIlI, final String lllllllllllllIIllIIIIIIIIIIllllI) {
            lllllllllllllIIllIIIIIIIIIIllIlI = new String(Base64.getDecoder().decode(lllllllllllllIIllIIIIIIIIIIllIlI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
            final StringBuilder lllllllllllllIIllIIIIIIIIIIlllIl = new StringBuilder();
            final char[] lllllllllllllIIllIIIIIIIIIIlllII = lllllllllllllIIllIIIIIIIIIIllllI.toCharArray();
            int lllllllllllllIIllIIIIIIIIIIllIll = StateImplementation.lIIlIllllIlIII[0];
            final byte lllllllllllllIIllIIIIIIIIIIlIlIl = (Object)lllllllllllllIIllIIIIIIIIIIllIlI.toCharArray();
            final char lllllllllllllIIllIIIIIIIIIIlIlII = (char)lllllllllllllIIllIIIIIIIIIIlIlIl.length;
            double lllllllllllllIIllIIIIIIIIIIlIIll = StateImplementation.lIIlIllllIlIII[0];
            while (llIlIlIIIlIllIl((int)lllllllllllllIIllIIIIIIIIIIlIIll, lllllllllllllIIllIIIIIIIIIIlIlII)) {
                final char lllllllllllllIIllIIIIIIIIIlIIIII = lllllllllllllIIllIIIIIIIIIIlIlIl[lllllllllllllIIllIIIIIIIIIIlIIll];
                lllllllllllllIIllIIIIIIIIIIlllIl.append((char)(lllllllllllllIIllIIIIIIIIIlIIIII ^ lllllllllllllIIllIIIIIIIIIIlllII[lllllllllllllIIllIIIIIIIIIIllIll % lllllllllllllIIllIIIIIIIIIIlllII.length]));
                "".length();
                ++lllllllllllllIIllIIIIIIIIIIllIll;
                ++lllllllllllllIIllIIIIIIIIIIlIIll;
                "".length();
                if ("  ".length() >= "   ".length()) {
                    return null;
                }
            }
            return String.valueOf(lllllllllllllIIllIIIIIIIIIIlllIl);
        }
        
        private static boolean llIlIlIIIlIlIIl(final int lllllllllllllIIllIIIIIIIIIIIIIlI) {
            return lllllllllllllIIllIIIIIIIIIIIIIlI == 0;
        }
        
        private static String llIlIIllIllIIlI(final String lllllllllllllIIllIIIIIIIIIlIllIl, final String lllllllllllllIIllIIIIIIIIIlIlllI) {
            try {
                final SecretKeySpec lllllllllllllIIllIIIIIIIIIllIIlI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIIllIIIIIIIIIlIlllI.getBytes(StandardCharsets.UTF_8)), StateImplementation.lIIlIllllIlIII[8]), "DES");
                final Cipher lllllllllllllIIllIIIIIIIIIllIIIl = Cipher.getInstance("DES");
                lllllllllllllIIllIIIIIIIIIllIIIl.init(StateImplementation.lIIlIllllIlIII[2], lllllllllllllIIllIIIIIIIIIllIIlI);
                return new String(lllllllllllllIIllIIIIIIIIIllIIIl.doFinal(Base64.getDecoder().decode(lllllllllllllIIllIIIIIIIIIlIllIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
            }
            catch (Exception lllllllllllllIIllIIIIIIIIIllIIII) {
                lllllllllllllIIllIIIIIIIIIllIIII.printStackTrace();
                return null;
            }
        }
        
        private static void llIlIIllIlllllI() {
            (lIIlIllIlllIll = new String[StateImplementation.lIIlIllllIlIII[8]])[StateImplementation.lIIlIllllIlIII[0]] = llIlIIllIllIIlI("tvIVQA4qzbV7xJnQmyvkYSNkPHiqWvQG", "IfEtZ");
            StateImplementation.lIIlIllIlllIll[StateImplementation.lIIlIllllIlIII[1]] = llIlIIllIllIlIl("SSQqTx8dZT0AExplNwACSSAhBgUdZTABVg==", "iEYov");
            StateImplementation.lIIlIllIlllIll[StateImplementation.lIIlIllllIlIII[2]] = llIlIIllIllIlIl("FjgMGCMheRETOHUpEBk8MCsWD2w=", "UYbvL");
            StateImplementation.lIIlIllIlllIll[StateImplementation.lIIlIllllIlIII[3]] = llIlIIllIlllIIl("Adk5swVizanvKGyc5Ni3AMbQUaN42W2gSCbPClA5j9o=", "rqdSv");
            StateImplementation.lIIlIllIlllIll[StateImplementation.lIIlIllllIlIII[4]] = llIlIIllIlllIIl("y8V8ofWw3efwHdhXufHdzzDFkRey0rs2", "fgwlv");
            StateImplementation.lIIlIllIlllIll[StateImplementation.lIIlIllllIlIII[5]] = llIlIIllIllIlIl("TQw5RA==", "mxVdv");
            StateImplementation.lIIlIllIlllIll[StateImplementation.lIIlIllllIlIII[6]] = llIlIIllIlllIIl("Nh5ZRzny1wQIoC1r7GIJlg==", "EgPAM");
            StateImplementation.lIIlIllIlllIll[StateImplementation.lIIlIllllIlIII[7]] = llIlIIllIllIIlI("aJRlXYgWbggz/pqK5DTaK6XohUJERbSRkWa0LLncbEQ=", "LazRq");
        }
        
        @Override
        public Block getBlock() {
            return this.block;
        }
        
        @Override
        public Collection<IProperty> getPropertyNames() {
            return (Collection<IProperty>)Collections.unmodifiableCollection((Collection<? extends IProperty>)this.properties.keySet());
        }
        
        private Map<IProperty, Comparable> getPropertiesWithValue(final IProperty lllllllllllllIIllIIIIIIIIlIIllII, final Comparable lllllllllllllIIllIIIIIIIIlIIlIll) {
            final Map<IProperty, Comparable> lllllllllllllIIllIIIIIIIIlIIlllI = (Map<IProperty, Comparable>)Maps.newHashMap((Map)this.properties);
            lllllllllllllIIllIIIIIIIIlIIlllI.put(lllllllllllllIIllIIIIIIIIlIIllII, lllllllllllllIIllIIIIIIIIlIIlIll);
            "".length();
            return lllllllllllllIIllIIIIIIIIlIIlllI;
        }
        
        private static String llIlIIllIlllIIl(final String lllllllllllllIIllIIIIIIIIIlllIlI, final String lllllllllllllIIllIIIIIIIIIlllIIl) {
            try {
                final SecretKeySpec lllllllllllllIIllIIIIIIIIIllllll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIIllIIIIIIIIIlllIIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
                final Cipher lllllllllllllIIllIIIIIIIIIlllllI = Cipher.getInstance("Blowfish");
                lllllllllllllIIllIIIIIIIIIlllllI.init(StateImplementation.lIIlIllllIlIII[2], lllllllllllllIIllIIIIIIIIIllllll);
                return new String(lllllllllllllIIllIIIIIIIIIlllllI.doFinal(Base64.getDecoder().decode(lllllllllllllIIllIIIIIIIIIlllIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
            }
            catch (Exception lllllllllllllIIllIIIIIIIIIllllIl) {
                lllllllllllllIIllIIIIIIIIIllllIl.printStackTrace();
                return null;
            }
        }
        
        public void buildPropertyValueTable(final Map<Map<IProperty, Comparable>, StateImplementation> lllllllllllllIIllIIIIIIIIllIIIII) {
            if (llIlIlIIIlIlIll(this.propertyValueTable)) {
                throw new IllegalStateException();
            }
            final Table<IProperty, Comparable, IBlockState> lllllllllllllIIllIIIIIIIIlIlllll = (Table<IProperty, Comparable, IBlockState>)HashBasedTable.create();
            final char lllllllllllllIIllIIIIIIIIlIllIII = (char)this.properties.keySet().iterator();
            "".length();
            if ((0x56 ^ 0x53) == 0x0) {
                return;
            }
            while (!llIlIlIIIlIlIIl(((Iterator)lllllllllllllIIllIIIIIIIIlIllIII).hasNext() ? 1 : 0)) {
                final IProperty<? extends Comparable> lllllllllllllIIllIIIIIIIIlIllllI = ((Iterator<IProperty<? extends Comparable>>)lllllllllllllIIllIIIIIIIIlIllIII).next();
                final long lllllllllllllIIllIIIIIIIIlIlIllI = (long)lllllllllllllIIllIIIIIIIIlIllllI.getAllowedValues().iterator();
                "".length();
                if (((0x33 ^ 0x28) & ~(0xA2 ^ 0xB9)) > "  ".length()) {
                    return;
                }
                while (!llIlIlIIIlIlIIl(((Iterator)lllllllllllllIIllIIIIIIIIlIlIllI).hasNext() ? 1 : 0)) {
                    final Comparable lllllllllllllIIllIIIIIIIIlIlllIl = ((Iterator<Comparable>)lllllllllllllIIllIIIIIIIIlIlIllI).next();
                    if (llIlIlIIIlIllII(lllllllllllllIIllIIIIIIIIlIlllIl, this.properties.get((Object)lllllllllllllIIllIIIIIIIIlIllllI))) {
                        lllllllllllllIIllIIIIIIIIlIlllll.put((Object)lllllllllllllIIllIIIIIIIIlIllllI, (Object)lllllllllllllIIllIIIIIIIIlIlllIl, (Object)lllllllllllllIIllIIIIIIIIllIIIII.get(this.getPropertiesWithValue(lllllllllllllIIllIIIIIIIIlIllllI, lllllllllllllIIllIIIIIIIIlIlllIl)));
                        "".length();
                    }
                }
            }
            this.propertyValueTable = (ImmutableTable<IProperty, Comparable, IBlockState>)ImmutableTable.copyOf((Table)lllllllllllllIIllIIIIIIIIlIlllll);
        }
        
        @Override
        public <T extends Comparable<T>, V extends T> IBlockState withProperty(final IProperty<T> lllllllllllllIIllIIIIIIIIlllllII, final V lllllllllllllIIllIIIIIIIIllllIII) {
            if (llIlIlIIIlIlIIl(this.properties.containsKey((Object)lllllllllllllIIllIIIIIIIIlllllII) ? 1 : 0)) {
                throw new IllegalArgumentException(String.valueOf(new StringBuilder(StateImplementation.lIIlIllIlllIll[StateImplementation.lIIlIllllIlIII[2]]).append(lllllllllllllIIllIIIIIIIIlllllII).append(StateImplementation.lIIlIllIlllIll[StateImplementation.lIIlIllllIlIII[3]]).append(this.block.getBlockState())));
            }
            if (llIlIlIIIlIlIIl(lllllllllllllIIllIIIIIIIIlllllII.getAllowedValues().contains(lllllllllllllIIllIIIIIIIIllllIII) ? 1 : 0)) {
                throw new IllegalArgumentException(String.valueOf(new StringBuilder(StateImplementation.lIIlIllIlllIll[StateImplementation.lIIlIllllIlIII[4]]).append(lllllllllllllIIllIIIIIIIIlllllII).append(StateImplementation.lIIlIllIlllIll[StateImplementation.lIIlIllllIlIII[5]]).append(lllllllllllllIIllIIIIIIIIllllIII).append(StateImplementation.lIIlIllIlllIll[StateImplementation.lIIlIllllIlIII[6]]).append(Block.blockRegistry.getNameForObject(this.block)).append(StateImplementation.lIIlIllIlllIll[StateImplementation.lIIlIllllIlIII[7]])));
            }
            IBlockState blockState;
            if (llIlIlIIIlIlIlI(this.properties.get((Object)lllllllllllllIIllIIIIIIIIlllllII), lllllllllllllIIllIIIIIIIIllllIII)) {
                blockState = this;
                "".length();
                if (" ".length() > (0xEF ^ 0xC4 ^ (0xB2 ^ 0x9D))) {
                    return null;
                }
            }
            else {
                blockState = (IBlockState)this.propertyValueTable.get((Object)lllllllllllllIIllIIIIIIIIlllllII, (Object)lllllllllllllIIllIIIIIIIIllllIII);
            }
            return blockState;
        }
        
        private static void llIlIlIIIlIlIII() {
            (lIIlIllllIlIII = new int[9])[0] = ((0x9A ^ 0xC2 ^ (0x9E ^ 0x8F)) & (0x63 ^ 0x46 ^ (0xC6 ^ 0xAA) ^ -" ".length()));
            StateImplementation.lIIlIllllIlIII[1] = " ".length();
            StateImplementation.lIIlIllllIlIII[2] = "  ".length();
            StateImplementation.lIIlIllllIlIII[3] = "   ".length();
            StateImplementation.lIIlIllllIlIII[4] = (0x24 ^ 0x20);
            StateImplementation.lIIlIllllIlIII[5] = (0x7C ^ 0x5D ^ (0x61 ^ 0x45));
            StateImplementation.lIIlIllllIlIII[6] = (0x7C ^ 0x7A);
            StateImplementation.lIIlIllllIlIII[7] = (0x6A ^ 0x6D);
            StateImplementation.lIIlIllllIlIII[8] = (0xE8 ^ 0xBA ^ (0x73 ^ 0x29));
        }
        
        private static boolean llIlIlIIIlIllII(final Object lllllllllllllIIllIIIIIIIIIIIlIll, final Object lllllllllllllIIllIIIIIIIIIIIlIlI) {
            return lllllllllllllIIllIIIIIIIIIIIlIll != lllllllllllllIIllIIIIIIIIIIIlIlI;
        }
        
        @Override
        public int hashCode() {
            return this.properties.hashCode();
        }
    }
}
