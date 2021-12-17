// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.realms;

import net.minecraft.world.storage.SaveFormatComparator;

public class RealmsLevelSummary implements Comparable<RealmsLevelSummary>
{
    private static final /* synthetic */ int[] lllIlIIlIIlIIl;
    private /* synthetic */ SaveFormatComparator levelSummary;
    
    public int getGameMode() {
        return this.levelSummary.getEnumGameType().getID();
    }
    
    private static int lIlIIIlIIIIIIlll(final long n, final long n2) {
        return lcmp(n, n2);
    }
    
    static {
        lIlIIIlIIIIIIllI();
    }
    
    public long getSizeOnDisk() {
        return this.levelSummary.getSizeOnDisk();
    }
    
    public int compareTo(final SaveFormatComparator llllllllllllIlIlllIIIIIIllIllIll) {
        return this.levelSummary.compareTo(llllllllllllIlIlllIIIIIIllIllIll);
    }
    
    private static boolean lIlIIIlIIIIIlIIl(final int llllllllllllIlIlllIIIIIIllIIlIII) {
        return llllllllllllIlIlllIIIIIIllIIlIII > 0;
    }
    
    public boolean isRequiresConversion() {
        return this.levelSummary.requiresConversion();
    }
    
    public String getLevelId() {
        return this.levelSummary.getFileName();
    }
    
    public long getLastPlayed() {
        return this.levelSummary.getLastTimePlayed();
    }
    
    private static boolean lIlIIIlIIIIIlIII(final int llllllllllllIlIlllIIIIIIllIIlIlI) {
        return llllllllllllIlIlllIIIIIIllIIlIlI < 0;
    }
    
    @Override
    public int compareTo(final RealmsLevelSummary llllllllllllIlIlllIIIIIIllIlIIlI) {
        int compareTo;
        if (lIlIIIlIIIIIlIII(lIlIIIlIIIIIIlll(this.levelSummary.getLastTimePlayed(), llllllllllllIlIlllIIIIIIllIlIIlI.getLastPlayed()))) {
            compareTo = RealmsLevelSummary.lllIlIIlIIlIIl[0];
            "".length();
            if ((0x5E ^ 0x5B) <= 0) {
                return (0x26 ^ 0x62) & ~(0x3B ^ 0x7F);
            }
        }
        else if (lIlIIIlIIIIIlIIl(lIlIIIlIIIIIIlll(this.levelSummary.getLastTimePlayed(), llllllllllllIlIlllIIIIIIllIlIIlI.getLastPlayed()))) {
            compareTo = RealmsLevelSummary.lllIlIIlIIlIIl[1];
            "".length();
            if (((0x9F ^ 0x80) & ~(0x52 ^ 0x4D)) != 0x0) {
                return (0xB9 ^ 0xBE) & ~(0x2 ^ 0x5);
            }
        }
        else {
            compareTo = this.levelSummary.getFileName().compareTo(llllllllllllIlIlllIIIIIIllIlIIlI.getLevelId());
        }
        return compareTo;
    }
    
    public String getLevelName() {
        return this.levelSummary.getDisplayName();
    }
    
    public boolean isHardcore() {
        return this.levelSummary.isHardcoreModeEnabled();
    }
    
    public RealmsLevelSummary(final SaveFormatComparator llllllllllllIlIlllIIIIIIllllIlII) {
        this.levelSummary = llllllllllllIlIlllIIIIIIllllIlII;
    }
    
    private static void lIlIIIlIIIIIIllI() {
        (lllIlIIlIIlIIl = new int[2])[0] = " ".length();
        RealmsLevelSummary.lllIlIIlIIlIIl[1] = -" ".length();
    }
    
    public boolean hasCheats() {
        return this.levelSummary.getCheatsEnabled();
    }
}
