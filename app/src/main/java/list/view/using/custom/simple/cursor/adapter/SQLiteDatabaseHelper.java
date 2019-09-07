package list.view.using.custom.simple.cursor.adapter;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

public class SQLiteDatabaseHelper extends SQLiteOpenHelper {

    //************** Database Created ********************
    public SQLiteDatabaseHelper(Context context)
    {
        super(context,Constants.DATABASE_NAME,null,Constants.DATABASE_VERSION);
        Log.e("DATABASE OPERATION", "Database created / opened.....");
    }

    //************** Create Tables ********************
    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase)
    {
        try {
            sqLiteDatabase.execSQL(Constants.CREATE_TABLE_1);
            Log.e("DATABASE OPERATION", "Table create..." +Constants.CREATE_TABLE_1);
        } catch (Exception e) {
            Log.e("onCreate Error", ""+e);
        }
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int oldVersion, int newVersion) {
        try {
            sqLiteDatabase.execSQL(Constants.DROP_TABLE_1);
            onCreate(sqLiteDatabase);
        }catch (Exception e) {
            Log.e("onUpgrade Error", ""+e);
        }
    }

    //************** Insert Values To The Table ********************
    public void insertOperation(CollageStudentDetailModel modelObject)
    {
        //get reference to writable DB
        SQLiteDatabase sqLiteDatabase=this.getWritableDatabase();

        //insert the new row
        sqLiteDatabase.execSQL("INSERT INTO " + Constants.TABLE_NUMBER_FIRST_NAME + "("
                +Constants.COLUMN_2+","
                +Constants.COLUMN_3+","
                +Constants.COLUMN_4+","
                +Constants.COLUMN_5+","
                +Constants.COLUMN_6+","
                +Constants.COLUMN_7+") VALUES('"
                +modelObject.getFirstName()+"','"
                +modelObject.getLastName()+"','"
                +modelObject.getBranchName()+"','"
                +modelObject.getRollNumber()+"','"
                +modelObject.getGrade()+"','"
                +modelObject.getContactNumber()+"')");

        //closing database connection
        sqLiteDatabase.close();
    }

    public  Cursor getCursor()
    {
        SQLiteDatabase sqLiteDatabase=this.getReadableDatabase();
        return sqLiteDatabase.query(Constants.TABLE_NUMBER_FIRST_NAME, new String[] { "ID AS _id, *" },null, null, null, null, null);
    }

    //************** Empty table ********************
    public void formatTableDetail()
    {
        SQLiteDatabase sqLiteDatabase = this.getWritableDatabase();
        sqLiteDatabase.execSQL("delete from "+Constants.TABLE_NUMBER_FIRST_NAME);
        //closing database connection
        sqLiteDatabase.close();
    }
}
