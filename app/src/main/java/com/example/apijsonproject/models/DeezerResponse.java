package com.example.apijsonproject.models;

import java.io.Serializable;
import java.util.ArrayList;

public class DeezerResponse implements Serializable
{
    public ArrayList<Datum> data;
    public int total;
    public String next;

    public ArrayList<Datum> getData() {
        return data;
    }

    public int getTotal() {
        return total;
    }

    public String getNext() {
        return next;
    }

    public void setData(ArrayList<Datum> data) {
        this.data = data;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public void setNext(String next) {
        this.next = next;
    }

    public DeezerResponse(ArrayList<Datum> data, int total, String next) {
        this.data = data;
        this.total = total;
        this.next = next;
    }
}
