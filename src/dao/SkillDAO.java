package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.TreeMap;

import model.Skill;
import utility.ConnectionManager;

public class SkillDAO{
	public TreeMap<Skill,Integer> skillCount() throws ClassNotFoundException, SQLException{
		
		//Method used to retrieve number of players having particular skill.
		ConnectionManager con =new ConnectionManager();
		Connection conn = con.getConnection();
		
		String sql="select skill.id,skill.name,count(player.skill_id) as skill_count from player,skill where player.skill_id=skill.id group by skill.id,player.skill_id,skill.name";
		
		PreparedStatement stmt=conn.prepareStatement(sql);
		
		ResultSet rs=stmt.executeQuery();
		TreeMap<Skill,Integer> skillMap=new TreeMap<Skill,Integer>();
		while(rs.next()) {
			Skill skillobj=new Skill(null, null);
			//skillobj.setSkillld(rs.getLong(1));
			//System.out.println(skillobj.getSkillld());
			//skillobj.setSkillName(rs.getString(2));
			//System.out.println(skillobj.getSkillName());
			skillMap.put(new Skill(rs.getLong(1), rs.getString(2)),rs.getInt(3));
		}
		return skillMap;
		
		
	}
}
