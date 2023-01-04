package com.example.fragmentdatatransfer.ui.main;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.fragmentdatatransfer.R;


public class SecondFregment extends Fragment {
        PageViewModel pageViewModel;
        public static SecondFregment secondFregment(){
            return new SecondFregment();
        }

        @Override
    public void onCreate(@Nullable Bundle savedInstaceState){
            super.onCreate(savedInstaceState);
            pageViewModel=new ViewModelProvider(requireActivity()).get(PageViewModel.class);
        }
        @Nullable
        @Override

    public View onCreateView(@NonNull LayoutInflater inflater, @NonNull ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_second, container, false);
    }
    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState){
            super.onViewCreated(view,savedInstanceState);
            TextView textView_UserName=view.findViewById(R.id.textView_Userİnformation);
            pageViewModel.getUserName().observe(requireActivity(), new Observer<String>(){
                @Override
                public void onChanged(String s){
                    if(pageViewModel.getName().toString().equals(s)){
                        pageViewModel.getUserPassword().observe(requireActivity(), new Observer<String>() {
                            @Override
                            public void onChanged(String t) {
                                if (pageViewModel.getPassword().toString().equals(t)){
                                    textView_UserName.setText(s);
                                }else{
                                    textView_UserName.setText("Kullanıcı Bilgileri");
                                }

                            }
                        });
                    }
                    else{
                        textView_UserName.setText("Kullanıcı Bilgileri");
                    }
                }
            });
    }
}