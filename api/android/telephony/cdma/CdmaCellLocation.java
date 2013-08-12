package android.telephony.cdma;

// Droidsafe Imports
import droidsafe.annotations.*;
import android.os.Bundle;
import android.telephony.CellLocation;





public class CdmaCellLocation extends CellLocation {
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-17 10:23:35.233 -0400", hash_original_field = "2B9F88F31AD9FCE7ABFBB18752950285", hash_generated_field = "880CD477F89AEF4CABEE47659812611F")

    private int mBaseStationId = -1;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-17 10:23:35.234 -0400", hash_original_field = "A4905204300C202E8EC2868687891FB1", hash_generated_field = "F33E82AA4D4032A9950970FEC5999108")

    private int mBaseStationLatitude = INVALID_LAT_LONG;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-17 10:23:35.234 -0400", hash_original_field = "541CA7BA4B615865A9786E9ED80E68C2", hash_generated_field = "72B050148DB085190086BCC6506DAE80")

    private int mBaseStationLongitude = INVALID_LAT_LONG;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-17 10:23:35.234 -0400", hash_original_field = "A2C016429B67E11504F428C6C56EF165", hash_generated_field = "5B31DE8CC89DD13B11EA69E8D17F6B69")

    private int mSystemId = -1;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-17 10:23:35.234 -0400", hash_original_field = "D8D1D4C0DE12D0696DFA216CCA322C8C", hash_generated_field = "61B4BCE8DF023A8A81D64AB2D58B0D50")

    private int mNetworkId = -1;
    
