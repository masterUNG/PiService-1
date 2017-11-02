package kct.piyawat.piservice.Fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;

import kct.piyawat.piservice.MainActivity;
import kct.piyawat.piservice.R;

/**
 * Created by asus on 31/10/2560.
 */

public class RegisterFragment extends Fragment{

//    Explicit การประกาศตัวแปร
    private String nameString,genderString,userString, passwordString;

//    Create Main Method คือ เมธอดที่ทำหน้าที่ เป็นผู้จัดการ


    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

//        Create Toolbar
        createToolbar();

//        Save Controller
        saveController();

    } // Main Method

    private void saveController() {
        ImageView imageView = getView().findViewById(R.id.imvSave);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

//                initial View
                EditText nameEditText = getView().findViewById(R.id.edtName);
                EditText userEditText = getView().findViewById(R.id.edtUser);
                EditText passwordEditText = getView().findViewById(R.id.edtPassword);

//                Get Value From EditText To String คือการรับค่าจากตัวแปร EditText ไปเป็น String
                nameString = nameEditText.getText().toString().trim();
                userString = userEditText.getText().toString().trim();
                passwordString = passwordEditText.getText().toString().trim();

//                Check Space
                if (nameString.equals("")|| userString.equals("") || passwordString.equals("")) {
                    // Work When Condition is True ===> Have Space


                }
            }// onClick

        });
    }

    private void createToolbar() {
//        Initial View คือการ Inflater View เข้ามาทำงานใน Java

        Toolbar toolbar = getView().findViewById(R.id.toolbarRegister);

//        Setup Toolbar คือการกำหนดให้ Toolbar ทำงาน
        ((MainActivity)getActivity()).setSupportActionBar(toolbar);

//        Setup Title of Toolbar คือการเปลี่ยน Title ของ Toolbar
        ((MainActivity) getActivity())
                .getSupportActionBar()
                .setTitle(getResources().getString(R.string.new_register));

//        Visible Button Back
        ((MainActivity) getActivity()).getSupportActionBar().setHomeButtonEnabled(true);
        ((MainActivity) getActivity()).getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                คือการสลาย Fragment Register และกลับไปที่หน้าที่มา
                getActivity().getSupportFragmentManager().popBackStack();

            }
        });

    }

    //    เมธอค ที่ใช้ในการสร้าง หน้ากาก
//    Create Fragment
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater,
                             @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_register,container,false);

        return view;
    }
}// Main Class
