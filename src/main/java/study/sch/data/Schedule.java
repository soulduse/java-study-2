package study.sch.data;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by sould on 2016-07-01.
 */
public class Schedule {
    private int order;
    private int time;
    private String schName;
    private List<Template> templateList;

    public Schedule(){
        templateList = new ArrayList<Template>();
    }

    public int getOrder() {
        return order;
    }

    public void setOrder(int order) {
        this.order = order;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public String getSchName() {
        return schName;
    }

    public void setSchName(String schName) {
        this.schName = schName;
    }

    public List<Template> getTemplateList() {
        return templateList;
    }

    public void setTemplateList(List<Template> templateList) {
        this.templateList = templateList;
    }
}
