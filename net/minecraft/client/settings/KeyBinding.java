// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.client.settings;

import java.util.Iterator;
import com.google.common.collect.Sets;
import com.google.common.collect.Lists;
import net.minecraft.client.resources.I18n;
import net.minecraft.util.IntHashMap;
import java.util.Set;
import java.util.List;

public class KeyBinding implements Comparable<KeyBinding>
{
    private /* synthetic */ boolean pressed;
    private final /* synthetic */ String keyCategory;
    private final /* synthetic */ String keyDescription;
    private static final /* synthetic */ int[] llIIlllllIIIll;
    private static final /* synthetic */ List<KeyBinding> keybindArray;
    private static final /* synthetic */ Set<String> keybindSet;
    private /* synthetic */ int pressTime;
    private static final /* synthetic */ IntHashMap<KeyBinding> hash;
    private /* synthetic */ int keyCode;
    private final /* synthetic */ int keyCodeDefault;
    
    private static boolean lIIlIIIIlIIIlIII(final Object llllllllllllIllIlllIIllIIllIIlIl) {
        return llllllllllllIllIlllIIllIIllIIlIl != null;
    }
    
    public static Set<String> getKeybinds() {
        return KeyBinding.keybindSet;
    }
    
    public String getKeyCategory() {
        return this.keyCategory;
    }
    
    @Override
    public int compareTo(final KeyBinding llllllllllllIllIlllIIllIIllIllII) {
        int llllllllllllIllIlllIIllIIllIlllI = I18n.format(this.keyCategory, new Object[KeyBinding.llIIlllllIIIll[1]]).compareTo(I18n.format(llllllllllllIllIlllIIllIIllIllII.keyCategory, new Object[KeyBinding.llIIlllllIIIll[1]]));
        if (lIIlIIIIlIIIlIIl(llllllllllllIllIlllIIllIIllIlllI)) {
            llllllllllllIllIlllIIllIIllIlllI = I18n.format(this.keyDescription, new Object[KeyBinding.llIIlllllIIIll[1]]).compareTo(I18n.format(llllllllllllIllIlllIIllIIllIllII.keyDescription, new Object[KeyBinding.llIIlllllIIIll[1]]));
        }
        return llllllllllllIllIlllIIllIIllIlllI;
    }
    
    public static void unPressAllKeys() {
        final short llllllllllllIllIlllIIllIlIlIIIII = (short)KeyBinding.keybindArray.iterator();
        "".length();
        if (-"  ".length() >= 0) {
            return;
        }
        while (!lIIlIIIIlIIIlIIl(((Iterator)llllllllllllIllIlllIIllIlIlIIIII).hasNext() ? 1 : 0)) {
            final KeyBinding llllllllllllIllIlllIIllIlIlIIIlI = ((Iterator<KeyBinding>)llllllllllllIllIlllIIllIlIlIIIII).next();
            llllllllllllIllIlllIIllIlIlIIIlI.unpressKey();
        }
    }
    
    public void setKeyCode(final int llllllllllllIllIlllIIllIIlllIllI) {
        this.keyCode = llllllllllllIllIlllIIllIIlllIllI;
    }
    
    private static void lIIlIIIIlIIIIllI() {
        (llIIlllllIIIll = new int[2])[0] = " ".length();
        KeyBinding.llIIlllllIIIll[1] = ((26 + 39 - 49 + 130 ^ 139 + 147 - 213 + 94) & (103 + 115 - 131 + 79 ^ 126 + 71 - 172 + 122 ^ -" ".length()));
    }
    
    public static void setKeyBindState(final int llllllllllllIllIlllIIllIlIlIlIlI, final boolean llllllllllllIllIlllIIllIlIlIIllI) {
        if (lIIlIIIIlIIIIlll(llllllllllllIllIlllIIllIlIlIlIlI)) {
            final KeyBinding llllllllllllIllIlllIIllIlIlIlIII = KeyBinding.hash.lookup(llllllllllllIllIlllIIllIlIlIlIlI);
            if (lIIlIIIIlIIIlIII(llllllllllllIllIlllIIllIlIlIlIII)) {
                llllllllllllIllIlllIIllIlIlIlIII.pressed = llllllllllllIllIlllIIllIlIlIIllI;
            }
        }
    }
    
