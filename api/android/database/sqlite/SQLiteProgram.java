package android.database.sqlite;

// Droidsafe Imports
import droidsafe.annotations.*;
import java.util.HashMap;

import android.database.Cursor;
import android.database.DatabaseUtils;





public abstract class SQLiteProgram extends SQLiteClosable {
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-17 10:23:08.876 -0400", hash_original_field = "8C0B67E1F99496AB4CD09433C231BEB3", hash_generated_field = "45ED686A7022C4BC2786DB04CE6EE8DB")

    @Deprecated protected SQLiteDatabase mDatabase;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-17 10:23:08.877 -0400", hash_original_field = "ABF275D728AAD5B5017275F72010DE2D", hash_generated_field = "4999D4179E22F9283AE45DB93648A65D")

    String mSql;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-17 10:23:08.877 -0400", hash_original_field = "83BEE6D182A8A0F703AE0355A9CE0E10", hash_generated_field = "85232168C2FFA32DBC86841F8D803FC7")

    @Deprecated protected int nHandle;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-17 10:23:08.877 -0400", hash_original_field = "4898CE77BC963F16329C91A665085757", hash_generated_field = "1913885E9133C6D2471365A2BE7C68CC")

    SQLiteCompiledSql mCompiledSql;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-17 10:23:08.877 -0400", hash_original_field = "89022B4A7B6E760B21FA35C0F1DCD003", hash_generated_field = "AC169818D70E77676A3C030A1C1550F3")

    @Deprecated protected int nStatement;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-17 10:23:08.877 -0400", hash_original_field = "F17FD8F8DF407F1B4DA85EE2CFCED461", hash_generated_field = "C5DBBCFF0D5F9E2F9756598D8BC58ACC")

    HashMap<Integer, Object> mBindArgs = null;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-17 10:23:08.878 -0400", hash_original_field = "80AC909AAEC71746A068105F25E3B9AE", hash_generated_field = "424B264B2B85E8A83136F411485ACD38")

