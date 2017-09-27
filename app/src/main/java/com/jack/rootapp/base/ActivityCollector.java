package com.jack.rootapp.base;




import android.app.Activity;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2017-07-11.
 */

public class ActivityCollector {

    private static List<Activity> activityList=new ArrayList<>();

    public static void addActivity(Activity activity){
      activityList.add(activity);
    }

    public static void removeActivity(Activity activity){
        activityList.remove(activity);
    }

    public static void removeAll(){
        for (Activity activity: activityList) {
            if (!activity.isFinishing()){
                activity.finish();
            }
        }
    }
}
