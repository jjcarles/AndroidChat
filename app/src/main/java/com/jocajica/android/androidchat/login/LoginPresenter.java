package com.jocajica.android.androidchat.login;

import com.jocajica.android.androidchat.login.events.LoginEvent;

/**
 * Created by jcarles on 09/06/2016.
 */
public interface LoginPresenter {
    void onCreate();
    void onDestroy();
    void checkForAuthenticatedUser();
    void validateLogin(String email, String password);
    void registerNewUser(String email, String password);
    void onEventMainThread(LoginEvent event);
}
