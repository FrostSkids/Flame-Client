// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.client.renderer;

import net.minecraft.item.ItemStack;
import net.minecraft.client.renderer.tileentity.TileEntityItemStackRenderer;
import net.minecraft.block.Block;

public class ChestRenderer
{
    public void renderChestBrightness(final Block lllllllllllllIlIlIlIlIIlIIIllIll, final float lllllllllllllIlIlIlIlIIlIIIllIlI) {
        GlStateManager.color(lllllllllllllIlIlIlIlIIlIIIllIlI, lllllllllllllIlIlIlIlIIlIIIllIlI, lllllllllllllIlIlIlIlIIlIIIllIlI, 1.0f);
        GlStateManager.rotate(90.0f, 0.0f, 1.0f, 0.0f);
        TileEntityItemStackRenderer.instance.renderByItem(new ItemStack(lllllllllllllIlIlIlIlIIlIIIllIll));
    }
}
