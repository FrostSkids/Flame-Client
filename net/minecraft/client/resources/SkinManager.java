// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.client.resources;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.LinkedBlockingQueue;
import com.google.common.cache.CacheLoader;
import java.util.concurrent.TimeUnit;
import com.google.common.cache.CacheBuilder;
import com.google.common.collect.Multimap;
import net.minecraft.client.Minecraft;
import com.mojang.authlib.minecraft.InsecureTextureException;
import com.google.common.collect.Maps;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import net.minecraft.client.renderer.texture.ITextureObject;
import net.minecraft.client.renderer.ThreadDownloadImageData;
import java.awt.image.BufferedImage;
import net.minecraft.client.renderer.IImageBuffer;
import net.minecraft.client.renderer.ImageBufferDownload;
import net.minecraft.util.ResourceLocation;
import com.mojang.authlib.minecraft.MinecraftSessionService;
import com.mojang.authlib.minecraft.MinecraftProfileTexture;
import java.util.Map;
import com.mojang.authlib.GameProfile;
import com.google.common.cache.LoadingCache;
import net.minecraft.client.renderer.texture.TextureManager;
import java.io.File;
import java.util.concurrent.ExecutorService;

public class SkinManager
{
    private static final /* synthetic */ ExecutorService THREAD_POOL;
    private static final /* synthetic */ int[] llIllIIlIlllII;
    private static final /* synthetic */ String[] llIllIIlIllIll;
    private final /* synthetic */ File skinCacheDir;
    private final /* synthetic */ TextureManager textureManager;
    private final /* synthetic */ LoadingCache<GameProfile, Map<MinecraftProfileTexture.Type, MinecraftProfileTexture>> skinCacheLoader;
    private final /* synthetic */ MinecraftSessionService sessionService;
    
    private static boolean lIIlIlllIIIIIIlI(final int llllllllllllIllIIllllIlIIIIlIIII, final int llllllllllllIllIIllllIlIIIIIllll) {
        return llllllllllllIllIIllllIlIIIIlIIII > llllllllllllIllIIllllIlIIIIIllll;
    }
    
    public Map<MinecraftProfileTexture.Type, MinecraftProfileTexture> loadSkinFromCache(final GameProfile llllllllllllIllIIllllIlIIIlIIlII) {
        return (Map<MinecraftProfileTexture.Type, MinecraftProfileTexture>)this.skinCacheLoader.getUnchecked((Object)llllllllllllIllIIllllIlIIIlIIlII);
    }
    
    private static boolean lIIlIlllIIIIIIll(final Object llllllllllllIllIIllllIlIIIIIlIlI, final Object llllllllllllIllIIllllIlIIIIIlIIl) {
        return llllllllllllIllIIllllIlIIIIIlIlI == llllllllllllIllIIllllIlIIIIIlIIl;
    }
    
