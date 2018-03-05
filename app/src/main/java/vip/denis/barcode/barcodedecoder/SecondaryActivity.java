package vip.denis.barcode.barcodedecoder;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

import vip.denis.barcode.barcodedecoder.Extentions.ActivityExtention;

public class SecondaryActivity extends AppCompatActivity {

    private ListView mListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secondary);

        mListView = (ListView) findViewById(R.id.recipe_list_view);

        final ArrayList<String> recipeList = new ArrayList<>(100);

        String[] listItems = new String[100];

        for(int i = 0; i < 100; i++){
            listItems[i] = "item #" + i;
        }

        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, listItems);
        mListView.setAdapter(adapter);

        ActivityExtention.updateListViewHeight(mListView);
    }

}
