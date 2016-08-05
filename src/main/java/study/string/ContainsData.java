package study.string;

/**
 * Created by sould on 2016-07-18.
 */
public class ContainsData {

    private String [] data = null;
    private String dataStr = null;

    public static void main(String[] args) {
        ContainsData containsData = new ContainsData();
        containsData.init();
        containsData.startThread();
    }

    private void init(){
        data = new String[2];
        data[0] = "hello";
        data[1] = "bye";
    }

    private void startThread(){

        new Thread(new Runnable() {
            @Override
            public void run() {
                try{
                    while(true){
                        int random = (int)(Math.random()*2);
                        if(dataStr == null){
                            dataStr = data[random];
                            System.out.println("최초");
                        }else{
                            if(dataStr.equals(data[random])){
//                                System.out.println("같다");
                            }else{
//                                System.out.print("다르다 : ");
                                dataStr = data[random];
                                System.out.println(data[random]);
                            }
                        }

                        Thread.sleep(1000);
                    }
                }catch (InterruptedException ie){
                    ie.printStackTrace();
                }
            }
        }).start();
    }

}
