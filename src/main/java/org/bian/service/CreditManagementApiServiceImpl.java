/**
 * @author Virtusa
 */
package org.bian.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.bian.dto.*;
import org.bian.util.JsonReader;
import com.fasterxml.jackson.core.type.TypeReference;

@Service
public class CreditManagementApiServiceImpl implements CreditManagementApiService {

	public CreditManagementRecordResponse record(String crReferenceId, CreditManagementRecordRequest request){
		return JsonReader.read("record-CreditManagementRecordResponse.json",new TypeReference<CreditManagementRecordResponse>(){});
	}
	
	public Evaluation requestPost(EvaluationNoId request){
		return JsonReader.read("requestPost-Evaluation.json",new TypeReference<Evaluation>(){});
	}
	
	public Evaluation requestPut(String crReferenceId, EvaluationNoId request){
		return JsonReader.read("requestPut-Evaluation.json",new TypeReference<Evaluation>(){});
	}
	
	public CreditPosition retrieve(String crReferenceId){
		return JsonReader.read("retrieve-CreditPosition.json",new TypeReference<CreditPosition>(){});
	}
	
	public List<String> retrieveRefIds(){
		return JsonReader.read("retrieveRefIds-String.json",new TypeReference<List<String>>(){});
	}
	
}
