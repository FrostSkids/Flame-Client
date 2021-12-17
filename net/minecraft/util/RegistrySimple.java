// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.util;

import java.util.Iterator;
import org.apache.commons.lang3.Validate;
import java.util.Collections;
import java.util.Set;
import java.util.Arrays;
import com.google.common.collect.Maps;
import org.apache.logging.log4j.LogManager;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import org.apache.logging.log4j.Logger;
import java.util.Map;

public class RegistrySimple<K, V> implements IRegistry<K, V>
{
    private static final /* synthetic */ String[] llIIlllIIIIllI;
    protected final /* synthetic */ Map<K, V> registryObjects;
    private static final /* synthetic */ int[] llIIlllIIIIlll;
    private static final /* synthetic */ Logger logger;
    
    public boolean containsKey(final K llllllllllllIllIlllllIlIIllIIIII) {
        return this.registryObjects.containsKey(llllllllllllIllIlllllIlIIllIIIII);
    }
    
    private static String lIIIllllIllIIIII(final String llllllllllllIllIlllllIlIIlIlIlIl, final String llllllllllllIllIlllllIlIIlIlIlII) {
        try {
            final SecretKeySpec llllllllllllIllIlllllIlIIlIllIII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIllIlllllIlIIlIlIlII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher llllllllllllIllIlllllIlIIlIlIlll = Cipher.getInstance("Blowfish");
            llllllllllllIllIlllllIlIIlIlIlll.init(RegistrySimple.llIIlllIIIIlll[2], llllllllllllIllIlllllIlIIlIllIII);
            return new String(llllllllllllIllIlllllIlIIlIlIlll.doFinal(Base64.getDecoder().decode(llllllllllllIllIlllllIlIIlIlIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIllIlllllIlIIlIlIllI) {
            llllllllllllIllIlllllIlIIlIlIllI.printStackTrace();
            return null;
        }
    }
    
    static {
        lIIIllllIllIIIlI();
        lIIIllllIllIIIIl();
        logger = LogManager.getLogger();
    }
    
    @Override
    public V getObject(final K llllllllllllIllIlllllIlIIlllIIlI) {
        return this.registryObjects.get(llllllllllllIllIlllllIlIIlllIIlI);
    }
    
    private static void lIIIllllIllIIIlI() {
        (llIIlllIIIIlll = new int[4])[0] = ((0xDB ^ 0xBA) & ~(0xFB ^ 0x9A));
        RegistrySimple.llIIlllIIIIlll[1] = " ".length();
        RegistrySimple.llIIlllIIIIlll[2] = "  ".length();
        RegistrySimple.llIIlllIIIIlll[3] = (0xB3 ^ 0xBB);
    }
    
    private static void lIIIllllIllIIIIl() {
        (llIIlllIIIIllI = new String[RegistrySimple.llIIlllIIIIlll[2]])[RegistrySimple.llIIlllIIIIlll[0]] = lIIIllllIlIlllll("ioDDUHBleYAD3GDw6FLMcR1KFuIjuX/h", "BwmpG");
        RegistrySimple.llIIlllIIIIllI[RegistrySimple.llIIlllIIIIlll[1]] = lIIIllllIllIIIII("REPCcUbi86Gsm+RmZis4Pg==", "huWyg");
    }
    
    protected Map<K, V> createUnderlyingMap() {
        return (Map<K, V>)Maps.newHashMap();
    }
    
    public RegistrySimple() {
        this.registryObjects = this.createUnderlyingMap();
    }
    
    private static String lIIIllllIlIlllll(final String llllllllllllIllIlllllIlIIlIIlIII, final String llllllllllllIllIlllllIlIIlIIIlll) {
        try {
            final SecretKeySpec llllllllllllIllIlllllIlIIlIIlIll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIllIlllllIlIIlIIIlll.getBytes(StandardCharsets.UTF_8)), RegistrySimple.llIIlllIIIIlll[3]), "DES");
            final Cipher llllllllllllIllIlllllIlIIlIIlIlI = Cipher.getInstance("DES");
            llllllllllllIllIlllllIlIIlIIlIlI.init(RegistrySimple.llIIlllIIIIlll[2], llllllllllllIllIlllllIlIIlIIlIll);
            return new String(llllllllllllIllIlllllIlIIlIIlIlI.doFinal(Base64.getDecoder().decode(llllllllllllIllIlllllIlIIlIIlIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIllIlllllIlIIlIIlIIl) {
            llllllllllllIllIlllllIlIIlIIlIIl.printStackTrace();
            return null;
        }
    }
    
    public Set<K> getKeys() {
        return Collections.unmodifiableSet((Set<? extends K>)this.registryObjects.keySet());
    }
    
    @Override
    public void putObject(final K llllllllllllIllIlllllIlIIllIlIlI, final V llllllllllllIllIlllllIlIIllIlIIl) {
        Validate.notNull((Object)llllllllllllIllIlllllIlIIllIlIlI);
        "".length();
        Validate.notNull((Object)llllllllllllIllIlllllIlIIllIlIIl);
        "".length();
        if (lIIIllllIllIIIll(this.registryObjects.containsKey(llllllllllllIllIlllllIlIIllIlIlI) ? 1 : 0)) {
            RegistrySimple.logger.debug(String.valueOf(new StringBuilder(RegistrySimple.llIIlllIIIIllI[RegistrySimple.llIIlllIIIIlll[0]]).append(llllllllllllIllIlllllIlIIllIlIlI).append(RegistrySimple.llIIlllIIIIllI[RegistrySimple.llIIlllIIIIlll[1]])));
        }
        this.registryObjects.put(llllllllllllIllIlllllIlIIllIlIlI, llllllllllllIllIlllllIlIIllIlIIl);
        "".length();
    }
    
    @Override
    public Iterator<V> iterator() {
        return this.registryObjects.values().iterator();
    }
    
    private static boolean lIIIllllIllIIIll(final int llllllllllllIllIlllllIlIIlIIIIIl) {
        return llllllllllllIllIlllllIlIIlIIIIIl != 0;
    }
}
