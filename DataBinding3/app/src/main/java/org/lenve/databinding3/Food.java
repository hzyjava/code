package org.lenve.databinding3;

import android.databinding.BaseObservable;
import android.databinding.Bindable;
import android.databinding.BindingAdapter;
import android.databinding.ObservableField;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import com.squareup.picasso.Picasso;

/**
 * Created by 王松 on 2016/7/31.
 */
public class Food extends BaseObservable {
    private final ObservableField<String> description = new ObservableField<>();
    private final ObservableField<String> img = new ObservableField<>();
    private final ObservableField<String> keywords = new ObservableField<>();
    private final ObservableField<String> summary = new ObservableField<>();
    public Food() {
    }

    public Food(String description, String img, String keywords, String summary) {
        this.description.set(description);
        this.keywords.set(keywords);
        this.img.set(img);
        this.summary.set(summary);
    }

    @BindingAdapter("bind:img")
    public static void loadInternetImage(ImageView iv, String img) {
        Picasso.with(iv.getContext()).load(img).into(iv);
    }

    public void onItemClick(View view) {
//        Toast.makeText(view.getContext(), getDescription(), Toast.LENGTH_SHORT).show();
        setDescription("111");
    }

    public void clickKeywords(View view) {
        Toast.makeText(view.getContext(), getKeywords(), Toast.LENGTH_SHORT).show();
    }


    @Bindable
    public String getDescription() {
        return description.get();
    }

    public void setDescription(String description) {
        this.description.set(description);
        notifyPropertyChanged(org.lenve.databinding3.BR.description);
    }

    public String getImg() {
        return img.get();
    }

    public void setImg(String img) {
        this.img.set(img);
    }

    public String getKeywords() {
        return keywords.get();
    }

    public void setKeywords(String keywords) {
        this.keywords.set(keywords);
    }

    public String getSummary() {
        return summary.get();
    }

    public void setSummary(String summary) {
        this.summary.set(summary);
    }
}
