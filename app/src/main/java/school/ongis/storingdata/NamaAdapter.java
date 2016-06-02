package school.ongis.storingdata;

import android.content.Context;
import android.widget.ArrayAdapter;

import java.util.List;
/**
 * Created by khomaeni on 02/06/2016.
 */
public class NamaAdapter extends ArrayAdapter {
    public NamaAdapter(Context context, int resource, List objects) {
        super(context, resource, objects);
    }
}
