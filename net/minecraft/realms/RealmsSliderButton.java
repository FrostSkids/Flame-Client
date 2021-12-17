// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.realms;

import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.Minecraft;
import net.minecraft.util.MathHelper;

public class RealmsSliderButton extends RealmsButton
{
    private final /* synthetic */ float maxValue;
    public /* synthetic */ boolean sliding;
    private /* synthetic */ int steps;
    private final /* synthetic */ float minValue;
    public /* synthetic */ float value;
    private static final /* synthetic */ int[] lIIIllllIlIllI;
    private static final /* synthetic */ String[] lIIIllllIlIlII;
    
    @Override
    public void clicked(final int lllllllllllllIIllllIIllIlllllIIl, final int lllllllllllllIIllllIIllIlllllIll) {
        this.value = (lllllllllllllIIllllIIllIlllllIIl - (this.getProxy().xPosition + RealmsSliderButton.lIIIllllIlIllI[3])) / (float)(this.getProxy().getButtonWidth() - RealmsSliderButton.lIIIllllIlIllI[4]);
        this.value = MathHelper.clamp_float(this.value, 0.0f, 1.0f);
        this.clicked(this.toValue(this.value));
        this.getProxy().displayString = this.getMessage();
        this.sliding = (RealmsSliderButton.lIIIllllIlIllI[2] != 0);
    }
    
    @Override
    public void released(final int lllllllllllllIIllllIIllIllllIlII, final int lllllllllllllIIllllIIllIllllIIll) {
        this.sliding = (RealmsSliderButton.lIIIllllIlIllI[0] != 0);
    }
    
    @Override
    public int getYImage(final boolean lllllllllllllIIllllIIlllIIIIlIlI) {
        return RealmsSliderButton.lIIIllllIlIllI[0];
    }
    
    public void clicked(final float lllllllllllllIIllllIIllIllllIlll) {
    }
    
    public float toPct(final float lllllllllllllIIllllIIlllIIIllllI) {
        return MathHelper.clamp_float((this.clamp(lllllllllllllIIllllIIlllIIIllllI) - this.minValue) / (this.maxValue - this.minValue), 0.0f, 1.0f);
    }
    
    private static void llIIIlllllIllIl() {
        (lIIIllllIlIllI = new int[8])[0] = ((0xA ^ 0x23 ^ (0x9A ^ 0x88)) & (0x10 ^ 0x4F ^ (0xDA ^ 0xBE) ^ -" ".length()));
        RealmsSliderButton.lIIIllllIlIllI[1] = (0x9B ^ 0x83 ^ (0x9D ^ 0x91));
        RealmsSliderButton.lIIIllllIlIllI[2] = " ".length();
        RealmsSliderButton.lIIIllllIlIllI[3] = (0xE0 ^ 0xBE ^ (0x1B ^ 0x41));
        RealmsSliderButton.lIIIllllIlIllI[4] = (0xCF ^ 0xC7);
        RealmsSliderButton.lIIIllllIlIllI[5] = (0x31 ^ 0x73);
        RealmsSliderButton.lIIIllllIlIllI[6] = 139 + 51 - 47 + 53;
        RealmsSliderButton.lIIIllllIlIllI[7] = "  ".length();
    }
    
    public RealmsSliderButton(final int lllllllllllllIIllllIIlllIlIIlIlI, final int lllllllllllllIIllllIIlllIlIIlIIl, final int lllllllllllllIIllllIIlllIlIIlIII, final int lllllllllllllIIllllIIlllIlIIIIII, final int lllllllllllllIIllllIIlllIIllllll, final int lllllllllllllIIllllIIlllIIlllllI) {
        this(lllllllllllllIIllllIIlllIlIIlIlI, lllllllllllllIIllllIIlllIlIIlIIl, lllllllllllllIIllllIIlllIlIIlIII, lllllllllllllIIllllIIlllIlIIIIII, lllllllllllllIIllllIIlllIIlllllI, RealmsSliderButton.lIIIllllIlIllI[0], 1.0f, (float)lllllllllllllIIllllIIlllIIllllll);
    }
    
