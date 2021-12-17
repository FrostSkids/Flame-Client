// 
// Decompiled by Procyon v0.5.36
// 

package org.newdawn.slick.loading;

import org.newdawn.slick.util.Log;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import org.newdawn.slick.openal.SoundStore;
import org.newdawn.slick.opengl.InternalTextureLoader;
import java.util.ArrayList;

public class LoadingList
{
    private /* synthetic */ int total;
    private static final /* synthetic */ int[] lIlIlIIlIlllIl;
    private static final /* synthetic */ String[] lIlIlIIlIlllII;
    private static /* synthetic */ LoadingList single;
    private /* synthetic */ ArrayList deferred;
    
    public DeferredResource getNext() {
        if (lllIllIIlllIIIl(this.deferred.size())) {
            return null;
        }
        return this.deferred.remove(LoadingList.lIlIlIIlIlllIl[1]);
    }
    
    static {
        lllIllIIlllIIII();
        lllIllIIllIlllI();
        LoadingList.single = new LoadingList();
    }
    
    public static void setDeferredLoading(final boolean lllllllllllllIIIlIlIIIIllIIIllll) {
        LoadingList.single = new LoadingList();
        InternalTextureLoader.get().setDeferredLoading(lllllllllllllIIIlIlIIIIllIIIllll);
        SoundStore.get().setDeferredLoading(lllllllllllllIIIlIlIIIIllIIIllll);
    }
    
    private static boolean lllIllIIlllIIIl(final int lllllllllllllIIIlIlIIIIlIlIllIIl) {
        return lllllllllllllIIIlIlIIIIlIlIllIIl == 0;
    }
    
    private static void lllIllIIlllIIII() {
        (lIlIlIIlIlllIl = new int[2])[0] = " ".length();
        LoadingList.lIlIlIIlIlllIl[1] = ((0x3C ^ 0x8) & ~(0x12 ^ 0x26));
    }
    
    private LoadingList() {
        this.deferred = new ArrayList();
    }
    
    public int getRemainingResources() {
        return this.deferred.size();
    }
    
    private static void lllIllIIllIlllI() {
        (lIlIlIIlIlllII = new String[LoadingList.lIlIlIIlIlllIl[0]])[LoadingList.lIlIlIIlIlllIl[1]] = lllIllIIllIllIl("BA0UAy1hAAkOMCgCAU87J0wCCjIkHhQKMGEeAxw7NB4FCnQlGQNPIC5MFAole0w=", "AlfoT");
    }
    
    public static LoadingList get() {
        return LoadingList.single;
    }
    
    public static boolean isDeferredLoading() {
        return InternalTextureLoader.get().isDeferredLoading();
    }
    
    private static String lllIllIIllIllIl(String lllllllllllllIIIlIlIIIIlIllIIlll, final String lllllllllllllIIIlIlIIIIlIllIlIll) {
        lllllllllllllIIIlIlIIIIlIllIIlll = new String(Base64.getDecoder().decode(lllllllllllllIIIlIlIIIIlIllIIlll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIIIlIlIIIIlIllIlIlI = new StringBuilder();
        final char[] lllllllllllllIIIlIlIIIIlIllIlIIl = lllllllllllllIIIlIlIIIIlIllIlIll.toCharArray();
        int lllllllllllllIIIlIlIIIIlIllIlIII = LoadingList.lIlIlIIlIlllIl[1];
        final float lllllllllllllIIIlIlIIIIlIllIIIlI = (Object)lllllllllllllIIIlIlIIIIlIllIIlll.toCharArray();
        final float lllllllllllllIIIlIlIIIIlIllIIIIl = lllllllllllllIIIlIlIIIIlIllIIIlI.length;
        Exception lllllllllllllIIIlIlIIIIlIllIIIII = (Exception)LoadingList.lIlIlIIlIlllIl[1];
        while (lllIllIIlllIIlI((int)lllllllllllllIIIlIlIIIIlIllIIIII, (int)lllllllllllllIIIlIlIIIIlIllIIIIl)) {
            final char lllllllllllllIIIlIlIIIIlIllIllIl = lllllllllllllIIIlIlIIIIlIllIIIlI[lllllllllllllIIIlIlIIIIlIllIIIII];
            lllllllllllllIIIlIlIIIIlIllIlIlI.append((char)(lllllllllllllIIIlIlIIIIlIllIllIl ^ lllllllllllllIIIlIlIIIIlIllIlIIl[lllllllllllllIIIlIlIIIIlIllIlIII % lllllllllllllIIIlIlIIIIlIllIlIIl.length]));
            "".length();
            ++lllllllllllllIIIlIlIIIIlIllIlIII;
            ++lllllllllllllIIIlIlIIIIlIllIIIII;
            "".length();
            if (null != null) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIIIlIlIIIIlIllIlIlI);
    }
    
    public void add(final DeferredResource lllllllllllllIIIlIlIIIIllIIIlIII) {
        this.total += LoadingList.lIlIlIIlIlllIl[0];
        this.deferred.add(lllllllllllllIIIlIlIIIIllIIIlIII);
        "".length();
    }
    
    public void remove(final DeferredResource lllllllllllllIIIlIlIIIIllIIIIIII) {
        Log.info(String.valueOf(new StringBuilder().append(LoadingList.lIlIlIIlIlllII[LoadingList.lIlIlIIlIlllIl[1]]).append(lllllllllllllIIIlIlIIIIllIIIIIII.getDescription())));
        this.total -= LoadingList.lIlIlIIlIlllIl[0];
        this.deferred.remove(lllllllllllllIIIlIlIIIIllIIIIIII);
        "".length();
    }
    
    private static boolean lllIllIIlllIIlI(final int lllllllllllllIIIlIlIIIIlIlIlllII, final int lllllllllllllIIIlIlIIIIlIlIllIll) {
        return lllllllllllllIIIlIlIIIIlIlIlllII < lllllllllllllIIIlIlIIIIlIlIllIll;
    }
    
    public int getTotalResources() {
        return this.total;
    }
}
