// 
// Decompiled by Procyon v0.5.36
// 

package client.event;

import java.lang.annotation.Annotation;
import java.util.Iterator;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

public class EventManager
{
    private static final /* synthetic */ Map<Class<? extends Event>, ArrayHelper<Data>> REGISTRY_MAP;
    private static final /* synthetic */ int[] llIIlIIIlIIIll;
    
    public static void shutdown() {
        EventManager.REGISTRY_MAP.clear();
    }
    
    public static ArrayHelper<Data> get(final Class<? extends Event> llllllllllllIlllIIllIIIllIlIIlII) {
        return EventManager.REGISTRY_MAP.get(llllllllllllIlllIIllIIIllIlIIlII);
    }
    
    private static boolean lIIIlIllllIIllll(final int llllllllllllIlllIIllIIIllIIllIlI) {
        return llllllllllllIlllIIllIIIllIIllIlI != 0;
    }
    
    private static boolean lIIIlIllllIIllIl(final int llllllllllllIlllIIllIIIllIIllIII) {
        return llllllllllllIlllIIllIIIllIIllIII == 0;
    }
    
    static {
        lIIIlIllllIIllII();
        REGISTRY_MAP = new HashMap<Class<? extends Event>, ArrayHelper<Data>>();
    }
    
    public static void register(final Object llllllllllllIlllIIllIIIllllllIIl, final Class<? extends Event> llllllllllllIlllIIllIIIllllllIll) {
        final double llllllllllllIlllIIllIIIlllllIlII;
        final int llllllllllllIlllIIllIIIlllllIlIl = ((Method[])(Object)(llllllllllllIlllIIllIIIlllllIlII = (double)(Object)llllllllllllIlllIIllIIIllllllIIl.getClass().getDeclaredMethods())).length;
        boolean llllllllllllIlllIIllIIIlllllIllI = EventManager.llIIlIIIlIIIll[0] != 0;
        "".length();
        if (" ".length() <= 0) {
            return;
        }
        while (!lIIIlIllllIIlllI(llllllllllllIlllIIllIIIlllllIllI ? 1 : 0, llllllllllllIlllIIllIIIlllllIlIl)) {
            final Method llllllllllllIlllIIllIIIllllllIlI = llllllllllllIlllIIllIIIlllllIlII[llllllllllllIlllIIllIIIlllllIllI];
            if (lIIIlIllllIIllIl(isMethodBad(llllllllllllIlllIIllIIIllllllIlI, llllllllllllIlllIIllIIIllllllIll) ? 1 : 0)) {
                register(llllllllllllIlllIIllIIIllllllIlI, llllllllllllIlllIIllIIIllllllIIl);
            }
            ++llllllllllllIlllIIllIIIlllllIllI;
        }
    }
    
    public static void unregister(final Object llllllllllllIlllIIllIIIllllIIIlI) {
        final double llllllllllllIlllIIllIIIlllIlllIl = (double)EventManager.REGISTRY_MAP.values().iterator();
        "".length();
        if ((0x94 ^ 0x82 ^ (0x91 ^ 0x82)) == 0x0) {
            return;
        }
        while (!lIIIlIllllIIllIl(((Iterator)llllllllllllIlllIIllIIIlllIlllIl).hasNext() ? 1 : 0)) {
            final ArrayHelper<Data> llllllllllllIlllIIllIIIllllIIIIl = ((Iterator<ArrayHelper<Data>>)llllllllllllIlllIIllIIIlllIlllIl).next();
            final String llllllllllllIlllIIllIIIlllIllIll = (String)llllllllllllIlllIIllIIIllllIIIIl.iterator();
            "".length();
            if ((0x83 ^ 0x87) < 0) {
                return;
            }
            while (!lIIIlIllllIIllIl(((Iterator)llllllllllllIlllIIllIIIlllIllIll).hasNext() ? 1 : 0)) {
                final Data llllllllllllIlllIIllIIIllllIIIII = ((Iterator<Data>)llllllllllllIlllIIllIIIlllIllIll).next();
                if (lIIIlIllllIIllll(llllllllllllIlllIIllIIIllllIIIII.source.equals(llllllllllllIlllIIllIIIllllIIIlI) ? 1 : 0)) {
                    llllllllllllIlllIIllIIIllllIIIIl.remove(llllllllllllIlllIIllIIIllllIIIII);
                }
            }
        }
        cleanMap((boolean)(EventManager.llIIlIIIlIIIll[1] != 0));
    }
    
