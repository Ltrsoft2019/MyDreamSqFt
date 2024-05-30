//package com.ltrsoft.mydreamsqft.app.data.repo;
//
//import android.content.Context;
//import android.view.LayoutInflater;
//import android.view.View;
//import android.view.ViewGroup;
//import android.widget.TextView;
//
//import androidx.annotation.NonNull;
//import androidx.recyclerview.widget.RecyclerView;
//
//
//import com.ltrsoft.mydreamsqft.R;
//import com.ltrsoft.mydreamsqft.app.data.models.MyListingBuilderResponse;
//
//import java.util.List;
//
//import butterknife.BindView;
//
//public class BuilderListingAdapter extends RecyclerView.Adapter<BuilderListingAdapter.MyViewHolder> {
//
//
//    private final Context context;
//    private final List<MyListingBuilderResponse.Response> myListing;
//
//
//    public BuilderListingAdapter(Context context, List<MyListingBuilderResponse.Response> myListing) {
//        this.context = context;
//        this.myListing = myListing;
//    }
//
//
//    @NonNull
//    @Override
//    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
//        View itemView = LayoutInflater.from(parent.getContext())
//                .inflate(R.layout.item_list_listing_builder, parent, false);
//        return new MyViewHolder(itemView);
//    }
//
//    @Override
//    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
//        MyListingBuilderResponse.Response listItem = myListing.get(position);
//        holder.tvProjectName.setText(listItem.getProjectName());
//        holder.tvPropertyType.setText(": " + listItem.getWhatToSell());
//        if (listItem.getAmenities().trim().length()>0){
//            holder.tvAmenities.setText(": " + listItem.getAmenities());
//        }else {
//            holder.tvAmenities.setText(": N/A");
//        }
//        holder.tvDate.setText(": " + listItem.getPostedDate());
//        holder.tvAddress.setText(": " + listItem.getAddress());
//        holder.tvCity.setText(": " + listItem.getCityName());
//        holder.tvPinCode.setText(": " + listItem.getPincode());
//    }
//
//    @Override
//    public int getItemCount() {
//        return myListing.size();
//    }
//
//    public class MyViewHolder extends RecyclerView.ViewHolder {
////        @BindView(R.id.tvProjectName)
////        TextView tvProjectName;
////        @BindView(R.id.tvPropertyType)
////        TextView tvPropertyType;
////        @BindView(R.id.tvAmenities)
////        TextView tvAmenities;
////        @BindView(R.id.tvDate)
////        TextView tvDate;
////        @BindView(R.id.tvAddress)
////        TextView tvAddress;
////        @BindView(R.id.tvCity)
////        TextView tvCity;
////        @BindView(R.id.tvPinCode)
////        TextView tvPinCode;
//
//        public MyViewHolder(@NonNull View itemView) {
//            super(itemView);
//            tvProjectName = itemView.findViewById(R.id.tvProjectName);
//            tvDate = itemView.findViewById(R.id.tvDate);
//            tvPropertyType = itemView.findViewById(R.id.tvPropertyType);
//            tvAmenities = itemView.findViewById(R.id.tvAmenities);
//            tvAddress = itemView.findViewById(R.id.tvAddress);
//            tvCity = itemView.findViewById(R.id.tvCity);
//            tvPinCode = itemView.findViewById(R.id.tvPinCode);
//        }
//    }
//}
