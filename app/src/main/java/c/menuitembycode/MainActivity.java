package c.menuitembycode;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //on create option menu will create menu items

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        //creating menu item programitically

        menu.add(0,0,0,"hithere");
        menu.add(0,1,1,"its");
        menu.add(0,2,2,"abhishek");

        return super.onCreateOptionsMenu(menu);
    }

    //Set what to do on selecting a MenuItem here , eg: make toast, or perform some other action.
//      Here it is used to make different toasts
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId())
        {
            case 0:
                Toast.makeText(this, "hi there",Toast.LENGTH_LONG).show();
                break;
            case 1:
                Toast.makeText(this, "its", Toast.LENGTH_SHORT).show();
                break;
            case 2:
                Toast.makeText(this, "Abhishek", Toast.LENGTH_SHORT).show();
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}