    private static void register(final Method llllllllllllIlllIIllIIIllllIlIll, final Object llllllllllllIlllIIllIIIllllIlllI) {
        final Class<?> llllllllllllIlllIIllIIIllllIllIl = llllllllllllIlllIIllIIIllllIlIll.getParameterTypes()[EventManager.llIIlIIIlIIIll[0]];
        final Data llllllllllllIlllIIllIIIllllIllII = new Data(llllllllllllIlllIIllIIIllllIlllI, llllllllllllIlllIIllIIIllllIlIll, llllllllllllIlllIIllIIIllllIlIll.getAnnotation(EventTarget.class).value());
        if (lIIIlIllllIIllIl(llllllllllllIlllIIllIIIllllIllII.target.isAccessible() ? 1 : 0)) {
            llllllllllllIlllIIllIIIllllIllII.target.setAccessible((boolean)(EventManager.llIIlIIIlIIIll[1] != 0));
        }
        if (lIIIlIllllIIllll(EventManager.REGISTRY_MAP.containsKey(llllllllllllIlllIIllIIIllllIllIl) ? 1 : 0)) {
            if (lIIIlIllllIIllIl(EventManager.REGISTRY_MAP.get(llllllllllllIlllIIllIIIllllIllIl).contains(llllllllllllIlllIIllIIIllllIllII) ? 1 : 0)) {
                EventManager.REGISTRY_MAP.get(llllllllllllIlllIIllIIIllllIllIl).add(llllllllllllIlllIIllIIIllllIllII);
                sortListValue((Class<? extends Event>)llllllllllllIlllIIllIIIllllIllIl);
                "".length();
                if ((130 + 17 - 137 + 130 ^ 125 + 3 - 19 + 27) <= " ".length()) {
                    return;
                }
            }
        }
        else {
            EventManager.REGISTRY_MAP.put((Class<? extends Event>)llllllllllllIlllIIllIIIllllIllIl, new ArrayHelper<Data>(llllllllllllIlllIIllIIIllllIllII) {
                {
                    this.add(llllllllllllIlIllIllIIllIllIllll);
                }
            });
            "".length();
        }
    }
    
    public static void cleanMap(final boolean llllllllllllIlllIIllIIIlllIIllIl) {
        final Iterator<Map.Entry<Class<? extends Event>, ArrayHelper<Data>>> llllllllllllIlllIIllIIIlllIIllII = EventManager.REGISTRY_MAP.entrySet().iterator();
        "".length();
        if (-" ".length() > 0) {
            return;
        }
        while (!lIIIlIllllIIllIl(llllllllllllIlllIIllIIIlllIIllII.hasNext() ? 1 : 0)) {
            if (!lIIIlIllllIIllll(llllllllllllIlllIIllIIIlllIIllIl ? 1 : 0) || lIIIlIllllIIllll(llllllllllllIlllIIllIIIlllIIllII.next().getValue().isEmpty() ? 1 : 0)) {
                llllllllllllIlllIIllIIIlllIIllII.remove();
            }
        }
    }
    
    private static boolean isMethodBad(final Method llllllllllllIlllIIllIIIllIlIllIl) {
        if (lIIIlIllllIlIIII(llllllllllllIlllIIllIIIllIlIllIl.getParameterTypes().length, EventManager.llIIlIIIlIIIll[1]) && lIIIlIllllIIllll(llllllllllllIlllIIllIIIllIlIllIl.isAnnotationPresent(EventTarget.class) ? 1 : 0)) {
            return EventManager.llIIlIIIlIIIll[0] != 0;
        }
        return EventManager.llIIlIIIlIIIll[1] != 0;
    }
    
