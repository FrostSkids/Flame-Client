// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.client.gui;

import java.util.Arrays;
import net.minecraft.util.MathHelper;
import net.minecraft.client.Minecraft;
import net.minecraft.world.biome.BiomeGenBase;
import java.util.List;
import net.minecraft.client.renderer.WorldRenderer;
import net.minecraft.client.resources.I18n;
import net.minecraft.client.renderer.vertex.DefaultVertexFormats;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.GlStateManager;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.io.IOException;
import com.google.common.primitives.Floats;
import net.minecraft.world.gen.ChunkProviderSettings;
import java.util.Random;
import com.google.common.base.Predicate;

public class GuiCustomizeWorldScreen extends GuiScreen implements GuiPageButtonList.GuiResponder, GuiSlider.FormatHelper
{
    private /* synthetic */ GuiButton field_175352_x;
    private /* synthetic */ GuiButton field_175350_z;
    private /* synthetic */ GuiButton field_175348_s;
    private /* synthetic */ GuiCreateWorld field_175343_i;
    private /* synthetic */ boolean field_175338_A;
    protected /* synthetic */ String field_175341_a;
    private static final /* synthetic */ String[] lIlllIIlIIllII;
    private /* synthetic */ GuiButton field_175344_w;
    private /* synthetic */ Predicate<String> field_175332_D;
    private /* synthetic */ Random random;
    private /* synthetic */ ChunkProviderSettings.Factory field_175334_E;
    private /* synthetic */ boolean field_175340_C;
    protected /* synthetic */ String field_175335_g;
    private /* synthetic */ GuiPageButtonList field_175349_r;
    protected /* synthetic */ String field_175333_f;
    private /* synthetic */ GuiButton field_175347_t;
    private /* synthetic */ GuiButton field_175345_v;
    private /* synthetic */ ChunkProviderSettings.Factory field_175336_F;
    private /* synthetic */ GuiButton field_175351_y;
    private /* synthetic */ GuiButton field_175346_u;
    protected /* synthetic */ String[] field_175342_h;
    private static final /* synthetic */ int[] lIlllIIlllIllI;
    private /* synthetic */ int field_175339_B;
    
    public GuiCustomizeWorldScreen(final GuiScreen llllllllllllIlllllIIlIIIIllIllIl, final String llllllllllllIlllllIIlIIIIllIllll) {
        this.field_175341_a = GuiCustomizeWorldScreen.lIlllIIlIIllII[GuiCustomizeWorldScreen.lIlllIIlllIllI[0]];
        this.field_175333_f = GuiCustomizeWorldScreen.lIlllIIlIIllII[GuiCustomizeWorldScreen.lIlllIIlllIllI[1]];
        this.field_175335_g = GuiCustomizeWorldScreen.lIlllIIlIIllII[GuiCustomizeWorldScreen.lIlllIIlllIllI[2]];
        this.field_175342_h = new String[GuiCustomizeWorldScreen.lIlllIIlllIllI[3]];
        this.field_175338_A = (GuiCustomizeWorldScreen.lIlllIIlllIllI[0] != 0);
        this.field_175339_B = GuiCustomizeWorldScreen.lIlllIIlllIllI[0];
        this.field_175340_C = (GuiCustomizeWorldScreen.lIlllIIlllIllI[0] != 0);
        this.field_175332_D = (Predicate<String>)new Predicate<String>() {
            private static final /* synthetic */ int[] llIIIIllIllIlI;
            
            private static boolean lIIIlIIIIIlllllI(final int llllllllllllIlllIllIlIIllIIlllll) {
                return llllllllllllIlllIllIlIIllIIlllll < 0;
            }
            
            private static boolean lIIIlIIIIIllllIl(final Object llllllllllllIlllIllIlIIllIlIIIll) {
                return llllllllllllIlllIllIlIIllIlIIIll != null;
            }
            
            private static boolean lIIIlIIIIIllllII(final int llllllllllllIlllIllIlIIllIlIIIIl) {
                return llllllllllllIlllIllIlIIllIlIIIIl != 0;
            }
            
            private static void lIIIlIIIIIlllIlI() {
                (llIIIIllIllIlI = new int[2])[0] = ((0xD8 ^ 0xC6 ^ (0x1B ^ 0x39)) & (75 + 101 - 58 + 13 ^ 137 + 101 - 144 + 97 ^ -" ".length()));
                GuiCustomizeWorldScreen$1.llIIIIllIllIlI[1] = " ".length();
            }
            
            static {
                lIIIlIIIIIlllIlI();
            }
            
            private static int lIIIlIIIIIlllIll(final float n, final float n2) {
                return fcmpl(n, n2);
            }
            
            public boolean apply(final String llllllllllllIlllIllIlIIllIlIlIlI) {
                final Float llllllllllllIlllIllIlIIllIlIlIll = Floats.tryParse(llllllllllllIlllIllIlIIllIlIlIlI);
                if (lIIIlIIIIIllllII(llllllllllllIlllIllIlIIllIlIlIlI.length()) && (!lIIIlIIIIIllllIl(llllllllllllIlllIllIlIIllIlIlIll) || !lIIIlIIIIIllllII(Floats.isFinite((float)llllllllllllIlllIllIlIIllIlIlIll) ? 1 : 0) || lIIIlIIIIIlllllI(lIIIlIIIIIlllIll(llllllllllllIlllIllIlIIllIlIlIll, 0.0f)))) {
                    return GuiCustomizeWorldScreen$1.llIIIIllIllIlI[0] != 0;
                }
                return GuiCustomizeWorldScreen$1.llIIIIllIllIlI[1] != 0;
            }
        };
        this.field_175334_E = new ChunkProviderSettings.Factory();
        this.random = new Random();
        this.field_175343_i = (GuiCreateWorld)llllllllllllIlllllIIlIIIIllIllIl;
        this.func_175324_a(llllllllllllIlllllIIlIIIIllIllll);
    }
    
    private static boolean lIIIIIlIIlIIlIlI(final int llllllllllllIlllllIIIlllIlIIIIll) {
        return llllllllllllIlllllIIIlllIlIIIIll != 0;
    }
    
    @Override
    public void handleMouseInput() throws IOException {
        super.handleMouseInput();
        this.field_175349_r.handleMouseInput();
    }
    
    private void func_175326_g() {
        this.field_175336_F.func_177863_a();
        this.func_175325_f();
        this.func_181031_a((boolean)(GuiCustomizeWorldScreen.lIlllIIlllIllI[0] != 0));
    }
    
    private static boolean lIIIIIlIIlIIlIIl(final Object llllllllllllIlllllIIIlllIlIIIlIl) {
        return llllllllllllIlllllIIIlllIlIIIlIl != null;
    }
    
    private void func_175327_a(final float llllllllllllIlllllIIIllllIlllIlI) {
        final Gui llllllllllllIlllllIIIlllllIIIIIl = this.field_175349_r.func_178056_g();
        if (lIIIIIlIIlIIlIlI((llllllllllllIlllllIIIlllllIIIIIl instanceof GuiTextField) ? 1 : 0)) {
            float llllllllllllIlllllIIIlllllIIIIII = llllllllllllIlllllIIIllllIlllIlI;
            if (lIIIIIlIIlIIlIlI(GuiScreen.isShiftKeyDown() ? 1 : 0)) {
                llllllllllllIlllllIIIlllllIIIIII = llllllllllllIlllllIIIllllIlllIlI * 0.1f;
                if (lIIIIIlIIlIIlIlI(GuiScreen.isCtrlKeyDown() ? 1 : 0)) {
                    llllllllllllIlllllIIIlllllIIIIII *= 0.1f;
                    "".length();
                    if (((15 + 89 - 95 + 167 ^ 118 + 114 - 136 + 53) & (0x33 ^ 0x4F ^ (0x51 ^ 0x8) ^ -" ".length())) != 0x0) {
                        return;
                    }
                }
            }
            else if (lIIIIIlIIlIIlIlI(GuiScreen.isCtrlKeyDown() ? 1 : 0)) {
                llllllllllllIlllllIIIlllllIIIIII = llllllllllllIlllllIIIllllIlllIlI * 10.0f;
                if (lIIIIIlIIlIIlIlI(GuiScreen.isAltKeyDown() ? 1 : 0)) {
                    llllllllllllIlllllIIIlllllIIIIII *= 10.0f;
                }
            }
            final GuiTextField llllllllllllIlllllIIIllllIllllll = (GuiTextField)llllllllllllIlllllIIIlllllIIIIIl;
            Float llllllllllllIlllllIIIllllIlllllI = Floats.tryParse(llllllllllllIlllllIIIllllIllllll.getText());
            if (lIIIIIlIIlIIlIIl(llllllllllllIlllllIIIllllIlllllI)) {
                llllllllllllIlllllIIIllllIlllllI += llllllllllllIlllllIIIlllllIIIIII;
                final int llllllllllllIlllllIIIllllIllllIl = llllllllllllIlllllIIIllllIllllll.getId();
                final String llllllllllllIlllllIIIllllIllllII = this.func_175330_b(llllllllllllIlllllIIIllllIllllll.getId(), llllllllllllIlllllIIIllllIlllllI);
                llllllllllllIlllllIIIllllIllllll.setText(llllllllllllIlllllIIIllllIllllII);
                this.func_175319_a(llllllllllllIlllllIIIllllIllllIl, llllllllllllIlllllIIIllllIllllII);
            }
        }
    }
    
    private static boolean lIIIIIlIIlIIllll(final int llllllllllllIlllllIIIlllIlIIIIIl) {
        return llllllllllllIlllllIIIlllIlIIIIIl == 0;
    }
    
    @Override
    public void onTick(final int llllllllllllIlllllIIlIIIIIIIlIlI, final float llllllllllllIlllllIIlIIIIIIIlIIl) {
        Label_2372: {
            switch (llllllllllllIlllllIIlIIIIIIIlIlI) {
                case 100: {
                    this.field_175336_F.mainNoiseScaleX = llllllllllllIlllllIIlIIIIIIIlIIl;
                    "".length();
                    if (" ".length() >= "   ".length()) {
                        return;
                    }
                    break Label_2372;
                }
                case 101: {
                    this.field_175336_F.mainNoiseScaleY = llllllllllllIlllllIIlIIIIIIIlIIl;
                    "".length();
                    if ("   ".length() < 0) {
                        return;
                    }
                    break Label_2372;
                }
                case 102: {
                    this.field_175336_F.mainNoiseScaleZ = llllllllllllIlllllIIlIIIIIIIlIIl;
                    "".length();
                    if ("  ".length() <= " ".length()) {
                        return;
                    }
                    break Label_2372;
                }
                case 103: {
                    this.field_175336_F.depthNoiseScaleX = llllllllllllIlllllIIlIIIIIIIlIIl;
                    "".length();
                    if (-" ".length() > 0) {
                        return;
                    }
                    break Label_2372;
                }
                case 104: {
                    this.field_175336_F.depthNoiseScaleZ = llllllllllllIlllllIIlIIIIIIIlIIl;
                    "".length();
                    if (" ".length() <= 0) {
                        return;
                    }
                    break Label_2372;
                }
                case 105: {
                    this.field_175336_F.depthNoiseScaleExponent = llllllllllllIlllllIIlIIIIIIIlIIl;
                    "".length();
                    if ((0x14 ^ 0x44 ^ (0xFC ^ 0xA8)) <= "  ".length()) {
                        return;
                    }
                    break Label_2372;
                }
                case 106: {
                    this.field_175336_F.baseSize = llllllllllllIlllllIIlIIIIIIIlIIl;
                    "".length();
                    if (null != null) {
                        return;
                    }
                    break Label_2372;
                }
                case 107: {
                    this.field_175336_F.coordinateScale = llllllllllllIlllllIIlIIIIIIIlIIl;
                    "".length();
                    if (((0x90 ^ 0xC1 ^ (0x64 ^ 0x3A)) & (0xCA ^ 0xB2 ^ (0xF7 ^ 0x80) ^ -" ".length())) != 0x0) {
                        return;
                    }
                    break Label_2372;
                }
                case 108: {
                    this.field_175336_F.heightScale = llllllllllllIlllllIIlIIIIIIIlIIl;
                    "".length();
                    if ("  ".length() < -" ".length()) {
                        return;
                    }
                    break Label_2372;
                }
                case 109: {
                    this.field_175336_F.stretchY = llllllllllllIlllllIIlIIIIIIIlIIl;
                    "".length();
                    if ((0x6 ^ 0x2) <= 0) {
                        return;
                    }
                    break Label_2372;
                }
                case 110: {
                    this.field_175336_F.upperLimitScale = llllllllllllIlllllIIlIIIIIIIlIIl;
                    "".length();
                    if (-" ".length() >= "   ".length()) {
                        return;
                    }
                    break Label_2372;
                }
                case 111: {
                    this.field_175336_F.lowerLimitScale = llllllllllllIlllllIIlIIIIIIIlIIl;
                    "".length();
                    if (-" ".length() > "  ".length()) {
                        return;
                    }
                    break Label_2372;
                }
                case 112: {
                    this.field_175336_F.biomeDepthWeight = llllllllllllIlllllIIlIIIIIIIlIIl;
                    "".length();
                    if ((0x3D ^ 0x39) <= ((0x27 ^ 0x12) & ~(0x4 ^ 0x31))) {
                        return;
                    }
                    break Label_2372;
                }
                case 113: {
                    this.field_175336_F.biomeDepthOffset = llllllllllllIlllllIIlIIIIIIIlIIl;
                    "".length();
                    if ("   ".length() == 0) {
                        return;
                    }
                    break Label_2372;
                }
                case 114: {
                    this.field_175336_F.biomeScaleWeight = llllllllllllIlllllIIlIIIIIIIlIIl;
                    "".length();
                    if (-" ".length() > "   ".length()) {
                        return;
                    }
                    break Label_2372;
                }
                case 115: {
                    this.field_175336_F.biomeScaleOffset = llllllllllllIlllllIIlIIIIIIIlIIl;
                    break;
                }
                case 157: {
                    this.field_175336_F.dungeonChance = (int)llllllllllllIlllllIIlIIIIIIIlIIl;
                    "".length();
                    if ("  ".length() <= 0) {
                        return;
                    }
                    break Label_2372;
                }
                case 158: {
                    this.field_175336_F.waterLakeChance = (int)llllllllllllIlllllIIlIIIIIIIlIIl;
                    "".length();
                    if ("  ".length() > "  ".length()) {
                        return;
                    }
                    break Label_2372;
                }
                case 159: {
                    this.field_175336_F.lavaLakeChance = (int)llllllllllllIlllllIIlIIIIIIIlIIl;
                    "".length();
                    if (-" ".length() > 0) {
                        return;
                    }
                    break Label_2372;
                }
                case 160: {
                    this.field_175336_F.seaLevel = (int)llllllllllllIlllllIIlIIIIIIIlIIl;
                    "".length();
                    if (null != null) {
                        return;
                    }
                    break Label_2372;
                }
                case 162: {
                    this.field_175336_F.fixedBiome = (int)llllllllllllIlllllIIlIIIIIIIlIIl;
                    "".length();
                    if (-(0x8 ^ 0xD) >= 0) {
                        return;
                    }
                    break Label_2372;
                }
                case 163: {
                    this.field_175336_F.biomeSize = (int)llllllllllllIlllllIIlIIIIIIIlIIl;
                    "".length();
                    if ("   ".length() == 0) {
                        return;
                    }
                    break Label_2372;
                }
                case 164: {
                    this.field_175336_F.riverSize = (int)llllllllllllIlllllIIlIIIIIIIlIIl;
                    "".length();
                    if ("  ".length() <= 0) {
                        return;
                    }
                    break Label_2372;
                }
                case 165: {
                    this.field_175336_F.dirtSize = (int)llllllllllllIlllllIIlIIIIIIIlIIl;
                    "".length();
                    if (((0x15 ^ 0x2 ^ "   ".length()) & (0xA0 ^ 0xBB ^ (0x14 ^ 0x1B) ^ -" ".length())) != 0x0) {
                        return;
                    }
                    break Label_2372;
                }
                case 166: {
                    this.field_175336_F.dirtCount = (int)llllllllllllIlllllIIlIIIIIIIlIIl;
                    "".length();
                    if (" ".length() < 0) {
                        return;
                    }
                    break Label_2372;
                }
                case 167: {
                    this.field_175336_F.dirtMinHeight = (int)llllllllllllIlllllIIlIIIIIIIlIIl;
                    "".length();
                    if ("  ".length() >= "   ".length()) {
                        return;
                    }
                    break Label_2372;
                }
                case 168: {
                    this.field_175336_F.dirtMaxHeight = (int)llllllllllllIlllllIIlIIIIIIIlIIl;
                    "".length();
                    if (null != null) {
                        return;
                    }
                    break Label_2372;
                }
                case 169: {
                    this.field_175336_F.gravelSize = (int)llllllllllllIlllllIIlIIIIIIIlIIl;
                    "".length();
                    if (null != null) {
                        return;
                    }
                    break Label_2372;
                }
                case 170: {
                    this.field_175336_F.gravelCount = (int)llllllllllllIlllllIIlIIIIIIIlIIl;
                    "".length();
                    if (null != null) {
                        return;
                    }
                    break Label_2372;
                }
                case 171: {
                    this.field_175336_F.gravelMinHeight = (int)llllllllllllIlllllIIlIIIIIIIlIIl;
                    "".length();
                    if ((0x4E ^ 0x4A) < 0) {
                        return;
                    }
                    break Label_2372;
                }
                case 172: {
                    this.field_175336_F.gravelMaxHeight = (int)llllllllllllIlllllIIlIIIIIIIlIIl;
                    "".length();
                    if (-" ".length() >= (0x4A ^ 0x4E)) {
                        return;
                    }
                    break Label_2372;
                }
                case 173: {
                    this.field_175336_F.graniteSize = (int)llllllllllllIlllllIIlIIIIIIIlIIl;
                    "".length();
                    if (((0x45 ^ 0x5C) & ~(0xAD ^ 0xB4)) != 0x0) {
                        return;
                    }
                    break Label_2372;
                }
                case 174: {
                    this.field_175336_F.graniteCount = (int)llllllllllllIlllllIIlIIIIIIIlIIl;
                    "".length();
                    if (-(0xC6 ^ 0xC2) >= 0) {
                        return;
                    }
                    break Label_2372;
                }
                case 175: {
                    this.field_175336_F.graniteMinHeight = (int)llllllllllllIlllllIIlIIIIIIIlIIl;
                    "".length();
                    if (null != null) {
                        return;
                    }
                    break Label_2372;
                }
                case 176: {
                    this.field_175336_F.graniteMaxHeight = (int)llllllllllllIlllllIIlIIIIIIIlIIl;
                    "".length();
                    if (" ".length() < 0) {
                        return;
                    }
                    break Label_2372;
                }
                case 177: {
                    this.field_175336_F.dioriteSize = (int)llllllllllllIlllllIIlIIIIIIIlIIl;
                    "".length();
                    if ("  ".length() <= 0) {
                        return;
                    }
                    break Label_2372;
                }
                case 178: {
                    this.field_175336_F.dioriteCount = (int)llllllllllllIlllllIIlIIIIIIIlIIl;
                    "".length();
                    if (-" ".length() > "  ".length()) {
                        return;
                    }
                    break Label_2372;
                }
                case 179: {
                    this.field_175336_F.dioriteMinHeight = (int)llllllllllllIlllllIIlIIIIIIIlIIl;
                    "".length();
                    if (null != null) {
                        return;
                    }
                    break Label_2372;
                }
                case 180: {
                    this.field_175336_F.dioriteMaxHeight = (int)llllllllllllIlllllIIlIIIIIIIlIIl;
                    "".length();
                    if (((0x6 ^ 0x5D) & ~(0xC3 ^ 0x98)) != 0x0) {
                        return;
                    }
                    break Label_2372;
                }
                case 181: {
                    this.field_175336_F.andesiteSize = (int)llllllllllllIlllllIIlIIIIIIIlIIl;
                    "".length();
                    if ("  ".length() == 0) {
                        return;
                    }
                    break Label_2372;
                }
                case 182: {
                    this.field_175336_F.andesiteCount = (int)llllllllllllIlllllIIlIIIIIIIlIIl;
                    "".length();
                    if ("   ".length() > "   ".length()) {
                        return;
                    }
                    break Label_2372;
                }
                case 183: {
                    this.field_175336_F.andesiteMinHeight = (int)llllllllllllIlllllIIlIIIIIIIlIIl;
                    "".length();
                    if (-(0x5D ^ 0x57 ^ (0xB3 ^ 0xBD)) >= 0) {
                        return;
                    }
                    break Label_2372;
                }
                case 184: {
                    this.field_175336_F.andesiteMaxHeight = (int)llllllllllllIlllllIIlIIIIIIIlIIl;
                    "".length();
                    if (" ".length() == 0) {
                        return;
                    }
                    break Label_2372;
                }
                case 185: {
                    this.field_175336_F.coalSize = (int)llllllllllllIlllllIIlIIIIIIIlIIl;
                    "".length();
                    if ((0x0 ^ 0x4) <= " ".length()) {
                        return;
                    }
                    break Label_2372;
                }
                case 186: {
                    this.field_175336_F.coalCount = (int)llllllllllllIlllllIIlIIIIIIIlIIl;
                    "".length();
                    if (" ".length() >= "  ".length()) {
                        return;
                    }
                    break Label_2372;
                }
                case 187: {
                    this.field_175336_F.coalMinHeight = (int)llllllllllllIlllllIIlIIIIIIIlIIl;
                    "".length();
                    if (-" ".length() >= "  ".length()) {
                        return;
                    }
                    break Label_2372;
                }
                case 189: {
                    this.field_175336_F.coalMaxHeight = (int)llllllllllllIlllllIIlIIIIIIIlIIl;
                    "".length();
                    if (((0x1F ^ 0x4A ^ (0xD0 ^ 0xC1)) & (48 + 195 - 214 + 168 ^ 56 + 59 - 49 + 63 ^ -" ".length())) != 0x0) {
                        return;
                    }
                    break Label_2372;
                }
                case 190: {
                    this.field_175336_F.ironSize = (int)llllllllllllIlllllIIlIIIIIIIlIIl;
                    "".length();
                    if ((0x2D ^ 0x29) < ((0x59 ^ 0x51) & ~(0x99 ^ 0x91))) {
                        return;
                    }
                    break Label_2372;
                }
                case 191: {
                    this.field_175336_F.ironCount = (int)llllllllllllIlllllIIlIIIIIIIlIIl;
                    "".length();
                    if (-(33 + 0 + 48 + 79 ^ 91 + 6 + 12 + 55) >= 0) {
                        return;
                    }
                    break Label_2372;
                }
                case 192: {
                    this.field_175336_F.ironMinHeight = (int)llllllllllllIlllllIIlIIIIIIIlIIl;
                    "".length();
                    if ("  ".length() <= " ".length()) {
                        return;
                    }
                    break Label_2372;
                }
                case 193: {
                    this.field_175336_F.ironMaxHeight = (int)llllllllllllIlllllIIlIIIIIIIlIIl;
                    "".length();
                    if (-" ".length() > ((0x3D ^ 0x28) & ~(0x97 ^ 0x82))) {
                        return;
                    }
                    break Label_2372;
                }
                case 194: {
                    this.field_175336_F.goldSize = (int)llllllllllllIlllllIIlIIIIIIIlIIl;
                    "".length();
                    if (null != null) {
                        return;
                    }
                    break Label_2372;
                }
                case 195: {
                    this.field_175336_F.goldCount = (int)llllllllllllIlllllIIlIIIIIIIlIIl;
                    "".length();
                    if ("   ".length() == 0) {
                        return;
                    }
                    break Label_2372;
                }
                case 196: {
                    this.field_175336_F.goldMinHeight = (int)llllllllllllIlllllIIlIIIIIIIlIIl;
                    "".length();
                    if (null != null) {
                        return;
                    }
                    break Label_2372;
                }
                case 197: {
                    this.field_175336_F.goldMaxHeight = (int)llllllllllllIlllllIIlIIIIIIIlIIl;
                    "".length();
                    if ("  ".length() == 0) {
                        return;
                    }
                    break Label_2372;
                }
                case 198: {
                    this.field_175336_F.redstoneSize = (int)llllllllllllIlllllIIlIIIIIIIlIIl;
                    "".length();
                    if (" ".length() == 0) {
                        return;
                    }
                    break Label_2372;
                }
                case 199: {
                    this.field_175336_F.redstoneCount = (int)llllllllllllIlllllIIlIIIIIIIlIIl;
                    "".length();
                    if (" ".length() > " ".length()) {
                        return;
                    }
                    break Label_2372;
                }
                case 200: {
                    this.field_175336_F.redstoneMinHeight = (int)llllllllllllIlllllIIlIIIIIIIlIIl;
                    "".length();
                    if (-(0x7A ^ 0x7F) >= 0) {
                        return;
                    }
                    break Label_2372;
                }
                case 201: {
                    this.field_175336_F.redstoneMaxHeight = (int)llllllllllllIlllllIIlIIIIIIIlIIl;
                    "".length();
                    if ("  ".length() >= (0x7E ^ 0x7A)) {
                        return;
                    }
                    break Label_2372;
                }
                case 202: {
                    this.field_175336_F.diamondSize = (int)llllllllllllIlllllIIlIIIIIIIlIIl;
                    "".length();
                    if (((0x8 ^ 0x59) & ~(0x20 ^ 0x71)) < 0) {
                        return;
                    }
                    break Label_2372;
                }
                case 203: {
                    this.field_175336_F.diamondCount = (int)llllllllllllIlllllIIlIIIIIIIlIIl;
                    "".length();
                    if ("   ".length() > "   ".length()) {
                        return;
                    }
                    break Label_2372;
                }
                case 204: {
                    this.field_175336_F.diamondMinHeight = (int)llllllllllllIlllllIIlIIIIIIIlIIl;
                    "".length();
                    if (-" ".length() >= 0) {
                        return;
                    }
                    break Label_2372;
                }
                case 205: {
                    this.field_175336_F.diamondMaxHeight = (int)llllllllllllIlllllIIlIIIIIIIlIIl;
                    "".length();
                    if (-" ".length() >= "   ".length()) {
                        return;
                    }
                    break Label_2372;
                }
                case 206: {
                    this.field_175336_F.lapisSize = (int)llllllllllllIlllllIIlIIIIIIIlIIl;
                    "".length();
                    if ("  ".length() <= -" ".length()) {
                        return;
                    }
                    break Label_2372;
                }
                case 207: {
                    this.field_175336_F.lapisCount = (int)llllllllllllIlllllIIlIIIIIIIlIIl;
                    "".length();
                    if (" ".length() > "  ".length()) {
                        return;
                    }
                    break Label_2372;
                }
                case 208: {
                    this.field_175336_F.lapisCenterHeight = (int)llllllllllllIlllllIIlIIIIIIIlIIl;
                    "".length();
                    if (" ".length() > "  ".length()) {
                        return;
                    }
                    break Label_2372;
                }
                case 209: {
                    this.field_175336_F.lapisSpread = (int)llllllllllllIlllllIIlIIIIIIIlIIl;
                    break Label_2372;
                }
            }
            "".length();
            if ("   ".length() != "   ".length()) {
                return;
            }
        }
        if (lIIIIIlIIlIIlIll(llllllllllllIlllllIIlIIIIIIIlIlI, GuiCustomizeWorldScreen.lIlllIIlllIllI[10]) && lIIIIIlIIlIlIIlI(llllllllllllIlllllIIlIIIIIIIlIlI, GuiCustomizeWorldScreen.lIlllIIlllIllI[208])) {
            final Gui llllllllllllIlllllIIlIIIIIIIlIII = this.field_175349_r.func_178061_c(llllllllllllIlllllIIlIIIIIIIlIlI - GuiCustomizeWorldScreen.lIlllIIlllIllI[10] + GuiCustomizeWorldScreen.lIlllIIlllIllI[198]);
            if (lIIIIIlIIlIIlIIl(llllllllllllIlllllIIlIIIIIIIlIII)) {
                ((GuiTextField)llllllllllllIlllllIIlIIIIIIIlIII).setText(this.func_175330_b(llllllllllllIlllllIIlIIIIIIIlIlI, llllllllllllIlllllIIlIIIIIIIlIIl));
            }
        }
        if (lIIIIIlIIlIIllll(this.field_175336_F.equals(this.field_175334_E) ? 1 : 0)) {
            this.func_181031_a((boolean)(GuiCustomizeWorldScreen.lIlllIIlllIllI[1] != 0));
        }
    }
    
