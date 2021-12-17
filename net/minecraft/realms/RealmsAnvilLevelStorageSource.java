// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.realms;

import java.util.Iterator;
import net.minecraft.util.IProgressUpdate;
import net.minecraft.client.AnvilConverterException;
import net.minecraft.world.storage.SaveFormatComparator;
import com.google.common.collect.Lists;
import java.util.List;
import net.minecraft.world.storage.ISaveFormat;

public class RealmsAnvilLevelStorageSource
{
    private /* synthetic */ ISaveFormat levelStorageSource;
    
    public boolean isNewLevelIdAcceptable(final String lllllllllllllIIllllIlIIIIllllIlI) {
        return this.levelStorageSource.func_154335_d(lllllllllllllIIllllIlIIIIllllIlI);
    }
    
    public RealmsAnvilLevelStorageSource(final ISaveFormat lllllllllllllIIllllIlIIIlIIlIllI) {
        this.levelStorageSource = lllllllllllllIIllllIlIIIlIIlIllI;
    }
    
    public boolean levelExists(final String lllllllllllllIIllllIlIIIlIIIllIl) {
        return this.levelStorageSource.canLoadWorld(lllllllllllllIIllllIlIIIlIIIllIl);
    }
    
    public String getName() {
        return this.levelStorageSource.getName();
    }
    
    private static boolean llIIIllllIllIll(final int lllllllllllllIIllllIlIIIIlIlIIll) {
        return lllllllllllllIIllllIlIIIIlIlIIll == 0;
    }
    
    public List<RealmsLevelSummary> getLevelList() throws AnvilConverterException {
        final List<RealmsLevelSummary> lllllllllllllIIllllIlIIIIlIllIlI = (List<RealmsLevelSummary>)Lists.newArrayList();
        final long lllllllllllllIIllllIlIIIIlIlIlIl = (long)this.levelStorageSource.getSaveList().iterator();
        "".length();
        if (null != null) {
            return null;
        }
        while (!llIIIllllIllIll(((Iterator)lllllllllllllIIllllIlIIIIlIlIlIl).hasNext() ? 1 : 0)) {
            final SaveFormatComparator lllllllllllllIIllllIlIIIIlIllIIl = ((Iterator<SaveFormatComparator>)lllllllllllllIIllllIlIIIIlIlIlIl).next();
            lllllllllllllIIllllIlIIIIlIllIlI.add(new RealmsLevelSummary(lllllllllllllIIllllIlIIIIlIllIIl));
            "".length();
        }
        return lllllllllllllIIllllIlIIIIlIllIlI;
    }
    
    public void clearAll() {
        this.levelStorageSource.flushCache();
    }
    
    public boolean convertLevel(final String lllllllllllllIIllllIlIIIlIIIlIII, final IProgressUpdate lllllllllllllIIllllIlIIIlIIIIlll) {
        return this.levelStorageSource.convertMapFormat(lllllllllllllIIllllIlIIIlIIIlIII, lllllllllllllIIllllIlIIIlIIIIlll);
    }
    
    public void renameLevel(final String lllllllllllllIIllllIlIIIIllIIlll, final String lllllllllllllIIllllIlIIIIllIIllI) {
        this.levelStorageSource.renameWorld(lllllllllllllIIllllIlIIIIllIIlll, lllllllllllllIIllllIlIIIIllIIllI);
    }
    
    public boolean isConvertible(final String lllllllllllllIIllllIlIIIIllIlllI) {
        return this.levelStorageSource.func_154334_a(lllllllllllllIIllllIlIIIIllIlllI);
    }
    
    public boolean requiresConversion(final String lllllllllllllIIllllIlIIIlIIIIIII) {
        return this.levelStorageSource.isOldMapFormat(lllllllllllllIIllllIlIIIlIIIIIII);
    }
    
    public boolean deleteLevel(final String lllllllllllllIIllllIlIIIIlllIIlI) {
        return this.levelStorageSource.deleteWorldDirectory(lllllllllllllIIllllIlIIIIlllIIlI);
    }
}
