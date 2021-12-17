// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.stats;

import com.google.common.collect.Maps;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.IJsonSerializable;
import net.minecraft.util.TupleIntJsonSerializable;
import java.util.Map;

public class StatFileWriter
{
    protected final /* synthetic */ Map<StatBase, TupleIntJsonSerializable> statsData;
    private static final /* synthetic */ int[] llIlIIllllIIIl;
    
    public int func_150874_c(final Achievement llllllllllllIllIlIllIlllIIllIIll) {
        if (lIIlIIllIlIIlllI(this.hasAchievementUnlocked(llllllllllllIllIlIllIlllIIllIIll) ? 1 : 0)) {
            return StatFileWriter.llIlIIllllIIIl[1];
        }
        int llllllllllllIllIlIllIlllIIllIIlI = StatFileWriter.llIlIIllllIIIl[1];
        Achievement llllllllllllIllIlIllIlllIIllIIIl = llllllllllllIllIlIllIlllIIllIIll.parentAchievement;
        "".length();
        if (-(0x45 ^ 0x41) >= 0) {
            return (0x2A ^ 0x24) & ~(0x1F ^ 0x11);
        }
        while (lIIlIIllIlIIllII(llllllllllllIllIlIllIlllIIllIIIl) && !lIIlIIllIlIIlllI(this.hasAchievementUnlocked(llllllllllllIllIlIllIlllIIllIIIl) ? 1 : 0)) {
            llllllllllllIllIlIllIlllIIllIIIl = llllllllllllIllIlIllIlllIIllIIIl.parentAchievement;
            ++llllllllllllIllIlIllIlllIIllIIlI;
        }
        return llllllllllllIllIlIllIlllIIllIIlI;
    }
    
    public boolean canUnlockAchievement(final Achievement llllllllllllIllIlIllIlllIIlllIll) {
        if (lIIlIIllIlIIllII(llllllllllllIllIlIllIlllIIlllIll.parentAchievement) && lIIlIIllIlIIllIl(this.hasAchievementUnlocked(llllllllllllIllIlIllIlllIIlllIll.parentAchievement) ? 1 : 0)) {
            return StatFileWriter.llIlIIllllIIIl[1] != 0;
        }
        return StatFileWriter.llIlIIllllIIIl[0] != 0;
    }
    
    public <T extends IJsonSerializable> T func_150870_b(final StatBase llllllllllllIllIlIllIlllIIIIIIll) {
        final TupleIntJsonSerializable llllllllllllIllIlIllIlllIIIIIlIl = this.statsData.get(llllllllllllIllIlIllIlllIIIIIIll);
        IJsonSerializable jsonSerializableValue;
        if (lIIlIIllIlIIllII(llllllllllllIllIlIllIlllIIIIIlIl)) {
            jsonSerializableValue = llllllllllllIllIlIllIlllIIIIIlIl.getJsonSerializableValue();
            "".length();
            if (((0x50 ^ 0x45) & ~(0x65 ^ 0x70)) > 0) {
                return null;
            }
        }
        else {
            jsonSerializableValue = null;
        }
        return (T)jsonSerializableValue;
    }
    
    public int readStat(final StatBase llllllllllllIllIlIllIlllIIIIllII) {
        final TupleIntJsonSerializable llllllllllllIllIlIllIlllIIIIlllI = this.statsData.get(llllllllllllIllIlIllIlllIIIIllII);
        int integerValue;
        if (lIIlIIllIlIIllll(llllllllllllIllIlIllIlllIIIIlllI)) {
            integerValue = StatFileWriter.llIlIIllllIIIl[1];
            "".length();
            if (((0x44 ^ 0x9) & ~(0xEC ^ 0xA1)) == "   ".length()) {
                return (0x4B ^ 0x58) & ~(0x3D ^ 0x2E);
            }
        }
        else {
            integerValue = llllllllllllIllIlIllIlllIIIIlllI.getIntegerValue();
        }
        return integerValue;
    }
    
    private static boolean lIIlIIllIlIIllIl(final int llllllllllllIllIlIllIllIlllIlllI) {
        return llllllllllllIllIlIllIllIlllIlllI == 0;
    }
    
    private static boolean lIIlIIllIlIIllII(final Object llllllllllllIllIlIllIllIllllIlII) {
        return llllllllllllIllIlIllIllIllllIlII != null;
    }
    
