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
//import androidx.recyclerview.widget.RecyclerView;
//
//
//import com.ltrsoft.mydreamsqft.R;
//import com.ltrsoft.mydreamsqft.app.data.models.MyEnquiryResponse;
//import com.ltrsoft.mydreamsqft.app.util.Interface.OnListClickListener;
//
//import java.util.List;
//
//import butterknife.BindView;
//
//public class EnquiryAdapter extends RecyclerView.Adapter<EnquiryAdapter.MyViewHolder> {
//
//
//    private final Context context;
//    private final List<MyEnquiryResponse.Datum> listMyEnquiry;
//    private final OnListClickListener listener;
//
//
//    public EnquiryAdapter(Context context, List<MyEnquiryResponse.Datum> listMyEnquiry, OnListClickListener listener) {
//        this.context = context;
//        this.listMyEnquiry = listMyEnquiry;
//        this.listener = listener;
//    }
//
//    @NonNull
//    @Override
//    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
//        View itemView = LayoutInflater.from(parent.getContext())
//                .inflate(R.layout.item_list_enquiry, parent, false);
//
//        return new MyViewHolder(itemView);
//    }
//
//    @Override
//    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
//        MyEnquiryResponse.Datum enquiry = listMyEnquiry.get(position);
//        holder.tvEnquiryType.setText(enquiry.getPropertyType() + " - " + enquiry.getPropertyFor());
//        if (enquiry.getPropertyType().trim().equalsIgnoreCase("Land")) {
//            holder.tvPropertyType.setText(": Land");
//        } else {
//            holder.tvPropertyType.setText(": " + enquiry.getWhatTo() + " (" + enquiry.getType() + ")");
//        }
//        holder.tvPrice.setText(": " + enquiry.getMinPrice() + " - " + enquiry.getMaxPrice() + "(INR)");
//        holder.tvDate.setText(": " + enquiry.getDate());
//        holder.tvAddress.setText(": " + enquiry.getAddress());
//        holder.tvCity.setText(": " + enquiry.getCity());
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
//        return listMyEnquiry.size();
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
