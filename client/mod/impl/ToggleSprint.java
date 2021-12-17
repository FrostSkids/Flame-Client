// 
// Decompiled by Procyon v0.5.36
// 

package client.mod.impl;

import client.event.EventTarget;
import net.minecraft.potion.Potion;
import client.event.impl.EventUpdate;
import net.minecraft.client.Minecraft;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import client.mod.Category;
import client.mod.Mod;

public class ToggleSprint extends Mod
{
    private static final /* synthetic */ int[] lIllIIlllllllI;
    private static final /* synthetic */ String[] lIllIIllllllII;
    
    public ToggleSprint() {
        super(ToggleSprint.lIllIIllllllII[ToggleSprint.lIllIIlllllllI[0]], ToggleSprint.lIllIIllllllII[ToggleSprint.lIllIIlllllllI[1]], Category.MISC);
    }
    
    private static int lllllIlllIlIllI(final double n, final double n2) {
        return dcmpl(n, n2);
    }
    
    private static String lllllIlllIIlIIl(final String lllllllllllllIIIIIIIllIIIIlIlllI, final String lllllllllllllIIIIIIIllIIIIlIlIlI) {
        try {
            final SecretKeySpec lllllllllllllIIIIIIIllIIIIllIIlI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIIIIIIIllIIIIlIlIlI.getBytes(StandardCharsets.UTF_8)), ToggleSprint.lIllIIlllllllI[3]), "DES");
            final Cipher lllllllllllllIIIIIIIllIIIIllIIIl = Cipher.getInstance("DES");
            lllllllllllllIIIIIIIllIIIIllIIIl.init(ToggleSprint.lIllIIlllllllI[2], lllllllllllllIIIIIIIllIIIIllIIlI);
            return new String(lllllllllllllIIIIIIIllIIIIllIIIl.doFinal(Base64.getDecoder().decode(lllllllllllllIIIIIIIllIIIIlIlllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIIIIIIllIIIIllIIII) {
            lllllllllllllIIIIIIIllIIIIllIIII.printStackTrace();
            return null;
        }
    }
    
    private static boolean lllllIlllIlIlII(final int lllllllllllllIIIIIIIllIIIIlIIIII) {
        return lllllllllllllIIIIIIIllIIIIlIIIII != 0;
    }
    
    private static boolean lllllIlllIlIlIl(final int lllllllllllllIIIIIIIllIIIIIllIll) {
        return lllllllllllllIIIIIIIllIIIIIllIll == 0;
    }
    
    private static int lllllIlllIlIIll(final double n, final double n2) {
        return dcmpl(n, n2);
    }
    
    private static void lllllIlllIlIIlI() {
        (lIllIIlllllllI = new int[4])[0] = ((0x21 ^ 0x29) & ~(0x94 ^ 0x9C));
        ToggleSprint.lIllIIlllllllI[1] = " ".length();
        ToggleSprint.lIllIIlllllllI[2] = "  ".length();
        ToggleSprint.lIllIIlllllllI[3] = (0x82 ^ 0x8A);
    }
    
    static {
        lllllIlllIlIIlI();
        lllllIlllIIlIlI();
    }
    
    public static boolean isMoving() {
        if (lllllIlllIlIlIl(lllllIlllIlIllI(Minecraft.getMinecraft().thePlayer.moveForward, 0.0)) && lllllIlllIlIlIl(lllllIlllIlIllI(Minecraft.getMinecraft().thePlayer.moveStrafing, 0.0))) {
            return ToggleSprint.lIllIIlllllllI[0] != 0;
        }
        return ToggleSprint.lIllIIlllllllI[1] != 0;
    }
    
    @EventTarget
    public void onUpdate(final EventUpdate lllllllllllllIIIIIIIllIIIlIIIlIl) {
        if (lllllIlllIlIlII(this.isEnabled() ? 1 : 0) && lllllIlllIlIlIl(this.mc.thePlayer.isBlocking() ? 1 : 0) && lllllIlllIlIlIl(this.mc.thePlayer.isSneaking() ? 1 : 0) && lllllIlllIlIlIl(this.mc.thePlayer.isEating() ? 1 : 0) && lllllIlllIlIlIl(this.mc.thePlayer.isPlayerSleeping() ? 1 : 0) && lllllIlllIlIlII(isMoving() ? 1 : 0) && lllllIlllIlIlII(lllllIlllIlIIll(this.mc.thePlayer.motionX, 0.0)) && lllllIlllIlIlII(lllllIlllIlIIll(this.mc.thePlayer.motionZ, 0.0)) && lllllIlllIlIlIl(this.mc.thePlayer.isCollidedHorizontally ? 1 : 0) && lllllIlllIlIlIl(this.mc.thePlayer.isPotionActive(Potion.blindness) ? 1 : 0) && lllllIlllIlIlIl(this.mc.thePlayer.isPotionActive(Potion.confusion) ? 1 : 0) && lllllIlllIlIlIl(this.mc.gameSettings.keyBindBack.isKeyDown() ? 1 : 0)) {
            this.mc.thePlayer.setSprinting((boolean)(ToggleSprint.lIllIIlllllllI[1] != 0));
        }
    }
    
    @Override
    public void onDisable() {
        super.onDisable();
        this.mc.thePlayer.setSprinting((boolean)(ToggleSprint.lIllIIlllllllI[0] != 0));
    }
    
    private static void lllllIlllIIlIlI() {
        (lIllIIllllllII = new String[ToggleSprint.lIllIIlllllllI[2]])[ToggleSprint.lIllIIlllllllI[0]] = lllllIlllIIlIIl("ckRnMzCuixzsIdDi1QFY9g==", "uWQED");
        ToggleSprint.lIllIIllllllII[ToggleSprint.lIllIIlllllllI[1]] = lllllIlllIIlIIl("ppnYQSxEYWkgVS/uumxOF05dYdIfwY8WsrsSQ64LfCo=", "ZKNVL");
    }
}
