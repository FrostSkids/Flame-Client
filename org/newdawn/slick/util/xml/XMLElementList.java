// 
// Decompiled by Procyon v0.5.36
// 

package org.newdawn.slick.util.xml;

import java.util.Collection;
import java.util.ArrayList;

public class XMLElementList
{
    private /* synthetic */ ArrayList list;
    
    public boolean contains(final XMLElement lllllllllllllIIIllIIIllIllIllIII) {
        return this.list.contains(lllllllllllllIIIllIIIllIllIllIII);
    }
    
    public XMLElementList() {
        this.list = new ArrayList();
    }
    
    public void add(final XMLElement lllllllllllllIIIllIIIllIlllIIlll) {
        this.list.add(lllllllllllllIIIllIIIllIlllIIlll);
        "".length();
    }
    
    public void addAllTo(final Collection lllllllllllllIIIllIIIllIllIlIIII) {
        lllllllllllllIIIllIIIllIllIlIIII.addAll(this.list);
        "".length();
    }
    
    public XMLElement get(final int lllllllllllllIIIllIIIllIllIlllII) {
        return this.list.get(lllllllllllllIIIllIIIllIllIlllII);
    }
    
    public int size() {
        return this.list.size();
    }
}
