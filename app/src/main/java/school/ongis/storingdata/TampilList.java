package school.ongis.storingdata;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.PriorityQueue;
/**
 * Created by khomaeni on 02/06/2016.
 */
public class TampilList extends Activity {

    private ArrayList<String> listPerson=new ArrayList<>();

    private ListView listView;
    private NamaAdapter namaAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_view);
        final DatabaseHelper databaseHelper=new DatabaseHelper(this);
        ArrayList<Person> arrayList=databaseHelper.getAll();
        listView=(ListView)findViewById(R.id.list_view);

        if(!arrayList.isEmpty()){
            int length=arrayList.size();

            for (int i=0;i<length;i++) {
                Person person = arrayList.get(i);
                listPerson.add(person.getName());
            }
        }

        namaAdapter=new NamaAdapter(this, android.R.layout.simple_list_item_1,listPerson);
        listView.setAdapter(namaAdapter);
    }
}
