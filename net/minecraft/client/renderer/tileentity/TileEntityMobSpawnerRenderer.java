// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.client.renderer.tileentity;

import net.minecraft.entity.Entity;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.tileentity.MobSpawnerBaseLogic;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.tileentity.TileEntityMobSpawner;

public class TileEntityMobSpawnerRenderer extends TileEntitySpecialRenderer<TileEntityMobSpawner>
{
    public static void renderMob(final MobSpawnerBaseLogic lllllllllllllIIllIllIlIIIllIIlIl, final double lllllllllllllIIllIllIlIIIllIIlII, final double lllllllllllllIIllIllIlIIIlIlllII, final double lllllllllllllIIllIllIlIIIlIllIll, final float lllllllllllllIIllIllIlIIIllIIIIl) {
        final Entity lllllllllllllIIllIllIlIIIllIIIII = lllllllllllllIIllIllIlIIIllIIlIl.func_180612_a(lllllllllllllIIllIllIlIIIllIIlIl.getSpawnerWorld());
        if (llIIllIlllllllI(lllllllllllllIIllIllIlIIIllIIIII)) {
            final float lllllllllllllIIllIllIlIIIlIlllll = 0.4375f;
            GlStateManager.translate(0.0f, 0.4f, 0.0f);
            GlStateManager.rotate((float)(lllllllllllllIIllIllIlIIIllIIlIl.getPrevMobRotation() + (lllllllllllllIIllIllIlIIIllIIlIl.getMobRotation() - lllllllllllllIIllIllIlIIIllIIlIl.getPrevMobRotation()) * lllllllllllllIIllIllIlIIIllIIIIl) * 10.0f, 0.0f, 1.0f, 0.0f);
            GlStateManager.rotate(-30.0f, 1.0f, 0.0f, 0.0f);
            GlStateManager.translate(0.0f, -0.4f, 0.0f);
            GlStateManager.scale(lllllllllllllIIllIllIlIIIlIlllll, lllllllllllllIIllIllIlIIIlIlllll, lllllllllllllIIllIllIlIIIlIlllll);
            lllllllllllllIIllIllIlIIIllIIIII.setLocationAndAngles(lllllllllllllIIllIllIlIIIllIIlII, lllllllllllllIIllIllIlIIIlIlllII, lllllllllllllIIllIllIlIIIlIllIll, 0.0f, 0.0f);
            Minecraft.getMinecraft().getRenderManager().renderEntityWithPosYaw(lllllllllllllIIllIllIlIIIllIIIII, 0.0, 0.0, 0.0, 0.0f, lllllllllllllIIllIllIlIIIllIIIIl);
            "".length();
        }
    }
    
    @Override
    public void renderTileEntityAt(final TileEntityMobSpawner lllllllllllllIIllIllIlIIIlllIIIl, final double lllllllllllllIIllIllIlIIIlllIllI, final double lllllllllllllIIllIllIlIIIlllIlIl, final double lllllllllllllIIllIllIlIIIllIlllI, final float lllllllllllllIIllIllIlIIIllIllIl, final int lllllllllllllIIllIllIlIIIlllIIlI) {
        GlStateManager.pushMatrix();
        GlStateManager.translate((float)lllllllllllllIIllIllIlIIIlllIllI + 0.5f, (float)lllllllllllllIIllIllIlIIIlllIlIl, (float)lllllllllllllIIllIllIlIIIllIlllI + 0.5f);
        renderMob(lllllllllllllIIllIllIlIIIlllIIIl.getSpawnerBaseLogic(), lllllllllllllIIllIllIlIIIlllIllI, lllllllllllllIIllIllIlIIIlllIlIl, lllllllllllllIIllIllIlIIIllIlllI, lllllllllllllIIllIllIlIIIllIllIl);
        GlStateManager.popMatrix();
    }
    
    private static boolean llIIllIlllllllI(final Object lllllllllllllIIllIllIlIIIlIIlIII) {
        return lllllllllllllIIllIllIlIIIlIIlIII != null;
    }
}
