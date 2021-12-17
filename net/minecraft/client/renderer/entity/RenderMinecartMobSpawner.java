// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.client.renderer.entity;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.client.renderer.tileentity.TileEntityMobSpawnerRenderer;
import net.minecraft.init.Blocks;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.ai.EntityMinecartMobSpawner;

public class RenderMinecartMobSpawner extends RenderMinecart<EntityMinecartMobSpawner>
{
    private static boolean llIlIlIIIIIlIII(final Object lllllllllllllIIllIIIIIlIIllIllll, final Object lllllllllllllIIllIIIIIlIIllIlllI) {
        return lllllllllllllIIllIIIIIlIIllIllll == lllllllllllllIIllIIIIIlIIllIlllI;
    }
    
    @Override
    protected void func_180560_a(final EntityMinecartMobSpawner lllllllllllllIIllIIIIIlIlIIIIIII, final float lllllllllllllIIllIIIIIlIIllllIll, final IBlockState lllllllllllllIIllIIIIIlIIllllllI) {
        super.func_180560_a(lllllllllllllIIllIIIIIlIlIIIIIII, lllllllllllllIIllIIIIIlIIllllIll, lllllllllllllIIllIIIIIlIIllllllI);
        if (llIlIlIIIIIlIII(lllllllllllllIIllIIIIIlIIllllllI.getBlock(), Blocks.mob_spawner)) {
            TileEntityMobSpawnerRenderer.renderMob(lllllllllllllIIllIIIIIlIlIIIIIII.func_98039_d(), lllllllllllllIIllIIIIIlIlIIIIIII.posX, lllllllllllllIIllIIIIIlIlIIIIIII.posY, lllllllllllllIIllIIIIIlIlIIIIIII.posZ, lllllllllllllIIllIIIIIlIIllllIll);
        }
    }
    
    public RenderMinecartMobSpawner(final RenderManager lllllllllllllIIllIIIIIlIlIIIIllI) {
        super(lllllllllllllIIllIIIIIlIlIIIIllI);
    }
}
