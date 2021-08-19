package com.nandan.modernlibraryusingfirebase;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link books_by_topic#newInstance} factory method to
 * create an instance of this fragment.
 */
public class books_by_topic extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;
    RecyclerView recyclerView;


    public books_by_topic() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment books_by_topic.
     */
    // TODO: Rename and change types and number of parameters
    public static books_by_topic newInstance(String param1, String param2) {
        books_by_topic fragment = new books_by_topic();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_books_by_topic, container, false);
        recyclerView = view.findViewById(R.id.recview2);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));

        recyclerView.setAdapter(new SemBookListAdapter(dataqueue(),getContext()));
        return  view;
    }

    public ArrayList<Model> dataqueue()
    {
        ArrayList<Model> container = new ArrayList<>();
        Model obj1 = new Model();
        obj1.setTitle("Programming Languages");
        obj1.setDesc("All the books under this topic");
        obj1.setImgname(R.drawable.book138);
        container.add(obj1);


        Model obj2 = new Model();
        obj2.setTitle("Database Management System");
        obj2.setDesc("All the books under this topic");
        obj2.setImgname(R.drawable.sem2);
        container.add(obj2);

        Model obj3 = new Model();
        obj3.setTitle("Algorithms and Data Structures");
        obj3.setDesc("All the books under this topic");
        obj3.setImgname(R.drawable.book138);
        container.add(obj3);

        Model obj4 = new Model();
        obj4.setTitle("Computer Architecture and Organisation");
        obj4.setDesc("All the books under this topic");
        obj4.setImgname(R.drawable.book138);
        container.add(obj4);

        Model obj5 = new Model();
        obj5.setTitle("Discrete Mathematics");
        obj5.setDesc("All the books under this topic");
        obj5.setImgname(R.drawable.book138);
        container.add(obj5);

        Model obj6 = new Model();
        obj6.setTitle("Operating System");
        obj6.setDesc("All the books under this topic");
        obj6.setImgname(R.drawable.book138);
        container.add(obj6);

        Model obj7 = new Model();
        obj7.setTitle("Computer Networks");
        obj7.setDesc("All the books under this topic");
        obj7.setImgname(R.drawable.book138);
        container.add(obj7);

        Model obj8 = new Model();
        obj8.setTitle("System Design");
        obj8.setDesc("All the books under this topic");
        obj8.setImgname(R.drawable.book138);
        container.add(obj8);

        return container;



    }
}