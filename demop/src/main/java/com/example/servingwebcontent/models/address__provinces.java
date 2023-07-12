package com.example.servingwebcontent.models;

public class address__provinces {
    private int id;
    private String name;
    public address__provinces() {
	}

	public address__provinces(int id, String Name) {
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
