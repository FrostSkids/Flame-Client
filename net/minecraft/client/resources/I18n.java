// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.client.resources;

public class I18n
{
    private static /* synthetic */ Locale i18nLocale;
    
    public static String format(final String llllllllllllIlIllIlIIIIIllllIIll, final Object... llllllllllllIlIllIlIIIIIllllIIII) {
        return I18n.i18nLocale.formatMessage(llllllllllllIlIllIlIIIIIllllIIll, llllllllllllIlIllIlIIIIIllllIIII);
    }
    
    static void setLocale(final Locale llllllllllllIlIllIlIIIIIllllIlll) {
        I18n.i18nLocale = llllllllllllIlIllIlIIIIIllllIlll;
    }
}
