// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.client.gui;

import java.util.Iterator;
import java.awt.datatransfer.DataFlavor;
import net.minecraft.stats.StatBase;
import net.minecraft.nbt.NBTBase;
import java.util.Collection;
import net.minecraft.stats.Achievement;
import net.minecraft.util.ChatComponentTranslation;
import net.minecraft.stats.StatList;
import net.minecraft.entity.EntityList;
import com.google.common.collect.Lists;
import net.minecraft.nbt.NBTException;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.JsonToNBT;
import net.minecraft.event.HoverEvent;
import org.lwjgl.input.Mouse;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import java.awt.datatransfer.ClipboardOwner;
import java.awt.datatransfer.Transferable;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import org.apache.commons.lang3.StringUtils;
import tv.twitch.chat.ChatUserInfo;
import net.minecraft.client.gui.stream.GuiTwitchUserMode;
import java.io.File;
import java.net.URISyntaxException;
import net.minecraft.event.ClickEvent;
import net.minecraft.util.IChatComponent;
import org.lwjgl.input.Keyboard;
import java.io.IOException;
import java.lang.reflect.Method;
import com.google.common.collect.Sets;
import org.apache.logging.log4j.LogManager;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import net.minecraft.client.renderer.WorldRenderer;
import net.minecraft.client.renderer.vertex.DefaultVertexFormats;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.RenderHelper;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.Minecraft;
import java.util.Set;
import com.google.common.base.Splitter;
import org.apache.logging.log4j.Logger;
import java.util.List;
import java.net.URI;
import net.minecraft.client.renderer.entity.RenderItem;

public abstract class GuiScreen extends Gui implements GuiYesNoCallback
{
    protected /* synthetic */ FontRenderer fontRendererObj;
    protected /* synthetic */ RenderItem itemRender;
    private /* synthetic */ int eventButton;
    private /* synthetic */ URI clickedLinkURI;
    protected /* synthetic */ List<GuiLabel> labelList;
    private /* synthetic */ int touchValue;
    public /* synthetic */ int height;
    private static final /* synthetic */ String[] lIIllIIIIllIll;
    private static final /* synthetic */ Logger LOGGER;
    private /* synthetic */ GuiButton selectedButton;
    private static final /* synthetic */ Splitter NEWLINE_SPLITTER;
    public /* synthetic */ int width;
    private static final /* synthetic */ Set<String> PROTOCOLS;
    protected /* synthetic */ Minecraft mc;
    private /* synthetic */ long lastMouseEvent;
    private static final /* synthetic */ int[] lIIllIIIlIIIIl;
    protected /* synthetic */ List<GuiButton> buttonList;
    
    private static boolean llIlIllIIIIlIlI(final int lllllllllllllIIlIllIlIIllIlIIIIl, final int lllllllllllllIIlIllIlIIllIlIIIII) {
        return lllllllllllllIIlIllIlIIllIlIIIIl >= lllllllllllllIIlIllIlIIllIlIIIII;
    }
    
    private static int llIlIllIIIlIIll(final long n, final long n2) {
        return lcmp(n, n2);
    }
    
    private static boolean llIlIllIIIlIIlI(final Object lllllllllllllIIlIllIlIIllIIlIIll, final Object lllllllllllllIIlIllIlIIllIIlIIlI) {
        return lllllllllllllIIlIllIlIIllIIlIIll == lllllllllllllIIlIllIlIIllIIlIIlI;
    }
    
    private static boolean llIlIllIIIIlllI(final Object lllllllllllllIIlIllIlIIllIIlIllI) {
        return lllllllllllllIIlIllIlIIllIIlIllI != null;
    }
    
    public void updateScreen() {
    }
    
    public void drawWorldBackground(final int lllllllllllllIIlIllIlIlIIIIlIllI) {
        if (llIlIllIIIIlllI(this.mc.theWorld)) {
            this.drawGradientRect(GuiScreen.lIIllIIIlIIIIl[1], GuiScreen.lIIllIIIlIIIIl[1], this.width, this.height, GuiScreen.lIIllIIIlIIIIl[30], GuiScreen.lIIllIIIlIIIIl[31]);
            "".length();
            if (-"  ".length() >= 0) {
                return;
            }
        }
        else {
            this.drawBackground(lllllllllllllIIlIllIlIlIIIIlIllI);
        }
    }
    
    public void drawScreen(final int lllllllllllllIIlIllIlIllIIIIlIlI, final int lllllllllllllIIlIllIlIllIIIIllll, final float lllllllllllllIIlIllIlIllIIIIlllI) {
        int lllllllllllllIIlIllIlIllIIIIllIl = GuiScreen.lIIllIIIlIIIIl[1];
        "".length();
        if (((0x92 ^ 0xA4) & ~(0xF4 ^ 0xC2)) != 0x0) {
            return;
        }
        while (!llIlIllIIIIlIlI(lllllllllllllIIlIllIlIllIIIIllIl, this.buttonList.size())) {
            this.buttonList.get(lllllllllllllIIlIllIlIllIIIIllIl).drawButton(this.mc, lllllllllllllIIlIllIlIllIIIIlIlI, lllllllllllllIIlIllIlIllIIIIllll);
            ++lllllllllllllIIlIllIlIllIIIIllIl;
        }
        int lllllllllllllIIlIllIlIllIIIIllII = GuiScreen.lIIllIIIlIIIIl[1];
        "".length();
        if ("  ".length() < 0) {
            return;
        }
        while (!llIlIllIIIIlIlI(lllllllllllllIIlIllIlIllIIIIllII, this.labelList.size())) {
            this.labelList.get(lllllllllllllIIlIllIlIllIIIIllII).drawLabel(this.mc, lllllllllllllIIlIllIlIllIIIIlIlI, lllllllllllllIIlIllIlIllIIIIllll);
            ++lllllllllllllIIlIllIlIllIIIIllII;
        }
    }
    
    public void setWorldAndResolution(final Minecraft lllllllllllllIIlIllIlIlIIIlllIIl, final int lllllllllllllIIlIllIlIlIIIlllIII, final int lllllllllllllIIlIllIlIlIIIlllIll) {
        this.mc = lllllllllllllIIlIllIlIlIIIlllIIl;
        this.itemRender = lllllllllllllIIlIllIlIlIIIlllIIl.getRenderItem();
        this.fontRendererObj = lllllllllllllIIlIllIlIlIIIlllIIl.fontRendererObj;
        this.width = lllllllllllllIIlIllIlIlIIIlllIII;
        this.height = lllllllllllllIIlIllIlIlIIIlllIll;
        this.buttonList.clear();
        this.initGui();
    }
    
    private static boolean llIlIllIIIlIlIl(final int lllllllllllllIIlIllIlIIllIIIIlll, final int lllllllllllllIIlIllIlIIllIIIIllI) {
        return lllllllllllllIIlIllIlIIllIIIIlll != lllllllllllllIIlIllIlIIllIIIIllI;
    }
    
    private static boolean llIlIllIIIlIlll(final int lllllllllllllIIlIllIlIIllIIlllIl, final int lllllllllllllIIlIllIlIIllIIlllII) {
        return lllllllllllllIIlIllIlIIllIIlllIl < lllllllllllllIIlIllIlIIllIIlllII;
    }
    
    private static boolean llIlIllIIIIllII(final int lllllllllllllIIlIllIlIIllIlIIlIl, final int lllllllllllllIIlIllIlIIllIlIIlII) {
        return lllllllllllllIIlIllIlIIllIlIIlIl == lllllllllllllIIlIllIlIIllIlIIlII;
    }
    
