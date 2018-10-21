package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * Evaluation
 */
public class Evaluation   {
  private String managedPositionReference = null;

  private String managedPositionImpactAssessmentReference = null;

  private String proposedTransactionReference = null;

  private Object proposedTransactionRecord = null;

  private String proposedPositionImpactAssessment = null;


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier 
   * @return managedPositionReference
  **/

  public String getManagedPositionReference() {
    return managedPositionReference;
  }

  public void setManagedPositionReference(String managedPositionReference) {
    this.managedPositionReference = managedPositionReference;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier 
   * @return managedPositionImpactAssessmentReference
  **/

  public String getManagedPositionImpactAssessmentReference() {
    return managedPositionImpactAssessmentReference;
  }

  public void setManagedPositionImpactAssessmentReference(String managedPositionImpactAssessmentReference) {
    this.managedPositionImpactAssessmentReference = managedPositionImpactAssessmentReference;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier 
   * @return proposedTransactionReference
  **/

  public String getProposedTransactionReference() {
    return proposedTransactionReference;
  }

  public void setProposedTransactionReference(String proposedTransactionReference) {
    this.proposedTransactionReference = proposedTransactionReference;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary 
   * @return proposedTransactionRecord
  **/

  public Object getProposedTransactionRecord() {
    return proposedTransactionRecord;
  }

  public void setProposedTransactionRecord(Object proposedTransactionRecord) {
    this.proposedTransactionRecord = proposedTransactionRecord;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text 
   * @return proposedPositionImpactAssessment
  **/

  public String getProposedPositionImpactAssessment() {
    return proposedPositionImpactAssessment;
  }

  public void setProposedPositionImpactAssessment(String proposedPositionImpactAssessment) {
    this.proposedPositionImpactAssessment = proposedPositionImpactAssessment;
  }


}

