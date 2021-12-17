// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.server.management;

import java.util.Iterator;
import java.io.File;
import com.google.gson.JsonObject;
import com.mojang.authlib.GameProfile;

public class UserListWhitelist extends UserList<GameProfile, UserListWhitelistEntry>
{
    private static final /* synthetic */ int[] lIIlIlIIIlIIlI;
    
    @Override
    public String[] getKeys() {
        final String[] lllllllllllllIIllIlIIlllIIlIIIll = new String[((UserList<K, UserListWhitelistEntry>)this).getValues().size()];
        int lllllllllllllIIllIlIIlllIIlIIIlI = UserListWhitelist.lIIlIlIIIlIIlI[0];
        final byte lllllllllllllIIllIlIIlllIIIlllII = (byte)((UserList<K, UserListWhitelistEntry>)this).getValues().values().iterator();
        "".length();
        if ((97 + 53 - 88 + 106 ^ 166 + 27 - 79 + 58) <= "   ".length()) {
            return null;
        }
        while (!llIIllllIlllIll(((Iterator)lllllllllllllIIllIlIIlllIIIlllII).hasNext() ? 1 : 0)) {
            final UserListWhitelistEntry lllllllllllllIIllIlIIlllIIlIIIIl = ((Iterator<UserListWhitelistEntry>)lllllllllllllIIllIlIIlllIIIlllII).next();
            lllllllllllllIIllIlIIlllIIlIIIll[lllllllllllllIIllIlIIlllIIlIIIlI++] = lllllllllllllIIllIlIIlllIIlIIIIl.getValue().getName();
        }
        return lllllllllllllIIllIlIIlllIIlIIIll;
    }
    
    private static boolean llIIllllIllllII(final int lllllllllllllIIllIlIIlllIIIIIlll) {
        return lllllllllllllIIllIlIIlllIIIIIlll != 0;
    }
    
    private static boolean llIIllllIlllIll(final int lllllllllllllIIllIlIIlllIIIIIlIl) {
        return lllllllllllllIIllIlIIlllIIIIIlIl == 0;
    }
    
    @Override
    protected String getObjectKey(final GameProfile lllllllllllllIIllIlIIlllIIIllIIl) {
        return lllllllllllllIIllIlIIlllIIIllIIl.getId().toString();
    }
    
    static {
        llIIllllIlllIlI();
    }
    
    @Override
    protected UserListEntry<GameProfile> createEntry(final JsonObject lllllllllllllIIllIlIIlllIIlIlIll) {
        return new UserListWhitelistEntry(lllllllllllllIIllIlIIlllIIlIlIll);
    }
    
    public UserListWhitelist(final File lllllllllllllIIllIlIIlllIIlIlllI) {
        super(lllllllllllllIIllIlIIlllIIlIlllI);
    }
    
    public GameProfile func_152706_a(final String lllllllllllllIIllIlIIlllIIIlIIlI) {
        final int lllllllllllllIIllIlIIlllIIIIllIl = (int)((UserList<K, UserListWhitelistEntry>)this).getValues().values().iterator();
        "".length();
        if ((91 + 11 - 44 + 90 ^ 139 + 53 - 103 + 56) <= 0) {
            return null;
        }
        while (!llIIllllIlllIll(((Iterator)lllllllllllllIIllIlIIlllIIIIllIl).hasNext() ? 1 : 0)) {
            final UserListWhitelistEntry lllllllllllllIIllIlIIlllIIIlIIIl = ((Iterator<UserListWhitelistEntry>)lllllllllllllIIllIlIIlllIIIIllIl).next();
            if (llIIllllIllllII(lllllllllllllIIllIlIIlllIIIlIIlI.equalsIgnoreCase(lllllllllllllIIllIlIIlllIIIlIIIl.getValue().getName()) ? 1 : 0)) {
                return lllllllllllllIIllIlIIlllIIIlIIIl.getValue();
            }
        }
        return null;
    }
    
    private static void llIIllllIlllIlI() {
        (lIIlIlIIIlIIlI = new int[1])[0] = ((0x32 ^ 0x6E ^ (0x5D ^ 0x23)) & (0x69 ^ 0x40 ^ (0xAC ^ 0xA7) ^ -" ".length()));
    }
}