    protected void drawHoveringText(final List<String> lllllllllllllIIlIllIlIlIllIIlIll, final int lllllllllllllIIlIllIlIlIllIIlIlI, final int lllllllllllllIIlIllIlIlIlIlllIlI) {
        if (llIlIllIIIlIIII(lllllllllllllIIlIllIlIlIllIIlIll.isEmpty() ? 1 : 0)) {
            GlStateManager.disableRescaleNormal();
            RenderHelper.disableStandardItemLighting();
            GlStateManager.disableLighting();
            GlStateManager.disableDepth();
            int lllllllllllllIIlIllIlIlIllIIlIII = GuiScreen.lIIllIIIlIIIIl[1];
            final double lllllllllllllIIlIllIlIlIlIllIlll = (double)lllllllllllllIIlIllIlIlIllIIlIll.iterator();
            "".length();
            if (null != null) {
                return;
            }
            while (!llIlIllIIIlIIII(((Iterator)lllllllllllllIIlIllIlIlIlIllIlll).hasNext() ? 1 : 0)) {
                final String lllllllllllllIIlIllIlIlIllIIIlll = ((Iterator<String>)lllllllllllllIIlIllIlIlIlIllIlll).next();
                final int lllllllllllllIIlIllIlIlIllIIIllI = this.fontRendererObj.getStringWidth(lllllllllllllIIlIllIlIlIllIIIlll);
                if (llIlIllIIIlIIIl(lllllllllllllIIlIllIlIlIllIIIllI, lllllllllllllIIlIllIlIlIllIIlIII)) {
                    lllllllllllllIIlIllIlIlIllIIlIII = lllllllllllllIIlIllIlIlIllIIIllI;
                }
            }
            int lllllllllllllIIlIllIlIlIllIIIlIl = lllllllllllllIIlIllIlIlIllIIlIlI + GuiScreen.lIIllIIIlIIIIl[4];
            int lllllllllllllIIlIllIlIlIllIIIlII = lllllllllllllIIlIllIlIlIlIlllIlI - GuiScreen.lIIllIIIlIIIIl[4];
            int lllllllllllllIIlIllIlIlIllIIIIll = GuiScreen.lIIllIIIlIIIIl[5];
            if (llIlIllIIIlIIIl(lllllllllllllIIlIllIlIlIllIIlIll.size(), GuiScreen.lIIllIIIlIIIIl[2])) {
                lllllllllllllIIlIllIlIlIllIIIIll += GuiScreen.lIIllIIIlIIIIl[0] + (lllllllllllllIIlIllIlIlIllIIlIll.size() - GuiScreen.lIIllIIIlIIIIl[2]) * GuiScreen.lIIllIIIlIIIIl[3];
            }
            if (llIlIllIIIlIIIl(lllllllllllllIIlIllIlIlIllIIIlIl + lllllllllllllIIlIllIlIlIllIIlIII, this.width)) {
                lllllllllllllIIlIllIlIlIllIIIlIl -= GuiScreen.lIIllIIIlIIIIl[6] + lllllllllllllIIlIllIlIlIllIIlIII;
            }
            if (llIlIllIIIlIIIl(lllllllllllllIIlIllIlIlIllIIIlII + lllllllllllllIIlIllIlIlIllIIIIll + GuiScreen.lIIllIIIlIIIIl[7], this.height)) {
                lllllllllllllIIlIllIlIlIllIIIlII = this.height - lllllllllllllIIlIllIlIlIllIIIIll - GuiScreen.lIIllIIIlIIIIl[7];
            }
            this.zLevel = 300.0f;
            this.itemRender.zLevel = 300.0f;
            final int lllllllllllllIIlIllIlIlIllIIIIlI = GuiScreen.lIIllIIIlIIIIl[8];
            this.drawGradientRect(lllllllllllllIIlIllIlIlIllIIIlIl - GuiScreen.lIIllIIIlIIIIl[9], lllllllllllllIIlIllIlIlIllIIIlII - GuiScreen.lIIllIIIlIIIIl[10], lllllllllllllIIlIllIlIlIllIIIlIl + lllllllllllllIIlIllIlIlIllIIlIII + GuiScreen.lIIllIIIlIIIIl[9], lllllllllllllIIlIllIlIlIllIIIlII - GuiScreen.lIIllIIIlIIIIl[9], lllllllllllllIIlIllIlIlIllIIIIlI, lllllllllllllIIlIllIlIlIllIIIIlI);
            this.drawGradientRect(lllllllllllllIIlIllIlIlIllIIIlIl - GuiScreen.lIIllIIIlIIIIl[9], lllllllllllllIIlIllIlIlIllIIIlII + lllllllllllllIIlIllIlIlIllIIIIll + GuiScreen.lIIllIIIlIIIIl[9], lllllllllllllIIlIllIlIlIllIIIlIl + lllllllllllllIIlIllIlIlIllIIlIII + GuiScreen.lIIllIIIlIIIIl[9], lllllllllllllIIlIllIlIlIllIIIlII + lllllllllllllIIlIllIlIlIllIIIIll + GuiScreen.lIIllIIIlIIIIl[10], lllllllllllllIIlIllIlIlIllIIIIlI, lllllllllllllIIlIllIlIlIllIIIIlI);
            this.drawGradientRect(lllllllllllllIIlIllIlIlIllIIIlIl - GuiScreen.lIIllIIIlIIIIl[9], lllllllllllllIIlIllIlIlIllIIIlII - GuiScreen.lIIllIIIlIIIIl[9], lllllllllllllIIlIllIlIlIllIIIlIl + lllllllllllllIIlIllIlIlIllIIlIII + GuiScreen.lIIllIIIlIIIIl[9], lllllllllllllIIlIllIlIlIllIIIlII + lllllllllllllIIlIllIlIlIllIIIIll + GuiScreen.lIIllIIIlIIIIl[9], lllllllllllllIIlIllIlIlIllIIIIlI, lllllllllllllIIlIllIlIlIllIIIIlI);
            this.drawGradientRect(lllllllllllllIIlIllIlIlIllIIIlIl - GuiScreen.lIIllIIIlIIIIl[10], lllllllllllllIIlIllIlIlIllIIIlII - GuiScreen.lIIllIIIlIIIIl[9], lllllllllllllIIlIllIlIlIllIIIlIl - GuiScreen.lIIllIIIlIIIIl[9], lllllllllllllIIlIllIlIlIllIIIlII + lllllllllllllIIlIllIlIlIllIIIIll + GuiScreen.lIIllIIIlIIIIl[9], lllllllllllllIIlIllIlIlIllIIIIlI, lllllllllllllIIlIllIlIlIllIIIIlI);
            this.drawGradientRect(lllllllllllllIIlIllIlIlIllIIIlIl + lllllllllllllIIlIllIlIlIllIIlIII + GuiScreen.lIIllIIIlIIIIl[9], lllllllllllllIIlIllIlIlIllIIIlII - GuiScreen.lIIllIIIlIIIIl[9], lllllllllllllIIlIllIlIlIllIIIlIl + lllllllllllllIIlIllIlIlIllIIlIII + GuiScreen.lIIllIIIlIIIIl[10], lllllllllllllIIlIllIlIlIllIIIlII + lllllllllllllIIlIllIlIlIllIIIIll + GuiScreen.lIIllIIIlIIIIl[9], lllllllllllllIIlIllIlIlIllIIIIlI, lllllllllllllIIlIllIlIlIllIIIIlI);
            final int lllllllllllllIIlIllIlIlIllIIIIIl = GuiScreen.lIIllIIIlIIIIl[11];
            final int lllllllllllllIIlIllIlIlIllIIIIII = (lllllllllllllIIlIllIlIlIllIIIIIl & GuiScreen.lIIllIIIlIIIIl[12]) >> GuiScreen.lIIllIIIlIIIIl[2] | (lllllllllllllIIlIllIlIlIllIIIIIl & GuiScreen.lIIllIIIlIIIIl[13]);
            this.drawGradientRect(lllllllllllllIIlIllIlIlIllIIIlIl - GuiScreen.lIIllIIIlIIIIl[9], lllllllllllllIIlIllIlIlIllIIIlII - GuiScreen.lIIllIIIlIIIIl[9] + GuiScreen.lIIllIIIlIIIIl[2], lllllllllllllIIlIllIlIlIllIIIlIl - GuiScreen.lIIllIIIlIIIIl[9] + GuiScreen.lIIllIIIlIIIIl[2], lllllllllllllIIlIllIlIlIllIIIlII + lllllllllllllIIlIllIlIlIllIIIIll + GuiScreen.lIIllIIIlIIIIl[9] - GuiScreen.lIIllIIIlIIIIl[2], lllllllllllllIIlIllIlIlIllIIIIIl, lllllllllllllIIlIllIlIlIllIIIIII);
            this.drawGradientRect(lllllllllllllIIlIllIlIlIllIIIlIl + lllllllllllllIIlIllIlIlIllIIlIII + GuiScreen.lIIllIIIlIIIIl[0], lllllllllllllIIlIllIlIlIllIIIlII - GuiScreen.lIIllIIIlIIIIl[9] + GuiScreen.lIIllIIIlIIIIl[2], lllllllllllllIIlIllIlIlIllIIIlIl + lllllllllllllIIlIllIlIlIllIIlIII + GuiScreen.lIIllIIIlIIIIl[9], lllllllllllllIIlIllIlIlIllIIIlII + lllllllllllllIIlIllIlIlIllIIIIll + GuiScreen.lIIllIIIlIIIIl[9] - GuiScreen.lIIllIIIlIIIIl[2], lllllllllllllIIlIllIlIlIllIIIIIl, lllllllllllllIIlIllIlIlIllIIIIII);
            this.drawGradientRect(lllllllllllllIIlIllIlIlIllIIIlIl - GuiScreen.lIIllIIIlIIIIl[9], lllllllllllllIIlIllIlIlIllIIIlII - GuiScreen.lIIllIIIlIIIIl[9], lllllllllllllIIlIllIlIlIllIIIlIl + lllllllllllllIIlIllIlIlIllIIlIII + GuiScreen.lIIllIIIlIIIIl[9], lllllllllllllIIlIllIlIlIllIIIlII - GuiScreen.lIIllIIIlIIIIl[9] + GuiScreen.lIIllIIIlIIIIl[2], lllllllllllllIIlIllIlIlIllIIIIIl, lllllllllllllIIlIllIlIlIllIIIIIl);
            this.drawGradientRect(lllllllllllllIIlIllIlIlIllIIIlIl - GuiScreen.lIIllIIIlIIIIl[9], lllllllllllllIIlIllIlIlIllIIIlII + lllllllllllllIIlIllIlIlIllIIIIll + GuiScreen.lIIllIIIlIIIIl[0], lllllllllllllIIlIllIlIlIllIIIlIl + lllllllllllllIIlIllIlIlIllIIlIII + GuiScreen.lIIllIIIlIIIIl[9], lllllllllllllIIlIllIlIlIllIIIlII + lllllllllllllIIlIllIlIlIllIIIIll + GuiScreen.lIIllIIIlIIIIl[9], lllllllllllllIIlIllIlIlIllIIIIII, lllllllllllllIIlIllIlIlIllIIIIII);
            int lllllllllllllIIlIllIlIlIlIllllll = GuiScreen.lIIllIIIlIIIIl[1];
            "".length();
            if (((0x89 ^ 0xA7) & ~(0x41 ^ 0x6F)) > 0) {
                return;
            }
            while (!llIlIllIIIIlIlI(lllllllllllllIIlIllIlIlIlIllllll, lllllllllllllIIlIllIlIlIllIIlIll.size())) {
                final String lllllllllllllIIlIllIlIlIlIlllllI = lllllllllllllIIlIllIlIlIllIIlIll.get(lllllllllllllIIlIllIlIlIlIllllll);
                this.fontRendererObj.drawStringWithShadow(lllllllllllllIIlIllIlIlIlIlllllI, (float)lllllllllllllIIlIllIlIlIllIIIlIl, (float)lllllllllllllIIlIllIlIlIllIIIlII, GuiScreen.lIIllIIIlIIIIl[14]);
                "".length();
                if (llIlIllIIIlIIII(lllllllllllllIIlIllIlIlIlIllllll)) {
                    lllllllllllllIIlIllIlIlIllIIIlII += 2;
                }
                lllllllllllllIIlIllIlIlIllIIIlII += 10;
                ++lllllllllllllIIlIllIlIlIlIllllll;
            }
            this.zLevel = 0.0f;
            this.itemRender.zLevel = 0.0f;
            GlStateManager.enableLighting();
            GlStateManager.enableDepth();
            RenderHelper.enableStandardItemLighting();
            GlStateManager.enableRescaleNormal();
        }
    }
    
