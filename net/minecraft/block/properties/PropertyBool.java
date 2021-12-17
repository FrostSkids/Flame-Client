// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.block.properties;

import java.util.Collection;
import com.google.common.collect.ImmutableSet;

public class PropertyBool extends PropertyHelper<Boolean>
{
    private final /* synthetic */ ImmutableSet<Boolean> allowedValues;
    private static final /* synthetic */ int[] lIlIIlIlllIlIl;
    
    static {
        lllIIllIlllIIlI();
    }
    
    @Override
    public String getName(final Boolean lllllllllllllIIIllIlIlIlIlIIllII) {
        return lllllllllllllIIIllIlIlIlIlIIllII.toString();
    }
    
    protected PropertyBool(final String lllllllllllllIIIllIlIlIlIlIlIlll) {
        super(lllllllllllllIIIllIlIlIlIlIlIlll, Boolean.class);
        this.allowedValues = (ImmutableSet<Boolean>)ImmutableSet.of((Object)(boolean)(PropertyBool.lIlIIlIlllIlIl[0] != 0), (Object)(boolean)(PropertyBool.lIlIIlIlllIlIl[1] != 0));
    }
    
    @Override
    public Collection<Boolean> getAllowedValues() {
        return (Collection<Boolean>)this.allowedValues;
    }
    
    private static void lllIIllIlllIIlI() {
        (lIlIIlIlllIlIl = new int[2])[0] = " ".length();
        PropertyBool.lIlIIlIlllIlIl[1] = ((62 + 61 - 6 + 43 ^ 3 + 67 + 47 + 15) & (0x16 ^ 0x70 ^ (0xD7 ^ 0x95) ^ -" ".length()));
    }
    
    public static PropertyBool create(final String lllllllllllllIIIllIlIlIlIlIlIIII) {
        return new PropertyBool(lllllllllllllIIIllIlIlIlIlIlIIII);
    }
}
