package com.jocajica.android.androidchat.addcontact;

/**
 * Created by jcarles on 16/06/2016.
 */
public class AddContactInteractorImpl implements AddContactInteractor {
    AddContactRepository repository;

    public AddContactInteractorImpl() {
        repository = new AddContactRepositoryImpl();
    }

    @Override
    public void execute(String email) {
        repository.addContact(email);
    }
}
