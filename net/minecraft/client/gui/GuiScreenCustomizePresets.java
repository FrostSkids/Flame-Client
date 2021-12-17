// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.client.gui;

import net.minecraft.client.renderer.WorldRenderer;
import net.minecraft.client.renderer.vertex.DefaultVertexFormats;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.GlStateManager;
import java.io.IOException;
import org.lwjgl.input.Keyboard;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import net.minecraft.client.resources.I18n;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.gen.ChunkProviderSettings;
import com.google.common.collect.Lists;
import java.util.List;

public class GuiScreenCustomizePresets extends GuiScreen
{
    private /* synthetic */ GuiCustomizeWorldScreen field_175314_r;
    protected /* synthetic */ String field_175315_a;
    private static final /* synthetic */ List<Info> field_175310_f;
    private /* synthetic */ GuiButton field_175316_h;
    private /* synthetic */ ListPreset field_175311_g;
    private static final /* synthetic */ int[] lIIIlIIlllIlll;
    private /* synthetic */ String field_175313_s;
    private /* synthetic */ GuiTextField field_175317_i;
    private /* synthetic */ String field_175312_t;
    private static final /* synthetic */ String[] lIIIlIIlllIlIl;
    
    @Override
    public void updateScreen() {
        this.field_175317_i.updateCursorCounter();
        super.updateScreen();
    }
    
    private static boolean lIllllllllllIlI(final int lllllllllllllIlIIIlIIIllllIlIIII, final int lllllllllllllIlIIIlIIIllllIIllll) {
        return lllllllllllllIlIIIlIIIllllIlIIII > lllllllllllllIlIIIlIIIllllIIllll;
    }
    
    public GuiScreenCustomizePresets(final GuiCustomizeWorldScreen lllllllllllllIlIIIlIIlIIIlIIllII) {
        this.field_175315_a = GuiScreenCustomizePresets.lIIIlIIlllIlIl[GuiScreenCustomizePresets.lIIIlIIlllIlll[14]];
        this.field_175314_r = lllllllllllllIlIIIlIIlIIIlIIllII;
    }
    
    private static boolean lIlllllllllllII(final int lllllllllllllIlIIIlIIIllllIlIlII, final int lllllllllllllIlIIIlIIIllllIlIIll) {
        return lllllllllllllIlIIIlIIIllllIlIlII <= lllllllllllllIlIIIlIIIllllIlIIll;
    }
    