    static {
        llIIIlllllIllIl();
        llIIIlllllIlIlI();
    }
    
    public float clamp(float lllllllllllllIIllllIIlllIIIlIIlI) {
        lllllllllllllIIllllIIlllIIIlIIlI = this.clampSteps(lllllllllllllIIllllIIlllIIIlIIlI);
        return MathHelper.clamp_float(lllllllllllllIIllllIIlllIIIlIIlI, this.minValue, this.maxValue);
    }
    
    private static boolean llIIIlllllIllll(final int lllllllllllllIIllllIIllIllIlIllI) {
        return lllllllllllllIIllllIIllIllIlIllI != 0;
    }
    
    public RealmsSliderButton(final int lllllllllllllIIllllIIlllIIlIlIll, final int lllllllllllllIIllllIIlllIIlIlIlI, final int lllllllllllllIIllllIIlllIIllIIlI, final int lllllllllllllIIllllIIlllIIlIlIII, final int lllllllllllllIIllllIIlllIIllIIII, final int lllllllllllllIIllllIIlllIIlIllll, final float lllllllllllllIIllllIIlllIIlIlllI, final float lllllllllllllIIllllIIlllIIlIIlIl) {
        super(lllllllllllllIIllllIIlllIIlIlIll, lllllllllllllIIllllIIlllIIlIlIlI, lllllllllllllIIllllIIlllIIllIIlI, lllllllllllllIIllllIIlllIIlIlIII, RealmsSliderButton.lIIIllllIlIllI[1], RealmsSliderButton.lIIIllllIlIlII[RealmsSliderButton.lIIIllllIlIllI[0]]);
        this.value = 1.0f;
        this.minValue = lllllllllllllIIllllIIlllIIlIlllI;
        this.maxValue = lllllllllllllIIllllIIlllIIlIIlIl;
        this.value = this.toPct((float)lllllllllllllIIllllIIlllIIlIllll);
        this.getProxy().displayString = this.getMessage();
    }
    
    public float toValue(final float lllllllllllllIIllllIIlllIIIllIlI) {
        return this.clamp(this.minValue + (this.maxValue - this.minValue) * MathHelper.clamp_float(lllllllllllllIIllllIIlllIIIllIlI, 0.0f, 1.0f));
    }
    
    protected float clampSteps(float lllllllllllllIIllllIIlllIIIIlllI) {
        if (llIIIlllllIlllI(this.steps)) {
            lllllllllllllIIllllIIlllIIIIlllI = (float)(this.steps * Math.round(lllllllllllllIIllllIIlllIIIIlllI / this.steps));
        }
        return lllllllllllllIIllllIIlllIIIIlllI;
    }
    
