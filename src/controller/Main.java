package controller;

import java.sql.SQLException;
import java.util.Iterator;
import java.util.TreeMap;

import dao.SkillDAO;
import model.Skill;

class Main{
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		SkillDAO skilldaoobj=new SkillDAO();
		TreeMap<Skill,Integer> skilltree=new TreeMap<>();
		skilltree=skilldaoobj.skillCount();
		Iterator<Skill> iterator=skilltree.keySet().iterator();
		while(iterator.hasNext()) {
			Skill skillobj=iterator.next();
			String name=skillobj.getSkillName();
			System.out.println(skillobj.getSkillName()+"\t\t"+skilltree.get(name));
		}
		
	}
}

