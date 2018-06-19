package com.example.omistaja.paintingapp;


import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;

import com.google.firebase.database.Exclude;

import java.util.HashMap;
import java.util.Map;

public class Fingerpath {

    public int color;
    public boolean emboss;
    public boolean blur;
    public int strokeWidth;
    public Path path;

    public Fingerpath(){
        this.color = Color.RED;
        this.emboss=false;
        this.blur=false;
        this.strokeWidth= PaintView.BRUSH_SIZE;
        this.path = new Path();
    }

    public Fingerpath(int color, boolean emboss, boolean blur, int strokeWidth, Path path) {
        this.color = color;
        this.emboss = emboss;
        this.blur = blur;
        this.strokeWidth = strokeWidth;
        this.path = path;
    }

    @Exclude
    public Map<String, Object> toMap() {
        HashMap<String, Object> result = new HashMap<>();
        result.put("color", color);
        result.put("emboss", emboss);
        result.put("blur", blur);
        result.put("strokeWidth", strokeWidth);
        result.put("path", path);

        return result;
    }
}
