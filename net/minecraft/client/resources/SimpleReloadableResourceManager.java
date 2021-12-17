// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.client.resources;

import java.util.Iterator;
import com.google.common.collect.Iterables;
import com.google.common.base.Function;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import org.apache.logging.log4j.LogManager;
import java.io.IOException;
import java.io.FileNotFoundException;
import net.minecraft.util.ResourceLocation;
import com.google.common.collect.Sets;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.base.Joiner;
import net.minecraft.client.resources.data.IMetadataSerializer;
import java.util.List;
import java.util.Set;
import org.apache.logging.log4j.Logger;
import java.util.Map;

public class SimpleReloadableResourceManager implements IReloadableResourceManager
{
    private static final /* synthetic */ String[] llIlIIIlllIllI;
    private final /* synthetic */ Map<String, FallbackResourceManager> domainResourceManagers;
    private static final /* synthetic */ Logger logger;
    private static final /* synthetic */ int[] llIlIIIllllIII;
    private final /* synthetic */ Set<String> setResourceDomains;
    private final /* synthetic */ List<IResourceManagerReloadListener> reloadListeners;
    private final /* synthetic */ IMetadataSerializer rmMetadataSerializer;
    private static final /* synthetic */ Joiner joinerResourcePacks;
    
    public SimpleReloadableResourceManager(final IMetadataSerializer llllllllllllIllIllIIlIlIllIIlllI) {
        this.domainResourceManagers = (Map<String, FallbackResourceManager>)Maps.newHashMap();
        this.reloadListeners = (List<IResourceManagerReloadListener>)Lists.newArrayList();
        this.setResourceDomains = (Set<String>)Sets.newLinkedHashSet();
        this.rmMetadataSerializer = llllllllllllIllIllIIlIlIllIIlllI;
    }
    
    @Override
    public IResource getResource(final ResourceLocation llllllllllllIllIllIIlIlIlIlllIII) throws IOException {
        final IResourceManager llllllllllllIllIllIIlIlIlIllIlll = this.domainResourceManagers.get(llllllllllllIllIllIIlIlIlIlllIII.getResourceDomain());
        if (lIIlIIlIIIllIIll(llllllllllllIllIllIIlIlIlIllIlll)) {
            return llllllllllllIllIllIIlIlIlIllIlll.getResource(llllllllllllIllIllIIlIlIlIlllIII);
        }
        throw new FileNotFoundException(llllllllllllIllIllIIlIlIlIlllIII.toString());
    }
    
    @Override
    public void registerReloadListener(final IResourceManagerReloadListener llllllllllllIllIllIIlIlIlIIlIlll) {
        this.reloadListeners.add(llllllllllllIllIllIIlIlIlIIlIlll);
        "".length();
        llllllllllllIllIllIIlIlIlIIlIlll.onResourceManagerReload(this);
    }
    
    private static boolean lIIlIIlIIIllIIlI(final int llllllllllllIllIllIIlIlIIllIllll) {
        return llllllllllllIllIllIIlIlIIllIllll == 0;
    }
    
    private static boolean lIIlIIlIIIllIIll(final Object llllllllllllIllIllIIlIlIIlllIIll) {
        return llllllllllllIllIllIIlIlIIlllIIll != null;
    }
    
    @Override
    public List<IResource> getAllResources(final ResourceLocation llllllllllllIllIllIIlIlIlIlIllII) throws IOException {
        final IResourceManager llllllllllllIllIllIIlIlIlIlIlllI = this.domainResourceManagers.get(llllllllllllIllIllIIlIlIlIlIllII.getResourceDomain());
        if (lIIlIIlIIIllIIll(llllllllllllIllIllIIlIlIlIlIlllI)) {
            return llllllllllllIllIllIIlIlIlIlIlllI.getAllResources(llllllllllllIllIllIIlIlIlIlIllII);
        }
        throw new FileNotFoundException(llllllllllllIllIllIIlIlIlIlIllII.toString());
    }
    