    @Override
    public void renderBg(final int lllllllllllllIIllllIIlllIIIIIIIl, final int lllllllllllllIIllllIIlllIIIIIlII) {
        if (llIIIlllllIllll(this.getProxy().visible ? 1 : 0)) {
            if (llIIIlllllIllll(this.sliding ? 1 : 0)) {
                this.value = (lllllllllllllIIllllIIlllIIIIIIIl - (this.getProxy().xPosition + RealmsSliderButton.lIIIllllIlIllI[3])) / (float)(this.getProxy().getButtonWidth() - RealmsSliderButton.lIIIllllIlIllI[4]);
                this.value = MathHelper.clamp_float(this.value, 0.0f, 1.0f);
                final float lllllllllllllIIllllIIlllIIIIIIll = this.toValue(this.value);
                this.clicked(lllllllllllllIIllllIIlllIIIIIIll);
                this.value = this.toPct(lllllllllllllIIllllIIlllIIIIIIll);
                this.getProxy().displayString = this.getMessage();
            }
            Minecraft.getMinecraft().getTextureManager().bindTexture(RealmsSliderButton.WIDGETS_LOCATION);
            GlStateManager.color(1.0f, 1.0f, 1.0f, 1.0f);
            this.blit(this.getProxy().xPosition + (int)(this.value * (this.getProxy().getButtonWidth() - RealmsSliderButton.lIIIllllIlIllI[4])), this.getProxy().yPosition, RealmsSliderButton.lIIIllllIlIllI[0], RealmsSliderButton.lIIIllllIlIllI[5], RealmsSliderButton.lIIIllllIlIllI[3], RealmsSliderButton.lIIIllllIlIllI[1]);
            this.blit(this.getProxy().xPosition + (int)(this.value * (this.getProxy().getButtonWidth() - RealmsSliderButton.lIIIllllIlIllI[4])) + RealmsSliderButton.lIIIllllIlIllI[3], this.getProxy().yPosition, RealmsSliderButton.lIIIllllIlIllI[6], RealmsSliderButton.lIIIllllIlIllI[5], RealmsSliderButton.lIIIllllIlIllI[3], RealmsSliderButton.lIIIllllIlIllI[1]);
        }
    }
    
    public String getMessage() {
        return RealmsSliderButton.lIIIllllIlIlII[RealmsSliderButton.lIIIllllIlIllI[2]];
    }
    
    private static String llIIIlllllIlIII(final String lllllllllllllIIllllIIllIllIlllIl, final String lllllllllllllIIllllIIllIllIlllII) {
        try {
            final SecretKeySpec lllllllllllllIIllllIIllIlllIIIII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIIllllIIllIllIlllII.getBytes(StandardCharsets.UTF_8)), RealmsSliderButton.lIIIllllIlIllI[4]), "DES");
            final Cipher lllllllllllllIIllllIIllIllIlllll = Cipher.getInstance("DES");
            lllllllllllllIIllllIIllIllIlllll.init(RealmsSliderButton.lIIIllllIlIllI[7], lllllllllllllIIllllIIllIlllIIIII);
            return new String(lllllllllllllIIllllIIllIllIlllll.doFinal(Base64.getDecoder().decode(lllllllllllllIIllllIIllIllIlllIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIllllIIllIllIllllI) {
            lllllllllllllIIllllIIllIllIllllI.printStackTrace();
            return null;
        }
    }
    
    private static void llIIIlllllIlIlI() {
        (lIIIllllIlIlII = new String[RealmsSliderButton.lIIIllllIlIllI[7]])[RealmsSliderButton.lIIIllllIlIllI[0]] = llIIIlllllIlIII("ooVuK+mDHCs=", "BawqN");
        RealmsSliderButton.lIIIllllIlIlII[RealmsSliderButton.lIIIllllIlIllI[2]] = llIIIlllllIlIIl("rxiyfHkC44A=", "brlIN");
    }
    
    private static boolean llIIIlllllIlllI(final int lllllllllllllIIllllIIllIllIlIlII) {
        return lllllllllllllIIllllIIllIllIlIlII > 0;
    }
    
    private static String llIIIlllllIlIIl(final String lllllllllllllIIllllIIllIlllIlIII, final String lllllllllllllIIllllIIllIlllIIlll) {
        try {
            final SecretKeySpec lllllllllllllIIllllIIllIlllIllIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIIllllIIllIlllIIlll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lllllllllllllIIllllIIllIlllIllII = Cipher.getInstance("Blowfish");
            lllllllllllllIIllllIIllIlllIllII.init(RealmsSliderButton.lIIIllllIlIllI[7], lllllllllllllIIllllIIllIlllIllIl);
            return new String(lllllllllllllIIllllIIllIlllIllII.doFinal(Base64.getDecoder().decode(lllllllllllllIIllllIIllIlllIlIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIllllIIllIlllIlIll) {
            lllllllllllllIIllllIIllIlllIlIll.printStackTrace();
            return null;
        }
    }
}
