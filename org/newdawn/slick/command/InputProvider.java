// 
// Decompiled by Procyon v0.5.36
// 

package org.newdawn.slick.command;

import org.newdawn.slick.util.InputAdapter;
import org.newdawn.slick.InputListener;
import java.util.Iterator;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import org.newdawn.slick.Input;

public class InputProvider
{
    private static final /* synthetic */ int[] lIIIIllllllllI;
    private /* synthetic */ Input input;
    private /* synthetic */ HashMap commands;
    private /* synthetic */ boolean active;
    private /* synthetic */ ArrayList listeners;
    private /* synthetic */ HashMap commandState;
    
    private static boolean lIllllIllIIIIlI(final int lllllllllllllIlIIIllIlllllllllIl, final int lllllllllllllIlIIIllIlllllllllII) {
        return lllllllllllllIlIIIllIlllllllllIl < lllllllllllllIlIIIllIlllllllllII;
    }
    
    private static void lIllllIlIllllIl() {
        (lIIIIllllllllI = new int[2])[0] = " ".length();
        InputProvider.lIIIIllllllllI[1] = ((0x55 ^ 0x35) & ~(0xDA ^ 0xBA));
    }
    
    public void removeListener(final InputProviderListener lllllllllllllIlIIIlllIIIIlIIIlIl) {
        this.listeners.remove(lllllllllllllIlIIIlllIIIIlIIIlIl);
        "".length();
    }
    
    public boolean isCommandControlPressed(final Command lllllllllllllIlIIIlllIIIIIIlIlIl) {
        return this.getState(lllllllllllllIlIIIlllIIIIIIlIlIl).isPressed();
    }
    
    private static boolean lIllllIlIllllll(final int lllllllllllllIlIIIllIlllllllIIII) {
        return lllllllllllllIlIIIllIlllllllIIII == 0;
    }
    
    public List getControlsFor(final Command lllllllllllllIlIIIlllIIIIlIlllll) {
        final List lllllllllllllIlIIIlllIIIIllIIIIl = new ArrayList();
        final Iterator lllllllllllllIlIIIlllIIIIllIIlII = this.commands.entrySet().iterator();
        while (lIllllIlIlllllI(lllllllllllllIlIIIlllIIIIllIIlII.hasNext() ? 1 : 0)) {
            final Map.Entry lllllllllllllIlIIIlllIIIIllIIlll = lllllllllllllIlIIIlllIIIIllIIlII.next();
            final Control lllllllllllllIlIIIlllIIIIllIIllI = lllllllllllllIlIIIlllIIIIllIIlll.getKey();
            final Command lllllllllllllIlIIIlllIIIIllIIlIl = lllllllllllllIlIIIlllIIIIllIIlll.getValue();
            if (lIllllIllIIIIII(lllllllllllllIlIIIlllIIIIllIIlIl, lllllllllllllIlIIIlllIIIIlIlllll)) {
                lllllllllllllIlIIIlllIIIIllIIIIl.add(lllllllllllllIlIIIlllIIIIllIIllI);
                "".length();
            }
            "".length();
            if (-(0x85 ^ 0x81) >= 0) {
                return null;
            }
        }
        return lllllllllllllIlIIIlllIIIIllIIIIl;
    }
    
    private static boolean lIllllIllIIIIII(final Object lllllllllllllIlIIIllIllllllllIIl, final Object lllllllllllllIlIIIllIllllllllIII) {
        return lllllllllllllIlIIIllIllllllllIIl == lllllllllllllIlIIIllIllllllllIII;
    }
    
    protected void firePressed(final Command lllllllllllllIlIIIlllIIIIIIIllll) {
        this.getState(lllllllllllllIlIIIlllIIIIIIIllll).down = (boolean)(InputProvider.lIIIIllllllllI[0] != 0);
        "".length();
        this.getState(lllllllllllllIlIIIlllIIIIIIIllll).pressed = (boolean)(InputProvider.lIIIIllllllllI[0] != 0);
        "".length();
        if (lIllllIlIllllll(this.isActive() ? 1 : 0)) {
            return;
        }
        int lllllllllllllIlIIIlllIIIIIIlIIIl = InputProvider.lIIIIllllllllI[1];
        while (lIllllIllIIIIlI(lllllllllllllIlIIIlllIIIIIIlIIIl, this.listeners.size())) {
            this.listeners.get(lllllllllllllIlIIIlllIIIIIIlIIIl).controlPressed(lllllllllllllIlIIIlllIIIIIIIllll);
            ++lllllllllllllIlIIIlllIIIIIIlIIIl;
            "".length();
            if ("   ".length() < " ".length()) {
                return;
            }
        }
    }
    
