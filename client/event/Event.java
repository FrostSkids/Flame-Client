// 
// Decompiled by Procyon v0.5.36
// 

package client.event;

import java.util.Iterator;
import java.util.Arrays;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.lang.reflect.Method;
import java.lang.reflect.InvocationTargetException;
import client.ClientName;

public abstract class Event
{
    private static final /* synthetic */ int[] lIlIllIIIlIllI;
    private /* synthetic */ boolean cancelled;
    
    private static boolean llllIIIIIllllll(final Object lllllllllllllIIIIlllIlIlIIlIlIIl) {
        return lllllllllllllIIIIlllIlIlIIlIlIIl != null;
    }
    
    private static final void call(final Event lllllllllllllIIIIlllIlIlIIllIlII) {
        final EventManager eventManager = ClientName.INSTANCE.eventManager;
        "".length();
        final ArrayHelper<Data> lllllllllllllIIIIlllIlIlIIllIIll = EventManager.get(lllllllllllllIIIIlllIlIlIIllIlII.getClass());
        if (llllIIIIIllllll(lllllllllllllIIIIlllIlIlIIllIIll)) {
            final int lllllllllllllIIIIlllIlIlIIlIllII = (int)lllllllllllllIIIIlllIlIlIIllIIll.iterator();
            "".length();
            if (-" ".length() > "  ".length()) {
                return;
            }
            while (!llllIIIIlIIIIII(((Iterator)lllllllllllllIIIIlllIlIlIIlIllII).hasNext() ? 1 : 0)) {
                final Data lllllllllllllIIIIlllIlIlIIllIIlI = ((Iterator<Data>)lllllllllllllIIIIlllIlIlIIlIllII).next();
                try {
                    final Method target = lllllllllllllIIIIlllIlIlIIllIIlI.target;
                    final Object source = lllllllllllllIIIIlllIlIlIIllIIlI.source;
                    final Object[] args = new Object[Event.lIlIllIIIlIllI[1]];
                    args[Event.lIlIllIIIlIllI[0]] = lllllllllllllIIIIlllIlIlIIllIlII;
                    target.invoke(source, args);
                    "".length();
                    "".length();
                    if ((0xA8 ^ 0xAD) == 0x0) {
                        return;
                    }
                    continue;
                }
                catch (IllegalAccessException lllllllllllllIIIIlllIlIlIIllIIIl) {
                    lllllllllllllIIIIlllIlIlIIllIIIl.printStackTrace();
                    "".length();
                    if (((0x33 ^ 0x51 ^ (0xB5 ^ 0x98)) & (0x29 ^ 0x2C ^ (0x7E ^ 0x34) ^ -" ".length())) != 0x0) {
                        return;
                    }
                    continue;
                }
                catch (InvocationTargetException lllllllllllllIIIIlllIlIlIIllIIII) {
                    lllllllllllllIIIIlllIlIlIIllIIII.printStackTrace();
                }
            }
        }
    }
    
    private static boolean llllIIIIlIIIIII(final int lllllllllllllIIIIlllIlIlIIlIIlll) {
        return lllllllllllllIIIIlllIlIlIIlIIlll == 0;
    }
    
    static {
        llllIIIIIlllllI();
    }
    
    public void setCancelled(final boolean lllllllllllllIIIIlllIlIlIIlllIlI) {
        this.cancelled = lllllllllllllIIIIlllIlIlIIlllIlI;
    }
    
    private static void llllIIIIIlllllI() {
        (lIlIllIIIlIllI = new int[2])[0] = ((0xB5 ^ 0xA5) & ~(0x96 ^ 0x86));
        Event.lIlIllIIIlIllI[1] = " ".length();
    }
    
    public Event call() {
        this.cancelled = (Event.lIlIllIIIlIllI[0] != 0);
        call(this);
        return this;
    }
    
    public boolean isCancelled() {
        return this.cancelled;
    }
    
    public enum State
    {
        private static final /* synthetic */ String[] lIllllIllIlIlI;
        
        POST(State.lIllllIllIlIlI[State.lIllllIllIllII[2]], State.lIllllIllIllII[1], State.lIllllIllIlIlI[State.lIllllIllIllII[3]], State.lIllllIllIllII[1]), 
        PRE(State.lIllllIllIlIlI[State.lIllllIllIllII[0]], State.lIllllIllIllII[0], State.lIllllIllIlIlI[State.lIllllIllIllII[1]], State.lIllllIllIllII[0]);
        
        private static final /* synthetic */ int[] lIllllIllIllII;
        
        private static void lIIIIlIIllIlIllI() {
            (lIllllIllIlIlI = new String[State.lIllllIllIllII[4]])[State.lIllllIllIllII[0]] = lIIIIlIIllIlIIll("3dyEjgyiaYU=", "xiDUB");
            State.lIllllIllIlIlI[State.lIllllIllIllII[1]] = lIIIIlIIllIlIlII("ADoJ", "PhLXK");
            State.lIllllIllIlIlI[State.lIllllIllIllII[2]] = lIIIIlIIllIlIlIl("O5ZblWNJOqk=", "MZPEY");
            State.lIllllIllIlIlI[State.lIllllIllIllII[3]] = lIIIIlIIllIlIlII("By0YJQ==", "WbKqb");
        }
        
