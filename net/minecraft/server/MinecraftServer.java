// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.server;

import java.util.Iterator;
import net.minecraft.command.ServerCommandManager;
import java.awt.GraphicsEnvironment;
import net.minecraft.world.chunk.storage.AnvilSaveConverter;
import net.minecraft.util.Vec3;
import net.minecraft.entity.player.EntityPlayer;
import java.util.Date;
import java.text.SimpleDateFormat;
import net.minecraft.util.ChatComponentText;
import java.util.UUID;
import com.google.common.collect.Queues;
import net.minecraft.util.IChatComponent;
import net.minecraft.command.CommandResultStats;
import org.apache.logging.log4j.LogManager;
import java.util.concurrent.Executors;
import net.minecraft.world.EnumDifficulty;
import net.minecraft.world.storage.ISaveHandler;
import net.minecraft.world.IWorldAccess;
import net.minecraft.world.WorldManager;
import net.minecraft.world.WorldServerMulti;
import net.minecraft.world.storage.WorldInfo;
import net.minecraft.world.demo.DemoWorldServer;
import net.minecraft.world.WorldType;
import java.util.Collections;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.util.MathHelper;
import com.mojang.authlib.GameProfile;
import java.util.Arrays;
import net.minecraft.util.ReportedException;
import net.minecraft.crash.CrashReport;
import net.minecraft.network.Packet;
import net.minecraft.network.play.server.S03PacketTimeUpdate;
import net.minecraft.util.Util;
import net.minecraft.entity.Entity;
import net.minecraft.command.CommandBase;
import com.google.common.collect.Lists;
import net.minecraft.world.MinecraftException;
import net.minecraft.world.World;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.security.MessageDigest;
import java.nio.charset.StandardCharsets;
import net.minecraft.util.IProgressUpdate;
import com.google.common.util.concurrent.Futures;
import com.google.common.util.concurrent.ListenableFutureTask;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Callable;
import net.minecraft.util.BlockPos;
import java.io.IOException;
import java.awt.image.BufferedImage;
import io.netty.buffer.ByteBuf;
import com.google.common.base.Charsets;
import io.netty.handler.codec.base64.Base64;
import java.io.OutputStream;
import java.awt.image.RenderedImage;
import io.netty.buffer.ByteBufOutputStream;
import org.apache.commons.lang3.Validate;
import javax.imageio.ImageIO;
import io.netty.buffer.Unpooled;
import net.minecraft.world.WorldSettings;
import java.util.concurrent.FutureTask;
import java.util.Queue;
import net.minecraft.world.WorldServer;
import org.apache.logging.log4j.Logger;
import net.minecraft.profiler.PlayerUsageSnooper;
import java.util.Random;
import net.minecraft.network.NetworkSystem;
import com.mojang.authlib.minecraft.MinecraftSessionService;
import com.mojang.authlib.yggdrasil.YggdrasilAuthenticationService;
import net.minecraft.network.ServerStatusResponse;
import java.net.Proxy;
import net.minecraft.profiler.Profiler;
import net.minecraft.command.ICommandManager;
import net.minecraft.world.storage.ISaveFormat;
import net.minecraft.util.ITickable;
import java.util.List;
import net.minecraft.server.management.PlayerProfileCache;
import net.minecraft.server.management.ServerConfigurationManager;
import com.mojang.authlib.GameProfileRepository;
import java.io.File;
import java.security.KeyPair;
import net.minecraft.util.IThreadListener;
import net.minecraft.command.ICommandSender;
import net.minecraft.profiler.IPlayerUsage;

public abstract class MinecraftServer implements Runnable, IPlayerUsage, ICommandSender, IThreadListener
{
    private /* synthetic */ KeyPair serverKeyPair;
    public /* synthetic */ String currentTask;
    private final /* synthetic */ GameProfileRepository profileRepo;
    private /* synthetic */ ServerConfigurationManager serverConfigManager;
    private final /* synthetic */ PlayerProfileCache profileCache;
    private /* synthetic */ String motd;
    private /* synthetic */ boolean canSpawnAnimals;
    private /* synthetic */ boolean serverRunning;
    private /* synthetic */ String resourcePackUrl;
    private /* synthetic */ boolean onlineMode;
    private /* synthetic */ String userMessage;
    private /* synthetic */ boolean isDemo;
    private /* synthetic */ boolean canSpawnNPCs;
    public /* synthetic */ int percentDone;
    private static final /* synthetic */ String[] llIlllIIIIIlll;
    private /* synthetic */ boolean allowFlight;
    private final /* synthetic */ List<ITickable> playersOnline;
    private /* synthetic */ String worldName;
    private /* synthetic */ boolean isGamemodeForced;
    public final /* synthetic */ long[] tickTimeArray;
    private /* synthetic */ boolean serverStopped;
    private /* synthetic */ int buildLimit;
    private final /* synthetic */ ISaveFormat anvilConverterForAnvilFile;
    protected final /* synthetic */ ICommandManager commandManager;
    private /* synthetic */ Thread serverThread;
    public final /* synthetic */ Profiler theProfiler;
    private /* synthetic */ long currentTime;
    protected final /* synthetic */ Proxy serverProxy;
    private final /* synthetic */ ServerStatusResponse statusResponse;
    private static final /* synthetic */ int[] llIlllIIIlIIII;
    private final /* synthetic */ YggdrasilAuthenticationService authService;
    private /* synthetic */ int tickCounter;
    private /* synthetic */ int serverPort;
    private /* synthetic */ boolean pvpEnabled;
    private /* synthetic */ long nanoTimeSinceStatusRefresh;
    private /* synthetic */ boolean serverIsRunning;
    private /* synthetic */ String serverOwner;
    private /* synthetic */ String resourcePackHash;
    private final /* synthetic */ MinecraftSessionService sessionService;
    private final /* synthetic */ NetworkSystem networkSystem;
    private final /* synthetic */ File anvilFile;
    private /* synthetic */ boolean worldIsBeingDeleted;
    private /* synthetic */ boolean startProfiling;
    private final /* synthetic */ Random random;
    private static /* synthetic */ MinecraftServer mcServer;
    private final /* synthetic */ PlayerUsageSnooper usageSnooper;
    private /* synthetic */ long timeOfLastWarning;
    private static final /* synthetic */ Logger logger;
    public /* synthetic */ WorldServer[] worldServers;
    private /* synthetic */ String folderName;
    protected final /* synthetic */ Queue<FutureTask<?>> futureTaskQueue;
    private /* synthetic */ int maxPlayerIdleMinutes;
    private /* synthetic */ boolean enableBonusChest;
    public /* synthetic */ long[][] timeOfLastDimensionTick;
    
    protected boolean allowSpawnMonsters() {
        return MinecraftServer.llIlllIIIlIIII[1] != 0;
    }
    
    public NetworkSystem getNetworkSystem() {
        return this.networkSystem;
    }
    
    public abstract String shareToLAN(final WorldSettings.GameType p0, final boolean p1);
    
    private void addFaviconToStatusResponse(final ServerStatusResponse llllllllllllIllIIlIlIIlllIllllIl) {
        final File llllllllllllIllIIlIlIIlllIllllII = this.getFile(MinecraftServer.llIlllIIIIIlll[MinecraftServer.llIlllIIIlIIII[44]]);
        if (lIIllIIlIIIllIll(llllllllllllIllIIlIlIIlllIllllII.isFile() ? 1 : 0)) {
            final ByteBuf llllllllllllIllIIlIlIIlllIlllIll = Unpooled.buffer();
            try {
                final BufferedImage llllllllllllIllIIlIlIIlllIlllIlI = ImageIO.read(llllllllllllIllIIlIlIIlllIllllII);
                int n;
                if (lIIllIIlIIIlllIl(llllllllllllIllIIlIlIIlllIlllIlI.getWidth(), MinecraftServer.llIlllIIIlIIII[45])) {
                    n = MinecraftServer.llIlllIIIlIIII[1];
                    "".length();
                    if (-"   ".length() >= 0) {
                        return;
                    }
                }
                else {
                    n = MinecraftServer.llIlllIIIlIIII[0];
                }
                Validate.validState((boolean)(n != 0), MinecraftServer.llIlllIIIIIlll[MinecraftServer.llIlllIIIlIIII[46]], new Object[MinecraftServer.llIlllIIIlIIII[0]]);
                int n2;
                if (lIIllIIlIIIlllIl(llllllllllllIllIIlIlIIlllIlllIlI.getHeight(), MinecraftServer.llIlllIIIlIIII[45])) {
                    n2 = MinecraftServer.llIlllIIIlIIII[1];
                    "".length();
                    if (null != null) {
                        return;
                    }
                }
                else {
                    n2 = MinecraftServer.llIlllIIIlIIII[0];
                }
                Validate.validState((boolean)(n2 != 0), MinecraftServer.llIlllIIIIIlll[MinecraftServer.llIlllIIIlIIII[47]], new Object[MinecraftServer.llIlllIIIlIIII[0]]);
                ImageIO.write(llllllllllllIllIIlIlIIlllIlllIlI, MinecraftServer.llIlllIIIIIlll[MinecraftServer.llIlllIIIlIIII[48]], new ByteBufOutputStream(llllllllllllIllIIlIlIIlllIlllIll));
                "".length();
                final ByteBuf llllllllllllIllIIlIlIIlllIlllIIl = Base64.encode(llllllllllllIllIIlIlIIlllIlllIll);
                llllllllllllIllIIlIlIIlllIllllIl.setFavicon(String.valueOf(new StringBuilder(MinecraftServer.llIlllIIIIIlll[MinecraftServer.llIlllIIIlIIII[49]]).append(llllllllllllIllIIlIlIIlllIlllIIl.toString(Charsets.UTF_8))));
                "".length();
                if (((0x78 ^ 0xC ^ (0x1 ^ 0x38)) & (88 + 109 - 95 + 113 ^ 146 + 114 - 162 + 56 ^ -" ".length())) == "   ".length()) {
                    return;
                }
            }
            catch (Exception llllllllllllIllIIlIlIIlllIlllIII) {
                MinecraftServer.logger.error(MinecraftServer.llIlllIIIIIlll[MinecraftServer.llIlllIIIlIIII[50]], (Throwable)llllllllllllIllIIlIlIIlllIlllIII);
                llllllllllllIllIIlIlIIlllIlllIll.release();
                "".length();
                "".length();
                if (((0x57 ^ 0x58) & ~(0x47 ^ 0x48)) == " ".length()) {
                    return;
                }
                return;
            }
            finally {
                llllllllllllIllIIlIlIIlllIlllIll.release();
                "".length();
            }
            llllllllllllIllIIlIlIIlllIlllIll.release();
            "".length();
        }
    }
    
    private static boolean lIIllIIlIIlIlIIl(final int llllllllllllIllIIlIlIIIlIlIlIlII, final int llllllllllllIllIIlIlIIIlIlIlIIll) {
        return llllllllllllIllIIlIlIIIlIlIlIlII > llllllllllllIllIIlIlIIIlIlIlIIll;
    }
    
    public abstract boolean canStructuresSpawn();
    
    public void setFolderName(final String llllllllllllIllIIlIlIIllIIIllIlI) {
        this.folderName = llllllllllllIllIIlIlIIllIIIllIlI;
    }
    
    public File getDataDirectory() {
        return new File(MinecraftServer.llIlllIIIIIlll[MinecraftServer.llIlllIIIlIIII[51]]);
    }
    
    public abstract boolean isDedicatedServer();
    
    protected abstract boolean startServer() throws IOException;
    
    public boolean isSinglePlayer() {
        if (lIIllIIlIIlIIIll(this.serverOwner)) {
            return MinecraftServer.llIlllIIIlIIII[1] != 0;
        }
        return MinecraftServer.llIlllIIIlIIII[0] != 0;
    }
    
    protected synchronized void setUserMessage(final String llllllllllllIllIIlIlIlIIlllIllll) {
        this.userMessage = llllllllllllIllIIlIlIlIIlllIllll;
    }
    
    public GameProfileRepository getGameProfileRepository() {
        return this.profileRepo;
    }
    
    public String getServerOwner() {
        return this.serverOwner;
    }
    
    public boolean isAnvilFileSet() {
        if (lIIllIIlIIlIIIll(this.anvilFile)) {
            return MinecraftServer.llIlllIIIlIIII[1] != 0;
        }
        return MinecraftServer.llIlllIIIlIIII[0] != 0;
    }
    
    public String[] getAllUsernames() {
        return this.serverConfigManager.getAllUsernames();
    }
    
    @Override
    public BlockPos getPosition() {
        return BlockPos.ORIGIN;
    }
    
    public <V> ListenableFuture<V> callFromMainThread(final Callable<V> llllllllllllIllIIlIlIIIllllIIIII) {
        Validate.notNull((Object)llllllllllllIllIIlIlIIIllllIIIII);
        "".length();
        if (lIIllIIlIIIllllI(this.isCallingFromMinecraftThread() ? 1 : 0) && lIIllIIlIIIllllI(this.isServerStopped() ? 1 : 0)) {
            final ListenableFutureTask<V> llllllllllllIllIIlIlIIIllllIIIll = (ListenableFutureTask<V>)ListenableFutureTask.create((Callable)llllllllllllIllIIlIlIIIllllIIIII);
            synchronized (this.futureTaskQueue) {
                this.futureTaskQueue.add((FutureTask<?>)llllllllllllIllIIlIlIIIllllIIIll);
                "".length();
                final ListenableFutureTask<V> listenableFutureTask = llllllllllllIllIIlIlIIIllllIIIll;
                // monitorexit(this.futureTaskQueue)
                return (ListenableFuture<V>)listenableFutureTask;
            }
        }
        try {
            return (ListenableFuture<V>)Futures.immediateFuture((Object)llllllllllllIllIIlIlIIIllllIIIII.call());
        }
        catch (Exception llllllllllllIllIIlIlIIIllllIIIlI) {
            return (ListenableFuture<V>)Futures.immediateFailedCheckedFuture(llllllllllllIllIIlIlIIIllllIIIlI);
        }
    }
    
    private static boolean lIIllIIlIIlIIIll(final Object llllllllllllIllIIlIlIIIlIlIIllIl) {
        return llllllllllllIllIIlIlIIIlIlIIllIl != null;
    }
    
    public boolean isServerInOnlineMode() {
        return this.onlineMode;
    }
    
    public abstract boolean func_181034_q();
    
    public static MinecraftServer getServer() {
        return MinecraftServer.mcServer;
    }
    
    public void setAllowPvp(final boolean llllllllllllIllIIlIlIIlIlIIlIlll) {
        this.pvpEnabled = llllllllllllIllIIlIlIIlIlIIlIlll;
    }
    
    public void setAllowFlight(final boolean llllllllllllIllIIlIlIIlIlIIIlllI) {
        this.allowFlight = llllllllllllIllIIlIlIIlIlIIIlllI;
    }
    
    public ICommandManager getCommandManager() {
        return this.commandManager;
    }
    