    private static boolean lIllllIllIIIIIl(final Object lllllllllllllIlIIIllIlllllllIlII) {
        return lllllllllllllIlIIIllIlllllllIlII == null;
    }
    
    public List getUniqueCommands() {
        final List lllllllllllllIlIIIlllIIIIlllIIll = new ArrayList();
        final Iterator lllllllllllllIlIIIlllIIIIlllIlIl = this.commands.values().iterator();
        while (lIllllIlIlllllI(lllllllllllllIlIIIlllIIIIlllIlIl.hasNext() ? 1 : 0)) {
            final Command lllllllllllllIlIIIlllIIIIlllIllI = lllllllllllllIlIIIlllIIIIlllIlIl.next();
            if (lIllllIlIllllll(lllllllllllllIlIIIlllIIIIlllIIll.contains(lllllllllllllIlIIIlllIIIIlllIllI) ? 1 : 0)) {
                lllllllllllllIlIIIlllIIIIlllIIll.add(lllllllllllllIlIIIlllIIIIlllIllI);
                "".length();
            }
            "".length();
            if (null != null) {
                return null;
            }
        }
        return lllllllllllllIlIIIlllIIIIlllIIll;
    }
    
    protected void fireReleased(final Command lllllllllllllIlIIIlllIIIIIIIIlII) {
        this.getState(lllllllllllllIlIIIlllIIIIIIIIlII).down = (boolean)(InputProvider.lIIIIllllllllI[1] != 0);
        "".length();
        if (lIllllIlIllllll(this.isActive() ? 1 : 0)) {
            return;
        }
        int lllllllllllllIlIIIlllIIIIIIIlIII = InputProvider.lIIIIllllllllI[1];
        while (lIllllIllIIIIlI(lllllllllllllIlIIIlllIIIIIIIlIII, this.listeners.size())) {
            this.listeners.get(lllllllllllllIlIIIlllIIIIIIIlIII).controlReleased(lllllllllllllIlIIIlllIIIIIIIIlII);
            ++lllllllllllllIlIIIlllIIIIIIIlIII;
            "".length();
            if (" ".length() <= 0) {
                return;
            }
        }
    }
    
    public void addListener(final InputProviderListener lllllllllllllIlIIIlllIIIIlIIlIll) {
        this.listeners.add(lllllllllllllIlIIIlllIIIIlIIlIll);
        "".length();
    }
    
    public void bindCommand(final Control lllllllllllllIlIIIlllIIIIIllllIl, final Command lllllllllllllIlIIIlllIIIIIllllII) {
        this.commands.put(lllllllllllllIlIIIlllIIIIIllllIl, lllllllllllllIlIIIlllIIIIIllllII);
        "".length();
        if (lIllllIllIIIIIl(this.commandState.get(lllllllllllllIlIIIlllIIIIIllllII))) {
            this.commandState.put(lllllllllllllIlIIIlllIIIIIllllII, new CommandState());
            "".length();
        }
    }
    
    static {
        lIllllIlIllllIl();
    }
    
    private static boolean lIllllIlIlllllI(final int lllllllllllllIlIIIllIlllllllIIlI) {
        return lllllllllllllIlIIIllIlllllllIIlI != 0;
    }
    
    public void unbindCommand(final Control lllllllllllllIlIIIlllIIIIIlIlIll) {
        final Command lllllllllllllIlIIIlllIIIIIlIlIlI = this.commands.remove(lllllllllllllIlIIIlllIIIIIlIlIll);
        if (lIllllIllIIIIll(lllllllllllllIlIIIlllIIIIIlIlIlI) && lIllllIlIllllll(this.commands.keySet().contains(lllllllllllllIlIIIlllIIIIIlIlIlI) ? 1 : 0)) {
            this.commandState.remove(lllllllllllllIlIIIlllIIIIIlIlIlI);
            "".length();
        }
    }
    