    @DSModeled(DSC.SAFE)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-17 10:23:35.234 -0400", hash_original_method = "5C896DC446B6DB5EAC37BD66E663CEA5", hash_generated_method = "A6B4E6684301834C9B993D832B63288A")
    public  CdmaCellLocation() {
        this.mBaseStationId = -1;
        this.mBaseStationLatitude = INVALID_LAT_LONG;
        this.mBaseStationLongitude = INVALID_LAT_LONG;
        this.mSystemId = -1;
        this.mNetworkId = -1;
        // ---------- Original Method ----------
        //this.mBaseStationId = -1;
        //this.mBaseStationLatitude = INVALID_LAT_LONG;
        //this.mBaseStationLongitude = INVALID_LAT_LONG;
        //this.mSystemId = -1;
        //this.mNetworkId = -1;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-17 10:23:35.236 -0400", hash_original_method = "8EA08E2DEACD96E97EA367485FCE09D0", hash_generated_method = "8F9524D6F69E9AD19BD6E67135034EBD")
    public  CdmaCellLocation(Bundle bundle) {
        this.mBaseStationId = bundle.getInt("baseStationId", mBaseStationId);
        this.mBaseStationLatitude = bundle.getInt("baseStationLatitude", mBaseStationLatitude);
        this.mBaseStationLongitude = bundle.getInt("baseStationLongitude", mBaseStationLongitude);
        this.mSystemId = bundle.getInt("systemId", mSystemId);
        this.mNetworkId = bundle.getInt("networkId", mNetworkId);
        // ---------- Original Method ----------
        //this.mBaseStationId = bundle.getInt("baseStationId", mBaseStationId);
        //this.mBaseStationLatitude = bundle.getInt("baseStationLatitude", mBaseStationLatitude);
        //this.mBaseStationLongitude = bundle.getInt("baseStationLongitude", mBaseStationLongitude);
        //this.mSystemId = bundle.getInt("systemId", mSystemId);
        //this.mNetworkId = bundle.getInt("networkId", mNetworkId);
    }

    
        @DSModeled(DSC.SAFE)
@DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-17 10:23:35.236 -0400", hash_original_method = "5BA2DB973405907BCB7576020C4BB767", hash_generated_method = "ADDEA996CD41C122F409D3717D8886C1")
    public int getBaseStationId() {
        int var83DE69BDE54D9DD130453E5F2CB98A4F_570881408 = (this.mBaseStationId);
                int varFA7153F7ED1CB6C0FCF2FFB2FAC21748_594578955 = getTaintInt();
        return varFA7153F7ED1CB6C0FCF2FFB2FAC21748_594578955;
        // ---------- Original Method ----------
        //return this.mBaseStationId;
    }

    
        @DSModeled(DSC.SAFE)
@DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-17 10:23:35.237 -0400", hash_original_method = "8D32771FFADF2E37F4C4C4E7BB2945F8", hash_generated_method = "B85DA554D2E6CCD105E05B1882025AB1")
    public int getBaseStationLatitude() {
        int varD18636815E0D0DF6EA3F7C118258ED98_845808776 = (this.mBaseStationLatitude);
                int varFA7153F7ED1CB6C0FCF2FFB2FAC21748_1676796136 = getTaintInt();
        return varFA7153F7ED1CB6C0FCF2FFB2FAC21748_1676796136;
        // ---------- Original Method ----------
        //return this.mBaseStationLatitude;
    }

    
        @DSModeled(DSC.SAFE)
@DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-17 10:23:35.237 -0400", hash_original_method = "B2E759A184D0C15083668122E08B0641", hash_generated_method = "3CEDFC367024B961468734D6A6C23CC7")
    public int getBaseStationLongitude() {
        int var0C827E6E4C71764E5957681DD67AB006_449601795 = (this.mBaseStationLongitude);
                int varFA7153F7ED1CB6C0FCF2FFB2FAC21748_505933029 = getTaintInt();
        return varFA7153F7ED1CB6C0FCF2FFB2FAC21748_505933029;
        // ---------- Original Method ----------
        //return this.mBaseStationLongitude;
    }

    
        @DSModeled(DSC.SAFE)
@DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-17 10:23:35.237 -0400", hash_original_method = "E5E4F22C1EB64E5BA2863333F6C891A3", hash_generated_method = "1C8529A0C96D9EE6F751E377D74AA715")
    public int getSystemId() {
        int varDC9AC627E8999951F7D1333DA260C4E1_1396043320 = (this.mSystemId);
                int varFA7153F7ED1CB6C0FCF2FFB2FAC21748_2129789764 = getTaintInt();
        return varFA7153F7ED1CB6C0FCF2FFB2FAC21748_2129789764;
        // ---------- Original Method ----------
        //return this.mSystemId;
    }

    
        @DSModeled(DSC.SAFE)
@DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-17 10:23:35.238 -0400", hash_original_method = "909C93F66AD557988A123F548D8C31FC", hash_generated_method = "1F5499D1F31EFA1BE5E207F2C769CB6C")
    public int getNetworkId() {
        int varC36C789BAAC39C6FF0348461365E3AA8_773908244 = (this.mNetworkId);
                int varFA7153F7ED1CB6C0FCF2FFB2FAC21748_1294552151 = getTaintInt();
        return varFA7153F7ED1CB6C0FCF2FFB2FAC21748_1294552151;
        // ---------- Original Method ----------
        //return this.mNetworkId;
    }

    
        @DSModeled(DSC.SAFE)
@DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-17 10:23:35.239 -0400", hash_original_method = "0C9042B8D6AE69440E11B69CE7953639", hash_generated_method = "677DCE7DC5322BDEF3694C512B2DB3B9")
    public void setStateInvalid() {
        this.mBaseStationId = -1;
        this.mBaseStationLatitude = INVALID_LAT_LONG;
        this.mBaseStationLongitude = INVALID_LAT_LONG;
        this.mSystemId = -1;
        this.mNetworkId = -1;
        // ---------- Original Method ----------
        //this.mBaseStationId = -1;
        //this.mBaseStationLatitude = INVALID_LAT_LONG;
        //this.mBaseStationLongitude = INVALID_LAT_LONG;
        //this.mSystemId = -1;
        //this.mNetworkId = -1;
    }

    
        @DSModeled(DSC.SAFE)
@DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-17 10:23:35.240 -0400", hash_original_method = "61B794D65EE283C3FD04A14E94D0946D", hash_generated_method = "95DF98EF65A56ED2B9C5F0DB04FA3610")
    public void setCellLocationData(int baseStationId, int baseStationLatitude,
         int baseStationLongitude) {
        this.mBaseStationId = baseStationId;
        this.mBaseStationLatitude = baseStationLatitude;
        this.mBaseStationLongitude = baseStationLongitude;
        // ---------- Original Method ----------
        //this.mBaseStationId = baseStationId;
        //this.mBaseStationLatitude = baseStationLatitude;
        //this.mBaseStationLongitude = baseStationLongitude;
    }

    
        @DSModeled(DSC.SAFE)
@DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-17 10:23:35.242 -0400", hash_original_method = "4013196C0844C1883550E95EB904B1DA", hash_generated_method = "8A3DA43B0D301E0F9071C09FBAB3053B")
    public void setCellLocationData(int baseStationId, int baseStationLatitude,
         int baseStationLongitude, int systemId, int networkId) {
        this.mBaseStationId = baseStationId;
        this.mBaseStationLatitude = baseStationLatitude;
        this.mBaseStationLongitude = baseStationLongitude;
        this.mSystemId = systemId;
        this.mNetworkId = networkId;
        // ---------- Original Method ----------
        //this.mBaseStationId = baseStationId;
        //this.mBaseStationLatitude = baseStationLatitude;
        //this.mBaseStationLongitude = baseStationLongitude;
        //this.mSystemId = systemId;
        //this.mNetworkId = networkId;
    }

    
        @DSModeled(DSC.SAFE)
@DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-17 10:23:35.243 -0400", hash_original_method = "E85418559CBFBFDF0470CD6A904DEAD1", hash_generated_method = "B8B63BC54B7ADD61B1F01236C595FACF")
    @Override
    public int hashCode() {
        int var7B5336FB7E61EDE4E56D546B92DF3A34_268452837 = (this.mBaseStationId ^ this.mBaseStationLatitude ^ this.mBaseStationLongitude
                ^ this.mSystemId ^ this.mNetworkId);
                int varFA7153F7ED1CB6C0FCF2FFB2FAC21748_730000925 = getTaintInt();
        return varFA7153F7ED1CB6C0FCF2FFB2FAC21748_730000925;
        // ---------- Original Method ----------
        //return this.mBaseStationId ^ this.mBaseStationLatitude ^ this.mBaseStationLongitude
                //^ this.mSystemId ^ this.mNetworkId;
    }

    
    @DSModeled(DSC.SAFE)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-17 10:23:35.244 -0400", hash_original_method = "38D738FF275D66A3A0FE767FC9AC4FB9", hash_generated_method = "BE79CD797BBB3707697564FA536CDC21")
    @Override
    public boolean equals(Object o) {
        addTaint(o.getTaint());
        CdmaCellLocation s;
        try 
        {
            s = (CdmaCellLocation)o;
        } //End block
        catch (ClassCastException ex)
        {
            boolean var68934A3E9455FA72420237EB05902327_612772200 = (false);
                        boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_2134132659 = getTaintBoolean();
            return var84E2C64F38F78BA3EA5C905AB5A2DA27_2134132659;
        } //End block
        if(o == null)        
        {
            boolean var68934A3E9455FA72420237EB05902327_1096726426 = (false);
                        boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_63618037 = getTaintBoolean();
            return var84E2C64F38F78BA3EA5C905AB5A2DA27_63618037;
        } //End block
        boolean varA7F8E6B062F01F0CC05C597986949F61_2092458049 = ((equalsHandlesNulls(this.mBaseStationId, s.mBaseStationId) &&
                equalsHandlesNulls(this.mBaseStationLatitude, s.mBaseStationLatitude) &&
                equalsHandlesNulls(this.mBaseStationLongitude, s.mBaseStationLongitude) &&
                equalsHandlesNulls(this.mSystemId, s.mSystemId) &&
                equalsHandlesNulls(this.mNetworkId, s.mNetworkId)
        ));
                boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_1244046527 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_1244046527;
        // ---------- Original Method ----------
        //CdmaCellLocation s;
        //try {
            //s = (CdmaCellLocation)o;
        //} catch (ClassCastException ex) {
            //return false;
        //}
        //if (o == null) {
            //return false;
        //}
        //return (equalsHandlesNulls(this.mBaseStationId, s.mBaseStationId) &&
                //equalsHandlesNulls(this.mBaseStationLatitude, s.mBaseStationLatitude) &&
                //equalsHandlesNulls(this.mBaseStationLongitude, s.mBaseStationLongitude) &&
                //equalsHandlesNulls(this.mSystemId, s.mSystemId) &&
                //equalsHandlesNulls(this.mNetworkId, s.mNetworkId)
        //);
    }

    
    @DSModeled(DSC.SAFE)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-17 10:23:35.244 -0400", hash_original_method = "3AD4832D3A3F9EB2D9CB5CAE1051FD90", hash_generated_method = "FA25BDEC7ACE64D5ACD6716BD1AC74C3")
    @Override
    public String toString() {
String varD00AE8B4DB8250B02A118CD67CC66F17_347902140 =         "[" + this.mBaseStationId + ","
                   + this.mBaseStationLatitude + ","
                   + this.mBaseStationLongitude + ","
                   + this.mSystemId + ","
                   + this.mNetworkId + "]";
        varD00AE8B4DB8250B02A118CD67CC66F17_347902140.addTaint(taint);
        return varD00AE8B4DB8250B02A118CD67CC66F17_347902140;
        // ---------- Original Method ----------
        //return "[" + this.mBaseStationId + ","
                   //+ this.mBaseStationLatitude + ","
                   //+ this.mBaseStationLongitude + ","
                   //+ this.mSystemId + ","
                   //+ this.mNetworkId + "]";
    }

    
    @DSModeled(DSC.BAN)
    private static boolean equalsHandlesNulls(Object a, Object b) {
        return (a == null) ? (b == null) : a.equals (b);
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-17 10:23:35.244 -0400", hash_original_method = "A94D1CCD0A9181704E5BCB2385E1DEF3", hash_generated_method = "CAE0A0B8424A69B718E7AD066B6471D8")
    public void fillInNotifierBundle(Bundle bundleToFill) {
        addTaint(bundleToFill.getTaint());
        bundleToFill.putInt("baseStationId", this.mBaseStationId);
        bundleToFill.putInt("baseStationLatitude", this.mBaseStationLatitude);
        bundleToFill.putInt("baseStationLongitude", this.mBaseStationLongitude);
        bundleToFill.putInt("systemId", this.mSystemId);
        bundleToFill.putInt("networkId", this.mNetworkId);
        // ---------- Original Method ----------
        //bundleToFill.putInt("baseStationId", this.mBaseStationId);
        //bundleToFill.putInt("baseStationLatitude", this.mBaseStationLatitude);
        //bundleToFill.putInt("baseStationLongitude", this.mBaseStationLongitude);
        //bundleToFill.putInt("systemId", this.mSystemId);
        //bundleToFill.putInt("networkId", this.mNetworkId);
    }

    
        @DSModeled(DSC.BAN)
@DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-17 10:23:35.244 -0400", hash_original_method = "8DF1697B3E0EEA68CA131C0067500EBA", hash_generated_method = "ED816F5D87EAD7EAFE70DD09C32C1AD9")
    public boolean isEmpty() {
        boolean var27982435A14BB8D93E80836A7CB07524_1400481456 = ((this.mBaseStationId == -1 &&
                this.mBaseStationLatitude == INVALID_LAT_LONG &&
                this.mBaseStationLongitude == INVALID_LAT_LONG &&
                this.mSystemId == -1 &&
                this.mNetworkId == -1));
                boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_2025966365 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_2025966365;
        // ---------- Original Method ----------
        //return (this.mBaseStationId == -1 &&
                //this.mBaseStationLatitude == INVALID_LAT_LONG &&
                //this.mBaseStationLongitude == INVALID_LAT_LONG &&
                //this.mSystemId == -1 &&
                //this.mNetworkId == -1);
    }

    
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-17 10:23:35.244 -0400", hash_original_field = "3F7F839DCCF54CFE34E5B7E72480D008", hash_generated_field = "28DC8731CB240B39E76829C4149A3B3B")

    public final static int INVALID_LAT_LONG = Integer.MAX_VALUE;
}

