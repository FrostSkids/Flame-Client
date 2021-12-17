// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.client.renderer.texture;

import java.util.Iterator;
import org.apache.logging.log4j.LogManager;
import java.util.Arrays;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.security.MessageDigest;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import net.minecraft.crash.CrashReportCategory;
import net.minecraft.util.ReportedException;
import java.util.concurrent.Callable;
import net.minecraft.crash.CrashReport;
import java.io.IOException;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import net.minecraft.client.resources.IResourceManager;
import java.util.List;
import org.apache.logging.log4j.Logger;
import net.minecraft.util.ResourceLocation;
import java.util.Map;
import net.minecraft.client.resources.IResourceManagerReloadListener;

public class TextureManager implements IResourceManagerReloadListener, ITickable
{
    private static final /* synthetic */ String[] lIIlIIlIIIlIIl;
    private final /* synthetic */ Map<ResourceLocation, ITextureObject> mapTextureObjects;
    private static final /* synthetic */ Logger logger;
    private final /* synthetic */ Map<String, Integer> mapTextureCounters;
    private static final /* synthetic */ int[] lIIlIIlIIIllII;
    private final /* synthetic */ List<ITickable> listTickables;
    private /* synthetic */ IResourceManager theResourceManager;
    
    private static void llIIllIIIIIlIII() {
        (lIIlIIlIIIlIIl = new String[TextureManager.lIIlIIlIIIllII[6]])[TextureManager.lIIlIIlIIIllII[1]] = llIIllIIIIIIIll("3J2VSuMP1aLZi5UfubVEU+Ts6eRjV5mrAYU7p/iT2+s=", "TovOi");
        TextureManager.lIIlIIlIIIlIIl[TextureManager.lIIlIIlIIIllII[0]] = llIIllIIIIIIIll("SYVRfDdMErt3C8Abizx2Uq/HmXWEITUQ", "AGumz");
        TextureManager.lIIlIIlIIIlIIl[TextureManager.lIIlIIlIIIllII[2]] = llIIllIIIIIIlII("rTDuaynygKMq+Fc5BREDYOZ/mrEo7NMrMQdgyUoeig8vK4WlQVX6YA==", "ThAuG");
        TextureManager.lIIlIIlIIIlIIl[TextureManager.lIIlIIlIIIllII[3]] = llIIllIIIIIIlII("tME+Za9k064gg+ClqneoeBlt/tLtWzn3", "OJiaA");
        TextureManager.lIIlIIlIIIlIIl[TextureManager.lIIlIIlIIIllII[4]] = llIIllIIIIIIlII("6jAjcmnsIv6cqVQwrHafTPvyOvk5ctYe", "YYLqP");
        TextureManager.lIIlIIlIIIlIIl[TextureManager.lIIlIIlIIIllII[5]] = llIIllIIIIIIlll("IAo+NCwtEH9wMhtWNA==", "DsPUA");
    }
    
    public TextureManager(final IResourceManager lllllllllllllIIlllIIIIlllIIIllII) {
        this.mapTextureObjects = (Map<ResourceLocation, ITextureObject>)Maps.newHashMap();
        this.listTickables = (List<ITickable>)Lists.newArrayList();
        this.mapTextureCounters = (Map<String, Integer>)Maps.newHashMap();
        this.theResourceManager = lllllllllllllIIlllIIIIlllIIIllII;
    }
    
