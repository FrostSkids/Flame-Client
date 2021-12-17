// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.client.audio;

import java.util.Arrays;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import com.google.common.collect.Lists;
import java.util.List;

public class SoundList
{
    private final /* synthetic */ List<SoundEntry> soundList;
    private /* synthetic */ boolean replaceExisting;
    private /* synthetic */ SoundCategory category;
    
    public void setReplaceExisting(final boolean llllllllllllIlllIIIIIIIIIlllIlll) {
        this.replaceExisting = llllllllllllIlllIIIIIIIIIlllIlll;
    }
    
    public void setSoundCategory(final SoundCategory llllllllllllIlllIIIIIIIIIlllIIII) {
        this.category = llllllllllllIlllIIIIIIIIIlllIIII;
    }
    
    public boolean canReplaceExisting() {
        return this.replaceExisting;
    }
    
    public List<SoundEntry> getSoundList() {
        return this.soundList;
    }
    
    public SoundCategory getSoundCategory() {
        return this.category;
    }
    
    public SoundList() {
        this.soundList = (List<SoundEntry>)Lists.newArrayList();
    }
    
    public static class SoundEntry
    {
        private static final /* synthetic */ int[] llIIIIIIIIllIl;
        private /* synthetic */ boolean streaming;
        private /* synthetic */ String name;
        private /* synthetic */ Type type;
        private /* synthetic */ float pitch;
        private /* synthetic */ float volume;
        private /* synthetic */ int weight;
        
        public String getSoundEntryName() {
            return this.name;
        }
        
        public boolean isStreaming() {
            return this.streaming;
        }
        
        public void setStreaming(final boolean llllllllllllIllllIIIIlIllllIlIIl) {
            this.streaming = llllllllllllIllllIIIIlIllllIlIIl;
        }
        
        public SoundEntry() {
            this.volume = 1.0f;
            this.pitch = 1.0f;
            this.weight = SoundEntry.llIIIIIIIIllIl[0];
            this.type = Type.FILE;
            this.streaming = (SoundEntry.llIIIIIIIIllIl[1] != 0);
        }
        
        static {
            lIIIIllIlIIIlllI();
        }
        
        public int getSoundEntryWeight() {
            return this.weight;
        }
        
        public void setSoundEntryPitch(final float llllllllllllIllllIIIIllIIIIIIlII) {
            this.pitch = llllllllllllIllllIIIIllIIIIIIlII;
        }
        
        public float getSoundEntryPitch() {
            return this.pitch;
        }
        
        public void setSoundEntryName(final String llllllllllllIllllIIIIllIIIIllIII) {
            this.name = llllllllllllIllllIIIIllIIIIllIII;
        }
        
        public void setSoundEntryVolume(final float llllllllllllIllllIIIIllIIIIIllIl) {
            this.volume = llllllllllllIllllIIIIllIIIIIllIl;
        }
        
        public void setSoundEntryType(final Type llllllllllllIllllIIIIlIlllllIlII) {
            this.type = llllllllllllIllllIIIIlIlllllIlII;
        }
        
        public float getSoundEntryVolume() {
            return this.volume;
        }
        
        private static void lIIIIllIlIIIlllI() {
            (llIIIIIIIIllIl = new int[2])[0] = " ".length();
            SoundEntry.llIIIIIIIIllIl[1] = ((0x50 ^ 0x4E) & ~(0x6C ^ 0x72));
        }
        
        public void setSoundEntryWeight(final int llllllllllllIllllIIIIlIlllllllIl) {
            this.weight = llllllllllllIllllIIIIlIlllllllIl;
        }
        
        public Type getSoundEntryType() {
            return this.type;
        }
        
        public enum Type
        {
            private static final /* synthetic */ String[] lIIIllIIlIIIlI;
            
            SOUND_EVENT(Type.lIIIllIIlIIIlI[Type.lIIIllIIlIIIll[2]], Type.lIIIllIIlIIIll[1], Type.lIIIllIIlIIIlI[Type.lIIIllIIlIIIll[3]]);
            
            private final /* synthetic */ String field_148583_c;
            
            FILE(Type.lIIIllIIlIIIlI[Type.lIIIllIIlIIIll[0]], Type.lIIIllIIlIIIll[0], Type.lIIIllIIlIIIlI[Type.lIIIllIIlIIIll[1]]);
            
            private static final /* synthetic */ int[] lIIIllIIlIIIll;
            
