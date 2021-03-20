package com.example.perrysfirstapp;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import androidx.appcompat.app.AppCompatActivity;
//
public class MainActivity extends AppCompatActivity {
    public static String textView;
//    public static final String EXTRA_MESSAGE = "com.example.perrysfirstapp.MESSAGE" ;
  //  private static final Object EXTRA_MESSAGE = "com.example.perrysfirstapp.MESSAGE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public class SpinnerActivity extends Activity implements AdapterView.OnItemSelectedListener {

        public void onItemSelected(AdapterView<?> parent, View view,
                                   int pos, long id) {
            // An item was selected. You can retrieve the selected item using
            // parent.getItemAtPosition(pos)
//
//            String operand = (String) parent.getItemAtPosition(pos);
//            switch (operand) {
//                case "-":
//                    System.out.println("Monday");
//                    break;
//                case "/":
//                    System.out.println("Tuesday");
//                    break;
//                case "*":
//                    System.out.println("Wednesday");
//                    break;
//                case "+":
//                    System.out.println("Thursday");
//                    break;
//                default:
//                    break;

            }

        @Override
        public void onNothingSelected(AdapterView<?> adapterView) {

        }
    }




        public void onNothingSelected(AdapterView<?> parent) {
            // Another interface callback
        }
 }



//    public void Calc(View view) {
////        Intent intent = new Intent(this, DisplayMessageActivity.class);
//
////                EditText editText = (EditText) findViewById(R.id.operand1);
////            String m_operand1 = editText.getText().toString();
////        intent.putExtra("i_operand1", m_operand1);
//
////                EditText editText = findViewById(R.id.operand2);
////            String m_operand2 = editText.getText().toString();
////        intent.putExtra("i_operand2", m_operand2);
//
////                EditText editText = (EditText) findViewById(R.id.operator);
////            String m_operator = editText.getText().toString();
////        intent.putExtra("i_operator", m_operator );
//
////        startActivity(intent);
//
////
////        Spinner spinner = (Spinner) findViewById(R.id.spinner);
////// Create an ArrayAdapter using the string array and a default spinner layout
////        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
////                R.array.operator,
////                android.R.layout.simple_spinner_item);
////// Specify the layout to use when the list of choices appears
////        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
////// Apply the adapter to the spinner
////        spinner.setAdapter(adapter);
//
//        Spinner spinner = (Spinner) findViewById(R.id.spinner);
//// Create an ArrayAdapter using the string array and a default spinner layout
//        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
//                R.array.planets_array, android.R.layout.simple_spinner_item);
//// Specify the layout to use when the list of choices appears
//        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
//// Apply the adapter to the spinner
//        spinner.setAdapter(adapter);
//
//
//
//    }
//}



//
//    /** Called when the user taps the Send button */
//    public void sendMessage(View view) {
//        Intent intent = new Intent(this, DisplayMessageActivity.class);
//
//                EditText editText = (EditText) findViewById(R.id.operand1);
//            String m_operand1 = editText.getText().toString();
//        intent.putExtra("i_operand1", m_operand1);
//
////                EditText editText = findViewById(R.id.operand2);
//            String m_operand2 = editText.getText().toString();
//        intent.putExtra("i_operand2", m_operand2);
//
////                EditText editText = (EditText) findViewById(R.id.operator);
//            String m_operator = editText.getText().toString();
//        intent.putExtra("i_operator", m_operator );
//
//        startActivity(intent);
//    }
//
////
// }
//
//
//