    public boolean isActive() {
        return this.active;
    }
    
    public void setActive(final boolean lllllllllllllIlIIIlllIIIIlIlIlII) {
        this.active = lllllllllllllIlIIIlllIIIIlIlIlII;
    }
    
    public boolean isCommandControlDown(final Command lllllllllllllIlIIIlllIIIIIIlllIl) {
        return this.getState(lllllllllllllIlIIIlllIIIIIIlllIl).isDown();
    }
    
    private CommandState getState(final Command lllllllllllllIlIIIlllIIIIIlIIIIl) {
        return this.commandState.get(lllllllllllllIlIIIlllIIIIIlIIIIl);
    }
    
    public InputProvider(final Input lllllllllllllIlIIIlllIIIIllllIll) {
        this.listeners = new ArrayList();
        this.commandState = new HashMap();
        this.active = (InputProvider.lIIIIllllllllI[0] != 0);
        this.input = lllllllllllllIlIIIlllIIIIllllIll;
        lllllllllllllIlIIIlllIIIIllllIll.addListener(new InputListenerImpl());
        this.commands = new HashMap();
    }
    
    public void clearCommand(final Command lllllllllllllIlIIIlllIIIIIllIlIl) {
        final List lllllllllllllIlIIIlllIIIIIllIlII = this.getControlsFor(lllllllllllllIlIIIlllIIIIIllIlIl);
        int lllllllllllllIlIIIlllIIIIIllIlll = InputProvider.lIIIIllllllllI[1];
        while (lIllllIllIIIIlI(lllllllllllllIlIIIlllIIIIIllIlll, lllllllllllllIlIIIlllIIIIIllIlII.size())) {
            this.unbindCommand(lllllllllllllIlIIIlllIIIIIllIlII.get(lllllllllllllIlIIIlllIIIIIllIlll));
            ++lllllllllllllIlIIIlllIIIIIllIlll;
            "".length();
            if ((0x36 ^ 0x3A ^ (0xC8 ^ 0xC0)) < (128 + 72 - 104 + 42 ^ 19 + 111 - 12 + 24)) {
                return;
            }
        }
    }
    
    private static boolean lIllllIllIIIIll(final Object lllllllllllllIlIIIllIlllllllIllI) {
        return lllllllllllllIlIIIllIlllllllIllI != null;
    }
    
    private class InputListenerImpl extends InputAdapter
    {
        private static final /* synthetic */ int[] lIIlIIIlIIlIll;
        
        @Override
        public void mousePressed(final int lllllllllllllIIlllIIlllllIlIIIlI, final int lllllllllllllIIlllIIlllllIlIIIIl, final int lllllllllllllIIlllIIlllllIlIIIII) {
            final Command lllllllllllllIIlllIIlllllIIlllll = InputProvider.this.commands.get(new MouseButtonControl(lllllllllllllIIlllIIlllllIlIIIlI));
            if (llIIlIlIllIIIll(lllllllllllllIIlllIIlllllIIlllll)) {
                InputProvider.this.firePressed(lllllllllllllIIlllIIlllllIIlllll);
            }
        }
        
        private static boolean llIIlIlIllIIIll(final Object lllllllllllllIIlllIIllllIIlIlIII) {
            return lllllllllllllIIlllIIllllIIlIlIII != null;
        }
        
        @Override
        public void controllerDownReleased(final int lllllllllllllIIlllIIllllIlIIllIl) {
            final Command lllllllllllllIIlllIIllllIlIIllII = InputProvider.this.commands.get(new ControllerDirectionControl(lllllllllllllIIlllIIllllIlIIllIl, ControllerDirectionControl.DOWN));
            if (llIIlIlIllIIIll(lllllllllllllIIlllIIllllIlIIllII)) {
                InputProvider.this.fireReleased(lllllllllllllIIlllIIllllIlIIllII);
            }
        }
        
