// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.client.gui;

import java.util.Iterator;
import net.minecraft.block.material.MapColor;
import net.minecraft.client.renderer.WorldRenderer;
import net.minecraft.util.Vec4b;
import net.minecraft.client.renderer.vertex.DefaultVertexFormats;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.texture.DynamicTexture;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import net.minecraft.world.storage.MapData;
import com.google.common.collect.Maps;
import net.minecraft.util.ResourceLocation;
import net.minecraft.client.renderer.texture.TextureManager;
import java.util.Map;

public class MapItemRenderer
{
    private static final /* synthetic */ String[] llIIlllIlIlIll;
    private final /* synthetic */ Map<String, Instance> loadedMaps;
    private final /* synthetic */ TextureManager textureManager;
    private static final /* synthetic */ int[] llIIlllIlIllII;
    private static final /* synthetic */ ResourceLocation mapIcons;
    
    public void clearLoadedMaps() {
        final long llllllllllllIllIllllIllIIIIlIlll = (long)this.loadedMaps.values().iterator();
        "".length();
        if ((0xB ^ 0x78 ^ (0x6A ^ 0x1D)) < 0) {
            return;
        }
        while (!lIIIlllllIlIlIIl(((Iterator)llllllllllllIllIllllIllIIIIlIlll).hasNext() ? 1 : 0)) {
            final Instance llllllllllllIllIllllIllIIIIllIlI = ((Iterator<Instance>)llllllllllllIllIllllIllIIIIlIlll).next();
            this.textureManager.deleteTexture(llllllllllllIllIllllIllIIIIllIlI.location);
        }
        this.loadedMaps.clear();
    }
    
    public MapItemRenderer(final TextureManager llllllllllllIllIllllIllIIIlllIIl) {
        this.loadedMaps = (Map<String, Instance>)Maps.newHashMap();
        this.textureManager = llllllllllllIllIllllIllIIIlllIIl;
    }
    
    private static void lIIIlllllIlIIllI() {
        (llIIlllIlIllII = new int[3])[0] = ((25 + 32 + 37 + 44 ^ 107 + 112 - 122 + 50) & (123 + 92 - 135 + 111 ^ 18 + 68 - 1 + 81 ^ -" ".length()));
        MapItemRenderer.llIIlllIlIllII[1] = " ".length();
        MapItemRenderer.llIIlllIlIllII[2] = "  ".length();
    }
    
    private static void lIIIlllllIlIIlIl() {
        (llIIlllIlIlIll = new String[MapItemRenderer.llIIlllIlIllII[1]])[MapItemRenderer.llIIlllIlIllII[0]] = lIIIlllllIlIIlII("1yZaY4bZPPCHwS9L7GJif0AMib8b8JqUszScm7ClyE4=", "jJOPH");
    }
    
    static {
        lIIIlllllIlIIllI();
        lIIIlllllIlIIlIl();
        mapIcons = new ResourceLocation(MapItemRenderer.llIIlllIlIlIll[MapItemRenderer.llIIlllIlIllII[0]]);
    }
    
    public void renderMap(final MapData llllllllllllIllIllllIllIIIlIllII, final boolean llllllllllllIllIllllIllIIIlIlIll) {
        this.getMapRendererInstance(llllllllllllIllIllllIllIIIlIllII).render(llllllllllllIllIllllIllIIIlIlIll);
    }
    
    public void updateMapTexture(final MapData llllllllllllIllIllllIllIIIllIIIl) {
        this.getMapRendererInstance(llllllllllllIllIllllIllIIIllIIIl).updateMapTexture();
    }
    
