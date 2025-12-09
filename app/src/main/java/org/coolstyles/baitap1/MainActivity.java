package org.coolstyles.baitap1; // Tên package của bạn, giữ nguyên

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log; // Cần import thư viện Log để sử dụng Log.d

// KHÔNG CẦN các thư viện EdgeToEdge, Insets, ViewCompat, WindowInsetsCompat cho bài tập này.
// Có thể xóa các import đó nếu bạn không dùng chúng trong body code.

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "Lifecycle"; // Dùng tag này để lọc Logcat

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Thay vì dùng EdgeToEdge, chỉ cần gọi setContentView nếu layout của bạn là R.layout.activity_main
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
}