// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.client.resources.data;

public class FontMetadataSection implements IMetadataSection
{
    private final /* synthetic */ float[] charSpacings;
    private final /* synthetic */ float[] charWidths;
    private final /* synthetic */ float[] charLefts;
    
    public FontMetadataSection(final float[] llllllllllllIllIlIIIllllllIlIIll, final float[] llllllllllllIllIlIIIllllllIlIIlI, final float[] llllllllllllIllIlIIIllllllIlIIIl) {
        this.charWidths = llllllllllllIllIlIIIllllllIlIIll;
        this.charLefts = llllllllllllIllIlIIIllllllIlIIlI;
        this.charSpacings = llllllllllllIllIlIIIllllllIlIIIl;
    }
}
