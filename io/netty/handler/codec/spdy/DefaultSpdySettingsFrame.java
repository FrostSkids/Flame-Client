// 
// Decompiled by Procyon v0.5.36
// 

package io.netty.handler.codec.spdy;

import java.util.Arrays;
import java.util.Iterator;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.security.MessageDigest;
import java.util.TreeMap;
import io.netty.util.internal.StringUtil;
import java.util.Set;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.Map;

public class DefaultSpdySettingsFrame implements SpdySettingsFrame
{
    private final /* synthetic */ Map<Integer, Setting> settingsMap;
    private static final /* synthetic */ String[] llIIIllIlIllll;
    private static final /* synthetic */ int[] llIIIlllIIIIIl;
    private /* synthetic */ boolean clear;
    
    @Override
    public boolean isSet(final int llllllllllllIlllIlIIIllIlIIIIIIl) {
        final Integer llllllllllllIlllIlIIIllIlIIIIIII = llllllllllllIlllIlIIIllIlIIIIIIl;
        return this.settingsMap.containsKey(llllllllllllIlllIlIIIllIlIIIIIII);
    }
    
    @Override
    public boolean isPersistValue(final int llllllllllllIlllIlIIIllIIlIIlIII) {
        final Integer llllllllllllIlllIlIIIllIIlIIIlll = llllllllllllIlllIlIIIllIIlIIlIII;
        if (lIIIlIlIlIlIlllI(this.settingsMap.containsKey(llllllllllllIlllIlIIIllIIlIIIlll) ? 1 : 0)) {
            return this.settingsMap.get(llllllllllllIlllIlIIIllIIlIIIlll).isPersist();
        }
        return DefaultSpdySettingsFrame.llIIIlllIIIIIl[1] != 0;
    }
    
