// 
// Decompiled by Procyon v0.5.36
// 

package client.hud.mod.impl;

import net.minecraft.world.chunk.Chunk;
import java.awt.Color;
import net.minecraft.entity.Entity;
import net.minecraft.util.BlockPos;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import net.minecraft.client.Minecraft;
import client.hud.mod.HudMod;

public class Biome extends HudMod
{
    private /* synthetic */ String biome;
    private static final /* synthetic */ int[] lIIIIlllIllIII;
    private static final /* synthetic */ String[] lIIIIlllIlIllI;
    private final /* synthetic */ Minecraft mc;
    
    @Override
    public int getHeight() {
        return this.fr.FONT_HEIGHT;
    }
    
    @Override
    public int getWidth() {
        return Biome.lIIIIlllIllIII[5] + Minecraft.getMinecraft().fontRendererObj.getStringWidth(this.biome);
    }
    
    private static String lIllllIIllIIIll(final String lllllllllllllIlIIIllllllllIllIIl, final String lllllllllllllIlIIIllllllllIllIII) {
        try {
            final SecretKeySpec lllllllllllllIlIIIllllllllIllllI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIlIIIllllllllIllIII.getBytes(StandardCharsets.UTF_8)), Biome.lIIIIlllIllIII[7]), "DES");
            final Cipher lllllllllllllIlIIIllllllllIlllIl = Cipher.getInstance("DES");
            lllllllllllllIlIIIllllllllIlllIl.init(Biome.lIIIIlllIllIII[1], lllllllllllllIlIIIllllllllIllllI);
            return new String(lllllllllllllIlIIIllllllllIlllIl.doFinal(Base64.getDecoder().decode(lllllllllllllIlIIIllllllllIllIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIlIIIllllllllIlllII) {
            lllllllllllllIlIIIllllllllIlllII.printStackTrace();
            return null;
        }
    }
    
    static {
        lIllllIIllIlIIl();
        lIllllIIllIIlII();
    }
    
    private static void lIllllIIllIlIIl() {
        (lIIIIlllIllIII = new int[8])[0] = ((104 + 3 - 76 + 134 ^ 20 + 51 + 68 + 1) & (0x2 ^ 0x43 ^ (0xDD ^ 0xB5) ^ -" ".length()));
        Biome.lIIIIlllIllIII[1] = "  ".length();
        Biome.lIIIIlllIllIII[2] = (5 + 19 + 21 + 99 ^ 146 + 21 - 140 + 160);
        Biome.lIIIIlllIllIII[3] = " ".length();
        Biome.lIIIIlllIllIII[4] = 0 + 79 + 65 + 111;
        Biome.lIIIIlllIllIII[5] = (28 + 87 + 1 + 15 ^ 18 + 119 - 75 + 115);
        Biome.lIIIIlllIllIII[6] = "   ".length();
        Biome.lIIIIlllIllIII[7] = (0xB0 ^ 0xB8);
    }
    
    private static boolean lIllllIIllIllII(final int lllllllllllllIlIIIllllllllIlIIll, final int lllllllllllllIlIIIllllllllIlIIlI) {
        return lllllllllllllIlIIIllllllllIlIIll < lllllllllllllIlIIIllllllllIlIIlI;
    }
    
    @Override
    public void draw() {
        final Chunk lllllllllllllIlIIlIIIIIIIIIIllll = this.mc.theWorld.getChunkFromBlockCoords(new BlockPos(Minecraft.getMinecraft().thePlayer));
        this.biome = lllllllllllllIlIIlIIIIIIIIIIllll.getBiome(new BlockPos(Minecraft.getMinecraft().thePlayer), this.mc.theWorld.getWorldChunkManager()).biomeName;
        Minecraft.getMinecraft().fontRendererObj.drawStringWithShadow(String.valueOf(new StringBuilder(Biome.lIIIIlllIlIllI[Biome.lIIIIlllIllIII[3]]).append(this.biome)), (float)(this.getX() + Biome.lIIIIlllIllIII[3]), (float)this.getY(), new Color(Biome.lIIIIlllIllIII[0], Biome.lIIIIlllIllIII[0], Biome.lIIIIlllIllIII[0], Biome.lIIIIlllIllIII[4]).getRGB());
        "".length();
    }
    
    private static String lIllllIIllIIIlI(String lllllllllllllIlIIIlllllllllIlIll, final String lllllllllllllIlIIIlllllllllIlIlI) {
        lllllllllllllIlIIIlllllllllIlIll = (byte)new String(Base64.getDecoder().decode(((String)lllllllllllllIlIIIlllllllllIlIll).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIlIIIlllllllllIlllI = new StringBuilder();
        final char[] lllllllllllllIlIIIlllllllllIllIl = lllllllllllllIlIIIlllllllllIlIlI.toCharArray();
        int lllllllllllllIlIIIlllllllllIllII = Biome.lIIIIlllIllIII[0];
        final char lllllllllllllIlIIIlllllllllIIllI = (Object)((String)lllllllllllllIlIIIlllllllllIlIll).toCharArray();
        final long lllllllllllllIlIIIlllllllllIIlIl = lllllllllllllIlIIIlllllllllIIllI.length;
        double lllllllllllllIlIIIlllllllllIIlII = Biome.lIIIIlllIllIII[0];
        while (lIllllIIllIllII((int)lllllllllllllIlIIIlllllllllIIlII, (int)lllllllllllllIlIIIlllllllllIIlIl)) {
            final char lllllllllllllIlIIIllllllllllIIIl = lllllllllllllIlIIIlllllllllIIllI[lllllllllllllIlIIIlllllllllIIlII];
            lllllllllllllIlIIIlllllllllIlllI.append((char)(lllllllllllllIlIIIllllllllllIIIl ^ lllllllllllllIlIIIlllllllllIllIl[lllllllllllllIlIIIlllllllllIllII % lllllllllllllIlIIIlllllllllIllIl.length]));
            "".length();
            ++lllllllllllllIlIIIlllllllllIllII;
            ++lllllllllllllIlIIIlllllllllIIlII;
            "".length();
            if (((0xB9 ^ 0x80) & ~(0x8 ^ 0x31)) != ((0xCF ^ 0xC2) & ~(0x80 ^ 0x8D))) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIlIIIlllllllllIlllI);
    }
    
    private static void lIllllIIllIIlII() {
        (lIIIIlllIlIllI = new String[Biome.lIIIIlllIllIII[6]])[Biome.lIIIIlllIllIII[0]] = lIllllIIllIIIlI("IwcFLxE=", "anjBt");
        Biome.lIIIIlllIlIllI[Biome.lIIIIlllIllIII[3]] = lIllllIIllIIIll("DABrn/Gp70e/2K2C+EBHt51nSrHDh97n", "fXfCO");
        Biome.lIIIIlllIlIllI[Biome.lIIIIlllIllIII[1]] = lIllllIIllIIIlI("w6hxNDM7IiDDkWpuw6hzVg==", "OEvZT");
    }
    
    @Override
    public void renderDummy(final int lllllllllllllIlIIlIIIIIIIIIIIIll, final int lllllllllllllIlIIlIIIIIIIIIIIIlI) {
        final Chunk lllllllllllllIlIIlIIIIIIIIIIIlIl = this.mc.theWorld.getChunkFromBlockCoords(new BlockPos(Minecraft.getMinecraft().thePlayer));
        this.biome = lllllllllllllIlIIlIIIIIIIIIIIlIl.getBiome(new BlockPos(Minecraft.getMinecraft().thePlayer), this.mc.theWorld.getWorldChunkManager()).biomeName;
        Minecraft.getMinecraft().fontRendererObj.drawStringWithShadow(String.valueOf(new StringBuilder(Biome.lIIIIlllIlIllI[Biome.lIIIIlllIllIII[1]]).append(this.biome)), (float)(this.getX() + Biome.lIIIIlllIllIII[3]), (float)this.getY(), new Color(Biome.lIIIIlllIllIII[0], Biome.lIIIIlllIllIII[0], Biome.lIIIIlllIllIII[0], Biome.lIIIIlllIllIII[4]).getRGB());
        "".length();
        super.renderDummy(lllllllllllllIlIIlIIIIIIIIIIIIll, lllllllllllllIlIIlIIIIIIIIIIIIlI);
    }
    
    public Biome() {
        super(Biome.lIIIIlllIlIllI[Biome.lIIIIlllIllIII[0]], Biome.lIIIIlllIllIII[1], Biome.lIIIIlllIllIII[2]);
        this.mc = Minecraft.getMinecraft();
    }
}
