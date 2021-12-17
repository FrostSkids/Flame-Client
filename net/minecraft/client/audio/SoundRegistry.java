// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.client.audio;

import com.google.common.collect.Maps;
import java.util.Map;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.RegistrySimple;

public class SoundRegistry extends RegistrySimple<ResourceLocation, SoundEventAccessorComposite>
{
    private /* synthetic */ Map<ResourceLocation, SoundEventAccessorComposite> soundRegistry;
    
    public void clearMap() {
        this.soundRegistry.clear();
    }
    
    @Override
    protected Map<ResourceLocation, SoundEventAccessorComposite> createUnderlyingMap() {
        this.soundRegistry = (Map<ResourceLocation, SoundEventAccessorComposite>)Maps.newHashMap();
        return this.soundRegistry;
    }
    
    public void registerSound(final SoundEventAccessorComposite llllllllllllIllIlIIIIllIllIlIIlI) {
        this.putObject(llllllllllllIllIlIIIIllIllIlIIlI.getSoundEventLocation(), llllllllllllIllIlIIIIllIllIlIIlI);
    }
}
