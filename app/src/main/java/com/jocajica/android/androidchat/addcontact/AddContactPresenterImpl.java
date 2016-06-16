package com.jocajica.android.androidchat.addcontact;

import com.jocajica.android.androidchat.addcontact.AddContactPresenter;
import com.jocajica.android.androidchat.addcontact.events.AddContactEvent;
import com.jocajica.android.androidchat.addcontact.ui.AddContactView;
import com.jocajica.android.androidchat.lib.EventBus;
import com.jocajica.android.androidchat.lib.GreenRobotEventBus;

import org.greenrobot.eventbus.Subscribe;

/**
 * Created by jcarles on 16/06/2016.
 */
public class AddContactPresenterImpl implements AddContactPresenter {

    private EventBus eventBus;
    private AddContactView view;
    private AddContactInteractor interactor;

    public AddContactPresenterImpl(AddContactView view) {
        this.view = view;
        this.eventBus = GreenRobotEventBus.getInstance();
        this.interactor = new AddContactInteractorImpl();
    }

    @Override
    public void onShow() {
        eventBus.register(this);
    }

    @Override
    public void onDestroy() {
        view = null;
        eventBus.unregister(this);
    }

    @Override
    public void addContact(String email) {
        if (view != null) {
            view.hideInput();
            view.showProgress();
        }

        interactor.execute(email);
    }

    @Override
    @Subscribe
    public void onEventMainThread(AddContactEvent event) {
        if (view != null) {
            view.hideProgress();
            view.showInput();

            if (event.isError()) {
                view.contactNotAdded();
            }
            else {
                view.contactAdded();
            }
        }
    }
}
