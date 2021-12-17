// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.client.resources;

import org.apache.commons.io.IOUtils;
import java.io.Closeable;
import net.minecraft.client.renderer.texture.DynamicTexture;
import net.minecraft.client.renderer.texture.TextureManager;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.util.ResourceLocation;
import java.awt.image.BufferedImage;
import net.minecraft.client.resources.data.PackMetadataSection;
import java.util.Comparator;
import org.apache.commons.io.comparator.LastModifiedFileComparator;
import org.apache.commons.io.filefilter.IOFileFilter;
import org.apache.commons.io.filefilter.TrueFileFilter;
import java.util.Map;
import com.google.common.util.concurrent.FutureCallback;
import net.minecraft.util.IProgressUpdate;
import net.minecraft.util.HttpUtil;
import com.google.common.util.concurrent.SettableFuture;
import java.util.concurrent.Future;
import com.google.common.util.concurrent.Futures;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiScreenWorking;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import com.google.common.io.Files;
import com.google.common.hash.Hashing;
import org.apache.logging.log4j.LogManager;
import java.util.Collection;
import com.google.common.collect.ImmutableList;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.security.MessageDigest;
import java.util.Iterator;
import com.google.common.collect.Lists;
import net.minecraft.client.settings.GameSettings;
import java.util.Collections;
import java.util.Arrays;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.io.FileFilter;
import java.util.List;
import org.apache.logging.log4j.Logger;
import java.util.concurrent.locks.ReentrantLock;
import java.io.File;
import com.google.common.util.concurrent.ListenableFuture;
import net.minecraft.client.resources.data.IMetadataSerializer;

public class ResourcePackRepository
{
    public final /* synthetic */ IMetadataSerializer rprMetadataSerializer;
    private /* synthetic */ ListenableFuture<Object> field_177322_i;
    private static final /* synthetic */ int[] lIlIllllIIIlII;
    private final /* synthetic */ File dirResourcepacks;
    private final /* synthetic */ ReentrantLock lock;
    private static final /* synthetic */ Logger logger;
    private /* synthetic */ IResourcePack resourcePackInstance;
    private /* synthetic */ List<Entry> repositoryEntries;
    private final /* synthetic */ File dirServerResourcepacks;
    public final /* synthetic */ IResourcePack rprDefaultResourcePack;
    private static final /* synthetic */ FileFilter resourcePackFilter;
    private static final /* synthetic */ String[] lIlIllllIIIIll;
    private /* synthetic */ List<Entry> repositoryEntriesAll;
    
