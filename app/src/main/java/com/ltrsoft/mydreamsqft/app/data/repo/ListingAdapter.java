//package com.ltrsoft.mydreamsqft.app.data.repo;
//
//import android.content.Context;
//import android.view.LayoutInflater;
//import android.view.View;
//import android.view.ViewGroup;
//import android.widget.Button;
//import android.widget.TextView;
//
//import androidx.annotation.NonNull;
//import androidx.fragment.app.FragmentActivity;
//import androidx.recyclerview.widget.RecyclerView;
//
//import com.ltr.sqfeet.R;
//import com.ltr.sqfeet.interfaces.OnListClickListener;
//import com.ltr.sqfeet.pojo.MyEnquiryResponse;
//import com.ltr.sqfeet.pojo.MyListingResponse;
//
//import java.util.List;
//
//import butterknife.BindView;
//
//public class ListingAdapter extends RecyclerView.Adapter<ListingAdapter.MyViewHolder> {
//
//
//    private final Context context;
//    private final List<MyListingResponse.Datum> myListing;
//    private final OnListClickListener listener;
//
//
//    public ListingAdapter(Context context, List<MyListingResponse.Datum> myListing, OnListClickListener listener) {
//        this.context = context;
//        this.myListing = myListing;
//        this.listener = listener;
//    }
//
//
//    @NonNull
//    @Override
//    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
//        View itemView = LayoutInflater.from(parent.getContext())
//                .inflate(R.layout.item_list_listing, parent, false);
//
//        return new MyViewHolder(itemView);
//    }
//
//    @Override
//    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
//        MyListingResponse.Datum listItem = myListing.get(position);
//        holder.tvEnquiryType.setText(listItem.getPropertyType() + " - " + listItem.getPropertyFor());
//        if (listItem.getPropertyType().trim().equalsIgnoreCase("Land")) {
//            holder.tvPropertyType.setText(": Land");
//        } else {
//            holder.tvPropertyType.setText(": " + listItem.getWhatTo() + " (" + listItem.getType() + ")");
//        }
//        holder.tvPrice.setText(": " + listItem.getMinPrice() + " - " + listItem.getMaxPrice() + "(INR)");
//        holder.tvDate.setText(": " + listItem.getDate());
//        holder.tvAddress.setText(": " + listItem.getAddress());
//        holder.tvCity.setText(": " + listItem.getCity());
//        holder.btnDelete.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                listener.onClick(position);
//            }
//        });
//    }
//
//    @Override
//    public int getItemCount() {
//        return myListing.size();
//    }
//
//    public class MyViewHolder extends RecyclerView.ViewHolder {
//        @BindView(R.id.tvEnquiryType)
//        TextView tvEnquiryType;
//        @BindView(R.id.tvPropertyType)
//        TextView tvPropertyType;
//        @BindView(R.id.tvPrice)
//        TextView tvPrice;
//        @BindView(R.id.tvDate)
//        TextView tvDate;
//        @BindView(R.id.tvAddress)
//        TextView tvAddress;
//        @BindView(R.id.tvCity)
//        TextView tvCity;
//        @BindView(R.id.btnDelete)
//        Button btnDelete;
//
//        public MyViewHolder(@NonNull View itemView) {
//            super(itemView);
//            tvEnquiryType = itemView.findViewById(R.id.tvEnquiryType);
//            tvDate = itemView.findViewById(R.id.tvDate);
//            tvPropertyType = itemView.findViewById(R.id.tvPropertyType);
//            tvPrice = itemView.findViewById(R.id.tvPrice);
//            tvAddress = itemView.findViewById(R.id.tvAddress);
//            tvCity = itemView.findViewById(R.id.tvCity);
//            btnDelete = itemView.findViewById(R.id.btnDelete);
//
//        }
//    }
//}
