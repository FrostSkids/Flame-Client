// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.client.renderer.tileentity;

import java.util.Arrays;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.security.MessageDigest;
import net.minecraft.client.renderer.texture.TextureManager;
import net.minecraft.client.gui.FontRenderer;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import net.minecraft.world.World;
import net.minecraft.util.ResourceLocation;
import net.minecraft.tileentity.TileEntity;

public abstract class TileEntitySpecialRenderer<T extends TileEntity>
{
    private static final /* synthetic */ int[] lIlIIllIIllIll;
    private static final /* synthetic */ String[] lIlIIllIIllIlI;
    protected /* synthetic */ TileEntityRendererDispatcher rendererDispatcher;
    
    private static boolean lllIIlllllIIllI(final Object lllllllllllllIIIllIIllIlIlIllIII) {
        return lllllllllllllIIIllIIllIlIlIllIII != null;
    }
    
    private static boolean lllIIlllllIIlll(final int lllllllllllllIIIllIIllIlIlIllIll, final int lllllllllllllIIIllIIllIlIlIllIlI) {
        return lllllllllllllIIIllIIllIlIlIllIll < lllllllllllllIIIllIIllIlIlIllIlI;
    }
    
    static {
        lllIIlllllIIlIl();
        lllIIlllllIIlII();
        final ResourceLocation[] destroy_STAGES = new ResourceLocation[TileEntitySpecialRenderer.lIlIIllIIllIll[0]];
        destroy_STAGES[TileEntitySpecialRenderer.lIlIIllIIllIll[1]] = new ResourceLocation(TileEntitySpecialRenderer.lIlIIllIIllIlI[TileEntitySpecialRenderer.lIlIIllIIllIll[1]]);
        destroy_STAGES[TileEntitySpecialRenderer.lIlIIllIIllIll[2]] = new ResourceLocation(TileEntitySpecialRenderer.lIlIIllIIllIlI[TileEntitySpecialRenderer.lIlIIllIIllIll[2]]);
        destroy_STAGES[TileEntitySpecialRenderer.lIlIIllIIllIll[3]] = new ResourceLocation(TileEntitySpecialRenderer.lIlIIllIIllIlI[TileEntitySpecialRenderer.lIlIIllIIllIll[3]]);
        destroy_STAGES[TileEntitySpecialRenderer.lIlIIllIIllIll[4]] = new ResourceLocation(TileEntitySpecialRenderer.lIlIIllIIllIlI[TileEntitySpecialRenderer.lIlIIllIIllIll[4]]);
        destroy_STAGES[TileEntitySpecialRenderer.lIlIIllIIllIll[5]] = new ResourceLocation(TileEntitySpecialRenderer.lIlIIllIIllIlI[TileEntitySpecialRenderer.lIlIIllIIllIll[5]]);
        destroy_STAGES[TileEntitySpecialRenderer.lIlIIllIIllIll[6]] = new ResourceLocation(TileEntitySpecialRenderer.lIlIIllIIllIlI[TileEntitySpecialRenderer.lIlIIllIIllIll[6]]);
        destroy_STAGES[TileEntitySpecialRenderer.lIlIIllIIllIll[7]] = new ResourceLocation(TileEntitySpecialRenderer.lIlIIllIIllIlI[TileEntitySpecialRenderer.lIlIIllIIllIll[7]]);
        destroy_STAGES[TileEntitySpecialRenderer.lIlIIllIIllIll[8]] = new ResourceLocation(TileEntitySpecialRenderer.lIlIIllIIllIlI[TileEntitySpecialRenderer.lIlIIllIIllIll[8]]);
        destroy_STAGES[TileEntitySpecialRenderer.lIlIIllIIllIll[9]] = new ResourceLocation(TileEntitySpecialRenderer.lIlIIllIIllIlI[TileEntitySpecialRenderer.lIlIIllIIllIll[9]]);
        destroy_STAGES[TileEntitySpecialRenderer.lIlIIllIIllIll[10]] = new ResourceLocation(TileEntitySpecialRenderer.lIlIIllIIllIlI[TileEntitySpecialRenderer.lIlIIllIIllIll[10]]);
        DESTROY_STAGES = destroy_STAGES;
    }
    
    public void setRendererDispatcher(final TileEntityRendererDispatcher lllllllllllllIIIllIIllIllIIlIlII) {
        this.rendererDispatcher = lllllllllllllIIIllIIllIllIIlIlII;
    }
    
    protected World getWorld() {
        return this.rendererDispatcher.worldObj;
    }
    
