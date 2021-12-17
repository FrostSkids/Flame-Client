// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.entity.ai.attributes;

import java.util.Iterator;
import net.minecraft.server.management.LowerStringMap;
import com.google.common.collect.Sets;
import java.util.Collection;
import java.util.Set;
import java.util.Map;

public class ServersideAttributeMap extends BaseAttributeMap
{
    protected final /* synthetic */ Map<String, IAttributeInstance> descriptionToAttributeInstanceMap;
    private final /* synthetic */ Set<IAttributeInstance> attributeInstanceSet;
    
    @Override
    public void func_180794_a(final IAttributeInstance llllllllllllIlllIllllIIIIllIIIll) {
        if (lIIIIlllIlIIIllI(llllllllllllIlllIllllIIIIllIIIll.getAttribute().getShouldWatch() ? 1 : 0)) {
            this.attributeInstanceSet.add(llllllllllllIlllIllllIIIIllIIIll);
            "".length();
        }
        final char llllllllllllIlllIllllIIIIllIIIIl = (char)this.field_180377_c.get((Object)llllllllllllIlllIllllIIIIllIIIll.getAttribute()).iterator();
        "".length();
        if ((0x9 ^ 0x74 ^ (0x33 ^ 0x4A)) == 0x0) {
            return;
        }
        while (!lIIIIlllIlIIlIII(((Iterator)llllllllllllIlllIllllIIIIllIIIIl).hasNext() ? 1 : 0)) {
            final IAttribute llllllllllllIlllIllllIIIIllIIllI = ((Iterator<IAttribute>)llllllllllllIlllIllllIIIIllIIIIl).next();
            final ModifiableAttributeInstance llllllllllllIlllIllllIIIIllIIlIl = this.getAttributeInstance(llllllllllllIlllIllllIIIIllIIllI);
            if (lIIIIlllIlIIIlll(llllllllllllIlllIllllIIIIllIIlIl)) {
                llllllllllllIlllIllllIIIIllIIlIl.flagForUpdate();
            }
        }
    }
    
    private static boolean lIIIIlllIlIIIlll(final Object llllllllllllIlllIllllIIIIlIIlIII) {
        return llllllllllllIlllIllllIIIIlIIlIII != null;
    }
    
    public Set<IAttributeInstance> getAttributeInstanceSet() {
        return this.attributeInstanceSet;
    }
    
    private static boolean lIIIIlllIlIIIllI(final int llllllllllllIlllIllllIIIIlIIIlII) {
        return llllllllllllIlllIllllIIIIlIIIlII != 0;
    }
    
    @Override
    public ModifiableAttributeInstance getAttributeInstance(final IAttribute llllllllllllIlllIllllIIIlIIIIllI) {
        return (ModifiableAttributeInstance)super.getAttributeInstance(llllllllllllIlllIllllIIIlIIIIllI);
    }
    
    @Override
    public IAttributeInstance registerAttribute(final IAttribute llllllllllllIlllIllllIIIIllllIII) {
        final IAttributeInstance llllllllllllIlllIllllIIIIlllIlll = super.registerAttribute(llllllllllllIlllIllllIIIIllllIII);
        if (lIIIIlllIlIIIllI((llllllllllllIlllIllllIIIIllllIII instanceof RangedAttribute) ? 1 : 0) && lIIIIlllIlIIIlll(((RangedAttribute)llllllllllllIlllIllllIIIIllllIII).getDescription())) {
            this.descriptionToAttributeInstanceMap.put(((RangedAttribute)llllllllllllIlllIllllIIIIllllIII).getDescription(), llllllllllllIlllIllllIIIIlllIlll);
            "".length();
        }
        return llllllllllllIlllIllllIIIIlllIlll;
    }
    
    @Override
    public ModifiableAttributeInstance getAttributeInstanceByName(final String llllllllllllIlllIllllIIIlIIIIIIl) {
        IAttributeInstance llllllllllllIlllIllllIIIlIIIIIII = super.getAttributeInstanceByName(llllllllllllIlllIllllIIIlIIIIIIl);
        if (lIIIIlllIlIIIlIl(llllllllllllIlllIllllIIIlIIIIIII)) {
            llllllllllllIlllIllllIIIlIIIIIII = this.descriptionToAttributeInstanceMap.get(llllllllllllIlllIllllIIIlIIIIIIl);
        }
        return (ModifiableAttributeInstance)llllllllllllIlllIllllIIIlIIIIIII;
    }
    
    private static boolean lIIIIlllIlIIlIII(final int llllllllllllIlllIllllIIIIlIIIIlI) {
        return llllllllllllIlllIllllIIIIlIIIIlI == 0;
    }
    
    public Collection<IAttributeInstance> getWatchedAttributes() {
        final Set<IAttributeInstance> llllllllllllIlllIllllIIIIlIlIlll = (Set<IAttributeInstance>)Sets.newHashSet();
        final int llllllllllllIlllIllllIIIIlIlIIlI = (int)this.getAllAttributes().iterator();
        "".length();
        if ("   ".length() == 0) {
            return null;
        }
        while (!lIIIIlllIlIIlIII(((Iterator)llllllllllllIlllIllllIIIIlIlIIlI).hasNext() ? 1 : 0)) {
            final IAttributeInstance llllllllllllIlllIllllIIIIlIlIllI = ((Iterator<IAttributeInstance>)llllllllllllIlllIllllIIIIlIlIIlI).next();
            if (lIIIIlllIlIIIllI(llllllllllllIlllIllllIIIIlIlIllI.getAttribute().getShouldWatch() ? 1 : 0)) {
                llllllllllllIlllIllllIIIIlIlIlll.add(llllllllllllIlllIllllIIIIlIlIllI);
                "".length();
            }
        }
        return llllllllllllIlllIllllIIIIlIlIlll;
    }
    
    @Override
    protected IAttributeInstance func_180376_c(final IAttribute llllllllllllIlllIllllIIIIllIlllI) {
        return new ModifiableAttributeInstance(this, llllllllllllIlllIllllIIIIllIlllI);
    }
    
    private static boolean lIIIIlllIlIIIlIl(final Object llllllllllllIlllIllllIIIIlIIIllI) {
        return llllllllllllIlllIllllIIIIlIIIllI == null;
    }
    
    public ServersideAttributeMap() {
        this.attributeInstanceSet = (Set<IAttributeInstance>)Sets.newHashSet();
        this.descriptionToAttributeInstanceMap = new LowerStringMap<IAttributeInstance>();
    }
}
