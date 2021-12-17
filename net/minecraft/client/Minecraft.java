// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.client;

import java.util.Date;
import java.text.SimpleDateFormat;
import net.minecraft.client.stream.NullStream;
import net.minecraft.client.stream.TwitchStream;
import com.google.common.collect.Iterables;
import com.mojang.authlib.properties.Property;
import java.nio.ByteOrder;
import org.lwjgl.util.glu.GLU;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.entity.EntityList;
import net.minecraft.entity.item.EntityArmorStand;
import net.minecraft.entity.item.EntityBoat;
import net.minecraft.entity.item.EntityItemFrame;
import net.minecraft.entity.EntityLeashKnot;
import net.minecraft.entity.item.EntityPainting;
import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;
import net.minecraft.init.Bootstrap;
import com.mojang.authlib.yggdrasil.YggdrasilAuthenticationService;
import java.util.UUID;
import net.minecraft.client.resources.ResourceIndex;
import com.google.common.collect.Queues;
import net.minecraft.server.MinecraftServer;
import net.minecraft.client.main.GameConfiguration;
import net.minecraft.client.network.NetHandlerPlayClient;
import java.util.concurrent.Executors;
import net.minecraft.util.MinecraftError;
import net.minecraft.client.gui.GuiMemoryErrorScreen;
import com.google.common.collect.Maps;
import java.util.Map;
import net.minecraft.client.gui.GuiIngameMenu;
import java.awt.image.BufferedImage;
import net.minecraft.util.ScreenShotHelper;
import net.minecraft.client.gui.stream.GuiStreamUnavailable;
import net.minecraft.util.IChatComponent;
import net.minecraft.util.ChatComponentText;
import net.minecraft.client.gui.GuiYesNo;
import net.minecraft.client.gui.GuiYesNoCallback;
import net.minecraft.client.gui.GuiControls;
import java.net.SocketAddress;
import net.minecraft.world.storage.ISaveHandler;
import net.minecraft.network.login.client.C00PacketLoginStart;
import net.minecraft.network.handshake.client.C00Handshake;
import net.minecraft.network.EnumConnectionState;
import net.minecraft.network.INetHandler;
import net.minecraft.client.network.NetHandlerLoginClient;
import net.minecraft.client.resources.I18n;
import net.minecraft.world.storage.WorldInfo;
import net.minecraft.world.WorldSettings;
import net.minecraft.nbt.NBTTagString;
import net.minecraft.nbt.NBTTagList;
import net.minecraft.nbt.NBTBase;
import net.minecraft.init.Items;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.item.Item;
import net.minecraft.util.MovementInputFromOptions;
import net.minecraft.stats.StatFileWriter;
import net.minecraft.util.BlockPos;
import net.minecraft.block.material.Material;
import net.minecraft.entity.item.EntityMinecart;
import java.util.Iterator;
import java.util.Set;
import java.util.Collection;
import java.util.Collections;
import com.google.common.collect.Sets;
import java.nio.ByteBuffer;
import com.mojang.authlib.GameProfile;
import com.google.common.collect.Multimap;
import com.google.common.collect.Lists;
import org.apache.logging.log4j.LogManager;
import com.google.common.util.concurrent.Futures;
import com.google.common.util.concurrent.ListenableFutureTask;
import org.apache.commons.lang3.Validate;
import com.google.common.util.concurrent.ListenableFuture;
import org.lwjgl.opengl.PixelFormat;
import java.io.Serializable;
import net.minecraft.client.renderer.chunk.RenderChunk;
import net.minecraft.util.Util;
import org.lwjgl.opengl.ContextCapabilities;
import org.lwjgl.opengl.GLContext;
import net.minecraft.client.resources.data.LanguageMetadataSection;
import net.minecraft.client.resources.data.LanguageMetadataSectionSerializer;
import net.minecraft.client.resources.data.PackMetadataSection;
import net.minecraft.client.resources.data.PackMetadataSectionSerializer;
import net.minecraft.client.resources.data.AnimationMetadataSection;
import net.minecraft.client.resources.data.AnimationMetadataSectionSerializer;
import net.minecraft.client.resources.data.FontMetadataSection;
import net.minecraft.client.resources.data.FontMetadataSectionSerializer;
import net.minecraft.client.resources.data.IMetadataSectionSerializer;
import net.minecraft.client.resources.data.TextureMetadataSection;
import net.minecraft.client.resources.data.TextureMetadataSectionSerializer;
import java.text.DecimalFormat;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.OpenGLException;
import net.minecraft.client.multiplayer.GuiConnecting;
import client.ClientName;
import net.minecraft.world.World;
import net.minecraft.client.renderer.texture.ITickableTextureObject;
import net.minecraft.stats.IStatStringFormat;
import net.minecraft.stats.AchievementList;
import net.minecraft.client.resources.FoliageColorReloadListener;
import net.minecraft.client.resources.GrassColorReloadListener;
import net.minecraft.world.chunk.storage.AnvilSaveConverter;
import client.ui.SplashProgress;
import net.minecraft.client.resources.IResourceManagerReloadListener;
import net.minecraft.client.resources.SimpleReloadableResourceManager;
import net.minecraft.client.renderer.OpenGlHelper;
import org.lwjgl.Sys;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import org.lwjgl.opengl.Display;
import net.minecraft.client.resources.IResourceManager;
import net.minecraft.entity.boss.BossStatus;
import net.minecraft.world.WorldProviderEnd;
import net.minecraft.world.WorldProviderHell;
import org.lwjgl.LWJGLException;
import net.minecraft.client.renderer.WorldRenderer;
import java.io.InputStream;
import net.minecraft.client.renderer.vertex.DefaultVertexFormats;
import net.minecraft.client.renderer.Tessellator;
import org.apache.commons.io.IOUtils;
import net.minecraft.client.renderer.texture.DynamicTexture;
import javax.imageio.ImageIO;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.gui.ScaledResolution;
import net.minecraft.client.gui.GuiGameOver;
import client.ui.MainMenu;
import java.io.IOException;
import net.minecraft.crash.CrashReportCategory;
import client.event.impl.ClientTick;
import net.minecraft.world.EnumDifficulty;
import net.minecraft.client.gui.GuiChat;
import net.minecraft.client.gui.inventory.GuiInventory;
import net.minecraft.network.Packet;
import net.minecraft.network.play.client.C16PacketClientStatus;
import net.minecraft.entity.player.EntityPlayer;
import client.event.impl.KeyEvent;
import org.lwjgl.input.Keyboard;
import net.minecraft.util.MathHelper;
import net.minecraft.client.settings.KeyBinding;
import org.lwjgl.input.Mouse;
import net.minecraft.util.ReportedException;
import java.util.concurrent.Callable;
import net.minecraft.client.gui.GuiSleepMP;
import net.minecraft.crash.CrashReport;
import net.minecraft.client.resources.LanguageManager;
import org.apache.logging.log4j.Logger;
import net.minecraft.client.resources.DefaultResourcePack;
import net.minecraft.client.gui.GuiScreen;
import java.net.Proxy;
import net.minecraft.client.renderer.ItemRenderer;
import net.minecraft.profiler.PlayerUsageSnooper;
import net.minecraft.client.gui.achievement.GuiAchievement;
import net.minecraft.client.particle.EffectRenderer;
import net.minecraft.util.Timer;
import org.lwjgl.opengl.DisplayMode;
import net.minecraft.client.renderer.BlockRendererDispatcher;
import net.minecraft.server.integrated.IntegratedServer;
import net.minecraft.client.settings.GameSettings;
import net.minecraft.client.renderer.EntityRenderer;
import net.minecraft.client.multiplayer.ServerData;
import net.minecraft.client.resources.ResourcePackRepository;
import net.minecraft.profiler.Profiler;
import com.mojang.authlib.properties.PropertyMap;
import java.util.concurrent.FutureTask;
import java.util.Queue;
import net.minecraft.client.renderer.RenderGlobal;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.client.multiplayer.PlayerControllerMP;
import net.minecraft.client.resources.data.IMetadataSerializer;
import net.minecraft.client.stream.IStream;
import net.minecraft.client.shader.Framebuffer;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.client.resources.SkinManager;
import net.minecraft.client.resources.model.ModelManager;
import net.minecraft.client.resources.IResourcePack;
import java.util.List;
import net.minecraft.client.resources.IReloadableResourceManager;
import java.io.File;
import net.minecraft.network.NetworkManager;
import net.minecraft.util.Session;
import net.minecraft.client.renderer.texture.TextureManager;
import net.minecraft.entity.Entity;
import net.minecraft.client.gui.FontRenderer;
import com.mojang.authlib.minecraft.MinecraftSessionService;
import net.minecraft.client.renderer.texture.TextureMap;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.MouseHelper;
import net.minecraft.client.audio.SoundHandler;
import net.minecraft.client.audio.MusicTicker;
import net.minecraft.client.multiplayer.WorldClient;
import net.minecraft.client.gui.GuiIngame;
import net.minecraft.util.FrameTimer;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.storage.ISaveFormat;
import net.minecraft.client.renderer.entity.RenderItem;
import net.minecraft.profiler.IPlayerUsage;
import net.minecraft.util.IThreadListener;

public class Minecraft implements IThreadListener, IPlayerUsage
{
    private /* synthetic */ boolean isGamePaused;
    public /* synthetic */ boolean field_175614_C;
    private /* synthetic */ long debugCrashKeyPressTime;
    private /* synthetic */ boolean integratedServerIsRunning;
    private /* synthetic */ RenderItem renderItem;
    private /* synthetic */ ISaveFormat saveLoader;
    public /* synthetic */ MovingObjectPosition objectMouseOver;
    private /* synthetic */ boolean field_181541_X;
    /* synthetic */ long debugUpdateTime;
    public final /* synthetic */ FrameTimer field_181542_y;
    public /* synthetic */ boolean inGameHasFocus;
    private final /* synthetic */ Thread mcThread;
    public /* synthetic */ GuiIngame ingameGUI;
    private static final /* synthetic */ int[] llllIllIllIll;
    public /* synthetic */ WorldClient theWorld;
    private static final /* synthetic */ String[] llllIlIlllIIl;
    private /* synthetic */ MusicTicker mcMusicTicker;
    private /* synthetic */ SoundHandler mcSoundHandler;
    public /* synthetic */ MouseHelper mouseHelper;
    private /* synthetic */ ResourceLocation mojangLogo;
    private /* synthetic */ TextureMap textureMapBlocks;
    private final /* synthetic */ MinecraftSessionService sessionService;
    /* synthetic */ int fpsCounter;
    public /* synthetic */ FontRenderer fontRendererObj;
    public /* synthetic */ int displayWidth;
    public /* synthetic */ Entity renderViewEntity;
    private /* synthetic */ TextureManager renderEngine;
    public /* synthetic */ Session session;
    private static final /* synthetic */ ResourceLocation locationMojangPng;
    private /* synthetic */ NetworkManager myNetworkManager;
    private final /* synthetic */ String launchedVersion;
    /* synthetic */ long systemTime;
    private /* synthetic */ String serverName;
    private final /* synthetic */ File fileAssets;
    private /* synthetic */ IReloadableResourceManager mcResourceManager;
    private /* synthetic */ long field_175615_aJ;
    private final /* synthetic */ List<IResourcePack> defaultResourcePacks;
    private final /* synthetic */ File fileResourcepacks;
    private /* synthetic */ ModelManager modelManager;
    private /* synthetic */ SkinManager skinManager;
    public /* synthetic */ String debug;
    private /* synthetic */ RenderManager renderManager;
    private /* synthetic */ Framebuffer framebufferMc;
    public /* synthetic */ boolean renderChunksMany;
    private /* synthetic */ IStream stream;
    private final /* synthetic */ IMetadataSerializer metadataSerializer_;
    volatile /* synthetic */ boolean running;
    private static /* synthetic */ Minecraft theMinecraft;
    public /* synthetic */ PlayerControllerMP playerController;
    public /* synthetic */ EntityPlayerSP thePlayer;
    private /* synthetic */ int serverPort;
    public /* synthetic */ RenderGlobal renderGlobal;
    private final /* synthetic */ Queue<FutureTask<?>> scheduledTasks;
    private final /* synthetic */ boolean jvm64bit;
    private /* synthetic */ boolean hasCrashed;
    private final /* synthetic */ PropertyMap twitchDetails;
    private /* synthetic */ int joinPlayerCounter;
    private /* synthetic */ int leftClickCounter;
    public static /* synthetic */ byte[] memoryReserve;
    public final /* synthetic */ Profiler mcProfiler;
    private /* synthetic */ ResourcePackRepository mcResourcePackRepository;
    private /* synthetic */ ServerData currentServerData;
    public /* synthetic */ EntityRenderer entityRenderer;
    public /* synthetic */ GameSettings gameSettings;
    public /* synthetic */ LoadingScreenRenderer loadingScreen;
    public static /* synthetic */ int debugFPS;
    public /* synthetic */ FontRenderer standardGalacticFontRenderer;
    public /* synthetic */ boolean skipRenderWorld;
    private /* synthetic */ String debugProfilerName;
    private /* synthetic */ boolean fullscreen;
    private /* synthetic */ int tempDisplayWidth;
    private /* synthetic */ int rightClickDelayTimer;
    /* synthetic */ long field_181543_z;
    private /* synthetic */ IntegratedServer theIntegratedServer;
    private /* synthetic */ BlockRendererDispatcher blockRenderDispatcher;
    public /* synthetic */ int displayHeight;
    /* synthetic */ long prevFrameTime;
    private static final /* synthetic */ List<DisplayMode> macDisplayModes;
    private /* synthetic */ Timer timer;
    public /* synthetic */ EffectRenderer effectRenderer;
    public /* synthetic */ boolean field_175613_B;
    public /* synthetic */ GuiAchievement guiAchievement;
    private /* synthetic */ int tempDisplayHeight;
    private /* synthetic */ PlayerUsageSnooper usageSnooper;
    private /* synthetic */ ItemRenderer itemRenderer;
    private final /* synthetic */ Proxy proxy;
    private /* synthetic */ boolean enableGLErrorChecking;
    private final /* synthetic */ boolean isDemo;
    public /* synthetic */ GuiScreen currentScreen;
    private final /* synthetic */ DefaultResourcePack mcDefaultResourcePack;
    public final /* synthetic */ File mcDataDir;
    private final /* synthetic */ PropertyMap field_181038_N;
    private static final /* synthetic */ Logger logger;
    private /* synthetic */ LanguageManager mcLanguageManager;
    public /* synthetic */ boolean field_175611_D;
    private /* synthetic */ CrashReport crashReporter;
    
    public FrameTimer func_181539_aj() {
        return this.field_181542_y;
    }
    
    public static Minecraft getMinecraft() {
        return Minecraft.theMinecraft;
    }
    
    public void func_181537_a(final boolean lllllllllllllIlIllIIlIlIIllllIll) {
        this.field_181541_X = lllllllllllllIlIllIIlIlIIllllIll;
    }
    
    public int getLimitFramerate() {
        int limitFramerate;
        if (lIlIlIlllIIlIll(this.theWorld) && lIlIlIlllIIllIl(this.currentScreen)) {
            limitFramerate = Minecraft.llllIllIllIll[41];
            "".length();
            if ((0x7E ^ 0x55 ^ (0x1B ^ 0x34)) < -" ".length()) {
                return (129 + 102 - 76 + 67 ^ 98 + 181 - 197 + 115) & (0x34 ^ 0x49 ^ (0x71 ^ 0x17) ^ -" ".length());
            }
        }
        else {
            limitFramerate = this.gameSettings.limitFramerate;
        }
        return limitFramerate;
    }
    
    public TextureMap getTextureMapBlocks() {
        return this.textureMapBlocks;
    }
    
    private static boolean lIlIlIlllIllIII(final int lllllllllllllIlIllIIlIlIIIIlllIl) {
        return lllllllllllllIlIllIIlIlIIIIlllIl < 0;
    }
    
    public void runTick() throws IOException {
        if (lIlIlIlllIIllII(this.rightClickDelayTimer)) {
            this.rightClickDelayTimer -= Minecraft.llllIllIllIll[1];
        }
        this.mcProfiler.startSection(Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[123]]);
        if (lIlIlIlllIIllll(this.isGamePaused ? 1 : 0)) {
            this.ingameGUI.updateTick();
        }
        this.mcProfiler.endSection();
        this.entityRenderer.getMouseOver(1.0f);
        this.mcProfiler.startSection(Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[124]]);
        if (lIlIlIlllIIllll(this.isGamePaused ? 1 : 0) && lIlIlIlllIIllIl(this.theWorld)) {
            this.playerController.updateController();
        }
        this.mcProfiler.endStartSection(Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[125]]);
        if (lIlIlIlllIIllll(this.isGamePaused ? 1 : 0)) {
            this.renderEngine.tick();
        }
        if (lIlIlIlllIIlIll(this.currentScreen) && lIlIlIlllIIllIl(this.thePlayer)) {
            if (lIlIlIlllIlIlII(lIlIlIlllIlllII(this.thePlayer.getHealth(), 0.0f))) {
                this.displayGuiScreen(null);
                "".length();
                if ((35 + 65 + 10 + 50 ^ 139 + 103 - 164 + 87) == 0x0) {
                    return;
                }
            }
            else if (lIlIlIlllIIlllI(this.thePlayer.isPlayerSleeping() ? 1 : 0) && lIlIlIlllIIllIl(this.theWorld)) {
                this.displayGuiScreen(new GuiSleepMP());
                "".length();
                if (((0x75 ^ 0x3A ^ (0x7 ^ 0x5C)) & (155 + 10 - 87 + 89 ^ 164 + 145 - 189 + 59 ^ -" ".length())) != 0x0) {
                    return;
                }
            }
        }
        else if (lIlIlIlllIIllIl(this.currentScreen) && lIlIlIlllIIlllI((this.currentScreen instanceof GuiSleepMP) ? 1 : 0) && lIlIlIlllIIllll(this.thePlayer.isPlayerSleeping() ? 1 : 0)) {
            this.displayGuiScreen(null);
        }
        if (lIlIlIlllIIllIl(this.currentScreen)) {
            this.leftClickCounter = Minecraft.llllIllIllIll[119];
        }
        if (lIlIlIlllIIllIl(this.currentScreen)) {
            try {
                this.currentScreen.handleInput();
                "".length();
                if (((0xA1 ^ 0xC4 ^ (0xE0 ^ 0xAA)) & (0xA5 ^ 0xB1 ^ (0xB ^ 0x30) ^ -" ".length())) > 0) {
                    return;
                }
            }
            catch (Throwable lllllllllllllIlIllIIlIllllIllIlI) {
                final CrashReport lllllllllllllIlIllIIlIllllIllIIl = CrashReport.makeCrashReport(lllllllllllllIlIllIIlIllllIllIlI, Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[126]]);
                final CrashReportCategory lllllllllllllIlIllIIlIllllIllIII = lllllllllllllIlIllIIlIllllIllIIl.makeCategory(Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[127]]);
                lllllllllllllIlIllIIlIllllIllIII.addCrashSectionCallable(Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[128]], new Callable<String>() {
                    @Override
                    public String call() throws Exception {
                        return Minecraft.this.currentScreen.getClass().getCanonicalName();
                    }
                });
                throw new ReportedException(lllllllllllllIlIllIIlIllllIllIIl);
            }
            if (lIlIlIlllIIllIl(this.currentScreen)) {
                try {
                    this.currentScreen.updateScreen();
                    "".length();
                    if (null != null) {
                        return;
                    }
                }
                catch (Throwable lllllllllllllIlIllIIlIllllIlIlll) {
                    final CrashReport lllllllllllllIlIllIIlIllllIlIllI = CrashReport.makeCrashReport(lllllllllllllIlIllIIlIllllIlIlll, Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[129]]);
                    final CrashReportCategory lllllllllllllIlIllIIlIllllIlIlIl = lllllllllllllIlIllIIlIllllIlIllI.makeCategory(Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[130]]);
                    lllllllllllllIlIllIIlIllllIlIlIl.addCrashSectionCallable(Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[131]], new Callable<String>() {
                        @Override
                        public String call() throws Exception {
                            return Minecraft.this.currentScreen.getClass().getCanonicalName();
                        }
                    });
                    throw new ReportedException(lllllllllllllIlIllIIlIllllIlIllI);
                }
            }
        }
        if (!lIlIlIlllIIllIl(this.currentScreen) || lIlIlIlllIIlllI(this.currentScreen.allowUserInput ? 1 : 0)) {
            this.mcProfiler.endStartSection(Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[132]]);
            "".length();
            if (((0x32 ^ 0x1F) & ~(0x54 ^ 0x79)) != 0x0) {
                return;
            }
            while (!lIlIlIlllIIllll(Mouse.next() ? 1 : 0)) {
                final int lllllllllllllIlIllIIlIllllIlIlII = Mouse.getEventButton();
                KeyBinding.setKeyBindState(lllllllllllllIlIllIIlIllllIlIlII - Minecraft.llllIllIllIll[120], Mouse.getEventButtonState());
                if (lIlIlIlllIIlllI(Mouse.getEventButtonState() ? 1 : 0)) {
                    if (lIlIlIlllIIlllI(this.thePlayer.isSpectator() ? 1 : 0) && lIlIlIlllIlIIlI(lllllllllllllIlIllIIlIllllIlIlII, Minecraft.llllIllIllIll[3])) {
                        this.ingameGUI.getSpectatorGui().func_175261_b();
                        "".length();
                        if (-" ".length() < -" ".length()) {
                            return;
                        }
                    }
                    else {
                        KeyBinding.onTick(lllllllllllllIlIllIIlIllllIlIlII - Minecraft.llllIllIllIll[120]);
                    }
                }
                final long lllllllllllllIlIllIIlIllllIlIIll = getSystemTime() - this.systemTime;
                if (lIlIlIlllIlIlII(lIlIlIlllIlllIl(lllllllllllllIlIllIIlIllllIlIIll, 200L))) {
                    int lllllllllllllIlIllIIlIllllIlIIlI = Mouse.getEventDWheel();
                    if (lIlIlIlllIIlllI(lllllllllllllIlIllIIlIllllIlIIlI)) {
                        if (lIlIlIlllIIlllI(this.thePlayer.isSpectator() ? 1 : 0)) {
                            int n;
                            if (lIlIlIlllIllIII(lllllllllllllIlIllIIlIllllIlIIlI)) {
                                n = Minecraft.llllIllIllIll[56];
                                "".length();
                                if (" ".length() < " ".length()) {
                                    return;
                                }
                            }
                            else {
                                n = Minecraft.llllIllIllIll[1];
                            }
                            lllllllllllllIlIllIIlIllllIlIIlI = n;
                            if (lIlIlIlllIIlllI(this.ingameGUI.getSpectatorGui().func_175262_a() ? 1 : 0)) {
                                this.ingameGUI.getSpectatorGui().func_175259_b(-lllllllllllllIlIllIIlIllllIlIIlI);
                                "".length();
                                if ((0xC ^ 0x3A ^ (0x3A ^ 0x8)) <= 0) {
                                    return;
                                }
                            }
                            else {
                                final float lllllllllllllIlIllIIlIllllIlIIIl = MathHelper.clamp_float(this.thePlayer.capabilities.getFlySpeed() + lllllllllllllIlIllIIlIllllIlIIlI * 0.005f, 0.0f, 0.2f);
                                this.thePlayer.capabilities.setFlySpeed(lllllllllllllIlIllIIlIllllIlIIIl);
                                "".length();
                                if (-(0x86 ^ 0xB8 ^ (0x8B ^ 0xB0)) >= 0) {
                                    return;
                                }
                            }
                        }
                        else {
                            this.thePlayer.inventory.changeCurrentItem(lllllllllllllIlIllIIlIllllIlIIlI);
                        }
                    }
                    if (lIlIlIlllIIlIll(this.currentScreen)) {
                        if (!lIlIlIlllIIllll(this.inGameHasFocus ? 1 : 0) || !lIlIlIlllIIlllI(Mouse.getEventButtonState() ? 1 : 0)) {
                            continue;
                        }
                        this.setIngameFocus();
                        "".length();
                        if (-(0x60 ^ 0x64) > 0) {
                            return;
                        }
                        continue;
                    }
                    else {
                        if (!lIlIlIlllIIllIl(this.currentScreen)) {
                            continue;
                        }
                        this.currentScreen.handleMouseInput();
                    }
                }
            }
            if (lIlIlIlllIIllII(this.leftClickCounter)) {
                this.leftClickCounter -= Minecraft.llllIllIllIll[1];
            }
            this.mcProfiler.endStartSection(Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[133]]);
            "".length();
            if (null != null) {
                return;
            }
            while (!lIlIlIlllIIllll(Keyboard.next() ? 1 : 0)) {
                int eventKey;
                if (lIlIlIlllIIllll(Keyboard.getEventKey())) {
                    eventKey = Keyboard.getEventCharacter() + Minecraft.llllIllIllIll[64];
                    "".length();
                    if ((0xE0 ^ 0x86 ^ (0x13 ^ 0x71)) < " ".length()) {
                        return;
                    }
                }
                else {
                    eventKey = Keyboard.getEventKey();
                }
                final int lllllllllllllIlIllIIlIllllIlIIII = eventKey;
                KeyBinding.setKeyBindState(lllllllllllllIlIllIIlIllllIlIIII, Keyboard.getEventKeyState());
                if (lIlIlIlllIIlllI(Keyboard.getEventKeyState() ? 1 : 0)) {
                    KeyBinding.onTick(lllllllllllllIlIllIIlIllllIlIIII);
                }
                final KeyEvent lllllllllllllIlIllIIlIllllIIllll = new KeyEvent(lllllllllllllIlIllIIlIllllIlIIII);
                lllllllllllllIlIllIIlIllllIIllll.call();
                "".length();
                if (lIlIlIlllIIlllI(lllllllllllllIlIllIIlIllllIIllll.isCancelled() ? 1 : 0)) {
                    return;
                }
                if (lIlIlIlllIIllII(lIlIlIlllIlllIl(this.debugCrashKeyPressTime, 0L))) {
                    if (lIlIlIlllIllIlI(lIlIlIlllIlllIl(getSystemTime() - this.debugCrashKeyPressTime, 6000L))) {
                        throw new ReportedException(new CrashReport(Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[134]], new Throwable()));
                    }
                    if (!lIlIlIlllIIlllI(Keyboard.isKeyDown(Minecraft.llllIllIllIll[58]) ? 1 : 0) || lIlIlIlllIIllll(Keyboard.isKeyDown(Minecraft.llllIllIllIll[77]) ? 1 : 0)) {
                        this.debugCrashKeyPressTime = -1L;
                        "".length();
                        if ((150 + 175 - 272 + 123 ^ 24 + 118 + 2 + 36) == "   ".length()) {
                            return;
                        }
                    }
                }
                else if (lIlIlIlllIIlllI(Keyboard.isKeyDown(Minecraft.llllIllIllIll[58]) ? 1 : 0) && lIlIlIlllIIlllI(Keyboard.isKeyDown(Minecraft.llllIllIllIll[77]) ? 1 : 0)) {
                    this.debugCrashKeyPressTime = getSystemTime();
                }
                this.dispatchKeypresses();
                if (!lIlIlIlllIIlllI(Keyboard.getEventKeyState() ? 1 : 0)) {
                    continue;
                }
                if (lIlIlIlllIlIIlI(lllllllllllllIlIllIIlIllllIlIIII, Minecraft.llllIllIllIll[78]) && lIlIlIlllIIllIl(this.entityRenderer)) {
                    this.entityRenderer.switchUseShader();
                }
                if (lIlIlIlllIIllIl(this.currentScreen)) {
                    this.currentScreen.handleKeyboardInput();
                    "".length();
                    if (((0x65 ^ 0x7D) & ~(0x25 ^ 0x3D)) > " ".length()) {
                        return;
                    }
                }
                else {
                    if (lIlIlIlllIlIIlI(lllllllllllllIlIllIIlIllllIlIIII, Minecraft.llllIllIllIll[1])) {
                        this.displayInGameMenu();
                    }
                    if (lIlIlIlllIlIIlI(lllllllllllllIlIllIIlIllllIlIIII, Minecraft.llllIllIllIll[43]) && lIlIlIlllIIlllI(Keyboard.isKeyDown(Minecraft.llllIllIllIll[77]) ? 1 : 0) && lIlIlIlllIIllIl(this.ingameGUI)) {
                        this.ingameGUI.getChatGUI().clearChatMessages();
                    }
                    if (lIlIlIlllIlIIlI(lllllllllllllIlIllIIlIllllIlIIII, Minecraft.llllIllIllIll[42]) && lIlIlIlllIIlllI(Keyboard.isKeyDown(Minecraft.llllIllIllIll[77]) ? 1 : 0)) {
                        this.refreshResources();
                    }
                    if (!lIlIlIlllIlIIlI(lllllllllllllIlIllIIlIllllIlIIII, Minecraft.llllIllIllIll[22]) || lIlIlIlllIIlllI(Keyboard.isKeyDown(Minecraft.llllIllIllIll[77]) ? 1 : 0)) {}
                    if (!lIlIlIlllIlIIlI(lllllllllllllIlIllIIlIllllIlIIII, Minecraft.llllIllIllIll[23]) || lIlIlIlllIIlllI(Keyboard.isKeyDown(Minecraft.llllIllIllIll[77]) ? 1 : 0)) {}
                    if (!lIlIlIlllIlIIlI(lllllllllllllIlIllIIlIllllIlIIII, Minecraft.llllIllIllIll[60]) || lIlIlIlllIIlllI(Keyboard.isKeyDown(Minecraft.llllIllIllIll[77]) ? 1 : 0)) {}
                    if (!lIlIlIlllIlIIlI(lllllllllllllIlIllIIlIllllIlIIII, Minecraft.llllIllIllIll[49]) || lIlIlIlllIIlllI(Keyboard.isKeyDown(Minecraft.llllIllIllIll[77]) ? 1 : 0)) {}
                    if (!lIlIlIlllIlIIlI(lllllllllllllIlIllIIlIllllIlIIII, Minecraft.llllIllIllIll[33]) || lIlIlIlllIIlllI(Keyboard.isKeyDown(Minecraft.llllIllIllIll[77]) ? 1 : 0)) {}
                    if (lIlIlIlllIlIIlI(lllllllllllllIlIllIIlIllllIlIIII, Minecraft.llllIllIllIll[31]) && lIlIlIlllIIlllI(Keyboard.isKeyDown(Minecraft.llllIllIllIll[77]) ? 1 : 0)) {
                        this.refreshResources();
                    }
                    if (lIlIlIlllIlIIlI(lllllllllllllIlIllIIlIllllIlIIII, Minecraft.llllIllIllIll[44]) && lIlIlIlllIIlllI(Keyboard.isKeyDown(Minecraft.llllIllIllIll[77]) ? 1 : 0)) {
                        final GameSettings gameSettings = this.gameSettings;
                        final GameSettings.Options render_DISTANCE = GameSettings.Options.RENDER_DISTANCE;
                        int llllllllllllIllIllIllllIlllIIlII;
                        if (lIlIlIlllIIlllI(GuiScreen.isShiftKeyDown() ? 1 : 0)) {
                            llllllllllllIllIllIllllIlllIIlII = Minecraft.llllIllIllIll[56];
                            "".length();
                            if (" ".length() == "  ".length()) {
                                return;
                            }
                        }
                        else {
                            llllllllllllIllIllIllllIlllIIlII = Minecraft.llllIllIllIll[1];
                        }
                        gameSettings.setOptionValue(render_DISTANCE, llllllllllllIllIllIllllIlllIIlII);
                    }
                    if (lIlIlIlllIlIIlI(lllllllllllllIlIllIIlIllllIlIIII, Minecraft.llllIllIllIll[41]) && lIlIlIlllIIlllI(Keyboard.isKeyDown(Minecraft.llllIllIllIll[77]) ? 1 : 0)) {
                        this.renderGlobal.loadRenderers();
                    }
                    if (lIlIlIlllIlIIlI(lllllllllllllIlIllIIlIllllIlIIII, Minecraft.llllIllIllIll[46]) && lIlIlIlllIIlllI(Keyboard.isKeyDown(Minecraft.llllIllIllIll[77]) ? 1 : 0)) {
                        final GameSettings gameSettings2 = this.gameSettings;
                        int advancedItemTooltips;
                        if (lIlIlIlllIIlllI(this.gameSettings.advancedItemTooltips ? 1 : 0)) {
                            advancedItemTooltips = Minecraft.llllIllIllIll[0];
                            "".length();
                            if (null != null) {
                                return;
                            }
                        }
                        else {
                            advancedItemTooltips = Minecraft.llllIllIllIll[1];
                        }
                        gameSettings2.advancedItemTooltips = (advancedItemTooltips != 0);
                        this.gameSettings.saveOptions();
                    }
                    if (lIlIlIlllIlIIlI(lllllllllllllIlIllIIlIllllIlIIII, Minecraft.llllIllIllIll[62]) && lIlIlIlllIIlllI(Keyboard.isKeyDown(Minecraft.llllIllIllIll[77]) ? 1 : 0)) {
                        final RenderManager renderManager = this.renderManager;
                        int debugBoundingBox;
                        if (lIlIlIlllIIlllI(this.renderManager.isDebugBoundingBox() ? 1 : 0)) {
                            debugBoundingBox = Minecraft.llllIllIllIll[0];
                            "".length();
                            if (-" ".length() != -" ".length()) {
                                return;
                            }
                        }
                        else {
                            debugBoundingBox = Minecraft.llllIllIllIll[1];
                        }
                        renderManager.setDebugBoundingBox((boolean)(debugBoundingBox != 0));
                    }
                    if (lIlIlIlllIlIIlI(lllllllllllllIlIllIIlIllllIlIIII, Minecraft.llllIllIllIll[36]) && lIlIlIlllIIlllI(Keyboard.isKeyDown(Minecraft.llllIllIllIll[77]) ? 1 : 0)) {
                        final GameSettings gameSettings3 = this.gameSettings;
                        int pauseOnLostFocus;
                        if (lIlIlIlllIIlllI(this.gameSettings.pauseOnLostFocus ? 1 : 0)) {
                            pauseOnLostFocus = Minecraft.llllIllIllIll[0];
                            "".length();
                            if ((0x30 ^ 0x6E ^ (0x72 ^ 0x28)) <= "  ".length()) {
                                return;
                            }
                        }
                        else {
                            pauseOnLostFocus = Minecraft.llllIllIllIll[1];
                        }
                        gameSettings3.pauseOnLostFocus = (pauseOnLostFocus != 0);
                        this.gameSettings.saveOptions();
                    }
                    if (lIlIlIlllIlIIlI(lllllllllllllIlIllIIlIllllIlIIII, Minecraft.llllIllIllIll[74])) {
                        final GameSettings gameSettings4 = this.gameSettings;
                        int hideGUI;
                        if (lIlIlIlllIIlllI(this.gameSettings.hideGUI ? 1 : 0)) {
                            hideGUI = Minecraft.llllIllIllIll[0];
                            "".length();
                            if (-" ".length() == (0x52 ^ 0x56)) {
                                return;
                            }
                        }
                        else {
                            hideGUI = Minecraft.llllIllIllIll[1];
                        }
                        gameSettings4.hideGUI = (hideGUI != 0);
                    }
                    if (lIlIlIlllIlIIlI(lllllllllllllIlIllIIlIllllIlIIII, Minecraft.llllIllIllIll[77])) {
                        final GameSettings gameSettings5 = this.gameSettings;
                        int showDebugInfo;
                        if (lIlIlIlllIIlllI(this.gameSettings.showDebugInfo ? 1 : 0)) {
                            showDebugInfo = Minecraft.llllIllIllIll[0];
                            "".length();
                            if ((0x56 ^ 0x3A ^ (0x51 ^ 0x38)) == 0x0) {
                                return;
                            }
                        }
                        else {
                            showDebugInfo = Minecraft.llllIllIllIll[1];
                        }
                        gameSettings5.showDebugInfo = (showDebugInfo != 0);
                        this.gameSettings.showDebugProfilerChart = GuiScreen.isShiftKeyDown();
                        this.gameSettings.field_181657_aC = GuiScreen.isAltKeyDown();
                    }
                    if (lIlIlIlllIIlllI(this.gameSettings.keyBindTogglePerspective.isPressed() ? 1 : 0)) {
                        final GameSettings gameSettings6 = this.gameSettings;
                        gameSettings6.thirdPersonView += Minecraft.llllIllIllIll[1];
                        if (lIlIlIlllIllllI(this.gameSettings.thirdPersonView, Minecraft.llllIllIllIll[3])) {
                            this.gameSettings.thirdPersonView = Minecraft.llllIllIllIll[0];
                        }
                        if (lIlIlIlllIIllll(this.gameSettings.thirdPersonView)) {
                            this.entityRenderer.loadEntityShader(this.getRenderViewEntity());
                            "".length();
                            if ((" ".length() & (" ".length() ^ -" ".length())) > 0) {
                                return;
                            }
                        }
                        else if (lIlIlIlllIlIIlI(this.gameSettings.thirdPersonView, Minecraft.llllIllIllIll[1])) {
                            this.entityRenderer.loadEntityShader(null);
                        }
                        this.renderGlobal.setDisplayListEntitiesDirty();
                    }
                    if (lIlIlIlllIIlllI(this.gameSettings.keyBindSmoothCamera.isPressed() ? 1 : 0)) {
                        final GameSettings gameSettings7 = this.gameSettings;
                        int smoothCamera;
                        if (lIlIlIlllIIlllI(this.gameSettings.smoothCamera ? 1 : 0)) {
                            smoothCamera = Minecraft.llllIllIllIll[0];
                            "".length();
                            if (((89 + 1 + 18 + 21 ^ 31 + 37 + 73 + 21) & (0x57 ^ 0x4D ^ (0x73 ^ 0x4A) ^ -" ".length())) < 0) {
                                return;
                            }
                        }
                        else {
                            smoothCamera = Minecraft.llllIllIllIll[1];
                        }
                        gameSettings7.smoothCamera = (smoothCamera != 0);
                    }
                }
                if (!lIlIlIlllIIlllI(this.gameSettings.showDebugInfo ? 1 : 0) || !lIlIlIlllIIlllI(this.gameSettings.showDebugProfilerChart ? 1 : 0)) {
                    continue;
                }
                if (lIlIlIlllIlIIlI(lllllllllllllIlIllIIlIllllIlIIII, Minecraft.llllIllIllIll[16])) {
                    this.updateDebugProfilerName(Minecraft.llllIllIllIll[0]);
                }
                int lllllllllllllIlIllIIlIllllIIlllI = Minecraft.llllIllIllIll[0];
                "".length();
                if (((0x8B ^ 0x98) & ~(0x81 ^ 0x92)) != 0x0) {
                    return;
                }
                while (!lIlIlIlllIlIIIl(lllllllllllllIlIllIIlIllllIIlllI, Minecraft.llllIllIllIll[14])) {
                    if (lIlIlIlllIlIIlI(lllllllllllllIlIllIIlIllllIlIIII, Minecraft.llllIllIllIll[3] + lllllllllllllIlIllIIlIllllIIlllI)) {
                        this.updateDebugProfilerName(lllllllllllllIlIllIIlIllllIIlllI + Minecraft.llllIllIllIll[1]);
                    }
                    ++lllllllllllllIlIllIIlIllllIIlllI;
                }
            }
            int lllllllllllllIlIllIIlIllllIIllIl = Minecraft.llllIllIllIll[0];
            "".length();
            if (((0x57 ^ 0x40 ^ (0xE5 ^ 0xB9)) & (0x19 ^ 0x44 ^ (0x38 ^ 0x2E) ^ -" ".length())) >= "  ".length()) {
                return;
            }
            while (!lIlIlIlllIlIIIl(lllllllllllllIlIllIIlIllllIIllIl, Minecraft.llllIllIllIll[14])) {
                if (lIlIlIlllIIlllI(this.gameSettings.keyBindsHotbar[lllllllllllllIlIllIIlIllllIIllIl].isPressed() ? 1 : 0)) {
                    if (lIlIlIlllIIlllI(this.thePlayer.isSpectator() ? 1 : 0)) {
                        this.ingameGUI.getSpectatorGui().func_175260_a(lllllllllllllIlIllIIlIllllIIllIl);
                        "".length();
                        if (((0xCA ^ 0xA7 ^ (0x1 ^ 0x40)) & (0xA1 ^ 0xC2 ^ (0xD1 ^ 0x9E) ^ -" ".length())) != 0x0) {
                            return;
                        }
                    }
                    else {
                        this.thePlayer.inventory.currentItem = lllllllllllllIlIllIIlIllllIIllIl;
                    }
                }
                ++lllllllllllllIlIllIIlIllllIIllIl;
            }
            int n2;
            if (lIlIlIlllIlIIII(this.gameSettings.chatVisibility, EntityPlayer.EnumChatVisibility.HIDDEN)) {
                n2 = Minecraft.llllIllIllIll[1];
                "".length();
                if (null != null) {
                    return;
                }
            }
            else {
                n2 = Minecraft.llllIllIllIll[0];
            }
            final boolean lllllllllllllIlIllIIlIllllIIllII = n2 != 0;
            "".length();
            if ((0x9 ^ 0x62 ^ (0x45 ^ 0x2A)) < 0) {
                return;
            }
            while (!lIlIlIlllIIllll(this.gameSettings.keyBindInventory.isPressed() ? 1 : 0)) {
                if (lIlIlIlllIIlllI(this.playerController.isRidingHorse() ? 1 : 0)) {
                    this.thePlayer.sendHorseInventory();
                    "".length();
                    if ("  ".length() != "  ".length()) {
                        return;
                    }
                    continue;
                }
                else {
                    this.getNetHandler().addToSendQueue(new C16PacketClientStatus(C16PacketClientStatus.EnumState.OPEN_INVENTORY_ACHIEVEMENT));
                    this.displayGuiScreen(new GuiInventory(this.thePlayer));
                }
            }
            "".length();
            if (-"   ".length() > 0) {
                return;
            }
            while (!lIlIlIlllIIllll(this.gameSettings.keyBindDrop.isPressed() ? 1 : 0)) {
                if (lIlIlIlllIIllll(this.thePlayer.isSpectator() ? 1 : 0)) {
                    this.thePlayer.dropOneItem(GuiScreen.isCtrlKeyDown());
                    "".length();
                }
            }
            "".length();
            if ((0xE ^ 0xA) <= -" ".length()) {
                return;
            }
            while (lIlIlIlllIIlllI(this.gameSettings.keyBindChat.isPressed() ? 1 : 0) && !lIlIlIlllIIllll(lllllllllllllIlIllIIlIllllIIllII ? 1 : 0)) {
                this.displayGuiScreen(new GuiChat());
            }
            if (lIlIlIlllIIlIll(this.currentScreen) && lIlIlIlllIIlllI(this.gameSettings.keyBindCommand.isPressed() ? 1 : 0) && lIlIlIlllIIlllI(lllllllllllllIlIllIIlIllllIIllII ? 1 : 0)) {
                this.displayGuiScreen(new GuiChat(Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[135]]));
            }
            if (lIlIlIlllIIlllI(this.thePlayer.isUsingItem() ? 1 : 0)) {
                if (lIlIlIlllIIllll(this.gameSettings.keyBindUseItem.isKeyDown() ? 1 : 0)) {
                    this.playerController.onStoppedUsingItem(this.thePlayer);
                }
                while (!lIlIlIlllIIllll(this.gameSettings.keyBindAttack.isPressed() ? 1 : 0)) {}
                while (!lIlIlIlllIIllll(this.gameSettings.keyBindUseItem.isPressed() ? 1 : 0)) {}
                while (!lIlIlIlllIIllll(this.gameSettings.keyBindPickBlock.isPressed() ? 1 : 0)) {}
                "".length();
                if ((0x33 ^ 0x37) <= "  ".length()) {
                    return;
                }
            }
            else {
                while (!lIlIlIlllIIllll(this.gameSettings.keyBindAttack.isPressed() ? 1 : 0)) {
                    this.clickMouse();
                }
                "".length();
                if (((0x38 ^ 0x7F) & ~(0x9 ^ 0x4E)) >= "  ".length()) {
                    return;
                }
                while (!lIlIlIlllIIllll(this.gameSettings.keyBindUseItem.isPressed() ? 1 : 0)) {
                    this.rightClickMouse();
                }
                "".length();
                if ("   ".length() < " ".length()) {
                    return;
                }
                while (!lIlIlIlllIIllll(this.gameSettings.keyBindPickBlock.isPressed() ? 1 : 0)) {
                    this.middleClickMouse();
                }
            }
            if (lIlIlIlllIIlllI(this.gameSettings.keyBindUseItem.isKeyDown() ? 1 : 0) && lIlIlIlllIIllll(this.rightClickDelayTimer) && lIlIlIlllIIllll(this.thePlayer.isUsingItem() ? 1 : 0)) {
                this.rightClickMouse();
            }
            int lllllllllllllIlIllIIllIIIIIlIIIl;
            if (lIlIlIlllIIlIll(this.currentScreen) && lIlIlIlllIIlllI(this.gameSettings.keyBindAttack.isKeyDown() ? 1 : 0) && lIlIlIlllIIlllI(this.inGameHasFocus ? 1 : 0)) {
                lllllllllllllIlIllIIllIIIIIlIIIl = Minecraft.llllIllIllIll[1];
                "".length();
                if ((0x51 ^ 0x55) <= "   ".length()) {
                    return;
                }
            }
            else {
                lllllllllllllIlIllIIllIIIIIlIIIl = Minecraft.llllIllIllIll[0];
            }
            this.sendClickBlockToController((boolean)(lllllllllllllIlIllIIllIIIIIlIIIl != 0));
        }
        if (lIlIlIlllIIllIl(this.theWorld)) {
            if (lIlIlIlllIIllIl(this.thePlayer)) {
                this.joinPlayerCounter += Minecraft.llllIllIllIll[1];
                if (lIlIlIlllIlIIlI(this.joinPlayerCounter, Minecraft.llllIllIllIll[41])) {
                    this.joinPlayerCounter = Minecraft.llllIllIllIll[0];
                    this.theWorld.joinEntityInSurroundings(this.thePlayer);
                }
            }
            this.mcProfiler.endStartSection(Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[136]]);
            if (lIlIlIlllIIllll(this.isGamePaused ? 1 : 0)) {
                this.entityRenderer.updateRenderer();
            }
            this.mcProfiler.endStartSection(Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[137]]);
            if (lIlIlIlllIIllll(this.isGamePaused ? 1 : 0)) {
                this.renderGlobal.updateClouds();
            }
            this.mcProfiler.endStartSection(Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[138]]);
            if (lIlIlIlllIIllll(this.isGamePaused ? 1 : 0)) {
                if (lIlIlIlllIIllII(this.theWorld.getLastLightningBolt())) {
                    this.theWorld.setLastLightningBolt(this.theWorld.getLastLightningBolt() - Minecraft.llllIllIllIll[1]);
                }
                this.theWorld.updateEntities();
                "".length();
                if ("   ".length() == 0) {
                    return;
                }
            }
        }
        else if (lIlIlIlllIIlllI(this.entityRenderer.isShaderActive() ? 1 : 0)) {
            this.entityRenderer.func_181022_b();
        }
        if (lIlIlIlllIIllll(this.isGamePaused ? 1 : 0)) {
            this.mcMusicTicker.update();
            this.mcSoundHandler.update();
        }
        if (lIlIlIlllIIllIl(this.theWorld)) {
            if (lIlIlIlllIIllll(this.isGamePaused ? 1 : 0)) {
                final WorldClient theWorld = this.theWorld;
                int lllllllllllllIIIlIIllIIlllIlIIII;
                if (lIlIlIlllIlIIII(this.theWorld.getDifficulty(), EnumDifficulty.PEACEFUL)) {
                    lllllllllllllIIIlIIllIIlllIlIIII = Minecraft.llllIllIllIll[1];
                    "".length();
                    if (((0x65 ^ 0x7D) & ~(0x3E ^ 0x26)) != 0x0) {
                        return;
                    }
                }
                else {
                    lllllllllllllIIIlIIllIIlllIlIIII = Minecraft.llllIllIllIll[0];
                }
                theWorld.setAllowedSpawnTypes((boolean)(lllllllllllllIIIlIIllIIlllIlIIII != 0), (boolean)(Minecraft.llllIllIllIll[1] != 0));
                try {
                    this.theWorld.tick();
                    "".length();
                    if (-(0xAE ^ 0x93 ^ (0xAC ^ 0x95)) > 0) {
                        return;
                    }
                }
                catch (Throwable lllllllllllllIlIllIIlIllllIIlIll) {
                    final CrashReport lllllllllllllIlIllIIlIllllIIlIlI = CrashReport.makeCrashReport(lllllllllllllIlIllIIlIllllIIlIll, Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[139]]);
                    if (lIlIlIlllIIlIll(this.theWorld)) {
                        final CrashReportCategory lllllllllllllIlIllIIlIllllIIlIIl = lllllllllllllIlIllIIlIllllIIlIlI.makeCategory(Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[140]]);
                        lllllllllllllIlIllIIlIllllIIlIIl.addCrashSection(Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[141]], Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[142]]);
                        "".length();
                        if (-" ".length() >= 0) {
                            return;
                        }
                    }
                    else {
                        this.theWorld.addWorldInfoToCrashReport(lllllllllllllIlIllIIlIllllIIlIlI);
                        "".length();
                    }
                    throw new ReportedException(lllllllllllllIlIllIIlIllllIIlIlI);
                }
            }
            this.mcProfiler.endStartSection(Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[143]]);
            if (lIlIlIlllIIllll(this.isGamePaused ? 1 : 0) && lIlIlIlllIIllIl(this.theWorld)) {
                this.theWorld.doVoidFogParticles(MathHelper.floor_double(this.thePlayer.posX), MathHelper.floor_double(this.thePlayer.posY), MathHelper.floor_double(this.thePlayer.posZ));
            }
            this.mcProfiler.endStartSection(Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[144]]);
            if (lIlIlIlllIIllll(this.isGamePaused ? 1 : 0)) {
                this.effectRenderer.updateEffects();
                "".length();
                if (null != null) {
                    return;
                }
            }
        }
        else if (lIlIlIlllIIllIl(this.myNetworkManager)) {
            this.mcProfiler.endStartSection(Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[145]]);
            this.myNetworkManager.processReceivedPackets();
        }
        final ClientTick lllllllllllllIlIllIIlIllllIIlIII = new ClientTick();
        lllllllllllllIlIllIIlIllllIIlIII.call();
        "".length();
        this.mcProfiler.endSection();
        this.systemTime = getSystemTime();
    }
    
    private static int lIlIlIlllIlIllI(final long n, final long n2) {
        return lcmp(n, n2);
    }
    
    public void displayGuiScreen(GuiScreen lllllllllllllIlIllIIllIIlIlllIIl) {
        if (lIlIlIlllIIllIl(this.currentScreen)) {
            this.currentScreen.onGuiClosed();
        }
        if (lIlIlIlllIIlIll(lllllllllllllIlIllIIllIIlIlllIIl) && lIlIlIlllIIlIll(this.theWorld)) {
            lllllllllllllIlIllIIllIIlIlllIIl = new MainMenu();
            "".length();
            if (((0x60 ^ 0x1B ^ (0xD6 ^ 0xA8)) & (73 + 38 - 3 + 42 ^ 5 + 67 + 49 + 26 ^ -" ".length())) > 0) {
                return;
            }
        }
        else if (lIlIlIlllIIlIll(lllllllllllllIlIllIIllIIlIlllIIl) && lIlIlIlllIlIlII(lIlIlIlllIlIIll(this.thePlayer.getHealth(), 0.0f))) {
            lllllllllllllIlIllIIllIIlIlllIIl = new GuiGameOver();
        }
        if (lIlIlIlllIIlllI((lllllllllllllIlIllIIllIIlIlllIIl instanceof MainMenu) ? 1 : 0)) {
            this.gameSettings.showDebugInfo = (Minecraft.llllIllIllIll[0] != 0);
            this.ingameGUI.getChatGUI().clearChatMessages();
        }
        this.currentScreen = lllllllllllllIlIllIIllIIlIlllIIl;
        if (lIlIlIlllIIllIl(lllllllllllllIlIllIIllIIlIlllIIl)) {
            this.setIngameNotInFocus();
            final ScaledResolution lllllllllllllIlIllIIllIIlIllllIl = new ScaledResolution(this);
            final int lllllllllllllIlIllIIllIIlIllllII = lllllllllllllIlIllIIllIIlIllllIl.getScaledWidth();
            final int lllllllllllllIlIllIIllIIlIlllIll = lllllllllllllIlIllIIllIIlIllllIl.getScaledHeight();
            lllllllllllllIlIllIIllIIlIlllIIl.setWorldAndResolution(this, lllllllllllllIlIllIIllIIlIllllII, lllllllllllllIlIllIIllIIlIlllIll);
            this.skipRenderWorld = (Minecraft.llllIllIllIll[0] != 0);
            "".length();
            if ("  ".length() >= "   ".length()) {
                return;
            }
        }
        else {
            this.mcSoundHandler.resumeSounds();
            this.setIngameFocus();
        }
    }
    
    private void drawSplashScreen(final TextureManager lllllllllllllIlIllIIllIlIIIIIIll) throws LWJGLException {
        final ScaledResolution lllllllllllllIlIllIIllIlIIIIIIlI = new ScaledResolution(this);
        final int lllllllllllllIlIllIIllIlIIIIIIIl = lllllllllllllIlIllIIllIlIIIIIIlI.getScaleFactor();
        final Framebuffer lllllllllllllIlIllIIllIlIIIIIIII = new Framebuffer(lllllllllllllIlIllIIllIlIIIIIIlI.getScaledWidth() * lllllllllllllIlIllIIllIlIIIIIIIl, lllllllllllllIlIllIIllIlIIIIIIlI.getScaledHeight() * lllllllllllllIlIllIIllIlIIIIIIIl, (boolean)(Minecraft.llllIllIllIll[1] != 0));
        lllllllllllllIlIllIIllIlIIIIIIII.bindFramebuffer((boolean)(Minecraft.llllIllIllIll[0] != 0));
        GlStateManager.matrixMode(Minecraft.llllIllIllIll[28]);
        GlStateManager.loadIdentity();
        GlStateManager.ortho(0.0, lllllllllllllIlIllIIllIlIIIIIIlI.getScaledWidth(), lllllllllllllIlIllIIllIlIIIIIIlI.getScaledHeight(), 0.0, 1000.0, 3000.0);
        GlStateManager.matrixMode(Minecraft.llllIllIllIll[29]);
        GlStateManager.loadIdentity();
        GlStateManager.translate(0.0f, 0.0f, -2000.0f);
        GlStateManager.disableLighting();
        GlStateManager.disableFog();
        GlStateManager.disableDepth();
        GlStateManager.enableTexture2D();
        InputStream lllllllllllllIlIllIIllIIllllllll = null;
        Label_0268: {
            try {
                lllllllllllllIlIllIIllIIllllllll = this.mcDefaultResourcePack.getInputStream(Minecraft.locationMojangPng);
                this.mojangLogo = lllllllllllllIlIllIIllIlIIIIIIll.getDynamicTextureLocation(Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[62]], new DynamicTexture(ImageIO.read(lllllllllllllIlIllIIllIIllllllll)));
                lllllllllllllIlIllIIllIlIIIIIIll.bindTexture(this.mojangLogo);
                "".length();
                if (-"  ".length() >= 0) {
                    return;
                }
            }
            catch (IOException lllllllllllllIlIllIIllIIlllllllI) {
                Minecraft.logger.error(String.valueOf(new StringBuilder(Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[63]]).append(Minecraft.locationMojangPng)), (Throwable)lllllllllllllIlIllIIllIIlllllllI);
                IOUtils.closeQuietly(lllllllllllllIlIllIIllIIllllllll);
                "".length();
                if (((0xF ^ 0x9) & ~(0x1E ^ 0x18)) != 0x0) {
                    return;
                }
                break Label_0268;
            }
            finally {
                IOUtils.closeQuietly(lllllllllllllIlIllIIllIIllllllll);
            }
            IOUtils.closeQuietly(lllllllllllllIlIllIIllIIllllllll);
        }
        final Tessellator lllllllllllllIlIllIIllIIllllllIl = Tessellator.getInstance();
        final WorldRenderer lllllllllllllIlIllIIllIIllllllII = lllllllllllllIlIllIIllIIllllllIl.getWorldRenderer();
        lllllllllllllIlIllIIllIIllllllII.begin(Minecraft.llllIllIllIll[12], DefaultVertexFormats.POSITION_TEX_COLOR);
        lllllllllllllIlIllIIllIIllllllII.pos(0.0, this.displayHeight, 0.0).tex(0.0, 0.0).color(Minecraft.llllIllIllIll[61], Minecraft.llllIllIllIll[61], Minecraft.llllIllIllIll[61], Minecraft.llllIllIllIll[61]).endVertex();
        lllllllllllllIlIllIIllIIllllllII.pos(this.displayWidth, this.displayHeight, 0.0).tex(0.0, 0.0).color(Minecraft.llllIllIllIll[61], Minecraft.llllIllIllIll[61], Minecraft.llllIllIllIll[61], Minecraft.llllIllIllIll[61]).endVertex();
        lllllllllllllIlIllIIllIIllllllII.pos(this.displayWidth, 0.0, 0.0).tex(0.0, 0.0).color(Minecraft.llllIllIllIll[61], Minecraft.llllIllIllIll[61], Minecraft.llllIllIllIll[61], Minecraft.llllIllIllIll[61]).endVertex();
        lllllllllllllIlIllIIllIIllllllII.pos(0.0, 0.0, 0.0).tex(0.0, 0.0).color(Minecraft.llllIllIllIll[61], Minecraft.llllIllIllIll[61], Minecraft.llllIllIllIll[61], Minecraft.llllIllIllIll[61]).endVertex();
        lllllllllllllIlIllIIllIIllllllIl.draw();
        GlStateManager.color(1.0f, 1.0f, 1.0f, 1.0f);
        final int lllllllllllllIlIllIIllIIlllllIll = Minecraft.llllIllIllIll[64];
        final int lllllllllllllIlIllIIllIIlllllIlI = Minecraft.llllIllIllIll[64];
        this.func_181536_a((lllllllllllllIlIllIIllIlIIIIIIlI.getScaledWidth() - lllllllllllllIlIllIIllIIlllllIll) / Minecraft.llllIllIllIll[3], (lllllllllllllIlIllIIllIlIIIIIIlI.getScaledHeight() - lllllllllllllIlIllIIllIIlllllIlI) / Minecraft.llllIllIllIll[3], Minecraft.llllIllIllIll[0], Minecraft.llllIllIllIll[0], lllllllllllllIlIllIIllIIlllllIll, lllllllllllllIlIllIIllIIlllllIlI, Minecraft.llllIllIllIll[61], Minecraft.llllIllIllIll[61], Minecraft.llllIllIllIll[61], Minecraft.llllIllIllIll[61]);
        GlStateManager.disableLighting();
        GlStateManager.disableFog();
        lllllllllllllIlIllIIllIlIIIIIIII.unbindFramebuffer();
        lllllllllllllIlIllIIllIlIIIIIIII.framebufferRender(lllllllllllllIlIllIIllIlIIIIIIlI.getScaledWidth() * lllllllllllllIlIllIIllIlIIIIIIIl, lllllllllllllIlIllIIllIlIIIIIIlI.getScaledHeight() * lllllllllllllIlIllIIllIlIIIIIIIl);
        GlStateManager.enableAlpha();
        GlStateManager.alphaFunc(Minecraft.llllIllIllIll[26], 0.1f);
        this.updateDisplay();
    }
    
    private String func_181538_aA() {
        String s;
        if (lIlIlIlllIIllIl(this.theIntegratedServer)) {
            if (lIlIlIlllIIlllI(this.theIntegratedServer.getPublic() ? 1 : 0)) {
                s = Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[186]];
                "".length();
                if (-" ".length() != -" ".length()) {
                    return null;
                }
            }
            else {
                s = Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[187]];
                "".length();
                if ("  ".length() > (0x5E ^ 0x5A)) {
                    return null;
                }
            }
        }
        else if (lIlIlIlllIIllIl(this.currentServerData)) {
            if (lIlIlIlllIIlllI(this.currentServerData.func_181041_d() ? 1 : 0)) {
                s = Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[188]];
                "".length();
                if ((0x98 ^ 0x9C) == 0x0) {
                    return null;
                }
            }
            else {
                s = Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[189]];
                "".length();
                if (null != null) {
                    return null;
                }
            }
        }
        else {
            s = Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[190]];
        }
        return s;
    }
    
    public static boolean isFancyGraphicsEnabled() {
        if (lIlIlIlllIIllIl(Minecraft.theMinecraft) && lIlIlIlllIIlllI(Minecraft.theMinecraft.gameSettings.fancyGraphics ? 1 : 0)) {
            return Minecraft.llllIllIllIll[1] != 0;
        }
        return Minecraft.llllIllIllIll[0] != 0;
    }
    
    public MusicTicker.MusicType getAmbientMusicType() {
        MusicTicker.MusicType musicType;
        if (lIlIlIlllIIllIl(this.thePlayer)) {
            if (lIlIlIlllIIlllI((this.thePlayer.worldObj.provider instanceof WorldProviderHell) ? 1 : 0)) {
                musicType = MusicTicker.MusicType.NETHER;
                "".length();
                if (null != null) {
                    return null;
                }
            }
            else if (lIlIlIlllIIlllI((this.thePlayer.worldObj.provider instanceof WorldProviderEnd) ? 1 : 0)) {
                if (lIlIlIlllIIllIl(BossStatus.bossName) && lIlIlIlllIIllII(BossStatus.statusBarTime)) {
                    musicType = MusicTicker.MusicType.END_BOSS;
                    "".length();
                    if ("   ".length() != "   ".length()) {
                        return null;
                    }
                }
                else {
                    musicType = MusicTicker.MusicType.END;
                    "".length();
                    if (-"  ".length() > 0) {
                        return null;
                    }
                }
            }
            else if (lIlIlIlllIIlllI(this.thePlayer.capabilities.isCreativeMode ? 1 : 0) && lIlIlIlllIIlllI(this.thePlayer.capabilities.allowFlying ? 1 : 0)) {
                musicType = MusicTicker.MusicType.CREATIVE;
                "".length();
                if (-" ".length() >= "   ".length()) {
                    return null;
                }
            }
            else {
                musicType = MusicTicker.MusicType.GAME;
                "".length();
                if (" ".length() < 0) {
                    return null;
                }
            }
        }
        else {
            musicType = MusicTicker.MusicType.MENU;
        }
        return musicType;
    }
    
    public LanguageManager getLanguageManager() {
        return this.mcLanguageManager;
    }
    
    public void setIngameNotInFocus() {
        if (lIlIlIlllIIlllI(this.inGameHasFocus ? 1 : 0)) {
            KeyBinding.unPressAllKeys();
            this.inGameHasFocus = (Minecraft.llllIllIllIll[0] != 0);
            this.mouseHelper.ungrabMouseCursor();
        }
    }
    
    public void setRenderViewEntity(final Entity lllllllllllllIlIllIIlIlIlIlIllIl) {
        this.renderViewEntity = lllllllllllllIlIllIIlIlIlIlIllIl;
        this.entityRenderer.loadEntityShader(lllllllllllllIlIllIIlIlIlIlIllIl);
    }
    
    private static boolean lIlIlIlllIlIlII(final int lllllllllllllIlIllIIlIlIIIIllIll) {
        return lllllllllllllIlIllIIlIlIIIIllIll <= 0;
    }
    
    public IResourceManager getResourceManager() {
        return this.mcResourceManager;
    }
    
    public static void stopIntegratedServer() {
        if (lIlIlIlllIIllIl(Minecraft.theMinecraft)) {
            final IntegratedServer lllllllllllllIlIllIIlIlIllllIlII = Minecraft.theMinecraft.getIntegratedServer();
            if (lIlIlIlllIIllIl(lllllllllllllIlIllIIlIlIllllIlII)) {
                lllllllllllllIlIllIIlIlIllllIlII.stopServer();
            }
        }
    }
    
    private static int lIlIlIlllIlllIl(final long n, final long n2) {
        return lcmp(n, n2);
    }
    
    public void setIngameFocus() {
        if (lIlIlIlllIIlllI(Display.isActive() ? 1 : 0) && lIlIlIlllIIllll(this.inGameHasFocus ? 1 : 0)) {
            this.inGameHasFocus = (Minecraft.llllIllIllIll[1] != 0);
            this.mouseHelper.grabMouseCursor();
            this.displayGuiScreen(null);
            this.leftClickCounter = Minecraft.llllIllIllIll[119];
        }
    }
    
    private static boolean lIlIlIlllIllIll(final int lllllllllllllIlIllIIlIlIIIllIllI, final int lllllllllllllIlIllIIlIlIIIllIlIl) {
        return lllllllllllllIlIllIIlIlIIIllIllI < lllllllllllllIlIllIIlIlIIIllIlIl;
    }
    
    private static String lIlIlIlIllIIIlI(final String lllllllllllllIlIllIIlIlIIlIllllI, final String lllllllllllllIlIllIIlIlIIlIlllIl) {
        try {
            final SecretKeySpec lllllllllllllIlIllIIlIlIIllIIIIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIlIllIIlIlIIlIlllIl.getBytes(StandardCharsets.UTF_8)), Minecraft.llllIllIllIll[13]), "DES");
            final Cipher lllllllllllllIlIllIIlIlIIllIIIII = Cipher.getInstance("DES");
            lllllllllllllIlIllIIlIlIIllIIIII.init(Minecraft.llllIllIllIll[3], lllllllllllllIlIllIIlIlIIllIIIIl);
            return new String(lllllllllllllIlIllIIlIlIIllIIIII.doFinal(Base64.getDecoder().decode(lllllllllllllIlIllIIlIlIIlIllllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIlIllIIlIlIIlIlllll) {
            lllllllllllllIlIllIIlIlIIlIlllll.printStackTrace();
            return null;
        }
    }
    
    private void startGame() throws LWJGLException, IOException {
        this.gameSettings = new GameSettings(this, this.mcDataDir);
        this.defaultResourcePacks.add(this.mcDefaultResourcePack);
        "".length();
        this.startTimerHackThread();
        if (lIlIlIlllIIllII(this.gameSettings.overrideHeight) && lIlIlIlllIIllII(this.gameSettings.overrideWidth)) {
            this.displayWidth = this.gameSettings.overrideWidth;
            this.displayHeight = this.gameSettings.overrideHeight;
        }
        Minecraft.logger.info(String.valueOf(new StringBuilder(Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[17]]).append(Sys.getVersion())));
        this.setWindowIcon();
        this.setInitialDisplayMode();
        this.createDisplay();
        OpenGlHelper.initializeTextures();
        this.framebufferMc = new Framebuffer(this.displayWidth, this.displayHeight, (boolean)(Minecraft.llllIllIllIll[1] != 0));
        this.framebufferMc.setFramebufferColor(0.0f, 0.0f, 0.0f, 0.0f);
        this.registerMetadataSerializers();
        this.mcResourcePackRepository = new ResourcePackRepository(this.fileResourcepacks, new File(this.mcDataDir, Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[18]]), this.mcDefaultResourcePack, this.metadataSerializer_, this.gameSettings);
        this.mcResourceManager = new SimpleReloadableResourceManager(this.metadataSerializer_);
        this.mcLanguageManager = new LanguageManager(this.metadataSerializer_, this.gameSettings.language);
        this.mcResourceManager.registerReloadListener(this.mcLanguageManager);
        this.refreshResources();
        this.renderEngine = new TextureManager(this.mcResourceManager);
        this.mcResourceManager.registerReloadListener(this.renderEngine);
        SplashProgress.drawSplash(this.getTextureManager());
        this.initStream();
        this.skinManager = new SkinManager(this.renderEngine, new File(this.fileAssets, Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[19]]), this.sessionService);
        this.saveLoader = new AnvilSaveConverter(new File(this.mcDataDir, Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[20]]));
        this.mcSoundHandler = new SoundHandler(this.mcResourceManager, this.gameSettings);
        this.mcResourceManager.registerReloadListener(this.mcSoundHandler);
        this.mcMusicTicker = new MusicTicker(this);
        this.fontRendererObj = new FontRenderer(this.gameSettings, new ResourceLocation(Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[21]]), this.renderEngine, (boolean)(Minecraft.llllIllIllIll[0] != 0));
        if (lIlIlIlllIIllIl(this.gameSettings.language)) {
            this.fontRendererObj.setUnicodeFlag(this.isUnicode());
            this.fontRendererObj.setBidiFlag(this.mcLanguageManager.isCurrentLanguageBidirectional());
        }
        this.standardGalacticFontRenderer = new FontRenderer(this.gameSettings, new ResourceLocation(Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[22]]), this.renderEngine, (boolean)(Minecraft.llllIllIllIll[0] != 0));
        this.mcResourceManager.registerReloadListener(this.fontRendererObj);
        this.mcResourceManager.registerReloadListener(this.standardGalacticFontRenderer);
        this.mcResourceManager.registerReloadListener(new GrassColorReloadListener());
        this.mcResourceManager.registerReloadListener(new FoliageColorReloadListener());
        AchievementList.openInventory.setStatStringFormatter(new IStatStringFormat() {
            private static final /* synthetic */ String[] lIIIllIlIlllIl;
            private static final /* synthetic */ int[] lIIIlllIlIlIII;
            
            @Override
            public String formatString(final String lllllllllllllIIlllllIIIllllIIlll) {
                try {
                    final Object[] args = new Object[Minecraft$1.lIIIlllIlIlIII[0]];
                    args[Minecraft$1.lIIIlllIlIlIII[1]] = GameSettings.getKeyDisplayString(Minecraft.this.gameSettings.keyBindInventory.getKeyCode());
                    return String.format(lllllllllllllIIlllllIIIllllIIlll, args);
                }
                catch (Exception lllllllllllllIIlllllIIIllllIIllI) {
                    return String.valueOf(new StringBuilder(Minecraft$1.lIIIllIlIlllIl[Minecraft$1.lIIIlllIlIlIII[1]]).append(lllllllllllllIIlllllIIIllllIIllI.getLocalizedMessage()));
                }
            }
            
            static {
                llIIIllIlIIlIIl();
                llIIIlIIlllIIIl();
            }
            
            private static String llIIIlIIlllIIII(String lllllllllllllIIlllllIIIlllIlIIll, final String lllllllllllllIIlllllIIIlllIlIlll) {
                lllllllllllllIIlllllIIIlllIlIIll = new String(Base64.getDecoder().decode(lllllllllllllIIlllllIIIlllIlIIll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
                final StringBuilder lllllllllllllIIlllllIIIlllIlIllI = new StringBuilder();
                final char[] lllllllllllllIIlllllIIIlllIlIlIl = lllllllllllllIIlllllIIIlllIlIlll.toCharArray();
                int lllllllllllllIIlllllIIIlllIlIlII = Minecraft$1.lIIIlllIlIlIII[1];
                final char lllllllllllllIIlllllIIIlllIIlllI = (Object)lllllllllllllIIlllllIIIlllIlIIll.toCharArray();
                final byte lllllllllllllIIlllllIIIlllIIllIl = (byte)lllllllllllllIIlllllIIIlllIIlllI.length;
                long lllllllllllllIIlllllIIIlllIIllII = Minecraft$1.lIIIlllIlIlIII[1];
                while (llIIIllIlIIlIlI((int)lllllllllllllIIlllllIIIlllIIllII, lllllllllllllIIlllllIIIlllIIllIl)) {
                    final char lllllllllllllIIlllllIIIlllIllIIl = lllllllllllllIIlllllIIIlllIIlllI[lllllllllllllIIlllllIIIlllIIllII];
                    lllllllllllllIIlllllIIIlllIlIllI.append((char)(lllllllllllllIIlllllIIIlllIllIIl ^ lllllllllllllIIlllllIIIlllIlIlIl[lllllllllllllIIlllllIIIlllIlIlII % lllllllllllllIIlllllIIIlllIlIlIl.length]));
                    "".length();
                    ++lllllllllllllIIlllllIIIlllIlIlII;
                    ++lllllllllllllIIlllllIIIlllIIllII;
                    "".length();
                    if ("   ".length() == 0) {
                        return null;
                    }
                }
                return String.valueOf(lllllllllllllIIlllllIIIlllIlIllI);
            }
            
            private static void llIIIlIIlllIIIl() {
                (lIIIllIlIlllIl = new String[Minecraft$1.lIIIlllIlIlIII[0]])[Minecraft$1.lIIIlllIlIlIII[1]] = llIIIlIIlllIIII("KzgULBFUag==", "nJfCc");
            }
            
            private static void llIIIllIlIIlIIl() {
                (lIIIlllIlIlIII = new int[2])[0] = " ".length();
                Minecraft$1.lIIIlllIlIlIII[1] = ((0x5A ^ 0x6B) & ~(0x3E ^ 0xF));
            }
            
            private static boolean llIIIllIlIIlIlI(final int lllllllllllllIIlllllIIIlllIIlIII, final int lllllllllllllIIlllllIIIlllIIIlll) {
                return lllllllllllllIIlllllIIIlllIIlIII < lllllllllllllIIlllllIIIlllIIIlll;
            }
        });
        "".length();
        this.mouseHelper = new MouseHelper();
        this.checkGLError(Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[23]]);
        GlStateManager.enableTexture2D();
        GlStateManager.shadeModel(Minecraft.llllIllIllIll[24]);
        GlStateManager.clearDepth(1.0);
        GlStateManager.enableDepth();
        GlStateManager.depthFunc(Minecraft.llllIllIllIll[25]);
        GlStateManager.enableAlpha();
        GlStateManager.alphaFunc(Minecraft.llllIllIllIll[26], 0.1f);
        GlStateManager.cullFace(Minecraft.llllIllIllIll[27]);
        GlStateManager.matrixMode(Minecraft.llllIllIllIll[28]);
        GlStateManager.loadIdentity();
        GlStateManager.matrixMode(Minecraft.llllIllIllIll[29]);
        this.checkGLError(Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[30]]);
        this.textureMapBlocks = new TextureMap(Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[31]]);
        this.textureMapBlocks.setMipmapLevels(this.gameSettings.mipmapLevels);
        this.renderEngine.loadTickableTexture(TextureMap.locationBlocksTexture, this.textureMapBlocks);
        "".length();
        this.renderEngine.bindTexture(TextureMap.locationBlocksTexture);
        final TextureMap textureMapBlocks = this.textureMapBlocks;
        final int llllllllllllIlIllllIIlIllIIIllIl = Minecraft.llllIllIllIll[0];
        int llllllllllllIlIllllIIlIllIIIIlll;
        if (lIlIlIlllIIllII(this.gameSettings.mipmapLevels)) {
            llllllllllllIlIllllIIlIllIIIIlll = Minecraft.llllIllIllIll[1];
            "".length();
            if (-" ".length() >= 0) {
                return;
            }
        }
        else {
            llllllllllllIlIllllIIlIllIIIIlll = Minecraft.llllIllIllIll[0];
        }
        textureMapBlocks.setBlurMipmapDirect((boolean)(llllllllllllIlIllllIIlIllIIIllIl != 0), (boolean)(llllllllllllIlIllllIIlIllIIIIlll != 0));
        SplashProgress.setProgresss(Minecraft.llllIllIllIll[3], Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[32]]);
        this.modelManager = new ModelManager(this.textureMapBlocks);
        this.mcResourceManager.registerReloadListener(this.modelManager);
        this.renderItem = new RenderItem(this.renderEngine, this.modelManager);
        SplashProgress.setProgresss(Minecraft.llllIllIllIll[8], Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[33]]);
        this.renderManager = new RenderManager(this.renderEngine, this.renderItem);
        SplashProgress.setProgresss(Minecraft.llllIllIllIll[9], Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[34]]);
        this.itemRenderer = new ItemRenderer(this);
        SplashProgress.setProgresss(Minecraft.llllIllIllIll[10], Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[35]]);
        this.mcResourceManager.registerReloadListener(this.renderItem);
        this.entityRenderer = new EntityRenderer(this, this.mcResourceManager);
        SplashProgress.setProgresss(Minecraft.llllIllIllIll[11], Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[36]]);
        this.mcResourceManager.registerReloadListener(this.entityRenderer);
        this.blockRenderDispatcher = new BlockRendererDispatcher(this.modelManager.getBlockModelShapes(), this.gameSettings);
        SplashProgress.setProgresss(Minecraft.llllIllIllIll[12], Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[37]]);
        this.mcResourceManager.registerReloadListener(this.blockRenderDispatcher);
        this.renderGlobal = new RenderGlobal(this);
        this.mcResourceManager.registerReloadListener(this.renderGlobal);
        this.guiAchievement = new GuiAchievement(this);
        GlStateManager.viewport(Minecraft.llllIllIllIll[0], Minecraft.llllIllIllIll[0], this.displayWidth, this.displayHeight);
        this.effectRenderer = new EffectRenderer(this.theWorld, this.renderEngine);
        this.checkGLError(Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[38]]);
        this.ingameGUI = new GuiIngame(this);
        ClientName.INSTANCE.startup();
        if (lIlIlIlllIIllIl(this.serverName)) {
            this.displayGuiScreen(new GuiConnecting(new MainMenu(), this, this.serverName, this.serverPort));
            "".length();
            if (" ".length() == 0) {
                return;
            }
        }
        else {
            this.displayGuiScreen(new MainMenu());
        }
        this.renderEngine.deleteTexture(this.mojangLogo);
        this.mojangLogo = null;
        this.loadingScreen = new LoadingScreenRenderer(this);
        if (lIlIlIlllIIlllI(this.gameSettings.fullScreen ? 1 : 0) && lIlIlIlllIIllll(this.fullscreen ? 1 : 0)) {
            this.toggleFullscreen();
        }
        try {
            Display.setVSyncEnabled(this.gameSettings.enableVsync);
            "".length();
            if ((0xA4 ^ 0xA0) < 0) {
                return;
            }
        }
        catch (OpenGLException lllllllllllllIlIllIIllIllIlIIIIl) {
            this.gameSettings.enableVsync = (Minecraft.llllIllIllIll[0] != 0);
            this.gameSettings.saveOptions();
        }
        this.renderGlobal.makeEntityOutlineShader();
    }
    
    private void updateFramebufferSize() {
        this.framebufferMc.createBindFramebuffer(this.displayWidth, this.displayHeight);
        if (lIlIlIlllIIllIl(this.entityRenderer)) {
            this.entityRenderer.updateShaderGroupSize(this.displayWidth, this.displayHeight);
        }
    }
    
    public ServerData getCurrentServerData() {
        return this.currentServerData;
    }
    
    private void displayDebugInfo(final long lllllllllllllIlIllIIllIIIlIlIllI) {
        if (lIlIlIlllIIlllI(this.mcProfiler.profilingEnabled ? 1 : 0)) {
            final List<Profiler.Result> lllllllllllllIlIllIIllIIIlIlIlIl = this.mcProfiler.getProfilingData(this.debugProfilerName);
            final Profiler.Result lllllllllllllIlIllIIllIIIlIlIlII = lllllllllllllIlIllIIllIIIlIlIlIl.remove(Minecraft.llllIllIllIll[0]);
            GlStateManager.clear(Minecraft.llllIllIllIll[64]);
            GlStateManager.matrixMode(Minecraft.llllIllIllIll[28]);
            GlStateManager.enableColorMaterial();
            GlStateManager.loadIdentity();
            GlStateManager.ortho(0.0, this.displayWidth, this.displayHeight, 0.0, 1000.0, 3000.0);
            GlStateManager.matrixMode(Minecraft.llllIllIllIll[29]);
            GlStateManager.loadIdentity();
            GlStateManager.translate(0.0f, 0.0f, -2000.0f);
            GL11.glLineWidth(1.0f);
            GlStateManager.disableTexture2D();
            final Tessellator lllllllllllllIlIllIIllIIIlIlIIll = Tessellator.getInstance();
            final WorldRenderer lllllllllllllIlIllIIllIIIlIlIIlI = lllllllllllllIlIllIIllIIIlIlIIll.getWorldRenderer();
            final int lllllllllllllIlIllIIllIIIlIlIIIl = Minecraft.llllIllIllIll[102];
            final int lllllllllllllIlIllIIllIIIlIlIIII = this.displayWidth - lllllllllllllIlIllIIllIIIlIlIIIl - Minecraft.llllIllIllIll[15];
            final int lllllllllllllIlIllIIllIIIlIIllll = this.displayHeight - lllllllllllllIlIllIIllIIIlIlIIIl * Minecraft.llllIllIllIll[3];
            GlStateManager.enableBlend();
            lllllllllllllIlIllIIllIIIlIlIIlI.begin(Minecraft.llllIllIllIll[12], DefaultVertexFormats.POSITION_COLOR);
            lllllllllllllIlIllIIllIIIlIlIIlI.pos(lllllllllllllIlIllIIllIIIlIlIIII - lllllllllllllIlIllIIllIIIlIlIIIl * 1.1f, lllllllllllllIlIllIIllIIIlIIllll - lllllllllllllIlIllIIllIIIlIlIIIl * 0.6f - 16.0f, 0.0).color(Minecraft.llllIllIllIll[103], Minecraft.llllIllIllIll[0], Minecraft.llllIllIllIll[0], Minecraft.llllIllIllIll[0]).endVertex();
            lllllllllllllIlIllIIllIIIlIlIIlI.pos(lllllllllllllIlIllIIllIIIlIlIIII - lllllllllllllIlIllIIllIIIlIlIIIl * 1.1f, lllllllllllllIlIllIIllIIIlIIllll + lllllllllllllIlIllIIllIIIlIlIIIl * Minecraft.llllIllIllIll[3], 0.0).color(Minecraft.llllIllIllIll[103], Minecraft.llllIllIllIll[0], Minecraft.llllIllIllIll[0], Minecraft.llllIllIllIll[0]).endVertex();
            lllllllllllllIlIllIIllIIIlIlIIlI.pos(lllllllllllllIlIllIIllIIIlIlIIII + lllllllllllllIlIllIIllIIIlIlIIIl * 1.1f, lllllllllllllIlIllIIllIIIlIIllll + lllllllllllllIlIllIIllIIIlIlIIIl * Minecraft.llllIllIllIll[3], 0.0).color(Minecraft.llllIllIllIll[103], Minecraft.llllIllIllIll[0], Minecraft.llllIllIllIll[0], Minecraft.llllIllIllIll[0]).endVertex();
            lllllllllllllIlIllIIllIIIlIlIIlI.pos(lllllllllllllIlIllIIllIIIlIlIIII + lllllllllllllIlIllIIllIIIlIlIIIl * 1.1f, lllllllllllllIlIllIIllIIIlIIllll - lllllllllllllIlIllIIllIIIlIlIIIl * 0.6f - 16.0f, 0.0).color(Minecraft.llllIllIllIll[103], Minecraft.llllIllIllIll[0], Minecraft.llllIllIllIll[0], Minecraft.llllIllIllIll[0]).endVertex();
            lllllllllllllIlIllIIllIIIlIlIIll.draw();
            GlStateManager.disableBlend();
            double lllllllllllllIlIllIIllIIIlIIlllI = 0.0;
            int lllllllllllllIlIllIIllIIIlIIllIl = Minecraft.llllIllIllIll[0];
            "".length();
            if (-(0x44 ^ 0x69 ^ (0x17 ^ 0x3E)) > 0) {
                return;
            }
            while (!lIlIlIlllIlIIIl(lllllllllllllIlIllIIllIIIlIIllIl, lllllllllllllIlIllIIllIIIlIlIlIl.size())) {
                final Profiler.Result lllllllllllllIlIllIIllIIIlIIllII = lllllllllllllIlIllIIllIIIlIlIlIl.get(lllllllllllllIlIllIIllIIIlIIllIl);
                final int lllllllllllllIlIllIIllIIIlIIlIll = MathHelper.floor_double(lllllllllllllIlIllIIllIIIlIIllII.field_76332_a / 4.0) + Minecraft.llllIllIllIll[1];
                lllllllllllllIlIllIIllIIIlIlIIlI.begin(Minecraft.llllIllIllIll[11], DefaultVertexFormats.POSITION_COLOR);
                final int lllllllllllllIlIllIIllIIIlIIlIlI = lllllllllllllIlIllIIllIIIlIIllII.func_76329_a();
                final int lllllllllllllIlIllIIllIIIlIIlIIl = lllllllllllllIlIllIIllIIIlIIlIlI >> Minecraft.llllIllIllIll[21] & Minecraft.llllIllIllIll[61];
                final int lllllllllllllIlIllIIllIIIlIIlIII = lllllllllllllIlIllIIllIIIlIIlIlI >> Minecraft.llllIllIllIll[13] & Minecraft.llllIllIllIll[61];
                final int lllllllllllllIlIllIIllIIIlIIIlll = lllllllllllllIlIllIIllIIIlIIlIlI & Minecraft.llllIllIllIll[61];
                lllllllllllllIlIllIIllIIIlIlIIlI.pos(lllllllllllllIlIllIIllIIIlIlIIII, lllllllllllllIlIllIIllIIIlIIllll, 0.0).color(lllllllllllllIlIllIIllIIIlIIlIIl, lllllllllllllIlIllIIllIIIlIIlIII, lllllllllllllIlIllIIllIIIlIIIlll, Minecraft.llllIllIllIll[61]).endVertex();
                int lllllllllllllIlIllIIllIIIlIIIllI = lllllllllllllIlIllIIllIIIlIIlIll;
                "".length();
                if (" ".length() == 0) {
                    return;
                }
                while (!lIlIlIlllIllIII(lllllllllllllIlIllIIllIIIlIIIllI)) {
                    final float lllllllllllllIlIllIIllIIIlIIIlIl = (float)((lllllllllllllIlIllIIllIIIlIIlllI + lllllllllllllIlIllIIllIIIlIIllII.field_76332_a * lllllllllllllIlIllIIllIIIlIIIllI / lllllllllllllIlIllIIllIIIlIIlIll) * 3.141592653589793 * 2.0 / 100.0);
                    final float lllllllllllllIlIllIIllIIIlIIIlII = MathHelper.sin(lllllllllllllIlIllIIllIIIlIIIlIl) * lllllllllllllIlIllIIllIIIlIlIIIl;
                    final float lllllllllllllIlIllIIllIIIlIIIIll = MathHelper.cos(lllllllllllllIlIllIIllIIIlIIIlIl) * lllllllllllllIlIllIIllIIIlIlIIIl * 0.5f;
                    lllllllllllllIlIllIIllIIIlIlIIlI.pos(lllllllllllllIlIllIIllIIIlIlIIII + lllllllllllllIlIllIIllIIIlIIIlII, lllllllllllllIlIllIIllIIIlIIllll - lllllllllllllIlIllIIllIIIlIIIIll, 0.0).color(lllllllllllllIlIllIIllIIIlIIlIIl, lllllllllllllIlIllIIllIIIlIIlIII, lllllllllllllIlIllIIllIIIlIIIlll, Minecraft.llllIllIllIll[61]).endVertex();
                    --lllllllllllllIlIllIIllIIIlIIIllI;
                }
                lllllllllllllIlIllIIllIIIlIlIIll.draw();
                lllllllllllllIlIllIIllIIIlIlIIlI.begin(Minecraft.llllIllIllIll[10], DefaultVertexFormats.POSITION_COLOR);
                int lllllllllllllIlIllIIllIIIlIIIIlI = lllllllllllllIlIllIIllIIIlIIlIll;
                "".length();
                if ((0xAF ^ 0xC3 ^ (0xA9 ^ 0xC1)) != (0xC1 ^ 0x89 ^ (0x1C ^ 0x50))) {
                    return;
                }
                while (!lIlIlIlllIllIII(lllllllllllllIlIllIIllIIIlIIIIlI)) {
                    final float lllllllllllllIlIllIIllIIIlIIIIIl = (float)((lllllllllllllIlIllIIllIIIlIIlllI + lllllllllllllIlIllIIllIIIlIIllII.field_76332_a * lllllllllllllIlIllIIllIIIlIIIIlI / lllllllllllllIlIllIIllIIIlIIlIll) * 3.141592653589793 * 2.0 / 100.0);
                    final float lllllllllllllIlIllIIllIIIlIIIIII = MathHelper.sin(lllllllllllllIlIllIIllIIIlIIIIIl) * lllllllllllllIlIllIIllIIIlIlIIIl;
                    final float lllllllllllllIlIllIIllIIIIllllll = MathHelper.cos(lllllllllllllIlIllIIllIIIlIIIIIl) * lllllllllllllIlIllIIllIIIlIlIIIl * 0.5f;
                    lllllllllllllIlIllIIllIIIlIlIIlI.pos(lllllllllllllIlIllIIllIIIlIlIIII + lllllllllllllIlIllIIllIIIlIIIIII, lllllllllllllIlIllIIllIIIlIIllll - lllllllllllllIlIllIIllIIIIllllll, 0.0).color(lllllllllllllIlIllIIllIIIlIIlIIl >> Minecraft.llllIllIllIll[1], lllllllllllllIlIllIIllIIIlIIlIII >> Minecraft.llllIllIllIll[1], lllllllllllllIlIllIIllIIIlIIIlll >> Minecraft.llllIllIllIll[1], Minecraft.llllIllIllIll[61]).endVertex();
                    lllllllllllllIlIllIIllIIIlIlIIlI.pos(lllllllllllllIlIllIIllIIIlIlIIII + lllllllllllllIlIllIIllIIIlIIIIII, lllllllllllllIlIllIIllIIIlIIllll - lllllllllllllIlIllIIllIIIIllllll + 10.0f, 0.0).color(lllllllllllllIlIllIIllIIIlIIlIIl >> Minecraft.llllIllIllIll[1], lllllllllllllIlIllIIllIIIlIIlIII >> Minecraft.llllIllIllIll[1], lllllllllllllIlIllIIllIIIlIIIlll >> Minecraft.llllIllIllIll[1], Minecraft.llllIllIllIll[61]).endVertex();
                    --lllllllllllllIlIllIIllIIIlIIIIlI;
                }
                lllllllllllllIlIllIIllIIIlIlIIll.draw();
                lllllllllllllIlIllIIllIIIlIIlllI += lllllllllllllIlIllIIllIIIlIIllII.field_76332_a;
                ++lllllllllllllIlIllIIllIIIlIIllIl;
            }
            final DecimalFormat lllllllllllllIlIllIIllIIIIlllllI = new DecimalFormat(Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[104]]);
            GlStateManager.enableTexture2D();
            String lllllllllllllIlIllIIllIIIIllllIl = Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[105]];
            if (lIlIlIlllIIllll(lllllllllllllIlIllIIllIIIlIlIlII.field_76331_c.equals(Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[106]]) ? 1 : 0)) {
                lllllllllllllIlIllIIllIIIIllllIl = String.valueOf(new StringBuilder(String.valueOf(lllllllllllllIlIllIIllIIIIllllIl)).append(Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[107]]));
            }
            if (lIlIlIlllIIllll(lllllllllllllIlIllIIllIIIlIlIlII.field_76331_c.length())) {
                lllllllllllllIlIllIIllIIIIllllIl = String.valueOf(new StringBuilder(String.valueOf(lllllllllllllIlIllIIllIIIIllllIl)).append(Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[108]]));
                "".length();
                if (" ".length() >= "   ".length()) {
                    return;
                }
            }
            else {
                lllllllllllllIlIllIIllIIIIllllIl = String.valueOf(new StringBuilder(String.valueOf(lllllllllllllIlIllIIllIIIIllllIl)).append(lllllllllllllIlIllIIllIIIlIlIlII.field_76331_c).append(Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[109]]));
            }
            final int lllllllllllllIlIllIIllIIIIllllII = Minecraft.llllIllIllIll[110];
            this.fontRendererObj.drawStringWithShadow(lllllllllllllIlIllIIllIIIIllllIl, (float)(lllllllllllllIlIllIIllIIIlIlIIII - lllllllllllllIlIllIIllIIIlIlIIIl), (float)(lllllllllllllIlIllIIllIIIlIIllll - lllllllllllllIlIllIIllIIIlIlIIIl / Minecraft.llllIllIllIll[3] - Minecraft.llllIllIllIll[21]), lllllllllllllIlIllIIllIIIIllllII);
            "".length();
            this.fontRendererObj.drawStringWithShadow(lllllllllllllIlIllIIllIIIIllllIl = String.valueOf(new StringBuilder(String.valueOf(lllllllllllllIlIllIIllIIIIlllllI.format(lllllllllllllIlIllIIllIIIlIlIlII.field_76330_b))).append(Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[111]])), (float)(lllllllllllllIlIllIIllIIIlIlIIII + lllllllllllllIlIllIIllIIIlIlIIIl - this.fontRendererObj.getStringWidth(lllllllllllllIlIllIIllIIIIllllIl)), (float)(lllllllllllllIlIllIIllIIIlIIllll - lllllllllllllIlIllIIllIIIlIlIIIl / Minecraft.llllIllIllIll[3] - Minecraft.llllIllIllIll[21]), lllllllllllllIlIllIIllIIIIllllII);
            "".length();
            int lllllllllllllIlIllIIllIIIIlllIll = Minecraft.llllIllIllIll[0];
            "".length();
            if (null != null) {
                return;
            }
            while (!lIlIlIlllIlIIIl(lllllllllllllIlIllIIllIIIIlllIll, lllllllllllllIlIllIIllIIIlIlIlIl.size())) {
                final Profiler.Result lllllllllllllIlIllIIllIIIIlllIlI = lllllllllllllIlIllIIllIIIlIlIlIl.get(lllllllllllllIlIllIIllIIIIlllIll);
                String lllllllllllllIlIllIIllIIIIlllIIl = Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[112]];
                if (lIlIlIlllIIlllI(lllllllllllllIlIllIIllIIIIlllIlI.field_76331_c.equals(Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[113]]) ? 1 : 0)) {
                    lllllllllllllIlIllIIllIIIIlllIIl = String.valueOf(new StringBuilder(String.valueOf(lllllllllllllIlIllIIllIIIIlllIIl)).append(Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[114]]));
                    "".length();
                    if (((0x89 ^ 0xA9 ^ (0x46 ^ 0x57)) & (0x1A ^ 0x50 ^ (0x36 ^ 0x4D) ^ -" ".length())) != 0x0) {
                        return;
                    }
                }
                else {
                    lllllllllllllIlIllIIllIIIIlllIIl = String.valueOf(new StringBuilder(String.valueOf(lllllllllllllIlIllIIllIIIIlllIIl)).append(Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[115]]).append(lllllllllllllIlIllIIllIIIIlllIll + Minecraft.llllIllIllIll[1]).append(Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[116]]));
                }
                lllllllllllllIlIllIIllIIIIlllIIl = String.valueOf(new StringBuilder(String.valueOf(lllllllllllllIlIllIIllIIIIlllIIl)).append(lllllllllllllIlIllIIllIIIIlllIlI.field_76331_c));
                this.fontRendererObj.drawStringWithShadow(lllllllllllllIlIllIIllIIIIlllIIl, (float)(lllllllllllllIlIllIIllIIIlIlIIII - lllllllllllllIlIllIIllIIIlIlIIIl), (float)(lllllllllllllIlIllIIllIIIlIIllll + lllllllllllllIlIllIIllIIIlIlIIIl / Minecraft.llllIllIllIll[3] + lllllllllllllIlIllIIllIIIIlllIll * Minecraft.llllIllIllIll[13] + Minecraft.llllIllIllIll[31]), lllllllllllllIlIllIIllIIIIlllIlI.func_76329_a());
                "".length();
                this.fontRendererObj.drawStringWithShadow(lllllllllllllIlIllIIllIIIIlllIIl = String.valueOf(new StringBuilder(String.valueOf(lllllllllllllIlIllIIllIIIIlllllI.format(lllllllllllllIlIllIIllIIIIlllIlI.field_76332_a))).append(Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[117]])), (float)(lllllllllllllIlIllIIllIIIlIlIIII + lllllllllllllIlIllIIllIIIlIlIIIl - Minecraft.llllIllIllIll[65] - this.fontRendererObj.getStringWidth(lllllllllllllIlIllIIllIIIIlllIIl)), (float)(lllllllllllllIlIllIIllIIIlIIllll + lllllllllllllIlIllIIllIIIlIlIIIl / Minecraft.llllIllIllIll[3] + lllllllllllllIlIllIIllIIIIlllIll * Minecraft.llllIllIllIll[13] + Minecraft.llllIllIllIll[31]), lllllllllllllIlIllIIllIIIIlllIlI.func_76329_a());
                "".length();
                this.fontRendererObj.drawStringWithShadow(lllllllllllllIlIllIIllIIIIlllIIl = String.valueOf(new StringBuilder(String.valueOf(lllllllllllllIlIllIIllIIIIlllllI.format(lllllllllllllIlIllIIllIIIIlllIlI.field_76330_b))).append(Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[118]])), (float)(lllllllllllllIlIllIIllIIIlIlIIII + lllllllllllllIlIllIIllIIIlIlIIIl - this.fontRendererObj.getStringWidth(lllllllllllllIlIllIIllIIIIlllIIl)), (float)(lllllllllllllIlIllIIllIIIlIIllll + lllllllllllllIlIllIIllIIIlIlIIIl / Minecraft.llllIllIllIll[3] + lllllllllllllIlIllIIllIIIIlllIll * Minecraft.llllIllIllIll[13] + Minecraft.llllIllIllIll[31]), lllllllllllllIlIllIIllIIIIlllIlI.func_76329_a());
                "".length();
                ++lllllllllllllIlIllIIllIIIIlllIll;
            }
        }
    }
    
    public boolean func_181540_al() {
        return this.field_181541_X;
    }
    
    public PlayerUsageSnooper getPlayerUsageSnooper() {
        return this.usageSnooper;
    }
    
    public void shutdownMinecraftApplet() {
        try {
            ClientName.INSTANCE.shutdown();
            this.stream.shutdownStream();
            Minecraft.logger.info(Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[68]]);
            try {
                this.loadWorld(null);
                "".length();
                if (-(0x32 ^ 0x36) > 0) {
                    return;
                }
            }
            catch (Throwable t) {}
            this.mcSoundHandler.unloadSounds();
            "".length();
            if ("  ".length() <= " ".length()) {
                return;
            }
        }
        finally {
            Display.destroy();
            if (lIlIlIlllIIllll(this.hasCrashed ? 1 : 0)) {
                System.exit(Minecraft.llllIllIllIll[0]);
            }
        }
        Display.destroy();
        if (lIlIlIlllIIllll(this.hasCrashed ? 1 : 0)) {
            System.exit(Minecraft.llllIllIllIll[0]);
        }
        System.gc();
    }
    
    public String getVersion() {
        return this.launchedVersion;
    }
    
    public ItemRenderer getItemRenderer() {
        return this.itemRenderer;
    }
    
    @Override
    public boolean isCallingFromMinecraftThread() {
        if (lIlIlIlllIIlIlI(Thread.currentThread(), this.mcThread)) {
            return Minecraft.llllIllIllIll[1] != 0;
        }
        return Minecraft.llllIllIllIll[0] != 0;
    }
    
    public static int getDebugFPS() {
        return Minecraft.debugFPS;
    }
    
    private static boolean lIlIlIlllIIllll(final int lllllllllllllIlIllIIlIlIIIlIIIIl) {
        return lllllllllllllIlIllIIlIlIIIlIIIIl == 0;
    }
    
    public static long getSystemTime() {
        return Sys.getTime() * 1000L / Sys.getTimerResolution();
    }
    
    private void registerMetadataSerializers() {
        this.metadataSerializer_.registerMetadataSectionType(new TextureMetadataSectionSerializer(), TextureMetadataSection.class);
        this.metadataSerializer_.registerMetadataSectionType(new FontMetadataSectionSerializer(), FontMetadataSection.class);
        this.metadataSerializer_.registerMetadataSectionType(new AnimationMetadataSectionSerializer(), AnimationMetadataSection.class);
        this.metadataSerializer_.registerMetadataSectionType(new PackMetadataSectionSerializer(), PackMetadataSection.class);
        this.metadataSerializer_.registerMetadataSectionType(new LanguageMetadataSectionSerializer(), LanguageMetadataSection.class);
    }
    
    private void updateDebugProfilerName(int lllllllllllllIlIllIIllIIIllIllll) {
        final List<Profiler.Result> lllllllllllllIlIllIIllIIIlllIIll = this.mcProfiler.getProfilingData(this.debugProfilerName);
        if (lIlIlIlllIIllIl(lllllllllllllIlIllIIllIIIlllIIll) && lIlIlIlllIIllll(lllllllllllllIlIllIIllIIIlllIIll.isEmpty() ? 1 : 0)) {
            final Profiler.Result lllllllllllllIlIllIIllIIIlllIIlI = lllllllllllllIlIllIIllIIIlllIIll.remove(Minecraft.llllIllIllIll[0]);
            if (lIlIlIlllIIllll(lllllllllllllIlIllIIllIIIllIllll)) {
                if (lIlIlIlllIIllII(lllllllllllllIlIllIIllIIIlllIIlI.field_76331_c.length())) {
                    final int lllllllllllllIlIllIIllIIIlllIIIl = this.debugProfilerName.lastIndexOf(Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[99]]);
                    if (lIlIlIlllIllIlI(lllllllllllllIlIllIIllIIIlllIIIl)) {
                        this.debugProfilerName = this.debugProfilerName.substring(Minecraft.llllIllIllIll[0], lllllllllllllIlIllIIllIIIlllIIIl);
                        "".length();
                        if ((0x82 ^ 0x86) == 0x0) {
                            return;
                        }
                    }
                }
            }
            else if (lIlIlIlllIllIll(--lllllllllllllIlIllIIllIIIllIllll, lllllllllllllIlIllIIllIIIlllIIll.size()) && lIlIlIlllIIllll(lllllllllllllIlIllIIllIIIlllIIll.get(lllllllllllllIlIllIIllIIIllIllll).field_76331_c.equals(Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[100]]) ? 1 : 0)) {
                if (lIlIlIlllIIllII(this.debugProfilerName.length())) {
                    this.debugProfilerName = String.valueOf(new StringBuilder(String.valueOf(this.debugProfilerName)).append(Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[101]]));
                }
                this.debugProfilerName = String.valueOf(new StringBuilder(String.valueOf(this.debugProfilerName)).append(lllllllllllllIlIllIIllIIIlllIIll.get(lllllllllllllIlIllIIllIIIllIllll).field_76331_c));
            }
        }
    }
    
    @Override
    public void addServerTypeToSnooper(final PlayerUsageSnooper lllllllllllllIlIllIIlIllIIIlIIlI) {
        lllllllllllllIlIllIIlIllIIIlIIlI.addStatToSnooper(Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[191]], GL11.glGetString(Minecraft.llllIllIllIll[192]));
        lllllllllllllIlIllIIlIllIIIlIIlI.addStatToSnooper(Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[193]], GL11.glGetString(Minecraft.llllIllIllIll[194]));
        lllllllllllllIlIllIIlIllIIIlIIlI.addStatToSnooper(Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[195]], ClientBrandRetriever.getClientModName());
        lllllllllllllIlIllIIlIllIIIlIIlI.addStatToSnooper(Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[196]], this.launchedVersion);
        final ContextCapabilities lllllllllllllIlIllIIlIllIIIlIlII = GLContext.getCapabilities();
        lllllllllllllIlIllIIlIllIIIlIIlI.addStatToSnooper(Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[197]], lllllllllllllIlIllIIlIllIIIlIlII.GL_ARB_arrays_of_arrays);
        lllllllllllllIlIllIIlIllIIIlIIlI.addStatToSnooper(Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[198]], lllllllllllllIlIllIIlIllIIIlIlII.GL_ARB_base_instance);
        lllllllllllllIlIllIIlIllIIIlIIlI.addStatToSnooper(Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[199]], lllllllllllllIlIllIIlIllIIIlIlII.GL_ARB_blend_func_extended);
        lllllllllllllIlIllIIlIllIIIlIIlI.addStatToSnooper(Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[200]], lllllllllllllIlIllIIlIllIIIlIlII.GL_ARB_clear_buffer_object);
        lllllllllllllIlIllIIlIllIIIlIIlI.addStatToSnooper(Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[201]], lllllllllllllIlIllIIlIllIIIlIlII.GL_ARB_color_buffer_float);
        lllllllllllllIlIllIIlIllIIIlIIlI.addStatToSnooper(Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[202]], lllllllllllllIlIllIIlIllIIIlIlII.GL_ARB_compatibility);
        lllllllllllllIlIllIIlIllIIIlIIlI.addStatToSnooper(Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[203]], lllllllllllllIlIllIIlIllIIIlIlII.GL_ARB_compressed_texture_pixel_storage);
        lllllllllllllIlIllIIlIllIIIlIIlI.addStatToSnooper(Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[204]], lllllllllllllIlIllIIlIllIIIlIlII.GL_ARB_compute_shader);
        lllllllllllllIlIllIIlIllIIIlIIlI.addStatToSnooper(Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[205]], lllllllllllllIlIllIIlIllIIIlIlII.GL_ARB_copy_buffer);
        lllllllllllllIlIllIIlIllIIIlIIlI.addStatToSnooper(Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[206]], lllllllllllllIlIllIIlIllIIIlIlII.GL_ARB_copy_image);
        lllllllllllllIlIllIIlIllIIIlIIlI.addStatToSnooper(Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[207]], lllllllllllllIlIllIIlIllIIIlIlII.GL_ARB_depth_buffer_float);
        lllllllllllllIlIllIIlIllIIIlIIlI.addStatToSnooper(Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[208]], lllllllllllllIlIllIIlIllIIIlIlII.GL_ARB_compute_shader);
        lllllllllllllIlIllIIlIllIIIlIIlI.addStatToSnooper(Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[209]], lllllllllllllIlIllIIlIllIIIlIlII.GL_ARB_copy_buffer);
        lllllllllllllIlIllIIlIllIIIlIIlI.addStatToSnooper(Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[210]], lllllllllllllIlIllIIlIllIIIlIlII.GL_ARB_copy_image);
        lllllllllllllIlIllIIlIllIIIlIIlI.addStatToSnooper(Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[211]], lllllllllllllIlIllIIlIllIIIlIlII.GL_ARB_depth_buffer_float);
        lllllllllllllIlIllIIlIllIIIlIIlI.addStatToSnooper(Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[212]], lllllllllllllIlIllIIlIllIIIlIlII.GL_ARB_depth_clamp);
        lllllllllllllIlIllIIlIllIIIlIIlI.addStatToSnooper(Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[213]], lllllllllllllIlIllIIlIllIIIlIlII.GL_ARB_depth_texture);
        lllllllllllllIlIllIIlIllIIIlIIlI.addStatToSnooper(Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[214]], lllllllllllllIlIllIIlIllIIIlIlII.GL_ARB_draw_buffers);
        lllllllllllllIlIllIIlIllIIIlIIlI.addStatToSnooper(Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[215]], lllllllllllllIlIllIIlIllIIIlIlII.GL_ARB_draw_buffers_blend);
        lllllllllllllIlIllIIlIllIIIlIIlI.addStatToSnooper(Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[216]], lllllllllllllIlIllIIlIllIIIlIlII.GL_ARB_draw_elements_base_vertex);
        lllllllllllllIlIllIIlIllIIIlIIlI.addStatToSnooper(Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[217]], lllllllllllllIlIllIIlIllIIIlIlII.GL_ARB_draw_indirect);
        lllllllllllllIlIllIIlIllIIIlIIlI.addStatToSnooper(Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[218]], lllllllllllllIlIllIIlIllIIIlIlII.GL_ARB_draw_instanced);
        lllllllllllllIlIllIIlIllIIIlIIlI.addStatToSnooper(Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[219]], lllllllllllllIlIllIIlIllIIIlIlII.GL_ARB_explicit_attrib_location);
        lllllllllllllIlIllIIlIllIIIlIIlI.addStatToSnooper(Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[220]], lllllllllllllIlIllIIlIllIIIlIlII.GL_ARB_explicit_uniform_location);
        lllllllllllllIlIllIIlIllIIIlIIlI.addStatToSnooper(Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[103]], lllllllllllllIlIllIIlIllIIIlIlII.GL_ARB_fragment_layer_viewport);
        lllllllllllllIlIllIIlIllIIIlIIlI.addStatToSnooper(Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[221]], lllllllllllllIlIllIIlIllIIIlIlII.GL_ARB_fragment_program);
        lllllllllllllIlIllIIlIllIIIlIIlI.addStatToSnooper(Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[222]], lllllllllllllIlIllIIlIllIIIlIlII.GL_ARB_fragment_shader);
        lllllllllllllIlIllIIlIllIIIlIIlI.addStatToSnooper(Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[223]], lllllllllllllIlIllIIlIllIIIlIlII.GL_ARB_fragment_program_shadow);
        lllllllllllllIlIllIIlIllIIIlIIlI.addStatToSnooper(Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[224]], lllllllllllllIlIllIIlIllIIIlIlII.GL_ARB_framebuffer_object);
        lllllllllllllIlIllIIlIllIIIlIIlI.addStatToSnooper(Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[225]], lllllllllllllIlIllIIlIllIIIlIlII.GL_ARB_framebuffer_sRGB);
        lllllllllllllIlIllIIlIllIIIlIIlI.addStatToSnooper(Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[226]], lllllllllllllIlIllIIlIllIIIlIlII.GL_ARB_geometry_shader4);
        lllllllllllllIlIllIIlIllIIIlIIlI.addStatToSnooper(Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[227]], lllllllllllllIlIllIIlIllIIIlIlII.GL_ARB_gpu_shader5);
        lllllllllllllIlIllIIlIllIIIlIIlI.addStatToSnooper(Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[228]], lllllllllllllIlIllIIlIllIIIlIlII.GL_ARB_half_float_pixel);
        lllllllllllllIlIllIIlIllIIIlIIlI.addStatToSnooper(Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[229]], lllllllllllllIlIllIIlIllIIIlIlII.GL_ARB_half_float_vertex);
        lllllllllllllIlIllIIlIllIIIlIIlI.addStatToSnooper(Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[230]], lllllllllllllIlIllIIlIllIIIlIlII.GL_ARB_instanced_arrays);
        lllllllllllllIlIllIIlIllIIIlIIlI.addStatToSnooper(Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[231]], lllllllllllllIlIllIIlIllIIIlIlII.GL_ARB_map_buffer_alignment);
        lllllllllllllIlIllIIlIllIIIlIIlI.addStatToSnooper(Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[232]], lllllllllllllIlIllIIlIllIIIlIlII.GL_ARB_map_buffer_range);
        lllllllllllllIlIllIIlIllIIIlIIlI.addStatToSnooper(Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[233]], lllllllllllllIlIllIIlIllIIIlIlII.GL_ARB_multisample);
        lllllllllllllIlIllIIlIllIIIlIIlI.addStatToSnooper(Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[234]], lllllllllllllIlIllIIlIllIIIlIlII.GL_ARB_multitexture);
        lllllllllllllIlIllIIlIllIIIlIIlI.addStatToSnooper(Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[235]], lllllllllllllIlIllIIlIllIIIlIlII.GL_ARB_occlusion_query2);
        lllllllllllllIlIllIIlIllIIIlIIlI.addStatToSnooper(Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[236]], lllllllllllllIlIllIIlIllIIIlIlII.GL_ARB_pixel_buffer_object);
        lllllllllllllIlIllIIlIllIIIlIIlI.addStatToSnooper(Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[237]], lllllllllllllIlIllIIlIllIIIlIlII.GL_ARB_seamless_cube_map);
        lllllllllllllIlIllIIlIllIIIlIIlI.addStatToSnooper(Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[238]], lllllllllllllIlIllIIlIllIIIlIlII.GL_ARB_shader_objects);
        lllllllllllllIlIllIIlIllIIIlIIlI.addStatToSnooper(Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[239]], lllllllllllllIlIllIIlIllIIIlIlII.GL_ARB_shader_stencil_export);
        lllllllllllllIlIllIIlIllIIIlIIlI.addStatToSnooper(Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[240]], lllllllllllllIlIllIIlIllIIIlIlII.GL_ARB_shader_texture_lod);
        lllllllllllllIlIllIIlIllIIIlIIlI.addStatToSnooper(Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[241]], lllllllllllllIlIllIIlIllIIIlIlII.GL_ARB_shadow);
        lllllllllllllIlIllIIlIllIIIlIIlI.addStatToSnooper(Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[242]], lllllllllllllIlIllIIlIllIIIlIlII.GL_ARB_shadow_ambient);
        lllllllllllllIlIllIIlIllIIIlIIlI.addStatToSnooper(Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[243]], lllllllllllllIlIllIIlIllIIIlIlII.GL_ARB_stencil_texturing);
        lllllllllllllIlIllIIlIllIIIlIIlI.addStatToSnooper(Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[244]], lllllllllllllIlIllIIlIllIIIlIlII.GL_ARB_sync);
        lllllllllllllIlIllIIlIllIIIlIIlI.addStatToSnooper(Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[245]], lllllllllllllIlIllIIlIllIIIlIlII.GL_ARB_tessellation_shader);
        lllllllllllllIlIllIIlIllIIIlIIlI.addStatToSnooper(Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[246]], lllllllllllllIlIllIIlIllIIIlIlII.GL_ARB_texture_border_clamp);
        lllllllllllllIlIllIIlIllIIIlIIlI.addStatToSnooper(Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[247]], lllllllllllllIlIllIIlIllIIIlIlII.GL_ARB_texture_buffer_object);
        lllllllllllllIlIllIIlIllIIIlIIlI.addStatToSnooper(Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[248]], lllllllllllllIlIllIIlIllIIIlIlII.GL_ARB_texture_cube_map);
        lllllllllllllIlIllIIlIllIIIlIIlI.addStatToSnooper(Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[249]], lllllllllllllIlIllIIlIllIIIlIlII.GL_ARB_texture_cube_map_array);
        lllllllllllllIlIllIIlIllIIIlIIlI.addStatToSnooper(Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[250]], lllllllllllllIlIllIIlIllIIIlIlII.GL_ARB_texture_non_power_of_two);
        lllllllllllllIlIllIIlIllIIIlIIlI.addStatToSnooper(Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[251]], lllllllllllllIlIllIIlIllIIIlIlII.GL_ARB_uniform_buffer_object);
        lllllllllllllIlIllIIlIllIIIlIIlI.addStatToSnooper(Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[252]], lllllllllllllIlIllIIlIllIIIlIlII.GL_ARB_vertex_blend);
        lllllllllllllIlIllIIlIllIIIlIIlI.addStatToSnooper(Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[253]], lllllllllllllIlIllIIlIllIIIlIlII.GL_ARB_vertex_buffer_object);
        lllllllllllllIlIllIIlIllIIIlIIlI.addStatToSnooper(Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[254]], lllllllllllllIlIllIIlIllIIIlIlII.GL_ARB_vertex_program);
        lllllllllllllIlIllIIlIllIIIlIIlI.addStatToSnooper(Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[255]], lllllllllllllIlIllIIlIllIIIlIlII.GL_ARB_vertex_shader);
        lllllllllllllIlIllIIlIllIIIlIIlI.addStatToSnooper(Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[256]], lllllllllllllIlIllIIlIllIIIlIlII.GL_EXT_bindable_uniform);
        lllllllllllllIlIllIIlIllIIIlIIlI.addStatToSnooper(Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[257]], lllllllllllllIlIllIIlIllIIIlIlII.GL_EXT_blend_equation_separate);
        lllllllllllllIlIllIIlIllIIIlIIlI.addStatToSnooper(Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[258]], lllllllllllllIlIllIIlIllIIIlIlII.GL_EXT_blend_func_separate);
        lllllllllllllIlIllIIlIllIIIlIIlI.addStatToSnooper(Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[259]], lllllllllllllIlIllIIlIllIIIlIlII.GL_EXT_blend_minmax);
        lllllllllllllIlIllIIlIllIIIlIIlI.addStatToSnooper(Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[260]], lllllllllllllIlIllIIlIllIIIlIlII.GL_EXT_blend_subtract);
        lllllllllllllIlIllIIlIllIIIlIIlI.addStatToSnooper(Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[261]], lllllllllllllIlIllIIlIllIIIlIlII.GL_EXT_draw_instanced);
        lllllllllllllIlIllIIlIllIIIlIIlI.addStatToSnooper(Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[262]], lllllllllllllIlIllIIlIllIIIlIlII.GL_EXT_framebuffer_multisample);
        lllllllllllllIlIllIIlIllIIIlIIlI.addStatToSnooper(Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[263]], lllllllllllllIlIllIIlIllIIIlIlII.GL_EXT_framebuffer_object);
        lllllllllllllIlIllIIlIllIIIlIIlI.addStatToSnooper(Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[264]], lllllllllllllIlIllIIlIllIIIlIlII.GL_EXT_framebuffer_sRGB);
        lllllllllllllIlIllIIlIllIIIlIIlI.addStatToSnooper(Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[265]], lllllllllllllIlIllIIlIllIIIlIlII.GL_EXT_geometry_shader4);
        lllllllllllllIlIllIIlIllIIIlIIlI.addStatToSnooper(Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[266]], lllllllllllllIlIllIIlIllIIIlIlII.GL_EXT_gpu_program_parameters);
        lllllllllllllIlIllIIlIllIIIlIIlI.addStatToSnooper(Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[267]], lllllllllllllIlIllIIlIllIIIlIlII.GL_EXT_gpu_shader4);
        lllllllllllllIlIllIIlIllIIIlIIlI.addStatToSnooper(Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[268]], lllllllllllllIlIllIIlIllIIIlIlII.GL_EXT_multi_draw_arrays);
        lllllllllllllIlIllIIlIllIIIlIIlI.addStatToSnooper(Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[269]], lllllllllllllIlIllIIlIllIIIlIlII.GL_EXT_packed_depth_stencil);
        lllllllllllllIlIllIIlIllIIIlIIlI.addStatToSnooper(Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[270]], lllllllllllllIlIllIIlIllIIIlIlII.GL_EXT_paletted_texture);
        lllllllllllllIlIllIIlIllIIIlIIlI.addStatToSnooper(Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[271]], lllllllllllllIlIllIIlIllIIIlIlII.GL_EXT_rescale_normal);
        lllllllllllllIlIllIIlIllIIIlIIlI.addStatToSnooper(Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[272]], lllllllllllllIlIllIIlIllIIIlIlII.GL_EXT_separate_shader_objects);
        lllllllllllllIlIllIIlIllIIIlIIlI.addStatToSnooper(Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[273]], lllllllllllllIlIllIIlIllIIIlIlII.GL_EXT_shader_image_load_store);
        lllllllllllllIlIllIIlIllIIIlIIlI.addStatToSnooper(Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[274]], lllllllllllllIlIllIIlIllIIIlIlII.GL_EXT_shadow_funcs);
        lllllllllllllIlIllIIlIllIIIlIIlI.addStatToSnooper(Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[61]], lllllllllllllIlIllIIlIllIIIlIlII.GL_EXT_shared_texture_palette);
        lllllllllllllIlIllIIlIllIIIlIIlI.addStatToSnooper(Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[64]], lllllllllllllIlIllIIlIllIIIlIlII.GL_EXT_stencil_clear_tag);
        lllllllllllllIlIllIIlIllIIIlIIlI.addStatToSnooper(Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[275]], lllllllllllllIlIllIIlIllIIIlIlII.GL_EXT_stencil_two_side);
        lllllllllllllIlIllIIlIllIIIlIIlI.addStatToSnooper(Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[276]], lllllllllllllIlIllIIlIllIIIlIlII.GL_EXT_stencil_wrap);
        lllllllllllllIlIllIIlIllIIIlIIlI.addStatToSnooper(Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[277]], lllllllllllllIlIllIIlIllIIIlIlII.GL_EXT_texture_3d);
        lllllllllllllIlIllIIlIllIIIlIIlI.addStatToSnooper(Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[278]], lllllllllllllIlIllIIlIllIIIlIlII.GL_EXT_texture_array);
        lllllllllllllIlIllIIlIllIIIlIIlI.addStatToSnooper(Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[279]], lllllllllllllIlIllIIlIllIIIlIlII.GL_EXT_texture_buffer_object);
        lllllllllllllIlIllIIlIllIIIlIIlI.addStatToSnooper(Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[280]], lllllllllllllIlIllIIlIllIIIlIlII.GL_EXT_texture_integer);
        lllllllllllllIlIllIIlIllIIIlIIlI.addStatToSnooper(Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[281]], lllllllllllllIlIllIIlIllIIIlIlII.GL_EXT_texture_lod_bias);
        lllllllllllllIlIllIIlIllIIIlIIlI.addStatToSnooper(Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[282]], lllllllllllllIlIllIIlIllIIIlIlII.GL_EXT_texture_sRGB);
        lllllllllllllIlIllIIlIllIIIlIIlI.addStatToSnooper(Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[283]], lllllllllllllIlIllIIlIllIIIlIlII.GL_EXT_vertex_shader);
        lllllllllllllIlIllIIlIllIIIlIIlI.addStatToSnooper(Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[284]], lllllllllllllIlIllIIlIllIIIlIlII.GL_EXT_vertex_weighting);
        lllllllllllllIlIllIIlIllIIIlIIlI.addStatToSnooper(Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[285]], GL11.glGetInteger(Minecraft.llllIllIllIll[286]));
        GL11.glGetError();
        "".length();
        lllllllllllllIlIllIIlIllIIIlIIlI.addStatToSnooper(Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[287]], GL11.glGetInteger(Minecraft.llllIllIllIll[288]));
        GL11.glGetError();
        "".length();
        lllllllllllllIlIllIIlIllIIIlIIlI.addStatToSnooper(Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[289]], GL11.glGetInteger(Minecraft.llllIllIllIll[290]));
        GL11.glGetError();
        "".length();
        lllllllllllllIlIllIIlIllIIIlIIlI.addStatToSnooper(Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[291]], GL11.glGetInteger(Minecraft.llllIllIllIll[292]));
        GL11.glGetError();
        "".length();
        lllllllllllllIlIllIIlIllIIIlIIlI.addStatToSnooper(Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[293]], GL11.glGetInteger(Minecraft.llllIllIllIll[294]));
        GL11.glGetError();
        "".length();
        lllllllllllllIlIllIIlIllIIIlIIlI.addStatToSnooper(Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[295]], GL11.glGetInteger(Minecraft.llllIllIllIll[296]));
        GL11.glGetError();
        "".length();
        lllllllllllllIlIllIIlIllIIIlIIlI.addStatToSnooper(Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[297]], getGLMaximumTextureSize());
    }
    
    public boolean isUnicode() {
        if (lIlIlIlllIIllll(this.mcLanguageManager.isCurrentLocaleUnicode() ? 1 : 0) && lIlIlIlllIIllll(this.gameSettings.forceUnicodeFont ? 1 : 0)) {
            return Minecraft.llllIllIllIll[0] != 0;
        }
        return Minecraft.llllIllIllIll[1] != 0;
    }
    
    private void runGameLoop() throws IOException {
        final long lllllllllllllIlIllIIllIIlIIlllII = System.nanoTime();
        this.mcProfiler.startSection(Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[69]]);
        if (lIlIlIlllIIlllI(Display.isCreated() ? 1 : 0) && lIlIlIlllIIlllI(Display.isCloseRequested() ? 1 : 0)) {
            this.shutdown();
        }
        if (lIlIlIlllIIlllI(this.isGamePaused ? 1 : 0) && lIlIlIlllIIllIl(this.theWorld)) {
            final float lllllllllllllIlIllIIllIIlIIllIll = this.timer.renderPartialTicks;
            this.timer.updateTimer();
            this.timer.renderPartialTicks = lllllllllllllIlIllIIllIIlIIllIll;
            "".length();
            if (null != null) {
                return;
            }
        }
        else {
            this.timer.updateTimer();
        }
        this.mcProfiler.startSection(Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[70]]);
        synchronized (this.scheduledTasks) {
            "".length();
            if ((161 + 87 - 200 + 120 ^ 139 + 19 - 148 + 162) <= 0) {
                return;
            }
            while (!lIlIlIlllIIlllI(this.scheduledTasks.isEmpty() ? 1 : 0)) {
                Util.func_181617_a(this.scheduledTasks.poll(), Minecraft.logger);
                "".length();
            }
            // monitorexit(this.scheduledTasks)
            "".length();
            if (" ".length() <= -" ".length()) {
                return;
            }
        }
        this.mcProfiler.endSection();
        final long lllllllllllllIlIllIIllIIlIIllIlI = System.nanoTime();
        this.mcProfiler.startSection(Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[71]]);
        int lllllllllllllIlIllIIllIIlIIllIIl = Minecraft.llllIllIllIll[0];
        "".length();
        if (-" ".length() == "   ".length()) {
            return;
        }
        while (!lIlIlIlllIlIIIl(lllllllllllllIlIllIIllIIlIIllIIl, this.timer.elapsedTicks)) {
            this.runTick();
            ++lllllllllllllIlIllIIllIIlIIllIIl;
        }
        this.mcProfiler.endStartSection(Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[72]]);
        final long lllllllllllllIlIllIIllIIlIIllIII = System.nanoTime() - lllllllllllllIlIllIIllIIlIIllIlI;
        this.checkGLError(Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[73]]);
        this.mcProfiler.endStartSection(Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[74]]);
        this.mcSoundHandler.setListener(this.thePlayer, this.timer.renderPartialTicks);
        this.mcProfiler.endSection();
        this.mcProfiler.startSection(Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[75]]);
        GlStateManager.pushMatrix();
        GlStateManager.clear(Minecraft.llllIllIllIll[76]);
        this.framebufferMc.bindFramebuffer((boolean)(Minecraft.llllIllIllIll[1] != 0));
        this.mcProfiler.startSection(Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[77]]);
        GlStateManager.enableTexture2D();
        if (lIlIlIlllIIllIl(this.thePlayer) && lIlIlIlllIIlllI(this.thePlayer.isEntityInsideOpaqueBlock() ? 1 : 0)) {
            this.gameSettings.thirdPersonView = Minecraft.llllIllIllIll[0];
        }
        this.mcProfiler.endSection();
        if (lIlIlIlllIIllll(this.skipRenderWorld ? 1 : 0)) {
            this.mcProfiler.endStartSection(Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[78]]);
            this.entityRenderer.func_181560_a(this.timer.renderPartialTicks, lllllllllllllIlIllIIllIIlIIlllII);
            this.mcProfiler.endSection();
        }
        this.mcProfiler.endSection();
        if (lIlIlIlllIIlllI(this.gameSettings.showDebugInfo ? 1 : 0) && lIlIlIlllIIlllI(this.gameSettings.showDebugProfilerChart ? 1 : 0) && lIlIlIlllIIllll(this.gameSettings.hideGUI ? 1 : 0)) {
            if (lIlIlIlllIIllll(this.mcProfiler.profilingEnabled ? 1 : 0)) {
                this.mcProfiler.clearProfiling();
            }
            this.mcProfiler.profilingEnabled = (Minecraft.llllIllIllIll[1] != 0);
            this.displayDebugInfo(lllllllllllllIlIllIIllIIlIIllIII);
            "".length();
            if (-" ".length() >= (0x7A ^ 0x6F ^ (0xB6 ^ 0xA7))) {
                return;
            }
        }
        else {
            this.mcProfiler.profilingEnabled = (Minecraft.llllIllIllIll[0] != 0);
            this.prevFrameTime = System.nanoTime();
        }
        this.guiAchievement.updateAchievementWindow();
        this.framebufferMc.unbindFramebuffer();
        GlStateManager.popMatrix();
        GlStateManager.pushMatrix();
        this.framebufferMc.framebufferRender(this.displayWidth, this.displayHeight);
        GlStateManager.popMatrix();
        GlStateManager.pushMatrix();
        this.entityRenderer.renderStreamIndicator(this.timer.renderPartialTicks);
        GlStateManager.popMatrix();
        this.mcProfiler.startSection(Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[79]]);
        this.updateDisplay();
        Thread.yield();
        this.mcProfiler.startSection(Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[80]]);
        this.mcProfiler.startSection(Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[81]]);
        this.stream.func_152935_j();
        this.mcProfiler.endStartSection(Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[82]]);
        this.stream.func_152922_k();
        this.mcProfiler.endSection();
        this.mcProfiler.endSection();
        this.checkGLError(Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[83]]);
        this.fpsCounter += Minecraft.llllIllIllIll[1];
        int isGamePaused;
        if (lIlIlIlllIIlllI(this.isSingleplayer() ? 1 : 0) && lIlIlIlllIIllIl(this.currentScreen) && lIlIlIlllIIlllI(this.currentScreen.doesGuiPauseGame() ? 1 : 0) && lIlIlIlllIIllll(this.theIntegratedServer.getPublic() ? 1 : 0)) {
            isGamePaused = Minecraft.llllIllIllIll[1];
            "".length();
            if ((0x5D ^ 0x59) <= "  ".length()) {
                return;
            }
        }
        else {
            isGamePaused = Minecraft.llllIllIllIll[0];
        }
        this.isGamePaused = (isGamePaused != 0);
        final long lllllllllllllIlIllIIllIIlIIlIlll = System.nanoTime();
        this.field_181542_y.func_181747_a(lllllllllllllIlIllIIllIIlIIlIlll - this.field_181543_z);
        this.field_181543_z = lllllllllllllIlIllIIllIIlIIlIlll;
        "".length();
        if (((89 + 39 - 9 + 17 ^ 160 + 166 - 243 + 99) & (58 + 87 - 107 + 101 ^ 141 + 92 - 188 + 136 ^ -" ".length())) > "   ".length()) {
            return;
        }
        while (!lIlIlIlllIllIII(lIlIlIlllIlIllI(getSystemTime(), this.debugUpdateTime + 1000L))) {
            Minecraft.debugFPS = this.fpsCounter;
            final String format = Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[84]];
            final Object[] args = new Object[Minecraft.llllIllIllIll[13]];
            args[Minecraft.llllIllIllIll[0]] = Minecraft.debugFPS;
            args[Minecraft.llllIllIllIll[1]] = RenderChunk.renderChunksUpdated;
            final int n = Minecraft.llllIllIllIll[3];
            String s;
            if (lIlIlIlllIlIlll(RenderChunk.renderChunksUpdated, Minecraft.llllIllIllIll[1])) {
                s = Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[85]];
                "".length();
                if (((0x9E ^ 0x81 ^ (0x32 ^ 0x78)) & (54 + 110 + 10 + 42 ^ 73 + 40 - 65 + 93 ^ -" ".length())) < 0) {
                    return;
                }
            }
            else {
                s = Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[86]];
            }
            args[n] = s;
            final int n2 = Minecraft.llllIllIllIll[8];
            Serializable value;
            if (lIlIlIlllIIllll(lIlIlIlllIlIlIl((float)this.gameSettings.limitFramerate, GameSettings.Options.FRAMERATE_LIMIT.getValueMax()))) {
                value = Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[87]];
                "".length();
                if (null != null) {
                    return;
                }
            }
            else {
                value = this.gameSettings.limitFramerate;
            }
            args[n2] = value;
            final int n3 = Minecraft.llllIllIllIll[9];
            String s2;
            if (lIlIlIlllIIlllI(this.gameSettings.enableVsync ? 1 : 0)) {
                s2 = Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[88]];
                "".length();
                if (null != null) {
                    return;
                }
            }
            else {
                s2 = Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[89]];
            }
            args[n3] = s2;
            final int n4 = Minecraft.llllIllIllIll[10];
            String s3;
            if (lIlIlIlllIIlllI(this.gameSettings.fancyGraphics ? 1 : 0)) {
                s3 = Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[90]];
                "".length();
                if ("   ".length() < " ".length()) {
                    return;
                }
            }
            else {
                s3 = Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[91]];
            }
            args[n4] = s3;
            final int n5 = Minecraft.llllIllIllIll[11];
            String s4;
            if (lIlIlIlllIIllll(this.gameSettings.clouds)) {
                s4 = Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[92]];
                "".length();
                if (" ".length() == 0) {
                    return;
                }
            }
            else if (lIlIlIlllIlIIlI(this.gameSettings.clouds, Minecraft.llllIllIllIll[1])) {
                s4 = Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[93]];
                "".length();
                if (null != null) {
                    return;
                }
            }
            else {
                s4 = Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[94]];
            }
            args[n5] = s4;
            final int n6 = Minecraft.llllIllIllIll[12];
            String s5;
            if (lIlIlIlllIIlllI(OpenGlHelper.useVbo() ? 1 : 0)) {
                s5 = Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[95]];
                "".length();
                if ((0xDF ^ 0x80 ^ (0x7A ^ 0x21)) <= 0) {
                    return;
                }
            }
            else {
                s5 = Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[96]];
            }
            args[n6] = s5;
            this.debug = String.format(format, args);
            RenderChunk.renderChunksUpdated = Minecraft.llllIllIllIll[0];
            this.debugUpdateTime += 1000L;
            this.fpsCounter = Minecraft.llllIllIllIll[0];
            this.usageSnooper.addMemoryStatsToSnooper();
            if (lIlIlIlllIIllll(this.usageSnooper.isSnooperRunning() ? 1 : 0)) {
                this.usageSnooper.startSnooper();
            }
        }
        if (lIlIlIlllIIlllI(this.isFramerateLimitBelowMax() ? 1 : 0)) {
            this.mcProfiler.startSection(Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[97]]);
            Display.sync(this.getLimitFramerate());
            this.mcProfiler.endSection();
        }
        this.mcProfiler.endSection();
    }
    
    public PropertyMap getTwitchDetails() {
        return this.twitchDetails;
    }
    
    private void createDisplay() throws LWJGLException {
        Display.setResizable((boolean)(Minecraft.llllIllIllIll[1] != 0));
        Display.setTitle(Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[41]]);
        try {
            Display.create(new PixelFormat().withDepthBits(Minecraft.llllIllIllIll[35]));
            "".length();
            if (((0xF6 ^ 0xAE) & ~(0xD7 ^ 0x8F)) != 0x0) {
                return;
            }
        }
        catch (LWJGLException lllllllllllllIlIllIIllIllIIlIIIl) {
            Minecraft.logger.error(Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[42]], (Throwable)lllllllllllllIlIllIIllIllIIlIIIl);
            try {
                Thread.sleep(1000L);
                "".length();
                if (-"   ".length() > 0) {
                    return;
                }
            }
            catch (InterruptedException ex) {}
            if (lIlIlIlllIIlllI(this.fullscreen ? 1 : 0)) {
                this.updateDisplayMode();
            }
            Display.create();
        }
    }
    
    public <V> ListenableFuture<V> addScheduledTask(final Callable<V> lllllllllllllIlIllIIlIlIlIlIIIIl) {
        Validate.notNull((Object)lllllllllllllIlIllIIlIlIlIlIIIIl);
        "".length();
        if (lIlIlIlllIIllll(this.isCallingFromMinecraftThread() ? 1 : 0)) {
            final ListenableFutureTask<V> lllllllllllllIlIllIIlIlIlIlIIlII = (ListenableFutureTask<V>)ListenableFutureTask.create((Callable)lllllllllllllIlIllIIlIlIlIlIIIIl);
            synchronized (this.scheduledTasks) {
                this.scheduledTasks.add((FutureTask<?>)lllllllllllllIlIllIIlIlIlIlIIlII);
                "".length();
                final ListenableFutureTask<V> listenableFutureTask = lllllllllllllIlIllIIlIlIlIlIIlII;
                // monitorexit(this.scheduledTasks)
                return (ListenableFuture<V>)listenableFutureTask;
            }
        }
        try {
            return (ListenableFuture<V>)Futures.immediateFuture((Object)lllllllllllllIlIllIIlIlIlIlIIIIl.call());
        }
        catch (Exception lllllllllllllIlIllIIlIlIlIlIIIll) {
            return (ListenableFuture<V>)Futures.immediateFailedCheckedFuture(lllllllllllllIlIllIIlIlIlIlIIIll);
        }
    }
    
    public boolean isFramerateLimitBelowMax() {
        if (lIlIlIlllIllIII(lIlIlIlllIllIIl((float)this.getLimitFramerate(), GameSettings.Options.FRAMERATE_LIMIT.getValueMax()))) {
            return Minecraft.llllIllIllIll[1] != 0;
        }
        return Minecraft.llllIllIllIll[0] != 0;
    }
    
    private static boolean lIlIlIlllIlIIIl(final int lllllllllllllIlIllIIlIlIIIlllIlI, final int lllllllllllllIlIllIIlIlIIIlllIIl) {
        return lllllllllllllIlIllIIlIlIIIlllIlI >= lllllllllllllIlIllIIlIlIIIlllIIl;
    }
    
    public Proxy getProxy() {
        return this.proxy;
    }
    
    public void freeMemory() {
        try {
            Minecraft.memoryReserve = new byte[Minecraft.llllIllIllIll[0]];
            this.renderGlobal.deleteAllDisplayLists();
            "".length();
            if ((0x43 ^ 0x53 ^ (0x64 ^ 0x70)) < (0xF ^ 0x39 ^ (0x62 ^ 0x50))) {
                return;
            }
        }
        catch (Throwable t) {}
        try {
            System.gc();
            this.loadWorld(null);
            "".length();
            if ("  ".length() == 0) {
                return;
            }
        }
        catch (Throwable t2) {}
        System.gc();
    }
    
    public MusicTicker func_181535_r() {
        return this.mcMusicTicker;
    }
    
    protected void checkWindowResize() {
        if (lIlIlIlllIIllll(this.fullscreen ? 1 : 0) && lIlIlIlllIIlllI(Display.wasResized() ? 1 : 0)) {
            final int lllllllllllllIlIllIIllIIlIIIlIlI = this.displayWidth;
            final int lllllllllllllIlIllIIllIIlIIIlIIl = this.displayHeight;
            this.displayWidth = Display.getWidth();
            this.displayHeight = Display.getHeight();
            if (!lIlIlIlllIlIIlI(this.displayWidth, lllllllllllllIlIllIIllIIlIIIlIlI) || lIlIlIlllIlIlll(this.displayHeight, lllllllllllllIlIllIIllIIlIIIlIIl)) {
                if (lIlIlIlllIlIlII(this.displayWidth)) {
                    this.displayWidth = Minecraft.llllIllIllIll[1];
                }
                if (lIlIlIlllIlIlII(this.displayHeight)) {
                    this.displayHeight = Minecraft.llllIllIllIll[1];
                }
                this.resize(this.displayWidth, this.displayHeight);
            }
        }
    }
    
    private static boolean lIlIlIlllIIllII(final int lllllllllllllIlIllIIlIlIIIIllIIl) {
        return lllllllllllllIlIllIIlIlIIIIllIIl > 0;
    }
    
    public ISaveFormat getSaveLoader() {
        return this.saveLoader;
    }
    
    public void updateDisplay() {
        this.mcProfiler.startSection(Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[98]]);
        Display.update();
        this.mcProfiler.endSection();
        this.checkWindowResize();
    }
    
    @Override
    public boolean isSnooperEnabled() {
        return this.gameSettings.snooperEnabled;
    }
    
    public boolean isIntegratedServerRunning() {
        return this.integratedServerIsRunning;
    }
    
    private static int lIlIlIlllIlIlIl(final float n, final float n2) {
        return fcmpl(n, n2);
    }
    
    private static boolean lIlIlIlllIIlIll(final Object lllllllllllllIlIllIIlIlIIIlIIlIl) {
        return lllllllllllllIlIllIIlIlIIIlIIlIl == null;
    }
    
    static {
        lIlIlIlllIIlIIl();
        lIlIlIllIllIlII();
        logger = LogManager.getLogger();
        locationMojangPng = new ResourceLocation(Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[0]]);
        int isRunningOnMac2;
        if (lIlIlIlllIIlIlI(Util.getOSType(), Util.EnumOS.OSX)) {
            isRunningOnMac2 = Minecraft.llllIllIllIll[1];
            "".length();
            if ("  ".length() == 0) {
                return;
            }
        }
        else {
            isRunningOnMac2 = Minecraft.llllIllIllIll[0];
        }
        isRunningOnMac = (isRunningOnMac2 != 0);
        Minecraft.memoryReserve = new byte[Minecraft.llllIllIllIll[2]];
        final DisplayMode[] array = new DisplayMode[Minecraft.llllIllIllIll[3]];
        array[Minecraft.llllIllIllIll[0]] = new DisplayMode(Minecraft.llllIllIllIll[4], Minecraft.llllIllIllIll[5]);
        array[Minecraft.llllIllIllIll[1]] = new DisplayMode(Minecraft.llllIllIllIll[6], Minecraft.llllIllIllIll[7]);
        macDisplayModes = Lists.newArrayList((Object[])array);
    }
    
    public RenderManager getRenderManager() {
        return this.renderManager;
    }
    
    static /* synthetic */ int[] $SWITCH_TABLE$net$minecraft$util$MovingObjectPosition$MovingObjectType() {
        final int[] $switch_TABLE$net$minecraft$util$MovingObjectPosition$MovingObjectType = Minecraft.$SWITCH_TABLE$net$minecraft$util$MovingObjectPosition$MovingObjectType;
        if (lIlIlIlllIIllIl($switch_TABLE$net$minecraft$util$MovingObjectPosition$MovingObjectType)) {
            return $switch_TABLE$net$minecraft$util$MovingObjectPosition$MovingObjectType;
        }
        "".length();
        final char lllllllllllllIlIllIIlIlIIllllIIl = (Object)new int[MovingObjectPosition.MovingObjectType.values().length];
        try {
            lllllllllllllIlIllIIlIlIIllllIIl[MovingObjectPosition.MovingObjectType.BLOCK.ordinal()] = Minecraft.llllIllIllIll[3];
            "".length();
            if (null != null) {
                return null;
            }
        }
        catch (NoSuchFieldError noSuchFieldError) {
            "".length();
        }
        try {
            lllllllllllllIlIllIIlIlIIllllIIl[MovingObjectPosition.MovingObjectType.ENTITY.ordinal()] = Minecraft.llllIllIllIll[8];
            "".length();
            if ((0xDA ^ 0xB0 ^ (0xC5 ^ 0xAA)) <= 0) {
                return null;
            }
        }
        catch (NoSuchFieldError noSuchFieldError2) {
            "".length();
        }
        try {
            lllllllllllllIlIllIIlIlIIllllIIl[MovingObjectPosition.MovingObjectType.MISS.ordinal()] = Minecraft.llllIllIllIll[1];
            "".length();
            if (-" ".length() >= "   ".length()) {
                return null;
            }
        }
        catch (NoSuchFieldError noSuchFieldError3) {
            "".length();
        }
        return Minecraft.$SWITCH_TABLE$net$minecraft$util$MovingObjectPosition$MovingObjectType = (int[])(Object)lllllllllllllIlIllIIlIlIIllllIIl;
    }
    
    public MinecraftSessionService getSessionService() {
        return this.sessionService;
    }
    
    public final boolean isDemo() {
        return this.isDemo;
    }
    
    public PropertyMap func_181037_M() {
        if (lIlIlIlllIIlllI(this.field_181038_N.isEmpty() ? 1 : 0)) {
            final GameProfile lllllllllllllIlIllIIlIlIlllIIIll = this.getSessionService().fillProfileProperties(this.session.getProfile(), (boolean)(Minecraft.llllIllIllIll[0] != 0));
            this.field_181038_N.putAll((Multimap)lllllllllllllIlIllIIlIlIlllIIIll.getProperties());
            "".length();
        }
        return this.field_181038_N;
    }
    
    private static String lIlIlIlIllIIIIl(String lllllllllllllIlIllIIlIlIIlIIlIIl, final String lllllllllllllIlIllIIlIlIIlIIllIl) {
        lllllllllllllIlIllIIlIlIIlIIlIIl = (double)new String(Base64.getDecoder().decode(((String)lllllllllllllIlIllIIlIlIIlIIlIIl).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIlIllIIlIlIIlIIllII = new StringBuilder();
        final char[] lllllllllllllIlIllIIlIlIIlIIlIll = lllllllllllllIlIllIIlIlIIlIIllIl.toCharArray();
        int lllllllllllllIlIllIIlIlIIlIIlIlI = Minecraft.llllIllIllIll[0];
        final short lllllllllllllIlIllIIlIlIIlIIIlII = (Object)((String)lllllllllllllIlIllIIlIlIIlIIlIIl).toCharArray();
        final String lllllllllllllIlIllIIlIlIIlIIIIll = (String)lllllllllllllIlIllIIlIlIIlIIIlII.length;
        short lllllllllllllIlIllIIlIlIIlIIIIlI = (short)Minecraft.llllIllIllIll[0];
        while (lIlIlIlllIllIll(lllllllllllllIlIllIIlIlIIlIIIIlI, (int)lllllllllllllIlIllIIlIlIIlIIIIll)) {
            final char lllllllllllllIlIllIIlIlIIlIIllll = lllllllllllllIlIllIIlIlIIlIIIlII[lllllllllllllIlIllIIlIlIIlIIIIlI];
            lllllllllllllIlIllIIlIlIIlIIllII.append((char)(lllllllllllllIlIllIIlIlIIlIIllll ^ lllllllllllllIlIllIIlIlIIlIIlIll[lllllllllllllIlIllIIlIlIIlIIlIlI % lllllllllllllIlIllIIlIlIIlIIlIll.length]));
            "".length();
            ++lllllllllllllIlIllIIlIlIIlIIlIlI;
            ++lllllllllllllIlIllIIlIlIIlIIIIlI;
            "".length();
            if ("  ".length() < 0) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIlIllIIlIlIIlIIllII);
    }
    
    public static int getGLMaximumTextureSize() {
        int lllllllllllllIlIllIIlIllIIIIlllI = Minecraft.llllIllIllIll[298];
        "".length();
        if (null != null) {
            return (0x50 ^ 0xB ^ (0x6E ^ 0x4)) & (48 + 126 - 99 + 84 ^ 114 + 135 - 81 + 6 ^ -" ".length());
        }
        while (!lIlIlIlllIlIlII(lllllllllllllIlIllIIlIllIIIIlllI)) {
            GL11.glTexImage2D(Minecraft.llllIllIllIll[299], Minecraft.llllIllIllIll[0], Minecraft.llllIllIllIll[300], lllllllllllllIlIllIIlIllIIIIlllI, lllllllllllllIlIllIIlIllIIIIlllI, Minecraft.llllIllIllIll[0], Minecraft.llllIllIllIll[300], Minecraft.llllIllIllIll[301], (ByteBuffer)null);
            final int lllllllllllllIlIllIIlIllIIIIllIl = GL11.glGetTexLevelParameteri(Minecraft.llllIllIllIll[299], Minecraft.llllIllIllIll[0], Minecraft.llllIllIllIll[302]);
            if (lIlIlIlllIIlllI(lllllllllllllIlIllIIlIllIIIIllIl)) {
                return lllllllllllllIlIllIIlIllIIIIlllI;
            }
            lllllllllllllIlIllIIlIllIIIIlllI >>= Minecraft.llllIllIllIll[1];
        }
        return Minecraft.llllIllIllIll[56];
    }
    
    public TextureManager getTextureManager() {
        return this.renderEngine;
    }
    
    private void updateDisplayMode() throws LWJGLException {
        final Set<DisplayMode> lllllllllllllIlIllIIllIlIIIlllIl = (Set<DisplayMode>)Sets.newHashSet();
        Collections.addAll(lllllllllllllIlIllIIllIlIIIlllIl, Display.getAvailableDisplayModes());
        "".length();
        DisplayMode lllllllllllllIlIllIIllIlIIIlllII = Display.getDesktopDisplayMode();
        if (lIlIlIlllIIllll(lllllllllllllIlIllIIllIlIIIlllIl.contains(lllllllllllllIlIllIIllIlIIIlllII) ? 1 : 0) && lIlIlIlllIIlIlI(Util.getOSType(), Util.EnumOS.OSX)) {
            final long lllllllllllllIlIllIIllIlIIIlIIlI = (long)Minecraft.macDisplayModes.iterator();
            "".length();
            if (((0x10 ^ 0x70) & ~(0x4F ^ 0x2F)) != 0x0) {
                return;
            }
        Label_0414:
            while (!lIlIlIlllIIllll(((Iterator)lllllllllllllIlIllIIllIlIIIlIIlI).hasNext() ? 1 : 0)) {
                final DisplayMode lllllllllllllIlIllIIllIlIIIllIll = ((Iterator<DisplayMode>)lllllllllllllIlIllIIllIlIIIlIIlI).next();
                boolean lllllllllllllIlIllIIllIlIIIllIlI = Minecraft.llllIllIllIll[1] != 0;
                final Iterator<DisplayMode> iterator = lllllllllllllIlIllIIllIlIIIlllIl.iterator();
                "".length();
                if (null != null) {
                    return;
                }
                while (!lIlIlIlllIIllll(iterator.hasNext() ? 1 : 0)) {
                    final DisplayMode lllllllllllllIlIllIIllIlIIIllIIl = iterator.next();
                    if (lIlIlIlllIlIIlI(lllllllllllllIlIllIIllIlIIIllIIl.getBitsPerPixel(), Minecraft.llllIllIllIll[43]) && lIlIlIlllIlIIlI(lllllllllllllIlIllIIllIlIIIllIIl.getWidth(), lllllllllllllIlIllIIllIlIIIllIll.getWidth()) && lIlIlIlllIlIIlI(lllllllllllllIlIllIIllIlIIIllIIl.getHeight(), lllllllllllllIlIllIIllIlIIIllIll.getHeight())) {
                        lllllllllllllIlIllIIllIlIIIllIlI = (Minecraft.llllIllIllIll[0] != 0);
                        "".length();
                        if (("  ".length() & ~"  ".length()) < -" ".length()) {
                            return;
                        }
                        break;
                    }
                }
                if (!lIlIlIlllIIllll(lllllllllllllIlIllIIllIlIIIllIlI ? 1 : 0)) {
                    continue;
                }
                final Iterator lllllllllllllIlIllIIllIlIIIllIII = lllllllllllllIlIllIIllIlIIIlllIl.iterator();
                while (!lIlIlIlllIIllll(lllllllllllllIlIllIIllIlIIIllIII.hasNext() ? 1 : 0)) {
                    final DisplayMode lllllllllllllIlIllIIllIlIIIlIlll = lllllllllllllIlIllIIllIlIIIllIII.next();
                    if (lIlIlIlllIlIIlI(lllllllllllllIlIllIIllIlIIIlIlll.getBitsPerPixel(), Minecraft.llllIllIllIll[43]) && lIlIlIlllIlIIlI(lllllllllllllIlIllIIllIlIIIlIlll.getWidth(), lllllllllllllIlIllIIllIlIIIllIll.getWidth() / Minecraft.llllIllIllIll[3]) && lIlIlIlllIlIIlI(lllllllllllllIlIllIIllIlIIIlIlll.getHeight(), lllllllllllllIlIllIIllIlIIIllIll.getHeight() / Minecraft.llllIllIllIll[3])) {
                        lllllllllllllIlIllIIllIlIIIlllII = lllllllllllllIlIllIIllIlIIIlIlll;
                        continue Label_0414;
                    }
                }
                "".length();
                if ((40 + 23 - 34 + 109 ^ 73 + 131 - 127 + 65) <= ((31 + 102 - 55 + 90 ^ 0 + 8 + 62 + 91) & ("  ".length() ^ (0x94 ^ 0x9F) ^ -" ".length()))) {
                    return;
                }
            }
        }
        Display.setDisplayMode(lllllllllllllIlIllIIllIlIIIlllII);
        this.displayWidth = lllllllllllllIlIllIIllIlIIIlllII.getWidth();
        this.displayHeight = lllllllllllllIlIllIIllIlIIIlllII.getHeight();
    }
    
    static /* synthetic */ int[] $SWITCH_TABLE$net$minecraft$entity$item$EntityMinecart$EnumMinecartType() {
        final int[] $switch_TABLE$net$minecraft$entity$item$EntityMinecart$EnumMinecartType = Minecraft.$SWITCH_TABLE$net$minecraft$entity$item$EntityMinecart$EnumMinecartType;
        if (lIlIlIlllIIllIl($switch_TABLE$net$minecraft$entity$item$EntityMinecart$EnumMinecartType)) {
            return $switch_TABLE$net$minecraft$entity$item$EntityMinecart$EnumMinecartType;
        }
        "".length();
        final int lllllllllllllIlIllIIlIlIIlllIlll = (Object)new int[EntityMinecart.EnumMinecartType.values().length];
        try {
            lllllllllllllIlIllIIlIlIIlllIlll[EntityMinecart.EnumMinecartType.CHEST.ordinal()] = Minecraft.llllIllIllIll[3];
            "".length();
            if (null != null) {
                return null;
            }
        }
        catch (NoSuchFieldError noSuchFieldError) {
            "".length();
        }
        try {
            lllllllllllllIlIllIIlIlIIlllIlll[EntityMinecart.EnumMinecartType.COMMAND_BLOCK.ordinal()] = Minecraft.llllIllIllIll[12];
            "".length();
            if (-"   ".length() >= 0) {
                return null;
            }
        }
        catch (NoSuchFieldError noSuchFieldError2) {
            "".length();
        }
        try {
            lllllllllllllIlIllIIlIlIIlllIlll[EntityMinecart.EnumMinecartType.FURNACE.ordinal()] = Minecraft.llllIllIllIll[8];
            "".length();
            if (((0x51 ^ 0x60) & ~(0x5A ^ 0x6B)) != 0x0) {
                return null;
            }
        }
        catch (NoSuchFieldError noSuchFieldError3) {
            "".length();
        }
        try {
            lllllllllllllIlIllIIlIlIIlllIlll[EntityMinecart.EnumMinecartType.HOPPER.ordinal()] = Minecraft.llllIllIllIll[11];
            "".length();
            if ((0x10 ^ 0x27 ^ (0x31 ^ 0x2)) < 0) {
                return null;
            }
        }
        catch (NoSuchFieldError noSuchFieldError4) {
            "".length();
        }
        try {
            lllllllllllllIlIllIIlIlIIlllIlll[EntityMinecart.EnumMinecartType.RIDEABLE.ordinal()] = Minecraft.llllIllIllIll[1];
            "".length();
            if (((107 + 35 - 55 + 119 ^ 122 + 107 - 172 + 100) & (0x7C ^ 0x21 ^ (0x47 ^ 0x49) ^ -" ".length())) == -" ".length()) {
                return null;
            }
        }
        catch (NoSuchFieldError noSuchFieldError5) {
            "".length();
        }
        try {
            lllllllllllllIlIllIIlIlIIlllIlll[EntityMinecart.EnumMinecartType.SPAWNER.ordinal()] = Minecraft.llllIllIllIll[10];
            "".length();
            if (" ".length() == "   ".length()) {
                return null;
            }
        }
        catch (NoSuchFieldError noSuchFieldError6) {
            "".length();
        }
        try {
            lllllllllllllIlIllIIlIlIIlllIlll[EntityMinecart.EnumMinecartType.TNT.ordinal()] = Minecraft.llllIllIllIll[9];
            "".length();
            if (((0x71 ^ 0x40) & ~(0x7C ^ 0x4D)) != 0x0) {
                return null;
            }
        }
        catch (NoSuchFieldError noSuchFieldError7) {
            "".length();
        }
        return Minecraft.$SWITCH_TABLE$net$minecraft$entity$item$EntityMinecart$EnumMinecartType = (int[])(Object)lllllllllllllIlIllIIlIlIIlllIlll;
    }
    
    public ListenableFuture<Object> scheduleResourcesRefresh() {
        return this.addScheduledTask(new Runnable() {
            @Override
            public void run() {
                Minecraft.this.refreshResources();
            }
        });
    }
    
    private void clickMouse() {
        if (lIlIlIlllIlIlII(this.leftClickCounter)) {
            this.thePlayer.swingItem();
            if (lIlIlIlllIIlIll(this.objectMouseOver)) {
                Minecraft.logger.error(Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[120]]);
                if (lIlIlIlllIIlllI(this.playerController.isNotCreative() ? 1 : 0)) {
                    this.leftClickCounter = Minecraft.llllIllIllIll[15];
                    "".length();
                    if (null != null) {
                        return;
                    }
                }
            }
            else {
                switch ($SWITCH_TABLE$net$minecraft$util$MovingObjectPosition$MovingObjectType()[this.objectMouseOver.typeOfHit.ordinal()]) {
                    case 3: {
                        this.playerController.attackEntity(this.thePlayer, this.objectMouseOver.entityHit);
                        "".length();
                        if (((27 + 98 - 58 + 116 ^ 71 + 32 + 40 + 18) & (0xB1 ^ 0xC0 ^ (0xE6 ^ 0x81) ^ -" ".length())) != 0x0) {
                            return;
                        }
                        return;
                    }
                    case 2: {
                        final BlockPos lllllllllllllIlIllIIllIIIIIIllII = this.objectMouseOver.getBlockPos();
                        if (!lIlIlIlllIlIIII(this.theWorld.getBlockState(lllllllllllllIlIllIIllIIIIIIllII).getBlock().getMaterial(), Material.air)) {
                            break;
                        }
                        this.playerController.clickBlock(lllllllllllllIlIllIIllIIIIIIllII, this.objectMouseOver.sideHit);
                        "".length();
                        "".length();
                        if ((0x7B ^ 0x68 ^ (0x4A ^ 0x5D)) <= 0) {
                            return;
                        }
                        return;
                    }
                }
                if (lIlIlIlllIIlllI(this.playerController.isNotCreative() ? 1 : 0)) {
                    this.leftClickCounter = Minecraft.llllIllIllIll[15];
                }
            }
        }
    }
    
    private void setInitialDisplayMode() throws LWJGLException {
        if (lIlIlIlllIIlllI(this.fullscreen ? 1 : 0)) {
            Display.setFullscreen((boolean)(Minecraft.llllIllIllIll[1] != 0));
            final DisplayMode lllllllllllllIlIllIIllIllIIIlIlI = Display.getDisplayMode();
            this.displayWidth = Math.max(Minecraft.llllIllIllIll[1], lllllllllllllIlIllIIllIllIIIlIlI.getWidth());
            this.displayHeight = Math.max(Minecraft.llllIllIllIll[1], lllllllllllllIlIllIIllIllIIIlIlI.getHeight());
            "".length();
            if ((0xA5 ^ 0xA1) < 0) {
                return;
            }
        }
        else {
            Display.setDisplayMode(new DisplayMode(this.displayWidth, this.displayHeight));
        }
    }
    
    public void setDimensionAndSpawnPlayer(final int lllllllllllllIlIllIIlIlllIIIIllI) {
        this.theWorld.setInitialSpawnLocation();
        this.theWorld.removeAllEntities();
        int lllllllllllllIlIllIIlIlllIIIlIlI = Minecraft.llllIllIllIll[0];
        String lllllllllllllIlIllIIlIlllIIIlIIl = null;
        if (lIlIlIlllIIllIl(this.thePlayer)) {
            lllllllllllllIlIllIIlIlllIIIlIlI = this.thePlayer.getEntityId();
            this.theWorld.removeEntity(this.thePlayer);
            lllllllllllllIlIllIIlIlllIIIlIIl = this.thePlayer.getClientBrand();
        }
        this.renderViewEntity = null;
        final EntityPlayerSP lllllllllllllIlIllIIlIlllIIIlIII = this.thePlayer;
        final PlayerControllerMP playerController = this.playerController;
        final WorldClient theWorld = this.theWorld;
        StatFileWriter statFileWriter;
        if (lIlIlIlllIIlIll(this.thePlayer)) {
            statFileWriter = new StatFileWriter();
            "".length();
            if ("   ".length() < 0) {
                return;
            }
        }
        else {
            statFileWriter = this.thePlayer.getStatFileWriter();
        }
        this.thePlayer = playerController.func_178892_a(theWorld, statFileWriter);
        this.thePlayer.getDataWatcher().updateWatchedObjectsFromList(lllllllllllllIlIllIIlIlllIIIlIII.getDataWatcher().getAllWatched());
        this.thePlayer.dimension = lllllllllllllIlIllIIlIlllIIIIllI;
        this.renderViewEntity = this.thePlayer;
        this.thePlayer.preparePlayerToSpawn();
        this.thePlayer.setClientBrand(lllllllllllllIlIllIIlIlllIIIlIIl);
        this.theWorld.spawnEntityInWorld(this.thePlayer);
        "".length();
        this.playerController.flipPlayer(this.thePlayer);
        this.thePlayer.movementInput = new MovementInputFromOptions(this.gameSettings);
        this.thePlayer.setEntityId(lllllllllllllIlIllIIlIlllIIIlIlI);
        this.playerController.setPlayerCapabilities(this.thePlayer);
        this.thePlayer.setReducedDebug(lllllllllllllIlIllIIlIlllIIIlIII.hasReducedDebug());
        if (lIlIlIlllIIlllI((this.currentScreen instanceof GuiGameOver) ? 1 : 0)) {
            this.displayGuiScreen(null);
        }
    }
    
    public void refreshResources() {
        final List<IResourcePack> lllllllllllllIlIllIIllIlIlIIIIll = (List<IResourcePack>)Lists.newArrayList((Iterable)this.defaultResourcePacks);
        final byte lllllllllllllIlIllIIllIlIIllllIl = (byte)this.mcResourcePackRepository.getRepositoryEntries().iterator();
        "".length();
        if (" ".length() != " ".length()) {
            return;
        }
        while (!lIlIlIlllIIllll(((Iterator)lllllllllllllIlIllIIllIlIIllllIl).hasNext() ? 1 : 0)) {
            final ResourcePackRepository.Entry lllllllllllllIlIllIIllIlIlIIIIlI = ((Iterator<ResourcePackRepository.Entry>)lllllllllllllIlIllIIllIlIIllllIl).next();
            lllllllllllllIlIllIIllIlIlIIIIll.add(lllllllllllllIlIllIIllIlIlIIIIlI.getResourcePack());
            "".length();
        }
        if (lIlIlIlllIIllIl(this.mcResourcePackRepository.getResourcePackInstance())) {
            lllllllllllllIlIllIIllIlIlIIIIll.add(this.mcResourcePackRepository.getResourcePackInstance());
            "".length();
        }
        try {
            this.mcResourceManager.reloadResources(lllllllllllllIlIllIIllIlIlIIIIll);
            "".length();
            if ("   ".length() != "   ".length()) {
                return;
            }
        }
        catch (RuntimeException lllllllllllllIlIllIIllIlIlIIIIIl) {
            Minecraft.logger.info(Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[60]], (Throwable)lllllllllllllIlIllIIllIlIlIIIIIl);
            lllllllllllllIlIllIIllIlIlIIIIll.clear();
            lllllllllllllIlIllIIllIlIlIIIIll.addAll(this.defaultResourcePacks);
            "".length();
            this.mcResourcePackRepository.setRepositories(Collections.emptyList());
            this.mcResourceManager.reloadResources(lllllllllllllIlIllIIllIlIlIIIIll);
            this.gameSettings.resourcePacks.clear();
            this.gameSettings.field_183018_l.clear();
            this.gameSettings.saveOptions();
        }
        this.mcLanguageManager.parseLanguageMetadata(lllllllllllllIlIllIIllIlIlIIIIll);
        if (lIlIlIlllIIllIl(this.renderGlobal)) {
            this.renderGlobal.loadRenderers();
        }
    }
    
    private ItemStack func_181036_a(final Item lllllllllllllIlIllIIlIllIIllllIl, final int lllllllllllllIlIllIIlIllIlIIIlIl, final TileEntity lllllllllllllIlIllIIlIllIIlllIll) {
        final ItemStack lllllllllllllIlIllIIlIllIlIIIIll = new ItemStack(lllllllllllllIlIllIIlIllIIllllIl, Minecraft.llllIllIllIll[1], lllllllllllllIlIllIIlIllIlIIIlIl);
        final NBTTagCompound lllllllllllllIlIllIIlIllIlIIIIlI = new NBTTagCompound();
        lllllllllllllIlIllIIlIllIIlllIll.writeToNBT(lllllllllllllIlIllIIlIllIlIIIIlI);
        if (lIlIlIlllIIlIlI(lllllllllllllIlIllIIlIllIIllllIl, Items.skull) && lIlIlIlllIIlllI(lllllllllllllIlIllIIlIllIlIIIIlI.hasKey(Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[154]]) ? 1 : 0)) {
            final NBTTagCompound lllllllllllllIlIllIIlIllIlIIIIIl = lllllllllllllIlIllIIlIllIlIIIIlI.getCompoundTag(Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[155]]);
            final NBTTagCompound lllllllllllllIlIllIIlIllIlIIIIII = new NBTTagCompound();
            lllllllllllllIlIllIIlIllIlIIIIII.setTag(Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[156]], lllllllllllllIlIllIIlIllIlIIIIIl);
            lllllllllllllIlIllIIlIllIlIIIIll.setTagCompound(lllllllllllllIlIllIIlIllIlIIIIII);
            return lllllllllllllIlIllIIlIllIlIIIIll;
        }
        lllllllllllllIlIllIIlIllIlIIIIll.setTagInfo(Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[157]], lllllllllllllIlIllIIlIllIlIIIIlI);
        final NBTTagCompound lllllllllllllIlIllIIlIllIIllllll = new NBTTagCompound();
        final NBTTagList lllllllllllllIlIllIIlIllIIlllllI = new NBTTagList();
        lllllllllllllIlIllIIlIllIIlllllI.appendTag(new NBTTagString(Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[158]]));
        lllllllllllllIlIllIIlIllIIllllll.setTag(Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[159]], lllllllllllllIlIllIIlIllIIlllllI);
        lllllllllllllIlIllIIlIllIlIIIIll.setTagInfo(Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[160]], lllllllllllllIlIllIIlIllIIllllll);
        return lllllllllllllIlIllIIlIllIlIIIIll;
    }
    
    public void setServerData(final ServerData lllllllllllllIlIllIIlIllIIIIIlII) {
        this.currentServerData = lllllllllllllIlIllIIlIllIIIIIlII;
    }
    
    private static boolean lIlIlIlllIIllIl(final Object lllllllllllllIlIllIIlIlIIIlIIlll) {
        return lllllllllllllIlIllIIlIlIIIlIIlll != null;
    }
    
    public IntegratedServer getIntegratedServer() {
        return this.theIntegratedServer;
    }
    
    public Entity getRenderViewEntity() {
        return this.renderViewEntity;
    }
    
    public void crashed(final CrashReport lllllllllllllIlIllIIllIlIlIllIII) {
        this.hasCrashed = (Minecraft.llllIllIllIll[1] != 0);
        this.crashReporter = lllllllllllllIlIllIIllIlIlIllIII;
    }
    
    public void launchIntegratedServer(final String lllllllllllllIlIllIIlIlllIllIlll, final String lllllllllllllIlIllIIlIlllIllIllI, WorldSettings lllllllllllllIlIllIIlIlllIlIlIIl) {
        this.loadWorld(null);
        System.gc();
        final ISaveHandler lllllllllllllIlIllIIlIlllIllIlII = this.saveLoader.getSaveLoader(lllllllllllllIlIllIIlIlllIllIlll, (boolean)(Minecraft.llllIllIllIll[0] != 0));
        WorldInfo lllllllllllllIlIllIIlIlllIllIIll = lllllllllllllIlIllIIlIlllIllIlII.loadWorldInfo();
        if (lIlIlIlllIIlIll(lllllllllllllIlIllIIlIlllIllIIll) && lIlIlIlllIIllIl(lllllllllllllIlIllIIlIlllIlIlIIl)) {
            lllllllllllllIlIllIIlIlllIllIIll = new WorldInfo(lllllllllllllIlIllIIlIlllIlIlIIl, lllllllllllllIlIllIIlIlllIllIlll);
            lllllllllllllIlIllIIlIlllIllIlII.saveWorldInfo(lllllllllllllIlIllIIlIlllIllIIll);
        }
        if (lIlIlIlllIIlIll(lllllllllllllIlIllIIlIlllIlIlIIl)) {
            lllllllllllllIlIllIIlIlllIlIlIIl = new WorldSettings(lllllllllllllIlIllIIlIlllIllIIll);
        }
        try {
            this.theIntegratedServer = new IntegratedServer(this, lllllllllllllIlIllIIlIlllIllIlll, lllllllllllllIlIllIIlIlllIllIllI, lllllllllllllIlIllIIlIlllIlIlIIl);
            this.theIntegratedServer.startServerThread();
            this.integratedServerIsRunning = (Minecraft.llllIllIllIll[1] != 0);
            "".length();
            if ("   ".length() < "   ".length()) {
                return;
            }
        }
        catch (Throwable lllllllllllllIlIllIIlIlllIllIIlI) {
            final CrashReport lllllllllllllIlIllIIlIlllIllIIIl = CrashReport.makeCrashReport(lllllllllllllIlIllIIlIlllIllIIlI, Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[146]]);
            final CrashReportCategory lllllllllllllIlIllIIlIlllIllIIII = lllllllllllllIlIllIIlIlllIllIIIl.makeCategory(Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[147]]);
            lllllllllllllIlIllIIlIlllIllIIII.addCrashSection(Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[148]], lllllllllllllIlIllIIlIlllIllIlll);
            lllllllllllllIlIllIIlIlllIllIIII.addCrashSection(Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[149]], lllllllllllllIlIllIIlIlllIllIllI);
            throw new ReportedException(lllllllllllllIlIllIIlIlllIllIIIl);
        }
        this.loadingScreen.displaySavingString(I18n.format(Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[150]], new Object[Minecraft.llllIllIllIll[0]]));
        "".length();
        if (null != null) {
            return;
        }
        while (!lIlIlIlllIIlllI(this.theIntegratedServer.serverIsInRunLoop() ? 1 : 0)) {
            final String lllllllllllllIlIllIIlIlllIlIllll = this.theIntegratedServer.getUserMessage();
            if (lIlIlIlllIIllIl(lllllllllllllIlIllIIlIlllIlIllll)) {
                this.loadingScreen.displayLoadingString(I18n.format(lllllllllllllIlIllIIlIlllIlIllll, new Object[Minecraft.llllIllIllIll[0]]));
                "".length();
                if ("   ".length() <= -" ".length()) {
                    return;
                }
            }
            else {
                this.loadingScreen.displayLoadingString(Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[151]]);
            }
            try {
                Thread.sleep(200L);
                "".length();
                if ("  ".length() != "  ".length()) {
                    return;
                }
                continue;
            }
            catch (InterruptedException ex) {}
        }
        this.displayGuiScreen(null);
        final SocketAddress lllllllllllllIlIllIIlIlllIlIlllI = this.theIntegratedServer.getNetworkSystem().addLocalEndpoint();
        final NetworkManager lllllllllllllIlIllIIlIlllIlIllIl = NetworkManager.provideLocalClient(lllllllllllllIlIllIIlIlllIlIlllI);
        lllllllllllllIlIllIIlIlllIlIllIl.setNetHandler(new NetHandlerLoginClient(lllllllllllllIlIllIIlIlllIlIllIl, this, null));
        lllllllllllllIlIllIIlIlllIlIllIl.sendPacket(new C00Handshake(Minecraft.llllIllIllIll[60], lllllllllllllIlIllIIlIlllIlIlllI.toString(), Minecraft.llllIllIllIll[0], EnumConnectionState.LOGIN));
        lllllllllllllIlIllIIlIlllIlIllIl.sendPacket(new C00PacketLoginStart(this.getSession().getProfile()));
        this.myNetworkManager = lllllllllllllIlIllIIlIlllIlIllIl;
    }
    
    private static int lIlIlIllllIIlIl(final long n, final long n2) {
        return lcmp(n, n2);
    }
    
    private static boolean lIlIlIlllIlIIlI(final int lllllllllllllIlIllIIlIlIIIlllllI, final int lllllllllllllIlIllIIlIlIIIllllIl) {
        return lllllllllllllIlIllIIlIlIIIlllllI == lllllllllllllIlIllIIlIlIIIllllIl;
    }
    
    private void resize(final int lllllllllllllIlIllIIlIlllllIlIlI, final int lllllllllllllIlIllIIlIlllllIlIIl) {
        this.displayWidth = Math.max(Minecraft.llllIllIllIll[1], lllllllllllllIlIllIIlIlllllIlIlI);
        this.displayHeight = Math.max(Minecraft.llllIllIllIll[1], lllllllllllllIlIllIIlIlllllIlIIl);
        if (lIlIlIlllIIllIl(this.currentScreen)) {
            final ScaledResolution lllllllllllllIlIllIIlIlllllIllII = new ScaledResolution(this);
            this.currentScreen.onResize(this, lllllllllllllIlIllIIlIlllllIllII.getScaledWidth(), lllllllllllllIlIllIIlIlllllIllII.getScaledHeight());
        }
        this.loadingScreen = new LoadingScreenRenderer(this);
        this.updateFramebufferSize();
    }
    
    private void rightClickMouse() {
        if (lIlIlIlllIIllll(this.playerController.func_181040_m() ? 1 : 0)) {
            this.rightClickDelayTimer = Minecraft.llllIllIllIll[9];
            boolean lllllllllllllIlIllIIllIIIIIIIIll = Minecraft.llllIllIllIll[1] != 0;
            final ItemStack lllllllllllllIlIllIIllIIIIIIIIlI = this.thePlayer.inventory.getCurrentItem();
            if (lIlIlIlllIIlIll(this.objectMouseOver)) {
                Minecraft.logger.warn(Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[121]]);
                "".length();
                if (" ".length() <= -" ".length()) {
                    return;
                }
            }
            else {
                switch ($SWITCH_TABLE$net$minecraft$util$MovingObjectPosition$MovingObjectType()[this.objectMouseOver.typeOfHit.ordinal()]) {
                    case 3: {
                        if (lIlIlIlllIIlllI(this.playerController.func_178894_a(this.thePlayer, this.objectMouseOver.entityHit, this.objectMouseOver) ? 1 : 0)) {
                            lllllllllllllIlIllIIllIIIIIIIIll = (Minecraft.llllIllIllIll[0] != 0);
                            "".length();
                            if (null != null) {
                                return;
                            }
                            break;
                        }
                        else {
                            if (!lIlIlIlllIIlllI(this.playerController.interactWithEntitySendPacket(this.thePlayer, this.objectMouseOver.entityHit) ? 1 : 0)) {
                                break;
                            }
                            lllllllllllllIlIllIIllIIIIIIIIll = (Minecraft.llllIllIllIll[0] != 0);
                            "".length();
                            if ("   ".length() >= (0x94 ^ 0x90)) {
                                return;
                            }
                            break;
                        }
                        break;
                    }
                    case 2: {
                        final BlockPos lllllllllllllIlIllIIllIIIIIIIIIl = this.objectMouseOver.getBlockPos();
                        if (!lIlIlIlllIlIIII(this.theWorld.getBlockState(lllllllllllllIlIllIIllIIIIIIIIIl).getBlock().getMaterial(), Material.air)) {
                            break;
                        }
                        int stackSize;
                        if (lIlIlIlllIIllIl(lllllllllllllIlIllIIllIIIIIIIIlI)) {
                            stackSize = lllllllllllllIlIllIIllIIIIIIIIlI.stackSize;
                            "".length();
                            if (((0x29 ^ 0x3A ^ (0x52 ^ 0x4C)) & (28 + 72 + 52 + 6 ^ 136 + 118 - 138 + 31 ^ -" ".length())) != 0x0) {
                                return;
                            }
                        }
                        else {
                            stackSize = Minecraft.llllIllIllIll[0];
                        }
                        final int lllllllllllllIlIllIIllIIIIIIIIII = stackSize;
                        if (lIlIlIlllIIlllI(this.playerController.onPlayerRightClick(this.thePlayer, this.theWorld, lllllllllllllIlIllIIllIIIIIIIIlI, lllllllllllllIlIllIIllIIIIIIIIIl, this.objectMouseOver.sideHit, this.objectMouseOver.hitVec) ? 1 : 0)) {
                            lllllllllllllIlIllIIllIIIIIIIIll = (Minecraft.llllIllIllIll[0] != 0);
                            this.thePlayer.swingItem();
                        }
                        if (lIlIlIlllIIlIll(lllllllllllllIlIllIIllIIIIIIIIlI)) {
                            return;
                        }
                        if (lIlIlIlllIIllll(lllllllllllllIlIllIIllIIIIIIIIlI.stackSize)) {
                            this.thePlayer.inventory.mainInventory[this.thePlayer.inventory.currentItem] = null;
                            "".length();
                            if ("   ".length() != "   ".length()) {
                                return;
                            }
                            break;
                        }
                        else {
                            if (!lIlIlIlllIlIIlI(lllllllllllllIlIllIIllIIIIIIIIlI.stackSize, lllllllllllllIlIllIIllIIIIIIIIII) || lIlIlIlllIIlllI(this.playerController.isInCreativeMode() ? 1 : 0)) {
                                this.entityRenderer.itemRenderer.resetEquippedProgress();
                                break;
                            }
                            break;
                        }
                        break;
                    }
                }
            }
            if (lIlIlIlllIIlllI(lllllllllllllIlIllIIllIIIIIIIIll ? 1 : 0)) {
                final ItemStack lllllllllllllIlIllIIlIllllllllll = this.thePlayer.inventory.getCurrentItem();
                if (lIlIlIlllIIllIl(lllllllllllllIlIllIIlIllllllllll) && lIlIlIlllIIlllI(this.playerController.sendUseItem(this.thePlayer, this.theWorld, lllllllllllllIlIllIIlIllllllllll) ? 1 : 0)) {
                    this.entityRenderer.itemRenderer.resetEquippedProgress2();
                }
            }
        }
    }
    
    public void dispatchKeypresses() {
        int n;
        if (lIlIlIlllIIllll(Keyboard.getEventKey())) {
            n = Keyboard.getEventCharacter();
            "".length();
            if ("   ".length() <= " ".length()) {
                return;
            }
        }
        else {
            n = Keyboard.getEventKey();
        }
        final int lllllllllllllIlIllIIlIlIlIllllII = n;
        if (lIlIlIlllIIlllI(lllllllllllllIlIllIIlIlIlIllllII) && lIlIlIlllIIllll(Keyboard.isRepeatEvent() ? 1 : 0) && (!lIlIlIlllIIlllI((this.currentScreen instanceof GuiControls) ? 1 : 0) || lIlIlIlllIlIlII(lIlIlIllllIIlIl(((GuiControls)this.currentScreen).time, getSystemTime() - 20L)))) {
            if (lIlIlIlllIIlllI(Keyboard.getEventKeyState() ? 1 : 0)) {
                if (lIlIlIlllIlIIlI(lllllllllllllIlIllIIlIlIlIllllII, this.gameSettings.keyBindStreamStartStop.getKeyCode())) {
                    if (lIlIlIlllIIlllI(this.getTwitchStream().isBroadcasting() ? 1 : 0)) {
                        this.getTwitchStream().stopBroadcasting();
                        "".length();
                        if (null != null) {
                            return;
                        }
                    }
                    else if (lIlIlIlllIIlllI(this.getTwitchStream().isReadyToBroadcast() ? 1 : 0)) {
                        this.displayGuiScreen(new GuiYesNo(new GuiYesNoCallback() {
                            @Override
                            public void confirmClicked(final boolean llllllllllllIllllIlllllIIlIlllII, final int llllllllllllIllllIlllllIIlIllllI) {
                                if (lIIIIIlIlllIllll(llllllllllllIllllIlllllIIlIlllII ? 1 : 0)) {
                                    Minecraft.this.getTwitchStream().func_152930_t();
                                }
                                Minecraft.this.displayGuiScreen(null);
                            }
                            
                            private static boolean lIIIIIlIlllIllll(final int llllllllllllIllllIlllllIIlIllIlI) {
                                return llllllllllllIllllIlllllIIlIllIlI != 0;
                            }
                        }, I18n.format(Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[303]], new Object[Minecraft.llllIllIllIll[0]]), Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[304]], Minecraft.llllIllIllIll[0]));
                        "".length();
                        if (-" ".length() >= " ".length()) {
                            return;
                        }
                    }
                    else if (lIlIlIlllIIlllI(this.getTwitchStream().func_152928_D() ? 1 : 0) && lIlIlIlllIIlllI(this.getTwitchStream().func_152936_l() ? 1 : 0)) {
                        if (lIlIlIlllIIllIl(this.theWorld)) {
                            this.ingameGUI.getChatGUI().printChatMessage(new ChatComponentText(Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[305]]));
                            "".length();
                            if (" ".length() == "   ".length()) {
                                return;
                            }
                        }
                    }
                    else {
                        GuiStreamUnavailable.func_152321_a(this.currentScreen);
                        "".length();
                        if (((0x18 ^ 0x22 ^ (0x7B ^ 0x77)) & (77 + 139 - 164 + 130 ^ 123 + 21 - 109 + 93 ^ -" ".length())) != 0x0) {
                            return;
                        }
                    }
                }
                else if (lIlIlIlllIlIIlI(lllllllllllllIlIllIIlIlIlIllllII, this.gameSettings.keyBindStreamPauseUnpause.getKeyCode())) {
                    if (lIlIlIlllIIlllI(this.getTwitchStream().isBroadcasting() ? 1 : 0)) {
                        if (lIlIlIlllIIlllI(this.getTwitchStream().isPaused() ? 1 : 0)) {
                            this.getTwitchStream().unpause();
                            "".length();
                            if ((0x80 ^ 0xBD ^ (0x36 ^ 0xF)) < ((0x57 ^ 0x1B ^ (0xFD ^ 0x96)) & (0x8 ^ 0x12 ^ (0x6D ^ 0x50) ^ -" ".length()))) {
                                return;
                            }
                        }
                        else {
                            this.getTwitchStream().pause();
                            "".length();
                            if (" ".length() >= (0x72 ^ 0x49 ^ (0x4F ^ 0x70))) {
                                return;
                            }
                        }
                    }
                }
                else if (lIlIlIlllIlIIlI(lllllllllllllIlIllIIlIlIlIllllII, this.gameSettings.keyBindStreamCommercials.getKeyCode())) {
                    if (lIlIlIlllIIlllI(this.getTwitchStream().isBroadcasting() ? 1 : 0)) {
                        this.getTwitchStream().requestCommercial();
                        "".length();
                        if (null != null) {
                            return;
                        }
                    }
                }
                else if (lIlIlIlllIlIIlI(lllllllllllllIlIllIIlIlIlIllllII, this.gameSettings.keyBindStreamToggleMic.getKeyCode())) {
                    this.stream.muteMicrophone((boolean)(Minecraft.llllIllIllIll[1] != 0));
                    "".length();
                    if ("   ".length() > (0x43 ^ 0x69 ^ (0x47 ^ 0x69))) {
                        return;
                    }
                }
                else if (lIlIlIlllIlIIlI(lllllllllllllIlIllIIlIlIlIllllII, this.gameSettings.keyBindFullscreen.getKeyCode())) {
                    this.toggleFullscreen();
                    "".length();
                    if (null != null) {
                        return;
                    }
                }
                else if (lIlIlIlllIlIIlI(lllllllllllllIlIllIIlIlIlIllllII, this.gameSettings.keyBindScreenshot.getKeyCode())) {
                    this.ingameGUI.getChatGUI().printChatMessage(ScreenShotHelper.saveScreenshot(this.mcDataDir, this.displayWidth, this.displayHeight, this.framebufferMc));
                    "".length();
                    if (null != null) {
                        return;
                    }
                }
            }
            else if (lIlIlIlllIlIIlI(lllllllllllllIlIllIIlIlIlIllllII, this.gameSettings.keyBindStreamToggleMic.getKeyCode())) {
                this.stream.muteMicrophone((boolean)(Minecraft.llllIllIllIll[0] != 0));
            }
        }
    }
    
    private ByteBuffer readImageToBuffer(final InputStream lllllllllllllIlIllIIllIlIIlIlllI) throws IOException {
        final BufferedImage lllllllllllllIlIllIIllIlIIllIIlI = ImageIO.read(lllllllllllllIlIllIIllIlIIlIlllI);
        final int[] lllllllllllllIlIllIIllIlIIllIIIl = lllllllllllllIlIllIIllIlIIllIIlI.getRGB(Minecraft.llllIllIllIll[0], Minecraft.llllIllIllIll[0], lllllllllllllIlIllIIllIlIIllIIlI.getWidth(), lllllllllllllIlIllIIllIlIIllIIlI.getHeight(), null, Minecraft.llllIllIllIll[0], lllllllllllllIlIllIIllIlIIllIIlI.getWidth());
        final ByteBuffer lllllllllllllIlIllIIllIlIIllIIII = ByteBuffer.allocate(Minecraft.llllIllIllIll[9] * lllllllllllllIlIllIIllIlIIllIIIl.length);
        final Exception lllllllllllllIlIllIIllIlIIlIIlll;
        final double lllllllllllllIlIllIIllIlIIlIlIII = ((int[])(Object)(lllllllllllllIlIllIIllIlIIlIIlll = (Exception)(Object)lllllllllllllIlIllIIllIlIIllIIIl)).length;
        float lllllllllllllIlIllIIllIlIIlIlIIl = Minecraft.llllIllIllIll[0];
        "".length();
        if (null != null) {
            return null;
        }
        while (!lIlIlIlllIlIIIl((int)lllllllllllllIlIllIIllIlIIlIlIIl, (int)lllllllllllllIlIllIIllIlIIlIlIII)) {
            final int lllllllllllllIlIllIIllIlIIlIllll = lllllllllllllIlIllIIllIlIIlIIlll[lllllllllllllIlIllIIllIlIIlIlIIl];
            lllllllllllllIlIllIIllIlIIllIIII.putInt(lllllllllllllIlIllIIllIlIIlIllll << Minecraft.llllIllIllIll[13] | (lllllllllllllIlIllIIllIlIIlIllll >> Minecraft.llllIllIllIll[35] & Minecraft.llllIllIllIll[61]));
            "".length();
            ++lllllllllllllIlIllIIllIlIIlIlIIl;
        }
        lllllllllllllIlIllIIllIlIIllIIII.flip();
        "".length();
        return lllllllllllllIlIllIIllIlIIllIIII;
    }
    
    public void func_181536_a(final int lllllllllllllIlIllIIllIIlllIIIIl, final int lllllllllllllIlIllIIllIIllIlIIll, final int lllllllllllllIlIllIIllIIllIlllll, final int lllllllllllllIlIllIIllIIllIlIIIl, final int lllllllllllllIlIllIIllIIllIlIIII, final int lllllllllllllIlIllIIllIIllIlllII, final int lllllllllllllIlIllIIllIIllIIlllI, final int lllllllllllllIlIllIIllIIllIIllIl, final int lllllllllllllIlIllIIllIIllIIllII, final int lllllllllllllIlIllIIllIIllIIlIll) {
        final float lllllllllllllIlIllIIllIIllIlIlll = 0.00390625f;
        final float lllllllllllllIlIllIIllIIllIlIllI = 0.00390625f;
        final WorldRenderer lllllllllllllIlIllIIllIIllIlIlIl = Tessellator.getInstance().getWorldRenderer();
        lllllllllllllIlIllIIllIIllIlIlIl.begin(Minecraft.llllIllIllIll[12], DefaultVertexFormats.POSITION_TEX_COLOR);
        lllllllllllllIlIllIIllIIllIlIlIl.pos(lllllllllllllIlIllIIllIIlllIIIIl, lllllllllllllIlIllIIllIIllIlIIll + lllllllllllllIlIllIIllIIllIlllII, 0.0).tex(lllllllllllllIlIllIIllIIllIlllll * lllllllllllllIlIllIIllIIllIlIlll, (lllllllllllllIlIllIIllIIllIlIIIl + lllllllllllllIlIllIIllIIllIlllII) * lllllllllllllIlIllIIllIIllIlIllI).color(lllllllllllllIlIllIIllIIllIIlllI, lllllllllllllIlIllIIllIIllIIllIl, lllllllllllllIlIllIIllIIllIIllII, lllllllllllllIlIllIIllIIllIIlIll).endVertex();
        lllllllllllllIlIllIIllIIllIlIlIl.pos(lllllllllllllIlIllIIllIIlllIIIIl + lllllllllllllIlIllIIllIIllIlIIII, lllllllllllllIlIllIIllIIllIlIIll + lllllllllllllIlIllIIllIIllIlllII, 0.0).tex((lllllllllllllIlIllIIllIIllIlllll + lllllllllllllIlIllIIllIIllIlIIII) * lllllllllllllIlIllIIllIIllIlIlll, (lllllllllllllIlIllIIllIIllIlIIIl + lllllllllllllIlIllIIllIIllIlllII) * lllllllllllllIlIllIIllIIllIlIllI).color(lllllllllllllIlIllIIllIIllIIlllI, lllllllllllllIlIllIIllIIllIIllIl, lllllllllllllIlIllIIllIIllIIllII, lllllllllllllIlIllIIllIIllIIlIll).endVertex();
        lllllllllllllIlIllIIllIIllIlIlIl.pos(lllllllllllllIlIllIIllIIlllIIIIl + lllllllllllllIlIllIIllIIllIlIIII, lllllllllllllIlIllIIllIIllIlIIll, 0.0).tex((lllllllllllllIlIllIIllIIllIlllll + lllllllllllllIlIllIIllIIllIlIIII) * lllllllllllllIlIllIIllIIllIlIlll, lllllllllllllIlIllIIllIIllIlIIIl * lllllllllllllIlIllIIllIIllIlIllI).color(lllllllllllllIlIllIIllIIllIIlllI, lllllllllllllIlIllIIllIIllIIllIl, lllllllllllllIlIllIIllIIllIIllII, lllllllllllllIlIllIIllIIllIIlIll).endVertex();
        lllllllllllllIlIllIIllIIllIlIlIl.pos(lllllllllllllIlIllIIllIIlllIIIIl, lllllllllllllIlIllIIllIIllIlIIll, 0.0).tex(lllllllllllllIlIllIIllIIllIlllll * lllllllllllllIlIllIIllIIllIlIlll, lllllllllllllIlIllIIllIIllIlIIIl * lllllllllllllIlIllIIllIIllIlIllI).color(lllllllllllllIlIllIIllIIllIIlllI, lllllllllllllIlIllIIllIIllIIllIl, lllllllllllllIlIllIIllIIllIIllII, lllllllllllllIlIllIIllIIllIIlIll).endVertex();
        Tessellator.getInstance().draw();
    }
    
    private static String lIlIlIlIllIIIll(final String lllllllllllllIlIllIIlIlIIllIlIll, final String lllllllllllllIlIllIIlIlIIllIlIlI) {
        try {
            final SecretKeySpec lllllllllllllIlIllIIlIlIIllIlllI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIlIllIIlIlIIllIlIlI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lllllllllllllIlIllIIlIlIIllIllIl = Cipher.getInstance("Blowfish");
            lllllllllllllIlIllIIlIlIIllIllIl.init(Minecraft.llllIllIllIll[3], lllllllllllllIlIllIIlIlIIllIlllI);
            return new String(lllllllllllllIlIllIIlIlIIllIllIl.doFinal(Base64.getDecoder().decode(lllllllllllllIlIllIIlIlIIllIlIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIlIllIIlIlIIllIllII) {
            lllllllllllllIlIllIIlIlIIllIllII.printStackTrace();
            return null;
        }
    }
    
    public void displayInGameMenu() {
        if (lIlIlIlllIIlIll(this.currentScreen)) {
            this.displayGuiScreen(new GuiIngameMenu());
            if (lIlIlIlllIIlllI(this.isSingleplayer() ? 1 : 0) && lIlIlIlllIIllll(this.theIntegratedServer.getPublic() ? 1 : 0)) {
                this.mcSoundHandler.pauseSounds();
            }
        }
    }
    
    public CrashReport addGraphicsAndWorldToCrashReport(final CrashReport lllllllllllllIlIllIIlIllIIllIIll) {
        lllllllllllllIlIllIIlIllIIllIIll.getCategory().addCrashSectionCallable(Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[161]], new Callable<String>() {
            @Override
            public String call() throws Exception {
                return Minecraft.this.launchedVersion;
            }
        });
        lllllllllllllIlIllIIlIllIIllIIll.getCategory().addCrashSectionCallable(Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[162]], new Callable<String>() {
            @Override
            public String call() {
                return Sys.getVersion();
            }
        });
        lllllllllllllIlIllIIlIllIIllIIll.getCategory().addCrashSectionCallable(Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[163]], new Callable<String>() {
            private static final /* synthetic */ String[] llIIIlIlllIlIl;
            private static final /* synthetic */ int[] llIIIlIlllIlll;
            
            private static String lIIIlIIlllIIlllI(String llllllllllllIlllIlIlIIlllIlllIIl, final String llllllllllllIlllIlIlIIlllIllllll) {
                llllllllllllIlllIlIlIIlllIlllIIl = new String(Base64.getDecoder().decode(llllllllllllIlllIlIlIIlllIlllIIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
                final StringBuilder llllllllllllIlllIlIlIIlllIlllllI = new StringBuilder();
                final char[] llllllllllllIlllIlIlIIlllIllllIl = llllllllllllIlllIlIlIIlllIllllll.toCharArray();
                int llllllllllllIlllIlIlIIlllIlllIll = Minecraft$7.llIIIlIlllIlll[1];
                final int llllllllllllIlllIlIlIIlllIllIIlI = (Object)llllllllllllIlllIlIlIIlllIlllIIl.toCharArray();
                final Exception llllllllllllIlllIlIlIIlllIllIIIl = (Exception)llllllllllllIlllIlIlIIlllIllIIlI.length;
                boolean llllllllllllIlllIlIlIIlllIlIllll = Minecraft$7.llIIIlIlllIlll[1] != 0;
                while (lIIIlIIlllIlIllI(llllllllllllIlllIlIlIIlllIlIllll ? 1 : 0, (int)llllllllllllIlllIlIlIIlllIllIIIl)) {
                    final char llllllllllllIlllIlIlIIllllIIIIlI = llllllllllllIlllIlIlIIlllIllIIlI[llllllllllllIlllIlIlIIlllIlIllll];
                    llllllllllllIlllIlIlIIlllIlllllI.append((char)(llllllllllllIlllIlIlIIllllIIIIlI ^ llllllllllllIlllIlIlIIlllIllllIl[llllllllllllIlllIlIlIIlllIlllIll % llllllllllllIlllIlIlIIlllIllllIl.length]));
                    "".length();
                    ++llllllllllllIlllIlIlIIlllIlllIll;
                    ++llllllllllllIlllIlIlIIlllIlIllll;
                    "".length();
                    if (-(0x37 ^ 0x12 ^ (0x16 ^ 0x37)) >= 0) {
                        return null;
                    }
                }
                return String.valueOf(llllllllllllIlllIlIlIIlllIlllllI);
            }
            
            static {
                lIIIlIIlllIlIlIl();
                lIIIlIIlllIIllll();
            }
            
            private static void lIIIlIIlllIIllll() {
                (llIIIlIlllIlIl = new String[Minecraft$7.llIIIlIlllIlll[5]])[Minecraft$7.llIIIlIlllIlll[1]] = lIIIlIIlllIIllIl("GRa5yKXCDd/TwH4OAEIWmw==", "tspbX");
                Minecraft$7.llIIIlIlllIlIl[Minecraft$7.llIIIlIlllIlll[3]] = lIIIlIIlllIIlllI("Zlk=", "JyBvp");
            }
            
            private static boolean lIIIlIIlllIlIllI(final int llllllllllllIlllIlIlIIlllIlIIlII, final int llllllllllllIlllIlIlIIlllIlIIIlI) {
                return llllllllllllIlllIlIlIIlllIlIIlII < llllllllllllIlllIlIlIIlllIlIIIlI;
            }
            
            private static String lIIIlIIlllIIllIl(final String llllllllllllIlllIlIlIIllllIlIIII, final String llllllllllllIlllIlIlIIllllIIllll) {
                try {
                    final SecretKeySpec llllllllllllIlllIlIlIIllllIlIlIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIlllIlIlIIllllIIllll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
                    final Cipher llllllllllllIlllIlIlIIllllIlIlII = Cipher.getInstance("Blowfish");
                    llllllllllllIlllIlIlIIllllIlIlII.init(Minecraft$7.llIIIlIlllIlll[5], llllllllllllIlllIlIlIIllllIlIlIl);
                    return new String(llllllllllllIlllIlIlIIllllIlIlII.doFinal(Base64.getDecoder().decode(llllllllllllIlllIlIlIIllllIlIIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
                }
                catch (Exception llllllllllllIlllIlIlIIllllIlIIll) {
                    llllllllllllIlllIlIlIIllllIlIIll.printStackTrace();
                    return null;
                }
            }
            
            private static void lIIIlIIlllIlIlIl() {
                (llIIIlIlllIlll = new int[6])[0] = (0xFFFFFFA9 & 0x1F57);
                Minecraft$7.llIIIlIlllIlll[1] = ((30 + 144 - 113 + 95 ^ 70 + 75 - 124 + 115) & (85 + 67 - 101 + 158 ^ 21 + 185 - 43 + 34 ^ -" ".length()));
                Minecraft$7.llIIIlIlllIlll[2] = (0xFFFF9F3F & 0x7FC2);
                Minecraft$7.llIIIlIlllIlll[3] = " ".length();
                Minecraft$7.llIIIlIlllIlll[4] = (0xFFFFFF91 & 0x1F6E);
                Minecraft$7.llIIIlIlllIlll[5] = "  ".length();
            }
            
            @Override
            public String call() {
                return String.valueOf(new StringBuilder(String.valueOf(GL11.glGetString(Minecraft$7.llIIIlIlllIlll[0]))).append(Minecraft$7.llIIIlIlllIlIl[Minecraft$7.llIIIlIlllIlll[1]]).append(GL11.glGetString(Minecraft$7.llIIIlIlllIlll[2])).append(Minecraft$7.llIIIlIlllIlIl[Minecraft$7.llIIIlIlllIlll[3]]).append(GL11.glGetString(Minecraft$7.llIIIlIlllIlll[4])));
            }
        });
        lllllllllllllIlIllIIlIllIIllIIll.getCategory().addCrashSectionCallable(Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[164]], new Callable<String>() {
            @Override
            public String call() {
                return OpenGlHelper.getLogText();
            }
        });
        lllllllllllllIlIllIIlIllIIllIIll.getCategory().addCrashSectionCallable(Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[165]], new Callable<String>() {
            private static final /* synthetic */ int[] lIIllIIlIIIIlI;
            private static final /* synthetic */ String[] lIIllIIIlIlIIl;
            
            private static boolean llIlIlllIIIIIIl(final int lllllllllllllIIlIllIIIlIlllllIlI, final int lllllllllllllIIlIllIIIlIlllllIIl) {
                return lllllllllllllIIlIllIIIlIlllllIlI < lllllllllllllIIlIllIIIlIlllllIIl;
            }
            
            private static boolean llIlIlllIIIIIII(final int lllllllllllllIIlIllIIIlIllllIlll) {
                return lllllllllllllIIlIllIIIlIllllIlll != 0;
            }
            
            private static void llIlIllIIllIIlI() {
                (lIIllIIIlIlIIl = new String[Minecraft$9.lIIllIIlIIIIlI[2]])[Minecraft$9.lIIllIIlIIIIlI[0]] = llIlIllIIlIllll("4tuDOxikv9E=", "rDYfK");
                Minecraft$9.lIIllIIIlIlIIl[Minecraft$9.lIIllIIlIIIIlI[1]] = llIlIllIIllIIIl("Dxc=", "AxbXY");
            }
            
            private static String llIlIllIIlIllll(final String lllllllllllllIIlIllIIIllIIIIIIII, final String lllllllllllllIIlIllIIIllIIIIIIIl) {
                try {
                    final SecretKeySpec lllllllllllllIIlIllIIIllIIIIIlIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIIlIllIIIllIIIIIIIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
                    final Cipher lllllllllllllIIlIllIIIllIIIIIlII = Cipher.getInstance("Blowfish");
                    lllllllllllllIIlIllIIIllIIIIIlII.init(Minecraft$9.lIIllIIlIIIIlI[2], lllllllllllllIIlIllIIIllIIIIIlIl);
                    return new String(lllllllllllllIIlIllIIIllIIIIIlII.doFinal(Base64.getDecoder().decode(lllllllllllllIIlIllIIIllIIIIIIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
                }
                catch (Exception lllllllllllllIIlIllIIIllIIIIIIll) {
                    lllllllllllllIIlIllIIIllIIIIIIll.printStackTrace();
                    return null;
                }
            }
            
            @Override
            public String call() {
                String s;
                if (llIlIlllIIIIIII(Minecraft.this.gameSettings.useVbo ? 1 : 0)) {
                    s = Minecraft$9.lIIllIIIlIlIIl[Minecraft$9.lIIllIIlIIIIlI[0]];
                    "".length();
                    if ((0x66 ^ 0x62) <= "  ".length()) {
                        return null;
                    }
                }
                else {
                    s = Minecraft$9.lIIllIIIlIlIIl[Minecraft$9.lIIllIIlIIIIlI[1]];
                }
                return s;
            }
            
            private static String llIlIllIIllIIIl(String lllllllllllllIIlIllIIIllIIIlIIlI, final String lllllllllllllIIlIllIIIllIIIlIllI) {
                lllllllllllllIIlIllIIIllIIIlIIlI = new String(Base64.getDecoder().decode(lllllllllllllIIlIllIIIllIIIlIIlI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
                final StringBuilder lllllllllllllIIlIllIIIllIIIlIlIl = new StringBuilder();
                final char[] lllllllllllllIIlIllIIIllIIIlIlII = lllllllllllllIIlIllIIIllIIIlIllI.toCharArray();
                int lllllllllllllIIlIllIIIllIIIlIIll = Minecraft$9.lIIllIIlIIIIlI[0];
                final long lllllllllllllIIlIllIIIllIIIIllIl = (Object)lllllllllllllIIlIllIIIllIIIlIIlI.toCharArray();
                final boolean lllllllllllllIIlIllIIIllIIIIllII = lllllllllllllIIlIllIIIllIIIIllIl.length != 0;
                char lllllllllllllIIlIllIIIllIIIIlIll = (char)Minecraft$9.lIIllIIlIIIIlI[0];
                while (llIlIlllIIIIIIl(lllllllllllllIIlIllIIIllIIIIlIll, lllllllllllllIIlIllIIIllIIIIllII ? 1 : 0)) {
                    final char lllllllllllllIIlIllIIIllIIIllIII = lllllllllllllIIlIllIIIllIIIIllIl[lllllllllllllIIlIllIIIllIIIIlIll];
                    lllllllllllllIIlIllIIIllIIIlIlIl.append((char)(lllllllllllllIIlIllIIIllIIIllIII ^ lllllllllllllIIlIllIIIllIIIlIlII[lllllllllllllIIlIllIIIllIIIlIIll % lllllllllllllIIlIllIIIllIIIlIlII.length]));
                    "".length();
                    ++lllllllllllllIIlIllIIIllIIIlIIll;
                    ++lllllllllllllIIlIllIIIllIIIIlIll;
                    "".length();
                    if ("   ".length() < 0) {
                        return null;
                    }
                }
                return String.valueOf(lllllllllllllIIlIllIIIllIIIlIlIl);
            }
            
            static {
                llIlIllIlllllll();
                llIlIllIIllIIlI();
            }
            
            private static void llIlIllIlllllll() {
                (lIIllIIlIIIIlI = new int[3])[0] = ((0xD1 ^ 0x9F) & ~(0x5B ^ 0x15));
                Minecraft$9.lIIllIIlIIIIlI[1] = " ".length();
                Minecraft$9.lIIllIIlIIIIlI[2] = "  ".length();
            }
        });
        lllllllllllllIlIllIIlIllIIllIIll.getCategory().addCrashSectionCallable(Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[166]], new Callable<String>() {
            private static final /* synthetic */ String[] lIIlIIlIIllIlI;
            private static final /* synthetic */ int[] lIIlIIlIlIlIlI;
            
            private static boolean llIIllIlIIIlIlI(final int lllllllllllllIIllIlllIllIIlIIIIl, final int lllllllllllllIIllIlllIllIIlIIIII) {
                return lllllllllllllIIllIlllIllIIlIIIIl < lllllllllllllIIllIlllIllIIlIIIII;
            }
            
            private static void llIIllIIllIIlll() {
                (lIIlIIlIIllIlI = new String[Minecraft$10.lIIlIIlIlIlIlI[5]])[Minecraft$10.lIIlIIlIlIlIlI[0]] = llIIllIIllIIlII("gmSVkW1zP24=", "uwWby");
                Minecraft$10.lIIlIIlIIllIlI[Minecraft$10.lIIlIIlIlIlIlI[1]] = llIIllIIllIIlIl("JFhXADYLkizyF4ihZrtUDXqP4fvQYeAobwV0D3ZthGcuf6w7Uwxiig==", "drQXX");
                Minecraft$10.lIIlIIlIIllIlI[Minecraft$10.lIIlIIlIlIlIlI[2]] = llIIllIIllIIlII("JzOozsA0nPs=", "hWtMh");
                Minecraft$10.lIIlIIlIIllIlI[Minecraft$10.lIIlIIlIlIlIlI[3]] = llIIllIIllIIlIl("3u18i1ytb3P8oR6DRn75/jOoTbAvEa7FI/UBgW0hFJCM7DcYQyYmuQ==", "MliMx");
                Minecraft$10.lIIlIIlIIllIlI[Minecraft$10.lIIlIIlIlIlIlI[4]] = llIIllIIllIIllI("KQoYDCwbFA5OIxYMWU4HGApXHSQeFhYaOAsdVxwoFBkeAD5ZGRkKbRoUHgsjDVgVHCwXHFcHPlkNGRoiDBsfCylX", "yxwnM");
            }
            
            private static String llIIllIIllIIlII(final String lllllllllllllIIllIlllIllIIlIlIIl, final String lllllllllllllIIllIlllIllIIlIIllI) {
                try {
                    final SecretKeySpec lllllllllllllIIllIlllIllIIlIllII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIIllIlllIllIIlIIllI.getBytes(StandardCharsets.UTF_8)), Minecraft$10.lIIlIIlIlIlIlI[6]), "DES");
                    final Cipher lllllllllllllIIllIlllIllIIlIlIll = Cipher.getInstance("DES");
                    lllllllllllllIIllIlllIllIIlIlIll.init(Minecraft$10.lIIlIIlIlIlIlI[2], lllllllllllllIIllIlllIllIIlIllII);
                    return new String(lllllllllllllIIllIlllIllIIlIlIll.doFinal(Base64.getDecoder().decode(lllllllllllllIIllIlllIllIIlIlIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
                }
                catch (Exception lllllllllllllIIllIlllIllIIlIlIlI) {
                    lllllllllllllIIllIlllIllIIlIlIlI.printStackTrace();
                    return null;
                }
            }
            
            private static String llIIllIIllIIlIl(final String lllllllllllllIIllIlllIllIIllIllI, final String lllllllllllllIIllIlllIllIIllIlIl) {
                try {
                    final SecretKeySpec lllllllllllllIIllIlllIllIIlllIIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIIllIlllIllIIllIlIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
                    final Cipher lllllllllllllIIllIlllIllIIlllIII = Cipher.getInstance("Blowfish");
                    lllllllllllllIIllIlllIllIIlllIII.init(Minecraft$10.lIIlIIlIlIlIlI[2], lllllllllllllIIllIlllIllIIlllIIl);
                    return new String(lllllllllllllIIllIlllIllIIlllIII.doFinal(Base64.getDecoder().decode(lllllllllllllIIllIlllIllIIllIllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
                }
                catch (Exception lllllllllllllIIllIlllIllIIllIlll) {
                    lllllllllllllIIllIlllIllIIllIlll.printStackTrace();
                    return null;
                }
            }
            
            private static void llIIllIlIIIIlll() {
                (lIIlIIlIlIlIlI = new int[7])[0] = ((0x2D ^ 0x8) & ~(0x8F ^ 0xAA));
                Minecraft$10.lIIlIIlIlIlIlI[1] = " ".length();
                Minecraft$10.lIIlIIlIlIlIlI[2] = "  ".length();
                Minecraft$10.lIIlIIlIlIlIlI[3] = "   ".length();
                Minecraft$10.lIIlIIlIlIlIlI[4] = (0x60 ^ 0x64);
                Minecraft$10.lIIlIIlIlIlIlI[5] = (0x5C ^ 0x37 ^ (0x35 ^ 0x5B));
                Minecraft$10.lIIlIIlIlIlIlI[6] = (0x1F ^ 0x17);
            }
            
            @Override
            public String call() throws Exception {
                final String lllllllllllllIIllIlllIllIlIllIIl = ClientBrandRetriever.getClientModName();
                String value;
                if (llIIllIlIIIlIII(lllllllllllllIIllIlllIllIlIllIIl.equals(Minecraft$10.lIIlIIlIIllIlI[Minecraft$10.lIIlIIlIlIlIlI[0]]) ? 1 : 0)) {
                    value = String.valueOf(new StringBuilder(Minecraft$10.lIIlIIlIIllIlI[Minecraft$10.lIIlIIlIlIlIlI[1]]).append(lllllllllllllIIllIlllIllIlIllIIl).append(Minecraft$10.lIIlIIlIIllIlI[Minecraft$10.lIIlIIlIlIlIlI[2]]));
                    "".length();
                    if ("  ".length() <= ((0x27 ^ 0x4) & ~(0x4D ^ 0x6E))) {
                        return null;
                    }
                }
                else if (llIIllIlIIIlIIl(Minecraft.class.getSigners())) {
                    value = Minecraft$10.lIIlIIlIIllIlI[Minecraft$10.lIIlIIlIlIlIlI[3]];
                    "".length();
                    if (" ".length() == 0) {
                        return null;
                    }
                }
                else {
                    value = Minecraft$10.lIIlIIlIIllIlI[Minecraft$10.lIIlIIlIlIlIlI[4]];
                }
                return value;
            }
            
            private static boolean llIIllIlIIIlIII(final int lllllllllllllIIllIlllIllIIIlllII) {
                return lllllllllllllIIllIlllIllIIIlllII == 0;
            }
            
            static {
                llIIllIlIIIIlll();
                llIIllIIllIIlll();
            }
            
            private static boolean llIIllIlIIIlIIl(final Object lllllllllllllIIllIlllIllIIIllllI) {
                return lllllllllllllIIllIlllIllIIIllllI == null;
            }
            
            private static String llIIllIIllIIllI(String lllllllllllllIIllIlllIllIlIIIllI, final String lllllllllllllIIllIlllIllIlIIIlIl) {
                lllllllllllllIIllIlllIllIlIIIllI = new String(Base64.getDecoder().decode(lllllllllllllIIllIlllIllIlIIIllI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
                final StringBuilder lllllllllllllIIllIlllIllIlIIlIIl = new StringBuilder();
                final char[] lllllllllllllIIllIlllIllIlIIlIII = lllllllllllllIIllIlllIllIlIIIlIl.toCharArray();
                int lllllllllllllIIllIlllIllIlIIIlll = Minecraft$10.lIIlIIlIlIlIlI[0];
                final short lllllllllllllIIllIlllIllIlIIIIIl = (Object)lllllllllllllIIllIlllIllIlIIIllI.toCharArray();
                final float lllllllllllllIIllIlllIllIlIIIIII = lllllllllllllIIllIlllIllIlIIIIIl.length;
                int lllllllllllllIIllIlllIllIIllllll = Minecraft$10.lIIlIIlIlIlIlI[0];
                while (llIIllIlIIIlIlI(lllllllllllllIIllIlllIllIIllllll, (int)lllllllllllllIIllIlllIllIlIIIIII)) {
                    final char lllllllllllllIIllIlllIllIlIIllII = lllllllllllllIIllIlllIllIlIIIIIl[lllllllllllllIIllIlllIllIIllllll];
                    lllllllllllllIIllIlllIllIlIIlIIl.append((char)(lllllllllllllIIllIlllIllIlIIllII ^ lllllllllllllIIllIlllIllIlIIlIII[lllllllllllllIIllIlllIllIlIIIlll % lllllllllllllIIllIlllIllIlIIlIII.length]));
                    "".length();
                    ++lllllllllllllIIllIlllIllIlIIIlll;
                    ++lllllllllllllIIllIlllIllIIllllll;
                    "".length();
                    if (" ".length() <= 0) {
                        return null;
                    }
                }
                return String.valueOf(lllllllllllllIIllIlllIllIlIIlIIl);
            }
        });
        lllllllllllllIlIllIIlIllIIllIIll.getCategory().addCrashSectionCallable(Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[167]], new Callable<String>() {
            private static final /* synthetic */ String[] lIIllIllIIIllI;
            private static final /* synthetic */ int[] lIIllIllIIlIIl;
            
            static {
                llIllIIllIlIIII();
                llIllIIllIIllIl();
            }
            
            private static String llIllIIllIIllII(final String lllllllllllllIIlIlIIlllIIlllllIl, final String lllllllllllllIIlIlIIlllIIllllIlI) {
                try {
                    final SecretKeySpec lllllllllllllIIlIlIIlllIlIIIIIII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIIlIlIIlllIIllllIlI.getBytes(StandardCharsets.UTF_8)), Minecraft$11.lIIllIllIIlIIl[2]), "DES");
                    final Cipher lllllllllllllIIlIlIIlllIIlllllll = Cipher.getInstance("DES");
                    lllllllllllllIIlIlIIlllIIlllllll.init(Minecraft$11.lIIllIllIIlIIl[3], lllllllllllllIIlIlIIlllIlIIIIIII);
                    return new String(lllllllllllllIIlIlIIlllIIlllllll.doFinal(Base64.getDecoder().decode(lllllllllllllIIlIlIIlllIIlllllIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
                }
                catch (Exception lllllllllllllIIlIlIIlllIIllllllI) {
                    lllllllllllllIIlIlIIlllIIllllllI.printStackTrace();
                    return null;
                }
            }
            
            @Override
            public String call() throws Exception {
                return Minecraft$11.lIIllIllIIIllI[Minecraft$11.lIIllIllIIlIIl[0]];
            }
            
            private static void llIllIIllIIllIl() {
                (lIIllIllIIIllI = new String[Minecraft$11.lIIllIllIIlIIl[1]])[Minecraft$11.lIIllIllIIlIIl[0]] = llIllIIllIIllII("2KLk3Dyv9Dx2wC0kkp4VSaIy9PaLEcro", "fixTu");
            }
            
            private static void llIllIIllIlIIII() {
                (lIIllIllIIlIIl = new int[4])[0] = ("  ".length() & ~"  ".length());
                Minecraft$11.lIIllIllIIlIIl[1] = " ".length();
                Minecraft$11.lIIllIllIIlIIl[2] = (0x4D ^ 0x69 ^ (0x65 ^ 0x49));
                Minecraft$11.lIIllIllIIlIIl[3] = "  ".length();
            }
        });
        lllllllllllllIlIllIIlIllIIllIIll.getCategory().addCrashSectionCallable(Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[168]], new Callable<String>() {
            private static final /* synthetic */ int[] lIlllIIIIlIlll;
            private static final /* synthetic */ String[] lIlllIIIIlIIIl;
            
            @Override
            public String call() throws Exception {
                final StringBuilder llllllllllllIlllllIllllIlIllIllI = new StringBuilder();
                final short llllllllllllIlllllIllllIlIllIIIl = (short)Minecraft.this.gameSettings.resourcePacks.iterator();
                "".length();
                if ("  ".length() == 0) {
                    return null;
                }
                while (!lIIIIIIIlllIllll(((Iterator)llllllllllllIlllllIllllIlIllIIIl).hasNext() ? 1 : 0)) {
                    final String llllllllllllIlllllIllllIlIllIlIl = ((Iterator<String>)llllllllllllIlllllIllllIlIllIIIl).next();
                    if (lIIIIIIIlllIllIl(llllllllllllIlllllIllllIlIllIllI.length())) {
                        llllllllllllIlllllIllllIlIllIllI.append(Minecraft$12.lIlllIIIIlIIIl[Minecraft$12.lIlllIIIIlIlll[0]]);
                        "".length();
                    }
                    llllllllllllIlllllIllllIlIllIllI.append(llllllllllllIlllllIllllIlIllIlIl);
                    "".length();
                    if (lIIIIIIIlllIlllI(Minecraft.this.gameSettings.field_183018_l.contains(llllllllllllIlllllIllllIlIllIlIl) ? 1 : 0)) {
                        llllllllllllIlllllIllllIlIllIllI.append(Minecraft$12.lIlllIIIIlIIIl[Minecraft$12.lIlllIIIIlIlll[1]]);
                        "".length();
                    }
                }
                return String.valueOf(llllllllllllIlllllIllllIlIllIllI);
            }
            
            private static void lIIIIIIIlllIIlll() {
                (lIlllIIIIlIIIl = new String[Minecraft$12.lIlllIIIIlIlll[2]])[Minecraft$12.lIlllIIIIlIlll[0]] = lIIIIIIIlllIIlIl("T0E=", "camzb");
                Minecraft$12.lIlllIIIIlIIIl[Minecraft$12.lIlllIIIIlIlll[1]] = lIIIIIIIlllIIllI("U5i3CF6WGB6c0vmSSRzY0w==", "WYGPp");
            }
            
            private static boolean lIIIIIIIlllIlllI(final int llllllllllllIlllllIllllIlIIIIlII) {
                return llllllllllllIlllllIllllIlIIIIlII != 0;
            }
            
            private static String lIIIIIIIlllIIllI(final String llllllllllllIlllllIllllIlIIIllIl, final String llllllllllllIlllllIllllIlIIIllII) {
                try {
                    final SecretKeySpec llllllllllllIlllllIllllIlIIlIIlI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIlllllIllllIlIIIllII.getBytes(StandardCharsets.UTF_8)), Minecraft$12.lIlllIIIIlIlll[3]), "DES");
                    final Cipher llllllllllllIlllllIllllIlIIlIIIl = Cipher.getInstance("DES");
                    llllllllllllIlllllIllllIlIIlIIIl.init(Minecraft$12.lIlllIIIIlIlll[2], llllllllllllIlllllIllllIlIIlIIlI);
                    return new String(llllllllllllIlllllIllllIlIIlIIIl.doFinal(Base64.getDecoder().decode(llllllllllllIlllllIllllIlIIIllIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
                }
                catch (Exception llllllllllllIlllllIllllIlIIlIIII) {
                    llllllllllllIlllllIllllIlIIlIIII.printStackTrace();
                    return null;
                }
            }
            
            static {
                lIIIIIIIlllIlIll();
                lIIIIIIIlllIIlll();
            }
            
            private static boolean lIIIIIIIlllIllll(final int llllllllllllIlllllIllllIlIIIIIlI) {
                return llllllllllllIlllllIllllIlIIIIIlI == 0;
            }
            
            private static String lIIIIIIIlllIIlIl(String llllllllllllIlllllIllllIlIIlllll, final String llllllllllllIlllllIllllIlIIllllI) {
                llllllllllllIlllllIllllIlIIlllll = (boolean)new String(Base64.getDecoder().decode(((String)llllllllllllIlllllIllllIlIIlllll).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
                final StringBuilder llllllllllllIlllllIllllIlIlIIIlI = new StringBuilder();
                final char[] llllllllllllIlllllIllllIlIlIIIIl = llllllllllllIlllllIllllIlIIllllI.toCharArray();
                int llllllllllllIlllllIllllIlIlIIIII = Minecraft$12.lIlllIIIIlIlll[0];
                final char llllllllllllIlllllIllllIlIIllIlI = (Object)((String)llllllllllllIlllllIllllIlIIlllll).toCharArray();
                final int llllllllllllIlllllIllllIlIIllIIl = llllllllllllIlllllIllllIlIIllIlI.length;
                byte llllllllllllIlllllIllllIlIIllIII = (byte)Minecraft$12.lIlllIIIIlIlll[0];
                while (lIIIIIIIllllIIII(llllllllllllIlllllIllllIlIIllIII, llllllllllllIlllllIllllIlIIllIIl)) {
                    final char llllllllllllIlllllIllllIlIlIIlIl = llllllllllllIlllllIllllIlIIllIlI[llllllllllllIlllllIllllIlIIllIII];
                    llllllllllllIlllllIllllIlIlIIIlI.append((char)(llllllllllllIlllllIllllIlIlIIlIl ^ llllllllllllIlllllIllllIlIlIIIIl[llllllllllllIlllllIllllIlIlIIIII % llllllllllllIlllllIllllIlIlIIIIl.length]));
                    "".length();
                    ++llllllllllllIlllllIllllIlIlIIIII;
                    ++llllllllllllIlllllIllllIlIIllIII;
                    "".length();
                    if (((78 + 90 - 110 + 92 ^ 23 + 49 - 2 + 68) & (86 + 21 - 95 + 133 ^ 140 + 5 - 67 + 63 ^ -" ".length())) == -" ".length()) {
                        return null;
                    }
                }
                return String.valueOf(llllllllllllIlllllIllllIlIlIIIlI);
            }
            
            private static boolean lIIIIIIIllllIIII(final int llllllllllllIlllllIllllIlIIIIlll, final int llllllllllllIlllllIllllIlIIIIllI) {
                return llllllllllllIlllllIllllIlIIIIlll < llllllllllllIlllllIllllIlIIIIllI;
            }
            
            private static boolean lIIIIIIIlllIllIl(final int llllllllllllIlllllIllllIlIIIIIII) {
                return llllllllllllIlllllIllllIlIIIIIII > 0;
            }
            
            private static void lIIIIIIIlllIlIll() {
                (lIlllIIIIlIlll = new int[4])[0] = ((0x2B ^ 0x2F) & ~(0xA4 ^ 0xA0));
                Minecraft$12.lIlllIIIIlIlll[1] = " ".length();
                Minecraft$12.lIlllIIIIlIlll[2] = "  ".length();
                Minecraft$12.lIlllIIIIlIlll[3] = (18 + 28 - 20 + 136 ^ 169 + 105 - 245 + 141);
            }
        });
        lllllllllllllIlIllIIlIllIIllIIll.getCategory().addCrashSectionCallable(Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[169]], new Callable<String>() {
            @Override
            public String call() throws Exception {
                return Minecraft.this.mcLanguageManager.getCurrentLanguage().toString();
            }
        });
        lllllllllllllIlIllIIlIllIIllIIll.getCategory().addCrashSectionCallable(Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[170]], new Callable<String>() {
            private static final /* synthetic */ String[] lIIIlIIlIIlIll;
            private static final /* synthetic */ int[] lIIIlIIlIlIIlI;
            
            private static boolean lIllllllIlIIIII(final int lllllllllllllIlIIIlIlIlIlIIIIlIl) {
                return lllllllllllllIlIIIlIlIlIlIIIIlIl != 0;
            }
            
            private static void lIllllllIIlllll() {
                (lIIIlIIlIlIIlI = new int[4])[0] = ((43 + 74 + 21 + 4 ^ 146 + 20 - 144 + 128) & (57 + 120 - 119 + 82 ^ 11 + 71 + 36 + 30 ^ -" ".length()));
                Minecraft$14.lIIIlIIlIlIIlI[1] = " ".length();
                Minecraft$14.lIIIlIIlIlIIlI[2] = (0x25 ^ 0x45 ^ (0xF ^ 0x67));
                Minecraft$14.lIIIlIIlIlIIlI[3] = "  ".length();
            }
            
            private static String lIllllllIIlllII(final String lllllllllllllIlIIIlIlIlIlIIIllII, final String lllllllllllllIlIIIlIlIlIlIIIlIll) {
                try {
                    final SecretKeySpec lllllllllllllIlIIIlIlIlIlIIIllll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIlIIIlIlIlIlIIIlIll.getBytes(StandardCharsets.UTF_8)), Minecraft$14.lIIIlIIlIlIIlI[2]), "DES");
                    final Cipher lllllllllllllIlIIIlIlIlIlIIIlllI = Cipher.getInstance("DES");
                    lllllllllllllIlIIIlIlIlIlIIIlllI.init(Minecraft$14.lIIIlIIlIlIIlI[3], lllllllllllllIlIIIlIlIlIlIIIllll);
                    return new String(lllllllllllllIlIIIlIlIlIlIIIlllI.doFinal(Base64.getDecoder().decode(lllllllllllllIlIIIlIlIlIlIIIllII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
                }
                catch (Exception lllllllllllllIlIIIlIlIlIlIIIllIl) {
                    lllllllllllllIlIIIlIlIlIlIIIllIl.printStackTrace();
                    return null;
                }
            }
            
            private static void lIllllllIIlllIl() {
                (lIIIlIIlIIlIll = new String[Minecraft$14.lIIIlIIlIlIIlI[1]])[Minecraft$14.lIIIlIIlIlIIlI[0]] = lIllllllIIlllII("uwDlsEE8AWU5nPFQcAdTDQ==", "kCcaj");
            }
            
            @Override
            public String call() throws Exception {
                String nameOfLastSection;
                if (lIllllllIlIIIII(Minecraft.this.mcProfiler.profilingEnabled ? 1 : 0)) {
                    nameOfLastSection = Minecraft.this.mcProfiler.getNameOfLastSection();
                    "".length();
                    if ("   ".length() >= (0x41 ^ 0x76 ^ (0xBA ^ 0x89))) {
                        return null;
                    }
                }
                else {
                    nameOfLastSection = Minecraft$14.lIIIlIIlIIlIll[Minecraft$14.lIIIlIIlIlIIlI[0]];
                }
                return nameOfLastSection;
            }
            
            static {
                lIllllllIIlllll();
                lIllllllIIlllIl();
            }
        });
        lllllllllllllIlIllIIlIllIIllIIll.getCategory().addCrashSectionCallable(Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[171]], new Callable<String>() {
            @Override
            public String call() {
                return OpenGlHelper.func_183029_j();
            }
        });
        if (lIlIlIlllIIllIl(this.theWorld)) {
            this.theWorld.addWorldInfoToCrashReport(lllllllllllllIlIllIIlIllIIllIIll);
            "".length();
        }
        return lllllllllllllIlIllIIlIllIIllIIll;
    }
    
    private void setWindowIcon() {
        final Util.EnumOS lllllllllllllIlIllIIllIllIIIIIII = Util.getOSType();
        if (lIlIlIlllIlIIII(lllllllllllllIlIllIIllIllIIIIIII, Util.EnumOS.OSX)) {
            InputStream lllllllllllllIlIllIIllIlIlllllll = null;
            InputStream lllllllllllllIlIllIIllIlIllllllI = null;
            try {
                lllllllllllllIlIllIIllIlIlllllll = this.mcDefaultResourcePack.getInputStreamAssets(new ResourceLocation(Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[43]]));
                lllllllllllllIlIllIIllIlIllllllI = this.mcDefaultResourcePack.getInputStreamAssets(new ResourceLocation(Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[44]]));
                if (lIlIlIlllIIllIl(lllllllllllllIlIllIIllIlIlllllll) && lIlIlIlllIIllIl(lllllllllllllIlIllIIllIlIllllllI)) {
                    final ByteBuffer[] icon = new ByteBuffer[Minecraft.llllIllIllIll[3]];
                    icon[Minecraft.llllIllIllIll[0]] = this.readImageToBuffer(lllllllllllllIlIllIIllIlIlllllll);
                    icon[Minecraft.llllIllIllIll[1]] = this.readImageToBuffer(lllllllllllllIlIllIIllIlIllllllI);
                    Display.setIcon(icon);
                    "".length();
                    "".length();
                    if ("  ".length() == 0) {
                        return;
                    }
                }
            }
            catch (IOException lllllllllllllIlIllIIllIlIlllllIl) {
                Minecraft.logger.error(Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[45]], (Throwable)lllllllllllllIlIllIIllIlIlllllIl);
                IOUtils.closeQuietly(lllllllllllllIlIllIIllIlIlllllll);
                IOUtils.closeQuietly(lllllllllllllIlIllIIllIlIllllllI);
                "".length();
                if ("  ".length() != "  ".length()) {
                    return;
                }
                return;
            }
            finally {
                IOUtils.closeQuietly(lllllllllllllIlIllIIllIlIlllllll);
                IOUtils.closeQuietly(lllllllllllllIlIllIIllIlIllllllI);
            }
            IOUtils.closeQuietly(lllllllllllllIlIllIIllIlIlllllll);
            IOUtils.closeQuietly(lllllllllllllIlIllIIllIlIllllllI);
        }
    }
    
    public static Map<String, String> getSessionInfo() {
        final Map<String, String> lllllllllllllIlIllIIlIlIlIIIIlIl = (Map<String, String>)Maps.newHashMap();
        lllllllllllllIlIllIIlIlIlIIIIlIl.put(Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[306]], getMinecraft().getSession().getUsername());
        "".length();
        lllllllllllllIlIllIIlIlIlIIIIlIl.put(Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[307]], getMinecraft().getSession().getPlayerID());
        "".length();
        lllllllllllllIlIllIIlIlIlIIIIlIl.put(Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[308]], Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[309]]);
        "".length();
        return lllllllllllllIlIllIIlIlIlIIIIlIl;
    }
    
    public static boolean isAmbientOcclusionEnabled() {
        if (lIlIlIlllIIllIl(Minecraft.theMinecraft) && lIlIlIlllIIlllI(Minecraft.theMinecraft.gameSettings.ambientOcclusion)) {
            return Minecraft.llllIllIllIll[1] != 0;
        }
        return Minecraft.llllIllIllIll[0] != 0;
    }
    
    private static boolean lIlIlIlllIllllI(final int lllllllllllllIlIllIIlIlIIIllIIlI, final int lllllllllllllIlIllIIlIlIIIllIIIl) {
        return lllllllllllllIlIllIIlIlIIIllIIlI > lllllllllllllIlIllIIlIlIIIllIIIl;
    }
    
    private static boolean lIlIlIlllIlIlll(final int lllllllllllllIlIllIIlIlIIIIlIllI, final int lllllllllllllIlIllIIlIlIIIIlIlIl) {
        return lllllllllllllIlIllIIlIlIIIIlIllI != lllllllllllllIlIllIIlIlIIIIlIlIl;
    }
    
    private void startTimerHackThread() {
        final Thread lllllllllllllIlIllIIllIlIlIllllI = new Thread(Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[50]]) {
            private static boolean lIIIlIIlIIlIllII(final int llllllllllllIlllIlIllllIIIIIlIII) {
                return llllllllllllIlllIlIllllIIIIIlIII == 0;
            }
            
            @Override
            public void run() {
                "".length();
                if ((0x61 ^ 0x65) <= -" ".length()) {
                    return;
                }
                while (!lIIIlIIlIIlIllII(Minecraft.this.running ? 1 : 0)) {
                    try {
                        Thread.sleep(2147483647L);
                        "".length();
                        if (" ".length() < 0) {
                            return;
                        }
                        continue;
                    }
                    catch (InterruptedException ex) {}
                }
            }
        };
        lllllllllllllIlIllIIllIlIlIllllI.setDaemon((boolean)(Minecraft.llllIllIllIll[1] != 0));
        lllllllllllllIlIllIIllIlIlIllllI.start();
    }
    
    public boolean isSingleplayer() {
        if (lIlIlIlllIIlllI(this.integratedServerIsRunning ? 1 : 0) && lIlIlIlllIIllIl(this.theIntegratedServer)) {
            return Minecraft.llllIllIllIll[1] != 0;
        }
        return Minecraft.llllIllIllIll[0] != 0;
    }
    
    public void run() {
        this.running = (Minecraft.llllIllIllIll[1] != 0);
        try {
            this.startGame();
            "".length();
            if (" ".length() == 0) {
                return;
            }
        }
        catch (Throwable lllllllllllllIlIllIIllIlllIIIlII) {
            final CrashReport lllllllllllllIlIllIIllIlllIIIIll = CrashReport.makeCrashReport(lllllllllllllIlIllIIllIlllIIIlII, Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[12]]);
            lllllllllllllIlIllIIllIlllIIIIll.makeCategory(Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[13]]);
            "".length();
            this.displayCrashReport(this.addGraphicsAndWorldToCrashReport(lllllllllllllIlIllIIllIlllIIIIll));
            return;
        }
        try {
            do {
                Label_0155: {
                    if (lIlIlIlllIIlllI(this.hasCrashed ? 1 : 0)) {
                        if (!lIlIlIlllIIlIll(this.crashReporter)) {
                            break Label_0155;
                        }
                    }
                    try {
                        this.runGameLoop();
                        "".length();
                        if (null != null) {
                            return;
                        }
                        continue;
                    }
                    catch (OutOfMemoryError lllllllllllllIlIllIIllIlllIIIIIl) {
                        this.freeMemory();
                        this.displayGuiScreen(new GuiMemoryErrorScreen());
                        System.gc();
                        "".length();
                        if ("   ".length() < " ".length()) {
                            return;
                        }
                        continue;
                    }
                }
                this.displayCrashReport(this.crashReporter);
            } while (!lIlIlIlllIIllll(this.running ? 1 : 0));
            "".length();
            if ((0x4C ^ 0x48) <= ((0xF6 ^ 0xAC) & ~(0xB ^ 0x51))) {
                return;
            }
        }
        catch (MinecraftError lllllllllllllIlIllIIllIlllIIIIII) {
            this.shutdownMinecraftApplet();
            "".length();
            if ("  ".length() <= -" ".length()) {
                return;
            }
            return;
        }
        catch (ReportedException lllllllllllllIlIllIIllIllIlllllI) {
            this.addGraphicsAndWorldToCrashReport(lllllllllllllIlIllIIllIllIlllllI.getCrashReport());
            "".length();
            this.freeMemory();
            Minecraft.logger.fatal(Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[14]], (Throwable)lllllllllllllIlIllIIllIllIlllllI);
            this.displayCrashReport(lllllllllllllIlIllIIllIllIlllllI.getCrashReport());
            this.shutdownMinecraftApplet();
            "".length();
            if ((0x43 ^ 0x47) <= ((0x3B ^ 0x6F) & ~(0x69 ^ 0x3D))) {
                return;
            }
            return;
        }
        catch (Throwable lllllllllllllIlIllIIllIllIllllII) {
            final CrashReport lllllllllllllIlIllIIllIllIlllIll = this.addGraphicsAndWorldToCrashReport(new CrashReport(Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[15]], lllllllllllllIlIllIIllIllIllllII));
            this.freeMemory();
            Minecraft.logger.fatal(Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[16]], lllllllllllllIlIllIIllIllIllllII);
            this.displayCrashReport(lllllllllllllIlIllIIllIllIlllIll);
            this.shutdownMinecraftApplet();
            "".length();
            if ("  ".length() <= 0) {
                return;
            }
            return;
        }
        finally {
            this.shutdownMinecraftApplet();
        }
        this.shutdownMinecraftApplet();
    }
    
    @Override
    public ListenableFuture<Object> addScheduledTask(final Runnable lllllllllllllIlIllIIlIlIlIIllIll) {
        Validate.notNull((Object)lllllllllllllIlIllIIlIlIlIIllIll);
        "".length();
        return this.addScheduledTask(Executors.callable(lllllllllllllIlIllIIlIlIlIIllIll));
    }
    
    public void loadWorld(final WorldClient lllllllllllllIlIllIIlIlllIIlIlII, final String lllllllllllllIlIllIIlIlllIIlIIll) {
        if (lIlIlIlllIIlIll(lllllllllllllIlIllIIlIlllIIlIlII)) {
            final NetHandlerPlayClient lllllllllllllIlIllIIlIlllIIlIllI = this.getNetHandler();
            if (lIlIlIlllIIllIl(lllllllllllllIlIllIIlIlllIIlIllI)) {
                lllllllllllllIlIllIIlIlllIIlIllI.cleanup();
            }
            if (lIlIlIlllIIllIl(this.theIntegratedServer) && lIlIlIlllIIlllI(this.theIntegratedServer.isAnvilFileSet() ? 1 : 0)) {
                this.theIntegratedServer.initiateShutdown();
                this.theIntegratedServer.setStaticInstance();
            }
            this.theIntegratedServer = null;
            this.guiAchievement.clearAchievements();
            this.entityRenderer.getMapItemRenderer().clearLoadedMaps();
        }
        this.renderViewEntity = null;
        this.myNetworkManager = null;
        if (lIlIlIlllIIllIl(this.loadingScreen)) {
            this.loadingScreen.resetProgressAndMessage(lllllllllllllIlIllIIlIlllIIlIIll);
            this.loadingScreen.displayLoadingString(Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[153]]);
        }
        if (lIlIlIlllIIlIll(lllllllllllllIlIllIIlIlllIIlIlII) && lIlIlIlllIIllIl(this.theWorld)) {
            this.mcResourcePackRepository.func_148529_f();
            this.ingameGUI.func_181029_i();
            this.setServerData(null);
            this.integratedServerIsRunning = (Minecraft.llllIllIllIll[0] != 0);
        }
        this.mcSoundHandler.stopSounds();
        this.theWorld = lllllllllllllIlIllIIlIlllIIlIlII;
        if (lIlIlIlllIIllIl(lllllllllllllIlIllIIlIlllIIlIlII)) {
            if (lIlIlIlllIIllIl(this.renderGlobal)) {
                this.renderGlobal.setWorldAndLoadRenderers(lllllllllllllIlIllIIlIlllIIlIlII);
            }
            if (lIlIlIlllIIllIl(this.effectRenderer)) {
                this.effectRenderer.clearEffects(lllllllllllllIlIllIIlIlllIIlIlII);
            }
            if (lIlIlIlllIIlIll(this.thePlayer)) {
                this.thePlayer = this.playerController.func_178892_a(lllllllllllllIlIllIIlIlllIIlIlII, new StatFileWriter());
                this.playerController.flipPlayer(this.thePlayer);
            }
            this.thePlayer.preparePlayerToSpawn();
            lllllllllllllIlIllIIlIlllIIlIlII.spawnEntityInWorld(this.thePlayer);
            "".length();
            this.thePlayer.movementInput = new MovementInputFromOptions(this.gameSettings);
            this.playerController.setPlayerCapabilities(this.thePlayer);
            this.renderViewEntity = this.thePlayer;
            "".length();
            if (-" ".length() > 0) {
                return;
            }
        }
        else {
            this.saveLoader.flushCache();
            this.thePlayer = null;
        }
        System.gc();
        this.systemTime = 0L;
    }
    
    public Framebuffer getFramebuffer() {
        return this.framebufferMc;
    }
    
    private static int lIlIlIlllIlIIll(final float n, final float n2) {
        return fcmpg(n, n2);
    }
    
    private void sendClickBlockToController(final boolean lllllllllllllIlIllIIllIIIIIlIIIl) {
        if (lIlIlIlllIIllll(lllllllllllllIlIllIIllIIIIIlIIIl ? 1 : 0)) {
            this.leftClickCounter = Minecraft.llllIllIllIll[0];
        }
        if (lIlIlIlllIlIlII(this.leftClickCounter) && lIlIlIlllIIllll(this.thePlayer.isUsingItem() ? 1 : 0)) {
            if (lIlIlIlllIIlllI(lllllllllllllIlIllIIllIIIIIlIIIl ? 1 : 0) && lIlIlIlllIIllIl(this.objectMouseOver) && lIlIlIlllIIlIlI(this.objectMouseOver.typeOfHit, MovingObjectPosition.MovingObjectType.BLOCK)) {
                final BlockPos lllllllllllllIlIllIIllIIIIIlIIll = this.objectMouseOver.getBlockPos();
                if (lIlIlIlllIlIIII(this.theWorld.getBlockState(lllllllllllllIlIllIIllIIIIIlIIll).getBlock().getMaterial(), Material.air) && lIlIlIlllIIlllI(this.playerController.onPlayerDamageBlock(lllllllllllllIlIllIIllIIIIIlIIll, this.objectMouseOver.sideHit) ? 1 : 0)) {
                    this.effectRenderer.addBlockHitEffects(lllllllllllllIlIllIIllIIIIIlIIll, this.objectMouseOver.sideHit);
                    this.thePlayer.swingItem();
                    "".length();
                    if (((0xAD ^ 0x98) & ~(0x72 ^ 0x47)) != 0x0) {
                        return;
                    }
                }
            }
            else {
                this.playerController.resetBlockRemoving();
            }
        }
    }
    
    public void loadWorld(final WorldClient lllllllllllllIlIllIIlIlllIIllllI) {
        this.loadWorld(lllllllllllllIlIllIIlIlllIIllllI, Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[152]]);
    }
    
    private static boolean lIlIlIlllIllIlI(final int lllllllllllllIlIllIIlIlIIIIlllll) {
        return lllllllllllllIlIllIIlIlIIIIlllll >= 0;
    }
    
    public SkinManager getSkinManager() {
        return this.skinManager;
    }
    
    private static int lIlIlIlllIlllII(final float n, final float n2) {
        return fcmpg(n, n2);
    }
    
    public ResourcePackRepository getResourcePackRepository() {
        return this.mcResourcePackRepository;
    }
    
    public Minecraft(final GameConfiguration lllllllllllllIlIllIIllIlllIllllI) {
        this.enableGLErrorChecking = (Minecraft.llllIllIllIll[1] != 0);
        this.field_181541_X = (Minecraft.llllIllIllIll[0] != 0);
        this.timer = new Timer(20.0f);
        this.usageSnooper = new PlayerUsageSnooper(Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[1]], this, MinecraftServer.getCurrentTimeMillis());
        this.systemTime = getSystemTime();
        this.field_181542_y = new FrameTimer();
        this.field_181543_z = System.nanoTime();
        this.mcProfiler = new Profiler();
        this.debugCrashKeyPressTime = -1L;
        this.metadataSerializer_ = new IMetadataSerializer();
        this.defaultResourcePacks = (List<IResourcePack>)Lists.newArrayList();
        this.scheduledTasks = (Queue<FutureTask<?>>)Queues.newArrayDeque();
        this.field_175615_aJ = 0L;
        this.mcThread = Thread.currentThread();
        this.running = (Minecraft.llllIllIllIll[1] != 0);
        this.debug = Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[3]];
        this.field_175613_B = (Minecraft.llllIllIllIll[0] != 0);
        this.field_175614_C = (Minecraft.llllIllIllIll[0] != 0);
        this.field_175611_D = (Minecraft.llllIllIllIll[0] != 0);
        this.renderChunksMany = (Minecraft.llllIllIllIll[1] != 0);
        this.debugUpdateTime = getSystemTime();
        this.prevFrameTime = -1L;
        this.debugProfilerName = Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[8]];
        Minecraft.theMinecraft = this;
        this.mcDataDir = lllllllllllllIlIllIIllIlllIllllI.folderInfo.mcDataDir;
        this.fileAssets = lllllllllllllIlIllIIllIlllIllllI.folderInfo.assetsDir;
        this.fileResourcepacks = lllllllllllllIlIllIIllIlllIllllI.folderInfo.resourcePacksDir;
        this.launchedVersion = lllllllllllllIlIllIIllIlllIllllI.gameInfo.version;
        this.twitchDetails = lllllllllllllIlIllIIllIlllIllllI.userInfo.userProperties;
        this.field_181038_N = lllllllllllllIlIllIIllIlllIllllI.userInfo.field_181172_c;
        this.mcDefaultResourcePack = new DefaultResourcePack(new ResourceIndex(lllllllllllllIlIllIIllIlllIllllI.folderInfo.assetsDir, lllllllllllllIlIllIIllIlllIllllI.folderInfo.assetIndex).getResourceMap());
        Proxy proxy;
        if (lIlIlIlllIIlIll(lllllllllllllIlIllIIllIlllIllllI.userInfo.proxy)) {
            proxy = Proxy.NO_PROXY;
            "".length();
            if ("   ".length() == ((0x72 ^ 0x30) & ~(0xF4 ^ 0xB6))) {
                throw null;
            }
        }
        else {
            proxy = lllllllllllllIlIllIIllIlllIllllI.userInfo.proxy;
        }
        this.proxy = proxy;
        this.sessionService = new YggdrasilAuthenticationService(lllllllllllllIlIllIIllIlllIllllI.userInfo.proxy, UUID.randomUUID().toString()).createMinecraftSessionService();
        this.session = lllllllllllllIlIllIIllIlllIllllI.userInfo.session;
        Minecraft.logger.info(String.valueOf(new StringBuilder(Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[9]]).append(this.session.getUsername())));
        Minecraft.logger.info(String.valueOf(new StringBuilder(Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[10]]).append(this.session.getSessionID()).append(Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[11]])));
        this.isDemo = lllllllllllllIlIllIIllIlllIllllI.gameInfo.isDemo;
        int width;
        if (lIlIlIlllIIllII(lllllllllllllIlIllIIllIlllIllllI.displayInfo.width)) {
            width = lllllllllllllIlIllIIllIlllIllllI.displayInfo.width;
            "".length();
            if (" ".length() < 0) {
                throw null;
            }
        }
        else {
            width = Minecraft.llllIllIllIll[1];
        }
        this.displayWidth = width;
        int height;
        if (lIlIlIlllIIllII(lllllllllllllIlIllIIllIlllIllllI.displayInfo.height)) {
            height = lllllllllllllIlIllIIllIlllIllllI.displayInfo.height;
            "".length();
            if (" ".length() == -" ".length()) {
                throw null;
            }
        }
        else {
            height = Minecraft.llllIllIllIll[1];
        }
        this.displayHeight = height;
        this.tempDisplayWidth = lllllllllllllIlIllIIllIlllIllllI.displayInfo.width;
        this.tempDisplayHeight = lllllllllllllIlIllIIllIlllIllllI.displayInfo.height;
        this.fullscreen = lllllllllllllIlIllIIllIlllIllllI.displayInfo.fullscreen;
        this.jvm64bit = isJvm64bit();
        this.theIntegratedServer = new IntegratedServer(this);
        if (lIlIlIlllIIllIl(lllllllllllllIlIllIIllIlllIllllI.serverInfo.serverName)) {
            this.serverName = lllllllllllllIlIllIIllIlllIllllI.serverInfo.serverName;
            this.serverPort = lllllllllllllIlIllIIllIlllIllllI.serverInfo.serverPort;
        }
        ImageIO.setUseCache((boolean)(Minecraft.llllIllIllIll[0] != 0));
        Bootstrap.register();
    }
    
    private void middleClickMouse() {
        if (lIlIlIlllIIllIl(this.objectMouseOver)) {
            final boolean lllllllllllllIlIllIIlIllIlllIIlI = this.thePlayer.capabilities.isCreativeMode;
            int lllllllllllllIlIllIIlIllIlllIIIl = Minecraft.llllIllIllIll[0];
            boolean lllllllllllllIlIllIIlIllIlllIIII = Minecraft.llllIllIllIll[0] != 0;
            TileEntity lllllllllllllIlIllIIlIllIllIllll = null;
            Item lllllllllllllIlIllIIlIllIllIIIIl = null;
            if (lIlIlIlllIIlIlI(this.objectMouseOver.typeOfHit, MovingObjectPosition.MovingObjectType.BLOCK)) {
                final BlockPos lllllllllllllIlIllIIlIllIllIIIII = this.objectMouseOver.getBlockPos();
                final Block lllllllllllllIlIllIIlIllIlIlllll = this.theWorld.getBlockState(lllllllllllllIlIllIIlIllIllIIIII).getBlock();
                if (lIlIlIlllIIlIlI(lllllllllllllIlIllIIlIllIlIlllll.getMaterial(), Material.air)) {
                    return;
                }
                final Item lllllllllllllIlIllIIlIllIllIlllI = lllllllllllllIlIllIIlIllIlIlllll.getItem(this.theWorld, lllllllllllllIlIllIIlIllIllIIIII);
                if (lIlIlIlllIIlIll(lllllllllllllIlIllIIlIllIllIlllI)) {
                    return;
                }
                if (lIlIlIlllIIlllI(lllllllllllllIlIllIIlIllIlllIIlI ? 1 : 0) && lIlIlIlllIIlllI(GuiScreen.isCtrlKeyDown() ? 1 : 0)) {
                    lllllllllllllIlIllIIlIllIllIllll = this.theWorld.getTileEntity(lllllllllllllIlIllIIlIllIllIIIII);
                }
                Block blockFromItem;
                if (lIlIlIlllIIlllI((lllllllllllllIlIllIIlIllIllIlllI instanceof ItemBlock) ? 1 : 0) && lIlIlIlllIIllll(lllllllllllllIlIllIIlIllIlIlllll.isFlowerPot() ? 1 : 0)) {
                    blockFromItem = Block.getBlockFromItem(lllllllllllllIlIllIIlIllIllIlllI);
                    "".length();
                    if ((0x12 ^ 0x16) <= "   ".length()) {
                        return;
                    }
                }
                else {
                    blockFromItem = lllllllllllllIlIllIIlIllIlIlllll;
                }
                final Block lllllllllllllIlIllIIlIllIlIllllI = blockFromItem;
                lllllllllllllIlIllIIlIllIlllIIIl = lllllllllllllIlIllIIlIllIlIllllI.getDamageValue(this.theWorld, lllllllllllllIlIllIIlIllIllIIIII);
                lllllllllllllIlIllIIlIllIlllIIII = lllllllllllllIlIllIIlIllIllIlllI.getHasSubtypes();
                "".length();
                if (null != null) {
                    return;
                }
            }
            else {
                if (!lIlIlIlllIIlIlI(this.objectMouseOver.typeOfHit, MovingObjectPosition.MovingObjectType.ENTITY) || !lIlIlIlllIIllIl(this.objectMouseOver.entityHit) || lIlIlIlllIIllll(lllllllllllllIlIllIIlIllIlllIIlI ? 1 : 0)) {
                    return;
                }
                if (lIlIlIlllIIlllI((this.objectMouseOver.entityHit instanceof EntityPainting) ? 1 : 0)) {
                    final Item lllllllllllllIlIllIIlIllIllIllIl = Items.painting;
                    "".length();
                    if (-" ".length() == " ".length()) {
                        return;
                    }
                }
                else if (lIlIlIlllIIlllI((this.objectMouseOver.entityHit instanceof EntityLeashKnot) ? 1 : 0)) {
                    final Item lllllllllllllIlIllIIlIllIllIllII = Items.lead;
                    "".length();
                    if (" ".length() == "   ".length()) {
                        return;
                    }
                }
                else if (lIlIlIlllIIlllI((this.objectMouseOver.entityHit instanceof EntityItemFrame) ? 1 : 0)) {
                    final EntityItemFrame lllllllllllllIlIllIIlIllIlIlllIl = (EntityItemFrame)this.objectMouseOver.entityHit;
                    final ItemStack lllllllllllllIlIllIIlIllIlIlllII = lllllllllllllIlIllIIlIllIlIlllIl.getDisplayedItem();
                    if (lIlIlIlllIIlIll(lllllllllllllIlIllIIlIllIlIlllII)) {
                        final Item lllllllllllllIlIllIIlIllIllIlIll = Items.item_frame;
                        "".length();
                        if ("  ".length() != "  ".length()) {
                            return;
                        }
                    }
                    else {
                        final Item lllllllllllllIlIllIIlIllIllIlIlI = lllllllllllllIlIllIIlIllIlIlllII.getItem();
                        lllllllllllllIlIllIIlIllIlllIIIl = lllllllllllllIlIllIIlIllIlIlllII.getMetadata();
                        lllllllllllllIlIllIIlIllIlllIIII = (Minecraft.llllIllIllIll[1] != 0);
                        "".length();
                        if (-(0x7B ^ 0xC ^ (0x33 ^ 0x40)) >= 0) {
                            return;
                        }
                    }
                }
                else if (lIlIlIlllIIlllI((this.objectMouseOver.entityHit instanceof EntityMinecart) ? 1 : 0)) {
                    final EntityMinecart lllllllllllllIlIllIIlIllIlIllIll = (EntityMinecart)this.objectMouseOver.entityHit;
                    switch ($SWITCH_TABLE$net$minecraft$entity$item$EntityMinecart$EnumMinecartType()[lllllllllllllIlIllIIlIllIlIllIll.getMinecartType().ordinal()]) {
                        case 3: {
                            final Item lllllllllllllIlIllIIlIllIllIlIIl = Items.furnace_minecart;
                            "".length();
                            if ("   ".length() <= -" ".length()) {
                                return;
                            }
                            break;
                        }
                        case 2: {
                            final Item lllllllllllllIlIllIIlIllIllIlIII = Items.chest_minecart;
                            "".length();
                            if ("  ".length() == " ".length()) {
                                return;
                            }
                            break;
                        }
                        case 4: {
                            final Item lllllllllllllIlIllIIlIllIllIIlll = Items.tnt_minecart;
                            "".length();
                            if (-" ".length() >= 0) {
                                return;
                            }
                            break;
                        }
                        case 6: {
                            final Item lllllllllllllIlIllIIlIllIllIIllI = Items.hopper_minecart;
                            "".length();
                            if (-"  ".length() >= 0) {
                                return;
                            }
                            break;
                        }
                        case 7: {
                            final Item lllllllllllllIlIllIIlIllIllIIlIl = Items.command_block_minecart;
                            "".length();
                            if ("  ".length() < ((0xC ^ 0x2A) & ~(0x21 ^ 0x7))) {
                                return;
                            }
                            break;
                        }
                        default: {
                            final Item lllllllllllllIlIllIIlIllIllIIlII = Items.minecart;
                            "".length();
                            if (" ".length() == 0) {
                                return;
                            }
                            break;
                        }
                    }
                }
                else if (lIlIlIlllIIlllI((this.objectMouseOver.entityHit instanceof EntityBoat) ? 1 : 0)) {
                    final Item lllllllllllllIlIllIIlIllIllIIIll = Items.boat;
                    "".length();
                    if (-"  ".length() >= 0) {
                        return;
                    }
                }
                else if (lIlIlIlllIIlllI((this.objectMouseOver.entityHit instanceof EntityArmorStand) ? 1 : 0)) {
                    final Item lllllllllllllIlIllIIlIllIllIIIlI = Items.armor_stand;
                    "".length();
                    if (" ".length() <= 0) {
                        return;
                    }
                }
                else {
                    lllllllllllllIlIllIIlIllIllIIIIl = Items.spawn_egg;
                    lllllllllllllIlIllIIlIllIlllIIIl = EntityList.getEntityID(this.objectMouseOver.entityHit);
                    lllllllllllllIlIllIIlIllIlllIIII = (Minecraft.llllIllIllIll[1] != 0);
                    if (lIlIlIlllIIllll(EntityList.entityEggs.containsKey(lllllllllllllIlIllIIlIllIlllIIIl) ? 1 : 0)) {
                        return;
                    }
                }
            }
            final InventoryPlayer lllllllllllllIlIllIIlIllIlIllIlI = this.thePlayer.inventory;
            if (lIlIlIlllIIlIll(lllllllllllllIlIllIIlIllIllIllll)) {
                lllllllllllllIlIllIIlIllIlIllIlI.setCurrentItem(lllllllllllllIlIllIIlIllIllIIIIl, lllllllllllllIlIllIIlIllIlllIIIl, lllllllllllllIlIllIIlIllIlllIIII, lllllllllllllIlIllIIlIllIlllIIlI);
                "".length();
                if (null != null) {
                    return;
                }
            }
            else {
                final ItemStack lllllllllllllIlIllIIlIllIlIllIIl = this.func_181036_a(lllllllllllllIlIllIIlIllIllIIIIl, lllllllllllllIlIllIIlIllIlllIIIl, lllllllllllllIlIllIIlIllIllIllll);
                lllllllllllllIlIllIIlIllIlIllIlI.setInventorySlotContents(lllllllllllllIlIllIIlIllIlIllIlI.currentItem, lllllllllllllIlIllIIlIllIlIllIIl);
            }
            if (lIlIlIlllIIlllI(lllllllllllllIlIllIIlIllIlllIIlI ? 1 : 0)) {
                final int lllllllllllllIlIllIIlIllIlIllIII = this.thePlayer.inventoryContainer.inventorySlots.size() - Minecraft.llllIllIllIll[14] + lllllllllllllIlIllIIlIllIlIllIlI.currentItem;
                this.playerController.sendSlotPacket(lllllllllllllIlIllIIlIllIlIllIlI.getStackInSlot(lllllllllllllIlIllIIlIllIlIllIlI.currentItem), lllllllllllllIlIllIIlIllIlIllIII);
            }
        }
    }
    
    public Session getSession() {
        return this.session;
    }
    
    private void checkGLError(final String lllllllllllllIlIllIIllIIlIllIIII) {
        if (lIlIlIlllIIlllI(this.enableGLErrorChecking ? 1 : 0)) {
            final int lllllllllllllIlIllIIllIIlIlIllll = GL11.glGetError();
            if (lIlIlIlllIIlllI(lllllllllllllIlIllIIllIIlIlIllll)) {
                final String lllllllllllllIlIllIIllIIlIlIlllI = GLU.gluErrorString(lllllllllllllIlIllIIllIIlIlIllll);
                Minecraft.logger.error(Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[65]]);
                Minecraft.logger.error(String.valueOf(new StringBuilder(Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[66]]).append(lllllllllllllIlIllIIllIIlIllIIII)));
                Minecraft.logger.error(String.valueOf(new StringBuilder(String.valueOf(lllllllllllllIlIllIIllIIlIlIllll)).append(Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[67]]).append(lllllllllllllIlIllIIllIIlIlIlllI)));
            }
        }
    }
    
    public static boolean isGuiEnabled() {
        if (lIlIlIlllIIllIl(Minecraft.theMinecraft) && lIlIlIlllIIlllI(Minecraft.theMinecraft.gameSettings.hideGUI ? 1 : 0)) {
            return Minecraft.llllIllIllIll[0] != 0;
        }
        return Minecraft.llllIllIllIll[1] != 0;
    }
    
    public BlockRendererDispatcher getBlockRendererDispatcher() {
        return this.blockRenderDispatcher;
    }
    
    @Override
    public void addServerStatsToSnooper(final PlayerUsageSnooper lllllllllllllIlIllIIlIllIIlIIllI) {
        lllllllllllllIlIllIIlIllIIlIIllI.addClientStat(Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[172]], Minecraft.debugFPS);
        lllllllllllllIlIllIIlIllIIlIIllI.addClientStat(Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[173]], this.gameSettings.enableVsync);
        lllllllllllllIlIllIIlIllIIlIIllI.addClientStat(Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[174]], Display.getDisplayMode().getFrequency());
        final String lllllllllllllIIlIlllllIllIIIlIIl = Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[175]];
        String lllllllllllllIIlIlllllIllIIIlIll;
        if (lIlIlIlllIIlllI(this.fullscreen ? 1 : 0)) {
            lllllllllllllIIlIlllllIllIIIlIll = Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[176]];
            "".length();
            if ("   ".length() < "   ".length()) {
                return;
            }
        }
        else {
            lllllllllllllIIlIlllllIllIIIlIll = Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[177]];
        }
        lllllllllllllIlIllIIlIllIIlIIllI.addClientStat(lllllllllllllIIlIlllllIllIIIlIIl, lllllllllllllIIlIlllllIllIIIlIll);
        lllllllllllllIlIllIIlIllIIlIIllI.addClientStat(Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[178]], (MinecraftServer.getCurrentTimeMillis() - lllllllllllllIlIllIIlIllIIlIIllI.getMinecraftStartTimeMillis()) / 60L * 1000L);
        lllllllllllllIlIllIIlIllIIlIIllI.addClientStat(Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[179]], this.func_181538_aA());
        String s;
        if (lIlIlIlllIIlIlI(ByteOrder.nativeOrder(), ByteOrder.LITTLE_ENDIAN)) {
            s = Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[102]];
            "".length();
            if ("   ".length() <= 0) {
                return;
            }
        }
        else {
            s = Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[180]];
        }
        final String lllllllllllllIlIllIIlIllIIlIIlIl = s;
        lllllllllllllIlIllIIlIllIIlIIllI.addClientStat(Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[181]], lllllllllllllIlIllIIlIllIIlIIlIl);
        lllllllllllllIlIllIIlIllIIlIIllI.addClientStat(Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[182]], this.mcResourcePackRepository.getRepositoryEntries().size());
        int lllllllllllllIlIllIIlIllIIlIIlII = Minecraft.llllIllIllIll[0];
        final String lllllllllllllIlIllIIlIllIIIlllIl = (String)this.mcResourcePackRepository.getRepositoryEntries().iterator();
        "".length();
        if (" ".length() != " ".length()) {
            return;
        }
        while (!lIlIlIlllIIllll(((Iterator)lllllllllllllIlIllIIlIllIIIlllIl).hasNext() ? 1 : 0)) {
            final ResourcePackRepository.Entry lllllllllllllIlIllIIlIllIIlIIIll = ((Iterator<ResourcePackRepository.Entry>)lllllllllllllIlIllIIlIllIIIlllIl).next();
            lllllllllllllIlIllIIlIllIIlIIllI.addClientStat(String.valueOf(new StringBuilder(Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[183]]).append(lllllllllllllIlIllIIlIllIIlIIlII++).append(Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[184]])), lllllllllllllIlIllIIlIllIIlIIIll.getResourcePackName());
        }
        if (lIlIlIlllIIllIl(this.theIntegratedServer) && lIlIlIlllIIllIl(this.theIntegratedServer.getPlayerUsageSnooper())) {
            lllllllllllllIlIllIIlIllIIlIIllI.addClientStat(Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[185]], this.theIntegratedServer.getPlayerUsageSnooper().getUniqueID());
        }
    }
    
    public void shutdown() {
        this.running = (Minecraft.llllIllIllIll[0] != 0);
    }
    
    public RenderItem getRenderItem() {
        return this.renderItem;
    }
    
    private static void lIlIlIllIllIlII() {
        (llllIlIlllIIl = new String[Minecraft.llllIllIllIll[310]])[Minecraft.llllIllIllIll[0]] = lIlIlIlIllIIIIl("ECENIzsWIQZ4KREtWiMnECgQeCMLLhQ5KUo0GzA=", "dDuWN");
        Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[1]] = lIlIlIlIllIIIIl("DS0TKDYa", "nAzMX");
        Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[3]] = lIlIlIlIllIIIlI("HgCaSVkqGXo=", "vvxuS");
        Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[8]] = lIlIlIlIllIIIIl("HyEOPQ==", "mNaIk");
        Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[9]] = lIlIlIlIllIIIll("2qRKBgAHYOLkjTZfcNgPZQ==", "fdlBA");
        Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[10]] = lIlIlIlIllIIIll("ZkFD3KlRJzKmPOdZlPCOLA==", "lgRvc");
        Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[11]] = lIlIlIlIllIIIlI("KbtPO+VBq/o=", "BgHrT");
        Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[12]] = lIlIlIlIllIIIIl("JQElGCYNAyUWJgIIbAsuAQo=", "loLlO");
        Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[13]] = lIlIlIlIllIIIll("HwwoZgtubxV1zlaJC6whrg==", "lgXId");
        Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[14]] = lIlIlIlIllIIIIl("PC4HKRcaLhNmABYoEjYRByQZZhEGORgxC08=", "nKwFe");
        Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[15]] = lIlIlIlIllIIIll("o/Zo4+IK9yERZCzUCdd3NrHDjlkY8UIv", "kvVSV");
        Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[16]] = lIlIlIlIllIIIll("RnsDTMEP1umuhROE+HvFjxSFisZmb4TwQOcm7FNirzI=", "nPkxM");
        Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[17]] = lIlIlIlIllIIIIl("HTQhPTlxNQ4IBjgMBUBV", "Qckzu");
        Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[18]] = lIlIlIlIllIIIIl("MhQwGwAzXDAIFi4EMA4AbAEjDg4y", "AqBme");
        Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[19]] = lIlIlIlIllIIIIl("Gzs9CDo=", "hPTfI");
        Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[20]] = lIlIlIlIllIIIlI("hO5VVY0usKA=", "SmPgm");
        Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[21]] = lIlIlIlIllIIIlI("4juhO+fWRjvsehyFL+4Gvmxf7czovQvL", "OdGth");
        Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[22]] = lIlIlIlIllIIIll("eYFK7FWKOvUWddoBywofxlO+bumJPRSXceha5h0HaSc=", "nIVQK");
        Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[23]] = lIlIlIlIllIIIlI("c7Sk1uljyrt19O6Phi0fiw==", "LSTSL");
        Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[30]] = lIlIlIlIllIIIIl("JDUZAgACMQ==", "wAxpt");
        Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[31]] = lIlIlIlIllIIIIl("OgMqJSI8AyE=", "NfRQW");
        Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[32]] = lIlIlIlIllIIIlI("RewaoddsvM034CRD7qs62K6RwEHpIox/dTigH1XOPCA=", "KnRhf");
        Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[33]] = lIlIlIlIllIIIIl("DBMDNzszGwsmeGxaPzc2JR8fGywkFw==", "AzmRX");
        Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[34]] = lIlIlIlIllIIIIl("PTkWNRcCMR4kVF1wKjUaFDUKHRUeMR81Bg==", "pPxPt");
        Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[35]] = lIlIlIlIllIIIlI("HoNfPhImZBPlHMGImXrGRwhiz6/r5IQwmOKgAusFapg=", "ZcdkV");
        Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[36]] = lIlIlIlIllIIIll("e/1hjqikFhZ/iU6bQoJzje/lALUgjIc4+SDKdGQrSWA=", "mCPNb");
        Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[37]] = lIlIlIlIllIIIIl("LDoFPQ0TMg0sTkxzKTQBAjg5PQAFNhkcBxIjCiwNCQ==", "aSkXn");
        Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[38]] = lIlIlIlIllIIIlI("b4hHKYf0pzOHhJO+w5ea4w==", "jpeZa");
        Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[39]] = lIlIlIlIllIIIIl("BAEaMjsYKRIlOxUFABksHx0WKA==", "pvsFX");
        Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[40]] = lIlIlIlIllIIIlI("y2ckT2sRMGcWshHZmXKziHuZoeNDZjcubZhyU1O2vrMPVc11mdtJAg==", "sgLMY");
        Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[41]] = lIlIlIlIllIIIIl("HiI3LDchKj89dGJlYWds", "SKYIT");
        Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[42]] = lIlIlIlIllIIIlI("9dLrBrCrDT8hXuVM/0hK1kegQMafN/CnBQjPG7mp7Ko=", "JXLyH");
        Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[43]] = lIlIlIlIllIIIIl("Ey4NDB1VJAENACV8VBpfTGMSDAk=", "zMbbn");
        Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[44]] = lIlIlIlIllIIIIl("IhkWBhRkExoHCRRJSxBUeVQJBgA=", "Kzyhg");
        Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[45]] = lIlIlIlIllIIIIl("DjY+NCIjfj94NSgtazElIjc=", "MYKXF");
        Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[46]] = lIlIlIlIllIIIll("i5gY4wk4WQWbH+bFetLtqvtnF92KqR+U", "eWprY");
        Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[47]] = lIlIlIlIllIIIlI("K26u6AGBWPoJgSMWhUrtfSni5oQLZgiJ", "TADvS");
        Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[48]] = lIlIlIlIllIIIlI("o5T4Tru4Jd0=", "oRRkJ");
        Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[49]] = lIlIlIlIllIIIIl("R3s=", "qOAue");
        Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[50]] = lIlIlIlIllIIIlI("6B0JA4bkQlJFWv1TtlEuTJCRfgavSonX", "MfnIb");
        Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[51]] = lIlIlIlIllIIIlI("voKc5w2aFj2tErdel39zCg==", "arFUk");
        Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[52]] = lIlIlIlIllIIIll("COeGlYM2RSM=", "KJDbg");
        Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[53]] = lIlIlIlIllIIIll("OD4FFMhyjOg79hwgDUI42Ry93WxpHO+a", "WTIAB");
        Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[54]] = lIlIlIlIllIIIll("nBlrS0PSmicY4lyQaiCwHA==", "ZLvPp");
        Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[55]] = lIlIlIlIllIIIIl("YQtLCHFiDAslN2IoGCkhKi4OaXIBOQs7OmI5Dzg9MD9KOzM0Lg5oJi1xSmsSYwtJaA==", "BKjHR");
        Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[57]] = lIlIlIlIllIIIll("QngBt1IeZlr9HATB1nk57wLc9c3LswE9Bn3xNwJfHEKcvB+HCGt1ALg47eD+KKcsOS1kmdCsxkU=", "PfwzN");
        Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[58]] = lIlIlIlIllIIIll("ULaN5ATVLq7vA1ZweRsFbtk4M4aVU6JGZ+A+q9z9+cRFEYY8kbfMHLtdtED3hQutunLlskVhlP9F4bD6CD251A==", "pKPcL");
        Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[60]] = lIlIlIlIllIIIlI("iZehtNcTvK8T8q7QJhUTklNNaJUKYFyvdkFPatCTkSisuTNT8FmmcJVPa61hK9qrRMPmslxp27b+8FkgNO78cg==", "EagCJ");
        Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[62]] = lIlIlIlIllIIIll("8ZTqL+wmxh8=", "tkJgR");
        Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[63]] = lIlIlIlIllIIIlI("pHETwAhD8SDGSR3F8HWGHRvQv5U6vyYN", "JmdGE");
        Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[65]] = lIlIlIlIllIIIll("5YFW/WXjT2U1zMdEB2dQZ8qVUUVivwsLLAOQFzHWdv8=", "bqXbO");
        Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[66]] = lIlIlIlIllIIIlI("PzUQZB3l/xg=", "siTgb");
        Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[67]] = lIlIlIlIllIIIIl("fHo=", "FZRJk");
        Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[68]] = lIlIlIlIllIIIIl("OBwgJzICBih2", "khOWB");
        Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[69]] = lIlIlIlIllIIIIl("PAYVFg==", "NizbP");
        Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[70]] = lIlIlIlIllIIIll("2waEquODfMZ8baeRa/wRq8YXpEd+/bA0", "APSjg");
        Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[71]] = lIlIlIlIllIIIIl("JA8NEQ==", "PfnzN");
        Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[72]] = lIlIlIlIllIIIIl("BCEQMxcaNxATNwYhGhMB", "tSuar");
        Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[73]] = lIlIlIlIllIIIlI("H6L7zfB6Z92gIz4Leakpiw==", "eNpqb");
        Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[74]] = lIlIlIlIllIIIIl("OyYUFik=", "HIaxM");
        Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[75]] = lIlIlIlIllIIIll("TzI50sHhl3M=", "KqWWZ");
        Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[77]] = lIlIlIlIllIIIlI("XTXLufdeBFg=", "ladBw");
        Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[78]] = lIlIlIlIllIIIll("wWFa2cO56Frvb6SpxiTWrw==", "HqaqM");
        Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[79]] = lIlIlIlIllIIIll("3eRAx9u8d8k=", "TkSyN");
        Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[80]] = lIlIlIlIllIIIll("MYoOnv4UwBo=", "vouOn");
        Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[81]] = lIlIlIlIllIIIIl("BxooLhIX", "rjLOf");
        Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[82]] = lIlIlIlIllIIIlI("HQANYdeThVA=", "UDibG");
        Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[83]] = lIlIlIlIllIIIIl("Py0iOXMdJz8pNh0=", "oBQMS");
        Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[84]] = lIlIlIlIllIIIlI("hITWAqWnO1QyTkAify35zKwdOTIhwpwcYs3PrHRDolwPKXkGKK6ieeMTxjK63XhT", "ZtNFu");
        Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[85]] = lIlIlIlIllIIIlI("t4pBWeUHXvg=", "GeHHz");
        Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[86]] = lIlIlIlIllIIIlI("J9qjjWIC89Q=", "ccktV");
        Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[87]] = lIlIlIlIllIIIll("0MS6oDjQTx8=", "sCMGB");
        Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[88]] = lIlIlIlIllIIIIl("bTw2Exku", "MJEjw");
        Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[89]] = lIlIlIlIllIIIlI("NTzmF7nZvVo=", "TaNKT");
        Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[90]] = lIlIlIlIllIIIll("rb+PdcSi748=", "bYIgg");
        Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[91]] = lIlIlIlIllIIIll("mXaQOBF/QtA=", "LRJAM");
        Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[92]] = lIlIlIlIllIIIlI("zR5F+gsegt8=", "olhUv");
        Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[93]] = lIlIlIlIllIIIIl("WQ0YMBFUCBUsEB0Y", "ykyCe");
        Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[94]] = lIlIlIlIllIIIIl("cDcCKgwpfAAoACU1EA==", "PQcDo");
        Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[95]] = lIlIlIlIllIIIlI("J4neKCn9lbc=", "ffZgR");
        Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[96]] = lIlIlIlIllIIIll("QFHZqN7Jurk=", "wKbea");
        Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[97]] = lIlIlIlIllIIIlI("0trIJFFRnunoipq8LqTp7Q==", "uMcgR");
        Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[98]] = lIlIlIlIllIIIlI("I3A0fewbXtUz2LtxYvABLg==", "OJaXI");
        Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[99]] = lIlIlIlIllIIIlI("R3IvNzhsyu4=", "QUHmP");
        Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[100]] = lIlIlIlIllIIIlI("Mx2rF3xtLjayp+LFZYWJyw==", "WDlrg");
        Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[101]] = lIlIlIlIllIIIlI("2ihN4Ud4DWc=", "TFVfc");
        Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[104]] = lIlIlIlIllIIIIl("TVJjVkRe", "nqSxt");
        Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[105]] = lIlIlIlIllIIIIl("", "DiWiT");
        Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[106]] = lIlIlIlIllIIIIl("JBcGIj8yEBM7PzU=", "QyuRZ");
        Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[107]] = lIlIlIlIllIIIIl("OUYoUw==", "bvusw");
        Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[108]] = lIlIlIlIllIIIll("CX9ekeZO0OY=", "wcFzn");
        Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[109]] = lIlIlIlIllIIIll("ynfrD2ZslQg=", "eKxiJ");
        Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[111]] = lIlIlIlIllIIIlI("NfJSeOJCF+Y=", "CbXnM");
        Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[112]] = lIlIlIlIllIIIll("JqsWQxQ8WpI=", "CYuRY");
        Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[113]] = lIlIlIlIllIIIIl("HDQwNhcKMyUvFw0=", "iZCFr");
        Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[114]] = lIlIlIlIllIIIIl("EEYxdA==", "KylTX");
        Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[115]] = lIlIlIlIllIIIll("R/GB4zaN/0g=", "GdhwI");
        Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[116]] = lIlIlIlIllIIIll("KA+smFuy6lU=", "wTOKT");
        Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[117]] = lIlIlIlIllIIIIl("Sg==", "oCKQh");
        Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[118]] = lIlIlIlIllIIIlI("l99xAe6gD3w=", "aaTJR");
        Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[120]] = lIlIlIlIllIIIll("JDDw3E0ZqTflN2YC4Tv1O91aTVbXwVXWyL+msf8r9URk40UGutHL/cF4pSypuZx0e4x/ThMDaqU=", "RWWUX");
        Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[121]] = lIlIlIlIllIIIlI("bb1XGmkWiW72N5T4hy4UR9j7dZNZ6Dbd00JxfjTX2o6QQO9h1cunst5hJwbMpz3TxFSOoP9ehpg=", "mOiZK");
        Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[122]] = lIlIlIlIllIIIll("lWPfhgsMnC/DBVGEVOV5jWuefcZAXCaI6lI2iHOx/HA=", "OUFbf");
        Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[123]] = lIlIlIlIllIIIll("y2wokd6jJwM=", "JZKix");
        Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[124]] = lIlIlIlIllIIIlI("aYv4sQ/FdGHjdb8j42TCWQ==", "qVGFx");
        Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[125]] = lIlIlIlIllIIIlI("lHPlmUBCJDL7ZvzhtQULKg==", "GNMxm");
        Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[126]] = lIlIlIlIllIIIlI("9Jjks0zeF1felsA8SfLaSHxbgW44aZFZ", "suSLA");
        Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[127]] = lIlIlIlIllIIIIl("Mg8lEzQHDCdWJBAbJhM5", "siCvW");
        Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[128]] = lIlIlIlIllIIIlI("8j9Il0ClQgVx+tn+jtok5w==", "ycGzB");
        Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[129]] = lIlIlIlIllIIIll("ndKcJJNmXHCiva42xNF0jg==", "ADpYc");
        Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[130]] = lIlIlIlIllIIIIl("IhcLIiwXFAlnPAADCCIh", "cqmGO");
        Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[131]] = lIlIlIlIllIIIlI("vqYK2v9d7zbbWA7ie+C8yQ==", "iFlzk");
        Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[132]] = lIlIlIlIllIIIll("aSegRIYNEE4=", "ByujR");
        Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[133]] = lIlIlIlIllIIIIl("ESMKIT4bNBc=", "zFsCQ");
        Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[134]] = lIlIlIlIllIIIll("ihiw2gMMsEIqfdSmS2PpC4JHTX2KnxfjZBRg+1bJcQE=", "NTIJe");
        Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[135]] = lIlIlIlIllIIIIl("Zg==", "IkvCV");
        Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[136]] = lIlIlIlIllIIIlI("7wYbwOi9SuCZdZk4m90ztA==", "IPXtT");
        Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[137]] = lIlIlIlIllIIIlI("pHTdyHf2n2IEGbKAMMv8dQ==", "VpkYP");
        Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[138]] = lIlIlIlIllIIIll("h4CHOL1lk/Y=", "uOGmK");
        Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[139]] = lIlIlIlIllIIIll("pv+JGRuXOWAuGbKTaAvFDLu+mUfoFGZM", "GDqbV");
        Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[140]] = lIlIlIlIllIIIll("38DtldVRfWf2JYoVlEsDFQ==", "sZdqb");
        Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[141]] = lIlIlIlIllIIIIl("ETg3IAokJw==", "AJXBf");
        Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[142]] = lIlIlIlIllIIIlI("C7n7t+6Kq/zOMCaRDh1E0w==", "KKGkK");
        Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[143]] = lIlIlIlIllIIIlI("IfLR9rkeAhqkKqPzwfoNdg==", "SYXgn");
        Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[144]] = lIlIlIlIllIIIIl("GCodMj4LJwo1", "hKoFW");
        Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[145]] = lIlIlIlIllIIIIl("MyMdNDMtITA/NC0jECQzLCg=", "CFsPZ");
        Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[146]] = lIlIlIlIllIIIIl("ChsEBTwwAQJXITcbABA6OBsAE2gqChcBLSs=", "YoewH");
        Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[147]] = lIlIlIlIllIIIIl("HCMJJDUmOQ92KCEjDTEzLiMNMmE8MhogJD0=", "OWhVA");
        Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[148]] = lIlIlIlIllIIIlI("XFDFI8MCvvTgJ7/ENcxnvg==", "JDCDw");
        Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[149]] = lIlIlIlIllIIIll("Ave0+klR+cT73YLSVf1DdQ==", "qMubL");
        Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[150]] = lIlIlIlIllIIIlI("HRzI9T9HUCsU533t7BGXH9ccvke1T41h", "MCkEC");
        Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[151]] = lIlIlIlIllIIIll("NBGvlb9x89c=", "IcUTv");
        Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[152]] = lIlIlIlIllIIIlI("RGqk8R+fWZo=", "NmdRs");
        Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[153]] = lIlIlIlIllIIIll("6qnUai9Yqew=", "pSaaF");
        Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[154]] = lIlIlIlIllIIIlI("1LqaXA1u4aw=", "XcHEw");
        Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[155]] = lIlIlIlIllIIIlI("J93axVHbOLA=", "pHcRO");
        Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[156]] = lIlIlIlIllIIIlI("rjg0IMTsMwLz+4qKghco3g==", "wALjO");
        Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[157]] = lIlIlIlIllIIIll("jc7ccFdRuwGtmWPqR32wEg==", "mEdal");
        Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[158]] = lIlIlIlIllIIIIl("angZBDpr", "BSWFn");
        Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[159]] = lIlIlIlIllIIIll("IG3qbqzNK+g=", "RNFeq");
        Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[160]] = lIlIlIlIllIIIIl("IB8eBhQlDw==", "Dvmvx");
        Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[161]] = lIlIlIlIllIIIll("pbXLUAMgQbqh4ZbNyvHwI/o9cBQWHxrh", "Cgsrh");
        Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[162]] = lIlIlIlIllIIIlI("aAbpdi6WkNw=", "UxLAd");
        Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[163]] = lIlIlIlIllIIIIl("PREyAzU+", "raWmr");
        Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[164]] = lIlIlIlIllIIIlI("Xt/os1BecY4=", "OWQDW");
        Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[165]] = lIlIlIlIllIIIIl("GiEqGCFvBAE5NQ==", "ORCvF");
        Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[166]] = lIlIlIlIllIIIll("yVg0e9UADtpndHaU1xFNZQ==", "PffAL");
        Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[167]] = lIlIlIlIllIIIlI("Qw29Inv2EDc=", "QAKGB");
        Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[168]] = lIlIlIlIllIIIll("aixqX1Mtv48SNoZ04V12WA==", "ACuVI");
        Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[169]] = lIlIlIlIllIIIlI("60GGIWjRp17EYCC8PEO7GfBAMsuJNbNi", "KCGMW");
        Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[170]] = lIlIlIlIllIIIll("s7jgyXHdYbEinrOje6mVWjzCA6Ya1/Cf", "zeZiO");
        Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[171]] = lIlIlIlIllIIIlI("OiTtvR3SR1o=", "ZWovN");
        Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[172]] = lIlIlIlIllIIIIl("MzM5", "UCJsE");
        Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[173]] = lIlIlIlIllIIIll("0SXWgvYnCNFdLOcYcdmOAQ==", "QBJYH");
        Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[174]] = lIlIlIlIllIIIIl("CTwJEQkMLCUHFwgkDwQLDiw=", "mUzae");
        Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[175]] = lIlIlIlIllIIIIl("Fy00MxoSPRg3DwMh", "sDGCv");
        Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[176]] = lIlIlIlIllIIIlI("OxeEaFkGykwjbD1Tmc8k4Q==", "JiXRq");
        Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[177]] = lIlIlIlIllIIIlI("8gBlCqPUcVKINBvt+FFsWA==", "IFpwk");
        Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[178]] = lIlIlIlIllIIIll("PqLy6ms+mCfcoeQ/kxF+1Q==", "ihJiU");
        Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[179]] = lIlIlIlIllIIIlI("ZmHtem7JBCB7wrb/dRiGhA==", "WxesG");
        Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[102]] = lIlIlIlIllIIIll("KwC/hTDgEJU=", "TlnjD");
        Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[180]] = lIlIlIlIllIIIIl("Fg0R", "tdvfZ");
        Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[181]] = lIlIlIlIllIIIlI("8KnZh3JZsb1Jpva58P9/Vw==", "dXXqb");
        Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[182]] = lIlIlIlIllIIIIl("ByQyCxAHIiQ7FRQiKhc=", "uAAde");
        Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[183]] = lIlIlIlIllIIIIl("MDIYHgUwNA4uACM0ACo=", "BWkqp");
        Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[184]] = lIlIlIlIllIIIlI("ITeY75qzm+U=", "FDdoA");
        Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[185]] = lIlIlIlIllIIIll("1B7GiRR0qMZqDIvQiMTs9A==", "MOvyq");
        Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[186]] = lIlIlIlIllIIIll("yPNxC2FuPpbY7XKvK8rZHQ==", "QLJyv");
        Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[187]] = lIlIlIlIllIIIlI("5XdIczmIY3u7isewJh5EIg==", "oMnMJ");
        Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[188]] = lIlIlIlIllIIIIl("MQUHOAMvDjktCy8=", "AifAj");
        Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[189]] = lIlIlIlIllIIIll("7USndxjAl0NyfEpWxH6xQA==", "ijHUo");
        Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[190]] = lIlIlIlIllIIIlI("Ho0OX7RPiGHFxK/JOhchMg==", "nQyfp");
        Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[191]] = lIlIlIlIllIIIIl("PDoLGTI/FRgSJyAjARk=", "SJnwU");
        Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[193]] = lIlIlIlIllIIIll("QFwsKhy+C21kSG3JnPCiGw==", "GukDV");
        Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[195]] = lIlIlIlIllIIIlI("v7N5/6Jzutuowy8qJZpW0A==", "ydXXJ");
        Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[196]] = lIlIlIlIllIIIIl("Dxg0HRkLHCUsDAYLMhoVDQ==", "cyAsz");
        Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[197]] = lIlIlIlIllIIIll("S8UrlILaTrZM3qXYR/l7H+PpNgQXY0HVbLVyZM0ZNxk=", "fthfR");
        Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[198]] = lIlIlIlIllIIIlI("M9oe+mNySFFESlL/Ki4gMXWuUdxPSGe3X6TwLXVI3BQ=", "MyPIk");
        Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[199]] = lIlIlIlIllIIIlI("UG+e7ru3W0hVLbF3B12xi/oKNWytmp29ugJs3R33cPXJuowTIZpGvA==", "roIRS");
        Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[200]] = lIlIlIlIllIIIIl("Axk4EQMUBjwzMCYqBB4HBQc4EBcCEwIAPQsXDRcBECg=", "dugrb");
        Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[201]] = lIlIlIlIllIIIlI("QmpzHpFvsx222NQ45qcsvHKmATZNH4qKvNIpR/N5dHc=", "WavGe");
        Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[202]] = lIlIlIlIllIIIlI("19d5FNfIPRydpLbGcGbdYDT+b5+DLnmv4qx4NnTTbcA=", "KHNiC");
        Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[203]] = lIlIlIlIllIIIIl("Mig2KyolNzIJGRcbCicmJTYMOzgwIDY8Li0wHDouCjQAMC45Gxo8JCclDi0W", "UDiHK");
        Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[204]] = lIlIlIlIllIIIlI("iGLfeblDhQ4RQZqbsMnIvQxGnfA+dOSPMRq4tDjVg2U=", "bIyUp");
        Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[205]] = lIlIlIlIllIIIll("qvKGDqmwoBQwF6lH/T4SpIXwbqcdcaWdar0K3RFzJNA=", "DYFdD");
        Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[206]] = lIlIlIlIllIIIIl("ACkIJyIXNgwFESUaNCszHho+KSIAIAo=", "gEWDC");
        Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[207]] = lIlIlIlIllIIIIl("Cy8+FCccMDo2FC4cBRI2GCs+FTMKJQQFGQovDhYyMQ==", "lCawF");
        Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[208]] = lIlIlIlIllIIIll("cbrh5UK+OJU8l9bqJCUFbBGkHpr6oWtcXegJ2PpWwpo=", "jtVRb");
        Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[209]] = lIlIlIlIllIIIll("AfHr2Xv3g1XWI6j1kgjJJ26s9PxcuWTYwbqbM8OVEgM=", "cEnAO");
        Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[210]] = lIlIlIlIllIIIIl("Ex02BgsEAjIkODYuCgoaDS4ACAsTFDQ=", "tqiej");
        Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[211]] = lIlIlIlIllIIIlI("E03HUVAsvRkZaLB4DAPF7h0YkRqIIZoZTwBuB52Efiw=", "oEvSQ");
        Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[212]] = lIlIlIlIllIIIlI("MNlr0qpiDOHBW/d9d4XKFpAYaFlg1enp3xO2DVDk/ck=", "WQacm");
        Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[213]] = lIlIlIlIllIIIIl("Eg4pMDgFES0SCzc9EjYpAQopJzwNFgMhPCg=", "ubvSY");
        Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[214]] = lIlIlIlIllIIIIl("FTYKCSUCKQ4rFjAFMRglBQU3HyIUPycZGQ==", "rZUjD");
        Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[215]] = lIlIlIlIllIIIll("f4w6zfMDlY8omxq0B4LbFXO4SSmcTQ/LcHBm6792HY4=", "lPIqc");
        Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[216]] = lIlIlIlIllIIIll("khhFqTayl3CX0Hu9pgxo2l7K2E3sW7gSESgraEYkrj8bkEG3pxNTVw==", "tDRVU");
        Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[217]] = lIlIlIlIllIIIIl("NgoqDiQhFS4sFxM5ER8kJjkcAyE4FBAOMQw=", "QfumE");
        Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[218]] = lIlIlIlIllIIIlI("lK7NNy02KDLi7XpgeGCyVOvmCXtl6vzfdzXhqzCdGok=", "lqiHS");
        Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[219]] = lIlIlIlIllIIIlI("j+7E9iZ9Meuvwo+IzgOzWo8TS3u5/BtVAj3H3+0YABi+4RnisM+R0g==", "NAUEB");
        Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[220]] = lIlIlIlIllIIIIl("Nj4MCQIhIQgrMRMNNhITPTswAxcOJz0DBT4gPjUPPjEyHgo+PA4=", "QRSjc");
        Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[103]] = lIlIlIlIllIIIlI("JvQ7kC4uZL+HgrTOW9GHqpDLAV9oOcO4ZwDI5xhnP62W6GhfIsQVHA==", "xBlvc");
        Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[221]] = lIlIlIlIllIIIlI("WGOPS/Zc493Fm6uixoNVbyNoJ9RETMC7JrKzWGH46Uk=", "hHLGr");
        Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[222]] = lIlIlIlIllIIIlI("xVefndzMGmnf+TVa5V00LZqoksVBcA3y9mMqaLUWq7Q=", "KCexE");
        Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[223]] = lIlIlIlIllIIIll("BI0MaBZkKzqYYa3vKcsd8EZKYh0s8BqBYTeYUAcr+/bJbe1gN8+6Ew==", "RHiVy");
        Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[224]] = lIlIlIlIllIIIll("UmZuaJYsixZkSZiiLvuqzWjLEz3MZYyxFT07lPSUiuI=", "kkGsr");
        Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[225]] = lIlIlIlIllIIIlI("yvmfjYJPW1xkGdP7gaQwpmSbwCFm1lAHOj7fYDydvmQ=", "oglol");
        Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[226]] = lIlIlIlIllIIIll("cWZ1fTfeJLPkVMr7e++MSd27pqAYH15BpUhREghjBbs=", "NoQqT");
        Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[227]] = lIlIlIlIllIIIIl("LSs2CjI6NDIoAQgYDhkmFTQBCDcvNVw0", "JGiiS");
        Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[228]] = lIlIlIlIllIIIlI("had/V7aSRWx1oLE+zpPDwdXQ1G+YnhxxHSLdJIgd6Ew=", "TiXvW");
        Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[229]] = lIlIlIlIllIIIlI("5ad+BtUWG2BiHKdpqd02bHZQkaYDRQaBLprS3npHQnc=", "yGqrU");
        Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[230]] = lIlIlIlIllIIIll("z6vOqE6MOlDC30aMn1SiwTn2+8RbR4RIH6RkSzfDTgo=", "ySjaG");
        Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[231]] = lIlIlIlIllIIIIl("HR0PNi0KAgsUHjguPTQ8JRMlMyofAw80IBMWPjgpFAUN", "zqPUL");
        Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[232]] = lIlIlIlIllIIIll("rskrP+Pr7je3rny9MavFIE+Cfz0qAI5PXKVhDNQWjAc=", "VWVXD");
        Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[233]] = lIlIlIlIllIIIIl("CgcGFBgdGAI2Ky80NAIVGQIqFhQdBzwq", "mkYwy");
        Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[234]] = lIlIlIlIllIIIll("va5Osb6NYir5hg17/FQg/HzXK+lcymTcheTYgW8hlqs=", "jpNVc");
        Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[235]] = lIlIlIlIllIIIIl("BR42ICQSATICFyAtBiAmDgcaKioMLRg2IBALWx4=", "briCE");
        Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[236]] = lIlIlIlIllIIIIl("FxYsJQAACSgHMzIlAy8ZFRYsJBQWHBY0Ph8YGSMCBCc=", "pzsFa");
        Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[237]] = lIlIlIlIllIIIIl("EA41BAIHETEmMTU9GQICGg4PFBAoAR8FBigPCxc+", "wbjgc");
        Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[238]] = lIlIlIlIllIIIlI("tnslZOzHw5vQmz9nYLZfzmgl1Mgl4cKU6Fkk4yjt7jE=", "Dxzvs");
        Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[239]] = lIlIlIlIllIIIll("/vBy6UjnJYqLwzkGDHyC4XOuQIFlRXSjDCfOYJ3n+Q5hRCBMkQBU2Q==", "NSmYo");
        Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[240]] = lIlIlIlIllIIIIl("JiArKhMxPy8IIAMTByETJSkGFgYkNAA8ACQTGCYWHA==", "ALtIr");
        Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[241]] = lIlIlIlIllIIIIl("KRg3EhU+BzMwJgwrGxkVKhsfLA==", "Nthqt");
        Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[242]] = lIlIlIlIllIIIIl("KDU+DAM/KjouMA0GEgcDKzYWMAMiOwgKDDsE", "OYaob");
        Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[243]] = lIlIlIlIllIIIIl("LicUBiY5OBAkFQsUOBEiJygiCRg9LjMRMjsiJQIa", "IKKeG");
        Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[244]] = lIlIlIlIllIIIll("esLeh00WoYvNwth359KEGqlyuSOQDUh+", "UnAoM");
        Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[245]] = lIlIlIlIllIIIIl("FygqOTcANy4bBDIbAT8lAyEZNjcELRo0CQMsFD4zAhk=", "pDuZV");
        Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[246]] = lIlIlIlIllIIIlI("pb0sKOjvxd04kVI3rDR7Us27ox0dL7iAvGf2tCwlA7cEMwaJOCfK9Q==", "rLnnn");
        Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[247]] = lIlIlIlIllIIIlI("n6p7pz7u5W1mrDy36evkp+eazNR9AmzXNLOrjV4JBeo9ViBfFiPD+Q==", "TPNbG");
        Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[248]] = lIlIlIlIllIIIll("r8346vJUWk9dKlnfPj0TqJzsGNZKxNVI0CcY48k3jOk=", "KfHMM");
        Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[249]] = lIlIlIlIllIIIIl("EgIpKDQFHS0KBzcxAi4tARsELgoWGxQuChgPBhQ0BxwXMgg=", "unvKU");
        Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[250]] = lIlIlIlIllIIIlI("CgBX6i0o9nyCIHrN+BT6fL6passfpiYwICqwZ4iU1ni4ZJi15wZZyg==", "brkpb");
        Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[251]] = lIlIlIlIllIIIll("aRMorm5Wj/aOWtOXagDNON/AejZ/qolyrNRXkHxg03nbhEA6Vmhmkw==", "UNIMn");
        Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[252]] = lIlIlIlIllIIIIl("ACANBSkXPwknGiUTJAM6EykqOSoLKTwCFQ==", "gLRfH");
        Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[253]] = lIlIlIlIllIIIIl("CAcbIhkfGB8AKi00MiQKGw48HhoaDSIkCjAEJisdDB8Z", "okDAx");
        Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[254]] = lIlIlIlIllIIIIl("CwkGFDMcFgI2AC46LxIgGAAhKCIeCj4FMwE4", "leYwR");
        Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[255]] = lIlIlIlIllIIIlI("g8vQyrSvQOuWefgyMsxsSbuMjpJ2/eS0FR2BA9Wl5TQ=", "qlWFh");
        Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[256]] = lIlIlIlIllIIIlI("nuugJepvuxCppCGQtsS8fUt2EI1MryqJnPgiGfLGcvQ=", "MCKuC");
        Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[257]] = lIlIlIlIllIIIlI("9qwzc3q8LQJzEuQ2JZhNjPmaBafIUCoH0aMQI6y/TOsY+KNuekY1gQ==", "BlxJv");
        Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[258]] = lIlIlIlIllIIIlI("bcCOUPYGi9lVh7d69Us3i12A8gZqrhLNiNCukfR85Ua7fgtaKsdHMA==", "PWvxn");
        Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[259]] = lIlIlIlIllIIIlI("3iTrZ6I70ydqe4GSfCxBQAtPG6Sy389fi1vQxhwzsHM=", "goPVG");
        Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[260]] = lIlIlIlIllIIIll("F+88C8VN2s0rek/JXUI26TBRHowjipCQCqqNGvv2WHc=", "JivwX");
        Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[261]] = lIlIlIlIllIIIlI("2rbs3XPTftKZxoBxFDgNSbUF4SunWD2NvK8Y+m+ORxY=", "cLwoj");
        Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[262]] = lIlIlIlIllIIIlI("rKojqD5szXNwKG0OqGuLzb3pebJVd55ZHXdWWQr+VFauz7pFGx9qsQ==", "IzcHu");
        Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[263]] = lIlIlIlIllIIIIl("FQ85KSoCED0PEyY8ADgqHwYEPy0UBhQVJBAJAyk/Lw==", "rcfJK");
        Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[264]] = lIlIlIlIllIIIlI("qGlj7PY0RgA8SZmDFxoYHiQ7ahLe0lk6YXK+d1S5odM=", "gwWBe");
        Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[265]] = lIlIlIlIllIIIlI("eQFSsrXhksDx0eSiY5SA/kBAa/DgfnzJdFoWaOKVorM=", "HYMxk");
        Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[266]] = lIlIlIlIllIIIlI("34geupYJDtxP8Ig86yBpethLobGI5S6yb+tdIsxaFLtNDl+DxfEk+Q==", "WGEne");
        Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[267]] = lIlIlIlIllIIIIl("KSEXNwo+PhMRMxoSLyQeET4gNQ8rP3wJ", "NMHTk");
        Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[268]] = lIlIlIlIllIIIIl("ABkKOSkXBg4fEDMqOC8kExwKPjoGAgo7OhUULCkV", "guUZH");
        Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[269]] = lIlIlIlIllIIIll("vH/Nj+ZIxojHWj6ltndLr6OB9OReGtmmVHsWMCigsnvBlPSPCHRGlA==", "tculE");
        Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[270]] = lIlIlIlIllIIIIl("EQolIBcGFSEGLiI5CiIaExIOJhIpEh87AgMUHx4=", "vfzCv");
        Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[271]] = lIlIlIlIllIIIlI("+ejBJCWNXehKYIYWGeKQ32cPRrxePHoVPedktLwvU7s=", "PWXVF");
        Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[272]] = lIlIlIlIllIIIlI("MWHED8qOsaBkcGnqLXCbNEkgVI6UtMxc190qU0771twEJ5CzSz1sLw==", "JBkvY");
        Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[273]] = lIlIlIlIllIIIll("lBIDqg4V8jinjmGt7fY+rzFgHPfT5elmNsrxRr4agLUrONTRTSh7Bw==", "HVvOC");
        Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[274]] = lIlIlIlIllIIIll("cRGM0th5APxJSrEPh0bMQzyaseBRIpUmT/BwMVI9r4o=", "oXEtX");
        Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[61]] = lIlIlIlIllIIIIl("Bi0tNi4RMikQFzUeAT0uEyQWCjsEOQYgPQQeAjQjBDUGMBI=", "aArUO");
        Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[64]] = lIlIlIlIllIIIll("X8CGgN3ReedQU3zuh0a6mZkj2xBUaTdp2gpCPxqiaDo=", "HdMDk");
        Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[275]] = lIlIlIlIllIIIIl("CTwUFjceIxAwDjoPOAEzADMiGQkaJyQqJQc0Lig=", "nPKuV");
        Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[276]] = lIlIlIlIllIIIlI("PDT2zSoFrxhS3Nwj8RVyfSMQ0q1zMIEYDWlryUl34Do=", "zLcoW");
        Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[277]] = lIlIlIlIllIIIlI("QJ6BiRyIW21CNE/DHicVicWRdcpun/wl", "LVlNt");
        Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[278]] = lIlIlIlIllIIIll("UY2cQFenlJNBr6mOwqCwcLCdQUvGhSv97S0J+fI4D50=", "vgfuS");
        Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[279]] = lIlIlIlIllIIIlI("a1CSeLV9Sao5uynM/FvxzvPD3Q1XOvOj3w2dS/GLE271R4xTU9/Qjg==", "GMouD");
        Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[280]] = lIlIlIlIllIIIlI("8S7NsCj530lturpQ6CYftma5Uz7ADuNq81M4i4r/p4s=", "Vucnx");
        Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[281]] = lIlIlIlIllIIIIl("FQASJAACHxYCOSYzOSIZBhk/Ij4eAykYAxsNPho=", "rlMGa");
        Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[282]] = lIlIlIlIllIIIll("t7LEvVzMra+QkrmdyCTk8j5HsApImkof+xtLA/H14eg=", "MvZvK");
        Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[283]] = lIlIlIlIllIIIll("+AYaQ8pJ4hna5qxQCEzr+gx56WdeLWX8QFS0KcHwcj0=", "bVlxf");
        Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[284]] = lIlIlIlIllIIIlI("oH7zLqbSbC+oIFWxzX54SfGv0E4XzaNUM6LrzdNjob8=", "qWDmt");
        Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[285]] = lIlIlIlIllIIIll("iG978TesASidJTjp8a3BgFsfMiSnvmKCwnVHLr6pSSc=", "JdDqO");
        Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[287]] = lIlIlIlIllIIIlI("eP0vrq7H7h2SNJ4eVmo5igA2JSYFHZxIyPdpYcSUw3lq0Pf1wqbRfg==", "lHyNe");
        Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[289]] = lIlIlIlIllIIIlI("ob49HBOJxiNnQVrEqobePSuSG3Pmz4IV5FAnJkMFts8=", "hGswq");
        Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[291]] = lIlIlIlIllIIIll("1aRsnGDTqrCEu9ijMDLALSioCWy++x8Zr3VCc1YexICaiVE9OZTpdNcVj7IzFOcb", "NEkje");
        Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[293]] = lIlIlIlIllIIIIl("DAI0ASobHTAFJzQDChoUHwsTFj4ZCzQLJgoJDj0+BQcfERY=", "knkbK");
        Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[295]] = lIlIlIlIllIIIll("cX5KvG4NeeGDDaBL/ue+4GiN94e1mPWD2aZLgBlZZY1/FKZaKGemiQ==", "PZSAh");
        Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[297]] = lIlIlIlIllIIIll("EupFQRcS6rFVPhh/PNRpMfXTp7GwD55B", "KkPhz");
        Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[303]] = lIlIlIlIllIIIlI("XYtecGQ/ixowYAY7bxPSqmcIiejaHGHp", "EwXmE");
        Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[304]] = lIlIlIlIllIIIlI("zm/XOueojYU=", "AkRCk");
        Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[305]] = lIlIlIlIllIIIIl("Cgs8RiIhBSwfcDALaBUkJRY8RiMwFi0HPS0KL0YpIRBp", "DdHfP");
        Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[306]] = lIlIlIlIllIIIlI("gmv8goz1ivocZnooh8RAgWUYF9IL7ezJ", "uwoto");
        Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[307]] = lIlIlIlIllIIIlI("h1Q5rNejuKkMErE6XisNowIjIL+tUhYh", "qLoOP");
        Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[308]] = lIlIlIlIllIIIlI("Y6GSNU+Rl+JfH6fXC8qtfOotZnqn69n3", "nZNHy");
        Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[309]] = lIlIlIlIllIIIll("Rk87Rh546Ps=", "mARqT");
    }
    
    public IStream getTwitchStream() {
        return this.stream;
    }
    
    public boolean isJava64bit() {
        return this.jvm64bit;
    }
    
    public SoundHandler getSoundHandler() {
        return this.mcSoundHandler;
    }
    
    private void initStream() {
        try {
            this.stream = new TwitchStream(this, (Property)Iterables.getFirst((Iterable)this.twitchDetails.get((Object)Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[39]]), (Object)null));
            "".length();
            if ((0x52 ^ 0x56) > (0x75 ^ 0x71)) {
                return;
            }
        }
        catch (Throwable lllllllllllllIlIllIIllIllIIllIII) {
            this.stream = new NullStream(lllllllllllllIlIllIIllIllIIllIII);
            Minecraft.logger.error(Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[40]]);
        }
    }
    
    public void displayCrashReport(final CrashReport lllllllllllllIlIllIIllIlIlIlIIIl) {
        final File lllllllllllllIlIllIIllIlIlIlIIII = new File(getMinecraft().mcDataDir, Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[51]]);
        final File lllllllllllllIlIllIIllIlIlIIllll = new File(lllllllllllllIlIllIIllIlIlIlIIII, String.valueOf(new StringBuilder(Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[52]]).append(new SimpleDateFormat(Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[53]]).format(new Date())).append(Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[54]])));
        Bootstrap.printToSYSOUT(lllllllllllllIlIllIIllIlIlIlIIIl.getCompleteReport());
        if (lIlIlIlllIIllIl(lllllllllllllIlIllIIllIlIlIlIIIl.getFile())) {
            Bootstrap.printToSYSOUT(String.valueOf(new StringBuilder(Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[55]]).append(lllllllllllllIlIllIIllIlIlIlIIIl.getFile())));
            System.exit(Minecraft.llllIllIllIll[56]);
            "".length();
            if (((0xBF ^ 0xB9) & ~(0xA4 ^ 0xA2)) > 0) {
                return;
            }
        }
        else if (lIlIlIlllIIlllI(lllllllllllllIlIllIIllIlIlIlIIIl.saveToFile(lllllllllllllIlIllIIllIlIlIIllll) ? 1 : 0)) {
            Bootstrap.printToSYSOUT(String.valueOf(new StringBuilder(Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[57]]).append(lllllllllllllIlIllIIllIlIlIIllll.getAbsolutePath())));
            System.exit(Minecraft.llllIllIllIll[56]);
            "".length();
            if ((191 + 24 - 106 + 88 ^ 22 + 113 - 17 + 75) < 0) {
                return;
            }
        }
        else {
            Bootstrap.printToSYSOUT(Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[58]]);
            System.exit(Minecraft.llllIllIllIll[59]);
        }
    }
    
    private static boolean lIlIlIlllIIlllI(final int lllllllllllllIlIllIIlIlIIIlIIIll) {
        return lllllllllllllIlIllIIlIlIIIlIIIll != 0;
    }
    
    private static int lIlIlIlllIllIIl(final float n, final float n2) {
        return fcmpg(n, n2);
    }
    
    private static void lIlIlIlllIIlIIl() {
        (llllIllIllIll = new int[311])[0] = ((0x54 ^ 0x5F ^ (0xB ^ 0x5A)) & (42 + 142 - 74 + 105 ^ 40 + 62 + 28 + 11 ^ -" ".length()));
        Minecraft.llllIllIllIll[1] = " ".length();
        Minecraft.llllIllIllIll[2] = (-(0xFFFFFBF7 & 0x27BF) & (0xFFFFABF7 & 0xA077BE));
        Minecraft.llllIllIllIll[3] = "  ".length();
        Minecraft.llllIllIllIll[4] = (-(0xFFFFAE7F & 0x55F3) & (0xFFFFDF76 & 0x2EFB));
        Minecraft.llllIllIllIll[5] = (-(0xFFFFFC7F & 0x7BBC) & (-1 & 0x7E7B));
        Minecraft.llllIllIllIll[6] = (0xFFFF8FE6 & 0x7B59);
        Minecraft.llllIllIllIll[7] = (-(0xFFFFDCFE & 0x7BA7) & (0xFFFFFFED & 0x5FBF));
        Minecraft.llllIllIllIll[8] = "   ".length();
        Minecraft.llllIllIllIll[9] = (41 + 73 - 12 + 53 ^ 1 + 96 - 81 + 143);
        Minecraft.llllIllIllIll[10] = (0x87 ^ 0x82);
        Minecraft.llllIllIllIll[11] = (0x79 ^ 0x7F);
        Minecraft.llllIllIllIll[12] = (0x11 ^ 0x16);
        Minecraft.llllIllIllIll[13] = (0xA2 ^ 0xAA);
        Minecraft.llllIllIllIll[14] = (33 + 51 - 10 + 93 ^ 108 + 145 - 93 + 14);
        Minecraft.llllIllIllIll[15] = (0xD ^ 0x7);
        Minecraft.llllIllIllIll[16] = (0x78 ^ 0x73);
        Minecraft.llllIllIllIll[17] = (0xFA ^ 0x87 ^ (0x16 ^ 0x67));
        Minecraft.llllIllIllIll[18] = (0x67 ^ 0x4B ^ (0x49 ^ 0x68));
        Minecraft.llllIllIllIll[19] = (0x41 ^ 0x4F);
        Minecraft.llllIllIllIll[20] = (0xB3 ^ 0xBC);
        Minecraft.llllIllIllIll[21] = (0x19 ^ 0x1C ^ (0x22 ^ 0x37));
        Minecraft.llllIllIllIll[22] = (0x1E ^ 0x70 ^ 29 + 66 - 51 + 83);
        Minecraft.llllIllIllIll[23] = (0x73 ^ 0x61);
        Minecraft.llllIllIllIll[24] = (0xFFFFDFAF & 0x3D51);
        Minecraft.llllIllIllIll[25] = (0xFFFFC33B & 0x3EC7);
        Minecraft.llllIllIllIll[26] = (0xFFFFC345 & 0x3EBE);
        Minecraft.llllIllIllIll[27] = (-(0xFFFFFFD9 & 0xAFF) & (0xFFFFFEDD & 0xFFF));
        Minecraft.llllIllIllIll[28] = (-(0xFFFFE93F & 0x3EE3) & (0xFFFFBF73 & 0x7FAF));
        Minecraft.llllIllIllIll[29] = (-(0xFFFFFAFE & 0x6DB5) & (0xFFFFFFBF & 0x7FF3));
        Minecraft.llllIllIllIll[30] = (0x32 ^ 0x21);
        Minecraft.llllIllIllIll[31] = (0x40 ^ 0x54);
        Minecraft.llllIllIllIll[32] = (0x39 ^ 0x7 ^ (0xAF ^ 0x84));
        Minecraft.llllIllIllIll[33] = (0x41 ^ 0x57);
        Minecraft.llllIllIllIll[34] = (0xBF ^ 0xA8);
        Minecraft.llllIllIllIll[35] = (0xBC ^ 0xA4);
        Minecraft.llllIllIllIll[36] = (0x92 ^ 0xC4 ^ (0xE6 ^ 0xA9));
        Minecraft.llllIllIllIll[37] = (0x8 ^ 0x51 ^ (0x3B ^ 0x78));
        Minecraft.llllIllIllIll[38] = (0xD8 ^ 0xC3 ^ ((0x50 ^ 0x4A) & ~(0x80 ^ 0x9A)));
        Minecraft.llllIllIllIll[39] = (0x47 ^ 0x5B);
        Minecraft.llllIllIllIll[40] = (0xDF ^ 0xB0 ^ (0x29 ^ 0x5B));
        Minecraft.llllIllIllIll[41] = (0x8A ^ 0x94);
        Minecraft.llllIllIllIll[42] = (135 + 22 - 124 + 152 ^ 76 + 55 - 36 + 71);
        Minecraft.llllIllIllIll[43] = (77 + 91 - 63 + 58 ^ 24 + 107 - 80 + 80);
        Minecraft.llllIllIllIll[44] = (0x1 ^ 0x3E ^ (0xB1 ^ 0xAF));
        Minecraft.llllIllIllIll[45] = (0x50 ^ 0x72);
        Minecraft.llllIllIllIll[46] = (0x1B ^ 0x38);
        Minecraft.llllIllIllIll[47] = (0x14 ^ 0x4B ^ (0x48 ^ 0x33));
        Minecraft.llllIllIllIll[48] = (92 + 1 - 59 + 142 ^ 118 + 146 - 176 + 61);
        Minecraft.llllIllIllIll[49] = (0x4D ^ 0x6B);
        Minecraft.llllIllIllIll[50] = (0xAE ^ 0x89);
        Minecraft.llllIllIllIll[51] = (171 + 148 - 180 + 47 ^ 51 + 11 - 12 + 96);
        Minecraft.llllIllIllIll[52] = (0x27 ^ 0x2F ^ (0xD ^ 0x2C));
        Minecraft.llllIllIllIll[53] = (0x3F ^ 0x15);
        Minecraft.llllIllIllIll[54] = (0xAA ^ 0x81);
        Minecraft.llllIllIllIll[55] = (0x32 ^ 0x1E);
        Minecraft.llllIllIllIll[56] = -" ".length();
        Minecraft.llllIllIllIll[57] = (0x1D ^ 0x14 ^ (0xB5 ^ 0x91));
        Minecraft.llllIllIllIll[58] = (70 + 146 - 203 + 173 ^ 57 + 130 - 82 + 43);
        Minecraft.llllIllIllIll[59] = -"  ".length();
        Minecraft.llllIllIllIll[60] = (0x22 ^ 0xD);
        Minecraft.llllIllIllIll[61] = (0xF0 ^ 0x99) + (0x58 ^ 0x14) - (106 + 107 - 146 + 87) + (102 + 24 - 6 + 108);
        Minecraft.llllIllIllIll[62] = (0x13 ^ 0x23);
        Minecraft.llllIllIllIll[63] = (0xF6 ^ 0xC7);
        Minecraft.llllIllIllIll[64] = (-(0xFFFFBFBE & 0x72CB) & (0xFFFFFFC9 & 0x33BF));
        Minecraft.llllIllIllIll[65] = (0x70 ^ 0x42);
        Minecraft.llllIllIllIll[66] = (0xB9 ^ 0x8A);
        Minecraft.llllIllIllIll[67] = (0x5D ^ 0x69);
        Minecraft.llllIllIllIll[68] = ("   ".length() ^ (0x9 ^ 0x3F));
        Minecraft.llllIllIllIll[69] = (0xC7 ^ 0x81 ^ (0x31 ^ 0x41));
        Minecraft.llllIllIllIll[70] = (0x33 ^ 0x37 ^ (0x18 ^ 0x2B));
        Minecraft.llllIllIllIll[71] = (0xFB ^ 0xC7 ^ (0x8A ^ 0x8E));
        Minecraft.llllIllIllIll[72] = (0xB3 ^ 0x8A);
        Minecraft.llllIllIllIll[73] = (25 + 88 - 43 + 114 ^ 118 + 70 - 65 + 7);
        Minecraft.llllIllIllIll[74] = (27 + 34 - 14 + 102 ^ 106 + 1 + 21 + 46);
        Minecraft.llllIllIllIll[75] = (0x15 ^ 0x35 ^ (0x51 ^ 0x4D));
        Minecraft.llllIllIllIll[76] = (0xFFFFFF64 & 0x419B);
        Minecraft.llllIllIllIll[77] = (0x44 ^ 0x79);
        Minecraft.llllIllIllIll[78] = (1 + 74 - 67 + 181 ^ 95 + 43 - 30 + 23);
        Minecraft.llllIllIllIll[79] = (0x95 ^ 0xAA);
        Minecraft.llllIllIllIll[80] = (0x2B ^ 0x3B ^ (0xE0 ^ 0xB0));
        Minecraft.llllIllIllIll[81] = (0x41 ^ 0x1D ^ (0x93 ^ 0x8E));
        Minecraft.llllIllIllIll[82] = (0x5D ^ 0x1F);
        Minecraft.llllIllIllIll[83] = (0x2 ^ 0x41);
        Minecraft.llllIllIllIll[84] = (0x3 ^ 0x47);
        Minecraft.llllIllIllIll[85] = (0xC4 ^ 0x81);
        Minecraft.llllIllIllIll[86] = (160 + 210 - 146 + 4 ^ 84 + 136 - 130 + 72);
        Minecraft.llllIllIllIll[87] = (0x34 ^ 0x21 ^ (0xC7 ^ 0x95));
        Minecraft.llllIllIllIll[88] = (0x43 ^ 0x3E ^ (0x20 ^ 0x15));
        Minecraft.llllIllIllIll[89] = (70 + 156 - 38 + 31 ^ 109 + 21 + 1 + 15);
        Minecraft.llllIllIllIll[90] = (0x12 ^ 0x58);
        Minecraft.llllIllIllIll[91] = (0x72 ^ 0x55 ^ (0x13 ^ 0x7F));
        Minecraft.llllIllIllIll[92] = (0xC2 ^ 0x85 ^ (0x81 ^ 0x8A));
        Minecraft.llllIllIllIll[93] = (42 + 97 - 57 + 161 ^ 72 + 173 - 183 + 128);
        Minecraft.llllIllIllIll[94] = (0x5A ^ 0x14);
        Minecraft.llllIllIllIll[95] = (0x51 ^ 0x1E);
        Minecraft.llllIllIllIll[96] = (0x6F ^ 0x3F);
        Minecraft.llllIllIllIll[97] = (0x6B ^ 0x38 ^ "  ".length());
        Minecraft.llllIllIllIll[98] = (0x75 ^ 0x27);
        Minecraft.llllIllIllIll[99] = (0xF1 ^ 0x93 ^ (0x2E ^ 0x1F));
        Minecraft.llllIllIllIll[100] = (0x70 ^ 0x24);
        Minecraft.llllIllIllIll[101] = (0x33 ^ 0x7B ^ (0xB3 ^ 0xAE));
        Minecraft.llllIllIllIll[102] = 10 + 139 - 125 + 136;
        Minecraft.llllIllIllIll[103] = (0xA6 ^ 0xBA) + (0x3B ^ 0x25) - -(0xCD ^ 0xB3) + (0x78 ^ 0x68);
        Minecraft.llllIllIllIll[104] = (0x40 ^ 0xD ^ (0x73 ^ 0x68));
        Minecraft.llllIllIllIll[105] = (0xEC ^ 0x8C ^ (0x94 ^ 0xA3));
        Minecraft.llllIllIllIll[106] = (0xB2 ^ 0xBE ^ (0xF4 ^ 0xA0));
        Minecraft.llllIllIllIll[107] = (0x54 ^ 0x1B ^ (0x3E ^ 0x28));
        Minecraft.llllIllIllIll[108] = (0x3F ^ 0x65);
        Minecraft.llllIllIllIll[109] = (7 + 105 + 69 + 32 ^ 48 + 46 + 34 + 14);
        Minecraft.llllIllIllIll[110] = (-1 & 0xFFFFFF);
        Minecraft.llllIllIllIll[111] = (0xE1 ^ 0xBD);
        Minecraft.llllIllIllIll[112] = (0x75 ^ 0x28);
        Minecraft.llllIllIllIll[113] = (0xF6 ^ 0xA5 ^ (0x45 ^ 0x48));
        Minecraft.llllIllIllIll[114] = (0xFB ^ 0xA4);
        Minecraft.llllIllIllIll[115] = (0xD8 ^ 0xBD ^ (0x15 ^ 0x10));
        Minecraft.llllIllIllIll[116] = (54 + 117 - 7 + 37 ^ 7 + 30 - 13 + 144);
        Minecraft.llllIllIllIll[117] = (0xE ^ 0x6C);
        Minecraft.llllIllIllIll[118] = (0x42 ^ 0x21);
        Minecraft.llllIllIllIll[119] = (-(0xFFFFD7EF & 0x38F7) & (0xFFFFFFF6 & 0x37FF));
        Minecraft.llllIllIllIll[120] = (0x26 ^ 0x3E ^ (0xE7 ^ 0x9B));
        Minecraft.llllIllIllIll[121] = (0xD9 ^ 0xBC);
        Minecraft.llllIllIllIll[122] = (0x40 ^ 0x26);
        Minecraft.llllIllIllIll[123] = (0xF6 ^ 0x91);
        Minecraft.llllIllIllIll[124] = (0x25 ^ 0x4D);
        Minecraft.llllIllIllIll[125] = (0x20 ^ 0x49);
        Minecraft.llllIllIllIll[126] = (0x4D ^ 0x27);
        Minecraft.llllIllIllIll[127] = (0x26 ^ 0x11 ^ (0xCC ^ 0x90));
        Minecraft.llllIllIllIll[128] = (0x2B ^ 0x69 ^ (0x4 ^ 0x2A));
        Minecraft.llllIllIllIll[129] = (172 + 129 - 127 + 27 ^ 93 + 103 - 80 + 48);
        Minecraft.llllIllIllIll[130] = (0x18 ^ 0x76);
        Minecraft.llllIllIllIll[131] = (0x53 ^ 0x3C);
        Minecraft.llllIllIllIll[132] = ("  ".length() ^ (0x51 ^ 0x23));
        Minecraft.llllIllIllIll[133] = (0x50 ^ 0x21);
        Minecraft.llllIllIllIll[134] = (0xD3 ^ 0xBF ^ (0xAA ^ 0xB4));
        Minecraft.llllIllIllIll[135] = (0x5D ^ 0x2E);
        Minecraft.llllIllIllIll[136] = (0x79 ^ 0x59 ^ (0x96 ^ 0xC2));
        Minecraft.llllIllIllIll[137] = (0xDE ^ 0x9F ^ (0x81 ^ 0xB5));
        Minecraft.llllIllIllIll[138] = (97 + 35 + 32 + 40 ^ 168 + 117 - 133 + 34);
        Minecraft.llllIllIllIll[139] = (0x2A ^ 0x5D);
        Minecraft.llllIllIllIll[140] = (0x19 ^ 0x61);
        Minecraft.llllIllIllIll[141] = (0x77 ^ 0xE);
        Minecraft.llllIllIllIll[142] = (" ".length() ^ (0x5 ^ 0x7E));
        Minecraft.llllIllIllIll[143] = (0xD3 ^ 0xA8);
        Minecraft.llllIllIllIll[144] = (0x0 ^ 0x7C);
        Minecraft.llllIllIllIll[145] = (0x32 ^ 0x4F);
        Minecraft.llllIllIllIll[146] = (0xD ^ 0x73);
        Minecraft.llllIllIllIll[147] = (0xC8 ^ 0x92) + (0xA ^ 0x28) - (0x62 ^ 0x3C) + (0x5C ^ 0x3D);
        Minecraft.llllIllIllIll[148] = (0x2B ^ 0x75) + (0x3D ^ 0x3A) - -"   ".length() + (0x16 ^ 0xE);
        Minecraft.llllIllIllIll[149] = (0x68 ^ 0x7) + (0xA5 ^ 0x9F) - (0x71 ^ 0x9) + (0x42 ^ 0x12);
        Minecraft.llllIllIllIll[150] = 89 + 51 - 34 + 24;
        Minecraft.llllIllIllIll[151] = 100 + 101 - 141 + 71;
        Minecraft.llllIllIllIll[152] = (0x3F ^ 0x5) + (0xC6 ^ 0x8F) - (0x79 ^ 0xC) + (0x6D ^ 0x1B);
        Minecraft.llllIllIllIll[153] = 49 + 86 - 82 + 80;
        Minecraft.llllIllIllIll[154] = (0x95 ^ 0xB1) + (0x59 ^ 0x2A) - (0xD ^ 0x7D) + (0x5D ^ 0x2);
        Minecraft.llllIllIllIll[155] = (0x2D ^ 0x14) + (0xB ^ 0x7D) - (68 + 32 - 89 + 123) + (0x22 ^ 0x7C);
        Minecraft.llllIllIllIll[156] = 92 + 9 - 87 + 122;
        Minecraft.llllIllIllIll[157] = (0x52 ^ 0x27) + (0xA2 ^ 0xAF) - (0x58 ^ 0x4D) + (0xAC ^ 0xB0);
        Minecraft.llllIllIllIll[158] = 23 + 83 - 95 + 127;
        Minecraft.llllIllIllIll[159] = 73 + 107 - 109 + 68;
        Minecraft.llllIllIllIll[160] = (0xC0 ^ 0xA4) + (0x60 ^ 0xA) - (112 + 18 - 86 + 85) + (0x1A ^ 0x25);
        Minecraft.llllIllIllIll[161] = 32 + 114 - 84 + 79;
        Minecraft.llllIllIllIll[162] = 92 + 11 - 37 + 65 + (0xC ^ 0xA) - (0x15 ^ 0x18) + (0x84 ^ 0x96);
        Minecraft.llllIllIllIll[163] = (0xB0 ^ 0xAD) + (0xC9 ^ 0x8A) - -(0x53 ^ 0x4B) + (0x86 ^ 0x91);
        Minecraft.llllIllIllIll[164] = 129 + 18 - 10 + 7;
        Minecraft.llllIllIllIll[165] = 87 + 35 - 67 + 90;
        Minecraft.llllIllIllIll[166] = (0x2C ^ 0x55) + (0x4 ^ 0x57) - (51 + 34 - 43 + 136) + (0xDB ^ 0xA3);
        Minecraft.llllIllIllIll[167] = (0x4 ^ 0x6B) + (0xDF ^ 0x9C) - (0x55 ^ 0x64) + (0x57 ^ 0x45);
        Minecraft.llllIllIllIll[168] = 109 + 50 - 70 + 55 + (0x55 ^ 0x6A) - (0xCA ^ 0xA1) + (0x3A ^ 0xA);
        Minecraft.llllIllIllIll[169] = (0x2D ^ 0x31) + (0xD7 ^ 0x84) - (0xC5 ^ 0xC3) + (0x8C ^ 0xA0);
        Minecraft.llllIllIllIll[170] = 49 + 84 - 92 + 109;
        Minecraft.llllIllIllIll[171] = 42 + 142 - 176 + 143;
        Minecraft.llllIllIllIll[172] = 9 + 1 + 42 + 100;
        Minecraft.llllIllIllIll[173] = 4 + 34 + 31 + 84;
        Minecraft.llllIllIllIll[174] = 83 + 113 - 58 + 16;
        Minecraft.llllIllIllIll[175] = 13 + 141 - 30 + 31;
        Minecraft.llllIllIllIll[176] = 79 + 137 - 164 + 104;
        Minecraft.llllIllIllIll[177] = 99 + 45 - 77 + 90;
        Minecraft.llllIllIllIll[178] = 116 + 126 - 115 + 31;
        Minecraft.llllIllIllIll[179] = 48 + 43 - 31 + 99;
        Minecraft.llllIllIllIll[180] = 108 + 152 - 169 + 69 + (0x56 ^ 0x18) - (0xD4 ^ 0x8E) + (0x26 ^ 0x2B);
        Minecraft.llllIllIllIll[181] = (0x37 ^ 0x3F) + (87 + 36 - 78 + 92) - (0x99 ^ 0x96) + (0x25 ^ 0x5);
        Minecraft.llllIllIllIll[182] = 104 + 42 - 33 + 50;
        Minecraft.llllIllIllIll[183] = (0xC7 ^ 0x99) + (0x21 ^ 0x7) - -" ".length() + (0x93 ^ 0x8C);
        Minecraft.llllIllIllIll[184] = 136 + 52 - 86 + 63;
        Minecraft.llllIllIllIll[185] = 153 + 25 - 117 + 105;
        Minecraft.llllIllIllIll[186] = 90 + 120 - 127 + 84;
        Minecraft.llllIllIllIll[187] = (0xBA ^ 0xB3) + (73 + 107 - 160 + 117) - (0x2B ^ 0x4B) + (0x7F ^ 0x9);
        Minecraft.llllIllIllIll[188] = 93 + 142 - 179 + 95 + (90 + 3 - 92 + 132) - (0xFFFFF9DA & 0x73F) + (16 + 112 - 108 + 147);
        Minecraft.llllIllIllIll[189] = (0x1E ^ 0x57) + (0xA0 ^ 0xAE) - (0x8D ^ 0x83) + (0x46 ^ 0x27);
        Minecraft.llllIllIllIll[190] = 136 + 120 - 194 + 88 + (19 + 114 - 42 + 77) - (94 + 162 - 111 + 97) + (0xD ^ 0x52);
        Minecraft.llllIllIllIll[191] = 54 + 153 - 46 + 11;
        Minecraft.llllIllIllIll[192] = (0xFFFFFF0A & 0x1FF7);
        Minecraft.llllIllIllIll[193] = (0x38 ^ 0x17) + (28 + 122 - 110 + 129) - (0x62 ^ 0x49) + ((0x66 ^ 0x6E) & ~(0x2B ^ 0x23));
        Minecraft.llllIllIllIll[194] = (0xFFFFDF89 & 0x3F76);
        Minecraft.llllIllIllIll[195] = 107 + 92 - 123 + 98;
        Minecraft.llllIllIllIll[196] = (0x19 ^ 0x34) + (0xE2 ^ 0x84) - (0x76 ^ 0x78) + (0x62 ^ 0x48);
        Minecraft.llllIllIllIll[197] = (0x7D ^ 0x54) + ((0x31 ^ 0x2F) & ~(0x65 ^ 0x7B)) - -(0x47 ^ 0x7B) + (0x4C ^ 0x7);
        Minecraft.llllIllIllIll[198] = (0x7C ^ 0x36) + (0x77 ^ 0x57) - (0x84 ^ 0xC6) + (30 + 81 - 91 + 117);
        Minecraft.llllIllIllIll[199] = (0xF4 ^ 0x92) + (0x20 ^ 0x6F) - (0x88 ^ 0xB5) + (0x53 ^ 0x69);
        Minecraft.llllIllIllIll[200] = (0x6F ^ 0x39) + (84 + 66 - 42 + 43) - (0x66 ^ 0x2F) + (0x6C ^ 0x63);
        Minecraft.llllIllIllIll[201] = 142 + 42 - 46 + 42;
        Minecraft.llllIllIllIll[202] = (0x33 ^ 0x4B) + (28 + 3 - 22 + 134) - (100 + 18 - 63 + 112) + (0x44 ^ 0x11);
        Minecraft.llllIllIllIll[203] = (0xDA ^ 0x88) + (60 + 126 - 166 + 136) - (2 + 22 + 85 + 65) + (0xE6 ^ 0x90);
        Minecraft.llllIllIllIll[204] = 72 + 18 - 67 + 160;
        Minecraft.llllIllIllIll[205] = 118 + 124 - 234 + 129 + (39 + 117 - 80 + 106) - (0xFFFFFDFB & 0x31F) + (101 + 38 + 2 + 7);
        Minecraft.llllIllIllIll[206] = 67 + 37 - 93 + 174;
        Minecraft.llllIllIllIll[207] = 148 + 97 - 85 + 26;
        Minecraft.llllIllIllIll[208] = (0x8F ^ 0xAF) + (0x97 ^ 0x82) - -(0x7D ^ 0x6A) + (0x63 ^ 0xC);
        Minecraft.llllIllIllIll[209] = 138 + 13 - 73 + 62 + (0xC9 ^ 0x9D) - (0x34 ^ 0x4F) + (0x17 ^ 0x40);
        Minecraft.llllIllIllIll[210] = 177 + 11 - 59 + 60;
        Minecraft.llllIllIllIll[211] = (0xCE ^ 0xA9) + (0x36 ^ 0x11) - (0x63 ^ 0x4C) + (0x29 ^ 0x76);
        Minecraft.llllIllIllIll[212] = (0xEA ^ 0x84) + (51 + 83 - 95 + 96) - (0xA6 ^ 0x9A) + (0x15 ^ 0x13);
        Minecraft.llllIllIllIll[213] = (0x4A ^ 0x62) + (67 + 113 - 47 + 20) - (0x61 ^ 0x74) + (0x1D ^ 0x9);
        Minecraft.llllIllIllIll[214] = 67 + 192 - 142 + 76;
        Minecraft.llllIllIllIll[215] = 26 + 114 - 33 + 87;
        Minecraft.llllIllIllIll[216] = (0x13 ^ 0x72) + (109 + 71 - 31 + 3) - (154 + 40 - 62 + 33) + (0x7C ^ 0x13);
        Minecraft.llllIllIllIll[217] = 82 + 151 - 181 + 144;
        Minecraft.llllIllIllIll[218] = 87 + 100 - 76 + 62 + (0xF9 ^ 0x8C) - (86 + 30 - 29 + 86) + (0x12 ^ 0x42);
        Minecraft.llllIllIllIll[219] = (0x4B ^ 0x7A) + (46 + 42 + 56 + 39) - (133 + 135 - 167 + 57) + (0x12 ^ 0x6E);
        Minecraft.llllIllIllIll[220] = 52 + 21 - 36 + 162;
        Minecraft.llllIllIllIll[221] = 162 + 66 - 159 + 132;
        Minecraft.llllIllIllIll[222] = 171 + 17 - 90 + 87 + (0x24 ^ 0x2D) - (0xF2 ^ 0x9C) + (0x7A ^ 0xC);
        Minecraft.llllIllIllIll[223] = 59 + 58 - 34 + 72 + (85 + 76 - 75 + 46) - (122 + 59 - 32 + 65) + (30 + 66 - 66 + 100);
        Minecraft.llllIllIllIll[224] = (0xFD ^ 0x88) + (0xBB ^ 0xA8) - (0x6A ^ 0x65) + (0x41 ^ 0x12);
        Minecraft.llllIllIllIll[225] = 9 + 145 - 28 + 27 + (0xAF ^ 0x9F) - (0xA8 ^ 0x9D) + (0xB9 ^ 0x80);
        Minecraft.llllIllIllIll[226] = (0xAF ^ 0xBD) + (41 + 61 - 101 + 175) - (0xB5 ^ 0xB3) + (0xBC ^ 0xAE);
        Minecraft.llllIllIllIll[227] = 165 + 100 - 187 + 129;
        Minecraft.llllIllIllIll[228] = 168 + 140 - 145 + 25 + (120 + 145 - 108 + 43) - (0xFFFFDBDD & 0x256A) + (76 + 26 + 37 + 9);
        Minecraft.llllIllIllIll[229] = 108 + 71 - 165 + 195;
        Minecraft.llllIllIllIll[230] = 39 + 106 - 44 + 109;
        Minecraft.llllIllIllIll[231] = 199 + 8 - 97 + 101;
        Minecraft.llllIllIllIll[232] = "   ".length() + (0xA4 ^ 0xA0) - -(0x10 ^ 0x59) + (1 + 65 + 15 + 51);
        Minecraft.llllIllIllIll[233] = 64 + 113 - 142 + 153 + (129 + 24 - 60 + 45) - (8 + 15 + 62 + 94) + (0xD ^ 0x4F);
        Minecraft.llllIllIllIll[234] = 17 + 165 - 112 + 144;
        Minecraft.llllIllIllIll[235] = (0xC0 ^ 0x97) + (0x99 ^ 0xC1) - (0xFD ^ 0xA8) + (0x24 ^ 0x59);
        Minecraft.llllIllIllIll[236] = 60 + 80 + 48 + 28;
        Minecraft.llllIllIllIll[237] = 98 + 95 - 177 + 201;
        Minecraft.llllIllIllIll[238] = (0x5F ^ 0x3E) + (17 + 34 + 40 + 89) - (124 + 51 - 146 + 129) + (0xC6 ^ 0xA5);
        Minecraft.llllIllIllIll[239] = (0xF2 ^ 0x9E) + (76 + 186 - 212 + 142) - (238 + 220 - 384 + 168) + (22 + 18 + 77 + 44);
        Minecraft.llllIllIllIll[240] = 46 + 178 - 103 + 82 + (0xEB ^ 0x85) - (0xFFFF85EF & 0x7B19) + (161 + 143 - 182 + 50);
        Minecraft.llllIllIllIll[241] = 76 + 0 + 26 + 119;
        Minecraft.llllIllIllIll[242] = 219 + 152 - 160 + 11;
        Minecraft.llllIllIllIll[243] = 113 + 83 - 53 + 80;
        Minecraft.llllIllIllIll[244] = 144 + 143 - 180 + 108 + (135 + 79 - 86 + 86) - (199 + 72 - 166 + 136) + (0x57 ^ 0x73);
        Minecraft.llllIllIllIll[245] = (0x1 ^ 0x6F) + (110 + 201 - 296 + 187) - (9 + 130 + 3 + 67) + (0x60 ^ 0x1A);
        Minecraft.llllIllIllIll[246] = 114 + 153 - 143 + 102;
        Minecraft.llllIllIllIll[247] = 212 + 189 - 344 + 170;
        Minecraft.llllIllIllIll[248] = 105 + 88 + 29 + 6;
        Minecraft.llllIllIllIll[249] = 151 + 4 - 135 + 183 + (0x47 ^ 0x20) - (36 + 153 - 166 + 199) + (103 + 32 - 12 + 22);
        Minecraft.llllIllIllIll[250] = 62 + 39 + 111 + 18;
        Minecraft.llllIllIllIll[251] = 2 + 201 - 52 + 80;
        Minecraft.llllIllIllIll[252] = 102 + 207 - 295 + 218;
        Minecraft.llllIllIllIll[253] = (0x71 ^ 0x27) + (0x3C ^ 0x7D) - -(0x70 ^ 0x57) + (0xEB ^ 0xC0);
        Minecraft.llllIllIllIll[254] = 71 + 228 - 92 + 27;
        Minecraft.llllIllIllIll[255] = 51 + 110 - 61 + 135;
        Minecraft.llllIllIllIll[256] = 47 + 35 - 65 + 120 + (0x7 ^ 0x7A) - (0xCB ^ 0xA4) + (0x5F ^ 0xA);
        Minecraft.llllIllIllIll[257] = (0xE8 ^ 0x80) + (194 + 46 - 184 + 140) - (189 + 162 - 303 + 150) + (68 + 53 - 29 + 43);
        Minecraft.llllIllIllIll[258] = 225 + 228 - 247 + 32;
        Minecraft.llllIllIllIll[259] = 14 + 130 - 107 + 202;
        Minecraft.llllIllIllIll[260] = (0x56 ^ 0x2B) + (69 + 148 - 212 + 170) - (179 + 94 - 248 + 170) + (111 + 104 - 206 + 126);
        Minecraft.llllIllIllIll[261] = 57 + 225 - 166 + 125;
        Minecraft.llllIllIllIll[262] = (0x17 ^ 0x40) + (92 + 24 - 99 + 190) - (126 + 124 - 164 + 43) + (0x23 ^ 0x6E);
        Minecraft.llllIllIllIll[263] = 14 + 212 - 223 + 240;
        Minecraft.llllIllIllIll[264] = 24 + 49 + 170 + 1;
        Minecraft.llllIllIllIll[265] = 231 + 226 - 393 + 181;
        Minecraft.llllIllIllIll[266] = 238 + 79 - 305 + 234;
        Minecraft.llllIllIllIll[267] = 105 + 12 + 15 + 71 + (38 + 54 + 25 + 90) - (24 + 116 + 22 + 8) + (0x78 ^ 0x7F);
        Minecraft.llllIllIllIll[268] = (0x9B ^ 0xB1) + (0xBA ^ 0x8D) - -(0xD7 ^ 0xB6) + (0x3B ^ 0xD);
        Minecraft.llllIllIllIll[269] = 56 + 139 - 36 + 90;
        Minecraft.llllIllIllIll[270] = "  ".length() + (0x30 ^ 0x18) - -(0x23 ^ 0x51) + (0xA ^ 0x54);
        Minecraft.llllIllIllIll[271] = 193 + 99 - 134 + 93;
        Minecraft.llllIllIllIll[272] = 209 + 210 - 392 + 225;
        Minecraft.llllIllIllIll[273] = 155 + 240 - 190 + 48;
        Minecraft.llllIllIllIll[274] = 41 + 23 + 145 + 45;
        Minecraft.llllIllIllIll[275] = (0xFFFFCFC9 & 0x3137);
        Minecraft.llllIllIllIll[276] = (-(0xFFFF9FDF & 0x7EE6) & (0xFFFFFFD7 & 0x1FEF));
        Minecraft.llllIllIllIll[277] = (-(0xFFFFBA5B & 0x7FBD) & (0xFFFFFB3B & 0x3FDF));
        Minecraft.llllIllIllIll[278] = (0xFFFFFD6E & 0x395);
        Minecraft.llllIllIllIll[279] = (-(0xFFFFB4F3 & 0x7BFD) & (0xFFFFF7F5 & 0x39FF));
        Minecraft.llllIllIllIll[280] = (-(0xFFFFF6F6 & 0x7F7B) & (-1 & 0x7777));
        Minecraft.llllIllIllIll[281] = (0xFFFF858F & 0x7B77);
        Minecraft.llllIllIllIll[282] = (0xFFFFB54B & 0x4BBC);
        Minecraft.llllIllIllIll[283] = (-(0xFFFFBC7F & 0x7BC3) & (0xFFFFBFDB & 0x796F));
        Minecraft.llllIllIllIll[284] = (0xFFFFE1FF & 0x1F0A);
        Minecraft.llllIllIllIll[285] = (0xFFFFC54F & 0x3BBB);
        Minecraft.llllIllIllIll[286] = (-(0xFFFF9D87 & 0x76FE) & (0xFFFFFFCF & 0x9FFF));
        Minecraft.llllIllIllIll[287] = (-(0xFFFFCFF5 & 0x7A9B) & (0xFFFFCF9E & 0x7BFD));
        Minecraft.llllIllIllIll[288] = (-(0xFFFFACAF & 0x57F7) & (0xFFFFBFFF & 0xCFEF));
        Minecraft.llllIllIllIll[289] = (-(0xD4 ^ 0xC7) & (0xFFFF853F & 0x7BDF));
        Minecraft.llllIllIllIll[290] = (0xFFFF9869 & 0xEFFF);
        Minecraft.llllIllIllIll[291] = (0xFFFFF34E & 0xDBF);
        Minecraft.llllIllIllIll[292] = (0xFFFFAF4C & 0xDBFF);
        Minecraft.llllIllIllIll[293] = (0xFFFFBB5F & 0x45AF);
        Minecraft.llllIllIllIll[294] = (-(0xFFFFEFDB & 0x37AE) & (-1 & 0xAFFB));
        Minecraft.llllIllIllIll[295] = (0xFFFFBB17 & 0x45F8);
        Minecraft.llllIllIllIll[296] = (-(0xFFFF97EF & 0x6E11) & (0xFFFFBEFF & 0xCFFF));
        Minecraft.llllIllIllIll[297] = (-(0xFFFFBFEB & 0x74FD) & (0xFFFFBDF9 & 0x77FF));
        Minecraft.llllIllIllIll[298] = (0xFFFFD181 & 0x6E7E);
        Minecraft.llllIllIllIll[299] = (0xFFFFEBE4 & 0x947F);
        Minecraft.llllIllIllIll[300] = (-(0xFFFFC79D & 0x7AF3) & (0xFFFFFBDA & 0x5FBD));
        Minecraft.llllIllIllIll[301] = (0xFFFFB449 & 0x5FB7);
        Minecraft.llllIllIllIll[302] = (0xFFFFD8F1 & 0x370E);
        Minecraft.llllIllIllIll[303] = (-(0xFFFFF3B7 & 0x2E6D) & (0xFFFFE3FE & 0x3F37));
        Minecraft.llllIllIllIll[304] = (-(0xFFFFFDB7 & 0x12ED) & (0xFFFFB3B7 & 0x5DFF));
        Minecraft.llllIllIllIll[305] = (0xFFFF99FD & 0x6716);
        Minecraft.llllIllIllIll[306] = (0xFFFFFB1F & 0x5F5);
        Minecraft.llllIllIllIll[307] = (0xFFFF835F & 0x7DB6);
        Minecraft.llllIllIllIll[308] = (0xFFFFCB77 & 0x359F);
        Minecraft.llllIllIllIll[309] = (0xFFFF835D & 0x7DBA);
        Minecraft.llllIllIllIll[310] = (0xFFFFF75D & 0x9BB);
    }
    
    private static boolean lIlIlIlllIIlIlI(final Object lllllllllllllIlIllIIlIlIIIlIlIlI, final Object lllllllllllllIlIllIIlIlIIIlIlIIl) {
        return lllllllllllllIlIllIIlIlIIIlIlIlI == lllllllllllllIlIllIIlIlIIIlIlIIl;
    }
    
    public void toggleFullscreen() {
        try {
            int fullscreen;
            if (lIlIlIlllIIlllI(this.fullscreen ? 1 : 0)) {
                fullscreen = Minecraft.llllIllIllIll[0];
                "".length();
                if (((91 + 50 - 73 + 66 ^ 122 + 61 - 67 + 24) & (79 + 25 + 35 + 42 ^ 61 + 150 - 135 + 115 ^ -" ".length())) < 0) {
                    return;
                }
            }
            else {
                fullscreen = Minecraft.llllIllIllIll[1];
            }
            this.fullscreen = (fullscreen != 0);
            this.gameSettings.fullScreen = this.fullscreen;
            if (lIlIlIlllIIlllI(this.fullscreen ? 1 : 0)) {
                this.updateDisplayMode();
                this.displayWidth = Display.getDisplayMode().getWidth();
                this.displayHeight = Display.getDisplayMode().getHeight();
                if (lIlIlIlllIlIlII(this.displayWidth)) {
                    this.displayWidth = Minecraft.llllIllIllIll[1];
                }
                if (lIlIlIlllIlIlII(this.displayHeight)) {
                    this.displayHeight = Minecraft.llllIllIllIll[1];
                    "".length();
                    if (" ".length() < ((0x99 ^ 0x84) & ~(0xD ^ 0x10))) {
                        return;
                    }
                }
            }
            else {
                Display.setDisplayMode(new DisplayMode(this.tempDisplayWidth, this.tempDisplayHeight));
                this.displayWidth = this.tempDisplayWidth;
                this.displayHeight = this.tempDisplayHeight;
                if (lIlIlIlllIlIlII(this.displayWidth)) {
                    this.displayWidth = Minecraft.llllIllIllIll[1];
                }
                if (lIlIlIlllIlIlII(this.displayHeight)) {
                    this.displayHeight = Minecraft.llllIllIllIll[1];
                }
            }
            if (lIlIlIlllIIllIl(this.currentScreen)) {
                this.resize(this.displayWidth, this.displayHeight);
                "".length();
                if ((0x54 ^ 0x50) <= 0) {
                    return;
                }
            }
            else {
                this.updateFramebufferSize();
            }
            Display.setFullscreen(this.fullscreen);
            Display.setVSyncEnabled(this.gameSettings.enableVsync);
            this.updateDisplay();
            "".length();
            if ("   ".length() <= ((0x40 ^ 0x69) & ~(0xD ^ 0x24))) {
                return;
            }
        }
        catch (Exception lllllllllllllIlIllIIlIllllllIllI) {
            Minecraft.logger.error(Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[122]], (Throwable)lllllllllllllIlIllIIlIllllllIllI);
        }
    }
    
    public NetHandlerPlayClient getNetHandler() {
        NetHandlerPlayClient sendQueue;
        if (lIlIlIlllIIllIl(this.thePlayer)) {
            sendQueue = this.thePlayer.sendQueue;
            "".length();
            if (null != null) {
                return null;
            }
        }
        else {
            sendQueue = null;
        }
        return sendQueue;
    }
    
    private static boolean lIlIlIlllIlIIII(final Object lllllllllllllIlIllIIlIlIIIlIlllI, final Object lllllllllllllIlIllIIlIlIIIlIllIl) {
        return lllllllllllllIlIllIIlIlIIIlIlllI != lllllllllllllIlIllIIlIlIIIlIllIl;
    }
    
    private static boolean isJvm64bit() {
        final String[] array = new String[Minecraft.llllIllIllIll[8]];
        array[Minecraft.llllIllIllIll[0]] = Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[46]];
        array[Minecraft.llllIllIllIll[1]] = Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[47]];
        array[Minecraft.llllIllIllIll[3]] = Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[48]];
        final String[] lllllllllllllIlIllIIllIlIlllIIII = array;
        final String lllllllllllllIlIllIIllIlIllIlIIl;
        final byte lllllllllllllIlIllIIllIlIllIlIlI = (byte)((String[])(Object)(lllllllllllllIlIllIIllIlIllIlIIl = (String)(Object)lllllllllllllIlIllIIllIlIlllIIII)).length;
        String lllllllllllllIlIllIIllIlIllIlIll = (String)Minecraft.llllIllIllIll[0];
        "".length();
        if (null != null) {
            return ((0x9 ^ 0x40) & ~(0x4A ^ 0x3)) != 0x0;
        }
        while (!lIlIlIlllIlIIIl((int)lllllllllllllIlIllIIllIlIllIlIll, lllllllllllllIlIllIIllIlIllIlIlI)) {
            final String lllllllllllllIlIllIIllIlIllIllll = lllllllllllllIlIllIIllIlIllIlIIl[lllllllllllllIlIllIIllIlIllIlIll];
            final String lllllllllllllIlIllIIllIlIllIlllI = System.getProperty(lllllllllllllIlIllIIllIlIllIllll);
            if (lIlIlIlllIIllIl(lllllllllllllIlIllIIllIlIllIlllI) && lIlIlIlllIIlllI(lllllllllllllIlIllIIllIlIllIlllI.contains(Minecraft.llllIlIlllIIl[Minecraft.llllIllIllIll[49]]) ? 1 : 0)) {
                return Minecraft.llllIllIllIll[1] != 0;
            }
            ++lllllllllllllIlIllIIllIlIllIlIll;
        }
        return Minecraft.llllIllIllIll[0] != 0;
    }
    
    public boolean isGamePaused() {
        return this.isGamePaused;
    }
    
    public boolean isFullScreen() {
        return this.fullscreen;
    }
}
