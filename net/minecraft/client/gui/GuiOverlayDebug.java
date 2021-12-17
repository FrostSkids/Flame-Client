// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.client.gui;

import java.util.Iterator;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.security.MessageDigest;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.world.DifficultyInstance;
import net.minecraft.world.chunk.Chunk;
import net.minecraft.util.EnumFacing;
import net.minecraft.entity.Entity;
import net.minecraft.world.EnumSkyBlock;
import net.minecraft.client.ClientBrandRetriever;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.BlockPos;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.block.properties.IProperty;
import java.util.Map;
import net.minecraft.block.Block;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.WorldType;
import net.minecraft.util.MovingObjectPosition;
import com.google.common.collect.Lists;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.Display;
import net.minecraft.client.renderer.OpenGlHelper;
import net.minecraft.util.FrameTimer;
import net.minecraft.util.MathHelper;
import net.minecraft.client.renderer.GlStateManager;
import java.util.List;
import com.google.common.base.Strings;
import net.minecraft.client.Minecraft;

public class GuiOverlayDebug extends Gui
{
    private static volatile /* synthetic */ int[] $SWITCH_TABLE$net$minecraft$util$EnumFacing;
    private final /* synthetic */ FontRenderer fontRenderer;
    private static final /* synthetic */ String[] lllllllIIllll;
    private final /* synthetic */ Minecraft mc;
    private static final /* synthetic */ int[] lllllllIlIlII;
    
    protected void renderDebugInfoLeft() {
        final List<String> lllllllllllllIlIlIIlllllIllIIIlI = this.call();
        int lllllllllllllIlIlIIlllllIllIIIIl = GuiOverlayDebug.lllllllIlIlII[0];
        "".length();
        if ((0x6B ^ 0x6F) == 0x0) {
            return;
        }
        while (!lIllIIIlIIllIIl(lllllllllllllIlIlIIlllllIllIIIIl, lllllllllllllIlIlIIlllllIllIIIlI.size())) {
            final String lllllllllllllIlIlIIlllllIllIIIII = lllllllllllllIlIlIIlllllIllIIIlI.get(lllllllllllllIlIlIIlllllIllIIIIl);
            if (lIllIIIlIIllIII(Strings.isNullOrEmpty(lllllllllllllIlIlIIlllllIllIIIII) ? 1 : 0)) {
                final int lllllllllllllIlIlIIlllllIlIlllll = this.fontRenderer.FONT_HEIGHT;
                final int lllllllllllllIlIlIIlllllIlIllllI = this.fontRenderer.getStringWidth(lllllllllllllIlIlIIlllllIllIIIII);
                final int lllllllllllllIlIlIIlllllIlIlllIl = GuiOverlayDebug.lllllllIlIlII[2];
                final int lllllllllllllIlIlIIlllllIlIlllII = GuiOverlayDebug.lllllllIlIlII[2] + lllllllllllllIlIlIIlllllIlIlllll * lllllllllllllIlIlIIlllllIllIIIIl;
                Gui.drawRect(GuiOverlayDebug.lllllllIlIlII[1], lllllllllllllIlIlIIlllllIlIlllII - GuiOverlayDebug.lllllllIlIlII[1], GuiOverlayDebug.lllllllIlIlII[2] + lllllllllllllIlIlIIlllllIlIllllI + GuiOverlayDebug.lllllllIlIlII[1], lllllllllllllIlIlIIlllllIlIlllII + lllllllllllllIlIlIIlllllIlIlllll - GuiOverlayDebug.lllllllIlIlII[1], GuiOverlayDebug.lllllllIlIlII[3]);
                this.fontRenderer.drawString(lllllllllllllIlIlIIlllllIllIIIII, GuiOverlayDebug.lllllllIlIlII[2], lllllllllllllIlIlIIlllllIlIlllII, GuiOverlayDebug.lllllllIlIlII[4]);
                "".length();
            }
            ++lllllllllllllIlIlIIlllllIllIIIIl;
        }
    }
    
    private void func_181554_e() {
        GlStateManager.disableDepth();
        final FrameTimer lllllllllllllIlIlIIllllIllllIIIl = this.mc.func_181539_aj();
        final int lllllllllllllIlIlIIllllIllllIIII = lllllllllllllIlIlIIllllIllllIIIl.func_181749_a();
        final int lllllllllllllIlIlIIllllIlllIllll = lllllllllllllIlIlIIllllIllllIIIl.func_181750_b();
        final long[] lllllllllllllIlIlIIllllIlllIlllI = lllllllllllllIlIlIIllllIllllIIIl.func_181746_c();
        final ScaledResolution lllllllllllllIlIlIIllllIlllIllIl = new ScaledResolution(this.mc);
        int lllllllllllllIlIlIIllllIlllIllII = lllllllllllllIlIlIIllllIllllIIII;
        int lllllllllllllIlIlIIllllIlllIlIll = GuiOverlayDebug.lllllllIlIlII[0];
        Gui.drawRect(GuiOverlayDebug.lllllllIlIlII[0], lllllllllllllIlIlIIllllIlllIllIl.getScaledHeight() - GuiOverlayDebug.lllllllIlIlII[47], GuiOverlayDebug.lllllllIlIlII[48], lllllllllllllIlIlIIllllIlllIllIl.getScaledHeight(), GuiOverlayDebug.lllllllIlIlII[3]);
        "".length();
        if (-" ".length() == " ".length()) {
            return;
        }
        while (!lIllIIIlIIllllI(lllllllllllllIlIlIIllllIlllIllII, lllllllllllllIlIlIIllllIlllIllll)) {
            final int lllllllllllllIlIlIIllllIlllIlIlI = lllllllllllllIlIlIIllllIllllIIIl.func_181748_a(lllllllllllllIlIlIIllllIlllIlllI[lllllllllllllIlIlIIllllIlllIllII], GuiOverlayDebug.lllllllIlIlII[32]);
            final int lllllllllllllIlIlIIllllIlllIlIIl = this.func_181552_c(MathHelper.clamp_int(lllllllllllllIlIlIIllllIlllIlIlI, GuiOverlayDebug.lllllllIlIlII[0], GuiOverlayDebug.lllllllIlIlII[47]), GuiOverlayDebug.lllllllIlIlII[0], GuiOverlayDebug.lllllllIlIlII[32], GuiOverlayDebug.lllllllIlIlII[47]);
            Gui.drawVerticalLine(lllllllllllllIlIlIIllllIlllIlIll, lllllllllllllIlIlIIllllIlllIllIl.getScaledHeight(), lllllllllllllIlIlIIllllIlllIllIl.getScaledHeight() - lllllllllllllIlIlIIllllIlllIlIlI, lllllllllllllIlIlIIllllIlllIlIIl);
            ++lllllllllllllIlIlIIllllIlllIlIll;
            lllllllllllllIlIlIIllllIlllIllII = lllllllllllllIlIlIIllllIllllIIIl.func_181751_b(lllllllllllllIlIlIIllllIlllIllII + GuiOverlayDebug.lllllllIlIlII[1]);
        }
        Gui.drawRect(GuiOverlayDebug.lllllllIlIlII[1], lllllllllllllIlIlIIllllIlllIllIl.getScaledHeight() - GuiOverlayDebug.lllllllIlIlII[32] + GuiOverlayDebug.lllllllIlIlII[1], GuiOverlayDebug.lllllllIlIlII[17], lllllllllllllIlIlIIllllIlllIllIl.getScaledHeight() - GuiOverlayDebug.lllllllIlIlII[32] + GuiOverlayDebug.lllllllIlIlII[13], GuiOverlayDebug.lllllllIlIlII[3]);
        this.fontRenderer.drawString(GuiOverlayDebug.lllllllIIllll[GuiOverlayDebug.lllllllIlIlII[49]], GuiOverlayDebug.lllllllIlIlII[2], lllllllllllllIlIlIIllllIlllIllIl.getScaledHeight() - GuiOverlayDebug.lllllllIlIlII[32] + GuiOverlayDebug.lllllllIlIlII[2], GuiOverlayDebug.lllllllIlIlII[4]);
        "".length();
        Gui.drawHorizontalLine(GuiOverlayDebug.lllllllIlIlII[0], GuiOverlayDebug.lllllllIlIlII[50], lllllllllllllIlIlIIllllIlllIllIl.getScaledHeight() - GuiOverlayDebug.lllllllIlIlII[32], GuiOverlayDebug.lllllllIlIlII[51]);
        Gui.drawRect(GuiOverlayDebug.lllllllIlIlII[1], lllllllllllllIlIlIIllllIlllIllIl.getScaledHeight() - GuiOverlayDebug.lllllllIlIlII[47] + GuiOverlayDebug.lllllllIlIlII[1], GuiOverlayDebug.lllllllIlIlII[17], lllllllllllllIlIlIIllllIlllIllIl.getScaledHeight() - GuiOverlayDebug.lllllllIlIlII[47] + GuiOverlayDebug.lllllllIlIlII[13], GuiOverlayDebug.lllllllIlIlII[3]);
        this.fontRenderer.drawString(GuiOverlayDebug.lllllllIIllll[GuiOverlayDebug.lllllllIlIlII[52]], GuiOverlayDebug.lllllllIlIlII[2], lllllllllllllIlIlIIllllIlllIllIl.getScaledHeight() - GuiOverlayDebug.lllllllIlIlII[47] + GuiOverlayDebug.lllllllIlIlII[2], GuiOverlayDebug.lllllllIlIlII[4]);
        "".length();
        Gui.drawHorizontalLine(GuiOverlayDebug.lllllllIlIlII[0], GuiOverlayDebug.lllllllIlIlII[50], lllllllllllllIlIlIIllllIlllIllIl.getScaledHeight() - GuiOverlayDebug.lllllllIlIlII[47], GuiOverlayDebug.lllllllIlIlII[51]);
        Gui.drawHorizontalLine(GuiOverlayDebug.lllllllIlIlII[0], GuiOverlayDebug.lllllllIlIlII[50], lllllllllllllIlIlIIllllIlllIllIl.getScaledHeight() - GuiOverlayDebug.lllllllIlIlII[1], GuiOverlayDebug.lllllllIlIlII[51]);
        Gui.drawVerticalLine(GuiOverlayDebug.lllllllIlIlII[0], lllllllllllllIlIlIIllllIlllIllIl.getScaledHeight() - GuiOverlayDebug.lllllllIlIlII[47], lllllllllllllIlIlIIllllIlllIllIl.getScaledHeight(), GuiOverlayDebug.lllllllIlIlII[51]);
        Gui.drawVerticalLine(GuiOverlayDebug.lllllllIlIlII[50], lllllllllllllIlIlIIllllIlllIllIl.getScaledHeight() - GuiOverlayDebug.lllllllIlIlII[47], lllllllllllllIlIlIIllllIlllIllIl.getScaledHeight(), GuiOverlayDebug.lllllllIlIlII[51]);
        if (lIllIIIlIIlllll(this.mc.gameSettings.limitFramerate, GuiOverlayDebug.lllllllIlIlII[53])) {
            Gui.drawHorizontalLine(GuiOverlayDebug.lllllllIlIlII[0], GuiOverlayDebug.lllllllIlIlII[50], lllllllllllllIlIlIIllllIlllIllIl.getScaledHeight() - GuiOverlayDebug.lllllllIlIlII[47] + this.mc.gameSettings.limitFramerate / GuiOverlayDebug.lllllllIlIlII[2], GuiOverlayDebug.lllllllIlIlII[54]);
        }
        GlStateManager.enableDepth();
    }
    
