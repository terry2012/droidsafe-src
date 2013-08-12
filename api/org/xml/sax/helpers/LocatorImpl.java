package org.xml.sax.helpers;

// Droidsafe Imports
import droidsafe.annotations.*;
import org.xml.sax.Locator;






public class LocatorImpl implements Locator {
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-17 10:25:44.333 -0400", hash_original_field = "24AB20BFB578F0A89FF4A9C081F21384", hash_generated_field = "60BF385FD0C88E4BC32EFD3E71F5528C")

    private String publicId;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-17 10:25:44.333 -0400", hash_original_field = "089D1A278481B86E821237F8E98E6DE7", hash_generated_field = "D8573F28EF4599A1790219EF1708D9C9")

    private String systemId;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-17 10:25:44.333 -0400", hash_original_field = "BB8A5A0BF5B38F7D371E940DAED92DA6", hash_generated_field = "09A4698FFE38FA7794A20A1F94A6867E")

    private int lineNumber;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-17 10:25:44.333 -0400", hash_original_field = "9D2C17DB0A32EEAAF3B613AC483AEB6C", hash_generated_field = "26A7E6694FD33EFB482AC4BA7726E9A4")

    private int columnNumber;
    
    @DSModeled(DSC.SAFE)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-17 10:25:44.333 -0400", hash_original_method = "1944A965405A65742195C130B4EA39CD", hash_generated_method = "41C9F2F41F2C736A19B0FB99C5AC7CBE")
    public  LocatorImpl() {
        // ---------- Original Method ----------
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-17 10:25:44.333 -0400", hash_original_method = "5648D7E11C6AEEB11BABA800E96BBFD7", hash_generated_method = "384F143842CB88C00F30B0C8BD894954")
    public  LocatorImpl(Locator locator) {
        addTaint(locator.getTaint());
        setPublicId(locator.getPublicId());
        setSystemId(locator.getSystemId());
        setLineNumber(locator.getLineNumber());
        setColumnNumber(locator.getColumnNumber());
        // ---------- Original Method ----------
        //setPublicId(locator.getPublicId());
        //setSystemId(locator.getSystemId());
        //setLineNumber(locator.getLineNumber());
        //setColumnNumber(locator.getColumnNumber());
    }

    
        @DSModeled(DSC.SAFE)
@DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-17 10:25:44.334 -0400", hash_original_method = "C19BBE926A67132A1C6BC386100A3E69", hash_generated_method = "969EA29FFDE4E39719B5C107F24E3B14")
    public String getPublicId() {
String var76991CCBEF027A0871CF61642EBA53AB_1090792782 =         publicId;
        var76991CCBEF027A0871CF61642EBA53AB_1090792782.addTaint(taint);
        return var76991CCBEF027A0871CF61642EBA53AB_1090792782;
        // ---------- Original Method ----------
        //return publicId;
    }

    
        @DSModeled(DSC.SAFE)
@DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-17 10:25:44.334 -0400", hash_original_method = "8088708D8DEEE6054468B7FD77400E50", hash_generated_method = "8A802252A4FC5C63F9391394BB9C1A3E")
    public String getSystemId() {
String varB7D0727ACC7388EA86587212DD1C6E9F_1705243753 =         systemId;
        varB7D0727ACC7388EA86587212DD1C6E9F_1705243753.addTaint(taint);
        return varB7D0727ACC7388EA86587212DD1C6E9F_1705243753;
        // ---------- Original Method ----------
        //return systemId;
    }

    
        @DSModeled(DSC.SAFE)
@DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-17 10:25:44.334 -0400", hash_original_method = "0B737233CC5342C14C595BEE1A87604B", hash_generated_method = "CFE7EF41B3AA081F7012E4458EED2A16")
    public int getLineNumber() {
        int varBB8A5A0BF5B38F7D371E940DAED92DA6_613496760 = (lineNumber);
                int varFA7153F7ED1CB6C0FCF2FFB2FAC21748_515594144 = getTaintInt();
        return varFA7153F7ED1CB6C0FCF2FFB2FAC21748_515594144;
        // ---------- Original Method ----------
        //return lineNumber;
    }

    
        @DSModeled(DSC.SAFE)
@DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-17 10:25:44.334 -0400", hash_original_method = "50401770B079F9FC2B373BD150CB3B15", hash_generated_method = "597F15986E2537381EE96BAAE3BB0B98")
    public int getColumnNumber() {
        int var9D2C17DB0A32EEAAF3B613AC483AEB6C_433584106 = (columnNumber);
                int varFA7153F7ED1CB6C0FCF2FFB2FAC21748_1210029527 = getTaintInt();
        return varFA7153F7ED1CB6C0FCF2FFB2FAC21748_1210029527;
        // ---------- Original Method ----------
        //return columnNumber;
    }

    
        @DSModeled(DSC.SAFE)
@DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-17 10:25:44.334 -0400", hash_original_method = "0C418225BFB03C04E3636F3891B47A3E", hash_generated_method = "784431903087FA4FFEF9763F16480709")
    public void setPublicId(String publicId) {
        this.publicId = publicId;
        // ---------- Original Method ----------
        //this.publicId = publicId;
    }

    
        @DSModeled(DSC.SAFE)
@DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-17 10:25:44.334 -0400", hash_original_method = "77F5337B905F22D1C71F7C949FEF5117", hash_generated_method = "DE20300D341EFA9D9888E5637810608B")
    public void setSystemId(String systemId) {
        this.systemId = systemId;
        // ---------- Original Method ----------
        //this.systemId = systemId;
    }

    
        @DSModeled(DSC.SAFE)
@DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-17 10:25:44.334 -0400", hash_original_method = "57105994EF91DD2584057988497ACBF5", hash_generated_method = "07212E907D790DC6F7BB6A6C3A61B057")
    public void setLineNumber(int lineNumber) {
        this.lineNumber = lineNumber;
        // ---------- Original Method ----------
        //this.lineNumber = lineNumber;
    }

    
        @DSModeled(DSC.SAFE)
@DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-17 10:25:44.334 -0400", hash_original_method = "4B7308C11003E2EBA4BF69C9D8266B60", hash_generated_method = "92DC60B83C9715659F4A09690400C6C8")
    public void setColumnNumber(int columnNumber) {
        this.columnNumber = columnNumber;
        // ---------- Original Method ----------
        //this.columnNumber = columnNumber;
    }

    
}

