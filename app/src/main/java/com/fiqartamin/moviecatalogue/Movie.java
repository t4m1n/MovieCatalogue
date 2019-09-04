package com.fiqartamin.moviecatalogue;

import android.os.Parcel;
import android.os.Parcelable;

public class Movie implements Parcelable {

    private String title, desc, release;
    private int photo;

    public Movie() {
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getRelease() {
        return release;
    }

    public void setRelease(String release) {
        this.release = release;
    }

    public int getPhoto() {
        return photo;
    }

    public void setPhoto(int photo) {
        this.photo = photo;
    }


    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.title);
        dest.writeString(this.desc);
        dest.writeString(this.release);
        dest.writeInt(this.photo);
    }

    protected Movie(Parcel in) {
        this.title = in.readString();
        this.desc = in.readString();
        this.release = in.readString();
        this.photo = in.readInt();
    }

    public static final Parcelable.Creator<Movie> CREATOR = new Parcelable.Creator<Movie>() {
        @Override
        public Movie createFromParcel(Parcel source) {
            return new Movie(source);
        }

        @Override
        public Movie[] newArray(int size) {
            return new Movie[size];
        }
    };
}
