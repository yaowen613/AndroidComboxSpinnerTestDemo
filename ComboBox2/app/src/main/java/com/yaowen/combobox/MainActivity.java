package com.yaowen.combobox;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;


public class MainActivity extends AppCompatActivity {
    private Spinner spinner;
    private Combbox combbox;
    private TextView personAge ,personPhone,personWorlk,personName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        personName= (TextView) findViewById(R.id.main_personName);
        personAge= (TextView) findViewById(R.id.mian_personAge);
        personPhone= (TextView) findViewById(R.id.main_personPhone);
        personWorlk= (TextView) findViewById(R.id.main_personWorlk);
        spinner = (Spinner) findViewById(R.id.spinner);
        combbox= (Combbox) findViewById(R.id.combo);
        //建立数据源
        final List<Person> persons=new ArrayList<Person>();
        persons.add(new Person("王五", "广州市", "22", "15626222499", "程序员"));
        persons.add(new Person("李四", "北京市", "23", "13724734143", "销售员"));
        persons.add(new Person("李生", "襄阳市", "55", "020-3201546", "董事长"));
        MyAdapter adapter=new MyAdapter(this,persons);
        combbox.setAdapter(adapter);
        spinner.setAdapter(adapter);
        combbox.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String str = parent.getItemAtPosition(position).toString();
                Toast.makeText(MainActivity.this, "你选择的项目是：" + str, Toast.LENGTH_SHORT).show();
                Log.d("TAG", "你选择的项目是：" + str);
                personName.setText(persons.get(position).getPersonName());
                personAge.setText(persons.get(position).getPersonAge());
                personPhone.setText(persons.get(position).getPersonPhone());
                personWorlk.setText(persons.get(position).getPersonWorlk());
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }
        });
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String str = parent.getItemAtPosition(position).toString();
                Toast.makeText(MainActivity.this, "你选择的项目是：" + str, Toast.LENGTH_SHORT).show();
                Log.d("TAG", "你选择的项目是：" + str);
                personName.setText(persons.get(position).getPersonName());
                personAge.setText(persons.get(position).getPersonAge());
                personPhone.setText(persons.get(position).getPersonPhone());
                personWorlk.setText(persons.get(position).getPersonWorlk());
            }
            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }
        });
    }
}
