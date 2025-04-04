package com.leeyb98.spring02;

// 제네릭릭
public class Storage<P> {
    private P item;  
    
    public P getItem() {
        return item;
    }

    public void setItem(P item) {
        this.item = item;
    }
}