    public void drawBackground(final int lllllllllllllIIlIllIlIlIIIIIllll) {
        GlStateManager.disableLighting();
        GlStateManager.disableFog();
        final Tessellator lllllllllllllIIlIllIlIlIIIIIlllI = Tessellator.getInstance();
        final WorldRenderer lllllllllllllIIlIllIlIlIIIIIllIl = lllllllllllllIIlIllIlIlIIIIIlllI.getWorldRenderer();
        this.mc.getTextureManager().bindTexture(GuiScreen.optionsBackground);
        GlStateManager.color(1.0f, 1.0f, 1.0f, 1.0f);
        final float lllllllllllllIIlIllIlIlIIIIIllII = 32.0f;
        lllllllllllllIIlIllIlIlIIIIIllIl.begin(GuiScreen.lIIllIIIlIIIIl[16], DefaultVertexFormats.POSITION_TEX_COLOR);
        lllllllllllllIIlIllIlIlIIIIIllIl.pos(0.0, this.height, 0.0).tex(0.0, this.height / 32.0f + lllllllllllllIIlIllIlIlIIIIIllll).color(GuiScreen.lIIllIIIlIIIIl[32], GuiScreen.lIIllIIIlIIIIl[32], GuiScreen.lIIllIIIlIIIIl[32], GuiScreen.lIIllIIIlIIIIl[33]).endVertex();
        lllllllllllllIIlIllIlIlIIIIIllIl.pos(this.width, this.height, 0.0).tex(this.width / 32.0f, this.height / 32.0f + lllllllllllllIIlIllIlIlIIIIIllll).color(GuiScreen.lIIllIIIlIIIIl[32], GuiScreen.lIIllIIIlIIIIl[32], GuiScreen.lIIllIIIlIIIIl[32], GuiScreen.lIIllIIIlIIIIl[33]).endVertex();
        lllllllllllllIIlIllIlIlIIIIIllIl.pos(this.width, 0.0, 0.0).tex(this.width / 32.0f, lllllllllllllIIlIllIlIlIIIIIllll).color(GuiScreen.lIIllIIIlIIIIl[32], GuiScreen.lIIllIIIlIIIIl[32], GuiScreen.lIIllIIIlIIIIl[32], GuiScreen.lIIllIIIlIIIIl[33]).endVertex();
        lllllllllllllIIlIllIlIlIIIIIllIl.pos(0.0, 0.0, 0.0).tex(0.0, lllllllllllllIIlIllIlIlIIIIIllll).color(GuiScreen.lIIllIIIlIIIIl[32], GuiScreen.lIIllIIIlIIIIl[32], GuiScreen.lIIllIIIlIIIIl[32], GuiScreen.lIIllIIIlIIIIl[33]).endVertex();
        lllllllllllllIIlIllIlIlIIIIIlllI.draw();
    }
    
    public static boolean isKeyComboCtrlX(final int lllllllllllllIIlIllIlIIlllllIIII) {
        if (llIlIllIIIIllII(lllllllllllllIIlIllIlIIlllllIIII, GuiScreen.lIIllIIIlIIIIl[46]) && llIlIllIIIIllll(isCtrlKeyDown() ? 1 : 0) && llIlIllIIIlIIII(isShiftKeyDown() ? 1 : 0) && llIlIllIIIlIIII(isAltKeyDown() ? 1 : 0)) {
            return GuiScreen.lIIllIIIlIIIIl[2] != 0;
        }
        return GuiScreen.lIIllIIIlIIIIl[1] != 0;
    }
    
