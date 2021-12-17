// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.world.storage;

import net.minecraft.world.GameRules;
import net.minecraft.util.BlockPos;
import net.minecraft.world.EnumDifficulty;
import net.minecraft.world.WorldType;
import net.minecraft.world.WorldSettings;
import net.minecraft.nbt.NBTTagCompound;

public class DerivedWorldInfo extends WorldInfo
{
    private final /* synthetic */ WorldInfo theWorldInfo;
    
    @Override
    public NBTTagCompound cloneNBTCompound(final NBTTagCompound lllllllllllllIIIllIlIIlIIlIIlIII) {
        return this.theWorldInfo.cloneNBTCompound(lllllllllllllIIIllIlIIlIIlIIlIII);
    }
    
    @Override
    public void setWorldTime(final long lllllllllllllIIIllIlIIlIIIIIlllI) {
    }
    
    @Override
    public long getWorldTotalTime() {
        return this.theWorldInfo.getWorldTotalTime();
    }
    
    @Override
    public long getSeed() {
        return this.theWorldInfo.getSeed();
    }
    
    @Override
    public void setWorldName(final String lllllllllllllIIIllIlIIlIIIIIlIlI) {
    }
    
    @Override
    public NBTTagCompound getPlayerNBTTagCompound() {
        return this.theWorldInfo.getPlayerNBTTagCompound();
    }
    
    @Override
    public WorldSettings.GameType getGameType() {
        return this.theWorldInfo.getGameType();
    }
    
    @Override
    public void setRainTime(final int lllllllllllllIIIllIlIIlIIIIIIIII) {
    }
    
    @Override
    public void setSpawnY(final int lllllllllllllIIIllIlIIlIIIIlIlII) {
    }
    
    @Override
    public int getSaveVersion() {
        return this.theWorldInfo.getSaveVersion();
    }
    
    @Override
    public boolean areCommandsAllowed() {
        return this.theWorldInfo.areCommandsAllowed();
    }
    
    @Override
    public boolean isMapFeaturesEnabled() {
        return this.theWorldInfo.isMapFeaturesEnabled();
    }
    
    @Override
    public void setThunderTime(final int lllllllllllllIIIllIlIIlIIIIIIlII) {
    }
    
    @Override
    public WorldType getTerrainType() {
        return this.theWorldInfo.getTerrainType();
    }
    
    @Override
    public void setTerrainType(final WorldType lllllllllllllIIIllIlIIIlllllIlIl) {
    }
    
    @Override
    public void setWorldTotalTime(final long lllllllllllllIIIllIlIIlIIIIlIIII) {
    }
    
    @Override
    public boolean isDifficultyLocked() {
        return this.theWorldInfo.isDifficultyLocked();
    }
    
    @Override
    public boolean isThundering() {
        return this.theWorldInfo.isThundering();
    }
    
    @Override
    public int getSpawnY() {
        return this.theWorldInfo.getSpawnY();
    }
    
    @Override
    public void setDifficulty(final EnumDifficulty lllllllllllllIIIllIlIIIllllIIIll) {
    }
    
    @Override
    public int getThunderTime() {
        return this.theWorldInfo.getThunderTime();
    }
    
    @Override
    public String getWorldName() {
        return this.theWorldInfo.getWorldName();
    }
    
    @Override
    public void setServerInitialized(final boolean lllllllllllllIIIllIlIIIllllIlIll) {
    }
    
    @Override
    public NBTTagCompound getNBTTagCompound() {
        return this.theWorldInfo.getNBTTagCompound();
    }
    
    @Override
    public void setSpawnX(final int lllllllllllllIIIllIlIIlIIIIlIllI) {
    }
    
    @Override
    public void setSpawn(final BlockPos lllllllllllllIIIllIlIIlIIIIIllII) {
    }
    
    @Override
    public EnumDifficulty getDifficulty() {
        return this.theWorldInfo.getDifficulty();
    }
    
    @Override
    public boolean isHardcoreModeEnabled() {
        return this.theWorldInfo.isHardcoreModeEnabled();
    }
    
    @Override
    public void setRaining(final boolean lllllllllllllIIIllIlIIlIIIIIIIlI) {
    }
    
    @Override
    public void setSaveVersion(final int lllllllllllllIIIllIlIIlIIIIIlIII) {
    }
    
    @Override
    public int getSpawnZ() {
        return this.theWorldInfo.getSpawnZ();
    }
    
    @Override
    public void setAllowCommands(final boolean lllllllllllllIIIllIlIIIlllllIIII) {
    }
    
    @Override
    public long getWorldTime() {
        return this.theWorldInfo.getWorldTime();
    }
    
    @Override
    public GameRules getGameRulesInstance() {
        return this.theWorldInfo.getGameRulesInstance();
    }
    
    @Override
    public int getSpawnX() {
        return this.theWorldInfo.getSpawnX();
    }
    
    @Override
    public boolean isInitialized() {
        return this.theWorldInfo.isInitialized();
    }
    
    @Override
    public long getLastTimePlayed() {
        return this.theWorldInfo.getLastTimePlayed();
    }
    
    @Override
    public boolean isRaining() {
        return this.theWorldInfo.isRaining();
    }
    
    @Override
    public int getRainTime() {
        return this.theWorldInfo.getRainTime();
    }
    
    @Override
    public void setSpawnZ(final int lllllllllllllIIIllIlIIlIIIIlIIlI) {
    }
    
    public DerivedWorldInfo(final WorldInfo lllllllllllllIIIllIlIIlIIlIlIIIl) {
        this.theWorldInfo = lllllllllllllIIIllIlIIlIIlIlIIIl;
    }
    
    @Override
    public void setThundering(final boolean lllllllllllllIIIllIlIIlIIIIIIllI) {
    }
    
    @Override
    public long getSizeOnDisk() {
        return this.theWorldInfo.getSizeOnDisk();
    }
    
    @Override
    public void setDifficultyLocked(final boolean lllllllllllllIIIllIlIIIlllIllllI) {
    }
}
