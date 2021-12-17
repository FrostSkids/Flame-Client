// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.server.management;

import java.util.Iterator;
import java.io.File;
import com.google.gson.JsonObject;
import com.mojang.authlib.GameProfile;

public class UserListOps extends UserList<GameProfile, UserListOpsEntry>
{
    private static final /* synthetic */ int[] lIlIlllIlIIIII;
    
    private static boolean llllIIlllIlIlII(final int lllllllllllllIIIIlIllIIlIlIIIlll) {
        return lllllllllllllIIIIlIllIIlIlIIIlll != 0;
    }
    
    public boolean func_183026_b(final GameProfile lllllllllllllIIIIlIllIIlIlIlllll) {
        final UserListOpsEntry lllllllllllllIIIIlIllIIlIllIIIIl = this.getEntry(lllllllllllllIIIIlIllIIlIlIlllll);
        int func_183024_b;
        if (llllIIlllIlIIll(lllllllllllllIIIIlIllIIlIllIIIIl)) {
            func_183024_b = (lllllllllllllIIIIlIllIIlIllIIIIl.func_183024_b() ? 1 : 0);
            "".length();
            if (null != null) {
                return ((0xCA ^ 0xAB) & ~(0x4D ^ 0x2C)) != 0x0;
            }
        }
        else {
            func_183024_b = UserListOps.lIlIlllIlIIIII[0];
        }
        return func_183024_b != 0;
    }
    
    @Override
    protected UserListEntry<GameProfile> createEntry(final JsonObject lllllllllllllIIIIlIllIIlIlllIlIl) {
        return new UserListOpsEntry(lllllllllllllIIIIlIllIIlIlllIlIl);
    }
    
    private static boolean llllIIlllIlIIll(final Object lllllllllllllIIIIlIllIIlIlIIlIIl) {
        return lllllllllllllIIIIlIllIIlIlIIlIIl != null;
    }
    
    private static void llllIIlllIlIIIl() {
        (lIlIlllIlIIIII = new int[1])[0] = ((79 + 18 + 12 + 42 ^ 138 + 38 - 145 + 162) & (0xCA ^ 0x8D ^ (0x97 ^ 0x86) ^ -" ".length()));
    }
    
    public GameProfile getGameProfileFromName(final String lllllllllllllIIIIlIllIIlIlIlIIIl) {
        final long lllllllllllllIIIIlIllIIlIlIIllll = (long)((UserList<K, UserListOpsEntry>)this).getValues().values().iterator();
        "".length();
        if (-"  ".length() > 0) {
            return null;
        }
        while (!llllIIlllIlIIlI(((Iterator)lllllllllllllIIIIlIllIIlIlIIllll).hasNext() ? 1 : 0)) {
            final UserListOpsEntry lllllllllllllIIIIlIllIIlIlIlIIll = ((Iterator<UserListOpsEntry>)lllllllllllllIIIIlIllIIlIlIIllll).next();
            if (llllIIlllIlIlII(lllllllllllllIIIIlIllIIlIlIlIIIl.equalsIgnoreCase(lllllllllllllIIIIlIllIIlIlIlIIll.getValue().getName()) ? 1 : 0)) {
                return lllllllllllllIIIIlIllIIlIlIlIIll.getValue();
            }
        }
        return null;
    }
    
    @Override
    protected String getObjectKey(final GameProfile lllllllllllllIIIIlIllIIlIlIllIll) {
        return lllllllllllllIIIIlIllIIlIlIllIll.getId().toString();
    }
    
    public UserListOps(final File lllllllllllllIIIIlIllIIlIllllIIl) {
        super(lllllllllllllIIIIlIllIIlIllllIIl);
    }
    
    private static boolean llllIIlllIlIIlI(final int lllllllllllllIIIIlIllIIlIlIIIlIl) {
        return lllllllllllllIIIIlIllIIlIlIIIlIl == 0;
    }
    
    @Override
    public String[] getKeys() {
        final String[] lllllllllllllIIIIlIllIIlIllIlllI = new String[((UserList<K, UserListOpsEntry>)this).getValues().size()];
        int lllllllllllllIIIIlIllIIlIllIllIl = UserListOps.lIlIlllIlIIIII[0];
        final int lllllllllllllIIIIlIllIIlIllIIlll = (int)((UserList<K, UserListOpsEntry>)this).getValues().values().iterator();
        "".length();
        if (null != null) {
            return null;
        }
        while (!llllIIlllIlIIlI(((Iterator)lllllllllllllIIIIlIllIIlIllIIlll).hasNext() ? 1 : 0)) {
            final UserListOpsEntry lllllllllllllIIIIlIllIIlIllIllII = ((Iterator<UserListOpsEntry>)lllllllllllllIIIIlIllIIlIllIIlll).next();
            lllllllllllllIIIIlIllIIlIllIlllI[lllllllllllllIIIIlIllIIlIllIllIl++] = lllllllllllllIIIIlIllIIlIllIllII.getValue().getName();
        }
        return lllllllllllllIIIIlIllIIlIllIlllI;
    }
    
    static {
        llllIIlllIlIIIl();
    }
}
