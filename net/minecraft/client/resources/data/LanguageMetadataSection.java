// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.client.resources.data;

import net.minecraft.client.resources.Language;
import java.util.Collection;

public class LanguageMetadataSection implements IMetadataSection
{
    private final /* synthetic */ Collection<Language> languages;
    
    public Collection<Language> getLanguages() {
        return this.languages;
    }
    
    public LanguageMetadataSection(final Collection<Language> llllllllllllIllllIllIllllllIIlIl) {
        this.languages = llllllllllllIllllIllIllllllIIlIl;
    }
}
