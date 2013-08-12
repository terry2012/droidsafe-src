package org.apache.http.impl.client;

// Droidsafe Imports
import droidsafe.annotations.*;
import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.HttpEntityEnclosingRequest;
import org.apache.http.ProtocolException;
import org.apache.http.protocol.HTTP;






public class EntityEnclosingRequestWrapper extends RequestWrapper implements HttpEntityEnclosingRequest {
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-17 10:25:34.880 -0400", hash_original_field = "F5E638CC78DD325906C1298A0C21FB6B", hash_generated_field = "1845537B516494D16BEEE561F2E771CF")

    private HttpEntity entity;
    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-17 10:25:34.881 -0400", hash_original_method = "88CBAA7B24A092901AFE36A2F3DCB57C", hash_generated_method = "71E4F64AC35EE8B5EA69812641731FEB")
    public  EntityEnclosingRequestWrapper(final HttpEntityEnclosingRequest request) throws ProtocolException {
        super(request);
        this.entity = request.getEntity();
        // ---------- Original Method ----------
        //this.entity = request.getEntity();
    }

    
        @DSModeled(DSC.SAFE)
@DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-17 10:25:34.881 -0400", hash_original_method = "FCFC1A07171F7DE920C85D2DD77008FA", hash_generated_method = "883B0C93FF166450A8E2EB969A2B7C25")
    public HttpEntity getEntity() {
HttpEntity varB0390008473457B24431D383C02B7BE2_1840634265 =         this.entity;
        varB0390008473457B24431D383C02B7BE2_1840634265.addTaint(taint);
        return varB0390008473457B24431D383C02B7BE2_1840634265;
        // ---------- Original Method ----------
        //return this.entity;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-17 10:25:34.882 -0400", hash_original_method = "ACC3C31B4104E926438E24B159B6E3A2", hash_generated_method = "FB3E9570D6065D0B91C8CE936F48D4CA")
    public void setEntity(final HttpEntity entity) {
        this.entity = entity;
        // ---------- Original Method ----------
        //this.entity = entity;
    }

    
    @DSModeled(DSC.SAFE)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-17 10:25:34.882 -0400", hash_original_method = "A0F17E45777A46D709253948E7008FD4", hash_generated_method = "9AC530F7ECA67E3B668B1726AE389265")
    public boolean expectContinue() {
        Header expect = getFirstHeader(HTTP.EXPECT_DIRECTIVE);
        boolean varBD99B96B93C1B43067A5D22A1607F29C_1051349394 = (expect != null && HTTP.EXPECT_CONTINUE.equalsIgnoreCase(expect.getValue()));
                boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_1622550909 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_1622550909;
        // ---------- Original Method ----------
        //Header expect = getFirstHeader(HTTP.EXPECT_DIRECTIVE);
        //return expect != null && HTTP.EXPECT_CONTINUE.equalsIgnoreCase(expect.getValue());
    }

    
    @DSModeled(DSC.SAFE)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-17 10:25:34.883 -0400", hash_original_method = "AEA1B1291DB01B3F8E06B03994A3FDB3", hash_generated_method = "527800BCC035FE4114EA3C47F5B45B2C")
    @Override
    public boolean isRepeatable() {
        boolean var15A36FF508F9A504FDFB4CFEFBC425CE_950852045 = (this.entity == null || this.entity.isRepeatable());
                boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_218116094 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_218116094;
        // ---------- Original Method ----------
        //return this.entity == null || this.entity.isRepeatable();
    }

    
}

