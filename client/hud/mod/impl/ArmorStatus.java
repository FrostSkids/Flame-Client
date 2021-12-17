// 
// Decompiled by Procyon v0.5.36
// 

package client.hud.mod.impl;

import net.minecraft.item.Item;
import net.minecraft.init.Items;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.security.MessageDigest;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.FontRenderer;
import net.minecraft.client.renderer.RenderHelper;
import java.awt.Color;
import org.lwjgl.opengl.GL11;
import net.minecraft.item.ItemStack;
import client.hud.mod.HudMod;

public class ArmorStatus extends HudMod
{
    private static final /* synthetic */ int[] lIllIlIIlIllII;
    public /* synthetic */ int FPS;
    private static final /* synthetic */ String[] lIllIlIIlIlIlI;
    
    private static int llllllIIlIlIllI(final double n, final double n2) {
        return dcmpg(n, n2);
    }
    
    private static void llllllIIlIIlIII() {
        (lIllIlIIlIlIlI = new String[ArmorStatus.lIllIlIIlIllII[11]])[ArmorStatus.lIllIlIIlIllII[0]] = llllllIIlIIIllI("5g2npnOT1Ot9NoAPkzNCyQ==", "DiyPC");
        ArmorStatus.lIllIlIIlIlIlI[ArmorStatus.lIllIlIIlIllII[5]] = llllllIIlIIIlll("SWtKB3xJ", "lEzaY");
    }
    
    private static boolean llllllIIlIlIlII(final int lllllllllllllIIIIIIIIlIlIllIIIll) {
        return lllllllllllllIIIIIIIIlIlIllIIIll != 0;
    }
    
    private static boolean llllllIIlIllIIl(final int lllllllllllllIIIIIIIIlIlIllIIIIl) {
        return lllllllllllllIIIIIIIIlIlIllIIIIl < 0;
    }
    
    private void is(final int lllllllllllllIIIIIIIIlIllIllIIll, final ItemStack lllllllllllllIIIIIIIIlIllIllIIlI) {
        if (llllllIIlIlIIll(lllllllllllllIIIIIIIIlIllIllIIlI)) {
            GL11.glPushMatrix();
            final int lllllllllllllIIIIIIIIlIllIllIIIl = ArmorStatus.lIllIlIIlIllII[3] * lllllllllllllIIIIIIIIlIllIllIIll + ArmorStatus.lIllIlIIlIllII[4];
            if (llllllIIlIlIlII(lllllllllllllIIIIIIIIlIllIllIIlI.getItem().isDamageable() ? 1 : 0)) {
                final double lllllllllllllIIIIIIIIlIllIllIIII = (lllllllllllllIIIIIIIIlIllIllIIlI.getMaxDamage() - lllllllllllllIIIIIIIIlIllIllIIlI.getItemDamage()) / (double)lllllllllllllIIIIIIIIlIllIllIIlI.getMaxDamage() * 100.0;
                final FontRenderer fr = this.fr;
                final String format = ArmorStatus.lIllIlIIlIlIlI[ArmorStatus.lIllIlIIlIllII[5]];
                final Object[] args = new Object[ArmorStatus.lIllIlIIlIllII[5]];
                args[ArmorStatus.lIllIlIIlIllII[0]] = lllllllllllllIIIIIIIIlIllIllIIII;
                fr.drawStringWithShadow(String.format(format, args), (float)(this.getX() + ArmorStatus.lIllIlIIlIllII[6]), (float)(this.getY() + lllllllllllllIIIIIIIIlIllIllIIIl + ArmorStatus.lIllIlIIlIllII[7]), new Color(ArmorStatus.lIllIlIIlIllII[8], ArmorStatus.lIllIlIIlIllII[0], ArmorStatus.lIllIlIIlIllII[0], ArmorStatus.lIllIlIIlIllII[9]).getRGB());
                "".length();
            }
            RenderHelper.enableGUIStandardItemLighting();
            this.mc.getRenderItem().renderItemAndEffectIntoGUI(lllllllllllllIIIIIIIIlIllIllIIlI, this.getX(), this.getY() + lllllllllllllIIIIIIIIlIllIllIIIl);
            GL11.glPopMatrix();
        }
    }
    
    @Override
    public int getHeight() {
        return ArmorStatus.lIllIlIIlIllII[13];
    }
    
    private static boolean llllllIIlIlIIIl(final int lllllllllllllIIIIIIIIlIlIllIllII, final int lllllllllllllIIIIIIIIlIlIllIlIll) {
        return lllllllllllllIIIIIIIIlIlIllIllII >= lllllllllllllIIIIIIIIlIlIllIlIll;
    }
    
