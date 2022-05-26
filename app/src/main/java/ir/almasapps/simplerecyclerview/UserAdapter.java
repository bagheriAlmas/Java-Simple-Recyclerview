package ir.almasapps.simplerecyclerview;
import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

import ir.almasapps.simplerecyclerview.Model.User;

public class UserAdapter extends RecyclerView.Adapter<UserAdapter.Holder> {
    Context context;
    List<User> userList;

    public UserAdapter(Context context, List<User> userList){
        this.context = context;
        this.userList = userList;
    }
    @Override
    public Holder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View listItem= layoutInflater.inflate(R.layout.list_item, parent, false);
        Holder viewHolder = new Holder(listItem);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(Holder holder, @SuppressLint("RecyclerView") int position) {

        holder.txtName.setText(userList.get(position).getName());
        holder.txtPhone.setText(userList.get(position).getPhone());
        holder.imgUser.setImageResource(userList.get(position).getImage());

        holder.layout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(view.getContext(),"click on item: "+userList.get(position).getName(),Toast.LENGTH_LONG).show();
            }
        });
    }


    @Override
    public int getItemCount() {
        return userList.size();
    }

    public class Holder extends RecyclerView.ViewHolder{
        TextView txtName,txtPhone;
        ImageView imgUser;
        CardView layout;

        public Holder(View itemView) {
            super(itemView);
            txtName = itemView.findViewById(R.id.item_txtName);
            txtPhone = itemView.findViewById(R.id.item_txtPhone);
            imgUser = itemView.findViewById(R.id.item_image);
            layout = itemView.findViewById(R.id.item_layout);
        }
    }
}