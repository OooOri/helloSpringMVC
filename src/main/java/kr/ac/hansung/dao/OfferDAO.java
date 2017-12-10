package kr.ac.hansung.dao;


import org.springframework.stereotype.Repository;

import kr.ac.hansung.model.Offer;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

@Repository
public class OfferDAO {
	private JdbcTemplate jdbcTemplate;

	@Autowired
	public void setDataSource(DataSource dataSource) {
		jdbcTemplate = new JdbcTemplate(dataSource);
	}

	/*public int getRowCount() {
		String sqlStatement = "select count(*) from course";
		return jdbcTemplate.queryForObject(sqlStatement, Integer.class);

	}

	public Offer getOffer(String name) {
		String sqlStatement = "select * from course where name=?";

		return jdbcTemplate.queryForObject(sqlStatement, new Object[] { name }, new RowMapper<Offer>() {

			@Override
			public Offer mapRow(ResultSet rs, int rowNum) throws SQLException {

				Offer offer = new Offer();

				offer.setId(rs.getInt("id"));
				offer.setName(rs.getString("name"));
				offer.setEmail(rs.getString("email"));
				offer.setText(rs.getString("text"));

				return offer;

			}

		});
	}*/

	public List<Offer> getOffers(int year, int semester) {
		String sqlStatement = "select * from course where year="+year+" and semester="+semester+"";
		
		return jdbcTemplate.query(sqlStatement, new RowMapper<Offer>() {

			
			public Offer mapRow(ResultSet rs, int rowNum) throws SQLException {

				Offer offer = new Offer();
				
				
				offer.setGrade(rs.getInt("grade"));
				offer.setYear(rs.getInt("year"));
				offer.setSemester(rs.getInt("semester"));
				
				return offer;
			}

		});
	}
	
	public List<Offer> getOffers2(String division) {
		String sqlStatement = "select * from course where division=?";
		
		return jdbcTemplate.query(sqlStatement, new Object[] { division }, new RowMapper<Offer>() {

			
			public Offer mapRow(ResultSet rs, int rowNum) throws SQLException {

				Offer offer = new Offer();
				
				
				offer.setGrade(rs.getInt("grade"));
						
				return offer;
			}

		});
	}
	
	
	public boolean insert(Offer offer) {
		int year = offer.getYear();
		int semester = offer.getSemester();
		int grade = offer.getGrade();
		String course_code = offer.getCourse_code();
		String course_name = offer.getCourse_name();
		String division = offer.getDivision();
		
		String sqlStatement = "insert into course (year, semester, course_code, course_name, division, grade) values (?,?,?,?,?,?)";
		
		return (jdbcTemplate.update(sqlStatement, new Object[] {year, semester, course_code, course_name, division, grade}) ==1);
	}
	
	public boolean update(Offer offer) {
		
		int year = offer.getYear();
		int semester = offer.getSemester();
		int grade = offer.getGrade();
		String course_code = offer.getCourse_code();
		String course_name = offer.getCourse_name();
		String division = offer.getDivision();
		
		String sqlStatement = "update course set year=?, semester=?, course_code=?, course_name=?, division=?, grade=?";
		
		return (jdbcTemplate.update(sqlStatement, new Object[] {year, semester, course_code, course_name, division, grade}) == 1);
	}

}