    public static void resetKeyBindingArrayAndHash() {
        KeyBinding.hash.clearMap();
        final String llllllllllllIllIlllIIllIlIIllIll = (String)KeyBinding.keybindArray.iterator();
        "".length();
        if (-(0xB5 ^ 0xB0) >= 0) {
            return;
        }
        while (!lIIlIIIIlIIIlIIl(((Iterator)llllllllllllIllIlllIIllIlIIllIll).hasNext() ? 1 : 0)) {
            final KeyBinding llllllllllllIllIlllIIllIlIIlllIl = ((Iterator<KeyBinding>)llllllllllllIllIlllIIllIlIIllIll).next();
            KeyBinding.hash.addKey(llllllllllllIllIlllIIllIlIIlllIl.keyCode, llllllllllllIllIlllIIllIlIIlllIl);
        }
    }
    
    public boolean isPressed() {
        if (lIIlIIIIlIIIlIIl(this.pressTime)) {
            return KeyBinding.llIIlllllIIIll[1] != 0;
        }
        this.pressTime -= KeyBinding.llIIlllllIIIll[0];
        return KeyBinding.llIIlllllIIIll[0] != 0;
    }
    
    public boolean isKeyDown() {
        return this.pressed;
    }
    
    public int getKeyCode() {
        return this.keyCode;
    }
    
    public int getKeyCodeDefault() {
        return this.keyCodeDefault;
    }
    
    public String getKeyDescription() {
        return this.keyDescription;
    }
    
    public static void onTick(final int llllllllllllIllIlllIIllIlIllIIIl) {
        if (lIIlIIIIlIIIIlll(llllllllllllIllIlllIIllIlIllIIIl)) {
            final KeyBinding llllllllllllIllIlllIIllIlIllIIII = KeyBinding.hash.lookup(llllllllllllIllIlllIIllIlIllIIIl);
            if (lIIlIIIIlIIIlIII(llllllllllllIllIlllIIllIlIllIIII)) {
                final KeyBinding keyBinding = llllllllllllIllIlllIIllIlIllIIII;
                keyBinding.pressTime += KeyBinding.llIIlllllIIIll[0];
            }
        }
    }
    
    static {
        lIIlIIIIlIIIIllI();
        keybindArray = Lists.newArrayList();
        hash = new IntHashMap<KeyBinding>();
        keybindSet = Sets.newHashSet();
    }
    
    private static boolean lIIlIIIIlIIIIlll(final int llllllllllllIllIlllIIllIIllIIIll) {
        return llllllllllllIllIlllIIllIIllIIIll != 0;
    }
    
    private static boolean lIIlIIIIlIIIlIIl(final int llllllllllllIllIlllIIllIIllIIIIl) {
        return llllllllllllIllIlllIIllIIllIIIIl == 0;
    }
    
    public KeyBinding(final String llllllllllllIllIlllIIllIlIIlIIIl, final int llllllllllllIllIlllIIllIlIIlIlII, final String llllllllllllIllIlllIIllIlIIlIIll) {
        this.keyDescription = llllllllllllIllIlllIIllIlIIlIIIl;
        this.keyCode = llllllllllllIllIlllIIllIlIIlIlII;
        this.keyCodeDefault = llllllllllllIllIlllIIllIlIIlIlII;
        this.keyCategory = llllllllllllIllIlllIIllIlIIlIIll;
        KeyBinding.keybindArray.add(this);
        "".length();
        KeyBinding.hash.addKey(llllllllllllIllIlllIIllIlIIlIlII, this);
        KeyBinding.keybindSet.add(llllllllllllIllIlllIIllIlIIlIIll);
        "".length();
    }
    
    private void unpressKey() {
        this.pressTime = KeyBinding.llIIlllllIIIll[1];
        this.pressed = (KeyBinding.llIIlllllIIIll[1] != 0);
    }
}