    protected void convertMapIfNeeded(final String llllllllllllIllIIlIlIlIIllllIIll) {
        if (lIIllIIlIIIllIll(this.getActiveAnvilConverter().isOldMapFormat(llllllllllllIllIIlIlIlIIllllIIll) ? 1 : 0)) {
            MinecraftServer.logger.info(MinecraftServer.llIlllIIIIIlll[MinecraftServer.llIlllIIIlIIII[9]]);
            this.setUserMessage(MinecraftServer.llIlllIIIIIlll[MinecraftServer.llIlllIIIlIIII[10]]);
            this.getActiveAnvilConverter().convertMapFormat(llllllllllllIllIIlIlIlIIllllIIll, new IProgressUpdate() {
                private static final /* synthetic */ String[] lIIlllIlIlllll;
                private static final /* synthetic */ int[] lIlIIIIlIIIllI;
                private /* synthetic */ long startTime = System.currentTimeMillis();
                
                @Override
                public void displaySavingString(final String lllllllllllllIIlIIIIllIIIllIlllI) {
                }
                
                private static boolean lllIIIIlIIllIlI(final int lllllllllllllIIlIIIIllIIIIlllIll, final int lllllllllllllIIlIIIIllIIIIlllIlI) {
                    return lllllllllllllIIlIIIIllIIIIlllIll < lllllllllllllIIlIIIIllIIIIlllIlI;
                }
                
                @Override
                public void setDoneWorking() {
                }
                
                private static String lllIIIIlIIIlllI(String lllllllllllllIIlIIIIllIIIlIIIllI, final String lllllllllllllIIlIIIIllIIIlIIIlIl) {
                    lllllllllllllIIlIIIIllIIIlIIIllI = new String(java.util.Base64.getDecoder().decode(lllllllllllllIIlIIIIllIIIlIIIllI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
                    final StringBuilder lllllllllllllIIlIIIIllIIIlIIlIIl = new StringBuilder();
                    final char[] lllllllllllllIIlIIIIllIIIlIIlIII = lllllllllllllIIlIIIIllIIIlIIIlIl.toCharArray();
                    int lllllllllllllIIlIIIIllIIIlIIIlll = MinecraftServer$1.lIlIIIIlIIIllI[0];
                    final String lllllllllllllIIlIIIIllIIIlIIIIIl = (Object)lllllllllllllIIlIIIIllIIIlIIIllI.toCharArray();
                    final char lllllllllllllIIlIIIIllIIIlIIIIII = (char)lllllllllllllIIlIIIIllIIIlIIIIIl.length;
                    char lllllllllllllIIlIIIIllIIIIllllll = (char)MinecraftServer$1.lIlIIIIlIIIllI[0];
                    while (lllIIIIlIIllIlI(lllllllllllllIIlIIIIllIIIIllllll, lllllllllllllIIlIIIIllIIIlIIIIII)) {
                        final char lllllllllllllIIlIIIIllIIIlIIllII = lllllllllllllIIlIIIIllIIIlIIIIIl[lllllllllllllIIlIIIIllIIIIllllll];
                        lllllllllllllIIlIIIIllIIIlIIlIIl.append((char)(lllllllllllllIIlIIIIllIIIlIIllII ^ lllllllllllllIIlIIIIllIIIlIIlIII[lllllllllllllIIlIIIIllIIIlIIIlll % lllllllllllllIIlIIIIllIIIlIIlIII.length]));
                        "".length();
                        ++lllllllllllllIIlIIIIllIIIlIIIlll;
                        ++lllllllllllllIIlIIIIllIIIIllllll;
                        "".length();
                        if (null != null) {
                            return null;
                        }
                    }
                    return String.valueOf(lllllllllllllIIlIIIIllIIIlIIlIIl);
                }
                
                @Override
                public void setLoadingProgress(final int lllllllllllllIIlIIIIllIIIllIIllI) {
                    if (lllIIIIlIIllIIl(lllIIIIlIIllIII(System.currentTimeMillis() - this.startTime, 1000L))) {
                        this.startTime = System.currentTimeMillis();
                        MinecraftServer.logger.info(String.valueOf(new StringBuilder(MinecraftServer$1.lIIlllIlIlllll[MinecraftServer$1.lIlIIIIlIIIllI[0]]).append(lllllllllllllIIlIIIIllIIIllIIllI).append(MinecraftServer$1.lIIlllIlIlllll[MinecraftServer$1.lIlIIIIlIIIllI[1]])));
                    }
                }
                
                private static int lllIIIIlIIllIII(final long n, final long n2) {
                    return lcmp(n, n2);
                }
                
                private static String llIlllIIIIIIllI(final String lllllllllllllIIlIIIIllIIIlIllIIl, final String lllllllllllllIIlIIIIllIIIlIllIlI) {
                    try {
                        final SecretKeySpec lllllllllllllIIlIIIIllIIIlIllllI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIIlIIIIllIIIlIllIlI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
                        final Cipher lllllllllllllIIlIIIIllIIIlIlllIl = Cipher.getInstance("Blowfish");
                        lllllllllllllIIlIIIIllIIIlIlllIl.init(MinecraftServer$1.lIlIIIIlIIIllI[2], lllllllllllllIIlIIIIllIIIlIllllI);
                        return new String(lllllllllllllIIlIIIIllIIIlIlllIl.doFinal(java.util.Base64.getDecoder().decode(lllllllllllllIIlIIIIllIIIlIllIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
                    }
                    catch (Exception lllllllllllllIIlIIIIllIIIlIlllII) {
                        lllllllllllllIIlIIIIllIIIlIlllII.printStackTrace();
                        return null;
                    }
                }
                
                @Override
                public void resetProgressAndMessage(final String lllllllllllllIIlIIIIllIIIllIllII) {
                }
                
                private static void lllIIIIlIIIllll() {
                    (lIIlllIlIlllll = new String[MinecraftServer$1.lIlIIIIlIIIllI[2]])[MinecraftServer$1.lIlIIIIlIIIllI[0]] = llIlllIIIIIIllI("ELNUYZZqe3DSQOi0RYyijA==", "RbdQy");
                    MinecraftServer$1.lIIlllIlIlllll[MinecraftServer$1.lIlIIIIlIIIllI[1]] = lllIIIIlIIIlllI("cg==", "WpVLW");
                }
                
                private static boolean lllIIIIlIIllIIl(final int lllllllllllllIIlIIIIllIIIIlllIII) {
                    return lllllllllllllIIlIIIIllIIIIlllIII >= 0;
                }
                
                static {
                    lllIIIIlIIlIlll();
                    lllIIIIlIIIllll();
                }
                
                private static void lllIIIIlIIlIlll() {
                    (lIlIIIIlIIIllI = new int[3])[0] = ((0x2 ^ 0x42 ^ (0x30 ^ 0x50)) & (116 + 86 - 65 + 17 ^ 120 + 131 - 237 + 172 ^ -" ".length()));
                    MinecraftServer$1.lIlIIIIlIIIllI[1] = " ".length();
                    MinecraftServer$1.lIlIIIIlIIIllI[2] = "  ".length();
                }
                
                @Override
                public void displayLoadingString(final String lllllllllllllIIlIIIIllIIIllIIIll) {
                }
            });
            "".length();
        }
    }
    
    @Override
    public World getEntityWorld() {
        return this.worldServers[MinecraftServer.llIlllIIIlIIII[0]];
    }
    
    public int getBuildLimit() {
        return this.buildLimit;
    }
    
    public boolean isPVPEnabled() {
        return this.pvpEnabled;
    }
    
    private static boolean lIIllIIlIIIllIll(final int llllllllllllIllIIlIlIIIlIlIIIlIl) {
        return llllllllllllIllIIlIlIIIlIlIIIlIl != 0;
    }
    
    public boolean getCanSpawnAnimals() {
        return this.canSpawnAnimals;
    }
    
    public abstract boolean isCommandBlockEnabled();
    
    public abstract WorldSettings.GameType getGameType();
    
    public synchronized String getUserMessage() {
        return this.userMessage;
    }
    
    public static long getCurrentTimeMillis() {
        return System.currentTimeMillis();
    }
    
    protected void outputPercentRemaining(final String llllllllllllIllIIlIlIlIIIlllIlIl, final int llllllllllllIllIIlIlIlIIIlllIIII) {
        this.currentTask = llllllllllllIllIIlIlIlIIIlllIlIl;
        this.percentDone = llllllllllllIllIIlIlIlIIIlllIIII;
        MinecraftServer.logger.info(String.valueOf(new StringBuilder(String.valueOf(llllllllllllIllIIlIlIlIIIlllIlIl)).append(MinecraftServer.llIlllIIIIIlll[MinecraftServer.llIlllIIIlIIII[22]]).append(llllllllllllIllIIlIlIlIIIlllIIII).append(MinecraftServer.llIlllIIIIIlll[MinecraftServer.llIlllIIIlIIII[23]])));
    }
    
    public void setCanSpawnNPCs(final boolean llllllllllllIllIIlIlIIlIlIlIIIlI) {
        this.canSpawnNPCs = llllllllllllIllIIlIlIIlIlIlIIIlI;
    }
    
    public void setMOTD(final String llllllllllllIllIIlIlIIlIlIIIIlll) {
        this.motd = llllllllllllIllIIlIlIIlIlIIIIlll;
    }
    
    private static boolean lIIllIIlIIIlllII(final Object llllllllllllIllIIlIlIIIlIlIIIlll) {
        return llllllllllllIllIIlIlIIIlIlIIIlll == null;
    }
    
    private static String lIIllIIIllIllIlI(final String llllllllllllIllIIlIlIIIlIlllIlll, final String llllllllllllIllIIlIlIIIlIlllIllI) {
        try {
            final SecretKeySpec llllllllllllIllIIlIlIIIlIlllllII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIllIIlIlIIIlIlllIllI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher llllllllllllIllIIlIlIIIlIllllIll = Cipher.getInstance("Blowfish");
            llllllllllllIllIIlIlIIIlIllllIll.init(MinecraftServer.llIlllIIIlIIII[4], llllllllllllIllIIlIlIIIlIlllllII);
            return new String(llllllllllllIllIIlIlIIIlIllllIll.doFinal(java.util.Base64.getDecoder().decode(llllllllllllIllIIlIlIIIlIlllIlll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIllIIlIlIIIlIllllIlI) {
            llllllllllllIllIIlIlIIIlIllllIlI.printStackTrace();
            return null;
        }
    }
    
    public ISaveFormat getActiveAnvilConverter() {
        return this.anvilConverterForAnvilFile;
    }
    
    private static boolean lIIllIIlIIIllllI(final int llllllllllllIllIIlIlIIIlIlIIIIll) {
        return llllllllllllIllIIlIlIIIlIlIIIIll == 0;
    }
    
    public MinecraftSessionService getMinecraftSessionService() {
        return this.sessionService;
    }
    
    public void startServerThread() {
        this.serverThread = new Thread(this, MinecraftServer.llIlllIIIIIlll[MinecraftServer.llIlllIIIlIIII[68]]);
        this.serverThread.start();
    }
    
    protected void saveAllWorlds(final boolean llllllllllllIllIIlIlIlIIIlIIlIll) {
        if (lIIllIIlIIIllllI(this.worldIsBeingDeleted ? 1 : 0)) {
            final byte llllllllllllIllIIlIlIlIIIlIIIlIl;
            final int llllllllllllIllIIlIlIlIIIlIIIllI = ((WorldServer[])(Object)(llllllllllllIllIIlIlIlIIIlIIIlIl = (byte)(Object)this.worldServers)).length;
            String llllllllllllIllIIlIlIlIIIlIIIlll = (String)MinecraftServer.llIlllIIIlIIII[0];
            "".length();
            if (((0x19 ^ 0x3F) & ~(0x89 ^ 0xAF)) < 0) {
                return;
            }
            while (!lIIllIIlIIIlllll((int)llllllllllllIllIIlIlIlIIIlIIIlll, llllllllllllIllIIlIlIlIIIlIIIllI)) {
                final WorldServer llllllllllllIllIIlIlIlIIIlIlIIIl = llllllllllllIllIIlIlIlIIIlIIIlIl[llllllllllllIllIIlIlIlIIIlIIIlll];
                if (lIIllIIlIIlIIIll(llllllllllllIllIIlIlIlIIIlIlIIIl)) {
                    if (lIIllIIlIIIllllI(llllllllllllIllIIlIlIlIIIlIIlIll ? 1 : 0)) {
                        MinecraftServer.logger.info(String.valueOf(new StringBuilder(MinecraftServer.llIlllIIIIIlll[MinecraftServer.llIlllIIIlIIII[24]]).append(llllllllllllIllIIlIlIlIIIlIlIIIl.getWorldInfo().getWorldName()).append(MinecraftServer.llIlllIIIIIlll[MinecraftServer.llIlllIIIlIIII[25]]).append(llllllllllllIllIIlIlIlIIIlIlIIIl.provider.getDimensionName())));
                    }
                    try {
                        llllllllllllIllIIlIlIlIIIlIlIIIl.saveAllChunks((boolean)(MinecraftServer.llIlllIIIlIIII[1] != 0), null);
                        "".length();
                        if ("   ".length() < ((0xA1 ^ 0x95 ^ (0x7D ^ 0x72)) & (86 + 92 - 48 + 4 ^ 48 + 128 - 160 + 173 ^ -" ".length()))) {
                            return;
                        }
                    }
                    catch (MinecraftException llllllllllllIllIIlIlIlIIIlIIllll) {
                        MinecraftServer.logger.warn(llllllllllllIllIIlIlIlIIIlIIllll.getMessage());
                    }
                }
                ++llllllllllllIllIIlIlIlIIIlIIIlll;
            }
        }
    }
    
    public void stopServer() {
        if (lIIllIIlIIIllllI(this.worldIsBeingDeleted ? 1 : 0)) {
            MinecraftServer.logger.info(MinecraftServer.llIlllIIIIIlll[MinecraftServer.llIlllIIIlIIII[26]]);
            if (lIIllIIlIIlIIIll(this.getNetworkSystem())) {
                this.getNetworkSystem().terminateEndpoints();
            }
            if (lIIllIIlIIlIIIll(this.serverConfigManager)) {
                MinecraftServer.logger.info(MinecraftServer.llIlllIIIIIlll[MinecraftServer.llIlllIIIlIIII[27]]);
                this.serverConfigManager.saveAllPlayerData();
                this.serverConfigManager.removeAllPlayers();
            }
            if (lIIllIIlIIlIIIll(this.worldServers)) {
                MinecraftServer.logger.info(MinecraftServer.llIlllIIIIIlll[MinecraftServer.llIlllIIIlIIII[28]]);
                this.saveAllWorlds((boolean)(MinecraftServer.llIlllIIIlIIII[0] != 0));
                int llllllllllllIllIIlIlIlIIIIllIIll = MinecraftServer.llIlllIIIlIIII[0];
                "".length();
                if (((0x14 ^ 0x68 ^ (0x37 ^ 0x47)) & (93 + 121 - 46 + 33 ^ 110 + 104 - 37 + 20 ^ -" ".length())) < 0) {
                    return;
                }
                while (!lIIllIIlIIIlllll(llllllllllllIllIIlIlIlIIIIllIIll, this.worldServers.length)) {
                    final WorldServer llllllllllllIllIIlIlIlIIIIllIIIl = this.worldServers[llllllllllllIllIIlIlIlIIIIllIIll];
                    llllllllllllIllIIlIlIlIIIIllIIIl.flush();
                    ++llllllllllllIllIIlIlIlIIIIllIIll;
                }
            }
            if (lIIllIIlIIIllIll(this.usageSnooper.isSnooperRunning() ? 1 : 0)) {
                this.usageSnooper.stopSnooper();
            }
        }
    }
    
    public List<String> getTabCompletions(final ICommandSender llllllllllllIllIIlIlIIllIlIlIlII, String llllllllllllIllIIlIlIIllIlIlIIll, final BlockPos llllllllllllIllIIlIlIIllIlIIIlll) {
        final List<String> llllllllllllIllIIlIlIIllIlIlIIIl = (List<String>)Lists.newArrayList();
        if (lIIllIIlIIIllIll(llllllllllllIllIIlIlIIllIlIlIIll.startsWith(MinecraftServer.llIlllIIIIIlll[MinecraftServer.llIlllIIIlIIII[72]]) ? 1 : 0)) {
            llllllllllllIllIIlIlIIllIlIlIIll = llllllllllllIllIIlIlIIllIlIlIIll.substring(MinecraftServer.llIlllIIIlIIII[1]);
            int n;
            if (lIIllIIlIIIllIll(llllllllllllIllIIlIlIIllIlIlIIll.contains(MinecraftServer.llIlllIIIIIlll[MinecraftServer.llIlllIIIlIIII[73]]) ? 1 : 0)) {
                n = MinecraftServer.llIlllIIIlIIII[0];
                "".length();
                if ((0xD9 ^ 0x9E ^ (0xC0 ^ 0x83)) <= -" ".length()) {
                    return null;
                }
            }
            else {
                n = MinecraftServer.llIlllIIIlIIII[1];
            }
            final boolean llllllllllllIllIIlIlIIllIlIlIIII = n != 0;
            final List<String> llllllllllllIllIIlIlIIllIlIIllll = this.commandManager.getTabCompletionOptions(llllllllllllIllIIlIlIIllIlIlIlII, llllllllllllIllIIlIlIIllIlIlIIll, llllllllllllIllIIlIlIIllIlIIIlll);
            if (lIIllIIlIIlIIIll(llllllllllllIllIIlIlIIllIlIIllll)) {
                final char llllllllllllIllIIlIlIIllIlIIIIlI = (char)llllllllllllIllIIlIlIIllIlIIllll.iterator();
                "".length();
                if (-(0x7C ^ 0x9 ^ (0xB ^ 0x7A)) >= 0) {
                    return null;
                }
                while (!lIIllIIlIIIllllI(((Iterator)llllllllllllIllIIlIlIIllIlIIIIlI).hasNext() ? 1 : 0)) {
                    final String llllllllllllIllIIlIlIIllIlIIlllI = ((Iterator<String>)llllllllllllIllIIlIlIIllIlIIIIlI).next();
                    if (lIIllIIlIIIllIll(llllllllllllIllIIlIlIIllIlIlIIII ? 1 : 0)) {
                        llllllllllllIllIIlIlIIllIlIlIIIl.add(String.valueOf(new StringBuilder(MinecraftServer.llIlllIIIIIlll[MinecraftServer.llIlllIIIlIIII[74]]).append(llllllllllllIllIIlIlIIllIlIIlllI)));
                        "".length();
                        "".length();
                        if (-(7 + 96 - 84 + 114 ^ 110 + 121 - 223 + 121) >= 0) {
                            return null;
                        }
                        continue;
                    }
                    else {
                        llllllllllllIllIIlIlIIllIlIlIIIl.add(llllllllllllIllIIlIlIIllIlIIlllI);
                        "".length();
                    }
                }
            }
            return llllllllllllIllIIlIlIIllIlIlIIIl;
        }
        final String[] llllllllllllIllIIlIlIIllIlIIllIl = llllllllllllIllIIlIlIIllIlIlIIll.split(MinecraftServer.llIlllIIIIIlll[MinecraftServer.llIlllIIIlIIII[75]], MinecraftServer.llIlllIIIlIIII[2]);
        final String llllllllllllIllIIlIlIIllIlIIllII = llllllllllllIllIIlIlIIllIlIIllIl[llllllllllllIllIIlIlIIllIlIIllIl.length - MinecraftServer.llIlllIIIlIIII[1]];
        final String llllllllllllIllIIlIlIIllIlIIIIII;
        final String llllllllllllIllIIlIlIIllIlIIIIIl = (String)((String[])(Object)(llllllllllllIllIIlIlIIllIlIIIIII = (String)(Object)this.serverConfigManager.getAllUsernames())).length;
        char llllllllllllIllIIlIlIIllIlIIIIlI = (char)MinecraftServer.llIlllIIIlIIII[0];
        "".length();
        if (" ".length() < 0) {
            return null;
        }
        while (!lIIllIIlIIIlllll(llllllllllllIllIIlIlIIllIlIIIIlI, (int)llllllllllllIllIIlIlIIllIlIIIIIl)) {
            final String llllllllllllIllIIlIlIIllIlIIlIll = llllllllllllIllIIlIlIIllIlIIIIII[llllllllllllIllIIlIlIIllIlIIIIlI];
            if (lIIllIIlIIIllIll(CommandBase.doesStringStartWith(llllllllllllIllIIlIlIIllIlIIllII, llllllllllllIllIIlIlIIllIlIIlIll) ? 1 : 0)) {
                llllllllllllIllIIlIlIIllIlIlIIIl.add(llllllllllllIllIIlIlIIllIlIIlIll);
                "".length();
            }
            ++llllllllllllIllIIlIlIIllIlIIIIlI;
        }
        return llllllllllllIllIIlIlIIllIlIlIIIl;
    }
    
    @Override
    public Entity getCommandSenderEntity() {
        return null;
    }
    
    public void updateTimeLightAndEntities() {
        this.theProfiler.startSection(MinecraftServer.llIlllIIIIIlll[MinecraftServer.llIlllIIIlIIII[57]]);
        synchronized (this.futureTaskQueue) {
            "".length();
            if (null != null) {
                return;
            }
            while (!lIIllIIlIIIllIll(this.futureTaskQueue.isEmpty() ? 1 : 0)) {
                Util.func_181617_a(this.futureTaskQueue.poll(), MinecraftServer.logger);
                "".length();
            }
            // monitorexit(this.futureTaskQueue)
            "".length();
            if (-" ".length() > 0) {
                return;
            }
        }
        this.theProfiler.endStartSection(MinecraftServer.llIlllIIIIIlll[MinecraftServer.llIlllIIIlIIII[58]]);
        int llllllllllllIllIIlIlIIlllIIlIllI = MinecraftServer.llIlllIIIlIIII[0];
        "".length();
        if ("  ".length() < 0) {
            return;
        }
        while (!lIIllIIlIIIlllll(llllllllllllIllIIlIlIIlllIIlIllI, this.worldServers.length)) {
            final long llllllllllllIllIIlIlIIlllIIlIlIl = System.nanoTime();
            if (!lIIllIIlIIIllIll(llllllllllllIllIIlIlIIlllIIlIllI) || lIIllIIlIIIllIll(this.getAllowNether() ? 1 : 0)) {
                final WorldServer llllllllllllIllIIlIlIIlllIIlIlII = this.worldServers[llllllllllllIllIIlIlIIlllIIlIllI];
                this.theProfiler.startSection(llllllllllllIllIIlIlIIlllIIlIlII.getWorldInfo().getWorldName());
                if (lIIllIIlIIIllllI(this.tickCounter % MinecraftServer.llIlllIIIlIIII[25])) {
                    this.theProfiler.startSection(MinecraftServer.llIlllIIIIIlll[MinecraftServer.llIlllIIIlIIII[59]]);
                    this.serverConfigManager.sendPacketToAllPlayersInDimension(new S03PacketTimeUpdate(llllllllllllIllIIlIlIIlllIIlIlII.getTotalWorldTime(), llllllllllllIllIIlIlIIlllIIlIlII.getWorldTime(), llllllllllllIllIIlIlIIlllIIlIlII.getGameRules().getBoolean(MinecraftServer.llIlllIIIIIlll[MinecraftServer.llIlllIIIlIIII[60]])), llllllllllllIllIIlIlIIlllIIlIlII.provider.getDimensionId());
                    this.theProfiler.endSection();
                }
                this.theProfiler.startSection(MinecraftServer.llIlllIIIIIlll[MinecraftServer.llIlllIIIlIIII[61]]);
                try {
                    llllllllllllIllIIlIlIIlllIIlIlII.tick();
                    "".length();
                    if (-" ".length() >= (133 + 120 - 249 + 157 ^ 73 + 127 - 59 + 24)) {
                        return;
                    }
                }
                catch (Throwable llllllllllllIllIIlIlIIlllIIlIIll) {
                    final CrashReport llllllllllllIllIIlIlIIlllIIlIIlI = CrashReport.makeCrashReport(llllllllllllIllIIlIlIIlllIIlIIll, MinecraftServer.llIlllIIIIIlll[MinecraftServer.llIlllIIIlIIII[62]]);
                    llllllllllllIllIIlIlIIlllIIlIlII.addWorldInfoToCrashReport(llllllllllllIllIIlIlIIlllIIlIIlI);
                    "".length();
                    throw new ReportedException(llllllllllllIllIIlIlIIlllIIlIIlI);
                }
                try {
                    llllllllllllIllIIlIlIIlllIIlIlII.updateEntities();
                    "".length();
                    if (((129 + 60 - 3 + 56 ^ 92 + 133 - 122 + 77) & (0x1B ^ 0x72 ^ (0x3F ^ 0x10) ^ -" ".length())) != 0x0) {
                        return;
                    }
                }
                catch (Throwable llllllllllllIllIIlIlIIlllIIlIIIl) {
                    final CrashReport llllllllllllIllIIlIlIIlllIIlIIII = CrashReport.makeCrashReport(llllllllllllIllIIlIlIIlllIIlIIIl, MinecraftServer.llIlllIIIIIlll[MinecraftServer.llIlllIIIlIIII[63]]);
                    llllllllllllIllIIlIlIIlllIIlIlII.addWorldInfoToCrashReport(llllllllllllIllIIlIlIIlllIIlIIII);
                    "".length();
                    throw new ReportedException(llllllllllllIllIIlIlIIlllIIlIIII);
                }
                this.theProfiler.endSection();
                this.theProfiler.startSection(MinecraftServer.llIlllIIIIIlll[MinecraftServer.llIlllIIIlIIII[64]]);
                llllllllllllIllIIlIlIIlllIIlIlII.getEntityTracker().updateTrackedEntities();
                this.theProfiler.endSection();
                this.theProfiler.endSection();
            }
            this.timeOfLastDimensionTick[llllllllllllIllIIlIlIIlllIIlIllI][this.tickCounter % MinecraftServer.llIlllIIIlIIII[3]] = System.nanoTime() - llllllllllllIllIIlIlIIlllIIlIlIl;
            ++llllllllllllIllIIlIlIIlllIIlIllI;
        }
        this.theProfiler.endStartSection(MinecraftServer.llIlllIIIIIlll[MinecraftServer.llIlllIIIlIIII[65]]);
        this.getNetworkSystem().networkTick();
        this.theProfiler.endStartSection(MinecraftServer.llIlllIIIIIlll[MinecraftServer.llIlllIIIlIIII[66]]);
        this.serverConfigManager.onTick();
        this.theProfiler.endStartSection(MinecraftServer.llIlllIIIIIlll[MinecraftServer.llIlllIIIlIIII[67]]);
        int llllllllllllIllIIlIlIIlllIIIllll = MinecraftServer.llIlllIIIlIIII[0];
        "".length();
        if (((0x5B ^ 0x6B) & ~(0x11 ^ 0x21)) < 0) {
            return;
        }
        while (!lIIllIIlIIIlllll(llllllllllllIllIIlIlIIlllIIIllll, this.playersOnline.size())) {
            this.playersOnline.get(llllllllllllIllIIlIlIIlllIIIllll).update();
            ++llllllllllllIllIIlIlIIlllIIIllll;
        }
        this.theProfiler.endSection();
    }
    
    @Override
    public boolean isCallingFromMinecraftThread() {
        if (lIIllIIlIIlIllII(Thread.currentThread(), this.serverThread)) {
            return MinecraftServer.llIlllIIIlIIII[1] != 0;
        }
        return MinecraftServer.llIlllIIIlIIII[0] != 0;
    }
    
    public void logWarning(final String llllllllllllIllIIlIlIIllIllllIll) {
        MinecraftServer.logger.warn(llllllllllllIllIIlIlIIllIllllIll);
    }
    
    private static boolean lIIllIIlIIlIllIl(final int llllllllllllIllIIlIlIIIlIlIlllII, final int llllllllllllIllIIlIlIIIlIlIllIll) {
        return llllllllllllIllIIlIlIIIlIlIlllII < llllllllllllIllIIlIlIIIlIlIllIll;
    }
    
    public String getServerModName() {
        return MinecraftServer.llIlllIIIIIlll[MinecraftServer.llIlllIIIlIIII[70]];
    }
    
    public void setBuildLimit(final int llllllllllllIllIIlIlIIlIIlllllII) {
        this.buildLimit = llllllllllllIllIIlIlIIlIIlllllII;
    }
    
    public void setResourcePack(final String llllllllllllIllIIlIlIIlIllIlIlIl, final String llllllllllllIllIIlIlIIlIllIlIlll) {
        this.resourcePackUrl = llllllllllllIllIIlIlIIlIllIlIlIl;
        this.resourcePackHash = llllllllllllIllIIlIlIIlIllIlIlll;
    }
    
    private static String lIIllIIIllIllIII(final String llllllllllllIllIIlIlIIIlIllIlIlI, final String llllllllllllIllIIlIlIIIlIllIlIll) {
        try {
            final SecretKeySpec llllllllllllIllIIlIlIIIlIllIllll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIllIIlIlIIIlIllIlIll.getBytes(StandardCharsets.UTF_8)), MinecraftServer.llIlllIIIlIIII[10]), "DES");
            final Cipher llllllllllllIllIIlIlIIIlIllIlllI = Cipher.getInstance("DES");
            llllllllllllIllIIlIlIIIlIllIlllI.init(MinecraftServer.llIlllIIIlIIII[4], llllllllllllIllIIlIlIIIlIllIllll);
            return new String(llllllllllllIllIIlIlIIIlIllIlllI.doFinal(java.util.Base64.getDecoder().decode(llllllllllllIllIIlIlIIIlIllIlIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIllIIlIlIIIlIllIllIl) {
            llllllllllllIllIIlIlIIIlIllIllIl.printStackTrace();
            return null;
        }
    }
    
    public void tick() {
        final long llllllllllllIllIIlIlIIlllIlIIllI = System.nanoTime();
        this.tickCounter += MinecraftServer.llIlllIIIlIIII[1];
        if (lIIllIIlIIIllIll(this.startProfiling ? 1 : 0)) {
            this.startProfiling = (MinecraftServer.llIlllIIIlIIII[0] != 0);
            this.theProfiler.profilingEnabled = (MinecraftServer.llIlllIIIlIIII[1] != 0);
            this.theProfiler.clearProfiling();
        }
        this.theProfiler.startSection(MinecraftServer.llIlllIIIIIlll[MinecraftServer.llIlllIIIlIIII[52]]);
        this.updateTimeLightAndEntities();
        if (lIIllIIlIIlIIlIl(lIIllIIlIIlIlIII(llllllllllllIllIIlIlIIlllIlIIllI - this.nanoTimeSinceStatusRefresh, 5000000000L))) {
            this.nanoTimeSinceStatusRefresh = llllllllllllIllIIlIlIIlllIlIIllI;
            this.statusResponse.setPlayerCountData(new ServerStatusResponse.PlayerCountData(this.getMaxPlayers(), this.getCurrentPlayerCount()));
            final GameProfile[] llllllllllllIllIIlIlIIlllIlIIlIl = new GameProfile[Math.min(this.getCurrentPlayerCount(), MinecraftServer.llIlllIIIlIIII[18])];
            final int llllllllllllIllIIlIlIIlllIlIIlII = MathHelper.getRandomIntegerInRange(this.random, MinecraftServer.llIlllIIIlIIII[0], this.getCurrentPlayerCount() - llllllllllllIllIIlIlIIlllIlIIlIl.length);
            int llllllllllllIllIIlIlIIlllIlIIIll = MinecraftServer.llIlllIIIlIIII[0];
            "".length();
            if (-"   ".length() >= 0) {
                return;
            }
            while (!lIIllIIlIIIlllll(llllllllllllIllIIlIlIIlllIlIIIll, llllllllllllIllIIlIlIIlllIlIIlIl.length)) {
                llllllllllllIllIIlIlIIlllIlIIlIl[llllllllllllIllIIlIlIIlllIlIIIll] = this.serverConfigManager.func_181057_v().get(llllllllllllIllIIlIlIIlllIlIIlII + llllllllllllIllIIlIlIIlllIlIIIll).getGameProfile();
                ++llllllllllllIllIIlIlIIlllIlIIIll;
            }
            Collections.shuffle(Arrays.asList(llllllllllllIllIIlIlIIlllIlIIlIl));
            this.statusResponse.getPlayerCountData().setPlayers(llllllllllllIllIIlIlIIlllIlIIlIl);
        }
        if (lIIllIIlIIIllllI(this.tickCounter % MinecraftServer.llIlllIIIlIIII[53])) {
            this.theProfiler.startSection(MinecraftServer.llIlllIIIIIlll[MinecraftServer.llIlllIIIlIIII[54]]);
            this.serverConfigManager.saveAllPlayerData();
            this.saveAllWorlds((boolean)(MinecraftServer.llIlllIIIlIIII[1] != 0));
            this.theProfiler.endSection();
        }
        this.theProfiler.startSection(MinecraftServer.llIlllIIIIIlll[MinecraftServer.llIlllIIIlIIII[30]]);
        this.tickTimeArray[this.tickCounter % MinecraftServer.llIlllIIIlIIII[3]] = System.nanoTime() - llllllllllllIllIIlIlIIlllIlIIllI;
        this.theProfiler.endSection();
        this.theProfiler.startSection(MinecraftServer.llIlllIIIIIlll[MinecraftServer.llIlllIIIlIIII[55]]);
        if (lIIllIIlIIIllllI(this.usageSnooper.isSnooperRunning() ? 1 : 0) && lIIllIIlIIlIlIIl(this.tickCounter, MinecraftServer.llIlllIIIlIIII[3])) {
            this.usageSnooper.startSnooper();
        }
        if (lIIllIIlIIIllllI(this.tickCounter % MinecraftServer.llIlllIIIlIIII[56])) {
            this.usageSnooper.addMemoryStatsToSnooper();
        }
        this.theProfiler.endSection();
        this.theProfiler.endSection();
    }
    
    protected void loadAllWorlds(final String llllllllllllIllIIlIlIlIIllIlIIII, final String llllllllllllIllIIlIlIlIIllIIllll, final long llllllllllllIllIIlIlIlIIllIIlllI, final WorldType llllllllllllIllIIlIlIlIIllIIllIl, final String llllllllllllIllIIlIlIlIIllIllIIl) {
        this.convertMapIfNeeded(llllllllllllIllIIlIlIlIIllIlIIII);
        this.setUserMessage(MinecraftServer.llIlllIIIIIlll[MinecraftServer.llIlllIIIlIIII[11]]);
        this.worldServers = new WorldServer[MinecraftServer.llIlllIIIlIIII[5]];
        this.timeOfLastDimensionTick = new long[this.worldServers.length][MinecraftServer.llIlllIIIlIIII[3]];
        final ISaveHandler llllllllllllIllIIlIlIlIIllIllIII = this.anvilConverterForAnvilFile.getSaveLoader(llllllllllllIllIIlIlIlIIllIlIIII, (boolean)(MinecraftServer.llIlllIIIlIIII[1] != 0));
        this.setResourcePackFromWorld(this.getFolderName(), llllllllllllIllIIlIlIlIIllIllIII);
        WorldInfo llllllllllllIllIIlIlIlIIllIlIlll = llllllllllllIllIIlIlIlIIllIllIII.loadWorldInfo();
        WorldSettings llllllllllllIllIIlIlIlIIllIlIlII;
        if (lIIllIIlIIIlllII(llllllllllllIllIIlIlIlIIllIlIlll)) {
            WorldSettings llllllllllllIllIIlIlIlIIllIlIlIl = null;
            if (lIIllIIlIIIllIll(this.isDemo() ? 1 : 0)) {
                final WorldSettings llllllllllllIllIIlIlIlIIllIlIllI = DemoWorldServer.demoWorldSettings;
                "".length();
                if ((0x3A ^ 0x3E) < 0) {
                    return;
                }
            }
            else {
                llllllllllllIllIIlIlIlIIllIlIlIl = new WorldSettings(llllllllllllIllIIlIlIlIIllIIlllI, this.getGameType(), this.canStructuresSpawn(), this.isHardcore(), llllllllllllIllIIlIlIlIIllIIllIl);
                llllllllllllIllIIlIlIlIIllIlIlIl.setWorldName(llllllllllllIllIIlIlIlIIllIllIIl);
                "".length();
                if (lIIllIIlIIIllIll(this.enableBonusChest ? 1 : 0)) {
                    llllllllllllIllIIlIlIlIIllIlIlIl.enableBonusChest();
                    "".length();
                }
            }
            llllllllllllIllIIlIlIlIIllIlIlll = new WorldInfo(llllllllllllIllIIlIlIlIIllIlIlIl, llllllllllllIllIIlIlIlIIllIIllll);
            "".length();
            if ("  ".length() <= ((0x3D ^ 0x36) & ~(0x2 ^ 0x9))) {
                return;
            }
        }
        else {
            llllllllllllIllIIlIlIlIIllIlIlll.setWorldName(llllllllllllIllIIlIlIlIIllIIllll);
            llllllllllllIllIIlIlIlIIllIlIlII = new WorldSettings(llllllllllllIllIIlIlIlIIllIlIlll);
        }
        int llllllllllllIllIIlIlIlIIllIlIIll = MinecraftServer.llIlllIIIlIIII[0];
        "".length();
        if (" ".length() >= "  ".length()) {
            return;
        }
        while (!lIIllIIlIIIlllll(llllllllllllIllIIlIlIlIIllIlIIll, this.worldServers.length)) {
            int llllllllllllIllIIlIlIlIIllIlIIlI = MinecraftServer.llIlllIIIlIIII[0];
            if (lIIllIIlIIIlllIl(llllllllllllIllIIlIlIlIIllIlIIll, MinecraftServer.llIlllIIIlIIII[1])) {
                llllllllllllIllIIlIlIlIIllIlIIlI = MinecraftServer.llIlllIIIlIIII[2];
            }
            if (lIIllIIlIIIlllIl(llllllllllllIllIIlIlIlIIllIlIIll, MinecraftServer.llIlllIIIlIIII[4])) {
                llllllllllllIllIIlIlIlIIllIlIIlI = MinecraftServer.llIlllIIIlIIII[1];
            }
            if (lIIllIIlIIIllllI(llllllllllllIllIIlIlIlIIllIlIIll)) {
                if (lIIllIIlIIIllIll(this.isDemo() ? 1 : 0)) {
                    this.worldServers[llllllllllllIllIIlIlIlIIllIlIIll] = (WorldServer)new DemoWorldServer(this, llllllllllllIllIIlIlIlIIllIllIII, llllllllllllIllIIlIlIlIIllIlIlll, llllllllllllIllIIlIlIlIIllIlIIlI, this.theProfiler).init();
                    "".length();
                    if (" ".length() < -" ".length()) {
                        return;
                    }
                }
                else {
                    this.worldServers[llllllllllllIllIIlIlIlIIllIlIIll] = (WorldServer)new WorldServer(this, llllllllllllIllIIlIlIlIIllIllIII, llllllllllllIllIIlIlIlIIllIlIlll, llllllllllllIllIIlIlIlIIllIlIIlI, this.theProfiler).init();
                }
                this.worldServers[llllllllllllIllIIlIlIlIIllIlIIll].initialize(llllllllllllIllIIlIlIlIIllIlIlII);
                "".length();
                if (-(0x27 ^ 0x29 ^ (0x15 ^ 0x1E)) >= 0) {
                    return;
                }
            }
            else {
                this.worldServers[llllllllllllIllIIlIlIlIIllIlIIll] = (WorldServer)new WorldServerMulti(this, llllllllllllIllIIlIlIlIIllIllIII, llllllllllllIllIIlIlIlIIllIlIIlI, this.worldServers[MinecraftServer.llIlllIIIlIIII[0]], this.theProfiler).init();
            }
            this.worldServers[llllllllllllIllIIlIlIlIIllIlIIll].addWorldAccess(new WorldManager(this, this.worldServers[llllllllllllIllIIlIlIlIIllIlIIll]));
            if (lIIllIIlIIIllllI(this.isSinglePlayer() ? 1 : 0)) {
                this.worldServers[llllllllllllIllIIlIlIlIIllIlIIll].getWorldInfo().setGameType(this.getGameType());
            }
            ++llllllllllllIllIIlIlIlIIllIlIIll;
        }
        this.serverConfigManager.setPlayerManager(this.worldServers);
        this.setDifficultyForAllWorlds(this.getDifficulty());
        this.initialWorldChunkLoad();
    }
    
    public PlayerUsageSnooper getPlayerUsageSnooper() {
        return this.usageSnooper;
    }
    
    protected void clearCurrentTask() {
        this.currentTask = null;
        this.percentDone = MinecraftServer.llIlllIIIlIIII[0];
    }
    
    public void setDifficultyForAllWorlds(final EnumDifficulty llllllllllllIllIIlIlIIllIIIIIIIl) {
        int llllllllllllIllIIlIlIIllIIIIIlII = MinecraftServer.llIlllIIIlIIII[0];
        "".length();
        if ((0xB0 ^ 0xB5) == 0x0) {
            return;
        }
        while (!lIIllIIlIIIlllll(llllllllllllIllIIlIlIIllIIIIIlII, this.worldServers.length)) {
            final World llllllllllllIllIIlIlIIllIIIIIIll = this.worldServers[llllllllllllIllIIlIlIIllIIIIIlII];
            if (lIIllIIlIIlIIIll(llllllllllllIllIIlIlIIllIIIIIIll)) {
                if (lIIllIIlIIIllIll(llllllllllllIllIIlIlIIllIIIIIIll.getWorldInfo().isHardcoreModeEnabled() ? 1 : 0)) {
                    llllllllllllIllIIlIlIIllIIIIIIll.getWorldInfo().setDifficulty(EnumDifficulty.HARD);
                    llllllllllllIllIIlIlIIllIIIIIIll.setAllowedSpawnTypes((boolean)(MinecraftServer.llIlllIIIlIIII[1] != 0), (boolean)(MinecraftServer.llIlllIIIlIIII[1] != 0));
                    "".length();
                    if (-"  ".length() >= 0) {
                        return;
                    }
                }
                else if (lIIllIIlIIIllIll(this.isSinglePlayer() ? 1 : 0)) {
                    llllllllllllIllIIlIlIIllIIIIIIll.getWorldInfo().setDifficulty(llllllllllllIllIIlIlIIllIIIIIIIl);
                    final World world = llllllllllllIllIIlIlIIllIIIIIIll;
                    int lllllllllllllIIIlIIllIIlllIlIIII;
                    if (lIIllIIlIIlIlIlI(llllllllllllIllIIlIlIIllIIIIIIll.getDifficulty(), EnumDifficulty.PEACEFUL)) {
                        lllllllllllllIIIlIIllIIlllIlIIII = MinecraftServer.llIlllIIIlIIII[1];
                        "".length();
                        if (" ".length() <= ((46 + 163 - 155 + 184 ^ 35 + 85 + 43 + 22) & (0xD ^ 0x34 ^ (0xA ^ 0x64) ^ -" ".length()))) {
                            return;
                        }
                    }
                    else {
                        lllllllllllllIIIlIIllIIlllIlIIII = MinecraftServer.llIlllIIIlIIII[0];
                    }
                    world.setAllowedSpawnTypes((boolean)(lllllllllllllIIIlIIllIIlllIlIIII != 0), (boolean)(MinecraftServer.llIlllIIIlIIII[1] != 0));
                    "".length();
                    if ("  ".length() < 0) {
                        return;
                    }
                }
                else {
                    llllllllllllIllIIlIlIIllIIIIIIll.getWorldInfo().setDifficulty(llllllllllllIllIIlIlIIllIIIIIIIl);
                    llllllllllllIllIIlIlIIllIIIIIIll.setAllowedSpawnTypes(this.allowSpawnMonsters(), this.canSpawnAnimals);
                }
            }
            ++llllllllllllIllIIlIlIIllIIIIIlII;
        }
    }
    
    public boolean serverIsInRunLoop() {
        return this.serverIsRunning;
    }
    
    @Override
    public ListenableFuture<Object> addScheduledTask(final Runnable llllllllllllIllIIlIlIIIlllIlIIII) {
        Validate.notNull((Object)llllllllllllIllIIlIlIIIlllIlIIII);
        "".length();
        return this.callFromMainThread(Executors.callable(llllllllllllIllIIlIlIIIlllIlIIII));
    }
    
    public String getResourcePackUrl() {
        return this.resourcePackUrl;
    }
    
    public abstract boolean func_183002_r();
    
    static {
        lIIllIIlIIIllIlI();
        lIIllIIlIIIIlllI();
        logger = LogManager.getLogger();
        USER_CACHE_FILE = new File(MinecraftServer.llIlllIIIIIlll[MinecraftServer.llIlllIIIlIIII[0]]);
    }
    
    public String getResourcePackHash() {
        return this.resourcePackHash;
    }
    
    public void setKeyPair(final KeyPair llllllllllllIllIIlIlIIllIIIIlIll) {
        this.serverKeyPair = llllllllllllIllIIlIlIIllIIIIlIll;
    }
    
    private static void lIIllIIlIIIIlllI() {
        (llIlllIIIIIlll = new String[MinecraftServer.llIlllIIIlIIII[113]])[MinecraftServer.llIlllIIIlIIII[0]] = lIIllIIIllIllIII("s4wDoK4AM7SKUZ64Gl4Gmg==", "NjbuG");
        MinecraftServer.llIlllIIIIIlll[MinecraftServer.llIlllIIIlIIII[1]] = lIIllIIIllIllIIl("Iz8WGDUi", "PZdnP");
        MinecraftServer.llIlllIIIIIlll[MinecraftServer.llIlllIIIlIIII[4]] = lIIllIIIllIllIII("3tvwKjOl12w=", "bgnJK");
        MinecraftServer.llIlllIIIIIlll[MinecraftServer.llIlllIIIlIIII[5]] = lIIllIIIllIllIII("dtrqmJbY4pQ=", "drufJ");
        MinecraftServer.llIlllIIIIIlll[MinecraftServer.llIlllIIIlIIII[6]] = lIIllIIIllIllIIl("Hw8WGA4e", "ljdnk");
        MinecraftServer.llIlllIIIIIlll[MinecraftServer.llIlllIIIlIIII[7]] = lIIllIIIllIllIII("yi41UJNNSms=", "Nsglr");
        MinecraftServer.llIlllIIIIIlll[MinecraftServer.llIlllIIIlIIII[8]] = lIIllIIIllIllIIl("", "JQLaA");
        MinecraftServer.llIlllIIIIIlll[MinecraftServer.llIlllIIIlIIII[9]] = lIIllIIIllIllIIl("FAM0LxIlGDM3EHcBOylW", "WlZYw");
        MinecraftServer.llIlllIIIIIlll[MinecraftServer.llIlllIIIlIIII[10]] = lIIllIIIllIllIII("TyM5wJLYwWzvDGylv1fi3g3mO2d5r+31", "ImtWV");
        MinecraftServer.llIlllIIIIIlll[MinecraftServer.llIlllIIIlIIII[11]] = lIIllIIIllIllIIl("DAYpNkINDCYnBQ8ECyYaBA8=", "acGCl");
        MinecraftServer.llIlllIIIIIlll[MinecraftServer.llIlllIIIlIIII[15]] = lIIllIIIllIllIIl("PAQJAUk2BAkRFTAVDhoABQQVBgY4Dw==", "Qagtg");
        MinecraftServer.llIlllIIIIIlll[MinecraftServer.llIlllIIIlIIII[16]] = lIIllIIIllIllIlI("c1RXzjnXcJEj+Pqbgvj1WOEaRYA2DKfRs9rmonHVQ67vdQtXJUbVXQ==", "zEKvl");
        MinecraftServer.llIlllIIIIIlll[MinecraftServer.llIlllIIIlIIII[18]] = lIIllIIIllIllIIl("BD0LNDQmJgAjdSc/DzM7dC4cITQ=", "TOnDU");
        MinecraftServer.llIlllIIIIIlll[MinecraftServer.llIlllIIIlIIII[19]] = lIIllIIIllIllIII("gKB4OICPNWciux11c8HslA==", "QHNWs");
        MinecraftServer.llIlllIIIIIlll[MinecraftServer.llIlllIIIlIIII[20]] = lIIllIIIllIllIII("aXXrvm8DLFtiL42wYD0ejw==", "clMJC");
        MinecraftServer.llIlllIIIIIlll[MinecraftServer.llIlllIIIlIIII[21]] = lIIllIIIllIllIlI("IysgLrb93M4=", "skwky");
        MinecraftServer.llIlllIIIIIlll[MinecraftServer.llIlllIIIlIIII[12]] = lIIllIIIllIllIII("5YyugOwxEGQ=", "DoFNu");
        MinecraftServer.llIlllIIIIIlll[MinecraftServer.llIlllIIIlIIII[22]] = lIIllIIIllIllIlI("ByDAgzDzOvM=", "vDCfU");
        MinecraftServer.llIlllIIIIIlll[MinecraftServer.llIlllIIIlIIII[23]] = lIIllIIIllIllIIl("UA==", "uJQiP");
        MinecraftServer.llIlllIIIIIlll[MinecraftServer.llIlllIIIlIIII[24]] = lIIllIIIllIllIlI("53/UtTmDkrsyhOwnAody3KSpf1DSdH3dH/rUM08tJdg=", "kKdLr");
        MinecraftServer.llIlllIIIIIlll[MinecraftServer.llIlllIIIlIIII[25]] = lIIllIIIllIllIlI("QFkq88nSJHo=", "TkrTY");
        MinecraftServer.llIlllIIIIIlll[MinecraftServer.llIlllIIIlIIII[26]] = lIIllIIIllIllIII("kZjq+yJREAQOQMX7OaO7fw==", "MlGtF");
        MinecraftServer.llIlllIIIIIlll[MinecraftServer.llIlllIIIlIIII[27]] = lIIllIIIllIllIlI("hBlTUh0NLmB2cDGArwx+9Q==", "YrOTy");
        MinecraftServer.llIlllIIIIIlll[MinecraftServer.llIlllIIIlIIII[28]] = lIIllIIIllIllIlI("1p6cNZwz///a/KB5DTz5SQ==", "rfTyI");
        MinecraftServer.llIlllIIIIIlll[MinecraftServer.llIlllIIIlIIII[29]] = lIIllIIIllIllIlI("8ucUvgwPib8=", "KsiOV");
        MinecraftServer.llIlllIIIIIlll[MinecraftServer.llIlllIIIlIIII[31]] = lIIllIIIllIllIlI("lWj5jblbZ2bt/YEkOGA0bEBgG5TKw3om6BZS/JxXS8+HjHD4zNTzg3X+N64p6LqxRWCGI7k3WDX8ysuy4XU9qar+rqzMqIcB08U26UO3AF9yFKn749Op56GdJqsY0pV0RzvTnMjLTfE9AZznOXuE3N10UVk9aOwY", "dwAoF");
        MinecraftServer.llIlllIIIIIlll[MinecraftServer.llIlllIIIlIIII[32]] = lIIllIIIllIllIIl("EgoeBFo0Ah1BGCcAGBYbNAcAQFoCChdBDi4GUxIDNRcWDFoyCh4EWiULEg8dI1w=", "Fcsaz");
        MinecraftServer.llIlllIIIIIlll[MinecraftServer.llIlllIIIlIIII[33]] = lIIllIIIllIllIlI("AcyvN+f777hY4ssGNlZ7Zbed6YlJX+mPZR4AKU/7nlHOh0AnYVOX1Q==", "jeuvD");
        MinecraftServer.llIlllIIIIIlll[MinecraftServer.llIlllIIIlIIII[34]] = lIIllIIIllIllIIl("Mw8RJDkCHh0vaR8ZUjIsBAEXM2kCHhEqaRoYHTE=", "vwrAI");
        MinecraftServer.llIlllIIIIIlll[MinecraftServer.llIlllIIIlIIII[35]] = lIIllIIIllIllIII("+VAF9O0Q9w7wiqq8w5m1/w==", "ICDzf");
        MinecraftServer.llIlllIIIIIlll[MinecraftServer.llIlllIIIlIIII[36]] = lIIllIIIllIllIIl("EyEkCixd", "pSEyD");
        MinecraftServer.llIlllIIIIIlll[MinecraftServer.llIlllIIIlIIII[37]] = lIIllIIIllIllIIl("LzIKCVkbBl4UEAkDO14ZO2UAAw==", "VKspt");
        MinecraftServer.llIlllIIIIIlll[MinecraftServer.llIlllIIIlIIII[38]] = lIIllIIIllIllIIl("ZhkGOxguGE09Fj8=", "KjcIn");
        MinecraftServer.llIlllIIIIIlll[MinecraftServer.llIlllIIIlIIII[39]] = lIIllIIIllIllIII("6fZvSEznMZOpDKG0bNpnYTlu7lUUl3A9K8TzR68PnuT5/V6tAkYS5g==", "VqcBY");
        MinecraftServer.llIlllIIIIIlll[MinecraftServer.llIlllIIIlIIII[40]] = lIIllIIIllIllIIl("ORVTJTAcFVMnOw8SHzd1Gh9TITQYFVMmPQcDUzEnDwMbcicLABwgIU4EHHIxBwMYfA==", "npsRU");
        MinecraftServer.llIlllIIIIIlll[MinecraftServer.llIlllIIIlIIII[41]] = lIIllIIIllIllIII("scauL2ApqMjUY+Jqbo8WY/RdpzMru/mgnS+bWNYkwoA=", "aoNRo");
        MinecraftServer.llIlllIIIIIlll[MinecraftServer.llIlllIIIlIIII[42]] = lIIllIIIllIllIlI("pF+72YzWFoeJaGqVD60Z7Xr7aFiN0kVjbC4tia81zI4=", "dupHJ");
        MinecraftServer.llIlllIIIIIlll[MinecraftServer.llIlllIIIlIIII[43]] = lIIllIIIllIllIIl("Fx8aAx8mDhYITyETFhYfOwkeRhs6AlkVCiARHBQ=", "Rgyfo");
        MinecraftServer.llIlllIIIIIlll[MinecraftServer.llIlllIIIlIIII[44]] = lIIllIIIllIllIII("r100RPhFN6711Zd+YxGp7A==", "MalAx");
        MinecraftServer.llIlllIIIIIlll[MinecraftServer.llIlllIIIlIIII[46]] = lIIllIIIllIllIIl("AjY6EWctJmlTc28zIB0iIzBpEi4rJg==", "OCIeG");
        MinecraftServer.llIlllIIIIIlll[MinecraftServer.llIlllIIIlIIII[47]] = lIIllIIIllIllIIl("CyIeMGMkMk1yd2YnBDwmKiRNLCohPw==", "FWmDC");
        MinecraftServer.llIlllIIIIIlll[MinecraftServer.llIlllIIIlIIII[48]] = lIIllIIIllIllIIl("NxwL", "gRLub");
        MinecraftServer.llIlllIIIIIlll[MinecraftServer.llIlllIIIlIIII[49]] = lIIllIIIllIllIIl("CC4kKHsFIjEuJEM/Pi56Di4jLHdYYw==", "lOPIA");
        MinecraftServer.llIlllIIIIIlll[MinecraftServer.llIlllIIIlIIII[50]] = lIIllIIIllIllIII("XtMc17Xc48Vpei6VD99yikrX6uNon26DTfFzKVIgjqk=", "UZWyt");
        MinecraftServer.llIlllIIIIIlll[MinecraftServer.llIlllIIIlIIII[51]] = lIIllIIIllIllIII("imJFeQ9OhEs=", "QIQwD");
        MinecraftServer.llIlllIIIIIlll[MinecraftServer.llIlllIIIlIIII[52]] = lIIllIIIllIllIlI("y+wMkRlqTvw=", "TksCt");
        MinecraftServer.llIlllIIIIIlll[MinecraftServer.llIlllIIIlIIII[54]] = lIIllIIIllIllIIl("AyIPPQ==", "pCyXX");
        MinecraftServer.llIlllIIIIIlll[MinecraftServer.llIlllIIIlIIII[30]] = lIIllIIIllIllIlI("mhmBuQ8gDAlQuJ0XYMiEKw==", "cmCVS");
        MinecraftServer.llIlllIIIIIlll[MinecraftServer.llIlllIIIlIIII[55]] = lIIllIIIllIllIIl("MAIjCCAmHg==", "ClLgP");
        MinecraftServer.llIlllIIIIIlll[MinecraftServer.llIlllIIIlIIII[57]] = lIIllIIIllIllIlI("eSBwR73QPbY=", "RvMBl");
        MinecraftServer.llIlllIIIIIlll[MinecraftServer.llIlllIIIlIIII[58]] = lIIllIIIllIllIII("7cLINefWySw=", "AGEcB");
        MinecraftServer.llIlllIIIIIlll[MinecraftServer.llIlllIIIlIIII[59]] = lIIllIIIllIllIIl("BQ8EDhEICAo=", "qfikB");
        MinecraftServer.llIlllIIIIIlll[MinecraftServer.llIlllIIIlIIII[60]] = lIIllIIIllIllIIl("AioDBh0KLCAPECU8JAsB", "fEGgd");
        MinecraftServer.llIlllIIIIIlll[MinecraftServer.llIlllIIIlIIII[61]] = lIIllIIIllIllIIl("BwcHIw==", "sndHV");
        MinecraftServer.llIlllIIIIIlll[MinecraftServer.llIlllIIIlIIII[62]] = lIIllIIIllIllIII("Kw+EjXoDyO8AkHuvkSimo9Wkhi9meGDU", "cAREd");
        MinecraftServer.llIlllIIIIIlll[MinecraftServer.llIlllIIIlIIII[63]] = lIIllIIIllIllIIl("HCIHDB8tMwsHTy0zBwIGNz1EHgArNgBJCjcuDR0GPCk=", "YZdio");
        MinecraftServer.llIlllIIIIIlll[MinecraftServer.llIlllIIIlIIII[64]] = lIIllIIIllIllIlI("OJcs4nCboUA=", "MNbNk");
        MinecraftServer.llIlllIIIIIlll[MinecraftServer.llIlllIIIlIIII[65]] = lIIllIIIllIllIII("peXDOgJY1vKQj8u8fHKrwQ==", "YCYSi");
        MinecraftServer.llIlllIIIIIlll[MinecraftServer.llIlllIIIlIIII[66]] = lIIllIIIllIllIIl("AA8nEyQCEA==", "pcFjA");
        MinecraftServer.llIlllIIIIIlll[MinecraftServer.llIlllIIIlIIII[67]] = lIIllIIIllIllIII("6rivRZDWrtBL37WH8jSDpA==", "yhBKH");
        MinecraftServer.llIlllIIIIIlll[MinecraftServer.llIlllIIIlIIII[68]] = lIIllIIIllIllIII("EEuzfQD0UfjFUrTPTS27Jg==", "nXNsu");
        MinecraftServer.llIlllIIIIIlll[MinecraftServer.llIlllIIIlIIII[69]] = lIIllIIIllIllIII("OSgBaxRGHaQ=", "MnUDM");
        MinecraftServer.llIlllIIIIIlll[MinecraftServer.llIlllIIIlIIII[70]] = lIIllIIIllIllIlI("ELm+ra+i/BE=", "hmuLa");
        MinecraftServer.llIlllIIIIIlll[MinecraftServer.llIlllIIIlIIII[71]] = lIIllIIIllIllIIl("PBUuKAcAAjNuPgMUKDoHAwk=", "lgANn");
        MinecraftServer.llIlllIIIIIlll[MinecraftServer.llIlllIIIlIIII[45]] = lIIllIIIllIllIlI("CYqnWy0eZjEgBT9/cTirMw==", "CWMyk");
        MinecraftServer.llIlllIIIIIlll[MinecraftServer.llIlllIIIlIIII[72]] = lIIllIIIllIllIlI("o8oSkplHMW4=", "HdSLR");
        MinecraftServer.llIlllIIIIIlll[MinecraftServer.llIlllIIIlIIII[73]] = lIIllIIIllIllIII("94MMmGnB7qw=", "nIEvi");
        MinecraftServer.llIlllIIIIIlll[MinecraftServer.llIlllIIIlIIII[74]] = lIIllIIIllIllIlI("D9dfwkROEBM=", "rFMst");
        MinecraftServer.llIlllIIIIIlll[MinecraftServer.llIlllIIIlIIII[75]] = lIIllIIIllIllIlI("XJUNANGkOco=", "LTEVg");
        MinecraftServer.llIlllIIIIIlll[MinecraftServer.llIlllIIIlIIII[76]] = lIIllIIIllIllIIl("MRwVLx0Q", "bygYx");
        MinecraftServer.llIlllIIIIIlll[MinecraftServer.llIlllIIIlIIII[77]] = lIIllIIIllIllIII("1OqxLGMtFFkidpYnZ7vQkAWsvDsFFgz1", "hiSoN");
        MinecraftServer.llIlllIIIIIlll[MinecraftServer.llIlllIIIlIIII[78]] = lIIllIIIllIllIlI("htJUanzxYsUMwUuvLhCVXQ==", "MLtUs");
        MinecraftServer.llIlllIIIIIlll[MinecraftServer.llIlllIIIlIIII[79]] = lIIllIIIllIllIII("377MqgpVrsCfs2+3xESHqQ==", "ptCtL");
        MinecraftServer.llIlllIIIIIlll[MinecraftServer.llIlllIIIlIIII[80]] = lIIllIIIllIllIlI("oDoS/VdCUiEpL+bWt1y8DA==", "ZiUbF");
        MinecraftServer.llIlllIIIIIlll[MinecraftServer.llIlllIIIlIIII[81]] = lIIllIIIllIllIlI("j4MP+t8PqOeQqJwYxnQQJg==", "Bbbxc");
        MinecraftServer.llIlllIIIIIlll[MinecraftServer.llIlllIIIlIIII[82]] = lIIllIIIllIllIIl("FDY8MDsAMC0r", "aEYCd");
        MinecraftServer.llIlllIIIIIlll[MinecraftServer.llIlllIIIlIIII[83]] = lIIllIIIllIllIII("NHFRQcNAo9ZIzTcENCuG8Q==", "fCGOO");
        MinecraftServer.llIlllIIIIIlll[MinecraftServer.llIlllIIIlIIII[84]] = lIIllIIIllIllIlI("OmOVoaqhXGs=", "ZbMvM");
        MinecraftServer.llIlllIIIIIlll[MinecraftServer.llIlllIIIlIIII[85]] = lIIllIIIllIllIII("tBUP0CMZbE4G9GhmOt5o3w==", "xTNpQ");
        MinecraftServer.llIlllIIIIIlll[MinecraftServer.llIlllIIIlIIII[86]] = lIIllIIIllIllIII("xJ6ZO7oMNHiTto1BaFPJEw==", "TBNqE");
        MinecraftServer.llIlllIIIIIlll[MinecraftServer.llIlllIIIlIIII[87]] = lIIllIIIllIllIlI("HOBuhAYmAvyhAalSMYUMBQ==", "gjoPi");
        MinecraftServer.llIlllIIIIIlll[MinecraftServer.llIlllIIIlIIII[88]] = lIIllIIIllIllIIl("JxUIChEL", "Pzzfu");
        MinecraftServer.llIlllIIIIIlll[MinecraftServer.llIlllIIIlIIII[89]] = lIIllIIIllIllIIl("Ph0cDQ4GKAsNDA0b", "cFxdc");
        MinecraftServer.llIlllIIIIIlll[MinecraftServer.llIlllIIIlIIII[90]] = lIIllIIIllIllIIl("OS0qGwcV", "NBXwc");
        MinecraftServer.llIlllIIIIIlll[MinecraftServer.llIlllIIIlIIII[91]] = lIIllIIIllIllIIl("Jw4OFz4fCA==", "zUcxZ");
        MinecraftServer.llIlllIIIIIlll[MinecraftServer.llIlllIIIlIIII[92]] = lIIllIIIllIllIII("KDGFk5qlUps=", "cdjxZ");
        MinecraftServer.llIlllIIIIIlll[MinecraftServer.llIlllIIIlIIII[93]] = lIIllIIIllIllIlI("sgijEKXnWlubB4IyExoPew==", "mkCqe");
        MinecraftServer.llIlllIIIIIlll[MinecraftServer.llIlllIIIlIIII[94]] = lIIllIIIllIllIII("F3ArSEQJGm8=", "KNsrT");
        MinecraftServer.llIlllIIIIIlll[MinecraftServer.llIlllIIIlIIII[95]] = lIIllIIIllIllIII("qaoF0BB6tUT97HqZnSbmOQ==", "obOFk");
        MinecraftServer.llIlllIIIIIlll[MinecraftServer.llIlllIIIlIIII[96]] = lIIllIIIllIllIII("SxYYWHrV5XU=", "rjsNe");
        MinecraftServer.llIlllIIIIIlll[MinecraftServer.llIlllIIIlIIII[97]] = lIIllIIIllIllIII("45Pdq9NwCtAXrzYsHNVycNRxUba9Zq3u", "WceTw");
        MinecraftServer.llIlllIIIIIlll[MinecraftServer.llIlllIIIlIIII[98]] = lIIllIIIllIllIlI("qh4D0F30r6c=", "gEjcR");
        MinecraftServer.llIlllIIIIIlll[MinecraftServer.llIlllIIIlIIII[99]] = lIIllIIIllIllIIl("LwMDIS8XKgUwLgAHEiEzATELKhw=", "rXdDA");
        MinecraftServer.llIlllIIIIIlll[MinecraftServer.llIlllIIIlIIII[100]] = lIIllIIIllIllIIl("Gz4hKC83", "lQSDK");
        MinecraftServer.llIlllIIIIIlll[MinecraftServer.llIlllIIIlIIII[101]] = lIIllIIIllIllIIl("DDMdLTo2AAEV", "QhuHS");
        MinecraftServer.llIlllIIIIIlll[MinecraftServer.llIlllIIIlIIII[102]] = lIIllIIIllIllIlI("NcBePlezGWo=", "RnfQc");
        MinecraftServer.llIlllIIIIIlll[MinecraftServer.llIlllIIIlIIII[103]] = lIIllIIIllIllIlI("/sIfCoXaeXi+fnUuHwqzwF6zokIwgOEk", "icGxG");
        MinecraftServer.llIlllIIIIIlll[MinecraftServer.llIlllIIIlIIII[104]] = lIIllIIIllIllIIl("AAkkKjUE", "wfVFQ");
        MinecraftServer.llIlllIIIIIlll[MinecraftServer.llIlllIIIlIIII[105]] = lIIllIIIllIllIlI("5u1l/EtLHapPKSHIIctjDg==", "mQMAJ");
        MinecraftServer.llIlllIIIIIlll[MinecraftServer.llIlllIIIlIIII[106]] = lIIllIIIllIllIlI("YJjvHSCDe1OBkPoqfvZ1zQ==", "mWvXs");
        MinecraftServer.llIlllIIIIIlll[MinecraftServer.llIlllIIIlIIII[3]] = lIIllIIIllIllIII("KbJAFu6LIJb8KXC3U4+JdA==", "iLCyL");
        MinecraftServer.llIlllIIIIIlll[MinecraftServer.llIlllIIIlIIII[107]] = lIIllIIIllIllIIl("HBIGFiQRBBQ=", "twgrH");
        MinecraftServer.llIlllIIIIIlll[MinecraftServer.llIlllIIIlIIII[108]] = lIIllIIIllIllIII("tOvc/yLILlQnfY5bVClVHQ==", "vSAqV");
        MinecraftServer.llIlllIIIIIlll[MinecraftServer.llIlllIIIlIIII[109]] = lIIllIIIllIllIII("0pB94XeInwDkmYQIL3xs+Q==", "VfiNc");
        MinecraftServer.llIlllIIIIIlll[MinecraftServer.llIlllIIIlIIII[110]] = lIIllIIIllIllIIl("FDw/MQoINDw0JwMfNDAtBTgyPg==", "gYQUI");
    }
    
    @Override
    public String getName() {
        return MinecraftServer.llIlllIIIIIlll[MinecraftServer.llIlllIIIlIIII[76]];
    }
    
    public boolean isServerRunning() {
        return this.serverRunning;
    }
    
    public abstract boolean isHardcore();
    
    private static boolean lIIllIIlIIlIlIlI(final Object llllllllllllIllIIlIlIIIlIlIlIIII, final Object llllllllllllIllIIlIlIIIlIlIIllll) {
        return llllllllllllIllIIlIlIIIlIlIlIIII != llllllllllllIllIIlIlIIIlIlIIllll;
    }
    
    @Override
    public void setCommandStat(final CommandResultStats.Type llllllllllllIllIIlIlIIIlllllIIII, final int llllllllllllIllIIlIlIIIllllIllll) {
    }
    
    public int getMaxPlayers() {
        return this.serverConfigManager.getMaxPlayers();
    }
    
    private static int lIIllIIlIIlIlIII(final long n, final long n2) {
        return lcmp(n, n2);
    }
    
    public void setOnlineMode(final boolean llllllllllllIllIIlIlIIlIlIllIIlI) {
        this.onlineMode = llllllllllllIllIIlIlIIlIlIllIIlI;
    }
    
    private static int lIIllIIlIIlIIIII(final long n, final long n2) {
        return lcmp(n, n2);
    }
    
    public ServerStatusResponse getServerStatusResponse() {
        return this.statusResponse;
    }
    
    public void deleteWorldAndStopServer() {
        this.worldIsBeingDeleted = (MinecraftServer.llIlllIIIlIIII[1] != 0);
        this.getActiveAnvilConverter().flushCache();
        int llllllllllllIllIIlIlIIlIlllIIlll = MinecraftServer.llIlllIIIlIIII[0];
        "".length();
        if (((0xE9 ^ 0xC6) & ~(0x27 ^ 0x8)) < -" ".length()) {
            return;
        }
        while (!lIIllIIlIIIlllll(llllllllllllIllIIlIlIIlIlllIIlll, this.worldServers.length)) {
            final WorldServer llllllllllllIllIIlIlIIlIlllIIllI = this.worldServers[llllllllllllIllIIlIlIIlIlllIIlll];
            if (lIIllIIlIIlIIIll(llllllllllllIllIIlIlIIlIlllIIllI)) {
                llllllllllllIllIIlIlIIlIlllIIllI.flush();
            }
            ++llllllllllllIllIIlIlIIlIlllIIlll;
        }
        this.getActiveAnvilConverter().deleteWorldDirectory(this.worldServers[MinecraftServer.llIlllIIIlIIII[0]].getSaveHandler().getWorldDirectoryName());
        "".length();
        this.initiateShutdown();
    }
    
    private static boolean lIIllIIlIIlIIIlI(final int llllllllllllIllIIlIlIIIlIlIllIII, final int llllllllllllIllIIlIlIIIlIlIlIlll) {
        return llllllllllllIllIIlIlIIIlIlIllIII <= llllllllllllIllIIlIlIIIlIlIlIlll;
    }
    
    private static boolean lIIllIIlIIIlllIl(final int llllllllllllIllIIlIlIIIlIllIIlII, final int llllllllllllIllIIlIlIIIlIllIIIll) {
        return llllllllllllIllIIlIlIIIlIllIIlII == llllllllllllIllIIlIlIIIlIllIIIll;
    }
    
    public boolean isAnnouncingPlayerAchievements() {
        return MinecraftServer.llIlllIIIlIIII[1] != 0;
    }
    
    protected void finalTick(final CrashReport llllllllllllIllIIlIlIIlllIlIlllI) {
    }
    
    @Override
    public void addChatMessage(final IChatComponent llllllllllllIllIIlIlIIllIIlllIII) {
        MinecraftServer.logger.info(llllllllllllIllIIlIlIIllIIlllIII.getUnformattedText());
    }
    
    public int getNetworkCompressionTreshold() {
        return MinecraftServer.llIlllIIIlIIII[112];
    }
    
    public void setCanSpawnAnimals(final boolean llllllllllllIllIIlIlIIlIlIlIlIIl) {
        this.canSpawnAnimals = llllllllllllIllIIlIlIIlIlIlIlIIl;
    }
    
    public GameProfile[] getGameProfiles() {
        return this.serverConfigManager.getAllProfiles();
    }
    
    protected void initialWorldChunkLoad() {
        final int llllllllllllIllIIlIlIlIIlIlllIII = MinecraftServer.llIlllIIIlIIII[12];
        final int llllllllllllIllIIlIlIlIIlIllIlll = MinecraftServer.llIlllIIIlIIII[6];
        final int llllllllllllIllIIlIlIlIIlIllIllI = MinecraftServer.llIlllIIIlIIII[13];
        final int llllllllllllIllIIlIlIlIIlIllIlIl = MinecraftServer.llIlllIIIlIIII[14];
        int llllllllllllIllIIlIlIlIIlIllIlII = MinecraftServer.llIlllIIIlIIII[0];
        this.setUserMessage(MinecraftServer.llIlllIIIIIlll[MinecraftServer.llIlllIIIlIIII[15]]);
        final int llllllllllllIllIIlIlIlIIlIllIIll = MinecraftServer.llIlllIIIlIIII[0];
        MinecraftServer.logger.info(String.valueOf(new StringBuilder(MinecraftServer.llIlllIIIIIlll[MinecraftServer.llIlllIIIlIIII[16]]).append(llllllllllllIllIIlIlIlIIlIllIIll)));
        final WorldServer llllllllllllIllIIlIlIlIIlIllIIlI = this.worldServers[llllllllllllIllIIlIlIlIIlIllIIll];
        final BlockPos llllllllllllIllIIlIlIlIIlIllIIIl = llllllllllllIllIIlIlIlIIlIllIIlI.getSpawnPoint();
        long llllllllllllIllIIlIlIlIIlIllIIII = getCurrentTimeMillis();
        int llllllllllllIllIIlIlIlIIlIlIlllI = MinecraftServer.llIlllIIIlIIII[17];
        "".length();
        if (-"   ".length() > 0) {
            return;
        }
        while (lIIllIIlIIlIIIlI(llllllllllllIllIIlIlIlIIlIlIlllI, MinecraftServer.llIlllIIIlIIII[13]) && !lIIllIIlIIIllllI(this.isServerRunning() ? 1 : 0)) {
            int llllllllllllIllIIlIlIlIIlIlIllIl = MinecraftServer.llIlllIIIlIIII[17];
            "".length();
            if ((0x96 ^ 0x92) < (0xBA ^ 0xBE)) {
                return;
            }
            while (lIIllIIlIIlIIIlI(llllllllllllIllIIlIlIlIIlIlIllIl, MinecraftServer.llIlllIIIlIIII[13]) && !lIIllIIlIIIllllI(this.isServerRunning() ? 1 : 0)) {
                final long llllllllllllIllIIlIlIlIIlIlIlIll = getCurrentTimeMillis();
                if (lIIllIIlIIlIIIIl(lIIllIIlIIlIIIII(llllllllllllIllIIlIlIlIIlIlIlIll - llllllllllllIllIIlIlIlIIlIllIIII, 1000L))) {
                    this.outputPercentRemaining(MinecraftServer.llIlllIIIIIlll[MinecraftServer.llIlllIIIlIIII[18]], llllllllllllIllIIlIlIlIIlIllIlII * MinecraftServer.llIlllIIIlIIII[3] / MinecraftServer.llIlllIIIlIIII[14]);
                    llllllllllllIllIIlIlIlIIlIllIIII = llllllllllllIllIIlIlIlIIlIlIlIll;
                }
                ++llllllllllllIllIIlIlIlIIlIllIlII;
                llllllllllllIllIIlIlIlIIlIllIIlI.theChunkProviderServer.loadChunk(llllllllllllIllIIlIlIlIIlIllIIIl.getX() + llllllllllllIllIIlIlIlIIlIlIlllI >> MinecraftServer.llIlllIIIlIIII[6], llllllllllllIllIIlIlIlIIlIllIIIl.getZ() + llllllllllllIllIIlIlIlIIlIlIllIl >> MinecraftServer.llIlllIIIlIIII[6]);
                "".length();
                llllllllllllIllIIlIlIlIIlIlIllIl += 16;
            }
            llllllllllllIllIIlIlIlIIlIlIlllI += 16;
        }
        this.clearCurrentTask();
    }
    
    private static boolean lIIllIIlIIlIIlIl(final int llllllllllllIllIIlIlIIIlIlIIIIIl) {
        return llllllllllllIllIIlIlIIIlIlIIIIIl >= 0;
    }
    
    public PlayerProfileCache getPlayerProfileCache() {
        return this.profileCache;
    }
    
    public int getSpawnProtectionSize() {
        return MinecraftServer.llIlllIIIlIIII[12];
    }
    
    public KeyPair getKeyPair() {
        return this.serverKeyPair;
    }
    
    public int getMaxPlayerIdleMinutes() {
        return this.maxPlayerIdleMinutes;
    }
    
    public MinecraftServer(final Proxy llllllllllllIllIIlIlIlIlIIIIlIlI, final File llllllllllllIllIIlIlIlIlIIIIIllI) {
        this.usageSnooper = new PlayerUsageSnooper(MinecraftServer.llIlllIIIIIlll[MinecraftServer.llIlllIIIlIIII[1]], this, getCurrentTimeMillis());
        this.playersOnline = (List<ITickable>)Lists.newArrayList();
        this.theProfiler = new Profiler();
        this.statusResponse = new ServerStatusResponse();
        this.random = new Random();
        this.serverPort = MinecraftServer.llIlllIIIlIIII[2];
        this.serverRunning = (MinecraftServer.llIlllIIIlIIII[1] != 0);
        this.maxPlayerIdleMinutes = MinecraftServer.llIlllIIIlIIII[0];
        this.tickTimeArray = new long[MinecraftServer.llIlllIIIlIIII[3]];
        this.resourcePackUrl = MinecraftServer.llIlllIIIIIlll[MinecraftServer.llIlllIIIlIIII[4]];
        this.resourcePackHash = MinecraftServer.llIlllIIIIIlll[MinecraftServer.llIlllIIIlIIII[5]];
        this.nanoTimeSinceStatusRefresh = 0L;
        this.futureTaskQueue = (Queue<FutureTask<?>>)Queues.newArrayDeque();
        this.currentTime = getCurrentTimeMillis();
        this.serverProxy = llllllllllllIllIIlIlIlIlIIIIlIlI;
        MinecraftServer.mcServer = this;
        this.anvilFile = null;
        this.networkSystem = null;
        this.profileCache = new PlayerProfileCache(this, llllllllllllIllIIlIlIlIlIIIIIllI);
        this.commandManager = null;
        this.anvilConverterForAnvilFile = null;
        this.authService = new YggdrasilAuthenticationService(llllllllllllIllIIlIlIlIlIIIIlIlI, UUID.randomUUID().toString());
        this.sessionService = this.authService.createMinecraftSessionService();
        this.profileRepo = this.authService.createProfileRepository();
    }
    
    public boolean isDemo() {
        return this.isDemo;
    }
    
    public void canCreateBonusChest(final boolean llllllllllllIllIIlIlIIlIlllIllll) {
        this.enableBonusChest = llllllllllllIllIIlIlIIlIlllIllll;
    }
    
    public void setDemo(final boolean llllllllllllIllIIlIlIIlIllllIlIl) {
        this.isDemo = llllllllllllIllIIlIlIIlIllllIlIl;
    }
    
    protected void setInstance() {
        MinecraftServer.mcServer = this;
    }
    
    public String getFolderName() {
        return this.folderName;
    }
    
    @Override
    public void run() {
        try {
            if (lIIllIIlIIIllIll(this.startServer() ? 1 : 0)) {
                this.currentTime = getCurrentTimeMillis();
                long llllllllllllIllIIlIlIIllllllIIII = 0L;
                this.statusResponse.setServerDescription(new ChatComponentText(this.motd));
                this.statusResponse.setProtocolVersionInfo(new ServerStatusResponse.MinecraftProtocolVersionIdentifier(MinecraftServer.llIlllIIIIIlll[MinecraftServer.llIlllIIIlIIII[29]], MinecraftServer.llIlllIIIlIIII[30]));
                this.addFaviconToStatusResponse(this.statusResponse);
                "".length();
                if ((0x2B ^ 0x2F) < ((0x41 ^ 0x2) & ~(0xE1 ^ 0xA2))) {
                    return;
                }
                while (!lIIllIIlIIIllllI(this.serverRunning ? 1 : 0)) {
                    final long llllllllllllIllIIlIlIIlllllIlllI = getCurrentTimeMillis();
                    long llllllllllllIllIIlIlIIlllllIllII = llllllllllllIllIIlIlIIlllllIlllI - this.currentTime;
                    if (lIIllIIlIIlIIIIl(lIIllIIlIIlIIlII(llllllllllllIllIIlIlIIlllllIllII, 2000L)) && lIIllIIlIIlIIlIl(lIIllIIlIIlIIlII(this.currentTime - this.timeOfLastWarning, 15000L))) {
                        final Logger logger = MinecraftServer.logger;
                        final String s = MinecraftServer.llIlllIIIIIlll[MinecraftServer.llIlllIIIlIIII[31]];
                        final Object[] array = new Object[MinecraftServer.llIlllIIIlIIII[4]];
                        array[MinecraftServer.llIlllIIIlIIII[0]] = llllllllllllIllIIlIlIIlllllIllII;
                        array[MinecraftServer.llIlllIIIlIIII[1]] = llllllllllllIllIIlIlIIlllllIllII / 50L;
                        logger.warn(s, array);
                        llllllllllllIllIIlIlIIlllllIllII = 2000L;
                        this.timeOfLastWarning = this.currentTime;
                    }
                    if (lIIllIIlIIlIIllI(lIIllIIlIIlIIlII(llllllllllllIllIIlIlIIlllllIllII, 0L))) {
                        MinecraftServer.logger.warn(MinecraftServer.llIlllIIIIIlll[MinecraftServer.llIlllIIIlIIII[32]]);
                        llllllllllllIllIIlIlIIlllllIllII = 0L;
                    }
                    llllllllllllIllIIlIlIIllllllIIII += llllllllllllIllIIlIlIIlllllIllII;
                    this.currentTime = llllllllllllIllIIlIlIIlllllIlllI;
                    if (lIIllIIlIIIllIll(this.worldServers[MinecraftServer.llIlllIIIlIIII[0]].areAllPlayersAsleep() ? 1 : 0)) {
                        this.tick();
                        llllllllllllIllIIlIlIIllllllIIII = 0L;
                        "".length();
                        if (null != null) {
                            return;
                        }
                    }
                    else {
                        while (!lIIllIIlIIlIIlll(lIIllIIlIIlIIlII(llllllllllllIllIIlIlIIllllllIIII, 50L))) {
                            llllllllllllIllIIlIlIIllllllIIII -= 50L;
                            this.tick();
                        }
                    }
                    Thread.sleep(Math.max(1L, 50L - llllllllllllIllIIlIlIIllllllIIII));
                    this.serverIsRunning = (MinecraftServer.llIlllIIIlIIII[1] != 0);
                }
                "".length();
                if (" ".length() > "   ".length()) {
                    return;
                }
            }
            else {
                this.finalTick(null);
                "".length();
                if (-" ".length() > -" ".length()) {
                    return;
                }
            }
        }
        catch (Throwable llllllllllllIllIIlIlIIlllllIlIlI) {
            MinecraftServer.logger.error(MinecraftServer.llIlllIIIIIlll[MinecraftServer.llIlllIIIlIIII[33]], llllllllllllIllIIlIlIIlllllIlIlI);
            CrashReport llllllllllllIllIIlIlIIlllllIlIII = null;
            if (lIIllIIlIIIllIll((llllllllllllIllIIlIlIIlllllIlIlI instanceof ReportedException) ? 1 : 0)) {
                llllllllllllIllIIlIlIIlllllIlIII = this.addServerInfoToCrashReport(((ReportedException)llllllllllllIllIIlIlIIlllllIlIlI).getCrashReport());
                "".length();
                if ("   ".length() < 0) {
                    return;
                }
            }
            else {
                llllllllllllIllIIlIlIIlllllIlIII = this.addServerInfoToCrashReport(new CrashReport(MinecraftServer.llIlllIIIIIlll[MinecraftServer.llIlllIIIlIIII[34]], llllllllllllIllIIlIlIIlllllIlIlI));
            }
            final File llllllllllllIllIIlIlIIlllllIIllI = new File(new File(this.getDataDirectory(), MinecraftServer.llIlllIIIIIlll[MinecraftServer.llIlllIIIlIIII[35]]), String.valueOf(new StringBuilder(MinecraftServer.llIlllIIIIIlll[MinecraftServer.llIlllIIIlIIII[36]]).append(new SimpleDateFormat(MinecraftServer.llIlllIIIIIlll[MinecraftServer.llIlllIIIlIIII[37]]).format(new Date())).append(MinecraftServer.llIlllIIIIIlll[MinecraftServer.llIlllIIIlIIII[38]])));
            if (lIIllIIlIIIllIll(llllllllllllIllIIlIlIIlllllIlIII.saveToFile(llllllllllllIllIIlIlIIlllllIIllI) ? 1 : 0)) {
                MinecraftServer.logger.error(String.valueOf(new StringBuilder(MinecraftServer.llIlllIIIIIlll[MinecraftServer.llIlllIIIlIIII[39]]).append(llllllllllllIllIIlIlIIlllllIIllI.getAbsolutePath())));
                "".length();
                if ((0x2C ^ 0x2A ^ "  ".length()) < 0) {
                    return;
                }
            }
            else {
                MinecraftServer.logger.error(MinecraftServer.llIlllIIIIIlll[MinecraftServer.llIlllIIIlIIII[40]]);
            }
            this.finalTick(llllllllllllIllIIlIlIIlllllIlIII);
            try {
                this.serverStopped = (MinecraftServer.llIlllIIIlIIII[1] != 0);
                this.stopServer();
                "".length();
                if (-"  ".length() >= 0) {
                    return;
                }
            }
            catch (Throwable llllllllllllIllIIlIlIIlllllIIlII) {
                MinecraftServer.logger.error(MinecraftServer.llIlllIIIIIlll[MinecraftServer.llIlllIIIlIIII[41]], llllllllllllIllIIlIlIIlllllIIlII);
                this.systemExitNow();
                "".length();
                if ((129 + 41 - 133 + 109 ^ 144 + 147 - 236 + 95) != (39 + 59 + 29 + 28 ^ 20 + 67 - 21 + 93)) {
                    return;
                }
                return;
            }
            finally {
                this.systemExitNow();
            }
            this.systemExitNow();
            "".length();
            if ("   ".length() == 0) {
                return;
            }
            return;
        }
        finally {
            Label_0894: {
                try {
                    this.serverStopped = (MinecraftServer.llIlllIIIlIIII[1] != 0);
                    this.stopServer();
                    "".length();
                    if (-" ".length() == " ".length()) {
                        return;
                    }
                }
                catch (Throwable llllllllllllIllIIlIlIIlllllIIIlI) {
                    MinecraftServer.logger.error(MinecraftServer.llIlllIIIIIlll[MinecraftServer.llIlllIIIlIIII[42]], llllllllllllIllIIlIlIIlllllIIIlI);
                    this.systemExitNow();
                    "".length();
                    if (null != null) {
                        return;
                    }
                    break Label_0894;
                }
                finally {
                    this.systemExitNow();
                }
                this.systemExitNow();
            }
        }
        try {
            this.serverStopped = (MinecraftServer.llIlllIIIlIIII[1] != 0);
            this.stopServer();
            "".length();
            if (-" ".length() >= " ".length()) {
                return;
            }
        }
        catch (Throwable llllllllllllIllIIlIlIIlllllIIIII) {
            MinecraftServer.logger.error(MinecraftServer.llIlllIIIIIlll[MinecraftServer.llIlllIIIlIIII[43]], llllllllllllIllIIlIlIIlllllIIIII);
            this.systemExitNow();
            "".length();
            if (-" ".length() > " ".length()) {
                return;
            }
            return;
        }
        finally {
            this.systemExitNow();
        }
        this.systemExitNow();
    }
    
    private static boolean lIIllIIlIIlIllII(final Object llllllllllllIllIIlIlIIIlIlIIlIlI, final Object llllllllllllIllIIlIlIIIlIlIIlIIl) {
        return llllllllllllIllIIlIlIIIlIlIIlIlI == llllllllllllIllIIlIlIIIlIlIIlIIl;
    }
    
    public boolean isFlightAllowed() {
        return this.allowFlight;
    }
    
    public void setConfigManager(final ServerConfigurationManager llllllllllllIllIIlIlIIlIIlllIIlI) {
        this.serverConfigManager = llllllllllllIllIIlIlIIlIIlllIIlI;
    }
    
    private static String lIIllIIIllIllIIl(String llllllllllllIllIIlIlIIIllIIIlIIl, final String llllllllllllIllIIlIlIIIllIIIllIl) {
        llllllllllllIllIIlIlIIIllIIIlIIl = (boolean)new String(java.util.Base64.getDecoder().decode(((String)llllllllllllIllIIlIlIIIllIIIlIIl).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder llllllllllllIllIIlIlIIIllIIIllII = new StringBuilder();
        final char[] llllllllllllIllIIlIlIIIllIIIlIll = llllllllllllIllIIlIlIIIllIIIllIl.toCharArray();
        int llllllllllllIllIIlIlIIIllIIIlIlI = MinecraftServer.llIlllIIIlIIII[0];
        final int llllllllllllIllIIlIlIIIllIIIIlII = (Object)((String)llllllllllllIllIIlIlIIIllIIIlIIl).toCharArray();
        final short llllllllllllIllIIlIlIIIllIIIIIll = (short)llllllllllllIllIIlIlIIIllIIIIlII.length;
        Exception llllllllllllIllIIlIlIIIllIIIIIlI = (Exception)MinecraftServer.llIlllIIIlIIII[0];
        while (lIIllIIlIIlIllIl((int)llllllllllllIllIIlIlIIIllIIIIIlI, llllllllllllIllIIlIlIIIllIIIIIll)) {
            final char llllllllllllIllIIlIlIIIllIIIllll = llllllllllllIllIIlIlIIIllIIIIlII[llllllllllllIllIIlIlIIIllIIIIIlI];
            llllllllllllIllIIlIlIIIllIIIllII.append((char)(llllllllllllIllIIlIlIIIllIIIllll ^ llllllllllllIllIIlIlIIIllIIIlIll[llllllllllllIllIIlIlIIIllIIIlIlI % llllllllllllIllIIlIlIIIllIIIlIll.length]));
            "".length();
            ++llllllllllllIllIIlIlIIIllIIIlIlI;
            ++llllllllllllIllIIlIlIIIllIIIIIlI;
            "".length();
            if (((0x4A ^ 0x68 ^ (0x37 ^ 0x10)) & (120 + 25 - 21 + 27 ^ 70 + 130 - 168 + 114 ^ -" ".length())) != ((((0xA5 ^ 0x8C) & ~(0xAD ^ 0x84)) ^ (0xF6 ^ 0xC5)) & (0x90 ^ 0x9B ^ (0xB8 ^ 0x80) ^ -" ".length()))) {
                return null;
            }
        }
        return String.valueOf(llllllllllllIllIIlIlIIIllIIIllII);
    }
    
    public void enableProfiling() {
        this.startProfiling = (MinecraftServer.llIlllIIIlIIII[1] != 0);
    }
    
    private static void lIIllIIlIIIllIlI() {
        (llIlllIIIlIIII = new int[114])[0] = ((0xE ^ 0x31) & ~(0x36 ^ 0x9));
        MinecraftServer.llIlllIIIlIIII[1] = " ".length();
        MinecraftServer.llIlllIIIlIIII[2] = -" ".length();
        MinecraftServer.llIlllIIIlIIII[3] = (0xF9 ^ 0x9D);
        MinecraftServer.llIlllIIIlIIII[4] = "  ".length();
        MinecraftServer.llIlllIIIlIIII[5] = "   ".length();
        MinecraftServer.llIlllIIIlIIII[6] = (0xA6 ^ 0xA2);
        MinecraftServer.llIlllIIIlIIII[7] = (0xC1 ^ 0xC4);
        MinecraftServer.llIlllIIIlIIII[8] = (0x3A ^ 0x1C ^ (0xA9 ^ 0x89));
        MinecraftServer.llIlllIIIlIIII[9] = (183 + 87 - 238 + 152 ^ 45 + 18 + 24 + 104);
        MinecraftServer.llIlllIIIlIIII[10] = (0x89 ^ 0x81);
        MinecraftServer.llIlllIIIlIIII[11] = (0x5B ^ 0x52);
        MinecraftServer.llIlllIIIlIIII[12] = (0xD ^ 0x1D);
        MinecraftServer.llIlllIIIlIIII[13] = 136 + 67 - 68 + 22 + (0xB7 ^ 0xA7) - (72 + 13 - 13 + 93) + (103 + 36 - 49 + 94);
        MinecraftServer.llIlllIIIlIIII[14] = (-(0xFFFFDF8F & 0x717B) & (0xFFFFFBFB & 0x577F));
        MinecraftServer.llIlllIIIlIIII[15] = (0x8A ^ 0x80);
        MinecraftServer.llIlllIIIlIIII[16] = (0x5A ^ 0x51);
        MinecraftServer.llIlllIIIlIIII[17] = -(35 + 128 - 40 + 69);
        MinecraftServer.llIlllIIIlIIII[18] = (0x6E ^ 0xA ^ (0xF9 ^ 0x91));
        MinecraftServer.llIlllIIIlIIII[19] = (0x7C ^ 0x71);
        MinecraftServer.llIlllIIIlIIII[20] = (0xB9 ^ 0xB7);
        MinecraftServer.llIlllIIIlIIII[21] = (116 + 141 - 194 + 119 ^ 158 + 71 - 176 + 132);
        MinecraftServer.llIlllIIIlIIII[22] = (0x73 ^ 0x62);
        MinecraftServer.llIlllIIIlIIII[23] = (184 + 83 - 100 + 18 ^ 14 + 67 + 44 + 46);
        MinecraftServer.llIlllIIIlIIII[24] = (0xC ^ 0x1F);
        MinecraftServer.llIlllIIIlIIII[25] = (0xA4 ^ 0xB0);
        MinecraftServer.llIlllIIIlIIII[26] = (0xF0 ^ 0xA8 ^ (0x4C ^ 0x1));
        MinecraftServer.llIlllIIIlIIII[27] = (0xB ^ 0x1D);
        MinecraftServer.llIlllIIIlIIII[28] = (0xBA ^ 0xAD);
        MinecraftServer.llIlllIIIlIIII[29] = (0xA1 ^ 0xB9);
        MinecraftServer.llIlllIIIlIIII[30] = (0x44 ^ 0x6B);
        MinecraftServer.llIlllIIIlIIII[31] = (0x6F ^ 0x76);
        MinecraftServer.llIlllIIIlIIII[32] = (0x30 ^ 0x2A);
        MinecraftServer.llIlllIIIlIIII[33] = (0x7E ^ 0x65);
        MinecraftServer.llIlllIIIlIIII[34] = (0xAD ^ 0xB1);
        MinecraftServer.llIlllIIIlIIII[35] = (0x33 ^ 0x2E);
        MinecraftServer.llIlllIIIlIIII[36] = (0x9 ^ 0x17);
        MinecraftServer.llIlllIIIlIIII[37] = (0x2 ^ 0x1D);
        MinecraftServer.llIlllIIIlIIII[38] = (0x56 ^ 0x76);
        MinecraftServer.llIlllIIIlIIII[39] = (0x54 ^ 0x75);
        MinecraftServer.llIlllIIIlIIII[40] = (0x83 ^ 0xA1);
        MinecraftServer.llIlllIIIlIIII[41] = (0x8E ^ 0xAD ^ ((0xAA ^ 0xB1) & ~(0x2B ^ 0x30)));
        MinecraftServer.llIlllIIIlIIII[42] = (0x3C ^ 0x18);
        MinecraftServer.llIlllIIIlIIII[43] = (0x75 ^ 0x50);
        MinecraftServer.llIlllIIIlIIII[44] = (3 + 44 - 22 + 153 ^ 107 + 121 - 115 + 35);
        MinecraftServer.llIlllIIIlIIII[45] = (0xC7 ^ 0x87);
        MinecraftServer.llIlllIIIlIIII[46] = (129 + 25 + 7 + 26 ^ 112 + 113 - 144 + 75);
        MinecraftServer.llIlllIIIlIIII[47] = (19 + 74 + 35 + 29 ^ 74 + 81 + 18 + 8);
        MinecraftServer.llIlllIIIlIIII[48] = (0x4F ^ 0xE ^ (0xC ^ 0x64));
        MinecraftServer.llIlllIIIlIIII[49] = (0x2D ^ 0x7 ^ ((0x34 ^ 0x56) & ~(0x5A ^ 0x38)));
        MinecraftServer.llIlllIIIlIIII[50] = (0x35 ^ 0x19 ^ (0xAB ^ 0xAC));
        MinecraftServer.llIlllIIIlIIII[51] = (0x6B ^ 0x47);
        MinecraftServer.llIlllIIIlIIII[52] = (36 + 65 - 3 + 136 ^ 169 + 41 - 38 + 27);
        MinecraftServer.llIlllIIIlIIII[53] = (-(0xFFFFDDFD & 0x3E76) & (0xFFFFFFF7 & 0x1FFF));
        MinecraftServer.llIlllIIIlIIII[54] = (116 + 129 - 180 + 67 ^ 59 + 22 + 88 + 1);
        MinecraftServer.llIlllIIIlIIII[55] = (0x24 ^ 0x14);
        MinecraftServer.llIlllIIIlIIII[56] = (0xFFFFFF77 & 0x17F8);
        MinecraftServer.llIlllIIIlIIII[57] = (0x34 ^ 0x5);
        MinecraftServer.llIlllIIIlIIII[58] = (0x2B ^ 0x19);
        MinecraftServer.llIlllIIIlIIII[59] = (157 + 74 - 104 + 38 ^ 145 + 135 - 133 + 3);
        MinecraftServer.llIlllIIIlIIII[60] = (48 + 57 - 87 + 120 ^ 82 + 175 - 156 + 89);
        MinecraftServer.llIlllIIIlIIII[61] = (0x4 ^ 0x31);
        MinecraftServer.llIlllIIIlIIII[62] = (0x52 ^ 0x1A ^ (0x7B ^ 0x5));
        MinecraftServer.llIlllIIIlIIII[63] = (0x87 ^ 0xB0);
        MinecraftServer.llIlllIIIlIIII[64] = (0x52 ^ 0x6A);
        MinecraftServer.llIlllIIIlIIII[65] = (0xAB ^ 0x92);
        MinecraftServer.llIlllIIIlIIII[66] = (0xA ^ 0x4F ^ 69 + 28 - 16 + 46);
        MinecraftServer.llIlllIIIlIIII[67] = (0x9 ^ 0x32);
        MinecraftServer.llIlllIIIlIIII[68] = (0xBD ^ 0x81);
        MinecraftServer.llIlllIIIlIIII[69] = (16 + 78 - 35 + 96 ^ 44 + 154 - 160 + 128);
        MinecraftServer.llIlllIIIlIIII[70] = (0x2B ^ 0x15);
        MinecraftServer.llIlllIIIlIIII[71] = (0x83 ^ 0xBC);
        MinecraftServer.llIlllIIIlIIII[72] = (0x49 ^ 0x8);
        MinecraftServer.llIlllIIIlIIII[73] = (0x80 ^ 0xC2);
        MinecraftServer.llIlllIIIlIIII[74] = (6 + 34 + 37 + 158 ^ 10 + 120 - 37 + 75);
        MinecraftServer.llIlllIIIlIIII[75] = (0x2 ^ 0x17 ^ (0x74 ^ 0x25));
        MinecraftServer.llIlllIIIlIIII[76] = (0x41 ^ 0x4);
        MinecraftServer.llIlllIIIlIIII[77] = (0x26 ^ 0x60);
        MinecraftServer.llIlllIIIlIIII[78] = (0xD4 ^ 0x93);
        MinecraftServer.llIlllIIIlIIII[79] = (0x4C ^ 0x77 ^ (0x1C ^ 0x6F));
        MinecraftServer.llIlllIIIlIIII[80] = (0x41 ^ 0x8);
        MinecraftServer.llIlllIIIlIIII[81] = (0xC3 ^ 0x89);
        MinecraftServer.llIlllIIIlIIII[82] = (115 + 8 + 4 + 14 ^ 137 + 111 - 94 + 44);
        MinecraftServer.llIlllIIIlIIII[83] = (0x6B ^ 0x27);
        MinecraftServer.llIlllIIIlIIII[84] = (0xE8 ^ 0xA5);
        MinecraftServer.llIlllIIIlIIII[85] = (0x88 ^ 0x85 ^ (0x1C ^ 0x5F));
        MinecraftServer.llIlllIIIlIIII[86] = (0x75 ^ 0x2A ^ (0x58 ^ 0x48));
        MinecraftServer.llIlllIIIlIIII[87] = (0x95 ^ 0xC5);
        MinecraftServer.llIlllIIIlIIII[88] = (0xDA ^ 0xA8 ^ (0x3B ^ 0x18));
        MinecraftServer.llIlllIIIlIIII[89] = (0x92 ^ 0xC0);
        MinecraftServer.llIlllIIIlIIII[90] = (0x2E ^ 0x7D);
        MinecraftServer.llIlllIIIlIIII[91] = (0x46 ^ 0x12);
        MinecraftServer.llIlllIIIlIIII[92] = (0x61 ^ 0x34);
        MinecraftServer.llIlllIIIlIIII[93] = (0x64 ^ 0x32);
        MinecraftServer.llIlllIIIlIIII[94] = (0xF2 ^ 0xA5);
        MinecraftServer.llIlllIIIlIIII[95] = (0x26 ^ 0x4C ^ (0xA5 ^ 0x97));
        MinecraftServer.llIlllIIIlIIII[96] = (0x2F ^ 0x76);
        MinecraftServer.llIlllIIIlIIII[97] = (103 + 11 - 103 + 220 ^ 24 + 20 + 90 + 55);
        MinecraftServer.llIlllIIIlIIII[98] = (198 + 128 - 260 + 149 ^ 47 + 138 - 119 + 74);
        MinecraftServer.llIlllIIIlIIII[99] = (117 + 104 - 114 + 46 ^ 38 + 141 - 109 + 127);
        MinecraftServer.llIlllIIIlIIII[100] = (49 + 74 + 27 + 97 ^ 55 + 86 + 15 + 14);
        MinecraftServer.llIlllIIIlIIII[101] = (9 + 99 + 24 + 71 ^ 7 + 110 + 11 + 21);
        MinecraftServer.llIlllIIIlIIII[102] = (188 + 134 - 254 + 130 ^ 136 + 137 - 143 + 23);
        MinecraftServer.llIlllIIIlIIII[103] = (0x45 ^ 0x25);
        MinecraftServer.llIlllIIIlIIII[104] = (0x38 ^ 0x59);
        MinecraftServer.llIlllIIIlIIII[105] = (0x3A ^ 0x3C ^ (0x65 ^ 0x1));
        MinecraftServer.llIlllIIIlIIII[106] = (0x70 ^ 0x53 ^ (0x31 ^ 0x71));
        MinecraftServer.llIlllIIIlIIII[107] = (0xE9 ^ 0x8C);
        MinecraftServer.llIlllIIIlIIII[108] = (175 + 119 - 98 + 19 ^ 149 + 94 - 74 + 8);
        MinecraftServer.llIlllIIIlIIII[109] = (0x6B ^ 0x65 ^ (0xD8 ^ 0xB1));
        MinecraftServer.llIlllIIIlIIII[110] = (64 + 10 + 50 + 77 ^ 53 + 69 - 28 + 67);
        MinecraftServer.llIlllIIIlIIII[111] = (0xFFFFD377 & 0x1C9EFF8);
        MinecraftServer.llIlllIIIlIIII[112] = (-(0xFFFFFFC7 & 0x387F) & (0xFFFFBFD7 & 0x796E));
        MinecraftServer.llIlllIIIlIIII[113] = (148 + 126 - 126 + 79 ^ 60 + 87 - 57 + 48);
    }
    
    public Entity getEntityFromUuid(final UUID llllllllllllIllIIlIlIIIlllllllIl) {
        final double llllllllllllIllIIlIlIIIllllllIIl;
        final int llllllllllllIllIIlIlIIIllllllIlI = ((WorldServer[])(Object)(llllllllllllIllIIlIlIIIllllllIIl = (double)(Object)this.worldServers)).length;
        long llllllllllllIllIIlIlIIIllllllIll = MinecraftServer.llIlllIIIlIIII[0];
        "".length();
        if ("  ".length() <= 0) {
            return null;
        }
        while (!lIIllIIlIIIlllll((int)llllllllllllIllIIlIlIIIllllllIll, llllllllllllIllIIlIlIIIllllllIlI)) {
            final WorldServer llllllllllllIllIIlIlIIlIIIIIIIll = llllllllllllIllIIlIlIIIllllllIIl[llllllllllllIllIIlIlIIIllllllIll];
            if (lIIllIIlIIlIIIll(llllllllllllIllIIlIlIIlIIIIIIIll)) {
                final Entity llllllllllllIllIIlIlIIlIIIIIIIIl = llllllllllllIllIIlIlIIlIIIIIIIll.getEntityFromUuid(llllllllllllIllIIlIlIIIlllllllIl);
                if (lIIllIIlIIlIIIll(llllllllllllIllIIlIlIIlIIIIIIIIl)) {
                    return llllllllllllIllIIlIlIIlIIIIIIIIl;
                }
            }
            ++llllllllllllIllIIlIlIIIllllllIll;
        }
        return null;
    }
    
    @Override
    public boolean sendCommandFeedback() {
        return getServer().worldServers[MinecraftServer.llIlllIIIlIIII[0]].getGameRules().getBoolean(MinecraftServer.llIlllIIIIIlll[MinecraftServer.llIlllIIIlIIII[110]]);
    }
    
    public abstract boolean func_181035_ah();
    
    public String getWorldName() {
        return this.worldName;
    }
    
    public boolean isBlockProtected(final World llllllllllllIllIIlIlIIlIIlIIlllI, final BlockPos llllllllllllIllIIlIlIIlIIlIIllIl, final EntityPlayer llllllllllllIllIIlIlIIlIIlIIllII) {
        return MinecraftServer.llIlllIIIlIIII[0] != 0;
    }
    
    public boolean getGuiEnabled() {
        return MinecraftServer.llIlllIIIlIIII[0] != 0;
    }
    
    public String getMOTD() {
        return this.motd;
    }
    
    @Override
    public Vec3 getPositionVector() {
        return new Vec3(0.0, 0.0, 0.0);
    }
    
    public void refreshStatusNextTick() {
        this.nanoTimeSinceStatusRefresh = 0L;
    }
    
    private static int lIIllIIlIIlIIlII(final long n, final long n2) {
        return lcmp(n, n2);
    }
    
    public MinecraftServer(final File llllllllllllIllIIlIlIlIIllllllII, final Proxy llllllllllllIllIIlIlIlIIlllllIll, final File llllllllllllIllIIlIlIlIIlllllllI) {
        this.usageSnooper = new PlayerUsageSnooper(MinecraftServer.llIlllIIIIIlll[MinecraftServer.llIlllIIIlIIII[6]], this, getCurrentTimeMillis());
        this.playersOnline = (List<ITickable>)Lists.newArrayList();
        this.theProfiler = new Profiler();
        this.statusResponse = new ServerStatusResponse();
        this.random = new Random();
        this.serverPort = MinecraftServer.llIlllIIIlIIII[2];
        this.serverRunning = (MinecraftServer.llIlllIIIlIIII[1] != 0);
        this.maxPlayerIdleMinutes = MinecraftServer.llIlllIIIlIIII[0];
        this.tickTimeArray = new long[MinecraftServer.llIlllIIIlIIII[3]];
        this.resourcePackUrl = MinecraftServer.llIlllIIIIIlll[MinecraftServer.llIlllIIIlIIII[7]];
        this.resourcePackHash = MinecraftServer.llIlllIIIIIlll[MinecraftServer.llIlllIIIlIIII[8]];
        this.nanoTimeSinceStatusRefresh = 0L;
        this.futureTaskQueue = (Queue<FutureTask<?>>)Queues.newArrayDeque();
        this.currentTime = getCurrentTimeMillis();
        this.serverProxy = llllllllllllIllIIlIlIlIIlllllIll;
        MinecraftServer.mcServer = this;
        this.anvilFile = llllllllllllIllIIlIlIlIIllllllII;
        this.networkSystem = new NetworkSystem(this);
        this.profileCache = new PlayerProfileCache(this, llllllllllllIllIIlIlIlIIlllllllI);
        this.commandManager = this.createNewCommandManager();
        this.anvilConverterForAnvilFile = new AnvilSaveConverter(llllllllllllIllIIlIlIlIIllllllII);
        this.authService = new YggdrasilAuthenticationService(llllllllllllIllIIlIlIlIIlllllIll, UUID.randomUUID().toString());
        this.sessionService = this.authService.createMinecraftSessionService();
        this.profileRepo = this.authService.createProfileRepository();
    }
    
    public void initiateShutdown() {
        this.serverRunning = (MinecraftServer.llIlllIIIlIIII[0] != 0);
    }
    
    public void setWorldName(final String llllllllllllIllIIlIlIIllIIIlIllI) {
        this.worldName = llllllllllllIllIIlIlIIllIIIlIllI;
    }
    
    @Override
    public boolean isSnooperEnabled() {
        return MinecraftServer.llIlllIIIlIIII[1] != 0;
    }
    
    private static boolean lIIllIIlIIlIIIIl(final int llllllllllllIllIIlIlIIIlIIlllIll) {
        return llllllllllllIllIIlIlIIIlIIlllIll > 0;
    }
    
    private static boolean lIIllIIlIIlIIllI(final int llllllllllllIllIIlIlIIIlIIllllll) {
        return llllllllllllIllIIlIlIIIlIIllllll < 0;
    }
    
    public void setServerOwner(final String llllllllllllIllIIlIlIIllIIlIIllI) {
        this.serverOwner = llllllllllllIllIIlIlIIllIIlIIllI;
    }
    
    public void setGameType(final WorldSettings.GameType llllllllllllIllIIlIlIIlIIllIlIll) {
        int llllllllllllIllIIlIlIIlIIllIlIlI = MinecraftServer.llIlllIIIlIIII[0];
        "".length();
        if (" ".length() != " ".length()) {
            return;
        }
        while (!lIIllIIlIIIlllll(llllllllllllIllIIlIlIIlIIllIlIlI, this.worldServers.length)) {
            getServer().worldServers[llllllllllllIllIIlIlIIlIIllIlIlI].getWorldInfo().setGameType(llllllllllllIllIIlIlIIlIIllIlIll);
            ++llllllllllllIllIIlIlIIlIIllIlIlI;
        }
    }
    
    @Override
    public void addServerTypeToSnooper(final PlayerUsageSnooper llllllllllllIllIIlIlIIlIlIllllII) {
        llllllllllllIllIIlIlIIlIlIllllII.addStatToSnooper(MinecraftServer.llIlllIIIIIlll[MinecraftServer.llIlllIIIlIIII[105]], this.isSinglePlayer());
        llllllllllllIllIIlIlIIlIlIllllII.addStatToSnooper(MinecraftServer.llIlllIIIIIlll[MinecraftServer.llIlllIIIlIIII[106]], this.getServerModName());
        final String lllllllllllllIIlIlllllIllIIIIIIl = MinecraftServer.llIlllIIIIIlll[MinecraftServer.llIlllIIIlIIII[3]];
        String lllllllllllllIIlIlllllIllIIIIIII;
        if (lIIllIIlIIIllIll(GraphicsEnvironment.isHeadless() ? 1 : 0)) {
            lllllllllllllIIlIlllllIllIIIIIII = MinecraftServer.llIlllIIIIIlll[MinecraftServer.llIlllIIIlIIII[107]];
            "".length();
            if (((0x26 ^ 0x3F) & ~(0xBF ^ 0xA6)) != 0x0) {
                return;
            }
        }
        else {
            lllllllllllllIIlIlllllIllIIIIIII = MinecraftServer.llIlllIIIIIlll[MinecraftServer.llIlllIIIlIIII[108]];
        }
        llllllllllllIllIIlIlIIlIlIllllII.addStatToSnooper(lllllllllllllIIlIlllllIllIIIIIIl, lllllllllllllIIlIlllllIllIIIIIII);
        llllllllllllIllIIlIlIIlIlIllllII.addStatToSnooper(MinecraftServer.llIlllIIIIIlll[MinecraftServer.llIlllIIIlIIII[109]], this.isDedicatedServer());
    }
    
    @Override
    public IChatComponent getDisplayName() {
        return new ChatComponentText(this.getName());
    }
    
    protected void systemExitNow() {
    }
    
    public void setPlayerIdleTimeout(final int llllllllllllIllIIlIlIIlIIIlllIll) {
        this.maxPlayerIdleMinutes = llllllllllllIllIIlIlIIlIIIlllIll;
    }
    
    protected ServerCommandManager createNewCommandManager() {
        return new ServerCommandManager();
    }
    
    public abstract EnumDifficulty getDifficulty();
    
    public abstract int getOpPermissionLevel();
    
    @Override
    public void addServerStatsToSnooper(final PlayerUsageSnooper llllllllllllIllIIlIlIIlIllIIIllI) {
        llllllllllllIllIIlIlIIlIllIIIllI.addClientStat(MinecraftServer.llIlllIIIIIlll[MinecraftServer.llIlllIIIlIIII[77]], (boolean)(MinecraftServer.llIlllIIIlIIII[0] != 0));
        llllllllllllIllIIlIlIIlIllIIIllI.addClientStat(MinecraftServer.llIlllIIIIIlll[MinecraftServer.llIlllIIIlIIII[78]], MinecraftServer.llIlllIIIlIIII[0]);
        if (lIIllIIlIIlIIIll(this.serverConfigManager)) {
            llllllllllllIllIIlIlIIlIllIIIllI.addClientStat(MinecraftServer.llIlllIIIIIlll[MinecraftServer.llIlllIIIlIIII[79]], this.getCurrentPlayerCount());
            llllllllllllIllIIlIlIIlIllIIIllI.addClientStat(MinecraftServer.llIlllIIIIIlll[MinecraftServer.llIlllIIIlIIII[80]], this.getMaxPlayers());
            llllllllllllIllIIlIlIIlIllIIIllI.addClientStat(MinecraftServer.llIlllIIIIIlll[MinecraftServer.llIlllIIIlIIII[81]], this.serverConfigManager.getAvailablePlayerDat().length);
        }
        llllllllllllIllIIlIlIIlIllIIIllI.addClientStat(MinecraftServer.llIlllIIIIIlll[MinecraftServer.llIlllIIIlIIII[82]], this.onlineMode);
        final String lllllllllllllIIlIlllllIllIIIlIIl = MinecraftServer.llIlllIIIIIlll[MinecraftServer.llIlllIIIlIIII[83]];
        String lllllllllllllIIlIlllllIllIIIlIll;
        if (lIIllIIlIIIllIll(this.getGuiEnabled() ? 1 : 0)) {
            lllllllllllllIIlIlllllIllIIIlIll = MinecraftServer.llIlllIIIIIlll[MinecraftServer.llIlllIIIlIIII[84]];
            "".length();
            if (-"   ".length() >= 0) {
                return;
            }
        }
        else {
            lllllllllllllIIlIlllllIllIIIlIll = MinecraftServer.llIlllIIIIIlll[MinecraftServer.llIlllIIIlIIII[85]];
        }
        llllllllllllIllIIlIlIIlIllIIIllI.addClientStat(lllllllllllllIIlIlllllIllIIIlIIl, lllllllllllllIIlIlllllIllIIIlIll);
        llllllllllllIllIIlIlIIlIllIIIllI.addClientStat(MinecraftServer.llIlllIIIIIlll[MinecraftServer.llIlllIIIlIIII[86]], (getCurrentTimeMillis() - llllllllllllIllIIlIlIIlIllIIIllI.getMinecraftStartTimeMillis()) / 60L * 1000L);
        llllllllllllIllIIlIlIIlIllIIIllI.addClientStat(MinecraftServer.llIlllIIIIIlll[MinecraftServer.llIlllIIIlIIII[87]], (int)(MathHelper.average(this.tickTimeArray) * 1.0E-6));
        int llllllllllllIllIIlIlIIlIllIIlIll = MinecraftServer.llIlllIIIlIIII[0];
        if (lIIllIIlIIlIIIll(this.worldServers)) {
            int llllllllllllIllIIlIlIIlIllIIlIlI = MinecraftServer.llIlllIIIlIIII[0];
            "".length();
            if (null != null) {
                return;
            }
            while (!lIIllIIlIIIlllll(llllllllllllIllIIlIlIIlIllIIlIlI, this.worldServers.length)) {
                if (lIIllIIlIIlIIIll(this.worldServers[llllllllllllIllIIlIlIIlIllIIlIlI])) {
                    final WorldServer llllllllllllIllIIlIlIIlIllIIlIIl = this.worldServers[llllllllllllIllIIlIlIIlIllIIlIlI];
                    final WorldInfo llllllllllllIllIIlIlIIlIllIIlIII = llllllllllllIllIIlIlIIlIllIIlIIl.getWorldInfo();
                    llllllllllllIllIIlIlIIlIllIIIllI.addClientStat(String.valueOf(new StringBuilder(MinecraftServer.llIlllIIIIIlll[MinecraftServer.llIlllIIIlIIII[88]]).append(llllllllllllIllIIlIlIIlIllIIlIll).append(MinecraftServer.llIlllIIIIIlll[MinecraftServer.llIlllIIIlIIII[89]])), llllllllllllIllIIlIlIIlIllIIlIIl.provider.getDimensionId());
                    llllllllllllIllIIlIlIIlIllIIIllI.addClientStat(String.valueOf(new StringBuilder(MinecraftServer.llIlllIIIIIlll[MinecraftServer.llIlllIIIlIIII[90]]).append(llllllllllllIllIIlIlIIlIllIIlIll).append(MinecraftServer.llIlllIIIIIlll[MinecraftServer.llIlllIIIlIIII[91]])), llllllllllllIllIIlIlIIlIllIIlIII.getGameType());
                    llllllllllllIllIIlIlIIlIllIIIllI.addClientStat(String.valueOf(new StringBuilder(MinecraftServer.llIlllIIIIIlll[MinecraftServer.llIlllIIIlIIII[92]]).append(llllllllllllIllIIlIlIIlIllIIlIll).append(MinecraftServer.llIlllIIIIIlll[MinecraftServer.llIlllIIIlIIII[93]])), llllllllllllIllIIlIlIIlIllIIlIIl.getDifficulty());
                    llllllllllllIllIIlIlIIlIllIIIllI.addClientStat(String.valueOf(new StringBuilder(MinecraftServer.llIlllIIIIIlll[MinecraftServer.llIlllIIIlIIII[94]]).append(llllllllllllIllIIlIlIIlIllIIlIll).append(MinecraftServer.llIlllIIIIIlll[MinecraftServer.llIlllIIIlIIII[95]])), llllllllllllIllIIlIlIIlIllIIlIII.isHardcoreModeEnabled());
                    llllllllllllIllIIlIlIIlIllIIIllI.addClientStat(String.valueOf(new StringBuilder(MinecraftServer.llIlllIIIIIlll[MinecraftServer.llIlllIIIlIIII[96]]).append(llllllllllllIllIIlIlIIlIllIIlIll).append(MinecraftServer.llIlllIIIIIlll[MinecraftServer.llIlllIIIlIIII[97]])), llllllllllllIllIIlIlIIlIllIIlIII.getTerrainType().getWorldTypeName());
                    llllllllllllIllIIlIlIIlIllIIIllI.addClientStat(String.valueOf(new StringBuilder(MinecraftServer.llIlllIIIIIlll[MinecraftServer.llIlllIIIlIIII[98]]).append(llllllllllllIllIIlIlIIlIllIIlIll).append(MinecraftServer.llIlllIIIIIlll[MinecraftServer.llIlllIIIlIIII[99]])), llllllllllllIllIIlIlIIlIllIIlIII.getTerrainType().getGeneratorVersion());
                    llllllllllllIllIIlIlIIlIllIIIllI.addClientStat(String.valueOf(new StringBuilder(MinecraftServer.llIlllIIIIIlll[MinecraftServer.llIlllIIIlIIII[100]]).append(llllllllllllIllIIlIlIIlIllIIlIll).append(MinecraftServer.llIlllIIIIIlll[MinecraftServer.llIlllIIIlIIII[101]])), this.buildLimit);
                    llllllllllllIllIIlIlIIlIllIIIllI.addClientStat(String.valueOf(new StringBuilder(MinecraftServer.llIlllIIIIIlll[MinecraftServer.llIlllIIIlIIII[102]]).append(llllllllllllIllIIlIlIIlIllIIlIll).append(MinecraftServer.llIlllIIIIIlll[MinecraftServer.llIlllIIIlIIII[103]])), llllllllllllIllIIlIlIIlIllIIlIIl.getChunkProvider().getLoadedChunkCount());
                    ++llllllllllllIllIIlIlIIlIllIIlIll;
                }
                ++llllllllllllIllIIlIlIIlIllIIlIlI;
            }
        }
        llllllllllllIllIIlIlIIlIllIIIllI.addClientStat(MinecraftServer.llIlllIIIIIlll[MinecraftServer.llIlllIIIlIIII[104]], llllllllllllIllIIlIlIIlIllIIlIll);
    }
    
    public int getMaxWorldSize() {
        return MinecraftServer.llIlllIIIlIIII[111];
    }
    
    public Proxy getServerProxy() {
        return this.serverProxy;
    }
    
    @Override
    public boolean canCommandSenderUseCommand(final int llllllllllllIllIIlIlIIllIIllIllI, final String llllllllllllIllIIlIlIIllIIllIlIl) {
        return MinecraftServer.llIlllIIIlIIII[1] != 0;
    }
    
    public ServerConfigurationManager getConfigurationManager() {
        return this.serverConfigManager;
    }
    
    public boolean getAllowNether() {
        return MinecraftServer.llIlllIIIlIIII[1] != 0;
    }
    
    private static boolean lIIllIIlIIlIIlll(final int llllllllllllIllIIlIlIIIlIIllllIl) {
        return llllllllllllIllIIlIlIIIlIIllllIl <= 0;
    }
    
    public WorldServer worldServerForDimension(final int llllllllllllIllIIlIlIIllIlllIlll) {
        WorldServer worldServer;
        if (lIIllIIlIIIlllIl(llllllllllllIllIIlIlIIllIlllIlll, MinecraftServer.llIlllIIIlIIII[2])) {
            worldServer = this.worldServers[MinecraftServer.llIlllIIIlIIII[1]];
            "".length();
            if ("  ".length() < " ".length()) {
                return null;
            }
        }
        else if (lIIllIIlIIIlllIl(llllllllllllIllIIlIlIIllIlllIlll, MinecraftServer.llIlllIIIlIIII[1])) {
            worldServer = this.worldServers[MinecraftServer.llIlllIIIlIIII[4]];
            "".length();
            if (" ".length() >= "  ".length()) {
                return null;
            }
        }
        else {
            worldServer = this.worldServers[MinecraftServer.llIlllIIIlIIII[0]];
        }
        return worldServer;
    }
    
    public boolean isServerStopped() {
        return this.serverStopped;
    }
    
    public CrashReport addServerInfoToCrashReport(final CrashReport llllllllllllIllIIlIlIIllIllIIIIl) {
        llllllllllllIllIIlIlIIllIllIIIIl.getCategory().addCrashSectionCallable(MinecraftServer.llIlllIIIIIlll[MinecraftServer.llIlllIIIlIIII[71]], new Callable<String>() {
            private static final /* synthetic */ String[] lllIlIIIIlIIll;
            private static final /* synthetic */ int[] lllIlIIIIllIlI;
            
            private static String lIlIIIIlIlllIIIl(final String llllllllllllIlIlllIIllIIllIIIIll, final String llllllllllllIlIlllIIllIIllIIIIlI) {
                try {
                    final SecretKeySpec llllllllllllIlIlllIIllIIllIIIllI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIlIlllIIllIIllIIIIlI.getBytes(StandardCharsets.UTF_8)), MinecraftServer$2.lllIlIIIIllIlI[2]), "DES");
                    final Cipher llllllllllllIlIlllIIllIIllIIIlIl = Cipher.getInstance("DES");
                    llllllllllllIlIlllIIllIIllIIIlIl.init(MinecraftServer$2.lllIlIIIIllIlI[3], llllllllllllIlIlllIIllIIllIIIllI);
                    return new String(llllllllllllIlIlllIIllIIllIIIlIl.doFinal(java.util.Base64.getDecoder().decode(llllllllllllIlIlllIIllIIllIIIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
                }
                catch (Exception llllllllllllIlIlllIIllIIllIIIlII) {
                    llllllllllllIlIlllIIllIIllIIIlII.printStackTrace();
                    return null;
                }
            }
            
            private static void lIlIIIIllIIIIlIl() {
                (lllIlIIIIllIlI = new int[4])[0] = ((97 + 99 - 140 + 71 ^ (0x4C ^ 0xA)) & (69 + 50 - 62 + 89 ^ 30 + 17 + 71 + 53 ^ -" ".length()));
                MinecraftServer$2.lllIlIIIIllIlI[1] = " ".length();
                MinecraftServer$2.lllIlIIIIllIlI[2] = (0x91 ^ 0x9D ^ (0x84 ^ 0x80));
                MinecraftServer$2.lllIlIIIIllIlI[3] = "  ".length();
            }
            
            @Override
            public String call() throws Exception {
                String nameOfLastSection;
                if (lIlIIIIllIIIIllI(MinecraftServer.this.theProfiler.profilingEnabled ? 1 : 0)) {
                    nameOfLastSection = MinecraftServer.this.theProfiler.getNameOfLastSection();
                    "".length();
                    if ("  ".length() < 0) {
                        return null;
                    }
                }
                else {
                    nameOfLastSection = MinecraftServer$2.lllIlIIIIlIIll[MinecraftServer$2.lllIlIIIIllIlI[0]];
                }
                return nameOfLastSection;
            }
            
            private static boolean lIlIIIIllIIIIllI(final int llllllllllllIlIlllIIllIIlIllllII) {
                return llllllllllllIlIlllIIllIIlIllllII != 0;
            }
            
            private static void lIlIIIIlIlllIIlI() {
                (lllIlIIIIlIIll = new String[MinecraftServer$2.lllIlIIIIllIlI[1]])[MinecraftServer$2.lllIlIIIIllIlI[0]] = lIlIIIIlIlllIIIl("jOSyTiE7R3+UaUOE4+Bx5Q==", "UXzKf");
            }
            
            static {
                lIlIIIIllIIIIlIl();
                lIlIIIIlIlllIIlI();
            }
        });
        if (lIIllIIlIIlIIIll(this.serverConfigManager)) {
            llllllllllllIllIIlIlIIllIllIIIIl.getCategory().addCrashSectionCallable(MinecraftServer.llIlllIIIIIlll[MinecraftServer.llIlllIIIlIIII[45]], new Callable<String>() {
                private static final /* synthetic */ int[] lIlIlIIllIIlIl;
                private static final /* synthetic */ String[] lIlIlIIllIIlII;
                
                static {
                    lllIllIlIIIIIll();
                    lllIllIlIIIIIlI();
                }
                
                private static void lllIllIlIIIIIll() {
                    (lIlIlIIllIIlIl = new int[4])[0] = ((0xB2 ^ 0x82) & ~(0x67 ^ 0x57));
                    MinecraftServer$3.lIlIlIIllIIlIl[1] = " ".length();
                    MinecraftServer$3.lIlIlIIllIIlIl[2] = "  ".length();
                    MinecraftServer$3.lIlIlIIllIIlIl[3] = (0x7E ^ 0x77 ^ " ".length());
                }
                
                private static String lllIllIlIIIIIII(final String lllllllllllllIIIlIIlIlIIlIIlllII, final String lllllllllllllIIIlIIlIlIIlIIllIIl) {
                    try {
                        final SecretKeySpec lllllllllllllIIIlIIlIlIIlIIlllll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIIIlIIlIlIIlIIllIIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
                        final Cipher lllllllllllllIIIlIIlIlIIlIIllllI = Cipher.getInstance("Blowfish");
                        lllllllllllllIIIlIIlIlIIlIIllllI.init(MinecraftServer$3.lIlIlIIllIIlIl[2], lllllllllllllIIIlIIlIlIIlIIlllll);
                        return new String(lllllllllllllIIIlIIlIlIIlIIllllI.doFinal(java.util.Base64.getDecoder().decode(lllllllllllllIIIlIIlIlIIlIIlllII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
                    }
                    catch (Exception lllllllllllllIIIlIIlIlIIlIIlllIl) {
                        lllllllllllllIIIlIIlIlIIlIIlllIl.printStackTrace();
                        return null;
                    }
                }
                
                private static void lllIllIlIIIIIlI() {
                    (lIlIlIIllIIlII = new String[MinecraftServer$3.lIlIlIIllIIlIl[2]])[MinecraftServer$3.lIlIlIIllIIlIl[0]] = lllIllIlIIIIIII("ZESMopu8YMs=", "lQACo");
                    MinecraftServer$3.lIlIlIIllIIlII[MinecraftServer$3.lIlIlIIllIIlIl[1]] = lllIllIlIIIIIIl("e+tc6h8hyPk=", "wKBwp");
                }
                
                @Override
                public String call() {
                    return String.valueOf(new StringBuilder(String.valueOf(MinecraftServer.this.serverConfigManager.getCurrentPlayerCount())).append(MinecraftServer$3.lIlIlIIllIIlII[MinecraftServer$3.lIlIlIIllIIlIl[0]]).append(MinecraftServer.this.serverConfigManager.getMaxPlayers()).append(MinecraftServer$3.lIlIlIIllIIlII[MinecraftServer$3.lIlIlIIllIIlIl[1]]).append(MinecraftServer.this.serverConfigManager.func_181057_v()));
                }
                
                private static String lllIllIlIIIIIIl(final String lllllllllllllIIIlIIlIlIIlIIIllIl, final String lllllllllllllIIIlIIlIlIIlIIIllII) {
                    try {
                        final SecretKeySpec lllllllllllllIIIlIIlIlIIlIIlIIlI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIIIlIIlIlIIlIIIllII.getBytes(StandardCharsets.UTF_8)), MinecraftServer$3.lIlIlIIllIIlIl[3]), "DES");
                        final Cipher lllllllllllllIIIlIIlIlIIlIIlIIIl = Cipher.getInstance("DES");
                        lllllllllllllIIIlIIlIlIIlIIlIIIl.init(MinecraftServer$3.lIlIlIIllIIlIl[2], lllllllllllllIIIlIIlIlIIlIIlIIlI);
                        return new String(lllllllllllllIIIlIIlIlIIlIIlIIIl.doFinal(java.util.Base64.getDecoder().decode(lllllllllllllIIIlIIlIlIIlIIIllIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
                    }
                    catch (Exception lllllllllllllIIIlIIlIlIIlIIlIIII) {
                        lllllllllllllIIIlIIlIlIIlIIlIIII.printStackTrace();
                        return null;
                    }
                }
            });
        }
        return llllllllllllIllIIlIlIIllIllIIIIl;
    }
    
    public int getCurrentPlayerCount() {
        return this.serverConfigManager.getCurrentPlayerCount();
    }
    
    public int getTickCounter() {
        return this.tickCounter;
    }
    
    public boolean getCanSpawnNPCs() {
        return this.canSpawnNPCs;
    }
    
    private static boolean lIIllIIlIIIlllll(final int llllllllllllIllIIlIlIIIlIllIIIII, final int llllllllllllIllIIlIlIIIlIlIlllll) {
        return llllllllllllIllIIlIlIIIlIllIIIII >= llllllllllllIllIIlIlIIIlIlIlllll;
    }
    
    public File getFile(final String llllllllllllIllIIlIlIIllIlllllll) {
        return new File(this.getDataDirectory(), llllllllllllIllIIlIlIIllIlllllll);
    }
    
    protected void setResourcePackFromWorld(final String llllllllllllIllIIlIlIlIIlIIIIlII, final ISaveHandler llllllllllllIllIIlIlIlIIlIIIlIlI) {
        final File llllllllllllIllIIlIlIlIIlIIIlIII = new File(llllllllllllIllIIlIlIlIIlIIIlIlI.getWorldDirectory(), MinecraftServer.llIlllIIIIIlll[MinecraftServer.llIlllIIIlIIII[19]]);
        if (lIIllIIlIIIllIll(llllllllllllIllIIlIlIlIIlIIIlIII.isFile() ? 1 : 0)) {
            this.setResourcePack(String.valueOf(new StringBuilder(MinecraftServer.llIlllIIIIIlll[MinecraftServer.llIlllIIIlIIII[20]]).append(llllllllllllIllIIlIlIlIIlIIIIlII).append(MinecraftServer.llIlllIIIIIlll[MinecraftServer.llIlllIIIlIIII[21]]).append(llllllllllllIllIIlIlIlIIlIIIlIII.getName())), MinecraftServer.llIlllIIIIIlll[MinecraftServer.llIlllIIIlIIII[12]]);
        }
    }
    
    public boolean getForceGamemode() {
        return this.isGamemodeForced;
    }
    
    public String getMinecraftVersion() {
        return MinecraftServer.llIlllIIIIIlll[MinecraftServer.llIlllIIIlIIII[69]];
    }
}
