// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.client.resources;

import java.util.Iterator;
import java.io.OutputStream;
import java.io.PrintStream;
import java.io.ByteArrayOutputStream;
import org.apache.logging.log4j.LogManager;
import com.google.common.collect.Lists;
import java.util.Set;
import java.io.IOException;
import java.io.InputStream;
import java.io.FileNotFoundException;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import net.minecraft.util.ResourceLocation;
import java.util.List;
import org.apache.logging.log4j.Logger;
import net.minecraft.client.resources.data.IMetadataSerializer;

public class FallbackResourceManager implements IResourceManager
{
    private final /* synthetic */ IMetadataSerializer frmMetadataSerializer;
    private static final /* synthetic */ String[] lIlllIlIIIlIlI;
    private static final /* synthetic */ Logger logger;
    protected final /* synthetic */ List<IResourcePack> resourcePacks;
    private static final /* synthetic */ int[] lIlllIlIIlIIII;
    
    public void addResourcePack(final IResourcePack llllllllllllIlllllIIIIlllIIIlIII) {
        this.resourcePacks.add(llllllllllllIlllllIIIIlllIIIlIII);
        "".length();
    }
    
    static ResourceLocation getLocationMcmeta(final ResourceLocation llllllllllllIlllllIIIIllIIllIlll) {
        return new ResourceLocation(llllllllllllIlllllIIIIllIIllIlll.getResourceDomain(), String.valueOf(new StringBuilder(String.valueOf(llllllllllllIlllllIIIIllIIllIlll.getResourcePath())).append(FallbackResourceManager.lIlllIlIIIlIlI[FallbackResourceManager.lIlllIlIIlIIII[1]])));
    }
    
    private static boolean lIIIIIlIlIIllIII(final Object llllllllllllIlllllIIIIllIIlIlIII) {
        return llllllllllllIlllllIIIIllIIlIlIII != null;
    }
    
