package com.example.fusekunakorn.pattledesignmvp.presenter;


import com.example.fusekunakorn.pattledesignmvp.view.ViewInterface;

//TODO This class is a Presenter
public class MainActivityPresenter implements PresenterInterface {
    //link view
    private ViewInterface viewInterface;

    public MainActivityPresenter (PresenterInterface presenterInterface){
        this.viewInterface = viewInterface;
    }

    @Override
    public void TestpresenterMethod() {

    }
}
