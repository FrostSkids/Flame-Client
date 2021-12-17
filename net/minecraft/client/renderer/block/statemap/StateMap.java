// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.client.renderer.block.statemap;

import java.util.Iterator;
import java.util.Collection;
import java.util.Collections;
import com.google.common.collect.Lists;
import net.minecraft.block.Block;
import net.minecraft.util.ResourceLocation;
import java.util.Map;
import com.google.common.collect.Maps;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.block.state.IBlockState;
import java.util.List;
import net.minecraft.block.properties.IProperty;

public class StateMap extends StateMapperBase
{
    private final /* synthetic */ IProperty<?> name;
    private final /* synthetic */ List<IProperty<?>> ignored;
    private final /* synthetic */ String suffix;
    
    private StateMap(final IProperty<?> llllllllllllIllIlIllIIlllIlIIlII, final String llllllllllllIllIlIllIIlllIIlllll, final List<IProperty<?>> llllllllllllIllIlIllIIlllIlIIIlI) {
        this.name = llllllllllllIllIlIllIIlllIlIIlII;
        this.suffix = llllllllllllIllIlIllIIlllIIlllll;
        this.ignored = llllllllllllIllIlIllIIlllIlIIIlI;
    }
    
    private static boolean lIIlIIllIlllIIII(final Object llllllllllllIllIlIllIIlllIIIIIII) {
        return llllllllllllIllIlIllIIlllIIIIIII == null;
    }
    
    private static boolean lIIlIIllIlllIIlI(final int llllllllllllIllIlIllIIllIllllllI) {
        return llllllllllllIllIlIllIIllIllllllI == 0;
    }
    
    @Override
    protected ModelResourceLocation getModelResourceLocation(final IBlockState llllllllllllIllIlIllIIlllIIlIllI) {
        final Map<IProperty, Comparable> llllllllllllIllIlIllIIlllIIlIlIl = (Map<IProperty, Comparable>)Maps.newLinkedHashMap((Map)llllllllllllIllIlIllIIlllIIlIllI.getProperties());
        String llllllllllllIllIlIllIIlllIIlIIll;
        if (lIIlIIllIlllIIII(this.name)) {
            final String llllllllllllIllIlIllIIlllIIlIlII = Block.blockRegistry.getNameForObject(llllllllllllIllIlIllIIlllIIlIllI.getBlock()).toString();
            "".length();
            if ("   ".length() <= 0) {
                return null;
            }
        }
        else {
            llllllllllllIllIlIllIIlllIIlIIll = this.name.getName(llllllllllllIllIlIllIIlllIIlIlIl.remove(this.name));
        }
        if (lIIlIIllIlllIIIl(this.suffix)) {
            llllllllllllIllIlIllIIlllIIlIIll = String.valueOf(new StringBuilder(String.valueOf(llllllllllllIllIlIllIIlllIIlIIll)).append(this.suffix));
        }
        final int llllllllllllIllIlIllIIlllIIIllII = (int)this.ignored.iterator();
        "".length();
        if (null != null) {
            return null;
        }
        while (!lIIlIIllIlllIIlI(((Iterator)llllllllllllIllIlIllIIlllIIIllII).hasNext() ? 1 : 0)) {
            final IProperty<?> llllllllllllIllIlIllIIlllIIlIIlI = ((Iterator<IProperty<?>>)llllllllllllIllIlIllIIlllIIIllII).next();
            llllllllllllIllIlIllIIlllIIlIlIl.remove(llllllllllllIllIlIllIIlllIIlIIlI);
            "".length();
        }
        return new ModelResourceLocation(llllllllllllIllIlIllIIlllIIlIIll, this.getPropertyString(llllllllllllIllIlIllIIlllIIlIlIl));
    }
    
    private static boolean lIIlIIllIlllIIIl(final Object llllllllllllIllIlIllIIlllIIIIIlI) {
        return llllllllllllIllIlIllIIlllIIIIIlI != null;
    }
    
    public static class Builder
    {
        private final /* synthetic */ List<IProperty<?>> ignored;
        private /* synthetic */ IProperty<?> name;
        private /* synthetic */ String suffix;
        
        public Builder() {
            this.ignored = (List<IProperty<?>>)Lists.newArrayList();
        }
        
        public Builder withSuffix(final String llllllllllllIlllIIIIIllIIlllIllI) {
            this.suffix = llllllllllllIlllIIIIIllIIlllIllI;
            return this;
        }
        
        public StateMap build() {
            return new StateMap(this.name, this.suffix, this.ignored, null);
        }
        
        public Builder ignore(final IProperty<?>... llllllllllllIlllIIIIIllIIlllIIII) {
            Collections.addAll(this.ignored, llllllllllllIlllIIIIIllIIlllIIII);
            "".length();
            return this;
        }
        
        public Builder withName(final IProperty<?> llllllllllllIlllIIIIIllIIlllllII) {
            this.name = llllllllllllIlllIIIIIllIIlllllII;
            return this;
        }
    }
}