    private static String lllIIlllllIIIll(String lllllllllllllIIIllIIllIlIllIIllI, final String lllllllllllllIIIllIIllIlIllIlIlI) {
        lllllllllllllIIIllIIllIlIllIIllI = (int)new String(Base64.getDecoder().decode(((String)lllllllllllllIIIllIIllIlIllIIllI).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIIIllIIllIlIllIlIIl = new StringBuilder();
        final char[] lllllllllllllIIIllIIllIlIllIlIII = lllllllllllllIIIllIIllIlIllIlIlI.toCharArray();
        int lllllllllllllIIIllIIllIlIllIIlll = TileEntitySpecialRenderer.lIlIIllIIllIll[1];
        final long lllllllllllllIIIllIIllIlIllIIIIl = (Object)((String)lllllllllllllIIIllIIllIlIllIIllI).toCharArray();
        final double lllllllllllllIIIllIIllIlIllIIIII = lllllllllllllIIIllIIllIlIllIIIIl.length;
        long lllllllllllllIIIllIIllIlIlIlllll = TileEntitySpecialRenderer.lIlIIllIIllIll[1];
        while (lllIIlllllIIlll((int)lllllllllllllIIIllIIllIlIlIlllll, (int)lllllllllllllIIIllIIllIlIllIIIII)) {
            final char lllllllllllllIIIllIIllIlIllIllII = lllllllllllllIIIllIIllIlIllIIIIl[lllllllllllllIIIllIIllIlIlIlllll];
            lllllllllllllIIIllIIllIlIllIlIIl.append((char)(lllllllllllllIIIllIIllIlIllIllII ^ lllllllllllllIIIllIIllIlIllIlIII[lllllllllllllIIIllIIllIlIllIIlll % lllllllllllllIIIllIIllIlIllIlIII.length]));
            "".length();
            ++lllllllllllllIIIllIIllIlIllIIlll;
            ++lllllllllllllIIIllIIllIlIlIlllll;
            "".length();
            if ((0x86 ^ 0x83) == 0x0) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIIIllIIllIlIllIlIIl);
    }
    
    private static void lllIIlllllIIlII() {
        (lIlIIllIIllIlI = new String[TileEntitySpecialRenderer.lIlIIllIIllIll[0]])[TileEntitySpecialRenderer.lIlIIllIIllIll[1]] = lllIIlllllIIIIl("wOH8kTLXYUH+sjWvOKOK/bCWdAElf6hu5m3mygY5IZBXiKUDPbqLyA==", "LYPEW");
        TileEntitySpecialRenderer.lIlIIllIIllIlI[TileEntitySpecialRenderer.lIlIIllIIllIll[2]] = lllIIlllllIIIlI("xTAiO3wR1tNNJzJwkRocx8giI7+xgSBcHlvqoEZ7P4WAxB88kOFZaw==", "wYzpg");
        TileEntitySpecialRenderer.lIlIIllIIllIlI[TileEntitySpecialRenderer.lIlIIllIIllIll[3]] = lllIIlllllIIIll("NT01MxwzPT5oCy03LiwabjwoNB0zNzQYGjU5KiI2c3Y9KQ4=", "AXMGi");
        TileEntitySpecialRenderer.lIlIIllIIllIlI[TileEntitySpecialRenderer.lIlIIllIIllIll[4]] = lllIIlllllIIIlI("pd2QPwWnB3b9qh6pdwxu/fU0iUWXUIHACj1PryVzxNRX29A/VrnKPw==", "KRGAh");
        TileEntitySpecialRenderer.lIlIIllIIllIlI[TileEntitySpecialRenderer.lIlIIllIIllIll[5]] = lllIIlllllIIIll("Aj80JR0EPz9+Cho1LzobWT4pIhwENTUOGwI7KzQ3QnQ8Pw8=", "vZLQh");
        TileEntitySpecialRenderer.lIlIIllIIllIlI[TileEntitySpecialRenderer.lIlIIllIIllIll[6]] = lllIIlllllIIIll("BhQrDjQAFCBVIx4eMBEyXRU2CTUAHiolMgYQNB8eR18jFCY=", "rqSzA");
        TileEntitySpecialRenderer.lIlIIllIIllIlI[TileEntitySpecialRenderer.lIlIIllIIllIll[7]] = lllIIlllllIIIll("ByIdJBMBIhZ/BB8oBjsVXCMAIxIBKBwPFQcmAjU5RWkVPgE=", "sGePf");
        TileEntitySpecialRenderer.lIlIIllIIllIlI[TileEntitySpecialRenderer.lIlIIllIIllIll[8]] = lllIIlllllIIIIl("A29RRowCord58YcYwSC7FV9LusGlEDQt0VWuntGhNZl8k4q61YXxWQ==", "SEHhw");
        TileEntitySpecialRenderer.lIlIIllIIllIlI[TileEntitySpecialRenderer.lIlIIllIIllIll[9]] = lllIIlllllIIIll("DTIOIBALMgV7BxU4FT8WVjMTJxELOA8LFg02ETE6QXkGOgI=", "yWvTe");
        TileEntitySpecialRenderer.lIlIIllIIllIlI[TileEntitySpecialRenderer.lIlIIllIIllIll[10]] = lllIIlllllIIIIl("sGLhPOrLv4HIQVuZFO4573+BtmIDPUCmqznY0IsjtdmD9JZrTEu6rA==", "ujBsi");
    }
    
    public abstract void renderTileEntityAt(final T p0, final double p1, final double p2, final double p3, final float p4, final int p5);
    
    public FontRenderer getFontRenderer() {
        return this.rendererDispatcher.getFontRenderer();
    }
    
    private static void lllIIlllllIIlIl() {
        (lIlIIllIIllIll = new int[11])[0] = (0xA2 ^ 0xBD ^ (0x17 ^ 0x2));
        TileEntitySpecialRenderer.lIlIIllIIllIll[1] = ((0x99 ^ 0x9D) & ~(0x8B ^ 0x8F));
        TileEntitySpecialRenderer.lIlIIllIIllIll[2] = " ".length();
        TileEntitySpecialRenderer.lIlIIllIIllIll[3] = "  ".length();
        TileEntitySpecialRenderer.lIlIIllIIllIll[4] = "   ".length();
        TileEntitySpecialRenderer.lIlIIllIIllIll[5] = (0x79 ^ 0x21 ^ (0x1F ^ 0x43));
        TileEntitySpecialRenderer.lIlIIllIIllIll[6] = (0xF ^ 0x4B ^ (0xC0 ^ 0x81));
        TileEntitySpecialRenderer.lIlIIllIIllIll[7] = (0xA6 ^ 0xA0);
        TileEntitySpecialRenderer.lIlIIllIIllIll[8] = (45 + 169 - 110 + 67 ^ 165 + 40 - 130 + 97);
        TileEntitySpecialRenderer.lIlIIllIIllIll[9] = (0x93 ^ 0x9B);
        TileEntitySpecialRenderer.lIlIIllIIllIll[10] = (0x2C ^ 0x25);
    }
    
    protected void bindTexture(final ResourceLocation lllllllllllllIIIllIIllIllIIllllI) {
        final TextureManager lllllllllllllIIIllIIllIllIlIIIII = this.rendererDispatcher.renderEngine;
        if (lllIIlllllIIllI(lllllllllllllIIIllIIllIllIlIIIII)) {
            lllllllllllllIIIllIIllIllIlIIIII.bindTexture(lllllllllllllIIIllIIllIllIIllllI);
        }
    }
    
    private static String lllIIlllllIIIIl(final String lllllllllllllIIIllIIllIlIllllIll, final String lllllllllllllIIIllIIllIlIllllIlI) {
        try {
            final SecretKeySpec lllllllllllllIIIllIIllIlIllllllI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIIIllIIllIlIllllIlI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lllllllllllllIIIllIIllIlIlllllIl = Cipher.getInstance("Blowfish");
            lllllllllllllIIIllIIllIlIlllllIl.init(TileEntitySpecialRenderer.lIlIIllIIllIll[3], lllllllllllllIIIllIIllIlIllllllI);
            return new String(lllllllllllllIIIllIIllIlIlllllIl.doFinal(Base64.getDecoder().decode(lllllllllllllIIIllIIllIlIllllIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIIllIIllIlIlllllII) {
            lllllllllllllIIIllIIllIlIlllllII.printStackTrace();
            return null;
        }
    }
    
    public boolean func_181055_a() {
        return TileEntitySpecialRenderer.lIlIIllIIllIll[1] != 0;
    }
    
    private static String lllIIlllllIIIlI(final String lllllllllllllIIIllIIllIllIIIIllI, final String lllllllllllllIIIllIIllIllIIIIlll) {
        try {
            final SecretKeySpec lllllllllllllIIIllIIllIllIIIlIll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIIIllIIllIllIIIIlll.getBytes(StandardCharsets.UTF_8)), TileEntitySpecialRenderer.lIlIIllIIllIll[9]), "DES");
            final Cipher lllllllllllllIIIllIIllIllIIIlIlI = Cipher.getInstance("DES");
            lllllllllllllIIIllIIllIllIIIlIlI.init(TileEntitySpecialRenderer.lIlIIllIIllIll[3], lllllllllllllIIIllIIllIllIIIlIll);
            return new String(lllllllllllllIIIllIIllIllIIIlIlI.doFinal(Base64.getDecoder().decode(lllllllllllllIIIllIIllIllIIIIllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIIllIIllIllIIIlIIl) {
            lllllllllllllIIIllIIllIllIIIlIIl.printStackTrace();
            return null;
        }
    }
}
