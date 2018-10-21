/**
 * @author Virtusa
 */
package org.bian.service;

import java.util.List;

import org.bian.dto.*;

public interface CreditManagementApiService {

	CreditManagementRecordResponse record(String crReferenceId, CreditManagementRecordRequest request);
	
	Evaluation requestPost(EvaluationNoId request);
	
	Evaluation requestPut(String crReferenceId, EvaluationNoId request);
	
	CreditPosition retrieve(String crReferenceId);
	
	List<String> retrieveRefIds();
	
}
