package com.company;

public class News {
    private int ID;
    private String Title;
    private String PublishDdate;
    private String Author;
    private String Content;
    private float AverageRate;

    void setter(int ID, String Title, String PublishDdate, String Author, String Content) {
        this.ID = ID;
        this.Title = Title;
        this.PublishDdate = PublishDdate;
        this.Author = Author;
        this.Content = Content;
    }


}