    private static String lIIIIIlIlIIIIlIl(final String llllllllllllIlllllIIIIllIIlIllIl, final String llllllllllllIlllllIIIIllIIlIlllI) {
        try {
            final SecretKeySpec llllllllllllIlllllIIIIllIIllIIlI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIlllllIIIIllIIlIlllI.getBytes(StandardCharsets.UTF_8)), FallbackResourceManager.lIlllIlIIlIIII[2]), "DES");
            final Cipher llllllllllllIlllllIIIIllIIllIIIl = Cipher.getInstance("DES");
            llllllllllllIlllllIIIIllIIllIIIl.init(FallbackResourceManager.lIlllIlIIlIIII[3], llllllllllllIlllllIIIIllIIllIIlI);
            return new String(llllllllllllIlllllIIIIllIIllIIIl.doFinal(Base64.getDecoder().decode(llllllllllllIlllllIIIIllIIlIllIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIlllllIIIIllIIllIIII) {
            llllllllllllIlllllIIIIllIIllIIII.printStackTrace();
            return null;
        }
    }
    
    @Override
    public IResource getResource(final ResourceLocation llllllllllllIlllllIIIIllIlIllllI) throws IOException {
        IResourcePack llllllllllllIlllllIIIIllIllIlIII = null;
        final ResourceLocation llllllllllllIlllllIIIIllIllIIllI = getLocationMcmeta(llllllllllllIlllllIIIIllIlIllllI);
        int llllllllllllIlllllIIIIllIllIIlIl = this.resourcePacks.size() - FallbackResourceManager.lIlllIlIIlIIII[0];
        "".length();
        if (-"   ".length() >= 0) {
            return null;
        }
        while (!lIIIIIlIlIIllIIl(llllllllllllIlllllIIIIllIllIIlIl)) {
            final IResourcePack llllllllllllIlllllIIIIllIllIIIll = this.resourcePacks.get(llllllllllllIlllllIIIIllIllIIlIl);
            if (lIIIIIlIlIIlIllI(llllllllllllIlllllIIIIllIllIlIII) && lIIIIIlIlIIlIlll(llllllllllllIlllllIIIIllIllIIIll.resourceExists(llllllllllllIlllllIIIIllIllIIllI) ? 1 : 0)) {
                llllllllllllIlllllIIIIllIllIlIII = llllllllllllIlllllIIIIllIllIIIll;
            }
            if (lIIIIIlIlIIlIlll(llllllllllllIlllllIIIIllIllIIIll.resourceExists(llllllllllllIlllllIIIIllIlIllllI) ? 1 : 0)) {
                InputStream llllllllllllIlllllIIIIllIllIIIIl = null;
                if (lIIIIIlIlIIllIII(llllllllllllIlllllIIIIllIllIlIII)) {
                    llllllllllllIlllllIIIIllIllIIIIl = this.getInputStream(llllllllllllIlllllIIIIllIllIIllI, llllllllllllIlllllIIIIllIllIlIII);
                }
                return new SimpleResource(llllllllllllIlllllIIIIllIllIIIll.getPackName(), llllllllllllIlllllIIIIllIlIllllI, this.getInputStream(llllllllllllIlllllIIIIllIlIllllI, llllllllllllIlllllIIIIllIllIIIll), llllllllllllIlllllIIIIllIllIIIIl, this.frmMetadataSerializer);
            }
            --llllllllllllIlllllIIIIllIllIIlIl;
        }
        throw new FileNotFoundException(llllllllllllIlllllIIIIllIlIllllI.toString());
    }
    
    private static void lIIIIIlIlIIlIIlI() {
        (lIlllIlIIlIIII = new int[4])[0] = " ".length();
        FallbackResourceManager.lIlllIlIIlIIII[1] = ((0x1D ^ 0x12) & ~(0x51 ^ 0x5E));
        FallbackResourceManager.lIlllIlIIlIIII[2] = (0x45 ^ 0x4D);
        FallbackResourceManager.lIlllIlIIlIIII[3] = "  ".length();
    }
    
    private static boolean lIIIIIlIlIIllIIl(final int llllllllllllIlllllIIIIllIIlIIIII) {
        return llllllllllllIlllllIIIIllIIlIIIII < 0;
    }
    
    @Override
    public Set<String> getResourceDomains() {
        return null;
    }
    
    private static boolean lIIIIIlIlIIlIlll(final int llllllllllllIlllllIIIIllIIlIIlII) {
        return llllllllllllIlllllIIIIllIIlIIlII != 0;
    }
    
    private static boolean lIIIIIlIlIIllIlI(final int llllllllllllIlllllIIIIllIIlIIIlI) {
        return llllllllllllIlllllIIIIllIIlIIIlI == 0;
    }
    
    public FallbackResourceManager(final IMetadataSerializer llllllllllllIlllllIIIIlllIIlIIll) {
        this.resourcePacks = (List<IResourcePack>)Lists.newArrayList();
        this.frmMetadataSerializer = llllllllllllIlllllIIIIlllIIlIIll;
    }
    
    static {
        lIIIIIlIlIIlIIlI();
        lIIIIIlIlIIIIlll();
        logger = LogManager.getLogger();
    }
    
    protected InputStream getInputStream(final ResourceLocation llllllllllllIlllllIIIIllIlIlIIll, final IResourcePack llllllllllllIlllllIIIIllIlIlIIlI) throws IOException {
        final InputStream llllllllllllIlllllIIIIllIlIlIIIl = llllllllllllIlllllIIIIllIlIlIIlI.getInputStream(llllllllllllIlllllIIIIllIlIlIIll);
        InputStream inputStream;
        if (lIIIIIlIlIIlIlll(FallbackResourceManager.logger.isDebugEnabled() ? 1 : 0)) {
            inputStream = new InputStreamLeakedResourceLogger(llllllllllllIlllllIIIIllIlIlIIIl, llllllllllllIlllllIIIIllIlIlIIll, llllllllllllIlllllIIIIllIlIlIIlI.getPackName());
            "".length();
            if ((143 + 91 - 171 + 100 ^ 79 + 50 + 1 + 36) <= 0) {
                return null;
            }
        }
        else {
            inputStream = llllllllllllIlllllIIIIllIlIlIIIl;
        }
        return inputStream;
    }
    
    private static void lIIIIIlIlIIIIlll() {
        (lIlllIlIIIlIlI = new String[FallbackResourceManager.lIlllIlIIlIIII[0]])[FallbackResourceManager.lIlllIlIIlIIII[1]] = lIIIIIlIlIIIIlIl("rAfx9pO4d+4=", "OSOzL");
    }
    
    private static boolean lIIIIIlIlIIlIllI(final Object llllllllllllIlllllIIIIllIIlIIllI) {
        return llllllllllllIlllllIIIIllIIlIIllI == null;
    }
    
    @Override
    public List<IResource> getAllResources(final ResourceLocation llllllllllllIlllllIIIIllIlIIIlIl) throws IOException {
        final List<IResource> llllllllllllIlllllIIIIllIlIIIlII = (List<IResource>)Lists.newArrayList();
        final ResourceLocation llllllllllllIlllllIIIIllIlIIIIll = getLocationMcmeta(llllllllllllIlllllIIIIllIlIIIlIl);
        final byte llllllllllllIlllllIIIIllIIlllIll = (byte)this.resourcePacks.iterator();
        "".length();
        if ("  ".length() < -" ".length()) {
            return null;
        }
        while (!lIIIIIlIlIIllIlI(((Iterator)llllllllllllIlllllIIIIllIIlllIll).hasNext() ? 1 : 0)) {
            final IResourcePack llllllllllllIlllllIIIIllIlIIIIlI = ((Iterator<IResourcePack>)llllllllllllIlllllIIIIllIIlllIll).next();
            if (lIIIIIlIlIIlIlll(llllllllllllIlllllIIIIllIlIIIIlI.resourceExists(llllllllllllIlllllIIIIllIlIIIlIl) ? 1 : 0)) {
                InputStream inputStream;
                if (lIIIIIlIlIIlIlll(llllllllllllIlllllIIIIllIlIIIIlI.resourceExists(llllllllllllIlllllIIIIllIlIIIIll) ? 1 : 0)) {
                    inputStream = this.getInputStream(llllllllllllIlllllIIIIllIlIIIIll, llllllllllllIlllllIIIIllIlIIIIlI);
                    "".length();
                    if ("  ".length() >= "   ".length()) {
                        return null;
                    }
                }
                else {
                    inputStream = null;
                }
                final InputStream llllllllllllIlllllIIIIllIlIIIIIl = inputStream;
                llllllllllllIlllllIIIIllIlIIIlII.add(new SimpleResource(llllllllllllIlllllIIIIllIlIIIIlI.getPackName(), llllllllllllIlllllIIIIllIlIIIlIl, this.getInputStream(llllllllllllIlllllIIIIllIlIIIlIl, llllllllllllIlllllIIIIllIlIIIIlI), llllllllllllIlllllIIIIllIlIIIIIl, this.frmMetadataSerializer));
                "".length();
            }
        }
        if (lIIIIIlIlIIlIlll(llllllllllllIlllllIIIIllIlIIIlII.isEmpty() ? 1 : 0)) {
            throw new FileNotFoundException(llllllllllllIlllllIIIIllIlIIIlIl.toString());
        }
        return llllllllllllIlllllIIIIllIlIIIlII;
    }
    
    static class InputStreamLeakedResourceLogger extends InputStream
    {
        private final /* synthetic */ String field_177328_b;
        private final /* synthetic */ InputStream field_177330_a;
        private /* synthetic */ boolean field_177329_c;
        private static final /* synthetic */ String[] lIIllIIlllIlll;
        private static final /* synthetic */ int[] lIIllIIllllIlI;
        
        @Override
        protected void finalize() throws Throwable {
            if (llIlIlllllllllI(this.field_177329_c ? 1 : 0)) {
                FallbackResourceManager.logger.warn(this.field_177328_b);
            }
            super.finalize();
        }
        
        private static String llIlIllllllIlll(final String lllllllllllllIIlIlIlllIIIlIllIlI, final String lllllllllllllIIlIlIlllIIIlIlIlll) {
            try {
                final SecretKeySpec lllllllllllllIIlIlIlllIIIlIlllIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIIlIlIlllIIIlIlIlll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
                final Cipher lllllllllllllIIlIlIlllIIIlIlllII = Cipher.getInstance("Blowfish");
                lllllllllllllIIlIlIlllIIIlIlllII.init(InputStreamLeakedResourceLogger.lIIllIIllllIlI[2], lllllllllllllIIlIlIlllIIIlIlllIl);
                return new String(lllllllllllllIIlIlIlllIIIlIlllII.doFinal(Base64.getDecoder().decode(lllllllllllllIIlIlIlllIIIlIllIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
            }
            catch (Exception lllllllllllllIIlIlIlllIIIlIllIll) {
                lllllllllllllIIlIlIlllIIIlIllIll.printStackTrace();
                return null;
            }
        }
        
        @Override
        public void close() throws IOException {
            this.field_177330_a.close();
            this.field_177329_c = (InputStreamLeakedResourceLogger.lIIllIIllllIlI[1] != 0);
        }
        
        private static void llIlIlllllllIII() {
            (lIIllIIlllIlll = new String[InputStreamLeakedResourceLogger.lIIllIIllllIlI[3]])[InputStreamLeakedResourceLogger.lIIllIIllllIlI[0]] = llIlIllllllIIlI("JhQOOxMOUR01BQUEHTMTUFFI", "jqoPv");
            InputStreamLeakedResourceLogger.lIIllIIlllIlll[InputStreamLeakedResourceLogger.lIIllIIllllIlI[1]] = llIlIllllllIllI("8XLs+K82v2CF641PZ2DjfooaB52JMmX+", "ZOPcq");
            InputStreamLeakedResourceLogger.lIIllIIlllIlll[InputStreamLeakedResourceLogger.lIIllIIllllIlI[2]] = llIlIllllllIlll("LfuljV6r1qk=", "gFIww");
        }
        
        private static String llIlIllllllIllI(final String lllllllllllllIIlIlIlllIIIllIIlll, final String lllllllllllllIIlIlIlllIIIllIIlII) {
            try {
                final SecretKeySpec lllllllllllllIIlIlIlllIIIllIlIlI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIIlIlIlllIIIllIIlII.getBytes(StandardCharsets.UTF_8)), InputStreamLeakedResourceLogger.lIIllIIllllIlI[4]), "DES");
                final Cipher lllllllllllllIIlIlIlllIIIllIlIIl = Cipher.getInstance("DES");
                lllllllllllllIIlIlIlllIIIllIlIIl.init(InputStreamLeakedResourceLogger.lIIllIIllllIlI[2], lllllllllllllIIlIlIlllIIIllIlIlI);
                return new String(lllllllllllllIIlIlIlllIIIllIlIIl.doFinal(Base64.getDecoder().decode(lllllllllllllIIlIlIlllIIIllIIlll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
            }
            catch (Exception lllllllllllllIIlIlIlllIIIllIlIII) {
                lllllllllllllIIlIlIlllIIIllIlIII.printStackTrace();
                return null;
            }
        }
        
        @Override
        public int read() throws IOException {
            return this.field_177330_a.read();
        }
        
        private static boolean llIlIllllllllll(final int lllllllllllllIIlIlIlllIIIlIlIIlI, final int lllllllllllllIIlIlIlllIIIlIlIIIl) {
            return lllllllllllllIIlIlIlllIIIlIlIIlI < lllllllllllllIIlIlIlllIIIlIlIIIl;
        }
        
        private static boolean llIlIlllllllllI(final int lllllllllllllIIlIlIlllIIIlIIllll) {
            return lllllllllllllIIlIlIlllIIIlIIllll == 0;
        }
        
        private static String llIlIllllllIIlI(String lllllllllllllIIlIlIlllIIIlllIlll, final String lllllllllllllIIlIlIlllIIIllllIll) {
            lllllllllllllIIlIlIlllIIIlllIlll = (double)new String(Base64.getDecoder().decode(((String)lllllllllllllIIlIlIlllIIIlllIlll).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
            final StringBuilder lllllllllllllIIlIlIlllIIIllllIlI = new StringBuilder();
            final char[] lllllllllllllIIlIlIlllIIIllllIIl = lllllllllllllIIlIlIlllIIIllllIll.toCharArray();
            int lllllllllllllIIlIlIlllIIIllllIII = InputStreamLeakedResourceLogger.lIIllIIllllIlI[0];
            final int lllllllllllllIIlIlIlllIIIlllIIlI = (Object)((String)lllllllllllllIIlIlIlllIIIlllIlll).toCharArray();
            final boolean lllllllllllllIIlIlIlllIIIlllIIIl = lllllllllllllIIlIlIlllIIIlllIIlI.length != 0;
            String lllllllllllllIIlIlIlllIIIlllIIII = (String)InputStreamLeakedResourceLogger.lIIllIIllllIlI[0];
            while (llIlIllllllllll((int)lllllllllllllIIlIlIlllIIIlllIIII, lllllllllllllIIlIlIlllIIIlllIIIl ? 1 : 0)) {
                final char lllllllllllllIIlIlIlllIIIlllllIl = lllllllllllllIIlIlIlllIIIlllIIlI[lllllllllllllIIlIlIlllIIIlllIIII];
                lllllllllllllIIlIlIlllIIIllllIlI.append((char)(lllllllllllllIIlIlIlllIIIlllllIl ^ lllllllllllllIIlIlIlllIIIllllIIl[lllllllllllllIIlIlIlllIIIllllIII % lllllllllllllIIlIlIlllIIIllllIIl.length]));
                "".length();
                ++lllllllllllllIIlIlIlllIIIllllIII;
                ++lllllllllllllIIlIlIlllIIIlllIIII;
                "".length();
                if ("  ".length() > "   ".length()) {
                    return null;
                }
            }
            return String.valueOf(lllllllllllllIIlIlIlllIIIllllIlI);
        }
        
        static {
            llIlIllllllllIl();
            llIlIlllllllIII();
        }
        
        public InputStreamLeakedResourceLogger(final InputStream lllllllllllllIIlIlIlllIIlIIlIlII, final ResourceLocation lllllllllllllIIlIlIlllIIlIIlIIll, final String lllllllllllllIIlIlIlllIIlIIlIIIl) {
            this.field_177329_c = (InputStreamLeakedResourceLogger.lIIllIIllllIlI[0] != 0);
            this.field_177330_a = lllllllllllllIIlIlIlllIIlIIlIlII;
            final ByteArrayOutputStream lllllllllllllIIlIlIlllIIlIIllIII = new ByteArrayOutputStream();
            new Exception().printStackTrace(new PrintStream(lllllllllllllIIlIlIlllIIlIIllIII));
            this.field_177328_b = String.valueOf(new StringBuilder(InputStreamLeakedResourceLogger.lIIllIIlllIlll[InputStreamLeakedResourceLogger.lIIllIIllllIlI[0]]).append(lllllllllllllIIlIlIlllIIlIIlIIll).append(InputStreamLeakedResourceLogger.lIIllIIlllIlll[InputStreamLeakedResourceLogger.lIIllIIllllIlI[1]]).append(lllllllllllllIIlIlIlllIIlIIlIIIl).append(InputStreamLeakedResourceLogger.lIIllIIlllIlll[InputStreamLeakedResourceLogger.lIIllIIllllIlI[2]]).append(lllllllllllllIIlIlIlllIIlIIllIII.toString()));
        }
        
        private static void llIlIllllllllIl() {
            (lIIllIIllllIlI = new int[5])[0] = ((0x66 ^ 0x31) & ~(0x58 ^ 0xF));
            InputStreamLeakedResourceLogger.lIIllIIllllIlI[1] = " ".length();
            InputStreamLeakedResourceLogger.lIIllIIllllIlI[2] = "  ".length();
            InputStreamLeakedResourceLogger.lIIllIIllllIlI[3] = "   ".length();
            InputStreamLeakedResourceLogger.lIIllIIllllIlI[4] = (0xC8 ^ 0xC0);
        }
    }
}
