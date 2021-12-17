// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.server.management;

import com.google.gson.JsonObject;

public class UserListEntry<T>
{
    private static final /* synthetic */ int[] lIIIlIlIIIIIll;
    private final /* synthetic */ T value;
    
    private static void llIIIIIIIIlIlll() {
        (lIIIlIlIIIIIll = new int[1])[0] = ((0x61 ^ 0x14 ^ (0x84 ^ 0xC4)) & (168 + 133 - 174 + 55 ^ 115 + 99 - 120 + 37 ^ -" ".length()) & (((0x5A ^ 0x16 ^ (0xA8 ^ 0xC2)) & (0xA ^ 0x67 ^ (0xE5 ^ 0xAE) ^ -" ".length())) ^ -" ".length()) & (((0xEB ^ 0xA8 ^ (0x51 ^ 0x33)) & (43 + 89 - 39 + 48 ^ 159 + 53 - 145 + 105 ^ -" ".length())) ^ -" ".length()));
    }
    
    public UserListEntry(final T lllllllllllllIlIIIlIIIlIIIlIlllI) {
        this.value = lllllllllllllIlIIIlIIIlIIIlIlllI;
    }
    
    boolean hasBanExpired() {
        return UserListEntry.lIIIlIlIIIIIll[0] != 0;
    }
    
    protected UserListEntry(final T lllllllllllllIlIIIlIIIlIIIlIlIlI, final JsonObject lllllllllllllIlIIIlIIIlIIIlIlIIl) {
        this.value = lllllllllllllIlIIIlIIIlIIIlIlIlI;
    }
    
    protected void onSerialization(final JsonObject lllllllllllllIlIIIlIIIlIIIlIIIIl) {
    }
    
    static {
        llIIIIIIIIlIlll();
    }
    
    T getValue() {
        return this.value;
    }
}
