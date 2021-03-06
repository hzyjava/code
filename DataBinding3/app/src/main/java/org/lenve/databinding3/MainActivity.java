package org.lenve.databinding3;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class MainActivity extends AppCompatActivity {

    private Handler mHandler = new Handler(){
        @Override
        public void handleMessage(Message msg) {
            adapter.notifyDataSetChanged();
        }
    };
    private List<Food> foods;
    private ListView lv;
    private MyBaseAdapter<Food> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        foods = new ArrayList<>();
        lv = ((ListView) findViewById(R.id.lv));
        adapter = new MyBaseAdapter<>(MainActivity.this, R.layout.listview_item, foods, org.lenve.databinding3.BR.food);
        lv.setAdapter(adapter);
        initData();
    }

    private void initData() {
        OkHttpClient client = new OkHttpClient.Builder().build();
        Request request = new Request.Builder().url("http://www.tngou.net/api/food/list?id=1").build();
        client.newCall(request).enqueue(new Callback() {
            @Override
            public void onFailure(Call call, IOException e) {

            }

            @Override
            public void onResponse(Call call, Response response) throws IOException {
                if (response.isSuccessful()) {
                    parseJson(response.body().string());
                }
            }
        });
    }

    private void parseJson(String jsonStr) {
        try {
            JSONObject jo = new JSONObject(jsonStr);
            JSONArray tngou = jo.getJSONArray("tngou");
            for (int i = 0; i < tngou.length(); i++) {
                JSONObject item = tngou.getJSONObject(i);
                String description = item.getString("description");
                String img = "http://tnfs.tngou.net/image"+item.getString("img");
                String keywords = "【关键词】 "+item.getString("keywords");
                String summary = item.getString("summary");
                foods.add(new Food(description, img, keywords, summary));
            }
            mHandler.sendEmptyMessage(0);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }
}