    protected List<String> getDebugInfoRight() {
        final long lllllllllllllIlIlIIlllllIIIlIIII = Runtime.getRuntime().maxMemory();
        final long lllllllllllllIlIlIIlllllIIIIllll = Runtime.getRuntime().totalMemory();
        final long lllllllllllllIlIlIIlllllIIIIlllI = Runtime.getRuntime().freeMemory();
        final long lllllllllllllIlIlIIlllllIIIIllIl = lllllllllllllIlIlIIlllllIIIIllll - lllllllllllllIlIlIIlllllIIIIlllI;
        final String[] array = new String[GuiOverlayDebug.lllllllIlIlII[12]];
        final int n = GuiOverlayDebug.lllllllIlIlII[0];
        final String format = GuiOverlayDebug.lllllllIIllll[GuiOverlayDebug.lllllllIlIlII[33]];
        final Object[] args = new Object[GuiOverlayDebug.lllllllIlIlII[2]];
        args[GuiOverlayDebug.lllllllIlIlII[0]] = System.getProperty(GuiOverlayDebug.lllllllIIllll[GuiOverlayDebug.lllllllIlIlII[34]]);
        final int n2 = GuiOverlayDebug.lllllllIlIlII[1];
        int i;
        if (lIllIIIlIIlIlll(this.mc.isJava64bit() ? 1 : 0)) {
            i = GuiOverlayDebug.lllllllIlIlII[35];
            "".length();
            if (null != null) {
                return null;
            }
        }
        else {
            i = GuiOverlayDebug.lllllllIlIlII[34];
        }
        args[n2] = i;
        array[n] = String.format(format, args);
        final int n3 = GuiOverlayDebug.lllllllIlIlII[1];
        final String format2 = GuiOverlayDebug.lllllllIIllll[GuiOverlayDebug.lllllllIlIlII[36]];
        final Object[] args2 = new Object[GuiOverlayDebug.lllllllIlIlII[6]];
        args2[GuiOverlayDebug.lllllllIlIlII[0]] = lllllllllllllIlIlIIlllllIIIIllIl * 100L / lllllllllllllIlIlIIlllllIIIlIIII;
        args2[GuiOverlayDebug.lllllllIlIlII[1]] = bytesToMb(lllllllllllllIlIlIIlllllIIIIllIl);
        args2[GuiOverlayDebug.lllllllIlIlII[2]] = bytesToMb(lllllllllllllIlIlIIlllllIIIlIIII);
        array[n3] = String.format(format2, args2);
        final int n4 = GuiOverlayDebug.lllllllIlIlII[2];
        final String format3 = GuiOverlayDebug.lllllllIIllll[GuiOverlayDebug.lllllllIlIlII[37]];
        final Object[] args3 = new Object[GuiOverlayDebug.lllllllIlIlII[2]];
        args3[GuiOverlayDebug.lllllllIlIlII[0]] = lllllllllllllIlIlIIlllllIIIIllll * 100L / lllllllllllllIlIlIIlllllIIIlIIII;
        args3[GuiOverlayDebug.lllllllIlIlII[1]] = bytesToMb(lllllllllllllIlIlIIlllllIIIIllll);
        array[n4] = String.format(format3, args3);
        array[GuiOverlayDebug.lllllllIlIlII[6]] = GuiOverlayDebug.lllllllIIllll[GuiOverlayDebug.lllllllIlIlII[38]];
        final int n5 = GuiOverlayDebug.lllllllIlIlII[7];
        final String format4 = GuiOverlayDebug.lllllllIIllll[GuiOverlayDebug.lllllllIlIlII[39]];
        final Object[] args4 = new Object[GuiOverlayDebug.lllllllIlIlII[1]];
        args4[GuiOverlayDebug.lllllllIlIlII[0]] = OpenGlHelper.func_183029_j();
        array[n5] = String.format(format4, args4);
        array[GuiOverlayDebug.lllllllIlIlII[8]] = GuiOverlayDebug.lllllllIIllll[GuiOverlayDebug.lllllllIlIlII[40]];
        final int n6 = GuiOverlayDebug.lllllllIlIlII[9];
        final String format5 = GuiOverlayDebug.lllllllIIllll[GuiOverlayDebug.lllllllIlIlII[41]];
        final Object[] args5 = new Object[GuiOverlayDebug.lllllllIlIlII[6]];
        args5[GuiOverlayDebug.lllllllIlIlII[0]] = Display.getWidth();
        args5[GuiOverlayDebug.lllllllIlIlII[1]] = Display.getHeight();
        args5[GuiOverlayDebug.lllllllIlIlII[2]] = GL11.glGetString(GuiOverlayDebug.lllllllIlIlII[42]);
        array[n6] = String.format(format5, args5);
        array[GuiOverlayDebug.lllllllIlIlII[10]] = GL11.glGetString(GuiOverlayDebug.lllllllIlIlII[43]);
        array[GuiOverlayDebug.lllllllIlIlII[5]] = GL11.glGetString(GuiOverlayDebug.lllllllIlIlII[44]);
        final List<String> lllllllllllllIlIlIIlllllIIIIllII = (List<String>)Lists.newArrayList((Object[])array);
        if (lIllIIIlIIlIlll(this.isReducedDebug() ? 1 : 0)) {
            return lllllllllllllIlIlIIlllllIIIIllII;
        }
        if (lIllIIIlIIllIlI(this.mc.objectMouseOver) && lIllIIIlIIlllII(this.mc.objectMouseOver.typeOfHit, MovingObjectPosition.MovingObjectType.BLOCK) && lIllIIIlIIllIlI(this.mc.objectMouseOver.getBlockPos())) {
            final BlockPos lllllllllllllIlIlIIlllllIIIIlIll = this.mc.objectMouseOver.getBlockPos();
            IBlockState lllllllllllllIlIlIIlllllIIIIlIlI = this.mc.theWorld.getBlockState(lllllllllllllIlIlIIlllllIIIIlIll);
            if (lIllIIIlIIlllIl(this.mc.theWorld.getWorldType(), WorldType.DEBUG_WORLD)) {
                lllllllllllllIlIlIIlllllIIIIlIlI = lllllllllllllIlIlIIlllllIIIIlIlI.getBlock().getActualState(lllllllllllllIlIlIIlllllIIIIlIlI, this.mc.theWorld, lllllllllllllIlIlIIlllllIIIIlIll);
            }
            lllllllllllllIlIlIIlllllIIIIllII.add(GuiOverlayDebug.lllllllIIllll[GuiOverlayDebug.lllllllIlIlII[45]]);
            "".length();
            lllllllllllllIlIlIIlllllIIIIllII.add(String.valueOf(Block.blockRegistry.getNameForObject(lllllllllllllIlIlIIlllllIIIIlIlI.getBlock())));
            "".length();
            final char lllllllllllllIlIlIIllllIlllllllI = (char)lllllllllllllIlIlIIlllllIIIIlIlI.getProperties().entrySet().iterator();
            "".length();
            if (((104 + 155 - 102 + 17 ^ 69 + 115 - 89 + 43) & (131 + 142 - 141 + 99 ^ 118 + 137 - 126 + 66 ^ -" ".length())) < 0) {
                return null;
            }
            while (!lIllIIIlIIllIII(((Iterator)lllllllllllllIlIlIIllllIlllllllI).hasNext() ? 1 : 0)) {
                final Map.Entry<IProperty, Comparable> lllllllllllllIlIlIIlllllIIIIlIIl = ((Iterator<Map.Entry<IProperty, Comparable>>)lllllllllllllIlIlIIllllIlllllllI).next();
                String lllllllllllllIlIlIIlllllIIIIlIII = lllllllllllllIlIlIIlllllIIIIlIIl.getValue().toString();
                if (lIllIIIlIIlllII(lllllllllllllIlIlIIlllllIIIIlIIl.getValue(), Boolean.TRUE)) {
                    lllllllllllllIlIlIIlllllIIIIlIII = String.valueOf(new StringBuilder().append(EnumChatFormatting.GREEN).append(lllllllllllllIlIlIIlllllIIIIlIII));
                    "".length();
                    if (-(0x63 ^ 0x67) > 0) {
                        return null;
                    }
                }
                else if (lIllIIIlIIlllII(lllllllllllllIlIlIIlllllIIIIlIIl.getValue(), Boolean.FALSE)) {
                    lllllllllllllIlIlIIlllllIIIIlIII = String.valueOf(new StringBuilder().append(EnumChatFormatting.RED).append(lllllllllllllIlIlIIlllllIIIIlIII));
                }
                lllllllllllllIlIlIIlllllIIIIllII.add(String.valueOf(new StringBuilder(String.valueOf(lllllllllllllIlIlIIlllllIIIIlIIl.getKey().getName())).append(GuiOverlayDebug.lllllllIIllll[GuiOverlayDebug.lllllllIlIlII[46]]).append(lllllllllllllIlIlIIlllllIIIIlIII)));
                "".length();
            }
        }
        return lllllllllllllIlIlIIlllllIIIIllII;
    }
    
