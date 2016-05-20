package mgit.customelistview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    ListView lv;
    CustomeAdapter customeAdapter;
    public String[] array={"akarsh","harun","kvms","ramesh","teja","pranay"};
    Custome[] myCustomeArray=new Custome[]{new Custome("akarsh",507,"checkboxchecked"),
            new Custome("harun",504,"checkboxunchecked"),
            new Custome("kvms",528,"checkboxchecked"),
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       lv=(ListView)findViewById(R.id.listView);
        customeAdapter=new CustomeAdapter(getApplicationContext(),R.layout.row,myCustomeArray);
        lv.setAdapter(customeAdapter);

    }
}
