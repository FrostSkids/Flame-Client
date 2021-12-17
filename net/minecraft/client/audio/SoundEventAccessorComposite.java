// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.client.audio;

import java.util.Iterator;
import com.google.common.collect.Lists;
import java.util.Random;
import net.minecraft.util.ResourceLocation;
import java.util.List;

public class SoundEventAccessorComposite implements ISoundEventAccessor<SoundPoolEntry>
{
    private final /* synthetic */ List<ISoundEventAccessor<SoundPoolEntry>> soundPool;
    private /* synthetic */ double eventPitch;
    private final /* synthetic */ ResourceLocation soundLocation;
    private final /* synthetic */ Random rnd;
    private /* synthetic */ double eventVolume;
    private static final /* synthetic */ int[] lIIlIlIIlIllIl;
    private final /* synthetic */ SoundCategory category;
    
    public ResourceLocation getSoundEventLocation() {
        return this.soundLocation;
    }
    
    @Override
    public SoundPoolEntry cloneEntry() {
        final int lllllllllllllIIllIlIIlIIlIlIlIIl = this.getWeight();
        if (!llIIllllllIllIl(this.soundPool.isEmpty() ? 1 : 0) || !llIIllllllIlllI(lllllllllllllIIllIlIIlIIlIlIlIIl)) {
            return SoundHandler.missing_sound;
        }
        int lllllllllllllIIllIlIIlIIlIlIlIII = this.rnd.nextInt(lllllllllllllIIllIlIIlIIlIlIlIIl);
        final double lllllllllllllIIllIlIIlIIlIlIIIIl = (double)this.soundPool.iterator();
        "".length();
        if (((0xA2 ^ 0x98 ^ (0x26 ^ 0x1B)) & (" ".length() ^ (0x73 ^ 0x75) ^ -" ".length())) != 0x0) {
            return null;
        }
        while (!llIIllllllIllIl(((Iterator)lllllllllllllIIllIlIIlIIlIlIIIIl).hasNext() ? 1 : 0)) {
            final ISoundEventAccessor<SoundPoolEntry> lllllllllllllIIllIlIIlIIlIlIIlll = ((Iterator<ISoundEventAccessor<SoundPoolEntry>>)lllllllllllllIIllIlIIlIIlIlIIIIl).next();
            lllllllllllllIIllIlIIlIIlIlIlIII -= lllllllllllllIIllIlIIlIIlIlIIlll.getWeight();
            if (llIIllllllIllll(lllllllllllllIIllIlIIlIIlIlIlIII)) {
                final SoundPoolEntry lllllllllllllIIllIlIIlIIlIlIIllI = lllllllllllllIIllIlIIlIIlIlIIlll.cloneEntry();
                lllllllllllllIIllIlIIlIIlIlIIllI.setPitch(lllllllllllllIIllIlIIlIIlIlIIllI.getPitch() * this.eventPitch);
                lllllllllllllIIllIlIIlIIlIlIIllI.setVolume(lllllllllllllIIllIlIIlIIlIlIIllI.getVolume() * this.eventVolume);
                return lllllllllllllIIllIlIIlIIlIlIIllI;
            }
        }
        return SoundHandler.missing_sound;
    }
    
    private static boolean llIIllllllIllll(final int lllllllllllllIIllIlIIlIIlIIIllII) {
        return lllllllllllllIIllIlIIlIIlIIIllII < 0;
    }
    
    private static boolean llIIllllllIllIl(final int lllllllllllllIIllIlIIlIIlIIIlllI) {
        return lllllllllllllIIllIlIIlIIlIIIlllI == 0;
    }
    
    public SoundEventAccessorComposite(final ResourceLocation lllllllllllllIIllIlIIlIIllIlIllI, final double lllllllllllllIIllIlIIlIIllIIllII, final double lllllllllllllIIllIlIIlIIllIIlIll, final SoundCategory lllllllllllllIIllIlIIlIIllIlIIIl) {
        this.soundPool = (List<ISoundEventAccessor<SoundPoolEntry>>)Lists.newArrayList();
        this.rnd = new Random();
        this.soundLocation = lllllllllllllIIllIlIIlIIllIlIllI;
        this.eventVolume = lllllllllllllIIllIlIIlIIllIIlIll;
        this.eventPitch = lllllllllllllIIllIlIIlIIllIIllII;
        this.category = lllllllllllllIIllIlIIlIIllIlIIIl;
    }
    
    private static void llIIllllllIllII() {
        (lIIlIlIIlIllIl = new int[1])[0] = ((0x20 ^ 0xD ^ (0x10 ^ 0x19)) & (117 + 153 - 155 + 76 ^ 148 + 1 - 114 + 120 ^ -" ".length()));
    }
    
    private static boolean llIIllllllIlllI(final int lllllllllllllIIllIlIIlIIlIIlIIII) {
        return lllllllllllllIIllIlIIlIIlIIlIIII != 0;
    }
    
    public SoundCategory getSoundCategory() {
        return this.category;
    }
    
    public void addSoundToEventPool(final ISoundEventAccessor<SoundPoolEntry> lllllllllllllIIllIlIIlIIlIIlllII) {
        this.soundPool.add(lllllllllllllIIllIlIIlIIlIIlllII);
        "".length();
    }
    
    static {
        llIIllllllIllII();
    }
    
    @Override
    public int getWeight() {
        int lllllllllllllIIllIlIIlIIlIlllIlI = SoundEventAccessorComposite.lIIlIlIIlIllIl[0];
        final int lllllllllllllIIllIlIIlIIlIllIIIl = (int)this.soundPool.iterator();
        "".length();
        if ((0xA6 ^ 0x9D ^ (0x9B ^ 0xA4)) == 0x0) {
            return (148 + 50 - 158 + 146 ^ 71 + 21 - 18 + 101) & (112 + 13 - 55 + 75 ^ 74 + 94 - 167 + 131 ^ -" ".length());
        }
        while (!llIIllllllIllIl(((Iterator)lllllllllllllIIllIlIIlIIlIllIIIl).hasNext() ? 1 : 0)) {
            final ISoundEventAccessor<SoundPoolEntry> lllllllllllllIIllIlIIlIIlIlllIII = ((Iterator<ISoundEventAccessor<SoundPoolEntry>>)lllllllllllllIIllIlIIlIIlIllIIIl).next();
            lllllllllllllIIllIlIIlIIlIlllIlI += lllllllllllllIIllIlIIlIIlIlllIII.getWeight();
        }
        return lllllllllllllIIllIlIIlIIlIlllIlI;
    }
}