    private static int llllllIIlIlIlIl(final double n, final double n2) {
        return dcmpl(n, n2);
    }
    
    @Override
    public void draw() {
        int lllllllllllllIIIIIIIIlIllIlllllI = ArmorStatus.lIllIlIIlIllII[0];
        "".length();
        if ("  ".length() <= -" ".length()) {
            return;
        }
        while (!llllllIIlIlIIIl(lllllllllllllIIIIIIIIlIllIlllllI, this.mc.thePlayer.inventory.armorInventory.length)) {
            final ItemStack lllllllllllllIIIIIIIIlIllIllllIl = this.mc.thePlayer.inventory.armorInventory[lllllllllllllIIIIIIIIlIllIlllllI];
            this.is(lllllllllllllIIIIIIIIlIllIlllllI, lllllllllllllIIIIIIIIlIllIllllIl);
            ++lllllllllllllIIIIIIIIlIllIlllllI;
        }
        super.draw();
    }
    
    public ArmorStatus() {
        super(ArmorStatus.lIllIlIIlIlIlI[ArmorStatus.lIllIlIIlIllII[0]], ArmorStatus.lIllIlIIlIllII[1], ArmorStatus.lIllIlIIlIllII[2]);
        this.FPS = Minecraft.debugFPS;
    }
    
    private static void llllllIIlIIllll() {
        (lIllIlIIlIllII = new int[14])[0] = ((0x5F ^ 0x6A) & ~(0x21 ^ 0x14));
        ArmorStatus.lIllIlIIlIllII[1] = (0x37 ^ 0x1B) + (0x5F ^ 0x33) - -" ".length() + (0x99 ^ 0x9E);
        ArmorStatus.lIllIlIIlIllII[2] = (0xAB ^ 0x80) + (115 + 53 - 86 + 51) - (46 + 128 - 109 + 66) + (0xF0 ^ 0xAF);
        ArmorStatus.lIllIlIIlIllII[3] = -(0x61 ^ 0x71);
        ArmorStatus.lIllIlIIlIllII[4] = (0xF7 ^ 0xC7);
        ArmorStatus.lIllIlIIlIllII[5] = " ".length();
        ArmorStatus.lIllIlIIlIllII[6] = (0xE2 ^ 0xA7 ^ (0x6E ^ 0x3F));
        ArmorStatus.lIllIlIIlIllII[7] = (0xC5 ^ 0xB4 ^ (0x4E ^ 0x3A));
        ArmorStatus.lIllIlIIlIllII[8] = 89 + 39 + 22 + 20;
        ArmorStatus.lIllIlIIlIllII[9] = (0x3D ^ 0x4) + (0x18 ^ 0xF) - (0xC8 ^ 0x84) + (203 + 151 - 235 + 132);
        ArmorStatus.lIllIlIIlIllII[10] = "   ".length();
        ArmorStatus.lIllIlIIlIllII[11] = "  ".length();
        ArmorStatus.lIllIlIIlIllII[12] = (0x24 ^ 0x23 ^ (0x54 ^ 0x7B));
        ArmorStatus.lIllIlIIlIllII[13] = (0xBF ^ 0x83);
    }
    
    static int DamageToColor(double lllllllllllllIIIIIIIIlIllIIllIIl) {
        if (llllllIIlIllIII(llllllIIlIlIlIl(lllllllllllllIIIIIIIIlIllIIllIIl, 1.0))) {
            lllllllllllllIIIIIIIIlIllIIllIIl = 1.0;
            "".length();
            if ("   ".length() <= -" ".length()) {
                return (0x70 ^ 0x24) & ~(0x9 ^ 0x5D);
            }
        }
        else if (llllllIIlIllIIl(llllllIIlIlIllI(lllllllllllllIIIIIIIIlIllIIllIIl, 0.0))) {
            lllllllllllllIIIIIIIIlIllIIllIIl = 0.0;
        }
        final int lllllllllllllIIIIIIIIlIllIIlllII = (int)(255.0 * (1.0 - lllllllllllllIIIIIIIIlIllIIllIIl));
        final int lllllllllllllIIIIIIIIlIllIIllIll = (int)(255.0 * lllllllllllllIIIIIIIIlIllIIllIIl);
        final int lllllllllllllIIIIIIIIlIllIIllIlI = ArmorStatus.lIllIlIIlIllII[0];
        return new Color(lllllllllllllIIIIIIIIlIllIIlllII, lllllllllllllIIIIIIIIlIllIIllIll, lllllllllllllIIIIIIIIlIllIIllIlI).getRGB();
    }
    
