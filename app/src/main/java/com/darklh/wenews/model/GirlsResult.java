package com.darklh.wenews.model;

import java.io.Serializable;
import java.util.List;

/**
 * Created by darklh on 2016/11/23.
 */

public class GirlsResult implements Serializable {


    public boolean status;
    public List<Girl> tngou;

    public static class Girl {

        public String img;
    }
}
