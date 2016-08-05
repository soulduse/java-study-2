package study.loop;

/**
 * Created by sould on 2016-04-25.
 */
public class WhileTest {
    public static void main(String[] args) {
        int cnt = 0;
        while(true){
            try{
                System.out.println(1111);
                return;
            }catch (Exception e){
                e.printStackTrace();
            }
        }


    }
}


/*

 android.view.ViewRootImpl$CalledFromWrongThreadException: Only the original study.thread that created a view hierarchy can touch its views.
04-25 14:38:49.808 17532-18319/cloud.koolsign.ksclient W/System.err:     at android.view.ViewRootImpl.checkThread(ViewRootImpl.java:6174)
04-25 14:38:49.808 17532-18319/cloud.koolsign.ksclient W/System.err:     at android.view.ViewRootImpl.invalidateChildInParent(ViewRootImpl.java:862)
04-25 14:38:49.808 17532-18319/cloud.koolsign.ksclient W/System.err:     at android.view.ViewGroup.invalidateChild(ViewGroup.java:4320)
04-25 14:38:49.808 17532-18319/cloud.koolsign.ksclient W/System.err:     at android.view.View.invalidate(View.java:10940)
04-25 14:38:49.808 17532-18319/cloud.koolsign.ksclient W/System.err:     at android.view.View.setEnabled(View.java:6076)
04-25 14:38:49.808 17532-18319/cloud.koolsign.ksclient W/System.err:     at cloud.koolsign.setting.KSSTBSetting$SchIdCheck.run(KSSTBSetting.java:245)
04-25 14:38:49.808 17532-18319/cloud.koolsign.ksclient W/System.err:     at java.lang.Thread.run(Thread.java:841)


 */