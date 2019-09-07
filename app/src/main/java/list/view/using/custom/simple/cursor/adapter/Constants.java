package list.view.using.custom.simple.cursor.adapter;

public interface Constants {

    //************** Database Name ********************
    String DATABASE_NAME = "database_name.db";

    //************** Database Version Name ********************
    int DATABASE_VERSION = 1;

    //************** Table Name ********************
    String TABLE_NUMBER_FIRST_NAME  = "first_table";

    //**************SQL To Drop Table********************
    String DROP_TABLE_1 = "DROP TABLE IF EXISTS " + TABLE_NUMBER_FIRST_NAME;

    //************** First Table Field Name ********************
    String COLUMN_1     = "ID";
    String COLUMN_2     = "FIRST_NAME";
    String COLUMN_3     = "LAST_NAME";
    String COLUMN_4     = "BRANCH";
    String COLUMN_5     = "ROLL_NUMBER";
    String COLUMN_6     = "GRADE";
    String COLUMN_7     = "CONTACT_NUMBER";

    String[] COLUMNS = {COLUMN_1,COLUMN_2,COLUMN_3,COLUMN_4,COLUMN_5,COLUMN_6,COLUMN_7};

    //************** Create Table Query ********************
    String CREATE_TABLE_1 = "CREATE TABLE " + TABLE_NUMBER_FIRST_NAME + " ("+
            COLUMN_1+" INTEGER PRIMARY KEY AUTOINCREMENT, "+
            COLUMN_2+" TEXT, "+
            COLUMN_3+" TEXT, "+
            COLUMN_4+" TEXT, "+
            COLUMN_5+" TEXT, "+
            COLUMN_6+" TEXT, "+
            COLUMN_7+" TEXT "+
            ")";
}