    private static boolean lIIIlIllllIlIIII(final int llllllllllllIlllIIllIIIllIlIIIIl, final int llllllllllllIlllIIllIIIllIlIIIII) {
        return llllllllllllIlllIIllIIIllIlIIIIl == llllllllllllIlllIIllIIIllIlIIIII;
    }
    
    private static void lIIIlIllllIIllII() {
        (llIIlIIIlIIIll = new int[2])[0] = ((0xA ^ 0xE) & ~(0x84 ^ 0x80));
        EventManager.llIIlIIIlIIIll[1] = " ".length();
    }
    
    public static void register(final Object llllllllllllIlllIIllIIlIIIIIlIIl) {
        final double llllllllllllIlllIIllIIlIIIIIIIll;
        final byte llllllllllllIlllIIllIIlIIIIIIlII = (byte)((Method[])(Object)(llllllllllllIlllIIllIIlIIIIIIIll = (double)(Object)llllllllllllIlllIIllIIlIIIIIlIIl.getClass().getDeclaredMethods())).length;
        boolean llllllllllllIlllIIllIIlIIIIIIlIl = EventManager.llIIlIIIlIIIll[0] != 0;
        "".length();
        if (" ".length() == 0) {
            return;
        }
        while (!lIIIlIllllIIlllI(llllllllllllIlllIIllIIlIIIIIIlIl ? 1 : 0, llllllllllllIlllIIllIIlIIIIIIlII)) {
            final Method llllllllllllIlllIIllIIlIIIIIlIII = llllllllllllIlllIIllIIlIIIIIIIll[llllllllllllIlllIIllIIlIIIIIIlIl];
            if (lIIIlIllllIIllIl(isMethodBad(llllllllllllIlllIIllIIlIIIIIlIII) ? 1 : 0)) {
                register(llllllllllllIlllIIllIIlIIIIIlIII, llllllllllllIlllIIllIIlIIIIIlIIl);
            }
            ++llllllllllllIlllIIllIIlIIIIIIlIl;
        }
    }
    
    private static boolean lIIIlIllllIIlllI(final int llllllllllllIlllIIllIIIllIIlllIl, final int llllllllllllIlllIIllIIIllIIlllII) {
        return llllllllllllIlllIIllIIIllIIlllIl >= llllllllllllIlllIIllIIIllIIlllII;
    }
    
    private static boolean isMethodBad(final Method llllllllllllIlllIIllIIIllIlIlIII, final Class<? extends Event> llllllllllllIlllIIllIIIllIlIlIIl) {
        if (lIIIlIllllIIllIl(isMethodBad(llllllllllllIlllIIllIIIllIlIlIII) ? 1 : 0) && lIIIlIllllIIllIl(llllllllllllIlllIIllIIIllIlIlIII.getParameterTypes()[EventManager.llIIlIIIlIIIll[0]].equals(llllllllllllIlllIIllIIIllIlIlIIl) ? 1 : 0)) {
            return EventManager.llIIlIIIlIIIll[0] != 0;
        }
        return EventManager.llIIlIIIlIIIll[1] != 0;
    }
    
