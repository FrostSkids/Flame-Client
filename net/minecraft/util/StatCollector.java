// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.util;

public class StatCollector
{
    private static /* synthetic */ StringTranslate localizedName;
    private static /* synthetic */ StringTranslate fallbackTranslator;
    
    public static String translateToFallback(final String lllllllllllllIIIllIlllIIlIlIlIll) {
        return StatCollector.fallbackTranslator.translateKey(lllllllllllllIIIllIlllIIlIlIlIll);
    }
    
    public static String translateToLocal(final String lllllllllllllIIIllIlllIIlIllIlII) {
        return StatCollector.localizedName.translateKey(lllllllllllllIIIllIlllIIlIllIlII);
    }
    
    public static long getLastTranslationUpdateTimeInMilliseconds() {
        return StatCollector.localizedName.getLastUpdateTimeInMilliseconds();
    }
    
    public static boolean canTranslate(final String lllllllllllllIIIllIlllIIlIlIlIII) {
        return StatCollector.localizedName.isKeyTranslated(lllllllllllllIIIllIlllIIlIlIlIII);
    }
    
    static {
        StatCollector.localizedName = StringTranslate.getInstance();
        StatCollector.fallbackTranslator = new StringTranslate();
    }
    
    public static String translateToLocalFormatted(final String lllllllllllllIIIllIlllIIlIlIllll, final Object... lllllllllllllIIIllIlllIIlIlIlllI) {
        return StatCollector.localizedName.translateKeyFormat(lllllllllllllIIIllIlllIIlIlIllll, lllllllllllllIIIllIlllIIlIlIlllI);
    }
}
