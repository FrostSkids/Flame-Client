// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.client.resources;

import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.io.IOException;
import net.minecraft.world.ColorizerFoliage;
import net.minecraft.client.renderer.texture.TextureUtil;
import net.minecraft.util.ResourceLocation;

public class FoliageColorReloadListener implements IResourceManagerReloadListener
{
    private static final /* synthetic */ ResourceLocation LOC_FOLIAGE_PNG;
    private static final /* synthetic */ int[] llIlIlllIllIlI;
    private static final /* synthetic */ String[] llIlIlllIllIIl;
    
    @Override
    public void onResourceManagerReload(final IResourceManager llllllllllllIllIlIIIllllIlIIlIlI) {
        try {
            ColorizerFoliage.setFoliageBiomeColorizer(TextureUtil.readImageData(llllllllllllIllIlIIIllllIlIIlIlI, FoliageColorReloadListener.LOC_FOLIAGE_PNG));
            "".length();
            if (-" ".length() != -" ".length()) {
                return;
            }
        }
        catch (IOException ex) {}
    }
    
    private static String lIIlIlIlllIIllIl(String llllllllllllIllIlIIIllllIIlllIIl, final String llllllllllllIllIlIIIllllIIllllIl) {
        llllllllllllIllIlIIIllllIIlllIIl = new String(Base64.getDecoder().decode(llllllllllllIllIlIIIllllIIlllIIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder llllllllllllIllIlIIIllllIIllllII = new StringBuilder();
        final char[] llllllllllllIllIlIIIllllIIlllIll = llllllllllllIllIlIIIllllIIllllIl.toCharArray();
        int llllllllllllIllIlIIIllllIIlllIlI = FoliageColorReloadListener.llIlIlllIllIlI[0];
        final float llllllllllllIllIlIIIllllIIllIlII = (Object)llllllllllllIllIlIIIllllIIlllIIl.toCharArray();
        final String llllllllllllIllIlIIIllllIIllIIll = (String)llllllllllllIllIlIIIllllIIllIlII.length;
        short llllllllllllIllIlIIIllllIIllIIlI = (short)FoliageColorReloadListener.llIlIlllIllIlI[0];
        while (lIIlIlIlllIlIIII(llllllllllllIllIlIIIllllIIllIIlI, (int)llllllllllllIllIlIIIllllIIllIIll)) {
            final char llllllllllllIllIlIIIllllIIllllll = llllllllllllIllIlIIIllllIIllIlII[llllllllllllIllIlIIIllllIIllIIlI];
            llllllllllllIllIlIIIllllIIllllII.append((char)(llllllllllllIllIlIIIllllIIllllll ^ llllllllllllIllIlIIIllllIIlllIll[llllllllllllIllIlIIIllllIIlllIlI % llllllllllllIllIlIIIllllIIlllIll.length]));
            "".length();
            ++llllllllllllIllIlIIIllllIIlllIlI;
            ++llllllllllllIllIlIIIllllIIllIIlI;
            "".length();
            if (" ".length() == (0xAE ^ 0x9D ^ (0x57 ^ 0x60))) {
                return null;
            }
        }
        return String.valueOf(llllllllllllIllIlIIIllllIIllllII);
    }
    
    static {
        lIIlIlIlllIIllll();
        lIIlIlIlllIIlllI();
        LOC_FOLIAGE_PNG = new ResourceLocation(FoliageColorReloadListener.llIlIlllIllIIl[FoliageColorReloadListener.llIlIlllIllIlI[0]]);
    }
    
    private static void lIIlIlIlllIIllll() {
        (llIlIlllIllIlI = new int[2])[0] = ((0x10 ^ 0x5D ^ (0x1E ^ 0xD)) & (147 + 148 - 275 + 229 ^ 19 + 12 + 12 + 124 ^ -" ".length()));
        FoliageColorReloadListener.llIlIlllIllIlI[1] = " ".length();
    }
    
    private static boolean lIIlIlIlllIlIIII(final int llllllllllllIllIlIIIllllIIlIlllI, final int llllllllllllIllIlIIIllllIIlIllIl) {
        return llllllllllllIllIlIIIllllIIlIlllI < llllllllllllIllIlIIIllllIIlIllIl;
    }
    
    private static void lIIlIlIlllIIlllI() {
        (llIlIlllIllIIl = new String[FoliageColorReloadListener.llIlIlllIllIlI[1]])[FoliageColorReloadListener.llIlIlllIllIlI[0]] = lIIlIlIlllIIllIl("ByYaHTcBJhFGIRwvDRsvEjNNDy0fKgMOJ10zDA4=", "sCbiB");
    }
}
