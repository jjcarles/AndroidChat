package com.jocajica.android.androidchat.contactlist.ui.adapter;

import com.jocajica.android.androidchat.entities.User;

/**
 * Created by Joan Carles Jiménez on 14/06/2016.
 */
public interface OnItemClickListener {
    void onItemClick(User user);
    void onItemLongClick(User user);
}
