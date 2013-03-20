/**
 * 
 */
package com.web.appmanagement.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;
import com.web.appmanagement.to.SourceOfIncome;

/**
 * @author 229338
 *
 */
public class SourceOfIncomeRowMapper implements RowMapper<SourceOfIncome> {

	/**
     * Maps the result set rows to a SourceOfIncome object
     */
	@Override
	public SourceOfIncome mapRow(ResultSet rs, int index) throws SQLException {

		SourceOfIncome soi = new SourceOfIncome();
		soi.setId(rs.getInt(0));
		soi.setDisplayType(rs.getString(1));
		soi.setShortType(rs.getString(2));
		soi.setDescription(rs.getString(3));
		soi.setUpdateDate(rs.getDate(4));
		return soi;
	}

}
