package com.emisiv.phototools.adapters;

import android.support.annotation.NonNull;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.emisiv.phototools.R;

public class HomeAdapter  extends RecyclerView.Adapter <RecyclerView.ViewHolder>{
    private static final int TYPE_HEADER=0;
    private static final int TYPE_AUTO_IMAGE_SORT=1;

    public HomeAdapter(){}

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        switch (viewType){
            case TYPE_HEADER:
                return new HeaderViewHolder(LayoutInflater.from(parent.getContext()).inflate(
                        R.layout.view_logo, parent, false));

            case TYPE_AUTO_IMAGE_SORT:
                return new ImageSortViewHolder(LayoutInflater.from(parent.getContext()).inflate(
                        R.layout.view_card_auto_image_sort,parent, false));
        }

        throw  new RuntimeException("invalid view type");
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder viewHolder, int i) {

    }

    @Override
    public int getItemViewType(int position) {
        return position;
    }

    @Override
    public int getItemCount() {
        return 2;
    }


    class HeaderViewHolder extends RecyclerView.ViewHolder {
        ImageView logoView;
        TextView titleView;

        public HeaderViewHolder(@NonNull View itemView) {
            super(itemView);
            logoView = itemView.findViewById(R.id.logo_image_view);
            titleView = itemView.findViewById(R.id.title_view);
        }
    }

    class ImageSortViewHolder extends RecyclerView.ViewHolder{

        CardView cv;
        TextView titleView, bodyView;

        public ImageSortViewHolder(@NonNull View itemView) {
            super(itemView);
            cv = itemView.findViewById(R.id.card_view);
            titleView = itemView.findViewById(R.id.title_view);
            bodyView = itemView.findViewById(R.id.body_view);

        }
    }
}
