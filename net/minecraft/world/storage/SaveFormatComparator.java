// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.world.storage;

import net.minecraft.world.WorldSettings;

public class SaveFormatComparator implements Comparable<SaveFormatComparator>
{
    private static final /* synthetic */ int[] llIIllIlIlIIIl;
    private final /* synthetic */ WorldSettings.GameType theEnumGameType;
    private final /* synthetic */ long sizeOnDisk;
    private final /* synthetic */ long lastTimePlayed;
    private final /* synthetic */ String displayName;
    private final /* synthetic */ boolean hardcore;
    private final /* synthetic */ boolean cheatsEnabled;
    private final /* synthetic */ String fileName;
    private final /* synthetic */ boolean requiresConversion;
    
    public String getDisplayName() {
        return this.displayName;
    }
    
    public boolean requiresConversion() {
        return this.requiresConversion;
    }
    
    public WorldSettings.GameType getEnumGameType() {
        return this.theEnumGameType;
    }
    
    private static boolean lIIIlllIllIlllll(final int llllllllllllIlllIIIIIIlIIIlIllII) {
        return llllllllllllIlllIIIIIIlIIIlIllII > 0;
    }
    
    @Override
    public int compareTo(final SaveFormatComparator llllllllllllIlllIIIIIIlIIIllllIl) {
        int compareTo;
        if (lIIIlllIllIllllI(lIIIlllIllIlllIl(this.lastTimePlayed, llllllllllllIlllIIIIIIlIIIllllIl.lastTimePlayed))) {
            compareTo = SaveFormatComparator.llIIllIlIlIIIl[0];
            "".length();
            if ("  ".length() != "  ".length()) {
                return (0xFE ^ 0xB3) & ~(0x25 ^ 0x68);
            }
        }
        else if (lIIIlllIllIlllll(lIIIlllIllIlllIl(this.lastTimePlayed, llllllllllllIlllIIIIIIlIIIllllIl.lastTimePlayed))) {
            compareTo = SaveFormatComparator.llIIllIlIlIIIl[1];
            "".length();
            if (-" ".length() >= "   ".length()) {
                return (201 + 64 - 102 + 42 ^ 191 + 131 - 311 + 181) & (0xF7 ^ 0x9C ^ (0x16 ^ 0x70) ^ -" ".length());
            }
        }
        else {
            compareTo = this.fileName.compareTo(llllllllllllIlllIIIIIIlIIIllllIl.fileName);
        }
        return compareTo;
    }
    
    public long getLastTimePlayed() {
        return this.lastTimePlayed;
    }
    
    static {
        lIIIlllIllIlllII();
    }
    
    private static int lIIIlllIllIlllIl(final long n, final long n2) {
        return lcmp(n, n2);
    }
    
    public boolean isHardcoreModeEnabled() {
        return this.hardcore;
    }
    
    public SaveFormatComparator(final String llllllllllllIlllIIIIIIlIIllIIIlI, final String llllllllllllIlllIIIIIIlIIllIIIIl, final long llllllllllllIlllIIIIIIlIIlIlIlll, final long llllllllllllIlllIIIIIIlIIlIlllll, final WorldSettings.GameType llllllllllllIlllIIIIIIlIIlIlIlIl, final boolean llllllllllllIlllIIIIIIlIIlIlIlII, final boolean llllllllllllIlllIIIIIIlIIlIlllII, final boolean llllllllllllIlllIIIIIIlIIlIlIIlI) {
        this.fileName = llllllllllllIlllIIIIIIlIIllIIIlI;
        this.displayName = llllllllllllIlllIIIIIIlIIllIIIIl;
        this.lastTimePlayed = llllllllllllIlllIIIIIIlIIlIlIlll;
        this.sizeOnDisk = llllllllllllIlllIIIIIIlIIlIlllll;
        this.theEnumGameType = llllllllllllIlllIIIIIIlIIlIlIlIl;
        this.requiresConversion = llllllllllllIlllIIIIIIlIIlIlIlII;
        this.hardcore = llllllllllllIlllIIIIIIlIIlIlllII;
        this.cheatsEnabled = llllllllllllIlllIIIIIIlIIlIlIIlI;
    }
    
    public String getFileName() {
        return this.fileName;
    }
    
    private static void lIIIlllIllIlllII() {
        (llIIllIlIlIIIl = new int[2])[0] = " ".length();
        SaveFormatComparator.llIIllIlIlIIIl[1] = -" ".length();
    }
    
    private static boolean lIIIlllIllIllllI(final int llllllllllllIlllIIIIIIlIIIlIlllI) {
        return llllllllllllIlllIIIIIIlIIIlIlllI < 0;
    }
    
    public boolean getCheatsEnabled() {
        return this.cheatsEnabled;
    }
    
    public long getSizeOnDisk() {
        return this.sizeOnDisk;
    }
}
