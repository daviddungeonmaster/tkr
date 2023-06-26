package com.tkr.tkrtpushop.ViewHolder;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.tkr.tkrtpushop.Model.Product1;
import com.tkr.tkrtpushop.R;

import java.util.List;

public class ProductAdapter extends RecyclerView.Adapter<ProductAdapter.Product1ViewHolder> {

    Context context;
    List<Product1> product1s;
    public static final class Product1ViewHolder extends RecyclerView.ViewHolder{
        ImageView productImage;
        TextView productTitle, productPrice;
        public Product1ViewHolder(@NonNull View itemView) {
            super(itemView);
            productImage = itemView.findViewById(R.id.product_image);
            productTitle = itemView.findViewById(R.id.product_name);
            productPrice = itemView.findViewById(R.id.product_price);



        }
    }

    @NonNull
    @Override
    public ProductAdapter.Product1ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View productItems = LayoutInflater.from(context).inflate(R.layout.category_item, parent, false);
        return new ProductAdapter.Product1ViewHolder(productItems);
    }

    @Override
    public void onBindViewHolder(@NonNull ProductAdapter.Product1ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return product1s.size();
    }
}