    public ResourceLocation loadSkin(final MinecraftProfileTexture llllllllllllIllIIllllIlIIlIIIllI, final MinecraftProfileTexture.Type llllllllllllIllIIllllIlIIlIIIlIl, final SkinAvailableCallback llllllllllllIllIIllllIlIIlIIIlII) {
        final ResourceLocation llllllllllllIllIIllllIlIIlIIIIll = new ResourceLocation(String.valueOf(new StringBuilder(SkinManager.llIllIIlIllIll[SkinManager.llIllIIlIlllII[0]]).append(llllllllllllIllIIllllIlIIlIIIllI.getHash())));
        final ITextureObject llllllllllllIllIIllllIlIIlIIIIlI = this.textureManager.getTexture(llllllllllllIllIIllllIlIIlIIIIll);
        if (lIIlIlllIIIIIIIl(llllllllllllIllIIllllIlIIlIIIIlI)) {
            if (lIIlIlllIIIIIIIl(llllllllllllIllIIllllIlIIlIIIlII)) {
                llllllllllllIllIIllllIlIIlIIIlII.skinAvailable(llllllllllllIllIIllllIlIIlIIIlIl, llllllllllllIllIIllllIlIIlIIIIll, llllllllllllIllIIllllIlIIlIIIllI);
                "".length();
                if (((0x5 ^ 0x36) & ~(0x5D ^ 0x6E)) < 0) {
                    return null;
                }
            }
        }
        else {
            final File skinCacheDir = this.skinCacheDir;
            String substring;
            if (lIIlIlllIIIIIIlI(llllllllllllIllIIllllIlIIlIIIllI.getHash().length(), SkinManager.llIllIIlIlllII[1])) {
                substring = llllllllllllIllIIllllIlIIlIIIllI.getHash().substring(SkinManager.llIllIIlIlllII[0], SkinManager.llIllIIlIlllII[1]);
                "".length();
                if ("  ".length() <= 0) {
                    return null;
                }
            }
            else {
                substring = SkinManager.llIllIIlIllIll[SkinManager.llIllIIlIlllII[2]];
            }
            final File llllllllllllIllIIllllIlIIlIIIIIl = new File(skinCacheDir, substring);
            final File llllllllllllIllIIllllIlIIlIIIIII = new File(llllllllllllIllIIllllIlIIlIIIIIl, llllllllllllIllIIllllIlIIlIIIllI.getHash());
            IImageBuffer imageBuffer;
            if (lIIlIlllIIIIIIll(llllllllllllIllIIllllIlIIlIIIlIl, MinecraftProfileTexture.Type.SKIN)) {
                imageBuffer = new ImageBufferDownload();
                "".length();
                if ((0xA ^ 0xF) <= 0) {
                    return null;
                }
            }
            else {
                imageBuffer = null;
            }
            final IImageBuffer llllllllllllIllIIllllIlIIIllllll = imageBuffer;
            final ThreadDownloadImageData llllllllllllIllIIllllIlIIIlllllI = new ThreadDownloadImageData(llllllllllllIllIIllllIlIIlIIIIII, llllllllllllIllIIllllIlIIlIIIllI.getUrl(), DefaultPlayerSkin.getDefaultSkinLegacy(), new IImageBuffer() {
                private static boolean lIIIIlllIIlllIll(final Object llllllllllllIlllIllllIIlIIllIlll) {
                    return llllllllllllIlllIllllIIlIIllIlll != null;
                }
                
                @Override
                public void skinAvailable() {
                    if (lIIIIlllIIlllIll(llllllllllllIllIIllllIlIIIllllll)) {
                        llllllllllllIllIIllllIlIIIllllll.skinAvailable();
                    }
                    if (lIIIIlllIIlllIll(llllllllllllIllIIllllIlIIlIIIlII)) {
                        llllllllllllIllIIllllIlIIlIIIlII.skinAvailable(llllllllllllIllIIllllIlIIlIIIlIl, llllllllllllIllIIllllIlIIlIIIIll, llllllllllllIllIIllllIlIIlIIIllI);
                    }
                }
                
                @Override
                public BufferedImage parseUserSkin(BufferedImage llllllllllllIlllIllllIIlIIllllII) {
                    if (lIIIIlllIIlllIll(llllllllllllIllIIllllIlIIIllllll)) {
                        llllllllllllIlllIllllIIlIIllllII = llllllllllllIllIIllllIlIIIllllll.parseUserSkin((BufferedImage)llllllllllllIlllIllllIIlIIllllII);
                    }
                    return (BufferedImage)llllllllllllIlllIllllIIlIIllllII;
                }
            });
            this.textureManager.loadTexture(llllllllllllIllIIllllIlIIlIIIIll, llllllllllllIllIIllllIlIIIlllllI);
            "".length();
        }
        return llllllllllllIllIIllllIlIIlIIIIll;
    }
    
