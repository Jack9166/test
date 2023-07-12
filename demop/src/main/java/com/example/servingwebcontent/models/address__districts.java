package com.example.servingwebcontent.models;

public class address__districts {
   private int id;
    private String name;
    public address__districts() {
	}

	public address__districts(int id, String Name) {
		super();
		this.id = id;
		this.name = Name;
	}
    public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

    public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