    int mStatementType;
    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-17 10:23:08.878 -0400", hash_original_method = "7775AC6B878F6A87A2372052B1B0D459", hash_generated_method = "41E778A5BDC0A5D548EA64717016D4CF")
      SQLiteProgram(SQLiteDatabase db, String sql) {
        this(db, sql, null, true);
        addTaint(sql.getTaint());
        addTaint(db.getTaint());
        // ---------- Original Method ----------
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-17 10:23:08.881 -0400", hash_original_method = "DADBFC98E2D0F265D4B5A43330A492E4", hash_generated_method = "FA50D3FC133A83B8E0EEA46C07D9CA2F")
      SQLiteProgram(SQLiteDatabase db, String sql, Object[] bindArgs,
            boolean compileFlag) {
        addTaint(compileFlag);
        addTaint(bindArgs[0].getTaint());
        mSql = sql.trim();
        int n = DatabaseUtils.getSqlStatementType(mSql);
switch(n){
        case DatabaseUtils.STATEMENT_UPDATE:
        mStatementType = n | STATEMENT_CACHEABLE;
        break;
        case DatabaseUtils.STATEMENT_SELECT:
        mStatementType = n | STATEMENT_CACHEABLE | STATEMENT_USE_POOLED_CONN;
        break;
        case DatabaseUtils.STATEMENT_BEGIN:
        case DatabaseUtils.STATEMENT_COMMIT:
        case DatabaseUtils.STATEMENT_ABORT:
        mStatementType = n | STATEMENT_DONT_PREPARE;
        break;
        default:
        mStatementType = n;
}        db.acquireReference();
        db.addSQLiteClosable(this);
        mDatabase = db;
        nHandle = db.mNativeHandle;
        if(bindArgs != null)        
        {
            int size = bindArgs.length;
for(int i = 0;i < size;i++)
            {
                this.addToBindArgs(i + 1, bindArgs[i]);
            } //End block
        } //End block
        if(compileFlag)        
        {
            compileAndbindAllArgs();
        } //End block
        // ---------- Original Method ----------
        // Original Method Too Long, Refer to Original Implementation
    }

    
        @DSModeled(DSC.BAN)
@DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-17 10:23:08.883 -0400", hash_original_method = "EE8899F672BCD12A22959F518D1125AF", hash_generated_method = "0F180997DE6C247BFFF13B002088130B")
    private void compileSql() {
        if((mStatementType & STATEMENT_CACHEABLE) == 0)        
        {
            mCompiledSql = new SQLiteCompiledSql(mDatabase, mSql);
            nStatement = mCompiledSql.nStatement;
            return;
        } //End block
        mCompiledSql = mDatabase.getCompiledStatementForSql(mSql);
        if(mCompiledSql == null)        
        {
            mCompiledSql = new SQLiteCompiledSql(mDatabase, mSql);
            mCompiledSql.acquire();
            mDatabase.addToCompiledQueries(mSql, mCompiledSql);
        } //End block
        else
        {
            if(!mCompiledSql.acquire())            
            {
                int last = mCompiledSql.nStatement;
                mCompiledSql = new SQLiteCompiledSql(mDatabase, mSql);
            } //End block
        } //End block
        nStatement = mCompiledSql.nStatement;
        // ---------- Original Method ----------
        // Original Method Too Long, Refer to Original Implementation
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-17 10:23:08.884 -0400", hash_original_method = "300DFE9F6A4C69242F1C212512462325", hash_generated_method = "1CD0B8729AFD456C5EE63418C49A729F")
    @Override
    protected void onAllReferencesReleased() {
        //DSFIXME:  CODE0009: Possible callback target function detected
        release();
        mDatabase.removeSQLiteClosable(this);
        mDatabase.releaseReference();
        // ---------- Original Method ----------
        //release();
        //mDatabase.removeSQLiteClosable(this);
        //mDatabase.releaseReference();
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-17 10:23:08.885 -0400", hash_original_method = "A968FD9C775F09F9345F28805B1169A5", hash_generated_method = "431B9CF113097FF3B598F21FC4A441C4")
    @Override
    protected void onAllReferencesReleasedFromContainer() {
        //DSFIXME:  CODE0009: Possible callback target function detected
        release();
        mDatabase.releaseReference();
        // ---------- Original Method ----------
        //release();
        //mDatabase.releaseReference();
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-17 10:23:08.886 -0400", hash_original_method = "A1FA2CE0BFABB0D7A31C7494B049120F", hash_generated_method = "5D6868BE11EFE7AC8BFB63471A055E5D")
     void release() {
        if(mCompiledSql == null)        
        {
            return;
        } //End block
        mDatabase.releaseCompiledSqlObj(mSql, mCompiledSql);
        mCompiledSql = null;
        nStatement = 0;
        // ---------- Original Method ----------
        //if (mCompiledSql == null) {
            //return;
        //}
        //mDatabase.releaseCompiledSqlObj(mSql, mCompiledSql);
        //mCompiledSql = null;
        //nStatement = 0;
    }

    
    @DSModeled(DSC.SAFE)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-17 10:23:08.887 -0400", hash_original_method = "E07CAA4B1BF262B61B70604363CAC3E9", hash_generated_method = "D1E011444B6748FEFA4FC60CA10B96E6")
    @Deprecated
    public final int getUniqueId() {
        int var6BB61E3B7BCE0931DA574D19D1D82C88_963789522 = (-1);
                int varFA7153F7ED1CB6C0FCF2FFB2FAC21748_1862824286 = getTaintInt();
        return varFA7153F7ED1CB6C0FCF2FFB2FAC21748_1862824286;
        // ---------- Original Method ----------
        //return -1;
    }

    
        @DSModeled(DSC.SAFE)
@DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-17 10:23:08.888 -0400", hash_original_method = "76820A9DAA0EF4EAA60C4E690E9DF41D", hash_generated_method = "1531F827A5B23C4DCB64992056B01868")
     int getSqlStatementId() {
        synchronized
(this)        {
            int var4918C4CA7D6F695C693ED491EB162A1A_1890221025 = ((mCompiledSql == null) ? 0 : nStatement);
                        int varFA7153F7ED1CB6C0FCF2FFB2FAC21748_525219656 = getTaintInt();
            return varFA7153F7ED1CB6C0FCF2FFB2FAC21748_525219656;
        } //End block
        // ---------- Original Method ----------
        //synchronized(this) {
        //return (mCompiledSql == null) ? 0 : nStatement;
      //}
    }

    
        @DSModeled(DSC.SAFE)
@DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-17 10:23:08.889 -0400", hash_original_method = "D92A66541C65863AB0B524498A872E5D", hash_generated_method = "DFF0157627295F60AC5E60B9DE9452EB")
     String getSqlString() {
String varFA0654C7C9BA8BFE449D55D59921973A_1573957148 =         mSql;
        varFA0654C7C9BA8BFE449D55D59921973A_1573957148.addTaint(taint);
        return varFA0654C7C9BA8BFE449D55D59921973A_1573957148;
        // ---------- Original Method ----------
        //return mSql;
    }

    
        @DSModeled(DSC.SAFE)
@DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-17 10:23:08.890 -0400", hash_original_method = "B49B29A59D94DA04C289B1136BB98967", hash_generated_method = "046053F787B905BEE6F718979435D937")
    @Deprecated
    protected void compile(String sql, boolean forceCompilation) {
        addTaint(forceCompilation);
        addTaint(sql.getTaint());
        // ---------- Original Method ----------
    }

    
    @DSModeled(DSC.BAN)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-17 10:23:08.891 -0400", hash_original_method = "7AFA2099A2DCB432F4822D315BB6A2D0", hash_generated_method = "4A595504354986C6F6252D36EDEFCE7F")
    private void bind(int type, int index, Object value) {
        addTaint(value.getTaint());
        addTaint(index);
        addTaint(type);
        mDatabase.verifyDbIsOpen();
        addToBindArgs(index, (type == Cursor.FIELD_TYPE_NULL) ? null : value);
        if(nStatement > 0)        
        {
            acquireReference();
            try 
            {
switch(type){
                case Cursor.FIELD_TYPE_NULL:
                native_bind_null(index);
                break;
                case Cursor.FIELD_TYPE_BLOB:
                native_bind_blob(index, (byte[]) value);
                break;
                case Cursor.FIELD_TYPE_FLOAT:
                native_bind_double(index, (Double) value);
                break;
                case Cursor.FIELD_TYPE_INTEGER:
                native_bind_long(index, (Long) value);
                break;
                case Cursor.FIELD_TYPE_STRING:
                default:
                native_bind_string(index, (String) value);
                break;
}
            } //End block
            finally 
            {
                releaseReference();
            } //End block
        } //End block
        // ---------- Original Method ----------
        // Original Method Too Long, Refer to Original Implementation
    }

    
    @DSModeled(DSC.SAFE)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-17 10:23:08.892 -0400", hash_original_method = "3480FC3F53F060D0AF87F13A57EE020E", hash_generated_method = "20A150176AA7EBF483AB927EABCB354C")
    public void bindNull(int index) {
        addTaint(index);
        bind(Cursor.FIELD_TYPE_NULL, index, null);
        // ---------- Original Method ----------
        //bind(Cursor.FIELD_TYPE_NULL, index, null);
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-17 10:23:08.893 -0400", hash_original_method = "DDFF1311EF84C79E9F0283B8959C214A", hash_generated_method = "762CC20A78C798CEF29F7CC574604F14")
    public void bindLong(int index, long value) {
        addTaint(value);
        addTaint(index);
        bind(Cursor.FIELD_TYPE_INTEGER, index, value);
        // ---------- Original Method ----------
        //bind(Cursor.FIELD_TYPE_INTEGER, index, value);
    }

    
    @DSModeled(DSC.SAFE)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-17 10:23:08.893 -0400", hash_original_method = "D271F20EDF0F2BB1E84FEE6A8DFAF59F", hash_generated_method = "403F94A995B4C365054BC6B57100EB5D")
    public void bindDouble(int index, double value) {
        addTaint(value);
        addTaint(index);
        bind(Cursor.FIELD_TYPE_FLOAT, index, value);
        // ---------- Original Method ----------
        //bind(Cursor.FIELD_TYPE_FLOAT, index, value);
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-17 10:23:08.894 -0400", hash_original_method = "963A4C4D7269247053E24419DAA13FC1", hash_generated_method = "759F3932A616F4E3320D86FE5AB6128D")
    public void bindString(int index, String value) {
        addTaint(value.getTaint());
        addTaint(index);
        if(value == null)        
        {
            IllegalArgumentException var1B10C3318ED242E38C9DC3019BCD228A_644130445 = new IllegalArgumentException("the bind value at index " + index + " is null");
            var1B10C3318ED242E38C9DC3019BCD228A_644130445.addTaint(taint);
            throw var1B10C3318ED242E38C9DC3019BCD228A_644130445;
        } //End block
        bind(Cursor.FIELD_TYPE_STRING, index, value);
        // ---------- Original Method ----------
        //if (value == null) {
            //throw new IllegalArgumentException("the bind value at index " + index + " is null");
        //}
        //bind(Cursor.FIELD_TYPE_STRING, index, value);
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-17 10:23:08.895 -0400", hash_original_method = "C702C9CEB9955A1F1B2C6A119BC67F74", hash_generated_method = "6F9F1EE71481961AB1B75D3744C7D3B3")
    public void bindBlob(int index, byte[] value) {
        addTaint(value[0]);
        addTaint(index);
        if(value == null)        
        {
            IllegalArgumentException var1B10C3318ED242E38C9DC3019BCD228A_790133784 = new IllegalArgumentException("the bind value at index " + index + " is null");
            var1B10C3318ED242E38C9DC3019BCD228A_790133784.addTaint(taint);
            throw var1B10C3318ED242E38C9DC3019BCD228A_790133784;
        } //End block
        bind(Cursor.FIELD_TYPE_BLOB, index, value);
        // ---------- Original Method ----------
        //if (value == null) {
            //throw new IllegalArgumentException("the bind value at index " + index + " is null");
        //}
        //bind(Cursor.FIELD_TYPE_BLOB, index, value);
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-17 10:23:08.895 -0400", hash_original_method = "A82C4E1E74B388EF1F68336E0B7074B9", hash_generated_method = "8A47B8FA5E4047E2CED91F1786488589")
    public void clearBindings() {
        mBindArgs = null;
        if(this.nStatement == 0)        
        {
            return;
        } //End block
        mDatabase.verifyDbIsOpen();
        acquireReference();
        try 
        {
            native_clear_bindings();
        } //End block
        finally 
        {
            releaseReference();
        } //End block
        // ---------- Original Method ----------
        //mBindArgs = null;
        //if (this.nStatement == 0) {
            //return;
        //}
        //mDatabase.verifyDbIsOpen();
        //acquireReference();
        //try {
            //native_clear_bindings();
        //} finally {
            //releaseReference();
        //}
    }

    
    @DSModeled(DSC.SAFE)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-17 10:23:08.896 -0400", hash_original_method = "D3AE998E3454F9C657DFB347B01A5D33", hash_generated_method = "6EA7E193B383C56E278039CE952A8700")
    public void close() {
        mBindArgs = null;
        if(nHandle == 0 || !mDatabase.isOpen())        
        {
            return;
        } //End block
        releaseReference();
        // ---------- Original Method ----------
        //mBindArgs = null;
        //if (nHandle == 0 || !mDatabase.isOpen()) {
            //return;
        //}
        //releaseReference();
    }

    
    @DSModeled(DSC.BAN)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-17 10:23:08.897 -0400", hash_original_method = "8DD7248015BFD919A162C74D92E1DB42", hash_generated_method = "043DAB4DFBEA2BA9F1995D35F5FCA5BB")
    private void addToBindArgs(int index, Object value) {
        addTaint(value.getTaint());
        addTaint(index);
        if(mBindArgs == null)        
        {
            mBindArgs = new HashMap<Integer, Object>();
        } //End block
        mBindArgs.put(index, value);
        // ---------- Original Method ----------
        //if (mBindArgs == null) {
            //mBindArgs = new HashMap<Integer, Object>();
        //}
        //mBindArgs.put(index, value);
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-17 10:23:08.898 -0400", hash_original_method = "3FC7B6EE26A3C940A3FAD2B270073635", hash_generated_method = "E98AE2A112EF7A3BE2E1A3C087F0CC40")
     void compileAndbindAllArgs() {
        if((mStatementType & STATEMENT_DONT_PREPARE) > 0)        
        {
            if(mBindArgs != null)            
            {
                IllegalArgumentException varBFEA1441ABE667E9505EB481DC35CD36_2085503652 = new IllegalArgumentException("Can't pass bindargs for this sql :" + mSql);
                varBFEA1441ABE667E9505EB481DC35CD36_2085503652.addTaint(taint);
                throw varBFEA1441ABE667E9505EB481DC35CD36_2085503652;
            } //End block
            return;
        } //End block
        if(nStatement == 0)        
        {
            compileSql();
        } //End block
        if(mBindArgs == null)        
        {
            return;
        } //End block
for(int index : mBindArgs.keySet())
        {
            Object value = mBindArgs.get(index);
            if(value == null)            
            {
                native_bind_null(index);
            } //End block
            else
            if(value instanceof Double || value instanceof Float)            
            {
                native_bind_double(index, ((Number) value).doubleValue());
            } //End block
            else
            if(value instanceof Number)            
            {
                native_bind_long(index, ((Number) value).longValue());
            } //End block
            else
            if(value instanceof Boolean)            
            {
                Boolean bool = (Boolean)value;
                native_bind_long(index, (bool) ? 1 : 0);
                if(bool)                
                {
                    native_bind_long(index, 1);
                } //End block
                else
                {
                    native_bind_long(index, 0);
                } //End block
            } //End block
            else
            if(value instanceof byte[])            
            {
                native_bind_blob(index, (byte[]) value);
            } //End block
            else
            {
                native_bind_string(index, value.toString());
            } //End block
        } //End block
        // ---------- Original Method ----------
        // Original Method Too Long, Refer to Original Implementation
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-17 10:23:08.900 -0400", hash_original_method = "7568906165FD370FD5C4296CB4D5FD76", hash_generated_method = "B8D09063FB225E95259D13453AD4A72E")
    public void bindAllArgsAsStrings(String[] bindArgs) {
        addTaint(bindArgs[0].getTaint());
        if(bindArgs == null)        
        {
            return;
        } //End block
        int size = bindArgs.length;
for(int i = 0;i < size;i++)
        {
            bindString(i + 1, bindArgs[i]);
        } //End block
        // ---------- Original Method ----------
        //if (bindArgs == null) {
            //return;
        //}
        //int size = bindArgs.length;
        //for (int i = 0; i < size; i++) {
            //bindString(i + 1, bindArgs[i]);
        //}
    }

    
    @DSModeled(DSC.SAFE)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-17 10:23:08.900 -0400", hash_original_method = "B3D61FB7C94FF71F95332257D7EBBE92", hash_generated_method = "8CD7EC8DFFC384BDEDA0FF75DA7E64C6")
    synchronized final void setNativeHandle(int nHandle) {
        this.nHandle = nHandle;
        // ---------- Original Method ----------
        //this.nHandle = nHandle;
    }

    
    @DSModeled(DSC.SAFE)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-17 10:23:08.900 -0400", hash_original_method = "957AE60D3A9CE570CB89C0AA6C75F6C8", hash_generated_method = "05A7614624EE5DC85A8CB7259F9CAADD")
    @Deprecated
    protected final void native_compile(String sql) {
    }

    
    @DSModeled(DSC.SAFE)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-17 10:23:08.901 -0400", hash_original_method = "B81676966F6941B90240D7A24C9E2FD3", hash_generated_method = "29F79943539902B2992FABA5DEE5CC41")
    @Deprecated
    protected final void native_finalize() {
    }

    
    @DSModeled(DSC.SAFE)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-17 10:23:08.901 -0400", hash_original_method = "AB3FC56412EB6E1517BB8960DA14A39F", hash_generated_method = "02063E5C169A9266082F35EAE3C7C520")
    protected final void native_bind_null(int index) {
    }

    
    @DSModeled(DSC.SAFE)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-17 10:23:08.901 -0400", hash_original_method = "788CE16CEC77E5835CEB80FC75E60641", hash_generated_method = "F543D954A1583266C1CF2C596DC6D8F7")
    protected final void native_bind_long(int index, long value) {
    }

    
    @DSModeled(DSC.SAFE)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-17 10:23:08.901 -0400", hash_original_method = "DDD8FE0B3144B1C9C0B95003A2ADAE8F", hash_generated_method = "BF020D591B59EC88D6E6DE4D00A42DE7")
    protected final void native_bind_double(int index, double value) {
    }

    
    @DSModeled(DSC.SAFE)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-17 10:23:08.902 -0400", hash_original_method = "6D9E58383F5E5E78735F2725B3EB1959", hash_generated_method = "7E1F6811E07620367DA6F46B72C1EC49")
    protected final void native_bind_string(int index, String value) {
    }

    
    @DSModeled(DSC.SAFE)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-17 10:23:08.902 -0400", hash_original_method = "283C3F08E27A848CC26557756DCA3292", hash_generated_method = "40CB1A935F835CA4557C2B3A78725579")
    protected final void native_bind_blob(int index, byte[] value) {
    }

    
    @DSModeled(DSC.SAFE)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-17 10:23:08.903 -0400", hash_original_method = "A7443022DB1A1E9003E4973C3792843C", hash_generated_method = "7E29C74A6A130560C9B26D8118CD2BAA")
    private final void native_clear_bindings() {
    }

    
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-17 10:23:08.903 -0400", hash_original_field = "CA2842CAC53650043FCFF2C4FF30671E", hash_generated_field = "816508A07B46D824F7128BA5AE03ED0D")

    private static final String TAG = "SQLiteProgram";
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-17 10:23:08.903 -0400", hash_original_field = "A32CD36BCAA299B40589381C0FC28A6E", hash_generated_field = "0F075AA00FFEB378FEE9A066ECB987E5")

    static final int STATEMENT_CACHEABLE = 16;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-17 10:23:08.903 -0400", hash_original_field = "FB47074F23821C2976A54DF0B807DE5B", hash_generated_field = "DF8B6D15B44BF0FE7223ACE28B1005DF")

    static final int STATEMENT_DONT_PREPARE = 32;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-17 10:23:08.903 -0400", hash_original_field = "5EA607C38E360BB2E02CFA22D08E10AD", hash_generated_field = "4DA750052F1E88DF1AF103836FAAA56E")

    static final int STATEMENT_USE_POOLED_CONN = 64;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-17 10:23:08.903 -0400", hash_original_field = "E371F27A1CAF1FE8D47600BF5310C83B", hash_generated_field = "E08807DCEDC0067CCFCD6359301CA6D4")

    static final int STATEMENT_TYPE_MASK = 0x0f;
}

