package my.edu.tarc.lab2intent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    public static final String TAG_MESSAGE = "my.edu.tarc.lab2intent.MESSAGE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /*
    public void sendMessage(View view)
    {
        EditText editTextMessage;
        editTextMessage = findViewById(R.id.editTextMessage);
        if(TextUtils.isEmpty(editTextMessage.getText()))
        {
            editTextMessage.setError(getString(R.string.error_message));
            return;
        }

        String stringMsg;
        stringMsg = editTextMessage.getText().toString();

        Intent intent = new Intent(this, SecondActivity.class);
        intent.putExtra(TAG_MESSAGE, stringMsg);
        startActivity(intent);
    }
    */
    public void calculateBMI(View view)
    {
        EditText editTextMessage, editTextMessage2;
        editTextMessage = findViewById(R.id.editWeightMsg);
        editTextMessage2 = findViewById(R.id.editHeightMsg);

        if(TextUtils.isEmpty(editTextMessage.getText()))
        {
            editTextMessage.setError(getString(R.string.error_message));
            return;
        }

        if(TextUtils.isEmpty(editTextMessage2.getText()))
        {
            editTextMessage2.setError(getString(R.string.error_message));
            return;
        }

        double height = Double.parseDouble(editTextMessage.getText().toString());
        double weight = Double.parseDouble(editTextMessage2.getText().toString());
        double bmiValue = weight/(height * height);

        String stringMsg;
        stringMsg = Double.toString(bmiValue);

        Intent intent = new Intent(this, SecondActivity.class);
        intent.putExtra(TAG_MESSAGE, stringMsg);
        startActivity(intent);
    }



}