    public boolean loadTexture(final ResourceLocation lllllllllllllIIlllIIIIllIllIlllI, ITextureObject lllllllllllllIIlllIIIIllIllIIlII) {
        boolean lllllllllllllIIlllIIIIllIllIllII = TextureManager.lIIlIIlIIIllII[0] != 0;
        try {
            ((ITextureObject)lllllllllllllIIlllIIIIllIllIIlII).loadTexture(this.theResourceManager);
            "".length();
            if ((108 + 151 - 244 + 168 ^ 51 + 126 - 166 + 168) != (137 + 151 - 116 + 9 ^ 6 + 8 + 18 + 145)) {
                return ((111 + 98 - 174 + 154 ^ 8 + 127 - 1 + 5) & (0xF ^ 0x50 ^ (0x38 ^ 0x51) ^ -" ".length())) != 0x0;
            }
        }
        catch (IOException lllllllllllllIIlllIIIIllIllIlIll) {
            TextureManager.logger.warn(String.valueOf(new StringBuilder(TextureManager.lIIlIIlIIIlIIl[TextureManager.lIIlIIlIIIllII[1]]).append(lllllllllllllIIlllIIIIllIllIlllI)), (Throwable)lllllllllllllIIlllIIIIllIllIlIll);
            lllllllllllllIIlllIIIIllIllIIlII = TextureUtil.missingTexture;
            this.mapTextureObjects.put(lllllllllllllIIlllIIIIllIllIlllI, (ITextureObject)lllllllllllllIIlllIIIIllIllIIlII);
            "".length();
            lllllllllllllIIlllIIIIllIllIllII = (TextureManager.lIIlIIlIIIllII[1] != 0);
            "".length();
            if (" ".length() < " ".length()) {
                return ((0xFD ^ 0x81 ^ (0x57 ^ 0x60)) & (0x95 ^ 0x82 ^ (0xF1 ^ 0xAD) ^ -" ".length())) != 0x0;
            }
        }
        catch (Throwable lllllllllllllIIlllIIIIllIllIlIlI) {
            final ITextureObject lllllllllllllIIlllIIIIllIllIlIIl = (ITextureObject)lllllllllllllIIlllIIIIllIllIIlII;
            final CrashReport lllllllllllllIIlllIIIIllIllIlIII = CrashReport.makeCrashReport(lllllllllllllIIlllIIIIllIllIlIlI, TextureManager.lIIlIIlIIIlIIl[TextureManager.lIIlIIlIIIllII[0]]);
            final CrashReportCategory lllllllllllllIIlllIIIIllIllIIlll = lllllllllllllIIlllIIIIllIllIlIII.makeCategory(TextureManager.lIIlIIlIIIlIIl[TextureManager.lIIlIIlIIIllII[2]]);
            lllllllllllllIIlllIIIIllIllIIlll.addCrashSection(TextureManager.lIIlIIlIIIlIIl[TextureManager.lIIlIIlIIIllII[3]], lllllllllllllIIlllIIIIllIllIlllI);
            lllllllllllllIIlllIIIIllIllIIlll.addCrashSectionCallable(TextureManager.lIIlIIlIIIlIIl[TextureManager.lIIlIIlIIIllII[4]], new Callable<String>() {
                @Override
                public String call() throws Exception {
                    return lllllllllllllIIlllIIIIllIllIlIIl.getClass().getName();
                }
            });
            throw new ReportedException(lllllllllllllIIlllIIIIllIllIlIII);
        }
        this.mapTextureObjects.put(lllllllllllllIIlllIIIIllIllIlllI, (ITextureObject)lllllllllllllIIlllIIIIllIllIIlII);
        "".length();
        return lllllllllllllIIlllIIIIllIllIllII;
    }
    
    @Override
    public void onResourceManagerReload(final IResourceManager lllllllllllllIIlllIIIIllIIllIlII) {
        final boolean lllllllllllllIIlllIIIIllIIllIIII = (boolean)this.mapTextureObjects.entrySet().iterator();
        "".length();
        if (" ".length() >= (0x6 ^ 0x2)) {
            return;
        }
        while (!llIIllIIIIlIIII(((Iterator)lllllllllllllIIlllIIIIllIIllIIII).hasNext() ? 1 : 0)) {
            final Map.Entry<ResourceLocation, ITextureObject> lllllllllllllIIlllIIIIllIIllIIll = ((Iterator<Map.Entry<ResourceLocation, ITextureObject>>)lllllllllllllIIlllIIIIllIIllIIII).next();
            this.loadTexture(lllllllllllllIIlllIIIIllIIllIIll.getKey(), lllllllllllllIIlllIIIIllIIllIIll.getValue());
            "".length();
        }
    }
    