    private static void sortListValue(final Class<? extends Event> llllllllllllIlllIIllIIIllIllIlll) {
        final ArrayHelper<Data> llllllllllllIlllIIllIIIllIlllIlI = new ArrayHelper<Data>();
        final String llllllllllllIlllIIllIIIllIllIIlI;
        final boolean llllllllllllIlllIIllIIIllIllIIll = ((byte[])(Object)(llllllllllllIlllIIllIIIllIllIIlI = (String)(Object)Priority.VALUE_ARRAY)).length != 0;
        double llllllllllllIlllIIllIIIllIllIlII = EventManager.llIIlIIIlIIIll[0];
        "".length();
        if (((0x5D ^ 0x13) & ~(0x6 ^ 0x48)) < 0) {
            return;
        }
        while (!lIIIlIllllIIlllI((int)llllllllllllIlllIIllIIIllIllIlII, llllllllllllIlllIIllIIIllIllIIll ? 1 : 0)) {
            final byte llllllllllllIlllIIllIIIllIlllIIl = llllllllllllIlllIIllIIIllIllIIlI[llllllllllllIlllIIllIIIllIllIlII];
            final Exception llllllllllllIlllIIllIIIllIllIIII = (Exception)EventManager.REGISTRY_MAP.get(llllllllllllIlllIIllIIIllIllIlll).iterator();
            "".length();
            if ("  ".length() != "  ".length()) {
                return;
            }
            while (!lIIIlIllllIIllIl(((Iterator)llllllllllllIlllIIllIIIllIllIIII).hasNext() ? 1 : 0)) {
                final Data llllllllllllIlllIIllIIIllIlllIII = ((Iterator<Data>)llllllllllllIlllIIllIIIllIllIIII).next();
                if (lIIIlIllllIlIIII(llllllllllllIlllIIllIIIllIlllIII.priority, llllllllllllIlllIIllIIIllIlllIIl)) {
                    llllllllllllIlllIIllIIIllIlllIlI.add(llllllllllllIlllIIllIIIllIlllIII);
                }
            }
            ++llllllllllllIlllIIllIIIllIllIlII;
        }
        EventManager.REGISTRY_MAP.put(llllllllllllIlllIIllIIIllIllIlll, llllllllllllIlllIIllIIIllIlllIlI);
        "".length();
    }
    
    public static void removeEnty(final Class<? extends Event> llllllllllllIlllIIllIIIlllIIIlll) {
        final Iterator<Map.Entry<Class<? extends Event>, ArrayHelper<Data>>> llllllllllllIlllIIllIIIlllIIIllI = EventManager.REGISTRY_MAP.entrySet().iterator();
        "".length();
        if (-(0xC7 ^ 0x8A ^ (0x46 ^ 0xE)) >= 0) {
            return;
        }
        while (!lIIIlIllllIIllIl(llllllllllllIlllIIllIIIlllIIIllI.hasNext() ? 1 : 0)) {
            if (lIIIlIllllIIllll(llllllllllllIlllIIllIIIlllIIIllI.next().getKey().equals(llllllllllllIlllIIllIIIlllIIIlll) ? 1 : 0)) {
                llllllllllllIlllIIllIIIlllIIIllI.remove();
                "".length();
                if (-(135 + 62 - 33 + 22 ^ 152 + 105 - 185 + 118) >= 0) {
                    return;
                }
                break;
            }
        }
    }
    
    public static void unregister(final Object llllllllllllIlllIIllIIIlllIlIIll, final Class<? extends Event> llllllllllllIlllIIllIIIlllIlIIlI) {
        if (lIIIlIllllIIllll(EventManager.REGISTRY_MAP.containsKey(llllllllllllIlllIIllIIIlllIlIIlI) ? 1 : 0)) {
            final float llllllllllllIlllIIllIIIlllIlIIII = (float)EventManager.REGISTRY_MAP.get(llllllllllllIlllIIllIIIlllIlIIlI).iterator();
            "".length();
            if (((245 + 76 - 252 + 183 ^ 147 + 101 - 109 + 44) & (0x11 ^ 0x4F ^ (0xA3 ^ 0xB6) ^ -" ".length())) <= -" ".length()) {
                return;
            }
            while (!lIIIlIllllIIllIl(((Iterator)llllllllllllIlllIIllIIIlllIlIIII).hasNext() ? 1 : 0)) {
                final Data llllllllllllIlllIIllIIIlllIlIlII = ((Iterator<Data>)llllllllllllIlllIIllIIIlllIlIIII).next();
                if (lIIIlIllllIIllll(llllllllllllIlllIIllIIIlllIlIlII.source.equals(llllllllllllIlllIIllIIIlllIlIIll) ? 1 : 0)) {
                    EventManager.REGISTRY_MAP.get(llllllllllllIlllIIllIIIlllIlIIlI).remove(llllllllllllIlllIIllIIIlllIlIlII);
                }
            }
            cleanMap((boolean)(EventManager.llIIlIIIlIIIll[1] != 0));
        }
    }
}
