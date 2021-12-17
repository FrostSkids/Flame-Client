// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.block.properties;

import com.google.common.collect.Collections2;
import com.google.common.collect.Lists;
import com.google.common.base.Predicate;
import com.google.common.base.Predicates;
import java.util.Collection;
import net.minecraft.util.EnumFacing;

public class PropertyDirection extends PropertyEnum<EnumFacing>
{
    protected PropertyDirection(final String lllllllllllllIIllIllIIllIIIIllIl, final Collection<EnumFacing> lllllllllllllIIllIllIIllIIIIllII) {
        super(lllllllllllllIIllIllIIllIIIIllIl, EnumFacing.class, lllllllllllllIIllIllIIllIIIIllII);
    }
    
    public static PropertyDirection create(final String lllllllllllllIIllIllIIllIIIIlIlI) {
        return create(lllllllllllllIIllIllIIllIIIIlIlI, (Predicate<EnumFacing>)Predicates.alwaysTrue());
    }
    
    public static PropertyDirection create(final String lllllllllllllIIllIllIIllIIIIIllI, final Predicate<EnumFacing> lllllllllllllIIllIllIIllIIIIIlIl) {
        return create(lllllllllllllIIllIllIIllIIIIIllI, Collections2.filter((Collection)Lists.newArrayList((Object[])EnumFacing.values()), (Predicate)lllllllllllllIIllIllIIllIIIIIlIl));
    }
    
    public static PropertyDirection create(final String lllllllllllllIIllIllIIlIlllllllI, final Collection<EnumFacing> lllllllllllllIIllIllIIlIllllllll) {
        return new PropertyDirection(lllllllllllllIIllIllIIlIlllllllI, lllllllllllllIIllIllIIlIllllllll);
    }
}