    public boolean loadTickableTexture(final ResourceLocation lllllllllllllIIlllIIIIllIllllIIl, final ITickableTextureObject lllllllllllllIIlllIIIIllIllllIll) {
        if (llIIllIIIIIllll(this.loadTexture(lllllllllllllIIlllIIIIllIllllIIl, lllllllllllllIIlllIIIIllIllllIll) ? 1 : 0)) {
            this.listTickables.add(lllllllllllllIIlllIIIIllIllllIll);
            "".length();
            return TextureManager.lIIlIIlIIIllII[0] != 0;
        }
        return TextureManager.lIIlIIlIIIllII[1] != 0;
    }
    
    private static String llIIllIIIIIIlll(String lllllllllllllIIlllIIIIllIIIIIllI, final String lllllllllllllIIlllIIIIllIIIIIlIl) {
        lllllllllllllIIlllIIIIllIIIIIllI = new String(Base64.getDecoder().decode(lllllllllllllIIlllIIIIllIIIIIllI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIIlllIIIIllIIIIlIIl = new StringBuilder();
        final char[] lllllllllllllIIlllIIIIllIIIIlIII = lllllllllllllIIlllIIIIllIIIIIlIl.toCharArray();
        int lllllllllllllIIlllIIIIllIIIIIlll = TextureManager.lIIlIIlIIIllII[1];
        final double lllllllllllllIIlllIIIIllIIIIIIIl = (Object)lllllllllllllIIlllIIIIllIIIIIllI.toCharArray();
        final double lllllllllllllIIlllIIIIllIIIIIIII = lllllllllllllIIlllIIIIllIIIIIIIl.length;
        String lllllllllllllIIlllIIIIlIllllllll = (String)TextureManager.lIIlIIlIIIllII[1];
        while (llIIllIIIIlIIlI((int)lllllllllllllIIlllIIIIlIllllllll, (int)lllllllllllllIIlllIIIIllIIIIIIII)) {
            final char lllllllllllllIIlllIIIIllIIIIllII = lllllllllllllIIlllIIIIllIIIIIIIl[lllllllllllllIIlllIIIIlIllllllll];
            lllllllllllllIIlllIIIIllIIIIlIIl.append((char)(lllllllllllllIIlllIIIIllIIIIllII ^ lllllllllllllIIlllIIIIllIIIIlIII[lllllllllllllIIlllIIIIllIIIIIlll % lllllllllllllIIlllIIIIllIIIIlIII.length]));
            "".length();
            ++lllllllllllllIIlllIIIIllIIIIIlll;
            ++lllllllllllllIIlllIIIIlIllllllll;
            "".length();
            if (" ".length() == 0) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIIlllIIIIllIIIIlIIl);
    }
    
    @Override
    public void tick() {
        final short lllllllllllllIIlllIIIIllIlIIIIlI = (short)this.listTickables.iterator();
        "".length();
        if ("   ".length() < ((0x13 ^ 0x73 ^ (0x98 ^ 0xAD)) & (0xD9 ^ 0x83 ^ (0xBF ^ 0xB0) ^ -" ".length()))) {
            return;
        }
        while (!llIIllIIIIlIIII(((Iterator)lllllllllllllIIlllIIIIllIlIIIIlI).hasNext() ? 1 : 0)) {
            final ITickable lllllllllllllIIlllIIIIllIlIIIlIl = ((Iterator<ITickable>)lllllllllllllIIlllIIIIllIlIIIIlI).next();
            lllllllllllllIIlllIIIIllIlIIIlIl.tick();
        }
    }
    
    private static boolean llIIllIIIIlIIII(final int lllllllllllllIIlllIIIIlIllllIIlI) {
        return lllllllllllllIIlllIIIIlIllllIIlI == 0;
    }
    
    public ResourceLocation getDynamicTextureLocation(final String lllllllllllllIIlllIIIIllIlIlIIlI, final DynamicTexture lllllllllllllIIlllIIIIllIlIIllII) {
        Integer lllllllllllllIIlllIIIIllIlIlIIII = this.mapTextureCounters.get(lllllllllllllIIlllIIIIllIlIlIIlI);
        if (llIIllIIIIIlllI(lllllllllllllIIlllIIIIllIlIlIIII)) {
            lllllllllllllIIlllIIIIllIlIlIIII = TextureManager.lIIlIIlIIIllII[0];
            "".length();
            if (((0xBA ^ 0xB3) & ~(0x47 ^ 0x4E)) != 0x0) {
                return null;
            }
        }
        else {
            lllllllllllllIIlllIIIIllIlIlIIII += TextureManager.lIIlIIlIIIllII[0];
        }
        this.mapTextureCounters.put(lllllllllllllIIlllIIIIllIlIlIIlI, lllllllllllllIIlllIIIIllIlIlIIII);
        "".length();
        final String format = TextureManager.lIIlIIlIIIlIIl[TextureManager.lIIlIIlIIIllII[5]];
        final Object[] args = new Object[TextureManager.lIIlIIlIIIllII[2]];
        args[TextureManager.lIIlIIlIIIllII[1]] = lllllllllllllIIlllIIIIllIlIlIIlI;
        args[TextureManager.lIIlIIlIIIllII[0]] = lllllllllllllIIlllIIIIllIlIlIIII;
        final ResourceLocation lllllllllllllIIlllIIIIllIlIIllll = new ResourceLocation(String.format(format, args));
        this.loadTexture(lllllllllllllIIlllIIIIllIlIIllll, lllllllllllllIIlllIIIIllIlIIllII);
        "".length();
        return lllllllllllllIIlllIIIIllIlIIllll;
    }
    
    private static String llIIllIIIIIIlII(final String lllllllllllllIIlllIIIIllIIIllIIl, final String lllllllllllllIIlllIIIIllIIIllIlI) {
        try {
            final SecretKeySpec lllllllllllllIIlllIIIIllIIIllllI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIIlllIIIIllIIIllIlI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lllllllllllllIIlllIIIIllIIIlllIl = Cipher.getInstance("Blowfish");
            lllllllllllllIIlllIIIIllIIIlllIl.init(TextureManager.lIIlIIlIIIllII[2], lllllllllllllIIlllIIIIllIIIllllI);
            return new String(lllllllllllllIIlllIIIIllIIIlllIl.doFinal(Base64.getDecoder().decode(lllllllllllllIIlllIIIIllIIIllIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIlllIIIIllIIIlllII) {
            lllllllllllllIIlllIIIIllIIIlllII.printStackTrace();
            return null;
        }
    }
    
    public ITextureObject getTexture(final ResourceLocation lllllllllllllIIlllIIIIllIlIllIIl) {
        return this.mapTextureObjects.get(lllllllllllllIIlllIIIIllIlIllIIl);
    }
    
    private static String llIIllIIIIIIIll(final String lllllllllllllIIlllIIIIllIIlIlIII, final String lllllllllllllIIlllIIIIllIIlIIlIl) {
        try {
            final SecretKeySpec lllllllllllllIIlllIIIIllIIlIlIll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIIlllIIIIllIIlIIlIl.getBytes(StandardCharsets.UTF_8)), TextureManager.lIIlIIlIIIllII[7]), "DES");
            final Cipher lllllllllllllIIlllIIIIllIIlIlIlI = Cipher.getInstance("DES");
            lllllllllllllIIlllIIIIllIIlIlIlI.init(TextureManager.lIIlIIlIIIllII[2], lllllllllllllIIlllIIIIllIIlIlIll);
            return new String(lllllllllllllIIlllIIIIllIIlIlIlI.doFinal(Base64.getDecoder().decode(lllllllllllllIIlllIIIIllIIlIlIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIlllIIIIllIIlIlIIl) {
            lllllllllllllIIlllIIIIllIIlIlIIl.printStackTrace();
            return null;
        }
    }
    
    private static boolean llIIllIIIIIllll(final int lllllllllllllIIlllIIIIlIllllIlII) {
        return lllllllllllllIIlllIIIIlIllllIlII != 0;
    }
    
    public void bindTexture(final ResourceLocation lllllllllllllIIlllIIIIlllIIIIIlI) {
        ITextureObject lllllllllllllIIlllIIIIlllIIIIlII = this.mapTextureObjects.get(lllllllllllllIIlllIIIIlllIIIIIlI);
        if (llIIllIIIIIlllI(lllllllllllllIIlllIIIIlllIIIIlII)) {
            lllllllllllllIIlllIIIIlllIIIIlII = new SimpleTexture(lllllllllllllIIlllIIIIlllIIIIIlI);
            this.loadTexture(lllllllllllllIIlllIIIIlllIIIIIlI, lllllllllllllIIlllIIIIlllIIIIlII);
            "".length();
        }
        TextureUtil.bindTexture(lllllllllllllIIlllIIIIlllIIIIlII.getGlTextureId());
    }
    
    static {
        llIIllIIIIIllIl();
        llIIllIIIIIlIII();
        logger = LogManager.getLogger();
    }
    
    private static boolean llIIllIIIIlIIlI(final int lllllllllllllIIlllIIIIlIlllllIll, final int lllllllllllllIIlllIIIIlIlllllIlI) {
        return lllllllllllllIIlllIIIIlIlllllIll < lllllllllllllIIlllIIIIlIlllllIlI;
    }
    
    private static boolean llIIllIIIIlIIIl(final Object lllllllllllllIIlllIIIIlIlllllIII) {
        return lllllllllllllIIlllIIIIlIlllllIII != null;
    }
    
    private static boolean llIIllIIIIIlllI(final Object lllllllllllllIIlllIIIIlIllllIllI) {
        return lllllllllllllIIlllIIIIlIllllIllI == null;
    }
    
    private static void llIIllIIIIIllIl() {
        (lIIlIIlIIIllII = new int[8])[0] = " ".length();
        TextureManager.lIIlIIlIIIllII[1] = ((0x4D ^ 0xD) & ~(0x29 ^ 0x69));
        TextureManager.lIIlIIlIIIllII[2] = "  ".length();
        TextureManager.lIIlIIlIIIllII[3] = "   ".length();
        TextureManager.lIIlIIlIIIllII[4] = (0xDB ^ 0x8A ^ (0x41 ^ 0x14));
        TextureManager.lIIlIIlIIIllII[5] = (30 + 39 + 44 + 17 ^ 4 + 16 - 8 + 123);
        TextureManager.lIIlIIlIIIllII[6] = (0x6B ^ 0x79 ^ (0x95 ^ 0x81));
        TextureManager.lIIlIIlIIIllII[7] = (0x5A ^ 0x22 ^ (0xE2 ^ 0x92));
    }
    
    public void deleteTexture(final ResourceLocation lllllllllllllIIlllIIIIllIIllllIl) {
        final ITextureObject lllllllllllllIIlllIIIIllIIllllII = this.getTexture(lllllllllllllIIlllIIIIllIIllllIl);
        if (llIIllIIIIlIIIl(lllllllllllllIIlllIIIIllIIllllII)) {
            TextureUtil.deleteTexture(lllllllllllllIIlllIIIIllIIllllII.getGlTextureId());
        }
    }
}