    private static String llIlIlIllllIlIl(final String lllllllllllllIIlIllIlIIllIlllIlI, final String lllllllllllllIIlIllIlIIllIlllIIl) {
        try {
            final SecretKeySpec lllllllllllllIIlIllIlIIllIllllIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIIlIllIlIIllIlllIIl.getBytes(StandardCharsets.UTF_8)), GuiScreen.lIIllIIIlIIIIl[5]), "DES");
            final Cipher lllllllllllllIIlIllIlIIllIllllII = Cipher.getInstance("DES");
            lllllllllllllIIlIllIlIIllIllllII.init(GuiScreen.lIIllIIIlIIIIl[0], lllllllllllllIIlIllIlIIllIllllIl);
            return new String(lllllllllllllIIlIllIlIIllIllllII.doFinal(Base64.getDecoder().decode(lllllllllllllIIlIllIlIIllIlllIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIlIllIlIIllIlllIll) {
            lllllllllllllIIlIllIlIIllIlllIll.printStackTrace();
            return null;
        }
    }
    
    public void sendChatMessage(final String lllllllllllllIIlIllIlIlIIllIllII, final boolean lllllllllllllIIlIllIlIlIIllIlIII) {
        if (llIlIllIIIIllll(lllllllllllllIIlIllIlIlIIllIlIII ? 1 : 0)) {
            this.mc.ingameGUI.getChatGUI().addToSentMessages(lllllllllllllIIlIllIlIlIIllIllII);
        }
        this.mc.thePlayer.sendChatMessage(lllllllllllllIIlIllIlIlIIllIllII);
    }
    
    static {
        llIlIllIIIIlIIl();
        llIlIlIllllIlll();
        LOGGER = LogManager.getLogger();
        final String[] array = new String[GuiScreen.lIIllIIIlIIIIl[0]];
        array[GuiScreen.lIIllIIIlIIIIl[1]] = GuiScreen.lIIllIIIIllIll[GuiScreen.lIIllIIIlIIIIl[1]];
        array[GuiScreen.lIIllIIIlIIIIl[2]] = GuiScreen.lIIllIIIIllIll[GuiScreen.lIIllIIIlIIIIl[2]];
        PROTOCOLS = Sets.newHashSet((Object[])array);
        NEWLINE_SPLITTER = Splitter.on((char)GuiScreen.lIIllIIIlIIIIl[3]);
    }
    
    @Override
    public void confirmClicked(final boolean lllllllllllllIIlIllIlIIllllllllI, final int lllllllllllllIIlIllIlIIlllllllIl) {
        if (llIlIllIIIIllII(lllllllllllllIIlIllIlIIlllllllIl, GuiScreen.lIIllIIIlIIIIl[26])) {
            if (llIlIllIIIIllll(lllllllllllllIIlIllIlIIllllllllI ? 1 : 0)) {
                this.openWebLink(this.clickedLinkURI);
            }
            this.clickedLinkURI = null;
            this.mc.displayGuiScreen(this);
        }
    }
    
    private static boolean llIlIllIIIlIIIl(final int lllllllllllllIIlIllIlIIllIIllIIl, final int lllllllllllllIIlIllIlIIllIIllIII) {
        return lllllllllllllIIlIllIlIIllIIllIIl > lllllllllllllIIlIllIlIIllIIllIII;
    }
    
    private void openWebLink(final URI lllllllllllllIIlIllIlIIllllllIII) {
        try {
            final Class<?> lllllllllllllIIlIllIlIIlllllIlll = Class.forName(GuiScreen.lIIllIIIIllIll[GuiScreen.lIIllIIIlIIIIl[34]]);
            final Object lllllllllllllIIlIllIlIIlllllIllI = lllllllllllllIIlIllIlIIlllllIlll.getMethod(GuiScreen.lIIllIIIIllIll[GuiScreen.lIIllIIIlIIIIl[35]], (Class<?>[])new Class[GuiScreen.lIIllIIIlIIIIl[1]]).invoke(null, new Object[GuiScreen.lIIllIIIlIIIIl[1]]);
            final Class<?> clazz = lllllllllllllIIlIllIlIIlllllIlll;
            final String name = GuiScreen.lIIllIIIIllIll[GuiScreen.lIIllIIIlIIIIl[36]];
            final Class[] parameterTypes = new Class[GuiScreen.lIIllIIIlIIIIl[2]];
            parameterTypes[GuiScreen.lIIllIIIlIIIIl[1]] = URI.class;
            final Method method = clazz.getMethod(name, (Class[])parameterTypes);
            final Object obj = lllllllllllllIIlIllIlIIlllllIllI;
            final Object[] args = new Object[GuiScreen.lIIllIIIlIIIIl[2]];
            args[GuiScreen.lIIllIIIlIIIIl[1]] = lllllllllllllIIlIllIlIIllllllIII;
            method.invoke(obj, args);
            "".length();
            "".length();
            if (null != null) {
                return;
            }
        }
        catch (Throwable lllllllllllllIIlIllIlIIlllllIlIl) {
            GuiScreen.LOGGER.error(GuiScreen.lIIllIIIIllIll[GuiScreen.lIIllIIIlIIIIl[37]], lllllllllllllIIlIllIlIIlllllIlIl);
        }
    }
    
    protected void mouseClicked(final int lllllllllllllIIlIllIlIlIIlIllIlI, final int lllllllllllllIIlIllIlIlIIlIllIIl, final int lllllllllllllIIlIllIlIlIIlIllIII) throws IOException {
        if (llIlIllIIIlIIII(lllllllllllllIIlIllIlIlIIlIllIII)) {
            int lllllllllllllIIlIllIlIlIIlIlllIl = GuiScreen.lIIllIIIlIIIIl[1];
            "".length();
            if ((175 + 125 - 164 + 60 ^ 19 + 35 + 121 + 17) != (0x53 ^ 0x46 ^ (0x1D ^ 0xC))) {
                return;
            }
            while (!llIlIllIIIIlIlI(lllllllllllllIIlIllIlIlIIlIlllIl, this.buttonList.size())) {
                final GuiButton lllllllllllllIIlIllIlIlIIlIlllII = this.buttonList.get(lllllllllllllIIlIllIlIlIIlIlllIl);
                if (llIlIllIIIIllll(lllllllllllllIIlIllIlIlIIlIlllII.mousePressed(this.mc, lllllllllllllIIlIllIlIlIIlIllIlI, lllllllllllllIIlIllIlIlIIlIllIIl) ? 1 : 0)) {
                    this.selectedButton = lllllllllllllIIlIllIlIlIIlIlllII;
                    lllllllllllllIIlIllIlIlIIlIlllII.playPressSound(this.mc.getSoundHandler());
                    this.actionPerformed(lllllllllllllIIlIllIlIlIIlIlllII);
                }
                ++lllllllllllllIIlIllIlIlIIlIlllIl;
            }
        }
    }
    
    public static boolean isShiftKeyDown() {
        if (llIlIllIIIlIIII(Keyboard.isKeyDown(GuiScreen.lIIllIIIlIIIIl[42]) ? 1 : 0) && llIlIllIIIlIIII(Keyboard.isKeyDown(GuiScreen.lIIllIIIlIIIIl[43]) ? 1 : 0)) {
            return GuiScreen.lIIllIIIlIIIIl[1] != 0;
        }
        return GuiScreen.lIIllIIIlIIIIl[2] != 0;
    }
    
    protected void mouseClickMove(final int lllllllllllllIIlIllIlIlIIlIIlIII, final int lllllllllllllIIlIllIlIlIIlIIIlll, final int lllllllllllllIIlIllIlIlIIlIIIllI, final long lllllllllllllIIlIllIlIlIIlIIIlIl) {
    }
    
    public static boolean isKeyComboCtrlV(final int lllllllllllllIIlIllIlIIllllIllIl) {
        if (llIlIllIIIIllII(lllllllllllllIIlIllIlIIllllIllIl, GuiScreen.lIIllIIIlIIIIl[47]) && llIlIllIIIIllll(isCtrlKeyDown() ? 1 : 0) && llIlIllIIIlIIII(isShiftKeyDown() ? 1 : 0) && llIlIllIIIlIIII(isAltKeyDown() ? 1 : 0)) {
            return GuiScreen.lIIllIIIlIIIIl[2] != 0;
        }
        return GuiScreen.lIIllIIIlIIIIl[1] != 0;
    }
    
    private static boolean llIlIllIIIIllIl(final Object lllllllllllllIIlIllIlIIllIIlIIII) {
        return lllllllllllllIIlIllIlIIllIIlIIII == null;
    }
    
    private static boolean llIlIllIIIlIIII(final int lllllllllllllIIlIllIlIIllIIIllII) {
        return lllllllllllllIIlIllIlIIllIIIllII == 0;
    }
    
    protected boolean handleComponentClick(final IChatComponent lllllllllllllIIlIllIlIlIIllllIlI) {
        if (llIlIllIIIIllIl(lllllllllllllIIlIllIlIlIIllllIlI)) {
            return GuiScreen.lIIllIIIlIIIIl[1] != 0;
        }
        final ClickEvent lllllllllllllIIlIllIlIlIlIIIIIIl = lllllllllllllIIlIllIlIlIIllllIlI.getChatStyle().getChatClickEvent();
        if (llIlIllIIIIllll(isShiftKeyDown() ? 1 : 0)) {
            if (llIlIllIIIIlllI(lllllllllllllIIlIllIlIlIIllllIlI.getChatStyle().getInsertion())) {
                this.setText(lllllllllllllIIlIllIlIlIIllllIlI.getChatStyle().getInsertion(), (boolean)(GuiScreen.lIIllIIIlIIIIl[1] != 0));
                "".length();
                if (null != null) {
                    return ((0x32 ^ 0x66) & ~(0xCB ^ 0x9F)) != 0x0;
                }
            }
        }
        else if (llIlIllIIIIlllI(lllllllllllllIIlIllIlIlIlIIIIIIl)) {
            if (llIlIllIIIlIIlI(lllllllllllllIIlIllIlIlIlIIIIIIl.getAction(), ClickEvent.Action.OPEN_URL)) {
                if (llIlIllIIIlIIII(this.mc.gameSettings.chatLinks ? 1 : 0)) {
                    return GuiScreen.lIIllIIIlIIIIl[1] != 0;
                }
                try {
                    final URI lllllllllllllIIlIllIlIlIlIIIIIII = new URI(lllllllllllllIIlIllIlIlIlIIIIIIl.getValue());
                    final String lllllllllllllIIlIllIlIlIIlllllll = lllllllllllllIIlIllIlIlIlIIIIIII.getScheme();
                    if (llIlIllIIIIllIl(lllllllllllllIIlIllIlIlIIlllllll)) {
                        throw new URISyntaxException(lllllllllllllIIlIllIlIlIlIIIIIIl.getValue(), GuiScreen.lIIllIIIIllIll[GuiScreen.lIIllIIIlIIIIl[24]]);
                    }
                    if (llIlIllIIIlIIII(GuiScreen.PROTOCOLS.contains(lllllllllllllIIlIllIlIlIIlllllll.toLowerCase()) ? 1 : 0)) {
                        throw new URISyntaxException(lllllllllllllIIlIllIlIlIlIIIIIIl.getValue(), String.valueOf(new StringBuilder(GuiScreen.lIIllIIIIllIll[GuiScreen.lIIllIIIlIIIIl[25]]).append(lllllllllllllIIlIllIlIlIIlllllll.toLowerCase())));
                    }
                    if (llIlIllIIIIllll(this.mc.gameSettings.chatLinksPrompt ? 1 : 0)) {
                        this.clickedLinkURI = lllllllllllllIIlIllIlIlIlIIIIIII;
                        this.mc.displayGuiScreen(new GuiConfirmOpenLink(this, lllllllllllllIIlIllIlIlIlIIIIIIl.getValue(), GuiScreen.lIIllIIIlIIIIl[26], (boolean)(GuiScreen.lIIllIIIlIIIIl[1] != 0)));
                        "".length();
                        if ("  ".length() == -" ".length()) {
                            return ((0x95 ^ 0xC0 ^ (0x76 ^ 0x35)) & (0xF2 ^ 0x83 ^ (0x2D ^ 0x4A) ^ -" ".length())) != 0x0;
                        }
                        return GuiScreen.lIIllIIIlIIIIl[2] != 0;
                    }
                    else {
                        this.openWebLink(lllllllllllllIIlIllIlIlIlIIIIIII);
                        "".length();
                        if ((0xA7 ^ 0xA3) <= -" ".length()) {
                            return ((0x14 ^ 0x46) & ~(0x42 ^ 0x10)) != 0x0;
                        }
                        return GuiScreen.lIIllIIIlIIIIl[2] != 0;
                    }
                }
                catch (URISyntaxException lllllllllllllIIlIllIlIlIIllllllI) {
                    GuiScreen.LOGGER.error(String.valueOf(new StringBuilder(GuiScreen.lIIllIIIIllIll[GuiScreen.lIIllIIIlIIIIl[27]]).append(lllllllllllllIIlIllIlIlIlIIIIIIl)), (Throwable)lllllllllllllIIlIllIlIlIIllllllI);
                    "".length();
                    if (((0xC ^ 0x3D) & ~(0x1B ^ 0x2A)) != 0x0) {
                        return ((0xF3 ^ 0xC5) & ~(0xBF ^ 0x89)) != 0x0;
                    }
                    return GuiScreen.lIIllIIIlIIIIl[2] != 0;
                }
            }
            if (llIlIllIIIlIIlI(lllllllllllllIIlIllIlIlIlIIIIIIl.getAction(), ClickEvent.Action.OPEN_FILE)) {
                final URI lllllllllllllIIlIllIlIlIIlllllIl = new File(lllllllllllllIIlIllIlIlIlIIIIIIl.getValue()).toURI();
                this.openWebLink(lllllllllllllIIlIllIlIlIIlllllIl);
                "".length();
                if (-" ".length() != -" ".length()) {
                    return ((0x51 ^ 0x1) & ~(0xD5 ^ 0x85)) != 0x0;
                }
            }
            else if (llIlIllIIIlIIlI(lllllllllllllIIlIllIlIlIlIIIIIIl.getAction(), ClickEvent.Action.SUGGEST_COMMAND)) {
                this.setText(lllllllllllllIIlIllIlIlIlIIIIIIl.getValue(), (boolean)(GuiScreen.lIIllIIIlIIIIl[2] != 0));
                "".length();
                if (null != null) {
                    return ((0xE3 ^ 0x8C ^ (0x62 ^ 0x32)) & (0x49 ^ 0x1B ^ (0x3B ^ 0x56) ^ -" ".length())) != 0x0;
                }
            }
            else if (llIlIllIIIlIIlI(lllllllllllllIIlIllIlIlIlIIIIIIl.getAction(), ClickEvent.Action.RUN_COMMAND)) {
                this.sendChatMessage(lllllllllllllIIlIllIlIlIlIIIIIIl.getValue(), (boolean)(GuiScreen.lIIllIIIlIIIIl[1] != 0));
                "".length();
                if (-" ".length() == (0x9 ^ 0xD)) {
                    return ((0xB1 ^ 0xB9) & ~(0x8A ^ 0x82)) != 0x0;
                }
            }
            else if (llIlIllIIIlIIlI(lllllllllllllIIlIllIlIlIlIIIIIIl.getAction(), ClickEvent.Action.TWITCH_USER_INFO)) {
                final ChatUserInfo lllllllllllllIIlIllIlIlIIlllllII = this.mc.getTwitchStream().func_152926_a(lllllllllllllIIlIllIlIlIlIIIIIIl.getValue());
                if (llIlIllIIIIlllI(lllllllllllllIIlIllIlIlIIlllllII)) {
                    this.mc.displayGuiScreen(new GuiTwitchUserMode(this.mc.getTwitchStream(), lllllllllllllIIlIllIlIlIIlllllII));
                    "".length();
                    if (-" ".length() < -" ".length()) {
                        return ((0x8E ^ 0xB4) & ~(0x59 ^ 0x63)) != 0x0;
                    }
                }
                else {
                    GuiScreen.LOGGER.error(GuiScreen.lIIllIIIIllIll[GuiScreen.lIIllIIIlIIIIl[28]]);
                    "".length();
                    if (null != null) {
                        return ((0xE ^ 0x4B) & ~(0xD9 ^ 0x9C)) != 0x0;
                    }
                }
            }
            else {
                GuiScreen.LOGGER.error(String.valueOf(new StringBuilder(GuiScreen.lIIllIIIIllIll[GuiScreen.lIIllIIIlIIIIl[29]]).append(lllllllllllllIIlIllIlIlIlIIIIIIl)));
            }
            return GuiScreen.lIIllIIIlIIIIl[2] != 0;
        }
        return GuiScreen.lIIllIIIlIIIIl[1] != 0;
    }
    
    protected void actionPerformed(final GuiButton lllllllllllllIIlIllIlIlIIlIIIIll) throws IOException {
    }
    
    protected void keyTyped(final char lllllllllllllIIlIllIlIllIIIIIlII, final int lllllllllllllIIlIllIlIllIIIIIIll) throws IOException {
        if (llIlIllIIIIllII(lllllllllllllIIlIllIlIllIIIIIIll, GuiScreen.lIIllIIIlIIIIl[2])) {
            this.mc.displayGuiScreen(null);
            if (llIlIllIIIIllIl(this.mc.currentScreen)) {
                this.mc.setIngameFocus();
            }
        }
    }
    
    public static boolean isCtrlKeyDown() {
        int n;
        if (llIlIllIIIIllll(Minecraft.isRunningOnMac ? 1 : 0)) {
            if (llIlIllIIIlIIII(Keyboard.isKeyDown(GuiScreen.lIIllIIIlIIIIl[38]) ? 1 : 0) && llIlIllIIIlIIII(Keyboard.isKeyDown(GuiScreen.lIIllIIIlIIIIl[39]) ? 1 : 0)) {
                n = GuiScreen.lIIllIIIlIIIIl[1];
                "".length();
                if ("  ".length() > "  ".length()) {
                    return ((0x38 ^ 0x66) & ~(0x20 ^ 0x7E)) != 0x0;
                }
            }
            else {
                n = GuiScreen.lIIllIIIlIIIIl[2];
                "".length();
                if ("  ".length() > "   ".length()) {
                    return ((0x61 ^ 0x59) & ~(0x9C ^ 0xA4)) != 0x0;
                }
            }
        }
        else if (llIlIllIIIlIIII(Keyboard.isKeyDown(GuiScreen.lIIllIIIlIIIIl[40]) ? 1 : 0) && llIlIllIIIlIIII(Keyboard.isKeyDown(GuiScreen.lIIllIIIlIIIIl[41]) ? 1 : 0)) {
            n = GuiScreen.lIIllIIIlIIIIl[1];
            "".length();
            if (-(0x7 ^ 0x3) >= 0) {
                return ((0xC ^ 0x38) & ~(0x2E ^ 0x1A)) != 0x0;
            }
        }
        else {
            n = GuiScreen.lIIllIIIlIIIIl[2];
        }
        return n != 0;
    }
    
    public static void setClipboardString(final String lllllllllllllIIlIllIlIlIlllllIll) {
        if (llIlIllIIIlIIII(StringUtils.isEmpty((CharSequence)lllllllllllllIIlIllIlIlIlllllIll) ? 1 : 0)) {
            try {
                final StringSelection lllllllllllllIIlIllIlIlIlllllIlI = new StringSelection(lllllllllllllIIlIllIlIlIlllllIll);
                Toolkit.getDefaultToolkit().getSystemClipboard().setContents(lllllllllllllIIlIllIlIlIlllllIlI, null);
                "".length();
                if (-(0xA8 ^ 0xAD ^ ((0x2F ^ 0x74) & ~(0x1E ^ 0x45))) >= 0) {
                    return;
                }
            }
            catch (Exception ex) {}
        }
    }
    
    public static boolean isKeyComboCtrlC(final int lllllllllllllIIlIllIlIIllllIlIlI) {
        if (llIlIllIIIIllII(lllllllllllllIIlIllIlIIllllIlIlI, GuiScreen.lIIllIIIlIIIIl[48]) && llIlIllIIIIllll(isCtrlKeyDown() ? 1 : 0) && llIlIllIIIlIIII(isShiftKeyDown() ? 1 : 0) && llIlIllIIIlIIII(isAltKeyDown() ? 1 : 0)) {
            return GuiScreen.lIIllIIIlIIIIl[2] != 0;
        }
        return GuiScreen.lIIllIIIlIIIIl[1] != 0;
    }
    
    private static boolean llIlIllIIIlIlII(final int lllllllllllllIIlIllIlIIllIIIlIlI) {
        return lllllllllllllIIlIllIlIIllIIIlIlI > 0;
    }
    
    public void sendChatMessage(final String lllllllllllllIIlIllIlIlIIlllIIll) {
        this.sendChatMessage(lllllllllllllIIlIllIlIlIIlllIIll, (boolean)(GuiScreen.lIIllIIIlIIIIl[2] != 0));
    }
    
    protected void mouseReleased(final int lllllllllllllIIlIllIlIlIIlIlIIII, final int lllllllllllllIIlIllIlIlIIlIIllll, final int lllllllllllllIIlIllIlIlIIlIIlIlI) {
        if (llIlIllIIIIlllI(this.selectedButton) && llIlIllIIIlIIII(lllllllllllllIIlIllIlIlIIlIIlIlI)) {
            this.selectedButton.mouseReleased(lllllllllllllIIlIllIlIlIIlIlIIII, lllllllllllllIIlIllIlIlIIlIIllll);
            this.selectedButton = null;
        }
    }
    
    private static void llIlIlIllllIlll() {
        (lIIllIIIIllIll = new String[GuiScreen.lIIllIIIlIIIIl[50]])[GuiScreen.lIIllIIIlIIIIl[1]] = llIlIlIllllIlII("Z1co0/Gu68s=", "krwKG");
        GuiScreen.lIIllIIIIllIll[GuiScreen.lIIllIIIlIIIIl[2]] = llIlIlIllllIlIl("xZKwj7f+orI=", "AJytX");
        GuiScreen.lIIllIIIIllIll[GuiScreen.lIIllIIIlIIIIl[0]] = llIlIlIllllIllI("", "qGOYN");
        GuiScreen.lIIllIIIIllIll[GuiScreen.lIIllIIIlIIIIl[9]] = llIlIlIllllIlII("yULwA+mBfB7Q6EO1f6fROw==", "LxWdU");
        GuiScreen.lIIllIIIIllIll[GuiScreen.lIIllIIIlIIIIl[10]] = llIlIlIllllIllI("BQwpLA==", "kmDIU");
        GuiScreen.lIIllIIIIllIll[GuiScreen.lIIllIIIlIIIIl[15]] = llIlIlIllllIlIl("VvC2yqUGnd0=", "TgVeo");
        GuiScreen.lIIllIIIIllIll[GuiScreen.lIIllIIIlIIIIl[7]] = llIlIlIllllIlIl("cTm7K3dJTyM=", "eOqIo");
        GuiScreen.lIIllIIIIllIll[GuiScreen.lIIllIIIlIIIIl[16]] = llIlIlIllllIllI("FyEHMHNj", "CXwUI");
        GuiScreen.lIIllIIIIllIll[GuiScreen.lIIllIIIlIIIIl[5]] = llIlIlIllllIlII("qlxX+j9hZIk=", "gmpHh");
        GuiScreen.lIIllIIIIllIll[GuiScreen.lIIllIIIlIIIIl[17]] = llIlIlIllllIlIl("momqXO49ahk=", "wegbf");
        GuiScreen.lIIllIIIIllIll[GuiScreen.lIIllIIIlIIIIl[3]] = llIlIlIllllIlIl("MXLtvygmjho=", "ZjKvY");
        GuiScreen.lIIllIIIIllIll[GuiScreen.lIIllIIIlIIIIl[18]] = llIlIlIllllIlIl("ZCoAP7h+JsueRi5JSQDAcQ==", "iVTqq");
        GuiScreen.lIIllIIIIllIll[GuiScreen.lIIllIIIlIIIIl[4]] = llIlIlIllllIlIl("NksJiC3/HUlMfuaxjfsuAg==", "egeDf");
        GuiScreen.lIIllIIIIllIll[GuiScreen.lIIllIIIlIIIIl[19]] = llIlIlIllllIlIl("tP5VlXlKf4kG196ylhHFw/jD/YA+pU6/", "cSzNR");
        GuiScreen.lIIllIIIIllIll[GuiScreen.lIIllIIIlIIIIl[20]] = llIlIlIllllIlII("9mT9dmjgwWo96LNBGiZiXQ==", "crTuS");
        GuiScreen.lIIllIIIIllIll[GuiScreen.lIIllIIIlIIIIl[21]] = llIlIlIllllIllI("Cx4JJB8LHgEz", "xjhPv");
        GuiScreen.lIIllIIIIllIll[GuiScreen.lIIllIIIlIIIIl[23]] = llIlIlIllllIllI("MQsTCRQRAUUbDBkRDBsMEQZKCRsQDAAeHRUACxxZ", "xeehx");
        GuiScreen.lIIllIIIIllIll[GuiScreen.lIIllIIIlIIIIl[24]] = llIlIlIllllIlIl("ZaTMqmmUPD0FMUPig9SGtgbZFRR2tOKj", "lTfUu");
        GuiScreen.lIIllIIIIllIll[GuiScreen.lIIllIIIlIIIIl[25]] = llIlIlIllllIllI("Ohs0Ah0fGjUDCAtVNwUCGxokGAFVVQ==", "ouGwm");
        GuiScreen.lIIllIIIIllIll[GuiScreen.lIIllIIIlIIIIl[27]] = llIlIlIllllIlIl("7vqUNtNKEN+On024vvdFj6S7Ox6UprAU", "NInqo");
        GuiScreen.lIIllIIIIllIll[GuiScreen.lIIllIIIlIIIIl[28]] = llIlIlIllllIlIl("2Vzx7LfaLN7VJMxFup+uqQv2J0F3sYkuLFwbpSOjN3dxTgJU8IasdK7zPflYtgkArvUse5xlYEI=", "tNrHb");
        GuiScreen.lIIllIIIIllIll[GuiScreen.lIIllIIIlIIIIl[29]] = llIlIlIllllIlII("Gjs+GUsir2LNccgvHhp2HWw3CZrn2WqZOmweSMuFUDE=", "NWtnX");
        GuiScreen.lIIllIIIIllIll[GuiScreen.lIIllIIIlIIIIl[34]] = llIlIlIllllIllI("Aw4wLV4IGDJiNAwcLTgfGQ==", "ioFLp");
        GuiScreen.lIIllIIIIllIll[GuiScreen.lIIllIIIlIIIIl[35]] = llIlIlIllllIllI("FgMtLy0CDS0EOA==", "qfYkH");
        GuiScreen.lIIllIIIIllIll[GuiScreen.lIIllIIIlIIIIl[36]] = llIlIlIllllIlIl("T8MbyovVv9A=", "tUTuE");
        GuiScreen.lIIllIIIIllIll[GuiScreen.lIIllIIIlIIIIl[37]] = llIlIlIllllIllI("JwccGzcKTx1XPBQNB1c/DQYC", "dhiwS");
    }
    
    private static void llIlIllIIIIlIIl() {
        (lIIllIIIlIIIIl = new int[51])[0] = "  ".length();
        GuiScreen.lIIllIIIlIIIIl[1] = ((0x8B ^ 0xBC ^ (0x5A ^ 0x2B)) & (154 + 131 - 178 + 100 ^ 34 + 8 - 2 + 97 ^ -" ".length()));
        GuiScreen.lIIllIIIlIIIIl[2] = " ".length();
        GuiScreen.lIIllIIIlIIIIl[3] = (0xDC ^ 0xB7 ^ (0x46 ^ 0x27));
        GuiScreen.lIIllIIIlIIIIl[4] = (0x59 ^ 0x4D ^ (0xC ^ 0x14));
        GuiScreen.lIIllIIIlIIIIl[5] = (0x20 ^ 0x28);
        GuiScreen.lIIllIIIlIIIIl[6] = (0xAF ^ 0xB3);
        GuiScreen.lIIllIIIlIIIIl[7] = (0x92 ^ 0x94);
        GuiScreen.lIIllIIIlIIIIl[8] = -(-(0xB4 ^ 0xB3) & (0xFFFFFFFE & 0xFEFFFF7));
        GuiScreen.lIIllIIIlIIIIl[9] = "   ".length();
        GuiScreen.lIIllIIIlIIIIl[10] = (0x6E ^ 0x6A);
        GuiScreen.lIIllIIIlIIIIl[11] = (0xFFFFBDFF & 0x505042FF);
        GuiScreen.lIIllIIIlIIIIl[12] = (-(0xFFFF8DCE & 0x7333) & (-1 & 0xFEFFFF));
        GuiScreen.lIIllIIIlIIIIl[13] = -(-(0xFFFFDFFF & 0x7F9B) & (0xFFFFFFDE & 0x1005FBB));
        GuiScreen.lIIllIIIlIIIIl[14] = -" ".length();
        GuiScreen.lIIllIIIlIIIIl[15] = (0x94 ^ 0x91);
        GuiScreen.lIIllIIIlIIIIl[16] = (0x74 ^ 0x73);
        GuiScreen.lIIllIIIlIIIIl[17] = (0x34 ^ 0x3D);
        GuiScreen.lIIllIIIlIIIIl[18] = (0x62 ^ 0x69);
        GuiScreen.lIIllIIIlIIIIl[19] = (0xC5 ^ 0xAF ^ (0xE8 ^ 0x8F));
        GuiScreen.lIIllIIIlIIIIl[20] = (0x4 ^ 0xA);
        GuiScreen.lIIllIIIlIIIIl[21] = (0x9A ^ 0x95);
        GuiScreen.lIIllIIIlIIIIl[22] = 37 + 66 - 36 + 70 + (0xB4 ^ 0x8A) - (0x29 ^ 0x58) + (0x5 ^ 0x45);
        GuiScreen.lIIllIIIlIIIIl[23] = (0x77 ^ 0x20 ^ (0x2E ^ 0x69));
        GuiScreen.lIIllIIIlIIIIl[24] = (46 + 131 - 150 + 148 ^ 33 + 182 - 164 + 139);
        GuiScreen.lIIllIIIlIIIIl[25] = (0x23 ^ 0x31);
        GuiScreen.lIIllIIIlIIIIl[26] = (0xFFFFDDF9 & 0x1DAB63F);
        GuiScreen.lIIllIIIlIIIIl[27] = (0x3B ^ 0x28);
        GuiScreen.lIIllIIIlIIIIl[28] = (0xC7 ^ 0x81 ^ (0xD6 ^ 0x84));
        GuiScreen.lIIllIIIlIIIIl[29] = (0x9B ^ 0x8E);
        GuiScreen.lIIllIIIlIIIIl[30] = -(-(0xFFFFF31B & 0x1CED) & (0xFFFFFFFB & 0x3FEFFFFC));
        GuiScreen.lIIllIIIlIIIIl[31] = -(-(0x9F ^ 0x98) & (0xFFFFFFF6 & 0x2FEFEFFF));
        GuiScreen.lIIllIIIlIIIIl[32] = (0x2F ^ 0x6F);
        GuiScreen.lIIllIIIlIIIIl[33] = 118 + 240 - 180 + 70 + (0x3F ^ 0x2B) - (0xD2 ^ 0xA6) + (0x2E ^ 0x49);
        GuiScreen.lIIllIIIlIIIIl[34] = (0x7E ^ 0x68);
        GuiScreen.lIIllIIIlIIIIl[35] = (0x9A ^ 0x8D);
        GuiScreen.lIIllIIIlIIIIl[36] = (0xB0 ^ 0xBB ^ (0x63 ^ 0x70));
        GuiScreen.lIIllIIIlIIIIl[37] = (0x6 ^ 0x1F);
        GuiScreen.lIIllIIIlIIIIl[38] = 15 + 92 + 57 + 55;
        GuiScreen.lIIllIIIlIIIIl[39] = (0x1C ^ 0x3D) + (0xF3 ^ 0x87) - (32 + 120 - 54 + 45) + (3 + 184 - 129 + 156);
        GuiScreen.lIIllIIIlIIIIl[40] = (0x6A ^ 0x77);
        GuiScreen.lIIllIIIlIIIIl[41] = (0x6F ^ 0x2F) + (0x23 ^ 0x1B) - (0xA6 ^ 0x80) + (0x8 ^ 0x43);
        GuiScreen.lIIllIIIlIIIIl[42] = (0x7C ^ 0x72 ^ (0x44 ^ 0x60));
        GuiScreen.lIIllIIIlIIIIl[43] = (0x9D ^ 0xAB);
        GuiScreen.lIIllIIIlIIIIl[44] = (0x5A ^ 0x53 ^ (0x9E ^ 0xAF));
        GuiScreen.lIIllIIIlIIIIl[45] = 106 + 141 - 148 + 85;
        GuiScreen.lIIllIIIlIIIIl[46] = (0x5F ^ 0x72);
        GuiScreen.lIIllIIIlIIIIl[47] = (0x61 ^ 0x48 ^ (0x4B ^ 0x4D));
        GuiScreen.lIIllIIIlIIIIl[48] = (0x44 ^ 0x73 ^ (0x61 ^ 0x78));
        GuiScreen.lIIllIIIlIIIIl[49] = (0x2B ^ 0x35);
        GuiScreen.lIIllIIIlIIIIl[50] = (0xAB ^ 0xB1);
    }
    
    public void drawDefaultBackground() {
        this.drawWorldBackground(GuiScreen.lIIllIIIlIIIIl[1]);
    }
    
    public void onResize(final Minecraft lllllllllllllIIlIllIlIIlllIlllII, final int lllllllllllllIIlIllIlIIlllIlllll, final int lllllllllllllIIlIllIlIIlllIllIlI) {
        this.setWorldAndResolution(lllllllllllllIIlIllIlIIlllIlllII, lllllllllllllIIlIllIlIIlllIlllll, lllllllllllllIIlIllIlIIlllIllIlI);
    }
    
    private static boolean llIlIllIIIIllll(final int lllllllllllllIIlIllIlIIllIIIlllI) {
        return lllllllllllllIIlIllIlIIllIIIlllI != 0;
    }
    
    private static String llIlIlIllllIllI(String lllllllllllllIIlIllIlIIlllIIlIlI, final String lllllllllllllIIlIllIlIIlllIIlIIl) {
        lllllllllllllIIlIllIlIIlllIIlIlI = new String(Base64.getDecoder().decode(lllllllllllllIIlIllIlIIlllIIlIlI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIIlIllIlIIlllIIllIl = new StringBuilder();
        final char[] lllllllllllllIIlIllIlIIlllIIllII = lllllllllllllIIlIllIlIIlllIIlIIl.toCharArray();
        int lllllllllllllIIlIllIlIIlllIIlIll = GuiScreen.lIIllIIIlIIIIl[1];
        final long lllllllllllllIIlIllIlIIlllIIIlIl = (Object)lllllllllllllIIlIllIlIIlllIIlIlI.toCharArray();
        final boolean lllllllllllllIIlIllIlIIlllIIIlII = lllllllllllllIIlIllIlIIlllIIIlIl.length != 0;
        double lllllllllllllIIlIllIlIIlllIIIIll = GuiScreen.lIIllIIIlIIIIl[1];
        while (llIlIllIIIlIlll((int)lllllllllllllIIlIllIlIIlllIIIIll, lllllllllllllIIlIllIlIIlllIIIlII ? 1 : 0)) {
            final char lllllllllllllIIlIllIlIIlllIlIIII = lllllllllllllIIlIllIlIIlllIIIlIl[lllllllllllllIIlIllIlIIlllIIIIll];
            lllllllllllllIIlIllIlIIlllIIllIl.append((char)(lllllllllllllIIlIllIlIIlllIlIIII ^ lllllllllllllIIlIllIlIIlllIIllII[lllllllllllllIIlIllIlIIlllIIlIll % lllllllllllllIIlIllIlIIlllIIllII.length]));
            "".length();
            ++lllllllllllllIIlIllIlIIlllIIlIll;
            ++lllllllllllllIIlIllIlIIlllIIIIll;
            "".length();
            if ("  ".length() == "   ".length()) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIIlIllIlIIlllIIllIl);
    }
    
    protected void renderToolTip(final ItemStack lllllllllllllIIlIllIlIlIlllIlIlI, final int lllllllllllllIIlIllIlIlIlllIllll, final int lllllllllllllIIlIllIlIlIlllIlIII) {
        final List<String> lllllllllllllIIlIllIlIlIlllIllIl = lllllllllllllIIlIllIlIlIlllIlIlI.getTooltip(this.mc.thePlayer, this.mc.gameSettings.advancedItemTooltips);
        int lllllllllllllIIlIllIlIlIlllIllII = GuiScreen.lIIllIIIlIIIIl[1];
        "".length();
        if ((0x2B ^ 0x2E) <= 0) {
            return;
        }
        while (!llIlIllIIIIlIlI(lllllllllllllIIlIllIlIlIlllIllII, lllllllllllllIIlIllIlIlIlllIllIl.size())) {
            if (llIlIllIIIlIIII(lllllllllllllIIlIllIlIlIlllIllII)) {
                lllllllllllllIIlIllIlIlIlllIllIl.set(lllllllllllllIIlIllIlIlIlllIllII, String.valueOf(new StringBuilder().append(lllllllllllllIIlIllIlIlIlllIlIlI.getRarity().rarityColor).append(lllllllllllllIIlIllIlIlIlllIllIl.get(lllllllllllllIIlIllIlIlIlllIllII))));
                "".length();
                "".length();
                if ("   ".length() <= -" ".length()) {
                    return;
                }
            }
            else {
                lllllllllllllIIlIllIlIlIlllIllIl.set(lllllllllllllIIlIllIlIlIlllIllII, String.valueOf(new StringBuilder().append(EnumChatFormatting.GRAY).append(lllllllllllllIIlIllIlIlIlllIllIl.get(lllllllllllllIIlIllIlIlIlllIllII))));
                "".length();
            }
            ++lllllllllllllIIlIllIlIlIlllIllII;
        }
        this.drawHoveringText(lllllllllllllIIlIllIlIlIlllIllIl, lllllllllllllIIlIllIlIlIlllIllll, lllllllllllllIIlIllIlIlIlllIlIII);
    }
    
    public void handleInput() throws IOException {
        if (llIlIllIIIIllll(Mouse.isCreated() ? 1 : 0)) {
            "".length();
            if (null != null) {
                return;
            }
            while (!llIlIllIIIlIIII(Mouse.next() ? 1 : 0)) {
                this.handleMouseInput();
            }
        }
        if (llIlIllIIIIllll(Keyboard.isCreated() ? 1 : 0)) {
            "".length();
            if ((102 + 148 - 238 + 155 ^ 138 + 67 - 199 + 156) == 0x0) {
                return;
            }
            while (!llIlIllIIIlIIII(Keyboard.next() ? 1 : 0)) {
                this.handleKeyboardInput();
            }
        }
    }
    
    public static boolean isKeyComboCtrlA(final int lllllllllllllIIlIllIlIIllllIIlll) {
        if (llIlIllIIIIllII(lllllllllllllIIlIllIlIIllllIIlll, GuiScreen.lIIllIIIlIIIIl[49]) && llIlIllIIIIllll(isCtrlKeyDown() ? 1 : 0) && llIlIllIIIlIIII(isShiftKeyDown() ? 1 : 0) && llIlIllIIIlIIII(isAltKeyDown() ? 1 : 0)) {
            return GuiScreen.lIIllIIIlIIIIl[2] != 0;
        }
        return GuiScreen.lIIllIIIlIIIIl[1] != 0;
    }
    
    protected void setText(final String lllllllllllllIIlIllIlIlIlIIIlIlI, final boolean lllllllllllllIIlIllIlIlIlIIIlIIl) {
    }
    
    protected void handleComponentHover(final IChatComponent lllllllllllllIIlIllIlIlIlIlIIlIl, final int lllllllllllllIIlIllIlIlIlIlIIlII, final int lllllllllllllIIlIllIlIlIlIIlIIlI) {
        if (llIlIllIIIIlllI(lllllllllllllIIlIllIlIlIlIlIIlIl) && llIlIllIIIIlllI(lllllllllllllIIlIllIlIlIlIlIIlIl.getChatStyle().getChatHoverEvent())) {
            final HoverEvent lllllllllllllIIlIllIlIlIlIlIIIlI = lllllllllllllIIlIllIlIlIlIlIIlIl.getChatStyle().getChatHoverEvent();
            Label_0948: {
                if (llIlIllIIIlIIlI(lllllllllllllIIlIllIlIlIlIlIIIlI.getAction(), HoverEvent.Action.SHOW_ITEM)) {
                    ItemStack lllllllllllllIIlIllIlIlIlIlIIIIl = null;
                    try {
                        final NBTBase lllllllllllllIIlIllIlIlIlIlIIIII = JsonToNBT.getTagFromJson(lllllllllllllIIlIllIlIlIlIlIIIlI.getValue().getUnformattedText());
                        if (llIlIllIIIIllll((lllllllllllllIIlIllIlIlIlIlIIIII instanceof NBTTagCompound) ? 1 : 0)) {
                            lllllllllllllIIlIllIlIlIlIlIIIIl = ItemStack.loadItemStackFromNBT((NBTTagCompound)lllllllllllllIIlIllIlIlIlIlIIIII);
                            "".length();
                            if (-"   ".length() >= 0) {
                                return;
                            }
                        }
                    }
                    catch (NBTException ex) {}
                    if (llIlIllIIIIlllI(lllllllllllllIIlIllIlIlIlIlIIIIl)) {
                        this.renderToolTip(lllllllllllllIIlIllIlIlIlIlIIIIl, lllllllllllllIIlIllIlIlIlIlIIlII, lllllllllllllIIlIllIlIlIlIIlIIlI);
                        "".length();
                        if (-"  ".length() >= 0) {
                            return;
                        }
                    }
                    else {
                        this.drawCreativeTabHoveringText(String.valueOf(new StringBuilder().append(EnumChatFormatting.RED).append(GuiScreen.lIIllIIIIllIll[GuiScreen.lIIllIIIlIIIIl[9]])), lllllllllllllIIlIllIlIlIlIlIIlII, lllllllllllllIIlIllIlIlIlIIlIIlI);
                        "".length();
                        if (null != null) {
                            return;
                        }
                    }
                }
                else {
                    if (llIlIllIIIlIIlI(lllllllllllllIIlIllIlIlIlIlIIIlI.getAction(), HoverEvent.Action.SHOW_ENTITY)) {
                        if (!llIlIllIIIIllll(this.mc.gameSettings.advancedItemTooltips ? 1 : 0)) {
                            break Label_0948;
                        }
                        try {
                            final NBTBase lllllllllllllIIlIllIlIlIlIIlllll = JsonToNBT.getTagFromJson(lllllllllllllIIlIllIlIlIlIlIIIlI.getValue().getUnformattedText());
                            if (llIlIllIIIIllll((lllllllllllllIIlIllIlIlIlIIlllll instanceof NBTTagCompound) ? 1 : 0)) {
                                final List<String> lllllllllllllIIlIllIlIlIlIIllllI = (List<String>)Lists.newArrayList();
                                final NBTTagCompound lllllllllllllIIlIllIlIlIlIIlllIl = (NBTTagCompound)lllllllllllllIIlIllIlIlIlIIlllll;
                                lllllllllllllIIlIllIlIlIlIIllllI.add(lllllllllllllIIlIllIlIlIlIIlllIl.getString(GuiScreen.lIIllIIIIllIll[GuiScreen.lIIllIIIlIIIIl[10]]));
                                "".length();
                                if (llIlIllIIIIllll(lllllllllllllIIlIllIlIlIlIIlllIl.hasKey(GuiScreen.lIIllIIIIllIll[GuiScreen.lIIllIIIlIIIIl[15]], GuiScreen.lIIllIIIlIIIIl[5]) ? 1 : 0)) {
                                    final String lllllllllllllIIlIllIlIlIlIIlllII = lllllllllllllIIlIllIlIlIlIIlllIl.getString(GuiScreen.lIIllIIIIllIll[GuiScreen.lIIllIIIlIIIIl[7]]);
                                    lllllllllllllIIlIllIlIlIlIIllllI.add(String.valueOf(new StringBuilder(GuiScreen.lIIllIIIIllIll[GuiScreen.lIIllIIIlIIIIl[16]]).append(lllllllllllllIIlIllIlIlIlIIlllII).append(GuiScreen.lIIllIIIIllIll[GuiScreen.lIIllIIIlIIIIl[5]]).append(EntityList.getIDFromString(lllllllllllllIIlIllIlIlIlIIlllII)).append(GuiScreen.lIIllIIIIllIll[GuiScreen.lIIllIIIlIIIIl[17]])));
                                    "".length();
                                }
                                lllllllllllllIIlIllIlIlIlIIllllI.add(lllllllllllllIIlIllIlIlIlIIlllIl.getString(GuiScreen.lIIllIIIIllIll[GuiScreen.lIIllIIIlIIIIl[3]]));
                                "".length();
                                this.drawHoveringText(lllllllllllllIIlIllIlIlIlIIllllI, lllllllllllllIIlIllIlIlIlIlIIlII, lllllllllllllIIlIllIlIlIlIIlIIlI);
                                "".length();
                                if (-(0x2B ^ 0x2E) >= 0) {
                                    return;
                                }
                                break Label_0948;
                            }
                            else {
                                this.drawCreativeTabHoveringText(String.valueOf(new StringBuilder().append(EnumChatFormatting.RED).append(GuiScreen.lIIllIIIIllIll[GuiScreen.lIIllIIIlIIIIl[18]])), lllllllllllllIIlIllIlIlIlIlIIlII, lllllllllllllIIlIllIlIlIlIIlIIlI);
                                "".length();
                                if (" ".length() < 0) {
                                    return;
                                }
                                break Label_0948;
                            }
                        }
                        catch (NBTException lllllllllllllIIlIllIlIlIlIIllIll) {
                            this.drawCreativeTabHoveringText(String.valueOf(new StringBuilder().append(EnumChatFormatting.RED).append(GuiScreen.lIIllIIIIllIll[GuiScreen.lIIllIIIlIIIIl[4]])), lllllllllllllIIlIllIlIlIlIlIIlII, lllllllllllllIIlIllIlIlIlIIlIIlI);
                            "".length();
                            if (-" ".length() > 0) {
                                return;
                            }
                            break Label_0948;
                        }
                    }
                    if (llIlIllIIIlIIlI(lllllllllllllIIlIllIlIlIlIlIIIlI.getAction(), HoverEvent.Action.SHOW_TEXT)) {
                        this.drawHoveringText(GuiScreen.NEWLINE_SPLITTER.splitToList((CharSequence)lllllllllllllIIlIllIlIlIlIlIIIlI.getValue().getFormattedText()), lllllllllllllIIlIllIlIlIlIlIIlII, lllllllllllllIIlIllIlIlIlIIlIIlI);
                        "".length();
                        if (-" ".length() == (0x90 ^ 0x94)) {
                            return;
                        }
                    }
                    else if (llIlIllIIIlIIlI(lllllllllllllIIlIllIlIlIlIlIIIlI.getAction(), HoverEvent.Action.SHOW_ACHIEVEMENT)) {
                        final StatBase lllllllllllllIIlIllIlIlIlIIllIlI = StatList.getOneShotStat(lllllllllllllIIlIllIlIlIlIlIIIlI.getValue().getUnformattedText());
                        if (llIlIllIIIIlllI(lllllllllllllIIlIllIlIlIlIIllIlI)) {
                            final IChatComponent lllllllllllllIIlIllIlIlIlIIllIIl = lllllllllllllIIlIllIlIlIlIIllIlI.getStatName();
                            final StringBuilder sb = new StringBuilder(GuiScreen.lIIllIIIIllIll[GuiScreen.lIIllIIIlIIIIl[19]]);
                            String str;
                            if (llIlIllIIIIllll(lllllllllllllIIlIllIlIlIlIIllIlI.isAchievement() ? 1 : 0)) {
                                str = GuiScreen.lIIllIIIIllIll[GuiScreen.lIIllIIIlIIIIl[20]];
                                "".length();
                                if ("  ".length() >= "   ".length()) {
                                    return;
                                }
                            }
                            else {
                                str = GuiScreen.lIIllIIIIllIll[GuiScreen.lIIllIIIlIIIIl[21]];
                            }
                            final IChatComponent lllllllllllllIIlIllIlIlIlIIllIII = new ChatComponentTranslation(String.valueOf(sb.append(str)), new Object[GuiScreen.lIIllIIIlIIIIl[1]]);
                            lllllllllllllIIlIllIlIlIlIIllIII.getChatStyle().setItalic((boolean)(GuiScreen.lIIllIIIlIIIIl[2] != 0));
                            "".length();
                            String description;
                            if (llIlIllIIIIllll((lllllllllllllIIlIllIlIlIlIIllIlI instanceof Achievement) ? 1 : 0)) {
                                description = ((Achievement)lllllllllllllIIlIllIlIlIlIIllIlI).getDescription();
                                "".length();
                                if (-"  ".length() >= 0) {
                                    return;
                                }
                            }
                            else {
                                description = null;
                            }
                            final String lllllllllllllIIlIllIlIlIlIIlIlll = description;
                            final String[] array = new String[GuiScreen.lIIllIIIlIIIIl[0]];
                            array[GuiScreen.lIIllIIIlIIIIl[1]] = lllllllllllllIIlIllIlIlIlIIllIIl.getFormattedText();
                            array[GuiScreen.lIIllIIIlIIIIl[2]] = lllllllllllllIIlIllIlIlIlIIllIII.getFormattedText();
                            final List<String> lllllllllllllIIlIllIlIlIlIIlIllI = (List<String>)Lists.newArrayList((Object[])array);
                            if (llIlIllIIIIlllI(lllllllllllllIIlIllIlIlIlIIlIlll)) {
                                lllllllllllllIIlIllIlIlIlIIlIllI.addAll(this.fontRendererObj.listFormattedStringToWidth(lllllllllllllIIlIllIlIlIlIIlIlll, GuiScreen.lIIllIIIlIIIIl[22]));
                                "".length();
                            }
                            this.drawHoveringText(lllllllllllllIIlIllIlIlIlIIlIllI, lllllllllllllIIlIllIlIlIlIlIIlII, lllllllllllllIIlIllIlIlIlIIlIIlI);
                            "".length();
                            if (" ".length() != " ".length()) {
                                return;
                            }
                        }
                        else {
                            this.drawCreativeTabHoveringText(String.valueOf(new StringBuilder().append(EnumChatFormatting.RED).append(GuiScreen.lIIllIIIIllIll[GuiScreen.lIIllIIIlIIIIl[23]])), lllllllllllllIIlIllIlIlIlIlIIlII, lllllllllllllIIlIllIlIlIlIIlIIlI);
                        }
                    }
                }
            }
            GlStateManager.disableLighting();
        }
    }
    
    public void handleMouseInput() throws IOException {
        final int lllllllllllllIIlIllIlIlIIIlIllII = Mouse.getEventX() * this.width / this.mc.displayWidth;
        final int lllllllllllllIIlIllIlIlIIIlIlIll = this.height - Mouse.getEventY() * this.height / this.mc.displayHeight - GuiScreen.lIIllIIIlIIIIl[2];
        final int lllllllllllllIIlIllIlIlIIIlIlIlI = Mouse.getEventButton();
        if (llIlIllIIIIllll(Mouse.getEventButtonState() ? 1 : 0)) {
            if (llIlIllIIIIllll(this.mc.gameSettings.touchscreen ? 1 : 0)) {
                final int touchValue = this.touchValue;
                this.touchValue = touchValue + GuiScreen.lIIllIIIlIIIIl[2];
                if (llIlIllIIIlIlII(touchValue)) {
                    return;
                }
            }
            this.eventButton = lllllllllllllIIlIllIlIlIIIlIlIlI;
            this.lastMouseEvent = Minecraft.getSystemTime();
            this.mouseClicked(lllllllllllllIIlIllIlIlIIIlIllII, lllllllllllllIIlIllIlIlIIIlIlIll, this.eventButton);
            "".length();
            if ("  ".length() < 0) {
                return;
            }
        }
        else if (llIlIllIIIlIlIl(lllllllllllllIIlIllIlIlIIIlIlIlI, GuiScreen.lIIllIIIlIIIIl[14])) {
            if (llIlIllIIIIllll(this.mc.gameSettings.touchscreen ? 1 : 0)) {
                final int n = this.touchValue - GuiScreen.lIIllIIIlIIIIl[2];
                this.touchValue = n;
                if (llIlIllIIIlIlII(n)) {
                    return;
                }
            }
            this.eventButton = GuiScreen.lIIllIIIlIIIIl[14];
            this.mouseReleased(lllllllllllllIIlIllIlIlIIIlIllII, lllllllllllllIIlIllIlIlIIIlIlIll, lllllllllllllIIlIllIlIlIIIlIlIlI);
            "".length();
            if (null != null) {
                return;
            }
        }
        else if (llIlIllIIIlIlIl(this.eventButton, GuiScreen.lIIllIIIlIIIIl[14]) && llIlIllIIIlIlII(llIlIllIIIlIIll(this.lastMouseEvent, 0L))) {
            final long lllllllllllllIIlIllIlIlIIIlIlIIl = Minecraft.getSystemTime() - this.lastMouseEvent;
            this.mouseClickMove(lllllllllllllIIlIllIlIlIIIlIllII, lllllllllllllIIlIllIlIlIIIlIlIll, this.eventButton, lllllllllllllIIlIllIlIlIIIlIlIIl);
        }
    }
    
    public void onGuiClosed() {
    }
    
    protected void drawCreativeTabHoveringText(final String lllllllllllllIIlIllIlIlIllIlllII, final int lllllllllllllIIlIllIlIlIllIllIll, final int lllllllllllllIIlIllIlIlIllIllllI) {
        final String[] a = new String[GuiScreen.lIIllIIIlIIIIl[2]];
        a[GuiScreen.lIIllIIIlIIIIl[1]] = lllllllllllllIIlIllIlIlIllIlllII;
        this.drawHoveringText(Arrays.asList(a), lllllllllllllIIlIllIlIlIllIllIll, lllllllllllllIIlIllIlIlIllIllllI);
    }
    
    public GuiScreen() {
        this.buttonList = (List<GuiButton>)Lists.newArrayList();
        this.labelList = (List<GuiLabel>)Lists.newArrayList();
    }
    
    public boolean doesGuiPauseGame() {
        return GuiScreen.lIIllIIIlIIIIl[2] != 0;
    }
    
    public void handleKeyboardInput() throws IOException {
        if (llIlIllIIIIllll(Keyboard.getEventKeyState() ? 1 : 0)) {
            this.keyTyped(Keyboard.getEventCharacter(), Keyboard.getEventKey());
        }
        this.mc.dispatchKeypresses();
    }
    
    public static boolean isAltKeyDown() {
        if (llIlIllIIIlIIII(Keyboard.isKeyDown(GuiScreen.lIIllIIIlIIIIl[44]) ? 1 : 0) && llIlIllIIIlIIII(Keyboard.isKeyDown(GuiScreen.lIIllIIIlIIIIl[45]) ? 1 : 0)) {
            return GuiScreen.lIIllIIIlIIIIl[1] != 0;
        }
        return GuiScreen.lIIllIIIlIIIIl[2] != 0;
    }
    
    private static String llIlIlIllllIlII(final String lllllllllllllIIlIllIlIIllIlIllIl, final String lllllllllllllIIlIllIlIIllIlIllII) {
        try {
            final SecretKeySpec lllllllllllllIIlIllIlIIllIllIIII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIIlIllIlIIllIlIllII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lllllllllllllIIlIllIlIIllIlIllll = Cipher.getInstance("Blowfish");
            lllllllllllllIIlIllIlIIllIlIllll.init(GuiScreen.lIIllIIIlIIIIl[0], lllllllllllllIIlIllIlIIllIllIIII);
            return new String(lllllllllllllIIlIllIlIIllIlIllll.doFinal(Base64.getDecoder().decode(lllllllllllllIIlIllIlIIllIlIllIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIlIllIlIIllIlIlllI) {
            lllllllllllllIIlIllIlIIllIlIlllI.printStackTrace();
            return null;
        }
    }
    
    public void initGui() {
    }
    
    public static String getClipboardString() {
        try {
            final Transferable lllllllllllllIIlIllIlIlIllllllll = Toolkit.getDefaultToolkit().getSystemClipboard().getContents(null);
            if (llIlIllIIIIlllI(lllllllllllllIIlIllIlIlIllllllll) && llIlIllIIIIllll(lllllllllllllIIlIllIlIlIllllllll.isDataFlavorSupported(DataFlavor.stringFlavor) ? 1 : 0)) {
                return (String)lllllllllllllIIlIllIlIlIllllllll.getTransferData(DataFlavor.stringFlavor);
            }
        }
        catch (Exception ex) {}
        return GuiScreen.lIIllIIIIllIll[GuiScreen.lIIllIIIlIIIIl[0]];
    }
}
