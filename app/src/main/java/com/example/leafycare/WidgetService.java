package com.example.leafycare;

import android.content.Intent;
import android.widget.RemoteViewsService;

public class WidgetService extends RemoteViewsService {
    @Override
    public RemoteViewsFactory onGetViewFactory(Intent intent) {
        return new PlantListRemoteViewsFactory(this.getApplicationContext());
    }
}
