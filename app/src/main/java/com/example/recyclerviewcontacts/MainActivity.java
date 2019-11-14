package com.example.recyclerviewcontacts;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.LinearLayout;

import com.example.recyclerviewcontacts.model.Contact;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    List<Contact> contacts = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.contactsList);
        getData();

        contactsAdapter adapter = new contactsAdapter(contacts, this); // add this context
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);
        recyclerView.addItemDecoration(new DividerItemDecoration(this, LinearLayoutManager.VERTICAL));
        recyclerView.setAdapter(adapter);

    }

    private void getData(){
        contacts.add(new Contact("Deepak Shah", "986585555", R.drawable.deepak));
        contacts.add(new Contact("Sumit Buddhacharya","9856558888", R.drawable.sumit));
        contacts.add(new Contact("Sunil Lama","9856551111", R.drawable.sunil));
        contacts.add(new Contact("Deepak Shah", "986585555", R.drawable.deepak));
        contacts.add(new Contact("Sumit Buddhacharya","9856558888", R.drawable.sumit));
        contacts.add(new Contact("Suni Lama","9856551111", R.drawable.sunil));
        contacts.add(new Contact("Deepak Shah", "986585555", R.drawable.deepak));
        contacts.add(new Contact("Sumit Buddhacharya","9856558888", R.drawable.sumit));
        contacts.add(new Contact("Suni Lama","9856551111", R.drawable.sunil));
        contacts.add(new Contact("Deepak Shah", "986585555", R.drawable.deepak));
        contacts.add(new Contact("Sumit Buddhacharya","9856558888", R.drawable.sumit));

    }
}