    private void notifyReloadListeners() {
        final long llllllllllllIllIllIIlIlIlIIIllll = (long)this.reloadListeners.iterator();
        "".length();
        if ("  ".length() == ((0x2C ^ 0x2B) & ~(0xBF ^ 0xB8))) {
            return;
        }
        while (!lIIlIIlIIIllIIlI(((Iterator)llllllllllllIllIllIIlIlIlIIIllll).hasNext() ? 1 : 0)) {
            final IResourceManagerReloadListener llllllllllllIllIllIIlIlIlIIlIIlI = ((Iterator<IResourceManagerReloadListener>)llllllllllllIllIllIIlIlIlIIIllll).next();
            llllllllllllIllIllIIlIlIlIIlIIlI.onResourceManagerReload(this);
        }
    }
    
    private static void lIIlIIlIIIllIIII() {
        (llIlIIIllllIII = new int[4])[0] = ((0x73 ^ 0x6A) & ~(0xDC ^ 0xC5));
        SimpleReloadableResourceManager.llIlIIIllllIII[1] = " ".length();
        SimpleReloadableResourceManager.llIlIIIllllIII[2] = "  ".length();
        SimpleReloadableResourceManager.llIlIIIllllIII[3] = (0xC8 ^ 0xAA ^ (0x72 ^ 0x18));
    }
    
    @Override
    public Set<String> getResourceDomains() {
        return this.setResourceDomains;
    }
    
    static {
        lIIlIIlIIIllIIII();
        lIIlIIlIIIlIllII();
        logger = LogManager.getLogger();
        joinerResourcePacks = Joiner.on(SimpleReloadableResourceManager.llIlIIIlllIllI[SimpleReloadableResourceManager.llIlIIIllllIII[0]]);
    }
    
    public void reloadResourcePack(final IResourcePack llllllllllllIllIllIIlIlIllIIIIll) {
        final char llllllllllllIllIllIIlIlIllIIIIIl = (char)llllllllllllIllIllIIlIlIllIIIIll.getResourceDomains().iterator();
        "".length();
        if (" ".length() == (0xB2 ^ 0xB6)) {
            return;
        }
        while (!lIIlIIlIIIllIIlI(((Iterator)llllllllllllIllIllIIlIlIllIIIIIl).hasNext() ? 1 : 0)) {
            final String llllllllllllIllIllIIlIlIllIIIllI = ((Iterator<String>)llllllllllllIllIllIIlIlIllIIIIIl).next();
            this.setResourceDomains.add(llllllllllllIllIllIIlIlIllIIIllI);
            "".length();
            FallbackResourceManager llllllllllllIllIllIIlIlIllIIIlIl = this.domainResourceManagers.get(llllllllllllIllIllIIlIlIllIIIllI);
            if (lIIlIIlIIIllIIIl(llllllllllllIllIllIIlIlIllIIIlIl)) {
                llllllllllllIllIllIIlIlIllIIIlIl = new FallbackResourceManager(this.rmMetadataSerializer);
                this.domainResourceManagers.put(llllllllllllIllIllIIlIlIllIIIllI, llllllllllllIllIllIIlIlIllIIIlIl);
                "".length();
            }
            llllllllllllIllIllIIlIlIllIIIlIl.addResourcePack(llllllllllllIllIllIIlIlIllIIIIll);
        }
    }
    
    private static boolean lIIlIIlIIIllIIIl(final Object llllllllllllIllIllIIlIlIIlllIIIl) {
        return llllllllllllIllIllIIlIlIIlllIIIl == null;
    }
    