    protected void renderDebugInfoRight(final ScaledResolution lllllllllllllIlIlIIlllllIlIIlIIl) {
        final List<String> lllllllllllllIlIlIIlllllIlIIlIII = this.getDebugInfoRight();
        int lllllllllllllIlIlIIlllllIlIIIlll = GuiOverlayDebug.lllllllIlIlII[0];
        "".length();
        if (((0xB9 ^ 0xAF) & ~(0x75 ^ 0x63)) == " ".length()) {
            return;
        }
        while (!lIllIIIlIIllIIl(lllllllllllllIlIlIIlllllIlIIIlll, lllllllllllllIlIlIIlllllIlIIlIII.size())) {
            final String lllllllllllllIlIlIIlllllIlIIIllI = lllllllllllllIlIlIIlllllIlIIlIII.get(lllllllllllllIlIlIIlllllIlIIIlll);
            if (lIllIIIlIIllIII(Strings.isNullOrEmpty(lllllllllllllIlIlIIlllllIlIIIllI) ? 1 : 0)) {
                final int lllllllllllllIlIlIIlllllIlIIIlIl = this.fontRenderer.FONT_HEIGHT;
                final int lllllllllllllIlIlIIlllllIlIIIlII = this.fontRenderer.getStringWidth(lllllllllllllIlIlIIlllllIlIIIllI);
                final int lllllllllllllIlIlIIlllllIlIIIIll = lllllllllllllIlIlIIlllllIlIIlIIl.getScaledWidth() - GuiOverlayDebug.lllllllIlIlII[2] - lllllllllllllIlIlIIlllllIlIIIlII;
                final int lllllllllllllIlIlIIlllllIlIIIIlI = GuiOverlayDebug.lllllllIlIlII[2] + lllllllllllllIlIlIIlllllIlIIIlIl * lllllllllllllIlIlIIlllllIlIIIlll;
                Gui.drawRect(lllllllllllllIlIlIIlllllIlIIIIll - GuiOverlayDebug.lllllllIlIlII[1], lllllllllllllIlIlIIlllllIlIIIIlI - GuiOverlayDebug.lllllllIlIlII[1], lllllllllllllIlIlIIlllllIlIIIIll + lllllllllllllIlIlIIlllllIlIIIlII + GuiOverlayDebug.lllllllIlIlII[1], lllllllllllllIlIlIIlllllIlIIIIlI + lllllllllllllIlIlIIlllllIlIIIlIl - GuiOverlayDebug.lllllllIlIlII[1], GuiOverlayDebug.lllllllIlIlII[3]);
                this.fontRenderer.drawString(lllllllllllllIlIlIIlllllIlIIIllI, lllllllllllllIlIlIIlllllIlIIIIll, lllllllllllllIlIlIIlllllIlIIIIlI, GuiOverlayDebug.lllllllIlIlII[4]);
                "".length();
            }
            ++lllllllllllllIlIlIIlllllIlIIIlll;
        }
    }
    
    public void renderDebugInfo(final ScaledResolution lllllllllllllIlIlIIlllllIlllIIIl) {
        this.mc.mcProfiler.startSection(GuiOverlayDebug.lllllllIIllll[GuiOverlayDebug.lllllllIlIlII[0]]);
        GlStateManager.pushMatrix();
        this.renderDebugInfoLeft();
        this.renderDebugInfoRight(lllllllllllllIlIlIIlllllIlllIIIl);
        GlStateManager.popMatrix();
        if (lIllIIIlIIlIlll(this.mc.gameSettings.field_181657_aC ? 1 : 0)) {
            this.func_181554_e();
        }
        this.mc.mcProfiler.endSection();
    }
    
    static {
        lIllIIIlIIlIllI();
        lIllIIIlIIlIIlI();
    }
    
    private static boolean lIllIIIlIlIIIII(final int lllllllllllllIlIlIIllllIIllIIIlI, final int lllllllllllllIlIlIIllllIIllIIIIl) {
        return lllllllllllllIlIlIIllllIIllIIIlI < lllllllllllllIlIlIIllllIIllIIIIl;
    }
    
    private static boolean lIllIIIlIIlllIl(final Object lllllllllllllIlIlIIllllIIlIllIlI, final Object lllllllllllllIlIlIIllllIIlIllIIl) {
        return lllllllllllllIlIlIIllllIIlIllIlI != lllllllllllllIlIlIIllllIIlIllIIl;
    }
    