        @Override
        public void mouseReleased(final int lllllllllllllIIlllIIlllllIIlIlll, final int lllllllllllllIIlllIIlllllIIlIllI, final int lllllllllllllIIlllIIlllllIIlIlIl) {
            final Command lllllllllllllIIlllIIlllllIIlIlII = InputProvider.this.commands.get(new MouseButtonControl(lllllllllllllIIlllIIlllllIIlIlll));
            if (llIIlIlIllIIIll(lllllllllllllIIlllIIlllllIIlIlII)) {
                InputProvider.this.fireReleased(lllllllllllllIIlllIIlllllIIlIlII);
            }
        }
        
        @Override
        public void controllerDownPressed(final int lllllllllllllIIlllIIllllIlIlIIll) {
            final Command lllllllllllllIIlllIIllllIlIlIlIl = InputProvider.this.commands.get(new ControllerDirectionControl(lllllllllllllIIlllIIllllIlIlIIll, ControllerDirectionControl.DOWN));
            if (llIIlIlIllIIIll(lllllllllllllIIlllIIllllIlIlIlIl)) {
                InputProvider.this.firePressed(lllllllllllllIIlllIIllllIlIlIlIl);
            }
        }
        
        @Override
        public void controllerRightReleased(final int lllllllllllllIIlllIIllllIlllIIIl) {
            final Command lllllllllllllIIlllIIllllIlllIIII = InputProvider.this.commands.get(new ControllerDirectionControl(lllllllllllllIIlllIIllllIlllIIIl, ControllerDirectionControl.RIGHT));
            if (llIIlIlIllIIIll(lllllllllllllIIlllIIllllIlllIIII)) {
                InputProvider.this.fireReleased(lllllllllllllIIlllIIllllIlllIIII);
            }
        }
        
        @Override
        public void controllerRightPressed(final int lllllllllllllIIlllIIllllIlllIlll) {
            final Command lllllllllllllIIlllIIllllIllllIIl = InputProvider.this.commands.get(new ControllerDirectionControl(lllllllllllllIIlllIIllllIlllIlll, ControllerDirectionControl.RIGHT));
            if (llIIlIlIllIIIll(lllllllllllllIIlllIIllllIllllIIl)) {
                InputProvider.this.firePressed(lllllllllllllIIlllIIllllIllllIIl);
            }
        }
        
        @Override
        public void controllerUpReleased(final int lllllllllllllIIlllIIllllIlIlllII) {
            final Command lllllllllllllIIlllIIllllIlIllllI = InputProvider.this.commands.get(new ControllerDirectionControl(lllllllllllllIIlllIIllllIlIlllII, ControllerDirectionControl.UP));
            if (llIIlIlIllIIIll(lllllllllllllIIlllIIllllIlIllllI)) {
                InputProvider.this.fireReleased(lllllllllllllIIlllIIllllIlIllllI);
            }
        }
        
        static {
            llIIlIlIllIIIlI();
        }
        
        @Override
        public void controllerButtonReleased(final int lllllllllllllIIlllIIllllIIllIlll, final int lllllllllllllIIlllIIllllIIllIllI) {
            final Command lllllllllllllIIlllIIllllIIllIlIl = InputProvider.this.commands.get(new ControllerButtonControl(lllllllllllllIIlllIIllllIIllIlll, lllllllllllllIIlllIIllllIIllIllI));
            if (llIIlIlIllIIIll(lllllllllllllIIlllIIllllIIllIlIl)) {
                InputProvider.this.fireReleased(lllllllllllllIIlllIIllllIIllIlIl);
            }
        }
        
        @Override
        public boolean isAcceptingInput() {
            return InputListenerImpl.lIIlIIIlIIlIll[0] != 0;
        }
        
        @Override
        public void keyPressed(final int lllllllllllllIIlllIIlllllIllIIlI, final char lllllllllllllIIlllIIlllllIllIlIl) {
            final Command lllllllllllllIIlllIIlllllIllIlII = InputProvider.this.commands.get(new KeyControl(lllllllllllllIIlllIIlllllIllIIlI));
            if (llIIlIlIllIIIll(lllllllllllllIIlllIIlllllIllIlII)) {
                InputProvider.this.firePressed(lllllllllllllIIlllIIlllllIllIlII);
            }
        }
        
