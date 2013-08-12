package android.support.v4.widget;

// Droidsafe Imports
import droidsafe.annotations.*;
import android.content.Context;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.DataSetObserver;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.FilterQueryProvider;
import android.widget.Filterable;





public abstract class CursorAdapter extends BaseAdapter implements Filterable, CursorFilter.CursorFilterClient {
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-17 10:23:33.993 -0400", hash_original_field = "3B4F79EB44FC121408BC3C80FFBD1BB3", hash_generated_field = "0CBC614058D2BA6AB3F2707AA19CB55C")

    protected boolean mDataValid;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-17 10:23:33.993 -0400", hash_original_field = "0D93DBF5D05325C47239982B2066443E", hash_generated_field = "CC60514C576103ECED880F96B2127BFB")

    protected boolean mAutoRequery;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-17 10:23:33.994 -0400", hash_original_field = "F54BB255BEA99BFE91A331B490610EDF", hash_generated_field = "B2F25E19BD844FCC3F1C8464C0B5BC23")

    protected Cursor mCursor;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-17 10:23:33.994 -0400", hash_original_field = "51EF5995AD6B82C50AE546C1599EFFFA", hash_generated_field = "B3359F86E29A965BC1436888E98C55A8")

    protected Context mContext;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-17 10:23:33.994 -0400", hash_original_field = "BF335D1644B21D2E183AE8CEBD065849", hash_generated_field = "D171985E89089CA8F80C6B5FBFB3B7FC")

    protected int mRowIDColumn;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-17 10:23:33.994 -0400", hash_original_field = "D05C668BF160CCF90E808AC728390BD6", hash_generated_field = "0B2ED6761CBC919A48EB4B9FE2D4AB13")

    protected ChangeObserver mChangeObserver;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-17 10:23:33.994 -0400", hash_original_field = "1AB0B744C03B78F09E9DEC3C88684ED1", hash_generated_field = "6298A8B1998B846614DE1298AEE64EC1")

    protected DataSetObserver mDataSetObserver;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-17 10:23:33.994 -0400", hash_original_field = "8FDC902C8C8CE5C4E9195BA5E99E5F2F", hash_generated_field = "877855864A02D71926B6F9A3E734D57C")

    protected CursorFilter mCursorFilter;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-17 10:23:33.994 -0400", hash_original_field = "BD5F6DFBCB536410495C51FF99920D88", hash_generated_field = "D73E6E7F3D302B62FF44A580BEDA187E")

