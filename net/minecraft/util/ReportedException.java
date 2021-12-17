// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.util;

import net.minecraft.crash.CrashReport;

public class ReportedException extends RuntimeException
{
    private final /* synthetic */ CrashReport theReportedExceptionCrashReport;
    
    public ReportedException(final CrashReport lllllllllllllIIlIlIIlIIIlIlIIlII) {
        this.theReportedExceptionCrashReport = lllllllllllllIIlIlIIlIIIlIlIIlII;
    }
    
    @Override
    public String getMessage() {
        return this.theReportedExceptionCrashReport.getDescription();
    }
    
    public CrashReport getCrashReport() {
        return this.theReportedExceptionCrashReport;
    }
    
    @Override
    public Throwable getCause() {
        return this.theReportedExceptionCrashReport.getCrashCause();
    }
}
