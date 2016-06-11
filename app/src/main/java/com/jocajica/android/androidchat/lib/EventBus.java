package com.jocajica.android.androidchat.lib;

/**
 * Created by Joan Carles Jiménez on 11/06/2016.
 */
public interface EventBus {
    void register(Object subscriber);
    void unregister(Object subscriber);
    void post(Object event);
}
