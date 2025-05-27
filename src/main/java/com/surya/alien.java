package com.surya;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
@Entity
public class alien {
    @Id
    private int id;
    private String name;
    private String color;
    public void setId (int id)
    {
        this.id= id;
        System.out.println(id +"Id is set");
    }
    public int getId(){ return id ;}
    public void setName(String name)
    {
        this.name = name;
        System.out.println(name +"Name is set");
    }
    public String getName(){ return name ;}
    public void setColor (String color)
    {
        this.color= color;
        System.out.println(id +"Id is set");
    }
    public String getColor(){ return color ;}

    public String toString ()
    {
        return ("Name is "+name + "\nID is "+id+" \nColor is "+color);
    }



}
