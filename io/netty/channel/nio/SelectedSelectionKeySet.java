// 
// Decompiled by Procyon v0.5.36
// 

package io.netty.channel.nio;

import java.util.Iterator;
import java.nio.channels.SelectionKey;
import java.util.AbstractSet;

final class SelectedSelectionKeySet extends AbstractSet<SelectionKey>
{
    private /* synthetic */ int keysASize;
    private /* synthetic */ SelectionKey[] keysA;
    private /* synthetic */ boolean isA;
    private /* synthetic */ SelectionKey[] keysB;
    private static final /* synthetic */ int[] llIlIIIIlIllII;
    private /* synthetic */ int keysBSize;
    
    private void doubleCapacityB() {
        final SelectionKey[] llllllllllllIllIllIlIllllIIIIIlI = new SelectionKey[this.keysB.length << SelectedSelectionKeySet.llIlIIIIlIllII[0]];
        System.arraycopy(this.keysB, SelectedSelectionKeySet.llIlIIIIlIllII[2], llllllllllllIllIllIlIllllIIIIIlI, SelectedSelectionKeySet.llIlIIIIlIllII[2], this.keysBSize);
        this.keysB = llllllllllllIllIllIlIllllIIIIIlI;
    }
    
    @Override
    public boolean contains(final Object llllllllllllIllIllIlIlllIlllIllI) {
        return SelectedSelectionKeySet.llIlIIIIlIllII[2] != 0;
    }
    
    private void doubleCapacityA() {
        final SelectionKey[] llllllllllllIllIllIlIllllIIIlIII = new SelectionKey[this.keysA.length << SelectedSelectionKeySet.llIlIIIIlIllII[0]];
        System.arraycopy(this.keysA, SelectedSelectionKeySet.llIlIIIIlIllII[2], llllllllllllIllIllIlIllllIIIlIII, SelectedSelectionKeySet.llIlIIIIlIllII[2], this.keysASize);
        this.keysA = llllllllllllIllIllIlIllllIIIlIII;
    }
    
    SelectedSelectionKeySet() {
        this.isA = (SelectedSelectionKeySet.llIlIIIIlIllII[0] != 0);
        this.keysA = new SelectionKey[SelectedSelectionKeySet.llIlIIIIlIllII[1]];
        this.keysB = this.keysA.clone();
    }
    
    @Override
    public boolean remove(final Object llllllllllllIllIllIlIlllIllllIII) {
        return SelectedSelectionKeySet.llIlIIIIlIllII[2] != 0;
    }
    
    private static boolean lIIlIIIlIllIlIIl(final int llllllllllllIllIllIlIlllIllIllII, final int llllllllllllIllIllIlIlllIllIlIll) {
        return llllllllllllIllIllIlIlllIllIllII == llllllllllllIllIllIlIlllIllIlIll;
    }
    
    private static void lIIlIIIlIllIIllI() {
        (llIlIIIIlIllII = new int[3])[0] = " ".length();
        SelectedSelectionKeySet.llIlIIIIlIllII[1] = (0xFFFFCCF1 & 0x370E);
        SelectedSelectionKeySet.llIlIIIIlIllII[2] = ((0x82 ^ 0xBC) & ~(0x58 ^ 0x66));
    }
    
    @Override
    public boolean add(final SelectionKey llllllllllllIllIllIlIllllIIIllIl) {
        if (lIIlIIIlIllIIlll(llllllllllllIllIllIlIllllIIIllIl)) {
            return SelectedSelectionKeySet.llIlIIIIlIllII[2] != 0;
        }
        if (lIIlIIIlIllIlIII(this.isA ? 1 : 0)) {
            int llllllllllllIllIllIlIllllIIlIIlI = this.keysASize;
            this.keysA[llllllllllllIllIllIlIllllIIlIIlI++] = llllllllllllIllIllIlIllllIIIllIl;
            this.keysASize = llllllllllllIllIllIlIllllIIlIIlI;
            if (lIIlIIIlIllIlIIl(llllllllllllIllIllIlIllllIIlIIlI, this.keysA.length)) {
                this.doubleCapacityA();
            }
            "".length();
            if (-"  ".length() >= 0) {
                return ((115 + 81 - 138 + 80 ^ 137 + 181 - 214 + 82) & (0xF7 ^ 0x9F ^ (0x70 ^ 0x28) ^ -" ".length())) != 0x0;
            }
        }
        else {
            int llllllllllllIllIllIlIllllIIlIIIl = this.keysBSize;
            this.keysB[llllllllllllIllIllIlIllllIIlIIIl++] = llllllllllllIllIllIlIllllIIIllIl;
            this.keysBSize = llllllllllllIllIllIlIllllIIlIIIl;
            if (lIIlIIIlIllIlIIl(llllllllllllIllIllIlIllllIIlIIIl, this.keysB.length)) {
                this.doubleCapacityB();
            }
        }
        return SelectedSelectionKeySet.llIlIIIIlIllII[0] != 0;
    }
    
    @Override
    public int size() {
        if (lIIlIIIlIllIlIII(this.isA ? 1 : 0)) {
            return this.keysASize;
        }
        return this.keysBSize;
    }
    
    @Override
    public Iterator<SelectionKey> iterator() {
        throw new UnsupportedOperationException();
    }
    
    static {
        lIIlIIIlIllIIllI();
    }
    
    private static boolean lIIlIIIlIllIlIII(final int llllllllllllIllIllIlIlllIllIIlll) {
        return llllllllllllIllIllIlIlllIllIIlll != 0;
    }
    
    SelectionKey[] flip() {
        if (lIIlIIIlIllIlIII(this.isA ? 1 : 0)) {
            this.isA = (SelectedSelectionKeySet.llIlIIIIlIllII[2] != 0);
            this.keysA[this.keysASize] = null;
            this.keysBSize = SelectedSelectionKeySet.llIlIIIIlIllII[2];
            return this.keysA;
        }
        this.isA = (SelectedSelectionKeySet.llIlIIIIlIllII[0] != 0);
        this.keysB[this.keysBSize] = null;
        this.keysASize = SelectedSelectionKeySet.llIlIIIIlIllII[2];
        return this.keysB;
    }
    
    private static boolean lIIlIIIlIllIIlll(final Object llllllllllllIllIllIlIlllIllIlIIl) {
        return llllllllllllIllIllIlIlllIllIlIIl == null;
    }
}
