package com.jocajica.android.androidchat.login;

import com.firebase.client.Firebase;
import com.jocajica.android.androidchat.domain.FirebaseHelper;

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

    }

    @Override
    public void signIn(String email, String password) {

    }

    @Override
    public void checkSession() {

    }
}
