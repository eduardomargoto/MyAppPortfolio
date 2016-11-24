package br.com.etm.myappportfolio;

import android.support.annotation.StringRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void openMyApp(View view){
        String app_name = "";
        switch (view.getId()){
            case R.id.bt_popular_movies:
                app_name = getStringResource(R.string.popular_movies);
                break;
            case R.id.bt_stock_hawk:
                app_name = getStringResource(R.string.stock_hawk);
                break;
            case R.id.bt_app_material:
                app_name = getStringResource(R.string.make_your_app_material);
                break;
            case R.id.bt_buid_it:
                app_name = getStringResource(R.string.build_it_bigger);
                break;
            case R.id.bt_go_ubiquitous:
                app_name = getStringResource(R.string.go_ubiquitous);
                break;
            case R.id.bt_my_own_app:
                app_name = getStringResource(R.string.capstone_my_own_app);
                break;
        }
        String message = getStringResource(R.string.message_toask_click_open_app).replace("/project_name", app_name);
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }



    private String getStringResource(@StringRes int string_id){
        return getResources().getString(string_id);
    }

}
