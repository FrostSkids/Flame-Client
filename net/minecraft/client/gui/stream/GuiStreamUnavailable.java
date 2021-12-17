// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.client.gui.stream;

import java.util.Iterator;
import java.io.IOException;
import java.util.ArrayList;
import net.minecraft.client.stream.IStream;
import java.util.Arrays;
import net.minecraft.util.Session;
import net.minecraft.util.Util;
import tv.twitch.ErrorCode;
import net.minecraft.client.stream.NullStream;
import org.lwjgl.opengl.GLContext;
import org.lwjgl.opengl.GL11;
import net.minecraft.client.renderer.OpenGlHelper;
import net.minecraft.client.Minecraft;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.security.MessageDigest;
import java.lang.reflect.Method;
import java.net.URI;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.resources.I18n;
import java.util.Collection;
import org.apache.logging.log4j.LogManager;
import com.google.common.collect.Lists;
import net.minecraft.util.IChatComponent;
import net.minecraft.util.ChatComponentTranslation;
import java.util.List;
import org.apache.logging.log4j.Logger;
import net.minecraft.client.gui.GuiScreen;

public class GuiStreamUnavailable extends GuiScreen
{
    private static final /* synthetic */ String[] llIlIIllIIllll;
    private static final /* synthetic */ Logger field_152322_a;
    private static volatile /* synthetic */ int[] $SWITCH_TABLE$net$minecraft$util$Util$EnumOS;
    private static volatile /* synthetic */ int[] $SWITCH_TABLE$net$minecraft$client$stream$IStream$AuthFailureReason;
    private final /* synthetic */ List<String> field_152323_r;
    private final /* synthetic */ List<ChatComponentTranslation> field_152327_i;
    private final /* synthetic */ IChatComponent field_152324_f;
    private final /* synthetic */ GuiScreen parentScreen;
    private static final /* synthetic */ int[] llIlIIllIlIIll;
    private final /* synthetic */ Reason field_152326_h;
    
    public GuiStreamUnavailable(final GuiScreen llllllllllllIllIlIlllllIIlIIllII, final Reason llllllllllllIllIlIlllllIIlIIllll, final List<ChatComponentTranslation> llllllllllllIllIlIlllllIIlIIlllI) {
        this.field_152324_f = new ChatComponentTranslation(GuiStreamUnavailable.llIlIIllIIllll[GuiStreamUnavailable.llIlIIllIlIIll[0]], new Object[GuiStreamUnavailable.llIlIIllIlIIll[0]]);
        this.field_152323_r = (List<String>)Lists.newArrayList();
        this.parentScreen = llllllllllllIllIlIlllllIIlIIllII;
        this.field_152326_h = llllllllllllIllIlIlllllIIlIIllll;
        this.field_152327_i = llllllllllllIllIlIlllllIIlIIlllI;
    }
    
    static {
        lIIlIIlIllllIIll();
        lIIlIIlIlllIllll();
        field_152322_a = LogManager.getLogger();
    }
    
    @Override
    public void initGui() {
        if (lIIlIIlIllllIlII(this.field_152323_r.isEmpty() ? 1 : 0)) {
            this.field_152323_r.addAll(this.fontRendererObj.listFormattedStringToWidth(this.field_152326_h.func_152561_a().getFormattedText(), (int)(this.width * 0.75f)));
            "".length();
            if (lIIlIIlIllllIlIl(this.field_152327_i)) {
                this.field_152323_r.add(GuiStreamUnavailable.llIlIIllIIllll[GuiStreamUnavailable.llIlIIllIlIIll[1]]);
                "".length();
                final char llllllllllllIllIlIlllllIIlIIIIlI = (char)this.field_152327_i.iterator();
                "".length();
                if ("  ".length() > (0x12 ^ 0x16)) {
                    return;
                }
                while (!lIIlIIlIllllIllI(((Iterator)llllllllllllIllIlIlllllIIlIIIIlI).hasNext() ? 1 : 0)) {
                    final ChatComponentTranslation llllllllllllIllIlIlllllIIlIIIlIl = ((Iterator<ChatComponentTranslation>)llllllllllllIllIlIlllllIIlIIIIlI).next();
                    this.field_152323_r.add(llllllllllllIllIlIlllllIIlIIIlIl.getUnformattedTextForChat());
                    "".length();
                }
            }
        }
        if (lIIlIIlIllllIlIl(this.field_152326_h.func_152559_b())) {
            this.buttonList.add(new GuiButton(GuiStreamUnavailable.llIlIIllIlIIll[0], this.width / GuiStreamUnavailable.llIlIIllIlIIll[2] - GuiStreamUnavailable.llIlIIllIlIIll[3], this.height - GuiStreamUnavailable.llIlIIllIlIIll[4], GuiStreamUnavailable.llIlIIllIlIIll[5], GuiStreamUnavailable.llIlIIllIlIIll[6], I18n.format(GuiStreamUnavailable.llIlIIllIIllll[GuiStreamUnavailable.llIlIIllIlIIll[2]], new Object[GuiStreamUnavailable.llIlIIllIlIIll[0]])));
            "".length();
            this.buttonList.add(new GuiButton(GuiStreamUnavailable.llIlIIllIlIIll[1], this.width / GuiStreamUnavailable.llIlIIllIlIIll[2] - GuiStreamUnavailable.llIlIIllIlIIll[3] + GuiStreamUnavailable.llIlIIllIlIIll[7], this.height - GuiStreamUnavailable.llIlIIllIlIIll[4], GuiStreamUnavailable.llIlIIllIlIIll[5], GuiStreamUnavailable.llIlIIllIlIIll[6], I18n.format(this.field_152326_h.func_152559_b().getFormattedText(), new Object[GuiStreamUnavailable.llIlIIllIlIIll[0]])));
            "".length();
            "".length();
            if (" ".length() <= ((0x3C ^ 0x1A) & ~(0xA8 ^ 0x8E))) {
                return;
            }
        }
        else {
            this.buttonList.add(new GuiButton(GuiStreamUnavailable.llIlIIllIlIIll[0], this.width / GuiStreamUnavailable.llIlIIllIlIIll[2] - GuiStreamUnavailable.llIlIIllIlIIll[8], this.height - GuiStreamUnavailable.llIlIIllIlIIll[4], GuiStreamUnavailable.llIlIIllIlIIll[5], GuiStreamUnavailable.llIlIIllIlIIll[6], I18n.format(GuiStreamUnavailable.llIlIIllIIllll[GuiStreamUnavailable.llIlIIllIlIIll[9]], new Object[GuiStreamUnavailable.llIlIIllIlIIll[0]])));
            "".length();
        }
    }
    
    public GuiStreamUnavailable(final GuiScreen llllllllllllIllIlIlllllIIlIlIlll, final Reason llllllllllllIllIlIlllllIIlIllIIl) {
        this(llllllllllllIllIlIlllllIIlIlIlll, llllllllllllIllIlIlllllIIlIllIIl, null);
    }
    
