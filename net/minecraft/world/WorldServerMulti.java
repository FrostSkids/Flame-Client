// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.world;

import net.minecraft.village.VillageCollection;
import net.minecraft.world.border.WorldBorder;
import net.minecraft.world.border.IBorderListener;
import net.minecraft.world.storage.WorldInfo;
import net.minecraft.world.storage.DerivedWorldInfo;
import net.minecraft.profiler.Profiler;
import net.minecraft.world.storage.ISaveHandler;
import net.minecraft.server.MinecraftServer;

public class WorldServerMulti extends WorldServer
{
    private /* synthetic */ WorldServer delegate;
    
    public WorldServerMulti(final MinecraftServer llllllllllllIlllIlllIlIIlIIIllIl, final ISaveHandler llllllllllllIlllIlllIlIIlIIIllII, final int llllllllllllIlllIlllIlIIlIIIlIll, final WorldServer llllllllllllIlllIlllIlIIlIIIlIlI, final Profiler llllllllllllIlllIlllIlIIlIIIlIIl) {
        super(llllllllllllIlllIlllIlIIlIIIllIl, llllllllllllIlllIlllIlIIlIIIllII, new DerivedWorldInfo(llllllllllllIlllIlllIlIIlIIIlIlI.getWorldInfo()), llllllllllllIlllIlllIlIIlIIIlIll, llllllllllllIlllIlllIlIIlIIIlIIl);
        this.delegate = llllllllllllIlllIlllIlIIlIIIlIlI;
        llllllllllllIlllIlllIlIIlIIIlIlI.getWorldBorder().addListener(new IBorderListener() {
            @Override
            public void onSizeChanged(final WorldBorder llllllllllllIlIllIlIIIIllIlIIlll, final double llllllllllllIlIllIlIIIIllIlIIllI) {
                WorldServerMulti.this.getWorldBorder().setTransition(llllllllllllIlIllIlIIIIllIlIIllI);
            }
            
            @Override
            public void onWarningDistanceChanged(final WorldBorder llllllllllllIlIllIlIIIIllIIIIIlI, final int llllllllllllIlIllIlIIIIllIIIIIIl) {
                WorldServerMulti.this.getWorldBorder().setWarningDistance(llllllllllllIlIllIlIIIIllIIIIIIl);
            }
            
            @Override
            public void onDamageBufferChanged(final WorldBorder llllllllllllIlIllIlIIIIlIlllIlII, final double llllllllllllIlIllIlIIIIlIlllIIll) {
                WorldServerMulti.this.getWorldBorder().setDamageBuffer(llllllllllllIlIllIlIIIIlIlllIIll);
            }
            
            @Override
            public void onWarningTimeChanged(final WorldBorder llllllllllllIlIllIlIIIIllIIIlIIl, final int llllllllllllIlIllIlIIIIllIIIIllI) {
                WorldServerMulti.this.getWorldBorder().setWarningTime(llllllllllllIlIllIlIIIIllIIIIllI);
            }
            
            @Override
            public void onCenterChanged(final WorldBorder llllllllllllIlIllIlIIIIllIIlIIlI, final double llllllllllllIlIllIlIIIIllIIIlllI, final double llllllllllllIlIllIlIIIIllIIlIIII) {
                WorldServerMulti.this.getWorldBorder().setCenter(llllllllllllIlIllIlIIIIllIIIlllI, llllllllllllIlIllIlIIIIllIIlIIII);
            }
            
            @Override
            public void onDamageAmountChanged(final WorldBorder llllllllllllIlIllIlIIIIlIllllIll, final double llllllllllllIlIllIlIIIIlIllllIII) {
                WorldServerMulti.this.getWorldBorder().setDamageAmount(llllllllllllIlIllIlIIIIlIllllIII);
            }
            
            @Override
            public void onTransitionStarted(final WorldBorder llllllllllllIlIllIlIIIIllIIllllI, final double llllllllllllIlIllIlIIIIllIIlllIl, final double llllllllllllIlIllIlIIIIllIIllIII, final long llllllllllllIlIllIlIIIIllIIllIll) {
                WorldServerMulti.this.getWorldBorder().setTransition(llllllllllllIlIllIlIIIIllIIlllIl, llllllllllllIlIllIlIIIIllIIllIII, llllllllllllIlIllIlIIIIllIIllIll);
            }
        });
    }
    
    @Override
    protected void saveLevel() throws MinecraftException {
    }
    
    @Override
    public World init() {
        this.mapStorage = this.delegate.getMapStorage();
        this.worldScoreboard = this.delegate.getScoreboard();
        final String llllllllllllIlllIlllIlIIIlllllIl = VillageCollection.fileNameForProvider(this.provider);
        final VillageCollection llllllllllllIlllIlllIlIIIlllllII = (VillageCollection)this.mapStorage.loadData(VillageCollection.class, llllllllllllIlllIlllIlIIIlllllIl);
        if (lIIIIllllIIIlIll(llllllllllllIlllIlllIlIIIlllllII)) {
            this.villageCollectionObj = new VillageCollection(this);
            this.mapStorage.setData(llllllllllllIlllIlllIlIIIlllllIl, this.villageCollectionObj);
            "".length();
            if ("  ".length() < 0) {
                return null;
            }
        }
        else {
            this.villageCollectionObj = llllllllllllIlllIlllIlIIIlllllII;
            this.villageCollectionObj.setWorldsForAll(this);
        }
        return this;
    }
    
    private static boolean lIIIIllllIIIlIll(final Object llllllllllllIlllIlllIlIIIlllIlll) {
        return llllllllllllIlllIlllIlIIIlllIlll == null;
    }
}
