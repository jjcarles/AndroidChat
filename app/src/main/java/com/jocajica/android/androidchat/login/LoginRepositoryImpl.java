package com.jocajica.android.androidchat.login;

import com.firebase.client.Firebase;
import com.jocajica.android.androidchat.domain.FirebaseHelper;
import com.jocajica.android.androidchat.lib.EventBus;
import com.jocajica.android.androidchat.lib.GreenRobotEventBus;
import com.jocajica.android.androidchat.login.events.LoginEvent;

/**
 * Created by Joan Carles Jiménez on 09/06/2016.
 */
public class LoginRepositoryImpl implements LoginRepository {
    private FirebaseHelper helper;

    public LoginRepositoryImpl() {
        this.helper = FirebaseHelper.getInstance();
    }

    @Override
    public void signUp(String email, String password) {
        postEvent(LoginEvent.onSignUpSuccess);
    }

    @Override
    public void signIn(String email, String password) {
        postEvent(LoginEvent.onSignInSuccess);
    }

    @Override
    public void checkSession() {
        postEvent(LoginEvent.onFailedToRecoverSession);
    }

    private void postEvent(int type, String errorMessage) {
        LoginEvent loginEvent = new LoginEvent();
        loginEvent.setEventType(type);
        if (errorMessage != null) {
            loginEvent.setErrorMessage(errorMessage);
        }

        EventBus eventBus = GreenRobotEventBus.getInstance();
        eventBus.post(loginEvent);
    }

    private void postEvent(int type) {
        postEvent(type, null);
    }
}
