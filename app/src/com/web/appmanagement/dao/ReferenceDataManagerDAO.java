/**
 * 
 */
package com.web.appmanagement.dao;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.jdbc.object.StoredProcedure;
import org.springframework.stereotype.Service;

import co.web.appmanagement.dbutility.DBConenction;

import com.web.appmanagement.to.SourceOfIncome;

/**
 * @author Ajoy Sinha
 * 
 */
public class ReferenceDataManagerDAO extends StoredProcedure {

	private String getSourceOfIncomes = "{CALL GETSOURCEOFINCOMS()}";

	public List<SourceOfIncome> getSourceOfIncome() {

		Connection con = DBConenction.getConention();
		String query = getSourceOfIncomes;
		CallableStatement cs = null;
		ResultSet rs = null;
		List<SourceOfIncome> sourceofIncomeList = new ArrayList<SourceOfIncome>();

		try {
			cs = con.prepareCall(query, ResultSet.TYPE_SCROLL_INSENSITIVE,
					ResultSet.CONCUR_READ_ONLY);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		try {
			rs = cs.executeQuery();
			while (rs.next()) {
				SourceOfIncome sourceofIncome = new SourceOfIncome();
				sourceofIncome.setId(rs.getInt("ID_SOURCE_OF_INCOME"));
				sourceofIncome.setDisplayType(rs.getString("TYPE_DISPLAY"));
				sourceofIncome.setShortType(rs.getString("TYPE_SHORT"));
				sourceofIncome.setDescription(rs.getString("DESCRIPTION"));
				sourceofIncome.setUpdateDate(rs.getDate("UPDATEDDATE"));
				sourceofIncomeList.add(sourceofIncome);
			}
			System.out.println(" RESULT SET " + rs);
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return sourceofIncomeList;
	}

}
