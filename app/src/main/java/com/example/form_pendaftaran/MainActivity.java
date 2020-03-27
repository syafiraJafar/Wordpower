package com.example.form_pendaftaran;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

import com.basgeekball.awesomevalidation.AwesomeValidation;
import com.basgeekball.awesomevalidation.ValidationStyle;
import com.basgeekball.awesomevalidation.utility.RegexTemplate;
import com.google.android.material.textfield.TextInputLayout;

public class MainActivity extends AppCompatActivity {


    EditText  NamaDepan, NamaBelakang,TempatLahir,TanggalLahir,Alamat,Telepon,Email,Pass,PassLagi;
    RadioButton JKlaki, JKperempuan, Islam, Kristen, Katolik, Hindu, Buddha, Konghucu, AliranKepercayaan;
    Button Kembali, daftar;

    AwesomeValidation awesomeValidation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //setContentView(R.layout.activity_main);

        NamaDepan = findViewById(R.id.et_namadpn);
        NamaBelakang = findViewById(R.id.et_namaBlkng);
        TempatLahir = findViewById(R.id.et_TmpLahir);
        TanggalLahir = findViewById(R.id.et_TglLahir);
        Alamat = findViewById(R.id.et_Almt);
        Telepon = findViewById(R.id.et_Telepon);
        Email = findViewById(R.id.et_Email);
        Pass = findViewById(R.id.et_Password);
        daftar =findViewById(R.id.et_Daftar);

        awesomeValidation = new AwesomeValidation(ValidationStyle.BASIC);

        awesomeValidation.addValidation(this,R.id.et_namadpn,
                RegexTemplate.NOT_EMPTY,R.string.invalid_namaDpn);

        awesomeValidation.addValidation(this,R.id.et_namaBlkng,
                RegexTemplate.NOT_EMPTY,R.string.invalid_namaBlkg);

        awesomeValidation.addValidation(this,R.id.et_TmpLahir,
                RegexTemplate.NOT_EMPTY,R.string.invalid_TmpatLahir);

        awesomeValidation.addValidation(this,R.id.et_TglLahir,
                RegexTemplate.NOT_EMPTY,R.string.invalid_TglLahir);

        awesomeValidation.addValidation(this, R.id.et_Telepon
                ,RegexTemplate.NOT_EMPTY, R.string.invalid_Telepon);

        awesomeValidation.addValidation(this, R.id.et_Email,
                RegexTemplate.NOT_EMPTY, R.string.invalid_email);

        awesomeValidation.addValidation(this, R.id.et_Password,
                RegexTemplate.NOT_EMPTY, R.string.invalid_password);

        Kembali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(awesomeValidation.validate()){
                    Toast.makeText(getApplicationContext()
                    ,"Berhasil Terdaftar....", Toast.LENGTH_LONG).show();
                }else {
                    Toast.makeText(getApplicationContext()
                    ,"Tidak Berhasil Terdaftar",Toast.LENGTH_LONG).show();
                }
            }
        });












    }
}
