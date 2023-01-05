package com.example.dz33month;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;


public class FirstFragment extends Fragment {

    private EditText ed_password;
    private Button button;
    private final String admin = "admin";

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_first, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        ed_password = view.findViewById(R.id.ed_password);
        button = view.findViewById(R.id.button);

        click();
    }

    private void click() {
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String password = ed_password.getText().toString().trim();
                if (!password.equals(admin)) {
                    ed_password.setError("Неправильный пароль");
                } else {
                    getParentFragmentManager().beginTransaction()
                            .replace(R.id.fragment_container, new SecondFragment())
                            .addToBackStack(FirstFragment.class.getName())
                            .commit();
                }
            }

        });
    }
}