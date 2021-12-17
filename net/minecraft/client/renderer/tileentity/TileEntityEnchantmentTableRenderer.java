// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.client.renderer.tileentity;

import net.minecraft.tileentity.TileEntity;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;
import net.minecraft.client.renderer.GlStateManager;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import net.minecraft.util.ResourceLocation;
import net.minecraft.client.model.ModelBook;
import net.minecraft.tileentity.TileEntityEnchantmentTable;

public class TileEntityEnchantmentTableRenderer extends TileEntitySpecialRenderer<TileEntityEnchantmentTable>
{
    private static final /* synthetic */ String[] lIlIlIIIIIlIIl;
    private static final /* synthetic */ int[] lIlIlIIIIIlIlI;
    private /* synthetic */ ModelBook field_147541_c;
    private static final /* synthetic */ ResourceLocation TEXTURE_BOOK;
    
    private static int lllIlIlIlIIlIlI(final float n, final float n2) {
        return fcmpl(n, n2);
    }
    
    private static String lllIlIlIlIIIlll(String lllllllllllllIIIlIllIIllIlIlllIl, final String lllllllllllllIIIlIllIIllIllIIIIl) {
        lllllllllllllIIIlIllIIllIlIlllIl = (char)new String(Base64.getDecoder().decode(((String)lllllllllllllIIIlIllIIllIlIlllIl).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIIIlIllIIllIllIIIII = new StringBuilder();
        final char[] lllllllllllllIIIlIllIIllIlIlllll = lllllllllllllIIIlIllIIllIllIIIIl.toCharArray();
        int lllllllllllllIIIlIllIIllIlIllllI = TileEntityEnchantmentTableRenderer.lIlIlIIIIIlIlI[0];
        final short lllllllllllllIIIlIllIIllIlIllIII = (Object)((String)lllllllllllllIIIlIllIIllIlIlllIl).toCharArray();
        final long lllllllllllllIIIlIllIIllIlIlIlll = lllllllllllllIIIlIllIIllIlIllIII.length;
        char lllllllllllllIIIlIllIIllIlIlIllI = (char)TileEntityEnchantmentTableRenderer.lIlIlIIIIIlIlI[0];
        while (lllIlIlIlIIllll(lllllllllllllIIIlIllIIllIlIlIllI, (int)lllllllllllllIIIlIllIIllIlIlIlll)) {
            final char lllllllllllllIIIlIllIIllIllIIIll = lllllllllllllIIIlIllIIllIlIllIII[lllllllllllllIIIlIllIIllIlIlIllI];
            lllllllllllllIIIlIllIIllIllIIIII.append((char)(lllllllllllllIIIlIllIIllIllIIIll ^ lllllllllllllIIIlIllIIllIlIlllll[lllllllllllllIIIlIllIIllIlIllllI % lllllllllllllIIIlIllIIllIlIlllll.length]));
            "".length();
            ++lllllllllllllIIIlIllIIllIlIllllI;
            ++lllllllllllllIIIlIllIIllIlIlIllI;
            "".length();
            if ((0xB9 ^ 0xBD) == " ".length()) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIIIlIllIIllIllIIIII);
    }
    
    private static boolean lllIlIlIlIIllll(final int lllllllllllllIIIlIllIIllIlIlIIlI, final int lllllllllllllIIIlIllIIllIlIlIIIl) {
        return lllllllllllllIIIlIllIIllIlIlIIlI < lllllllllllllIIIlIllIIllIlIlIIIl;
    }
    
    private static boolean lllIlIlIlIIlllI(final int lllllllllllllIIIlIllIIllIlIIlIll) {
        return lllllllllllllIIIlIllIIllIlIIlIll > 0;
    }
    
    public TileEntityEnchantmentTableRenderer() {
        this.field_147541_c = new ModelBook();
    }
    
    private static int lllIlIlIlIIlIll(final float n, final float n2) {
        return fcmpg(n, n2);
    }
    
    private static boolean lllIlIlIlIIllII(final int lllllllllllllIIIlIllIIllIlIIllIl) {
        return lllllllllllllIIIlIllIIllIlIIllIl < 0;
    }
    
    @Override
    public void renderTileEntityAt(final TileEntityEnchantmentTable lllllllllllllIIIlIllIIlllIIlIIlI, final double lllllllllllllIIIlIllIIlllIIIIlII, final double lllllllllllllIIIlIllIIlllIIlIIII, final double lllllllllllllIIIlIllIIlllIIIllll, final float lllllllllllllIIIlIllIIlllIIIlllI, final int lllllllllllllIIIlIllIIlllIIIllIl) {
        GlStateManager.pushMatrix();
        GlStateManager.translate((float)lllllllllllllIIIlIllIIlllIIIIlII + 0.5f, (float)lllllllllllllIIIlIllIIlllIIlIIII + 0.75f, (float)lllllllllllllIIIlIllIIlllIIIllll + 0.5f);
        final float lllllllllllllIIIlIllIIlllIIIllII = lllllllllllllIIIlIllIIlllIIlIIlI.tickCount + lllllllllllllIIIlIllIIlllIIIlllI;
        GlStateManager.translate(0.0f, 0.1f + MathHelper.sin(lllllllllllllIIIlIllIIlllIIIllII * 0.1f) * 0.01f, 0.0f);
        float lllllllllllllIIIlIllIIlllIIIlIll = lllllllllllllIIIlIllIIlllIIlIIlI.bookRotation - lllllllllllllIIIlIllIIlllIIlIIlI.bookRotationPrev;
        "".length();
        if ("  ".length() <= 0) {
            return;
        }
        while (!lllIlIlIlIIllII(lllIlIlIlIIlIlI(lllllllllllllIIIlIllIIlllIIIlIll, 3.1415927f))) {
            lllllllllllllIIIlIllIIlllIIIlIll -= 6.2831855f;
        }
        "".length();
        if (-" ".length() >= ((0x1F ^ 0x35 ^ (0x31 ^ 0x6)) & (0x77 ^ 0x36 ^ (0x16 ^ 0x4A) ^ -" ".length()))) {
            return;
        }
        while (!lllIlIlIlIIllIl(lllIlIlIlIIlIll(lllllllllllllIIIlIllIIlllIIIlIll, -3.1415927f))) {
            lllllllllllllIIIlIllIIlllIIIlIll += 6.2831855f;
        }
        final float lllllllllllllIIIlIllIIlllIIIlIlI = lllllllllllllIIIlIllIIlllIIlIIlI.bookRotationPrev + lllllllllllllIIIlIllIIlllIIIlIll * lllllllllllllIIIlIllIIlllIIIlllI;
        GlStateManager.rotate(-lllllllllllllIIIlIllIIlllIIIlIlI * 180.0f / 3.1415927f, 0.0f, 1.0f, 0.0f);
        GlStateManager.rotate(80.0f, 0.0f, 0.0f, 1.0f);
        this.bindTexture(TileEntityEnchantmentTableRenderer.TEXTURE_BOOK);
        float lllllllllllllIIIlIllIIlllIIIlIIl = lllllllllllllIIIlIllIIlllIIlIIlI.pageFlipPrev + (lllllllllllllIIIlIllIIlllIIlIIlI.pageFlip - lllllllllllllIIIlIllIIlllIIlIIlI.pageFlipPrev) * lllllllllllllIIIlIllIIlllIIIlllI + 0.25f;
        float lllllllllllllIIIlIllIIlllIIIlIII = lllllllllllllIIIlIllIIlllIIlIIlI.pageFlipPrev + (lllllllllllllIIIlIllIIlllIIlIIlI.pageFlip - lllllllllllllIIIlIllIIlllIIlIIlI.pageFlipPrev) * lllllllllllllIIIlIllIIlllIIIlllI + 0.75f;
        lllllllllllllIIIlIllIIlllIIIlIIl = (lllllllllllllIIIlIllIIlllIIIlIIl - MathHelper.truncateDoubleToInt(lllllllllllllIIIlIllIIlllIIIlIIl)) * 1.6f - 0.3f;
        lllllllllllllIIIlIllIIlllIIIlIII = (lllllllllllllIIIlIllIIlllIIIlIII - MathHelper.truncateDoubleToInt(lllllllllllllIIIlIllIIlllIIIlIII)) * 1.6f - 0.3f;
        if (lllIlIlIlIIllII(lllIlIlIlIIlIll(lllllllllllllIIIlIllIIlllIIIlIIl, 0.0f))) {
            lllllllllllllIIIlIllIIlllIIIlIIl = 0.0f;
        }
        if (lllIlIlIlIIllII(lllIlIlIlIIlIll(lllllllllllllIIIlIllIIlllIIIlIII, 0.0f))) {
            lllllllllllllIIIlIllIIlllIIIlIII = 0.0f;
        }
        if (lllIlIlIlIIlllI(lllIlIlIlIIlIlI(lllllllllllllIIIlIllIIlllIIIlIIl, 1.0f))) {
            lllllllllllllIIIlIllIIlllIIIlIIl = 1.0f;
        }
        if (lllIlIlIlIIlllI(lllIlIlIlIIlIlI(lllllllllllllIIIlIllIIlllIIIlIII, 1.0f))) {
            lllllllllllllIIIlIllIIlllIIIlIII = 1.0f;
        }
        final float lllllllllllllIIIlIllIIlllIIIIlll = lllllllllllllIIIlIllIIlllIIlIIlI.bookSpreadPrev + (lllllllllllllIIIlIllIIlllIIlIIlI.bookSpread - lllllllllllllIIIlIllIIlllIIlIIlI.bookSpreadPrev) * lllllllllllllIIIlIllIIlllIIIlllI;
        GlStateManager.enableCull();
        this.field_147541_c.render(null, lllllllllllllIIIlIllIIlllIIIllII, lllllllllllllIIIlIllIIlllIIIlIIl, lllllllllllllIIIlIllIIlllIIIlIII, lllllllllllllIIIlIllIIlllIIIIlll, 0.0f, 0.0625f);
        GlStateManager.popMatrix();
    }
    
    private static void lllIlIlIlIIlIII() {
        (lIlIlIIIIIlIIl = new String[TileEntityEnchantmentTableRenderer.lIlIlIIIIIlIlI[1]])[TileEntityEnchantmentTableRenderer.lIlIlIIIIIlIlI[0]] = lllIlIlIlIIIlll("ESoCPgwXKgllHAs7Ez4ASioUKREEIQ4jFwIQDisbCSolKBYKJFQ6FwI=", "eOzJy");
    }
    
    static {
        lllIlIlIlIIlIIl();
        lllIlIlIlIIlIII();
        TEXTURE_BOOK = new ResourceLocation(TileEntityEnchantmentTableRenderer.lIlIlIIIIIlIIl[TileEntityEnchantmentTableRenderer.lIlIlIIIIIlIlI[0]]);
    }
    
    private static void lllIlIlIlIIlIIl() {
        (lIlIlIIIIIlIlI = new int[2])[0] = ((0xFE ^ 0xC6) & ~(0x14 ^ 0x2C));
        TileEntityEnchantmentTableRenderer.lIlIlIIIIIlIlI[1] = " ".length();
    }
    
    private static boolean lllIlIlIlIIllIl(final int lllllllllllllIIIlIllIIllIlIIllll) {
        return lllllllllllllIIIlIllIIllIlIIllll >= 0;
    }
}
