package hellojenkins.bean;

import java.io.Serializable;

public class Task implements Serializable {
    private int t_id;
    private String t_user;  //task发起人
    private String t_content;   //task内容
    private int t_state;        //task状态
    private String t_ruser;     //task承接人

    public Task(){ this.t_state = 0;}

    public Task(String t_user, String t_content) {
        this.t_user = t_user;
        this.t_content = t_content;
        this.t_state = 0;
    }

    public int getT_id() {
        return t_id;
    }

    public void setT_id(int t_id) {
        this.t_id = t_id;
    }

    public String getT_user() {
        return t_user;
    }

    public void setT_user(String t_user) {
        this.t_user = t_user;
    }

    public String getT_content() {
        return t_content;
    }

    public void setT_content(String t_content) {
        this.t_content = t_content;
    }

    public int getT_state() {
        return t_state;
    }

    public void setT_state(int t_state) {
        this.t_state = t_state;
    }

    public String getT_ruser() {
        return t_ruser;
    }

    public void setT_ruser(String t_ruser) {
        this.t_ruser = t_ruser;
    }

    @Override
    public String toString() {
        return "Task{" +
                "t_id='" + t_id + '\'' +
                ", t_user='" + t_user + '\'' +
                ", t_content='" + t_content + '\'' +
                ", t_state=" + t_state +
                ", t_ruser='" + t_ruser + '\'' +
                '}';
    }
}
