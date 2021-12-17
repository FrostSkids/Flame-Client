// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.client.renderer.block.statemap;

import java.util.Iterator;
import com.google.common.collect.Sets;
import com.google.common.base.Objects;
import com.google.common.collect.Maps;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.block.state.IBlockState;
import java.util.Collection;
import java.util.Collections;
import java.util.Map;
import net.minecraft.block.Block;
import java.util.Set;

public class BlockStateMapper
{
    private /* synthetic */ Set<Block> setBuiltInBlocks;
    private /* synthetic */ Map<Block, IStateMapper> blockStateMap;
    
    private static boolean lllIIIlIlIIIIlI(final int lllllllllllllIIIlllllIllllIlIIIl) {
        return lllllllllllllIIIlllllIllllIlIIIl == 0;
    }
    
    public void registerBuiltInBlocks(final Block... lllllllllllllIIIlllllIlllllIIIII) {
        Collections.addAll(this.setBuiltInBlocks, lllllllllllllIIIlllllIlllllIIIII);
        "".length();
    }
    
    public Map<IBlockState, ModelResourceLocation> putAllStateModelLocations() {
        final Map<IBlockState, ModelResourceLocation> lllllllllllllIIIlllllIllllIllIII = (Map<IBlockState, ModelResourceLocation>)Maps.newIdentityHashMap();
        final Exception lllllllllllllIIIlllllIllllIlIIll = (Exception)Block.blockRegistry.iterator();
        "".length();
        if (-"   ".length() > 0) {
            return null;
        }
        while (!lllIIIlIlIIIIlI(((Iterator)lllllllllllllIIIlllllIllllIlIIll).hasNext() ? 1 : 0)) {
            final Block lllllllllllllIIIlllllIllllIlIlll = ((Iterator<Block>)lllllllllllllIIIlllllIllllIlIIll).next();
            if (lllIIIlIlIIIIlI(this.setBuiltInBlocks.contains(lllllllllllllIIIlllllIllllIlIlll) ? 1 : 0)) {
                lllllllllllllIIIlllllIllllIllIII.putAll(((IStateMapper)Objects.firstNonNull((Object)this.blockStateMap.get(lllllllllllllIIIlllllIllllIlIlll), (Object)new DefaultStateMapper())).putStateModelLocations(lllllllllllllIIIlllllIllllIlIlll));
            }
        }
        return lllllllllllllIIIlllllIllllIllIII;
    }
    
    public void registerBlockStateMapper(final Block lllllllllllllIIIlllllIlllllIlIII, final IStateMapper lllllllllllllIIIlllllIlllllIIlII) {
        this.blockStateMap.put(lllllllllllllIIIlllllIlllllIlIII, lllllllllllllIIIlllllIlllllIIlII);
        "".length();
    }
    
    public BlockStateMapper() {
        this.blockStateMap = (Map<Block, IStateMapper>)Maps.newIdentityHashMap();
        this.setBuiltInBlocks = (Set<Block>)Sets.newIdentityHashSet();
    }
}
