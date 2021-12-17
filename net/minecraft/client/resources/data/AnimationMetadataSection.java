// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.client.resources.data;

import java.util.Iterator;
import com.google.common.collect.Sets;
import java.util.Set;
import java.util.List;

public class AnimationMetadataSection implements IMetadataSection
{
    private final /* synthetic */ int frameWidth;
    private final /* synthetic */ int frameHeight;
    private final /* synthetic */ List<AnimationFrame> animationFrames;
    private static final /* synthetic */ int[] llIIIIllIllllI;
    private final /* synthetic */ int frameTime;
    private final /* synthetic */ boolean interpolate;
    
    public Set<Integer> getFrameIndexSet() {
        final Set<Integer> llllllllllllIlllIllIlIIIllllIlIl = (Set<Integer>)Sets.newHashSet();
        final char llllllllllllIlllIllIlIIIllllIIII = (char)this.animationFrames.iterator();
        "".length();
        if (null != null) {
            return null;
        }
        while (!lIIIlIIIIlIIlllI(((Iterator)llllllllllllIlllIllIlIIIllllIIII).hasNext() ? 1 : 0)) {
            final AnimationFrame llllllllllllIlllIllIlIIIllllIlII = ((Iterator<AnimationFrame>)llllllllllllIlllIllIlIIIllllIIII).next();
            llllllllllllIlllIllIlIIIllllIlIl.add(llllllllllllIlllIllIlIIIllllIlII.getFrameIndex());
            "".length();
        }
        return llllllllllllIlllIllIlIIIllllIlIl;
    }
    
    public int getFrameHeight() {
        return this.frameHeight;
    }
    
    public boolean frameHasTime(final int llllllllllllIlllIllIlIIlIIIIIIll) {
        int n;
        if (lIIIlIIIIlIIllIl(this.animationFrames.get(llllllllllllIlllIllIlIIlIIIIIIll).hasNoTime() ? 1 : 0)) {
            n = AnimationMetadataSection.llIIIIllIllllI[0];
            "".length();
            if (((0x31 ^ 0xB ^ (0x20 ^ 0x6)) & (131 + 47 - 175 + 162 ^ 75 + 65 - 20 + 65 ^ -" ".length())) >= " ".length()) {
                return ((130 + 54 + 12 + 1 ^ 85 + 124 - 46 + 31) & (0xDC ^ 0xA5 ^ (0x4D ^ 0x33) ^ -" ".length())) != 0x0;
            }
        }
        else {
            n = AnimationMetadataSection.llIIIIllIllllI[1];
        }
        return n != 0;
    }
    
    public boolean isInterpolate() {
        return this.interpolate;
    }
    
    private static boolean lIIIlIIIIlIIllIl(final int llllllllllllIlllIllIlIIIlllIlllI) {
        return llllllllllllIlllIllIlIIIlllIlllI != 0;
    }
    
    public int getFrameCount() {
        return this.animationFrames.size();
    }
    
    private static void lIIIlIIIIlIIllII() {
        (llIIIIllIllllI = new int[2])[0] = ((0x53 ^ 0x5C ^ (0x5F ^ 0x4)) & (179 + 50 - 13 + 2 ^ 46 + 18 - 23 + 101 ^ -" ".length()));
        AnimationMetadataSection.llIIIIllIllllI[1] = " ".length();
    }
    
    public int getFrameWidth() {
        return this.frameWidth;
    }
    
    static {
        lIIIlIIIIlIIllII();
    }
    
    public int getFrameIndex(final int llllllllllllIlllIllIlIIIlllllIll) {
        return this.animationFrames.get(llllllllllllIlllIllIlIIIlllllIll).getFrameIndex();
    }
    
    public int getFrameTimeSingle(final int llllllllllllIlllIllIlIIlIIIIlIll) {
        final AnimationFrame llllllllllllIlllIllIlIIlIIIIlIlI = this.getAnimationFrame(llllllllllllIlllIllIlIIlIIIIlIll);
        int n;
        if (lIIIlIIIIlIIllIl(llllllllllllIlllIllIlIIlIIIIlIlI.hasNoTime() ? 1 : 0)) {
            n = this.frameTime;
            "".length();
            if ((45 + 139 - 58 + 37 ^ 31 + 86 - 107 + 157) < 0) {
                return (0x7A ^ 0x2D ^ (0xCA ^ 0xBF)) & (3 + 69 + 70 + 1 ^ 12 + 64 + 8 + 89 ^ -" ".length());
            }
        }
        else {
            n = llllllllllllIlllIllIlIIlIIIIlIlI.getFrameTime();
        }
        return n;
    }
    
    private static boolean lIIIlIIIIlIIlllI(final int llllllllllllIlllIllIlIIIlllIllII) {
        return llllllllllllIlllIllIlIIIlllIllII == 0;
    }
    
    private AnimationFrame getAnimationFrame(final int llllllllllllIlllIllIlIIlIIIlIIlI) {
        return this.animationFrames.get(llllllllllllIlllIllIlIIlIIIlIIlI);
    }
    
    public AnimationMetadataSection(final List<AnimationFrame> llllllllllllIlllIllIlIIlIIlIllll, final int llllllllllllIlllIllIlIIlIIlIlIII, final int llllllllllllIlllIllIlIIlIIlIIlll, final int llllllllllllIlllIllIlIIlIIlIllII, final boolean llllllllllllIlllIllIlIIlIIlIIlIl) {
        this.animationFrames = llllllllllllIlllIllIlIIlIIlIllll;
        this.frameWidth = llllllllllllIlllIllIlIIlIIlIlIII;
        this.frameHeight = llllllllllllIlllIllIlIIlIIlIIlll;
        this.frameTime = llllllllllllIlllIllIlIIlIIlIllII;
        this.interpolate = llllllllllllIlllIllIlIIlIIlIIlIl;
    }
    
    public int getFrameTime() {
        return this.frameTime;
    }
}
