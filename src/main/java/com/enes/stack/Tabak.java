package com.enes.stack;

import java.util.Stack;

public class Tabak {
    private int id;
   private boolean temizMi;

    public Tabak(int id, boolean temizMi) {
        this.id = id;
        this.temizMi = temizMi;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isTemizMi() {
        return temizMi;
    }

    public void setTemizMi(boolean temizMi) {
        this.temizMi = temizMi;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Tabak{");
        sb.append("id=").append(id);
        sb.append(", temizMi=").append(temizMi);
        sb.append('}');
        return sb.toString();
    }
}
