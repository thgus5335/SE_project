package com.example.myapplication;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    RecyclerView rcv;
    LinearLayoutManager llm;
    WrittingAdapter wadapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rcv = (RecyclerView)findViewById(R.id.article_part);
        llm = new LinearLayoutManager(this);//종류는 총 3가지, ListView를 사용하기 위한 사용
        rcv.setHasFixedSize(true);//각 아이템이 보여지는 것을 일정하게
        rcv.setLayoutManager(llm);//앞서 선언한 리싸이클러뷰를 레이아웃메니저에 붙힌다

        ArrayList<ItemFrom> list = new ArrayList<>();

        list.add(new ItemFrom("나영현",R.drawable.jjang1," 나 졸ㄹ려..."));
        list.add(new ItemFrom("유서정",R.drawable.jjang2,"살려줘"));
        list.add(new ItemFrom("강세미",R.drawable.jjang3,"코딩 못해먹겠어"));
        list.add(new ItemFrom("임지민",R.drawable.jjang4,"ㅠㅠㅠㅠㅠ"));
        list.add(new ItemFrom("조예진",R.drawable.jjang1,"다 때려쳐!!!"));
        list.add(new ItemFrom("봄이좋냐",R.drawable.jjang2,"봄이 그렇게도 좋냐 멍청이들아"));
        list.add(new ItemFrom("봄봄봄",R.drawable.jjang3,"봄 봄 봄 봄이 왔네요"));
        list.add(new ItemFrom("벚꽃엔딩",R.drawable.jjang4,"봄바람 휘날리며 흩날리는 벚꽃 잎이"));

        wadapter = new WrittingAdapter(this, list);
        rcv.setAdapter(wadapter);
    }
}