    private static void lIIlIIllIlIIlIlI() {
        (llIlIIllllIIIl = new int[2])[0] = " ".length();
        StatFileWriter.llIlIIllllIIIl[1] = ((0x26 ^ 0x9 ^ (0xC4 ^ 0x8A)) & (0x3B ^ 0x41 ^ (0x75 ^ 0x6E) ^ -" ".length()));
    }
    
    public void unlockAchievement(final EntityPlayer llllllllllllIllIlIllIlllIIIllIll, final StatBase llllllllllllIllIlIllIlllIIIlIllI, final int llllllllllllIllIlIllIlllIIIllIIl) {
        TupleIntJsonSerializable llllllllllllIllIlIllIlllIIIllIII = this.statsData.get(llllllllllllIllIlIllIlllIIIlIllI);
        if (lIIlIIllIlIIllll(llllllllllllIllIlIllIlllIIIllIII)) {
            llllllllllllIllIlIllIlllIIIllIII = new TupleIntJsonSerializable();
            this.statsData.put(llllllllllllIllIlIllIlllIIIlIllI, llllllllllllIllIlIllIlllIIIllIII);
            "".length();
        }
        llllllllllllIllIlIllIlllIIIllIII.setIntegerValue(llllllllllllIllIlIllIlllIIIllIIl);
    }
    
    public boolean hasAchievementUnlocked(final Achievement llllllllllllIllIlIllIlllIlIIIIIl) {
        if (lIIlIIllIlIIlIll(this.readStat(llllllllllllIllIlIllIlllIlIIIIIl))) {
            return StatFileWriter.llIlIIllllIIIl[0] != 0;
        }
        return StatFileWriter.llIlIIllllIIIl[1] != 0;
    }
    
    private static boolean lIIlIIllIlIIlIll(final int llllllllllllIllIlIllIllIlllIllII) {
        return llllllllllllIllIlIllIllIlllIllII > 0;
    }
    
    public StatFileWriter() {
        this.statsData = (Map<StatBase, TupleIntJsonSerializable>)Maps.newConcurrentMap();
    }
    
    private static boolean lIIlIIllIlIIllll(final Object llllllllllllIllIlIllIllIllllIIlI) {
        return llllllllllllIllIlIllIllIllllIIlI == null;
    }
    
    private static boolean lIIlIIllIlIIlllI(final int llllllllllllIllIlIllIllIllllIIII) {
        return llllllllllllIllIlIllIllIllllIIII != 0;
    }
    
    public void increaseStat(final EntityPlayer llllllllllllIllIlIllIlllIIlIIIll, final StatBase llllllllllllIllIlIllIlllIIlIIllI, final int llllllllllllIllIlIllIlllIIlIIIIl) {
        if (!lIIlIIllIlIIlllI(llllllllllllIllIlIllIlllIIlIIllI.isAchievement() ? 1 : 0) || lIIlIIllIlIIlllI(this.canUnlockAchievement((Achievement)llllllllllllIllIlIllIlllIIlIIllI) ? 1 : 0)) {
            this.unlockAchievement(llllllllllllIllIlIllIlllIIlIIIll, llllllllllllIllIlIllIlllIIlIIllI, this.readStat(llllllllllllIllIlIllIlllIIlIIllI) + llllllllllllIllIlIllIlllIIlIIIIl);
        }
    }
    
    static {
        lIIlIIllIlIIlIlI();
    }
    
    public <T extends IJsonSerializable> T func_150872_a(final StatBase llllllllllllIllIlIllIllIlllllIII, final T llllllllllllIllIlIllIllIllllIlll) {
        TupleIntJsonSerializable llllllllllllIllIlIllIllIlllllIlI = this.statsData.get(llllllllllllIllIlIllIllIlllllIII);
        if (lIIlIIllIlIIllll(llllllllllllIllIlIllIllIlllllIlI)) {
            llllllllllllIllIlIllIllIlllllIlI = new TupleIntJsonSerializable();
            this.statsData.put(llllllllllllIllIlIllIllIlllllIII, llllllllllllIllIlIllIllIlllllIlI);
            "".length();
        }
        llllllllllllIllIlIllIllIlllllIlI.setJsonSerializableValue(llllllllllllIllIlIllIllIllllIlll);
        return llllllllllllIllIlIllIllIllllIlll;
    }
}
