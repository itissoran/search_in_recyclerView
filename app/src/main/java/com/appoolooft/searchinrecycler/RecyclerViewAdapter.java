package com.appoolooft.searchinrecycler;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

public class RecyclerViewAdapter extends  RecyclerView.Adapter<RecyclerViewAdapter.MyViewHolder>  {

    private Context mContext;
    private List<ModelRecycler> lstItems;

    public RecyclerViewAdapter(Context mContext, List<ModelRecycler> lstItems) {
        this.mContext = mContext;
        this.lstItems = lstItems;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view;
        LayoutInflater mInflater = LayoutInflater.from(mContext);
        view = mInflater.inflate(R.layout.recycler_model, parent, false);

        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, final int position) {

        //in main activity displays
        holder.title.setText(lstItems.get(position).getTitle());



        holder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(mContext, "Clicked", Toast.LENGTH_SHORT).show();
            }
        });


    }

    @Override
    public int getItemCount() {
        return lstItems.size();
    }


    public void filterList(ArrayList<ModelRecycler> filteredList) {
        lstItems = filteredList;
        notifyDataSetChanged();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder {

        TextView title;
        CardView cardView;

        public MyViewHolder(View itemView) {
            super(itemView);

            title = itemView.findViewById(R.id.recycler_view_text_title);
            cardView = itemView.findViewById(R.id.recycler_model_card_view);


        }
    }
}
