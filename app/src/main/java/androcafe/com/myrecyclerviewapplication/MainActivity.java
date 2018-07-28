package androcafe.com.myrecyclerviewapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;

    Item item;
    ArrayList<Item> arrayList;

    MyAdapter myAdapter;

    int[] images={R.drawable.i1,R.drawable.i2,R.drawable.i3,R.drawable.i4,R.drawable.i5,R.drawable.i6,R.drawable.i7,R.drawable.i8,R.drawable.i9,R.drawable.i10};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView=findViewById(R.id.recyclerView);

        LinearLayoutManager linearLayoutManager=new LinearLayoutManager(this);
        linearLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);

        recyclerView.setLayoutManager(linearLayoutManager);

        arrayList=new ArrayList<>();

        setQuotes();

        myAdapter=new MyAdapter(this,arrayList);
        recyclerView.setAdapter(myAdapter);
    }

    private void setQuotes() {
        String[] quote=getResources().getStringArray(R.array.quotes_array);
        String[] writer=getResources().getStringArray(R.array.writers_array);

        for(int i=0;i<quote.length;i++)
        {
            item=new Item(quote[i],writer[i],images[i]);
            arrayList.add(item);
        }
    }
}