            private static boolean llIIIIllIlIlIII(final int lllllllllllllIlIIIIIlIlIllIIlIII) {
                return lllllllllllllIlIIIIIlIlIllIIlIII != 0;
            }
            
            public static Type getType(final String lllllllllllllIlIIIIIlIllIIIlIIII) {
                final Exception lllllllllllllIlIIIIIlIllIIIIllII;
                final char lllllllllllllIlIIIIIlIllIIIIllIl = (char)((Type[])(Object)(lllllllllllllIlIIIIIlIllIIIIllII = (Exception)(Object)values())).length;
                String lllllllllllllIlIIIIIlIllIIIIlllI = (String)Type.lIIIllIIlIIIll[0];
                "".length();
                if ((52 + 23 - 45 + 151 ^ 77 + 40 - 88 + 147) <= 0) {
                    return null;
                }
                while (!llIIIIllIlIlIIl((int)lllllllllllllIlIIIIIlIllIIIIlllI, lllllllllllllIlIIIIIlIllIIIIllIl)) {
                    final Type lllllllllllllIlIIIIIlIllIIIlIIIl = lllllllllllllIlIIIIIlIllIIIIllII[lllllllllllllIlIIIIIlIllIIIIlllI];
                    if (llIIIIllIlIlIII(lllllllllllllIlIIIIIlIllIIIlIIIl.field_148583_c.equals(lllllllllllllIlIIIIIlIllIIIlIIII) ? 1 : 0)) {
                        return lllllllllllllIlIIIIIlIllIIIlIIIl;
                    }
                    ++lllllllllllllIlIIIIIlIllIIIIlllI;
                }
                return null;
            }
            
