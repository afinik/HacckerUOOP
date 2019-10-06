package com.company;

public class Conference {
    public static void main(String[] args) {
        period = 10;
        showPeriod();
        Conference conference = new Conference();
        conference.showTopic("Hello, dear World!!!");

        Conference itConference = new Conference();
    }

    String topic;
    static int period;
    static Conference CONST_CONFERENSE = new Conference();

    //нужно,чтобы была проверка на нулл еще. Если не нулл, то можно создавать new Conference()
    public Conference() {
    }

    public Conference(String topic) {
        this.topic = topic;
    }

    public void showTopic(String topic) {
        this.topic = topic;
        System.out.println(topic);
    }

    static void showPeriod() {
        System.out.println(period);

    }

    static Conference toReturnItConference(Conference itConference) {
        return CONST_CONFERENSE;
    }
}
