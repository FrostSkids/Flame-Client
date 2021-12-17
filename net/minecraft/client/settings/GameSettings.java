// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.client.settings;

import java.util.Iterator;
import net.minecraft.util.MathHelper;
import java.util.Arrays;
import org.apache.logging.log4j.LogManager;
import org.lwjgl.input.Mouse;
import net.minecraft.client.gui.FontRenderer;
import org.lwjgl.opengl.Display;
import java.lang.reflect.Type;
import java.io.Reader;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.Writer;
import java.io.PrintWriter;
import java.io.FileWriter;
import java.util.Collection;
import com.google.common.collect.ImmutableSet;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import net.minecraft.client.stream.TwitchStream;
import net.minecraft.client.gui.GuiNewChat;
import net.minecraft.client.renderer.texture.TextureMap;
import net.minecraft.network.Packet;
import net.minecraft.network.play.client.C15PacketClientSettings;
import org.apache.commons.lang3.ArrayUtils;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import com.google.common.collect.Lists;
import org.lwjgl.input.Keyboard;
import net.minecraft.client.resources.I18n;
import net.minecraft.client.audio.SoundCategory;
import java.util.Map;
import java.lang.reflect.ParameterizedType;
import net.minecraft.entity.player.EnumPlayerModelParts;
import java.util.Set;
import java.io.File;
import net.minecraft.world.EnumDifficulty;
import java.util.List;
import net.minecraft.entity.player.EntityPlayer;
import com.google.gson.Gson;
import net.minecraft.client.Minecraft;
import org.apache.logging.log4j.Logger;

public class GameSettings
{
    public /* synthetic */ int streamCompression;
    public /* synthetic */ KeyBinding keyBindPickBlock;
    public /* synthetic */ boolean fboEnable;
    public /* synthetic */ boolean pauseOnLostFocus;
    private static final /* synthetic */ Logger logger;
    public /* synthetic */ KeyBinding keyBindLeft;
    public /* synthetic */ float streamFps;
    protected /* synthetic */ Minecraft mc;
    private static final /* synthetic */ Gson gson;
    public /* synthetic */ EntityPlayer.EnumChatVisibility chatVisibility;
    public /* synthetic */ KeyBinding keyBindBack;
    public /* synthetic */ boolean forceUnicodeFont;
    public /* synthetic */ int streamMicToggleBehavior;
    public /* synthetic */ KeyBinding keyBindFullscreen;
    public /* synthetic */ List<String> resourcePacks;
    public /* synthetic */ KeyBinding HUD_CONFIG;
    public /* synthetic */ KeyBinding keyBindPlayerList;
    public /* synthetic */ boolean anaglyph;
    private static volatile /* synthetic */ int[] $SWITCH_TABLE$net$minecraft$client$settings$GameSettings$Options;
    public /* synthetic */ int renderDistanceChunks;
    public /* synthetic */ boolean streamSendMetadata;
    public /* synthetic */ KeyBinding CLICK_GUI;
    public /* synthetic */ boolean reducedDebugInfo;
    public /* synthetic */ int overrideHeight;
    public /* synthetic */ boolean chatColours;
    public /* synthetic */ boolean field_181150_U;
    public /* synthetic */ KeyBinding keyBindDrop;
    public /* synthetic */ float streamGameVolume;
    public /* synthetic */ KeyBinding keyBindStreamStartStop;
    public /* synthetic */ KeyBinding CLIENT_PERSPECTIVE;
    private static final /* synthetic */ String[] STREAM_CHAT_FILTER_MODES;
    public /* synthetic */ KeyBinding keyBindStreamCommercials;
    public /* synthetic */ KeyBinding keyBindStreamToggleMic;
    public /* synthetic */ String streamPreferredServer;
    public /* synthetic */ boolean showInventoryAchievementHint;
    public /* synthetic */ KeyBinding keyBindChat;
    public /* synthetic */ KeyBinding[] keyBindings;
    public /* synthetic */ String lastServer;
    public /* synthetic */ KeyBinding keyBindTogglePerspective;
    public /* synthetic */ float chatHeightFocused;
    public /* synthetic */ float chatWidth;
    public /* synthetic */ boolean hideServerAddress;
    public /* synthetic */ EnumDifficulty difficulty;
    private /* synthetic */ File optionsFile;
    private static final /* synthetic */ String[] GUISCALES;
    public /* synthetic */ boolean useVbo;
    private static final /* synthetic */ String[] STREAM_COMPRESSIONS;
    public /* synthetic */ float streamMicVolume;
    private static final /* synthetic */ int[] llIlIIIIIIIllI;
    private static final /* synthetic */ String[] field_181149_aW;
    public /* synthetic */ KeyBinding keyBindAttack;
    public /* synthetic */ boolean touchscreen;
    public /* synthetic */ String language;
    public /* synthetic */ KeyBinding ZOOM;
    public /* synthetic */ float streamBytesPerPixel;
    public /* synthetic */ KeyBinding keyBindJump;
    public /* synthetic */ KeyBinding keyBindStreamPauseUnpause;
    public /* synthetic */ int limitFramerate;
    public /* synthetic */ int ambientOcclusion;
    public /* synthetic */ int mipmapLevels;
    public /* synthetic */ KeyBinding keyBindRight;
    public /* synthetic */ KeyBinding keyBindScreenshot;
    public /* synthetic */ int streamChatUserFilter;
    public /* synthetic */ KeyBinding keyBindCommand;
    public /* synthetic */ boolean allowBlockAlternatives;
    public /* synthetic */ boolean field_181151_V;
    public /* synthetic */ boolean heldItemTooltips;
    public /* synthetic */ int guiScale;
    public /* synthetic */ int streamChatEnabled;
    public /* synthetic */ KeyBinding[] keyBindsHotbar;
    public /* synthetic */ boolean fullScreen;
    public /* synthetic */ List<String> field_183018_l;
    public /* synthetic */ boolean enableVsync;
    public /* synthetic */ KeyBinding keyBindSpectatorOutlines;
    public /* synthetic */ KeyBinding keyBindSprint;
    public /* synthetic */ int overrideWidth;
    public /* synthetic */ KeyBinding keyBindInventory;
    public /* synthetic */ float chatOpacity;
    public /* synthetic */ float streamKbps;
    public /* synthetic */ boolean advancedItemTooltips;
    public /* synthetic */ boolean fancyGraphics;
    private final /* synthetic */ Set<EnumPlayerModelParts> setModelParts;
    public /* synthetic */ boolean snooperEnabled;
    public /* synthetic */ int particleSetting;
    public /* synthetic */ float saturation;
    private static final /* synthetic */ String[] STREAM_MIC_MODES;
    public /* synthetic */ KeyBinding keyBindForward;
    public /* synthetic */ boolean chatLinksPrompt;
    private static final /* synthetic */ ParameterizedType typeListString;
    public /* synthetic */ KeyBinding keyBindSneak;
    public /* synthetic */ boolean chatLinks;
    public /* synthetic */ float chatHeightUnfocused;
    public /* synthetic */ float gammaSetting;
    public /* synthetic */ float chatScale;
    private static final /* synthetic */ String[] STREAM_CHAT_MODES;
    public /* synthetic */ int clouds;
    public /* synthetic */ float fovSetting;
    public /* synthetic */ boolean viewBobbing;
    public /* synthetic */ float mouseSensitivity;
    public /* synthetic */ KeyBinding keyBindUseItem;
    public /* synthetic */ boolean invertMouse;
    private static final /* synthetic */ String[] llIIlIllIIIIII;
    private static final /* synthetic */ String[] PARTICLES;
    private /* synthetic */ Map<SoundCategory, Float> mapSoundLevels;
    private static final /* synthetic */ String[] AMBIENT_OCCLUSIONS;
    public /* synthetic */ KeyBinding keyBindSmoothCamera;
    
    public float getSoundLevel(final SoundCategory llllllllllllIllIllIllllIlIIIlIIl) {
        float floatValue;
        if (lIIlIIIlIIIIIlII(this.mapSoundLevels.containsKey(llllllllllllIllIllIllllIlIIIlIIl) ? 1 : 0)) {
            floatValue = this.mapSoundLevels.get(llllllllllllIllIllIllllIlIIIlIIl);
            "".length();
            if (null != null) {
                return 0.0f;
            }
        }
        else {
            floatValue = 1.0f;
        }
        return floatValue;
    }
    
    public static String getKeyDisplayString(final int llllllllllllIllIllIlllllIIIIIIll) {
        String s;
        if (lIIlIIIlIIIIIllI(llllllllllllIllIllIlllllIIIIIIll)) {
            final String llllllllllllIlIllIlIIIIIllllIIll = GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[183]];
            final Object[] llllllllllllIlIllIlIIIIIllllIIII = new Object[GameSettings.llIlIIIIIIIllI[2]];
            llllllllllllIlIllIlIIIIIllllIIII[GameSettings.llIlIIIIIIIllI[1]] = llllllllllllIllIllIlllllIIIIIIll + GameSettings.llIlIIIIIIIllI[106];
            s = I18n.format(llllllllllllIlIllIlIIIIIllllIIll, llllllllllllIlIllIlIIIIIllllIIII);
            "".length();
            if (-" ".length() != -" ".length()) {
                return null;
            }
        }
        else if (lIIlIIIlIIIIIlll(llllllllllllIllIllIlllllIIIIIIll, GameSettings.llIlIIIIIIIllI[184])) {
            s = Keyboard.getKeyName(llllllllllllIllIllIlllllIIIIIIll);
            "".length();
            if (" ".length() > "   ".length()) {
                return null;
            }
        }
        else {
            final String format = GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[185]];
            final Object[] args = new Object[GameSettings.llIlIIIIIIIllI[2]];
            args[GameSettings.llIlIIIIIIIllI[1]] = (char)(llllllllllllIllIllIlllllIIIIIIll - GameSettings.llIlIIIIIIIllI[184]);
            s = String.format(format, args).toUpperCase();
        }
        return s;
    }
    
    public GameSettings(final Minecraft llllllllllllIllIllIlllllIIIIllII, final File llllllllllllIllIllIlllllIIIIlIll) {
        this.mouseSensitivity = 0.5f;
        this.renderDistanceChunks = GameSettings.llIlIIIIIIIllI[24];
        this.viewBobbing = (GameSettings.llIlIIIIIIIllI[2] != 0);
        this.fboEnable = (GameSettings.llIlIIIIIIIllI[2] != 0);
        this.limitFramerate = GameSettings.llIlIIIIIIIllI[25];
        this.clouds = GameSettings.llIlIIIIIIIllI[3];
        this.fancyGraphics = (GameSettings.llIlIIIIIIIllI[2] != 0);
        this.ambientOcclusion = GameSettings.llIlIIIIIIIllI[3];
        this.resourcePacks = (List<String>)Lists.newArrayList();
        this.field_183018_l = (List<String>)Lists.newArrayList();
        this.chatVisibility = EntityPlayer.EnumChatVisibility.FULL;
        this.chatColours = (GameSettings.llIlIIIIIIIllI[2] != 0);
        this.chatLinks = (GameSettings.llIlIIIIIIIllI[2] != 0);
        this.chatLinksPrompt = (GameSettings.llIlIIIIIIIllI[2] != 0);
        this.chatOpacity = 1.0f;
        this.snooperEnabled = (GameSettings.llIlIIIIIIIllI[2] != 0);
        this.enableVsync = (GameSettings.llIlIIIIIIIllI[2] != 0);
        this.useVbo = (GameSettings.llIlIIIIIIIllI[1] != 0);
        this.allowBlockAlternatives = (GameSettings.llIlIIIIIIIllI[2] != 0);
        this.reducedDebugInfo = (GameSettings.llIlIIIIIIIllI[1] != 0);
        this.pauseOnLostFocus = (GameSettings.llIlIIIIIIIllI[2] != 0);
        this.setModelParts = (Set<EnumPlayerModelParts>)Sets.newHashSet((Object[])EnumPlayerModelParts.values());
        this.heldItemTooltips = (GameSettings.llIlIIIIIIIllI[2] != 0);
        this.chatScale = 1.0f;
        this.chatWidth = 1.0f;
        this.chatHeightUnfocused = 0.44366196f;
        this.chatHeightFocused = 1.0f;
        this.showInventoryAchievementHint = (GameSettings.llIlIIIIIIIllI[2] != 0);
        this.mipmapLevels = GameSettings.llIlIIIIIIIllI[0];
        this.mapSoundLevels = (Map<SoundCategory, Float>)Maps.newEnumMap((Class)SoundCategory.class);
        this.streamBytesPerPixel = 0.5f;
        this.streamMicVolume = 1.0f;
        this.streamGameVolume = 1.0f;
        this.streamKbps = 0.5412844f;
        this.streamFps = 0.31690142f;
        this.streamCompression = GameSettings.llIlIIIIIIIllI[2];
        this.streamSendMetadata = (GameSettings.llIlIIIIIIIllI[2] != 0);
        this.streamPreferredServer = GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[26]];
        this.streamChatEnabled = GameSettings.llIlIIIIIIIllI[1];
        this.streamChatUserFilter = GameSettings.llIlIIIIIIIllI[1];
        this.streamMicToggleBehavior = GameSettings.llIlIIIIIIIllI[1];
        this.field_181150_U = (GameSettings.llIlIIIIIIIllI[2] != 0);
        this.field_181151_V = (GameSettings.llIlIIIIIIIllI[2] != 0);
        this.keyBindForward = new KeyBinding(GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[27]], GameSettings.llIlIIIIIIIllI[17], GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[28]]);
        this.keyBindLeft = new KeyBinding(GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[29]], GameSettings.llIlIIIIIIIllI[30], GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[31]]);
        this.keyBindBack = new KeyBinding(GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[32]], GameSettings.llIlIIIIIIIllI[33], GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[30]]);
        this.keyBindRight = new KeyBinding(GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[33]], GameSettings.llIlIIIIIIIllI[34], GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[34]]);
        this.keyBindJump = new KeyBinding(GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[35]], GameSettings.llIlIIIIIIIllI[36], GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[37]]);
        this.keyBindSneak = new KeyBinding(GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[38]], GameSettings.llIlIIIIIIIllI[39], GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[40]]);
        this.keyBindSprint = new KeyBinding(GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[41]], GameSettings.llIlIIIIIIIllI[32], GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[42]]);
        this.keyBindInventory = new KeyBinding(GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[43]], GameSettings.llIlIIIIIIIllI[18], GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[44]]);
        this.keyBindUseItem = new KeyBinding(GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[45]], GameSettings.llIlIIIIIIIllI[46], GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[39]]);
        this.keyBindDrop = new KeyBinding(GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[47]], GameSettings.llIlIIIIIIIllI[16], GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[48]]);
        this.keyBindAttack = new KeyBinding(GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[49]], GameSettings.llIlIIIIIIIllI[50], GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[51]]);
        this.keyBindPickBlock = new KeyBinding(GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[52]], GameSettings.llIlIIIIIIIllI[53], GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[54]]);
        this.keyBindChat = new KeyBinding(GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[55]], GameSettings.llIlIIIIIIIllI[20], GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[56]]);
        this.keyBindPlayerList = new KeyBinding(GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[57]], GameSettings.llIlIIIIIIIllI[15], GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[58]]);
        this.keyBindCommand = new KeyBinding(GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[59]], GameSettings.llIlIIIIIIIllI[59], GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[60]]);
        this.keyBindScreenshot = new KeyBinding(GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[61]], GameSettings.llIlIIIIIIIllI[62], GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[63]]);
        this.keyBindTogglePerspective = new KeyBinding(GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[36]], GameSettings.llIlIIIIIIIllI[64], GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[65]]);
        this.keyBindSmoothCamera = new KeyBinding(GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[66]], GameSettings.llIlIIIIIIIllI[1], GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[62]]);
        this.keyBindFullscreen = new KeyBinding(GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[67]], GameSettings.llIlIIIIIIIllI[68], GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[69]]);
        this.keyBindSpectatorOutlines = new KeyBinding(GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[64]], GameSettings.llIlIIIIIIIllI[1], GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[70]]);
        this.keyBindStreamStartStop = new KeyBinding(GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[71]], GameSettings.llIlIIIIIIIllI[70], GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[72]]);
        this.keyBindStreamPauseUnpause = new KeyBinding(GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[73]], GameSettings.llIlIIIIIIIllI[71], GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[74]]);
        this.keyBindStreamCommercials = new KeyBinding(GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[75]], GameSettings.llIlIIIIIIIllI[1], GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[76]]);
        this.keyBindStreamToggleMic = new KeyBinding(GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[77]], GameSettings.llIlIIIIIIIllI[1], GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[78]]);
        final KeyBinding[] keyBindsHotbar = new KeyBinding[GameSettings.llIlIIIIIIIllI[9]];
        keyBindsHotbar[GameSettings.llIlIIIIIIIllI[1]] = new KeyBinding(GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[79]], GameSettings.llIlIIIIIIIllI[3], GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[80]]);
        keyBindsHotbar[GameSettings.llIlIIIIIIIllI[2]] = new KeyBinding(GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[81]], GameSettings.llIlIIIIIIIllI[4], GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[82]]);
        keyBindsHotbar[GameSettings.llIlIIIIIIIllI[3]] = new KeyBinding(GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[83]], GameSettings.llIlIIIIIIIllI[0], GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[84]]);
        keyBindsHotbar[GameSettings.llIlIIIIIIIllI[4]] = new KeyBinding(GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[85]], GameSettings.llIlIIIIIIIllI[5], GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[86]]);
        keyBindsHotbar[GameSettings.llIlIIIIIIIllI[0]] = new KeyBinding(GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[87]], GameSettings.llIlIIIIIIIllI[6], GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[88]]);
        keyBindsHotbar[GameSettings.llIlIIIIIIIllI[5]] = new KeyBinding(GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[89]], GameSettings.llIlIIIIIIIllI[7], GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[90]]);
        keyBindsHotbar[GameSettings.llIlIIIIIIIllI[6]] = new KeyBinding(GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[91]], GameSettings.llIlIIIIIIIllI[8], GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[92]]);
        keyBindsHotbar[GameSettings.llIlIIIIIIIllI[7]] = new KeyBinding(GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[68]], GameSettings.llIlIIIIIIIllI[9], GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[93]]);
        keyBindsHotbar[GameSettings.llIlIIIIIIIllI[8]] = new KeyBinding(GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[94]], GameSettings.llIlIIIIIIIllI[10], GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[95]]);
        this.keyBindsHotbar = keyBindsHotbar;
        this.HUD_CONFIG = new KeyBinding(GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[96]], GameSettings.llIlIIIIIIIllI[21], GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[97]]);
        this.CLICK_GUI = new KeyBinding(GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[98]], GameSettings.llIlIIIIIIIllI[60], GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[99]]);
        this.CLIENT_PERSPECTIVE = new KeyBinding(GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[100]], GameSettings.llIlIIIIIIIllI[48], GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[101]]);
        this.ZOOM = new KeyBinding(GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[102]], GameSettings.llIlIIIIIIIllI[51], GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[103]]);
        final KeyBinding[] array = new KeyBinding[GameSettings.llIlIIIIIIIllI[26]];
        array[GameSettings.llIlIIIIIIIllI[1]] = this.keyBindAttack;
        array[GameSettings.llIlIIIIIIIllI[2]] = this.keyBindUseItem;
        array[GameSettings.llIlIIIIIIIllI[3]] = this.keyBindForward;
        array[GameSettings.llIlIIIIIIIllI[4]] = this.keyBindLeft;
        array[GameSettings.llIlIIIIIIIllI[0]] = this.keyBindBack;
        array[GameSettings.llIlIIIIIIIllI[5]] = this.keyBindRight;
        array[GameSettings.llIlIIIIIIIllI[6]] = this.keyBindJump;
        array[GameSettings.llIlIIIIIIIllI[7]] = this.keyBindSneak;
        array[GameSettings.llIlIIIIIIIllI[8]] = this.keyBindSprint;
        array[GameSettings.llIlIIIIIIIllI[9]] = this.keyBindDrop;
        array[GameSettings.llIlIIIIIIIllI[10]] = this.keyBindInventory;
        array[GameSettings.llIlIIIIIIIllI[11]] = this.keyBindChat;
        array[GameSettings.llIlIIIIIIIllI[12]] = this.keyBindPlayerList;
        array[GameSettings.llIlIIIIIIIllI[13]] = this.keyBindPickBlock;
        array[GameSettings.llIlIIIIIIIllI[14]] = this.keyBindCommand;
        array[GameSettings.llIlIIIIIIIllI[15]] = this.keyBindScreenshot;
        array[GameSettings.llIlIIIIIIIllI[16]] = this.keyBindTogglePerspective;
        array[GameSettings.llIlIIIIIIIllI[17]] = this.keyBindSmoothCamera;
        array[GameSettings.llIlIIIIIIIllI[18]] = this.keyBindStreamStartStop;
        array[GameSettings.llIlIIIIIIIllI[19]] = this.keyBindStreamPauseUnpause;
        array[GameSettings.llIlIIIIIIIllI[20]] = this.keyBindStreamCommercials;
        array[GameSettings.llIlIIIIIIIllI[21]] = this.keyBindStreamToggleMic;
        array[GameSettings.llIlIIIIIIIllI[22]] = this.keyBindFullscreen;
        array[GameSettings.llIlIIIIIIIllI[23]] = this.keyBindSpectatorOutlines;
        this.keyBindings = (KeyBinding[])ArrayUtils.addAll((Object[])array, (Object[])this.keyBindsHotbar);
        this.difficulty = EnumDifficulty.NORMAL;
        this.lastServer = GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[104]];
        this.fovSetting = 70.0f;
        this.language = GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[105]];
        this.forceUnicodeFont = (GameSettings.llIlIIIIIIIllI[1] != 0);
        this.mc = llllllllllllIllIllIlllllIIIIllII;
        this.optionsFile = new File(llllllllllllIllIllIlllllIIIIlIll, GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[106]]);
        if (lIIlIIIlIIIIIlII(llllllllllllIllIllIlllllIIIIllII.isJava64bit() ? 1 : 0) && lIIlIIIlIIIIIlIl(lIIlIIIlIIIIIIll(Runtime.getRuntime().maxMemory(), 1000000000L))) {
            Options.RENDER_DISTANCE.setValueMax(32.0f);
            "".length();
            if (((0xD4 ^ 0xC2) & ~(0x1E ^ 0x8)) != 0x0) {
                throw null;
            }
        }
        else {
            Options.RENDER_DISTANCE.setValueMax(16.0f);
        }
        int renderDistanceChunks;
        if (lIIlIIIlIIIIIlII(llllllllllllIllIllIlllllIIIIllII.isJava64bit() ? 1 : 0)) {
            renderDistanceChunks = GameSettings.llIlIIIIIIIllI[12];
            "".length();
            if ("   ".length() == 0) {
                throw null;
            }
        }
        else {
            renderDistanceChunks = GameSettings.llIlIIIIIIIllI[8];
        }
        this.renderDistanceChunks = renderDistanceChunks;
        this.addClientKeybinds();
        this.loadOptions();
    }
    
    private static boolean lIIlIIIlIIIIllIl(final int llllllllllllIllIllIlllIlllllIIlI, final int llllllllllllIllIllIlllIlllllIIIl) {
        return llllllllllllIllIllIlllIlllllIIlI >= llllllllllllIllIllIlllIlllllIIIl;
    }
    
    private static boolean lIIlIIIlIIIIlIII(final int llllllllllllIllIllIlllIllllIIIIl) {
        return llllllllllllIllIllIlllIllllIIIIl == 0;
    }
    
    public float getOptionFloatValue(final Options llllllllllllIllIllIllllIllIlllIl) {
        float n;
        if (lIIlIIIlIIIIlIlI(llllllllllllIllIllIllllIllIlllIl, Options.FOV)) {
            n = this.fovSetting;
            "".length();
            if (-(0x3A ^ 0x5D ^ (0x6 ^ 0x64)) >= 0) {
                return 0.0f;
            }
        }
        else if (lIIlIIIlIIIIlIlI(llllllllllllIllIllIllllIllIlllIl, Options.GAMMA)) {
            n = this.gammaSetting;
            "".length();
            if (-"   ".length() >= 0) {
                return 0.0f;
            }
        }
        else if (lIIlIIIlIIIIlIlI(llllllllllllIllIllIllllIllIlllIl, Options.SATURATION)) {
            n = this.saturation;
            "".length();
            if (((0x35 ^ 0x1F) & ~(0xA ^ 0x20)) != 0x0) {
                return 0.0f;
            }
        }
        else if (lIIlIIIlIIIIlIlI(llllllllllllIllIllIllllIllIlllIl, Options.SENSITIVITY)) {
            n = this.mouseSensitivity;
            "".length();
            if (" ".length() == ((0x56 ^ 0x4C ^ (0x56 ^ 0x6B)) & (0x87 ^ 0xBF ^ (0x9E ^ 0x81) ^ -" ".length()))) {
                return 0.0f;
            }
        }
        else if (lIIlIIIlIIIIlIlI(llllllllllllIllIllIllllIllIlllIl, Options.CHAT_OPACITY)) {
            n = this.chatOpacity;
            "".length();
            if (-" ".length() > "  ".length()) {
                return 0.0f;
            }
        }
        else if (lIIlIIIlIIIIlIlI(llllllllllllIllIllIllllIllIlllIl, Options.CHAT_HEIGHT_FOCUSED)) {
            n = this.chatHeightFocused;
            "".length();
            if (-"   ".length() >= 0) {
                return 0.0f;
            }
        }
        else if (lIIlIIIlIIIIlIlI(llllllllllllIllIllIllllIllIlllIl, Options.CHAT_HEIGHT_UNFOCUSED)) {
            n = this.chatHeightUnfocused;
            "".length();
            if (" ".length() > "  ".length()) {
                return 0.0f;
            }
        }
        else if (lIIlIIIlIIIIlIlI(llllllllllllIllIllIllllIllIlllIl, Options.CHAT_SCALE)) {
            n = this.chatScale;
            "".length();
            if ("   ".length() > "   ".length()) {
                return 0.0f;
            }
        }
        else if (lIIlIIIlIIIIlIlI(llllllllllllIllIllIllllIllIlllIl, Options.CHAT_WIDTH)) {
            n = this.chatWidth;
            "".length();
            if ((0x30 ^ 0x34) <= 0) {
                return 0.0f;
            }
        }
        else if (lIIlIIIlIIIIlIlI(llllllllllllIllIllIllllIllIlllIl, Options.FRAMERATE_LIMIT)) {
            n = (float)this.limitFramerate;
            "".length();
            if (((0x42 ^ 0x51) & ~(0x3C ^ 0x2F)) != 0x0) {
                return 0.0f;
            }
        }
        else if (lIIlIIIlIIIIlIlI(llllllllllllIllIllIllllIllIlllIl, Options.MIPMAP_LEVELS)) {
            n = (float)this.mipmapLevels;
            "".length();
            if (-" ".length() > 0) {
                return 0.0f;
            }
        }
        else if (lIIlIIIlIIIIlIlI(llllllllllllIllIllIllllIllIlllIl, Options.RENDER_DISTANCE)) {
            n = (float)this.renderDistanceChunks;
            "".length();
            if (" ".length() <= 0) {
                return 0.0f;
            }
        }
        else if (lIIlIIIlIIIIlIlI(llllllllllllIllIllIllllIllIlllIl, Options.STREAM_BYTES_PER_PIXEL)) {
            n = this.streamBytesPerPixel;
            "".length();
            if (((79 + 54 - 111 + 122 ^ 85 + 19 - 69 + 108) & (0x12 ^ 0x3A ^ (0x3B ^ 0xC) ^ -" ".length())) > " ".length()) {
                return 0.0f;
            }
        }
        else if (lIIlIIIlIIIIlIlI(llllllllllllIllIllIllllIllIlllIl, Options.STREAM_VOLUME_MIC)) {
            n = this.streamMicVolume;
            "".length();
            if (((0x4A ^ 0x52) & ~(0xBD ^ 0xA5)) < 0) {
                return 0.0f;
            }
        }
        else if (lIIlIIIlIIIIlIlI(llllllllllllIllIllIllllIllIlllIl, Options.STREAM_VOLUME_SYSTEM)) {
            n = this.streamGameVolume;
            "".length();
            if ("  ".length() != "  ".length()) {
                return 0.0f;
            }
        }
        else if (lIIlIIIlIIIIlIlI(llllllllllllIllIllIllllIllIlllIl, Options.STREAM_KBPS)) {
            n = this.streamKbps;
            "".length();
            if (null != null) {
                return 0.0f;
            }
        }
        else if (lIIlIIIlIIIIlIlI(llllllllllllIllIllIllllIllIlllIl, Options.STREAM_FPS)) {
            n = this.streamFps;
            "".length();
            if ((0x2 ^ 0x6) <= -" ".length()) {
                return 0.0f;
            }
        }
        else {
            n = 0.0f;
        }
        return n;
    }
    
    private static int lIIlIIIlIIIIlIIl(final float n, final float n2) {
        return fcmpl(n, n2);
    }
    
    public void sendSettingsToServer() {
        if (lIIlIIIlIIIlIIII(this.mc.thePlayer)) {
            int llllllllllllIllIllIllllIIllllIlI = GameSettings.llIlIIIIIIIllI[1];
            final double llllllllllllIllIllIllllIIlllIlIl = (double)this.setModelParts.iterator();
            "".length();
            if (((0x5E ^ 0x3C ^ (0x3C ^ 0x54)) & (118 + 143 - 160 + 102 ^ 18 + 64 - 52 + 163 ^ -" ".length())) != 0x0) {
                return;
            }
            while (!lIIlIIIlIIIIlIII(((Iterator)llllllllllllIllIllIllllIIlllIlIl).hasNext() ? 1 : 0)) {
                final EnumPlayerModelParts llllllllllllIllIllIllllIIllllIIl = ((Iterator<EnumPlayerModelParts>)llllllllllllIllIllIllllIIlllIlIl).next();
                llllllllllllIllIllIllllIIllllIlI |= llllllllllllIllIllIllllIIllllIIl.getPartMask();
            }
            this.mc.thePlayer.sendQueue.addToSendQueue(new C15PacketClientSettings(this.language, this.renderDistanceChunks, this.chatVisibility, this.chatColours, llllllllllllIllIllIllllIIllllIlI));
        }
    }
    
    private static boolean lIIlIIIlIIIIllll(final Object llllllllllllIllIllIlllIllllIIlIl) {
        return llllllllllllIllIllIlllIllllIIlIl == null;
    }
    
    private static boolean lIIlIIIlIIIIIlll(final int llllllllllllIllIllIlllIllllIlllI, final int llllllllllllIllIllIlllIllllIllIl) {
        return llllllllllllIllIllIlllIllllIlllI < llllllllllllIllIllIlllIllllIllIl;
    }
    
    private static void lIIlIIIlIIIIIIlI() {
        (llIlIIIIIIIllI = new int[380])[0] = (0xAB ^ 0xAF);
        GameSettings.llIlIIIIIIIllI[1] = ((0x4F ^ 0x51) & ~(0x2D ^ 0x33));
        GameSettings.llIlIIIIIIIllI[2] = " ".length();
        GameSettings.llIlIIIIIIIllI[3] = "  ".length();
        GameSettings.llIlIIIIIIIllI[4] = "   ".length();
        GameSettings.llIlIIIIIIIllI[5] = (0x57 ^ 0x52);
        GameSettings.llIlIIIIIIIllI[6] = (0x3A ^ 0x3C);
        GameSettings.llIlIIIIIIIllI[7] = (0x71 ^ 0x5A ^ (0x19 ^ 0x35));
        GameSettings.llIlIIIIIIIllI[8] = (8 + 74 + 39 + 54 ^ 1 + 53 + 44 + 69);
        GameSettings.llIlIIIIIIIllI[9] = (0xF3 ^ 0xA9 ^ (0x39 ^ 0x6A));
        GameSettings.llIlIIIIIIIllI[10] = (0x26 ^ 0x3 ^ (0x3E ^ 0x11));
        GameSettings.llIlIIIIIIIllI[11] = (0x38 ^ 0x33);
        GameSettings.llIlIIIIIIIllI[12] = (0x53 ^ 0x5F);
        GameSettings.llIlIIIIIIIllI[13] = (0xB0 ^ 0xBD);
        GameSettings.llIlIIIIIIIllI[14] = (0xFD ^ 0xB5 ^ (0xEA ^ 0xAC));
        GameSettings.llIlIIIIIIIllI[15] = (0x3D ^ 0x32);
        GameSettings.llIlIIIIIIIllI[16] = (0xBC ^ 0xAC);
        GameSettings.llIlIIIIIIIllI[17] = (0x6E ^ 0x7F);
        GameSettings.llIlIIIIIIIllI[18] = (0xCF ^ 0x90 ^ (0x3B ^ 0x76));
        GameSettings.llIlIIIIIIIllI[19] = (0x60 ^ 0x73);
        GameSettings.llIlIIIIIIIllI[20] = (0x75 ^ 0x61);
        GameSettings.llIlIIIIIIIllI[21] = (0x3F ^ 0x4B ^ (0x3F ^ 0x5E));
        GameSettings.llIlIIIIIIIllI[22] = (0x7D ^ 0x1C ^ (0x2F ^ 0x58));
        GameSettings.llIlIIIIIIIllI[23] = (0x9D ^ 0x8A);
        GameSettings.llIlIIIIIIIllI[24] = -" ".length();
        GameSettings.llIlIIIIIIIllI[25] = (0x76 ^ 0x72 ^ (0x43 ^ 0x3F));
        GameSettings.llIlIIIIIIIllI[26] = (0x4D ^ 0x55);
        GameSettings.llIlIIIIIIIllI[27] = (0x44 ^ 0x5D);
        GameSettings.llIlIIIIIIIllI[28] = (0x41 ^ 0x5B);
        GameSettings.llIlIIIIIIIllI[29] = (0x73 ^ 0x68);
        GameSettings.llIlIIIIIIIllI[30] = (0x20 ^ 0x3E);
        GameSettings.llIlIIIIIIIllI[31] = (0x5F ^ 0x43);
        GameSettings.llIlIIIIIIIllI[32] = (0x90 ^ 0xBE ^ (0xAE ^ 0x9D));
        GameSettings.llIlIIIIIIIllI[33] = (0xE6 ^ 0xA2 ^ (0xD3 ^ 0x88));
        GameSettings.llIlIIIIIIIllI[34] = (0x5C ^ 0x7C);
        GameSettings.llIlIIIIIIIllI[35] = (0xC ^ 0x2D);
        GameSettings.llIlIIIIIIIllI[36] = (55 + 116 - 11 + 2 ^ 108 + 102 - 139 + 84);
        GameSettings.llIlIIIIIIIllI[37] = (0x23 ^ 0x1);
        GameSettings.llIlIIIIIIIllI[38] = (0x5B ^ 0x3F ^ (0x14 ^ 0x53));
        GameSettings.llIlIIIIIIIllI[39] = (123 + 179 - 131 + 9 ^ 46 + 113 - 15 + 14);
        GameSettings.llIlIIIIIIIllI[40] = (0x20 ^ 0x4B ^ (0xE2 ^ 0xAD));
        GameSettings.llIlIIIIIIIllI[41] = (0x21 ^ 0x4);
        GameSettings.llIlIIIIIIIllI[42] = (124 + 140 - 153 + 33 ^ 149 + 89 - 166 + 110);
        GameSettings.llIlIIIIIIIllI[43] = (0x64 ^ 0x43);
        GameSettings.llIlIIIIIIIllI[44] = (0x87 ^ 0xAF);
        GameSettings.llIlIIIIIIIllI[45] = (0x24 ^ 0xD);
        GameSettings.llIlIIIIIIIllI[46] = -(0xC2 ^ 0xA1);
        GameSettings.llIlIIIIIIIllI[47] = (0x75 ^ 0x3B ^ (0x37 ^ 0x52));
        GameSettings.llIlIIIIIIIllI[48] = (0xA1 ^ 0x8D);
        GameSettings.llIlIIIIIIIllI[49] = (0x4D ^ 0x60);
        GameSettings.llIlIIIIIIIllI[50] = -(0x6D ^ 0x24 ^ (0xB1 ^ 0x9C));
        GameSettings.llIlIIIIIIIllI[51] = (0xBE ^ 0x90);
        GameSettings.llIlIIIIIIIllI[52] = (0x61 ^ 0x2F ^ (0xC ^ 0x6D));
        GameSettings.llIlIIIIIIIllI[53] = -(0x59 ^ 0x3B);
        GameSettings.llIlIIIIIIIllI[54] = (72 + 118 - 66 + 17 ^ 82 + 27 + 4 + 76);
        GameSettings.llIlIIIIIIIllI[55] = (0x29 ^ 0x2D ^ (0x12 ^ 0x27));
        GameSettings.llIlIIIIIIIllI[56] = (0x1C ^ 0x48 ^ (0x64 ^ 0x2));
        GameSettings.llIlIIIIIIIllI[57] = (0x1E ^ 0x2D);
        GameSettings.llIlIIIIIIIllI[58] = (0x78 ^ 0x2E ^ (0x6F ^ 0xD));
        GameSettings.llIlIIIIIIIllI[59] = (0xF4 ^ 0xC1);
        GameSettings.llIlIIIIIIIllI[60] = (0xD2 ^ 0x96 ^ (0x37 ^ 0x45));
        GameSettings.llIlIIIIIIIllI[61] = (0x3A ^ 0xD);
        GameSettings.llIlIIIIIIIllI[62] = (110 + 124 - 137 + 67 ^ 13 + 77 + 21 + 41);
        GameSettings.llIlIIIIIIIllI[63] = (0x8A ^ 0x8C ^ (0x1B ^ 0x25));
        GameSettings.llIlIIIIIIIllI[64] = (0xB ^ 0x7A ^ (0xFF ^ 0xB1));
        GameSettings.llIlIIIIIIIllI[65] = (0x32 ^ 0x60 ^ (0xC9 ^ 0xA1));
        GameSettings.llIlIIIIIIIllI[66] = (0x58 ^ 0x63);
        GameSettings.llIlIIIIIIIllI[67] = (0xF8 ^ 0x83 ^ (0x6C ^ 0x2A));
        GameSettings.llIlIIIIIIIllI[68] = (71 + 159 - 29 + 48 ^ 21 + 144 - 52 + 61);
        GameSettings.llIlIIIIIIIllI[69] = (0x9D ^ 0xA3);
        GameSettings.llIlIIIIIIIllI[70] = (161 + 57 - 15 + 4 ^ 91 + 25 - 89 + 116);
        GameSettings.llIlIIIIIIIllI[71] = (0x46 ^ 0x56 ^ (0xE2 ^ 0xB3));
        GameSettings.llIlIIIIIIIllI[72] = (139 + 156 - 269 + 177 ^ 3 + 34 + 61 + 39);
        GameSettings.llIlIIIIIIIllI[73] = (0x8A ^ 0x95 ^ (0x74 ^ 0x28));
        GameSettings.llIlIIIIIIIllI[74] = (102 + 77 - 49 + 67 ^ 78 + 88 - 88 + 51);
        GameSettings.llIlIIIIIIIllI[75] = (147 + 198 - 269 + 164 ^ 20 + 135 - 61 + 87);
        GameSettings.llIlIIIIIIIllI[76] = (0x3D ^ 0x6 ^ (0xED ^ 0x90));
        GameSettings.llIlIIIIIIIllI[77] = (0x71 ^ 0x37 ^ " ".length());
        GameSettings.llIlIIIIIIIllI[78] = (155 + 10 - 2 + 89 ^ 49 + 129 - 132 + 134);
        GameSettings.llIlIIIIIIIllI[79] = (0xF ^ 0x46);
        GameSettings.llIlIIIIIIIllI[80] = (0xDB ^ 0x91);
        GameSettings.llIlIIIIIIIllI[81] = (198 + 147 - 270 + 153 ^ 101 + 23 - 23 + 74);
        GameSettings.llIlIIIIIIIllI[82] = (0x31 ^ 0x70 ^ (0x83 ^ 0x8E));
        GameSettings.llIlIIIIIIIllI[83] = (0xD2 ^ 0x9F);
        GameSettings.llIlIIIIIIIllI[84] = (0x28 ^ 0x66);
        GameSettings.llIlIIIIIIIllI[85] = (0x61 ^ 0x2E);
        GameSettings.llIlIIIIIIIllI[86] = (0x40 ^ 0x10);
        GameSettings.llIlIIIIIIIllI[87] = (0x1 ^ 0xB ^ (0x4F ^ 0x14));
        GameSettings.llIlIIIIIIIllI[88] = (38 + 3 - 7 + 113 ^ 119 + 8 + 41 + 25);
        GameSettings.llIlIIIIIIIllI[89] = (98 + 136 - 107 + 113 ^ 111 + 114 - 223 + 161);
        GameSettings.llIlIIIIIIIllI[90] = (0x62 ^ 0x36);
        GameSettings.llIlIIIIIIIllI[91] = (68 + 74 + 88 + 14 ^ 38 + 96 - 79 + 106);
        GameSettings.llIlIIIIIIIllI[92] = (0x1C ^ 0x4A);
        GameSettings.llIlIIIIIIIllI[93] = (0x5 ^ 0x9 ^ (0x92 ^ 0xC6));
        GameSettings.llIlIIIIIIIllI[94] = (0x78 ^ 0x21);
        GameSettings.llIlIIIIIIIllI[95] = (0x4C ^ 0x3 ^ (0x98 ^ 0x8D));
        GameSettings.llIlIIIIIIIllI[96] = (0xC8 ^ 0x93);
        GameSettings.llIlIIIIIIIllI[97] = (0x75 ^ 0x4B ^ (0x35 ^ 0x57));
        GameSettings.llIlIIIIIIIllI[98] = (0x8F ^ 0x8A ^ (0xC9 ^ 0x91));
        GameSettings.llIlIIIIIIIllI[99] = (0x3A ^ 0x64);
        GameSettings.llIlIIIIIIIllI[100] = (0x72 ^ 0x15 ^ (0x92 ^ 0xAA));
        GameSettings.llIlIIIIIIIllI[101] = (0xCF ^ 0xB7 ^ (0xD ^ 0x15));
        GameSettings.llIlIIIIIIIllI[102] = (21 + 141 - 99 + 146 ^ 106 + 166 - 270 + 174);
        GameSettings.llIlIIIIIIIllI[103] = (48 + 79 - 126 + 224 ^ 126 + 73 - 118 + 50);
        GameSettings.llIlIIIIIIIllI[104] = (0x5D ^ 0x3E);
        GameSettings.llIlIIIIIIIllI[105] = (0xDF ^ 0xBB);
        GameSettings.llIlIIIIIIIllI[106] = (0x66 ^ 0x4 ^ (0xC4 ^ 0xC3));
        GameSettings.llIlIIIIIIIllI[107] = (96 + 13 - 87 + 139 ^ 159 + 76 - 164 + 128);
        GameSettings.llIlIIIIIIIllI[108] = (0x77 ^ 0x10);
        GameSettings.llIlIIIIIIIllI[109] = (0x79 ^ 0x3D ^ (0x7F ^ 0x53));
        GameSettings.llIlIIIIIIIllI[110] = (100 + 110 - 74 + 103 ^ 90 + 40 - 85 + 89);
        GameSettings.llIlIIIIIIIllI[111] = (0xF6 ^ 0xA8 ^ (0x1B ^ 0x2F));
        GameSettings.llIlIIIIIIIllI[112] = (0x9 ^ 0x68 ^ (0xB7 ^ 0xBD));
        GameSettings.llIlIIIIIIIllI[113] = (0x87 ^ 0xB5 ^ (0xE7 ^ 0xB9));
        GameSettings.llIlIIIIIIIllI[114] = (0xD4 ^ 0xB9);
        GameSettings.llIlIIIIIIIllI[115] = (0x1D ^ 0x73);
        GameSettings.llIlIIIIIIIllI[116] = (38 + 131 - 106 + 109 ^ 106 + 75 - 94 + 108);
        GameSettings.llIlIIIIIIIllI[117] = (0x25 ^ 0x38 ^ (0x24 ^ 0x49));
        GameSettings.llIlIIIIIIIllI[118] = (0x9E ^ 0xBD ^ (0x6C ^ 0x3E));
        GameSettings.llIlIIIIIIIllI[119] = (0x4 ^ 0x76);
        GameSettings.llIlIIIIIIIllI[120] = (0x64 ^ 0x17);
        GameSettings.llIlIIIIIIIllI[121] = (0x70 ^ 0x36 ^ (0x3F ^ 0xD));
        GameSettings.llIlIIIIIIIllI[122] = (0x4 ^ 0x71);
        GameSettings.llIlIIIIIIIllI[123] = (161 + 132 - 91 + 11 ^ 27 + 0 + 124 + 12);
        GameSettings.llIlIIIIIIIllI[124] = (0x70 ^ 0x57 ^ (0x4 ^ 0x54));
        GameSettings.llIlIIIIIIIllI[125] = (0xC4 ^ 0xBD);
        GameSettings.llIlIIIIIIIllI[126] = (0x3C ^ 0x46);
        GameSettings.llIlIIIIIIIllI[127] = (0xBA ^ 0xC1);
        GameSettings.llIlIIIIIIIllI[128] = (0x53 ^ 0x2F);
        GameSettings.llIlIIIIIIIllI[129] = (122 + 136 - 60 + 3 ^ 37 + 77 - 63 + 129);
        GameSettings.llIlIIIIIIIllI[130] = (0xE3 ^ 0x9D);
        GameSettings.llIlIIIIIIIllI[131] = 10 + 102 - 0 + 15;
        GameSettings.llIlIIIIIIIllI[132] = (0x6F ^ 0x7C) + (0xE3 ^ 0xBF) - -(0x68 ^ 0x64) + (0x57 ^ 0x52);
        GameSettings.llIlIIIIIIIllI[133] = (0x85 ^ 0x8D) + (0xB0 ^ 0xBE) - -(0xD ^ 0x31) + (0xA9 ^ 0x86);
        GameSettings.llIlIIIIIIIllI[134] = 115 + 67 - 98 + 46;
        GameSettings.llIlIIIIIIIllI[135] = 7 + 27 - 21 + 118;
        GameSettings.llIlIIIIIIIllI[136] = 89 + 65 - 26 + 4;
        GameSettings.llIlIIIIIIIllI[137] = (0xA ^ 0x59) + (0x3F ^ 0x31) - (0xB6 ^ 0x81) + (0xF9 ^ 0xA2);
        GameSettings.llIlIIIIIIIllI[138] = 48 + 71 - 87 + 102;
        GameSettings.llIlIIIIIIIllI[139] = (0x44 ^ 0x1E) + (0xA ^ 0x41) - (0x31 ^ 0x6D) + (0x6B ^ 0x55);
        GameSettings.llIlIIIIIIIllI[140] = (0x96 ^ 0xA5) + (0xDB ^ 0x91) - (0x73 ^ 0x24) + (0x6D ^ 0xF);
        GameSettings.llIlIIIIIIIllI[141] = (0xEC ^ 0xC0) + (0xE4 ^ 0xAF) - (0x90 ^ 0xA8) + (0xC2 ^ 0x88);
        GameSettings.llIlIIIIIIIllI[142] = (0x2B ^ 0x1F) + (10 + 65 - 44 + 99) - (0x44 ^ 0x3F) + (0x4C ^ 0x3);
        GameSettings.llIlIIIIIIIllI[143] = 106 + 11 - 70 + 88 + (0xCA ^ 0xA1) - (33 + 92 - 4 + 26) + (0x2D ^ 0x1);
        GameSettings.llIlIIIIIIIllI[144] = (0xB ^ 0x39) + (0x5F ^ 0x28) - (0x4F ^ 0x32) + (0x65 ^ 0x5);
        GameSettings.llIlIIIIIIIllI[145] = 81 + 73 - 14 + 1;
        GameSettings.llIlIIIIIIIllI[146] = 118 + 91 - 122 + 49 + (0x2C ^ 0x34) - (0x2A ^ 0x69) + (0x79 ^ 0x48);
        GameSettings.llIlIIIIIIIllI[147] = (0x93 ^ 0xB5) + (0x9C ^ 0x8A) - -(0x5E ^ 0x7E) + (0xF2 ^ 0xC1);
        GameSettings.llIlIIIIIIIllI[148] = (0x2D ^ 0x28) + (29 + 36 + 66 + 0) - (0x75 ^ 0x5) + (0xE7 ^ 0x9F);
        GameSettings.llIlIIIIIIIllI[149] = (0xF5 ^ 0x88) + (21 + 87 - 22 + 43) - (152 + 93 - 124 + 44) + (0xBB ^ 0x83);
        GameSettings.llIlIIIIIIIllI[150] = (0x23 ^ 0x31) + (0x61 ^ 0x4D) - (0x76 ^ 0x59) + (28 + 42 - 39 + 100);
        GameSettings.llIlIIIIIIIllI[151] = 71 + 89 - 97 + 84;
        GameSettings.llIlIIIIIIIllI[152] = (0xB0 ^ 0xC7) + (0x2E ^ 0x29) - (0xFB ^ 0x98) + (0x5 ^ 0x7C);
        GameSettings.llIlIIIIIIIllI[153] = 71 + 84 - 113 + 107;
        GameSettings.llIlIIIIIIIllI[154] = (0x39 ^ 0x7D) + (0xF7 ^ 0xC5) - (0x60 ^ 0x5B) + (0x22 ^ 0x79);
        GameSettings.llIlIIIIIIIllI[155] = (0x6A ^ 0x7) + (0xED ^ 0xBE) - (0x7B ^ 0x5) + (0x7C ^ 0x29);
        GameSettings.llIlIIIIIIIllI[156] = 79 + 38 - 64 + 99;
        GameSettings.llIlIIIIIIIllI[157] = 130 + 99 - 111 + 17 + "  ".length() - -(0x61 ^ 0x6C) + "   ".length();
        GameSettings.llIlIIIIIIIllI[158] = (0x21 ^ 0x1C) + (0x60 ^ 0x28) - -"  ".length() + (0x18 ^ 0xB);
        GameSettings.llIlIIIIIIIllI[159] = 70 + 19 + 26 + 40;
        GameSettings.llIlIIIIIIIllI[160] = (0xBE ^ 0x97) + (0xA5 ^ 0xA3) - -(0x54 ^ 0x30) + (0x66 ^ 0x6F);
        GameSettings.llIlIIIIIIIllI[161] = 126 + 107 - 178 + 102;
        GameSettings.llIlIIIIIIIllI[162] = 32 + 73 - 31 + 84;
        GameSettings.llIlIIIIIIIllI[163] = 97 + 123 - 117 + 56;
        GameSettings.llIlIIIIIIIllI[164] = 75 + 90 - 141 + 120 + (0xE6 ^ 0xB0) - (11 + 153 - 71 + 84) + (0xF8 ^ 0x93);
        GameSettings.llIlIIIIIIIllI[165] = (0x97 ^ 0xAD) + (0x7 ^ 0x71) - (0x68 ^ 0x45) + (0x52 ^ 0x4C);
        GameSettings.llIlIIIIIIIllI[166] = (0x32 ^ 0x62) + (16 + 154 - 71 + 58) - (0x27 ^ 0x71) + (0x8F ^ 0x84);
        GameSettings.llIlIIIIIIIllI[167] = 65 + 73 - 7 + 32;
        GameSettings.llIlIIIIIIIllI[168] = 17 + 23 + 41 + 83;
        GameSettings.llIlIIIIIIIllI[169] = (0x1B ^ 0x1C) + (0x51 ^ 0xB) - -(0x5E ^ 0x53) + (0x5D ^ 0x6A);
        GameSettings.llIlIIIIIIIllI[170] = (0x18 ^ 0x5A) + " ".length() - -(0x5B ^ 0x60) + (0x85 ^ 0xAD);
        GameSettings.llIlIIIIIIIllI[171] = 58 + 26 - 0 + 83;
        GameSettings.llIlIIIIIIIllI[172] = 134 + 23 - 75 + 86;
        GameSettings.llIlIIIIIIIllI[173] = 125 + 128 - 243 + 159;
        GameSettings.llIlIIIIIIIllI[174] = 164 + 5 - 19 + 20;
        GameSettings.llIlIIIIIIIllI[175] = (0x1C ^ 0x64) + (0xF8 ^ 0xB6) - (0xBC ^ 0x81) + (0xA6 ^ 0x84);
        GameSettings.llIlIIIIIIIllI[176] = 151 + 59 - 70 + 18 + (0x7A ^ 0x7D) - (0x2C ^ 0x73) + (0x3B ^ 0x5D);
        GameSettings.llIlIIIIIIIllI[177] = (0x8A ^ 0x9B) + (31 + 37 + 29 + 53) - -(0x1E ^ 0x1A) + "  ".length();
        GameSettings.llIlIIIIIIIllI[178] = 167 + 54 - 51 + 4;
        GameSettings.llIlIIIIIIIllI[179] = 85 + 103 - 171 + 158;
        GameSettings.llIlIIIIIIIllI[180] = "  ".length() + (0xD0 ^ 0x8D) - -(0x70 ^ 0x3A) + (0x4B ^ 0x4C);
        GameSettings.llIlIIIIIIIllI[181] = 86 + 129 - 76 + 38;
        GameSettings.llIlIIIIIIIllI[182] = 160 + 110 - 97 + 5;
        GameSettings.llIlIIIIIIIllI[183] = (0x5 ^ 0x1A) + (0x27 ^ 0x3) - (0xB6 ^ 0xBC) + (0x57 ^ 0x2D);
        GameSettings.llIlIIIIIIIllI[184] = (-(0xFFFFBB6B & 0x7CF5) & (0xFFFFB961 & 0x7FFE));
        GameSettings.llIlIIIIIIIllI[185] = 63 + 166 - 137 + 86 + (0x73 ^ 0x36) - (0xE8 ^ 0x84) + (0xB5 ^ 0x9C);
        GameSettings.llIlIIIIIIIllI[186] = 16 + 153 - 154 + 161 + (0x39 ^ 0x29) - (0xE9 ^ 0x81) + (0x14 ^ 0x49);
        GameSettings.llIlIIIIIIIllI[187] = 2 + 99 + 47 + 34;
        GameSettings.llIlIIIIIIIllI[188] = 147 + 95 - 81 + 22;
        GameSettings.llIlIIIIIIIllI[189] = 120 + 56 - 52 + 28 + (0x5 ^ 0x49) - (0xEE ^ 0x94) + (0x6F ^ 0x21);
        GameSettings.llIlIIIIIIIllI[190] = (0x12 ^ 0x8) + (0xD6 ^ 0xC1) - -(0xEF ^ 0x9D) + (0x47 ^ 0x51);
        GameSettings.llIlIIIIIIIllI[191] = 128 + 74 - 79 + 11 + (0x2D ^ 0x3D) - (0x2F ^ 0x15) + (0xF0 ^ 0xAE);
        GameSettings.llIlIIIIIIIllI[192] = 5 + 63 - 49 + 168;
        GameSettings.llIlIIIIIIIllI[193] = (0xF3 ^ 0x84) + (0x1A ^ 0x46) - (0x79 ^ 0x4E) + (0x7D ^ 0x5D);
        GameSettings.llIlIIIIIIIllI[194] = 76 + 122 - 179 + 157 + (0x6C ^ 0xA) - (97 + 167 - 113 + 26) + (0x25 ^ 0x7D);
        GameSettings.llIlIIIIIIIllI[195] = 50 + 66 + 17 + 57;
        GameSettings.llIlIIIIIIIllI[196] = (0x17 ^ 0x7B) + (90 + 145 - 185 + 136) - (37 + 14 + 44 + 54) + (0x8 ^ 0x26);
        GameSettings.llIlIIIIIIIllI[197] = (0x47 ^ 0x53) + (0xBA ^ 0x85) - -(0x11 ^ 0x5F) + (0xB8 ^ 0xA7);
        GameSettings.llIlIIIIIIIllI[198] = 10 + 88 + 39 + 56;
        GameSettings.llIlIIIIIIIllI[199] = 23 + 69 + 18 + 78 + (0x90 ^ 0xBE) - (0x3C ^ 0x78) + (0x4A ^ 0x56);
        GameSettings.llIlIIIIIIIllI[200] = 104 + 40 - 30 + 47 + (0x3C ^ 0x48) - (0x26 ^ 0x7C) + (0x16 ^ 0x1E);
        GameSettings.llIlIIIIIIIllI[201] = 55 + 76 - 125 + 156 + (0x12 ^ 0x60) - (153 + 22 - 76 + 92) + (0xCC ^ 0xA3);
        GameSettings.llIlIIIIIIIllI[202] = 87 + 195 - 280 + 195;
        GameSettings.llIlIIIIIIIllI[203] = 15 + 4 + 55 + 124;
        GameSettings.llIlIIIIIIIllI[204] = 34 + 71 - 64 + 138 + (0x8F ^ 0x8A) - (0x90 ^ 0xC4) + (0x28 ^ 0x4B);
        GameSettings.llIlIIIIIIIllI[205] = 179 + 114 - 278 + 185;
        GameSettings.llIlIIIIIIIllI[206] = 49 + 32 - 57 + 177;
        GameSettings.llIlIIIIIIIllI[207] = 161 + 35 - 101 + 105 + (82 + 112 - 116 + 102) - (0xFFFFBD5E & 0x43FF) + (116 + 94 - 207 + 169);
        GameSettings.llIlIIIIIIIllI[208] = 24 + 10 + 93 + 76;
        GameSettings.llIlIIIIIIIllI[209] = 27 + 121 + 53 + 3;
        GameSettings.llIlIIIIIIIllI[210] = 64 + 44 - 55 + 128 + (0x16 ^ 0x2F) - (59 + 90 - 103 + 149) + (101 + 74 - 154 + 141);
        GameSettings.llIlIIIIIIIllI[211] = (0x6C ^ 0x50) + (0x3C ^ 0x2A) - (0x1C ^ 0xB) + (142 + 67 - 83 + 21);
        GameSettings.llIlIIIIIIIllI[212] = (0x62 ^ 0xA) + (0x48 ^ 0x1E) - (0x87 ^ 0xA4) + (0x5 ^ 0x31);
        GameSettings.llIlIIIIIIIllI[213] = 52 + 134 - 128 + 97 + (0x31 ^ 0x68) - (0x3A ^ 0x55) + (0x3C ^ 0x77);
        GameSettings.llIlIIIIIIIllI[214] = 27 + 167 - 120 + 135;
        GameSettings.llIlIIIIIIIllI[215] = 130 + 3 + 44 + 33;
        GameSettings.llIlIIIIIIIllI[216] = 37 + 38 + 72 + 64;
        GameSettings.llIlIIIIIIIllI[217] = 35 + 162 - 21 + 36;
        GameSettings.llIlIIIIIIIllI[218] = (0x98 ^ 0x90) + (25 + 48 + 7 + 63) - (97 + 26 - 49 + 54) + (57 + 83 - 28 + 78);
        GameSettings.llIlIIIIIIIllI[219] = 129 + 30 + 47 + 8;
        GameSettings.llIlIIIIIIIllI[220] = 135 + 35 - 12 + 57;
        GameSettings.llIlIIIIIIIllI[221] = 91 + 4 - 68 + 155 + (0xE9 ^ 0x97) - (146 + 188 - 242 + 114) + (0x0 ^ 0x72);
        GameSettings.llIlIIIIIIIllI[222] = 213 + 128 - 290 + 166;
        GameSettings.llIlIIIIIIIllI[223] = (0xB0 ^ 0x8A) + (157 + 180 - 270 + 115) - (132 + 108 - 100 + 5) + (0xF1 ^ 0x8A);
        GameSettings.llIlIIIIIIIllI[224] = 4 + 5 + 125 + 31 + (19 + 112 - 34 + 32) - (134 + 87 - 215 + 216) + (42 + 59 + 27 + 19);
        GameSettings.llIlIIIIIIIllI[225] = 60 + 174 - 63 + 23 + "  ".length() - (53 + 170 - 185 + 143) + (148 + 176 - 254 + 135);
        GameSettings.llIlIIIIIIIllI[226] = (0x15 ^ 0x45) + (24 + 97 + 65 + 0) - (0x23 ^ 0x7A) + (0x39 ^ 0x15);
        GameSettings.llIlIIIIIIIllI[227] = ((0x32 ^ 0x50) & ~(0x9 ^ 0x6B)) + (0x27 ^ 0x3F) - -(94 + 87 - 103 + 82) + (0x29 ^ 0xF);
        GameSettings.llIlIIIIIIIllI[228] = (0xE ^ 0x50) + (28 + 175 - 74 + 67) - (119 + 77 - 180 + 199) + (66 + 43 - 36 + 75);
        GameSettings.llIlIIIIIIIllI[229] = 148 + 54 - 154 + 176;
        GameSettings.llIlIIIIIIIllI[230] = (0x78 ^ 0x6A) + (0x7E ^ 0x1D) - -(0xBB ^ 0x99) + (0xC0 ^ 0x8A);
        GameSettings.llIlIIIIIIIllI[231] = 130 + 35 - 148 + 122 + (17 + 106 - 82 + 100) - (58 + 0 + 94 + 9) + (0x50 ^ 0x3B);
        GameSettings.llIlIIIIIIIllI[232] = 48 + 25 + 69 + 51 + (13 + 114 - 7 + 34) - (24 + 53 + 91 + 14) + (0x7B ^ 0x45);
        GameSettings.llIlIIIIIIIllI[233] = 226 + 111 - 157 + 48;
        GameSettings.llIlIIIIIIIllI[234] = 198 + 9 - 187 + 209;
        GameSettings.llIlIIIIIIIllI[235] = 133 + 127 - 223 + 118 + (0xEE ^ 0x88) - (233 + 211 - 298 + 102) + (60 + 170 - 117 + 108);
        GameSettings.llIlIIIIIIIllI[236] = 112 + 77 - 162 + 204;
        GameSettings.llIlIIIIIIIllI[237] = (0xE8 ^ 0xAC) + (0x5A ^ 0x37) - (107 + 107 - 184 + 119) + (59 + 63 - 112 + 194);
        GameSettings.llIlIIIIIIIllI[238] = 186 + 189 - 169 + 27;
        GameSettings.llIlIIIIIIIllI[239] = 31 + 111 - 49 + 70 + (107 + 67 - 39 + 6) - (54 + 164 - 154 + 105) + (0xCD ^ 0xAE);
        GameSettings.llIlIIIIIIIllI[240] = (0x3D ^ 0x5E) + (109 + 60 - 156 + 131) - (0x1F ^ 0x22) + (0x4A ^ 0x7F);
        GameSettings.llIlIIIIIIIllI[241] = 135 + 74 - 41 + 68;
        GameSettings.llIlIIIIIIIllI[242] = (0x7E ^ 0x61) + (183 + 43 - 91 + 66) - (0x80 ^ 0xC6) + (0x4D ^ 0x6);
        GameSettings.llIlIIIIIIIllI[243] = 83 + 196 - 233 + 192;
        GameSettings.llIlIIIIIIIllI[244] = 59 + 194 - 51 + 37;
        GameSettings.llIlIIIIIIIllI[245] = (0xB1 ^ 0xBE) + (0x72 ^ 0x74) - -(111 + 88 - 66 + 78) + (0x6E ^ 0x66);
        GameSettings.llIlIIIIIIIllI[246] = 140 + 85 - 176 + 109 + (0x9C ^ 0xBF) - (0x83 ^ 0xA3) + (0x35 ^ 0x65);
        GameSettings.llIlIIIIIIIllI[247] = 53 + 230 - 279 + 238;
        GameSettings.llIlIIIIIIIllI[248] = (0x8 ^ 0x7A) + (0x2D ^ 0x4) - -(0x7F ^ 0x40) + (0x8F ^ 0x96);
        GameSettings.llIlIIIIIIIllI[249] = 96 + 34 - 67 + 76 + (147 + 14 - 19 + 16) - (61 + 134 - 42 + 10) + (0x63 ^ 0xD);
        GameSettings.llIlIIIIIIIllI[250] = 50 + 10 + 71 + 114;
        GameSettings.llIlIIIIIIIllI[251] = 13 + 231 - 31 + 33;
        GameSettings.llIlIIIIIIIllI[252] = 82 + 182 - 231 + 214;
        GameSettings.llIlIIIIIIIllI[253] = (0xAD ^ 0xB0) + (0xF8 ^ 0xA2) - (0x6C ^ 0x67) + (62 + 129 - 147 + 96);
        GameSettings.llIlIIIIIIIllI[254] = 126 + 46 - 132 + 92 + (194 + 73 - 200 + 178) - (0xFFFFD397 & 0x2D78) + (46 + 137 - 130 + 91);
        GameSettings.llIlIIIIIIIllI[255] = 198 + 229 - 294 + 117;
        GameSettings.llIlIIIIIIIllI[256] = 150 + 158 - 68 + 11;
        GameSettings.llIlIIIIIIIllI[257] = 74 + 110 - 36 + 104;
        GameSettings.llIlIIIIIIIllI[258] = (0xDC ^ 0xAE) + (185 + 233 - 307 + 126) - (98 + 40 - 102 + 168) + (0x22 ^ 0x48);
        GameSettings.llIlIIIIIIIllI[259] = 180 + 83 - 131 + 67 + (77 + 186 - 236 + 201) - (0xFFFFBF97 & 0x417E) + (0x22 ^ 0x4B);
        GameSettings.llIlIIIIIIIllI[260] = 157 + 71 - 40 + 67;
        GameSettings.llIlIIIIIIIllI[261] = (-(0xFFFFBEF3 & 0x7FED) & (0xFFFFBFF5 & 0x7FEB));
        GameSettings.llIlIIIIIIIllI[262] = (0xFFFFAFD2 & 0x512F);
        GameSettings.llIlIIIIIIIllI[263] = (0xFFFF9343 & 0x6DBF);
        GameSettings.llIlIIIIIIIllI[264] = (0xFFFF9197 & 0x6F6C);
        GameSettings.llIlIIIIIIIllI[265] = (-(0xFFFFFCE7 & 0x3F7B) & (0xFFFFBFFF & 0x7D67));
        GameSettings.llIlIIIIIIIllI[266] = (-(0xFFFFFEBE & 0x4FFB) & (0xFFFFEFBF & 0x5FFF));
        GameSettings.llIlIIIIIIIllI[267] = (0xFFFF8FB7 & 0x714F);
        GameSettings.llIlIIIIIIIllI[268] = (0xFFFFA5CD & 0x5B3A);
        GameSettings.llIlIIIIIIIllI[269] = (-(0xFFFFDF77 & 0x7AC9) & (0xFFFFDFFD & 0x7B4B));
        GameSettings.llIlIIIIIIIllI[270] = (-(0xFFFFFEFB & 0x79E6) & (0xFFFFFBEF & 0x7DFB));
        GameSettings.llIlIIIIIIIllI[271] = (0xFFFFB10F & 0x4FFB);
        GameSettings.llIlIIIIIIIllI[272] = (-(0xFFFFFEB7 & 0x717B) & (0xFFFFFD7E & 0x73BF));
        GameSettings.llIlIIIIIIIllI[273] = (0xFFFFA55D & 0x5BAF);
        GameSettings.llIlIIIIIIIllI[274] = (-(0xFFFFFFB5 & 0x345B) & (0xFFFFBFBF & 0x755E));
        GameSettings.llIlIIIIIIIllI[275] = (0xFFFFDB3F & 0x25CF);
        GameSettings.llIlIIIIIIIllI[276] = (-(0xFFFFEFBF & 0x5ACD) & (0xFFFFCFFD & 0x7B9E));
        GameSettings.llIlIIIIIIIllI[277] = (-(0xFFFF999B & 0x6E6D) & (0xFFFFC959 & 0x3FBF));
        GameSettings.llIlIIIIIIIllI[278] = (0xFFFFF5FE & 0xB13);
        GameSettings.llIlIIIIIIIllI[279] = (0xFFFFBD9F & 0x4373);
        GameSettings.llIlIIIIIIIllI[280] = (-(0xFFFFBBD9 & 0x7CE7) & (0xFFFFBBFF & 0x7DD4));
        GameSettings.llIlIIIIIIIllI[281] = (-(0xFFFFFEFF & 0x3B81) & (0xFFFFFFDD & 0x3BB7));
        GameSettings.llIlIIIIIIIllI[282] = (-(0xFFFFF2FF & 0x7DAA) & (0xFFFFF3FF & 0x7DBF));
        GameSettings.llIlIIIIIIIllI[283] = (0xFFFFA3D7 & 0x5D3F);
        GameSettings.llIlIIIIIIIllI[284] = (0xFFFFB3FC & 0x4D1B);
        GameSettings.llIlIIIIIIIllI[285] = (0xFFFFED39 & 0x13DF);
        GameSettings.llIlIIIIIIIllI[286] = (-(0xFFFFFBA6 & 0x5CDB) & (0xFFFFDFFF & 0x799B));
        GameSettings.llIlIIIIIIIllI[287] = (-(0xFFFFFE7D & 0x5BA7) & (0xFFFFFB7F & 0x5FBF));
        GameSettings.llIlIIIIIIIllI[288] = (0xFFFFA37F & 0x5D9C);
        GameSettings.llIlIIIIIIIllI[289] = (0xFFFFF9FF & 0x71D);
        GameSettings.llIlIIIIIIIllI[290] = (0xFFFFA37E & 0x5D9F);
        GameSettings.llIlIIIIIIIllI[291] = (-(0xFFFFFAE7 & 0x17D9) & (0xFFFFFFDF & 0x13FF));
        GameSettings.llIlIIIIIIIllI[292] = (0xFFFFD3B2 & 0x2D6D);
        GameSettings.llIlIIIIIIIllI[293] = (0xFFFFD7E7 & 0x2939);
        GameSettings.llIlIIIIIIIllI[294] = (-(0xFFFFFE5F & 0x2FFA) & (0xFFFFAFFB & 0x7F7F));
        GameSettings.llIlIIIIIIIllI[295] = (0xFFFFC3BB & 0x3D67);
        GameSettings.llIlIIIIIIIllI[296] = (-(0xFFFFF8DB & 0x3F2F) & (0xFFFFFBEE & 0x3D3F));
        GameSettings.llIlIIIIIIIllI[297] = (0xFFFFD3AF & 0x2D75);
        GameSettings.llIlIIIIIIIllI[298] = (0xFFFFA3E6 & 0x5D3F);
        GameSettings.llIlIIIIIIIllI[299] = (0xFFFFC3FF & 0x3D27);
        GameSettings.llIlIIIIIIIllI[300] = (0xFFFFE9E9 & 0x173E);
        GameSettings.llIlIIIIIIIllI[301] = (0xFFFF8D7B & 0x73AD);
        GameSettings.llIlIIIIIIIllI[302] = (0xFFFFE1FF & 0x1F2A);
        GameSettings.llIlIIIIIIIllI[303] = (-(0xFFFFAC97 & 0x5F6D) & (0xFFFFBDEF & 0x4F3F));
        GameSettings.llIlIIIIIIIllI[304] = (-(0xFFFFFF47 & 0x64FA) & (0xFFFFFDEF & 0x677D));
        GameSettings.llIlIIIIIIIllI[305] = (0xFFFF9B6D & 0x65BF);
        GameSettings.llIlIIIIIIIllI[306] = (-(0xFFFFFF6B & 0x30D5) & (0xFFFFF3FE & 0x3D6F));
        GameSettings.llIlIIIIIIIllI[307] = (0xFFFFF5AF & 0xB7F);
        GameSettings.llIlIIIIIIIllI[308] = (-(0xFFFFF6AE & 0x1FD7) & (0xFFFF9FFD & 0x77B7));
        GameSettings.llIlIIIIIIIllI[309] = (-(0xFFFFFADF & 0x2FEB) & (0xFFFFFBFB & 0x2FFF));
        GameSettings.llIlIIIIIIIllI[310] = (-(0xFFFFDEEF & 0x2BDE) & (0xFFFF8FFF & 0x7BFF));
        GameSettings.llIlIIIIIIIllI[311] = (-(0xFFFFFFCF & 0x54B9) & (0xFFFFF5BB & 0x5FFF));
        GameSettings.llIlIIIIIIIllI[312] = (-(0xFFFFFA5B & 0x3FA6) & (0xFFFFBFBD & 0x7B77));
        GameSettings.llIlIIIIIIIllI[313] = (0xFFFFBF75 & 0x41BF);
        GameSettings.llIlIIIIIIIllI[314] = (-(0xFFFFE7EB & 0x7ADE) & (0xFFFFFBFF & 0x67FF));
        GameSettings.llIlIIIIIIIllI[315] = (0xFFFFE5BF & 0x1B77);
        GameSettings.llIlIIIIIIIllI[316] = (0xFFFFB53B & 0x4BFC);
        GameSettings.llIlIIIIIIIllI[317] = (0xFFFFEBB9 & 0x157F);
        GameSettings.llIlIIIIIIIllI[318] = (-(0xFFFFBF59 & 0x7AE7) & (0xFFFFFB7E & 0x3FFB));
        GameSettings.llIlIIIIIIIllI[319] = (0xFFFFBD3F & 0x43FB);
        GameSettings.llIlIIIIIIIllI[320] = (-(0xFFFFF79C & 0x5A67) & (0xFFFFF37F & 0x5FBF));
        GameSettings.llIlIIIIIIIllI[321] = (0xFFFFF5FF & 0xB3D);
        GameSettings.llIlIIIIIIIllI[322] = (0xFFFFA93E & 0x57FF);
        GameSettings.llIlIIIIIIIllI[323] = (0xFFFFC33F & 0x3DFF);
        GameSettings.llIlIIIIIIIllI[324] = (-(0xFFFFAFFE & 0x763F) & (0xFFFFE7FD & 0x3F7F));
        GameSettings.llIlIIIIIIIllI[325] = (0xFFFFD5D3 & 0x2B6D);
        GameSettings.llIlIIIIIIIllI[326] = (-(0xFFFFD4F7 & 0x7BB9) & (0xFFFFD7F3 & 0x79FE));
        GameSettings.llIlIIIIIIIllI[327] = (0xFFFFB37B & 0x4DC7);
        GameSettings.llIlIIIIIIIllI[328] = (-(0xFFFFFF8A & 0x727F) & (0xFFFFFFCD & 0x737F));
        GameSettings.llIlIIIIIIIllI[329] = (-(0xFFFFB7E1 & 0x7EBF) & (0xFFFFBFFF & 0x77E5));
        GameSettings.llIlIIIIIIIllI[330] = (-(0xFFFFF3B7 & 0x6C5A) & (0xFFFFE9F7 & 0x775F));
        GameSettings.llIlIIIIIIIllI[331] = (-(0xFFFFCF1B & 0x74F5) & (0xFFFFF577 & 0x4FDF));
        GameSettings.llIlIIIIIIIllI[332] = (-(0xFFFFF6BA & 0x7FF7) & (0xFFFFFFFD & 0x77FB));
        GameSettings.llIlIIIIIIIllI[333] = (0xFFFF8B4B & 0x75FD);
        GameSettings.llIlIIIIIIIllI[334] = (-(0xFFFF9C75 & 0x738F) & (0xFFFFD97F & 0x37CE));
        GameSettings.llIlIIIIIIIllI[335] = (0xFFFFFDFB & 0x34F);
        GameSettings.llIlIIIIIIIllI[336] = (-(0xFFFFF28E & 0x4F73) & (0xFFFFDFFD & 0x634F));
        GameSettings.llIlIIIIIIIllI[337] = (0xFFFFCDFD & 0x334F);
        GameSettings.llIlIIIIIIIllI[338] = (-(0xFFFFAFA6 & 0x7AFB) & (0xFFFFEBEF & 0x3FFF));
        GameSettings.llIlIIIIIIIllI[339] = (0xFFFFBD7F & 0x43CF);
        GameSettings.llIlIIIIIIIllI[340] = (-(0xFFFFE33D & 0x7CCB) & (0xFFFFFDDE & 0x6379));
        GameSettings.llIlIIIIIIIllI[341] = (-(0xFFFFEFAF & 0x1ED9) & (0xFFFF9FFB & 0x6FDD));
        GameSettings.llIlIIIIIIIllI[342] = (-(0xFFFFF5FD & 0x1E8B) & (0xFFFF97FF & 0x7DDA));
        GameSettings.llIlIIIIIIIllI[343] = (0xFFFFE5DB & 0x1B77);
        GameSettings.llIlIIIIIIIllI[344] = (-(0xFFFFBC8E & 0x73FD) & (0xFFFFF5FF & 0x3BDF));
        GameSettings.llIlIIIIIIIllI[345] = (0xFFFF8755 & 0x79FF);
        GameSettings.llIlIIIIIIIllI[346] = (-(0xFFFFCFEE & 0x7EBB) & (-1 & 0x4FFF));
        GameSettings.llIlIIIIIIIllI[347] = (-(0xFFFFFCFD & 0x7FAB) & (-1 & 0x7DFF));
        GameSettings.llIlIIIIIIIllI[348] = (0xFFFFB9DB & 0x477C);
        GameSettings.llIlIIIIIIIllI[349] = (-(0xFFFFBE37 & 0x5FCB) & (0xFFFF9FDB & 0x7F7F));
        GameSettings.llIlIIIIIIIllI[350] = (-(0xFFFFEED1 & 0x73AF) & (0xFFFFEBFA & 0x77DF));
        GameSettings.llIlIIIIIIIllI[351] = (-(0xFFFFF78D & 0x3EF7) & (0xFFFFF7FF & 0x3FDF));
        GameSettings.llIlIIIIIIIllI[352] = (-(0xFFFFB8F6 & 0x678B) & (0xFFFFF9FF & 0x27DD));
        GameSettings.llIlIIIIIIIllI[353] = (-(0xFFFFFDE9 & 0x6237) & (0xFFFFE5FD & 0x7B7F));
        GameSettings.llIlIIIIIIIllI[354] = (0xFFFFC75F & 0x39FE);
        GameSettings.llIlIIIIIIIllI[355] = (-(0xFFFFAAAD & 0x7FF3) & (0xFFFFEBFF & 0x3FFF));
        GameSettings.llIlIIIIIIIllI[356] = (-(0xFFFFFF9F & 0x6EFF) & (0xFFFFEFFE & 0x7FFF));
        GameSettings.llIlIIIIIIIllI[357] = (0xFFFFDF7F & 0x21E1);
        GameSettings.llIlIIIIIIIllI[358] = (-(84 + 88 - 162 + 144) & (0xFFFFFDFB & 0x3FF));
        GameSettings.llIlIIIIIIIllI[359] = (-(0xFFFFAFDF & 0x7CBD) & (0xFFFFEFFF & 0x3DFF));
        GameSettings.llIlIIIIIIIllI[360] = (-(0xFFFFFBBD & 0x1C5E) & (0xFFFFDFFF & 0x397F));
        GameSettings.llIlIIIIIIIllI[361] = (0xFFFFAFE7 & 0x517D);
        GameSettings.llIlIIIIIIIllI[362] = (0xFFFFDF6F & 0x21F6);
        GameSettings.llIlIIIIIIIllI[363] = (0xFFFFF17F & 0xFE7);
        GameSettings.llIlIIIIIIIllI[364] = (0xFFFFCDEA & 0x337D);
        GameSettings.llIlIIIIIIIllI[365] = (-(0xFFFF9F87 & 0x7CFB) & (0xFFFFBDEB & 0x5FFF));
        GameSettings.llIlIIIIIIIllI[366] = (-(0xFFFFBAA7 & 0x7F5D) & (0xFFFFBF6E & 0x7BFF));
        GameSettings.llIlIIIIIIIllI[367] = (-(0xFFFFFF09 & 0x2CF7) & (0xFFFFEDEF & 0x3F7B));
        GameSettings.llIlIIIIIIIllI[368] = (-(0xFFFFAFD7 & 0x7E3C) & (0xFFFFEF7F & 0x3FFF));
        GameSettings.llIlIIIIIIIllI[369] = (-(0xFFFFD4A1 & 0x7F5F) & (0xFFFFDDFD & 0x776F));
        GameSettings.llIlIIIIIIIllI[370] = (-(0xFFFFFFA3 & 0x565D) & (0xFFFFFFFE & 0x576F));
        GameSettings.llIlIIIIIIIllI[371] = (-(0xFFFFEBF1 & 0x7E0F) & (0xFFFFEF6F & 0x7BFF));
        GameSettings.llIlIIIIIIIllI[372] = (0xFFFFDD70 & 0x23FF);
        GameSettings.llIlIIIIIIIllI[373] = (0xFFFFA1F1 & 0x5F7F);
        GameSettings.llIlIIIIIIIllI[374] = (0xFFFFE17E & 0x1FF3);
        GameSettings.llIlIIIIIIIllI[375] = (0xFFFFF7F7 & 0x97B);
        GameSettings.llIlIIIIIIIllI[376] = (-(0xFFFFFF2F & 0x60DC) & (0xFFFFFD7F & 0x63FF));
        GameSettings.llIlIIIIIIIllI[377] = (0xFFFF8175 & 0x7FFF);
        GameSettings.llIlIIIIIIIllI[378] = (-(0xFFFFA7FD & 0x7C8B) & (0xFFFFF5FE & 0x2FFF));
        GameSettings.llIlIIIIIIIllI[379] = (-1 & 0x177);
    }
    
    private static void lIIlIIIlIIIIIIIl() {
        (llIIlIllIIIIII = new String[GameSettings.llIlIIIIIIIllI[379]])[GameSettings.llIlIIIIIIIllI[1]] = lIIIllIlIlllllII("OQUWESo4BkwfMD8mARkpM1sDDTE5", "VubxE");
        GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[2]] = lIIIllIlIlllllIl("27IrvzOsOiRpUc+SSu8NGDfOxL+8KgeY", "kxOtS");
        GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[3]] = lIIIllIlIlllllIl("1vz563warX5m0bQrvqPdrGGPA118/4yW", "ugfzo");
        GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[4]] = lIIIllIlIlllllIl("cLSWROc+b5e/EJpnCel7OHuXSnRonMos", "uOtor");
        GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[0]] = lIIIllIlIllllllI("Eu5vJsbKkD60ckNl7LnGEKjHe6Bv3oPX", "SKvpP");
        GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[5]] = lIIIllIlIllllllI("EAMVb2G85ONxHvKUNmQtyC4aAlNA5vF7JtlJfSfUBw4=", "uMmKB");
        GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[6]] = lIIIllIlIlllllIl("8/Dxz3Mxnm4hOEmNoJAmMNVdKOn6+zt/7zdIWBQfSDw=", "CUVwV");
        GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[7]] = lIIIllIlIllllllI("L2VLRBMBv2ndMYaEUlnojg==", "wIYoQ");
        GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[8]] = lIIIllIlIlllllII("DSAjGCAMI3kQIEw9Ph8=", "bPWqO");
        GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[9]] = lIIIllIlIlllllIl("rGwFhmxMX/Eq2mgvApMWhA==", "dLidT");
        GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[10]] = lIIIllIlIlllllII("DSkVCAMMKk8SGBA8AAxCATYMER4HKhIIAwx3DQ4b", "bYaal");
        GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[11]] = lIIIllIlIlllllII("Hj0jCBcfPnkSDAMoNgxWEiI6EQoUPiQIFx9jOgQcGDg6", "qMWax");
        GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[12]] = lIIIllIlIlllllIl("0n7MyI/G22cx/fZpyFF1Bxisa85T5mu2fD2Bq6puOtw=", "wlYVr");
        GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[13]] = lIIIllIlIlllllII("Jh0HCjknHl0QIjsIEg54KgUSF3gsAxIBOiwJXRAiOwgSDj8nCg==", "ImscV");
        GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[14]] = lIIIllIlIllllllI("Dv5vi8S9ci89C+yuRamPM8OPTCYi4NP3+yNbdBK1uguIBRwN2yMm8w==", "aNiQm");
        GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[15]] = lIIIllIlIllllllI("nCffkaLfVQM3X0b03Yi6yY0yBXQKIA360wT53MSnw0dBA4WpuxdZTg==", "bRgKR");
        GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[16]] = lIIIllIlIllllllI("/Wd3hQ7CEscIwknKZGu14EtcHNSYHkPkP4f9KRe9JKsgT5I0Bzs61g==", "xJGwT");
        GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[17]] = lIIIllIlIllllllI("Rf8aI6sgc/Z5hCqOpYwsyIOxb/STI3iWR2UcbzKGrxyeCh5VlFRHhw==", "JwXwU");
        GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[18]] = lIIIllIlIllllllI("CeYIcBS34WgZ7u+Xr4zaeHDOv7Xamkj1LQD9A9xSUCNfRdDNojd9xQ==", "ZTVpg");
        GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[19]] = lIIIllIlIlllllII("LjoRET0vOUsLJjMvBBV8LCMGJyYuLQIUN28nEAw3", "AJexR");
        GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[20]] = lIIIllIlIllllllI("EXkz0L6IepIO02+8C6Yslt94y8ZcOrMQKFXkxCSSwHs=", "bHnYQ");
        GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[21]] = lIIIllIlIllllllI("RCQCzjnlX9vl+n8SP+J3Bw==", "URVdG");
        GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[22]] = lIIIllIlIlllllIl("+GmEFRjQqjO7ovuFHBKlNWmq9aSpWDHr", "AxWdm");
        GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[23]] = lIIIllIlIlllllII("Gio8KCwbKWYmMRQqICggBnQuIC0WIw==", "uZHAC");
        GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[26]] = lIIIllIlIlllllIl("LLRLYxqzidk=", "OTpON");
        GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[27]] = lIIIllIlIlllllIl("R82hTztp83oDF/uRPbR1Yw==", "pCiWX");
        GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[28]] = lIIIllIlIlllllII("KBQAQysiBRwKJzEYHB5mLh4PCCUmHw0=", "CqymH");
        GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[29]] = lIIIllIlIlllllIl("kkmrs+k4aWdBM7QajXND0w==", "Duswk");
        GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[31]] = lIIIllIlIlllllII("KSsyWi4jOi4TIjAnLgdjLyE9ESAnID8=", "BNKtM");
        GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[32]] = lIIIllIlIlllllIl("CwUidi3XGsi6XnOmbfLvCg==", "Iebmc");
        GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[30]] = lIIIllIlIlllllII("Ki4MTQogPxAEBjMiEBBHLCQDBgQkJQE=", "AKuci");
        GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[33]] = lIIIllIlIllllllI("mDOrgKrO/2aBohOL/WxFHQ==", "fPRZF");
        GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[34]] = lIIIllIlIlllllIl("jsh+HdeU2xUpftFjMFdYMfZlXK9vkCsK", "ySeMh");
        GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[35]] = lIIIllIlIllllllI("CwoWrWqPIBlOoFCj/BWjow==", "ylSpX");
        GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[37]] = lIIIllIlIllllllI("6UesP8DSi+04f1UKWzCFEpHsdMizBHfG", "VtWGE");
        GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[38]] = lIIIllIlIlllllII("HxMgeTcaEzg8", "tvYWD");
        GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[40]] = lIIIllIlIlllllIl("jc940wxERfMLs6FlwEFGV+5cCpTKySmu", "DYuwI");
        GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[41]] = lIIIllIlIlllllII("HisjST4FPDMJOQ==", "uNZgM");
        GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[42]] = lIIIllIlIlllllIl("jcvJfbrgcrsVHkExqj+dSy6wuZ8gwjHK", "anFEX");
        GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[43]] = lIIIllIlIlllllIl("xSjtjDD3eqnhk4gGaSux4g==", "zufHz");
        GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[44]] = lIIIllIlIlllllII("EScQfyIbNgw2LggrDCJvEywfNC8OLRso", "zBiQA");
        GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[45]] = lIIIllIlIllllllI("OcNaR3ykFH4=", "dFpbk");
        GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[39]] = lIIIllIlIlllllII("Gh0AVBAQDBwdHAMRHAldFhkUHwMdGQA=", "qxyzs");
        GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[47]] = lIIIllIlIlllllIl("cjZvHauhzOowOOpoKfAu8Q==", "OYOhu");
        GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[48]] = lIIIllIlIlllllIl("iBME1AkWQlcweBhQkYumAxov8rX9M8ln", "rgJXf");
        GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[49]] = lIIIllIlIllllllI("X8696pwcpeKpAH223ShdYw==", "PDKrS");
        GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[51]] = lIIIllIlIllllllI("en8f+BxNdDQivzwDH/0bJb7n+nbUvllq", "JKSzW");
        GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[52]] = lIIIllIlIlllllII("AA8QTxoCCQIoHg4H", "kjiaj");
        GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[54]] = lIIIllIlIlllllII("ESEBdjAbMB0/PAgtHSt9HSUVPSMWJQE=", "zDxXS");
        GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[55]] = lIIIllIlIlllllIl("iyZC8++u+A0BR8bJ/hgJnQ==", "Zluam");
        GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[56]] = lIIIllIlIlllllII("HCY2RxQWNyoOGAUqKhpZGjYjHR4HLy4QEgU=", "wCOiw");
        GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[57]] = lIIIllIlIlllllII("Hj8jXCMZOyMXIRkzKQY=", "uZZrS");
        GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[58]] = lIIIllIlIlllllII("GgkjbxMQGD8mHwMFPzJeHBk2NRkBADs4FQM=", "qlZAp");
        GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[59]] = lIIIllIlIlllllII("Pyc/ZDc7LysrOjA=", "TBFJT");
        GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[60]] = lIIIllIlIllllllI("PkFCm/8Fkvct5h/3yA9TgKhPgHE24eZ5d++UYS4jAd8=", "OCpXj");
        GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[61]] = lIIIllIlIllllllI("r12bD73YRS8snpodzqjx7g==", "WfsVD");
        GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[63]] = lIIIllIlIlllllII("HQQrZgcXFTcvCwQINztKGwghKw==", "vaRHd");
        GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[36]] = lIIIllIlIlllllIl("KhiUNeNYdkHMBYkfUOpaiyq7t+t3T65K", "sVhZk");
        GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[65]] = lIIIllIlIlllllII("DSgDXigHOR8XJBQkHwNlCyQJEw==", "fMzpK");
        GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[66]] = lIIIllIlIlllllII("GA0vdhIeBzksCTAJOz0TEg==", "shVXa");
        GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[62]] = lIIIllIlIlllllII("CR8/ZjYDDiMvOhATIzt7DxM1Kw==", "bzFHU");
        GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[67]] = lIIIllIlIlllllII("AgwKSg4cBR8XCxsMFgo=", "iisdh");
        GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[69]] = lIIIllIlIllllllI("1FCuw09+FsnmZIBScoSK9+N9ggU8jvSk", "jAicK");
        GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[64]] = lIIIllIlIlllllIl("dwIcZC7Aw9HzpMuF9Hd3qLNCQ/qfTjuk", "plVTB");
        GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[70]] = lIIIllIlIllllllI("e80LygLp5PyIGFxRthJUzt75U+422m6u", "cpVwD");
        GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[71]] = lIIIllIlIlllllII("MQ0bQwEuGgcMHwkcAx8GCRwNHQ==", "Zhbmr");
        GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[72]] = lIIIllIlIllllllI("jctQQxQHx9ZkxIaSf3w/suzuFwPDeiKC", "MmUsz");
        GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[73]] = lIIIllIlIlllllII("Hz0cZxYAKgAoCCQ5EDoAITYVKBAHPQ==", "tXeIe");
        GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[74]] = lIIIllIlIllllllI("j3Yl7ce0TLyIsH8vAvWBAa27qs3iNn/Y", "sitik");
        GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[75]] = lIIIllIlIlllllII("LzUydjcwIi45KQc/JjUhNjMiOSg=", "DPKXD");
        GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[76]] = lIIIllIlIlllllIl("RwFWcRS22uAGlrAGdsZW6nzcP0dRHxMy", "jqqlV");
        GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[77]] = lIIIllIlIllllllI("w6vhhRDjHMhGnGO4EzkkH3qK6JRAdOcd", "XvUGN");
        GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[78]] = lIIIllIlIlllllIl("BhHEi/tLPSlpBxqrnq1w+ZYZJBajoc1I", "MCqJg");
        GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[79]] = lIIIllIlIlllllIl("tKfU8kYYBHSZWIVbZ8/FVQ==", "rkCwD");
        GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[80]] = lIIIllIlIlllllIl("NpAJoZIqKsWcjmdRBR4SHAUbPWSbcAMvE9qxaZWBeSs=", "ZTmCc");
        GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[81]] = lIIIllIlIlllllIl("obYJhLwTiyeEiVKM+RB0iw==", "ZcvaR");
        GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[82]] = lIIIllIlIlllllII("JDU3SQUuJCsACT05KxRIJj44Agg7Pzwe", "OPNgf");
        GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[83]] = lIIIllIlIlllllII("ADcuSj0EJjUFJ0Vh", "kRWdU");
        GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[84]] = lIIIllIlIllllllI("g8GzYCQ+CdCJ3v9UjWVlbrso5UO86ugX/gPX7T/Olm8=", "QmobN");
        GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[85]] = lIIIllIlIlllllIl("U1GkIcAWcPvlwEp3NvCeFA==", "RrWtm");
        GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[86]] = lIIIllIlIlllllIl("XppMTLFaY1NcxTusXCs5hMpK5xv6JlWqEVWgRjdSwS4=", "Gsadv");
        GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[87]] = lIIIllIlIlllllII("EyopXQIXOzISGFZ6", "xOPsj");
        GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[88]] = lIIIllIlIlllllII("CQM0ZiADEigvLBAPKDttCwg7LS0WCT8x", "bfMHC");
        GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[89]] = lIIIllIlIlllllIl("JAlVVYlsQ9Myar5JFH4vSQ==", "RpZif");
        GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[90]] = lIIIllIlIllllllI("xzTzVKp3zkIgEbTatvFiPk/fq5XBbs6wcreA5I40YxU=", "KSmxX");
        GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[91]] = lIIIllIlIllllllI("17Z7Z14jhwVWce+7UmMwqQ==", "kjXmT");
        GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[92]] = lIIIllIlIllllllI("t/ORCR2J8tM3cdhqTJ0wbr9piJMCkl23dxNpH87TAfk=", "Igmda");
        GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[68]] = lIIIllIlIlllllII("LCs2SBgoOi0HAml2", "GNOfp");
        GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[93]] = lIIIllIlIlllllIl("fOAq8vo0p4PiV96rQ99dMHDGBN7pi6zZ6NTHF+zxSxg=", "EjfVY");
        GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[94]] = lIIIllIlIlllllII("KQ09YQ4tHCYuFGxR", "BhDOf");
        GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[95]] = lIIIllIlIllllllI("e9I0wz+FDRTPONfesrVRRXvOWGi3atoHDGIzcEuKNpc=", "EjaBN");
        GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[96]] = lIIIllIlIllllllI("GyOKaUEmpSmFHVBi6hC2I7Zij/9oWEzs", "SMBzo");
        GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[97]] = lIIIllIlIllllllI("eE4N62TWVIVPj8rkNealqQ==", "KeZnR");
        GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[98]] = lIIIllIlIlllllII("Jxk3GzhIKh48CCNJFSACSDoxBy4NBw==", "hiRuK");
        GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[99]] = lIIIllIlIlllllIl("nV1W77FDjpKMS2kA14jh+A==", "KmJQD");
        GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[100]] = lIIIllIlIlllllII("PTw1FicMcwIUORojNxI/ACU3", "iSRqK");
        GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[101]] = lIIIllIlIllllllI("MS/VcE720Pss7JkJvwcmmQ==", "PxmfU");
        GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[102]] = lIIIllIlIlllllII("AhggPlgVGCs=", "XwOSx");
        GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[103]] = lIIIllIlIllllllI("UKf81h21g3qoa5e3FR+tgQ==", "hjFjZ");
        GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[104]] = lIIIllIlIlllllII("", "zwjIM");
        GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[105]] = lIIIllIlIllllllI("aHx/GD7Svu8=", "TRkzR");
        GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[106]] = lIIIllIlIlllllII("HTQuKD4cN3Q1KQY=", "rDZAQ");
        GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[107]] = lIIIllIlIllllllI("djVXxLllz+E=", "vcPdV");
        GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[108]] = lIIIllIlIllllllI("knl9HbSoM9AITQVFP6sIyw==", "XmCCt");
        GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[109]] = lIIIllIlIlllllIl("uFlIgccYrKLIko0kHC2C/IB3hvGzn64s", "hXozL");
        GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[110]] = lIIIllIlIlllllII("OC8oSxs2LCU=", "SJQew");
        GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[111]] = lIIIllIlIlllllIl("K7PJST4EsbyfSSY0gPXTViAU0yJEVWyP", "pJYoX");
        GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[112]] = lIIIllIlIlllllIl("E9tPBfweYJd1KcGXKxgSrw==", "akpXo");
        GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[113]] = lIIIllIlIllllllI("kz1OFeJ+wKvLaWUZj5piPnS198+Y02UC", "QZfXX");
        GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[114]] = lIIIllIlIllllllI("S8qANWhDP1S5Uk3EbH841Q==", "XgDAu");
        GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[115]] = lIIIllIlIlllllII("CQA3WBcDESsRGxAMKwVaDwo4ExkHCzo=", "beNvt");
        GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[116]] = lIIIllIlIlllllII("MiMOewksKwc=", "YFwUc");
        GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[117]] = lIIIllIlIllllllI("vbXIhzcEnaZukcFGGAL7LUnOQ2jlPq0v", "hYAhO");
        GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[118]] = lIIIllIlIlllllII("Iw8dajYmDwUv", "HjdDE");
        GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[119]] = lIIIllIlIllllllI("grj4wkqej+ml/gv8Dem7VN10cSTlzyZo", "SVNSw");
        GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[120]] = lIIIllIlIlllllII("GD0IewUDKhg7Ag==", "sXqUv");
        GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[121]] = lIIIllIlIlllllII("ATQ1TCsLJSkFJxg4KRFmBz46ByUPPzg=", "jQLbH");
        GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[122]] = lIIIllIlIlllllIl("bpkMk7nsw+Q26tWiCBMZAw==", "FbvqF");
        GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[123]] = lIIIllIlIlllllIl("T/aWQkToUEyH8L1WB3N5in80yhSfaRGjfUydZCrF8iA=", "UmEqk");
        GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[124]] = lIIIllIlIlllllIl("N8/1vBsRDhw=", "FGYou");
        GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[25]] = lIIIllIlIlllllII("IgMdYCgoEgEpJDsPAT1lLgcJKzslBx0=", "IfdNK");
        GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[125]] = lIIIllIlIlllllIl("EX5dSU3VTArRsymGR1N4Lw==", "QVIqr");
        GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[126]] = lIIIllIlIllllllI("AH+oDq1OYGDteElpAgPhfqEpXIL6sDIO", "lFCEZ");
        GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[127]] = lIIIllIlIlllllIl("KmHD+DqXPktmkVFZw+sdvg==", "ofUFM");
        GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[128]] = lIIIllIlIlllllIl("mdA07aD+R/pxobM2NQB4t+zD32PUIg3I", "brCno");
        GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[129]] = lIIIllIlIllllllI("OQFixb19MUeVSE1+p0LkLw==", "jJYeO");
        GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[130]] = lIIIllIlIllllllI("Pg2lXF9Rskj/VbFh18JENuM60XrAl0X3", "xfCEc");
        GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[131]] = lIIIllIlIllllllI("0mQ2oGNP+0iMDfFtg2LuMA==", "xOCHB");
        GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[132]] = lIIIllIlIllllllI("YZR54iB8x3UW9duI1jzgyysva2NP+i7NT+5/Nj1sWi0=", "WTTtC");
        GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[133]] = lIIIllIlIlllllIl("6fSDXkx5a5/zbJDLhYZ1Gg==", "xlNsE");
        GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[134]] = lIIIllIlIlllllIl("1dwi0/AKtQLvSI3am47f+JLW+irut9Ncb7FH85k8V0E=", "bLhgF");
        GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[135]] = lIIIllIlIlllllII("Cj0SWikONQYVJAU=", "aXktJ");
        GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[136]] = lIIIllIlIlllllII("IQoMWgIrGxATDjgGEAdPJxoZAAg6AxQNBDg=", "Jouta");
        GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[137]] = lIIIllIlIlllllII("GSMDQRIRNB8KDwEuFRs=", "rFzoa");
        GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[138]] = lIIIllIlIllllllI("Z4fRVtbMshlvJx8YPuUev6GaU5mmHHOR", "TBVeU");
        GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[139]] = lIIIllIlIlllllIl("X2PgP//7mNhP41MqeuP3kbL8QJ6Kzw8q", "nWsYi");
        GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[140]] = lIIIllIlIllllllI("ZCZYVLCK8hPrrq2UMvBK1g1FzFw/zvC7", "IUPpw");
        GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[141]] = lIIIllIlIlllllIl("5eQ+6M5mi8OOFJUWQx0l4ZAB3ub+t3nf", "PvoOz");
        GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[142]] = lIIIllIlIlllllII("KCYrTyYiNzcGKjEqNxJrLiohAg==", "CCRaE");
        GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[143]] = lIIIllIlIlllllIl("TMqeRhKCvF4YnayZvU064w==", "SXdOW");
        GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[144]] = lIIIllIlIlllllII("Ki00eAIgPCgxDjMhKCVPLCE+NQ==", "AHMVa");
        GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[145]] = lIIIllIlIlllllIl("Oy+9lexpi2rP5zS/f6sDDYujH4ISncWj", "Vykcy");
        GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[146]] = lIIIllIlIlllllII("HwYXbBYVFwslGgYKCzFbGQodIQ==", "tcnBu");
        GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[147]] = lIIIllIlIllllllI("HdJ3NeLViACE5sug5+IxBqIi0bLLDBng", "GWjkr");
        GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[148]] = lIIIllIlIllllllI("jisCkJHYK0mXgHGR7H+bvlGJY9qx89DR", "KvbDC");
        GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[149]] = lIIIllIlIlllllIl("UpujG/EKizI0V04XoIdnKRoxohnhxfAL", "ExquD");
        GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[150]] = lIIIllIlIlllllIl("7Wam2DuJW6YHUgVBXBLJYVmu/LvZOC0h", "wCEee");
        GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[151]] = lIIIllIlIlllllIl("AnfA+iNUK8CmDQ82hYwNUhMlsIklUZ/W", "deVKT");
        GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[152]] = lIIIllIlIlllllIl("eOhnZPAmZrzTIisnRrFBceSFClCI6tYe", "QEStm");
        GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[153]] = lIIIllIlIllllllI("m/Mq2Xu6nxYTqZvPDMNAh1v/Bh1vlo6o", "FUPWH");
        GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[154]] = lIIIllIlIllllllI("gQDKA/q9Y5B0sdvPkG+UFoJk/U6VrmuD", "wIjXA");
        GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[155]] = lIIIllIlIlllllIl("sP2YFseyOIFnchh16ywB7g==", "WrrcH");
        GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[156]] = lIIIllIlIllllllI("SVX/i9HtalIS1mIFKCjeSKySgCzgwXgRbCUcW2i8VI0=", "ybIhX");
        GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[157]] = lIIIllIlIlllllIl("aYKZT8sMN7+ZZ1HNR52xNQ==", "rjBIa");
        GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[158]] = lIIIllIlIlllllII("AzcDaBoJJh8hFho7HzVXATwMIxccPQg/", "hRzFy");
        GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[159]] = lIIIllIlIlllllII("OgIvSz0+EzQEJ39U", "QgVeU");
        GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[160]] = lIIIllIlIlllllIl("EEUM6gbZU+TC+kyKOFZoyNgzw/DlnGzZokfrbeAdt3A=", "jHNAa");
        GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[161]] = lIIIllIlIlllllII("Eh0weTgWDCs2IldM", "yxIWP");
        GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[162]] = lIIIllIlIlllllII("LD8LWSQmLhcQKDUzFwRpLjQEEikzNQAO", "GZrwG");
        GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[163]] = lIIIllIlIllllllI("ImfBEyjmYMPENbSx40WYBg==", "CGjOE");
        GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[164]] = lIIIllIlIllllllI("6h97km5FlwxNrX9nO4wQFjrE7OCBxIi/XBtUuGgLr3k=", "hCFfn");
        GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[165]] = lIIIllIlIllllllI("YDSDeQHRoADfFn7qBF6J5A==", "dIOtc");
        GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[166]] = lIIIllIlIlllllII("DgQjdg0EFT8/ARcIPytADA8sPQARDigh", "eaZXn");
        GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[167]] = lIIIllIlIlllllII("Lg0WdDkqHA07I2tf", "EhoZQ");
        GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[168]] = lIIIllIlIllllllI("fvY+f7+VjhLf05BdMeER/gXyyvlKuq3TPqIDik2BzAQ=", "wbatC");
        GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[169]] = lIIIllIlIlllllII("JAkBRj0gGBoJJ2FU", "OlxhU");
        GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[170]] = lIIIllIlIlllllII("PzEdZCw1IAEtICY9ATlhPToSLyEgOxYz", "TTdJO");
        GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[171]] = lIIIllIlIlllllIl("ULDRh2vt/sNAVmV4YT0bhw==", "tkfip");
        GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[172]] = lIIIllIlIlllllII("HgQobzUUFTQmOQcINDJ4HA8nJDgBDiM4", "uaQAV");
        GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[173]] = lIIIllIlIllllllI("mwErmsrOTCggLvLsyMI+cTie9hAfXQub", "PNdFL");
        GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[174]] = lIIIllIlIllllllI("FQc9LN8fCJSCWri+nIwJJQ==", "DBhAT");
        GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[175]] = lIIIllIlIllllllI("xmt0/RLaPJPyTPKGc9AfJB687iD8DeZT", "TSxDz");
        GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[176]] = lIIIllIlIllllllI("1Sp7q1ofwHB0ZK1c2V+Bpw==", "ILaIO");
        GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[177]] = lIIIllIlIlllllII("Ah0kEjkzUhMQJyUCJhYhPwQm", "VrCuU");
        GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[178]] = lIIIllIlIlllllIl("OO1HsL0YoByO90vXepcMow==", "DkjsE");
        GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[179]] = lIIIllIlIlllllII("CjsWLksdOx0=", "PTyCk");
        GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[180]] = lIIIllIlIlllllIl("hmiQRTiXU53npOpETAf/og==", "uiInB");
        GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[181]] = lIIIllIlIlllllII("", "GhzXW");
        GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[182]] = lIIIllIlIllllllI("WcPwxcQ1V7E=", "JgDAA");
        GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[183]] = lIIIllIlIllllllI("OmZ0+KEs8NYso3z8idG2oA==", "luoZD");
        GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[185]] = lIIIllIlIllllllI("PXVmcG5ZoME=", "IoHjW");
        GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[186]] = lIIIllIlIllllllI("jOPVEI6sLqE=", "VFakV");
        GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[187]] = lIIIllIlIlllllII("CBIVEDYJEU8KPAkRCA0wEQsVAHcKCw8=", "gbayY");
        GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[188]] = lIIIllIlIllllllI("vXiUq04j1ueZXmrl+DemKo7wBCGG+G90", "PPdca");
        GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[189]] = lIIIllIlIlllllII("bg==", "KhePl");
        GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[190]] = lIIIllIlIlllllII("DSgXHQsMK00SCxR2Dh0K", "bXctd");
        GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[191]] = lIIIllIlIlllllII("IwIHBw4iAV0IDjpcHg8Z", "Lrsna");
        GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[192]] = lIIIllIlIlllllII("JRUMOCQkFlY3OSsIHSMqPgA0OCYjEVY8KjI=", "JexQK");
        GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[193]] = lIIIllIlIllllllI("kkyUHixwG6g=", "OwSks");
        GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[194]] = lIIIllIlIlllllII("OBEmDRc5EnwHFDgUNiwdPgY6EFY6CDw=", "WaRdx");
        GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[195]] = lIIIllIlIllllllI("+1YnOUujToAXyE4zaqdFOhbN2OqgL0Mz", "waPQP");
        GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[196]] = lIIIllIlIlllllIl("vVuR98mHHRyUOh1z3gaACDkdqQ6Mskqg", "IMXhu");
        GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[197]] = lIIIllIlIllllllI("9paMQlbbQcs=", "uoeLJ");
        GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[198]] = lIIIllIlIlllllIl("3WFmAp63Aj0=", "oQAEh");
        GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[199]] = lIIIllIlIllllllI("FFKIqyfImEY=", "saiLp");
        GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[200]] = lIIIllIlIllllllI("llh2R29aQN8=", "pdWvQ");
        GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[201]] = lIIIllIlIlllllII("ES4=", "aVCIR");
        GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[202]] = lIIIllIlIlllllIl("+jFXxIBNTbo=", "lkAit");
        GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[203]] = lIIIllIlIlllllIl("yLM8fkswEIw=", "Zghay");
        GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[204]] = lIIIllIlIlllllII("ThItHDoFAg==", "nqEiT");
        GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[205]] = lIIIllIlIlllllIl("Z33h4qyJ3y+9JpsQlHanDw==", "SkODf");
        GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[206]] = lIIIllIlIlllllII("ayIKNw==", "KDzDK");
        GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[207]] = lIIIllIlIllllllI("bp6vsZSRo08=", "rgdaU");
        GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[208]] = lIIIllIlIllllllI("wRnO09QnpeGdBGNaR0wwag==", "JIbYb");
        GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[209]] = lIIIllIlIllllllI("Ro0RH94wTiHgspz4Xvlm/w==", "cdTcb");
        GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[210]] = lIIIllIlIlllllII("bg==", "KnGVj");
        GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[211]] = lIIIllIlIlllllIl("Nasfq1gR/jcDGWjHmn21WQ==", "PKEKi");
        GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[212]] = lIIIllIlIlllllIl("ZiSmbdBibnfdey/d/5Jp8A==", "BLcGL");
        GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[213]] = lIIIllIlIllllllI("6I3Dvdj408XmSbWhOTmCjnFxw4DkWLr9", "WjZvT");
        GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[214]] = lIIIllIlIlllllII("BBsgMCgFGHo+NQobPDAkGEUyODQf", "kkTYG");
        GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[215]] = lIIIllIlIlllllIl("DGtm0ISbDVYU0ruRFPCZ2bS6ladjeqYm", "dwaDn");
        GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[216]] = lIIIllIlIlllllII("", "YjEog");
        GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[217]] = lIIIllIlIllllllI("gOdu+KThTWc=", "MpClB");
        GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[218]] = lIIIllIlIlllllII("GwU9FyolDyYXJgIDPg07Dw==", "vjHdO");
        GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[219]] = lIIIllIlIlllllII("IDYF", "FYsny");
        GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[220]] = lIIIllIlIlllllIl("VOoTNZhPlqw=", "yZPFc");
        GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[221]] = lIIIllIlIlllllII("Cjk5EiAYLCQIPA==", "yXMgR");
        GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[222]] = lIIIllIlIlllllII("OgYXASAnMSwLJyAN", "ShadR");
        GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[223]] = lIIIllIlIllllllI("g8Pt1B8UJRI=", "xuIyt");
        GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[224]] = lIIIllIlIlllllII("ETMJCQEREg4eEAI4BAg=", "cVgmd");
        GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[225]] = lIIIllIlIllllllI("rI1dhIIVXGlBpyt6+63Rmg==", "wErJM");
        GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[226]] = lIIIllIlIlllllII("BDs3GD4XNiAf", "tZElW");
        GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[227]] = lIIIllIlIlllllII("KiglMQYtMA==", "HGGgo");
        GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[228]] = lIIIllIlIllllllI("G6xO8loPzEI=", "uPIyE");
        GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[229]] = lIIIllIlIlllllIl("4f067psudPNCVewIIyqcug==", "KfsbN");
        GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[230]] = lIIIllIlIllllllI("ssjU6CcNF94=", "xQvMo");
        GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[231]] = lIIIllIlIlllllIl("qMHNi173COg=", "HESim");
        GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[232]] = lIIIllIlIlllllII("ASo4ECEGKjsw", "gHWUO");
        GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[233]] = lIIIllIlIlllllIl("594lw+fkJ0o=", "MqKGn");
        GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[234]] = lIIIllIlIllllllI("tbuzDcOAdfoG7xUgWHU+iA==", "TjLFP");
        GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[235]] = lIIIllIlIlllllII("FTMkIRc0ICsyBhoxOQ==", "sRJBn");
        GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[236]] = lIIIllIlIllllllI("ryW/MDN400E=", "NzPRm");
        GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[237]] = lIIIllIlIlllllIl("eR2YUQqrMKg=", "frJkl");
        GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[238]] = lIIIllIlIlllllII("FjkbHw==", "bKnzQ");
        GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[239]] = lIIIllIlIllllllI("6L/7/DW68u4=", "UjerL");
        GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[240]] = lIIIllIlIlllllIl("9gEBb1Sx4BG+kJ0mTcZ3cQ==", "xpwRS");
        GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[241]] = lIIIllIlIlllllIl("609crl0BzXA=", "WLdED");
        GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[242]] = lIIIllIlIlllllII("KxM+NAY=", "MrRGc");
        GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[243]] = lIIIllIlIlllllII("LA0eIw==", "JlmWh");
        GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[244]] = lIIIllIlIllllllI("IL2w9O2Tn4PbPpvHdaIwnA==", "UegFU");
        GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[245]] = lIIIllIlIlllllII("OAMIKiUhDB8sKj0IOSA7PhgZJi0BDAguOw==", "QmkEH");
        GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[246]] = lIIIllIlIlllllIl("2XqHYIc80DjLkqt4DMkDOw==", "hgiBu");
        GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[247]] = lIIIllIlIlllllII("OQ4ZCg==", "UowmM");
        GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[248]] = lIIIllIlIlllllIl("jf7x/GVGLUYZ9eDy3JPQsQ==", "rDujh");
        GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[249]] = lIIIllIlIlllllII("AikZJRIOLRcjIg==", "aAxQQ");
        GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[250]] = lIIIllIlIllllllI("ObwT9/17yqc=", "ADIGt");
        GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[251]] = lIIIllIlIllllllI("hk2rCoa8G2PE5f7l2kpnbw==", "RyMkG");
        GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[252]] = lIIIllIlIllllllI("ULUYWPDnKKU=", "sGEXA");
        GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[253]] = lIIIllIlIlllllII("JC4uJTkuKCQiJTUpIiEB", "GFOQu");
        GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[254]] = lIIIllIlIllllllI("ZA/s5GjHADg=", "GhlmJ");
        GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[255]] = lIIIllIlIlllllIl("TnIeWoJ3OVoF2lgFYmtpKQ==", "Ixnyg");
        GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[256]] = lIIIllIlIllllllI("7heiM3+A217HPtavbE/eSg==", "Hllqh");
        GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[257]] = lIIIllIlIlllllII("PAMGMA==", "HqsUS");
        GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[258]] = lIIIllIlIllllllI("hFOS4FncsWK7wVIsQGZnEw==", "zrNhv");
        GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[259]] = lIIIllIlIllllllI("gZkuWJMl1xo=", "zxYdb");
        GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[260]] = lIIIllIlIllllllI("inWBT5RkWIqJSumqkuCnAg==", "XzhMV");
        GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[184]] = lIIIllIlIllllllI("RCIfjlz3Brk=", "Xcqgg");
        GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[261]] = lIIIllIlIlllllIl("53LGUhb6bJI=", "bWGqF");
        GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[262]] = lIIIllIlIllllllI("rFLrZVKxmos=", "zrWbo");
        GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[263]] = lIIIllIlIlllllII("IT0IIRssJhohOggwCDYtOic=", "ITlDH");
        GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[264]] = lIIIllIlIlllllII("Ej4eCw==", "fLknQ");
        GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[265]] = lIIIllIlIlllllII("NgAkFTw0ATY9JjIJBhs9OxA7BCE=", "WdRtR");
        GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[266]] = lIIIllIlIlllllII("EQYmKA==", "etSMM");
        GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[267]] = lIIIllIlIlllllIl("DRjnnGMCvu1vZNO7RTXrHCnWm9AEqjTF", "TzkLR");
        GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[268]] = lIIIllIlIlllllIl("9HhdnBJbhc4=", "SlOZj");
        GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[269]] = lIIIllIlIllllllI("YpEH3Gkdh6oqfzHFleXbIA==", "DsRZI");
        GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[270]] = lIIIllIlIlllllIl("xk75xqje4L0=", "tnXwy");
        GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[271]] = lIIIllIlIlllllII("CDQNOQYOJg0DEQ4lAD8=", "gBhKt");
        GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[272]] = lIIIllIlIllllllI("eFhjLc+xAVtJz9l6hGUlJg==", "uytYM");
        GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[273]] = lIIIllIlIllllllI("TbHnZGgbTw/jnYwr2N82evXaBIC2FWSK", "nHRuy");
        GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[274]] = lIIIllIlIlllllII("EjM7Ag==", "fANgW");
        GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[275]] = lIIIllIlIlllllII("DBALOQwKEQ0lMCkXCTg3Chw=", "oxjMD");
        GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[276]] = lIIIllIlIlllllII("DD0MBDoKPAoYBjo7Cx8RGiYIFA==", "oUmpr");
        GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[277]] = lIIIllIlIllllllI("armjYbeBmRHwwwmrhRJm4Q==", "idbkJ");
        GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[278]] = lIIIllIlIlllllIl("nhk7rcrqHvWm72DX2aooPQ==", "eLfuD");
        GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[279]] = lIIIllIlIllllllI("euwga5DbNNrkuTdP4qwFrfbSxavlM1qgmvmSuaqIpnA=", "uMYrf");
        GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[280]] = lIIIllIlIlllllII("MD8AJA==", "DMuAI");
        GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[281]] = lIIIllIlIlllllII("HAYeLikBIws1LR0c", "qonCH");
        GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[282]] = lIIIllIlIlllllII("Fzs2FicJDT0HIxcfIQEWDTchHw==", "dODsF");
        GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[283]] = lIIIllIlIllllllI("1NtrSAdejsboIxhutegooQ==", "MdVyk");
        GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[284]] = lIIIllIlIlllllII("JjwxLDM4Gzo6JjAlFSY+ICUm", "UHCIR");
        GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[285]] = lIIIllIlIllllllI("85LK4/1EjhxJogorW+KDTg==", "nnPzr");
        GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[286]] = lIIIllIlIlllllII("NxcBBgkpJQMQ", "Dcsch");
        GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[287]] = lIIIllIlIlllllII("ARUBPBsfIhw0CgAEACoTHQ8=", "rasYz");
        GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[288]] = lIIIllIlIlllllIl("Gf9Y5FP33McVUkjsUeDyRriHG/f8nWwS", "Vjdym");
        GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[289]] = lIIIllIlIlllllII("ORgsHA==", "MjYyY");
        GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[290]] = lIIIllIlIlllllII("NzMHPxgpFwc/HyE1Bz8dFyIHLBw2", "DGuZy");
        GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[291]] = lIIIllIlIlllllII("ECM1AS0OFC8FOCY5JgYgBjM=", "cWGdL");
        GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[292]] = lIIIllIlIllllllI("jw0Pm0zkjAE1YjXPNFx7cBF+wc6MyNH3", "zVIRS");
        GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[293]] = lIIIllIlIlllllII("OjA9ChIkCSYMJyYjKAMWCyEnDgUgKz0=", "IDOos");
        GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[294]] = lIIIllIlIlllllII("Ej8KBhAhPhEGGhA1PgobAA==", "tPxeu");
        GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[295]] = lIIIllIlIllllllI("7p7eTPMZ/M0=", "GSQwu");
        GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[296]] = lIIIllIlIllllllI("tAmNIJ5Ox4hW+NRJmUdVA60v0gr/QcoJ", "CwOnM");
        GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[297]] = lIIIllIlIllllllI("f3oZrk+yCv8=", "dyGDv");
        GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[298]] = lIIIllIlIlllllII("BiowDQYRKxAdBwEoHRYDGw==", "tOTxe");
        GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[299]] = lIIIllIlIllllllI("8ddXRh48uZ8=", "BdRsm");
        GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[300]] = lIIIllIlIlllllIl("5xKwG3vME4zOAqlDUzTCsIatS/+dq16N", "NQscc");
        GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[301]] = lIIIllIlIlllllIl("2J5KoFUYDhQ=", "qWwSQ");
        GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[302]] = lIIIllIlIlllllII("ICkEMwU8FBg7FSowAw==", "EGpZq");
        GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[303]] = lIIIllIlIlllllII("JwIyCQ==", "SpGlX");
        GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[304]] = lIIIllIlIllllllI("O0rxI9Sffkc=", "HOcYt");
        GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[305]] = lIIIllIlIlllllII("JwQnBh0XCiYNHjsZKzc=", "TkRhy");
        GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[306]] = lIIIllIlIlllllIl("06fcnMsMScph8RQNjjo2zg==", "gNmwh");
        GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[307]] = lIIIllIlIlllllIl("xw/PAyiX7os=", "mMVLr");
        GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[308]] = lIIIllIlIlllllIl("8YDoTzJIA2iiVuxZx9mHecnJBfxiQSkX", "KBOvz");
        GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[309]] = lIIIllIlIllllllI("NJrUTMNsgvnUPklupSd0XfDTmPpVQNNT", "evDat");
        GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[310]] = lIIIllIlIllllllI("oCuCB9mk/9g=", "cCAOs");
        GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[311]] = lIIIllIlIllllllI("8uxbo427MeM=", "dhfPI");
        GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[312]] = lIIIllIlIlllllIl("CyowypKSzwIGdwdX8ARhhg==", "Oqrku");
        GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[313]] = lIIIllIlIllllllI("TCF+TE+a4rk1lxyOLGs5ufPe93kbHBwQ", "qjjqn");
        GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[314]] = lIIIllIlIlllllIl("kSSwTacuDfY=", "FTrCa");
        GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[315]] = lIIIllIlIllllllI("rE81XZqaMh0=", "CMZFu");
        GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[316]] = lIIIllIlIlllllIl("NcS3weaZaDsuovJRoDwQjw==", "WBjHZ");
        GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[317]] = lIIIllIlIlllllII("KAM8BiYoIjsRNzsIMQd5", "ZfRbC");
        GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[318]] = lIIIllIlIllllllI("1nMx0DqDJ+wgd9HzK8dJdA==", "jjMMx");
        GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[319]] = lIIIllIlIlllllIl("5apdFhvcQO6jyoO5zQQxZA==", "ApwrW");
        GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[320]] = lIIIllIlIlllllIl("jhktBIJBptPVDQa2Mguknw==", "zWysk");
        GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[321]] = lIIIllIlIlllllII("MAciNj0oGStiNWs=", "QiCQQ");
        GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[322]] = lIIIllIlIlllllII("BTkNPz4bYg==", "hXuyN");
        GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[323]] = lIIIllIlIllllllI("3fs0u6NhebcZjYFjfMQreA==", "wetQA");
        GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[324]] = lIIIllIlIlllllII("PTkuLTk6JSQ/KWM=", "YPHKP");
        GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[325]] = lIIIllIlIlllllII("Hg8MOhw/HAMpDRENEWM=", "xnbYe");
        GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[326]] = lIIIllIlIlllllII("Cj1w", "kRJMr");
        GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[327]] = lIIIllIlIllllllI("oJp27gJVjntYZX5K/eFGsjuIbGH8RZ1M", "reRYA");
        GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[328]] = lIIIllIlIllllllI("89j9CWrF8YtoBSg8UNNwVxVCgCDhii75", "jUpuE");
        GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[329]] = lIIIllIlIllllllI("BkJDJEECz03AGCl9G1JEeFtFOC3M6uI3", "EzuKi");
        GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[330]] = lIIIllIlIlllllII("PhwcLCQ+GgoTMC8SHHk=", "LyoCQ");
        GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[331]] = lIIIllIlIlllllII("KBcpNxcxGD4xGC0cGD0JLgw4Ox8RGCkzCXs=", "AyJXz");
        GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[332]] = lIIIllIlIlllllII("JyIZORUuMRwoNHE=", "KCjMF");
        GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[333]] = lIIIllIlIlllllIl("HECjx4toK3w=", "bFOcT");
        GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[334]] = lIIIllIlIlllllIl("ownTQbiQh21kBbBkcsOzvA==", "xLkxz");
        GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[335]] = lIIIllIlIlllllII("KzwOLTAnOAArAHI=", "HToYs");
        GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[336]] = lIIIllIlIllllllI("ke/zfZEIIbsEx6R8xvMcgQ==", "yegjK");
        GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[337]] = lIIIllIlIlllllIl("WpOyGetHYiIjF15p1bPqKE8t9HUy2Hm1", "YZFLI");
        GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[338]] = lIIIllIlIllllllI("2cR7Y+JcC7oEiKvPunrsXQ==", "nOveU");
        GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[339]] = lIIIllIlIlllllIl("jHAcdU2fiMqX7Qj7ZSSXBw==", "kulOm");
        GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[340]] = lIIIllIlIlllllIl("ptltPyiKb6RzO/y3aL8FiQ==", "LZMsd");
        GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[341]] = lIIIllIlIlllllII("FA82JxQUNyQ8FhJb", "qaWEx");
        GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[342]] = lIIIllIlIllllllI("FKpeRziQF78=", "WfPnr");
        GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[343]] = lIIIllIlIllllllI("xV99wZBUY1/2oC/oly5Df3oQQCFYmb/3", "fygDy");
        GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[344]] = lIIIllIlIllllllI("c8ROBBalrIulyzm8yp4wzu8twnP/rX62", "wFaug");
        GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[345]] = lIIIllIlIlllllIl("E4r5W/CfJDFSps06PHBVYyW4rFqODUUn", "VPlWO");
        GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[346]] = lIIIllIlIlllllIl("oiR3dqqK7Ir8On9qChUMYw==", "sDSsK");
        GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[347]] = lIIIllIlIlllllIl("0cu29Ze3XbHtwFUnPGSbow==", "CcYWr");
        GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[348]] = lIIIllIlIlllllII("LD4UNQAqLBQPFyovGTNI", "CHqGr");
        GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[349]] = lIIIllIlIlllllIl("Vf2E+4xZs+3Z8LqmjhrDWeQiWN1K4IA2", "OVyty");
        GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[350]] = lIIIllIlIllllllI("WhW6MrwTMzoBSnuGQ2/VqksVDdeQ176V", "abjRo");
        GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[351]] = lIIIllIlIlllllIl("+xkT3FdPcXTojUEaaXEcIvIh9zaiwejz", "ZFXTG");
        GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[352]] = lIIIllIlIllllllI("IEaUN548OdLjBqbAItBwGg==", "oEOpp");
        GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[353]] = lIIIllIlIlllllIl("6QKG6GknnAWb/WWv5/p1vw==", "zfiqw");
        GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[354]] = lIIIllIlIlllllIl("9qe1ZFWU72PrEsacSpWklJ1Lpp1Kh8ZFPOF+Ao7aZoM=", "raaGz");
        GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[355]] = lIIIllIlIlllllIl("YDwGZWGAWPgqhIWCJLP85Q==", "TPvAI");
        GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[356]] = lIIIllIlIllllllI("Orh5McCwwfc7hgbca+CjjZtq9c69PstH", "yKKjS");
        GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[357]] = lIIIllIlIllllllI("Dk2TSTCgbWWVlzrYu2pQVOyPAQFUkFe6", "QhFEF");
        GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[358]] = lIIIllIlIlllllII("BwcACSsZIAsfPhEeJAMmAR4XVg==", "tsrlJ");
        GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[359]] = lIIIllIlIlllllIl("nw7bYykVygAVCQNDg59xtA==", "opaWz");
        GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[360]] = lIIIllIlIllllllI("GyEOwXn7nXuJpK3xApX7NQ==", "fbtvL");
        GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[361]] = lIIIllIlIlllllII("OxoXNSolLQo9OzoLFiMiJwBf", "HnePK");
        GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[362]] = lIIIllIlIlllllII("IDs8HTI+HCsWNx4qOhk3MjsvQg==", "SONxS");
        GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[363]] = lIIIllIlIlllllIl("OqBCEBBbtY/CRxFraoxvLdcL8vjodJJH", "Pqmyk");
        GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[364]] = lIIIllIlIllllllI("H9B6LFlU6JYN+nV3cLJakJU2XSMDFyDb", "QGIGN");
        GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[365]] = lIIIllIlIllllllI("low9kOtyCEcY/m7pYnibX/vHIy9T5izn", "SXpRt");
        GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[366]] = lIIIllIlIllllllI("l/60YZDlITRjLv/dstIHlO7AQdcsWMtJ+agYu2rPKQA=", "cyAot");
        GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[367]] = lIIIllIlIllllllI("0CJaLoFa/zm0/2PFUuh5CJeJQB4uxUeR", "OlBvE");
        GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[368]] = lIIIllIlIllllllI("44AqIPHqLBaUMPOvUl7SCIrw1WwX2NbY", "LKOKb");
        GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[369]] = lIIIllIlIllllllI("f+BYangLJ3ZZa+HEIVAa9H0YVnaAVy/6", "Gfafe");
        GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[370]] = lIIIllIlIlllllII("HQQUOyscHgcQHhoWHwY6BwUFTw==", "hwquJ");
        GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[371]] = lIIIllIlIllllllI("DJ/dvTx6FdYubk99Jf6qKQ==", "JcTlq");
        GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[372]] = lIIIllIlIlllllIl("AJBNJVXpbkE=", "NVdnj");
        GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[373]] = lIIIllIlIlllllIl("gZhSDXbAR3o=", "KWjdA");
        GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[374]] = lIIIllIlIlllllII("PAwlAhcMAiQJFCARKTM=", "OcPls");
        GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[375]] = lIIIllIlIlllllII("bA==", "VjBwt");
        GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[376]] = lIIIllIlIlllllII("ARolICU8FDMxFg==", "luAEI");
        GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[377]] = lIIIllIlIlllllIl("LWMus9WfnM0=", "logKE");
        GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[378]] = lIIIllIlIllllllI("B6jVPTvxG4gfNF0byjcu8DMOMvWYehXS", "MEiIo");
    }
    
    public void setOptionFloatValue(final Options llllllllllllIllIllIllllIllllIIII, final float llllllllllllIllIllIllllIlllIllll) {
        if (lIIlIIIlIIIIlIlI(llllllllllllIllIllIllllIllllIIII, Options.SENSITIVITY)) {
            this.mouseSensitivity = llllllllllllIllIllIllllIlllIllll;
        }
        if (lIIlIIIlIIIIlIlI(llllllllllllIllIllIllllIllllIIII, Options.FOV)) {
            this.fovSetting = llllllllllllIllIllIllllIlllIllll;
        }
        if (lIIlIIIlIIIIlIlI(llllllllllllIllIllIllllIllllIIII, Options.GAMMA)) {
            this.gammaSetting = llllllllllllIllIllIllllIlllIllll;
        }
        if (lIIlIIIlIIIIlIlI(llllllllllllIllIllIllllIllllIIII, Options.FRAMERATE_LIMIT)) {
            this.limitFramerate = (int)llllllllllllIllIllIllllIlllIllll;
        }
        if (lIIlIIIlIIIIlIlI(llllllllllllIllIllIllllIllllIIII, Options.CHAT_OPACITY)) {
            this.chatOpacity = llllllllllllIllIllIllllIlllIllll;
            this.mc.ingameGUI.getChatGUI().refreshChat();
        }
        if (lIIlIIIlIIIIlIlI(llllllllllllIllIllIllllIllllIIII, Options.CHAT_HEIGHT_FOCUSED)) {
            this.chatHeightFocused = llllllllllllIllIllIllllIlllIllll;
            this.mc.ingameGUI.getChatGUI().refreshChat();
        }
        if (lIIlIIIlIIIIlIlI(llllllllllllIllIllIllllIllllIIII, Options.CHAT_HEIGHT_UNFOCUSED)) {
            this.chatHeightUnfocused = llllllllllllIllIllIllllIlllIllll;
            this.mc.ingameGUI.getChatGUI().refreshChat();
        }
        if (lIIlIIIlIIIIlIlI(llllllllllllIllIllIllllIllllIIII, Options.CHAT_WIDTH)) {
            this.chatWidth = llllllllllllIllIllIllllIlllIllll;
            this.mc.ingameGUI.getChatGUI().refreshChat();
        }
        if (lIIlIIIlIIIIlIlI(llllllllllllIllIllIllllIllllIIII, Options.CHAT_SCALE)) {
            this.chatScale = llllllllllllIllIllIllllIlllIllll;
            this.mc.ingameGUI.getChatGUI().refreshChat();
        }
        if (lIIlIIIlIIIIlIlI(llllllllllllIllIllIllllIllllIIII, Options.MIPMAP_LEVELS)) {
            final int llllllllllllIllIllIllllIlllIlllI = this.mipmapLevels;
            this.mipmapLevels = (int)llllllllllllIllIllIllllIlllIllll;
            if (lIIlIIIlIIIIIlII(lIIlIIIlIIIIlIIl((float)llllllllllllIllIllIllllIlllIlllI, llllllllllllIllIllIllllIlllIllll))) {
                this.mc.getTextureMapBlocks().setMipmapLevels(this.mipmapLevels);
                this.mc.getTextureManager().bindTexture(TextureMap.locationBlocksTexture);
                final TextureMap textureMapBlocks = this.mc.getTextureMapBlocks();
                final int llllllllllllIlIllllIIlIllIIIllIl = GameSettings.llIlIIIIIIIllI[1];
                int llllllllllllIlIllllIIlIllIIIIlll;
                if (lIIlIIIlIIIIlIll(this.mipmapLevels)) {
                    llllllllllllIlIllllIIlIllIIIIlll = GameSettings.llIlIIIIIIIllI[2];
                    "".length();
                    if (-"  ".length() > 0) {
                        return;
                    }
                }
                else {
                    llllllllllllIlIllllIIlIllIIIIlll = GameSettings.llIlIIIIIIIllI[1];
                }
                textureMapBlocks.setBlurMipmapDirect((boolean)(llllllllllllIlIllllIIlIllIIIllIl != 0), (boolean)(llllllllllllIlIllllIIlIllIIIIlll != 0));
                this.mc.scheduleResourcesRefresh();
                "".length();
            }
        }
        if (lIIlIIIlIIIIlIlI(llllllllllllIllIllIllllIllllIIII, Options.BLOCK_ALTERNATIVES)) {
            int allowBlockAlternatives;
            if (lIIlIIIlIIIIIlII(this.allowBlockAlternatives ? 1 : 0)) {
                allowBlockAlternatives = GameSettings.llIlIIIIIIIllI[1];
                "".length();
                if ("   ".length() < 0) {
                    return;
                }
            }
            else {
                allowBlockAlternatives = GameSettings.llIlIIIIIIIllI[2];
            }
            this.allowBlockAlternatives = (allowBlockAlternatives != 0);
            this.mc.renderGlobal.loadRenderers();
        }
        if (lIIlIIIlIIIIlIlI(llllllllllllIllIllIllllIllllIIII, Options.RENDER_DISTANCE)) {
            this.renderDistanceChunks = (int)llllllllllllIllIllIllllIlllIllll;
            this.mc.renderGlobal.setDisplayListEntitiesDirty();
        }
        if (lIIlIIIlIIIIlIlI(llllllllllllIllIllIllllIllllIIII, Options.STREAM_BYTES_PER_PIXEL)) {
            this.streamBytesPerPixel = llllllllllllIllIllIllllIlllIllll;
        }
        if (lIIlIIIlIIIIlIlI(llllllllllllIllIllIllllIllllIIII, Options.STREAM_VOLUME_MIC)) {
            this.streamMicVolume = llllllllllllIllIllIllllIlllIllll;
            this.mc.getTwitchStream().updateStreamVolume();
        }
        if (lIIlIIIlIIIIlIlI(llllllllllllIllIllIllllIllllIIII, Options.STREAM_VOLUME_SYSTEM)) {
            this.streamGameVolume = llllllllllllIllIllIllllIlllIllll;
            this.mc.getTwitchStream().updateStreamVolume();
        }
        if (lIIlIIIlIIIIlIlI(llllllllllllIllIllIllllIllllIIII, Options.STREAM_KBPS)) {
            this.streamKbps = llllllllllllIllIllIllllIlllIllll;
        }
        if (lIIlIIIlIIIIlIlI(llllllllllllIllIllIllllIllllIIII, Options.STREAM_FPS)) {
            this.streamFps = llllllllllllIllIllIllllIlllIllll;
        }
    }
    
    public void setSoundLevel(final SoundCategory llllllllllllIllIllIllllIlIIIIlII, final float llllllllllllIllIllIllllIlIIIIIII) {
        this.mc.getSoundHandler().setSoundLevel(llllllllllllIllIllIllllIlIIIIlII, llllllllllllIllIllIllllIlIIIIIII);
        this.mapSoundLevels.put(llllllllllllIllIllIllllIlIIIIlII, llllllllllllIllIllIllllIlIIIIIII);
        "".length();
    }
    
    private static boolean lIIlIIIlIIIIlIlI(final Object llllllllllllIllIllIlllIllllIlIlI, final Object llllllllllllIllIllIlllIllllIlIIl) {
        return llllllllllllIllIllIlllIllllIlIlI == llllllllllllIllIllIlllIllllIlIIl;
    }
    
    private static String getTranslation(final String[] llllllllllllIllIllIllllIllIlIIlI, int llllllllllllIllIllIllllIllIIllll) {
        if (!lIIlIIIlIIIIIlIl(llllllllllllIllIllIllllIllIIllll) || lIIlIIIlIIIIllIl(llllllllllllIllIllIllllIllIIllll, llllllllllllIllIllIllllIllIlIIlI.length)) {
            llllllllllllIllIllIllllIllIIllll = GameSettings.llIlIIIIIIIllI[1];
        }
        return I18n.format(llllllllllllIllIllIllllIllIlIIlI[llllllllllllIllIllIllllIllIIllll], new Object[GameSettings.llIlIIIIIIIllI[1]]);
    }
    
    public void switchModelPartEnabled(final EnumPlayerModelParts llllllllllllIllIllIllllIIllIIIll) {
        if (lIIlIIIlIIIIlIII(this.getModelParts().contains(llllllllllllIllIllIllllIIllIIIll) ? 1 : 0)) {
            this.setModelParts.add(llllllllllllIllIllIllllIIllIIIll);
            "".length();
            "".length();
            if ("  ".length() != "  ".length()) {
                return;
            }
        }
        else {
            this.setModelParts.remove(llllllllllllIllIllIllllIIllIIIll);
            "".length();
        }
        this.sendSettingsToServer();
    }
    
    private static boolean lIIlIIIlIIIIIlIl(final int llllllllllllIllIllIlllIlllIlllll) {
        return llllllllllllIllIllIlllIlllIlllll >= 0;
    }
    
    private static boolean lIIlIIIlIIIIlIll(final int llllllllllllIllIllIlllIlllIllIll) {
        return llllllllllllIllIllIlllIlllIllIll > 0;
    }
    
    public String getKeyBinding(final Options llllllllllllIllIllIllllIllIIIIIl) {
        final String llllllllllllIllIllIllllIllIIIlll = String.valueOf(new StringBuilder(String.valueOf(I18n.format(llllllllllllIllIllIllllIllIIIIIl.getEnumString(), new Object[GameSettings.llIlIIIIIIIllI[1]]))).append(GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[186]]));
        if (lIIlIIIlIIIIIlII(llllllllllllIllIllIllllIllIIIIIl.getEnumFloat() ? 1 : 0)) {
            final float llllllllllllIllIllIllllIllIIIllI = this.getOptionFloatValue(llllllllllllIllIllIllllIllIIIIIl);
            final float llllllllllllIllIllIllllIllIIIlIl = llllllllllllIllIllIllllIllIIIIIl.normalizeValue(llllllllllllIllIllIllllIllIIIllI);
            String s;
            if (lIIlIIIlIIIIlIlI(llllllllllllIllIllIllllIllIIIIIl, Options.SENSITIVITY)) {
                if (lIIlIIIlIIIIlIII(lIIlIIIlIIIIlllI(llllllllllllIllIllIllllIllIIIlIl, 0.0f))) {
                    s = String.valueOf(new StringBuilder(String.valueOf(llllllllllllIllIllIllllIllIIIlll)).append(I18n.format(GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[187]], new Object[GameSettings.llIlIIIIIIIllI[1]])));
                    "".length();
                    if (-" ".length() >= 0) {
                        return null;
                    }
                }
                else if (lIIlIIIlIIIIlIII(lIIlIIIlIIIIlllI(llllllllllllIllIllIllllIllIIIlIl, 1.0f))) {
                    s = String.valueOf(new StringBuilder(String.valueOf(llllllllllllIllIllIllllIllIIIlll)).append(I18n.format(GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[188]], new Object[GameSettings.llIlIIIIIIIllI[1]])));
                    "".length();
                    if ("   ".length() <= 0) {
                        return null;
                    }
                }
                else {
                    s = String.valueOf(new StringBuilder(String.valueOf(llllllllllllIllIllIllllIllIIIlll)).append((int)(llllllllllllIllIllIllllIllIIIlIl * 200.0f)).append(GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[189]]));
                    "".length();
                    if ((32 + 24 + 17 + 78 ^ 90 + 114 - 116 + 59) > (88 + 15 - 78 + 122 ^ 32 + 110 + 5 + 4)) {
                        return null;
                    }
                }
            }
            else if (lIIlIIIlIIIIlIlI(llllllllllllIllIllIllllIllIIIIIl, Options.FOV)) {
                if (lIIlIIIlIIIIlIII(lIIlIIIlIIIIlllI(llllllllllllIllIllIllllIllIIIllI, 70.0f))) {
                    s = String.valueOf(new StringBuilder(String.valueOf(llllllllllllIllIllIllllIllIIIlll)).append(I18n.format(GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[190]], new Object[GameSettings.llIlIIIIIIIllI[1]])));
                    "".length();
                    if (-" ".length() != -" ".length()) {
                        return null;
                    }
                }
                else if (lIIlIIIlIIIIlIII(lIIlIIIlIIIIlllI(llllllllllllIllIllIllllIllIIIllI, 110.0f))) {
                    s = String.valueOf(new StringBuilder(String.valueOf(llllllllllllIllIllIllllIllIIIlll)).append(I18n.format(GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[191]], new Object[GameSettings.llIlIIIIIIIllI[1]])));
                    "".length();
                    if ((0xE ^ 0xB) <= 0) {
                        return null;
                    }
                }
                else {
                    s = String.valueOf(new StringBuilder(String.valueOf(llllllllllllIllIllIllllIllIIIlll)).append((int)llllllllllllIllIllIllllIllIIIllI));
                    "".length();
                    if (" ".length() != " ".length()) {
                        return null;
                    }
                }
            }
            else if (lIIlIIIlIIIIlIlI(llllllllllllIllIllIllllIllIIIIIl, Options.FRAMERATE_LIMIT)) {
                if (lIIlIIIlIIIIlIII(lIIlIIIlIIIIlllI(llllllllllllIllIllIllllIllIIIllI, llllllllllllIllIllIllllIllIIIIIl.valueMax))) {
                    s = String.valueOf(new StringBuilder(String.valueOf(llllllllllllIllIllIllllIllIIIlll)).append(I18n.format(GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[192]], new Object[GameSettings.llIlIIIIIIIllI[1]])));
                    "".length();
                    if (" ".length() <= ((0x84 ^ 0x9A) & ~(0xAA ^ 0xB4))) {
                        return null;
                    }
                }
                else {
                    s = String.valueOf(new StringBuilder(String.valueOf(llllllllllllIllIllIllllIllIIIlll)).append((int)llllllllllllIllIllIllllIllIIIllI).append(GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[193]]));
                    "".length();
                    if ("  ".length() <= ((85 + 71 - 24 + 0 ^ 45 + 128 - 78 + 79) & (112 + 109 - 77 + 46 ^ 122 + 50 - 108 + 84 ^ -" ".length()))) {
                        return null;
                    }
                }
            }
            else if (lIIlIIIlIIIIlIlI(llllllllllllIllIllIllllIllIIIIIl, Options.RENDER_CLOUDS)) {
                if (lIIlIIIlIIIIlIII(lIIlIIIlIIIIlllI(llllllllllllIllIllIllllIllIIIllI, llllllllllllIllIllIllllIllIIIIIl.valueMin))) {
                    s = String.valueOf(new StringBuilder(String.valueOf(llllllllllllIllIllIllllIllIIIlll)).append(I18n.format(GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[194]], new Object[GameSettings.llIlIIIIIIIllI[1]])));
                    "".length();
                    if ((0x45 ^ 0x65 ^ (0x97 ^ 0xB3)) < (0xDD ^ 0x93 ^ (0xCB ^ 0x81))) {
                        return null;
                    }
                }
                else {
                    s = String.valueOf(new StringBuilder(String.valueOf(llllllllllllIllIllIllllIllIIIlll)).append((int)llllllllllllIllIllIllllIllIIIllI + GameSettings.llIlIIIIIIIllI[132]));
                    "".length();
                    if (" ".length() >= "  ".length()) {
                        return null;
                    }
                }
            }
            else if (lIIlIIIlIIIIlIlI(llllllllllllIllIllIllllIllIIIIIl, Options.GAMMA)) {
                if (lIIlIIIlIIIIlIII(lIIlIIIlIIIIlllI(llllllllllllIllIllIllllIllIIIlIl, 0.0f))) {
                    s = String.valueOf(new StringBuilder(String.valueOf(llllllllllllIllIllIllllIllIIIlll)).append(I18n.format(GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[195]], new Object[GameSettings.llIlIIIIIIIllI[1]])));
                    "".length();
                    if (null != null) {
                        return null;
                    }
                }
                else if (lIIlIIIlIIIIlIII(lIIlIIIlIIIIlllI(llllllllllllIllIllIllllIllIIIlIl, 1.0f))) {
                    s = String.valueOf(new StringBuilder(String.valueOf(llllllllllllIllIllIllllIllIIIlll)).append(I18n.format(GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[196]], new Object[GameSettings.llIlIIIIIIIllI[1]])));
                    "".length();
                    if ("   ".length() < ((0x25 ^ 0x9) & ~(0x45 ^ 0x69) & ~((0x6E ^ 0x35) & ~(0xFA ^ 0xA1)))) {
                        return null;
                    }
                }
                else {
                    s = String.valueOf(new StringBuilder(String.valueOf(llllllllllllIllIllIllllIllIIIlll)).append(GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[197]]).append((int)(llllllllllllIllIllIllllIllIIIlIl * 100.0f)).append(GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[198]]));
                    "".length();
                    if ("   ".length() == ((0x51 ^ 0x41 ^ (0x12 ^ 0x45)) & (0xD2 ^ 0xC4 ^ (0xE1 ^ 0xB0) ^ -" ".length()))) {
                        return null;
                    }
                }
            }
            else if (lIIlIIIlIIIIlIlI(llllllllllllIllIllIllllIllIIIIIl, Options.SATURATION)) {
                s = String.valueOf(new StringBuilder(String.valueOf(llllllllllllIllIllIllllIllIIIlll)).append((int)(llllllllllllIllIllIllllIllIIIlIl * 400.0f)).append(GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[199]]));
                "".length();
                if (null != null) {
                    return null;
                }
            }
            else if (lIIlIIIlIIIIlIlI(llllllllllllIllIllIllllIllIIIIIl, Options.CHAT_OPACITY)) {
                s = String.valueOf(new StringBuilder(String.valueOf(llllllllllllIllIllIllllIllIIIlll)).append((int)(llllllllllllIllIllIllllIllIIIlIl * 90.0f + 10.0f)).append(GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[200]]));
                "".length();
                if (null != null) {
                    return null;
                }
            }
            else if (lIIlIIIlIIIIlIlI(llllllllllllIllIllIllllIllIIIIIl, Options.CHAT_HEIGHT_UNFOCUSED)) {
                s = String.valueOf(new StringBuilder(String.valueOf(llllllllllllIllIllIllllIllIIIlll)).append(GuiNewChat.calculateChatboxHeight(llllllllllllIllIllIllllIllIIIlIl)).append(GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[201]]));
                "".length();
                if (-"  ".length() >= 0) {
                    return null;
                }
            }
            else if (lIIlIIIlIIIIlIlI(llllllllllllIllIllIllllIllIIIIIl, Options.CHAT_HEIGHT_FOCUSED)) {
                s = String.valueOf(new StringBuilder(String.valueOf(llllllllllllIllIllIllllIllIIIlll)).append(GuiNewChat.calculateChatboxHeight(llllllllllllIllIllIllllIllIIIlIl)).append(GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[202]]));
                "".length();
                if (-"   ".length() > 0) {
                    return null;
                }
            }
            else if (lIIlIIIlIIIIlIlI(llllllllllllIllIllIllllIllIIIIIl, Options.CHAT_WIDTH)) {
                s = String.valueOf(new StringBuilder(String.valueOf(llllllllllllIllIllIllllIllIIIlll)).append(GuiNewChat.calculateChatboxWidth(llllllllllllIllIllIllllIllIIIlIl)).append(GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[203]]));
                "".length();
                if (((124 + 55 - 127 + 78 ^ 46 + 150 - 109 + 66) & (92 + 100 - 76 + 51 ^ 15 + 171 - 115 + 117 ^ -" ".length())) < 0) {
                    return null;
                }
            }
            else if (lIIlIIIlIIIIlIlI(llllllllllllIllIllIllllIllIIIIIl, Options.RENDER_DISTANCE)) {
                s = String.valueOf(new StringBuilder(String.valueOf(llllllllllllIllIllIllllIllIIIlll)).append((int)llllllllllllIllIllIllllIllIIIllI).append(GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[204]]));
                "".length();
                if (-"  ".length() >= 0) {
                    return null;
                }
            }
            else if (lIIlIIIlIIIIlIlI(llllllllllllIllIllIllllIllIIIIIl, Options.MIPMAP_LEVELS)) {
                if (lIIlIIIlIIIIlIII(lIIlIIIlIIIIlllI(llllllllllllIllIllIllllIllIIIllI, 0.0f))) {
                    s = String.valueOf(new StringBuilder(String.valueOf(llllllllllllIllIllIllllIllIIIlll)).append(I18n.format(GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[205]], new Object[GameSettings.llIlIIIIIIIllI[1]])));
                    "".length();
                    if ("  ".length() < ((0x6C ^ 0x7A) & ~(0x80 ^ 0x96))) {
                        return null;
                    }
                }
                else {
                    s = String.valueOf(new StringBuilder(String.valueOf(llllllllllllIllIllIllllIllIIIlll)).append((int)llllllllllllIllIllIllllIllIIIllI));
                    "".length();
                    if (-" ".length() >= 0) {
                        return null;
                    }
                }
            }
            else if (lIIlIIIlIIIIlIlI(llllllllllllIllIllIllllIllIIIIIl, Options.STREAM_FPS)) {
                s = String.valueOf(new StringBuilder(String.valueOf(llllllllllllIllIllIllllIllIIIlll)).append(TwitchStream.formatStreamFps(llllllllllllIllIllIllllIllIIIlIl)).append(GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[206]]));
                "".length();
                if ("   ".length() == 0) {
                    return null;
                }
            }
            else if (lIIlIIIlIIIIlIlI(llllllllllllIllIllIllllIllIIIIIl, Options.STREAM_KBPS)) {
                s = String.valueOf(new StringBuilder(String.valueOf(llllllllllllIllIllIllllIllIIIlll)).append(TwitchStream.formatStreamKbps(llllllllllllIllIllIllllIllIIIlIl)).append(GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[207]]));
                "".length();
                if (((0x3D ^ 0x5) & ~(0x22 ^ 0x1A)) > " ".length()) {
                    return null;
                }
            }
            else if (lIIlIIIlIIIIlIlI(llllllllllllIllIllIllllIllIIIIIl, Options.STREAM_BYTES_PER_PIXEL)) {
                final StringBuilder sb = new StringBuilder(String.valueOf(llllllllllllIllIllIllllIllIIIlll));
                final String format = GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[208]];
                final Object[] args = new Object[GameSettings.llIlIIIIIIIllI[2]];
                args[GameSettings.llIlIIIIIIIllI[1]] = TwitchStream.formatStreamBps(llllllllllllIllIllIllllIllIIIlIl);
                s = String.valueOf(sb.append(String.format(format, args)));
                "".length();
                if (((0x79 ^ 0x1A) & ~(0x59 ^ 0x3A)) != ((0x23 ^ 0x2A) & ~(0x89 ^ 0x80))) {
                    return null;
                }
            }
            else if (lIIlIIIlIIIIlIII(lIIlIIIlIIIIlllI(llllllllllllIllIllIllllIllIIIlIl, 0.0f))) {
                s = String.valueOf(new StringBuilder(String.valueOf(llllllllllllIllIllIllllIllIIIlll)).append(I18n.format(GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[209]], new Object[GameSettings.llIlIIIIIIIllI[1]])));
                "".length();
                if (-" ".length() >= 0) {
                    return null;
                }
            }
            else {
                s = String.valueOf(new StringBuilder(String.valueOf(llllllllllllIllIllIllllIllIIIlll)).append((int)(llllllllllllIllIllIllllIllIIIlIl * 100.0f)).append(GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[210]]));
            }
            return s;
        }
        if (lIIlIIIlIIIIIlII(llllllllllllIllIllIllllIllIIIIIl.getEnumBoolean() ? 1 : 0)) {
            final boolean llllllllllllIllIllIllllIllIIIlII = this.getOptionOrdinalValue(llllllllllllIllIllIllllIllIIIIIl);
            String s2;
            if (lIIlIIIlIIIIIlII(llllllllllllIllIllIllllIllIIIlII ? 1 : 0)) {
                s2 = String.valueOf(new StringBuilder(String.valueOf(llllllllllllIllIllIllllIllIIIlll)).append(I18n.format(GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[211]], new Object[GameSettings.llIlIIIIIIIllI[1]])));
                "".length();
                if (null != null) {
                    return null;
                }
            }
            else {
                s2 = String.valueOf(new StringBuilder(String.valueOf(llllllllllllIllIllIllllIllIIIlll)).append(I18n.format(GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[212]], new Object[GameSettings.llIlIIIIIIIllI[1]])));
            }
            return s2;
        }
        if (lIIlIIIlIIIIlIlI(llllllllllllIllIllIllllIllIIIIIl, Options.GUI_SCALE)) {
            return String.valueOf(new StringBuilder(String.valueOf(llllllllllllIllIllIllllIllIIIlll)).append(getTranslation(GameSettings.GUISCALES, this.guiScale)));
        }
        if (lIIlIIIlIIIIlIlI(llllllllllllIllIllIllllIllIIIIIl, Options.CHAT_VISIBILITY)) {
            return String.valueOf(new StringBuilder(String.valueOf(llllllllllllIllIllIllllIllIIIlll)).append(I18n.format(this.chatVisibility.getResourceKey(), new Object[GameSettings.llIlIIIIIIIllI[1]])));
        }
        if (lIIlIIIlIIIIlIlI(llllllllllllIllIllIllllIllIIIIIl, Options.PARTICLES)) {
            return String.valueOf(new StringBuilder(String.valueOf(llllllllllllIllIllIllllIllIIIlll)).append(getTranslation(GameSettings.PARTICLES, this.particleSetting)));
        }
        if (lIIlIIIlIIIIlIlI(llllllllllllIllIllIllllIllIIIIIl, Options.AMBIENT_OCCLUSION)) {
            return String.valueOf(new StringBuilder(String.valueOf(llllllllllllIllIllIllllIllIIIlll)).append(getTranslation(GameSettings.AMBIENT_OCCLUSIONS, this.ambientOcclusion)));
        }
        if (lIIlIIIlIIIIlIlI(llllllllllllIllIllIllllIllIIIIIl, Options.STREAM_COMPRESSION)) {
            return String.valueOf(new StringBuilder(String.valueOf(llllllllllllIllIllIllllIllIIIlll)).append(getTranslation(GameSettings.STREAM_COMPRESSIONS, this.streamCompression)));
        }
        if (lIIlIIIlIIIIlIlI(llllllllllllIllIllIllllIllIIIIIl, Options.STREAM_CHAT_ENABLED)) {
            return String.valueOf(new StringBuilder(String.valueOf(llllllllllllIllIllIllllIllIIIlll)).append(getTranslation(GameSettings.STREAM_CHAT_MODES, this.streamChatEnabled)));
        }
        if (lIIlIIIlIIIIlIlI(llllllllllllIllIllIllllIllIIIIIl, Options.STREAM_CHAT_USER_FILTER)) {
            return String.valueOf(new StringBuilder(String.valueOf(llllllllllllIllIllIllllIllIIIlll)).append(getTranslation(GameSettings.STREAM_CHAT_FILTER_MODES, this.streamChatUserFilter)));
        }
        if (lIIlIIIlIIIIlIlI(llllllllllllIllIllIllllIllIIIIIl, Options.STREAM_MIC_TOGGLE_BEHAVIOR)) {
            return String.valueOf(new StringBuilder(String.valueOf(llllllllllllIllIllIllllIllIIIlll)).append(getTranslation(GameSettings.STREAM_MIC_MODES, this.streamMicToggleBehavior)));
        }
        if (lIIlIIIlIIIIlIlI(llllllllllllIllIllIllllIllIIIIIl, Options.RENDER_CLOUDS)) {
            return String.valueOf(new StringBuilder(String.valueOf(llllllllllllIllIllIllllIllIIIlll)).append(getTranslation(GameSettings.field_181149_aW, this.clouds)));
        }
        if (!lIIlIIIlIIIIlIlI(llllllllllllIllIllIllllIllIIIIIl, Options.GRAPHICS)) {
            return llllllllllllIllIllIllllIllIIIlll;
        }
        if (lIIlIIIlIIIIIlII(this.fancyGraphics ? 1 : 0)) {
            return String.valueOf(new StringBuilder(String.valueOf(llllllllllllIllIllIllllIllIIIlll)).append(I18n.format(GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[213]], new Object[GameSettings.llIlIIIIIIIllI[1]])));
        }
        final String llllllllllllIllIllIllllIllIIIIll = GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[214]];
        return String.valueOf(new StringBuilder(String.valueOf(llllllllllllIllIllIllllIllIIIlll)).append(I18n.format(GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[215]], new Object[GameSettings.llIlIIIIIIIllI[1]])));
    }
    
    public void setOptionKeyBinding(final KeyBinding llllllllllllIllIllIllllIlllllIlI, final int llllllllllllIllIllIllllIlllllIIl) {
        llllllllllllIllIllIllllIlllllIlI.setKeyCode(llllllllllllIllIllIllllIlllllIIl);
        this.saveOptions();
    }
    
    private float parseFloat(final String llllllllllllIllIllIllllIlIlIIIIl) {
        float float1;
        if (lIIlIIIlIIIIIlII(llllllllllllIllIllIllllIlIlIIIIl.equals(GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[310]]) ? 1 : 0)) {
            float1 = 1.0f;
            "".length();
            if ((0x72 ^ 0x76) < "  ".length()) {
                return 0.0f;
            }
        }
        else if (lIIlIIIlIIIIIlII(llllllllllllIllIllIllllIlIlIIIIl.equals(GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[311]]) ? 1 : 0)) {
            float1 = 0.0f;
            "".length();
            if (" ".length() == (0x30 ^ 0x34)) {
                return 0.0f;
            }
        }
        else {
            float1 = Float.parseFloat(llllllllllllIllIllIllllIlIlIIIIl);
        }
        return float1;
    }
    
    private static String lIIIllIlIlllllIl(final String llllllllllllIllIllIllllIIIlllIll, final String llllllllllllIllIllIllllIIIlllIII) {
        try {
            final SecretKeySpec llllllllllllIllIllIllllIIIlllllI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIllIllIllllIIIlllIII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher llllllllllllIllIllIllllIIIllllIl = Cipher.getInstance("Blowfish");
            llllllllllllIllIllIllllIIIllllIl.init(GameSettings.llIlIIIIIIIllI[3], llllllllllllIllIllIllllIIIlllllI);
            return new String(llllllllllllIllIllIllllIIIllllIl.doFinal(Base64.getDecoder().decode(llllllllllllIllIllIllllIIIlllIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIllIllIllllIIIllllII) {
            llllllllllllIllIllIllllIIIllllII.printStackTrace();
            return null;
        }
    }
    
    public boolean getOptionOrdinalValue(final Options llllllllllllIllIllIllllIllIlIlll) {
        switch ($SWITCH_TABLE$net$minecraft$client$settings$GameSettings$Options()[llllllllllllIllIllIllllIllIlIlll.ordinal()]) {
            case 1: {
                return this.invertMouse;
            }
            case 7: {
                return this.viewBobbing;
            }
            case 8: {
                return this.anaglyph;
            }
            case 10: {
                return this.fboEnable;
            }
            case 17: {
                return this.chatColours;
            }
            case 18: {
                return this.chatLinks;
            }
            case 20: {
                return this.chatLinksPrompt;
            }
            case 21: {
                return this.snooperEnabled;
            }
            case 22: {
                return this.fullScreen;
            }
            case 23: {
                return this.enableVsync;
            }
            case 24: {
                return this.useVbo;
            }
            case 25: {
                return this.touchscreen;
            }
            case 38: {
                return this.streamSendMetadata;
            }
            case 31: {
                return this.forceUnicodeFont;
            }
            case 42: {
                return this.allowBlockAlternatives;
            }
            case 43: {
                return this.reducedDebugInfo;
            }
            case 44: {
                return this.field_181151_V;
            }
            default: {
                return GameSettings.llIlIIIIIIIllI[1] != 0;
            }
        }
    }
    
    public GameSettings() {
        this.mouseSensitivity = 0.5f;
        this.renderDistanceChunks = GameSettings.llIlIIIIIIIllI[24];
        this.viewBobbing = (GameSettings.llIlIIIIIIIllI[2] != 0);
        this.fboEnable = (GameSettings.llIlIIIIIIIllI[2] != 0);
        this.limitFramerate = GameSettings.llIlIIIIIIIllI[25];
        this.clouds = GameSettings.llIlIIIIIIIllI[3];
        this.fancyGraphics = (GameSettings.llIlIIIIIIIllI[2] != 0);
        this.ambientOcclusion = GameSettings.llIlIIIIIIIllI[3];
        this.resourcePacks = (List<String>)Lists.newArrayList();
        this.field_183018_l = (List<String>)Lists.newArrayList();
        this.chatVisibility = EntityPlayer.EnumChatVisibility.FULL;
        this.chatColours = (GameSettings.llIlIIIIIIIllI[2] != 0);
        this.chatLinks = (GameSettings.llIlIIIIIIIllI[2] != 0);
        this.chatLinksPrompt = (GameSettings.llIlIIIIIIIllI[2] != 0);
        this.chatOpacity = 1.0f;
        this.snooperEnabled = (GameSettings.llIlIIIIIIIllI[2] != 0);
        this.enableVsync = (GameSettings.llIlIIIIIIIllI[2] != 0);
        this.useVbo = (GameSettings.llIlIIIIIIIllI[1] != 0);
        this.allowBlockAlternatives = (GameSettings.llIlIIIIIIIllI[2] != 0);
        this.reducedDebugInfo = (GameSettings.llIlIIIIIIIllI[1] != 0);
        this.pauseOnLostFocus = (GameSettings.llIlIIIIIIIllI[2] != 0);
        this.setModelParts = (Set<EnumPlayerModelParts>)Sets.newHashSet((Object[])EnumPlayerModelParts.values());
        this.heldItemTooltips = (GameSettings.llIlIIIIIIIllI[2] != 0);
        this.chatScale = 1.0f;
        this.chatWidth = 1.0f;
        this.chatHeightUnfocused = 0.44366196f;
        this.chatHeightFocused = 1.0f;
        this.showInventoryAchievementHint = (GameSettings.llIlIIIIIIIllI[2] != 0);
        this.mipmapLevels = GameSettings.llIlIIIIIIIllI[0];
        this.mapSoundLevels = (Map<SoundCategory, Float>)Maps.newEnumMap((Class)SoundCategory.class);
        this.streamBytesPerPixel = 0.5f;
        this.streamMicVolume = 1.0f;
        this.streamGameVolume = 1.0f;
        this.streamKbps = 0.5412844f;
        this.streamFps = 0.31690142f;
        this.streamCompression = GameSettings.llIlIIIIIIIllI[2];
        this.streamSendMetadata = (GameSettings.llIlIIIIIIIllI[2] != 0);
        this.streamPreferredServer = GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[107]];
        this.streamChatEnabled = GameSettings.llIlIIIIIIIllI[1];
        this.streamChatUserFilter = GameSettings.llIlIIIIIIIllI[1];
        this.streamMicToggleBehavior = GameSettings.llIlIIIIIIIllI[1];
        this.field_181150_U = (GameSettings.llIlIIIIIIIllI[2] != 0);
        this.field_181151_V = (GameSettings.llIlIIIIIIIllI[2] != 0);
        this.keyBindForward = new KeyBinding(GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[108]], GameSettings.llIlIIIIIIIllI[17], GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[109]]);
        this.keyBindLeft = new KeyBinding(GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[110]], GameSettings.llIlIIIIIIIllI[30], GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[111]]);
        this.keyBindBack = new KeyBinding(GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[112]], GameSettings.llIlIIIIIIIllI[33], GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[113]]);
        this.keyBindRight = new KeyBinding(GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[114]], GameSettings.llIlIIIIIIIllI[34], GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[115]]);
        this.keyBindJump = new KeyBinding(GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[116]], GameSettings.llIlIIIIIIIllI[36], GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[117]]);
        this.keyBindSneak = new KeyBinding(GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[118]], GameSettings.llIlIIIIIIIllI[39], GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[119]]);
        this.keyBindSprint = new KeyBinding(GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[120]], GameSettings.llIlIIIIIIIllI[32], GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[121]]);
        this.keyBindInventory = new KeyBinding(GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[122]], GameSettings.llIlIIIIIIIllI[18], GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[123]]);
        this.keyBindUseItem = new KeyBinding(GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[124]], GameSettings.llIlIIIIIIIllI[46], GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[25]]);
        this.keyBindDrop = new KeyBinding(GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[125]], GameSettings.llIlIIIIIIIllI[16], GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[126]]);
        this.keyBindAttack = new KeyBinding(GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[127]], GameSettings.llIlIIIIIIIllI[50], GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[128]]);
        this.keyBindPickBlock = new KeyBinding(GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[129]], GameSettings.llIlIIIIIIIllI[53], GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[130]]);
        this.keyBindChat = new KeyBinding(GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[131]], GameSettings.llIlIIIIIIIllI[20], GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[132]]);
        this.keyBindPlayerList = new KeyBinding(GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[133]], GameSettings.llIlIIIIIIIllI[15], GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[134]]);
        this.keyBindCommand = new KeyBinding(GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[135]], GameSettings.llIlIIIIIIIllI[59], GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[136]]);
        this.keyBindScreenshot = new KeyBinding(GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[137]], GameSettings.llIlIIIIIIIllI[62], GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[138]]);
        this.keyBindTogglePerspective = new KeyBinding(GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[139]], GameSettings.llIlIIIIIIIllI[64], GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[140]]);
        this.keyBindSmoothCamera = new KeyBinding(GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[141]], GameSettings.llIlIIIIIIIllI[1], GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[142]]);
        this.keyBindFullscreen = new KeyBinding(GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[143]], GameSettings.llIlIIIIIIIllI[68], GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[144]]);
        this.keyBindSpectatorOutlines = new KeyBinding(GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[145]], GameSettings.llIlIIIIIIIllI[1], GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[146]]);
        this.keyBindStreamStartStop = new KeyBinding(GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[147]], GameSettings.llIlIIIIIIIllI[70], GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[148]]);
        this.keyBindStreamPauseUnpause = new KeyBinding(GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[149]], GameSettings.llIlIIIIIIIllI[71], GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[150]]);
        this.keyBindStreamCommercials = new KeyBinding(GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[151]], GameSettings.llIlIIIIIIIllI[1], GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[152]]);
        this.keyBindStreamToggleMic = new KeyBinding(GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[153]], GameSettings.llIlIIIIIIIllI[1], GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[154]]);
        final KeyBinding[] keyBindsHotbar = new KeyBinding[GameSettings.llIlIIIIIIIllI[9]];
        keyBindsHotbar[GameSettings.llIlIIIIIIIllI[1]] = new KeyBinding(GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[155]], GameSettings.llIlIIIIIIIllI[3], GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[156]]);
        keyBindsHotbar[GameSettings.llIlIIIIIIIllI[2]] = new KeyBinding(GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[157]], GameSettings.llIlIIIIIIIllI[4], GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[158]]);
        keyBindsHotbar[GameSettings.llIlIIIIIIIllI[3]] = new KeyBinding(GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[159]], GameSettings.llIlIIIIIIIllI[0], GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[160]]);
        keyBindsHotbar[GameSettings.llIlIIIIIIIllI[4]] = new KeyBinding(GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[161]], GameSettings.llIlIIIIIIIllI[5], GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[162]]);
        keyBindsHotbar[GameSettings.llIlIIIIIIIllI[0]] = new KeyBinding(GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[163]], GameSettings.llIlIIIIIIIllI[6], GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[164]]);
        keyBindsHotbar[GameSettings.llIlIIIIIIIllI[5]] = new KeyBinding(GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[165]], GameSettings.llIlIIIIIIIllI[7], GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[166]]);
        keyBindsHotbar[GameSettings.llIlIIIIIIIllI[6]] = new KeyBinding(GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[167]], GameSettings.llIlIIIIIIIllI[8], GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[168]]);
        keyBindsHotbar[GameSettings.llIlIIIIIIIllI[7]] = new KeyBinding(GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[169]], GameSettings.llIlIIIIIIIllI[9], GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[170]]);
        keyBindsHotbar[GameSettings.llIlIIIIIIIllI[8]] = new KeyBinding(GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[171]], GameSettings.llIlIIIIIIIllI[10], GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[172]]);
        this.keyBindsHotbar = keyBindsHotbar;
        this.HUD_CONFIG = new KeyBinding(GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[173]], GameSettings.llIlIIIIIIIllI[21], GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[174]]);
        this.CLICK_GUI = new KeyBinding(GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[175]], GameSettings.llIlIIIIIIIllI[60], GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[176]]);
        this.CLIENT_PERSPECTIVE = new KeyBinding(GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[177]], GameSettings.llIlIIIIIIIllI[48], GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[178]]);
        this.ZOOM = new KeyBinding(GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[179]], GameSettings.llIlIIIIIIIllI[51], GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[180]]);
        final KeyBinding[] array = new KeyBinding[GameSettings.llIlIIIIIIIllI[26]];
        array[GameSettings.llIlIIIIIIIllI[1]] = this.keyBindAttack;
        array[GameSettings.llIlIIIIIIIllI[2]] = this.keyBindUseItem;
        array[GameSettings.llIlIIIIIIIllI[3]] = this.keyBindForward;
        array[GameSettings.llIlIIIIIIIllI[4]] = this.keyBindLeft;
        array[GameSettings.llIlIIIIIIIllI[0]] = this.keyBindBack;
        array[GameSettings.llIlIIIIIIIllI[5]] = this.keyBindRight;
        array[GameSettings.llIlIIIIIIIllI[6]] = this.keyBindJump;
        array[GameSettings.llIlIIIIIIIllI[7]] = this.keyBindSneak;
        array[GameSettings.llIlIIIIIIIllI[8]] = this.keyBindSprint;
        array[GameSettings.llIlIIIIIIIllI[9]] = this.keyBindDrop;
        array[GameSettings.llIlIIIIIIIllI[10]] = this.keyBindInventory;
        array[GameSettings.llIlIIIIIIIllI[11]] = this.keyBindChat;
        array[GameSettings.llIlIIIIIIIllI[12]] = this.keyBindPlayerList;
        array[GameSettings.llIlIIIIIIIllI[13]] = this.keyBindPickBlock;
        array[GameSettings.llIlIIIIIIIllI[14]] = this.keyBindCommand;
        array[GameSettings.llIlIIIIIIIllI[15]] = this.keyBindScreenshot;
        array[GameSettings.llIlIIIIIIIllI[16]] = this.keyBindTogglePerspective;
        array[GameSettings.llIlIIIIIIIllI[17]] = this.keyBindSmoothCamera;
        array[GameSettings.llIlIIIIIIIllI[18]] = this.keyBindStreamStartStop;
        array[GameSettings.llIlIIIIIIIllI[19]] = this.keyBindStreamPauseUnpause;
        array[GameSettings.llIlIIIIIIIllI[20]] = this.keyBindStreamCommercials;
        array[GameSettings.llIlIIIIIIIllI[21]] = this.keyBindStreamToggleMic;
        array[GameSettings.llIlIIIIIIIllI[22]] = this.keyBindFullscreen;
        array[GameSettings.llIlIIIIIIIllI[23]] = this.keyBindSpectatorOutlines;
        this.keyBindings = (KeyBinding[])ArrayUtils.addAll((Object[])array, (Object[])this.keyBindsHotbar);
        this.difficulty = EnumDifficulty.NORMAL;
        this.lastServer = GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[181]];
        this.fovSetting = 70.0f;
        this.language = GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[182]];
        this.forceUnicodeFont = (GameSettings.llIlIIIIIIIllI[1] != 0);
        this.addClientKeybinds();
    }
    
    private static int lIIlIIIlIIIIlllI(final float n, final float n2) {
        return fcmpl(n, n2);
    }
    
    public Set<EnumPlayerModelParts> getModelParts() {
        return (Set<EnumPlayerModelParts>)ImmutableSet.copyOf((Collection)this.setModelParts);
    }
    
    private static boolean lIIlIIIlIIIIIlII(final int llllllllllllIllIllIlllIllllIIIll) {
        return llllllllllllIllIllIlllIllllIIIll != 0;
    }
    
    static /* synthetic */ int[] $SWITCH_TABLE$net$minecraft$client$settings$GameSettings$Options() {
        final int[] $switch_TABLE$net$minecraft$client$settings$GameSettings$Options = GameSettings.$SWITCH_TABLE$net$minecraft$client$settings$GameSettings$Options;
        if (lIIlIIIlIIIlIIII($switch_TABLE$net$minecraft$client$settings$GameSettings$Options)) {
            return $switch_TABLE$net$minecraft$client$settings$GameSettings$Options;
        }
        "".length();
        final double llllllllllllIllIllIllllIIlIllIll = (Object)new int[Options.values().length];
        try {
            llllllllllllIllIllIllllIIlIllIll[Options.AMBIENT_OCCLUSION.ordinal()] = GameSettings.llIlIIIIIIIllI[13];
            "".length();
            if ("   ".length() < "   ".length()) {
                return null;
            }
        }
        catch (NoSuchFieldError noSuchFieldError) {
            "".length();
        }
        try {
            llllllllllllIllIllIllllIIlIllIll[Options.ANAGLYPH.ordinal()] = GameSettings.llIlIIIIIIIllI[8];
            "".length();
            if (" ".length() < 0) {
                return null;
            }
        }
        catch (NoSuchFieldError noSuchFieldError2) {
            "".length();
        }
        try {
            llllllllllllIllIllIllllIIlIllIll[Options.BLOCK_ALTERNATIVES.ordinal()] = GameSettings.llIlIIIIIIIllI[39];
            "".length();
            if (" ".length() < 0) {
                return null;
            }
        }
        catch (NoSuchFieldError noSuchFieldError3) {
            "".length();
        }
        try {
            llllllllllllIllIllIllllIIlIllIll[Options.CHAT_COLOR.ordinal()] = GameSettings.llIlIIIIIIIllI[17];
            "".length();
            if (-(0x2F ^ 0x7 ^ (0x1 ^ 0x2D)) > 0) {
                return null;
            }
        }
        catch (NoSuchFieldError noSuchFieldError4) {
            "".length();
        }
        try {
            llllllllllllIllIllIllllIIlIllIll[Options.CHAT_HEIGHT_FOCUSED.ordinal()] = GameSettings.llIlIIIIIIIllI[31];
            "".length();
            if ((0x26 ^ 0x10 ^ (0x2 ^ 0x30)) < " ".length()) {
                return null;
            }
        }
        catch (NoSuchFieldError noSuchFieldError5) {
            "".length();
        }
        try {
            llllllllllllIllIllIllllIIlIllIll[Options.CHAT_HEIGHT_UNFOCUSED.ordinal()] = GameSettings.llIlIIIIIIIllI[32];
            "".length();
            if ("  ".length() != "  ".length()) {
                return null;
            }
        }
        catch (NoSuchFieldError noSuchFieldError6) {
            "".length();
        }
        try {
            llllllllllllIllIllIllllIIlIllIll[Options.CHAT_LINKS.ordinal()] = GameSettings.llIlIIIIIIIllI[18];
            "".length();
            if (((0x68 ^ 0x35 ^ (0xC9 ^ 0xB1)) & (48 + 31 + 66 + 10 ^ 26 + 90 - 114 + 188 ^ -" ".length())) != 0x0) {
                return null;
            }
        }
        catch (NoSuchFieldError noSuchFieldError7) {
            "".length();
        }
        try {
            llllllllllllIllIllIllllIIlIllIll[Options.CHAT_LINKS_PROMPT.ordinal()] = GameSettings.llIlIIIIIIIllI[20];
            "".length();
            if (-"  ".length() >= 0) {
                return null;
            }
        }
        catch (NoSuchFieldError noSuchFieldError8) {
            "".length();
        }
        try {
            llllllllllllIllIllIllllIIlIllIll[Options.CHAT_OPACITY.ordinal()] = GameSettings.llIlIIIIIIIllI[19];
            "".length();
            if (" ".length() > " ".length()) {
                return null;
            }
        }
        catch (NoSuchFieldError noSuchFieldError9) {
            "".length();
        }
        try {
            llllllllllllIllIllIllllIIlIllIll[Options.CHAT_SCALE.ordinal()] = GameSettings.llIlIIIIIIIllI[28];
            "".length();
            if ((97 + 22 - 99 + 175 ^ 186 + 70 - 245 + 188) < 0) {
                return null;
            }
        }
        catch (NoSuchFieldError noSuchFieldError10) {
            "".length();
        }
        try {
            llllllllllllIllIllIllllIIlIllIll[Options.CHAT_VISIBILITY.ordinal()] = GameSettings.llIlIIIIIIIllI[16];
            "".length();
            if (null != null) {
                return null;
            }
        }
        catch (NoSuchFieldError noSuchFieldError11) {
            "".length();
        }
        try {
            llllllllllllIllIllIllllIIlIllIll[Options.CHAT_WIDTH.ordinal()] = GameSettings.llIlIIIIIIIllI[29];
            "".length();
            if (-" ".length() == "  ".length()) {
                return null;
            }
        }
        catch (NoSuchFieldError noSuchFieldError12) {
            "".length();
        }
        try {
            llllllllllllIllIllIllllIIlIllIll[Options.ENABLE_VSYNC.ordinal()] = GameSettings.llIlIIIIIIIllI[23];
            "".length();
            if ("   ".length() != "   ".length()) {
                return null;
            }
        }
        catch (NoSuchFieldError noSuchFieldError13) {
            "".length();
        }
        try {
            llllllllllllIllIllIllllIIlIllIll[Options.ENTITY_SHADOWS.ordinal()] = GameSettings.llIlIIIIIIIllI[48];
            "".length();
            if (" ".length() != " ".length()) {
                return null;
            }
        }
        catch (NoSuchFieldError noSuchFieldError14) {
            "".length();
        }
        try {
            llllllllllllIllIllIllllIIlIllIll[Options.FBO_ENABLE.ordinal()] = GameSettings.llIlIIIIIIIllI[10];
            "".length();
            if ((0x5E ^ 0x5A) == 0x0) {
                return null;
            }
        }
        catch (NoSuchFieldError noSuchFieldError15) {
            "".length();
        }
        try {
            llllllllllllIllIllIllllIIlIllIll[Options.FORCE_UNICODE_FONT.ordinal()] = GameSettings.llIlIIIIIIIllI[33];
            "".length();
            if ("  ".length() == -" ".length()) {
                return null;
            }
        }
        catch (NoSuchFieldError noSuchFieldError16) {
            "".length();
        }
        try {
            llllllllllllIllIllIllllIIlIllIll[Options.FOV.ordinal()] = GameSettings.llIlIIIIIIIllI[4];
            "".length();
            if (null != null) {
                return null;
            }
        }
        catch (NoSuchFieldError noSuchFieldError17) {
            "".length();
        }
        try {
            llllllllllllIllIllIllllIIlIllIll[Options.FRAMERATE_LIMIT.ordinal()] = GameSettings.llIlIIIIIIIllI[9];
            "".length();
            if (" ".length() > "  ".length()) {
                return null;
            }
        }
        catch (NoSuchFieldError noSuchFieldError18) {
            "".length();
        }
        try {
            llllllllllllIllIllIllllIIlIllIll[Options.GAMMA.ordinal()] = GameSettings.llIlIIIIIIIllI[0];
            "".length();
            if ("  ".length() != "  ".length()) {
                return null;
            }
        }
        catch (NoSuchFieldError noSuchFieldError19) {
            "".length();
        }
        try {
            llllllllllllIllIllIllllIIlIllIll[Options.GRAPHICS.ordinal()] = GameSettings.llIlIIIIIIIllI[12];
            "".length();
            if ((158 + 89 - 56 + 8 ^ 162 + 67 - 51 + 16) <= 0) {
                return null;
            }
        }
        catch (NoSuchFieldError noSuchFieldError20) {
            "".length();
        }
        try {
            llllllllllllIllIllIllllIIlIllIll[Options.GUI_SCALE.ordinal()] = GameSettings.llIlIIIIIIIllI[14];
            "".length();
            if (-"   ".length() > 0) {
                return null;
            }
        }
        catch (NoSuchFieldError noSuchFieldError21) {
            "".length();
        }
        try {
            llllllllllllIllIllIllllIIlIllIll[Options.INVERT_MOUSE.ordinal()] = GameSettings.llIlIIIIIIIllI[2];
            "".length();
            if (-" ".length() >= "  ".length()) {
                return null;
            }
        }
        catch (NoSuchFieldError noSuchFieldError22) {
            "".length();
        }
        try {
            llllllllllllIllIllIllllIIlIllIll[Options.MIPMAP_LEVELS.ordinal()] = GameSettings.llIlIIIIIIIllI[30];
            "".length();
            if (null != null) {
                return null;
            }
        }
        catch (NoSuchFieldError noSuchFieldError23) {
            "".length();
        }
        try {
            llllllllllllIllIllIllllIIlIllIll[Options.PARTICLES.ordinal()] = GameSettings.llIlIIIIIIIllI[15];
            "".length();
            if (" ".length() < 0) {
                return null;
            }
        }
        catch (NoSuchFieldError noSuchFieldError24) {
            "".length();
        }
        try {
            llllllllllllIllIllIllllIIlIllIll[Options.REDUCED_DEBUG_INFO.ordinal()] = GameSettings.llIlIIIIIIIllI[47];
            "".length();
            if (-"   ".length() > 0) {
                return null;
            }
        }
        catch (NoSuchFieldError noSuchFieldError25) {
            "".length();
        }
        try {
            llllllllllllIllIllIllllIIlIllIll[Options.RENDER_CLOUDS.ordinal()] = GameSettings.llIlIIIIIIIllI[11];
            "".length();
            if ("   ".length() < -" ".length()) {
                return null;
            }
        }
        catch (NoSuchFieldError noSuchFieldError26) {
            "".length();
        }
        try {
            llllllllllllIllIllIllllIIlIllIll[Options.RENDER_DISTANCE.ordinal()] = GameSettings.llIlIIIIIIIllI[6];
            "".length();
            if (-"  ".length() >= 0) {
                return null;
            }
        }
        catch (NoSuchFieldError noSuchFieldError27) {
            "".length();
        }
        try {
            llllllllllllIllIllIllllIIlIllIll[Options.SATURATION.ordinal()] = GameSettings.llIlIIIIIIIllI[5];
            "".length();
            if (" ".length() >= (0x2A ^ 0x2E)) {
                return null;
            }
        }
        catch (NoSuchFieldError noSuchFieldError28) {
            "".length();
        }
        try {
            llllllllllllIllIllIllllIIlIllIll[Options.SENSITIVITY.ordinal()] = GameSettings.llIlIIIIIIIllI[3];
            "".length();
            if (((0x72 ^ 0x14 ^ (0x72 ^ 0x75)) & (0x6E ^ 0x34 ^ (0x3E ^ 0x5) ^ -" ".length())) == (0x2F ^ 0xA ^ (0xA1 ^ 0x80))) {
                return null;
            }
        }
        catch (NoSuchFieldError noSuchFieldError29) {
            "".length();
        }
        try {
            llllllllllllIllIllIllllIIlIllIll[Options.SNOOPER_ENABLED.ordinal()] = GameSettings.llIlIIIIIIIllI[21];
            "".length();
            if ("   ".length() < 0) {
                return null;
            }
        }
        catch (NoSuchFieldError noSuchFieldError30) {
            "".length();
        }
        try {
            llllllllllllIllIllIllllIIlIllIll[Options.STREAM_BYTES_PER_PIXEL.ordinal()] = GameSettings.llIlIIIIIIIllI[34];
            "".length();
            if (null != null) {
                return null;
            }
        }
        catch (NoSuchFieldError noSuchFieldError31) {
            "".length();
        }
        try {
            llllllllllllIllIllIllllIIlIllIll[Options.STREAM_CHAT_ENABLED.ordinal()] = GameSettings.llIlIIIIIIIllI[43];
            "".length();
            if ("   ".length() == (0x48 ^ 0x4C)) {
                return null;
            }
        }
        catch (NoSuchFieldError noSuchFieldError32) {
            "".length();
        }
        try {
            llllllllllllIllIllIllllIIlIllIll[Options.STREAM_CHAT_USER_FILTER.ordinal()] = GameSettings.llIlIIIIIIIllI[44];
            "".length();
            if (-"   ".length() >= 0) {
                return null;
            }
        }
        catch (NoSuchFieldError noSuchFieldError33) {
            "".length();
        }
        try {
            llllllllllllIllIllIllllIIlIllIll[Options.STREAM_COMPRESSION.ordinal()] = GameSettings.llIlIIIIIIIllI[41];
            "".length();
            if ((0x4F ^ 0x4A) <= 0) {
                return null;
            }
        }
        catch (NoSuchFieldError noSuchFieldError34) {
            "".length();
        }
        try {
            llllllllllllIllIllIllllIIlIllIll[Options.STREAM_FPS.ordinal()] = GameSettings.llIlIIIIIIIllI[40];
            "".length();
            if ("  ".length() < -" ".length()) {
                return null;
            }
        }
        catch (NoSuchFieldError noSuchFieldError35) {
            "".length();
        }
        try {
            llllllllllllIllIllIllllIIlIllIll[Options.STREAM_KBPS.ordinal()] = GameSettings.llIlIIIIIIIllI[38];
            "".length();
            if ("  ".length() == 0) {
                return null;
            }
        }
        catch (NoSuchFieldError noSuchFieldError36) {
            "".length();
        }
        try {
            llllllllllllIllIllIllllIIlIllIll[Options.STREAM_MIC_TOGGLE_BEHAVIOR.ordinal()] = GameSettings.llIlIIIIIIIllI[45];
            "".length();
            if ((115 + 102 - 197 + 115 ^ 119 + 60 - 97 + 48) <= 0) {
                return null;
            }
        }
        catch (NoSuchFieldError noSuchFieldError37) {
            "".length();
        }
        try {
            llllllllllllIllIllIllllIIlIllIll[Options.STREAM_SEND_METADATA.ordinal()] = GameSettings.llIlIIIIIIIllI[42];
            "".length();
            if ((0x80 ^ 0xC1 ^ (0xF1 ^ 0xB5)) <= 0) {
                return null;
            }
        }
        catch (NoSuchFieldError noSuchFieldError38) {
            "".length();
        }
        try {
            llllllllllllIllIllIllllIIlIllIll[Options.STREAM_VOLUME_MIC.ordinal()] = GameSettings.llIlIIIIIIIllI[35];
            "".length();
            if (((0x96 ^ 0xB4 ^ (0xD0 ^ 0xC4)) & (0x4 ^ 0x30 ^ "  ".length() ^ -" ".length())) == "   ".length()) {
                return null;
            }
        }
        catch (NoSuchFieldError noSuchFieldError39) {
            "".length();
        }
        try {
            llllllllllllIllIllIllllIIlIllIll[Options.STREAM_VOLUME_SYSTEM.ordinal()] = GameSettings.llIlIIIIIIIllI[37];
            "".length();
            if ((0x1E ^ 0x1A) != (0x65 ^ 0x61)) {
                return null;
            }
        }
        catch (NoSuchFieldError noSuchFieldError40) {
            "".length();
        }
        try {
            llllllllllllIllIllIllllIIlIllIll[Options.TOUCHSCREEN.ordinal()] = GameSettings.llIlIIIIIIIllI[27];
            "".length();
            if ((0x7E ^ 0x40 ^ (0x92 ^ 0xA8)) <= 0) {
                return null;
            }
        }
        catch (NoSuchFieldError noSuchFieldError41) {
            "".length();
        }
        try {
            llllllllllllIllIllIllllIIlIllIll[Options.USE_FULLSCREEN.ordinal()] = GameSettings.llIlIIIIIIIllI[22];
            "".length();
            if (-" ".length() >= (0x4 ^ 0x70 ^ (0xF2 ^ 0x82))) {
                return null;
            }
        }
        catch (NoSuchFieldError noSuchFieldError42) {
            "".length();
        }
        try {
            llllllllllllIllIllIllllIIlIllIll[Options.USE_VBO.ordinal()] = GameSettings.llIlIIIIIIIllI[26];
            "".length();
            if ("  ".length() > "   ".length()) {
                return null;
            }
        }
        catch (NoSuchFieldError noSuchFieldError43) {
            "".length();
        }
        try {
            llllllllllllIllIllIllllIIlIllIll[Options.VIEW_BOBBING.ordinal()] = GameSettings.llIlIIIIIIIllI[7];
            "".length();
            if (-" ".length() == "  ".length()) {
                return null;
            }
        }
        catch (NoSuchFieldError noSuchFieldError44) {
            "".length();
        }
        return GameSettings.$SWITCH_TABLE$net$minecraft$client$settings$GameSettings$Options = (int[])(Object)llllllllllllIllIllIllllIIlIllIll;
    }
    
    private void addClientKeybinds() {
        this.keyBindings = (KeyBinding[])ArrayUtils.add((Object[])this.keyBindings, (Object)this.HUD_CONFIG);
        this.keyBindings = (KeyBinding[])ArrayUtils.add((Object[])this.keyBindings, (Object)this.CLICK_GUI);
        this.keyBindings = (KeyBinding[])ArrayUtils.add((Object[])this.keyBindings, (Object)this.CLIENT_PERSPECTIVE);
        this.keyBindings = (KeyBinding[])ArrayUtils.add((Object[])this.keyBindings, (Object)this.ZOOM);
    }
    
    private static boolean lIIlIIIlIIIlIIII(final Object llllllllllllIllIllIlllIllllIIlll) {
        return llllllllllllIllIllIlllIllllIIlll != null;
    }
    
    public void saveOptions() {
        try {
            final PrintWriter llllllllllllIllIllIllllIlIIllIIl = new PrintWriter(new FileWriter(this.optionsFile));
            llllllllllllIllIllIllllIlIIllIIl.println(String.valueOf(new StringBuilder(GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[312]]).append(this.invertMouse)));
            llllllllllllIllIllIllllIlIIllIIl.println(String.valueOf(new StringBuilder(GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[313]]).append(this.mouseSensitivity)));
            llllllllllllIllIllIllllIlIIllIIl.println(String.valueOf(new StringBuilder(GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[314]]).append((this.fovSetting - 70.0f) / 40.0f)));
            llllllllllllIllIllIllllIlIIllIIl.println(String.valueOf(new StringBuilder(GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[315]]).append(this.gammaSetting)));
            llllllllllllIllIllIllllIlIIllIIl.println(String.valueOf(new StringBuilder(GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[316]]).append(this.saturation)));
            llllllllllllIllIllIllllIlIIllIIl.println(String.valueOf(new StringBuilder(GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[317]]).append(this.renderDistanceChunks)));
            llllllllllllIllIllIllllIlIIllIIl.println(String.valueOf(new StringBuilder(GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[318]]).append(this.guiScale)));
            llllllllllllIllIllIllllIlIIllIIl.println(String.valueOf(new StringBuilder(GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[319]]).append(this.particleSetting)));
            llllllllllllIllIllIllllIlIIllIIl.println(String.valueOf(new StringBuilder(GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[320]]).append(this.viewBobbing)));
            llllllllllllIllIllIllllIlIIllIIl.println(String.valueOf(new StringBuilder(GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[321]]).append(this.anaglyph)));
            llllllllllllIllIllIllllIlIIllIIl.println(String.valueOf(new StringBuilder(GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[322]]).append(this.limitFramerate)));
            llllllllllllIllIllIllllIlIIllIIl.println(String.valueOf(new StringBuilder(GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[323]]).append(this.fboEnable)));
            llllllllllllIllIllIllllIlIIllIIl.println(String.valueOf(new StringBuilder(GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[324]]).append(this.difficulty.getDifficultyId())));
            llllllllllllIllIllIllllIlIIllIIl.println(String.valueOf(new StringBuilder(GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[325]]).append(this.fancyGraphics)));
            llllllllllllIllIllIllllIlIIllIIl.println(String.valueOf(new StringBuilder(GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[326]]).append(this.ambientOcclusion)));
            switch (this.clouds) {
                case 0: {
                    llllllllllllIllIllIllllIlIIllIIl.println(GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[327]]);
                    "".length();
                    if ("  ".length() > (0xE4 ^ 0x9E ^ (0x23 ^ 0x5D))) {
                        return;
                    }
                    break;
                }
                case 1: {
                    llllllllllllIllIllIllllIlIIllIIl.println(GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[328]]);
                    "".length();
                    if (-(0x65 ^ 0x9 ^ (0x74 ^ 0x1C)) > 0) {
                        return;
                    }
                    break;
                }
                case 2: {
                    llllllllllllIllIllIllllIlIIllIIl.println(GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[329]]);
                    break;
                }
            }
            llllllllllllIllIllIllllIlIIllIIl.println(String.valueOf(new StringBuilder(GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[330]]).append(GameSettings.gson.toJson((Object)this.resourcePacks))));
            llllllllllllIllIllIllllIlIIllIIl.println(String.valueOf(new StringBuilder(GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[331]]).append(GameSettings.gson.toJson((Object)this.field_183018_l))));
            llllllllllllIllIllIllllIlIIllIIl.println(String.valueOf(new StringBuilder(GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[332]]).append(this.lastServer)));
            llllllllllllIllIllIllllIlIIllIIl.println(String.valueOf(new StringBuilder(GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[333]]).append(this.language)));
            llllllllllllIllIllIllllIlIIllIIl.println(String.valueOf(new StringBuilder(GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[334]]).append(this.chatVisibility.getChatVisibility())));
            llllllllllllIllIllIllllIlIIllIIl.println(String.valueOf(new StringBuilder(GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[335]]).append(this.chatColours)));
            llllllllllllIllIllIllllIlIIllIIl.println(String.valueOf(new StringBuilder(GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[336]]).append(this.chatLinks)));
            llllllllllllIllIllIllllIlIIllIIl.println(String.valueOf(new StringBuilder(GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[337]]).append(this.chatLinksPrompt)));
            llllllllllllIllIllIllllIlIIllIIl.println(String.valueOf(new StringBuilder(GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[338]]).append(this.chatOpacity)));
            llllllllllllIllIllIllllIlIIllIIl.println(String.valueOf(new StringBuilder(GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[339]]).append(this.snooperEnabled)));
            llllllllllllIllIllIllllIlIIllIIl.println(String.valueOf(new StringBuilder(GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[340]]).append(this.fullScreen)));
            llllllllllllIllIllIllllIlIIllIIl.println(String.valueOf(new StringBuilder(GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[341]]).append(this.enableVsync)));
            llllllllllllIllIllIllllIlIIllIIl.println(String.valueOf(new StringBuilder(GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[342]]).append(this.useVbo)));
            llllllllllllIllIllIllllIlIIllIIl.println(String.valueOf(new StringBuilder(GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[343]]).append(this.hideServerAddress)));
            llllllllllllIllIllIllllIlIIllIIl.println(String.valueOf(new StringBuilder(GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[344]]).append(this.advancedItemTooltips)));
            llllllllllllIllIllIllllIlIIllIIl.println(String.valueOf(new StringBuilder(GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[345]]).append(this.pauseOnLostFocus)));
            llllllllllllIllIllIllllIlIIllIIl.println(String.valueOf(new StringBuilder(GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[346]]).append(this.touchscreen)));
            llllllllllllIllIllIllllIlIIllIIl.println(String.valueOf(new StringBuilder(GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[347]]).append(this.overrideWidth)));
            llllllllllllIllIllIllllIlIIllIIl.println(String.valueOf(new StringBuilder(GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[348]]).append(this.overrideHeight)));
            llllllllllllIllIllIllllIlIIllIIl.println(String.valueOf(new StringBuilder(GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[349]]).append(this.heldItemTooltips)));
            llllllllllllIllIllIllllIlIIllIIl.println(String.valueOf(new StringBuilder(GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[350]]).append(this.chatHeightFocused)));
            llllllllllllIllIllIllllIlIIllIIl.println(String.valueOf(new StringBuilder(GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[351]]).append(this.chatHeightUnfocused)));
            llllllllllllIllIllIllllIlIIllIIl.println(String.valueOf(new StringBuilder(GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[352]]).append(this.chatScale)));
            llllllllllllIllIllIllllIlIIllIIl.println(String.valueOf(new StringBuilder(GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[353]]).append(this.chatWidth)));
            llllllllllllIllIllIllllIlIIllIIl.println(String.valueOf(new StringBuilder(GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[354]]).append(this.showInventoryAchievementHint)));
            llllllllllllIllIllIllllIlIIllIIl.println(String.valueOf(new StringBuilder(GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[355]]).append(this.mipmapLevels)));
            llllllllllllIllIllIllllIlIIllIIl.println(String.valueOf(new StringBuilder(GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[356]]).append(this.streamBytesPerPixel)));
            llllllllllllIllIllIllllIlIIllIIl.println(String.valueOf(new StringBuilder(GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[357]]).append(this.streamMicVolume)));
            llllllllllllIllIllIllllIlIIllIIl.println(String.valueOf(new StringBuilder(GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[358]]).append(this.streamGameVolume)));
            llllllllllllIllIllIllllIlIIllIIl.println(String.valueOf(new StringBuilder(GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[359]]).append(this.streamKbps)));
            llllllllllllIllIllIllllIlIIllIIl.println(String.valueOf(new StringBuilder(GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[360]]).append(this.streamFps)));
            llllllllllllIllIllIllllIlIIllIIl.println(String.valueOf(new StringBuilder(GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[361]]).append(this.streamCompression)));
            llllllllllllIllIllIllllIlIIllIIl.println(String.valueOf(new StringBuilder(GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[362]]).append(this.streamSendMetadata)));
            llllllllllllIllIllIllllIlIIllIIl.println(String.valueOf(new StringBuilder(GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[363]]).append(this.streamPreferredServer)));
            llllllllllllIllIllIllllIlIIllIIl.println(String.valueOf(new StringBuilder(GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[364]]).append(this.streamChatEnabled)));
            llllllllllllIllIllIllllIlIIllIIl.println(String.valueOf(new StringBuilder(GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[365]]).append(this.streamChatUserFilter)));
            llllllllllllIllIllIllllIlIIllIIl.println(String.valueOf(new StringBuilder(GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[366]]).append(this.streamMicToggleBehavior)));
            llllllllllllIllIllIllllIlIIllIIl.println(String.valueOf(new StringBuilder(GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[367]]).append(this.forceUnicodeFont)));
            llllllllllllIllIllIllllIlIIllIIl.println(String.valueOf(new StringBuilder(GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[368]]).append(this.allowBlockAlternatives)));
            llllllllllllIllIllIllllIlIIllIIl.println(String.valueOf(new StringBuilder(GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[369]]).append(this.reducedDebugInfo)));
            llllllllllllIllIllIllllIlIIllIIl.println(String.valueOf(new StringBuilder(GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[370]]).append(this.field_181150_U)));
            llllllllllllIllIllIllllIlIIllIIl.println(String.valueOf(new StringBuilder(GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[371]]).append(this.field_181151_V)));
            int llllllllllllIllIllIllllIlIIIllll;
            double llllllllllllIllIllIllllIlIIlIIII = ((KeyBinding[])(Object)(llllllllllllIllIllIllllIlIIIllll = (int)(Object)this.keyBindings)).length;
            long llllllllllllIllIllIllllIlIIlIIIl = GameSettings.llIlIIIIIIIllI[1];
            "".length();
            if ("   ".length() <= "  ".length()) {
                return;
            }
            while (!lIIlIIIlIIIIllIl((int)llllllllllllIllIllIllllIlIIlIIIl, (int)llllllllllllIllIllIllllIlIIlIIII)) {
                final KeyBinding llllllllllllIllIllIllllIlIIllIII = llllllllllllIllIllIllllIlIIIllll[llllllllllllIllIllIllllIlIIlIIIl];
                llllllllllllIllIllIllllIlIIllIIl.println(String.valueOf(new StringBuilder(GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[372]]).append(llllllllllllIllIllIllllIlIIllIII.getKeyDescription()).append(GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[373]]).append(llllllllllllIllIllIllllIlIIllIII.getKeyCode())));
                ++llllllllllllIllIllIllllIlIIlIIIl;
            }
            llllllllllllIllIllIllllIlIIlIIII = ((SoundCategory[])(Object)(llllllllllllIllIllIllllIlIIIllll = (int)(Object)SoundCategory.values())).length;
            llllllllllllIllIllIllllIlIIlIIIl = GameSettings.llIlIIIIIIIllI[1];
            "".length();
            if (" ".length() > " ".length()) {
                return;
            }
            while (!lIIlIIIlIIIIllIl((int)llllllllllllIllIllIllllIlIIlIIIl, (int)llllllllllllIllIllIllllIlIIlIIII)) {
                final SoundCategory llllllllllllIllIllIllllIlIIlIlll = llllllllllllIllIllIllllIlIIIllll[llllllllllllIllIllIllllIlIIlIIIl];
                llllllllllllIllIllIllllIlIIllIIl.println(String.valueOf(new StringBuilder(GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[374]]).append(llllllllllllIllIllIllllIlIIlIlll.getCategoryName()).append(GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[375]]).append(this.getSoundLevel(llllllllllllIllIllIllllIlIIlIlll))));
                ++llllllllllllIllIllIllllIlIIlIIIl;
            }
            llllllllllllIllIllIllllIlIIlIIII = ((EnumPlayerModelParts[])(Object)(llllllllllllIllIllIllllIlIIIllll = (int)(Object)EnumPlayerModelParts.values())).length;
            llllllllllllIllIllIllllIlIIlIIIl = GameSettings.llIlIIIIIIIllI[1];
            "".length();
            if (((0x40 ^ 0x77) & ~(0x93 ^ 0xA4)) < -" ".length()) {
                return;
            }
            while (!lIIlIIIlIIIIllIl((int)llllllllllllIllIllIllllIlIIlIIIl, (int)llllllllllllIllIllIllllIlIIlIIII)) {
                final EnumPlayerModelParts llllllllllllIllIllIllllIlIIlIllI = llllllllllllIllIllIllllIlIIIllll[llllllllllllIllIllIllllIlIIlIIIl];
                llllllllllllIllIllIllllIlIIllIIl.println(String.valueOf(new StringBuilder(GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[376]]).append(llllllllllllIllIllIllllIlIIlIllI.getPartName()).append(GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[377]]).append(this.setModelParts.contains(llllllllllllIllIllIllllIlIIlIllI))));
                ++llllllllllllIllIllIllllIlIIlIIIl;
            }
            llllllllllllIllIllIllllIlIIllIIl.close();
            "".length();
            if ("   ".length() <= 0) {
                return;
            }
        }
        catch (Exception llllllllllllIllIllIllllIlIIlIlIl) {
            GameSettings.logger.error(GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[378]], (Throwable)llllllllllllIllIllIllllIlIIlIlIl);
        }
        this.sendSettingsToServer();
    }
    
    public void setModelPartEnabled(final EnumPlayerModelParts llllllllllllIllIllIllllIIllIllIl, final boolean llllllllllllIllIllIllllIIllIlIIl) {
        if (lIIlIIIlIIIIIlII(llllllllllllIllIllIllllIIllIlIIl ? 1 : 0)) {
            this.setModelParts.add(llllllllllllIllIllIllllIIllIllIl);
            "".length();
            "".length();
            if (null != null) {
                return;
            }
        }
        else {
            this.setModelParts.remove(llllllllllllIllIllIllllIIllIllIl);
            "".length();
        }
        this.sendSettingsToServer();
    }
    
    private static boolean lIIlIIIlIIIIllII(final int llllllllllllIllIllIlllIlllIllIII, final int llllllllllllIllIllIlllIlllIlIlll) {
        return llllllllllllIllIllIlllIlllIllIII != llllllllllllIllIllIlllIlllIlIlll;
    }
    
    public void loadOptions() {
        try {
            if (lIIlIIIlIIIIlIII(this.optionsFile.exists() ? 1 : 0)) {
                return;
            }
            final BufferedReader llllllllllllIllIllIllllIlIllIlII = new BufferedReader(new FileReader(this.optionsFile));
            String llllllllllllIllIllIllllIlIllIIll = GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[216]];
            this.mapSoundLevels.clear();
            "".length();
            if (((0x65 ^ 0x27) & ~(0x53 ^ 0x11)) != 0x0) {
                return;
            }
            while (!lIIlIIIlIIIIllll(llllllllllllIllIllIllllIlIllIIll = llllllllllllIllIllIllllIlIllIlII.readLine())) {
                try {
                    final String[] llllllllllllIllIllIllllIlIllIIlI = llllllllllllIllIllIllllIlIllIIll.split(GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[217]]);
                    if (lIIlIIIlIIIIIlII(llllllllllllIllIllIllllIlIllIIlI[GameSettings.llIlIIIIIIIllI[1]].equals(GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[218]]) ? 1 : 0)) {
                        this.mouseSensitivity = this.parseFloat(llllllllllllIllIllIllllIlIllIIlI[GameSettings.llIlIIIIIIIllI[2]]);
                    }
                    if (lIIlIIIlIIIIIlII(llllllllllllIllIllIllllIlIllIIlI[GameSettings.llIlIIIIIIIllI[1]].equals(GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[219]]) ? 1 : 0)) {
                        this.fovSetting = this.parseFloat(llllllllllllIllIllIllllIlIllIIlI[GameSettings.llIlIIIIIIIllI[2]]) * 40.0f + 70.0f;
                    }
                    if (lIIlIIIlIIIIIlII(llllllllllllIllIllIllllIlIllIIlI[GameSettings.llIlIIIIIIIllI[1]].equals(GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[220]]) ? 1 : 0)) {
                        this.gammaSetting = this.parseFloat(llllllllllllIllIllIllllIlIllIIlI[GameSettings.llIlIIIIIIIllI[2]]);
                    }
                    if (lIIlIIIlIIIIIlII(llllllllllllIllIllIllllIlIllIIlI[GameSettings.llIlIIIIIIIllI[1]].equals(GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[221]]) ? 1 : 0)) {
                        this.saturation = this.parseFloat(llllllllllllIllIllIllllIlIllIIlI[GameSettings.llIlIIIIIIIllI[2]]);
                    }
                    if (lIIlIIIlIIIIIlII(llllllllllllIllIllIllllIlIllIIlI[GameSettings.llIlIIIIIIIllI[1]].equals(GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[222]]) ? 1 : 0)) {
                        this.invertMouse = llllllllllllIllIllIllllIlIllIIlI[GameSettings.llIlIIIIIIIllI[2]].equals(GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[223]]);
                    }
                    if (lIIlIIIlIIIIIlII(llllllllllllIllIllIllllIlIllIIlI[GameSettings.llIlIIIIIIIllI[1]].equals(GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[224]]) ? 1 : 0)) {
                        this.renderDistanceChunks = Integer.parseInt(llllllllllllIllIllIllllIlIllIIlI[GameSettings.llIlIIIIIIIllI[2]]);
                    }
                    if (lIIlIIIlIIIIIlII(llllllllllllIllIllIllllIlIllIIlI[GameSettings.llIlIIIIIIIllI[1]].equals(GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[225]]) ? 1 : 0)) {
                        this.guiScale = Integer.parseInt(llllllllllllIllIllIllllIlIllIIlI[GameSettings.llIlIIIIIIIllI[2]]);
                    }
                    if (lIIlIIIlIIIIIlII(llllllllllllIllIllIllllIlIllIIlI[GameSettings.llIlIIIIIIIllI[1]].equals(GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[226]]) ? 1 : 0)) {
                        this.particleSetting = Integer.parseInt(llllllllllllIllIllIllllIlIllIIlI[GameSettings.llIlIIIIIIIllI[2]]);
                    }
                    if (lIIlIIIlIIIIIlII(llllllllllllIllIllIllllIlIllIIlI[GameSettings.llIlIIIIIIIllI[1]].equals(GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[227]]) ? 1 : 0)) {
                        this.viewBobbing = llllllllllllIllIllIllllIlIllIIlI[GameSettings.llIlIIIIIIIllI[2]].equals(GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[228]]);
                    }
                    if (lIIlIIIlIIIIIlII(llllllllllllIllIllIllllIlIllIIlI[GameSettings.llIlIIIIIIIllI[1]].equals(GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[229]]) ? 1 : 0)) {
                        this.anaglyph = llllllllllllIllIllIllllIlIllIIlI[GameSettings.llIlIIIIIIIllI[2]].equals(GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[230]]);
                    }
                    if (lIIlIIIlIIIIIlII(llllllllllllIllIllIllllIlIllIIlI[GameSettings.llIlIIIIIIIllI[1]].equals(GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[231]]) ? 1 : 0)) {
                        this.limitFramerate = Integer.parseInt(llllllllllllIllIllIllllIlIllIIlI[GameSettings.llIlIIIIIIIllI[2]]);
                    }
                    if (lIIlIIIlIIIIIlII(llllllllllllIllIllIllllIlIllIIlI[GameSettings.llIlIIIIIIIllI[1]].equals(GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[232]]) ? 1 : 0)) {
                        this.fboEnable = llllllllllllIllIllIllllIlIllIIlI[GameSettings.llIlIIIIIIIllI[2]].equals(GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[233]]);
                    }
                    if (lIIlIIIlIIIIIlII(llllllllllllIllIllIllllIlIllIIlI[GameSettings.llIlIIIIIIIllI[1]].equals(GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[234]]) ? 1 : 0)) {
                        this.difficulty = EnumDifficulty.getDifficultyEnum(Integer.parseInt(llllllllllllIllIllIllllIlIllIIlI[GameSettings.llIlIIIIIIIllI[2]]));
                    }
                    if (lIIlIIIlIIIIIlII(llllllllllllIllIllIllllIlIllIIlI[GameSettings.llIlIIIIIIIllI[1]].equals(GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[235]]) ? 1 : 0)) {
                        this.fancyGraphics = llllllllllllIllIllIllllIlIllIIlI[GameSettings.llIlIIIIIIIllI[2]].equals(GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[236]]);
                    }
                    if (lIIlIIIlIIIIIlII(llllllllllllIllIllIllllIlIllIIlI[GameSettings.llIlIIIIIIIllI[1]].equals(GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[237]]) ? 1 : 0)) {
                        if (lIIlIIIlIIIIIlII(llllllllllllIllIllIllllIlIllIIlI[GameSettings.llIlIIIIIIIllI[2]].equals(GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[238]]) ? 1 : 0)) {
                            this.ambientOcclusion = GameSettings.llIlIIIIIIIllI[3];
                            "".length();
                            if ((0x74 ^ 0x34 ^ (0xC ^ 0x48)) <= -" ".length()) {
                                return;
                            }
                        }
                        else if (lIIlIIIlIIIIIlII(llllllllllllIllIllIllllIlIllIIlI[GameSettings.llIlIIIIIIIllI[2]].equals(GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[239]]) ? 1 : 0)) {
                            this.ambientOcclusion = GameSettings.llIlIIIIIIIllI[1];
                            "".length();
                            if (-"  ".length() >= 0) {
                                return;
                            }
                        }
                        else {
                            this.ambientOcclusion = Integer.parseInt(llllllllllllIllIllIllllIlIllIIlI[GameSettings.llIlIIIIIIIllI[2]]);
                        }
                    }
                    if (lIIlIIIlIIIIIlII(llllllllllllIllIllIllllIlIllIIlI[GameSettings.llIlIIIIIIIllI[1]].equals(GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[240]]) ? 1 : 0)) {
                        if (lIIlIIIlIIIIIlII(llllllllllllIllIllIllllIlIllIIlI[GameSettings.llIlIIIIIIIllI[2]].equals(GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[241]]) ? 1 : 0)) {
                            this.clouds = GameSettings.llIlIIIIIIIllI[3];
                            "".length();
                            if (-" ".length() >= 0) {
                                return;
                            }
                        }
                        else if (lIIlIIIlIIIIIlII(llllllllllllIllIllIllllIlIllIIlI[GameSettings.llIlIIIIIIIllI[2]].equals(GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[242]]) ? 1 : 0)) {
                            this.clouds = GameSettings.llIlIIIIIIIllI[1];
                            "".length();
                            if (((0x84 ^ 0xAE ^ (0x48 ^ 0x51)) & (0x37 ^ 0x14 ^ (0xB6 ^ 0xA6) ^ -" ".length())) >= (106 + 97 - 181 + 114 ^ 48 + 82 - 80 + 90)) {
                                return;
                            }
                        }
                        else if (lIIlIIIlIIIIIlII(llllllllllllIllIllIllllIlIllIIlI[GameSettings.llIlIIIIIIIllI[2]].equals(GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[243]]) ? 1 : 0)) {
                            this.clouds = GameSettings.llIlIIIIIIIllI[2];
                        }
                    }
                    if (lIIlIIIlIIIIIlII(llllllllllllIllIllIllllIlIllIIlI[GameSettings.llIlIIIIIIIllI[1]].equals(GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[244]]) ? 1 : 0)) {
                        this.resourcePacks = (List<String>)GameSettings.gson.fromJson(llllllllllllIllIllIllllIlIllIIll.substring(llllllllllllIllIllIllllIlIllIIll.indexOf(GameSettings.llIlIIIIIIIllI[65]) + GameSettings.llIlIIIIIIIllI[2]), (Type)GameSettings.typeListString);
                        if (lIIlIIIlIIIIllll(this.resourcePacks)) {
                            this.resourcePacks = (List<String>)Lists.newArrayList();
                        }
                    }
                    if (lIIlIIIlIIIIIlII(llllllllllllIllIllIllllIlIllIIlI[GameSettings.llIlIIIIIIIllI[1]].equals(GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[245]]) ? 1 : 0)) {
                        this.field_183018_l = (List<String>)GameSettings.gson.fromJson(llllllllllllIllIllIllllIlIllIIll.substring(llllllllllllIllIllIllllIlIllIIll.indexOf(GameSettings.llIlIIIIIIIllI[65]) + GameSettings.llIlIIIIIIIllI[2]), (Type)GameSettings.typeListString);
                        if (lIIlIIIlIIIIllll(this.field_183018_l)) {
                            this.field_183018_l = (List<String>)Lists.newArrayList();
                        }
                    }
                    if (lIIlIIIlIIIIIlII(llllllllllllIllIllIllllIlIllIIlI[GameSettings.llIlIIIIIIIllI[1]].equals(GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[246]]) ? 1 : 0) && lIIlIIIlIIIIllIl(llllllllllllIllIllIllllIlIllIIlI.length, GameSettings.llIlIIIIIIIllI[3])) {
                        this.lastServer = llllllllllllIllIllIllllIlIllIIll.substring(llllllllllllIllIllIllllIlIllIIll.indexOf(GameSettings.llIlIIIIIIIllI[65]) + GameSettings.llIlIIIIIIIllI[2]);
                    }
                    if (lIIlIIIlIIIIIlII(llllllllllllIllIllIllllIlIllIIlI[GameSettings.llIlIIIIIIIllI[1]].equals(GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[247]]) ? 1 : 0) && lIIlIIIlIIIIllIl(llllllllllllIllIllIllllIlIllIIlI.length, GameSettings.llIlIIIIIIIllI[3])) {
                        this.language = llllllllllllIllIllIllllIlIllIIlI[GameSettings.llIlIIIIIIIllI[2]];
                    }
                    if (lIIlIIIlIIIIIlII(llllllllllllIllIllIllllIlIllIIlI[GameSettings.llIlIIIIIIIllI[1]].equals(GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[248]]) ? 1 : 0)) {
                        this.chatVisibility = EntityPlayer.EnumChatVisibility.getEnumChatVisibility(Integer.parseInt(llllllllllllIllIllIllllIlIllIIlI[GameSettings.llIlIIIIIIIllI[2]]));
                    }
                    if (lIIlIIIlIIIIIlII(llllllllllllIllIllIllllIlIllIIlI[GameSettings.llIlIIIIIIIllI[1]].equals(GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[249]]) ? 1 : 0)) {
                        this.chatColours = llllllllllllIllIllIllllIlIllIIlI[GameSettings.llIlIIIIIIIllI[2]].equals(GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[250]]);
                    }
                    if (lIIlIIIlIIIIIlII(llllllllllllIllIllIllllIlIllIIlI[GameSettings.llIlIIIIIIIllI[1]].equals(GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[251]]) ? 1 : 0)) {
                        this.chatLinks = llllllllllllIllIllIllllIlIllIIlI[GameSettings.llIlIIIIIIIllI[2]].equals(GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[252]]);
                    }
                    if (lIIlIIIlIIIIIlII(llllllllllllIllIllIllllIlIllIIlI[GameSettings.llIlIIIIIIIllI[1]].equals(GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[253]]) ? 1 : 0)) {
                        this.chatLinksPrompt = llllllllllllIllIllIllllIlIllIIlI[GameSettings.llIlIIIIIIIllI[2]].equals(GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[254]]);
                    }
                    if (lIIlIIIlIIIIIlII(llllllllllllIllIllIllllIlIllIIlI[GameSettings.llIlIIIIIIIllI[1]].equals(GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[255]]) ? 1 : 0)) {
                        this.chatOpacity = this.parseFloat(llllllllllllIllIllIllllIlIllIIlI[GameSettings.llIlIIIIIIIllI[2]]);
                    }
                    if (lIIlIIIlIIIIIlII(llllllllllllIllIllIllllIlIllIIlI[GameSettings.llIlIIIIIIIllI[1]].equals(GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[256]]) ? 1 : 0)) {
                        this.snooperEnabled = llllllllllllIllIllIllllIlIllIIlI[GameSettings.llIlIIIIIIIllI[2]].equals(GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[257]]);
                    }
                    if (lIIlIIIlIIIIIlII(llllllllllllIllIllIllllIlIllIIlI[GameSettings.llIlIIIIIIIllI[1]].equals(GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[258]]) ? 1 : 0)) {
                        this.fullScreen = llllllllllllIllIllIllllIlIllIIlI[GameSettings.llIlIIIIIIIllI[2]].equals(GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[259]]);
                    }
                    if (lIIlIIIlIIIIIlII(llllllllllllIllIllIllllIlIllIIlI[GameSettings.llIlIIIIIIIllI[1]].equals(GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[260]]) ? 1 : 0)) {
                        this.enableVsync = llllllllllllIllIllIllllIlIllIIlI[GameSettings.llIlIIIIIIIllI[2]].equals(GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[184]]);
                    }
                    if (lIIlIIIlIIIIIlII(llllllllllllIllIllIllllIlIllIIlI[GameSettings.llIlIIIIIIIllI[1]].equals(GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[261]]) ? 1 : 0)) {
                        this.useVbo = llllllllllllIllIllIllllIlIllIIlI[GameSettings.llIlIIIIIIIllI[2]].equals(GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[262]]);
                    }
                    if (lIIlIIIlIIIIIlII(llllllllllllIllIllIllllIlIllIIlI[GameSettings.llIlIIIIIIIllI[1]].equals(GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[263]]) ? 1 : 0)) {
                        this.hideServerAddress = llllllllllllIllIllIllllIlIllIIlI[GameSettings.llIlIIIIIIIllI[2]].equals(GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[264]]);
                    }
                    if (lIIlIIIlIIIIIlII(llllllllllllIllIllIllllIlIllIIlI[GameSettings.llIlIIIIIIIllI[1]].equals(GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[265]]) ? 1 : 0)) {
                        this.advancedItemTooltips = llllllllllllIllIllIllllIlIllIIlI[GameSettings.llIlIIIIIIIllI[2]].equals(GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[266]]);
                    }
                    if (lIIlIIIlIIIIIlII(llllllllllllIllIllIllllIlIllIIlI[GameSettings.llIlIIIIIIIllI[1]].equals(GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[267]]) ? 1 : 0)) {
                        this.pauseOnLostFocus = llllllllllllIllIllIllllIlIllIIlI[GameSettings.llIlIIIIIIIllI[2]].equals(GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[268]]);
                    }
                    if (lIIlIIIlIIIIIlII(llllllllllllIllIllIllllIlIllIIlI[GameSettings.llIlIIIIIIIllI[1]].equals(GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[269]]) ? 1 : 0)) {
                        this.touchscreen = llllllllllllIllIllIllllIlIllIIlI[GameSettings.llIlIIIIIIIllI[2]].equals(GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[270]]);
                    }
                    if (lIIlIIIlIIIIIlII(llllllllllllIllIllIllllIlIllIIlI[GameSettings.llIlIIIIIIIllI[1]].equals(GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[271]]) ? 1 : 0)) {
                        this.overrideHeight = Integer.parseInt(llllllllllllIllIllIllllIlIllIIlI[GameSettings.llIlIIIIIIIllI[2]]);
                    }
                    if (lIIlIIIlIIIIIlII(llllllllllllIllIllIllllIlIllIIlI[GameSettings.llIlIIIIIIIllI[1]].equals(GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[272]]) ? 1 : 0)) {
                        this.overrideWidth = Integer.parseInt(llllllllllllIllIllIllllIlIllIIlI[GameSettings.llIlIIIIIIIllI[2]]);
                    }
                    if (lIIlIIIlIIIIIlII(llllllllllllIllIllIllllIlIllIIlI[GameSettings.llIlIIIIIIIllI[1]].equals(GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[273]]) ? 1 : 0)) {
                        this.heldItemTooltips = llllllllllllIllIllIllllIlIllIIlI[GameSettings.llIlIIIIIIIllI[2]].equals(GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[274]]);
                    }
                    if (lIIlIIIlIIIIIlII(llllllllllllIllIllIllllIlIllIIlI[GameSettings.llIlIIIIIIIllI[1]].equals(GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[275]]) ? 1 : 0)) {
                        this.chatHeightFocused = this.parseFloat(llllllllllllIllIllIllllIlIllIIlI[GameSettings.llIlIIIIIIIllI[2]]);
                    }
                    if (lIIlIIIlIIIIIlII(llllllllllllIllIllIllllIlIllIIlI[GameSettings.llIlIIIIIIIllI[1]].equals(GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[276]]) ? 1 : 0)) {
                        this.chatHeightUnfocused = this.parseFloat(llllllllllllIllIllIllllIlIllIIlI[GameSettings.llIlIIIIIIIllI[2]]);
                    }
                    if (lIIlIIIlIIIIIlII(llllllllllllIllIllIllllIlIllIIlI[GameSettings.llIlIIIIIIIllI[1]].equals(GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[277]]) ? 1 : 0)) {
                        this.chatScale = this.parseFloat(llllllllllllIllIllIllllIlIllIIlI[GameSettings.llIlIIIIIIIllI[2]]);
                    }
                    if (lIIlIIIlIIIIIlII(llllllllllllIllIllIllllIlIllIIlI[GameSettings.llIlIIIIIIIllI[1]].equals(GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[278]]) ? 1 : 0)) {
                        this.chatWidth = this.parseFloat(llllllllllllIllIllIllllIlIllIIlI[GameSettings.llIlIIIIIIIllI[2]]);
                    }
                    if (lIIlIIIlIIIIIlII(llllllllllllIllIllIllllIlIllIIlI[GameSettings.llIlIIIIIIIllI[1]].equals(GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[279]]) ? 1 : 0)) {
                        this.showInventoryAchievementHint = llllllllllllIllIllIllllIlIllIIlI[GameSettings.llIlIIIIIIIllI[2]].equals(GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[280]]);
                    }
                    if (lIIlIIIlIIIIIlII(llllllllllllIllIllIllllIlIllIIlI[GameSettings.llIlIIIIIIIllI[1]].equals(GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[281]]) ? 1 : 0)) {
                        this.mipmapLevels = Integer.parseInt(llllllllllllIllIllIllllIlIllIIlI[GameSettings.llIlIIIIIIIllI[2]]);
                    }
                    if (lIIlIIIlIIIIIlII(llllllllllllIllIllIllllIlIllIIlI[GameSettings.llIlIIIIIIIllI[1]].equals(GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[282]]) ? 1 : 0)) {
                        this.streamBytesPerPixel = this.parseFloat(llllllllllllIllIllIllllIlIllIIlI[GameSettings.llIlIIIIIIIllI[2]]);
                    }
                    if (lIIlIIIlIIIIIlII(llllllllllllIllIllIllllIlIllIIlI[GameSettings.llIlIIIIIIIllI[1]].equals(GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[283]]) ? 1 : 0)) {
                        this.streamMicVolume = this.parseFloat(llllllllllllIllIllIllllIlIllIIlI[GameSettings.llIlIIIIIIIllI[2]]);
                    }
                    if (lIIlIIIlIIIIIlII(llllllllllllIllIllIllllIlIllIIlI[GameSettings.llIlIIIIIIIllI[1]].equals(GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[284]]) ? 1 : 0)) {
                        this.streamGameVolume = this.parseFloat(llllllllllllIllIllIllllIlIllIIlI[GameSettings.llIlIIIIIIIllI[2]]);
                    }
                    if (lIIlIIIlIIIIIlII(llllllllllllIllIllIllllIlIllIIlI[GameSettings.llIlIIIIIIIllI[1]].equals(GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[285]]) ? 1 : 0)) {
                        this.streamKbps = this.parseFloat(llllllllllllIllIllIllllIlIllIIlI[GameSettings.llIlIIIIIIIllI[2]]);
                    }
                    if (lIIlIIIlIIIIIlII(llllllllllllIllIllIllllIlIllIIlI[GameSettings.llIlIIIIIIIllI[1]].equals(GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[286]]) ? 1 : 0)) {
                        this.streamFps = this.parseFloat(llllllllllllIllIllIllllIlIllIIlI[GameSettings.llIlIIIIIIIllI[2]]);
                    }
                    if (lIIlIIIlIIIIIlII(llllllllllllIllIllIllllIlIllIIlI[GameSettings.llIlIIIIIIIllI[1]].equals(GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[287]]) ? 1 : 0)) {
                        this.streamCompression = Integer.parseInt(llllllllllllIllIllIllllIlIllIIlI[GameSettings.llIlIIIIIIIllI[2]]);
                    }
                    if (lIIlIIIlIIIIIlII(llllllllllllIllIllIllllIlIllIIlI[GameSettings.llIlIIIIIIIllI[1]].equals(GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[288]]) ? 1 : 0)) {
                        this.streamSendMetadata = llllllllllllIllIllIllllIlIllIIlI[GameSettings.llIlIIIIIIIllI[2]].equals(GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[289]]);
                    }
                    if (lIIlIIIlIIIIIlII(llllllllllllIllIllIllllIlIllIIlI[GameSettings.llIlIIIIIIIllI[1]].equals(GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[290]]) ? 1 : 0) && lIIlIIIlIIIIllIl(llllllllllllIllIllIllllIlIllIIlI.length, GameSettings.llIlIIIIIIIllI[3])) {
                        this.streamPreferredServer = llllllllllllIllIllIllllIlIllIIll.substring(llllllllllllIllIllIllllIlIllIIll.indexOf(GameSettings.llIlIIIIIIIllI[65]) + GameSettings.llIlIIIIIIIllI[2]);
                    }
                    if (lIIlIIIlIIIIIlII(llllllllllllIllIllIllllIlIllIIlI[GameSettings.llIlIIIIIIIllI[1]].equals(GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[291]]) ? 1 : 0)) {
                        this.streamChatEnabled = Integer.parseInt(llllllllllllIllIllIllllIlIllIIlI[GameSettings.llIlIIIIIIIllI[2]]);
                    }
                    if (lIIlIIIlIIIIIlII(llllllllllllIllIllIllllIlIllIIlI[GameSettings.llIlIIIIIIIllI[1]].equals(GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[292]]) ? 1 : 0)) {
                        this.streamChatUserFilter = Integer.parseInt(llllllllllllIllIllIllllIlIllIIlI[GameSettings.llIlIIIIIIIllI[2]]);
                    }
                    if (lIIlIIIlIIIIIlII(llllllllllllIllIllIllllIlIllIIlI[GameSettings.llIlIIIIIIIllI[1]].equals(GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[293]]) ? 1 : 0)) {
                        this.streamMicToggleBehavior = Integer.parseInt(llllllllllllIllIllIllllIlIllIIlI[GameSettings.llIlIIIIIIIllI[2]]);
                    }
                    if (lIIlIIIlIIIIIlII(llllllllllllIllIllIllllIlIllIIlI[GameSettings.llIlIIIIIIIllI[1]].equals(GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[294]]) ? 1 : 0)) {
                        this.forceUnicodeFont = llllllllllllIllIllIllllIlIllIIlI[GameSettings.llIlIIIIIIIllI[2]].equals(GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[295]]);
                    }
                    if (lIIlIIIlIIIIIlII(llllllllllllIllIllIllllIlIllIIlI[GameSettings.llIlIIIIIIIllI[1]].equals(GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[296]]) ? 1 : 0)) {
                        this.allowBlockAlternatives = llllllllllllIllIllIllllIlIllIIlI[GameSettings.llIlIIIIIIIllI[2]].equals(GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[297]]);
                    }
                    if (lIIlIIIlIIIIIlII(llllllllllllIllIllIllllIlIllIIlI[GameSettings.llIlIIIIIIIllI[1]].equals(GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[298]]) ? 1 : 0)) {
                        this.reducedDebugInfo = llllllllllllIllIllIllllIlIllIIlI[GameSettings.llIlIIIIIIIllI[2]].equals(GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[299]]);
                    }
                    if (lIIlIIIlIIIIIlII(llllllllllllIllIllIllllIlIllIIlI[GameSettings.llIlIIIIIIIllI[1]].equals(GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[300]]) ? 1 : 0)) {
                        this.field_181150_U = llllllllllllIllIllIllllIlIllIIlI[GameSettings.llIlIIIIIIIllI[2]].equals(GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[301]]);
                    }
                    if (lIIlIIIlIIIIIlII(llllllllllllIllIllIllllIlIllIIlI[GameSettings.llIlIIIIIIIllI[1]].equals(GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[302]]) ? 1 : 0)) {
                        this.field_181151_V = llllllllllllIllIllIllllIlIllIIlI[GameSettings.llIlIIIIIIIllI[2]].equals(GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[303]]);
                    }
                    double llllllllllllIllIllIllllIlIlIIlIl;
                    String llllllllllllIllIllIllllIlIlIIllI = (String)((KeyBinding[])(Object)(llllllllllllIllIllIllllIlIlIIlIl = (double)(Object)this.keyBindings)).length;
                    short llllllllllllIllIllIllllIlIlIIlll = (short)GameSettings.llIlIIIIIIIllI[1];
                    "".length();
                    if (-"   ".length() > 0) {
                        return;
                    }
                    while (!lIIlIIIlIIIIllIl(llllllllllllIllIllIllllIlIlIIlll, (int)llllllllllllIllIllIllllIlIlIIllI)) {
                        final KeyBinding llllllllllllIllIllIllllIlIllIIIl = llllllllllllIllIllIllllIlIlIIlIl[llllllllllllIllIllIllllIlIlIIlll];
                        if (lIIlIIIlIIIIIlII(llllllllllllIllIllIllllIlIllIIlI[GameSettings.llIlIIIIIIIllI[1]].equals(String.valueOf(new StringBuilder(GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[304]]).append(llllllllllllIllIllIllllIlIllIIIl.getKeyDescription()))) ? 1 : 0)) {
                            llllllllllllIllIllIllllIlIllIIIl.setKeyCode(Integer.parseInt(llllllllllllIllIllIllllIlIllIIlI[GameSettings.llIlIIIIIIIllI[2]]));
                        }
                        ++llllllllllllIllIllIllllIlIlIIlll;
                    }
                    llllllllllllIllIllIllllIlIlIIllI = (String)((SoundCategory[])(Object)(llllllllllllIllIllIllllIlIlIIlIl = (double)(Object)SoundCategory.values())).length;
                    llllllllllllIllIllIllllIlIlIIlll = (short)GameSettings.llIlIIIIIIIllI[1];
                    "".length();
                    if ((3 + 34 + 28 + 73 ^ 48 + 27 + 47 + 20) < 0) {
                        return;
                    }
                    while (!lIIlIIIlIIIIllIl(llllllllllllIllIllIllllIlIlIIlll, (int)llllllllllllIllIllIllllIlIlIIllI)) {
                        final SoundCategory llllllllllllIllIllIllllIlIllIIII = llllllllllllIllIllIllllIlIlIIlIl[llllllllllllIllIllIllllIlIlIIlll];
                        if (lIIlIIIlIIIIIlII(llllllllllllIllIllIllllIlIllIIlI[GameSettings.llIlIIIIIIIllI[1]].equals(String.valueOf(new StringBuilder(GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[305]]).append(llllllllllllIllIllIllllIlIllIIII.getCategoryName()))) ? 1 : 0)) {
                            this.mapSoundLevels.put(llllllllllllIllIllIllllIlIllIIII, this.parseFloat(llllllllllllIllIllIllllIlIllIIlI[GameSettings.llIlIIIIIIIllI[2]]));
                            "".length();
                        }
                        ++llllllllllllIllIllIllllIlIlIIlll;
                    }
                    llllllllllllIllIllIllllIlIlIIllI = (String)((EnumPlayerModelParts[])(Object)(llllllllllllIllIllIllllIlIlIIlIl = (double)(Object)EnumPlayerModelParts.values())).length;
                    llllllllllllIllIllIllllIlIlIIlll = (short)GameSettings.llIlIIIIIIIllI[1];
                    "".length();
                    if (" ".length() == "   ".length()) {
                        return;
                    }
                    while (!lIIlIIIlIIIIllIl(llllllllllllIllIllIllllIlIlIIlll, (int)llllllllllllIllIllIllllIlIlIIllI)) {
                        final EnumPlayerModelParts llllllllllllIllIllIllllIlIlIllll = llllllllllllIllIllIllllIlIlIIlIl[llllllllllllIllIllIllllIlIlIIlll];
                        if (lIIlIIIlIIIIIlII(llllllllllllIllIllIllllIlIllIIlI[GameSettings.llIlIIIIIIIllI[1]].equals(String.valueOf(new StringBuilder(GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[306]]).append(llllllllllllIllIllIllllIlIlIllll.getPartName()))) ? 1 : 0)) {
                            this.setModelPartEnabled(llllllllllllIllIllIllllIlIlIllll, llllllllllllIllIllIllllIlIllIIlI[GameSettings.llIlIIIIIIIllI[2]].equals(GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[307]]));
                        }
                        ++llllllllllllIllIllIllllIlIlIIlll;
                    }
                    "".length();
                    if (null != null) {
                        return;
                    }
                    continue;
                }
                catch (Exception llllllllllllIllIllIllllIlIlIlllI) {
                    GameSettings.logger.warn(String.valueOf(new StringBuilder(GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[308]]).append(llllllllllllIllIllIllllIlIllIIll)));
                }
            }
            KeyBinding.resetKeyBindingArrayAndHash();
            llllllllllllIllIllIllllIlIllIlII.close();
            "".length();
            if (-"   ".length() >= 0) {
                return;
            }
        }
        catch (Exception llllllllllllIllIllIllllIlIlIllIl) {
            GameSettings.logger.error(GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[309]], (Throwable)llllllllllllIllIllIllllIlIlIllIl);
        }
    }
    
    public boolean func_181148_f() {
        return this.field_181150_U;
    }
    
    public void setOptionValue(final Options llllllllllllIllIllIllllIlllIIIlI, final int llllllllllllIllIllIllllIlllIIlII) {
        if (lIIlIIIlIIIIlIlI(llllllllllllIllIllIllllIlllIIIlI, Options.INVERT_MOUSE)) {
            int invertMouse;
            if (lIIlIIIlIIIIIlII(this.invertMouse ? 1 : 0)) {
                invertMouse = GameSettings.llIlIIIIIIIllI[1];
                "".length();
                if ((0xE2 ^ 0xBC ^ (0x5B ^ 0x1)) < 0) {
                    return;
                }
            }
            else {
                invertMouse = GameSettings.llIlIIIIIIIllI[2];
            }
            this.invertMouse = (invertMouse != 0);
        }
        if (lIIlIIIlIIIIlIlI(llllllllllllIllIllIllllIlllIIIlI, Options.GUI_SCALE)) {
            this.guiScale = (this.guiScale + llllllllllllIllIllIllllIlllIIlII & GameSettings.llIlIIIIIIIllI[4]);
        }
        if (lIIlIIIlIIIIlIlI(llllllllllllIllIllIllllIlllIIIlI, Options.PARTICLES)) {
            this.particleSetting = (this.particleSetting + llllllllllllIllIllIllllIlllIIlII) % GameSettings.llIlIIIIIIIllI[4];
        }
        if (lIIlIIIlIIIIlIlI(llllllllllllIllIllIllllIlllIIIlI, Options.VIEW_BOBBING)) {
            int viewBobbing;
            if (lIIlIIIlIIIIIlII(this.viewBobbing ? 1 : 0)) {
                viewBobbing = GameSettings.llIlIIIIIIIllI[1];
                "".length();
                if ("   ".length() == 0) {
                    return;
                }
            }
            else {
                viewBobbing = GameSettings.llIlIIIIIIIllI[2];
            }
            this.viewBobbing = (viewBobbing != 0);
        }
        if (lIIlIIIlIIIIlIlI(llllllllllllIllIllIllllIlllIIIlI, Options.RENDER_CLOUDS)) {
            this.clouds = (this.clouds + llllllllllllIllIllIllllIlllIIlII) % GameSettings.llIlIIIIIIIllI[4];
        }
        if (lIIlIIIlIIIIlIlI(llllllllllllIllIllIllllIlllIIIlI, Options.FORCE_UNICODE_FONT)) {
            int forceUnicodeFont;
            if (lIIlIIIlIIIIIlII(this.forceUnicodeFont ? 1 : 0)) {
                forceUnicodeFont = GameSettings.llIlIIIIIIIllI[1];
                "".length();
                if (-" ".length() != -" ".length()) {
                    return;
                }
            }
            else {
                forceUnicodeFont = GameSettings.llIlIIIIIIIllI[2];
            }
            this.forceUnicodeFont = (forceUnicodeFont != 0);
            final FontRenderer fontRendererObj = this.mc.fontRendererObj;
            int unicodeFlag;
            if (lIIlIIIlIIIIlIII(this.mc.getLanguageManager().isCurrentLocaleUnicode() ? 1 : 0) && lIIlIIIlIIIIlIII(this.forceUnicodeFont ? 1 : 0)) {
                unicodeFlag = GameSettings.llIlIIIIIIIllI[1];
                "".length();
                if ((34 + 5 + 75 + 48 ^ 66 + 98 - 105 + 108) <= 0) {
                    return;
                }
            }
            else {
                unicodeFlag = GameSettings.llIlIIIIIIIllI[2];
            }
            fontRendererObj.setUnicodeFlag((boolean)(unicodeFlag != 0));
        }
        if (lIIlIIIlIIIIlIlI(llllllllllllIllIllIllllIlllIIIlI, Options.FBO_ENABLE)) {
            int fboEnable;
            if (lIIlIIIlIIIIIlII(this.fboEnable ? 1 : 0)) {
                fboEnable = GameSettings.llIlIIIIIIIllI[1];
                "".length();
                if ((90 + 92 - 17 + 0 ^ 24 + 154 - 77 + 59) <= 0) {
                    return;
                }
            }
            else {
                fboEnable = GameSettings.llIlIIIIIIIllI[2];
            }
            this.fboEnable = (fboEnable != 0);
        }
        if (lIIlIIIlIIIIlIlI(llllllllllllIllIllIllllIlllIIIlI, Options.ANAGLYPH)) {
            int anaglyph;
            if (lIIlIIIlIIIIIlII(this.anaglyph ? 1 : 0)) {
                anaglyph = GameSettings.llIlIIIIIIIllI[1];
                "".length();
                if (((0x7 ^ 0x7B ^ (0xED ^ 0xC2)) & (0xF8 ^ 0x8A ^ (0x6B ^ 0x4A) ^ -" ".length())) < ((0x4E ^ 0x58 ^ (0x17 ^ 0x1B)) & (0x25 ^ 0x69 ^ (0xFC ^ 0xAA) ^ -" ".length()))) {
                    return;
                }
            }
            else {
                anaglyph = GameSettings.llIlIIIIIIIllI[2];
            }
            this.anaglyph = (anaglyph != 0);
            this.mc.refreshResources();
        }
        if (lIIlIIIlIIIIlIlI(llllllllllllIllIllIllllIlllIIIlI, Options.GRAPHICS)) {
            int fancyGraphics;
            if (lIIlIIIlIIIIIlII(this.fancyGraphics ? 1 : 0)) {
                fancyGraphics = GameSettings.llIlIIIIIIIllI[1];
                "".length();
                if (-" ".length() == ((0x98 ^ 0xAA) & ~(0x37 ^ 0x5))) {
                    return;
                }
            }
            else {
                fancyGraphics = GameSettings.llIlIIIIIIIllI[2];
            }
            this.fancyGraphics = (fancyGraphics != 0);
            this.mc.renderGlobal.loadRenderers();
        }
        if (lIIlIIIlIIIIlIlI(llllllllllllIllIllIllllIlllIIIlI, Options.AMBIENT_OCCLUSION)) {
            this.ambientOcclusion = (this.ambientOcclusion + llllllllllllIllIllIllllIlllIIlII) % GameSettings.llIlIIIIIIIllI[4];
            this.mc.renderGlobal.loadRenderers();
        }
        if (lIIlIIIlIIIIlIlI(llllllllllllIllIllIllllIlllIIIlI, Options.CHAT_VISIBILITY)) {
            this.chatVisibility = EntityPlayer.EnumChatVisibility.getEnumChatVisibility((this.chatVisibility.getChatVisibility() + llllllllllllIllIllIllllIlllIIlII) % GameSettings.llIlIIIIIIIllI[4]);
        }
        if (lIIlIIIlIIIIlIlI(llllllllllllIllIllIllllIlllIIIlI, Options.STREAM_COMPRESSION)) {
            this.streamCompression = (this.streamCompression + llllllllllllIllIllIllllIlllIIlII) % GameSettings.llIlIIIIIIIllI[4];
        }
        if (lIIlIIIlIIIIlIlI(llllllllllllIllIllIllllIlllIIIlI, Options.STREAM_SEND_METADATA)) {
            int streamSendMetadata;
            if (lIIlIIIlIIIIIlII(this.streamSendMetadata ? 1 : 0)) {
                streamSendMetadata = GameSettings.llIlIIIIIIIllI[1];
                "".length();
                if (-"  ".length() > 0) {
                    return;
                }
            }
            else {
                streamSendMetadata = GameSettings.llIlIIIIIIIllI[2];
            }
            this.streamSendMetadata = (streamSendMetadata != 0);
        }
        if (lIIlIIIlIIIIlIlI(llllllllllllIllIllIllllIlllIIIlI, Options.STREAM_CHAT_ENABLED)) {
            this.streamChatEnabled = (this.streamChatEnabled + llllllllllllIllIllIllllIlllIIlII) % GameSettings.llIlIIIIIIIllI[4];
        }
        if (lIIlIIIlIIIIlIlI(llllllllllllIllIllIllllIlllIIIlI, Options.STREAM_CHAT_USER_FILTER)) {
            this.streamChatUserFilter = (this.streamChatUserFilter + llllllllllllIllIllIllllIlllIIlII) % GameSettings.llIlIIIIIIIllI[4];
        }
        if (lIIlIIIlIIIIlIlI(llllllllllllIllIllIllllIlllIIIlI, Options.STREAM_MIC_TOGGLE_BEHAVIOR)) {
            this.streamMicToggleBehavior = (this.streamMicToggleBehavior + llllllllllllIllIllIllllIlllIIlII) % GameSettings.llIlIIIIIIIllI[3];
        }
        if (lIIlIIIlIIIIlIlI(llllllllllllIllIllIllllIlllIIIlI, Options.CHAT_COLOR)) {
            int chatColours;
            if (lIIlIIIlIIIIIlII(this.chatColours ? 1 : 0)) {
                chatColours = GameSettings.llIlIIIIIIIllI[1];
                "".length();
                if (-(0x18 ^ 0x53 ^ (0xCB ^ 0x85)) >= 0) {
                    return;
                }
            }
            else {
                chatColours = GameSettings.llIlIIIIIIIllI[2];
            }
            this.chatColours = (chatColours != 0);
        }
        if (lIIlIIIlIIIIlIlI(llllllllllllIllIllIllllIlllIIIlI, Options.CHAT_LINKS)) {
            int chatLinks;
            if (lIIlIIIlIIIIIlII(this.chatLinks ? 1 : 0)) {
                chatLinks = GameSettings.llIlIIIIIIIllI[1];
                "".length();
                if (" ".length() >= "   ".length()) {
                    return;
                }
            }
            else {
                chatLinks = GameSettings.llIlIIIIIIIllI[2];
            }
            this.chatLinks = (chatLinks != 0);
        }
        if (lIIlIIIlIIIIlIlI(llllllllllllIllIllIllllIlllIIIlI, Options.CHAT_LINKS_PROMPT)) {
            int chatLinksPrompt;
            if (lIIlIIIlIIIIIlII(this.chatLinksPrompt ? 1 : 0)) {
                chatLinksPrompt = GameSettings.llIlIIIIIIIllI[1];
                "".length();
                if ((0x7F ^ 0x7B) <= "  ".length()) {
                    return;
                }
            }
            else {
                chatLinksPrompt = GameSettings.llIlIIIIIIIllI[2];
            }
            this.chatLinksPrompt = (chatLinksPrompt != 0);
        }
        if (lIIlIIIlIIIIlIlI(llllllllllllIllIllIllllIlllIIIlI, Options.SNOOPER_ENABLED)) {
            int snooperEnabled;
            if (lIIlIIIlIIIIIlII(this.snooperEnabled ? 1 : 0)) {
                snooperEnabled = GameSettings.llIlIIIIIIIllI[1];
                "".length();
                if (-" ".length() > " ".length()) {
                    return;
                }
            }
            else {
                snooperEnabled = GameSettings.llIlIIIIIIIllI[2];
            }
            this.snooperEnabled = (snooperEnabled != 0);
        }
        if (lIIlIIIlIIIIlIlI(llllllllllllIllIllIllllIlllIIIlI, Options.TOUCHSCREEN)) {
            int touchscreen;
            if (lIIlIIIlIIIIIlII(this.touchscreen ? 1 : 0)) {
                touchscreen = GameSettings.llIlIIIIIIIllI[1];
                "".length();
                if (" ".length() <= 0) {
                    return;
                }
            }
            else {
                touchscreen = GameSettings.llIlIIIIIIIllI[2];
            }
            this.touchscreen = (touchscreen != 0);
        }
        if (lIIlIIIlIIIIlIlI(llllllllllllIllIllIllllIlllIIIlI, Options.USE_FULLSCREEN)) {
            int fullScreen;
            if (lIIlIIIlIIIIIlII(this.fullScreen ? 1 : 0)) {
                fullScreen = GameSettings.llIlIIIIIIIllI[1];
                "".length();
                if ("   ".length() <= "  ".length()) {
                    return;
                }
            }
            else {
                fullScreen = GameSettings.llIlIIIIIIIllI[2];
            }
            this.fullScreen = (fullScreen != 0);
            if (lIIlIIIlIIIIllII(this.mc.isFullScreen() ? 1 : 0, this.fullScreen ? 1 : 0)) {
                this.mc.toggleFullscreen();
            }
        }
        if (lIIlIIIlIIIIlIlI(llllllllllllIllIllIllllIlllIIIlI, Options.ENABLE_VSYNC)) {
            int enableVsync;
            if (lIIlIIIlIIIIIlII(this.enableVsync ? 1 : 0)) {
                enableVsync = GameSettings.llIlIIIIIIIllI[1];
                "".length();
                if (" ".length() < 0) {
                    return;
                }
            }
            else {
                enableVsync = GameSettings.llIlIIIIIIIllI[2];
            }
            this.enableVsync = (enableVsync != 0);
            Display.setVSyncEnabled(this.enableVsync);
        }
        if (lIIlIIIlIIIIlIlI(llllllllllllIllIllIllllIlllIIIlI, Options.USE_VBO)) {
            int useVbo;
            if (lIIlIIIlIIIIIlII(this.useVbo ? 1 : 0)) {
                useVbo = GameSettings.llIlIIIIIIIllI[1];
                "".length();
                if (" ".length() < ((0xEC ^ 0x9B ^ (0xDF ^ 0x82)) & (0xC4 ^ 0xB9 ^ (0x16 ^ 0x41) ^ -" ".length()))) {
                    return;
                }
            }
            else {
                useVbo = GameSettings.llIlIIIIIIIllI[2];
            }
            this.useVbo = (useVbo != 0);
            this.mc.renderGlobal.loadRenderers();
        }
        if (lIIlIIIlIIIIlIlI(llllllllllllIllIllIllllIlllIIIlI, Options.BLOCK_ALTERNATIVES)) {
            int allowBlockAlternatives;
            if (lIIlIIIlIIIIIlII(this.allowBlockAlternatives ? 1 : 0)) {
                allowBlockAlternatives = GameSettings.llIlIIIIIIIllI[1];
                "".length();
                if ((0x56 ^ 0x52) <= "  ".length()) {
                    return;
                }
            }
            else {
                allowBlockAlternatives = GameSettings.llIlIIIIIIIllI[2];
            }
            this.allowBlockAlternatives = (allowBlockAlternatives != 0);
            this.mc.renderGlobal.loadRenderers();
        }
        if (lIIlIIIlIIIIlIlI(llllllllllllIllIllIllllIlllIIIlI, Options.REDUCED_DEBUG_INFO)) {
            int reducedDebugInfo;
            if (lIIlIIIlIIIIIlII(this.reducedDebugInfo ? 1 : 0)) {
                reducedDebugInfo = GameSettings.llIlIIIIIIIllI[1];
                "".length();
                if (-(0x44 ^ 0x41) >= 0) {
                    return;
                }
            }
            else {
                reducedDebugInfo = GameSettings.llIlIIIIIIIllI[2];
            }
            this.reducedDebugInfo = (reducedDebugInfo != 0);
        }
        if (lIIlIIIlIIIIlIlI(llllllllllllIllIllIllllIlllIIIlI, Options.ENTITY_SHADOWS)) {
            int field_181151_V;
            if (lIIlIIIlIIIIIlII(this.field_181151_V ? 1 : 0)) {
                field_181151_V = GameSettings.llIlIIIIIIIllI[1];
                "".length();
                if (((0x13 ^ 0x1) & ~(0x51 ^ 0x43)) != 0x0) {
                    return;
                }
            }
            else {
                field_181151_V = GameSettings.llIlIIIIIIIllI[2];
            }
            this.field_181151_V = (field_181151_V != 0);
        }
        this.saveOptions();
    }
    
    public static boolean isKeyDown(final KeyBinding llllllllllllIllIllIlllllIIIIIIII) {
        int n;
        if (lIIlIIIlIIIIlIII(llllllllllllIllIllIlllllIIIIIIII.getKeyCode())) {
            n = GameSettings.llIlIIIIIIIllI[1];
            "".length();
            if (((0xCF ^ 0xC7) & ~(0x47 ^ 0x4F)) != 0x0) {
                return ((0x4D ^ 0x54) & ~(0x6B ^ 0x72)) != 0x0;
            }
        }
        else if (lIIlIIIlIIIIIllI(llllllllllllIllIllIlllllIIIIIIII.getKeyCode())) {
            n = (Mouse.isButtonDown(llllllllllllIllIllIlllllIIIIIIII.getKeyCode() + GameSettings.llIlIIIIIIIllI[105]) ? 1 : 0);
            "".length();
            if ("  ".length() <= " ".length()) {
                return ((0x7A ^ 0x47) & ~(0x73 ^ 0x4E)) != 0x0;
            }
        }
        else {
            n = (Keyboard.isKeyDown(llllllllllllIllIllIlllllIIIIIIII.getKeyCode()) ? 1 : 0);
        }
        return n != 0;
    }
    
    private static int lIIlIIIlIIIIIIll(final long n, final long n2) {
        return lcmp(n, n2);
    }
    
    static {
        lIIlIIIlIIIIIIlI();
        lIIlIIIlIIIIIIIl();
        logger = LogManager.getLogger();
        gson = new Gson();
        typeListString = new ParameterizedType() {
            private static final /* synthetic */ int[] lIlIllIIIlllII;
            
            static {
                llllIIIIlIIllII();
            }
            
            @Override
            public Type getRawType() {
                return List.class;
            }
            
            @Override
            public Type[] getActualTypeArguments() {
                final Type[] array = new Type[GameSettings$1.lIlIllIIIlllII[0]];
                array[GameSettings$1.lIlIllIIIlllII[1]] = String.class;
                return array;
            }
            
            private static void llllIIIIlIIllII() {
                (lIlIllIIIlllII = new int[2])[0] = " ".length();
                GameSettings$1.lIlIllIIIlllII[1] = ((0xBD ^ 0x87) & ~(0xF8 ^ 0xC2) & ~((0x29 ^ 0x76) & ~(0xDA ^ 0x85)));
            }
            
            @Override
            public Type getOwnerType() {
                return null;
            }
        };
        final String[] guiscales = new String[GameSettings.llIlIIIIIIIllI[0]];
        guiscales[GameSettings.llIlIIIIIIIllI[1]] = GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[1]];
        guiscales[GameSettings.llIlIIIIIIIllI[2]] = GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[2]];
        guiscales[GameSettings.llIlIIIIIIIllI[3]] = GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[3]];
        guiscales[GameSettings.llIlIIIIIIIllI[4]] = GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[4]];
        GUISCALES = guiscales;
        final String[] particles = new String[GameSettings.llIlIIIIIIIllI[4]];
        particles[GameSettings.llIlIIIIIIIllI[1]] = GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[0]];
        particles[GameSettings.llIlIIIIIIIllI[2]] = GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[5]];
        particles[GameSettings.llIlIIIIIIIllI[3]] = GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[6]];
        PARTICLES = particles;
        final String[] ambient_OCCLUSIONS = new String[GameSettings.llIlIIIIIIIllI[4]];
        ambient_OCCLUSIONS[GameSettings.llIlIIIIIIIllI[1]] = GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[7]];
        ambient_OCCLUSIONS[GameSettings.llIlIIIIIIIllI[2]] = GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[8]];
        ambient_OCCLUSIONS[GameSettings.llIlIIIIIIIllI[3]] = GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[9]];
        AMBIENT_OCCLUSIONS = ambient_OCCLUSIONS;
        final String[] stream_COMPRESSIONS = new String[GameSettings.llIlIIIIIIIllI[4]];
        stream_COMPRESSIONS[GameSettings.llIlIIIIIIIllI[1]] = GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[10]];
        stream_COMPRESSIONS[GameSettings.llIlIIIIIIIllI[2]] = GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[11]];
        stream_COMPRESSIONS[GameSettings.llIlIIIIIIIllI[3]] = GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[12]];
        STREAM_COMPRESSIONS = stream_COMPRESSIONS;
        final String[] stream_CHAT_MODES = new String[GameSettings.llIlIIIIIIIllI[4]];
        stream_CHAT_MODES[GameSettings.llIlIIIIIIIllI[1]] = GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[13]];
        stream_CHAT_MODES[GameSettings.llIlIIIIIIIllI[2]] = GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[14]];
        stream_CHAT_MODES[GameSettings.llIlIIIIIIIllI[3]] = GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[15]];
        STREAM_CHAT_MODES = stream_CHAT_MODES;
        final String[] stream_CHAT_FILTER_MODES = new String[GameSettings.llIlIIIIIIIllI[4]];
        stream_CHAT_FILTER_MODES[GameSettings.llIlIIIIIIIllI[1]] = GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[16]];
        stream_CHAT_FILTER_MODES[GameSettings.llIlIIIIIIIllI[2]] = GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[17]];
        stream_CHAT_FILTER_MODES[GameSettings.llIlIIIIIIIllI[3]] = GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[18]];
        STREAM_CHAT_FILTER_MODES = stream_CHAT_FILTER_MODES;
        final String[] stream_MIC_MODES = new String[GameSettings.llIlIIIIIIIllI[3]];
        stream_MIC_MODES[GameSettings.llIlIIIIIIIllI[1]] = GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[19]];
        stream_MIC_MODES[GameSettings.llIlIIIIIIIllI[2]] = GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[20]];
        STREAM_MIC_MODES = stream_MIC_MODES;
        final String[] field_181149_aW2 = new String[GameSettings.llIlIIIIIIIllI[4]];
        field_181149_aW2[GameSettings.llIlIIIIIIIllI[1]] = GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[21]];
        field_181149_aW2[GameSettings.llIlIIIIIIIllI[2]] = GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[22]];
        field_181149_aW2[GameSettings.llIlIIIIIIIllI[3]] = GameSettings.llIIlIllIIIIII[GameSettings.llIlIIIIIIIllI[23]];
        field_181149_aW = field_181149_aW2;
    }
    
    public int func_181147_e() {
        int clouds;
        if (lIIlIIIlIIIIllIl(this.renderDistanceChunks, GameSettings.llIlIIIIIIIllI[0])) {
            clouds = this.clouds;
            "".length();
            if (null != null) {
                return (0xBC ^ 0x90) & ~(0xA8 ^ 0x84);
            }
        }
        else {
            clouds = GameSettings.llIlIIIIIIIllI[1];
        }
        return clouds;
    }
    
    private static String lIIIllIlIlllllII(String llllllllllllIllIllIllllIIlIIlIll, final String llllllllllllIllIllIllllIIlIIlIlI) {
        llllllllllllIllIllIllllIIlIIlIll = (char)new String(Base64.getDecoder().decode(((String)llllllllllllIllIllIllllIIlIIlIll).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder llllllllllllIllIllIllllIIlIIlllI = new StringBuilder();
        final char[] llllllllllllIllIllIllllIIlIIllIl = llllllllllllIllIllIllllIIlIIlIlI.toCharArray();
        int llllllllllllIllIllIllllIIlIIllII = GameSettings.llIlIIIIIIIllI[1];
        final int llllllllllllIllIllIllllIIlIIIllI = (Object)((String)llllllllllllIllIllIllllIIlIIlIll).toCharArray();
        final Exception llllllllllllIllIllIllllIIlIIIlIl = (Exception)llllllllllllIllIllIllllIIlIIIllI.length;
        char llllllllllllIllIllIllllIIlIIIlII = (char)GameSettings.llIlIIIIIIIllI[1];
        while (lIIlIIIlIIIIIlll(llllllllllllIllIllIllllIIlIIIlII, (int)llllllllllllIllIllIllllIIlIIIlIl)) {
            final char llllllllllllIllIllIllllIIlIlIIIl = llllllllllllIllIllIllllIIlIIIllI[llllllllllllIllIllIllllIIlIIIlII];
            llllllllllllIllIllIllllIIlIIlllI.append((char)(llllllllllllIllIllIllllIIlIlIIIl ^ llllllllllllIllIllIllllIIlIIllIl[llllllllllllIllIllIllllIIlIIllII % llllllllllllIllIllIllllIIlIIllIl.length]));
            "".length();
            ++llllllllllllIllIllIllllIIlIIllII;
            ++llllllllllllIllIllIllllIIlIIIlII;
            "".length();
            if (null != null) {
                return null;
            }
        }
        return String.valueOf(llllllllllllIllIllIllllIIlIIlllI);
    }
    
    private static boolean lIIlIIIlIIIIIllI(final int llllllllllllIllIllIlllIlllIlllIl) {
        return llllllllllllIllIllIlllIlllIlllIl < 0;
    }
    
    private static String lIIIllIlIllllllI(final String llllllllllllIllIllIllllIIIlIlllI, final String llllllllllllIllIllIllllIIIlIlIll) {
        try {
            final SecretKeySpec llllllllllllIllIllIllllIIIllIIIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIllIllIllllIIIlIlIll.getBytes(StandardCharsets.UTF_8)), GameSettings.llIlIIIIIIIllI[8]), "DES");
            final Cipher llllllllllllIllIllIllllIIIllIIII = Cipher.getInstance("DES");
            llllllllllllIllIllIllllIIIllIIII.init(GameSettings.llIlIIIIIIIllI[3], llllllllllllIllIllIllllIIIllIIIl);
            return new String(llllllllllllIllIllIllllIIIllIIII.doFinal(Base64.getDecoder().decode(llllllllllllIllIllIllllIIIlIlllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIllIllIllllIIIlIllll) {
            llllllllllllIllIllIllllIIIlIllll.printStackTrace();
            return null;
        }
    }
    
    public enum Options
    {
        CHAT_HEIGHT_UNFOCUSED(Options.lllIIlIIIlIlII[Options.lllIIlIIIlIlIl[56]], Options.lllIIlIIIlIlIl[28], Options.lllIIlIIIlIlII[Options.lllIIlIIIlIlIl[57]], (boolean)(Options.lllIIlIIIlIlIl[1] != 0), (boolean)(Options.lllIIlIIIlIlIl[0] != 0)), 
        MIPMAP_LEVELS(Options.lllIIlIIIlIlII[Options.lllIIlIIIlIlIl[58]], Options.lllIIlIIIlIlIl[29], Options.lllIIlIIIlIlII[Options.lllIIlIIIlIlIl[59]], (boolean)(Options.lllIIlIIIlIlIl[1] != 0), (boolean)(Options.lllIIlIIIlIlIl[0] != 0), 0.0f, 4.0f, 1.0f);
        
        private final /* synthetic */ String enumString;
        
        CHAT_HEIGHT_FOCUSED(Options.lllIIlIIIlIlII[Options.lllIIlIIIlIlIl[54]], Options.lllIIlIIIlIlIl[27], Options.lllIIlIIIlIlII[Options.lllIIlIIIlIlIl[55]], (boolean)(Options.lllIIlIIIlIlIl[1] != 0), (boolean)(Options.lllIIlIIIlIlIl[0] != 0)), 
        CHAT_OPACITY(Options.lllIIlIIIlIlII[Options.lllIIlIIIlIlIl[36]], Options.lllIIlIIIlIlIl[18], Options.lllIIlIIIlIlII[Options.lllIIlIIIlIlIl[37]], (boolean)(Options.lllIIlIIIlIlIl[1] != 0), (boolean)(Options.lllIIlIIIlIlIl[0] != 0)), 
        BLOCK_ALTERNATIVES(Options.lllIIlIIIlIlII[Options.lllIIlIIIlIlIl[82]], Options.lllIIlIIIlIlIl[41], Options.lllIIlIIIlIlII[Options.lllIIlIIIlIlIl[83]], (boolean)(Options.lllIIlIIIlIlIl[0] != 0), (boolean)(Options.lllIIlIIIlIlIl[1] != 0)), 
        ANAGLYPH(Options.lllIIlIIIlIlII[Options.lllIIlIIIlIlIl[14]], Options.lllIIlIIIlIlIl[7], Options.lllIIlIIIlIlII[Options.lllIIlIIIlIlIl[15]], (boolean)(Options.lllIIlIIIlIlIl[0] != 0), (boolean)(Options.lllIIlIIIlIlIl[1] != 0)), 
        SATURATION(Options.lllIIlIIIlIlII[Options.lllIIlIIIlIlIl[8]], Options.lllIIlIIIlIlIl[4], Options.lllIIlIIIlIlII[Options.lllIIlIIIlIlIl[9]], (boolean)(Options.lllIIlIIIlIlIl[1] != 0), (boolean)(Options.lllIIlIIIlIlIl[0] != 0));
        
        private /* synthetic */ float valueMin;
        private final /* synthetic */ boolean enumBoolean;
        
        PARTICLES(Options.lllIIlIIIlIlII[Options.lllIIlIIIlIlIl[28]], Options.lllIIlIIIlIlIl[14], Options.lllIIlIIIlIlII[Options.lllIIlIIIlIlIl[29]], (boolean)(Options.lllIIlIIIlIlIl[0] != 0), (boolean)(Options.lllIIlIIIlIlIl[0] != 0)), 
        CHAT_VISIBILITY(Options.lllIIlIIIlIlII[Options.lllIIlIIIlIlIl[30]], Options.lllIIlIIIlIlIl[15], Options.lllIIlIIIlIlII[Options.lllIIlIIIlIlIl[31]], (boolean)(Options.lllIIlIIIlIlIl[0] != 0), (boolean)(Options.lllIIlIIIlIlIl[0] != 0)), 
        STREAM_COMPRESSION(Options.lllIIlIIIlIlII[Options.lllIIlIIIlIlIl[72]], Options.lllIIlIIIlIlIl[36], Options.lllIIlIIIlIlII[Options.lllIIlIIIlIlIl[73]], (boolean)(Options.lllIIlIIIlIlIl[0] != 0), (boolean)(Options.lllIIlIIIlIlIl[0] != 0)), 
        ENTITY_SHADOWS(Options.lllIIlIIIlIlII[Options.lllIIlIIIlIlIl[86]], Options.lllIIlIIIlIlIl[43], Options.lllIIlIIIlIlII[Options.lllIIlIIIlIlIl[87]], (boolean)(Options.lllIIlIIIlIlIl[0] != 0), (boolean)(Options.lllIIlIIIlIlIl[1] != 0)), 
        CHAT_LINKS(Options.lllIIlIIIlIlII[Options.lllIIlIIIlIlIl[34]], Options.lllIIlIIIlIlIl[17], Options.lllIIlIIIlIlII[Options.lllIIlIIIlIlIl[35]], (boolean)(Options.lllIIlIIIlIlIl[0] != 0), (boolean)(Options.lllIIlIIIlIlIl[1] != 0));
        
        private static final /* synthetic */ int[] lllIIlIIIlIlIl;
        
        USE_VBO(Options.lllIIlIIIlIlII[Options.lllIIlIIIlIlIl[46]], Options.lllIIlIIIlIlIl[23], Options.lllIIlIIIlIlII[Options.lllIIlIIIlIlIl[47]], (boolean)(Options.lllIIlIIIlIlIl[0] != 0), (boolean)(Options.lllIIlIIIlIlIl[1] != 0)), 
        ENABLE_VSYNC(Options.lllIIlIIIlIlII[Options.lllIIlIIIlIlIl[44]], Options.lllIIlIIIlIlIl[22], Options.lllIIlIIIlIlII[Options.lllIIlIIIlIlIl[45]], (boolean)(Options.lllIIlIIIlIlIl[0] != 0), (boolean)(Options.lllIIlIIIlIlIl[1] != 0)), 
        CHAT_SCALE(Options.lllIIlIIIlIlII[Options.lllIIlIIIlIlIl[50]], Options.lllIIlIIIlIlIl[25], Options.lllIIlIIIlIlII[Options.lllIIlIIIlIlIl[51]], (boolean)(Options.lllIIlIIIlIlIl[1] != 0), (boolean)(Options.lllIIlIIIlIlIl[0] != 0)), 
        STREAM_BYTES_PER_PIXEL(Options.lllIIlIIIlIlII[Options.lllIIlIIIlIlIl[62]], Options.lllIIlIIIlIlIl[31], Options.lllIIlIIIlIlII[Options.lllIIlIIIlIlIl[63]], (boolean)(Options.lllIIlIIIlIlIl[1] != 0), (boolean)(Options.lllIIlIIIlIlIl[0] != 0)), 
        AMBIENT_OCCLUSION(Options.lllIIlIIIlIlII[Options.lllIIlIIIlIlIl[24]], Options.lllIIlIIIlIlIl[12], Options.lllIIlIIIlIlII[Options.lllIIlIIIlIlIl[25]], (boolean)(Options.lllIIlIIIlIlIl[0] != 0), (boolean)(Options.lllIIlIIIlIlIl[0] != 0)), 
        RENDER_DISTANCE(Options.lllIIlIIIlIlII[Options.lllIIlIIIlIlIl[10]], Options.lllIIlIIIlIlIl[5], Options.lllIIlIIIlIlII[Options.lllIIlIIIlIlIl[11]], (boolean)(Options.lllIIlIIIlIlIl[1] != 0), (boolean)(Options.lllIIlIIIlIlIl[0] != 0), 2.0f, 16.0f, 1.0f);
        
        private final /* synthetic */ boolean enumFloat;
        
        STREAM_VOLUME_MIC(Options.lllIIlIIIlIlII[Options.lllIIlIIIlIlIl[64]], Options.lllIIlIIIlIlIl[32], Options.lllIIlIIIlIlII[Options.lllIIlIIIlIlIl[65]], (boolean)(Options.lllIIlIIIlIlIl[1] != 0), (boolean)(Options.lllIIlIIIlIlIl[0] != 0)), 
        TOUCHSCREEN(Options.lllIIlIIIlIlII[Options.lllIIlIIIlIlIl[48]], Options.lllIIlIIIlIlIl[24], Options.lllIIlIIIlIlII[Options.lllIIlIIIlIlIl[49]], (boolean)(Options.lllIIlIIIlIlIl[0] != 0), (boolean)(Options.lllIIlIIIlIlIl[1] != 0)), 
        STREAM_KBPS(Options.lllIIlIIIlIlII[Options.lllIIlIIIlIlIl[68]], Options.lllIIlIIIlIlIl[34], Options.lllIIlIIIlIlII[Options.lllIIlIIIlIlIl[69]], (boolean)(Options.lllIIlIIIlIlIl[1] != 0), (boolean)(Options.lllIIlIIIlIlIl[0] != 0)), 
        STREAM_VOLUME_SYSTEM(Options.lllIIlIIIlIlII[Options.lllIIlIIIlIlIl[66]], Options.lllIIlIIIlIlIl[33], Options.lllIIlIIIlIlII[Options.lllIIlIIIlIlIl[67]], (boolean)(Options.lllIIlIIIlIlIl[1] != 0), (boolean)(Options.lllIIlIIIlIlIl[0] != 0)), 
        STREAM_FPS(Options.lllIIlIIIlIlII[Options.lllIIlIIIlIlIl[70]], Options.lllIIlIIIlIlIl[35], Options.lllIIlIIIlIlII[Options.lllIIlIIIlIlIl[71]], (boolean)(Options.lllIIlIIIlIlIl[1] != 0), (boolean)(Options.lllIIlIIIlIlIl[0] != 0));
        
        private /* synthetic */ float valueMax;
        
        USE_FULLSCREEN(Options.lllIIlIIIlIlII[Options.lllIIlIIIlIlIl[42]], Options.lllIIlIIIlIlIl[21], Options.lllIIlIIIlIlII[Options.lllIIlIIIlIlIl[43]], (boolean)(Options.lllIIlIIIlIlIl[0] != 0), (boolean)(Options.lllIIlIIIlIlIl[1] != 0)), 
        SENSITIVITY(Options.lllIIlIIIlIlII[Options.lllIIlIIIlIlIl[2]], Options.lllIIlIIIlIlIl[1], Options.lllIIlIIIlIlII[Options.lllIIlIIIlIlIl[3]], (boolean)(Options.lllIIlIIIlIlIl[1] != 0), (boolean)(Options.lllIIlIIIlIlIl[0] != 0)), 
        CHAT_LINKS_PROMPT(Options.lllIIlIIIlIlII[Options.lllIIlIIIlIlIl[38]], Options.lllIIlIIIlIlIl[19], Options.lllIIlIIIlIlII[Options.lllIIlIIIlIlIl[39]], (boolean)(Options.lllIIlIIIlIlIl[0] != 0), (boolean)(Options.lllIIlIIIlIlIl[1] != 0)), 
        FORCE_UNICODE_FONT(Options.lllIIlIIIlIlII[Options.lllIIlIIIlIlIl[60]], Options.lllIIlIIIlIlIl[30], Options.lllIIlIIIlIlII[Options.lllIIlIIIlIlIl[61]], (boolean)(Options.lllIIlIIIlIlIl[0] != 0), (boolean)(Options.lllIIlIIIlIlIl[1] != 0)), 
        STREAM_CHAT_ENABLED(Options.lllIIlIIIlIlII[Options.lllIIlIIIlIlIl[76]], Options.lllIIlIIIlIlIl[38], Options.lllIIlIIIlIlII[Options.lllIIlIIIlIlIl[77]], (boolean)(Options.lllIIlIIIlIlIl[0] != 0), (boolean)(Options.lllIIlIIIlIlIl[0] != 0)), 
        RENDER_CLOUDS(Options.lllIIlIIIlIlII[Options.lllIIlIIIlIlIl[20]], Options.lllIIlIIIlIlIl[10], Options.lllIIlIIIlIlII[Options.lllIIlIIIlIlIl[21]], (boolean)(Options.lllIIlIIIlIlIl[0] != 0), (boolean)(Options.lllIIlIIIlIlIl[0] != 0)), 
        REDUCED_DEBUG_INFO(Options.lllIIlIIIlIlII[Options.lllIIlIIIlIlIl[84]], Options.lllIIlIIIlIlIl[42], Options.lllIIlIIIlIlII[Options.lllIIlIIIlIlIl[85]], (boolean)(Options.lllIIlIIIlIlIl[0] != 0), (boolean)(Options.lllIIlIIIlIlIl[1] != 0)), 
        STREAM_MIC_TOGGLE_BEHAVIOR(Options.lllIIlIIIlIlII[Options.lllIIlIIIlIlIl[80]], Options.lllIIlIIIlIlIl[40], Options.lllIIlIIIlIlII[Options.lllIIlIIIlIlIl[81]], (boolean)(Options.lllIIlIIIlIlIl[0] != 0), (boolean)(Options.lllIIlIIIlIlIl[0] != 0)), 
        GUI_SCALE(Options.lllIIlIIIlIlII[Options.lllIIlIIIlIlIl[26]], Options.lllIIlIIIlIlIl[13], Options.lllIIlIIIlIlII[Options.lllIIlIIIlIlIl[27]], (boolean)(Options.lllIIlIIIlIlIl[0] != 0), (boolean)(Options.lllIIlIIIlIlIl[0] != 0));
        
        private final /* synthetic */ float valueStep;
        
        CHAT_WIDTH(Options.lllIIlIIIlIlII[Options.lllIIlIIIlIlIl[52]], Options.lllIIlIIIlIlIl[26], Options.lllIIlIIIlIlII[Options.lllIIlIIIlIlIl[53]], (boolean)(Options.lllIIlIIIlIlIl[1] != 0), (boolean)(Options.lllIIlIIIlIlIl[0] != 0)), 
        GRAPHICS(Options.lllIIlIIIlIlII[Options.lllIIlIIIlIlIl[22]], Options.lllIIlIIIlIlIl[11], Options.lllIIlIIIlIlII[Options.lllIIlIIIlIlIl[23]], (boolean)(Options.lllIIlIIIlIlIl[0] != 0), (boolean)(Options.lllIIlIIIlIlIl[0] != 0)), 
        INVERT_MOUSE(Options.lllIIlIIIlIlII[Options.lllIIlIIIlIlIl[0]], Options.lllIIlIIIlIlIl[0], Options.lllIIlIIIlIlII[Options.lllIIlIIIlIlIl[1]], (boolean)(Options.lllIIlIIIlIlIl[0] != 0), (boolean)(Options.lllIIlIIIlIlIl[1] != 0)), 
        GAMMA(Options.lllIIlIIIlIlII[Options.lllIIlIIIlIlIl[6]], Options.lllIIlIIIlIlIl[3], Options.lllIIlIIIlIlII[Options.lllIIlIIIlIlIl[7]], (boolean)(Options.lllIIlIIIlIlIl[1] != 0), (boolean)(Options.lllIIlIIIlIlIl[0] != 0));
        
        private static final /* synthetic */ String[] lllIIlIIIlIlII;
        
        STREAM_SEND_METADATA(Options.lllIIlIIIlIlII[Options.lllIIlIIIlIlIl[74]], Options.lllIIlIIIlIlIl[37], Options.lllIIlIIIlIlII[Options.lllIIlIIIlIlIl[75]], (boolean)(Options.lllIIlIIIlIlIl[0] != 0), (boolean)(Options.lllIIlIIIlIlIl[1] != 0)), 
        CHAT_COLOR(Options.lllIIlIIIlIlII[Options.lllIIlIIIlIlIl[32]], Options.lllIIlIIIlIlIl[16], Options.lllIIlIIIlIlII[Options.lllIIlIIIlIlIl[33]], (boolean)(Options.lllIIlIIIlIlIl[0] != 0), (boolean)(Options.lllIIlIIIlIlIl[1] != 0)), 
        FBO_ENABLE(Options.lllIIlIIIlIlII[Options.lllIIlIIIlIlIl[18]], Options.lllIIlIIIlIlIl[9], Options.lllIIlIIIlIlII[Options.lllIIlIIIlIlIl[19]], (boolean)(Options.lllIIlIIIlIlIl[0] != 0), (boolean)(Options.lllIIlIIIlIlIl[1] != 0)), 
        SNOOPER_ENABLED(Options.lllIIlIIIlIlII[Options.lllIIlIIIlIlIl[40]], Options.lllIIlIIIlIlIl[20], Options.lllIIlIIIlIlII[Options.lllIIlIIIlIlIl[41]], (boolean)(Options.lllIIlIIIlIlIl[0] != 0), (boolean)(Options.lllIIlIIIlIlIl[1] != 0)), 
        VIEW_BOBBING(Options.lllIIlIIIlIlII[Options.lllIIlIIIlIlIl[12]], Options.lllIIlIIIlIlIl[6], Options.lllIIlIIIlIlII[Options.lllIIlIIIlIlIl[13]], (boolean)(Options.lllIIlIIIlIlIl[0] != 0), (boolean)(Options.lllIIlIIIlIlIl[1] != 0)), 
        FOV(Options.lllIIlIIIlIlII[Options.lllIIlIIIlIlIl[4]], Options.lllIIlIIIlIlIl[2], Options.lllIIlIIIlIlII[Options.lllIIlIIIlIlIl[5]], (boolean)(Options.lllIIlIIIlIlIl[1] != 0), (boolean)(Options.lllIIlIIIlIlIl[0] != 0), 30.0f, 110.0f, 1.0f), 
        FRAMERATE_LIMIT(Options.lllIIlIIIlIlII[Options.lllIIlIIIlIlIl[16]], Options.lllIIlIIIlIlIl[8], Options.lllIIlIIIlIlII[Options.lllIIlIIIlIlIl[17]], (boolean)(Options.lllIIlIIIlIlIl[1] != 0), (boolean)(Options.lllIIlIIIlIlIl[0] != 0), 10.0f, 260.0f, 10.0f), 
        STREAM_CHAT_USER_FILTER(Options.lllIIlIIIlIlII[Options.lllIIlIIIlIlIl[78]], Options.lllIIlIIIlIlIl[39], Options.lllIIlIIIlIlII[Options.lllIIlIIIlIlIl[79]], (boolean)(Options.lllIIlIIIlIlIl[0] != 0), (boolean)(Options.lllIIlIIIlIlIl[0] != 0));
        
        private static boolean lIIllllIllIlllll(final int llllllllllllIlIlllllIIlIllIlllIl, final int llllllllllllIlIlllllIIlIllIlllII) {
            return llllllllllllIlIlllllIIlIllIlllIl >= llllllllllllIlIlllllIIlIllIlllII;
        }
        
        public int returnEnumOrdinal() {
            return this.ordinal();
        }
        
        private static void lIIllllIllIlllII() {
            (lllIIlIIIlIlII = new String[Options.lllIIlIIIlIlIl[88]])[Options.lllIIlIIIlIlIl[0]] = lIIllllIllIllIIl("A+H5QW1o3dnu5eDs4jHnBA==", "zPGWq");
            Options.lllIIlIIIlIlII[Options.lllIIlIIIlIlIl[1]] = lIIllllIllIllIlI("MEbMFCn8v/Q8hLj8ii30ZlhnRUt55Rn6", "QkvHR");
            Options.lllIIlIIIlIlII[Options.lllIIlIIIlIlIl[2]] = lIIllllIllIllIlI("urfzLORB0qROXoMlHFoF0g==", "myHGU");
            Options.lllIIlIIIlIlII[Options.lllIIlIIIlIlIl[3]] = lIIllllIllIllIIl("fzZXtFNd3ckegiNdFY/UYxlBxxRrgVbO", "uMrAW");
            Options.lllIIlIIIlIlII[Options.lllIIlIIIlIlIl[4]] = lIIllllIllIllIlI("6kt7f4H4iDA=", "QrWrj");
            Options.lllIIlIIIlIlII[Options.lllIIlIIIlIlIl[5]] = lIIllllIllIllIIl("RA2rNEjkfiRvKSxtbqh0LQ==", "XVbPn");
            Options.lllIIlIIIlIlII[Options.lllIIlIIIlIlIl[6]] = lIIllllIllIllIll("NQgLIhs=", "rIFoZ");
            Options.lllIIlIIIlIlII[Options.lllIIlIIIlIlIl[7]] = lIIllllIllIllIll("KBsiDTwpGHgDMioGNw==", "GkVdS");
            Options.lllIIlIIIlIlII[Options.lllIIlIIIlIlIl[8]] = lIIllllIllIllIlI("70V0X0bzsWCkAkrnFFei0g==", "onzQN");
            Options.lllIIlIIIlIlII[Options.lllIIlIIIlIlIl[9]] = lIIllllIllIllIll("HQY8LgwcBWY0AgYDOiYXGxkm", "rvHGc");
            Options.lllIIlIIIlIlII[Options.lllIIlIIIlIlIl[10]] = lIIllllIllIllIlI("N4G4RrLz/W0kIHNDwgPsKQ==", "pxprh");
            Options.lllIIlIIIlIlII[Options.lllIIlIIIlIlIl[11]] = lIIllllIllIllIll("CgYxPwULBWskDwsSICQuDAUxNwQGEw==", "evEVj");
            Options.lllIIlIIIlIlII[Options.lllIIlIIIlIlIl[12]] = lIIllllIllIllIIl("k/3D9buEsl6O1ignUCixLQ==", "SCRYH");
            Options.lllIIlIIIlIlII[Options.lllIIlIIIlIlIl[13]] = lIIllllIllIllIIl("fqoqqunLgpfPrt1TwvfTBwQDdSPOipeD", "OdJiI");
            Options.lllIIlIIIlIlII[Options.lllIIlIIIlIlIl[14]] = lIIllllIllIllIll("LQ0HAj81Ew4=", "lCFEs");
            Options.lllIIlIIIlIlII[Options.lllIIlIIIlIlIl[15]] = lIIllllIllIllIll("DiIQMR0PIUo5HAA1CCECCQ==", "aRdXr");
            Options.lllIIlIIIlIlII[Options.lllIIlIIIlIlIl[16]] = lIIllllIllIllIlI("lN4Ybv/mfyiKNzH4Wn3wRQ==", "kNadI");
            Options.lllIIlIIIlIlII[Options.lllIIlIIIlIlIl[17]] = lIIllllIllIllIlI("jvee1D8L2srk/jGG3GbWCML494yQDRd/", "woBup");
            Options.lllIIlIIIlIlII[Options.lllIIlIIIlIlIl[18]] = lIIllllIllIllIll("IQMtDzYpACAcNg==", "gAbPs");
            Options.lllIIlIIIlIlII[Options.lllIIlIIIlIlIl[19]] = lIIllllIllIllIlI("Dd80zF32J2XR/hS2rmdyflN4nifAyu92", "gcmRH");
            Options.lllIIlIIIlIlII[Options.lllIIlIIIlIlIl[20]] = lIIllllIllIllIIl("lTZlKe3/QfHnREuDgWYQDw==", "sQlAO");
            Options.lllIIlIIIlIlII[Options.lllIIlIIIlIlIl[21]] = lIIllllIllIllIIl("Qlv395Ks5U4NPKujRnMXLU44QEHRVE3W", "jhQZH");
            Options.lllIIlIIIlIlII[Options.lllIIlIIIlIlIl[22]] = lIIllllIllIllIll("PSsxGTgzOiM=", "zypIp");
            Options.lllIIlIIIlIlII[Options.lllIIlIIIlIlIl[23]] = lIIllllIllIllIlI("2m9R/WRoweavX2jXHzfbLV1LT10rVDqV", "uyqtX");
            Options.lllIIlIIIlIlII[Options.lllIIlIIIlIlIl[24]] = lIIllllIllIllIll("CSgDARwGMR4HGgspFBsQBys=", "HeAHY");
            Options.lllIIlIIIlIlII[Options.lllIIlIIIlIlIl[25]] = lIIllllIllIllIll("CScVKAIIJE8gAg==", "fWaAm");
            Options.lllIIlIIIlIlII[Options.lllIIlIIIlIlIl[26]] = lIIllllIllIllIll("NToeMh4xLhso", "roWmM");
            Options.lllIIlIIIlIlII[Options.lllIIlIIIlIlIl[27]] = lIIllllIllIllIIl("geURK6O8/DqsR8ITVAMP1B8wrn/P9yCs", "sYTWG");
            Options.lllIIlIIIlIlII[Options.lllIIlIIIlIlIl[28]] = lIIllllIllIllIlI("aUnNL4IpSiWwa8ZmWz0igQ==", "LeYLy");
            Options.lllIIlIIIlIlII[Options.lllIIlIIIlIlIl[29]] = lIIllllIllIllIlI("Uu4HX4rX4Q8gMsAklJSm0gnrMc6C32em", "mUQdq");
            Options.lllIIlIIIlIlII[Options.lllIIlIIIlIlIl[30]] = lIIllllIllIllIlI("3GaEMtYONjnV5OPwUloLHA==", "TFbfC");
            Options.lllIIlIIIlIlII[Options.lllIIlIIIlIlIl[31]] = lIIllllIllIllIlI("OX+GbBI0uV/JvbHplXf8Nr55ap5CvVEG", "tTlWw");
            Options.lllIIlIIIlIlII[Options.lllIIlIIIlIlIl[32]] = lIIllllIllIllIlI("2cjQniWKbD5Sg5c/BcFFag==", "APkcg");
            Options.lllIIlIIIlIlII[Options.lllIIlIIIlIlIl[33]] = lIIllllIllIllIll("ABEMEwMBElYZBA4VVhkDAw4K", "oaxzl");
            Options.lllIIlIIIlIlII[Options.lllIIlIIIlIlIl[34]] = lIIllllIllIllIlI("OGvH3/H6jGbjN0DQS1LpWQ==", "qIidx");
            Options.lllIIlIIIlIlII[Options.lllIIlIIIlIlIl[35]] = lIIllllIllIllIll("PyckMAk+JH46DjEjfjUPPjwj", "PWPYf");
            Options.lllIIlIIIlIlII[Options.lllIIlIIIlIlIl[36]] = lIIllllIllIllIlI("LK5DeIzcJgdw5ugOT1A31Q==", "rzHXZ");
            Options.lllIIlIIIlIlII[Options.lllIIlIIIlIlIl[37]] = lIIllllIllIllIIl("OGtbhPz180sYl4YgF+ySJKOXtaP0iliA", "MaZee");
            Options.lllIIlIIIlIlII[Options.lllIIlIIIlIlIl[38]] = lIIllllIllIllIIl("YKy+WKJc/iWj7D5FRcqGUx4+/O7teJEf", "AzQlU");
            Options.lllIIlIIIlIlII[Options.lllIIlIIIlIlIl[39]] = lIIllllIllIllIll("GBUFIAAZFl8qBxYRXyUGGQ4CZx8FChw5Gw==", "weqIo");
            Options.lllIIlIIIlIlII[Options.lllIIlIIIlIlIl[40]] = lIIllllIllIllIlI("5IzWDr7IPtFVNm74TYKJRA==", "KSiKt");
            Options.lllIIlIIIlIlII[Options.lllIIlIIIlIlIl[41]] = lIIllllIllIllIIl("Iu2dLwWz7WiYtJu3g45Gwg==", "IuKWr");
            Options.lllIIlIIIlIlII[Options.lllIIlIIIlIlIl[42]] = lIIllllIllIllIlI("TPZiP5aLCfTR/nASiW5LQg==", "hQWKX");
            Options.lllIIlIIIlIlII[Options.lllIIlIIIlIlIl[43]] = lIIllllIllIllIIl("RFdjjlB8kJAqU6q0/ECw9NkcRY54qkX0", "YKNEX");
            Options.lllIIlIIIlIlII[Options.lllIIlIIIlIlIl[44]] = lIIllllIllIllIIl("liZuyx64aOUXX0Ih5oB4gg==", "QpFOn");
            Options.lllIIlIIIlIlII[Options.lllIIlIIIlIlIl[45]] = lIIllllIllIllIll("JwIjIA0mAXk/ETEcNA==", "HrWIb");
            Options.lllIIlIIIlIlII[Options.lllIIlIIIlIlIl[46]] = lIIllllIllIllIlI("60gxpc0O5xw=", "BFeMe");
            Options.lllIIlIIIlIlII[Options.lllIIlIIIlIlIl[47]] = lIIllllIllIllIlI("/n9USSkYhnaifsI2nUrE3w==", "lSErH");
            Options.lllIIlIIIlIlII[Options.lllIIlIIIlIlIl[48]] = lIIllllIllIllIIl("g9cg5cPxe0jGCCdSfmYVEw==", "VdnCY");
            Options.lllIIlIIIlIlII[Options.lllIIlIIIlIlIl[49]] = lIIllllIllIllIIl("8nGsYhUUVI/SO0JZemMmJppXjscdiYJM", "OFttN");
            Options.lllIIlIIIlIlII[Options.lllIIlIIIlIlIl[50]] = lIIllllIllIllIlI("pkDdG1SQZ42OTQkG9tG5Rw==", "nTgLA");
            Options.lllIIlIIIlIlII[Options.lllIIlIIIlIlIl[51]] = lIIllllIllIllIlI("Y14cEcFor5oq1PWKpkCcQt8zCroIVFSd", "uxngI");
            Options.lllIIlIIIlIlII[Options.lllIIlIIIlIlIl[52]] = lIIllllIllIllIll("DCY1NjoYJzA2LQ==", "Ontbe");
            Options.lllIIlIIIlIlII[Options.lllIIlIIIlIlIl[53]] = lIIllllIllIllIIl("cNeVuYy84v0s1Dkt+Z+m9zIXiQlHHQHS", "YazYM");
            Options.lllIIlIIIlIlII[Options.lllIIlIIIlIlIl[54]] = lIIllllIllIllIll("NAwTAAU/ARsTEiMbFBsZIhcXEA==", "wDRTZ");
            Options.lllIIlIIIlIlII[Options.lllIIlIIIlIlIl[55]] = lIIllllIllIllIll("LgcaKAovBEAiDSADQCkAKBAGNUsnGA00FiQT", "AwnAe");
            Options.lllIIlIIIlIlII[Options.lllIIlIIIlIlIl[56]] = lIIllllIllIllIlI("n/I18xRLcAApYBRmjBAAUXKv7KqF0+Y9", "rKoVY");
            Options.lllIIlIIIlIlII[Options.lllIIlIIIlIlIl[57]] = lIIllllIllIllIlI("LfbUN5IhcTVhJmnv1N0haL45BK6+o+MJCTX2SnYATao=", "bhjsk");
            Options.lllIIlIIIlIlII[Options.lllIIlIIIlIlIl[58]] = lIIllllIllIllIlI("obOTlFGhFQFY+H84ipakFA==", "hdVnw");
            Options.lllIIlIIIlIlII[Options.lllIIlIIIlIlIl[59]] = lIIllllIllIllIIl("+5NtkgC2zG7apbvMX6aLa0vriYlicXsV", "vSeGK");
            Options.lllIIlIIIlIlII[Options.lllIIlIIIlIlIl[60]] = lIIllllIllIllIIl("Mz6W6E0dyohNmfMx8WDgxYfLFXjWQuc2", "qNSFi");
            Options.lllIIlIIIlIlII[Options.lllIIlIIIlIlIl[61]] = lIIllllIllIllIll("NgctOx43BHc0HisUPAcfMBQ2NhQfGDcm", "YwYRq");
            Options.lllIIlIIIlIlII[Options.lllIIlIIIlIlIl[62]] = lIIllllIllIllIll("KxMXEiM1GAcONj0UGgcnKhgVHjo9Cw==", "xGEWb");
            Options.lllIIlIIIlIlII[Options.lllIIlIIIlIlIl[63]] = lIIllllIllIllIlI("9zKDyycySFJCoTrAijb8PUSr2tYY38H6L0xBciffsuo=", "OrdYE");
            Options.lllIIlIIIlIlII[Options.lllIIlIIIlIlIl[64]] = lIIllllIllIllIll("ASQhAysfLyUJJgc9NhknGzM=", "RpsFj");
            Options.lllIIlIIIlIlII[Options.lllIIlIIIlIlIl[65]] = lIIllllIllIllIll("CiA2AjwLI2wYJxc1IwZ9CDkhPTwJJS8FNg==", "ePBkS");
            Options.lllIIlIIIlIlII[Options.lllIIlIIIlIlIl[66]] = lIIllllIllIllIlI("hayrTZ+XUmIMc0k7Elk9dlZL1Lsi5HQQ", "BJSWk");
            Options.lllIIlIIIlIlII[Options.lllIIlIIIlIlIl[67]] = lIIllllIllIllIIl("vCBnn88vZPF1H1Ac+2/ZkBcdpkET9sqy7P+up/5/k6E=", "GZTMm");
            Options.lllIIlIIIlIlII[Options.lllIIlIIIlIlIl[68]] = lIIllllIllIllIIl("46XTQZeCeo8nBrZ76c96tg==", "JfHyL");
            Options.lllIIlIIIlIlII[Options.lllIIlIIIlIlIl[69]] = lIIllllIllIllIll("GTU5KzgYNmMxIwQgLC95HSc9MQ==", "vEMBW");
            Options.lllIIlIIIlIlII[Options.lllIIlIIIlIlIl[70]] = lIIllllIllIllIlI("x5NpC3WWQTcDPmUlbbbboQ==", "OGmge");
            Options.lllIIlIIIlIlII[Options.lllIIlIIIlIlIl[71]] = lIIllllIllIllIIl("q1YZ4qBnEOcjmv5QAQrko/t2tstGlyA6", "YpEtY");
            Options.lllIIlIIIlIlII[Options.lllIIlIIIlIlIl[72]] = lIIllllIllIllIll("KyM1Ng01KCQ8ASglIiAfMTgp", "xwgsL");
            Options.lllIIlIIIlIlII[Options.lllIIlIIIlIlIl[73]] = lIIllllIllIllIll("HTwVHDwcP08GJwApABh9ESMMBSEXPxIcPBw=", "rLauS");
            Options.lllIIlIIIlIlII[Options.lllIIlIIIlIlIl[74]] = lIIllllIllIllIlI("CK+tLXHOUDuqkq9ILT5+UlzXQmeBBgDQ", "hoTEe");
            Options.lllIIlIIIlIlII[Options.lllIIlIIIlIlIl[75]] = lIIllllIllIllIIl("AYv3P08aRZ6yZFRKnN9ldG3NITm3cPQPzw0Vu/e6KfM=", "dYbSZ");
            Options.lllIIlIIIlIlII[Options.lllIIlIIIlIlIl[76]] = lIIllllIllIllIIl("PPTii6hXwMrxJAR2oUFKd5/nb3x02AwV", "SZaJv");
            Options.lllIIlIIIlIlII[Options.lllIIlIIIlIlIl[77]] = lIIllllIllIllIIl("z5CZI89oC3ymwg6RhC3L8AEFyjPKIFMvrtgGSNXIe3A=", "fCHXm");
            Options.lllIIlIIIlIlII[Options.lllIIlIIIlIlIl[78]] = lIIllllIllIllIIl("f5iC+kW1fdAPHp9d4XnCS8JpacscLtlJ", "ipknP");
            Options.lllIIlIIIlIlII[Options.lllIIlIIIlIlIl[79]] = lIIllllIllIllIlI("hJtvPfXmxrCryLQ/42iqRygclwCFa31z+r8hw9T3H+4=", "gVRtp");
            Options.lllIIlIIIlIlII[Options.lllIIlIIIlIlIl[80]] = lIIllllIllIllIlI("iK9wQ2icxgdxez9xW+4tLbliIdYXIykZaJc33Mkphbk=", "UTWnG");
            Options.lllIIlIIIlIlII[Options.lllIIlIIIlIlIl[81]] = lIIllllIllIllIlI("x/IwMsQflsvjpBC7OY+6cEhrVKmmNt42y45UuKBT/LXMISEtJdhKRA==", "jyVsf");
            Options.lllIIlIIIlIlII[Options.lllIIlIIIlIlIl[82]] = lIIllllIllIllIIl("43QALTHsrvBfZynRPTXPfptgRBjJnk4D", "DgpHJ");
            Options.lllIIlIIIlIlII[Options.lllIIlIIIlIlIl[83]] = lIIllllIllIllIll("JgIwGDonAWoTOSYRLzA5PRc2HzQ9GzIUJg==", "IrDqU");
            Options.lllIIlIIIlIlII[Options.lllIIlIIIlIlIl[84]] = lIIllllIllIllIll("KhU+DDI9FCUdNDoFPQY4NhY1", "xPzYq");
            Options.lllIIlIIIlIlII[Options.lllIIlIIIlIlIl[85]] = lIIllllIllIllIIl("JIOw3A3qTd+kMDqekjuJPK3u7Z+YIei4LmMFCDaOU/o=", "lKnYg");
            Options.lllIIlIIIlIlII[Options.lllIIlIIIlIlIl[86]] = lIIllllIllIllIll("JiMyBRI6MjUEByciMR8=", "cmfLF");
            Options.lllIIlIIIlIlII[Options.lllIIlIIIlIlIl[87]] = lIIllllIllIllIll("NjkHOC43Ol00Ly0gBygSMSgXPjYq", "YIsQA");
        }
        
        private static String lIIllllIllIllIll(String llllllllllllIlIlllllIIlIlllllIIl, final String llllllllllllIlIlllllIIlIllllllIl) {
            llllllllllllIlIlllllIIlIlllllIIl = (float)new String(Base64.getDecoder().decode(((String)llllllllllllIlIlllllIIlIlllllIIl).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
            final StringBuilder llllllllllllIlIlllllIIlIllllllII = new StringBuilder();
            final char[] llllllllllllIlIlllllIIlIlllllIll = llllllllllllIlIlllllIIlIllllllIl.toCharArray();
            int llllllllllllIlIlllllIIlIlllllIlI = Options.lllIIlIIIlIlIl[0];
            final Exception llllllllllllIlIlllllIIlIllllIlII = (Object)((String)llllllllllllIlIlllllIIlIlllllIIl).toCharArray();
            final double llllllllllllIlIlllllIIlIllllIIll = llllllllllllIlIlllllIIlIllllIlII.length;
            byte llllllllllllIlIlllllIIlIllllIIlI = (byte)Options.lllIIlIIIlIlIl[0];
            while (lIIllllIlllIIIlI(llllllllllllIlIlllllIIlIllllIIlI, (int)llllllllllllIlIlllllIIlIllllIIll)) {
                final char llllllllllllIlIlllllIIlIllllllll = llllllllllllIlIlllllIIlIllllIlII[llllllllllllIlIlllllIIlIllllIIlI];
                llllllllllllIlIlllllIIlIllllllII.append((char)(llllllllllllIlIlllllIIlIllllllll ^ llllllllllllIlIlllllIIlIlllllIll[llllllllllllIlIlllllIIlIlllllIlI % llllllllllllIlIlllllIIlIlllllIll.length]));
                "".length();
                ++llllllllllllIlIlllllIIlIlllllIlI;
                ++llllllllllllIlIlllllIIlIllllIIlI;
                "".length();
                if (-(0x3B ^ 0x69 ^ (0x2A ^ 0x7C)) >= 0) {
                    return null;
                }
            }
            return String.valueOf(llllllllllllIlIlllllIIlIllllllII);
        }
        
        private static boolean lIIllllIlllIIIIl(final int llllllllllllIlIlllllIIlIllIlIllI) {
            return llllllllllllIlIlllllIIlIllIlIllI > 0;
        }
        
        static {
            lIIllllIllIlllIl();
            lIIllllIllIlllII();
            final Options[] enum$VALUES = new Options[Options.lllIIlIIIlIlIl[44]];
            enum$VALUES[Options.lllIIlIIIlIlIl[0]] = Options.INVERT_MOUSE;
            enum$VALUES[Options.lllIIlIIIlIlIl[1]] = Options.SENSITIVITY;
            enum$VALUES[Options.lllIIlIIIlIlIl[2]] = Options.FOV;
            enum$VALUES[Options.lllIIlIIIlIlIl[3]] = Options.GAMMA;
            enum$VALUES[Options.lllIIlIIIlIlIl[4]] = Options.SATURATION;
            enum$VALUES[Options.lllIIlIIIlIlIl[5]] = Options.RENDER_DISTANCE;
            enum$VALUES[Options.lllIIlIIIlIlIl[6]] = Options.VIEW_BOBBING;
            enum$VALUES[Options.lllIIlIIIlIlIl[7]] = Options.ANAGLYPH;
            enum$VALUES[Options.lllIIlIIIlIlIl[8]] = Options.FRAMERATE_LIMIT;
            enum$VALUES[Options.lllIIlIIIlIlIl[9]] = Options.FBO_ENABLE;
            enum$VALUES[Options.lllIIlIIIlIlIl[10]] = Options.RENDER_CLOUDS;
            enum$VALUES[Options.lllIIlIIIlIlIl[11]] = Options.GRAPHICS;
            enum$VALUES[Options.lllIIlIIIlIlIl[12]] = Options.AMBIENT_OCCLUSION;
            enum$VALUES[Options.lllIIlIIIlIlIl[13]] = Options.GUI_SCALE;
            enum$VALUES[Options.lllIIlIIIlIlIl[14]] = Options.PARTICLES;
            enum$VALUES[Options.lllIIlIIIlIlIl[15]] = Options.CHAT_VISIBILITY;
            enum$VALUES[Options.lllIIlIIIlIlIl[16]] = Options.CHAT_COLOR;
            enum$VALUES[Options.lllIIlIIIlIlIl[17]] = Options.CHAT_LINKS;
            enum$VALUES[Options.lllIIlIIIlIlIl[18]] = Options.CHAT_OPACITY;
            enum$VALUES[Options.lllIIlIIIlIlIl[19]] = Options.CHAT_LINKS_PROMPT;
            enum$VALUES[Options.lllIIlIIIlIlIl[20]] = Options.SNOOPER_ENABLED;
            enum$VALUES[Options.lllIIlIIIlIlIl[21]] = Options.USE_FULLSCREEN;
            enum$VALUES[Options.lllIIlIIIlIlIl[22]] = Options.ENABLE_VSYNC;
            enum$VALUES[Options.lllIIlIIIlIlIl[23]] = Options.USE_VBO;
            enum$VALUES[Options.lllIIlIIIlIlIl[24]] = Options.TOUCHSCREEN;
            enum$VALUES[Options.lllIIlIIIlIlIl[25]] = Options.CHAT_SCALE;
            enum$VALUES[Options.lllIIlIIIlIlIl[26]] = Options.CHAT_WIDTH;
            enum$VALUES[Options.lllIIlIIIlIlIl[27]] = Options.CHAT_HEIGHT_FOCUSED;
            enum$VALUES[Options.lllIIlIIIlIlIl[28]] = Options.CHAT_HEIGHT_UNFOCUSED;
            enum$VALUES[Options.lllIIlIIIlIlIl[29]] = Options.MIPMAP_LEVELS;
            enum$VALUES[Options.lllIIlIIIlIlIl[30]] = Options.FORCE_UNICODE_FONT;
            enum$VALUES[Options.lllIIlIIIlIlIl[31]] = Options.STREAM_BYTES_PER_PIXEL;
            enum$VALUES[Options.lllIIlIIIlIlIl[32]] = Options.STREAM_VOLUME_MIC;
            enum$VALUES[Options.lllIIlIIIlIlIl[33]] = Options.STREAM_VOLUME_SYSTEM;
            enum$VALUES[Options.lllIIlIIIlIlIl[34]] = Options.STREAM_KBPS;
            enum$VALUES[Options.lllIIlIIIlIlIl[35]] = Options.STREAM_FPS;
            enum$VALUES[Options.lllIIlIIIlIlIl[36]] = Options.STREAM_COMPRESSION;
            enum$VALUES[Options.lllIIlIIIlIlIl[37]] = Options.STREAM_SEND_METADATA;
            enum$VALUES[Options.lllIIlIIIlIlIl[38]] = Options.STREAM_CHAT_ENABLED;
            enum$VALUES[Options.lllIIlIIIlIlIl[39]] = Options.STREAM_CHAT_USER_FILTER;
            enum$VALUES[Options.lllIIlIIIlIlIl[40]] = Options.STREAM_MIC_TOGGLE_BEHAVIOR;
            enum$VALUES[Options.lllIIlIIIlIlIl[41]] = Options.BLOCK_ALTERNATIVES;
            enum$VALUES[Options.lllIIlIIIlIlIl[42]] = Options.REDUCED_DEBUG_INFO;
            enum$VALUES[Options.lllIIlIIIlIlIl[43]] = Options.ENTITY_SHADOWS;
            ENUM$VALUES = enum$VALUES;
        }
        
        private Options(final String llllllllllllIlIlllllIIllIlIlIllI, final int llllllllllllIlIlllllIIllIlIlIlIl, final String llllllllllllIlIlllllIIllIlIlIlII, final boolean llllllllllllIlIlllllIIllIlIlIIll, final boolean llllllllllllIlIlllllIIllIlIllIll, final float llllllllllllIlIlllllIIllIlIllIlI, final float llllllllllllIlIlllllIIllIlIllIIl, final float llllllllllllIlIlllllIIllIlIIllll) {
            this.enumString = llllllllllllIlIlllllIIllIlIlIlII;
            this.enumFloat = llllllllllllIlIlllllIIllIlIlIIll;
            this.enumBoolean = llllllllllllIlIlllllIIllIlIllIll;
            this.valueMin = llllllllllllIlIlllllIIllIlIllIlI;
            this.valueMax = llllllllllllIlIlllllIIllIlIllIIl;
            this.valueStep = llllllllllllIlIlllllIIllIlIIllll;
        }
        
        private static int lIIllllIlllIIIII(final float n, final float n2) {
            return fcmpl(n, n2);
        }
        
        private static void lIIllllIllIlllIl() {
            (lllIIlIIIlIlIl = new int[89])[0] = ((" ".length() ^ (0x7E ^ 0x2D)) & (115 + 184 - 203 + 98 ^ 83 + 45 - 117 + 133 ^ -" ".length()));
            Options.lllIIlIIIlIlIl[1] = " ".length();
            Options.lllIIlIIIlIlIl[2] = "  ".length();
            Options.lllIIlIIIlIlIl[3] = "   ".length();
            Options.lllIIlIIIlIlIl[4] = (0x74 ^ 0x70);
            Options.lllIIlIIIlIlIl[5] = (47 + 135 - 35 + 11 ^ 46 + 118 - 65 + 56);
            Options.lllIIlIIIlIlIl[6] = (0x15 ^ 0x13);
            Options.lllIIlIIIlIlIl[7] = (0x6E ^ 0x69);
            Options.lllIIlIIIlIlIl[8] = (0x75 ^ 0x7D);
            Options.lllIIlIIIlIlIl[9] = (0x3F ^ 0x36);
            Options.lllIIlIIIlIlIl[10] = (111 + 25 - 81 + 116 ^ 33 + 69 + 21 + 38);
            Options.lllIIlIIIlIlIl[11] = (20 + 89 - 72 + 122 ^ 91 + 34 - 65 + 88);
            Options.lllIIlIIIlIlIl[12] = (0x4A ^ 0x46);
            Options.lllIIlIIIlIlIl[13] = (0xA6 ^ 0xAB);
            Options.lllIIlIIIlIlIl[14] = (0xC9 ^ 0xC7);
            Options.lllIIlIIIlIlIl[15] = (0x7A ^ 0x75);
            Options.lllIIlIIIlIlIl[16] = (0x1E ^ 0x76 ^ (0x78 ^ 0x0));
            Options.lllIIlIIIlIlIl[17] = (0x65 ^ 0x74);
            Options.lllIIlIIIlIlIl[18] = (0x34 ^ 0x26);
            Options.lllIIlIIIlIlIl[19] = (0x4A ^ 0x59);
            Options.lllIIlIIIlIlIl[20] = (0x62 ^ 0x76);
            Options.lllIIlIIIlIlIl[21] = (0x77 ^ 0x62);
            Options.lllIIlIIIlIlIl[22] = (0x46 ^ 0x74 ^ (0xBA ^ 0x9E));
            Options.lllIIlIIIlIlIl[23] = (0xCE ^ 0x89 ^ (0x6C ^ 0x3C));
            Options.lllIIlIIIlIlIl[24] = (0x15 ^ 0xD);
            Options.lllIIlIIIlIlIl[25] = (0x89 ^ 0x90);
            Options.lllIIlIIIlIlIl[26] = (101 + 113 - 90 + 34 ^ 112 + 5 + 8 + 7);
            Options.lllIIlIIIlIlIl[27] = (0xCC ^ 0x9F ^ (0xFB ^ 0xB3));
            Options.lllIIlIIIlIlIl[28] = (0x55 ^ 0x77 ^ (0x5 ^ 0x3B));
            Options.lllIIlIIIlIlIl[29] = (0xBD ^ 0xA0);
            Options.lllIIlIIIlIlIl[30] = (0x8F ^ 0x8A ^ (0xDB ^ 0xC0));
            Options.lllIIlIIIlIlIl[31] = (0x91 ^ 0x8E);
            Options.lllIIlIIIlIlIl[32] = (0xB4 ^ 0x94);
            Options.lllIIlIIIlIlIl[33] = (0xE0 ^ 0xC1);
            Options.lllIIlIIIlIlIl[34] = (0x56 ^ 0x74);
            Options.lllIIlIIIlIlIl[35] = (0xE4 ^ 0x99 ^ (0x4A ^ 0x14));
            Options.lllIIlIIIlIlIl[36] = (0xB5 ^ 0xA4 ^ (0x17 ^ 0x22));
            Options.lllIIlIIIlIlIl[37] = (0x53 ^ 0x76);
            Options.lllIIlIIIlIlIl[38] = (71 + 109 - 87 + 43 ^ 13 + 103 - 62 + 120);
            Options.lllIIlIIIlIlIl[39] = (0x3 ^ 0x4F ^ (0x7F ^ 0x14));
            Options.lllIIlIIIlIlIl[40] = (0xE8 ^ 0xB5 ^ (0x14 ^ 0x61));
            Options.lllIIlIIIlIlIl[41] = (0x4C ^ 0x7A ^ (0x43 ^ 0x5C));
            Options.lllIIlIIIlIlIl[42] = (0x42 ^ 0x68);
            Options.lllIIlIIIlIlIl[43] = (0xAF ^ 0x84);
            Options.lllIIlIIIlIlIl[44] = (0x4C ^ 0x60);
            Options.lllIIlIIIlIlIl[45] = (33 + 67 - 7 + 35 ^ 10 + 123 - 36 + 76);
            Options.lllIIlIIIlIlIl[46] = (0x48 ^ 0x66);
            Options.lllIIlIIIlIlIl[47] = (0x9C ^ 0xB3);
            Options.lllIIlIIIlIlIl[48] = (4 + 107 - 97 + 173 ^ 105 + 116 - 114 + 32);
            Options.lllIIlIIIlIlIl[49] = (0x13 ^ 0x29 ^ (0x55 ^ 0x5E));
            Options.lllIIlIIIlIlIl[50] = (0x1D ^ 0x27 ^ (0x5D ^ 0x55));
            Options.lllIIlIIIlIlIl[51] = (0xE ^ 0x3D);
            Options.lllIIlIIIlIlIl[52] = (67 + 44 - 11 + 44 ^ 110 + 100 - 160 + 114);
            Options.lllIIlIIIlIlIl[53] = (63 + 136 - 134 + 113 ^ 50 + 71 - 100 + 114);
            Options.lllIIlIIIlIlIl[54] = (0xF6 ^ 0xC0);
            Options.lllIIlIIIlIlIl[55] = (0x1 ^ 0x18 ^ (0xBE ^ 0x90));
            Options.lllIIlIIIlIlIl[56] = (0xF ^ 0x37);
            Options.lllIIlIIIlIlIl[57] = (0x9A ^ 0xA3);
            Options.lllIIlIIIlIlIl[58] = (0x60 ^ 0x5A);
            Options.lllIIlIIIlIlIl[59] = (0x83 ^ 0xB8);
            Options.lllIIlIIIlIlIl[60] = (0x62 ^ 0x5E);
            Options.lllIIlIIIlIlIl[61] = (0x9D ^ 0x84 ^ (0x58 ^ 0x7C));
            Options.lllIIlIIIlIlIl[62] = (0xAD ^ 0x93);
            Options.lllIIlIIIlIlIl[63] = (0x74 ^ 0x4B);
            Options.lllIIlIIIlIlIl[64] = (0x44 ^ 0x57 ^ (0xFE ^ 0xAD));
            Options.lllIIlIIIlIlIl[65] = (0x2E ^ 0x61 ^ (0x7C ^ 0x72));
            Options.lllIIlIIIlIlIl[66] = (0xE6 ^ 0xAE ^ (0xBD ^ 0xB7));
            Options.lllIIlIIIlIlIl[67] = (83 + 218 - 196 + 132 ^ 21 + 87 + 66 + 0);
            Options.lllIIlIIIlIlIl[68] = (0xE6 ^ 0xAE ^ (0x27 ^ 0x2B));
            Options.lllIIlIIIlIlIl[69] = (162 + 172 - 111 + 26 ^ 127 + 49 - 65 + 77);
            Options.lllIIlIIIlIlIl[70] = (164 + 108 - 167 + 121 ^ 42 + 69 - 75 + 128);
            Options.lllIIlIIIlIlIl[71] = (155 + 194 - 308 + 177 ^ 91 + 43 - 29 + 52);
            Options.lllIIlIIIlIlIl[72] = (84 + 90 - 111 + 75 ^ 172 + 186 - 217 + 53);
            Options.lllIIlIIIlIlIl[73] = (0xE2 ^ 0xBC ^ (0x9B ^ 0x8C));
            Options.lllIIlIIIlIlIl[74] = (0xF7 ^ 0xB0 ^ (0x4E ^ 0x43));
            Options.lllIIlIIIlIlIl[75] = (211 + 189 - 251 + 72 ^ 84 + 137 - 97 + 26);
            Options.lllIIlIIIlIlIl[76] = (0x62 ^ 0x78 ^ (0x90 ^ 0xC6));
            Options.lllIIlIIIlIlIl[77] = (122 + 68 + 16 + 28 ^ 129 + 15 - 111 + 134);
            Options.lllIIlIIIlIlIl[78] = (0x78 ^ 0x4F ^ (0x56 ^ 0x2F));
            Options.lllIIlIIIlIlIl[79] = (0x7E ^ 0x7A ^ (0x60 ^ 0x2B));
            Options.lllIIlIIIlIlIl[80] = (0x3D ^ 0x6D);
            Options.lllIIlIIIlIlIl[81] = (85 + 253 - 86 + 3 ^ 148 + 53 - 200 + 173);
            Options.lllIIlIIIlIlIl[82] = (0xEF ^ 0xBD);
            Options.lllIIlIIIlIlIl[83] = (0x52 ^ 0x1);
            Options.lllIIlIIIlIlIl[84] = (0x1F ^ 0x4B);
            Options.lllIIlIIIlIlIl[85] = (0x17 ^ 0x42);
            Options.lllIIlIIIlIlIl[86] = (0x44 ^ 0x12);
            Options.lllIIlIIIlIlIl[87] = (0x6D ^ 0x7E ^ (0x7E ^ 0x3A));
            Options.lllIIlIIIlIlIl[88] = (0xF4 ^ 0xA5 ^ (0x86 ^ 0x8F));
        }
        
        public boolean getEnumBoolean() {
            return this.enumBoolean;
        }
        
        public float denormalizeValue(final float llllllllllllIlIlllllIIllIIlIlllI) {
            return this.snapToStepClamp(this.valueMin + (this.valueMax - this.valueMin) * MathHelper.clamp_float(llllllllllllIlIlllllIIllIIlIlllI, 0.0f, 1.0f));
        }
        
        public boolean getEnumFloat() {
            return this.enumFloat;
        }
        
        public void setValueMax(final float llllllllllllIlIlllllIIllIIlllIlI) {
            this.valueMax = llllllllllllIlIlllllIIllIIlllIlI;
        }
        
        private Options(final String llllllllllllIlIlllllIIllIllIllII, final int llllllllllllIlIlllllIIllIllIlIll, final String llllllllllllIlIlllllIIllIllIlIlI, final boolean llllllllllllIlIlllllIIllIllIlIIl, final boolean llllllllllllIlIlllllIIllIllIlllI) {
            this(llllllllllllIlIlllllIIllIllIllII, llllllllllllIlIlllllIIllIllIlIll, llllllllllllIlIlllllIIllIllIlIlI, llllllllllllIlIlllllIIllIllIlIIl, llllllllllllIlIlllllIIllIllIlllI, 0.0f, 1.0f, 0.0f);
        }
        
        protected float snapToStep(float llllllllllllIlIlllllIIllIIlIIIlI) {
            if (lIIllllIlllIIIIl(lIIllllIlllIIIII(this.valueStep, 0.0f))) {
                llllllllllllIlIlllllIIllIIlIIIlI = this.valueStep * Math.round(llllllllllllIlIlllllIIllIIlIIIlI / this.valueStep);
            }
            return llllllllllllIlIlllllIIllIIlIIIlI;
        }
        
        public String getEnumString() {
            return this.enumString;
        }
        
        public float getValueMax() {
            return this.valueMax;
        }
        
        public static Options getEnumOptions(final int llllllllllllIlIlllllIIllIllllllI) {
            final char llllllllllllIlIlllllIIllIllllIII;
            final double llllllllllllIlIlllllIIllIllllIIl = ((Options[])(Object)(llllllllllllIlIlllllIIllIllllIII = (char)(Object)values())).length;
            long llllllllllllIlIlllllIIllIllllIlI = Options.lllIIlIIIlIlIl[0];
            "".length();
            if (((0xD9 ^ 0x84 ^ (0xC ^ 0x57)) & (0x8C ^ 0x80 ^ (0x90 ^ 0x9A) ^ -" ".length())) >= "  ".length()) {
                return null;
            }
            while (!lIIllllIllIlllll((int)llllllllllllIlIlllllIIllIllllIlI, (int)llllllllllllIlIlllllIIllIllllIIl)) {
                final Options llllllllllllIlIlllllIIllIlllllIl = llllllllllllIlIlllllIIllIllllIII[llllllllllllIlIlllllIIllIllllIlI];
                if (lIIllllIllIllllI(llllllllllllIlIlllllIIllIlllllIl.returnEnumOrdinal(), llllllllllllIlIlllllIIllIllllllI)) {
                    return llllllllllllIlIlllllIIllIlllllIl;
                }
                ++llllllllllllIlIlllllIIllIllllIlI;
            }
            return null;
        }
        
        private static boolean lIIllllIllIllllI(final int llllllllllllIlIlllllIIlIlllIIIIl, final int llllllllllllIlIlllllIIlIlllIIIII) {
            return llllllllllllIlIlllllIIlIlllIIIIl == llllllllllllIlIlllllIIlIlllIIIII;
        }
        
        private static boolean lIIllllIlllIIIlI(final int llllllllllllIlIlllllIIlIllIllIIl, final int llllllllllllIlIlllllIIlIllIllIII) {
            return llllllllllllIlIlllllIIlIllIllIIl < llllllllllllIlIlllllIIlIllIllIII;
        }
        
        public float snapToStepClamp(float llllllllllllIlIlllllIIllIIlIlIII) {
            llllllllllllIlIlllllIIllIIlIlIII = this.snapToStep(llllllllllllIlIlllllIIllIIlIlIII);
            return MathHelper.clamp_float(llllllllllllIlIlllllIIllIIlIlIII, this.valueMin, this.valueMax);
        }
        
        private static String lIIllllIllIllIlI(final String llllllllllllIlIlllllIIlIlllIlIIl, final String llllllllllllIlIlllllIIlIlllIlIII) {
            try {
                final SecretKeySpec llllllllllllIlIlllllIIlIlllIllII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIlIlllllIIlIlllIlIII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
                final Cipher llllllllllllIlIlllllIIlIlllIlIll = Cipher.getInstance("Blowfish");
                llllllllllllIlIlllllIIlIlllIlIll.init(Options.lllIIlIIIlIlIl[2], llllllllllllIlIlllllIIlIlllIllII);
                return new String(llllllllllllIlIlllllIIlIlllIlIll.doFinal(Base64.getDecoder().decode(llllllllllllIlIlllllIIlIlllIlIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
            }
            catch (Exception llllllllllllIlIlllllIIlIlllIlIlI) {
                llllllllllllIlIlllllIIlIlllIlIlI.printStackTrace();
                return null;
            }
        }
        
        private static String lIIllllIllIllIIl(final String llllllllllllIlIlllllIIllIIIIlllI, final String llllllllllllIlIlllllIIllIIIIllIl) {
            try {
                final SecretKeySpec llllllllllllIlIlllllIIllIIIlIIIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIlIlllllIIllIIIIllIl.getBytes(StandardCharsets.UTF_8)), Options.lllIIlIIIlIlIl[8]), "DES");
                final Cipher llllllllllllIlIlllllIIllIIIlIIII = Cipher.getInstance("DES");
                llllllllllllIlIlllllIIllIIIlIIII.init(Options.lllIIlIIIlIlIl[2], llllllllllllIlIlllllIIllIIIlIIIl);
                return new String(llllllllllllIlIlllllIIllIIIlIIII.doFinal(Base64.getDecoder().decode(llllllllllllIlIlllllIIllIIIIlllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
            }
            catch (Exception llllllllllllIlIlllllIIllIIIIllll) {
                llllllllllllIlIlllllIIllIIIIllll.printStackTrace();
                return null;
            }
        }
        
        public float normalizeValue(final float llllllllllllIlIlllllIIllIIllIlII) {
            return MathHelper.clamp_float((this.snapToStepClamp(llllllllllllIlIlllllIIllIIllIlII) - this.valueMin) / (this.valueMax - this.valueMin), 0.0f, 1.0f);
        }
    }
}
