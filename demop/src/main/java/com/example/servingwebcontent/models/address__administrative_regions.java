package com.example.servingwebcontent.models;

public class address__administrative_regions {
  private int id;
    private String name;
    public address__administrative_regions() {
	}

	public address__administrative_regions(int id, String Name) {
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