    private static String llllIlIIIllIIII(String lllllllllllllIIIIlIlIlIIIlIlllll, final String lllllllllllllIIIIlIlIlIIIlIllllI) {
        lllllllllllllIIIIlIlIlIIIlIlllll = (boolean)new String(Base64.getDecoder().decode(((String)lllllllllllllIIIIlIlIlIIIlIlllll).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIIIIlIlIlIIIllIIIlI = new StringBuilder();
        final char[] lllllllllllllIIIIlIlIlIIIllIIIIl = lllllllllllllIIIIlIlIlIIIlIllllI.toCharArray();
        int lllllllllllllIIIIlIlIlIIIllIIIII = ResourcePackRepository.lIlIllllIIIlII[1];
        final double lllllllllllllIIIIlIlIlIIIlIllIlI = (Object)((String)lllllllllllllIIIIlIlIlIIIlIlllll).toCharArray();
        final byte lllllllllllllIIIIlIlIlIIIlIllIIl = (byte)lllllllllllllIIIIlIlIlIIIlIllIlI.length;
        String lllllllllllllIIIIlIlIlIIIlIllIII = (String)ResourcePackRepository.lIlIllllIIIlII[1];
        while (llllIlIIIlllIll((int)lllllllllllllIIIIlIlIlIIIlIllIII, lllllllllllllIIIIlIlIlIIIlIllIIl)) {
            final char lllllllllllllIIIIlIlIlIIIllIIlIl = lllllllllllllIIIIlIlIlIIIlIllIlI[lllllllllllllIIIIlIlIlIIIlIllIII];
            lllllllllllllIIIIlIlIlIIIllIIIlI.append((char)(lllllllllllllIIIIlIlIlIIIllIIlIl ^ lllllllllllllIIIIlIlIlIIIllIIIIl[lllllllllllllIIIIlIlIlIIIllIIIII % lllllllllllllIIIIlIlIlIIIllIIIIl.length]));
            "".length();
            ++lllllllllllllIIIIlIlIlIIIllIIIII;
            ++lllllllllllllIIIIlIlIlIIIlIllIII;
            "".length();
            if (-" ".length() > -" ".length()) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIIIIlIlIlIIIllIIIlI);
    }
    
    private List<File> getResourcePackFiles() {
        List<File> list;
        if (llllIlIIIllIlll(this.dirResourcepacks.isDirectory() ? 1 : 0)) {
            list = Arrays.asList(this.dirResourcepacks.listFiles(ResourcePackRepository.resourcePackFilter));
            "".length();
            if (null != null) {
                return null;
            }
        }
        else {
            list = Collections.emptyList();
        }
        return list;
    }
    
    public ResourcePackRepository(final File lllllllllllllIIIIlIlIlIIlllIlllI, final File lllllllllllllIIIIlIlIlIIlllIllIl, final IResourcePack lllllllllllllIIIIlIlIlIIllllIlIl, final IMetadataSerializer lllllllllllllIIIIlIlIlIIllllIlII, final GameSettings lllllllllllllIIIIlIlIlIIlllIlIlI) {
        this.lock = new ReentrantLock();
        this.repositoryEntriesAll = (List<Entry>)Lists.newArrayList();
        this.repositoryEntries = (List<Entry>)Lists.newArrayList();
        this.dirResourcepacks = lllllllllllllIIIIlIlIlIIlllIlllI;
        this.dirServerResourcepacks = lllllllllllllIIIIlIlIlIIlllIllIl;
        this.rprDefaultResourcePack = lllllllllllllIIIIlIlIlIIllllIlIl;
        this.rprMetadataSerializer = lllllllllllllIIIIlIlIlIIllllIlII;
        this.fixDirResourcepacks();
        this.updateRepositoryEntriesAll();
        final Iterator<String> lllllllllllllIIIIlIlIlIIllllIIlI = lllllllllllllIIIIlIlIlIIlllIlIlI.resourcePacks.iterator();
        "".length();
        if ("   ".length() == 0) {
            throw null;
        }
        while (!llllIlIIIlllIIl(lllllllllllllIIIIlIlIlIIllllIIlI.hasNext() ? 1 : 0)) {
            final String lllllllllllllIIIIlIlIlIIllllIIIl = lllllllllllllIIIIlIlIlIIllllIIlI.next();
            final double lllllllllllllIIIIlIlIlIIlllIIllI = (double)this.repositoryEntriesAll.iterator();
            "".length();
            if ((0x6A ^ 0x6E) < "   ".length()) {
                throw null;
            }
            while (!llllIlIIIlllIIl(((Iterator)lllllllllllllIIIIlIlIlIIlllIIllI).hasNext() ? 1 : 0)) {
                final Entry lllllllllllllIIIIlIlIlIIllllIIII = ((Iterator<Entry>)lllllllllllllIIIIlIlIlIIlllIIllI).next();
                if (llllIlIIIllIlll(lllllllllllllIIIIlIlIlIIllllIIII.getResourcePackName().equals(lllllllllllllIIIIlIlIlIIllllIIIl) ? 1 : 0)) {
                    if (!llllIlIIIlllIII(lllllllllllllIIIIlIlIlIIllllIIII.func_183027_f(), ResourcePackRepository.lIlIllllIIIlII[0]) || llllIlIIIllIlll(lllllllllllllIIIIlIlIlIIlllIlIlI.field_183018_l.contains(lllllllllllllIIIIlIlIlIIllllIIII.getResourcePackName()) ? 1 : 0)) {
                        this.repositoryEntries.add(lllllllllllllIIIIlIlIlIIllllIIII);
                        "".length();
                        "".length();
                        if ("   ".length() == -" ".length()) {
                            throw null;
                        }
                        break;
                    }
                    else {
                        lllllllllllllIIIIlIlIlIIllllIIlI.remove();
                        final Logger logger = ResourcePackRepository.logger;
                        final String s = ResourcePackRepository.lIlIllllIIIIll[ResourcePackRepository.lIlIllllIIIlII[1]];
                        final Object[] array = new Object[ResourcePackRepository.lIlIllllIIIlII[0]];
                        array[ResourcePackRepository.lIlIllllIIIlII[1]] = lllllllllllllIIIIlIlIlIIllllIIII.getResourcePackName();
                        logger.warn(s, array);
                    }
                }
            }
        }
    }
    
    public File getDirResourcepacks() {
        return this.dirResourcepacks;
    }
    
    private static boolean llllIlIIIlllllI(final Object lllllllllllllIIIIlIlIlIIIIlllIII) {
        return lllllllllllllIIIIlIlIlIIIIlllIII != null;
    }
    
    private static String llllIlIIIllIIlI(final String lllllllllllllIIIIlIlIlIIIlllIlII, final String lllllllllllllIIIIlIlIlIIIlllIIll) {
        try {
            final SecretKeySpec lllllllllllllIIIIlIlIlIIIlllIlll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIIIIlIlIlIIIlllIIll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lllllllllllllIIIIlIlIlIIIlllIllI = Cipher.getInstance("Blowfish");
            lllllllllllllIIIIlIlIlIIIlllIllI.init(ResourcePackRepository.lIlIllllIIIlII[2], lllllllllllllIIIIlIlIlIIIlllIlll);
            return new String(lllllllllllllIIIIlIlIlIIIlllIllI.doFinal(Base64.getDecoder().decode(lllllllllllllIIIIlIlIlIIIlllIlII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIIIlIlIlIIIlllIlIl) {
            lllllllllllllIIIIlIlIlIIIlllIlIl.printStackTrace();
            return null;
        }
    }
    
    private static boolean llllIlIIIlllIIl(final int lllllllllllllIIIIlIlIlIIIIllIlII) {
        return lllllllllllllIIIIlIlIlIIIIllIlII == 0;
    }
    
    public List<Entry> getRepositoryEntriesAll() {
        return (List<Entry>)ImmutableList.copyOf((Collection)this.repositoryEntriesAll);
    }
    
    private static boolean llllIlIIIllllII(final int lllllllllllllIIIIlIlIlIIIlIIIlll, final int lllllllllllllIIIIlIlIlIIIlIIIllI) {
        return lllllllllllllIIIIlIlIlIIIlIIIlll == lllllllllllllIIIIlIlIlIIIlIIIllI;
    }
    
    public void setRepositories(final List<Entry> lllllllllllllIIIIlIlIlIIllIIIIIl) {
        this.repositoryEntries.clear();
        this.repositoryEntries.addAll(lllllllllllllIIIIlIlIlIIllIIIIIl);
        "".length();
    }
    
    static {
        llllIlIIIllIllI();
        llllIlIIIllIlIl();
        logger = LogManager.getLogger();
        resourcePackFilter = new FileFilter() {
            private static final /* synthetic */ String[] lIlllllllIIllI;
            private static final /* synthetic */ int[] lIlllllllIIlll;
            
            private static boolean lIIIIllIIIlIIIIl(final int llllllllllllIllllIIIlllIIllIllll) {
                return llllllllllllIllllIIIlllIIllIllll != 0;
            }
            
            private static void lIIIIllIIIlIIIII() {
                (lIlllllllIIlll = new int[3])[0] = ((153 + 61 - 184 + 141 ^ 68 + 54 - 12 + 73) & (0xFB ^ 0xBB ^ (0xCC ^ 0x90) ^ -" ".length()));
                ResourcePackRepository$1.lIlllllllIIlll[1] = " ".length();
                ResourcePackRepository$1.lIlllllllIIlll[2] = "  ".length();
            }
            
            static {
                lIIIIllIIIlIIIII();
                lIIIIllIIIIlllll();
            }
            
            private static boolean lIIIIllIIIlIIIll(final int llllllllllllIllllIIIlllIIlllIIlI, final int llllllllllllIllllIIIlllIIlllIIIl) {
                return llllllllllllIllllIIIlllIIlllIIlI < llllllllllllIllllIIIlllIIlllIIIl;
            }
            
            private static boolean lIIIIllIIIlIIIlI(final int llllllllllllIllllIIIlllIIllIllIl) {
                return llllllllllllIllllIIIlllIIllIllIl == 0;
            }
            
            @Override
            public boolean accept(final File llllllllllllIllllIIIlllIlIIlIIlI) {
                int n;
                if (lIIIIllIIIlIIIIl(llllllllllllIllllIIIlllIlIIlIIlI.isFile() ? 1 : 0) && lIIIIllIIIlIIIIl(llllllllllllIllllIIIlllIlIIlIIlI.getName().endsWith(ResourcePackRepository$1.lIlllllllIIllI[ResourcePackRepository$1.lIlllllllIIlll[0]]) ? 1 : 0)) {
                    n = ResourcePackRepository$1.lIlllllllIIlll[1];
                    "".length();
                    if (((0xDE ^ 0xC6) & ~(0x92 ^ 0x8A)) == "  ".length()) {
                        return ((0x2D ^ 0x63) & ~(0x2C ^ 0x62)) != 0x0;
                    }
                }
                else {
                    n = ResourcePackRepository$1.lIlllllllIIlll[0];
                }
                final boolean llllllllllllIllllIIIlllIlIIlIIIl = n != 0;
                int n2;
                if (lIIIIllIIIlIIIIl(llllllllllllIllllIIIlllIlIIlIIlI.isDirectory() ? 1 : 0) && lIIIIllIIIlIIIIl(new File(llllllllllllIllllIIIlllIlIIlIIlI, ResourcePackRepository$1.lIlllllllIIllI[ResourcePackRepository$1.lIlllllllIIlll[1]]).isFile() ? 1 : 0)) {
                    n2 = ResourcePackRepository$1.lIlllllllIIlll[1];
                    "".length();
                    if (null != null) {
                        return ((0x7D ^ 0x5D) & ~(0xBB ^ 0x9B)) != 0x0;
                    }
                }
                else {
                    n2 = ResourcePackRepository$1.lIlllllllIIlll[0];
                }
                final boolean llllllllllllIllllIIIlllIlIIlIIII = n2 != 0;
                if (lIIIIllIIIlIIIlI(llllllllllllIllllIIIlllIlIIlIIIl ? 1 : 0) && lIIIIllIIIlIIIlI(llllllllllllIllllIIIlllIlIIlIIII ? 1 : 0)) {
                    return ResourcePackRepository$1.lIlllllllIIlll[0] != 0;
                }
                return ResourcePackRepository$1.lIlllllllIIlll[1] != 0;
            }
            
            private static String lIIIIllIIIIllllI(String llllllllllllIllllIIIlllIIlllllIl, final String llllllllllllIllllIIIlllIIlllllII) {
                llllllllllllIllllIIIlllIIlllllIl = new String(Base64.getDecoder().decode(llllllllllllIllllIIIlllIIlllllIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
                final StringBuilder llllllllllllIllllIIIlllIlIIIIIII = new StringBuilder();
                final char[] llllllllllllIllllIIIlllIIlllllll = llllllllllllIllllIIIlllIIlllllII.toCharArray();
                int llllllllllllIllllIIIlllIIllllllI = ResourcePackRepository$1.lIlllllllIIlll[0];
                final long llllllllllllIllllIIIlllIIllllIII = (Object)llllllllllllIllllIIIlllIIlllllIl.toCharArray();
                final float llllllllllllIllllIIIlllIIlllIlll = llllllllllllIllllIIIlllIIllllIII.length;
                char llllllllllllIllllIIIlllIIlllIllI = (char)ResourcePackRepository$1.lIlllllllIIlll[0];
                while (lIIIIllIIIlIIIll(llllllllllllIllllIIIlllIIlllIllI, (int)llllllllllllIllllIIIlllIIlllIlll)) {
                    final char llllllllllllIllllIIIlllIlIIIIIll = llllllllllllIllllIIIlllIIllllIII[llllllllllllIllllIIIlllIIlllIllI];
                    llllllllllllIllllIIIlllIlIIIIIII.append((char)(llllllllllllIllllIIIlllIlIIIIIll ^ llllllllllllIllllIIIlllIIlllllll[llllllllllllIllllIIIlllIIllllllI % llllllllllllIllllIIIlllIIlllllll.length]));
                    "".length();
                    ++llllllllllllIllllIIIlllIIllllllI;
                    ++llllllllllllIllllIIIlllIIlllIllI;
                    "".length();
                    if ("  ".length() < 0) {
                        return null;
                    }
                }
                return String.valueOf(llllllllllllIllllIIIlllIlIIIIIII);
            }
            
            private static void lIIIIllIIIIlllll() {
                (lIlllllllIIllI = new String[ResourcePackRepository$1.lIlllllllIIlll[2]])[ResourcePackRepository$1.lIlllllllIIlll[0]] = lIIIIllIIIIllllI("fSANGQ==", "SZdiJ");
                ResourcePackRepository$1.lIlllllllIIllI[ResourcePackRepository$1.lIlllllllIIlll[1]] = lIIIIllIIIIllllI("CSwpPW8ULiczNRg=", "yMJVA");
            }
        };
    }
    
    private static boolean llllIlIIIllllIl(final int lllllllllllllIIIIlIlIlIIIlIIIIll, final int lllllllllllllIIIIlIlIlIIIlIIIIlI) {
        return lllllllllllllIIIIlIlIlIIIlIIIIll >= lllllllllllllIIIIlIlIlIIIlIIIIlI;
    }
    
    private static boolean llllIlIIIlllIll(final int lllllllllllllIIIIlIlIlIIIIllllll, final int lllllllllllllIIIIlIlIlIIIIlllllI) {
        return lllllllllllllIIIIlIlIlIIIIllllll < lllllllllllllIIIIlIlIlIIIIlllllI;
    }
    
    public List<Entry> getRepositoryEntries() {
        return (List<Entry>)ImmutableList.copyOf((Collection)this.repositoryEntries);
    }
    
    private static String llllIlIIIllIIIl(final String lllllllllllllIIIIlIlIlIIIlIIllIl, final String lllllllllllllIIIIlIlIlIIIlIIllII) {
        try {
            final SecretKeySpec lllllllllllllIIIIlIlIlIIIlIlIIlI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIIIIlIlIlIIIlIIllII.getBytes(StandardCharsets.UTF_8)), ResourcePackRepository.lIlIllllIIIlII[10]), "DES");
            final Cipher lllllllllllllIIIIlIlIlIIIlIlIIIl = Cipher.getInstance("DES");
            lllllllllllllIIIIlIlIlIIIlIlIIIl.init(ResourcePackRepository.lIlIllllIIIlII[2], lllllllllllllIIIIlIlIlIIIlIlIIlI);
            return new String(lllllllllllllIIIIlIlIlIIIlIlIIIl.doFinal(Base64.getDecoder().decode(lllllllllllllIIIIlIlIlIIIlIIllIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIIIlIlIlIIIlIlIIII) {
            lllllllllllllIIIIlIlIlIIIlIlIIII.printStackTrace();
            return null;
        }
    }
    
    private static boolean llllIlIIIlllIII(final int lllllllllllllIIIIlIlIlIIIIllIIIl, final int lllllllllllllIIIIlIlIlIIIIllIIII) {
        return lllllllllllllIIIIlIlIlIIIIllIIIl != lllllllllllllIIIIlIlIlIIIIllIIII;
    }
    
    public ListenableFuture<Object> downloadResourcePack(final String lllllllllllllIIIIlIlIlIIlIllIIII, final String lllllllllllllIIIIlIlIlIIlIlIIIIl) {
        String lllllllllllllIIIIlIlIlIIlIlIllIl = null;
        if (llllIlIIIllIlll(lllllllllllllIIIIlIlIlIIlIlIIIIl.matches(ResourcePackRepository.lIlIllllIIIIll[ResourcePackRepository.lIlIllllIIIlII[4]]) ? 1 : 0)) {
            final String lllllllllllllIIIIlIlIlIIlIlIlllI = lllllllllllllIIIIlIlIlIIlIlIIIIl;
            "".length();
            if ("   ".length() <= 0) {
                return null;
            }
        }
        else {
            lllllllllllllIIIIlIlIlIIlIlIllIl = ResourcePackRepository.lIlIllllIIIIll[ResourcePackRepository.lIlIllllIIIlII[5]];
        }
        final File lllllllllllllIIIIlIlIlIIlIlIllII = new File(this.dirServerResourcepacks, lllllllllllllIIIIlIlIlIIlIlIllIl);
        this.lock.lock();
        try {
            this.func_148529_f();
            if (llllIlIIIllIlll(lllllllllllllIIIIlIlIlIIlIlIllII.exists() ? 1 : 0) && llllIlIIIllllII(lllllllllllllIIIIlIlIlIIlIlIIIIl.length(), ResourcePackRepository.lIlIllllIIIlII[6])) {
                try {
                    final String lllllllllllllIIIIlIlIlIIlIlIlIll = Hashing.sha1().hashBytes(Files.toByteArray(lllllllllllllIIIIlIlIlIIlIlIllII)).toString();
                    if (llllIlIIIllIlll(lllllllllllllIIIIlIlIlIIlIlIlIll.equals(lllllllllllllIIIIlIlIlIIlIlIIIIl) ? 1 : 0)) {
                        final int lllllllllllllIIIIlIlIlIIlIIllIII;
                        final ListenableFuture lllllllllllllIIIIlIlIlIIlIlIlIlI = (ListenableFuture)(lllllllllllllIIIIlIlIlIIlIIllIII = (int)this.setResourcePackInstance(lllllllllllllIIIIlIlIlIIlIlIllII));
                        return (ListenableFuture<Object>)lllllllllllllIIIIlIlIlIIlIIllIII;
                    }
                    ResourcePackRepository.logger.warn(String.valueOf(new StringBuilder(ResourcePackRepository.lIlIllllIIIIll[ResourcePackRepository.lIlIllllIIIlII[7]]).append(lllllllllllllIIIIlIlIlIIlIlIllII).append(ResourcePackRepository.lIlIllllIIIIll[ResourcePackRepository.lIlIllllIIIlII[8]]).append(lllllllllllllIIIIlIlIlIIlIlIIIIl).append(ResourcePackRepository.lIlIllllIIIIll[ResourcePackRepository.lIlIllllIIIlII[9]]).append(lllllllllllllIIIIlIlIlIIlIlIlIll).append(ResourcePackRepository.lIlIllllIIIIll[ResourcePackRepository.lIlIllllIIIlII[10]])));
                    FileUtils.deleteQuietly(lllllllllllllIIIIlIlIlIIlIlIllII);
                    "".length();
                    "".length();
                    if (-"  ".length() > 0) {
                        return null;
                    }
                }
                catch (IOException lllllllllllllIIIIlIlIlIIlIlIlIIl) {
                    ResourcePackRepository.logger.warn(String.valueOf(new StringBuilder(ResourcePackRepository.lIlIllllIIIIll[ResourcePackRepository.lIlIllllIIIlII[11]]).append(lllllllllllllIIIIlIlIlIIlIlIllII).append(ResourcePackRepository.lIlIllllIIIIll[ResourcePackRepository.lIlIllllIIIlII[12]])), (Throwable)lllllllllllllIIIIlIlIlIIlIlIlIIl);
                    FileUtils.deleteQuietly(lllllllllllllIIIIlIlIlIIlIlIllII);
                    "".length();
                }
            }
            this.func_183028_i();
            final GuiScreenWorking lllllllllllllIIIIlIlIlIIlIlIlIII = new GuiScreenWorking();
            final Map<String, String> lllllllllllllIIIIlIlIlIIlIlIIlll = Minecraft.getSessionInfo();
            final Minecraft lllllllllllllIIIIlIlIlIIlIlIIllI = Minecraft.getMinecraft();
            Futures.getUnchecked((Future)lllllllllllllIIIIlIlIlIIlIlIIllI.addScheduledTask(new Runnable() {
                @Override
                public void run() {
                    lllllllllllllIIIIlIlIlIIlIlIIllI.displayGuiScreen(lllllllllllllIIIIlIlIlIIlIlIlIII);
                }
            }));
            "".length();
            final SettableFuture<Object> lllllllllllllIIIIlIlIlIIlIlIIlIl = (SettableFuture<Object>)SettableFuture.create();
            this.field_177322_i = HttpUtil.downloadResourcePack(lllllllllllllIIIIlIlIlIIlIlIllII, lllllllllllllIIIIlIlIlIIlIllIIII, lllllllllllllIIIIlIlIlIIlIlIIlll, ResourcePackRepository.lIlIllllIIIlII[13], lllllllllllllIIIIlIlIlIIlIlIlIII, lllllllllllllIIIIlIlIlIIlIlIIllI.getProxy());
            Futures.addCallback((ListenableFuture)this.field_177322_i, (FutureCallback)new FutureCallback<Object>() {
                public void onSuccess(final Object lllllllllllllIlIlIIIIlllIIIllIll) {
                    ResourcePackRepository.this.setResourcePackInstance(lllllllllllllIIIIlIlIlIIlIlIllII);
                    "".length();
                    lllllllllllllIIIIlIlIlIIlIlIIlIl.set((Object)null);
                    "".length();
                }
                
                public void onFailure(final Throwable lllllllllllllIlIlIIIIlllIIIlIlII) {
                    lllllllllllllIIIIlIlIlIIlIlIIlIl.setException(lllllllllllllIlIlIIIIlllIIIlIlII);
                    "".length();
                }
            });
            int lllllllllllllIIIIlIlIlIIlIIllIII;
            final ListenableFuture lllllllllllllIIIIlIlIlIIlIlIIlII = (ListenableFuture)(lllllllllllllIIIIlIlIlIIlIIllIII = (int)this.field_177322_i);
            return (ListenableFuture<Object>)lllllllllllllIIIIlIlIlIIlIIllIII;
        }
        finally {
            this.lock.unlock();
        }
    }
    
    private static boolean llllIlIIIlllIlI(final int lllllllllllllIIIIlIlIlIIIIlllIll, final int lllllllllllllIIIIlIlIlIIIIlllIlI) {
        return lllllllllllllIIIIlIlIlIIIIlllIll > lllllllllllllIIIIlIlIlIIIIlllIlI;
    }
    
    public void func_148529_f() {
        this.lock.lock();
        try {
            if (llllIlIIIlllllI(this.field_177322_i)) {
                this.field_177322_i.cancel((boolean)(ResourcePackRepository.lIlIllllIIIlII[0] != 0));
                "".length();
            }
            this.field_177322_i = null;
            if (llllIlIIIlllllI(this.resourcePackInstance)) {
                this.resourcePackInstance = null;
                Minecraft.getMinecraft().scheduleResourcesRefresh();
                "".length();
                "".length();
                if ((0xF8 ^ 0xB9 ^ (0xC2 ^ 0x87)) == 0x0) {
                    return;
                }
            }
        }
        finally {
            this.lock.unlock();
        }
        this.lock.unlock();
    }
    
    public ListenableFuture<Object> setResourcePackInstance(final File lllllllllllllIIIIlIlIlIIlIIIIllI) {
        this.resourcePackInstance = new FileResourcePack(lllllllllllllIIIIlIlIlIIlIIIIllI);
        return Minecraft.getMinecraft().scheduleResourcesRefresh();
    }
    
    private static void llllIlIIIllIlIl() {
        (lIlIllllIIIIll = new String[ResourcePackRepository.lIlIllllIIIlII[15]])[ResourcePackRepository.lIlIllllIIIlII[1]] = llllIlIIIllIIII("PzcqPBMINmcgAAE3JCcACXI1NhYCJzUwAE0iJjAOTSk6cwcIMSYmFghyLidCHnIpPEUBPSk0AB9yJDwIHTMzOgcBNw==", "mRGSe");
        ResourcePackRepository.lIlIllllIIIIll[ResourcePackRepository.lIlIllllIIIlII[0]] = llllIlIIIllIIII("DwMUJDU/TQEpeSgIFjQ8OxkQZis/HhozKzkIBSc6MU0TKTU+CAdqeTMZVSMhMx4BNXk4GAFmMClNGyktegxVIjAoCBYyNigUT2Y=", "ZmuFY");
        ResourcePackRepository.lIlIllllIIIIll[ResourcePackRepository.lIlIllllIIIlII[2]] = llllIlIIIllIIIl("hXPiA83XSHe0KD2wRuoeMlzDUlrSThEZBAGafwzCTIiJkTGkDuOo5w==", "KgdDg");
        ResourcePackRepository.lIlIllllIIIIll[ResourcePackRepository.lIlIllllIIIlII[4]] = llllIlIIIllIIlI("+7eOKCBuIyHXVNO7eR58wQ==", "YLijY");
        ResourcePackRepository.lIlIllllIIIIll[ResourcePackRepository.lIlIllllIIIlII[5]] = llllIlIIIllIIII("KAwjOQg9", "DiDXk");
        ResourcePackRepository.lIlIllllIIIIll[ResourcePackRepository.lIlIllllIIIlII[7]] = llllIlIIIllIIIl("JoQuBwKASgQ=", "fZCtb");
        ResourcePackRepository.lIlIllllIIIIll[ResourcePackRepository.lIlIllllIIIlII[8]] = llllIlIIIllIIlI("x3VfKj3qGSpUHScTu/C+LjBaC/UGL248waCagpeKY4A=", "QuvpA");
        ResourcePackRepository.lIlIllllIIIIll[ResourcePackRepository.lIlIllllIIIlII[9]] = llllIlIIIllIIlI("jUlfDcJ0RSfMI4dEpXoujg==", "zBwKh");
        ResourcePackRepository.lIlIllllIIIIll[ResourcePackRepository.lIlIllllIIIlII[10]] = llllIlIIIllIIII("X2tZKzIaIA0GORFlEBt5", "vEyoW");
        ResourcePackRepository.lIlIllllIIIIll[ResourcePackRepository.lIlIllllIIIlII[11]] = llllIlIIIllIIII("MDEAD0I=", "vXljb");
        ResourcePackRepository.lIlIllllIIIIll[ResourcePackRepository.lIlIllllIIIlII[12]] = llllIlIIIllIIII("YRsbFgYlFlMXSiMdVAsLMhARB0RhPBEPDzURGgRKKAxa", "Axtcj");
        ResourcePackRepository.lIlIllllIIIIll[ResourcePackRepository.lIlIllllIIIlII[14]] = llllIlIIIllIIlI("9mPqebe1s2IDQMz40ugoZBBXnv/qJRDhfIn1jzvsNJsJgo1nXYDScg==", "WOpnK");
    }
    
    private static void llllIlIIIllIllI() {
        (lIlIllllIIIlII = new int[16])[0] = " ".length();
        ResourcePackRepository.lIlIllllIIIlII[1] = ((0x98 ^ 0x80) & ~(0x52 ^ 0x4A));
        ResourcePackRepository.lIlIllllIIIlII[2] = "  ".length();
        ResourcePackRepository.lIlIllllIIIlII[3] = -" ".length();
        ResourcePackRepository.lIlIllllIIIlII[4] = "   ".length();
        ResourcePackRepository.lIlIllllIIIlII[5] = (90 + 70 - 23 + 17 ^ 141 + 87 - 125 + 55);
        ResourcePackRepository.lIlIllllIIIlII[6] = (0x27 ^ 0xF);
        ResourcePackRepository.lIlIllllIIIlII[7] = (148 + 151 - 280 + 142 ^ 72 + 113 - 106 + 85);
        ResourcePackRepository.lIlIllllIIIlII[8] = (0xBA ^ 0xBC);
        ResourcePackRepository.lIlIllllIIIlII[9] = (0x9 ^ 0xE);
        ResourcePackRepository.lIlIllllIIIlII[10] = (0x71 ^ 0x9 ^ (0x34 ^ 0x44));
        ResourcePackRepository.lIlIllllIIIlII[11] = (0x53 ^ 0x5A);
        ResourcePackRepository.lIlIllllIIIlII[12] = (0xF8 ^ 0xC7 ^ (0xA6 ^ 0x93));
        ResourcePackRepository.lIlIllllIIIlII[13] = (0xFFFFF190 & 0x3200E6F);
        ResourcePackRepository.lIlIllllIIIlII[14] = (0x18 ^ 0x13);
        ResourcePackRepository.lIlIllllIIIlII[15] = (0xA ^ 0x14 ^ (0xA6 ^ 0xB4));
    }
    
    private void func_183028_i() {
        final List<File> lllllllllllllIIIIlIlIlIIlIIlIIIl = (List<File>)Lists.newArrayList((Iterable)FileUtils.listFiles(this.dirServerResourcepacks, TrueFileFilter.TRUE, (IOFileFilter)null));
        Collections.sort(lllllllllllllIIIIlIlIlIIlIIlIIIl, LastModifiedFileComparator.LASTMODIFIED_REVERSE);
        int lllllllllllllIIIIlIlIlIIlIIlIIII = ResourcePackRepository.lIlIllllIIIlII[1];
        final char lllllllllllllIIIIlIlIlIIlIIIlIlI = (char)lllllllllllllIIIIlIlIlIIlIIlIIIl.iterator();
        "".length();
        if (((0xF1 ^ 0x8C ^ (0xF2 ^ 0xB0)) & (2 + 16 + 50 + 68 ^ 101 + 156 - 118 + 44 ^ -" ".length())) != 0x0) {
            return;
        }
        while (!llllIlIIIlllIIl(((Iterator)lllllllllllllIIIIlIlIlIIlIIIlIlI).hasNext() ? 1 : 0)) {
            final File lllllllllllllIIIIlIlIlIIlIIIllll = ((Iterator<File>)lllllllllllllIIIIlIlIlIIlIIIlIlI).next();
            if (llllIlIIIllllIl(lllllllllllllIIIIlIlIlIIlIIlIIII++, ResourcePackRepository.lIlIllllIIIlII[12])) {
                ResourcePackRepository.logger.info(String.valueOf(new StringBuilder(ResourcePackRepository.lIlIllllIIIIll[ResourcePackRepository.lIlIllllIIIlII[14]]).append(lllllllllllllIIIIlIlIlIIlIIIllll.getName())));
                FileUtils.deleteQuietly(lllllllllllllIIIIlIlIlIIlIIIllll);
                "".length();
            }
        }
    }
    
    private static boolean llllIlIIIllIlll(final int lllllllllllllIIIIlIlIlIIIIllIllI) {
        return lllllllllllllIIIIlIlIlIIIIllIllI != 0;
    }
    
    public void updateRepositoryEntriesAll() {
        final List<Entry> lllllllllllllIIIIlIlIlIIllIllIII = (List<Entry>)Lists.newArrayList();
        short lllllllllllllIIIIlIlIlIIllIIllll = (short)this.getResourcePackFiles().iterator();
        "".length();
        if (((0x2B ^ 0xB) & ~(0x10 ^ 0x30)) != 0x0) {
            return;
        }
        while (!llllIlIIIlllIIl(((Iterator)lllllllllllllIIIIlIlIlIIllIIllll).hasNext() ? 1 : 0)) {
            final File lllllllllllllIIIIlIlIlIIllIlIlll = ((Iterator<File>)lllllllllllllIIIIlIlIlIIllIIllll).next();
            final Entry lllllllllllllIIIIlIlIlIIllIlIllI = new Entry(lllllllllllllIIIIlIlIlIIllIlIlll, (Entry)null);
            if (llllIlIIIlllIIl(this.repositoryEntriesAll.contains(lllllllllllllIIIIlIlIlIIllIlIllI) ? 1 : 0)) {
                try {
                    lllllllllllllIIIIlIlIlIIllIlIllI.updateResourcePack();
                    lllllllllllllIIIIlIlIlIIllIllIII.add(lllllllllllllIIIIlIlIlIIllIlIllI);
                    "".length();
                    "".length();
                    if (-" ".length() >= " ".length()) {
                        return;
                    }
                    continue;
                }
                catch (Exception lllllllllllllIIIIlIlIlIIllIlIlIl) {
                    lllllllllllllIIIIlIlIlIIllIllIII.remove(lllllllllllllIIIIlIlIlIIllIlIllI);
                    "".length();
                    "".length();
                    if (-"   ".length() > 0) {
                        return;
                    }
                    continue;
                }
            }
            final int lllllllllllllIIIIlIlIlIIllIlIlII = this.repositoryEntriesAll.indexOf(lllllllllllllIIIIlIlIlIIllIlIllI);
            if (llllIlIIIlllIlI(lllllllllllllIIIIlIlIlIIllIlIlII, ResourcePackRepository.lIlIllllIIIlII[3]) && llllIlIIIlllIll(lllllllllllllIIIIlIlIlIIllIlIlII, this.repositoryEntriesAll.size())) {
                lllllllllllllIIIIlIlIlIIllIllIII.add(this.repositoryEntriesAll.get(lllllllllllllIIIIlIlIlIIllIlIlII));
                "".length();
            }
        }
        this.repositoryEntriesAll.removeAll(lllllllllllllIIIIlIlIlIIllIllIII);
        "".length();
        lllllllllllllIIIIlIlIlIIllIIllll = (short)this.repositoryEntriesAll.iterator();
        "".length();
        if (" ".length() == 0) {
            return;
        }
        while (!llllIlIIIlllIIl(((Iterator)lllllllllllllIIIIlIlIlIIllIIllll).hasNext() ? 1 : 0)) {
            final Entry lllllllllllllIIIIlIlIlIIllIlIIll = ((Iterator<Entry>)lllllllllllllIIIIlIlIlIIllIIllll).next();
            lllllllllllllIIIIlIlIlIIllIlIIll.closeResourcePack();
        }
        this.repositoryEntriesAll = lllllllllllllIIIIlIlIlIIllIllIII;
    }
    
    private void fixDirResourcepacks() {
        if (llllIlIIIllIlll(this.dirResourcepacks.exists() ? 1 : 0)) {
            if (llllIlIIIlllIIl(this.dirResourcepacks.isDirectory() ? 1 : 0) && (!llllIlIIIllIlll(this.dirResourcepacks.delete() ? 1 : 0) || llllIlIIIlllIIl(this.dirResourcepacks.mkdirs() ? 1 : 0))) {
                ResourcePackRepository.logger.warn(String.valueOf(new StringBuilder(ResourcePackRepository.lIlIllllIIIIll[ResourcePackRepository.lIlIllllIIIlII[0]]).append(this.dirResourcepacks)));
                "".length();
                if (-"   ".length() >= 0) {
                    return;
                }
            }
        }
        else if (llllIlIIIlllIIl(this.dirResourcepacks.mkdirs() ? 1 : 0)) {
            ResourcePackRepository.logger.warn(String.valueOf(new StringBuilder(ResourcePackRepository.lIlIllllIIIIll[ResourcePackRepository.lIlIllllIIIlII[2]]).append(this.dirResourcepacks)));
        }
    }
    
    public IResourcePack getResourcePackInstance() {
        return this.resourcePackInstance;
    }
    
    public class Entry
    {
        private static final /* synthetic */ int[] llIIlllIllIlIl;
        private static final /* synthetic */ String[] llIIlllIllIlII;
        private /* synthetic */ PackMetadataSection rePackMetadataSection;
        private /* synthetic */ IResourcePack reResourcePack;
        private final /* synthetic */ File resourcePackFile;
        private /* synthetic */ BufferedImage texturePackIcon;
        private /* synthetic */ ResourceLocation locationTexturePackIcon;
        
        @Override
        public int hashCode() {
            return this.toString().hashCode();
        }
        
        public IResourcePack getResourcePack() {
            return this.reResourcePack;
        }
        
        private static void lIIIllllllIlllll() {
            (llIIlllIllIlIl = new int[8])[0] = ((0x22 ^ 0x31 ^ (0x49 ^ 0x73)) & (89 + 148 - 81 + 28 ^ 84 + 95 - 170 + 136 ^ -" ".length()));
            Entry.llIIlllIllIlIl[1] = " ".length();
            Entry.llIIlllIllIlIl[2] = "  ".length();
            Entry.llIIlllIllIlIl[3] = "   ".length();
            Entry.llIIlllIllIlIl[4] = (0xB4 ^ 0xB0);
            Entry.llIIlllIllIlIl[5] = (0xD1 ^ 0xB1 ^ (0x3 ^ 0x66));
            Entry.llIIlllIllIlIl[6] = (36 + 125 - 36 + 67 ^ 11 + 3 + 48 + 136);
            Entry.llIIlllIllIlIl[7] = (0x24 ^ 0x72 ^ (0x4C ^ 0x12));
        }
        
        private static boolean lIIIlllllllIIIII(final int llllllllllllIllIllllIIIIlIIlllIl) {
            return llllllllllllIllIllllIIIIlIIlllIl != 0;
        }
        
        private static boolean lIIIlllllllIIIlI(final Object llllllllllllIllIllllIIIIlIlIIIlI, final Object llllllllllllIllIllllIIIIlIlIIIIl) {
            return llllllllllllIllIllllIIIIlIlIIIlI == llllllllllllIllIllllIIIIlIlIIIIl;
        }
        
        public int func_183027_f() {
            return this.rePackMetadataSection.getPackFormat();
        }
        
        private static boolean lIIIlllllllIIIll(final int llllllllllllIllIllllIIIIlIlIIllI, final int llllllllllllIllIllllIIIIlIlIIlIl) {
            return llllllllllllIllIllllIIIIlIlIIllI < llllllllllllIllIllllIIIIlIlIIlIl;
        }
        
        public String getTexturePackDescription() {
            String s;
            if (lIIIlllllllIIIIl(this.rePackMetadataSection)) {
                s = String.valueOf(new StringBuilder().append(EnumChatFormatting.RED).append(Entry.llIIlllIllIlII[Entry.llIIlllIllIlIl[2]]));
                "".length();
                if (null != null) {
                    return null;
                }
            }
            else {
                s = this.rePackMetadataSection.getPackDescription().getFormattedText();
            }
            return s;
        }
        
        private static String lIIIllllllIIllll(final String llllllllllllIllIllllIIIIllIIIlII, final String llllllllllllIllIllllIIIIllIIIlIl) {
            try {
                final SecretKeySpec llllllllllllIllIllllIIIIllIIlIIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIllIllllIIIIllIIIlIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
                final Cipher llllllllllllIllIllllIIIIllIIlIII = Cipher.getInstance("Blowfish");
                llllllllllllIllIllllIIIIllIIlIII.init(Entry.llIIlllIllIlIl[2], llllllllllllIllIllllIIIIllIIlIIl);
                return new String(llllllllllllIllIllllIIIIllIIlIII.doFinal(Base64.getDecoder().decode(llllllllllllIllIllllIIIIllIIIlII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
            }
            catch (Exception llllllllllllIllIllllIIIIllIIIlll) {
                llllllllllllIllIllllIIIIllIIIlll.printStackTrace();
                return null;
            }
        }
        
        private static String lIIIllllllIlllII(final String llllllllllllIllIllllIIIIllIlIIIl, final String llllllllllllIllIllllIIIIllIlIIII) {
            try {
                final SecretKeySpec llllllllllllIllIllllIIIIllIlIllI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIllIllllIIIIllIlIIII.getBytes(StandardCharsets.UTF_8)), Entry.llIIlllIllIlIl[7]), "DES");
                final Cipher llllllllllllIllIllllIIIIllIlIlIl = Cipher.getInstance("DES");
                llllllllllllIllIllllIIIIllIlIlIl.init(Entry.llIIlllIllIlIl[2], llllllllllllIllIllllIIIIllIlIllI);
                return new String(llllllllllllIllIllllIIIIllIlIlIl.doFinal(Base64.getDecoder().decode(llllllllllllIllIllllIIIIllIlIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
            }
            catch (Exception llllllllllllIllIllllIIIIllIlIlII) {
                llllllllllllIllIllllIIIIllIlIlII.printStackTrace();
                return null;
            }
        }
        
        private Entry(final File llllllllllllIllIllllIIIlIIIIIlll) {
            this.resourcePackFile = llllllllllllIllIllllIIIlIIIIIlll;
        }
        
        public void bindTexturePackIcon(final TextureManager llllllllllllIllIllllIIIIlllllllI) {
            if (lIIIlllllllIIIIl(this.locationTexturePackIcon)) {
                this.locationTexturePackIcon = llllllllllllIllIllllIIIIlllllllI.getDynamicTextureLocation(Entry.llIIlllIllIlII[Entry.llIIlllIllIlIl[1]], new DynamicTexture(this.texturePackIcon));
            }
            llllllllllllIllIllllIIIIlllllllI.bindTexture(this.locationTexturePackIcon);
        }
        
        @Override
        public String toString() {
            final String format = Entry.llIIlllIllIlII[Entry.llIIlllIllIlIl[3]];
            final Object[] args = new Object[Entry.llIIlllIllIlIl[3]];
            args[Entry.llIIlllIllIlIl[0]] = this.resourcePackFile.getName();
            final int n = Entry.llIIlllIllIlIl[1];
            String s;
            if (lIIIlllllllIIIII(this.resourcePackFile.isDirectory() ? 1 : 0)) {
                s = Entry.llIIlllIllIlII[Entry.llIIlllIllIlIl[4]];
                "".length();
                if (null != null) {
                    return null;
                }
            }
            else {
                s = Entry.llIIlllIllIlII[Entry.llIIlllIllIlIl[5]];
            }
            args[n] = s;
            args[Entry.llIIlllIllIlIl[2]] = this.resourcePackFile.lastModified();
            return String.format(format, args);
        }
        
        private static void lIIIllllllIllllI() {
            (llIIlllIllIlII = new String[Entry.llIIlllIllIlIl[6]])[Entry.llIIlllIllIlIl[0]] = lIIIllllllIIllll("xaWkm2l9pdw=", "kSgPY");
            Entry.llIIlllIllIlII[Entry.llIIlllIllIlIl[1]] = lIIIllllllIlllII("Nev243BXmUrrVC5l/KHhYQ==", "rKeNj");
            Entry.llIIlllIllIlII[Entry.llIIlllIllIlIl[2]] = lIIIllllllIlllIl("DT4kKgEtNHI7DCc7fCYOKTUmKk1sPyBrAC0jISIDI3B1OwwnO3VrHiEzJiICKnk=", "DPRKm");
            Entry.llIIlllIllIlII[Entry.llIIlllIllIlIl[3]] = lIIIllllllIlllIl("dBtyRxJrTSw=", "QhHba");
            Entry.llIIlllIllIlII[Entry.llIIlllIllIlIl[4]] = lIIIllllllIlllII("qKSuK9fUcaA=", "CiAJx");
            Entry.llIIlllIllIlII[Entry.llIIlllIllIlIl[5]] = lIIIllllllIlllIl("OA0R", "BdaBT");
        }
        
        @Override
        public boolean equals(final Object llllllllllllIllIllllIIIIlllIIlll) {
            int equals;
            if (lIIIlllllllIIIlI(this, llllllllllllIllIllllIIIIlllIIlll)) {
                equals = Entry.llIIlllIllIlIl[1];
                "".length();
                if (" ".length() < 0) {
                    return ((0x2 ^ 0x48 ^ (0x6D ^ 0x37)) & (0x2C ^ 0x58 ^ (0x21 ^ 0x45) ^ -" ".length())) != 0x0;
                }
            }
            else if (lIIIlllllllIIIII((llllllllllllIllIllllIIIIlllIIlll instanceof Entry) ? 1 : 0)) {
                equals = (this.toString().equals(llllllllllllIllIllllIIIIlllIIlll.toString()) ? 1 : 0);
                "".length();
                if (((0x68 ^ 0x24 ^ (0xCF ^ 0xBD)) & (0x6E ^ 0x48 ^ (0x1D ^ 0x5) ^ -" ".length())) != 0x0) {
                    return ((0x7 ^ 0x66 ^ (0x5C ^ 0x38)) & (39 + 155 - 96 + 74 ^ 148 + 15 - 22 + 28 ^ -" ".length())) != 0x0;
                }
            }
            else {
                equals = Entry.llIIlllIllIlIl[0];
            }
            return equals != 0;
        }
        
        private static String lIIIllllllIlllIl(String llllllllllllIllIllllIIIIlIllIIIl, final String llllllllllllIllIllllIIIIlIllIIII) {
            llllllllllllIllIllllIIIIlIllIIIl = (byte)new String(Base64.getDecoder().decode(((String)llllllllllllIllIllllIIIIlIllIIIl).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
            final StringBuilder llllllllllllIllIllllIIIIlIllIlII = new StringBuilder();
            final char[] llllllllllllIllIllllIIIIlIllIIll = llllllllllllIllIllllIIIIlIllIIII.toCharArray();
            int llllllllllllIllIllllIIIIlIllIIlI = Entry.llIIlllIllIlIl[0];
            final Exception llllllllllllIllIllllIIIIlIlIllII = (Object)((String)llllllllllllIllIllllIIIIlIllIIIl).toCharArray();
            final double llllllllllllIllIllllIIIIlIlIlIll = llllllllllllIllIllllIIIIlIlIllII.length;
            long llllllllllllIllIllllIIIIlIlIlIlI = Entry.llIIlllIllIlIl[0];
            while (lIIIlllllllIIIll((int)llllllllllllIllIllllIIIIlIlIlIlI, (int)llllllllllllIllIllllIIIIlIlIlIll)) {
                final char llllllllllllIllIllllIIIIlIllIlll = llllllllllllIllIllllIIIIlIlIllII[llllllllllllIllIllllIIIIlIlIlIlI];
                llllllllllllIllIllllIIIIlIllIlII.append((char)(llllllllllllIllIllllIIIIlIllIlll ^ llllllllllllIllIllllIIIIlIllIIll[llllllllllllIllIllllIIIIlIllIIlI % llllllllllllIllIllllIIIIlIllIIll.length]));
                "".length();
                ++llllllllllllIllIllllIIIIlIllIIlI;
                ++llllllllllllIllIllllIIIIlIlIlIlI;
                "".length();
                if ((132 + 165 - 186 + 69 ^ 39 + 86 + 3 + 49) <= 0) {
                    return null;
                }
            }
            return String.valueOf(llllllllllllIllIllllIIIIlIllIlII);
        }
        
        static {
            lIIIllllllIlllll();
            lIIIllllllIllllI();
        }
        
        public void closeResourcePack() {
            if (lIIIlllllllIIIII((this.reResourcePack instanceof Closeable) ? 1 : 0)) {
                IOUtils.closeQuietly((Closeable)this.reResourcePack);
            }
        }
        
        public void updateResourcePack() throws IOException {
            AbstractResourcePack reResourcePack;
            if (lIIIlllllllIIIII(this.resourcePackFile.isDirectory() ? 1 : 0)) {
                reResourcePack = new FolderResourcePack(this.resourcePackFile);
                "".length();
                if ("  ".length() > (0x40 ^ 0x68 ^ (0x29 ^ 0x5))) {
                    return;
                }
            }
            else {
                reResourcePack = new FileResourcePack(this.resourcePackFile);
            }
            this.reResourcePack = reResourcePack;
            this.rePackMetadataSection = this.reResourcePack.getPackMetadata(ResourcePackRepository.this.rprMetadataSerializer, Entry.llIIlllIllIlII[Entry.llIIlllIllIlIl[0]]);
            try {
                this.texturePackIcon = this.reResourcePack.getPackImage();
                "".length();
                if (" ".length() < 0) {
                    return;
                }
            }
            catch (IOException ex) {}
            if (lIIIlllllllIIIIl(this.texturePackIcon)) {
                this.texturePackIcon = ResourcePackRepository.this.rprDefaultResourcePack.getPackImage();
            }
            this.closeResourcePack();
        }
        
        private static boolean lIIIlllllllIIIIl(final Object llllllllllllIllIllllIIIIlIIlllll) {
            return llllllllllllIllIllllIIIIlIIlllll == null;
        }
        
        public String getResourcePackName() {
            return this.reResourcePack.getPackName();
        }
    }
}
