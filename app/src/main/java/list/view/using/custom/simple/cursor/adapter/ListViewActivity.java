package list.view.using.custom.simple.cursor.adapter;

import android.content.Context;
import android.database.Cursor;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

public class ListViewActivity extends AppCompatActivity {

    private Context context = ListViewActivity.this;
    private SQLiteDatabaseHelper sqLiteDatabaseHelper;
    private ListView listView;
    private String firstNameString,lastNameString,branchString,rollNumberString,gradeString,contactNumberString;
    private CustomSimpleCursorAdapter customSimpleCursorAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);
        initView();
        insertDataInTable();

        Cursor cursor = sqLiteDatabaseHelper.getCursor();
        String from [] = new String[]{Constants.COLUMN_3,Constants.COLUMN_5};
        int to [] = new int[] {R.id.name_text_view,R.id.roll_number_text_view};
        customSimpleCursorAdapter = new CustomSimpleCursorAdapter(context, R.layout.list_item, cursor, from, to, 0);
        listView.setAdapter(customSimpleCursorAdapter);
    }

    private void initView()
    {
        sqLiteDatabaseHelper = new SQLiteDatabaseHelper(getApplicationContext());
        listView=findViewById(R.id.list_view);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> arg0, View arg1, int position, long arg3) {
                Toast toast = Toast.makeText(getApplicationContext(), ""+position, Toast.LENGTH_SHORT);
                toast.setGravity(Gravity.BOTTOM|Gravity.CENTER_HORIZONTAL, 0, 0);
                toast.show();
            }
        });
    }

    private void insertDataInTable()
    {
        sqLiteDatabaseHelper.formatTableDetail();
        for (int i = 0; i < 5; i++)
        {
            firstNameString     = "Rohit ";
            lastNameString      = "Yadav_"+i;
            branchString        = "Computer Science_"+i;
            rollNumberString    = "0862CS14108"+i;
            gradeString         = "A"+i;
            contactNumberString = "789868030"+i;
            CollageStudentDetailModel collageStudentModel = new 	CollageStudentDetailModel(firstNameString,lastNameString,branchString,rollNumberString,gradeString,contactNumberString);
            sqLiteDatabaseHelper.insertOperation(collageStudentModel);
        }
    }
}
