package cavalett.taylor.Search_App;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_main);


        //Add objects from XML Layout
        final Button searchButton = (Button) findViewById(R.id.searchButton);
        final Button enterButton = (Button) findViewById(R.id.enterButton);
        final Button exitButton = (Button) findViewById(R.id.exitButton);
        final EditText textField = (EditText) findViewById(R.id.text_box);
        final TextView resultField = (TextView) findViewById(R.id.resultBox);
        final Database_Functions theDatabase= new Database_Functions();


        //Button Methods
        searchButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                resultField.setText(theDatabase.search(textField.getText().toString()));
                textField.setText("");
            }
        });

        enterButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                resultField.setText(theDatabase.enter(textField.getText().toString()));
                textField.setText("");
            }
        });

        exitButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                System.exit(0);
            }
        });

    }

}
