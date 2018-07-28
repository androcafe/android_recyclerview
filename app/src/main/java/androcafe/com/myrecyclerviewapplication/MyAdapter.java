package androcafe.com.myrecyclerviewapplication;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyClass>{
    Context context;

    ArrayList<Item> arrayList;

    LayoutInflater inflater;


    public MyAdapter(Context context, ArrayList<Item> arrayList) {
        this.context=context;
        this.arrayList=arrayList;
    }

    @NonNull
    @Override
    public MyClass onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        inflater=LayoutInflater.from(context);
        View view=inflater.inflate(R.layout.layout_recycler_view,null);
        return new MyClass(view);
    }


    @Override
    public void onBindViewHolder(@NonNull MyClass holder, int position) {
       holder.textViewQuotes.setText(arrayList.get(position).getQuotes());
       holder.textViewWriter.setText("-"+arrayList.get(position).getWriters());
       holder.linearLayout.setBackgroundResource(arrayList.get(position).getImage());
    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    class MyClass extends RecyclerView.ViewHolder
    {
        TextView textViewQuotes;
        TextView textViewWriter;

        LinearLayout linearLayout;

        public MyClass(View itemView) {
            super(itemView);
            textViewQuotes=itemView.findViewById(R.id.textView_quotes);
            textViewWriter=itemView.findViewById(R.id.textView_writers);

            linearLayout=itemView.findViewById(R.id.linearLayout);
        }
    }
}