            private static String llIIIIllIlIIlII(final String lllllllllllllIlIIIIIlIlIlllllIlI, final String lllllllllllllIlIIIIIlIlIlllllIll) {
                try {
                    final SecretKeySpec lllllllllllllIlIIIIIlIlIllllllll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIlIIIIIlIlIlllllIll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
                    final Cipher lllllllllllllIlIIIIIlIlIlllllllI = Cipher.getInstance("Blowfish");
                    lllllllllllllIlIIIIIlIlIlllllllI.init(Type.lIIIllIIlIIIll[2], lllllllllllllIlIIIIIlIlIllllllll);
                    return new String(lllllllllllllIlIIIIIlIlIlllllllI.doFinal(Base64.getDecoder().decode(lllllllllllllIlIIIIIlIlIlllllIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
                }
                catch (Exception lllllllllllllIlIIIIIlIlIllllllIl) {
                    lllllllllllllIlIIIIIlIlIllllllIl.printStackTrace();
                    return null;
                }
            }
            
            private static String llIIIIllIlIIlIl(final String lllllllllllllIlIIIIIlIlIlllIllIl, final String lllllllllllllIlIIIIIlIlIlllIlllI) {
                try {
                    final SecretKeySpec lllllllllllllIlIIIIIlIlIllllIIlI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIlIIIIIlIlIlllIlllI.getBytes(StandardCharsets.UTF_8)), Type.lIIIllIIlIIIll[5]), "DES");
                    final Cipher lllllllllllllIlIIIIIlIlIllllIIIl = Cipher.getInstance("DES");
                    lllllllllllllIlIIIIIlIlIllllIIIl.init(Type.lIIIllIIlIIIll[2], lllllllllllllIlIIIIIlIlIllllIIlI);
                    return new String(lllllllllllllIlIIIIIlIlIllllIIIl.doFinal(Base64.getDecoder().decode(lllllllllllllIlIIIIIlIlIlllIllIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
                }
                catch (Exception lllllllllllllIlIIIIIlIlIllllIIII) {
                    lllllllllllllIlIIIIIlIlIllllIIII.printStackTrace();
                    return null;
                }
            }
            
            private Type(final String lllllllllllllIlIIIIIlIllIIIllIlI, final int lllllllllllllIlIIIIIlIllIIIllIIl, final String lllllllllllllIlIIIIIlIllIIIlllII) {
                this.field_148583_c = lllllllllllllIlIIIIIlIllIIIlllII;
            }
            
            private static boolean llIIIIllIlIlIIl(final int lllllllllllllIlIIIIIlIlIllIIllll, final int lllllllllllllIlIIIIIlIlIllIIlllI) {
                return lllllllllllllIlIIIIIlIlIllIIllll >= lllllllllllllIlIIIIIlIlIllIIlllI;
            }
            
            static {
                llIIIIllIlIIlll();
                llIIIIllIlIIllI();
                final Type[] enum$VALUES = new Type[Type.lIIIllIIlIIIll[2]];
                enum$VALUES[Type.lIIIllIIlIIIll[0]] = Type.FILE;
                enum$VALUES[Type.lIIIllIIlIIIll[1]] = Type.SOUND_EVENT;
                ENUM$VALUES = enum$VALUES;
            }
            
            private static String llIIIIllIlIIIll(String lllllllllllllIlIIIIIlIlIllIllIlI, final String lllllllllllllIlIIIIIlIlIllIllIIl) {
                lllllllllllllIlIIIIIlIlIllIllIlI = (char)new String(Base64.getDecoder().decode(((String)lllllllllllllIlIIIIIlIlIllIllIlI).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
                final StringBuilder lllllllllllllIlIIIIIlIlIllIlllIl = new StringBuilder();
                final char[] lllllllllllllIlIIIIIlIlIllIlllII = lllllllllllllIlIIIIIlIlIllIllIIl.toCharArray();
                int lllllllllllllIlIIIIIlIlIllIllIll = Type.lIIIllIIlIIIll[0];
                final long lllllllllllllIlIIIIIlIlIllIlIlIl = (Object)((String)lllllllllllllIlIIIIIlIlIllIllIlI).toCharArray();
                final float lllllllllllllIlIIIIIlIlIllIlIlII = lllllllllllllIlIIIIIlIlIllIlIlIl.length;
                int lllllllllllllIlIIIIIlIlIllIlIIll = Type.lIIIllIIlIIIll[0];
                while (llIIIIllIlIlIlI(lllllllllllllIlIIIIIlIlIllIlIIll, (int)lllllllllllllIlIIIIIlIlIllIlIlII)) {
                    final char lllllllllllllIlIIIIIlIlIlllIIIII = lllllllllllllIlIIIIIlIlIllIlIlIl[lllllllllllllIlIIIIIlIlIllIlIIll];
                    lllllllllllllIlIIIIIlIlIllIlllIl.append((char)(lllllllllllllIlIIIIIlIlIlllIIIII ^ lllllllllllllIlIIIIIlIlIllIlllII[lllllllllllllIlIIIIIlIlIllIllIll % lllllllllllllIlIIIIIlIlIllIlllII.length]));
                    "".length();
                    ++lllllllllllllIlIIIIIlIlIllIllIll;
                    ++lllllllllllllIlIIIIIlIlIllIlIIll;
                    "".length();
                    if (" ".length() >= "   ".length()) {
                        return null;
                    }
                }
                return String.valueOf(lllllllllllllIlIIIIIlIlIllIlllIl);
            }
            
            private static void llIIIIllIlIIllI() {
                (lIIIllIIlIIIlI = new String[Type.lIIIllIIlIIIll[4]])[Type.lIIIllIIlIIIll[0]] = llIIIIllIlIIIll("LjwjBA==", "huoAn");
                Type.lIIIllIIlIIIlI[Type.lIIIllIIlIIIll[1]] = llIIIIllIlIIlII("P7ezss9deck=", "xJScT");
                Type.lIIIllIIlIIIlI[Type.lIIIllIIlIIIll[2]] = llIIIIllIlIIIll("NSE3JzA5KzQsOjI=", "fnbit");
                Type.lIIIllIIlIIIlI[Type.lIIIllIIlIIIll[3]] = llIIIIllIlIIlIl("4SwX6v6XrLc=", "kUtOs");
            }
            
            private static boolean llIIIIllIlIlIlI(final int lllllllllllllIlIIIIIlIlIllIIlIll, final int lllllllllllllIlIIIIIlIlIllIIlIlI) {
                return lllllllllllllIlIIIIIlIlIllIIlIll < lllllllllllllIlIIIIIlIlIllIIlIlI;
            }
            
            private static void llIIIIllIlIIlll() {
                (lIIIllIIlIIIll = new int[6])[0] = ((0x26 ^ 0x6E) & ~(0x8F ^ 0xC7));
                Type.lIIIllIIlIIIll[1] = " ".length();
                Type.lIIIllIIlIIIll[2] = "  ".length();
                Type.lIIIllIIlIIIll[3] = "   ".length();
                Type.lIIIllIIlIIIll[4] = (0x2A ^ 0x2E);
                Type.lIIIllIIlIIIll[5] = (0x92 ^ 0x9A);
            }
        }
    }
}