    protected FilterQueryProvider mFilterQueryProvider;
    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-17 10:23:33.994 -0400", hash_original_method = "8D1D2C00F3993B5859A91333170D7E0C", hash_generated_method = "10152A9E737B58355C0F5F765053C18D")
    @Deprecated
    public  CursorAdapter(Context context, Cursor c) {
        addTaint(c.getTaint());
        addTaint(context.getTaint());
        init(context, c, FLAG_AUTO_REQUERY);
        // ---------- Original Method ----------
        //init(context, c, FLAG_AUTO_REQUERY);
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-17 10:23:33.994 -0400", hash_original_method = "E3D9EE9ED812FDA16E5801F0DB803037", hash_generated_method = "4657D902F8F2C09C722A8FA02938CAD7")
    public  CursorAdapter(Context context, Cursor c, boolean autoRequery) {
        addTaint(autoRequery);
        addTaint(c.getTaint());
        addTaint(context.getTaint());
        init(context, c, autoRequery ? FLAG_AUTO_REQUERY : FLAG_REGISTER_CONTENT_OBSERVER);
        // ---------- Original Method ----------
        //init(context, c, autoRequery ? FLAG_AUTO_REQUERY : FLAG_REGISTER_CONTENT_OBSERVER);
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-17 10:23:33.994 -0400", hash_original_method = "ED5E23B4BC6F3954BD932E88BE4B619F", hash_generated_method = "1E0ADAAB3C409F0B1814D9DB573871BF")
    public  CursorAdapter(Context context, Cursor c, int flags) {
        addTaint(flags);
        addTaint(c.getTaint());
        addTaint(context.getTaint());
        init(context, c, flags);
        // ---------- Original Method ----------
        //init(context, c, flags);
    }

    
    @DSModeled(DSC.SAFE)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-17 10:23:33.994 -0400", hash_original_method = "8A3F140CB585945159B363BD7170B858", hash_generated_method = "91D137A3DFAABDE5194CC3E221E0B2E7")
    @Deprecated
    protected void init(Context context, Cursor c, boolean autoRequery) {
        addTaint(autoRequery);
        addTaint(c.getTaint());
        addTaint(context.getTaint());
        init(context, c, autoRequery ? FLAG_AUTO_REQUERY : FLAG_REGISTER_CONTENT_OBSERVER);
        // ---------- Original Method ----------
        //init(context, c, autoRequery ? FLAG_AUTO_REQUERY : FLAG_REGISTER_CONTENT_OBSERVER);
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-17 10:23:33.995 -0400", hash_original_method = "E90B8606F5AC4DC9C7FA36F3DBF50072", hash_generated_method = "5278501FC994752A8DD7E208784E7702")
     void init(Context context, Cursor c, int flags) {
        addTaint(flags);
        if((flags & FLAG_AUTO_REQUERY) == FLAG_AUTO_REQUERY)        
        {
            flags |= FLAG_REGISTER_CONTENT_OBSERVER;
            mAutoRequery = true;
        } //End block
        else
        {
            mAutoRequery = false;
        } //End block
        boolean cursorPresent = c != null;
        mCursor = c;
        mDataValid = cursorPresent;
        mContext = context;
        mRowIDColumn = cursorPresent ? c.getColumnIndexOrThrow("_id") : -1;
        if((flags & FLAG_REGISTER_CONTENT_OBSERVER) == FLAG_REGISTER_CONTENT_OBSERVER)        
        {
            mChangeObserver = new ChangeObserver();
            mDataSetObserver = new MyDataSetObserver();
        } //End block
        else
        {
            mChangeObserver = null;
            mDataSetObserver = null;
        } //End block
        if(cursorPresent)        
        {
            if(mChangeObserver != null)            
            c.registerContentObserver(mChangeObserver);
            if(mDataSetObserver != null)            
            c.registerDataSetObserver(mDataSetObserver);
        } //End block
        // ---------- Original Method ----------
        // Original Method Too Long, Refer to Original Implementation
    }

    
        @DSModeled(DSC.SAFE)
@DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-17 10:23:33.995 -0400", hash_original_method = "ED4C67C6B1C11ED6A644F86CCA800916", hash_generated_method = "C64A44BBE82F0AD0F2669BB24888FE7E")
    public Cursor getCursor() {
Cursor var2D697C95C6440211C70889796F0139B0_863853861 =         mCursor;
        var2D697C95C6440211C70889796F0139B0_863853861.addTaint(taint);
        return var2D697C95C6440211C70889796F0139B0_863853861;
        // ---------- Original Method ----------
        //return mCursor;
    }

    
    @DSModeled(DSC.SAFE)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-17 10:23:33.995 -0400", hash_original_method = "F232C8AA0135C20BD5AF7ACB0020E9DD", hash_generated_method = "A5F5D0293E63EF8BC20D8D8BD860B8F2")
    public int getCount() {
        if(mDataValid && mCursor != null)        
        {
            int var75D1A080281180206349E970682A62F2_1470667362 = (mCursor.getCount());
                        int varFA7153F7ED1CB6C0FCF2FFB2FAC21748_950727945 = getTaintInt();
            return varFA7153F7ED1CB6C0FCF2FFB2FAC21748_950727945;
        } //End block
        else
        {
            int varCFCD208495D565EF66E7DFF9F98764DA_1049923567 = (0);
                        int varFA7153F7ED1CB6C0FCF2FFB2FAC21748_1272076333 = getTaintInt();
            return varFA7153F7ED1CB6C0FCF2FFB2FAC21748_1272076333;
        } //End block
        // ---------- Original Method ----------
        //if (mDataValid && mCursor != null) {
            //return mCursor.getCount();
        //} else {
            //return 0;
        //}
    }

    
    @DSModeled(DSC.SAFE)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-17 10:23:33.995 -0400", hash_original_method = "0491DE82927D7739F3937D1F88D16ECE", hash_generated_method = "F6A4A18763003FE6CFBA845D7EC5E12B")
    public Object getItem(int position) {
        addTaint(position);
        if(mDataValid && mCursor != null)        
        {
            mCursor.moveToPosition(position);
Object var2D697C95C6440211C70889796F0139B0_1841671646 =             mCursor;
            var2D697C95C6440211C70889796F0139B0_1841671646.addTaint(taint);
            return var2D697C95C6440211C70889796F0139B0_1841671646;
        } //End block
        else
        {
Object var540C13E9E156B687226421B24F2DF178_1296344857 =             null;
            var540C13E9E156B687226421B24F2DF178_1296344857.addTaint(taint);
            return var540C13E9E156B687226421B24F2DF178_1296344857;
        } //End block
        // ---------- Original Method ----------
        //if (mDataValid && mCursor != null) {
            //mCursor.moveToPosition(position);
            //return mCursor;
        //} else {
            //return null;
        //}
    }

    
    @DSModeled(DSC.SAFE)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-17 10:23:33.996 -0400", hash_original_method = "34FC88027666F3EEA6FC8DBB36C510AF", hash_generated_method = "1F3ABD49E11B5FD7AB72F4F6122E84EA")
    public long getItemId(int position) {
        addTaint(position);
        if(mDataValid && mCursor != null)        
        {
            if(mCursor.moveToPosition(position))            
            {
                long var068B1A7DDE73C85FB98CCFB47CE1319C_1151429986 = (mCursor.getLong(mRowIDColumn));
                                long var0F5264038205EDFB1AC05FBB0E8C5E94_70173227 = getTaintLong();
                return var0F5264038205EDFB1AC05FBB0E8C5E94_70173227;
            } //End block
            else
            {
                long varCFCD208495D565EF66E7DFF9F98764DA_1798390771 = (0);
                                long var0F5264038205EDFB1AC05FBB0E8C5E94_1025843117 = getTaintLong();
                return var0F5264038205EDFB1AC05FBB0E8C5E94_1025843117;
            } //End block
        } //End block
        else
        {
            long varCFCD208495D565EF66E7DFF9F98764DA_1896015047 = (0);
                        long var0F5264038205EDFB1AC05FBB0E8C5E94_628114408 = getTaintLong();
            return var0F5264038205EDFB1AC05FBB0E8C5E94_628114408;
        } //End block
        // ---------- Original Method ----------
        //if (mDataValid && mCursor != null) {
            //if (mCursor.moveToPosition(position)) {
                //return mCursor.getLong(mRowIDColumn);
            //} else {
                //return 0;
            //}
        //} else {
            //return 0;
        //}
    }

    
        @DSModeled(DSC.SAFE)
@DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-17 10:23:33.996 -0400", hash_original_method = "047E07C1992C7400A48E08BF432AD584", hash_generated_method = "EA318EF702AC570820324F4F1CF959B0")
    @Override
    public boolean hasStableIds() {
        boolean varB326B5062B2F0E69046810717534CB09_998609349 = (true);
                boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_643454790 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_643454790;
        // ---------- Original Method ----------
        //return true;
    }

    
    @DSModeled(DSC.SAFE)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-17 10:23:33.996 -0400", hash_original_method = "04641394EE9B89BDCE0805D3C5BEBDA5", hash_generated_method = "FBFA65EE1F9CEFA82400065A4B8D8EC9")
    public View getView(int position, View convertView, ViewGroup parent) {
        addTaint(parent.getTaint());
        addTaint(convertView.getTaint());
        addTaint(position);
        if(!mDataValid)        
        {
            IllegalStateException var7C50531E2FE343EACC10736027468D4C_258219388 = new IllegalStateException("this should only be called when the cursor is valid");
            var7C50531E2FE343EACC10736027468D4C_258219388.addTaint(taint);
            throw var7C50531E2FE343EACC10736027468D4C_258219388;
        } //End block
        if(!mCursor.moveToPosition(position))        
        {
            IllegalStateException var4C1B4D8DB47778983049D6BE9C406323_1457149660 = new IllegalStateException("couldn't move cursor to position " + position);
            var4C1B4D8DB47778983049D6BE9C406323_1457149660.addTaint(taint);
            throw var4C1B4D8DB47778983049D6BE9C406323_1457149660;
        } //End block
        View v;
        if(convertView == null)        
        {
            v = newView(mContext, mCursor, parent);
        } //End block
        else
        {
            v = convertView;
        } //End block
        bindView(v, mContext, mCursor);
View var6DC76BC51820DD65E8396280E884AA78_989933083 =         v;
        var6DC76BC51820DD65E8396280E884AA78_989933083.addTaint(taint);
        return var6DC76BC51820DD65E8396280E884AA78_989933083;
        // ---------- Original Method ----------
        //if (!mDataValid) {
            //throw new IllegalStateException("this should only be called when the cursor is valid");
        //}
        //if (!mCursor.moveToPosition(position)) {
            //throw new IllegalStateException("couldn't move cursor to position " + position);
        //}
        //View v;
        //if (convertView == null) {
            //v = newView(mContext, mCursor, parent);
        //} else {
            //v = convertView;
        //}
        //bindView(v, mContext, mCursor);
        //return v;
    }

    
    @DSModeled(DSC.SAFE)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-17 10:23:33.996 -0400", hash_original_method = "8987F0888A94923BAC3C282546957FFA", hash_generated_method = "E7A318111E506F348D5C561B1D5BFB51")
    @Override
    public View getDropDownView(int position, View convertView, ViewGroup parent) {
        addTaint(parent.getTaint());
        addTaint(convertView.getTaint());
        addTaint(position);
        if(mDataValid)        
        {
            mCursor.moveToPosition(position);
            View v;
            if(convertView == null)            
            {
                v = newDropDownView(mContext, mCursor, parent);
            } //End block
            else
            {
                v = convertView;
            } //End block
            bindView(v, mContext, mCursor);
View var6DC76BC51820DD65E8396280E884AA78_174938290 =             v;
            var6DC76BC51820DD65E8396280E884AA78_174938290.addTaint(taint);
            return var6DC76BC51820DD65E8396280E884AA78_174938290;
        } //End block
        else
        {
View var540C13E9E156B687226421B24F2DF178_703980693 =             null;
            var540C13E9E156B687226421B24F2DF178_703980693.addTaint(taint);
            return var540C13E9E156B687226421B24F2DF178_703980693;
        } //End block
        // ---------- Original Method ----------
        //if (mDataValid) {
            //mCursor.moveToPosition(position);
            //View v;
            //if (convertView == null) {
                //v = newDropDownView(mContext, mCursor, parent);
            //} else {
                //v = convertView;
            //}
            //bindView(v, mContext, mCursor);
            //return v;
        //} else {
            //return null;
        //}
    }

    
    @DSModeled(DSC.SAFE)
    public abstract View newView(Context context, Cursor cursor, ViewGroup parent);

    
    @DSModeled(DSC.SAFE)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-17 10:23:33.996 -0400", hash_original_method = "4EAF37DD2AC2B68CF9F2E847E9D5C2B4", hash_generated_method = "CDEA8767E89FCAA6D3319FAA18F7A729")
    public View newDropDownView(Context context, Cursor cursor, ViewGroup parent) {
        addTaint(parent.getTaint());
        addTaint(cursor.getTaint());
        addTaint(context.getTaint());
View varA7C7FCEE76C2BB6CDF25D7E759116C4C_1984143685 =         newView(context, cursor, parent);
        varA7C7FCEE76C2BB6CDF25D7E759116C4C_1984143685.addTaint(taint);
        return varA7C7FCEE76C2BB6CDF25D7E759116C4C_1984143685;
        // ---------- Original Method ----------
        //return newView(context, cursor, parent);
    }

    
    @DSModeled(DSC.SAFE)
    public abstract void bindView(View view, Context context, Cursor cursor);

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-17 10:23:33.997 -0400", hash_original_method = "A3DB89FF308CDDA8076F4DD4182DC99B", hash_generated_method = "759D769AE9FA5626EBA0A841E27E97CE")
    public void changeCursor(Cursor cursor) {
        addTaint(cursor.getTaint());
        Cursor old = swapCursor(cursor);
        if(old != null)        
        {
            old.close();
        } //End block
        // ---------- Original Method ----------
        //Cursor old = swapCursor(cursor);
        //if (old != null) {
            //old.close();
        //}
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-17 10:23:33.998 -0400", hash_original_method = "3AE932C7E61F472FB82D7B0D8E632CE6", hash_generated_method = "F69BFC0FD2E9EEBACBE56DBF2DF02991")
    public Cursor swapCursor(Cursor newCursor) {
        if(newCursor == mCursor)        
        {
Cursor var540C13E9E156B687226421B24F2DF178_327891176 =             null;
            var540C13E9E156B687226421B24F2DF178_327891176.addTaint(taint);
            return var540C13E9E156B687226421B24F2DF178_327891176;
        } //End block
        Cursor oldCursor = mCursor;
        if(oldCursor != null)        
        {
            if(mChangeObserver != null)            
            oldCursor.unregisterContentObserver(mChangeObserver);
            if(mDataSetObserver != null)            
            oldCursor.unregisterDataSetObserver(mDataSetObserver);
        } //End block
        mCursor = newCursor;
        if(newCursor != null)        
        {
            if(mChangeObserver != null)            
            newCursor.registerContentObserver(mChangeObserver);
            if(mDataSetObserver != null)            
            newCursor.registerDataSetObserver(mDataSetObserver);
            mRowIDColumn = newCursor.getColumnIndexOrThrow("_id");
            mDataValid = true;
            notifyDataSetChanged();
        } //End block
        else
        {
            mRowIDColumn = -1;
            mDataValid = false;
            notifyDataSetInvalidated();
        } //End block
Cursor var8865EC6BBD1C189917D7B270FF26E997_737532670 =         oldCursor;
        var8865EC6BBD1C189917D7B270FF26E997_737532670.addTaint(taint);
        return var8865EC6BBD1C189917D7B270FF26E997_737532670;
        // ---------- Original Method ----------
        // Original Method Too Long, Refer to Original Implementation
    }

    
    @DSModeled(DSC.SAFE)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-17 10:23:33.998 -0400", hash_original_method = "AC3E4A96BAEBA3C91CE9B7B72B03BE17", hash_generated_method = "7FD4E9A7EEA54BBD28E2AAB551467385")
    public CharSequence convertToString(Cursor cursor) {
        addTaint(cursor.getTaint());
CharSequence varD3163D348BE74EFDDB10CF3B2A61ABC0_1815358101 =         cursor == null ? "" : cursor.toString();
        varD3163D348BE74EFDDB10CF3B2A61ABC0_1815358101.addTaint(taint);
        return varD3163D348BE74EFDDB10CF3B2A61ABC0_1815358101;
        // ---------- Original Method ----------
        //return cursor == null ? "" : cursor.toString();
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-17 10:23:33.998 -0400", hash_original_method = "0F9BE7C57911E33C85760ED7E36C9D33", hash_generated_method = "DB5B2D15EB7CBB918476E1756EBC9D29")
    public Cursor runQueryOnBackgroundThread(CharSequence constraint) {
        addTaint(constraint.getTaint());
        if(mFilterQueryProvider != null)        
        {
Cursor varDB8D37740AE64DA47A67C6059DE83D27_238378684 =             mFilterQueryProvider.runQuery(constraint);
            varDB8D37740AE64DA47A67C6059DE83D27_238378684.addTaint(taint);
            return varDB8D37740AE64DA47A67C6059DE83D27_238378684;
        } //End block
Cursor var2D697C95C6440211C70889796F0139B0_247825659 =         mCursor;
        var2D697C95C6440211C70889796F0139B0_247825659.addTaint(taint);
        return var2D697C95C6440211C70889796F0139B0_247825659;
        // ---------- Original Method ----------
        //if (mFilterQueryProvider != null) {
            //return mFilterQueryProvider.runQuery(constraint);
        //}
        //return mCursor;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-17 10:23:33.998 -0400", hash_original_method = "847708A1CBB9CABD379CEB5384747381", hash_generated_method = "8DA402BB5782F4D83381C6F7352D8769")
    public Filter getFilter() {
        if(mCursorFilter == null)        
        {
            mCursorFilter = new CursorFilter(this);
        } //End block
Filter var90C9C830C345364A3B8EB78F9A63072B_443975287 =         mCursorFilter;
        var90C9C830C345364A3B8EB78F9A63072B_443975287.addTaint(taint);
        return var90C9C830C345364A3B8EB78F9A63072B_443975287;
        // ---------- Original Method ----------
        //if (mCursorFilter == null) {
            //mCursorFilter = new CursorFilter(this);
        //}
        //return mCursorFilter;
    }

    
        @DSModeled(DSC.SAFE)
@DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-17 10:23:33.998 -0400", hash_original_method = "67EA54121BE0FFEF70F7156625E7E3CE", hash_generated_method = "9C83B12FB5B11CF76D43669D3DCC79F4")
    public FilterQueryProvider getFilterQueryProvider() {
FilterQueryProvider var9C11BBF4520EA8ACA798B47CEA8E6C0C_587910629 =         mFilterQueryProvider;
        var9C11BBF4520EA8ACA798B47CEA8E6C0C_587910629.addTaint(taint);
        return var9C11BBF4520EA8ACA798B47CEA8E6C0C_587910629;
        // ---------- Original Method ----------
        //return mFilterQueryProvider;
    }

    
        @DSModeled(DSC.SAFE)
@DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-17 10:23:33.998 -0400", hash_original_method = "DB32599181A301EC3439063743E0023E", hash_generated_method = "3AC0EC2BF9C403B489B89218AE938BE8")
    public void setFilterQueryProvider(FilterQueryProvider filterQueryProvider) {
        mFilterQueryProvider = filterQueryProvider;
        // ---------- Original Method ----------
        //mFilterQueryProvider = filterQueryProvider;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-17 10:23:33.998 -0400", hash_original_method = "A04D68B5B58FA27E71C6ECAA728402A5", hash_generated_method = "82B5596CDCFF35BF5807C84DC58B76C2")
    protected void onContentChanged() {
        //DSFIXME:  CODE0009: Possible callback target function detected
        if(mAutoRequery && mCursor != null && !mCursor.isClosed())        
        {
            if(false){ }            mDataValid = mCursor.requery();
        } //End block
        // ---------- Original Method ----------
        //if (mAutoRequery && mCursor != null && !mCursor.isClosed()) {
            //if (false) Log.v("Cursor", "Auto requerying " + mCursor + " due to update");
            //mDataValid = mCursor.requery();
        //}
    }

    
    private class ChangeObserver extends ContentObserver {
        
        @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-17 10:23:33.998 -0400", hash_original_method = "E9F5B54480B866367BA64F4A5A962E11", hash_generated_method = "26A139A9C94CF802391CF18776297177")
        public  ChangeObserver() {
            super(new Handler());
            // ---------- Original Method ----------
        }

        
                @DSModeled(DSC.SAFE)
@DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-17 10:23:33.999 -0400", hash_original_method = "0AAB5F0B0973D030DF154EF2BA0EE06F", hash_generated_method = "6FAB0CE9933BFDAB99A010E36F62FE07")
        @Override
        public boolean deliverSelfNotifications() {
            boolean varB326B5062B2F0E69046810717534CB09_793755337 = (true);
                        boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_1309178494 = getTaintBoolean();
            return var84E2C64F38F78BA3EA5C905AB5A2DA27_1309178494;
            // ---------- Original Method ----------
            //return true;
        }

        
        @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-17 10:23:33.999 -0400", hash_original_method = "E96460F373279AF9AB8806E159ABA424", hash_generated_method = "ED8F5A11A8054BF0A3976D4C48B0275E")
        @Override
        public void onChange(boolean selfChange) {
            //DSFIXME:  CODE0009: Possible callback target function detected
            addTaint(selfChange);
            onContentChanged();
            // ---------- Original Method ----------
            //onContentChanged();
        }

        
    }


    
    private class MyDataSetObserver extends DataSetObserver {
        
        @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-17 10:23:33.999 -0400", hash_original_method = "B8855E81B638DE0F5C9202168EAE6D42", hash_generated_method = "B8855E81B638DE0F5C9202168EAE6D42")
        public MyDataSetObserver ()
        {
            //Synthesized constructor
        }


        @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-17 10:23:33.999 -0400", hash_original_method = "06FCBC692E549C3C9873F9D5CBAEB7B0", hash_generated_method = "03FD84DC8C544DE0887FEB106D75CC8E")
        @Override
        public void onChanged() {
            //DSFIXME:  CODE0009: Possible callback target function detected
            mDataValid = true;
            notifyDataSetChanged();
            // ---------- Original Method ----------
            //mDataValid = true;
            //notifyDataSetChanged();
        }

        
        @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-17 10:23:33.999 -0400", hash_original_method = "EAE7DF88825384424351353A02D60615", hash_generated_method = "A259386E221C67E9FE12B36668278306")
        @Override
        public void onInvalidated() {
            //DSFIXME:  CODE0009: Possible callback target function detected
            mDataValid = false;
            notifyDataSetInvalidated();
            // ---------- Original Method ----------
            //mDataValid = false;
            //notifyDataSetInvalidated();
        }

        
    }


    
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-17 10:23:33.999 -0400", hash_original_field = "2EF3F106DC7E3BA78E6E398F434B8920", hash_generated_field = "D9CAE4B2CBE505B43F3EFB7D2BDDB501")

    @Deprecated
    public static final int FLAG_AUTO_REQUERY = 0x01;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-17 10:23:33.999 -0400", hash_original_field = "BE5963518D8DE05171E5A52BE4F89E2F", hash_generated_field = "C59D2793A8DEA8140E412BF31A6EBB7E")

    public static final int FLAG_REGISTER_CONTENT_OBSERVER = 0x02;
}

