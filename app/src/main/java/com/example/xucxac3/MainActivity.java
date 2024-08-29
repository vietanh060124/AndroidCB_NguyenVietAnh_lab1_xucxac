package com.example.xucxac3;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private ImageView diceImage;
    private Random randomGenerator = new Random();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Liên kết các thành phần giao diện với mã Java
        diceImage = findViewById(R.id.diceImage);
        Button rollButton = findViewById(R.id.rollButton);

        // Xử lý sự kiện khi nhấn nút "Tung Xúc Xắc"
        rollButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                rollDice();
            }
        });
    }

    // Phương thức tung xúc xắc ngẫu nhiên
    private void rollDice() {
        int randomNumber = randomGenerator.nextInt(6) + 1;
        int drawableResource;

        // Lựa chọn hình ảnh tương ứng với số ngẫu nhiên
        switch (randomNumber) {
            case 1:
                drawableResource = R.drawable.xucxac1 ;
                break;
            case 2:
                drawableResource = R.drawable.xucxacmat2 ;
                break;
            case 3:
                drawableResource = R.drawable.xucxacmat3 ;
                break;
            case 4:
                drawableResource = R.drawable.pngegg ;
                break;
            case 5:
                drawableResource = R.drawable.xucxacmat5 ;
                break;
            default:
                drawableResource = R.drawable.xucxacmat6 ;
                break;
        }

        // Cập nhật hình ảnh xúc xắc
        diceImage.setImageResource(drawableResource);
    }
}