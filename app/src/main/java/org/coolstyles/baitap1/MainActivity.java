package org.coolstyles.baitap1;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.content.Intent;
import android.net.Uri;
import android.view.View;


public class MainActivity extends AppCompatActivity {

    private static final String TAG = "Lifecycle";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG, "Hàm onCreate được gọi");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "Hàm onStart được gọi");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "Hàm onResume được gọi");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "Hàm onPause được gọi");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "Hàm onStop được gọi");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "Hàm onDestroy được gọi");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(TAG, "Hàm onRestart được gọi");
    }

    // -----------------------------------------------------------------
    // Ví dụ 1: Explicit Intent (Chuyển sang SecondActivity)
    public void startSecondActivity(View view) {
        Intent explicitIntent = new Intent(this, SecondActivity.class);
        startActivity(explicitIntent);
    }

    // Ví dụ 2: Implicit Intent (Mở trình duyệt web)
    public void openWebPage(View view) {
        String url = "https://github.com/thanhtung06112004/bai2-mobile";
        Intent implicitIntent = new Intent(Intent.ACTION_VIEW);
        implicitIntent.setData(Uri.parse(url));

        // Kiểm tra xem có ứng dụng nào xử lý được Intent này không
        // Nếu đã thêm <queries> vào Manifest thì hàm này sẽ hoạt động tốt
        if (implicitIntent.resolveActivity(getPackageManager()) != null) {
            startActivity(implicitIntent);
        }
    }
}