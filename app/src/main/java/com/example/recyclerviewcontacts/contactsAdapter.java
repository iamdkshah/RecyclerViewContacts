package com.example.recyclerviewcontacts;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.recyclerviewcontacts.model.Contact;

import java.util.ArrayList;
import java.util.List;

public class contactsAdapter extends RecyclerView.Adapter<contactsAdapter.contactsHolder> {

    private List<Contact> contactsList = new ArrayList<>();
    private Context context; //decllare a private variable  context

    public contactsAdapter(List<Contact> contactsList, Context context) { // add context
        this.contactsList = contactsList;
        this.context = context; //add
    }

    @NonNull
    @Override
    public contactsHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.contacts_view, parent,false);
        contactsHolder cHolder = new contactsHolder(view);
        return cHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull contactsHolder holder, int position) {
        final Contact contact =contactsList.get(position);
        holder.phone.setText(contact.getMobileNumber());
        holder.name.setText(contact.getName());
        holder.imageIcon.setImageResource(contact.getImg());


        //OnclickListener Toast - first step
        holder.phone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context, contact.getMobileNumber(), Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return contactsList.size();
    }

    public class contactsHolder extends RecyclerView.ViewHolder {
        ImageView imageIcon;
        TextView name,phone;

        public contactsHolder(@NonNull View itemView) {
            super(itemView);

            imageIcon = itemView.findViewById(R.id.imageIcon);
            name = itemView.findViewById(R.id.name);
            phone = itemView.findViewById(R.id.phone);
        }
    }
}