    private Instance getMapRendererInstance(final MapData llllllllllllIllIllllIllIIIlIIIll) {
        Instance llllllllllllIllIllllIllIIIlIIIlI = this.loadedMaps.get(llllllllllllIllIllllIllIIIlIIIll.mapName);
        if (lIIIlllllIlIlIII(llllllllllllIllIllllIllIIIlIIIlI)) {
            llllllllllllIllIllllIllIIIlIIIlI = new Instance(llllllllllllIllIllllIllIIIlIIIll, (Instance)null);
            this.loadedMaps.put(llllllllllllIllIllllIllIIIlIIIll.mapName, llllllllllllIllIllllIllIIIlIIIlI);
            "".length();
        }
        return llllllllllllIllIllllIllIIIlIIIlI;
    }
    
    private static boolean lIIIlllllIlIlIII(final Object llllllllllllIllIllllIllIIIIIIllI) {
        return llllllllllllIllIllllIllIIIIIIllI == null;
    }
    
    private static String lIIIlllllIlIIlII(final String llllllllllllIllIllllIllIIIIIllIl, final String llllllllllllIllIllllIllIIIIIlIlI) {
        try {
            final SecretKeySpec llllllllllllIllIllllIllIIIIlIIII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIllIllllIllIIIIIlIlI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher llllllllllllIllIllllIllIIIIIllll = Cipher.getInstance("Blowfish");
            llllllllllllIllIllllIllIIIIIllll.init(MapItemRenderer.llIIlllIlIllII[2], llllllllllllIllIllllIllIIIIlIIII);
            return new String(llllllllllllIllIllllIllIIIIIllll.doFinal(Base64.getDecoder().decode(llllllllllllIllIllllIllIIIIIllIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIllIllllIllIIIIIlllI) {
            llllllllllllIllIllllIllIIIIIlllI.printStackTrace();
            return null;
        }
    }
    
    private static boolean lIIIlllllIlIlIIl(final int llllllllllllIllIllllIllIIIIIIlII) {
        return llllllllllllIllIllllIllIIIIIIlII == 0;
    }
    
    class Instance
    {
        private final /* synthetic */ MapData mapData;
        private static final /* synthetic */ int[] lllIlllIIIIIlI;
        private final /* synthetic */ DynamicTexture mapTexture;
        private static final /* synthetic */ String[] lllIlllIIIIIIl;
        private final /* synthetic */ int[] mapTextureData;
        private final /* synthetic */ ResourceLocation location;
        
        private void render(final boolean llllllllllllIlIllIIIlIIllllIIIII) {
            final int llllllllllllIlIllIIIlIIllllIlllI = Instance.lllIlllIIIIIlI[1];
            final int llllllllllllIlIllIIIlIIllllIllIl = Instance.lllIlllIIIIIlI[1];
            final Tessellator llllllllllllIlIllIIIlIIllllIllII = Tessellator.getInstance();
            final WorldRenderer llllllllllllIlIllIIIlIIllllIlIll = llllllllllllIlIllIIIlIIllllIllII.getWorldRenderer();
            final float llllllllllllIlIllIIIlIIllllIlIlI = 0.0f;
            MapItemRenderer.this.textureManager.bindTexture(this.location);
            GlStateManager.enableBlend();
            GlStateManager.tryBlendFuncSeparate(Instance.lllIlllIIIIIlI[4], Instance.lllIlllIIIIIlI[10], Instance.lllIlllIIIIIlI[1], Instance.lllIlllIIIIIlI[4]);
            GlStateManager.disableAlpha();
            llllllllllllIlIllIIIlIIllllIlIll.begin(Instance.lllIlllIIIIIlI[11], DefaultVertexFormats.POSITION_TEX);
            llllllllllllIlIllIIIlIIllllIlIll.pos(llllllllllllIlIllIIIlIIllllIlllI + Instance.lllIlllIIIIIlI[1] + llllllllllllIlIllIIIlIIllllIlIlI, llllllllllllIlIllIIIlIIllllIllIl + Instance.lllIlllIIIIIlI[0] - llllllllllllIlIllIIIlIIllllIlIlI, -0.009999999776482582).tex(0.0, 1.0).endVertex();
            llllllllllllIlIllIIIlIIllllIlIll.pos(llllllllllllIlIllIIIlIIllllIlllI + Instance.lllIlllIIIIIlI[0] - llllllllllllIlIllIIIlIIllllIlIlI, llllllllllllIlIllIIIlIIllllIllIl + Instance.lllIlllIIIIIlI[0] - llllllllllllIlIllIIIlIIllllIlIlI, -0.009999999776482582).tex(1.0, 1.0).endVertex();
            llllllllllllIlIllIIIlIIllllIlIll.pos(llllllllllllIlIllIIIlIIllllIlllI + Instance.lllIlllIIIIIlI[0] - llllllllllllIlIllIIIlIIllllIlIlI, llllllllllllIlIllIIIlIIllllIllIl + Instance.lllIlllIIIIIlI[1] + llllllllllllIlIllIIIlIIllllIlIlI, -0.009999999776482582).tex(1.0, 0.0).endVertex();
            llllllllllllIlIllIIIlIIllllIlIll.pos(llllllllllllIlIllIIIlIIllllIlllI + Instance.lllIlllIIIIIlI[1] + llllllllllllIlIllIIIlIIllllIlIlI, llllllllllllIlIllIIIlIIllllIllIl + Instance.lllIlllIIIIIlI[1] + llllllllllllIlIllIIIlIIllllIlIlI, -0.009999999776482582).tex(0.0, 0.0).endVertex();
            llllllllllllIlIllIIIlIIllllIllII.draw();
            GlStateManager.enableAlpha();
            GlStateManager.disableBlend();
            MapItemRenderer.this.textureManager.bindTexture(MapItemRenderer.mapIcons);
            int llllllllllllIlIllIIIlIIllllIlIIl = Instance.lllIlllIIIIIlI[1];
            final byte llllllllllllIlIllIIIlIIlllIllIII = (byte)this.mapData.mapDecorations.values().iterator();
            "".length();
            if (" ".length() <= 0) {
                return;
            }
            while (!lIlIIlIlIllIIlIl(((Iterator)llllllllllllIlIllIIIlIIlllIllIII).hasNext() ? 1 : 0)) {
                final Vec4b llllllllllllIlIllIIIlIIllllIlIII = ((Iterator<Vec4b>)llllllllllllIlIllIIIlIIlllIllIII).next();
                if (!lIlIIlIlIllIIllI(llllllllllllIlIllIIIlIIllllIIIII ? 1 : 0) || lIlIIlIlIllIIlll(llllllllllllIlIllIIIlIIllllIlIII.func_176110_a(), Instance.lllIlllIIIIIlI[4])) {
                    GlStateManager.pushMatrix();
                    GlStateManager.translate(llllllllllllIlIllIIIlIIllllIlllI + llllllllllllIlIllIIIlIIllllIlIII.func_176112_b() / 2.0f + 64.0f, llllllllllllIlIllIIIlIIllllIllIl + llllllllllllIlIllIIIlIIllllIlIII.func_176113_c() / 2.0f + 64.0f, -0.02f);
                    GlStateManager.rotate(llllllllllllIlIllIIIlIIllllIlIII.func_176111_d() * Instance.lllIlllIIIIIlI[12] / 16.0f, 0.0f, 0.0f, 1.0f);
                    GlStateManager.scale(4.0f, 4.0f, 3.0f);
                    GlStateManager.translate(-0.125f, 0.125f, 0.0f);
                    final byte llllllllllllIlIllIIIlIIllllIIlll = llllllllllllIlIllIIIlIIllllIlIII.func_176110_a();
                    final float llllllllllllIlIllIIIlIIllllIIllI = (llllllllllllIlIllIIIlIIllllIIlll % Instance.lllIlllIIIIIlI[3] + Instance.lllIlllIIIIIlI[1]) / 4.0f;
                    final float llllllllllllIlIllIIIlIIllllIIlIl = (llllllllllllIlIllIIIlIIllllIIlll / Instance.lllIlllIIIIIlI[3] + Instance.lllIlllIIIIIlI[1]) / 4.0f;
                    final float llllllllllllIlIllIIIlIIllllIIlII = (llllllllllllIlIllIIIlIIllllIIlll % Instance.lllIlllIIIIIlI[3] + Instance.lllIlllIIIIIlI[4]) / 4.0f;
                    final float llllllllllllIlIllIIIlIIllllIIIll = (llllllllllllIlIllIIIlIIllllIIlll / Instance.lllIlllIIIIIlI[3] + Instance.lllIlllIIIIIlI[4]) / 4.0f;
                    llllllllllllIlIllIIIlIIllllIlIll.begin(Instance.lllIlllIIIIIlI[11], DefaultVertexFormats.POSITION_TEX);
                    final float llllllllllllIlIllIIIlIIllllIIIlI = -0.001f;
                    llllllllllllIlIllIIIlIIllllIlIll.pos(-1.0, 1.0, llllllllllllIlIllIIIlIIllllIlIIl * -0.001f).tex(llllllllllllIlIllIIIlIIllllIIllI, llllllllllllIlIllIIIlIIllllIIlIl).endVertex();
                    llllllllllllIlIllIIIlIIllllIlIll.pos(1.0, 1.0, llllllllllllIlIllIIIlIIllllIlIIl * -0.001f).tex(llllllllllllIlIllIIIlIIllllIIlII, llllllllllllIlIllIIIlIIllllIIlIl).endVertex();
                    llllllllllllIlIllIIIlIIllllIlIll.pos(1.0, -1.0, llllllllllllIlIllIIIlIIllllIlIIl * -0.001f).tex(llllllllllllIlIllIIIlIIllllIIlII, llllllllllllIlIllIIIlIIllllIIIll).endVertex();
                    llllllllllllIlIllIIIlIIllllIlIll.pos(-1.0, -1.0, llllllllllllIlIllIIIlIIllllIlIIl * -0.001f).tex(llllllllllllIlIllIIIlIIllllIIllI, llllllllllllIlIllIIIlIIllllIIIll).endVertex();
                    llllllllllllIlIllIIIlIIllllIllII.draw();
                    GlStateManager.popMatrix();
                    ++llllllllllllIlIllIIIlIIllllIlIIl;
                }
            }
            GlStateManager.pushMatrix();
            GlStateManager.translate(0.0f, 0.0f, -0.04f);
            GlStateManager.scale(1.0f, 1.0f, 1.0f);
            GlStateManager.popMatrix();
        }
        
        private static boolean lIlIIlIlIllIIlII(final int llllllllllllIlIllIIIlIIllIlIIlIl, final int llllllllllllIlIllIIIlIIllIlIIlII) {
            return llllllllllllIlIllIIIlIIllIlIIlIl >= llllllllllllIlIllIIIlIIllIlIIlII;
        }
        
        private static void lIlIIlIlIllIIIll() {
            (lllIlllIIIIIlI = new int[13])[0] = 7 + 55 - 10 + 76;
            Instance.lllIlllIIIIIlI[1] = ((0x49 ^ 0x7F) & ~(0xE ^ 0x38));
            Instance.lllIlllIIIIIlI[2] = 118 + 245 - 362 + 254;
            Instance.lllIlllIIIIIlI[3] = (0x2D ^ 0x29);
            Instance.lllIlllIIIIIlI[4] = " ".length();
            Instance.lllIlllIIIIIlI[5] = (0x66 ^ 0x30 ^ (0x4A ^ 0x14));
            Instance.lllIlllIIIIIlI[6] = (0x1A ^ 0x7 ^ (0x1C ^ 0x11));
            Instance.lllIlllIIIIIlI[7] = (0x17 ^ 0x7 ^ (0x40 ^ 0x48));
            Instance.lllIlllIIIIIlI[8] = "   ".length();
            Instance.lllIlllIIIIIlI[9] = (0xFFFFCDDC & 0x7223);
            Instance.lllIlllIIIIIlI[10] = (0xFFFF9B2B & 0x67D7);
            Instance.lllIlllIIIIIlI[11] = (0x3 ^ 0x4E ^ (0x67 ^ 0x2D));
            Instance.lllIlllIIIIIlI[12] = (0xFFFFB778 & 0x49EF);
        }
        
        private void updateMapTexture() {
            int llllllllllllIlIllIIIlIlIIIIIIlIl = Instance.lllIlllIIIIIlI[1];
            "".length();
            if (((0xC6 ^ 0xA0 ^ 44 + 6 + 14 + 63) & (110 + 89 - 86 + 33 ^ 9 + 74 - 59 + 115 ^ -" ".length())) > 0) {
                return;
            }
            while (!lIlIIlIlIllIIlII(llllllllllllIlIllIIIlIlIIIIIIlIl, Instance.lllIlllIIIIIlI[9])) {
                final int llllllllllllIlIllIIIlIlIIIIIIlII = this.mapData.colors[llllllllllllIlIllIIIlIlIIIIIIlIl] & Instance.lllIlllIIIIIlI[2];
                if (lIlIIlIlIllIIlIl(llllllllllllIlIllIIIlIlIIIIIIlII / Instance.lllIlllIIIIIlI[3])) {
                    this.mapTextureData[llllllllllllIlIllIIIlIlIIIIIIlIl] = (llllllllllllIlIllIIIlIlIIIIIIlIl + llllllllllllIlIllIIIlIlIIIIIIlIl / Instance.lllIlllIIIIIlI[0] & Instance.lllIlllIIIIIlI[4]) * Instance.lllIlllIIIIIlI[5] + Instance.lllIlllIIIIIlI[6] << Instance.lllIlllIIIIIlI[7];
                    "".length();
                    if ("  ".length() <= ((0x1B ^ 0x59) & ~(0x6F ^ 0x2D))) {
                        return;
                    }
                }
                else {
                    this.mapTextureData[llllllllllllIlIllIIIlIlIIIIIIlIl] = MapColor.mapColorArray[llllllllllllIlIllIIIlIlIIIIIIlII / Instance.lllIlllIIIIIlI[3]].func_151643_b(llllllllllllIlIllIIIlIlIIIIIIlII & Instance.lllIlllIIIIIlI[8]);
                }
                ++llllllllllllIlIllIIIlIlIIIIIIlIl;
            }
            this.mapTexture.updateDynamicTexture();
        }
        
        private static void lIlIIlIlIllIIIlI() {
            (lllIlllIIIIIIl = new String[Instance.lllIlllIIIIIlI[4]])[Instance.lllIlllIIIIIlI[1]] = lIlIIlIlIllIIIIl("LCcVew==", "AFeTp");
        }
        
        static {
            lIlIIlIlIllIIIll();
            lIlIIlIlIllIIIlI();
        }
        
        private static boolean lIlIIlIlIllIIlIl(final int llllllllllllIlIllIIIlIIllIIlllII) {
            return llllllllllllIlIllIIIlIIllIIlllII == 0;
        }
        
        private Instance(final MapData llllllllllllIlIllIIIlIlIIIIIlIll) {
            this.mapData = llllllllllllIlIllIIIlIlIIIIIlIll;
            this.mapTexture = new DynamicTexture(Instance.lllIlllIIIIIlI[0], Instance.lllIlllIIIIIlI[0]);
            this.mapTextureData = this.mapTexture.getTextureData();
            this.location = MapItemRenderer.this.textureManager.getDynamicTextureLocation(String.valueOf(new StringBuilder(Instance.lllIlllIIIIIIl[Instance.lllIlllIIIIIlI[1]]).append(llllllllllllIlIllIIIlIlIIIIIlIll.mapName)), this.mapTexture);
            int llllllllllllIlIllIIIlIlIIIIIlllI = Instance.lllIlllIIIIIlI[1];
            "".length();
            if (" ".length() <= ((175 + 44 - 99 + 59 ^ 52 + 126 - 75 + 27) & (0x47 ^ 0x24 ^ (0xD5 ^ 0x87) ^ -" ".length()))) {
                throw null;
            }
            while (!lIlIIlIlIllIIlII(llllllllllllIlIllIIIlIlIIIIIlllI, this.mapTextureData.length)) {
                this.mapTextureData[llllllllllllIlIllIIIlIlIIIIIlllI] = Instance.lllIlllIIIIIlI[1];
                ++llllllllllllIlIllIIIlIlIIIIIlllI;
            }
        }
        
        private static boolean lIlIIlIlIllIIlll(final int llllllllllllIlIllIIIlIIllIlIlIIl, final int llllllllllllIlIllIIIlIIllIlIlIII) {
            return llllllllllllIlIllIIIlIIllIlIlIIl == llllllllllllIlIllIIIlIIllIlIlIII;
        }
        
        private static String lIlIIlIlIllIIIIl(String llllllllllllIlIllIIIlIIllIllIlII, final String llllllllllllIlIllIIIlIIllIllIIll) {
            llllllllllllIlIllIIIlIIllIllIlII = new String(Base64.getDecoder().decode(llllllllllllIlIllIIIlIIllIllIlII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
            final StringBuilder llllllllllllIlIllIIIlIIllIllIlll = new StringBuilder();
            final char[] llllllllllllIlIllIIIlIIllIllIllI = llllllllllllIlIllIIIlIIllIllIIll.toCharArray();
            int llllllllllllIlIllIIIlIIllIllIlIl = Instance.lllIlllIIIIIlI[1];
            final Exception llllllllllllIlIllIIIlIIllIlIllll = (Object)llllllllllllIlIllIIIlIIllIllIlII.toCharArray();
            final char llllllllllllIlIllIIIlIIllIlIlllI = (char)llllllllllllIlIllIIIlIIllIlIllll.length;
            float llllllllllllIlIllIIIlIIllIlIllIl = Instance.lllIlllIIIIIlI[1];
            while (lIlIIlIlIllIlIII((int)llllllllllllIlIllIIIlIIllIlIllIl, llllllllllllIlIllIIIlIIllIlIlllI)) {
                final char llllllllllllIlIllIIIlIIllIlllIlI = llllllllllllIlIllIIIlIIllIlIllll[llllllllllllIlIllIIIlIIllIlIllIl];
                llllllllllllIlIllIIIlIIllIllIlll.append((char)(llllllllllllIlIllIIIlIIllIlllIlI ^ llllllllllllIlIllIIIlIIllIllIllI[llllllllllllIlIllIIIlIIllIllIlIl % llllllllllllIlIllIIIlIIllIllIllI.length]));
                "".length();
                ++llllllllllllIlIllIIIlIIllIllIlIl;
                ++llllllllllllIlIllIIIlIIllIlIllIl;
                "".length();
                if ("   ".length() <= 0) {
                    return null;
                }
            }
            return String.valueOf(llllllllllllIlIllIIIlIIllIllIlll);
        }
        
        private static boolean lIlIIlIlIllIIllI(final int llllllllllllIlIllIIIlIIllIIllllI) {
            return llllllllllllIlIllIIIlIIllIIllllI != 0;
        }
        
        private static boolean lIlIIlIlIllIlIII(final int llllllllllllIlIllIIIlIIllIlIIIIl, final int llllllllllllIlIllIIIlIIllIlIIIII) {
            return llllllllllllIlIllIIIlIIllIlIIIIl < llllllllllllIlIllIIIlIIllIlIIIII;
        }
    }
}