    private static String llllllIIlIIIlll(String lllllllllllllIIIIIIIIlIllIIIIlII, final String lllllllllllllIIIIIIIIlIllIIIIIll) {
        lllllllllllllIIIIIIIIlIllIIIIlII = new String(Base64.getDecoder().decode(lllllllllllllIIIIIIIIlIllIIIIlII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIIIIIIIIlIllIIIIlll = new StringBuilder();
        final char[] lllllllllllllIIIIIIIIlIllIIIIllI = lllllllllllllIIIIIIIIlIllIIIIIll.toCharArray();
        int lllllllllllllIIIIIIIIlIllIIIIlIl = ArmorStatus.lIllIlIIlIllII[0];
        final boolean lllllllllllllIIIIIIIIlIlIlllllll = (Object)lllllllllllllIIIIIIIIlIllIIIIlII.toCharArray();
        final float lllllllllllllIIIIIIIIlIlIllllllI = lllllllllllllIIIIIIIIlIlIlllllll.length;
        int lllllllllllllIIIIIIIIlIlIlllllIl = ArmorStatus.lIllIlIIlIllII[0];
        while (llllllIIlIllIlI(lllllllllllllIIIIIIIIlIlIlllllIl, (int)lllllllllllllIIIIIIIIlIlIllllllI)) {
            final char lllllllllllllIIIIIIIIlIllIIIlIlI = lllllllllllllIIIIIIIIlIlIlllllll[lllllllllllllIIIIIIIIlIlIlllllIl];
            lllllllllllllIIIIIIIIlIllIIIIlll.append((char)(lllllllllllllIIIIIIIIlIllIIIlIlI ^ lllllllllllllIIIIIIIIlIllIIIIllI[lllllllllllllIIIIIIIIlIllIIIIlIl % lllllllllllllIIIIIIIIlIllIIIIllI.length]));
            "".length();
            ++lllllllllllllIIIIIIIIlIllIIIIlIl;
            ++lllllllllllllIIIIIIIIlIlIlllllIl;
            "".length();
            if (null != null) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIIIIIIIIlIllIIIIlll);
    }
    
    private static boolean llllllIIlIllIII(final int lllllllllllllIIIIIIIIlIlIlIlllll) {
        return lllllllllllllIIIIIIIIlIlIlIlllll > 0;
    }
    
    private static boolean llllllIIlIllIlI(final int lllllllllllllIIIIIIIIlIlIllIlIII, final int lllllllllllllIIIIIIIIlIlIllIIlll) {
        return lllllllllllllIIIIIIIIlIlIllIlIII < lllllllllllllIIIIIIIIlIlIllIIlll;
    }
    
    static {
        llllllIIlIIllll();
        llllllIIlIIlIII();
    }
    
    private static boolean llllllIIlIlIIll(final Object lllllllllllllIIIIIIIIlIlIllIIlIl) {
        return lllllllllllllIIIIIIIIlIlIllIIlIl != null;
    }
    
    private static String llllllIIlIIIllI(final String lllllllllllllIIIIIIIIlIlIlllIIlI, final String lllllllllllllIIIIIIIIlIlIlllIIll) {
        try {
            final SecretKeySpec lllllllllllllIIIIIIIIlIlIlllIlll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIIIIIIIIlIlIlllIIll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lllllllllllllIIIIIIIIlIlIlllIllI = Cipher.getInstance("Blowfish");
            lllllllllllllIIIIIIIIlIlIlllIllI.init(ArmorStatus.lIllIlIIlIllII[11], lllllllllllllIIIIIIIIlIlIlllIlll);
            return new String(lllllllllllllIIIIIIIIlIlIlllIllI.doFinal(Base64.getDecoder().decode(lllllllllllllIIIIIIIIlIlIlllIIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIIIIIIIlIlIlllIlIl) {
            lllllllllllllIIIIIIIIlIlIlllIlIl.printStackTrace();
            return null;
        }
    }
    
    @Override
    public int getWidth() {
        return ArmorStatus.lIllIlIIlIllII[12];
    }
    
    @Override
    public void renderDummy(final int lllllllllllllIIIIIIIIlIllIlIIllI, final int lllllllllllllIIIIIIIIlIllIlIIIlI) {
        this.is(ArmorStatus.lIllIlIIlIllII[10], new ItemStack(Items.diamond_helmet));
        this.is(ArmorStatus.lIllIlIIlIllII[11], new ItemStack(Items.diamond_chestplate));
        this.is(ArmorStatus.lIllIlIIlIllII[5], new ItemStack(Items.diamond_leggings));
        this.is(ArmorStatus.lIllIlIIlIllII[0], new ItemStack(Items.diamond_boots));
        super.renderDummy(lllllllllllllIIIIIIIIlIllIlIIllI, lllllllllllllIIIIIIIIlIllIlIIIlI);
    }
}