    private static String lIllIIIlIIIlIll(String lllllllllllllIlIlIIllllIlIIIllll, final String lllllllllllllIlIlIIllllIlIIlIIll) {
        lllllllllllllIlIlIIllllIlIIIllll = new String(Base64.getDecoder().decode(lllllllllllllIlIlIIllllIlIIIllll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIlIlIIllllIlIIlIIlI = new StringBuilder();
        final char[] lllllllllllllIlIlIIllllIlIIlIIIl = lllllllllllllIlIlIIllllIlIIlIIll.toCharArray();
        int lllllllllllllIlIlIIllllIlIIlIIII = GuiOverlayDebug.lllllllIlIlII[0];
        final String lllllllllllllIlIlIIllllIlIIIlIlI = (Object)lllllllllllllIlIlIIllllIlIIIllll.toCharArray();
        final String lllllllllllllIlIlIIllllIlIIIlIIl = (String)lllllllllllllIlIlIIllllIlIIIlIlI.length;
        char lllllllllllllIlIlIIllllIlIIIlIII = (char)GuiOverlayDebug.lllllllIlIlII[0];
        while (lIllIIIlIlIIIII(lllllllllllllIlIlIIllllIlIIIlIII, (int)lllllllllllllIlIlIIllllIlIIIlIIl)) {
            final char lllllllllllllIlIlIIllllIlIIlIlIl = lllllllllllllIlIlIIllllIlIIIlIlI[lllllllllllllIlIlIIllllIlIIIlIII];
            lllllllllllllIlIlIIllllIlIIlIIlI.append((char)(lllllllllllllIlIlIIllllIlIIlIlIl ^ lllllllllllllIlIlIIllllIlIIlIIIl[lllllllllllllIlIlIIllllIlIIlIIII % lllllllllllllIlIlIIllllIlIIlIIIl.length]));
            "".length();
            ++lllllllllllllIlIlIIllllIlIIlIIII;
            ++lllllllllllllIlIlIIllllIlIIIlIII;
            "".length();
            if (null != null) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIlIlIIllllIlIIlIIlI);
    }
    
    protected List<String> call() {
        final BlockPos lllllllllllllIlIlIIlllllIIlIlllI = new BlockPos(this.mc.getRenderViewEntity().posX, this.mc.getRenderViewEntity().getEntityBoundingBox().minY, this.mc.getRenderViewEntity().posZ);
        if (lIllIIIlIIlIlll(this.isReducedDebug() ? 1 : 0)) {
            final String[] array = new String[GuiOverlayDebug.lllllllIlIlII[5]];
            array[GuiOverlayDebug.lllllllIlIlII[0]] = String.valueOf(new StringBuilder(GuiOverlayDebug.lllllllIIllll[GuiOverlayDebug.lllllllIlIlII[1]]).append(this.mc.getVersion()).append(GuiOverlayDebug.lllllllIIllll[GuiOverlayDebug.lllllllIlIlII[2]]).append(ClientBrandRetriever.getClientModName()).append(GuiOverlayDebug.lllllllIIllll[GuiOverlayDebug.lllllllIlIlII[6]]));
            array[GuiOverlayDebug.lllllllIlIlII[1]] = this.mc.debug;
            array[GuiOverlayDebug.lllllllIlIlII[2]] = this.mc.renderGlobal.getDebugInfoRenders();
            array[GuiOverlayDebug.lllllllIlIlII[6]] = this.mc.renderGlobal.getDebugInfoEntities();
            array[GuiOverlayDebug.lllllllIlIlII[7]] = String.valueOf(new StringBuilder(GuiOverlayDebug.lllllllIIllll[GuiOverlayDebug.lllllllIlIlII[7]]).append(this.mc.effectRenderer.getStatistics()).append(GuiOverlayDebug.lllllllIIllll[GuiOverlayDebug.lllllllIlIlII[8]]).append(this.mc.theWorld.getDebugLoadedEntities()));
            array[GuiOverlayDebug.lllllllIlIlII[8]] = this.mc.theWorld.getProviderName();
            array[GuiOverlayDebug.lllllllIlIlII[9]] = GuiOverlayDebug.lllllllIIllll[GuiOverlayDebug.lllllllIlIlII[9]];
            final int n = GuiOverlayDebug.lllllllIlIlII[10];
            final String format = GuiOverlayDebug.lllllllIIllll[GuiOverlayDebug.lllllllIlIlII[10]];
            final Object[] args = new Object[GuiOverlayDebug.lllllllIlIlII[6]];
            args[GuiOverlayDebug.lllllllIlIlII[0]] = (lllllllllllllIlIlIIlllllIIlIlllI.getX() & GuiOverlayDebug.lllllllIlIlII[11]);
            args[GuiOverlayDebug.lllllllIlIlII[1]] = (lllllllllllllIlIlIIlllllIIlIlllI.getY() & GuiOverlayDebug.lllllllIlIlII[11]);
            args[GuiOverlayDebug.lllllllIlIlII[2]] = (lllllllllllllIlIlIIlllllIIlIlllI.getZ() & GuiOverlayDebug.lllllllIlIlII[11]);
            array[n] = String.format(format, args);
            return (List<String>)Lists.newArrayList((Object[])array);
        }
        final Entity lllllllllllllIlIlIIlllllIIlIllIl = this.mc.getRenderViewEntity();
        final EnumFacing lllllllllllllIlIlIIlllllIIlIllII = lllllllllllllIlIlIIlllllIIlIllIl.getHorizontalFacing();
        String lllllllllllllIlIlIIlllllIIlIlIll = GuiOverlayDebug.lllllllIIllll[GuiOverlayDebug.lllllllIlIlII[5]];
        switch ($SWITCH_TABLE$net$minecraft$util$EnumFacing()[lllllllllllllIlIlIIlllllIIlIllII.ordinal()]) {
            case 3: {
                lllllllllllllIlIlIIlllllIIlIlIll = GuiOverlayDebug.lllllllIIllll[GuiOverlayDebug.lllllllIlIlII[12]];
                "".length();
                if (-" ".length() >= "  ".length()) {
                    return null;
                }
                break;
            }
            case 4: {
                lllllllllllllIlIlIIlllllIIlIlIll = GuiOverlayDebug.lllllllIIllll[GuiOverlayDebug.lllllllIlIlII[13]];
                "".length();
                if ((0x46 ^ 0x42) <= " ".length()) {
                    return null;
                }
                break;
            }
            case 5: {
                lllllllllllllIlIlIIlllllIIlIlIll = GuiOverlayDebug.lllllllIIllll[GuiOverlayDebug.lllllllIlIlII[14]];
                "".length();
                if (-" ".length() >= 0) {
                    return null;
                }
                break;
            }
            case 6: {
                lllllllllllllIlIlIIlllllIIlIlIll = GuiOverlayDebug.lllllllIIllll[GuiOverlayDebug.lllllllIlIlII[15]];
                break;
            }
        }
        final String[] array2 = new String[GuiOverlayDebug.lllllllIlIlII[14]];
        array2[GuiOverlayDebug.lllllllIlIlII[0]] = String.valueOf(new StringBuilder(GuiOverlayDebug.lllllllIIllll[GuiOverlayDebug.lllllllIlIlII[16]]).append(this.mc.getVersion()).append(GuiOverlayDebug.lllllllIIllll[GuiOverlayDebug.lllllllIlIlII[17]]).append(ClientBrandRetriever.getClientModName()).append(GuiOverlayDebug.lllllllIIllll[GuiOverlayDebug.lllllllIlIlII[11]]));
        array2[GuiOverlayDebug.lllllllIlIlII[1]] = this.mc.debug;
        array2[GuiOverlayDebug.lllllllIlIlII[2]] = this.mc.renderGlobal.getDebugInfoRenders();
        array2[GuiOverlayDebug.lllllllIlIlII[6]] = this.mc.renderGlobal.getDebugInfoEntities();
        array2[GuiOverlayDebug.lllllllIlIlII[7]] = String.valueOf(new StringBuilder(GuiOverlayDebug.lllllllIIllll[GuiOverlayDebug.lllllllIlIlII[18]]).append(this.mc.effectRenderer.getStatistics()).append(GuiOverlayDebug.lllllllIIllll[GuiOverlayDebug.lllllllIlIlII[19]]).append(this.mc.theWorld.getDebugLoadedEntities()));
        array2[GuiOverlayDebug.lllllllIlIlII[8]] = this.mc.theWorld.getProviderName();
        array2[GuiOverlayDebug.lllllllIlIlII[9]] = GuiOverlayDebug.lllllllIIllll[GuiOverlayDebug.lllllllIlIlII[20]];
        final int n2 = GuiOverlayDebug.lllllllIlIlII[10];
        final String format2 = GuiOverlayDebug.lllllllIIllll[GuiOverlayDebug.lllllllIlIlII[21]];
        final Object[] args2 = new Object[GuiOverlayDebug.lllllllIlIlII[6]];
        args2[GuiOverlayDebug.lllllllIlIlII[0]] = this.mc.getRenderViewEntity().posX;
        args2[GuiOverlayDebug.lllllllIlIlII[1]] = this.mc.getRenderViewEntity().getEntityBoundingBox().minY;
        args2[GuiOverlayDebug.lllllllIlIlII[2]] = this.mc.getRenderViewEntity().posZ;
        array2[n2] = String.format(format2, args2);
        final int n3 = GuiOverlayDebug.lllllllIlIlII[5];
        final String format3 = GuiOverlayDebug.lllllllIIllll[GuiOverlayDebug.lllllllIlIlII[22]];
        final Object[] args3 = new Object[GuiOverlayDebug.lllllllIlIlII[6]];
        args3[GuiOverlayDebug.lllllllIlIlII[0]] = lllllllllllllIlIlIIlllllIIlIlllI.getX();
        args3[GuiOverlayDebug.lllllllIlIlII[1]] = lllllllllllllIlIlIIlllllIIlIlllI.getY();
        args3[GuiOverlayDebug.lllllllIlIlII[2]] = lllllllllllllIlIlIIlllllIIlIlllI.getZ();
        array2[n3] = String.format(format3, args3);
        final int n4 = GuiOverlayDebug.lllllllIlIlII[12];
        final String format4 = GuiOverlayDebug.lllllllIIllll[GuiOverlayDebug.lllllllIlIlII[23]];
        final Object[] args4 = new Object[GuiOverlayDebug.lllllllIlIlII[9]];
        args4[GuiOverlayDebug.lllllllIlIlII[0]] = (lllllllllllllIlIlIIlllllIIlIlllI.getX() & GuiOverlayDebug.lllllllIlIlII[11]);
        args4[GuiOverlayDebug.lllllllIlIlII[1]] = (lllllllllllllIlIlIIlllllIIlIlllI.getY() & GuiOverlayDebug.lllllllIlIlII[11]);
        args4[GuiOverlayDebug.lllllllIlIlII[2]] = (lllllllllllllIlIlIIlllllIIlIlllI.getZ() & GuiOverlayDebug.lllllllIlIlII[11]);
        args4[GuiOverlayDebug.lllllllIlIlII[6]] = lllllllllllllIlIlIIlllllIIlIlllI.getX() >> GuiOverlayDebug.lllllllIlIlII[7];
        args4[GuiOverlayDebug.lllllllIlIlII[7]] = lllllllllllllIlIlIIlllllIIlIlllI.getY() >> GuiOverlayDebug.lllllllIlIlII[7];
        args4[GuiOverlayDebug.lllllllIlIlII[8]] = lllllllllllllIlIlIIlllllIIlIlllI.getZ() >> GuiOverlayDebug.lllllllIlIlII[7];
        array2[n4] = String.format(format4, args4);
        final int n5 = GuiOverlayDebug.lllllllIlIlII[13];
        final String format5 = GuiOverlayDebug.lllllllIIllll[GuiOverlayDebug.lllllllIlIlII[24]];
        final Object[] args5 = new Object[GuiOverlayDebug.lllllllIlIlII[7]];
        args5[GuiOverlayDebug.lllllllIlIlII[0]] = lllllllllllllIlIlIIlllllIIlIllII;
        args5[GuiOverlayDebug.lllllllIlIlII[1]] = lllllllllllllIlIlIIlllllIIlIlIll;
        args5[GuiOverlayDebug.lllllllIlIlII[2]] = MathHelper.wrapAngleTo180_float(lllllllllllllIlIlIIlllllIIlIllIl.rotationYaw);
        args5[GuiOverlayDebug.lllllllIlIlII[6]] = MathHelper.wrapAngleTo180_float(lllllllllllllIlIlIIlllllIIlIllIl.rotationPitch);
        array2[n5] = String.format(format5, args5);
        final List<String> lllllllllllllIlIlIIlllllIIlIlIlI = (List<String>)Lists.newArrayList((Object[])array2);
        if (lIllIIIlIIllIlI(this.mc.theWorld) && lIllIIIlIIlIlll(this.mc.theWorld.isBlockLoaded(lllllllllllllIlIlIIlllllIIlIlllI) ? 1 : 0)) {
            final Chunk lllllllllllllIlIlIIlllllIIlIlIIl = this.mc.theWorld.getChunkFromBlockCoords(lllllllllllllIlIlIIlllllIIlIlllI);
            lllllllllllllIlIlIIlllllIIlIlIlI.add(String.valueOf(new StringBuilder(GuiOverlayDebug.lllllllIIllll[GuiOverlayDebug.lllllllIlIlII[25]]).append(lllllllllllllIlIlIIlllllIIlIlIIl.getBiome(lllllllllllllIlIlIIlllllIIlIlllI, this.mc.theWorld.getWorldChunkManager()).biomeName)));
            "".length();
            lllllllllllllIlIlIIlllllIIlIlIlI.add(String.valueOf(new StringBuilder(GuiOverlayDebug.lllllllIIllll[GuiOverlayDebug.lllllllIlIlII[26]]).append(lllllllllllllIlIlIIlllllIIlIlIIl.getLightSubtracted(lllllllllllllIlIlIIlllllIIlIlllI, GuiOverlayDebug.lllllllIlIlII[0])).append(GuiOverlayDebug.lllllllIIllll[GuiOverlayDebug.lllllllIlIlII[27]]).append(lllllllllllllIlIlIIlllllIIlIlIIl.getLightFor(EnumSkyBlock.SKY, lllllllllllllIlIlIIlllllIIlIlllI)).append(GuiOverlayDebug.lllllllIIllll[GuiOverlayDebug.lllllllIlIlII[28]]).append(lllllllllllllIlIlIIlllllIIlIlIIl.getLightFor(EnumSkyBlock.BLOCK, lllllllllllllIlIlIIlllllIIlIlllI)).append(GuiOverlayDebug.lllllllIIllll[GuiOverlayDebug.lllllllIlIlII[29]])));
            "".length();
            DifficultyInstance lllllllllllllIlIlIIlllllIIlIlIII = this.mc.theWorld.getDifficultyForLocation(lllllllllllllIlIlIIlllllIIlIlllI);
            if (lIllIIIlIIlIlll(this.mc.isIntegratedServerRunning() ? 1 : 0) && lIllIIIlIIllIlI(this.mc.getIntegratedServer())) {
                final EntityPlayerMP lllllllllllllIlIlIIlllllIIlIIlll = this.mc.getIntegratedServer().getConfigurationManager().getPlayerByUUID(this.mc.thePlayer.getUniqueID());
                if (lIllIIIlIIllIlI(lllllllllllllIlIlIIlllllIIlIIlll)) {
                    lllllllllllllIlIlIIlllllIIlIlIII = lllllllllllllIlIlIIlllllIIlIIlll.worldObj.getDifficultyForLocation(new BlockPos(lllllllllllllIlIlIIlllllIIlIIlll));
                }
            }
            final List<String> list = lllllllllllllIlIlIIlllllIIlIlIlI;
            final String format6 = GuiOverlayDebug.lllllllIIllll[GuiOverlayDebug.lllllllIlIlII[30]];
            final Object[] args6 = new Object[GuiOverlayDebug.lllllllIlIlII[2]];
            args6[GuiOverlayDebug.lllllllIlIlII[0]] = lllllllllllllIlIlIIlllllIIlIlIII.getAdditionalDifficulty();
            args6[GuiOverlayDebug.lllllllIlIlII[1]] = this.mc.theWorld.getWorldTime() / 24000L;
            list.add(String.format(format6, args6));
            "".length();
        }
        if (lIllIIIlIIllIlI(this.mc.entityRenderer) && lIllIIIlIIlIlll(this.mc.entityRenderer.isShaderActive() ? 1 : 0)) {
            lllllllllllllIlIlIIlllllIIlIlIlI.add(String.valueOf(new StringBuilder(GuiOverlayDebug.lllllllIIllll[GuiOverlayDebug.lllllllIlIlII[31]]).append(this.mc.entityRenderer.getShaderGroup().getShaderGroupName())));
            "".length();
        }
        if (lIllIIIlIIllIlI(this.mc.objectMouseOver) && lIllIIIlIIlllII(this.mc.objectMouseOver.typeOfHit, MovingObjectPosition.MovingObjectType.BLOCK) && lIllIIIlIIllIlI(this.mc.objectMouseOver.getBlockPos())) {
            final BlockPos lllllllllllllIlIlIIlllllIIlIIllI = this.mc.objectMouseOver.getBlockPos();
            final List<String> list2 = lllllllllllllIlIlIIlllllIIlIlIlI;
            final String format7 = GuiOverlayDebug.lllllllIIllll[GuiOverlayDebug.lllllllIlIlII[32]];
            final Object[] args7 = new Object[GuiOverlayDebug.lllllllIlIlII[6]];
            args7[GuiOverlayDebug.lllllllIlIlII[0]] = lllllllllllllIlIlIIlllllIIlIIllI.getX();
            args7[GuiOverlayDebug.lllllllIlIlII[1]] = lllllllllllllIlIlIIlllllIIlIIllI.getY();
            args7[GuiOverlayDebug.lllllllIlIlII[2]] = lllllllllllllIlIlIIlllllIIlIIllI.getZ();
            list2.add(String.format(format7, args7));
            "".length();
        }
        return lllllllllllllIlIlIIlllllIIlIlIlI;
    }
    
    private static String lIllIIIlIIIllII(final String lllllllllllllIlIlIIllllIIlllllll, final String lllllllllllllIlIlIIllllIIlllllII) {
        try {
            final SecretKeySpec lllllllllllllIlIlIIllllIlIIIIIlI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIlIlIIllllIIlllllII.getBytes(StandardCharsets.UTF_8)), GuiOverlayDebug.lllllllIlIlII[5]), "DES");
            final Cipher lllllllllllllIlIlIIllllIlIIIIIIl = Cipher.getInstance("DES");
            lllllllllllllIlIlIIllllIlIIIIIIl.init(GuiOverlayDebug.lllllllIlIlII[2], lllllllllllllIlIlIIllllIlIIIIIlI);
            return new String(lllllllllllllIlIlIIllllIlIIIIIIl.doFinal(Base64.getDecoder().decode(lllllllllllllIlIlIIllllIIlllllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIlIlIIllllIlIIIIIII) {
            lllllllllllllIlIlIIllllIlIIIIIII.printStackTrace();
            return null;
        }
    }
    
    private int func_181552_c(final int lllllllllllllIlIlIIllllIllIllIIl, final int lllllllllllllIlIlIIllllIllIllIII, final int lllllllllllllIlIlIIllllIllIlIlll, final int lllllllllllllIlIlIIllllIllIlIIlI) {
        int n;
        if (lIllIIIlIlIIIII(lllllllllllllIlIlIIllllIllIllIIl, lllllllllllllIlIlIIllllIllIlIlll)) {
            n = this.func_181553_a(GuiOverlayDebug.lllllllIlIlII[55], GuiOverlayDebug.lllllllIlIlII[56], lllllllllllllIlIlIIllllIllIllIIl / (float)lllllllllllllIlIlIIllllIllIlIlll);
            "".length();
            if ((0xA1 ^ 0xA5) == 0x0) {
                return (0x4E ^ 0x6) & ~(0xEE ^ 0xA6);
            }
        }
        else {
            n = this.func_181553_a(GuiOverlayDebug.lllllllIlIlII[56], GuiOverlayDebug.lllllllIlIlII[57], (lllllllllllllIlIlIIllllIllIllIIl - lllllllllllllIlIlIIllllIllIlIlll) / (float)(lllllllllllllIlIlIIllllIllIlIIlI - lllllllllllllIlIlIIllllIllIlIlll));
        }
        return n;
    }
    
    private static boolean lIllIIIlIIllIII(final int lllllllllllllIlIlIIllllIIlIIllll) {
        return lllllllllllllIlIlIIllllIIlIIllll == 0;
    }
    
    private static boolean lIllIIIlIIllllI(final int lllllllllllllIlIlIIllllIIllIlIlI, final int lllllllllllllIlIlIIllllIIllIlIIl) {
        return lllllllllllllIlIlIIllllIIllIlIlI == lllllllllllllIlIlIIllllIIllIlIIl;
    }
    
    private static boolean lIllIIIlIIllIlI(final Object lllllllllllllIlIlIIllllIIlIlIlll) {
        return lllllllllllllIlIlIIllllIIlIlIlll != null;
    }
    
    private static boolean lIllIIIlIIllIIl(final int lllllllllllllIlIlIIllllIIllIIllI, final int lllllllllllllIlIlIIllllIIllIIlIl) {
        return lllllllllllllIlIlIIllllIIllIIllI >= lllllllllllllIlIlIIllllIIllIIlIl;
    }
    
    private int func_181553_a(final int lllllllllllllIlIlIIllllIlIllIIlI, final int lllllllllllllIlIlIIllllIlIllIIIl, final float lllllllllllllIlIlIIllllIlIllIIII) {
        final int lllllllllllllIlIlIIllllIlIlllllI = lllllllllllllIlIlIIllllIlIllIIlI >> GuiOverlayDebug.lllllllIlIlII[26] & GuiOverlayDebug.lllllllIlIlII[58];
        final int lllllllllllllIlIlIIllllIlIllllIl = lllllllllllllIlIlIIllllIlIllIIlI >> GuiOverlayDebug.lllllllIlIlII[18] & GuiOverlayDebug.lllllllIlIlII[58];
        final int lllllllllllllIlIlIIllllIlIllllII = lllllllllllllIlIlIIllllIlIllIIlI >> GuiOverlayDebug.lllllllIlIlII[5] & GuiOverlayDebug.lllllllIlIlII[58];
        final int lllllllllllllIlIlIIllllIlIlllIll = lllllllllllllIlIlIIllllIlIllIIlI & GuiOverlayDebug.lllllllIlIlII[58];
        final int lllllllllllllIlIlIIllllIlIlllIlI = lllllllllllllIlIlIIllllIlIllIIIl >> GuiOverlayDebug.lllllllIlIlII[26] & GuiOverlayDebug.lllllllIlIlII[58];
        final int lllllllllllllIlIlIIllllIlIlllIIl = lllllllllllllIlIlIIllllIlIllIIIl >> GuiOverlayDebug.lllllllIlIlII[18] & GuiOverlayDebug.lllllllIlIlII[58];
        final int lllllllllllllIlIlIIllllIlIlllIII = lllllllllllllIlIlIIllllIlIllIIIl >> GuiOverlayDebug.lllllllIlIlII[5] & GuiOverlayDebug.lllllllIlIlII[58];
        final int lllllllllllllIlIlIIllllIlIllIlll = lllllllllllllIlIlIIllllIlIllIIIl & GuiOverlayDebug.lllllllIlIlII[58];
        final int lllllllllllllIlIlIIllllIlIllIllI = MathHelper.clamp_int((int)(lllllllllllllIlIlIIllllIlIlllllI + (lllllllllllllIlIlIIllllIlIlllIlI - lllllllllllllIlIlIIllllIlIlllllI) * lllllllllllllIlIlIIllllIlIllIIII), GuiOverlayDebug.lllllllIlIlII[0], GuiOverlayDebug.lllllllIlIlII[58]);
        final int lllllllllllllIlIlIIllllIlIllIlIl = MathHelper.clamp_int((int)(lllllllllllllIlIlIIllllIlIllllIl + (lllllllllllllIlIlIIllllIlIlllIIl - lllllllllllllIlIlIIllllIlIllllIl) * lllllllllllllIlIlIIllllIlIllIIII), GuiOverlayDebug.lllllllIlIlII[0], GuiOverlayDebug.lllllllIlIlII[58]);
        final int lllllllllllllIlIlIIllllIlIllIlII = MathHelper.clamp_int((int)(lllllllllllllIlIlIIllllIlIllllII + (lllllllllllllIlIlIIllllIlIlllIII - lllllllllllllIlIlIIllllIlIllllII) * lllllllllllllIlIlIIllllIlIllIIII), GuiOverlayDebug.lllllllIlIlII[0], GuiOverlayDebug.lllllllIlIlII[58]);
        final int lllllllllllllIlIlIIllllIlIllIIll = MathHelper.clamp_int((int)(lllllllllllllIlIlIIllllIlIlllIll + (lllllllllllllIlIlIIllllIlIllIlll - lllllllllllllIlIlIIllllIlIlllIll) * lllllllllllllIlIlIIllllIlIllIIII), GuiOverlayDebug.lllllllIlIlII[0], GuiOverlayDebug.lllllllIlIlII[58]);
        return lllllllllllllIlIlIIllllIlIllIllI << GuiOverlayDebug.lllllllIlIlII[26] | lllllllllllllIlIlIIllllIlIllIlIl << GuiOverlayDebug.lllllllIlIlII[18] | lllllllllllllIlIlIIllllIlIllIlII << GuiOverlayDebug.lllllllIlIlII[5] | lllllllllllllIlIlIIllllIlIllIIll;
    }
    
    private boolean isReducedDebug() {
        if (lIllIIIlIIllIII(this.mc.thePlayer.hasReducedDebug() ? 1 : 0) && lIllIIIlIIllIII(this.mc.gameSettings.reducedDebugInfo ? 1 : 0)) {
            return GuiOverlayDebug.lllllllIlIlII[0] != 0;
        }
        return GuiOverlayDebug.lllllllIlIlII[1] != 0;
    }
    
    public GuiOverlayDebug(final Minecraft lllllllllllllIlIlIIlllllIlllIlll) {
        this.mc = lllllllllllllIlIlIIlllllIlllIlll;
        this.fontRenderer = lllllllllllllIlIlIIlllllIlllIlll.fontRendererObj;
    }
    
    private static long bytesToMb(final long lllllllllllllIlIlIIllllIlIlIIIlI) {
        return lllllllllllllIlIlIIllllIlIlIIIlI / 1024L / 1024L;
    }
    
    private static boolean lIllIIIlIIlIlll(final int lllllllllllllIlIlIIllllIIlIlIIIl) {
        return lllllllllllllIlIlIIllllIIlIlIIIl != 0;
    }
    
    private static boolean lIllIIIlIIlllll(final int lllllllllllllIlIlIIllllIIlIllllI, final int lllllllllllllIlIlIIllllIIlIlllIl) {
        return lllllllllllllIlIlIIllllIIlIllllI <= lllllllllllllIlIlIIllllIIlIlllIl;
    }
    
    private static boolean lIllIIIlIIlllII(final Object lllllllllllllIlIlIIllllIIlIlIlII, final Object lllllllllllllIlIlIIllllIIlIlIIll) {
        return lllllllllllllIlIlIIllllIIlIlIlII == lllllllllllllIlIlIIllllIIlIlIIll;
    }
    
    private static void lIllIIIlIIlIIlI() {
        (lllllllIIllll = new String[GuiOverlayDebug.lllllllIlIlII[59]])[GuiOverlayDebug.lllllllIlIlII[0]] = lIllIIIlIIIlIll("LiM3MBY=", "JFUEq");
        GuiOverlayDebug.lllllllIIllll[GuiOverlayDebug.lllllllIlIlII[1]] = lIllIIIlIIIllII("ZfkcepG9Wl3e9YPLQgwxaZ2dZQCSIosV", "hHQqo");
        GuiOverlayDebug.lllllllIIllll[GuiOverlayDebug.lllllllIlIlII[2]] = lIllIIIlIIIllII("zpSlA4vLbqQ=", "PNLDD");
        GuiOverlayDebug.lllllllIIllll[GuiOverlayDebug.lllllllIlIlII[6]] = lIllIIIlIIIllII("8YKK/FHXKj8=", "NzASP");
        GuiOverlayDebug.lllllllIIllll[GuiOverlayDebug.lllllllIlIlII[7]] = lIllIIIlIIIlIll("E1Z6", "ClZTV");
        GuiOverlayDebug.lllllllIIllll[GuiOverlayDebug.lllllllIlIlII[8]] = lIllIIIlIIIllIl("iZBLfHDKBPg=", "wzPgI");
        GuiOverlayDebug.lllllllIIllll[GuiOverlayDebug.lllllllIlIlII[9]] = lIllIIIlIIIlIll("", "mPkIj");
        GuiOverlayDebug.lllllllIIllll[GuiOverlayDebug.lllllllIlIlII[10]] = lIllIIIlIIIllII("Nm949+6xnIJfK4APrWFRhBXXucakmRnGoFe775d5MuU=", "nTeZp");
        GuiOverlayDebug.lllllllIIllll[GuiOverlayDebug.lllllllIlIlII[5]] = lIllIIIlIIIlIll("KwYYECoLDA==", "bhnqF");
        GuiOverlayDebug.lllllllIIllll[GuiOverlayDebug.lllllllIlIlII[12]] = lIllIIIlIIIllIl("utZGyGtyyqTlJoG+Bt3VgNdIkUFcpwCS", "FLHbK");
        GuiOverlayDebug.lllllllIIllll[GuiOverlayDebug.lllllllIlIlII[13]] = lIllIIIlIIIllII("Jf16wkslKzMLTNHX6dqWpHODNOz7tM1l", "xsorR");
        GuiOverlayDebug.lllllllIIllll[GuiOverlayDebug.lllllllIlIlII[14]] = lIllIIIlIIIlIll("AwkyCzozFWUELTAHMQM+MkYd", "WfEjH");
        GuiOverlayDebug.lllllllIIllll[GuiOverlayDebug.lllllllIlIlII[15]] = lIllIIIlIIIlIll("OywOOSULMFkoOBwqDTEhCmMh", "oCyXW");
        GuiOverlayDebug.lllllllIIllll[GuiOverlayDebug.lllllllIlIlII[16]] = lIllIIIlIIIllIl("haFAawGdPqqhRQmqjcGt75k6ub/T4jtv", "ozpss");
        GuiOverlayDebug.lllllllIIllll[GuiOverlayDebug.lllllllIlIlII[17]] = lIllIIIlIIIllII("CXEkEyJO2RA=", "uIqaQ");
        GuiOverlayDebug.lllllllIIllll[GuiOverlayDebug.lllllllIlIlII[11]] = lIllIIIlIIIllII("smZLkogTOow=", "IpfXF");
        GuiOverlayDebug.lllllllIIllll[GuiOverlayDebug.lllllllIlIlII[18]] = lIllIIIlIIIlIll("OE1Z", "hwypo");
        GuiOverlayDebug.lllllllIIllll[GuiOverlayDebug.lllllllIlIlII[19]] = lIllIIIlIIIlIll("ZHQfamg=", "JTKPH");
        GuiOverlayDebug.lllllllIIllll[GuiOverlayDebug.lllllllIlIlII[20]] = lIllIIIlIIIllII("jHiIvDH6SnI=", "mxjWT");
        GuiOverlayDebug.lllllllIIllll[GuiOverlayDebug.lllllllIlIlII[21]] = lIllIIIlIIIllIl("P3Kqvtqj31gp2jZCJ6dyEClU+UOnrKy9", "jsmsx");
        GuiOverlayDebug.lllllllIIllll[GuiOverlayDebug.lllllllIlIlII[22]] = lIllIIIlIIIllII("Rdw0lyujccts6ZdVO/TY/Q==", "UmBvx");
        GuiOverlayDebug.lllllllIIllll[GuiOverlayDebug.lllllllIlIlII[23]] = lIllIIIlIIIllII("1YpfEwCDJmlleWHP9qEx7EAsZsoBz7P46f+96IBc8lg=", "IPKWK");
        GuiOverlayDebug.lllllllIIllll[GuiOverlayDebug.lllllllIlIlII[24]] = lIllIIIlIIIlIll("FiAbBQY3e1hJG3BpXR9BcGldQlk2YVdMTX5wHkU=", "PAxlh");
        GuiOverlayDebug.lllllllIIllll[GuiOverlayDebug.lllllllIlIlII[25]] = lIllIIIlIIIllII("mk8Vcr9gwOk=", "lZwmx");
        GuiOverlayDebug.lllllllIIllll[GuiOverlayDebug.lllllllIlIlII[26]] = lIllIIIlIIIllIl("mnt/O3aIda8=", "IRmJX");
        GuiOverlayDebug.lllllllIIllll[GuiOverlayDebug.lllllllIlIlII[27]] = lIllIIIlIIIlIll("SUA=", "ihIby");
        GuiOverlayDebug.lllllllIIllll[GuiOverlayDebug.lllllllIlIlII[28]] = lIllIIIlIIIlIll("TBAoA0hM", "lcCzd");
        GuiOverlayDebug.lllllllIIllll[GuiOverlayDebug.lllllllIlIlII[29]] = lIllIIIlIIIllIl("HYm5x1AB0/U=", "oczun");
        GuiOverlayDebug.lllllllIIllll[GuiOverlayDebug.lllllllIlIlII[30]] = lIllIIIlIIIlIll("Ags5BCZuIDMDLCcHLwk+N156QGR8AnpNDi8dekAuZw==", "NdZeJ");
        GuiOverlayDebug.lllllllIIllll[GuiOverlayDebug.lllllllIlIlII[31]] = lIllIIIlIIIllIl("tkUi5wFkCj92t2sJnAPGFA==", "FvZoV");
        GuiOverlayDebug.lllllllIIllll[GuiOverlayDebug.lllllllIlIlII[32]] = lIllIIIlIIIllIl("foibHJg9ZjBIAMyrxIgaXp11lTNFLZX3", "fFpQe");
        GuiOverlayDebug.lllllllIIllll[GuiOverlayDebug.lllllllIlIlII[33]] = lIllIIIlIIIlIll("PAASOX5WRBd4YRIDDSw=", "vadXD");
        GuiOverlayDebug.lllllllIIllll[GuiOverlayDebug.lllllllIlIlII[34]] = lIllIIIlIIIllIl("SzBsXu1nAHWWE/25fHnR+w==", "mOuSe");
        GuiOverlayDebug.lllllllIIllll[GuiOverlayDebug.lllllllIlIlII[36]] = lIllIIIlIIIllII("bCesDJ1zM+t4QLWaKIAd9uvx5OEn0nLq", "WDZvm");
        GuiOverlayDebug.lllllllIIllll[GuiOverlayDebug.lllllllIlIlII[37]] = lIllIIIlIIIllIl("hI+tQ2w/KJpRkUKOIvdJZHpM6ft9DAdQ2BneCVZe4JA=", "kjJwt");
        GuiOverlayDebug.lllllllIIllll[GuiOverlayDebug.lllllllIlIlII[38]] = lIllIIIlIIIllII("CwZnEJ6sRsg=", "fgyBM");
        GuiOverlayDebug.lllllllIIllll[GuiOverlayDebug.lllllllIlIlII[39]] = lIllIIIlIIIlIll("KSoeU1RPCQ==", "jzKit");
        GuiOverlayDebug.lllllllIIllll[GuiOverlayDebug.lllllllIlIlII[40]] = lIllIIIlIIIlIll("", "vWbZd");
        GuiOverlayDebug.lllllllIIllll[GuiOverlayDebug.lllllllIlIlII[41]] = lIllIIIlIIIllII("DP0/U1EWRLD+wIaSQXJW6ADnTz5Q9sq0", "cabxW");
        GuiOverlayDebug.lllllllIIllll[GuiOverlayDebug.lllllllIlIlII[45]] = lIllIIIlIIIlIll("", "TWUtz");
        GuiOverlayDebug.lllllllIIllll[GuiOverlayDebug.lllllllIlIlII[46]] = lIllIIIlIIIlIll("VmY=", "lFzsI");
        GuiOverlayDebug.lllllllIIllll[GuiOverlayDebug.lllllllIlIlII[49]] = lIllIIIlIIIllIl("e80JPqhnJoA=", "GSuoU");
        GuiOverlayDebug.lllllllIIllll[GuiOverlayDebug.lllllllIlIlII[52]] = lIllIIIlIIIlIll("YXo=", "RJHIA");
    }
    
    private static void lIllIIIlIIlIllI() {
        (lllllllIlIlII = new int[60])[0] = ((0xF7 ^ 0xBA) & ~(0x4A ^ 0x7));
        GuiOverlayDebug.lllllllIlIlII[1] = " ".length();
        GuiOverlayDebug.lllllllIlIlII[2] = "  ".length();
        GuiOverlayDebug.lllllllIlIlII[3] = -(-(0x2C ^ 0x6E) & (0xFFFFAFFB & 0x6FAFFFF5));
        GuiOverlayDebug.lllllllIlIlII[4] = (-(0xFFFFEF1D & 0x1FFB) & (0xFFFFEFF8 & 0xE0FFFF));
        GuiOverlayDebug.lllllllIlIlII[5] = (0x3E ^ 0x4B ^ (0x70 ^ 0xD));
        GuiOverlayDebug.lllllllIlIlII[6] = "   ".length();
        GuiOverlayDebug.lllllllIlIlII[7] = (0x3 ^ 0x65 ^ (0x64 ^ 0x6));
        GuiOverlayDebug.lllllllIlIlII[8] = (0xF5 ^ 0xB2 ^ (0x42 ^ 0x0));
        GuiOverlayDebug.lllllllIlIlII[9] = (0xEC ^ 0x91 ^ (0x3D ^ 0x46));
        GuiOverlayDebug.lllllllIlIlII[10] = (12 + 108 - 50 + 57 ^ (0x38 ^ 0x40));
        GuiOverlayDebug.lllllllIlIlII[11] = (0xA ^ 0x66 ^ (0xA1 ^ 0xC2));
        GuiOverlayDebug.lllllllIlIlII[12] = (0x1C ^ 0x37 ^ (0x56 ^ 0x74));
        GuiOverlayDebug.lllllllIlIlII[13] = (0x3D ^ 0x38 ^ (0x5F ^ 0x50));
        GuiOverlayDebug.lllllllIlIlII[14] = (0xB9 ^ 0xB2);
        GuiOverlayDebug.lllllllIlIlII[15] = (0x40 ^ 0x4C);
        GuiOverlayDebug.lllllllIlIlII[16] = (0x1D ^ 0x1A ^ (0x6E ^ 0x64));
        GuiOverlayDebug.lllllllIlIlII[17] = (0x6D ^ 0x63);
        GuiOverlayDebug.lllllllIlIlII[18] = (0x9D ^ 0xAB ^ (0xB1 ^ 0x97));
        GuiOverlayDebug.lllllllIlIlII[19] = (0xBB ^ 0xAA);
        GuiOverlayDebug.lllllllIlIlII[20] = (24 + 48 + 115 + 2 ^ 36 + 88 - 30 + 81);
        GuiOverlayDebug.lllllllIlIlII[21] = (30 + 74 + 26 + 3 ^ 111 + 120 - 89 + 8);
        GuiOverlayDebug.lllllllIlIlII[22] = (0xDD ^ 0x9C ^ (0xEA ^ 0xBF));
        GuiOverlayDebug.lllllllIlIlII[23] = (65 + 20 + 3 + 86 ^ 169 + 75 - 165 + 108);
        GuiOverlayDebug.lllllllIlIlII[24] = (0xFF ^ 0xA2 ^ (0xDE ^ 0x95));
        GuiOverlayDebug.lllllllIlIlII[25] = (0x76 ^ 0x61);
        GuiOverlayDebug.lllllllIlIlII[26] = (0x6C ^ 0x74);
        GuiOverlayDebug.lllllllIlIlII[27] = (0x6B ^ 0x11 ^ (0x68 ^ 0xB));
        GuiOverlayDebug.lllllllIlIlII[28] = (0x3D ^ 0x4F ^ (0x15 ^ 0x7D));
        GuiOverlayDebug.lllllllIlIlII[29] = (0x15 ^ 0x52 ^ (0x50 ^ 0xC));
        GuiOverlayDebug.lllllllIlIlII[30] = (92 + 8 - 83 + 127 ^ 83 + 100 - 80 + 37);
        GuiOverlayDebug.lllllllIlIlII[31] = (0x19 ^ 0x4);
        GuiOverlayDebug.lllllllIlIlII[32] = (0x4B ^ 0x55);
        GuiOverlayDebug.lllllllIlIlII[33] = (151 + 51 - 142 + 93 ^ 41 + 37 - 75 + 131);
        GuiOverlayDebug.lllllllIlIlII[34] = (0x20 ^ 0x7 ^ (0x3E ^ 0x39));
        GuiOverlayDebug.lllllllIlIlII[35] = (0x4 ^ 0x44);
        GuiOverlayDebug.lllllllIlIlII[36] = (0x25 ^ 0x3A ^ (0x24 ^ 0x1A));
        GuiOverlayDebug.lllllllIlIlII[37] = (0x85 ^ 0x8C ^ (0x49 ^ 0x62));
        GuiOverlayDebug.lllllllIlIlII[38] = (0x6 ^ 0x36 ^ (0x4B ^ 0x58));
        GuiOverlayDebug.lllllllIlIlII[39] = (0x0 ^ 0x24);
        GuiOverlayDebug.lllllllIlIlII[40] = (0x80 ^ 0x9C ^ (0xB9 ^ 0x80));
        GuiOverlayDebug.lllllllIlIlII[41] = (0x22 ^ 0x4);
        GuiOverlayDebug.lllllllIlIlII[42] = (-(42 + 182 - 75 + 57) & (0xFFFF9FFD & 0x7FCF));
        GuiOverlayDebug.lllllllIlIlII[43] = (0xFFFFBFA3 & 0x5F5D);
        GuiOverlayDebug.lllllllIlIlII[44] = (-(0xC5 ^ 0xB3) & (0xFFFFFF77 & 0x1FFF));
        GuiOverlayDebug.lllllllIlIlII[45] = (42 + 39 - 19 + 96 ^ 102 + 118 - 103 + 68);
        GuiOverlayDebug.lllllllIlIlII[46] = (0x7C ^ 0x54);
        GuiOverlayDebug.lllllllIlIlII[47] = (0xAF ^ 0x93);
        GuiOverlayDebug.lllllllIlIlII[48] = 76 + 122 - 166 + 102 + (94 + 70 - 79 + 72) - (0x67 ^ 0xE) + (0x86 ^ 0xB0);
        GuiOverlayDebug.lllllllIlIlII[49] = (0x0 ^ 0x29);
        GuiOverlayDebug.lllllllIlIlII[50] = 62 + 4 + 72 + 55 + (0xB ^ 0xF) - (0xE8 ^ 0xBA) + (0xE5 ^ 0x99);
        GuiOverlayDebug.lllllllIlIlII[51] = -" ".length();
        GuiOverlayDebug.lllllllIlIlII[52] = (2 + 131 - 42 + 82 ^ 30 + 57 - 50 + 98);
        GuiOverlayDebug.lllllllIlIlII[53] = (0xE9 ^ 0x91);
        GuiOverlayDebug.lllllllIlIlII[54] = -(-(0xFFFFF9DD & 0x3FFF) & (0xFFFFF9DD & 0xFF3FFF));
        GuiOverlayDebug.lllllllIlIlII[55] = -(0xFFFFC7B3 & 0xFF394C);
        GuiOverlayDebug.lllllllIlIlII[56] = -(0xFFFFCBA6 & 0x3559);
        GuiOverlayDebug.lllllllIlIlII[57] = -(0xFFFFA38C & 0x15C73);
        GuiOverlayDebug.lllllllIlIlII[58] = 152 + 217 - 199 + 85;
        GuiOverlayDebug.lllllllIlIlII[59] = (0x5F ^ 0x74);
    }
    
    private static String lIllIIIlIIIllIl(final String lllllllllllllIlIlIIllllIIlllIIlI, final String lllllllllllllIlIlIIllllIIllIllll) {
        try {
            final SecretKeySpec lllllllllllllIlIlIIllllIIlllIlIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIlIlIIllllIIllIllll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lllllllllllllIlIlIIllllIIlllIlII = Cipher.getInstance("Blowfish");
            lllllllllllllIlIlIIllllIIlllIlII.init(GuiOverlayDebug.lllllllIlIlII[2], lllllllllllllIlIlIIllllIIlllIlIl);
            return new String(lllllllllllllIlIlIIllllIIlllIlII.doFinal(Base64.getDecoder().decode(lllllllllllllIlIlIIllllIIlllIIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIlIlIIllllIIlllIIll) {
            lllllllllllllIlIlIIllllIIlllIIll.printStackTrace();
            return null;
        }
    }
    
    static /* synthetic */ int[] $SWITCH_TABLE$net$minecraft$util$EnumFacing() {
        final int[] $switch_TABLE$net$minecraft$util$EnumFacing = GuiOverlayDebug.$SWITCH_TABLE$net$minecraft$util$EnumFacing;
        if (lIllIIIlIIllIlI($switch_TABLE$net$minecraft$util$EnumFacing)) {
            return $switch_TABLE$net$minecraft$util$EnumFacing;
        }
        "".length();
        final Exception lllllllllllllIlIlIIllllIlIIlllll = (Object)new int[EnumFacing.values().length];
        try {
            lllllllllllllIlIlIIllllIlIIlllll[EnumFacing.DOWN.ordinal()] = GuiOverlayDebug.lllllllIlIlII[1];
            "".length();
            if (((0xAD ^ 0x9E) & ~(0x9B ^ 0xA8)) != 0x0) {
                return null;
            }
        }
        catch (NoSuchFieldError noSuchFieldError) {
            "".length();
        }
        try {
            lllllllllllllIlIlIIllllIlIIlllll[EnumFacing.EAST.ordinal()] = GuiOverlayDebug.lllllllIlIlII[9];
            "".length();
            if ("  ".length() == 0) {
                return null;
            }
        }
        catch (NoSuchFieldError noSuchFieldError2) {
            "".length();
        }
        try {
            lllllllllllllIlIlIIllllIlIIlllll[EnumFacing.NORTH.ordinal()] = GuiOverlayDebug.lllllllIlIlII[6];
            "".length();
            if (-" ".length() >= 0) {
                return null;
            }
        }
        catch (NoSuchFieldError noSuchFieldError3) {
            "".length();
        }
        try {
            lllllllllllllIlIlIIllllIlIIlllll[EnumFacing.SOUTH.ordinal()] = GuiOverlayDebug.lllllllIlIlII[7];
            "".length();
            if (" ".length() == 0) {
                return null;
            }
        }
        catch (NoSuchFieldError noSuchFieldError4) {
            "".length();
        }
        try {
            lllllllllllllIlIlIIllllIlIIlllll[EnumFacing.UP.ordinal()] = GuiOverlayDebug.lllllllIlIlII[2];
            "".length();
            if (-" ".length() > 0) {
                return null;
            }
        }
        catch (NoSuchFieldError noSuchFieldError5) {
            "".length();
        }
        try {
            lllllllllllllIlIlIIllllIlIIlllll[EnumFacing.WEST.ordinal()] = GuiOverlayDebug.lllllllIlIlII[8];
            "".length();
            if (null != null) {
                return null;
            }
        }
        catch (NoSuchFieldError noSuchFieldError6) {
            "".length();
        }
        return GuiOverlayDebug.$SWITCH_TABLE$net$minecraft$util$EnumFacing = (int[])(Object)lllllllllllllIlIlIIllllIlIIlllll;
    }
}