    private static String lIIIIIIllIllllII(final String llllllllllllIlllllIIIlllIllIlIlI, final String llllllllllllIlllllIIIlllIllIlIll) {
        try {
            final SecretKeySpec llllllllllllIlllllIIIlllIllIllll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIlllllIIIlllIllIlIll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher llllllllllllIlllllIIIlllIllIlllI = Cipher.getInstance("Blowfish");
            llllllllllllIlllllIIIlllIllIlllI.init(GuiCustomizeWorldScreen.lIlllIIlllIllI[2], llllllllllllIlllllIIIlllIllIllll);
            return new String(llllllllllllIlllllIIIlllIllIlllI.doFinal(Base64.getDecoder().decode(llllllllllllIlllllIIIlllIllIlIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIlllllIIIlllIllIllIl) {
            llllllllllllIlllllIIIlllIllIllIl.printStackTrace();
            return null;
        }
    }
    
    private static String lIIIIIIllIlllIll(String llllllllllllIlllllIIIlllIlIlIlll, final String llllllllllllIlllllIIIlllIlIlIllI) {
        llllllllllllIlllllIIIlllIlIlIlll = new String(Base64.getDecoder().decode(llllllllllllIlllllIIIlllIlIlIlll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder llllllllllllIlllllIIIlllIlIllIlI = new StringBuilder();
        final char[] llllllllllllIlllllIIIlllIlIllIIl = llllllllllllIlllllIIIlllIlIlIllI.toCharArray();
        int llllllllllllIlllllIIIlllIlIllIII = GuiCustomizeWorldScreen.lIlllIIlllIllI[0];
        final int llllllllllllIlllllIIIlllIlIlIIlI = (Object)llllllllllllIlllllIIIlllIlIlIlll.toCharArray();
        final char llllllllllllIlllllIIIlllIlIlIIIl = (char)llllllllllllIlllllIIIlllIlIlIIlI.length;
        Exception llllllllllllIlllllIIIlllIlIlIIII = (Exception)GuiCustomizeWorldScreen.lIlllIIlllIllI[0];
        while (lIIIIIlIIlIlIIlI((int)llllllllllllIlllllIIIlllIlIlIIII, llllllllllllIlllllIIIlllIlIlIIIl)) {
            final char llllllllllllIlllllIIIlllIlIlllIl = llllllllllllIlllllIIIlllIlIlIIlI[llllllllllllIlllllIIIlllIlIlIIII];
            llllllllllllIlllllIIIlllIlIllIlI.append((char)(llllllllllllIlllllIIIlllIlIlllIl ^ llllllllllllIlllllIIIlllIlIllIIl[llllllllllllIlllllIIIlllIlIllIII % llllllllllllIlllllIIIlllIlIllIIl.length]));
            "".length();
            ++llllllllllllIlllllIIIlllIlIllIII;
            ++llllllllllllIlllllIIIlllIlIlIIII;
            "".length();
            if (null != null) {
                return null;
            }
        }
        return String.valueOf(llllllllllllIlllllIIIlllIlIllIlI);
    }
    
    private static boolean lIIIIIlIIlIlIIIl(final int llllllllllllIlllllIIIlllIIllllll) {
        return llllllllllllIlllllIIIlllIIllllll < 0;
    }
    
    private static boolean lIIIIIlIIlIlIIlI(final int llllllllllllIlllllIIIlllIlIIlIII, final int llllllllllllIlllllIIIlllIlIIIlll) {
        return llllllllllllIlllllIIIlllIlIIlIII < llllllllllllIlllllIIIlllIlIIIlll;
    }
    
    @Override
    protected void mouseClicked(final int llllllllllllIlllllIIIllllIlIlIlI, final int llllllllllllIlllllIIIllllIlIllIl, final int llllllllllllIlllllIIIllllIlIlIII) throws IOException {
        super.mouseClicked(llllllllllllIlllllIIIllllIlIlIlI, llllllllllllIlllllIIIllllIlIllIl, llllllllllllIlllllIIIllllIlIlIII);
        if (lIIIIIlIIlIIllll(this.field_175339_B) && lIIIIIlIIlIIllll(this.field_175340_C ? 1 : 0)) {
            this.field_175349_r.mouseClicked(llllllllllllIlllllIIIllllIlIlIlI, llllllllllllIlllllIIIllllIlIllIl, llllllllllllIlllllIIIllllIlIlIII);
            "".length();
        }
    }
    
    public void func_175324_a(final String llllllllllllIlllllIIlIIIIlIIIlIl) {
        if (lIIIIIlIIlIIlIIl(llllllllllllIlllllIIlIIIIlIIIlIl) && lIIIIIlIIlIIlIlI(llllllllllllIlllllIIlIIIIlIIIlIl.length())) {
            this.field_175336_F = ChunkProviderSettings.Factory.jsonToFactory(llllllllllllIlllllIIlIIIIlIIIlIl);
            "".length();
            if ("   ".length() < 0) {
                return;
            }
        }
        else {
            this.field_175336_F = new ChunkProviderSettings.Factory();
        }
    }
    
    private void func_181031_a(final boolean llllllllllllIlllllIIlIIIIIllIIlI) {
        this.field_175338_A = llllllllllllIlllllIIlIIIIIllIIlI;
        this.field_175346_u.enabled = llllllllllllIlllllIIlIIIIIllIIlI;
    }
    
    private static void lIIIIIlIIlIIlIII() {
        (lIlllIIlllIllI = new int[248])[0] = ((0x2D ^ 0x3 ^ (0x73 ^ 0x56)) & (0xBC ^ 0xA6 ^ (0xD5 ^ 0xC4) ^ -" ".length()));
        GuiCustomizeWorldScreen.lIlllIIlllIllI[1] = " ".length();
        GuiCustomizeWorldScreen.lIlllIIlllIllI[2] = "  ".length();
        GuiCustomizeWorldScreen.lIlllIIlllIllI[3] = (0x17 ^ 0x13);
        GuiCustomizeWorldScreen.lIlllIIlllIllI[4] = "   ".length();
        GuiCustomizeWorldScreen.lIlllIIlllIllI[5] = (0xFFFFDB2E & 0x25FF);
        GuiCustomizeWorldScreen.lIlllIIlllIllI[6] = (0x54 ^ 0x40 ^ ((0x63 ^ 0x48) & ~(0x3B ^ 0x10)));
        GuiCustomizeWorldScreen.lIlllIIlllIllI[7] = (0x45 ^ 0x26 ^ (0xF7 ^ 0x91));
        GuiCustomizeWorldScreen.lIlllIIlllIllI[8] = (0x56 ^ 0x6);
        GuiCustomizeWorldScreen.lIlllIIlllIllI[9] = (0xFFFFCDEF & 0x333F);
        GuiCustomizeWorldScreen.lIlllIIlllIllI[10] = (0x37 ^ 0x53);
        GuiCustomizeWorldScreen.lIlllIIlllIllI[11] = (-(0xFFFFEE75 & 0x73CE) & (0xFFFFF3FB & 0x6F77));
        GuiCustomizeWorldScreen.lIlllIIlllIllI[12] = 31 + 133 - 3 + 8 + (0x75 ^ 0x8) - (44 + 50 - 72 + 126) + (0x0 ^ 0x29);
        GuiCustomizeWorldScreen.lIlllIIlllIllI[13] = (156 + 111 - 109 + 14 ^ 98 + 74 - 163 + 174);
        GuiCustomizeWorldScreen.lIlllIIlllIllI[14] = (87 + 64 - 126 + 171 ^ 54 + 7 + 69 + 28);
        GuiCustomizeWorldScreen.lIlllIIlllIllI[15] = (0x72 ^ 0x74);
        GuiCustomizeWorldScreen.lIlllIIlllIllI[16] = (-(0xFFFFDED1 & 0x71BF) & (0xFFFFDBBD & 0x75FF));
        GuiCustomizeWorldScreen.lIlllIIlllIllI[17] = (0x41 ^ 0x1D);
        GuiCustomizeWorldScreen.lIlllIIlllIllI[18] = (0xBD ^ 0xBA);
        GuiCustomizeWorldScreen.lIlllIIlllIllI[19] = (-(0xFFFF9C5D & 0x6FAF) & (0xFFFFFD3D & 0xFFF));
        GuiCustomizeWorldScreen.lIlllIIlllIllI[20] = (77 + 70 - 136 + 128 ^ 113 + 11 - 7 + 14);
        GuiCustomizeWorldScreen.lIlllIIlllIllI[21] = (0xFFFFED3C & 0x13EF);
        GuiCustomizeWorldScreen.lIlllIIlllIllI[22] = (0xD ^ 0x7A ^ (0x4F ^ 0x5A));
        GuiCustomizeWorldScreen.lIlllIIlllIllI[23] = (79 + 25 - 95 + 157 ^ 78 + 36 + 15 + 46);
        GuiCustomizeWorldScreen.lIlllIIlllIllI[24] = (-(0xFFFFF6DF & 0x79E9) & (0xFFFFF9FF & 0x77FA));
        GuiCustomizeWorldScreen.lIlllIIlllIllI[25] = (0xB4 ^ 0x83);
        GuiCustomizeWorldScreen.lIlllIIlllIllI[26] = 85 + 37 - 22 + 60;
        GuiCustomizeWorldScreen.lIlllIIlllIllI[27] = (0x3E ^ 0xC);
        GuiCustomizeWorldScreen.lIlllIIlllIllI[28] = (0x1B ^ 0x11);
        GuiCustomizeWorldScreen.lIlllIIlllIllI[29] = (-(0xFFFFDAFD & 0x7FCF) & (-1 & 0x5BFF));
        GuiCustomizeWorldScreen.lIlllIIlllIllI[30] = (8 + 43 + 11 + 85 ^ 104 + 88 - 189 + 149);
        GuiCustomizeWorldScreen.lIlllIIlllIllI[31] = (0xB3 ^ 0xA1);
        GuiCustomizeWorldScreen.lIlllIIlllIllI[32] = (0x4F ^ 0x43);
        GuiCustomizeWorldScreen.lIlllIIlllIllI[33] = (0x74 ^ 0x49) + "   ".length() - -(0x7B ^ 0x4D) + (0x84 ^ 0x9A);
        GuiCustomizeWorldScreen.lIlllIIlllIllI[34] = (0x85 ^ 0xBC ^ (0x1 ^ 0x35));
        GuiCustomizeWorldScreen.lIlllIIlllIllI[35] = 90 + 53 - 68 + 54 + (120 + 60 - 62 + 30) - (188 + 219 - 405 + 237) + (0x4F ^ 0x3F);
        GuiCustomizeWorldScreen.lIlllIIlllIllI[36] = (0x42 ^ 0x35 ^ (0x75 ^ 0xC));
        GuiCustomizeWorldScreen.lIlllIIlllIllI[37] = (0x36 ^ 0x1) + (0x53 ^ 0xC) - (53 + 18 - 12 + 86) + (17 + 99 - 98 + 128);
        GuiCustomizeWorldScreen.lIlllIIlllIllI[38] = (21 + 20 + 67 + 80 ^ 24 + 102 + 6 + 47);
        GuiCustomizeWorldScreen.lIlllIIlllIllI[39] = (0x39 ^ 0x1F) + (0x75 ^ 0x28) - (0xA7 ^ 0x99) + (0x60 ^ 0x33);
        GuiCustomizeWorldScreen.lIlllIIlllIllI[40] = (131 + 70 - 51 + 20 ^ 0 + 53 + 10 + 123);
        GuiCustomizeWorldScreen.lIlllIIlllIllI[41] = 129 + 26 - 120 + 118;
        GuiCustomizeWorldScreen.lIlllIIlllIllI[42] = (0x80 ^ 0x91);
        GuiCustomizeWorldScreen.lIlllIIlllIllI[43] = 168 + 102 - 128 + 68;
        GuiCustomizeWorldScreen.lIlllIIlllIllI[44] = 108 + 105 - 113 + 54;
        GuiCustomizeWorldScreen.lIlllIIlllIllI[45] = (0x47 ^ 0x12 ^ (0xD3 ^ 0x95));
        GuiCustomizeWorldScreen.lIlllIIlllIllI[46] = 113 + 117 - 91 + 10;
        GuiCustomizeWorldScreen.lIlllIIlllIllI[47] = (0x72 ^ 0x6C) + (0x8C ^ 0xB5) - (0xA8 ^ 0x80) + (0x2E ^ 0x40);
        GuiCustomizeWorldScreen.lIlllIIlllIllI[48] = (0x2C ^ 0x39);
        GuiCustomizeWorldScreen.lIlllIIlllIllI[49] = 74 + 21 - 32 + 92;
        GuiCustomizeWorldScreen.lIlllIIlllIllI[50] = (105 + 36 - 30 + 49 ^ 31 + 41 + 69 + 41);
        GuiCustomizeWorldScreen.lIlllIIlllIllI[51] = (0xE ^ 0x34) + (0x32 ^ 0x17) - (0xC ^ 0x2F) + (0xD6 ^ 0xB4);
        GuiCustomizeWorldScreen.lIlllIIlllIllI[52] = (0xA1 ^ 0xB6);
        GuiCustomizeWorldScreen.lIlllIIlllIllI[53] = 130 + 53 - 143 + 97 + (0x4A ^ 0x41) - (0x3D ^ 0x61) + (0x27 ^ 0x43);
        GuiCustomizeWorldScreen.lIlllIIlllIllI[54] = (0x6E ^ 0x76);
        GuiCustomizeWorldScreen.lIlllIIlllIllI[55] = (0x5A ^ 0x18) + (0x30 ^ 0x74) - (0x53 ^ 0x62) + (0xD3 ^ 0x99);
        GuiCustomizeWorldScreen.lIlllIIlllIllI[56] = (42 + 45 + 33 + 25 ^ 16 + 126 - 112 + 106);
        GuiCustomizeWorldScreen.lIlllIIlllIllI[57] = (0x7F ^ 0x5C) + "  ".length() - -(0x7C ^ 0x5A) + (0x68 ^ 0x3E);
        GuiCustomizeWorldScreen.lIlllIIlllIllI[58] = (0x11 ^ 0xB);
        GuiCustomizeWorldScreen.lIlllIIlllIllI[59] = (0x4E ^ 0x21) + (0x7 ^ 0x15) - -(0xAF ^ 0xB9) + (0x8E ^ 0x85);
        GuiCustomizeWorldScreen.lIlllIIlllIllI[60] = (0x92 ^ 0xA4) + (0x38 ^ 0x6F) - (0x7B ^ 0x6C) + (0x4C ^ 0x61);
        GuiCustomizeWorldScreen.lIlllIIlllIllI[61] = (0xB7 ^ 0xAB);
        GuiCustomizeWorldScreen.lIlllIIlllIllI[62] = 24 + 63 + 13 + 64;
        GuiCustomizeWorldScreen.lIlllIIlllIllI[63] = (0x6E ^ 0x66 ^ (0x5F ^ 0x4A));
        GuiCustomizeWorldScreen.lIlllIIlllIllI[64] = (0xC5 ^ 0xAA ^ (0x53 ^ 0x7E));
        GuiCustomizeWorldScreen.lIlllIIlllIllI[65] = (0xFFFFFBB8 & 0x5E7);
        GuiCustomizeWorldScreen.lIlllIIlllIllI[66] = (0x1B ^ 0x74 ^ (0xE6 ^ 0x97));
        GuiCustomizeWorldScreen.lIlllIIlllIllI[67] = 112 + 8 + 8 + 37;
        GuiCustomizeWorldScreen.lIlllIIlllIllI[68] = (0xB ^ 0x1F ^ (0x70 ^ 0x7B));
        GuiCustomizeWorldScreen.lIlllIIlllIllI[69] = (0x36 ^ 0x6C) + (0x13 ^ 0x17) - -(0x67 ^ 0x5D) + (0x21 ^ 0x2F);
        GuiCustomizeWorldScreen.lIlllIIlllIllI[70] = (0xA ^ 0x2A);
        GuiCustomizeWorldScreen.lIlllIIlllIllI[71] = 105 + 43 - 53 + 34 + (128 + 97 - 147 + 76) - (80 + 120 - 27 + 5) + (0x1E ^ 0x20);
        GuiCustomizeWorldScreen.lIlllIIlllIllI[72] = (76 + 91 - 153 + 130 ^ 95 + 54 + 14 + 14);
        GuiCustomizeWorldScreen.lIlllIIlllIllI[73] = (0x23 ^ 0x3) + (0x7D ^ 0x62) - -(0x19 ^ 0x27) + (0xBD ^ 0x96);
        GuiCustomizeWorldScreen.lIlllIIlllIllI[74] = (101 + 40 - 54 + 58 ^ 22 + 154 - 40 + 43);
        GuiCustomizeWorldScreen.lIlllIIlllIllI[75] = (0xFFFFFDBB & 0x3E5);
        GuiCustomizeWorldScreen.lIlllIIlllIllI[76] = (0x83 ^ 0xA0);
        GuiCustomizeWorldScreen.lIlllIIlllIllI[77] = 20 + 1 + 27 + 121;
        GuiCustomizeWorldScreen.lIlllIIlllIllI[78] = (25 + 116 - 40 + 41 ^ 62 + 50 - 109 + 167);
        GuiCustomizeWorldScreen.lIlllIIlllIllI[79] = 141 + 156 - 197 + 70;
        GuiCustomizeWorldScreen.lIlllIIlllIllI[80] = (0x74 ^ 0x51);
        GuiCustomizeWorldScreen.lIlllIIlllIllI[81] = 89 + 128 - 93 + 45 + (0x73 ^ 0x7C) - (0x10 ^ 0x31) + (0x36 ^ 0x22);
        GuiCustomizeWorldScreen.lIlllIIlllIllI[82] = (0x3F ^ 0x19);
        GuiCustomizeWorldScreen.lIlllIIlllIllI[83] = 14 + 58 - 54 + 127 + (0xA ^ 0x6C) - (33 + 167 - 116 + 141) + (131 + 100 - 194 + 113);
        GuiCustomizeWorldScreen.lIlllIIlllIllI[84] = (0xAD ^ 0xC7 ^ (0x40 ^ 0xD));
        GuiCustomizeWorldScreen.lIlllIIlllIllI[85] = (-(0xFFFFBF9A & 0x706F) & (0xFFFFF1EB & 0x3FBF));
        GuiCustomizeWorldScreen.lIlllIIlllIllI[86] = (18 + 114 - 111 + 149 ^ 34 + 109 - 44 + 31);
        GuiCustomizeWorldScreen.lIlllIIlllIllI[87] = (0x49 ^ 0x3F) + (47 + 2 + 72 + 9) - (72 + 4 - 7 + 64) + (0x41 ^ 0x7B);
        GuiCustomizeWorldScreen.lIlllIIlllIllI[88] = (0x34 ^ 0x1D);
        GuiCustomizeWorldScreen.lIlllIIlllIllI[89] = (0x5A ^ 0x4A) + (0x76 ^ 0x7C) - -(0x6E ^ 0x4C) + (0x2 ^ 0x70);
        GuiCustomizeWorldScreen.lIlllIIlllIllI[90] = (0xE3 ^ 0xB9 ^ (0xF6 ^ 0x86));
        GuiCustomizeWorldScreen.lIlllIIlllIllI[91] = 65 + 84 - 146 + 144 + (0xBB ^ 0xB7) - (0x1 ^ 0x67) + (0x2E ^ 0x58);
        GuiCustomizeWorldScreen.lIlllIIlllIllI[92] = (140 + 27 - 1 + 15 ^ 27 + 132 - 153 + 152);
        GuiCustomizeWorldScreen.lIlllIIlllIllI[93] = 11 + 63 - 52 + 105 + (0x5E ^ 0x3F) - (1 + 0 + 142 + 33) + (108 + 114 - 204 + 110);
        GuiCustomizeWorldScreen.lIlllIIlllIllI[94] = (0xBC ^ 0x90);
        GuiCustomizeWorldScreen.lIlllIIlllIllI[95] = (0xFFFFBDEB & 0x43B7);
        GuiCustomizeWorldScreen.lIlllIIlllIllI[96] = (0x64 ^ 0x0 ^ (0xC6 ^ 0x8F));
        GuiCustomizeWorldScreen.lIlllIIlllIllI[97] = (0x85 ^ 0x9D) + (0x2E ^ 0x5) - -(0x74 ^ 0x71) + (0xDE ^ 0xB7);
        GuiCustomizeWorldScreen.lIlllIIlllIllI[98] = (0x7F ^ 0x6A ^ (0x8F ^ 0xB4));
        GuiCustomizeWorldScreen.lIlllIIlllIllI[99] = 50 + 63 + 62 + 3;
        GuiCustomizeWorldScreen.lIlllIIlllIllI[100] = (0x55 ^ 0x7A);
        GuiCustomizeWorldScreen.lIlllIIlllIllI[101] = 81 + 54 + 11 + 33;
        GuiCustomizeWorldScreen.lIlllIIlllIllI[102] = (0x6F ^ 0x5F);
        GuiCustomizeWorldScreen.lIlllIIlllIllI[103] = (0x5B ^ 0x2A) + (0xC5 ^ 0xC1) - (0x36 ^ 0x55) + (102 + 32 - 113 + 141);
        GuiCustomizeWorldScreen.lIlllIIlllIllI[104] = (0xBF ^ 0x8E);
        GuiCustomizeWorldScreen.lIlllIIlllIllI[105] = (-(0xFFFFBE7F & 0x5DD3) & (0xFFFFBDF7 & 0x5FFE));
        GuiCustomizeWorldScreen.lIlllIIlllIllI[106] = 70 + 137 - 77 + 51;
        GuiCustomizeWorldScreen.lIlllIIlllIllI[107] = (0x63 ^ 0x50);
        GuiCustomizeWorldScreen.lIlllIIlllIllI[108] = 110 + 55 - 141 + 158;
        GuiCustomizeWorldScreen.lIlllIIlllIllI[109] = (0x73 ^ 0x30 ^ (0x7C ^ 0xB));
        GuiCustomizeWorldScreen.lIlllIIlllIllI[110] = 58 + 108 - 122 + 87 + (54 + 32 - 11 + 73) - (0xC0 ^ 0xA6) + (0xC0 ^ 0xC6);
        GuiCustomizeWorldScreen.lIlllIIlllIllI[111] = (0x4B ^ 0x7E);
        GuiCustomizeWorldScreen.lIlllIIlllIllI[112] = (0xD7 ^ 0xB3) + (0xC ^ 0x18) - -(0x4 ^ 0x24) + (0xB4 ^ 0x94);
        GuiCustomizeWorldScreen.lIlllIIlllIllI[113] = (((0xEF ^ 0xA1) & ~(0x43 ^ 0xD)) ^ (0xB7 ^ 0x81));
        GuiCustomizeWorldScreen.lIlllIIlllIllI[114] = (0xFFFFD3E5 & 0x2DBF);
        GuiCustomizeWorldScreen.lIlllIIlllIllI[115] = 112 + 114 - 146 + 105;
        GuiCustomizeWorldScreen.lIlllIIlllIllI[116] = (0x4E ^ 0x76);
        GuiCustomizeWorldScreen.lIlllIIlllIllI[117] = 113 + 38 - 110 + 145;
        GuiCustomizeWorldScreen.lIlllIIlllIllI[118] = (0x15 ^ 0x2C);
        GuiCustomizeWorldScreen.lIlllIIlllIllI[119] = (220 + 66 - 99 + 66 ^ 5 + 12 + 55 + 127);
        GuiCustomizeWorldScreen.lIlllIIlllIllI[120] = "   ".length() + (0xA6 ^ 0x86) - -(0x1F ^ 0x78) + (0x6B ^ 0x58);
        GuiCustomizeWorldScreen.lIlllIIlllIllI[121] = (0x80 ^ 0xBB);
        GuiCustomizeWorldScreen.lIlllIIlllIllI[122] = (0xFFFF87B6 & 0x79EF);
        GuiCustomizeWorldScreen.lIlllIIlllIllI[123] = (0x14 ^ 0x1E ^ (0xF2 ^ 0xC4));
        GuiCustomizeWorldScreen.lIlllIIlllIllI[124] = (0xCE ^ 0xC5) + (0x28 ^ 0x60) - -(0x7B ^ 0x32) + (0xB6 ^ 0x94);
        GuiCustomizeWorldScreen.lIlllIIlllIllI[125] = (0x95 ^ 0xA8);
        GuiCustomizeWorldScreen.lIlllIIlllIllI[126] = 182 + 32 - 83 + 60;
        GuiCustomizeWorldScreen.lIlllIIlllIllI[127] = (0xC9 ^ 0x99 ^ (0x6F ^ 0x1));
        GuiCustomizeWorldScreen.lIlllIIlllIllI[128] = (0x10 ^ 0x38) + (0xEF ^ 0xA2) - (0x21 ^ 0x69) + (52 + 87 - 32 + 40);
        GuiCustomizeWorldScreen.lIlllIIlllIllI[129] = (0x96 ^ 0xBA ^ (0x4B ^ 0x58));
        GuiCustomizeWorldScreen.lIlllIIlllIllI[130] = 122 + 105 - 219 + 172 + (0x15 ^ 0x7C) - (0x7A ^ 0x13) + (0x8F ^ 0x82);
        GuiCustomizeWorldScreen.lIlllIIlllIllI[131] = (0x82 ^ 0xC2);
        GuiCustomizeWorldScreen.lIlllIIlllIllI[132] = (0xFFFF8FE7 & 0x71BF);
        GuiCustomizeWorldScreen.lIlllIIlllIllI[133] = (0x3A ^ 0x7B);
        GuiCustomizeWorldScreen.lIlllIIlllIllI[134] = (0x54 ^ 0x71) + (0xFF ^ 0x8D) - (0xD9 ^ 0x95) + (0x1A ^ 0x6D);
        GuiCustomizeWorldScreen.lIlllIIlllIllI[135] = 68 + 155 - 100 + 72;
        GuiCustomizeWorldScreen.lIlllIIlllIllI[136] = (0x41 ^ 0x2);
        GuiCustomizeWorldScreen.lIlllIIlllIllI[137] = 77 + 98 - 121 + 136 + (0xA2 ^ 0xA8) - (0x2F ^ 0x5B) + (0x3F ^ 0x4F);
        GuiCustomizeWorldScreen.lIlllIIlllIllI[138] = (0x62 ^ 0x26);
        GuiCustomizeWorldScreen.lIlllIIlllIllI[139] = 142 + 84 - 142 + 113;
        GuiCustomizeWorldScreen.lIlllIIlllIllI[140] = (0x1D ^ 0x58);
        GuiCustomizeWorldScreen.lIlllIIlllIllI[141] = (-(0xFFFF9D4B & 0x6AF7) & (0xFFFF9FFF & 0x69EA));
        GuiCustomizeWorldScreen.lIlllIIlllIllI[142] = (0x31 ^ 0x77);
        GuiCustomizeWorldScreen.lIlllIIlllIllI[143] = (0xF3 ^ 0xBE) + (45 + 93 - 10 + 30) - (0x67 ^ 0x2C) + (0x69 ^ 0x4F);
        GuiCustomizeWorldScreen.lIlllIIlllIllI[144] = (0x86 ^ 0xC1);
        GuiCustomizeWorldScreen.lIlllIIlllIllI[145] = (0x1B ^ 0x1) + (0x98 ^ 0x89) - -(0xDB ^ 0xB6) + (0xA8 ^ 0x87);
        GuiCustomizeWorldScreen.lIlllIIlllIllI[146] = (0x50 ^ 0x18);
        GuiCustomizeWorldScreen.lIlllIIlllIllI[147] = (0x29 ^ 0x11) + (72 + 61 - 116 + 173) - (66 + 25 + 20 + 40) + (0x5F ^ 0x36);
        GuiCustomizeWorldScreen.lIlllIIlllIllI[148] = (189 + 17 - 139 + 153 ^ 12 + 116 - 79 + 100);
        GuiCustomizeWorldScreen.lIlllIIlllIllI[149] = 118 + 176 - 203 + 110;
        GuiCustomizeWorldScreen.lIlllIIlllIllI[150] = (0x12 ^ 0x63 ^ (0x95 ^ 0xAE));
        GuiCustomizeWorldScreen.lIlllIIlllIllI[151] = (-(0xFFFFFD95 & 0x6E6F) & (0xFFFFEFBF & 0x7DED));
        GuiCustomizeWorldScreen.lIlllIIlllIllI[152] = (((0xF2 ^ 0xC2) & ~(0x6F ^ 0x5F)) ^ (0xDD ^ 0x96));
        GuiCustomizeWorldScreen.lIlllIIlllIllI[153] = 130 + 68 - 123 + 127;
        GuiCustomizeWorldScreen.lIlllIIlllIllI[154] = (0xF8 ^ 0xB4);
        GuiCustomizeWorldScreen.lIlllIIlllIllI[155] = 21 + 34 + 60 + 42 + (0x9A ^ 0x9D) - (0x2B ^ 0x5A) + (99 + 77 - 95 + 71);
        GuiCustomizeWorldScreen.lIlllIIlllIllI[156] = (0x61 ^ 0x77 ^ (0x59 ^ 0x2));
        GuiCustomizeWorldScreen.lIlllIIlllIllI[157] = 81 + 90 - 2 + 35;
        GuiCustomizeWorldScreen.lIlllIIlllIllI[158] = (0xDF ^ 0xA4 ^ (0x63 ^ 0x56));
        GuiCustomizeWorldScreen.lIlllIIlllIllI[159] = (0xCC ^ 0xB7) + (93 + 33 - 7 + 82) - (34 + 97 - 59 + 68) + (0xA2 ^ 0xB7);
        GuiCustomizeWorldScreen.lIlllIIlllIllI[160] = (0xD9 ^ 0x96);
        GuiCustomizeWorldScreen.lIlllIIlllIllI[161] = (-(0x43 ^ 0x15) & (0xFFFFA1FF & 0x5FFF));
        GuiCustomizeWorldScreen.lIlllIIlllIllI[162] = (0xF5 ^ 0x99) + (97 + 61 - 119 + 132) - (0xFFFFD97B & 0x2786) + (54 + 20 - 18 + 129);
        GuiCustomizeWorldScreen.lIlllIIlllIllI[163] = (0xF7 ^ 0x85 ^ (0x5 ^ 0x26));
        GuiCustomizeWorldScreen.lIlllIIlllIllI[164] = 184 + 155 - 225 + 93;
        GuiCustomizeWorldScreen.lIlllIIlllIllI[165] = (0x74 ^ 0x26);
        GuiCustomizeWorldScreen.lIlllIIlllIllI[166] = 10 + 100 - 19 + 117;
        GuiCustomizeWorldScreen.lIlllIIlllIllI[167] = (0x2 ^ 0x51);
        GuiCustomizeWorldScreen.lIlllIIlllIllI[168] = (0x73 ^ 0x2A) + (0xD7 ^ 0xC2) - (0x43 ^ 0x79) + (18 + 156 - 58 + 41);
        GuiCustomizeWorldScreen.lIlllIIlllIllI[169] = (0x7B ^ 0x2F);
        GuiCustomizeWorldScreen.lIlllIIlllIllI[170] = (93 + 80 - 129 + 172 ^ 26 + 139 - 32 + 8);
        GuiCustomizeWorldScreen.lIlllIIlllIllI[171] = (0x2B ^ 0x4E);
        GuiCustomizeWorldScreen.lIlllIIlllIllI[172] = (0x6F ^ 0x41 ^ (0xD3 ^ 0xAB));
        GuiCustomizeWorldScreen.lIlllIIlllIllI[173] = (0x63 ^ 0x67 ^ (0x21 ^ 0x43));
        GuiCustomizeWorldScreen.lIlllIIlllIllI[174] = (0xFE ^ 0xAF ^ (0x3B ^ 0x3D));
        GuiCustomizeWorldScreen.lIlllIIlllIllI[175] = (0xEB ^ 0x8C);
        GuiCustomizeWorldScreen.lIlllIIlllIllI[176] = (0x41 ^ 0x19);
        GuiCustomizeWorldScreen.lIlllIIlllIllI[177] = (0x1C ^ 0x4D ^ (0xF ^ 0x36));
        GuiCustomizeWorldScreen.lIlllIIlllIllI[178] = (39 + 139 - 112 + 181 ^ 169 + 52 - 173 + 126);
        GuiCustomizeWorldScreen.lIlllIIlllIllI[179] = (0x4E ^ 0x27);
        GuiCustomizeWorldScreen.lIlllIIlllIllI[180] = (0x34 ^ 0x5E);
        GuiCustomizeWorldScreen.lIlllIIlllIllI[181] = (0x2F ^ 0x6E ^ (0x7E ^ 0x64));
        GuiCustomizeWorldScreen.lIlllIIlllIllI[182] = (0x7C ^ 0x7B ^ (0xC8 ^ 0xA4));
        GuiCustomizeWorldScreen.lIlllIIlllIllI[183] = (0x55 ^ 0x39);
        GuiCustomizeWorldScreen.lIlllIIlllIllI[184] = (0xCC ^ 0x91);
        GuiCustomizeWorldScreen.lIlllIIlllIllI[185] = (0x2F ^ 0x42);
        GuiCustomizeWorldScreen.lIlllIIlllIllI[186] = (0xE6 ^ 0xB8);
        GuiCustomizeWorldScreen.lIlllIIlllIllI[187] = (0x35 ^ 0x5B);
        GuiCustomizeWorldScreen.lIlllIIlllIllI[188] = (0x81 ^ 0x88 ^ (0xC ^ 0x5A));
        GuiCustomizeWorldScreen.lIlllIIlllIllI[189] = (0xC3 ^ 0xAC);
        GuiCustomizeWorldScreen.lIlllIIlllIllI[190] = (0x72 ^ 0x12);
        GuiCustomizeWorldScreen.lIlllIIlllIllI[191] = (0x0 ^ 0x70);
        GuiCustomizeWorldScreen.lIlllIIlllIllI[192] = (0xC5 ^ 0xA4);
        GuiCustomizeWorldScreen.lIlllIIlllIllI[193] = (0x28 ^ 0x59);
        GuiCustomizeWorldScreen.lIlllIIlllIllI[194] = (0x4B ^ 0x39);
        GuiCustomizeWorldScreen.lIlllIIlllIllI[195] = (165 + 103 - 96 + 49 ^ 148 + 12 - 75 + 105);
        GuiCustomizeWorldScreen.lIlllIIlllIllI[196] = (0x50 ^ 0x23);
        GuiCustomizeWorldScreen.lIlllIIlllIllI[197] = (-(0xFFFFFA6B & 0x4DF7) & (0xFFFFDFF7 & 0x69FA));
        GuiCustomizeWorldScreen.lIlllIIlllIllI[198] = 104 + 39 - 123 + 112;
        GuiCustomizeWorldScreen.lIlllIIlllIllI[199] = (-(0xFFFFE7C7 & 0x1E7F) & (0xFFFFDFD7 & 0x27FF));
        GuiCustomizeWorldScreen.lIlllIIlllIllI[200] = 98 + 74 - 104 + 65;
        GuiCustomizeWorldScreen.lIlllIIlllIllI[201] = (-(0xFFFFFB7E & 0x74CF) & (0xFFFFFBDF & 0x75FF));
        GuiCustomizeWorldScreen.lIlllIIlllIllI[202] = 79 + 131 - 94 + 18;
        GuiCustomizeWorldScreen.lIlllIIlllIllI[203] = (-(0xFFFFDE61 & 0x77FF) & (0xFFFFD7FF & 0x7FF3));
        GuiCustomizeWorldScreen.lIlllIIlllIllI[204] = 133 + 133 - 140 + 9;
        GuiCustomizeWorldScreen.lIlllIIlllIllI[205] = (0xFFFFEDB5 & 0x13DE);
        GuiCustomizeWorldScreen.lIlllIIlllIllI[206] = (0xBE ^ 0x81) + (0x9A ^ 0xC1) - (0x6 ^ 0x6F) + (0xD5 ^ 0x82);
        GuiCustomizeWorldScreen.lIlllIIlllIllI[207] = (0xFFFFBDD5 & 0x43BF);
        GuiCustomizeWorldScreen.lIlllIIlllIllI[208] = (0xBC ^ 0xA3 ^ (0xE7 ^ 0x8C));
        GuiCustomizeWorldScreen.lIlllIIlllIllI[209] = (84 + 157 - 106 + 57 ^ 112 + 85 - 106 + 90);
        GuiCustomizeWorldScreen.lIlllIIlllIllI[210] = 79 + 11 - 64 + 111;
        GuiCustomizeWorldScreen.lIlllIIlllIllI[211] = (25 + 160 + 12 + 15 ^ 0 + 147 - 72 + 87);
        GuiCustomizeWorldScreen.lIlllIIlllIllI[212] = (-(0xFFFF8EEB & 0x7B1D) & (0xFFFFBBDF & 0x4FBE));
        GuiCustomizeWorldScreen.lIlllIIlllIllI[213] = (0x2 ^ 0x75);
        GuiCustomizeWorldScreen.lIlllIIlllIllI[214] = (0xF2 ^ 0x8A);
        GuiCustomizeWorldScreen.lIlllIIlllIllI[215] = 29 + 61 - 32 + 80;
        GuiCustomizeWorldScreen.lIlllIIlllIllI[216] = (172 + 63 - 205 + 186 ^ 25 + 97 + 24 + 15);
        GuiCustomizeWorldScreen.lIlllIIlllIllI[217] = (0xFFFFFFBF & 0x1D7);
        GuiCustomizeWorldScreen.lIlllIIlllIllI[218] = (0x56 ^ 0x35 ^ (0xDA ^ 0xC3));
        GuiCustomizeWorldScreen.lIlllIIlllIllI[219] = (0xE0 ^ 0x9B);
        GuiCustomizeWorldScreen.lIlllIIlllIllI[220] = 132 + 112 - 123 + 18;
        GuiCustomizeWorldScreen.lIlllIIlllIllI[221] = (0xDA ^ 0xA6);
        GuiCustomizeWorldScreen.lIlllIIlllIllI[222] = (-(0xFFFFBCBD & 0x6F47) & (0xFFFFFDFE & 0x2F9D));
        GuiCustomizeWorldScreen.lIlllIIlllIllI[223] = (0x6F ^ 0x12);
        GuiCustomizeWorldScreen.lIlllIIlllIllI[224] = (0x24 ^ 0x5A);
        GuiCustomizeWorldScreen.lIlllIIlllIllI[225] = 76 + 51 - 66 + 79;
        GuiCustomizeWorldScreen.lIlllIIlllIllI[226] = 119 + 116 - 167 + 59;
        GuiCustomizeWorldScreen.lIlllIIlllIllI[227] = (0xFFFFF1F9 & 0xF9F);
        GuiCustomizeWorldScreen.lIlllIIlllIllI[228] = 124 + 55 - 114 + 63;
        GuiCustomizeWorldScreen.lIlllIIlllIllI[229] = 67 + 76 - 91 + 77;
        GuiCustomizeWorldScreen.lIlllIIlllIllI[230] = 133 + 16 - 44 + 36;
        GuiCustomizeWorldScreen.lIlllIIlllIllI[231] = (0x3C ^ 0x3B) + (0x4C ^ 0x18) - (0x36 ^ 0x3D) + (0xB9 ^ 0x8B);
        GuiCustomizeWorldScreen.lIlllIIlllIllI[232] = (0xFFFFBDFA & 0x439F);
        GuiCustomizeWorldScreen.lIlllIIlllIllI[233] = 112 + 17 - 39 + 41;
        GuiCustomizeWorldScreen.lIlllIIlllIllI[234] = (0x89 ^ 0xBB) + (0xC9 ^ 0xAC) - (0xF0 ^ 0x95) + (0x35 ^ 0x69);
        GuiCustomizeWorldScreen.lIlllIIlllIllI[235] = (0xFFFFDFBF & 0x21DB);
        GuiCustomizeWorldScreen.lIlllIIlllIllI[236] = 79 + 89 - 31 + 6;
        GuiCustomizeWorldScreen.lIlllIIlllIllI[237] = (0xFFFFD1BC & 0x2FDF);
        GuiCustomizeWorldScreen.lIlllIIlllIllI[238] = (0xD4 ^ 0xBE) + (0xC0 ^ 0x83) - (0x5A ^ 0x3E) + (0x78 ^ 0x3F);
        GuiCustomizeWorldScreen.lIlllIIlllIllI[239] = (0xFFFFE99D & 0x17FF);
        GuiCustomizeWorldScreen.lIlllIIlllIllI[240] = 133 + 14 - 118 + 116;
        GuiCustomizeWorldScreen.lIlllIIlllIllI[241] = (0xFFFFBFFF & 0x419E);
        GuiCustomizeWorldScreen.lIlllIIlllIllI[242] = (0x6F ^ 0x34) + (0x61 ^ 0x7) - (0xF3 ^ 0x9E) + (0x94 ^ 0xAA);
        GuiCustomizeWorldScreen.lIlllIIlllIllI[243] = (0xFFFF8FDF & 0x71BF);
        GuiCustomizeWorldScreen.lIlllIIlllIllI[244] = (0x3F ^ 0x45) + (0x3D ^ 0xF) - (0x3 ^ 0x3C) + (0x12 ^ 0x34);
        GuiCustomizeWorldScreen.lIlllIIlllIllI[245] = (-1 & 0xFFFFFF);
        GuiCustomizeWorldScreen.lIlllIIlllIllI[246] = -(0xFFFFFF30 & 0x1F1FEF);
        GuiCustomizeWorldScreen.lIlllIIlllIllI[247] = -(0xFFFFDF68 & 0x5F7FF7);
    }
    
    private static boolean lIIIIIlIIlIlIIll(final int llllllllllllIlllllIIIlllIIllllII, final int llllllllllllIlllllIIIlllIIlllIll) {
        return llllllllllllIlllllIIIlllIIllllII != llllllllllllIlllllIIIlllIIlllIll;
    }
    
    @Override
    public void drawScreen(final int llllllllllllIlllllIIIllllIIlIIIl, final int llllllllllllIlllllIIIllllIIlIIII, final float llllllllllllIlllllIIIllllIIIIllI) {
        this.drawDefaultBackground();
        this.field_175349_r.drawScreen(llllllllllllIlllllIIIllllIIlIIIl, llllllllllllIlllllIIIllllIIlIIII, llllllllllllIlllllIIIllllIIIIllI);
        this.drawCenteredString(this.fontRendererObj, this.field_175341_a, this.width / GuiCustomizeWorldScreen.lIlllIIlllIllI[2], GuiCustomizeWorldScreen.lIlllIIlllIllI[2], GuiCustomizeWorldScreen.lIlllIIlllIllI[245]);
        this.drawCenteredString(this.fontRendererObj, this.field_175333_f, this.width / GuiCustomizeWorldScreen.lIlllIIlllIllI[2], GuiCustomizeWorldScreen.lIlllIIlllIllI[32], GuiCustomizeWorldScreen.lIlllIIlllIllI[245]);
        this.drawCenteredString(this.fontRendererObj, this.field_175335_g, this.width / GuiCustomizeWorldScreen.lIlllIIlllIllI[2], GuiCustomizeWorldScreen.lIlllIIlllIllI[50], GuiCustomizeWorldScreen.lIlllIIlllIllI[245]);
        super.drawScreen(llllllllllllIlllllIIIllllIIlIIIl, llllllllllllIlllllIIIllllIIlIIII, llllllllllllIlllllIIIllllIIIIllI);
        if (lIIIIIlIIlIIlIlI(this.field_175339_B)) {
            Gui.drawRect(GuiCustomizeWorldScreen.lIlllIIlllIllI[0], GuiCustomizeWorldScreen.lIlllIIlllIllI[0], this.width, this.height, Integer.MIN_VALUE);
            Gui.drawHorizontalLine(this.width / GuiCustomizeWorldScreen.lIlllIIlllIllI[2] - GuiCustomizeWorldScreen.lIlllIIlllIllI[181], this.width / GuiCustomizeWorldScreen.lIlllIIlllIllI[2] + GuiCustomizeWorldScreen.lIlllIIlllIllI[14], GuiCustomizeWorldScreen.lIlllIIlllIllI[195], GuiCustomizeWorldScreen.lIlllIIlllIllI[246]);
            Gui.drawHorizontalLine(this.width / GuiCustomizeWorldScreen.lIlllIIlllIllI[2] - GuiCustomizeWorldScreen.lIlllIIlllIllI[181], this.width / GuiCustomizeWorldScreen.lIlllIIlllIllI[2] + GuiCustomizeWorldScreen.lIlllIIlllIllI[14], GuiCustomizeWorldScreen.lIlllIIlllIllI[115], GuiCustomizeWorldScreen.lIlllIIlllIllI[247]);
            Gui.drawVerticalLine(this.width / GuiCustomizeWorldScreen.lIlllIIlllIllI[2] - GuiCustomizeWorldScreen.lIlllIIlllIllI[181], GuiCustomizeWorldScreen.lIlllIIlllIllI[195], GuiCustomizeWorldScreen.lIlllIIlllIllI[115], GuiCustomizeWorldScreen.lIlllIIlllIllI[246]);
            Gui.drawVerticalLine(this.width / GuiCustomizeWorldScreen.lIlllIIlllIllI[2] + GuiCustomizeWorldScreen.lIlllIIlllIllI[14], GuiCustomizeWorldScreen.lIlllIIlllIllI[195], GuiCustomizeWorldScreen.lIlllIIlllIllI[115], GuiCustomizeWorldScreen.lIlllIIlllIllI[247]);
            final float llllllllllllIlllllIIIllllIIIlllI = 85.0f;
            final float llllllllllllIlllllIIIllllIIIllIl = 180.0f;
            GlStateManager.disableLighting();
            GlStateManager.disableFog();
            final Tessellator llllllllllllIlllllIIIllllIIIllII = Tessellator.getInstance();
            final WorldRenderer llllllllllllIlllllIIIllllIIIlIll = llllllllllllIlllllIIIllllIIIllII.getWorldRenderer();
            this.mc.getTextureManager().bindTexture(GuiCustomizeWorldScreen.optionsBackground);
            GlStateManager.color(1.0f, 1.0f, 1.0f, 1.0f);
            final float llllllllllllIlllllIIIllllIIIlIlI = 32.0f;
            llllllllllllIlllllIIIllllIIIlIll.begin(GuiCustomizeWorldScreen.lIlllIIlllIllI[18], DefaultVertexFormats.POSITION_TEX_COLOR);
            llllllllllllIlllllIIIllllIIIlIll.pos(this.width / GuiCustomizeWorldScreen.lIlllIIlllIllI[2] - GuiCustomizeWorldScreen.lIlllIIlllIllI[14], 185.0, 0.0).tex(0.0, 2.65625).color(GuiCustomizeWorldScreen.lIlllIIlllIllI[131], GuiCustomizeWorldScreen.lIlllIIlllIllI[131], GuiCustomizeWorldScreen.lIlllIIlllIllI[131], GuiCustomizeWorldScreen.lIlllIIlllIllI[131]).endVertex();
            llllllllllllIlllllIIIllllIIIlIll.pos(this.width / GuiCustomizeWorldScreen.lIlllIIlllIllI[2] + GuiCustomizeWorldScreen.lIlllIIlllIllI[14], 185.0, 0.0).tex(5.625, 2.65625).color(GuiCustomizeWorldScreen.lIlllIIlllIllI[131], GuiCustomizeWorldScreen.lIlllIIlllIllI[131], GuiCustomizeWorldScreen.lIlllIIlllIllI[131], GuiCustomizeWorldScreen.lIlllIIlllIllI[131]).endVertex();
            llllllllllllIlllllIIIllllIIIlIll.pos(this.width / GuiCustomizeWorldScreen.lIlllIIlllIllI[2] + GuiCustomizeWorldScreen.lIlllIIlllIllI[14], 100.0, 0.0).tex(5.625, 0.0).color(GuiCustomizeWorldScreen.lIlllIIlllIllI[131], GuiCustomizeWorldScreen.lIlllIIlllIllI[131], GuiCustomizeWorldScreen.lIlllIIlllIllI[131], GuiCustomizeWorldScreen.lIlllIIlllIllI[131]).endVertex();
            llllllllllllIlllllIIIllllIIIlIll.pos(this.width / GuiCustomizeWorldScreen.lIlllIIlllIllI[2] - GuiCustomizeWorldScreen.lIlllIIlllIllI[14], 100.0, 0.0).tex(0.0, 0.0).color(GuiCustomizeWorldScreen.lIlllIIlllIllI[131], GuiCustomizeWorldScreen.lIlllIIlllIllI[131], GuiCustomizeWorldScreen.lIlllIIlllIllI[131], GuiCustomizeWorldScreen.lIlllIIlllIllI[131]).endVertex();
            llllllllllllIlllllIIIllllIIIllII.draw();
            this.drawCenteredString(this.fontRendererObj, I18n.format(GuiCustomizeWorldScreen.lIlllIIlIIllII[GuiCustomizeWorldScreen.lIlllIIlllIllI[26]], new Object[GuiCustomizeWorldScreen.lIlllIIlllIllI[0]]), this.width / GuiCustomizeWorldScreen.lIlllIIlllIllI[2], GuiCustomizeWorldScreen.lIlllIIlllIllI[179], GuiCustomizeWorldScreen.lIlllIIlllIllI[245]);
            this.drawCenteredString(this.fontRendererObj, I18n.format(GuiCustomizeWorldScreen.lIlllIIlIIllII[GuiCustomizeWorldScreen.lIlllIIlllIllI[57]], new Object[GuiCustomizeWorldScreen.lIlllIIlllIllI[0]]), this.width / GuiCustomizeWorldScreen.lIlllIIlllIllI[2], GuiCustomizeWorldScreen.lIlllIIlllIllI[223], GuiCustomizeWorldScreen.lIlllIIlllIllI[245]);
            this.drawCenteredString(this.fontRendererObj, I18n.format(GuiCustomizeWorldScreen.lIlllIIlIIllII[GuiCustomizeWorldScreen.lIlllIIlllIllI[59]], new Object[GuiCustomizeWorldScreen.lIlllIIlllIllI[0]]), this.width / GuiCustomizeWorldScreen.lIlllIIlllIllI[2], GuiCustomizeWorldScreen.lIlllIIlllIllI[204], GuiCustomizeWorldScreen.lIlllIIlllIllI[245]);
            this.field_175352_x.drawButton(this.mc, llllllllllllIlllllIIIllllIIlIIIl, llllllllllllIlllllIIIllllIIlIIII);
            this.field_175351_y.drawButton(this.mc, llllllllllllIlllllIIIllllIIlIIIl, llllllllllllIlllllIIIllllIIlIIII);
        }
    }
    
    public String func_175323_a() {
        return this.field_175336_F.toString().replace(GuiCustomizeWorldScreen.lIlllIIlIIllII[GuiCustomizeWorldScreen.lIlllIIlllIllI[35]], GuiCustomizeWorldScreen.lIlllIIlIIllII[GuiCustomizeWorldScreen.lIlllIIlllIllI[37]]);
    }
    
    @Override
    public String getText(final int llllllllllllIlllllIIlIIIIIlIlIlI, final String llllllllllllIlllllIIlIIIIIlIlIIl, final float llllllllllllIlllllIIlIIIIIlIlIII) {
        return String.valueOf(new StringBuilder(String.valueOf(llllllllllllIlllllIIlIIIIIlIlIIl)).append(GuiCustomizeWorldScreen.lIlllIIlIIllII[GuiCustomizeWorldScreen.lIlllIIlllIllI[39]]).append(this.func_175330_b(llllllllllllIlllllIIlIIIIIlIlIlI, llllllllllllIlllllIIlIIIIIlIlIII)));
    }
    
    @Override
    public void func_175321_a(final int llllllllllllIlllllIIlIIIIIIlIIIl, final boolean llllllllllllIlllllIIlIIIIIIlIIll) {
        switch (llllllllllllIlllllIIlIIIIIIlIIIl) {
            case 148: {
                this.field_175336_F.useCaves = llllllllllllIlllllIIlIIIIIIlIIll;
                "".length();
                if ("   ".length() < 0) {
                    return;
                }
                break;
            }
            case 149: {
                this.field_175336_F.useDungeons = llllllllllllIlllllIIlIIIIIIlIIll;
                "".length();
                if (-" ".length() >= 0) {
                    return;
                }
                break;
            }
            case 150: {
                this.field_175336_F.useStrongholds = llllllllllllIlllllIIlIIIIIIlIIll;
                "".length();
                if (null != null) {
                    return;
                }
                break;
            }
            case 151: {
                this.field_175336_F.useVillages = llllllllllllIlllllIIlIIIIIIlIIll;
                "".length();
                if (((0x78 ^ 0x35 ^ (0x38 ^ 0x57)) & (0x77 ^ 0x71 ^ (0x9D ^ 0xB9) ^ -" ".length())) != 0x0) {
                    return;
                }
                break;
            }
            case 152: {
                this.field_175336_F.useMineShafts = llllllllllllIlllllIIlIIIIIIlIIll;
                "".length();
                if (-" ".length() > -" ".length()) {
                    return;
                }
                break;
            }
            case 153: {
                this.field_175336_F.useTemples = llllllllllllIlllllIIlIIIIIIlIIll;
                "".length();
                if (" ".length() >= (0xB2 ^ 0xB6)) {
                    return;
                }
                break;
            }
            case 154: {
                this.field_175336_F.useRavines = llllllllllllIlllllIIlIIIIIIlIIll;
                "".length();
                if ("  ".length() == 0) {
                    return;
                }
                break;
            }
            case 155: {
                this.field_175336_F.useWaterLakes = llllllllllllIlllllIIlIIIIIIlIIll;
                "".length();
                if (((0xC1 ^ 0x8B ^ (0x8D ^ 0x95)) & (8 + 104 + 13 + 75 ^ 72 + 49 + 30 + 3 ^ -" ".length())) > ((10 + 57 - 49 + 144 ^ 64 + 119 - 96 + 105) & (107 + 138 - 160 + 140 ^ 102 + 111 - 119 + 37 ^ -" ".length()))) {
                    return;
                }
                break;
            }
            case 156: {
                this.field_175336_F.useLavaLakes = llllllllllllIlllllIIlIIIIIIlIIll;
                "".length();
                if ("   ".length() >= (67 + 26 - 46 + 97 ^ 44 + 66 - 53 + 91)) {
                    return;
                }
                break;
            }
            case 161: {
                this.field_175336_F.useLavaOceans = llllllllllllIlllllIIlIIIIIIlIIll;
                "".length();
                if ("   ".length() >= (0x75 ^ 0x3F ^ (0x38 ^ 0x76))) {
                    return;
                }
                break;
            }
            case 210: {
                this.field_175336_F.useMonuments = llllllllllllIlllllIIlIIIIIIlIIll;
                break;
            }
        }
        if (lIIIIIlIIlIIllll(this.field_175336_F.equals(this.field_175334_E) ? 1 : 0)) {
            this.func_181031_a((boolean)(GuiCustomizeWorldScreen.lIlllIIlllIllI[1] != 0));
        }
    }
    
    @Override
    public void initGui() {
        int llllllllllllIlllllIIlIIIIllIIlll = GuiCustomizeWorldScreen.lIlllIIlllIllI[0];
        int llllllllllllIlllllIIlIIIIllIIllI = GuiCustomizeWorldScreen.lIlllIIlllIllI[0];
        if (lIIIIIlIIlIIlIIl(this.field_175349_r)) {
            llllllllllllIlllllIIlIIIIllIIlll = this.field_175349_r.func_178059_e();
            llllllllllllIlllllIIlIIIIllIIllI = this.field_175349_r.getAmountScrolled();
        }
        this.field_175341_a = I18n.format(GuiCustomizeWorldScreen.lIlllIIlIIllII[GuiCustomizeWorldScreen.lIlllIIlllIllI[4]], new Object[GuiCustomizeWorldScreen.lIlllIIlllIllI[0]]);
        this.buttonList.clear();
        final List<GuiButton> buttonList = this.buttonList;
        final GuiButton field_175345_v = new GuiButton(GuiCustomizeWorldScreen.lIlllIIlllIllI[5], GuiCustomizeWorldScreen.lIlllIIlllIllI[6], GuiCustomizeWorldScreen.lIlllIIlllIllI[7], GuiCustomizeWorldScreen.lIlllIIlllIllI[8], GuiCustomizeWorldScreen.lIlllIIlllIllI[6], I18n.format(GuiCustomizeWorldScreen.lIlllIIlIIllII[GuiCustomizeWorldScreen.lIlllIIlllIllI[3]], new Object[GuiCustomizeWorldScreen.lIlllIIlllIllI[0]]));
        this.field_175345_v = field_175345_v;
        buttonList.add(field_175345_v);
        "".length();
        final List<GuiButton> buttonList2 = this.buttonList;
        final GuiButton field_175344_w = new GuiButton(GuiCustomizeWorldScreen.lIlllIIlllIllI[9], this.width - GuiCustomizeWorldScreen.lIlllIIlllIllI[10], GuiCustomizeWorldScreen.lIlllIIlllIllI[7], GuiCustomizeWorldScreen.lIlllIIlllIllI[8], GuiCustomizeWorldScreen.lIlllIIlllIllI[6], I18n.format(GuiCustomizeWorldScreen.lIlllIIlIIllII[GuiCustomizeWorldScreen.lIlllIIlllIllI[7]], new Object[GuiCustomizeWorldScreen.lIlllIIlllIllI[0]]));
        this.field_175344_w = field_175344_w;
        buttonList2.add(field_175344_w);
        "".length();
        final List<GuiButton> buttonList3 = this.buttonList;
        final GuiButton field_175346_u = new GuiButton(GuiCustomizeWorldScreen.lIlllIIlllIllI[11], this.width / GuiCustomizeWorldScreen.lIlllIIlllIllI[2] - GuiCustomizeWorldScreen.lIlllIIlllIllI[12], this.height - GuiCustomizeWorldScreen.lIlllIIlllIllI[13], GuiCustomizeWorldScreen.lIlllIIlllIllI[14], GuiCustomizeWorldScreen.lIlllIIlllIllI[6], I18n.format(GuiCustomizeWorldScreen.lIlllIIlIIllII[GuiCustomizeWorldScreen.lIlllIIlllIllI[15]], new Object[GuiCustomizeWorldScreen.lIlllIIlllIllI[0]]));
        this.field_175346_u = field_175346_u;
        buttonList3.add(field_175346_u);
        "".length();
        final List<GuiButton> buttonList4 = this.buttonList;
        final GuiButton field_175347_t = new GuiButton(GuiCustomizeWorldScreen.lIlllIIlllIllI[16], this.width / GuiCustomizeWorldScreen.lIlllIIlllIllI[2] - GuiCustomizeWorldScreen.lIlllIIlllIllI[17], this.height - GuiCustomizeWorldScreen.lIlllIIlllIllI[13], GuiCustomizeWorldScreen.lIlllIIlllIllI[14], GuiCustomizeWorldScreen.lIlllIIlllIllI[6], I18n.format(GuiCustomizeWorldScreen.lIlllIIlIIllII[GuiCustomizeWorldScreen.lIlllIIlllIllI[18]], new Object[GuiCustomizeWorldScreen.lIlllIIlllIllI[0]]));
        this.field_175347_t = field_175347_t;
        buttonList4.add(field_175347_t);
        "".length();
        final List<GuiButton> buttonList5 = this.buttonList;
        final GuiButton field_175350_z = new GuiButton(GuiCustomizeWorldScreen.lIlllIIlllIllI[19], this.width / GuiCustomizeWorldScreen.lIlllIIlllIllI[2] + GuiCustomizeWorldScreen.lIlllIIlllIllI[4], this.height - GuiCustomizeWorldScreen.lIlllIIlllIllI[13], GuiCustomizeWorldScreen.lIlllIIlllIllI[14], GuiCustomizeWorldScreen.lIlllIIlllIllI[6], I18n.format(GuiCustomizeWorldScreen.lIlllIIlIIllII[GuiCustomizeWorldScreen.lIlllIIlllIllI[20]], new Object[GuiCustomizeWorldScreen.lIlllIIlllIllI[0]]));
        this.field_175350_z = field_175350_z;
        buttonList5.add(field_175350_z);
        "".length();
        final List<GuiButton> buttonList6 = this.buttonList;
        final GuiButton field_175348_s = new GuiButton(GuiCustomizeWorldScreen.lIlllIIlllIllI[21], this.width / GuiCustomizeWorldScreen.lIlllIIlllIllI[2] + GuiCustomizeWorldScreen.lIlllIIlllIllI[22], this.height - GuiCustomizeWorldScreen.lIlllIIlllIllI[13], GuiCustomizeWorldScreen.lIlllIIlllIllI[14], GuiCustomizeWorldScreen.lIlllIIlllIllI[6], I18n.format(GuiCustomizeWorldScreen.lIlllIIlIIllII[GuiCustomizeWorldScreen.lIlllIIlllIllI[23]], new Object[GuiCustomizeWorldScreen.lIlllIIlllIllI[0]]));
        this.field_175348_s = field_175348_s;
        buttonList6.add(field_175348_s);
        "".length();
        this.field_175346_u.enabled = this.field_175338_A;
        this.field_175352_x = new GuiButton(GuiCustomizeWorldScreen.lIlllIIlllIllI[24], this.width / GuiCustomizeWorldScreen.lIlllIIlllIllI[2] - GuiCustomizeWorldScreen.lIlllIIlllIllI[25], GuiCustomizeWorldScreen.lIlllIIlllIllI[26], GuiCustomizeWorldScreen.lIlllIIlllIllI[27], GuiCustomizeWorldScreen.lIlllIIlllIllI[6], I18n.format(GuiCustomizeWorldScreen.lIlllIIlIIllII[GuiCustomizeWorldScreen.lIlllIIlllIllI[28]], new Object[GuiCustomizeWorldScreen.lIlllIIlllIllI[0]]));
        this.field_175352_x.visible = (GuiCustomizeWorldScreen.lIlllIIlllIllI[0] != 0);
        this.buttonList.add(this.field_175352_x);
        "".length();
        this.field_175351_y = new GuiButton(GuiCustomizeWorldScreen.lIlllIIlllIllI[29], this.width / GuiCustomizeWorldScreen.lIlllIIlllIllI[2] + GuiCustomizeWorldScreen.lIlllIIlllIllI[7], GuiCustomizeWorldScreen.lIlllIIlllIllI[26], GuiCustomizeWorldScreen.lIlllIIlllIllI[27], GuiCustomizeWorldScreen.lIlllIIlllIllI[6], I18n.format(GuiCustomizeWorldScreen.lIlllIIlIIllII[GuiCustomizeWorldScreen.lIlllIIlllIllI[30]], new Object[GuiCustomizeWorldScreen.lIlllIIlllIllI[0]]));
        this.field_175351_y.visible = (GuiCustomizeWorldScreen.lIlllIIlllIllI[0] != 0);
        this.buttonList.add(this.field_175351_y);
        "".length();
        if (lIIIIIlIIlIIlIlI(this.field_175339_B)) {
            this.field_175352_x.visible = (GuiCustomizeWorldScreen.lIlllIIlllIllI[1] != 0);
            this.field_175351_y.visible = (GuiCustomizeWorldScreen.lIlllIIlllIllI[1] != 0);
        }
        this.func_175325_f();
        if (lIIIIIlIIlIIlIlI(llllllllllllIlllllIIlIIIIllIIlll)) {
            this.field_175349_r.func_181156_c(llllllllllllIlllllIIlIIIIllIIlll);
            this.field_175349_r.scrollBy(llllllllllllIlllllIIlIIIIllIIllI);
            this.func_175328_i();
        }
    }
    
    private void func_175328_i() {
        final GuiButton field_175345_v = this.field_175345_v;
        int enabled;
        if (lIIIIIlIIlIIlIlI(this.field_175349_r.func_178059_e())) {
            enabled = GuiCustomizeWorldScreen.lIlllIIlllIllI[1];
            "".length();
            if ("   ".length() <= ((0x85 ^ 0x8C) & ~(0xCB ^ 0xC2))) {
                return;
            }
        }
        else {
            enabled = GuiCustomizeWorldScreen.lIlllIIlllIllI[0];
        }
        field_175345_v.enabled = (enabled != 0);
        final GuiButton field_175344_w = this.field_175344_w;
        int enabled2;
        if (lIIIIIlIIlIlIIll(this.field_175349_r.func_178059_e(), this.field_175349_r.func_178057_f() - GuiCustomizeWorldScreen.lIlllIIlllIllI[1])) {
            enabled2 = GuiCustomizeWorldScreen.lIlllIIlllIllI[1];
            "".length();
            if ((0xAE ^ 0xAA) == 0x0) {
                return;
            }
        }
        else {
            enabled2 = GuiCustomizeWorldScreen.lIlllIIlllIllI[0];
        }
        field_175344_w.enabled = (enabled2 != 0);
        final String llllllllllllIlIllIlIIIIIllllIIll = GuiCustomizeWorldScreen.lIlllIIlIIllII[GuiCustomizeWorldScreen.lIlllIIlllIllI[55]];
        final Object[] llllllllllllIlIllIlIIIIIllllIIII = new Object[GuiCustomizeWorldScreen.lIlllIIlllIllI[2]];
        llllllllllllIlIllIlIIIIIllllIIII[GuiCustomizeWorldScreen.lIlllIIlllIllI[0]] = this.field_175349_r.func_178059_e() + GuiCustomizeWorldScreen.lIlllIIlllIllI[1];
        llllllllllllIlIllIlIIIIIllllIIII[GuiCustomizeWorldScreen.lIlllIIlllIllI[1]] = this.field_175349_r.func_178057_f();
        this.field_175333_f = I18n.format(llllllllllllIlIllIlIIIIIllllIIll, llllllllllllIlIllIlIIIIIllllIIII);
        this.field_175335_g = this.field_175342_h[this.field_175349_r.func_178059_e()];
        final GuiButton field_175347_t = this.field_175347_t;
        int enabled3;
        if (lIIIIIlIIlIlIIll(this.field_175349_r.func_178059_e(), this.field_175349_r.func_178057_f() - GuiCustomizeWorldScreen.lIlllIIlllIllI[1])) {
            enabled3 = GuiCustomizeWorldScreen.lIlllIIlllIllI[1];
            "".length();
            if ((0x94 ^ 0x91) == 0x0) {
                return;
            }
        }
        else {
            enabled3 = GuiCustomizeWorldScreen.lIlllIIlllIllI[0];
        }
        field_175347_t.enabled = (enabled3 != 0);
    }
    
    private String func_175330_b(final int llllllllllllIlllllIIlIIIIIIlllll, final float llllllllllllIlllllIIlIIIIIIllllI) {
        switch (llllllllllllIlllllIIlIIIIIIlllll) {
            case 100:
            case 101:
            case 102:
            case 103:
            case 104:
            case 107:
            case 108:
            case 110:
            case 111:
            case 132:
            case 133:
            case 134:
            case 135:
            case 136:
            case 139:
            case 140:
            case 142:
            case 143: {
                final String format = GuiCustomizeWorldScreen.lIlllIIlIIllII[GuiCustomizeWorldScreen.lIlllIIlllIllI[41]];
                final Object[] args = new Object[GuiCustomizeWorldScreen.lIlllIIlllIllI[1]];
                args[GuiCustomizeWorldScreen.lIlllIIlllIllI[0]] = llllllllllllIlllllIIlIIIIIIllllI;
                return String.format(format, args);
            }
            case 105:
            case 106:
            case 109:
            case 112:
            case 113:
            case 114:
            case 115:
            case 137:
            case 138:
            case 141:
            case 144:
            case 145:
            case 146:
            case 147: {
                final String format2 = GuiCustomizeWorldScreen.lIlllIIlIIllII[GuiCustomizeWorldScreen.lIlllIIlllIllI[44]];
                final Object[] args2 = new Object[GuiCustomizeWorldScreen.lIlllIIlllIllI[1]];
                args2[GuiCustomizeWorldScreen.lIlllIIlllIllI[0]] = llllllllllllIlllllIIlIIIIIIllllI;
                return String.format(format2, args2);
            }
            default: {
                final String format3 = GuiCustomizeWorldScreen.lIlllIIlIIllII[GuiCustomizeWorldScreen.lIlllIIlllIllI[49]];
                final Object[] args3 = new Object[GuiCustomizeWorldScreen.lIlllIIlllIllI[1]];
                args3[GuiCustomizeWorldScreen.lIlllIIlllIllI[0]] = (int)llllllllllllIlllllIIlIIIIIIllllI;
                return String.format(format3, args3);
            }
            case 162: {
                if (lIIIIIlIIlIlIIIl(lIIIIIlIIlIlIIII(llllllllllllIlllllIIlIIIIIIllllI, 0.0f))) {
                    return I18n.format(GuiCustomizeWorldScreen.lIlllIIlIIllII[GuiCustomizeWorldScreen.lIlllIIlllIllI[53]], new Object[GuiCustomizeWorldScreen.lIlllIIlllIllI[0]]);
                }
                if (lIIIIIlIIlIIlIll((int)llllllllllllIlllllIIlIIIIIIllllI, BiomeGenBase.hell.biomeID)) {
                    final BiomeGenBase llllllllllllIlllllIIlIIIIIIlllIl = BiomeGenBase.getBiomeGenArray()[(int)llllllllllllIlllllIIlIIIIIIllllI + GuiCustomizeWorldScreen.lIlllIIlllIllI[2]];
                    String biomeName;
                    if (lIIIIIlIIlIIlIIl(llllllllllllIlllllIIlIIIIIIlllIl)) {
                        biomeName = llllllllllllIlllllIIlIIIIIIlllIl.biomeName;
                        "".length();
                        if (((0x46 ^ 0x10 ^ (0x3D ^ 0x43)) & (111 + 36 - 139 + 134 ^ 87 + 146 - 128 + 61 ^ -" ".length())) != 0x0) {
                            return null;
                        }
                    }
                    else {
                        biomeName = GuiCustomizeWorldScreen.lIlllIIlIIllII[GuiCustomizeWorldScreen.lIlllIIlllIllI[47]];
                    }
                    return biomeName;
                }
                final BiomeGenBase llllllllllllIlllllIIlIIIIIIlllII = BiomeGenBase.getBiomeGenArray()[(int)llllllllllllIlllllIIlIIIIIIllllI];
                String biomeName2;
                if (lIIIIIlIIlIIlIIl(llllllllllllIlllllIIlIIIIIIlllII)) {
                    biomeName2 = llllllllllllIlllllIIlIIIIIIlllII.biomeName;
                    "".length();
                    if (-" ".length() == ((0x7 ^ 0x1D ^ (0x58 ^ 0x9)) & (55 + 7 + 86 + 47 ^ 0 + 131 - 108 + 113 ^ -" ".length()))) {
                        return null;
                    }
                }
                else {
                    biomeName2 = GuiCustomizeWorldScreen.lIlllIIlIIllII[GuiCustomizeWorldScreen.lIlllIIlllIllI[51]];
                }
                return biomeName2;
            }
        }
    }
    
    private static boolean lIIIIIlIIlIIlIll(final int llllllllllllIlllllIIIlllIlIIllII, final int llllllllllllIlllllIIIlllIlIIlIll) {
        return llllllllllllIlllllIIIlllIlIIllII >= llllllllllllIlllllIIIlllIlIIlIll;
    }
    
    private void func_175325_f() {
        final GuiPageButtonList.GuiListEntry[] array = new GuiPageButtonList.GuiListEntry[GuiCustomizeWorldScreen.lIlllIIlllIllI[31]];
        array[GuiCustomizeWorldScreen.lIlllIIlllIllI[0]] = new GuiPageButtonList.GuiSlideEntry(GuiCustomizeWorldScreen.lIlllIIlllIllI[26], I18n.format(GuiCustomizeWorldScreen.lIlllIIlIIllII[GuiCustomizeWorldScreen.lIlllIIlllIllI[32]], new Object[GuiCustomizeWorldScreen.lIlllIIlllIllI[0]]), (boolean)(GuiCustomizeWorldScreen.lIlllIIlllIllI[1] != 0), this, 1.0f, 255.0f, (float)this.field_175336_F.seaLevel);
        array[GuiCustomizeWorldScreen.lIlllIIlllIllI[1]] = new GuiPageButtonList.GuiButtonEntry(GuiCustomizeWorldScreen.lIlllIIlllIllI[33], I18n.format(GuiCustomizeWorldScreen.lIlllIIlIIllII[GuiCustomizeWorldScreen.lIlllIIlllIllI[34]], new Object[GuiCustomizeWorldScreen.lIlllIIlllIllI[0]]), (boolean)(GuiCustomizeWorldScreen.lIlllIIlllIllI[1] != 0), this.field_175336_F.useCaves);
        array[GuiCustomizeWorldScreen.lIlllIIlllIllI[2]] = new GuiPageButtonList.GuiButtonEntry(GuiCustomizeWorldScreen.lIlllIIlllIllI[35], I18n.format(GuiCustomizeWorldScreen.lIlllIIlIIllII[GuiCustomizeWorldScreen.lIlllIIlllIllI[36]], new Object[GuiCustomizeWorldScreen.lIlllIIlllIllI[0]]), (boolean)(GuiCustomizeWorldScreen.lIlllIIlllIllI[1] != 0), this.field_175336_F.useStrongholds);
        array[GuiCustomizeWorldScreen.lIlllIIlllIllI[4]] = new GuiPageButtonList.GuiButtonEntry(GuiCustomizeWorldScreen.lIlllIIlllIllI[37], I18n.format(GuiCustomizeWorldScreen.lIlllIIlIIllII[GuiCustomizeWorldScreen.lIlllIIlllIllI[38]], new Object[GuiCustomizeWorldScreen.lIlllIIlllIllI[0]]), (boolean)(GuiCustomizeWorldScreen.lIlllIIlllIllI[1] != 0), this.field_175336_F.useVillages);
        array[GuiCustomizeWorldScreen.lIlllIIlllIllI[3]] = new GuiPageButtonList.GuiButtonEntry(GuiCustomizeWorldScreen.lIlllIIlllIllI[39], I18n.format(GuiCustomizeWorldScreen.lIlllIIlIIllII[GuiCustomizeWorldScreen.lIlllIIlllIllI[40]], new Object[GuiCustomizeWorldScreen.lIlllIIlllIllI[0]]), (boolean)(GuiCustomizeWorldScreen.lIlllIIlllIllI[1] != 0), this.field_175336_F.useMineShafts);
        array[GuiCustomizeWorldScreen.lIlllIIlllIllI[7]] = new GuiPageButtonList.GuiButtonEntry(GuiCustomizeWorldScreen.lIlllIIlllIllI[41], I18n.format(GuiCustomizeWorldScreen.lIlllIIlIIllII[GuiCustomizeWorldScreen.lIlllIIlllIllI[42]], new Object[GuiCustomizeWorldScreen.lIlllIIlllIllI[0]]), (boolean)(GuiCustomizeWorldScreen.lIlllIIlllIllI[1] != 0), this.field_175336_F.useTemples);
        array[GuiCustomizeWorldScreen.lIlllIIlllIllI[15]] = new GuiPageButtonList.GuiButtonEntry(GuiCustomizeWorldScreen.lIlllIIlllIllI[43], I18n.format(GuiCustomizeWorldScreen.lIlllIIlIIllII[GuiCustomizeWorldScreen.lIlllIIlllIllI[31]], new Object[GuiCustomizeWorldScreen.lIlllIIlllIllI[0]]), (boolean)(GuiCustomizeWorldScreen.lIlllIIlllIllI[1] != 0), this.field_175336_F.useMonuments);
        array[GuiCustomizeWorldScreen.lIlllIIlllIllI[18]] = new GuiPageButtonList.GuiButtonEntry(GuiCustomizeWorldScreen.lIlllIIlllIllI[44], I18n.format(GuiCustomizeWorldScreen.lIlllIIlIIllII[GuiCustomizeWorldScreen.lIlllIIlllIllI[45]], new Object[GuiCustomizeWorldScreen.lIlllIIlllIllI[0]]), (boolean)(GuiCustomizeWorldScreen.lIlllIIlllIllI[1] != 0), this.field_175336_F.useRavines);
        array[GuiCustomizeWorldScreen.lIlllIIlllIllI[20]] = new GuiPageButtonList.GuiButtonEntry(GuiCustomizeWorldScreen.lIlllIIlllIllI[46], I18n.format(GuiCustomizeWorldScreen.lIlllIIlIIllII[GuiCustomizeWorldScreen.lIlllIIlllIllI[6]], new Object[GuiCustomizeWorldScreen.lIlllIIlllIllI[0]]), (boolean)(GuiCustomizeWorldScreen.lIlllIIlllIllI[1] != 0), this.field_175336_F.useDungeons);
        array[GuiCustomizeWorldScreen.lIlllIIlllIllI[23]] = new GuiPageButtonList.GuiSlideEntry(GuiCustomizeWorldScreen.lIlllIIlllIllI[47], I18n.format(GuiCustomizeWorldScreen.lIlllIIlIIllII[GuiCustomizeWorldScreen.lIlllIIlllIllI[48]], new Object[GuiCustomizeWorldScreen.lIlllIIlllIllI[0]]), (boolean)(GuiCustomizeWorldScreen.lIlllIIlllIllI[1] != 0), this, 1.0f, 100.0f, (float)this.field_175336_F.dungeonChance);
        array[GuiCustomizeWorldScreen.lIlllIIlllIllI[28]] = new GuiPageButtonList.GuiButtonEntry(GuiCustomizeWorldScreen.lIlllIIlllIllI[49], I18n.format(GuiCustomizeWorldScreen.lIlllIIlIIllII[GuiCustomizeWorldScreen.lIlllIIlllIllI[50]], new Object[GuiCustomizeWorldScreen.lIlllIIlllIllI[0]]), (boolean)(GuiCustomizeWorldScreen.lIlllIIlllIllI[1] != 0), this.field_175336_F.useWaterLakes);
        array[GuiCustomizeWorldScreen.lIlllIIlllIllI[30]] = new GuiPageButtonList.GuiSlideEntry(GuiCustomizeWorldScreen.lIlllIIlllIllI[51], I18n.format(GuiCustomizeWorldScreen.lIlllIIlIIllII[GuiCustomizeWorldScreen.lIlllIIlllIllI[52]], new Object[GuiCustomizeWorldScreen.lIlllIIlllIllI[0]]), (boolean)(GuiCustomizeWorldScreen.lIlllIIlllIllI[1] != 0), this, 1.0f, 100.0f, (float)this.field_175336_F.waterLakeChance);
        array[GuiCustomizeWorldScreen.lIlllIIlllIllI[32]] = new GuiPageButtonList.GuiButtonEntry(GuiCustomizeWorldScreen.lIlllIIlllIllI[53], I18n.format(GuiCustomizeWorldScreen.lIlllIIlIIllII[GuiCustomizeWorldScreen.lIlllIIlllIllI[54]], new Object[GuiCustomizeWorldScreen.lIlllIIlllIllI[0]]), (boolean)(GuiCustomizeWorldScreen.lIlllIIlllIllI[1] != 0), this.field_175336_F.useLavaLakes);
        array[GuiCustomizeWorldScreen.lIlllIIlllIllI[34]] = new GuiPageButtonList.GuiSlideEntry(GuiCustomizeWorldScreen.lIlllIIlllIllI[55], I18n.format(GuiCustomizeWorldScreen.lIlllIIlIIllII[GuiCustomizeWorldScreen.lIlllIIlllIllI[56]], new Object[GuiCustomizeWorldScreen.lIlllIIlllIllI[0]]), (boolean)(GuiCustomizeWorldScreen.lIlllIIlllIllI[1] != 0), this, 10.0f, 100.0f, (float)this.field_175336_F.lavaLakeChance);
        array[GuiCustomizeWorldScreen.lIlllIIlllIllI[36]] = new GuiPageButtonList.GuiButtonEntry(GuiCustomizeWorldScreen.lIlllIIlllIllI[57], I18n.format(GuiCustomizeWorldScreen.lIlllIIlIIllII[GuiCustomizeWorldScreen.lIlllIIlllIllI[58]], new Object[GuiCustomizeWorldScreen.lIlllIIlllIllI[0]]), (boolean)(GuiCustomizeWorldScreen.lIlllIIlllIllI[1] != 0), this.field_175336_F.useLavaOceans);
        array[GuiCustomizeWorldScreen.lIlllIIlllIllI[38]] = new GuiPageButtonList.GuiSlideEntry(GuiCustomizeWorldScreen.lIlllIIlllIllI[59], I18n.format(GuiCustomizeWorldScreen.lIlllIIlIIllII[GuiCustomizeWorldScreen.lIlllIIlllIllI[13]], new Object[GuiCustomizeWorldScreen.lIlllIIlllIllI[0]]), (boolean)(GuiCustomizeWorldScreen.lIlllIIlllIllI[1] != 0), this, -1.0f, 37.0f, (float)this.field_175336_F.fixedBiome);
        array[GuiCustomizeWorldScreen.lIlllIIlllIllI[40]] = new GuiPageButtonList.GuiSlideEntry(GuiCustomizeWorldScreen.lIlllIIlllIllI[60], I18n.format(GuiCustomizeWorldScreen.lIlllIIlIIllII[GuiCustomizeWorldScreen.lIlllIIlllIllI[61]], new Object[GuiCustomizeWorldScreen.lIlllIIlllIllI[0]]), (boolean)(GuiCustomizeWorldScreen.lIlllIIlllIllI[1] != 0), this, 1.0f, 8.0f, (float)this.field_175336_F.biomeSize);
        array[GuiCustomizeWorldScreen.lIlllIIlllIllI[42]] = new GuiPageButtonList.GuiSlideEntry(GuiCustomizeWorldScreen.lIlllIIlllIllI[62], I18n.format(GuiCustomizeWorldScreen.lIlllIIlIIllII[GuiCustomizeWorldScreen.lIlllIIlllIllI[63]], new Object[GuiCustomizeWorldScreen.lIlllIIlllIllI[0]]), (boolean)(GuiCustomizeWorldScreen.lIlllIIlllIllI[1] != 0), this, 1.0f, 5.0f, (float)this.field_175336_F.riverSize);
        final GuiPageButtonList.GuiListEntry[] llllllllllllIlllllIIlIIIIlIllIII = array;
        final GuiPageButtonList.GuiListEntry[] array2 = new GuiPageButtonList.GuiListEntry[GuiCustomizeWorldScreen.lIlllIIlllIllI[64]];
        array2[GuiCustomizeWorldScreen.lIlllIIlllIllI[0]] = new GuiPageButtonList.GuiLabelEntry(GuiCustomizeWorldScreen.lIlllIIlllIllI[65], I18n.format(GuiCustomizeWorldScreen.lIlllIIlIIllII[GuiCustomizeWorldScreen.lIlllIIlllIllI[66]], new Object[GuiCustomizeWorldScreen.lIlllIIlllIllI[0]]), (boolean)(GuiCustomizeWorldScreen.lIlllIIlllIllI[0] != 0));
        array2[GuiCustomizeWorldScreen.lIlllIIlllIllI[2]] = new GuiPageButtonList.GuiSlideEntry(GuiCustomizeWorldScreen.lIlllIIlllIllI[67], I18n.format(GuiCustomizeWorldScreen.lIlllIIlIIllII[GuiCustomizeWorldScreen.lIlllIIlllIllI[68]], new Object[GuiCustomizeWorldScreen.lIlllIIlllIllI[0]]), (boolean)(GuiCustomizeWorldScreen.lIlllIIlllIllI[0] != 0), this, 1.0f, 50.0f, (float)this.field_175336_F.dirtSize);
        array2[GuiCustomizeWorldScreen.lIlllIIlllIllI[4]] = new GuiPageButtonList.GuiSlideEntry(GuiCustomizeWorldScreen.lIlllIIlllIllI[69], I18n.format(GuiCustomizeWorldScreen.lIlllIIlIIllII[GuiCustomizeWorldScreen.lIlllIIlllIllI[70]], new Object[GuiCustomizeWorldScreen.lIlllIIlllIllI[0]]), (boolean)(GuiCustomizeWorldScreen.lIlllIIlllIllI[0] != 0), this, 0.0f, 40.0f, (float)this.field_175336_F.dirtCount);
        array2[GuiCustomizeWorldScreen.lIlllIIlllIllI[3]] = new GuiPageButtonList.GuiSlideEntry(GuiCustomizeWorldScreen.lIlllIIlllIllI[71], I18n.format(GuiCustomizeWorldScreen.lIlllIIlIIllII[GuiCustomizeWorldScreen.lIlllIIlllIllI[72]], new Object[GuiCustomizeWorldScreen.lIlllIIlllIllI[0]]), (boolean)(GuiCustomizeWorldScreen.lIlllIIlllIllI[0] != 0), this, 0.0f, 255.0f, (float)this.field_175336_F.dirtMinHeight);
        array2[GuiCustomizeWorldScreen.lIlllIIlllIllI[7]] = new GuiPageButtonList.GuiSlideEntry(GuiCustomizeWorldScreen.lIlllIIlllIllI[73], I18n.format(GuiCustomizeWorldScreen.lIlllIIlIIllII[GuiCustomizeWorldScreen.lIlllIIlllIllI[74]], new Object[GuiCustomizeWorldScreen.lIlllIIlllIllI[0]]), (boolean)(GuiCustomizeWorldScreen.lIlllIIlllIllI[0] != 0), this, 0.0f, 255.0f, (float)this.field_175336_F.dirtMaxHeight);
        array2[GuiCustomizeWorldScreen.lIlllIIlllIllI[15]] = new GuiPageButtonList.GuiLabelEntry(GuiCustomizeWorldScreen.lIlllIIlllIllI[75], I18n.format(GuiCustomizeWorldScreen.lIlllIIlIIllII[GuiCustomizeWorldScreen.lIlllIIlllIllI[76]], new Object[GuiCustomizeWorldScreen.lIlllIIlllIllI[0]]), (boolean)(GuiCustomizeWorldScreen.lIlllIIlllIllI[0] != 0));
        array2[GuiCustomizeWorldScreen.lIlllIIlllIllI[20]] = new GuiPageButtonList.GuiSlideEntry(GuiCustomizeWorldScreen.lIlllIIlllIllI[77], I18n.format(GuiCustomizeWorldScreen.lIlllIIlIIllII[GuiCustomizeWorldScreen.lIlllIIlllIllI[78]], new Object[GuiCustomizeWorldScreen.lIlllIIlllIllI[0]]), (boolean)(GuiCustomizeWorldScreen.lIlllIIlllIllI[0] != 0), this, 1.0f, 50.0f, (float)this.field_175336_F.gravelSize);
        array2[GuiCustomizeWorldScreen.lIlllIIlllIllI[23]] = new GuiPageButtonList.GuiSlideEntry(GuiCustomizeWorldScreen.lIlllIIlllIllI[79], I18n.format(GuiCustomizeWorldScreen.lIlllIIlIIllII[GuiCustomizeWorldScreen.lIlllIIlllIllI[80]], new Object[GuiCustomizeWorldScreen.lIlllIIlllIllI[0]]), (boolean)(GuiCustomizeWorldScreen.lIlllIIlllIllI[0] != 0), this, 0.0f, 40.0f, (float)this.field_175336_F.gravelCount);
        array2[GuiCustomizeWorldScreen.lIlllIIlllIllI[28]] = new GuiPageButtonList.GuiSlideEntry(GuiCustomizeWorldScreen.lIlllIIlllIllI[81], I18n.format(GuiCustomizeWorldScreen.lIlllIIlIIllII[GuiCustomizeWorldScreen.lIlllIIlllIllI[82]], new Object[GuiCustomizeWorldScreen.lIlllIIlllIllI[0]]), (boolean)(GuiCustomizeWorldScreen.lIlllIIlllIllI[0] != 0), this, 0.0f, 255.0f, (float)this.field_175336_F.gravelMinHeight);
        array2[GuiCustomizeWorldScreen.lIlllIIlllIllI[30]] = new GuiPageButtonList.GuiSlideEntry(GuiCustomizeWorldScreen.lIlllIIlllIllI[83], I18n.format(GuiCustomizeWorldScreen.lIlllIIlIIllII[GuiCustomizeWorldScreen.lIlllIIlllIllI[84]], new Object[GuiCustomizeWorldScreen.lIlllIIlllIllI[0]]), (boolean)(GuiCustomizeWorldScreen.lIlllIIlllIllI[0] != 0), this, 0.0f, 255.0f, (float)this.field_175336_F.gravelMaxHeight);
        array2[GuiCustomizeWorldScreen.lIlllIIlllIllI[32]] = new GuiPageButtonList.GuiLabelEntry(GuiCustomizeWorldScreen.lIlllIIlllIllI[85], I18n.format(GuiCustomizeWorldScreen.lIlllIIlIIllII[GuiCustomizeWorldScreen.lIlllIIlllIllI[86]], new Object[GuiCustomizeWorldScreen.lIlllIIlllIllI[0]]), (boolean)(GuiCustomizeWorldScreen.lIlllIIlllIllI[0] != 0));
        array2[GuiCustomizeWorldScreen.lIlllIIlllIllI[36]] = new GuiPageButtonList.GuiSlideEntry(GuiCustomizeWorldScreen.lIlllIIlllIllI[87], I18n.format(GuiCustomizeWorldScreen.lIlllIIlIIllII[GuiCustomizeWorldScreen.lIlllIIlllIllI[88]], new Object[GuiCustomizeWorldScreen.lIlllIIlllIllI[0]]), (boolean)(GuiCustomizeWorldScreen.lIlllIIlllIllI[0] != 0), this, 1.0f, 50.0f, (float)this.field_175336_F.graniteSize);
        array2[GuiCustomizeWorldScreen.lIlllIIlllIllI[38]] = new GuiPageButtonList.GuiSlideEntry(GuiCustomizeWorldScreen.lIlllIIlllIllI[89], I18n.format(GuiCustomizeWorldScreen.lIlllIIlIIllII[GuiCustomizeWorldScreen.lIlllIIlllIllI[90]], new Object[GuiCustomizeWorldScreen.lIlllIIlllIllI[0]]), (boolean)(GuiCustomizeWorldScreen.lIlllIIlllIllI[0] != 0), this, 0.0f, 40.0f, (float)this.field_175336_F.graniteCount);
        array2[GuiCustomizeWorldScreen.lIlllIIlllIllI[40]] = new GuiPageButtonList.GuiSlideEntry(GuiCustomizeWorldScreen.lIlllIIlllIllI[91], I18n.format(GuiCustomizeWorldScreen.lIlllIIlIIllII[GuiCustomizeWorldScreen.lIlllIIlllIllI[92]], new Object[GuiCustomizeWorldScreen.lIlllIIlllIllI[0]]), (boolean)(GuiCustomizeWorldScreen.lIlllIIlllIllI[0] != 0), this, 0.0f, 255.0f, (float)this.field_175336_F.graniteMinHeight);
        array2[GuiCustomizeWorldScreen.lIlllIIlllIllI[42]] = new GuiPageButtonList.GuiSlideEntry(GuiCustomizeWorldScreen.lIlllIIlllIllI[93], I18n.format(GuiCustomizeWorldScreen.lIlllIIlIIllII[GuiCustomizeWorldScreen.lIlllIIlllIllI[94]], new Object[GuiCustomizeWorldScreen.lIlllIIlllIllI[0]]), (boolean)(GuiCustomizeWorldScreen.lIlllIIlllIllI[0] != 0), this, 0.0f, 255.0f, (float)this.field_175336_F.graniteMaxHeight);
        array2[GuiCustomizeWorldScreen.lIlllIIlllIllI[31]] = new GuiPageButtonList.GuiLabelEntry(GuiCustomizeWorldScreen.lIlllIIlllIllI[95], I18n.format(GuiCustomizeWorldScreen.lIlllIIlIIllII[GuiCustomizeWorldScreen.lIlllIIlllIllI[96]], new Object[GuiCustomizeWorldScreen.lIlllIIlllIllI[0]]), (boolean)(GuiCustomizeWorldScreen.lIlllIIlllIllI[0] != 0));
        array2[GuiCustomizeWorldScreen.lIlllIIlllIllI[6]] = new GuiPageButtonList.GuiSlideEntry(GuiCustomizeWorldScreen.lIlllIIlllIllI[97], I18n.format(GuiCustomizeWorldScreen.lIlllIIlIIllII[GuiCustomizeWorldScreen.lIlllIIlllIllI[98]], new Object[GuiCustomizeWorldScreen.lIlllIIlllIllI[0]]), (boolean)(GuiCustomizeWorldScreen.lIlllIIlllIllI[0] != 0), this, 1.0f, 50.0f, (float)this.field_175336_F.dioriteSize);
        array2[GuiCustomizeWorldScreen.lIlllIIlllIllI[48]] = new GuiPageButtonList.GuiSlideEntry(GuiCustomizeWorldScreen.lIlllIIlllIllI[99], I18n.format(GuiCustomizeWorldScreen.lIlllIIlIIllII[GuiCustomizeWorldScreen.lIlllIIlllIllI[100]], new Object[GuiCustomizeWorldScreen.lIlllIIlllIllI[0]]), (boolean)(GuiCustomizeWorldScreen.lIlllIIlllIllI[0] != 0), this, 0.0f, 40.0f, (float)this.field_175336_F.dioriteCount);
        array2[GuiCustomizeWorldScreen.lIlllIIlllIllI[50]] = new GuiPageButtonList.GuiSlideEntry(GuiCustomizeWorldScreen.lIlllIIlllIllI[101], I18n.format(GuiCustomizeWorldScreen.lIlllIIlIIllII[GuiCustomizeWorldScreen.lIlllIIlllIllI[102]], new Object[GuiCustomizeWorldScreen.lIlllIIlllIllI[0]]), (boolean)(GuiCustomizeWorldScreen.lIlllIIlllIllI[0] != 0), this, 0.0f, 255.0f, (float)this.field_175336_F.dioriteMinHeight);
        array2[GuiCustomizeWorldScreen.lIlllIIlllIllI[52]] = new GuiPageButtonList.GuiSlideEntry(GuiCustomizeWorldScreen.lIlllIIlllIllI[103], I18n.format(GuiCustomizeWorldScreen.lIlllIIlIIllII[GuiCustomizeWorldScreen.lIlllIIlllIllI[104]], new Object[GuiCustomizeWorldScreen.lIlllIIlllIllI[0]]), (boolean)(GuiCustomizeWorldScreen.lIlllIIlllIllI[0] != 0), this, 0.0f, 255.0f, (float)this.field_175336_F.dioriteMaxHeight);
        array2[GuiCustomizeWorldScreen.lIlllIIlllIllI[54]] = new GuiPageButtonList.GuiLabelEntry(GuiCustomizeWorldScreen.lIlllIIlllIllI[105], I18n.format(GuiCustomizeWorldScreen.lIlllIIlIIllII[GuiCustomizeWorldScreen.lIlllIIlllIllI[27]], new Object[GuiCustomizeWorldScreen.lIlllIIlllIllI[0]]), (boolean)(GuiCustomizeWorldScreen.lIlllIIlllIllI[0] != 0));
        array2[GuiCustomizeWorldScreen.lIlllIIlllIllI[58]] = new GuiPageButtonList.GuiSlideEntry(GuiCustomizeWorldScreen.lIlllIIlllIllI[106], I18n.format(GuiCustomizeWorldScreen.lIlllIIlIIllII[GuiCustomizeWorldScreen.lIlllIIlllIllI[107]], new Object[GuiCustomizeWorldScreen.lIlllIIlllIllI[0]]), (boolean)(GuiCustomizeWorldScreen.lIlllIIlllIllI[0] != 0), this, 1.0f, 50.0f, (float)this.field_175336_F.andesiteSize);
        array2[GuiCustomizeWorldScreen.lIlllIIlllIllI[13]] = new GuiPageButtonList.GuiSlideEntry(GuiCustomizeWorldScreen.lIlllIIlllIllI[108], I18n.format(GuiCustomizeWorldScreen.lIlllIIlIIllII[GuiCustomizeWorldScreen.lIlllIIlllIllI[109]], new Object[GuiCustomizeWorldScreen.lIlllIIlllIllI[0]]), (boolean)(GuiCustomizeWorldScreen.lIlllIIlllIllI[0] != 0), this, 0.0f, 40.0f, (float)this.field_175336_F.andesiteCount);
        array2[GuiCustomizeWorldScreen.lIlllIIlllIllI[61]] = new GuiPageButtonList.GuiSlideEntry(GuiCustomizeWorldScreen.lIlllIIlllIllI[110], I18n.format(GuiCustomizeWorldScreen.lIlllIIlIIllII[GuiCustomizeWorldScreen.lIlllIIlllIllI[111]], new Object[GuiCustomizeWorldScreen.lIlllIIlllIllI[0]]), (boolean)(GuiCustomizeWorldScreen.lIlllIIlllIllI[0] != 0), this, 0.0f, 255.0f, (float)this.field_175336_F.andesiteMinHeight);
        array2[GuiCustomizeWorldScreen.lIlllIIlllIllI[63]] = new GuiPageButtonList.GuiSlideEntry(GuiCustomizeWorldScreen.lIlllIIlllIllI[112], I18n.format(GuiCustomizeWorldScreen.lIlllIIlIIllII[GuiCustomizeWorldScreen.lIlllIIlllIllI[113]], new Object[GuiCustomizeWorldScreen.lIlllIIlllIllI[0]]), (boolean)(GuiCustomizeWorldScreen.lIlllIIlllIllI[0] != 0), this, 0.0f, 255.0f, (float)this.field_175336_F.andesiteMaxHeight);
        array2[GuiCustomizeWorldScreen.lIlllIIlllIllI[66]] = new GuiPageButtonList.GuiLabelEntry(GuiCustomizeWorldScreen.lIlllIIlllIllI[114], I18n.format(GuiCustomizeWorldScreen.lIlllIIlIIllII[GuiCustomizeWorldScreen.lIlllIIlllIllI[25]], new Object[GuiCustomizeWorldScreen.lIlllIIlllIllI[0]]), (boolean)(GuiCustomizeWorldScreen.lIlllIIlllIllI[0] != 0));
        array2[GuiCustomizeWorldScreen.lIlllIIlllIllI[70]] = new GuiPageButtonList.GuiSlideEntry(GuiCustomizeWorldScreen.lIlllIIlllIllI[115], I18n.format(GuiCustomizeWorldScreen.lIlllIIlIIllII[GuiCustomizeWorldScreen.lIlllIIlllIllI[116]], new Object[GuiCustomizeWorldScreen.lIlllIIlllIllI[0]]), (boolean)(GuiCustomizeWorldScreen.lIlllIIlllIllI[0] != 0), this, 1.0f, 50.0f, (float)this.field_175336_F.coalSize);
        array2[GuiCustomizeWorldScreen.lIlllIIlllIllI[72]] = new GuiPageButtonList.GuiSlideEntry(GuiCustomizeWorldScreen.lIlllIIlllIllI[117], I18n.format(GuiCustomizeWorldScreen.lIlllIIlIIllII[GuiCustomizeWorldScreen.lIlllIIlllIllI[118]], new Object[GuiCustomizeWorldScreen.lIlllIIlllIllI[0]]), (boolean)(GuiCustomizeWorldScreen.lIlllIIlllIllI[0] != 0), this, 0.0f, 40.0f, (float)this.field_175336_F.coalCount);
        array2[GuiCustomizeWorldScreen.lIlllIIlllIllI[74]] = new GuiPageButtonList.GuiSlideEntry(GuiCustomizeWorldScreen.lIlllIIlllIllI[12], I18n.format(GuiCustomizeWorldScreen.lIlllIIlIIllII[GuiCustomizeWorldScreen.lIlllIIlllIllI[119]], new Object[GuiCustomizeWorldScreen.lIlllIIlllIllI[0]]), (boolean)(GuiCustomizeWorldScreen.lIlllIIlllIllI[0] != 0), this, 0.0f, 255.0f, (float)this.field_175336_F.coalMinHeight);
        array2[GuiCustomizeWorldScreen.lIlllIIlllIllI[76]] = new GuiPageButtonList.GuiSlideEntry(GuiCustomizeWorldScreen.lIlllIIlllIllI[120], I18n.format(GuiCustomizeWorldScreen.lIlllIIlIIllII[GuiCustomizeWorldScreen.lIlllIIlllIllI[121]], new Object[GuiCustomizeWorldScreen.lIlllIIlllIllI[0]]), (boolean)(GuiCustomizeWorldScreen.lIlllIIlllIllI[0] != 0), this, 0.0f, 255.0f, (float)this.field_175336_F.coalMaxHeight);
        array2[GuiCustomizeWorldScreen.lIlllIIlllIllI[78]] = new GuiPageButtonList.GuiLabelEntry(GuiCustomizeWorldScreen.lIlllIIlllIllI[122], I18n.format(GuiCustomizeWorldScreen.lIlllIIlIIllII[GuiCustomizeWorldScreen.lIlllIIlllIllI[123]], new Object[GuiCustomizeWorldScreen.lIlllIIlllIllI[0]]), (boolean)(GuiCustomizeWorldScreen.lIlllIIlllIllI[0] != 0));
        array2[GuiCustomizeWorldScreen.lIlllIIlllIllI[82]] = new GuiPageButtonList.GuiSlideEntry(GuiCustomizeWorldScreen.lIlllIIlllIllI[124], I18n.format(GuiCustomizeWorldScreen.lIlllIIlIIllII[GuiCustomizeWorldScreen.lIlllIIlllIllI[125]], new Object[GuiCustomizeWorldScreen.lIlllIIlllIllI[0]]), (boolean)(GuiCustomizeWorldScreen.lIlllIIlllIllI[0] != 0), this, 1.0f, 50.0f, (float)this.field_175336_F.ironSize);
        array2[GuiCustomizeWorldScreen.lIlllIIlllIllI[84]] = new GuiPageButtonList.GuiSlideEntry(GuiCustomizeWorldScreen.lIlllIIlllIllI[126], I18n.format(GuiCustomizeWorldScreen.lIlllIIlIIllII[GuiCustomizeWorldScreen.lIlllIIlllIllI[127]], new Object[GuiCustomizeWorldScreen.lIlllIIlllIllI[0]]), (boolean)(GuiCustomizeWorldScreen.lIlllIIlllIllI[0] != 0), this, 0.0f, 40.0f, (float)this.field_175336_F.ironCount);
        array2[GuiCustomizeWorldScreen.lIlllIIlllIllI[86]] = new GuiPageButtonList.GuiSlideEntry(GuiCustomizeWorldScreen.lIlllIIlllIllI[128], I18n.format(GuiCustomizeWorldScreen.lIlllIIlIIllII[GuiCustomizeWorldScreen.lIlllIIlllIllI[129]], new Object[GuiCustomizeWorldScreen.lIlllIIlllIllI[0]]), (boolean)(GuiCustomizeWorldScreen.lIlllIIlllIllI[0] != 0), this, 0.0f, 255.0f, (float)this.field_175336_F.ironMinHeight);
        array2[GuiCustomizeWorldScreen.lIlllIIlllIllI[88]] = new GuiPageButtonList.GuiSlideEntry(GuiCustomizeWorldScreen.lIlllIIlllIllI[130], I18n.format(GuiCustomizeWorldScreen.lIlllIIlIIllII[GuiCustomizeWorldScreen.lIlllIIlllIllI[131]], new Object[GuiCustomizeWorldScreen.lIlllIIlllIllI[0]]), (boolean)(GuiCustomizeWorldScreen.lIlllIIlllIllI[0] != 0), this, 0.0f, 255.0f, (float)this.field_175336_F.ironMaxHeight);
        array2[GuiCustomizeWorldScreen.lIlllIIlllIllI[90]] = new GuiPageButtonList.GuiLabelEntry(GuiCustomizeWorldScreen.lIlllIIlllIllI[132], I18n.format(GuiCustomizeWorldScreen.lIlllIIlIIllII[GuiCustomizeWorldScreen.lIlllIIlllIllI[133]], new Object[GuiCustomizeWorldScreen.lIlllIIlllIllI[0]]), (boolean)(GuiCustomizeWorldScreen.lIlllIIlllIllI[0] != 0));
        array2[GuiCustomizeWorldScreen.lIlllIIlllIllI[94]] = new GuiPageButtonList.GuiSlideEntry(GuiCustomizeWorldScreen.lIlllIIlllIllI[134], I18n.format(GuiCustomizeWorldScreen.lIlllIIlIIllII[GuiCustomizeWorldScreen.lIlllIIlllIllI[64]], new Object[GuiCustomizeWorldScreen.lIlllIIlllIllI[0]]), (boolean)(GuiCustomizeWorldScreen.lIlllIIlllIllI[0] != 0), this, 1.0f, 50.0f, (float)this.field_175336_F.goldSize);
        array2[GuiCustomizeWorldScreen.lIlllIIlllIllI[96]] = new GuiPageButtonList.GuiSlideEntry(GuiCustomizeWorldScreen.lIlllIIlllIllI[135], I18n.format(GuiCustomizeWorldScreen.lIlllIIlIIllII[GuiCustomizeWorldScreen.lIlllIIlllIllI[136]], new Object[GuiCustomizeWorldScreen.lIlllIIlllIllI[0]]), (boolean)(GuiCustomizeWorldScreen.lIlllIIlllIllI[0] != 0), this, 0.0f, 40.0f, (float)this.field_175336_F.goldCount);
        array2[GuiCustomizeWorldScreen.lIlllIIlllIllI[98]] = new GuiPageButtonList.GuiSlideEntry(GuiCustomizeWorldScreen.lIlllIIlllIllI[137], I18n.format(GuiCustomizeWorldScreen.lIlllIIlIIllII[GuiCustomizeWorldScreen.lIlllIIlllIllI[138]], new Object[GuiCustomizeWorldScreen.lIlllIIlllIllI[0]]), (boolean)(GuiCustomizeWorldScreen.lIlllIIlllIllI[0] != 0), this, 0.0f, 255.0f, (float)this.field_175336_F.goldMinHeight);
        array2[GuiCustomizeWorldScreen.lIlllIIlllIllI[100]] = new GuiPageButtonList.GuiSlideEntry(GuiCustomizeWorldScreen.lIlllIIlllIllI[139], I18n.format(GuiCustomizeWorldScreen.lIlllIIlIIllII[GuiCustomizeWorldScreen.lIlllIIlllIllI[140]], new Object[GuiCustomizeWorldScreen.lIlllIIlllIllI[0]]), (boolean)(GuiCustomizeWorldScreen.lIlllIIlllIllI[0] != 0), this, 0.0f, 255.0f, (float)this.field_175336_F.goldMaxHeight);
        array2[GuiCustomizeWorldScreen.lIlllIIlllIllI[102]] = new GuiPageButtonList.GuiLabelEntry(GuiCustomizeWorldScreen.lIlllIIlllIllI[141], I18n.format(GuiCustomizeWorldScreen.lIlllIIlIIllII[GuiCustomizeWorldScreen.lIlllIIlllIllI[142]], new Object[GuiCustomizeWorldScreen.lIlllIIlllIllI[0]]), (boolean)(GuiCustomizeWorldScreen.lIlllIIlllIllI[0] != 0));
        array2[GuiCustomizeWorldScreen.lIlllIIlllIllI[27]] = new GuiPageButtonList.GuiSlideEntry(GuiCustomizeWorldScreen.lIlllIIlllIllI[143], I18n.format(GuiCustomizeWorldScreen.lIlllIIlIIllII[GuiCustomizeWorldScreen.lIlllIIlllIllI[144]], new Object[GuiCustomizeWorldScreen.lIlllIIlllIllI[0]]), (boolean)(GuiCustomizeWorldScreen.lIlllIIlllIllI[0] != 0), this, 1.0f, 50.0f, (float)this.field_175336_F.redstoneSize);
        array2[GuiCustomizeWorldScreen.lIlllIIlllIllI[107]] = new GuiPageButtonList.GuiSlideEntry(GuiCustomizeWorldScreen.lIlllIIlllIllI[145], I18n.format(GuiCustomizeWorldScreen.lIlllIIlIIllII[GuiCustomizeWorldScreen.lIlllIIlllIllI[146]], new Object[GuiCustomizeWorldScreen.lIlllIIlllIllI[0]]), (boolean)(GuiCustomizeWorldScreen.lIlllIIlllIllI[0] != 0), this, 0.0f, 40.0f, (float)this.field_175336_F.redstoneCount);
        array2[GuiCustomizeWorldScreen.lIlllIIlllIllI[109]] = new GuiPageButtonList.GuiSlideEntry(GuiCustomizeWorldScreen.lIlllIIlllIllI[147], I18n.format(GuiCustomizeWorldScreen.lIlllIIlIIllII[GuiCustomizeWorldScreen.lIlllIIlllIllI[148]], new Object[GuiCustomizeWorldScreen.lIlllIIlllIllI[0]]), (boolean)(GuiCustomizeWorldScreen.lIlllIIlllIllI[0] != 0), this, 0.0f, 255.0f, (float)this.field_175336_F.redstoneMinHeight);
        array2[GuiCustomizeWorldScreen.lIlllIIlllIllI[111]] = new GuiPageButtonList.GuiSlideEntry(GuiCustomizeWorldScreen.lIlllIIlllIllI[149], I18n.format(GuiCustomizeWorldScreen.lIlllIIlIIllII[GuiCustomizeWorldScreen.lIlllIIlllIllI[150]], new Object[GuiCustomizeWorldScreen.lIlllIIlllIllI[0]]), (boolean)(GuiCustomizeWorldScreen.lIlllIIlllIllI[0] != 0), this, 0.0f, 255.0f, (float)this.field_175336_F.redstoneMaxHeight);
        array2[GuiCustomizeWorldScreen.lIlllIIlllIllI[113]] = new GuiPageButtonList.GuiLabelEntry(GuiCustomizeWorldScreen.lIlllIIlllIllI[151], I18n.format(GuiCustomizeWorldScreen.lIlllIIlIIllII[GuiCustomizeWorldScreen.lIlllIIlllIllI[152]], new Object[GuiCustomizeWorldScreen.lIlllIIlllIllI[0]]), (boolean)(GuiCustomizeWorldScreen.lIlllIIlllIllI[0] != 0));
        array2[GuiCustomizeWorldScreen.lIlllIIlllIllI[116]] = new GuiPageButtonList.GuiSlideEntry(GuiCustomizeWorldScreen.lIlllIIlllIllI[153], I18n.format(GuiCustomizeWorldScreen.lIlllIIlIIllII[GuiCustomizeWorldScreen.lIlllIIlllIllI[154]], new Object[GuiCustomizeWorldScreen.lIlllIIlllIllI[0]]), (boolean)(GuiCustomizeWorldScreen.lIlllIIlllIllI[0] != 0), this, 1.0f, 50.0f, (float)this.field_175336_F.diamondSize);
        array2[GuiCustomizeWorldScreen.lIlllIIlllIllI[118]] = new GuiPageButtonList.GuiSlideEntry(GuiCustomizeWorldScreen.lIlllIIlllIllI[155], I18n.format(GuiCustomizeWorldScreen.lIlllIIlIIllII[GuiCustomizeWorldScreen.lIlllIIlllIllI[156]], new Object[GuiCustomizeWorldScreen.lIlllIIlllIllI[0]]), (boolean)(GuiCustomizeWorldScreen.lIlllIIlllIllI[0] != 0), this, 0.0f, 40.0f, (float)this.field_175336_F.diamondCount);
        array2[GuiCustomizeWorldScreen.lIlllIIlllIllI[119]] = new GuiPageButtonList.GuiSlideEntry(GuiCustomizeWorldScreen.lIlllIIlllIllI[157], I18n.format(GuiCustomizeWorldScreen.lIlllIIlIIllII[GuiCustomizeWorldScreen.lIlllIIlllIllI[158]], new Object[GuiCustomizeWorldScreen.lIlllIIlllIllI[0]]), (boolean)(GuiCustomizeWorldScreen.lIlllIIlllIllI[0] != 0), this, 0.0f, 255.0f, (float)this.field_175336_F.diamondMinHeight);
        array2[GuiCustomizeWorldScreen.lIlllIIlllIllI[121]] = new GuiPageButtonList.GuiSlideEntry(GuiCustomizeWorldScreen.lIlllIIlllIllI[159], I18n.format(GuiCustomizeWorldScreen.lIlllIIlIIllII[GuiCustomizeWorldScreen.lIlllIIlllIllI[160]], new Object[GuiCustomizeWorldScreen.lIlllIIlllIllI[0]]), (boolean)(GuiCustomizeWorldScreen.lIlllIIlllIllI[0] != 0), this, 0.0f, 255.0f, (float)this.field_175336_F.diamondMaxHeight);
        array2[GuiCustomizeWorldScreen.lIlllIIlllIllI[123]] = new GuiPageButtonList.GuiLabelEntry(GuiCustomizeWorldScreen.lIlllIIlllIllI[161], I18n.format(GuiCustomizeWorldScreen.lIlllIIlIIllII[GuiCustomizeWorldScreen.lIlllIIlllIllI[8]], new Object[GuiCustomizeWorldScreen.lIlllIIlllIllI[0]]), (boolean)(GuiCustomizeWorldScreen.lIlllIIlllIllI[0] != 0));
        array2[GuiCustomizeWorldScreen.lIlllIIlllIllI[127]] = new GuiPageButtonList.GuiSlideEntry(GuiCustomizeWorldScreen.lIlllIIlllIllI[162], I18n.format(GuiCustomizeWorldScreen.lIlllIIlIIllII[GuiCustomizeWorldScreen.lIlllIIlllIllI[163]], new Object[GuiCustomizeWorldScreen.lIlllIIlllIllI[0]]), (boolean)(GuiCustomizeWorldScreen.lIlllIIlllIllI[0] != 0), this, 1.0f, 50.0f, (float)this.field_175336_F.lapisSize);
        array2[GuiCustomizeWorldScreen.lIlllIIlllIllI[129]] = new GuiPageButtonList.GuiSlideEntry(GuiCustomizeWorldScreen.lIlllIIlllIllI[164], I18n.format(GuiCustomizeWorldScreen.lIlllIIlIIllII[GuiCustomizeWorldScreen.lIlllIIlllIllI[165]], new Object[GuiCustomizeWorldScreen.lIlllIIlllIllI[0]]), (boolean)(GuiCustomizeWorldScreen.lIlllIIlllIllI[0] != 0), this, 0.0f, 40.0f, (float)this.field_175336_F.lapisCount);
        array2[GuiCustomizeWorldScreen.lIlllIIlllIllI[131]] = new GuiPageButtonList.GuiSlideEntry(GuiCustomizeWorldScreen.lIlllIIlllIllI[166], I18n.format(GuiCustomizeWorldScreen.lIlllIIlIIllII[GuiCustomizeWorldScreen.lIlllIIlllIllI[167]], new Object[GuiCustomizeWorldScreen.lIlllIIlllIllI[0]]), (boolean)(GuiCustomizeWorldScreen.lIlllIIlllIllI[0] != 0), this, 0.0f, 255.0f, (float)this.field_175336_F.lapisCenterHeight);
        array2[GuiCustomizeWorldScreen.lIlllIIlllIllI[133]] = new GuiPageButtonList.GuiSlideEntry(GuiCustomizeWorldScreen.lIlllIIlllIllI[168], I18n.format(GuiCustomizeWorldScreen.lIlllIIlIIllII[GuiCustomizeWorldScreen.lIlllIIlllIllI[169]], new Object[GuiCustomizeWorldScreen.lIlllIIlllIllI[0]]), (boolean)(GuiCustomizeWorldScreen.lIlllIIlllIllI[0] != 0), this, 0.0f, 255.0f, (float)this.field_175336_F.lapisSpread);
        final GuiPageButtonList.GuiListEntry[] llllllllllllIlllllIIlIIIIlIlIlll = array2;
        final GuiPageButtonList.GuiListEntry[] array3 = new GuiPageButtonList.GuiListEntry[GuiCustomizeWorldScreen.lIlllIIlllIllI[40]];
        array3[GuiCustomizeWorldScreen.lIlllIIlllIllI[0]] = new GuiPageButtonList.GuiSlideEntry(GuiCustomizeWorldScreen.lIlllIIlllIllI[10], I18n.format(GuiCustomizeWorldScreen.lIlllIIlIIllII[GuiCustomizeWorldScreen.lIlllIIlllIllI[170]], new Object[GuiCustomizeWorldScreen.lIlllIIlllIllI[0]]), (boolean)(GuiCustomizeWorldScreen.lIlllIIlllIllI[0] != 0), this, 1.0f, 5000.0f, this.field_175336_F.mainNoiseScaleX);
        array3[GuiCustomizeWorldScreen.lIlllIIlllIllI[1]] = new GuiPageButtonList.GuiSlideEntry(GuiCustomizeWorldScreen.lIlllIIlllIllI[171], I18n.format(GuiCustomizeWorldScreen.lIlllIIlIIllII[GuiCustomizeWorldScreen.lIlllIIlllIllI[172]], new Object[GuiCustomizeWorldScreen.lIlllIIlllIllI[0]]), (boolean)(GuiCustomizeWorldScreen.lIlllIIlllIllI[0] != 0), this, 1.0f, 5000.0f, this.field_175336_F.mainNoiseScaleY);
        array3[GuiCustomizeWorldScreen.lIlllIIlllIllI[2]] = new GuiPageButtonList.GuiSlideEntry(GuiCustomizeWorldScreen.lIlllIIlllIllI[173], I18n.format(GuiCustomizeWorldScreen.lIlllIIlIIllII[GuiCustomizeWorldScreen.lIlllIIlllIllI[174]], new Object[GuiCustomizeWorldScreen.lIlllIIlllIllI[0]]), (boolean)(GuiCustomizeWorldScreen.lIlllIIlllIllI[0] != 0), this, 1.0f, 5000.0f, this.field_175336_F.mainNoiseScaleZ);
        array3[GuiCustomizeWorldScreen.lIlllIIlllIllI[4]] = new GuiPageButtonList.GuiSlideEntry(GuiCustomizeWorldScreen.lIlllIIlllIllI[175], I18n.format(GuiCustomizeWorldScreen.lIlllIIlIIllII[GuiCustomizeWorldScreen.lIlllIIlllIllI[176]], new Object[GuiCustomizeWorldScreen.lIlllIIlllIllI[0]]), (boolean)(GuiCustomizeWorldScreen.lIlllIIlllIllI[0] != 0), this, 1.0f, 2000.0f, this.field_175336_F.depthNoiseScaleX);
        array3[GuiCustomizeWorldScreen.lIlllIIlllIllI[3]] = new GuiPageButtonList.GuiSlideEntry(GuiCustomizeWorldScreen.lIlllIIlllIllI[177], I18n.format(GuiCustomizeWorldScreen.lIlllIIlIIllII[GuiCustomizeWorldScreen.lIlllIIlllIllI[178]], new Object[GuiCustomizeWorldScreen.lIlllIIlllIllI[0]]), (boolean)(GuiCustomizeWorldScreen.lIlllIIlllIllI[0] != 0), this, 1.0f, 2000.0f, this.field_175336_F.depthNoiseScaleZ);
        array3[GuiCustomizeWorldScreen.lIlllIIlllIllI[7]] = new GuiPageButtonList.GuiSlideEntry(GuiCustomizeWorldScreen.lIlllIIlllIllI[179], I18n.format(GuiCustomizeWorldScreen.lIlllIIlIIllII[GuiCustomizeWorldScreen.lIlllIIlllIllI[14]], new Object[GuiCustomizeWorldScreen.lIlllIIlllIllI[0]]), (boolean)(GuiCustomizeWorldScreen.lIlllIIlllIllI[0] != 0), this, 0.01f, 20.0f, this.field_175336_F.depthNoiseScaleExponent);
        array3[GuiCustomizeWorldScreen.lIlllIIlllIllI[15]] = new GuiPageButtonList.GuiSlideEntry(GuiCustomizeWorldScreen.lIlllIIlllIllI[180], I18n.format(GuiCustomizeWorldScreen.lIlllIIlIIllII[GuiCustomizeWorldScreen.lIlllIIlllIllI[181]], new Object[GuiCustomizeWorldScreen.lIlllIIlllIllI[0]]), (boolean)(GuiCustomizeWorldScreen.lIlllIIlllIllI[0] != 0), this, 1.0f, 25.0f, this.field_175336_F.baseSize);
        array3[GuiCustomizeWorldScreen.lIlllIIlllIllI[18]] = new GuiPageButtonList.GuiSlideEntry(GuiCustomizeWorldScreen.lIlllIIlllIllI[182], I18n.format(GuiCustomizeWorldScreen.lIlllIIlIIllII[GuiCustomizeWorldScreen.lIlllIIlllIllI[17]], new Object[GuiCustomizeWorldScreen.lIlllIIlllIllI[0]]), (boolean)(GuiCustomizeWorldScreen.lIlllIIlllIllI[0] != 0), this, 1.0f, 6000.0f, this.field_175336_F.coordinateScale);
        array3[GuiCustomizeWorldScreen.lIlllIIlllIllI[20]] = new GuiPageButtonList.GuiSlideEntry(GuiCustomizeWorldScreen.lIlllIIlllIllI[183], I18n.format(GuiCustomizeWorldScreen.lIlllIIlIIllII[GuiCustomizeWorldScreen.lIlllIIlllIllI[184]], new Object[GuiCustomizeWorldScreen.lIlllIIlllIllI[0]]), (boolean)(GuiCustomizeWorldScreen.lIlllIIlllIllI[0] != 0), this, 1.0f, 6000.0f, this.field_175336_F.heightScale);
        array3[GuiCustomizeWorldScreen.lIlllIIlllIllI[23]] = new GuiPageButtonList.GuiSlideEntry(GuiCustomizeWorldScreen.lIlllIIlllIllI[185], I18n.format(GuiCustomizeWorldScreen.lIlllIIlIIllII[GuiCustomizeWorldScreen.lIlllIIlllIllI[186]], new Object[GuiCustomizeWorldScreen.lIlllIIlllIllI[0]]), (boolean)(GuiCustomizeWorldScreen.lIlllIIlllIllI[0] != 0), this, 0.01f, 50.0f, this.field_175336_F.stretchY);
        array3[GuiCustomizeWorldScreen.lIlllIIlllIllI[28]] = new GuiPageButtonList.GuiSlideEntry(GuiCustomizeWorldScreen.lIlllIIlllIllI[187], I18n.format(GuiCustomizeWorldScreen.lIlllIIlIIllII[GuiCustomizeWorldScreen.lIlllIIlllIllI[188]], new Object[GuiCustomizeWorldScreen.lIlllIIlllIllI[0]]), (boolean)(GuiCustomizeWorldScreen.lIlllIIlllIllI[0] != 0), this, 1.0f, 5000.0f, this.field_175336_F.upperLimitScale);
        array3[GuiCustomizeWorldScreen.lIlllIIlllIllI[30]] = new GuiPageButtonList.GuiSlideEntry(GuiCustomizeWorldScreen.lIlllIIlllIllI[189], I18n.format(GuiCustomizeWorldScreen.lIlllIIlIIllII[GuiCustomizeWorldScreen.lIlllIIlllIllI[190]], new Object[GuiCustomizeWorldScreen.lIlllIIlllIllI[0]]), (boolean)(GuiCustomizeWorldScreen.lIlllIIlllIllI[0] != 0), this, 1.0f, 5000.0f, this.field_175336_F.lowerLimitScale);
        array3[GuiCustomizeWorldScreen.lIlllIIlllIllI[32]] = new GuiPageButtonList.GuiSlideEntry(GuiCustomizeWorldScreen.lIlllIIlllIllI[191], I18n.format(GuiCustomizeWorldScreen.lIlllIIlIIllII[GuiCustomizeWorldScreen.lIlllIIlllIllI[192]], new Object[GuiCustomizeWorldScreen.lIlllIIlllIllI[0]]), (boolean)(GuiCustomizeWorldScreen.lIlllIIlllIllI[0] != 0), this, 1.0f, 20.0f, this.field_175336_F.biomeDepthWeight);
        array3[GuiCustomizeWorldScreen.lIlllIIlllIllI[34]] = new GuiPageButtonList.GuiSlideEntry(GuiCustomizeWorldScreen.lIlllIIlllIllI[193], I18n.format(GuiCustomizeWorldScreen.lIlllIIlIIllII[GuiCustomizeWorldScreen.lIlllIIlllIllI[22]], new Object[GuiCustomizeWorldScreen.lIlllIIlllIllI[0]]), (boolean)(GuiCustomizeWorldScreen.lIlllIIlllIllI[0] != 0), this, 0.0f, 20.0f, this.field_175336_F.biomeDepthOffset);
        array3[GuiCustomizeWorldScreen.lIlllIIlllIllI[36]] = new GuiPageButtonList.GuiSlideEntry(GuiCustomizeWorldScreen.lIlllIIlllIllI[194], I18n.format(GuiCustomizeWorldScreen.lIlllIIlIIllII[GuiCustomizeWorldScreen.lIlllIIlllIllI[195]], new Object[GuiCustomizeWorldScreen.lIlllIIlllIllI[0]]), (boolean)(GuiCustomizeWorldScreen.lIlllIIlllIllI[0] != 0), this, 1.0f, 20.0f, this.field_175336_F.biomeScaleWeight);
        array3[GuiCustomizeWorldScreen.lIlllIIlllIllI[38]] = new GuiPageButtonList.GuiSlideEntry(GuiCustomizeWorldScreen.lIlllIIlllIllI[196], I18n.format(GuiCustomizeWorldScreen.lIlllIIlIIllII[GuiCustomizeWorldScreen.lIlllIIlllIllI[10]], new Object[GuiCustomizeWorldScreen.lIlllIIlllIllI[0]]), (boolean)(GuiCustomizeWorldScreen.lIlllIIlllIllI[0] != 0), this, 0.0f, 20.0f, this.field_175336_F.biomeScaleOffset);
        final GuiPageButtonList.GuiListEntry[] llllllllllllIlllllIIlIIIIlIlIllI = array3;
        final GuiPageButtonList.GuiListEntry[] array4 = new GuiPageButtonList.GuiListEntry[GuiCustomizeWorldScreen.lIlllIIlllIllI[70]];
        array4[GuiCustomizeWorldScreen.lIlllIIlllIllI[0]] = new GuiPageButtonList.GuiLabelEntry(GuiCustomizeWorldScreen.lIlllIIlllIllI[197], String.valueOf(new StringBuilder(String.valueOf(I18n.format(GuiCustomizeWorldScreen.lIlllIIlIIllII[GuiCustomizeWorldScreen.lIlllIIlllIllI[171]], new Object[GuiCustomizeWorldScreen.lIlllIIlllIllI[0]]))).append(GuiCustomizeWorldScreen.lIlllIIlIIllII[GuiCustomizeWorldScreen.lIlllIIlllIllI[173]])), (boolean)(GuiCustomizeWorldScreen.lIlllIIlllIllI[0] != 0));
        final int n = GuiCustomizeWorldScreen.lIlllIIlllIllI[1];
        final int llllllllllllIlIllIlIIIIIlllIIlII = GuiCustomizeWorldScreen.lIlllIIlllIllI[198];
        final String format = GuiCustomizeWorldScreen.lIlllIIlIIllII[GuiCustomizeWorldScreen.lIlllIIlllIllI[175]];
        final Object[] args = new Object[GuiCustomizeWorldScreen.lIlllIIlllIllI[1]];
        args[GuiCustomizeWorldScreen.lIlllIIlllIllI[0]] = this.field_175336_F.mainNoiseScaleX;
        array4[n] = new GuiPageButtonList.EditBoxEntry(llllllllllllIlIllIlIIIIIlllIIlII, String.format(format, args), (boolean)(GuiCustomizeWorldScreen.lIlllIIlllIllI[0] != 0), this.field_175332_D);
        array4[GuiCustomizeWorldScreen.lIlllIIlllIllI[2]] = new GuiPageButtonList.GuiLabelEntry(GuiCustomizeWorldScreen.lIlllIIlllIllI[199], String.valueOf(new StringBuilder(String.valueOf(I18n.format(GuiCustomizeWorldScreen.lIlllIIlIIllII[GuiCustomizeWorldScreen.lIlllIIlllIllI[177]], new Object[GuiCustomizeWorldScreen.lIlllIIlllIllI[0]]))).append(GuiCustomizeWorldScreen.lIlllIIlIIllII[GuiCustomizeWorldScreen.lIlllIIlllIllI[179]])), (boolean)(GuiCustomizeWorldScreen.lIlllIIlllIllI[0] != 0));
        final int n2 = GuiCustomizeWorldScreen.lIlllIIlllIllI[4];
        final int llllllllllllIlIllIlIIIIIlllIIlII2 = GuiCustomizeWorldScreen.lIlllIIlllIllI[200];
        final String format2 = GuiCustomizeWorldScreen.lIlllIIlIIllII[GuiCustomizeWorldScreen.lIlllIIlllIllI[180]];
        final Object[] args2 = new Object[GuiCustomizeWorldScreen.lIlllIIlllIllI[1]];
        args2[GuiCustomizeWorldScreen.lIlllIIlllIllI[0]] = this.field_175336_F.mainNoiseScaleY;
        array4[n2] = new GuiPageButtonList.EditBoxEntry(llllllllllllIlIllIlIIIIIlllIIlII2, String.format(format2, args2), (boolean)(GuiCustomizeWorldScreen.lIlllIIlllIllI[0] != 0), this.field_175332_D);
        array4[GuiCustomizeWorldScreen.lIlllIIlllIllI[3]] = new GuiPageButtonList.GuiLabelEntry(GuiCustomizeWorldScreen.lIlllIIlllIllI[201], String.valueOf(new StringBuilder(String.valueOf(I18n.format(GuiCustomizeWorldScreen.lIlllIIlIIllII[GuiCustomizeWorldScreen.lIlllIIlllIllI[182]], new Object[GuiCustomizeWorldScreen.lIlllIIlllIllI[0]]))).append(GuiCustomizeWorldScreen.lIlllIIlIIllII[GuiCustomizeWorldScreen.lIlllIIlllIllI[183]])), (boolean)(GuiCustomizeWorldScreen.lIlllIIlllIllI[0] != 0));
        final int n3 = GuiCustomizeWorldScreen.lIlllIIlllIllI[7];
        final int llllllllllllIlIllIlIIIIIlllIIlII3 = GuiCustomizeWorldScreen.lIlllIIlllIllI[202];
        final String format3 = GuiCustomizeWorldScreen.lIlllIIlIIllII[GuiCustomizeWorldScreen.lIlllIIlllIllI[185]];
        final Object[] args3 = new Object[GuiCustomizeWorldScreen.lIlllIIlllIllI[1]];
        args3[GuiCustomizeWorldScreen.lIlllIIlllIllI[0]] = this.field_175336_F.mainNoiseScaleZ;
        array4[n3] = new GuiPageButtonList.EditBoxEntry(llllllllllllIlIllIlIIIIIlllIIlII3, String.format(format3, args3), (boolean)(GuiCustomizeWorldScreen.lIlllIIlllIllI[0] != 0), this.field_175332_D);
        array4[GuiCustomizeWorldScreen.lIlllIIlllIllI[15]] = new GuiPageButtonList.GuiLabelEntry(GuiCustomizeWorldScreen.lIlllIIlllIllI[203], String.valueOf(new StringBuilder(String.valueOf(I18n.format(GuiCustomizeWorldScreen.lIlllIIlIIllII[GuiCustomizeWorldScreen.lIlllIIlllIllI[187]], new Object[GuiCustomizeWorldScreen.lIlllIIlllIllI[0]]))).append(GuiCustomizeWorldScreen.lIlllIIlIIllII[GuiCustomizeWorldScreen.lIlllIIlllIllI[189]])), (boolean)(GuiCustomizeWorldScreen.lIlllIIlllIllI[0] != 0));
        final int n4 = GuiCustomizeWorldScreen.lIlllIIlllIllI[18];
        final int llllllllllllIlIllIlIIIIIlllIIlII4 = GuiCustomizeWorldScreen.lIlllIIlllIllI[204];
        final String format4 = GuiCustomizeWorldScreen.lIlllIIlIIllII[GuiCustomizeWorldScreen.lIlllIIlllIllI[191]];
        final Object[] args4 = new Object[GuiCustomizeWorldScreen.lIlllIIlllIllI[1]];
        args4[GuiCustomizeWorldScreen.lIlllIIlllIllI[0]] = this.field_175336_F.depthNoiseScaleX;
        array4[n4] = new GuiPageButtonList.EditBoxEntry(llllllllllllIlIllIlIIIIIlllIIlII4, String.format(format4, args4), (boolean)(GuiCustomizeWorldScreen.lIlllIIlllIllI[0] != 0), this.field_175332_D);
        array4[GuiCustomizeWorldScreen.lIlllIIlllIllI[20]] = new GuiPageButtonList.GuiLabelEntry(GuiCustomizeWorldScreen.lIlllIIlllIllI[205], String.valueOf(new StringBuilder(String.valueOf(I18n.format(GuiCustomizeWorldScreen.lIlllIIlIIllII[GuiCustomizeWorldScreen.lIlllIIlllIllI[193]], new Object[GuiCustomizeWorldScreen.lIlllIIlllIllI[0]]))).append(GuiCustomizeWorldScreen.lIlllIIlIIllII[GuiCustomizeWorldScreen.lIlllIIlllIllI[194]])), (boolean)(GuiCustomizeWorldScreen.lIlllIIlllIllI[0] != 0));
        final int n5 = GuiCustomizeWorldScreen.lIlllIIlllIllI[23];
        final int llllllllllllIlIllIlIIIIIlllIIlII5 = GuiCustomizeWorldScreen.lIlllIIlllIllI[206];
        final String format5 = GuiCustomizeWorldScreen.lIlllIIlIIllII[GuiCustomizeWorldScreen.lIlllIIlllIllI[196]];
        final Object[] args5 = new Object[GuiCustomizeWorldScreen.lIlllIIlllIllI[1]];
        args5[GuiCustomizeWorldScreen.lIlllIIlllIllI[0]] = this.field_175336_F.depthNoiseScaleZ;
        array4[n5] = new GuiPageButtonList.EditBoxEntry(llllllllllllIlIllIlIIIIIlllIIlII5, String.format(format5, args5), (boolean)(GuiCustomizeWorldScreen.lIlllIIlllIllI[0] != 0), this.field_175332_D);
        array4[GuiCustomizeWorldScreen.lIlllIIlllIllI[28]] = new GuiPageButtonList.GuiLabelEntry(GuiCustomizeWorldScreen.lIlllIIlllIllI[207], String.valueOf(new StringBuilder(String.valueOf(I18n.format(GuiCustomizeWorldScreen.lIlllIIlIIllII[GuiCustomizeWorldScreen.lIlllIIlllIllI[208]], new Object[GuiCustomizeWorldScreen.lIlllIIlllIllI[0]]))).append(GuiCustomizeWorldScreen.lIlllIIlIIllII[GuiCustomizeWorldScreen.lIlllIIlllIllI[209]])), (boolean)(GuiCustomizeWorldScreen.lIlllIIlllIllI[0] != 0));
        final int n6 = GuiCustomizeWorldScreen.lIlllIIlllIllI[30];
        final int llllllllllllIlIllIlIIIIIlllIIlII6 = GuiCustomizeWorldScreen.lIlllIIlllIllI[210];
        final String format6 = GuiCustomizeWorldScreen.lIlllIIlIIllII[GuiCustomizeWorldScreen.lIlllIIlllIllI[211]];
        final Object[] args6 = new Object[GuiCustomizeWorldScreen.lIlllIIlllIllI[1]];
        args6[GuiCustomizeWorldScreen.lIlllIIlllIllI[0]] = this.field_175336_F.depthNoiseScaleExponent;
        array4[n6] = new GuiPageButtonList.EditBoxEntry(llllllllllllIlIllIlIIIIIlllIIlII6, String.format(format6, args6), (boolean)(GuiCustomizeWorldScreen.lIlllIIlllIllI[0] != 0), this.field_175332_D);
        array4[GuiCustomizeWorldScreen.lIlllIIlllIllI[32]] = new GuiPageButtonList.GuiLabelEntry(GuiCustomizeWorldScreen.lIlllIIlllIllI[212], String.valueOf(new StringBuilder(String.valueOf(I18n.format(GuiCustomizeWorldScreen.lIlllIIlIIllII[GuiCustomizeWorldScreen.lIlllIIlllIllI[213]], new Object[GuiCustomizeWorldScreen.lIlllIIlllIllI[0]]))).append(GuiCustomizeWorldScreen.lIlllIIlIIllII[GuiCustomizeWorldScreen.lIlllIIlllIllI[214]])), (boolean)(GuiCustomizeWorldScreen.lIlllIIlllIllI[0] != 0));
        final int n7 = GuiCustomizeWorldScreen.lIlllIIlllIllI[34];
        final int llllllllllllIlIllIlIIIIIlllIIlII7 = GuiCustomizeWorldScreen.lIlllIIlllIllI[215];
        final String format7 = GuiCustomizeWorldScreen.lIlllIIlIIllII[GuiCustomizeWorldScreen.lIlllIIlllIllI[216]];
        final Object[] args7 = new Object[GuiCustomizeWorldScreen.lIlllIIlllIllI[1]];
        args7[GuiCustomizeWorldScreen.lIlllIIlllIllI[0]] = this.field_175336_F.baseSize;
        array4[n7] = new GuiPageButtonList.EditBoxEntry(llllllllllllIlIllIlIIIIIlllIIlII7, String.format(format7, args7), (boolean)(GuiCustomizeWorldScreen.lIlllIIlllIllI[0] != 0), this.field_175332_D);
        array4[GuiCustomizeWorldScreen.lIlllIIlllIllI[36]] = new GuiPageButtonList.GuiLabelEntry(GuiCustomizeWorldScreen.lIlllIIlllIllI[217], String.valueOf(new StringBuilder(String.valueOf(I18n.format(GuiCustomizeWorldScreen.lIlllIIlIIllII[GuiCustomizeWorldScreen.lIlllIIlllIllI[218]], new Object[GuiCustomizeWorldScreen.lIlllIIlllIllI[0]]))).append(GuiCustomizeWorldScreen.lIlllIIlIIllII[GuiCustomizeWorldScreen.lIlllIIlllIllI[219]])), (boolean)(GuiCustomizeWorldScreen.lIlllIIlllIllI[0] != 0));
        final int n8 = GuiCustomizeWorldScreen.lIlllIIlllIllI[38];
        final int llllllllllllIlIllIlIIIIIlllIIlII8 = GuiCustomizeWorldScreen.lIlllIIlllIllI[220];
        final String format8 = GuiCustomizeWorldScreen.lIlllIIlIIllII[GuiCustomizeWorldScreen.lIlllIIlllIllI[221]];
        final Object[] args8 = new Object[GuiCustomizeWorldScreen.lIlllIIlllIllI[1]];
        args8[GuiCustomizeWorldScreen.lIlllIIlllIllI[0]] = this.field_175336_F.coordinateScale;
        array4[n8] = new GuiPageButtonList.EditBoxEntry(llllllllllllIlIllIlIIIIIlllIIlII8, String.format(format8, args8), (boolean)(GuiCustomizeWorldScreen.lIlllIIlllIllI[0] != 0), this.field_175332_D);
        array4[GuiCustomizeWorldScreen.lIlllIIlllIllI[40]] = new GuiPageButtonList.GuiLabelEntry(GuiCustomizeWorldScreen.lIlllIIlllIllI[222], String.valueOf(new StringBuilder(String.valueOf(I18n.format(GuiCustomizeWorldScreen.lIlllIIlIIllII[GuiCustomizeWorldScreen.lIlllIIlllIllI[223]], new Object[GuiCustomizeWorldScreen.lIlllIIlllIllI[0]]))).append(GuiCustomizeWorldScreen.lIlllIIlIIllII[GuiCustomizeWorldScreen.lIlllIIlllIllI[224]])), (boolean)(GuiCustomizeWorldScreen.lIlllIIlllIllI[0] != 0));
        final int n9 = GuiCustomizeWorldScreen.lIlllIIlllIllI[42];
        final int llllllllllllIlIllIlIIIIIlllIIlII9 = GuiCustomizeWorldScreen.lIlllIIlllIllI[225];
        final String format9 = GuiCustomizeWorldScreen.lIlllIIlIIllII[GuiCustomizeWorldScreen.lIlllIIlllIllI[226]];
        final Object[] args9 = new Object[GuiCustomizeWorldScreen.lIlllIIlllIllI[1]];
        args9[GuiCustomizeWorldScreen.lIlllIIlllIllI[0]] = this.field_175336_F.heightScale;
        array4[n9] = new GuiPageButtonList.EditBoxEntry(llllllllllllIlIllIlIIIIIlllIIlII9, String.format(format9, args9), (boolean)(GuiCustomizeWorldScreen.lIlllIIlllIllI[0] != 0), this.field_175332_D);
        array4[GuiCustomizeWorldScreen.lIlllIIlllIllI[31]] = new GuiPageButtonList.GuiLabelEntry(GuiCustomizeWorldScreen.lIlllIIlllIllI[227], String.valueOf(new StringBuilder(String.valueOf(I18n.format(GuiCustomizeWorldScreen.lIlllIIlIIllII[GuiCustomizeWorldScreen.lIlllIIlllIllI[228]], new Object[GuiCustomizeWorldScreen.lIlllIIlllIllI[0]]))).append(GuiCustomizeWorldScreen.lIlllIIlIIllII[GuiCustomizeWorldScreen.lIlllIIlllIllI[229]])), (boolean)(GuiCustomizeWorldScreen.lIlllIIlllIllI[0] != 0));
        final int n10 = GuiCustomizeWorldScreen.lIlllIIlllIllI[45];
        final int llllllllllllIlIllIlIIIIIlllIIlII10 = GuiCustomizeWorldScreen.lIlllIIlllIllI[230];
        final String format10 = GuiCustomizeWorldScreen.lIlllIIlIIllII[GuiCustomizeWorldScreen.lIlllIIlllIllI[231]];
        final Object[] args10 = new Object[GuiCustomizeWorldScreen.lIlllIIlllIllI[1]];
        args10[GuiCustomizeWorldScreen.lIlllIIlllIllI[0]] = this.field_175336_F.stretchY;
        array4[n10] = new GuiPageButtonList.EditBoxEntry(llllllllllllIlIllIlIIIIIlllIIlII10, String.format(format10, args10), (boolean)(GuiCustomizeWorldScreen.lIlllIIlllIllI[0] != 0), this.field_175332_D);
        array4[GuiCustomizeWorldScreen.lIlllIIlllIllI[6]] = new GuiPageButtonList.GuiLabelEntry(GuiCustomizeWorldScreen.lIlllIIlllIllI[232], String.valueOf(new StringBuilder(String.valueOf(I18n.format(GuiCustomizeWorldScreen.lIlllIIlIIllII[GuiCustomizeWorldScreen.lIlllIIlllIllI[233]], new Object[GuiCustomizeWorldScreen.lIlllIIlllIllI[0]]))).append(GuiCustomizeWorldScreen.lIlllIIlIIllII[GuiCustomizeWorldScreen.lIlllIIlllIllI[198]])), (boolean)(GuiCustomizeWorldScreen.lIlllIIlllIllI[0] != 0));
        final int n11 = GuiCustomizeWorldScreen.lIlllIIlllIllI[48];
        final int llllllllllllIlIllIlIIIIIlllIIlII11 = GuiCustomizeWorldScreen.lIlllIIlllIllI[234];
        final String format11 = GuiCustomizeWorldScreen.lIlllIIlIIllII[GuiCustomizeWorldScreen.lIlllIIlllIllI[200]];
        final Object[] args11 = new Object[GuiCustomizeWorldScreen.lIlllIIlllIllI[1]];
        args11[GuiCustomizeWorldScreen.lIlllIIlllIllI[0]] = this.field_175336_F.upperLimitScale;
        array4[n11] = new GuiPageButtonList.EditBoxEntry(llllllllllllIlIllIlIIIIIlllIIlII11, String.format(format11, args11), (boolean)(GuiCustomizeWorldScreen.lIlllIIlllIllI[0] != 0), this.field_175332_D);
        array4[GuiCustomizeWorldScreen.lIlllIIlllIllI[50]] = new GuiPageButtonList.GuiLabelEntry(GuiCustomizeWorldScreen.lIlllIIlllIllI[235], String.valueOf(new StringBuilder(String.valueOf(I18n.format(GuiCustomizeWorldScreen.lIlllIIlIIllII[GuiCustomizeWorldScreen.lIlllIIlllIllI[202]], new Object[GuiCustomizeWorldScreen.lIlllIIlllIllI[0]]))).append(GuiCustomizeWorldScreen.lIlllIIlIIllII[GuiCustomizeWorldScreen.lIlllIIlllIllI[204]])), (boolean)(GuiCustomizeWorldScreen.lIlllIIlllIllI[0] != 0));
        final int n12 = GuiCustomizeWorldScreen.lIlllIIlllIllI[52];
        final int llllllllllllIlIllIlIIIIIlllIIlII12 = GuiCustomizeWorldScreen.lIlllIIlllIllI[236];
        final String format12 = GuiCustomizeWorldScreen.lIlllIIlIIllII[GuiCustomizeWorldScreen.lIlllIIlllIllI[206]];
        final Object[] args12 = new Object[GuiCustomizeWorldScreen.lIlllIIlllIllI[1]];
        args12[GuiCustomizeWorldScreen.lIlllIIlllIllI[0]] = this.field_175336_F.lowerLimitScale;
        array4[n12] = new GuiPageButtonList.EditBoxEntry(llllllllllllIlIllIlIIIIIlllIIlII12, String.format(format12, args12), (boolean)(GuiCustomizeWorldScreen.lIlllIIlllIllI[0] != 0), this.field_175332_D);
        array4[GuiCustomizeWorldScreen.lIlllIIlllIllI[54]] = new GuiPageButtonList.GuiLabelEntry(GuiCustomizeWorldScreen.lIlllIIlllIllI[237], String.valueOf(new StringBuilder(String.valueOf(I18n.format(GuiCustomizeWorldScreen.lIlllIIlIIllII[GuiCustomizeWorldScreen.lIlllIIlllIllI[210]], new Object[GuiCustomizeWorldScreen.lIlllIIlllIllI[0]]))).append(GuiCustomizeWorldScreen.lIlllIIlIIllII[GuiCustomizeWorldScreen.lIlllIIlllIllI[215]])), (boolean)(GuiCustomizeWorldScreen.lIlllIIlllIllI[0] != 0));
        final int n13 = GuiCustomizeWorldScreen.lIlllIIlllIllI[56];
        final int llllllllllllIlIllIlIIIIIlllIIlII13 = GuiCustomizeWorldScreen.lIlllIIlllIllI[238];
        final String format13 = GuiCustomizeWorldScreen.lIlllIIlIIllII[GuiCustomizeWorldScreen.lIlllIIlllIllI[220]];
        final Object[] args13 = new Object[GuiCustomizeWorldScreen.lIlllIIlllIllI[1]];
        args13[GuiCustomizeWorldScreen.lIlllIIlllIllI[0]] = this.field_175336_F.biomeDepthWeight;
        array4[n13] = new GuiPageButtonList.EditBoxEntry(llllllllllllIlIllIlIIIIIlllIIlII13, String.format(format13, args13), (boolean)(GuiCustomizeWorldScreen.lIlllIIlllIllI[0] != 0), this.field_175332_D);
        array4[GuiCustomizeWorldScreen.lIlllIIlllIllI[58]] = new GuiPageButtonList.GuiLabelEntry(GuiCustomizeWorldScreen.lIlllIIlllIllI[239], String.valueOf(new StringBuilder(String.valueOf(I18n.format(GuiCustomizeWorldScreen.lIlllIIlIIllII[GuiCustomizeWorldScreen.lIlllIIlllIllI[225]], new Object[GuiCustomizeWorldScreen.lIlllIIlllIllI[0]]))).append(GuiCustomizeWorldScreen.lIlllIIlIIllII[GuiCustomizeWorldScreen.lIlllIIlllIllI[230]])), (boolean)(GuiCustomizeWorldScreen.lIlllIIlllIllI[0] != 0));
        final int n14 = GuiCustomizeWorldScreen.lIlllIIlllIllI[13];
        final int llllllllllllIlIllIlIIIIIlllIIlII14 = GuiCustomizeWorldScreen.lIlllIIlllIllI[240];
        final String format14 = GuiCustomizeWorldScreen.lIlllIIlIIllII[GuiCustomizeWorldScreen.lIlllIIlllIllI[234]];
        final Object[] args14 = new Object[GuiCustomizeWorldScreen.lIlllIIlllIllI[1]];
        args14[GuiCustomizeWorldScreen.lIlllIIlllIllI[0]] = this.field_175336_F.biomeDepthOffset;
        array4[n14] = new GuiPageButtonList.EditBoxEntry(llllllllllllIlIllIlIIIIIlllIIlII14, String.format(format14, args14), (boolean)(GuiCustomizeWorldScreen.lIlllIIlllIllI[0] != 0), this.field_175332_D);
        array4[GuiCustomizeWorldScreen.lIlllIIlllIllI[61]] = new GuiPageButtonList.GuiLabelEntry(GuiCustomizeWorldScreen.lIlllIIlllIllI[241], String.valueOf(new StringBuilder(String.valueOf(I18n.format(GuiCustomizeWorldScreen.lIlllIIlIIllII[GuiCustomizeWorldScreen.lIlllIIlllIllI[236]], new Object[GuiCustomizeWorldScreen.lIlllIIlllIllI[0]]))).append(GuiCustomizeWorldScreen.lIlllIIlIIllII[GuiCustomizeWorldScreen.lIlllIIlllIllI[238]])), (boolean)(GuiCustomizeWorldScreen.lIlllIIlllIllI[0] != 0));
        final int n15 = GuiCustomizeWorldScreen.lIlllIIlllIllI[63];
        final int llllllllllllIlIllIlIIIIIlllIIlII15 = GuiCustomizeWorldScreen.lIlllIIlllIllI[242];
        final String format15 = GuiCustomizeWorldScreen.lIlllIIlIIllII[GuiCustomizeWorldScreen.lIlllIIlllIllI[240]];
        final Object[] args15 = new Object[GuiCustomizeWorldScreen.lIlllIIlllIllI[1]];
        args15[GuiCustomizeWorldScreen.lIlllIIlllIllI[0]] = this.field_175336_F.biomeScaleWeight;
        array4[n15] = new GuiPageButtonList.EditBoxEntry(llllllllllllIlIllIlIIIIIlllIIlII15, String.format(format15, args15), (boolean)(GuiCustomizeWorldScreen.lIlllIIlllIllI[0] != 0), this.field_175332_D);
        array4[GuiCustomizeWorldScreen.lIlllIIlllIllI[66]] = new GuiPageButtonList.GuiLabelEntry(GuiCustomizeWorldScreen.lIlllIIlllIllI[243], String.valueOf(new StringBuilder(String.valueOf(I18n.format(GuiCustomizeWorldScreen.lIlllIIlIIllII[GuiCustomizeWorldScreen.lIlllIIlllIllI[242]], new Object[GuiCustomizeWorldScreen.lIlllIIlllIllI[0]]))).append(GuiCustomizeWorldScreen.lIlllIIlIIllII[GuiCustomizeWorldScreen.lIlllIIlllIllI[244]])), (boolean)(GuiCustomizeWorldScreen.lIlllIIlllIllI[0] != 0));
        final int n16 = GuiCustomizeWorldScreen.lIlllIIlllIllI[68];
        final int llllllllllllIlIllIlIIIIIlllIIlII16 = GuiCustomizeWorldScreen.lIlllIIlllIllI[244];
        final String format16 = GuiCustomizeWorldScreen.lIlllIIlIIllII[GuiCustomizeWorldScreen.lIlllIIlllIllI[33]];
        final Object[] args16 = new Object[GuiCustomizeWorldScreen.lIlllIIlllIllI[1]];
        args16[GuiCustomizeWorldScreen.lIlllIIlllIllI[0]] = this.field_175336_F.biomeScaleOffset;
        array4[n16] = new GuiPageButtonList.EditBoxEntry(llllllllllllIlIllIlIIIIIlllIIlII16, String.format(format16, args16), (boolean)(GuiCustomizeWorldScreen.lIlllIIlllIllI[0] != 0), this.field_175332_D);
        final GuiPageButtonList.GuiListEntry[] llllllllllllIlllllIIlIIIIlIlIlIl = array4;
        final Minecraft mc = this.mc;
        final int width = this.width;
        final int height = this.height;
        final int lllllllllllllIIIllIIlIIIIlIlIIlI = GuiCustomizeWorldScreen.lIlllIIlllIllI[70];
        final int lllllllllllllIIIllIIlIIIIlIIlIII = this.height - GuiCustomizeWorldScreen.lIlllIIlllIllI[70];
        final int lllllllllllllIIIllIIlIIIIlIlIIII = GuiCustomizeWorldScreen.lIlllIIlllIllI[56];
        final GuiPageButtonList.GuiListEntry[][] lllllllllllllIIIllIIlIIIIlIIIlIl = new GuiPageButtonList.GuiListEntry[GuiCustomizeWorldScreen.lIlllIIlllIllI[3]][];
        lllllllllllllIIIllIIlIIIIlIIIlIl[GuiCustomizeWorldScreen.lIlllIIlllIllI[0]] = llllllllllllIlllllIIlIIIIlIllIII;
        lllllllllllllIIIllIIlIIIIlIIIlIl[GuiCustomizeWorldScreen.lIlllIIlllIllI[1]] = llllllllllllIlllllIIlIIIIlIlIlll;
        lllllllllllllIIIllIIlIIIIlIIIlIl[GuiCustomizeWorldScreen.lIlllIIlllIllI[2]] = llllllllllllIlllllIIlIIIIlIlIllI;
        lllllllllllllIIIllIIlIIIIlIIIlIl[GuiCustomizeWorldScreen.lIlllIIlllIllI[4]] = llllllllllllIlllllIIlIIIIlIlIlIl;
        this.field_175349_r = new GuiPageButtonList(mc, width, height, lllllllllllllIIIllIIlIIIIlIlIIlI, lllllllllllllIIIllIIlIIIIlIIlIII, lllllllllllllIIIllIIlIIIIlIlIIII, this, lllllllllllllIIIllIIlIIIIlIIIlIl);
        int llllllllllllIlllllIIlIIIIlIlIlII = GuiCustomizeWorldScreen.lIlllIIlllIllI[0];
        "".length();
        if (((0x5C ^ 0x72) & ~(0x85 ^ 0xAB)) != 0x0) {
            return;
        }
        while (!lIIIIIlIIlIIlIll(llllllllllllIlllllIIlIIIIlIlIlII, GuiCustomizeWorldScreen.lIlllIIlllIllI[3])) {
            this.field_175342_h[llllllllllllIlllllIIlIIIIlIlIlII] = I18n.format(String.valueOf(new StringBuilder(GuiCustomizeWorldScreen.lIlllIIlIIllII[GuiCustomizeWorldScreen.lIlllIIlllIllI[46]]).append(llllllllllllIlllllIIlIIIIlIlIlII)), new Object[GuiCustomizeWorldScreen.lIlllIIlllIllI[0]]);
            ++llllllllllllIlllllIIlIIIIlIlIlII;
        }
        this.func_175328_i();
    }
    
    private static void lIIIIIIllIlllllI() {
        (lIlllIIlIIllII = new String[GuiCustomizeWorldScreen.lIlllIIlllIllI[60]])[GuiCustomizeWorldScreen.lIlllIIlllIllI[0]] = lIIIIIIllIlllIlI("G0fBOLVtIUVaTsXTeVu+xMnWbsUxruOSovDZXrs8kJo=", "HZhTj");
        GuiCustomizeWorldScreen.lIlllIIlIIllII[GuiCustomizeWorldScreen.lIlllIIlllIllI[1]] = lIIIIIIllIlllIlI("ii8UbYZWQ5FcZbV3sJhoDQ==", "WWGcM");
        GuiCustomizeWorldScreen.lIlllIIlIIllII[GuiCustomizeWorldScreen.lIlllIIlllIllI[2]] = lIIIIIIllIlllIll("BRU/CwZnJykWES4aKxE=", "GtLbe");
        GuiCustomizeWorldScreen.lIlllIIlIIllII[GuiCustomizeWorldScreen.lIlllIIlllIllI[4]] = lIIIIIIllIlllIll("LCoEMzktKV45IzAuHzc/OT8kMyIvPw==", "CZpZV");
        GuiCustomizeWorldScreen.lIlllIIlIIllII[GuiCustomizeWorldScreen.lIlllIIlllIllI[3]] = lIIIIIIllIlllIll("BDUsJR8CECY2BwNpKjEYEygkLRECaSoxGBMoJGobFSI/", "gGIDk");
        GuiCustomizeWorldScreen.lIlllIIlIIllII[GuiCustomizeWorldScreen.lIlllIIlllIllI[7]] = lIIIIIIllIllllII("sYAECn7baqaJ4VpcKZZuZORd24PEWyvsDhn6dkKynO+67l+NZtKVww==", "YKZwH");
        GuiCustomizeWorldScreen.lIlllIIlIIllII[GuiCustomizeWorldScreen.lIlllIIlllIllI[15]] = lIIIIIIllIlllIll("NyQ2EAcxATwDHzB4MAQAIDk+GAkxeDAEACA5Pl8XMTAyBB8gJQ==", "TVSqs");
        GuiCustomizeWorldScreen.lIlllIIlIIllII[GuiCustomizeWorldScreen.lIlllIIlllIllI[18]] = lIIIIIIllIlllIlI("i6OK+4G1VYQEwGG0byCFNsqMnaVSJTSR0+z7hFl7S73iM/l02+0vQg==", "giTlg");
        GuiCustomizeWorldScreen.lIlllIIlIIllII[GuiCustomizeWorldScreen.lIlllIIlllIllI[20]] = lIIIIIIllIlllIll("AgcVGB4EIh8LBgVbEwwZFRodEBAEWxMMGRUaHVcaExADHB4S", "aupyj");
        GuiCustomizeWorldScreen.lIlllIIlIIllII[GuiCustomizeWorldScreen.lIlllIIlllIllI[23]] = lIIIIIIllIlllIlI("qxlmGMXxX9VM2BSsBrAHqg==", "WovdN");
        GuiCustomizeWorldScreen.lIlllIIlIIllII[GuiCustomizeWorldScreen.lIlllIIlllIllI[28]] = lIIIIIIllIlllIlI("zxlwniYRZYA=", "kBtqD");
        GuiCustomizeWorldScreen.lIlllIIlIIllII[GuiCustomizeWorldScreen.lIlllIIlllIllI[30]] = lIIIIIIllIlllIlI("cpQABKRAv/g=", "GbBye");
        GuiCustomizeWorldScreen.lIlllIIlIIllII[GuiCustomizeWorldScreen.lIlllIIlllIllI[32]] = lIIIIIIllIllllII("lS5p3xJgEttj/gIAWP7WdLKwd8ZvpjHos1IJH7HYCEJlFizT7GSG3Q==", "chjmb");
        GuiCustomizeWorldScreen.lIlllIIlIIllII[GuiCustomizeWorldScreen.lIlllIIlllIllI[34]] = lIIIIIIllIllllII("4cNVbnQ2HLsXQ3iN63ixiV1VvkfxNtwiBG/d4YA/xbGgdDgjDsCJiA==", "JLIxA");
        GuiCustomizeWorldScreen.lIlllIIlIIllII[GuiCustomizeWorldScreen.lIlllIIlllIllI[36]] = lIIIIIIllIlllIlI("zZbYD5YqQX2AySpxWafzyEvyTLoDHxrryBFxzdPbmjAtugIqJAwrLL0rQSLOkZhJ", "yJDKB");
        GuiCustomizeWorldScreen.lIlllIIlIIllII[GuiCustomizeWorldScreen.lIlllIIlllIllI[38]] = lIIIIIIllIllllII("5oRNTEryU0Z3DdYN6/I/+jCrKWAPEePITuANR9xBJi3ioj9qtqAM0lwrQKHB3Yiz", "tmrmn");
        GuiCustomizeWorldScreen.lIlllIIlIIllII[GuiCustomizeWorldScreen.lIlllIIlllIllI[40]] = lIIIIIIllIlllIll("LzELJD0pFAE3JShtDTA6OCwDLDMpbQ0wOjgsA2s8PyYjLCcpEAYkLzgw", "LCnEI");
        GuiCustomizeWorldScreen.lIlllIIlIIllII[GuiCustomizeWorldScreen.lIlllIIlllIllI[42]] = lIIIIIIllIlllIll("FCAKBC4SBQAXNhN8DBApAz0CDCASfAwQKQM9AksvBDc7ADcHPgoW", "wRoeZ");
        GuiCustomizeWorldScreen.lIlllIIlIIllII[GuiCustomizeWorldScreen.lIlllIIlllIllI[31]] = lIIIIIIllIlllIll("CRkKEj0PPAABJQ5FDAY6HgQCGjMPRQwGOh4EAl08GQ4iHCcfBgodPRk=", "jkosI");
        GuiCustomizeWorldScreen.lIlllIIlIIllII[GuiCustomizeWorldScreen.lIlllIIlllIllI[45]] = lIIIIIIllIlllIlI("cUPA37gDEPtdIrgopudMudl7b9wcbP5cHJ3jmwwQcp62Lx23GArwrg==", "mWqOg");
        GuiCustomizeWorldScreen.lIlllIIlIIllII[GuiCustomizeWorldScreen.lIlllIIlllIllI[6]] = lIIIIIIllIllllII("Lqy0lDRjDp9HynqDmGnkvlu6lutAygNkzxoQcFDR7yKCt4v81BP5UGSoLs4SIBZw", "EwJDO");
        GuiCustomizeWorldScreen.lIlllIIlIIllII[GuiCustomizeWorldScreen.lIlllIIlllIllI[48]] = lIIIIIIllIllllII("nRtMA+QU/1VLdlHm4sCn/YVIL1bCvsa/tkEp39lrkouWmwxob1VCptOlNQU/OPKj", "iAkBc");
        GuiCustomizeWorldScreen.lIlllIIlIIllII[GuiCustomizeWorldScreen.lIlllIIlllIllI[50]] = lIIIIIIllIlllIll("NzcpMBExEiMjCTBrLyQWICohOB8xay8kFiAqIX8QJyAbMBExNwAwDjE2", "TELQe");
        GuiCustomizeWorldScreen.lIlllIIlIIllII[GuiCustomizeWorldScreen.lIlllIIlllIllI[52]] = lIIIIIIllIlllIlI("KzLhcKHm5KzZVw/husNsJw7MKMKumOP7uT/gskwhInbrZfCosjhxsgJlE3wu85V5", "GITir");
        GuiCustomizeWorldScreen.lIlllIIlIIllII[GuiCustomizeWorldScreen.lIlllIIlllIllI[54]] = lIIIIIIllIlllIll("LAcuCDsqIiQbIytbKBw8OxomADUqWygcPDsaJkc6PBAHCDkuOSoCKjw=", "OuKiO");
        GuiCustomizeWorldScreen.lIlllIIlIIllII[GuiCustomizeWorldScreen.lIlllIIlllIllI[56]] = lIIIIIIllIlllIll("Fx8IBT8ROgIWJxBDDhE4AAIADTERQw4ROAACAEonFRsMKCofCC4MKhoOCA==", "tmmdK");
        GuiCustomizeWorldScreen.lIlllIIlIIllII[GuiCustomizeWorldScreen.lIlllIIlllIllI[58]] = lIIIIIIllIllllII("7al5/0x9IhhqWUyA+LHJI4E9h/zUJ2ZweYsrYyaTNteZfxtdpXJY0fYOI/8Am6Ly", "LLLjC");
        GuiCustomizeWorldScreen.lIlllIIlIIllII[GuiCustomizeWorldScreen.lIlllIIlllIllI[13]] = lIIIIIIllIlllIll("IRANKBAnNQc7CCZMCzwXNg0FIB4nTAs8FzYNBWcCKxoNLSYrDQUs", "BbhId");
        GuiCustomizeWorldScreen.lIlllIIlIIllII[GuiCustomizeWorldScreen.lIlllIIlllIllI[61]] = lIIIIIIllIlllIll("Jh8IKDMgOgI7KyFDDjw0MQIAID0gQw48NDECAGclLAIALBQsFwg=", "EmmIG");
        GuiCustomizeWorldScreen.lIlllIIlIIllII[GuiCustomizeWorldScreen.lIlllIIlllIllI[63]] = lIIIIIIllIllllII("1AFme/JQXNpNIim6rblJbtkHM8ByodmuJno9aEe75AYelyi5+0Maiw==", "bfVmv");
        GuiCustomizeWorldScreen.lIlllIIlIIllII[GuiCustomizeWorldScreen.lIlllIIlllIllI[66]] = lIIIIIIllIlllIll("LBkYJGo8GQY1ajYRGSQ=", "XptAD");
        GuiCustomizeWorldScreen.lIlllIIlIIllII[GuiCustomizeWorldScreen.lIlllIIlllIllI[68]] = lIIIIIIllIlllIlI("t9nJA127n5OkIIiCum5FUJCM79sZTFancs7fH0CePv9pCd+JAnr7EQ==", "GIkYJ");
        GuiCustomizeWorldScreen.lIlllIIlIIllII[GuiCustomizeWorldScreen.lIlllIIlllIllI[70]] = lIIIIIIllIlllIlI("P03z56VSjDUa5tVcuG/qDbMa7diYDfT5FntTlirWtoO/hH9W+FdrhA==", "ZxYjN");
        GuiCustomizeWorldScreen.lIlllIIlIIllII[GuiCustomizeWorldScreen.lIlllIIlllIllI[72]] = lIIIIIIllIllllII("84+RodfTrrcL6Pt97H2znLhu1d02CXNWi5MXcOxs5fEeAJ+oVJtmDw==", "RAkOk");
        GuiCustomizeWorldScreen.lIlllIIlIIllII[GuiCustomizeWorldScreen.lIlllIIlllIllI[74]] = lIIIIIIllIlllIlI("V+p5IrsFYfeJyj+w2HOYyXu8MXMRapXB2kmm6oRzafOhvJFi6LUv6A==", "XKMck");
        GuiCustomizeWorldScreen.lIlllIIlIIllII[GuiCustomizeWorldScreen.lIlllIIlllIllI[76]] = lIIIIIIllIllllII("mEhvatHJH+djaDQfwVDCf5EeZRKZzw3l", "Ixrtb");
        GuiCustomizeWorldScreen.lIlllIIlIIllII[GuiCustomizeWorldScreen.lIlllIIlllIllI[78]] = lIIIIIIllIlllIlI("PLNnhkED9SWyxeaFPrdXymh8MDgeu3NEb0oUiXzu8zsz9drb1qv/bg==", "VJwyQ");
        GuiCustomizeWorldScreen.lIlllIIlIIllII[GuiCustomizeWorldScreen.lIlllIIlllIllI[80]] = lIIIIIIllIllllII("fr6VGmU3T5u4JUqiZU2UdPWCDo6LmKoRmfD4Opx/G3QInIF9jLhmZQ==", "tfuTZ");
        GuiCustomizeWorldScreen.lIlllIIlIIllII[GuiCustomizeWorldScreen.lIlllIIlllIllI[82]] = lIIIIIIllIlllIlI("y6lQrvyznJRivzdKhVHtEfnq3+OcNl407M6ieBoxNNTcvt1OidxTug==", "qcbCU");
        GuiCustomizeWorldScreen.lIlllIIlIIllII[GuiCustomizeWorldScreen.lIlllIIlllIllI[84]] = lIIIIIIllIllllII("TrXq5ro41sFW9FSzYUKccvsO4FCtADRoJsGPoLqiMqaVnPQ1Hx/LpQ==", "XibUU");
        GuiCustomizeWorldScreen.lIlllIIlIIllII[GuiCustomizeWorldScreen.lIlllIIlllIllI[86]] = lIIIIIIllIllllII("uvaXol5xXzgjkJ4FKIZm/2gB/hJy2vWk", "ubfFE");
        GuiCustomizeWorldScreen.lIlllIIlIIllII[GuiCustomizeWorldScreen.lIlllIIlllIllI[88]] = lIIIIIIllIllllII("Vq+DrfHIMOnyoSBIFi4Ox/eoGVUHHF+rDhM3nDIrNMZtks8q6gjzQg==", "OteqP");
        GuiCustomizeWorldScreen.lIlllIIlIIllII[GuiCustomizeWorldScreen.lIlllIIlllIllI[90]] = lIIIIIIllIllllII("QhGjdPnOejvlgOPUVuCtjcs7DqaYOOresF7FWMAwzqPov5gb2pG9Yg==", "gGmME");
        GuiCustomizeWorldScreen.lIlllIIlIIllII[GuiCustomizeWorldScreen.lIlllIIlllIllI[92]] = lIIIIIIllIlllIll("BwQhBh8BISsVBwBYJxIYEBkpDhEBWCcSGBAZKUkGDRgMAgIDHjA=", "dvDgk");
        GuiCustomizeWorldScreen.lIlllIIlIIllII[GuiCustomizeWorldScreen.lIlllIIlllIllI[94]] = lIIIIIIllIlllIlI("/NjKfb8pe0slGNMTiEuNrxD46L5kcDc0LC9OVqkIbRGItLBcbvLGPg==", "ptmDt");
        GuiCustomizeWorldScreen.lIlllIIlIIllII[GuiCustomizeWorldScreen.lIlllIIlllIllI[96]] = lIIIIIIllIlllIlI("2Y3zgcWgsik8SjhWBUQ3UgN7Uql34Kmq", "THrjw");
        GuiCustomizeWorldScreen.lIlllIIlIIllII[GuiCustomizeWorldScreen.lIlllIIlllIllI[98]] = lIIIIIIllIllllII("AAujaBs3S8QsLBFC/kiExk+Nz2XIJP5VESqjGRhPmWnmYPnCedCMZA==", "iMNan");
        GuiCustomizeWorldScreen.lIlllIIlIIllII[GuiCustomizeWorldScreen.lIlllIIlllIllI[100]] = lIIIIIIllIllllII("wSUnLxPbtJV3vMJ5nPVOxulT232AzGEyDyABqoTxif7GiW+smfjrMQ==", "BxAIq");
        GuiCustomizeWorldScreen.lIlllIIlIIllII[GuiCustomizeWorldScreen.lIlllIIlllIllI[102]] = lIIIIIIllIlllIlI("OjJGLTlbTwl9SM7MSVsaeaxbqnRf0QvH54MvfzHXUhomlwYpfND5bA==", "iVUYX");
        GuiCustomizeWorldScreen.lIlllIIlIIllII[GuiCustomizeWorldScreen.lIlllIIlllIllI[104]] = lIIIIIIllIllllII("N9CYfwolAbGDHypKSMkT/wSwuoQPrT6k0LYp2EOL/Lli9YJ9AnGfRQ==", "oUbar");
        GuiCustomizeWorldScreen.lIlllIIlIIllII[GuiCustomizeWorldScreen.lIlllIIlllIllI[27]] = lIIIIIIllIlllIlI("iZvPvUEJwNZMxWmfmZq/CbFM2oWD1f/rxRD8FK6RQK8=", "EaFHu");
        GuiCustomizeWorldScreen.lIlllIIlIIllII[GuiCustomizeWorldScreen.lIlllIIlllIllI[107]] = lIIIIIIllIlllIlI("bPUBQ/9HPcpSQctWnVDvJOy8BiI9b7x5tFfZciddq5Ury1eWwbNrrg==", "pAGyT");
        GuiCustomizeWorldScreen.lIlllIIlIIllII[GuiCustomizeWorldScreen.lIlllIIlllIllI[109]] = lIIIIIIllIllllII("AMcWVVlpF99vysruV4CPEhBAlhjVDkV5WMrB+Hva2EuVFH90mQwKqQ==", "PACIp");
        GuiCustomizeWorldScreen.lIlllIIlIIllII[GuiCustomizeWorldScreen.lIlllIIlllIllI[111]] = lIIIIIIllIlllIll("EBUrBDAWMCEXKBdJLRA3BwgjDD4WSS0QNwcII0spGgkGAC0UDzo=", "sgNeD");
        GuiCustomizeWorldScreen.lIlllIIlIIllII[GuiCustomizeWorldScreen.lIlllIIlllIllI[113]] = lIIIIIIllIlllIll("NCcdOT8yAhcqJzN7Gy04IzoVMTEyexstOCM6FXYmNi0wPSIwPQw=", "WUxXK");
        GuiCustomizeWorldScreen.lIlllIIlIIllII[GuiCustomizeWorldScreen.lIlllIIlllIllI[25]] = lIIIIIIllIlllIll("Gj0UDkwBJh0oDQ84VgUDAzE=", "nTxkb");
        GuiCustomizeWorldScreen.lIlllIIlIIllII[GuiCustomizeWorldScreen.lIlllIIlllIllI[116]] = lIIIIIIllIllllII("8WZzurofSgUmwgyG2TzOaEWynk5FwK+0E0Lf85DdMipZNDMR9YNy5g==", "tBljA");
        GuiCustomizeWorldScreen.lIlllIIlIIllII[GuiCustomizeWorldScreen.lIlllIIlllIllI[118]] = lIIIIIIllIlllIll("BBQ9OB8CMTcrBwNIOywYEwk1MBECSDssGBMJNXcICBM2LQ==", "gfXYk");
        GuiCustomizeWorldScreen.lIlllIIlIIllII[GuiCustomizeWorldScreen.lIlllIIlllIllI[119]] = lIIIIIIllIllllII("xl5AveoyEZEzt5DcFGx+emZg4SmWaMyK2/19prZLMh1HCVIK/zvo6A==", "jjGQL");
        GuiCustomizeWorldScreen.lIlllIIlIIllII[GuiCustomizeWorldScreen.lIlllIIlllIllI[121]] = lIIIIIIllIlllIll("MRQ2JCQ3MTw3PDZIMDAjJgk+LCo3SDAwIyYJPms9Mx4bIDk1Dic=", "RfSEP");
        GuiCustomizeWorldScreen.lIlllIIlIIllII[GuiCustomizeWorldScreen.lIlllIIlllIllI[123]] = lIIIIIIllIllllII("sLqCnjIMszLqSwJFmlAi21NTlcX20z2D", "XOzuX");
        GuiCustomizeWorldScreen.lIlllIIlIIllII[GuiCustomizeWorldScreen.lIlllIIlllIllI[125]] = lIIIIIIllIllllII("9W3h3stP4mbX56sM2nglYBh+Yf7xdYXAJa4VkjVJqu/B0Ih7sZlmoA==", "GEZTQ");
        GuiCustomizeWorldScreen.lIlllIIlIIllII[GuiCustomizeWorldScreen.lIlllIIlllIllI[127]] = lIIIIIIllIlllIll("BRcfMyYDMhUgPgJLGSchEgoXOygDSxknIRIKF3wxCRAUJg==", "fezRR");
        GuiCustomizeWorldScreen.lIlllIIlIIllII[GuiCustomizeWorldScreen.lIlllIIlllIllI[129]] = lIIIIIIllIlllIll("MDgmFjU2HSwFLTdkIAIyJyUuHjs2ZCACMiclLlksOiQLEig0Ijc=", "SJCwA");
        GuiCustomizeWorldScreen.lIlllIIlIIllII[GuiCustomizeWorldScreen.lIlllIIlllIllI[131]] = lIIIIIIllIlllIll("MT8CFwQ3GggEHDZjBAMDJiIKHwo3YwQDAyYiClgdMzUvExk1JRM=", "RMgvp");
        GuiCustomizeWorldScreen.lIlllIIlIIllII[GuiCustomizeWorldScreen.lIlllIIlllIllI[133]] = lIIIIIIllIllllII("JedoWpuNk2bCW7wx0XT+2CB9B/uXRwPJ", "DVffg");
        GuiCustomizeWorldScreen.lIlllIIlIIllII[GuiCustomizeWorldScreen.lIlllIIlllIllI[64]] = lIIIIIIllIlllIlI("ZW/oZclundzS7AEoiz1alcAVrpVZMvO8/a9BA0gu+3sea5kHqGpG/A==", "MahxO");
        GuiCustomizeWorldScreen.lIlllIIlIIllII[GuiCustomizeWorldScreen.lIlllIIlllIllI[136]] = lIIIIIIllIlllIlI("V/Dv4juKdb+erNHFF2TTc2wndCi+yrQtCjV2fejoLSedk+DrKkDzFg==", "rkZog");
        GuiCustomizeWorldScreen.lIlllIIlIIllII[GuiCustomizeWorldScreen.lIlllIIlllIllI[138]] = lIIIIIIllIlllIll("Gx0mMA0dOCwjFRxBICQKDAAuOAMdQSAkCgwALn8UEQELNBAfBzc=", "xoCQy");
        GuiCustomizeWorldScreen.lIlllIIlIIllII[GuiCustomizeWorldScreen.lIlllIIlllIllI[140]] = lIIIIIIllIlllIlI("gor09deoPCH5h9SgZZcH1WVMUL78YqF3Le+WA9s8XP25BfJCmf752A==", "mgplX");
        GuiCustomizeWorldScreen.lIlllIIlIIllII[GuiCustomizeWorldScreen.lIlllIIlllIllI[142]] = lIIIIIIllIlllIll("FTAdBkwOKxQxBwUqBQwMBHcfAg8E", "aYqcb");
        GuiCustomizeWorldScreen.lIlllIIlIIllII[GuiCustomizeWorldScreen.lIlllIIlllIllI[144]] = lIIIIIIllIllllII("X/hj8G1Rt2cjiXZxWMo0YpbYPXgN8swjkg26HHsiPjIMwokdnubmdg==", "oztmx");
        GuiCustomizeWorldScreen.lIlllIIlIIllII[GuiCustomizeWorldScreen.lIlllIIlllIllI[146]] = lIIIIIIllIlllIll("BhMdDTwANhceJAFPGxk7EQ4VBTIATxsZOxEOFUIrChQWGA==", "eaxlH");
        GuiCustomizeWorldScreen.lIlllIIlIIllII[GuiCustomizeWorldScreen.lIlllIIlllIllI[148]] = lIIIIIIllIllllII("CUf2vi7F5T1XONqi5kY36lL9xHzNKqCf5Yl1KVGXWpFiOFm9j87y2w==", "psZHm");
        GuiCustomizeWorldScreen.lIlllIIlIIllII[GuiCustomizeWorldScreen.lIlllIIlllIllI[150]] = lIIIIIIllIlllIll("EyU3OzYVAD0oLhR5MS8xBDg/MzgVeTEvMQQ4P3QvES8aPysXPyY=", "pWRZB");
        GuiCustomizeWorldScreen.lIlllIIlIIllII[GuiCustomizeWorldScreen.lIlllIIlllIllI[152]] = lIIIIIIllIlllIll("MREAJHoqCgkFPSQVAy8waxYNLDE=", "ExlAT");
        GuiCustomizeWorldScreen.lIlllIIlIIllII[GuiCustomizeWorldScreen.lIlllIIlllIllI[154]] = lIIIIIIllIllllII("Tegiifo9Gu0mHhI2iFybc+N9vdNJvOouZzF6JDhjTtshQfS8LGZLww==", "fyFAZ");
        GuiCustomizeWorldScreen.lIlllIIlIIllII[GuiCustomizeWorldScreen.lIlllIIlllIllI[156]] = lIIIIIIllIlllIll("JDkkJzciHC40LyNlIjMwMyQsLzkiZSIzMDMkLGggKD4vMg==", "GKAFC");
        GuiCustomizeWorldScreen.lIlllIIlIIllII[GuiCustomizeWorldScreen.lIlllIIlllIllI[158]] = lIIIIIIllIllllII("JFD44NBUJTP5p20KtNbtviu58w2a2NpLMA3cVd9V5dj4qKcaCKPVHw==", "jwicC");
        GuiCustomizeWorldScreen.lIlllIIlIIllII[GuiCustomizeWorldScreen.lIlllIIlllIllI[160]] = lIIIIIIllIlllIlI("knBavEo9gKuit4LlUATIz2MTvI6MVwV2AijsB7M/o0Mh8ec+xBhvhg==", "umksM");
        GuiCustomizeWorldScreen.lIlllIIlIIllII[GuiCustomizeWorldScreen.lIlllIIlllIllI[8]] = lIIIIIIllIlllIll("IzkCHUc4Igs0CCc5HVYHNj0L", "WPnxi");
        GuiCustomizeWorldScreen.lIlllIIlIIllII[GuiCustomizeWorldScreen.lIlllIIlllIllI[163]] = lIIIIIIllIllllII("Q3QBKeVzumtxwOE1zb6kyRta2nRnlNHpfr5SxH7DrnbF7Rkr45cgiQ==", "kvSvC");
        GuiCustomizeWorldScreen.lIlllIIlIIllII[GuiCustomizeWorldScreen.lIlllIIlllIllI[165]] = lIIIIIIllIllllII("X4tKxx31t11n7AyQoxSLEVepVHrVfcOhJNN3vzYlDVw6iY59MY2YMA==", "GQnUw");
        GuiCustomizeWorldScreen.lIlllIIlIIllII[GuiCustomizeWorldScreen.lIlllIIlllIllI[167]] = lIIIIIIllIllllII("TQrububMdT9zVcQMt62FfSxEh7h43RUWqpQ2nTC5I5P4NUw50mhVxg==", "sUzEM");
        GuiCustomizeWorldScreen.lIlllIIlIIllII[GuiCustomizeWorldScreen.lIlllIIlllIllI[169]] = lIIIIIIllIllllII("pgAE1sdzcYp2UYoEJfkNk5IrWfIoslOzriMwIw+2eOCyMGM3Ni+LVQ==", "yTPvz");
        GuiCustomizeWorldScreen.lIlllIIlIIllII[GuiCustomizeWorldScreen.lIlllIIlllIllI[170]] = lIIIIIIllIlllIll("FwQgERwRISoCBBBYJgUbABkoGRIRWCYFGwAZKF4FFR8rPgcdBSAjCxUaICg=", "tvEph");
        GuiCustomizeWorldScreen.lIlllIIlIIllII[GuiCustomizeWorldScreen.lIlllIIlllIllI[172]] = lIIIIIIllIlllIlI("locAGqvysmOi1Gbg5mZQTAOXQlOiE7bPM6gQIEr7xcBtmTSCWMNTdKiQXmxelhTT", "Ltflm");
        GuiCustomizeWorldScreen.lIlllIIlIIllII[GuiCustomizeWorldScreen.lIlllIIlllIllI[174]] = lIIIIIIllIllllII("BpBaZRAQQOVG5znax1xrw8sUDa434w9GJGPM0cIN8/MRzF4ZycPZiVCso4WTNs/s", "vwwtH");
        GuiCustomizeWorldScreen.lIlllIIlIIllII[GuiCustomizeWorldScreen.lIlllIIlllIllI[176]] = lIIIIIIllIllllII("+SXAehUsw9QDovthXeIyhpJpKdaZcujCfi5VeqCcmBVDf4lOYlEYhl4AFJrUWJ95", "VNzfy");
        GuiCustomizeWorldScreen.lIlllIIlIIllII[GuiCustomizeWorldScreen.lIlllIIlllIllI[178]] = lIIIIIIllIlllIll("ADchJzAGEis0KAdrJzM3FyopLz4GayczNxcqKWggBjUwLgoMLDcjFwAkKCMe", "cEDFD");
        GuiCustomizeWorldScreen.lIlllIIlIIllII[GuiCustomizeWorldScreen.lIlllIIlllIllI[14]] = lIIIIIIllIlllIll("FjccAy0QEhYQNRFrGhcqASoUCyMQaxoXKgEqFEw9EDUNChcaLAoHChYkFQccDTUWDDwbMQ==", "uEybY");
        GuiCustomizeWorldScreen.lIlllIIlIIllII[GuiCustomizeWorldScreen.lIlllIIlllIllI[181]] = lIIIIIIllIlllIll("KwQcKA4tIRY7FixYGjwJPBkUIAAtWBo8CTwZFGcYKQUcGhMyEw==", "HvyIz");
        GuiCustomizeWorldScreen.lIlllIIlIIllII[GuiCustomizeWorldScreen.lIlllIIlllIllI[17]] = lIIIIIIllIlllIll("NgodKCUwLxc7PTFWGzwiIRcVICswVhs8IiEXFWcyOhcKLTg7GQwsAjYZFCw=", "UxxIQ");
        GuiCustomizeWorldScreen.lIlllIIlIIllII[GuiCustomizeWorldScreen.lIlllIIlllIllI[184]] = lIIIIIIllIllllII("+BIYPudBu0ErOBijpJVFMsEVlcPqGHNl7ucfjT6Fv1TD+2ABNgISLZ92R4NtQOgH", "nivgV");
        GuiCustomizeWorldScreen.lIlllIIlIIllII[GuiCustomizeWorldScreen.lIlllIIlllIllI[186]] = lIIIIIIllIlllIll("MzUoJzc1ECI0LzRpLjMwJCggLzk1aS4zMCQoIGgwJDUoMiA4Hg==", "PGMFC");
        GuiCustomizeWorldScreen.lIlllIIlIIllII[GuiCustomizeWorldScreen.lIlllIIlllIllI[188]] = lIIIIIIllIlllIlI("KdCAJ4uc30UFLaobDPVzWLMjfeWuRSSpG4u0kz0FqeEUecsNzESVBm+PIs31nd/j", "KDqdK");
        GuiCustomizeWorldScreen.lIlllIIlIIllII[GuiCustomizeWorldScreen.lIlllIIlllIllI[190]] = lIIIIIIllIlllIlI("QxN+WffScYusrprqZqmJjup0CETmARAhaY+VsuIcUtxGJ/2j40Is7OdfWpFEpN3g", "Sqmcu");
        GuiCustomizeWorldScreen.lIlllIIlIIllII[GuiCustomizeWorldScreen.lIlllIIlllIllI[192]] = lIIIIIIllIllllII("OY9KmoegZLK/lCTIeXGTQmhOmPY0/j0naCxSrnzdKbs5edP8jxU7XVZTUBpwh+OF", "iTvFT");
        GuiCustomizeWorldScreen.lIlllIIlIIllII[GuiCustomizeWorldScreen.lIlllIIlllIllI[22]] = lIIIIIIllIllllII("usPzCDgbQmKd4Wdc9q/95+zpgtRz/8zKiNzljKZ/IhjJdx0HrsCuzIbR/FZI+PMC", "dnIqy");
        GuiCustomizeWorldScreen.lIlllIIlIIllII[GuiCustomizeWorldScreen.lIlllIIlllIllI[195]] = lIIIIIIllIlllIlI("dM1XY+GagXgML0ZTlJIpYlL6ujHHN/qc3iZ0b8IGaJXQVBnqqaje6YF/qoZCjX0a", "sbXAh");
        GuiCustomizeWorldScreen.lIlllIIlIIllII[GuiCustomizeWorldScreen.lIlllIIlllIllI[10]] = lIIIIIIllIllllII("4ti4HpLf2de+CO652n9doOTbJLm65pnj9pl+NMCGUgdb+x5/ivYrotUvsJHOt5fl", "ZfsgK");
        GuiCustomizeWorldScreen.lIlllIIlIIllII[GuiCustomizeWorldScreen.lIlllIIlllIllI[171]] = lIIIIIIllIlllIlI("GFS/R2auAaXjxSqUfFI+lIYXMq2j2qUwNArKwNmDZ4aa/1rpKTQ+cmafm2dTaYJb", "YaAme");
        GuiCustomizeWorldScreen.lIlllIIlIIllII[GuiCustomizeWorldScreen.lIlllIIlllIllI[173]] = lIIIIIIllIlllIlI("nGco8lg0eqo=", "KMFDC");
        GuiCustomizeWorldScreen.lIlllIIlIIllII[GuiCustomizeWorldScreen.lIlllIIlllIllI[175]] = lIIIIIIllIlllIlI("r7p87MJaPBQ=", "MiAQY");
        GuiCustomizeWorldScreen.lIlllIIlIIllII[GuiCustomizeWorldScreen.lIlllIIlllIllI[177]] = lIIIIIIllIlllIlI("9qhUotu0VaPpBjFy4g2c512ws5hI+97fkM9rS8/q4Rfl3Cw8n4BfPOCtiw26jJIY", "FIXXE");
        GuiCustomizeWorldScreen.lIlllIIlIIllII[GuiCustomizeWorldScreen.lIlllIIlllIllI[179]] = lIIIIIIllIlllIlI("aGlac3wATik=", "jttBT");
        GuiCustomizeWorldScreen.lIlllIIlIIllII[GuiCustomizeWorldScreen.lIlllIIlllIllI[180]] = lIIIIIIllIlllIll("Ynh6ezQ=", "GMTHR");
        GuiCustomizeWorldScreen.lIlllIIlIIllII[GuiCustomizeWorldScreen.lIlllIIlllIllI[182]] = lIIIIIIllIllllII("Y/LepnSGd3en/FD1wZAXaJWEuVVquRLF1O3x2+wCjmJEqzmUyRt3hd0OkF8h2vhb", "dEkNZ");
        GuiCustomizeWorldScreen.lIlllIIlIIllII[GuiCustomizeWorldScreen.lIlllIIlllIllI[183]] = lIIIIIIllIlllIll("WQ==", "coAWE");
        GuiCustomizeWorldScreen.lIlllIIlIIllII[GuiCustomizeWorldScreen.lIlllIIlllIllI[185]] = lIIIIIIllIlllIlI("POUpqLje2wA=", "vEdge");
        GuiCustomizeWorldScreen.lIlllIIlIIllII[GuiCustomizeWorldScreen.lIlllIIlllIllI[187]] = lIIIIIIllIlllIlI("aRciJ9TVJbqbEFaK3ZAn0q6tzFJaa8dn1thnND26QXS+jCEOwGw4UxRnjCm/lN5n", "KRygl");
        GuiCustomizeWorldScreen.lIlllIIlIIllII[GuiCustomizeWorldScreen.lIlllIIlllIllI[189]] = lIIIIIIllIlllIlI("LZ6o8+HJh+I=", "tpcDU");
        GuiCustomizeWorldScreen.lIlllIIlIIllII[GuiCustomizeWorldScreen.lIlllIIlllIllI[191]] = lIIIIIIllIlllIll("QGRbYD4=", "eQuSX");
        GuiCustomizeWorldScreen.lIlllIIlIIllII[GuiCustomizeWorldScreen.lIlllIIlllIllI[193]] = lIIIIIIllIllllII("/atuFAGOC4ofDsrNhDLI2XaUU4Q3578kmGwNfRLwaMyCsq1Mf/lGaMrJ56REBNKD", "kSoqa");
        GuiCustomizeWorldScreen.lIlllIIlIIllII[GuiCustomizeWorldScreen.lIlllIIlllIllI[194]] = lIIIIIIllIllllII("OTY0vMtDQss=", "HtxdX");
        GuiCustomizeWorldScreen.lIlllIIlIIllII[GuiCustomizeWorldScreen.lIlllIIlllIllI[196]] = lIIIIIIllIlllIll("aFZXWjw=", "McyiZ");
        GuiCustomizeWorldScreen.lIlllIIlIIllII[GuiCustomizeWorldScreen.lIlllIIlllIllI[208]] = lIIIIIIllIlllIll("AiYUGxEEAx4ICQV6Eg8WFTscEx8EehIPFhU7HFQBBCQFEisOPQIfNgI1HR8gGSQeFAAPIA==", "aTqze");
        GuiCustomizeWorldScreen.lIlllIIlIIllII[GuiCustomizeWorldScreen.lIlllIIlllIllI[209]] = lIIIIIIllIlllIll("Xg==", "dCQSN");
        GuiCustomizeWorldScreen.lIlllIIlIIllII[GuiCustomizeWorldScreen.lIlllIIlllIllI[211]] = lIIIIIIllIllllII("KfDzC7RsGO4=", "nheCH");
        GuiCustomizeWorldScreen.lIlllIIlIIllII[GuiCustomizeWorldScreen.lIlllIIlllIllI[213]] = lIIIIIIllIlllIll("LCsUEAUqDh4DHSt3EgQCOzYcGAsqdxIEAjs2HF8TLioUIhg1PA==", "OYqqq");
        GuiCustomizeWorldScreen.lIlllIIlIIllII[GuiCustomizeWorldScreen.lIlllIIlllIllI[214]] = lIIIIIIllIllllII("D70U2bRGLuI=", "wlWIg");
        GuiCustomizeWorldScreen.lIlllIIlIIllII[GuiCustomizeWorldScreen.lIlllIIlllIllI[216]] = lIIIIIIllIlllIlI("0SpITVO2w1o=", "hOsJg");
        GuiCustomizeWorldScreen.lIlllIIlIIllII[GuiCustomizeWorldScreen.lIlllIIlllIllI[218]] = lIIIIIIllIlllIlI("Cl1FqPidKnPEo9V87+LjvVvBO+wsWqvxKqtqLjQjY5Lqb4yZSJ50RJbSBGy9niQh", "jREwU");
        GuiCustomizeWorldScreen.lIlllIIlIIllII[GuiCustomizeWorldScreen.lIlllIIlllIllI[219]] = lIIIIIIllIlllIlI("xBp6BwRq56E=", "JrBss");
        GuiCustomizeWorldScreen.lIlllIIlIIllII[GuiCustomizeWorldScreen.lIlllIIlllIllI[221]] = lIIIIIIllIlllIll("TlNDYzw=", "kfmPZ");
        GuiCustomizeWorldScreen.lIlllIIlIIllII[GuiCustomizeWorldScreen.lIlllIIlllIllI[223]] = lIIIIIIllIlllIll("CzwKJQwNGQA2FAxgDDELHCECLQINYAwxCxwhAmoQDScILAw7LQ4oHQ==", "hNoDx");
        GuiCustomizeWorldScreen.lIlllIIlIIllII[GuiCustomizeWorldScreen.lIlllIIlllIllI[224]] = lIIIIIIllIlllIlI("sHYAzEdOI/g=", "iievc");
        GuiCustomizeWorldScreen.lIlllIIlIIllII[GuiCustomizeWorldScreen.lIlllIIlllIllI[226]] = lIIIIIIllIlllIll("SGdpUig=", "mRGaN");
        GuiCustomizeWorldScreen.lIlllIIlIIllII[GuiCustomizeWorldScreen.lIlllIIlllIllI[228]] = lIIIIIIllIllllII("jk3gU/w8IcjU9Y2PgXcVrWc4n593Y+KicmZ6gIpdTIRRIXGscmp2dg==", "bgLqB");
        GuiCustomizeWorldScreen.lIlllIIlIIllII[GuiCustomizeWorldScreen.lIlllIIlllIllI[229]] = lIIIIIIllIlllIll("WA==", "brgCs");
        GuiCustomizeWorldScreen.lIlllIIlIIllII[GuiCustomizeWorldScreen.lIlllIIlllIllI[231]] = lIIIIIIllIllllII("iVq/op+oVd4=", "qFeRs");
        GuiCustomizeWorldScreen.lIlllIIlIIllII[GuiCustomizeWorldScreen.lIlllIIlllIllI[233]] = lIIIIIIllIllllII("WQ+zbX1XJhws/u7R04uusjAFkC/6iGTE7Z1chOth598fswMezbimacKZvGht/0WI", "rnYIU");
        GuiCustomizeWorldScreen.lIlllIIlIIllII[GuiCustomizeWorldScreen.lIlllIIlllIllI[198]] = lIIIIIIllIllllII("AMpi9gWUnrw=", "bSVZn");
        GuiCustomizeWorldScreen.lIlllIIlIIllII[GuiCustomizeWorldScreen.lIlllIIlllIllI[200]] = lIIIIIIllIlllIll("VHlmcgM=", "qLHAe");
        GuiCustomizeWorldScreen.lIlllIIlIIllII[GuiCustomizeWorldScreen.lIlllIIlllIllI[202]] = lIIIIIIllIlllIll("LB4zDjAqOzkdKCtCNRo3OwM7Bj4qQjUaNzsDO0EoIBszHQgmAT8bFywNOgo=", "OlVoD");
        GuiCustomizeWorldScreen.lIlllIIlIIllII[GuiCustomizeWorldScreen.lIlllIIlllIllI[204]] = lIIIIIIllIlllIll("aQ==", "SBaEs");
        GuiCustomizeWorldScreen.lIlllIIlIIllII[GuiCustomizeWorldScreen.lIlllIIlllIllI[206]] = lIIIIIIllIlllIll("YUJCdwk=", "DwlDo");
        GuiCustomizeWorldScreen.lIlllIIlIIllII[GuiCustomizeWorldScreen.lIlllIIlllIllI[210]] = lIIIIIIllIlllIll("ADMgBjEGFioVKQdvJhI2Fy4oDj8GbyYSNhcuKEknCi4oAgEGMTEPEgYoIg8x", "cAEgE");
        GuiCustomizeWorldScreen.lIlllIIlIIllII[GuiCustomizeWorldScreen.lIlllIIlllIllI[215]] = lIIIIIIllIllllII("HXeFxkRSG+4=", "RGZMd");
        GuiCustomizeWorldScreen.lIlllIIlIIllII[GuiCustomizeWorldScreen.lIlllIIlllIllI[220]] = lIIIIIIllIlllIlI("8Ed/GN/Hu7o=", "GdDtf");
        GuiCustomizeWorldScreen.lIlllIIlIIllII[GuiCustomizeWorldScreen.lIlllIIlllIllI[225]] = lIIIIIIllIlllIll("IDcCNBwmEggnBCdrBCAbNyoKPBImawQgGzcqCnsKKioKMCwmNRM9JyUjFDAc", "CEgUh");
        GuiCustomizeWorldScreen.lIlllIIlIIllII[GuiCustomizeWorldScreen.lIlllIIlllIllI[230]] = lIIIIIIllIlllIll("Tw==", "uFvdQ");
        GuiCustomizeWorldScreen.lIlllIIlIIllII[GuiCustomizeWorldScreen.lIlllIIlllIllI[234]] = lIIIIIIllIlllIll("YlltdjI=", "GkCET");
        GuiCustomizeWorldScreen.lIlllIIlIIllII[GuiCustomizeWorldScreen.lIlllIIlllIllI[236]] = lIIIIIIllIllllII("95EbJ6s8/qxlKn428YAMg2mcQiUnIVk/oI7nsxc75ZCz6eBPlbFFxTCcT+NosvE4", "anGrr");
        GuiCustomizeWorldScreen.lIlllIIlIIllII[GuiCustomizeWorldScreen.lIlllIIlllIllI[238]] = lIIIIIIllIlllIll("dw==", "MlWaU");
        GuiCustomizeWorldScreen.lIlllIIlIIllII[GuiCustomizeWorldScreen.lIlllIIlllIllI[240]] = lIIIIIIllIllllII("oJGnYVaknx0=", "nwOWm");
        GuiCustomizeWorldScreen.lIlllIIlIIllII[GuiCustomizeWorldScreen.lIlllIIlllIllI[242]] = lIIIIIIllIlllIlI("Cru7tRS2UtTHyxMchGAJw6bVsdS1enCEG5jClQtrdKj99uYmrme4finsKIDKF090", "FKrAG");
        GuiCustomizeWorldScreen.lIlllIIlIIllII[GuiCustomizeWorldScreen.lIlllIIlllIllI[244]] = lIIIIIIllIllllII("Lr3mU57q/PY=", "jqfHn");
        GuiCustomizeWorldScreen.lIlllIIlIIllII[GuiCustomizeWorldScreen.lIlllIIlllIllI[33]] = lIIIIIIllIllllII("H6wBakUC7PA=", "geTAj");
        GuiCustomizeWorldScreen.lIlllIIlIIllII[GuiCustomizeWorldScreen.lIlllIIlllIllI[46]] = lIIIIIIllIlllIlI("h1MsNlkXC0+W3plT3kaYAFrjhSXQYAyrJxNI0U65twIo5Si5IMdTUg==", "nCuyN");
        GuiCustomizeWorldScreen.lIlllIIlIIllII[GuiCustomizeWorldScreen.lIlllIIlllIllI[35]] = lIIIIIIllIllllII("BqH37azChgc=", "JHKTt");
        GuiCustomizeWorldScreen.lIlllIIlIIllII[GuiCustomizeWorldScreen.lIlllIIlllIllI[37]] = lIIIIIIllIlllIll("", "kEMys");
        GuiCustomizeWorldScreen.lIlllIIlIIllII[GuiCustomizeWorldScreen.lIlllIIlllIllI[39]] = lIIIIIIllIllllII("YJlinlymnIk=", "safEG");
        GuiCustomizeWorldScreen.lIlllIIlIIllII[GuiCustomizeWorldScreen.lIlllIIlllIllI[41]] = lIIIIIIllIlllIlI("qU9Mhi5Vzvk=", "PcWra");
        GuiCustomizeWorldScreen.lIlllIIlIIllII[GuiCustomizeWorldScreen.lIlllIIlllIllI[44]] = lIIIIIIllIllllII("dIABi/VbJPE=", "oEjLM");
        GuiCustomizeWorldScreen.lIlllIIlIIllII[GuiCustomizeWorldScreen.lIlllIIlllIllI[49]] = lIIIIIIllIlllIlI("iIR7S/y5RR4=", "BaGcU");
        GuiCustomizeWorldScreen.lIlllIIlIIllII[GuiCustomizeWorldScreen.lIlllIIlllIllI[53]] = lIIIIIIllIlllIlI("L/cICMgVa/o=", "RUulc");
        GuiCustomizeWorldScreen.lIlllIIlIIllII[GuiCustomizeWorldScreen.lIlllIIlllIllI[47]] = lIIIIIIllIllllII("/GtWox3X3PM=", "xlAmO");
        GuiCustomizeWorldScreen.lIlllIIlIIllII[GuiCustomizeWorldScreen.lIlllIIlllIllI[51]] = lIIIIIIllIlllIll("WA==", "gVZVj");
        GuiCustomizeWorldScreen.lIlllIIlIIllII[GuiCustomizeWorldScreen.lIlllIIlllIllI[55]] = lIIIIIIllIlllIlI("ZtH3GHRyStE4GAOwXiB2tQgNNPtNE1D+", "BbXjw");
        GuiCustomizeWorldScreen.lIlllIIlIIllII[GuiCustomizeWorldScreen.lIlllIIlllIllI[26]] = lIIIIIIllIllllII("IO5RYvsLHFNV6YC8SDpG4UOFy7K0X+pavdMfELzc1D5hnQ1Z79koxTmUmvh7Tp6Z", "mpksI");
        GuiCustomizeWorldScreen.lIlllIIlIIllII[GuiCustomizeWorldScreen.lIlllIIlllIllI[57]] = lIIIIIIllIlllIll("OysPOTk9DgUqITx3CS0+LDYHMTc9dwktPiw2B3YuNzcMMT81aA==", "XYjXM");
        GuiCustomizeWorldScreen.lIlllIIlIIllII[GuiCustomizeWorldScreen.lIlllIIlllIllI[59]] = lIIIIIIllIlllIlI("o2mxPMQ8VBYmO9ameQ0zUmE8E5I57GsHz+z0oHv2FDoPll+wonEcHw==", "rStsB");
    }
    
    private void func_175322_b(final int llllllllllllIlllllIIIllllllIIIll) {
        this.field_175339_B = llllllllllllIlllllIIIllllllIIIll;
        this.func_175329_a((boolean)(GuiCustomizeWorldScreen.lIlllIIlllIllI[1] != 0));
    }
    
    @Override
    protected void keyTyped(final char llllllllllllIlllllIIIlllllIIllIl, final int llllllllllllIlllllIIIlllllIIllII) throws IOException {
        super.keyTyped(llllllllllllIlllllIIIlllllIIllIl, llllllllllllIlllllIIIlllllIIllII);
        if (lIIIIIlIIlIIllll(this.field_175339_B)) {
            switch (llllllllllllIlllllIIIlllllIIllII) {
                case 200: {
                    this.func_175327_a(1.0f);
                    "".length();
                    if ((0x4 ^ 0x0) == ((0x5B ^ 0x18) & ~(0x25 ^ 0x66))) {
                        return;
                    }
                    break;
                }
                case 208: {
                    this.func_175327_a(-1.0f);
                    "".length();
                    if ((0x7C ^ 0x78) < -" ".length()) {
                        return;
                    }
                    break;
                }
                default: {
                    this.field_175349_r.func_178062_a(llllllllllllIlllllIIIlllllIIllIl, llllllllllllIlllllIIIlllllIIllII);
                    break;
                }
            }
        }
    }
    
    private static int lIIIIIlIIlIlIIII(final float n, final float n2) {
        return fcmpg(n, n2);
    }
    
    @Override
    public void func_175319_a(final int llllllllllllIlllllIIlIIIIIlllIIl, final String llllllllllllIlllllIIlIIIIIllllIl) {
        float llllllllllllIlllllIIlIIIIIllllII = 0.0f;
        try {
            llllllllllllIlllllIIlIIIIIllllII = Float.parseFloat(llllllllllllIlllllIIlIIIIIllllIl);
            "".length();
            if ((137 + 1 - 80 + 133 ^ 147 + 42 - 9 + 7) <= -" ".length()) {
                return;
            }
        }
        catch (NumberFormatException ex) {}
        float llllllllllllIlllllIIlIIIIIlllIll = 0.0f;
        switch (llllllllllllIlllllIIlIIIIIlllIIl) {
            case 132: {
                final ChunkProviderSettings.Factory field_175336_F = this.field_175336_F;
                final float clamp_float = MathHelper.clamp_float(llllllllllllIlllllIIlIIIIIllllII, 1.0f, 5000.0f);
                field_175336_F.mainNoiseScaleX = clamp_float;
                llllllllllllIlllllIIlIIIIIlllIll = clamp_float;
                "".length();
                if ("  ".length() <= ((0xB3 ^ 0x82) & ~(0xA8 ^ 0x99))) {
                    return;
                }
                break;
            }
            case 133: {
                final ChunkProviderSettings.Factory field_175336_F2 = this.field_175336_F;
                final float clamp_float2 = MathHelper.clamp_float(llllllllllllIlllllIIlIIIIIllllII, 1.0f, 5000.0f);
                field_175336_F2.mainNoiseScaleY = clamp_float2;
                llllllllllllIlllllIIlIIIIIlllIll = clamp_float2;
                "".length();
                if (((0xB5 ^ 0x98) & ~(0x10 ^ 0x3D)) <= -" ".length()) {
                    return;
                }
                break;
            }
            case 134: {
                final ChunkProviderSettings.Factory field_175336_F3 = this.field_175336_F;
                final float clamp_float3 = MathHelper.clamp_float(llllllllllllIlllllIIlIIIIIllllII, 1.0f, 5000.0f);
                field_175336_F3.mainNoiseScaleZ = clamp_float3;
                llllllllllllIlllllIIlIIIIIlllIll = clamp_float3;
                "".length();
                if (((0x7F ^ 0x38) & ~(0xCE ^ 0x89)) > "  ".length()) {
                    return;
                }
                break;
            }
            case 135: {
                final ChunkProviderSettings.Factory field_175336_F4 = this.field_175336_F;
                final float clamp_float4 = MathHelper.clamp_float(llllllllllllIlllllIIlIIIIIllllII, 1.0f, 2000.0f);
                field_175336_F4.depthNoiseScaleX = clamp_float4;
                llllllllllllIlllllIIlIIIIIlllIll = clamp_float4;
                "".length();
                if (((0xC8 ^ 0xC0) & ~(0x68 ^ 0x60)) != 0x0) {
                    return;
                }
                break;
            }
            case 136: {
                final ChunkProviderSettings.Factory field_175336_F5 = this.field_175336_F;
                final float clamp_float5 = MathHelper.clamp_float(llllllllllllIlllllIIlIIIIIllllII, 1.0f, 2000.0f);
                field_175336_F5.depthNoiseScaleZ = clamp_float5;
                llllllllllllIlllllIIlIIIIIlllIll = clamp_float5;
                "".length();
                if (((0xEE ^ 0x98 ^ (0x71 ^ 0x0)) & (0x69 ^ 0x25 ^ (0xDC ^ 0x97) ^ -" ".length())) != 0x0) {
                    return;
                }
                break;
            }
            case 137: {
                final ChunkProviderSettings.Factory field_175336_F6 = this.field_175336_F;
                final float clamp_float6 = MathHelper.clamp_float(llllllllllllIlllllIIlIIIIIllllII, 0.01f, 20.0f);
                field_175336_F6.depthNoiseScaleExponent = clamp_float6;
                llllllllllllIlllllIIlIIIIIlllIll = clamp_float6;
                "".length();
                if ((0x8E ^ 0x8B) == 0x0) {
                    return;
                }
                break;
            }
            case 138: {
                final ChunkProviderSettings.Factory field_175336_F7 = this.field_175336_F;
                final float clamp_float7 = MathHelper.clamp_float(llllllllllllIlllllIIlIIIIIllllII, 1.0f, 25.0f);
                field_175336_F7.baseSize = clamp_float7;
                llllllllllllIlllllIIlIIIIIlllIll = clamp_float7;
                "".length();
                if (((0xAB ^ 0x8B ^ (0x48 ^ 0x5A)) & (0x8F ^ 0x9E ^ (0x13 ^ 0x30) ^ -" ".length())) >= "  ".length()) {
                    return;
                }
                break;
            }
            case 139: {
                final ChunkProviderSettings.Factory field_175336_F8 = this.field_175336_F;
                final float clamp_float8 = MathHelper.clamp_float(llllllllllllIlllllIIlIIIIIllllII, 1.0f, 6000.0f);
                field_175336_F8.coordinateScale = clamp_float8;
                llllllllllllIlllllIIlIIIIIlllIll = clamp_float8;
                "".length();
                if (" ".length() < 0) {
                    return;
                }
                break;
            }
            case 140: {
                final ChunkProviderSettings.Factory field_175336_F9 = this.field_175336_F;
                final float clamp_float9 = MathHelper.clamp_float(llllllllllllIlllllIIlIIIIIllllII, 1.0f, 6000.0f);
                field_175336_F9.heightScale = clamp_float9;
                llllllllllllIlllllIIlIIIIIlllIll = clamp_float9;
                "".length();
                if (((0x7E ^ 0x5C) & ~(0x2 ^ 0x20)) > "  ".length()) {
                    return;
                }
                break;
            }
            case 141: {
                final ChunkProviderSettings.Factory field_175336_F10 = this.field_175336_F;
                final float clamp_float10 = MathHelper.clamp_float(llllllllllllIlllllIIlIIIIIllllII, 0.01f, 50.0f);
                field_175336_F10.stretchY = clamp_float10;
                llllllllllllIlllllIIlIIIIIlllIll = clamp_float10;
                "".length();
                if ((46 + 44 + 5 + 38 ^ 72 + 48 - 14 + 23) < 0) {
                    return;
                }
                break;
            }
            case 142: {
                final ChunkProviderSettings.Factory field_175336_F11 = this.field_175336_F;
                final float clamp_float11 = MathHelper.clamp_float(llllllllllllIlllllIIlIIIIIllllII, 1.0f, 5000.0f);
                field_175336_F11.upperLimitScale = clamp_float11;
                llllllllllllIlllllIIlIIIIIlllIll = clamp_float11;
                "".length();
                if (((0xB9 ^ 0xB7) & ~(0x59 ^ 0x57)) != 0x0) {
                    return;
                }
                break;
            }
            case 143: {
                final ChunkProviderSettings.Factory field_175336_F12 = this.field_175336_F;
                final float clamp_float12 = MathHelper.clamp_float(llllllllllllIlllllIIlIIIIIllllII, 1.0f, 5000.0f);
                field_175336_F12.lowerLimitScale = clamp_float12;
                llllllllllllIlllllIIlIIIIIlllIll = clamp_float12;
                "".length();
                if ("  ".length() == 0) {
                    return;
                }
                break;
            }
            case 144: {
                final ChunkProviderSettings.Factory field_175336_F13 = this.field_175336_F;
                final float clamp_float13 = MathHelper.clamp_float(llllllllllllIlllllIIlIIIIIllllII, 1.0f, 20.0f);
                field_175336_F13.biomeDepthWeight = clamp_float13;
                llllllllllllIlllllIIlIIIIIlllIll = clamp_float13;
                "".length();
                if (null != null) {
                    return;
                }
                break;
            }
            case 145: {
                final ChunkProviderSettings.Factory field_175336_F14 = this.field_175336_F;
                final float clamp_float14 = MathHelper.clamp_float(llllllllllllIlllllIIlIIIIIllllII, 0.0f, 20.0f);
                field_175336_F14.biomeDepthOffset = clamp_float14;
                llllllllllllIlllllIIlIIIIIlllIll = clamp_float14;
                "".length();
                if (-(133 + 60 - 168 + 111 ^ 103 + 23 - 41 + 56) >= 0) {
                    return;
                }
                break;
            }
            case 146: {
                final ChunkProviderSettings.Factory field_175336_F15 = this.field_175336_F;
                final float clamp_float15 = MathHelper.clamp_float(llllllllllllIlllllIIlIIIIIllllII, 1.0f, 20.0f);
                field_175336_F15.biomeScaleWeight = clamp_float15;
                llllllllllllIlllllIIlIIIIIlllIll = clamp_float15;
                "".length();
                if (" ".length() <= ((0xBB ^ 0xC0 ^ (0x9C ^ 0xC7)) & (0x6D ^ 0x10 ^ (0x4 ^ 0x59) ^ -" ".length()))) {
                    return;
                }
                break;
            }
            case 147: {
                final ChunkProviderSettings.Factory field_175336_F16 = this.field_175336_F;
                final float clamp_float16 = MathHelper.clamp_float(llllllllllllIlllllIIlIIIIIllllII, 0.0f, 20.0f);
                field_175336_F16.biomeScaleOffset = clamp_float16;
                llllllllllllIlllllIIlIIIIIlllIll = clamp_float16;
                break;
            }
        }
        if (lIIIIIlIIlIIlIlI(lIIIIIlIIlIIllII(llllllllllllIlllllIIlIIIIIlllIll, llllllllllllIlllllIIlIIIIIllllII)) && lIIIIIlIIlIIlIlI(lIIIIIlIIlIIllII(llllllllllllIlllllIIlIIIIIllllII, 0.0f))) {
            ((GuiTextField)this.field_175349_r.func_178061_c(llllllllllllIlllllIIlIIIIIlllIIl)).setText(this.func_175330_b(llllllllllllIlllllIIlIIIIIlllIIl, llllllllllllIlllllIIlIIIIIlllIll));
        }
        ((GuiSlider)this.field_175349_r.func_178061_c(llllllllllllIlllllIIlIIIIIlllIIl - GuiCustomizeWorldScreen.lIlllIIlllIllI[198] + GuiCustomizeWorldScreen.lIlllIIlllIllI[10])).func_175218_a(llllllllllllIlllllIIlIIIIIlllIll, (boolean)(GuiCustomizeWorldScreen.lIlllIIlllIllI[0] != 0));
        if (lIIIIIlIIlIIllll(this.field_175336_F.equals(this.field_175334_E) ? 1 : 0)) {
            this.func_181031_a((boolean)(GuiCustomizeWorldScreen.lIlllIIlllIllI[1] != 0));
        }
    }
    
    @Override
    protected void actionPerformed(final GuiButton llllllllllllIlllllIIIllllllllIlI) throws IOException {
        if (lIIIIIlIIlIIlIlI(llllllllllllIlllllIIIllllllllIlI.enabled ? 1 : 0)) {
            switch (llllllllllllIlllllIIIllllllllIlI.id) {
                case 300: {
                    this.field_175343_i.chunkProviderSettingsJson = this.field_175336_F.toString();
                    this.mc.displayGuiScreen(this.field_175343_i);
                    "".length();
                    if ("   ".length() < ((0x7F ^ 0x50 ^ (0x27 ^ 0xD)) & (0x6 ^ 0x65 ^ (0x19 ^ 0x7F) ^ -" ".length()))) {
                        return;
                    }
                    break;
                }
                case 301: {
                    int llllllllllllIlllllIIIllllllllIIl = GuiCustomizeWorldScreen.lIlllIIlllIllI[0];
                    "".length();
                    if ((0x8B ^ 0x8F) <= 0) {
                        return;
                    }
                    while (!lIIIIIlIIlIIlIll(llllllllllllIlllllIIIllllllllIIl, this.field_175349_r.getSize())) {
                        final GuiPageButtonList.GuiEntry llllllllllllIlllllIIIllllllllIII = this.field_175349_r.getListEntry(llllllllllllIlllllIIIllllllllIIl);
                        final Gui llllllllllllIlllllIIIlllllllIlll = llllllllllllIlllllIIIllllllllIII.func_178022_a();
                        if (lIIIIIlIIlIIlIlI((llllllllllllIlllllIIIlllllllIlll instanceof GuiButton) ? 1 : 0)) {
                            final GuiButton llllllllllllIlllllIIIlllllllIllI = (GuiButton)llllllllllllIlllllIIIlllllllIlll;
                            if (lIIIIIlIIlIIlIlI((llllllllllllIlllllIIIlllllllIllI instanceof GuiSlider) ? 1 : 0)) {
                                final float llllllllllllIlllllIIIlllllllIlIl = ((GuiSlider)llllllllllllIlllllIIIlllllllIllI).func_175217_d() * (0.75f + this.random.nextFloat() * 0.5f) + (this.random.nextFloat() * 0.1f - 0.05f);
                                ((GuiSlider)llllllllllllIlllllIIIlllllllIllI).func_175219_a(MathHelper.clamp_float(llllllllllllIlllllIIIlllllllIlIl, 0.0f, 1.0f));
                                "".length();
                                if (" ".length() > "  ".length()) {
                                    return;
                                }
                            }
                            else if (lIIIIIlIIlIIlIlI((llllllllllllIlllllIIIlllllllIllI instanceof GuiListButton) ? 1 : 0)) {
                                ((GuiListButton)llllllllllllIlllllIIIlllllllIllI).func_175212_b(this.random.nextBoolean());
                            }
                        }
                        final Gui llllllllllllIlllllIIIlllllllIlII = llllllllllllIlllllIIIllllllllIII.func_178021_b();
                        if (lIIIIIlIIlIIlIlI((llllllllllllIlllllIIIlllllllIlII instanceof GuiButton) ? 1 : 0)) {
                            final GuiButton llllllllllllIlllllIIIlllllllIIll = (GuiButton)llllllllllllIlllllIIIlllllllIlII;
                            if (lIIIIIlIIlIIlIlI((llllllllllllIlllllIIIlllllllIIll instanceof GuiSlider) ? 1 : 0)) {
                                final float llllllllllllIlllllIIIlllllllIIlI = ((GuiSlider)llllllllllllIlllllIIIlllllllIIll).func_175217_d() * (0.75f + this.random.nextFloat() * 0.5f) + (this.random.nextFloat() * 0.1f - 0.05f);
                                ((GuiSlider)llllllllllllIlllllIIIlllllllIIll).func_175219_a(MathHelper.clamp_float(llllllllllllIlllllIIIlllllllIIlI, 0.0f, 1.0f));
                                "".length();
                                if (" ".length() > " ".length()) {
                                    return;
                                }
                            }
                            else if (lIIIIIlIIlIIlIlI((llllllllllllIlllllIIIlllllllIIll instanceof GuiListButton) ? 1 : 0)) {
                                ((GuiListButton)llllllllllllIlllllIIIlllllllIIll).func_175212_b(this.random.nextBoolean());
                            }
                        }
                        ++llllllllllllIlllllIIIllllllllIIl;
                    }
                }
                case 302: {
                    this.field_175349_r.func_178071_h();
                    this.func_175328_i();
                    "".length();
                    if ("  ".length() >= "   ".length()) {
                        return;
                    }
                    break;
                }
                case 303: {
                    this.field_175349_r.func_178064_i();
                    this.func_175328_i();
                    "".length();
                    if (" ".length() == 0) {
                        return;
                    }
                    break;
                }
                case 304: {
                    if (!lIIIIIlIIlIIlIlI(this.field_175338_A ? 1 : 0)) {
                        break;
                    }
                    this.func_175322_b(GuiCustomizeWorldScreen.lIlllIIlllIllI[11]);
                    "".length();
                    if ("   ".length() != "   ".length()) {
                        return;
                    }
                    break;
                }
                case 305: {
                    this.mc.displayGuiScreen(new GuiScreenCustomizePresets(this));
                    "".length();
                    if (" ".length() < ((0x72 ^ 0x2D) & ~(0x22 ^ 0x7D) & ~((0xD9 ^ 0x8C) & ~(0x32 ^ 0x67)))) {
                        return;
                    }
                    break;
                }
                case 306: {
                    this.func_175331_h();
                    "".length();
                    if (null != null) {
                        return;
                    }
                    break;
                }
                case 307: {
                    this.field_175339_B = GuiCustomizeWorldScreen.lIlllIIlllIllI[0];
                    this.func_175331_h();
                    break;
                }
            }
        }
    }
    
    private static String lIIIIIIllIlllIlI(final String llllllllllllIlllllIIIlllIllllIIl, final String llllllllllllIlllllIIIlllIllllIII) {
        try {
            final SecretKeySpec llllllllllllIlllllIIIlllIlllllII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIlllllIIIlllIllllIII.getBytes(StandardCharsets.UTF_8)), GuiCustomizeWorldScreen.lIlllIIlllIllI[20]), "DES");
            final Cipher llllllllllllIlllllIIIlllIllllIll = Cipher.getInstance("DES");
            llllllllllllIlllllIIIlllIllllIll.init(GuiCustomizeWorldScreen.lIlllIIlllIllI[2], llllllllllllIlllllIIIlllIlllllII);
            return new String(llllllllllllIlllllIIIlllIllllIll.doFinal(Base64.getDecoder().decode(llllllllllllIlllllIIIlllIllllIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIlllllIIIlllIllllIlI) {
            llllllllllllIlllllIIIlllIllllIlI.printStackTrace();
            return null;
        }
    }
    
    private void func_175331_h() throws IOException {
        switch (this.field_175339_B) {
            case 300: {
                this.actionPerformed((GuiButton)this.field_175349_r.func_178061_c(GuiCustomizeWorldScreen.lIlllIIlllIllI[21]));
                "".length();
                if (null != null) {
                    return;
                }
                break;
            }
            case 304: {
                this.func_175326_g();
                break;
            }
        }
        this.field_175339_B = GuiCustomizeWorldScreen.lIlllIIlllIllI[0];
        this.field_175340_C = (GuiCustomizeWorldScreen.lIlllIIlllIllI[1] != 0);
        this.func_175329_a((boolean)(GuiCustomizeWorldScreen.lIlllIIlllIllI[0] != 0));
    }
    
    private static int lIIIIIlIIlIIllII(final float n, final float n2) {
        return fcmpl(n, n2);
    }
    
    private void func_175329_a(final boolean llllllllllllIlllllIIIlllllIllIlI) {
        this.field_175352_x.visible = llllllllllllIlllllIIIlllllIllIlI;
        this.field_175351_y.visible = llllllllllllIlllllIIIlllllIllIlI;
        final GuiButton field_175347_t = this.field_175347_t;
        int enabled;
        if (lIIIIIlIIlIIlIlI(llllllllllllIlllllIIIlllllIllIlI ? 1 : 0)) {
            enabled = GuiCustomizeWorldScreen.lIlllIIlllIllI[0];
            "".length();
            if ("   ".length() < 0) {
                return;
            }
        }
        else {
            enabled = GuiCustomizeWorldScreen.lIlllIIlllIllI[1];
        }
        field_175347_t.enabled = (enabled != 0);
        final GuiButton field_175348_s = this.field_175348_s;
        int enabled2;
        if (lIIIIIlIIlIIlIlI(llllllllllllIlllllIIIlllllIllIlI ? 1 : 0)) {
            enabled2 = GuiCustomizeWorldScreen.lIlllIIlllIllI[0];
            "".length();
            if (null != null) {
                return;
            }
        }
        else {
            enabled2 = GuiCustomizeWorldScreen.lIlllIIlllIllI[1];
        }
        field_175348_s.enabled = (enabled2 != 0);
        final GuiButton field_175345_v = this.field_175345_v;
        int enabled3;
        if (lIIIIIlIIlIIlIlI(llllllllllllIlllllIIIlllllIllIlI ? 1 : 0)) {
            enabled3 = GuiCustomizeWorldScreen.lIlllIIlllIllI[0];
            "".length();
            if (" ".length() < 0) {
                return;
            }
        }
        else {
            enabled3 = GuiCustomizeWorldScreen.lIlllIIlllIllI[1];
        }
        field_175345_v.enabled = (enabled3 != 0);
        final GuiButton field_175344_w = this.field_175344_w;
        int enabled4;
        if (lIIIIIlIIlIIlIlI(llllllllllllIlllllIIIlllllIllIlI ? 1 : 0)) {
            enabled4 = GuiCustomizeWorldScreen.lIlllIIlllIllI[0];
            "".length();
            if (-" ".length() > " ".length()) {
                return;
            }
        }
        else {
            enabled4 = GuiCustomizeWorldScreen.lIlllIIlllIllI[1];
        }
        field_175344_w.enabled = (enabled4 != 0);
        final GuiButton field_175346_u = this.field_175346_u;
        int enabled5;
        if (lIIIIIlIIlIIlIlI(this.field_175338_A ? 1 : 0) && lIIIIIlIIlIIllll(llllllllllllIlllllIIIlllllIllIlI ? 1 : 0)) {
            enabled5 = GuiCustomizeWorldScreen.lIlllIIlllIllI[1];
            "".length();
            if (-(0x49 ^ 0x4D) >= 0) {
                return;
            }
        }
        else {
            enabled5 = GuiCustomizeWorldScreen.lIlllIIlllIllI[0];
        }
        field_175346_u.enabled = (enabled5 != 0);
        final GuiButton field_175350_z = this.field_175350_z;
        int enabled6;
        if (lIIIIIlIIlIIlIlI(llllllllllllIlllllIIIlllllIllIlI ? 1 : 0)) {
            enabled6 = GuiCustomizeWorldScreen.lIlllIIlllIllI[0];
            "".length();
            if (-"   ".length() >= 0) {
                return;
            }
        }
        else {
            enabled6 = GuiCustomizeWorldScreen.lIlllIIlllIllI[1];
        }
        field_175350_z.enabled = (enabled6 != 0);
        final GuiPageButtonList field_175349_r = this.field_175349_r;
        int lllllllllllllIIIllIIIlllllIIlIII;
        if (lIIIIIlIIlIIlIlI(llllllllllllIlllllIIIlllllIllIlI ? 1 : 0)) {
            lllllllllllllIIIllIIIlllllIIlIII = GuiCustomizeWorldScreen.lIlllIIlllIllI[0];
            "".length();
            if ("  ".length() <= " ".length()) {
                return;
            }
        }
        else {
            lllllllllllllIIIllIIIlllllIIlIII = GuiCustomizeWorldScreen.lIlllIIlllIllI[1];
        }
        field_175349_r.func_181155_a((boolean)(lllllllllllllIIIllIIIlllllIIlIII != 0));
    }
    
    static {
        lIIIIIlIIlIIlIII();
        lIIIIIIllIlllllI();
    }
    
    @Override
    protected void mouseReleased(final int llllllllllllIlllllIIIllllIIllllI, final int llllllllllllIlllllIIIllllIlIIIIl, final int llllllllllllIlllllIIIllllIIlllII) {
        super.mouseReleased(llllllllllllIlllllIIIllllIIllllI, llllllllllllIlllllIIIllllIlIIIIl, llllllllllllIlllllIIIllllIIlllII);
        if (lIIIIIlIIlIIlIlI(this.field_175340_C ? 1 : 0)) {
            this.field_175340_C = (GuiCustomizeWorldScreen.lIlllIIlllIllI[0] != 0);
            "".length();
            if (-" ".length() > 0) {
                return;
            }
        }
        else if (lIIIIIlIIlIIllll(this.field_175339_B)) {
            this.field_175349_r.mouseReleased(llllllllllllIlllllIIIllllIIllllI, llllllllllllIlllllIIIllllIlIIIIl, llllllllllllIlllllIIIllllIIlllII);
            "".length();
        }
    }
}
