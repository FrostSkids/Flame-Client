// 
// Decompiled by Procyon v0.5.36
// 

package org.newdawn.slick.font.effects;

import java.util.List;

public interface ConfigurableEffect extends Effect
{
    void setValues(final List p0);
    
    List getValues();
    
    public interface Value
    {
        Object getObject();
        
        void showDialog();
        
        String getString();
        
        String getName();
        
        void setString(final String p0);
    }
}
