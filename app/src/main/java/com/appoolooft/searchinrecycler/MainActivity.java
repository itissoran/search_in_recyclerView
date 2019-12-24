package com.appoolooft.searchinrecycler;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {


    List<ModelRecycler> listItems;
    RecyclerViewAdapter mAdapter;
    EditText editTextSearch;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//todo ==> how to search in recyclerView by this codes

        listItems = new ArrayList<>();

        listItems.add(new ModelRecycler("خەون","sss"));
        listItems.add(new ModelRecycler("cnn sport","sss"));
        listItems.add(new ModelRecycler("nrt sport","sss"));
        listItems.add(new ModelRecycler("rudaw sport","sss"));
        listItems.add(new ModelRecycler("sss sport","sss"));
        listItems.add(new ModelRecycler("wwww sport","sss"));
        listItems.add(new ModelRecycler("qqq sport","sss"));
        listItems.add(new ModelRecycler("zzz sport","sss"));
        listItems.add(new ModelRecycler("vvv sport","sss"));
        listItems.add(new ModelRecycler("xxx sport","sss"));
        listItems.add(new ModelRecycler("bbb sport","sss"));
        listItems.add(new ModelRecycler("nnn sport","sss"));
        listItems.add(new ModelRecycler("BBC sport","sss"));
        listItems.add(new ModelRecycler("BBC sport","sss"));
        listItems.add(new ModelRecycler("BBC sport","sss"));
        listItems.add(new ModelRecycler("BBC sport","sss"));
        listItems.add(new ModelRecycler("BBC sport","sss"));

        editTextSearch=findViewById(R.id.editText_search);

        editTextSearch.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                filter(s.toString());
            }
        });
       RecyclerView myrv = findViewById(R.id.recycler_view_main);
        mAdapter = new RecyclerViewAdapter(this, listItems);
        myrv.setLayoutManager(new GridLayoutManager(this, 1));
        myrv.setAdapter(mAdapter);


    }
    private void filter(String text) {
        ArrayList<ModelRecycler> filteredList = new ArrayList<>();

        for (ModelRecycler item : listItems) {
            if (item.getTitle().toLowerCase().contains(text.toLowerCase())) {
                filteredList.add(item);
            }
        }

        mAdapter.filterList(filteredList);
    }

}
