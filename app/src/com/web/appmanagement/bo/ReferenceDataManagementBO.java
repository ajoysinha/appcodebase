/**
 * 
 */
package com.web.appmanagement.bo;

import java.util.List;

import javax.annotation.Resource;

import com.web.appmanagement.dao.ReferenceDataManagerDAO;
import com.web.appmanagement.to.SourceOfIncome;

/**
 * @author 229338
 *
 */


public class ReferenceDataManagementBO {

	@Resource
	private ReferenceDataManagerDAO referenceDataManagerDAO;
	
	public List<SourceOfIncome> getSourceOfIncome(){		
		return referenceDataManagerDAO.getSourceOfIncome();
	}
}
