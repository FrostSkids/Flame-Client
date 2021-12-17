// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.client.renderer.block.model;

import org.lwjgl.util.vector.Vector3f;
import net.minecraft.util.EnumFacing;

public class BlockPartRotation
{
    public final /* synthetic */ boolean rescale;
    public final /* synthetic */ EnumFacing.Axis axis;
    public final /* synthetic */ float angle;
    public final /* synthetic */ Vector3f origin;
    
    public BlockPartRotation(final Vector3f lllllllllllllIlIlIlllllllIlllIlI, final EnumFacing.Axis lllllllllllllIlIlIlllllllIlllIIl, final float lllllllllllllIlIlIlllllllIlllIII, final boolean lllllllllllllIlIlIlllllllIllIlll) {
        this.origin = lllllllllllllIlIlIlllllllIlllIlI;
        this.axis = lllllllllllllIlIlIlllllllIlllIIl;
        this.angle = lllllllllllllIlIlIlllllllIlllIII;
        this.rescale = lllllllllllllIlIlIlllllllIllIlll;
    }
}
