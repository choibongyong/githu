package game;

import java.util.ArrayList;

public class Character {

	private String _name;
	private int _level;
	private ArrayList<Skill> _skills;
	private ArrayList<Item> _items;
	private long _guid;

	public Character(String name, long guid) {
		_name = name;
		_level = 1;
		_skills = new ArrayList<Skill>();
		_items = new ArrayList<Item>();
		_guid = guid;
	}

	public boolean removeitem(long guid) {
		return true;
	}
	
}
