// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.client.resources;

import java.util.Iterator;
import com.google.common.collect.Maps;
import java.io.IOException;
import net.minecraft.client.resources.data.LanguageMetadataSection;
import org.apache.logging.log4j.LogManager;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.security.MessageDigest;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.List;
import net.minecraft.util.StringTranslate;
import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import java.util.SortedSet;
import net.minecraft.client.resources.data.IMetadataSerializer;
import org.apache.logging.log4j.Logger;
import java.util.Map;

public class LanguageManager implements IResourceManagerReloadListener
{
    private /* synthetic */ Map<String, Language> languageMap;
    private static final /* synthetic */ String[] llIIIIIIIlIIII;
    protected static final /* synthetic */ Locale currentLocale;
    private static final /* synthetic */ Logger logger;
    private static final /* synthetic */ int[] llIIIIIIIlIIIl;
    private /* synthetic */ String currentLanguage;
    private final /* synthetic */ IMetadataSerializer theMetadataSerializer;
    
    public SortedSet<Language> getLanguages() {
        return (SortedSet<Language>)Sets.newTreeSet((Iterable)this.languageMap.values());
    }
    
    private static boolean lIIIIllIlIIlIllI(final int llllllllllllIllllIIIIlIllIIIIIII, final int llllllllllllIllllIIIIlIlIlllllll) {
        return llllllllllllIllllIIIIlIllIIIIIII < llllllllllllIllllIIIIlIlIlllllll;
    }
    
    public boolean isCurrentLanguageBidirectional() {
        if (lIIIIllIlIIlIIll(this.getCurrentLanguage()) && lIIIIllIlIIlIlIl(this.getCurrentLanguage().isBidirectional() ? 1 : 0)) {
            return LanguageManager.llIIIIIIIlIIIl[1] != 0;
        }
        return LanguageManager.llIIIIIIIlIIIl[0] != 0;
    }
    
    private static boolean lIIIIllIlIIlIlIl(final int llllllllllllIllllIIIIlIlIllllIll) {
        return llllllllllllIllllIIIIlIlIllllIll != 0;
    }
    
    private static boolean lIIIIllIlIIlIIll(final Object llllllllllllIllllIIIIlIlIlllllIl) {
        return llllllllllllIllllIIIIlIlIlllllIl != null;
    }
    
    public boolean isCurrentLocaleUnicode() {
        return LanguageManager.currentLocale.isUnicode();
    }
    
    @Override
    public void onResourceManagerReload(final IResourceManager llllllllllllIllllIIIIlIllIllllII) {
        final String[] array = new String[LanguageManager.llIIIIIIIlIIIl[1]];
        array[LanguageManager.llIIIIIIIlIIIl[0]] = LanguageManager.llIIIIIIIlIIII[LanguageManager.llIIIIIIIlIIIl[3]];
        final List<String> llllllllllllIllllIIIIlIllIlllIll = (List<String>)Lists.newArrayList((Object[])array);
        if (lIIIIllIlIIlIlII(LanguageManager.llIIIIIIIlIIII[LanguageManager.llIIIIIIIlIIIl[4]].equals(this.currentLanguage) ? 1 : 0)) {
            llllllllllllIllllIIIIlIllIlllIll.add(this.currentLanguage);
            "".length();
        }
        LanguageManager.currentLocale.loadLocaleDataFiles(llllllllllllIllllIIIIlIllIllllII, llllllllllllIllllIIIIlIllIlllIll);
        StringTranslate.replaceWith(LanguageManager.currentLocale.properties);
    }
    
