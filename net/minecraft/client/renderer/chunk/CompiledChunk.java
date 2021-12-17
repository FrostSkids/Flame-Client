// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.client.renderer.chunk;

import com.google.common.collect.Lists;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumWorldBlockLayer;
import net.minecraft.tileentity.TileEntity;
import java.util.List;
import net.minecraft.client.renderer.WorldRenderer;

public class CompiledChunk
{
    private static final /* synthetic */ int[] lIIIlIllIIIIlI;
    private /* synthetic */ WorldRenderer.State state;
    private final /* synthetic */ boolean[] layersUsed;
    private final /* synthetic */ List<TileEntity> tileEntities;
    private /* synthetic */ boolean empty;
    private /* synthetic */ SetVisibility setVisibility;
    private final /* synthetic */ boolean[] layersStarted;
    
    public List<TileEntity> getTileEntities() {
        return this.tileEntities;
    }
    
    private static boolean llIIIIIllIIlIII(final int lllllllllllllIlIIIIlIllllllIIIIl) {
        return lllllllllllllIlIIIIlIllllllIIIIl != 0;
    }
    
    public void addTileEntity(final TileEntity lllllllllllllIlIIIIlIllllllllIll) {
        this.tileEntities.add(lllllllllllllIlIIIIlIllllllllIll);
        "".length();
    }
    
    public boolean isLayerEmpty(final EnumWorldBlockLayer lllllllllllllIlIIIIllIIIIIIlIIII) {
        int n;
        if (llIIIIIllIIlIII(this.layersUsed[lllllllllllllIlIIIIllIIIIIIlIIII.ordinal()] ? 1 : 0)) {
            n = CompiledChunk.lIIIlIllIIIIlI[1];
            "".length();
            if ("   ".length() <= 0) {
                return ((0x70 ^ 0x64 ^ (0x60 ^ 0x44)) & (83 + 98 - 75 + 25 ^ 96 + 90 - 113 + 106 ^ -" ".length())) != 0x0;
            }
        }
        else {
            n = CompiledChunk.lIIIlIllIIIIlI[0];
        }
        return n != 0;
    }
    
    public void setState(final WorldRenderer.State lllllllllllllIlIIIIlIllllllIIlIl) {
        this.state = lllllllllllllIlIIIIlIllllllIIlIl;
    }
    
    public WorldRenderer.State getState() {
        return this.state;
    }
    
    public boolean isVisible(final EnumFacing lllllllllllllIlIIIIlIlllllllIIll, final EnumFacing lllllllllllllIlIIIIlIlllllllIIlI) {
        return this.setVisibility.isVisible(lllllllllllllIlIIIIlIlllllllIIll, lllllllllllllIlIIIIlIlllllllIIlI);
    }
    
    private static void llIIIIIllIIIlll() {
        (lIIIlIllIIIIlI = new int[2])[0] = " ".length();
        CompiledChunk.lIIIlIllIIIIlI[1] = ((177 + 174 - 325 + 158 ^ 61 + 34 - 11 + 88) & (0x75 ^ 0x72 ^ (0xA1 ^ 0xB2) ^ -" ".length()));
    }
    
    public CompiledChunk() {
        this.layersUsed = new boolean[EnumWorldBlockLayer.values().length];
        this.layersStarted = new boolean[EnumWorldBlockLayer.values().length];
        this.empty = (CompiledChunk.lIIIlIllIIIIlI[0] != 0);
        this.tileEntities = (List<TileEntity>)Lists.newArrayList();
        this.setVisibility = new SetVisibility();
    }
    
    static {
        llIIIIIllIIIlll();
        DUMMY = new CompiledChunk() {
            private static final /* synthetic */ int[] llllIlIllIIll;
            
            @Override
            protected void setLayerUsed(final EnumWorldBlockLayer lllllllllllllIlIllIlIlllIllllllI) {
                throw new UnsupportedOperationException();
            }
            
            static {
                lIlIlIlIlIlIIlI();
            }
            
            @Override
            public void setLayerStarted(final EnumWorldBlockLayer lllllllllllllIlIllIlIlllIlllllII) {
                throw new UnsupportedOperationException();
            }
            
            @Override
            public boolean isVisible(final EnumFacing lllllllllllllIlIllIlIlllIllllIlI, final EnumFacing lllllllllllllIlIllIlIlllIllllIIl) {
                return CompiledChunk$1.llllIlIllIIll[0] != 0;
            }
            
            private static void lIlIlIlIlIlIIlI() {
                (llllIlIllIIll = new int[1])[0] = ((0x52 ^ 0x6E ^ (0x2D ^ 0x2B)) & (0x51 ^ 0x4E ^ (0x88 ^ 0xAD) ^ -" ".length()));
            }
        };
    }
    
    public void setVisibility(final SetVisibility lllllllllllllIlIIIIlIllllllIlllI) {
        this.setVisibility = lllllllllllllIlIIIIlIllllllIlllI;
    }
    
    protected void setLayerUsed(final EnumWorldBlockLayer lllllllllllllIlIIIIllIIIIIIllIII) {
        this.empty = (CompiledChunk.lIIIlIllIIIIlI[1] != 0);
        this.layersUsed[lllllllllllllIlIIIIllIIIIIIllIII.ordinal()] = (CompiledChunk.lIIIlIllIIIIlI[0] != 0);
    }
    
    public boolean isEmpty() {
        return this.empty;
    }
    
    public boolean isLayerStarted(final EnumWorldBlockLayer lllllllllllllIlIIIIllIIIIIIIIllI) {
        return this.layersStarted[lllllllllllllIlIIIIllIIIIIIIIllI.ordinal()];
    }
    
    public void setLayerStarted(final EnumWorldBlockLayer lllllllllllllIlIIIIllIIIIIIIllII) {
        this.layersStarted[lllllllllllllIlIIIIllIIIIIIIllII.ordinal()] = (CompiledChunk.lIIIlIllIIIIlI[0] != 0);
    }
}