    private static String lIIlIIlIIIlIlIll(final String llllllllllllIllIllIIlIlIlIIIIlIl, final String llllllllllllIllIllIIlIlIlIIIIllI) {
        try {
            final SecretKeySpec llllllllllllIllIllIIlIlIlIIIlIlI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIllIllIIlIlIlIIIIllI.getBytes(StandardCharsets.UTF_8)), SimpleReloadableResourceManager.llIlIIIllllIII[3]), "DES");
            final Cipher llllllllllllIllIllIIlIlIlIIIlIIl = Cipher.getInstance("DES");
            llllllllllllIllIllIIlIlIlIIIlIIl.init(SimpleReloadableResourceManager.llIlIIIllllIII[2], llllllllllllIllIllIIlIlIlIIIlIlI);
            return new String(llllllllllllIllIllIIlIlIlIIIlIIl.doFinal(Base64.getDecoder().decode(llllllllllllIllIllIIlIlIlIIIIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIllIllIIlIlIlIIIlIII) {
            llllllllllllIllIllIIlIlIlIIIlIII.printStackTrace();
            return null;
        }
    }
    
    private static void lIIlIIlIIIlIllII() {
        (llIlIIIlllIllI = new String[SimpleReloadableResourceManager.llIlIIIllllIII[2]])[SimpleReloadableResourceManager.llIlIIIllllIII[0]] = lIIlIIlIIIlIlIlI("nLPvKPakM4g=", "tVydU");
        SimpleReloadableResourceManager.llIlIIIlllIllI[SimpleReloadableResourceManager.llIlIIIllllIII[1]] = lIIlIIlIIIlIlIll("aSsR7QCxw7w5cWyq6xkFTG2+jthxFcIMqm3WX7FoqjE=", "pFQDI");
    }
    
    @Override
    public void reloadResources(final List<IResourcePack> llllllllllllIllIllIIlIlIlIlIIIlI) {
        this.clearResources();
        SimpleReloadableResourceManager.logger.info(String.valueOf(new StringBuilder(SimpleReloadableResourceManager.llIlIIIlllIllI[SimpleReloadableResourceManager.llIlIIIllllIII[1]]).append(SimpleReloadableResourceManager.joinerResourcePacks.join(Iterables.transform((Iterable)llllllllllllIllIllIIlIlIlIlIIIlI, (Function)new Function<IResourcePack, String>() {
            public String apply(final IResourcePack lllllllllllllIIIIlIIlIIIIIIllIll) {
                return lllllllllllllIIIIlIIlIIIIIIllIll.getPackName();
            }
        })))));
        final byte llllllllllllIllIllIIlIlIlIIlllIl = (byte)llllllllllllIllIllIIlIlIlIlIIIlI.iterator();
        "".length();
        if ((0xAC ^ 0xA8) < (0x1F ^ 0x1B)) {
            return;
        }
        while (!lIIlIIlIIIllIIlI(((Iterator)llllllllllllIllIllIIlIlIlIIlllIl).hasNext() ? 1 : 0)) {
            final IResourcePack llllllllllllIllIllIIlIlIlIlIIIIl = ((Iterator<IResourcePack>)llllllllllllIllIllIIlIlIlIIlllIl).next();
            this.reloadResourcePack(llllllllllllIllIllIIlIlIlIlIIIIl);
        }
        this.notifyReloadListeners();
    }
    
    private void clearResources() {
        this.domainResourceManagers.clear();
        this.setResourceDomains.clear();
    }
    
    private static String lIIlIIlIIIlIlIlI(final String llllllllllllIllIllIIlIlIIllllIII, final String llllllllllllIllIllIIlIlIIllllIIl) {
        try {
            final SecretKeySpec llllllllllllIllIllIIlIlIIlllllIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIllIllIIlIlIIllllIIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher llllllllllllIllIllIIlIlIIlllllII = Cipher.getInstance("Blowfish");
            llllllllllllIllIllIIlIlIIlllllII.init(SimpleReloadableResourceManager.llIlIIIllllIII[2], llllllllllllIllIllIIlIlIIlllllIl);
            return new String(llllllllllllIllIllIIlIlIIlllllII.doFinal(Base64.getDecoder().decode(llllllllllllIllIllIIlIlIIllllIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIllIllIIlIlIIllllIll) {
            llllllllllllIllIllIIlIlIIllllIll.printStackTrace();
            return null;
        }
    }
}
