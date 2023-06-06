package sg.edu.rp.c346.id22015529.demospinnertest;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Spinner spnYesNo ;
    TextView tvSelected ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spnYesNo = findViewById(R.id.spinner) ;
        tvSelected = findViewById(R.id.textViewSelected) ;

        spnYesNo.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                int pos = spnYesNo.getSelectedItemPosition() ;
                if (pos == 0) {
                    tvSelected.setText("Spinner Item, Yes Selected") ;
                }
                else if (pos == 1) {
                    tvSelected.setText("Spinner Item, No Selected") ;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

    }
}