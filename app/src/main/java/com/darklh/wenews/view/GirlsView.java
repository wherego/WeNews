package com.darklh.wenews.view;

import com.darklh.wenews.model.GirlsResult;

import java.util.List;

/**
 * Created by darklh on 2016/11/23.
 */

public interface GirlsView extends BaseView {

    void setData(List<GirlsResult.Girl> girls);
}
