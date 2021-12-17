// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.server.management;

import java.util.Iterator;
import java.io.File;
import com.google.gson.JsonObject;
import com.mojang.authlib.GameProfile;

public class UserListBans extends UserList<GameProfile, UserListBansEntry>
{
    private static final /* synthetic */ int[] lIllllIllIIlll;
    
    @Override
    protected UserListEntry<GameProfile> createEntry(final JsonObject llllllllllllIllllIlIIIlIlIIlIllI) {
        return new UserListBansEntry(llllllllllllIllllIlIIIlIlIIlIllI);
    }
    
    public UserListBans(final File llllllllllllIllllIlIIIlIlIIllIIl) {
        super(llllllllllllIllllIlIIIlIlIIllIIl);
    }
    
    @Override
    public String[] getKeys() {
        final String[] llllllllllllIllllIlIIIlIlIIIlIII = new String[((UserList<K, UserListBansEntry>)this).getValues().size()];
        int llllllllllllIllllIlIIIlIlIIIIlll = UserListBans.lIllllIllIIlll[0];
        final byte llllllllllllIllllIlIIIlIlIIIIIIl = (byte)((UserList<K, UserListBansEntry>)this).getValues().values().iterator();
        "".length();
        if ("  ".length() > (0xFD ^ 0x9E ^ (0x52 ^ 0x35))) {
            return null;
        }
        while (!lIIIIlIIllIIllII(((Iterator)llllllllllllIllllIlIIIlIlIIIIIIl).hasNext() ? 1 : 0)) {
            final UserListBansEntry llllllllllllIllllIlIIIlIlIIIIllI = ((Iterator<UserListBansEntry>)llllllllllllIllllIlIIIlIlIIIIIIl).next();
            llllllllllllIllllIlIIIlIlIIIlIII[llllllllllllIllllIlIIIlIlIIIIlll++] = llllllllllllIllllIlIIIlIlIIIIllI.getValue().getName();
        }
        return llllllllllllIllllIlIIIlIlIIIlIII;
    }
    
    @Override
    protected String getObjectKey(final GameProfile llllllllllllIllllIlIIIlIIllllllI) {
        return llllllllllllIllllIlIIIlIIllllllI.getId().toString();
    }
    
    private static boolean lIIIIlIIllIIllII(final int llllllllllllIllllIlIIIlIIllIlIlI) {
        return llllllllllllIllllIlIIIlIIllIlIlI == 0;
    }
    
    public boolean isBanned(final GameProfile llllllllllllIllllIlIIIlIlIIIllll) {
        return ((UserList<GameProfile, V>)this).hasEntry(llllllllllllIllllIlIIIlIlIIIllll);
    }
    
    static {
        lIIIIlIIllIIlIll();
    }
    
    private static void lIIIIlIIllIIlIll() {
        (lIllllIllIIlll = new int[1])[0] = ((0xC3 ^ 0xA6 ^ (0x92 ^ 0xC1)) & (59 + 34 + 8 + 39 ^ 78 + 10 + 1 + 97 ^ -" ".length()));
    }
    
    private static boolean lIIIIlIIllIIllIl(final int llllllllllllIllllIlIIIlIIllIllII) {
        return llllllllllllIllllIlIIIlIIllIllII != 0;
    }
    
    public GameProfile isUsernameBanned(final String llllllllllllIllllIlIIIlIIlllIlll) {
        final Exception llllllllllllIllllIlIIIlIIlllIIlI = (Exception)((UserList<K, UserListBansEntry>)this).getValues().values().iterator();
        "".length();
        if ((121 + 70 - 27 + 26 ^ 99 + 141 - 196 + 142) < -" ".length()) {
            return null;
        }
        while (!lIIIIlIIllIIllII(((Iterator)llllllllllllIllllIlIIIlIIlllIIlI).hasNext() ? 1 : 0)) {
            final UserListBansEntry llllllllllllIllllIlIIIlIIlllIllI = ((Iterator<UserListBansEntry>)llllllllllllIllllIlIIIlIIlllIIlI).next();
            if (lIIIIlIIllIIllIl(llllllllllllIllllIlIIIlIIlllIlll.equalsIgnoreCase(llllllllllllIllllIlIIIlIIlllIllI.getValue().getName()) ? 1 : 0)) {
                return llllllllllllIllllIlIIIlIIlllIllI.getValue();
            }
        }
        return null;
    }
}
