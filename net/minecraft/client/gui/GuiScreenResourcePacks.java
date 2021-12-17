// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.client.gui;

import net.minecraft.client.resources.ResourcePackListEntryDefault;
import java.util.Collection;
import org.apache.logging.log4j.LogManager;
import java.util.Iterator;
import java.lang.reflect.Method;
import java.io.File;
import net.minecraft.client.resources.ResourcePackRepository;
import java.util.Collections;
import net.minecraft.client.resources.ResourcePackListEntryFound;
import com.google.common.collect.Lists;
import org.lwjgl.Sys;
import java.net.URI;
import java.io.IOException;
import net.minecraft.util.Util;
import net.minecraft.client.resources.I18n;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import net.minecraft.client.resources.ResourcePackListEntry;
import java.util.List;
import org.apache.logging.log4j.Logger;

public class GuiScreenResourcePacks extends GuiScreen
{
    private /* synthetic */ GuiResourcePackAvailable availableResourcePacksList;
    private final /* synthetic */ GuiScreen parentScreen;
    private static final /* synthetic */ int[] lIIlIIlIIlllII;
    private static final /* synthetic */ Logger logger;
    private /* synthetic */ List<ResourcePackListEntry> selectedResourcePacks;
    private /* synthetic */ GuiResourcePackSelected selectedResourcePacksList;
    private /* synthetic */ List<ResourcePackListEntry> availableResourcePacks;
    private static final /* synthetic */ String[] lIIlIIlIIllIIl;
    private /* synthetic */ boolean changed;
    