        private static String lIIIIlIIllIlIlIl(final String llllllllllllIllllIlIIIIlllIIlIII, final String llllllllllllIllllIlIIIIlllIIIlll) {
            try {
                final SecretKeySpec llllllllllllIllllIlIIIIlllIIllIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIllllIlIIIIlllIIIlll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
                final Cipher llllllllllllIllllIlIIIIlllIIllII = Cipher.getInstance("Blowfish");
                llllllllllllIllllIlIIIIlllIIllII.init(State.lIllllIllIllII[2], llllllllllllIllllIlIIIIlllIIllIl);
                return new String(llllllllllllIllllIlIIIIlllIIllII.doFinal(Base64.getDecoder().decode(llllllllllllIllllIlIIIIlllIIlIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
            }
            catch (Exception llllllllllllIllllIlIIIIlllIIlIll) {
                llllllllllllIllllIlIIIIlllIIlIll.printStackTrace();
                return null;
            }
        }
        
        private static boolean lIIIIlIIllIllIlI(final int llllllllllllIllllIlIIIIlllIIIIlI, final int llllllllllllIllllIlIIIIlllIIIIIl) {
            return llllllllllllIllllIlIIIIlllIIIIlI < llllllllllllIllllIlIIIIlllIIIIIl;
        }
        
        static {
            lIIIIlIIllIllIIl();
            lIIIIlIIllIlIllI();
            final State[] enum$VALUES = new State[State.lIllllIllIllII[2]];
            enum$VALUES[State.lIllllIllIllII[0]] = State.PRE;
            enum$VALUES[State.lIllllIllIllII[1]] = State.POST;
            ENUM$VALUES = enum$VALUES;
        }
        
        private State(final String llllllllllllIllllIlIIIlIIIIIIIII, final int llllllllllllIllllIlIIIIlllllllll, final String llllllllllllIllllIlIIIlIIIIIIIll, final int llllllllllllIllllIlIIIlIIIIIIIlI) {
        }
        
        private static void lIIIIlIIllIllIIl() {
            (lIllllIllIllII = new int[6])[0] = ((0xDC ^ 0x9E) & ~(0xC9 ^ 0x8B));
            State.lIllllIllIllII[1] = " ".length();
            State.lIllllIllIllII[2] = "  ".length();
            State.lIllllIllIllII[3] = "   ".length();
            State.lIllllIllIllII[4] = (180 + 100 - 262 + 177 ^ 154 + 180 - 309 + 174);
            State.lIllllIllIllII[5] = (0xCB ^ 0xC3);
        }
        
        private static String lIIIIlIIllIlIlII(String llllllllllllIllllIlIIIIllllIIlll, final String llllllllllllIllllIlIIIIllllIIllI) {
            llllllllllllIllllIlIIIIllllIIlll = new String(Base64.getDecoder().decode(llllllllllllIllllIlIIIIllllIIlll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
            final StringBuilder llllllllllllIllllIlIIIIllllIlIlI = new StringBuilder();
            final char[] llllllllllllIllllIlIIIIllllIlIIl = llllllllllllIllllIlIIIIllllIIllI.toCharArray();
            int llllllllllllIllllIlIIIIllllIlIII = State.lIllllIllIllII[0];
            final long llllllllllllIllllIlIIIIllllIIIlI = (Object)llllllllllllIllllIlIIIIllllIIlll.toCharArray();
            final float llllllllllllIllllIlIIIIllllIIIIl = llllllllllllIllllIlIIIIllllIIIlI.length;
            double llllllllllllIllllIlIIIIllllIIIII = State.lIllllIllIllII[0];
            while (lIIIIlIIllIllIlI((int)llllllllllllIllllIlIIIIllllIIIII, (int)llllllllllllIllllIlIIIIllllIIIIl)) {
                final char llllllllllllIllllIlIIIIllllIllIl = llllllllllllIllllIlIIIIllllIIIlI[llllllllllllIllllIlIIIIllllIIIII];
                llllllllllllIllllIlIIIIllllIlIlI.append((char)(llllllllllllIllllIlIIIIllllIllIl ^ llllllllllllIllllIlIIIIllllIlIIl[llllllllllllIllllIlIIIIllllIlIII % llllllllllllIllllIlIIIIllllIlIIl.length]));
                "".length();
                ++llllllllllllIllllIlIIIIllllIlIII;
                ++llllllllllllIllllIlIIIIllllIIIII;
                "".length();
                if (null != null) {
                    return null;
                }
            }
            return String.valueOf(llllllllllllIllllIlIIIIllllIlIlI);
        }
        
        private static String lIIIIlIIllIlIIll(final String llllllllllllIllllIlIIIIlllIlIlIl, final String llllllllllllIllllIlIIIIlllIlIllI) {
            try {
                final SecretKeySpec llllllllllllIllllIlIIIIlllIllIlI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIllllIlIIIIlllIlIllI.getBytes(StandardCharsets.UTF_8)), State.lIllllIllIllII[5]), "DES");
                final Cipher llllllllllllIllllIlIIIIlllIllIIl = Cipher.getInstance("DES");
                llllllllllllIllllIlIIIIlllIllIIl.init(State.lIllllIllIllII[2], llllllllllllIllllIlIIIIlllIllIlI);
                return new String(llllllllllllIllllIlIIIIlllIllIIl.doFinal(Base64.getDecoder().decode(llllllllllllIllllIlIIIIlllIlIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
            }
            catch (Exception llllllllllllIllllIlIIIIlllIllIII) {
                llllllllllllIllllIlIIIIlllIllIII.printStackTrace();
                return null;
            }
        }
    }
}
