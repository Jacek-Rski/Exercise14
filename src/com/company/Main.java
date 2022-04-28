package com.company;

import com.google.gson.Gson;


public class Main {

    public static void main(String[] args) {
        deserializetodo();

    }
    static void deserializetodo(){
        String todo2json = "{\"body\": \"Walk the dog\", \"done\": false, \"id\": 0, \"priority\": 3, \"title\": \"dog\"}";
        Gson gson = new Gson();
        todo todo2 = gson.fromJson(todo2json, todo.class);
        System.out.println(todo2.getClass().getSimpleName());

    }

}
class todo{
    private String body;
    private boolean done;
    private int id;
    private int priority;
    private String title;

    public todo(String body, boolean done, int id, int priority, String title) {
        this.body = body;
        this.done = done;
        this.id = id;
        this.priority = priority;
        this.title = title;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public boolean isDone() {
        return done;
    }

    public void setDone(boolean done) {
        this.done = done;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "todo{" +
                "body='" + body + '\'' +
                ", done=" + done +
                ", id=" + id +
                ", priority=" + priority +
                ", title='" + title + '\'' +
                '}';
    }
}