    static {
        lIllllllllllIII();
        lIlllllllllIlll();
        field_175310_f = Lists.newArrayList();
        ChunkProviderSettings.Factory lllllllllllllIlIIIlIIlIIIlIlIlIl = ChunkProviderSettings.Factory.jsonToFactory("{ \"coordinateScale\":684.412, \"heightScale\":684.412, \"upperLimitScale\":512.0, \"lowerLimitScale\":512.0, \"depthNoiseScaleX\":200.0, \"depthNoiseScaleZ\":200.0, \"depthNoiseScaleExponent\":0.5, \"mainNoiseScaleX\":5000.0, \"mainNoiseScaleY\":1000.0, \"mainNoiseScaleZ\":5000.0, \"baseSize\":8.5, \"stretchY\":8.0, \"biomeDepthWeight\":2.0, \"biomeDepthOffset\":0.5, \"biomeScaleWeight\":2.0, \"biomeScaleOffset\":0.375, \"useCaves\":true, \"useDungeons\":true, \"dungeonChance\":8, \"useStrongholds\":true, \"useVillages\":true, \"useMineShafts\":true, \"useTemples\":true, \"useRavines\":true, \"useWaterLakes\":true, \"waterLakeChance\":4, \"useLavaLakes\":true, \"lavaLakeChance\":80, \"useLavaOceans\":false, \"seaLevel\":255 }");
        ResourceLocation lllllllllllllIlIIIlIIlIIIlIlIlII = new ResourceLocation(GuiScreenCustomizePresets.lIIIlIIlllIlIl[GuiScreenCustomizePresets.lIIIlIIlllIlll[0]]);
        GuiScreenCustomizePresets.field_175310_f.add(new Info(I18n.format(GuiScreenCustomizePresets.lIIIlIIlllIlIl[GuiScreenCustomizePresets.lIIIlIIlllIlll[1]], new Object[GuiScreenCustomizePresets.lIIIlIIlllIlll[0]]), lllllllllllllIlIIIlIIlIIIlIlIlII, lllllllllllllIlIIIlIIlIIIlIlIlIl));
        "".length();
        lllllllllllllIlIIIlIIlIIIlIlIlIl = ChunkProviderSettings.Factory.jsonToFactory("{\"coordinateScale\":3000.0, \"heightScale\":6000.0, \"upperLimitScale\":250.0, \"lowerLimitScale\":512.0, \"depthNoiseScaleX\":200.0, \"depthNoiseScaleZ\":200.0, \"depthNoiseScaleExponent\":0.5, \"mainNoiseScaleX\":80.0, \"mainNoiseScaleY\":160.0, \"mainNoiseScaleZ\":80.0, \"baseSize\":8.5, \"stretchY\":10.0, \"biomeDepthWeight\":1.0, \"biomeDepthOffset\":0.0, \"biomeScaleWeight\":1.0, \"biomeScaleOffset\":0.0, \"useCaves\":true, \"useDungeons\":true, \"dungeonChance\":8, \"useStrongholds\":true, \"useVillages\":true, \"useMineShafts\":true, \"useTemples\":true, \"useRavines\":true, \"useWaterLakes\":true, \"waterLakeChance\":4, \"useLavaLakes\":true, \"lavaLakeChance\":80, \"useLavaOceans\":false, \"seaLevel\":63 }");
        lllllllllllllIlIIIlIIlIIIlIlIlII = new ResourceLocation(GuiScreenCustomizePresets.lIIIlIIlllIlIl[GuiScreenCustomizePresets.lIIIlIIlllIlll[2]]);
        GuiScreenCustomizePresets.field_175310_f.add(new Info(I18n.format(GuiScreenCustomizePresets.lIIIlIIlllIlIl[GuiScreenCustomizePresets.lIIIlIIlllIlll[3]], new Object[GuiScreenCustomizePresets.lIIIlIIlllIlll[0]]), lllllllllllllIlIIIlIIlIIIlIlIlII, lllllllllllllIlIIIlIIlIIIlIlIlIl));
        "".length();
        lllllllllllllIlIIIlIIlIIIlIlIlIl = ChunkProviderSettings.Factory.jsonToFactory("{\"coordinateScale\":684.412, \"heightScale\":684.412, \"upperLimitScale\":512.0, \"lowerLimitScale\":512.0, \"depthNoiseScaleX\":200.0, \"depthNoiseScaleZ\":200.0, \"depthNoiseScaleExponent\":0.5, \"mainNoiseScaleX\":5000.0, \"mainNoiseScaleY\":1000.0, \"mainNoiseScaleZ\":5000.0, \"baseSize\":8.5, \"stretchY\":5.0, \"biomeDepthWeight\":2.0, \"biomeDepthOffset\":1.0, \"biomeScaleWeight\":4.0, \"biomeScaleOffset\":1.0, \"useCaves\":true, \"useDungeons\":true, \"dungeonChance\":8, \"useStrongholds\":true, \"useVillages\":true, \"useMineShafts\":true, \"useTemples\":true, \"useRavines\":true, \"useWaterLakes\":true, \"waterLakeChance\":4, \"useLavaLakes\":true, \"lavaLakeChance\":80, \"useLavaOceans\":false, \"seaLevel\":63 }");
        lllllllllllllIlIIIlIIlIIIlIlIlII = new ResourceLocation(GuiScreenCustomizePresets.lIIIlIIlllIlIl[GuiScreenCustomizePresets.lIIIlIIlllIlll[4]]);
        GuiScreenCustomizePresets.field_175310_f.add(new Info(I18n.format(GuiScreenCustomizePresets.lIIIlIIlllIlIl[GuiScreenCustomizePresets.lIIIlIIlllIlll[5]], new Object[GuiScreenCustomizePresets.lIIIlIIlllIlll[0]]), lllllllllllllIlIIIlIIlIIIlIlIlII, lllllllllllllIlIIIlIIlIIIlIlIlIl));
        "".length();
        lllllllllllllIlIIIlIIlIIIlIlIlIl = ChunkProviderSettings.Factory.jsonToFactory("{\"coordinateScale\":738.41864, \"heightScale\":157.69133, \"upperLimitScale\":801.4267, \"lowerLimitScale\":1254.1643, \"depthNoiseScaleX\":374.93652, \"depthNoiseScaleZ\":288.65228, \"depthNoiseScaleExponent\":1.2092624, \"mainNoiseScaleX\":1355.9908, \"mainNoiseScaleY\":745.5343, \"mainNoiseScaleZ\":1183.464, \"baseSize\":1.8758626, \"stretchY\":1.7137525, \"biomeDepthWeight\":1.7553768, \"biomeDepthOffset\":3.4701107, \"biomeScaleWeight\":1.0, \"biomeScaleOffset\":2.535211, \"useCaves\":true, \"useDungeons\":true, \"dungeonChance\":8, \"useStrongholds\":true, \"useVillages\":true, \"useMineShafts\":true, \"useTemples\":true, \"useRavines\":true, \"useWaterLakes\":true, \"waterLakeChance\":4, \"useLavaLakes\":true, \"lavaLakeChance\":80, \"useLavaOceans\":false, \"seaLevel\":63 }");
        lllllllllllllIlIIIlIIlIIIlIlIlII = new ResourceLocation(GuiScreenCustomizePresets.lIIIlIIlllIlIl[GuiScreenCustomizePresets.lIIIlIIlllIlll[6]]);
        GuiScreenCustomizePresets.field_175310_f.add(new Info(I18n.format(GuiScreenCustomizePresets.lIIIlIIlllIlIl[GuiScreenCustomizePresets.lIIIlIIlllIlll[7]], new Object[GuiScreenCustomizePresets.lIIIlIIlllIlll[0]]), lllllllllllllIlIIIlIIlIIIlIlIlII, lllllllllllllIlIIIlIIlIIIlIlIlIl));
        "".length();
        lllllllllllllIlIIIlIIlIIIlIlIlIl = ChunkProviderSettings.Factory.jsonToFactory("{\"coordinateScale\":684.412, \"heightScale\":684.412, \"upperLimitScale\":512.0, \"lowerLimitScale\":512.0, \"depthNoiseScaleX\":200.0, \"depthNoiseScaleZ\":200.0, \"depthNoiseScaleExponent\":0.5, \"mainNoiseScaleX\":1000.0, \"mainNoiseScaleY\":3000.0, \"mainNoiseScaleZ\":1000.0, \"baseSize\":8.5, \"stretchY\":10.0, \"biomeDepthWeight\":1.0, \"biomeDepthOffset\":0.0, \"biomeScaleWeight\":1.0, \"biomeScaleOffset\":0.0, \"useCaves\":true, \"useDungeons\":true, \"dungeonChance\":8, \"useStrongholds\":true, \"useVillages\":true, \"useMineShafts\":true, \"useTemples\":true, \"useRavines\":true, \"useWaterLakes\":true, \"waterLakeChance\":4, \"useLavaLakes\":true, \"lavaLakeChance\":80, \"useLavaOceans\":false, \"seaLevel\":20 }");
        lllllllllllllIlIIIlIIlIIIlIlIlII = new ResourceLocation(GuiScreenCustomizePresets.lIIIlIIlllIlIl[GuiScreenCustomizePresets.lIIIlIIlllIlll[8]]);
        GuiScreenCustomizePresets.field_175310_f.add(new Info(I18n.format(GuiScreenCustomizePresets.lIIIlIIlllIlIl[GuiScreenCustomizePresets.lIIIlIIlllIlll[9]], new Object[GuiScreenCustomizePresets.lIIIlIIlllIlll[0]]), lllllllllllllIlIIIlIIlIIIlIlIlII, lllllllllllllIlIIIlIIlIIIlIlIlIl));
        "".length();
        lllllllllllllIlIIIlIIlIIIlIlIlIl = ChunkProviderSettings.Factory.jsonToFactory("{\"coordinateScale\":684.412, \"heightScale\":684.412, \"upperLimitScale\":2.0, \"lowerLimitScale\":64.0, \"depthNoiseScaleX\":200.0, \"depthNoiseScaleZ\":200.0, \"depthNoiseScaleExponent\":0.5, \"mainNoiseScaleX\":80.0, \"mainNoiseScaleY\":160.0, \"mainNoiseScaleZ\":80.0, \"baseSize\":8.5, \"stretchY\":12.0, \"biomeDepthWeight\":1.0, \"biomeDepthOffset\":0.0, \"biomeScaleWeight\":1.0, \"biomeScaleOffset\":0.0, \"useCaves\":true, \"useDungeons\":true, \"dungeonChance\":8, \"useStrongholds\":true, \"useVillages\":true, \"useMineShafts\":true, \"useTemples\":true, \"useRavines\":true, \"useWaterLakes\":true, \"waterLakeChance\":4, \"useLavaLakes\":true, \"lavaLakeChance\":80, \"useLavaOceans\":false, \"seaLevel\":6 }");
        lllllllllllllIlIIIlIIlIIIlIlIlII = new ResourceLocation(GuiScreenCustomizePresets.lIIIlIIlllIlIl[GuiScreenCustomizePresets.lIIIlIIlllIlll[10]]);
        GuiScreenCustomizePresets.field_175310_f.add(new Info(I18n.format(GuiScreenCustomizePresets.lIIIlIIlllIlIl[GuiScreenCustomizePresets.lIIIlIIlllIlll[11]], new Object[GuiScreenCustomizePresets.lIIIlIIlllIlll[0]]), lllllllllllllIlIIIlIIlIIIlIlIlII, lllllllllllllIlIIIlIIlIIIlIlIlIl));
        "".length();
        lllllllllllllIlIIIlIIlIIIlIlIlIl = ChunkProviderSettings.Factory.jsonToFactory("{\"coordinateScale\":684.412, \"heightScale\":684.412, \"upperLimitScale\":512.0, \"lowerLimitScale\":512.0, \"depthNoiseScaleX\":200.0, \"depthNoiseScaleZ\":200.0, \"depthNoiseScaleExponent\":0.5, \"mainNoiseScaleX\":80.0, \"mainNoiseScaleY\":160.0, \"mainNoiseScaleZ\":80.0, \"baseSize\":8.5, \"stretchY\":12.0, \"biomeDepthWeight\":1.0, \"biomeDepthOffset\":0.0, \"biomeScaleWeight\":1.0, \"biomeScaleOffset\":0.0, \"useCaves\":true, \"useDungeons\":true, \"dungeonChance\":8, \"useStrongholds\":true, \"useVillages\":true, \"useMineShafts\":true, \"useTemples\":true, \"useRavines\":true, \"useWaterLakes\":true, \"waterLakeChance\":4, \"useLavaLakes\":true, \"lavaLakeChance\":80, \"useLavaOceans\":true, \"seaLevel\":40 }");
        lllllllllllllIlIIIlIIlIIIlIlIlII = new ResourceLocation(GuiScreenCustomizePresets.lIIIlIIlllIlIl[GuiScreenCustomizePresets.lIIIlIIlllIlll[12]]);
        GuiScreenCustomizePresets.field_175310_f.add(new Info(I18n.format(GuiScreenCustomizePresets.lIIIlIIlllIlIl[GuiScreenCustomizePresets.lIIIlIIlllIlll[13]], new Object[GuiScreenCustomizePresets.lIIIlIIlllIlll[0]]), lllllllllllllIlIIIlIIlIIIlIlIlII, lllllllllllllIlIIIlIIlIIIlIlIlIl));
        "".length();
    }
    