    private static String lIIIlIlIlIIIIIII(String llllllllllllIlllIlIIIlIlllllIIlI, final String llllllllllllIlllIlIIIlIlllllIIIl) {
        llllllllllllIlllIlIIIlIlllllIIlI = new String(Base64.getDecoder().decode(llllllllllllIlllIlIIIlIlllllIIlI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder llllllllllllIlllIlIIIlIlllllIlIl = new StringBuilder();
        final char[] llllllllllllIlllIlIIIlIlllllIlII = llllllllllllIlllIlIIIlIlllllIIIl.toCharArray();
        int llllllllllllIlllIlIIIlIlllllIIll = DefaultSpdySettingsFrame.llIIIlllIIIIIl[1];
        final int llllllllllllIlllIlIIIlIllllIllIl = (Object)llllllllllllIlllIlIIIlIlllllIIlI.toCharArray();
        final byte llllllllllllIlllIlIIIlIllllIllII = (byte)llllllllllllIlllIlIIIlIllllIllIl.length;
        byte llllllllllllIlllIlIIIlIllllIlIll = (byte)DefaultSpdySettingsFrame.llIIIlllIIIIIl[1];
        while (lIIIlIlIlIllIIIl(llllllllllllIlllIlIIIlIllllIlIll, llllllllllllIlllIlIIIlIllllIllII)) {
            final char llllllllllllIlllIlIIIlIllllllIII = llllllllllllIlllIlIIIlIllllIllIl[llllllllllllIlllIlIIIlIllllIlIll];
            llllllllllllIlllIlIIIlIlllllIlIl.append((char)(llllllllllllIlllIlIIIlIllllllIII ^ llllllllllllIlllIlIIIlIlllllIlII[llllllllllllIlllIlIIIlIlllllIIll % llllllllllllIlllIlIIIlIlllllIlII.length]));
            "".length();
            ++llllllllllllIlllIlIIIlIlllllIIll;
            ++llllllllllllIlllIlIIIlIllllIlIll;
            "".length();
            if (null != null) {
                return null;
            }
        }
        return String.valueOf(llllllllllllIlllIlIIIlIlllllIlIl);
    }
    
    @Override
    public boolean clearPreviouslyPersistedSettings() {
        return this.clear;
    }
    
    private static boolean lIIIlIlIlIlIllll(final int llllllllllllIlllIlIIIlIlllIIIlII) {
        return llllllllllllIlllIlIIIlIlllIIIlII >= 0;
    }
    
    @Override
    public SpdySettingsFrame setClearPreviouslyPersistedSettings(final boolean llllllllllllIlllIlIIIllIIIIlllII) {
        this.clear = llllllllllllIlllIlIIIllIIIIlllII;
        return this;
    }
    
    private static boolean lIIIlIlIlIlIlllI(final int llllllllllllIlllIlIIIlIlllIIIllI) {
        return llllllllllllIlllIlIIIlIlllIIIllI != 0;
    }
    
    private Set<Map.Entry<Integer, Setting>> getSettings() {
        return this.settingsMap.entrySet();
    }
    
    @Override
    public String toString() {
        final StringBuilder llllllllllllIlllIlIIIllIIIIIIlII = new StringBuilder();
        llllllllllllIlllIlIIIllIIIIIIlII.append(StringUtil.simpleClassName(this));
        "".length();
        llllllllllllIlllIlIIIllIIIIIIlII.append(StringUtil.NEWLINE);
        "".length();
        this.appendSettings(llllllllllllIlllIlIIIllIIIIIIlII);
        llllllllllllIlllIlIIIllIIIIIIlII.setLength(llllllllllllIlllIlIIIllIIIIIIlII.length() - StringUtil.NEWLINE.length());
        return String.valueOf(llllllllllllIlllIlIIIllIIIIIIlII);
    }
    
    @Override
    public SpdySettingsFrame removeValue(final int llllllllllllIlllIlIIIllIIlIIlllI) {
        final Integer llllllllllllIlllIlIIIllIIlIlIIII = llllllllllllIlllIlIIIllIIlIIlllI;
        if (lIIIlIlIlIlIlllI(this.settingsMap.containsKey(llllllllllllIlllIlIIIllIIlIlIIII) ? 1 : 0)) {
            this.settingsMap.remove(llllllllllllIlllIlIIIllIIlIlIIII);
            "".length();
        }
        return this;
    }
    
    @Override
    public SpdySettingsFrame setPersistValue(final int llllllllllllIlllIlIIIllIIIlllIlI, final boolean llllllllllllIlllIlIIIllIIIllllIl) {
        final Integer llllllllllllIlllIlIIIllIIIllllII = llllllllllllIlllIlIIIllIIIlllIlI;
        if (lIIIlIlIlIlIlllI(this.settingsMap.containsKey(llllllllllllIlllIlIIIllIIIllllII) ? 1 : 0)) {
            this.settingsMap.get(llllllllllllIlllIlIIIllIIIllllII).setPersist(llllllllllllIlllIlIIIllIIIllllIl);
        }
        return this;
    }
    
    public DefaultSpdySettingsFrame() {
        this.settingsMap = new TreeMap<Integer, Setting>();
    }
    
    @Override
    public SpdySettingsFrame setValue(final int llllllllllllIlllIlIIIllIIllIllll, final int llllllllllllIlllIlIIIllIIllIlllI) {
        return this.setValue(llllllllllllIlllIlIIIllIIllIllll, llllllllllllIlllIlIIIllIIllIlllI, (boolean)(DefaultSpdySettingsFrame.llIIIlllIIIIIl[1] != 0), (boolean)(DefaultSpdySettingsFrame.llIIIlllIIIIIl[1] != 0));
    }
    
    @Override
    public SpdySettingsFrame setPersisted(final int llllllllllllIlllIlIIIllIIIlIIlIl, final boolean llllllllllllIlllIlIIIllIIIlIIlII) {
        final Integer llllllllllllIlllIlIIIllIIIlIIlll = llllllllllllIlllIlIIIllIIIlIIlIl;
        if (lIIIlIlIlIlIlllI(this.settingsMap.containsKey(llllllllllllIlllIlIIIllIIIlIIlll) ? 1 : 0)) {
            this.settingsMap.get(llllllllllllIlllIlIIIllIIIlIIlll).setPersisted(llllllllllllIlllIlIIIllIIIlIIlII);
        }
        return this;
    }
    
    private static String lIIIlIlIIlllllll(final String llllllllllllIlllIlIIIlIlllIlIIll, final String llllllllllllIlllIlIIIlIlllIlIIlI) {
        try {
            final SecretKeySpec llllllllllllIlllIlIIIlIlllIllIII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIlllIlIIIlIlllIlIIlI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher llllllllllllIlllIlIIIlIlllIlIlll = Cipher.getInstance("Blowfish");
            llllllllllllIlllIlIIIlIlllIlIlll.init(DefaultSpdySettingsFrame.llIIIlllIIIIIl[5], llllllllllllIlllIlIIIlIlllIllIII);
            return new String(llllllllllllIlllIlIIIlIlllIlIlll.doFinal(Base64.getDecoder().decode(llllllllllllIlllIlIIIlIlllIlIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIlllIlIIIlIlllIlIllI) {
            llllllllllllIlllIlIIIlIlllIlIllI.printStackTrace();
            return null;
        }
    }
    
    private void appendSettings(final StringBuilder llllllllllllIlllIlIIIllIIIIIlIll) {
        final Iterator llllllllllllIlllIlIIIllIIIIIllll = this.getSettings().iterator();
        while (lIIIlIlIlIlIlllI(llllllllllllIlllIlIIIllIIIIIllll.hasNext() ? 1 : 0)) {
            final Map.Entry<Integer, Setting> llllllllllllIlllIlIIIllIIIIlIIII = llllllllllllIlllIlIIIllIIIIIllll.next();
            final Setting llllllllllllIlllIlIIIllIIIIlIIIl = llllllllllllIlllIlIIIllIIIIlIIII.getValue();
            llllllllllllIlllIlIIIllIIIIIlIll.append(DefaultSpdySettingsFrame.llIIIllIlIllll[DefaultSpdySettingsFrame.llIIIlllIIIIIl[3]]);
            "".length();
            llllllllllllIlllIlIIIllIIIIIlIll.append(llllllllllllIlllIlIIIllIIIIlIIII.getKey());
            "".length();
            llllllllllllIlllIlIIIllIIIIIlIll.append((char)DefaultSpdySettingsFrame.llIIIlllIIIIIl[4]);
            "".length();
            llllllllllllIlllIlIIIllIIIIIlIll.append(llllllllllllIlllIlIIIllIIIIlIIIl.getValue());
            "".length();
            llllllllllllIlllIlIIIllIIIIIlIll.append(DefaultSpdySettingsFrame.llIIIllIlIllll[DefaultSpdySettingsFrame.llIIIlllIIIIIl[5]]);
            "".length();
            llllllllllllIlllIlIIIllIIIIIlIll.append(llllllllllllIlllIlIIIllIIIIlIIIl.isPersist());
            "".length();
            llllllllllllIlllIlIIIllIIIIIlIll.append(DefaultSpdySettingsFrame.llIIIllIlIllll[DefaultSpdySettingsFrame.llIIIlllIIIIIl[6]]);
            "".length();
            llllllllllllIlllIlIIIllIIIIIlIll.append(llllllllllllIlllIlIIIllIIIIlIIIl.isPersisted());
            "".length();
            llllllllllllIlllIlIIIllIIIIIlIll.append((char)DefaultSpdySettingsFrame.llIIIlllIIIIIl[7]);
            "".length();
            llllllllllllIlllIlIIIllIIIIIlIll.append(StringUtil.NEWLINE);
            "".length();
            "".length();
            if (" ".length() < 0) {
                return;
            }
        }
    }
    
    @Override
    public Set<Integer> ids() {
        return this.settingsMap.keySet();
    }
    
    @Override
    public boolean isPersisted(final int llllllllllllIlllIlIIIllIIIllIIII) {
        final Integer llllllllllllIlllIlIIIllIIIllIIlI = llllllllllllIlllIlIIIllIIIllIIII;
        if (lIIIlIlIlIlIlllI(this.settingsMap.containsKey(llllllllllllIlllIlIIIllIIIllIIlI) ? 1 : 0)) {
            return this.settingsMap.get(llllllllllllIlllIlIIIllIIIllIIlI).isPersisted();
        }
        return DefaultSpdySettingsFrame.llIIIlllIIIIIl[1] != 0;
    }
    
    static {
        lIIIlIlIlIlIllIl();
        lIIIlIlIlIIIIIlI();
    }
    
    @Override
    public int getValue(final int llllllllllllIlllIlIIIllIIllllIII) {
        final Integer llllllllllllIlllIlIIIllIIlllIlll = llllllllllllIlllIlIIIllIIllllIII;
        if (lIIIlIlIlIlIlllI(this.settingsMap.containsKey(llllllllllllIlllIlIIIllIIlllIlll) ? 1 : 0)) {
            return this.settingsMap.get(llllllllllllIlllIlIIIllIIlllIlll).getValue();
        }
        return DefaultSpdySettingsFrame.llIIIlllIIIIIl[0];
    }
    
    @Override
    public SpdySettingsFrame setValue(final int llllllllllllIlllIlIIIllIIllIIIIl, final int llllllllllllIlllIlIIIllIIlIllIlI, final boolean llllllllllllIlllIlIIIllIIlIllIIl, final boolean llllllllllllIlllIlIIIllIIlIllIII) {
        if (!lIIIlIlIlIlIllll(llllllllllllIlllIlIIIllIIllIIIIl) || lIIIlIlIlIllIIII(llllllllllllIlllIlIIIllIIllIIIIl, DefaultSpdySettingsFrame.llIIIlllIIIIIl[2])) {
            throw new IllegalArgumentException(String.valueOf(new StringBuilder().append(DefaultSpdySettingsFrame.llIIIllIlIllll[DefaultSpdySettingsFrame.llIIIlllIIIIIl[1]]).append(llllllllllllIlllIlIIIllIIllIIIIl)));
        }
        final Integer llllllllllllIlllIlIIIllIIlIlllIl = llllllllllllIlllIlIIIllIIllIIIIl;
        if (lIIIlIlIlIlIlllI(this.settingsMap.containsKey(llllllllllllIlllIlIIIllIIlIlllIl) ? 1 : 0)) {
            final Setting llllllllllllIlllIlIIIllIIllIIIll = this.settingsMap.get(llllllllllllIlllIlIIIllIIlIlllIl);
            llllllllllllIlllIlIIIllIIllIIIll.setValue(llllllllllllIlllIlIIIllIIlIllIlI);
            llllllllllllIlllIlIIIllIIllIIIll.setPersist(llllllllllllIlllIlIIIllIIlIllIIl);
            llllllllllllIlllIlIIIllIIllIIIll.setPersisted(llllllllllllIlllIlIIIllIIlIllIII);
            "".length();
            if ((0x37 ^ 0x33) < 0) {
                return null;
            }
        }
        else {
            this.settingsMap.put(llllllllllllIlllIlIIIllIIlIlllIl, new Setting(llllllllllllIlllIlIIIllIIlIllIlI, llllllllllllIlllIlIIIllIIlIllIIl, llllllllllllIlllIlIIIllIIlIllIII));
            "".length();
        }
        return this;
    }
    
    private static String lIIIlIlIlIIIIIIl(final String llllllllllllIlllIlIIIlIllllIIIlI, final String llllllllllllIlllIlIIIlIlllIlllll) {
        try {
            final SecretKeySpec llllllllllllIlllIlIIIlIllllIIlIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIlllIlIIIlIlllIlllll.getBytes(StandardCharsets.UTF_8)), DefaultSpdySettingsFrame.llIIIlllIIIIIl[9]), "DES");
            final Cipher llllllllllllIlllIlIIIlIllllIIlII = Cipher.getInstance("DES");
            llllllllllllIlllIlIIIlIllllIIlII.init(DefaultSpdySettingsFrame.llIIIlllIIIIIl[5], llllllllllllIlllIlIIIlIllllIIlIl);
            return new String(llllllllllllIlllIlIIIlIllllIIlII.doFinal(Base64.getDecoder().decode(llllllllllllIlllIlIIIlIllllIIIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIlllIlIIIlIllllIIIll) {
            llllllllllllIlllIlIIIlIllllIIIll.printStackTrace();
            return null;
        }
    }
    
    private static void lIIIlIlIlIlIllIl() {
        (llIIIlllIIIIIl = new int[10])[0] = -" ".length();
        DefaultSpdySettingsFrame.llIIIlllIIIIIl[1] = ((113 + 59 - 146 + 117 ^ 85 + 64 - 135 + 114) & (0xB4 ^ 0x95 ^ (0xED ^ 0xC3) ^ -" ".length()));
        DefaultSpdySettingsFrame.llIIIlllIIIIIl[2] = (-" ".length() & (-1 & 0xFFFFFF));
        DefaultSpdySettingsFrame.llIIIlllIIIIIl[3] = " ".length();
        DefaultSpdySettingsFrame.llIIIlllIIIIIl[4] = (0x7B ^ 0x2A ^ (0x78 ^ 0x13));
        DefaultSpdySettingsFrame.llIIIlllIIIIIl[5] = "  ".length();
        DefaultSpdySettingsFrame.llIIIlllIIIIIl[6] = "   ".length();
        DefaultSpdySettingsFrame.llIIIlllIIIIIl[7] = (0x84 ^ 0x8A ^ (0x44 ^ 0x63));
        DefaultSpdySettingsFrame.llIIIlllIIIIIl[8] = (0xD1 ^ 0x8C ^ (0x48 ^ 0x11));
        DefaultSpdySettingsFrame.llIIIlllIIIIIl[9] = (0xB6 ^ 0xBE);
    }
    
    private static void lIIIlIlIlIIIIIlI() {
        (llIIIllIlIllll = new String[DefaultSpdySettingsFrame.llIIIlllIIIIIl[8]])[DefaultSpdySettingsFrame.llIIIlllIIIIIl[1]] = lIIIlIlIIlllllll("lfNBrGeGRR7ZjoPGtv6lEIccZRcNZAX3H+UN3KrUYDs=", "hSfMM");
        DefaultSpdySettingsFrame.llIIIllIlIllll[DefaultSpdySettingsFrame.llIIIlllIIIIIl[3]] = lIIIlIlIlIIIIIII("b1x7dg==", "BqEVk");
        DefaultSpdySettingsFrame.llIIIllIlIllll[DefaultSpdySettingsFrame.llIIIlllIIIIIl[5]] = lIIIlIlIlIIIIIIl("aGrVqEid5SH6+rkZM8axOMm8KaADaLu+", "HkXjb");
        DefaultSpdySettingsFrame.llIIIllIlIllll[DefaultSpdySettingsFrame.llIIIlllIIIIIl[6]] = lIIIlIlIlIIIIIIl("6hHwtOvtTi8Uaj5CoE6CEA==", "tGRPK");
    }
    
    private static boolean lIIIlIlIlIllIIIl(final int llllllllllllIlllIlIIIlIlllIIllIl, final int llllllllllllIlllIlIIIlIlllIIllII) {
        return llllllllllllIlllIlIIIlIlllIIllIl < llllllllllllIlllIlIIIlIlllIIllII;
    }
    
    private static boolean lIIIlIlIlIllIIII(final int llllllllllllIlllIlIIIlIlllIIlIIl, final int llllllllllllIlllIlIIIlIlllIIlIII) {
        return llllllllllllIlllIlIIIlIlllIIlIIl > llllllllllllIlllIlIIIlIlllIIlIII;
    }
    
    private static final class Setting
    {
        private /* synthetic */ boolean persisted;
        private /* synthetic */ boolean persist;
        private /* synthetic */ int value;
        
        void setValue(final int lllllllllllllIlIIIlIlIllIlIIlIII) {
            this.value = lllllllllllllIlIIIlIlIllIlIIlIII;
        }
        
        void setPersisted(final boolean lllllllllllllIlIIIlIlIllIIlllIII) {
            this.persisted = lllllllllllllIlIIIlIlIllIIlllIII;
        }
        
        Setting(final int lllllllllllllIlIIIlIlIllIlIlIIll, final boolean lllllllllllllIlIIIlIlIllIlIlIIlI, final boolean lllllllllllllIlIIIlIlIllIlIlIIIl) {
            this.value = lllllllllllllIlIIIlIlIllIlIlIIll;
            this.persist = lllllllllllllIlIIIlIlIllIlIlIIlI;
            this.persisted = lllllllllllllIlIIIlIlIllIlIlIIIl;
        }
        
        void setPersist(final boolean lllllllllllllIlIIIlIlIllIlIIIIIl) {
            this.persist = lllllllllllllIlIIIlIlIllIlIIIIIl;
        }
        
        int getValue() {
            return this.value;
        }
        
        boolean isPersisted() {
            return this.persisted;
        }
        
        boolean isPersist() {
            return this.persist;
        }
    }
}
