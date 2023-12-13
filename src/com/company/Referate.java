package com.company;

public class Referate extends Document implements Cloneable {
    String theme;
    int num_pages;
    Author author;
    public Referate() {
        this.theme = "";
        this.num_pages = 0;
        this.author =  new Author();
    }
    public Referate(String theme, int num_pages, Author author) {
        this.theme = theme;
        this.num_pages = num_pages;
        this.author = author;
    }



    public String getTheme() {
        return theme;
    }

    public void setTheme(String theme) {
        this.theme = theme;
    }

    public int getNum_pages() {
        return num_pages;
    }

    public void setNum_pages(int num_pages) {
        this.num_pages = num_pages;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "Referate{" +
                "theme='" + theme + '\'' +
                ", num_pages=" + num_pages +
                ", author=" + author +
                '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Referate referateclone=(Referate) super.clone();
        referateclone.setAuthor((Author) author.clone());
    return referateclone;
    }

    @Override
    public void submit() {
        System.out.println("Referate is submitted");
    }
}