        @Override
        public void controllerButtonPressed(final int lllllllllllllIIlllIIllllIIllllll, final int lllllllllllllIIlllIIllllIlIIIIlI) {
            final Command lllllllllllllIIlllIIllllIlIIIIIl = InputProvider.this.commands.get(new ControllerButtonControl(lllllllllllllIIlllIIllllIIllllll, lllllllllllllIIlllIIllllIlIIIIlI));
            if (llIIlIlIllIIIll(lllllllllllllIIlllIIllllIlIIIIIl)) {
                InputProvider.this.firePressed(lllllllllllllIIlllIIllllIlIIIIIl);
            }
        }
        
        @Override
        public void keyReleased(final int lllllllllllllIIlllIIlllllIlIllII, final char lllllllllllllIIlllIIlllllIlIlIll) {
            final Command lllllllllllllIIlllIIlllllIlIlIlI = InputProvider.this.commands.get(new KeyControl(lllllllllllllIIlllIIlllllIlIllII));
            if (llIIlIlIllIIIll(lllllllllllllIIlllIIlllllIlIlIlI)) {
                InputProvider.this.fireReleased(lllllllllllllIIlllIIlllllIlIlIlI);
            }
        }
        
        private static void llIIlIlIllIIIlI() {
            (lIIlIIIlIIlIll = new int[1])[0] = " ".length();
        }
        
        @Override
        public void controllerLeftReleased(final int lllllllllllllIIlllIIlllllIIIIIII) {
            final Command lllllllllllllIIlllIIlllllIIIIIlI = InputProvider.this.commands.get(new ControllerDirectionControl(lllllllllllllIIlllIIlllllIIIIIII, ControllerDirectionControl.LEFT));
            if (llIIlIlIllIIIll(lllllllllllllIIlllIIlllllIIIIIlI)) {
                InputProvider.this.fireReleased(lllllllllllllIIlllIIlllllIIIIIlI);
            }
        }
        
        @Override
        public void controllerUpPressed(final int lllllllllllllIIlllIIllllIllIlIII) {
            final Command lllllllllllllIIlllIIllllIllIIlll = InputProvider.this.commands.get(new ControllerDirectionControl(lllllllllllllIIlllIIllllIllIlIII, ControllerDirectionControl.UP));
            if (llIIlIlIllIIIll(lllllllllllllIIlllIIllllIllIIlll)) {
                InputProvider.this.firePressed(lllllllllllllIIlllIIllllIllIIlll);
            }
        }
        
        @Override
        public void controllerLeftPressed(final int lllllllllllllIIlllIIlllllIIIllII) {
            final Command lllllllllllllIIlllIIlllllIIIlIll = InputProvider.this.commands.get(new ControllerDirectionControl(lllllllllllllIIlllIIlllllIIIllII, ControllerDirectionControl.LEFT));
            if (llIIlIlIllIIIll(lllllllllllllIIlllIIlllllIIIlIll)) {
                InputProvider.this.firePressed(lllllllllllllIIlllIIlllllIIIlIll);
            }
        }
    }
    
    private class CommandState
    {
        private static final /* synthetic */ int[] llIllIIIlIIIlI;
        private /* synthetic */ boolean down;
        private /* synthetic */ boolean pressed;
        
        private static boolean lIIlIllIIllIllIl(final int llllllllllllIllIlIIIIIllllllllII) {
            return llllllllllllIllIlIIIIIllllllllII != 0;
        }
        
        public boolean isDown() {
            return this.down;
        }
        
        private static void lIIlIllIIllIlIll() {
            (llIllIIIlIIIlI = new int[2])[0] = ((0x71 ^ 0x2B) & ~(0x46 ^ 0x1C));
            CommandState.llIllIIIlIIIlI[1] = " ".length();
        }
        
        static {
            lIIlIllIIllIlIll();
        }
        
        public boolean isPressed() {
            if (lIIlIllIIllIllIl(this.pressed ? 1 : 0)) {
                this.pressed = (CommandState.llIllIIIlIIIlI[0] != 0);
                return CommandState.llIllIIIlIIIlI[1] != 0;
            }
            return CommandState.llIllIIIlIIIlI[0] != 0;
        }
    }
}