    private boolean func_175305_g() {
        if ((!lIllllllllllIlI(this.field_175311_g.field_178053_u, GuiScreenCustomizePresets.lIIIlIIlllIlll[31]) || lIllllllllllIll(this.field_175311_g.field_178053_u, GuiScreenCustomizePresets.field_175310_f.size())) && lIlllllllllllII(this.field_175317_i.getText().length(), GuiScreenCustomizePresets.lIIIlIIlllIlll[1])) {
            return GuiScreenCustomizePresets.lIIIlIIlllIlll[0] != 0;
        }
        return GuiScreenCustomizePresets.lIIIlIIlllIlll[1] != 0;
    }
    
    private static String lIllllllllIIIIl(final String lllllllllllllIlIIIlIIIlllllIIIlI, final String lllllllllllllIlIIIlIIIlllllIIIIl) {
        try {
            final SecretKeySpec lllllllllllllIlIIIlIIIlllllIIlll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIlIIIlIIIlllllIIIIl.getBytes(StandardCharsets.UTF_8)), GuiScreenCustomizePresets.lIIIlIIlllIlll[8]), "DES");
            final Cipher lllllllllllllIlIIIlIIIlllllIIllI = Cipher.getInstance("DES");
            lllllllllllllIlIIIlIIIlllllIIllI.init(GuiScreenCustomizePresets.lIIIlIIlllIlll[2], lllllllllllllIlIIIlIIIlllllIIlll);
            return new String(lllllllllllllIlIIIlIIIlllllIIllI.doFinal(Base64.getDecoder().decode(lllllllllllllIlIIIlIIIlllllIIIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIlIIIlIIIlllllIIlIl) {
            lllllllllllllIlIIIlIIIlllllIIlIl.printStackTrace();
            return null;
        }
    }
    
    private static String lIllllllllIIIll(final String lllllllllllllIlIIIlIIlIIIIIIIlll, final String lllllllllllllIlIIIlIIlIIIIIIlIII) {
        try {
            final SecretKeySpec lllllllllllllIlIIIlIIlIIIIIIllII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIlIIIlIIlIIIIIIlIII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lllllllllllllIlIIIlIIlIIIIIIlIll = Cipher.getInstance("Blowfish");
            lllllllllllllIlIIIlIIlIIIIIIlIll.init(GuiScreenCustomizePresets.lIIIlIIlllIlll[2], lllllllllllllIlIIIlIIlIIIIIIllII);
            return new String(lllllllllllllIlIIIlIIlIIIIIIlIll.doFinal(Base64.getDecoder().decode(lllllllllllllIlIIIlIIlIIIIIIIlll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIlIIIlIIlIIIIIIlIlI) {
            lllllllllllllIlIIIlIIlIIIIIIlIlI.printStackTrace();
            return null;
        }
    }
    
    private static void lIllllllllllIII() {
        (lIIIlIIlllIlll = new int[32])[0] = ((0xF2 ^ 0xAD ^ (0x58 ^ 0xF)) & (0x1B ^ 0x5C ^ (0x64 ^ 0x2B) ^ -" ".length()));
        GuiScreenCustomizePresets.lIIIlIIlllIlll[1] = " ".length();
        GuiScreenCustomizePresets.lIIIlIIlllIlll[2] = "  ".length();
        GuiScreenCustomizePresets.lIIIlIIlllIlll[3] = "   ".length();
        GuiScreenCustomizePresets.lIIIlIIlllIlll[4] = (0x2B ^ 0x4 ^ (0x3B ^ 0x10));
        GuiScreenCustomizePresets.lIIIlIIlllIlll[5] = (0xBD ^ 0xAB ^ (0x55 ^ 0x46));
        GuiScreenCustomizePresets.lIIIlIIlllIlll[6] = (0x6F ^ 0x69);
        GuiScreenCustomizePresets.lIIIlIIlllIlll[7] = (59 + 141 - 36 + 8 ^ 22 + 138 - 125 + 136);
        GuiScreenCustomizePresets.lIIIlIIlllIlll[8] = (0x68 ^ 0x40 ^ (0x5B ^ 0x7B));
        GuiScreenCustomizePresets.lIIIlIIlllIlll[9] = (0x50 ^ 0x59);
        GuiScreenCustomizePresets.lIIIlIIlllIlll[10] = (0xAC ^ 0xA6);
        GuiScreenCustomizePresets.lIIIlIIlllIlll[11] = (65 + 52 - 69 + 118 ^ 29 + 127 - 92 + 109);
        GuiScreenCustomizePresets.lIIIlIIlllIlll[12] = (134 + 144 - 269 + 140 ^ 87 + 84 - 39 + 21);
        GuiScreenCustomizePresets.lIIIlIIlllIlll[13] = (0x52 ^ 0x1 ^ (0x7E ^ 0x20));
        GuiScreenCustomizePresets.lIIIlIIlllIlll[14] = (0x93 ^ 0xAA ^ (0xB7 ^ 0x80));
        GuiScreenCustomizePresets.lIIIlIIlllIlll[15] = (0xF0 ^ 0x88 ^ (0x69 ^ 0x1E));
        GuiScreenCustomizePresets.lIIIlIIlllIlll[16] = (98 + 84 - 49 + 50 ^ 110 + 81 - 78 + 54);
        GuiScreenCustomizePresets.lIIIlIIlllIlll[17] = (0xA0 ^ 0xB1);
        GuiScreenCustomizePresets.lIIIlIIlllIlll[18] = (0x29 ^ 0x69 ^ (0x2A ^ 0x58));
        GuiScreenCustomizePresets.lIIIlIIlllIlll[19] = (0x2B ^ 0x71 ^ (0xF ^ 0x7D));
        GuiScreenCustomizePresets.lIIIlIIlllIlll[20] = (0xEB ^ 0xBC ^ (0x4B ^ 0x78));
        GuiScreenCustomizePresets.lIIIlIIlllIlll[21] = (0x51 ^ 0x45);
        GuiScreenCustomizePresets.lIIIlIIlllIlll[22] = (0xFFFFD7DF & 0x2FF0);
        GuiScreenCustomizePresets.lIIIlIIlllIlll[23] = (0xEC ^ 0x8A);
        GuiScreenCustomizePresets.lIIIlIIlllIlll[24] = (0x4F ^ 0x4B ^ (0x13 ^ 0xC));
        GuiScreenCustomizePresets.lIIIlIIlllIlll[25] = (0x45 ^ 0x57);
        GuiScreenCustomizePresets.lIIIlIIlllIlll[26] = (0x29 ^ 0x7C ^ (0x44 ^ 0x2));
        GuiScreenCustomizePresets.lIIIlIIlllIlll[27] = (-" ".length() & (-1 & 0xFFFFFF));
        GuiScreenCustomizePresets.lIIIlIIlllIlll[28] = (0x55 ^ 0x4B);
        GuiScreenCustomizePresets.lIIIlIIlllIlll[29] = (0xFFFFF4B2 & 0xA0ABED);
        GuiScreenCustomizePresets.lIIIlIIlllIlll[30] = (0x6A ^ 0x2C);
        GuiScreenCustomizePresets.lIIIlIIlllIlll[31] = -" ".length();
    }
    
    @Override
    public void initGui() {
        this.buttonList.clear();
        Keyboard.enableRepeatEvents((boolean)(GuiScreenCustomizePresets.lIIIlIIlllIlll[1] != 0));
        this.field_175315_a = I18n.format(GuiScreenCustomizePresets.lIIIlIIlllIlIl[GuiScreenCustomizePresets.lIIIlIIlllIlll[15]], new Object[GuiScreenCustomizePresets.lIIIlIIlllIlll[0]]);
        this.field_175313_s = I18n.format(GuiScreenCustomizePresets.lIIIlIIlllIlIl[GuiScreenCustomizePresets.lIIIlIIlllIlll[16]], new Object[GuiScreenCustomizePresets.lIIIlIIlllIlll[0]]);
        this.field_175312_t = I18n.format(GuiScreenCustomizePresets.lIIIlIIlllIlIl[GuiScreenCustomizePresets.lIIIlIIlllIlll[17]], new Object[GuiScreenCustomizePresets.lIIIlIIlllIlll[0]]);
        this.field_175317_i = new GuiTextField(GuiScreenCustomizePresets.lIIIlIIlllIlll[2], this.fontRendererObj, GuiScreenCustomizePresets.lIIIlIIlllIlll[18], GuiScreenCustomizePresets.lIIIlIIlllIlll[19], this.width - GuiScreenCustomizePresets.lIIIlIIlllIlll[20], GuiScreenCustomizePresets.lIIIlIIlllIlll[21]);
        this.field_175311_g = new ListPreset();
        this.field_175317_i.setMaxStringLength(GuiScreenCustomizePresets.lIIIlIIlllIlll[22]);
        this.field_175317_i.setText(this.field_175314_r.func_175323_a());
        final List<GuiButton> buttonList = this.buttonList;
        final GuiButton field_175316_h = new GuiButton(GuiScreenCustomizePresets.lIIIlIIlllIlll[0], this.width / GuiScreenCustomizePresets.lIIIlIIlllIlll[2] - GuiScreenCustomizePresets.lIIIlIIlllIlll[23], this.height - GuiScreenCustomizePresets.lIIIlIIlllIlll[24], GuiScreenCustomizePresets.lIIIlIIlllIlll[20], GuiScreenCustomizePresets.lIIIlIIlllIlll[21], I18n.format(GuiScreenCustomizePresets.lIIIlIIlllIlIl[GuiScreenCustomizePresets.lIIIlIIlllIlll[25]], new Object[GuiScreenCustomizePresets.lIIIlIIlllIlll[0]]));
        this.field_175316_h = field_175316_h;
        buttonList.add(field_175316_h);
        "".length();
        this.buttonList.add(new GuiButton(GuiScreenCustomizePresets.lIIIlIIlllIlll[1], this.width / GuiScreenCustomizePresets.lIIIlIIlllIlll[2] + GuiScreenCustomizePresets.lIIIlIIlllIlll[3], this.height - GuiScreenCustomizePresets.lIIIlIIlllIlll[24], GuiScreenCustomizePresets.lIIIlIIlllIlll[20], GuiScreenCustomizePresets.lIIIlIIlllIlll[21], I18n.format(GuiScreenCustomizePresets.lIIIlIIlllIlIl[GuiScreenCustomizePresets.lIIIlIIlllIlll[26]], new Object[GuiScreenCustomizePresets.lIIIlIIlllIlll[0]])));
        "".length();
        this.func_175304_a();
    }
    
    @Override
    public void handleMouseInput() throws IOException {
        super.handleMouseInput();
        this.field_175311_g.handleMouseInput();
    }
    
    @Override
    public void drawScreen(final int lllllllllllllIlIIIlIIlIIIIlIIlII, final int lllllllllllllIlIIIlIIlIIIIlIIIll, final float lllllllllllllIlIIIlIIlIIIIlIIIlI) {
        this.drawDefaultBackground();
        this.field_175311_g.drawScreen(lllllllllllllIlIIIlIIlIIIIlIIlII, lllllllllllllIlIIIlIIlIIIIlIIIll, lllllllllllllIlIIIlIIlIIIIlIIIlI);
        this.drawCenteredString(this.fontRendererObj, this.field_175315_a, this.width / GuiScreenCustomizePresets.lIIIlIIlllIlll[2], GuiScreenCustomizePresets.lIIIlIIlllIlll[8], GuiScreenCustomizePresets.lIIIlIIlllIlll[27]);
        this.drawString(this.fontRendererObj, this.field_175313_s, GuiScreenCustomizePresets.lIIIlIIlllIlll[18], GuiScreenCustomizePresets.lIIIlIIlllIlll[28], GuiScreenCustomizePresets.lIIIlIIlllIlll[29]);
        this.drawString(this.fontRendererObj, this.field_175312_t, GuiScreenCustomizePresets.lIIIlIIlllIlll[18], GuiScreenCustomizePresets.lIIIlIIlllIlll[30], GuiScreenCustomizePresets.lIIIlIIlllIlll[29]);
        this.field_175317_i.drawTextBox();
        super.drawScreen(lllllllllllllIlIIIlIIlIIIIlIIlII, lllllllllllllIlIIIlIIlIIIIlIIIll, lllllllllllllIlIIIlIIlIIIIlIIIlI);
    }
    
    @Override
    protected void keyTyped(final char lllllllllllllIlIIIlIIlIIIIllIlII, final int lllllllllllllIlIIIlIIlIIIIllIIll) throws IOException {
        if (lIllllllllllIIl(this.field_175317_i.textboxKeyTyped(lllllllllllllIlIIIlIIlIIIIllIlII, lllllllllllllIlIIIlIIlIIIIllIIll) ? 1 : 0)) {
            super.keyTyped(lllllllllllllIlIIIlIIlIIIIllIlII, lllllllllllllIlIIIlIIlIIIIllIIll);
        }
    }
    
    private static boolean lIllllllllllIll(final int lllllllllllllIlIIIlIIIllllIlllII, final int lllllllllllllIlIIIlIIIllllIllIll) {
        return lllllllllllllIlIIIlIIIllllIlllII >= lllllllllllllIlIIIlIIIllllIllIll;
    }
    
    private static boolean lIllllllllllIIl(final int lllllllllllllIlIIIlIIIllllIIllIl) {
        return lllllllllllllIlIIIlIIIllllIIllIl == 0;
    }
    
    private static boolean lIlllllllllllIl(final int lllllllllllllIlIIIlIIIllllIllIII, final int lllllllllllllIlIIIlIIIllllIlIlll) {
        return lllllllllllllIlIIIlIIIllllIllIII < lllllllllllllIlIIIlIIIllllIlIlll;
    }
    
    private static void lIlllllllllIlll() {
        (lIIIlIIlllIlIl = new String[GuiScreenCustomizePresets.lIIIlIIlllIlll[21]])[GuiScreenCustomizePresets.lIIIlIIlllIlll[0]] = lIllllllllIIIIl("XZxoQwQzsmw8NIz4+I/siZr8/bT9XGJHEKGmigu1ST0=", "XysOJ");
        GuiScreenCustomizePresets.lIIIlIIlllIlIl[GuiScreenCustomizePresets.lIIIlIIlllIlll[1]] = lIllllllllIIIIl("YJDjrKrw2VDM/Y3Sf5a6MLwRLVgFlGbMD8IH5tKPaMgA2IaRB/56oSRWpX3foS7x", "XGASn");
        GuiScreenCustomizePresets.lIIIlIIlllIlIl[GuiScreenCustomizePresets.lIIIlIIlllIlll[2]] = lIllllllllIIIlI("BRwOFQADHAVOEgQQWREHFAoTFQZeEAUNEAJXBg8S", "qyvau");
        GuiScreenCustomizePresets.lIIIlIIlllIlIl[GuiScreenCustomizePresets.lIIIlIIlllIlll[3]] = lIllllllllIIIll("dzyEkoWYN9CujeZk6Ly4bBuV5lnmLZrrP/ACIZgwHX3rOxeHkVk4SMiq3cXacraR", "YNDkE");
        GuiScreenCustomizePresets.lIIIlIIlllIlIl[GuiScreenCustomizePresets.lIIIlIIlllIlll[4]] = lIllllllllIIIlI("LRAbGCcrEBBDNSwcTBwgPAYGGCF2EQYAOz4dF0IiNxI=", "YuclR");
        GuiScreenCustomizePresets.lIIIlIIlllIlIl[GuiScreenCustomizePresets.lIIIlIIlllIlll[5]] = lIllllllllIIIIl("Ox4zR/Lz87cW/6MZqX0E2UCYIwYLxoNNNepW2p7Zv0NcrKC7WRpaNtef0BeAKumk", "TfDWT");
        GuiScreenCustomizePresets.lIIIlIIlllIlIl[GuiScreenCustomizePresets.lIIIlIIlllIlll[6]] = lIllllllllIIIlI("MR08ES83HTdKPTARaxUoIAshESlqFSUBNCALN0sqKx8=", "ExDeZ");
        GuiScreenCustomizePresets.lIIIlIIlllIlIl[GuiScreenCustomizePresets.lIIIlIIlllIlll[7]] = lIllllllllIIIll("/Qf0wO/dOLfMHXbl8xB0qT8NZG4NIEZmrGBds4gxLRVLipxzGi5spf4UOB15YLSu", "NEUhk");
        GuiScreenCustomizePresets.lIIIlIIlllIlIl[GuiScreenCustomizePresets.lIIIlIIlllIlll[8]] = lIllllllllIIIIl("VO/5NPI0VLwpKN3f+5ghRa5tv+QYTf8f9sFRj1NRasP7ImUy52Mtjg==", "ythsg");
        GuiScreenCustomizePresets.lIIIlIIlllIlIl[GuiScreenCustomizePresets.lIIIlIIlllIlll[9]] = lIllllllllIIIIl("Lb03ndQzMlipQDZHlIIz6PGm6VfEAA1nCD+6xFkd9+O8JP0tFo15hEdBpSZY8UTQ", "lGCge");
        GuiScreenCustomizePresets.lIIIlIIlllIlIl[GuiScreenCustomizePresets.lIIIlIIlllIlll[10]] = lIllllllllIIIlI("GSsBPCYfKwpnNBgnVjghCD0cPCBCLREpPB5gCSY0", "mNyHS");
        GuiScreenCustomizePresets.lIIIlIIlllIlIl[GuiScreenCustomizePresets.lIIIlIIlllIlll[11]] = lIllllllllIIIll("qw+iTaBWgUfRuJ7caKpQNw5xcoYtF10YEx/tuhazuLeowyUrzF/U5o9Lerj+47F8", "zZtgV");
        GuiScreenCustomizePresets.lIIIlIIlllIlIl[GuiScreenCustomizePresets.lIIIlIIlllIlll[12]] = lIllllllllIIIlI("GwkALgUdCQt1FxoFVyoCCh8dLgNAAA05G0EcFj0=", "olxZp");
        GuiScreenCustomizePresets.lIIIlIIlllIlIl[GuiScreenCustomizePresets.lIIIlIIlllIlll[13]] = lIllllllllIIIll("ro8YrzfSDpbtLOTC3HKywDU4w4lo7m7/K2tcm5mxfsN/ltICLPmweqqnTNqPAb7i", "psqaq");
        GuiScreenCustomizePresets.lIIIlIIlllIlIl[GuiScreenCustomizePresets.lIIIlIIlllIlll[14]] = lIllllllllIIIIl("ezIfRqWZIeprXCOLnTN+6m31SxtvRtnp", "LbsEy");
        GuiScreenCustomizePresets.lIIIlIIlllIlIl[GuiScreenCustomizePresets.lIIIlIIlllIlll[15]] = lIllllllllIIIIl("FYln44v8CgcLihwPUMRasOe0o4Md17roYLtPP2vQXhFsXTazqxShB3t8dOgLz8lj", "uFUGl");
        GuiScreenCustomizePresets.lIIIlIIlllIlIl[GuiScreenCustomizePresets.lIIIlIIlllIlll[16]] = lIllllllllIIIIl("izhDQd9Af9WBZ2EBbjWTb4uiPu/3ZMO5HMKJZgBbRRVBDgZtGQVIOQ==", "RKCkm");
        GuiScreenCustomizePresets.lIIIlIIlllIlIl[GuiScreenCustomizePresets.lIIIlIIlllIlll[17]] = lIllllllllIIIlI("JAczOx0iIjkoBSNbNS8aMxo7MxMiWyYoDDQQIilHKxwlLg==", "GuVZi");
        GuiScreenCustomizePresets.lIIIlIIlllIlIl[GuiScreenCustomizePresets.lIIIlIIlllIlll[25]] = lIllllllllIIIlI("MCMBLSI2Bgs+Ojd/BzklJz4JJSw2fxQ+MyA0ED94IDQIKTUn", "SQdLV");
        GuiScreenCustomizePresets.lIIIlIIlllIlIl[GuiScreenCustomizePresets.lIIIlIIlllIlll[26]] = lIllllllllIIIIl("Ay4ILN9lNdfywchvY+ncZA==", "LbMoT");
    }
    
    @Override
    protected void mouseClicked(final int lllllllllllllIlIIIlIIlIIIIllllll, final int lllllllllllllIlIIIlIIlIIIIlllllI, final int lllllllllllllIlIIIlIIlIIIIlllIIl) throws IOException {
        this.field_175317_i.mouseClicked(lllllllllllllIlIIIlIIlIIIIllllll, lllllllllllllIlIIIlIIlIIIIlllllI, lllllllllllllIlIIIlIIlIIIIlllIIl);
        super.mouseClicked(lllllllllllllIlIIIlIIlIIIIllllll, lllllllllllllIlIIIlIIlIIIIlllllI, lllllllllllllIlIIIlIIlIIIIlllIIl);
    }
    
    @Override
    public void onGuiClosed() {
        Keyboard.enableRepeatEvents((boolean)(GuiScreenCustomizePresets.lIIIlIIlllIlll[0] != 0));
    }
    
    public void func_175304_a() {
        this.field_175316_h.enabled = this.func_175305_g();
    }
    
    @Override
    protected void actionPerformed(final GuiButton lllllllllllllIlIIIlIIlIIIIlIlIlI) throws IOException {
        switch (lllllllllllllIlIIIlIIlIIIIlIlIlI.id) {
            case 0: {
                this.field_175314_r.func_175324_a(this.field_175317_i.getText());
                this.mc.displayGuiScreen(this.field_175314_r);
                "".length();
                if (-"  ".length() >= 0) {
                    return;
                }
                break;
            }
            case 1: {
                this.mc.displayGuiScreen(this.field_175314_r);
                break;
            }
        }
    }
    
    private static String lIllllllllIIIlI(String lllllllllllllIlIIIlIIIllllllIlII, final String lllllllllllllIlIIIlIIIllllllIIll) {
        lllllllllllllIlIIIlIIIllllllIlII = new String(Base64.getDecoder().decode(lllllllllllllIlIIIlIIIllllllIlII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIlIIIlIIIllllllIlll = new StringBuilder();
        final char[] lllllllllllllIlIIIlIIIllllllIllI = lllllllllllllIlIIIlIIIllllllIIll.toCharArray();
        int lllllllllllllIlIIIlIIIllllllIlIl = GuiScreenCustomizePresets.lIIIlIIlllIlll[0];
        final short lllllllllllllIlIIIlIIIlllllIllll = (Object)lllllllllllllIlIIIlIIIllllllIlII.toCharArray();
        final boolean lllllllllllllIlIIIlIIIlllllIlllI = lllllllllllllIlIIIlIIIlllllIllll.length != 0;
        byte lllllllllllllIlIIIlIIIlllllIllIl = (byte)GuiScreenCustomizePresets.lIIIlIIlllIlll[0];
        while (lIlllllllllllIl(lllllllllllllIlIIIlIIIlllllIllIl, lllllllllllllIlIIIlIIIlllllIlllI ? 1 : 0)) {
            final char lllllllllllllIlIIIlIIIlllllllIlI = lllllllllllllIlIIIlIIIlllllIllll[lllllllllllllIlIIIlIIIlllllIllIl];
            lllllllllllllIlIIIlIIIllllllIlll.append((char)(lllllllllllllIlIIIlIIIlllllllIlI ^ lllllllllllllIlIIIlIIIllllllIllI[lllllllllllllIlIIIlIIIllllllIlIl % lllllllllllllIlIIIlIIIllllllIllI.length]));
            "".length();
            ++lllllllllllllIlIIIlIIIllllllIlIl;
            ++lllllllllllllIlIIIlIIIlllllIllIl;
            "".length();
            if (((0xCF ^ 0xC2) & ~(0x6 ^ 0xB)) != 0x0) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIlIIIlIIIllllllIlll);
    }
    
    static class Info
    {
        public /* synthetic */ ResourceLocation field_178953_b;
        public /* synthetic */ ChunkProviderSettings.Factory field_178954_c;
        public /* synthetic */ String field_178955_a;
        
        public Info(final String llllllllllllIllIllIIIlIIIlIlIIIl, final ResourceLocation llllllllllllIllIllIIIlIIIlIIllII, final ChunkProviderSettings.Factory llllllllllllIllIllIIIlIIIlIIlIll) {
            this.field_178955_a = llllllllllllIllIllIIIlIIIlIlIIIl;
            this.field_178953_b = llllllllllllIllIllIIIlIIIlIIllII;
            this.field_178954_c = llllllllllllIllIllIIIlIIIlIIlIll;
        }
    }
    
    class ListPreset extends GuiSlot
    {
        private static final /* synthetic */ int[] lIIlIlllIlIIlI;
        public /* synthetic */ int field_178053_u;
        
        @Override
        protected int getSize() {
            return GuiScreenCustomizePresets.field_175310_f.size();
        }
        
        @Override
        protected void elementClicked(final int lllllllllllllIIllIIIIIllIIlllIlI, final boolean lllllllllllllIIllIIIIIllIIlllllI, final int lllllllllllllIIllIIIIIllIIllllIl, final int lllllllllllllIIllIIIIIllIIllllII) {
            this.field_178053_u = lllllllllllllIIllIIIIIllIIlllIlI;
            GuiScreenCustomizePresets.this.func_175304_a();
            GuiScreenCustomizePresets.this.field_175317_i.setText(GuiScreenCustomizePresets.field_175310_f.get(GuiScreenCustomizePresets.this.field_175311_g.field_178053_u).field_178954_c.toString());
        }
        
        private static boolean llIlIIlllllllll(final int lllllllllllllIIllIIIIIllIIIIIIll, final int lllllllllllllIIllIIIIIllIIIIIIlI) {
            return lllllllllllllIIllIIIIIllIIIIIIll == lllllllllllllIIllIIIIIllIIIIIIlI;
        }
        
        @Override
        protected void drawSlot(final int lllllllllllllIIllIIIIIllIIIlIIIl, final int lllllllllllllIIllIIIIIllIIIIlIII, final int lllllllllllllIIllIIIIIllIIIIIlll, final int lllllllllllllIIllIIIIIllIIIIlllI, final int lllllllllllllIIllIIIIIllIIIIllIl, final int lllllllllllllIIllIIIIIllIIIIllII) {
            final Info lllllllllllllIIllIIIIIllIIIIlIll = GuiScreenCustomizePresets.field_175310_f.get(lllllllllllllIIllIIIIIllIIIlIIIl);
            this.func_178051_a(lllllllllllllIIllIIIIIllIIIIlIII, lllllllllllllIIllIIIIIllIIIIIlll, lllllllllllllIIllIIIIIllIIIIlIll.field_178953_b);
            GuiScreenCustomizePresets.this.fontRendererObj.drawString(lllllllllllllIIllIIIIIllIIIIlIll.field_178955_a, lllllllllllllIIllIIIIIllIIIIlIII + ListPreset.lIIlIlllIlIIlI[1] + ListPreset.lIIlIlllIlIIlI[10], lllllllllllllIIllIIIIIllIIIIIlll + ListPreset.lIIlIlllIlIIlI[11], ListPreset.lIIlIlllIlIIlI[12]);
            "".length();
        }
        
        public ListPreset() {
            super(GuiScreenCustomizePresets.this.mc, GuiScreenCustomizePresets.this.width, GuiScreenCustomizePresets.this.height, ListPreset.lIIlIlllIlIIlI[0], GuiScreenCustomizePresets.this.height - ListPreset.lIIlIlllIlIIlI[1], ListPreset.lIIlIlllIlIIlI[2]);
            this.field_178053_u = ListPreset.lIIlIlllIlIIlI[3];
        }
        
        @Override
        protected void drawBackground() {
        }
        
        static {
            llIlIIllllllllI();
        }
        
        private void func_178051_a(final int lllllllllllllIIllIIIIIllIIIlllll, final int lllllllllllllIIllIIIIIllIIIllllI, final ResourceLocation lllllllllllllIIllIIIIIllIIlIIllI) {
            final int lllllllllllllIIllIIIIIllIIlIIlIl = lllllllllllllIIllIIIIIllIIIlllll + ListPreset.lIIlIlllIlIIlI[6];
            Gui.drawHorizontalLine(lllllllllllllIIllIIIIIllIIlIIlIl - ListPreset.lIIlIlllIlIIlI[4], lllllllllllllIIllIIIIIllIIlIIlIl + ListPreset.lIIlIlllIlIIlI[1], lllllllllllllIIllIIIIIllIIIllllI - ListPreset.lIIlIlllIlIIlI[4], ListPreset.lIIlIlllIlIIlI[7]);
            Gui.drawHorizontalLine(lllllllllllllIIllIIIIIllIIlIIlIl - ListPreset.lIIlIlllIlIIlI[4], lllllllllllllIIllIIIIIllIIlIIlIl + ListPreset.lIIlIlllIlIIlI[1], lllllllllllllIIllIIIIIllIIIllllI + ListPreset.lIIlIlllIlIIlI[1], ListPreset.lIIlIlllIlIIlI[8]);
            Gui.drawVerticalLine(lllllllllllllIIllIIIIIllIIlIIlIl - ListPreset.lIIlIlllIlIIlI[4], lllllllllllllIIllIIIIIllIIIllllI - ListPreset.lIIlIlllIlIIlI[4], lllllllllllllIIllIIIIIllIIIllllI + ListPreset.lIIlIlllIlIIlI[1], ListPreset.lIIlIlllIlIIlI[7]);
            Gui.drawVerticalLine(lllllllllllllIIllIIIIIllIIlIIlIl + ListPreset.lIIlIlllIlIIlI[1], lllllllllllllIIllIIIIIllIIIllllI - ListPreset.lIIlIlllIlIIlI[4], lllllllllllllIIllIIIIIllIIIllllI + ListPreset.lIIlIlllIlIIlI[1], ListPreset.lIIlIlllIlIIlI[8]);
            GlStateManager.color(1.0f, 1.0f, 1.0f, 1.0f);
            this.mc.getTextureManager().bindTexture(lllllllllllllIIllIIIIIllIIlIIllI);
            final int lllllllllllllIIllIIIIIllIIlIIlII = ListPreset.lIIlIlllIlIIlI[1];
            final int lllllllllllllIIllIIIIIllIIlIIIll = ListPreset.lIIlIlllIlIIlI[1];
            final Tessellator lllllllllllllIIllIIIIIllIIlIIIlI = Tessellator.getInstance();
            final WorldRenderer lllllllllllllIIllIIIIIllIIlIIIIl = lllllllllllllIIllIIIIIllIIlIIIlI.getWorldRenderer();
            lllllllllllllIIllIIIIIllIIlIIIIl.begin(ListPreset.lIIlIlllIlIIlI[9], DefaultVertexFormats.POSITION_TEX);
            lllllllllllllIIllIIIIIllIIlIIIIl.pos(lllllllllllllIIllIIIIIllIIlIIlIl + ListPreset.lIIlIlllIlIIlI[5], lllllllllllllIIllIIIIIllIIIllllI + ListPreset.lIIlIlllIlIIlI[1], 0.0).tex(0.0, 1.0).endVertex();
            lllllllllllllIIllIIIIIllIIlIIIIl.pos(lllllllllllllIIllIIIIIllIIlIIlIl + ListPreset.lIIlIlllIlIIlI[1], lllllllllllllIIllIIIIIllIIIllllI + ListPreset.lIIlIlllIlIIlI[1], 0.0).tex(1.0, 1.0).endVertex();
            lllllllllllllIIllIIIIIllIIlIIIIl.pos(lllllllllllllIIllIIIIIllIIlIIlIl + ListPreset.lIIlIlllIlIIlI[1], lllllllllllllIIllIIIIIllIIIllllI + ListPreset.lIIlIlllIlIIlI[5], 0.0).tex(1.0, 0.0).endVertex();
            lllllllllllllIIllIIIIIllIIlIIIIl.pos(lllllllllllllIIllIIIIIllIIlIIlIl + ListPreset.lIIlIlllIlIIlI[5], lllllllllllllIIllIIIIIllIIIllllI + ListPreset.lIIlIlllIlIIlI[5], 0.0).tex(0.0, 0.0).endVertex();
            lllllllllllllIIllIIIIIllIIlIIIlI.draw();
        }
        
        private static void llIlIIllllllllI() {
            (lIIlIlllIlIIlI = new int[13])[0] = (0xF1 ^ 0xA1);
            ListPreset.lIIlIlllIlIIlI[1] = (0x17 ^ 0x35 ^ "  ".length());
            ListPreset.lIIlIlllIlIIlI[2] = (0x84 ^ 0xA2);
            ListPreset.lIIlIlllIlIIlI[3] = -" ".length();
            ListPreset.lIIlIlllIlIIlI[4] = " ".length();
            ListPreset.lIIlIlllIlIIlI[5] = ((0x14 ^ 0x5B) & ~(0xD5 ^ 0x9A));
            ListPreset.lIIlIlllIlIIlI[6] = (0xE8 ^ 0x83 ^ (0xA9 ^ 0xC7));
            ListPreset.lIIlIlllIlIIlI[7] = -(0xFFFFBFEA & 0x1F5F35);
            ListPreset.lIIlIlllIlIIlI[8] = -(-(0x86 ^ 0x88) & (0xFFFFFFED & 0x5F5F7F));
            ListPreset.lIIlIlllIlIIlI[9] = (0x56 ^ 0x51);
            ListPreset.lIIlIlllIlIIlI[10] = (0x55 ^ 0x5F);
            ListPreset.lIIlIlllIlIIlI[11] = (0xA3 ^ 0xAD);
            ListPreset.lIIlIlllIlIIlI[12] = (-" ".length() & (-1 & 0xFFFFFF));
        }
        
        @Override
        protected boolean isSelected(final int lllllllllllllIIllIIIIIllIIllIllI) {
            if (llIlIIlllllllll(lllllllllllllIIllIIIIIllIIllIllI, this.field_178053_u)) {
                return ListPreset.lIIlIlllIlIIlI[4] != 0;
            }
            return ListPreset.lIIlIlllIlIIlI[5] != 0;
        }
    }
}
