package com.bebound.template;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.bebound.template.request.sendtext.RequestSendText;

public class MainActivity extends AppCompatActivity {

    private EditText editText;
    private Button button;

    // It will manage the permission.
    private PermissionsDelegate permissionsDelegate;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText = findViewById(R.id.edit_text);
        button = findViewById(R.id.button);

        permissionsDelegate = new PermissionsDelegate(this);

        button.setOnClickListener(view -> {
            // NOTE: When button is clicked and EditText is not empty, a request is sent.
            if (editText.getText().length() == 0){
                Toast.makeText(this, getString(R.string.toast_et_empty), Toast.LENGTH_LONG).show();
            } else {
                RequestSendText.sendRequest(editText.getText().toString());
            }
        });
    }

    @Override
    protected void onResume() {
        super.onResume();
        if (permissionsDelegate.hasPermissions()) {
            button.setClickable(true);
        } else {
            permissionsDelegate.requestPermissions();
        }

    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        if (permissionsDelegate.resultGranted(requestCode, grantResults)) {
            button.setClickable(true);
        }
    }

}