    private static String llIIllIIllIlIIl(final String lllllllllllllIIllIllllIIllIlllII, final String lllllllllllllIIllIllllIIllIlllIl) {
        try {
            final SecretKeySpec lllllllllllllIIllIllllIIlllIIIIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIIllIllllIIllIlllIl.getBytes(StandardCharsets.UTF_8)), GuiScreenResourcePacks.lIIlIIlIIlllII[8]), "DES");
            final Cipher lllllllllllllIIllIllllIIlllIIIII = Cipher.getInstance("DES");
            lllllllllllllIIllIllllIIlllIIIII.init(GuiScreenResourcePacks.lIIlIIlIIlllII[1], lllllllllllllIIllIllllIIlllIIIIl);
            return new String(lllllllllllllIIllIllllIIlllIIIII.doFinal(Base64.getDecoder().decode(lllllllllllllIIllIllllIIllIlllII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIllIllllIIllIlllll) {
            lllllllllllllIIllIllllIIllIlllll.printStackTrace();
            return null;
        }
    }
    
    private static String llIIllIIllIIIll(final String lllllllllllllIIllIllllIIlIllIlll, final String lllllllllllllIIllIllllIIlIlllIII) {
        try {
            final SecretKeySpec lllllllllllllIIllIllllIIlIllllII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIIllIllllIIlIlllIII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lllllllllllllIIllIllllIIlIlllIll = Cipher.getInstance("Blowfish");
            lllllllllllllIIllIllllIIlIlllIll.init(GuiScreenResourcePacks.lIIlIIlIIlllII[1], lllllllllllllIIllIllllIIlIllllII);
            return new String(lllllllllllllIIllIllllIIlIlllIll.doFinal(Base64.getDecoder().decode(lllllllllllllIIllIllllIIlIllIlll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIllIllllIIlIlllIlI) {
            lllllllllllllIIllIllllIIlIlllIlI.printStackTrace();
            return null;
        }
    }
    
    @Override
    public void drawScreen(final int lllllllllllllIIllIllllIIlllIlIll, final int lllllllllllllIIllIllllIIlllIlIlI, final float lllllllllllllIIllIllllIIlllIllIl) {
        this.drawBackground(GuiScreenResourcePacks.lIIlIIlIIlllII[0]);
        this.availableResourcePacksList.drawScreen(lllllllllllllIIllIllllIIlllIlIll, lllllllllllllIIllIllllIIlllIlIlI, lllllllllllllIIllIllllIIlllIllIl);
        this.selectedResourcePacksList.drawScreen(lllllllllllllIIllIllllIIlllIlIll, lllllllllllllIIllIllllIIlllIlIlI, lllllllllllllIIllIllllIIlllIllIl);
        this.drawCenteredString(this.fontRendererObj, I18n.format(GuiScreenResourcePacks.lIIlIIlIIllIIl[GuiScreenResourcePacks.lIIlIIlIIlllII[15]], new Object[GuiScreenResourcePacks.lIIlIIlIIlllII[0]]), this.width / GuiScreenResourcePacks.lIIlIIlIIlllII[1], GuiScreenResourcePacks.lIIlIIlIIlllII[16], GuiScreenResourcePacks.lIIlIIlIIlllII[17]);
        this.drawCenteredString(this.fontRendererObj, I18n.format(GuiScreenResourcePacks.lIIlIIlIIllIIl[GuiScreenResourcePacks.lIIlIIlIIlllII[18]], new Object[GuiScreenResourcePacks.lIIlIIlIIlllII[0]]), this.width / GuiScreenResourcePacks.lIIlIIlIIlllII[1] - GuiScreenResourcePacks.lIIlIIlIIlllII[19], this.height - GuiScreenResourcePacks.lIIlIIlIIlllII[20], GuiScreenResourcePacks.lIIlIIlIIlllII[21]);
        super.drawScreen(lllllllllllllIIllIllllIIlllIlIll, lllllllllllllIIllIllllIIlllIlIlI, lllllllllllllIIllIllllIIlllIllIl);
    }
    
    @Override
    protected void actionPerformed(final GuiButton lllllllllllllIIllIllllIlIIIlIIlI) throws IOException {
        if (llIIllIIlllIIII(lllllllllllllIIllIllllIlIIIlIIlI.enabled ? 1 : 0)) {
            if (llIIllIIlllIIIl(lllllllllllllIIllIllllIlIIIlIIlI.id, GuiScreenResourcePacks.lIIlIIlIIlllII[1])) {
                final File lllllllllllllIIllIllllIlIIIlllll = this.mc.getResourcePackRepository().getDirResourcepacks();
                final String lllllllllllllIIllIllllIlIIIllllI = lllllllllllllIIllIllllIlIIIlllll.getAbsolutePath();
                Label_0254: {
                    if (llIIllIIlllIIlI(Util.getOSType(), Util.EnumOS.OSX)) {
                        try {
                            GuiScreenResourcePacks.logger.info(lllllllllllllIIllIllllIlIIIllllI);
                            final Runtime runtime = Runtime.getRuntime();
                            final String[] cmdarray = new String[GuiScreenResourcePacks.lIIlIIlIIlllII[1]];
                            cmdarray[GuiScreenResourcePacks.lIIlIIlIIlllII[0]] = GuiScreenResourcePacks.lIIlIIlIIllIIl[GuiScreenResourcePacks.lIIlIIlIIlllII[1]];
                            cmdarray[GuiScreenResourcePacks.lIIlIIlIIlllII[4]] = lllllllllllllIIllIllllIlIIIllllI;
                            runtime.exec(cmdarray);
                            "".length();
                            return;
                        }
                        catch (IOException lllllllllllllIIllIllllIlIIIlllIl) {
                            GuiScreenResourcePacks.logger.error(GuiScreenResourcePacks.lIIlIIlIIllIIl[GuiScreenResourcePacks.lIIlIIlIIlllII[9]], (Throwable)lllllllllllllIIllIllllIlIIIlllIl);
                            "".length();
                            if (((0x92 ^ 0xA4 ^ (0xF ^ 0x32)) & (0x57 ^ 0x75 ^ (0x42 ^ 0x6B) ^ -" ".length())) != 0x0) {
                                return;
                            }
                            break Label_0254;
                        }
                    }
                    if (llIIllIIlllIIlI(Util.getOSType(), Util.EnumOS.WINDOWS)) {
                        final String format = GuiScreenResourcePacks.lIIlIIlIIllIIl[GuiScreenResourcePacks.lIIlIIlIIlllII[5]];
                        final Object[] args = new Object[GuiScreenResourcePacks.lIIlIIlIIlllII[4]];
                        args[GuiScreenResourcePacks.lIIlIIlIIlllII[0]] = lllllllllllllIIllIllllIlIIIllllI;
                        final String lllllllllllllIIllIllllIlIIIlllII = String.format(format, args);
                        try {
                            Runtime.getRuntime().exec(lllllllllllllIIllIllllIlIIIlllII);
                            "".length();
                            return;
                        }
                        catch (IOException lllllllllllllIIllIllllIlIIIllIll) {
                            GuiScreenResourcePacks.logger.error(GuiScreenResourcePacks.lIIlIIlIIllIIl[GuiScreenResourcePacks.lIIlIIlIIlllII[10]], (Throwable)lllllllllllllIIllIllllIlIIIllIll);
                        }
                    }
                }
                boolean lllllllllllllIIllIllllIlIIIllIlI = GuiScreenResourcePacks.lIIlIIlIIlllII[0] != 0;
                try {
                    final Class<?> lllllllllllllIIllIllllIlIIIllIIl = Class.forName(GuiScreenResourcePacks.lIIlIIlIIllIIl[GuiScreenResourcePacks.lIIlIIlIIlllII[11]]);
                    final Object lllllllllllllIIllIllllIlIIIllIII = lllllllllllllIIllIllllIlIIIllIIl.getMethod(GuiScreenResourcePacks.lIIlIIlIIllIIl[GuiScreenResourcePacks.lIIlIIlIIlllII[7]], (Class<?>[])new Class[GuiScreenResourcePacks.lIIlIIlIIlllII[0]]).invoke(null, new Object[GuiScreenResourcePacks.lIIlIIlIIlllII[0]]);
                    final Class<?> clazz = lllllllllllllIIllIllllIlIIIllIIl;
                    final String name = GuiScreenResourcePacks.lIIlIIlIIllIIl[GuiScreenResourcePacks.lIIlIIlIIlllII[8]];
                    final Class[] parameterTypes = new Class[GuiScreenResourcePacks.lIIlIIlIIlllII[4]];
                    parameterTypes[GuiScreenResourcePacks.lIIlIIlIIlllII[0]] = URI.class;
                    final Method method = clazz.getMethod(name, (Class[])parameterTypes);
                    final Object obj = lllllllllllllIIllIllllIlIIIllIII;
                    final Object[] args2 = new Object[GuiScreenResourcePacks.lIIlIIlIIlllII[4]];
                    args2[GuiScreenResourcePacks.lIIlIIlIIlllII[0]] = lllllllllllllIIllIllllIlIIIlllll.toURI();
                    method.invoke(obj, args2);
                    "".length();
                    "".length();
                    if ((0x74 ^ 0x71 ^ " ".length()) < -" ".length()) {
                        return;
                    }
                }
                catch (Throwable lllllllllllllIIllIllllIlIIIlIlll) {
                    GuiScreenResourcePacks.logger.error(GuiScreenResourcePacks.lIIlIIlIIllIIl[GuiScreenResourcePacks.lIIlIIlIIlllII[12]], lllllllllllllIIllIllllIlIIIlIlll);
                    lllllllllllllIIllIllllIlIIIllIlI = (GuiScreenResourcePacks.lIIlIIlIIlllII[4] != 0);
                }
                if (llIIllIIlllIIII(lllllllllllllIIllIllllIlIIIllIlI ? 1 : 0)) {
                    GuiScreenResourcePacks.logger.info(GuiScreenResourcePacks.lIIlIIlIIllIIl[GuiScreenResourcePacks.lIIlIIlIIlllII[13]]);
                    Sys.openURL(String.valueOf(new StringBuilder(GuiScreenResourcePacks.lIIlIIlIIllIIl[GuiScreenResourcePacks.lIIlIIlIIlllII[14]]).append(lllllllllllllIIllIllllIlIIIllllI)));
                    "".length();
                    "".length();
                    if ("  ".length() <= 0) {
                        return;
                    }
                }
            }
            else if (llIIllIIlllIIIl(lllllllllllllIIllIllllIlIIIlIIlI.id, GuiScreenResourcePacks.lIIlIIlIIlllII[4])) {
                if (llIIllIIlllIIII(this.changed ? 1 : 0)) {
                    final List<ResourcePackRepository.Entry> lllllllllllllIIllIllllIlIIIlIllI = (List<ResourcePackRepository.Entry>)Lists.newArrayList();
                    final Iterator<ResourcePackListEntry> iterator = this.selectedResourcePacks.iterator();
                    "".length();
                    if (null != null) {
                        return;
                    }
                    while (!llIIllIIllIllll(iterator.hasNext() ? 1 : 0)) {
                        final ResourcePackListEntry lllllllllllllIIllIllllIlIIIlIlIl = iterator.next();
                        if (llIIllIIlllIIII((lllllllllllllIIllIllllIlIIIlIlIl instanceof ResourcePackListEntryFound) ? 1 : 0)) {
                            lllllllllllllIIllIllllIlIIIlIllI.add(((ResourcePackListEntryFound)lllllllllllllIIllIllllIlIIIlIlIl).func_148318_i());
                            "".length();
                        }
                    }
                    Collections.reverse(lllllllllllllIIllIllllIlIIIlIllI);
                    this.mc.getResourcePackRepository().setRepositories(lllllllllllllIIllIllllIlIIIlIllI);
                    this.mc.gameSettings.resourcePacks.clear();
                    this.mc.gameSettings.field_183018_l.clear();
                    final Iterator<ResourcePackRepository.Entry> iterator2 = lllllllllllllIIllIllllIlIIIlIllI.iterator();
                    "".length();
                    if ((0x47 ^ 0x43) <= 0) {
                        return;
                    }
                    while (!llIIllIIllIllll(iterator2.hasNext() ? 1 : 0)) {
                        final ResourcePackRepository.Entry lllllllllllllIIllIllllIlIIIlIlII = iterator2.next();
                        this.mc.gameSettings.resourcePacks.add(lllllllllllllIIllIllllIlIIIlIlII.getResourcePackName());
                        "".length();
                        if (llIIllIIlllIIll(lllllllllllllIIllIllllIlIIIlIlII.func_183027_f(), GuiScreenResourcePacks.lIIlIIlIIlllII[4])) {
                            this.mc.gameSettings.field_183018_l.add(lllllllllllllIIllIllllIlIIIlIlII.getResourcePackName());
                            "".length();
                        }
                    }
                    this.mc.gameSettings.saveOptions();
                    this.mc.refreshResources();
                }
                this.mc.displayGuiScreen(this.parentScreen);
            }
        }
    }
    
    private static boolean llIIllIIlllIIII(final int lllllllllllllIIllIllllIIlIlIIllI) {
        return lllllllllllllIIllIllllIIlIlIIllI != 0;
    }
    
    public List<ResourcePackListEntry> getSelectedResourcePacks() {
        return this.selectedResourcePacks;
    }
    
    private static void llIIllIIllIlllI() {
        (lIIlIIlIIlllII = new int[23])[0] = ((0xA4 ^ 0xB2) & ~(0xA7 ^ 0xB1));
        GuiScreenResourcePacks.lIIlIIlIIlllII[1] = "  ".length();
        GuiScreenResourcePacks.lIIlIIlIIlllII[2] = 125 + 22 - 47 + 54;
        GuiScreenResourcePacks.lIIlIIlIIlllII[3] = (0xA9 ^ 0x99);
        GuiScreenResourcePacks.lIIlIIlIIlllII[4] = " ".length();
        GuiScreenResourcePacks.lIIlIIlIIlllII[5] = (0x54 ^ 0x1A ^ (0x74 ^ 0x3E));
        GuiScreenResourcePacks.lIIlIIlIIlllII[6] = (0x29 ^ 0x64) + (0x5C ^ 0x51) - -(0x4C ^ 0x7D) + (0x24 ^ 0x19);
        GuiScreenResourcePacks.lIIlIIlIIlllII[7] = (0x3C ^ 0x3B);
        GuiScreenResourcePacks.lIIlIIlIIlllII[8] = (0x92 ^ 0x9A);
        GuiScreenResourcePacks.lIIlIIlIIlllII[9] = "   ".length();
        GuiScreenResourcePacks.lIIlIIlIIlllII[10] = (0x9F ^ 0x8D ^ (0x7B ^ 0x6C));
        GuiScreenResourcePacks.lIIlIIlIIlllII[11] = (86 + 132 - 96 + 59 ^ 128 + 100 - 76 + 27);
        GuiScreenResourcePacks.lIIlIIlIIlllII[12] = (133 + 27 - 144 + 152 ^ 145 + 79 - 162 + 99);
        GuiScreenResourcePacks.lIIlIIlIIlllII[13] = (0x6F ^ 0x11 ^ (0xB5 ^ 0xC1));
        GuiScreenResourcePacks.lIIlIIlIIlllII[14] = (137 + 160 - 186 + 94 ^ 76 + 106 - 168 + 184);
        GuiScreenResourcePacks.lIIlIIlIIlllII[15] = (0xB0 ^ 0xBC);
        GuiScreenResourcePacks.lIIlIIlIIlllII[16] = (0x8 ^ 0x25 ^ (0x78 ^ 0x45));
        GuiScreenResourcePacks.lIIlIIlIIlllII[17] = (-1 & 0xFFFFFF);
        GuiScreenResourcePacks.lIIlIIlIIlllII[18] = (179 + 51 - 198 + 174 ^ 14 + 12 + 136 + 33);
        GuiScreenResourcePacks.lIIlIIlIIlllII[19] = (0xEC ^ 0x83 ^ (0x10 ^ 0x32));
        GuiScreenResourcePacks.lIIlIIlIIlllII[20] = (150 + 21 - 139 + 134 ^ 3 + 26 + 78 + 81);
        GuiScreenResourcePacks.lIIlIIlIIlllII[21] = (-(0xFFFFFFE7 & 0x1D7B) & (0xFFFFBDFA & 0x80DFE7));
        GuiScreenResourcePacks.lIIlIIlIIlllII[22] = (0xBD ^ 0xB3);
    }
    
    static {
        llIIllIIllIlllI();
        llIIllIIllIlIlI();
        logger = LogManager.getLogger();
    }
    
    private static boolean llIIllIIlllIIlI(final Object lllllllllllllIIllIllllIIlIlIlIIl, final Object lllllllllllllIIllIllllIIlIlIlIII) {
        return lllllllllllllIIllIllllIIlIlIlIIl == lllllllllllllIIllIllllIIlIlIlIII;
    }
    
    private static void llIIllIIllIlIlI() {
        (lIIlIIlIIllIIl = new String[GuiScreenResourcePacks.lIIlIIlIIlllII[22]])[GuiScreenResourcePacks.lIIlIIlIIlllII[0]] = llIIllIIllIIIll("USNmh9SxCb3BQQs4UjRJTmCkGillDFZn", "AWRcR");
        GuiScreenResourcePacks.lIIlIIlIIllIIl[GuiScreenResourcePacks.lIIlIIlIIlllII[4]] = llIIllIIllIIIll("MslhHvf25Te7PvpCYa4flQ==", "iObzV");
        GuiScreenResourcePacks.lIIlIIlIIllIIl[GuiScreenResourcePacks.lIIlIIlIIlllII[1]] = llIIllIIllIIIll("GSPd0XtSGo6RoIDkD5hU1g==", "LgNhG");
        GuiScreenResourcePacks.lIIlIIlIIllIIl[GuiScreenResourcePacks.lIIlIIlIIlllII[9]] = llIIllIIllIIIll("o7+I90vqcPXpadAiv77CI2guCO0NTbyR", "jiAFi");
        GuiScreenResourcePacks.lIIlIIlIIllIIl[GuiScreenResourcePacks.lIIlIIlIIlllII[5]] = llIIllIIllIlIII("FyQgQSwMLGRAClQ6MA47AGlmIDkRJ2QJIBgsZk9rUTpm", "tIDoI");
        GuiScreenResourcePacks.lIIlIIlIIllIIl[GuiScreenResourcePacks.lIIlIIlIIlllII[10]] = llIIllIIllIlIII("Kj4MFSMHdg1ZKBk0F1khAD0c", "iQyyG");
        GuiScreenResourcePacks.lIIlIIlIIllIIl[GuiScreenResourcePacks.lIIlIIlIIlllII[11]] = llIIllIIllIlIII("Lyo5JFokPDtrMCA4JDEbNQ==", "EKOEt");
        GuiScreenResourcePacks.lIIlIIlIIllIIl[GuiScreenResourcePacks.lIIlIIlIIlllII[7]] = llIIllIIllIlIII("Di0EPhIaIwQVBw==", "iHpzw");
        GuiScreenResourcePacks.lIIlIIlIIllIIl[GuiScreenResourcePacks.lIIlIIlIIlllII[8]] = llIIllIIllIlIIl("rF7MNoUeMHg=", "DHspX");
        GuiScreenResourcePacks.lIIlIIlIIllIIl[GuiScreenResourcePacks.lIIlIIlIIlllII[12]] = llIIllIIllIlIIl("r/iYB7KM3sK6tpfWOj1HTvC7nAlP+qDr", "GNJZR");
        GuiScreenResourcePacks.lIIlIIlIIllIIl[GuiScreenResourcePacks.lIIlIIlIIlllII[13]] = llIIllIIllIlIIl("/jMDjKCZ2PUxheQaugokSlO5a/hK7RALOO0BP+JcnhY=", "HUhNt");
        GuiScreenResourcePacks.lIIlIIlIIllIIl[GuiScreenResourcePacks.lIIlIIlIIlllII[14]] = llIIllIIllIlIII("BwshJnxOTQ==", "abMCF");
        GuiScreenResourcePacks.lIIlIIlIIllIIl[GuiScreenResourcePacks.lIIlIIlIIlllII[15]] = llIIllIIllIlIII("ABU7LRMAEy0SBxEbZjYPBhwt", "rpHBf");
        GuiScreenResourcePacks.lIIlIIlIIllIIl[GuiScreenResourcePacks.lIIlIIlIIlllII[18]] = llIIllIIllIlIIl("mWjfts+rw7IWiDZ10JjWFLLVsNrsTzEp", "PqFSd");
    }
    
    private static boolean llIIllIIlllIIll(final int lllllllllllllIIllIllllIIlIlIIIIl, final int lllllllllllllIIllIllllIIlIlIIIII) {
        return lllllllllllllIIllIllllIIlIlIIIIl != lllllllllllllIIllIllllIIlIlIIIII;
    }
    
    private static String llIIllIIllIlIII(String lllllllllllllIIllIllllIIllIIlIIl, final String lllllllllllllIIllIllllIIllIIllIl) {
        lllllllllllllIIllIllllIIllIIlIIl = new String(Base64.getDecoder().decode(lllllllllllllIIllIllllIIllIIlIIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIIllIllllIIllIIllII = new StringBuilder();
        final char[] lllllllllllllIIllIllllIIllIIlIll = lllllllllllllIIllIllllIIllIIllIl.toCharArray();
        int lllllllllllllIIllIllllIIllIIlIlI = GuiScreenResourcePacks.lIIlIIlIIlllII[0];
        final byte lllllllllllllIIllIllllIIllIIIlII = (Object)lllllllllllllIIllIllllIIllIIlIIl.toCharArray();
        final char lllllllllllllIIllIllllIIllIIIIll = (char)lllllllllllllIIllIllllIIllIIIlII.length;
        double lllllllllllllIIllIllllIIllIIIIlI = GuiScreenResourcePacks.lIIlIIlIIlllII[0];
        while (llIIllIIlllIlII((int)lllllllllllllIIllIllllIIllIIIIlI, lllllllllllllIIllIllllIIllIIIIll)) {
            final char lllllllllllllIIllIllllIIllIIllll = lllllllllllllIIllIllllIIllIIIlII[lllllllllllllIIllIllllIIllIIIIlI];
            lllllllllllllIIllIllllIIllIIllII.append((char)(lllllllllllllIIllIllllIIllIIllll ^ lllllllllllllIIllIllllIIllIIlIll[lllllllllllllIIllIllllIIllIIlIlI % lllllllllllllIIllIllllIIllIIlIll.length]));
            "".length();
            ++lllllllllllllIIllIllllIIllIIlIlI;
            ++lllllllllllllIIllIllllIIllIIIIlI;
            "".length();
            if ("   ".length() <= " ".length()) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIIllIllllIIllIIllII);
    }
    
    public List<ResourcePackListEntry> getListContaining(final ResourcePackListEntry lllllllllllllIIllIllllIlIIllIIIl) {
        List<ResourcePackListEntry> list;
        if (llIIllIIlllIIII(this.hasResourcePackEntry(lllllllllllllIIllIllllIlIIllIIIl) ? 1 : 0)) {
            list = this.selectedResourcePacks;
            "".length();
            if (((0x99 ^ 0xAF) & ~(0x4F ^ 0x79)) != 0x0) {
                return null;
            }
        }
        else {
            list = this.availableResourcePacks;
        }
        return list;
    }
    
    @Override
    protected void mouseReleased(final int lllllllllllllIIllIllllIIllllIlll, final int lllllllllllllIIllIllllIIlllllIlI, final int lllllllllllllIIllIllllIIllllIlIl) {
        super.mouseReleased(lllllllllllllIIllIllllIIllllIlll, lllllllllllllIIllIllllIIlllllIlI, lllllllllllllIIllIllllIIllllIlIl);
    }
    
    @Override
    protected void mouseClicked(final int lllllllllllllIIllIllllIlIIIIIlll, final int lllllllllllllIIllIllllIlIIIIIIlI, final int lllllllllllllIIllIllllIlIIIIIlIl) throws IOException {
        super.mouseClicked(lllllllllllllIIllIllllIlIIIIIlll, lllllllllllllIIllIllllIlIIIIIIlI, lllllllllllllIIllIllllIlIIIIIlIl);
        this.availableResourcePacksList.mouseClicked(lllllllllllllIIllIllllIlIIIIIlll, lllllllllllllIIllIllllIlIIIIIIlI, lllllllllllllIIllIllllIlIIIIIlIl);
        "".length();
        this.selectedResourcePacksList.mouseClicked(lllllllllllllIIllIllllIlIIIIIlll, lllllllllllllIIllIllllIlIIIIIIlI, lllllllllllllIIllIllllIlIIIIIlIl);
        "".length();
    }
    
    private static boolean llIIllIIllIllll(final int lllllllllllllIIllIllllIIlIlIIlII) {
        return lllllllllllllIIllIllllIIlIlIIlII == 0;
    }
    
    public boolean hasResourcePackEntry(final ResourcePackListEntry lllllllllllllIIllIllllIlIIllIlll) {
        return this.selectedResourcePacks.contains(lllllllllllllIIllIllllIlIIllIlll);
    }
    
    private static boolean llIIllIIlllIIIl(final int lllllllllllllIIllIllllIIlIllIIIl, final int lllllllllllllIIllIllllIIlIllIIII) {
        return lllllllllllllIIllIllllIIlIllIIIl == lllllllllllllIIllIllllIIlIllIIII;
    }
    
    public GuiScreenResourcePacks(final GuiScreen lllllllllllllIIllIllllIlIlIIllIl) {
        this.changed = (GuiScreenResourcePacks.lIIlIIlIIlllII[0] != 0);
        this.parentScreen = lllllllllllllIIllIllllIlIlIIllIl;
    }
    
    @Override
    public void handleMouseInput() throws IOException {
        super.handleMouseInput();
        this.selectedResourcePacksList.handleMouseInput();
        this.availableResourcePacksList.handleMouseInput();
    }
    
    private static boolean llIIllIIlllIlII(final int lllllllllllllIIllIllllIIlIlIllIl, final int lllllllllllllIIllIllllIIlIlIllII) {
        return lllllllllllllIIllIllllIIlIlIllIl < lllllllllllllIIllIllllIIlIlIllII;
    }
    
    public List<ResourcePackListEntry> getAvailableResourcePacks() {
        return this.availableResourcePacks;
    }
    
    @Override
    public void initGui() {
        this.buttonList.add(new GuiOptionButton(GuiScreenResourcePacks.lIIlIIlIIlllII[1], this.width / GuiScreenResourcePacks.lIIlIIlIIlllII[1] - GuiScreenResourcePacks.lIIlIIlIIlllII[2], this.height - GuiScreenResourcePacks.lIIlIIlIIlllII[3], I18n.format(GuiScreenResourcePacks.lIIlIIlIIllIIl[GuiScreenResourcePacks.lIIlIIlIIlllII[0]], new Object[GuiScreenResourcePacks.lIIlIIlIIlllII[0]])));
        "".length();
        this.buttonList.add(new GuiOptionButton(GuiScreenResourcePacks.lIIlIIlIIlllII[4], this.width / GuiScreenResourcePacks.lIIlIIlIIlllII[1] + GuiScreenResourcePacks.lIIlIIlIIlllII[5], this.height - GuiScreenResourcePacks.lIIlIIlIIlllII[3], I18n.format(GuiScreenResourcePacks.lIIlIIlIIllIIl[GuiScreenResourcePacks.lIIlIIlIIlllII[4]], new Object[GuiScreenResourcePacks.lIIlIIlIIlllII[0]])));
        "".length();
        if (llIIllIIllIllll(this.changed ? 1 : 0)) {
            this.availableResourcePacks = (List<ResourcePackListEntry>)Lists.newArrayList();
            this.selectedResourcePacks = (List<ResourcePackListEntry>)Lists.newArrayList();
            final ResourcePackRepository lllllllllllllIIllIllllIlIlIIIllI = this.mc.getResourcePackRepository();
            lllllllllllllIIllIllllIlIlIIIllI.updateRepositoryEntriesAll();
            final List<ResourcePackRepository.Entry> lllllllllllllIIllIllllIlIlIIIlIl = (List<ResourcePackRepository.Entry>)Lists.newArrayList((Iterable)lllllllllllllIIllIllllIlIlIIIllI.getRepositoryEntriesAll());
            lllllllllllllIIllIllllIlIlIIIlIl.removeAll(lllllllllllllIIllIllllIlIlIIIllI.getRepositoryEntries());
            "".length();
            Exception lllllllllllllIIllIllllIlIIlllllI = (Exception)lllllllllllllIIllIllllIlIlIIIlIl.iterator();
            "".length();
            if (-(137 + 11 - 86 + 93 ^ 43 + 61 + 51 + 4) >= 0) {
                return;
            }
            while (!llIIllIIllIllll(((Iterator)lllllllllllllIIllIllllIlIIlllllI).hasNext() ? 1 : 0)) {
                final ResourcePackRepository.Entry lllllllllllllIIllIllllIlIlIIIlII = ((Iterator<ResourcePackRepository.Entry>)lllllllllllllIIllIllllIlIIlllllI).next();
                this.availableResourcePacks.add(new ResourcePackListEntryFound(this, lllllllllllllIIllIllllIlIlIIIlII));
                "".length();
            }
            lllllllllllllIIllIllllIlIIlllllI = (Exception)Lists.reverse((List)lllllllllllllIIllIllllIlIlIIIllI.getRepositoryEntries()).iterator();
            "".length();
            if (-" ".length() >= "   ".length()) {
                return;
            }
            while (!llIIllIIllIllll(((Iterator)lllllllllllllIIllIllllIlIIlllllI).hasNext() ? 1 : 0)) {
                final ResourcePackRepository.Entry lllllllllllllIIllIllllIlIlIIIIll = ((Iterator<ResourcePackRepository.Entry>)lllllllllllllIIllIllllIlIIlllllI).next();
                this.selectedResourcePacks.add(new ResourcePackListEntryFound(this, lllllllllllllIIllIllllIlIlIIIIll));
                "".length();
            }
            this.selectedResourcePacks.add(new ResourcePackListEntryDefault(this));
            "".length();
        }
        this.availableResourcePacksList = new GuiResourcePackAvailable(this.mc, GuiScreenResourcePacks.lIIlIIlIIlllII[6], this.height, this.availableResourcePacks);
        this.availableResourcePacksList.setSlotXBoundsFromLeft(this.width / GuiScreenResourcePacks.lIIlIIlIIlllII[1] - GuiScreenResourcePacks.lIIlIIlIIlllII[5] - GuiScreenResourcePacks.lIIlIIlIIlllII[6]);
        this.availableResourcePacksList.registerScrollButtons(GuiScreenResourcePacks.lIIlIIlIIlllII[7], GuiScreenResourcePacks.lIIlIIlIIlllII[8]);
        this.selectedResourcePacksList = new GuiResourcePackSelected(this.mc, GuiScreenResourcePacks.lIIlIIlIIlllII[6], this.height, this.selectedResourcePacks);
        this.selectedResourcePacksList.setSlotXBoundsFromLeft(this.width / GuiScreenResourcePacks.lIIlIIlIIlllII[1] + GuiScreenResourcePacks.lIIlIIlIIlllII[5]);
        this.selectedResourcePacksList.registerScrollButtons(GuiScreenResourcePacks.lIIlIIlIIlllII[7], GuiScreenResourcePacks.lIIlIIlIIlllII[8]);
    }
    
    public void markChanged() {
        this.changed = (GuiScreenResourcePacks.lIIlIIlIIlllII[4] != 0);
    }
}