    private static String lIIIIllIlIIlIIII(String llllllllllllIllllIIIIlIllIIllIII, final String llllllllllllIllllIIIIlIllIIlllII) {
        llllllllllllIllllIIIIlIllIIllIII = (float)new String(Base64.getDecoder().decode(((String)llllllllllllIllllIIIIlIllIIllIII).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder llllllllllllIllllIIIIlIllIIllIll = new StringBuilder();
        final char[] llllllllllllIllllIIIIlIllIIllIlI = llllllllllllIllllIIIIlIllIIlllII.toCharArray();
        int llllllllllllIllllIIIIlIllIIllIIl = LanguageManager.llIIIIIIIlIIIl[0];
        final double llllllllllllIllllIIIIlIllIIlIIll = (Object)((String)llllllllllllIllllIIIIlIllIIllIII).toCharArray();
        final String llllllllllllIllllIIIIlIllIIlIIlI = (String)llllllllllllIllllIIIIlIllIIlIIll.length;
        long llllllllllllIllllIIIIlIllIIlIIIl = LanguageManager.llIIIIIIIlIIIl[0];
        while (lIIIIllIlIIlIllI((int)llllllllllllIllllIIIIlIllIIlIIIl, (int)llllllllllllIllllIIIIlIllIIlIIlI)) {
            final char llllllllllllIllllIIIIlIllIIllllI = llllllllllllIllllIIIIlIllIIlIIll[llllllllllllIllllIIIIlIllIIlIIIl];
            llllllllllllIllllIIIIlIllIIllIll.append((char)(llllllllllllIllllIIIIlIllIIllllI ^ llllllllllllIllllIIIIlIllIIllIlI[llllllllllllIllllIIIIlIllIIllIIl % llllllllllllIllllIIIIlIllIIllIlI.length]));
            "".length();
            ++llllllllllllIllllIIIIlIllIIllIIl;
            ++llllllllllllIllllIIIIlIllIIlIIIl;
            "".length();
            if ("   ".length() != "   ".length()) {
                return null;
            }
        }
        return String.valueOf(llllllllllllIllllIIIIlIllIIllIll);
    }
    
    private static void lIIIIllIlIIlIIIl() {
        (llIIIIIIIlIIII = new String[LanguageManager.llIIIIIIIlIIIl[6]])[LanguageManager.llIIIIIIIlIIIl[0]] = lIIIIllIlIIIllll("YO9aNq4wbW73UTyd3cMnoQ==", "thBCz");
        LanguageManager.llIIIIIIIlIIII[LanguageManager.llIIIIIIIlIIIl[1]] = lIIIIllIlIIlIIII("GxwHNycrUhI6az4TFCYubh8DISoqExI0az0XBSEiIRxGOi1uAAMmJDsABTA7LxENb2s=", "NrfUK");
        LanguageManager.llIIIIIIIlIIII[LanguageManager.llIIIIIIIlIIIl[2]] = lIIIIllIlIIlIIII("OD0ADS4IcxUAYh0yExwnTT4EGyMJMhUOYh42AhsrAj1BACRNIQQcLRghAgoyDDAKVWI=", "mSaoB");
        LanguageManager.llIIIIIIIlIIII[LanguageManager.llIIIIIIIlIIIl[3]] = lIIIIllIlIIIllll("aYq484eZRkM=", "HjinR");
        LanguageManager.llIIIIIIIlIIII[LanguageManager.llIIIIIIIlIIIl[4]] = lIIIIllIlIIIllll("T/VjMPjOu30=", "IcsZp");
        LanguageManager.llIIIIIIIlIIII[LanguageManager.llIIIIIIIlIIIl[5]] = lIIIIllIlIIIllll("X7B4Yhltc+E=", "cqDAm");
    }
    
    private static String lIIIIllIlIIIllll(final String llllllllllllIllllIIIIlIllIIIlIII, final String llllllllllllIllllIIIIlIllIIIIlll) {
        try {
            final SecretKeySpec llllllllllllIllllIIIIlIllIIIlIll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIllllIIIIlIllIIIIlll.getBytes(StandardCharsets.UTF_8)), LanguageManager.llIIIIIIIlIIIl[7]), "DES");
            final Cipher llllllllllllIllllIIIIlIllIIIlIlI = Cipher.getInstance("DES");
            llllllllllllIllllIIIIlIllIIIlIlI.init(LanguageManager.llIIIIIIIlIIIl[2], llllllllllllIllllIIIIlIllIIIlIll);
            return new String(llllllllllllIllllIIIIlIllIIIlIlI.doFinal(Base64.getDecoder().decode(llllllllllllIllllIIIIlIllIIIlIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIllllIIIIlIllIIIlIIl) {
            llllllllllllIllllIIIIlIllIIIlIIl.printStackTrace();
            return null;
        }
    }
    
    private static void lIIIIllIlIIlIIlI() {
        (llIIIIIIIlIIIl = new int[8])[0] = ((0x70 ^ 0x7E ^ (0x11 ^ 0xD)) & (0x79 ^ 0x72 ^ (0xAB ^ 0xB2) ^ -" ".length()));
        LanguageManager.llIIIIIIIlIIIl[1] = " ".length();
        LanguageManager.llIIIIIIIlIIIl[2] = "  ".length();
        LanguageManager.llIIIIIIIlIIIl[3] = "   ".length();
        LanguageManager.llIIIIIIIlIIIl[4] = (0x77 ^ 0x73);
        LanguageManager.llIIIIIIIlIIIl[5] = (0x12 ^ 0x17);
        LanguageManager.llIIIIIIIlIIIl[6] = (0x42 ^ 0x44);
        LanguageManager.llIIIIIIIlIIIl[7] = (0x63 ^ 0x6B);
    }
    
    public Language getCurrentLanguage() {
        Language language;
        if (lIIIIllIlIIlIlIl(this.languageMap.containsKey(this.currentLanguage) ? 1 : 0)) {
            language = this.languageMap.get(this.currentLanguage);
            "".length();
            if ("   ".length() <= 0) {
                return null;
            }
        }
        else {
            language = this.languageMap.get(LanguageManager.llIIIIIIIlIIII[LanguageManager.llIIIIIIIlIIIl[5]]);
        }
        return language;
    }
    
    static {
        lIIIIllIlIIlIIlI();
        lIIIIllIlIIlIIIl();
        logger = LogManager.getLogger();
        currentLocale = new Locale();
    }
    
    private static boolean lIIIIllIlIIlIlII(final int llllllllllllIllllIIIIlIlIllllIIl) {
        return llllllllllllIllllIIIIlIlIllllIIl == 0;
    }
    
    public void parseLanguageMetadata(final List<IResourcePack> llllllllllllIllllIIIIlIlllIIIllI) {
        this.languageMap.clear();
        final byte llllllllllllIllllIIIIlIlllIIIlII = (byte)llllllllllllIllllIIIIlIlllIIIllI.iterator();
        "".length();
        if (((121 + 6 - 124 + 166 ^ 30 + 119 - 135 + 114) & (0x3D ^ 0x2A ^ (0xB ^ 0x35) ^ -" ".length())) <= -" ".length()) {
            return;
        }
        while (!lIIIIllIlIIlIlII(((Iterator)llllllllllllIllllIIIIlIlllIIIlII).hasNext() ? 1 : 0)) {
            final IResourcePack llllllllllllIllllIIIIlIlllIIllII = ((Iterator<IResourcePack>)llllllllllllIllllIIIIlIlllIIIlII).next();
            try {
                final LanguageMetadataSection llllllllllllIllllIIIIlIlllIIlIll = llllllllllllIllllIIIIlIlllIIllII.getPackMetadata(this.theMetadataSerializer, LanguageManager.llIIIIIIIlIIII[LanguageManager.llIIIIIIIlIIIl[0]]);
                if (!lIIIIllIlIIlIIll(llllllllllllIllllIIIIlIlllIIlIll)) {
                    continue;
                }
                final float llllllllllllIllllIIIIlIlllIIIIIl = (float)llllllllllllIllllIIIIlIlllIIlIll.getLanguages().iterator();
                "".length();
                if (null != null) {
                    return;
                }
                while (!lIIIIllIlIIlIlII(((Iterator)llllllllllllIllllIIIIlIlllIIIIIl).hasNext() ? 1 : 0)) {
                    final Language llllllllllllIllllIIIIlIlllIIlIlI = ((Iterator<Language>)llllllllllllIllllIIIIlIlllIIIIIl).next();
                    if (lIIIIllIlIIlIlII(this.languageMap.containsKey(llllllllllllIllllIIIIlIlllIIlIlI.getLanguageCode()) ? 1 : 0)) {
                        this.languageMap.put(llllllllllllIllllIIIIlIlllIIlIlI.getLanguageCode(), llllllllllllIllllIIIIlIlllIIlIlI);
                        "".length();
                    }
                }
                "".length();
                if (" ".length() <= 0) {
                    return;
                }
                continue;
            }
            catch (RuntimeException llllllllllllIllllIIIIlIlllIIlIIl) {
                LanguageManager.logger.warn(String.valueOf(new StringBuilder(LanguageManager.llIIIIIIIlIIII[LanguageManager.llIIIIIIIlIIIl[1]]).append(llllllllllllIllllIIIIlIlllIIllII.getPackName())), (Throwable)llllllllllllIllllIIIIlIlllIIlIIl);
                "".length();
                if (null != null) {
                    return;
                }
                continue;
            }
            catch (IOException llllllllllllIllllIIIIlIlllIIlIII) {
                LanguageManager.logger.warn(String.valueOf(new StringBuilder(LanguageManager.llIIIIIIIlIIII[LanguageManager.llIIIIIIIlIIIl[2]]).append(llllllllllllIllllIIIIlIlllIIllII.getPackName())), (Throwable)llllllllllllIllllIIIIlIlllIIlIII);
            }
        }
    }
    
    public void setCurrentLanguage(final Language llllllllllllIllllIIIIlIllIllIIII) {
        this.currentLanguage = llllllllllllIllllIIIIlIllIllIIII.getLanguageCode();
    }
    
    public LanguageManager(final IMetadataSerializer llllllllllllIllllIIIIlIlllIllIlI, final String llllllllllllIllllIIIIlIlllIllIIl) {
        this.languageMap = (Map<String, Language>)Maps.newHashMap();
        this.theMetadataSerializer = llllllllllllIllllIIIIlIlllIllIlI;
        this.currentLanguage = llllllllllllIllllIIIIlIlllIllIIl;
        I18n.setLocale(LanguageManager.currentLocale);
    }
}
