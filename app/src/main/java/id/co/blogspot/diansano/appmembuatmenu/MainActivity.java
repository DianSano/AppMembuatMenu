package id.co.blogspot.diansano.appmembuatmenu;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        /*if (item.getItemId() == R.id.item1) {
            Toast.makeText(this, "Ini item 1", Toast.LENGTH_SHORT).show();
            return true;
        } else if (item.getItemId() == R.id.item2) {
            Toast.makeText(this, "Ini item 2", Toast.LENGTH_SHORT).show();
            return true;
        } else if (item.getItemId() == R.id.subitem31) {
            Toast.makeText(this, "Ini sub item 3.1", Toast.LENGTH_SHORT).show();
            return true;
        } else if (item.getItemId() == R.id.subitem32) {
            Toast.makeText(this, "Ini sub item 3.2", Toast.LENGTH_SHORT).show();
            return true;
        } else {
            return super.onOptionsItemSelected(item);
        }*/
        switch (item.getItemId()) {
            case R.id.item1:
                Toast.makeText(this, "Ini item 1", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.item2:
                Toast.makeText(this, "Ini item 2", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.subitem31:
                Toast.makeText(this, "Ini sub item 3.1", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.subitem32:
                Toast.makeText(this, "Ini sub item 3.2", Toast.LENGTH_SHORT).show();
                return true;

            default:
                return super.onOptionsItemSelected(item);
        }
    }

}
