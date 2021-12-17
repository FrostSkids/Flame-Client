// 
// Decompiled by Procyon v0.5.36
// 

package client.hud.mod.impl;

import client.event.EventTarget;
import net.minecraft.potion.Potion;
import client.event.impl.EventUpdate;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import net.minecraft.client.Minecraft;
import client.hud.mod.HudMod;

public class ToggleSprint extends HudMod
{
    private static final /* synthetic */ int[] llIIIlIlIlIllI;
    private static final /* synthetic */ String[] llIIIlIlIlIlIl;
    
    private static int lIIIlIIlIllIIIIl(final double n, final double n2) {
        return dcmpl(n, n2);
    }
    
    public ToggleSprint() {
        super(ToggleSprint.llIIIlIlIlIlIl[ToggleSprint.llIIIlIlIlIllI[0]], ToggleSprint.llIIIlIlIlIllI[1], ToggleSprint.llIIIlIlIlIllI[2]);
    }
    
    static {
        lIIIlIIlIllIIIII();
        lIIIlIIlIlIlllll();
    }
    
    public static boolean isMoving() {
        if (lIIIlIIlIllIIIll(lIIIlIIlIllIIlII(Minecraft.getMinecraft().thePlayer.moveForward, 0.0)) && lIIIlIIlIllIIIll(lIIIlIIlIllIIlII(Minecraft.getMinecraft().thePlayer.moveStrafing, 0.0))) {
            return ToggleSprint.llIIIlIlIlIllI[0] != 0;
        }
        return ToggleSprint.llIIIlIlIlIllI[3] != 0;
    }
    
    private static boolean lIIIlIIlIllIIIll(final int llllllllllllIlllIlIllIlIIIllIIIl) {
        return llllllllllllIlllIlIllIlIIIllIIIl == 0;
    }
    
    private static void lIIIlIIlIllIIIII() {
        (llIIIlIlIlIllI = new int[5])[0] = ((93 + 34 - 25 + 58 ^ 140 + 63 - 116 + 64) & (94 + 93 - 128 + 73 ^ 35 + 126 - 26 + 44 ^ -" ".length()));
        ToggleSprint.llIIIlIlIlIllI[1] = "  ".length();
        ToggleSprint.llIIIlIlIlIllI[2] = (0xFFFF9B7F & 0x65CF);
        ToggleSprint.llIIIlIlIlIllI[3] = " ".length();
        ToggleSprint.llIIIlIlIlIllI[4] = (0x78 ^ 0x19 ^ (0xF ^ 0x66));
    }
    
    private static int lIIIlIIlIllIIlII(final double n, final double n2) {
        return dcmpl(n, n2);
    }
    
    private static boolean lIIIlIIlIllIIIlI(final int llllllllllllIlllIlIllIlIIIllIIll) {
        return llllllllllllIlllIlIllIlIIIllIIll != 0;
    }
    
    @Override
    public void onDisable() {
        super.onDisable();
        this.mc.thePlayer.setSprinting((boolean)(ToggleSprint.llIIIlIlIlIllI[0] != 0));
    }
    
    private static String lIIIlIIlIlIllllI(final String llllllllllllIlllIlIllIlIIIlllIlI, final String llllllllllllIlllIlIllIlIIIllIlll) {
        try {
            final SecretKeySpec llllllllllllIlllIlIllIlIIIllllIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIlllIlIllIlIIIllIlll.getBytes(StandardCharsets.UTF_8)), ToggleSprint.llIIIlIlIlIllI[4]), "DES");
            final Cipher llllllllllllIlllIlIllIlIIIllllII = Cipher.getInstance("DES");
            llllllllllllIlllIlIllIlIIIllllII.init(ToggleSprint.llIIIlIlIlIllI[1], llllllllllllIlllIlIllIlIIIllllIl);
            return new String(llllllllllllIlllIlIllIlIIIllllII.doFinal(Base64.getDecoder().decode(llllllllllllIlllIlIllIlIIIlllIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIlllIlIllIlIIIlllIll) {
            llllllllllllIlllIlIllIlIIIlllIll.printStackTrace();
            return null;
        }
    }
    
    private static void lIIIlIIlIlIlllll() {
        (llIIIlIlIlIlIl = new String[ToggleSprint.llIIIlIlIlIllI[3]])[ToggleSprint.llIIIlIlIlIllI[0]] = lIIIlIIlIlIllllI("Ph2RDrQAtnMdohGd0NXAhw==", "Hrkyu");
    }
    
    @EventTarget
    public void onUpdate(final EventUpdate llllllllllllIlllIlIllIlIIlIIIllI) {
        if (lIIIlIIlIllIIIlI(this.isEnabled() ? 1 : 0) && lIIIlIIlIllIIIll(this.mc.thePlayer.isBlocking() ? 1 : 0) && lIIIlIIlIllIIIll(this.mc.thePlayer.isSneaking() ? 1 : 0) && lIIIlIIlIllIIIll(this.mc.thePlayer.isEating() ? 1 : 0) && lIIIlIIlIllIIIll(this.mc.thePlayer.isPlayerSleeping() ? 1 : 0) && lIIIlIIlIllIIIlI(isMoving() ? 1 : 0) && lIIIlIIlIllIIIlI(lIIIlIIlIllIIIIl(this.mc.thePlayer.motionX, 0.0)) && lIIIlIIlIllIIIlI(lIIIlIIlIllIIIIl(this.mc.thePlayer.motionZ, 0.0)) && lIIIlIIlIllIIIll(this.mc.thePlayer.isCollidedHorizontally ? 1 : 0) && lIIIlIIlIllIIIll(this.mc.thePlayer.isPotionActive(Potion.blindness) ? 1 : 0) && lIIIlIIlIllIIIll(this.mc.thePlayer.isPotionActive(Potion.confusion) ? 1 : 0) && lIIIlIIlIllIIIll(this.mc.gameSettings.keyBindBack.isKeyDown() ? 1 : 0)) {
            this.mc.thePlayer.setSprinting((boolean)(ToggleSprint.llIIIlIlIlIllI[3] != 0));
        }
    }
}