    private static String lIIlIIlIlllIIlll(String llllllllllllIllIlIllllIllIlIlIll, final String llllllllllllIllIlIllllIllIlIlIlI) {
        llllllllllllIllIlIllllIllIlIlIll = new String(Base64.getDecoder().decode(llllllllllllIllIlIllllIllIlIlIll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder llllllllllllIllIlIllllIllIllIIIl = new StringBuilder();
        final char[] llllllllllllIllIlIllllIllIlIllll = llllllllllllIllIlIllllIllIlIlIlI.toCharArray();
        int llllllllllllIllIlIllllIllIlIllIl = GuiStreamUnavailable.llIlIIllIlIIll[0];
        final int llllllllllllIllIlIllllIllIlIIlIl = (Object)llllllllllllIllIlIllllIllIlIlIll.toCharArray();
        final String llllllllllllIllIlIllllIllIlIIIll = (String)llllllllllllIllIlIllllIllIlIIlIl.length;
        String llllllllllllIllIlIllllIllIlIIIIl = (String)GuiStreamUnavailable.llIlIIllIlIIll[0];
        while (lIIlIIlIlllllIlI((int)llllllllllllIllIlIllllIllIlIIIIl, (int)llllllllllllIllIlIllllIllIlIIIll)) {
            final char llllllllllllIllIlIllllIllIllIlll = llllllllllllIllIlIllllIllIlIIlIl[llllllllllllIllIlIllllIllIlIIIIl];
            llllllllllllIllIlIllllIllIllIIIl.append((char)(llllllllllllIllIlIllllIllIllIlll ^ llllllllllllIllIlIllllIllIlIllll[llllllllllllIllIlIllllIllIlIllIl % llllllllllllIllIlIllllIllIlIllll.length]));
            "".length();
            ++llllllllllllIllIlIllllIllIlIllIl;
            ++llllllllllllIllIlIllllIllIlIIIIl;
            "".length();
            if (" ".length() < ((0x31 ^ 0x1E ^ (0x64 ^ 0x78)) & (0x7A ^ 0x1 ^ (0xFA ^ 0xB2) ^ -" ".length()))) {
                return null;
            }
        }
        return String.valueOf(llllllllllllIllIlIllllIllIllIIIl);
    }
    
    private static boolean lIIlIIlIllllIlIl(final Object llllllllllllIllIlIllllIllIIlIIIl) {
        return llllllllllllIllIlIllllIllIIlIIIl != null;
    }
    
    private void func_152320_a(final String llllllllllllIllIlIlllllIIIlIIIlI) {
        try {
            final Class<?> llllllllllllIllIlIlllllIIIlIIIIl = Class.forName(GuiStreamUnavailable.llIlIIllIIllll[GuiStreamUnavailable.llIlIIllIlIIll[16]]);
            final Object llllllllllllIllIlIlllllIIIlIIIII = llllllllllllIllIlIlllllIIIlIIIIl.getMethod(GuiStreamUnavailable.llIlIIllIIllll[GuiStreamUnavailable.llIlIIllIlIIll[17]], (Class<?>[])new Class[GuiStreamUnavailable.llIlIIllIlIIll[0]]).invoke(null, new Object[GuiStreamUnavailable.llIlIIllIlIIll[0]]);
            final Class<?> clazz = llllllllllllIllIlIlllllIIIlIIIIl;
            final String name = GuiStreamUnavailable.llIlIIllIIllll[GuiStreamUnavailable.llIlIIllIlIIll[18]];
            final Class[] parameterTypes = new Class[GuiStreamUnavailable.llIlIIllIlIIll[1]];
            parameterTypes[GuiStreamUnavailable.llIlIIllIlIIll[0]] = URI.class;
            final Method method = clazz.getMethod(name, (Class[])parameterTypes);
            final Object obj = llllllllllllIllIlIlllllIIIlIIIII;
            final Object[] args = new Object[GuiStreamUnavailable.llIlIIllIlIIll[1]];
            args[GuiStreamUnavailable.llIlIIllIlIIll[0]] = new URI(llllllllllllIllIlIlllllIIIlIIIlI);
            method.invoke(obj, args);
            "".length();
            "".length();
            if (-(0x14 ^ 0x10) > 0) {
                return;
            }
        }
        catch (Throwable llllllllllllIllIlIlllllIIIIlllll) {
            GuiStreamUnavailable.field_152322_a.error(GuiStreamUnavailable.llIlIIllIIllll[GuiStreamUnavailable.llIlIIllIlIIll[19]], llllllllllllIllIlIlllllIIIIlllll);
        }
    }
    
    @Override
    public void drawScreen(final int llllllllllllIllIlIlllllIIIllIIlI, final int llllllllllllIllIlIlllllIIIllIlll, final float llllllllllllIllIlIlllllIIIllIIII) {
        this.drawDefaultBackground();
        int llllllllllllIllIlIlllllIIIllIlIl = Math.max((int)(this.height * 0.85 / 2.0 - this.field_152323_r.size() * this.fontRendererObj.FONT_HEIGHT / 2.0f), GuiStreamUnavailable.llIlIIllIlIIll[4]);
        this.drawCenteredString(this.fontRendererObj, this.field_152324_f.getFormattedText(), this.width / GuiStreamUnavailable.llIlIIllIlIIll[2], llllllllllllIllIlIlllllIIIllIlIl - this.fontRendererObj.FONT_HEIGHT * GuiStreamUnavailable.llIlIIllIlIIll[2], GuiStreamUnavailable.llIlIIllIlIIll[10]);
        final boolean llllllllllllIllIlIlllllIIIlIllIl = (boolean)this.field_152323_r.iterator();
        "".length();
        if ("  ".length() == 0) {
            return;
        }
        while (!lIIlIIlIllllIllI(((Iterator)llllllllllllIllIlIlllllIIIlIllIl).hasNext() ? 1 : 0)) {
            final String llllllllllllIllIlIlllllIIIllIlII = ((Iterator<String>)llllllllllllIllIlIlllllIIIlIllIl).next();
            this.drawCenteredString(this.fontRendererObj, llllllllllllIllIlIlllllIIIllIlII, this.width / GuiStreamUnavailable.llIlIIllIlIIll[2], llllllllllllIllIlIlllllIIIllIlIl, GuiStreamUnavailable.llIlIIllIlIIll[11]);
            llllllllllllIllIlIlllllIIIllIlIl += this.fontRendererObj.FONT_HEIGHT;
        }
        super.drawScreen(llllllllllllIllIlIlllllIIIllIIlI, llllllllllllIllIlIlllllIIIllIlll, llllllllllllIllIlIlllllIIIllIIII);
    }
    
    private static boolean lIIlIIlIllllIlII(final int llllllllllllIllIlIllllIllIIIlIll) {
        return llllllllllllIllIlIllllIllIIIlIll != 0;
    }
    
    private static boolean lIIlIIlIllllIllI(final int llllllllllllIllIlIllllIllIIIlIIl) {
        return llllllllllllIllIlIllllIllIIIlIIl == 0;
    }
    
    private static String lIIlIIlIlllIIlIl(final String llllllllllllIllIlIllllIllllllIII, final String llllllllllllIllIlIllllIlllllIlll) {
        try {
            final SecretKeySpec llllllllllllIllIlIlllllIIIIIIIII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIllIlIllllIlllllIlll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher llllllllllllIllIlIllllIlllllllll = Cipher.getInstance("Blowfish");
            llllllllllllIllIlIllllIlllllllll.init(GuiStreamUnavailable.llIlIIllIlIIll[2], llllllllllllIllIlIlllllIIIIIIIII);
            return new String(llllllllllllIllIlIllllIlllllllll.doFinal(Base64.getDecoder().decode(llllllllllllIllIlIllllIllllllIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIllIlIllllIlllllllIl) {
            llllllllllllIllIlIllllIlllllllIl.printStackTrace();
            return null;
        }
    }
    
    @Override
    public void onGuiClosed() {
    }
    
    private static void lIIlIIlIlllIllll() {
        (llIlIIllIIllll = new String[GuiStreamUnavailable.llIlIIllIlIIll[28]])[GuiStreamUnavailable.llIlIIllIlIIll[0]] = lIIlIIlIlllIIlIl("+swonk3mncKf7gpgfmFnGHoTqt+lFMW4Pb7Nj/vlNc4=", "kxRLe");
        GuiStreamUnavailable.llIlIIllIIllll[GuiStreamUnavailable.llIlIIllIlIIll[1]] = lIIlIIlIlllIIllI("TyMswTeqMzU=", "nieCf");
        GuiStreamUnavailable.llIlIIllIIllll[GuiStreamUnavailable.llIlIIllIlIIll[2]] = lIIlIIlIlllIIllI("JUOFPyqhcpGzS58GGi7zSw==", "pEDCO");
        GuiStreamUnavailable.llIlIIllIIllll[GuiStreamUnavailable.llIlIIllIlIIll[9]] = lIIlIIlIlllIIllI("/XqCtNmmeiT3RnR7wbctwQ==", "NAWvj");
        GuiStreamUnavailable.llIlIIllIIllll[GuiStreamUnavailable.llIlIIllIlIIll[12]] = lIIlIIlIlllIIlIl("FMwy3p+khBQPN1ygNJTD0blQj6+h0qcVK+RYYSHQKFcaNCHUNq18XQ==", "PKwyd");
        GuiStreamUnavailable.llIlIIllIIllll[GuiStreamUnavailable.llIlIIllIlIIll[13]] = lIIlIIlIlllIIlIl("KdBMJx9vtfjtJ/l/KFF15pp65NV43YAnhGMrAYAx8F/pYaonqJuVZQ==", "neqWr");
        GuiStreamUnavailable.llIlIIllIIllll[GuiStreamUnavailable.llIlIIllIlIIll[14]] = lIIlIIlIlllIIlll("DQE3JXRKWjQiOUsUMyUiAFsgOiNKGjAtYQ==", "euCUN");
        GuiStreamUnavailable.llIlIIllIIllll[GuiStreamUnavailable.llIlIIllIlIIll[15]] = lIIlIIlIlllIIlll("AgYCCFNFXRQNDhlcGxcDCxwRVgoFH1kaGwUFBR1GJzE=", "jrvxi");
        GuiStreamUnavailable.llIlIIllIIllll[GuiStreamUnavailable.llIlIIllIlIIll[16]] = lIIlIIlIlllIIllI("vZntTsL6PD0PwEefLxc3gXG++CyT25Ld", "HRfXL");
        GuiStreamUnavailable.llIlIIllIIllll[GuiStreamUnavailable.llIlIIllIlIIll[17]] = lIIlIIlIlllIIlll("IxUaNQE3GxoeFA==", "Dpnqd");
        GuiStreamUnavailable.llIlIIllIIllll[GuiStreamUnavailable.llIlIIllIlIIll[18]] = lIIlIIlIlllIIllI("tPtRqpFtd78=", "AVDmW");
        GuiStreamUnavailable.llIlIIllIIllll[GuiStreamUnavailable.llIlIIllIlIIll[19]] = lIIlIIlIlllIIlIl("mcaAo2B5fXiPtlYRRPeiXb/E4tyHnoif", "hSVlJ");
        GuiStreamUnavailable.llIlIIllIIllll[GuiStreamUnavailable.llIlIIllIlIIll[20]] = lIIlIIlIlllIIllI("aJYKFu6Rdv6D9IFNuOr7PTaG3eid+HU37+ZvxWz1bVj8uYOWY73x5Q==", "JfgOQ");
        GuiStreamUnavailable.llIlIIllIIllll[GuiStreamUnavailable.llIlIIllIlIIll[22]] = lIIlIIlIlllIIllI("KKwsaXsmME1xlh6baSvVf06Ra8kOqofIwwLadyF0MBg=", "xMrAf");
        GuiStreamUnavailable.llIlIIllIIllll[GuiStreamUnavailable.llIlIIllIlIIll[23]] = lIIlIIlIlllIIlll("ARwKAzMfRg0IMwQJEQozEAQdSDwdNx4EPVwJCgQ=", "rhxfR");
        GuiStreamUnavailable.llIlIIllIIllll[GuiStreamUnavailable.llIlIIllIlIIll[24]] = lIIlIIlIlllIIllI("47zcWlx8Dgx6njQ6rM2oz6nPgErXiMmSPb0c9kgei9E=", "QzZvx");
        GuiStreamUnavailable.llIlIIllIIllll[GuiStreamUnavailable.llIlIIllIlIIll[25]] = lIIlIIlIlllIIlll("CQkgYRhqBCEnCGopAwJMfFxjJAU+SGAiACZIIShMK0gHB0x5WmMkBT5IPioNPg4hNAE=", "JhNFl");
        GuiStreamUnavailable.llIlIIllIIllll[GuiStreamUnavailable.llIlIIllIlIIll[26]] = lIIlIIlIlllIIlIl("cymisYONRudpio5ejGKKZzs88sE3qIXq", "dNZkM");
        GuiStreamUnavailable.llIlIIllIIllll[GuiStreamUnavailable.llIlIIllIlIIll[27]] = lIIlIIlIlllIIlIl("B0tENCCd77TJYfWSlPoM+RIogMxV9ndVVvQ06Mqn4rrCY84Ll1pYQNIvXvjFHDhA", "CELyg");
    }
    
    private static boolean lIIlIIlIllllIlll(final int llllllllllllIllIlIllllIllIIllIII, final int llllllllllllIllIlIllllIllIIlIlll) {
        return llllllllllllIllIlIllllIllIIllIII == llllllllllllIllIlIllllIllIIlIlll;
    }
    
    public static void func_152321_a(final GuiScreen llllllllllllIllIlIlllllIIIIlIIlI) {
        final Minecraft llllllllllllIllIlIlllllIIIIlIllI = Minecraft.getMinecraft();
        final IStream llllllllllllIllIlIlllllIIIIlIlIl = llllllllllllIllIlIlllllIIIIlIllI.getTwitchStream();
        if (lIIlIIlIllllIllI(OpenGlHelper.framebufferSupported ? 1 : 0)) {
            final ArrayList arrayList;
            final List<ChatComponentTranslation> llllllllllllIllIlIlllllIIIIlIlII = (List<ChatComponentTranslation>)(arrayList = Lists.newArrayList());
            final String lllllllllllllIlIIlIlllIIlIIIIIlI = GuiStreamUnavailable.llIlIIllIIllll[GuiStreamUnavailable.llIlIIllIlIIll[20]];
            final Object[] lllllllllllllIlIIlIlllIIlIIIIIIl = new Object[GuiStreamUnavailable.llIlIIllIlIIll[1]];
            lllllllllllllIlIIlIlllIIlIIIIIIl[GuiStreamUnavailable.llIlIIllIlIIll[0]] = GL11.glGetString(GuiStreamUnavailable.llIlIIllIlIIll[21]);
            arrayList.add(new ChatComponentTranslation(lllllllllllllIlIIlIlllIIlIIIIIlI, lllllllllllllIlIIlIlllIIlIIIIIIl));
            "".length();
            final List<ChatComponentTranslation> list = llllllllllllIllIlIlllllIIIIlIlII;
            final String lllllllllllllIlIIlIlllIIlIIIIIlI2 = GuiStreamUnavailable.llIlIIllIIllll[GuiStreamUnavailable.llIlIIllIlIIll[22]];
            final Object[] lllllllllllllIlIIlIlllIIlIIIIIIl2 = new Object[GuiStreamUnavailable.llIlIIllIlIIll[1]];
            lllllllllllllIlIIlIlllIIlIIIIIIl2[GuiStreamUnavailable.llIlIIllIlIIll[0]] = GLContext.getCapabilities().GL_EXT_blend_func_separate;
            list.add(new ChatComponentTranslation(lllllllllllllIlIIlIlllIIlIIIIIlI2, lllllllllllllIlIIlIlllIIlIIIIIIl2));
            "".length();
            final List<ChatComponentTranslation> list2 = llllllllllllIllIlIlllllIIIIlIlII;
            final String lllllllllllllIlIIlIlllIIlIIIIIlI3 = GuiStreamUnavailable.llIlIIllIIllll[GuiStreamUnavailable.llIlIIllIlIIll[23]];
            final Object[] lllllllllllllIlIIlIlllIIlIIIIIIl3 = new Object[GuiStreamUnavailable.llIlIIllIlIIll[1]];
            lllllllllllllIlIIlIlllIIlIIIIIIl3[GuiStreamUnavailable.llIlIIllIlIIll[0]] = GLContext.getCapabilities().GL_ARB_framebuffer_object;
            list2.add(new ChatComponentTranslation(lllllllllllllIlIIlIlllIIlIIIIIlI3, lllllllllllllIlIIlIlllIIlIIIIIIl3));
            "".length();
            final List<ChatComponentTranslation> list3 = llllllllllllIllIlIlllllIIIIlIlII;
            final String lllllllllllllIlIIlIlllIIlIIIIIlI4 = GuiStreamUnavailable.llIlIIllIIllll[GuiStreamUnavailable.llIlIIllIlIIll[24]];
            final Object[] lllllllllllllIlIIlIlllIIlIIIIIIl4 = new Object[GuiStreamUnavailable.llIlIIllIlIIll[1]];
            lllllllllllllIlIIlIlllIIlIIIIIIl4[GuiStreamUnavailable.llIlIIllIlIIll[0]] = GLContext.getCapabilities().GL_EXT_framebuffer_object;
            list3.add(new ChatComponentTranslation(lllllllllllllIlIIlIlllIIlIIIIIlI4, lllllllllllllIlIIlIlllIIlIIIIIIl4));
            "".length();
            llllllllllllIllIlIlllllIIIIlIllI.displayGuiScreen(new GuiStreamUnavailable(llllllllllllIllIlIlllllIIIIlIIlI, Reason.NO_FBO, llllllllllllIllIlIlllllIIIIlIlII));
            "".length();
            if ("   ".length() <= -" ".length()) {
                return;
            }
        }
        else if (lIIlIIlIllllIlII((llllllllllllIllIlIlllllIIIIlIlIl instanceof NullStream) ? 1 : 0)) {
            if (lIIlIIlIllllIlII(((NullStream)llllllllllllIllIlIlllllIIIIlIlIl).func_152937_a().getMessage().contains(GuiStreamUnavailable.llIlIIllIIllll[GuiStreamUnavailable.llIlIIllIlIIll[25]]) ? 1 : 0)) {
                llllllllllllIllIlIlllllIIIIlIllI.displayGuiScreen(new GuiStreamUnavailable(llllllllllllIllIlIlllllIIIIlIIlI, Reason.LIBRARY_ARCH_MISMATCH));
                "".length();
                if ((0xA3 ^ 0xA6) == 0x0) {
                    return;
                }
            }
            else {
                llllllllllllIllIlIlllllIIIIlIllI.displayGuiScreen(new GuiStreamUnavailable(llllllllllllIllIlIlllllIIIIlIIlI, Reason.LIBRARY_FAILURE));
                "".length();
                if (" ".length() == 0) {
                    return;
                }
            }
        }
        else if (lIIlIIlIllllIllI(llllllllllllIllIlIlllllIIIIlIlIl.func_152928_D() ? 1 : 0) && lIIlIIlIlllllIII(llllllllllllIllIlIlllllIIIIlIlIl.func_152912_E(), ErrorCode.TTV_EC_OS_TOO_OLD)) {
            switch ($SWITCH_TABLE$net$minecraft$util$Util$EnumOS()[Util.getOSType().ordinal()]) {
                case 3: {
                    llllllllllllIllIlIlllllIIIIlIllI.displayGuiScreen(new GuiStreamUnavailable(llllllllllllIllIlIlllllIIIIlIIlI, Reason.UNSUPPORTED_OS_WINDOWS));
                    "".length();
                    if ("  ".length() == 0) {
                        return;
                    }
                    break;
                }
                case 4: {
                    llllllllllllIllIlIlllllIIIIlIllI.displayGuiScreen(new GuiStreamUnavailable(llllllllllllIllIlIlllllIIIIlIIlI, Reason.UNSUPPORTED_OS_MAC));
                    "".length();
                    if (-" ".length() >= 0) {
                        return;
                    }
                    break;
                }
                default: {
                    llllllllllllIllIlIlllllIIIIlIllI.displayGuiScreen(new GuiStreamUnavailable(llllllllllllIllIlIlllllIIIIlIIlI, Reason.UNSUPPORTED_OS_OTHER));
                    "".length();
                    if ((88 + 160 - 159 + 89 ^ 155 + 105 - 79 + 1) <= " ".length()) {
                        return;
                    }
                    break;
                }
            }
        }
        else if (lIIlIIlIllllIllI(llllllllllllIllIlIlllllIIIIlIllI.getTwitchDetails().containsKey((Object)GuiStreamUnavailable.llIlIIllIIllll[GuiStreamUnavailable.llIlIIllIlIIll[26]]) ? 1 : 0)) {
            if (lIIlIIlIlllllIII(llllllllllllIllIlIlllllIIIIlIllI.getSession().getSessionType(), Session.Type.LEGACY)) {
                llllllllllllIllIlIlllllIIIIlIllI.displayGuiScreen(new GuiStreamUnavailable(llllllllllllIllIlIlllllIIIIlIIlI, Reason.ACCOUNT_NOT_MIGRATED));
                "".length();
                if (-" ".length() >= (0x78 ^ 0x55 ^ (0x47 ^ 0x6E))) {
                    return;
                }
            }
            else {
                llllllllllllIllIlIlllllIIIIlIllI.displayGuiScreen(new GuiStreamUnavailable(llllllllllllIllIlIlllllIIIIlIIlI, Reason.ACCOUNT_NOT_BOUND));
                "".length();
                if (" ".length() != " ".length()) {
                    return;
                }
            }
        }
        else if (lIIlIIlIllllIllI(llllllllllllIllIlIlllllIIIIlIlIl.func_152913_F() ? 1 : 0)) {
            switch ($SWITCH_TABLE$net$minecraft$client$stream$IStream$AuthFailureReason()[llllllllllllIllIlIlllllIIIIlIlIl.func_152918_H().ordinal()]) {
                case 2: {
                    llllllllllllIllIlIlllllIIIIlIllI.displayGuiScreen(new GuiStreamUnavailable(llllllllllllIllIlIlllllIIIIlIIlI, Reason.FAILED_TWITCH_AUTH));
                    "".length();
                    if (-" ".length() > "  ".length()) {
                        return;
                    }
                    break;
                }
                default: {
                    llllllllllllIllIlIlllllIIIIlIllI.displayGuiScreen(new GuiStreamUnavailable(llllllllllllIllIlIlllllIIIIlIIlI, Reason.FAILED_TWITCH_AUTH_ERROR));
                    "".length();
                    if ((169 + 50 - 184 + 152 ^ 188 + 180 - 224 + 47) < (0x21 ^ 0x73 ^ (0x24 ^ 0x72))) {
                        return;
                    }
                    break;
                }
            }
        }
        else if (lIIlIIlIllllIlIl(llllllllllllIllIlIlllllIIIIlIlIl.func_152912_E())) {
            final ChatComponentTranslation[] a = new ChatComponentTranslation[GuiStreamUnavailable.llIlIIllIlIIll[1]];
            final int n = GuiStreamUnavailable.llIlIIllIlIIll[0];
            final String lllllllllllllIlIIlIlllIIlIIIIIlI5 = GuiStreamUnavailable.llIlIIllIIllll[GuiStreamUnavailable.llIlIIllIlIIll[27]];
            final Object[] lllllllllllllIlIIlIlllIIlIIIIIIl5 = new Object[GuiStreamUnavailable.llIlIIllIlIIll[1]];
            lllllllllllllIlIIlIlllIIlIIIIIIl5[GuiStreamUnavailable.llIlIIllIlIIll[0]] = ErrorCode.getString(llllllllllllIllIlIlllllIIIIlIlIl.func_152912_E());
            a[n] = new ChatComponentTranslation(lllllllllllllIlIIlIlllIIlIIIIIlI5, lllllllllllllIlIIlIlllIIlIIIIIIl5);
            final List<ChatComponentTranslation> llllllllllllIllIlIlllllIIIIlIIll = Arrays.asList(a);
            llllllllllllIllIlIlllllIIIIlIllI.displayGuiScreen(new GuiStreamUnavailable(llllllllllllIllIlIlllllIIIIlIIlI, Reason.INITIALIZATION_FAILURE, llllllllllllIllIlIlllllIIIIlIIll));
            "".length();
            if ("  ".length() >= "   ".length()) {
                return;
            }
        }
        else {
            llllllllllllIllIlIlllllIIIIlIllI.displayGuiScreen(new GuiStreamUnavailable(llllllllllllIllIlIlllllIIIIlIIlI, Reason.UNKNOWN));
        }
    }
    
    private static boolean lIIlIIlIlllllIlI(final int llllllllllllIllIlIllllIllIIlIlII, final int llllllllllllIllIlIllllIllIIlIIll) {
        return llllllllllllIllIlIllllIllIIlIlII < llllllllllllIllIlIllllIllIIlIIll;
    }
    
    private static boolean lIIlIIlIlllllIII(final Object llllllllllllIllIlIllllIllIIIlllI, final Object llllllllllllIllIlIllllIllIIIllIl) {
        return llllllllllllIllIlIllllIllIIIlllI == llllllllllllIllIlIllllIllIIIllIl;
    }
    
    private static void lIIlIIlIllllIIll() {
        (llIlIIllIlIIll = new int[29])[0] = ((0x54 ^ 0x62 ^ (0xB6 ^ 0x85)) & (0x6F ^ 0x5 ^ (0x20 ^ 0x4F) ^ -" ".length()));
        GuiStreamUnavailable.llIlIIllIlIIll[1] = " ".length();
        GuiStreamUnavailable.llIlIIllIlIIll[2] = "  ".length();
        GuiStreamUnavailable.llIlIIllIlIIll[3] = 9 + 1 + 108 + 37;
        GuiStreamUnavailable.llIlIIllIlIIll[4] = (0x7E ^ 0x4C);
        GuiStreamUnavailable.llIlIIllIlIIll[5] = 105 + 63 - 104 + 86;
        GuiStreamUnavailable.llIlIIllIlIIll[6] = (0x1A ^ 0xE);
        GuiStreamUnavailable.llIlIIllIlIIll[7] = 8 + 92 - 8 + 68;
        GuiStreamUnavailable.llIlIIllIlIIll[8] = (0xC0 ^ 0xA4 ^ (0x6F ^ 0x40));
        GuiStreamUnavailable.llIlIIllIlIIll[9] = "   ".length();
        GuiStreamUnavailable.llIlIIllIlIIll[10] = (-1 & 0xFFFFFF);
        GuiStreamUnavailable.llIlIIllIlIIll[11] = (0xFFFFEFA9 & 0xA0B0F6);
        GuiStreamUnavailable.llIlIIllIlIIll[12] = (0x2E ^ 0x2A);
        GuiStreamUnavailable.llIlIIllIlIIll[13] = (0xA6 ^ 0x9E ^ (0x5 ^ 0x38));
        GuiStreamUnavailable.llIlIIllIlIIll[14] = (0x7F ^ 0x46 ^ (0xA0 ^ 0x9F));
        GuiStreamUnavailable.llIlIIllIlIIll[15] = (0x1E ^ 0x45 ^ (0x4E ^ 0x12));
        GuiStreamUnavailable.llIlIIllIlIIll[16] = (0x4C ^ 0x7C ^ (0xBF ^ 0x87));
        GuiStreamUnavailable.llIlIIllIlIIll[17] = (0x25 ^ 0x2C);
        GuiStreamUnavailable.llIlIIllIlIIll[18] = (0x3E ^ 0x34);
        GuiStreamUnavailable.llIlIIllIlIIll[19] = (0x2F ^ 0x64 ^ (0xD ^ 0x4D));
        GuiStreamUnavailable.llIlIIllIlIIll[20] = (0x30 ^ 0x3C);
        GuiStreamUnavailable.llIlIIllIlIIll[21] = (-(0xFFFFF8FF & 0x6775) & (-1 & 0x7F76));
        GuiStreamUnavailable.llIlIIllIlIIll[22] = (0x75 ^ 0x23 ^ (0xF8 ^ 0xA3));
        GuiStreamUnavailable.llIlIIllIlIIll[23] = (0x4E ^ 0x40);
        GuiStreamUnavailable.llIlIIllIlIIll[24] = (0x8C ^ 0x83);
        GuiStreamUnavailable.llIlIIllIlIIll[25] = (0x76 ^ 0x58 ^ (0x8F ^ 0xB1));
        GuiStreamUnavailable.llIlIIllIlIIll[26] = (153 + 179 - 291 + 148 ^ 24 + 101 - 64 + 111);
        GuiStreamUnavailable.llIlIIllIlIIll[27] = (0x70 ^ 0x62);
        GuiStreamUnavailable.llIlIIllIlIIll[28] = (0xD2 ^ 0xC1);
    }
    
    static /* synthetic */ int[] $SWITCH_TABLE$net$minecraft$util$Util$EnumOS() {
        final int[] $switch_TABLE$net$minecraft$util$Util$EnumOS = GuiStreamUnavailable.$SWITCH_TABLE$net$minecraft$util$Util$EnumOS;
        if (lIIlIIlIllllIlIl($switch_TABLE$net$minecraft$util$Util$EnumOS)) {
            return $switch_TABLE$net$minecraft$util$Util$EnumOS;
        }
        "".length();
        final byte llllllllllllIllIlIlllllIIIIIlIll = (Object)new int[Util.EnumOS.values().length];
        try {
            llllllllllllIllIlIlllllIIIIIlIll[Util.EnumOS.LINUX.ordinal()] = GuiStreamUnavailable.llIlIIllIlIIll[1];
            "".length();
            if ("  ".length() < ((0xE5 ^ 0xA6 ^ (0x9 ^ 0x79)) & (0x77 ^ 0x1 ^ (0x3B ^ 0x7E) ^ -" ".length()))) {
                return null;
            }
        }
        catch (NoSuchFieldError noSuchFieldError) {
            "".length();
        }
        try {
            llllllllllllIllIlIlllllIIIIIlIll[Util.EnumOS.OSX.ordinal()] = GuiStreamUnavailable.llIlIIllIlIIll[12];
            "".length();
            if ("   ".length() == ((0x2C ^ 0x6D) & ~(0x38 ^ 0x79))) {
                return null;
            }
        }
        catch (NoSuchFieldError noSuchFieldError2) {
            "".length();
        }
        try {
            llllllllllllIllIlIlllllIIIIIlIll[Util.EnumOS.SOLARIS.ordinal()] = GuiStreamUnavailable.llIlIIllIlIIll[2];
            "".length();
            if ("  ".length() == ((0x95 ^ 0x98) & ~(0x54 ^ 0x59))) {
                return null;
            }
        }
        catch (NoSuchFieldError noSuchFieldError3) {
            "".length();
        }
        try {
            llllllllllllIllIlIlllllIIIIIlIll[Util.EnumOS.UNKNOWN.ordinal()] = GuiStreamUnavailable.llIlIIllIlIIll[13];
            "".length();
            if ("  ".length() <= 0) {
                return null;
            }
        }
        catch (NoSuchFieldError noSuchFieldError4) {
            "".length();
        }
        try {
            llllllllllllIllIlIlllllIIIIIlIll[Util.EnumOS.WINDOWS.ordinal()] = GuiStreamUnavailable.llIlIIllIlIIll[9];
            "".length();
            if (-"   ".length() > 0) {
                return null;
            }
        }
        catch (NoSuchFieldError noSuchFieldError5) {
            "".length();
        }
        return GuiStreamUnavailable.$SWITCH_TABLE$net$minecraft$util$Util$EnumOS = (int[])(Object)llllllllllllIllIlIlllllIIIIIlIll;
    }
    
    static /* synthetic */ int[] $SWITCH_TABLE$net$minecraft$client$stream$IStream$AuthFailureReason() {
        final int[] $switch_TABLE$net$minecraft$client$stream$IStream$AuthFailureReason = GuiStreamUnavailable.$SWITCH_TABLE$net$minecraft$client$stream$IStream$AuthFailureReason;
        if (lIIlIIlIllllIlIl($switch_TABLE$net$minecraft$client$stream$IStream$AuthFailureReason)) {
            return $switch_TABLE$net$minecraft$client$stream$IStream$AuthFailureReason;
        }
        "".length();
        final float llllllllllllIllIlIlllllIIIIIIllI = (Object)new int[IStream.AuthFailureReason.values().length];
        try {
            llllllllllllIllIlIlllllIIIIIIllI[IStream.AuthFailureReason.ERROR.ordinal()] = GuiStreamUnavailable.llIlIIllIlIIll[1];
            "".length();
            if ((0x22 ^ 0xA ^ (0x37 ^ 0x1B)) == 0x0) {
                return null;
            }
        }
        catch (NoSuchFieldError noSuchFieldError) {
            "".length();
        }
        try {
            llllllllllllIllIlIlllllIIIIIIllI[IStream.AuthFailureReason.INVALID_TOKEN.ordinal()] = GuiStreamUnavailable.llIlIIllIlIIll[2];
            "".length();
            if ("  ".length() <= " ".length()) {
                return null;
            }
        }
        catch (NoSuchFieldError noSuchFieldError2) {
            "".length();
        }
        return GuiStreamUnavailable.$SWITCH_TABLE$net$minecraft$client$stream$IStream$AuthFailureReason = (int[])(Object)llllllllllllIllIlIlllllIIIIIIllI;
    }
    
    static /* synthetic */ int[] $SWITCH_TABLE$net$minecraft$client$gui$stream$GuiStreamUnavailable$Reason() {
        final int[] $switch_TABLE$net$minecraft$client$gui$stream$GuiStreamUnavailable$Reason = GuiStreamUnavailable.$SWITCH_TABLE$net$minecraft$client$gui$stream$GuiStreamUnavailable$Reason;
        if (lIIlIIlIllllIlIl($switch_TABLE$net$minecraft$client$gui$stream$GuiStreamUnavailable$Reason)) {
            return $switch_TABLE$net$minecraft$client$gui$stream$GuiStreamUnavailable$Reason;
        }
        "".length();
        final boolean llllllllllllIllIlIlllllIIIIIllIl = (Object)new int[Reason.values().length];
        try {
            llllllllllllIllIlIlllllIIIIIllIl[Reason.ACCOUNT_NOT_BOUND.ordinal()] = GuiStreamUnavailable.llIlIIllIlIIll[16];
            "".length();
            if (null != null) {
                return null;
            }
        }
        catch (NoSuchFieldError noSuchFieldError) {
            "".length();
        }
        try {
            llllllllllllIllIlIlllllIIIIIllIl[Reason.ACCOUNT_NOT_MIGRATED.ordinal()] = GuiStreamUnavailable.llIlIIllIlIIll[15];
            "".length();
            if ("   ".length() == " ".length()) {
                return null;
            }
        }
        catch (NoSuchFieldError noSuchFieldError2) {
            "".length();
        }
        try {
            llllllllllllIllIlIlllllIIIIIllIl[Reason.FAILED_TWITCH_AUTH.ordinal()] = GuiStreamUnavailable.llIlIIllIlIIll[17];
            "".length();
            if (((0xBB ^ 0x83) & ~(0x44 ^ 0x7C)) != 0x0) {
                return null;
            }
        }
        catch (NoSuchFieldError noSuchFieldError3) {
            "".length();
        }
        try {
            llllllllllllIllIlIlllllIIIIIllIl[Reason.FAILED_TWITCH_AUTH_ERROR.ordinal()] = GuiStreamUnavailable.llIlIIllIlIIll[18];
            "".length();
            if (-"   ".length() >= 0) {
                return null;
            }
        }
        catch (NoSuchFieldError noSuchFieldError4) {
            "".length();
        }
        try {
            llllllllllllIllIlIlllllIIIIIllIl[Reason.INITIALIZATION_FAILURE.ordinal()] = GuiStreamUnavailable.llIlIIllIlIIll[19];
            "".length();
            if (null != null) {
                return null;
            }
        }
        catch (NoSuchFieldError noSuchFieldError5) {
            "".length();
        }
        try {
            llllllllllllIllIlIlllllIIIIIllIl[Reason.LIBRARY_ARCH_MISMATCH.ordinal()] = GuiStreamUnavailable.llIlIIllIlIIll[2];
            "".length();
            if (null != null) {
                return null;
            }
        }
        catch (NoSuchFieldError noSuchFieldError6) {
            "".length();
        }
        try {
            llllllllllllIllIlIlllllIIIIIllIl[Reason.LIBRARY_FAILURE.ordinal()] = GuiStreamUnavailable.llIlIIllIlIIll[9];
            "".length();
            if (" ".length() <= 0) {
                return null;
            }
        }
        catch (NoSuchFieldError noSuchFieldError7) {
            "".length();
        }
        try {
            llllllllllllIllIlIlllllIIIIIllIl[Reason.NO_FBO.ordinal()] = GuiStreamUnavailable.llIlIIllIlIIll[1];
            "".length();
            if (null != null) {
                return null;
            }
        }
        catch (NoSuchFieldError noSuchFieldError8) {
            "".length();
        }
        try {
            llllllllllllIllIlIlllllIIIIIllIl[Reason.UNKNOWN.ordinal()] = GuiStreamUnavailable.llIlIIllIlIIll[20];
            "".length();
            if (-" ".length() >= "  ".length()) {
                return null;
            }
        }
        catch (NoSuchFieldError noSuchFieldError9) {
            "".length();
        }
        try {
            llllllllllllIllIlIlllllIIIIIllIl[Reason.UNSUPPORTED_OS_MAC.ordinal()] = GuiStreamUnavailable.llIlIIllIlIIll[13];
            "".length();
            if (" ".length() <= 0) {
                return null;
            }
        }
        catch (NoSuchFieldError noSuchFieldError10) {
            "".length();
        }
        try {
            llllllllllllIllIlIlllllIIIIIllIl[Reason.UNSUPPORTED_OS_OTHER.ordinal()] = GuiStreamUnavailable.llIlIIllIlIIll[14];
            "".length();
            if ("  ".length() < ((0x45 ^ 0x4C) & ~(0x37 ^ 0x3E))) {
                return null;
            }
        }
        catch (NoSuchFieldError noSuchFieldError11) {
            "".length();
        }
        try {
            llllllllllllIllIlIlllllIIIIIllIl[Reason.UNSUPPORTED_OS_WINDOWS.ordinal()] = GuiStreamUnavailable.llIlIIllIlIIll[12];
            "".length();
            if ("  ".length() == ((181 + 113 - 112 + 19 ^ 5 + 57 + 39 + 57) & (0x45 ^ 0x2F ^ (0x1A ^ 0x27) ^ -" ".length()))) {
                return null;
            }
        }
        catch (NoSuchFieldError noSuchFieldError12) {
            "".length();
        }
        return GuiStreamUnavailable.$SWITCH_TABLE$net$minecraft$client$gui$stream$GuiStreamUnavailable$Reason = (int[])(Object)llllllllllllIllIlIlllllIIIIIllIl;
    }
    
    @Override
    protected void actionPerformed(final GuiButton llllllllllllIllIlIlllllIIIlIIlll) throws IOException {
        if (lIIlIIlIllllIlII(llllllllllllIllIlIlllllIIIlIIlll.enabled ? 1 : 0)) {
            if (lIIlIIlIllllIlll(llllllllllllIllIlIlllllIIIlIIlll.id, GuiStreamUnavailable.llIlIIllIlIIll[1])) {
                switch ($SWITCH_TABLE$net$minecraft$client$gui$stream$GuiStreamUnavailable$Reason()[this.field_152326_h.ordinal()]) {
                    case 8:
                    case 9: {
                        this.func_152320_a(GuiStreamUnavailable.llIlIIllIIllll[GuiStreamUnavailable.llIlIIllIlIIll[12]]);
                        "".length();
                        if ((0x2B ^ 0x2F) != (0xBD ^ 0xB9)) {
                            return;
                        }
                        break;
                    }
                    case 7: {
                        this.func_152320_a(GuiStreamUnavailable.llIlIIllIIllll[GuiStreamUnavailable.llIlIIllIlIIll[13]]);
                        "".length();
                        if (null != null) {
                            return;
                        }
                        break;
                    }
                    case 5: {
                        this.func_152320_a(GuiStreamUnavailable.llIlIIllIIllll[GuiStreamUnavailable.llIlIIllIlIIll[14]]);
                        "".length();
                        if (((0x1E ^ 0x10 ^ (0xD ^ 0x22)) & (0xF9 ^ 0xB1 ^ (0x47 ^ 0x2E) ^ -" ".length())) != 0x0) {
                            return;
                        }
                        break;
                    }
                    case 3:
                    case 11:
                    case 12: {
                        this.func_152320_a(GuiStreamUnavailable.llIlIIllIIllll[GuiStreamUnavailable.llIlIIllIlIIll[15]]);
                        break;
                    }
                }
            }
            this.mc.displayGuiScreen(this.parentScreen);
        }
    }
    
    private static String lIIlIIlIlllIIllI(final String llllllllllllIllIlIllllIlllIllllI, final String llllllllllllIllIlIllllIlllIlllII) {
        try {
            final SecretKeySpec llllllllllllIllIlIllllIllllIIlII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIllIlIllllIlllIlllII.getBytes(StandardCharsets.UTF_8)), GuiStreamUnavailable.llIlIIllIlIIll[16]), "DES");
            final Cipher llllllllllllIllIlIllllIllllIIIlI = Cipher.getInstance("DES");
            llllllllllllIllIlIllllIllllIIIlI.init(GuiStreamUnavailable.llIlIIllIlIIll[2], llllllllllllIllIlIllllIllllIIlII);
            return new String(llllllllllllIllIlIllllIllllIIIlI.doFinal(Base64.getDecoder().decode(llllllllllllIllIlIllllIlllIllllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIllIlIllllIllllIIIII) {
            llllllllllllIllIlIllllIllllIIIII.printStackTrace();
            return null;
        }
    }
    
    public enum Reason
    {
        ACCOUNT_NOT_MIGRATED(Reason.llllllIllIIII[Reason.llllllIllIIIl[14]], Reason.llllllIllIIIl[6], (IChatComponent)new ChatComponentTranslation(Reason.llllllIllIIII[Reason.llllllIllIIIl[15]], new Object[Reason.llllllIllIIIl[0]]), (IChatComponent)new ChatComponentTranslation(Reason.llllllIllIIII[Reason.llllllIllIIIl[16]], new Object[Reason.llllllIllIIIl[0]])), 
        UNSUPPORTED_OS_MAC(Reason.llllllIllIIII[Reason.llllllIllIIIl[9]], Reason.llllllIllIIIl[4], (IChatComponent)new ChatComponentTranslation(Reason.llllllIllIIII[Reason.llllllIllIIIl[10]], new Object[Reason.llllllIllIIIl[0]]), (IChatComponent)new ChatComponentTranslation(Reason.llllllIllIIII[Reason.llllllIllIIIl[11]], new Object[Reason.llllllIllIIIl[0]])), 
        NO_FBO(Reason.llllllIllIIII[Reason.llllllIllIIIl[0]], Reason.llllllIllIIIl[0], (IChatComponent)new ChatComponentTranslation(Reason.llllllIllIIII[Reason.llllllIllIIIl[1]], new Object[Reason.llllllIllIIIl[0]]));
        
        private final /* synthetic */ IChatComponent field_152575_n;
        private static final /* synthetic */ int[] llllllIllIIIl;
        
        INITIALIZATION_FAILURE(Reason.llllllIllIIII[Reason.llllllIllIIIl[25]], Reason.llllllIllIIIl[10], (IChatComponent)new ChatComponentTranslation(Reason.llllllIllIIII[Reason.llllllIllIIIl[26]], new Object[Reason.llllllIllIIIl[0]]), (IChatComponent)new ChatComponentTranslation(Reason.llllllIllIIII[Reason.llllllIllIIIl[27]], new Object[Reason.llllllIllIIIl[0]]));
        
        private static final /* synthetic */ String[] llllllIllIIII;
        
        ACCOUNT_NOT_BOUND(Reason.llllllIllIIII[Reason.llllllIllIIIl[17]], Reason.llllllIllIIIl[7], (IChatComponent)new ChatComponentTranslation(Reason.llllllIllIIII[Reason.llllllIllIIIl[18]], new Object[Reason.llllllIllIIIl[0]]), (IChatComponent)new ChatComponentTranslation(Reason.llllllIllIIII[Reason.llllllIllIIIl[19]], new Object[Reason.llllllIllIIIl[0]])), 
        LIBRARY_ARCH_MISMATCH(Reason.llllllIllIIII[Reason.llllllIllIIIl[2]], Reason.llllllIllIIIl[1], (IChatComponent)new ChatComponentTranslation(Reason.llllllIllIIII[Reason.llllllIllIIIl[3]], new Object[Reason.llllllIllIIIl[0]])), 
        UNSUPPORTED_OS_WINDOWS(Reason.llllllIllIIII[Reason.llllllIllIIIl[7]], Reason.llllllIllIIIl[3], (IChatComponent)new ChatComponentTranslation(Reason.llllllIllIIII[Reason.llllllIllIIIl[8]], new Object[Reason.llllllIllIIIl[0]])), 
        UNSUPPORTED_OS_OTHER(Reason.llllllIllIIII[Reason.llllllIllIIIl[12]], Reason.llllllIllIIIl[5], (IChatComponent)new ChatComponentTranslation(Reason.llllllIllIIII[Reason.llllllIllIIIl[13]], new Object[Reason.llllllIllIIIl[0]])), 
        FAILED_TWITCH_AUTH(Reason.llllllIllIIII[Reason.llllllIllIIIl[20]], Reason.llllllIllIIIl[8], (IChatComponent)new ChatComponentTranslation(Reason.llllllIllIIII[Reason.llllllIllIIIl[21]], new Object[Reason.llllllIllIIIl[0]]), (IChatComponent)new ChatComponentTranslation(Reason.llllllIllIIII[Reason.llllllIllIIIl[22]], new Object[Reason.llllllIllIIIl[0]])), 
        FAILED_TWITCH_AUTH_ERROR(Reason.llllllIllIIII[Reason.llllllIllIIIl[23]], Reason.llllllIllIIIl[9], (IChatComponent)new ChatComponentTranslation(Reason.llllllIllIIII[Reason.llllllIllIIIl[24]], new Object[Reason.llllllIllIIIl[0]])), 
        LIBRARY_FAILURE(Reason.llllllIllIIII[Reason.llllllIllIIIl[4]], Reason.llllllIllIIIl[2], (IChatComponent)new ChatComponentTranslation(Reason.llllllIllIIII[Reason.llllllIllIIIl[5]], new Object[Reason.llllllIllIIIl[0]]), (IChatComponent)new ChatComponentTranslation(Reason.llllllIllIIII[Reason.llllllIllIIIl[6]], new Object[Reason.llllllIllIIIl[0]])), 
        UNKNOWN(Reason.llllllIllIIII[Reason.llllllIllIIIl[28]], Reason.llllllIllIIIl[11], (IChatComponent)new ChatComponentTranslation(Reason.llllllIllIIII[Reason.llllllIllIIIl[29]], new Object[Reason.llllllIllIIIl[0]]), (IChatComponent)new ChatComponentTranslation(Reason.llllllIllIIII[Reason.llllllIllIIIl[30]], new Object[Reason.llllllIllIIIl[0]]));
        
        private final /* synthetic */ IChatComponent field_152574_m;
        
        private static void lIllIIIIIlIlIIl() {
            (llllllIllIIII = new String[Reason.llllllIllIIIl[31]])[Reason.llllllIllIIIl[0]] = lIllIIIIIlIIllI("Cc8hVGEFiBE=", "GSfeE");
            Reason.llllllIllIIII[Reason.llllllIllIIIl[1]] = lIllIIIIIlIIlll("GBwlFTEGRiIeMR0JPhwxCQQyXj4ENzESPw==", "khWpP");
            Reason.llllllIllIIII[Reason.llllllIllIIIl[2]] = lIllIIIIIlIlIII("NIR8/goIB4QVAUtLjEqezRPYWlImbTS6", "OjEEn");
            Reason.llllllIllIIII[Reason.llllllIllIIIl[3]] = lIllIIIIIlIIlll("PQcHDicjXQAFJzgSHAcnLB8QRSonEQcKNDcsFBklJiwYAjUjEgEILg==", "NsukF");
            Reason.llllllIllIIII[Reason.llllllIllIIIl[4]] = lIllIIIIIlIIlll("KBk6JRA2CScxEC0cLSUU", "dPxwQ");
            Reason.llllllIllIIII[Reason.llllllIllIIIl[5]] = lIllIIIIIlIIllI("Rnr3NuRHXicukHz3WTjcZqu6QwIdop7QZarU7Yc/EmQnSOwEziSVVg==", "qQcPT");
            Reason.llllllIllIIII[Reason.llllllIllIIIl[6]] = lIllIIIIIlIIllI("wyiWVZ0aP7uDfIVKbipZSWpbniaoL5pfGgirQxuGk9t0ZrB+y886/g==", "mXZDb");
            Reason.llllllIllIIII[Reason.llllllIllIIIl[7]] = lIllIIIIIlIIllI("tJJV7eY/aw+7GtTDiwddKj+5PXSqe0x5", "mHAes");
            Reason.llllllIllIIII[Reason.llllllIllIIIl[8]] = lIllIIIIIlIIlll("BjwKBxgYZg0MGAMpEQ4YFyQdTBcaPCcRDAU4FxANECxWFRAbLBcVCg==", "uHxby");
            Reason.llllllIllIIII[Reason.llllllIllIIIl[9]] = lIllIIIIIlIIllI("BAV1tgTPCiFBSTz8kTOdVyoyUF2L65jH", "ZJlBd");
            Reason.llllllIllIIII[Reason.llllllIllIIIl[10]] = lIllIIIIIlIIlll("PwAdMQAhWho6ADoVBjgALhgKeg8jADAnFDwEACYVKRBBOQAv", "LtoTa");
            Reason.llllllIllIIII[Reason.llllllIllIIIl[11]] = lIllIIIIIlIIlll("CQ4gFwsXVCccCwwbOx4LGBY3XAQVDg0BHwoKPQAeHx58HwsZVD0ZCwM=", "zzRrj");
            Reason.llllllIllIIII[Reason.llllllIllIIIl[12]] = lIllIIIIIlIlIII("791wc0pUHfGutsPveaJuxLbLzpjoKhD8", "woqhI");
            Reason.llllllIllIIII[Reason.llllllIllIIIl[13]] = lIllIIIIIlIlIII("sP0vtAqAo7uYc+133Yh4mNa1+DdE+DE3c6aAQGh2E0pZ8rufWPK2ag==", "TIqUm");
            Reason.llllllIllIIII[Reason.llllllIllIIIl[14]] = lIllIIIIIlIlIII("Uy45x8SYkhVRBuMlgHlw2Med5PyPF5Le", "dxpwH");
            Reason.llllllIllIIII[Reason.llllllIllIIIl[15]] = lIllIIIIIlIIllI("uhzr3tuscdhxkcKFfE/++TWOuL+QOF+v9v6kuVZoIBoHwIxn1AmHOA==", "xpRaA");
            Reason.llllllIllIIII[Reason.llllllIllIIIl[16]] = lIllIIIIIlIIllI("hA1JKjC7XkAVaP394SnPwyJ4j/E29L/129/ZnTuwUTcHDhj7OFDeHRz320IJ5iGo", "NvmFX");
            Reason.llllllIllIIII[Reason.llllllIllIIIl[17]] = lIllIIIIIlIIlll("LzUiCTYgIj4ILDopIwk2IDI=", "nvaFc");
            Reason.llllllIllIIII[Reason.llllllIllIIIl[18]] = lIllIIIIIlIIlll("ISI4FwY/eD8cBiQ3Ix4GMDovXAYxNSUHCSYJJB0TDTQlBwk2", "RVJrg");
            Reason.llllllIllIIII[Reason.llllllIllIIIl[19]] = lIllIIIIIlIIlll("HA4xEQoCVDYaChkbKhgKDRYmWgoMGSwBBRslLRsfMBgsAQULVCwfChY=", "ozCtk");
            Reason.llllllIllIIII[Reason.llllllIllIIIl[20]] = lIllIIIIIlIIlll("DScxLgkPOSw1BR8lMD0NHjIw", "KfxbL");
            Reason.llllllIllIIII[Reason.llllllIllIIIl[21]] = lIllIIIIIlIIlll("NDoaCTIqYB0CMjEvAQAyJSINQjUmJwQJNxgvHRg7", "GNhlS");
            Reason.llllllIllIIII[Reason.llllllIllIIIl[22]] = lIllIIIIIlIIlll("FCEQFhUKexcdFRE0Cx8VBTkHXRIGPA4WEDg0FwccSToJEg0=", "gUbst");
            Reason.llllllIllIIII[Reason.llllllIllIIIl[23]] = lIllIIIIIlIIllI("SwIaSiskNTM3ytxGPZaWIGFPDN5Acql/gZwKEbDzJE4=", "THrWz");
            Reason.llllllIllIIII[Reason.llllllIllIIIl[24]] = lIllIIIIIlIlIII("A57F/nFVxCwsIs+fHFeOdzdwRz2ldphL2aXTpfZu+TNVM+5NQckDOg==", "anvNa");
            Reason.llllllIllIIII[Reason.llllllIllIIIl[25]] = lIllIIIIIlIIllI("124ziVCHL+KvEHDbPvDryFsp1iQ7Sxf3", "QjDDi");
            Reason.llllllIllIIII[Reason.llllllIllIIIl[26]] = lIllIIIIIlIIlll("NT0FPzUrZwI0NTAoHjY1JCUSdD0oIAMzNSogDTsgLyYZBTInIBsvJiM=", "FIwZT");
            Reason.llllllIllIIII[Reason.llllllIllIIIl[27]] = lIllIIIIIlIIlll("BQEFERgbWwIaGAAUHhgYFBkSWgsTBRgGDSkBGCsUGR8WGh4=", "vuwty");
            Reason.llllllIllIIII[Reason.llllllIllIIIl[28]] = lIllIIIIIlIIllI("rq5Hca3a1Lo=", "vzjmY");
            Reason.llllllIllIIII[Reason.llllllIllIIIl[29]] = lIllIIIIIlIIllI("L2qrj5pT3Jw3aLrQKzdwNbaDgZpBDxmf/JLbRlJCKEk=", "ZErLP");
            Reason.llllllIllIIII[Reason.llllllIllIIIl[30]] = lIllIIIIIlIIllI("WjJ8r96Lwg2JGQxVQcJ6JE4/uMIXN4FP/uwxQ5LFm5ue/KjSs/YAeg==", "jVstY");
        }
        
        private static String lIllIIIIIlIIlll(String lllllllllllllIlIlIlIIllllIIIlIIl, final String lllllllllllllIlIlIlIIllllIIIlIII) {
            lllllllllllllIlIlIlIIllllIIIlIIl = new String(Base64.getDecoder().decode(lllllllllllllIlIlIlIIllllIIIlIIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
            final StringBuilder lllllllllllllIlIlIlIIllllIIIllII = new StringBuilder();
            final char[] lllllllllllllIlIlIlIIllllIIIlIll = lllllllllllllIlIlIlIIllllIIIlIII.toCharArray();
            int lllllllllllllIlIlIlIIllllIIIlIlI = Reason.llllllIllIIIl[0];
            final float lllllllllllllIlIlIlIIllllIIIIlII = (Object)lllllllllllllIlIlIlIIllllIIIlIIl.toCharArray();
            final short lllllllllllllIlIlIlIIllllIIIIIll = (short)lllllllllllllIlIlIlIIllllIIIIlII.length;
            char lllllllllllllIlIlIlIIllllIIIIIlI = (char)Reason.llllllIllIIIl[0];
            while (lIllIIIIIlIlIll(lllllllllllllIlIlIlIIllllIIIIIlI, lllllllllllllIlIlIlIIllllIIIIIll)) {
                final char lllllllllllllIlIlIlIIllllIIIllll = lllllllllllllIlIlIlIIllllIIIIlII[lllllllllllllIlIlIlIIllllIIIIIlI];
                lllllllllllllIlIlIlIIllllIIIllII.append((char)(lllllllllllllIlIlIlIIllllIIIllll ^ lllllllllllllIlIlIlIIllllIIIlIll[lllllllllllllIlIlIlIIllllIIIlIlI % lllllllllllllIlIlIlIIllllIIIlIll.length]));
                "".length();
                ++lllllllllllllIlIlIlIIllllIIIlIlI;
                ++lllllllllllllIlIlIlIIllllIIIIIlI;
                "".length();
                if (((0x39 ^ 0x63 ^ (0xBA ^ 0xA8)) & (0x59 ^ 0x2D ^ (0xB ^ 0x37) ^ -" ".length())) < 0) {
                    return null;
                }
            }
            return String.valueOf(lllllllllllllIlIlIlIIllllIIIllII);
        }
        
        private static String lIllIIIIIlIlIII(final String lllllllllllllIlIlIlIIllllIIlllII, final String lllllllllllllIlIlIlIIllllIIlllIl) {
            try {
                final SecretKeySpec lllllllllllllIlIlIlIIllllIlIIIIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIlIlIlIIllllIIlllIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
                final Cipher lllllllllllllIlIlIlIIllllIlIIIII = Cipher.getInstance("Blowfish");
                lllllllllllllIlIlIlIIllllIlIIIII.init(Reason.llllllIllIIIl[2], lllllllllllllIlIlIlIIllllIlIIIIl);
                return new String(lllllllllllllIlIlIlIIllllIlIIIII.doFinal(Base64.getDecoder().decode(lllllllllllllIlIlIlIIllllIIlllII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
            }
            catch (Exception lllllllllllllIlIlIlIIllllIIlllll) {
                lllllllllllllIlIlIlIIllllIIlllll.printStackTrace();
                return null;
            }
        }
        
        private static void lIllIIIIIlIlIlI() {
            (llllllIllIIIl = new int[32])[0] = ((0xEB ^ 0xA9) & ~(0x47 ^ 0x5));
            Reason.llllllIllIIIl[1] = " ".length();
            Reason.llllllIllIIIl[2] = "  ".length();
            Reason.llllllIllIIIl[3] = "   ".length();
            Reason.llllllIllIIIl[4] = (0x1 ^ 0x28 ^ (0xAC ^ 0x81));
            Reason.llllllIllIIIl[5] = (21 + 30 + 113 + 18 ^ 76 + 92 - 78 + 89);
            Reason.llllllIllIIIl[6] = (0x18 ^ 0x1E);
            Reason.llllllIllIIIl[7] = (0xA ^ 0x12 ^ (0xAF ^ 0xB0));
            Reason.llllllIllIIIl[8] = (0x71 ^ 0x54 ^ (0x2B ^ 0x6));
            Reason.llllllIllIIIl[9] = (0x8B ^ 0x82);
            Reason.llllllIllIIIl[10] = (0x97 ^ 0x9D);
            Reason.llllllIllIIIl[11] = (0x6D ^ 0x66);
            Reason.llllllIllIIIl[12] = (0x16 ^ 0x1A);
            Reason.llllllIllIIIl[13] = (0x77 ^ 0x2F ^ (0xC ^ 0x59));
            Reason.llllllIllIIIl[14] = (0x7F ^ 0x71);
            Reason.llllllIllIIIl[15] = (0x41 ^ 0x4E);
            Reason.llllllIllIIIl[16] = (0x36 ^ 0x26);
            Reason.llllllIllIIIl[17] = (0x9E ^ 0x8F);
            Reason.llllllIllIIIl[18] = (0xF3 ^ 0x80 ^ (0xED ^ 0x8C));
            Reason.llllllIllIIIl[19] = (0x95 ^ 0x86);
            Reason.llllllIllIIIl[20] = (0x98 ^ 0x8C);
            Reason.llllllIllIIIl[21] = (0x11 ^ 0x70 ^ (0xC1 ^ 0xB5));
            Reason.llllllIllIIIl[22] = (0xD1 ^ 0xC7);
            Reason.llllllIllIIIl[23] = (0xAD ^ 0xBA ^ ((0x64 ^ 0x3B) & ~(0x9 ^ 0x56)));
            Reason.llllllIllIIIl[24] = (0x7F ^ 0x67);
            Reason.llllllIllIIIl[25] = (0xA ^ 0x13);
            Reason.llllllIllIIIl[26] = (0x2F ^ 0x35);
            Reason.llllllIllIIIl[27] = (0x8D ^ 0x96);
            Reason.llllllIllIIIl[28] = (0x3A ^ 0xB ^ (0x2F ^ 0x2));
            Reason.llllllIllIIIl[29] = (0x8C ^ 0x91);
            Reason.llllllIllIIIl[30] = (0xCC ^ 0xA6 ^ (0x74 ^ 0x0));
            Reason.llllllIllIIIl[31] = (0x47 ^ 0x58);
        }
        
        private static String lIllIIIIIlIIllI(final String lllllllllllllIlIlIlIIllllIlIlIIl, final String lllllllllllllIlIlIlIIllllIlIlIII) {
            try {
                final SecretKeySpec lllllllllllllIlIlIlIIllllIlIlllI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIlIlIlIIllllIlIlIII.getBytes(StandardCharsets.UTF_8)), Reason.llllllIllIIIl[8]), "DES");
                final Cipher lllllllllllllIlIlIlIIllllIlIllIl = Cipher.getInstance("DES");
                lllllllllllllIlIlIlIIllllIlIllIl.init(Reason.llllllIllIIIl[2], lllllllllllllIlIlIlIIllllIlIlllI);
                return new String(lllllllllllllIlIlIlIIllllIlIllIl.doFinal(Base64.getDecoder().decode(lllllllllllllIlIlIlIIllllIlIlIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
            }
            catch (Exception lllllllllllllIlIlIlIIllllIlIllII) {
                lllllllllllllIlIlIlIIllllIlIllII.printStackTrace();
                return null;
            }
        }
        
        private static boolean lIllIIIIIlIlIll(final int lllllllllllllIlIlIlIIlllIllllllI, final int lllllllllllllIlIlIlIIlllIlllllIl) {
            return lllllllllllllIlIlIlIIlllIllllllI < lllllllllllllIlIlIlIIlllIlllllIl;
        }
        
        public IChatComponent func_152561_a() {
            return this.field_152574_m;
        }
        
        private Reason(final String lllllllllllllIlIlIlIIlllllIIIlII, final int lllllllllllllIlIlIlIIlllllIIIIll, final IChatComponent lllllllllllllIlIlIlIIlllllIIIlll, final IChatComponent lllllllllllllIlIlIlIIlllllIIIllI) {
            this.field_152574_m = lllllllllllllIlIlIlIIlllllIIIlll;
            this.field_152575_n = lllllllllllllIlIlIlIIlllllIIIllI;
        }
        
        public IChatComponent func_152559_b() {
            return this.field_152575_n;
        }
        
        private Reason(final String lllllllllllllIlIlIlIIlllllIlIIII, final int lllllllllllllIlIlIlIIlllllIIllll, final IChatComponent lllllllllllllIlIlIlIIlllllIIlllI) {
            this(lllllllllllllIlIlIlIIlllllIlIIII, lllllllllllllIlIlIlIIlllllIIllll, lllllllllllllIlIlIlIIlllllIIlllI, null);
        }
        
        static {
            lIllIIIIIlIlIlI();
            lIllIIIIIlIlIIl();
            final Reason[] enum$VALUES = new Reason[Reason.llllllIllIIIl[12]];
            enum$VALUES[Reason.llllllIllIIIl[0]] = Reason.NO_FBO;
            enum$VALUES[Reason.llllllIllIIIl[1]] = Reason.LIBRARY_ARCH_MISMATCH;
            enum$VALUES[Reason.llllllIllIIIl[2]] = Reason.LIBRARY_FAILURE;
            enum$VALUES[Reason.llllllIllIIIl[3]] = Reason.UNSUPPORTED_OS_WINDOWS;
            enum$VALUES[Reason.llllllIllIIIl[4]] = Reason.UNSUPPORTED_OS_MAC;
            enum$VALUES[Reason.llllllIllIIIl[5]] = Reason.UNSUPPORTED_OS_OTHER;
            enum$VALUES[Reason.llllllIllIIIl[6]] = Reason.ACCOUNT_NOT_MIGRATED;
            enum$VALUES[Reason.llllllIllIIIl[7]] = Reason.ACCOUNT_NOT_BOUND;
            enum$VALUES[Reason.llllllIllIIIl[8]] = Reason.FAILED_TWITCH_AUTH;
            enum$VALUES[Reason.llllllIllIIIl[9]] = Reason.FAILED_TWITCH_AUTH_ERROR;
            enum$VALUES[Reason.llllllIllIIIl[10]] = Reason.INITIALIZATION_FAILURE;
            enum$VALUES[Reason.llllllIllIIIl[11]] = Reason.UNKNOWN;
            ENUM$VALUES = enum$VALUES;
        }
    }
}
