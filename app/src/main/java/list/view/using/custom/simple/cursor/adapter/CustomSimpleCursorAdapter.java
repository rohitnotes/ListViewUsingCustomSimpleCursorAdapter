package list.view.using.custom.simple.cursor.adapter;

import android.content.Context;
import android.database.Cursor;
import android.view.View;
import android.view.ViewGroup;
import android.widget.SimpleCursorAdapter;

public class CustomSimpleCursorAdapter extends SimpleCursorAdapter
{
    public CustomSimpleCursorAdapter(Context context, int layout, Cursor c, String[] from, int[] to, int flags)
    {
        super(context, layout, c, from, to, flags);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View view = super.getView(position, convertView, parent);

        if(position % 2 == 0)
        {
            view.setBackgroundResource(R.color.colorFirstRow);
        }
        else
        {
            view.setBackgroundResource(R.color.colorSecondRow);
        }

        return view;
    }
}