    private static String lIIlIllIllllllII(final String llllllllllllIllIIllllIlIIIIlIllI, final String llllllllllllIllIIllllIlIIIIlIlIl) {
        try {
            final SecretKeySpec llllllllllllIllIIllllIlIIIIllIll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIllIIllllIlIIIIlIlIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher llllllllllllIllIIllllIlIIIIllIlI = Cipher.getInstance("Blowfish");
            llllllllllllIllIIllllIlIIIIllIlI.init(SkinManager.llIllIIlIlllII[1], llllllllllllIllIIllllIlIIIIllIll);
            return new String(llllllllllllIllIIllllIlIIIIllIlI.doFinal(Base64.getDecoder().decode(llllllllllllIllIIllllIlIIIIlIllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIllIIllllIlIIIIllIIl) {
            llllllllllllIllIIllllIlIIIIllIIl.printStackTrace();
            return null;
        }
    }
    
    public void loadProfileTextures(final GameProfile llllllllllllIllIIllllIlIIIlIlIlI, final SkinAvailableCallback llllllllllllIllIIllllIlIIIlIlIIl, final boolean llllllllllllIllIIllllIlIIIlIlIII) {
        SkinManager.THREAD_POOL.submit(new Runnable() {
            private static final /* synthetic */ int[] lIlIIIllllIIll;
            
            private static void lllIIlIIIIlIlll() {
                (lIlIIIllllIIll = new int[1])[0] = ((0x31 ^ 0x37) & ~(0x8C ^ 0x8A));
            }
            
            private static boolean lllIIlIIIIllIII(final int lllllllllllllIIIlllIlllIlIIlllll) {
                return lllllllllllllIIIlllIlllIlIIlllll != 0;
            }
            
            static {
                lllIIlIIIIlIlll();
            }
            
            @Override
            public void run() {
                final Map<MinecraftProfileTexture.Type, MinecraftProfileTexture> lllllllllllllIIIlllIlllIlIlIIllI = (Map<MinecraftProfileTexture.Type, MinecraftProfileTexture>)Maps.newHashMap();
                try {
                    lllllllllllllIIIlllIlllIlIlIIllI.putAll(SkinManager.this.sessionService.getTextures(llllllllllllIllIIllllIlIIIlIlIlI, llllllllllllIllIIllllIlIIIlIlIII));
                    "".length();
                    if ("   ".length() < 0) {
                        return;
                    }
                }
                catch (InsecureTextureException ex) {}
                if (lllIIlIIIIllIII(lllllllllllllIIIlllIlllIlIlIIllI.isEmpty() ? 1 : 0) && lllIIlIIIIllIII(llllllllllllIllIIllllIlIIIlIlIlI.getId().equals(Minecraft.getMinecraft().getSession().getProfile().getId()) ? 1 : 0)) {
                    llllllllllllIllIIllllIlIIIlIlIlI.getProperties().clear();
                    llllllllllllIllIIllllIlIIIlIlIlI.getProperties().putAll((Multimap)Minecraft.getMinecraft().func_181037_M());
                    "".length();
                    lllllllllllllIIIlllIlllIlIlIIllI.putAll(SkinManager.this.sessionService.getTextures(llllllllllllIllIIllllIlIIIlIlIlI, (boolean)(SkinManager$3.lIlIIIllllIIll[0] != 0)));
                }
                Minecraft.getMinecraft().addScheduledTask(new Runnable() {
                    private static boolean lIIlIlIIIllIlIlI(final int llllllllllllIllIlIlIIlIIllIIIlIl) {
                        return llllllllllllIllIlIlIIlIIllIIIlIl != 0;
                    }
                    
                    @Override
                    public void run() {
                        if (lIIlIlIIIllIlIlI(lllllllllllllIIIlllIlllIlIlIIllI.containsKey(MinecraftProfileTexture.Type.SKIN) ? 1 : 0)) {
                            SkinManager.this.loadSkin(lllllllllllllIIIlllIlllIlIlIIllI.get(MinecraftProfileTexture.Type.SKIN), MinecraftProfileTexture.Type.SKIN, llllllllllllIllIIllllIlIIIlIlIIl);
                            "".length();
                        }
                        if (lIIlIlIIIllIlIlI(lllllllllllllIIIlllIlllIlIlIIllI.containsKey(MinecraftProfileTexture.Type.CAPE) ? 1 : 0)) {
                            SkinManager.this.loadSkin(lllllllllllllIIIlllIlllIlIlIIllI.get(MinecraftProfileTexture.Type.CAPE), MinecraftProfileTexture.Type.CAPE, llllllllllllIllIIllllIlIIIlIlIIl);
                            "".length();
                        }
                    }
                });
                "".length();
            }
        });
        "".length();
    }
    
    public SkinManager(final TextureManager llllllllllllIllIIllllIlIIllIIIIl, final File llllllllllllIllIIllllIlIIllIIIII, final MinecraftSessionService llllllllllllIllIIllllIlIIlIllIll) {
        this.textureManager = llllllllllllIllIIllllIlIIllIIIIl;
        this.skinCacheDir = llllllllllllIllIIllllIlIIllIIIII;
        this.sessionService = llllllllllllIllIIllllIlIIlIllIll;
        this.skinCacheLoader = (LoadingCache<GameProfile, Map<MinecraftProfileTexture.Type, MinecraftProfileTexture>>)CacheBuilder.newBuilder().expireAfterAccess(15L, TimeUnit.SECONDS).build((CacheLoader)new CacheLoader<GameProfile, Map<MinecraftProfileTexture.Type, MinecraftProfileTexture>>() {
            private static final /* synthetic */ int[] llIIIlIllIllll;
            
            private static void lIIIlIIllIllIIIl() {
                (llIIIlIllIllll = new int[1])[0] = ((0xF9 ^ 0xAC) & ~(0x1A ^ 0x4F));
            }
            
            public Map<MinecraftProfileTexture.Type, MinecraftProfileTexture> load(final GameProfile llllllllllllIlllIlIlIlIIlllIIllI) throws Exception {
                return (Map<MinecraftProfileTexture.Type, MinecraftProfileTexture>)Minecraft.getMinecraft().getSessionService().getTextures(llllllllllllIlllIlIlIlIIlllIIllI, (boolean)(SkinManager$1.llIIIlIllIllll[0] != 0));
            }
            
            static {
                lIIIlIIllIllIIIl();
            }
        });
    }
    
    private static boolean lIIlIlllIIIIIIIl(final Object llllllllllllIllIIllllIlIIIIIllIl) {
        return llllllllllllIllIIllllIlIIIIIllIl != null;
    }
    
    static {
        lIIlIlllIIIIIIII();
        lIIlIllIllllllIl();
        THREAD_POOL = new ThreadPoolExecutor(SkinManager.llIllIIlIlllII[0], SkinManager.llIllIIlIlllII[1], 1L, TimeUnit.MINUTES, new LinkedBlockingQueue<Runnable>());
    }
    
    public ResourceLocation loadSkin(final MinecraftProfileTexture llllllllllllIllIIllllIlIIlIlIllI, final MinecraftProfileTexture.Type llllllllllllIllIIllllIlIIlIlIIlI) {
        return this.loadSkin(llllllllllllIllIIllllIlIIlIlIllI, llllllllllllIllIIllllIlIIlIlIIlI, null);
    }
    
    private static void lIIlIllIllllllIl() {
        (llIllIIlIllIll = new String[SkinManager.llIllIIlIlllII[1]])[SkinManager.llIllIIlIlllII[0]] = lIIlIllIllllllII("ffeuaG8mvdg=", "EPgUa");
        SkinManager.llIllIIlIllIll[SkinManager.llIllIIlIlllII[2]] = lIIlIllIllllllII("dyKVmV0Txyg=", "OKCji");
    }
    
    private static void lIIlIlllIIIIIIII() {
        (llIllIIlIlllII = new int[3])[0] = ((0x33 ^ 0x6B) & ~(0x34 ^ 0x6C));
        SkinManager.llIllIIlIlllII[1] = "  ".length();
        SkinManager.llIllIIlIlllII[2] = " ".length();
    }
    
    public interface SkinAvailableCallback
    {
        void skinAvailable(final MinecraftProfileTexture.Type p0, final ResourceLocation p1, final MinecraftProfileTexture p2);
    }
}
