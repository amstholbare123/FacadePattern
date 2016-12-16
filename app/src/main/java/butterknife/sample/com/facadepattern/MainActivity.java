package butterknife.sample.com.facadepattern;

import android.os.SystemClock;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private String mTitle;
    private TextView tvTitle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvTitle=(TextView)findViewById(R.id.tvTitle);
        OrderFacade orderFacade = new OrderFacade();
        mTitle=orderFacade.placeOrder("OR123456");
        tvTitle.setText(mTitle);
        Toast.makeText(MainActivity.this, "Order processing completed", Toast.LENGTH_SHORT).show();

    }
}
